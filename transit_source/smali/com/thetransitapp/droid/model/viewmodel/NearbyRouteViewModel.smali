.class public Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;
.super Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;
.source "NearbyRouteViewModel.java"


# static fields
.field private static final serialVersionUID:J = 0x2c606ae30e958fc5L


# instance fields
.field private currentDirection:Lcom/thetransitapp/droid/model/Itinerary$DirectionType;

.field private currentIndex:I

.field private transient databaseHelper:Lcom/thetransitapp/droid/data/TransitDatabaseHelper;

.field private directionGroups:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Lcom/thetransitapp/droid/model/Itinerary$DirectionType;",
            "Lcom/thetransitapp/droid/model/viewmodel/ItineraryDirectionGroup;",
            ">;"
        }
    .end annotation
.end field

.field private placemark:Lcom/thetransitapp/droid/model/SimplePlacemark;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 34
    invoke-direct {p0}, Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;-><init>()V

    .line 35
    return-void
.end method

.method public constructor <init>(Lcom/thetransitapp/droid/model/Route;Lcom/thetransitapp/droid/model/SimplePlacemark;Ljava/util/List;Lcom/thetransitapp/droid/data/TransitDatabaseHelper;)V
    .locals 4
    .param p1, "route"    # Lcom/thetransitapp/droid/model/Route;
    .param p2, "placemark"    # Lcom/thetransitapp/droid/model/SimplePlacemark;
    .param p4, "databaseHelper"    # Lcom/thetransitapp/droid/data/TransitDatabaseHelper;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/thetransitapp/droid/model/Route;",
            "Lcom/thetransitapp/droid/model/SimplePlacemark;",
            "Ljava/util/List",
            "<",
            "Lcom/thetransitapp/droid/model/ServiceDay;",
            ">;",
            "Lcom/thetransitapp/droid/data/TransitDatabaseHelper;",
            ")V"
        }
    .end annotation

    .prologue
    .local p3, "serviceDates":Ljava/util/List;, "Ljava/util/List<Lcom/thetransitapp/droid/model/ServiceDay;>;"
    const/4 v3, 0x0

    .line 45
    invoke-direct {p0, p1}, Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;-><init>(Lcom/thetransitapp/droid/model/Route;)V

    .line 47
    iput-object p4, p0, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->databaseHelper:Lcom/thetransitapp/droid/data/TransitDatabaseHelper;

    .line 48
    iput v3, p0, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->currentIndex:I

    .line 49
    iput-object p2, p0, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->placemark:Lcom/thetransitapp/droid/model/SimplePlacemark;

    .line 50
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iput-object v1, p0, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->directionGroups:Ljava/util/Map;

    .line 52
    invoke-virtual {p1}, Lcom/thetransitapp/droid/model/Route;->getItineraries()Ljava/util/List;

    move-result-object v1

    invoke-direct {p0, v1, p3}, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->groupItineraries(Ljava/util/List;Ljava/util/List;)V

    .line 54
    iget-object v1, p0, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->directionGroups:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    .line 55
    iget-object v1, p0, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->directionGroups:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/thetransitapp/droid/model/Itinerary$DirectionType;

    iput-object v1, p0, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->currentDirection:Lcom/thetransitapp/droid/model/Itinerary$DirectionType;

    .line 57
    invoke-virtual {p2}, Lcom/thetransitapp/droid/model/SimplePlacemark;->toLocation()Landroid/location/Location;

    move-result-object v1

    invoke-virtual {p4, p1, v1}, Lcom/thetransitapp/droid/data/TransitDatabaseHelper;->getSavedDirection(Lcom/thetransitapp/droid/model/Route;Landroid/location/Location;)Lcom/thetransitapp/droid/model/RouteDirection;

    move-result-object v0

    .line 59
    .local v0, "direction":Lcom/thetransitapp/droid/model/RouteDirection;
    if-eqz v0, :cond_0

    .line 60
    iget-object v1, p0, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->directionGroups:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-virtual {v0}, Lcom/thetransitapp/droid/model/RouteDirection;->getDirection()Lcom/thetransitapp/droid/model/Itinerary$DirectionType;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 61
    invoke-virtual {v0}, Lcom/thetransitapp/droid/model/RouteDirection;->getDirection()Lcom/thetransitapp/droid/model/Itinerary$DirectionType;

    move-result-object v1

    iput-object v1, p0, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->currentDirection:Lcom/thetransitapp/droid/model/Itinerary$DirectionType;

    .line 63
    iget-object v1, p0, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->currentDirection:Lcom/thetransitapp/droid/model/Itinerary$DirectionType;

    invoke-virtual {v0}, Lcom/thetransitapp/droid/model/RouteDirection;->getDirectionIndex()I

    move-result v2

    invoke-virtual {p0, v1, v2}, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->getItinerary(Lcom/thetransitapp/droid/model/Itinerary$DirectionType;I)Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 64
    invoke-virtual {v0}, Lcom/thetransitapp/droid/model/RouteDirection;->getDirectionIndex()I

    move-result v1

    iput v1, p0, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->currentIndex:I

    .line 71
    :cond_0
    :goto_0
    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->getCurrentItinerary()Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;

    move-result-object v1

    invoke-virtual {v1}, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->isActive()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->isActive()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 72
    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->getNextActiveItinerary()Z

    .line 75
    .end local v0    # "direction":Lcom/thetransitapp/droid/model/RouteDirection;
    :cond_1
    return-void

    .line 66
    .restart local v0    # "direction":Lcom/thetransitapp/droid/model/RouteDirection;
    :cond_2
    iput v3, p0, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->currentIndex:I

    goto :goto_0
