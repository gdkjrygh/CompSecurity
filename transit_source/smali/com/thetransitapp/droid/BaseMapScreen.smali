.class public abstract Lcom/thetransitapp/droid/BaseMapScreen;
.super Lcom/thetransitapp/droid/BaseFragment;
.source "BaseMapScreen.java"

# interfaces
.implements Lcom/google/android/gms/maps/GoogleMap$OnMyLocationChangeListener;
.implements Lcom/google/android/gms/maps/GoogleMap$OnCameraChangeListener;


# instance fields
.field private activity:Lcom/thetransitapp/droid/TransitActivity;

.field private currentLocationButton:Landroid/widget/ImageButton;

.field private fromLocationChange:Z

.field private tracking:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 30
    invoke-direct {p0}, Lcom/thetransitapp/droid/BaseFragment;-><init>()V

    .line 31
    return-void
.end method

.method public constructor <init>(Lcom/thetransitapp/droid/TransitActivity$TransitScreen;)V
    .locals 0
    .param p1, "screen"    # Lcom/thetransitapp/droid/TransitActivity$TransitScreen;

    .prologue
    .line 34
    invoke-direct {p0, p1}, Lcom/thetransitapp/droid/BaseFragment;-><init>(Lcom/thetransitapp/droid/TransitActivity$TransitScreen;)V

    .line 35
    return-void
.end method

.method static synthetic access$0(Lcom/thetransitapp/droid/BaseMapScreen;)Z
    .locals 1

    .prologue
    .line 27
    iget-boolean v0, p0, Lcom/thetransitapp/droid/BaseMapScreen;->tracking:Z

    return v0
.end method

.method static synthetic access$1(Lcom/thetransitapp/droid/BaseMapScreen;Z)V
    .locals 0

    .prologue
    .line 27
    iput-boolean p1, p0, Lcom/thetransitapp/droid/BaseMapScreen;->tracking:Z

    return-void
.end method

.method static synthetic access$2(Lcom/thetransitapp/droid/BaseMapScreen;)Landroid/widget/ImageButton;
    .locals 1

    .prologue
    .line 25
    iget-object v0, p0, Lcom/thetransitapp/droid/BaseMapScreen;->currentLocationButton:Landroid/widget/ImageButton;

    return-object v0
.end method


# virtual methods
.method public centerMap(DD)V
    .locals 7
    .param p1, "latitude"    # D
    .param p3, "longitude"    # D

    .prologue
    .line 124
    const/high16 v5, 0x41800000    # 16.0f

    const/4 v6, 0x0

    move-object v0, p0

    move-wide v1, p1

    move-wide v3, p3

    invoke-virtual/range {v0 .. v6}, Lcom/thetransitapp/droid/BaseMapScreen;->centerMap(DDFZ)V

    .line 125
    return-void
.end method

.method public centerMap(DDFZ)V
    .locals 4
    .param p1, "latitude"    # D
    .param p3, "longitude"    # D
    .param p5, "zoom"    # F
    .param p6, "animate"    # Z

    .prologue
    const/4 v3, 0x0

    .line 128
    invoke-virtual {p0}, Lcom/thetransitapp/droid/BaseMapScreen;->getMap()Lcom/google/android/gms/maps/GoogleMap;

    move-result-object v2

    if-nez v2, :cond_0

    .line 140
    :goto_0
    return-void

    .line 132
    :cond_0
    new-instance v0, Lcom/google/android/gms/maps/model/LatLng;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    .line 133
    .local v0, "position":Lcom/google/android/gms/maps/model/LatLng;
    new-instance v2, Lcom/google/android/gms/maps/model/CameraPosition;

    invoke-direct {v2, v0, p5, v3, v3}, Lcom/google/android/gms/maps/model/CameraPosition;-><init>(Lcom/google/android/gms/maps/model/LatLng;FFF)V

    invoke-static {v2}, Lcom/google/android/gms/maps/CameraUpdateFactory;->newCameraPosition(Lcom/google/android/gms/maps/model/CameraPosition;)Lcom/google/android/gms/maps/CameraUpdate;

    move-result-object v1

    .line 135
    .local v1, "update":Lcom/google/android/gms/maps/CameraUpdate;
    if-eqz p6, :cond_1

    .line 136
    invoke-virtual {p0}, Lcom/thetransitapp/droid/BaseMapScreen;->getMap()Lcom/google/android/gms/maps/GoogleMap;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/google/android/gms/maps/GoogleMap;->animateCamera(Lcom/google/android/gms/maps/CameraUpdate;)V

    goto :goto_0

    .line 138
    :cond_1
    invoke-virtual {p0}, Lcom/thetransitapp/droid/BaseMapScreen;->getMap()Lcom/google/android/gms/maps/GoogleMap;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/google/android/gms/maps/GoogleMap;->moveCamera(Lcom/google/android/gms/maps/CameraUpdate;)V

    goto :goto_0
