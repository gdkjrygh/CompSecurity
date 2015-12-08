.class public final Lcom/thetransitapp/droid/data/TransitSourceFactory;
.super Ljava/lang/Object;
.source "TransitSourceFactory.java"


# static fields
.field private static final DEBUG_SHORT_NAME:Ljava/lang/String;

.field private static final TAG:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 45
    const/4 v0, 0x0

    sput-object v0, Lcom/thetransitapp/droid/data/TransitSourceFactory;->DEBUG_SHORT_NAME:Ljava/lang/String;

    .line 47
    const-class v0, Lcom/thetransitapp/droid/data/TransitSourceFactory;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/thetransitapp/droid/data/TransitSourceFactory;->TAG:Ljava/lang/String;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .prologue
    .line 49
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 50
    return-void
.end method

.method private static addSchedule(Lorg/json/JSONObject;Lcom/thetransitapp/droid/model/Itinerary;Lcom/thetransitapp/droid/model/Stop;Z)V
    .locals 5
    .param p0, "object"    # Lorg/json/JSONObject;
    .param p1, "itinerary"    # Lcom/thetransitapp/droid/model/Itinerary;
    .param p2, "stop"    # Lcom/thetransitapp/droid/model/Stop;
    .param p3, "fullSchedule"    # Z

    .prologue
    .line 181
    const-string v3, "schedule_items"

    invoke-virtual {p0, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 183
    :try_start_0
    const-string v3, "schedule_items"

    invoke-virtual {p0, v3}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v0

    .line 185
    .local v0, "array":Lorg/json/JSONArray;
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    move-result v3

    if-lez v3, :cond_0

    .line 186
    invoke-static {v0, p1, p2, p3}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->createSchedule(Lorg/json/JSONArray;Lcom/thetransitapp/droid/model/Itinerary;Lcom/thetransitapp/droid/model/Stop;Z)Lcom/thetransitapp/droid/model/Schedule;

    move-result-object v2

    .line 188
    .local v2, "schedule":Lcom/thetransitapp/droid/model/Schedule;
    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/Schedule;->getServiceDay()Lcom/thetransitapp/droid/model/ServiceDay;

    move-result-object v3

    invoke-virtual {p1, v2, p2, v3}, Lcom/thetransitapp/droid/model/Itinerary;->addSchedule(Lcom/thetransitapp/droid/model/Schedule;Lcom/thetransitapp/droid/model/Stop;Lcom/thetransitapp/droid/model/ServiceDay;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 195
    .end local v0    # "array":Lorg/json/JSONArray;
    .end local v2    # "schedule":Lcom/thetransitapp/droid/model/Schedule;
    :cond_0
    :goto_0
    return-void

    .line 190
    :catch_0
    move-exception v1

    .line 192
    .local v1, "e":Lorg/json/JSONException;
    sget-object v3, Lcom/thetransitapp/droid/data/TransitSourceFactory;->TAG:Ljava/lang/String;

    invoke-virtual {v1}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0
.end method

.method private static assignMetaInfoToDataSource(Lorg/json/JSONObject;Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;)V
    .locals 7
    .param p0, "object"    # Lorg/json/JSONObject;
    .param p1, "dataSource"    # Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;

    .prologue
    .line 535
    :try_start_0
    const-string v5, "route_types"

    invoke-virtual {p0, v5}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_0

    .line 536
    const-string v5, "route_types"

    invoke-virtual {p0, v5}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v3

    .line 537
    .local v3, "routeTypesString":Lorg/json/JSONArray;
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 538
    .local v1, "parsedRouteTypes":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/Integer;>;"
    const/4 v4, 0x0

    .local v4, "typeIndex":I
    :goto_0
    invoke-virtual {v3}, Lorg/json/JSONArray;->length()I
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v5

    if-lt v4, v5, :cond_1

    .line 551
    .end local v1    # "parsedRouteTypes":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/Integer;>;"
    .end local v3    # "routeTypesString":Lorg/json/JSONArray;
    .end local v4    # "typeIndex":I
    :cond_0
    :goto_1
    const-string v5, "direction_match_type"

    const/4 v6, 0x0

    invoke-static {p0, v5, v6}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1, v5}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->setDirectionMatchType(Ljava/lang/String;)V

    .line 552
    return-void

    .line 540
    .restart local v1    # "parsedRouteTypes":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/Integer;>;"
    .restart local v3    # "routeTypesString":Lorg/json/JSONArray;
    .restart local v4    # "typeIndex":I
    :cond_1
    :try_start_1
    invoke-virtual {v3, v4}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 541
    .local v2, "routeType":Ljava/lang/String;
    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 542
    invoke-virtual {p1, v1}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->setRouteTypes(Ljava/util/ArrayList;)V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    .line 538
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 546
    .end local v1    # "parsedRouteTypes":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/Integer;>;"
    .end local v2    # "routeType":Ljava/lang/String;
    .end local v3    # "routeTypesString":Lorg/json/JSONArray;
    .end local v4    # "typeIndex":I
    :catch_0
    move-exception v0

    .line 547
    .local v0, "e":Lorg/json/JSONException;
    const-class v5, Lcom/thetransitapp/droid/data/TransitSourceFactory;

    invoke-virtual {v5}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 548
    invoke-static {v0}, Lcom/crashlytics/android/Crashlytics;->logException(Ljava/lang/Throwable;)V

    goto :goto_1
.end method

.method private static assignPredicatesToDataSource(Lorg/json/JSONObject;Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;)V
    .locals 8
    .param p0, "object"    # Lorg/json/JSONObject;
    .param p1, "dataSource"    # Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;

    .prologue
    const/4 v7, 0x0

    const/4 v6, 0x0

    const/4 v5, 0x2

    const/4 v4, 0x1

    .line 589
    const-string v3, "schedule_based_predicate"

    invoke-static {p0, v3, v7}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 590
    .local v2, "scheduleBased":Ljava/lang/String;
    if-eqz v2, :cond_0

    .line 591
    const-string v3, "=="

    invoke-virtual {v2, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    .line 592
    .local v1, "components":[Ljava/lang/String;
    aget-object v3, v1, v6

    invoke-virtual {p1, v3}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->setScheduleBasedKeyPath(Ljava/lang/String;)V

    .line 594
    array-length v3, v1

    if-le v3, v4, :cond_2

    .line 595
    aget-object v3, v1, v4

    invoke-static {v3, v5}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    move-result-object v3

    invoke-virtual {p1, v3}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->setScheduleBasedRegex(Ljava/util/regex/Pattern;)V

    .line 601
    .end local v1    # "components":[Ljava/lang/String;
    :cond_0
    :goto_0
    const-string v3, "cancelled_predicate"

    invoke-static {p0, v3, v7}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 602
    .local v0, "cancelledBased":Ljava/lang/String;
    if-eqz v0, :cond_1

    .line 603
    const-string v3, "=="

    invoke-virtual {v0, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    .line 604
    .restart local v1    # "components":[Ljava/lang/String;
    aget-object v3, v1, v6

    invoke-virtual {p1, v3}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->setCancelledKeyPath(Ljava/lang/String;)V

    .line 606
    array-length v3, v1

    if-le v3, v4, :cond_3

    .line 607
    aget-object v3, v1, v4

    invoke-static {v3, v5}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    move-result-object v3

    invoke-virtual {p1, v3}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->setCancelledRegex(Ljava/util/regex/Pattern;)V

    .line 612
    .end local v1    # "components":[Ljava/lang/String;
    :cond_1
    :goto_1
    return-void

    .line 597
    .end local v0    # "cancelledBased":Ljava/lang/String;
    .restart local v1    # "components":[Ljava/lang/String;
    :cond_2
    const-string v3, "^$"

    invoke-static {v3, v5}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    move-result-object v3

    invoke-virtual {p1, v3}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->setScheduleBasedRegex(Ljava/util/regex/Pattern;)V

    goto :goto_0

    .line 609
    .restart local v0    # "cancelledBased":Ljava/lang/String;
    :cond_3
    const-string v3, "^$"

    invoke-static {v3, v5}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    move-result-object v3

    invoke-virtual {p1, v3}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->setCancelledRegex(Ljava/util/regex/Pattern;)V

    goto :goto_1
.end method

.method private static assignPredictionInfoToDataSource(Lorg/json/JSONObject;Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;)V
    .locals 4
    .param p0, "object"    # Lorg/json/JSONObject;
    .param p1, "dataSource"    # Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;

    .prologue
    const/4 v3, 0x0

    .line 555
    const-string v0, "predictions_key_path"

    invoke-static {p0, v0, v3}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->setPredictionsKeyPath(Ljava/lang/String;)V

    .line 556
    const-string v0, "date_key_path"

    invoke-static {p0, v0, v3}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->setDateKeyPath(Ljava/lang/String;)V

    .line 557
    const-string v0, "destination_filtering_key_path"

    invoke-static {p0, v0, v3}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->setDestinationFilteringKeyPath(Ljava/lang/String;)V

    .line 558
    const-string v0, "route_filtering_key_path"

    invoke-static {p0, v0, v3}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->setRouteFilteringKeyPath(Ljava/lang/String;)V

    .line 559
    const-string v0, "stop_filtering_key_path"

    invoke-static {p0, v0, v3}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->setStopFilteringKeyPath(Ljava/lang/String;)V

    .line 560
    new-instance v0, Lcom/thetransitapp/droid/util/DateFormatter;

    const-string v1, "timestamp_format"

    const-string v2, ""

    invoke-static {p0, v1, v2}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/thetransitapp/droid/util/DateFormatter;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->setTimestampFormat(Lcom/thetransitapp/droid/util/DateFormatter;)V

    .line 561
    const-string v0, "timestamp_key_path"

    invoke-static {p0, v0, v3}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->setTimestampKeyPath(Ljava/lang/String;)V

    .line 562
    return-void
.end method

.method private static assignURLStringsToDataSource(Lorg/json/JSONObject;Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;)V
    .locals 4
    .param p0, "object"    # Lorg/json/JSONObject;
    .param p1, "dataSource"    # Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;

    .prologue
    const/4 v3, 0x0

    .line 575
    const-string v2, "trip_update_url"

    invoke-static {p0, v2, v3}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 576
    .local v0, "tripURL":Ljava/lang/String;
    if-eqz v0, :cond_0

    .line 577
    invoke-static {v0, p0}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->urlStringByReplacingValueFromObject(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v0

    .line 578
    invoke-virtual {p1, v0}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->setTripURL(Ljava/lang/String;)V

    .line 581
    :cond_0
    const-string v2, "vehicle_locations_url"

    invoke-static {p0, v2, v3}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 582
    .local v1, "vehiculeURL":Ljava/lang/String;
    if-eqz v1, :cond_1

    .line 583
    invoke-static {v1, p0}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->urlStringByReplacingValueFromObject(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 584
    invoke-virtual {p1, v1}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->setVehiculeURL(Ljava/lang/String;)V

    .line 586
    :cond_1
    return-void
.end method

.method private static assignVehiculeInfoToDataSource(Lorg/json/JSONObject;Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;)V
    .locals 4
    .param p0, "object"    # Lorg/json/JSONObject;
    .param p1, "dataSource"    # Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;

    .prologue
    const/4 v3, 0x0

    .line 565
    const-string v0, "vehicle_destination_key_path"

    invoke-static {p0, v0, v3}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->setVehicleDestinationKeyPath(Ljava/lang/String;)V

    .line 566
    const-string v0, "vehicle_id_key_path"

    invoke-static {p0, v0, v3}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->setVehicleIdKeyPath(Ljava/lang/String;)V

    .line 567
    const-string v0, "vehicle_latitude_key_path"

    invoke-static {p0, v0, v3}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->setVehicleLatitudeKeyPath(Ljava/lang/String;)V

    .line 568
    const-string v0, "vehicle_longitude_key_path"

    invoke-static {p0, v0, v3}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->setVehicleLongitudeKeyPath(Ljava/lang/String;)V

    .line 569
    new-instance v0, Lcom/thetransitapp/droid/util/DateFormatter;

    const-string v1, "vehicle_timestamp_format"

    const-string v2, ""

    invoke-static {p0, v1, v2}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/thetransitapp/droid/util/DateFormatter;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->setVehicleTimestampFormat(Lcom/thetransitapp/droid/util/DateFormatter;)V

    .line 570
    const-string v0, "vehicle_timestamp_key_path"

    invoke-static {p0, v0, v3}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->setVehicleTimestampKeyPath(Ljava/lang/String;)V

    .line 571
    const-string v0, "vehicles_key_path"

    invoke-static {p0, v0, v3}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->setVehiclesKeyPath(Ljava/lang/String;)V

    .line 572
    return-void
.end method

.method public static createBundle(Lorg/json/JSONObject;)Lcom/thetransitapp/droid/model/TransitBundle;
    .locals 8
    .param p0, "object"    # Lorg/json/JSONObject;

    .prologue
    const/4 v7, 0x0

    .line 276
    new-instance v1, Lcom/thetransitapp/droid/model/TransitBundle;

    invoke-direct {v1}, Lcom/thetransitapp/droid/model/TransitBundle;-><init>()V

    .line 278
    .local v1, "bundle":Lcom/thetransitapp/droid/model/TransitBundle;
    const-string v6, "id"

    invoke-static {p0, v6, v7}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v6}, Lcom/thetransitapp/droid/model/TransitBundle;->setId(Ljava/lang/String;)V

    .line 279
    const-string v6, "name"

    invoke-static {p0, v6, v7}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v6}, Lcom/thetransitapp/droid/model/TransitBundle;->setName(Ljava/lang/String;)V

    .line 280
    const-string v6, "gtfs_size"

    const-string v7, "0"

    invoke-static {p0, v6, v7}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v6

    invoke-virtual {v1, v6}, Lcom/thetransitapp/droid/model/TransitBundle;->setGtfsSize(I)V

    .line 281
    const-string v6, "latitude"

    const-string v7, "0.0"

    invoke-static {p0, v6, v7}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v6

    invoke-virtual {v1, v6, v7}, Lcom/thetransitapp/droid/model/TransitBundle;->setLatitude(D)V

    .line 282
    const-string v6, "longitude"

    const-string v7, "0.0"

    invoke-static {p0, v6, v7}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v6

    invoke-virtual {v1, v6, v7}, Lcom/thetransitapp/droid/model/TransitBundle;->setLongitude(D)V

    .line 283
    const-string v6, "country_code"

    const-string v7, "CA"

    invoke-static {p0, v6, v7}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v6}, Lcom/thetransitapp/droid/model/TransitBundle;->setCountryCode(Ljava/lang/String;)V

    .line 286
    :try_start_0
    const-string v6, "server"

    invoke-virtual {p0, v6}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_0

    const-string v6, "server"

    invoke-virtual {p0, v6}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v6

    const/4 v7, 0x0

    invoke-virtual {v6, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_0

    .line 287
    new-instance v4, Lcom/thetransitapp/droid/model/TransitServer;

    invoke-direct {v4}, Lcom/thetransitapp/droid/model/TransitServer;-><init>()V

    .line 288
    .local v4, "server":Lcom/thetransitapp/droid/model/TransitServer;
    const-string v6, "server"

    invoke-virtual {p0, v6}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v5

    .line 289
    .local v5, "serverObject":Lorg/json/JSONObject;
    const-string v6, "router_id"

    const/4 v7, 0x0

    invoke-static {v5, v6, v7}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Lcom/thetransitapp/droid/model/TransitServer;->setRouterId(Ljava/lang/String;)V

    .line 290
    const-string v6, "app_region"

    const/4 v7, 0x0

    invoke-static {v5, v6, v7}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Lcom/thetransitapp/droid/model/TransitServer;->setAppRegion(Ljava/lang/String;)V

    .line 291
    const-string v6, "planner_region"

    const/4 v7, 0x0

    invoke-static {v5, v6, v7}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Lcom/thetransitapp/droid/model/TransitServer;->setPlannerRegion(Ljava/lang/String;)V

    .line 293
    invoke-virtual {v1, v4}, Lcom/thetransitapp/droid/model/TransitBundle;->setServer(Lcom/thetransitapp/droid/model/TransitServer;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 301
    .end local v4    # "server":Lcom/thetransitapp/droid/model/TransitServer;
    .end local v5    # "serverObject":Lorg/json/JSONObject;
    :cond_0
    :goto_0
    :try_start_1
    const-string v6, "transit_modes"

    invoke-virtual {p0, v6}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_1

    const-string v6, "transit_modes"

    invoke-virtual {p0, v6}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v6

    const/4 v7, 0x0

    invoke-virtual {v6, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_1

    .line 302
    const-string v6, "transit_modes"

    invoke-virtual {p0, v6}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v0

    .line 304
    .local v0, "array":Lorg/json/JSONArray;
    const/4 v3, 0x0

    .local v3, "i":I
    :goto_1
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    move-result v6

    if-lt v3, v6, :cond_3

    .line 314
    .end local v0    # "array":Lorg/json/JSONArray;
    .end local v3    # "i":I
    :cond_1
    :goto_2
    :try_start_2
    const-string v6, "feeds"

    invoke-virtual {p0, v6}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_2

    const-string v6, "feeds"

    invoke-virtual {p0, v6}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v6

    if-nez v6, :cond_2

    .line 315
    const-string v6, "feeds"

    invoke-virtual {p0, v6}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v0

    .line 317
    .restart local v0    # "array":Lorg/json/JSONArray;
    const/4 v3, 0x0

    .restart local v3    # "i":I
    :goto_3
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_2

    move-result v6

    if-lt v3, v6, :cond_4

    .line 326
    .end local v0    # "array":Lorg/json/JSONArray;
    .end local v3    # "i":I
    :cond_2
    :goto_4
    return-object v1

    .line 295
    :catch_0
    move-exception v2

    .line 297
    .local v2, "e":Lorg/json/JSONException;
    sget-object v6, Lcom/thetransitapp/droid/data/TransitSourceFactory;->TAG:Ljava/lang/String;

    invoke-virtual {v2}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 305
    .end local v2    # "e":Lorg/json/JSONException;
    .restart local v0    # "array":Lorg/json/JSONArray;
    .restart local v3    # "i":I
    :cond_3
    :try_start_3
    invoke-virtual {v1}, Lcom/thetransitapp/droid/model/TransitBundle;->getTransitModes()Ljava/util/List;

    move-result-object v6

    invoke-virtual {v0, v3}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v7

    invoke-static {v7}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->createTransitMode(Lorg/json/JSONObject;)Lcom/thetransitapp/droid/model/TransitMode;

    move-result-object v7

    invoke-interface {v6, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_3
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_1

    .line 304
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 308
    .end local v0    # "array":Lorg/json/JSONArray;
    .end local v3    # "i":I
    :catch_1
    move-exception v2

    .line 310
    .restart local v2    # "e":Lorg/json/JSONException;
    sget-object v6, Lcom/thetransitapp/droid/data/TransitSourceFactory;->TAG:Ljava/lang/String;

    invoke-virtual {v2}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_2

    .line 318
    .end local v2    # "e":Lorg/json/JSONException;
    .restart local v0    # "array":Lorg/json/JSONArray;
    .restart local v3    # "i":I
    :cond_4
    :try_start_4
    invoke-virtual {v1}, Lcom/thetransitapp/droid/model/TransitBundle;->getFeeds()Ljava/util/List;

    move-result-object v6

    invoke-virtual {v0, v3}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v7

    invoke-static {v7}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->createFeed(Lorg/json/JSONObject;)Lcom/thetransitapp/droid/model/Feed;

    move-result-object v7

    invoke-interface {v6, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_4
    .catch Lorg/json/JSONException; {:try_start_4 .. :try_end_4} :catch_2

    .line 317
    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    .line 321
    .end local v0    # "array":Lorg/json/JSONArray;
    .end local v3    # "i":I
    :catch_2
    move-exception v2

    .line 323
    .restart local v2    # "e":Lorg/json/JSONException;
    sget-object v6, Lcom/thetransitapp/droid/data/TransitSourceFactory;->TAG:Ljava/lang/String;

    invoke-virtual {v2}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_4
.end method

.method public static createFeed(Lorg/json/JSONObject;)Lcom/thetransitapp/droid/model/Feed;
    .locals 15
    .param p0, "object"    # Lorg/json/JSONObject;
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "SimpleDateFormat"
        }
    .end annotation

    .prologue
    const/4 v14, 0x0

    .line 384
    new-instance v6, Lcom/thetransitapp/droid/model/Feed;

    invoke-direct {v6}, Lcom/thetransitapp/droid/model/Feed;-><init>()V

    .line 386
    .local v6, "feed":Lcom/thetransitapp/droid/model/Feed;
    const-string v12, "code"

    invoke-static {p0, v12, v14}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v6, v12}, Lcom/thetransitapp/droid/model/Feed;->setCode(Ljava/lang/String;)V

    .line 387
    const-string v12, "name"

    invoke-static {p0, v12, v14}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v6, v12}, Lcom/thetransitapp/droid/model/Feed;->setName(Ljava/lang/String;)V

    .line 388
    const-string v12, "level"

    const-string v13, "0"

    invoke-static {p0, v12, v13}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v12

    invoke-virtual {v6, v12}, Lcom/thetransitapp/droid/model/Feed;->setLevel(I)V

    .line 389
    const-string v12, "id"

    invoke-static {p0, v12, v14}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v6, v12}, Lcom/thetransitapp/droid/model/Feed;->setFeedId(Ljava/lang/String;)V

    .line 390
    const-string v12, "timezone"

    const-string v13, "GMT"

    invoke-static {p0, v12, v13}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object v12

    invoke-virtual {v6, v12}, Lcom/thetransitapp/droid/model/Feed;->setTimeZone(Ljava/util/TimeZone;)V

    .line 393
    :try_start_0
    const-string v12, "bounds"

    invoke-virtual {p0, v12}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v12

    if-eqz v12, :cond_0

    const-string v12, "bounds"

    invoke-virtual {p0, v12}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v12

    if-nez v12, :cond_0

    .line 394
    const-string v12, "bounds"

    invoke-virtual {p0, v12}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    .line 396
    .local v1, "boundsObject":Lorg/json/JSONObject;
    const-string v12, "min_lat"

    const/4 v13, 0x0

    invoke-static {v1, v12, v13}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v12

    invoke-virtual {v6, v12, v13}, Lcom/thetransitapp/droid/model/Feed;->setMinLatitude(D)V

    .line 397
    const-string v12, "max_lat"

    const/4 v13, 0x0

    invoke-static {v1, v12, v13}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v12

    invoke-virtual {v6, v12, v13}, Lcom/thetransitapp/droid/model/Feed;->setMaxLatitude(D)V

    .line 398
    const-string v12, "min_lon"

    const/4 v13, 0x0

    invoke-static {v1, v12, v13}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v12

    invoke-virtual {v6, v12, v13}, Lcom/thetransitapp/droid/model/Feed;->setMinLongitude(D)V

    .line 399
    const-string v12, "max_lon"

    const/4 v13, 0x0

    invoke-static {v1, v12, v13}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v12

    invoke-virtual {v6, v12, v13}, Lcom/thetransitapp/droid/model/Feed;->setMaxLongitude(D)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 406
    .end local v1    # "boundsObject":Lorg/json/JSONObject;
    :cond_0
    :goto_0
    const-string v12, "notice"

    invoke-static {p0, v12, v14}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v6, v12}, Lcom/thetransitapp/droid/model/Feed;->setNotice(Ljava/lang/String;)V

    .line 407
    const-string v12, "licence"

    invoke-static {p0, v12, v14}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v6, v12}, Lcom/thetransitapp/droid/model/Feed;->setLicence(Ljava/lang/String;)V

    .line 408
    const-string v12, "licence_url"

    invoke-static {p0, v12, v14}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v6, v12}, Lcom/thetransitapp/droid/model/Feed;->setLicenceUrl(Ljava/lang/String;)V

    .line 411
    :try_start_1
    new-instance v8, Ljava/text/SimpleDateFormat;

    const-string v12, "yyyy-MM-dd\'T\'HH:mm:ss\'Z\'"

    invoke-direct {v8, v12}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 412
    .local v8, "formater":Ljava/text/SimpleDateFormat;
    const-string v12, "gtfs_uploaded_at"

    const/4 v13, 0x0

    invoke-static {p0, v12, v13}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 414
    .local v4, "date":Ljava/lang/String;
    if-eqz v4, :cond_1

    .line 415
    invoke-virtual {v8, v4}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v12

    invoke-virtual {v6, v12}, Lcom/thetransitapp/droid/model/Feed;->setUpdatedDate(Ljava/util/Date;)V
    :try_end_1
    .catch Ljava/text/ParseException; {:try_start_1 .. :try_end_1} :catch_1

    .line 424
    .end local v4    # "date":Ljava/lang/String;
    .end local v8    # "formater":Ljava/text/SimpleDateFormat;
    :cond_1
    :goto_1
    :try_start_2
    const-string v12, "real_time_recipes"

    invoke-virtual {p0, v12}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v12

    if-eqz v12, :cond_2

    const-string v12, "real_time_recipes"

    invoke-virtual {p0, v12}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v12

    if-nez v12, :cond_2

    .line 425
    const-string v12, "real_time_recipes"

    invoke-virtual {p0, v12}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v10

    .line 427
    .local v10, "receipes":Lorg/json/JSONArray;
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 428
    .local v3, "dataSources":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;>;"
    const/4 v9, 0x0

    .local v9, "i":I
    :goto_2
    invoke-virtual {v10}, Lorg/json/JSONArray;->length()I

    move-result v12

    if-lt v9, v12, :cond_4

    .line 435
    new-instance v7, Lcom/thetransitapp/droid/model/realtime/FeedRealTimeDataSource;

    invoke-direct {v7, v3}, Lcom/thetransitapp/droid/model/realtime/FeedRealTimeDataSource;-><init>(Ljava/util/ArrayList;)V

    .line 436
    .local v7, "feedDataSource":Lcom/thetransitapp/droid/model/realtime/FeedRealTimeDataSource;
    invoke-virtual {v6, v7}, Lcom/thetransitapp/droid/model/Feed;->setRealTimeDataSource(Lcom/thetransitapp/droid/model/realtime/FeedRealTimeDataSource;)V
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_2

    .line 444
    .end local v3    # "dataSources":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;>;"
    .end local v7    # "feedDataSource":Lcom/thetransitapp/droid/model/realtime/FeedRealTimeDataSource;
    .end local v9    # "i":I
    .end local v10    # "receipes":Lorg/json/JSONArray;
    :cond_2
    :goto_3
    :try_start_3
    const-string v12, "images"

    invoke-virtual {p0, v12}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v12

    if-eqz v12, :cond_3

    const-string v12, "images"

    invoke-virtual {p0, v12}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v12

    if-nez v12, :cond_3

    .line 445
    const-string v12, "images"

    invoke-virtual {p0, v12}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v0

    .line 447
    .local v0, "array":Lorg/json/JSONArray;
    const/4 v9, 0x0

    .restart local v9    # "i":I
    :goto_4
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I
    :try_end_3
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_3

    move-result v12

    if-lt v9, v12, :cond_6

    .line 456
    .end local v0    # "array":Lorg/json/JSONArray;
    .end local v9    # "i":I
    :cond_3
    :goto_5
    return-object v6

    .line 401
    :catch_0
    move-exception v5

    .line 403
    .local v5, "e":Lorg/json/JSONException;
    sget-object v12, Lcom/thetransitapp/droid/data/TransitSourceFactory;->TAG:Ljava/lang/String;

    invoke-virtual {v5}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v13

    invoke-static {v12, v13}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto/16 :goto_0

    .line 417
    .end local v5    # "e":Lorg/json/JSONException;
    :catch_1
    move-exception v5

    .line 419
    .local v5, "e":Ljava/text/ParseException;
    sget-object v12, Lcom/thetransitapp/droid/data/TransitSourceFactory;->TAG:Ljava/lang/String;

    invoke-virtual {v5}, Ljava/text/ParseException;->getMessage()Ljava/lang/String;

    move-result-object v13

    invoke-static {v12, v13}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 420
    invoke-virtual {v6, v14}, Lcom/thetransitapp/droid/model/Feed;->setUpdatedDate(Ljava/util/Date;)V

    goto :goto_1

    .line 429
    .end local v5    # "e":Ljava/text/ParseException;
    .restart local v3    # "dataSources":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;>;"
    .restart local v9    # "i":I
    .restart local v10    # "receipes":Lorg/json/JSONArray;
    :cond_4
    :try_start_4
    invoke-virtual {v10, v9}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v11

    .line 430
    .local v11, "sourceObject":Lorg/json/JSONObject;
    invoke-static {v11}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->createRealTimeDataSource(Lorg/json/JSONObject;)Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;

    move-result-object v2

    .line 431
    .local v2, "dataSource":Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;
    if-eqz v2, :cond_5

    .line 432
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_4
    .catch Lorg/json/JSONException; {:try_start_4 .. :try_end_4} :catch_2

    .line 428
    :cond_5
    add-int/lit8 v9, v9, 0x1

    goto :goto_2

    .line 438
    .end local v2    # "dataSource":Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;
    .end local v3    # "dataSources":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;>;"
    .end local v9    # "i":I
    .end local v10    # "receipes":Lorg/json/JSONArray;
    .end local v11    # "sourceObject":Lorg/json/JSONObject;
    :catch_2
    move-exception v5

    .line 440
    .local v5, "e":Lorg/json/JSONException;
    sget-object v12, Lcom/thetransitapp/droid/data/TransitSourceFactory;->TAG:Ljava/lang/String;

    invoke-virtual {v5}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v13

    invoke-static {v12, v13}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_3

    .line 448
    .end local v5    # "e":Lorg/json/JSONException;
    .restart local v0    # "array":Lorg/json/JSONArray;
    .restart local v9    # "i":I
    :cond_6
    :try_start_5
    invoke-virtual {v6}, Lcom/thetransitapp/droid/model/Feed;->getRouteImages()Ljava/util/List;

    move-result-object v12

    invoke-virtual {v0, v9}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v13

    invoke-static {v13}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->createImage(Lorg/json/JSONObject;)Lcom/thetransitapp/droid/model/RouteImage;

    move-result-object v13

    invoke-interface {v12, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_5
    .catch Lorg/json/JSONException; {:try_start_5 .. :try_end_5} :catch_3

    .line 447
    add-int/lit8 v9, v9, 0x1

    goto :goto_4

    .line 451
    .end local v0    # "array":Lorg/json/JSONArray;
    .end local v9    # "i":I
    :catch_3
    move-exception v5

    .line 453
    .restart local v5    # "e":Lorg/json/JSONException;
    sget-object v12, Lcom/thetransitapp/droid/data/TransitSourceFactory;->TAG:Ljava/lang/String;

    invoke-virtual {v5}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v13

    invoke-static {v12, v13}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_5
.end method

.method public static createImage(Lorg/json/JSONObject;)Lcom/thetransitapp/droid/model/RouteImage;
    .locals 9
    .param p0, "object"    # Lorg/json/JSONObject;
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "SimpleDateFormat"
        }
    .end annotation

    .prologue
    const/4 v8, 0x0

    .line 461
    new-instance v5, Lcom/thetransitapp/droid/model/RouteImage;

    invoke-direct {v5}, Lcom/thetransitapp/droid/model/RouteImage;-><init>()V

    .line 463
    .local v5, "image":Lcom/thetransitapp/droid/model/RouteImage;
    const-string v6, "id"

    invoke-static {p0, v6, v8}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Lcom/thetransitapp/droid/model/RouteImage;->setId(Ljava/lang/String;)V

    .line 464
    const-string v6, "name"

    invoke-static {p0, v6, v8}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Lcom/thetransitapp/droid/model/RouteImage;->setName(Ljava/lang/String;)V

    .line 465
    const-string v6, "url"

    invoke-static {p0, v6, v8}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Lcom/thetransitapp/droid/model/RouteImage;->setUrl(Ljava/lang/String;)V

    .line 467
    const-string v6, "route_ids"

    invoke-virtual {p0, v6}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_0

    .line 469
    :try_start_0
    const-string v6, "route_ids"

    invoke-virtual {p0, v6}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v0

    .line 471
    .local v0, "array":Lorg/json/JSONArray;
    const/4 v4, 0x0

    .local v4, "i":I
    :goto_0
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v6

    if-lt v4, v6, :cond_2

    .line 480
    .end local v0    # "array":Lorg/json/JSONArray;
    .end local v4    # "i":I
    :cond_0
    :goto_1
    const-string v6, "replace_name"

    const-string v7, "0"

    invoke-static {p0, v6, v7}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v7, "1"

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    invoke-virtual {v5, v6}, Lcom/thetransitapp/droid/model/RouteImage;->setReplaceName(Z)V

    .line 483
    :try_start_1
    new-instance v3, Ljava/text/SimpleDateFormat;

    const-string v6, "yyyy-MM-dd\'T\'HH:mm:ss\'Z\'"

    invoke-direct {v3, v6}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 484
    .local v3, "formater":Ljava/text/SimpleDateFormat;
    const-string v6, "updated_at"

    const/4 v7, 0x0

    invoke-static {p0, v6, v7}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 486
    .local v1, "date":Ljava/lang/String;
    if-eqz v1, :cond_1

    .line 487
    invoke-virtual {v3, v1}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v6

    invoke-virtual {v5, v6}, Lcom/thetransitapp/droid/model/RouteImage;->setUpdatedAt(Ljava/util/Date;)V
    :try_end_1
    .catch Ljava/text/ParseException; {:try_start_1 .. :try_end_1} :catch_1

    .line 495
    .end local v1    # "date":Ljava/lang/String;
    .end local v3    # "formater":Ljava/text/SimpleDateFormat;
    :cond_1
    :goto_2
    return-object v5

    .line 472
    .restart local v0    # "array":Lorg/json/JSONArray;
    .restart local v4    # "i":I
    :cond_2
    :try_start_2
    invoke-virtual {v5}, Lcom/thetransitapp/droid/model/RouteImage;->getRouteIds()Ljava/util/List;

    move-result-object v6

    invoke-virtual {v0, v4}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v7

    invoke-interface {v6, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_0

    .line 471
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 474
    .end local v0    # "array":Lorg/json/JSONArray;
    .end local v4    # "i":I
    :catch_0
    move-exception v2

    .line 476
    .local v2, "e":Lorg/json/JSONException;
    sget-object v6, Lcom/thetransitapp/droid/data/TransitSourceFactory;->TAG:Ljava/lang/String;

    invoke-virtual {v2}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_1

    .line 489
    .end local v2    # "e":Lorg/json/JSONException;
    :catch_1
    move-exception v2

    .line 491
    .local v2, "e":Ljava/text/ParseException;
    invoke-virtual {v5, v8}, Lcom/thetransitapp/droid/model/RouteImage;->setUpdatedAt(Ljava/util/Date;)V

    .line 492
    sget-object v6, Lcom/thetransitapp/droid/data/TransitSourceFactory;->TAG:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/text/ParseException;->getMessage()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_2
.end method

.method public static createItinerary(Lorg/json/JSONObject;)Lcom/thetransitapp/droid/model/Itinerary;
    .locals 2
    .param p0, "object"    # Lorg/json/JSONObject;

    .prologue
    .line 114
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->createItinerary(Lorg/json/JSONObject;Lcom/thetransitapp/droid/model/Stop;Z)Lcom/thetransitapp/droid/model/Itinerary;

    move-result-object v0

    return-object v0
.end method

.method public static createItinerary(Lorg/json/JSONObject;Lcom/thetransitapp/droid/model/Stop;Z)Lcom/thetransitapp/droid/model/Itinerary;
    .locals 12
    .param p0, "object"    # Lorg/json/JSONObject;
    .param p1, "stop"    # Lcom/thetransitapp/droid/model/Stop;
    .param p2, "fullSchedule"    # Z

    .prologue
    const/4 v11, 0x0

    .line 118
    new-instance v4, Lcom/thetransitapp/droid/model/Itinerary;

    invoke-direct {v4}, Lcom/thetransitapp/droid/model/Itinerary;-><init>()V

    .line 120
    .local v4, "itinerary":Lcom/thetransitapp/droid/model/Itinerary;
    const-string v8, "itinerary_id"

    const-string v9, ""

    invoke-static {p0, v8, v9}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v4, v8}, Lcom/thetransitapp/droid/model/Itinerary;->setItineraryId(Ljava/lang/String;)V

    .line 121
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Lcom/thetransitapp/droid/model/Itinerary;->getItineraryId()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v9, "service_id"

    const-string v10, ""

    invoke-static {p0, v9, v10}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v4, v8}, Lcom/thetransitapp/droid/model/Itinerary;->setId(Ljava/lang/String;)V

    .line 122
    const-string v8, "shape_data"

    invoke-static {p0, v8, v11}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v4, v8}, Lcom/thetransitapp/droid/model/Itinerary;->setShape(Ljava/lang/String;)V

    .line 125
    :try_start_0
    const-string v8, "direction_id"

    const-string v9, "0"

    invoke-static {p0, v8, v9}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v7

    .line 127
    .local v7, "typeId":I
    invoke-static {}, Lcom/thetransitapp/droid/model/Itinerary$DirectionType;->values()[Lcom/thetransitapp/droid/model/Itinerary$DirectionType;

    move-result-object v8

    array-length v8, v8

    if-ge v7, v8, :cond_0

    .line 128
    invoke-static {}, Lcom/thetransitapp/droid/model/Itinerary$DirectionType;->values()[Lcom/thetransitapp/droid/model/Itinerary$DirectionType;

    move-result-object v8

    aget-object v8, v8, v7

    invoke-virtual {v4, v8}, Lcom/thetransitapp/droid/model/Itinerary;->setDirectionType(Lcom/thetransitapp/droid/model/Itinerary$DirectionType;)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 135
    .end local v7    # "typeId":I
    :cond_0
    :goto_0
    const-string v8, "branch_code"

    invoke-static {p0, v8, v11}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v4, v8}, Lcom/thetransitapp/droid/model/Itinerary;->setBranch(Ljava/lang/String;)V

    .line 136
    const-string v8, "rt_route_id"

    invoke-static {p0, v8, v11}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v4, v8}, Lcom/thetransitapp/droid/model/Itinerary;->setRealTimeRouteID(Ljava/lang/String;)V

    .line 138
    const-string v8, "trip_headsign"

    const-string v9, ""

    invoke-static {p0, v8, v9}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v4, v8}, Lcom/thetransitapp/droid/model/Itinerary;->setDefaultHeadsign(Ljava/lang/String;)V

    .line 140
    move-object v1, p1

    .line 142
    .local v1, "closestStop":Lcom/thetransitapp/droid/model/Stop;
    if-nez v1, :cond_1

    .line 143
    const-string v8, "closest_stop"

    invoke-virtual {p0, v8}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_1

    .line 147
    :try_start_1
    const-string v8, "closest_stop"

    invoke-virtual {p0, v8}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v6

    .line 148
    .local v6, "stopObject":Lorg/json/JSONObject;
    invoke-static {v6, v4, p2}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->createStop(Lorg/json/JSONObject;Lcom/thetransitapp/droid/model/Itinerary;Z)Lcom/thetransitapp/droid/model/Stop;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v1

    .line 156
    .end local v6    # "stopObject":Lorg/json/JSONObject;
    :cond_1
    :goto_1
    if-eqz v1, :cond_2

    .line 157
    invoke-virtual {v4}, Lcom/thetransitapp/droid/model/Itinerary;->getStops()Ljava/util/List;

    move-result-object v8

    invoke-interface {v8, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 160
    :cond_2
    const-string v8, "stops"

    invoke-virtual {p0, v8}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_3

    .line 162
    :try_start_2
    const-string v8, "stops"

    invoke-virtual {p0, v8}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v0

    .line 165
    .local v0, "array":Lorg/json/JSONArray;
    const/4 v3, 0x0

    .local v3, "i":I
    :goto_2
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_2

    move-result v8

    if-lt v3, v8, :cond_4

    .line 175
    .end local v0    # "array":Lorg/json/JSONArray;
    .end local v3    # "i":I
    :cond_3
    :goto_3
    invoke-static {p0, v4, v1, p2}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->addSchedule(Lorg/json/JSONObject;Lcom/thetransitapp/droid/model/Itinerary;Lcom/thetransitapp/droid/model/Stop;Z)V

    .line 177
    return-object v4

    .line 130
    .end local v1    # "closestStop":Lcom/thetransitapp/droid/model/Stop;
    :catch_0
    move-exception v2

    .line 132
    .local v2, "e":Ljava/lang/NumberFormatException;
    sget-object v8, Lcom/thetransitapp/droid/data/TransitSourceFactory;->TAG:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/NumberFormatException;->getMessage()Ljava/lang/String;

    move-result-object v9

    invoke-static {v8, v9}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 149
    .end local v2    # "e":Ljava/lang/NumberFormatException;
    .restart local v1    # "closestStop":Lcom/thetransitapp/droid/model/Stop;
    :catch_1
    move-exception v2

    .line 151
    .local v2, "e":Lorg/json/JSONException;
    sget-object v8, Lcom/thetransitapp/droid/data/TransitSourceFactory;->TAG:Ljava/lang/String;

    invoke-virtual {v2}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v9

    invoke-static {v8, v9}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_1

    .line 166
    .end local v2    # "e":Lorg/json/JSONException;
    .restart local v0    # "array":Lorg/json/JSONArray;
    .restart local v3    # "i":I
    :cond_4
    :try_start_3
    invoke-virtual {v0, v3}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v8

    invoke-static {v8, v4, p2}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->createStop(Lorg/json/JSONObject;Lcom/thetransitapp/droid/model/Itinerary;Z)Lcom/thetransitapp/droid/model/Stop;

    move-result-object v5

    .line 167
    .local v5, "stopItem":Lcom/thetransitapp/droid/model/Stop;
    invoke-virtual {v4}, Lcom/thetransitapp/droid/model/Itinerary;->getStops()Ljava/util/List;

    move-result-object v8

    invoke-interface {v8, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_3
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_2

    .line 165
    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    .line 169
    .end local v0    # "array":Lorg/json/JSONArray;
    .end local v3    # "i":I
    .end local v5    # "stopItem":Lcom/thetransitapp/droid/model/Stop;
    :catch_2
    move-exception v2

    .line 171
    .restart local v2    # "e":Lorg/json/JSONException;
    sget-object v8, Lcom/thetransitapp/droid/data/TransitSourceFactory;->TAG:Ljava/lang/String;

    invoke-virtual {v2}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v9

    invoke-static {v8, v9}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_3
.end method

.method public static createRealTimeDataSource(Lorg/json/JSONObject;)Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;
    .locals 5
    .param p0, "object"    # Lorg/json/JSONObject;

    .prologue
    const/4 v3, 0x0

    .line 499
    const-string v4, "feed_type"

    invoke-static {p0, v4, v3}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 501
    .local v1, "dataSourceType":Ljava/lang/String;
    const/4 v0, 0x0

    .line 502
    .local v0, "dataSource":Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;
    const-string v4, "SPRealTimeNextBusDataSource"

    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 503
    new-instance v2, Lcom/thetransitapp/droid/model/realtime/NextBusRealTimeDataSource;

    invoke-direct {v2}, Lcom/thetransitapp/droid/model/realtime/NextBusRealTimeDataSource;-><init>()V

    .line 504
    .local v2, "nextBusDataSource":Lcom/thetransitapp/droid/model/realtime/NextBusRealTimeDataSource;
    const-string v4, "agency_tag"

    invoke-static {p0, v4, v3}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/thetransitapp/droid/model/realtime/NextBusRealTimeDataSource;->setAgencyTag(Ljava/lang/String;)V

    .line 505
    move-object v0, v2

    .line 523
    .end local v2    # "nextBusDataSource":Lcom/thetransitapp/droid/model/realtime/NextBusRealTimeDataSource;
    :goto_0
    invoke-static {p0, v0}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->assignURLStringsToDataSource(Lorg/json/JSONObject;Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;)V

    .line 524
    invoke-static {p0, v0}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->assignPredicatesToDataSource(Lorg/json/JSONObject;Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;)V

    .line 525
    invoke-static {p0, v0}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->assignPredictionInfoToDataSource(Lorg/json/JSONObject;Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;)V

    .line 526
    invoke-static {p0, v0}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->assignVehiculeInfoToDataSource(Lorg/json/JSONObject;Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;)V

    .line 527
    invoke-static {p0, v0}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->assignMetaInfoToDataSource(Lorg/json/JSONObject;Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;)V

    move-object v3, v0

    .line 529
    :cond_0
    return-object v3

    .line 506
    :cond_1
    const-string v4, "SPRealTimeXMLDataSource"

    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 507
    new-instance v0, Lcom/thetransitapp/droid/model/realtime/XMLRealTimeDataSource;

    .end local v0    # "dataSource":Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;
    invoke-direct {v0}, Lcom/thetransitapp/droid/model/realtime/XMLRealTimeDataSource;-><init>()V

    .restart local v0    # "dataSource":Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;
    goto :goto_0

    .line 508
    :cond_2
    const-string v4, "SPRealTimeJSONDataSource"

    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    .line 509
    new-instance v0, Lcom/thetransitapp/droid/model/realtime/JSONRealTimeDataSource;

    .end local v0    # "dataSource":Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;
    invoke-direct {v0}, Lcom/thetransitapp/droid/model/realtime/JSONRealTimeDataSource;-><init>()V

    .restart local v0    # "dataSource":Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;
    goto :goto_0

    .line 510
    :cond_3
    const-string v4, "SPRealTimeGTFSDataSource"

    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    .line 511
    new-instance v0, Lcom/thetransitapp/droid/model/realtime/GTFSRealTimeDataSource;

    .end local v0    # "dataSource":Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;
    invoke-direct {v0}, Lcom/thetransitapp/droid/model/realtime/GTFSRealTimeDataSource;-><init>()V

    .restart local v0    # "dataSource":Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;
    goto :goto_0

    .line 512
    :cond_4
    const-string v4, "SPRealTimeOBADataSource"

    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_5

    .line 513
    new-instance v0, Lcom/thetransitapp/droid/model/realtime/OBARealTimeDataSource;

    .end local v0    # "dataSource":Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;
    invoke-direct {v0}, Lcom/thetransitapp/droid/model/realtime/OBARealTimeDataSource;-><init>()V

    .restart local v0    # "dataSource":Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;
    goto :goto_0

    .line 514
    :cond_5
    const-string v4, "SPRealTimeBARTDataSource"

    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    .line 515
    new-instance v0, Lcom/thetransitapp/droid/model/realtime/BARTRealTimeDataSource;

    .end local v0    # "dataSource":Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;
    invoke-direct {v0}, Lcom/thetransitapp/droid/model/realtime/BARTRealTimeDataSource;-><init>()V

    .restart local v0    # "dataSource":Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;
    goto :goto_0

    .line 516
    :cond_6
    const-string v4, "SPRealTimeMBTASDataSource"

    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_7

    .line 517
    new-instance v0, Lcom/thetransitapp/droid/model/realtime/MBTASRealTimeDataSource;

    .end local v0    # "dataSource":Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;
    invoke-direct {v0}, Lcom/thetransitapp/droid/model/realtime/MBTASRealTimeDataSource;-><init>()V

    .restart local v0    # "dataSource":Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;
    goto :goto_0

    .line 518
    :cond_7
    const-string v4, "SPRealTimeOCTDataSource"

    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 519
    new-instance v0, Lcom/thetransitapp/droid/model/realtime/OCTRealTimeDataSource;

    .end local v0    # "dataSource":Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;
    invoke-direct {v0}, Lcom/thetransitapp/droid/model/realtime/OCTRealTimeDataSource;-><init>()V

    .restart local v0    # "dataSource":Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;
    goto :goto_0
.end method

.method public static createRoute(Lorg/json/JSONObject;)Lcom/thetransitapp/droid/model/Route;
    .locals 9
    .param p0, "object"    # Lorg/json/JSONObject;

    .prologue
    const/4 v5, 0x0

    .line 53
    new-instance v3, Lcom/thetransitapp/droid/model/Route;

    invoke-direct {v3}, Lcom/thetransitapp/droid/model/Route;-><init>()V

    .line 54
    .local v3, "route":Lcom/thetransitapp/droid/model/Route;
    const-string v6, "route_id"

    invoke-static {p0, v6, v5}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3, v6}, Lcom/thetransitapp/droid/model/Route;->setId(Ljava/lang/String;)V

    .line 55
    const-string v6, "feed_id"

    invoke-static {p0, v6, v5}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3, v6}, Lcom/thetransitapp/droid/model/Route;->setFeedId(Ljava/lang/String;)V

    .line 57
    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "#"

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v7, "route_color"

    const-string v8, "ffffff"

    invoke-static {p0, v7, v8}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v6

    invoke-virtual {v3, v6}, Lcom/thetransitapp/droid/model/Route;->setColor(I)V

    .line 58
    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "#"

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v7, "route_text_color"

    const-string v8, "000000"

    invoke-static {p0, v7, v8}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v6

    invoke-virtual {v3, v6}, Lcom/thetransitapp/droid/model/Route;->setTextColor(I)V

    .line 59
    const-string v6, "route_short_name"

    const-string v7, ""

    invoke-static {p0, v6, v7}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3, v6}, Lcom/thetransitapp/droid/model/Route;->setShortName(Ljava/lang/String;)V

    .line 60
    const-string v6, "route_long_name"

    const-string v7, ""

    invoke-static {p0, v6, v7}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3, v6}, Lcom/thetransitapp/droid/model/Route;->setLongName(Ljava/lang/String;)V

    .line 62
    sget-object v6, Lcom/thetransitapp/droid/data/TransitSourceFactory;->DEBUG_SHORT_NAME:Ljava/lang/String;

    if-eqz v6, :cond_0

    sget-object v6, Lcom/thetransitapp/droid/data/TransitSourceFactory;->DEBUG_SHORT_NAME:Ljava/lang/String;

    invoke-virtual {v3}, Lcom/thetransitapp/droid/model/Route;->getShortName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    .line 64
    :cond_0
    :try_start_0
    const-string v5, "route_type"

    const-string v6, "0"

    invoke-static {p0, v5, v6}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    .line 66
    .local v4, "typeId":I
    invoke-static {}, Lcom/thetransitapp/droid/model/Route$RouteType;->values()[Lcom/thetransitapp/droid/model/Route$RouteType;

    move-result-object v5

    array-length v5, v5

    if-ge v4, v5, :cond_1

    .line 67
    invoke-static {}, Lcom/thetransitapp/droid/model/Route$RouteType;->values()[Lcom/thetransitapp/droid/model/Route$RouteType;

    move-result-object v5

    aget-object v5, v5, v4

    invoke-virtual {v3, v5}, Lcom/thetransitapp/droid/model/Route;->setType(Lcom/thetransitapp/droid/model/Route$RouteType;)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 74
    .end local v4    # "typeId":I
    :cond_1
    :goto_0
    const-string v5, "itineraries"

    invoke-virtual {p0, v5}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_2

    .line 76
    :try_start_1
    const-string v5, "itineraries"

    invoke-virtual {p0, v5}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v0

    .line 78
    .local v0, "array":Lorg/json/JSONArray;
    const/4 v2, 0x0

    .local v2, "i":I
    :goto_1
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    move-result v5

    if-lt v2, v5, :cond_3

    .line 89
    .end local v0    # "array":Lorg/json/JSONArray;
    .end local v2    # "i":I
    .end local v3    # "route":Lcom/thetransitapp/droid/model/Route;
    :cond_2
    :goto_2
    return-object v3

    .line 69
    .restart local v3    # "route":Lcom/thetransitapp/droid/model/Route;
    :catch_0
    move-exception v1

    .line 71
    .local v1, "e":Ljava/lang/NumberFormatException;
    sget-object v5, Lcom/thetransitapp/droid/data/TransitSourceFactory;->TAG:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/NumberFormatException;->getMessage()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 79
    .end local v1    # "e":Ljava/lang/NumberFormatException;
    .restart local v0    # "array":Lorg/json/JSONArray;
    .restart local v2    # "i":I
    :cond_3
    :try_start_2
    invoke-virtual {v0, v2}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v5

    invoke-static {v5}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->createItinerary(Lorg/json/JSONObject;)Lcom/thetransitapp/droid/model/Itinerary;

    move-result-object v5

    invoke-virtual {v3, v5}, Lcom/thetransitapp/droid/model/Route;->addItinerary(Lcom/thetransitapp/droid/model/Itinerary;)V
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_1

    .line 78
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 81
    .end local v0    # "array":Lorg/json/JSONArray;
    .end local v2    # "i":I
    :catch_1
    move-exception v1

    .line 83
    .local v1, "e":Lorg/json/JSONException;
    sget-object v5, Lcom/thetransitapp/droid/data/TransitSourceFactory;->TAG:Ljava/lang/String;

    invoke-virtual {v1}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_2

    .end local v1    # "e":Lorg/json/JSONException;
    :cond_4
    move-object v3, v5

    .line 89
    goto :goto_2
.end method

.method public static createSchedule(Lorg/json/JSONArray;Lcom/thetransitapp/droid/model/Itinerary;Lcom/thetransitapp/droid/model/Stop;Z)Lcom/thetransitapp/droid/model/Schedule;
    .locals 9
    .param p0, "array"    # Lorg/json/JSONArray;
    .param p1, "itinerary"    # Lcom/thetransitapp/droid/model/Itinerary;
    .param p2, "stop"    # Lcom/thetransitapp/droid/model/Stop;
    .param p3, "fullSchedule"    # Z

    .prologue
    .line 198
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 199
    .local v4, "scheduleItems":Ljava/util/List;, "Ljava/util/List<Lcom/thetransitapp/droid/model/ScheduleItem;>;"
    const/4 v5, 0x0

    .line 202
    .local v5, "serviceDay":Lcom/thetransitapp/droid/model/ServiceDay;
    const/4 v1, 0x0

    .local v1, "i":I
    :goto_0
    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    move-result v7

    if-lt v1, v7, :cond_0

    .line 217
    new-instance v3, Lcom/thetransitapp/droid/model/Schedule;

    invoke-direct {v3}, Lcom/thetransitapp/droid/model/Schedule;-><init>()V

    .line 218
    .local v3, "schedule":Lcom/thetransitapp/droid/model/Schedule;
    invoke-virtual {v3, v4}, Lcom/thetransitapp/droid/model/Schedule;->setScheduleItems(Ljava/util/List;)V

    .line 219
    invoke-virtual {v3, p3}, Lcom/thetransitapp/droid/model/Schedule;->setComplete(Z)V

    .line 220
    invoke-virtual {v3, v5}, Lcom/thetransitapp/droid/model/Schedule;->setServiceDay(Lcom/thetransitapp/droid/model/ServiceDay;)V

    .line 221
    invoke-virtual {v3, p1}, Lcom/thetransitapp/droid/model/Schedule;->setItinerary(Lcom/thetransitapp/droid/model/Itinerary;)V

    .line 222
    invoke-virtual {v3, p2}, Lcom/thetransitapp/droid/model/Schedule;->setStop(Lcom/thetransitapp/droid/model/Stop;)V

    .line 224
    return-object v3

    .line 204
    .end local v3    # "schedule":Lcom/thetransitapp/droid/model/Schedule;
    :cond_0
    :try_start_0
    invoke-virtual {p0, v1}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v2

    .line 206
    .local v2, "object":Lorg/json/JSONObject;
    if-nez v5, :cond_1

    .line 207
    new-instance v6, Lcom/thetransitapp/droid/model/ServiceDay;

    const-string v7, "service_date"

    const/4 v8, 0x0

    invoke-static {v2, v7, v8}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-direct {v6, v7}, Lcom/thetransitapp/droid/model/ServiceDay;-><init>(Ljava/lang/String;)V

    .end local v5    # "serviceDay":Lcom/thetransitapp/droid/model/ServiceDay;
    .local v6, "serviceDay":Lcom/thetransitapp/droid/model/ServiceDay;
    move-object v5, v6

    .line 210
    .end local v6    # "serviceDay":Lcom/thetransitapp/droid/model/ServiceDay;
    .restart local v5    # "serviceDay":Lcom/thetransitapp/droid/model/ServiceDay;
    :cond_1
    invoke-static {v2, p1, p2, v5}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->createScheduleItem(Lorg/json/JSONObject;Lcom/thetransitapp/droid/model/Itinerary;Lcom/thetransitapp/droid/model/Stop;Lcom/thetransitapp/droid/model/ServiceDay;)Lcom/thetransitapp/droid/model/ScheduleItem;

    move-result-object v7

    invoke-interface {v4, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 202
    .end local v2    # "object":Lorg/json/JSONObject;
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 211
    :catch_0
    move-exception v0

    .line 213
    .local v0, "e":Lorg/json/JSONException;
    sget-object v7, Lcom/thetransitapp/droid/data/TransitSourceFactory;->TAG:Ljava/lang/String;

    invoke-virtual {v0}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v8

    invoke-static {v7, v8}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_1
.end method

.method public static createScheduleItem(Lorg/json/JSONObject;Lcom/thetransitapp/droid/model/Itinerary;Lcom/thetransitapp/droid/model/Stop;Lcom/thetransitapp/droid/model/ServiceDay;)Lcom/thetransitapp/droid/model/ScheduleItem;
    .locals 4
    .param p0, "object"    # Lorg/json/JSONObject;
    .param p1, "itinerary"    # Lcom/thetransitapp/droid/model/Itinerary;
    .param p2, "stop"    # Lcom/thetransitapp/droid/model/Stop;
    .param p3, "serviceDay"    # Lcom/thetransitapp/droid/model/ServiceDay;

    .prologue
    .line 229
    new-instance v1, Lcom/thetransitapp/droid/model/ScheduleItem;

    invoke-direct {v1}, Lcom/thetransitapp/droid/model/ScheduleItem;-><init>()V

    .line 231
    .local v1, "scheduleItem":Lcom/thetransitapp/droid/model/ScheduleItem;
    const-string v2, "stop_time"

    invoke-virtual {p0, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 232
    const-string v2, "stop_time"

    const-string v3, "00:00"

    invoke-static {p0, v2, v3}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p3, v2}, Lcom/thetransitapp/droid/model/ServiceDay;->getDate(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/thetransitapp/droid/model/ScheduleItem;->setScheduledStopTime(Ljava/util/Date;)V

    .line 245
    :goto_0
    const-string v2, "trip_id"

    const/4 v3, 0x0

    invoke-static {p0, v2, v3}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/thetransitapp/droid/model/ScheduleItem;->setTripId(Ljava/lang/String;)V

    .line 246
    const-string v2, "pickup_type"

    const-string v3, "0"

    invoke-static {p0, v2, v3}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "1"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v1, v2}, Lcom/thetransitapp/droid/model/ScheduleItem;->setPickupCancelled(Z)V

    .line 247
    const-string v2, "is_last_item"

    const-string v3, "false"

    invoke-static {p0, v2, v3}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result v2

    invoke-virtual {v1, v2}, Lcom/thetransitapp/droid/model/ScheduleItem;->setLastItemOfService(Z)V

    .line 248
    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lcom/thetransitapp/droid/model/ScheduleItem;->setCancelled(Z)V

    .line 249
    invoke-virtual {p1}, Lcom/thetransitapp/droid/model/Itinerary;->getDefaultHeadsign()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/thetransitapp/droid/model/ScheduleItem;->setHeadsign(Ljava/lang/String;)V

    .line 251
    invoke-virtual {v1, p1}, Lcom/thetransitapp/droid/model/ScheduleItem;->setItinerary(Lcom/thetransitapp/droid/model/Itinerary;)V

    .line 252
    invoke-virtual {v1, p2}, Lcom/thetransitapp/droid/model/ScheduleItem;->setStop(Lcom/thetransitapp/droid/model/Stop;)V

    .line 253
    invoke-virtual {v1, p3}, Lcom/thetransitapp/droid/model/ScheduleItem;->setServiceDay(Lcom/thetransitapp/droid/model/ServiceDay;)V

    .line 255
    return-object v1

    .line 234
    :cond_0
    const-string v2, "start_time"

    const-string v3, "00:00"

    invoke-static {p0, v2, v3}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p3, v2}, Lcom/thetransitapp/droid/model/ServiceDay;->getDate(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/thetransitapp/droid/model/ScheduleItem;->setFrequencyStartTime(Ljava/util/Date;)V

    .line 235
    const-string v2, "end_time"

    const-string v3, "00:00"

    invoke-static {p0, v2, v3}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p3, v2}, Lcom/thetransitapp/droid/model/ServiceDay;->getDate(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/thetransitapp/droid/model/ScheduleItem;->setFrequencyEndTime(Ljava/util/Date;)V

    .line 238
    :try_start_0
    const-string v2, "headway_secs"

    const-string v3, "0"

    invoke-static {p0, v2, v3}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lcom/thetransitapp/droid/model/ScheduleItem;->setFrequencyHeadway(J)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 239
    :catch_0
    move-exception v0

    .line 241
    .local v0, "e":Ljava/lang/NumberFormatException;
    sget-object v2, Lcom/thetransitapp/droid/data/TransitSourceFactory;->TAG:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/NumberFormatException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0
.end method

.method public static createStop(Lorg/json/JSONObject;Lcom/thetransitapp/droid/model/Itinerary;Z)Lcom/thetransitapp/droid/model/Stop;
    .locals 9
    .param p0, "object"    # Lorg/json/JSONObject;
    .param p1, "itinerary"    # Lcom/thetransitapp/droid/model/Itinerary;
    .param p2, "fullSchedule"    # Z

    .prologue
    const/4 v8, 0x0

    .line 93
    new-instance v5, Lcom/thetransitapp/droid/model/Stop;

    invoke-direct {v5}, Lcom/thetransitapp/droid/model/Stop;-><init>()V

    .line 95
    .local v5, "stop":Lcom/thetransitapp/droid/model/Stop;
    const-string v6, "stop_id"

    invoke-static {p0, v6, v8}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Lcom/thetransitapp/droid/model/Stop;->setId(Ljava/lang/String;)V

    .line 97
    const-string v6, "stop_name"

    const-string v7, ""

    invoke-static {p0, v6, v7}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Lcom/thetransitapp/droid/model/Stop;->setName(Ljava/lang/String;)V

    .line 98
    const-string v6, "rt_stop_id"

    invoke-static {p0, v6, v8}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Lcom/thetransitapp/droid/model/Stop;->setRealTimeId(Ljava/lang/String;)V

    .line 101
    :try_start_0
    const-string v6, "stop_lat"

    const-string v7, "0.0"

    invoke-static {p0, v6, v7}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v1

    .line 102
    .local v1, "latitude":D
    const-string v6, "stop_lon"

    const-string v7, "0.0"

    invoke-static {p0, v6, v7}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v3

    .line 104
    .local v3, "longitude":D
    new-instance v6, Lcom/thetransitapp/droid/model/SimplePlacemark;

    invoke-direct {v6, v1, v2, v3, v4}, Lcom/thetransitapp/droid/model/SimplePlacemark;-><init>(DD)V

    invoke-virtual {v5, v6}, Lcom/thetransitapp/droid/model/Stop;->setPlacemark(Lcom/thetransitapp/droid/model/SimplePlacemark;)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 110
    .end local v1    # "latitude":D
    .end local v3    # "longitude":D
    :goto_0
    return-object v5

    .line 105
    :catch_0
    move-exception v0

    .line 107
    .local v0, "e":Ljava/lang/NumberFormatException;
    sget-object v6, Lcom/thetransitapp/droid/data/TransitSourceFactory;->TAG:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/NumberFormatException;->getMessage()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0
.end method

.method private static createTransitMode(Lorg/json/JSONObject;)Lcom/thetransitapp/droid/model/TransitMode;
    .locals 10
    .param p0, "object"    # Lorg/json/JSONObject;

    .prologue
    const/4 v9, 0x0

    .line 330
    new-instance v3, Lcom/thetransitapp/droid/model/TransitMode;

    invoke-direct {v3}, Lcom/thetransitapp/droid/model/TransitMode;-><init>()V

    .line 332
    .local v3, "mode":Lcom/thetransitapp/droid/model/TransitMode;
    const-string v8, "id"

    invoke-static {p0, v8, v9}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v3, v8}, Lcom/thetransitapp/droid/model/TransitMode;->setId(Ljava/lang/String;)V

    .line 333
    const-string v8, "name"

    invoke-static {p0, v8, v9}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v3, v8}, Lcom/thetransitapp/droid/model/TransitMode;->setName(Ljava/lang/String;)V

    .line 336
    :try_start_0
    const-string v8, "route_types"

    const/4 v9, 0x0

    invoke-static {p0, v8, v9}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 337
    .local v7, "typeIdsString":Ljava/lang/String;
    if-eqz v7, :cond_0

    .line 338
    const-string v8, ","

    invoke-virtual {v7, v8}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v6

    .line 340
    .local v6, "typeIds":[Ljava/lang/String;
    const/4 v2, 0x0

    .local v2, "i":I
    :goto_0
    array-length v8, v6
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    if-lt v2, v8, :cond_3

    .line 354
    .end local v2    # "i":I
    .end local v6    # "typeIds":[Ljava/lang/String;
    .end local v7    # "typeIdsString":Ljava/lang/String;
    :cond_0
    :goto_1
    :try_start_1
    const-string v8, "feed_ids"

    invoke-virtual {p0, v8}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_1

    const-string v8, "feed_ids"

    invoke-virtual {p0, v8}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v8

    const/4 v9, 0x0

    invoke-virtual {v8, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_1

    .line 355
    const-string v8, "feed_ids"

    const-string v9, ""

    invoke-static {p0, v8, v9}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    const-string v9, ","

    invoke-virtual {v8, v9}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    .line 357
    .local v1, "feedIds":[Ljava/lang/String;
    const/4 v2, 0x0

    .restart local v2    # "i":I
    :goto_2
    array-length v8, v1
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    if-lt v2, v8, :cond_5

    .line 367
    .end local v1    # "feedIds":[Ljava/lang/String;
    .end local v2    # "i":I
    :cond_1
    :goto_3
    :try_start_2
    const-string v8, "route_ids"

    invoke-virtual {p0, v8}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_2

    const-string v8, "route_ids"

    invoke-virtual {p0, v8}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v8

    const/4 v9, 0x0

    invoke-virtual {v8, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_2

    .line 368
    const-string v8, "route_ids"

    const-string v9, ""

    invoke-static {p0, v8, v9}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    const-string v9, ","

    invoke-virtual {v8, v9}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v4

    .line 370
    .local v4, "routeIds":[Ljava/lang/String;
    const/4 v2, 0x0

    .restart local v2    # "i":I
    :goto_4
    array-length v8, v4
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_2

    if-lt v2, v8, :cond_6

    .line 379
    .end local v2    # "i":I
    .end local v4    # "routeIds":[Ljava/lang/String;
    :cond_2
    :goto_5
    return-object v3

    .line 341
    .restart local v2    # "i":I
    .restart local v6    # "typeIds":[Ljava/lang/String;
    .restart local v7    # "typeIdsString":Ljava/lang/String;
    :cond_3
    :try_start_3
    aget-object v8, v6, v2

    invoke-static {v8}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v5

    .line 343
    .local v5, "typeId":I
    invoke-static {}, Lcom/thetransitapp/droid/model/Route$RouteType;->values()[Lcom/thetransitapp/droid/model/Route$RouteType;

    move-result-object v8

    array-length v8, v8

    if-ge v5, v8, :cond_4

    .line 344
    invoke-virtual {v3}, Lcom/thetransitapp/droid/model/TransitMode;->getRouteTypes()Ljava/util/List;

    move-result-object v8

    invoke-static {}, Lcom/thetransitapp/droid/model/Route$RouteType;->values()[Lcom/thetransitapp/droid/model/Route$RouteType;

    move-result-object v9

    aget-object v9, v9, v5

    invoke-interface {v8, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_3
    .catch Ljava/lang/NumberFormatException; {:try_start_3 .. :try_end_3} :catch_0

    .line 340
    :cond_4
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 348
    .end local v2    # "i":I
    .end local v5    # "typeId":I
    .end local v6    # "typeIds":[Ljava/lang/String;
    .end local v7    # "typeIdsString":Ljava/lang/String;
    :catch_0
    move-exception v0

    .line 350
    .local v0, "e":Ljava/lang/NumberFormatException;
    sget-object v8, Lcom/thetransitapp/droid/data/TransitSourceFactory;->TAG:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/NumberFormatException;->getMessage()Ljava/lang/String;

    move-result-object v9

    invoke-static {v8, v9}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_1

    .line 358
    .end local v0    # "e":Ljava/lang/NumberFormatException;
    .restart local v1    # "feedIds":[Ljava/lang/String;
    .restart local v2    # "i":I
    :cond_5
    :try_start_4
    invoke-virtual {v3}, Lcom/thetransitapp/droid/model/TransitMode;->getFeedIds()Ljava/util/List;

    move-result-object v8

    aget-object v9, v1, v2

    invoke-interface {v8, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_4
    .catch Lorg/json/JSONException; {:try_start_4 .. :try_end_4} :catch_1

    .line 357
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    .line 361
    .end local v1    # "feedIds":[Ljava/lang/String;
    .end local v2    # "i":I
    :catch_1
    move-exception v0

    .line 363
    .local v0, "e":Lorg/json/JSONException;
    sget-object v8, Lcom/thetransitapp/droid/data/TransitSourceFactory;->TAG:Ljava/lang/String;

    invoke-virtual {v0}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v9

    invoke-static {v8, v9}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_3

    .line 371
    .end local v0    # "e":Lorg/json/JSONException;
    .restart local v2    # "i":I
    .restart local v4    # "routeIds":[Ljava/lang/String;
    :cond_6
    :try_start_5
    invoke-virtual {v3}, Lcom/thetransitapp/droid/model/TransitMode;->getRouteIds()Ljava/util/List;

    move-result-object v8

    aget-object v9, v4, v2

    invoke-interface {v8, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_5
    .catch Lorg/json/JSONException; {:try_start_5 .. :try_end_5} :catch_2

    .line 370
    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    .line 374
    .end local v2    # "i":I
    .end local v4    # "routeIds":[Ljava/lang/String;
    :catch_2
    move-exception v0

    .line 376
    .restart local v0    # "e":Lorg/json/JSONException;
    sget-object v8, Lcom/thetransitapp/droid/data/TransitSourceFactory;->TAG:Ljava/lang/String;

    invoke-virtual {v0}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v9

    invoke-static {v8, v9}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_5
.end method

.method public static getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 4
    .param p0, "object"    # Lorg/json/JSONObject;
    .param p1, "key"    # Ljava/lang/String;
    .param p2, "defaultValue"    # Ljava/lang/String;

    .prologue
    .line 259
    invoke-virtual {p0, p1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 261
    :try_start_0
    invoke-virtual {p0, p1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 263
    .local v1, "value":Ljava/lang/String;
    const-string v2, "null"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 264
    invoke-virtual {p0, p1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object p2

    .line 272
    .end local v1    # "value":Ljava/lang/String;
    .end local p2    # "defaultValue":Ljava/lang/String;
    :cond_0
    :goto_0
    return-object p2

    .line 266
    .restart local p2    # "defaultValue":Ljava/lang/String;
    :catch_0
    move-exception v0

    .line 268
    .local v0, "e":Lorg/json/JSONException;
    sget-object v2, Lcom/thetransitapp/droid/data/TransitSourceFactory;->TAG:Ljava/lang/String;

    invoke-virtual {v0}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0
.end method

.method private static urlStringByReplacingValueFromObject(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;
    .locals 7
    .param p0, "urlString"    # Ljava/lang/String;
    .param p1, "object"    # Lorg/json/JSONObject;

    .prologue
    .line 615
    invoke-virtual {p1}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v3

    .line 617
    .local v3, "keys":Ljava/util/Iterator;, "Ljava/util/Iterator<*>;"
    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-nez v5, :cond_1

    .line 632
    return-object p0

    .line 618
    :cond_1
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 619
    .local v2, "key":Ljava/lang/String;
    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "__"

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, "__"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 620
    .local v1, "escapedKey":Ljava/lang/String;
    invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_0

    .line 623
    :try_start_0
    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 624
    .local v4, "value":Ljava/lang/String;
    invoke-virtual {p0, v1, v4}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object p0

    goto :goto_0

    .line 625
    .end local v4    # "value":Ljava/lang/String;
    :catch_0
    move-exception v0

    .line 627
    .local v0, "e":Lorg/json/JSONException;
    sget-object v5, Lcom/thetransitapp/droid/data/TransitSourceFactory;->TAG:Ljava/lang/String;

    invoke-virtual {v0}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0
.end method
