.class final Lcom/kik/android/c/j$a;
.super Lkik/android/h/i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kik/android/c/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lcom/kik/android/c/j;


# direct methods
.method public constructor <init>(Lcom/kik/android/c/j;Landroid/content/Context;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 363
    iput-object p1, p0, Lcom/kik/android/c/j$a;->a:Lcom/kik/android/c/j;

    .line 364
    const-string v0, "alternatesTable"

    const/4 v1, 0x1

    invoke-direct {p0, p2, v0, v1, p3}, Lkik/android/h/i;-><init>(Landroid/content/Context;Ljava/lang/String;ILjava/lang/String;)V

    .line 365
    return-void
.end method


# virtual methods
.method public final a(Landroid/database/sqlite/SQLiteDatabase;II)V
    .locals 8

    .prologue
    const/4 v2, 0x0

    .line 383
    const-string v1, "alternatesTable"

    move-object v0, p1

    move-object v3, v2

    move-object v4, v2

    move-object v5, v2

    move-object v6, v2

    move-object v7, v2

    invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    .line 384
    const-string v1, "alternatesTable"

    const-string v2, "smiley_category"

    invoke-static {v0, p1, v1, v2}, Lcom/kik/android/c/j$a;->a(Landroid/database/Cursor;Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;Ljava/lang/String;)V

    .line 385
    const-string v1, "alternatesTable"

    const-string v2, "smiley_id"

    invoke-static {v0, p1, v1, v2}, Lcom/kik/android/c/j$a;->a(Landroid/database/Cursor;Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;Ljava/lang/String;)V

    .line 386
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    .line 387
    return-void
.end method

.method public final onCreate(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 4

    .prologue
    .line 370
    const-string v0, "CREATE TABLE %s (%s VARCHAR, %s VARCHAR);"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    const-string v3, "alternatesTable"

    aput-object v3, v1, v2

    const/4 v2, 0x1

    const-string v3, "smiley_category"

    aput-object v3, v1, v2

    const/4 v2, 0x2

    const-string v3, "smiley_id"

    aput-object v3, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 371
    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 372
    return-void
.end method

.method public final onUpgrade(Landroid/database/sqlite/SQLiteDatabase;II)V
    .locals 0

    .prologue
    .line 378
    return-void
.end method
