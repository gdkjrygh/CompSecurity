.class public Lcom/thetransitapp/droid/model/realtime/JSONRealTimeDataSource;
.super Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;
.source "JSONRealTimeDataSource.java"


# static fields
.field private static final serialVersionUID:J = 0x1L


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 18
    invoke-direct {p0}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;-><init>()V

    return-void
.end method

.method private dateStringInPredictionObject(Lorg/json/JSONObject;)Ljava/lang/String;
    .locals 3
    .param p1, "predictionObject"    # Lorg/json/JSONObject;

    .prologue
    .line 98
    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/realtime/JSONRealTimeDataSource;->getTimestampKeyPath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, p1, v1}, Lcom/thetransitapp/droid/model/realtime/JSONRealTimeDataSource;->jsonValueAtKeyPath(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    .line 99
    .local v0, "date":Ljava/lang/Object;
    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/realtime/JSONRealTimeDataSource;->getDateKeyPath()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 100
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/realtime/JSONRealTimeDataSource;->getDateKeyPath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, p1, v2}, Lcom/thetransitapp/droid/model/realtime/JSONRealTimeDataSource;->jsonValueAtKeyPath(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 102
    .end local v0    # "date":Ljava/lang/Object;
    :cond_0
    instance-of v1, v0, Ljava/lang/Integer;

    if-eqz v1, :cond_1

    .line 103
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    .local v0, "date":Ljava/lang/String;
    move-object v1, v0

    .line 105
    .end local v0    # "date":Ljava/lang/String;
    :goto_0
    check-cast v1, Ljava/lang/String;

    return-object v1

    :cond_1
    move-object v1, v0

    goto :goto_0
.end method

.method private predictionFromObjectAndRealStopTime(Lorg/json/JSONObject;Ljava/util/Date;)Lcom/thetransitapp/droid/model/realtime/Prediction;
    .locals 3
    .param p1, "predictionObject"    # Lorg/json/JSONObject;
    .param p2, "realStopTime"    # Ljava/util/Date;

    .prologue
    .line 109
    new-instance v0, Lcom/thetransitapp/droid/model/realtime/Prediction;

    invoke-direct {v0}, Lcom/thetransitapp/droid/model/realtime/Prediction;-><init>()V

    .line 110
    .local v0, "prediction":Lcom/thetransitapp/droid/model/realtime/Prediction;
    invoke-virtual {v0, p2}, Lcom/thetransitapp/droid/model/realtime/Prediction;->setStopTime(Ljava/util/Date;)V

    .line 112
    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/realtime/JSONRealTimeDataSource;->getScheduleBasedKeyPath()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 113
    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/realtime/JSONRealTimeDataSource;->getScheduleBasedKeyPath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, p1, v2}, Lcom/thetransitapp/droid/model/realtime/JSONRealTimeDataSource;->jsonValueAtKeyPath(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    .line 114
    .local v1, "value":Ljava/lang/Object;
    invoke-virtual {p0, v1}, Lcom/thetransitapp/droid/model/realtime/JSONRealTimeDataSource;->valueMatchScheduleBased(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v0, v2}, Lcom/thetransitapp/droid/model/realtime/Prediction;->setScheduleBased(Z)V

    .line 117
    .end local v1    # "value":Ljava/lang/Object;
    :cond_0
    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/realtime/JSONRealTimeDataSource;->getCancelledKeyPath()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 118
    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/realtime/JSONRealTimeDataSource;->getCancelledKeyPath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, p1, v2}, Lcom/thetransitapp/droid/model/realtime/JSONRealTimeDataSource;->jsonValueAtKeyPath(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    .line 119
    .restart local v1    # "value":Ljava/lang/Object;
    invoke-virtual {p0, v1}, Lcom/thetransitapp/droid/model/realtime/JSONRealTimeDataSource;->valueMatchCancelled(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v0, v2}, Lcom/thetransitapp/droid/model/realtime/Prediction;->setCancelled(Z)V

    .line 122
    .end local v1    # "value":Ljava/lang/Object;
    :cond_1
    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/realtime/JSONRealTimeDataSource;->getDestinationFilteringKeyPath()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_2

    .line 124
    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/realtime/JSONRealTimeDataSource;->getDestinationFilteringKeyPath()Ljava/lang/String;

    move-result-object v2

    .line 123
    invoke-virtual {p0, p1, v2}, Lcom/thetransitapp/droid/model/realtime/JSONRealTimeDataSource;->jsonValueAtKeyPath(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v0, v2}, Lcom/thetransitapp/droid/model/realtime/Prediction;->setTripHeadsign(Ljava/lang/String;)V

    .line 125
    :cond_2
    return-object v0
.end method

.method private stringValueAtKeyPath(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Object;
    .locals 2
    .param p1, "predictionObject"    # Lorg/json/JSONObject;
    .param p2, "keyPath"    # Ljava/lang/String;

    .prologue
    .line 88
    if-nez p2, :cond_1

    .line 89
    const/4 v0, 0x0

    .line 94
    :cond_0
    :goto_0
    return-object v0

    .line 91
    :cond_1
    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/realtime/JSONRealTimeDataSource;->getRouteFilteringKeyPath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, p1, v1}, Lcom/thetransitapp/droid/model/realtime/JSONRealTimeDataSource;->jsonValueAtKeyPath(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    .line 92
    .local v0, "routeValue":Ljava/lang/Object;
    instance-of v1, v0, Ljava/lang/Integer;

    if-eqz v1, :cond_0

    .line 93
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    .local v0, "routeValue":Ljava/lang/String;
    goto :goto_0
.end method


# virtual methods
.method jsonValueAtKeyPath(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Object;
    .locals 11
    .param p1, "object"    # Lorg/json/JSONObject;
    .param p2, "keyPath"    # Ljava/lang/String;

    .prologue
    const/4 v8, 0x0

    .line 129
    const-string v9, "\\."

    invoke-virtual {p2, v9}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    .line 131
    .local v2, "components":[Ljava/lang/String;
    array-length v9, v2

    if-nez v9, :cond_0

    .line 132
    const/4 v9, 0x1

    new-array v2, v9, [Ljava/lang/String;

    .line 133
    aput-object p2, v2, v8

    .line 136
    :cond_0
    move-object v7, p1

    .line 137
    .local v7, "result":Lorg/json/JSONObject;
    array-length v9, v2

    :goto_0
    if-lt v8, v9, :cond_2

    move-object v6, v7

    .line 164
    :cond_1
    :goto_1
    return-object v6

    .line 137
    :cond_2
    aget-object v1, v2, v8

    .line 138
    .local v1, "component":Ljava/lang/String;
    const/4 v5, 0x0

    .line 140
    .local v5, "newResult":Lorg/json/JSONObject;
    :try_start_0
    move-object v0, v7

    check-cast v0, Lorg/json/JSONObject;

    move-object v4, v0

    .line 142
    .local v4, "jsonObject":Lorg/json/JSONObject;
    invoke-virtual {v4, v1}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v10

    if-nez v10, :cond_3

    invoke-virtual {v4, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v10

    if-nez v10, :cond_4

    .line 143
    :cond_3
    const/4 v6, 0x0

    goto :goto_1

    .line 146
    :cond_4
    invoke-virtual {v4, v1}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v6

    .line 148
    .local v6, "newValue":Ljava/lang/Object;
    instance-of v10, v6, Lorg/json/JSONArray;

    if-nez v10, :cond_1

    .line 150
    instance-of v10, v6, Ljava/lang/Integer;

    if-nez v10, :cond_1

    .line 152
    instance-of v10, v6, Ljava/lang/String;

    if-nez v10, :cond_1

    .line 156
    move-object v0, v6

    check-cast v0, Lorg/json/JSONObject;

    move-object v5, v0
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 161
    .end local v4    # "jsonObject":Lorg/json/JSONObject;
    .end local v6    # "newValue":Ljava/lang/Object;
    :goto_2
    move-object v7, v5

    .line 137
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 157
    :catch_0
    move-exception v3

    .line 158
    .local v3, "e":Lorg/json/JSONException;
    const/4 v5, 0x0

    goto :goto_2
.end method

.method public parseStream(Ljava/io/InputStream;)Ljava/lang/Object;
    .locals 4
    .param p1, "inputStream"    # Ljava/io/InputStream;

    .prologue
    .line 23
    invoke-static {p1}, Lcom/thetransitapp/droid/util/ServiceUtility;->convertStreamToString(Ljava/io/InputStream;)Ljava/lang/String;

    move-result-object v1

    .line 26
    .local v1, "result":Ljava/lang/String;
    :try_start_0
    const-string v2, "["

    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 27
    new-instance v2, Lorg/json/JSONArray;

    invoke-direct {v2, v1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 34
    :goto_0
    return-object v2

    .line 29
    :cond_0
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 30
    :catch_0
    move-exception v0

    .line 31
    .local v0, "e":Lorg/json/JSONException;
    const-string v2, "Invalid JSON"

    invoke-virtual {v0}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 34
    const/4 v2, 0x0

    goto :goto_0
.end method

.method protected processScheduleResponse(Ljava/lang/Object;Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;)Ljava/util/List;
    .locals 14
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
    .line 38
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 41
    .local v7, "predictionsArray":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/thetransitapp/droid/model/realtime/Prediction;>;"
    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/realtime/JSONRealTimeDataSource;->getPredictionsKeyPath()Ljava/lang/String;

    move-result-object v12

    if-eqz v12, :cond_1

    .line 42
    check-cast p1, Lorg/json/JSONObject;

    .end local p1    # "object":Ljava/lang/Object;
    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/realtime/JSONRealTimeDataSource;->getPredictionsKeyPath()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {p0, p1, v12}, Lcom/thetransitapp/droid/model/realtime/JSONRealTimeDataSource;->jsonValueAtKeyPath(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v6

    .line 47
    :goto_0
    if-eqz v6, :cond_0

    .line 48
    instance-of v12, v6, Lorg/json/JSONObject;

    if-eqz v12, :cond_6

    .line 49
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 50
    .local v0, "array":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/Object;>;"
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 51
    new-instance v6, Lorg/json/JSONArray;

    invoke-direct {v6, v0}, Lorg/json/JSONArray;-><init>(Ljava/util/Collection;)V

    .local v6, "predictions":Lorg/json/JSONArray;
    move-object v8, v6

    .line 54
    .end local v0    # "array":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/Object;>;"
    .end local v6    # "predictions":Lorg/json/JSONArray;
    :goto_1
    check-cast v8, Lorg/json/JSONArray;

    .line 56
    .local v8, "predictionsObjects":Lorg/json/JSONArray;
    const/4 v3, 0x0

    .local v3, "index":I
    :goto_2
    invoke-virtual {v8}, Lorg/json/JSONArray;->length()I

    move-result v12

    if-lt v3, v12, :cond_2

    .line 84
    .end local v3    # "index":I
    .end local v8    # "predictionsObjects":Lorg/json/JSONArray;
    :cond_0
    return-object v7

    .restart local p1    # "object":Ljava/lang/Object;
    :cond_1
    move-object v6, p1

    .line 44
    check-cast v6, Lorg/json/JSONArray;

    .restart local v6    # "predictions":Lorg/json/JSONArray;
    goto :goto_0

    .line 58
    .end local v6    # "predictions":Lorg/json/JSONArray;
    .end local p1    # "object":Ljava/lang/Object;
    .restart local v3    # "index":I
    .restart local v8    # "predictionsObjects":Lorg/json/JSONArray;
    :cond_2
    :try_start_0
    invoke-virtual {v8, v3}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v5

    .line 59
    .local v5, "predictionObject":Lorg/json/JSONObject;
    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/realtime/JSONRealTimeDataSource;->getRouteFilteringKeyPath()Ljava/lang/String;

    move-result-object v12

    invoke-direct {p0, v5, v12}, Lcom/thetransitapp/droid/model/realtime/JSONRealTimeDataSource;->stringValueAtKeyPath(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v10

    .line 60
    .local v10, "routeValue":Ljava/lang/Object;
    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/realtime/JSONRealTimeDataSource;->getStopFilteringKeyPath()Ljava/lang/String;

    move-result-object v12

    invoke-direct {p0, v5, v12}, Lcom/thetransitapp/droid/model/realtime/JSONRealTimeDataSource;->stringValueAtKeyPath(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v11

    .line 62
    .local v11, "stopValue":Ljava/lang/Object;
    if-eqz v10, :cond_3

    invoke-virtual/range {p2 .. p2}, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->getRealTimeRouteId()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v10, v12}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_5

    .line 63
    :cond_3
    if-eqz v11, :cond_4

    invoke-virtual/range {p2 .. p2}, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->getRealTimeStopId()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v11, v12}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_5

    .line 64
    :cond_4
    invoke-direct {p0, v5}, Lcom/thetransitapp/droid/model/realtime/JSONRealTimeDataSource;->dateStringInPredictionObject(Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v1

    .line 66
    .local v1, "dateString":Ljava/lang/String;
    if-eqz v1, :cond_5

    .line 67
    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/realtime/JSONRealTimeDataSource;->getTimestampFormat()Lcom/thetransitapp/droid/util/DateFormatter;

    move-result-object v12

    invoke-virtual {v12, v1}, Lcom/thetransitapp/droid/util/DateFormatter;->format(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v9

    .line 69
    .local v9, "realStopTime":Ljava/util/Date;
    if-eqz v9, :cond_5

    .line 70
    invoke-direct {p0, v5, v9}, Lcom/thetransitapp/droid/model/realtime/JSONRealTimeDataSource;->predictionFromObjectAndRealStopTime(Lorg/json/JSONObject;Ljava/util/Date;)Lcom/thetransitapp/droid/model/realtime/Prediction;

    move-result-object v4

    .line 72
    .local v4, "prediction":Lcom/thetransitapp/droid/model/realtime/Prediction;
    invoke-virtual {v7, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 56
    .end local v1    # "dateString":Ljava/lang/String;
    .end local v4    # "prediction":Lcom/thetransitapp/droid/model/realtime/Prediction;
    .end local v5    # "predictionObject":Lorg/json/JSONObject;
    .end local v9    # "realStopTime":Ljava/util/Date;
    .end local v10    # "routeValue":Ljava/lang/Object;
    .end local v11    # "stopValue":Ljava/lang/Object;
    :cond_5
    :goto_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    .line 77
    :catch_0
    move-exception v2

    .line 78
    .local v2, "e":Lorg/json/JSONException;
    const-class v12, Lcom/thetransitapp/droid/model/realtime/JSONRealTimeDataSource;

    invoke-virtual {v12}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v2}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v13

    invoke-static {v12, v13, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 79
    invoke-static {v2}, Lcom/crashlytics/android/Crashlytics;->logException(Ljava/lang/Throwable;)V

    goto :goto_3

    .end local v2    # "e":Lorg/json/JSONException;
    .end local v3    # "index":I
    .end local v8    # "predictionsObjects":Lorg/json/JSONArray;
    :cond_6
    move-object v8, v6

    goto :goto_1
.end method
