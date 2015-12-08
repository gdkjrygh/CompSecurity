.class public Lcom/thetransitapp/droid/model/realtime/MBTASRealTimeDataSource;
.super Lcom/thetransitapp/droid/model/realtime/JSONRealTimeDataSource;
.source "MBTASRealTimeDataSource.java"


# static fields
.field private static final serialVersionUID:J = 0x1L


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 16
    invoke-direct {p0}, Lcom/thetransitapp/droid/model/realtime/JSONRealTimeDataSource;-><init>()V

    return-void
.end method


# virtual methods
.method protected processScheduleResponse(Ljava/lang/Object;Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;)Ljava/util/List;
    .locals 19
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
    .line 21
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .local v8, "predictions":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/thetransitapp/droid/model/realtime/Prediction;>;"
    move-object/from16 v4, p1

    .line 22
    check-cast v4, Lorg/json/JSONObject;

    .line 25
    .local v4, "jsonObject":Lorg/json/JSONObject;
    :try_start_0
    const-string v14, "TripList"

    invoke-virtual {v4, v14}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v14

    const-string v15, "Trips"

    invoke-virtual {v14, v15}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v13

    .line 27
    .local v13, "trips":Lorg/json/JSONArray;
    const/4 v3, 0x0

    .local v3, "i":I
    :goto_0
    invoke-virtual {v13}, Lorg/json/JSONArray;->length()I

    move-result v14

    if-lt v3, v14, :cond_0

    .line 54
    .end local v3    # "i":I
    .end local v13    # "trips":Lorg/json/JSONArray;
    :goto_1
    return-object v8

    .line 28
    .restart local v3    # "i":I
    .restart local v13    # "trips":Lorg/json/JSONArray;
    :cond_0
    invoke-virtual {v13, v3}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v12

    .line 30
    .local v12, "trip":Lorg/json/JSONObject;
    const-string v14, "Predictions"

    invoke-virtual {v12, v14}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v14

    if-eqz v14, :cond_1

    .line 31
    const-string v14, "Predictions"

    invoke-virtual {v12, v14}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v9

    .line 33
    .local v9, "predictionsObjects":Lorg/json/JSONArray;
    const/4 v6, 0x0

    .local v6, "predictionIndex":I
    :goto_2
    invoke-virtual {v9}, Lorg/json/JSONArray;->length()I

    move-result v14

    if-lt v6, v14, :cond_2

    .line 27
    .end local v6    # "predictionIndex":I
    .end local v9    # "predictionsObjects":Lorg/json/JSONArray;
    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 34
    .restart local v6    # "predictionIndex":I
    .restart local v9    # "predictionsObjects":Lorg/json/JSONArray;
    :cond_2
    invoke-virtual {v9, v6}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v7

    .line 36
    .local v7, "predictionObject":Lorg/json/JSONObject;
    const-string v14, "StopID"

    move-object/from16 v0, p0

    invoke-virtual {v0, v7, v14}, Lcom/thetransitapp/droid/model/realtime/MBTASRealTimeDataSource;->jsonValueAtKeyPath(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v11

    .line 37
    .local v11, "stopIdValue":Ljava/lang/Object;
    invoke-virtual/range {p2 .. p2}, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->getRealTimeStopId()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v14, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_3

    .line 38
    const-string v14, "Seconds"

    invoke-virtual {v7, v14}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v10

    .line 40
    .local v10, "seconds":I
    new-instance v5, Lcom/thetransitapp/droid/model/realtime/Prediction;

    invoke-direct {v5}, Lcom/thetransitapp/droid/model/realtime/Prediction;-><init>()V

    .line 41
    .local v5, "prediction":Lcom/thetransitapp/droid/model/realtime/Prediction;
    const-string v14, "Destination"

    invoke-virtual {v12, v14}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v5, v14}, Lcom/thetransitapp/droid/model/realtime/Prediction;->setTripHeadsign(Ljava/lang/String;)V

    .line 42
    new-instance v14, Ljava/util/Date;

    new-instance v15, Ljava/util/Date;

    invoke-direct {v15}, Ljava/util/Date;-><init>()V

    invoke-virtual {v15}, Ljava/util/Date;->getTime()J

    move-result-wide v15

    mul-int/lit16 v0, v10, 0x3e8

    move/from16 v17, v0

    move/from16 v0, v17

    int-to-long v0, v0

    move-wide/from16 v17, v0

    add-long v15, v15, v17

    invoke-direct/range {v14 .. v16}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v5, v14}, Lcom/thetransitapp/droid/model/realtime/Prediction;->setStopTime(Ljava/util/Date;)V

    .line 44
    invoke-virtual {v8, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 33
    .end local v5    # "prediction":Lcom/thetransitapp/droid/model/realtime/Prediction;
    .end local v10    # "seconds":I
    :cond_3
    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    .line 49
    .end local v3    # "i":I
    .end local v6    # "predictionIndex":I
    .end local v7    # "predictionObject":Lorg/json/JSONObject;
    .end local v9    # "predictionsObjects":Lorg/json/JSONArray;
    .end local v11    # "stopIdValue":Ljava/lang/Object;
    .end local v12    # "trip":Lorg/json/JSONObject;
    .end local v13    # "trips":Lorg/json/JSONArray;
    :catch_0
    move-exception v2

    .line 50
    .local v2, "e":Lorg/json/JSONException;
    const-class v14, Lcom/thetransitapp/droid/model/realtime/MBTASRealTimeDataSource;

    invoke-virtual {v14}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v2}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v15

    invoke-static {v14, v15, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 51
    invoke-static {v2}, Lcom/crashlytics/android/Crashlytics;->logException(Ljava/lang/Throwable;)V

    goto :goto_1
.end method
