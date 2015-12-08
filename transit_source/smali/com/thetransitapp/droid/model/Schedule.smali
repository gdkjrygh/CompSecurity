.class public Lcom/thetransitapp/droid/model/Schedule;
.super Ljava/lang/Object;
.source "Schedule.java"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field private static final serialVersionUID:J = -0x568fa409d2e923ebL


# instance fields
.field private isComplete:Z

.field private itinerary:Lcom/thetransitapp/droid/model/Itinerary;

.field private scheduleItems:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/thetransitapp/droid/model/ScheduleItem;",
            ">;"
        }
    .end annotation
.end field

.field private serviceDay:Lcom/thetransitapp/droid/model/ServiceDay;

.field private stop:Lcom/thetransitapp/droid/model/Stop;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/thetransitapp/droid/model/Schedule;->scheduleItems:Ljava/util/List;

    .line 22
    return-void
.end method

.method public constructor <init>(Lcom/thetransitapp/droid/model/Itinerary;Lcom/thetransitapp/droid/model/Stop;Lcom/thetransitapp/droid/model/ServiceDay;)V
    .locals 0
    .param p1, "itinerary"    # Lcom/thetransitapp/droid/model/Itinerary;
    .param p2, "stop"    # Lcom/thetransitapp/droid/model/Stop;
    .param p3, "serviceDay"    # Lcom/thetransitapp/droid/model/ServiceDay;

    .prologue
    .line 25
    invoke-direct {p0}, Lcom/thetransitapp/droid/model/Schedule;-><init>()V

    .line 27
    iput-object p1, p0, Lcom/thetransitapp/droid/model/Schedule;->itinerary:Lcom/thetransitapp/droid/model/Itinerary;

    .line 28
    iput-object p2, p0, Lcom/thetransitapp/droid/model/Schedule;->stop:Lcom/thetransitapp/droid/model/Stop;

    .line 29
    iput-object p3, p0, Lcom/thetransitapp/droid/model/Schedule;->serviceDay:Lcom/thetransitapp/droid/model/ServiceDay;

    .line 30
    return-void
.end method


