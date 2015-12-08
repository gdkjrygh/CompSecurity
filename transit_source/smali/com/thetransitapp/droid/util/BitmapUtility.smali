.class public final Lcom/thetransitapp/droid/util/BitmapUtility;
.super Ljava/lang/Object;
.source "BitmapUtility.java"


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    return-void
.end method

.method public static getArrow(Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;F)Landroid/graphics/Bitmap;
    .locals 1
    .param p0, "viewModel"    # Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;
    .param p1, "height"    # F

    .prologue
    .line 27
    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Lcom/thetransitapp/droid/util/BitmapUtility;->getArrow(Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;FZ)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method

.method public static getArrow(Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;FZ)Landroid/graphics/Bitmap;
    .locals 25
    .param p0, "viewModel"    # Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;
    .param p1, "height"    # F
    .param p2, "selected"    # Z

    .prologue
    .line 31
    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->getDirectionGroups()Ljava/util/Map;

    move-result-object v7

    .line 32
    .local v7, "directionGroups":Ljava/util/Map;, "Ljava/util/Map<Lcom/thetransitapp/droid/model/Itinerary$DirectionType;Lcom/thetransitapp/droid/model/viewmodel/ItineraryDirectionGroup;>;"
    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->getCurrentItinerary()Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;

    move-result-object v6

    .line 35
    .local v6, "current":Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;
    const-wide/16 v15, 0x0

    .line 36
    .local v15, "width":D
    const/4 v13, 0x0

    .line 37
    .local v13, "putSpace":Z
    const/4 v14, 0x0

    .line 39
    .local v14, "size":I
    invoke-interface {v7}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v19

    invoke-interface/range {v19 .. v19}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v20

    :goto_0
    invoke-interface/range {v20 .. v20}, Ljava/util/Iterator;->hasNext()Z

    move-result v19

    if-nez v19, :cond_2

    .line 46
    if-eqz v13, :cond_0

    .line 47
    move/from16 v0, p1

    float-to-double v0, v0

    move-wide/from16 v19, v0

    const-wide/high16 v21, 0x3fd0000000000000L    # 0.25

    mul-double v19, v19, v21

    invoke-interface {v7}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v21

    invoke-interface/range {v21 .. v21}, Ljava/util/Set;->size()I

    move-result v21

    move/from16 v0, v21

    int-to-double v0, v0

    move-wide/from16 v21, v0

    mul-double v19, v19, v21

    add-double v15, v15, v19

    .line 50
    :cond_0
    double-to-int v0, v15

    move/from16 v19, v0

    move/from16 v0, p1

    float-to-int v0, v0

    move/from16 v20, v0

    add-int/lit8 v20, v20, 0xa

    sget-object v21, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static/range {v19 .. v21}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v4

    .line 51
    .local v4, "bitmap":Landroid/graphics/Bitmap;
    new-instance v5, Landroid/graphics/Canvas;

    invoke-direct {v5, v4}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 53
    .local v5, "canvas":Landroid/graphics/Canvas;
    new-instance v11, Landroid/graphics/Paint;

    invoke-direct {v11}, Landroid/graphics/Paint;-><init>()V

    .line 54
    .local v11, "paint":Landroid/graphics/Paint;
    const/16 v19, 0x1

    move/from16 v0, v19

    invoke-virtual {v11, v0}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 55
    const/high16 v19, 0x40a00000    # 5.0f

    move/from16 v0, v19

    invoke-virtual {v11, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 57
    const/16 v17, 0x0

    .line 58
    .local v17, "x":F
    const/high16 v18, 0x40c00000    # 6.0f

    .line 60
    .local v18, "y":F
    invoke-interface {v7}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v19

    invoke-interface/range {v19 .. v19}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v20

    :cond_1
    :goto_1
    invoke-interface/range {v20 .. v20}, Ljava/util/Iterator;->hasNext()Z

    move-result v19

    if-nez v19, :cond_4

    .line 90
    return-object v4

    .line 39
    .end local v4    # "bitmap":Landroid/graphics/Bitmap;
    .end local v5    # "canvas":Landroid/graphics/Canvas;
    .end local v11    # "paint":Landroid/graphics/Paint;
    .end local v17    # "x":F
    .end local v18    # "y":F
    :cond_2
    invoke-interface/range {v20 .. v20}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/thetransitapp/droid/model/Itinerary$DirectionType;

    .line 40
    .local v10, "key":Lcom/thetransitapp/droid/model/Itinerary$DirectionType;
    invoke-interface {v7, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v19

    check-cast v19, Lcom/thetransitapp/droid/model/viewmodel/ItineraryDirectionGroup;

    invoke-virtual/range {v19 .. v19}, Lcom/thetransitapp/droid/model/viewmodel/ItineraryDirectionGroup;->getItineraries()Ljava/util/List;

    move-result-object v19

    invoke-interface/range {v19 .. v19}, Ljava/util/List;->size()I

    move-result v14

    .line 41
    int-to-float v0, v14

    move/from16 v19, v0

    mul-float v19, v19, p1

    move/from16 v0, v19

    float-to-double v0, v0

    move-wide/from16 v21, v0

    const-wide v23, 0x3fe6666666666666L    # 0.7

    mul-double v21, v21, v23

    add-double v15, v15, v21

    .line 43
    if-nez v13, :cond_3

    const/16 v19, 0x1

    move/from16 v0, v19

    if-gt v14, v0, :cond_3

    const/4 v13, 0x0

    :goto_2
    goto/16 :goto_0

    :cond_3
    const/4 v13, 0x1

    goto :goto_2

    .line 60
    .end local v10    # "key":Lcom/thetransitapp/droid/model/Itinerary$DirectionType;
    .restart local v4    # "bitmap":Landroid/graphics/Bitmap;
    .restart local v5    # "canvas":Landroid/graphics/Canvas;
    .restart local v11    # "paint":Landroid/graphics/Paint;
    .restart local v17    # "x":F
    .restart local v18    # "y":F
    :cond_4
    invoke-interface/range {v20 .. v20}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/thetransitapp/droid/model/Itinerary$DirectionType;

    .line 61
    .restart local v10    # "key":Lcom/thetransitapp/droid/model/Itinerary$DirectionType;
    invoke-interface {v7, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/thetransitapp/droid/model/viewmodel/ItineraryDirectionGroup;

    .line 63
    .local v8, "group":Lcom/thetransitapp/droid/model/viewmodel/ItineraryDirectionGroup;
    invoke-virtual {v8}, Lcom/thetransitapp/droid/model/viewmodel/ItineraryDirectionGroup;->getItineraries()Ljava/util/List;

    move-result-object v19

    invoke-interface/range {v19 .. v19}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v21

    :goto_3
    invoke-interface/range {v21 .. v21}, Ljava/util/Iterator;->hasNext()Z

    move-result v19

    if-nez v19, :cond_5

    .line 85
    if-eqz v13, :cond_1

    .line 86
    const/high16 v19, 0x3e800000    # 0.25f

    mul-float v19, v19, p1

    add-float v17, v17, v19

    goto :goto_1

    .line 63
    :cond_5
    invoke-interface/range {v21 .. v21}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;

    .line 64
    .local v9, "itinerary":Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;
    new-instance v12, Landroid/graphics/Path;

    invoke-direct {v12}, Landroid/graphics/Path;-><init>()V

    .line 65
    .local v12, "path":Landroid/graphics/Path;
    move/from16 v0, v17

    move/from16 v1, v18

    invoke-virtual {v12, v0, v1}, Landroid/graphics/Path;->moveTo(FF)V

    .line 66
    const v19, 0x3e99999a    # 0.3f

    mul-float v19, v19, p1

    add-float v19, v19, v17

    move/from16 v0, v19

    move/from16 v1, v18

    invoke-virtual {v12, v0, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 67
    const v19, 0x3f19999a    # 0.6f

    mul-float v19, v19, p1

    add-float v19, v19, v17

    const/high16 v22, 0x40000000    # 2.0f

    div-float v22, p1, v22

    add-float v22, v22, v18

    move/from16 v0, v19

    move/from16 v1, v22

    invoke-virtual {v12, v0, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 68
    const v19, 0x3e99999a    # 0.3f

    mul-float v19, v19, p1

    add-float v19, v19, v17

    add-float v22, p1, v18

    move/from16 v0, v19

    move/from16 v1, v22

    invoke-virtual {v12, v0, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 69
    add-float v19, p1, v18

    move/from16 v0, v17

    move/from16 v1, v19

    invoke-virtual {v12, v0, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 70
    const v19, 0x3e99999a    # 0.3f

    mul-float v19, v19, p1

    add-float v19, v19, v17

    const/high16 v22, 0x40000000    # 2.0f

    div-float v22, p1, v22

    add-float v22, v22, v18

    move/from16 v0, v19

    move/from16 v1, v22

    invoke-virtual {v12, v0, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 71
    move/from16 v0, v17

    move/from16 v1, v18

    invoke-virtual {v12, v0, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 73
    if-ne v6, v9, :cond_7

    .line 74
    if-eqz p2, :cond_6

    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->getTextSelectedColor()I

    move-result v19

    :goto_4
    move/from16 v0, v19

    invoke-virtual {v11, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 75
    const v19, 0x3dcccccd    # 0.1f

    const/16 v22, 0x0

    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->getTextShadowOffset()F

    move-result v23

    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->getShadowColor()I

    move-result v24

    move/from16 v0, v19

    move/from16 v1, v22

    move/from16 v2, v23

    move/from16 v3, v24

    invoke-virtual {v11, v0, v1, v2, v3}, Landroid/graphics/Paint;->setShadowLayer(FFFI)V

    .line 81
    :goto_5
    invoke-virtual {v5, v12, v11}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 82
    const v19, 0x3f19999a    # 0.6f

    mul-float v19, v19, p1

    add-float v17, v17, v19

    goto/16 :goto_3

    .line 74
    :cond_6
    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->getTextColor()I

    move-result v19

    goto :goto_4

    .line 77
    :cond_7
    if-eqz p2, :cond_8

    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->getArrowSelectedColor()I

    move-result v19

    :goto_6
    move/from16 v0, v19

    invoke-virtual {v11, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 78
    const v19, 0x3dcccccd    # 0.1f

    const/16 v22, 0x0

    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->getTextShadowOffset()F

    move-result v23

    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->getArrowShadowColor()I

    move-result v24

    move/from16 v0, v19

    move/from16 v1, v22

    move/from16 v2, v23

    move/from16 v3, v24

    invoke-virtual {v11, v0, v1, v2, v3}, Landroid/graphics/Paint;->setShadowLayer(FFFI)V

    goto :goto_5

    .line 77
    :cond_8
    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->getArrowColor()I

    move-result v19

    goto :goto_6
.end method

.method public static getDirectionArrow(IFI)Landroid/graphics/Bitmap;
    .locals 12
    .param p0, "color"    # I
    .param p1, "bearing"    # F
    .param p2, "size"    # I

    .prologue
    const/4 v8, 0x1

    const/high16 v11, 0x40a00000    # 5.0f

    const/high16 v10, 0x40000000    # 2.0f

    const/high16 v9, 0x40400000    # 3.0f

    .line 215
    const/high16 v6, 0x40600000    # 3.5f

    int-to-float v7, p2

    mul-float/2addr v6, v7

    div-float v5, v6, v11

    .line 216
    .local v5, "width":F
    div-float v0, v5, v9

    .line 218
    .local v0, "border":F
    new-instance v2, Landroid/graphics/Paint;

    invoke-direct {v2}, Landroid/graphics/Paint;-><init>()V

    .line 219
    .local v2, "paint":Landroid/graphics/Paint;
    invoke-virtual {v2, v8}, Landroid/graphics/Paint;->setDither(Z)V

    .line 220
    sget-object v6, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v2, v6}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 221
    sget-object v6, Landroid/graphics/Paint$Join;->ROUND:Landroid/graphics/Paint$Join;

    invoke-virtual {v2, v6}, Landroid/graphics/Paint;->setStrokeJoin(Landroid/graphics/Paint$Join;)V

    .line 222
    sget-object v6, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    invoke-virtual {v2, v6}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 223
    invoke-virtual {v2, v8}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 225
    mul-int/lit8 v6, p2, 0x6

    mul-int/lit8 v7, p2, 0x6

    sget-object v8, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v6, v7, v8}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v4

    .line 226
    .local v4, "shield":Landroid/graphics/Bitmap;
    new-instance v1, Landroid/graphics/Canvas;

    invoke-direct {v1, v4}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 227
    .local v1, "canvas":Landroid/graphics/Canvas;
    const/4 v6, 0x0

    invoke-virtual {v1, v6}, Landroid/graphics/Canvas;->drawColor(I)V

    .line 229
    int-to-float v6, p2

    mul-float/2addr v6, v9

    int-to-float v7, p2

    mul-float/2addr v7, v9

    invoke-virtual {v1, p1, v6, v7}, Landroid/graphics/Canvas;->rotate(FFF)V

    .line 231
    new-instance v3, Landroid/graphics/Path;

    invoke-direct {v3}, Landroid/graphics/Path;-><init>()V

    .line 232
    .local v3, "path":Landroid/graphics/Path;
    int-to-float v6, p2

    mul-float/2addr v6, v10

    int-to-float v7, p2

    mul-float/2addr v7, v9

    invoke-virtual {v3, v6, v7}, Landroid/graphics/Path;->moveTo(FF)V

    .line 233
    int-to-float v6, p2

    mul-float/2addr v6, v9

    int-to-float v7, p2

    mul-float/2addr v7, v10

    invoke-virtual {v3, v6, v7}, Landroid/graphics/Path;->lineTo(FF)V

    .line 234
    int-to-float v6, p2

    mul-float/2addr v6, v9

    int-to-float v7, p2

    mul-float/2addr v7, v11

    invoke-virtual {v3, v6, v7}, Landroid/graphics/Path;->lineTo(FF)V

    .line 235
    int-to-float v6, p2

    mul-float/2addr v6, v9

    int-to-float v7, p2

    mul-float/2addr v7, v10

    invoke-virtual {v3, v6, v7}, Landroid/graphics/Path;->lineTo(FF)V

    .line 236
    const/high16 v6, 0x40800000    # 4.0f

    int-to-float v7, p2

    mul-float/2addr v6, v7

    int-to-float v7, p2

    mul-float/2addr v7, v9

    invoke-virtual {v3, v6, v7}, Landroid/graphics/Path;->lineTo(FF)V

    .line 238
    const/4 v6, -0x1

    invoke-virtual {v2, v6}, Landroid/graphics/Paint;->setColor(I)V

    .line 239
    mul-float v6, v10, v0

    add-float/2addr v6, v5

    invoke-virtual {v2, v6}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 240
    invoke-virtual {v1, v3, v2}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 242
    invoke-virtual {v2, p0}, Landroid/graphics/Paint;->setColor(I)V

    .line 243
    invoke-virtual {v2, v5}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 244
    invoke-virtual {v1, v3, v2}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 246
    return-object v4
.end method

.method public static getPagination(III)Landroid/graphics/Bitmap;
    .locals 22
    .param p0, "count"    # I
    .param p1, "fontSize"    # I
    .param p2, "activeIndex"    # I

    .prologue
    .line 250
    div-int/lit8 v16, p1, 0x8

    .line 251
    .local v16, "padding":I
    mul-int/lit8 v3, v16, 0x2

    add-int v18, p1, v3

    .line 252
    .local v18, "size":I
    move/from16 v15, p1

    .line 254
    .local v15, "margin":I
    new-instance v1, Landroid/graphics/Paint;

    invoke-direct {v1}, Landroid/graphics/Paint;-><init>()V

    .line 255
    .local v1, "paint":Landroid/graphics/Paint;
    const/4 v3, 0x1

    invoke-virtual {v1, v3}, Landroid/graphics/Paint;->setDither(Z)V

    .line 256
    const/4 v3, 0x1

    invoke-virtual {v1, v3}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 257
    move/from16 v0, p1

    int-to-float v3, v0

    invoke-virtual {v1, v3}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 259
    add-int v3, v18, v15

    mul-int v3, v3, p0

    sub-int/2addr v3, v15

    add-int/lit8 v4, v18, 0x2

    sget-object v5, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v3, v4, v5}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v17

    .line 260
    .local v17, "pagination":Landroid/graphics/Bitmap;
    new-instance v7, Landroid/graphics/Canvas;

    move-object/from16 v0, v17

    invoke-direct {v7, v0}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 261
    .local v7, "canvas":Landroid/graphics/Canvas;
    const/4 v3, 0x0

    invoke-virtual {v7, v3}, Landroid/graphics/Canvas;->drawColor(I)V

    .line 263
    const/4 v14, 0x0

    .local v14, "i":I
    :goto_0
    move/from16 v0, p0

    if-lt v14, v0, :cond_0

    .line 288
    return-object v17

    .line 264
    :cond_0
    add-int v3, v18, v15

    mul-int v19, v3, v14

    .line 266
    .local v19, "x":I
    const/high16 v3, -0x1000000

    invoke-virtual {v1, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 267
    new-instance v3, Landroid/graphics/RectF;

    move/from16 v0, v19

    int-to-float v4, v0

    const/4 v5, 0x0

    add-int v8, v19, v18

    int-to-float v8, v8

    move/from16 v0, v18

    int-to-float v9, v0

    invoke-direct {v3, v4, v5, v8, v9}, Landroid/graphics/RectF;-><init>(FFFF)V

    const/high16 v4, 0x3f800000    # 1.0f

    const/high16 v5, 0x3f800000    # 1.0f

    invoke-virtual {v7, v3, v4, v5, v1}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 269
    move/from16 v0, p2

    if-ne v14, v0, :cond_1

    .line 270
    const/4 v3, -0x1

    invoke-virtual {v1, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 275
    :goto_1
    new-instance v3, Landroid/graphics/RectF;

    move/from16 v0, v19

    int-to-float v4, v0

    const/high16 v5, 0x40000000    # 2.0f

    add-int v8, v19, v18

    int-to-float v8, v8

    move/from16 v0, v18

    int-to-float v9, v0

    const/high16 v10, 0x40000000    # 2.0f

    add-float/2addr v9, v10

    invoke-direct {v3, v4, v5, v8, v9}, Landroid/graphics/RectF;-><init>(FFFF)V

    const/high16 v4, 0x40000000    # 2.0f

    const/high16 v5, 0x40000000    # 2.0f

    invoke-virtual {v7, v3, v4, v5, v1}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 277
    const/4 v3, 0x1

    new-array v2, v3, [C

    const/4 v3, 0x0

    add-int/lit8 v4, v14, 0x41

    int-to-char v4, v4

    aput-char v4, v2, v3

    .line 278
    .local v2, "text":[C
    const/high16 v3, -0x1000000

    invoke-virtual {v1, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 280
    const/4 v3, 0x2

    new-array v6, v3, [F

    .line 281
    .local v6, "dimensions":[F
    const/4 v3, 0x0

    const/4 v4, 0x1

    move/from16 v0, v18

    int-to-float v5, v0

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Paint;->breakText([CIIF[F)I

    .line 283
    move/from16 v0, v18

    int-to-float v3, v0

    const/4 v4, 0x0

    aget v4, v6, v4

    sub-float/2addr v3, v4

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v3, v4

    float-to-int v3, v3

    add-int v20, v3, v19

    .line 284
    .local v20, "xPos":I
    move/from16 v0, v18

    int-to-float v3, v0

    invoke-virtual {v1}, Landroid/graphics/Paint;->descent()F

    move-result v4

    sub-float/2addr v3, v4

    invoke-virtual {v1}, Landroid/graphics/Paint;->ascent()F

    move-result v4

    sub-float/2addr v3, v4

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v3, v4

    float-to-int v3, v3

    add-int/lit8 v21, v3, 0x3

    .line 285
    .local v21, "yPos":I
    const/4 v9, 0x0

    const/4 v10, 0x1

    move/from16 v0, v20

    int-to-float v11, v0

    move/from16 v0, v21

    int-to-float v12, v0

    move-object v8, v2

    move-object v13, v1

    invoke-virtual/range {v7 .. v13}, Landroid/graphics/Canvas;->drawText([CIIFFLandroid/graphics/Paint;)V

    .line 263
    add-int/lit8 v14, v14, 0x1

    goto/16 :goto_0

    .line 272
    .end local v2    # "text":[C
    .end local v6    # "dimensions":[F
    .end local v20    # "xPos":I
    .end local v21    # "yPos":I
    :cond_1
    const v3, -0x767677

    invoke-virtual {v1, v3}, Landroid/graphics/Paint;->setColor(I)V

    goto :goto_1
.end method

.method public static getPin(III)Landroid/graphics/Bitmap;
    .locals 7
    .param p0, "color"    # I
    .param p1, "whiteSize"    # I
    .param p2, "colorSize"    # I

    .prologue
    .line 94
    sget-object v4, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {p1, p1, v4}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v3

    .line 95
    .local v3, "pin":Landroid/graphics/Bitmap;
    new-instance v0, Landroid/graphics/Canvas;

    invoke-direct {v0, v3}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 97
    .local v0, "canvas":Landroid/graphics/Canvas;
    div-int/lit8 v1, p1, 0x2

    .line 99
    .local v1, "halfSize":I
    new-instance v2, Landroid/graphics/Paint;

    invoke-direct {v2}, Landroid/graphics/Paint;-><init>()V

    .line 100
    .local v2, "paint":Landroid/graphics/Paint;
    const/4 v4, 0x1

    invoke-virtual {v2, v4}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 101
    const/4 v4, -0x1

    invoke-virtual {v2, v4}, Landroid/graphics/Paint;->setColor(I)V

    .line 102
    const/4 v4, 0x0

    invoke-virtual {v0, v4}, Landroid/graphics/Canvas;->drawColor(I)V

    .line 103
    int-to-float v4, v1

    int-to-float v5, v1

    int-to-float v6, v1

    invoke-virtual {v0, v4, v5, v6, v2}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 105
    invoke-virtual {v2, p0}, Landroid/graphics/Paint;->setColor(I)V

    .line 106
    int-to-float v4, v1

    int-to-float v5, v1

    div-int/lit8 v6, p2, 0x2

    int-to-float v6, v6

    invoke-virtual {v0, v4, v5, v6, v2}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 108
    return-object v3
.end method

.method public static getShield(Landroid/graphics/Bitmap;Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;ILandroid/content/Context;)Landroid/graphics/Bitmap;
    .locals 16
    .param p0, "icon"    # Landroid/graphics/Bitmap;
    .param p1, "route"    # Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;
    .param p2, "size"    # I
    .param p3, "context"    # Landroid/content/Context;

    .prologue
    .line 150
    invoke-virtual/range {p0 .. p0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v11

    move/from16 v0, p2

    invoke-static {v0, v11}, Ljava/lang/Math;->min(II)I

    move-result v10

    .line 151
    .local v10, "width":I
    invoke-virtual/range {p0 .. p0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v11

    mul-int/2addr v11, v10

    invoke-virtual/range {p0 .. p0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v12

    div-int v4, v11, v12

    .line 152
    .local v4, "height":I
    move/from16 v0, p2

    int-to-float v11, v0

    const/high16 v12, 0x40a00000    # 5.0f

    div-float v5, v11, v12

    .line 153
    .local v5, "padding":F
    const/high16 v11, 0x40000000    # 2.0f

    div-float v1, v5, v11

    .line 154
    .local v1, "border":F
    invoke-virtual/range {p3 .. p3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v11

    const v12, 0x7f08001f

    invoke-virtual {v11, v12}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v7

    .line 156
    .local v7, "radius":F
    new-instance v6, Landroid/graphics/Paint;

    invoke-direct {v6}, Landroid/graphics/Paint;-><init>()V

    .line 157
    .local v6, "paint":Landroid/graphics/Paint;
    const/4 v11, 0x1

    invoke-virtual {v6, v11}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 158
    const/4 v11, 0x1

    invoke-virtual {v6, v11}, Landroid/graphics/Paint;->setDither(Z)V

    .line 160
    int-to-float v11, v10

    const/high16 v12, 0x40000000    # 2.0f

    add-float v13, v5, v1

    mul-float/2addr v12, v13

    add-float/2addr v11, v12

    float-to-int v11, v11

    .line 161
    int-to-float v12, v4

    const/high16 v13, 0x40000000    # 2.0f

    add-float v14, v5, v1

    mul-float/2addr v13, v14

    add-float/2addr v12, v13

    float-to-int v12, v12

    add-int/lit8 v12, v12, 0x2

    sget-object v13, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 160
    invoke-static {v11, v12, v13}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v9

    .line 162
    .local v9, "shield":Landroid/graphics/Bitmap;
    new-instance v2, Landroid/graphics/Canvas;

    invoke-direct {v2, v9}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 163
    .local v2, "canvas":Landroid/graphics/Canvas;
    const/4 v11, 0x0

    invoke-virtual {v2, v11}, Landroid/graphics/Canvas;->drawColor(I)V

    .line 165
    new-instance v8, Landroid/graphics/RectF;

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-virtual {v2}, Landroid/graphics/Canvas;->getWidth()I

    move-result v13

    int-to-float v13, v13

    invoke-virtual {v2}, Landroid/graphics/Canvas;->getHeight()I

    move-result v14

    int-to-float v14, v14

    invoke-direct {v8, v11, v12, v13, v14}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 166
    .local v8, "rect":Landroid/graphics/RectF;
    const/high16 v11, 0x55000000

    invoke-virtual {v6, v11}, Landroid/graphics/Paint;->setColor(I)V

    .line 167
    invoke-virtual {v2, v8, v7, v7, v6}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 169
    new-instance v8, Landroid/graphics/RectF;

    .end local v8    # "rect":Landroid/graphics/RectF;
    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-virtual {v2}, Landroid/graphics/Canvas;->getWidth()I

    move-result v13

    int-to-float v13, v13

    invoke-virtual {v2}, Landroid/graphics/Canvas;->getHeight()I

    move-result v14

    add-int/lit8 v14, v14, -0x2

    int-to-float v14, v14

    invoke-direct {v8, v11, v12, v13, v14}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 170
    .restart local v8    # "rect":Landroid/graphics/RectF;
    const/4 v11, -0x1

    invoke-virtual {v6, v11}, Landroid/graphics/Paint;->setColor(I)V

    .line 171
    invoke-virtual {v2, v8, v7, v7, v6}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 173
    new-instance v8, Landroid/graphics/RectF;

    .end local v8    # "rect":Landroid/graphics/RectF;
    invoke-virtual {v2}, Landroid/graphics/Canvas;->getWidth()I

    move-result v11

    int-to-float v11, v11

    sub-float/2addr v11, v1

    invoke-virtual {v2}, Landroid/graphics/Canvas;->getHeight()I

    move-result v12

    int-to-float v12, v12

    sub-float/2addr v12, v1

    const/high16 v13, 0x40000000    # 2.0f

    sub-float/2addr v12, v13

    invoke-direct {v8, v1, v1, v11, v12}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 174
    .restart local v8    # "rect":Landroid/graphics/RectF;
    invoke-virtual/range {p1 .. p1}, Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;->getColor()I

    move-result v11

    invoke-virtual {v6, v11}, Landroid/graphics/Paint;->setColor(I)V

    .line 175
    const/high16 v11, 0x40000000    # 2.0f

    div-float v11, v7, v11

    const/high16 v12, 0x40000000    # 2.0f

    div-float v12, v7, v12

    invoke-virtual {v2, v8, v11, v12, v6}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 177
    new-instance v3, Landroid/graphics/RectF;

    add-float v11, v5, v1

    add-float v12, v5, v1

    invoke-virtual {v2}, Landroid/graphics/Canvas;->getWidth()I

    move-result v13

    int-to-float v13, v13

    sub-float/2addr v13, v1

    sub-float/2addr v13, v5

    .line 178
    invoke-virtual {v2}, Landroid/graphics/Canvas;->getHeight()I

    move-result v14

    int-to-float v14, v14

    sub-float/2addr v14, v1

    sub-float/2addr v14, v5

    const/high16 v15, 0x40000000    # 2.0f

    sub-float/2addr v14, v15

    .line 177
    invoke-direct {v3, v11, v12, v13, v14}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 179
    .local v3, "dst":Landroid/graphics/RectF;
    new-instance v11, Landroid/graphics/PorterDuffColorFilter;

    invoke-virtual/range {p1 .. p1}, Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;->getTextColor()I

    move-result v12

    sget-object v13, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v11, v12, v13}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {v6, v11}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    .line 180
    const/4 v11, 0x1

    invoke-virtual {v6, v11}, Landroid/graphics/Paint;->setFilterBitmap(Z)V

    .line 181
    const/4 v11, 0x0

    move-object/from16 v0, p0

    invoke-virtual {v2, v0, v11, v3, v6}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    .line 183
    return-object v9
.end method

.method public static getShield(Ljava/lang/String;Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;ILandroid/content/Context;)Landroid/graphics/Bitmap;
    .locals 15
    .param p0, "text"    # Ljava/lang/String;
    .param p1, "route"    # Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;
    .param p2, "size"    # I
    .param p3, "context"    # Landroid/content/Context;

    .prologue
    .line 112
    const/4 v11, 0x2

    new-array v3, v11, [F

    .line 113
    .local v3, "dimensions":[F
    move/from16 v0, p2

    int-to-float v11, v0

    const/high16 v12, 0x40a00000    # 5.0f

    div-float v4, v11, v12

    .line 114
    .local v4, "padding":F
    const/high16 v11, 0x40000000    # 2.0f

    div-float v1, v4, v11

    .line 115
    .local v1, "border":F
    invoke-virtual/range {p3 .. p3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v11

    const v12, 0x7f08001f

    invoke-virtual {v11, v12}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v6

    .line 117
    .local v6, "radius":F
    new-instance v5, Landroid/graphics/Paint;

    invoke-direct {v5}, Landroid/graphics/Paint;-><init>()V

    .line 118
    .local v5, "paint":Landroid/graphics/Paint;
    const/4 v11, 0x1

    invoke-virtual {v5, v11}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 119
    move/from16 v0, p2

    int-to-float v11, v0

    invoke-virtual {v5, v11}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 120
    invoke-static/range {p3 .. p3}, Lcom/thetransitapp/droid/util/FontUtility;->getInterstateBold(Landroid/content/Context;)Landroid/graphics/Typeface;

    move-result-object v11

    invoke-virtual {v5, v11}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 121
    const/4 v11, 0x1

    mul-int/lit8 v12, p2, 0xa

    int-to-float v12, v12

    invoke-virtual {v5, p0, v11, v12, v3}, Landroid/graphics/Paint;->breakText(Ljava/lang/String;ZF[F)I

    .line 123
    const/4 v11, 0x0

    aget v11, v3, v11

    const/high16 v12, 0x40000000    # 2.0f

    add-float v13, v4, v1

    mul-float/2addr v12, v13

    add-float/2addr v11, v12

    float-to-int v11, v11

    .line 124
    move/from16 v0, p2

    int-to-float v12, v0

    const/high16 v13, 0x40000000    # 2.0f

    add-float v14, v4, v1

    mul-float/2addr v13, v14

    add-float/2addr v12, v13

    float-to-int v12, v12

    sget-object v13, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 123
    invoke-static {v11, v12, v13}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v8

    .line 125
    .local v8, "shield":Landroid/graphics/Bitmap;
    new-instance v2, Landroid/graphics/Canvas;

    invoke-direct {v2, v8}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 126
    .local v2, "canvas":Landroid/graphics/Canvas;
    const/4 v11, 0x0

    invoke-virtual {v2, v11}, Landroid/graphics/Canvas;->drawColor(I)V

    .line 128
    new-instance v7, Landroid/graphics/RectF;

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-virtual {v2}, Landroid/graphics/Canvas;->getWidth()I

    move-result v13

    int-to-float v13, v13

    invoke-virtual {v2}, Landroid/graphics/Canvas;->getHeight()I

    move-result v14

    int-to-float v14, v14

    invoke-direct {v7, v11, v12, v13, v14}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 129
    .local v7, "rect":Landroid/graphics/RectF;
    const/high16 v11, 0x55000000

    invoke-virtual {v5, v11}, Landroid/graphics/Paint;->setColor(I)V

    .line 130
    invoke-virtual {v2, v7, v6, v6, v5}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 132
    new-instance v7, Landroid/graphics/RectF;

    .end local v7    # "rect":Landroid/graphics/RectF;
    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-virtual {v2}, Landroid/graphics/Canvas;->getWidth()I

    move-result v13

    int-to-float v13, v13

    invoke-virtual {v2}, Landroid/graphics/Canvas;->getHeight()I

    move-result v14

    add-int/lit8 v14, v14, -0x2

    int-to-float v14, v14

    invoke-direct {v7, v11, v12, v13, v14}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 133
    .restart local v7    # "rect":Landroid/graphics/RectF;
    const/4 v11, -0x1

    invoke-virtual {v5, v11}, Landroid/graphics/Paint;->setColor(I)V

    .line 134
    invoke-virtual {v2, v7, v6, v6, v5}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 136
    new-instance v7, Landroid/graphics/RectF;

    .end local v7    # "rect":Landroid/graphics/RectF;
    invoke-virtual {v2}, Landroid/graphics/Canvas;->getWidth()I

    move-result v11

    int-to-float v11, v11

    sub-float/2addr v11, v1

    invoke-virtual {v2}, Landroid/graphics/Canvas;->getHeight()I

    move-result v12

    int-to-float v12, v12

    sub-float/2addr v12, v1

    const/high16 v13, 0x40000000    # 2.0f

    sub-float/2addr v12, v13

    invoke-direct {v7, v1, v1, v11, v12}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 137
    .restart local v7    # "rect":Landroid/graphics/RectF;
    invoke-virtual/range {p1 .. p1}, Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;->getColor()I

    move-result v11

    invoke-virtual {v5, v11}, Landroid/graphics/Paint;->setColor(I)V

    .line 138
    const/high16 v11, 0x40000000    # 2.0f

    div-float v11, v6, v11

    const/high16 v12, 0x40000000    # 2.0f

    div-float v12, v6, v12

    invoke-virtual {v2, v7, v11, v12, v5}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 140
    invoke-virtual/range {p1 .. p1}, Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;->getTextColor()I

    move-result v11

    invoke-virtual {v5, v11}, Landroid/graphics/Paint;->setColor(I)V

    .line 141
    invoke-virtual {v2}, Landroid/graphics/Canvas;->getWidth()I

    move-result v11

    int-to-float v11, v11

    const/4 v12, 0x0

    aget v12, v3, v12

    sub-float/2addr v11, v12

    const/high16 v12, 0x40000000    # 2.0f

    div-float/2addr v11, v12

    float-to-int v9, v11

    .line 142
    .local v9, "xPos":I
    invoke-virtual {v2}, Landroid/graphics/Canvas;->getHeight()I

    move-result v11

    int-to-float v11, v11

    invoke-virtual {v5}, Landroid/graphics/Paint;->descent()F

    move-result v12

    sub-float/2addr v11, v12

    invoke-virtual {v5}, Landroid/graphics/Paint;->ascent()F

    move-result v12

    sub-float/2addr v11, v12

    const/high16 v12, 0x40000000    # 2.0f

    div-float/2addr v11, v12

    float-to-int v10, v11

    .line 143
    .local v10, "yPos":I
    const v11, 0x3dcccccd    # 0.1f

    const/4 v12, 0x0

    invoke-virtual/range {p1 .. p1}, Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;->getTextShadowOffset()F

    move-result v13

    invoke-virtual/range {p1 .. p1}, Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;->getShadowColor()I

    move-result v14

    invoke-virtual {v5, v11, v12, v13, v14}, Landroid/graphics/Paint;->setShadowLayer(FFFI)V

    .line 144
    int-to-float v11, v9

    int-to-float v12, v10

    invoke-virtual {v2, p0, v11, v12, v5}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 146
    return-object v8
.end method

.method public static getStepIcon(III)Landroid/graphics/Bitmap;
    .locals 11
    .param p0, "color"    # I
    .param p1, "width"    # I
    .param p2, "height"    # I

    .prologue
    const/high16 v10, -0x1000000

    .line 187
    div-int/lit8 v6, p1, 0x2

    .line 188
    .local v6, "halfSize":I
    div-int/lit8 v9, p1, 0x4

    .line 189
    .local v9, "quartSize":I
    const/4 v8, 0x2

    .line 191
    .local v8, "pad":I
    new-instance v5, Landroid/graphics/Paint;

    invoke-direct {v5}, Landroid/graphics/Paint;-><init>()V

    .line 192
    .local v5, "paint":Landroid/graphics/Paint;
    const/4 v1, 0x1

    invoke-virtual {v5, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 194
    sget-object v1, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {p1, p2, v1}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v7

    .line 195
    .local v7, "icon":Landroid/graphics/Bitmap;
    new-instance v0, Landroid/graphics/Canvas;

    invoke-direct {v0, v7}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 196
    .local v0, "canvas":Landroid/graphics/Canvas;
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/graphics/Canvas;->drawColor(I)V

    .line 198
    invoke-virtual {v5, v10}, Landroid/graphics/Paint;->setColor(I)V

    .line 199
    int-to-float v1, v9

    int-to-float v2, v6

    sub-int v3, p1, v9

    int-to-float v3, v3

    sub-int v4, p2, v6

    int-to-float v4, v4

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 200
    invoke-virtual {v5, p0}, Landroid/graphics/Paint;->setColor(I)V

    .line 201
    add-int v1, v9, v8

    int-to-float v1, v1

    int-to-float v2, v6

    sub-int v3, p1, v9

    sub-int/2addr v3, v8

    int-to-float v3, v3

    sub-int v4, p2, v6

    int-to-float v4, v4

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 203
    invoke-virtual {v5, v10}, Landroid/graphics/Paint;->setColor(I)V

    .line 204
    int-to-float v1, v6

    int-to-float v2, v6

    int-to-float v3, v6

    invoke-virtual {v0, v1, v2, v3, v5}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 205
    int-to-float v1, v6

    sub-int v2, p2, v6

    int-to-float v2, v2

    int-to-float v3, v6

    invoke-virtual {v0, v1, v2, v3, v5}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 207
    invoke-virtual {v5, p0}, Landroid/graphics/Paint;->setColor(I)V

    .line 208
    int-to-float v1, v6

    int-to-float v2, v6

    sub-int v3, v6, v8

    int-to-float v3, v3

    invoke-virtual {v0, v1, v2, v3, v5}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 209
    int-to-float v1, v6

    sub-int v2, p2, v6

    int-to-float v2, v2

    sub-int v3, v6, v8

    int-to-float v3, v3

    invoke-virtual {v0, v1, v2, v3, v5}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 211
    return-object v7
.end method
