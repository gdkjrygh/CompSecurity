.class public Lcom/thetransitapp/droid/model/Itinerary;
.super Ljava/lang/Object;
.source "Itinerary.java"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/thetransitapp/droid/model/Itinerary$DirectionType;
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = 0x57e3abc5a6ab585eL


# instance fields
.field private branch:Ljava/lang/String;

.field private defaultHeadsign:Ljava/lang/String;

.field private directionType:Lcom/thetransitapp/droid/model/Itinerary$DirectionType;

.field private headsigns:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private id:Ljava/lang/String;

.field private itineraryId:Ljava/lang/String;

.field private realTimeRouteID:Ljava/lang/String;

.field private route:Lcom/thetransitapp/droid/model/Route;

.field private schedules:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Lcom/thetransitapp/droid/model/Schedule;",
            ">;"
        }
    .end annotation
.end field

.field private shape:Ljava/lang/String;

.field private stops:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/thetransitapp/droid/model/Stop;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/thetransitapp/droid/model/Itinerary;->stops:Ljava/util/List;

    .line 37
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/thetransitapp/droid/model/Itinerary;->headsigns:Ljava/util/Map;

    .line 38
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/thetransitapp/droid/model/Itinerary;->schedules:Ljava/util/Map;

    .line 39
    return-void
.end method


