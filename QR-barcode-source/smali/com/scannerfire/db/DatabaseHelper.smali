.class public Lcom/scannerfire/db/DatabaseHelper;
.super Landroid/database/sqlite/SQLiteOpenHelper;
.source "DatabaseHelper.java"


# static fields
.field private static final DATABASE_VERSION:I = 0x1

.field private static final TABLE_CREATE:Ljava/lang/String; = "CREATE TABLE scans (_id INTEGER PRIMARY KEY AUTOINCREMENT , text TEXT ,byte BLOB ,result_x FLOAT ,result_y FLOAT ,format TEXT ,time TEXT , date TEXT );"

.field private static final TABLE_NAME:Ljava/lang/String; = "scans"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .line 29
    const-string v0, "scans"

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {p0, p1, v0, v1, v2}, Landroid/database/sqlite/SQLiteOpenHelper;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;I)V

    .line 30
    return-void
.end method


# virtual methods
.method public onCreate(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 1
    .param p1, "database"    # Landroid/database/sqlite/SQLiteDatabase;

    .prologue
    .line 34
    const-string v0, "CREATE TABLE scans (_id INTEGER PRIMARY KEY AUTOINCREMENT , text TEXT ,byte BLOB ,result_x FLOAT ,result_y FLOAT ,format TEXT ,time TEXT , date TEXT );"

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 35
    return-void
.end method

.method public onUpgrade(Landroid/database/sqlite/SQLiteDatabase;II)V
    .locals 1
    .param p1, "database"    # Landroid/database/sqlite/SQLiteDatabase;
    .param p2, "oldVersion"    # I
    .param p3, "newVersion"    # I

    .prologue
    .line 40
    const-string v0, "DROP TABLE IF EXIST contact"

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 41
    invoke-virtual {p0, p1}, Lcom/scannerfire/db/DatabaseHelper;->onCreate(Landroid/database/sqlite/SQLiteDatabase;)V

    .line 42
    return-void
.end method
