.class final Lcom/kik/android/c/j$b;
.super Lkik/android/h/i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kik/android/c/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "b"
.end annotation


# instance fields
.field final synthetic a:Lcom/kik/android/c/j;


# direct methods
.method public constructor <init>(Lcom/kik/android/c/j;Landroid/content/Context;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 323
    iput-object p1, p0, Lcom/kik/android/c/j$b;->a:Lcom/kik/android/c/j;

    .line 324
    const-string v0, "smileyTable"

    const/4 v1, 0x1

    invoke-direct {p0, p2, v0, v1, p3}, Lkik/android/h/i;-><init>(Landroid/content/Context;Ljava/lang/String;ILjava/lang/String;)V

    .line 325
    return-void
.end method


# virtual methods
.method public final a(Landroid/database/sqlite/SQLiteDatabase;II)V
    .locals 8

    .prologue
    const/4 v2, 0x0

    .line 343
    const-string v1, "smileyTable"

    move-object v0, p1

    move-object v3, v2

    move-object v4, v2

    move-object v5, v2

    move-object v6, v2

    move-object v7, v2

    invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    .line 345
    const-string v1, "smileyTable"

    const-string v2, "smiley_id"

    invoke-static {v0, p1, v1, v2}, Lcom/kik/android/c/j$b;->a(Landroid/database/Cursor;Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;Ljava/lang/String;)V

    .line 346
    const-string v1, "smileyTable"

    const-string v2, "smiley_text"

    invoke-static {v0, p1, v1, v2}, Lcom/kik/android/c/j$b;->a(Landroid/database/Cursor;Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;Ljava/lang/String;)V

    .line 347
    const-string v1, "smileyTable"

    const-string v2, "smiley_title"

    invoke-static {v0, p1, v1, v2}, Lcom/kik/android/c/j$b;->a(Landroid/database/Cursor;Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;Ljava/lang/String;)V

    .line 348
    const-string v1, "smileyTable"

    const-string v2, "smiley_category"

    invoke-static {v0, p1, v1, v2}, Lcom/kik/android/c/j$b;->a(Landroid/database/Cursor;Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;Ljava/lang/String;)V

    .line 349
    const-string v1, "smileyTable"

    const-string v2, "smiley_install_date"

    invoke-static {v0, p1, v1, v2}, Lcom/kik/android/c/j$b;->c(Landroid/database/Cursor;Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;Ljava/lang/String;)V

    .line 351
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    .line 352
    return-void
.end method

.method public final onCreate(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 4

    .prologue
    .line 330
    const-string v0, "CREATE TABLE %s (%s VARCHAR, %s VARCHAR, %s VARCHAR, %s VARCHAR, %s LONG);"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    const-string v3, "smileyTable"

    aput-object v3, v1, v2

    const/4 v2, 0x1

    const-string v3, "smiley_id"

    aput-object v3, v1, v2

    const/4 v2, 0x2

    const-string v3, "smiley_text"

    aput-object v3, v1, v2

    const/4 v2, 0x3

    const-string v3, "smiley_title"

    aput-object v3, v1, v2

    const/4 v2, 0x4

    const-string v3, "smiley_category"

    aput-object v3, v1, v2

    const/4 v2, 0x5

    const-string v3, "smiley_install_date"

    aput-object v3, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 331
    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 332
    return-void
.end method

.method public final onUpgrade(Landroid/database/sqlite/SQLiteDatabase;II)V
    .locals 0

    .prologue
    .line 338
    return-void
.end method