# virtual methods
.method public canEqual(Ljava/lang/Object;)Z
    .locals 1
    .param p1, "other"    # Ljava/lang/Object;

    .prologue
    .line 9
    instance-of v0, p1, Lcom/thetransitapp/droid/model/Schedule;

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 13
    .param p1, "o"    # Ljava/lang/Object;

    .prologue
    const/4 v9, 0x1

    const/4 v10, 0x0

    .line 9
    if-ne p1, p0, :cond_1

    :cond_0
    :goto_0
    return v9

    :cond_1
    instance-of v11, p1, Lcom/thetransitapp/droid/model/Schedule;

    if-nez v11, :cond_2

    move v9, v10

    goto :goto_0

    :cond_2
    move-object v0, p1

    check-cast v0, Lcom/thetransitapp/droid/model/Schedule;

    .local v0, "other":Lcom/thetransitapp/droid/model/Schedule;
    invoke-virtual {v0, p0}, Lcom/thetransitapp/droid/model/Schedule;->canEqual(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_3

    move v9, v10

    goto :goto_0

    :cond_3
    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/Schedule;->getServiceDay()Lcom/thetransitapp/droid/model/ServiceDay;

    move-result-object v7

    .local v7, "this$serviceDay":Lcom/thetransitapp/droid/model/ServiceDay;
    invoke-virtual {v0}, Lcom/thetransitapp/droid/model/Schedule;->getServiceDay()Lcom/thetransitapp/droid/model/ServiceDay;

    move-result-object v3

    .local v3, "other$serviceDay":Lcom/thetransitapp/droid/model/ServiceDay;
    if-nez v7, :cond_5

    if-eqz v3, :cond_6

    :cond_4
    move v9, v10

    goto :goto_0

    :cond_5
    invoke-virtual {v7, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_4

    :cond_6
    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/Schedule;->getItinerary()Lcom/thetransitapp/droid/model/Itinerary;

    move-result-object v5

    .local v5, "this$itinerary":Lcom/thetransitapp/droid/model/Itinerary;
    invoke-virtual {v0}, Lcom/thetransitapp/droid/model/Schedule;->getItinerary()Lcom/thetransitapp/droid/model/Itinerary;

    move-result-object v1

    .local v1, "other$itinerary":Lcom/thetransitapp/droid/model/Itinerary;
    if-nez v5, :cond_8

    if-eqz v1, :cond_9

    :cond_7
    move v9, v10

    goto :goto_0

    :cond_8
    invoke-virtual {v5, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_7

    :cond_9
    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/Schedule;->getStop()Lcom/thetransitapp/droid/model/Stop;

    move-result-object v8

    .local v8, "this$stop":Lcom/thetransitapp/droid/model/Stop;
    invoke-virtual {v0}, Lcom/thetransitapp/droid/model/Schedule;->getStop()Lcom/thetransitapp/droid/model/Stop;

    move-result-object v4

    .local v4, "other$stop":Lcom/thetransitapp/droid/model/Stop;
    if-nez v8, :cond_b

    if-eqz v4, :cond_c

    :cond_a
    move v9, v10

    goto :goto_0

    :cond_b
    invoke-virtual {v8, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_a

    :cond_c
    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/Schedule;->isComplete()Z

    move-result v11

    invoke-virtual {v0}, Lcom/thetransitapp/droid/model/Schedule;->isComplete()Z

    move-result v12

    if-eq v11, v12, :cond_d

    move v9, v10

    goto :goto_0

    :cond_d
    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/Schedule;->getScheduleItems()Ljava/util/List;

    move-result-object v6

    .local v6, "this$scheduleItems":Ljava/util/List;
    invoke-virtual {v0}, Lcom/thetransitapp/droid/model/Schedule;->getScheduleItems()Ljava/util/List;

    move-result-object v2

    .local v2, "other$scheduleItems":Ljava/util/List;
    if-nez v6, :cond_e

    if-eqz v2, :cond_0

    :goto_1
    move v9, v10

    goto :goto_0

    :cond_e
    invoke-virtual {v6, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_0

    goto :goto_1
.end method

.method public getItinerary()Lcom/thetransitapp/droid/model/Itinerary;
    .locals 1

    .prologue
    .line 9
    iget-object v0, p0, Lcom/thetransitapp/droid/model/Schedule;->itinerary:Lcom/thetransitapp/droid/model/Itinerary;

    return-object v0
.end method

.method public getRealTimeItems()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/thetransitapp/droid/model/ScheduleItem;",
            ">;"
        }
    .end annotation

    .prologue
    .line 33
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 35
    .local v1, "items":Ljava/util/List;, "Ljava/util/List<Lcom/thetransitapp/droid/model/ScheduleItem;>;"
    iget-object v2, p0, Lcom/thetransitapp/droid/model/Schedule;->scheduleItems:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-nez v3, :cond_1

    .line 41
    return-object v1

    .line 35
    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/thetransitapp/droid/model/ScheduleItem;

    .line 36
    .local v0, "item":Lcom/thetransitapp/droid/model/ScheduleItem;
    invoke-virtual {v0}, Lcom/thetransitapp/droid/model/ScheduleItem;->getRealStopTime()Ljava/util/Date;

    move-result-object v3

    if-nez v3, :cond_2

    invoke-virtual {v0}, Lcom/thetransitapp/droid/model/ScheduleItem;->isCancelled()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 37
    :cond_2
    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0
.end method

.method public getScheduleItemForTrip(Ljava/lang/String;)Lcom/thetransitapp/droid/model/ScheduleItem;
    .locals 3
    .param p1, "tripId"    # Ljava/lang/String;

    .prologue
    .line 64
    iget-object v1, p0, Lcom/thetransitapp/droid/model/Schedule;->scheduleItems:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_1

    .line 70
    const/4 v0, 0x0

    :goto_0
    return-object v0

    .line 64
    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/thetransitapp/droid/model/ScheduleItem;

    .line 65
    .local v0, "item":Lcom/thetransitapp/droid/model/ScheduleItem;
    invoke-virtual {v0}, Lcom/thetransitapp/droid/model/ScheduleItem;->getTripId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0
.end method

.method public getScheduleItems()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/thetransitapp/droid/model/ScheduleItem;",
            ">;"
        }
    .end annotation

    .prologue
    .line 9
    iget-object v0, p0, Lcom/thetransitapp/droid/model/Schedule;->scheduleItems:Ljava/util/List;

    return-object v0
.end method

.method public getServiceDay()Lcom/thetransitapp/droid/model/ServiceDay;
    .locals 1

    .prologue
    .line 9
    iget-object v0, p0, Lcom/thetransitapp/droid/model/Schedule;->serviceDay:Lcom/thetransitapp/droid/model/ServiceDay;

    return-object v0
.end method

.method public getStop()Lcom/thetransitapp/droid/model/Stop;
    .locals 1

    .prologue
    .line 9
    iget-object v0, p0, Lcom/thetransitapp/droid/model/Schedule;->stop:Lcom/thetransitapp/droid/model/Stop;

    return-object v0
.end method

.method public hashCode()I
    .locals 9

    .prologue
    const/4 v7, 0x0

    .line 9
    const/16 v4, 0x1f

    .local v4, "PRIME":I
    const/4 v5, 0x1

    .local v5, "result":I
    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/Schedule;->getServiceDay()Lcom/thetransitapp/droid/model/ServiceDay;

    move-result-object v2

    .local v2, "$serviceDay":Lcom/thetransitapp/droid/model/ServiceDay;
    if-nez v2, :cond_0

    move v6, v7

    :goto_0
    add-int/lit8 v5, v6, 0x1f

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/Schedule;->getItinerary()Lcom/thetransitapp/droid/model/Itinerary;

    move-result-object v0

    .local v0, "$itinerary":Lcom/thetransitapp/droid/model/Itinerary;
    mul-int/lit8 v8, v5, 0x1f

    if-nez v0, :cond_1

    move v6, v7

    :goto_1
    add-int v5, v8, v6

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/Schedule;->getStop()Lcom/thetransitapp/droid/model/Stop;

    move-result-object v3

    .local v3, "$stop":Lcom/thetransitapp/droid/model/Stop;
    mul-int/lit8 v8, v5, 0x1f

    if-nez v3, :cond_2

    move v6, v7

    :goto_2
    add-int v5, v8, v6

    mul-int/lit8 v8, v5, 0x1f

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/Schedule;->isComplete()Z

    move-result v6

    if-eqz v6, :cond_3

    const/16 v6, 0x4cf

    :goto_3
    add-int v5, v8, v6

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/Schedule;->getScheduleItems()Ljava/util/List;

    move-result-object v1

    .local v1, "$scheduleItems":Ljava/util/List;
    mul-int/lit8 v6, v5, 0x1f

    if-nez v1, :cond_4

    :goto_4
    add-int v5, v6, v7

    return v5

    .end local v0    # "$itinerary":Lcom/thetransitapp/droid/model/Itinerary;
    .end local v1    # "$scheduleItems":Ljava/util/List;
    .end local v3    # "$stop":Lcom/thetransitapp/droid/model/Stop;
    :cond_0
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v6

    goto :goto_0

    .restart local v0    # "$itinerary":Lcom/thetransitapp/droid/model/Itinerary;
    :cond_1
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v6

    goto :goto_1

    .restart local v3    # "$stop":Lcom/thetransitapp/droid/model/Stop;
    :cond_2
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v6

    goto :goto_2

    :cond_3
    const/16 v6, 0x4d5

    goto :goto_3

    .restart local v1    # "$scheduleItems":Ljava/util/List;
    :cond_4
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v7

    goto :goto_4
.end method

.method public isComplete()Z
    .locals 1

    .prologue
    .line 9
    iget-boolean v0, p0, Lcom/thetransitapp/droid/model/Schedule;->isComplete:Z

    return v0
.end method

.method public merge(Lcom/thetransitapp/droid/model/Schedule;)V
    .locals 3
    .param p1, "schedule"    # Lcom/thetransitapp/droid/model/Schedule;

    .prologue
    .line 45
    invoke-virtual {p1}, Lcom/thetransitapp/droid/model/Schedule;->getScheduleItems()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_1

    .line 50
    return-void

    .line 45
    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/thetransitapp/droid/model/ScheduleItem;

    .line 46
    .local v0, "item":Lcom/thetransitapp/droid/model/ScheduleItem;
    iget-object v2, p0, Lcom/thetransitapp/droid/model/Schedule;->scheduleItems:Ljava/util/List;

    invoke-interface {v2, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 47
    iget-object v2, p0, Lcom/thetransitapp/droid/model/Schedule;->scheduleItems:Ljava/util/List;

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0
.end method

.method public mergeRealTime(Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/thetransitapp/droid/model/ScheduleItem;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 53
    .local p1, "realTimeItems":Ljava/util/List;, "Ljava/util/List<Lcom/thetransitapp/droid/model/ScheduleItem;>;"
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-nez v3, :cond_1

    .line 61
    return-void

    .line 53
    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/thetransitapp/droid/model/ScheduleItem;

    .line 54
    .local v1, "item":Lcom/thetransitapp/droid/model/ScheduleItem;
    iget-object v3, p0, Lcom/thetransitapp/droid/model/Schedule;->scheduleItems:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_2
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/thetransitapp/droid/model/ScheduleItem;

    .line 55
    .local v0, "existing":Lcom/thetransitapp/droid/model/ScheduleItem;
    invoke-virtual {v1, v0}, Lcom/thetransitapp/droid/model/ScheduleItem;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 56
    invoke-virtual {v1}, Lcom/thetransitapp/droid/model/ScheduleItem;->getRealStopTime()Ljava/util/Date;

    move-result-object v4

    invoke-virtual {v0, v4}, Lcom/thetransitapp/droid/model/ScheduleItem;->setRealStopTime(Ljava/util/Date;)V

    .line 57
    invoke-virtual {v1}, Lcom/thetransitapp/droid/model/ScheduleItem;->isCancelled()Z

    move-result v4

    invoke-virtual {v0, v4}, Lcom/thetransitapp/droid/model/ScheduleItem;->setCancelled(Z)V

    goto :goto_0
.end method

.method public setComplete(Z)V
    .locals 0
    .param p1, "isComplete"    # Z

    .prologue
    .line 9
    iput-boolean p1, p0, Lcom/thetransitapp/droid/model/Schedule;->isComplete:Z

    return-void
.end method

.method public setItinerary(Lcom/thetransitapp/droid/model/Itinerary;)V
    .locals 0
    .param p1, "itinerary"    # Lcom/thetransitapp/droid/model/Itinerary;

    .prologue
    .line 9
    iput-object p1, p0, Lcom/thetransitapp/droid/model/Schedule;->itinerary:Lcom/thetransitapp/droid/model/Itinerary;

    return-void
.end method

.method public setScheduleItems(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/thetransitapp/droid/model/ScheduleItem;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 9
    .local p1, "scheduleItems":Ljava/util/List;, "Ljava/util/List<Lcom/thetransitapp/droid/model/ScheduleItem;>;"
    iput-object p1, p0, Lcom/thetransitapp/droid/model/Schedule;->scheduleItems:Ljava/util/List;

    return-void
.end method

.method public setServiceDay(Lcom/thetransitapp/droid/model/ServiceDay;)V
    .locals 0
    .param p1, "serviceDay"    # Lcom/thetransitapp/droid/model/ServiceDay;

    .prologue
    .line 9
    iput-object p1, p0, Lcom/thetransitapp/droid/model/Schedule;->serviceDay:Lcom/thetransitapp/droid/model/ServiceDay;

    return-void
.end method

.method public setStop(Lcom/thetransitapp/droid/model/Stop;)V
    .locals 0
    .param p1, "stop"    # Lcom/thetransitapp/droid/model/Stop;

    .prologue
    .line 9
    iput-object p1, p0, Lcom/thetransitapp/droid/model/Schedule;->stop:Lcom/thetransitapp/droid/model/Stop;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 9
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Schedule(serviceDay="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/Schedule;->getServiceDay()Lcom/thetransitapp/droid/model/ServiceDay;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", itinerary="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/Schedule;->getItinerary()Lcom/thetransitapp/droid/model/Itinerary;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", stop="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/Schedule;->getStop()Lcom/thetransitapp/droid/model/Stop;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", isComplete="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/Schedule;->isComplete()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", scheduleItems="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/Schedule;->getScheduleItems()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