# virtual methods
.method public addSchedule(Lcom/thetransitapp/droid/model/Schedule;Lcom/thetransitapp/droid/model/Stop;Lcom/thetransitapp/droid/model/ServiceDay;)V
    .locals 5
    .param p1, "schedule"    # Lcom/thetransitapp/droid/model/Schedule;
    .param p2, "stop"    # Lcom/thetransitapp/droid/model/Stop;
    .param p3, "serviceDay"    # Lcom/thetransitapp/droid/model/ServiceDay;

    .prologue
    .line 52
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Lcom/thetransitapp/droid/model/Stop;->hashCode()I

    move-result v3

    invoke-virtual {p3}, Lcom/thetransitapp/droid/model/ServiceDay;->hashCode()I

    move-result v4

    add-int/2addr v3, v4

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 54
    .local v1, "key":Ljava/lang/String;
    iget-object v2, p0, Lcom/thetransitapp/droid/model/Itinerary;->schedules:Ljava/util/Map;

    invoke-interface {v2, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p1}, Lcom/thetransitapp/droid/model/Schedule;->isComplete()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 55
    :cond_0
    iget-object v2, p0, Lcom/thetransitapp/droid/model/Itinerary;->schedules:Ljava/util/Map;

    invoke-interface {v2, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    :cond_1
    :goto_0
    return-void

    .line 57
    :cond_2
    iget-object v2, p0, Lcom/thetransitapp/droid/model/Itinerary;->schedules:Ljava/util/Map;

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/thetransitapp/droid/model/Schedule;

    .line 59
    .local v0, "exist":Lcom/thetransitapp/droid/model/Schedule;
    invoke-virtual {v0}, Lcom/thetransitapp/droid/model/Schedule;->isComplete()Z

    move-result v2

    if-nez v2, :cond_1

    .line 60
    invoke-virtual {v0, p1}, Lcom/thetransitapp/droid/model/Schedule;->merge(Lcom/thetransitapp/droid/model/Schedule;)V

    goto :goto_0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1, "o"    # Ljava/lang/Object;

    .prologue
    const/4 v1, 0x0

    .line 125
    instance-of v2, p1, Lcom/thetransitapp/droid/model/Itinerary;

    if-nez v2, :cond_1

    .line 131
    :cond_0
    :goto_0
    return v1

    :cond_1
    move-object v0, p1

    .line 129
    check-cast v0, Lcom/thetransitapp/droid/model/Itinerary;

    .line 131
    .local v0, "itinerary":Lcom/thetransitapp/droid/model/Itinerary;
    iget-object v2, p0, Lcom/thetransitapp/droid/model/Itinerary;->id:Ljava/lang/String;

    iget-object v3, v0, Lcom/thetransitapp/droid/model/Itinerary;->id:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/thetransitapp/droid/model/Itinerary;->stops:Ljava/util/List;

    invoke-virtual {v0}, Lcom/thetransitapp/droid/model/Itinerary;->getStops()Ljava/util/List;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 132
    iget-object v2, p0, Lcom/thetransitapp/droid/model/Itinerary;->directionType:Lcom/thetransitapp/droid/model/Itinerary$DirectionType;

    iget-object v3, v0, Lcom/thetransitapp/droid/model/Itinerary;->directionType:Lcom/thetransitapp/droid/model/Itinerary$DirectionType;

    if-ne v2, v3, :cond_0

    .line 131
    const/4 v1, 0x1

    goto :goto_0
.end method

.method public getBranch()Ljava/lang/String;
    .locals 1

    .prologue
    .line 11
    iget-object v0, p0, Lcom/thetransitapp/droid/model/Itinerary;->branch:Ljava/lang/String;

    return-object v0
.end method

.method public getClosestStop(Lcom/thetransitapp/droid/model/SimplePlacemark;)Lcom/thetransitapp/droid/model/Stop;
    .locals 8
    .param p1, "placeMark"    # Lcom/thetransitapp/droid/model/SimplePlacemark;

    .prologue
    .line 82
    const/4 v0, 0x0

    .line 83
    .local v0, "closest":Lcom/thetransitapp/droid/model/Stop;
    const-wide v3, 0x7fefffffffffffffL    # Double.MAX_VALUE

    .line 86
    .local v3, "minDistance":D
    iget-object v6, p0, Lcom/thetransitapp/droid/model/Itinerary;->stops:Ljava/util/List;

    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_0
    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-nez v7, :cond_1

    .line 94
    return-object v0

    .line 86
    :cond_1
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/thetransitapp/droid/model/Stop;

    .line 87
    .local v5, "stop":Lcom/thetransitapp/droid/model/Stop;
    invoke-virtual {v5, p1}, Lcom/thetransitapp/droid/model/Stop;->getDistance(Lcom/thetransitapp/droid/model/SimplePlacemark;)F

    move-result v7

    float-to-double v1, v7

    .line 89
    .local v1, "distance":D
    cmpl-double v7, v3, v1

    if-lez v7, :cond_0

    .line 90
    move-object v0, v5

    goto :goto_0
.end method

.method public getDefaultHeadsign()Ljava/lang/String;
    .locals 1

    .prologue
    .line 11
    iget-object v0, p0, Lcom/thetransitapp/droid/model/Itinerary;->defaultHeadsign:Ljava/lang/String;

    return-object v0
.end method

.method public getDirectionType()Lcom/thetransitapp/droid/model/Itinerary$DirectionType;
    .locals 1

    .prologue
    .line 11
    iget-object v0, p0, Lcom/thetransitapp/droid/model/Itinerary;->directionType:Lcom/thetransitapp/droid/model/Itinerary$DirectionType;

    return-object v0
.end method

.method public getGroupingKey(Lcom/thetransitapp/droid/model/Stop;)Ljava/lang/String;
    .locals 2
    .param p1, "stop"    # Lcom/thetransitapp/droid/model/Stop;

    .prologue
    .line 115
    iget-object v0, p0, Lcom/thetransitapp/droid/model/Itinerary;->directionType:Lcom/thetransitapp/droid/model/Itinerary$DirectionType;

    sget-object v1, Lcom/thetransitapp/droid/model/Itinerary$DirectionType;->UNDEFINED:Lcom/thetransitapp/droid/model/Itinerary$DirectionType;

    if-ne v0, v1, :cond_0

    invoke-virtual {p0, p1}, Lcom/thetransitapp/droid/model/Itinerary;->getHeadsign(Lcom/thetransitapp/droid/model/Stop;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/thetransitapp/droid/model/Itinerary;->branch:Ljava/lang/String;

    goto :goto_0
.end method

.method public getHeadsign(Lcom/thetransitapp/droid/model/Stop;)Ljava/lang/String;
    .locals 1
    .param p1, "stop"    # Lcom/thetransitapp/droid/model/Stop;

    .prologue
    .line 78
    iget-object v0, p0, Lcom/thetransitapp/droid/model/Itinerary;->defaultHeadsign:Ljava/lang/String;

    return-object v0
.end method

.method public getHeadsigns()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 11
    iget-object v0, p0, Lcom/thetransitapp/droid/model/Itinerary;->headsigns:Ljava/util/Map;

    return-object v0
.end method

.method public getId()Ljava/lang/String;
    .locals 1

    .prologue
    .line 11
    iget-object v0, p0, Lcom/thetransitapp/droid/model/Itinerary;->id:Ljava/lang/String;

    return-object v0
.end method

.method public getItineraryId()Ljava/lang/String;
    .locals 1

    .prologue
    .line 11
    iget-object v0, p0, Lcom/thetransitapp/droid/model/Itinerary;->itineraryId:Ljava/lang/String;

    return-object v0
.end method

.method public getRealTimeRouteID()Ljava/lang/String;
    .locals 1

    .prologue
    .line 11
    iget-object v0, p0, Lcom/thetransitapp/droid/model/Itinerary;->realTimeRouteID:Ljava/lang/String;

    return-object v0
.end method

.method public getRoute()Lcom/thetransitapp/droid/model/Route;
    .locals 1

    .prologue
    .line 11
    iget-object v0, p0, Lcom/thetransitapp/droid/model/Itinerary;->route:Lcom/thetransitapp/droid/model/Route;

    return-object v0
.end method

.method public getSchedule(Lcom/thetransitapp/droid/model/Stop;Lcom/thetransitapp/droid/model/ServiceDay;)Lcom/thetransitapp/droid/model/Schedule;
    .locals 4
    .param p1, "stop"    # Lcom/thetransitapp/droid/model/Stop;
    .param p2, "serviceDay"    # Lcom/thetransitapp/droid/model/ServiceDay;

    .prologue
    .line 42
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/thetransitapp/droid/model/Stop;->hashCode()I

    move-result v2

    invoke-virtual {p2}, Lcom/thetransitapp/droid/model/ServiceDay;->hashCode()I

    move-result v3

    add-int/2addr v2, v3

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 44
    .local v0, "key":Ljava/lang/String;
    iget-object v1, p0, Lcom/thetransitapp/droid/model/Itinerary;->schedules:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 45
    iget-object v1, p0, Lcom/thetransitapp/droid/model/Itinerary;->schedules:Ljava/util/Map;

    new-instance v2, Lcom/thetransitapp/droid/model/Schedule;

    invoke-direct {v2, p0, p1, p2}, Lcom/thetransitapp/droid/model/Schedule;-><init>(Lcom/thetransitapp/droid/model/Itinerary;Lcom/thetransitapp/droid/model/Stop;Lcom/thetransitapp/droid/model/ServiceDay;)V

    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    :cond_0
    iget-object v1, p0, Lcom/thetransitapp/droid/model/Itinerary;->schedules:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/thetransitapp/droid/model/Schedule;

    return-object v1
.end method

.method public getSchedules()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Lcom/thetransitapp/droid/model/Schedule;",
            ">;"
        }
    .end annotation

    .prologue
    .line 11
    iget-object v0, p0, Lcom/thetransitapp/droid/model/Itinerary;->schedules:Ljava/util/Map;

    return-object v0
.end method

.method public getShape()Ljava/lang/String;
    .locals 1

    .prologue
    .line 11
    iget-object v0, p0, Lcom/thetransitapp/droid/model/Itinerary;->shape:Ljava/lang/String;

    return-object v0
.end method

.method public getStops()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/thetransitapp/droid/model/Stop;",
            ">;"
        }
    .end annotation

    .prologue
    .line 11
    iget-object v0, p0, Lcom/thetransitapp/droid/model/Itinerary;->stops:Ljava/util/List;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    .prologue
    .line 120
    iget-object v0, p0, Lcom/thetransitapp/droid/model/Itinerary;->id:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    iget-object v1, p0, Lcom/thetransitapp/droid/model/Itinerary;->stops:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    iget-object v1, p0, Lcom/thetransitapp/droid/model/Itinerary;->directionType:Lcom/thetransitapp/droid/model/Itinerary$DirectionType;

    invoke-virtual {v1}, Lcom/thetransitapp/droid/model/Itinerary$DirectionType;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public isTripLoaded(Ljava/lang/String;)Z
    .locals 4
    .param p1, "tripId"    # Ljava/lang/String;

    .prologue
    .line 66
    const/4 v0, 0x0

    .line 68
    .local v0, "count":I
    iget-object v2, p0, Lcom/thetransitapp/droid/model/Itinerary;->schedules:Ljava/util/Map;

    invoke-interface {v2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_1

    .line 74
    const/4 v2, 0x2

    if-le v0, v2, :cond_2

    const/4 v2, 0x1

    :goto_1
    return v2

    .line 68
    :cond_1
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 69
    .local v1, "key":Ljava/lang/String;
    iget-object v2, p0, Lcom/thetransitapp/droid/model/Itinerary;->schedules:Ljava/util/Map;

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/thetransitapp/droid/model/Schedule;

    invoke-virtual {v2, p1}, Lcom/thetransitapp/droid/model/Schedule;->getScheduleItemForTrip(Ljava/lang/String;)Lcom/thetransitapp/droid/model/ScheduleItem;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 70
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 74
    .end local v1    # "key":Ljava/lang/String;
    :cond_2
    const/4 v2, 0x0

    goto :goto_1
.end method

.method public merge(Lcom/thetransitapp/droid/model/Itinerary;)V
    .locals 5
    .param p1, "itinerary"    # Lcom/thetransitapp/droid/model/Itinerary;

    .prologue
    .line 101
    invoke-virtual {p1}, Lcom/thetransitapp/droid/model/Itinerary;->getSchedules()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-nez v4, :cond_1

    .line 112
    return-void

    .line 101
    :cond_1
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 102
    .local v1, "key":Ljava/lang/String;
    iget-object v4, p0, Lcom/thetransitapp/droid/model/Itinerary;->schedules:Ljava/util/Map;

    invoke-interface {v4, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/thetransitapp/droid/model/Schedule;

    .line 103
    .local v0, "existing":Lcom/thetransitapp/droid/model/Schedule;
    iget-object v4, p1, Lcom/thetransitapp/droid/model/Itinerary;->schedules:Ljava/util/Map;

    invoke-interface {v4, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/thetransitapp/droid/model/Schedule;

    .line 105
    .local v2, "schedule":Lcom/thetransitapp/droid/model/Schedule;
    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/thetransitapp/droid/model/Schedule;->isComplete()Z

    move-result v4

    if-nez v4, :cond_0

    .line 109
    :cond_2
    invoke-virtual {v0}, Lcom/thetransitapp/droid/model/Schedule;->getRealTimeItems()Ljava/util/List;

    move-result-object v4

    invoke-virtual {v2, v4}, Lcom/thetransitapp/droid/model/Schedule;->mergeRealTime(Ljava/util/List;)V

    .line 110
    iget-object v4, p0, Lcom/thetransitapp/droid/model/Itinerary;->schedules:Ljava/util/Map;

    invoke-interface {v4, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0
.end method

.method public setBranch(Ljava/lang/String;)V
    .locals 0
    .param p1, "branch"    # Ljava/lang/String;

    .prologue
    .line 11
    iput-object p1, p0, Lcom/thetransitapp/droid/model/Itinerary;->branch:Ljava/lang/String;

    return-void
.end method

.method public setDefaultHeadsign(Ljava/lang/String;)V
    .locals 0
    .param p1, "defaultHeadsign"    # Ljava/lang/String;

    .prologue
    .line 11
    iput-object p1, p0, Lcom/thetransitapp/droid/model/Itinerary;->defaultHeadsign:Ljava/lang/String;

    return-void
.end method

.method public setDirectionType(Lcom/thetransitapp/droid/model/Itinerary$DirectionType;)V
    .locals 0
    .param p1, "directionType"    # Lcom/thetransitapp/droid/model/Itinerary$DirectionType;

    .prologue
    .line 11
    iput-object p1, p0, Lcom/thetransitapp/droid/model/Itinerary;->directionType:Lcom/thetransitapp/droid/model/Itinerary$DirectionType;

    return-void
.end method

.method public setHeadsigns(Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 11
    .local p1, "headsigns":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
    iput-object p1, p0, Lcom/thetransitapp/droid/model/Itinerary;->headsigns:Ljava/util/Map;

    return-void
.end method

.method public setId(Ljava/lang/String;)V
    .locals 0
    .param p1, "id"    # Ljava/lang/String;

    .prologue
    .line 11
    iput-object p1, p0, Lcom/thetransitapp/droid/model/Itinerary;->id:Ljava/lang/String;

    return-void
.end method

.method public setItineraryId(Ljava/lang/String;)V
    .locals 0
    .param p1, "itineraryId"    # Ljava/lang/String;

    .prologue
    .line 11
    iput-object p1, p0, Lcom/thetransitapp/droid/model/Itinerary;->itineraryId:Ljava/lang/String;

    return-void
.end method

.method public setRealTimeRouteID(Ljava/lang/String;)V
    .locals 0
    .param p1, "realTimeRouteID"    # Ljava/lang/String;

    .prologue
    .line 11
    iput-object p1, p0, Lcom/thetransitapp/droid/model/Itinerary;->realTimeRouteID:Ljava/lang/String;

    return-void
.end method

.method public setRoute(Lcom/thetransitapp/droid/model/Route;)V
    .locals 0
    .param p1, "route"    # Lcom/thetransitapp/droid/model/Route;

    .prologue
    .line 11
    iput-object p1, p0, Lcom/thetransitapp/droid/model/Itinerary;->route:Lcom/thetransitapp/droid/model/Route;

    return-void
.end method

.method public setSchedules(Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Lcom/thetransitapp/droid/model/Schedule;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 11
    .local p1, "schedules":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Lcom/thetransitapp/droid/model/Schedule;>;"
    iput-object p1, p0, Lcom/thetransitapp/droid/model/Itinerary;->schedules:Ljava/util/Map;

    return-void
.end method

.method public setShape(Ljava/lang/String;)V
    .locals 0
    .param p1, "shape"    # Ljava/lang/String;

    .prologue
    .line 11
    iput-object p1, p0, Lcom/thetransitapp/droid/model/Itinerary;->shape:Ljava/lang/String;

    return-void
.end method

.method public setStops(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/thetransitapp/droid/model/Stop;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 11
    .local p1, "stops":Ljava/util/List;, "Ljava/util/List<Lcom/thetransitapp/droid/model/Stop;>;"
    iput-object p1, p0, Lcom/thetransitapp/droid/model/Itinerary;->stops:Ljava/util/List;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 11
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Itinerary(id="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/Itinerary;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", itineraryId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/Itinerary;->getItineraryId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", route="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/Itinerary;->getRoute()Lcom/thetransitapp/droid/model/Route;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", shape="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/Itinerary;->getShape()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", stops="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/Itinerary;->getStops()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", directionType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/Itinerary;->getDirectionType()Lcom/thetransitapp/droid/model/Itinerary$DirectionType;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", branch="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/Itinerary;->getBranch()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", realTimeRouteID="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/Itinerary;->getRealTimeRouteID()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", defaultHeadsign="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/Itinerary;->getDefaultHeadsign()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", headsigns="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/Itinerary;->getHeadsigns()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", schedules="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/Itinerary;->getSchedules()Ljava/util/Map;

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
