.class public Lcom/facebook/fbservice/service/u;
.super Ljava/lang/Object;
.source "ErrorCodeUtil.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/lang/Throwable;)Lcom/facebook/fbservice/service/t;
    .locals 1

    .prologue
    .line 27
    invoke-static {p0}, Lcom/facebook/http/b/ax;->a(Ljava/lang/Throwable;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 28
    sget-object v0, Lcom/facebook/fbservice/service/t;->HTTP_400_AUTHENTICATION:Lcom/facebook/fbservice/service/t;

    .line 40
    :goto_0
    return-object v0

    .line 29
    :cond_0
    invoke-static {p0}, Lcom/facebook/http/b/ax;->b(Ljava/lang/Throwable;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 30
    sget-object v0, Lcom/facebook/fbservice/service/t;->HTTP_400_OTHER:Lcom/facebook/fbservice/service/t;

    goto :goto_0

    .line 31
    :cond_1
    invoke-static {p0}, Lcom/facebook/http/b/ax;->c(Ljava/lang/Throwable;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 32
    sget-object v0, Lcom/facebook/fbservice/service/t;->HTTP_500_CLASS:Lcom/facebook/fbservice/service/t;

    goto :goto_0

    .line 33
    :cond_2
    instance-of v0, p0, Lcom/facebook/http/protocol/e;

    if-eqz v0, :cond_3

    .line 34
    sget-object v0, Lcom/facebook/fbservice/service/t;->API_ERROR:Lcom/facebook/fbservice/service/t;

    goto :goto_0

    .line 35
    :cond_3
    invoke-static {p0}, Lcom/facebook/http/b/ax;->d(Ljava/lang/Throwable;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 36
    sget-object v0, Lcom/facebook/fbservice/service/t;->CONNECTION_FAILURE:Lcom/facebook/fbservice/service/t;

    goto :goto_0

    .line 37
    :cond_4
    invoke-static {p0}, Lcom/facebook/http/b/ax;->e(Ljava/lang/Throwable;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 38
    sget-object v0, Lcom/facebook/fbservice/service/t;->OUT_OF_MEMORY:Lcom/facebook/fbservice/service/t;

    goto :goto_0

    .line 40
    :cond_5
    sget-object v0, Lcom/facebook/fbservice/service/t;->OTHER:Lcom/facebook/fbservice/service/t;

    goto :goto_0
.end method

.method public static b(Ljava/lang/Throwable;)Landroid/os/Bundle;
    .locals 3

    .prologue
    .line 45
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 46
    const-string v1, "originalExceptionMessage"

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 47
    const-string v1, "originalExceptionStack"

    invoke-static {p0}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 48
    instance-of v1, p0, Lcom/facebook/fbservice/c/c;

    if-eqz v1, :cond_0

    .line 49
    check-cast p0, Lcom/facebook/fbservice/c/c;

    .line 50
    const-string v1, "result"

    invoke-interface {p0}, Lcom/facebook/fbservice/c/c;->a()Landroid/os/Parcelable;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 52
    :cond_0
    return-object v0
.end method
