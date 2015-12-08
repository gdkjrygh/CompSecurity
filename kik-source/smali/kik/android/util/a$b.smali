.class final Lkik/android/util/a$b;
.super Lkik/android/h/i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkik/android/util/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "b"
.end annotation


# instance fields
.field final synthetic a:Lkik/android/util/a;


# direct methods
.method public constructor <init>(Lkik/android/util/a;Landroid/content/Context;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 569
    iput-object p1, p0, Lkik/android/util/a$b;->a:Lkik/android/util/a;

    .line 570
    const-string v0, "kikAndroidFileDatabase.db"

    const/4 v1, 0x1

    invoke-direct {p0, p2, v0, v1, p3}, Lkik/android/h/i;-><init>(Landroid/content/Context;Ljava/lang/String;ILjava/lang/String;)V

    .line 571
    return-void
.end method


# virtual methods
.method public final a(Landroid/database/sqlite/SQLiteDatabase;II)V
    .locals 0

    .prologue
    .line 591
    return-void
.end method

.method public final onCreate(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 4

    .prologue
    .line 576
    const-string v0, "CREATE TABLE IF NOT EXISTS %s (_id INTEGER PRIMARY KEY AUTOINCREMENT, uuid VARCHAR, appid VARCHAR, url VARCHAR, path VARCHAR, size INT, progress INT, contentType VARCHAR);"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    const-string v3, "AndroidFileTable"

    aput-object v3, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 578
    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 579
    return-void
.end method

.method public final onUpgrade(Landroid/database/sqlite/SQLiteDatabase;II)V
    .locals 0

    .prologue
    .line 585
    return-void
.end method