.end method

.method public centerMap(Landroid/location/Location;)V
    .locals 2
    .param p1, "location"    # Landroid/location/Location;

    .prologue
    .line 112
    const/high16 v0, 0x41800000    # 16.0f

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v0, v1}, Lcom/thetransitapp/droid/BaseMapScreen;->centerMap(Landroid/location/Location;FZ)V

    .line 113
    return-void
.end method

.method public centerMap(Landroid/location/Location;FZ)V
    .locals 7
    .param p1, "location"    # Landroid/location/Location;
    .param p2, "zoom"    # F
    .param p3, "animate"    # Z

    .prologue
    .line 116
    invoke-virtual {p1}, Landroid/location/Location;->getLatitude()D

    move-result-wide v1

    invoke-virtual {p1}, Landroid/location/Location;->getLongitude()D

    move-result-wide v3

    move-object v0, p0

    move v5, p2

    move v6, p3

    invoke-virtual/range {v0 .. v6}, Lcom/thetransitapp/droid/BaseMapScreen;->centerMap(DDFZ)V

    .line 117
    return-void
.end method

.method public centerMap(Lcom/bricolsoftconsulting/geocoderplus/Area;)V
    .locals 7
    .param p1, "bound"    # Lcom/bricolsoftconsulting/geocoderplus/Area;

    .prologue
    .line 143
    invoke-virtual {p0}, Lcom/thetransitapp/droid/BaseMapScreen;->getMap()Lcom/google/android/gms/maps/GoogleMap;

    move-result-object v3

    if-nez v3, :cond_0

    .line 153
    :goto_0
    return-void

    .line 147
    :cond_0
    new-instance v1, Lcom/google/android/gms/maps/model/LatLng;

    invoke-virtual {p1}, Lcom/bricolsoftconsulting/geocoderplus/Area;->getNorthEast()Lcom/bricolsoftconsulting/geocoderplus/Position;

    move-result-object v3

    invoke-virtual {v3}, Lcom/bricolsoftconsulting/geocoderplus/Position;->getLatitude()D

    move-result-wide v3

    invoke-virtual {p1}, Lcom/bricolsoftconsulting/geocoderplus/Area;->getNorthEast()Lcom/bricolsoftconsulting/geocoderplus/Position;

    move-result-object v5

    invoke-virtual {v5}, Lcom/bricolsoftconsulting/geocoderplus/Position;->getLongitude()D

    move-result-wide v5

    invoke-direct {v1, v3, v4, v5, v6}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    .line 148
    .local v1, "northEast":Lcom/google/android/gms/maps/model/LatLng;
    new-instance v2, Lcom/google/android/gms/maps/model/LatLng;

    invoke-virtual {p1}, Lcom/bricolsoftconsulting/geocoderplus/Area;->getSouthWest()Lcom/bricolsoftconsulting/geocoderplus/Position;

    move-result-object v3

    invoke-virtual {v3}, Lcom/bricolsoftconsulting/geocoderplus/Position;->getLatitude()D

    move-result-wide v3

    invoke-virtual {p1}, Lcom/bricolsoftconsulting/geocoderplus/Area;->getSouthWest()Lcom/bricolsoftconsulting/geocoderplus/Position;

    move-result-object v5

    invoke-virtual {v5}, Lcom/bricolsoftconsulting/geocoderplus/Position;->getLongitude()D

    move-result-wide v5

    invoke-direct {v2, v3, v4, v5, v6}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    .line 149
    .local v2, "southWest":Lcom/google/android/gms/maps/model/LatLng;
    new-instance v0, Lcom/google/android/gms/maps/model/LatLngBounds;

    invoke-direct {v0, v2, v1}, Lcom/google/android/gms/maps/model/LatLngBounds;-><init>(Lcom/google/android/gms/maps/model/LatLng;Lcom/google/android/gms/maps/model/LatLng;)V

    .line 151
    .local v0, "bounds":Lcom/google/android/gms/maps/model/LatLngBounds;
    invoke-virtual {p0}, Lcom/thetransitapp/droid/BaseMapScreen;->getMap()Lcom/google/android/gms/maps/GoogleMap;

    move-result-object v3

    const/16 v4, 0xa

    invoke-static {v0, v4}, Lcom/google/android/gms/maps/CameraUpdateFactory;->newLatLngBounds(Lcom/google/android/gms/maps/model/LatLngBounds;I)Lcom/google/android/gms/maps/CameraUpdate;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/google/android/gms/maps/GoogleMap;->moveCamera(Lcom/google/android/gms/maps/CameraUpdate;)V

    goto :goto_0
