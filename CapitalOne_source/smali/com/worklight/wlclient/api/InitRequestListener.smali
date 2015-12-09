.class Lcom/worklight/wlclient/api/InitRequestListener;
.super Ljava/lang/Object;
.source "WLClient.java"

# interfaces
.implements Lcom/worklight/wlclient/WLRequestListener;


# instance fields
.field private wlClient:Lcom/worklight/wlclient/api/WLClient;


# direct methods
.method public constructor <init>(Lcom/worklight/wlclient/api/WLClient;)V
    .locals 0
    .param p1, "wlClient"    # Lcom/worklight/wlclient/api/WLClient;

    .prologue
    .line 211
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 212
    iput-object p1, p0, Lcom/worklight/wlclient/api/InitRequestListener;->wlClient:Lcom/worklight/wlclient/api/WLClient;

    .line 213
    return-void
.end method


# virtual methods
.method public onFailure(Lcom/worklight/wlclient/api/WLFailResponse;)V
    .locals 1
    .param p1, "failResponse"    # Lcom/worklight/wlclient/api/WLFailResponse;

    .prologue
    .line 217
    invoke-virtual {p1}, Lcom/worklight/wlclient/api/WLFailResponse;->getOptions()Lcom/worklight/wlclient/api/WLRequestOptions;

    move-result-object v0

    invoke-virtual {v0}, Lcom/worklight/wlclient/api/WLRequestOptions;->getResponseListener()Lcom/worklight/wlclient/api/WLResponseListener;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/worklight/wlclient/api/WLResponseListener;->onFailure(Lcom/worklight/wlclient/api/WLFailResponse;)V

    .line 218
    return-void
.end method

.method public onSuccess(Lcom/worklight/wlclient/api/WLResponse;)V
    .locals 2
    .param p1, "response"    # Lcom/worklight/wlclient/api/WLResponse;

    .prologue
    .line 222
    iget-object v0, p0, Lcom/worklight/wlclient/api/InitRequestListener;->wlClient:Lcom/worklight/wlclient/api/WLClient;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/worklight/wlclient/api/WLClient;->setInitialized(Z)V

    .line 223
    invoke-virtual {p1}, Lcom/worklight/wlclient/api/WLResponse;->getOptions()Lcom/worklight/wlclient/api/WLRequestOptions;

    move-result-object v0

    invoke-virtual {v0}, Lcom/worklight/wlclient/api/WLRequestOptions;->getResponseListener()Lcom/worklight/wlclient/api/WLResponseListener;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/worklight/wlclient/api/WLResponseListener;->onSuccess(Lcom/worklight/wlclient/api/WLResponse;)V

    .line 224
    return-void
.end method
