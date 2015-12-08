.class public Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;
.super Ljava/lang/Object;
.source "MergedItinerary.java"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field private static final SCHEDULE_ITEM_END_INTERVAL:J = 0x5265c0L

.field private static final SCHEDULE_ITEM_START_INTERVAL:J = -0xdbba0L

.field private static final serialVersionUID:J = 0x94c4154b9a6e42aL


# instance fields
.field private closestStop:Lcom/thetransitapp/droid/model/Stop;

.field private currentScheduleItem:Lcom/thetransitapp/droid/model/ScheduleItem;

.field private itineraries:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/thetransitapp/droid/model/Itinerary;",
            ">;"
        }
    .end annotation
.end field

.field private ongoingScheduleItems:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/thetransitapp/droid/model/ScheduleItem;",
            ">;"
        }
    .end annotation
.end field

.field private placeholderHeadsign:Ljava/lang/String;

.field private predictionsFetchDate:Ljava/util/Date;

.field private route:Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;

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

.field private serviceDates:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/thetransitapp/droid/model/ServiceDay;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;Lcom/thetransitapp/droid/model/Stop;Ljava/util/List;)V
    .locals 1
    .param p1, "route"    # Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;
    .param p2, "stop"    # Lcom/thetransitapp/droid/model/Stop;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;",
            "Lcom/thetransitapp/droid/model/Stop;",
            "Ljava/util/List",
            "<",
            "Lcom/thetransitapp/droid/model/ServiceDay;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 46
    .local p3, "serviceDates":Ljava/util/List;, "Ljava/util/List<Lcom/thetransitapp/droid/model/ServiceDay;>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 47
    iput-object p1, p0, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->route:Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;

    .line 48
    iput-object p2, p0, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->closestStop:Lcom/thetransitapp/droid/model/Stop;

    .line 49
    iput-object p3, p0, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->serviceDates:Ljava/util/List;

    .line 50
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->itineraries:Ljava/util/List;

    .line 51
    return-void
.end method

.method static synthetic access$0(Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;Lcom/thetransitapp/droid/model/ScheduleItem;)V
    .locals 0

    .prologue
    .line 41
    iput-object p1, p0, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->currentScheduleItem:Lcom/thetransitapp/droid/model/ScheduleItem;

    return-void
.end method


