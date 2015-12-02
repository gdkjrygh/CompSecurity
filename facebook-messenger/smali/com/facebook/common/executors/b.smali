.class public Lcom/facebook/common/executors/b;
.super Ljava/lang/Object;
.source "DefaultAndroidThreadUtil.java"

# interfaces
.implements Lcom/facebook/common/executors/a;


# instance fields
.field private volatile a:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .prologue
    .line 36
    iget-boolean v0, p0, Lcom/facebook/common/executors/b;->a:Z

    if-nez v0, :cond_0

    .line 37
    invoke-virtual {p0}, Lcom/facebook/common/executors/b;->c()Z

    move-result v0

    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkState(Z)V

    .line 39
    :cond_0
    return-void
.end method

.method public a(J)V
    .locals 0

    .prologue
    .line 196
    invoke-static {p1, p2}, Ljava/lang/Thread;->sleep(J)V

    .line 197
    return-void
.end method

.method public a(Lcom/google/common/d/a/s;Lcom/google/common/d/a/h;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/common/d/a/s",
            "<TT;>;",
            "Lcom/google/common/d/a/h",
            "<-TT;>;)V"
        }
    .end annotation

    .prologue
    .line 184
    invoke-static {p1}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 185
    invoke-static {p2}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 187
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    .line 188
    const-string v1, "Must be called on a handler thread"

    invoke-static {v0, v1}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 190
    new-instance v0, Lcom/facebook/common/executors/j;

    new-instance v1, Landroid/os/Handler;

    invoke-direct {v1}, Landroid/os/Handler;-><init>()V

    invoke-direct {v0, v1}, Lcom/facebook/common/executors/j;-><init>(Landroid/os/Handler;)V

    .line 191
    invoke-static {p1, p2, v0}, Lcom/google/common/d/a/i;->a(Lcom/google/common/d/a/s;Lcom/google/common/d/a/h;Ljava/util/concurrent/Executor;)V

    .line 192
    return-void
.end method

.method public a(Ljava/lang/Runnable;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 72
    invoke-virtual {p0}, Lcom/facebook/common/executors/b;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 73
    new-instance v0, Lcom/facebook/common/a/a;

    invoke-direct {v0, p1}, Lcom/facebook/common/a/a;-><init>(Ljava/lang/Runnable;)V

    .line 74
    invoke-virtual {v0}, Lcom/facebook/common/a/a;->a()V

    .line 78
    :goto_0
    return-void

    .line 76
    :cond_0
    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    goto :goto_0
.end method

.method public a(Ljava/lang/Runnable;J)V
    .locals 2

    .prologue
    .line 155
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 156
    invoke-virtual {v0, p1, p2, p3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 157
    return-void
.end method

.method public a(Ljava/lang/String;Ljava/lang/Runnable;)V
    .locals 3

    .prologue
    .line 120
    new-instance v0, Landroid/os/HandlerThread;

    invoke-direct {v0, p1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    .line 121
    invoke-virtual {v0}, Landroid/os/HandlerThread;->start()V

    .line 122
    new-instance v1, Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 123
    new-instance v2, Lcom/facebook/common/executors/c;

    invoke-direct {v2, p0, p2, v0}, Lcom/facebook/common/executors/c;-><init>(Lcom/facebook/common/executors/b;Ljava/lang/Runnable;Landroid/os/HandlerThread;)V

    .line 133
    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 134
    return-void
.end method

.method public b()V
    .locals 1

    .prologue
    .line 46
    iget-boolean v0, p0, Lcom/facebook/common/executors/b;->a:Z

    if-nez v0, :cond_0

    .line 47
    invoke-virtual {p0}, Lcom/facebook/common/executors/b;->c()Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x1

    :goto_0
    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkState(Z)V

    .line 49
    :cond_0
    return-void

    .line 47
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public b(Ljava/lang/Runnable;)V
    .locals 2

    .prologue
    .line 89
    invoke-virtual {p0}, Lcom/facebook/common/executors/b;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 90
    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    .line 95
    :goto_0
    return-void

    .line 92
    :cond_0
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 93
    invoke-virtual {v0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_0
.end method

.method public c(Ljava/lang/Runnable;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 107
    new-instance v0, Lcom/facebook/common/a/a;

    invoke-direct {v0, p1}, Lcom/facebook/common/a/a;-><init>(Ljava/lang/Runnable;)V

    .line 108
    invoke-virtual {v0}, Lcom/facebook/common/a/a;->a()V

    .line 109
    return-void
.end method

.method public c()Z
    .locals 2

    .prologue
    .line 58
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public d(Ljava/lang/Runnable;)V
    .locals 2

    .prologue
    .line 143
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 144
    invoke-virtual {v0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 145
    return-void
.end method
