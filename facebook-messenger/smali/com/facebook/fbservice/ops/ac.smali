.class public abstract Lcom/facebook/fbservice/ops/ac;
.super Lcom/facebook/common/g/a;
.source "OperationResultFutureCallback.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/common/g/a",
        "<",
        "Lcom/facebook/fbservice/service/OperationResult;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 17
    invoke-direct {p0}, Lcom/facebook/common/g/a;-><init>()V

    return-void
.end method


# virtual methods
.method protected abstract a(Lcom/facebook/fbservice/service/ServiceException;)V
.end method

.method protected final b(Ljava/lang/Throwable;)V
    .locals 1

    .prologue
    .line 30
    instance-of v0, p1, Lcom/facebook/fbservice/service/ServiceException;

    if-eqz v0, :cond_0

    .line 31
    check-cast p1, Lcom/facebook/fbservice/service/ServiceException;

    invoke-virtual {p0, p1}, Lcom/facebook/fbservice/ops/ac;->a(Lcom/facebook/fbservice/service/ServiceException;)V

    .line 35
    :goto_0
    return-void

    .line 33
    :cond_0
    invoke-virtual {p0, p1}, Lcom/facebook/fbservice/ops/ac;->c(Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method protected c(Ljava/lang/Throwable;)V
    .locals 0

    .prologue
    .line 58
    invoke-static {p1}, Lcom/google/common/base/Throwables;->propagate(Ljava/lang/Throwable;)Ljava/lang/RuntimeException;

    .line 59
    return-void
.end method
