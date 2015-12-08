.class public Lcom/thetransitapp/droid/model/stats/Session;
.super Ljava/lang/Object;
.source "Session.java"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field private static final serialVersionUID:J = 0x1L


# instance fields
.field private endDate:Ljava/util/Date;

.field private locations:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Landroid/location/Location;",
            ">;"
        }
    .end annotation
.end field

.field private planRequests:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lorg/json/JSONObject;",
            ">;"
        }
    .end annotation
.end field

.field private routeHits:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lorg/json/JSONObject;",
            ">;"
        }
    .end annotation
.end field

.field private simulatedLocation:Landroid/location/Location;

.field private startDate:Ljava/util/Date;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/thetransitapp/droid/model/stats/Session;->locations:Ljava/util/ArrayList;

    .line 35
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/thetransitapp/droid/model/stats/Session;->planRequests:Ljava/util/ArrayList;

    .line 36
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/thetransitapp/droid/model/stats/Session;->routeHits:Ljava/util/ArrayList;

    .line 37
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    iput-object v0, p0, Lcom/thetransitapp/droid/model/stats/Session;->startDate:Ljava/util/Date;

    .line 38
    return-void
.end method


# virtual methods
.method public addLocation(Landroid/location/Location;Z)V
    .locals 1
    .param p1, "location"    # Landroid/location/Location;
    .param p2, "simulated"    # Z

    .prologue
    .line 41
    if-eqz p2, :cond_0

    .line 42
    iput-object p1, p0, Lcom/thetransitapp/droid/model/stats/Session;->simulatedLocation:Landroid/location/Location;

    .line 46
    :goto_0
    return-void

    .line 44
    :cond_0
    iget-object v0, p0, Lcom/thetransitapp/droid/model/stats/Session;->locations:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0
.end method

