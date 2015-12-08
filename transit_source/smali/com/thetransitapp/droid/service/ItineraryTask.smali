.class public Lcom/thetransitapp/droid/service/ItineraryTask;
.super Lcom/thetransitapp/droid/service/BaseServiceTask;
.source "ItineraryTask.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/thetransitapp/droid/service/BaseServiceTask",
        "<",
        "Lcom/thetransitapp/droid/model/ScheduleItem;",
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

.field private final scheduleItem:Lcom/thetransitapp/droid/model/ScheduleItem;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/thetransitapp/droid/model/ScheduleItem;Lcom/thetransitapp/droid/service/ServiceCallback;)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "scheduleItem"    # Lcom/thetransitapp/droid/model/ScheduleItem;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/thetransitapp/droid/model/ScheduleItem;",
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
    iput-object p2, p0, Lcom/thetransitapp/droid/service/ItineraryTask;->scheduleItem:Lcom/thetransitapp/droid/model/ScheduleItem;

    .line 16
    iput-object p3, p0, Lcom/thetransitapp/droid/service/ItineraryTask;->callback:Lcom/thetransitapp/droid/service/ServiceCallback;

    .line 17
    return-void
.end method


# virtual methods
.method public call()Lcom/thetransitapp/droid/model/ScheduleItem;
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

    iget-object v1, p0, Lcom/thetransitapp/droid/service/ItineraryTask;->scheduleItem:Lcom/thetransitapp/droid/model/ScheduleItem;

    invoke-interface {v0, v1}, Lcom/thetransitapp/droid/data/TransitSource;->loadDetails(Lcom/thetransitapp/droid/model/ScheduleItem;)Lcom/thetransitapp/droid/model/ScheduleItem;

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
    invoke-virtual {p0}, Lcom/thetransitapp/droid/service/ItineraryTask;->call()Lcom/thetransitapp/droid/model/ScheduleItem;

    move-result-object v0

    return-object v0
.end method

.method protected onSuccess(Lcom/thetransitapp/droid/model/ScheduleItem;)V
    .locals 2
    .param p1, "result"    # Lcom/thetransitapp/droid/model/ScheduleItem;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .prologue
    .line 26
    invoke-super {p0, p1}, Lcom/thetransitapp/droid/service/BaseServiceTask;->onSuccess(Ljava/lang/Object;)V

    .line 28
    iget-object v0, p0, Lcom/thetransitapp/droid/service/ItineraryTask;->callback:Lcom/thetransitapp/droid/service/ServiceCallback;

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
    check-cast p1, Lcom/thetransitapp/droid/model/ScheduleItem;

    invoke-virtual {p0, p1}, Lcom/thetransitapp/droid/service/ItineraryTask;->onSuccess(Lcom/thetransitapp/droid/model/ScheduleItem;)V

    return-void
.end method
