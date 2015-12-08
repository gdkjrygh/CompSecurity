.class public Lcom/worklight/wlclient/api/WLProcedureInvocationResponse;
.super Lcom/worklight/wlclient/api/WLProcedureInvocationResult;
.source "WLProcedureInvocationResponse.java"


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# direct methods
.method public constructor <init>(Lcom/worklight/wlclient/api/WLResponse;)V
    .locals 0
    .param p1, "response"    # Lcom/worklight/wlclient/api/WLResponse;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 31
    invoke-direct {p0, p1}, Lcom/worklight/wlclient/api/WLProcedureInvocationResult;-><init>(Lcom/worklight/wlclient/api/WLResponse;)V

    .line 32
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
    .line 38
    invoke-super {p0}, Lcom/worklight/wlclient/api/WLProcedureInvocationResult;->getResult()Lorg/json/JSONObject;

    move-result-object v0

    return-object v0
.end method
