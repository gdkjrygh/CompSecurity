.class public Lcom/thetransitapp/droid/data/OnlinePlannerSource;
.super Lcom/thetransitapp/droid/data/BaseOnlineSource;
.source "OnlinePlannerSource.java"


# static fields
.field private static synthetic $SWITCH_TABLE$com$thetransitapp$droid$model$RoutingLeg$TransportationMode:[I

.field private static final TAG:Ljava/lang/String;


# instance fields
.field private databaseHelper:Lcom/thetransitapp/droid/data/TransitDatabaseHelper;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field private feedManager:Lcom/thetransitapp/droid/controller/FeedManager;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field private preferences:Landroid/content/SharedPreferences;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field


# direct methods
.method static synthetic $SWITCH_TABLE$com$thetransitapp$droid$model$RoutingLeg$TransportationMode()[I
    .locals 3

    .prologue
    .line 39
    sget-object v0, Lcom/thetransitapp/droid/data/OnlinePlannerSource;->$SWITCH_TABLE$com$thetransitapp$droid$model$RoutingLeg$TransportationMode:[I

    if-eqz v0, :cond_0

    :goto_0
    return-object v0

    :cond_0
    invoke-static {}, Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;->values()[Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    :try_start_0
    sget-object v1, Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;->ALIGHTING:Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;

    invoke-virtual {v1}, Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;->ordinal()I

    move-result v1

    const/16 v2, 0x11

    aput v2, v0, v1
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_13

    :goto_1
    :try_start_1
    sget-object v1, Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;->BICYCLE:Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;

    invoke-virtual {v1}, Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;->ordinal()I

    move-result v1

    const/4 v2, 0x3

    aput v2, v0, v1
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_12

    :goto_2
    :try_start_2
    sget-object v1, Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;->BOARDING:Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;

    invoke-virtual {v1}, Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;->ordinal()I

    move-result v1

    const/16 v2, 0x10

    aput v2, v0, v1
    :try_end_2
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2 .. :try_end_2} :catch_11

    :goto_3
    :try_start_3
    sget-object v1, Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;->BUS:Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;

    invoke-virtual {v1}, Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;->ordinal()I

    move-result v1

    const/16 v2, 0x8

    aput v2, v0, v1
    :try_end_3
    .catch Ljava/lang/NoSuchFieldError; {:try_start_3 .. :try_end_3} :catch_10

    :goto_4
    :try_start_4
    sget-object v1, Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;->BUSISH:Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;

    invoke-virtual {v1}, Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;->ordinal()I

    move-result v1

    const/16 v2, 0xf

    aput v2, v0, v1
    :try_end_4
    .catch Ljava/lang/NoSuchFieldError; {:try_start_4 .. :try_end_4} :catch_f

    :goto_5
    :try_start_5
    sget-object v1, Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;->CABLE_CAR:Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;

    invoke-virtual {v1}, Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;->ordinal()I

    move-result v1

    const/16 v2, 0xa

    aput v2, v0, v1
    :try_end_5
    .catch Ljava/lang/NoSuchFieldError; {:try_start_5 .. :try_end_5} :catch_e

    :goto_6
    :try_start_6
    sget-object v1, Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;->CAR:Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;

    invoke-virtual {v1}, Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;->ordinal()I

    move-result v1

    const/4 v2, 0x4

    aput v2, v0, v1
    :try_end_6
    .catch Ljava/lang/NoSuchFieldError; {:try_start_6 .. :try_end_6} :catch_d

    :goto_7
    :try_start_7
    sget-object v1, Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;->CUSTOM_MOTOR_VEHICLE:Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;

    invoke-virtual {v1}, Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;->ordinal()I

    move-result v1

    const/16 v2, 0x14

    aput v2, v0, v1
    :try_end_7
    .catch Ljava/lang/NoSuchFieldError; {:try_start_7 .. :try_end_7} :catch_c

    :goto_8
    :try_start_8
    sget-object v1, Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;->FERRY:Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;

    invoke-virtual {v1}, Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;->ordinal()I

    move-result v1

    const/16 v2, 0x9

    aput v2, v0, v1
    :try_end_8
    .catch Ljava/lang/NoSuchFieldError; {:try_start_8 .. :try_end_8} :catch_b

    :goto_9
    :try_start_9
    sget-object v1, Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;->FUNICULAR:Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;

    invoke-virtual {v1}, Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;->ordinal()I

    move-result v1

    const/16 v2, 0xc

    aput v2, v0, v1
    :try_end_9
    .catch Ljava/lang/NoSuchFieldError; {:try_start_9 .. :try_end_9} :catch_a

    :goto_a
    :try_start_a
    sget-object v1, Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;->GONDOLA:Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;

    invoke-virtual {v1}, Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;->ordinal()I

    move-result v1

    const/16 v2, 0xb

    aput v2, v0, v1
    :try_end_a
    .catch Ljava/lang/NoSuchFieldError; {:try_start_a .. :try_end_a} :catch_9

    :goto_b
    :try_start_b
    sget-object v1, Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;->RAIL:Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;

    invoke-virtual {v1}, Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;->ordinal()I

    move-result v1

    const/4 v2, 0x7

    aput v2, v0, v1
    :try_end_b
    .catch Ljava/lang/NoSuchFieldError; {:try_start_b .. :try_end_b} :catch_8

    :goto_c
    :try_start_c
    sget-object v1, Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;->STL:Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;

    invoke-virtual {v1}, Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;->ordinal()I

    move-result v1

    const/16 v2, 0x13

    aput v2, v0, v1
    :try_end_c
    .catch Ljava/lang/NoSuchFieldError; {:try_start_c .. :try_end_c} :catch_7

    :goto_d
    :try_start_d
    sget-object v1, Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;->SUBWAY:Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;

    invoke-virtual {v1}, Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;->ordinal()I

    move-result v1

    const/4 v2, 0x6

    aput v2, v0, v1
    :try_end_d
    .catch Ljava/lang/NoSuchFieldError; {:try_start_d .. :try_end_d} :catch_6

    :goto_e
    :try_start_e
    sget-object v1, Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;->TRAINISH:Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;

    invoke-virtual {v1}, Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;->ordinal()I

    move-result v1

    const/16 v2, 0xe

    aput v2, v0, v1
    :try_end_e
    .catch Ljava/lang/NoSuchFieldError; {:try_start_e .. :try_end_e} :catch_5

    :goto_f
    :try_start_f
    sget-object v1, Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;->TRAM:Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;

    invoke-virtual {v1}, Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;->ordinal()I

    move-result v1

    const/4 v2, 0x5

    aput v2, v0, v1
    :try_end_f
    .catch Ljava/lang/NoSuchFieldError; {:try_start_f .. :try_end_f} :catch_4

    :goto_10
    :try_start_10
    sget-object v1, Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;->TRANSFER:Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;

    invoke-virtual {v1}, Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;->ordinal()I

    move-result v1

    const/16 v2, 0x12

    aput v2, v0, v1
    :try_end_10
    .catch Ljava/lang/NoSuchFieldError; {:try_start_10 .. :try_end_10} :catch_3

    :goto_11
    :try_start_11
    sget-object v1, Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;->TRANSIT:Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;

    invoke-virtual {v1}, Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;->ordinal()I

    move-result v1

    const/16 v2, 0xd

    aput v2, v0, v1
    :try_end_11
    .catch Ljava/lang/NoSuchFieldError; {:try_start_11 .. :try_end_11} :catch_2

    :goto_12
    :try_start_12
    sget-object v1, Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;->WAIT:Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;

    invoke-virtual {v1}, Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1
    :try_end_12
    .catch Ljava/lang/NoSuchFieldError; {:try_start_12 .. :try_end_12} :catch_1

    :goto_13
    :try_start_13
    sget-object v1, Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;->WALK:Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;

    invoke-virtual {v1}, Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1
    :try_end_13
    .catch Ljava/lang/NoSuchFieldError; {:try_start_13 .. :try_end_13} :catch_0

    :goto_14
    sput-object v0, Lcom/thetransitapp/droid/data/OnlinePlannerSource;->$SWITCH_TABLE$com$thetransitapp$droid$model$RoutingLeg$TransportationMode:[I

    goto/16 :goto_0

    :catch_0
    move-exception v1

    goto :goto_14

    :catch_1
    move-exception v1

    goto :goto_13

    :catch_2
    move-exception v1

    goto :goto_12

    :catch_3
    move-exception v1

    goto :goto_11

    :catch_4
    move-exception v1

    goto :goto_10

    :catch_5
    move-exception v1

    goto :goto_f

    :catch_6
    move-exception v1

    goto :goto_e

    :catch_7
    move-exception v1

    goto :goto_d

    :catch_8
    move-exception v1

    goto :goto_c

    :catch_9
    move-exception v1

    goto :goto_b

    :catch_a
    move-exception v1

    goto :goto_a

    :catch_b
    move-exception v1

    goto/16 :goto_9

    :catch_c
    move-exception v1

    goto/16 :goto_8

    :catch_d
    move-exception v1

    goto/16 :goto_7

    :catch_e
    move-exception v1

    goto/16 :goto_6

    :catch_f
    move-exception v1

    goto/16 :goto_5

    :catch_10
    move-exception v1

    goto/16 :goto_4

    :catch_11
    move-exception v1

    goto/16 :goto_3

    :catch_12
    move-exception v1

    goto/16 :goto_2

    :catch_13
    move-exception v1

    goto/16 :goto_1
.end method

.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 40
    const-class v0, Lcom/thetransitapp/droid/data/OnlinePlannerSource;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/thetransitapp/droid/data/OnlinePlannerSource;->TAG:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 50
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/thetransitapp/droid/data/BaseOnlineSource;-><init>(Z)V

    .line 51
    return-void
.end method

.method private createRoute(Lorg/json/JSONObject;Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;)Lcom/thetransitapp/droid/model/Route;
    .locals 5
    .param p1, "object"    # Lorg/json/JSONObject;
    .param p2, "mode"    # Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;

    .prologue
    const/4 v4, 0x0

    .line 369
    new-instance v0, Lcom/thetransitapp/droid/model/Route;

    invoke-direct {v0}, Lcom/thetransitapp/droid/model/Route;-><init>()V

    .line 371
    .local v0, "route":Lcom/thetransitapp/droid/model/Route;
    invoke-virtual {p2}, Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;->ordinal()I

    move-result v1

    invoke-static {}, Lcom/thetransitapp/droid/model/Route$RouteType;->values()[Lcom/thetransitapp/droid/model/Route$RouteType;

    move-result-object v2

    array-length v2, v2

    if-ge v1, v2, :cond_0

    .line 372
    invoke-static {}, Lcom/thetransitapp/droid/model/Route$RouteType;->values()[Lcom/thetransitapp/droid/model/Route$RouteType;

    move-result-object v1

    invoke-virtual {p2}, Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;->ordinal()I

    move-result v2

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Lcom/thetransitapp/droid/model/Route;->setType(Lcom/thetransitapp/droid/model/Route$RouteType;)V

    .line 375
    :cond_0
    const-string v1, ""

    invoke-static {p1, v1, v4}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/thetransitapp/droid/model/Route;->setFeedId(Ljava/lang/String;)V

    .line 377
    const-string v1, "routeShortName"

    invoke-static {p1, v1, v4}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/thetransitapp/droid/model/Route;->setShortName(Ljava/lang/String;)V

    .line 378
    const-string v1, "routeLongName"

    invoke-static {p1, v1, v4}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/thetransitapp/droid/model/Route;->setLongName(Ljava/lang/String;)V

    .line 379
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "#"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v2, "routeColor"

    const-string v3, "000000"

    invoke-static {p1, v2, v3}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/thetransitapp/droid/model/Route;->setColor(I)V

    .line 380
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "#"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v2, "routeTextColor"

    const-string v3, "000000"

    invoke-static {p1, v2, v3}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/thetransitapp/droid/model/Route;->setTextColor(I)V

    .line 381
    const-string v1, "routeId"

    invoke-static {p1, v1, v4}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/thetransitapp/droid/model/Route;->setId(Ljava/lang/String;)V

    .line 382
    const-string v1, "agencyId"

    invoke-static {p1, v1, v4}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/thetransitapp/droid/model/Route;->setFeedId(Ljava/lang/String;)V

    .line 384
    return-object v0
.end method

.method private createRoutingItinerary(Lorg/json/JSONObject;)Lcom/thetransitapp/droid/model/RoutingItinerary;
    .locals 16
    .param p1, "object"    # Lorg/json/JSONObject;

    .prologue
    .line 184
    new-instance v4, Lcom/thetransitapp/droid/model/RoutingItinerary;

    invoke-direct {v4}, Lcom/thetransitapp/droid/model/RoutingItinerary;-><init>()V

    .line 186
    .local v4, "itinerary":Lcom/thetransitapp/droid/model/RoutingItinerary;
    const-string v12, "duration"

    const-string v13, "0"

    move-object/from16 v0, p1

    invoke-static {v0, v12, v13}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v12

    invoke-virtual {v4, v12, v13}, Lcom/thetransitapp/droid/model/RoutingItinerary;->setDuration(J)V

    .line 187
    new-instance v12, Ljava/util/Date;

    const-string v13, "startTime"

    const-string v14, "0"

    move-object/from16 v0, p1

    invoke-static {v0, v13, v14}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    invoke-static {v13}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v13

    invoke-direct {v12, v13, v14}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v4, v12}, Lcom/thetransitapp/droid/model/RoutingItinerary;->setStartTime(Ljava/util/Date;)V

    .line 188
    new-instance v12, Ljava/util/Date;

    const-string v13, "endTime"

    const-string v14, "0"

    move-object/from16 v0, p1

    invoke-static {v0, v13, v14}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    invoke-static {v13}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v13

    invoke-direct {v12, v13, v14}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v4, v12}, Lcom/thetransitapp/droid/model/RoutingItinerary;->setEndTime(Ljava/util/Date;)V

    .line 189
    new-instance v12, Ljava/util/Date;

    invoke-direct {v12}, Ljava/util/Date;-><init>()V

    invoke-virtual {v4, v12}, Lcom/thetransitapp/droid/model/RoutingItinerary;->setFetchDate(Ljava/util/Date;)V

    .line 191
    const-string v12, "transitTime"

    const-string v13, "0"

    move-object/from16 v0, p1

    invoke-static {v0, v12, v13}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v12

    invoke-virtual {v4, v12, v13}, Lcom/thetransitapp/droid/model/RoutingItinerary;->setTransitDuration(J)V

    .line 192
    const-string v12, "walkTime"

    const-string v13, "0"

    move-object/from16 v0, p1

    invoke-static {v0, v12, v13}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v12

    invoke-virtual {v4, v12, v13}, Lcom/thetransitapp/droid/model/RoutingItinerary;->setWalkingDuration(J)V

    .line 193
    const-string v12, "waitingTime"

    const-string v13, "0"

    move-object/from16 v0, p1

    invoke-static {v0, v12, v13}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v12

    long-to-double v12, v12

    invoke-virtual {v4, v12, v13}, Lcom/thetransitapp/droid/model/RoutingItinerary;->setWaitingDuration(D)V

    .line 194
    const-string v12, "walkDistance"

    const-string v13, "0.0"

    move-object/from16 v0, p1

    invoke-static {v0, v12, v13}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v12

    invoke-virtual {v4, v12, v13}, Lcom/thetransitapp/droid/model/RoutingItinerary;->setWalkingDistance(D)V

    .line 197
    :try_start_0
    const-string v12, "legs"

    move-object/from16 v0, p1

    invoke-virtual {v0, v12}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v12

    if-eqz v12, :cond_0

    const-string v12, "legs"

    move-object/from16 v0, p1

    invoke-virtual {v0, v12}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v12

    const/4 v13, 0x0

    invoke-virtual {v12, v13}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_0

    .line 198
    const-string v12, "legs"

    move-object/from16 v0, p1

    invoke-virtual {v0, v12}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v1

    .line 199
    .local v1, "array":Lorg/json/JSONArray;
    const/4 v7, 0x0

    .line 201
    .local v7, "seq":I
    const/4 v3, 0x0

    .local v3, "i":I
    move v8, v7

    .end local v7    # "seq":I
    .local v8, "seq":I
    :goto_0
    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    move-result v12

    if-lt v3, v12, :cond_1

    .line 233
    .end local v1    # "array":Lorg/json/JSONArray;
    .end local v3    # "i":I
    .end local v8    # "seq":I
    :cond_0
    :goto_1
    return-object v4

    .line 202
    .restart local v1    # "array":Lorg/json/JSONArray;
    .restart local v3    # "i":I
    .restart local v8    # "seq":I
    :cond_1
    invoke-virtual {v1, v3}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v12

    move-object/from16 v0, p0

    invoke-direct {v0, v12}, Lcom/thetransitapp/droid/data/OnlinePlannerSource;->createRoutingLeg(Lorg/json/JSONObject;)Lcom/thetransitapp/droid/model/RoutingLeg;

    move-result-object v5

    .line 204
    .local v5, "leg":Lcom/thetransitapp/droid/model/RoutingLeg;
    invoke-virtual {v4}, Lcom/thetransitapp/droid/model/RoutingItinerary;->getLegs()Ljava/util/List;

    move-result-object v12

    invoke-interface {v12}, Ljava/util/List;->size()I

    move-result v12

    if-lez v12, :cond_2

    .line 205
    invoke-virtual {v4}, Lcom/thetransitapp/droid/model/RoutingItinerary;->getLegs()Ljava/util/List;

    move-result-object v12

    invoke-virtual {v4}, Lcom/thetransitapp/droid/model/RoutingItinerary;->getLegs()Ljava/util/List;

    move-result-object v13

    invoke-interface {v13}, Ljava/util/List;->size()I

    move-result v13

    add-int/lit8 v13, v13, -0x1

    invoke-interface {v12, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/thetransitapp/droid/model/RoutingLeg;

    .line 206
    .local v6, "previous":Lcom/thetransitapp/droid/model/RoutingLeg;
    invoke-virtual {v5}, Lcom/thetransitapp/droid/model/RoutingLeg;->getStartTime()Ljava/util/Date;

    move-result-object v12

    invoke-virtual {v12}, Ljava/util/Date;->getTime()J

    move-result-wide v12

    invoke-virtual {v6}, Lcom/thetransitapp/droid/model/RoutingLeg;->getEndTime()Ljava/util/Date;

    move-result-object v14

    invoke-virtual {v14}, Ljava/util/Date;->getTime()J

    move-result-wide v14

    sub-long v9, v12, v14

    .line 208
    .local v9, "wait":J
    invoke-virtual {v5}, Lcom/thetransitapp/droid/model/RoutingLeg;->getTransportationMode()Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;

    move-result-object v12

    sget-object v13, Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;->WALK:Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;

    if-ne v12, v13, :cond_3

    .line 209
    invoke-virtual {v5, v9, v10}, Lcom/thetransitapp/droid/model/RoutingLeg;->setWaitDuration(J)V

    .line 222
    .end local v6    # "previous":Lcom/thetransitapp/droid/model/RoutingLeg;
    .end local v9    # "wait":J
    :cond_2
    :goto_2
    invoke-virtual {v5}, Lcom/thetransitapp/droid/model/RoutingLeg;->getDistance()D

    move-result-wide v12

    const-wide/16 v14, 0x0

    cmpl-double v12, v12, v14

    if-lez v12, :cond_5

    .line 223
    add-int/lit8 v7, v8, 0x1

    .end local v8    # "seq":I
    .restart local v7    # "seq":I
    invoke-virtual {v5, v8}, Lcom/thetransitapp/droid/model/RoutingLeg;->setLegSequence(I)V

    .line 224
    invoke-virtual {v4}, Lcom/thetransitapp/droid/model/RoutingItinerary;->getLegs()Ljava/util/List;

    move-result-object v12

    invoke-interface {v12, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 201
    :goto_3
    add-int/lit8 v3, v3, 0x1

    move v8, v7

    .end local v7    # "seq":I
    .restart local v8    # "seq":I
    goto :goto_0

    .line 210
    .restart local v6    # "previous":Lcom/thetransitapp/droid/model/RoutingLeg;
    .restart local v9    # "wait":J
    :cond_3
    const-wide/32 v12, 0x1d4c0

    cmp-long v12, v9, v12

    if-lez v12, :cond_2

    .line 211
    invoke-virtual {v6}, Lcom/thetransitapp/droid/model/RoutingLeg;->getLegType()Lcom/thetransitapp/droid/model/RoutingLeg$LegType;

    move-result-object v12

    sget-object v13, Lcom/thetransitapp/droid/model/RoutingLeg$LegType;->WALK:Lcom/thetransitapp/droid/model/RoutingLeg$LegType;

    if-ne v12, v13, :cond_4

    .line 212
    invoke-virtual {v6, v9, v10}, Lcom/thetransitapp/droid/model/RoutingLeg;->setWaitDuration(J)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    .line 228
    .end local v1    # "array":Lorg/json/JSONArray;
    .end local v3    # "i":I
    .end local v5    # "leg":Lcom/thetransitapp/droid/model/RoutingLeg;
    .end local v6    # "previous":Lcom/thetransitapp/droid/model/RoutingLeg;
    .end local v8    # "seq":I
    .end local v9    # "wait":J
    :catch_0
    move-exception v2

    .line 230
    .local v2, "e":Lorg/json/JSONException;
    sget-object v12, Lcom/thetransitapp/droid/data/OnlinePlannerSource;->TAG:Ljava/lang/String;

    invoke-virtual {v2}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v13

    invoke-static {v12, v13}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_1

    .line 214
    .end local v2    # "e":Lorg/json/JSONException;
    .restart local v1    # "array":Lorg/json/JSONArray;
    .restart local v3    # "i":I
    .restart local v5    # "leg":Lcom/thetransitapp/droid/model/RoutingLeg;
    .restart local v6    # "previous":Lcom/thetransitapp/droid/model/RoutingLeg;
    .restart local v8    # "seq":I
    .restart local v9    # "wait":J
    :cond_4
    :try_start_1
    move-object/from16 v0, p0

    invoke-direct {v0, v6, v5}, Lcom/thetransitapp/droid/data/OnlinePlannerSource;->createWaitingLeg(Lcom/thetransitapp/droid/model/RoutingLeg;Lcom/thetransitapp/droid/model/RoutingLeg;)Lcom/thetransitapp/droid/model/RoutingLeg;

    move-result-object v11

    .line 216
    .local v11, "waitingLeg":Lcom/thetransitapp/droid/model/RoutingLeg;
    add-int/lit8 v7, v8, 0x1

    .end local v8    # "seq":I
    .restart local v7    # "seq":I
    invoke-virtual {v11, v8}, Lcom/thetransitapp/droid/model/RoutingLeg;->setLegSequence(I)V

    .line 217
    invoke-virtual {v4}, Lcom/thetransitapp/droid/model/RoutingItinerary;->getLegs()Ljava/util/List;

    move-result-object v12

    invoke-interface {v12, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    move v8, v7

    .end local v7    # "seq":I
    .restart local v8    # "seq":I
    goto :goto_2

    .end local v6    # "previous":Lcom/thetransitapp/droid/model/RoutingLeg;
    .end local v9    # "wait":J
    .end local v11    # "waitingLeg":Lcom/thetransitapp/droid/model/RoutingLeg;
    :cond_5
    move v7, v8

    .end local v8    # "seq":I
    .restart local v7    # "seq":I
    goto :goto_3
.end method

.method private createRoutingLeg(Lorg/json/JSONObject;)Lcom/thetransitapp/droid/model/RoutingLeg;
    .locals 26
    .param p1, "object"    # Lorg/json/JSONObject;

    .prologue
    .line 237
    new-instance v11, Lcom/thetransitapp/droid/model/RoutingLeg;

    invoke-direct {v11}, Lcom/thetransitapp/droid/model/RoutingLeg;-><init>()V

    .line 239
    .local v11, "leg":Lcom/thetransitapp/droid/model/RoutingLeg;
    const-string v22, "duration"

    const-string v23, "0"

    move-object/from16 v0, p1

    move-object/from16 v1, v22

    move-object/from16 v2, v23

    invoke-static {v0, v1, v2}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v22

    invoke-static/range {v22 .. v22}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v22

    move-wide/from16 v0, v22

    invoke-virtual {v11, v0, v1}, Lcom/thetransitapp/droid/model/RoutingLeg;->setDuration(J)V

    .line 241
    const-string v22, "startTime"

    const-string v23, "0"

    move-object/from16 v0, p1

    move-object/from16 v1, v22

    move-object/from16 v2, v23

    invoke-static {v0, v1, v2}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v22

    invoke-static/range {v22 .. v22}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v18

    .line 242
    .local v18, "start":J
    const-string v22, "endTime"

    const-string v23, "0"

    move-object/from16 v0, p1

    move-object/from16 v1, v22

    move-object/from16 v2, v23

    invoke-static {v0, v1, v2}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v22

    invoke-static/range {v22 .. v22}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v5

    .line 244
    .local v5, "end":J
    const-string v22, "duration"

    const-string v23, "0"

    move-object/from16 v0, p1

    move-object/from16 v1, v22

    move-object/from16 v2, v23

    invoke-static {v0, v1, v2}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v22

    invoke-static/range {v22 .. v22}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v22

    move-wide/from16 v0, v22

    invoke-virtual {v11, v0, v1}, Lcom/thetransitapp/droid/model/RoutingLeg;->setWaitDuration(J)V

    .line 245
    const-string v22, "duration"

    const-string v23, "0"

    move-object/from16 v0, p1

    move-object/from16 v1, v22

    move-object/from16 v2, v23

    invoke-static {v0, v1, v2}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v22

    invoke-static/range {v22 .. v22}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v22

    move-wide/from16 v0, v22

    invoke-virtual {v11, v0, v1}, Lcom/thetransitapp/droid/model/RoutingLeg;->setTotalDuration(J)V

    .line 246
    new-instance v22, Lcom/thetransitapp/droid/model/ScheduleItem;

    new-instance v23, Ljava/util/Date;

    move-object/from16 v0, v23

    move-wide/from16 v1, v18

    invoke-direct {v0, v1, v2}, Ljava/util/Date;-><init>(J)V

    invoke-direct/range {v22 .. v23}, Lcom/thetransitapp/droid/model/ScheduleItem;-><init>(Ljava/util/Date;)V

    move-object/from16 v0, v22

    invoke-virtual {v11, v0}, Lcom/thetransitapp/droid/model/RoutingLeg;->setStartScheduleItem(Lcom/thetransitapp/droid/model/ScheduleItem;)V

    .line 247
    new-instance v22, Lcom/thetransitapp/droid/model/ScheduleItem;

    new-instance v23, Ljava/util/Date;

    move-object/from16 v0, v23

    invoke-direct {v0, v5, v6}, Ljava/util/Date;-><init>(J)V

    invoke-direct/range {v22 .. v23}, Lcom/thetransitapp/droid/model/ScheduleItem;-><init>(Ljava/util/Date;)V

    move-object/from16 v0, v22

    invoke-virtual {v11, v0}, Lcom/thetransitapp/droid/model/RoutingLeg;->setEndScheduleItem(Lcom/thetransitapp/droid/model/ScheduleItem;)V

    .line 248
    const-string v22, "distance"

    const-string v23, "0.0"

    move-object/from16 v0, p1

    move-object/from16 v1, v22

    move-object/from16 v2, v23

    invoke-static {v0, v1, v2}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v22

    invoke-static/range {v22 .. v22}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v22

    move-wide/from16 v0, v22

    invoke-virtual {v11, v0, v1}, Lcom/thetransitapp/droid/model/RoutingLeg;->setDistance(D)V

    .line 250
    const-string v22, "mode"

    const/16 v23, 0x0

    move-object/from16 v0, p1

    move-object/from16 v1, v22

    move-object/from16 v2, v23

    invoke-static {v0, v1, v2}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v21

    .line 252
    .local v21, "transportationMode":Ljava/lang/String;
    if-eqz v21, :cond_0

    .line 253
    invoke-static {}, Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;->values()[Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;

    move-result-object v23

    move-object/from16 v0, v23

    array-length v0, v0

    move/from16 v24, v0

    const/16 v22, 0x0

    :goto_0
    move/from16 v0, v22

    move/from16 v1, v24

    if-lt v0, v1, :cond_6

    .line 260
    :cond_0
    invoke-static {}, Lcom/thetransitapp/droid/data/OnlinePlannerSource;->$SWITCH_TABLE$com$thetransitapp$droid$model$RoutingLeg$TransportationMode()[I

    move-result-object v22

    invoke-virtual {v11}, Lcom/thetransitapp/droid/model/RoutingLeg;->getTransportationMode()Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;

    move-result-object v23

    invoke-virtual/range {v23 .. v23}, Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;->ordinal()I

    move-result v23

    aget v22, v22, v23

    sparse-switch v22, :sswitch_data_0

    .line 275
    sget-object v22, Lcom/thetransitapp/droid/model/RoutingLeg$LegType;->TRANSIT:Lcom/thetransitapp/droid/model/RoutingLeg$LegType;

    move-object/from16 v0, v22

    invoke-virtual {v11, v0}, Lcom/thetransitapp/droid/model/RoutingLeg;->setLegType(Lcom/thetransitapp/droid/model/RoutingLeg$LegType;)V

    .line 277
    invoke-virtual {v11}, Lcom/thetransitapp/droid/model/RoutingLeg;->getTransportationMode()Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;

    move-result-object v22

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, v22

    invoke-direct {v0, v1, v2}, Lcom/thetransitapp/droid/data/OnlinePlannerSource;->createRoute(Lorg/json/JSONObject;Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;)Lcom/thetransitapp/droid/model/Route;

    move-result-object v17

    .line 278
    .local v17, "route":Lcom/thetransitapp/droid/model/Route;
    new-instance v22, Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;

    move-object/from16 v0, v22

    move-object/from16 v1, v17

    invoke-direct {v0, v1}, Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;-><init>(Lcom/thetransitapp/droid/model/Route;)V

    move-object/from16 v0, v22

    invoke-virtual {v11, v0}, Lcom/thetransitapp/droid/model/RoutingLeg;->setRoute(Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;)V

    .line 279
    invoke-virtual {v11}, Lcom/thetransitapp/droid/model/RoutingLeg;->getRoute()Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;

    move-result-object v22

    move-object/from16 v0, p0

    move-object/from16 v1, v17

    invoke-super {v0, v1}, Lcom/thetransitapp/droid/data/BaseOnlineSource;->getFeed(Lcom/thetransitapp/droid/model/Route;)Lcom/thetransitapp/droid/model/Feed;

    move-result-object v23

    invoke-virtual/range {v22 .. v23}, Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;->setFeed(Lcom/thetransitapp/droid/model/Feed;)V

    .line 282
    :try_start_0
    const-string v22, "intermediateStops"

    move-object/from16 v0, p1

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v22

    if-eqz v22, :cond_1

    const-string v22, "intermediateStops"

    move-object/from16 v0, p1

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v22

    const/16 v23, 0x0

    invoke-virtual/range {v22 .. v23}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v22

    if-nez v22, :cond_1

    .line 283
    const-string v22, "intermediateStops"

    move-object/from16 v0, p1

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v3

    .line 285
    .local v3, "array":Lorg/json/JSONArray;
    const/4 v8, 0x0

    .local v8, "i":I
    :goto_1
    invoke-virtual {v3}, Lorg/json/JSONArray;->length()I
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v22

    move/from16 v0, v22

    if-lt v8, v0, :cond_8

    .line 297
    .end local v3    # "array":Lorg/json/JSONArray;
    .end local v8    # "i":I
    .end local v17    # "route":Lcom/thetransitapp/droid/model/Route;
    :cond_1
    :goto_2
    const-string v22, "headsign"

    const/16 v23, 0x0

    move-object/from16 v0, p1

    move-object/from16 v1, v22

    move-object/from16 v2, v23

    invoke-static {v0, v1, v2}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v22

    move-object/from16 v0, v22

    invoke-virtual {v11, v0}, Lcom/thetransitapp/droid/model/RoutingLeg;->setHeadsign(Ljava/lang/String;)V

    .line 300
    :try_start_1
    const-string v22, "from"

    move-object/from16 v0, p1

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v22

    if-eqz v22, :cond_2

    const-string v22, "from"

    move-object/from16 v0, p1

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v22

    const/16 v23, 0x0

    invoke-virtual/range {v22 .. v23}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v22

    if-nez v22, :cond_2

    .line 301
    const-string v22, "from"

    move-object/from16 v0, p1

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v7

    .line 303
    .local v7, "from":Lorg/json/JSONObject;
    const-string v22, "lat"

    const-string v23, "0.0"

    move-object/from16 v0, v22

    move-object/from16 v1, v23

    invoke-static {v7, v0, v1}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v22

    invoke-static/range {v22 .. v22}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v9

    .line 304
    .local v9, "latitude":D
    const-string v22, "lon"

    const-string v23, "0.0"

    move-object/from16 v0, v22

    move-object/from16 v1, v23

    invoke-static {v7, v0, v1}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v22

    invoke-static/range {v22 .. v22}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v12

    .line 306
    .local v12, "longitude":D
    new-instance v15, Lcom/thetransitapp/droid/model/SimplePlacemark;

    invoke-direct {v15, v9, v10, v12, v13}, Lcom/thetransitapp/droid/model/SimplePlacemark;-><init>(DD)V

    .line 307
    .local v15, "placemark":Lcom/thetransitapp/droid/model/SimplePlacemark;
    const-string v22, "name"

    const/16 v23, 0x0

    move-object/from16 v0, v22

    move-object/from16 v1, v23

    invoke-static {v7, v0, v1}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v22

    move-object/from16 v0, v22

    invoke-virtual {v15, v0}, Lcom/thetransitapp/droid/model/SimplePlacemark;->setName(Ljava/lang/String;)V

    .line 309
    invoke-virtual {v11, v15}, Lcom/thetransitapp/droid/model/RoutingLeg;->setFromPlacemark(Lcom/thetransitapp/droid/model/SimplePlacemark;)V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    .line 317
    .end local v7    # "from":Lorg/json/JSONObject;
    .end local v9    # "latitude":D
    .end local v12    # "longitude":D
    .end local v15    # "placemark":Lcom/thetransitapp/droid/model/SimplePlacemark;
    :cond_2
    :goto_3
    :try_start_2
    const-string v22, "to"

    move-object/from16 v0, p1

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v22

    if-eqz v22, :cond_3

    const-string v22, "to"

    move-object/from16 v0, p1

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v22

    const/16 v23, 0x0

    invoke-virtual/range {v22 .. v23}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v22

    if-nez v22, :cond_3

    .line 318
    const-string v22, "to"

    move-object/from16 v0, p1

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v20

    .line 320
    .local v20, "to":Lorg/json/JSONObject;
    const-string v22, "lat"

    const-string v23, "0.0"

    move-object/from16 v0, v20

    move-object/from16 v1, v22

    move-object/from16 v2, v23

    invoke-static {v0, v1, v2}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v22

    invoke-static/range {v22 .. v22}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v9

    .line 321
    .restart local v9    # "latitude":D
    const-string v22, "lon"

    const-string v23, "0.0"

    move-object/from16 v0, v20

    move-object/from16 v1, v22

    move-object/from16 v2, v23

    invoke-static {v0, v1, v2}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v22

    invoke-static/range {v22 .. v22}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v12

    .line 323
    .restart local v12    # "longitude":D
    new-instance v15, Lcom/thetransitapp/droid/model/SimplePlacemark;

    invoke-direct {v15, v9, v10, v12, v13}, Lcom/thetransitapp/droid/model/SimplePlacemark;-><init>(DD)V

    .line 324
    .restart local v15    # "placemark":Lcom/thetransitapp/droid/model/SimplePlacemark;
    const-string v22, "name"

    const/16 v23, 0x0

    move-object/from16 v0, v20

    move-object/from16 v1, v22

    move-object/from16 v2, v23

    invoke-static {v0, v1, v2}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v22

    move-object/from16 v0, v22

    invoke-virtual {v15, v0}, Lcom/thetransitapp/droid/model/SimplePlacemark;->setName(Ljava/lang/String;)V

    .line 326
    invoke-virtual {v11, v15}, Lcom/thetransitapp/droid/model/RoutingLeg;->setToPlacemark(Lcom/thetransitapp/droid/model/SimplePlacemark;)V
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_2

    .line 334
    .end local v9    # "latitude":D
    .end local v12    # "longitude":D
    .end local v15    # "placemark":Lcom/thetransitapp/droid/model/SimplePlacemark;
    .end local v20    # "to":Lorg/json/JSONObject;
    :cond_3
    :goto_4
    :try_start_3
    const-string v22, "previousStop"

    move-object/from16 v0, p1

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v22

    if-eqz v22, :cond_4

    const-string v22, "previousStop"

    move-object/from16 v0, p1

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v22

    const/16 v23, 0x0

    invoke-virtual/range {v22 .. v23}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v22

    if-nez v22, :cond_4

    .line 335
    const-string v22, "previousStop"

    move-object/from16 v0, p1

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v16

    .line 337
    .local v16, "previous":Lorg/json/JSONObject;
    const-string v22, "latitude"

    .line 338
    const-string v23, "0.0"

    .line 337
    move-object/from16 v0, v16

    move-object/from16 v1, v22

    move-object/from16 v2, v23

    invoke-static {v0, v1, v2}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v22

    invoke-static/range {v22 .. v22}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v22

    move-wide/from16 v0, v22

    invoke-virtual {v11, v0, v1}, Lcom/thetransitapp/droid/model/RoutingLeg;->setPreviousStopLatitude(D)V

    .line 339
    const-string v22, "longitude"

    .line 340
    const-string v23, "0.0"

    .line 339
    move-object/from16 v0, v16

    move-object/from16 v1, v22

    move-object/from16 v2, v23

    invoke-static {v0, v1, v2}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v22

    invoke-static/range {v22 .. v22}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v22

    move-wide/from16 v0, v22

    invoke-virtual {v11, v0, v1}, Lcom/thetransitapp/droid/model/RoutingLeg;->setPreviousStopLongitude(D)V
    :try_end_3
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_3

    .line 347
    .end local v16    # "previous":Lorg/json/JSONObject;
    :cond_4
    :goto_5
    const-string v22, "walkDistance"

    const/16 v23, 0x0

    move-object/from16 v0, p1

    move-object/from16 v1, v22

    move-object/from16 v2, v23

    invoke-static {v0, v1, v2}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v22

    move-object/from16 v0, v22

    invoke-virtual {v11, v0}, Lcom/thetransitapp/droid/model/RoutingLeg;->setStepTitle(Ljava/lang/String;)V

    .line 348
    const-string v22, "walkDistance"

    const/16 v23, 0x0

    move-object/from16 v0, p1

    move-object/from16 v1, v22

    move-object/from16 v2, v23

    invoke-static {v0, v1, v2}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v22

    move-object/from16 v0, v22

    invoke-virtual {v11, v0}, Lcom/thetransitapp/droid/model/RoutingLeg;->setStepSubtitle(Ljava/lang/String;)V

    .line 349
    const-string v22, "walkDistance"

    const/16 v23, 0x0

    move-object/from16 v0, p1

    move-object/from16 v1, v22

    move-object/from16 v2, v23

    invoke-static {v0, v1, v2}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v22

    move-object/from16 v0, v22

    invoke-virtual {v11, v0}, Lcom/thetransitapp/droid/model/RoutingLeg;->setStepTimeString(Ljava/lang/String;)V

    .line 351
    new-instance v22, Ljava/lang/StringBuilder;

    const-string v23, "#"

    invoke-direct/range {v22 .. v23}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v23, "routeColor"

    const-string v24, "000000"

    move-object/from16 v0, p1

    move-object/from16 v1, v23

    move-object/from16 v2, v24

    invoke-static {v0, v1, v2}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v23

    invoke-virtual/range {v22 .. v23}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v22

    invoke-virtual/range {v22 .. v22}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v22

    invoke-static/range {v22 .. v22}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v22

    move/from16 v0, v22

    invoke-virtual {v11, v0}, Lcom/thetransitapp/droid/model/RoutingLeg;->setTimeBarColor(I)V

    .line 357
    :try_start_4
    const-string v22, "legGeometry"

    move-object/from16 v0, p1

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v22

    if-eqz v22, :cond_5

    const-string v22, "legGeometry"

    move-object/from16 v0, p1

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v22

    const/16 v23, 0x0

    invoke-virtual/range {v22 .. v23}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v22

    if-nez v22, :cond_5

    .line 358
    const-string v22, "legGeometry"

    move-object/from16 v0, p1

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v22

    const-string v23, "points"

    const/16 v24, 0x0

    invoke-static/range {v22 .. v24}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v22

    move-object/from16 v0, v22

    invoke-virtual {v11, v0}, Lcom/thetransitapp/droid/model/RoutingLeg;->setShape(Ljava/lang/String;)V
    :try_end_4
    .catch Lorg/json/JSONException; {:try_start_4 .. :try_end_4} :catch_4

    .line 365
    :cond_5
    :goto_6
    return-object v11

    .line 253
    :cond_6
    aget-object v14, v23, v22

    .line 254
    .local v14, "mode":Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;
    invoke-virtual {v14}, Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;->toString()Ljava/lang/String;

    move-result-object v25

    move-object/from16 v0, v25

    move-object/from16 v1, v21

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v25

    if-eqz v25, :cond_7

    .line 255
    invoke-virtual {v11, v14}, Lcom/thetransitapp/droid/model/RoutingLeg;->setTransportationMode(Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;)V

    .line 253
    :cond_7
    add-int/lit8 v22, v22, 0x1

    goto/16 :goto_0

    .line 266
    .end local v14    # "mode":Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;
    :sswitch_0
    sget-object v22, Lcom/thetransitapp/droid/model/RoutingLeg$LegType;->WALK:Lcom/thetransitapp/droid/model/RoutingLeg$LegType;

    move-object/from16 v0, v22

    invoke-virtual {v11, v0}, Lcom/thetransitapp/droid/model/RoutingLeg;->setLegType(Lcom/thetransitapp/droid/model/RoutingLeg$LegType;)V

    .line 267
    sget-object v22, Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;->WALK:Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;

    move-object/from16 v0, v22

    invoke-virtual {v11, v0}, Lcom/thetransitapp/droid/model/RoutingLeg;->setTransportationMode(Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;)V

    goto/16 :goto_2

    .line 271
    :sswitch_1
    sget-object v22, Lcom/thetransitapp/droid/model/RoutingLeg$LegType;->WAIT:Lcom/thetransitapp/droid/model/RoutingLeg$LegType;

    move-object/from16 v0, v22

    invoke-virtual {v11, v0}, Lcom/thetransitapp/droid/model/RoutingLeg;->setLegType(Lcom/thetransitapp/droid/model/RoutingLeg$LegType;)V

    goto/16 :goto_2

    .line 286
    .restart local v3    # "array":Lorg/json/JSONArray;
    .restart local v8    # "i":I
    .restart local v17    # "route":Lcom/thetransitapp/droid/model/Route;
    :cond_8
    :try_start_5
    invoke-virtual {v11}, Lcom/thetransitapp/droid/model/RoutingLeg;->getIntermediateStops()Ljava/util/List;

    move-result-object v22

    invoke-virtual {v3, v8}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v23

    move-object/from16 v0, p0

    move-object/from16 v1, v23

    invoke-direct {v0, v1}, Lcom/thetransitapp/droid/data/OnlinePlannerSource;->createStop(Lorg/json/JSONObject;)Lcom/thetransitapp/droid/model/Stop;

    move-result-object v23

    invoke-interface/range {v22 .. v23}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_5
    .catch Lorg/json/JSONException; {:try_start_5 .. :try_end_5} :catch_0

    .line 285
    add-int/lit8 v8, v8, 0x1

    goto/16 :goto_1

    .line 289
    .end local v3    # "array":Lorg/json/JSONArray;
    .end local v8    # "i":I
    :catch_0
    move-exception v4

    .line 291
    .local v4, "e":Lorg/json/JSONException;
    sget-object v22, Lcom/thetransitapp/droid/data/OnlinePlannerSource;->TAG:Ljava/lang/String;

    invoke-virtual {v4}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v23

    invoke-static/range {v22 .. v23}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto/16 :goto_2

    .line 311
    .end local v4    # "e":Lorg/json/JSONException;
    .end local v17    # "route":Lcom/thetransitapp/droid/model/Route;
    :catch_1
    move-exception v4

    .line 313
    .restart local v4    # "e":Lorg/json/JSONException;
    sget-object v22, Lcom/thetransitapp/droid/data/OnlinePlannerSource;->TAG:Ljava/lang/String;

    invoke-virtual {v4}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v23

    invoke-static/range {v22 .. v23}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto/16 :goto_3

    .line 328
    .end local v4    # "e":Lorg/json/JSONException;
    :catch_2
    move-exception v4

    .line 330
    .restart local v4    # "e":Lorg/json/JSONException;
    sget-object v22, Lcom/thetransitapp/droid/data/OnlinePlannerSource;->TAG:Ljava/lang/String;

    invoke-virtual {v4}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v23

    invoke-static/range {v22 .. v23}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto/16 :goto_4

    .line 342
    .end local v4    # "e":Lorg/json/JSONException;
    :catch_3
    move-exception v4

    .line 344
    .restart local v4    # "e":Lorg/json/JSONException;
    sget-object v22, Lcom/thetransitapp/droid/data/OnlinePlannerSource;->TAG:Ljava/lang/String;

    invoke-virtual {v4}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v23

    invoke-static/range {v22 .. v23}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto/16 :goto_5

    .line 360
    .end local v4    # "e":Lorg/json/JSONException;
    :catch_4
    move-exception v4

    .line 362
    .restart local v4    # "e":Lorg/json/JSONException;
    sget-object v22, Lcom/thetransitapp/droid/data/OnlinePlannerSource;->TAG:Ljava/lang/String;

    invoke-virtual {v4}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v23

    invoke-static/range {v22 .. v23}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto/16 :goto_6

    .line 260
    nop

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_1
        0x2 -> :sswitch_0
        0x10 -> :sswitch_0
        0x11 -> :sswitch_0
        0x12 -> :sswitch_0
        0x13 -> :sswitch_0
    .end sparse-switch
.end method

.method private createStop(Lorg/json/JSONObject;)Lcom/thetransitapp/droid/model/Stop;
    .locals 9
    .param p1, "object"    # Lorg/json/JSONObject;

    .prologue
    const/4 v8, 0x0

    .line 388
    new-instance v5, Lcom/thetransitapp/droid/model/Stop;

    invoke-direct {v5}, Lcom/thetransitapp/droid/model/Stop;-><init>()V

    .line 389
    .local v5, "stop":Lcom/thetransitapp/droid/model/Stop;
    const-string v6, "name"

    invoke-static {p1, v6, v8}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Lcom/thetransitapp/droid/model/Stop;->setName(Ljava/lang/String;)V

    .line 391
    const-string v6, "lat"

    const-string v7, "0.0"

    invoke-static {p1, v6, v7}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0

    .line 392
    .local v0, "latitude":D
    const-string v6, "lon"

    const-string v7, "0.0"

    invoke-static {p1, v6, v7}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v2

    .line 394
    .local v2, "longitude":D
    new-instance v4, Lcom/thetransitapp/droid/model/SimplePlacemark;

    invoke-direct {v4, v0, v1, v2, v3}, Lcom/thetransitapp/droid/model/SimplePlacemark;-><init>(DD)V

    .line 395
    .local v4, "placemark":Lcom/thetransitapp/droid/model/SimplePlacemark;
    const-string v6, "name"

    invoke-static {p1, v6, v8}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Lcom/thetransitapp/droid/model/SimplePlacemark;->setName(Ljava/lang/String;)V

    .line 396
    invoke-virtual {v5, v4}, Lcom/thetransitapp/droid/model/Stop;->setPlacemark(Lcom/thetransitapp/droid/model/SimplePlacemark;)V

    .line 398
    return-object v5
.end method

.method private createWaitingLeg(Lcom/thetransitapp/droid/model/RoutingLeg;Lcom/thetransitapp/droid/model/RoutingLeg;)Lcom/thetransitapp/droid/model/RoutingLeg;
    .locals 5
    .param p1, "previous"    # Lcom/thetransitapp/droid/model/RoutingLeg;
    .param p2, "leg"    # Lcom/thetransitapp/droid/model/RoutingLeg;

    .prologue
    .line 402
    new-instance v0, Lcom/thetransitapp/droid/model/RoutingLeg;

    invoke-direct {v0}, Lcom/thetransitapp/droid/model/RoutingLeg;-><init>()V

    .line 403
    .local v0, "waitingLeg":Lcom/thetransitapp/droid/model/RoutingLeg;
    sget-object v1, Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;->WAIT:Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;

    invoke-virtual {v0, v1}, Lcom/thetransitapp/droid/model/RoutingLeg;->setTransportationMode(Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;)V

    .line 404
    sget-object v1, Lcom/thetransitapp/droid/model/RoutingLeg$LegType;->WAIT:Lcom/thetransitapp/droid/model/RoutingLeg$LegType;

    invoke-virtual {v0, v1}, Lcom/thetransitapp/droid/model/RoutingLeg;->setLegType(Lcom/thetransitapp/droid/model/RoutingLeg$LegType;)V

    .line 405
    new-instance v1, Lcom/thetransitapp/droid/model/ScheduleItem;

    invoke-virtual {p1}, Lcom/thetransitapp/droid/model/RoutingLeg;->getEndTime()Ljava/util/Date;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/thetransitapp/droid/model/ScheduleItem;-><init>(Ljava/util/Date;)V

    invoke-virtual {v0, v1}, Lcom/thetransitapp/droid/model/RoutingLeg;->setEndScheduleItem(Lcom/thetransitapp/droid/model/ScheduleItem;)V

    .line 406
    invoke-virtual {p2}, Lcom/thetransitapp/droid/model/RoutingLeg;->getStartTime()Ljava/util/Date;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/Date;->getTime()J

    move-result-wide v1

    invoke-virtual {p1}, Lcom/thetransitapp/droid/model/RoutingLeg;->getEndTime()Ljava/util/Date;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/Date;->getTime()J

    move-result-wide v3

    sub-long/2addr v1, v3

    invoke-virtual {v0, v1, v2}, Lcom/thetransitapp/droid/model/RoutingLeg;->setWaitDuration(J)V

    .line 407
    new-instance v1, Lcom/thetransitapp/droid/model/ScheduleItem;

    invoke-virtual {p2}, Lcom/thetransitapp/droid/model/RoutingLeg;->getStartTime()Ljava/util/Date;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/thetransitapp/droid/model/ScheduleItem;-><init>(Ljava/util/Date;)V

    invoke-virtual {v0, v1}, Lcom/thetransitapp/droid/model/RoutingLeg;->setEndScheduleItem(Lcom/thetransitapp/droid/model/ScheduleItem;)V

    .line 409
    return-object v0
.end method

.method private getBaseURL(Lcom/google/android/gms/maps/model/LatLng;)Ljava/lang/String;
    .locals 2
    .param p1, "coor"    # Lcom/google/android/gms/maps/model/LatLng;

    .prologue
    .line 140
    new-instance v0, Ljava/lang/StringBuilder;

    const/4 v1, 0x1

    invoke-super {p0, v1, p1}, Lcom/thetransitapp/droid/data/BaseOnlineSource;->getBaseURL(ZLcom/google/android/gms/maps/model/LatLng;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v1, "/opentripplanner-api-webapp/ws"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private parseItineraries(Lorg/json/JSONObject;Lcom/thetransitapp/droid/model/SimplePlacemark;Lcom/thetransitapp/droid/model/SimplePlacemark;)Ljava/util/List;
    .locals 10
    .param p1, "object"    # Lorg/json/JSONObject;
    .param p2, "start"    # Lcom/thetransitapp/droid/model/SimplePlacemark;
    .param p3, "stop"    # Lcom/thetransitapp/droid/model/SimplePlacemark;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONObject;",
            "Lcom/thetransitapp/droid/model/SimplePlacemark;",
            "Lcom/thetransitapp/droid/model/SimplePlacemark;",
            ")",
            "Ljava/util/List",
            "<",
            "Lcom/thetransitapp/droid/model/RoutingItinerary;",
            ">;"
        }
    .end annotation

    .prologue
    const/4 v7, 0x0

    .line 145
    :try_start_0
    const-string v8, "plan"

    invoke-virtual {p1, v8}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_1

    .line 146
    const-string v8, "plan"

    invoke-virtual {p1, v8}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v6

    .line 148
    .local v6, "plan":Lorg/json/JSONObject;
    const-string v8, "itineraries"

    invoke-virtual {v6, v8}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_1

    const-string v8, "itineraries"

    invoke-virtual {v6, v8}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v8

    const/4 v9, 0x0

    invoke-virtual {v8, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_1

    .line 149
    const-string v8, "itineraries"

    invoke-virtual {v6, v8}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v0

    .line 150
    .local v0, "array":Lorg/json/JSONArray;
    new-instance v3, Ljava/util/ArrayList;

    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    move-result v8

    invoke-direct {v3, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 153
    .local v3, "itineraries":Ljava/util/List;, "Ljava/util/List<Lcom/thetransitapp/droid/model/RoutingItinerary;>;"
    const/4 v2, 0x0

    .local v2, "i":I
    :goto_0
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    move-result v8

    if-lt v2, v8, :cond_0

    .line 180
    .end local v0    # "array":Lorg/json/JSONArray;
    .end local v2    # "i":I
    .end local v3    # "itineraries":Ljava/util/List;, "Ljava/util/List<Lcom/thetransitapp/droid/model/RoutingItinerary;>;"
    .end local v6    # "plan":Lorg/json/JSONObject;
    :goto_1
    return-object v3

    .line 154
    .restart local v0    # "array":Lorg/json/JSONArray;
    .restart local v2    # "i":I
    .restart local v3    # "itineraries":Ljava/util/List;, "Ljava/util/List<Lcom/thetransitapp/droid/model/RoutingItinerary;>;"
    .restart local v6    # "plan":Lorg/json/JSONObject;
    :cond_0
    invoke-virtual {v0, v2}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v8

    invoke-direct {p0, v8}, Lcom/thetransitapp/droid/data/OnlinePlannerSource;->createRoutingItinerary(Lorg/json/JSONObject;)Lcom/thetransitapp/droid/model/RoutingItinerary;

    move-result-object v4

    .line 155
    .local v4, "itinerary":Lcom/thetransitapp/droid/model/RoutingItinerary;
    invoke-virtual {v4, v2}, Lcom/thetransitapp/droid/model/RoutingItinerary;->setItineraryIndex(I)V

    .line 157
    new-instance v5, Lcom/thetransitapp/droid/model/RoutingLeg;

    invoke-direct {v5}, Lcom/thetransitapp/droid/model/RoutingLeg;-><init>()V

    .line 158
    .local v5, "leg":Lcom/thetransitapp/droid/model/RoutingLeg;
    sget-object v8, Lcom/thetransitapp/droid/model/RoutingLeg$LegType;->START:Lcom/thetransitapp/droid/model/RoutingLeg$LegType;

    invoke-virtual {v5, v8}, Lcom/thetransitapp/droid/model/RoutingLeg;->setLegType(Lcom/thetransitapp/droid/model/RoutingLeg$LegType;)V

    .line 159
    invoke-virtual {v5, p2}, Lcom/thetransitapp/droid/model/RoutingLeg;->setFromPlacemark(Lcom/thetransitapp/droid/model/SimplePlacemark;)V

    .line 160
    new-instance v8, Lcom/thetransitapp/droid/model/ScheduleItem;

    invoke-virtual {v4}, Lcom/thetransitapp/droid/model/RoutingItinerary;->getStartTime()Ljava/util/Date;

    move-result-object v9

    invoke-direct {v8, v9}, Lcom/thetransitapp/droid/model/ScheduleItem;-><init>(Ljava/util/Date;)V

    invoke-virtual {v5, v8}, Lcom/thetransitapp/droid/model/RoutingLeg;->setStartScheduleItem(Lcom/thetransitapp/droid/model/ScheduleItem;)V

    .line 161
    invoke-virtual {v4}, Lcom/thetransitapp/droid/model/RoutingItinerary;->getLegs()Ljava/util/List;

    move-result-object v8

    const/4 v9, 0x0

    invoke-interface {v8, v9, v5}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 163
    new-instance v5, Lcom/thetransitapp/droid/model/RoutingLeg;

    .end local v5    # "leg":Lcom/thetransitapp/droid/model/RoutingLeg;
    invoke-direct {v5}, Lcom/thetransitapp/droid/model/RoutingLeg;-><init>()V

    .line 164
    .restart local v5    # "leg":Lcom/thetransitapp/droid/model/RoutingLeg;
    sget-object v8, Lcom/thetransitapp/droid/model/RoutingLeg$LegType;->END:Lcom/thetransitapp/droid/model/RoutingLeg$LegType;

    invoke-virtual {v5, v8}, Lcom/thetransitapp/droid/model/RoutingLeg;->setLegType(Lcom/thetransitapp/droid/model/RoutingLeg$LegType;)V

    .line 165
    invoke-virtual {v5, p3}, Lcom/thetransitapp/droid/model/RoutingLeg;->setToPlacemark(Lcom/thetransitapp/droid/model/SimplePlacemark;)V

    .line 166
    new-instance v8, Lcom/thetransitapp/droid/model/ScheduleItem;

    invoke-virtual {v4}, Lcom/thetransitapp/droid/model/RoutingItinerary;->getEndTime()Ljava/util/Date;

    move-result-object v9

    invoke-direct {v8, v9}, Lcom/thetransitapp/droid/model/ScheduleItem;-><init>(Ljava/util/Date;)V

    invoke-virtual {v5, v8}, Lcom/thetransitapp/droid/model/RoutingLeg;->setEndScheduleItem(Lcom/thetransitapp/droid/model/ScheduleItem;)V

    .line 167
    invoke-virtual {v4}, Lcom/thetransitapp/droid/model/RoutingItinerary;->getLegs()Ljava/util/List;

    move-result-object v8

    invoke-interface {v8, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 169
    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 153
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 175
    .end local v0    # "array":Lorg/json/JSONArray;
    .end local v2    # "i":I
    .end local v3    # "itineraries":Ljava/util/List;, "Ljava/util/List<Lcom/thetransitapp/droid/model/RoutingItinerary;>;"
    .end local v4    # "itinerary":Lcom/thetransitapp/droid/model/RoutingItinerary;
    .end local v5    # "leg":Lcom/thetransitapp/droid/model/RoutingLeg;
    .end local v6    # "plan":Lorg/json/JSONObject;
    :catch_0
    move-exception v1

    .line 177
    .local v1, "e":Lorg/json/JSONException;
    sget-object v8, Lcom/thetransitapp/droid/data/OnlinePlannerSource;->TAG:Ljava/lang/String;

    invoke-virtual {v1}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v9

    invoke-static {v8, v9}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .end local v1    # "e":Lorg/json/JSONException;
    :cond_1
    move-object v3, v7

    .line 180
    goto :goto_1
.end method


# virtual methods
.method public fetchRoutingItineraries(Lcom/thetransitapp/droid/model/RoutingRequest;)Lcom/thetransitapp/droid/model/RoutingRequest;
    .locals 17
    .param p1, "request"    # Lcom/thetransitapp/droid/model/RoutingRequest;
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "SimpleDateFormat"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .prologue
    .line 55
    new-instance v4, Ljava/lang/StringBuilder;

    new-instance v12, Lcom/google/android/gms/maps/model/LatLng;

    invoke-virtual/range {p1 .. p1}, Lcom/thetransitapp/droid/model/RoutingRequest;->getStart()Lcom/thetransitapp/droid/model/SimplePlacemark;

    move-result-object v13

    invoke-virtual {v13}, Lcom/thetransitapp/droid/model/SimplePlacemark;->getLatitude()D

    move-result-wide v13

    .line 56
    invoke-virtual/range {p1 .. p1}, Lcom/thetransitapp/droid/model/RoutingRequest;->getStart()Lcom/thetransitapp/droid/model/SimplePlacemark;

    move-result-object v15

    invoke-virtual {v15}, Lcom/thetransitapp/droid/model/SimplePlacemark;->getLongitude()D

    move-result-wide v15

    invoke-direct/range {v12 .. v16}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    .line 55
    move-object/from16 v0, p0

    invoke-direct {v0, v12}, Lcom/thetransitapp/droid/data/OnlinePlannerSource;->getBaseURL(Lcom/google/android/gms/maps/model/LatLng;)Ljava/lang/String;

    move-result-object v12

    invoke-direct {v4, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 57
    .local v4, "builder":Ljava/lang/StringBuilder;
    const-string v12, "/plan?fromPlace="

    invoke-virtual {v4, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    invoke-virtual/range {p1 .. p1}, Lcom/thetransitapp/droid/model/RoutingRequest;->getStart()Lcom/thetransitapp/droid/model/SimplePlacemark;

    move-result-object v12

    invoke-virtual {v12}, Lcom/thetransitapp/droid/model/SimplePlacemark;->getLatitude()D

    move-result-wide v12

    invoke-virtual {v4, v12, v13}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 59
    const-string v12, ","

    const-string v13, "UTF-8"

    invoke-static {v12, v13}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v4, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    invoke-virtual/range {p1 .. p1}, Lcom/thetransitapp/droid/model/RoutingRequest;->getStart()Lcom/thetransitapp/droid/model/SimplePlacemark;

    move-result-object v12

    invoke-virtual {v12}, Lcom/thetransitapp/droid/model/SimplePlacemark;->getLongitude()D

    move-result-wide v12

    invoke-virtual {v4, v12, v13}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 61
    const-string v12, "&toPlace="

    invoke-virtual {v4, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    invoke-virtual/range {p1 .. p1}, Lcom/thetransitapp/droid/model/RoutingRequest;->getEnd()Lcom/thetransitapp/droid/model/SimplePlacemark;

    move-result-object v12

    invoke-virtual {v12}, Lcom/thetransitapp/droid/model/SimplePlacemark;->getLatitude()D

    move-result-wide v12

    invoke-virtual {v4, v12, v13}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 63
    const-string v12, ","

    const-string v13, "UTF-8"

    invoke-static {v12, v13}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v4, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    invoke-virtual/range {p1 .. p1}, Lcom/thetransitapp/droid/model/RoutingRequest;->getEnd()Lcom/thetransitapp/droid/model/SimplePlacemark;

    move-result-object v12

    invoke-virtual {v12}, Lcom/thetransitapp/droid/model/SimplePlacemark;->getLongitude()D

    move-result-wide v12

    invoke-virtual {v4, v12, v13}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 65
    const-string v12, "&showIntermediateStops=true"

    invoke-virtual {v4, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    const-string v12, "&arriveBy="

    invoke-virtual {v4, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    invoke-virtual/range {p1 .. p1}, Lcom/thetransitapp/droid/model/RoutingRequest;->isArriveBy()Z

    move-result v12

    if-eqz v12, :cond_3

    const-string v12, "true"

    :goto_0
    invoke-virtual {v4, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    const-string v12, "&date="

    invoke-virtual {v4, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    new-instance v12, Ljava/text/SimpleDateFormat;

    const-string v13, "MM/dd/yyyy"

    invoke-direct {v12, v13}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, Lcom/thetransitapp/droid/model/RoutingRequest;->getDate()Ljava/util/Date;

    move-result-object v13

    invoke-virtual {v12, v13}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v12

    const-string v13, "UTF-8"

    invoke-static {v12, v13}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v4, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    const-string v12, "&time="

    invoke-virtual {v4, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    new-instance v12, Ljava/text/SimpleDateFormat;

    const-string v13, "HH:mm"

    invoke-direct {v12, v13}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, Lcom/thetransitapp/droid/model/RoutingRequest;->getDate()Ljava/util/Date;

    move-result-object v13

    invoke-virtual {v12, v13}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v12

    const-string v13, "UTF-8"

    invoke-static {v12, v13}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v4, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    new-instance v9, Landroid/location/Location;

    const-string v12, "Transit"

    invoke-direct {v9, v12}, Landroid/location/Location;-><init>(Ljava/lang/String;)V

    .line 74
    .local v9, "requestLocation":Landroid/location/Location;
    invoke-virtual/range {p1 .. p1}, Lcom/thetransitapp/droid/model/RoutingRequest;->getStart()Lcom/thetransitapp/droid/model/SimplePlacemark;

    move-result-object v12

    invoke-virtual {v12}, Lcom/thetransitapp/droid/model/SimplePlacemark;->getLatitude()D

    move-result-wide v12

    invoke-virtual {v9, v12, v13}, Landroid/location/Location;->setLatitude(D)V

    .line 75
    invoke-virtual/range {p1 .. p1}, Lcom/thetransitapp/droid/model/RoutingRequest;->getEnd()Lcom/thetransitapp/droid/model/SimplePlacemark;

    move-result-object v12

    invoke-virtual {v12}, Lcom/thetransitapp/droid/model/SimplePlacemark;->getLongitude()D

    move-result-wide v12

    invoke-virtual {v9, v12, v13}, Landroid/location/Location;->setLongitude(D)V

    .line 76
    move-object/from16 v0, p0

    iget-object v12, v0, Lcom/thetransitapp/droid/data/OnlinePlannerSource;->feedManager:Lcom/thetransitapp/droid/controller/FeedManager;

    invoke-virtual {v12, v9}, Lcom/thetransitapp/droid/controller/FeedManager;->closestBundleToLocation(Landroid/location/Location;)Lcom/thetransitapp/droid/model/TransitBundle;

    move-result-object v5

    .line 78
    .local v5, "bundle":Lcom/thetransitapp/droid/model/TransitBundle;
    const-string v12, "&routerId="

    invoke-virtual {v4, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    if-eqz v5, :cond_4

    invoke-virtual {v5}, Lcom/thetransitapp/droid/model/TransitBundle;->getServer()Lcom/thetransitapp/droid/model/TransitServer;

    move-result-object v12

    if-eqz v12, :cond_4

    .line 81
    invoke-virtual {v5}, Lcom/thetransitapp/droid/model/TransitBundle;->getServer()Lcom/thetransitapp/droid/model/TransitServer;

    move-result-object v12

    invoke-virtual {v12}, Lcom/thetransitapp/droid/model/TransitServer;->getRouterId()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v4, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    :goto_1
    const/4 v12, 0x0

    move-object/from16 v0, p0

    invoke-super {v0, v12}, Lcom/thetransitapp/droid/data/BaseOnlineSource;->getBannedTransitParameters(Z)Ljava/lang/String;

    move-result-object v3

    .line 88
    .local v3, "banned":Ljava/lang/String;
    if-eqz v3, :cond_0

    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    move-result v12

    if-nez v12, :cond_0

    .line 89
    const-string v12, "&"

    invoke-virtual {v4, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    :cond_0
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    .line 94
    .local v11, "url":Ljava/lang/String;
    move-object/from16 v0, p0

    iget-object v12, v0, Lcom/thetransitapp/droid/data/OnlinePlannerSource;->databaseHelper:Lcom/thetransitapp/droid/data/TransitDatabaseHelper;

    const-string v13, "LAST_PLAN_FETCH_KEY"

    invoke-virtual {v12, v13}, Lcom/thetransitapp/droid/data/TransitDatabaseHelper;->getCache(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 97
    .local v2, "URLsString":Ljava/lang/String;
    if-nez v2, :cond_5

    .line 98
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 103
    .local v1, "URLs":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    :goto_2
    invoke-virtual {v1, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 105
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v12

    const/4 v13, 0x5

    if-le v12, v13, :cond_1

    .line 106
    const/4 v12, 0x0

    invoke-virtual {v1, v12}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 109
    :cond_1
    move-object/from16 v0, p0

    iget-object v12, v0, Lcom/thetransitapp/droid/data/OnlinePlannerSource;->databaseHelper:Lcom/thetransitapp/droid/data/TransitDatabaseHelper;

    const-string v13, "LAST_PLAN_FETCH_KEY"

    const-string v14, "\n"

    invoke-static {v14, v1}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v12, v13, v14}, Lcom/thetransitapp/droid/data/TransitDatabaseHelper;->saveCache(Ljava/lang/String;Ljava/lang/String;)V

    .line 111
    move-object/from16 v0, p0

    invoke-super {v0, v11}, Lcom/thetransitapp/droid/data/BaseOnlineSource;->execute(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v10

    .line 113
    .local v10, "response":Lorg/json/JSONObject;
    const-string v12, "error"

    invoke-virtual {v10, v12}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v12

    if-eqz v12, :cond_9

    const-string v12, "error"

    invoke-virtual {v10, v12}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v12

    const/4 v13, 0x0

    invoke-virtual {v12, v13}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_9

    .line 114
    const-string v12, "error"

    invoke-virtual {v10, v12}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v6

    .line 115
    .local v6, "error":Lorg/json/JSONObject;
    const-string v12, "id"

    const-string v13, "500"

    invoke-static {v6, v12, v13}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 117
    .local v7, "errorId":Ljava/lang/String;
    const-string v12, "406"

    invoke-virtual {v7, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_6

    .line 118
    sget-object v12, Lcom/thetransitapp/droid/model/RoutingRequest$ErrorType;->OUT_OF_SERVICE:Lcom/thetransitapp/droid/model/RoutingRequest$ErrorType;

    move-object/from16 v0, p1

    invoke-virtual {v0, v12}, Lcom/thetransitapp/droid/model/RoutingRequest;->setError(Lcom/thetransitapp/droid/model/RoutingRequest$ErrorType;)V

    .line 125
    :goto_3
    const-string v12, "msg"

    const/4 v13, 0x0

    invoke-static {v6, v12, v13}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    move-object/from16 v0, p1

    invoke-virtual {v0, v12}, Lcom/thetransitapp/droid/model/RoutingRequest;->setErrorMessage(Ljava/lang/String;)V

    .line 136
    .end local v6    # "error":Lorg/json/JSONObject;
    .end local v7    # "errorId":Ljava/lang/String;
    :cond_2
    :goto_4
    return-object p1

    .line 67
    .end local v1    # "URLs":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    .end local v2    # "URLsString":Ljava/lang/String;
    .end local v3    # "banned":Ljava/lang/String;
    .end local v5    # "bundle":Lcom/thetransitapp/droid/model/TransitBundle;
    .end local v9    # "requestLocation":Landroid/location/Location;
    .end local v10    # "response":Lorg/json/JSONObject;
    .end local v11    # "url":Ljava/lang/String;
    :cond_3
    const-string v12, "false"

    goto/16 :goto_0

    .line 83
    .restart local v5    # "bundle":Lcom/thetransitapp/droid/model/TransitBundle;
    .restart local v9    # "requestLocation":Landroid/location/Location;
    :cond_4
    move-object/from16 v0, p0

    iget-object v12, v0, Lcom/thetransitapp/droid/data/OnlinePlannerSource;->preferences:Landroid/content/SharedPreferences;

    const-string v13, "router_id"

    const-string v14, "0"

    invoke-interface {v12, v13, v14}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v4, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto/16 :goto_1

    .line 100
    .restart local v2    # "URLsString":Ljava/lang/String;
    .restart local v3    # "banned":Ljava/lang/String;
    .restart local v11    # "url":Ljava/lang/String;
    :cond_5
    new-instance v1, Ljava/util/ArrayList;

    const-string v12, "\n"

    invoke-virtual {v2, v12}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v12

    invoke-direct {v1, v12}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .restart local v1    # "URLs":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    goto/16 :goto_2

    .line 119
    .restart local v6    # "error":Lorg/json/JSONObject;
    .restart local v7    # "errorId":Ljava/lang/String;
    .restart local v10    # "response":Lorg/json/JSONObject;
    :cond_6
    const-string v12, "400"

    invoke-virtual {v7, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_7

    const-string v12, "404"

    invoke-virtual {v7, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_7

    const-string v12, "409"

    invoke-virtual {v7, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_8

    .line 120
    :cond_7
    sget-object v12, Lcom/thetransitapp/droid/model/RoutingRequest$ErrorType;->DIRECTION_UNAVAILABLE:Lcom/thetransitapp/droid/model/RoutingRequest$ErrorType;

    move-object/from16 v0, p1

    invoke-virtual {v0, v12}, Lcom/thetransitapp/droid/model/RoutingRequest;->setError(Lcom/thetransitapp/droid/model/RoutingRequest$ErrorType;)V

    goto :goto_3

    .line 122
    :cond_8
    sget-object v12, Lcom/thetransitapp/droid/model/RoutingRequest$ErrorType;->MESSAGE:Lcom/thetransitapp/droid/model/RoutingRequest$ErrorType;

    move-object/from16 v0, p1

    invoke-virtual {v0, v12}, Lcom/thetransitapp/droid/model/RoutingRequest;->setError(Lcom/thetransitapp/droid/model/RoutingRequest$ErrorType;)V

    goto :goto_3

    .line 130
    .end local v6    # "error":Lorg/json/JSONObject;
    .end local v7    # "errorId":Ljava/lang/String;
    :cond_9
    invoke-virtual/range {p1 .. p1}, Lcom/thetransitapp/droid/model/RoutingRequest;->getStart()Lcom/thetransitapp/droid/model/SimplePlacemark;

    move-result-object v12

    invoke-virtual/range {p1 .. p1}, Lcom/thetransitapp/droid/model/RoutingRequest;->getEnd()Lcom/thetransitapp/droid/model/SimplePlacemark;

    move-result-object v13

    move-object/from16 v0, p0

    invoke-direct {v0, v10, v12, v13}, Lcom/thetransitapp/droid/data/OnlinePlannerSource;->parseItineraries(Lorg/json/JSONObject;Lcom/thetransitapp/droid/model/SimplePlacemark;Lcom/thetransitapp/droid/model/SimplePlacemark;)Ljava/util/List;

    move-result-object v8

    .line 132
    .local v8, "itineraries":Ljava/util/List;, "Ljava/util/List<Lcom/thetransitapp/droid/model/RoutingItinerary;>;"
    if-eqz v8, :cond_2

    .line 133
    invoke-virtual/range {p1 .. p1}, Lcom/thetransitapp/droid/model/RoutingRequest;->getItineraries()Ljava/util/List;

    move-result-object v12

    invoke-interface {v12, v8}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    goto :goto_4
.end method
