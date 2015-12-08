.class final Lcom/kik/l/a$b;
.super Lkik/android/h/i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kik/l/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "b"
.end annotation


# instance fields
.field final synthetic a:Lcom/kik/l/a;


# direct methods
.method public constructor <init>(Lcom/kik/l/a;Landroid/content/Context;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 249
    iput-object p1, p0, Lcom/kik/l/a$b;->a:Lcom/kik/l/a;

    .line 250
    const-string v0, "abTesting.db"

    const/4 v1, 0x1

    invoke-direct {p0, p2, v0, v1, p3}, Lkik/android/h/i;-><init>(Landroid/content/Context;Ljava/lang/String;ILjava/lang/String;)V

    .line 251
    return-void
.end method


# virtual methods
.method public final a(Landroid/database/sqlite/SQLiteDatabase;II)V
    .locals 9

    .prologue
    const/4 v2, 0x0

    .line 256
    const-string v1, "abTestingTable"

    move-object v0, p1

    move-object v3, v2

    move-object v4, v2

    move-object v5, v2

    move-object v6, v2

    move-object v7, v2

    invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v8

    .line 257
    const-string v0, "abTestingTable"

    const-string v1, "name"

    invoke-static {v8, p1, v0, v1}, Lcom/kik/l/a$b;->a(Landroid/database/Cursor;Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;Ljava/lang/String;)V

    .line 258
    const-string v0, "abTestingTable"

    const-string v1, "variant"

    invoke-static {v8, p1, v0, v1}, Lcom/kik/l/a$b;->a(Landroid/database/Cursor;Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;Ljava/lang/String;)V

    .line 259
    const-string v0, "abTestingTable"

    const-string v1, "experiment_id"

    invoke-static {v8, p1, v0, v1}, Lcom/kik/l/a$b;->a(Landroid/database/Cursor;Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;Ljava/lang/String;)V

    .line 261
    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    .line 263
    const-string v1, "abTestingOverrideTable"

    move-object v0, p1

    move-object v3, v2

    move-object v4, v2

    move-object v5, v2

    move-object v6, v2

    move-object v7, v2

    invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    .line 264
    const-string v1, "abTestingOverrideTable"

    const-string v2, "name"

    invoke-static {v8, p1, v1, v2}, Lcom/kik/l/a$b;->a(Landroid/database/Cursor;Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;Ljava/lang/String;)V

    .line 265
    const-string v1, "abTestingOverrideTable"

    const-string v2, "variant"

    invoke-static {v8, p1, v1, v2}, Lcom/kik/l/a$b;->a(Landroid/database/Cursor;Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;Ljava/lang/String;)V

    .line 266
    const-string v1, "abTestingOverrideTable"

    const-string v2, "experiment_id"

    invoke-static {v8, p1, v1, v2}, Lcom/kik/l/a$b;->a(Landroid/database/Cursor;Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;Ljava/lang/String;)V

    .line 267
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    .line 268
    return-void
.end method

.method public final onCreate(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 8

    .prologue
    const/4 v7, 0x4

    const/4 v6, 0x3

    const/4 v5, 0x2

    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 273
    const-string v0, "CREATE TABLE IF NOT EXISTS %s (_id INTEGER PRIMARY KEY AUTOINCREMENT, %s VARCHAR, %s VARCHAR, %s VARCHAR);"

    new-array v1, v7, [Ljava/lang/Object;

    const-string v2, "abTestingTable"

    aput-object v2, v1, v3

    const-string v2, "name"

    aput-object v2, v1, v4

    const-string v2, "variant"

    aput-object v2, v1, v5

    const-string v2, "experiment_id"

    aput-object v2, v1, v6

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 274
    const-string v0, "CREATE TABLE IF NOT EXISTS %s (_id INTEGER PRIMARY KEY AUTOINCREMENT, %s VARCHAR, %s VARCHAR, %s VARCHAR);"

    new-array v1, v7, [Ljava/lang/Object;

    const-string v2, "abTestingOverrideTable"

    aput-object v2, v1, v3

    const-string v2, "name"

    aput-object v2, v1, v4

    const-string v2, "variant"

    aput-object v2, v1, v5

    const-string v2, "experiment_id"

    aput-object v2, v1, v6

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 275
    return-void
.end method

.method public final onUpgrade(Landroid/database/sqlite/SQLiteDatabase;II)V
    .locals 0

    .prologue
    .line 281
    return-void
.end method
