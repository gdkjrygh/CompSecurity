.class public Lcom/thetransitapp/droid/model/ScheduleItem;
.super Ljava/lang/Object;
.source "ScheduleItem.java"

# interfaces
.implements Ljava/io/Serializable;
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/io/Serializable;",
        "Ljava/lang/Comparable",
        "<",
        "Lcom/thetransitapp/droid/model/ScheduleItem;",
        ">;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = 0x406a919a760a55b8L


# instance fields
.field private cancelled:Z

.field private dropOffCancelled:Z

.field private frequencyEndTime:Ljava/util/Date;

.field private frequencyHeadway:J

.field private frequencyStartTime:Ljava/util/Date;

.field private headsign:Ljava/lang/String;

.field private itinerary:Lcom/thetransitapp/droid/model/Itinerary;

.field private lastItemOfService:Z

.field private pickupCancelled:Z

.field private realStopTime:Ljava/util/Date;

.field private realTimeDirectionId:Ljava/lang/String;

.field private scheduledStopTime:Ljava/util/Date;

.field private serviceDay:Lcom/thetransitapp/droid/model/ServiceDay;

.field private stop:Lcom/thetransitapp/droid/model/Stop;

.field private tripId:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    return-void
.end method

.method public constructor <init>(Ljava/util/Date;)V
    .locals 0
    .param p1, "stopTime"    # Ljava/util/Date;

    .prologue
    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    iput-object p1, p0, Lcom/thetransitapp/droid/model/ScheduleItem;->scheduledStopTime:Ljava/util/Date;

    .line 42
    return-void
.end method


# virtual methods
.method public compareTo(Lcom/thetransitapp/droid/model/ScheduleItem;)I
    .locals 2
    .param p1, "another"    # Lcom/thetransitapp/droid/model/ScheduleItem;

    .prologue
    .line 132
    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/ScheduleItem;->getEndDate()Ljava/util/Date;

    move-result-object v0

    invoke-virtual {p1}, Lcom/thetransitapp/droid/model/ScheduleItem;->getEndDate()Ljava/util/Date;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/Date;->compareTo(Ljava/util/Date;)I

    move-result v0

    return v0
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 1

    .prologue
    .line 1
    check-cast p1, Lcom/thetransitapp/droid/model/ScheduleItem;

    invoke-virtual {p0, p1}, Lcom/thetransitapp/droid/model/ScheduleItem;->compareTo(Lcom/thetransitapp/droid/model/ScheduleItem;)I

    move-result v0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1, "o"    # Ljava/lang/Object;

    .prologue
    const/4 v1, 0x0

    .line 101
    instance-of v2, p1, Lcom/thetransitapp/droid/model/ScheduleItem;

    if-nez v2, :cond_1

    .line 127
    :cond_0
    :goto_0
    return v1

    :cond_1
    move-object v0, p1

    .line 105
    check-cast v0, Lcom/thetransitapp/droid/model/ScheduleItem;

    .line 107
    .local v0, "item":Lcom/thetransitapp/droid/model/ScheduleItem;
    iget-object v2, p0, Lcom/thetransitapp/droid/model/ScheduleItem;->tripId:Ljava/lang/String;

    if-nez v2, :cond_2

    iget-object v2, v0, Lcom/thetransitapp/droid/model/ScheduleItem;->tripId:Ljava/lang/String;

    if-nez v2, :cond_0

    .line 111
    :cond_2
    iget-object v2, p0, Lcom/thetransitapp/droid/model/ScheduleItem;->tripId:Ljava/lang/String;

    if-nez v2, :cond_5

    .line 112
    iget-object v2, v0, Lcom/thetransitapp/droid/model/ScheduleItem;->tripId:Ljava/lang/String;

    if-nez v2, :cond_0

    .line 119
    :cond_3
    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/ScheduleItem;->getStopTime()Ljava/util/Date;

    move-result-object v2

    if-nez v2, :cond_6

    .line 120
    invoke-virtual {v0}, Lcom/thetransitapp/droid/model/ScheduleItem;->getStopTime()Ljava/util/Date;

    move-result-object v2

    if-nez v2, :cond_0

    .line 127
    :cond_4
    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/ScheduleItem;->isFrequency()Z

    move-result v2

    invoke-virtual {v0}, Lcom/thetransitapp/droid/model/ScheduleItem;->isFrequency()Z

    move-result v3

    if-ne v2, v3, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    .line 115
    :cond_5
    iget-object v2, p0, Lcom/thetransitapp/droid/model/ScheduleItem;->tripId:Ljava/lang/String;

    iget-object v3, v0, Lcom/thetransitapp/droid/model/ScheduleItem;->tripId:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    goto :goto_0

    .line 123
    :cond_6
    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/ScheduleItem;->getStopTime()Ljava/util/Date;

    move-result-object v2

    invoke-virtual {v0}, Lcom/thetransitapp/droid/model/ScheduleItem;->getStopTime()Ljava/util/Date;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/Date;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    goto :goto_0
