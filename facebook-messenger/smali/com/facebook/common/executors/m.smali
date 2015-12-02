.class Lcom/facebook/common/executors/m;
.super Lcom/facebook/common/executors/l;
.source "HandlerExecutorServiceImpl.java"

# interfaces
.implements Ljava/util/concurrent/RunnableFuture;


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0x9
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<V:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/facebook/common/executors/l",
        "<TV;>;",
        "Ljava/util/concurrent/RunnableFuture",
        "<TV;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Landroid/os/Handler;Ljava/lang/Runnable;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/os/Handler;",
            "Ljava/lang/Runnable;",
            "TV;)V"
        }
    .end annotation

    .prologue
    .line 288
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/common/executors/l;-><init>(Landroid/os/Handler;Ljava/lang/Runnable;Ljava/lang/Object;)V

    .line 289
    return-void
.end method

.method public constructor <init>(Landroid/os/Handler;Ljava/util/concurrent/Callable;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/os/Handler;",
            "Ljava/util/concurrent/Callable",
            "<TV;>;)V"
        }
    .end annotation

    .prologue
    .line 284
    invoke-direct {p0, p1, p2}, Lcom/facebook/common/executors/l;-><init>(Landroid/os/Handler;Ljava/util/concurrent/Callable;)V

    .line 285
    return-void
.end method
