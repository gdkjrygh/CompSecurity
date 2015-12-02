.class Lcom/qihoo/security/h/b$a;
.super Landroid/database/sqlite/SQLiteOpenHelper;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/h/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation


# static fields
.field private static final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .prologue
    .line 210
    const-string/jumbo v0, "CREATE TABLE IF NOT EXISTS %s (%s VARCHAR PRIMARY KEY, %s INTEGER NOT NULL DEFAULT 0, %s INTEGER NOT NULL DEFAULT 0, %s INTEGER NOT NULL DEFAULT 0, %s INTEGER NOT NULL DEFAULT 0, %s INTEGER NOT NULL DEFAULT 0, %s INTEGER NOT NULL DEFAULT 0, %s VARCHAR)"

    const/16 v1, 0x9

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    const-string/jumbo v3, "pkginfo"

    aput-object v3, v1, v2

    const/4 v2, 0x1

    const-string/jumbo v3, "pkg"

    aput-object v3, v1, v2

    const/4 v2, 0x2

    const-string/jumbo v3, "shield"

    aput-object v3, v1, v2

    const/4 v2, 0x3

    const-string/jumbo v3, "type"

    aput-object v3, v1, v2

    const/4 v2, 0x4

    const-string/jumbo v3, "taxis"

    aput-object v3, v1, v2

    const/4 v2, 0x5

    const-string/jumbo v3, "smark"

    aput-object v3, v1, v2

    const/4 v2, 0x6

    const-string/jumbo v3, "tmark"

    aput-object v3, v1, v2

    const/4 v2, 0x7

    const-string/jumbo v3, "etc"

    aput-object v3, v1, v2

    const/16 v2, 0x8

    const-string/jumbo v3, "tis"

    aput-object v3, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/qihoo/security/h/b$a;->a:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    .prologue
    .line 207
    const-string/jumbo v0, "shield.db"

    const/4 v1, 0x0

    const/4 v2, 0x3

    invoke-direct {p0, p1, v0, v1, v2}, Landroid/database/sqlite/SQLiteOpenHelper;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;I)V

    .line 208
    return-void
.end method


# virtual methods
.method public onCreate(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 1

    .prologue
    .line 218
    sget-object v0, Lcom/qihoo/security/h/b$a;->a:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 219
    return-void
.end method

.method public onDowngrade(Landroid/database/sqlite/SQLiteDatabase;II)V
    .locals 0

    .prologue
    .line 236
    return-void
.end method

.method public onUpgrade(Landroid/database/sqlite/SQLiteDatabase;II)V
    .locals 0

    .prologue
    .line 227
    if-le p2, p3, :cond_0

    .line 230
    :cond_0
    return-void
.end method
