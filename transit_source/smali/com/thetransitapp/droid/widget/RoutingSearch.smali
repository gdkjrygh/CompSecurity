.class public Lcom/thetransitapp/droid/widget/RoutingSearch;
.super Lcom/thetransitapp/droid/BaseMapScreen;
.source "RoutingSearch.java"

# interfaces
.implements Lcom/google/android/gms/maps/GoogleMap$OnMapLongClickListener;
.implements Lcom/actionbarsherlock/view/MenuItem$OnMenuItemClickListener;
.implements Lcom/thetransitapp/droid/widget/DateTimeDialog$OnDateTimePickedListener;
.implements Landroid/widget/AdapterView$OnItemClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/thetransitapp/droid/widget/RoutingSearch$RoutingSearchDelegate;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/thetransitapp/droid/BaseMapScreen;",
        "Lcom/google/android/gms/maps/GoogleMap$OnMapLongClickListener;",
        "Lcom/actionbarsherlock/view/MenuItem$OnMenuItemClickListener;",
        "Lcom/thetransitapp/droid/widget/DateTimeDialog$OnDateTimePickedListener;",
        "Landroid/widget/AdapterView$OnItemClickListener;"
    }
.end annotation


# instance fields
.field private arriveBy:Z

.field private delegate:Lcom/thetransitapp/droid/widget/RoutingSearch$RoutingSearchDelegate;

.field private end:Lcom/google/android/gms/maps/model/MarkerOptions;

.field private endAutoComplete:Lcom/thetransitapp/droid/widget/PlacesAutoCompleteAdapter;

.field private endMarker:Lcom/google/android/gms/maps/model/Marker;

.field private endPin:Lcom/google/android/gms/maps/model/BitmapDescriptor;

.field private endSearch:Lcom/thetransitapp/droid/widget/SuggestionTextView;
    .annotation runtime Lroboguice/inject/InjectView;
        value = 0x7f050075
    .end annotation
.end field

.field private feedManager:Lcom/thetransitapp/droid/controller/FeedManager;
    .annotation runtime Lcom/google/inject/Inject;
    .end annotation
.end field

.field private start:Lcom/google/android/gms/maps/model/MarkerOptions;

.field private startAutoComplete:Lcom/thetransitapp/droid/widget/PlacesAutoCompleteAdapter;

.field private startMarker:Lcom/google/android/gms/maps/model/Marker;

.field private startPin:Lcom/google/android/gms/maps/model/BitmapDescriptor;

.field private startSearch:Lcom/thetransitapp/droid/widget/SuggestionTextView;
    .annotation runtime Lroboguice/inject/InjectView;
        value = 0x7f050074
    .end annotation
.end field

.field private tripDate:Ljava/util/Date;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 43
    invoke-direct {p0}, Lcom/thetransitapp/droid/BaseMapScreen;-><init>()V

    .line 51
    iput-object v0, p0, Lcom/thetransitapp/droid/widget/RoutingSearch;->startPin:Lcom/google/android/gms/maps/model/BitmapDescriptor;

    .line 52
    iput-object v0, p0, Lcom/thetransitapp/droid/widget/RoutingSearch;->endPin:Lcom/google/android/gms/maps/model/BitmapDescriptor;

    .line 75
    iput-object v0, p0, Lcom/thetransitapp/droid/widget/RoutingSearch;->tripDate:Ljava/util/Date;

    .line 43
    return-void
.end method

.method static synthetic access$0(Lcom/thetransitapp/droid/widget/RoutingSearch;)Z
    .locals 1

    .prologue
    .line 488
    invoke-direct {p0}, Lcom/thetransitapp/droid/widget/RoutingSearch;->shouldEnableRouteButton()Z

    move-result v0

    return v0
.end method

.method static synthetic access$1(Lcom/thetransitapp/droid/widget/RoutingSearch;)Lcom/thetransitapp/droid/widget/RoutingSearch$RoutingSearchDelegate;
    .locals 1

    .prologue
    .line 64
    iget-object v0, p0, Lcom/thetransitapp/droid/widget/RoutingSearch;->delegate:Lcom/thetransitapp/droid/widget/RoutingSearch$RoutingSearchDelegate;

    return-object v0
.end method

.method private getPlace(Lcom/google/android/gms/maps/model/MarkerOptions;)Lcom/thetransitapp/droid/model/SimplePlacemark;
    .locals 5
    .param p1, "options"    # Lcom/google/android/gms/maps/model/MarkerOptions;

    .prologue
    .line 478
    const/4 v0, 0x0

    .line 480
    .local v0, "place":Lcom/thetransitapp/droid/model/SimplePlacemark;
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/maps/model/MarkerOptions;->getPosition()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v1

    iget-wide v1, v1, Lcom/google/android/gms/maps/model/LatLng;->latitude:D

    const-wide/16 v3, 0x0

    cmpl-double v1, v1, v3

    if-eqz v1, :cond_0

    .line 481
    new-instance v0, Lcom/thetransitapp/droid/model/SimplePlacemark;

    .end local v0    # "place":Lcom/thetransitapp/droid/model/SimplePlacemark;
    invoke-virtual {p1}, Lcom/google/android/gms/maps/model/MarkerOptions;->getPosition()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/thetransitapp/droid/model/SimplePlacemark;-><init>(Lcom/google/android/gms/maps/model/LatLng;)V

    .line 482
    .restart local v0    # "place":Lcom/thetransitapp/droid/model/SimplePlacemark;
    invoke-virtual {p1}, Lcom/google/android/gms/maps/model/MarkerOptions;->getSnippet()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/thetransitapp/droid/model/SimplePlacemark;->setName(Ljava/lang/String;)V

    .line 485
    :cond_0
    return-object v0
.end method