.end method

.method public constructor <init>(Lcom/thetransitapp/droid/model/Route;Lcom/thetransitapp/droid/model/SimplePlacemark;ZLcom/thetransitapp/droid/data/TransitDatabaseHelper;)V
    .locals 1
    .param p1, "route"    # Lcom/thetransitapp/droid/model/Route;
    .param p2, "placemark"    # Lcom/thetransitapp/droid/model/SimplePlacemark;
    .param p3, "allowFuture"    # Z
    .param p4, "databaseHelper"    # Lcom/thetransitapp/droid/data/TransitDatabaseHelper;

    .prologue
    .line 39
    if-eqz p3, :cond_0

    invoke-static {}, Lcom/thetransitapp/droid/model/ServiceDay;->getNextWeekServiceDates()Ljava/util/List;

    move-result-object v0

    .line 40
    :goto_0
    invoke-direct {p0, p1, p2, v0, p4}, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;-><init>(Lcom/thetransitapp/droid/model/Route;Lcom/thetransitapp/droid/model/SimplePlacemark;Ljava/util/List;Lcom/thetransitapp/droid/data/TransitDatabaseHelper;)V

    .line 41
    return-void

    .line 39
    :cond_0
    invoke-static {}, Lcom/thetransitapp/droid/model/ServiceDay;->getActiveServiceDates()Ljava/util/List;

    move-result-object v0

    goto :goto_0
.end method

.method private findItinerariesForDirection(Ljava/util/List;Lcom/thetransitapp/droid/model/Itinerary$DirectionType;)Ljava/util/List;
    .locals 4
    .param p2, "direction"    # Lcom/thetransitapp/droid/model/Itinerary$DirectionType;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/thetransitapp/droid/model/Itinerary;",
            ">;",
            "Lcom/thetransitapp/droid/model/Itinerary$DirectionType;",
            ")",
            "Ljava/util/List",
            "<",
            "Lcom/thetransitapp/droid/model/Itinerary;",
            ">;"
        }
    .end annotation

    .prologue
    .line 262
    .local p1, "itineraries":Ljava/util/List;, "Ljava/util/List<Lcom/thetransitapp/droid/model/Itinerary;>;"
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 264
    .local v1, "result":Ljava/util/List;, "Ljava/util/List<Lcom/thetransitapp/droid/model/Itinerary;>;"
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-nez v3, :cond_1

    .line 270
    return-object v1

    .line 264
    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/thetransitapp/droid/model/Itinerary;

    .line 265
    .local v0, "itinerary":Lcom/thetransitapp/droid/model/Itinerary;
    invoke-virtual {v0}, Lcom/thetransitapp/droid/model/Itinerary;->getDirectionType()Lcom/thetransitapp/droid/model/Itinerary$DirectionType;

    move-result-object v3

    if-ne v3, p2, :cond_0

    .line 266
    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0
