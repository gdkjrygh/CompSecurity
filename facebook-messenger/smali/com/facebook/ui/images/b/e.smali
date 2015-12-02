.class public Lcom/facebook/ui/images/b/e;
.super Ljava/lang/Object;
.source "FetchImageDecodingExecutor.java"


# annotations
.annotation build Ljavax/annotation/concurrent/ThreadSafe;
.end annotation


# instance fields
.field private final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field

.field private final b:Lcom/facebook/ui/images/b/l;

.field private final c:Lcom/google/common/d/a/u;

.field private final d:Ljava/util/concurrent/ConcurrentMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentMap",
            "<",
            "Lcom/facebook/ui/images/cache/d;",
            "Lcom/google/common/d/a/s",
            "<",
            "Lcom/facebook/ui/images/b/r;",
            ">;>;"
        }
    .end annotation
.end field

.field private final e:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcom/facebook/ui/images/b/l;)V
    .locals 3

    .prologue
    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    const-class v0, Lcom/facebook/ui/images/b/e;

    iput-object v0, p0, Lcom/facebook/ui/images/b/e;->a:Ljava/lang/Class;

    .line 37
    new-instance v0, Lcom/google/common/a/hy;

    invoke-direct {v0}, Lcom/google/common/a/hy;-><init>()V

    invoke-virtual {v0}, Lcom/google/common/a/hy;->h()Lcom/google/common/a/hy;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/hy;->n()Ljava/util/concurrent/ConcurrentMap;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/ui/images/b/e;->d:Ljava/util/concurrent/ConcurrentMap;

    .line 40
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/facebook/ui/images/b/e;->e:Ljava/lang/Object;

    .line 43
    iput-object p1, p0, Lcom/facebook/ui/images/b/e;->b:Lcom/facebook/ui/images/b/l;

    .line 44
    const/4 v0, 0x2

    new-instance v1, Lcom/facebook/common/executors/s;

    const-string v2, "image-decoding-"

    invoke-direct {v1, v2}, Lcom/facebook/common/executors/s;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v1}, Ljava/util/concurrent/Executors;->newFixedThreadPool(ILjava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/d/a/w;->a(Ljava/util/concurrent/ExecutorService;)Lcom/google/common/d/a/u;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/ui/images/b/e;->c:Lcom/google/common/d/a/u;

    .line 48
    return-void
.end method

.method static synthetic a(Lcom/facebook/ui/images/b/e;)Lcom/facebook/ui/images/b/l;
    .locals 1

    .prologue
    .line 27
    iget-object v0, p0, Lcom/facebook/ui/images/b/e;->b:Lcom/facebook/ui/images/b/l;

    return-object v0
.end method

.method static synthetic b(Lcom/facebook/ui/images/b/e;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 27
    iget-object v0, p0, Lcom/facebook/ui/images/b/e;->e:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic c(Lcom/facebook/ui/images/b/e;)Ljava/util/concurrent/ConcurrentMap;
    .locals 1

    .prologue
    .line 27
    iget-object v0, p0, Lcom/facebook/ui/images/b/e;->d:Ljava/util/concurrent/ConcurrentMap;

    return-object v0
.end method


# virtual methods
.method public a(Lcom/facebook/ui/images/b/m;)Lcom/google/common/d/a/s;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/ui/images/b/m;",
            ")",
            "Lcom/google/common/d/a/s",
            "<",
            "Lcom/facebook/ui/images/b/r;",
            ">;"
        }
    .end annotation

    .prologue
    .line 64
    const/4 v0, 0x0

    .line 65
    invoke-virtual {p1}, Lcom/facebook/ui/images/b/m;->i()Lcom/facebook/ui/images/cache/d;

    move-result-object v1

    .line 66
    iget-object v2, p0, Lcom/facebook/ui/images/b/e;->e:Ljava/lang/Object;

    monitor-enter v2

    .line 68
    if-eqz v1, :cond_0

    .line 69
    :try_start_0
    iget-object v0, p0, Lcom/facebook/ui/images/b/e;->d:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0, v1}, Ljava/util/concurrent/ConcurrentMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/common/d/a/s;

    .line 71
    :cond_0
    if-nez v0, :cond_1

    .line 73
    iget-object v0, p0, Lcom/facebook/ui/images/b/e;->c:Lcom/google/common/d/a/u;

    new-instance v3, Lcom/facebook/ui/images/b/f;

    invoke-direct {v3, p0, p1}, Lcom/facebook/ui/images/b/f;-><init>(Lcom/facebook/ui/images/b/e;Lcom/facebook/ui/images/b/m;)V

    invoke-interface {v0, v3}, Lcom/google/common/d/a/u;->c(Ljava/util/concurrent/Callable;)Lcom/google/common/d/a/s;

    move-result-object v0

    .line 84
    if-eqz v1, :cond_1

    .line 85
    iget-object v3, p0, Lcom/facebook/ui/images/b/e;->d:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v3, v1, v0}, Ljava/util/concurrent/ConcurrentMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    new-instance v3, Lcom/facebook/ui/images/b/g;

    invoke-direct {v3, p0, v1}, Lcom/facebook/ui/images/b/g;-><init>(Lcom/facebook/ui/images/b/e;Lcom/facebook/ui/images/cache/d;)V

    invoke-static {v0, v3}, Lcom/google/common/d/a/i;->a(Lcom/google/common/d/a/s;Lcom/google/common/d/a/h;)V

    .line 103
    :cond_1
    monitor-exit v2

    .line 104
    return-object v0

    .line 103
    :catchall_0
    move-exception v0

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
