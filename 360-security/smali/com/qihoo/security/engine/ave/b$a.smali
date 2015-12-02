.class Lcom/qihoo/security/engine/ave/b$a;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/database/sqlite/SQLiteDatabase$CursorFactory;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/engine/ave/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field final a:[B

.field final synthetic b:Lcom/qihoo/security/engine/ave/b;


# direct methods
.method public constructor <init>(Lcom/qihoo/security/engine/ave/b;[B)V
    .locals 0

    iput-object p1, p0, Lcom/qihoo/security/engine/ave/b$a;->b:Lcom/qihoo/security/engine/ave/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/qihoo/security/engine/ave/b$a;->a:[B

    return-void
.end method


# virtual methods
.method public newCursor(Landroid/database/sqlite/SQLiteDatabase;Landroid/database/sqlite/SQLiteCursorDriver;Ljava/lang/String;Landroid/database/sqlite/SQLiteQuery;)Landroid/database/Cursor;
    .locals 2

    const/4 v0, 0x1

    iget-object v1, p0, Lcom/qihoo/security/engine/ave/b$a;->a:[B

    invoke-virtual {p4, v0, v1}, Landroid/database/sqlite/SQLiteQuery;->bindBlob(I[B)V

    new-instance v0, Landroid/database/sqlite/SQLiteCursor;

    invoke-direct {v0, p1, p2, p3, p4}, Landroid/database/sqlite/SQLiteCursor;-><init>(Landroid/database/sqlite/SQLiteDatabase;Landroid/database/sqlite/SQLiteCursorDriver;Ljava/lang/String;Landroid/database/sqlite/SQLiteQuery;)V

    return-object v0
.end method
