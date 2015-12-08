.class public Lcom/thetransitapp/droid/model/viewmodel/ItineraryDirectionGroup;
.super Ljava/lang/Object;
.source "ItineraryDirectionGroup.java"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field private static final serialVersionUID:J = -0x1c0b9071a9dab1a7L


# instance fields
.field private directionType:Lcom/thetransitapp/droid/model/Itinerary$DirectionType;

.field private itineraries:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public canEqual(Ljava/lang/Object;)Z
    .locals 1
    .param p1, "other"    # Ljava/lang/Object;

    .prologue
    .line 11
    instance-of v0, p1, Lcom/thetransitapp/droid/model/viewmodel/ItineraryDirectionGroup;

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 8
    .param p1, "o"    # Ljava/lang/Object;

    .prologue
    const/4 v5, 0x1

    const/4 v6, 0x0

    .line 11
    if-ne p1, p0, :cond_1

    :cond_0
    :goto_0
    return v5

    :cond_1
    instance-of v7, p1, Lcom/thetransitapp/droid/model/viewmodel/ItineraryDirectionGroup;

    if-nez v7, :cond_2

    move v5, v6

    goto :goto_0

    :cond_2
    move-object v0, p1

    check-cast v0, Lcom/thetransitapp/droid/model/viewmodel/ItineraryDirectionGroup;

    .local v0, "other":Lcom/thetransitapp/droid/model/viewmodel/ItineraryDirectionGroup;
    invoke-virtual {v0, p0}, Lcom/thetransitapp/droid/model/viewmodel/ItineraryDirectionGroup;->canEqual(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_3

    move v5, v6

    goto :goto_0

    :cond_3
    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/viewmodel/ItineraryDirectionGroup;->getItineraries()Ljava/util/List;

    move-result-object v4

    .local v4, "this$itineraries":Ljava/util/List;
    invoke-virtual {v0}, Lcom/thetransitapp/droid/model/viewmodel/ItineraryDirectionGroup;->getItineraries()Ljava/util/List;

    move-result-object v2

    .local v2, "other$itineraries":Ljava/util/List;
    if-nez v4, :cond_5

    if-eqz v2, :cond_6

    :cond_4
    move v5, v6

    goto :goto_0

    :cond_5
    invoke-virtual {v4, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    :cond_6
    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/viewmodel/ItineraryDirectionGroup;->getDirectionType()Lcom/thetransitapp/droid/model/Itinerary$DirectionType;

    move-result-object v3

    .local v3, "this$directionType":Lcom/thetransitapp/droid/model/Itinerary$DirectionType;
    invoke-virtual {v0}, Lcom/thetransitapp/droid/model/viewmodel/ItineraryDirectionGroup;->getDirectionType()Lcom/thetransitapp/droid/model/Itinerary$DirectionType;

    move-result-object v1

    .local v1, "other$directionType":Lcom/thetransitapp/droid/model/Itinerary$DirectionType;
    if-nez v3, :cond_7

    if-eqz v1, :cond_0

    :goto_1
    move v5, v6

    goto :goto_0

    :cond_7
    invoke-virtual {v3, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_0

    goto :goto_1
.end method

.method public getDirectionType()Lcom/thetransitapp/droid/model/Itinerary$DirectionType;
    .locals 1

    .prologue
    .line 11
    iget-object v0, p0, Lcom/thetransitapp/droid/model/viewmodel/ItineraryDirectionGroup;->directionType:Lcom/thetransitapp/droid/model/Itinerary$DirectionType;

    return-object v0
.end method

.method public getDistance(Lcom/thetransitapp/droid/model/SimplePlacemark;Z)D
    .locals 7
    .param p1, "location"    # Lcom/thetransitapp/droid/model/SimplePlacemark;
    .param p2, "onlyActive"    # Z

    .prologue
    .line 19
    const-wide v3, 0x7fefffffffffffffL    # Double.MAX_VALUE

    .line 22
    .local v3, "minDistance":D
    iget-object v5, p0, Lcom/thetransitapp/droid/model/viewmodel/ItineraryDirectionGroup;->itineraries:Ljava/util/List;

    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_0
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-nez v6, :cond_1

    .line 32
    return-wide v3

    .line 22
    :cond_1
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;

    .line 23
    .local v2, "itinerary":Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;
    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->isActive()Z

    move-result v6

    if-nez v6, :cond_2

    if-nez p2, :cond_0

    .line 24
    :cond_2
    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->getClosestStop()Lcom/thetransitapp/droid/model/Stop;

    move-result-object v6

    invoke-virtual {v6, p1}, Lcom/thetransitapp/droid/model/Stop;->getDistance(Lcom/thetransitapp/droid/model/SimplePlacemark;)F

    move-result v6

    float-to-double v0, v6

    .line 26
    .local v0, "distance":D
    cmpg-double v6, v0, v3

    if-gez v6, :cond_0

    .line 27
    move-wide v3, v0

    goto :goto_0
.end method

.method public getItineraries()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;",
            ">;"
        }
    .end annotation

    .prologue
    .line 11
    iget-object v0, p0, Lcom/thetransitapp/droid/model/viewmodel/ItineraryDirectionGroup;->itineraries:Ljava/util/List;

    return-object v0
.end method

.method public hashCode()I
    .locals 6

    .prologue
    const/4 v5, 0x0

    .line 11
    const/16 v2, 0x1f

    .local v2, "PRIME":I
    const/4 v3, 0x1

    .local v3, "result":I
    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/viewmodel/ItineraryDirectionGroup;->getItineraries()Ljava/util/List;

    move-result-object v1

    .local v1, "$itineraries":Ljava/util/List;
    if-nez v1, :cond_0

    move v4, v5

    :goto_0
    add-int/lit8 v3, v4, 0x1f

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/viewmodel/ItineraryDirectionGroup;->getDirectionType()Lcom/thetransitapp/droid/model/Itinerary$DirectionType;

    move-result-object v0

    .local v0, "$directionType":Lcom/thetransitapp/droid/model/Itinerary$DirectionType;
    mul-int/lit8 v4, v3, 0x1f

    if-nez v0, :cond_1

    :goto_1
    add-int v3, v4, v5

    return v3

    .end local v0    # "$directionType":Lcom/thetransitapp/droid/model/Itinerary$DirectionType;
    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v4

    goto :goto_0

    .restart local v0    # "$directionType":Lcom/thetransitapp/droid/model/Itinerary$DirectionType;
    :cond_1
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v5

    goto :goto_1
.end method

.method public isActive()Z
    .locals 3

    .prologue
    .line 36
    iget-object v1, p0, Lcom/thetransitapp/droid/model/viewmodel/ItineraryDirectionGroup;->itineraries:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_1

    .line 42
    const/4 v1, 0x0

    :goto_0
    return v1

    .line 36
    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;

    .line 37
    .local v0, "itinerary":Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;
    invoke-virtual {v0}, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->isActive()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 38
    const/4 v1, 0x1

    goto :goto_0
.end method

.method public setDirectionType(Lcom/thetransitapp/droid/model/Itinerary$DirectionType;)V
    .locals 0
    .param p1, "directionType"    # Lcom/thetransitapp/droid/model/Itinerary$DirectionType;

    .prologue
    .line 11
    iput-object p1, p0, Lcom/thetransitapp/droid/model/viewmodel/ItineraryDirectionGroup;->directionType:Lcom/thetransitapp/droid/model/Itinerary$DirectionType;

    return-void
.end method

.method public setItineraries(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 11
    .local p1, "itineraries":Ljava/util/List;, "Ljava/util/List<Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;>;"
    iput-object p1, p0, Lcom/thetransitapp/droid/model/viewmodel/ItineraryDirectionGroup;->itineraries:Ljava/util/List;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 11
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "ItineraryDirectionGroup(itineraries="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/viewmodel/ItineraryDirectionGroup;->getItineraries()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", directionType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/viewmodel/ItineraryDirectionGroup;->getDirectionType()Lcom/thetransitapp/droid/model/Itinerary$DirectionType;

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
