.class public Lcom/worklight/wlclient/api/WLFailResponse;
.super Lcom/worklight/wlclient/api/WLResponse;
.source "WLFailResponse.java"


# static fields
.field private static final JSON_KEY_ERROR_CODE:Ljava/lang/String; = "errorCode"

.field private static final JSON_KEY_ERROR_MSG:Ljava/lang/String; = "errorMsg"


# instance fields
.field protected errorCode:Lcom/worklight/wlclient/api/WLErrorCode;

.field protected errorMsg:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/worklight/wlclient/api/WLErrorCode;Ljava/lang/String;Lcom/worklight/wlclient/api/WLRequestOptions;)V
    .locals 2
    .param p1, "errorCode"    # Lcom/worklight/wlclient/api/WLErrorCode;
    .param p2, "errorMsg"    # Ljava/lang/String;
    .param p3, "requestOptions"    # Lcom/worklight/wlclient/api/WLRequestOptions;

    .prologue
    .line 47
    const/16 v0, 0x1f4

    const-string v1, ""

    invoke-direct {p0, v0, v1, p3}, Lcom/worklight/wlclient/api/WLResponse;-><init>(ILjava/lang/String;Lcom/worklight/wlclient/api/WLRequestOptions;)V

    .line 48
    invoke-virtual {p0, p1}, Lcom/worklight/wlclient/api/WLFailResponse;->setErrorCode(Lcom/worklight/wlclient/api/WLErrorCode;)V

    .line 49
    invoke-virtual {p0, p2}, Lcom/worklight/wlclient/api/WLFailResponse;->setErrorMsg(Ljava/lang/String;)V

    .line 50
    return-void
.end method

.method public constructor <init>(Lcom/worklight/wlclient/api/WLResponse;)V
    .locals 0
    .param p1, "wlResponse"    # Lcom/worklight/wlclient/api/WLResponse;

    .prologue
    .line 42
    invoke-direct {p0, p1}, Lcom/worklight/wlclient/api/WLResponse;-><init>(Lcom/worklight/wlclient/api/WLResponse;)V

    .line 43
    invoke-direct {p0}, Lcom/worklight/wlclient/api/WLFailResponse;->parseErrorFromResponse()V

    .line 44
    return-void
.end method

.method public constructor <init>(Lorg/apache/http/HttpResponse;)V
    .locals 0
    .param p1, "httpResponse"    # Lorg/apache/http/HttpResponse;

    .prologue
    .line 37
    invoke-direct {p0, p1}, Lcom/worklight/wlclient/api/WLResponse;-><init>(Lorg/apache/http/HttpResponse;)V

    .line 38
    invoke-direct {p0}, Lcom/worklight/wlclient/api/WLFailResponse;->parseErrorFromResponse()V

    .line 39
    return-void
.end method