.end method

.method public centerMap(Lcom/google/android/gms/maps/model/LatLngBounds;ZII)V
    .locals 22
    .param p1, "bounds"    # Lcom/google/android/gms/maps/model/LatLngBounds;
    .param p2, "animate"    # Z
    .param p3, "width"    # I
    .param p4, "height"    # I

    .prologue
    .line 156
    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/BaseMapScreen;->getMap()Lcom/google/android/gms/maps/GoogleMap;

    move-result-object v14

    if-nez v14, :cond_0

    .line 184
    :goto_0
    return-void

    .line 160
    :cond_0
    move-object/from16 v0, p1

    iget-object v9, v0, Lcom/google/android/gms/maps/model/LatLngBounds;->southwest:Lcom/google/android/gms/maps/model/LatLng;

    .line 161
    .local v9, "sw":Lcom/google/android/gms/maps/model/LatLng;
    move-object/from16 v0, p1

    iget-object v7, v0, Lcom/google/android/gms/maps/model/LatLngBounds;->northeast:Lcom/google/android/gms/maps/model/LatLng;

    .line 162
    .local v7, "ne":Lcom/google/android/gms/maps/model/LatLng;
    iget-wide v14, v9, Lcom/google/android/gms/maps/model/LatLng;->latitude:D

    iget-wide v0, v7, Lcom/google/android/gms/maps/model/LatLng;->latitude:D

    move-wide/from16 v16, v0

    sub-double v14, v14, v16

    invoke-static {v14, v15}, Ljava/lang/Math;->abs(D)D

    move-result-wide v3

    .line 163
    .local v3, "deltaLat":D
    iget-wide v14, v9, Lcom/google/android/gms/maps/model/LatLng;->longitude:D

    iget-wide v0, v7, Lcom/google/android/gms/maps/model/LatLng;->longitude:D

    move-wide/from16 v16, v0

    sub-double v14, v14, v16

    invoke-static {v14, v15}, Ljava/lang/Math;->abs(D)D

    move-result-wide v5

    .line 165
    .local v5, "deltaLon":D
    const-wide v12, 0x3f747ae147ae147bL    # 0.005

    .line 167
    .local v12, "zoomN":D
    const-wide v14, 0x3f747ae147ae147bL    # 0.005

    cmpg-double v14, v3, v14

    if-gez v14, :cond_2

    .line 168
    new-instance v10, Lcom/google/android/gms/maps/model/LatLng;

    iget-wide v14, v9, Lcom/google/android/gms/maps/model/LatLng;->latitude:D

    const-wide v16, 0x3f747ae147ae147bL    # 0.005

    const-wide/high16 v18, 0x4000000000000000L    # 2.0

    div-double v18, v3, v18

    sub-double v16, v16, v18

    sub-double v14, v14, v16

    iget-wide v0, v9, Lcom/google/android/gms/maps/model/LatLng;->longitude:D

    move-wide/from16 v16, v0

    move-wide/from16 v0, v16

    invoke-direct {v10, v14, v15, v0, v1}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    .line 169
    .end local v9    # "sw":Lcom/google/android/gms/maps/model/LatLng;
    .local v10, "sw":Lcom/google/android/gms/maps/model/LatLng;
    new-instance v8, Lcom/google/android/gms/maps/model/LatLng;

    iget-wide v14, v7, Lcom/google/android/gms/maps/model/LatLng;->latitude:D

    const-wide v16, 0x3f747ae147ae147bL    # 0.005

    const-wide/high16 v18, 0x4000000000000000L    # 2.0

    div-double v18, v3, v18

    sub-double v16, v16, v18

    add-double v14, v14, v16

    iget-wide v0, v7, Lcom/google/android/gms/maps/model/LatLng;->longitude:D

    move-wide/from16 v16, v0

    move-wide/from16 v0, v16

    invoke-direct {v8, v14, v15, v0, v1}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    .line 170
    .end local v7    # "ne":Lcom/google/android/gms/maps/model/LatLng;
    .local v8, "ne":Lcom/google/android/gms/maps/model/LatLng;
    new-instance p1, Lcom/google/android/gms/maps/model/LatLngBounds;

    .end local p1    # "bounds":Lcom/google/android/gms/maps/model/LatLngBounds;
    move-object/from16 v0, p1

    invoke-direct {v0, v10, v8}, Lcom/google/android/gms/maps/model/LatLngBounds;-><init>(Lcom/google/android/gms/maps/model/LatLng;Lcom/google/android/gms/maps/model/LatLng;)V

    .restart local p1    # "bounds":Lcom/google/android/gms/maps/model/LatLngBounds;
    move-object v7, v8

    .end local v8    # "ne":Lcom/google/android/gms/maps/model/LatLng;
    .restart local v7    # "ne":Lcom/google/android/gms/maps/model/LatLng;
    move-object v9, v10

    .line 177
    .end local v10    # "sw":Lcom/google/android/gms/maps/model/LatLng;
    .restart local v9    # "sw":Lcom/google/android/gms/maps/model/LatLng;
    :cond_1
    :goto_1
    const/16 v14, 0xa

    move-object/from16 v0, p1

    move/from16 v1, p3

    move/from16 v2, p4

    invoke-static {v0, v1, v2, v14}, Lcom/google/android/gms/maps/CameraUpdateFactory;->newLatLngBounds(Lcom/google/android/gms/maps/model/LatLngBounds;III)Lcom/google/android/gms/maps/CameraUpdate;

    move-result-object v11

    .line 179
    .local v11, "update":Lcom/google/android/gms/maps/CameraUpdate;
    if-eqz p2, :cond_3

    .line 180
    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/BaseMapScreen;->getMap()Lcom/google/android/gms/maps/GoogleMap;

    move-result-object v14

    invoke-virtual {v14, v11}, Lcom/google/android/gms/maps/GoogleMap;->animateCamera(Lcom/google/android/gms/maps/CameraUpdate;)V

    goto/16 :goto_0

    .line 171
    .end local v11    # "update":Lcom/google/android/gms/maps/CameraUpdate;
    :cond_2
    const-wide v14, 0x3f747ae147ae147bL    # 0.005

    cmpg-double v14, v5, v14

    if-gez v14, :cond_1

    .line 172
    new-instance v10, Lcom/google/android/gms/maps/model/LatLng;

    iget-wide v14, v9, Lcom/google/android/gms/maps/model/LatLng;->latitude:D

    iget-wide v0, v9, Lcom/google/android/gms/maps/model/LatLng;->longitude:D

    move-wide/from16 v16, v0

    const-wide v18, 0x3f747ae147ae147bL    # 0.005

    const-wide/high16 v20, 0x4000000000000000L    # 2.0

    div-double v20, v5, v20

    sub-double v18, v18, v20

    sub-double v16, v16, v18

    move-wide/from16 v0, v16

    invoke-direct {v10, v14, v15, v0, v1}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    .line 173
    .end local v9    # "sw":Lcom/google/android/gms/maps/model/LatLng;
    .restart local v10    # "sw":Lcom/google/android/gms/maps/model/LatLng;
    new-instance v8, Lcom/google/android/gms/maps/model/LatLng;

    iget-wide v14, v7, Lcom/google/android/gms/maps/model/LatLng;->latitude:D

    iget-wide v0, v7, Lcom/google/android/gms/maps/model/LatLng;->longitude:D

    move-wide/from16 v16, v0

    const-wide v18, 0x3f747ae147ae147bL    # 0.005

    const-wide/high16 v20, 0x4000000000000000L    # 2.0

    div-double v20, v5, v20

    sub-double v18, v18, v20

    add-double v16, v16, v18

    move-wide/from16 v0, v16

    invoke-direct {v8, v14, v15, v0, v1}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    .line 174
    .end local v7    # "ne":Lcom/google/android/gms/maps/model/LatLng;
    .restart local v8    # "ne":Lcom/google/android/gms/maps/model/LatLng;
    new-instance p1, Lcom/google/android/gms/maps/model/LatLngBounds;

    .end local p1    # "bounds":Lcom/google/android/gms/maps/model/LatLngBounds;
    move-object/from16 v0, p1

    invoke-direct {v0, v10, v8}, Lcom/google/android/gms/maps/model/LatLngBounds;-><init>(Lcom/google/android/gms/maps/model/LatLng;Lcom/google/android/gms/maps/model/LatLng;)V

    .restart local p1    # "bounds":Lcom/google/android/gms/maps/model/LatLngBounds;
    move-object v7, v8

    .end local v8    # "ne":Lcom/google/android/gms/maps/model/LatLng;
    .restart local v7    # "ne":Lcom/google/android/gms/maps/model/LatLng;
    move-object v9, v10

    .end local v10    # "sw":Lcom/google/android/gms/maps/model/LatLng;
    .restart local v9    # "sw":Lcom/google/android/gms/maps/model/LatLng;
    goto :goto_1

    .line 182
    .restart local v11    # "update":Lcom/google/android/gms/maps/CameraUpdate;
    :cond_3
    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/BaseMapScreen;->getMap()Lcom/google/android/gms/maps/GoogleMap;

    move-result-object v14

    invoke-virtual {v14, v11}, Lcom/google/android/gms/maps/GoogleMap;->moveCamera(Lcom/google/android/gms/maps/CameraUpdate;)V

    goto/16 :goto_0
