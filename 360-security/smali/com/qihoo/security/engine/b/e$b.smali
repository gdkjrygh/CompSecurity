.class Lcom/qihoo/security/engine/b/e$b;
.super Ljava/util/concurrent/ThreadPoolExecutor;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/engine/b/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "b"
.end annotation


# instance fields
.field a:Ljava/util/LinkedList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedList",
            "<",
            "Lcom/qihoo/security/engine/a;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic b:Lcom/qihoo/security/engine/b/e;

.field private volatile c:Z


# direct methods
.method constructor <init>(Lcom/qihoo/security/engine/b/e;)V
    .locals 9

    const/4 v2, 0x2

    iput-object p1, p0, Lcom/qihoo/security/engine/b/e$b;->b:Lcom/qihoo/security/engine/b/e;

    const-wide/16 v4, 0x0

    sget-object v6, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v7, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v7}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    invoke-static {}, Lcom/qihoo/security/engine/b/e;->f()Ljava/util/concurrent/ThreadFactory;

    move-result-object v8

    move-object v1, p0

    move v3, v2

    invoke-direct/range {v1 .. v8}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/qihoo/security/engine/b/e$b;->c:Z

    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/engine/b/e$b;->a:Ljava/util/LinkedList;

    return-void
.end method


# virtual methods
.method a()Z
    .locals 2

    iget-object v1, p0, Lcom/qihoo/security/engine/b/e$b;->a:Ljava/util/LinkedList;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/engine/b/e$b;->a:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/qihoo/security/engine/b/e$b;->c:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    monitor-exit v1

    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method protected afterExecute(Ljava/lang/Runnable;Ljava/lang/Throwable;)V
    .locals 2

    invoke-super {p0, p1, p2}, Ljava/util/concurrent/ThreadPoolExecutor;->afterExecute(Ljava/lang/Runnable;Ljava/lang/Throwable;)V

    if-eqz p2, :cond_0

    :cond_0
    check-cast p1, Lcom/qihoo/security/engine/a;

    iget-object v1, p0, Lcom/qihoo/security/engine/b/e$b;->a:Ljava/util/LinkedList;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/engine/b/e$b;->a:Ljava/util/LinkedList;

    invoke-virtual {v0, p1}, Ljava/util/LinkedList;->remove(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_1
    iget-boolean v0, p0, Lcom/qihoo/security/engine/b/e$b;->c:Z

    if-eqz v0, :cond_3

    :cond_2
    :goto_0
    monitor-exit v1

    return-void

    :cond_3
    iget-object v0, p0, Lcom/qihoo/security/engine/b/e$b;->a:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lcom/qihoo/security/engine/b/e$b;->getQueue()Ljava/util/concurrent/BlockingQueue;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/BlockingQueue;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/qihoo/security/engine/b/e$b;->b:Lcom/qihoo/security/engine/b/e;

    iget-object v0, v0, Lcom/qihoo/security/engine/b/e;->d:Lcom/qihoo/security/engine/b/e$a;

    invoke-interface {v0}, Lcom/qihoo/security/engine/b/e$a;->i()V

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method b()V
    .locals 3

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/qihoo/security/engine/b/e$b;->c:Z

    invoke-virtual {p0}, Lcom/qihoo/security/engine/b/e$b;->getQueue()Ljava/util/concurrent/BlockingQueue;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/concurrent/BlockingQueue;->poll()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/engine/a;

    if-nez v0, :cond_0

    iget-object v1, p0, Lcom/qihoo/security/engine/b/e$b;->a:Ljava/util/LinkedList;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/engine/b/e$b;->a:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lcom/qihoo/security/engine/b/e$b;->shutdown()V

    iget-object v0, p0, Lcom/qihoo/security/engine/b/e$b;->b:Lcom/qihoo/security/engine/b/e;

    iget-object v0, v0, Lcom/qihoo/security/engine/b/e;->d:Lcom/qihoo/security/engine/b/e$a;

    invoke-interface {v0}, Lcom/qihoo/security/engine/b/e$a;->j()V

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/engine/b/e$b;->b:Lcom/qihoo/security/engine/b/e;

    iget-object v0, v0, Lcom/qihoo/security/engine/b/e;->c:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    goto :goto_0

    :cond_1
    :try_start_1
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/engine/a;

    invoke-virtual {v0}, Lcom/qihoo/security/engine/a;->a()I

    goto :goto_1

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method protected beforeExecute(Ljava/lang/Thread;Ljava/lang/Runnable;)V
    .locals 3

    :goto_0
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/engine/b/e$b;->b:Lcom/qihoo/security/engine/b/e;

    iget-boolean v0, v0, Lcom/qihoo/security/engine/b/e;->a:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/qihoo/security/engine/b/e$b;->c:Z
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v0, :cond_1

    :cond_0
    :goto_1
    move-object v0, p2

    check-cast v0, Lcom/qihoo/security/engine/a;

    iget-object v1, p0, Lcom/qihoo/security/engine/b/e$b;->a:Ljava/util/LinkedList;

    monitor-enter v1

    :try_start_1
    iget-object v2, p0, Lcom/qihoo/security/engine/b/e$b;->b:Lcom/qihoo/security/engine/b/e;

    iget-object v2, v2, Lcom/qihoo/security/engine/b/e;->c:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    iget-boolean v2, p0, Lcom/qihoo/security/engine/b/e$b;->c:Z

    if-eqz v2, :cond_2

    invoke-virtual {v0}, Lcom/qihoo/security/engine/a;->a()I

    :goto_2
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-super {p0, p1, p2}, Ljava/util/concurrent/ThreadPoolExecutor;->beforeExecute(Ljava/lang/Thread;Ljava/lang/Runnable;)V

    return-void

    :cond_1
    const-wide/16 v0, 0x64

    :try_start_2
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_1

    :cond_2
    :try_start_3
    iget-object v2, p0, Lcom/qihoo/security/engine/b/e$b;->a:Ljava/util/LinkedList;

    invoke-virtual {v2, v0}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v0
.end method
