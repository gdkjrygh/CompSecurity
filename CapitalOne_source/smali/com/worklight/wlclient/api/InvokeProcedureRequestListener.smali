.class Lcom/worklight/wlclient/api/InvokeProcedureRequestListener;
.super Ljava/lang/Object;
.source "WLClient.java"

# interfaces
.implements Lcom/worklight/wlclient/WLRequestListener;


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 246
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailure(Lcom/worklight/wlclient/api/WLFailResponse;)V
    .locals 2
    .param p1, "failResponse"    # Lcom/worklight/wlclient/api/WLFailResponse;

    .prologue
    .line 250
    new-instance v0, Lcom/worklight/wlclient/api/WLProcedureInvocationFailResponse;

    invoke-direct {v0, p1}, Lcom/worklight/wlclient/api/WLProcedureInvocationFailResponse;-><init>(Lcom/worklight/wlclient/api/WLFailResponse;)V

    .line 251
    .local v0, "pifResponse":Lcom/worklight/wlclient/api/WLProcedureInvocationFailResponse;
    invoke-virtual {p1}, Lcom/worklight/wlclient/api/WLFailResponse;->getOptions()Lcom/worklight/wlclient/api/WLRequestOptions;

    move-result-object v1

    invoke-virtual {v1}, Lcom/worklight/wlclient/api/WLRequestOptions;->getResponseListener()Lcom/worklight/wlclient/api/WLResponseListener;

    move-result-object v1

    invoke-interface {v1, v0}, Lcom/worklight/wlclient/api/WLResponseListener;->onFailure(Lcom/worklight/wlclient/api/WLFailResponse;)V

    .line 252
    return-void
.end method

.method public onSuccess(Lcom/worklight/wlclient/api/WLResponse;)V
    .locals 7
    .param p1, "response"    # Lcom/worklight/wlclient/api/WLResponse;

    .prologue
    .line 257
    :try_start_0
    new-instance v1, Lcom/worklight/wlclient/api/WLProcedureInvocationResult;

    invoke-direct {v1, p1}, Lcom/worklight/wlclient/api/WLProcedureInvocationResult;-><init>(Lcom/worklight/wlclient/api/WLResponse;)V

    .line 258
    .local v1, "piResponse":Lcom/worklight/wlclient/api/WLProcedureInvocationResult;
    invoke-virtual {v1}, Lcom/worklight/wlclient/api/WLProcedureInvocationResult;->isSuccessful()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 259
    invoke-virtual {v1}, Lcom/worklight/wlclient/api/WLProcedureInvocationResult;->getOptions()Lcom/worklight/wlclient/api/WLRequestOptions;

    move-result-object v3

    invoke-virtual {v3}, Lcom/worklight/wlclient/api/WLRequestOptions;->getResponseListener()Lcom/worklight/wlclient/api/WLResponseListener;

    move-result-object v3

    invoke-interface {v3, v1}, Lcom/worklight/wlclient/api/WLResponseListener;->onSuccess(Lcom/worklight/wlclient/api/WLResponse;)V

    .line 274
    .end local v1    # "piResponse":Lcom/worklight/wlclient/api/WLProcedureInvocationResult;
    :goto_0
    return-void

    .line 262
    .restart local v1    # "piResponse":Lcom/worklight/wlclient/api/WLProcedureInvocationResult;
    :cond_0
    new-instance v2, Lcom/worklight/wlclient/api/WLProcedureInvocationFailResponse;

    invoke-direct {v2, p1}, Lcom/worklight/wlclient/api/WLProcedureInvocationFailResponse;-><init>(Lcom/worklight/wlclient/api/WLResponse;)V

    .line 263
    .local v2, "pifResponse":Lcom/worklight/wlclient/api/WLProcedureInvocationFailResponse;
    sget-object v3, Lcom/worklight/wlclient/api/WLErrorCode;->PROCEDURE_ERROR:Lcom/worklight/wlclient/api/WLErrorCode;

    invoke-virtual {v2, v3}, Lcom/worklight/wlclient/api/WLProcedureInvocationFailResponse;->setErrorCode(Lcom/worklight/wlclient/api/WLErrorCode;)V

    .line 264
    invoke-virtual {v2}, Lcom/worklight/wlclient/api/WLProcedureInvocationFailResponse;->getOptions()Lcom/worklight/wlclient/api/WLRequestOptions;

    move-result-object v3

    invoke-virtual {v3}, Lcom/worklight/wlclient/api/WLRequestOptions;->getResponseListener()Lcom/worklight/wlclient/api/WLResponseListener;

    move-result-object v3

    invoke-interface {v3, v2}, Lcom/worklight/wlclient/api/WLResponseListener;->onFailure(Lcom/worklight/wlclient/api/WLFailResponse;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 267
    .end local v1    # "piResponse":Lcom/worklight/wlclient/api/WLProcedureInvocationResult;
    .end local v2    # "pifResponse":Lcom/worklight/wlclient/api/WLProcedureInvocationFailResponse;
    :catch_0
    move-exception v0

    .line 269
    .local v0, "e":Ljava/lang/Exception;
    new-instance v2, Lcom/worklight/wlclient/api/WLProcedureInvocationFailResponse;

    invoke-direct {v2, p1}, Lcom/worklight/wlclient/api/WLProcedureInvocationFailResponse;-><init>(Lcom/worklight/wlclient/api/WLResponse;)V

    .line 270
    .restart local v2    # "pifResponse":Lcom/worklight/wlclient/api/WLProcedureInvocationFailResponse;
    sget-object v3, Lcom/worklight/wlclient/api/WLErrorCode;->UNEXPECTED_ERROR:Lcom/worklight/wlclient/api/WLErrorCode;

    invoke-virtual {v2, v3}, Lcom/worklight/wlclient/api/WLProcedureInvocationFailResponse;->setErrorCode(Lcom/worklight/wlclient/api/WLErrorCode;)V

    .line 271
    const-string v3, "Error processing response. Error is \'%s\'."

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v6

    aput-object v6, v4, v5

    invoke-static {v3, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/worklight/wlclient/api/WLProcedureInvocationFailResponse;->setErrorMsg(Ljava/lang/String;)V

    .line 272
    invoke-virtual {v2}, Lcom/worklight/wlclient/api/WLProcedureInvocationFailResponse;->getOptions()Lcom/worklight/wlclient/api/WLRequestOptions;

    move-result-object v3

    invoke-virtual {v3}, Lcom/worklight/wlclient/api/WLRequestOptions;->getResponseListener()Lcom/worklight/wlclient/api/WLResponseListener;

    move-result-object v3

    invoke-interface {v3, v2}, Lcom/worklight/wlclient/api/WLResponseListener;->onFailure(Lcom/worklight/wlclient/api/WLFailResponse;)V

    goto :goto_0
.end method