.end method

.method public centerMap(Lcom/thetransitapp/droid/model/SimplePlacemark;)V
    .locals 7
    .param p1, "placemark"    # Lcom/thetransitapp/droid/model/SimplePlacemark;

    .prologue
    .line 120
    invoke-virtual {p1}, Lcom/thetransitapp/droid/model/SimplePlacemark;->getLatitude()D

    move-result-wide v1

    invoke-virtual {p1}, Lcom/thetransitapp/droid/model/SimplePlacemark;->getLongitude()D

    move-result-wide v3

    const/high16 v5, 0x41800000    # 16.0f

    const/4 v6, 0x0

    move-object v0, p0

    invoke-virtual/range {v0 .. v6}, Lcom/thetransitapp/droid/BaseMapScreen;->centerMap(DDFZ)V

    .line 121
    return-void
.end method

.method public displayError(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/thetransitapp/droid/widget/ErrorView$OnErrorButtonClickListener;)V
    .locals 1
    .param p1, "title"    # Ljava/lang/String;
    .param p2, "message"    # Ljava/lang/String;
    .param p3, "button"    # Ljava/lang/String;
    .param p4, "listener"    # Lcom/thetransitapp/droid/widget/ErrorView$OnErrorButtonClickListener;

    .prologue
    .line 214
    iget-object v0, p0, Lcom/thetransitapp/droid/BaseMapScreen;->activity:Lcom/thetransitapp/droid/TransitActivity;

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/thetransitapp/droid/TransitActivity;->displayError(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/thetransitapp/droid/widget/ErrorView$OnErrorButtonClickListener;)V

    .line 215
    return-void
