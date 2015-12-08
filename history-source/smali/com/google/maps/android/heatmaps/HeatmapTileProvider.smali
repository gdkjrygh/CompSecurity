.class public Lcom/google/maps/android/heatmaps/HeatmapTileProvider;
.super Ljava/lang/Object;
.source "HeatmapTileProvider.java"

# interfaces
.implements Lcom/google/android/gms/maps/model/TileProvider;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/maps/android/heatmaps/HeatmapTileProvider$1;,
        Lcom/google/maps/android/heatmaps/HeatmapTileProvider$Builder;
    }
.end annotation


# static fields
.field public static final DEFAULT_GRADIENT:Lcom/google/maps/android/heatmaps/Gradient;

.field private static final DEFAULT_GRADIENT_COLORS:[I

.field private static final DEFAULT_GRADIENT_START_POINTS:[F

.field private static final DEFAULT_MAX_ZOOM:I = 0xb

.field private static final DEFAULT_MIN_ZOOM:I = 0x5

.field public static final DEFAULT_OPACITY:D = 0.7

.field public static final DEFAULT_RADIUS:I = 0x14

.field private static final MAX_RADIUS:I = 0x32

.field private static final MAX_ZOOM_LEVEL:I = 0x16

.field private static final MIN_RADIUS:I = 0xa

.field private static final SCREEN_SIZE:I = 0x500

.field private static final TILE_DIM:I = 0x200

.field static final WORLD_WIDTH:D = 1.0


# instance fields
.field private mBounds:Lcom/google/maps/android/geometry/Bounds;

.field private mColorMap:[I

.field private mData:Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Collection",
            "<",
            "Lcom/google/maps/android/heatmaps/WeightedLatLng;",
            ">;"
        }
    .end annotation
.end field

.field private mGradient:Lcom/google/maps/android/heatmaps/Gradient;

.field private mKernel:[D

.field private mMaxIntensity:[D

.field private mOpacity:D

.field private mRadius:I

.field private mTree:Lcom/google/maps/android/quadtree/PointQuadTree;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/maps/android/quadtree/PointQuadTree",
            "<",
            "Lcom/google/maps/android/heatmaps/WeightedLatLng;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .prologue
    const/4 v4, 0x2

    const/4 v3, 0x0

    .line 54
    new-array v0, v4, [I

    const/16 v1, 0x66

    const/16 v2, 0xe1

    invoke-static {v1, v2, v3}, Landroid/graphics/Color;->rgb(III)I

    move-result v1

    aput v1, v0, v3

    const/4 v1, 0x1

    const/16 v2, 0xff

    invoke-static {v2, v3, v3}, Landroid/graphics/Color;->rgb(III)I

    move-result v2

    aput v2, v0, v1

    sput-object v0, Lcom/google/maps/android/heatmaps/HeatmapTileProvider;->DEFAULT_GRADIENT_COLORS:[I

    .line 64
    new-array v0, v4, [F

    fill-array-data v0, :array_0

    sput-object v0, Lcom/google/maps/android/heatmaps/HeatmapTileProvider;->DEFAULT_GRADIENT_START_POINTS:[F

    .line 71
    new-instance v0, Lcom/google/maps/android/heatmaps/Gradient;

    sget-object v1, Lcom/google/maps/android/heatmaps/HeatmapTileProvider;->DEFAULT_GRADIENT_COLORS:[I

    sget-object v2, Lcom/google/maps/android/heatmaps/HeatmapTileProvider;->DEFAULT_GRADIENT_START_POINTS:[F

    invoke-direct {v0, v1, v2}, Lcom/google/maps/android/heatmaps/Gradient;-><init>([I[F)V

    sput-object v0, Lcom/google/maps/android/heatmaps/HeatmapTileProvider;->DEFAULT_GRADIENT:Lcom/google/maps/android/heatmaps/Gradient;

    return-void

    .line 64
    :array_0
    .array-data 4
        0x3e4ccccd    # 0.2f
        0x3f800000    # 1.0f
    .end array-data
.end method

.method private constructor <init>(Lcom/google/maps/android/heatmaps/HeatmapTileProvider$Builder;)V
    .locals 5
    .param p1, "builder"    # Lcom/google/maps/android/heatmaps/HeatmapTileProvider$Builder;

    .prologue
    .line 266
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 268
    # getter for: Lcom/google/maps/android/heatmaps/HeatmapTileProvider$Builder;->data:Ljava/util/Collection;
    invoke-static {p1}, Lcom/google/maps/android/heatmaps/HeatmapTileProvider$Builder;->access$200(Lcom/google/maps/android/heatmaps/HeatmapTileProvider$Builder;)Ljava/util/Collection;

    move-result-object v0

    iput-object v0, p0, Lcom/google/maps/android/heatmaps/HeatmapTileProvider;->mData:Ljava/util/Collection;

    .line 270
    # getter for: Lcom/google/maps/android/heatmaps/HeatmapTileProvider$Builder;->radius:I
    invoke-static {p1}, Lcom/google/maps/android/heatmaps/HeatmapTileProvider$Builder;->access$300(Lcom/google/maps/android/heatmaps/HeatmapTileProvider$Builder;)I

    move-result v0

    iput v0, p0, Lcom/google/maps/android/heatmaps/HeatmapTileProvider;->mRadius:I

    .line 271
    # getter for: Lcom/google/maps/android/heatmaps/HeatmapTileProvider$Builder;->gradient:Lcom/google/maps/android/heatmaps/Gradient;
    invoke-static {p1}, Lcom/google/maps/android/heatmaps/HeatmapTileProvider$Builder;->access$400(Lcom/google/maps/android/heatmaps/HeatmapTileProvider$Builder;)Lcom/google/maps/android/heatmaps/Gradient;

    move-result-object v0

    iput-object v0, p0, Lcom/google/maps/android/heatmaps/HeatmapTileProvider;->mGradient:Lcom/google/maps/android/heatmaps/Gradient;

    .line 272
    # getter for: Lcom/google/maps/android/heatmaps/HeatmapTileProvider$Builder;->opacity:D
    invoke-static {p1}, Lcom/google/maps/android/heatmaps/HeatmapTileProvider$Builder;->access$500(Lcom/google/maps/android/heatmaps/HeatmapTileProvider$Builder;)D

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/maps/android/heatmaps/HeatmapTileProvider;->mOpacity:D

    .line 275
    iget v0, p0, Lcom/google/maps/android/heatmaps/HeatmapTileProvider;->mRadius:I

    iget v1, p0, Lcom/google/maps/android/heatmaps/HeatmapTileProvider;->mRadius:I

    int-to-double v1, v1

    const-wide/high16 v3, 0x4008000000000000L    # 3.0

    div-double/2addr v1, v3

    invoke-static {v0, v1, v2}, Lcom/google/maps/android/heatmaps/HeatmapTileProvider;->generateKernel(ID)[D

    move-result-object v0

    iput-object v0, p0, Lcom/google/maps/android/heatmaps/HeatmapTileProvider;->mKernel:[D

    .line 278
    iget-object v0, p0, Lcom/google/maps/android/heatmaps/HeatmapTileProvider;->mGradient:Lcom/google/maps/android/heatmaps/Gradient;

    invoke-virtual {p0, v0}, Lcom/google/maps/android/heatmaps/HeatmapTileProvider;->setGradient(Lcom/google/maps/android/heatmaps/Gradient;)V

    .line 281
    iget-object v0, p0, Lcom/google/maps/android/heatmaps/HeatmapTileProvider;->mData:Ljava/util/Collection;

    invoke-virtual {p0, v0}, Lcom/google/maps/android/heatmaps/HeatmapTileProvider;->setWeightedData(Ljava/util/Collection;)V

    .line 282
    return-void
.end method

.method synthetic constructor <init>(Lcom/google/maps/android/heatmaps/HeatmapTileProvider$Builder;Lcom/google/maps/android/heatmaps/HeatmapTileProvider$1;)V
    .locals 0
    .param p1, "x0"    # Lcom/google/maps/android/heatmaps/HeatmapTileProvider$Builder;
    .param p2, "x1"    # Lcom/google/maps/android/heatmaps/HeatmapTileProvider$1;

    .prologue
    .line 38
    invoke-direct {p0, p1}, Lcom/google/maps/android/heatmaps/HeatmapTileProvider;-><init>(Lcom/google/maps/android/heatmaps/HeatmapTileProvider$Builder;)V

    return-void
.end method

.method static synthetic access$000(Ljava/util/Collection;)Ljava/util/Collection;
    .locals 1
    .param p0, "x0"    # Ljava/util/Collection;

    .prologue
    .line 38
    invoke-static {p0}, Lcom/google/maps/android/heatmaps/HeatmapTileProvider;->wrapData(Ljava/util/Collection;)Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method

.method static colorize([[D[ID)Landroid/graphics/Bitmap;
    .locals 18
    .param p0, "grid"    # [[D
    .param p1, "colorMap"    # [I
    .param p2, "max"    # D

    .prologue
    .line 678
    move-object/from16 v0, p1

    array-length v3, v0

    add-int/lit8 v3, v3, -0x1

    aget v15, p1, v3

    .line 680
    .local v15, "maxColor":I
    move-object/from16 v0, p1

    array-length v3, v0

    add-int/lit8 v3, v3, -0x1

    int-to-double v5, v3

    div-double v10, v5, p2

    .line 682
    .local v10, "colorMapScaling":D
    move-object/from16 v0, p0

    array-length v4, v0

    .line 687
    .local v4, "dim":I
    mul-int v3, v4, v4

    new-array v2, v3, [I

    .line 688
    .local v2, "colors":[I
    const/4 v12, 0x0

    .local v12, "i":I
    :goto_0
    if-ge v12, v4, :cond_3

    .line 689
    const/4 v14, 0x0

    .local v14, "j":I
    :goto_1
    if-ge v14, v4, :cond_2

    .line 693
    aget-object v3, p0, v14

    aget-wide v16, v3, v12

    .line 694
    .local v16, "val":D
    mul-int v3, v12, v4

    add-int v13, v3, v14

    .line 695
    .local v13, "index":I
    mul-double v5, v16, v10

    double-to-int v9, v5

    .line 697
    .local v9, "col":I
    const-wide/16 v5, 0x0

    cmpl-double v3, v16, v5

    if-eqz v3, :cond_1

    .line 699
    move-object/from16 v0, p1

    array-length v3, v0

    if-ge v9, v3, :cond_0

    aget v3, p1, v9

    aput v3, v2, v13

    .line 689
    :goto_2
    add-int/lit8 v14, v14, 0x1

    goto :goto_1

    .line 700
    :cond_0
    aput v15, v2, v13

    goto :goto_2

    .line 702
    :cond_1
    const/4 v3, 0x0

    aput v3, v2, v13

    goto :goto_2

    .line 688
    .end local v9    # "col":I
    .end local v13    # "index":I
    .end local v16    # "val":D
    :cond_2
    add-int/lit8 v12, v12, 0x1

    goto :goto_0

    .line 708
    .end local v14    # "j":I
    :cond_3
    sget-object v3, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v4, v4, v3}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 710
    .local v1, "tile":Landroid/graphics/Bitmap;
    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move v7, v4

    move v8, v4

    invoke-virtual/range {v1 .. v8}, Landroid/graphics/Bitmap;->setPixels([IIIIIII)V

    .line 711
    return-object v1
.end method

.method private static convertBitmap(Landroid/graphics/Bitmap;)Lcom/google/android/gms/maps/model/Tile;
    .locals 5
    .param p0, "bitmap"    # Landroid/graphics/Bitmap;

    .prologue
    const/16 v4, 0x200

    .line 532
    new-instance v1, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 533
    .local v1, "stream":Ljava/io/ByteArrayOutputStream;
    sget-object v2, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    const/16 v3, 0x64

    invoke-virtual {p0, v2, v3, v1}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    .line 534
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    .line 535
    .local v0, "bitmapdata":[B
    new-instance v2, Lcom/google/android/gms/maps/model/Tile;

    invoke-direct {v2, v4, v4, v0}, Lcom/google/android/gms/maps/model/Tile;-><init>(II[B)V

    return-object v2
.end method

.method static convolve([[D[D)[[D
    .locals 24
    .param p0, "grid"    # [[D
    .param p1, "kernel"    # [D

    .prologue
    .line 598
    move-object/from16 v0, p1

    array-length v0, v0

    move/from16 v18, v0

    move/from16 v0, v18

    int-to-double v0, v0

    move-wide/from16 v18, v0

    const-wide/high16 v20, 0x4000000000000000L    # 2.0

    div-double v18, v18, v20

    invoke-static/range {v18 .. v19}, Ljava/lang/Math;->floor(D)D

    move-result-wide v18

    move-wide/from16 v0, v18

    double-to-int v8, v0

    .line 600
    .local v8, "radius":I
    move-object/from16 v0, p0

    array-length v3, v0

    .line 602
    .local v3, "dimOld":I
    mul-int/lit8 v18, v8, 0x2

    sub-int v2, v3, v18

    .line 605
    .local v2, "dim":I
    move v6, v8

    .line 606
    .local v6, "lowerLimit":I
    add-int v18, v8, v2

    add-int/lit8 v9, v18, -0x1

    .line 609
    .local v9, "upperLimit":I
    filled-new-array {v3, v3}, [I

    move-result-object v18

    sget-object v19, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    move-object/from16 v0, v19

    move-object/from16 v1, v18

    invoke-static {v0, v1}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, [[D

    .line 615
    .local v5, "intermediate":[[D
    const/4 v12, 0x0

    .local v12, "x":I
    :goto_0
    if-ge v12, v3, :cond_4

    .line 616
    const/4 v15, 0x0

    .local v15, "y":I
    :goto_1
    if-ge v15, v3, :cond_3

    .line 618
    aget-object v18, p0, v12

    aget-wide v10, v18, v15

    .line 620
    .local v10, "val":D
    const-wide/16 v18, 0x0

    cmpl-double v18, v10, v18

    if-eqz v18, :cond_2

    .line 623
    add-int v18, v12, v8

    move/from16 v0, v18

    if-ge v9, v0, :cond_0

    move/from16 v18, v9

    :goto_2
    add-int/lit8 v14, v18, 0x1

    .line 625
    .local v14, "xUpperLimit":I
    sub-int v18, v12, v8

    move/from16 v0, v18

    if-le v6, v0, :cond_1

    move v4, v6

    .line 626
    .local v4, "initial":I
    :goto_3
    move v13, v4

    .local v13, "x2":I
    :goto_4
    if-ge v13, v14, :cond_2

    .line 630
    aget-object v18, v5, v13

    aget-wide v19, v18, v15

    sub-int v21, v12, v8

    sub-int v21, v13, v21

    aget-wide v21, p1, v21

    mul-double v21, v21, v10

    add-double v19, v19, v21

    aput-wide v19, v18, v15

    .line 626
    add-int/lit8 v13, v13, 0x1

    goto :goto_4

    .line 623
    .end local v4    # "initial":I
    .end local v13    # "x2":I
    .end local v14    # "xUpperLimit":I
    :cond_0
    add-int v18, v12, v8

    goto :goto_2

    .line 625
    .restart local v14    # "xUpperLimit":I
    :cond_1
    sub-int v4, v12, v8

    goto :goto_3

    .line 616
    .end local v14    # "xUpperLimit":I
    :cond_2
    add-int/lit8 v15, v15, 0x1

    goto :goto_1

    .line 615
    .end local v10    # "val":D
    :cond_3
    add-int/lit8 v12, v12, 0x1

    goto :goto_0

    .line 637
    .end local v15    # "y":I
    :cond_4
    filled-new-array {v2, v2}, [I

    move-result-object v18

    sget-object v19, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    move-object/from16 v0, v19

    move-object/from16 v1, v18

    invoke-static {v0, v1}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, [[D

    .line 644
    .local v7, "outputGrid":[[D
    move v12, v6

    :goto_5
    add-int/lit8 v18, v9, 0x1

    move/from16 v0, v18

    if-ge v12, v0, :cond_9

    .line 645
    const/4 v15, 0x0

    .restart local v15    # "y":I
    :goto_6
    if-ge v15, v3, :cond_8

    .line 647
    aget-object v18, v5, v12

    aget-wide v10, v18, v15

    .line 649
    .restart local v10    # "val":D
    const-wide/16 v18, 0x0

    cmpl-double v18, v10, v18

    if-eqz v18, :cond_7

    .line 653
    add-int v18, v15, v8

    move/from16 v0, v18

    if-ge v9, v0, :cond_5

    move/from16 v18, v9

    :goto_7
    add-int/lit8 v17, v18, 0x1

    .line 655
    .local v17, "yUpperLimit":I
    sub-int v18, v15, v8

    move/from16 v0, v18

    if-le v6, v0, :cond_6

    move v4, v6

    .line 656
    .restart local v4    # "initial":I
    :goto_8
    move/from16 v16, v4

    .local v16, "y2":I
    :goto_9
    move/from16 v0, v16

    move/from16 v1, v17

    if-ge v0, v1, :cond_7

    .line 659
    sub-int v18, v12, v8

    aget-object v18, v7, v18

    sub-int v19, v16, v8

    aget-wide v20, v18, v19

    sub-int v22, v15, v8

    sub-int v22, v16, v22

    aget-wide v22, p1, v22

    mul-double v22, v22, v10

    add-double v20, v20, v22

    aput-wide v20, v18, v19

    .line 656
    add-int/lit8 v16, v16, 0x1

    goto :goto_9

    .line 653
    .end local v4    # "initial":I
    .end local v16    # "y2":I
    .end local v17    # "yUpperLimit":I
    :cond_5
    add-int v18, v15, v8

    goto :goto_7

    .line 655
    .restart local v17    # "yUpperLimit":I
    :cond_6
    sub-int v4, v15, v8

    goto :goto_8

    .line 645
    .end local v17    # "yUpperLimit":I
    :cond_7
    add-int/lit8 v15, v15, 0x1

    goto :goto_6

    .line 644
    .end local v10    # "val":D
    :cond_8
    add-int/lit8 v12, v12, 0x1

    goto :goto_5

    .line 665
    .end local v15    # "y":I
    :cond_9
    return-object v7
.end method

.method static generateKernel(ID)[D
    .locals 7
    .param p0, "radius"    # I
    .param p1, "sd"    # D

    .prologue
    .line 581
    mul-int/lit8 v2, p0, 0x2

    add-int/lit8 v2, v2, 0x1

    new-array v1, v2, [D

    .line 582
    .local v1, "kernel":[D
    neg-int v0, p0

    .local v0, "i":I
    :goto_0
    if-gt v0, p0, :cond_0

    .line 583
    add-int v2, v0, p0

    neg-int v3, v0

    mul-int/2addr v3, v0

    int-to-double v3, v3

    const-wide/high16 v5, 0x4000000000000000L    # 2.0

    mul-double/2addr v5, p1

    mul-double/2addr v5, p1

    div-double/2addr v3, v5

    invoke-static {v3, v4}, Ljava/lang/Math;->exp(D)D

    move-result-wide v3

    aput-wide v3, v1, v2

    .line 582
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 585
    :cond_0
    return-object v1
.end method

.method static getBounds(Ljava/util/Collection;)Lcom/google/maps/android/geometry/Bounds;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<",
            "Lcom/google/maps/android/heatmaps/WeightedLatLng;",
            ">;)",
            "Lcom/google/maps/android/geometry/Bounds;"
        }
    .end annotation

    .prologue
    .line 549
    .local p0, "points":Ljava/util/Collection;, "Ljava/util/Collection<Lcom/google/maps/android/heatmaps/WeightedLatLng;>;"
    invoke-interface/range {p0 .. p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v10

    .line 551
    .local v10, "iter":Ljava/util/Iterator;, "Ljava/util/Iterator<Lcom/google/maps/android/heatmaps/WeightedLatLng;>;"
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/google/maps/android/heatmaps/WeightedLatLng;

    .line 553
    .local v9, "first":Lcom/google/maps/android/heatmaps/WeightedLatLng;
    invoke-virtual {v9}, Lcom/google/maps/android/heatmaps/WeightedLatLng;->getPoint()Lcom/google/maps/android/geometry/Point;

    move-result-object v0

    iget-wide v1, v0, Lcom/google/maps/android/geometry/Point;->x:D

    .line 554
    .local v1, "minX":D
    invoke-virtual {v9}, Lcom/google/maps/android/heatmaps/WeightedLatLng;->getPoint()Lcom/google/maps/android/geometry/Point;

    move-result-object v0

    iget-wide v3, v0, Lcom/google/maps/android/geometry/Point;->x:D

    .line 555
    .local v3, "maxX":D
    invoke-virtual {v9}, Lcom/google/maps/android/heatmaps/WeightedLatLng;->getPoint()Lcom/google/maps/android/geometry/Point;

    move-result-object v0

    iget-wide v5, v0, Lcom/google/maps/android/geometry/Point;->y:D

    .line 556
    .local v5, "minY":D
    invoke-virtual {v9}, Lcom/google/maps/android/heatmaps/WeightedLatLng;->getPoint()Lcom/google/maps/android/geometry/Point;

    move-result-object v0

    iget-wide v7, v0, Lcom/google/maps/android/geometry/Point;->y:D

    .line 558
    .local v7, "maxY":D
    :cond_0
    :goto_0
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 559
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/google/maps/android/heatmaps/WeightedLatLng;

    .line 560
    .local v11, "l":Lcom/google/maps/android/heatmaps/WeightedLatLng;
    invoke-virtual {v11}, Lcom/google/maps/android/heatmaps/WeightedLatLng;->getPoint()Lcom/google/maps/android/geometry/Point;

    move-result-object v0

    iget-wide v12, v0, Lcom/google/maps/android/geometry/Point;->x:D

    .line 561
    .local v12, "x":D
    invoke-virtual {v11}, Lcom/google/maps/android/heatmaps/WeightedLatLng;->getPoint()Lcom/google/maps/android/geometry/Point;

    move-result-object v0

    iget-wide v14, v0, Lcom/google/maps/android/geometry/Point;->y:D

    .line 563
    .local v14, "y":D
    cmpg-double v0, v12, v1

    if-gez v0, :cond_1

    move-wide v1, v12

    .line 564
    :cond_1
    cmpl-double v0, v12, v3

    if-lez v0, :cond_2

    move-wide v3, v12

    .line 565
    :cond_2
    cmpg-double v0, v14, v5

    if-gez v0, :cond_3

    move-wide v5, v14

    .line 566
    :cond_3
    cmpl-double v0, v14, v7

    if-lez v0, :cond_0

    move-wide v7, v14

    goto :goto_0

    .line 569
    .end local v11    # "l":Lcom/google/maps/android/heatmaps/WeightedLatLng;
    .end local v12    # "x":D
    .end local v14    # "y":D
    :cond_4
    new-instance v0, Lcom/google/maps/android/geometry/Bounds;

    invoke-direct/range {v0 .. v8}, Lcom/google/maps/android/geometry/Bounds;-><init>(DDDD)V

    return-object v0
.end method

.method private getMaxIntensities(I)[D
    .locals 12
    .param p1, "radius"    # I

    .prologue
    const/16 v11, 0x16

    .line 506
    new-array v2, v11, [D

    .line 509
    .local v2, "maxIntensityArray":[D
    const/4 v0, 0x5

    .local v0, "i":I
    :goto_0
    const/16 v3, 0xb

    if-ge v0, v3, :cond_1

    .line 511
    iget-object v3, p0, Lcom/google/maps/android/heatmaps/HeatmapTileProvider;->mData:Ljava/util/Collection;

    iget-object v4, p0, Lcom/google/maps/android/heatmaps/HeatmapTileProvider;->mBounds:Lcom/google/maps/android/geometry/Bounds;

    const-wide/high16 v5, 0x4094000000000000L    # 1280.0

    const-wide/high16 v7, 0x4000000000000000L    # 2.0

    add-int/lit8 v9, v0, -0x3

    int-to-double v9, v9

    invoke-static {v7, v8, v9, v10}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v7

    mul-double/2addr v5, v7

    double-to-int v5, v5

    invoke-static {v3, v4, p1, v5}, Lcom/google/maps/android/heatmaps/HeatmapTileProvider;->getMaxValue(Ljava/util/Collection;Lcom/google/maps/android/geometry/Bounds;II)D

    move-result-wide v3

    aput-wide v3, v2, v0

    .line 513
    const/4 v3, 0x5

    if-ne v0, v3, :cond_0

    .line 514
    const/4 v1, 0x0

    .local v1, "j":I
    :goto_1
    if-ge v1, v0, :cond_0

    aget-wide v3, v2, v0

    aput-wide v3, v2, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 509
    .end local v1    # "j":I
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 517
    :cond_1
    const/16 v0, 0xb

    :goto_2
    if-ge v0, v11, :cond_2

    .line 518
    const/16 v3, 0xa

    aget-wide v3, v2, v3

    aput-wide v3, v2, v0

    .line 517
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    .line 521
    :cond_2
    return-object v2
.end method

.method static getMaxValue(Ljava/util/Collection;Lcom/google/maps/android/geometry/Bounds;II)D
    .locals 33
    .param p1, "bounds"    # Lcom/google/maps/android/geometry/Bounds;
    .param p2, "radius"    # I
    .param p3, "screenDim"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<",
            "Lcom/google/maps/android/heatmaps/WeightedLatLng;",
            ">;",
            "Lcom/google/maps/android/geometry/Bounds;",
            "II)D"
        }
    .end annotation

    .prologue
    .line 727
    .local p0, "points":Ljava/util/Collection;, "Ljava/util/Collection<Lcom/google/maps/android/heatmaps/WeightedLatLng;>;"
    move-object/from16 v0, p1

    iget-wide v15, v0, Lcom/google/maps/android/geometry/Bounds;->minX:D

    .line 728
    .local v15, "minX":D
    move-object/from16 v0, p1

    iget-wide v11, v0, Lcom/google/maps/android/geometry/Bounds;->maxX:D

    .line 729
    .local v11, "maxX":D
    move-object/from16 v0, p1

    iget-wide v0, v0, Lcom/google/maps/android/geometry/Bounds;->minY:D

    move-wide/from16 v17, v0

    .line 730
    .local v17, "minY":D
    move-object/from16 v0, p1

    iget-wide v13, v0, Lcom/google/maps/android/geometry/Bounds;->maxY:D

    .line 731
    .local v13, "maxY":D
    sub-double v29, v11, v15

    sub-double v31, v13, v17

    cmpl-double v29, v29, v31

    if-lez v29, :cond_3

    sub-double v3, v11, v15

    .line 734
    .local v3, "boundsDim":D
    :goto_0
    mul-int/lit8 v29, p2, 0x2

    div-int v29, p3, v29

    move/from16 v0, v29

    int-to-double v0, v0

    move-wide/from16 v29, v0

    const-wide/high16 v31, 0x3fe0000000000000L    # 0.5

    add-double v29, v29, v31

    move-wide/from16 v0, v29

    double-to-int v0, v0

    move/from16 v19, v0

    .line 736
    .local v19, "nBuckets":I
    move/from16 v0, v19

    int-to-double v0, v0

    move-wide/from16 v29, v0

    div-double v20, v29, v3

    .line 740
    .local v20, "scale":D
    new-instance v5, Landroid/support/v4/util/LongSparseArray;

    invoke-direct {v5}, Landroid/support/v4/util/LongSparseArray;-><init>()V

    .line 745
    .local v5, "buckets":Landroid/support/v4/util/LongSparseArray;, "Landroid/support/v4/util/LongSparseArray<Landroid/support/v4/util/LongSparseArray<Ljava/lang/Double;>;>;"
    const-wide/16 v9, 0x0

    .line 746
    .local v9, "max":D
    invoke-interface/range {p0 .. p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v7

    .local v7, "i$":Ljava/util/Iterator;
    :cond_0
    :goto_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v29

    if-eqz v29, :cond_4

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/google/maps/android/heatmaps/WeightedLatLng;

    .line 747
    .local v8, "l":Lcom/google/maps/android/heatmaps/WeightedLatLng;
    invoke-virtual {v8}, Lcom/google/maps/android/heatmaps/WeightedLatLng;->getPoint()Lcom/google/maps/android/geometry/Point;

    move-result-object v29

    move-object/from16 v0, v29

    iget-wide v0, v0, Lcom/google/maps/android/geometry/Point;->x:D

    move-wide/from16 v23, v0

    .line 748
    .local v23, "x":D
    invoke-virtual {v8}, Lcom/google/maps/android/heatmaps/WeightedLatLng;->getPoint()Lcom/google/maps/android/geometry/Point;

    move-result-object v29

    move-object/from16 v0, v29

    iget-wide v0, v0, Lcom/google/maps/android/geometry/Point;->y:D

    move-wide/from16 v26, v0

    .line 750
    .local v26, "y":D
    sub-double v29, v23, v15

    mul-double v29, v29, v20

    move-wide/from16 v0, v29

    double-to-int v0, v0

    move/from16 v25, v0

    .line 751
    .local v25, "xBucket":I
    sub-double v29, v26, v17

    mul-double v29, v29, v20

    move-wide/from16 v0, v29

    double-to-int v0, v0

    move/from16 v28, v0

    .line 754
    .local v28, "yBucket":I
    move/from16 v0, v25

    int-to-long v0, v0

    move-wide/from16 v29, v0

    move-wide/from16 v0, v29

    invoke-virtual {v5, v0, v1}, Landroid/support/v4/util/LongSparseArray;->get(J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroid/support/v4/util/LongSparseArray;

    .line 755
    .local v6, "column":Landroid/support/v4/util/LongSparseArray;, "Landroid/support/v4/util/LongSparseArray<Ljava/lang/Double;>;"
    if-nez v6, :cond_1

    .line 756
    new-instance v6, Landroid/support/v4/util/LongSparseArray;

    .end local v6    # "column":Landroid/support/v4/util/LongSparseArray;, "Landroid/support/v4/util/LongSparseArray<Ljava/lang/Double;>;"
    invoke-direct {v6}, Landroid/support/v4/util/LongSparseArray;-><init>()V

    .line 757
    .restart local v6    # "column":Landroid/support/v4/util/LongSparseArray;, "Landroid/support/v4/util/LongSparseArray<Ljava/lang/Double;>;"
    move/from16 v0, v25

    int-to-long v0, v0

    move-wide/from16 v29, v0

    move-wide/from16 v0, v29

    invoke-virtual {v5, v0, v1, v6}, Landroid/support/v4/util/LongSparseArray;->put(JLjava/lang/Object;)V

    .line 760
    :cond_1
    move/from16 v0, v28

    int-to-long v0, v0

    move-wide/from16 v29, v0

    move-wide/from16 v0, v29

    invoke-virtual {v6, v0, v1}, Landroid/support/v4/util/LongSparseArray;->get(J)Ljava/lang/Object;

    move-result-object v22

    check-cast v22, Ljava/lang/Double;

    .line 761
    .local v22, "value":Ljava/lang/Double;
    if-nez v22, :cond_2

    .line 762
    const-wide/16 v29, 0x0

    invoke-static/range {v29 .. v30}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v22

    .line 764
    :cond_2
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v29

    invoke-virtual {v8}, Lcom/google/maps/android/heatmaps/WeightedLatLng;->getIntensity()D

    move-result-wide v31

    add-double v29, v29, v31

    invoke-static/range {v29 .. v30}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v22

    .line 766
    move/from16 v0, v28

    int-to-long v0, v0

    move-wide/from16 v29, v0

    move-wide/from16 v0, v29

    move-object/from16 v2, v22

    invoke-virtual {v6, v0, v1, v2}, Landroid/support/v4/util/LongSparseArray;->put(JLjava/lang/Object;)V

    .line 768
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v29

    cmpl-double v29, v29, v9

    if-lez v29, :cond_0

    invoke-virtual/range {v22 .. v22}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v9

    goto/16 :goto_1

    .line 731
    .end local v3    # "boundsDim":D
    .end local v5    # "buckets":Landroid/support/v4/util/LongSparseArray;, "Landroid/support/v4/util/LongSparseArray<Landroid/support/v4/util/LongSparseArray<Ljava/lang/Double;>;>;"
    .end local v6    # "column":Landroid/support/v4/util/LongSparseArray;, "Landroid/support/v4/util/LongSparseArray<Ljava/lang/Double;>;"
    .end local v7    # "i$":Ljava/util/Iterator;
    .end local v8    # "l":Lcom/google/maps/android/heatmaps/WeightedLatLng;
    .end local v9    # "max":D
    .end local v19    # "nBuckets":I
    .end local v20    # "scale":D
    .end local v22    # "value":Ljava/lang/Double;
    .end local v23    # "x":D
    .end local v25    # "xBucket":I
    .end local v26    # "y":D
    .end local v28    # "yBucket":I
    :cond_3
    sub-double v3, v13, v17

    goto/16 :goto_0

    .line 771
    .restart local v3    # "boundsDim":D
    .restart local v5    # "buckets":Landroid/support/v4/util/LongSparseArray;, "Landroid/support/v4/util/LongSparseArray<Landroid/support/v4/util/LongSparseArray<Ljava/lang/Double;>;>;"
    .restart local v7    # "i$":Ljava/util/Iterator;
    .restart local v9    # "max":D
    .restart local v19    # "nBuckets":I
    .restart local v20    # "scale":D
    :cond_4
    return-wide v9
.end method

.method private static wrapData(Ljava/util/Collection;)Ljava/util/Collection;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<",
            "Lcom/google/android/gms/maps/model/LatLng;",
            ">;)",
            "Ljava/util/Collection",
            "<",
            "Lcom/google/maps/android/heatmaps/WeightedLatLng;",
            ">;"
        }
    .end annotation

    .prologue
    .line 343
    .local p0, "data":Ljava/util/Collection;, "Ljava/util/Collection<Lcom/google/android/gms/maps/model/LatLng;>;"
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 345
    .local v2, "weightedData":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/google/maps/android/heatmaps/WeightedLatLng;>;"
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .local v0, "i$":Ljava/util/Iterator;
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/maps/model/LatLng;

    .line 346
    .local v1, "l":Lcom/google/android/gms/maps/model/LatLng;
    new-instance v3, Lcom/google/maps/android/heatmaps/WeightedLatLng;

    invoke-direct {v3, v1}, Lcom/google/maps/android/heatmaps/WeightedLatLng;-><init>(Lcom/google/android/gms/maps/model/LatLng;)V

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 349
    .end local v1    # "l":Lcom/google/android/gms/maps/model/LatLng;
    :cond_0
    return-object v2
.end method


# virtual methods
.method public getTile(III)Lcom/google/android/gms/maps/model/Tile;
    .locals 45
    .param p1, "x"    # I
    .param p2, "y"    # I
    .param p3, "zoom"    # I

    .prologue
    .line 369
    const-wide/high16 v3, 0x3ff0000000000000L    # 1.0

    const-wide/high16 v5, 0x4000000000000000L    # 2.0

    move/from16 v0, p3

    int-to-double v0, v0

    move-wide/from16 v17, v0

    move-wide/from16 v0, v17

    invoke-static {v5, v6, v0, v1}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v5

    div-double v37, v3, v5

    .line 374
    .local v37, "tileWidth":D
    move-object/from16 v0, p0

    iget v3, v0, Lcom/google/maps/android/heatmaps/HeatmapTileProvider;->mRadius:I

    int-to-double v3, v3

    mul-double v3, v3, v37

    const-wide/high16 v5, 0x4080000000000000L    # 512.0

    div-double v34, v3, v5

    .line 378
    .local v34, "padding":D
    const-wide/high16 v3, 0x4000000000000000L    # 2.0

    mul-double v3, v3, v34

    add-double v39, v37, v3

    .line 382
    .local v39, "tileWidthPadded":D
    move-object/from16 v0, p0

    iget v3, v0, Lcom/google/maps/android/heatmaps/HeatmapTileProvider;->mRadius:I

    mul-int/lit8 v3, v3, 0x2

    add-int/lit16 v3, v3, 0x200

    int-to-double v3, v3

    div-double v26, v39, v3

    .line 385
    .local v26, "bucketWidth":D
    move/from16 v0, p1

    int-to-double v3, v0

    mul-double v3, v3, v37

    sub-double v12, v3, v34

    .line 386
    .local v12, "minX":D
    add-int/lit8 v3, p1, 0x1

    int-to-double v3, v3

    mul-double v3, v3, v37

    add-double v14, v3, v34

    .line 387
    .local v14, "maxX":D
    move/from16 v0, p2

    int-to-double v3, v0

    mul-double v3, v3, v37

    sub-double v7, v3, v34

    .line 388
    .local v7, "minY":D
    add-int/lit8 v3, p2, 0x1

    int-to-double v3, v3

    mul-double v3, v3, v37

    add-double v9, v3, v34

    .line 395
    .local v9, "maxY":D
    const-wide/16 v43, 0x0

    .line 396
    .local v43, "xOffset":D
    new-instance v42, Ljava/util/ArrayList;

    invoke-direct/range {v42 .. v42}, Ljava/util/ArrayList;-><init>()V

    .line 397
    .local v42, "wrappedPoints":Ljava/util/Collection;, "Ljava/util/Collection<Lcom/google/maps/android/heatmaps/WeightedLatLng;>;"
    const-wide/16 v3, 0x0

    cmpg-double v3, v12, v3

    if-gez v3, :cond_1

    .line 401
    new-instance v2, Lcom/google/maps/android/geometry/Bounds;

    const-wide/high16 v3, 0x3ff0000000000000L    # 1.0

    add-double/2addr v3, v12

    const-wide/high16 v5, 0x3ff0000000000000L    # 1.0

    invoke-direct/range {v2 .. v10}, Lcom/google/maps/android/geometry/Bounds;-><init>(DDDD)V

    .line 402
    .local v2, "overlapBounds":Lcom/google/maps/android/geometry/Bounds;
    const-wide/high16 v43, -0x4010000000000000L    # -1.0

    .line 403
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/google/maps/android/heatmaps/HeatmapTileProvider;->mTree:Lcom/google/maps/android/quadtree/PointQuadTree;

    invoke-virtual {v3, v2}, Lcom/google/maps/android/quadtree/PointQuadTree;->search(Lcom/google/maps/android/geometry/Bounds;)Ljava/util/Collection;

    move-result-object v42

    .line 415
    .end local v2    # "overlapBounds":Lcom/google/maps/android/geometry/Bounds;
    :cond_0
    :goto_0
    new-instance v11, Lcom/google/maps/android/geometry/Bounds;

    move-wide/from16 v16, v7

    move-wide/from16 v18, v9

    invoke-direct/range {v11 .. v19}, Lcom/google/maps/android/geometry/Bounds;-><init>(DDDD)V

    .line 420
    .local v11, "tileBounds":Lcom/google/maps/android/geometry/Bounds;
    new-instance v16, Lcom/google/maps/android/geometry/Bounds;

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/google/maps/android/heatmaps/HeatmapTileProvider;->mBounds:Lcom/google/maps/android/geometry/Bounds;

    iget-wide v3, v3, Lcom/google/maps/android/geometry/Bounds;->minX:D

    sub-double v17, v3, v34

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/google/maps/android/heatmaps/HeatmapTileProvider;->mBounds:Lcom/google/maps/android/geometry/Bounds;

    iget-wide v3, v3, Lcom/google/maps/android/geometry/Bounds;->maxX:D

    add-double v19, v3, v34

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/google/maps/android/heatmaps/HeatmapTileProvider;->mBounds:Lcom/google/maps/android/geometry/Bounds;

    iget-wide v3, v3, Lcom/google/maps/android/geometry/Bounds;->minY:D

    sub-double v21, v3, v34

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/google/maps/android/heatmaps/HeatmapTileProvider;->mBounds:Lcom/google/maps/android/geometry/Bounds;

    iget-wide v3, v3, Lcom/google/maps/android/geometry/Bounds;->maxY:D

    add-double v23, v3, v34

    invoke-direct/range {v16 .. v24}, Lcom/google/maps/android/geometry/Bounds;-><init>(DDDD)V

    .line 422
    .local v16, "paddedBounds":Lcom/google/maps/android/geometry/Bounds;
    move-object/from16 v0, v16

    invoke-virtual {v11, v0}, Lcom/google/maps/android/geometry/Bounds;->intersects(Lcom/google/maps/android/geometry/Bounds;)Z

    move-result v3

    if-nez v3, :cond_2

    .line 423
    sget-object v3, Lcom/google/android/gms/maps/model/TileProvider;->NO_TILE:Lcom/google/android/gms/maps/model/Tile;

    .line 457
    :goto_1
    return-object v3

    .line 404
    .end local v11    # "tileBounds":Lcom/google/maps/android/geometry/Bounds;
    .end local v16    # "paddedBounds":Lcom/google/maps/android/geometry/Bounds;
    :cond_1
    const-wide/high16 v3, 0x3ff0000000000000L    # 1.0

    cmpl-double v3, v14, v3

    if-lez v3, :cond_0

    .line 409
    new-instance v2, Lcom/google/maps/android/geometry/Bounds;

    const-wide/16 v3, 0x0

    const-wide/high16 v5, 0x3ff0000000000000L    # 1.0

    sub-double v5, v14, v5

    invoke-direct/range {v2 .. v10}, Lcom/google/maps/android/geometry/Bounds;-><init>(DDDD)V

    .line 410
    .restart local v2    # "overlapBounds":Lcom/google/maps/android/geometry/Bounds;
    const-wide/high16 v43, 0x3ff0000000000000L    # 1.0

    .line 411
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/google/maps/android/heatmaps/HeatmapTileProvider;->mTree:Lcom/google/maps/android/quadtree/PointQuadTree;

    invoke-virtual {v3, v2}, Lcom/google/maps/android/quadtree/PointQuadTree;->search(Lcom/google/maps/android/geometry/Bounds;)Ljava/util/Collection;

    move-result-object v42

    goto :goto_0

    .line 427
    .end local v2    # "overlapBounds":Lcom/google/maps/android/geometry/Bounds;
    .restart local v11    # "tileBounds":Lcom/google/maps/android/geometry/Bounds;
    .restart local v16    # "paddedBounds":Lcom/google/maps/android/geometry/Bounds;
    :cond_2
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/google/maps/android/heatmaps/HeatmapTileProvider;->mTree:Lcom/google/maps/android/quadtree/PointQuadTree;

    invoke-virtual {v3, v11}, Lcom/google/maps/android/quadtree/PointQuadTree;->search(Lcom/google/maps/android/geometry/Bounds;)Ljava/util/Collection;

    move-result-object v36

    .line 430
    .local v36, "points":Ljava/util/Collection;, "Ljava/util/Collection<Lcom/google/maps/android/heatmaps/WeightedLatLng;>;"
    invoke-interface/range {v36 .. v36}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_3

    .line 431
    sget-object v3, Lcom/google/android/gms/maps/model/TileProvider;->NO_TILE:Lcom/google/android/gms/maps/model/Tile;

    goto :goto_1

    .line 435
    :cond_3
    move-object/from16 v0, p0

    iget v3, v0, Lcom/google/maps/android/heatmaps/HeatmapTileProvider;->mRadius:I

    mul-int/lit8 v3, v3, 0x2

    add-int/lit16 v3, v3, 0x200

    move-object/from16 v0, p0

    iget v4, v0, Lcom/google/maps/android/heatmaps/HeatmapTileProvider;->mRadius:I

    mul-int/lit8 v4, v4, 0x2

    add-int/lit16 v4, v4, 0x200

    filled-new-array {v3, v4}, [I

    move-result-object v3

    sget-object v4, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    invoke-static {v4, v3}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v32

    check-cast v32, [[D

    .line 436
    .local v32, "intensity":[[D
    invoke-interface/range {v36 .. v36}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v31

    .local v31, "i$":Ljava/util/Iterator;
    :goto_2
    invoke-interface/range {v31 .. v31}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface/range {v31 .. v31}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v41

    check-cast v41, Lcom/google/maps/android/heatmaps/WeightedLatLng;

    .line 437
    .local v41, "w":Lcom/google/maps/android/heatmaps/WeightedLatLng;
    invoke-virtual/range {v41 .. v41}, Lcom/google/maps/android/heatmaps/WeightedLatLng;->getPoint()Lcom/google/maps/android/geometry/Point;

    move-result-object v33

    .line 438
    .local v33, "p":Lcom/google/maps/android/geometry/Point;
    move-object/from16 v0, v33

    iget-wide v3, v0, Lcom/google/maps/android/geometry/Point;->x:D

    sub-double/2addr v3, v12

    div-double v3, v3, v26

    double-to-int v0, v3

    move/from16 v28, v0

    .line 439
    .local v28, "bucketX":I
    move-object/from16 v0, v33

    iget-wide v3, v0, Lcom/google/maps/android/geometry/Point;->y:D

    sub-double/2addr v3, v7

    div-double v3, v3, v26

    double-to-int v0, v3

    move/from16 v29, v0

    .line 440
    .local v29, "bucketY":I
    aget-object v3, v32, v28

    aget-wide v4, v3, v29

    invoke-virtual/range {v41 .. v41}, Lcom/google/maps/android/heatmaps/WeightedLatLng;->getIntensity()D

    move-result-wide v17

    add-double v4, v4, v17

    aput-wide v4, v3, v29

    goto :goto_2

    .line 443
    .end local v28    # "bucketX":I
    .end local v29    # "bucketY":I
    .end local v33    # "p":Lcom/google/maps/android/geometry/Point;
    .end local v41    # "w":Lcom/google/maps/android/heatmaps/WeightedLatLng;
    :cond_4
    invoke-interface/range {v42 .. v42}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v31

    :goto_3
    invoke-interface/range {v31 .. v31}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface/range {v31 .. v31}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v41

    check-cast v41, Lcom/google/maps/android/heatmaps/WeightedLatLng;

    .line 444
    .restart local v41    # "w":Lcom/google/maps/android/heatmaps/WeightedLatLng;
    invoke-virtual/range {v41 .. v41}, Lcom/google/maps/android/heatmaps/WeightedLatLng;->getPoint()Lcom/google/maps/android/geometry/Point;

    move-result-object v33

    .line 445
    .restart local v33    # "p":Lcom/google/maps/android/geometry/Point;
    move-object/from16 v0, v33

    iget-wide v3, v0, Lcom/google/maps/android/geometry/Point;->x:D

    add-double v3, v3, v43

    sub-double/2addr v3, v12

    div-double v3, v3, v26

    double-to-int v0, v3

    move/from16 v28, v0

    .line 446
    .restart local v28    # "bucketX":I
    move-object/from16 v0, v33

    iget-wide v3, v0, Lcom/google/maps/android/geometry/Point;->y:D

    sub-double/2addr v3, v7

    div-double v3, v3, v26

    double-to-int v0, v3

    move/from16 v29, v0

    .line 447
    .restart local v29    # "bucketY":I
    aget-object v3, v32, v28

    aget-wide v4, v3, v29

    invoke-virtual/range {v41 .. v41}, Lcom/google/maps/android/heatmaps/WeightedLatLng;->getIntensity()D

    move-result-wide v17

    add-double v4, v4, v17

    aput-wide v4, v3, v29

    goto :goto_3

    .line 451
    .end local v28    # "bucketX":I
    .end local v29    # "bucketY":I
    .end local v33    # "p":Lcom/google/maps/android/geometry/Point;
    .end local v41    # "w":Lcom/google/maps/android/heatmaps/WeightedLatLng;
    :cond_5
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/google/maps/android/heatmaps/HeatmapTileProvider;->mKernel:[D

    move-object/from16 v0, v32

    invoke-static {v0, v3}, Lcom/google/maps/android/heatmaps/HeatmapTileProvider;->convolve([[D[D)[[D

    move-result-object v30

    .line 454
    .local v30, "convolved":[[D
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/google/maps/android/heatmaps/HeatmapTileProvider;->mColorMap:[I

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/google/maps/android/heatmaps/HeatmapTileProvider;->mMaxIntensity:[D

    aget-wide v4, v4, p3

    move-object/from16 v0, v30

    invoke-static {v0, v3, v4, v5}, Lcom/google/maps/android/heatmaps/HeatmapTileProvider;->colorize([[D[ID)Landroid/graphics/Bitmap;

    move-result-object v25

    .line 457
    .local v25, "bitmap":Landroid/graphics/Bitmap;
    invoke-static/range {v25 .. v25}, Lcom/google/maps/android/heatmaps/HeatmapTileProvider;->convertBitmap(Landroid/graphics/Bitmap;)Lcom/google/android/gms/maps/model/Tile;

    move-result-object v3

    goto/16 :goto_1
.end method

.method public setData(Ljava/util/Collection;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<",
            "Lcom/google/android/gms/maps/model/LatLng;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 332
    .local p1, "data":Ljava/util/Collection;, "Ljava/util/Collection<Lcom/google/android/gms/maps/model/LatLng;>;"
    invoke-static {p1}, Lcom/google/maps/android/heatmaps/HeatmapTileProvider;->wrapData(Ljava/util/Collection;)Ljava/util/Collection;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/maps/android/heatmaps/HeatmapTileProvider;->setWeightedData(Ljava/util/Collection;)V

    .line 333
    return-void
.end method

.method public setGradient(Lcom/google/maps/android/heatmaps/Gradient;)V
    .locals 2
    .param p1, "gradient"    # Lcom/google/maps/android/heatmaps/Gradient;

    .prologue
    .line 467
    iput-object p1, p0, Lcom/google/maps/android/heatmaps/HeatmapTileProvider;->mGradient:Lcom/google/maps/android/heatmaps/Gradient;

    .line 468
    iget-wide v0, p0, Lcom/google/maps/android/heatmaps/HeatmapTileProvider;->mOpacity:D

    invoke-virtual {p1, v0, v1}, Lcom/google/maps/android/heatmaps/Gradient;->generateColorMap(D)[I

    move-result-object v0

    iput-object v0, p0, Lcom/google/maps/android/heatmaps/HeatmapTileProvider;->mColorMap:[I

    .line 469
    return-void
.end method

.method public setOpacity(D)V
    .locals 1
    .param p1, "opacity"    # D

    .prologue
    .line 492
    iput-wide p1, p0, Lcom/google/maps/android/heatmaps/HeatmapTileProvider;->mOpacity:D

    .line 494
    iget-object v0, p0, Lcom/google/maps/android/heatmaps/HeatmapTileProvider;->mGradient:Lcom/google/maps/android/heatmaps/Gradient;

    invoke-virtual {p0, v0}, Lcom/google/maps/android/heatmaps/HeatmapTileProvider;->setGradient(Lcom/google/maps/android/heatmaps/Gradient;)V

    .line 495
    return-void
.end method

.method public setRadius(I)V
    .locals 5
    .param p1, "radius"    # I

    .prologue
    .line 478
    iput p1, p0, Lcom/google/maps/android/heatmaps/HeatmapTileProvider;->mRadius:I

    .line 480
    iget v0, p0, Lcom/google/maps/android/heatmaps/HeatmapTileProvider;->mRadius:I

    iget v1, p0, Lcom/google/maps/android/heatmaps/HeatmapTileProvider;->mRadius:I

    int-to-double v1, v1

    const-wide/high16 v3, 0x4008000000000000L    # 3.0

    div-double/2addr v1, v3

    invoke-static {v0, v1, v2}, Lcom/google/maps/android/heatmaps/HeatmapTileProvider;->generateKernel(ID)[D

    move-result-object v0

    iput-object v0, p0, Lcom/google/maps/android/heatmaps/HeatmapTileProvider;->mKernel:[D

    .line 482
    iget v0, p0, Lcom/google/maps/android/heatmaps/HeatmapTileProvider;->mRadius:I

    invoke-direct {p0, v0}, Lcom/google/maps/android/heatmaps/HeatmapTileProvider;->getMaxIntensities(I)[D

    move-result-object v0

    iput-object v0, p0, Lcom/google/maps/android/heatmaps/HeatmapTileProvider;->mMaxIntensity:[D

    .line 483
    return-void
.end method

.method public setWeightedData(Ljava/util/Collection;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<",
            "Lcom/google/maps/android/heatmaps/WeightedLatLng;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 297
    .local p1, "data":Ljava/util/Collection;, "Ljava/util/Collection<Lcom/google/maps/android/heatmaps/WeightedLatLng;>;"
    iput-object p1, p0, Lcom/google/maps/android/heatmaps/HeatmapTileProvider;->mData:Ljava/util/Collection;

    .line 300
    iget-object v2, p0, Lcom/google/maps/android/heatmaps/HeatmapTileProvider;->mData:Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 301
    new-instance v2, Ljava/lang/IllegalArgumentException;

    const-string v3, "No input points."

    invoke-direct {v2, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 310
    :cond_0
    iget-object v2, p0, Lcom/google/maps/android/heatmaps/HeatmapTileProvider;->mData:Ljava/util/Collection;

    invoke-static {v2}, Lcom/google/maps/android/heatmaps/HeatmapTileProvider;->getBounds(Ljava/util/Collection;)Lcom/google/maps/android/geometry/Bounds;

    move-result-object v2

    iput-object v2, p0, Lcom/google/maps/android/heatmaps/HeatmapTileProvider;->mBounds:Lcom/google/maps/android/geometry/Bounds;

    .line 312
    new-instance v2, Lcom/google/maps/android/quadtree/PointQuadTree;

    iget-object v3, p0, Lcom/google/maps/android/heatmaps/HeatmapTileProvider;->mBounds:Lcom/google/maps/android/geometry/Bounds;

    invoke-direct {v2, v3}, Lcom/google/maps/android/quadtree/PointQuadTree;-><init>(Lcom/google/maps/android/geometry/Bounds;)V

    iput-object v2, p0, Lcom/google/maps/android/heatmaps/HeatmapTileProvider;->mTree:Lcom/google/maps/android/quadtree/PointQuadTree;

    .line 315
    iget-object v2, p0, Lcom/google/maps/android/heatmaps/HeatmapTileProvider;->mData:Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .local v0, "i$":Ljava/util/Iterator;
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/maps/android/heatmaps/WeightedLatLng;

    .line 316
    .local v1, "l":Lcom/google/maps/android/heatmaps/WeightedLatLng;
    iget-object v2, p0, Lcom/google/maps/android/heatmaps/HeatmapTileProvider;->mTree:Lcom/google/maps/android/quadtree/PointQuadTree;

    invoke-virtual {v2, v1}, Lcom/google/maps/android/quadtree/PointQuadTree;->add(Lcom/google/maps/android/quadtree/PointQuadTree$Item;)V

    goto :goto_0

    .line 321
    .end local v1    # "l":Lcom/google/maps/android/heatmaps/WeightedLatLng;
    :cond_1
    iget v2, p0, Lcom/google/maps/android/heatmaps/HeatmapTileProvider;->mRadius:I

    invoke-direct {p0, v2}, Lcom/google/maps/android/heatmaps/HeatmapTileProvider;->getMaxIntensities(I)[D

    move-result-object v2

    iput-object v2, p0, Lcom/google/maps/android/heatmaps/HeatmapTileProvider;->mMaxIntensity:[D

    .line 322
    return-void
.end method
