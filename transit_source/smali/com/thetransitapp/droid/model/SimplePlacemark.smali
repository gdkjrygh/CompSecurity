.class public Lcom/thetransitapp/droid/model/SimplePlacemark;
.super Ljava/lang/Object;
.source "SimplePlacemark.java"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field private static final EARTH_RADIUS_KILOMETERS:D = 6371.009

.field private static final serialVersionUID:J = 0x487b10010847325dL


# instance fields
.field private latitude:D

.field private longitude:D

.field private name:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    return-void
.end method

.method public constructor <init>(DD)V
    .locals 0
    .param p1, "latitude"    # D
    .param p3, "longitude"    # D

    .prologue
    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    iput-wide p1, p0, Lcom/thetransitapp/droid/model/SimplePlacemark;->latitude:D

    .line 32
    iput-wide p3, p0, Lcom/thetransitapp/droid/model/SimplePlacemark;->longitude:D

    .line 33
    return-void
.end method

.method public constructor <init>(Landroid/location/Location;)V
    .locals 4
    .param p1, "location"    # Landroid/location/Location;

    .prologue
    .line 27
    invoke-virtual {p1}, Landroid/location/Location;->getLatitude()D

    move-result-wide v0

    invoke-virtual {p1}, Landroid/location/Location;->getLongitude()D

    move-result-wide v2

    invoke-direct {p0, v0, v1, v2, v3}, Lcom/thetransitapp/droid/model/SimplePlacemark;-><init>(DD)V

    .line 28
    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/maps/model/LatLng;)V
    .locals 4
    .param p1, "latLng"    # Lcom/google/android/gms/maps/model/LatLng;

    .prologue
    .line 23
    iget-wide v0, p1, Lcom/google/android/gms/maps/model/LatLng;->latitude:D

    iget-wide v2, p1, Lcom/google/android/gms/maps/model/LatLng;->longitude:D

    invoke-direct {p0, v0, v1, v2, v3}, Lcom/thetransitapp/droid/model/SimplePlacemark;-><init>(DD)V

    .line 24
    return-void
.end method


# virtual methods
.method public canEqual(Ljava/lang/Object;)Z
    .locals 1
    .param p1, "other"    # Ljava/lang/Object;

    .prologue
    .line 10
    instance-of v0, p1, Lcom/thetransitapp/droid/model/SimplePlacemark;

    return v0
.end method

.method public distanceTo(Landroid/location/Location;)F
    .locals 1
    .param p1, "location"    # Landroid/location/Location;

    .prologue
    .line 52
    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/SimplePlacemark;->toLocation()Landroid/location/Location;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/location/Location;->distanceTo(Landroid/location/Location;)F

    move-result v0

    return v0
.end method

