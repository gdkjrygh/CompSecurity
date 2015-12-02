.class public Lcom/facebook/common/executors/aa;
.super Lcom/facebook/c/k;
.source "WakingExecutorService.java"


# direct methods
.method public constructor <init>(Lcom/facebook/common/executors/z;)V
    .locals 2

    .prologue
    .line 358
    sget-object v0, Lcom/facebook/common/executors/z;->a:Ljava/lang/String;

    new-instance v1, Lcom/facebook/common/executors/ab;

    invoke-direct {v1, p1}, Lcom/facebook/common/executors/ab;-><init>(Lcom/facebook/common/executors/z;)V

    invoke-direct {p0, v0, v1}, Lcom/facebook/c/k;-><init>(Ljava/lang/String;Lcom/facebook/c/b;)V

    .line 359
    return-void
.end method
