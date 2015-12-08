.class public Lcom/thetransitapp/droid/ItineraryScreen;
.super Lcom/thetransitapp/droid/BaseItinerariesScreen;
.source "ItineraryScreen.java"

# interfaces
.implements Lcom/google/android/gms/maps/GoogleMap$OnCameraChangeListener;
.implements Lcom/google/android/gms/maps/GoogleMap$OnMyLocationChangeListener;


# instance fields
.field private lines:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/maps/model/Polyline;",
            ">;"
        }
    .end annotation
.end field

.field private otherMarkers:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/maps/model/Marker;",
            ">;"
        }
    .end annotation
.end field

.field private routeContent:Landroid/widget/LinearLayout;
    .annotation runtime Lroboguice/inject/InjectView;
        value = 0x7f050051
    .end annotation
.end field

.field private stopMarkers:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/maps/model/Marker;",
            ">;"
        }
    .end annotation
.end field

.field private viewController:Lcom/thetransitapp/droid/controller/ItineraryMapViewController;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 56
    sget-object v0, Lcom/thetransitapp/droid/TransitActivity$TransitScreen;->ITINERARY_SCREEN:Lcom/thetransitapp/droid/TransitActivity$TransitScreen;

    invoke-direct {p0, v0}, Lcom/thetransitapp/droid/BaseItinerariesScreen;-><init>(Lcom/thetransitapp/droid/TransitActivity$TransitScreen;)V

    .line 51
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/thetransitapp/droid/ItineraryScreen;->stopMarkers:Ljava/util/List;

    .line 52
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/thetransitapp/droid/ItineraryScreen;->otherMarkers:Ljava/util/List;

    .line 53
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/thetransitapp/droid/ItineraryScreen;->lines:Ljava/util/List;

    .line 57
    return-void
.end method

.method static synthetic access$0(Lcom/thetransitapp/droid/ItineraryScreen;)Lcom/thetransitapp/droid/controller/ItineraryMapViewController;
    .locals 1

    .prologue
    .line 50
    iget-object v0, p0, Lcom/thetransitapp/droid/ItineraryScreen;->viewController:Lcom/thetransitapp/droid/controller/ItineraryMapViewController;

    return-object v0
.end method