.method public distanceTo(Lcom/thetransitapp/droid/model/SimplePlacemark;)F
    .locals 2
    .param p1, "position"    # Lcom/thetransitapp/droid/model/SimplePlacemark;

    .prologue
    .line 48
    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/SimplePlacemark;->toLocation()Landroid/location/Location;

    move-result-object v0

    invoke-virtual {p1}, Lcom/thetransitapp/droid/model/SimplePlacemark;->toLocation()Landroid/location/Location;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/location/Location;->distanceTo(Landroid/location/Location;)F

    move-result v0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 9
    .param p1, "o"    # Ljava/lang/Object;

    .prologue
    const/4 v3, 0x1

    const/4 v4, 0x0

    .line 10
    if-ne p1, p0, :cond_1

    :cond_0
    :goto_0
    return v3

    :cond_1
    instance-of v5, p1, Lcom/thetransitapp/droid/model/SimplePlacemark;

    if-nez v5, :cond_2

    move v3, v4

    goto :goto_0

    :cond_2
    move-object v0, p1

    check-cast v0, Lcom/thetransitapp/droid/model/SimplePlacemark;

    .local v0, "other":Lcom/thetransitapp/droid/model/SimplePlacemark;
    invoke-virtual {v0, p0}, Lcom/thetransitapp/droid/model/SimplePlacemark;->canEqual(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_3

    move v3, v4

    goto :goto_0

    :cond_3
    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/SimplePlacemark;->getName()Ljava/lang/String;

    move-result-object v2

    .local v2, "this$name":Ljava/lang/String;
    invoke-virtual {v0}, Lcom/thetransitapp/droid/model/SimplePlacemark;->getName()Ljava/lang/String;

    move-result-object v1

    .local v1, "other$name":Ljava/lang/String;
    if-nez v2, :cond_5

    if-eqz v1, :cond_6

    :cond_4
    move v3, v4

    goto :goto_0

    :cond_5
    invoke-virtual {v2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    :cond_6
    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/SimplePlacemark;->getLatitude()D

    move-result-wide v5

    invoke-virtual {v0}, Lcom/thetransitapp/droid/model/SimplePlacemark;->getLatitude()D

    move-result-wide v7

    invoke-static {v5, v6, v7, v8}, Ljava/lang/Double;->compare(DD)I

    move-result v5

    if-eqz v5, :cond_7

    move v3, v4

    goto :goto_0

    :cond_7
    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/SimplePlacemark;->getLongitude()D

    move-result-wide v5

    invoke-virtual {v0}, Lcom/thetransitapp/droid/model/SimplePlacemark;->getLongitude()D

    move-result-wide v7

    invoke-static {v5, v6, v7, v8}, Ljava/lang/Double;->compare(DD)I

    move-result v5

    if-eqz v5, :cond_0

    move v3, v4

    goto :goto_0
.end method

.method public getLatitude()D
    .locals 2

    .prologue
    .line 10
    iget-wide v0, p0, Lcom/thetransitapp/droid/model/SimplePlacemark;->latitude:D

    return-wide v0
.end method

.method public getLongitude()D
    .locals 2

    .prologue
    .line 10
    iget-wide v0, p0, Lcom/thetransitapp/droid/model/SimplePlacemark;->longitude:D

    return-wide v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .prologue
    .line 10
    iget-object v0, p0, Lcom/thetransitapp/droid/model/SimplePlacemark;->name:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 11

    .prologue
    const/16 v10, 0x20

    .line 10
    const/16 v5, 0x1f

    .local v5, "PRIME":I
    const/4 v6, 0x1

    .local v6, "result":I
    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/SimplePlacemark;->getName()Ljava/lang/String;

    move-result-object v4

    .local v4, "$name":Ljava/lang/String;
    if-nez v4, :cond_0

    const/4 v7, 0x0

    :goto_0
    add-int/lit8 v6, v7, 0x1f

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/SimplePlacemark;->getLatitude()D

    move-result-wide v7

    invoke-static {v7, v8}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v0

    .local v0, "$latitude":J
    mul-int/lit8 v7, v6, 0x1f

    ushr-long v8, v0, v10

    xor-long/2addr v8, v0

    long-to-int v8, v8

    add-int v6, v7, v8

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/SimplePlacemark;->getLongitude()D

    move-result-wide v7

    invoke-static {v7, v8}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v2

    .local v2, "$longitude":J
    mul-int/lit8 v7, v6, 0x1f

    ushr-long v8, v2, v10

    xor-long/2addr v8, v2

    long-to-int v8, v8

    add-int v6, v7, v8

    return v6

    .end local v0    # "$latitude":J
    .end local v2    # "$longitude":J
    :cond_0
    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    move-result v7

    goto :goto_0
.end method

.method public setLatitude(D)V
    .locals 0
    .param p1, "latitude"    # D

    .prologue
    .line 10
    iput-wide p1, p0, Lcom/thetransitapp/droid/model/SimplePlacemark;->latitude:D

    return-void
.end method

.method public setLongitude(D)V
    .locals 0
    .param p1, "longitude"    # D

    .prologue
    .line 10
    iput-wide p1, p0, Lcom/thetransitapp/droid/model/SimplePlacemark;->longitude:D

    return-void
.end method

.method public setName(Ljava/lang/String;)V
    .locals 0
    .param p1, "name"    # Ljava/lang/String;

    .prologue
    .line 10
    iput-object p1, p0, Lcom/thetransitapp/droid/model/SimplePlacemark;->name:Ljava/lang/String;

    return-void
.end method

.method public toLatLng()Lcom/google/android/gms/maps/model/LatLng;
    .locals 5

    .prologue
    .line 36
    new-instance v0, Lcom/google/android/gms/maps/model/LatLng;

    iget-wide v1, p0, Lcom/thetransitapp/droid/model/SimplePlacemark;->latitude:D

    iget-wide v3, p0, Lcom/thetransitapp/droid/model/SimplePlacemark;->longitude:D

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    return-object v0
.end method

.method public toLocation()Landroid/location/Location;
    .locals 3

    .prologue
    .line 40
    new-instance v0, Landroid/location/Location;

    const-string v1, "Transit"

    invoke-direct {v0, v1}, Landroid/location/Location;-><init>(Ljava/lang/String;)V

    .line 41
    .local v0, "location":Landroid/location/Location;
    iget-wide v1, p0, Lcom/thetransitapp/droid/model/SimplePlacemark;->latitude:D

    invoke-virtual {v0, v1, v2}, Landroid/location/Location;->setLatitude(D)V

    .line 42
    iget-wide v1, p0, Lcom/thetransitapp/droid/model/SimplePlacemark;->longitude:D

    invoke-virtual {v0, v1, v2}, Landroid/location/Location;->setLongitude(D)V

    .line 44
    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .prologue
    .line 10
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "SimplePlacemark(name="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/SimplePlacemark;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", latitude="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/SimplePlacemark;->getLatitude()D

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", longitude="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/SimplePlacemark;->getLongitude()D

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public travel(DD)Lcom/thetransitapp/droid/model/SimplePlacemark;
    .locals 23
    .param p1, "bearing"    # D
    .param p3, "distance"    # D

    .prologue
    .line 56
    invoke-static/range {p1 .. p2}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v3

    .line 57
    .local v3, "bR":D
    move-object/from16 v0, p0

    iget-wide v15, v0, Lcom/thetransitapp/droid/model/SimplePlacemark;->latitude:D

    invoke-static/range {v15 .. v16}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v7

    .line 58
    .local v7, "lat1R":D
    move-object/from16 v0, p0

    iget-wide v15, v0, Lcom/thetransitapp/droid/model/SimplePlacemark;->longitude:D

    invoke-static/range {v15 .. v16}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v11

    .line 59
    .local v11, "lon1R":D
    const-wide v15, 0x40b8e3024dd2f1aaL    # 6371.009

    div-double v5, p3, v15

    .line 61
    .local v5, "dR":D
    invoke-static {v5, v6}, Ljava/lang/Math;->sin(D)D

    move-result-wide v15

    invoke-static {v7, v8}, Ljava/lang/Math;->cos(D)D

    move-result-wide v17

    mul-double v1, v15, v17

    .line 62
    .local v1, "a":D
    invoke-static {v7, v8}, Ljava/lang/Math;->sin(D)D

    move-result-wide v15

    invoke-static {v5, v6}, Ljava/lang/Math;->cos(D)D

    move-result-wide v17

    mul-double v15, v15, v17

    invoke-static {v3, v4}, Ljava/lang/Math;->cos(D)D

    move-result-wide v17

    mul-double v17, v17, v1

    add-double v15, v15, v17

    invoke-static/range {v15 .. v16}, Ljava/lang/Math;->asin(D)D

    move-result-wide v9

    .line 63
    .local v9, "lat2":D
    invoke-static {v3, v4}, Ljava/lang/Math;->sin(D)D

    move-result-wide v15

    mul-double/2addr v15, v1

    invoke-static {v5, v6}, Ljava/lang/Math;->cos(D)D

    move-result-wide v17

    invoke-static {v7, v8}, Ljava/lang/Math;->sin(D)D

    move-result-wide v19

    invoke-static {v9, v10}, Ljava/lang/Math;->sin(D)D

    move-result-wide v21

    mul-double v19, v19, v21

    sub-double v17, v17, v19

    invoke-static/range {v15 .. v18}, Ljava/lang/Math;->atan2(DD)D

    move-result-wide v15

    add-double v13, v11, v15

    .line 65
    .local v13, "lon2":D
    new-instance v15, Lcom/thetransitapp/droid/model/SimplePlacemark;

    invoke-static {v9, v10}, Ljava/lang/Math;->toDegrees(D)D

    move-result-wide v16

    invoke-static {v13, v14}, Ljava/lang/Math;->toDegrees(D)D

    move-result-wide v18

    invoke-direct/range {v15 .. v19}, Lcom/thetransitapp/droid/model/SimplePlacemark;-><init>(DD)V

    return-object v15
.end method
