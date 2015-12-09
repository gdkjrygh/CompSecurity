.class public Lcom/worklight/wlclient/api/WLProcedureInvocationResult;
.super Lcom/worklight/wlclient/api/WLResponse;
.source "WLProcedureInvocationResult.java"


# static fields
.field private static final JSON_KEY_IS_SUCCESSFUL:Ljava/lang/String; = "isSuccessful"


# instance fields
.field private jsonResult:Lorg/json/JSONObject;


# direct methods
.method public constructor <init>(Lcom/worklight/wlclient/api/WLResponse;)V
    .locals 0
    .param p1, "response"    # Lcom/worklight/wlclient/api/WLResponse;

    .prologue
    .line 34
    invoke-direct {p0, p1}, Lcom/worklight/wlclient/api/WLResponse;-><init>(Lcom/worklight/wlclient/api/WLResponse;)V

    .line 35
    return-void
.end method


# virtual methods
.method public getResult()Lorg/json/JSONObject;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .prologue
    .line 48
    iget-object v0, p0, Lcom/worklight/wlclient/api/WLProcedureInvocationResult;->jsonResult:Lorg/json/JSONObject;

    if-nez v0, :cond_0

    .line 49
    iget-object v0, p0, Lcom/worklight/wlclient/api/WLProcedureInvocationResult;->responseText:Ljava/lang/String;

    invoke-static {v0}, Lcom/worklight/common/WLUtils;->convertStringToJSON(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    iput-object v0, p0, Lcom/worklight/wlclient/api/WLProcedureInvocationResult;->jsonResult:Lorg/json/JSONObject;

    .line 51
    :cond_0
    iget-object v0, p0, Lcom/worklight/wlclient/api/WLProcedureInvocationResult;->jsonResult:Lorg/json/JSONObject;

    return-object v0
.end method

.method public isSuccessful()Z
    .locals 3

    .prologue
    .line 38
    const/4 v0, 0x0

    .line 40
    .local v0, "isSuccessful":Z
    :try_start_0
    invoke-virtual {p0}, Lcom/worklight/wlclient/api/WLProcedureInvocationResult;->getResult()Lorg/json/JSONObject;

    move-result-object v1

    const-string v2, "isSuccessful"

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    .line 44
    :goto_0
    return v0

    .line 41
    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 56
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "WLProcedureInvocationResult [isSuccessful="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/worklight/wlclient/api/WLProcedureInvocationResult;->isSuccessful()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 57
    const-string v1, ", result="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/worklight/wlclient/api/WLProcedureInvocationResult;->jsonResult:Lorg/json/JSONObject;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 56
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