.end method

.method public getEndDate()Ljava/util/Date;
    .locals 1

    .prologue
    .line 57
    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/ScheduleItem;->isFrequency()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/thetransitapp/droid/model/ScheduleItem;->frequencyEndTime:Ljava/util/Date;

    :goto_0
    return-object v0

    :cond_0
    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/ScheduleItem;->getStopTime()Ljava/util/Date;

    move-result-object v0

    goto :goto_0
.end method

.method public getFrequencyEndTime()Ljava/util/Date;
    .locals 1

    .prologue
    .line 12
    iget-object v0, p0, Lcom/thetransitapp/droid/model/ScheduleItem;->frequencyEndTime:Ljava/util/Date;

    return-object v0
.end method

.method public getFrequencyHeadway()J
    .locals 2

    .prologue
    .line 12
    iget-wide v0, p0, Lcom/thetransitapp/droid/model/ScheduleItem;->frequencyHeadway:J

    return-wide v0
.end method

.method public getFrequencyStartTime()Ljava/util/Date;
    .locals 1

    .prologue
    .line 12
    iget-object v0, p0, Lcom/thetransitapp/droid/model/ScheduleItem;->frequencyStartTime:Ljava/util/Date;

    return-object v0
.end method

.method public getHeadsign()Ljava/lang/String;
    .locals 1

    .prologue
    .line 12
    iget-object v0, p0, Lcom/thetransitapp/droid/model/ScheduleItem;->headsign:Ljava/lang/String;

    return-object v0
.end method

.method public getItinerary()Lcom/thetransitapp/droid/model/Itinerary;
    .locals 1

    .prologue
    .line 12
    iget-object v0, p0, Lcom/thetransitapp/droid/model/ScheduleItem;->itinerary:Lcom/thetransitapp/droid/model/Itinerary;

    return-object v0
.end method

.method public getMapCalloutAbsoluteDepartureString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 80
    const/4 v0, 0x0

    return-object v0
.end method

.method public getMapCalloutArrivalString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 84
    const/4 v0, 0x0

    return-object v0
.end method

.method public getMapCalloutDepartureString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 76
    const/4 v0, 0x0

    return-object v0
.end method

.method public getMinutesRemaining()I
    .locals 4

    .prologue
    .line 92
    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/ScheduleItem;->isFrequency()Z

    move-result v0

    if-nez v0, :cond_0

    .line 93
    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/ScheduleItem;->getStopTime()Ljava/util/Date;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sub-long/2addr v0, v2

    long-to-int v0, v0

    const v1, 0xea60

    div-int/2addr v0, v1

    .line 95
    :goto_0
    return v0

    :cond_0
    iget-wide v0, p0, Lcom/thetransitapp/droid/model/ScheduleItem;->frequencyHeadway:J

    long-to-int v0, v0

    div-int/lit8 v0, v0, 0x3c

    goto :goto_0
.end method