.end method

.method public getLastLocation()Landroid/location/Location;
    .locals 1

    .prologue
    .line 198
    iget-object v0, p0, Lcom/thetransitapp/droid/BaseMapScreen;->activity:Lcom/thetransitapp/droid/TransitActivity;

    invoke-virtual {v0}, Lcom/thetransitapp/droid/TransitActivity;->getLastLocation()Landroid/location/Location;

    move-result-object v0

    return-object v0
.end method

.method public getMap()Lcom/google/android/gms/maps/GoogleMap;
    .locals 1

    .prologue
    .line 194
    iget-object v0, p0, Lcom/thetransitapp/droid/BaseMapScreen;->activity:Lcom/thetransitapp/droid/TransitActivity;

    invoke-virtual {v0}, Lcom/thetransitapp/droid/TransitActivity;->getMap()Lcom/google/android/gms/maps/GoogleMap;

    move-result-object v0

    return-object v0
.end method

.method public getRealLocation()Landroid/location/Location;
    .locals 1

    .prologue
    .line 202
    iget-object v0, p0, Lcom/thetransitapp/droid/BaseMapScreen;->activity:Lcom/thetransitapp/droid/TransitActivity;

    invoke-virtual {v0}, Lcom/thetransitapp/droid/TransitActivity;->getRealLocation()Landroid/location/Location;

    move-result-object v0

    return-object v0
