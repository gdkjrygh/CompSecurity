.class public final Lcom/thetransitapp/droid/util/PolylineUtility;
.super Ljava/lang/Object;
.source "PolylineUtility.java"


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    return-void
.end method

.method public static decodePoly(Ljava/lang/String;)Ljava/util/List;
    .locals 20
    .param p0, "encoded"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/maps/model/LatLng;",
            ">;"
        }
    .end annotation

    .prologue
    .line 14
    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 15
    .local v11, "poly":Ljava/util/List;, "Ljava/util/List<Lcom/google/android/gms/maps/model/LatLng;>;"
    const/4 v5, 0x0

    .local v5, "index":I
    invoke-virtual/range {p0 .. p0}, Ljava/lang/String;->length()I

    move-result v8

    .line 16
    .local v8, "len":I
    const/4 v7, 0x0

    .local v7, "lat":I
    const/4 v9, 0x0

    .line 18
    .local v9, "lng":I
    :goto_0
    if-lt v5, v8, :cond_0

    .line 42
    return-object v11

    .line 19
    :cond_0
    const/4 v13, 0x0

    .local v13, "shift":I
    const/4 v12, 0x0

    .line 21
    .local v12, "result":I
    :goto_1
    add-int/lit8 v6, v5, 0x1

    .end local v5    # "index":I
    .local v6, "index":I
    move-object/from16 v0, p0

    invoke-virtual {v0, v5}, Ljava/lang/String;->charAt(I)C

    move-result v14

    add-int/lit8 v2, v14, -0x3f

    .line 22
    .local v2, "b":I
    and-int/lit8 v14, v2, 0x1f

    shl-int/2addr v14, v13

    or-int/2addr v12, v14

    .line 23
    add-int/lit8 v13, v13, 0x5

    .line 24
    const/16 v14, 0x20

    .line 20
    if-ge v2, v14, :cond_4

    .line 25
    and-int/lit8 v14, v12, 0x1

    if-eqz v14, :cond_1

    shr-int/lit8 v14, v12, 0x1

    xor-int/lit8 v3, v14, -0x1

    .line 26
    .local v3, "dlat":I
    :goto_2
    add-int/2addr v7, v3

    .line 28
    const/4 v13, 0x0

    .line 29
    const/4 v12, 0x0

    move v5, v6

    .line 31
    .end local v6    # "index":I
    .restart local v5    # "index":I
    :goto_3
    add-int/lit8 v6, v5, 0x1

    .end local v5    # "index":I
    .restart local v6    # "index":I
    move-object/from16 v0, p0

    invoke-virtual {v0, v5}, Ljava/lang/String;->charAt(I)C

    move-result v14

    add-int/lit8 v2, v14, -0x3f

    .line 32
    and-int/lit8 v14, v2, 0x1f

    shl-int/2addr v14, v13

    or-int/2addr v12, v14

    .line 33
    add-int/lit8 v13, v13, 0x5

    .line 34
    const/16 v14, 0x20

    .line 30
    if-ge v2, v14, :cond_3

    .line 35
    and-int/lit8 v14, v12, 0x1

    if-eqz v14, :cond_2

    shr-int/lit8 v14, v12, 0x1

    xor-int/lit8 v4, v14, -0x1

    .line 36
    .local v4, "dlng":I
    :goto_4
    add-int/2addr v9, v4

    .line 38
    new-instance v10, Lcom/google/android/gms/maps/model/LatLng;

    int-to-double v14, v7

    const-wide v16, 0x40f86a0000000000L    # 100000.0

    div-double v14, v14, v16

    int-to-double v0, v9

    move-wide/from16 v16, v0

    const-wide v18, 0x40f86a0000000000L    # 100000.0

    div-double v16, v16, v18

    move-wide/from16 v0, v16

    invoke-direct {v10, v14, v15, v0, v1}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    .line 39
    .local v10, "p":Lcom/google/android/gms/maps/model/LatLng;
    invoke-interface {v11, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move v5, v6

    .end local v6    # "index":I
    .restart local v5    # "index":I
    goto :goto_0

    .line 25
    .end local v3    # "dlat":I
    .end local v4    # "dlng":I
    .end local v5    # "index":I
    .end local v10    # "p":Lcom/google/android/gms/maps/model/LatLng;
    .restart local v6    # "index":I
    :cond_1
    shr-int/lit8 v3, v12, 0x1

    goto :goto_2

    .line 35
    .restart local v3    # "dlat":I
    :cond_2
    shr-int/lit8 v4, v12, 0x1

    goto :goto_4

    :cond_3
    move v5, v6

    .end local v6    # "index":I
    .restart local v5    # "index":I
    goto :goto_3

    .end local v3    # "dlat":I
    .end local v5    # "index":I
    .restart local v6    # "index":I
    :cond_4
    move v5, v6

    .end local v6    # "index":I
    .restart local v5    # "index":I
    goto :goto_1
.end method
