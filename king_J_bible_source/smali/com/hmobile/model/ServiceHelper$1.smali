.class Lcom/hmobile/model/ServiceHelper$1;
.super Ljava/lang/Object;
.source "ServiceHelper.java"

# interfaces
.implements Lorg/apache/http/client/HttpRequestRetryHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/hmobile/model/ServiceHelper;->getHttpClient()Lorg/apache/http/impl/client/DefaultHttpClient;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/hmobile/model/ServiceHelper;


# direct methods
.method constructor <init>(Lcom/hmobile/model/ServiceHelper;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/hmobile/model/ServiceHelper$1;->this$0:Lcom/hmobile/model/ServiceHelper;

    .line 68
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public retryRequest(Ljava/io/IOException;ILorg/apache/http/protocol/HttpContext;)Z
    .locals 3
    .param p1, "exception"    # Ljava/io/IOException;
    .param p2, "executionCount"    # I
    .param p3, "context"    # Lorg/apache/http/protocol/HttpContext;

    .prologue
    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 73
    const/4 v2, 0x2

    if-lt p2, v2, :cond_1

    .line 81
    :cond_0
    :goto_0
    return v0

    .line 76
    :cond_1
    instance-of v2, p1, Lorg/apache/http/NoHttpResponseException;

    if-eqz v2, :cond_2

    move v0, v1

    .line 77
    goto :goto_0

    .line 78
    :cond_2
    instance-of v2, p1, Lorg/apache/http/client/ClientProtocolException;

    if-eqz v2, :cond_0

    move v0, v1

    .line 79
    goto :goto_0
.end method