.end method

.method public hideError()V
    .locals 1

    .prologue
    .line 218
    iget-object v0, p0, Lcom/thetransitapp/droid/BaseMapScreen;->activity:Lcom/thetransitapp/droid/TransitActivity;

    invoke-virtual {v0}, Lcom/thetransitapp/droid/TransitActivity;->hideError()V

    .line 219
    return-void
.end method

.method public hidePopover(Z)V
    .locals 1
    .param p1, "animated"    # Z

    .prologue
    .line 226
    iget-object v0, p0, Lcom/thetransitapp/droid/BaseMapScreen;->activity:Lcom/thetransitapp/droid/TransitActivity;

    invoke-virtual {v0, p1}, Lcom/thetransitapp/droid/TransitActivity;->hidePopover(Z)V

    .line 227
    return-void
.end method

.method public isCurrentLocation()Z
    .locals 1

    .prologue
    .line 206
    iget-object v0, p0, Lcom/thetransitapp/droid/BaseMapScreen;->activity:Lcom/thetransitapp/droid/TransitActivity;

    invoke-virtual {v0}, Lcom/thetransitapp/droid/TransitActivity;->isCurrentLocation()Z

    move-result v0

    return v0
.end method

.method public isLocationServiceConnecting()Z
    .locals 1

    .prologue
    .line 210
    iget-object v0, p0, Lcom/thetransitapp/droid/BaseMapScreen;->activity:Lcom/thetransitapp/droid/TransitActivity;

    invoke-virtual {v0}, Lcom/thetransitapp/droid/TransitActivity;->isLocationServiceAvailable()Z

    move-result v0

    return v0
.end method

.method public isTracking()Z
    .locals 1

    .prologue
    .line 26
    iget-boolean v0, p0, Lcom/thetransitapp/droid/BaseMapScreen;->tracking:Z

    return v0
.end method

.method public onAttach(Landroid/app/Activity;)V
    .locals 0
    .param p1, "activity"    # Landroid/app/Activity;

    .prologue
    .line 188
    invoke-super {p0, p1}, Lcom/thetransitapp/droid/BaseFragment;->onAttach(Landroid/app/Activity;)V

    .line 190
    check-cast p1, Lcom/thetransitapp/droid/TransitActivity;

    .end local p1    # "activity":Landroid/app/Activity;
    iput-object p1, p0, Lcom/thetransitapp/droid/BaseMapScreen;->activity:Lcom/thetransitapp/droid/TransitActivity;

    .line 191
    return-void
.end method

