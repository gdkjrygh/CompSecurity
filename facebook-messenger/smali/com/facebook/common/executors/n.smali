.class public Lcom/facebook/common/executors/n;
.super Ljava/lang/Object;
.source "KeyedExecutor.java"


# static fields
.field private static final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field

.field private static final b:Ljava/lang/ThreadLocal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ThreadLocal",
            "<",
            "Ljava/util/concurrent/atomic/AtomicInteger;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final c:Lcom/google/common/d/a/u;

.field private final d:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/Object;",
            "Lcom/facebook/common/executors/r;",
            ">;"
        }
    .end annotation

    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation
.end field

.field private final e:Ljava/util/concurrent/ConcurrentMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentMap",
            "<",
            "Ljava/lang/Object;",
            "Lcom/facebook/common/executors/q;",
            ">;"
        }
    .end annotation

    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this for writes"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 31
    const-class v0, Lcom/facebook/common/executors/n;

    sput-object v0, Lcom/facebook/common/executors/n;->a:Ljava/lang/Class;

    .line 36
    new-instance v0, Lcom/facebook/common/executors/o;

    invoke-direct {v0}, Lcom/facebook/common/executors/o;-><init>()V

    sput-object v0, Lcom/facebook/common/executors/n;->b:Ljava/lang/ThreadLocal;

    return-void
.end method

.method public constructor <init>(Ljava/util/concurrent/ExecutorService;)V
    .locals 1

    .prologue
    .line 109
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 102
    invoke-static {}, Lcom/google/common/a/ik;->a()Ljava/util/HashMap;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/common/executors/n;->d:Ljava/util/Map;

    .line 105
    new-instance v0, Lcom/google/common/a/hy;

    invoke-direct {v0}, Lcom/google/common/a/hy;-><init>()V

    invoke-virtual {v0}, Lcom/google/common/a/hy;->h()Lcom/google/common/a/hy;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/hy;->n()Ljava/util/concurrent/ConcurrentMap;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/common/executors/n;->e:Ljava/util/concurrent/ConcurrentMap;

    .line 110
    invoke-static {p1}, Lcom/google/common/d/a/w;->a(Ljava/util/concurrent/ExecutorService;)Lcom/google/common/d/a/u;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/common/executors/n;->c:Lcom/google/common/d/a/u;

    .line 111
    return-void
.end method

.method static synthetic a()Ljava/lang/Class;
    .locals 1

    .prologue
    .line 29
    sget-object v0, Lcom/facebook/common/executors/n;->a:Ljava/lang/Class;

    return-object v0
.end method

.method static synthetic a(Lcom/facebook/common/executors/n;Lcom/facebook/common/executors/q;Lcom/facebook/common/executors/r;)V
    .locals 0

    .prologue
    .line 29
    invoke-direct {p0, p1, p2}, Lcom/facebook/common/executors/n;->a(Lcom/facebook/common/executors/q;Lcom/facebook/common/executors/r;)V

    return-void
.end method

