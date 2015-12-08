.class public abstract Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;
.super Ljava/lang/Object;
.source "BaseRealTimeDataSource.java"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource$RealTimeCallback;
    }
.end annotation


# static fields
.field private static final LEVENSHTEIN_MATCH_TYPE:Ljava/lang/String; = "levenshtein"

.field private static final STRICT_MATCH_TYPE:Ljava/lang/String; = "strict"

.field private static final serialVersionUID:J = 0x1L


# instance fields
.field private cancelledKeyPath:Ljava/lang/String;

.field private cancelledRegex:Ljava/util/regex/Pattern;

.field private dateKeyPath:Ljava/lang/String;

.field private destinationFilteringKeyPath:Ljava/lang/String;

.field private directionMatchType:Ljava/lang/String;

.field private predictionsKeyPath:Ljava/lang/String;

.field private routeFilteringKeyPath:Ljava/lang/String;

.field private routeTypes:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private scheduleBasedKeyPath:Ljava/lang/String;

.field private scheduleBasedRegex:Ljava/util/regex/Pattern;

.field private stopFilteringKeyPath:Ljava/lang/String;

.field private timestampFormat:Lcom/thetransitapp/droid/util/DateFormatter;

.field private timestampKeyPath:Ljava/lang/String;

.field private tripURL:Ljava/lang/String;

.field private vehicleDestinationKeyPath:Ljava/lang/String;

.field private vehicleIdKeyPath:Ljava/lang/String;

.field private vehicleLatitudeKeyPath:Ljava/lang/String;

.field private vehicleLocationsURL:Ljava/lang/String;

.field private vehicleLongitudeKeyPath:Ljava/lang/String;

.field private vehicleTimestampFormat:Lcom/thetransitapp/droid/util/DateFormatter;

.field private vehicleTimestampKeyPath:Ljava/lang/String;

.field private vehiclesKeyPath:Ljava/lang/String;

