.class public final Lcom/thetransitapp/droid/util/ShieldUtility;
.super Ljava/lang/Object;
.source "ShieldUtility.java"


# instance fields
.field private context:Landroid/content/Context;

.field private map:Lcom/google/android/gms/maps/GoogleMap;

.field private shieldsMarkers:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/maps/model/Marker;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/google/android/gms/maps/GoogleMap;Landroid/content/Context;)V
    .locals 1
    .param p1, "map"    # Lcom/google/android/gms/maps/GoogleMap;
    .param p2, "context"    # Landroid/content/Context;

    .prologue
    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    iput-object p1, p0, Lcom/thetransitapp/droid/util/ShieldUtility;->map:Lcom/google/android/gms/maps/GoogleMap;

    .line 33
    iput-object p2, p0, Lcom/thetransitapp/droid/util/ShieldUtility;->context:Landroid/content/Context;

    .line 35
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/thetransitapp/droid/util/ShieldUtility;->shieldsMarkers:Ljava/util/List;

    .line 36
    return-void
.end method

.method static synthetic access$0(Lcom/thetransitapp/droid/util/ShieldUtility;)Landroid/content/Context;
    .locals 1

    .prologue
    .line 27
    iget-object v0, p0, Lcom/thetransitapp/droid/util/ShieldUtility;->context:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic access$1(Lcom/thetransitapp/droid/util/ShieldUtility;Ljava/util/List;Lcom/google/android/gms/maps/model/BitmapDescriptor;)V
    .locals 0

    .prologue
    .line 84
    invoke-direct {p0, p1, p2}, Lcom/thetransitapp/droid/util/ShieldUtility;->showShields(Ljava/util/List;Lcom/google/android/gms/maps/model/BitmapDescriptor;)V

    return-void
.end method

