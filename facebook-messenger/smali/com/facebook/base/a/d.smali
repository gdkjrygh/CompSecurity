.class public Lcom/facebook/base/a/d;
.super Ljava/lang/Object;
.source "AppInitLock.java"


# instance fields
.field private final a:Lcom/facebook/common/executors/a;

.field private b:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Lcom/facebook/base/a/f;",
            ">;"
        }
    .end annotation
.end field

.field private c:Z


# direct methods
.method public constructor <init>(Lcom/facebook/common/executors/a;)V
    .locals 1

    .prologue
    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    invoke-static {}, Lcom/google/common/a/kl;->a()Ljava/util/HashSet;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/base/a/d;->b:Ljava/util/Set;

    .line 34
    iput-object p1, p0, Lcom/facebook/base/a/d;->a:Lcom/facebook/common/executors/a;

    .line 35
    return-void
.end method

.method static synthetic a(Lcom/facebook/base/a/d;)V
    .locals 0

    .prologue
    .line 16
    invoke-direct {p0}, Lcom/facebook/base/a/d;->e()V

    return-void
.end method

.method private d()V
    .locals 2

    .prologue
    .line 84
    iget-object v0, p0, Lcom/facebook/base/a/d;->a:Lcom/facebook/common/executors/a;

    new-instance v1, Lcom/facebook/base/a/e;

    invoke-direct {v1, p0}, Lcom/facebook/base/a/e;-><init>(Lcom/facebook/base/a/d;)V

    invoke-interface {v0, v1}, Lcom/facebook/common/executors/a;->b(Ljava/lang/Runnable;)V

    .line 90
    return-void
.end method

.method private e()V
    .locals 2

    .prologue
    .line 97
    monitor-enter p0

    .line 98
    :try_start_0
    iget-object v0, p0, Lcom/facebook/base/a/d;->b:Ljava/util/Set;

    .line 99
    invoke-static {}, Lcom/google/common/a/kl;->a()Ljava/util/HashSet;

    move-result-object v1

    iput-object v1, p0, Lcom/facebook/base/a/d;->b:Ljava/util/Set;

    .line 100
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 101
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/base/a/f;

    .line 102
    invoke-virtual {v0}, Lcom/facebook/base/a/f;->a()V

    goto :goto_0

    .line 100
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    .line 104
    :cond_0
    return-void
.end method


# virtual methods
.method protected a()V
    .locals 1

    .prologue
    .line 41
    monitor-enter p0

    .line 42
    const/4 v0, 0x1

    :try_start_0
    iput-boolean v0, p0, Lcom/facebook/base/a/d;->c:Z

    .line 43
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    .line 44
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    invoke-direct {p0}, Lcom/facebook/base/a/d;->d()V

    .line 46
    return-void

    .line 44
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public a(Lcom/facebook/base/a/f;)V
    .locals 1

    .prologue
    .line 69
    iget-object v0, p0, Lcom/facebook/base/a/d;->a:Lcom/facebook/common/executors/a;

    invoke-interface {v0}, Lcom/facebook/common/executors/a;->a()V

    .line 71
    monitor-enter p0

    .line 72
    :try_start_0
    iget-object v0, p0, Lcom/facebook/base/a/d;->b:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 73
    iget-boolean v0, p0, Lcom/facebook/base/a/d;->c:Z

    .line 74
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 75
    if-eqz v0, :cond_0

    .line 76
    invoke-direct {p0}, Lcom/facebook/base/a/d;->d()V

    .line 78
    :cond_0
    return-void

    .line 74
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public declared-synchronized b()V
    .locals 2

    .prologue
    .line 53
    monitor-enter p0

    :goto_0
    :try_start_0
    iget-boolean v0, p0, Lcom/facebook/base/a/d;->c:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    .line 55
    :try_start_1
    invoke-virtual {p0}, Ljava/lang/Object;->wait()V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 56
    :catch_0
    move-exception v0

    .line 57
    :try_start_2
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 53
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 60
    :cond_0
    monitor-exit p0

    return-void
.end method

.method public declared-synchronized c()Z
    .locals 1

    .prologue
    .line 112
    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/facebook/base/a/d;->c:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
