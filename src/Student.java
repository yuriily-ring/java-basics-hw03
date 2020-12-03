import java.util.ArrayList;
import java.util.List;

public class Student {
  private static List<Student> studentList = new ArrayList<>();
  private int rating;
  private String name;

  public static void main (String[] args) {
    Student student1 = new Student();
    student1.setName("John Doe");
    student1.setRating(2);
    Student student2 = new Student("Jane Roe");
    student2.setRating(3);
    Student student3 = new Student("Something Else", 4);
    System.out.println(studentList.size());
    System.out.println(Student.getAvgRating());
    student2.setRating(5);
    System.out.println(Student.getAvgRating());
  }

  public Student () {
    studentList.add(this);
  }

  public Student(String name) {
    this();
    this.name = name;
  }

  public Student(String name, int rating) {
    this();
    this.name = name;
    this.rating = rating;
  }

  public static double getAvgRating() {
    if (studentList.isEmpty())
      return 0;

    double sumRating = 0;
    for(Student student : studentList)
      sumRating += student.getRating();

    return sumRating / (double)studentList.size();
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getRating() {
    return this.rating;
  }

  public void setRating(int rating) {
    this.rating = rating;
  }

  public boolean betterStudent(Student student) {
    return this.rating > student.rating;
  }

  public void changeRating(int rating) {
    // TODO change this student's rating and average rating of all students
    this.rating = rating;

  }

  public static void removeStudent(Student student) {
    studentList.remove(student);
  }

  @Override
  public String toString() {
    return this.name + " " + this.rating;
  }
}
