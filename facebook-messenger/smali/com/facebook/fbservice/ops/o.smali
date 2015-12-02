.class public Lcom/facebook/fbservice/ops/o;
.super Ljava/lang/Object;
.source "CriticalServiceExceptionChecker.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Exception;)Z
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 23
    instance-of v0, p1, Lcom/facebook/fbservice/service/ServiceException;

    if-nez v0, :cond_1

    .line 36
    :cond_0
    :goto_0
    return v1

    .line 27
    :cond_1
    check-cast p1, Lcom/facebook/fbservice/service/ServiceException;

    .line 28
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ServiceException;->a()Lcom/facebook/fbservice/service/t;

    move-result-object v0

    sget-object v2, Lcom/facebook/fbservice/service/t;->API_ERROR:Lcom/facebook/fbservice/service/t;

    if-ne v0, v2, :cond_0

    .line 32
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ServiceException;->b()Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/fbservice/service/OperationResult;->i()Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/http/protocol/ApiErrorResult;

    .line 33
    if-eqz v0, :cond_0

    .line 36
    invoke-virtual {v0}, Lcom/facebook/http/protocol/ApiErrorResult;->a()I

    move-result v2

    const/16 v3, 0xbe

    if-eq v2, v3, :cond_2

    invoke-virtual {v0}, Lcom/facebook/http/protocol/ApiErrorResult;->a()I

    move-result v0

    const/16 v2, 0x66

    if-ne v0, v2, :cond_3

    :cond_2
    const/4 v0, 0x1

    :goto_1
    move v1, v0

    goto :goto_0

    :cond_3
    move v0, v1

    goto :goto_1
.end method