.method public getRealStopTime()Ljava/util/Date;
    .locals 1

    .prologue
    .line 12
    iget-object v0, p0, Lcom/thetransitapp/droid/model/ScheduleItem;->realStopTime:Ljava/util/Date;

    return-object v0
.end method

.method public getRealTimeDirectionId()Ljava/lang/String;
    .locals 1

    .prologue
    .line 12
    iget-object v0, p0, Lcom/thetransitapp/droid/model/ScheduleItem;->realTimeDirectionId:Ljava/lang/String;

    return-object v0
.end method

.method public getRelativeTimeString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 65
    const/4 v0, 0x0

    return-object v0
.end method

.method public getScheduleViewLabelString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 88
    const/4 v0, 0x0

    return-object v0
.end method

.method public getScheduleViewString(Landroid/content/Context;)Ljava/lang/String;
    .locals 6
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .line 69
    iget-wide v2, p0, Lcom/thetransitapp/droid/model/ScheduleItem;->frequencyHeadway:J

    const-wide/16 v4, 0x3c

    div-long/2addr v2, v4

    long-to-int v1, v2

    .line 70
    .local v1, "freq":I
    invoke-static {p1}, Landroid/text/format/DateFormat;->getTimeFormat(Landroid/content/Context;)Ljava/text/DateFormat;

    move-result-object v2

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/ScheduleItem;->getEndDate()Ljava/util/Date;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    .line 72
    .local v0, "end":Ljava/lang/String;
    const v2, 0x7f0a0048

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v3, v4

    const/4 v4, 0x1

    aput-object v0, v3, v4

    invoke-virtual {p1, v2, v3}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    return-object v2
.end method

.method public getScheduledStopTime()Ljava/util/Date;
    .locals 1

    .prologue
    .line 12
    iget-object v0, p0, Lcom/thetransitapp/droid/model/ScheduleItem;->scheduledStopTime:Ljava/util/Date;

    return-object v0
.end method

.method public getServiceDay()Lcom/thetransitapp/droid/model/ServiceDay;
    .locals 1

    .prologue
    .line 12
    iget-object v0, p0, Lcom/thetransitapp/droid/model/ScheduleItem;->serviceDay:Lcom/thetransitapp/droid/model/ServiceDay;

    return-object v0
.end method

.method public getSortDate()Ljava/util/Date;
    .locals 1

    .prologue
    .line 49
    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/ScheduleItem;->getEndDate()Ljava/util/Date;

    move-result-object v0

    return-object v0
.end method

.method public getStartDate()Ljava/util/Date;
    .locals 1

    .prologue
    .line 53
    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/ScheduleItem;->isFrequency()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/thetransitapp/droid/model/ScheduleItem;->frequencyStartTime:Ljava/util/Date;

    :goto_0
    return-object v0

    :cond_0
    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/ScheduleItem;->getStopTime()Ljava/util/Date;

    move-result-object v0

    goto :goto_0
.end method

.method public getStop()Lcom/thetransitapp/droid/model/Stop;
    .locals 1

    .prologue
    .line 12
    iget-object v0, p0, Lcom/thetransitapp/droid/model/ScheduleItem;->stop:Lcom/thetransitapp/droid/model/Stop;

    return-object v0
.end method

.method public getStopTime()Ljava/util/Date;
    .locals 1

    .prologue
    .line 45
    iget-object v0, p0, Lcom/thetransitapp/droid/model/ScheduleItem;->realStopTime:Ljava/util/Date;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/thetransitapp/droid/model/ScheduleItem;->realStopTime:Ljava/util/Date;

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/thetransitapp/droid/model/ScheduleItem;->scheduledStopTime:Ljava/util/Date;

    goto :goto_0
.end method

.method public getTripId()Ljava/lang/String;
    .locals 1

    .prologue
    .line 12
    iget-object v0, p0, Lcom/thetransitapp/droid/model/ScheduleItem;->tripId:Ljava/lang/String;

    return-object v0
.end method

