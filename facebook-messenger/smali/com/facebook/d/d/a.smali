.class public Lcom/facebook/d/d/a;
.super Ljava/lang/Object;
.source "AbstractDatabaseSupplier.java"

# interfaces
.implements Lcom/google/common/base/Supplier;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/common/base/Supplier",
        "<",
        "Landroid/database/sqlite/SQLiteDatabase;",
        ">;"
    }
.end annotation

.annotation build Ljavax/annotation/concurrent/ThreadSafe;
.end annotation


# static fields
.field private static final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field

.field private static final b:Lcom/facebook/debug/log/l;


# instance fields
.field private final c:Landroid/content/Context;

.field private final d:Lcom/facebook/common/executors/a;

.field private final e:Lcom/facebook/d/b/a;

.field private final f:Lcom/google/common/a/es;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/es",
            "<+",
            "Lcom/facebook/d/d/d;",
            ">;"
        }
    .end annotation
.end field

.field private final g:Ljava/lang/String;

.field private final h:Lcom/google/common/a/es;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/es",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private i:Landroid/database/sqlite/SQLiteDatabase;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 29
    const-class v0, Lcom/facebook/d/d/a;

    sput-object v0, Lcom/facebook/d/d/a;->a:Ljava/lang/Class;

    .line 31
    new-instance v0, Lcom/facebook/debug/log/l;

    invoke-direct {v0}, Lcom/facebook/debug/log/l;-><init>()V

    sput-object v0, Lcom/facebook/d/d/a;->b:Lcom/facebook/debug/log/l;

    return-void
.end method

