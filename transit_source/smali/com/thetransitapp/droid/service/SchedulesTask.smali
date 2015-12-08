.class public Lcom/thetransitapp/droid/service/SchedulesTask;
.super Lcom/thetransitapp/droid/service/BaseServiceTask;
.source "SchedulesTask.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/thetransitapp/droid/service/BaseServiceTask",
        "<",
        "Ljava/util/List",
        "<",
        "Lcom/thetransitapp/droid/model/Schedule;",
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
            "Lcom/thetransitapp/droid/model/Schedule;",
            ">;>;"
        }
    .end annotation
.end field

.field private final request:Lcom/thetransitapp/droid/model/ScheduleRequest;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/thetransitapp/droid/model/ScheduleRequest;Lcom/thetransitapp/droid/service/ServiceCallback;)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "request"    # Lcom/thetransitapp/droid/model/ScheduleRequest;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/thetransitapp/droid/model/ScheduleRequest;",
            "Lcom/thetransitapp/droid/service/ServiceCallback",
            "<",
            "Ljava/util/List",
            "<",
            "Lcom/thetransitapp/droid/model/Schedule;",
            ">;>;)V"
        }
    .end annotation

    .prologue
    .line 16
    .local p3, "callback":Lcom/thetransitapp/droid/service/ServiceCallback;, "Lcom/thetransitapp/droid/service/ServiceCallback<Ljava/util/List<Lcom/thetransitapp/droid/model/Schedule;>;>;"
    const v0, 0x7f0a0056

    invoke-direct {p0, p1, v0}, Lcom/thetransitapp/droid/service/BaseServiceTask;-><init>(Landroid/content/Context;I)V

    .line 18
    iput-object p2, p0, Lcom/thetransitapp/droid/service/SchedulesTask;->request:Lcom/thetransitapp/droid/model/ScheduleRequest;

    .line 19
    iput-object p3, p0, Lcom/thetransitapp/droid/service/SchedulesTask;->callback:Lcom/thetransitapp/droid/service/ServiceCallback;

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
    invoke-virtual {p0}, Lcom/thetransitapp/droid/service/SchedulesTask;->call()Ljava/util/List;

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
            "Lcom/thetransitapp/droid/model/Schedule;",
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

    iget-object v1, p0, Lcom/thetransitapp/droid/service/SchedulesTask;->request:Lcom/thetransitapp/droid/model/ScheduleRequest;

    invoke-interface {v0, v1}, Lcom/thetransitapp/droid/data/TransitSource;->fullSchedules(Lcom/thetransitapp/droid/model/ScheduleRequest;)Ljava/util/List;

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

    invoke-virtual {p0, p1}, Lcom/thetransitapp/droid/service/SchedulesTask;->onSuccess(Ljava/util/List;)V

    return-void
.end method

.method protected onSuccess(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/thetransitapp/droid/model/Schedule;",
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
    .local p1, "result":Ljava/util/List;, "Ljava/util/List<Lcom/thetransitapp/droid/model/Schedule;>;"
    invoke-super {p0, p1}, Lcom/thetransitapp/droid/service/BaseServiceTask;->onSuccess(Ljava/lang/Object;)V

    .line 31
    iget-object v0, p0, Lcom/thetransitapp/droid/service/SchedulesTask;->callback:Lcom/thetransitapp/droid/service/ServiceCallback;

    invoke-interface {v0, p1}, Lcom/thetransitapp/droid/service/ServiceCallback;->onResult(Ljava/lang/Object;)V

    .line 32
    return-void
.end method
