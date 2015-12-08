.class public Lcom/worklight/wlclient/api/WLResponse;
.super Ljava/lang/Object;
.source "WLResponse.java"


# instance fields
.field protected requestOptions:Lcom/worklight/wlclient/api/WLRequestOptions;

.field protected responseText:Ljava/lang/String;

.field protected status:I


# direct methods
.method protected constructor <init>(ILjava/lang/String;Lcom/worklight/wlclient/api/WLRequestOptions;)V
    .locals 0
    .param p1, "status"    # I
    .param p2, "responseText"    # Ljava/lang/String;
    .param p3, "requestOptions"    # Lcom/worklight/wlclient/api/WLRequestOptions;

    .prologue
    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    iput p1, p0, Lcom/worklight/wlclient/api/WLResponse;->status:I

    .line 45
    iput-object p3, p0, Lcom/worklight/wlclient/api/WLResponse;->requestOptions:Lcom/worklight/wlclient/api/WLRequestOptions;

    .line 46
    iput-object p2, p0, Lcom/worklight/wlclient/api/WLResponse;->responseText:Ljava/lang/String;

    .line 47
    return-void
.end method

.method public constructor <init>(Lcom/worklight/wlclient/api/WLResponse;)V
    .locals 1
    .param p1, "response"    # Lcom/worklight/wlclient/api/WLResponse;

    .prologue
    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    iget v0, p1, Lcom/worklight/wlclient/api/WLResponse;->status:I

    iput v0, p0, Lcom/worklight/wlclient/api/WLResponse;->status:I

    .line 39
    iget-object v0, p1, Lcom/worklight/wlclient/api/WLResponse;->requestOptions:Lcom/worklight/wlclient/api/WLRequestOptions;

    iput-object v0, p0, Lcom/worklight/wlclient/api/WLResponse;->requestOptions:Lcom/worklight/wlclient/api/WLRequestOptions;

    .line 40
    iget-object v0, p1, Lcom/worklight/wlclient/api/WLResponse;->responseText:Ljava/lang/String;

    iput-object v0, p0, Lcom/worklight/wlclient/api/WLResponse;->responseText:Ljava/lang/String;

    .line 41
    return-void
.end method

.method public constructor <init>(Lorg/apache/http/HttpResponse;)V
    .locals 2
    .param p1, "httpResponse"    # Lorg/apache/http/HttpResponse;

    .prologue
    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    invoke-interface {p1}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;

    move-result-object v1

    invoke-interface {v1}, Lorg/apache/http/StatusLine;->getStatusCode()I

    move-result v1

    iput v1, p0, Lcom/worklight/wlclient/api/WLResponse;->status:I

    .line 31
    :try_start_0
    invoke-interface {p1}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;

    move-result-object v1

    invoke-interface {v1}, Lorg/apache/http/HttpEntity;->getContent()Ljava/io/InputStream;

    move-result-object v1

    invoke-static {v1}, Lcom/worklight/common/WLUtils;->convertStreamToString(Ljava/io/InputStream;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/worklight/wlclient/api/WLResponse;->responseText:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 35
    :goto_0
    return-void

    .line 32
    :catch_0
    move-exception v0

    .line 33
    .local v0, "e":Ljava/lang/Exception;
    const-string v1, "Exception while try to read response body"

    invoke-static {v1, v0}, Lcom/worklight/common/WLUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method


# virtual methods
.method public getInvocationContext()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 60
    iget-object v0, p0, Lcom/worklight/wlclient/api/WLResponse;->requestOptions:Lcom/worklight/wlclient/api/WLRequestOptions;

    invoke-virtual {v0}, Lcom/worklight/wlclient/api/WLRequestOptions;->getInvocationContext()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public getOptions()Lcom/worklight/wlclient/api/WLRequestOptions;
    .locals 1

    .prologue
    .line 75
    iget-object v0, p0, Lcom/worklight/wlclient/api/WLResponse;->requestOptions:Lcom/worklight/wlclient/api/WLRequestOptions;

    return-object v0
.end method

.method public getResponseText()Ljava/lang/String;
    .locals 1

    .prologue
    .line 67
    iget-object v0, p0, Lcom/worklight/wlclient/api/WLResponse;->responseText:Ljava/lang/String;

    return-object v0
.end method

.method public getStatus()I
    .locals 1

    .prologue
    .line 53
    iget v0, p0, Lcom/worklight/wlclient/api/WLResponse;->status:I

    return v0
.end method

.method public setInvocationContext(Ljava/lang/Object;)V
    .locals 1
    .param p1, "invocationContext"    # Ljava/lang/Object;

    .prologue
    .line 71
    iget-object v0, p0, Lcom/worklight/wlclient/api/WLResponse;->requestOptions:Lcom/worklight/wlclient/api/WLRequestOptions;

    invoke-virtual {v0, p1}, Lcom/worklight/wlclient/api/WLRequestOptions;->setInvocationContext(Ljava/lang/Object;)V

    .line 72
    return-void
.end method

.method public setOptions(Lcom/worklight/wlclient/api/WLRequestOptions;)V
    .locals 0
    .param p1, "wlOptions"    # Lcom/worklight/wlclient/api/WLRequestOptions;

    .prologue
    .line 79
    iput-object p1, p0, Lcom/worklight/wlclient/api/WLResponse;->requestOptions:Lcom/worklight/wlclient/api/WLRequestOptions;

    .line 80
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 84
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "WLResponse [invocationContext="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/worklight/wlclient/api/WLResponse;->requestOptions:Lcom/worklight/wlclient/api/WLRequestOptions;

    invoke-virtual {v1}, Lcom/worklight/wlclient/api/WLRequestOptions;->getInvocationContext()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 85
    const-string v1, ", responseText="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/worklight/wlclient/api/WLResponse;->responseText:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 86
    const-string v1, ", status="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/worklight/wlclient/api/WLResponse;->status:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 84
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