.method public onCameraChange(Lcom/google/android/gms/maps/model/CameraPosition;)V
    .locals 4
    .param p1, "position"    # Lcom/google/android/gms/maps/model/CameraPosition;

    .prologue
    const/4 v3, 0x0

    .line 93
    iget-boolean v1, p0, Lcom/thetransitapp/droid/BaseMapScreen;->tracking:Z

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/BaseMapScreen;->getMap()Lcom/google/android/gms/maps/GoogleMap;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 94
    invoke-virtual {p0}, Lcom/thetransitapp/droid/BaseMapScreen;->getMap()Lcom/google/android/gms/maps/GoogleMap;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/maps/GoogleMap;->getMyLocation()Landroid/location/Location;

    move-result-object v0

    .line 96
    .local v0, "location":Landroid/location/Location;
    if-eqz v0, :cond_0

    .line 97
    new-instance v1, Lcom/thetransitapp/droid/model/SimplePlacemark;

    iget-object v2, p1, Lcom/google/android/gms/maps/model/CameraPosition;->target:Lcom/google/android/gms/maps/model/LatLng;

    invoke-direct {v1, v2}, Lcom/thetransitapp/droid/model/SimplePlacemark;-><init>(Lcom/google/android/gms/maps/model/LatLng;)V

    invoke-virtual {v1, v0}, Lcom/thetransitapp/droid/model/SimplePlacemark;->distanceTo(Landroid/location/Location;)F

    move-result v1

    const/high16 v2, 0x42c80000    # 100.0f

    cmpl-float v1, v1, v2

    if-lez v1, :cond_0

    .line 98
    iput-boolean v3, p0, Lcom/thetransitapp/droid/BaseMapScreen;->tracking:Z

    .line 99
    iget-object v1, p0, Lcom/thetransitapp/droid/BaseMapScreen;->currentLocationButton:Landroid/widget/ImageButton;

    const v2, 0x7f02009c

    invoke-virtual {v1, v2}, Landroid/widget/ImageButton;->setImageResource(I)V

    .line 104
    .end local v0    # "location":Landroid/location/Location;
    :cond_0
    iget-boolean v1, p0, Lcom/thetransitapp/droid/BaseMapScreen;->fromLocationChange:Z

    if-nez v1, :cond_1

    .line 105
    invoke-super {p0}, Lcom/thetransitapp/droid/BaseFragment;->hideKeyboard()V

    .line 108
    :cond_1
    iput-boolean v3, p0, Lcom/thetransitapp/droid/BaseMapScreen;->fromLocationChange:Z

    .line 109
    return-void
.end method

.method public onMyLocationChange(Landroid/location/Location;)V
    .locals 2
    .param p1, "location"    # Landroid/location/Location;

    .prologue
    const/4 v1, 0x1

    .line 85
    iget-boolean v0, p0, Lcom/thetransitapp/droid/BaseMapScreen;->tracking:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/BaseMapScreen;->isVisible()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 86
    iput-boolean v1, p0, Lcom/thetransitapp/droid/BaseMapScreen;->fromLocationChange:Z

    .line 87
    invoke-virtual {p0}, Lcom/thetransitapp/droid/BaseMapScreen;->getMap()Lcom/google/android/gms/maps/GoogleMap;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/maps/GoogleMap;->getCameraPosition()Lcom/google/android/gms/maps/model/CameraPosition;

    move-result-object v0

    iget v0, v0, Lcom/google/android/gms/maps/model/CameraPosition;->zoom:F

    invoke-virtual {p0, p1, v0, v1}, Lcom/thetransitapp/droid/BaseMapScreen;->centerMap(Landroid/location/Location;FZ)V

    .line 89
    :cond_0
    return-void
.end method

.method public onPause()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 74
    invoke-super {p0}, Lcom/thetransitapp/droid/BaseFragment;->onPause()V

    .line 76
    invoke-virtual {p0}, Lcom/thetransitapp/droid/BaseMapScreen;->getMap()Lcom/google/android/gms/maps/GoogleMap;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/thetransitapp/droid/BaseMapScreen;->currentLocationButton:Landroid/widget/ImageButton;

    if-eqz v0, :cond_0

    .line 77
    invoke-virtual {p0}, Lcom/thetransitapp/droid/BaseMapScreen;->getMap()Lcom/google/android/gms/maps/GoogleMap;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/GoogleMap;->setMyLocationEnabled(Z)V

    .line 78
    invoke-virtual {p0}, Lcom/thetransitapp/droid/BaseMapScreen;->getMap()Lcom/google/android/gms/maps/GoogleMap;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/google/android/gms/maps/GoogleMap;->setOnMyLocationChangeListener(Lcom/google/android/gms/maps/GoogleMap$OnMyLocationChangeListener;)V

    .line 79
    invoke-virtual {p0}, Lcom/thetransitapp/droid/BaseMapScreen;->getMap()Lcom/google/android/gms/maps/GoogleMap;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/google/android/gms/maps/GoogleMap;->setOnCameraChangeListener(Lcom/google/android/gms/maps/GoogleMap$OnCameraChangeListener;)V

    .line 81
    :cond_0
    return-void
