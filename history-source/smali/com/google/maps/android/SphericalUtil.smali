.class public Lcom/google/maps/android/SphericalUtil;
.super Ljava/lang/Object;
.source "SphericalUtil.java"


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static computeAngleBetween(Lcom/google/android/gms/maps/model/LatLng;Lcom/google/android/gms/maps/model/LatLng;)D
    .locals 8
    .param p0, "from"    # Lcom/google/android/gms/maps/model/LatLng;
    .param p1, "to"    # Lcom/google/android/gms/maps/model/LatLng;

    .prologue
    .line 165
    iget-wide v0, p0, Lcom/google/android/gms/maps/model/LatLng;->latitude:D

    invoke-static {v0, v1}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v0

    iget-wide v2, p0, Lcom/google/android/gms/maps/model/LatLng;->longitude:D

    invoke-static {v2, v3}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v2

    iget-wide v4, p1, Lcom/google/android/gms/maps/model/LatLng;->latitude:D

    invoke-static {v4, v5}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v4

    iget-wide v6, p1, Lcom/google/android/gms/maps/model/LatLng;->longitude:D

    invoke-static {v6, v7}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v6

    invoke-static/range {v0 .. v7}, Lcom/google/maps/android/SphericalUtil;->distanceRadians(DDDD)D

    move-result-wide v0

    return-wide v0
.end method

.method public static computeArea(Ljava/util/List;)D
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/maps/model/LatLng;",
            ">;)D"
        }
    .end annotation

    .prologue
    .line 203
    .local p0, "path":Ljava/util/List;, "Ljava/util/List<Lcom/google/android/gms/maps/model/LatLng;>;"
    invoke-static {p0}, Lcom/google/maps/android/SphericalUtil;->computeSignedArea(Ljava/util/List;)D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(D)D

    move-result-wide v0

    return-wide v0
.end method

.method public static computeDistanceBetween(Lcom/google/android/gms/maps/model/LatLng;Lcom/google/android/gms/maps/model/LatLng;)D
    .locals 4
    .param p0, "from"    # Lcom/google/android/gms/maps/model/LatLng;
    .param p1, "to"    # Lcom/google/android/gms/maps/model/LatLng;

    .prologue
    .line 173
    invoke-static {p0, p1}, Lcom/google/maps/android/SphericalUtil;->computeAngleBetween(Lcom/google/android/gms/maps/model/LatLng;Lcom/google/android/gms/maps/model/LatLng;)D

    move-result-wide v0

    const-wide v2, 0x41584db040000000L    # 6371009.0

    mul-double/2addr v0, v2

    return-wide v0
.end method

