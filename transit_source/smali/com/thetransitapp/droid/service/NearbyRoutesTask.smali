.class public Lcom/thetransitapp/droid/service/NearbyRoutesTask;
.super Lcom/thetransitapp/droid/service/BaseServiceTask;
.source "NearbyRoutesTask.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/thetransitapp/droid/service/BaseServiceTask",
        "<",
        "Lcom/thetransitapp/droid/model/NearbyRoutesRequest;",
        ">;"
    }
.end annotation


# instance fields
.field private final callback:Lcom/thetransitapp/droid/service/ServiceCallback;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/thetransitapp/droid/service/ServiceCallback",
            "<",
            "Lcom/thetransitapp/droid/model/NearbyRoutesRequest;",
            ">;"
        }
    .end annotation
.end field

.field private connectivityManager:Landroid/net/ConnectivityManager;
    .annotation runtime Lcom/google/inject/Inject;
    .end annotation
.end field

.field private final request:Lcom/thetransitapp/droid/model/NearbyRoutesRequest;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/thetransitapp/droid/model/NearbyRoutesRequest;Lcom/thetransitapp/droid/service/ServiceCallback;)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "request"    # Lcom/thetransitapp/droid/model/NearbyRoutesRequest;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/thetransitapp/droid/model/NearbyRoutesRequest;",
            "Lcom/thetransitapp/droid/service/ServiceCallback",
            "<",
            "Lcom/thetransitapp/droid/model/NearbyRoutesRequest;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 22
    .local p3, "callback":Lcom/thetransitapp/droid/service/ServiceCallback;, "Lcom/thetransitapp/droid/service/ServiceCallback<Lcom/thetransitapp/droid/model/NearbyRoutesRequest;>;"
    const v0, 0x7f0a0054

    invoke-direct {p0, p1, v0}, Lcom/thetransitapp/droid/service/BaseServiceTask;-><init>(Landroid/content/Context;I)V

    .line 24
    iput-object p2, p0, Lcom/thetransitapp/droid/service/NearbyRoutesTask;->request:Lcom/thetransitapp/droid/model/NearbyRoutesRequest;

    .line 25
    iput-object p3, p0, Lcom/thetransitapp/droid/service/NearbyRoutesTask;->callback:Lcom/thetransitapp/droid/service/ServiceCallback;

    .line 26
    return-void
.end method


# virtual methods
.method public call()Lcom/thetransitapp/droid/model/NearbyRoutesRequest;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .prologue
    .line 30
    iget-object v1, p0, Lcom/thetransitapp/droid/service/NearbyRoutesTask;->connectivityManager:Landroid/net/ConnectivityManager;

    invoke-virtual {v1}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v0

    .line 32
    .local v0, "netInfo":Landroid/net/NetworkInfo;
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/net/NetworkInfo;->isConnectedOrConnecting()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 33
    invoke-super {p0}, Lcom/thetransitapp/droid/service/BaseServiceTask;->getTransitSource()Lcom/thetransitapp/droid/data/TransitSource;

    move-result-object v1

    iget-object v2, p0, Lcom/thetransitapp/droid/service/NearbyRoutesTask;->request:Lcom/thetransitapp/droid/model/NearbyRoutesRequest;

    invoke-interface {v1, v2}, Lcom/thetransitapp/droid/data/TransitSource;->loadNearbyRoutes(Lcom/thetransitapp/droid/model/NearbyRoutesRequest;)Lcom/thetransitapp/droid/model/NearbyRoutesRequest;

    move-result-object v1

    .line 38
    :goto_0
    return-object v1

    .line 36
    :cond_0
    iget-object v1, p0, Lcom/thetransitapp/droid/service/NearbyRoutesTask;->request:Lcom/thetransitapp/droid/model/NearbyRoutesRequest;

    sget-object v2, Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;->NO_INTERNET:Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;

    invoke-virtual {v1, v2}, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->setError(Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;)V

    .line 38
    iget-object v1, p0, Lcom/thetransitapp/droid/service/NearbyRoutesTask;->request:Lcom/thetransitapp/droid/model/NearbyRoutesRequest;

    goto :goto_0
.end method

.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .prologue
    .line 1
    invoke-virtual {p0}, Lcom/thetransitapp/droid/service/NearbyRoutesTask;->call()Lcom/thetransitapp/droid/model/NearbyRoutesRequest;

    move-result-object v0

    return-object v0
.end method

.method protected onException(Ljava/lang/Exception;)V
    .locals 2
    .param p1, "e"    # Ljava/lang/Exception;

    .prologue
    .line 50
    instance-of v0, p1, Ljava/util/concurrent/TimeoutException;

    if-eqz v0, :cond_0

    .line 51
    iget-object v0, p0, Lcom/thetransitapp/droid/service/NearbyRoutesTask;->request:Lcom/thetransitapp/droid/model/NearbyRoutesRequest;

    sget-object v1, Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;->TIMEOUT:Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;

    invoke-virtual {v0, v1}, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->setError(Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;)V

    .line 53
    iget-object v0, p0, Lcom/thetransitapp/droid/service/NearbyRoutesTask;->callback:Lcom/thetransitapp/droid/service/ServiceCallback;

    iget-object v1, p0, Lcom/thetransitapp/droid/service/NearbyRoutesTask;->request:Lcom/thetransitapp/droid/model/NearbyRoutesRequest;

    invoke-interface {v0, v1}, Lcom/thetransitapp/droid/service/ServiceCallback;->onResult(Ljava/lang/Object;)V

    .line 57
    :goto_0
    return-void

    .line 55
    :cond_0
    invoke-super {p0, p1}, Lcom/thetransitapp/droid/service/BaseServiceTask;->onException(Ljava/lang/Exception;)V

    goto :goto_0
.end method

.method protected onSuccess(Lcom/thetransitapp/droid/model/NearbyRoutesRequest;)V
    .locals 1
    .param p1, "result"    # Lcom/thetransitapp/droid/model/NearbyRoutesRequest;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .prologue
    .line 43
    invoke-super {p0, p1}, Lcom/thetransitapp/droid/service/BaseServiceTask;->onSuccess(Ljava/lang/Object;)V

    .line 45
    iget-object v0, p0, Lcom/thetransitapp/droid/service/NearbyRoutesTask;->callback:Lcom/thetransitapp/droid/service/ServiceCallback;

    invoke-interface {v0, p1}, Lcom/thetransitapp/droid/service/ServiceCallback;->onResult(Ljava/lang/Object;)V

    .line 46
    return-void
.end method

.method protected bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .prologue
    .line 1
    check-cast p1, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;

    invoke-virtual {p0, p1}, Lcom/thetransitapp/droid/service/NearbyRoutesTask;->onSuccess(Lcom/thetransitapp/droid/model/NearbyRoutesRequest;)V

    return-void
.end method