.end method

.method public onResume()V
    .locals 2

    .prologue
    .line 46
    invoke-super {p0}, Lcom/thetransitapp/droid/BaseFragment;->onResume()V

    .line 48
    invoke-virtual {p0}, Lcom/thetransitapp/droid/BaseMapScreen;->getMap()Lcom/google/android/gms/maps/GoogleMap;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 49
    invoke-virtual {p0}, Lcom/thetransitapp/droid/BaseMapScreen;->getView()Landroid/view/View;

    move-result-object v0

    const v1, 0x7f05008c

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    iput-object v0, p0, Lcom/thetransitapp/droid/BaseMapScreen;->currentLocationButton:Landroid/widget/ImageButton;

    .line 51
    iget-object v0, p0, Lcom/thetransitapp/droid/BaseMapScreen;->currentLocationButton:Landroid/widget/ImageButton;

    if-eqz v0, :cond_0

    .line 52
    iget-object v0, p0, Lcom/thetransitapp/droid/BaseMapScreen;->currentLocationButton:Landroid/widget/ImageButton;

    new-instance v1, Lcom/thetransitapp/droid/BaseMapScreen$1;

    invoke-direct {v1, p0}, Lcom/thetransitapp/droid/BaseMapScreen$1;-><init>(Lcom/thetransitapp/droid/BaseMapScreen;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 65
    invoke-virtual {p0}, Lcom/thetransitapp/droid/BaseMapScreen;->getMap()Lcom/google/android/gms/maps/GoogleMap;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/GoogleMap;->setMyLocationEnabled(Z)V

    .line 66
    invoke-virtual {p0}, Lcom/thetransitapp/droid/BaseMapScreen;->getMap()Lcom/google/android/gms/maps/GoogleMap;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/android/gms/maps/GoogleMap;->setOnMyLocationChangeListener(Lcom/google/android/gms/maps/GoogleMap$OnMyLocationChangeListener;)V

    .line 67
    invoke-virtual {p0}, Lcom/thetransitapp/droid/BaseMapScreen;->getMap()Lcom/google/android/gms/maps/GoogleMap;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/android/gms/maps/GoogleMap;->setOnCameraChangeListener(Lcom/google/android/gms/maps/GoogleMap$OnCameraChangeListener;)V

    .line 70
    :cond_0
    return-void
.end method

.method public onStart()V
    .locals 0

    .prologue
    .line 39
    invoke-super {p0}, Lcom/thetransitapp/droid/BaseFragment;->onStart()V

    .line 41
    invoke-virtual {p0}, Lcom/thetransitapp/droid/BaseMapScreen;->hideError()V

    .line 42
    return-void
.end method

.method public showLocationServiceError()V
    .locals 1

    .prologue
    .line 230
    iget-object v0, p0, Lcom/thetransitapp/droid/BaseMapScreen;->activity:Lcom/thetransitapp/droid/TransitActivity;

    invoke-virtual {v0}, Lcom/thetransitapp/droid/TransitActivity;->showLocationServiceError()V

    .line 231
    return-void
.end method

.method public showPopover(Landroid/view/View;Landroid/view/View;Ljava/lang/Integer;)V
    .locals 1
    .param p1, "content"    # Landroid/view/View;
    .param p2, "relativeTo"    # Landroid/view/View;
    .param p3, "direction"    # Ljava/lang/Integer;

    .prologue
    .line 222
    iget-object v0, p0, Lcom/thetransitapp/droid/BaseMapScreen;->activity:Lcom/thetransitapp/droid/TransitActivity;

    invoke-virtual {v0, p1, p2, p3}, Lcom/thetransitapp/droid/TransitActivity;->showPopover(Landroid/view/View;Landroid/view/View;Ljava/lang/Integer;)V

    .line 223
    return-void
.end method
