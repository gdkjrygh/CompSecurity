.class public final Lcom/roidapp/photogrid/common/l;
.super Landroid/database/sqlite/SQLiteOpenHelper;
.source "SourceFile"


# instance fields
.field private final a:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    .prologue
    .line 16
    const-string v0, "PG.db"

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {p0, p1, v0, v1, v2}, Landroid/database/sqlite/SQLiteOpenHelper;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;I)V

    .line 19
    const-string v0, "CREATE TABLE folder (_id INTEGER PRIMARY KEY AUTOINCREMENT  NOT NULL,folderlist TEXT)"

    iput-object v0, p0, Lcom/roidapp/photogrid/common/l;->a:Ljava/lang/String;

    .line 17
    return-void
.end method


# virtual methods
.method public final onCreate(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 1

    .prologue
    .line 24
    const-string v0, "CREATE TABLE folder (_id INTEGER PRIMARY KEY AUTOINCREMENT  NOT NULL,folderlist TEXT)"

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 25
    return-void
.end method

.method public final onUpgrade(Landroid/database/sqlite/SQLiteDatabase;II)V
    .locals 0

    .prologue
    .line 30
    return-void
.end method