.method public isCancelled()Z
    .locals 1

    .prologue
    .line 12
    iget-boolean v0, p0, Lcom/thetransitapp/droid/model/ScheduleItem;->cancelled:Z

    return v0
.end method

.method public isDropOffCancelled()Z
    .locals 1

    .prologue
    .line 12
    iget-boolean v0, p0, Lcom/thetransitapp/droid/model/ScheduleItem;->dropOffCancelled:Z

    return v0
.end method

.method public isFrequency()Z
    .locals 1

    .prologue
    .line 61
    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/ScheduleItem;->getStopTime()Ljava/util/Date;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public isLastItemOfService()Z
    .locals 1

    .prologue
    .line 12
    iget-boolean v0, p0, Lcom/thetransitapp/droid/model/ScheduleItem;->lastItemOfService:Z

    return v0
.end method

.method public isPastItem()Z
    .locals 2

    .prologue
    .line 136
    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/ScheduleItem;->getEndDate()Ljava/util/Date;

    move-result-object v0

    new-instance v1, Ljava/util/Date;

    invoke-direct {v1}, Ljava/util/Date;-><init>()V

    invoke-virtual {v0, v1}, Ljava/util/Date;->before(Ljava/util/Date;)Z

    move-result v0

    return v0
.end method

.method public isPickupCancelled()Z
    .locals 1

    .prologue
    .line 12
    iget-boolean v0, p0, Lcom/thetransitapp/droid/model/ScheduleItem;->pickupCancelled:Z

    return v0
.end method

.method public setCancelled(Z)V
    .locals 0
    .param p1, "cancelled"    # Z

    .prologue
    .line 12
    iput-boolean p1, p0, Lcom/thetransitapp/droid/model/ScheduleItem;->cancelled:Z

    return-void
.end method

.method public setDropOffCancelled(Z)V
    .locals 0
    .param p1, "dropOffCancelled"    # Z

    .prologue
    .line 12
    iput-boolean p1, p0, Lcom/thetransitapp/droid/model/ScheduleItem;->dropOffCancelled:Z

    return-void
.end method

.method public setFrequencyEndTime(Ljava/util/Date;)V
    .locals 0
    .param p1, "frequencyEndTime"    # Ljava/util/Date;

    .prologue
    .line 12
    iput-object p1, p0, Lcom/thetransitapp/droid/model/ScheduleItem;->frequencyEndTime:Ljava/util/Date;

    return-void
.end method

.method public setFrequencyHeadway(J)V
    .locals 0
    .param p1, "frequencyHeadway"    # J

    .prologue
    .line 12
    iput-wide p1, p0, Lcom/thetransitapp/droid/model/ScheduleItem;->frequencyHeadway:J

    return-void
.end method

.method public setFrequencyStartTime(Ljava/util/Date;)V
    .locals 0
    .param p1, "frequencyStartTime"    # Ljava/util/Date;

    .prologue
    .line 12
    iput-object p1, p0, Lcom/thetransitapp/droid/model/ScheduleItem;->frequencyStartTime:Ljava/util/Date;

    return-void
.end method

.method public setHeadsign(Ljava/lang/String;)V
    .locals 0
    .param p1, "headsign"    # Ljava/lang/String;

    .prologue
    .line 12
    iput-object p1, p0, Lcom/thetransitapp/droid/model/ScheduleItem;->headsign:Ljava/lang/String;

    return-void
.end method

.method public setItinerary(Lcom/thetransitapp/droid/model/Itinerary;)V
    .locals 0
    .param p1, "itinerary"    # Lcom/thetransitapp/droid/model/Itinerary;

    .prologue
    .line 12
    iput-object p1, p0, Lcom/thetransitapp/droid/model/ScheduleItem;->itinerary:Lcom/thetransitapp/droid/model/Itinerary;

    return-void
.end method

.method public setLastItemOfService(Z)V
    .locals 0
    .param p1, "lastItemOfService"    # Z

    .prologue
    .line 12
    iput-boolean p1, p0, Lcom/thetransitapp/droid/model/ScheduleItem;->lastItemOfService:Z

    return-void