.method private centerMap(Lcom/thetransitapp/droid/model/Stop;)V
    .locals 11
    .param p1, "closestStop"    # Lcom/thetransitapp/droid/model/Stop;

    .prologue
    .line 218
    invoke-super {p0}, Lcom/thetransitapp/droid/BaseItinerariesScreen;->getLastLocation()Landroid/location/Location;

    move-result-object v3

    .line 220
    .local v3, "me":Landroid/location/Location;
    if-eqz v3, :cond_1

    invoke-virtual {p1}, Lcom/thetransitapp/droid/model/Stop;->getPlacemark()Lcom/thetransitapp/droid/model/SimplePlacemark;

    move-result-object v7

    invoke-virtual {v7, v3}, Lcom/thetransitapp/droid/model/SimplePlacemark;->distanceTo(Landroid/location/Location;)F

    move-result v7

    const v8, 0x459c4000    # 5000.0f

    cmpg-float v7, v7, v8

    if-gez v7, :cond_1

    .line 221
    new-instance v1, Lcom/google/android/gms/maps/model/LatLngBounds$Builder;

    invoke-direct {v1}, Lcom/google/android/gms/maps/model/LatLngBounds$Builder;-><init>()V

    .line 222
    .local v1, "builder":Lcom/google/android/gms/maps/model/LatLngBounds$Builder;
    new-instance v7, Lcom/thetransitapp/droid/model/SimplePlacemark;

    invoke-direct {v7, v3}, Lcom/thetransitapp/droid/model/SimplePlacemark;-><init>(Landroid/location/Location;)V

    invoke-virtual {v7}, Lcom/thetransitapp/droid/model/SimplePlacemark;->toLatLng()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v7

    invoke-virtual {v1, v7}, Lcom/google/android/gms/maps/model/LatLngBounds$Builder;->include(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/LatLngBounds$Builder;

    .line 223
    invoke-virtual {p1}, Lcom/thetransitapp/droid/model/Stop;->getPlacemark()Lcom/thetransitapp/droid/model/SimplePlacemark;

    move-result-object v7

    invoke-virtual {v7}, Lcom/thetransitapp/droid/model/SimplePlacemark;->toLatLng()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v7

    invoke-virtual {v1, v7}, Lcom/google/android/gms/maps/model/LatLngBounds$Builder;->include(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/LatLngBounds$Builder;

    .line 225
    invoke-super {p0}, Lcom/thetransitapp/droid/BaseItinerariesScreen;->isCurrentLocation()Z

    move-result v7

    if-nez v7, :cond_0

    .line 226
    new-instance v6, Lcom/google/android/gms/maps/model/LatLng;

    invoke-virtual {v3}, Landroid/location/Location;->getLatitude()D

    move-result-wide v7

    invoke-virtual {v3}, Landroid/location/Location;->getLongitude()D

    move-result-wide v9

    invoke-direct {v6, v7, v8, v9, v10}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    .line 227
    .local v6, "pos":Lcom/google/android/gms/maps/model/LatLng;
    new-instance v7, Lcom/google/android/gms/maps/model/MarkerOptions;

    invoke-direct {v7}, Lcom/google/android/gms/maps/model/MarkerOptions;-><init>()V

    invoke-virtual {v7, v6}, Lcom/google/android/gms/maps/model/MarkerOptions;->position(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v5

    .line 229
    .local v5, "options":Lcom/google/android/gms/maps/model/MarkerOptions;
    iget-object v7, p0, Lcom/thetransitapp/droid/ItineraryScreen;->otherMarkers:Ljava/util/List;

    invoke-super {p0}, Lcom/thetransitapp/droid/BaseItinerariesScreen;->getMap()Lcom/google/android/gms/maps/GoogleMap;

    move-result-object v8

    invoke-virtual {v8, v5}, Lcom/google/android/gms/maps/GoogleMap;->addMarker(Lcom/google/android/gms/maps/model/MarkerOptions;)Lcom/google/android/gms/maps/model/Marker;

    move-result-object v8

    invoke-interface {v7, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 232
    .end local v5    # "options":Lcom/google/android/gms/maps/model/MarkerOptions;
    .end local v6    # "pos":Lcom/google/android/gms/maps/model/LatLng;
    :cond_0
    invoke-virtual {v1}, Lcom/google/android/gms/maps/model/LatLngBounds$Builder;->build()Lcom/google/android/gms/maps/model/LatLngBounds;

    move-result-object v0

    .line 234
    .local v0, "bounds":Lcom/google/android/gms/maps/model/LatLngBounds;
    new-instance v4, Landroid/util/DisplayMetrics;

    invoke-direct {v4}, Landroid/util/DisplayMetrics;-><init>()V

    .line 235
    .local v4, "metrics":Landroid/util/DisplayMetrics;
    invoke-super {p0}, Lcom/thetransitapp/droid/BaseItinerariesScreen;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v7

    invoke-virtual {v7}, Landroid/support/v4/app/FragmentActivity;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v7

    invoke-interface {v7}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v7

    invoke-virtual {v7, v4}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    .line 236
    iget-object v7, p0, Lcom/thetransitapp/droid/ItineraryScreen;->routeContent:Landroid/widget/LinearLayout;

    const/4 v8, -0x1

    const/4 v9, -0x2

    invoke-virtual {v7, v8, v9}, Landroid/widget/LinearLayout;->measure(II)V

    .line 238
    iget v7, v4, Landroid/util/DisplayMetrics;->heightPixels:I

    iget-object v8, p0, Lcom/thetransitapp/droid/ItineraryScreen;->routeContent:Landroid/widget/LinearLayout;

    invoke-virtual {v8}, Landroid/widget/LinearLayout;->getMeasuredHeight()I

    move-result v8

    mul-int/lit8 v8, v8, 0x4

    sub-int v2, v7, v8

    .line 239
    .local v2, "height":I
    const/4 v7, 0x0

    iget v8, v4, Landroid/util/DisplayMetrics;->widthPixels:I

    invoke-super {p0, v0, v7, v8, v2}, Lcom/thetransitapp/droid/BaseItinerariesScreen;->centerMap(Lcom/google/android/gms/maps/model/LatLngBounds;ZII)V

    .line 243
    .end local v0    # "bounds":Lcom/google/android/gms/maps/model/LatLngBounds;
    .end local v1    # "builder":Lcom/google/android/gms/maps/model/LatLngBounds$Builder;
    .end local v2    # "height":I
    .end local v4    # "metrics":Landroid/util/DisplayMetrics;
    :goto_0
    return-void

    .line 241
    :cond_1
    invoke-virtual {p1}, Lcom/thetransitapp/droid/model/Stop;->getPlacemark()Lcom/thetransitapp/droid/model/SimplePlacemark;

    move-result-object v7

    invoke-super {p0, v7}, Lcom/thetransitapp/droid/BaseItinerariesScreen;->centerMap(Lcom/thetransitapp/droid/model/SimplePlacemark;)V

    goto :goto_0
.end method

.method private clear()V
    .locals 4

    .prologue
    .line 277
    iget-object v2, p0, Lcom/thetransitapp/droid/ItineraryScreen;->stopMarkers:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-nez v3, :cond_0

    .line 281
    iget-object v2, p0, Lcom/thetransitapp/droid/ItineraryScreen;->otherMarkers:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-nez v3, :cond_1

    .line 285
    iget-object v2, p0, Lcom/thetransitapp/droid/ItineraryScreen;->lines:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-nez v3, :cond_2

    .line 288
    return-void

    .line 277
    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/maps/model/Marker;

    .line 278
    .local v1, "marker":Lcom/google/android/gms/maps/model/Marker;
    invoke-virtual {v1}, Lcom/google/android/gms/maps/model/Marker;->remove()V

    goto :goto_0

    .line 281
    .end local v1    # "marker":Lcom/google/android/gms/maps/model/Marker;
    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/maps/model/Marker;

    .line 282
    .restart local v1    # "marker":Lcom/google/android/gms/maps/model/Marker;
    invoke-virtual {v1}, Lcom/google/android/gms/maps/model/Marker;->remove()V

    goto :goto_1

    .line 285
    .end local v1    # "marker":Lcom/google/android/gms/maps/model/Marker;
    :cond_2
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/maps/model/Polyline;

    .line 286
    .local v0, "line":Lcom/google/android/gms/maps/model/Polyline;
    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/Polyline;->remove()V

    goto :goto_2
.end method

.method private createMarker(Lcom/thetransitapp/droid/model/Stop;Lcom/thetransitapp/droid/model/ScheduleItem;Lcom/google/android/gms/maps/model/LatLng;Lcom/google/android/gms/maps/model/BitmapDescriptor;ZZ)Lcom/google/android/gms/maps/model/MarkerOptions;
    .locals 5
    .param p1, "stop"    # Lcom/thetransitapp/droid/model/Stop;
    .param p2, "schedule"    # Lcom/thetransitapp/droid/model/ScheduleItem;
    .param p3, "pos"    # Lcom/google/android/gms/maps/model/LatLng;
    .param p4, "pin"    # Lcom/google/android/gms/maps/model/BitmapDescriptor;
    .param p5, "isClosest"    # Z
    .param p6, "beforeCurrent"    # Z

    .prologue
    const/high16 v3, 0x3f000000    # 0.5f

    .line 247
    new-instance v2, Lcom/google/android/gms/maps/model/MarkerOptions;

    invoke-direct {v2}, Lcom/google/android/gms/maps/model/MarkerOptions;-><init>()V

    invoke-virtual {v2, p3}, Lcom/google/android/gms/maps/model/MarkerOptions;->position(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v2

    invoke-virtual {v2, p4}, Lcom/google/android/gms/maps/model/MarkerOptions;->icon(Lcom/google/android/gms/maps/model/BitmapDescriptor;)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v0

    .line 249
    .local v0, "marker":Lcom/google/android/gms/maps/model/MarkerOptions;
    if-eqz p5, :cond_0

    if-eqz p6, :cond_1

    .line 250
    :cond_0
    invoke-virtual {v0, v3, v3}, Lcom/google/android/gms/maps/model/MarkerOptions;->anchor(FF)Lcom/google/android/gms/maps/model/MarkerOptions;

    .line 253
    :cond_1
    if-eqz p5, :cond_2

    if-nez p6, :cond_3

    .line 254
    :cond_2
    invoke-virtual {p1}, Lcom/thetransitapp/droid/model/Stop;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/google/android/gms/maps/model/MarkerOptions;->title(Ljava/lang/String;)Lcom/google/android/gms/maps/model/MarkerOptions;

    .line 257
    :cond_3
    if-eqz p2, :cond_7

    .line 258
    const-string v1, "0|"

    .line 260
    .local v1, "start":Ljava/lang/String;
    if-eqz p5, :cond_6

    if-nez p6, :cond_6

    .line 261
    const-string v1, "1|"

    .line 266
    :cond_4
    :goto_0
    invoke-virtual {p2}, Lcom/thetransitapp/droid/model/ScheduleItem;->isFrequency()Z

    move-result v2

    if-nez v2, :cond_5

    .line 267
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2}, Lcom/thetransitapp/droid/model/ScheduleItem;->getStopTime()Ljava/util/Date;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/Date;->getTime()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/google/android/gms/maps/model/MarkerOptions;->snippet(Ljava/lang/String;)Lcom/google/android/gms/maps/model/MarkerOptions;

    .line 273
    .end local v1    # "start":Ljava/lang/String;
    :cond_5
    :goto_1
    return-object v0

    .line 262
    .restart local v1    # "start":Ljava/lang/String;
    :cond_6
    if-nez p5, :cond_4

    if-eqz p6, :cond_4

    .line 263
    const-string v1, "2|"

    goto :goto_0

    .line 270
    .end local v1    # "start":Ljava/lang/String;
    :cond_7
    const-string v2, ""

    invoke-virtual {v0, v2}, Lcom/google/android/gms/maps/model/MarkerOptions;->snippet(Ljava/lang/String;)Lcom/google/android/gms/maps/model/MarkerOptions;

    goto :goto_1
.end method

.method private drawItinerary(Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;I)V
    .locals 36
    .param p1, "merged"    # Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;
    .param p2, "pathColor"    # I

    .prologue
    .line 124
    new-instance v25, Lcom/google/android/gms/maps/model/PolylineOptions;

    invoke-direct/range {v25 .. v25}, Lcom/google/android/gms/maps/model/PolylineOptions;-><init>()V

    .line 125
    .local v25, "lineBack":Lcom/google/android/gms/maps/model/PolylineOptions;
    new-instance v24, Lcom/google/android/gms/maps/model/PolylineOptions;

    invoke-direct/range {v24 .. v24}, Lcom/google/android/gms/maps/model/PolylineOptions;-><init>()V

    .line 126
    .local v24, "line":Lcom/google/android/gms/maps/model/PolylineOptions;
    const/4 v3, -0x1

    move-object/from16 v0, v25

    invoke-virtual {v0, v3}, Lcom/google/android/gms/maps/model/PolylineOptions;->color(I)Lcom/google/android/gms/maps/model/PolylineOptions;

    .line 127
    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/ItineraryScreen;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v10, 0x7f080020

    invoke-virtual {v3, v10}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v3

    move-object/from16 v0, v25

    invoke-virtual {v0, v3}, Lcom/google/android/gms/maps/model/PolylineOptions;->width(F)Lcom/google/android/gms/maps/model/PolylineOptions;

    .line 128
    move-object/from16 v0, v24

    move/from16 v1, p2

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/PolylineOptions;->color(I)Lcom/google/android/gms/maps/model/PolylineOptions;

    .line 129
    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/ItineraryScreen;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v10, 0x7f080021

    invoke-virtual {v3, v10}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v3

    move-object/from16 v0, v24

    invoke-virtual {v0, v3}, Lcom/google/android/gms/maps/model/PolylineOptions;->width(F)Lcom/google/android/gms/maps/model/PolylineOptions;

    .line 132
    invoke-direct/range {p0 .. p0}, Lcom/thetransitapp/droid/ItineraryScreen;->clear()V

    .line 134
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/thetransitapp/droid/ItineraryScreen;->viewController:Lcom/thetransitapp/droid/controller/ItineraryMapViewController;

    invoke-virtual {v3}, Lcom/thetransitapp/droid/controller/ItineraryMapViewController;->getScheduleItem()Lcom/thetransitapp/droid/model/ScheduleItem;

    move-result-object v3

    invoke-virtual {v3}, Lcom/thetransitapp/droid/model/ScheduleItem;->getItinerary()Lcom/thetransitapp/droid/model/Itinerary;

    move-result-object v21

    .line 135
    .local v21, "itinerary":Lcom/thetransitapp/droid/model/Itinerary;
    invoke-virtual/range {v21 .. v21}, Lcom/thetransitapp/droid/model/Itinerary;->getShape()Ljava/lang/String;

    move-result-object v32

    .line 137
    .local v32, "shape":Ljava/lang/String;
    if-eqz v32, :cond_0

    .line 138
    invoke-static/range {v32 .. v32}, Lcom/thetransitapp/droid/util/PolylineUtility;->decodePoly(Ljava/lang/String;)Ljava/util/List;

    move-result-object v29

    .line 139
    .local v29, "points":Ljava/util/List;, "Ljava/util/List<Lcom/google/android/gms/maps/model/LatLng;>;"
    move-object/from16 v0, v25

    move-object/from16 v1, v29

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/PolylineOptions;->addAll(Ljava/lang/Iterable;)Lcom/google/android/gms/maps/model/PolylineOptions;

    .line 140
    move-object/from16 v0, v24

    move-object/from16 v1, v29

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/PolylineOptions;->addAll(Ljava/lang/Iterable;)Lcom/google/android/gms/maps/model/PolylineOptions;

    .line 143
    .end local v29    # "points":Ljava/util/List;, "Ljava/util/List<Lcom/google/android/gms/maps/model/LatLng;>;"
    :cond_0
    invoke-virtual/range {v21 .. v21}, Lcom/thetransitapp/droid/model/Itinerary;->getStops()Ljava/util/List;

    move-result-object v3

    if-eqz v3, :cond_2

    .line 145
    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/ItineraryScreen;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v10, 0x7f080024

    invoke-virtual {v3, v10}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v3

    .line 146
    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/ItineraryScreen;->getResources()Landroid/content/res/Resources;

    move-result-object v10

    const v11, 0x7f080025

    invoke-virtual {v10, v11}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v10

    .line 144
    move/from16 v0, p2

    invoke-static {v0, v3, v10}, Lcom/thetransitapp/droid/util/BitmapUtility;->getPin(III)Landroid/graphics/Bitmap;

    move-result-object v28

    .line 147
    .local v28, "pinBitmap":Landroid/graphics/Bitmap;
    invoke-static/range {v28 .. v28}, Lcom/google/android/gms/maps/model/BitmapDescriptorFactory;->fromBitmap(Landroid/graphics/Bitmap;)Lcom/google/android/gms/maps/model/BitmapDescriptor;

    move-result-object v7

    .line 148
    .local v7, "pinDescriptor":Lcom/google/android/gms/maps/model/BitmapDescriptor;
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/thetransitapp/droid/ItineraryScreen;->viewController:Lcom/thetransitapp/droid/controller/ItineraryMapViewController;

    invoke-virtual {v3}, Lcom/thetransitapp/droid/controller/ItineraryMapViewController;->getScheduleItem()Lcom/thetransitapp/droid/model/ScheduleItem;

    move-result-object v3

    invoke-virtual {v3}, Lcom/thetransitapp/droid/model/ScheduleItem;->getServiceDay()Lcom/thetransitapp/droid/model/ServiceDay;

    move-result-object v31

    .line 149
    .local v31, "serviceDay":Lcom/thetransitapp/droid/model/ServiceDay;
    invoke-virtual/range {v24 .. v24}, Lcom/google/android/gms/maps/model/PolylineOptions;->getPoints()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v20

    .line 150
    .local v20, "drawLine":Z
    const/4 v9, 0x1

    .line 151
    .local v9, "beforeCurrent":Z
    const/16 v18, 0x0

    .line 153
    .local v18, "closest":Lcom/thetransitapp/droid/model/SimplePlacemark;
    invoke-virtual/range {v21 .. v21}, Lcom/thetransitapp/droid/model/Itinerary;->getStops()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v35

    :cond_1
    :goto_0
    invoke-interface/range {v35 .. v35}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-nez v3, :cond_3

    .line 211
    .end local v7    # "pinDescriptor":Lcom/google/android/gms/maps/model/BitmapDescriptor;
    .end local v9    # "beforeCurrent":Z
    .end local v18    # "closest":Lcom/thetransitapp/droid/model/SimplePlacemark;
    .end local v20    # "drawLine":Z
    .end local v28    # "pinBitmap":Landroid/graphics/Bitmap;
    .end local v31    # "serviceDay":Lcom/thetransitapp/droid/model/ServiceDay;
    :cond_2
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/thetransitapp/droid/ItineraryScreen;->lines:Ljava/util/List;

    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/ItineraryScreen;->getMap()Lcom/google/android/gms/maps/GoogleMap;

    move-result-object v10

    move-object/from16 v0, v25

    invoke-virtual {v10, v0}, Lcom/google/android/gms/maps/GoogleMap;->addPolyline(Lcom/google/android/gms/maps/model/PolylineOptions;)Lcom/google/android/gms/maps/model/Polyline;

    move-result-object v10

    invoke-interface {v3, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 212
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/thetransitapp/droid/ItineraryScreen;->lines:Ljava/util/List;

    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/ItineraryScreen;->getMap()Lcom/google/android/gms/maps/GoogleMap;

    move-result-object v10

    move-object/from16 v0, v24

    invoke-virtual {v10, v0}, Lcom/google/android/gms/maps/GoogleMap;->addPolyline(Lcom/google/android/gms/maps/model/PolylineOptions;)Lcom/google/android/gms/maps/model/Polyline;

    move-result-object v10

    invoke-interface {v3, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 214
    invoke-virtual/range {p1 .. p1}, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->getClosestStop()Lcom/thetransitapp/droid/model/Stop;

    move-result-object v3

    move-object/from16 v0, p0

    invoke-direct {v0, v3}, Lcom/thetransitapp/droid/ItineraryScreen;->centerMap(Lcom/thetransitapp/droid/model/Stop;)V

    .line 215
    return-void

    .line 153
    .restart local v7    # "pinDescriptor":Lcom/google/android/gms/maps/model/BitmapDescriptor;
    .restart local v9    # "beforeCurrent":Z
    .restart local v18    # "closest":Lcom/thetransitapp/droid/model/SimplePlacemark;
    .restart local v20    # "drawLine":Z
    .restart local v28    # "pinBitmap":Landroid/graphics/Bitmap;
    .restart local v31    # "serviceDay":Lcom/thetransitapp/droid/model/ServiceDay;
    :cond_3
    invoke-interface/range {v35 .. v35}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/thetransitapp/droid/model/Stop;

    .line 154
    .local v4, "stop":Lcom/thetransitapp/droid/model/Stop;
    invoke-virtual {v4}, Lcom/thetransitapp/droid/model/Stop;->getPlacemark()Lcom/thetransitapp/droid/model/SimplePlacemark;

    move-result-object v3

    invoke-virtual {v3}, Lcom/thetransitapp/droid/model/SimplePlacemark;->toLatLng()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v6

    .line 155
    .local v6, "pos":Lcom/google/android/gms/maps/model/LatLng;
    move-object/from16 v0, v21

    move-object/from16 v1, v31

    invoke-virtual {v0, v4, v1}, Lcom/thetransitapp/droid/model/Itinerary;->getSchedule(Lcom/thetransitapp/droid/model/Stop;Lcom/thetransitapp/droid/model/ServiceDay;)Lcom/thetransitapp/droid/model/Schedule;

    move-result-object v30

    .line 156
    .local v30, "schedule":Lcom/thetransitapp/droid/model/Schedule;
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/thetransitapp/droid/ItineraryScreen;->viewController:Lcom/thetransitapp/droid/controller/ItineraryMapViewController;

    invoke-virtual {v3}, Lcom/thetransitapp/droid/controller/ItineraryMapViewController;->getScheduleItem()Lcom/thetransitapp/droid/model/ScheduleItem;

    move-result-object v3

    invoke-virtual {v3}, Lcom/thetransitapp/droid/model/ScheduleItem;->getTripId()Ljava/lang/String;

    move-result-object v3

    move-object/from16 v0, v30

    invoke-virtual {v0, v3}, Lcom/thetransitapp/droid/model/Schedule;->getScheduleItemForTrip(Ljava/lang/String;)Lcom/thetransitapp/droid/model/ScheduleItem;

    move-result-object v5

    .line 157
    .local v5, "next":Lcom/thetransitapp/droid/model/ScheduleItem;
    invoke-virtual/range {p1 .. p1}, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->getClosestStop()Lcom/thetransitapp/droid/model/Stop;

    move-result-object v3

    invoke-virtual {v4, v3}, Lcom/thetransitapp/droid/model/Stop;->equals(Ljava/lang/Object;)Z

    move-result v8

    .local v8, "isClosest":Z
    move-object/from16 v3, p0

    .line 159
    invoke-direct/range {v3 .. v9}, Lcom/thetransitapp/droid/ItineraryScreen;->createMarker(Lcom/thetransitapp/droid/model/Stop;Lcom/thetransitapp/droid/model/ScheduleItem;Lcom/google/android/gms/maps/model/LatLng;Lcom/google/android/gms/maps/model/BitmapDescriptor;ZZ)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v27

    .line 160
    .local v27, "options":Lcom/google/android/gms/maps/model/MarkerOptions;
    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/ItineraryScreen;->getMap()Lcom/google/android/gms/maps/GoogleMap;

    move-result-object v3

    move-object/from16 v0, v27

    invoke-virtual {v3, v0}, Lcom/google/android/gms/maps/GoogleMap;->addMarker(Lcom/google/android/gms/maps/model/MarkerOptions;)Lcom/google/android/gms/maps/model/Marker;

    move-result-object v26

    .line 161
    .local v26, "marker":Lcom/google/android/gms/maps/model/Marker;
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/thetransitapp/droid/ItineraryScreen;->stopMarkers:Ljava/util/List;

    move-object/from16 v0, v26

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 163
    if-eqz v18, :cond_6

    .line 164
    invoke-virtual/range {v18 .. v18}, Lcom/thetransitapp/droid/model/SimplePlacemark;->toLocation()Landroid/location/Location;

    move-result-object v3

    invoke-virtual {v4}, Lcom/thetransitapp/droid/model/Stop;->getPlacemark()Lcom/thetransitapp/droid/model/SimplePlacemark;

    move-result-object v10

    invoke-virtual {v10}, Lcom/thetransitapp/droid/model/SimplePlacemark;->toLocation()Landroid/location/Location;

    move-result-object v10

    invoke-virtual {v3, v10}, Landroid/location/Location;->bearingTo(Landroid/location/Location;)F

    move-result v17

    .line 165
    .local v17, "bearing":F
    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/ItineraryScreen;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v10, 0x7f080026

    invoke-virtual {v3, v10}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v33

    .line 166
    .local v33, "size":I
    move/from16 v0, p2

    move/from16 v1, v17

    move/from16 v2, v33

    invoke-static {v0, v1, v2}, Lcom/thetransitapp/droid/util/BitmapUtility;->getDirectionArrow(IFI)Landroid/graphics/Bitmap;

    move-result-object v19

    .line 167
    .local v19, "directionArrow":Landroid/graphics/Bitmap;
    invoke-virtual/range {v18 .. v18}, Lcom/thetransitapp/droid/model/SimplePlacemark;->toLatLng()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v22

    .line 169
    .local v22, "latLng":Lcom/google/android/gms/maps/model/LatLng;
    const/high16 v23, 0x3f000000    # 0.5f

    .line 170
    .local v23, "left":F
    const/high16 v34, 0x3f000000    # 0.5f

    .line 172
    .local v34, "top":F
    iget-wide v10, v6, Lcom/google/android/gms/maps/model/LatLng;->longitude:D

    invoke-virtual/range {v18 .. v18}, Lcom/thetransitapp/droid/model/SimplePlacemark;->getLongitude()D

    move-result-wide v12

    cmpl-double v3, v10, v12

    if-lez v3, :cond_8

    .line 173
    const/16 v23, 0x0

    .line 178
    :cond_4
    :goto_1
    iget-wide v10, v6, Lcom/google/android/gms/maps/model/LatLng;->latitude:D

    invoke-virtual/range {v18 .. v18}, Lcom/thetransitapp/droid/model/SimplePlacemark;->getLatitude()D

    move-result-wide v12

    cmpl-double v3, v10, v12

    if-lez v3, :cond_9

    .line 179
    const/16 v34, 0x0

    .line 184
    :cond_5
    :goto_2
    new-instance v3, Lcom/google/android/gms/maps/model/MarkerOptions;

    invoke-direct {v3}, Lcom/google/android/gms/maps/model/MarkerOptions;-><init>()V

    move-object/from16 v0, v22

    invoke-virtual {v3, v0}, Lcom/google/android/gms/maps/model/MarkerOptions;->position(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v3

    .line 185
    invoke-static/range {v19 .. v19}, Lcom/google/android/gms/maps/model/BitmapDescriptorFactory;->fromBitmap(Landroid/graphics/Bitmap;)Lcom/google/android/gms/maps/model/BitmapDescriptor;

    move-result-object v10

    invoke-virtual {v3, v10}, Lcom/google/android/gms/maps/model/MarkerOptions;->icon(Lcom/google/android/gms/maps/model/BitmapDescriptor;)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v3

    move/from16 v0, v23

    move/from16 v1, v34

    invoke-virtual {v3, v0, v1}, Lcom/google/android/gms/maps/model/MarkerOptions;->anchor(FF)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v27

    .line 186
    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/ItineraryScreen;->getMap()Lcom/google/android/gms/maps/GoogleMap;

    move-result-object v3

    move-object/from16 v0, v27

    invoke-virtual {v3, v0}, Lcom/google/android/gms/maps/GoogleMap;->addMarker(Lcom/google/android/gms/maps/model/MarkerOptions;)Lcom/google/android/gms/maps/model/Marker;

    move-result-object v26

    .line 187
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/thetransitapp/droid/ItineraryScreen;->otherMarkers:Ljava/util/List;

    move-object/from16 v0, v26

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 188
    const/16 v18, 0x0

    .line 191
    .end local v17    # "bearing":F
    .end local v19    # "directionArrow":Landroid/graphics/Bitmap;
    .end local v22    # "latLng":Lcom/google/android/gms/maps/model/LatLng;
    .end local v23    # "left":F
    .end local v33    # "size":I
    .end local v34    # "top":F
    :cond_6
    if-eqz v8, :cond_7

    .line 192
    const/4 v9, 0x0

    .line 194
    const/high16 v3, 0x42f00000    # 120.0f

    invoke-static {v3}, Lcom/google/android/gms/maps/model/BitmapDescriptorFactory;->defaultMarker(F)Lcom/google/android/gms/maps/model/BitmapDescriptor;

    move-result-object v14

    .local v14, "pin":Lcom/google/android/gms/maps/model/BitmapDescriptor;
    move-object/from16 v10, p0

    move-object v11, v4

    move-object v12, v5

    move-object v13, v6

    move v15, v8

    move/from16 v16, v9

    .line 195
    invoke-direct/range {v10 .. v16}, Lcom/thetransitapp/droid/ItineraryScreen;->createMarker(Lcom/thetransitapp/droid/model/Stop;Lcom/thetransitapp/droid/model/ScheduleItem;Lcom/google/android/gms/maps/model/LatLng;Lcom/google/android/gms/maps/model/BitmapDescriptor;ZZ)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v27

    .line 197
    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/ItineraryScreen;->getMap()Lcom/google/android/gms/maps/GoogleMap;

    move-result-object v3

    move-object/from16 v0, v27

    invoke-virtual {v3, v0}, Lcom/google/android/gms/maps/GoogleMap;->addMarker(Lcom/google/android/gms/maps/model/MarkerOptions;)Lcom/google/android/gms/maps/model/Marker;

    move-result-object v26

    .line 198
    invoke-virtual/range {v26 .. v26}, Lcom/google/android/gms/maps/model/Marker;->showInfoWindow()V

    .line 199
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/thetransitapp/droid/ItineraryScreen;->otherMarkers:Ljava/util/List;

    move-object/from16 v0, v26

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 200
    invoke-virtual {v4}, Lcom/thetransitapp/droid/model/Stop;->getPlacemark()Lcom/thetransitapp/droid/model/SimplePlacemark;

    move-result-object v18

    .line 203
    .end local v14    # "pin":Lcom/google/android/gms/maps/model/BitmapDescriptor;
    :cond_7
    if-eqz v20, :cond_1

    .line 204
    move-object/from16 v0, v25

    invoke-virtual {v0, v6}, Lcom/google/android/gms/maps/model/PolylineOptions;->add(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/PolylineOptions;

    .line 205
    move-object/from16 v0, v24

    invoke-virtual {v0, v6}, Lcom/google/android/gms/maps/model/PolylineOptions;->add(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/PolylineOptions;

    goto/16 :goto_0

    .line 174
    .restart local v17    # "bearing":F
    .restart local v19    # "directionArrow":Landroid/graphics/Bitmap;
    .restart local v22    # "latLng":Lcom/google/android/gms/maps/model/LatLng;
    .restart local v23    # "left":F
    .restart local v33    # "size":I
    .restart local v34    # "top":F
    :cond_8
    iget-wide v10, v6, Lcom/google/android/gms/maps/model/LatLng;->longitude:D

    invoke-virtual/range {v18 .. v18}, Lcom/thetransitapp/droid/model/SimplePlacemark;->getLongitude()D

    move-result-wide v12

    cmpg-double v3, v10, v12

    if-gez v3, :cond_4

    .line 175
    const/high16 v23, 0x3f800000    # 1.0f

    goto/16 :goto_1

    .line 180
    :cond_9
    iget-wide v10, v6, Lcom/google/android/gms/maps/model/LatLng;->latitude:D

    invoke-virtual/range {v18 .. v18}, Lcom/thetransitapp/droid/model/SimplePlacemark;->getLatitude()D

    move-result-wide v12

    cmpg-double v3, v10, v12

    if-gez v3, :cond_5

    .line 181
    const/high16 v34, 0x3f800000    # 1.0f

    goto/16 :goto_2
.end method


# virtual methods
.method public onCameraChange(Lcom/google/android/gms/maps/model/CameraPosition;)V
    .locals 4
    .param p1, "position"    # Lcom/google/android/gms/maps/model/CameraPosition;

    .prologue
    .line 98
    invoke-super {p0, p1}, Lcom/thetransitapp/droid/BaseItinerariesScreen;->onCameraChange(Lcom/google/android/gms/maps/model/CameraPosition;)V

    .line 100
    iget-object v2, p0, Lcom/thetransitapp/droid/ItineraryScreen;->stopMarkers:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_1

    .line 101
    const/4 v1, 0x0

    .line 103
    .local v1, "visible":Z
    iget v2, p1, Lcom/google/android/gms/maps/model/CameraPosition;->zoom:F

    iget-object v3, p0, Lcom/thetransitapp/droid/ItineraryScreen;->viewController:Lcom/thetransitapp/droid/controller/ItineraryMapViewController;

    invoke-virtual {v3}, Lcom/thetransitapp/droid/controller/ItineraryMapViewController;->getMarkerZoomLevel()F

    move-result v3

    cmpl-float v2, v2, v3

    if-lez v2, :cond_0

    .line 104
    const/4 v1, 0x1

    .line 107
    :cond_0
    iget-object v2, p0, Lcom/thetransitapp/droid/ItineraryScreen;->stopMarkers:Ljava/util/List;

    const/4 v3, 0x0

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/maps/model/Marker;

    invoke-virtual {v2}, Lcom/google/android/gms/maps/model/Marker;->isVisible()Z

    move-result v2

    if-eq v2, v1, :cond_1

    .line 108
    iget-object v2, p0, Lcom/thetransitapp/droid/ItineraryScreen;->stopMarkers:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-nez v3, :cond_2

    .line 113
    .end local v1    # "visible":Z
    :cond_1
    return-void

    .line 108
    .restart local v1    # "visible":Z
    :cond_2
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/maps/model/Marker;

    .line 109
    .local v0, "marker":Lcom/google/android/gms/maps/model/Marker;
    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/Marker;->setVisible(Z)V

    goto :goto_0
.end method

.method public onPause()V
    .locals 0

    .prologue
    .line 91
    invoke-super {p0}, Lcom/thetransitapp/droid/BaseItinerariesScreen;->onPause()V

    .line 93
    invoke-direct {p0}, Lcom/thetransitapp/droid/ItineraryScreen;->clear()V

    .line 94
    return-void
.end method

.method public onRouteClick(Landroid/view/View;)V
    .locals 1
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 120
    iget-object v0, p0, Lcom/thetransitapp/droid/ItineraryScreen;->viewController:Lcom/thetransitapp/droid/controller/ItineraryMapViewController;

    invoke-virtual {v0}, Lcom/thetransitapp/droid/controller/ItineraryMapViewController;->changeDirection()V

    .line 121
    return-void
.end method

.method public onStart()V
    .locals 6

    .prologue
    .line 61
    invoke-super {p0}, Lcom/thetransitapp/droid/BaseItinerariesScreen;->onStart()V

    .line 63
    invoke-super {p0}, Lcom/thetransitapp/droid/BaseItinerariesScreen;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    .line 65
    .local v0, "args":Landroid/os/Bundle;
    if-eqz v0, :cond_0

    .line 66
    const/4 v2, 0x0

    .line 67
    .local v2, "scheduleItem":Lcom/thetransitapp/droid/model/ScheduleItem;
    const-string v4, "scheduleItem"

    invoke-virtual {v0, v4}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_1

    const/4 v1, 0x0

    .line 69
    .local v1, "canChangeDirection":Z
    :goto_0
    if-eqz v1, :cond_2

    .line 70
    iget-object v4, p0, Lcom/thetransitapp/droid/ItineraryScreen;->routeContent:Landroid/widget/LinearLayout;

    new-instance v5, Lcom/thetransitapp/droid/ItineraryScreen$1;

    invoke-direct {v5, p0}, Lcom/thetransitapp/droid/ItineraryScreen$1;-><init>(Lcom/thetransitapp/droid/ItineraryScreen;)V

    invoke-virtual {v4, v5}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 81
    :goto_1
    const-string v4, "route"

    invoke-virtual {v0, v4}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 82
    const-string v4, "route"

    invoke-virtual {v0, v4}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;

    .line 84
    .local v3, "viewModel":Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;
    iget-object v4, p0, Lcom/thetransitapp/droid/ItineraryScreen;->viewController:Lcom/thetransitapp/droid/controller/ItineraryMapViewController;

    invoke-virtual {v4, p0, v3, v2}, Lcom/thetransitapp/droid/controller/ItineraryMapViewController;->init(Lcom/thetransitapp/droid/ItineraryScreen;Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;Lcom/thetransitapp/droid/model/ScheduleItem;)V

    .line 87
    .end local v1    # "canChangeDirection":Z
    .end local v2    # "scheduleItem":Lcom/thetransitapp/droid/model/ScheduleItem;
    .end local v3    # "viewModel":Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;
    :cond_0
    return-void

    .line 67
    .restart local v2    # "scheduleItem":Lcom/thetransitapp/droid/model/ScheduleItem;
    :cond_1
    const/4 v1, 0x1

    goto :goto_0

    .line 78
    .restart local v1    # "canChangeDirection":Z
    :cond_2
    const-string v4, "scheduleItem"

    invoke-virtual {v0, v4}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v2

    .end local v2    # "scheduleItem":Lcom/thetransitapp/droid/model/ScheduleItem;
    check-cast v2, Lcom/thetransitapp/droid/model/ScheduleItem;

    .restart local v2    # "scheduleItem":Lcom/thetransitapp/droid/model/ScheduleItem;
    goto :goto_1
.end method

.method public showDirection(Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;)V
    .locals 2
    .param p1, "viewModel"    # Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;

    .prologue
    .line 116
    invoke-virtual {p1}, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->getCurrentItinerary()Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;

    move-result-object v0

    invoke-virtual {p1}, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->getPathColor()I

    move-result v1

    invoke-direct {p0, v0, v1}, Lcom/thetransitapp/droid/ItineraryScreen;->drawItinerary(Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;I)V

    .line 117
    return-void
.end method