.end method

.method private final groupItineraries(Ljava/util/List;Ljava/util/List;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/thetransitapp/droid/model/Itinerary;",
            ">;",
            "Ljava/util/List",
            "<",
            "Lcom/thetransitapp/droid/model/ServiceDay;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 95
    .local p1, "itineraries":Ljava/util/List;, "Ljava/util/List<Lcom/thetransitapp/droid/model/Itinerary;>;"
    .local p2, "serviceDates":Ljava/util/List;, "Ljava/util/List<Lcom/thetransitapp/droid/model/ServiceDay;>;"
    invoke-static {}, Lcom/thetransitapp/droid/model/Itinerary$DirectionType;->values()[Lcom/thetransitapp/droid/model/Itinerary$DirectionType;

    move-result-object v4

    array-length v5, v4

    const/4 v3, 0x0

    :goto_0
    if-lt v3, v5, :cond_0

    .line 106
    return-void

    .line 95
    :cond_0
    aget-object v0, v4, v3

    .line 96
    .local v0, "direction":Lcom/thetransitapp/droid/model/Itinerary$DirectionType;
    invoke-direct {p0, p1, v0}, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->findItinerariesForDirection(Ljava/util/List;Lcom/thetransitapp/droid/model/Itinerary$DirectionType;)Ljava/util/List;

    move-result-object v1

    .line 98
    .local v1, "directionItineraries":Ljava/util/List;, "Ljava/util/List<Lcom/thetransitapp/droid/model/Itinerary;>;"
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v6

    if-nez v6, :cond_1

    .line 99
    invoke-direct {p0, v1, v0, p2}, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->mergeItineraries(Ljava/util/List;Lcom/thetransitapp/droid/model/Itinerary$DirectionType;Ljava/util/List;)Lcom/thetransitapp/droid/model/viewmodel/ItineraryDirectionGroup;

    move-result-object v2

    .line 101
    .local v2, "group":Lcom/thetransitapp/droid/model/viewmodel/ItineraryDirectionGroup;
    if-eqz v2, :cond_1

    .line 102
    iget-object v6, p0, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->directionGroups:Ljava/util/Map;

    invoke-interface {v6, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    .end local v2    # "group":Lcom/thetransitapp/droid/model/viewmodel/ItineraryDirectionGroup;
    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0
.end method

.method private mergeItineraries(Ljava/util/List;Lcom/thetransitapp/droid/model/Itinerary$DirectionType;Ljava/util/List;)Lcom/thetransitapp/droid/model/viewmodel/ItineraryDirectionGroup;
    .locals 12
    .param p2, "direction"    # Lcom/thetransitapp/droid/model/Itinerary$DirectionType;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/thetransitapp/droid/model/Itinerary;",
            ">;",
            "Lcom/thetransitapp/droid/model/Itinerary$DirectionType;",
            "Ljava/util/List",
            "<",
            "Lcom/thetransitapp/droid/model/ServiceDay;",
            ">;)",
            "Lcom/thetransitapp/droid/model/viewmodel/ItineraryDirectionGroup;"
        }
    .end annotation

    .prologue
    .line 216
    .local p1, "itineraries":Ljava/util/List;, "Ljava/util/List<Lcom/thetransitapp/droid/model/Itinerary;>;"
    .local p3, "serviceDates":Ljava/util/List;, "Ljava/util/List<Lcom/thetransitapp/droid/model/ServiceDay;>;"
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 221
    .local v3, "grouped":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;>;"
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_0
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-nez v9, :cond_2

    .line 232
    const/4 v8, 0x0

    .line 233
    .local v8, "placeholderItinerary":Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 235
    .local v4, "groupedItineraries":Ljava/util/List;, "Ljava/util/List<Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;>;"
    invoke-interface {v3}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v9

    invoke-interface {v9}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :cond_0
    :goto_1
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-nez v10, :cond_4

    .line 246
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v9

    if-eqz v9, :cond_1

    .line 247
    if-eqz v8, :cond_6

    .line 248
    invoke-interface {v4, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 254
    :cond_1
    new-instance v2, Lcom/thetransitapp/droid/model/viewmodel/ItineraryDirectionGroup;

    invoke-direct {v2}, Lcom/thetransitapp/droid/model/viewmodel/ItineraryDirectionGroup;-><init>()V

    .line 255
    .local v2, "directionGroup":Lcom/thetransitapp/droid/model/viewmodel/ItineraryDirectionGroup;
    invoke-virtual {v2, v4}, Lcom/thetransitapp/droid/model/viewmodel/ItineraryDirectionGroup;->setItineraries(Ljava/util/List;)V

    .line 256
    invoke-virtual {v2, p2}, Lcom/thetransitapp/droid/model/viewmodel/ItineraryDirectionGroup;->setDirectionType(Lcom/thetransitapp/droid/model/Itinerary$DirectionType;)V

    .line 258
    .end local v2    # "directionGroup":Lcom/thetransitapp/droid/model/viewmodel/ItineraryDirectionGroup;
    :goto_2
    return-object v2

    .line 221
    .end local v4    # "groupedItineraries":Ljava/util/List;, "Ljava/util/List<Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;>;"
    .end local v8    # "placeholderItinerary":Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;
    :cond_2
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/thetransitapp/droid/model/Itinerary;

    .line 222
    .local v5, "itinerary":Lcom/thetransitapp/droid/model/Itinerary;
    iget-object v9, p0, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->placemark:Lcom/thetransitapp/droid/model/SimplePlacemark;

    invoke-virtual {v5, v9}, Lcom/thetransitapp/droid/model/Itinerary;->getClosestStop(Lcom/thetransitapp/droid/model/SimplePlacemark;)Lcom/thetransitapp/droid/model/Stop;

    move-result-object v0

    .line 223
    .local v0, "closest":Lcom/thetransitapp/droid/model/Stop;
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Lcom/thetransitapp/droid/model/Itinerary;->getGroupingKey(Lcom/thetransitapp/droid/model/Stop;)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v11

    invoke-direct {v9, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/thetransitapp/droid/model/Stop;->getId()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v9, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 225
    .local v1, "closestKey":Ljava/lang/String;
    invoke-interface {v3, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_3

    .line 226
    new-instance v9, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;

    invoke-direct {v9, p0, v0, p3}, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;-><init>(Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;Lcom/thetransitapp/droid/model/Stop;Ljava/util/List;)V

    invoke-interface {v3, v1, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 229
    :cond_3
    invoke-interface {v3, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;

    invoke-virtual {v9}, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->getItineraries()Ljava/util/List;

    move-result-object v9

    invoke-interface {v9, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 235
    .end local v0    # "closest":Lcom/thetransitapp/droid/model/Stop;
    .end local v1    # "closestKey":Ljava/lang/String;
    .end local v5    # "itinerary":Lcom/thetransitapp/droid/model/Itinerary;
    .restart local v4    # "groupedItineraries":Ljava/util/List;, "Ljava/util/List<Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;>;"
    .restart local v8    # "placeholderItinerary":Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;
    :cond_4
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    .line 236
    .local v6, "key":Ljava/lang/String;
    invoke-interface {v3, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;

    .line 237
    .local v7, "merged":Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;
    invoke-virtual {v7}, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->updateServiceItem()V

    .line 239
    invoke-virtual {v7}, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->isActive()Z

    move-result v10

    if-eqz v10, :cond_5

    .line 240
    invoke-interface {v4, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 241
    :cond_5
    if-nez v8, :cond_0

    invoke-virtual {v7}, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->isTerminus()Z

    move-result v10

    if-nez v10, :cond_0

    .line 242
    move-object v8, v7

    goto :goto_1

    .line 250
    .end local v6    # "key":Ljava/lang/String;
    .end local v7    # "merged":Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;
    :cond_6
    const/4 v2, 0x0

    goto :goto_2
.end method


# virtual methods
.method public final getCurrentItinerary()Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;
    .locals 2

    .prologue
    .line 88
    iget-object v0, p0, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->currentDirection:Lcom/thetransitapp/droid/model/Itinerary$DirectionType;

    iget v1, p0, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->currentIndex:I

    invoke-virtual {p0, v0, v1}, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->getItinerary(Lcom/thetransitapp/droid/model/Itinerary$DirectionType;I)Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;

    move-result-object v0

    return-object v0
.end method

.method public getDirectionGroups()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map",
            "<",
            "Lcom/thetransitapp/droid/model/Itinerary$DirectionType;",
            "Lcom/thetransitapp/droid/model/viewmodel/ItineraryDirectionGroup;",
            ">;"
        }
    .end annotation

    .prologue
    .line 30
    iget-object v0, p0, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->directionGroups:Ljava/util/Map;

    return-object v0
.end method

.method public getDistance()D
    .locals 8

    .prologue
    .line 109
    const-wide v3, 0x7fefffffffffffffL    # Double.MAX_VALUE

    .line 112
    .local v3, "minDistance":D
    iget-object v5, p0, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->directionGroups:Ljava/util/Map;

    invoke-interface {v5}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_0
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-nez v6, :cond_1

    .line 120
    return-wide v3

    .line 112
    :cond_1
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/thetransitapp/droid/model/viewmodel/ItineraryDirectionGroup;

    .line 113
    .local v0, "directionGroup":Lcom/thetransitapp/droid/model/viewmodel/ItineraryDirectionGroup;
    iget-object v6, p0, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->placemark:Lcom/thetransitapp/droid/model/SimplePlacemark;

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->isActive()Z

    move-result v7

    invoke-virtual {v0, v6, v7}, Lcom/thetransitapp/droid/model/viewmodel/ItineraryDirectionGroup;->getDistance(Lcom/thetransitapp/droid/model/SimplePlacemark;Z)D

    move-result-wide v1

    .line 115
    .local v1, "distance":D
    cmpg-double v6, v1, v3

    if-gez v6, :cond_0

    .line 116
    move-wide v3, v1

    goto :goto_0
.end method

.method public getItinerary(Lcom/thetransitapp/droid/model/Itinerary$DirectionType;I)Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;
    .locals 3
    .param p1, "direction"    # Lcom/thetransitapp/droid/model/Itinerary$DirectionType;
    .param p2, "index"    # I

    .prologue
    const/4 v2, 0x0

    .line 147
    iget-object v1, p0, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->directionGroups:Ljava/util/Map;

    if-nez v1, :cond_0

    move-object v1, v2

    .line 157
    :goto_0
    return-object v1

    .line 151
    :cond_0
    iget-object v1, p0, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->directionGroups:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/thetransitapp/droid/model/viewmodel/ItineraryDirectionGroup;

    invoke-virtual {v1}, Lcom/thetransitapp/droid/model/viewmodel/ItineraryDirectionGroup;->getItineraries()Ljava/util/List;

    move-result-object v0

    .line 153
    .local v0, "itineraries":Ljava/util/List;, "Ljava/util/List<Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;>;"
    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-gt v1, p2, :cond_2

    :cond_1
    move-object v1, v2

    .line 154
    goto :goto_0

    .line 157
    :cond_2
    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;

    goto :goto_0
.end method

.method public getNextActiveItinerary()Z
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 161
    invoke-virtual {p0, v0, v0}, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->getNextItinerary(ZZ)Z

    move-result v0

    return v0
.end method

.method public getNextItinerary(Z)Z
    .locals 1
    .param p1, "allowInactive"    # Z

    .prologue
    .line 165
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->getNextItinerary(ZZ)Z

    move-result v0

    return v0
.end method

.method public getNextItinerary(ZZ)Z
    .locals 8
    .param p1, "allowInactive"    # Z
    .param p2, "save"    # Z

    .prologue
    .line 169
    iget-object v1, p0, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->currentDirection:Lcom/thetransitapp/droid/model/Itinerary$DirectionType;

    .line 170
    .local v1, "direction":Lcom/thetransitapp/droid/model/Itinerary$DirectionType;
    iget v2, p0, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->currentIndex:I

    .line 172
    .local v2, "index":I
    iget-object v5, p0, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->directionGroups:Ljava/util/Map;

    invoke-interface {v5}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    .line 173
    .local v3, "keyIterator":Ljava/util/Iterator;, "Ljava/util/Iterator<Lcom/thetransitapp/droid/model/Itinerary$DirectionType;>;"
    const/4 v0, 0x0

    .line 175
    .local v0, "changed":Z
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_4

    .line 178
    :cond_0
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .end local v1    # "direction":Lcom/thetransitapp/droid/model/Itinerary$DirectionType;
    check-cast v1, Lcom/thetransitapp/droid/model/Itinerary$DirectionType;

    .line 179
    .restart local v1    # "direction":Lcom/thetransitapp/droid/model/Itinerary$DirectionType;
    iget-object v5, p0, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->currentDirection:Lcom/thetransitapp/droid/model/Itinerary$DirectionType;

    if-eq v1, v5, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-nez v5, :cond_0

    .line 182
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 184
    iget-object v5, p0, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->directionGroups:Ljava/util/Map;

    invoke-interface {v5, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/thetransitapp/droid/model/viewmodel/ItineraryDirectionGroup;

    invoke-virtual {v5}, Lcom/thetransitapp/droid/model/viewmodel/ItineraryDirectionGroup;->getItineraries()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v5

    if-lt v2, v5, :cond_3

    .line 185
    const/4 v2, 0x0

    .line 187
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-nez v5, :cond_2

    .line 188
    iget-object v5, p0, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->directionGroups:Ljava/util/Map;

    invoke-interface {v5}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    .line 191
    :cond_2
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .end local v1    # "direction":Lcom/thetransitapp/droid/model/Itinerary$DirectionType;
    check-cast v1, Lcom/thetransitapp/droid/model/Itinerary$DirectionType;

    .line 194
    .restart local v1    # "direction":Lcom/thetransitapp/droid/model/Itinerary$DirectionType;
    :cond_3
    iget-object v5, p0, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->currentDirection:Lcom/thetransitapp/droid/model/Itinerary$DirectionType;

    if-ne v1, v5, :cond_6

    iget v5, p0, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->currentIndex:I

    if-ne v2, v5, :cond_6

    const/4 v0, 0x0

    .line 195
    :goto_0
    if-nez p1, :cond_4

    invoke-virtual {p0, v1, v2}, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->getItinerary(Lcom/thetransitapp/droid/model/Itinerary$DirectionType;I)Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;

    move-result-object v5

    invoke-virtual {v5}, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->isActive()Z

    move-result v5

    if-nez v5, :cond_4

    if-nez v0, :cond_1

    .line 198
    :cond_4
    if-eqz v0, :cond_5

    .line 199
    iput-object v1, p0, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->currentDirection:Lcom/thetransitapp/droid/model/Itinerary$DirectionType;

    .line 200
    iput v2, p0, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->currentIndex:I

    .line 202
    if-eqz p2, :cond_5

    .line 203
    new-instance v4, Lcom/thetransitapp/droid/model/RouteDirection;

    invoke-direct {v4}, Lcom/thetransitapp/droid/model/RouteDirection;-><init>()V

    .line 204
    .local v4, "routeDirection":Lcom/thetransitapp/droid/model/RouteDirection;
    iget-object v5, p0, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->currentDirection:Lcom/thetransitapp/droid/model/Itinerary$DirectionType;

    invoke-virtual {v4, v5}, Lcom/thetransitapp/droid/model/RouteDirection;->setDirection(Lcom/thetransitapp/droid/model/Itinerary$DirectionType;)V

    .line 205
    iget v5, p0, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->currentIndex:I

    invoke-virtual {v4, v5}, Lcom/thetransitapp/droid/model/RouteDirection;->setDirectionIndex(I)V

    .line 207
    iget-object v5, p0, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->databaseHelper:Lcom/thetransitapp/droid/data/TransitDatabaseHelper;

    invoke-super {p0}, Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;->getRoute()Lcom/thetransitapp/droid/model/Route;

    move-result-object v6

    iget-object v7, p0, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->placemark:Lcom/thetransitapp/droid/model/SimplePlacemark;

    invoke-virtual {v7}, Lcom/thetransitapp/droid/model/SimplePlacemark;->toLocation()Landroid/location/Location;

    move-result-object v7

    invoke-virtual {v5, v6, v4, v7}, Lcom/thetransitapp/droid/data/TransitDatabaseHelper;->saveDirection(Lcom/thetransitapp/droid/model/Route;Lcom/thetransitapp/droid/model/RouteDirection;Landroid/location/Location;)V

    .line 211
    .end local v4    # "routeDirection":Lcom/thetransitapp/droid/model/RouteDirection;
    :cond_5
    return v0

    .line 194
    :cond_6
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public getPlacemark()Lcom/thetransitapp/droid/model/SimplePlacemark;
    .locals 1

    .prologue
    .line 27
    iget-object v0, p0, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->placemark:Lcom/thetransitapp/droid/model/SimplePlacemark;

    return-object v0
.end method

.method public getPoint()D
    .locals 8

    .prologue
    .line 124
    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->getDistance()D

    move-result-wide v1

    .line 126
    .local v1, "point":D
    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->getRoute()Lcom/thetransitapp/droid/model/Route;

    move-result-object v4

    invoke-virtual {v4}, Lcom/thetransitapp/droid/model/Route;->isFavorite()Z

    move-result v4

    if-eqz v4, :cond_0

    .line 127
    const-wide v4, 0x3fa999999999999aL    # 0.05

    mul-double/2addr v1, v4

    .line 130
    :cond_0
    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->getRoute()Lcom/thetransitapp/droid/model/Route;

    move-result-object v4

    invoke-virtual {v4}, Lcom/thetransitapp/droid/model/Route;->getType()Lcom/thetransitapp/droid/model/Route$RouteType;

    move-result-object v4

    invoke-virtual {v4}, Lcom/thetransitapp/droid/model/Route$RouteType;->ordinal()I

    move-result v4

    const/4 v5, 0x3

    if-ge v4, v5, :cond_1

    .line 131
    const-wide/high16 v4, 0x3fe0000000000000L    # 0.5

    mul-double/2addr v1, v4

    .line 134
    :cond_1
    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->getCurrentItinerary()Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;

    move-result-object v4

    invoke-virtual {v4}, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->getCurrentScheduleItem()Lcom/thetransitapp/droid/model/ScheduleItem;

    move-result-object v3

    .line 135
    .local v3, "scheduleItem":Lcom/thetransitapp/droid/model/ScheduleItem;
    if-eqz v3, :cond_2

    .line 136
    invoke-virtual {v3}, Lcom/thetransitapp/droid/model/ScheduleItem;->getMinutesRemaining()I

    move-result v0

    .line 138
    .local v0, "minutesRemaining":I
    if-lez v0, :cond_2

    const/16 v4, 0x5a

    if-ge v0, v4, :cond_2

    .line 139
    int-to-double v4, v0

    const-wide v6, 0x3fe3333333333333L    # 0.6

    mul-double/2addr v4, v6

    add-double/2addr v1, v4

    .line 143
    .end local v0    # "minutesRemaining":I
    :cond_2
    return-wide v1
.end method

.method public final isActive()Z
    .locals 3

    .prologue
    .line 78
    iget-object v1, p0, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->directionGroups:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_1

    .line 84
    const/4 v1, 0x0

    :goto_0
    return v1

    .line 78
    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/thetransitapp/droid/model/viewmodel/ItineraryDirectionGroup;

    .line 79
    .local v0, "directionGroup":Lcom/thetransitapp/droid/model/viewmodel/ItineraryDirectionGroup;
    invoke-virtual {v0}, Lcom/thetransitapp/droid/model/viewmodel/ItineraryDirectionGroup;->isActive()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 80
    const/4 v1, 0x1

    goto :goto_0
.end method