.end method

.method public setPickupCancelled(Z)V
    .locals 0
    .param p1, "pickupCancelled"    # Z

    .prologue
    .line 12
    iput-boolean p1, p0, Lcom/thetransitapp/droid/model/ScheduleItem;->pickupCancelled:Z

    return-void
.end method

.method public setRealStopTime(Ljava/util/Date;)V
    .locals 0
    .param p1, "realStopTime"    # Ljava/util/Date;

    .prologue
    .line 12
    iput-object p1, p0, Lcom/thetransitapp/droid/model/ScheduleItem;->realStopTime:Ljava/util/Date;

    return-void
.end method

.method public setRealTimeDirectionId(Ljava/lang/String;)V
    .locals 0
    .param p1, "realTimeDirectionId"    # Ljava/lang/String;

    .prologue
    .line 12
    iput-object p1, p0, Lcom/thetransitapp/droid/model/ScheduleItem;->realTimeDirectionId:Ljava/lang/String;

    return-void
.end method

.method public setScheduledStopTime(Ljava/util/Date;)V
    .locals 0
    .param p1, "scheduledStopTime"    # Ljava/util/Date;

    .prologue
    .line 12
    iput-object p1, p0, Lcom/thetransitapp/droid/model/ScheduleItem;->scheduledStopTime:Ljava/util/Date;

    return-void
.end method

.method public setServiceDay(Lcom/thetransitapp/droid/model/ServiceDay;)V
    .locals 0
    .param p1, "serviceDay"    # Lcom/thetransitapp/droid/model/ServiceDay;

    .prologue
    .line 12
    iput-object p1, p0, Lcom/thetransitapp/droid/model/ScheduleItem;->serviceDay:Lcom/thetransitapp/droid/model/ServiceDay;

    return-void
.end method

.method public setStop(Lcom/thetransitapp/droid/model/Stop;)V
    .locals 0
    .param p1, "stop"    # Lcom/thetransitapp/droid/model/Stop;

    .prologue
    .line 12
    iput-object p1, p0, Lcom/thetransitapp/droid/model/ScheduleItem;->stop:Lcom/thetransitapp/droid/model/Stop;

    return-void
.end method

.method public setTripId(Ljava/lang/String;)V
    .locals 0
    .param p1, "tripId"    # Ljava/lang/String;

    .prologue
    .line 12
    iput-object p1, p0, Lcom/thetransitapp/droid/model/ScheduleItem;->tripId:Ljava/lang/String;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .prologue
    .line 12
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "ScheduleItem(itinerary="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/ScheduleItem;->getItinerary()Lcom/thetransitapp/droid/model/Itinerary;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", serviceDay="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/ScheduleItem;->getServiceDay()Lcom/thetransitapp/droid/model/ServiceDay;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", stop="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/ScheduleItem;->getStop()Lcom/thetransitapp/droid/model/Stop;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", scheduledStopTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/ScheduleItem;->getScheduledStopTime()Ljava/util/Date;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", realStopTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/ScheduleItem;->getRealStopTime()Ljava/util/Date;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", realTimeDirectionId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/ScheduleItem;->getRealTimeDirectionId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", headsign="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/ScheduleItem;->getHeadsign()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", cancelled="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/ScheduleItem;->isCancelled()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", lastItemOfService="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/ScheduleItem;->isLastItemOfService()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", frequencyStartTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/ScheduleItem;->getFrequencyStartTime()Ljava/util/Date;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", frequencyEndTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/ScheduleItem;->getFrequencyEndTime()Ljava/util/Date;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", frequencyHeadway="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/ScheduleItem;->getFrequencyHeadway()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", tripId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/ScheduleItem;->getTripId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", pickupCancelled="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/ScheduleItem;->isPickupCancelled()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", dropOffCancelled="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/ScheduleItem;->isDropOffCancelled()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