.field private vehiculeURL:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public arePredictionsEnabled()Z
    .locals 1

    .prologue
    .line 69
    iget-object v0, p0, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->tripURL:Ljava/lang/String;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public areVehicleLocationsEnabled()Z
    .locals 1

    .prologue
    .line 73
    iget-object v0, p0, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->vehiculeURL:Ljava/lang/String;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method protected assignFilteredPredictionsToItems(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 24
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/thetransitapp/droid/model/realtime/Prediction;",
            ">;",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/thetransitapp/droid/model/ScheduleItem;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 250
    .local p1, "predictions":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/thetransitapp/droid/model/realtime/Prediction;>;"
    .local p2, "scheduleItems":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/thetransitapp/droid/model/ScheduleItem;>;"
    invoke-virtual/range {p1 .. p1}, Ljava/util/ArrayList;->size()I

    move-result v19

    if-nez v19, :cond_1

    .line 307
    :cond_0
    return-void

    .line 253
    :cond_1
    const/4 v9, 0x0

    .line 254
    .local v9, "firstScheduleItemIndex":I
    const/16 v19, 0x0

    move-object/from16 v0, p1

    move/from16 v1, v19

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/thetransitapp/droid/model/realtime/Prediction;

    .line 255
    .local v7, "firstPrediction":Lcom/thetransitapp/droid/model/realtime/Prediction;
    invoke-virtual/range {p1 .. p1}, Ljava/util/ArrayList;->size()I

    move-result v19

    add-int/lit8 v19, v19, -0x1

    move-object/from16 v0, p1

    move/from16 v1, v19

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lcom/thetransitapp/droid/model/realtime/Prediction;

    .line 256
    .local v12, "lastPrediction":Lcom/thetransitapp/droid/model/realtime/Prediction;
    invoke-virtual {v7}, Lcom/thetransitapp/droid/model/realtime/Prediction;->getStopTime()Ljava/util/Date;

    move-result-object v8

    .line 258
    .local v8, "firstRealStopTime":Ljava/util/Date;
    const-wide v16, 0x7fffffffffffffffL

    .line 259
    .local v16, "previousDelay":J
    const/4 v10, 0x0

    .line 260
    .local v10, "index":I
    invoke-virtual/range {p2 .. p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v19

    :goto_0
    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->hasNext()Z

    move-result v20

    if-nez v20, :cond_5

    .line 271
    :goto_1
    const/16 v19, 0x0

    move-object/from16 v0, p2

    move/from16 v1, v19

    invoke-virtual {v0, v1, v9}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    move-result-object v6

    .line 272
    .local v6, "discardedItems":Ljava/util/List;, "Ljava/util/List<Lcom/thetransitapp/droid/model/ScheduleItem;>;"
    invoke-virtual/range {p1 .. p1}, Ljava/util/ArrayList;->size()I

    move-result v19

    add-int v14, v9, v19

    .line 274
    .local v14, "lastScheduleItemIndex":I
    :goto_2
    invoke-virtual/range {p2 .. p2}, Ljava/util/ArrayList;->size()I

    move-result v19

    move/from16 v0, v19

    if-le v0, v14, :cond_2

    .line 275
    invoke-virtual {v12}, Lcom/thetransitapp/droid/model/realtime/Prediction;->getStopTime()Ljava/util/Date;

    move-result-object v19

    invoke-virtual/range {v19 .. v19}, Ljava/util/Date;->getTime()J

    move-result-wide v20

    .line 276
    move-object/from16 v0, p2

    invoke-virtual {v0, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v19

    check-cast v19, Lcom/thetransitapp/droid/model/ScheduleItem;

    invoke-virtual/range {v19 .. v19}, Lcom/thetransitapp/droid/model/ScheduleItem;->getScheduledStopTime()Ljava/util/Date;

    move-result-object v19

    invoke-virtual/range {v19 .. v19}, Ljava/util/Date;->getTime()J

    move-result-wide v22

    .line 275
    sub-long v19, v20, v22

    .line 276
    const-wide/16 v21, 0x0

    .line 274
    cmp-long v19, v19, v21

    if-gtz v19, :cond_8

    .line 282
    :cond_2
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v19

    :cond_3
    :goto_3
    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->hasNext()Z

    move-result v20

    if-nez v20, :cond_9

    .line 288
    invoke-virtual/range {p2 .. p2}, Ljava/util/ArrayList;->size()I

    move-result v19

    .line 289
    sub-int v19, v19, v9

    .line 288
    move-object/from16 v0, p2

    move/from16 v1, v19

    invoke-virtual {v0, v9, v1}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    move-result-object v18

    .line 291
    .local v18, "upcomingItems":Ljava/util/List;, "Ljava/util/List<Lcom/thetransitapp/droid/model/ScheduleItem;>;"
    const/4 v10, 0x0

    .line 292
    invoke-virtual/range {p1 .. p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v19

    :goto_4
    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->hasNext()Z

    move-result v20

    if-eqz v20, :cond_0

    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lcom/thetransitapp/droid/model/realtime/Prediction;

    .line 293
    .local v15, "prediction":Lcom/thetransitapp/droid/model/realtime/Prediction;
    invoke-interface/range {v18 .. v18}, Ljava/util/List;->size()I

    move-result v20

    move/from16 v0, v20

    if-ge v10, v0, :cond_4

    .line 294
    move-object/from16 v0, v18

    invoke-interface {v0, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/thetransitapp/droid/model/ScheduleItem;

    .line 295
    .local v2, "correspondingScheduleItem":Lcom/thetransitapp/droid/model/ScheduleItem;
    invoke-virtual {v15}, Lcom/thetransitapp/droid/model/realtime/Prediction;->isCancelled()Z

    move-result v20

    if-eqz v20, :cond_a

    .line 296
    const/16 v20, 0x1

    move/from16 v0, v20

    invoke-virtual {v2, v0}, Lcom/thetransitapp/droid/model/ScheduleItem;->setCancelled(Z)V

    .line 305
    .end local v2    # "correspondingScheduleItem":Lcom/thetransitapp/droid/model/ScheduleItem;
    :cond_4
    :goto_5
    add-int/lit8 v10, v10, 0x1

    goto :goto_4

    .line 260
    .end local v6    # "discardedItems":Ljava/util/List;, "Ljava/util/List<Lcom/thetransitapp/droid/model/ScheduleItem;>;"
    .end local v14    # "lastScheduleItemIndex":I
    .end local v15    # "prediction":Lcom/thetransitapp/droid/model/realtime/Prediction;
    .end local v18    # "upcomingItems":Ljava/util/List;, "Ljava/util/List<Lcom/thetransitapp/droid/model/ScheduleItem;>;"
    :cond_5
    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/thetransitapp/droid/model/ScheduleItem;

    .line 261
    .local v11, "item":Lcom/thetransitapp/droid/model/ScheduleItem;
    invoke-virtual {v11}, Lcom/thetransitapp/droid/model/ScheduleItem;->getScheduledStopTime()Ljava/util/Date;

    move-result-object v20

    invoke-virtual/range {v20 .. v20}, Ljava/util/Date;->getTime()J

    move-result-wide v20

    invoke-virtual {v8}, Ljava/util/Date;->getTime()J

    move-result-wide v22

    sub-long v20, v20, v22

    invoke-static/range {v20 .. v21}, Ljava/lang/Math;->abs(J)J

    move-result-wide v3

    .line 262
    .local v3, "delay":J
    cmp-long v20, v3, v16

    if-gez v20, :cond_7

    .line 263
    move v9, v10

    .line 264
    move-wide/from16 v16, v3

    .line 268
    :cond_6
    add-int/lit8 v10, v10, 0x1

    goto/16 :goto_0

    .line 265
    :cond_7
    cmp-long v20, v3, v16

    if-ltz v20, :cond_6

    goto/16 :goto_1

    .line 277
    .end local v3    # "delay":J
    .end local v11    # "item":Lcom/thetransitapp/droid/model/ScheduleItem;
    .restart local v6    # "discardedItems":Ljava/util/List;, "Ljava/util/List<Lcom/thetransitapp/droid/model/ScheduleItem;>;"
    .restart local v14    # "lastScheduleItemIndex":I
    :cond_8
    move-object/from16 v0, p2

    invoke-virtual {v0, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lcom/thetransitapp/droid/model/ScheduleItem;

    .line 278
    .local v13, "lastScheduleItem":Lcom/thetransitapp/droid/model/ScheduleItem;
    const/16 v19, 0x1

    move/from16 v0, v19

    invoke-virtual {v13, v0}, Lcom/thetransitapp/droid/model/ScheduleItem;->setCancelled(Z)V

    .line 279
    add-int/lit8 v14, v14, 0x1

    goto/16 :goto_2

    .line 282
    .end local v13    # "lastScheduleItem":Lcom/thetransitapp/droid/model/ScheduleItem;
    :cond_9
    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/thetransitapp/droid/model/ScheduleItem;

    .line 283
    .local v5, "discardedItem":Lcom/thetransitapp/droid/model/ScheduleItem;
    invoke-virtual {v5}, Lcom/thetransitapp/droid/model/ScheduleItem;->isPastItem()Z

    move-result v20

    if-nez v20, :cond_3

    .line 284
    const/16 v20, 0x1

    move/from16 v0, v20

    invoke-virtual {v5, v0}, Lcom/thetransitapp/droid/model/ScheduleItem;->setCancelled(Z)V

    goto/16 :goto_3

    .line 297
    .end local v5    # "discardedItem":Lcom/thetransitapp/droid/model/ScheduleItem;
    .restart local v2    # "correspondingScheduleItem":Lcom/thetransitapp/droid/model/ScheduleItem;
    .restart local v15    # "prediction":Lcom/thetransitapp/droid/model/realtime/Prediction;
    .restart local v18    # "upcomingItems":Ljava/util/List;, "Ljava/util/List<Lcom/thetransitapp/droid/model/ScheduleItem;>;"
    :cond_a
    invoke-virtual {v15}, Lcom/thetransitapp/droid/model/realtime/Prediction;->isScheduleBased()Z

    move-result v20

    if-nez v20, :cond_b

    .line 298
    invoke-virtual {v15}, Lcom/thetransitapp/droid/model/realtime/Prediction;->getStopTime()Ljava/util/Date;

    move-result-object v20

    move-object/from16 v0, v20

    invoke-virtual {v2, v0}, Lcom/thetransitapp/droid/model/ScheduleItem;->setRealStopTime(Ljava/util/Date;)V

    .line 299
    invoke-virtual {v15}, Lcom/thetransitapp/droid/model/realtime/Prediction;->getDirectionTag()Ljava/lang/String;

    move-result-object v20

    move-object/from16 v0, v20

    invoke-virtual {v2, v0}, Lcom/thetransitapp/droid/model/ScheduleItem;->setRealTimeDirectionId(Ljava/lang/String;)V

    .line 300
    const/16 v20, 0x0

    move/from16 v0, v20

    invoke-virtual {v2, v0}, Lcom/thetransitapp/droid/model/ScheduleItem;->setCancelled(Z)V

    goto :goto_5

    .line 302
    :cond_b
    const/16 v20, 0x0

    move/from16 v0, v20

    invoke-virtual {v2, v0}, Lcom/thetransitapp/droid/model/ScheduleItem;->setCancelled(Z)V

    goto :goto_5
.end method

.method protected assignPredictionsWithScheduleItems(Ljava/util/List;Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;)V
    .locals 4
    .param p2, "itinerary"    # Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/thetransitapp/droid/model/realtime/Prediction;",
            ">;",
            "Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;",
            ")V"
        }
    .end annotation

    .prologue
    .line 124
    .local p1, "result":Ljava/util/List;, "Ljava/util/List<Lcom/thetransitapp/droid/model/realtime/Prediction;>;"
    const/4 v0, 0x0

    .line 125
    .local v0, "containsTrip":Z
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-nez v3, :cond_1

    .line 131
    if-eqz v0, :cond_2

    .line 132
    invoke-virtual {p0, p1, p2}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->assignPredictionsWithTripIDs(Ljava/util/List;Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;)V

    .line 137
    :goto_1
    invoke-virtual {p2}, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->resortScheduleItems()V

    .line 138
    return-void

    .line 125
    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/thetransitapp/droid/model/realtime/Prediction;

    .line 126
    .local v1, "prediction":Lcom/thetransitapp/droid/model/realtime/Prediction;
    invoke-virtual {v1}, Lcom/thetransitapp/droid/model/realtime/Prediction;->getTripID()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_0

    .line 127
    const/4 v0, 0x1

    goto :goto_0

    .line 134
    .end local v1    # "prediction":Lcom/thetransitapp/droid/model/realtime/Prediction;
    :cond_2
    invoke-virtual {p0, p1, p2}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->assignRegularPredictions(Ljava/util/List;Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;)V

    goto :goto_1
.end method

.method protected assignPredictionsWithTripIDs(Ljava/util/List;Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;)V
    .locals 13
    .param p2, "itinerary"    # Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/thetransitapp/droid/model/realtime/Prediction;",
            ">;",
            "Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;",
            ")V"
        }
    .end annotation

    .prologue
    .line 141
    .local p1, "result":Ljava/util/List;, "Ljava/util/List<Lcom/thetransitapp/droid/model/realtime/Prediction;>;"
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_0
    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-nez v7, :cond_1

    .line 165
    return-void

    .line 141
    :cond_1
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/thetransitapp/droid/model/realtime/Prediction;

    .line 142
    .local v4, "prediction":Lcom/thetransitapp/droid/model/realtime/Prediction;
    const/4 v3, 0x0

    .line 143
    .local v3, "item":Lcom/thetransitapp/droid/model/ScheduleItem;
    invoke-virtual {p2}, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->getOngoingScheduleItems()Ljava/util/List;

    move-result-object v7

    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_2
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-nez v8, :cond_4

    .line 150
    :goto_1
    invoke-virtual {v4}, Lcom/thetransitapp/droid/model/realtime/Prediction;->getStopTime()Ljava/util/Date;

    move-result-object v7

    if-nez v7, :cond_3

    .line 151
    new-instance v0, Ljava/util/Date;

    invoke-virtual {v3}, Lcom/thetransitapp/droid/model/ScheduleItem;->getScheduledStopTime()Ljava/util/Date;

    move-result-object v7

    invoke-virtual {v7}, Ljava/util/Date;->getTime()J

    move-result-wide v7

    .line 152
    invoke-virtual {v4}, Lcom/thetransitapp/droid/model/realtime/Prediction;->getDelay()D

    move-result-wide v9

    const-wide v11, 0x408f400000000000L    # 1000.0

    mul-double/2addr v9, v11

    double-to-long v9, v9

    add-long/2addr v7, v9

    .line 151
    invoke-direct {v0, v7, v8}, Ljava/util/Date;-><init>(J)V

    .line 153
    .local v0, "delayedDate":Ljava/util/Date;
    invoke-virtual {v4, v0}, Lcom/thetransitapp/droid/model/realtime/Prediction;->setStopTime(Ljava/util/Date;)V

    .line 156
    .end local v0    # "delayedDate":Ljava/util/Date;
    :cond_3
    if-eqz v3, :cond_0

    if-eqz v4, :cond_0

    .line 157
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 158
    .local v2, "filteredPredictions":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/thetransitapp/droid/model/realtime/Prediction;>;"
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 159
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 160
    .local v1, "filteredItems":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/thetransitapp/droid/model/ScheduleItem;>;"
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 162
    invoke-virtual {p0, v2, v1}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->assignFilteredPredictionsToItems(Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    goto :goto_0

    .line 143
    .end local v1    # "filteredItems":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/thetransitapp/droid/model/ScheduleItem;>;"
    .end local v2    # "filteredPredictions":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/thetransitapp/droid/model/realtime/Prediction;>;"
    :cond_4
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/thetransitapp/droid/model/ScheduleItem;

    .line 144
    .local v5, "scheduleItem":Lcom/thetransitapp/droid/model/ScheduleItem;
    invoke-virtual {v5}, Lcom/thetransitapp/droid/model/ScheduleItem;->getTripId()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v4}, Lcom/thetransitapp/droid/model/realtime/Prediction;->getTripID()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_2

    .line 145
    move-object v3, v5

    .line 146
    goto :goto_1
.end method

.method protected assignRegularPredictions(Ljava/util/List;Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;)V
    .locals 26
    .param p2, "itinerary"    # Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/thetransitapp/droid/model/realtime/Prediction;",
            ">;",
            "Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;",
            ")V"
        }
    .end annotation

    .prologue
    .line 168
    .local p1, "result":Ljava/util/List;, "Ljava/util/List<Lcom/thetransitapp/droid/model/realtime/Prediction;>;"
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 169
    .local v6, "branches":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 171
    .local v7, "directions":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v21

    :cond_0
    :goto_0
    invoke-interface/range {v21 .. v21}, Ljava/util/Iterator;->hasNext()Z

    move-result v22

    if-nez v22, :cond_5

    .line 180
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v21

    if-nez v21, :cond_1

    .line 181
    const-string v21, ""

    move-object/from16 v0, v21

    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 182
    :cond_1
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v21

    if-nez v21, :cond_2

    .line 183
    const-string v21, ""

    move-object/from16 v0, v21

    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 185
    :cond_2
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 186
    .local v4, "allHeadsigns":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    invoke-virtual/range {p2 .. p2}, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->getOngoingScheduleItems()Ljava/util/List;

    move-result-object v21

    invoke-interface/range {v21 .. v21}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v21

    :cond_3
    :goto_1
    invoke-interface/range {v21 .. v21}, Ljava/util/Iterator;->hasNext()Z

    move-result v22

    if-nez v22, :cond_7

    .line 192
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v21

    const/16 v22, 0x1

    move/from16 v0, v21

    move/from16 v1, v22

    if-ne v0, v1, :cond_8

    const/4 v11, 0x1

    .line 193
    .local v11, "hasSingleBranch":Z
    :goto_2
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v21

    const/16 v22, 0x1

    move/from16 v0, v21

    move/from16 v1, v22

    if-ne v0, v1, :cond_9

    const/4 v12, 0x1

    .line 195
    .local v12, "hasSingleDirection":Z
    :goto_3
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v21

    :cond_4
    invoke-interface/range {v21 .. v21}, Ljava/util/Iterator;->hasNext()Z

    move-result v22

    if-nez v22, :cond_a

    .line 246
    return-void

    .line 171
    .end local v4    # "allHeadsigns":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    .end local v11    # "hasSingleBranch":Z
    .end local v12    # "hasSingleDirection":Z
    :cond_5
    invoke-interface/range {v21 .. v21}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v17

    check-cast v17, Lcom/thetransitapp/droid/model/realtime/Prediction;

    .line 172
    .local v17, "prediction":Lcom/thetransitapp/droid/model/realtime/Prediction;
    invoke-virtual/range {v17 .. v17}, Lcom/thetransitapp/droid/model/realtime/Prediction;->getBranch()Ljava/lang/String;

    move-result-object v22

    if-eqz v22, :cond_6

    invoke-virtual/range {v17 .. v17}, Lcom/thetransitapp/droid/model/realtime/Prediction;->getBranch()Ljava/lang/String;

    move-result-object v22

    move-object/from16 v0, v22

    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v22

    if-nez v22, :cond_6

    .line 173
    invoke-virtual/range {v17 .. v17}, Lcom/thetransitapp/droid/model/realtime/Prediction;->getBranch()Ljava/lang/String;

    move-result-object v22

    move-object/from16 v0, v22

    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 175
    :cond_6
    invoke-virtual/range {v17 .. v17}, Lcom/thetransitapp/droid/model/realtime/Prediction;->getTripHeadsign()Ljava/lang/String;

    move-result-object v22

    if-eqz v22, :cond_0

    invoke-virtual/range {v17 .. v17}, Lcom/thetransitapp/droid/model/realtime/Prediction;->getTripHeadsign()Ljava/lang/String;

    move-result-object v22

    move-object/from16 v0, v22

    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v22

    if-nez v22, :cond_0

    .line 176
    invoke-virtual/range {v17 .. v17}, Lcom/thetransitapp/droid/model/realtime/Prediction;->getTripHeadsign()Ljava/lang/String;

    move-result-object v22

    move-object/from16 v0, v22

    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 186
    .end local v17    # "prediction":Lcom/thetransitapp/droid/model/realtime/Prediction;
    .restart local v4    # "allHeadsigns":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    :cond_7
    invoke-interface/range {v21 .. v21}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lcom/thetransitapp/droid/model/ScheduleItem;

    .line 187
    .local v14, "item":Lcom/thetransitapp/droid/model/ScheduleItem;
    invoke-virtual {v14}, Lcom/thetransitapp/droid/model/ScheduleItem;->getHeadsign()Ljava/lang/String;

    move-result-object v22

    move-object/from16 v0, v22

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v22

    if-nez v22, :cond_3

    .line 188
    invoke-virtual {v14}, Lcom/thetransitapp/droid/model/ScheduleItem;->getHeadsign()Ljava/lang/String;

    move-result-object v22

    move-object/from16 v0, v22

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_1

    .line 192
    .end local v14    # "item":Lcom/thetransitapp/droid/model/ScheduleItem;
    :cond_8
    const/4 v11, 0x0

    goto :goto_2

    .line 193
    .restart local v11    # "hasSingleBranch":Z
    :cond_9
    const/4 v12, 0x0

    goto :goto_3

    .line 195
    .restart local v12    # "hasSingleDirection":Z
    :cond_a
    invoke-interface/range {v21 .. v21}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v19

    check-cast v19, Ljava/lang/String;

    .line 196
    .local v19, "predictionsDirection":Ljava/lang/String;
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v22

    :goto_4
    invoke-interface/range {v22 .. v22}, Ljava/util/Iterator;->hasNext()Z

    move-result v23

    if-eqz v23, :cond_4

    invoke-interface/range {v22 .. v22}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v18

    check-cast v18, Ljava/lang/String;

    .line 197
    .local v18, "predictionsBranch":Ljava/lang/String;
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 199
    .local v8, "filteredOngoingItems":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/thetransitapp/droid/model/ScheduleItem;>;"
    invoke-virtual/range {p2 .. p2}, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->getOngoingScheduleItems()Ljava/util/List;

    move-result-object v23

    invoke-interface/range {v23 .. v23}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v23

    :cond_b
    :goto_5
    invoke-interface/range {v23 .. v23}, Ljava/util/Iterator;->hasNext()Z

    move-result v24

    if-nez v24, :cond_d

    .line 220
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 222
    .local v9, "filteredPrediction":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/thetransitapp/droid/model/realtime/Prediction;>;"
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v23

    :cond_c
    :goto_6
    invoke-interface/range {v23 .. v23}, Ljava/util/Iterator;->hasNext()Z

    move-result v24

    if-nez v24, :cond_11

    .line 236
    new-instance v23, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource$1;

    move-object/from16 v0, v23

    move-object/from16 v1, p0

    invoke-direct {v0, v1}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource$1;-><init>(Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;)V

    move-object/from16 v0, v23

    invoke-static {v9, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 243
    move-object/from16 v0, p0

    invoke-virtual {v0, v9, v8}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->assignFilteredPredictionsToItems(Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    goto :goto_4

    .line 199
    .end local v9    # "filteredPrediction":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/thetransitapp/droid/model/realtime/Prediction;>;"
    :cond_d
    invoke-interface/range {v23 .. v23}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v20

    check-cast v20, Lcom/thetransitapp/droid/model/ScheduleItem;

    .line 200
    .local v20, "scheduleItem":Lcom/thetransitapp/droid/model/ScheduleItem;
    const/4 v15, 0x1

    .line 201
    .local v15, "matchBranch":Z
    const/16 v16, 0x1

    .line 203
    .local v16, "matchDirection":Z
    if-nez v11, :cond_f

    const-string v24, ""

    move-object/from16 v0, v18

    move-object/from16 v1, v24

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v24

    if-nez v24, :cond_f

    .line 204
    invoke-virtual/range {p2 .. p2}, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->getRoute()Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;

    move-result-object v24

    invoke-virtual/range {v24 .. v24}, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->getShortName()Ljava/lang/String;

    move-result-object v10

    .line 205
    .local v10, "fullDirection":Ljava/lang/String;
    invoke-virtual/range {p2 .. p2}, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->getBranch()Ljava/lang/String;

    move-result-object v24

    if-eqz v24, :cond_e

    .line 206
    invoke-virtual/range {p2 .. p2}, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->getBranch()Ljava/lang/String;

    move-result-object v24

    move-object/from16 v0, v24

    invoke-virtual {v10, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 207
    :cond_e
    move-object/from16 v0, v18

    invoke-virtual {v10, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v15

    .line 210
    .end local v10    # "fullDirection":Ljava/lang/String;
    :cond_f
    const-string v24, ""

    move-object/from16 v0, v19

    move-object/from16 v1, v24

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v24

    if-nez v24, :cond_10

    .line 212
    invoke-virtual/range {v20 .. v20}, Lcom/thetransitapp/droid/model/ScheduleItem;->getHeadsign()Ljava/lang/String;

    move-result-object v24

    invoke-virtual/range {p2 .. p2}, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->getRoute()Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;

    move-result-object v25

    .line 211
    move-object/from16 v0, p0

    move-object/from16 v1, v19

    move-object/from16 v2, v24

    move-object/from16 v3, v25

    invoke-virtual {v0, v1, v2, v4, v3}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->directionTitleMatchItineraryNameOnAllPossibility(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;)Z

    move-result v16

    .line 215
    :cond_10
    if-eqz v15, :cond_b

    if-eqz v16, :cond_b

    .line 216
    move-object/from16 v0, v20

    invoke-virtual {v8, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_5

    .line 222
    .end local v15    # "matchBranch":Z
    .end local v16    # "matchDirection":Z
    .end local v20    # "scheduleItem":Lcom/thetransitapp/droid/model/ScheduleItem;
    .restart local v9    # "filteredPrediction":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/thetransitapp/droid/model/realtime/Prediction;>;"
    :cond_11
    invoke-interface/range {v23 .. v23}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v17

    check-cast v17, Lcom/thetransitapp/droid/model/realtime/Prediction;

    .line 223
    .restart local v17    # "prediction":Lcom/thetransitapp/droid/model/realtime/Prediction;
    if-eqz v11, :cond_12

    if-eqz v12, :cond_12

    .line 224
    move-object/from16 v0, v17

    invoke-virtual {v9, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_6

    .line 226
    :cond_12
    invoke-virtual/range {v17 .. v17}, Lcom/thetransitapp/droid/model/realtime/Prediction;->getBranch()Ljava/lang/String;

    move-result-object v24

    move-object/from16 v0, v18

    move-object/from16 v1, v24

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v24

    if-nez v24, :cond_15

    .line 227
    const-string v24, ""

    move-object/from16 v0, v18

    move-object/from16 v1, v24

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v24

    if-eqz v24, :cond_13

    invoke-virtual/range {v17 .. v17}, Lcom/thetransitapp/droid/model/realtime/Prediction;->getBranch()Ljava/lang/String;

    move-result-object v24

    if-eqz v24, :cond_15

    .line 226
    :cond_13
    const/4 v5, 0x0

    .line 228
    .local v5, "branchMatch":Z
    :goto_7
    invoke-virtual/range {v17 .. v17}, Lcom/thetransitapp/droid/model/realtime/Prediction;->getTripHeadsign()Ljava/lang/String;

    move-result-object v24

    move-object/from16 v0, v19

    move-object/from16 v1, v24

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v24

    if-nez v24, :cond_16

    .line 229
    const-string v24, ""

    move-object/from16 v0, v19

    move-object/from16 v1, v24

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v24

    if-eqz v24, :cond_14

    invoke-virtual/range {v17 .. v17}, Lcom/thetransitapp/droid/model/realtime/Prediction;->getTripHeadsign()Ljava/lang/String;

    move-result-object v24

    if-eqz v24, :cond_16

    .line 228
    :cond_14
    const/4 v13, 0x0

    .line 230
    .local v13, "headsignMatch":Z
    :goto_8
    if-eqz v5, :cond_c

    if-eqz v13, :cond_c

    .line 231
    move-object/from16 v0, v17

    invoke-virtual {v9, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_6

    .line 226
    .end local v5    # "branchMatch":Z
    .end local v13    # "headsignMatch":Z
    :cond_15
    const/4 v5, 0x1

    goto :goto_7

    .line 228
    .restart local v5    # "branchMatch":Z
    :cond_16
    const/4 v13, 0x1

    goto :goto_8
.end method

.method public canEqual(Ljava/lang/Object;)Z
    .locals 1
    .param p1, "other"    # Ljava/lang/Object;

    .prologue
    .line 27
    instance-of v0, p1, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;

    return v0
.end method

.method cleanedDirectionOnRoute(Ljava/lang/String;Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;)Ljava/lang/String;
    .locals 2
    .param p1, "direction"    # Ljava/lang/String;
    .param p2, "route"    # Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;

    .prologue
    .line 339
    const-string v0, " - "

    const-string v1, " "

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    .line 340
    const-string v0, "-"

    const-string v1, " "

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    .line 341
    const-string v0, " / "

    const-string v1, " "

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    .line 342
    const-string v0, "/"

    const-string v1, " "

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    .line 343
    const-string v0, " ("

    const-string v1, " "

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    .line 344
    const-string v0, "("

    const-string v1, " "

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    .line 345
    const-string v0, ") "

    const-string v1, " "

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    .line 346
    const-string v0, ")"

    const-string v1, " "

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    .line 347
    const-string v0, "`"

    const-string v1, " "

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    .line 348
    const-string v0, "\'"

    const-string v1, " "

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    .line 350
    const-string v0, "  "

    const-string v1, " "

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    .line 351
    const-string v0, "   "

    const-string v1, " "

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    .line 352
    const-string v0, "    "

    const-string v1, " "

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    .line 353
    const-string v0, "     "

    const-string v1, " "

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    .line 355
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "(?i)\\b(West to|South to|East to|North to|Outbound to|Inbound to|to|towards|"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 356
    invoke-virtual {p2}, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->getShortName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "|"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p2}, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->getLongName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")\\b"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, ""

    .line 355
    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 358
    const-string v0, "Sta"

    const-string v1, "Station"

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    .line 359
    const-string v0, "Stn"

    const-string v1, "Station"

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    .line 360
    const-string v0, "dntn"

    const-string v1, "Downtown"

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    .line 362
    return-object p1
.end method

.method protected directionTitleMatchItineraryNameOnAllPossibility(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;)Z
    .locals 8
    .param p1, "directionName"    # Ljava/lang/String;
    .param p2, "itineraryName"    # Ljava/lang/String;
    .param p4, "route"    # Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;",
            ")Z"
        }
    .end annotation

    .prologue
    .local p3, "allHeadsigns":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    const/4 v5, 0x0

    .line 311
    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->getDirectionMatchType()Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_3

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->getDirectionMatchType()Ljava/lang/String;

    move-result-object v6

    const-string v7, "levenshtein"

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    .line 312
    invoke-static {p2, p1}, Lcom/thetransitapp/droid/util/LevenshteinDistance;->computeDistance(Ljava/lang/String;Ljava/lang/String;)I

    move-result v3

    .line 313
    .local v3, "matchDistance":I
    if-lez v3, :cond_0

    .line 332
    .end local v3    # "matchDistance":I
    :goto_0
    return v5

    .line 316
    .restart local v3    # "matchDistance":I
    :cond_0
    invoke-virtual {p3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-nez v7, :cond_2

    .line 324
    const/4 v5, 0x1

    goto :goto_0

    .line 316
    :cond_2
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 317
    .local v2, "headsign":Ljava/lang/String;
    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_1

    .line 318
    invoke-static {p2, v2}, Lcom/thetransitapp/droid/util/LevenshteinDistance;->computeDistance(Ljava/lang/String;Ljava/lang/String;)I

    move-result v4

    .line 319
    .local v4, "newDistance":I
    if-ge v4, v3, :cond_1

    goto :goto_0

    .line 326
    .end local v2    # "headsign":Ljava/lang/String;
    .end local v3    # "matchDistance":I
    .end local v4    # "newDistance":I
    :cond_3
    invoke-virtual {p0, p1, p4}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->cleanedDirectionOnRoute(Ljava/lang/String;Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;)Ljava/lang/String;

    move-result-object v0

    .line 327
    .local v0, "cleanDirection":Ljava/lang/String;
    invoke-virtual {p0, p2, p4}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->cleanedDirectionOnRoute(Ljava/lang/String;Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;)Ljava/lang/String;

    move-result-object v1

    .line 329
    .local v1, "cleanItinerary":Ljava/lang/String;
    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->getDirectionMatchType()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_4

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->getDirectionMatchType()Ljava/lang/String;

    move-result-object v5

    const-string v6, "strict"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    .line 330
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    goto :goto_0

    .line 332
    :cond_4
    invoke-static {v1}, Ljava/util/regex/Pattern;->quote(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x2

    invoke-static {v5, v6}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    move-result-object v5

    invoke-virtual {v5, v0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v5

    .line 333
    invoke-virtual {v5}, Ljava/util/regex/Matcher;->find()Z

    move-result v5

    goto :goto_0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 50
    .param p1, "o"    # Ljava/lang/Object;

    .prologue
    .line 27
    move-object/from16 v0, p1

    move-object/from16 v1, p0

    if-ne v0, v1, :cond_0

    const/16 v49, 0x1

    :goto_0
    return v49

    :cond_0
    move-object/from16 v0, p1

    instance-of v0, v0, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;

    move/from16 v49, v0

    if-nez v49, :cond_1

    const/16 v49, 0x0

    goto :goto_0

    :cond_1
    move-object/from16 v2, p1

    check-cast v2, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;

    .local v2, "other":Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;
    move-object/from16 v0, p0

    invoke-virtual {v2, v0}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->canEqual(Ljava/lang/Object;)Z

    move-result v49

    if-nez v49, :cond_2

    const/16 v49, 0x0

    goto :goto_0

    :cond_2
    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->getRouteTypes()Ljava/util/ArrayList;

    move-result-object v33

    .local v33, "this$routeTypes":Ljava/util/ArrayList;
    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->getRouteTypes()Ljava/util/ArrayList;

    move-result-object v10

    .local v10, "other$routeTypes":Ljava/util/ArrayList;
    if-nez v33, :cond_4

    if-eqz v10, :cond_5

    :cond_3
    const/16 v49, 0x0

    goto :goto_0

    :cond_4
    move-object/from16 v0, v33

    invoke-virtual {v0, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v49

    if-eqz v49, :cond_3

    :cond_5
    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->getDirectionMatchType()Ljava/lang/String;

    move-result-object v30

    .local v30, "this$directionMatchType":Ljava/lang/String;
    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->getDirectionMatchType()Ljava/lang/String;

    move-result-object v7

    .local v7, "other$directionMatchType":Ljava/lang/String;
    if-nez v30, :cond_7

    if-eqz v7, :cond_8

    :cond_6
    const/16 v49, 0x0

    goto :goto_0

    :cond_7
    move-object/from16 v0, v30

    invoke-virtual {v0, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v49

    if-eqz v49, :cond_6

    :cond_8
    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->getTripURL()Ljava/lang/String;

    move-result-object v39

    .local v39, "this$tripURL":Ljava/lang/String;
    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->getTripURL()Ljava/lang/String;

    move-result-object v16

    .local v16, "other$tripURL":Ljava/lang/String;
    if-nez v39, :cond_a

    if-eqz v16, :cond_b

    :cond_9
    const/16 v49, 0x0

    goto :goto_0

    :cond_a
    move-object/from16 v0, v39

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v49

    if-eqz v49, :cond_9

    :cond_b
    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->getPredictionsKeyPath()Ljava/lang/String;

    move-result-object v31

    .local v31, "this$predictionsKeyPath":Ljava/lang/String;
    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->getPredictionsKeyPath()Ljava/lang/String;

    move-result-object v8

    .local v8, "other$predictionsKeyPath":Ljava/lang/String;
    if-nez v31, :cond_d

    if-eqz v8, :cond_e

    :cond_c
    const/16 v49, 0x0

    goto :goto_0

    :cond_d
    move-object/from16 v0, v31

    invoke-virtual {v0, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v49

    if-eqz v49, :cond_c

    :cond_e
    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->getDateKeyPath()Ljava/lang/String;

    move-result-object v28

    .local v28, "this$dateKeyPath":Ljava/lang/String;
    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->getDateKeyPath()Ljava/lang/String;

    move-result-object v5

    .local v5, "other$dateKeyPath":Ljava/lang/String;
    if-nez v28, :cond_10

    if-eqz v5, :cond_11

    :cond_f
    const/16 v49, 0x0

    goto/16 :goto_0

    :cond_10
    move-object/from16 v0, v28

    invoke-virtual {v0, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v49

    if-eqz v49, :cond_f

    :cond_11
    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->getDestinationFilteringKeyPath()Ljava/lang/String;

    move-result-object v29

    .local v29, "this$destinationFilteringKeyPath":Ljava/lang/String;
    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->getDestinationFilteringKeyPath()Ljava/lang/String;

    move-result-object v6

    .local v6, "other$destinationFilteringKeyPath":Ljava/lang/String;
    if-nez v29, :cond_13

    if-eqz v6, :cond_14

    :cond_12
    const/16 v49, 0x0

    goto/16 :goto_0

    :cond_13
    move-object/from16 v0, v29

    invoke-virtual {v0, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v49

    if-eqz v49, :cond_12

    :cond_14
    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->getRouteFilteringKeyPath()Ljava/lang/String;

    move-result-object v32

    .local v32, "this$routeFilteringKeyPath":Ljava/lang/String;
    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->getRouteFilteringKeyPath()Ljava/lang/String;

    move-result-object v9

    .local v9, "other$routeFilteringKeyPath":Ljava/lang/String;
    if-nez v32, :cond_16

    if-eqz v9, :cond_17

    :cond_15
    const/16 v49, 0x0

    goto/16 :goto_0

    :cond_16
    move-object/from16 v0, v32

    invoke-virtual {v0, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v49

    if-eqz v49, :cond_15

    :cond_17
    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->getScheduleBasedRegex()Ljava/util/regex/Pattern;

    move-result-object v35

    .local v35, "this$scheduleBasedRegex":Ljava/util/regex/Pattern;
    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->getScheduleBasedRegex()Ljava/util/regex/Pattern;

    move-result-object v12

    .local v12, "other$scheduleBasedRegex":Ljava/util/regex/Pattern;
    if-nez v35, :cond_19

    if-eqz v12, :cond_1a

    :cond_18
    const/16 v49, 0x0

    goto/16 :goto_0

    :cond_19
    move-object/from16 v0, v35

    invoke-virtual {v0, v12}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v49

    if-eqz v49, :cond_18

    :cond_1a
    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->getScheduleBasedKeyPath()Ljava/lang/String;

    move-result-object v34

    .local v34, "this$scheduleBasedKeyPath":Ljava/lang/String;
    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->getScheduleBasedKeyPath()Ljava/lang/String;

    move-result-object v11

    .local v11, "other$scheduleBasedKeyPath":Ljava/lang/String;
    if-nez v34, :cond_1c

    if-eqz v11, :cond_1d

    :cond_1b
    const/16 v49, 0x0

    goto/16 :goto_0

    :cond_1c
    move-object/from16 v0, v34

    invoke-virtual {v0, v11}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v49

    if-eqz v49, :cond_1b

    :cond_1d
    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->getCancelledRegex()Ljava/util/regex/Pattern;

    move-result-object v27

    .local v27, "this$cancelledRegex":Ljava/util/regex/Pattern;
    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->getCancelledRegex()Ljava/util/regex/Pattern;

    move-result-object v4

    .local v4, "other$cancelledRegex":Ljava/util/regex/Pattern;
    if-nez v27, :cond_1f

    if-eqz v4, :cond_20

    :cond_1e
    const/16 v49, 0x0

    goto/16 :goto_0

    :cond_1f
    move-object/from16 v0, v27

    invoke-virtual {v0, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v49

    if-eqz v49, :cond_1e

    :cond_20
    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->getCancelledKeyPath()Ljava/lang/String;

    move-result-object v26

    .local v26, "this$cancelledKeyPath":Ljava/lang/String;
    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->getCancelledKeyPath()Ljava/lang/String;

    move-result-object v3

    .local v3, "other$cancelledKeyPath":Ljava/lang/String;
    if-nez v26, :cond_22

    if-eqz v3, :cond_23

    :cond_21
    const/16 v49, 0x0

    goto/16 :goto_0

    :cond_22
    move-object/from16 v0, v26

    invoke-virtual {v0, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v49

    if-eqz v49, :cond_21

    :cond_23
    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->getStopFilteringKeyPath()Ljava/lang/String;

    move-result-object v36

    .local v36, "this$stopFilteringKeyPath":Ljava/lang/String;
    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->getStopFilteringKeyPath()Ljava/lang/String;

    move-result-object v13

    .local v13, "other$stopFilteringKeyPath":Ljava/lang/String;
    if-nez v36, :cond_25

    if-eqz v13, :cond_26

    :cond_24
    const/16 v49, 0x0

    goto/16 :goto_0

    :cond_25
    move-object/from16 v0, v36

    invoke-virtual {v0, v13}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v49

    if-eqz v49, :cond_24

    :cond_26
    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->getTimestampFormat()Lcom/thetransitapp/droid/util/DateFormatter;

    move-result-object v37

    .local v37, "this$timestampFormat":Lcom/thetransitapp/droid/util/DateFormatter;
    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->getTimestampFormat()Lcom/thetransitapp/droid/util/DateFormatter;

    move-result-object v14

    .local v14, "other$timestampFormat":Lcom/thetransitapp/droid/util/DateFormatter;
    if-nez v37, :cond_28

    if-eqz v14, :cond_29

    :cond_27
    const/16 v49, 0x0

    goto/16 :goto_0

    :cond_28
    move-object/from16 v0, v37

    invoke-virtual {v0, v14}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v49

    if-eqz v49, :cond_27

    :cond_29
    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->getTimestampKeyPath()Ljava/lang/String;

    move-result-object v38

    .local v38, "this$timestampKeyPath":Ljava/lang/String;
    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->getTimestampKeyPath()Ljava/lang/String;

    move-result-object v15

    .local v15, "other$timestampKeyPath":Ljava/lang/String;
    if-nez v38, :cond_2b

    if-eqz v15, :cond_2c

    :cond_2a
    const/16 v49, 0x0

    goto/16 :goto_0

    :cond_2b
    move-object/from16 v0, v38

    invoke-virtual {v0, v15}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v49

    if-eqz v49, :cond_2a

    :cond_2c
    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->getVehiculeURL()Ljava/lang/String;

    move-result-object v48

    .local v48, "this$vehiculeURL":Ljava/lang/String;
    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->getVehiculeURL()Ljava/lang/String;

    move-result-object v25

    .local v25, "other$vehiculeURL":Ljava/lang/String;
    if-nez v48, :cond_2e

    if-eqz v25, :cond_2f

    :cond_2d
    const/16 v49, 0x0

    goto/16 :goto_0

    :cond_2e
    move-object/from16 v0, v48

    move-object/from16 v1, v25

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v49

    if-eqz v49, :cond_2d

    :cond_2f
    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->getVehicleDestinationKeyPath()Ljava/lang/String;

    move-result-object v40

    .local v40, "this$vehicleDestinationKeyPath":Ljava/lang/String;
    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->getVehicleDestinationKeyPath()Ljava/lang/String;

    move-result-object v17

    .local v17, "other$vehicleDestinationKeyPath":Ljava/lang/String;
    if-nez v40, :cond_31

    if-eqz v17, :cond_32

    :cond_30
    const/16 v49, 0x0

    goto/16 :goto_0

    :cond_31
    move-object/from16 v0, v40

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v49

    if-eqz v49, :cond_30

    :cond_32
    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->getVehicleIdKeyPath()Ljava/lang/String;

    move-result-object v41

    .local v41, "this$vehicleIdKeyPath":Ljava/lang/String;
    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->getVehicleIdKeyPath()Ljava/lang/String;

    move-result-object v18

    .local v18, "other$vehicleIdKeyPath":Ljava/lang/String;
    if-nez v41, :cond_34

    if-eqz v18, :cond_35

    :cond_33
    const/16 v49, 0x0

    goto/16 :goto_0

    :cond_34
    move-object/from16 v0, v41

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v49

    if-eqz v49, :cond_33

    :cond_35
    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->getVehiclesKeyPath()Ljava/lang/String;

    move-result-object v47

    .local v47, "this$vehiclesKeyPath":Ljava/lang/String;
    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->getVehiclesKeyPath()Ljava/lang/String;

    move-result-object v24

    .local v24, "other$vehiclesKeyPath":Ljava/lang/String;
    if-nez v47, :cond_37

    if-eqz v24, :cond_38

    :cond_36
    const/16 v49, 0x0

    goto/16 :goto_0

    :cond_37
    move-object/from16 v0, v47

    move-object/from16 v1, v24

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v49

    if-eqz v49, :cond_36

    :cond_38
    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->getVehicleLatitudeKeyPath()Ljava/lang/String;

    move-result-object v42

    .local v42, "this$vehicleLatitudeKeyPath":Ljava/lang/String;
    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->getVehicleLatitudeKeyPath()Ljava/lang/String;

    move-result-object v19

    .local v19, "other$vehicleLatitudeKeyPath":Ljava/lang/String;
    if-nez v42, :cond_3a

    if-eqz v19, :cond_3b

    :cond_39
    const/16 v49, 0x0

    goto/16 :goto_0

    :cond_3a
    move-object/from16 v0, v42

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v49

    if-eqz v49, :cond_39

    :cond_3b
    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->getVehicleLongitudeKeyPath()Ljava/lang/String;

    move-result-object v44

    .local v44, "this$vehicleLongitudeKeyPath":Ljava/lang/String;
    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->getVehicleLongitudeKeyPath()Ljava/lang/String;

    move-result-object v21

    .local v21, "other$vehicleLongitudeKeyPath":Ljava/lang/String;
    if-nez v44, :cond_3d

    if-eqz v21, :cond_3e

    :cond_3c
    const/16 v49, 0x0

    goto/16 :goto_0

    :cond_3d
    move-object/from16 v0, v44

    move-object/from16 v1, v21

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v49

    if-eqz v49, :cond_3c

    :cond_3e
    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->getVehicleLocationsURL()Ljava/lang/String;

    move-result-object v43

    .local v43, "this$vehicleLocationsURL":Ljava/lang/String;
    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->getVehicleLocationsURL()Ljava/lang/String;

    move-result-object v20

    .local v20, "other$vehicleLocationsURL":Ljava/lang/String;
    if-nez v43, :cond_40

    if-eqz v20, :cond_41

    :cond_3f
    const/16 v49, 0x0

    goto/16 :goto_0

    :cond_40
    move-object/from16 v0, v43

    move-object/from16 v1, v20

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v49

    if-eqz v49, :cond_3f

    :cond_41
    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->getVehicleTimestampFormat()Lcom/thetransitapp/droid/util/DateFormatter;

    move-result-object v45

    .local v45, "this$vehicleTimestampFormat":Lcom/thetransitapp/droid/util/DateFormatter;
    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->getVehicleTimestampFormat()Lcom/thetransitapp/droid/util/DateFormatter;

    move-result-object v22

    .local v22, "other$vehicleTimestampFormat":Lcom/thetransitapp/droid/util/DateFormatter;
    if-nez v45, :cond_43

    if-eqz v22, :cond_44

    :cond_42
    const/16 v49, 0x0

    goto/16 :goto_0

    :cond_43
    move-object/from16 v0, v45

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v49

    if-eqz v49, :cond_42

    :cond_44
    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->getVehicleTimestampKeyPath()Ljava/lang/String;

    move-result-object v46

    .local v46, "this$vehicleTimestampKeyPath":Ljava/lang/String;
    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->getVehicleTimestampKeyPath()Ljava/lang/String;

    move-result-object v23

    .local v23, "other$vehicleTimestampKeyPath":Ljava/lang/String;
    if-nez v46, :cond_46

    if-eqz v23, :cond_47

    :cond_45
    const/16 v49, 0x0

    goto/16 :goto_0

    :cond_46
    move-object/from16 v0, v46

    move-object/from16 v1, v23

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v49

    if-eqz v49, :cond_45

    :cond_47
    const/16 v49, 0x1

    goto/16 :goto_0
.end method

.method protected fetchPredictionForURL(Landroid/content/Context;Ljava/lang/String;Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource$RealTimeCallback;)V
    .locals 6
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "url"    # Ljava/lang/String;
    .param p3, "itinerary"    # Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;
    .param p4, "callback"    # Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource$RealTimeCallback;

    .prologue
    .line 117
    new-instance v1, Ljava/util/Date;

    invoke-direct {v1}, Ljava/util/Date;-><init>()V

    invoke-virtual {p3, v1}, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->setPredictionsFetchDate(Ljava/util/Date;)V

    .line 119
    new-instance v0, Lcom/thetransitapp/droid/model/realtime/RealTimeFetchTask;

    new-instance v2, Lorg/apache/http/client/methods/HttpGet;

    invoke-direct {v2, p2}, Lorg/apache/http/client/methods/HttpGet;-><init>(Ljava/lang/String;)V

    move-object v1, p1

    move-object v3, p0

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/thetransitapp/droid/model/realtime/RealTimeFetchTask;-><init>(Landroid/content/Context;Lorg/apache/http/client/methods/HttpRequestBase;Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource$RealTimeCallback;)V

    .line 120
    .local v0, "task":Lcom/thetransitapp/droid/model/realtime/RealTimeFetchTask;
    invoke-virtual {v0}, Lcom/thetransitapp/droid/model/realtime/RealTimeFetchTask;->execute()V

    .line 121
    return-void
.end method

.method public getCancelledKeyPath()Ljava/lang/String;
    .locals 1

    .prologue
    .line 27
    iget-object v0, p0, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->cancelledKeyPath:Ljava/lang/String;

    return-object v0
.end method

.method public getCancelledRegex()Ljava/util/regex/Pattern;
    .locals 1

    .prologue
    .line 27
    iget-object v0, p0, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->cancelledRegex:Ljava/util/regex/Pattern;

    return-object v0
.end method

.method public getDateKeyPath()Ljava/lang/String;
    .locals 1

    .prologue
    .line 27
    iget-object v0, p0, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->dateKeyPath:Ljava/lang/String;

    return-object v0
.end method

.method public getDestinationFilteringKeyPath()Ljava/lang/String;
    .locals 1

    .prologue
    .line 27
    iget-object v0, p0, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->destinationFilteringKeyPath:Ljava/lang/String;

    return-object v0
.end method

.method public getDirectionMatchType()Ljava/lang/String;
    .locals 1

    .prologue
    .line 27
    iget-object v0, p0, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->directionMatchType:Ljava/lang/String;

    return-object v0
.end method

.method public getPredictionForItinerary(Landroid/content/Context;Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource$RealTimeCallback;)V
    .locals 2
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "itinerary"    # Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;
    .param p3, "callback"    # Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource$RealTimeCallback;

    .prologue
    .line 108
    iget-object v1, p0, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->tripURL:Ljava/lang/String;

    invoke-virtual {p0, v1, p2}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->replaceVariablesInURLFromItinerary(Ljava/lang/String;Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;)Ljava/lang/String;

    move-result-object v0

    .line 110
    .local v0, "urlToFetch":Ljava/lang/String;
    if-eqz v0, :cond_0

    invoke-virtual {p0, p2}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->shouldFetchPredictionsForItinerary(Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 111
    invoke-virtual {p0, p1, v0, p2, p3}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->fetchPredictionForURL(Landroid/content/Context;Ljava/lang/String;Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource$RealTimeCallback;)V

    .line 113
    :cond_0
    return-void
.end method

.method public getPredictionsKeyPath()Ljava/lang/String;
    .locals 1

    .prologue
    .line 27
    iget-object v0, p0, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->predictionsKeyPath:Ljava/lang/String;

    return-object v0
.end method

.method public getRouteFilteringKeyPath()Ljava/lang/String;
    .locals 1

    .prologue
    .line 27
    iget-object v0, p0, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->routeFilteringKeyPath:Ljava/lang/String;

    return-object v0
.end method

.method public getRouteTypes()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .prologue
    .line 27
    iget-object v0, p0, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->routeTypes:Ljava/util/ArrayList;

    return-object v0
.end method

.method public getScheduleBasedKeyPath()Ljava/lang/String;
    .locals 1

    .prologue
    .line 27
    iget-object v0, p0, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->scheduleBasedKeyPath:Ljava/lang/String;

    return-object v0
.end method

.method public getScheduleBasedRegex()Ljava/util/regex/Pattern;
    .locals 1

    .prologue
    .line 27
    iget-object v0, p0, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->scheduleBasedRegex:Ljava/util/regex/Pattern;

    return-object v0
.end method

.method public getStopFilteringKeyPath()Ljava/lang/String;
    .locals 1

    .prologue
    .line 27
    iget-object v0, p0, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->stopFilteringKeyPath:Ljava/lang/String;

    return-object v0
.end method

.method public getTimestampFormat()Lcom/thetransitapp/droid/util/DateFormatter;
    .locals 1

    .prologue
    .line 27
    iget-object v0, p0, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->timestampFormat:Lcom/thetransitapp/droid/util/DateFormatter;

    return-object v0
.end method

.method public getTimestampKeyPath()Ljava/lang/String;
    .locals 1

    .prologue
    .line 27
    iget-object v0, p0, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->timestampKeyPath:Ljava/lang/String;

    return-object v0
.end method

.method public getTripURL()Ljava/lang/String;
    .locals 1

    .prologue
    .line 27
    iget-object v0, p0, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->tripURL:Ljava/lang/String;

    return-object v0
.end method

.method public getVehicleDestinationKeyPath()Ljava/lang/String;
    .locals 1

    .prologue
    .line 27
    iget-object v0, p0, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->vehicleDestinationKeyPath:Ljava/lang/String;

    return-object v0
.end method

.method public getVehicleIdKeyPath()Ljava/lang/String;
    .locals 1

    .prologue
    .line 27
    iget-object v0, p0, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->vehicleIdKeyPath:Ljava/lang/String;

    return-object v0
.end method

.method public getVehicleLatitudeKeyPath()Ljava/lang/String;
    .locals 1

    .prologue
    .line 27
    iget-object v0, p0, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->vehicleLatitudeKeyPath:Ljava/lang/String;

    return-object v0
.end method

.method public getVehicleLocationsURL()Ljava/lang/String;
    .locals 1

    .prologue
    .line 27
    iget-object v0, p0, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->vehicleLocationsURL:Ljava/lang/String;

    return-object v0
.end method

.method public getVehicleLongitudeKeyPath()Ljava/lang/String;
    .locals 1

    .prologue
    .line 27
    iget-object v0, p0, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->vehicleLongitudeKeyPath:Ljava/lang/String;

    return-object v0
.end method

.method public getVehicleTimestampFormat()Lcom/thetransitapp/droid/util/DateFormatter;
    .locals 1

    .prologue
    .line 27
    iget-object v0, p0, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->vehicleTimestampFormat:Lcom/thetransitapp/droid/util/DateFormatter;

    return-object v0
.end method

.method public getVehicleTimestampKeyPath()Ljava/lang/String;
    .locals 1

    .prologue
    .line 27
    iget-object v0, p0, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->vehicleTimestampKeyPath:Ljava/lang/String;

    return-object v0
.end method

.method public getVehiclesKeyPath()Ljava/lang/String;
    .locals 1

    .prologue
    .line 27
    iget-object v0, p0, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->vehiclesKeyPath:Ljava/lang/String;

    return-object v0
.end method

.method public getVehiculeURL()Ljava/lang/String;
    .locals 1

    .prologue
    .line 27
    iget-object v0, p0, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->vehiculeURL:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 27

    .prologue
    .line 27
    const/16 v23, 0x1f

    .local v23, "PRIME":I
    const/16 v24, 0x1

    .local v24, "result":I
    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->getRouteTypes()Ljava/util/ArrayList;

    move-result-object v7

    .local v7, "$routeTypes":Ljava/util/ArrayList;
    if-nez v7, :cond_0

    const/16 v25, 0x0

    :goto_0
    add-int/lit8 v24, v25, 0x1f

    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->getDirectionMatchType()Ljava/lang/String;

    move-result-object v4

    .local v4, "$directionMatchType":Ljava/lang/String;
    mul-int/lit8 v26, v24, 0x1f

    if-nez v4, :cond_1

    const/16 v25, 0x0

    :goto_1
    add-int v24, v26, v25

    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->getTripURL()Ljava/lang/String;

    move-result-object v13

    .local v13, "$tripURL":Ljava/lang/String;
    mul-int/lit8 v26, v24, 0x1f

    if-nez v13, :cond_2

    const/16 v25, 0x0

    :goto_2
    add-int v24, v26, v25

    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->getPredictionsKeyPath()Ljava/lang/String;

    move-result-object v5

    .local v5, "$predictionsKeyPath":Ljava/lang/String;
    mul-int/lit8 v26, v24, 0x1f

    if-nez v5, :cond_3

    const/16 v25, 0x0

    :goto_3
    add-int v24, v26, v25

    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->getDateKeyPath()Ljava/lang/String;

    move-result-object v2

    .local v2, "$dateKeyPath":Ljava/lang/String;
    mul-int/lit8 v26, v24, 0x1f

    if-nez v2, :cond_4

    const/16 v25, 0x0

    :goto_4
    add-int v24, v26, v25

    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->getDestinationFilteringKeyPath()Ljava/lang/String;

    move-result-object v3

    .local v3, "$destinationFilteringKeyPath":Ljava/lang/String;
    mul-int/lit8 v26, v24, 0x1f

    if-nez v3, :cond_5

    const/16 v25, 0x0

    :goto_5
    add-int v24, v26, v25

    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->getRouteFilteringKeyPath()Ljava/lang/String;

    move-result-object v6

    .local v6, "$routeFilteringKeyPath":Ljava/lang/String;
    mul-int/lit8 v26, v24, 0x1f

    if-nez v6, :cond_6

    const/16 v25, 0x0

    :goto_6
    add-int v24, v26, v25

    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->getScheduleBasedRegex()Ljava/util/regex/Pattern;

    move-result-object v9

    .local v9, "$scheduleBasedRegex":Ljava/util/regex/Pattern;
    mul-int/lit8 v26, v24, 0x1f

    if-nez v9, :cond_7

    const/16 v25, 0x0

    :goto_7
    add-int v24, v26, v25

    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->getScheduleBasedKeyPath()Ljava/lang/String;

    move-result-object v8

    .local v8, "$scheduleBasedKeyPath":Ljava/lang/String;
    mul-int/lit8 v26, v24, 0x1f

    if-nez v8, :cond_8

    const/16 v25, 0x0

    :goto_8
    add-int v24, v26, v25

    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->getCancelledRegex()Ljava/util/regex/Pattern;

    move-result-object v1

    .local v1, "$cancelledRegex":Ljava/util/regex/Pattern;
    mul-int/lit8 v26, v24, 0x1f

    if-nez v1, :cond_9

    const/16 v25, 0x0

    :goto_9
    add-int v24, v26, v25

    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->getCancelledKeyPath()Ljava/lang/String;

    move-result-object v0

    .local v0, "$cancelledKeyPath":Ljava/lang/String;
    mul-int/lit8 v26, v24, 0x1f

    if-nez v0, :cond_a

    const/16 v25, 0x0

    :goto_a
    add-int v24, v26, v25

    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->getStopFilteringKeyPath()Ljava/lang/String;

    move-result-object v10

    .local v10, "$stopFilteringKeyPath":Ljava/lang/String;
    mul-int/lit8 v26, v24, 0x1f

    if-nez v10, :cond_b

    const/16 v25, 0x0

    :goto_b
    add-int v24, v26, v25

    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->getTimestampFormat()Lcom/thetransitapp/droid/util/DateFormatter;

    move-result-object v11

    .local v11, "$timestampFormat":Lcom/thetransitapp/droid/util/DateFormatter;
    mul-int/lit8 v26, v24, 0x1f

    if-nez v11, :cond_c

    const/16 v25, 0x0

    :goto_c
    add-int v24, v26, v25

    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->getTimestampKeyPath()Ljava/lang/String;

    move-result-object v12

    .local v12, "$timestampKeyPath":Ljava/lang/String;
    mul-int/lit8 v26, v24, 0x1f

    if-nez v12, :cond_d

    const/16 v25, 0x0

    :goto_d
    add-int v24, v26, v25

    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->getVehiculeURL()Ljava/lang/String;

    move-result-object v22

    .local v22, "$vehiculeURL":Ljava/lang/String;
    mul-int/lit8 v26, v24, 0x1f

    if-nez v22, :cond_e

    const/16 v25, 0x0

    :goto_e
    add-int v24, v26, v25

    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->getVehicleDestinationKeyPath()Ljava/lang/String;

    move-result-object v14

    .local v14, "$vehicleDestinationKeyPath":Ljava/lang/String;
    mul-int/lit8 v26, v24, 0x1f

    if-nez v14, :cond_f

    const/16 v25, 0x0

    :goto_f
    add-int v24, v26, v25

    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->getVehicleIdKeyPath()Ljava/lang/String;

    move-result-object v15

    .local v15, "$vehicleIdKeyPath":Ljava/lang/String;
    mul-int/lit8 v26, v24, 0x1f

    if-nez v15, :cond_10

    const/16 v25, 0x0

    :goto_10
    add-int v24, v26, v25

    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->getVehiclesKeyPath()Ljava/lang/String;

    move-result-object v21

    .local v21, "$vehiclesKeyPath":Ljava/lang/String;
    mul-int/lit8 v26, v24, 0x1f

    if-nez v21, :cond_11

    const/16 v25, 0x0

    :goto_11
    add-int v24, v26, v25

    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->getVehicleLatitudeKeyPath()Ljava/lang/String;

    move-result-object v16

    .local v16, "$vehicleLatitudeKeyPath":Ljava/lang/String;
    mul-int/lit8 v26, v24, 0x1f

    if-nez v16, :cond_12

    const/16 v25, 0x0

    :goto_12
    add-int v24, v26, v25

    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->getVehicleLongitudeKeyPath()Ljava/lang/String;

    move-result-object v18

    .local v18, "$vehicleLongitudeKeyPath":Ljava/lang/String;
    mul-int/lit8 v26, v24, 0x1f

    if-nez v18, :cond_13

    const/16 v25, 0x0

    :goto_13
    add-int v24, v26, v25

    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->getVehicleLocationsURL()Ljava/lang/String;

    move-result-object v17

    .local v17, "$vehicleLocationsURL":Ljava/lang/String;
    mul-int/lit8 v26, v24, 0x1f

    if-nez v17, :cond_14

    const/16 v25, 0x0

    :goto_14
    add-int v24, v26, v25

    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->getVehicleTimestampFormat()Lcom/thetransitapp/droid/util/DateFormatter;

    move-result-object v19

    .local v19, "$vehicleTimestampFormat":Lcom/thetransitapp/droid/util/DateFormatter;
    mul-int/lit8 v26, v24, 0x1f

    if-nez v19, :cond_15

    const/16 v25, 0x0

    :goto_15
    add-int v24, v26, v25

    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->getVehicleTimestampKeyPath()Ljava/lang/String;

    move-result-object v20

    .local v20, "$vehicleTimestampKeyPath":Ljava/lang/String;
    mul-int/lit8 v26, v24, 0x1f

    if-nez v20, :cond_16

    const/16 v25, 0x0

    :goto_16
    add-int v24, v26, v25

    return v24

    .end local v0    # "$cancelledKeyPath":Ljava/lang/String;
    .end local v1    # "$cancelledRegex":Ljava/util/regex/Pattern;
    .end local v2    # "$dateKeyPath":Ljava/lang/String;
    .end local v3    # "$destinationFilteringKeyPath":Ljava/lang/String;
    .end local v4    # "$directionMatchType":Ljava/lang/String;
    .end local v5    # "$predictionsKeyPath":Ljava/lang/String;
    .end local v6    # "$routeFilteringKeyPath":Ljava/lang/String;
    .end local v8    # "$scheduleBasedKeyPath":Ljava/lang/String;
    .end local v9    # "$scheduleBasedRegex":Ljava/util/regex/Pattern;
    .end local v10    # "$stopFilteringKeyPath":Ljava/lang/String;
    .end local v11    # "$timestampFormat":Lcom/thetransitapp/droid/util/DateFormatter;
    .end local v12    # "$timestampKeyPath":Ljava/lang/String;
    .end local v13    # "$tripURL":Ljava/lang/String;
    .end local v14    # "$vehicleDestinationKeyPath":Ljava/lang/String;
    .end local v15    # "$vehicleIdKeyPath":Ljava/lang/String;
    .end local v16    # "$vehicleLatitudeKeyPath":Ljava/lang/String;
    .end local v17    # "$vehicleLocationsURL":Ljava/lang/String;
    .end local v18    # "$vehicleLongitudeKeyPath":Ljava/lang/String;
    .end local v19    # "$vehicleTimestampFormat":Lcom/thetransitapp/droid/util/DateFormatter;
    .end local v20    # "$vehicleTimestampKeyPath":Ljava/lang/String;
    .end local v21    # "$vehiclesKeyPath":Ljava/lang/String;
    .end local v22    # "$vehiculeURL":Ljava/lang/String;
    :cond_0
    invoke-virtual {v7}, Ljava/lang/Object;->hashCode()I

    move-result v25

    goto/16 :goto_0

    .restart local v4    # "$directionMatchType":Ljava/lang/String;
    :cond_1
    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    move-result v25

    goto/16 :goto_1

    .restart local v13    # "$tripURL":Ljava/lang/String;
    :cond_2
    invoke-virtual {v13}, Ljava/lang/Object;->hashCode()I

    move-result v25

    goto/16 :goto_2

    .restart local v5    # "$predictionsKeyPath":Ljava/lang/String;
    :cond_3
    invoke-virtual {v5}, Ljava/lang/Object;->hashCode()I

    move-result v25

    goto/16 :goto_3

    .restart local v2    # "$dateKeyPath":Ljava/lang/String;
    :cond_4
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v25

    goto/16 :goto_4

    .restart local v3    # "$destinationFilteringKeyPath":Ljava/lang/String;
    :cond_5
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v25

    goto/16 :goto_5

    .restart local v6    # "$routeFilteringKeyPath":Ljava/lang/String;
    :cond_6
    invoke-virtual {v6}, Ljava/lang/Object;->hashCode()I

    move-result v25

    goto/16 :goto_6

    .restart local v9    # "$scheduleBasedRegex":Ljava/util/regex/Pattern;
    :cond_7
    invoke-virtual {v9}, Ljava/lang/Object;->hashCode()I

    move-result v25

    goto/16 :goto_7

    .restart local v8    # "$scheduleBasedKeyPath":Ljava/lang/String;
    :cond_8
    invoke-virtual {v8}, Ljava/lang/Object;->hashCode()I

    move-result v25

    goto/16 :goto_8

    .restart local v1    # "$cancelledRegex":Ljava/util/regex/Pattern;
    :cond_9
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v25

    goto/16 :goto_9

    .restart local v0    # "$cancelledKeyPath":Ljava/lang/String;
    :cond_a
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v25

    goto/16 :goto_a

    .restart local v10    # "$stopFilteringKeyPath":Ljava/lang/String;
    :cond_b
    invoke-virtual {v10}, Ljava/lang/Object;->hashCode()I

    move-result v25

    goto/16 :goto_b

    .restart local v11    # "$timestampFormat":Lcom/thetransitapp/droid/util/DateFormatter;
    :cond_c
    invoke-virtual {v11}, Ljava/lang/Object;->hashCode()I

    move-result v25

    goto/16 :goto_c

    .restart local v12    # "$timestampKeyPath":Ljava/lang/String;
    :cond_d
    invoke-virtual {v12}, Ljava/lang/Object;->hashCode()I

    move-result v25

    goto/16 :goto_d

    .restart local v22    # "$vehiculeURL":Ljava/lang/String;
    :cond_e
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Object;->hashCode()I

    move-result v25

    goto/16 :goto_e

    .restart local v14    # "$vehicleDestinationKeyPath":Ljava/lang/String;
    :cond_f
    invoke-virtual {v14}, Ljava/lang/Object;->hashCode()I

    move-result v25

    goto/16 :goto_f

    .restart local v15    # "$vehicleIdKeyPath":Ljava/lang/String;
    :cond_10
    invoke-virtual {v15}, Ljava/lang/Object;->hashCode()I

    move-result v25

    goto/16 :goto_10

    .restart local v21    # "$vehiclesKeyPath":Ljava/lang/String;
    :cond_11
    invoke-virtual/range {v21 .. v21}, Ljava/lang/Object;->hashCode()I

    move-result v25

    goto/16 :goto_11

    .restart local v16    # "$vehicleLatitudeKeyPath":Ljava/lang/String;
    :cond_12
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->hashCode()I

    move-result v25

    goto/16 :goto_12

    .restart local v18    # "$vehicleLongitudeKeyPath":Ljava/lang/String;
    :cond_13
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->hashCode()I

    move-result v25

    goto/16 :goto_13

    .restart local v17    # "$vehicleLocationsURL":Ljava/lang/String;
    :cond_14
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->hashCode()I

    move-result v25

    goto/16 :goto_14

    .restart local v19    # "$vehicleTimestampFormat":Lcom/thetransitapp/droid/util/DateFormatter;
    :cond_15
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->hashCode()I

    move-result v25

    goto/16 :goto_15

    .restart local v20    # "$vehicleTimestampKeyPath":Ljava/lang/String;
    :cond_16
    invoke-virtual/range {v20 .. v20}, Ljava/lang/Object;->hashCode()I

    move-result v25

    goto/16 :goto_16
.end method

.method protected abstract parseStream(Ljava/io/InputStream;)Ljava/lang/Object;
.end method

.method protected abstract processScheduleResponse(Ljava/lang/Object;Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;)Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;",
            ")",
            "Ljava/util/List",
            "<",
            "Lcom/thetransitapp/droid/model/realtime/Prediction;",
            ">;"
        }
    .end annotation
.end method

.method protected replaceVariablesInURLFromItinerary(Ljava/lang/String;Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;)Ljava/lang/String;
    .locals 4
    .param p1, "url"    # Ljava/lang/String;
    .param p2, "itinerary"    # Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;

    .prologue
    .line 78
    :try_start_0
    invoke-virtual {p2}, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->getRealTimeRouteId()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 79
    const-string v1, "(?i)__realTimeRouteID__"

    .line 80
    invoke-virtual {p2}, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->getRealTimeRouteId()Ljava/lang/String;

    move-result-object v2

    const-string v3, "UTF-8"

    invoke-static {v2, v3}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 79
    invoke-virtual {p1, v1, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 83
    :cond_0
    invoke-virtual {p2}, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->getRealTimeStopId()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 84
    const-string v1, "(?i)__realTimeStopID__"

    .line 85
    invoke-virtual {p2}, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->getRealTimeStopId()Ljava/lang/String;

    move-result-object v2

    const-string v3, "UTF-8"

    invoke-static {v2, v3}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 84
    invoke-virtual {p1, v1, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object p1

    .line 91
    :cond_1
    :goto_0
    const-string v1, "__"

    invoke-virtual {p1, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 92
    const/4 p1, 0x0

    .line 94
    .end local p1    # "url":Ljava/lang/String;
    :cond_2
    return-object p1

    .line 87
    .restart local p1    # "url":Ljava/lang/String;
    :catch_0
    move-exception v0

    .line 88
    .local v0, "e":Ljava/io/UnsupportedEncodingException;
    const-string v1, "BaseRealTimeDataSource"

    const-string v2, "Missing encoding UTF-8"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0
.end method

.method public setCancelledKeyPath(Ljava/lang/String;)V
    .locals 0
    .param p1, "cancelledKeyPath"    # Ljava/lang/String;

    .prologue
    .line 27
    iput-object p1, p0, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->cancelledKeyPath:Ljava/lang/String;

    return-void
.end method

.method public setCancelledRegex(Ljava/util/regex/Pattern;)V
    .locals 0
    .param p1, "cancelledRegex"    # Ljava/util/regex/Pattern;

    .prologue
    .line 27
    iput-object p1, p0, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->cancelledRegex:Ljava/util/regex/Pattern;

    return-void
.end method

.method public setDateKeyPath(Ljava/lang/String;)V
    .locals 0
    .param p1, "dateKeyPath"    # Ljava/lang/String;

    .prologue
    .line 27
    iput-object p1, p0, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->dateKeyPath:Ljava/lang/String;

    return-void
.end method

.method public setDestinationFilteringKeyPath(Ljava/lang/String;)V
    .locals 0
    .param p1, "destinationFilteringKeyPath"    # Ljava/lang/String;

    .prologue
    .line 27
    iput-object p1, p0, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->destinationFilteringKeyPath:Ljava/lang/String;

    return-void
.end method

.method public setDirectionMatchType(Ljava/lang/String;)V
    .locals 0
    .param p1, "directionMatchType"    # Ljava/lang/String;

    .prologue
    .line 27
    iput-object p1, p0, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->directionMatchType:Ljava/lang/String;

    return-void
.end method

.method public setPredictionsKeyPath(Ljava/lang/String;)V
    .locals 0
    .param p1, "predictionsKeyPath"    # Ljava/lang/String;

    .prologue
    .line 27
    iput-object p1, p0, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->predictionsKeyPath:Ljava/lang/String;

    return-void
.end method

.method public setRouteFilteringKeyPath(Ljava/lang/String;)V
    .locals 0
    .param p1, "routeFilteringKeyPath"    # Ljava/lang/String;

    .prologue
    .line 27
    iput-object p1, p0, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->routeFilteringKeyPath:Ljava/lang/String;

    return-void
.end method

.method public setRouteTypes(Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 27
    .local p1, "routeTypes":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/Integer;>;"
    iput-object p1, p0, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->routeTypes:Ljava/util/ArrayList;

    return-void
.end method

.method public setScheduleBasedKeyPath(Ljava/lang/String;)V
    .locals 0
    .param p1, "scheduleBasedKeyPath"    # Ljava/lang/String;

    .prologue
    .line 27
    iput-object p1, p0, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->scheduleBasedKeyPath:Ljava/lang/String;

    return-void
.end method

.method public setScheduleBasedRegex(Ljava/util/regex/Pattern;)V
    .locals 0
    .param p1, "scheduleBasedRegex"    # Ljava/util/regex/Pattern;

    .prologue
    .line 27
    iput-object p1, p0, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->scheduleBasedRegex:Ljava/util/regex/Pattern;

    return-void
.end method

.method public setStopFilteringKeyPath(Ljava/lang/String;)V
    .locals 0
    .param p1, "stopFilteringKeyPath"    # Ljava/lang/String;

    .prologue
    .line 27
    iput-object p1, p0, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->stopFilteringKeyPath:Ljava/lang/String;

    return-void
.end method

.method public setTimestampFormat(Lcom/thetransitapp/droid/util/DateFormatter;)V
    .locals 0
    .param p1, "timestampFormat"    # Lcom/thetransitapp/droid/util/DateFormatter;

    .prologue
    .line 27
    iput-object p1, p0, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->timestampFormat:Lcom/thetransitapp/droid/util/DateFormatter;

    return-void
.end method

.method public setTimestampKeyPath(Ljava/lang/String;)V
    .locals 0
    .param p1, "timestampKeyPath"    # Ljava/lang/String;

    .prologue
    .line 27
    iput-object p1, p0, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->timestampKeyPath:Ljava/lang/String;

    return-void
.end method

.method public setTripURL(Ljava/lang/String;)V
    .locals 0
    .param p1, "tripURL"    # Ljava/lang/String;

    .prologue
    .line 27
    iput-object p1, p0, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->tripURL:Ljava/lang/String;

    return-void
.end method

.method public setVehicleDestinationKeyPath(Ljava/lang/String;)V
    .locals 0
    .param p1, "vehicleDestinationKeyPath"    # Ljava/lang/String;

    .prologue
    .line 27
    iput-object p1, p0, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->vehicleDestinationKeyPath:Ljava/lang/String;

    return-void
.end method

.method public setVehicleIdKeyPath(Ljava/lang/String;)V
    .locals 0
    .param p1, "vehicleIdKeyPath"    # Ljava/lang/String;

    .prologue
    .line 27
    iput-object p1, p0, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->vehicleIdKeyPath:Ljava/lang/String;

    return-void
.end method

.method public setVehicleLatitudeKeyPath(Ljava/lang/String;)V
    .locals 0
    .param p1, "vehicleLatitudeKeyPath"    # Ljava/lang/String;

    .prologue
    .line 27
    iput-object p1, p0, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->vehicleLatitudeKeyPath:Ljava/lang/String;

    return-void
.end method

.method public setVehicleLocationsURL(Ljava/lang/String;)V
    .locals 0
    .param p1, "vehicleLocationsURL"    # Ljava/lang/String;

    .prologue
    .line 27
    iput-object p1, p0, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->vehicleLocationsURL:Ljava/lang/String;

    return-void
.end method

.method public setVehicleLongitudeKeyPath(Ljava/lang/String;)V
    .locals 0
    .param p1, "vehicleLongitudeKeyPath"    # Ljava/lang/String;

    .prologue
    .line 27
    iput-object p1, p0, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->vehicleLongitudeKeyPath:Ljava/lang/String;

    return-void
.end method

.method public setVehicleTimestampFormat(Lcom/thetransitapp/droid/util/DateFormatter;)V
    .locals 0
    .param p1, "vehicleTimestampFormat"    # Lcom/thetransitapp/droid/util/DateFormatter;

    .prologue
    .line 27
    iput-object p1, p0, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->vehicleTimestampFormat:Lcom/thetransitapp/droid/util/DateFormatter;

    return-void
.end method

.method public setVehicleTimestampKeyPath(Ljava/lang/String;)V
    .locals 0
    .param p1, "vehicleTimestampKeyPath"    # Ljava/lang/String;

    .prologue
    .line 27
    iput-object p1, p0, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->vehicleTimestampKeyPath:Ljava/lang/String;

    return-void
.end method

.method public setVehiclesKeyPath(Ljava/lang/String;)V
    .locals 0
    .param p1, "vehiclesKeyPath"    # Ljava/lang/String;

    .prologue
    .line 27
    iput-object p1, p0, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->vehiclesKeyPath:Ljava/lang/String;

    return-void
.end method

.method public setVehiculeURL(Ljava/lang/String;)V
    .locals 0
    .param p1, "vehiculeURL"    # Ljava/lang/String;

    .prologue
    .line 27
    iput-object p1, p0, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->vehiculeURL:Ljava/lang/String;

    return-void
.end method

.method public shouldFetchPredictionsForItinerary(Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;)Z
    .locals 7
    .param p1, "itinerary"    # Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;

    .prologue
    .line 98
    invoke-virtual {p1}, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->getPredictionsFetchDate()Ljava/util/Date;

    move-result-object v0

    .line 99
    .local v0, "lastFetchDate":Ljava/util/Date;
    if-nez v0, :cond_0

    .line 100
    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->arePredictionsEnabled()Z

    move-result v3

    .line 103
    :goto_0
    return v3

    .line 102
    :cond_0
    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v3

    new-instance v5, Ljava/util/Date;

    invoke-direct {v5}, Ljava/util/Date;-><init>()V

    invoke-virtual {v5}, Ljava/util/Date;->getTime()J

    move-result-wide v5

    sub-long v1, v3, v5

    .line 103
    .local v1, "timeDiff":J
    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->arePredictionsEnabled()Z

    move-result v3

    if-eqz v3, :cond_1

    const-wide/16 v3, -0x4e20

    cmp-long v3, v1, v3

    if-gez v3, :cond_1

    const/4 v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    goto :goto_0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 27
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "BaseRealTimeDataSource(routeTypes="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->getRouteTypes()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", directionMatchType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->getDirectionMatchType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", tripURL="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->getTripURL()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", predictionsKeyPath="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->getPredictionsKeyPath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", dateKeyPath="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->getDateKeyPath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", destinationFilteringKeyPath="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->getDestinationFilteringKeyPath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", routeFilteringKeyPath="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->getRouteFilteringKeyPath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", scheduleBasedRegex="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->getScheduleBasedRegex()Ljava/util/regex/Pattern;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", scheduleBasedKeyPath="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->getScheduleBasedKeyPath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", cancelledRegex="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->getCancelledRegex()Ljava/util/regex/Pattern;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", cancelledKeyPath="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->getCancelledKeyPath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", stopFilteringKeyPath="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->getStopFilteringKeyPath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", timestampFormat="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->getTimestampFormat()Lcom/thetransitapp/droid/util/DateFormatter;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", timestampKeyPath="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->getTimestampKeyPath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", vehiculeURL="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->getVehiculeURL()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", vehicleDestinationKeyPath="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->getVehicleDestinationKeyPath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", vehicleIdKeyPath="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->getVehicleIdKeyPath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", vehiclesKeyPath="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->getVehiclesKeyPath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", vehicleLatitudeKeyPath="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->getVehicleLatitudeKeyPath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", vehicleLongitudeKeyPath="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->getVehicleLongitudeKeyPath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", vehicleLocationsURL="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->getVehicleLocationsURL()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", vehicleTimestampFormat="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->getVehicleTimestampFormat()Lcom/thetransitapp/droid/util/DateFormatter;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", vehicleTimestampKeyPath="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->getVehicleTimestampKeyPath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected valueMatchCancelled(Ljava/lang/Object;)Z
    .locals 1
    .param p1, "value"    # Ljava/lang/Object;

    .prologue
    .line 366
    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->getCancelledRegex()Ljava/util/regex/Pattern;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->valueMatchRegex(Ljava/lang/Object;Ljava/util/regex/Pattern;)Z

    move-result v0

    return v0
.end method

.method protected valueMatchRegex(Ljava/lang/Object;Ljava/util/regex/Pattern;)Z
    .locals 1
    .param p1, "value"    # Ljava/lang/Object;
    .param p2, "regex"    # Ljava/util/regex/Pattern;

    .prologue
    .line 374
    instance-of v0, p1, Ljava/lang/Integer;

    if-eqz v0, :cond_0

    .line 375
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    .line 376
    .end local p1    # "value":Ljava/lang/Object;
    :cond_0
    check-cast p1, Ljava/lang/CharSequence;

    invoke-virtual {p2, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    move-result v0

    return v0
.end method

.method protected valueMatchScheduleBased(Ljava/lang/Object;)Z
    .locals 1
    .param p1, "value"    # Ljava/lang/Object;

    .prologue
    .line 370
    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->getScheduleBasedRegex()Ljava/util/regex/Pattern;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->valueMatchRegex(Ljava/lang/Object;Ljava/util/regex/Pattern;)Z

    move-result v0

    return v0
.end method
