.class public Lcom/thetransitapp/droid/model/realtime/GTFSRealTimeDataSource;
.super Lcom/thetransitapp/droid/model/realtime/JSONRealTimeDataSource;
.source "GTFSRealTimeDataSource.java"


# static fields
.field private static final serialVersionUID:J = 0x1L


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 17
    invoke-direct {p0}, Lcom/thetransitapp/droid/model/realtime/JSONRealTimeDataSource;-><init>()V

    return-void
.end method


# virtual methods
.method public getPredictionForItinerary(Landroid/content/Context;Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource$RealTimeCallback;)V
    .locals 9
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "itinerary"    # Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;
    .param p3, "callback"    # Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource$RealTimeCallback;

    .prologue
    .line 22
    invoke-virtual {p2}, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->getCurrentScheduleItem()Lcom/thetransitapp/droid/model/ScheduleItem;

    move-result-object v2

    .line 23
    .local v2, "item":Lcom/thetransitapp/droid/model/ScheduleItem;
    if-eqz v2, :cond_1

    .line 24
    invoke-virtual {p2}, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->getOngoingScheduleItems()Ljava/util/List;

    move-result-object v3

    .line 25
    .local v3, "items":Ljava/util/List;, "Ljava/util/List<Lcom/thetransitapp/droid/model/ScheduleItem;>;"
    invoke-interface {v3, v2}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v1

    .line 27
    .local v1, "index":I
    const/4 v6, -0x1

    if-eq v1, v6, :cond_1

    invoke-virtual {p2}, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->getRoute()Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;

    move-result-object v6

    invoke-virtual {v6}, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->getFeed()Lcom/thetransitapp/droid/model/Feed;

    move-result-object v6

    invoke-virtual {v6}, Lcom/thetransitapp/droid/model/Feed;->getCode()Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_1

    .line 28
    invoke-virtual {p2}, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->getRealTimeRouteId()Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_1

    .line 30
    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/realtime/GTFSRealTimeDataSource;->getTripURL()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p0, v6, p2}, Lcom/thetransitapp/droid/model/realtime/GTFSRealTimeDataSource;->replaceVariablesInURLFromItinerary(Ljava/lang/String;Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;)Ljava/lang/String;

    move-result-object v5

    .line 31
    .local v5, "urlToFetch":Ljava/lang/String;
    if-eqz v5, :cond_1

    .line 32
    new-instance v4, Ljava/lang/String;

    invoke-direct {v4}, Ljava/lang/String;-><init>()V

    .line 33
    .local v4, "tripIDsString":Ljava/lang/String;
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-nez v7, :cond_2

    .line 40
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v7, "?feed_code="

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {p2}, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->getRoute()Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;

    move-result-object v7

    invoke-virtual {v7}, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->getFeed()Lcom/thetransitapp/droid/model/Feed;

    move-result-object v7

    invoke-virtual {v7}, Lcom/thetransitapp/droid/model/Feed;->getCode()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 41
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v7, "&stop_id="

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {p2}, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->getRealTimeStopId()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 42
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v7, "&trip_ids="

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 43
    invoke-virtual {p2}, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->getRealTimeRouteId()Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_0

    .line 44
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v7, "&route_id="

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {p2}, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->getRealTimeRouteId()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 46
    :cond_0
    invoke-virtual {p0, p1, v5, p2, p3}, Lcom/thetransitapp/droid/model/realtime/GTFSRealTimeDataSource;->fetchPredictionForURL(Landroid/content/Context;Ljava/lang/String;Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource$RealTimeCallback;)V

    .line 50
    .end local v1    # "index":I
    .end local v3    # "items":Ljava/util/List;, "Ljava/util/List<Lcom/thetransitapp/droid/model/ScheduleItem;>;"
    .end local v4    # "tripIDsString":Ljava/lang/String;
    .end local v5    # "urlToFetch":Ljava/lang/String;
    :cond_1
    return-void

    .line 33
    .restart local v1    # "index":I
    .restart local v3    # "items":Ljava/util/List;, "Ljava/util/List<Lcom/thetransitapp/droid/model/ScheduleItem;>;"
    .restart local v4    # "tripIDsString":Ljava/lang/String;
    .restart local v5    # "urlToFetch":Ljava/lang/String;
    :cond_2
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/thetransitapp/droid/model/ScheduleItem;

    .line 34
    .local v0, "endItem":Lcom/thetransitapp/droid/model/ScheduleItem;
    const-string v7, ""

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3

    .line 35
    invoke-virtual {v0}, Lcom/thetransitapp/droid/model/ScheduleItem;->getTripId()Ljava/lang/String;

    move-result-object v4

    goto/16 :goto_0

    .line 37
    :cond_3
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v8, ","

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v0}, Lcom/thetransitapp/droid/model/ScheduleItem;->getTripId()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    goto/16 :goto_0
.end method

