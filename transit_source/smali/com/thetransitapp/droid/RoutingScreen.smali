.class public Lcom/thetransitapp/droid/RoutingScreen;
.super Lcom/thetransitapp/droid/BaseMapScreen;
.source "RoutingScreen.java"

# interfaces
.implements Lcom/thetransitapp/droid/service/ServiceCallback;
.implements Lcom/thetransitapp/droid/widget/RoutingDetails$OnDetailClickListener;
.implements Lcom/thetransitapp/droid/widget/RoutingSearch$RoutingSearchDelegate;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/thetransitapp/droid/BaseMapScreen;",
        "Lcom/thetransitapp/droid/service/ServiceCallback",
        "<",
        "Lcom/thetransitapp/droid/model/RoutingRequest;",
        ">;",
        "Lcom/thetransitapp/droid/widget/RoutingDetails$OnDetailClickListener;",
        "Lcom/thetransitapp/droid/widget/RoutingSearch$RoutingSearchDelegate;"
    }
.end annotation


# static fields
.field private static synthetic $SWITCH_TABLE$com$thetransitapp$droid$model$RoutingRequest$ErrorType:[I = null

.field public static final LAST_ROUTING_KEY:Ljava/lang/String; = "lastRouting"


# instance fields
.field private currentShownItinerary:Lcom/thetransitapp/droid/model/RoutingItinerary;

.field private directionMenuItem:Lcom/actionbarsherlock/view/MenuItem;

.field private drawnMarkers:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/maps/model/Marker;",
            ">;"
        }
    .end annotation
.end field

.field private drawnPoly:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/maps/model/Polyline;",
            ">;"
        }
    .end annotation
.end field

.field private feedManager:Lcom/thetransitapp/droid/controller/FeedManager;
    .annotation runtime Lcom/google/inject/Inject;
    .end annotation
.end field

.field private legMarkers:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/maps/model/Marker;",
            ">;"
        }
    .end annotation
.end field

.field private oldDirectionLoaded:Lcom/thetransitapp/droid/model/RoutingRequest;

.field private preferences:Landroid/content/SharedPreferences;
    .annotation runtime Lcom/google/inject/Inject;
    .end annotation
.end field

.field private routeButton:Landroid/widget/Button;
    .annotation runtime Lroboguice/inject/InjectView;
        value = 0x7f050092
    .end annotation
.end field

.field private routingDetails:Lcom/thetransitapp/droid/widget/RoutingDetails;

.field private routingSearch:Lcom/thetransitapp/droid/widget/RoutingSearch;

.field private shieldUtility:Lcom/thetransitapp/droid/util/ShieldUtility;

.field private statsManager:Lcom/thetransitapp/droid/model/stats/StatsManager;
    .annotation runtime Lcom/google/inject/Inject;
    .end annotation
.end field

.field private stepsMenuItem:Lcom/actionbarsherlock/view/MenuItem;

.field private timeMenuItem:Lcom/actionbarsherlock/view/MenuItem;


