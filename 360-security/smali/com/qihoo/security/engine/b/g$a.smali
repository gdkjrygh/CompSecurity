.class Lcom/qihoo/security/engine/b/g$a;
.super Ljava/util/concurrent/ThreadPoolExecutor;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/engine/b/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field volatile a:Lcom/qihoo/security/engine/a;

.field volatile b:Z

.field final synthetic c:Lcom/qihoo/security/engine/b/g;


# direct methods
.method constructor <init>(Lcom/qihoo/security/engine/b/g;)V
    .locals 8

    const/4 v2, 0x1

    iput-object p1, p0, Lcom/qihoo/security/engine/b/g$a;->c:Lcom/qihoo/security/engine/b/g;

    const-wide/16 v4, 0x0

    sget-object v6, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v7, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v7}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    move-object v1, p0

    move v3, v2

    invoke-direct/range {v1 .. v7}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/qihoo/security/engine/b/g$a;->a:Lcom/qihoo/security/engine/a;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/qihoo/security/engine/b/g$a;->b:Z

    return-void
.end method


# virtual methods
.method a()Z
    .locals 1

    iget-object v0, p0, Lcom/qihoo/security/engine/b/g$a;->a:Lcom/qihoo/security/engine/a;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method protected afterExecute(Ljava/lang/Runnable;Ljava/lang/Throwable;)V
    .locals 2

    invoke-super {p0, p1, p2}, Ljava/util/concurrent/ThreadPoolExecutor;->afterExecute(Ljava/lang/Runnable;Ljava/lang/Throwable;)V

    if-eqz p2, :cond_0

    :cond_0
    iget-object v1, p0, Lcom/qihoo/security/engine/b/g$a;->a:Lcom/qihoo/security/engine/a;

    monitor-enter v1

    const/4 v0, 0x0

    :try_start_0
    iput-object v0, p0, Lcom/qihoo/security/engine/b/g$a;->a:Lcom/qihoo/security/engine/a;

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lcom/qihoo/security/engine/b/g$a;->c:Lcom/qihoo/security/engine/b/g;

    iget-object v0, v0, Lcom/qihoo/security/engine/b/g;->d:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    return-void

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method b()V
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/qihoo/security/engine/b/g$a;->b:Z

    invoke-virtual {p0}, Lcom/qihoo/security/engine/b/g$a;->getQueue()Ljava/util/concurrent/BlockingQueue;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/concurrent/BlockingQueue;->poll()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/engine/a;

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/qihoo/security/engine/b/g$a;->a:Lcom/qihoo/security/engine/a;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/qihoo/security/engine/b/g$a;->a:Lcom/qihoo/security/engine/a;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/engine/b/g$a;->a:Lcom/qihoo/security/engine/a;

    invoke-virtual {v0}, Lcom/qihoo/security/engine/a;->a()I

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/engine/b/g$a;->c:Lcom/qihoo/security/engine/b/g;

    iget-object v0, v0, Lcom/qihoo/security/engine/b/g;->d:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    goto :goto_0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method protected beforeExecute(Ljava/lang/Thread;Ljava/lang/Runnable;)V
    .locals 4

    move-object v0, p2

    check-cast v0, Lcom/qihoo/security/engine/a;

    iput-object v0, p0, Lcom/qihoo/security/engine/b/g$a;->a:Lcom/qihoo/security/engine/a;

    iget-object v0, p0, Lcom/qihoo/security/engine/b/g$a;->c:Lcom/qihoo/security/engine/b/g;

    iget-object v0, v0, Lcom/qihoo/security/engine/b/g;->c:Landroid/os/Handler;

    new-instance v1, Lcom/qihoo/security/engine/b/f;

    iget-object v2, p0, Lcom/qihoo/security/engine/b/g$a;->a:Lcom/qihoo/security/engine/a;

    invoke-direct {v1, v2}, Lcom/qihoo/security/engine/b/f;-><init>(Lcom/qihoo/security/engine/a;)V

    const-wide/32 v2, 0x2bf20

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    invoke-super {p0, p1, p2}, Ljava/util/concurrent/ThreadPoolExecutor;->beforeExecute(Ljava/lang/Thread;Ljava/lang/Runnable;)V

    return-void
.end method