.method public static computeHeading(Lcom/google/android/gms/maps/model/LatLng;Lcom/google/android/gms/maps/model/LatLng;)D
    .locals 21
    .param p0, "from"    # Lcom/google/android/gms/maps/model/LatLng;
    .param p1, "to"    # Lcom/google/android/gms/maps/model/LatLng;

    .prologue
    .line 37
    move-object/from16 v0, p0

    iget-wide v1, v0, Lcom/google/android/gms/maps/model/LatLng;->latitude:D

    invoke-static {v1, v2}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v9

    .line 38
    .local v9, "fromLat":D
    move-object/from16 v0, p0

    iget-wide v1, v0, Lcom/google/android/gms/maps/model/LatLng;->longitude:D

    invoke-static {v1, v2}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v11

    .line 39
    .local v11, "fromLng":D
    move-object/from16 v0, p1

    iget-wide v1, v0, Lcom/google/android/gms/maps/model/LatLng;->latitude:D

    invoke-static {v1, v2}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v15

    .line 40
    .local v15, "toLat":D
    move-object/from16 v0, p1

    iget-wide v1, v0, Lcom/google/android/gms/maps/model/LatLng;->longitude:D

    invoke-static {v1, v2}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v17

    .line 41
    .local v17, "toLng":D
    sub-double v7, v17, v11

    .line 42
    .local v7, "dLng":D
    invoke-static {v7, v8}, Ljava/lang/Math;->sin(D)D

    move-result-wide v1

    invoke-static/range {v15 .. v16}, Ljava/lang/Math;->cos(D)D

    move-result-wide v3

    mul-double/2addr v1, v3

    invoke-static {v9, v10}, Ljava/lang/Math;->cos(D)D

    move-result-wide v3

    invoke-static/range {v15 .. v16}, Ljava/lang/Math;->sin(D)D

    move-result-wide v5

    mul-double/2addr v3, v5

    invoke-static {v9, v10}, Ljava/lang/Math;->sin(D)D

    move-result-wide v5

    invoke-static/range {v15 .. v16}, Ljava/lang/Math;->cos(D)D

    move-result-wide v19

    mul-double v5, v5, v19

    invoke-static {v7, v8}, Ljava/lang/Math;->cos(D)D

    move-result-wide v19

    mul-double v5, v5, v19

    sub-double/2addr v3, v5

    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->atan2(DD)D

    move-result-wide v13

    .line 45
    .local v13, "heading":D
    invoke-static {v13, v14}, Ljava/lang/Math;->toDegrees(D)D

    move-result-wide v1

    const-wide v3, -0x3f99800000000000L    # -180.0

    const-wide v5, 0x4066800000000000L    # 180.0

    invoke-static/range {v1 .. v6}, Lcom/google/maps/android/MathUtil;->wrap(DDD)D

    move-result-wide v1

    return-wide v1
.end method