.method protected constructor <init>(Landroid/content/Context;Lcom/facebook/common/executors/a;Lcom/facebook/d/b/a;Lcom/google/common/a/es;Ljava/lang/String;Lcom/google/common/a/es;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/facebook/common/executors/a;",
            "Lcom/facebook/d/b/a;",
            "Lcom/google/common/a/es",
            "<+",
            "Lcom/facebook/d/d/d;",
            ">;",
            "Ljava/lang/String;",
            "Lcom/google/common/a/es",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 57
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 58
    iput-object p1, p0, Lcom/facebook/d/d/a;->c:Landroid/content/Context;

    .line 59
    iput-object p2, p0, Lcom/facebook/d/d/a;->d:Lcom/facebook/common/executors/a;

    .line 60
    iput-object p3, p0, Lcom/facebook/d/d/a;->e:Lcom/facebook/d/b/a;

    .line 61
    iput-object p4, p0, Lcom/facebook/d/d/a;->f:Lcom/google/common/a/es;

    .line 62
    iput-object p5, p0, Lcom/facebook/d/d/a;->g:Ljava/lang/String;

    .line 63
    iput-object p6, p0, Lcom/facebook/d/d/a;->h:Lcom/google/common/a/es;

    .line 64
    return-void
.end method

.method private declared-synchronized b()V
    .locals 6

    .prologue
    .line 73
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/d/d/a;->d:Lcom/facebook/common/executors/a;

    invoke-interface {v0}, Lcom/facebook/common/executors/a;->b()V

    .line 74
    iget-object v0, p0, Lcom/facebook/d/d/a;->i:Landroid/database/sqlite/SQLiteDatabase;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz v0, :cond_0

    .line 95
    :goto_0
    monitor-exit p0

    return-void

    .line 77
    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/facebook/d/d/a;->e:Lcom/facebook/d/b/a;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/d/b/a;->b(Ljava/lang/Class;)V

    .line 78
    const-string v0, "ensureDatabase"

    invoke-static {v0}, Lcom/facebook/debug/d/e;->a(Ljava/lang/String;)Lcom/facebook/debug/d/e;

    move-result-object v1

    .line 79
    sget-object v0, Lcom/facebook/d/d/a;->a:Ljava/lang/Class;

    const-string v2, "Initializing database %s"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    iget-object v5, p0, Lcom/facebook/d/d/a;->g:Ljava/lang/String;

    aput-object v5, v3, v4

    invoke-static {v0, v2, v3}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 81
    :try_start_2
    iget-object v0, p0, Lcom/facebook/d/d/a;->h:Lcom/google/common/a/es;

    invoke-virtual {v0}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 82
    iget-object v3, p0, Lcom/facebook/d/d/a;->c:Landroid/content/Context;

    invoke-virtual {v3, v0}, Landroid/content/Context;->deleteDatabase(Ljava/lang/String;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_1

    .line 93
    :catchall_0
    move-exception v0

    :try_start_3
    invoke-virtual {v1}, Lcom/facebook/debug/d/e;->a()J

    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 73
    :catchall_1
    move-exception v0

    monitor-exit p0

    throw v0

    .line 85
    :cond_1
    :try_start_4
    invoke-direct {p0}, Lcom/facebook/d/d/a;->c()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/d/d/a;->i:Landroid/database/sqlite/SQLiteDatabase;
    :try_end_4
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 93
    :goto_2
    :try_start_5
    invoke-virtual {v1}, Lcom/facebook/debug/d/e;->a()J
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    goto :goto_0

    .line 86
    :catch_0
    move-exception v0

    .line 88
    :try_start_6
    sget-object v2, Lcom/facebook/d/d/a;->b:Lcom/facebook/debug/log/l;

    sget-object v3, Lcom/facebook/d/d/a;->a:Ljava/lang/Class;

    const-string v4, "Possible database corruption"

    invoke-static {v2, v3, v4, v0}, Lcom/facebook/debug/log/b;->a(Lcom/facebook/debug/log/l;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 89
    iget-object v0, p0, Lcom/facebook/d/d/a;->c:Landroid/content/Context;

    iget-object v2, p0, Lcom/facebook/d/d/a;->g:Ljava/lang/String;

    invoke-virtual {v0, v2}, Landroid/content/Context;->deleteDatabase(Ljava/lang/String;)Z

    .line 90
    invoke-direct {p0}, Lcom/facebook/d/d/a;->c()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/d/d/a;->i:Landroid/database/sqlite/SQLiteDatabase;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    goto :goto_2
.end method

.method private c()Landroid/database/sqlite/SQLiteDatabase;
    .locals 6

    .prologue
    .line 98
    new-instance v0, Lcom/facebook/d/d/c;

    iget-object v1, p0, Lcom/facebook/d/d/a;->c:Landroid/content/Context;

    iget-object v2, p0, Lcom/facebook/d/d/a;->g:Ljava/lang/String;

    iget-object v3, p0, Lcom/facebook/d/d/a;->f:Lcom/google/common/a/es;

    invoke-virtual {p0}, Lcom/facebook/d/d/a;->a()I

    move-result v4

    invoke-virtual {p0}, Lcom/facebook/d/d/a;->f()I

    move-result v5

    invoke-direct/range {v0 .. v5}, Lcom/facebook/d/d/c;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/util/List;II)V

    .line 105
    invoke-virtual {v0}, Lcom/facebook/d/d/c;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method protected a()I
    .locals 1

    .prologue
    .line 115
    const v0, 0xc800

    return v0
.end method

.method public declared-synchronized e()Landroid/database/sqlite/SQLiteDatabase;
    .locals 1

    .prologue
    .line 68
    monitor-enter p0

    :try_start_0
    invoke-direct {p0}, Lcom/facebook/d/d/a;->b()V

    .line 69
    iget-object v0, p0, Lcom/facebook/d/d/a;->i:Landroid/database/sqlite/SQLiteDatabase;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    .line 68
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method protected f()I
    .locals 1

    .prologue
    .line 124
    const/4 v0, -0x1

    return v0
.end method

.method public synthetic get()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 26
    invoke-virtual {p0}, Lcom/facebook/d/d/a;->e()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    return-object v0
.end method
