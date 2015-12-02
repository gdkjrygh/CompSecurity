.class public final Lcom/facebook/d/d/c;
.super Landroid/database/sqlite/SQLiteOpenHelper;
.source "SharedSQLiteOpenHelper.java"


# static fields
.field private static final d:[Ljava/lang/String;


# instance fields
.field private final a:Lcom/google/common/a/es;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/d/d/d;",
            ">;"
        }
    .end annotation
.end field

.field private b:I

.field private c:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 100
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "version"

    aput-object v2, v0, v1

    sput-object v0, Lcom/facebook/d/d/c;->d:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/util/List;II)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<+",
            "Lcom/facebook/d/d/d;",
            ">;II)V"
        }
    .end annotation

    .prologue
    .line 53
    const/4 v0, 0x0

    const/16 v1, 0xc8

    invoke-direct {p0, p1, p2, v0, v1}, Landroid/database/sqlite/SQLiteOpenHelper;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;I)V

    .line 54
    invoke-static {p3}, Lcom/google/common/a/es;->a(Ljava/util/Collection;)Lcom/google/common/a/es;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/d/d/c;->a:Lcom/google/common/a/es;

    .line 55
    iput p4, p0, Lcom/facebook/d/d/c;->b:I

    .line 56
    iput p5, p0, Lcom/facebook/d/d/c;->c:I

    .line 57
    return-void
.end method

.method private a(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;)I
    .locals 8

    .prologue
    const/4 v6, 0x0

    const/4 v5, 0x0

    .line 110
    const-string v3, "name=?"

    .line 111
    const-string v1, "_shared_version"

    sget-object v2, Lcom/facebook/d/d/c;->d:[Ljava/lang/String;

    const/4 v0, 0x1

    new-array v4, v0, [Ljava/lang/String;

    aput-object p2, v4, v6

    move-object v0, p1

    move-object v6, v5

    move-object v7, v5

    invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v1

    .line 113
    :try_start_0
    invoke-interface {v1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 114
    const/4 v0, 0x0

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getInt(I)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    .line 117
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 119
    :goto_0
    return v0

    .line 117
    :cond_0
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 119
    const/4 v0, -0x1

    goto :goto_0

    .line 117
    :catchall_0
    move-exception v0

    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    throw v0
.end method

.method private a(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;I)V
    .locals 3

    .prologue
    .line 103
    new-instance v0, Landroid/content/ContentValues;

    invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V

    .line 104
    const-string v1, "name"

    invoke-virtual {v0, v1, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 105
    const-string v1, "version"

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 106
    const-string v1, "_shared_version"

    const/4 v2, 0x0

    invoke-virtual {p1, v1, v2, v0}, Landroid/database/sqlite/SQLiteDatabase;->replaceOrThrow(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    .line 107
    return-void
.end method


# virtual methods
.method public final onCreate(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 1

    .prologue
    .line 61
    const-string v0, "CREATE TABLE _shared_version (name TEXT PRIMARY KEY, version INTEGER)"

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 62
    return-void
.end method

.method public final onOpen(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 4

    .prologue
    .line 70
    iget v0, p0, Lcom/facebook/d/d/c;->c:I

    invoke-static {p1, v0}, Lcom/facebook/d/d/b;->b(Landroid/database/sqlite/SQLiteDatabase;I)V

    .line 71
    iget v0, p0, Lcom/facebook/d/d/c;->b:I

    invoke-static {p1, v0}, Lcom/facebook/d/d/b;->a(Landroid/database/sqlite/SQLiteDatabase;I)V

    .line 72
    invoke-virtual {p1}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    .line 74
    :try_start_0
    iget-object v0, p0, Lcom/facebook/d/d/c;->a:Lcom/google/common/a/es;

    invoke-virtual {v0}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/d/d/d;

    .line 75
    invoke-virtual {v0}, Lcom/facebook/d/d/d;->a()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, p1, v2}, Lcom/facebook/d/d/c;->a(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;)I

    move-result v2

    .line 76
    const/4 v3, -0x1

    if-ne v2, v3, :cond_2

    .line 77
    invoke-virtual {p1}, Landroid/database/sqlite/SQLiteDatabase;->isReadOnly()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 78
    new-instance v0, Landroid/database/sqlite/SQLiteException;

    const-string v1, "Can\'t upgrade readonly database"

    invoke-direct {v0, v1}, Landroid/database/sqlite/SQLiteException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 93
    :catchall_0
    move-exception v0

    invoke-virtual {p1}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    throw v0

    .line 80
    :cond_0
    :try_start_1
    invoke-virtual {v0, p1}, Lcom/facebook/d/d/d;->a(Landroid/database/sqlite/SQLiteDatabase;)V

    .line 89
    :cond_1
    :goto_1
    invoke-virtual {v0}, Lcom/facebook/d/d/d;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Lcom/facebook/d/d/d;->b()I

    move-result v0

    invoke-direct {p0, p1, v2, v0}, Lcom/facebook/d/d/c;->a(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;I)V

    goto :goto_0

    .line 81
    :cond_2
    invoke-virtual {v0}, Lcom/facebook/d/d/d;->b()I

    move-result v3

    if-ge v2, v3, :cond_4

    .line 82
    invoke-virtual {p1}, Landroid/database/sqlite/SQLiteDatabase;->isReadOnly()Z

    move-result v3

    if-eqz v3, :cond_3

    .line 83
    new-instance v0, Landroid/database/sqlite/SQLiteException;

    const-string v1, "Can\'t upgrade readonly database"

    invoke-direct {v0, v1}, Landroid/database/sqlite/SQLiteException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 85
    :cond_3
    invoke-virtual {v0}, Lcom/facebook/d/d/d;->b()I

    move-result v3

    invoke-virtual {v0, p1, v2, v3}, Lcom/facebook/d/d/d;->a(Landroid/database/sqlite/SQLiteDatabase;II)V

    goto :goto_1

    .line 86
    :cond_4
    invoke-virtual {v0}, Lcom/facebook/d/d/d;->b()I

    move-result v3

    if-le v2, v3, :cond_1

    .line 87
    new-instance v1, Landroid/database/sqlite/SQLiteException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Can\'t downgrade version for "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v0}, Lcom/facebook/d/d/d;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Landroid/database/sqlite/SQLiteException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 91
    :cond_5
    invoke-virtual {p1}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 93
    invoke-virtual {p1}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 95
    iget-object v0, p0, Lcom/facebook/d/d/c;->a:Lcom/google/common/a/es;

    invoke-virtual {v0}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/d/d/d;

    .line 96
    invoke-virtual {v0, p0}, Lcom/facebook/d/d/d;->a(Lcom/facebook/d/d/c;)V

    goto :goto_2

    .line 98
    :cond_6
    return-void
.end method

.method public final onUpgrade(Landroid/database/sqlite/SQLiteDatabase;II)V
    .locals 0

    .prologue
    .line 66
    return-void
.end method
