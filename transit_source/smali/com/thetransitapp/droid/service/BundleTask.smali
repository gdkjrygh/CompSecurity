.class public Lcom/thetransitapp/droid/service/BundleTask;
.super Lcom/thetransitapp/droid/service/BaseServiceTask;
.source "BundleTask.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/thetransitapp/droid/service/BaseServiceTask",
        "<",
        "Lcom/thetransitapp/droid/model/BundleResponse;",
        ">;"
    }
.end annotation


# instance fields
.field private final callback:Lcom/thetransitapp/droid/service/ServiceCallback;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/thetransitapp/droid/service/ServiceCallback",
            "<",
            "Lcom/thetransitapp/droid/model/BundleResponse;",
            ">;"
        }
    .end annotation
.end field

.field private loadAll:Z

.field private final location:Landroid/location/Location;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/location/Location;ZLcom/thetransitapp/droid/service/ServiceCallback;)V
    .locals 0
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "location"    # Landroid/location/Location;
    .param p3, "loadAll"    # Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Landroid/location/Location;",
            "Z",
            "Lcom/thetransitapp/droid/service/ServiceCallback",
            "<",
            "Lcom/thetransitapp/droid/model/BundleResponse;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 14
    .local p4, "callback":Lcom/thetransitapp/droid/service/ServiceCallback;, "Lcom/thetransitapp/droid/service/ServiceCallback<Lcom/thetransitapp/droid/model/BundleResponse;>;"
    invoke-direct {p0, p1}, Lcom/thetransitapp/droid/service/BaseServiceTask;-><init>(Landroid/content/Context;)V

    .line 16
    iput-object p2, p0, Lcom/thetransitapp/droid/service/BundleTask;->location:Landroid/location/Location;

    .line 17
    iput-boolean p3, p0, Lcom/thetransitapp/droid/service/BundleTask;->loadAll:Z

    .line 18
    iput-object p4, p0, Lcom/thetransitapp/droid/service/BundleTask;->callback:Lcom/thetransitapp/droid/service/ServiceCallback;

    .line 19
    return-void
.end method


# virtual methods
.method public call()Lcom/thetransitapp/droid/model/BundleResponse;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .prologue
    .line 23
    invoke-super {p0}, Lcom/thetransitapp/droid/service/BaseServiceTask;->getTransitSource()Lcom/thetransitapp/droid/data/TransitSource;

    move-result-object v0

    iget-object v1, p0, Lcom/thetransitapp/droid/service/BundleTask;->location:Landroid/location/Location;

    iget-boolean v2, p0, Lcom/thetransitapp/droid/service/BundleTask;->loadAll:Z

    invoke-interface {v0, v1, v2}, Lcom/thetransitapp/droid/data/TransitSource;->loadBundle(Landroid/location/Location;Z)Lcom/thetransitapp/droid/model/BundleResponse;

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
    invoke-virtual {p0}, Lcom/thetransitapp/droid/service/BundleTask;->call()Lcom/thetransitapp/droid/model/BundleResponse;

    move-result-object v0

    return-object v0
.end method

.method protected onException(Ljava/lang/Exception;)V
    .locals 2
    .param p1, "e"    # Ljava/lang/Exception;

    .prologue
    .line 40
    iget-object v0, p0, Lcom/thetransitapp/droid/service/BundleTask;->callback:Lcom/thetransitapp/droid/service/ServiceCallback;

    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Lcom/thetransitapp/droid/service/ServiceCallback;->onError(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 41
    return-void
.end method

.method protected onSuccess(Lcom/thetransitapp/droid/model/BundleResponse;)V
    .locals 1
    .param p1, "result"    # Lcom/thetransitapp/droid/model/BundleResponse;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .prologue
    .line 28
    invoke-super {p0, p1}, Lcom/thetransitapp/droid/service/BaseServiceTask;->onSuccess(Ljava/lang/Object;)V

    .line 30
    iget-object v0, p0, Lcom/thetransitapp/droid/service/BundleTask;->callback:Lcom/thetransitapp/droid/service/ServiceCallback;

    invoke-interface {v0, p1}, Lcom/thetransitapp/droid/service/ServiceCallback;->onResult(Ljava/lang/Object;)V

    .line 32
    iget-boolean v0, p0, Lcom/thetransitapp/droid/service/BundleTask;->loadAll:Z

    if-eqz v0, :cond_0

    .line 33
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/thetransitapp/droid/service/BundleTask;->loadAll:Z

    .line 34
    invoke-super {p0}, Lcom/thetransitapp/droid/service/BaseServiceTask;->execute()V

    .line 36
    :cond_0
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
    check-cast p1, Lcom/thetransitapp/droid/model/BundleResponse;

    invoke-virtual {p0, p1}, Lcom/thetransitapp/droid/service/BundleTask;->onSuccess(Lcom/thetransitapp/droid/model/BundleResponse;)V

    return-void
.end method
