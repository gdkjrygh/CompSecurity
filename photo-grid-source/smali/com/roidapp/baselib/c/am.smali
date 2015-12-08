.class final Lcom/roidapp/baselib/c/am;
.super Ljava/util/concurrent/locks/AbstractQueuedSynchronizer;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final a:Ljava/lang/Thread;

.field b:Ljava/lang/Runnable;

.field volatile c:J

.field final synthetic d:Lcom/roidapp/baselib/c/ak;


# direct methods
.method constructor <init>(Lcom/roidapp/baselib/c/ak;Ljava/lang/Runnable;)V
    .locals 1

    .prologue
    .line 267
    iput-object p1, p0, Lcom/roidapp/baselib/c/am;->d:Lcom/roidapp/baselib/c/ak;

    invoke-direct {p0}, Ljava/util/concurrent/locks/AbstractQueuedSynchronizer;-><init>()V

    .line 268
    iput-object p2, p0, Lcom/roidapp/baselib/c/am;->b:Ljava/lang/Runnable;

    .line 269
    invoke-virtual {p1}, Lcom/roidapp/baselib/c/ak;->a()Ljava/util/concurrent/ThreadFactory;

    move-result-object v0

    invoke-interface {v0, p0}, Ljava/util/concurrent/ThreadFactory;->newThread(Ljava/lang/Runnable;)Ljava/lang/Thread;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/baselib/c/am;->a:Ljava/lang/Thread;

    .line 270
    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    .prologue
    .line 305
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/roidapp/baselib/c/am;->tryAcquire(I)Z

    move-result v0

    return v0
.end method

.method public final b()Z
    .locals 1

    .prologue
    .line 313
    invoke-virtual {p0}, Lcom/roidapp/baselib/c/am;->isHeldExclusively()Z

    move-result v0

    return v0
.end method

.method protected final isHeldExclusively()Z
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 283
    invoke-virtual {p0}, Lcom/roidapp/baselib/c/am;->getState()I

    move-result v1

    if-ne v1, v0, :cond_0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final run()V
    .locals 1

    .prologue
    .line 274
    iget-object v0, p0, Lcom/roidapp/baselib/c/am;->d:Lcom/roidapp/baselib/c/ak;

    invoke-virtual {v0, p0}, Lcom/roidapp/baselib/c/ak;->a(Lcom/roidapp/baselib/c/am;)V

    .line 275
    return-void
.end method

.method protected final tryAcquire(I)Z
    .locals 3

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 287
    invoke-virtual {p0, v1, v0}, Lcom/roidapp/baselib/c/am;->compareAndSetState(II)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 288
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/roidapp/baselib/c/am;->setExclusiveOwnerThread(Ljava/lang/Thread;)V

    .line 291
    :goto_0
    return v0

    :cond_0
    move v0, v1

    goto :goto_0
.end method

.method protected final tryRelease(I)Z
    .locals 1

    .prologue
    .line 295
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/roidapp/baselib/c/am;->setExclusiveOwnerThread(Ljava/lang/Thread;)V

    .line 296
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/roidapp/baselib/c/am;->setState(I)V

    .line 297
    const/4 v0, 0x1

    return v0
.end method
