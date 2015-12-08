.class public Lcom/splunk/mint/NetSenderResponse;
.super Ljava/lang/Object;
.source "NetSenderResponse.java"


# instance fields
.field private data:Ljava/lang/String;

.field private exception:Ljava/lang/Exception;

.field private responseCode:I

.field private sentSuccessfully:Ljava/lang/Boolean;

.field private serverResponse:Ljava/lang/String;

.field private url:Ljava/lang/String;


# direct methods
.method protected constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .param p1, "url"    # Ljava/lang/String;
    .param p2, "data"    # Ljava/lang/String;

    .prologue
    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    iput-object p1, p0, Lcom/splunk/mint/NetSenderResponse;->url:Ljava/lang/String;

    .line 29
    iput-object p2, p0, Lcom/splunk/mint/NetSenderResponse;->data:Ljava/lang/String;

    .line 30
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/splunk/mint/NetSenderResponse;->sentSuccessfully:Ljava/lang/Boolean;

    .line 31
    return-void
.end method


# virtual methods
.method public getData()Ljava/lang/String;
    .locals 1

    .prologue
    .line 86
    iget-object v0, p0, Lcom/splunk/mint/NetSenderResponse;->data:Ljava/lang/String;

    return-object v0
.end method

.method public getException()Ljava/lang/Exception;
    .locals 1

    .prologue
    .line 50
    iget-object v0, p0, Lcom/splunk/mint/NetSenderResponse;->exception:Ljava/lang/Exception;

    return-object v0
.end method

.method public getResponseCode()I
    .locals 1

    .prologue
    .line 38
    iget v0, p0, Lcom/splunk/mint/NetSenderResponse;->responseCode:I

    return v0
.end method

.method public getSentSuccessfully()Ljava/lang/Boolean;
    .locals 1

    .prologue
    .line 62
    iget-object v0, p0, Lcom/splunk/mint/NetSenderResponse;->sentSuccessfully:Ljava/lang/Boolean;

    return-object v0
.end method

.method public getServerResponse()Ljava/lang/String;
    .locals 1

    .prologue
    .line 74
    iget-object v0, p0, Lcom/splunk/mint/NetSenderResponse;->serverResponse:Ljava/lang/String;

    return-object v0
.end method

.method public getUrl()Ljava/lang/String;
    .locals 1

    .prologue
    .line 98
    iget-object v0, p0, Lcom/splunk/mint/NetSenderResponse;->url:Ljava/lang/String;

    return-object v0
.end method

.method protected setData(Ljava/lang/String;)V
    .locals 0
    .param p1, "data"    # Ljava/lang/String;

    .prologue
    .line 90
    iput-object p1, p0, Lcom/splunk/mint/NetSenderResponse;->data:Ljava/lang/String;

    .line 91
    return-void
.end method

.method protected setException(Ljava/lang/Exception;)V
    .locals 0
    .param p1, "exception"    # Ljava/lang/Exception;

    .prologue
    .line 54
    iput-object p1, p0, Lcom/splunk/mint/NetSenderResponse;->exception:Ljava/lang/Exception;

    .line 55
    return-void
.end method

.method protected setResponseCode(I)V
    .locals 0
    .param p1, "responseCode"    # I

    .prologue
    .line 42
    iput p1, p0, Lcom/splunk/mint/NetSenderResponse;->responseCode:I

    .line 43
    return-void
.end method

.method protected setSentSuccessfully(Ljava/lang/Boolean;)V
    .locals 0
    .param p1, "sendSuccessfully"    # Ljava/lang/Boolean;

    .prologue
    .line 66
    iput-object p1, p0, Lcom/splunk/mint/NetSenderResponse;->sentSuccessfully:Ljava/lang/Boolean;

    .line 67
    return-void
.end method

.method protected setServerResponse(Ljava/lang/String;)V
    .locals 0
    .param p1, "serverResponse"    # Ljava/lang/String;

    .prologue
    .line 78
    iput-object p1, p0, Lcom/splunk/mint/NetSenderResponse;->serverResponse:Ljava/lang/String;

    .line 79
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 103
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "NetSenderResponse [exception="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/splunk/mint/NetSenderResponse;->exception:Ljava/lang/Exception;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", sendSuccessfully="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/splunk/mint/NetSenderResponse;->sentSuccessfully:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", serverResponse="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/splunk/mint/NetSenderResponse;->serverResponse:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", data="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/splunk/mint/NetSenderResponse;->data:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", url="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/splunk/mint/NetSenderResponse;->url:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", responseCode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/splunk/mint/NetSenderResponse;->responseCode:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
