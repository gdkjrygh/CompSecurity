.class public Lcom/thetransitapp/droid/service/RoutingTask;
.super Lcom/thetransitapp/droid/service/BaseServiceTask;
.source "RoutingTask.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/thetransitapp/droid/service/BaseServiceTask",
        "<",
        "Lcom/thetransitapp/droid/model/RoutingRequest;",
        ">;"
    }
.end annotation


# instance fields
.field private final callback:Lcom/thetransitapp/droid/service/ServiceCallback;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/thetransitapp/droid/service/ServiceCallback",
            "<",
            "Lcom/thetransitapp/droid/model/RoutingRequest;",
            ">;"
        }
    .end annotation
.end field

.field private connectivityManager:Landroid/net/ConnectivityManager;
    .annotation runtime Lcom/google/inject/Inject;
    .end annotation
.end field

.field private final request:Lcom/thetransitapp/droid/model/RoutingRequest;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/thetransitapp/droid/model/RoutingRequest;Lcom/thetransitapp/droid/service/ServiceCallback;)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "request"    # Lcom/thetransitapp/droid/model/RoutingRequest;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/thetransitapp/droid/model/RoutingRequest;",
            "Lcom/thetransitapp/droid/service/ServiceCallback",
            "<",
            "Lcom/thetransitapp/droid/model/RoutingRequest;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 20
    .local p3, "callback":Lcom/thetransitapp/droid/service/ServiceCallback;, "Lcom/thetransitapp/droid/service/ServiceCallback<Lcom/thetransitapp/droid/model/RoutingRequest;>;"
    const v0, 0x7f0a004d

    invoke-direct {p0, p1, v0}, Lcom/thetransitapp/droid/service/BaseServiceTask;-><init>(Landroid/content/Context;I)V

    .line 22
    iput-object p2, p0, Lcom/thetransitapp/droid/service/RoutingTask;->request:Lcom/thetransitapp/droid/model/RoutingRequest;

    .line 23
    iput-object p3, p0, Lcom/thetransitapp/droid/service/RoutingTask;->callback:Lcom/thetransitapp/droid/service/ServiceCallback;

    .line 24
    return-void
.end method


# virtual methods
.method public call()Lcom/thetransitapp/droid/model/RoutingRequest;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .prologue
    .line 28
    iget-object v1, p0, Lcom/thetransitapp/droid/service/RoutingTask;->connectivityManager:Landroid/net/ConnectivityManager;

    invoke-virtual {v1}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v0

    .line 30
    .local v0, "netInfo":Landroid/net/NetworkInfo;
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/net/NetworkInfo;->isConnectedOrConnecting()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 31
    invoke-super {p0}, Lcom/thetransitapp/droid/service/BaseServiceTask;->getPlannerSource()Lcom/thetransitapp/droid/data/OnlinePlannerSource;

    move-result-object v1

    iget-object v2, p0, Lcom/thetransitapp/droid/service/RoutingTask;->request:Lcom/thetransitapp/droid/model/RoutingRequest;

    invoke-virtual {v1, v2}, Lcom/thetransitapp/droid/data/OnlinePlannerSource;->fetchRoutingItineraries(Lcom/thetransitapp/droid/model/RoutingRequest;)Lcom/thetransitapp/droid/model/RoutingRequest;

    move-result-object v1

    .line 36
    :goto_0
    return-object v1

    .line 34
    :cond_0
    iget-object v1, p0, Lcom/thetransitapp/droid/service/RoutingTask;->request:Lcom/thetransitapp/droid/model/RoutingRequest;

    sget-object v2, Lcom/thetransitapp/droid/model/RoutingRequest$ErrorType;->NO_INTERNET:Lcom/thetransitapp/droid/model/RoutingRequest$ErrorType;

    invoke-virtual {v1, v2}, Lcom/thetransitapp/droid/model/RoutingRequest;->setError(Lcom/thetransitapp/droid/model/RoutingRequest$ErrorType;)V

    .line 36
    iget-object v1, p0, Lcom/thetransitapp/droid/service/RoutingTask;->request:Lcom/thetransitapp/droid/model/RoutingRequest;

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
    invoke-virtual {p0}, Lcom/thetransitapp/droid/service/RoutingTask;->call()Lcom/thetransitapp/droid/model/RoutingRequest;

    move-result-object v0

    return-object v0
.end method

.method protected onSuccess(Lcom/thetransitapp/droid/model/RoutingRequest;)V
    .locals 1
    .param p1, "result"    # Lcom/thetransitapp/droid/model/RoutingRequest;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .prologue
    .line 41
    invoke-super {p0, p1}, Lcom/thetransitapp/droid/service/BaseServiceTask;->onSuccess(Ljava/lang/Object;)V

    .line 43
    iget-object v0, p0, Lcom/thetransitapp/droid/service/RoutingTask;->callback:Lcom/thetransitapp/droid/service/ServiceCallback;

    invoke-interface {v0, p1}, Lcom/thetransitapp/droid/service/ServiceCallback;->onResult(Ljava/lang/Object;)V

    .line 44
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
    check-cast p1, Lcom/thetransitapp/droid/model/RoutingRequest;

    invoke-virtual {p0, p1}, Lcom/thetransitapp/droid/service/RoutingTask;->onSuccess(Lcom/thetransitapp/droid/model/RoutingRequest;)V

    return-void
.end method
