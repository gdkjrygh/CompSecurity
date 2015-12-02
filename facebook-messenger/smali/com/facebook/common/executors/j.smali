.class public Lcom/facebook/common/executors/j;
.super Ljava/util/concurrent/AbstractExecutorService;
.source "HandlerExecutorServiceImpl.java"

# interfaces
.implements Lcom/facebook/common/executors/i;


# instance fields
.field private final a:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Landroid/os/Handler;)V
    .locals 0

    .prologue
    .line 35
    invoke-direct {p0}, Ljava/util/concurrent/AbstractExecutorService;-><init>()V

    .line 36
    iput-object p1, p0, Lcom/facebook/common/executors/j;->a:Landroid/os/Handler;

    .line 37
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Runnable;)Lcom/facebook/common/executors/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Runnable;",
            ")",
            "Lcom/facebook/common/executors/l",
            "<*>;"
        }
    .end annotation

    .prologue
    .line 103
    const/4 v0, 0x0

    check-cast v0, Ljava/lang/Void;

    invoke-virtual {p0, p1, v0}, Lcom/facebook/common/executors/j;->b(Ljava/lang/Runnable;Ljava/lang/Object;)Lcom/facebook/common/executors/l;

    move-result-object v0

    return-object v0
.end method

.method public a(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Lcom/facebook/common/executors/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Runnable;",
            "JJ",
            "Ljava/util/concurrent/TimeUnit;",
            ")",
            "Lcom/facebook/common/executors/l",
            "<*>;"
        }
    .end annotation

    .prologue
    .line 140
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public a(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Lcom/facebook/common/executors/l;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Runnable;",
            "J",
            "Ljava/util/concurrent/TimeUnit;",
            ")",
            "Lcom/facebook/common/executors/l",
            "<*>;"
        }
    .end annotation

    .prologue
    .line 124
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/facebook/common/executors/j;->a(Ljava/lang/Runnable;Ljava/lang/Object;)Lcom/facebook/common/executors/l;

    move-result-object v0

    .line 125
    iget-object v1, p0, Lcom/facebook/common/executors/j;->a:Landroid/os/Handler;

    invoke-virtual {p4, p2, p3}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v2

    invoke-virtual {v1, v0, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 126
    return-object v0
.end method

.method protected a(Ljava/lang/Runnable;Ljava/lang/Object;)Lcom/facebook/common/executors/l;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Runnable;",
            "TT;)",
            "Lcom/facebook/common/executors/l",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 54
    new-instance v0, Lcom/facebook/common/executors/l;

    invoke-virtual {p0}, Lcom/facebook/common/executors/j;->c()Landroid/os/Handler;

    move-result-object v1

    invoke-direct {v0, v1, p1, p2}, Lcom/facebook/common/executors/l;-><init>(Landroid/os/Handler;Ljava/lang/Runnable;Ljava/lang/Object;)V

    return-object v0
.end method

.method protected a(Ljava/util/concurrent/Callable;)Lcom/facebook/common/executors/l;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/concurrent/Callable",
            "<TT;>;)",
            "Lcom/facebook/common/executors/l",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 58
    new-instance v0, Lcom/facebook/common/executors/l;

    invoke-virtual {p0}, Lcom/facebook/common/executors/j;->c()Landroid/os/Handler;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Lcom/facebook/common/executors/l;-><init>(Landroid/os/Handler;Ljava/util/concurrent/Callable;)V

    return-object v0
.end method

.method public a(Ljava/util/concurrent/Callable;JLjava/util/concurrent/TimeUnit;)Lcom/facebook/common/executors/l;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/concurrent/Callable",
            "<TV;>;J",
            "Ljava/util/concurrent/TimeUnit;",
            ")",
            "Lcom/facebook/common/executors/l",
            "<TV;>;"
        }
    .end annotation

    .prologue
    .line 132
    invoke-virtual {p0, p1}, Lcom/facebook/common/executors/j;->a(Ljava/util/concurrent/Callable;)Lcom/facebook/common/executors/l;

    move-result-object v0

    .line 133
    iget-object v1, p0, Lcom/facebook/common/executors/j;->a:Landroid/os/Handler;

    invoke-virtual {p4, p2, p3}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v2

    invoke-virtual {v1, v0, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 134
    return-object v0
.end method

.method public a()V
    .locals 1

    .prologue
    .line 151
    iget-object v0, p0, Lcom/facebook/common/executors/j;->a:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Looper;->quit()V

    .line 152
    return-void
.end method

.method public awaitTermination(JLjava/util/concurrent/TimeUnit;)Z
    .locals 1

    .prologue
    .line 83
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public b(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Lcom/facebook/common/executors/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Runnable;",
            "JJ",
            "Ljava/util/concurrent/TimeUnit;",
            ")",
            "Lcom/facebook/common/executors/l",
            "<*>;"
        }
    .end annotation

    .prologue
    .line 146
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public b(Ljava/lang/Runnable;Ljava/lang/Object;)Lcom/facebook/common/executors/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Runnable;",
            "TT;)",
            "Lcom/facebook/common/executors/l",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 108
    if-nez p1, :cond_0

    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 109
    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/facebook/common/executors/j;->a(Ljava/lang/Runnable;Ljava/lang/Object;)Lcom/facebook/common/executors/l;

    move-result-object v0

    .line 110
    invoke-virtual {p0, v0}, Lcom/facebook/common/executors/j;->execute(Ljava/lang/Runnable;)V

    .line 111
    return-object v0
.end method

.method public b(Ljava/util/concurrent/Callable;)Lcom/facebook/common/executors/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/concurrent/Callable",
            "<TT;>;)",
            "Lcom/facebook/common/executors/l",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 116
    if-nez p1, :cond_0

    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 117
    :cond_0
    invoke-virtual {p0, p1}, Lcom/facebook/common/executors/j;->a(Ljava/util/concurrent/Callable;)Lcom/facebook/common/executors/l;

    move-result-object v0

    .line 118
    invoke-virtual {p0, v0}, Lcom/facebook/common/executors/j;->execute(Ljava/lang/Runnable;)V

    .line 119
    return-object v0
.end method

.method public synthetic b(Ljava/lang/Runnable;)Lcom/google/common/d/a/s;
    .locals 1

    .prologue
    .line 30
    invoke-virtual {p0, p1}, Lcom/facebook/common/executors/j;->a(Ljava/lang/Runnable;)Lcom/facebook/common/executors/l;

    move-result-object v0

    return-object v0
.end method

.method public b()Z
    .locals 2

    .prologue
    .line 156
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/common/executors/j;->a:Landroid/os/Handler;

    invoke-virtual {v1}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-virtual {v1}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public c()Landroid/os/Handler;
    .locals 1

    .prologue
    .line 40
    iget-object v0, p0, Lcom/facebook/common/executors/j;->a:Landroid/os/Handler;

    return-object v0
.end method

.method public synthetic c(Ljava/util/concurrent/Callable;)Lcom/google/common/d/a/s;
    .locals 1

    .prologue
    .line 30
    invoke-virtual {p0, p1}, Lcom/facebook/common/executors/j;->b(Ljava/util/concurrent/Callable;)Lcom/facebook/common/executors/l;

    move-result-object v0

    return-object v0
.end method

.method public execute(Ljava/lang/Runnable;)V
    .locals 5

    .prologue
    .line 88
    instance-of v0, p1, Ljava/util/concurrent/Future;

    if-eqz v0, :cond_0

    .line 90
    instance-of v0, p1, Lcom/facebook/common/executors/k;

    if-nez v0, :cond_0

    .line 94
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-string v1, "%s submitted as runnable to %s. Potential deadlocks on get()."

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    aput-object v4, v2, v3

    const/4 v3, 0x1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-static {v0, v1, v2}, Lcom/facebook/debug/log/b;->d(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 98
    :cond_0
    iget-object v0, p0, Lcom/facebook/common/executors/j;->a:Landroid/os/Handler;

    invoke-virtual {v0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 99
    return-void
.end method

.method public isShutdown()Z
    .locals 1

    .prologue
    .line 73
    const/4 v0, 0x0

    return v0
.end method

.method public isTerminated()Z
    .locals 1

    .prologue
    .line 78
    const/4 v0, 0x0

    return v0
.end method

.method protected newTaskFor(Ljava/lang/Runnable;Ljava/lang/Object;)Ljava/util/concurrent/RunnableFuture;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Runnable;",
            "TT;)",
            "Ljava/util/concurrent/RunnableFuture",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 45
    new-instance v0, Lcom/facebook/common/executors/m;

    invoke-virtual {p0}, Lcom/facebook/common/executors/j;->c()Landroid/os/Handler;

    move-result-object v1

    invoke-direct {v0, v1, p1, p2}, Lcom/facebook/common/executors/m;-><init>(Landroid/os/Handler;Ljava/lang/Runnable;Ljava/lang/Object;)V

    return-object v0
.end method

.method protected newTaskFor(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/RunnableFuture;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/concurrent/Callable",
            "<TT;>;)",
            "Ljava/util/concurrent/RunnableFuture",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 50
    new-instance v0, Lcom/facebook/common/executors/m;

    invoke-virtual {p0}, Lcom/facebook/common/executors/j;->c()Landroid/os/Handler;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Lcom/facebook/common/executors/m;-><init>(Landroid/os/Handler;Ljava/util/concurrent/Callable;)V

    return-object v0
.end method

.method public synthetic schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;
    .locals 1

    .prologue
    .line 30
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/facebook/common/executors/j;->a(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Lcom/facebook/common/executors/l;

    move-result-object v0

    return-object v0
.end method

.method public synthetic schedule(Ljava/util/concurrent/Callable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;
    .locals 1

    .prologue
    .line 30
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/facebook/common/executors/j;->a(Ljava/util/concurrent/Callable;JLjava/util/concurrent/TimeUnit;)Lcom/facebook/common/executors/l;

    move-result-object v0

    return-object v0
.end method

.method public synthetic scheduleAtFixedRate(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;
    .locals 1

    .prologue
    .line 30
    invoke-virtual/range {p0 .. p6}, Lcom/facebook/common/executors/j;->a(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Lcom/facebook/common/executors/l;

    move-result-object v0

    return-object v0
.end method

.method public synthetic scheduleWithFixedDelay(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;
    .locals 1

    .prologue
    .line 30
    invoke-virtual/range {p0 .. p6}, Lcom/facebook/common/executors/j;->b(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Lcom/facebook/common/executors/l;

    move-result-object v0

    return-object v0
.end method

.method public shutdown()V
    .locals 1

    .prologue
    .line 63
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public shutdownNow()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Ljava/lang/Runnable;",
            ">;"
        }
    .end annotation

    .prologue
    .line 68
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public synthetic submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    .locals 1

    .prologue
    .line 30
    invoke-virtual {p0, p1}, Lcom/facebook/common/executors/j;->a(Ljava/lang/Runnable;)Lcom/facebook/common/executors/l;

    move-result-object v0

    return-object v0
.end method

.method public synthetic submit(Ljava/lang/Runnable;Ljava/lang/Object;)Ljava/util/concurrent/Future;
    .locals 1

    .prologue
    .line 30
    invoke-virtual {p0, p1, p2}, Lcom/facebook/common/executors/j;->b(Ljava/lang/Runnable;Ljava/lang/Object;)Lcom/facebook/common/executors/l;

    move-result-object v0

    return-object v0
.end method

.method public synthetic submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;
    .locals 1

    .prologue
    .line 30
    invoke-virtual {p0, p1}, Lcom/facebook/common/executors/j;->b(Ljava/util/concurrent/Callable;)Lcom/facebook/common/executors/l;

    move-result-object v0

    return-object v0
.end method