# direct methods
.method static synthetic $SWITCH_TABLE$com$thetransitapp$droid$model$RoutingRequest$ErrorType()[I
    .locals 3

    .prologue
    .line 67
    sget-object v0, Lcom/thetransitapp/droid/RoutingScreen;->$SWITCH_TABLE$com$thetransitapp$droid$model$RoutingRequest$ErrorType:[I

    if-eqz v0, :cond_0

    :goto_0
    return-object v0

    :cond_0
    invoke-static {}, Lcom/thetransitapp/droid/model/RoutingRequest$ErrorType;->values()[Lcom/thetransitapp/droid/model/RoutingRequest$ErrorType;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    :try_start_0
    sget-object v1, Lcom/thetransitapp/droid/model/RoutingRequest$ErrorType;->DIRECTION_UNAVAILABLE:Lcom/thetransitapp/droid/model/RoutingRequest$ErrorType;

    invoke-virtual {v1}, Lcom/thetransitapp/droid/model/RoutingRequest$ErrorType;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_7

    :goto_1
    :try_start_1
    sget-object v1, Lcom/thetransitapp/droid/model/RoutingRequest$ErrorType;->MESSAGE:Lcom/thetransitapp/droid/model/RoutingRequest$ErrorType;

    invoke-virtual {v1}, Lcom/thetransitapp/droid/model/RoutingRequest$ErrorType;->ordinal()I

    move-result v1

    const/4 v2, 0x6

    aput v2, v0, v1
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_6

    :goto_2
    :try_start_2
    sget-object v1, Lcom/thetransitapp/droid/model/RoutingRequest$ErrorType;->NO_INTERNET:Lcom/thetransitapp/droid/model/RoutingRequest$ErrorType;

    invoke-virtual {v1}, Lcom/thetransitapp/droid/model/RoutingRequest$ErrorType;->ordinal()I

    move-result v1

    const/16 v2, 0x8

    aput v2, v0, v1
    :try_end_2
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2 .. :try_end_2} :catch_5

    :goto_3
    :try_start_3
    sget-object v1, Lcom/thetransitapp/droid/model/RoutingRequest$ErrorType;->OUT_OF_SERVICE:Lcom/thetransitapp/droid/model/RoutingRequest$ErrorType;

    invoke-virtual {v1}, Lcom/thetransitapp/droid/model/RoutingRequest$ErrorType;->ordinal()I

    move-result v1

    const/4 v2, 0x4

    aput v2, v0, v1
    :try_end_3
    .catch Ljava/lang/NoSuchFieldError; {:try_start_3 .. :try_end_3} :catch_4

    :goto_4
    :try_start_4
    sget-object v1, Lcom/thetransitapp/droid/model/RoutingRequest$ErrorType;->REGION_IN_MAINTENANCE:Lcom/thetransitapp/droid/model/RoutingRequest$ErrorType;

    invoke-virtual {v1}, Lcom/thetransitapp/droid/model/RoutingRequest$ErrorType;->ordinal()I

    move-result v1

    const/4 v2, 0x3

    aput v2, v0, v1
    :try_end_4
    .catch Ljava/lang/NoSuchFieldError; {:try_start_4 .. :try_end_4} :catch_3

    :goto_5
    :try_start_5
    sget-object v1, Lcom/thetransitapp/droid/model/RoutingRequest$ErrorType;->REGION_UNSUPPORTED:Lcom/thetransitapp/droid/model/RoutingRequest$ErrorType;

    invoke-virtual {v1}, Lcom/thetransitapp/droid/model/RoutingRequest$ErrorType;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1
    :try_end_5
    .catch Ljava/lang/NoSuchFieldError; {:try_start_5 .. :try_end_5} :catch_2

    :goto_6
    :try_start_6
    sget-object v1, Lcom/thetransitapp/droid/model/RoutingRequest$ErrorType;->TIMEOUT:Lcom/thetransitapp/droid/model/RoutingRequest$ErrorType;

    invoke-virtual {v1}, Lcom/thetransitapp/droid/model/RoutingRequest$ErrorType;->ordinal()I

    move-result v1

    const/4 v2, 0x7

    aput v2, v0, v1
    :try_end_6
    .catch Ljava/lang/NoSuchFieldError; {:try_start_6 .. :try_end_6} :catch_1

    :goto_7
    :try_start_7
    sget-object v1, Lcom/thetransitapp/droid/model/RoutingRequest$ErrorType;->UNAUTHORIZED:Lcom/thetransitapp/droid/model/RoutingRequest$ErrorType;

    invoke-virtual {v1}, Lcom/thetransitapp/droid/model/RoutingRequest$ErrorType;->ordinal()I

    move-result v1

    const/4 v2, 0x5

    aput v2, v0, v1
    :try_end_7
    .catch Ljava/lang/NoSuchFieldError; {:try_start_7 .. :try_end_7} :catch_0

    :goto_8
    sput-object v0, Lcom/thetransitapp/droid/RoutingScreen;->$SWITCH_TABLE$com$thetransitapp$droid$model$RoutingRequest$ErrorType:[I

    goto :goto_0

    :catch_0
    move-exception v1

    goto :goto_8

    :catch_1
    move-exception v1

    goto :goto_7

    :catch_2
    move-exception v1

    goto :goto_6

    :catch_3
    move-exception v1

    goto :goto_5

    :catch_4
    move-exception v1

    goto :goto_4

    :catch_5
    move-exception v1

    goto :goto_3

    :catch_6
    move-exception v1

    goto :goto_2

    :catch_7
    move-exception v1

    goto :goto_1
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 97
    sget-object v0, Lcom/thetransitapp/droid/TransitActivity$TransitScreen;->ROUTING_SCREEN:Lcom/thetransitapp/droid/TransitActivity$TransitScreen;

    invoke-direct {p0, v0}, Lcom/thetransitapp/droid/BaseMapScreen;-><init>(Lcom/thetransitapp/droid/TransitActivity$TransitScreen;)V

    .line 88
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/thetransitapp/droid/RoutingScreen;->drawnPoly:Ljava/util/List;

    .line 89
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/thetransitapp/droid/RoutingScreen;->drawnMarkers:Ljava/util/List;

    .line 90
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/thetransitapp/droid/RoutingScreen;->legMarkers:Ljava/util/List;

    .line 94
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/thetransitapp/droid/RoutingScreen;->oldDirectionLoaded:Lcom/thetransitapp/droid/model/RoutingRequest;

    .line 99
    const/4 v0, 0x1

    invoke-super {p0, v0}, Lcom/thetransitapp/droid/BaseMapScreen;->setHasOptionsMenu(Z)V

    .line 100
    return-void
.end method

.method private addMarkers(Lcom/thetransitapp/droid/model/RoutingItinerary;)V
    .locals 14
    .param p1, "routingItinerary"    # Lcom/thetransitapp/droid/model/RoutingItinerary;

    .prologue
    .line 460
    invoke-virtual {p1}, Lcom/thetransitapp/droid/model/RoutingItinerary;->getLegs()Ljava/util/List;

    move-result-object v10

    invoke-interface {v10}, Ljava/util/List;->isEmpty()Z

    move-result v10

    if-nez v10, :cond_0

    .line 461
    invoke-virtual {p1}, Lcom/thetransitapp/droid/model/RoutingItinerary;->getLegs()Ljava/util/List;

    move-result-object v10

    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v4

    .line 462
    .local v4, "length":I
    invoke-virtual {p1}, Lcom/thetransitapp/droid/model/RoutingItinerary;->getLegs()Ljava/util/List;

    move-result-object v10

    const/4 v11, 0x0

    invoke-interface {v10, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/thetransitapp/droid/model/RoutingLeg;

    invoke-virtual {v10}, Lcom/thetransitapp/droid/model/RoutingLeg;->getFromPlacemark()Lcom/thetransitapp/droid/model/SimplePlacemark;

    move-result-object v10

    invoke-virtual {v10}, Lcom/thetransitapp/droid/model/SimplePlacemark;->toLatLng()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v2

    .line 463
    .local v2, "from":Lcom/google/android/gms/maps/model/LatLng;
    invoke-virtual {p1}, Lcom/thetransitapp/droid/model/RoutingItinerary;->getLegs()Ljava/util/List;

    move-result-object v10

    add-int/lit8 v11, v4, -0x1

    invoke-interface {v10, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/thetransitapp/droid/model/RoutingLeg;

    invoke-virtual {v10}, Lcom/thetransitapp/droid/model/RoutingLeg;->getToPlacemark()Lcom/thetransitapp/droid/model/SimplePlacemark;

    move-result-object v10

    invoke-virtual {v10}, Lcom/thetransitapp/droid/model/SimplePlacemark;->toLatLng()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v8

    .line 465
    .local v8, "to":Lcom/google/android/gms/maps/model/LatLng;
    invoke-static {}, Lcom/google/android/gms/maps/model/LatLngBounds;->builder()Lcom/google/android/gms/maps/model/LatLngBounds$Builder;

    move-result-object v0

    .line 466
    .local v0, "builder":Lcom/google/android/gms/maps/model/LatLngBounds$Builder;
    invoke-virtual {v0, v2}, Lcom/google/android/gms/maps/model/LatLngBounds$Builder;->include(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/LatLngBounds$Builder;

    .line 467
    invoke-virtual {v0, v8}, Lcom/google/android/gms/maps/model/LatLngBounds$Builder;->include(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/LatLngBounds$Builder;

    .line 469
    new-instance v5, Landroid/util/DisplayMetrics;

    invoke-direct {v5}, Landroid/util/DisplayMetrics;-><init>()V

    .line 470
    .local v5, "metrics":Landroid/util/DisplayMetrics;
    invoke-super {p0}, Lcom/thetransitapp/droid/BaseMapScreen;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v10

    invoke-virtual {v10}, Landroid/support/v4/app/FragmentActivity;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v10

    invoke-interface {v10}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v10

    invoke-virtual {v10, v5}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    .line 472
    invoke-super {p0}, Lcom/thetransitapp/droid/BaseMapScreen;->getView()Landroid/view/View;

    move-result-object v10

    if-eqz v10, :cond_0

    invoke-super {p0}, Lcom/thetransitapp/droid/BaseMapScreen;->isVisible()Z

    move-result v10

    if-eqz v10, :cond_0

    .line 473
    invoke-super {p0}, Lcom/thetransitapp/droid/BaseMapScreen;->getView()Landroid/view/View;

    move-result-object v10

    const/4 v11, -0x1

    const/4 v12, -0x2

    invoke-virtual {v10, v11, v12}, Landroid/view/View;->measure(II)V

    .line 475
    iget v10, v5, Landroid/util/DisplayMetrics;->heightPixels:I

    invoke-super {p0}, Lcom/thetransitapp/droid/BaseMapScreen;->getView()Landroid/view/View;

    move-result-object v11

    invoke-virtual {v11}, Landroid/view/View;->getMeasuredHeight()I

    move-result v11

    mul-int/lit8 v11, v11, 0x2

    sub-int v3, v10, v11

    .line 477
    .local v3, "height":I
    invoke-virtual {p0}, Lcom/thetransitapp/droid/RoutingScreen;->getView()Landroid/view/View;

    move-result-object v10

    invoke-virtual {v10}, Landroid/view/View;->getWidth()I

    move-result v10

    invoke-virtual {p0}, Lcom/thetransitapp/droid/RoutingScreen;->getView()Landroid/view/View;

    move-result-object v11

    invoke-virtual {v11}, Landroid/view/View;->getHeight()I

    move-result v11

    invoke-static {v10, v11}, Ljava/lang/Math;->min(II)I

    move-result v10

    int-to-double v10, v10

    const-wide v12, 0x3fb999999999999aL    # 0.1

    mul-double/2addr v10, v12

    double-to-int v7, v10

    .line 478
    .local v7, "paddingInPixels":I
    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/LatLngBounds$Builder;->build()Lcom/google/android/gms/maps/model/LatLngBounds;

    move-result-object v10

    iget v11, v5, Landroid/util/DisplayMetrics;->widthPixels:I

    invoke-static {v10, v11, v3, v7}, Lcom/google/android/gms/maps/CameraUpdateFactory;->newLatLngBounds(Lcom/google/android/gms/maps/model/LatLngBounds;III)Lcom/google/android/gms/maps/CameraUpdate;

    move-result-object v9

    .line 481
    .local v9, "update":Lcom/google/android/gms/maps/CameraUpdate;
    :try_start_0
    invoke-virtual {p0}, Lcom/thetransitapp/droid/RoutingScreen;->getMap()Lcom/google/android/gms/maps/GoogleMap;

    move-result-object v10

    invoke-virtual {v10, v9}, Lcom/google/android/gms/maps/GoogleMap;->moveCamera(Lcom/google/android/gms/maps/CameraUpdate;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 489
    :goto_0
    new-instance v10, Lcom/google/android/gms/maps/model/MarkerOptions;

    invoke-direct {v10}, Lcom/google/android/gms/maps/model/MarkerOptions;-><init>()V

    .line 490
    const/high16 v11, 0x42f00000    # 120.0f

    invoke-static {v11}, Lcom/google/android/gms/maps/model/BitmapDescriptorFactory;->defaultMarker(F)Lcom/google/android/gms/maps/model/BitmapDescriptor;

    move-result-object v11

    .line 489
    invoke-virtual {v10, v11}, Lcom/google/android/gms/maps/model/MarkerOptions;->icon(Lcom/google/android/gms/maps/model/BitmapDescriptor;)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v10

    .line 490
    invoke-virtual {v10, v2}, Lcom/google/android/gms/maps/model/MarkerOptions;->position(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v6

    .line 491
    .local v6, "options":Lcom/google/android/gms/maps/model/MarkerOptions;
    iget-object v10, p0, Lcom/thetransitapp/droid/RoutingScreen;->legMarkers:Ljava/util/List;

    invoke-virtual {p0}, Lcom/thetransitapp/droid/RoutingScreen;->getMap()Lcom/google/android/gms/maps/GoogleMap;

    move-result-object v11

    invoke-virtual {v11, v6}, Lcom/google/android/gms/maps/GoogleMap;->addMarker(Lcom/google/android/gms/maps/model/MarkerOptions;)Lcom/google/android/gms/maps/model/Marker;

    move-result-object v11

    invoke-interface {v10, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 493
    new-instance v10, Lcom/google/android/gms/maps/model/MarkerOptions;

    invoke-direct {v10}, Lcom/google/android/gms/maps/model/MarkerOptions;-><init>()V

    .line 494
    const/4 v11, 0x0

    invoke-static {v11}, Lcom/google/android/gms/maps/model/BitmapDescriptorFactory;->defaultMarker(F)Lcom/google/android/gms/maps/model/BitmapDescriptor;

    move-result-object v11

    .line 493
    invoke-virtual {v10, v11}, Lcom/google/android/gms/maps/model/MarkerOptions;->icon(Lcom/google/android/gms/maps/model/BitmapDescriptor;)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v10

    .line 494
    invoke-virtual {v10, v8}, Lcom/google/android/gms/maps/model/MarkerOptions;->position(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v6

    .line 495
    iget-object v10, p0, Lcom/thetransitapp/droid/RoutingScreen;->legMarkers:Ljava/util/List;

    invoke-virtual {p0}, Lcom/thetransitapp/droid/RoutingScreen;->getMap()Lcom/google/android/gms/maps/GoogleMap;

    move-result-object v11

    invoke-virtual {v11, v6}, Lcom/google/android/gms/maps/GoogleMap;->addMarker(Lcom/google/android/gms/maps/model/MarkerOptions;)Lcom/google/android/gms/maps/model/Marker;

    move-result-object v11

    invoke-interface {v10, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 498
    .end local v0    # "builder":Lcom/google/android/gms/maps/model/LatLngBounds$Builder;
    .end local v2    # "from":Lcom/google/android/gms/maps/model/LatLng;
    .end local v3    # "height":I
    .end local v4    # "length":I
    .end local v5    # "metrics":Landroid/util/DisplayMetrics;
    .end local v6    # "options":Lcom/google/android/gms/maps/model/MarkerOptions;
    .end local v7    # "paddingInPixels":I
    .end local v8    # "to":Lcom/google/android/gms/maps/model/LatLng;
    .end local v9    # "update":Lcom/google/android/gms/maps/CameraUpdate;
    :cond_0
    return-void

    .line 482
    .restart local v0    # "builder":Lcom/google/android/gms/maps/model/LatLngBounds$Builder;
    .restart local v2    # "from":Lcom/google/android/gms/maps/model/LatLng;
    .restart local v3    # "height":I
    .restart local v4    # "length":I
    .restart local v5    # "metrics":Landroid/util/DisplayMetrics;
    .restart local v7    # "paddingInPixels":I
    .restart local v8    # "to":Lcom/google/android/gms/maps/model/LatLng;
    .restart local v9    # "update":Lcom/google/android/gms/maps/CameraUpdate;
    :catch_0
    move-exception v1

    .line 483
    .local v1, "e":Ljava/lang/Exception;
    const-class v10, Lcom/thetransitapp/droid/RoutingScreen;

    invoke-virtual {v10}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v11

    invoke-static {v10, v11, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 484
    invoke-static {v1}, Lcom/crashlytics/android/Crashlytics;->logException(Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method private clearDrawing()V
    .locals 4

    .prologue
    .line 501
    iget-object v2, p0, Lcom/thetransitapp/droid/RoutingScreen;->drawnPoly:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-nez v3, :cond_0

    .line 505
    iget-object v2, p0, Lcom/thetransitapp/droid/RoutingScreen;->drawnMarkers:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-nez v3, :cond_1

    .line 509
    iget-object v2, p0, Lcom/thetransitapp/droid/RoutingScreen;->legMarkers:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-nez v3, :cond_2

    .line 513
    iget-object v2, p0, Lcom/thetransitapp/droid/RoutingScreen;->drawnPoly:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->clear()V

    .line 514
    iget-object v2, p0, Lcom/thetransitapp/droid/RoutingScreen;->drawnMarkers:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->clear()V

    .line 515
    iget-object v2, p0, Lcom/thetransitapp/droid/RoutingScreen;->legMarkers:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->clear()V

    .line 517
    invoke-virtual {p0}, Lcom/thetransitapp/droid/RoutingScreen;->getShieldUtility()Lcom/thetransitapp/droid/util/ShieldUtility;

    move-result-object v2

    invoke-virtual {v2}, Lcom/thetransitapp/droid/util/ShieldUtility;->clear()V

    .line 518
    return-void

    .line 501
    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/maps/model/Polyline;

    .line 502
    .local v1, "poly":Lcom/google/android/gms/maps/model/Polyline;
    invoke-virtual {v1}, Lcom/google/android/gms/maps/model/Polyline;->remove()V

    goto :goto_0

    .line 505
    .end local v1    # "poly":Lcom/google/android/gms/maps/model/Polyline;
    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/maps/model/Marker;

    .line 506
    .local v0, "marker":Lcom/google/android/gms/maps/model/Marker;
    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/Marker;->remove()V

    goto :goto_1

    .line 509
    .end local v0    # "marker":Lcom/google/android/gms/maps/model/Marker;
    :cond_2
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/maps/model/Marker;

    .line 510
    .restart local v0    # "marker":Lcom/google/android/gms/maps/model/Marker;
    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/Marker;->remove()V

    goto :goto_2
.end method

.method private onError(Lcom/thetransitapp/droid/model/RoutingRequest$ErrorType;Ljava/lang/String;Ljava/lang/String;)V
    .locals 7
    .param p1, "type"    # Lcom/thetransitapp/droid/model/RoutingRequest$ErrorType;
    .param p2, "title"    # Ljava/lang/String;
    .param p3, "message"    # Ljava/lang/String;

    .prologue
    const/4 v6, -0x1

    .line 546
    if-nez p1, :cond_1

    .line 547
    invoke-super {p0}, Lcom/thetransitapp/droid/BaseMapScreen;->getView()Landroid/view/View;

    move-result-object v4

    invoke-virtual {v4}, Landroid/view/View;->getVisibility()I

    move-result v4

    if-eqz v4, :cond_0

    .line 548
    invoke-super {p0}, Lcom/thetransitapp/droid/BaseMapScreen;->getView()Landroid/view/View;

    move-result-object v4

    const/4 v5, 0x0

    invoke-virtual {v4, v5}, Landroid/view/View;->setVisibility(I)V

    .line 549
    invoke-super {p0}, Lcom/thetransitapp/droid/BaseMapScreen;->hideError()V

    .line 630
    :cond_0
    :goto_0
    return-void

    .line 555
    :cond_1
    const/4 v3, -0x1

    .line 556
    .local v3, "titleId":I
    const/4 v2, -0x1

    .line 558
    .local v2, "messageId":I
    invoke-static {}, Lcom/thetransitapp/droid/RoutingScreen;->$SWITCH_TABLE$com$thetransitapp$droid$model$RoutingRequest$ErrorType()[I

    move-result-object v4

    invoke-virtual {p1}, Lcom/thetransitapp/droid/model/RoutingRequest$ErrorType;->ordinal()I

    move-result v5

    aget v4, v4, v5

    packed-switch v4, :pswitch_data_0

    .line 584
    :pswitch_0
    if-nez p2, :cond_2

    .line 585
    const v3, 0x7f0a0076

    .line 588
    :cond_2
    if-nez p3, :cond_3

    .line 589
    const v2, 0x7f0a0086

    .line 594
    :cond_3
    :goto_1
    if-eq v3, v6, :cond_4

    .line 595
    invoke-super {p0, v3}, Lcom/thetransitapp/droid/BaseMapScreen;->getString(I)Ljava/lang/String;

    move-result-object p2

    .line 598
    :cond_4
    if-eq v2, v6, :cond_5

    .line 599
    invoke-super {p0, v2}, Lcom/thetransitapp/droid/BaseMapScreen;->getString(I)Ljava/lang/String;

    move-result-object p3

    .line 602
    :cond_5
    const/4 v0, 0x0

    .line 603
    .local v0, "button":Ljava/lang/String;
    const/4 v1, 0x0

    .line 605
    .local v1, "listener":Lcom/thetransitapp/droid/widget/ErrorView$OnErrorButtonClickListener;
    invoke-static {}, Lcom/thetransitapp/droid/RoutingScreen;->$SWITCH_TABLE$com$thetransitapp$droid$model$RoutingRequest$ErrorType()[I

    move-result-object v4

    invoke-virtual {p1}, Lcom/thetransitapp/droid/model/RoutingRequest$ErrorType;->ordinal()I

    move-result v5

    aget v4, v4, v5

    packed-switch v4, :pswitch_data_1

    .line 619
    :goto_2
    const v4, 0x7f0a002f

    invoke-super {p0, v4}, Lcom/thetransitapp/droid/BaseMapScreen;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 620
    new-instance v1, Lcom/thetransitapp/droid/RoutingScreen$3;

    .end local v1    # "listener":Lcom/thetransitapp/droid/widget/ErrorView$OnErrorButtonClickListener;
    invoke-direct {v1, p0}, Lcom/thetransitapp/droid/RoutingScreen$3;-><init>(Lcom/thetransitapp/droid/RoutingScreen;)V

    .line 629
    .restart local v1    # "listener":Lcom/thetransitapp/droid/widget/ErrorView$OnErrorButtonClickListener;
    invoke-super {p0, p2, p3, v0, v1}, Lcom/thetransitapp/droid/BaseMapScreen;->displayError(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/thetransitapp/droid/widget/ErrorView$OnErrorButtonClickListener;)V

    goto :goto_0

    .line 560
    .end local v0    # "button":Ljava/lang/String;
    .end local v1    # "listener":Lcom/thetransitapp/droid/widget/ErrorView$OnErrorButtonClickListener;
    :pswitch_1
    const v3, 0x7f0a0036

    .line 561
    const v2, 0x7f0a0085

    .line 562
    goto :goto_1

    .line 565
    :pswitch_2
    const v3, 0x7f0a007e

    .line 566
    const v2, 0x7f0a0083

    .line 569
    :pswitch_3
    const v3, 0x7f0a007e

    .line 570
    const v2, 0x7f0a0084

    .line 571
    goto :goto_1

    .line 574
    :pswitch_4
    const v3, 0x7f0a0072

    .line 575
    const v2, 0x7f0a0073

    .line 576
    goto :goto_1

    .line 579
    :pswitch_5
    const v3, 0x7f0a0074

    .line 580
    const v2, 0x7f0a0075

    .line 581
    goto :goto_1

    .line 608
    .restart local v0    # "button":Ljava/lang/String;
    .restart local v1    # "listener":Lcom/thetransitapp/droid/widget/ErrorView$OnErrorButtonClickListener;
    :pswitch_6
    const v4, 0x7f0a0071

    invoke-super {p0, v4}, Lcom/thetransitapp/droid/BaseMapScreen;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 609
    new-instance v1, Lcom/thetransitapp/droid/RoutingScreen$2;

    .end local v1    # "listener":Lcom/thetransitapp/droid/widget/ErrorView$OnErrorButtonClickListener;
    invoke-direct {v1, p0}, Lcom/thetransitapp/droid/RoutingScreen$2;-><init>(Lcom/thetransitapp/droid/RoutingScreen;)V

    .restart local v1    # "listener":Lcom/thetransitapp/droid/widget/ErrorView$OnErrorButtonClickListener;
    goto :goto_2

    .line 558
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_2
        :pswitch_0
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_5
        :pswitch_4
    .end packed-switch

    .line 605
    :pswitch_data_1
    .packed-switch 0x7
        :pswitch_6
        :pswitch_6
    .end packed-switch
.end method

.method private saveResult(Lcom/thetransitapp/droid/model/RoutingRequest;)V
    .locals 10
    .param p1, "result"    # Lcom/thetransitapp/droid/model/RoutingRequest;

    .prologue
    .line 302
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 306
    .local v0, "arrayOutputStream":Ljava/io/ByteArrayOutputStream;
    :try_start_0
    new-instance v4, Ljava/io/ObjectOutputStream;

    invoke-direct {v4, v0}, Ljava/io/ObjectOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 307
    .local v4, "objectOutput":Ljava/io/ObjectOutputStream;
    invoke-virtual {v4, p1}, Ljava/io/ObjectOutputStream;->writeObject(Ljava/lang/Object;)V

    .line 308
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v2

    .line 309
    .local v2, "data":[B
    invoke-virtual {v4}, Ljava/io/ObjectOutputStream;->close()V

    .line 310
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->close()V

    .line 312
    new-instance v5, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v5}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 313
    .local v5, "out":Ljava/io/ByteArrayOutputStream;
    new-instance v1, Landroid/util/Base64OutputStream;

    const/4 v6, 0x0

    invoke-direct {v1, v5, v6}, Landroid/util/Base64OutputStream;-><init>(Ljava/io/OutputStream;I)V

    .line 314
    .local v1, "b64":Landroid/util/Base64OutputStream;
    invoke-virtual {v1, v2}, Landroid/util/Base64OutputStream;->write([B)V

    .line 315
    invoke-virtual {v1}, Landroid/util/Base64OutputStream;->close()V

    .line 316
    invoke-virtual {v5}, Ljava/io/ByteArrayOutputStream;->close()V

    .line 318
    iget-object v6, p0, Lcom/thetransitapp/droid/RoutingScreen;->preferences:Landroid/content/SharedPreferences;

    invoke-interface {v6}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v6

    const-string v7, "lastRouting"

    new-instance v8, Ljava/lang/String;

    invoke-virtual {v5}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v9

    invoke-direct {v8, v9}, Ljava/lang/String;-><init>([B)V

    invoke-interface {v6, v7, v8}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v6

    invoke-interface {v6}, Landroid/content/SharedPreferences$Editor;->commit()Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 323
    .end local v1    # "b64":Landroid/util/Base64OutputStream;
    .end local v2    # "data":[B
    .end local v4    # "objectOutput":Ljava/io/ObjectOutputStream;
    .end local v5    # "out":Ljava/io/ByteArrayOutputStream;
    :goto_0
    return-void

    .line 319
    :catch_0
    move-exception v3

    .line 320
    .local v3, "e":Ljava/io/IOException;
    invoke-virtual {v3}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_0
.end method


# virtual methods
.method public clear()V
    .locals 1

    .prologue
    .line 454
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/thetransitapp/droid/RoutingScreen;->currentShownItinerary:Lcom/thetransitapp/droid/model/RoutingItinerary;

    .line 456
    invoke-direct {p0}, Lcom/thetransitapp/droid/RoutingScreen;->clearDrawing()V

    .line 457
    return-void
.end method

.method public getShieldUtility()Lcom/thetransitapp/droid/util/ShieldUtility;
    .locals 3

    .prologue
    .line 326
    iget-object v0, p0, Lcom/thetransitapp/droid/RoutingScreen;->shieldUtility:Lcom/thetransitapp/droid/util/ShieldUtility;

    if-nez v0, :cond_0

    .line 327
    new-instance v0, Lcom/thetransitapp/droid/util/ShieldUtility;

    invoke-super {p0}, Lcom/thetransitapp/droid/BaseMapScreen;->getMap()Lcom/google/android/gms/maps/GoogleMap;

    move-result-object v1

    invoke-super {p0}, Lcom/thetransitapp/droid/BaseMapScreen;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/thetransitapp/droid/util/ShieldUtility;-><init>(Lcom/google/android/gms/maps/GoogleMap;Landroid/content/Context;)V

    iput-object v0, p0, Lcom/thetransitapp/droid/RoutingScreen;->shieldUtility:Lcom/thetransitapp/droid/util/ShieldUtility;

    .line 329
    :cond_0
    iget-object v0, p0, Lcom/thetransitapp/droid/RoutingScreen;->shieldUtility:Lcom/thetransitapp/droid/util/ShieldUtility;

    return-object v0
.end method

.method public onCameraChange(Lcom/google/android/gms/maps/model/CameraPosition;)V
    .locals 5
    .param p1, "position"    # Lcom/google/android/gms/maps/model/CameraPosition;

    .prologue
    .line 247
    invoke-super {p0, p1}, Lcom/thetransitapp/droid/BaseMapScreen;->onCameraChange(Lcom/google/android/gms/maps/model/CameraPosition;)V

    .line 249
    iget-object v3, p0, Lcom/thetransitapp/droid/RoutingScreen;->drawnMarkers:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_1

    .line 250
    const/4 v2, 0x0

    .line 252
    .local v2, "visible":Z
    iget v3, p1, Lcom/google/android/gms/maps/model/CameraPosition;->zoom:F

    const/high16 v4, 0x41780000    # 15.5f

    cmpl-float v3, v3, v4

    if-lez v3, :cond_0

    .line 253
    const/4 v2, 0x1

    .line 256
    :cond_0
    iget-object v3, p0, Lcom/thetransitapp/droid/RoutingScreen;->drawnMarkers:Ljava/util/List;

    const/4 v4, 0x0

    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/maps/model/Marker;

    invoke-virtual {v3}, Lcom/google/android/gms/maps/model/Marker;->isVisible()Z

    move-result v3

    if-eq v3, v2, :cond_1

    .line 257
    iget-object v3, p0, Lcom/thetransitapp/droid/RoutingScreen;->drawnMarkers:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-nez v4, :cond_3

    .line 263
    .end local v2    # "visible":Z
    :cond_1
    iget-object v3, p0, Lcom/thetransitapp/droid/RoutingScreen;->currentShownItinerary:Lcom/thetransitapp/droid/model/RoutingItinerary;

    if-eqz v3, :cond_2

    .line 264
    invoke-virtual {p0}, Lcom/thetransitapp/droid/RoutingScreen;->getShieldUtility()Lcom/thetransitapp/droid/util/ShieldUtility;

    move-result-object v3

    invoke-virtual {v3}, Lcom/thetransitapp/droid/util/ShieldUtility;->clear()V

    .line 266
    iget-object v3, p0, Lcom/thetransitapp/droid/RoutingScreen;->currentShownItinerary:Lcom/thetransitapp/droid/model/RoutingItinerary;

    invoke-virtual {v3}, Lcom/thetransitapp/droid/model/RoutingItinerary;->getLegs()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-nez v4, :cond_4

    .line 270
    :cond_2
    return-void

    .line 257
    .restart local v2    # "visible":Z
    :cond_3
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/maps/model/Marker;

    .line 258
    .local v1, "marker":Lcom/google/android/gms/maps/model/Marker;
    invoke-virtual {v1, v2}, Lcom/google/android/gms/maps/model/Marker;->setVisible(Z)V

    goto :goto_0

    .line 266
    .end local v1    # "marker":Lcom/google/android/gms/maps/model/Marker;
    .end local v2    # "visible":Z
    :cond_4
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/thetransitapp/droid/model/RoutingLeg;

    .line 267
    .local v0, "leg":Lcom/thetransitapp/droid/model/RoutingLeg;
    invoke-virtual {p0}, Lcom/thetransitapp/droid/RoutingScreen;->getShieldUtility()Lcom/thetransitapp/droid/util/ShieldUtility;

    move-result-object v4

    invoke-virtual {v4, v0}, Lcom/thetransitapp/droid/util/ShieldUtility;->draw(Lcom/thetransitapp/droid/model/RoutingLeg;)V

    goto :goto_1
.end method

.method public onCreateOptionsMenu(Lcom/actionbarsherlock/view/Menu;Lcom/actionbarsherlock/view/MenuInflater;)V
    .locals 5
    .param p1, "menu"    # Lcom/actionbarsherlock/view/Menu;
    .param p2, "inflater"    # Lcom/actionbarsherlock/view/MenuInflater;

    .prologue
    const/4 v4, 0x2

    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 225
    invoke-super {p0, p1, p2}, Lcom/thetransitapp/droid/BaseMapScreen;->onCreateOptionsMenu(Lcom/actionbarsherlock/view/Menu;Lcom/actionbarsherlock/view/MenuInflater;)V

    .line 227
    const v0, 0x7f0a0032

    invoke-interface {p1, v2, v2, v2, v0}, Lcom/actionbarsherlock/view/Menu;->add(IIII)Lcom/actionbarsherlock/view/MenuItem;

    move-result-object v0

    .line 228
    const v3, 0x7f020097

    invoke-interface {v0, v3}, Lcom/actionbarsherlock/view/MenuItem;->setIcon(I)Lcom/actionbarsherlock/view/MenuItem;

    move-result-object v0

    invoke-interface {v0, v4}, Lcom/actionbarsherlock/view/MenuItem;->setShowAsActionFlags(I)Lcom/actionbarsherlock/view/MenuItem;

    move-result-object v3

    .line 229
    iget-object v0, p0, Lcom/thetransitapp/droid/RoutingScreen;->routingDetails:Lcom/thetransitapp/droid/widget/RoutingDetails;

    if-nez v0, :cond_2

    move v0, v1

    :goto_0
    invoke-interface {v3, v0}, Lcom/actionbarsherlock/view/MenuItem;->setVisible(Z)Lcom/actionbarsherlock/view/MenuItem;

    move-result-object v0

    .line 227
    iput-object v0, p0, Lcom/thetransitapp/droid/RoutingScreen;->directionMenuItem:Lcom/actionbarsherlock/view/MenuItem;

    .line 230
    const v0, 0x7f0a004b

    invoke-interface {p1, v2, v1, v2, v0}, Lcom/actionbarsherlock/view/Menu;->add(IIII)Lcom/actionbarsherlock/view/MenuItem;

    move-result-object v0

    const v3, 0x7f020094

    invoke-interface {v0, v3}, Lcom/actionbarsherlock/view/MenuItem;->setIcon(I)Lcom/actionbarsherlock/view/MenuItem;

    move-result-object v0

    .line 231
    invoke-interface {v0, v4}, Lcom/actionbarsherlock/view/MenuItem;->setShowAsActionFlags(I)Lcom/actionbarsherlock/view/MenuItem;

    move-result-object v3

    iget-object v0, p0, Lcom/thetransitapp/droid/RoutingScreen;->routingDetails:Lcom/thetransitapp/droid/widget/RoutingDetails;

    if-nez v0, :cond_3

    move v0, v1

    :goto_1
    invoke-interface {v3, v0}, Lcom/actionbarsherlock/view/MenuItem;->setVisible(Z)Lcom/actionbarsherlock/view/MenuItem;

    move-result-object v0

    .line 230
    iput-object v0, p0, Lcom/thetransitapp/droid/RoutingScreen;->timeMenuItem:Lcom/actionbarsherlock/view/MenuItem;

    .line 232
    const v0, 0x7f0a004a

    invoke-interface {p1, v2, v4, v2, v0}, Lcom/actionbarsherlock/view/Menu;->add(IIII)Lcom/actionbarsherlock/view/MenuItem;

    move-result-object v0

    const v3, 0x7f020096

    invoke-interface {v0, v3}, Lcom/actionbarsherlock/view/MenuItem;->setIcon(I)Lcom/actionbarsherlock/view/MenuItem;

    move-result-object v0

    .line 233
    invoke-interface {v0, v4}, Lcom/actionbarsherlock/view/MenuItem;->setShowAsActionFlags(I)Lcom/actionbarsherlock/view/MenuItem;

    move-result-object v0

    iget-object v3, p0, Lcom/thetransitapp/droid/RoutingScreen;->routingDetails:Lcom/thetransitapp/droid/widget/RoutingDetails;

    if-eqz v3, :cond_4

    :goto_2
    invoke-interface {v0, v1}, Lcom/actionbarsherlock/view/MenuItem;->setVisible(Z)Lcom/actionbarsherlock/view/MenuItem;

    move-result-object v0

    .line 232
    iput-object v0, p0, Lcom/thetransitapp/droid/RoutingScreen;->stepsMenuItem:Lcom/actionbarsherlock/view/MenuItem;

    .line 235
    iget-object v0, p0, Lcom/thetransitapp/droid/RoutingScreen;->routingSearch:Lcom/thetransitapp/droid/widget/RoutingSearch;

    if-eqz v0, :cond_0

    .line 236
    iget-object v0, p0, Lcom/thetransitapp/droid/RoutingScreen;->directionMenuItem:Lcom/actionbarsherlock/view/MenuItem;

    iget-object v1, p0, Lcom/thetransitapp/droid/RoutingScreen;->routingSearch:Lcom/thetransitapp/droid/widget/RoutingSearch;

    invoke-interface {v0, v1}, Lcom/actionbarsherlock/view/MenuItem;->setOnMenuItemClickListener(Lcom/actionbarsherlock/view/MenuItem$OnMenuItemClickListener;)Lcom/actionbarsherlock/view/MenuItem;

    .line 237
    iget-object v0, p0, Lcom/thetransitapp/droid/RoutingScreen;->timeMenuItem:Lcom/actionbarsherlock/view/MenuItem;

    iget-object v1, p0, Lcom/thetransitapp/droid/RoutingScreen;->routingSearch:Lcom/thetransitapp/droid/widget/RoutingSearch;

    invoke-interface {v0, v1}, Lcom/actionbarsherlock/view/MenuItem;->setOnMenuItemClickListener(Lcom/actionbarsherlock/view/MenuItem$OnMenuItemClickListener;)Lcom/actionbarsherlock/view/MenuItem;

    .line 240
    :cond_0
    iget-object v0, p0, Lcom/thetransitapp/droid/RoutingScreen;->routingDetails:Lcom/thetransitapp/droid/widget/RoutingDetails;

    if-eqz v0, :cond_1

    .line 241
    iget-object v0, p0, Lcom/thetransitapp/droid/RoutingScreen;->stepsMenuItem:Lcom/actionbarsherlock/view/MenuItem;

    iget-object v1, p0, Lcom/thetransitapp/droid/RoutingScreen;->routingDetails:Lcom/thetransitapp/droid/widget/RoutingDetails;

    invoke-interface {v0, v1}, Lcom/actionbarsherlock/view/MenuItem;->setOnMenuItemClickListener(Lcom/actionbarsherlock/view/MenuItem$OnMenuItemClickListener;)Lcom/actionbarsherlock/view/MenuItem;

    .line 243
    :cond_1
    return-void

    :cond_2
    move v0, v2

    .line 229
    goto :goto_0

    :cond_3
    move v0, v2

    .line 231
    goto :goto_1

    :cond_4
    move v1, v2

    .line 233
    goto :goto_2
.end method

.method public onDetailClick(Lcom/thetransitapp/droid/model/RoutingItinerary;)V
    .locals 0
    .param p1, "routingItinerary"    # Lcom/thetransitapp/droid/model/RoutingItinerary;

    .prologue
    .line 434
    invoke-virtual {p0, p1}, Lcom/thetransitapp/droid/RoutingScreen;->showItinerary(Lcom/thetransitapp/droid/model/RoutingItinerary;)V

    .line 435
    return-void
.end method

.method public onError(Ljava/lang/String;Ljava/lang/Exception;)V
    .locals 2
    .param p1, "message"    # Ljava/lang/String;
    .param p2, "exception"    # Ljava/lang/Exception;

    .prologue
    .line 412
    invoke-super {p0}, Lcom/thetransitapp/droid/BaseMapScreen;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, p1, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 413
    return-void
.end method

.method public onLegClick(Lcom/thetransitapp/droid/model/RoutingLeg;)V
    .locals 7
    .param p1, "leg"    # Lcom/thetransitapp/droid/model/RoutingLeg;

    .prologue
    .line 439
    iget-object v3, p0, Lcom/thetransitapp/droid/RoutingScreen;->shieldUtility:Lcom/thetransitapp/droid/util/ShieldUtility;

    if-eqz v3, :cond_0

    .line 440
    iget-object v3, p0, Lcom/thetransitapp/droid/RoutingScreen;->shieldUtility:Lcom/thetransitapp/droid/util/ShieldUtility;

    invoke-virtual {v3}, Lcom/thetransitapp/droid/util/ShieldUtility;->clear()V

    .line 443
    :cond_0
    new-instance v1, Landroid/util/DisplayMetrics;

    invoke-direct {v1}, Landroid/util/DisplayMetrics;-><init>()V

    .line 444
    .local v1, "metrics":Landroid/util/DisplayMetrics;
    invoke-super {p0}, Lcom/thetransitapp/droid/BaseMapScreen;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v3

    invoke-virtual {v3}, Landroid/support/v4/app/FragmentActivity;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v3

    invoke-interface {v3}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v3

    invoke-virtual {v3, v1}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    .line 446
    invoke-super {p0}, Lcom/thetransitapp/droid/BaseMapScreen;->getView()Landroid/view/View;

    move-result-object v3

    const v4, 0x7f050091

    invoke-virtual {v3, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    .line 447
    .local v2, "view":Landroid/view/View;
    const/4 v3, -0x1

    const/4 v4, -0x2

    invoke-virtual {v2, v3, v4}, Landroid/view/View;->measure(II)V

    .line 449
    invoke-virtual {v2}, Landroid/view/View;->getMeasuredHeight()I

    move-result v3

    mul-int/lit8 v0, v3, 0x2

    .line 450
    .local v0, "height":I
    invoke-virtual {p1}, Lcom/thetransitapp/droid/model/RoutingLeg;->getBounds()Lcom/google/android/gms/maps/model/LatLngBounds;

    move-result-object v3

    const/4 v4, 0x1

    iget v5, v1, Landroid/util/DisplayMetrics;->widthPixels:I

    iget v6, v1, Landroid/util/DisplayMetrics;->heightPixels:I

    sub-int/2addr v6, v0

    invoke-super {p0, v3, v4, v5, v6}, Lcom/thetransitapp/droid/BaseMapScreen;->centerMap(Lcom/google/android/gms/maps/model/LatLngBounds;ZII)V

    .line 451
    return-void
.end method

.method public onPause()V
    .locals 1

    .prologue
    .line 214
    invoke-super {p0}, Lcom/thetransitapp/droid/BaseMapScreen;->onPause()V

    .line 216
    invoke-direct {p0}, Lcom/thetransitapp/droid/RoutingScreen;->clearDrawing()V

    .line 218
    iget-object v0, p0, Lcom/thetransitapp/droid/RoutingScreen;->routingSearch:Lcom/thetransitapp/droid/widget/RoutingSearch;

    if-eqz v0, :cond_0

    .line 219
    iget-object v0, p0, Lcom/thetransitapp/droid/RoutingScreen;->routingSearch:Lcom/thetransitapp/droid/widget/RoutingSearch;

    invoke-virtual {v0}, Lcom/thetransitapp/droid/widget/RoutingSearch;->onPause()V

    .line 221
    :cond_0
    return-void
.end method

.method public onResult(Lcom/thetransitapp/droid/model/RoutingRequest;)V
    .locals 5
    .param p1, "result"    # Lcom/thetransitapp/droid/model/RoutingRequest;

    .prologue
    const/4 v4, 0x0

    .line 274
    invoke-virtual {p1}, Lcom/thetransitapp/droid/model/RoutingRequest;->getError()Lcom/thetransitapp/droid/model/RoutingRequest$ErrorType;

    move-result-object v1

    invoke-virtual {p1}, Lcom/thetransitapp/droid/model/RoutingRequest;->getErrorTitle()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/thetransitapp/droid/model/RoutingRequest;->getErrorMessage()Ljava/lang/String;

    move-result-object v3

    invoke-direct {p0, v1, v2, v3}, Lcom/thetransitapp/droid/RoutingScreen;->onError(Lcom/thetransitapp/droid/model/RoutingRequest$ErrorType;Ljava/lang/String;Ljava/lang/String;)V

    .line 276
    invoke-virtual {p1}, Lcom/thetransitapp/droid/model/RoutingRequest;->getItineraries()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {p1}, Lcom/thetransitapp/droid/model/RoutingRequest;->getItineraries()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    .line 277
    invoke-super {p0}, Lcom/thetransitapp/droid/BaseMapScreen;->getSherlockActivity()Lcom/actionbarsherlock/app/SherlockFragmentActivity;

    move-result-object v1

    invoke-virtual {v1}, Lcom/actionbarsherlock/app/SherlockFragmentActivity;->getSupportActionBar()Lcom/actionbarsherlock/app/ActionBar;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lcom/actionbarsherlock/app/ActionBar;->setDisplayHomeAsUpEnabled(Z)V

    .line 279
    new-instance v1, Lcom/thetransitapp/droid/widget/RoutingDetails;

    invoke-direct {v1}, Lcom/thetransitapp/droid/widget/RoutingDetails;-><init>()V

    iput-object v1, p0, Lcom/thetransitapp/droid/RoutingScreen;->routingDetails:Lcom/thetransitapp/droid/widget/RoutingDetails;

    .line 280
    iget-object v1, p0, Lcom/thetransitapp/droid/RoutingScreen;->routingDetails:Lcom/thetransitapp/droid/widget/RoutingDetails;

    invoke-virtual {v1, p0}, Lcom/thetransitapp/droid/widget/RoutingDetails;->setOnDetailClickListener(Lcom/thetransitapp/droid/widget/RoutingDetails$OnDetailClickListener;)V

    .line 281
    iget-object v1, p0, Lcom/thetransitapp/droid/RoutingScreen;->routingDetails:Lcom/thetransitapp/droid/widget/RoutingDetails;

    invoke-virtual {p1}, Lcom/thetransitapp/droid/model/RoutingRequest;->getItineraries()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/thetransitapp/droid/widget/RoutingDetails;->setPossibleItineraries(Ljava/util/List;)V

    .line 282
    iget-object v2, p0, Lcom/thetransitapp/droid/RoutingScreen;->routingDetails:Lcom/thetransitapp/droid/widget/RoutingDetails;

    invoke-virtual {p1}, Lcom/thetransitapp/droid/model/RoutingRequest;->getItineraries()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/thetransitapp/droid/model/RoutingItinerary;

    invoke-virtual {v2, v1}, Lcom/thetransitapp/droid/widget/RoutingDetails;->setDisplayedItinerary(Lcom/thetransitapp/droid/model/RoutingItinerary;)V

    .line 284
    iget-object v1, p0, Lcom/thetransitapp/droid/RoutingScreen;->stepsMenuItem:Lcom/actionbarsherlock/view/MenuItem;

    if-eqz v1, :cond_0

    .line 285
    iget-object v1, p0, Lcom/thetransitapp/droid/RoutingScreen;->stepsMenuItem:Lcom/actionbarsherlock/view/MenuItem;

    iget-object v2, p0, Lcom/thetransitapp/droid/RoutingScreen;->routingDetails:Lcom/thetransitapp/droid/widget/RoutingDetails;

    invoke-interface {v1, v2}, Lcom/actionbarsherlock/view/MenuItem;->setOnMenuItemClickListener(Lcom/actionbarsherlock/view/MenuItem$OnMenuItemClickListener;)Lcom/actionbarsherlock/view/MenuItem;

    .line 288
    :cond_0
    invoke-super {p0}, Lcom/thetransitapp/droid/BaseMapScreen;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v4/app/FragmentActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    .line 289
    .local v0, "transaction":Landroid/support/v4/app/FragmentTransaction;
    const v1, 0x7f050091

    iget-object v2, p0, Lcom/thetransitapp/droid/RoutingScreen;->routingDetails:Lcom/thetransitapp/droid/widget/RoutingDetails;

    invoke-virtual {v0, v1, v2}, Landroid/support/v4/app/FragmentTransaction;->replace(ILandroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    .line 290
    sget-object v1, Lcom/thetransitapp/droid/TransitActivity$TransitScreen;->ROUTING_SCREEN_DETAILS:Lcom/thetransitapp/droid/TransitActivity$TransitScreen;

    invoke-virtual {v1}, Lcom/thetransitapp/droid/TransitActivity$TransitScreen;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentTransaction;->addToBackStack(Ljava/lang/String;)Landroid/support/v4/app/FragmentTransaction;

    .line 291
    invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->commit()I

    .line 293
    invoke-virtual {p1}, Lcom/thetransitapp/droid/model/RoutingRequest;->getItineraries()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/thetransitapp/droid/model/RoutingItinerary;

    invoke-virtual {p0, v1}, Lcom/thetransitapp/droid/RoutingScreen;->showItinerary(Lcom/thetransitapp/droid/model/RoutingItinerary;)V

    .line 296
    .end local v0    # "transaction":Landroid/support/v4/app/FragmentTransaction;
    :cond_1
    iget-object v1, p0, Lcom/thetransitapp/droid/RoutingScreen;->oldDirectionLoaded:Lcom/thetransitapp/droid/model/RoutingRequest;

    if-nez v1, :cond_2

    .line 297
    invoke-direct {p0, p1}, Lcom/thetransitapp/droid/RoutingScreen;->saveResult(Lcom/thetransitapp/droid/model/RoutingRequest;)V

    .line 299
    :cond_2
    return-void
.end method

.method public bridge synthetic onResult(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 1
    check-cast p1, Lcom/thetransitapp/droid/model/RoutingRequest;

    invoke-virtual {p0, p1}, Lcom/thetransitapp/droid/RoutingScreen;->onResult(Lcom/thetransitapp/droid/model/RoutingRequest;)V

    return-void
.end method

.method public onResume()V
    .locals 3

    .prologue
    .line 188
    invoke-super {p0}, Lcom/thetransitapp/droid/BaseMapScreen;->onResume()V

    .line 190
    iget-object v1, p0, Lcom/thetransitapp/droid/RoutingScreen;->feedManager:Lcom/thetransitapp/droid/controller/FeedManager;

    invoke-virtual {v1}, Lcom/thetransitapp/droid/controller/FeedManager;->isSelectionChanged()Z

    move-result v0

    .line 192
    .local v0, "changed":Z
    iget-object v1, p0, Lcom/thetransitapp/droid/RoutingScreen;->routingSearch:Lcom/thetransitapp/droid/widget/RoutingSearch;

    if-eqz v1, :cond_0

    .line 193
    iget-object v1, p0, Lcom/thetransitapp/droid/RoutingScreen;->routingSearch:Lcom/thetransitapp/droid/widget/RoutingSearch;

    invoke-virtual {v1, p0}, Lcom/thetransitapp/droid/widget/RoutingSearch;->setDelegate(Lcom/thetransitapp/droid/widget/RoutingSearch$RoutingSearchDelegate;)V

    .line 196
    :cond_0
    iget-object v1, p0, Lcom/thetransitapp/droid/RoutingScreen;->oldDirectionLoaded:Lcom/thetransitapp/droid/model/RoutingRequest;

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/thetransitapp/droid/RoutingScreen;->routingDetails:Lcom/thetransitapp/droid/widget/RoutingDetails;

    if-nez v1, :cond_1

    if-nez v0, :cond_1

    .line 197
    iget-object v1, p0, Lcom/thetransitapp/droid/RoutingScreen;->oldDirectionLoaded:Lcom/thetransitapp/droid/model/RoutingRequest;

    invoke-virtual {p0, v1}, Lcom/thetransitapp/droid/RoutingScreen;->onResult(Lcom/thetransitapp/droid/model/RoutingRequest;)V

    .line 200
    :cond_1
    iget-object v1, p0, Lcom/thetransitapp/droid/RoutingScreen;->routingDetails:Lcom/thetransitapp/droid/widget/RoutingDetails;

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/thetransitapp/droid/RoutingScreen;->routingDetails:Lcom/thetransitapp/droid/widget/RoutingDetails;

    invoke-virtual {v1}, Lcom/thetransitapp/droid/widget/RoutingDetails;->isVisible()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 201
    invoke-super {p0}, Lcom/thetransitapp/droid/BaseMapScreen;->getSherlockActivity()Lcom/actionbarsherlock/app/SherlockFragmentActivity;

    move-result-object v1

    invoke-virtual {v1}, Lcom/actionbarsherlock/app/SherlockFragmentActivity;->getSupportActionBar()Lcom/actionbarsherlock/app/ActionBar;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lcom/actionbarsherlock/app/ActionBar;->setDisplayHomeAsUpEnabled(Z)V

    .line 203
    if-eqz v0, :cond_3

    .line 204
    invoke-super {p0}, Lcom/thetransitapp/droid/BaseMapScreen;->getFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v4/app/FragmentManager;->popBackStack()V

    .line 205
    iget-object v1, p0, Lcom/thetransitapp/droid/RoutingScreen;->routeButton:Landroid/widget/Button;

    invoke-virtual {v1}, Landroid/widget/Button;->performClick()Z

    .line 210
    :cond_2
    :goto_0
    return-void

    .line 206
    :cond_3
    iget-object v1, p0, Lcom/thetransitapp/droid/RoutingScreen;->currentShownItinerary:Lcom/thetransitapp/droid/model/RoutingItinerary;

    if-eqz v1, :cond_2

    .line 207
    iget-object v1, p0, Lcom/thetransitapp/droid/RoutingScreen;->currentShownItinerary:Lcom/thetransitapp/droid/model/RoutingItinerary;

    invoke-virtual {p0, v1}, Lcom/thetransitapp/droid/RoutingScreen;->showItinerary(Lcom/thetransitapp/droid/model/RoutingItinerary;)V

    goto :goto_0
.end method

.method public onRouteClick()V
    .locals 6

    .prologue
    const/4 v3, 0x0

    .line 416
    iget-object v4, p0, Lcom/thetransitapp/droid/RoutingScreen;->routingSearch:Lcom/thetransitapp/droid/widget/RoutingSearch;

    invoke-virtual {v4}, Lcom/thetransitapp/droid/widget/RoutingSearch;->getRoutingRequest()Lcom/thetransitapp/droid/model/RoutingRequest;

    move-result-object v1

    .line 418
    .local v1, "request":Lcom/thetransitapp/droid/model/RoutingRequest;
    if-eqz v1, :cond_1

    .line 419
    iget-object v4, p0, Lcom/thetransitapp/droid/RoutingScreen;->feedManager:Lcom/thetransitapp/droid/controller/FeedManager;

    invoke-virtual {v4}, Lcom/thetransitapp/droid/controller/FeedManager;->isReady()Z

    move-result v4

    if-eqz v4, :cond_0

    .line 420
    iget-object v4, p0, Lcom/thetransitapp/droid/RoutingScreen;->feedManager:Lcom/thetransitapp/droid/controller/FeedManager;

    invoke-virtual {v4}, Lcom/thetransitapp/droid/controller/FeedManager;->getClosestBundle()Lcom/thetransitapp/droid/model/TransitBundle;

    move-result-object v4

    invoke-virtual {v4}, Lcom/thetransitapp/droid/model/TransitBundle;->getServer()Lcom/thetransitapp/droid/model/TransitServer;

    move-result-object v4

    invoke-virtual {v4}, Lcom/thetransitapp/droid/model/TransitServer;->getRouterId()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Lcom/thetransitapp/droid/model/RoutingRequest;->setFeedId(Ljava/lang/String;)V

    .line 423
    :cond_0
    invoke-virtual {v1}, Lcom/thetransitapp/droid/model/RoutingRequest;->isArriveBy()Z

    move-result v4

    if-eqz v4, :cond_2

    move-object v2, v3

    .line 424
    .local v2, "startTime":Ljava/util/Date;
    :goto_0
    invoke-virtual {v1}, Lcom/thetransitapp/droid/model/RoutingRequest;->isArriveBy()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-virtual {v1}, Lcom/thetransitapp/droid/model/RoutingRequest;->getDate()Ljava/util/Date;

    move-result-object v0

    .line 425
    .local v0, "endTime":Ljava/util/Date;
    :goto_1
    iget-object v3, p0, Lcom/thetransitapp/droid/RoutingScreen;->statsManager:Lcom/thetransitapp/droid/model/stats/StatsManager;

    invoke-virtual {v1}, Lcom/thetransitapp/droid/model/RoutingRequest;->getStart()Lcom/thetransitapp/droid/model/SimplePlacemark;

    move-result-object v4

    invoke-virtual {v4}, Lcom/thetransitapp/droid/model/SimplePlacemark;->toLatLng()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v4

    invoke-virtual {v1}, Lcom/thetransitapp/droid/model/RoutingRequest;->getEnd()Lcom/thetransitapp/droid/model/SimplePlacemark;

    move-result-object v5

    invoke-virtual {v5}, Lcom/thetransitapp/droid/model/SimplePlacemark;->toLatLng()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v5

    invoke-virtual {v3, v4, v5, v2, v0}, Lcom/thetransitapp/droid/model/stats/StatsManager;->recordPlanRequest(Lcom/google/android/gms/maps/model/LatLng;Lcom/google/android/gms/maps/model/LatLng;Ljava/util/Date;Ljava/util/Date;)V

    .line 428
    new-instance v3, Lcom/thetransitapp/droid/service/RoutingTask;

    invoke-super {p0}, Lcom/thetransitapp/droid/BaseMapScreen;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v4

    invoke-direct {v3, v4, v1, p0}, Lcom/thetransitapp/droid/service/RoutingTask;-><init>(Landroid/content/Context;Lcom/thetransitapp/droid/model/RoutingRequest;Lcom/thetransitapp/droid/service/ServiceCallback;)V

    invoke-virtual {v3}, Lcom/thetransitapp/droid/service/RoutingTask;->execute()V

    .line 430
    .end local v0    # "endTime":Ljava/util/Date;
    .end local v2    # "startTime":Ljava/util/Date;
    :cond_1
    return-void

    .line 423
    :cond_2
    invoke-virtual {v1}, Lcom/thetransitapp/droid/model/RoutingRequest;->getDate()Ljava/util/Date;

    move-result-object v2

    goto :goto_0

    .restart local v2    # "startTime":Ljava/util/Date;
    :cond_3
    move-object v0, v3

    .line 424
    goto :goto_1
.end method

.method public onStart()V
    .locals 3

    .prologue
    .line 175
    invoke-super {p0}, Lcom/thetransitapp/droid/BaseMapScreen;->onStart()V

    .line 177
    invoke-super {p0}, Lcom/thetransitapp/droid/BaseMapScreen;->getLastLocation()Landroid/location/Location;

    move-result-object v0

    .line 179
    .local v0, "location":Landroid/location/Location;
    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/thetransitapp/droid/RoutingScreen;->routingDetails:Lcom/thetransitapp/droid/widget/RoutingDetails;

    if-nez v1, :cond_0

    .line 180
    invoke-super {p0, v0}, Lcom/thetransitapp/droid/BaseMapScreen;->centerMap(Landroid/location/Location;)V

    .line 182
    iget-object v1, p0, Lcom/thetransitapp/droid/RoutingScreen;->feedManager:Lcom/thetransitapp/droid/controller/FeedManager;

    invoke-super {p0}, Lcom/thetransitapp/droid/BaseMapScreen;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Lcom/thetransitapp/droid/controller/FeedManager;->refresh(Landroid/location/Location;Landroid/content/Context;)V

    .line 184
    :cond_0
    return-void
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 18
    .param p1, "view"    # Landroid/view/View;
    .param p2, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    .line 104
    invoke-super/range {p0 .. p2}, Lcom/thetransitapp/droid/BaseMapScreen;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 106
    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/thetransitapp/droid/RoutingScreen;->routingSearch:Lcom/thetransitapp/droid/widget/RoutingSearch;

    if-eqz v13, :cond_0

    .line 171
    :goto_0
    return-void

    .line 110
    :cond_0
    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/thetransitapp/droid/RoutingScreen;->preferences:Landroid/content/SharedPreferences;

    const-string v14, "lastRouting"

    const-string v15, "{}"

    invoke-interface {v13, v14, v15}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v13}, Ljava/lang/String;->getBytes()[B

    move-result-object v4

    .line 113
    .local v4, "bytes":[B
    :try_start_0
    array-length v13, v4

    if-eqz v13, :cond_2

    .line 114
    new-instance v3, Ljava/io/ByteArrayInputStream;

    invoke-direct {v3, v4}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 115
    .local v3, "byteArray":Ljava/io/ByteArrayInputStream;
    new-instance v2, Landroid/util/Base64InputStream;

    const/4 v13, 0x0

    invoke-direct {v2, v3, v13}, Landroid/util/Base64InputStream;-><init>(Ljava/io/InputStream;I)V

    .line 117
    .local v2, "base64InputStream":Landroid/util/Base64InputStream;
    new-instance v7, Ljava/io/ObjectInputStream;

    invoke-direct {v7, v2}, Ljava/io/ObjectInputStream;-><init>(Ljava/io/InputStream;)V

    .line 118
    .local v7, "in":Ljava/io/ObjectInputStream;
    invoke-virtual {v7}, Ljava/io/ObjectInputStream;->readObject()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/thetransitapp/droid/model/RoutingRequest;

    .line 119
    .local v11, "result":Lcom/thetransitapp/droid/model/RoutingRequest;
    invoke-virtual {v7}, Ljava/io/ObjectInputStream;->close()V

    .line 120
    invoke-virtual {v2}, Landroid/util/Base64InputStream;->close()V

    .line 121
    invoke-virtual {v3}, Ljava/io/ByteArrayInputStream;->close()V

    .line 123
    new-instance v13, Ljava/util/Date;

    invoke-direct {v13}, Ljava/util/Date;-><init>()V

    invoke-virtual {v13}, Ljava/util/Date;->getTime()J

    move-result-wide v9

    .line 124
    .local v9, "now":J
    const/4 v6, 0x0

    .line 126
    .local v6, "good":Z
    invoke-virtual {v11}, Lcom/thetransitapp/droid/model/RoutingRequest;->getItineraries()Ljava/util/List;

    move-result-object v13

    invoke-interface {v13}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :cond_1
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-nez v14, :cond_3

    .line 133
    :goto_1
    if-eqz v6, :cond_4

    .line 134
    move-object/from16 v0, p0

    iput-object v11, v0, Lcom/thetransitapp/droid/RoutingScreen;->oldDirectionLoaded:Lcom/thetransitapp/droid/model/RoutingRequest;
    :try_end_0
    .catch Ljava/io/StreamCorruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_2

    .line 149
    .end local v2    # "base64InputStream":Landroid/util/Base64InputStream;
    .end local v3    # "byteArray":Ljava/io/ByteArrayInputStream;
    .end local v6    # "good":Z
    .end local v7    # "in":Ljava/io/ObjectInputStream;
    .end local v9    # "now":J
    .end local v11    # "result":Lcom/thetransitapp/droid/model/RoutingRequest;
    :cond_2
    :goto_2
    invoke-super/range {p0 .. p0}, Lcom/thetransitapp/droid/BaseMapScreen;->getArguments()Landroid/os/Bundle;

    move-result-object v13

    if-eqz v13, :cond_5

    .line 150
    new-instance v1, Landroid/os/Bundle;

    invoke-super/range {p0 .. p0}, Lcom/thetransitapp/droid/BaseMapScreen;->getArguments()Landroid/os/Bundle;

    move-result-object v13

    invoke-direct {v1, v13}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 155
    .local v1, "args":Landroid/os/Bundle;
    :goto_3
    const-string v14, "oldDirectionLoaded"

    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/thetransitapp/droid/RoutingScreen;->oldDirectionLoaded:Lcom/thetransitapp/droid/model/RoutingRequest;

    if-eqz v13, :cond_6

    const/4 v13, 0x1

    :goto_4
    invoke-virtual {v1, v14, v13}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 157
    new-instance v13, Lcom/thetransitapp/droid/widget/RoutingSearch;

    invoke-direct {v13}, Lcom/thetransitapp/droid/widget/RoutingSearch;-><init>()V

    move-object/from16 v0, p0

    iput-object v13, v0, Lcom/thetransitapp/droid/RoutingScreen;->routingSearch:Lcom/thetransitapp/droid/widget/RoutingSearch;

    .line 158
    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/thetransitapp/droid/RoutingScreen;->routingSearch:Lcom/thetransitapp/droid/widget/RoutingSearch;

    invoke-virtual {v13, v1}, Lcom/thetransitapp/droid/widget/RoutingSearch;->setArguments(Landroid/os/Bundle;)V

    .line 160
    invoke-super/range {p0 .. p0}, Lcom/thetransitapp/droid/BaseMapScreen;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v13

    invoke-virtual {v13}, Landroid/support/v4/app/FragmentActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v13

    invoke-virtual {v13}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v12

    .line 161
    .local v12, "transaction":Landroid/support/v4/app/FragmentTransaction;
    const v13, 0x7f050091

    move-object/from16 v0, p0

    iget-object v14, v0, Lcom/thetransitapp/droid/RoutingScreen;->routingSearch:Lcom/thetransitapp/droid/widget/RoutingSearch;

    invoke-virtual {v12, v13, v14}, Landroid/support/v4/app/FragmentTransaction;->replace(ILandroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    .line 162
    invoke-virtual {v12}, Landroid/support/v4/app/FragmentTransaction;->commit()I

    .line 164
    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/thetransitapp/droid/RoutingScreen;->routeButton:Landroid/widget/Button;

    const/4 v14, 0x0

    invoke-virtual {v13, v14}, Landroid/widget/Button;->setEnabled(Z)V

    .line 165
    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/thetransitapp/droid/RoutingScreen;->routeButton:Landroid/widget/Button;

    new-instance v14, Lcom/thetransitapp/droid/RoutingScreen$1;

    move-object/from16 v0, p0

    invoke-direct {v14, v0}, Lcom/thetransitapp/droid/RoutingScreen$1;-><init>(Lcom/thetransitapp/droid/RoutingScreen;)V

    invoke-virtual {v13, v14}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto/16 :goto_0

    .line 126
    .end local v1    # "args":Landroid/os/Bundle;
    .end local v12    # "transaction":Landroid/support/v4/app/FragmentTransaction;
    .restart local v2    # "base64InputStream":Landroid/util/Base64InputStream;
    .restart local v3    # "byteArray":Ljava/io/ByteArrayInputStream;
    .restart local v6    # "good":Z
    .restart local v7    # "in":Ljava/io/ObjectInputStream;
    .restart local v9    # "now":J
    .restart local v11    # "result":Lcom/thetransitapp/droid/model/RoutingRequest;
    :cond_3
    :try_start_1
    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/thetransitapp/droid/model/RoutingItinerary;

    .line 127
    .local v8, "iti":Lcom/thetransitapp/droid/model/RoutingItinerary;
    invoke-virtual {v8}, Lcom/thetransitapp/droid/model/RoutingItinerary;->getEndTime()Ljava/util/Date;

    move-result-object v14

    invoke-virtual {v14}, Ljava/util/Date;->getTime()J

    move-result-wide v14

    const-wide/32 v16, 0x2bf20

    sub-long v16, v9, v16

    cmp-long v14, v14, v16

    if-lez v14, :cond_1

    .line 128
    const/4 v6, 0x1

    .line 129
    goto :goto_1

    .line 136
    .end local v8    # "iti":Lcom/thetransitapp/droid/model/RoutingItinerary;
    :cond_4
    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/thetransitapp/droid/RoutingScreen;->preferences:Landroid/content/SharedPreferences;

    invoke-interface {v13}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v13

    const-string v14, "lastRouting"

    invoke-interface {v13, v14}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v13

    invoke-interface {v13}, Landroid/content/SharedPreferences$Editor;->commit()Z
    :try_end_1
    .catch Ljava/io/StreamCorruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_1 .. :try_end_1} :catch_2

    goto/16 :goto_2

    .line 139
    .end local v2    # "base64InputStream":Landroid/util/Base64InputStream;
    .end local v3    # "byteArray":Ljava/io/ByteArrayInputStream;
    .end local v6    # "good":Z
    .end local v7    # "in":Ljava/io/ObjectInputStream;
    .end local v9    # "now":J
    .end local v11    # "result":Lcom/thetransitapp/droid/model/RoutingRequest;
    :catch_0
    move-exception v5

    .line 140
    .local v5, "e":Ljava/io/StreamCorruptedException;
    invoke-virtual {v5}, Ljava/io/StreamCorruptedException;->printStackTrace()V

    goto/16 :goto_2

    .line 141
    .end local v5    # "e":Ljava/io/StreamCorruptedException;
    :catch_1
    move-exception v5

    .line 142
    .local v5, "e":Ljava/io/IOException;
    invoke-virtual {v5}, Ljava/io/IOException;->printStackTrace()V

    goto/16 :goto_2

    .line 143
    .end local v5    # "e":Ljava/io/IOException;
    :catch_2
    move-exception v5

    .line 144
    .local v5, "e":Ljava/lang/ClassNotFoundException;
    invoke-virtual {v5}, Ljava/lang/ClassNotFoundException;->printStackTrace()V

    goto/16 :goto_2

    .line 152
    .end local v5    # "e":Ljava/lang/ClassNotFoundException;
    :cond_5
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .restart local v1    # "args":Landroid/os/Bundle;
    goto/16 :goto_3

    .line 155
    :cond_6
    const/4 v13, 0x0

    goto/16 :goto_4
.end method

.method public routeButtonStatusChange(ZZZ)V
    .locals 5
    .param p1, "enabled"    # Z
    .param p2, "hidden"    # Z
    .param p3, "click"    # Z

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 522
    if-eqz p3, :cond_2

    if-eqz p1, :cond_2

    if-nez p2, :cond_2

    move v0, v1

    .line 524
    .local v0, "shouldClick":Z
    :goto_0
    iget-object v3, p0, Lcom/thetransitapp/droid/RoutingScreen;->routeButton:Landroid/widget/Button;

    invoke-virtual {v3, p1}, Landroid/widget/Button;->setEnabled(Z)V

    .line 525
    iget-object v4, p0, Lcom/thetransitapp/droid/RoutingScreen;->routeButton:Landroid/widget/Button;

    if-eqz p2, :cond_3

    const/4 v3, 0x4

    :goto_1
    invoke-virtual {v4, v3}, Landroid/widget/Button;->setVisibility(I)V

    .line 527
    iget-object v3, p0, Lcom/thetransitapp/droid/RoutingScreen;->directionMenuItem:Lcom/actionbarsherlock/view/MenuItem;

    if-eqz v3, :cond_0

    .line 528
    iget-object v4, p0, Lcom/thetransitapp/droid/RoutingScreen;->directionMenuItem:Lcom/actionbarsherlock/view/MenuItem;

    if-eqz p2, :cond_4

    move v3, v2

    :goto_2
    invoke-interface {v4, v3}, Lcom/actionbarsherlock/view/MenuItem;->setVisible(Z)Lcom/actionbarsherlock/view/MenuItem;

    .line 529
    iget-object v3, p0, Lcom/thetransitapp/droid/RoutingScreen;->timeMenuItem:Lcom/actionbarsherlock/view/MenuItem;

    if-eqz p2, :cond_5

    :goto_3
    invoke-interface {v3, v2}, Lcom/actionbarsherlock/view/MenuItem;->setVisible(Z)Lcom/actionbarsherlock/view/MenuItem;

    .line 530
    iget-object v1, p0, Lcom/thetransitapp/droid/RoutingScreen;->stepsMenuItem:Lcom/actionbarsherlock/view/MenuItem;

    invoke-interface {v1, p2}, Lcom/actionbarsherlock/view/MenuItem;->setVisible(Z)Lcom/actionbarsherlock/view/MenuItem;

    .line 533
    :cond_0
    if-eqz v0, :cond_1

    .line 534
    invoke-virtual {p0}, Lcom/thetransitapp/droid/RoutingScreen;->onRouteClick()V

    .line 536
    :cond_1
    return-void

    .end local v0    # "shouldClick":Z
    :cond_2
    move v0, v2

    .line 522
    goto :goto_0

    .restart local v0    # "shouldClick":Z
    :cond_3
    move v3, v2

    .line 525
    goto :goto_1

    :cond_4
    move v3, v1

    .line 528
    goto :goto_2

    :cond_5
    move v2, v1

    .line 529
    goto :goto_3
.end method

.method public shouldClearItineraries()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 540
    invoke-virtual {p0}, Lcom/thetransitapp/droid/RoutingScreen;->clear()V

    .line 541
    iput-object v0, p0, Lcom/thetransitapp/droid/RoutingScreen;->oldDirectionLoaded:Lcom/thetransitapp/droid/model/RoutingRequest;

    .line 542
    iput-object v0, p0, Lcom/thetransitapp/droid/RoutingScreen;->routingDetails:Lcom/thetransitapp/droid/widget/RoutingDetails;

    .line 543
    return-void
.end method

.method public showItinerary(Lcom/thetransitapp/droid/model/RoutingItinerary;)V
    .locals 20
    .param p1, "routingItinerary"    # Lcom/thetransitapp/droid/model/RoutingItinerary;

    .prologue
    .line 333
    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/RoutingScreen;->clear()V

    .line 335
    move-object/from16 v0, p1

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/thetransitapp/droid/RoutingScreen;->currentShownItinerary:Lcom/thetransitapp/droid/model/RoutingItinerary;

    .line 337
    invoke-virtual/range {p1 .. p1}, Lcom/thetransitapp/droid/model/RoutingItinerary;->getLegs()Ljava/util/List;

    move-result-object v15

    invoke-interface {v15}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v15

    :goto_0
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    move-result v16

    if-nez v16, :cond_0

    .line 405
    invoke-super/range {p0 .. p0}, Lcom/thetransitapp/droid/BaseMapScreen;->getMap()Lcom/google/android/gms/maps/GoogleMap;

    move-result-object v15

    invoke-virtual {v15}, Lcom/google/android/gms/maps/GoogleMap;->getCameraPosition()Lcom/google/android/gms/maps/model/CameraPosition;

    move-result-object v15

    move-object/from16 v0, p0

    invoke-virtual {v0, v15}, Lcom/thetransitapp/droid/RoutingScreen;->onCameraChange(Lcom/google/android/gms/maps/model/CameraPosition;)V

    .line 407
    invoke-direct/range {p0 .. p1}, Lcom/thetransitapp/droid/RoutingScreen;->addMarkers(Lcom/thetransitapp/droid/model/RoutingItinerary;)V

    .line 408
    return-void

    .line 337
    :cond_0
    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/thetransitapp/droid/model/RoutingLeg;

    .line 338
    .local v4, "leg":Lcom/thetransitapp/droid/model/RoutingLeg;
    const v14, 0x55ffffff    # 3.518437E13f

    .line 339
    .local v14, "textColor":I
    const/high16 v2, -0x67000000

    .line 341
    .local v2, "color":I
    invoke-virtual {v4}, Lcom/thetransitapp/droid/model/RoutingLeg;->getLegType()Lcom/thetransitapp/droid/model/RoutingLeg$LegType;

    move-result-object v16

    sget-object v17, Lcom/thetransitapp/droid/model/RoutingLeg$LegType;->TRANSIT:Lcom/thetransitapp/droid/model/RoutingLeg$LegType;

    move-object/from16 v0, v16

    move-object/from16 v1, v17

    if-ne v0, v1, :cond_1

    .line 342
    const/4 v14, -0x1

    .line 343
    invoke-virtual {v4}, Lcom/thetransitapp/droid/model/RoutingLeg;->getRoute()Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;->getPathColor()I

    move-result v2

    .line 346
    :cond_1
    new-instance v6, Lcom/google/android/gms/maps/model/PolylineOptions;

    invoke-direct {v6}, Lcom/google/android/gms/maps/model/PolylineOptions;-><init>()V

    .line 347
    .local v6, "lineBack":Lcom/google/android/gms/maps/model/PolylineOptions;
    new-instance v5, Lcom/google/android/gms/maps/model/PolylineOptions;

    invoke-direct {v5}, Lcom/google/android/gms/maps/model/PolylineOptions;-><init>()V

    .line 348
    .local v5, "line":Lcom/google/android/gms/maps/model/PolylineOptions;
    invoke-virtual {v6, v14}, Lcom/google/android/gms/maps/model/PolylineOptions;->color(I)Lcom/google/android/gms/maps/model/PolylineOptions;

    .line 349
    invoke-virtual {v5, v2}, Lcom/google/android/gms/maps/model/PolylineOptions;->color(I)Lcom/google/android/gms/maps/model/PolylineOptions;

    .line 351
    invoke-virtual {v4}, Lcom/thetransitapp/droid/model/RoutingLeg;->getShape()Ljava/lang/String;

    move-result-object v12

    .line 352
    .local v12, "shape":Ljava/lang/String;
    if-eqz v12, :cond_2

    .line 353
    invoke-static {v12}, Lcom/thetransitapp/droid/util/PolylineUtility;->decodePoly(Ljava/lang/String;)Ljava/util/List;

    move-result-object v10

    .line 355
    .local v10, "points":Ljava/util/List;, "Ljava/util/List<Lcom/google/android/gms/maps/model/LatLng;>;"
    invoke-virtual {v6, v10}, Lcom/google/android/gms/maps/model/PolylineOptions;->addAll(Ljava/lang/Iterable;)Lcom/google/android/gms/maps/model/PolylineOptions;

    .line 356
    invoke-virtual {v5, v10}, Lcom/google/android/gms/maps/model/PolylineOptions;->addAll(Ljava/lang/Iterable;)Lcom/google/android/gms/maps/model/PolylineOptions;

    .line 360
    .end local v10    # "points":Ljava/util/List;, "Ljava/util/List<Lcom/google/android/gms/maps/model/LatLng;>;"
    :cond_2
    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/RoutingScreen;->getResources()Landroid/content/res/Resources;

    move-result-object v16

    const v17, 0x7f080024

    invoke-virtual/range {v16 .. v17}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v16

    .line 361
    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/RoutingScreen;->getResources()Landroid/content/res/Resources;

    move-result-object v17

    const v18, 0x7f080025

    invoke-virtual/range {v17 .. v18}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v17

    .line 359
    move/from16 v0, v16

    move/from16 v1, v17

    invoke-static {v2, v0, v1}, Lcom/thetransitapp/droid/util/BitmapUtility;->getPin(III)Landroid/graphics/Bitmap;

    move-result-object v8

    .line 362
    .local v8, "pinBitmap":Landroid/graphics/Bitmap;
    invoke-static {v8}, Lcom/google/android/gms/maps/model/BitmapDescriptorFactory;->fromBitmap(Landroid/graphics/Bitmap;)Lcom/google/android/gms/maps/model/BitmapDescriptor;

    move-result-object v9

    .line 366
    .local v9, "pinDescriptor":Lcom/google/android/gms/maps/model/BitmapDescriptor;
    invoke-virtual {v4}, Lcom/thetransitapp/droid/model/RoutingLeg;->getLegType()Lcom/thetransitapp/droid/model/RoutingLeg$LegType;

    move-result-object v16

    sget-object v17, Lcom/thetransitapp/droid/model/RoutingLeg$LegType;->TRANSIT:Lcom/thetransitapp/droid/model/RoutingLeg$LegType;

    move-object/from16 v0, v16

    move-object/from16 v1, v17

    if-ne v0, v1, :cond_5

    .line 367
    invoke-virtual {v4}, Lcom/thetransitapp/droid/model/RoutingLeg;->getFromPlacemark()Lcom/thetransitapp/droid/model/SimplePlacemark;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Lcom/thetransitapp/droid/model/SimplePlacemark;->toLatLng()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v11

    .line 368
    .local v11, "pos":Lcom/google/android/gms/maps/model/LatLng;
    new-instance v16, Lcom/google/android/gms/maps/model/MarkerOptions;

    invoke-direct/range {v16 .. v16}, Lcom/google/android/gms/maps/model/MarkerOptions;-><init>()V

    move-object/from16 v0, v16

    invoke-virtual {v0, v11}, Lcom/google/android/gms/maps/model/MarkerOptions;->position(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v16

    move-object/from16 v0, v16

    invoke-virtual {v0, v9}, Lcom/google/android/gms/maps/model/MarkerOptions;->icon(Lcom/google/android/gms/maps/model/BitmapDescriptor;)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v16

    const/high16 v17, 0x3f000000    # 0.5f

    const/high16 v18, 0x3f000000    # 0.5f

    invoke-virtual/range {v16 .. v18}, Lcom/google/android/gms/maps/model/MarkerOptions;->anchor(FF)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v16

    .line 369
    invoke-virtual {v4}, Lcom/thetransitapp/droid/model/RoutingLeg;->getFromPlacemark()Lcom/thetransitapp/droid/model/SimplePlacemark;

    move-result-object v17

    invoke-virtual/range {v17 .. v17}, Lcom/thetransitapp/droid/model/SimplePlacemark;->getName()Ljava/lang/String;

    move-result-object v17

    invoke-virtual/range {v16 .. v17}, Lcom/google/android/gms/maps/model/MarkerOptions;->title(Ljava/lang/String;)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v7

    .line 370
    .local v7, "options":Lcom/google/android/gms/maps/model/MarkerOptions;
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/thetransitapp/droid/RoutingScreen;->legMarkers:Ljava/util/List;

    move-object/from16 v16, v0

    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/RoutingScreen;->getMap()Lcom/google/android/gms/maps/GoogleMap;

    move-result-object v17

    move-object/from16 v0, v17

    invoke-virtual {v0, v7}, Lcom/google/android/gms/maps/GoogleMap;->addMarker(Lcom/google/android/gms/maps/model/MarkerOptions;)Lcom/google/android/gms/maps/model/Marker;

    move-result-object v17

    invoke-interface/range {v16 .. v17}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 372
    invoke-virtual {v4}, Lcom/thetransitapp/droid/model/RoutingLeg;->getToPlacemark()Lcom/thetransitapp/droid/model/SimplePlacemark;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Lcom/thetransitapp/droid/model/SimplePlacemark;->toLatLng()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v11

    .line 373
    new-instance v16, Lcom/google/android/gms/maps/model/MarkerOptions;

    invoke-direct/range {v16 .. v16}, Lcom/google/android/gms/maps/model/MarkerOptions;-><init>()V

    move-object/from16 v0, v16

    invoke-virtual {v0, v11}, Lcom/google/android/gms/maps/model/MarkerOptions;->position(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v16

    move-object/from16 v0, v16

    invoke-virtual {v0, v9}, Lcom/google/android/gms/maps/model/MarkerOptions;->icon(Lcom/google/android/gms/maps/model/BitmapDescriptor;)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v16

    const/high16 v17, 0x3f000000    # 0.5f

    const/high16 v18, 0x3f000000    # 0.5f

    invoke-virtual/range {v16 .. v18}, Lcom/google/android/gms/maps/model/MarkerOptions;->anchor(FF)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v16

    .line 374
    invoke-virtual {v4}, Lcom/thetransitapp/droid/model/RoutingLeg;->getToPlacemark()Lcom/thetransitapp/droid/model/SimplePlacemark;

    move-result-object v17

    invoke-virtual/range {v17 .. v17}, Lcom/thetransitapp/droid/model/SimplePlacemark;->getName()Ljava/lang/String;

    move-result-object v17

    invoke-virtual/range {v16 .. v17}, Lcom/google/android/gms/maps/model/MarkerOptions;->title(Ljava/lang/String;)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v7

    .line 375
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/thetransitapp/droid/RoutingScreen;->legMarkers:Ljava/util/List;

    move-object/from16 v16, v0

    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/RoutingScreen;->getMap()Lcom/google/android/gms/maps/GoogleMap;

    move-result-object v17

    move-object/from16 v0, v17

    invoke-virtual {v0, v7}, Lcom/google/android/gms/maps/GoogleMap;->addMarker(Lcom/google/android/gms/maps/model/MarkerOptions;)Lcom/google/android/gms/maps/model/Marker;

    move-result-object v17

    invoke-interface/range {v16 .. v17}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 377
    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/RoutingScreen;->getResources()Landroid/content/res/Resources;

    move-result-object v16

    const v17, 0x7f080020

    invoke-virtual/range {v16 .. v17}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v16

    move/from16 v0, v16

    int-to-float v0, v0

    move/from16 v16, v0

    move/from16 v0, v16

    invoke-virtual {v6, v0}, Lcom/google/android/gms/maps/model/PolylineOptions;->width(F)Lcom/google/android/gms/maps/model/PolylineOptions;

    .line 378
    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/RoutingScreen;->getResources()Landroid/content/res/Resources;

    move-result-object v16

    const v17, 0x7f080021

    invoke-virtual/range {v16 .. v17}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v16

    move/from16 v0, v16

    int-to-float v0, v0

    move/from16 v16, v0

    move/from16 v0, v16

    invoke-virtual {v5, v0}, Lcom/google/android/gms/maps/model/PolylineOptions;->width(F)Lcom/google/android/gms/maps/model/PolylineOptions;

    .line 384
    .end local v7    # "options":Lcom/google/android/gms/maps/model/MarkerOptions;
    .end local v11    # "pos":Lcom/google/android/gms/maps/model/LatLng;
    :goto_1
    invoke-virtual {v4}, Lcom/thetransitapp/droid/model/RoutingLeg;->getIntermediateStops()Ljava/util/List;

    move-result-object v16

    if-eqz v16, :cond_4

    invoke-virtual {v4}, Lcom/thetransitapp/droid/model/RoutingLeg;->getIntermediateStops()Ljava/util/List;

    move-result-object v16

    invoke-interface/range {v16 .. v16}, Ljava/util/List;->isEmpty()Z

    move-result v16

    if-nez v16, :cond_4

    .line 385
    invoke-virtual {v5}, Lcom/google/android/gms/maps/model/PolylineOptions;->getPoints()Ljava/util/List;

    move-result-object v16

    invoke-interface/range {v16 .. v16}, Ljava/util/List;->isEmpty()Z

    move-result v3

    .line 387
    .local v3, "drawLine":Z
    invoke-virtual {v4}, Lcom/thetransitapp/droid/model/RoutingLeg;->getIntermediateStops()Ljava/util/List;

    move-result-object v16

    invoke-interface/range {v16 .. v16}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v16

    :cond_3
    :goto_2
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    move-result v17

    if-nez v17, :cond_6

    .line 401
    .end local v3    # "drawLine":Z
    :cond_4
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/thetransitapp/droid/RoutingScreen;->drawnPoly:Ljava/util/List;

    move-object/from16 v16, v0

    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/RoutingScreen;->getMap()Lcom/google/android/gms/maps/GoogleMap;

    move-result-object v17

    move-object/from16 v0, v17

    invoke-virtual {v0, v6}, Lcom/google/android/gms/maps/GoogleMap;->addPolyline(Lcom/google/android/gms/maps/model/PolylineOptions;)Lcom/google/android/gms/maps/model/Polyline;

    move-result-object v17

    invoke-interface/range {v16 .. v17}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 402
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/thetransitapp/droid/RoutingScreen;->drawnPoly:Ljava/util/List;

    move-object/from16 v16, v0

    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/RoutingScreen;->getMap()Lcom/google/android/gms/maps/GoogleMap;

    move-result-object v17

    move-object/from16 v0, v17

    invoke-virtual {v0, v5}, Lcom/google/android/gms/maps/GoogleMap;->addPolyline(Lcom/google/android/gms/maps/model/PolylineOptions;)Lcom/google/android/gms/maps/model/Polyline;

    move-result-object v17

    invoke-interface/range {v16 .. v17}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 380
    :cond_5
    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/RoutingScreen;->getResources()Landroid/content/res/Resources;

    move-result-object v16

    const v17, 0x7f080022

    invoke-virtual/range {v16 .. v17}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v16

    move/from16 v0, v16

    int-to-float v0, v0

    move/from16 v16, v0

    move/from16 v0, v16

    invoke-virtual {v6, v0}, Lcom/google/android/gms/maps/model/PolylineOptions;->width(F)Lcom/google/android/gms/maps/model/PolylineOptions;

    .line 381
    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/RoutingScreen;->getResources()Landroid/content/res/Resources;

    move-result-object v16

    const v17, 0x7f080023

    invoke-virtual/range {v16 .. v17}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v16

    move/from16 v0, v16

    int-to-float v0, v0

    move/from16 v16, v0

    move/from16 v0, v16

    invoke-virtual {v5, v0}, Lcom/google/android/gms/maps/model/PolylineOptions;->width(F)Lcom/google/android/gms/maps/model/PolylineOptions;

    goto :goto_1

    .line 387
    .restart local v3    # "drawLine":Z
    :cond_6
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lcom/thetransitapp/droid/model/Stop;

    .line 388
    .local v13, "stop":Lcom/thetransitapp/droid/model/Stop;
    invoke-virtual {v13}, Lcom/thetransitapp/droid/model/Stop;->getPlacemark()Lcom/thetransitapp/droid/model/SimplePlacemark;

    move-result-object v17

    invoke-virtual/range {v17 .. v17}, Lcom/thetransitapp/droid/model/SimplePlacemark;->toLatLng()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v11

    .line 390
    .restart local v11    # "pos":Lcom/google/android/gms/maps/model/LatLng;
    new-instance v17, Lcom/google/android/gms/maps/model/MarkerOptions;

    invoke-direct/range {v17 .. v17}, Lcom/google/android/gms/maps/model/MarkerOptions;-><init>()V

    move-object/from16 v0, v17

    invoke-virtual {v0, v11}, Lcom/google/android/gms/maps/model/MarkerOptions;->position(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v17

    move-object/from16 v0, v17

    invoke-virtual {v0, v9}, Lcom/google/android/gms/maps/model/MarkerOptions;->icon(Lcom/google/android/gms/maps/model/BitmapDescriptor;)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v17

    const/high16 v18, 0x3f000000    # 0.5f

    const/high16 v19, 0x3f000000    # 0.5f

    invoke-virtual/range {v17 .. v19}, Lcom/google/android/gms/maps/model/MarkerOptions;->anchor(FF)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v17

    .line 391
    invoke-virtual {v13}, Lcom/thetransitapp/droid/model/Stop;->getPlacemark()Lcom/thetransitapp/droid/model/SimplePlacemark;

    move-result-object v18

    invoke-virtual/range {v18 .. v18}, Lcom/thetransitapp/droid/model/SimplePlacemark;->getName()Ljava/lang/String;

    move-result-object v18

    invoke-virtual/range {v17 .. v18}, Lcom/google/android/gms/maps/model/MarkerOptions;->title(Ljava/lang/String;)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v7

    .line 392
    .restart local v7    # "options":Lcom/google/android/gms/maps/model/MarkerOptions;
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/thetransitapp/droid/RoutingScreen;->drawnMarkers:Ljava/util/List;

    move-object/from16 v17, v0

    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/RoutingScreen;->getMap()Lcom/google/android/gms/maps/GoogleMap;

    move-result-object v18

    move-object/from16 v0, v18

    invoke-virtual {v0, v7}, Lcom/google/android/gms/maps/GoogleMap;->addMarker(Lcom/google/android/gms/maps/model/MarkerOptions;)Lcom/google/android/gms/maps/model/Marker;

    move-result-object v18

    invoke-interface/range {v17 .. v18}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 394
    if-eqz v3, :cond_3

    .line 395
    invoke-virtual {v6, v11}, Lcom/google/android/gms/maps/model/PolylineOptions;->add(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/PolylineOptions;

    .line 396
    invoke-virtual {v5, v11}, Lcom/google/android/gms/maps/model/PolylineOptions;->add(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/PolylineOptions;

    goto/16 :goto_2
.end method
