.class public final Lcom/worklight/wlclient/api/WLProcedureInvocationFailResponse;
.super Lcom/worklight/wlclient/api/WLFailResponse;
.source "WLProcedureInvocationFailResponse.java"


# static fields
.field private static final JSON_KEY_ERROR_MESSAGES:Ljava/lang/String; = "errors"


# instance fields
.field private jsonResult:Lorg/json/JSONObject;


# direct methods
.method public constructor <init>(Lcom/worklight/wlclient/api/WLFailResponse;)V
    .locals 1
    .param p1, "response"    # Lcom/worklight/wlclient/api/WLFailResponse;

    .prologue
    .line 44
    invoke-direct {p0, p1}, Lcom/worklight/wlclient/api/WLFailResponse;-><init>(Lcom/worklight/wlclient/api/WLResponse;)V

    .line 45
    invoke-virtual {p1}, Lcom/worklight/wlclient/api/WLFailResponse;->getErrorCode()Lcom/worklight/wlclient/api/WLErrorCode;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/worklight/wlclient/api/WLProcedureInvocationFailResponse;->setErrorCode(Lcom/worklight/wlclient/api/WLErrorCode;)V

    .line 46
    invoke-virtual {p1}, Lcom/worklight/wlclient/api/WLFailResponse;->getErrorMsg()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/worklight/wlclient/api/WLProcedureInvocationFailResponse;->setErrorMsg(Ljava/lang/String;)V

    .line 47
    return-void
.end method

.method public constructor <init>(Lcom/worklight/wlclient/api/WLResponse;)V
    .locals 0
    .param p1, "response"    # Lcom/worklight/wlclient/api/WLResponse;

    .prologue
    .line 40
    invoke-direct {p0, p1}, Lcom/worklight/wlclient/api/WLFailResponse;-><init>(Lcom/worklight/wlclient/api/WLResponse;)V

    .line 41
    return-void
.end method

.method public constructor <init>(Lorg/apache/http/HttpResponse;)V
    .locals 0
    .param p1, "httpResponse"    # Lorg/apache/http/HttpResponse;

    .prologue
    .line 36
    invoke-direct {p0, p1}, Lcom/worklight/wlclient/api/WLFailResponse;-><init>(Lorg/apache/http/HttpResponse;)V

    .line 37
    return-void
.end method


# virtual methods
.method public getJSONResult()Lorg/json/JSONObject;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 71
    invoke-virtual {p0}, Lcom/worklight/wlclient/api/WLProcedureInvocationFailResponse;->getResult()Lorg/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method public getProcedureInvocationErrors()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 50
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 52
    .local v0, "errors":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    :try_start_0
    invoke-virtual {p0}, Lcom/worklight/wlclient/api/WLProcedureInvocationFailResponse;->getResult()Lorg/json/JSONObject;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Lcom/worklight/wlclient/api/WLProcedureInvocationFailResponse;->getResult()Lorg/json/JSONObject;

    move-result-object v1

    const-string v2, "errors"

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 53
    invoke-virtual {p0}, Lcom/worklight/wlclient/api/WLProcedureInvocationFailResponse;->getResult()Lorg/json/JSONObject;

    move-result-object v1

    const-string v2, "errors"

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v1

    invoke-static {v1}, Lcom/worklight/common/WLUtils;->convertJSONArrayToList(Lorg/json/JSONArray;)Ljava/util/List;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 59
    :cond_0
    :goto_0
    return-object v0

    .line 56
    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method public getResult()Lorg/json/JSONObject;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .prologue
    .line 63
    iget-object v0, p0, Lcom/worklight/wlclient/api/WLProcedureInvocationFailResponse;->jsonResult:Lorg/json/JSONObject;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/worklight/wlclient/api/WLProcedureInvocationFailResponse;->responseText:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/worklight/wlclient/api/WLProcedureInvocationFailResponse;->responseText:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_0

    .line 64
    iget-object v0, p0, Lcom/worklight/wlclient/api/WLProcedureInvocationFailResponse;->responseText:Ljava/lang/String;

    invoke-static {v0}, Lcom/worklight/common/WLUtils;->convertStringToJSON(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    iput-object v0, p0, Lcom/worklight/wlclient/api/WLProcedureInvocationFailResponse;->jsonResult:Lorg/json/JSONObject;

    .line 66
    :cond_0
    iget-object v0, p0, Lcom/worklight/wlclient/api/WLProcedureInvocationFailResponse;->jsonResult:Lorg/json/JSONObject;

    return-object v0
.end method