.method private shouldEnableRouteButton()Z
    .locals 4

    .prologue
    const-wide/16 v2, 0x0

    .line 489
    iget-object v0, p0, Lcom/thetransitapp/droid/widget/RoutingSearch;->start:Lcom/google/android/gms/maps/model/MarkerOptions;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/thetransitapp/droid/widget/RoutingSearch;->start:Lcom/google/android/gms/maps/model/MarkerOptions;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/MarkerOptions;->getPosition()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v0

    iget-wide v0, v0, Lcom/google/android/gms/maps/model/LatLng;->latitude:D

    cmpl-double v0, v0, v2

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/thetransitapp/droid/widget/RoutingSearch;->end:Lcom/google/android/gms/maps/model/MarkerOptions;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/thetransitapp/droid/widget/RoutingSearch;->end:Lcom/google/android/gms/maps/model/MarkerOptions;

    .line 490
    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/MarkerOptions;->getPosition()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v0

    iget-wide v0, v0, Lcom/google/android/gms/maps/model/LatLng;->latitude:D

    cmpl-double v0, v0, v2

    if-eqz v0, :cond_0

    .line 489
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private showMarkers(Z)V
    .locals 11
    .param p1, "shouldCenter"    # Z

    .prologue
    const/4 v10, 0x0

    const-wide/16 v8, 0x0

    .line 429
    invoke-super {p0}, Lcom/thetransitapp/droid/BaseMapScreen;->getMap()Lcom/google/android/gms/maps/GoogleMap;

    move-result-object v6

    if-nez v6, :cond_1

    .line 475
    :cond_0
    :goto_0
    return-void

    .line 433
    :cond_1
    invoke-static {}, Lcom/google/android/gms/maps/model/LatLngBounds;->builder()Lcom/google/android/gms/maps/model/LatLngBounds$Builder;

    move-result-object v1

    .line 434
    .local v1, "builder":Lcom/google/android/gms/maps/model/LatLngBounds$Builder;
    const/4 v3, 0x0

    .line 436
    .local v3, "count":I
    iget-object v6, p0, Lcom/thetransitapp/droid/widget/RoutingSearch;->start:Lcom/google/android/gms/maps/model/MarkerOptions;

    invoke-virtual {v6}, Lcom/google/android/gms/maps/model/MarkerOptions;->getPosition()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v6

    iget-wide v6, v6, Lcom/google/android/gms/maps/model/LatLng;->latitude:D

    cmpl-double v6, v6, v8

    if-eqz v6, :cond_2

    .line 437
    iget-object v6, p0, Lcom/thetransitapp/droid/widget/RoutingSearch;->startMarker:Lcom/google/android/gms/maps/model/Marker;

    if-eqz v6, :cond_4

    .line 438
    iget-object v6, p0, Lcom/thetransitapp/droid/widget/RoutingSearch;->startMarker:Lcom/google/android/gms/maps/model/Marker;

    iget-object v7, p0, Lcom/thetransitapp/droid/widget/RoutingSearch;->start:Lcom/google/android/gms/maps/model/MarkerOptions;

    invoke-virtual {v7}, Lcom/google/android/gms/maps/model/MarkerOptions;->getPosition()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v7

    invoke-virtual {v6, v7}, Lcom/google/android/gms/maps/model/Marker;->setPosition(Lcom/google/android/gms/maps/model/LatLng;)V

    .line 444
    :goto_1
    iget-object v6, p0, Lcom/thetransitapp/droid/widget/RoutingSearch;->start:Lcom/google/android/gms/maps/model/MarkerOptions;

    invoke-virtual {v6}, Lcom/google/android/gms/maps/model/MarkerOptions;->getPosition()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v6

    invoke-virtual {v1, v6}, Lcom/google/android/gms/maps/model/LatLngBounds$Builder;->include(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/LatLngBounds$Builder;

    .line 445
    add-int/lit8 v3, v3, 0x1

    .line 448
    :cond_2
    iget-object v6, p0, Lcom/thetransitapp/droid/widget/RoutingSearch;->end:Lcom/google/android/gms/maps/model/MarkerOptions;

    invoke-virtual {v6}, Lcom/google/android/gms/maps/model/MarkerOptions;->getPosition()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v6

    iget-wide v6, v6, Lcom/google/android/gms/maps/model/LatLng;->latitude:D

    cmpl-double v6, v6, v8

    if-eqz v6, :cond_3

    .line 449
    iget-object v6, p0, Lcom/thetransitapp/droid/widget/RoutingSearch;->endMarker:Lcom/google/android/gms/maps/model/Marker;

    if-eqz v6, :cond_5

    .line 450
    iget-object v6, p0, Lcom/thetransitapp/droid/widget/RoutingSearch;->endMarker:Lcom/google/android/gms/maps/model/Marker;

    iget-object v7, p0, Lcom/thetransitapp/droid/widget/RoutingSearch;->end:Lcom/google/android/gms/maps/model/MarkerOptions;

    invoke-virtual {v7}, Lcom/google/android/gms/maps/model/MarkerOptions;->getPosition()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v7

    invoke-virtual {v6, v7}, Lcom/google/android/gms/maps/model/Marker;->setPosition(Lcom/google/android/gms/maps/model/LatLng;)V

    .line 456
    :goto_2
    iget-object v6, p0, Lcom/thetransitapp/droid/widget/RoutingSearch;->end:Lcom/google/android/gms/maps/model/MarkerOptions;

    invoke-virtual {v6}, Lcom/google/android/gms/maps/model/MarkerOptions;->getPosition()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v6

    invoke-virtual {v1, v6}, Lcom/google/android/gms/maps/model/LatLngBounds$Builder;->include(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/LatLngBounds$Builder;

    .line 457
    add-int/lit8 v3, v3, 0x1

    .line 460
    :cond_3
    if-lez v3, :cond_0

    .line 461
    invoke-virtual {v1}, Lcom/google/android/gms/maps/model/LatLngBounds$Builder;->build()Lcom/google/android/gms/maps/model/LatLngBounds;

    move-result-object v0

    .line 462
    .local v0, "bounds":Lcom/google/android/gms/maps/model/LatLngBounds;
    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/LatLngBounds;->getCenter()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v2

    .line 464
    .local v2, "center":Lcom/google/android/gms/maps/model/LatLng;
    iget-object v6, p0, Lcom/thetransitapp/droid/widget/RoutingSearch;->startAutoComplete:Lcom/thetransitapp/droid/widget/PlacesAutoCompleteAdapter;

    invoke-virtual {v6, v2}, Lcom/thetransitapp/droid/widget/PlacesAutoCompleteAdapter;->setLocation(Lcom/google/android/gms/maps/model/LatLng;)V

    .line 465
    iget-object v6, p0, Lcom/thetransitapp/droid/widget/RoutingSearch;->endAutoComplete:Lcom/thetransitapp/droid/widget/PlacesAutoCompleteAdapter;

    invoke-virtual {v6, v2}, Lcom/thetransitapp/droid/widget/PlacesAutoCompleteAdapter;->setLocation(Lcom/google/android/gms/maps/model/LatLng;)V

    .line 467
    if-eqz p1, :cond_0

    .line 468
    new-instance v5, Landroid/util/DisplayMetrics;

    invoke-direct {v5}, Landroid/util/DisplayMetrics;-><init>()V

    .line 469
    .local v5, "metrics":Landroid/util/DisplayMetrics;
    invoke-super {p0}, Lcom/thetransitapp/droid/BaseMapScreen;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v6

    invoke-virtual {v6}, Landroid/support/v4/app/FragmentActivity;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v6

    invoke-interface {v6}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v6

    invoke-virtual {v6, v5}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    .line 470
    iget v6, v5, Landroid/util/DisplayMetrics;->heightPixels:I

    iget-object v7, p0, Lcom/thetransitapp/droid/widget/RoutingSearch;->startSearch:Lcom/thetransitapp/droid/widget/SuggestionTextView;

    invoke-virtual {v7}, Lcom/thetransitapp/droid/widget/SuggestionTextView;->getMeasuredHeight()I

    move-result v7

    mul-int/lit8 v7, v7, 0x6

    sub-int v4, v6, v7

    .line 472
    .local v4, "height":I
    const/4 v6, 0x0

    iget v7, v5, Landroid/util/DisplayMetrics;->widthPixels:I

    invoke-super {p0, v0, v6, v7, v4}, Lcom/thetransitapp/droid/BaseMapScreen;->centerMap(Lcom/google/android/gms/maps/model/LatLngBounds;ZII)V

    goto/16 :goto_0

    .line 440
    .end local v0    # "bounds":Lcom/google/android/gms/maps/model/LatLngBounds;
    .end local v2    # "center":Lcom/google/android/gms/maps/model/LatLng;
    .end local v4    # "height":I
    .end local v5    # "metrics":Landroid/util/DisplayMetrics;
    :cond_4
    invoke-virtual {p0}, Lcom/thetransitapp/droid/widget/RoutingSearch;->getMap()Lcom/google/android/gms/maps/GoogleMap;

    move-result-object v6

    iget-object v7, p0, Lcom/thetransitapp/droid/widget/RoutingSearch;->start:Lcom/google/android/gms/maps/model/MarkerOptions;

    invoke-virtual {v6, v7}, Lcom/google/android/gms/maps/GoogleMap;->addMarker(Lcom/google/android/gms/maps/model/MarkerOptions;)Lcom/google/android/gms/maps/model/Marker;

    move-result-object v6

    iput-object v6, p0, Lcom/thetransitapp/droid/widget/RoutingSearch;->startMarker:Lcom/google/android/gms/maps/model/Marker;

    .line 441
    iget-object v6, p0, Lcom/thetransitapp/droid/widget/RoutingSearch;->startMarker:Lcom/google/android/gms/maps/model/Marker;

    invoke-virtual {v6, v10}, Lcom/google/android/gms/maps/model/Marker;->setSnippet(Ljava/lang/String;)V

    goto :goto_1

    .line 452
    :cond_5
    invoke-virtual {p0}, Lcom/thetransitapp/droid/widget/RoutingSearch;->getMap()Lcom/google/android/gms/maps/GoogleMap;

    move-result-object v6

    iget-object v7, p0, Lcom/thetransitapp/droid/widget/RoutingSearch;->end:Lcom/google/android/gms/maps/model/MarkerOptions;

    invoke-virtual {v6, v7}, Lcom/google/android/gms/maps/GoogleMap;->addMarker(Lcom/google/android/gms/maps/model/MarkerOptions;)Lcom/google/android/gms/maps/model/Marker;

    move-result-object v6

    iput-object v6, p0, Lcom/thetransitapp/droid/widget/RoutingSearch;->endMarker:Lcom/google/android/gms/maps/model/Marker;

    .line 453
    iget-object v6, p0, Lcom/thetransitapp/droid/widget/RoutingSearch;->endMarker:Lcom/google/android/gms/maps/model/Marker;

    invoke-virtual {v6, v10}, Lcom/google/android/gms/maps/model/Marker;->setSnippet(Ljava/lang/String;)V

    goto :goto_2
.end method


# virtual methods
.method public getDelegate()Lcom/thetransitapp/droid/widget/RoutingSearch$RoutingSearchDelegate;
    .locals 1

    .prologue
    .line 62
    iget-object v0, p0, Lcom/thetransitapp/droid/widget/RoutingSearch;->delegate:Lcom/thetransitapp/droid/widget/RoutingSearch$RoutingSearchDelegate;

    return-object v0
.end method

.method public getEnd()Lcom/google/android/gms/maps/model/MarkerOptions;
    .locals 1

    .prologue
    .line 70
    iget-object v0, p0, Lcom/thetransitapp/droid/widget/RoutingSearch;->end:Lcom/google/android/gms/maps/model/MarkerOptions;

    return-object v0
.end method

.method public getRoutingRequest()Lcom/thetransitapp/droid/model/RoutingRequest;
    .locals 4

    .prologue
    .line 407
    iget-object v3, p0, Lcom/thetransitapp/droid/widget/RoutingSearch;->start:Lcom/google/android/gms/maps/model/MarkerOptions;

    invoke-direct {p0, v3}, Lcom/thetransitapp/droid/widget/RoutingSearch;->getPlace(Lcom/google/android/gms/maps/model/MarkerOptions;)Lcom/thetransitapp/droid/model/SimplePlacemark;

    move-result-object v2

    .line 408
    .local v2, "start":Lcom/thetransitapp/droid/model/SimplePlacemark;
    iget-object v3, p0, Lcom/thetransitapp/droid/widget/RoutingSearch;->end:Lcom/google/android/gms/maps/model/MarkerOptions;

    invoke-direct {p0, v3}, Lcom/thetransitapp/droid/widget/RoutingSearch;->getPlace(Lcom/google/android/gms/maps/model/MarkerOptions;)Lcom/thetransitapp/droid/model/SimplePlacemark;

    move-result-object v0

    .line 409
    .local v0, "end":Lcom/thetransitapp/droid/model/SimplePlacemark;
    const/4 v1, 0x0

    .line 411
    .local v1, "request":Lcom/thetransitapp/droid/model/RoutingRequest;
    if-eqz v2, :cond_0

    if-eqz v0, :cond_0

    .line 412
    new-instance v1, Lcom/thetransitapp/droid/model/RoutingRequest;

    .end local v1    # "request":Lcom/thetransitapp/droid/model/RoutingRequest;
    invoke-direct {v1}, Lcom/thetransitapp/droid/model/RoutingRequest;-><init>()V

    .line 414
    .restart local v1    # "request":Lcom/thetransitapp/droid/model/RoutingRequest;
    iget-object v3, p0, Lcom/thetransitapp/droid/widget/RoutingSearch;->tripDate:Ljava/util/Date;

    if-nez v3, :cond_1

    .line 415
    new-instance v3, Ljava/util/Date;

    invoke-direct {v3}, Ljava/util/Date;-><init>()V

    invoke-virtual {v1, v3}, Lcom/thetransitapp/droid/model/RoutingRequest;->setDate(Ljava/util/Date;)V

    .line 421
    :goto_0
    invoke-virtual {v1, v2}, Lcom/thetransitapp/droid/model/RoutingRequest;->setStart(Lcom/thetransitapp/droid/model/SimplePlacemark;)V

    .line 422
    invoke-virtual {v1, v0}, Lcom/thetransitapp/droid/model/RoutingRequest;->setEnd(Lcom/thetransitapp/droid/model/SimplePlacemark;)V

    .line 425
    :cond_0
    return-object v1

    .line 417
    :cond_1
    iget-object v3, p0, Lcom/thetransitapp/droid/widget/RoutingSearch;->tripDate:Ljava/util/Date;

    invoke-virtual {v1, v3}, Lcom/thetransitapp/droid/model/RoutingRequest;->setDate(Ljava/util/Date;)V

    .line 418
    iget-boolean v3, p0, Lcom/thetransitapp/droid/widget/RoutingSearch;->arriveBy:Z

    invoke-virtual {v1, v3}, Lcom/thetransitapp/droid/model/RoutingRequest;->setArriveBy(Z)V

    goto :goto_0
.end method

.method public getStart()Lcom/google/android/gms/maps/model/MarkerOptions;
    .locals 1

    .prologue
    .line 66
    iget-object v0, p0, Lcom/thetransitapp/droid/widget/RoutingSearch;->start:Lcom/google/android/gms/maps/model/MarkerOptions;

    return-object v0
.end method

.method public onAddressReceived(Landroid/view/View;Lcom/bricolsoftconsulting/geocoderplus/Address;)V
    .locals 8
    .param p1, "view"    # Landroid/view/View;
    .param p2, "address"    # Lcom/bricolsoftconsulting/geocoderplus/Address;

    .prologue
    const/4 v7, 0x1

    .line 283
    if-eqz p2, :cond_4

    invoke-virtual {p0}, Lcom/thetransitapp/droid/widget/RoutingSearch;->isVisible()Z

    move-result v3

    if-eqz v3, :cond_4

    .line 284
    new-instance v2, Lcom/thetransitapp/droid/model/SimplePlacemark;

    invoke-virtual {p2}, Lcom/bricolsoftconsulting/geocoderplus/Address;->getLatitude()D

    move-result-wide v3

    invoke-virtual {p2}, Lcom/bricolsoftconsulting/geocoderplus/Address;->getLongitude()D

    move-result-wide v5

    invoke-direct {v2, v3, v4, v5, v6}, Lcom/thetransitapp/droid/model/SimplePlacemark;-><init>(DD)V

    .line 286
    .local v2, "newLocation":Lcom/thetransitapp/droid/model/SimplePlacemark;
    iget-object v3, p0, Lcom/thetransitapp/droid/widget/RoutingSearch;->startSearch:Lcom/thetransitapp/droid/widget/SuggestionTextView;

    if-ne p1, v3, :cond_3

    .line 287
    iget-object v3, p0, Lcom/thetransitapp/droid/widget/RoutingSearch;->start:Lcom/google/android/gms/maps/model/MarkerOptions;

    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/SimplePlacemark;->toLatLng()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/google/android/gms/maps/model/MarkerOptions;->position(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/MarkerOptions;

    .line 288
    iget-object v3, p0, Lcom/thetransitapp/droid/widget/RoutingSearch;->feedManager:Lcom/thetransitapp/droid/controller/FeedManager;

    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/SimplePlacemark;->toLocation()Landroid/location/Location;

    move-result-object v4

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Lcom/thetransitapp/droid/controller/FeedManager;->refresh(Landroid/location/Location;Landroid/content/Context;)V

    .line 293
    :goto_0
    iget-object v3, p0, Lcom/thetransitapp/droid/widget/RoutingSearch;->delegate:Lcom/thetransitapp/droid/widget/RoutingSearch$RoutingSearchDelegate;

    if-eqz v3, :cond_1

    .line 294
    invoke-direct {p0}, Lcom/thetransitapp/droid/widget/RoutingSearch;->shouldEnableRouteButton()Z

    move-result v1

    .line 296
    .local v1, "enable":Z
    if-eqz v1, :cond_0

    .line 297
    invoke-super {p0}, Lcom/thetransitapp/droid/BaseMapScreen;->hideKeyboard()V

    .line 300
    :cond_0
    iget-object v3, p0, Lcom/thetransitapp/droid/widget/RoutingSearch;->delegate:Lcom/thetransitapp/droid/widget/RoutingSearch$RoutingSearchDelegate;

    const/4 v4, 0x0

    invoke-interface {v3, v1, v4, v7}, Lcom/thetransitapp/droid/widget/RoutingSearch$RoutingSearchDelegate;->routeButtonStatusChange(ZZZ)V

    .line 303
    .end local v1    # "enable":Z
    :cond_1
    invoke-direct {p0, v7}, Lcom/thetransitapp/droid/widget/RoutingSearch;->showMarkers(Z)V

    .line 312
    .end local v2    # "newLocation":Lcom/thetransitapp/droid/model/SimplePlacemark;
    :cond_2
    :goto_1
    return-void

    .line 290
    .restart local v2    # "newLocation":Lcom/thetransitapp/droid/model/SimplePlacemark;
    :cond_3
    iget-object v3, p0, Lcom/thetransitapp/droid/widget/RoutingSearch;->end:Lcom/google/android/gms/maps/model/MarkerOptions;

    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/SimplePlacemark;->toLatLng()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/google/android/gms/maps/model/MarkerOptions;->position(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/MarkerOptions;

    goto :goto_0

    .line 304
    .end local v2    # "newLocation":Lcom/thetransitapp/droid/model/SimplePlacemark;
    :cond_4
    invoke-virtual {p0}, Lcom/thetransitapp/droid/widget/RoutingSearch;->isVisible()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-virtual {p0}, Lcom/thetransitapp/droid/widget/RoutingSearch;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v3

    if-eqz v3, :cond_2

    .line 305
    new-instance v3, Landroid/app/AlertDialog$Builder;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-direct {v3, v4}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    invoke-virtual {v3}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    .line 306
    .local v0, "alertDialog":Landroid/app/AlertDialog;
    const v3, 0x7f0a005a

    invoke-virtual {p0, v3}, Lcom/thetransitapp/droid/widget/RoutingSearch;->getText(I)Ljava/lang/CharSequence;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/app/AlertDialog;->setTitle(Ljava/lang/CharSequence;)V

    .line 307
    const v3, 0x7f0a0059

    invoke-virtual {p0, v3}, Lcom/thetransitapp/droid/widget/RoutingSearch;->getText(I)Ljava/lang/CharSequence;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/app/AlertDialog;->setMessage(Ljava/lang/CharSequence;)V

    .line 308
    const/4 v3, -0x1

    const v4, 0x7f0a002f

    invoke-virtual {p0, v4}, Lcom/thetransitapp/droid/widget/RoutingSearch;->getText(I)Ljava/lang/CharSequence;

    move-result-object v4

    .line 309
    const/4 v5, 0x0

    .line 308
    invoke-virtual {v0, v3, v4, v5}, Landroid/app/AlertDialog;->setButton(ILjava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)V

    .line 310
    invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V

    goto :goto_1
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1
    .param p1, "inflater"    # Landroid/view/LayoutInflater;
    .param p2, "container"    # Landroid/view/ViewGroup;
    .param p3, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    .line 80
    const v0, 0x7f030025

    invoke-super {p0, p1, p2, v0}, Lcom/thetransitapp/droid/BaseMapScreen;->createViewIfNeeded(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;I)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method public onDateTimePicked(Ljava/util/Date;Z)V
    .locals 0
    .param p1, "date"    # Ljava/util/Date;
    .param p2, "arriveBy"    # Z

    .prologue
    .line 402
    iput-object p1, p0, Lcom/thetransitapp/droid/widget/RoutingSearch;->tripDate:Ljava/util/Date;

    .line 403
    iput-boolean p2, p0, Lcom/thetransitapp/droid/widget/RoutingSearch;->arriveBy:Z

    .line 404
    return-void
.end method

.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 9
    .param p2, "view"    # Landroid/view/View;
    .param p3, "position"    # I
    .param p4, "id"    # J
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView",
            "<*>;",
            "Landroid/view/View;",
            "IJ)V"
        }
    .end annotation

    .prologue
    .local p1, "adapterView":Landroid/widget/AdapterView;, "Landroid/widget/AdapterView<*>;"
    const/4 v8, 0x0

    .line 250
    invoke-super {p0}, Lcom/thetransitapp/droid/BaseMapScreen;->getMap()Lcom/google/android/gms/maps/GoogleMap;

    move-result-object v5

    if-eqz v5, :cond_0

    .line 251
    const/4 v0, 0x0

    .line 255
    .local v0, "cursor":Landroid/database/Cursor;
    invoke-virtual {p1}, Landroid/widget/AdapterView;->getAdapter()Landroid/widget/Adapter;

    move-result-object v5

    iget-object v6, p0, Lcom/thetransitapp/droid/widget/RoutingSearch;->startAutoComplete:Lcom/thetransitapp/droid/widget/PlacesAutoCompleteAdapter;

    if-ne v5, v6, :cond_1

    .line 256
    iget-object v5, p0, Lcom/thetransitapp/droid/widget/RoutingSearch;->startAutoComplete:Lcom/thetransitapp/droid/widget/PlacesAutoCompleteAdapter;

    invoke-virtual {v5}, Lcom/thetransitapp/droid/widget/PlacesAutoCompleteAdapter;->getCursor()Landroid/database/Cursor;

    move-result-object v0

    .line 257
    iget-object v4, p0, Lcom/thetransitapp/droid/widget/RoutingSearch;->startSearch:Lcom/thetransitapp/droid/widget/SuggestionTextView;

    .line 258
    .local v4, "textView":Lcom/thetransitapp/droid/widget/SuggestionTextView;
    iget-object v1, p0, Lcom/thetransitapp/droid/widget/RoutingSearch;->start:Lcom/google/android/gms/maps/model/MarkerOptions;

    .line 265
    .local v1, "options":Lcom/google/android/gms/maps/model/MarkerOptions;
    :goto_0
    invoke-interface {v0, p3}, Landroid/database/Cursor;->moveToPosition(I)Z

    .line 267
    const-string v5, "suggest_text_1"

    invoke-interface {v0, v5}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v3

    .line 268
    .local v3, "textIndex":I
    const-string v5, "suggest_text_2"

    invoke-interface {v0, v5}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v2

    .line 270
    .local v2, "referenceIndex":I
    invoke-interface {v0, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Lcom/google/android/gms/maps/model/MarkerOptions;->snippet(Ljava/lang/String;)Lcom/google/android/gms/maps/model/MarkerOptions;

    .line 271
    invoke-virtual {v1}, Lcom/google/android/gms/maps/model/MarkerOptions;->getSnippet()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5, v8}, Lcom/thetransitapp/droid/widget/SuggestionTextView;->setText(Ljava/lang/CharSequence;Z)V

    .line 273
    new-instance v5, Lcom/thetransitapp/droid/service/GeocoderTask;

    invoke-super {p0}, Lcom/thetransitapp/droid/BaseMapScreen;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v6

    new-instance v7, Lcom/thetransitapp/droid/widget/RoutingSearch$1;

    invoke-direct {v7, p0, v4}, Lcom/thetransitapp/droid/widget/RoutingSearch$1;-><init>(Lcom/thetransitapp/droid/widget/RoutingSearch;Lcom/thetransitapp/droid/widget/SuggestionTextView;)V

    invoke-direct {v5, v6, v7}, Lcom/thetransitapp/droid/service/GeocoderTask;-><init>(Landroid/content/Context;Lcom/thetransitapp/droid/service/GeocoderTask$GeocoderTaskCallback;)V

    const/4 v6, 0x1

    new-array v6, v6, [Ljava/lang/String;

    .line 278
    invoke-interface {v0, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v7

    aput-object v7, v6, v8

    invoke-virtual {v5, v6}, Lcom/thetransitapp/droid/service/GeocoderTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 280
    .end local v0    # "cursor":Landroid/database/Cursor;
    .end local v1    # "options":Lcom/google/android/gms/maps/model/MarkerOptions;
    .end local v2    # "referenceIndex":I
    .end local v3    # "textIndex":I
    .end local v4    # "textView":Lcom/thetransitapp/droid/widget/SuggestionTextView;
    :cond_0
    return-void

    .line 260
    .restart local v0    # "cursor":Landroid/database/Cursor;
    :cond_1
    iget-object v5, p0, Lcom/thetransitapp/droid/widget/RoutingSearch;->endAutoComplete:Lcom/thetransitapp/droid/widget/PlacesAutoCompleteAdapter;

    invoke-virtual {v5}, Lcom/thetransitapp/droid/widget/PlacesAutoCompleteAdapter;->getCursor()Landroid/database/Cursor;

    move-result-object v0

    .line 261
    iget-object v4, p0, Lcom/thetransitapp/droid/widget/RoutingSearch;->endSearch:Lcom/thetransitapp/droid/widget/SuggestionTextView;

    .line 262
    .restart local v4    # "textView":Lcom/thetransitapp/droid/widget/SuggestionTextView;
    iget-object v1, p0, Lcom/thetransitapp/droid/widget/RoutingSearch;->end:Lcom/google/android/gms/maps/model/MarkerOptions;

    .restart local v1    # "options":Lcom/google/android/gms/maps/model/MarkerOptions;
    goto :goto_0
.end method

.method public onMapLongClick(Lcom/google/android/gms/maps/model/LatLng;)V
    .locals 4
    .param p1, "point"    # Lcom/google/android/gms/maps/model/LatLng;

    .prologue
    const/4 v3, 0x0

    .line 333
    iget-object v0, p0, Lcom/thetransitapp/droid/widget/RoutingSearch;->startSearch:Lcom/thetransitapp/droid/widget/SuggestionTextView;

    invoke-virtual {v0}, Lcom/thetransitapp/droid/widget/SuggestionTextView;->hasFocus()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 334
    iget-object v0, p0, Lcom/thetransitapp/droid/widget/RoutingSearch;->start:Lcom/google/android/gms/maps/model/MarkerOptions;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/maps/model/MarkerOptions;->position(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/MarkerOptions;

    .line 335
    iget-object v0, p0, Lcom/thetransitapp/droid/widget/RoutingSearch;->startSearch:Lcom/thetransitapp/droid/widget/SuggestionTextView;

    iget-object v1, p0, Lcom/thetransitapp/droid/widget/RoutingSearch;->start:Lcom/google/android/gms/maps/model/MarkerOptions;

    invoke-virtual {p0, v0, v1}, Lcom/thetransitapp/droid/widget/RoutingSearch;->reverseGeocode(Lcom/thetransitapp/droid/widget/SuggestionTextView;Lcom/google/android/gms/maps/model/MarkerOptions;)V

    .line 337
    iget-object v0, p0, Lcom/thetransitapp/droid/widget/RoutingSearch;->feedManager:Lcom/thetransitapp/droid/controller/FeedManager;

    new-instance v1, Lcom/thetransitapp/droid/model/SimplePlacemark;

    invoke-direct {v1, p1}, Lcom/thetransitapp/droid/model/SimplePlacemark;-><init>(Lcom/google/android/gms/maps/model/LatLng;)V

    invoke-virtual {v1}, Lcom/thetransitapp/droid/model/SimplePlacemark;->toLocation()Landroid/location/Location;

    move-result-object v1

    invoke-super {p0}, Lcom/thetransitapp/droid/BaseMapScreen;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/thetransitapp/droid/controller/FeedManager;->refresh(Landroid/location/Location;Landroid/content/Context;)V

    .line 343
    :cond_0
    :goto_0
    invoke-super {p0}, Lcom/thetransitapp/droid/BaseMapScreen;->hideKeyboard()V

    .line 345
    invoke-direct {p0, v3}, Lcom/thetransitapp/droid/widget/RoutingSearch;->showMarkers(Z)V

    .line 346
    iget-object v0, p0, Lcom/thetransitapp/droid/widget/RoutingSearch;->delegate:Lcom/thetransitapp/droid/widget/RoutingSearch$RoutingSearchDelegate;

    invoke-direct {p0}, Lcom/thetransitapp/droid/widget/RoutingSearch;->shouldEnableRouteButton()Z

    move-result v1

    invoke-interface {v0, v1, v3, v3}, Lcom/thetransitapp/droid/widget/RoutingSearch$RoutingSearchDelegate;->routeButtonStatusChange(ZZZ)V

    .line 347
    return-void

    .line 338
    :cond_1
    iget-object v0, p0, Lcom/thetransitapp/droid/widget/RoutingSearch;->endSearch:Lcom/thetransitapp/droid/widget/SuggestionTextView;

    invoke-virtual {v0}, Lcom/thetransitapp/droid/widget/SuggestionTextView;->hasFocus()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 339
    iget-object v0, p0, Lcom/thetransitapp/droid/widget/RoutingSearch;->end:Lcom/google/android/gms/maps/model/MarkerOptions;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/maps/model/MarkerOptions;->position(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/MarkerOptions;

    .line 340
    iget-object v0, p0, Lcom/thetransitapp/droid/widget/RoutingSearch;->endSearch:Lcom/thetransitapp/droid/widget/SuggestionTextView;

    iget-object v1, p0, Lcom/thetransitapp/droid/widget/RoutingSearch;->end:Lcom/google/android/gms/maps/model/MarkerOptions;

    invoke-virtual {p0, v0, v1}, Lcom/thetransitapp/droid/widget/RoutingSearch;->reverseGeocode(Lcom/thetransitapp/droid/widget/SuggestionTextView;Lcom/google/android/gms/maps/model/MarkerOptions;)V

    goto :goto_0
.end method

.method public onMenuItemClick(Lcom/actionbarsherlock/view/MenuItem;)Z
    .locals 4
    .param p1, "item"    # Lcom/actionbarsherlock/view/MenuItem;

    .prologue
    const/4 v3, 0x1

    .line 383
    invoke-interface {p1}, Lcom/actionbarsherlock/view/MenuItem;->getItemId()I

    move-result v1

    if-nez v1, :cond_1

    .line 384
    invoke-virtual {p0}, Lcom/thetransitapp/droid/widget/RoutingSearch;->onSwitchClick()V

    .line 397
    :cond_0
    :goto_0
    return v3

    .line 385
    :cond_1
    invoke-interface {p1}, Lcom/actionbarsherlock/view/MenuItem;->getItemId()I

    move-result v1

    if-ne v1, v3, :cond_0

    .line 386
    new-instance v0, Lcom/thetransitapp/droid/widget/DateTimeDialog;

    invoke-direct {v0}, Lcom/thetransitapp/droid/widget/DateTimeDialog;-><init>()V

    .line 387
    .local v0, "dialog":Lcom/thetransitapp/droid/widget/DateTimeDialog;
    invoke-virtual {v0, p0}, Lcom/thetransitapp/droid/widget/DateTimeDialog;->setDateTimePickedListener(Lcom/thetransitapp/droid/widget/DateTimeDialog$OnDateTimePickedListener;)V

    .line 388
    iget-boolean v1, p0, Lcom/thetransitapp/droid/widget/RoutingSearch;->arriveBy:Z

    invoke-virtual {v0, v1}, Lcom/thetransitapp/droid/widget/DateTimeDialog;->setArriveBy(Z)V

    .line 390
    iget-object v1, p0, Lcom/thetransitapp/droid/widget/RoutingSearch;->tripDate:Ljava/util/Date;

    if-eqz v1, :cond_2

    .line 391
    iget-object v1, p0, Lcom/thetransitapp/droid/widget/RoutingSearch;->tripDate:Ljava/util/Date;

    invoke-virtual {v0, v1}, Lcom/thetransitapp/droid/widget/DateTimeDialog;->setDate(Ljava/util/Date;)V

    .line 394
    :cond_2
    invoke-super {p0}, Lcom/thetransitapp/droid/BaseMapScreen;->getFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v1

    const-string v2, "dateTimePicker"

    invoke-virtual {v0, v1, v2}, Lcom/thetransitapp/droid/widget/DateTimeDialog;->show(Landroid/support/v4/app/FragmentManager;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public onPause()V
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 227
    invoke-super {p0}, Lcom/thetransitapp/droid/BaseMapScreen;->onPause()V

    .line 229
    iget-object v0, p0, Lcom/thetransitapp/droid/widget/RoutingSearch;->delegate:Lcom/thetransitapp/droid/widget/RoutingSearch$RoutingSearchDelegate;

    if-eqz v0, :cond_0

    .line 230
    iget-object v0, p0, Lcom/thetransitapp/droid/widget/RoutingSearch;->delegate:Lcom/thetransitapp/droid/widget/RoutingSearch$RoutingSearchDelegate;

    invoke-direct {p0}, Lcom/thetransitapp/droid/widget/RoutingSearch;->shouldEnableRouteButton()Z

    move-result v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-interface {v0, v1, v2, v3}, Lcom/thetransitapp/droid/widget/RoutingSearch$RoutingSearchDelegate;->routeButtonStatusChange(ZZZ)V

    .line 233
    :cond_0
    invoke-super {p0}, Lcom/thetransitapp/droid/BaseMapScreen;->getMap()Lcom/google/android/gms/maps/GoogleMap;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 234
    invoke-super {p0}, Lcom/thetransitapp/droid/BaseMapScreen;->getMap()Lcom/google/android/gms/maps/GoogleMap;

    move-result-object v0

    invoke-virtual {v0, v4}, Lcom/google/android/gms/maps/GoogleMap;->setOnMapLongClickListener(Lcom/google/android/gms/maps/GoogleMap$OnMapLongClickListener;)V

    .line 236
    iget-object v0, p0, Lcom/thetransitapp/droid/widget/RoutingSearch;->startMarker:Lcom/google/android/gms/maps/model/Marker;

    if-eqz v0, :cond_1

    .line 237
    iget-object v0, p0, Lcom/thetransitapp/droid/widget/RoutingSearch;->startMarker:Lcom/google/android/gms/maps/model/Marker;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/Marker;->remove()V

    .line 238
    iput-object v4, p0, Lcom/thetransitapp/droid/widget/RoutingSearch;->startMarker:Lcom/google/android/gms/maps/model/Marker;

    .line 241
    :cond_1
    iget-object v0, p0, Lcom/thetransitapp/droid/widget/RoutingSearch;->endMarker:Lcom/google/android/gms/maps/model/Marker;

    if-eqz v0, :cond_2

    .line 242
    iget-object v0, p0, Lcom/thetransitapp/droid/widget/RoutingSearch;->endMarker:Lcom/google/android/gms/maps/model/Marker;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/Marker;->remove()V

    .line 243
    iput-object v4, p0, Lcom/thetransitapp/droid/widget/RoutingSearch;->endMarker:Lcom/google/android/gms/maps/model/Marker;

    .line 246
    :cond_2
    return-void
.end method

.method public onResume()V
    .locals 15

    .prologue
    .line 124
    invoke-super {p0}, Lcom/thetransitapp/droid/BaseMapScreen;->onResume()V

    .line 126
    invoke-super {p0}, Lcom/thetransitapp/droid/BaseMapScreen;->getMap()Lcom/google/android/gms/maps/GoogleMap;

    move-result-object v9

    if-eqz v9, :cond_6

    .line 127
    invoke-super {p0}, Lcom/thetransitapp/droid/BaseMapScreen;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    .line 129
    .local v0, "args":Landroid/os/Bundle;
    iget-object v9, p0, Lcom/thetransitapp/droid/widget/RoutingSearch;->delegate:Lcom/thetransitapp/droid/widget/RoutingSearch$RoutingSearchDelegate;

    if-eqz v9, :cond_5

    if-eqz v0, :cond_0

    const-string v9, "oldDirectionLoaded"

    const/4 v10, 0x0

    invoke-virtual {v0, v9, v10}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v9

    if-nez v9, :cond_5

    .line 130
    :cond_0
    iget-object v9, p0, Lcom/thetransitapp/droid/widget/RoutingSearch;->delegate:Lcom/thetransitapp/droid/widget/RoutingSearch$RoutingSearchDelegate;

    invoke-interface {v9}, Lcom/thetransitapp/droid/widget/RoutingSearch$RoutingSearchDelegate;->shouldClearItineraries()V

    .line 131
    iget-object v9, p0, Lcom/thetransitapp/droid/widget/RoutingSearch;->delegate:Lcom/thetransitapp/droid/widget/RoutingSearch$RoutingSearchDelegate;

    invoke-direct {p0}, Lcom/thetransitapp/droid/widget/RoutingSearch;->shouldEnableRouteButton()Z

    move-result v10

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-interface {v9, v10, v11, v12}, Lcom/thetransitapp/droid/widget/RoutingSearch$RoutingSearchDelegate;->routeButtonStatusChange(ZZZ)V

    .line 133
    invoke-super {p0}, Lcom/thetransitapp/droid/BaseMapScreen;->getMap()Lcom/google/android/gms/maps/GoogleMap;

    move-result-object v9

    invoke-virtual {v9, p0}, Lcom/google/android/gms/maps/GoogleMap;->setOnMapLongClickListener(Lcom/google/android/gms/maps/GoogleMap$OnMapLongClickListener;)V

    .line 135
    iget-object v2, p0, Lcom/thetransitapp/droid/widget/RoutingSearch;->start:Lcom/google/android/gms/maps/model/MarkerOptions;

    .line 136
    .local v2, "empty":Lcom/google/android/gms/maps/model/MarkerOptions;
    iget-object v3, p0, Lcom/thetransitapp/droid/widget/RoutingSearch;->startSearch:Lcom/thetransitapp/droid/widget/SuggestionTextView;

    .line 141
    .local v3, "emptyField":Lcom/thetransitapp/droid/widget/SuggestionTextView;
    const-string v9, "from"

    invoke-virtual {v0, v9}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 142
    .local v5, "from":Ljava/lang/String;
    const-string v9, "to"

    invoke-virtual {v0, v9}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 144
    .local v8, "to":Ljava/lang/String;
    if-eqz v5, :cond_1

    .line 145
    const-string v9, "myl"

    invoke-virtual {v5, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_1

    .line 146
    const-string v9, "@"

    invoke-virtual {v5, v9}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v7

    .line 148
    .local v7, "parts":[Ljava/lang/String;
    array-length v9, v7

    const/4 v10, 0x1

    if-le v9, v10, :cond_1

    .line 149
    iget-object v9, p0, Lcom/thetransitapp/droid/widget/RoutingSearch;->start:Lcom/google/android/gms/maps/model/MarkerOptions;

    const/4 v10, 0x0

    aget-object v10, v7, v10

    invoke-virtual {v9, v10}, Lcom/google/android/gms/maps/model/MarkerOptions;->snippet(Ljava/lang/String;)Lcom/google/android/gms/maps/model/MarkerOptions;

    .line 151
    const/4 v9, 0x1

    aget-object v9, v7, v9

    const-string v10, ","

    invoke-virtual {v9, v10}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    .line 152
    .local v1, "coords":[Ljava/lang/String;
    array-length v9, v1

    const/4 v10, 0x2

    if-ne v9, v10, :cond_1

    .line 153
    iget-object v9, p0, Lcom/thetransitapp/droid/widget/RoutingSearch;->start:Lcom/google/android/gms/maps/model/MarkerOptions;

    new-instance v10, Lcom/google/android/gms/maps/model/LatLng;

    const/4 v11, 0x0

    aget-object v11, v1, v11

    invoke-static {v11}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v11

    .line 154
    const/4 v13, 0x1

    aget-object v13, v1, v13

    invoke-static {v13}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v13

    invoke-direct {v10, v11, v12, v13, v14}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    .line 153
    invoke-virtual {v9, v10}, Lcom/google/android/gms/maps/model/MarkerOptions;->position(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/MarkerOptions;

    .line 155
    iget-object v9, p0, Lcom/thetransitapp/droid/widget/RoutingSearch;->start:Lcom/google/android/gms/maps/model/MarkerOptions;

    const/4 v10, 0x0

    aget-object v10, v7, v10

    invoke-virtual {v9, v10}, Lcom/google/android/gms/maps/model/MarkerOptions;->snippet(Ljava/lang/String;)Lcom/google/android/gms/maps/model/MarkerOptions;

    .line 156
    iget-object v9, p0, Lcom/thetransitapp/droid/widget/RoutingSearch;->startSearch:Lcom/thetransitapp/droid/widget/SuggestionTextView;

    const/4 v10, 0x0

    aget-object v10, v7, v10

    const/4 v11, 0x0

    invoke-virtual {v9, v10, v11}, Lcom/thetransitapp/droid/widget/SuggestionTextView;->setText(Ljava/lang/CharSequence;Z)V

    .line 162
    .end local v1    # "coords":[Ljava/lang/String;
    .end local v7    # "parts":[Ljava/lang/String;
    :cond_1
    if-eqz v8, :cond_2

    .line 163
    const-string v9, "myl"

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_7

    .line 164
    const-string v9, "@"

    invoke-virtual {v8, v9}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v7

    .line 166
    .restart local v7    # "parts":[Ljava/lang/String;
    array-length v9, v7

    const/4 v10, 0x1

    if-le v9, v10, :cond_2

    .line 167
    iget-object v9, p0, Lcom/thetransitapp/droid/widget/RoutingSearch;->end:Lcom/google/android/gms/maps/model/MarkerOptions;

    const/4 v10, 0x0

    aget-object v10, v7, v10

    invoke-virtual {v9, v10}, Lcom/google/android/gms/maps/model/MarkerOptions;->snippet(Ljava/lang/String;)Lcom/google/android/gms/maps/model/MarkerOptions;

    .line 169
    const/4 v9, 0x1

    aget-object v9, v7, v9

    const-string v10, ","

    invoke-virtual {v9, v10}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    .line 170
    .restart local v1    # "coords":[Ljava/lang/String;
    array-length v9, v1

    const/4 v10, 0x2

    if-ne v9, v10, :cond_2

    .line 171
    iget-object v9, p0, Lcom/thetransitapp/droid/widget/RoutingSearch;->end:Lcom/google/android/gms/maps/model/MarkerOptions;

    new-instance v10, Lcom/google/android/gms/maps/model/LatLng;

    const/4 v11, 0x0

    aget-object v11, v1, v11

    invoke-static {v11}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v11

    .line 172
    const/4 v13, 0x1

    aget-object v13, v1, v13

    invoke-static {v13}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v13

    invoke-direct {v10, v11, v12, v13, v14}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    .line 171
    invoke-virtual {v9, v10}, Lcom/google/android/gms/maps/model/MarkerOptions;->position(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/MarkerOptions;

    .line 173
    iget-object v9, p0, Lcom/thetransitapp/droid/widget/RoutingSearch;->end:Lcom/google/android/gms/maps/model/MarkerOptions;

    const/4 v10, 0x0

    aget-object v10, v7, v10

    invoke-virtual {v9, v10}, Lcom/google/android/gms/maps/model/MarkerOptions;->snippet(Ljava/lang/String;)Lcom/google/android/gms/maps/model/MarkerOptions;

    .line 174
    iget-object v9, p0, Lcom/thetransitapp/droid/widget/RoutingSearch;->endSearch:Lcom/thetransitapp/droid/widget/SuggestionTextView;

    const/4 v10, 0x0

    aget-object v10, v7, v10

    const/4 v11, 0x0

    invoke-virtual {v9, v10, v11}, Lcom/thetransitapp/droid/widget/SuggestionTextView;->setText(Ljava/lang/CharSequence;Z)V

    .line 183
    .end local v1    # "coords":[Ljava/lang/String;
    .end local v7    # "parts":[Ljava/lang/String;
    :cond_2
    :goto_0
    invoke-super {p0}, Lcom/thetransitapp/droid/BaseMapScreen;->getLastLocation()Landroid/location/Location;

    move-result-object v6

    .line 185
    .local v6, "location":Landroid/location/Location;
    if-eqz v6, :cond_3

    .line 186
    iget-object v9, p0, Lcom/thetransitapp/droid/widget/RoutingSearch;->startAutoComplete:Lcom/thetransitapp/droid/widget/PlacesAutoCompleteAdapter;

    new-instance v10, Lcom/google/android/gms/maps/model/LatLng;

    invoke-virtual {v6}, Landroid/location/Location;->getLatitude()D

    move-result-wide v11

    invoke-virtual {v6}, Landroid/location/Location;->getLongitude()D

    move-result-wide v13

    invoke-direct {v10, v11, v12, v13, v14}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    invoke-virtual {v9, v10}, Lcom/thetransitapp/droid/widget/PlacesAutoCompleteAdapter;->setCurrent(Lcom/google/android/gms/maps/model/LatLng;)V

    .line 187
    iget-object v9, p0, Lcom/thetransitapp/droid/widget/RoutingSearch;->endAutoComplete:Lcom/thetransitapp/droid/widget/PlacesAutoCompleteAdapter;

    new-instance v10, Lcom/google/android/gms/maps/model/LatLng;

    invoke-virtual {v6}, Landroid/location/Location;->getLatitude()D

    move-result-wide v11

    invoke-virtual {v6}, Landroid/location/Location;->getLongitude()D

    move-result-wide v13

    invoke-direct {v10, v11, v12, v13, v14}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    invoke-virtual {v9, v10}, Lcom/thetransitapp/droid/widget/PlacesAutoCompleteAdapter;->setCurrent(Lcom/google/android/gms/maps/model/LatLng;)V

    .line 190
    :cond_3
    if-eqz v2, :cond_4

    invoke-virtual {v2}, Lcom/google/android/gms/maps/model/MarkerOptions;->getPosition()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v9

    iget-wide v9, v9, Lcom/google/android/gms/maps/model/LatLng;->latitude:D

    const-wide/16 v11, 0x0

    cmpl-double v9, v9, v11

    if-nez v9, :cond_5

    .line 193
    :cond_4
    if-eqz v6, :cond_9

    .line 194
    new-instance v9, Lcom/google/android/gms/maps/model/LatLng;

    invoke-virtual {v6}, Landroid/location/Location;->getLatitude()D

    move-result-wide v10

    invoke-virtual {v6}, Landroid/location/Location;->getLongitude()D

    move-result-wide v12

    invoke-direct {v9, v10, v11, v12, v13}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    invoke-virtual {v2, v9}, Lcom/google/android/gms/maps/model/MarkerOptions;->position(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/MarkerOptions;

    .line 195
    invoke-virtual {p0, v3, v2}, Lcom/thetransitapp/droid/widget/RoutingSearch;->reverseGeocode(Lcom/thetransitapp/droid/widget/SuggestionTextView;Lcom/google/android/gms/maps/model/MarkerOptions;)V

    .line 197
    iget-object v9, p0, Lcom/thetransitapp/droid/widget/RoutingSearch;->startSearch:Lcom/thetransitapp/droid/widget/SuggestionTextView;

    if-ne v3, v9, :cond_8

    .line 198
    iget-object v9, p0, Lcom/thetransitapp/droid/widget/RoutingSearch;->endSearch:Lcom/thetransitapp/droid/widget/SuggestionTextView;

    invoke-virtual {v9}, Lcom/thetransitapp/droid/widget/SuggestionTextView;->requestFocus()Z

    .line 199
    iget-object v4, p0, Lcom/thetransitapp/droid/widget/RoutingSearch;->endSearch:Lcom/thetransitapp/droid/widget/SuggestionTextView;

    .line 211
    .local v4, "focusView":Landroid/view/View;
    :goto_1
    invoke-super {p0, v4}, Lcom/thetransitapp/droid/BaseMapScreen;->showKeyboard(Landroid/view/View;)V

    .line 215
    .end local v2    # "empty":Lcom/google/android/gms/maps/model/MarkerOptions;
    .end local v3    # "emptyField":Lcom/thetransitapp/droid/widget/SuggestionTextView;
    .end local v4    # "focusView":Landroid/view/View;
    .end local v5    # "from":Ljava/lang/String;
    .end local v6    # "location":Landroid/location/Location;
    .end local v8    # "to":Ljava/lang/String;
    :cond_5
    const/4 v9, 0x0

    invoke-direct {p0, v9}, Lcom/thetransitapp/droid/widget/RoutingSearch;->showMarkers(Z)V

    .line 217
    if-eqz v0, :cond_6

    .line 218
    const-string v9, "oldDirectionLoaded"

    const/4 v10, 0x0

    invoke-virtual {v0, v9, v10}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 222
    .end local v0    # "args":Landroid/os/Bundle;
    :cond_6
    invoke-super {p0}, Lcom/thetransitapp/droid/BaseMapScreen;->getSherlockActivity()Lcom/actionbarsherlock/app/SherlockFragmentActivity;

    move-result-object v9

    invoke-virtual {v9}, Lcom/actionbarsherlock/app/SherlockFragmentActivity;->getSupportActionBar()Lcom/actionbarsherlock/app/ActionBar;

    move-result-object v9

    const/4 v10, 0x0

    invoke-virtual {v9, v10}, Lcom/actionbarsherlock/app/ActionBar;->setHomeButtonEnabled(Z)V

    .line 223
    return-void

    .line 178
    .restart local v0    # "args":Landroid/os/Bundle;
    .restart local v2    # "empty":Lcom/google/android/gms/maps/model/MarkerOptions;
    .restart local v3    # "emptyField":Lcom/thetransitapp/droid/widget/SuggestionTextView;
    .restart local v5    # "from":Ljava/lang/String;
    .restart local v8    # "to":Ljava/lang/String;
    :cond_7
    iget-object v2, p0, Lcom/thetransitapp/droid/widget/RoutingSearch;->end:Lcom/google/android/gms/maps/model/MarkerOptions;

    .line 179
    iget-object v3, p0, Lcom/thetransitapp/droid/widget/RoutingSearch;->endSearch:Lcom/thetransitapp/droid/widget/SuggestionTextView;

    goto :goto_0

    .line 201
    .restart local v6    # "location":Landroid/location/Location;
    :cond_8
    iget-object v9, p0, Lcom/thetransitapp/droid/widget/RoutingSearch;->startSearch:Lcom/thetransitapp/droid/widget/SuggestionTextView;

    invoke-virtual {v9}, Lcom/thetransitapp/droid/widget/SuggestionTextView;->requestFocus()Z

    .line 202
    iget-object v4, p0, Lcom/thetransitapp/droid/widget/RoutingSearch;->startSearch:Lcom/thetransitapp/droid/widget/SuggestionTextView;

    .line 204
    .restart local v4    # "focusView":Landroid/view/View;
    goto :goto_1

    .line 205
    .end local v4    # "focusView":Landroid/view/View;
    :cond_9
    invoke-virtual {v2}, Lcom/google/android/gms/maps/model/MarkerOptions;->getSnippet()Ljava/lang/String;

    move-result-object v9

    const/4 v10, 0x0

    invoke-virtual {v3, v9, v10}, Lcom/thetransitapp/droid/widget/SuggestionTextView;->setText(Ljava/lang/CharSequence;Z)V

    .line 207
    invoke-virtual {v3}, Lcom/thetransitapp/droid/widget/SuggestionTextView;->requestFocus()Z

    .line 208
    move-object v4, v3

    .restart local v4    # "focusView":Landroid/view/View;
    goto :goto_1
.end method

.method public onStart()V
    .locals 4

    .prologue
    const-wide/16 v2, 0x0

    .line 100
    invoke-super {p0}, Lcom/thetransitapp/droid/BaseMapScreen;->onStart()V

    .line 102
    invoke-super {p0}, Lcom/thetransitapp/droid/BaseMapScreen;->getSherlockActivity()Lcom/actionbarsherlock/app/SherlockFragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Lcom/actionbarsherlock/app/SherlockFragmentActivity;->getSupportActionBar()Lcom/actionbarsherlock/app/ActionBar;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/actionbarsherlock/app/ActionBar;->setDisplayHomeAsUpEnabled(Z)V

    .line 104
    invoke-super {p0}, Lcom/thetransitapp/droid/BaseMapScreen;->getMap()Lcom/google/android/gms/maps/GoogleMap;

    move-result-object v0

    if-nez v0, :cond_1

    .line 120
    :cond_0
    :goto_0
    return-void

    .line 108
    :cond_1
    iget-object v0, p0, Lcom/thetransitapp/droid/widget/RoutingSearch;->startPin:Lcom/google/android/gms/maps/model/BitmapDescriptor;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/thetransitapp/droid/widget/RoutingSearch;->endPin:Lcom/google/android/gms/maps/model/BitmapDescriptor;

    if-nez v0, :cond_3

    .line 109
    :cond_2
    const/high16 v0, 0x42f00000    # 120.0f

    invoke-static {v0}, Lcom/google/android/gms/maps/model/BitmapDescriptorFactory;->defaultMarker(F)Lcom/google/android/gms/maps/model/BitmapDescriptor;

    move-result-object v0

    iput-object v0, p0, Lcom/thetransitapp/droid/widget/RoutingSearch;->startPin:Lcom/google/android/gms/maps/model/BitmapDescriptor;

    .line 110
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/google/android/gms/maps/model/BitmapDescriptorFactory;->defaultMarker(F)Lcom/google/android/gms/maps/model/BitmapDescriptor;

    move-result-object v0

    iput-object v0, p0, Lcom/thetransitapp/droid/widget/RoutingSearch;->endPin:Lcom/google/android/gms/maps/model/BitmapDescriptor;

    .line 113
    :cond_3
    iget-object v0, p0, Lcom/thetransitapp/droid/widget/RoutingSearch;->start:Lcom/google/android/gms/maps/model/MarkerOptions;

    if-nez v0, :cond_4

    .line 114
    new-instance v0, Lcom/google/android/gms/maps/model/MarkerOptions;

    invoke-direct {v0}, Lcom/google/android/gms/maps/model/MarkerOptions;-><init>()V

    iget-object v1, p0, Lcom/thetransitapp/droid/widget/RoutingSearch;->startPin:Lcom/google/android/gms/maps/model/BitmapDescriptor;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/MarkerOptions;->icon(Lcom/google/android/gms/maps/model/BitmapDescriptor;)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/maps/model/LatLng;

    invoke-direct {v1, v2, v3, v2, v3}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/MarkerOptions;->position(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/MarkerOptions;->snippet(Ljava/lang/String;)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v0

    iput-object v0, p0, Lcom/thetransitapp/droid/widget/RoutingSearch;->start:Lcom/google/android/gms/maps/model/MarkerOptions;

    .line 117
    :cond_4
    iget-object v0, p0, Lcom/thetransitapp/droid/widget/RoutingSearch;->end:Lcom/google/android/gms/maps/model/MarkerOptions;

    if-nez v0, :cond_0

    .line 118
    new-instance v0, Lcom/google/android/gms/maps/model/MarkerOptions;

    invoke-direct {v0}, Lcom/google/android/gms/maps/model/MarkerOptions;-><init>()V

    iget-object v1, p0, Lcom/thetransitapp/droid/widget/RoutingSearch;->endPin:Lcom/google/android/gms/maps/model/BitmapDescriptor;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/MarkerOptions;->icon(Lcom/google/android/gms/maps/model/BitmapDescriptor;)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/maps/model/LatLng;

    invoke-direct {v1, v2, v3, v2, v3}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/MarkerOptions;->position(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/MarkerOptions;->snippet(Ljava/lang/String;)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v0

    iput-object v0, p0, Lcom/thetransitapp/droid/widget/RoutingSearch;->end:Lcom/google/android/gms/maps/model/MarkerOptions;

    goto :goto_0
.end method

.method public onSwitchClick()V
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 315
    iget-object v2, p0, Lcom/thetransitapp/droid/widget/RoutingSearch;->start:Lcom/google/android/gms/maps/model/MarkerOptions;

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/thetransitapp/droid/widget/RoutingSearch;->end:Lcom/google/android/gms/maps/model/MarkerOptions;

    if-eqz v2, :cond_0

    .line 316
    iget-object v2, p0, Lcom/thetransitapp/droid/widget/RoutingSearch;->start:Lcom/google/android/gms/maps/model/MarkerOptions;

    invoke-virtual {v2}, Lcom/google/android/gms/maps/model/MarkerOptions;->getPosition()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v0

    .line 317
    .local v0, "tempLocation":Lcom/google/android/gms/maps/model/LatLng;
    iget-object v2, p0, Lcom/thetransitapp/droid/widget/RoutingSearch;->start:Lcom/google/android/gms/maps/model/MarkerOptions;

    invoke-virtual {v2}, Lcom/google/android/gms/maps/model/MarkerOptions;->getSnippet()Ljava/lang/String;

    move-result-object v1

    .line 319
    .local v1, "tempSearch":Ljava/lang/String;
    iget-object v2, p0, Lcom/thetransitapp/droid/widget/RoutingSearch;->start:Lcom/google/android/gms/maps/model/MarkerOptions;

    iget-object v3, p0, Lcom/thetransitapp/droid/widget/RoutingSearch;->end:Lcom/google/android/gms/maps/model/MarkerOptions;

    invoke-virtual {v3}, Lcom/google/android/gms/maps/model/MarkerOptions;->getPosition()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/google/android/gms/maps/model/MarkerOptions;->position(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/MarkerOptions;

    .line 320
    iget-object v2, p0, Lcom/thetransitapp/droid/widget/RoutingSearch;->start:Lcom/google/android/gms/maps/model/MarkerOptions;

    iget-object v3, p0, Lcom/thetransitapp/droid/widget/RoutingSearch;->end:Lcom/google/android/gms/maps/model/MarkerOptions;

    invoke-virtual {v3}, Lcom/google/android/gms/maps/model/MarkerOptions;->getSnippet()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/google/android/gms/maps/model/MarkerOptions;->snippet(Ljava/lang/String;)Lcom/google/android/gms/maps/model/MarkerOptions;

    .line 322
    iget-object v2, p0, Lcom/thetransitapp/droid/widget/RoutingSearch;->end:Lcom/google/android/gms/maps/model/MarkerOptions;

    invoke-virtual {v2, v0}, Lcom/google/android/gms/maps/model/MarkerOptions;->position(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/MarkerOptions;

    .line 323
    iget-object v2, p0, Lcom/thetransitapp/droid/widget/RoutingSearch;->end:Lcom/google/android/gms/maps/model/MarkerOptions;

    invoke-virtual {v2, v1}, Lcom/google/android/gms/maps/model/MarkerOptions;->snippet(Ljava/lang/String;)Lcom/google/android/gms/maps/model/MarkerOptions;

    .line 325
    iget-object v2, p0, Lcom/thetransitapp/droid/widget/RoutingSearch;->startSearch:Lcom/thetransitapp/droid/widget/SuggestionTextView;

    iget-object v3, p0, Lcom/thetransitapp/droid/widget/RoutingSearch;->start:Lcom/google/android/gms/maps/model/MarkerOptions;

    invoke-virtual {v3}, Lcom/google/android/gms/maps/model/MarkerOptions;->getSnippet()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3, v4}, Lcom/thetransitapp/droid/widget/SuggestionTextView;->setText(Ljava/lang/CharSequence;Z)V

    .line 326
    iget-object v2, p0, Lcom/thetransitapp/droid/widget/RoutingSearch;->endSearch:Lcom/thetransitapp/droid/widget/SuggestionTextView;

    iget-object v3, p0, Lcom/thetransitapp/droid/widget/RoutingSearch;->end:Lcom/google/android/gms/maps/model/MarkerOptions;

    invoke-virtual {v3}, Lcom/google/android/gms/maps/model/MarkerOptions;->getSnippet()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3, v4}, Lcom/thetransitapp/droid/widget/SuggestionTextView;->setText(Ljava/lang/CharSequence;Z)V

    .line 327
    invoke-direct {p0, v4}, Lcom/thetransitapp/droid/widget/RoutingSearch;->showMarkers(Z)V

    .line 329
    .end local v0    # "tempLocation":Lcom/google/android/gms/maps/model/LatLng;
    .end local v1    # "tempSearch":Ljava/lang/String;
    :cond_0
    return-void
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 3
    .param p1, "view"    # Landroid/view/View;
    .param p2, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    const v2, 0x1090003

    .line 85
    invoke-super {p0, p1, p2}, Lcom/thetransitapp/droid/BaseMapScreen;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 87
    new-instance v0, Lcom/thetransitapp/droid/widget/PlacesAutoCompleteAdapter;

    invoke-super {p0}, Lcom/thetransitapp/droid/BaseMapScreen;->getSherlockActivity()Lcom/actionbarsherlock/app/SherlockFragmentActivity;

    move-result-object v1

    invoke-virtual {v1}, Lcom/actionbarsherlock/app/SherlockFragmentActivity;->getSupportActionBar()Lcom/actionbarsherlock/app/ActionBar;

    move-result-object v1

    .line 88
    invoke-virtual {v1}, Lcom/actionbarsherlock/app/ActionBar;->getThemedContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1, v2}, Lcom/thetransitapp/droid/widget/PlacesAutoCompleteAdapter;-><init>(Landroid/content/Context;I)V

    .line 87
    iput-object v0, p0, Lcom/thetransitapp/droid/widget/RoutingSearch;->startAutoComplete:Lcom/thetransitapp/droid/widget/PlacesAutoCompleteAdapter;

    .line 89
    iget-object v0, p0, Lcom/thetransitapp/droid/widget/RoutingSearch;->startSearch:Lcom/thetransitapp/droid/widget/SuggestionTextView;

    iget-object v1, p0, Lcom/thetransitapp/droid/widget/RoutingSearch;->startAutoComplete:Lcom/thetransitapp/droid/widget/PlacesAutoCompleteAdapter;

    invoke-virtual {v0, v1}, Lcom/thetransitapp/droid/widget/SuggestionTextView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 90
    iget-object v0, p0, Lcom/thetransitapp/droid/widget/RoutingSearch;->startSearch:Lcom/thetransitapp/droid/widget/SuggestionTextView;

    invoke-virtual {v0, p0}, Lcom/thetransitapp/droid/widget/SuggestionTextView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 92
    new-instance v0, Lcom/thetransitapp/droid/widget/PlacesAutoCompleteAdapter;

    invoke-super {p0}, Lcom/thetransitapp/droid/BaseMapScreen;->getSherlockActivity()Lcom/actionbarsherlock/app/SherlockFragmentActivity;

    move-result-object v1

    invoke-virtual {v1}, Lcom/actionbarsherlock/app/SherlockFragmentActivity;->getSupportActionBar()Lcom/actionbarsherlock/app/ActionBar;

    move-result-object v1

    .line 93
    invoke-virtual {v1}, Lcom/actionbarsherlock/app/ActionBar;->getThemedContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1, v2}, Lcom/thetransitapp/droid/widget/PlacesAutoCompleteAdapter;-><init>(Landroid/content/Context;I)V

    .line 92
    iput-object v0, p0, Lcom/thetransitapp/droid/widget/RoutingSearch;->endAutoComplete:Lcom/thetransitapp/droid/widget/PlacesAutoCompleteAdapter;

    .line 94
    iget-object v0, p0, Lcom/thetransitapp/droid/widget/RoutingSearch;->endSearch:Lcom/thetransitapp/droid/widget/SuggestionTextView;

    iget-object v1, p0, Lcom/thetransitapp/droid/widget/RoutingSearch;->endAutoComplete:Lcom/thetransitapp/droid/widget/PlacesAutoCompleteAdapter;

    invoke-virtual {v0, v1}, Lcom/thetransitapp/droid/widget/SuggestionTextView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 95
    iget-object v0, p0, Lcom/thetransitapp/droid/widget/RoutingSearch;->endSearch:Lcom/thetransitapp/droid/widget/SuggestionTextView;

    invoke-virtual {v0, p0}, Lcom/thetransitapp/droid/widget/SuggestionTextView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 96
    return-void
.end method

.method public reverseGeocode(Lcom/thetransitapp/droid/widget/SuggestionTextView;Lcom/google/android/gms/maps/model/MarkerOptions;)V
    .locals 5
    .param p1, "textView"    # Lcom/thetransitapp/droid/widget/SuggestionTextView;
    .param p2, "options"    # Lcom/google/android/gms/maps/model/MarkerOptions;

    .prologue
    const/4 v4, 0x0

    .line 350
    invoke-static {}, Ljava/text/NumberFormat;->getNumberInstance()Ljava/text/NumberFormat;

    move-result-object v0

    .line 351
    .local v0, "format":Ljava/text/NumberFormat;
    const/4 v1, 0x6

    invoke-virtual {v0, v1}, Ljava/text/NumberFormat;->setMaximumFractionDigits(I)V

    .line 354
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Lcom/google/android/gms/maps/model/MarkerOptions;->getPosition()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v2

    iget-wide v2, v2, Lcom/google/android/gms/maps/model/LatLng;->latitude:D

    invoke-virtual {v0, v2, v3}, Ljava/text/NumberFormat;->format(D)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v2, ", "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p2}, Lcom/google/android/gms/maps/model/MarkerOptions;->getPosition()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v2

    iget-wide v2, v2, Lcom/google/android/gms/maps/model/LatLng;->longitude:D

    invoke-virtual {v0, v2, v3}, Ljava/text/NumberFormat;->format(D)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 353
    invoke-virtual {p1, v1, v4}, Lcom/thetransitapp/droid/widget/SuggestionTextView;->setText(Ljava/lang/CharSequence;Z)V

    .line 356
    const-string v1, ""

    invoke-virtual {p2, v1}, Lcom/google/android/gms/maps/model/MarkerOptions;->snippet(Ljava/lang/String;)Lcom/google/android/gms/maps/model/MarkerOptions;

    .line 358
    new-instance v1, Lcom/thetransitapp/droid/service/ReverseGeocoderTask;

    invoke-super {p0}, Lcom/thetransitapp/droid/BaseMapScreen;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    new-instance v3, Lcom/thetransitapp/droid/widget/RoutingSearch$2;

    invoke-direct {v3, p0, p1, p2}, Lcom/thetransitapp/droid/widget/RoutingSearch$2;-><init>(Lcom/thetransitapp/droid/widget/RoutingSearch;Lcom/thetransitapp/droid/widget/SuggestionTextView;Lcom/google/android/gms/maps/model/MarkerOptions;)V

    invoke-direct {v1, v2, v3}, Lcom/thetransitapp/droid/service/ReverseGeocoderTask;-><init>(Landroid/content/Context;Lcom/thetransitapp/droid/service/ServiceCallback;)V

    const/4 v2, 0x1

    new-array v2, v2, [Lcom/google/android/gms/maps/model/LatLng;

    .line 378
    invoke-virtual {p2}, Lcom/google/android/gms/maps/model/MarkerOptions;->getPosition()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v3

    aput-object v3, v2, v4

    invoke-virtual {v1, v2}, Lcom/thetransitapp/droid/service/ReverseGeocoderTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 379
    return-void
.end method

.method public setDelegate(Lcom/thetransitapp/droid/widget/RoutingSearch$RoutingSearchDelegate;)V
    .locals 0
    .param p1, "delegate"    # Lcom/thetransitapp/droid/widget/RoutingSearch$RoutingSearchDelegate;

    .prologue
    .line 63
    iput-object p1, p0, Lcom/thetransitapp/droid/widget/RoutingSearch;->delegate:Lcom/thetransitapp/droid/widget/RoutingSearch$RoutingSearchDelegate;

    return-void
.end method