# virtual methods
.method public canEqual(Ljava/lang/Object;)Z
    .locals 1
    .param p1, "other"    # Ljava/lang/Object;

    .prologue
    .line 26
    instance-of v0, p1, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 22
    .param p1, "o"    # Ljava/lang/Object;

    .prologue
    .line 26
    move-object/from16 v0, p1

    move-object/from16 v1, p0

    if-ne v0, v1, :cond_0

    const/16 v21, 0x1

    :goto_0
    return v21

    :cond_0
    move-object/from16 v0, p1

    instance-of v0, v0, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;

    move/from16 v21, v0

    if-nez v21, :cond_1

    const/16 v21, 0x0

    goto :goto_0

    :cond_1
    move-object/from16 v2, p1

    check-cast v2, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;

    .local v2, "other":Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;
    move-object/from16 v0, p0

    invoke-virtual {v2, v0}, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->canEqual(Ljava/lang/Object;)Z

    move-result v21

    if-nez v21, :cond_2

    const/16 v21, 0x0

    goto :goto_0

    :cond_2
    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->getRoute()Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;

    move-result-object v18

    .local v18, "this$route":Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;
    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->getRoute()Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;

    move-result-object v9

    .local v9, "other$route":Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;
    if-nez v18, :cond_4

    if-eqz v9, :cond_5

    :cond_3
    const/16 v21, 0x0

    goto :goto_0

    :cond_4
    move-object/from16 v0, v18

    invoke-virtual {v0, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v21

    if-eqz v21, :cond_3

    :cond_5
    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->getClosestStop()Lcom/thetransitapp/droid/model/Stop;

    move-result-object v12

    .local v12, "this$closestStop":Lcom/thetransitapp/droid/model/Stop;
    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->getClosestStop()Lcom/thetransitapp/droid/model/Stop;

    move-result-object v3

    .local v3, "other$closestStop":Lcom/thetransitapp/droid/model/Stop;
    if-nez v12, :cond_7

    if-eqz v3, :cond_8

    :cond_6
    const/16 v21, 0x0

    goto :goto_0

    :cond_7
    invoke-virtual {v12, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v21

    if-eqz v21, :cond_6

    :cond_8
    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->getItineraries()Ljava/util/List;

    move-result-object v14

    .local v14, "this$itineraries":Ljava/util/List;
    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->getItineraries()Ljava/util/List;

    move-result-object v5

    .local v5, "other$itineraries":Ljava/util/List;
    if-nez v14, :cond_a

    if-eqz v5, :cond_b

    :cond_9
    const/16 v21, 0x0

    goto :goto_0

    :cond_a
    invoke-virtual {v14, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v21

    if-eqz v21, :cond_9

    :cond_b
    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->getServiceDates()Ljava/util/List;

    move-result-object v20

    .local v20, "this$serviceDates":Ljava/util/List;
    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->getServiceDates()Ljava/util/List;

    move-result-object v11

    .local v11, "other$serviceDates":Ljava/util/List;
    if-nez v20, :cond_d

    if-eqz v11, :cond_e

    :cond_c
    const/16 v21, 0x0

    goto :goto_0

    :cond_d
    move-object/from16 v0, v20

    invoke-virtual {v0, v11}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v21

    if-eqz v21, :cond_c

    :cond_e
    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->getScheduleItems()Ljava/util/List;

    move-result-object v19

    .local v19, "this$scheduleItems":Ljava/util/List;
    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->getScheduleItems()Ljava/util/List;

    move-result-object v10

    .local v10, "other$scheduleItems":Ljava/util/List;
    if-nez v19, :cond_10

    if-eqz v10, :cond_11

    :cond_f
    const/16 v21, 0x0

    goto/16 :goto_0

    :cond_10
    move-object/from16 v0, v19

    invoke-virtual {v0, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v21

    if-eqz v21, :cond_f

    :cond_11
    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->getOngoingScheduleItems()Ljava/util/List;

    move-result-object v15

    .local v15, "this$ongoingScheduleItems":Ljava/util/List;
    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->getOngoingScheduleItems()Ljava/util/List;

    move-result-object v6

    .local v6, "other$ongoingScheduleItems":Ljava/util/List;
    if-nez v15, :cond_13

    if-eqz v6, :cond_14

    :cond_12
    const/16 v21, 0x0

    goto/16 :goto_0

    :cond_13
    invoke-virtual {v15, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v21

    if-eqz v21, :cond_12

    :cond_14
    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->getCurrentScheduleItem()Lcom/thetransitapp/droid/model/ScheduleItem;

    move-result-object v13

    .local v13, "this$currentScheduleItem":Lcom/thetransitapp/droid/model/ScheduleItem;
    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->getCurrentScheduleItem()Lcom/thetransitapp/droid/model/ScheduleItem;

    move-result-object v4

    .local v4, "other$currentScheduleItem":Lcom/thetransitapp/droid/model/ScheduleItem;
    if-nez v13, :cond_16

    if-eqz v4, :cond_17

    :cond_15
    const/16 v21, 0x0

    goto/16 :goto_0

    :cond_16
    invoke-virtual {v13, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v21

    if-eqz v21, :cond_15

    :cond_17
    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->getPlaceholderHeadsign()Ljava/lang/String;

    move-result-object v16

    .local v16, "this$placeholderHeadsign":Ljava/lang/String;
    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->getPlaceholderHeadsign()Ljava/lang/String;

    move-result-object v7

    .local v7, "other$placeholderHeadsign":Ljava/lang/String;
    if-nez v16, :cond_19

    if-eqz v7, :cond_1a

    :cond_18
    const/16 v21, 0x0

    goto/16 :goto_0

    :cond_19
    move-object/from16 v0, v16

    invoke-virtual {v0, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v21

    if-eqz v21, :cond_18

    :cond_1a
    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->getPredictionsFetchDate()Ljava/util/Date;

    move-result-object v17

    .local v17, "this$predictionsFetchDate":Ljava/util/Date;
    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->getPredictionsFetchDate()Ljava/util/Date;

    move-result-object v8

    .local v8, "other$predictionsFetchDate":Ljava/util/Date;
    if-nez v17, :cond_1c

    if-eqz v8, :cond_1d

    :cond_1b
    const/16 v21, 0x0

    goto/16 :goto_0

    :cond_1c
    move-object/from16 v0, v17

    invoke-virtual {v0, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v21

    if-eqz v21, :cond_1b

    :cond_1d
    const/16 v21, 0x1

    goto/16 :goto_0
.end method

.method public getBranch()Ljava/lang/String;
    .locals 2

    .prologue
    .line 81
    iget-object v0, p0, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->itineraries:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/thetransitapp/droid/model/Itinerary;

    invoke-virtual {v0}, Lcom/thetransitapp/droid/model/Itinerary;->getBranch()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getClosestStop()Lcom/thetransitapp/droid/model/Stop;
    .locals 1

    .prologue
    .line 26
    iget-object v0, p0, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->closestStop:Lcom/thetransitapp/droid/model/Stop;

    return-object v0
.end method

.method public getCurrentHeadsign()Ljava/lang/String;
    .locals 1

    .prologue
    .line 73
    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->getCurrentScheduleItem()Lcom/thetransitapp/droid/model/ScheduleItem;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 74
    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->getCurrentScheduleItem()Lcom/thetransitapp/droid/model/ScheduleItem;

    move-result-object v0

    invoke-virtual {v0}, Lcom/thetransitapp/droid/model/ScheduleItem;->getHeadsign()Ljava/lang/String;

    move-result-object v0

    .line 77
    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->placeholderHeadsign:Ljava/lang/String;

    goto :goto_0
.end method

.method public getCurrentScheduleItem()Lcom/thetransitapp/droid/model/ScheduleItem;
    .locals 3

    .prologue
    .line 222
    iget-object v1, p0, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->currentScheduleItem:Lcom/thetransitapp/droid/model/ScheduleItem;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->currentScheduleItem:Lcom/thetransitapp/droid/model/ScheduleItem;

    invoke-virtual {v1}, Lcom/thetransitapp/droid/model/ScheduleItem;->isPastItem()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 223
    :cond_0
    iget-object v1, p0, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->ongoingScheduleItems:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_3

    .line 233
    :cond_2
    :goto_0
    iget-object v1, p0, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->currentScheduleItem:Lcom/thetransitapp/droid/model/ScheduleItem;

    return-object v1

    .line 223
    :cond_3
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/thetransitapp/droid/model/ScheduleItem;

    .line 224
    .local v0, "item":Lcom/thetransitapp/droid/model/ScheduleItem;
    iput-object v0, p0, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->currentScheduleItem:Lcom/thetransitapp/droid/model/ScheduleItem;

    .line 225
    iget-object v2, p0, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->currentScheduleItem:Lcom/thetransitapp/droid/model/ScheduleItem;

    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/ScheduleItem;->getHeadsign()Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->placeholderHeadsign:Ljava/lang/String;

    .line 227
    invoke-virtual {v0}, Lcom/thetransitapp/droid/model/ScheduleItem;->isPastItem()Z

    move-result v2

    if-nez v2, :cond_1

    goto :goto_0
.end method

.method public getItineraries()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/thetransitapp/droid/model/Itinerary;",
            ">;"
        }
    .end annotation

    .prologue
    .line 26
    iget-object v0, p0, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->itineraries:Ljava/util/List;

    return-object v0
.end method

.method public getOngoingScheduleItems()Ljava/util/List;
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
    .line 26
    iget-object v0, p0, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->ongoingScheduleItems:Ljava/util/List;

    return-object v0
.end method

.method public getPlaceholderHeadsign()Ljava/lang/String;
    .locals 1

    .prologue
    .line 26
    iget-object v0, p0, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->placeholderHeadsign:Ljava/lang/String;

    return-object v0
.end method

.method public getPredictionsFetchDate()Ljava/util/Date;
    .locals 1

    .prologue
    .line 26
    iget-object v0, p0, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->predictionsFetchDate:Ljava/util/Date;

    return-object v0
.end method

.method public getRealTimeDataSource()Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;
    .locals 4

    .prologue
    .line 119
    iget-object v3, p0, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->route:Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;

    invoke-virtual {v3}, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->getFeed()Lcom/thetransitapp/droid/model/Feed;

    move-result-object v1

    .line 120
    .local v1, "feed":Lcom/thetransitapp/droid/model/Feed;
    if-eqz v1, :cond_0

    .line 121
    invoke-virtual {v1}, Lcom/thetransitapp/droid/model/Feed;->getRealTimeDataSource()Lcom/thetransitapp/droid/model/realtime/FeedRealTimeDataSource;

    move-result-object v0

    .line 122
    .local v0, "dataSource":Lcom/thetransitapp/droid/model/realtime/FeedRealTimeDataSource;
    if-eqz v0, :cond_0

    .line 123
    iget-object v3, p0, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->route:Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;

    invoke-virtual {v0, v3}, Lcom/thetransitapp/droid/model/realtime/FeedRealTimeDataSource;->dataSourceForRoute(Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;)Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;

    move-result-object v2

    .line 127
    .end local v0    # "dataSource":Lcom/thetransitapp/droid/model/realtime/FeedRealTimeDataSource;
    :goto_0
    return-object v2

    :cond_0
    const/4 v2, 0x0

    goto :goto_0
.end method

.method public getRealTimeRouteId()Ljava/lang/String;
    .locals 2

    .prologue
    .line 85
    iget-object v0, p0, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->itineraries:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/thetransitapp/droid/model/Itinerary;

    invoke-virtual {v0}, Lcom/thetransitapp/droid/model/Itinerary;->getRealTimeRouteID()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getRealTimeStopId()Ljava/lang/String;
    .locals 1

    .prologue
    .line 89
    iget-object v0, p0, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->closestStop:Lcom/thetransitapp/droid/model/Stop;

    invoke-virtual {v0}, Lcom/thetransitapp/droid/model/Stop;->getRealTimeId()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getRoute()Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;
    .locals 1

    .prologue
    .line 26
    iget-object v0, p0, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->route:Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;

    return-object v0
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
    .line 26
    iget-object v0, p0, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->scheduleItems:Ljava/util/List;

    return-object v0
.end method

.method public getScheduleItems(Lcom/thetransitapp/droid/model/ServiceDay;)Ljava/util/List;
    .locals 4
    .param p1, "serviceDate"    # Lcom/thetransitapp/droid/model/ServiceDay;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/thetransitapp/droid/model/ServiceDay;",
            ")",
            "Ljava/util/List",
            "<",
            "Lcom/thetransitapp/droid/model/ScheduleItem;",
            ">;"
        }
    .end annotation

    .prologue
    .line 93
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 95
    .local v1, "result":Ljava/util/List;, "Ljava/util/List<Lcom/thetransitapp/droid/model/ScheduleItem;>;"
    iget-object v2, p0, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->scheduleItems:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-nez v3, :cond_1

    .line 101
    return-object v1

    .line 95
    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/thetransitapp/droid/model/ScheduleItem;

    .line 96
    .local v0, "item":Lcom/thetransitapp/droid/model/ScheduleItem;
    invoke-virtual {v0}, Lcom/thetransitapp/droid/model/ScheduleItem;->getServiceDay()Lcom/thetransitapp/droid/model/ServiceDay;

    move-result-object v3

    invoke-virtual {v3, p1}, Lcom/thetransitapp/droid/model/ServiceDay;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {v0}, Lcom/thetransitapp/droid/model/ScheduleItem;->isCancelled()Z

    move-result v3

    if-nez v3, :cond_0

    .line 97
    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0
.end method

.method public getServiceDates()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/thetransitapp/droid/model/ServiceDay;",
            ">;"
        }
    .end annotation

    .prologue
    .line 26
    iget-object v0, p0, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->serviceDates:Ljava/util/List;

    return-object v0
.end method

.method public hashCode()I
    .locals 14

    .prologue
    const/4 v12, 0x0

    .line 26
    const/16 v9, 0x1f

    .local v9, "PRIME":I
    const/4 v10, 0x1

    .local v10, "result":I
    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->getRoute()Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;

    move-result-object v6

    .local v6, "$route":Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;
    if-nez v6, :cond_0

    move v11, v12

    :goto_0
    add-int/lit8 v10, v11, 0x1f

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->getClosestStop()Lcom/thetransitapp/droid/model/Stop;

    move-result-object v0

    .local v0, "$closestStop":Lcom/thetransitapp/droid/model/Stop;
    mul-int/lit8 v13, v10, 0x1f

    if-nez v0, :cond_1

    move v11, v12

    :goto_1
    add-int v10, v13, v11

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->getItineraries()Ljava/util/List;

    move-result-object v2

    .local v2, "$itineraries":Ljava/util/List;
    mul-int/lit8 v13, v10, 0x1f

    if-nez v2, :cond_2

    move v11, v12

    :goto_2
    add-int v10, v13, v11

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->getServiceDates()Ljava/util/List;

    move-result-object v8

    .local v8, "$serviceDates":Ljava/util/List;
    mul-int/lit8 v13, v10, 0x1f

    if-nez v8, :cond_3

    move v11, v12

    :goto_3
    add-int v10, v13, v11

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->getScheduleItems()Ljava/util/List;

    move-result-object v7

    .local v7, "$scheduleItems":Ljava/util/List;
    mul-int/lit8 v13, v10, 0x1f

    if-nez v7, :cond_4

    move v11, v12

    :goto_4
    add-int v10, v13, v11

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->getOngoingScheduleItems()Ljava/util/List;

    move-result-object v3

    .local v3, "$ongoingScheduleItems":Ljava/util/List;
    mul-int/lit8 v13, v10, 0x1f

    if-nez v3, :cond_5

    move v11, v12

    :goto_5
    add-int v10, v13, v11

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->getCurrentScheduleItem()Lcom/thetransitapp/droid/model/ScheduleItem;

    move-result-object v1

    .local v1, "$currentScheduleItem":Lcom/thetransitapp/droid/model/ScheduleItem;
    mul-int/lit8 v13, v10, 0x1f

    if-nez v1, :cond_6

    move v11, v12

    :goto_6
    add-int v10, v13, v11

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->getPlaceholderHeadsign()Ljava/lang/String;

    move-result-object v4

    .local v4, "$placeholderHeadsign":Ljava/lang/String;
    mul-int/lit8 v13, v10, 0x1f

    if-nez v4, :cond_7

    move v11, v12

    :goto_7
    add-int v10, v13, v11

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->getPredictionsFetchDate()Ljava/util/Date;

    move-result-object v5

    .local v5, "$predictionsFetchDate":Ljava/util/Date;
    mul-int/lit8 v11, v10, 0x1f

    if-nez v5, :cond_8

    :goto_8
    add-int v10, v11, v12

    return v10

    .end local v0    # "$closestStop":Lcom/thetransitapp/droid/model/Stop;
    .end local v1    # "$currentScheduleItem":Lcom/thetransitapp/droid/model/ScheduleItem;
    .end local v2    # "$itineraries":Ljava/util/List;
    .end local v3    # "$ongoingScheduleItems":Ljava/util/List;
    .end local v4    # "$placeholderHeadsign":Ljava/lang/String;
    .end local v5    # "$predictionsFetchDate":Ljava/util/Date;
    .end local v7    # "$scheduleItems":Ljava/util/List;
    .end local v8    # "$serviceDates":Ljava/util/List;
    :cond_0
    invoke-virtual {v6}, Ljava/lang/Object;->hashCode()I

    move-result v11

    goto :goto_0

    .restart local v0    # "$closestStop":Lcom/thetransitapp/droid/model/Stop;
    :cond_1
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v11

    goto :goto_1

    .restart local v2    # "$itineraries":Ljava/util/List;
    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v11

    goto :goto_2

    .restart local v8    # "$serviceDates":Ljava/util/List;
    :cond_3
    invoke-virtual {v8}, Ljava/lang/Object;->hashCode()I

    move-result v11

    goto :goto_3

    .restart local v7    # "$scheduleItems":Ljava/util/List;
    :cond_4
    invoke-virtual {v7}, Ljava/lang/Object;->hashCode()I

    move-result v11

    goto :goto_4

    .restart local v3    # "$ongoingScheduleItems":Ljava/util/List;
    :cond_5
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v11

    goto :goto_5

    .restart local v1    # "$currentScheduleItem":Lcom/thetransitapp/droid/model/ScheduleItem;
    :cond_6
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v11

    goto :goto_6

    .restart local v4    # "$placeholderHeadsign":Ljava/lang/String;
    :cond_7
    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    move-result v11

    goto :goto_7

    .restart local v5    # "$predictionsFetchDate":Ljava/util/Date;
    :cond_8
    invoke-virtual {v5}, Ljava/lang/Object;->hashCode()I

    move-result v12

    goto :goto_8
.end method

.method public isActive()Z
    .locals 1

    .prologue
    .line 69
    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->getCurrentScheduleItem()Lcom/thetransitapp/droid/model/ScheduleItem;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public isTerminus()Z
    .locals 3

    .prologue
    .line 105
    iget-object v1, p0, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->scheduleItems:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_1

    .line 111
    const/4 v1, 0x1

    :goto_0
    return v1

    .line 105
    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/thetransitapp/droid/model/ScheduleItem;

    .line 106
    .local v0, "item":Lcom/thetransitapp/droid/model/ScheduleItem;
    invoke-virtual {v0}, Lcom/thetransitapp/droid/model/ScheduleItem;->isPickupCancelled()Z

    move-result v2

    if-nez v2, :cond_0

    .line 107
    const/4 v1, 0x0

    goto :goto_0
.end method

.method public loadOngoingScheduleItems()V
    .locals 9

    .prologue
    .line 190
    new-instance v4, Ljava/util/Date;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    const-wide/32 v7, -0xdbba0

    add-long/2addr v5, v7

    invoke-direct {v4, v5, v6}, Ljava/util/Date;-><init>(J)V

    .line 191
    .local v4, "start":Ljava/util/Date;
    new-instance v0, Ljava/util/Date;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    const-wide/32 v7, 0x5265c0

    add-long/2addr v5, v7

    invoke-direct {v0, v5, v6}, Ljava/util/Date;-><init>(J)V

    .line 193
    .local v0, "end":Ljava/util/Date;
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 194
    .local v3, "ongoing":Ljava/util/List;, "Ljava/util/List<Lcom/thetransitapp/droid/model/ScheduleItem;>;"
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 196
    .local v1, "frequencies":Ljava/util/List;, "Ljava/util/List<Lcom/thetransitapp/droid/model/ScheduleItem;>;"
    iget-object v5, p0, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->scheduleItems:Ljava/util/List;

    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_0
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-nez v6, :cond_3

    .line 210
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v5

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v6

    if-ge v5, v6, :cond_1

    .line 211
    invoke-interface {v3, v1}, Ljava/util/List;->removeAll(Ljava/util/Collection;)Z

    .line 214
    :cond_1
    iget-object v5, p0, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->scheduleItems:Ljava/util/List;

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v5

    if-lez v5, :cond_2

    .line 215
    iget-object v5, p0, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->scheduleItems:Ljava/util/List;

    const/4 v6, 0x0

    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/thetransitapp/droid/model/ScheduleItem;

    invoke-virtual {v5}, Lcom/thetransitapp/droid/model/ScheduleItem;->getHeadsign()Ljava/lang/String;

    move-result-object v5

    iput-object v5, p0, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->placeholderHeadsign:Ljava/lang/String;

    .line 218
    :cond_2
    iput-object v3, p0, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->ongoingScheduleItems:Ljava/util/List;

    .line 219
    return-void

    .line 196
    :cond_3
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/thetransitapp/droid/model/ScheduleItem;

    .line 197
    .local v2, "item":Lcom/thetransitapp/droid/model/ScheduleItem;
    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/ScheduleItem;->isCancelled()Z

    move-result v6

    if-nez v6, :cond_0

    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/ScheduleItem;->isPickupCancelled()Z

    move-result v6

    if-nez v6, :cond_0

    .line 198
    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/ScheduleItem;->getStopTime()Ljava/util/Date;

    move-result-object v6

    if-eqz v6, :cond_4

    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/ScheduleItem;->getStopTime()Ljava/util/Date;

    move-result-object v6

    invoke-virtual {v6, v4}, Ljava/util/Date;->after(Ljava/util/Date;)Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/ScheduleItem;->getStopTime()Ljava/util/Date;

    move-result-object v6

    invoke-virtual {v6, v0}, Ljava/util/Date;->before(Ljava/util/Date;)Z

    move-result v6

    if-nez v6, :cond_5

    .line 199
    :cond_4
    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/ScheduleItem;->isFrequency()Z

    move-result v6

    if-eqz v6, :cond_0

    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/ScheduleItem;->getFrequencyStartTime()Ljava/util/Date;

    move-result-object v6

    invoke-virtual {v6, v0}, Ljava/util/Date;->before(Ljava/util/Date;)Z

    move-result v6

    if-eqz v6, :cond_0

    .line 200
    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/ScheduleItem;->getFrequencyEndTime()Ljava/util/Date;

    move-result-object v6

    invoke-virtual {v6, v4}, Ljava/util/Date;->after(Ljava/util/Date;)Z

    move-result v6

    if-eqz v6, :cond_0

    .line 201
    :cond_5
    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 203
    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/ScheduleItem;->isFrequency()Z

    move-result v6

    if-eqz v6, :cond_0

    .line 204
    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0
.end method

.method public resortScheduleItems()V
    .locals 1

    .prologue
    .line 115
    iget-object v0, p0, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->scheduleItems:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 116
    return-void
.end method

.method public setClosestStop(Lcom/thetransitapp/droid/model/Stop;)V
    .locals 0
    .param p1, "closestStop"    # Lcom/thetransitapp/droid/model/Stop;

    .prologue
    .line 26
    iput-object p1, p0, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->closestStop:Lcom/thetransitapp/droid/model/Stop;

    return-void
.end method

.method public setCurrentScheduleItem(Lcom/thetransitapp/droid/model/ScheduleItem;)V
    .locals 0
    .param p1, "currentScheduleItem"    # Lcom/thetransitapp/droid/model/ScheduleItem;

    .prologue
    .line 26
    iput-object p1, p0, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->currentScheduleItem:Lcom/thetransitapp/droid/model/ScheduleItem;

    return-void
.end method

.method public setItineraries(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/thetransitapp/droid/model/Itinerary;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 26
    .local p1, "itineraries":Ljava/util/List;, "Ljava/util/List<Lcom/thetransitapp/droid/model/Itinerary;>;"
    iput-object p1, p0, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->itineraries:Ljava/util/List;

    return-void
.end method

.method public setOngoingScheduleItems(Ljava/util/List;)V
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
    .line 26
    .local p1, "ongoingScheduleItems":Ljava/util/List;, "Ljava/util/List<Lcom/thetransitapp/droid/model/ScheduleItem;>;"
    iput-object p1, p0, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->ongoingScheduleItems:Ljava/util/List;

    return-void
.end method

.method public setPlaceholderHeadsign(Ljava/lang/String;)V
    .locals 0
    .param p1, "placeholderHeadsign"    # Ljava/lang/String;

    .prologue
    .line 26
    iput-object p1, p0, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->placeholderHeadsign:Ljava/lang/String;

    return-void
.end method

.method public setPredictionsFetchDate(Ljava/util/Date;)V
    .locals 0
    .param p1, "predictionsFetchDate"    # Ljava/util/Date;

    .prologue
    .line 26
    iput-object p1, p0, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->predictionsFetchDate:Ljava/util/Date;

    return-void
.end method

.method public setRoute(Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;)V
    .locals 0
    .param p1, "route"    # Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;

    .prologue
    .line 26
    iput-object p1, p0, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->route:Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;

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
    .line 26
    .local p1, "scheduleItems":Ljava/util/List;, "Ljava/util/List<Lcom/thetransitapp/droid/model/ScheduleItem;>;"
    iput-object p1, p0, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->scheduleItems:Ljava/util/List;

    return-void
.end method

.method public setServiceDates(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/thetransitapp/droid/model/ServiceDay;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 26
    .local p1, "serviceDates":Ljava/util/List;, "Ljava/util/List<Lcom/thetransitapp/droid/model/ServiceDay;>;"
    iput-object p1, p0, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->serviceDates:Ljava/util/List;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 26
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "MergedItinerary(route="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->getRoute()Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", closestStop="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->getClosestStop()Lcom/thetransitapp/droid/model/Stop;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", itineraries="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->getItineraries()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", serviceDates="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->getServiceDates()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", scheduleItems="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->getScheduleItems()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", ongoingScheduleItems="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->getOngoingScheduleItems()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", currentScheduleItem="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->getCurrentScheduleItem()Lcom/thetransitapp/droid/model/ScheduleItem;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", placeholderHeadsign="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->getPlaceholderHeadsign()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", predictionsFetchDate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->getPredictionsFetchDate()Ljava/util/Date;

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

.method public updateRealTimeDataOnList(Landroid/widget/ListView;)V
    .locals 3
    .param p1, "listView"    # Landroid/widget/ListView;

    .prologue
    .line 131
    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->getRealTimeDataSource()Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;

    move-result-object v0

    .line 132
    .local v0, "realtimeSource":Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;
    if-eqz v0, :cond_0

    invoke-virtual {v0, p0}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->shouldFetchPredictionsForItinerary(Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 133
    invoke-virtual {p1}, Landroid/widget/ListView;->getContext()Landroid/content/Context;

    move-result-object v1

    new-instance v2, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary$1;

    invoke-direct {v2, p0, p1}, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary$1;-><init>(Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;Landroid/widget/ListView;)V

    invoke-virtual {v0, v1, p0, v2}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->getPredictionForItinerary(Landroid/content/Context;Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource$RealTimeCallback;)V

    .line 167
    :cond_0
    return-void
.end method

.method public updateRealTimeDataOnList(Landroid/widget/ListView;Lcom/thetransitapp/droid/widget/route/RouteItem;)V
    .locals 3
    .param p1, "listView"    # Landroid/widget/ListView;
    .param p2, "item"    # Lcom/thetransitapp/droid/widget/route/RouteItem;

    .prologue
    .line 170
    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->getRealTimeDataSource()Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;

    move-result-object v0

    .line 171
    .local v0, "realtimeSource":Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;
    if-eqz v0, :cond_0

    invoke-virtual {v0, p0}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->shouldFetchPredictionsForItinerary(Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 172
    invoke-virtual {p1}, Landroid/widget/ListView;->getContext()Landroid/content/Context;

    move-result-object v1

    new-instance v2, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary$2;

    invoke-direct {v2, p0, p1, p2}, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary$2;-><init>(Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;Landroid/widget/ListView;Lcom/thetransitapp/droid/widget/route/RouteItem;)V

    invoke-virtual {v0, v1, p0, v2}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->getPredictionForItinerary(Landroid/content/Context;Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource$RealTimeCallback;)V

    .line 187
    :cond_0
    return-void
.end method

.method public updateServiceItem()V
    .locals 7

    .prologue
    .line 54
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    iput-object v3, p0, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->scheduleItems:Ljava/util/List;

    .line 56
    iget-object v3, p0, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->serviceDates:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-nez v4, :cond_1

    .line 64
    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->resortScheduleItems()V

    .line 65
    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->loadOngoingScheduleItems()V

    .line 66
    return-void

    .line 56
    :cond_1
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/thetransitapp/droid/model/ServiceDay;

    .line 57
    .local v0, "day":Lcom/thetransitapp/droid/model/ServiceDay;
    iget-object v4, p0, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->itineraries:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/thetransitapp/droid/model/Itinerary;

    .line 58
    .local v1, "itinerary":Lcom/thetransitapp/droid/model/Itinerary;
    iget-object v5, p0, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->closestStop:Lcom/thetransitapp/droid/model/Stop;

    invoke-virtual {v1, v5, v0}, Lcom/thetransitapp/droid/model/Itinerary;->getSchedule(Lcom/thetransitapp/droid/model/Stop;Lcom/thetransitapp/droid/model/ServiceDay;)Lcom/thetransitapp/droid/model/Schedule;

    move-result-object v2

    .line 60
    .local v2, "schedule":Lcom/thetransitapp/droid/model/Schedule;
    iget-object v5, p0, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->scheduleItems:Ljava/util/List;

    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/Schedule;->getScheduleItems()Ljava/util/List;

    move-result-object v6

    invoke-interface {v5, v6}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    goto :goto_0
.end method