.method protected processScheduleResponse(Ljava/lang/Object;Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;)Ljava/util/List;
    .locals 13
    .param p1, "object"    # Ljava/lang/Object;
    .param p2, "itinerary"    # Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;
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

    .prologue
    .line 54
    move-object v7, p1

    check-cast v7, Lorg/json/JSONObject;

    .line 56
    .local v7, "updateObject":Lorg/json/JSONObject;
    :try_start_0
    const-string v8, "updates"

    invoke-virtual {v7, v8}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_5

    const-string v8, "updates"

    invoke-virtual {v7, v8}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v8

    if-nez v8, :cond_5

    .line 57
    const-string v8, "updates"

    invoke-virtual {v7, v8}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v5

    .line 59
    .local v5, "predictionObjects":Lorg/json/JSONArray;
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 60
    .local v6, "predictions":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/thetransitapp/droid/model/realtime/Prediction;>;"
    const/4 v2, 0x0

    .local v2, "index":I
    :goto_0
    invoke-virtual {v5}, Lorg/json/JSONArray;->length()I
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_1

    move-result v8

    if-lt v2, v8, :cond_0

    .line 95
    .end local v2    # "index":I
    .end local v5    # "predictionObjects":Lorg/json/JSONArray;
    .end local v6    # "predictions":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/thetransitapp/droid/model/realtime/Prediction;>;"
    :goto_1
    return-object v6

    .line 62
    .restart local v2    # "index":I
    .restart local v5    # "predictionObjects":Lorg/json/JSONArray;
    .restart local v6    # "predictions":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/thetransitapp/droid/model/realtime/Prediction;>;"
    :cond_0
    :try_start_1
    invoke-virtual {v5, v2}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v4

    .line 64
    .local v4, "predictionObject":Lorg/json/JSONObject;
    new-instance v3, Lcom/thetransitapp/droid/model/realtime/Prediction;

    invoke-direct {v3}, Lcom/thetransitapp/droid/model/realtime/Prediction;-><init>()V

    .line 65
    .local v3, "prediction":Lcom/thetransitapp/droid/model/realtime/Prediction;
    const-string v8, "time"

    invoke-virtual {v4, v8}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v8

    if-nez v8, :cond_4

    .line 66
    new-instance v8, Ljava/util/Date;

    const-string v9, "time"

    invoke-virtual {v4, v9}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v9

    const-wide/16 v11, 0x3e8

    mul-long/2addr v9, v11

    invoke-direct {v8, v9, v10}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v3, v8}, Lcom/thetransitapp/droid/model/realtime/Prediction;->setStopTime(Ljava/util/Date;)V

    .line 71
    :goto_2
    const-string v8, "trip_id"

    invoke-virtual {v4, v8}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v8

    if-nez v8, :cond_1

    .line 72
    const-string v8, "trip_id"

    invoke-virtual {v4, v8}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v3, v8}, Lcom/thetransitapp/droid/model/realtime/Prediction;->setTripID(Ljava/lang/String;)V

    .line 75
    :cond_1
    const-string v8, "headsign"

    invoke-virtual {v4, v8}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v8

    if-nez v8, :cond_2

    .line 76
    const-string v8, "headsign"

    invoke-virtual {v4, v8}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v3, v8}, Lcom/thetransitapp/droid/model/realtime/Prediction;->setTripHeadsign(Ljava/lang/String;)V

    .line 79
    :cond_2
    const-string v8, "cancelled"

    invoke-virtual {v4, v8}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v8

    if-nez v8, :cond_3

    .line 80
    const-string v8, "cancelled"

    invoke-virtual {v4, v8}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    move-result v8

    invoke-virtual {v3, v8}, Lcom/thetransitapp/droid/model/realtime/Prediction;->setCancelled(Z)V

    .line 83
    :cond_3
    invoke-virtual {v6, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 60
    .end local v3    # "prediction":Lcom/thetransitapp/droid/model/realtime/Prediction;
    .end local v4    # "predictionObject":Lorg/json/JSONObject;
    :goto_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 68
    .restart local v3    # "prediction":Lcom/thetransitapp/droid/model/realtime/Prediction;
    .restart local v4    # "predictionObject":Lorg/json/JSONObject;
    :cond_4
    const-string v8, "delay"

    invoke-virtual {v4, v8}, Lorg/json/JSONObject;->getDouble(Ljava/lang/String;)D

    move-result-wide v8

    invoke-virtual {v3, v8, v9}, Lcom/thetransitapp/droid/model/realtime/Prediction;->setDelay(D)V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_2

    .line 84
    .end local v3    # "prediction":Lcom/thetransitapp/droid/model/realtime/Prediction;
    .end local v4    # "predictionObject":Lorg/json/JSONObject;
    :catch_0
    move-exception v0

    .line 85
    .local v0, "e":Lorg/json/JSONException;
    :try_start_2
    invoke-static {v0}, Lcom/crashlytics/android/Crashlytics;->logException(Ljava/lang/Throwable;)V
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_3

    .line 91
    .end local v0    # "e":Lorg/json/JSONException;
    .end local v2    # "index":I
    .end local v5    # "predictionObjects":Lorg/json/JSONArray;
    .end local v6    # "predictions":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/thetransitapp/droid/model/realtime/Prediction;>;"
    :catch_1
    move-exception v1

    .line 92
    .local v1, "e1":Lorg/json/JSONException;
    invoke-static {v1}, Lcom/crashlytics/android/Crashlytics;->logException(Ljava/lang/Throwable;)V

    .line 95
    .end local v1    # "e1":Lorg/json/JSONException;
    :cond_5
    const/4 v6, 0x0

    goto :goto_1
.end method