.method private declared-synchronized a(Lcom/facebook/common/executors/q;Lcom/facebook/common/executors/r;)V
    .locals 2

    .prologue
    .line 186
    monitor-enter p0

    const/4 v0, 0x0

    :try_start_0
    iput-object v0, p2, Lcom/facebook/common/executors/r;->c:Lcom/google/common/d/a/s;

    .line 187
    iget-object v0, p0, Lcom/facebook/common/executors/n;->e:Ljava/util/concurrent/ConcurrentMap;

    iget-object v1, p1, Lcom/facebook/common/executors/q;->b:Ljava/lang/Object;

    invoke-interface {v0, v1, p1}, Ljava/util/concurrent/ConcurrentMap;->remove(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 188
    invoke-direct {p0, p2}, Lcom/facebook/common/executors/n;->a(Lcom/facebook/common/executors/r;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 189
    monitor-exit p0

    return-void

    .line 186
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method private declared-synchronized a(Lcom/facebook/common/executors/r;)V
    .locals 5

    .prologue
    .line 146
    monitor-enter p0

    :try_start_0
    iget-object v0, p1, Lcom/facebook/common/executors/r;->c:Lcom/google/common/d/a/s;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    .line 183
    :goto_0
    monitor-exit p0

    return-void

    .line 149
    :cond_0
    :try_start_1
    sget-object v0, Lcom/facebook/common/executors/n;->b:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 150
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 152
    :try_start_2
    iget-object v1, p1, Lcom/facebook/common/executors/r;->b:Ljava/util/Queue;

    invoke-interface {v1}, Ljava/util/Queue;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 154
    iget-object v1, p0, Lcom/facebook/common/executors/n;->d:Ljava/util/Map;

    iget-object v2, p1, Lcom/facebook/common/executors/r;->a:Ljava/lang/Object;

    invoke-interface {v1, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 181
    :goto_1
    :try_start_3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_0

    .line 146
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 170
    :cond_1
    :try_start_4
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v1

    const/4 v2, 0x2

    if-le v1, v2, :cond_2

    iget-object v1, p0, Lcom/facebook/common/executors/n;->c:Lcom/google/common/d/a/u;

    move-object v2, v1

    .line 172
    :goto_2
    iget-object v1, p1, Lcom/facebook/common/executors/r;->b:Ljava/util/Queue;

    invoke-interface {v1}, Ljava/util/Queue;->remove()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/common/executors/q;

    .line 173
    iget-object v3, p0, Lcom/facebook/common/executors/n;->c:Lcom/google/common/d/a/u;

    invoke-interface {v3, v1}, Lcom/google/common/d/a/u;->b(Ljava/lang/Runnable;)Lcom/google/common/d/a/s;

    move-result-object v3

    iput-object v3, p1, Lcom/facebook/common/executors/r;->c:Lcom/google/common/d/a/s;

    .line 174
    iget-object v3, p1, Lcom/facebook/common/executors/r;->c:Lcom/google/common/d/a/s;

    new-instance v4, Lcom/facebook/common/executors/p;

    invoke-direct {v4, p0, v1, p1}, Lcom/facebook/common/executors/p;-><init>(Lcom/facebook/common/executors/n;Lcom/facebook/common/executors/q;Lcom/facebook/common/executors/r;)V

    invoke-interface {v3, v4, v2}, Lcom/google/common/d/a/s;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_1

    .line 181
    :catchall_1
    move-exception v1

    :try_start_5
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    throw v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 170
    :cond_2
    :try_start_6
    invoke-static {}, Lcom/google/common/d/a/w;->a()Lcom/google/common/d/a/u;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    move-result-object v1

    move-object v2, v1

    goto :goto_2
.end method


# virtual methods
.method public a(Ljava/lang/Object;)Lcom/google/common/d/a/s;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Object;",
            ")",
            "Lcom/google/common/d/a/s",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 192
    iget-object v0, p0, Lcom/facebook/common/executors/n;->e:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0, p1}, Ljava/util/concurrent/ConcurrentMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/common/executors/q;

    .line 193
    if-eqz v0, :cond_0

    invoke-static {v0}, Lcom/facebook/common/executors/q;->a(Lcom/facebook/common/executors/q;)Lcom/google/common/d/a/t;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public declared-synchronized a(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/concurrent/Callable;Ljava/lang/String;)Lcom/google/common/d/a/s;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            "Ljava/util/concurrent/Callable",
            "<TT;>;",
            "Ljava/lang/String;",
            ")",
            "Lcom/google/common/d/a/s",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 127
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/common/executors/n;->d:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/common/executors/r;

    .line 128
    if-nez v0, :cond_1

    .line 129
    new-instance v0, Lcom/facebook/common/executors/r;

    invoke-direct {v0, p1}, Lcom/facebook/common/executors/r;-><init>(Ljava/lang/Object;)V

    .line 130
    iget-object v1, p0, Lcom/facebook/common/executors/n;->d:Ljava/util/Map;

    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object v6, v0

    .line 133
    :goto_0
    iget-object v0, p0, Lcom/facebook/common/executors/n;->e:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0, p2}, Ljava/util/concurrent/ConcurrentMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 134
    sget-object v0, Lcom/facebook/common/executors/n;->a:Ljava/lang/Class;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Already contains a callable for key "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->d(Ljava/lang/Class;Ljava/lang/String;)V

    .line 137
    :cond_0
    new-instance v0, Lcom/facebook/common/executors/q;

    const/4 v5, 0x0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    invoke-direct/range {v0 .. v5}, Lcom/facebook/common/executors/q;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/concurrent/Callable;Ljava/lang/String;Lcom/facebook/common/executors/o;)V

    .line 138
    iget-object v1, p0, Lcom/facebook/common/executors/n;->e:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v1, p2, v0}, Ljava/util/concurrent/ConcurrentMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 139
    iget-object v1, v6, Lcom/facebook/common/executors/r;->b:Ljava/util/Queue;

    invoke-interface {v1, v0}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    .line 140
    invoke-direct {p0, v6}, Lcom/facebook/common/executors/n;->a(Lcom/facebook/common/executors/r;)V

    .line 141
    invoke-static {v0}, Lcom/facebook/common/executors/q;->a(Lcom/facebook/common/executors/q;)Lcom/google/common/d/a/t;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    monitor-exit p0

    return-object v0

    .line 127
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    :cond_1
    move-object v6, v0

    goto :goto_0
.end method
