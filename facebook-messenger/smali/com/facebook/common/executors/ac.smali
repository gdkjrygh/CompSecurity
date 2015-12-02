.class Lcom/facebook/common/executors/ac;
.super Lcom/google/common/d/a/g;
.source "WakingExecutorService.java"

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
        "Lcom/google/common/d/a/g",
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
.method public constructor <init>(Ljava/lang/Runnable;Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Runnable;",
            "TV;)V"
        }
    .end annotation

    .prologue
    .line 280
    invoke-direct {p0}, Lcom/google/common/d/a/g;-><init>()V

    .line 281
    invoke-static {p1, p2}, Lcom/google/common/d/a/t;->a(Ljava/lang/Runnable;Ljava/lang/Object;)Lcom/google/common/d/a/t;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/common/executors/ac;->a:Lcom/google/common/d/a/t;

    .line 282
    return-void
.end method

.method public constructor <init>(Ljava/util/concurrent/Callable;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Callable",
            "<TV;>;)V"
        }
    .end annotation

    .prologue
    .line 276
    invoke-direct {p0}, Lcom/google/common/d/a/g;-><init>()V

    .line 277
    invoke-static {p1}, Lcom/google/common/d/a/t;->a(Ljava/util/concurrent/Callable;)Lcom/google/common/d/a/t;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/common/executors/ac;->a:Lcom/google/common/d/a/t;

    .line 278
    return-void
.end method


# virtual methods
.method public a(Ljava/util/concurrent/Delayed;)I
    .locals 1

    .prologue
    .line 291
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
    .line 296
    iget-object v0, p0, Lcom/facebook/common/executors/ac;->a:Lcom/google/common/d/a/t;

    return-object v0
.end method

.method public a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V
    .locals 1

    .prologue
    .line 301
    invoke-virtual {p0}, Lcom/facebook/common/executors/ac;->a()Lcom/google/common/d/a/t;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/google/common/d/a/t;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 302
    return-void
.end method

.method protected synthetic b()Ljava/util/concurrent/Future;
    .locals 1

    .prologue
    .line 270
    invoke-virtual {p0}, Lcom/facebook/common/executors/ac;->a()Lcom/google/common/d/a/t;

    move-result-object v0

    return-object v0
.end method

.method protected synthetic c()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 270
    invoke-virtual {p0}, Lcom/facebook/common/executors/ac;->a()Lcom/google/common/d/a/t;

    move-result-object v0

    return-object v0
.end method

.method public synthetic compareTo(Ljava/lang/Object;)I
    .locals 1

    .prologue
    .line 270
    check-cast p1, Ljava/util/concurrent/Delayed;

    invoke-virtual {p0, p1}, Lcom/facebook/common/executors/ac;->a(Ljava/util/concurrent/Delayed;)I

    move-result v0

    return v0
.end method

.method public getDelay(Ljava/util/concurrent/TimeUnit;)J
    .locals 1

    .prologue
    .line 286
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public run()V
    .locals 1

    .prologue
    .line 306
    invoke-virtual {p0}, Lcom/facebook/common/executors/ac;->a()Lcom/google/common/d/a/t;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/d/a/t;->run()V

    .line 307
    return-void
.end method
