.class public Lcom/google/maps/android/projection/SphericalMercatorProjection;
.super Ljava/lang/Object;
.source "SphericalMercatorProjection.java"


# instance fields
.field final mWorldWidth:D


# direct methods
.method public constructor <init>(D)V
    .locals 0
    .param p1, "worldWidth"    # D

    .prologue
    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    iput-wide p1, p0, Lcom/google/maps/android/projection/SphericalMercatorProjection;->mWorldWidth:D

    .line 26
    return-void
.end method


# virtual methods
.method public toLatLng(Lcom/google/maps/android/geometry/Point;)Lcom/google/android/gms/maps/model/LatLng;
    .locals 14
    .param p1, "point"    # Lcom/google/maps/android/geometry/Point;

    .prologue
    .line 38
    iget-wide v8, p1, Lcom/google/maps/android/geometry/Point;->x:D

    iget-wide v10, p0, Lcom/google/maps/android/projection/SphericalMercatorProjection;->mWorldWidth:D

    div-double/2addr v8, v10

    const-wide/high16 v10, 0x3fe0000000000000L    # 0.5

    sub-double v4, v8, v10

    .line 39
    .local v4, "x":D
    const-wide v8, 0x4076800000000000L    # 360.0

    mul-double v2, v4, v8

    .line 41
    .local v2, "lng":D
    const-wide/high16 v8, 0x3fe0000000000000L    # 0.5

    iget-wide v10, p1, Lcom/google/maps/android/geometry/Point;->y:D

    iget-wide v12, p0, Lcom/google/maps/android/projection/SphericalMercatorProjection;->mWorldWidth:D

    div-double/2addr v10, v12

    sub-double v6, v8, v10

    .line 42
    .local v6, "y":D
    const-wide v8, 0x4056800000000000L    # 90.0

    neg-double v10, v6

    const-wide/high16 v12, 0x4000000000000000L    # 2.0

    mul-double/2addr v10, v12

    const-wide v12, 0x400921fb54442d18L    # Math.PI

    mul-double/2addr v10, v12

    invoke-static {v10, v11}, Ljava/lang/Math;->exp(D)D

    move-result-wide v10

    invoke-static {v10, v11}, Ljava/lang/Math;->atan(D)D

    move-result-wide v10

    const-wide/high16 v12, 0x4000000000000000L    # 2.0

    mul-double/2addr v10, v12

    invoke-static {v10, v11}, Ljava/lang/Math;->toDegrees(D)D

    move-result-wide v10

    sub-double v0, v8, v10

    .line 44
    .local v0, "lat":D
    new-instance v8, Lcom/google/android/gms/maps/model/LatLng;

    invoke-direct {v8, v0, v1, v2, v3}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    return-object v8
.end method

.method public toPoint(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/maps/android/projection/Point;
    .locals 14
    .param p1, "latLng"    # Lcom/google/android/gms/maps/model/LatLng;

    .prologue
    const-wide/high16 v12, 0x3ff0000000000000L    # 1.0

    const-wide/high16 v10, 0x3fe0000000000000L    # 0.5

    .line 30
    iget-wide v6, p1, Lcom/google/android/gms/maps/model/LatLng;->longitude:D

    const-wide v8, 0x4076800000000000L    # 360.0

    div-double/2addr v6, v8

    add-double v2, v6, v10

    .line 31
    .local v2, "x":D
    iget-wide v6, p1, Lcom/google/android/gms/maps/model/LatLng;->latitude:D

    invoke-static {v6, v7}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Math;->sin(D)D

    move-result-wide v0

    .line 32
    .local v0, "siny":D
    add-double v6, v12, v0

    sub-double v8, v12, v0

    div-double/2addr v6, v8

    invoke-static {v6, v7}, Ljava/lang/Math;->log(D)D

    move-result-wide v6

    mul-double/2addr v6, v10

    const-wide v8, -0x3fe6de04abbbd2e8L    # -6.283185307179586

    div-double/2addr v6, v8

    add-double v4, v6, v10

    .line 34
    .local v4, "y":D
    new-instance v6, Lcom/google/maps/android/projection/Point;

    iget-wide v7, p0, Lcom/google/maps/android/projection/SphericalMercatorProjection;->mWorldWidth:D

    mul-double/2addr v7, v2

    iget-wide v9, p0, Lcom/google/maps/android/projection/SphericalMercatorProjection;->mWorldWidth:D

    mul-double/2addr v9, v4

    invoke-direct {v6, v7, v8, v9, v10}, Lcom/google/maps/android/projection/Point;-><init>(DD)V

    return-object v6
.end method