.method public static computeLength(Ljava/util/List;)D
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/maps/model/LatLng;",
            ">;)D"
        }
    .end annotation

    .prologue
    .line 180
    .local p0, "path":Ljava/util/List;, "Ljava/util/List<Lcom/google/android/gms/maps/model/LatLng;>;"
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v13

    const/4 v14, 0x2

    if-ge v13, v14, :cond_0

    .line 181
    const-wide/16 v13, 0x0

    .line 194
    :goto_0
    return-wide v13

    .line 183
    :cond_0
    const-wide/16 v9, 0x0

    .line 184
    .local v9, "length":D
    const/4 v13, 0x0

    invoke-interface {p0, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lcom/google/android/gms/maps/model/LatLng;

    .line 185
    .local v12, "prev":Lcom/google/android/gms/maps/model/LatLng;
    iget-wide v13, v12, Lcom/google/android/gms/maps/model/LatLng;->latitude:D

    invoke-static {v13, v14}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v0

    .line 186
    .local v0, "prevLat":D
    iget-wide v13, v12, Lcom/google/android/gms/maps/model/LatLng;->longitude:D

    invoke-static {v13, v14}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v2

    .line 187
    .local v2, "prevLng":D
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    .local v8, "i$":Ljava/util/Iterator;
    :goto_1
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_1

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/google/android/gms/maps/model/LatLng;

    .line 188
    .local v11, "point":Lcom/google/android/gms/maps/model/LatLng;
    iget-wide v13, v11, Lcom/google/android/gms/maps/model/LatLng;->latitude:D

    invoke-static {v13, v14}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v4

    .line 189
    .local v4, "lat":D
    iget-wide v13, v11, Lcom/google/android/gms/maps/model/LatLng;->longitude:D

    invoke-static {v13, v14}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v6

    .line 190
    .local v6, "lng":D
    invoke-static/range {v0 .. v7}, Lcom/google/maps/android/SphericalUtil;->distanceRadians(DDDD)D

    move-result-wide v13

    add-double/2addr v9, v13

    .line 191
    move-wide v0, v4

    .line 192
    move-wide v2, v6

    .line 193
    goto :goto_1

    .line 194
    .end local v4    # "lat":D
    .end local v6    # "lng":D
    .end local v11    # "point":Lcom/google/android/gms/maps/model/LatLng;
    :cond_1
    const-wide v13, 0x41584db040000000L    # 6371009.0

    mul-double/2addr v13, v9

    goto :goto_0
.end method

.method public static computeOffset(Lcom/google/android/gms/maps/model/LatLng;DD)Lcom/google/android/gms/maps/model/LatLng;
    .locals 24
    .param p0, "from"    # Lcom/google/android/gms/maps/model/LatLng;
    .param p1, "distance"    # D
    .param p3, "heading"    # D

    .prologue
    .line 56
    const-wide v18, 0x41584db040000000L    # 6371009.0

    div-double p1, p1, v18

    .line 57
    invoke-static/range {p3 .. p4}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide p3

    .line 59
    move-object/from16 v0, p0

    iget-wide v0, v0, Lcom/google/android/gms/maps/model/LatLng;->latitude:D

    move-wide/from16 v18, v0

    invoke-static/range {v18 .. v19}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v8

    .line 60
    .local v8, "fromLat":D
    move-object/from16 v0, p0

    iget-wide v0, v0, Lcom/google/android/gms/maps/model/LatLng;->longitude:D

    move-wide/from16 v18, v0

    invoke-static/range {v18 .. v19}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v10

    .line 61
    .local v10, "fromLng":D
    invoke-static/range {p1 .. p2}, Ljava/lang/Math;->cos(D)D

    move-result-wide v2

    .line 62
    .local v2, "cosDistance":D
    invoke-static/range {p1 .. p2}, Ljava/lang/Math;->sin(D)D

    move-result-wide v12

    .line 63
    .local v12, "sinDistance":D
    invoke-static {v8, v9}, Ljava/lang/Math;->sin(D)D

    move-result-wide v14

    .line 64
    .local v14, "sinFromLat":D
    invoke-static {v8, v9}, Ljava/lang/Math;->cos(D)D

    move-result-wide v4

    .line 65
    .local v4, "cosFromLat":D
    mul-double v18, v2, v14

    mul-double v20, v12, v4

    invoke-static/range {p3 .. p4}, Ljava/lang/Math;->cos(D)D

    move-result-wide v22

    mul-double v20, v20, v22

    add-double v16, v18, v20

    .line 66
    .local v16, "sinLat":D
    mul-double v18, v12, v4

    invoke-static/range {p3 .. p4}, Ljava/lang/Math;->sin(D)D

    move-result-wide v20

    mul-double v18, v18, v20

    mul-double v20, v14, v16

    sub-double v20, v2, v20

    invoke-static/range {v18 .. v21}, Ljava/lang/Math;->atan2(DD)D

    move-result-wide v6

    .line 69
    .local v6, "dLng":D
    new-instance v18, Lcom/google/android/gms/maps/model/LatLng;

    invoke-static/range {v16 .. v17}, Ljava/lang/Math;->asin(D)D

    move-result-wide v19

    invoke-static/range {v19 .. v20}, Ljava/lang/Math;->toDegrees(D)D

    move-result-wide v19

    add-double v21, v10, v6

    invoke-static/range {v21 .. v22}, Ljava/lang/Math;->toDegrees(D)D

    move-result-wide v21

    invoke-direct/range {v18 .. v22}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    return-object v18
.end method

.method public static computeOffsetOrigin(Lcom/google/android/gms/maps/model/LatLng;DD)Lcom/google/android/gms/maps/model/LatLng;
    .locals 30
    .param p0, "to"    # Lcom/google/android/gms/maps/model/LatLng;
    .param p1, "distance"    # D
    .param p3, "heading"    # D

    .prologue
    .line 82
    invoke-static/range {p3 .. p4}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide p3

    .line 83
    const-wide v24, 0x41584db040000000L    # 6371009.0

    div-double p1, p1, v24

    .line 85
    invoke-static/range {p1 .. p2}, Ljava/lang/Math;->cos(D)D

    move-result-wide v14

    .line 86
    .local v14, "n1":D
    invoke-static/range {p1 .. p2}, Ljava/lang/Math;->sin(D)D

    move-result-wide v24

    invoke-static/range {p3 .. p4}, Ljava/lang/Math;->cos(D)D

    move-result-wide v26

    mul-double v18, v24, v26

    .line 87
    .local v18, "n2":D
    invoke-static/range {p1 .. p2}, Ljava/lang/Math;->sin(D)D

    move-result-wide v24

    invoke-static/range {p3 .. p4}, Ljava/lang/Math;->sin(D)D

    move-result-wide v26

    mul-double v20, v24, v26

    .line 88
    .local v20, "n3":D
    move-object/from16 v0, p0

    iget-wide v0, v0, Lcom/google/android/gms/maps/model/LatLng;->latitude:D

    move-wide/from16 v24, v0

    invoke-static/range {v24 .. v25}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v24

    invoke-static/range {v24 .. v25}, Ljava/lang/Math;->sin(D)D

    move-result-wide v22

    .line 92
    .local v22, "n4":D
    mul-double v16, v14, v14

    .line 93
    .local v16, "n12":D
    mul-double v24, v18, v18

    mul-double v24, v24, v16

    mul-double v26, v16, v16

    add-double v24, v24, v26

    mul-double v26, v16, v22

    mul-double v26, v26, v22

    sub-double v8, v24, v26

    .line 94
    .local v8, "discriminant":D
    const-wide/16 v24, 0x0

    cmpg-double v24, v8, v24

    if-gez v24, :cond_0

    .line 96
    const/16 v24, 0x0

    .line 113
    :goto_0
    return-object v24

    .line 98
    :cond_0
    mul-double v24, v18, v22

    invoke-static {v8, v9}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v26

    add-double v6, v24, v26

    .line 99
    .local v6, "b":D
    mul-double v24, v14, v14

    mul-double v26, v18, v18

    add-double v24, v24, v26

    div-double v6, v6, v24

    .line 100
    mul-double v24, v18, v6

    sub-double v24, v22, v24

    div-double v4, v24, v14

    .line 101
    .local v4, "a":D
    invoke-static {v4, v5, v6, v7}, Ljava/lang/Math;->atan2(DD)D

    move-result-wide v10

    .line 102
    .local v10, "fromLatRadians":D
    const-wide v24, -0x4006de04abbbd2e8L    # -1.5707963267948966

    cmpg-double v24, v10, v24

    if-ltz v24, :cond_1

    const-wide v24, 0x3ff921fb54442d18L    # 1.5707963267948966

    cmpl-double v24, v10, v24

    if-lez v24, :cond_2

    .line 103
    :cond_1
    mul-double v24, v18, v22

    invoke-static {v8, v9}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v26

    sub-double v6, v24, v26

    .line 104
    mul-double v24, v14, v14

    mul-double v26, v18, v18

    add-double v24, v24, v26

    div-double v6, v6, v24

    .line 105
    invoke-static {v4, v5, v6, v7}, Ljava/lang/Math;->atan2(DD)D

    move-result-wide v10

    .line 107
    :cond_2
    const-wide v24, -0x4006de04abbbd2e8L    # -1.5707963267948966

    cmpg-double v24, v10, v24

    if-ltz v24, :cond_3

    const-wide v24, 0x3ff921fb54442d18L    # 1.5707963267948966

    cmpl-double v24, v10, v24

    if-lez v24, :cond_4

    .line 109
    :cond_3
    const/16 v24, 0x0

    goto :goto_0

    .line 111
    :cond_4
    move-object/from16 v0, p0

    iget-wide v0, v0, Lcom/google/android/gms/maps/model/LatLng;->longitude:D

    move-wide/from16 v24, v0

    invoke-static/range {v24 .. v25}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v24

    invoke-static {v10, v11}, Ljava/lang/Math;->cos(D)D

    move-result-wide v26

    mul-double v26, v26, v14

    invoke-static {v10, v11}, Ljava/lang/Math;->sin(D)D

    move-result-wide v28

    mul-double v28, v28, v18

    sub-double v26, v26, v28

    move-wide/from16 v0, v20

    move-wide/from16 v2, v26

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->atan2(DD)D

    move-result-wide v26

    sub-double v12, v24, v26

    .line 113
    .local v12, "fromLngRadians":D
    new-instance v24, Lcom/google/android/gms/maps/model/LatLng;

    invoke-static {v10, v11}, Ljava/lang/Math;->toDegrees(D)D

    move-result-wide v25

    invoke-static {v12, v13}, Ljava/lang/Math;->toDegrees(D)D

    move-result-wide v27

    invoke-direct/range {v24 .. v28}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    goto/16 :goto_0
.end method

.method public static computeSignedArea(Ljava/util/List;)D
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/maps/model/LatLng;",
            ">;)D"
        }
    .end annotation

    .prologue
    .line 214
    .local p0, "path":Ljava/util/List;, "Ljava/util/List<Lcom/google/android/gms/maps/model/LatLng;>;"
    const-wide v0, 0x41584db040000000L    # 6371009.0

    invoke-static {p0, v0, v1}, Lcom/google/maps/android/SphericalUtil;->computeSignedArea(Ljava/util/List;D)D

    move-result-wide v0

    return-wide v0
