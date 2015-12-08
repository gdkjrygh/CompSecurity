.class public final Ljp/co/cyberagent/android/a/ag;
.super Ljp/co/cyberagent/android/a/h;
.source "SourceFile"


# static fields
.field public static final y:I


# instance fields
.field private A:I

.field private B:[Landroid/graphics/PointF;

.field private C:[Landroid/graphics/PointF;

.field private D:[Landroid/graphics/PointF;

.field private E:[Landroid/graphics/PointF;

.field private F:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field private G:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field private H:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field private I:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field private z:[I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 34
    sget v0, Ljp/co/cyberagent/android/a/a;->w:I

    sput v0, Ljp/co/cyberagent/android/a/ag;->y:I

    return-void
.end method

.method public constructor <init>()V
    .locals 7

    .prologue
    const/4 v6, 0x1

    const/4 v5, 0x0

    const/high16 v4, 0x3f800000    # 1.0f

    const/high16 v3, 0x3f000000    # 0.5f

    const/4 v2, 0x0

    .line 69
    const-string v0, "uniform mat4 uMVPMatrix;\nattribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = uMVPMatrix*position;\n    textureCoordinate = inputTextureCoordinate.xy;\n}"

    const-string v1, " varying highp vec2 textureCoordinate;\n uniform sampler2D inputImageTexture;\n uniform sampler2D toneCurveTexture;\n\n void main()\n {\n     lowp vec4 textureColor = texture2D(inputImageTexture, textureCoordinate);\n     lowp float redCompositeCurveValue = clamp(texture2D(toneCurveTexture, vec2(textureColor.r, 0.0)).r,0.0,1.0);\n     lowp float greenCompositeCurveValue = clamp(texture2D(toneCurveTexture, vec2(textureColor.g, 0.0)).g,0.0,1.0);\n     lowp float blueCompositeCurveValue = clamp(texture2D(toneCurveTexture, vec2(textureColor.b, 0.0)).b,0.0,1.0);\n     lowp float redCurveValue = texture2D(toneCurveTexture, vec2(redCompositeCurveValue, 1.0)).r;\n     lowp float greenCurveValue = texture2D(toneCurveTexture, vec2(greenCompositeCurveValue, 1.0)).g;\n     lowp float blueCurveValue = texture2D(toneCurveTexture, vec2(blueCompositeCurveValue, 1.0)).b;\n\n     gl_FragColor = vec4(redCurveValue, greenCurveValue, blueCurveValue, textureColor.a);\n }"

    invoke-direct {p0, v0, v1}, Ljp/co/cyberagent/android/a/h;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 54
    new-array v0, v6, [I

    const/4 v1, -0x1

    aput v1, v0, v5

    iput-object v0, p0, Ljp/co/cyberagent/android/a/ag;->z:[I

    .line 71
    const/4 v0, 0x3

    new-array v0, v0, [Landroid/graphics/PointF;

    new-instance v1, Landroid/graphics/PointF;

    invoke-direct {v1, v2, v2}, Landroid/graphics/PointF;-><init>(FF)V

    aput-object v1, v0, v5

    new-instance v1, Landroid/graphics/PointF;

    invoke-direct {v1, v3, v3}, Landroid/graphics/PointF;-><init>(FF)V

    aput-object v1, v0, v6

    const/4 v1, 0x2

    new-instance v2, Landroid/graphics/PointF;

    invoke-direct {v2, v4, v4}, Landroid/graphics/PointF;-><init>(FF)V

    aput-object v2, v0, v1

    .line 72
    iput-object v0, p0, Ljp/co/cyberagent/android/a/ag;->B:[Landroid/graphics/PointF;

    .line 73
    iput-object v0, p0, Ljp/co/cyberagent/android/a/ag;->C:[Landroid/graphics/PointF;

    .line 74
    iput-object v0, p0, Ljp/co/cyberagent/android/a/ag;->D:[Landroid/graphics/PointF;

    .line 75
    iput-object v0, p0, Ljp/co/cyberagent/android/a/ag;->E:[Landroid/graphics/PointF;

    .line 76
    return-void
.end method

.method private static a([Landroid/graphics/Point;)Ljava/util/ArrayList;
    .locals 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Landroid/graphics/Point;",
            ")",
            "Ljava/util/ArrayList",
            "<",
            "Landroid/graphics/Point;",
            ">;"
        }
    .end annotation

    .prologue
    .line 296
    .line 1345
    move-object/from16 v0, p0

    array-length v5, v0

    .line 1346
    const/4 v2, 0x1

    if-gt v5, v2, :cond_1

    .line 1347
    const/4 v2, 0x0

    move-object v3, v2

    .line 300
    :cond_0
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v7

    .line 301
    if-gtz v7, :cond_5

    .line 302
    const/4 v2, 0x0

    .line 341
    :goto_0
    return-object v2

    .line 1350
    :cond_1
    const/4 v2, 0x3

    filled-new-array {v5, v2}, [I

    move-result-object v2

    sget-object v3, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    invoke-static {v3, v2}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [[D

    .line 1351
    new-array v6, v5, [D

    .line 1352
    const/4 v3, 0x0

    aget-object v3, v2, v3

    const/4 v4, 0x1

    const-wide/high16 v8, 0x3ff0000000000000L    # 1.0

    aput-wide v8, v3, v4

    .line 1354
    const/4 v3, 0x0

    aget-object v3, v2, v3

    const/4 v4, 0x0

    const-wide/16 v8, 0x0

    aput-wide v8, v3, v4

    .line 1355
    const/4 v3, 0x0

    aget-object v3, v2, v3

    const/4 v4, 0x2

    const-wide/16 v8, 0x0

    aput-wide v8, v3, v4

    .line 1357
    const/4 v3, 0x1

    :goto_1
    add-int/lit8 v4, v5, -0x1

    if-ge v3, v4, :cond_2

    .line 1358
    add-int/lit8 v4, v3, -0x1

    aget-object v4, p0, v4

    .line 1359
    aget-object v7, p0, v3

    .line 1360
    add-int/lit8 v8, v3, 0x1

    aget-object v8, p0, v8

    .line 1362
    aget-object v9, v2, v3

    const/4 v10, 0x0

    iget v11, v7, Landroid/graphics/Point;->x:I

    iget v12, v4, Landroid/graphics/Point;->x:I

    sub-int/2addr v11, v12

    int-to-double v12, v11

    const-wide/high16 v14, 0x4018000000000000L    # 6.0

    div-double/2addr v12, v14

    aput-wide v12, v9, v10

    .line 1363
    aget-object v9, v2, v3

    const/4 v10, 0x1

    iget v11, v8, Landroid/graphics/Point;->x:I

    iget v12, v4, Landroid/graphics/Point;->x:I

    sub-int/2addr v11, v12

    int-to-double v12, v11

    const-wide/high16 v14, 0x4008000000000000L    # 3.0

    div-double/2addr v12, v14

    aput-wide v12, v9, v10

    .line 1364
    aget-object v9, v2, v3

    const/4 v10, 0x2

    iget v11, v8, Landroid/graphics/Point;->x:I

    iget v12, v7, Landroid/graphics/Point;->x:I

    sub-int/2addr v11, v12

    int-to-double v12, v11

    const-wide/high16 v14, 0x4018000000000000L    # 6.0

    div-double/2addr v12, v14

    aput-wide v12, v9, v10

    .line 1365
    iget v9, v8, Landroid/graphics/Point;->y:I

    iget v10, v7, Landroid/graphics/Point;->y:I

    sub-int/2addr v9, v10

    int-to-double v10, v9

    iget v8, v8, Landroid/graphics/Point;->x:I

    iget v9, v7, Landroid/graphics/Point;->x:I

    sub-int/2addr v8, v9

    int-to-double v8, v8

    div-double v8, v10, v8

    iget v10, v7, Landroid/graphics/Point;->y:I

    iget v11, v4, Landroid/graphics/Point;->y:I

    sub-int/2addr v10, v11

    int-to-double v10, v10

    iget v7, v7, Landroid/graphics/Point;->x:I

    iget v4, v4, Landroid/graphics/Point;->x:I

    sub-int v4, v7, v4

    int-to-double v12, v4

    div-double/2addr v10, v12

    sub-double/2addr v8, v10

    aput-wide v8, v6, v3

    .line 1357
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 1369
    :cond_2
    const/4 v3, 0x0

    const-wide/16 v8, 0x0

    aput-wide v8, v6, v3

    .line 1370
    add-int/lit8 v3, v5, -0x1

    const-wide/16 v8, 0x0

    aput-wide v8, v6, v3

    .line 1372
    add-int/lit8 v3, v5, -0x1

    aget-object v3, v2, v3

    const/4 v4, 0x1

    const-wide/high16 v8, 0x3ff0000000000000L    # 1.0

    aput-wide v8, v3, v4

    .line 1374
    add-int/lit8 v3, v5, -0x1

    aget-object v3, v2, v3

    const/4 v4, 0x0

    const-wide/16 v8, 0x0

    aput-wide v8, v3, v4

    .line 1375
    add-int/lit8 v3, v5, -0x1

    aget-object v3, v2, v3

    const/4 v4, 0x2

    const-wide/16 v8, 0x0

    aput-wide v8, v3, v4

    .line 1378
    const/4 v3, 0x1

    :goto_2
    if-ge v3, v5, :cond_3

    .line 1379
    aget-object v4, v2, v3

    const/4 v7, 0x0

    aget-wide v8, v4, v7

    add-int/lit8 v4, v3, -0x1

    aget-object v4, v2, v4

    const/4 v7, 0x1

    aget-wide v10, v4, v7

    div-double/2addr v8, v10

    .line 1380
    aget-object v4, v2, v3

    const/4 v7, 0x1

    aget-wide v10, v4, v7

    add-int/lit8 v12, v3, -0x1

    aget-object v12, v2, v12

    const/4 v13, 0x2

    aget-wide v12, v12, v13

    mul-double/2addr v12, v8

    sub-double/2addr v10, v12

    aput-wide v10, v4, v7

    .line 1381
    aget-object v4, v2, v3

    const/4 v7, 0x0

    const-wide/16 v10, 0x0

    aput-wide v10, v4, v7

    .line 1382
    aget-wide v10, v6, v3

    add-int/lit8 v4, v3, -0x1

    aget-wide v12, v6, v4

    mul-double/2addr v8, v12

    sub-double v8, v10, v8

    aput-wide v8, v6, v3

    .line 1378
    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    .line 1385
    :cond_3
    add-int/lit8 v3, v5, -0x2

    :goto_3
    if-ltz v3, :cond_4

    .line 1386
    aget-object v4, v2, v3

    const/4 v7, 0x2

    aget-wide v8, v4, v7

    add-int/lit8 v4, v3, 0x1

    aget-object v4, v2, v4

    const/4 v7, 0x1

    aget-wide v10, v4, v7

    div-double/2addr v8, v10

    .line 1387
    aget-object v4, v2, v3

    const/4 v7, 0x1

    aget-wide v10, v4, v7

    add-int/lit8 v12, v3, 0x1

    aget-object v12, v2, v12

    const/4 v13, 0x0

    aget-wide v12, v12, v13

    mul-double/2addr v12, v8

    sub-double/2addr v10, v12

    aput-wide v10, v4, v7

    .line 1388
    aget-object v4, v2, v3

    const/4 v7, 0x2

    const-wide/16 v10, 0x0

    aput-wide v10, v4, v7

    .line 1389
    aget-wide v10, v6, v3

    add-int/lit8 v4, v3, 0x1

    aget-wide v12, v6, v4

    mul-double/2addr v8, v12

    sub-double v8, v10, v8

    aput-wide v8, v6, v3

    .line 1385
    add-int/lit8 v3, v3, -0x1

    goto :goto_3

    .line 1392
    :cond_4
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 1393
    const/4 v4, 0x0

    :goto_4
    if-ge v4, v5, :cond_0

    aget-wide v8, v6, v4

    aget-object v7, v2, v4

    const/4 v10, 0x1

    aget-wide v10, v7, v10

    div-double/2addr v8, v10

    invoke-static {v8, v9}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v7

    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_4

    .line 304
    :cond_5
    new-array v8, v7, [D

    .line 307
    const/4 v2, 0x0

    move v4, v2

    :goto_5
    if-ge v4, v7, :cond_6

    .line 308
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Double;

    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v10

    aput-wide v10, v8, v4

    .line 307
    add-int/lit8 v2, v4, 0x1

    move v4, v2

    goto :goto_5

    .line 312
    :cond_6
    new-instance v3, Ljava/util/ArrayList;

    add-int/lit8 v2, v7, 0x1

    invoke-direct {v3, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 314
    const/4 v2, 0x0

    move v6, v2

    :goto_6
    add-int/lit8 v2, v7, -0x1

    if-ge v6, v2, :cond_a

    .line 315
    aget-object v9, p0, v6

    .line 316
    add-int/lit8 v2, v6, 0x1

    aget-object v10, p0, v2

    .line 318
    iget v2, v9, Landroid/graphics/Point;->x:I

    :goto_7
    iget v4, v10, Landroid/graphics/Point;->x:I

    if-ge v2, v4, :cond_9

    .line 319
    iget v4, v9, Landroid/graphics/Point;->x:I

    sub-int v4, v2, v4

    int-to-double v4, v4

    iget v11, v10, Landroid/graphics/Point;->x:I

    iget v12, v9, Landroid/graphics/Point;->x:I

    sub-int/2addr v11, v12

    int-to-double v12, v11

    div-double/2addr v4, v12

    .line 321
    const-wide/high16 v12, 0x3ff0000000000000L    # 1.0

    sub-double/2addr v12, v4

    .line 323
    iget v11, v10, Landroid/graphics/Point;->x:I

    iget v14, v9, Landroid/graphics/Point;->x:I

    sub-int/2addr v11, v14

    int-to-double v14, v11

    .line 325
    iget v11, v9, Landroid/graphics/Point;->y:I

    int-to-double v0, v11

    move-wide/from16 v16, v0

    mul-double v16, v16, v12

    iget v11, v10, Landroid/graphics/Point;->y:I

    int-to-double v0, v11

    move-wide/from16 v18, v0

    mul-double v18, v18, v4

    add-double v16, v16, v18

    mul-double/2addr v14, v14

    const-wide/high16 v18, 0x4018000000000000L    # 6.0

    div-double v14, v14, v18

    mul-double v18, v12, v12

    mul-double v18, v18, v12

    sub-double v12, v18, v12

    aget-wide v18, v8, v6

    mul-double v12, v12, v18

    mul-double v18, v4, v4

    mul-double v18, v18, v4

    sub-double v4, v18, v4

    add-int/lit8 v11, v6, 0x1

    aget-wide v18, v8, v11

    mul-double v4, v4, v18

    add-double/2addr v4, v12

    mul-double/2addr v4, v14

    add-double v4, v4, v16

    .line 327
    const-wide v12, 0x406fe00000000000L    # 255.0

    cmpl-double v11, v4, v12

    if-lez v11, :cond_8

    .line 328
    const-wide v4, 0x406fe00000000000L    # 255.0

    .line 333
    :cond_7
    :goto_8
    new-instance v11, Landroid/graphics/Point;

    invoke-static {v4, v5}, Ljava/lang/Math;->round(D)J

    move-result-wide v4

    long-to-int v4, v4

    invoke-direct {v11, v2, v4}, Landroid/graphics/Point;-><init>(II)V

    invoke-virtual {v3, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 318
    add-int/lit8 v2, v2, 0x1

    goto :goto_7

    .line 329
    :cond_8
    const-wide/16 v12, 0x0

    cmpg-double v11, v4, v12

    if-gez v11, :cond_7

    .line 330
    const-wide/16 v4, 0x0

    goto :goto_8

    .line 314
    :cond_9
    add-int/lit8 v2, v6, 0x1

    move v6, v2

    goto :goto_6

    .line 338
    :cond_a
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/16 v4, 0xff

    if-ne v2, v4, :cond_b

    .line 339
    move-object/from16 v0, p0

    array-length v2, v0

    add-int/lit8 v2, v2, -0x1

    aget-object v2, p0, v2

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_b
    move-object v2, v3

    .line 341
    goto/16 :goto_0
.end method

.method private a([Landroid/graphics/PointF;)Ljava/util/ArrayList;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Landroid/graphics/PointF;",
            ")",
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation

    .prologue
    const/high16 v8, 0x437f0000    # 255.0f

    const-wide/high16 v10, 0x4000000000000000L    # 2.0

    const/16 v7, 0xff

    const/4 v2, 0x0

    .line 233
    if-eqz p1, :cond_0

    array-length v0, p1

    if-gtz v0, :cond_1

    .line 234
    :cond_0
    const/4 v0, 0x0

    .line 292
    :goto_0
    return-object v0

    .line 238
    :cond_1
    invoke-virtual {p1}, [Landroid/graphics/PointF;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Landroid/graphics/PointF;

    .line 239
    new-instance v1, Ljp/co/cyberagent/android/a/ai;

    invoke-direct {v1, p0}, Ljp/co/cyberagent/android/a/ai;-><init>(Ljp/co/cyberagent/android/a/ag;)V

    invoke-static {v0, v1}, Ljava/util/Arrays;->sort([Ljava/lang/Object;Ljava/util/Comparator;)V

    .line 253
    array-length v1, v0

    new-array v3, v1, [Landroid/graphics/Point;

    move v1, v2

    .line 254
    :goto_1
    array-length v4, p1

    if-ge v1, v4, :cond_2

    .line 255
    aget-object v4, v0, v1

    .line 256
    new-instance v5, Landroid/graphics/Point;

    iget v6, v4, Landroid/graphics/PointF;->x:F

    mul-float/2addr v6, v8

    float-to-int v6, v6

    iget v4, v4, Landroid/graphics/PointF;->y:F

    mul-float/2addr v4, v8

    float-to-int v4, v4

    invoke-direct {v5, v6, v4}, Landroid/graphics/Point;-><init>(II)V

    aput-object v5, v3, v1

    .line 254
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 259
    :cond_2
    invoke-static {v3}, Ljp/co/cyberagent/android/a/ag;->a([Landroid/graphics/Point;)Ljava/util/ArrayList;

    move-result-object v1

    .line 263
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Point;

    .line 264
    iget v3, v0, Landroid/graphics/Point;->x:I

    if-lez v3, :cond_3

    .line 265
    iget v0, v0, Landroid/graphics/Point;->x:I

    :goto_2
    if-ltz v0, :cond_3

    .line 266
    new-instance v3, Landroid/graphics/Point;

    invoke-direct {v3, v0, v2}, Landroid/graphics/Point;-><init>(II)V

    invoke-virtual {v1, v2, v3}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 265
    add-int/lit8 v0, v0, -0x1

    goto :goto_2

    .line 271
    :cond_3
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Point;

    .line 272
    iget v2, v0, Landroid/graphics/Point;->x:I

    if-ge v2, v7, :cond_4

    .line 273
    iget v0, v0, Landroid/graphics/Point;->x:I

    add-int/lit8 v0, v0, 0x1

    :goto_3
    if-gt v0, v7, :cond_4

    .line 274
    new-instance v2, Landroid/graphics/Point;

    invoke-direct {v2, v0, v7}, Landroid/graphics/Point;-><init>(II)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 273
    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    .line 279
    :cond_4
    new-instance v2, Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v0

    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 280
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Point;

    .line 281
    new-instance v4, Landroid/graphics/Point;

    iget v1, v0, Landroid/graphics/Point;->x:I

    iget v5, v0, Landroid/graphics/Point;->x:I

    invoke-direct {v4, v1, v5}, Landroid/graphics/Point;-><init>(II)V

    .line 283
    iget v1, v4, Landroid/graphics/Point;->x:I

    iget v5, v0, Landroid/graphics/Point;->x:I

    sub-int/2addr v1, v5

    int-to-double v6, v1

    invoke-static {v6, v7, v10, v11}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v6

    iget v1, v4, Landroid/graphics/Point;->y:I

    iget v5, v0, Landroid/graphics/Point;->y:I

    sub-int/2addr v1, v5

    int-to-double v8, v1

    invoke-static {v8, v9, v10, v11}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v8

    add-double/2addr v6, v8

    invoke-static {v6, v7}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v6

    double-to-float v1, v6

    .line 285
    iget v4, v4, Landroid/graphics/Point;->y:I

    iget v0, v0, Landroid/graphics/Point;->y:I

    if-le v4, v0, :cond_6

    .line 286
    neg-float v0, v1

    .line 289
    :goto_5
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_5
    move-object v0, v2

    .line 292
    goto/16 :goto_0

    :cond_6
    move v0, v1

    goto :goto_5
.end method

.method static synthetic a(Ljp/co/cyberagent/android/a/ag;)[I
    .locals 1

    .prologue
    .line 33
    iget-object v0, p0, Ljp/co/cyberagent/android/a/ag;->z:[I

    return-object v0
.end method

.method static synthetic b(Ljp/co/cyberagent/android/a/ag;)Ljava/util/ArrayList;
    .locals 1

    .prologue
    .line 33
    iget-object v0, p0, Ljp/co/cyberagent/android/a/ag;->G:Ljava/util/ArrayList;

    return-object v0
.end method

.method private static b(Ljava/io/InputStream;)S
    .locals 2

    .prologue
    .line 165
    invoke-virtual {p0}, Ljava/io/InputStream;->read()I

    move-result v0

    shl-int/lit8 v0, v0, 0x8

    invoke-virtual {p0}, Ljava/io/InputStream;->read()I

    move-result v1

    or-int/2addr v0, v1

    int-to-short v0, v0

    return v0
.end method

.method static synthetic c(Ljp/co/cyberagent/android/a/ag;)Ljava/util/ArrayList;
    .locals 1

    .prologue
    .line 33
    iget-object v0, p0, Ljp/co/cyberagent/android/a/ag;->H:Ljava/util/ArrayList;

    return-object v0
.end method

.method static synthetic d(Ljp/co/cyberagent/android/a/ag;)Ljava/util/ArrayList;
    .locals 1

    .prologue
    .line 33
    iget-object v0, p0, Ljp/co/cyberagent/android/a/ag;->I:Ljava/util/ArrayList;

    return-object v0
.end method

.method static synthetic e(Ljp/co/cyberagent/android/a/ag;)Ljava/util/ArrayList;
    .locals 1

    .prologue
    .line 33
    iget-object v0, p0, Ljp/co/cyberagent/android/a/ag;->F:Ljava/util/ArrayList;

    return-object v0
.end method

.method private f()V
    .locals 1

    .prologue
    .line 193
    new-instance v0, Ljp/co/cyberagent/android/a/ah;

    invoke-direct {v0, p0}, Ljp/co/cyberagent/android/a/ah;-><init>(Ljp/co/cyberagent/android/a/ag;)V

    invoke-virtual {p0, v0}, Ljp/co/cyberagent/android/a/ag;->a(Ljava/lang/Runnable;)V

    .line 230
    return-void
.end method


# virtual methods
.method protected final a()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 111
    iget-object v0, p0, Ljp/co/cyberagent/android/a/ag;->z:[I

    aget v0, v0, v2

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 112
    const v0, 0x84c3

    invoke-static {v0}, Landroid/opengl/GLES20;->glActiveTexture(I)V

    .line 113
    const/16 v0, 0xde1

    iget-object v1, p0, Ljp/co/cyberagent/android/a/ag;->z:[I

    aget v1, v1, v2

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glBindTexture(II)V

    .line 114
    iget v0, p0, Ljp/co/cyberagent/android/a/ag;->A:I

    const/4 v1, 0x3

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glUniform1i(II)V

    .line 116
    :cond_0
    return-void
.end method

.method public final a(Ljava/io/InputStream;)V
    .locals 11

    .prologue
    const v10, 0x3b808081

    const/4 v1, 0x0

    .line 128
    :try_start_0
    invoke-static {p1}, Ljp/co/cyberagent/android/a/ag;->b(Ljava/io/InputStream;)S

    .line 129
    invoke-static {p1}, Ljp/co/cyberagent/android/a/ag;->b(Ljava/io/InputStream;)S

    move-result v3

    .line 131
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4, v3}, Ljava/util/ArrayList;-><init>(I)V

    move v2, v1

    .line 134
    :goto_0
    if-ge v2, v3, :cond_1

    .line 136
    invoke-static {p1}, Ljp/co/cyberagent/android/a/ag;->b(Ljava/io/InputStream;)S

    move-result v5

    .line 138
    new-array v6, v5, [Landroid/graphics/PointF;

    move v0, v1

    .line 144
    :goto_1
    if-ge v0, v5, :cond_0

    .line 145
    invoke-static {p1}, Ljp/co/cyberagent/android/a/ag;->b(Ljava/io/InputStream;)S

    move-result v7

    .line 146
    invoke-static {p1}, Ljp/co/cyberagent/android/a/ag;->b(Ljava/io/InputStream;)S

    move-result v8

    .line 148
    new-instance v9, Landroid/graphics/PointF;

    int-to-float v8, v8

    mul-float/2addr v8, v10

    int-to-float v7, v7

    mul-float/2addr v7, v10

    invoke-direct {v9, v8, v7}, Landroid/graphics/PointF;-><init>(FF)V

    aput-object v9, v6, v0

    .line 144
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 151
    :cond_0
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 134
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_0

    .line 153
    :cond_1
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V

    .line 155
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Landroid/graphics/PointF;

    iput-object v0, p0, Ljp/co/cyberagent/android/a/ag;->B:[Landroid/graphics/PointF;

    .line 156
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Landroid/graphics/PointF;

    iput-object v0, p0, Ljp/co/cyberagent/android/a/ag;->C:[Landroid/graphics/PointF;

    .line 157
    const/4 v0, 0x2

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Landroid/graphics/PointF;

    iput-object v0, p0, Ljp/co/cyberagent/android/a/ag;->D:[Landroid/graphics/PointF;

    .line 158
    const/4 v0, 0x3

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Landroid/graphics/PointF;

    iput-object v0, p0, Ljp/co/cyberagent/android/a/ag;->E:[Landroid/graphics/PointF;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 162
    :goto_2
    return-void

    .line 160
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_2
.end method

.method public final c()V
    .locals 7

    .prologue
    const/16 v6, 0x2601

    const/4 v5, 0x1

    const/4 v4, -0x1

    const/16 v3, 0xde1

    const/4 v2, 0x0

    .line 80
    invoke-super {p0}, Ljp/co/cyberagent/android/a/h;->c()V

    .line 81
    invoke-virtual {p0}, Ljp/co/cyberagent/android/a/ag;->p()I

    move-result v0

    const-string v1, "toneCurveTexture"

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Ljp/co/cyberagent/android/a/ag;->A:I

    .line 82
    const v0, 0x84c3

    invoke-static {v0}, Landroid/opengl/GLES20;->glActiveTexture(I)V

    .line 83
    iget-object v0, p0, Ljp/co/cyberagent/android/a/ag;->z:[I

    invoke-static {v5, v0, v2}, Landroid/opengl/GLES20;->glGenTextures(I[II)V

    .line 84
    iget-object v0, p0, Ljp/co/cyberagent/android/a/ag;->z:[I

    aget v0, v0, v2

    if-ne v0, v4, :cond_0

    .line 85
    iget-object v0, p0, Ljp/co/cyberagent/android/a/ag;->z:[I

    invoke-static {v5, v0, v2}, Landroid/opengl/GLES20;->glGenTextures(I[II)V

    .line 87
    :cond_0
    iget-object v0, p0, Ljp/co/cyberagent/android/a/ag;->z:[I

    aget v0, v0, v2

    if-ne v0, v4, :cond_1

    .line 88
    iget-object v0, p0, Ljp/co/cyberagent/android/a/ag;->z:[I

    invoke-static {v5, v0, v2}, Landroid/opengl/GLES20;->glGenTextures(I[II)V

    .line 90
    :cond_1
    iget-object v0, p0, Ljp/co/cyberagent/android/a/ag;->z:[I

    aget v0, v0, v2

    if-ne v0, v4, :cond_2

    .line 91
    const-string v0, "OpenglError"

    const-string v1, "T:opengl can\'t allocate texture....."

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 93
    :cond_2
    iget-object v0, p0, Ljp/co/cyberagent/android/a/ag;->z:[I

    aget v0, v0, v2

    invoke-static {v3, v0}, Landroid/opengl/GLES20;->glBindTexture(II)V

    .line 94
    const/16 v0, 0x2801

    invoke-static {v3, v0, v6}, Landroid/opengl/GLES20;->glTexParameteri(III)V

    .line 95
    const/16 v0, 0x2800

    invoke-static {v3, v0, v6}, Landroid/opengl/GLES20;->glTexParameteri(III)V

    .line 96
    const/16 v0, 0x2802

    const v1, 0x812f

    invoke-static {v3, v0, v1}, Landroid/opengl/GLES20;->glTexParameteri(III)V

    .line 97
    const/16 v0, 0x2803

    const v1, 0x812f

    invoke-static {v3, v0, v1}, Landroid/opengl/GLES20;->glTexParameteri(III)V

    .line 98
    return-void
.end method

.method public final d()V
    .locals 1

    .prologue
    .line 102
    invoke-super {p0}, Ljp/co/cyberagent/android/a/h;->d()V

    .line 103
    iget-object v0, p0, Ljp/co/cyberagent/android/a/ag;->B:[Landroid/graphics/PointF;

    .line 1169
    iput-object v0, p0, Ljp/co/cyberagent/android/a/ag;->B:[Landroid/graphics/PointF;

    .line 1170
    iget-object v0, p0, Ljp/co/cyberagent/android/a/ag;->B:[Landroid/graphics/PointF;

    invoke-direct {p0, v0}, Ljp/co/cyberagent/android/a/ag;->a([Landroid/graphics/PointF;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Ljp/co/cyberagent/android/a/ag;->F:Ljava/util/ArrayList;

    .line 1171
    invoke-direct {p0}, Ljp/co/cyberagent/android/a/ag;->f()V

    .line 104
    iget-object v0, p0, Ljp/co/cyberagent/android/a/ag;->C:[Landroid/graphics/PointF;

    .line 1175
    iput-object v0, p0, Ljp/co/cyberagent/android/a/ag;->C:[Landroid/graphics/PointF;

    .line 1176
    iget-object v0, p0, Ljp/co/cyberagent/android/a/ag;->C:[Landroid/graphics/PointF;

    invoke-direct {p0, v0}, Ljp/co/cyberagent/android/a/ag;->a([Landroid/graphics/PointF;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Ljp/co/cyberagent/android/a/ag;->G:Ljava/util/ArrayList;

    .line 1177
    invoke-direct {p0}, Ljp/co/cyberagent/android/a/ag;->f()V

    .line 105
    iget-object v0, p0, Ljp/co/cyberagent/android/a/ag;->D:[Landroid/graphics/PointF;

    .line 1181
    iput-object v0, p0, Ljp/co/cyberagent/android/a/ag;->D:[Landroid/graphics/PointF;

    .line 1182
    iget-object v0, p0, Ljp/co/cyberagent/android/a/ag;->D:[Landroid/graphics/PointF;

    invoke-direct {p0, v0}, Ljp/co/cyberagent/android/a/ag;->a([Landroid/graphics/PointF;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Ljp/co/cyberagent/android/a/ag;->H:Ljava/util/ArrayList;

    .line 1183
    invoke-direct {p0}, Ljp/co/cyberagent/android/a/ag;->f()V

    .line 106
    iget-object v0, p0, Ljp/co/cyberagent/android/a/ag;->E:[Landroid/graphics/PointF;

    .line 1187
    iput-object v0, p0, Ljp/co/cyberagent/android/a/ag;->E:[Landroid/graphics/PointF;

    .line 1188
    iget-object v0, p0, Ljp/co/cyberagent/android/a/ag;->E:[Landroid/graphics/PointF;

    invoke-direct {p0, v0}, Ljp/co/cyberagent/android/a/ag;->a([Landroid/graphics/PointF;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Ljp/co/cyberagent/android/a/ag;->I:Ljava/util/ArrayList;

    .line 1189
    invoke-direct {p0}, Ljp/co/cyberagent/android/a/ag;->f()V

    .line 107
    return-void
.end method

.method public final e()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 119
    invoke-super {p0}, Ljp/co/cyberagent/android/a/h;->e()V

    .line 120
    const/4 v0, 0x1

    iget-object v1, p0, Ljp/co/cyberagent/android/a/ag;->z:[I

    invoke-static {v0, v1, v2}, Landroid/opengl/GLES20;->glDeleteTextures(I[II)V

    .line 121
    iget-object v0, p0, Ljp/co/cyberagent/android/a/ag;->z:[I

    const/4 v1, -0x1

    aput v1, v0, v2

    .line 122
    return-void
.end method