.method private parseErrorFromResponse()V
    .locals 6

    .prologue
    .line 78
    invoke-virtual {p0}, Lcom/worklight/wlclient/api/WLFailResponse;->getResponseText()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {p0}, Lcom/worklight/wlclient/api/WLFailResponse;->getResponseText()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_1

    .line 80
    :try_start_0
    invoke-virtual {p0}, Lcom/worklight/wlclient/api/WLFailResponse;->getResponseText()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/worklight/common/WLUtils;->convertStringToJSON(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    .line 82
    .local v1, "jsonResponse":Lorg/json/JSONObject;
    sget-object v2, Lcom/worklight/wlclient/api/WLErrorCode;->UNEXPECTED_ERROR:Lcom/worklight/wlclient/api/WLErrorCode;

    iput-object v2, p0, Lcom/worklight/wlclient/api/WLFailResponse;->errorCode:Lcom/worklight/wlclient/api/WLErrorCode;

    .line 83
    const-string v2, "errorCode"

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 85
    const-string v2, "errorCode"

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/worklight/wlclient/api/WLErrorCode;->valueOf(Ljava/lang/String;)Lcom/worklight/wlclient/api/WLErrorCode;

    move-result-object v2

    iput-object v2, p0, Lcom/worklight/wlclient/api/WLFailResponse;->errorCode:Lcom/worklight/wlclient/api/WLErrorCode;

    .line 88
    :cond_0
    const-string v2, "errorMsg"

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 89
    const-string v2, "errorMsg"

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lcom/worklight/wlclient/api/WLFailResponse;->errorMsg:Ljava/lang/String;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 102
    .end local v1    # "jsonResponse":Lorg/json/JSONObject;
    :cond_1
    :goto_0
    return-void

    .line 92
    :catch_0
    move-exception v0

    .line 93
    .local v0, "e":Lorg/json/JSONException;
    const-string v2, "Cannot retrieve errorCode message from response. Response text is:%s\'"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    invoke-virtual {p0}, Lcom/worklight/wlclient/api/WLFailResponse;->getResponseText()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v3, v4

    invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v0}, Lcom/worklight/common/WLUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 94
    sget-object v2, Lcom/worklight/wlclient/api/WLErrorCode;->UNEXPECTED_ERROR:Lcom/worklight/wlclient/api/WLErrorCode;

    iput-object v2, p0, Lcom/worklight/wlclient/api/WLFailResponse;->errorCode:Lcom/worklight/wlclient/api/WLErrorCode;

    .line 95
    invoke-virtual {p0}, Lcom/worklight/wlclient/api/WLFailResponse;->getStatus()I

    move-result v2

    const/16 v3, 0x1f4

    if-lt v2, v3, :cond_2

    .line 96
    sget-object v2, Lcom/worklight/wlclient/api/WLErrorCode;->UNRESPONSIVE_HOST:Lcom/worklight/wlclient/api/WLErrorCode;

    iput-object v2, p0, Lcom/worklight/wlclient/api/WLFailResponse;->errorCode:Lcom/worklight/wlclient/api/WLErrorCode;

    goto :goto_0

    .line 97
    :cond_2
    invoke-virtual {p0}, Lcom/worklight/wlclient/api/WLFailResponse;->getStatus()I

    move-result v2

    const/16 v3, 0x198

    if-lt v2, v3, :cond_1

    .line 98
    sget-object v2, Lcom/worklight/wlclient/api/WLErrorCode;->REQUEST_TIMEOUT:Lcom/worklight/wlclient/api/WLErrorCode;

    iput-object v2, p0, Lcom/worklight/wlclient/api/WLFailResponse;->errorCode:Lcom/worklight/wlclient/api/WLErrorCode;

    goto :goto_0
.end method


# virtual methods
.method public getErrorCode()Lcom/worklight/wlclient/api/WLErrorCode;
    .locals 1

    .prologue
    .line 56
    iget-object v0, p0, Lcom/worklight/wlclient/api/WLFailResponse;->errorCode:Lcom/worklight/wlclient/api/WLErrorCode;

    return-object v0
.end method

.method public getErrorMsg()Ljava/lang/String;
    .locals 1

    .prologue
    .line 67
    iget-object v0, p0, Lcom/worklight/wlclient/api/WLFailResponse;->errorMsg:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 68
    iget-object v0, p0, Lcom/worklight/wlclient/api/WLFailResponse;->errorCode:Lcom/worklight/wlclient/api/WLErrorCode;

    invoke-virtual {v0}, Lcom/worklight/wlclient/api/WLErrorCode;->getDescription()Ljava/lang/String;

    move-result-object v0

    .line 70
    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/worklight/wlclient/api/WLFailResponse;->errorMsg:Ljava/lang/String;

    goto :goto_0
.end method

.method public setErrorCode(Lcom/worklight/wlclient/api/WLErrorCode;)V
    .locals 0
    .param p1, "errorCode"    # Lcom/worklight/wlclient/api/WLErrorCode;

    .prologue
    .line 60
    iput-object p1, p0, Lcom/worklight/wlclient/api/WLFailResponse;->errorCode:Lcom/worklight/wlclient/api/WLErrorCode;

    .line 61
    return-void
.end method

.method public setErrorMsg(Ljava/lang/String;)V
    .locals 0
    .param p1, "errorMsg"    # Ljava/lang/String;

    .prologue
    .line 74
    iput-object p1, p0, Lcom/worklight/wlclient/api/WLFailResponse;->errorMsg:Ljava/lang/String;

    .line 75
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 106
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-super {p0}, Lcom/worklight/wlclient/api/WLResponse;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 107
    const-string v1, " WLFailResponse [errorMsg="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/worklight/wlclient/api/WLFailResponse;->errorMsg:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 108
    const-string v1, ", errorCode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/worklight/wlclient/api/WLFailResponse;->errorCode:Lcom/worklight/wlclient/api/WLErrorCode;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 106
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