.method private calculateShieldsPositions(Ljava/util/List;D)Ljava/util/List;
    .locals 24
    .param p2, "latitudeDelta"    # D
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/maps/model/LatLng;",
            ">;D)",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/maps/model/LatLng;",
            ">;"
        }
    .end annotation

    .prologue
    .line 94
    .local p1, "points":Ljava/util/List;, "Ljava/util/List<Lcom/google/android/gms/maps/model/LatLng;>;"
    const-wide/16 v18, 0x0

    .line 95
    .local v18, "totalDistance":D
    const/4 v12, 0x0

    .line 97
    .local v12, "lastPoint":Lcom/thetransitapp/droid/model/SimplePlacemark;
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v20

    :goto_0
    invoke-interface/range {v20 .. v20}, Ljava/util/Iterator;->hasNext()Z

    move-result v21

    if-nez v21, :cond_0

    .line 107
    const-wide v20, 0x40e86a0000000000L    # 50000.0

    div-double v20, v18, v20

    div-double v20, v20, p2

    const-wide/high16 v22, 0x3ff0000000000000L    # 1.0

    invoke-static/range {v20 .. v23}, Ljava/lang/Math;->max(DD)D

    move-result-wide v20

    move-wide/from16 v0, v20

    double-to-int v4, v0

    .line 108
    .local v4, "count":I
    add-int/lit8 v20, v4, 0x1

    move/from16 v0, v20

    int-to-double v0, v0

    move-wide/from16 v20, v0

    div-double v7, v18, v20

    .line 110
    .local v7, "distancePerShield":D
    const/16 v20, 0x32

    move/from16 v0, v20

    invoke-static {v4, v0}, Ljava/lang/Math;->min(II)I

    move-result v4

    .line 112
    new-instance v15, Ljava/util/ArrayList;

    invoke-direct {v15, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 113
    .local v15, "positions":Ljava/util/List;, "Ljava/util/List<Lcom/google/android/gms/maps/model/LatLng;>;"
    const-wide/16 v2, 0x0

    .line 114
    .local v2, "annotationDistance":D
    move-wide/from16 v16, v7

    .line 115
    .local v16, "targetDistance":D
    const/4 v11, 0x0

    .line 116
    .local v11, "index":I
    const/4 v12, 0x0

    .line 118
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v20

    :goto_1
    invoke-interface/range {v20 .. v20}, Ljava/util/Iterator;->hasNext()Z

    move-result v21

    if-nez v21, :cond_2

    .line 136
    return-object v15

    .line 97
    .end local v2    # "annotationDistance":D
    .end local v4    # "count":I
    .end local v7    # "distancePerShield":D
    .end local v11    # "index":I
    .end local v15    # "positions":Ljava/util/List;, "Ljava/util/List<Lcom/google/android/gms/maps/model/LatLng;>;"
    .end local v16    # "targetDistance":D
    :cond_0
    invoke-interface/range {v20 .. v20}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lcom/google/android/gms/maps/model/LatLng;

    .line 98
    .local v14, "point":Lcom/google/android/gms/maps/model/LatLng;
    new-instance v13, Lcom/thetransitapp/droid/model/SimplePlacemark;

    invoke-direct {v13, v14}, Lcom/thetransitapp/droid/model/SimplePlacemark;-><init>(Lcom/google/android/gms/maps/model/LatLng;)V

    .line 100
    .local v13, "place":Lcom/thetransitapp/droid/model/SimplePlacemark;
    if-eqz v12, :cond_1

    .line 101
    invoke-virtual {v13, v12}, Lcom/thetransitapp/droid/model/SimplePlacemark;->distanceTo(Lcom/thetransitapp/droid/model/SimplePlacemark;)F

    move-result v21

    move/from16 v0, v21

    float-to-double v0, v0

    move-wide/from16 v21, v0

    add-double v18, v18, v21

    .line 104
    :cond_1
    move-object v12, v13

    goto :goto_0

    .line 118
    .end local v13    # "place":Lcom/thetransitapp/droid/model/SimplePlacemark;
    .end local v14    # "point":Lcom/google/android/gms/maps/model/LatLng;
    .restart local v2    # "annotationDistance":D
    .restart local v4    # "count":I
    .restart local v7    # "distancePerShield":D
    .restart local v11    # "index":I
    .restart local v15    # "positions":Ljava/util/List;, "Ljava/util/List<Lcom/google/android/gms/maps/model/LatLng;>;"
    .restart local v16    # "targetDistance":D
    :cond_2
    invoke-interface/range {v20 .. v20}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lcom/google/android/gms/maps/model/LatLng;

    .line 119
    .restart local v14    # "point":Lcom/google/android/gms/maps/model/LatLng;
    new-instance v13, Lcom/thetransitapp/droid/model/SimplePlacemark;

    invoke-direct {v13, v14}, Lcom/thetransitapp/droid/model/SimplePlacemark;-><init>(Lcom/google/android/gms/maps/model/LatLng;)V

    .line 121
    .restart local v13    # "place":Lcom/thetransitapp/droid/model/SimplePlacemark;
    if-eqz v12, :cond_3

    .line 122
    invoke-virtual {v13, v12}, Lcom/thetransitapp/droid/model/SimplePlacemark;->distanceTo(Lcom/thetransitapp/droid/model/SimplePlacemark;)F

    move-result v21

    move/from16 v0, v21

    float-to-double v5, v0

    .line 123
    .local v5, "distance":D
    add-double/2addr v2, v5

    .line 125
    :goto_2
    cmpg-double v21, v16, v2

    if-gez v21, :cond_3

    if-lt v11, v4, :cond_4

    .line 133
    .end local v5    # "distance":D
    :cond_3
    move-object v12, v13

    goto :goto_1

    .line 126
    .restart local v5    # "distance":D
    :cond_4
    sub-double v21, v2, v16

    sub-double v9, v5, v21

    .line 127
    .local v9, "distanceRemaining":D
    invoke-static {v12, v13, v9, v10}, Lcom/thetransitapp/droid/util/ShieldUtility;->interpolateLocation(Lcom/thetransitapp/droid/model/SimplePlacemark;Lcom/thetransitapp/droid/model/SimplePlacemark;D)Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v21

    move-object/from16 v0, v21

    invoke-interface {v15, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 128
    add-double v16, v16, v7

    .line 129
    add-int/lit8 v11, v11, 0x1

    goto :goto_2
.end method

.method public static interpolateLocation(Lcom/thetransitapp/droid/model/SimplePlacemark;Lcom/thetransitapp/droid/model/SimplePlacemark;D)Lcom/google/android/gms/maps/model/LatLng;
    .locals 5
    .param p0, "point1"    # Lcom/thetransitapp/droid/model/SimplePlacemark;
    .param p1, "point2"    # Lcom/thetransitapp/droid/model/SimplePlacemark;
    .param p2, "distance"    # D

    .prologue
    .line 140
    invoke-virtual {p0, p1}, Lcom/thetransitapp/droid/model/SimplePlacemark;->distanceTo(Lcom/thetransitapp/droid/model/SimplePlacemark;)F

    move-result v3

    float-to-double v1, v3

    .line 141
    .local v1, "totalDistance":D
    div-double v3, p2, v1

    double-to-float v0, v3

    .line 143
    .local v0, "distanceRatio":F
    float-to-double v3, v0

    invoke-static {p0, p1, v3, v4}, Lcom/thetransitapp/droid/util/ShieldUtility;->interpolateLocationRatio(Lcom/thetransitapp/droid/model/SimplePlacemark;Lcom/thetransitapp/droid/model/SimplePlacemark;D)Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v3

    return-object v3
.end method

.method public static interpolateLocationRatio(Lcom/thetransitapp/droid/model/SimplePlacemark;Lcom/thetransitapp/droid/model/SimplePlacemark;D)Lcom/google/android/gms/maps/model/LatLng;
    .locals 9
    .param p0, "point1"    # Lcom/thetransitapp/droid/model/SimplePlacemark;
    .param p1, "point2"    # Lcom/thetransitapp/droid/model/SimplePlacemark;
    .param p2, "distanceRatio"    # D

    .prologue
    const-wide/high16 v6, -0x4010000000000000L    # -1.0

    .line 147
    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/SimplePlacemark;->getLatitude()D

    move-result-wide v2

    invoke-virtual {p1}, Lcom/thetransitapp/droid/model/SimplePlacemark;->getLatitude()D

    move-result-wide v4

    sub-double/2addr v2, v4

    mul-double/2addr v2, v6

    double-to-float v0, v2

    .line 148
    .local v0, "latitudeDelta":F
    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/SimplePlacemark;->getLongitude()D

    move-result-wide v2

    invoke-virtual {p1}, Lcom/thetransitapp/droid/model/SimplePlacemark;->getLongitude()D

    move-result-wide v4

    sub-double/2addr v2, v4

    mul-double/2addr v2, v6

    double-to-float v1, v2

    .line 150
    .local v1, "longitudeDelta":F
    new-instance v2, Lcom/google/android/gms/maps/model/LatLng;

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/SimplePlacemark;->getLatitude()D

    move-result-wide v3

    float-to-double v5, v0

    mul-double/2addr v5, p2

    add-double/2addr v3, v5

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/SimplePlacemark;->getLongitude()D

    move-result-wide v5

    float-to-double v7, v1

    .line 151
    mul-double/2addr v7, p2

    add-double/2addr v5, v7

    .line 150
    invoke-direct {v2, v3, v4, v5, v6}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    return-object v2
.end method

.method private showShields(Ljava/util/List;Lcom/google/android/gms/maps/model/BitmapDescriptor;)V
    .locals 6
    .param p2, "pin"    # Lcom/google/android/gms/maps/model/BitmapDescriptor;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/maps/model/LatLng;",
            ">;",
            "Lcom/google/android/gms/maps/model/BitmapDescriptor;",
            ")V"
        }
    .end annotation

    .prologue
    .local p1, "positions":Ljava/util/List;, "Ljava/util/List<Lcom/google/android/gms/maps/model/LatLng;>;"
    const/high16 v5, 0x3f000000    # 0.5f

    .line 85
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-nez v3, :cond_0

    .line 91
    return-void

    .line 85
    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/maps/model/LatLng;

    .line 86
    .local v1, "pos":Lcom/google/android/gms/maps/model/LatLng;
    iget-object v3, p0, Lcom/thetransitapp/droid/util/ShieldUtility;->map:Lcom/google/android/gms/maps/GoogleMap;

    new-instance v4, Lcom/google/android/gms/maps/model/MarkerOptions;

    invoke-direct {v4}, Lcom/google/android/gms/maps/model/MarkerOptions;-><init>()V

    invoke-virtual {v4, v1}, Lcom/google/android/gms/maps/model/MarkerOptions;->position(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v4

    invoke-virtual {v4, p2}, Lcom/google/android/gms/maps/model/MarkerOptions;->icon(Lcom/google/android/gms/maps/model/BitmapDescriptor;)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v4

    invoke-virtual {v4, v5, v5}, Lcom/google/android/gms/maps/model/MarkerOptions;->anchor(FF)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/google/android/gms/maps/GoogleMap;->addMarker(Lcom/google/android/gms/maps/model/MarkerOptions;)Lcom/google/android/gms/maps/model/Marker;

    move-result-object v0

    .line 87
    .local v0, "marker":Lcom/google/android/gms/maps/model/Marker;
    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/Marker;->showInfoWindow()V

    .line 89
    iget-object v3, p0, Lcom/thetransitapp/droid/util/ShieldUtility;->shieldsMarkers:Ljava/util/List;

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0
.end method


# virtual methods
.method public clear()V
    .locals 3

    .prologue
    .line 39
    iget-object v1, p0, Lcom/thetransitapp/droid/util/ShieldUtility;->shieldsMarkers:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_0

    .line 43
    iget-object v1, p0, Lcom/thetransitapp/droid/util/ShieldUtility;->shieldsMarkers:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->clear()V

    .line 44
    return-void

    .line 39
    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/maps/model/Marker;

    .line 40
    .local v0, "marker":Lcom/google/android/gms/maps/model/Marker;
    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/Marker;->remove()V

    goto :goto_0
.end method

.method public draw(Lcom/thetransitapp/droid/model/RoutingLeg;)V
    .locals 14
    .param p1, "leg"    # Lcom/thetransitapp/droid/model/RoutingLeg;

    .prologue
    .line 47
    invoke-virtual {p1}, Lcom/thetransitapp/droid/model/RoutingLeg;->getLegType()Lcom/thetransitapp/droid/model/RoutingLeg$LegType;

    move-result-object v10

    sget-object v11, Lcom/thetransitapp/droid/model/RoutingLeg$LegType;->TRANSIT:Lcom/thetransitapp/droid/model/RoutingLeg$LegType;

    if-ne v10, v11, :cond_0

    .line 48
    iget-object v10, p0, Lcom/thetransitapp/droid/util/ShieldUtility;->map:Lcom/google/android/gms/maps/GoogleMap;

    invoke-virtual {v10}, Lcom/google/android/gms/maps/GoogleMap;->getProjection()Lcom/google/android/gms/maps/Projection;

    move-result-object v10

    invoke-virtual {v10}, Lcom/google/android/gms/maps/Projection;->getVisibleRegion()Lcom/google/android/gms/maps/model/VisibleRegion;

    move-result-object v10

    iget-object v0, v10, Lcom/google/android/gms/maps/model/VisibleRegion;->latLngBounds:Lcom/google/android/gms/maps/model/LatLngBounds;

    .line 49
    .local v0, "bounds":Lcom/google/android/gms/maps/model/LatLngBounds;
    iget-object v10, v0, Lcom/google/android/gms/maps/model/LatLngBounds;->northeast:Lcom/google/android/gms/maps/model/LatLng;

    iget-wide v10, v10, Lcom/google/android/gms/maps/model/LatLng;->latitude:D

    iget-object v12, v0, Lcom/google/android/gms/maps/model/LatLngBounds;->southwest:Lcom/google/android/gms/maps/model/LatLng;

    iget-wide v12, v12, Lcom/google/android/gms/maps/model/LatLng;->latitude:D

    sub-double v1, v10, v12

    .line 51
    .local v1, "latitudeDelta":D
    invoke-virtual {p1}, Lcom/thetransitapp/droid/model/RoutingLeg;->getShape()Ljava/lang/String;

    move-result-object v7

    .line 53
    .local v7, "shape":Ljava/lang/String;
    if-eqz v7, :cond_0

    .line 54
    invoke-static {v7}, Lcom/thetransitapp/droid/util/PolylineUtility;->decodePoly(Ljava/lang/String;)Ljava/util/List;

    move-result-object v5

    .line 55
    .local v5, "points":Ljava/util/List;, "Ljava/util/List<Lcom/google/android/gms/maps/model/LatLng;>;"
    invoke-direct {p0, v5, v1, v2}, Lcom/thetransitapp/droid/util/ShieldUtility;->calculateShieldsPositions(Ljava/util/List;D)Ljava/util/List;

    move-result-object v6

    .line 57
    .local v6, "positions":Ljava/util/List;, "Ljava/util/List<Lcom/google/android/gms/maps/model/LatLng;>;"
    invoke-virtual {p1}, Lcom/thetransitapp/droid/model/RoutingLeg;->getRoute()Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;

    move-result-object v10

    invoke-virtual {v10}, Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;->getRouteImage()Lcom/thetransitapp/droid/model/RouteImage;

    move-result-object v10

    if-eqz v10, :cond_1

    invoke-virtual {p1}, Lcom/thetransitapp/droid/model/RoutingLeg;->getRoute()Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;

    move-result-object v10

    invoke-virtual {v10}, Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;->getRouteImage()Lcom/thetransitapp/droid/model/RouteImage;

    move-result-object v10

    invoke-virtual {v10}, Lcom/thetransitapp/droid/model/RouteImage;->isReplaceName()Z

    move-result v10

    if-eqz v10, :cond_1

    .line 58
    iget-object v10, p0, Lcom/thetransitapp/droid/util/ShieldUtility;->context:Landroid/content/Context;

    invoke-virtual {v10}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v10

    invoke-virtual {v10}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v3

    .line 59
    .local v3, "metrics":Landroid/util/DisplayMetrics;
    invoke-virtual {p1}, Lcom/thetransitapp/droid/model/RoutingLeg;->getRoute()Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;

    move-result-object v10

    invoke-virtual {v10}, Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;->getRouteImage()Lcom/thetransitapp/droid/model/RouteImage;

    move-result-object v10

    const/4 v11, 0x1

    invoke-virtual {v10, v3, v11}, Lcom/thetransitapp/droid/model/RouteImage;->getUrlWithScreenMetrics(Landroid/util/DisplayMetrics;Z)Ljava/lang/String;

    move-result-object v9

    .line 60
    .local v9, "url":Ljava/lang/String;
    iget-object v10, p0, Lcom/thetransitapp/droid/util/ShieldUtility;->context:Landroid/content/Context;

    new-instance v11, Lcom/thetransitapp/droid/util/ShieldUtility$1;

    invoke-direct {v11, p0, p1, v6}, Lcom/thetransitapp/droid/util/ShieldUtility$1;-><init>(Lcom/thetransitapp/droid/util/ShieldUtility;Lcom/thetransitapp/droid/model/RoutingLeg;Ljava/util/List;)V

    invoke-static {v10, v9, v11}, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper;->loadUrlDrawable(Landroid/content/Context;Ljava/lang/String;Lcom/koushikdutta/urlimageviewhelper/UrlImageViewCallback;)V

    .line 82
    .end local v0    # "bounds":Lcom/google/android/gms/maps/model/LatLngBounds;
    .end local v1    # "latitudeDelta":D
    .end local v3    # "metrics":Landroid/util/DisplayMetrics;
    .end local v5    # "points":Ljava/util/List;, "Ljava/util/List<Lcom/google/android/gms/maps/model/LatLng;>;"
    .end local v6    # "positions":Ljava/util/List;, "Ljava/util/List<Lcom/google/android/gms/maps/model/LatLng;>;"
    .end local v7    # "shape":Ljava/lang/String;
    .end local v9    # "url":Ljava/lang/String;
    :cond_0
    :goto_0
    return-void

    .line 74
    .restart local v0    # "bounds":Lcom/google/android/gms/maps/model/LatLngBounds;
    .restart local v1    # "latitudeDelta":D
    .restart local v5    # "points":Ljava/util/List;, "Ljava/util/List<Lcom/google/android/gms/maps/model/LatLng;>;"
    .restart local v6    # "positions":Ljava/util/List;, "Ljava/util/List<Lcom/google/android/gms/maps/model/LatLng;>;"
    .restart local v7    # "shape":Ljava/lang/String;
    :cond_1
    invoke-virtual {p1}, Lcom/thetransitapp/droid/model/RoutingLeg;->getRoute()Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;

    move-result-object v10

    invoke-virtual {v10}, Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;->getShortName()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {p1}, Lcom/thetransitapp/droid/model/RoutingLeg;->getRoute()Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;

    move-result-object v11

    iget-object v12, p0, Lcom/thetransitapp/droid/util/ShieldUtility;->context:Landroid/content/Context;

    .line 75
    invoke-virtual {v12}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v12

    const v13, 0x7f08001e

    invoke-virtual {v12, v13}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v12

    iget-object v13, p0, Lcom/thetransitapp/droid/util/ShieldUtility;->context:Landroid/content/Context;

    .line 74
    invoke-static {v10, v11, v12, v13}, Lcom/thetransitapp/droid/util/BitmapUtility;->getShield(Ljava/lang/String;Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;ILandroid/content/Context;)Landroid/graphics/Bitmap;

    move-result-object v8

    .line 76
    .local v8, "shield":Landroid/graphics/Bitmap;
    invoke-static {v8}, Lcom/google/android/gms/maps/model/BitmapDescriptorFactory;->fromBitmap(Landroid/graphics/Bitmap;)Lcom/google/android/gms/maps/model/BitmapDescriptor;

    move-result-object v4

    .line 78
    .local v4, "pin":Lcom/google/android/gms/maps/model/BitmapDescriptor;
    invoke-direct {p0, v6, v4}, Lcom/thetransitapp/droid/util/ShieldUtility;->showShields(Ljava/util/List;Lcom/google/android/gms/maps/model/BitmapDescriptor;)V

    goto :goto_0
.end method