.method public addPlanRequest(Lcom/google/android/gms/maps/model/LatLng;Lcom/google/android/gms/maps/model/LatLng;Ljava/util/Date;Ljava/util/Date;)V
    .locals 6
    .param p1, "start"    # Lcom/google/android/gms/maps/model/LatLng;
    .param p2, "end"    # Lcom/google/android/gms/maps/model/LatLng;
    .param p3, "startTime"    # Ljava/util/Date;
    .param p4, "endTime"    # Ljava/util/Date;

    .prologue
    .line 49
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 51
    .local v2, "map":Lorg/json/JSONObject;
    new-instance v0, Ljava/text/SimpleDateFormat;

    const-string v3, "yyyy-MM-dd HH:mm:ss Z"

    sget-object v4, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-direct {v0, v3, v4}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 54
    .local v0, "dateFormat":Ljava/text/SimpleDateFormat;
    if-eqz p3, :cond_0

    .line 55
    :try_start_0
    const-string v3, "leave_at"

    invoke-virtual {v0, p3}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 58
    :cond_0
    if-eqz p4, :cond_1

    .line 59
    const-string v3, "arrive_by"

    invoke-virtual {v0, p4}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 62
    :cond_1
    const-string v3, "start_lat"

    iget-wide v4, p1, Lcom/google/android/gms/maps/model/LatLng;->latitude:D

    invoke-static {v4, v5}, Ljava/lang/Double;->toString(D)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 63
    const-string v3, "start_lon"

    iget-wide v4, p1, Lcom/google/android/gms/maps/model/LatLng;->longitude:D

    invoke-static {v4, v5}, Ljava/lang/Double;->toString(D)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 64
    const-string v3, "end_lat"

    iget-wide v4, p2, Lcom/google/android/gms/maps/model/LatLng;->latitude:D

    invoke-static {v4, v5}, Ljava/lang/Double;->toString(D)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 65
    const-string v3, "end_lon"

    iget-wide v4, p2, Lcom/google/android/gms/maps/model/LatLng;->longitude:D

    invoke-static {v4, v5}, Ljava/lang/Double;->toString(D)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 66
    const-string v3, "timestamp"

    new-instance v4, Ljava/util/Date;

    invoke-direct {v4}, Ljava/util/Date;-><init>()V

    invoke-virtual {v0, v4}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 72
    :goto_0
    iget-object v3, p0, Lcom/thetransitapp/droid/model/stats/Session;->planRequests:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 73
    return-void

    .line 67
    :catch_0
    move-exception v1

    .line 68
    .local v1, "e":Lorg/json/JSONException;
    const-class v3, Lcom/thetransitapp/droid/model/stats/Session;

    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 69
    invoke-static {v1}, Lcom/crashlytics/android/Crashlytics;->logException(Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method public canEqual(Ljava/lang/Object;)Z
    .locals 1
    .param p1, "other"    # Ljava/lang/Object;

    .prologue
    .line 22
    instance-of v0, p1, Lcom/thetransitapp/droid/model/stats/Session;

    return v0
.end method

.method public endSession()V
    .locals 1

    .prologue
    .line 110
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    iput-object v0, p0, Lcom/thetransitapp/droid/model/stats/Session;->endDate:Ljava/util/Date;

    .line 111
    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 14
    .param p1, "o"    # Ljava/lang/Object;

    .prologue
    .line 22
    if-ne p1, p0, :cond_0

    const/4 v13, 0x1

    :goto_0
    return v13

    :cond_0
    instance-of v13, p1, Lcom/thetransitapp/droid/model/stats/Session;

    if-nez v13, :cond_1

    const/4 v13, 0x0

    goto :goto_0

    :cond_1
    move-object v0, p1

    check-cast v0, Lcom/thetransitapp/droid/model/stats/Session;

    .local v0, "other":Lcom/thetransitapp/droid/model/stats/Session;
    invoke-virtual {v0, p0}, Lcom/thetransitapp/droid/model/stats/Session;->canEqual(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_2

    const/4 v13, 0x0

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/stats/Session;->getLocations()Ljava/util/ArrayList;

    move-result-object v8

    .local v8, "this$locations":Ljava/util/ArrayList;
    invoke-virtual {v0}, Lcom/thetransitapp/droid/model/stats/Session;->getLocations()Ljava/util/ArrayList;

    move-result-object v2

    .local v2, "other$locations":Ljava/util/ArrayList;
    if-nez v8, :cond_4

    if-eqz v2, :cond_5

    :cond_3
    const/4 v13, 0x0

    goto :goto_0

    :cond_4
    invoke-virtual {v8, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_3

    :cond_5
    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/stats/Session;->getPlanRequests()Ljava/util/ArrayList;

    move-result-object v9

    .local v9, "this$planRequests":Ljava/util/ArrayList;
    invoke-virtual {v0}, Lcom/thetransitapp/droid/model/stats/Session;->getPlanRequests()Ljava/util/ArrayList;

    move-result-object v3

    .local v3, "other$planRequests":Ljava/util/ArrayList;
    if-nez v9, :cond_7

    if-eqz v3, :cond_8

    :cond_6
    const/4 v13, 0x0

    goto :goto_0

    :cond_7
    invoke-virtual {v9, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_6

    :cond_8
    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/stats/Session;->getRouteHits()Ljava/util/ArrayList;

    move-result-object v10

    .local v10, "this$routeHits":Ljava/util/ArrayList;
    invoke-virtual {v0}, Lcom/thetransitapp/droid/model/stats/Session;->getRouteHits()Ljava/util/ArrayList;

    move-result-object v4

    .local v4, "other$routeHits":Ljava/util/ArrayList;
    if-nez v10, :cond_a

    if-eqz v4, :cond_b

    :cond_9
    const/4 v13, 0x0

    goto :goto_0

    :cond_a
    invoke-virtual {v10, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_9

    :cond_b
    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/stats/Session;->getSimulatedLocation()Landroid/location/Location;

    move-result-object v11

    .local v11, "this$simulatedLocation":Landroid/location/Location;
    invoke-virtual {v0}, Lcom/thetransitapp/droid/model/stats/Session;->getSimulatedLocation()Landroid/location/Location;

    move-result-object v5

    .local v5, "other$simulatedLocation":Landroid/location/Location;
    if-nez v11, :cond_d

    if-eqz v5, :cond_e

    :cond_c
    const/4 v13, 0x0

    goto :goto_0

    :cond_d
    invoke-virtual {v11, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_c

    :cond_e
    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/stats/Session;->getStartDate()Ljava/util/Date;

    move-result-object v12

    .local v12, "this$startDate":Ljava/util/Date;
    invoke-virtual {v0}, Lcom/thetransitapp/droid/model/stats/Session;->getStartDate()Ljava/util/Date;

    move-result-object v6

    .local v6, "other$startDate":Ljava/util/Date;
    if-nez v12, :cond_10

    if-eqz v6, :cond_11

    :cond_f
    const/4 v13, 0x0

    goto :goto_0

    :cond_10
    invoke-virtual {v12, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_f

    :cond_11
    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/stats/Session;->getEndDate()Ljava/util/Date;

    move-result-object v7

    .local v7, "this$endDate":Ljava/util/Date;
    invoke-virtual {v0}, Lcom/thetransitapp/droid/model/stats/Session;->getEndDate()Ljava/util/Date;

    move-result-object v1

    .local v1, "other$endDate":Ljava/util/Date;
    if-nez v7, :cond_13

    if-eqz v1, :cond_14

    :cond_12
    const/4 v13, 0x0

    goto/16 :goto_0

    :cond_13
    invoke-virtual {v7, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_12

    :cond_14
    const/4 v13, 0x1

    goto/16 :goto_0
.end method

.method public getEndDate()Ljava/util/Date;
    .locals 1

    .prologue
    .line 22
    iget-object v0, p0, Lcom/thetransitapp/droid/model/stats/Session;->endDate:Ljava/util/Date;

    return-object v0
.end method

.method public getJSONRepresentation()Lorg/json/JSONObject;
    .locals 13

    .prologue
    .line 114
    new-instance v7, Lorg/json/JSONObject;

    invoke-direct {v7}, Lorg/json/JSONObject;-><init>()V

    .line 117
    .local v7, "representation":Lorg/json/JSONObject;
    :try_start_0
    new-instance v0, Ljava/text/SimpleDateFormat;

    const-string v8, "yyyy-MM-dd HH:mm:ss Z"

    sget-object v9, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-direct {v0, v8, v9}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 119
    .local v0, "dateFormat":Ljava/text/SimpleDateFormat;
    new-instance v5, Lorg/json/JSONArray;

    invoke-direct {v5}, Lorg/json/JSONArray;-><init>()V

    .line 120
    .local v5, "locationsArray":Lorg/json/JSONArray;
    iget-object v8, p0, Lcom/thetransitapp/droid/model/stats/Session;->locations:Ljava/util/ArrayList;

    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-nez v9, :cond_0

    .line 130
    const-string v8, "locations"

    invoke-virtual {v7, v8, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 132
    new-instance v2, Lorg/json/JSONArray;

    iget-object v8, p0, Lcom/thetransitapp/droid/model/stats/Session;->routeHits:Ljava/util/ArrayList;

    invoke-direct {v2, v8}, Lorg/json/JSONArray;-><init>(Ljava/util/Collection;)V

    .line 133
    .local v2, "hitsArray":Lorg/json/JSONArray;
    const-string v8, "route_hits"

    invoke-virtual {v7, v8, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 135
    new-instance v6, Lorg/json/JSONArray;

    iget-object v8, p0, Lcom/thetransitapp/droid/model/stats/Session;->planRequests:Ljava/util/ArrayList;

    invoke-direct {v6, v8}, Lorg/json/JSONArray;-><init>(Ljava/util/Collection;)V

    .line 136
    .local v6, "planArray":Lorg/json/JSONArray;
    const-string v8, "plan_requests"

    invoke-virtual {v7, v8, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 138
    iget-object v8, p0, Lcom/thetransitapp/droid/model/stats/Session;->simulatedLocation:Landroid/location/Location;

    if-eqz v8, :cond_1

    .line 139
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 140
    .local v4, "locationRepresentation":Lorg/json/JSONObject;
    const-string v8, "latitude"

    iget-object v9, p0, Lcom/thetransitapp/droid/model/stats/Session;->simulatedLocation:Landroid/location/Location;

    invoke-virtual {v9}, Landroid/location/Location;->getLatitude()D

    move-result-wide v9

    invoke-virtual {v4, v8, v9, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 141
    const-string v8, "longitude"

    iget-object v9, p0, Lcom/thetransitapp/droid/model/stats/Session;->simulatedLocation:Landroid/location/Location;

    invoke-virtual {v9}, Landroid/location/Location;->getLongitude()D

    move-result-wide v9

    invoke-virtual {v4, v8, v9, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 142
    const-string v8, "horizontal_accuracy"

    iget-object v9, p0, Lcom/thetransitapp/droid/model/stats/Session;->simulatedLocation:Landroid/location/Location;

    invoke-virtual {v9}, Landroid/location/Location;->getAccuracy()F

    move-result v9

    float-to-double v9, v9

    invoke-virtual {v4, v8, v9, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 143
    const-string v8, "vertical_accuracy"

    iget-object v9, p0, Lcom/thetransitapp/droid/model/stats/Session;->simulatedLocation:Landroid/location/Location;

    invoke-virtual {v9}, Landroid/location/Location;->getAccuracy()F

    move-result v9

    float-to-double v9, v9

    invoke-virtual {v4, v8, v9, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 144
    const-string v8, "timestamp"

    new-instance v9, Ljava/util/Date;

    iget-object v10, p0, Lcom/thetransitapp/droid/model/stats/Session;->simulatedLocation:Landroid/location/Location;

    invoke-virtual {v10}, Landroid/location/Location;->getTime()J

    move-result-wide v10

    invoke-direct {v9, v10, v11}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v0, v9}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v4, v8, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 145
    const-string v8, "speed"

    iget-object v9, p0, Lcom/thetransitapp/droid/model/stats/Session;->simulatedLocation:Landroid/location/Location;

    invoke-virtual {v9}, Landroid/location/Location;->getSpeed()F

    move-result v9

    float-to-double v9, v9

    invoke-virtual {v4, v8, v9, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 146
    invoke-virtual {v5, v4}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 147
    const-string v8, "simulated_location"

    invoke-virtual {v7, v8, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 152
    .end local v4    # "locationRepresentation":Lorg/json/JSONObject;
    :goto_1
    const-string v8, "start_date"

    iget-object v9, p0, Lcom/thetransitapp/droid/model/stats/Session;->startDate:Ljava/util/Date;

    invoke-virtual {v0, v9}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v7, v8, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 153
    const-string v8, "end_date"

    iget-object v9, p0, Lcom/thetransitapp/droid/model/stats/Session;->endDate:Ljava/util/Date;

    invoke-virtual {v0, v9}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v7, v8, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 159
    .end local v0    # "dateFormat":Ljava/text/SimpleDateFormat;
    .end local v2    # "hitsArray":Lorg/json/JSONArray;
    .end local v5    # "locationsArray":Lorg/json/JSONArray;
    .end local v6    # "planArray":Lorg/json/JSONArray;
    :goto_2
    return-object v7

    .line 120
    .restart local v0    # "dateFormat":Ljava/text/SimpleDateFormat;
    .restart local v5    # "locationsArray":Lorg/json/JSONArray;
    :cond_0
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/location/Location;

    .line 121
    .local v3, "location":Landroid/location/Location;
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 122
    .restart local v4    # "locationRepresentation":Lorg/json/JSONObject;
    const-string v9, "latitude"

    invoke-virtual {v3}, Landroid/location/Location;->getLatitude()D

    move-result-wide v10

    invoke-virtual {v4, v9, v10, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 123
    const-string v9, "longitude"

    invoke-virtual {v3}, Landroid/location/Location;->getLongitude()D

    move-result-wide v10

    invoke-virtual {v4, v9, v10, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 124
    const-string v9, "horizontal_accuracy"

    invoke-virtual {v3}, Landroid/location/Location;->getAccuracy()F

    move-result v10

    float-to-double v10, v10

    invoke-virtual {v4, v9, v10, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 125
    const-string v9, "vertical_accuracy"

    invoke-virtual {v3}, Landroid/location/Location;->getAccuracy()F

    move-result v10

    float-to-double v10, v10

    invoke-virtual {v4, v9, v10, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 126
    const-string v9, "timestamp"

    new-instance v10, Ljava/util/Date;

    invoke-virtual {v3}, Landroid/location/Location;->getTime()J

    move-result-wide v11

    invoke-direct {v10, v11, v12}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v0, v10}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v4, v9, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 127
    const-string v9, "speed"

    invoke-virtual {v3}, Landroid/location/Location;->getSpeed()F

    move-result v10

    float-to-double v10, v10

    invoke-virtual {v4, v9, v10, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 128
    invoke-virtual {v5, v4}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_0

    .line 154
    .end local v0    # "dateFormat":Ljava/text/SimpleDateFormat;
    .end local v3    # "location":Landroid/location/Location;
    .end local v4    # "locationRepresentation":Lorg/json/JSONObject;
    .end local v5    # "locationsArray":Lorg/json/JSONArray;
    :catch_0
    move-exception v1

    .line 155
    .local v1, "e":Lorg/json/JSONException;
    const-class v8, Lcom/thetransitapp/droid/model/stats/Session;

    invoke-virtual {v8}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v1}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v9

    invoke-static {v8, v9, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 156
    invoke-static {v1}, Lcom/crashlytics/android/Crashlytics;->logException(Ljava/lang/Throwable;)V

    goto :goto_2

    .line 149
    .end local v1    # "e":Lorg/json/JSONException;
    .restart local v0    # "dateFormat":Ljava/text/SimpleDateFormat;
    .restart local v2    # "hitsArray":Lorg/json/JSONArray;
    .restart local v5    # "locationsArray":Lorg/json/JSONArray;
    .restart local v6    # "planArray":Lorg/json/JSONArray;
    :cond_1
    :try_start_1
    const-string v8, "simulated_location"

    sget-object v9, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    invoke-virtual {v7, v8, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    goto/16 :goto_1
.end method

.method public getLocations()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList",
            "<",
            "Landroid/location/Location;",
            ">;"
        }
    .end annotation

    .prologue
    .line 22
    iget-object v0, p0, Lcom/thetransitapp/droid/model/stats/Session;->locations:Ljava/util/ArrayList;

    return-object v0
.end method

.method public getPlanRequests()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList",
            "<",
            "Lorg/json/JSONObject;",
            ">;"
        }
    .end annotation

    .prologue
    .line 22
    iget-object v0, p0, Lcom/thetransitapp/droid/model/stats/Session;->planRequests:Ljava/util/ArrayList;

    return-object v0
.end method

.method public getRouteHits()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList",
            "<",
            "Lorg/json/JSONObject;",
            ">;"
        }
    .end annotation

    .prologue
    .line 22
    iget-object v0, p0, Lcom/thetransitapp/droid/model/stats/Session;->routeHits:Ljava/util/ArrayList;

    return-object v0
.end method

.method public getSimulatedLocation()Landroid/location/Location;
    .locals 1

    .prologue
    .line 22
    iget-object v0, p0, Lcom/thetransitapp/droid/model/stats/Session;->simulatedLocation:Landroid/location/Location;

    return-object v0
.end method

.method public getStartDate()Ljava/util/Date;
    .locals 1

    .prologue
    .line 22
    iget-object v0, p0, Lcom/thetransitapp/droid/model/stats/Session;->startDate:Ljava/util/Date;

    return-object v0
.end method

.method public hashCode()I
    .locals 11

    .prologue
    const/4 v9, 0x0

    .line 22
    const/16 v6, 0x1f

    .local v6, "PRIME":I
    const/4 v7, 0x1

    .local v7, "result":I
    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/stats/Session;->getLocations()Ljava/util/ArrayList;

    move-result-object v1

    .local v1, "$locations":Ljava/util/ArrayList;
    if-nez v1, :cond_0

    move v8, v9

    :goto_0
    add-int/lit8 v7, v8, 0x1f

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/stats/Session;->getPlanRequests()Ljava/util/ArrayList;

    move-result-object v2

    .local v2, "$planRequests":Ljava/util/ArrayList;
    mul-int/lit8 v10, v7, 0x1f

    if-nez v2, :cond_1

    move v8, v9

    :goto_1
    add-int v7, v10, v8

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/stats/Session;->getRouteHits()Ljava/util/ArrayList;

    move-result-object v3

    .local v3, "$routeHits":Ljava/util/ArrayList;
    mul-int/lit8 v10, v7, 0x1f

    if-nez v3, :cond_2

    move v8, v9

    :goto_2
    add-int v7, v10, v8

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/stats/Session;->getSimulatedLocation()Landroid/location/Location;

    move-result-object v4

    .local v4, "$simulatedLocation":Landroid/location/Location;
    mul-int/lit8 v10, v7, 0x1f

    if-nez v4, :cond_3

    move v8, v9

    :goto_3
    add-int v7, v10, v8

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/stats/Session;->getStartDate()Ljava/util/Date;

    move-result-object v5

    .local v5, "$startDate":Ljava/util/Date;
    mul-int/lit8 v10, v7, 0x1f

    if-nez v5, :cond_4

    move v8, v9

    :goto_4
    add-int v7, v10, v8

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/stats/Session;->getEndDate()Ljava/util/Date;

    move-result-object v0

    .local v0, "$endDate":Ljava/util/Date;
    mul-int/lit8 v8, v7, 0x1f

    if-nez v0, :cond_5

    :goto_5
    add-int v7, v8, v9

    return v7

    .end local v0    # "$endDate":Ljava/util/Date;
    .end local v2    # "$planRequests":Ljava/util/ArrayList;
    .end local v3    # "$routeHits":Ljava/util/ArrayList;
    .end local v4    # "$simulatedLocation":Landroid/location/Location;
    .end local v5    # "$startDate":Ljava/util/Date;
    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v8

    goto :goto_0

    .restart local v2    # "$planRequests":Ljava/util/ArrayList;
    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v8

    goto :goto_1

    .restart local v3    # "$routeHits":Ljava/util/ArrayList;
    :cond_2
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v8

    goto :goto_2

    .restart local v4    # "$simulatedLocation":Landroid/location/Location;
    :cond_3
    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    move-result v8

    goto :goto_3

    .restart local v5    # "$startDate":Ljava/util/Date;
    :cond_4
    invoke-virtual {v5}, Ljava/lang/Object;->hashCode()I

    move-result v8

    goto :goto_4

    .restart local v0    # "$endDate":Ljava/util/Date;
    :cond_5
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v9

    goto :goto_5
.end method

.method public hitRoute(Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;)V
    .locals 7
    .param p1, "itinerary"    # Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;

    .prologue
    .line 76
    const/4 v2, 0x0

    .line 77
    .local v2, "targetedHit":Lorg/json/JSONObject;
    iget-object v4, p0, Lcom/thetransitapp/droid/model/stats/Session;->routeHits:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_0
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-nez v5, :cond_2

    move-object v3, v2

    .line 90
    .end local v2    # "targetedHit":Lorg/json/JSONObject;
    .local v3, "targetedHit":Lorg/json/JSONObject;
    :goto_1
    if-nez v3, :cond_3

    .line 91
    :try_start_0
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_1

    .line 92
    .end local v3    # "targetedHit":Lorg/json/JSONObject;
    .restart local v2    # "targetedHit":Lorg/json/JSONObject;
    :try_start_1
    const-string v4, "hits"

    const/4 v5, 0x0

    invoke-virtual {v2, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 93
    iget-object v4, p0, Lcom/thetransitapp/droid/model/stats/Session;->routeHits:Ljava/util/ArrayList;

    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 96
    :goto_2
    const-string v4, "route_id"

    invoke-virtual {p1}, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->getRoute()Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;

    move-result-object v5

    invoke-virtual {v5}, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->getId()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 97
    const-string v4, "short_name"

    invoke-virtual {p1}, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->getRoute()Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;

    move-result-object v5

    invoke-virtual {v5}, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->getShortName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 98
    invoke-virtual {p1}, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->getRoute()Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;

    move-result-object v4

    invoke-virtual {v4}, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->getFeed()Lcom/thetransitapp/droid/model/Feed;

    move-result-object v4

    if-eqz v4, :cond_1

    .line 99
    const-string v4, "feed_code"

    invoke-virtual {p1}, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->getRoute()Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;

    move-result-object v5

    invoke-virtual {v5}, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->getFeed()Lcom/thetransitapp/droid/model/Feed;

    move-result-object v5

    invoke-virtual {v5}, Lcom/thetransitapp/droid/model/Feed;->getCode()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 100
    :cond_1
    const-string v4, "hits"

    const-string v5, "hits"

    invoke-virtual {v2, v5}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v5

    add-int/lit8 v5, v5, 0x1

    invoke-virtual {v2, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 101
    const-string v4, "is_favorite"

    invoke-virtual {p1}, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->getRoute()Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;

    move-result-object v5

    invoke-virtual {v5}, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->getRoute()Lcom/thetransitapp/droid/model/Route;

    move-result-object v5

    invoke-virtual {v5}, Lcom/thetransitapp/droid/model/Route;->isFavorite()Z

    move-result v5

    invoke-virtual {v2, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 102
    const-string v4, "headsign"

    invoke-virtual {p1}, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->getCurrentHeadsign()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_2

    .line 107
    :goto_3
    return-void

    .line 77
    :cond_2
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/json/JSONObject;

    .line 79
    .local v1, "routeHit":Lorg/json/JSONObject;
    :try_start_2
    const-string v5, "route_id"

    invoke-virtual {v1, v5}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {p1}, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->getRoute()Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;

    move-result-object v6

    invoke-virtual {v6}, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->getId()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_0

    move-result v5

    if-eqz v5, :cond_0

    .line 80
    move-object v2, v1

    move-object v3, v2

    .line 81
    .end local v2    # "targetedHit":Lorg/json/JSONObject;
    .restart local v3    # "targetedHit":Lorg/json/JSONObject;
    goto/16 :goto_1

    .line 83
    .end local v3    # "targetedHit":Lorg/json/JSONObject;
    .restart local v2    # "targetedHit":Lorg/json/JSONObject;
    :catch_0
    move-exception v0

    .line 84
    .local v0, "e":Lorg/json/JSONException;
    const-class v5, Lcom/thetransitapp/droid/model/stats/Session;

    invoke-virtual {v5}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 85
    invoke-static {v0}, Lcom/crashlytics/android/Crashlytics;->logException(Ljava/lang/Throwable;)V

    goto/16 :goto_0

    .line 103
    .end local v0    # "e":Lorg/json/JSONException;
    .end local v1    # "routeHit":Lorg/json/JSONObject;
    .end local v2    # "targetedHit":Lorg/json/JSONObject;
    .restart local v3    # "targetedHit":Lorg/json/JSONObject;
    :catch_1
    move-exception v0

    move-object v2, v3

    .line 104
    .end local v3    # "targetedHit":Lorg/json/JSONObject;
    .restart local v0    # "e":Lorg/json/JSONException;
    .restart local v2    # "targetedHit":Lorg/json/JSONObject;
    :goto_4
    const-class v4, Lcom/thetransitapp/droid/model/stats/Session;

    invoke-virtual {v4}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 105
    invoke-static {v0}, Lcom/crashlytics/android/Crashlytics;->logException(Ljava/lang/Throwable;)V

    goto :goto_3

    .line 103
    .end local v0    # "e":Lorg/json/JSONException;
    :catch_2
    move-exception v0

    goto :goto_4

    .end local v2    # "targetedHit":Lorg/json/JSONObject;
    .restart local v3    # "targetedHit":Lorg/json/JSONObject;
    :cond_3
    move-object v2, v3

    .end local v3    # "targetedHit":Lorg/json/JSONObject;
    .restart local v2    # "targetedHit":Lorg/json/JSONObject;
    goto/16 :goto_2
.end method

.method public setEndDate(Ljava/util/Date;)V
    .locals 0
    .param p1, "endDate"    # Ljava/util/Date;

    .prologue
    .line 22
    iput-object p1, p0, Lcom/thetransitapp/droid/model/stats/Session;->endDate:Ljava/util/Date;

    return-void
.end method

.method public setLocations(Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Landroid/location/Location;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 22
    .local p1, "locations":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Landroid/location/Location;>;"
    iput-object p1, p0, Lcom/thetransitapp/droid/model/stats/Session;->locations:Ljava/util/ArrayList;

    return-void
.end method

.method public setPlanRequests(Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Lorg/json/JSONObject;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 22
    .local p1, "planRequests":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lorg/json/JSONObject;>;"
    iput-object p1, p0, Lcom/thetransitapp/droid/model/stats/Session;->planRequests:Ljava/util/ArrayList;

    return-void
.end method

.method public setRouteHits(Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Lorg/json/JSONObject;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 22
    .local p1, "routeHits":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lorg/json/JSONObject;>;"
    iput-object p1, p0, Lcom/thetransitapp/droid/model/stats/Session;->routeHits:Ljava/util/ArrayList;

    return-void
.end method

.method public setSimulatedLocation(Landroid/location/Location;)V
    .locals 0
    .param p1, "simulatedLocation"    # Landroid/location/Location;

    .prologue
    .line 22
    iput-object p1, p0, Lcom/thetransitapp/droid/model/stats/Session;->simulatedLocation:Landroid/location/Location;

    return-void
.end method

.method public setStartDate(Ljava/util/Date;)V
    .locals 0
    .param p1, "startDate"    # Ljava/util/Date;

    .prologue
    .line 22
    iput-object p1, p0, Lcom/thetransitapp/droid/model/stats/Session;->startDate:Ljava/util/Date;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 22
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Session(locations="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/stats/Session;->getLocations()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", planRequests="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/stats/Session;->getPlanRequests()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", routeHits="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/stats/Session;->getRouteHits()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", simulatedLocation="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/stats/Session;->getSimulatedLocation()Landroid/location/Location;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", startDate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/stats/Session;->getStartDate()Ljava/util/Date;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", endDate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/stats/Session;->getEndDate()Ljava/util/Date;

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
