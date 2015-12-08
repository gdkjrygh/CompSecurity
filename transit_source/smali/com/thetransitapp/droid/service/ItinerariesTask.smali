.class public Lcom/thetransitapp/droid/service/ItinerariesTask;
.super Lcom/thetransitapp/droid/service/BaseServiceTask;
.source "ItinerariesTask.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/thetransitapp/droid/service/BaseServiceTask",
        "<",
        "Lcom/thetransitapp/droid/model/DetailRequest;",
        ">;"
    }
.end annotation


# instance fields
.field private final callback:Lcom/thetransitapp/droid/service/ServiceCallback;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/thetransitapp/droid/service/ServiceCallback",
            "<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field

.field private final request:Lcom/thetransitapp/droid/model/DetailRequest;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/thetransitapp/droid/model/DetailRequest;Lcom/thetransitapp/droid/service/ServiceCallback;)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "request"    # Lcom/thetransitapp/droid/model/DetailRequest;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/thetransitapp/droid/model/DetailRequest;",
            "Lcom/thetransitapp/droid/service/ServiceCallback",
            "<",
            "Ljava/lang/Void;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 13
    .local p3, "callback":Lcom/thetransitapp/droid/service/ServiceCallback;, "Lcom/thetransitapp/droid/service/ServiceCallback<Ljava/lang/Void;>;"
    const v0, 0x7f0a0055

    invoke-direct {p0, p1, v0}, Lcom/thetransitapp/droid/service/BaseServiceTask;-><init>(Landroid/content/Context;I)V

    .line 15
    iput-object p2, p0, Lcom/thetransitapp/droid/service/ItinerariesTask;->request:Lcom/thetransitapp/droid/model/DetailRequest;

    .line 16
    iput-object p3, p0, Lcom/thetransitapp/droid/service/ItinerariesTask;->callback:Lcom/thetransitapp/droid/service/ServiceCallback;

    .line 17
    return-void
.end method


# virtual methods
.method public call()Lcom/thetransitapp/droid/model/DetailRequest;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .prologue
    .line 21
    invoke-super {p0}, Lcom/thetransitapp/droid/service/BaseServiceTask;->getTransitSource()Lcom/thetransitapp/droid/data/TransitSource;

    move-result-object v0

    iget-object v1, p0, Lcom/thetransitapp/droid/service/ItinerariesTask;->request:Lcom/thetransitapp/droid/model/DetailRequest;

    invoke-interface {v0, v1}, Lcom/thetransitapp/droid/data/TransitSource;->loadDetails(Lcom/thetransitapp/droid/model/DetailRequest;)Lcom/thetransitapp/droid/model/DetailRequest;

    move-result-object v0

    return-object v0
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
    invoke-virtual {p0}, Lcom/thetransitapp/droid/service/ItinerariesTask;->call()Lcom/thetransitapp/droid/model/DetailRequest;

    move-result-object v0

    return-object v0
.end method

.method protected onSuccess(Lcom/thetransitapp/droid/model/DetailRequest;)V
    .locals 2
    .param p1, "result"    # Lcom/thetransitapp/droid/model/DetailRequest;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .prologue
    .line 26
    invoke-super {p0, p1}, Lcom/thetransitapp/droid/service/BaseServiceTask;->onSuccess(Ljava/lang/Object;)V

    .line 28
    iget-object v0, p0, Lcom/thetransitapp/droid/service/ItinerariesTask;->callback:Lcom/thetransitapp/droid/service/ServiceCallback;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/thetransitapp/droid/service/ServiceCallback;->onResult(Ljava/lang/Object;)V

    .line 29
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
    check-cast p1, Lcom/thetransitapp/droid/model/DetailRequest;

    invoke-virtual {p0, p1}, Lcom/thetransitapp/droid/service/ItinerariesTask;->onSuccess(Lcom/thetransitapp/droid/model/DetailRequest;)V

    return-void
.end method
