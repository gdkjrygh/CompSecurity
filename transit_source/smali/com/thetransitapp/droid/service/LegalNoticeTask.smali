.class public Lcom/thetransitapp/droid/service/LegalNoticeTask;
.super Lcom/thetransitapp/droid/service/BaseServiceTask;
.source "LegalNoticeTask.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/thetransitapp/droid/service/BaseServiceTask",
        "<",
        "Ljava/util/List",
        "<",
        "Lcom/thetransitapp/droid/model/Feed;",
        ">;>;"
    }
.end annotation


# instance fields
.field private final callback:Lcom/thetransitapp/droid/service/ServiceCallback;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/thetransitapp/droid/service/ServiceCallback",
            "<",
            "Ljava/util/List",
            "<",
            "Lcom/thetransitapp/droid/model/Feed;",
            ">;>;"
        }
    .end annotation
.end field

.field private location:Landroid/location/Location;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/location/Location;Lcom/thetransitapp/droid/service/ServiceCallback;)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "location"    # Landroid/location/Location;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Landroid/location/Location;",
            "Lcom/thetransitapp/droid/service/ServiceCallback",
            "<",
            "Ljava/util/List",
            "<",
            "Lcom/thetransitapp/droid/model/Feed;",
            ">;>;)V"
        }
    .end annotation

    .prologue
    .line 16
    .local p3, "callback":Lcom/thetransitapp/droid/service/ServiceCallback;, "Lcom/thetransitapp/droid/service/ServiceCallback<Ljava/util/List<Lcom/thetransitapp/droid/model/Feed;>;>;"
    const v0, 0x7f0a0057

    invoke-direct {p0, p1, v0}, Lcom/thetransitapp/droid/service/BaseServiceTask;-><init>(Landroid/content/Context;I)V

    .line 18
    iput-object p2, p0, Lcom/thetransitapp/droid/service/LegalNoticeTask;->location:Landroid/location/Location;

    .line 19
    iput-object p3, p0, Lcom/thetransitapp/droid/service/LegalNoticeTask;->callback:Lcom/thetransitapp/droid/service/ServiceCallback;

    .line 20
    return-void
.end method


# virtual methods
.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .prologue
    .line 1
    invoke-virtual {p0}, Lcom/thetransitapp/droid/service/LegalNoticeTask;->call()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public call()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/thetransitapp/droid/model/Feed;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .prologue
    .line 24
    invoke-super {p0}, Lcom/thetransitapp/droid/service/BaseServiceTask;->getTransitSource()Lcom/thetransitapp/droid/data/TransitSource;

    move-result-object v0

    iget-object v1, p0, Lcom/thetransitapp/droid/service/LegalNoticeTask;->location:Landroid/location/Location;

    invoke-interface {v0, v1}, Lcom/thetransitapp/droid/data/TransitSource;->loadLegal(Landroid/location/Location;)Ljava/util/List;

    move-result-object v0

    return-object v0
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
    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, Lcom/thetransitapp/droid/service/LegalNoticeTask;->onSuccess(Ljava/util/List;)V

    return-void
.end method

.method protected onSuccess(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/thetransitapp/droid/model/Feed;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .prologue
    .line 29
    .local p1, "result":Ljava/util/List;, "Ljava/util/List<Lcom/thetransitapp/droid/model/Feed;>;"
    invoke-super {p0, p1}, Lcom/thetransitapp/droid/service/BaseServiceTask;->onSuccess(Ljava/lang/Object;)V

    .line 31
    iget-object v0, p0, Lcom/thetransitapp/droid/service/LegalNoticeTask;->callback:Lcom/thetransitapp/droid/service/ServiceCallback;

    invoke-interface {v0, p1}, Lcom/thetransitapp/droid/service/ServiceCallback;->onResult(Ljava/lang/Object;)V

    .line 32
    return-void
.end method
