.class public Lcom/facebook/common/executors/l;
.super Lcom/facebook/common/executors/k;
.source "HandlerExecutorServiceImpl.java"

# interfaces
.implements Lcom/google/common/d/a/s;
.implements Ljava/lang/Runnable;
.implements Ljava/util/concurrent/ScheduledFuture;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<V:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/facebook/common/executors/k",
        "<TV;>;",
        "Lcom/google/common/d/a/s",
        "<TV;>;",
        "Ljava/lang/Runnable;",
        "Ljava/util/concurrent/ScheduledFuture",
        "<TV;>;"
    }
.end annotation


# instance fields
.field private final a:Lcom/google/common/d/a/t;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/d/a/t",
            "<TV;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/os/Handler;Ljava/lang/Runnable;Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/os/Handler;",
            "Ljava/lang/Runnable;",
            "TV;)V"
        }
    .end annotation

    .prologue
    .line 242
    invoke-direct {p0, p1}, Lcom/facebook/common/executors/k;-><init>(Landroid/os/Handler;)V

    .line 243
    invoke-static {p2, p3}, Lcom/google/common/d/a/t;->a(Ljava/lang/Runnable;Ljava/lang/Object;)Lcom/google/common/d/a/t;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/common/executors/l;->a:Lcom/google/common/d/a/t;

    .line 244
    return-void
.end method

.method public constructor <init>(Landroid/os/Handler;Ljava/util/concurrent/Callable;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/os/Handler;",
            "Ljava/util/concurrent/Callable",
            "<TV;>;)V"
        }
    .end annotation

    .prologue
    .line 237
    invoke-direct {p0, p1}, Lcom/facebook/common/executors/k;-><init>(Landroid/os/Handler;)V

    .line 238
    invoke-static {p2}, Lcom/google/common/d/a/t;->a(Ljava/util/concurrent/Callable;)Lcom/google/common/d/a/t;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/common/executors/l;->a:Lcom/google/common/d/a/t;

    .line 239
    return-void
.end method


# virtual methods
.method public a(Ljava/util/concurrent/Delayed;)I
    .locals 1

    .prologue
    .line 258
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method protected a()Lcom/google/common/d/a/t;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/d/a/t",
            "<TV;>;"
        }
    .end annotation

    .prologue
    .line 248
    iget-object v0, p0, Lcom/facebook/common/executors/l;->a:Lcom/google/common/d/a/t;

    return-object v0
.end method

.method public a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V
    .locals 1

    .prologue
    .line 263
    invoke-virtual {p0}, Lcom/facebook/common/executors/l;->a()Lcom/google/common/d/a/t;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/google/common/d/a/t;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 264
    return-void
.end method

.method protected synthetic b()Ljava/util/concurrent/Future;
    .locals 1

    .prologue
    .line 230
    invoke-virtual {p0}, Lcom/facebook/common/executors/l;->a()Lcom/google/common/d/a/t;

    move-result-object v0

    return-object v0
.end method

.method protected synthetic c()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 230
    invoke-virtual {p0}, Lcom/facebook/common/executors/l;->a()Lcom/google/common/d/a/t;

    move-result-object v0

    return-object v0
.end method

.method public synthetic compareTo(Ljava/lang/Object;)I
    .locals 1

    .prologue
    .line 230
    check-cast p1, Ljava/util/concurrent/Delayed;

    invoke-virtual {p0, p1}, Lcom/facebook/common/executors/l;->a(Ljava/util/concurrent/Delayed;)I

    move-result v0

    return v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 230
    invoke-super {p0}, Lcom/facebook/common/executors/k;->get()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 230
    invoke-super {p0, p1, p2, p3}, Lcom/facebook/common/executors/k;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public getDelay(Ljava/util/concurrent/TimeUnit;)J
    .locals 1

    .prologue
    .line 253
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public run()V
    .locals 1

    .prologue
    .line 268
    invoke-virtual {p0}, Lcom/facebook/common/executors/l;->a()Lcom/google/common/d/a/t;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/d/a/t;->run()V

    .line 269
    return-void
.end method
