.class public final Lkik/android/util/r;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Z

.field private static b:I

.field private static final c:Lkik/android/util/as;

.field private static final d:Lorg/c/b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 45
    invoke-static {}, Lkik/android/util/DeviceUtils;->c()Z

    move-result v0

    sput-boolean v0, Lkik/android/util/r;->a:Z

    .line 46
    const/16 v0, 0x800

    sput v0, Lkik/android/util/r;->b:I

    .line 47
    new-instance v0, Lkik/android/util/as;

    sget v1, Lkik/android/util/r;->b:I

    invoke-direct {v0, v1}, Lkik/android/util/as;-><init>(I)V

    sput-object v0, Lkik/android/util/r;->c:Lkik/android/util/as;

    .line 52
    const-string v0, "BitmapUtils"

    invoke-static {v0}, Lorg/c/c;->a(Ljava/lang/String;)Lorg/c/b;

    move-result-object v0

    sput-object v0, Lkik/android/util/r;->d:Lorg/c/b;

    return-void
.end method

.method public static a(Ljava/lang/String;)I
    .locals 4

    .prologue
    const/4 v0, -0x1

    .line 372
    if-nez p0, :cond_0

    .line 380
    :goto_0
    return v0

    .line 376
    :cond_0
    :try_start_0
    new-instance v1, Landroid/media/ExifInterface;

    invoke-direct {v1, p0}, Landroid/media/ExifInterface;-><init>(Ljava/lang/String;)V

    .line 377
    const-string v2, "Orientation"

    const/4 v3, 0x1

    invoke-virtual {v1, v2, v3}, Landroid/media/ExifInterface;->getAttributeInt(Ljava/lang/String;I)I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    goto :goto_0

    .line 380
    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method public static a(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    .locals 1

    .prologue
    .line 79
    const/4 v0, 0x4

    invoke-static {p0, v0}, Lkik/android/util/r;->a(Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method

.method public static a(Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;
    .locals 12

    .prologue
    const/4 v8, 0x0

    .line 90
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v10

    .line 95
    if-nez p0, :cond_1

    .line 96
    sget-object v0, Lkik/android/util/r;->d:Lorg/c/b;

    const-string v1, "createBlurredBitmap: null bitmap"

    invoke-interface {v0, v1}, Lorg/c/b;->a(Ljava/lang/String;)V

    .line 150
    :cond_0
    :goto_0
    return-object v8

    .line 99
    :cond_1
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_0

    .line 103
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    .line 104
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    .line 105
    sget-boolean v2, Lkik/android/util/r;->a:Z

    if-eqz v2, :cond_2

    .line 106
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "- input bitmap: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " x "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 108
    :cond_2
    div-int/2addr v0, p1

    .line 109
    div-int/2addr v1, p1

    .line 110
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v2

    .line 111
    const/16 v3, 0xc

    if-ge v2, v3, :cond_3

    .line 113
    const/high16 v3, 0x41400000    # 12.0f

    int-to-float v2, v2

    div-float v2, v3, v2

    .line 114
    int-to-float v0, v0

    mul-float/2addr v0, v2

    float-to-int v0, v0

    .line 115
    int-to-float v1, v1

    mul-float/2addr v1, v2

    float-to-int v1, v1

    .line 117
    :cond_3
    if-lez v0, :cond_8

    if-lez v1, :cond_8

    .line 118
    const/4 v2, 0x1

    invoke-static {p0, v0, v1, v2}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 121
    sget-boolean v1, Lkik/android/util/r;->a:Z

    if-eqz v1, :cond_4

    .line 122
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "- after resize: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " x "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 126
    :cond_4
    :try_start_0
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v7

    sget-boolean v1, Lkik/android/util/r;->a:Z

    if-eqz v1, :cond_5

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "boxBlur(): input: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " x "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    :cond_5
    mul-int v2, v3, v7

    sget-object v1, Lkik/android/util/r;->c:Lkik/android/util/as;

    invoke-virtual {v1, v2}, Lkik/android/util/as;->a(I)[I

    move-result-object v1

    sget-object v4, Lkik/android/util/r;->c:Lkik/android/util/as;

    invoke-virtual {v4, v2}, Lkik/android/util/as;->a(I)[I

    move-result-object v9

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move v6, v3

    invoke-virtual/range {v0 .. v7}, Landroid/graphics/Bitmap;->getPixels([IIIIIII)V

    invoke-static {v1, v9, v3, v7}, Lkik/android/util/r;->a([I[III)V

    invoke-static {v9, v1, v7, v3}, Lkik/android/util/r;->a([I[III)V

    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v1, v3, v7, v2}, Landroid/graphics/Bitmap;->createBitmap([IIILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v2

    sget-object v3, Lkik/android/util/r;->c:Lkik/android/util/as;

    invoke-virtual {v3, v1}, Lkik/android/util/as;->a([I)V

    sget-object v1, Lkik/android/util/r;->c:Lkik/android/util/as;

    invoke-virtual {v1, v9}, Lkik/android/util/as;->a([I)V

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-object v0, v2

    .line 133
    :goto_1
    sget-boolean v1, Lkik/android/util/r;->a:Z

    if-eqz v1, :cond_6

    .line 134
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "- after blur: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " x "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 146
    :cond_6
    :goto_2
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v2

    .line 147
    sget-boolean v1, Lkik/android/util/r;->a:Z

    if-eqz v1, :cond_7

    .line 148
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v4, "createBlurredBitmap() done (elapsed = "

    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sub-long/2addr v2, v10

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " msec)"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_7
    move-object v8, v0

    .line 150
    goto/16 :goto_0

    .line 128
    :catch_0
    move-exception v0

    .line 129
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "blur Failed with: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object v0, v8

    .line 130
    goto :goto_1

    .line 138
    :cond_8
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Trying to blur a bitmap with invalid height: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " or width: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 139
    invoke-static {v0}, Lcom/a/a/a;->a(Ljava/lang/String;)V

    move-object v0, v8

    .line 143
    goto :goto_2
.end method

.method public static a(Landroid/graphics/Bitmap;II)Landroid/graphics/Bitmap;
    .locals 7

    .prologue
    const/4 v1, 0x0

    .line 352
    if-nez p0, :cond_0

    .line 353
    const/4 v0, 0x0

    .line 362
    :goto_0
    return-object v0

    .line 355
    :cond_0
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    .line 356
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v4

    .line 357
    int-to-float v0, p1

    int-to-float v2, v3

    div-float/2addr v0, v2

    .line 358
    int-to-float v2, p2

    int-to-float v5, v4

    div-float/2addr v2, v5

    .line 359
    new-instance v5, Landroid/graphics/Matrix;

    invoke-direct {v5}, Landroid/graphics/Matrix;-><init>()V

    .line 360
    invoke-virtual {v5, v0, v2}, Landroid/graphics/Matrix;->postScale(FF)Z

    move-object v0, p0

    move v2, v1

    move v6, v1

    .line 362
    invoke-static/range {v0 .. v6}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;

    move-result-object v0

    goto :goto_0
.end method

.method private static a([I[III)V
    .locals 11

    .prologue
    .line 222
    const/4 v0, 0x0

    .line 225
    const/4 v7, 0x0

    move v8, v0

    :goto_0
    if-ge v7, p3, :cond_7

    .line 226
    const/4 v3, 0x0

    .line 227
    const/4 v2, 0x0

    .line 228
    const/4 v1, 0x0

    .line 233
    const/4 v0, 0x0

    move v5, v0

    move v6, v7

    move v4, v1

    :goto_1
    if-ge v5, p2, :cond_6

    .line 234
    if-nez v5, :cond_2

    .line 235
    aget v0, p0, v8

    .line 236
    const/high16 v1, 0xff0000

    and-int/2addr v1, v0

    shr-int/lit8 v1, v1, 0x10

    add-int/2addr v3, v1

    .line 237
    const v1, 0xff00

    and-int/2addr v1, v0

    shr-int/lit8 v1, v1, 0x8

    add-int/2addr v2, v1

    .line 238
    and-int/lit16 v0, v0, 0xff

    add-int v1, v4, v0

    .line 239
    const/4 v0, 0x1

    move v4, v0

    :goto_2
    const/4 v0, 0x4

    if-gt v4, v0, :cond_1

    .line 240
    add-int v0, v8, v4

    aget v9, p0, v0

    .line 241
    const/4 v0, 0x1

    .line 242
    const/4 v10, 0x4

    if-ne v4, v10, :cond_0

    .line 245
    const/4 v0, 0x0

    .line 247
    :cond_0
    const/high16 v10, 0xff0000

    and-int/2addr v10, v9

    shr-int/lit8 v10, v10, 0x10

    shl-int/2addr v10, v0

    add-int/2addr v3, v10

    .line 248
    const v10, 0xff00

    and-int/2addr v10, v9

    shr-int/lit8 v10, v10, 0x8

    shl-int/2addr v10, v0

    add-int/2addr v2, v10

    .line 249
    and-int/lit16 v9, v9, 0xff

    shl-int v0, v9, v0

    add-int/2addr v1, v0

    .line 239
    add-int/lit8 v0, v4, 0x1

    move v4, v0

    goto :goto_2

    :cond_1
    move v0, v1

    move v1, v2

    move v2, v3

    .line 287
    :goto_3
    const/high16 v3, -0x1000000

    shr-int/lit8 v4, v2, 0x3

    shl-int/lit8 v4, v4, 0x10

    or-int/2addr v3, v4

    shr-int/lit8 v4, v1, 0x3

    shl-int/lit8 v4, v4, 0x8

    or-int/2addr v3, v4

    shr-int/lit8 v4, v0, 0x3

    or-int/2addr v3, v4

    aput v3, p1, v6

    .line 290
    add-int v4, v6, p3

    .line 233
    add-int/lit8 v3, v5, 0x1

    move v5, v3

    move v6, v4

    move v4, v0

    move v3, v2

    move v2, v1

    goto :goto_1

    .line 254
    :cond_2
    add-int v0, v8, v5

    add-int/lit8 v0, v0, 0x4

    .line 256
    add-int v1, v8, v5

    add-int/lit8 v1, v1, -0x4

    .line 258
    add-int/lit8 v9, v5, 0x4

    if-lt v9, p2, :cond_3

    .line 260
    add-int v0, v8, p2

    add-int/lit8 v0, v0, -0x2

    add-int/lit8 v9, v5, 0x4

    sub-int/2addr v9, p2

    sub-int/2addr v0, v9

    .line 264
    :cond_3
    if-gez v0, :cond_4

    .line 265
    const/4 v0, 0x0

    .line 267
    :cond_4
    array-length v9, p0

    if-lt v0, v9, :cond_5

    .line 268
    array-length v0, p0

    add-int/lit8 v0, v0, -0x1

    .line 271
    :cond_5
    aget v0, p0, v0

    .line 272
    const/high16 v9, 0xff0000

    and-int/2addr v9, v0

    shr-int/lit8 v9, v9, 0x10

    add-int/2addr v3, v9

    .line 273
    const v9, 0xff00

    and-int/2addr v9, v0

    shr-int/lit8 v9, v9, 0x8

    add-int/2addr v9, v2

    .line 274
    and-int/lit16 v0, v0, 0xff

    add-int/2addr v4, v0

    .line 276
    add-int/lit8 v0, v5, -0x4

    if-gez v0, :cond_8

    .line 279
    add-int/lit8 v0, v8, 0x4

    sub-int/2addr v0, v5

    .line 281
    :goto_4
    aget v0, p0, v0

    .line 282
    const/high16 v1, 0xff0000

    and-int/2addr v1, v0

    shr-int/lit8 v1, v1, 0x10

    sub-int v2, v3, v1

    .line 283
    const v1, 0xff00

    and-int/2addr v1, v0

    shr-int/lit8 v1, v1, 0x8

    sub-int v1, v9, v1

    .line 284
    and-int/lit16 v0, v0, 0xff

    sub-int v0, v4, v0

    goto :goto_3

    .line 292
    :cond_6
    add-int v0, v8, p2

    .line 225
    add-int/lit8 v7, v7, 0x1

    move v8, v0

    goto/16 :goto_0

    .line 294
    :cond_7
    return-void

    :cond_8
    move v0, v1

    goto :goto_4
.end method

.method public static b(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    .locals 3

    .prologue
    .line 298
    if-nez p0, :cond_0

    .line 299
    sget-object v0, Lkik/android/util/r;->d:Lorg/c/b;

    const-string v1, "getWhiteTintedBitmap: null bitmap"

    invoke-interface {v0, v1}, Lorg/c/b;->a(Ljava/lang/String;)V

    .line 300
    const/4 p0, 0x0

    .line 311
    :goto_0
    return-object p0

    .line 302
    :cond_0
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    move-result-object v0

    if-nez v0, :cond_1

    .line 303
    new-instance v0, Ljava/lang/Throwable;

    const-string v1, "Bitmap configuration returned null"

    invoke-direct {v0, v1}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lkik/android/util/bx;->f(Ljava/lang/Throwable;)V

    goto :goto_0

    .line 306
    :cond_1
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Landroid/graphics/Bitmap;->copy(Landroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;

    move-result-object p0

    .line 307
    new-instance v0, Landroid/graphics/Canvas;

    invoke-direct {v0, p0}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 308
    new-instance v1, Landroid/graphics/Paint;

    invoke-direct {v1}, Landroid/graphics/Paint;-><init>()V

    .line 309
    const v2, -0x29000001

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 310
    invoke-virtual {v0, v1}, Landroid/graphics/Canvas;->drawPaint(Landroid/graphics/Paint;)V

    goto :goto_0
.end method

.method public static b(Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;
    .locals 7

    .prologue
    const/high16 v6, 0x43340000    # 180.0f

    const/high16 v4, 0x42b40000    # 90.0f

    const/high16 v3, -0x3d4c0000    # -90.0f

    const/high16 v2, 0x3f800000    # 1.0f

    const/high16 v1, -0x40800000    # -1.0f

    .line 392
    if-nez p0, :cond_1

    .line 393
    const/4 p0, 0x0

    .line 436
    :cond_0
    :goto_0
    return-object p0

    .line 395
    :cond_1
    const/4 v0, 0x1

    if-eq p1, v0, :cond_0

    .line 399
    new-instance v5, Landroid/graphics/Matrix;

    invoke-direct {v5}, Landroid/graphics/Matrix;-><init>()V

    .line 400
    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 402
    :pswitch_0
    invoke-virtual {v5, v1, v2}, Landroid/graphics/Matrix;->setScale(FF)V

    .line 430
    :goto_1
    const/4 v1, 0x0

    const/4 v2, 0x0

    :try_start_0
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v4

    const/4 v6, 0x1

    move-object v0, p0

    invoke-static/range {v0 .. v6}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 431
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->recycle()V
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    move-object p0, v0

    .line 432
    goto :goto_0

    .line 405
    :pswitch_1
    invoke-virtual {v5, v6}, Landroid/graphics/Matrix;->setRotate(F)V

    goto :goto_1

    .line 408
    :pswitch_2
    invoke-virtual {v5, v6}, Landroid/graphics/Matrix;->setRotate(F)V

    .line 409
    invoke-virtual {v5, v1, v2}, Landroid/graphics/Matrix;->postScale(FF)Z

    goto :goto_1

    .line 412
    :pswitch_3
    invoke-virtual {v5, v4}, Landroid/graphics/Matrix;->setRotate(F)V

    .line 413
    invoke-virtual {v5, v1, v2}, Landroid/graphics/Matrix;->postScale(FF)Z

    goto :goto_1

    .line 416
    :pswitch_4
    invoke-virtual {v5, v4}, Landroid/graphics/Matrix;->setRotate(F)V

    goto :goto_1

    .line 419
    :pswitch_5
    invoke-virtual {v5, v3}, Landroid/graphics/Matrix;->setRotate(F)V

    .line 420
    invoke-virtual {v5, v1, v2}, Landroid/graphics/Matrix;->postScale(FF)Z

    goto :goto_1

    .line 423
    :pswitch_6
    invoke-virtual {v5, v3}, Landroid/graphics/Matrix;->setRotate(F)V

    goto :goto_1

    .line 434
    :catch_0
    move-exception v0

    invoke-static {v0}, Lkik/android/util/bx;->a(Ljava/lang/Throwable;)V

    goto :goto_0

    .line 400
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
    .end packed-switch
.end method

.method public static c(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    .locals 6

    .prologue
    const/high16 v4, 0x43c80000    # 400.0f

    const/16 v1, 0x190

    .line 316
    if-nez p0, :cond_1

    .line 317
    const/4 p0, 0x0

    .line 339
    :cond_0
    :goto_0
    return-object p0

    .line 319
    :cond_1
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    .line 320
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    .line 322
    invoke-static {v0, v2}, Ljava/lang/Math;->max(II)I

    move-result v3

    .line 323
    if-le v3, v1, :cond_0

    .line 328
    if-ne v3, v0, :cond_2

    .line 330
    int-to-float v0, v0

    div-float v0, v4, v0

    .line 331
    int-to-float v2, v2

    mul-float/2addr v0, v2

    float-to-int v0, v0

    .line 339
    :goto_1
    invoke-static {p0, v1, v0}, Lkik/android/util/r;->a(Landroid/graphics/Bitmap;II)Landroid/graphics/Bitmap;

    move-result-object p0

    goto :goto_0

    .line 335
    :cond_2
    int-to-float v2, v2

    div-float v2, v4, v2

    .line 336
    int-to-float v0, v0

    mul-float/2addr v0, v2

    float-to-int v0, v0

    move v5, v1

    move v1, v0

    move v0, v5

    goto :goto_1
.end method

.method public static d(Landroid/graphics/Bitmap;)Z
    .locals 10

    .prologue
    const/16 v9, 0xe0

    const/4 v2, 0x0

    .line 448
    if-nez p0, :cond_1

    .line 486
    :cond_0
    :goto_0
    return v2

    .line 451
    :cond_1
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    .line 452
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v7

    .line 454
    mul-int v0, v3, v7

    .line 455
    sget-object v1, Lkik/android/util/r;->c:Lkik/android/util/as;

    invoke-virtual {v1, v0}, Lkik/android/util/as;->a(I)[I

    move-result-object v1

    move-object v0, p0

    move v4, v2

    move v5, v2

    move v6, v3

    .line 458
    invoke-virtual/range {v0 .. v7}, Landroid/graphics/Bitmap;->getPixels([IIIIIII)V

    move v0, v2

    move v3, v2

    .line 460
    :goto_1
    array-length v4, v1

    if-ge v0, v4, :cond_0

    .line 461
    aget v4, v1, v0

    .line 462
    shr-int/lit8 v5, v4, 0x18

    and-int/lit16 v5, v5, 0xff

    .line 463
    const/high16 v6, 0xff0000

    and-int/2addr v6, v4

    shr-int/lit8 v6, v6, 0x10

    .line 464
    const v7, 0xff00

    and-int/2addr v7, v4

    shr-int/lit8 v7, v7, 0x8

    .line 465
    and-int/lit16 v4, v4, 0xff

    .line 467
    const/4 v8, 0x5

    if-ge v5, v8, :cond_3

    .line 469
    add-int/lit8 v3, v3, 0x1

    .line 475
    :cond_2
    :goto_2
    array-length v4, v1

    div-int/lit8 v4, v4, 0x2

    if-le v3, v4, :cond_4

    .line 478
    const/4 v2, 0x1

    goto :goto_0

    .line 471
    :cond_3
    if-le v6, v9, :cond_2

    if-le v7, v9, :cond_2

    if-le v4, v9, :cond_2

    .line 473
    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    .line 480
    :cond_4
    array-length v4, v1

    sub-int/2addr v4, v0

    add-int/2addr v4, v3

    array-length v5, v1

    div-int/lit8 v5, v5, 0x2

    if-lt v4, v5, :cond_0

    .line 460
    add-int/lit8 v0, v0, 0x1

    goto :goto_1
.end method