.end method

.method static computeSignedArea(Ljava/util/List;D)D
    .locals 20
    .param p1, "radius"    # D
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/maps/model/LatLng;",
            ">;D)D"
        }
    .end annotation

    .prologue
    .line 223
    .local p0, "path":Ljava/util/List;, "Ljava/util/List<Lcom/google/android/gms/maps/model/LatLng;>;"
    invoke-interface/range {p0 .. p0}, Ljava/util/List;->size()I

    move-result v13

    .line 224
    .local v13, "size":I
    const/16 v16, 0x3

    move/from16 v0, v16

    if-ge v13, v0, :cond_0

    const-wide/16 v16, 0x0

    .line 238
    :goto_0
    return-wide v16

    .line 225
    :cond_0
    const-wide/16 v14, 0x0

    .line 226
    .local v14, "total":D
    add-int/lit8 v16, v13, -0x1

    move-object/from16 v0, p0

    move/from16 v1, v16

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lcom/google/android/gms/maps/model/LatLng;

    .line 227
    .local v12, "prev":Lcom/google/android/gms/maps/model/LatLng;
    const-wide v16, 0x3ff921fb54442d18L    # 1.5707963267948966

    iget-wide v0, v12, Lcom/google/android/gms/maps/model/LatLng;->latitude:D

    move-wide/from16 v18, v0

    invoke-static/range {v18 .. v19}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v18

    sub-double v16, v16, v18

    const-wide/high16 v18, 0x4000000000000000L    # 2.0

    div-double v16, v16, v18

    invoke-static/range {v16 .. v17}, Ljava/lang/Math;->tan(D)D

    move-result-wide v6

    .line 228
    .local v6, "prevTanLat":D
    iget-wide v0, v12, Lcom/google/android/gms/maps/model/LatLng;->longitude:D

    move-wide/from16 v16, v0

    invoke-static/range {v16 .. v17}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v8

    .line 231
    .local v8, "prevLng":D
    invoke-interface/range {p0 .. p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    .local v10, "i$":Ljava/util/Iterator;
    :goto_1
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v16

    if-eqz v16, :cond_1

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/google/android/gms/maps/model/LatLng;

    .line 232
    .local v11, "point":Lcom/google/android/gms/maps/model/LatLng;
    const-wide v16, 0x3ff921fb54442d18L    # 1.5707963267948966

    iget-wide v0, v11, Lcom/google/android/gms/maps/model/LatLng;->latitude:D

    move-wide/from16 v18, v0

    invoke-static/range {v18 .. v19}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v18

    sub-double v16, v16, v18

    const-wide/high16 v18, 0x4000000000000000L    # 2.0

    div-double v16, v16, v18

    invoke-static/range {v16 .. v17}, Ljava/lang/Math;->tan(D)D

    move-result-wide v2

    .line 233
    .local v2, "tanLat":D
    iget-wide v0, v11, Lcom/google/android/gms/maps/model/LatLng;->longitude:D

    move-wide/from16 v16, v0

    invoke-static/range {v16 .. v17}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v4

    .line 234
    .local v4, "lng":D
    invoke-static/range {v2 .. v9}, Lcom/google/maps/android/SphericalUtil;->polarTriangleArea(DDDD)D

    move-result-wide v16

    add-double v14, v14, v16

    .line 235
    move-wide v6, v2

    .line 236
    move-wide v8, v4

    .line 237
    goto :goto_1

    .line 238
    .end local v2    # "tanLat":D
    .end local v4    # "lng":D
    .end local v11    # "point":Lcom/google/android/gms/maps/model/LatLng;
    :cond_1
    mul-double v16, p1, p1

    mul-double v16, v16, v14

    goto :goto_0
.end method

.method private static distanceRadians(DDDD)D
    .locals 6
    .param p0, "lat1"    # D
    .param p2, "lng1"    # D
    .param p4, "lat2"    # D
    .param p6, "lng2"    # D

    .prologue
    .line 157
    sub-double v4, p2, p6

    move-wide v0, p0

    move-wide v2, p4

    invoke-static/range {v0 .. v5}, Lcom/google/maps/android/MathUtil;->havDistance(DDD)D

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/google/maps/android/MathUtil;->arcHav(D)D

    move-result-wide v0

    return-wide v0
.end method

.method public static interpolate(Lcom/google/android/gms/maps/model/LatLng;Lcom/google/android/gms/maps/model/LatLng;D)Lcom/google/android/gms/maps/model/LatLng;
    .locals 41
    .param p0, "from"    # Lcom/google/android/gms/maps/model/LatLng;
    .param p1, "to"    # Lcom/google/android/gms/maps/model/LatLng;
    .param p2, "fraction"    # D

    .prologue
    .line 126
    move-object/from16 v0, p0

    iget-wide v0, v0, Lcom/google/android/gms/maps/model/LatLng;->latitude:D

    move-wide/from16 v35, v0

    invoke-static/range {v35 .. v36}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v15

    .line 127
    .local v15, "fromLat":D
    move-object/from16 v0, p0

    iget-wide v0, v0, Lcom/google/android/gms/maps/model/LatLng;->longitude:D

    move-wide/from16 v35, v0

    invoke-static/range {v35 .. v36}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v17

    .line 128
    .local v17, "fromLng":D
    move-object/from16 v0, p1

    iget-wide v0, v0, Lcom/google/android/gms/maps/model/LatLng;->latitude:D

    move-wide/from16 v35, v0

    invoke-static/range {v35 .. v36}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v25

    .line 129
    .local v25, "toLat":D
    move-object/from16 v0, p1

    iget-wide v0, v0, Lcom/google/android/gms/maps/model/LatLng;->longitude:D

    move-wide/from16 v35, v0

    invoke-static/range {v35 .. v36}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v27

    .line 130
    .local v27, "toLng":D
    invoke-static/range {v15 .. v16}, Ljava/lang/Math;->cos(D)D

    move-result-wide v11

    .line 131
    .local v11, "cosFromLat":D
    invoke-static/range {v25 .. v26}, Ljava/lang/Math;->cos(D)D

    move-result-wide v13

    .line 134
    .local v13, "cosToLat":D
    invoke-static/range {p0 .. p1}, Lcom/google/maps/android/SphericalUtil;->computeAngleBetween(Lcom/google/android/gms/maps/model/LatLng;Lcom/google/android/gms/maps/model/LatLng;)D

    move-result-wide v7

    .line 135
    .local v7, "angle":D
    invoke-static {v7, v8}, Ljava/lang/Math;->sin(D)D

    move-result-wide v23

    .line 136
    .local v23, "sinAngle":D
    const-wide v35, 0x3eb0c6f7a0b5ed8dL    # 1.0E-6

    cmpg-double v35, v23, v35

    if-gez v35, :cond_0

    .line 150
    .end local p0    # "from":Lcom/google/android/gms/maps/model/LatLng;
    :goto_0
    return-object p0

    .line 139
    .restart local p0    # "from":Lcom/google/android/gms/maps/model/LatLng;
    :cond_0
    const-wide/high16 v35, 0x3ff0000000000000L    # 1.0

    sub-double v35, v35, p2

    mul-double v35, v35, v7

    invoke-static/range {v35 .. v36}, Ljava/lang/Math;->sin(D)D

    move-result-wide v35

    div-double v5, v35, v23

    .line 140
    .local v5, "a":D
    mul-double v35, p2, v7

    invoke-static/range {v35 .. v36}, Ljava/lang/Math;->sin(D)D

    move-result-wide v35

    div-double v9, v35, v23

    .line 143
    .local v9, "b":D
    mul-double v35, v5, v11

    invoke-static/range {v17 .. v18}, Ljava/lang/Math;->cos(D)D

    move-result-wide v37

    mul-double v35, v35, v37

    mul-double v37, v9, v13

    invoke-static/range {v27 .. v28}, Ljava/lang/Math;->cos(D)D

    move-result-wide v39

    mul-double v37, v37, v39

    add-double v29, v35, v37

    .line 144
    .local v29, "x":D
    mul-double v35, v5, v11

    invoke-static/range {v17 .. v18}, Ljava/lang/Math;->sin(D)D

    move-result-wide v37

    mul-double v35, v35, v37

    mul-double v37, v9, v13

    invoke-static/range {v27 .. v28}, Ljava/lang/Math;->sin(D)D

    move-result-wide v39

    mul-double v37, v37, v39

    add-double v31, v35, v37

    .line 145
    .local v31, "y":D
    invoke-static/range {v15 .. v16}, Ljava/lang/Math;->sin(D)D

    move-result-wide v35

    mul-double v35, v35, v5

    invoke-static/range {v25 .. v26}, Ljava/lang/Math;->sin(D)D

    move-result-wide v37

    mul-double v37, v37, v9

    add-double v33, v35, v37

    .line 148
    .local v33, "z":D
    mul-double v35, v29, v29

    mul-double v37, v31, v31

    add-double v35, v35, v37

    invoke-static/range {v35 .. v36}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v35

    invoke-static/range {v33 .. v36}, Ljava/lang/Math;->atan2(DD)D

    move-result-wide v19

    .line 149
    .local v19, "lat":D
    move-wide/from16 v0, v31

    move-wide/from16 v2, v29

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->atan2(DD)D

    move-result-wide v21

    .line 150
    .local v21, "lng":D
    new-instance p0, Lcom/google/android/gms/maps/model/LatLng;

    .end local p0    # "from":Lcom/google/android/gms/maps/model/LatLng;
    invoke-static/range {v19 .. v20}, Ljava/lang/Math;->toDegrees(D)D

    move-result-wide v35

    invoke-static/range {v21 .. v22}, Ljava/lang/Math;->toDegrees(D)D

    move-result-wide v37

    move-object/from16 v0, p0

    move-wide/from16 v1, v35

    move-wide/from16 v3, v37

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    goto :goto_0
.end method

.method private static polarTriangleArea(DDDD)D
    .locals 12
    .param p0, "tan1"    # D
    .param p2, "lng1"    # D
    .param p4, "tan2"    # D
    .param p6, "lng2"    # D

    .prologue
    .line 249
    sub-double v0, p2, p6

    .line 250
    .local v0, "deltaLng":D
    mul-double v2, p0, p4

    .line 251
    .local v2, "t":D
    const-wide/high16 v4, 0x4000000000000000L    # 2.0

    invoke-static {v0, v1}, Ljava/lang/Math;->sin(D)D

    move-result-wide v6

    mul-double/2addr v6, v2

    const-wide/high16 v8, 0x3ff0000000000000L    # 1.0

    invoke-static {v0, v1}, Ljava/lang/Math;->cos(D)D

    move-result-wide v10

    mul-double/2addr v10, v2

    add-double/2addr v8, v10

    invoke-static {v6, v7, v8, v9}, Ljava/lang/Math;->atan2(DD)D

    move-result-wide v6

    mul-double/2addr v4, v6

    return-wide v4
.end method
