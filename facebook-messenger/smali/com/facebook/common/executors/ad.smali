.class Lcom/facebook/common/executors/ad;
.super Lcom/facebook/common/executors/ac;
.source "WakingExecutorService.java"

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
        "Lcom/facebook/common/executors/ac",
        "<TV;>;",
        "Ljava/util/concurrent/RunnableFuture",
        "<TV;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/Runnable;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Runnable;",
            "TV;)V"
        }
    .end annotation

    .prologue
    .line 327
    invoke-direct {p0, p1, p2}, Lcom/facebook/common/executors/ac;-><init>(Ljava/lang/Runnable;Ljava/lang/Object;)V

    .line 328
    return-void
.end method

.method public constructor <init>(Ljava/util/concurrent/Callable;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Callable",
            "<TV;>;)V"
        }
    .end annotation

    .prologue
    .line 323
    invoke-direct {p0, p1}, Lcom/facebook/common/executors/ac;-><init>(Ljava/util/concurrent/Callable;)V

    .line 324
    return-void
.end method
