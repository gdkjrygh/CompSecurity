.class public final Lkik/android/util/u;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:[I

.field private static final b:Lorg/c/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 49
    const/4 v0, 0x3

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, Lkik/android/util/u;->a:[I

    .line 52
    const-string v0, "CameraUtils"

    invoke-static {v0}, Lorg/c/c;->a(Ljava/lang/String;)Lorg/c/b;

    move-result-object v0

    sput-object v0, Lkik/android/util/u;->b:Lorg/c/b;

    return-void

    .line 49
    nop

    :array_0
    .array-data 4
        0x15f900
        0x9c400
        0x27100
    .end array-data
.end method

.method public static a()I
    .locals 2
    .annotation build Landroid/annotation/TargetApi;
        value = 0x9
    .end annotation

    .prologue
    .line 294
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x9

    if-ge v0, v1, :cond_0

    .line 296
    const/4 v0, 0x1

    .line 298
    :goto_0
    return v0

    :cond_0
    invoke-static {}, Landroid/hardware/Camera;->getNumberOfCameras()I

    move-result v0

    goto :goto_0
.end method

.method public static a(I)I
    .locals 2

    .prologue
    const/16 v0, 0x10e

    const/16 v1, 0x5a

    .line 101
    if-ne p0, v1, :cond_1

    move p0, v0

    .line 107
    :cond_0
    :goto_0
    return p0

    .line 104
    :cond_1
    if-ne p0, v0, :cond_0

    move p0, v1

    .line 105
    goto :goto_0
.end method

.method public static a(II)I
    .locals 3

    .prologue
    .line 112
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x9

    if-lt v0, v1, :cond_1

    .line 116
    new-instance v0, Landroid/hardware/Camera$CameraInfo;

    invoke-direct {v0}, Landroid/hardware/Camera$CameraInfo;-><init>()V

    .line 117
    invoke-static {p1, v0}, Landroid/hardware/Camera;->getCameraInfo(ILandroid/hardware/Camera$CameraInfo;)V

    .line 118
    iget v1, v0, Landroid/hardware/Camera$CameraInfo;->facing:I

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    .line 119
    iget v0, v0, Landroid/hardware/Camera$CameraInfo;->orientation:I

    add-int/2addr v0, p0

    rem-int/lit16 v0, v0, 0x168

    .line 120
    rsub-int v0, v0, 0x168

    rem-int/lit16 v0, v0, 0x168

    .line 129
    :goto_0
    return v0

    .line 123
    :cond_0
    iget v0, v0, Landroid/hardware/Camera$CameraInfo;->orientation:I

    sub-int/2addr v0, p0

    add-int/lit16 v0, v0, 0x168

    rem-int/lit16 v0, v0, 0x168

    goto :goto_0

    .line 127
    :cond_1
    rsub-int/lit8 v0, p0, 0x5a

    add-int/lit16 v0, v0, 0x168

    rem-int/lit16 v0, v0, 0x168

    goto :goto_0
.end method

.method public static a(Landroid/app/Activity;)I
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 62
    if-nez p0, :cond_0

    .line 77
    :goto_0
    :pswitch_0
    return v0

    .line 65
    :cond_0
    invoke-virtual {p0}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v1

    invoke-interface {v1}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/Display;->getRotation()I

    move-result v1

    .line 67
    packed-switch v1, :pswitch_data_0

    goto :goto_0

    .line 71
    :pswitch_1
    const/16 v0, 0x5a

    goto :goto_0

    .line 73
    :pswitch_2
    const/16 v0, 0xb4

    goto :goto_0

    .line 75
    :pswitch_3
    const/16 v0, 0x10e

    goto :goto_0

    .line 67
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method public static a(Landroid/graphics/BitmapFactory$Options;II)I
    .locals 10

    .prologue
    const/4 v0, 0x1

    .line 502
    iget v1, p0, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    int-to-double v2, v1

    iget v1, p0, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    int-to-double v4, v1

    if-gez p2, :cond_1

    move v1, v0

    :goto_0
    if-gez p1, :cond_2

    const/16 v2, 0x80

    :goto_1
    if-ge v2, v1, :cond_3

    .line 505
    :cond_0
    :goto_2
    const/16 v2, 0x8

    if-gt v1, v2, :cond_5

    .line 507
    :goto_3
    if-ge v0, v1, :cond_6

    .line 508
    shl-int/lit8 v0, v0, 0x1

    goto :goto_3

    .line 502
    :cond_1
    mul-double v6, v2, v4

    int-to-double v8, p2

    div-double/2addr v6, v8

    invoke-static {v6, v7}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v6

    double-to-int v1, v6

    goto :goto_0

    :cond_2
    int-to-double v6, p1

    div-double/2addr v2, v6

    invoke-static {v2, v3}, Ljava/lang/Math;->floor(D)D

    move-result-wide v2

    int-to-double v6, p1

    div-double/2addr v4, v6

    invoke-static {v4, v5}, Ljava/lang/Math;->floor(D)D

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->min(DD)D

    move-result-wide v2

    double-to-int v2, v2

    goto :goto_1

    :cond_3
    if-gez p2, :cond_4

    if-gez p1, :cond_4

    move v1, v0

    goto :goto_2

    :cond_4
    if-ltz p1, :cond_0

    move v1, v2

    goto :goto_2

    .line 512
    :cond_5
    add-int/lit8 v0, v1, 0x7

    div-int/lit8 v0, v0, 0x8

    mul-int/lit8 v0, v0, 0x8

    .line 515
    :cond_6
    return v0
.end method

.method public static a(Landroid/hardware/Camera$CameraInfo;I)I
    .locals 3

    .prologue
    .line 550
    const/4 v0, 0x0

    .line 551
    const/4 v1, -0x1

    if-eq p1, v1, :cond_0

    .line 552
    iget v0, p0, Landroid/hardware/Camera$CameraInfo;->orientation:I

    .line 553
    iget v1, p0, Landroid/hardware/Camera$CameraInfo;->facing:I

    const/4 v2, 0x1

    if-ne v1, v2, :cond_1

    .line 554
    sub-int/2addr v0, p1

    add-int/lit16 v0, v0, 0x168

    rem-int/lit16 v0, v0, 0x168

    .line 560
    :cond_0
    :goto_0
    return v0

    .line 557
    :cond_1
    add-int/2addr v0, p1

    rem-int/lit16 v0, v0, 0x168

    goto :goto_0
.end method

.method public static a(Ljava/lang/String;)Landroid/graphics/Bitmap;
    .locals 5

    .prologue
    const/16 v4, 0x190

    const/4 v3, -0x1

    const/4 v0, 0x0

    .line 400
    :try_start_0
    new-instance v1, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v1}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 401
    const/4 v2, 0x1

    iput-boolean v2, v1, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 402
    invoke-static {p0, v1}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 403
    iget-boolean v2, v1, Landroid/graphics/BitmapFactory$Options;->mCancel:Z

    if-nez v2, :cond_0

    iget v2, v1, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    if-eq v2, v3, :cond_0

    iget v2, v1, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    if-ne v2, v3, :cond_1

    .line 428
    :cond_0
    :goto_0
    return-object v0

    .line 409
    :cond_1
    const/16 v2, 0x190

    const/16 v3, 0x50

    invoke-static {v1, v2, v3}, Lkik/android/util/u;->b(Landroid/graphics/BitmapFactory$Options;II)I

    move-result v2

    iput v2, v1, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 410
    const/4 v2, 0x0

    iput-boolean v2, v1, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 412
    const/4 v2, 0x0

    iput-boolean v2, v1, Landroid/graphics/BitmapFactory$Options;->inDither:Z

    .line 413
    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    iput-object v2, v1, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;

    .line 414
    invoke-static {p0, v1}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 415
    if-eqz v1, :cond_0

    .line 418
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v3

    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    move-result v2

    .line 419
    if-ge v2, v4, :cond_2

    move-object v0, v1

    .line 421
    goto :goto_0

    .line 423
    :cond_2
    const/high16 v3, 0x43c80000    # 400.0f

    int-to-float v2, v2

    div-float v2, v3, v2

    .line 424
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    int-to-float v3, v3

    mul-float/2addr v3, v2

    float-to-int v3, v3

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v4

    int-to-float v4, v4

    mul-float/2addr v2, v4

    float-to-int v2, v2

    const/4 v4, 0x1

    invoke-static {v1, v3, v2, v4}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    goto :goto_0

    .line 426
    :catch_0
    move-exception v1

    invoke-static {v1}, Lkik/android/util/bx;->a(Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method public static a([BI)Landroid/graphics/Bitmap;
    .locals 5

    .prologue
    const/4 v0, 0x0

    const/4 v4, -0x1

    .line 322
    :try_start_0
    new-instance v1, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v1}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 323
    const/4 v2, 0x1

    iput-boolean v2, v1, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 324
    const/4 v2, 0x0

    array-length v3, p0

    invoke-static {p0, v2, v3, v1}, Landroid/graphics/BitmapFactory;->decodeByteArray([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 326
    iget-boolean v2, v1, Landroid/graphics/BitmapFactory$Options;->mCancel:Z

    if-nez v2, :cond_0

    iget v2, v1, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    if-eq v2, v4, :cond_0

    iget v2, v1, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    if-ne v2, v4, :cond_1

    .line 340
    :cond_0
    :goto_0
    return-object v0

    .line 330
    :cond_1
    const/4 v2, -0x1

    invoke-static {v1, v2, p1}, Lkik/android/util/u;->a(Landroid/graphics/BitmapFactory$Options;II)I

    move-result v2

    iput v2, v1, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 332
    const/4 v2, 0x0

    iput-boolean v2, v1, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 334
    const/4 v2, 0x0

    iput-boolean v2, v1, Landroid/graphics/BitmapFactory$Options;->inDither:Z

    .line 335
    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    iput-object v2, v1, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;

    .line 336
    const/4 v2, 0x0

    array-length v3, p0

    invoke-static {p0, v2, v3, v1}, Landroid/graphics/BitmapFactory;->decodeByteArray([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    goto :goto_0

    .line 340
    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method public static a([BIIII)Landroid/graphics/Bitmap;
    .locals 8

    .prologue
    const/4 v7, 0x0

    .line 681
    .line 683
    :try_start_0
    new-instance v6, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v6}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 684
    new-instance v0, Landroid/graphics/YuvImage;

    const/4 v5, 0x0

    move-object v1, p0

    move v2, p4

    move v3, p1

    move v4, p2

    invoke-direct/range {v0 .. v5}, Landroid/graphics/YuvImage;-><init>([BIII[I)V

    .line 685
    new-instance v1, Landroid/graphics/Rect;

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3, p1, p2}, Landroid/graphics/Rect;-><init>(IIII)V

    const/16 v2, 0x50

    invoke-virtual {v0, v1, v2, v6}, Landroid/graphics/YuvImage;->compressToJpeg(Landroid/graphics/Rect;ILjava/io/OutputStream;)Z

    .line 686
    invoke-virtual {v6}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    .line 687
    const/4 v1, 0x0

    array-length v2, v0

    invoke-static {v0, v1, v2}, Landroid/graphics/BitmapFactory;->decodeByteArray([BII)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 689
    new-instance v5, Landroid/graphics/Matrix;

    invoke-direct {v5}, Landroid/graphics/Matrix;-><init>()V

    .line 690
    int-to-float v1, p3

    invoke-virtual {v5, v1}, Landroid/graphics/Matrix;->postRotate(F)Z

    .line 691
    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v6, 0x1

    move v3, p1

    move v4, p2

    invoke-static/range {v0 .. v6}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v0

    .line 696
    :goto_0
    return-object v0

    .line 693
    :catch_0
    move-exception v0

    :goto_1
    invoke-static {v0}, Lkik/android/util/bx;->b(Ljava/lang/Throwable;)V

    move-object v0, v7

    goto :goto_0

    :catch_1
    move-exception v0

    goto :goto_1
.end method

.method private static a(Landroid/app/Activity;Landroid/graphics/Point;)Landroid/graphics/Point;
    .locals 3
    .annotation build Landroid/annotation/TargetApi;
        value = 0xd
    .end annotation

    .prologue
    const/4 v0, 0x0

    .line 277
    if-nez p0, :cond_0

    .line 279
    new-instance p1, Landroid/graphics/Point;

    invoke-direct {p1, v0, v0}, Landroid/graphics/Point;-><init>(II)V

    .line 288
    :goto_0
    return-object p1

    .line 281
    :cond_0
    invoke-virtual {p0}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v0

    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    .line 282
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0xd

    if-lt v1, v2, :cond_1

    .line 283
    invoke-virtual {v0, p1}, Landroid/view/Display;->getSize(Landroid/graphics/Point;)V

    goto :goto_0

    .line 286
    :cond_1
    invoke-virtual {v0}, Landroid/view/Display;->getWidth()I

    move-result v1

    invoke-virtual {v0}, Landroid/view/Display;->getHeight()I

    move-result v0

    invoke-virtual {p1, v1, v0}, Landroid/graphics/Point;->set(II)V

    goto :goto_0
.end method

.method public static a(Landroid/app/Activity;Ljava/util/List;D)Landroid/hardware/Camera$Size;
    .locals 12

    .prologue
    .line 147
    if-nez p1, :cond_1

    .line 149
    const/4 v1, 0x0

    .line 184
    :cond_0
    return-object v1

    .line 151
    :cond_1
    const/4 v1, 0x0

    .line 152
    const-wide v2, 0x7fefffffffffffffL    # Double.MAX_VALUE

    .line 159
    new-instance v0, Landroid/graphics/Point;

    invoke-direct {v0}, Landroid/graphics/Point;-><init>()V

    invoke-static {p0, v0}, Lkik/android/util/u;->a(Landroid/app/Activity;Landroid/graphics/Point;)Landroid/graphics/Point;

    move-result-object v0

    .line 160
    iget v4, v0, Landroid/graphics/Point;->x:I

    iget v0, v0, Landroid/graphics/Point;->y:I

    invoke-static {v4, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    const/16 v4, 0x500

    invoke-static {v0, v4}, Ljava/lang/Math;->max(II)I

    move-result v4

    .line 163
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_2
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/hardware/Camera$Size;

    .line 164
    iget v6, v0, Landroid/hardware/Camera$Size;->width:I

    int-to-double v6, v6

    iget v8, v0, Landroid/hardware/Camera$Size;->height:I

    int-to-double v8, v8

    div-double/2addr v6, v8

    .line 165
    sub-double/2addr v6, p2

    invoke-static {v6, v7}, Ljava/lang/Math;->abs(D)D

    move-result-wide v6

    const-wide v8, 0x3fb999999999999aL    # 0.1

    cmpl-double v6, v6, v8

    if-gtz v6, :cond_2

    .line 166
    iget v6, v0, Landroid/hardware/Camera$Size;->height:I

    sub-int/2addr v6, v4

    invoke-static {v6}, Ljava/lang/Math;->abs(I)I

    move-result v6

    int-to-double v6, v6

    cmpg-double v6, v6, v2

    if-gez v6, :cond_5

    .line 169
    iget v1, v0, Landroid/hardware/Camera$Size;->height:I

    sub-int/2addr v1, v4

    invoke-static {v1}, Ljava/lang/Math;->abs(I)I

    move-result v1

    int-to-double v2, v1

    move-wide v10, v2

    move-object v2, v0

    move-wide v0, v10

    :goto_1
    move-wide v10, v0

    move-object v1, v2

    move-wide v2, v10

    .line 171
    goto :goto_0

    .line 174
    :cond_3
    if-nez v1, :cond_0

    .line 175
    sget-object v0, Lkik/android/util/u;->b:Lorg/c/b;

    const-string v2, "No preview size match the aspect ratio"

    invoke-interface {v0, v2}, Lorg/c/b;->a(Ljava/lang/String;)V

    .line 176
    const-wide v2, 0x7fefffffffffffffL    # Double.MAX_VALUE

    .line 177
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/hardware/Camera$Size;

    .line 178
    iget v6, v0, Landroid/hardware/Camera$Size;->height:I

    sub-int/2addr v6, v4

    invoke-static {v6}, Ljava/lang/Math;->abs(I)I

    move-result v6

    int-to-double v6, v6

    cmpg-double v6, v6, v2

    if-gez v6, :cond_4

    .line 180
    iget v1, v0, Landroid/hardware/Camera$Size;->height:I

    sub-int/2addr v1, v4

    invoke-static {v1}, Ljava/lang/Math;->abs(I)I

    move-result v1

    int-to-double v2, v1

    move-wide v10, v2

    move-object v2, v0

    move-wide v0, v10

    :goto_3
    move-wide v10, v0

    move-object v1, v2

    move-wide v2, v10

    .line 182
    goto :goto_2

    :cond_4
    move-wide v10, v2

    move-object v2, v1

    move-wide v0, v10

    goto :goto_3

    :cond_5
    move-wide v10, v2

    move-object v2, v1

    move-wide v0, v10

    goto :goto_1
.end method

.method public static a(Ljava/util/List;)Landroid/hardware/Camera$Size;
    .locals 9

    .prologue
    const/4 v2, 0x0

    .line 211
    if-nez p0, :cond_1

    .line 227
    :cond_0
    return-object v2

    .line 216
    :cond_1
    const v1, 0x7fffffff

    .line 217
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/hardware/Camera$Size;

    .line 218
    iget v4, v0, Landroid/hardware/Camera$Size;->width:I

    int-to-double v4, v4

    iget v6, v0, Landroid/hardware/Camera$Size;->height:I

    int-to-double v6, v6

    div-double/2addr v4, v6

    .line 219
    const-wide v6, 0x3ff5555555555555L    # 1.3333333333333333

    sub-double v4, v6, v4

    invoke-static {v4, v5}, Ljava/lang/Math;->abs(D)D

    move-result-wide v4

    const-wide v6, 0x3f50624dd2f1a9fcL    # 0.001

    cmpg-double v4, v4, v6

    if-gtz v4, :cond_2

    iget v4, v0, Landroid/hardware/Camera$Size;->width:I

    iget v5, v0, Landroid/hardware/Camera$Size;->height:I

    invoke-static {v4, v5}, Ljava/lang/Math;->max(II)I

    move-result v4

    const/16 v5, 0x500

    if-gt v4, v5, :cond_2

    .line 220
    iget v4, v0, Landroid/hardware/Camera$Size;->width:I

    iget v5, v0, Landroid/hardware/Camera$Size;->height:I

    mul-int/2addr v4, v5

    if-gt v4, v1, :cond_2

    iget v4, v0, Landroid/hardware/Camera$Size;->width:I

    iget v5, v0, Landroid/hardware/Camera$Size;->height:I

    invoke-static {v4, v5}, Ljava/lang/Math;->min(II)I

    move-result v4

    const/16 v5, 0x1e0

    if-lt v4, v5, :cond_2

    .line 222
    iget v1, v0, Landroid/hardware/Camera$Size;->width:I

    iget v2, v0, Landroid/hardware/Camera$Size;->height:I

    mul-int/2addr v1, v2

    move v8, v1

    move-object v1, v0

    move v0, v8

    :goto_1
    move-object v2, v1

    move v1, v0

    .line 225
    goto :goto_0

    :cond_2
    move v0, v1

    move-object v1, v2

    goto :goto_1
.end method

.method public static a(Landroid/hardware/Camera$Parameters;)[B
    .locals 3

    .prologue
    .line 634
    if-nez p0, :cond_0

    .line 635
    const/4 v0, 0x0

    .line 641
    :goto_0
    return-object v0

    .line 637
    :cond_0
    invoke-virtual {p0}, Landroid/hardware/Camera$Parameters;->getPreviewSize()Landroid/hardware/Camera$Size;

    move-result-object v0

    .line 639
    invoke-virtual {p0}, Landroid/hardware/Camera$Parameters;->getPreviewFormat()I

    move-result v1

    invoke-static {v1}, Landroid/graphics/ImageFormat;->getBitsPerPixel(I)I

    move-result v1

    int-to-float v1, v1

    const/high16 v2, 0x41000000    # 8.0f

    div-float/2addr v1, v2

    .line 640
    iget v2, v0, Landroid/hardware/Camera$Size;->width:I

    iget v0, v0, Landroid/hardware/Camera$Size;->height:I

    mul-int/2addr v0, v2

    int-to-float v0, v0

    mul-float/2addr v0, v1

    float-to-int v0, v0

    .line 641
    new-array v0, v0, [B

    goto :goto_0
.end method

.method public static b()I
    .locals 5

    .prologue
    const/4 v2, -0x1

    .line 646
    invoke-static {}, Landroid/hardware/Camera;->getNumberOfCameras()I

    move-result v3

    .line 648
    const/4 v1, 0x0

    move v0, v2

    :goto_0
    if-ge v1, v3, :cond_1

    .line 649
    new-instance v4, Landroid/hardware/Camera$CameraInfo;

    invoke-direct {v4}, Landroid/hardware/Camera$CameraInfo;-><init>()V

    .line 651
    invoke-static {v1, v4}, Landroid/hardware/Camera;->getCameraInfo(ILandroid/hardware/Camera$CameraInfo;)V

    .line 652
    if-ne v0, v2, :cond_0

    iget v4, v4, Landroid/hardware/Camera$CameraInfo;->facing:I

    if-nez v4, :cond_0

    move v0, v1

    .line 648
    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 656
    :cond_1
    return v0
.end method

.method public static b(II)I
    .locals 3

    .prologue
    const/4 v0, 0x1

    .line 303
    const/4 v1, -0x1

    if-ne p1, v1, :cond_2

    .line 313
    :cond_0
    :goto_0
    if-eqz v0, :cond_1

    .line 314
    add-int/lit8 v0, p0, 0x2d

    div-int/lit8 v0, v0, 0x5a

    mul-int/lit8 v0, v0, 0x5a

    rem-int/lit16 p1, v0, 0x168

    .line 316
    :cond_1
    return p1

    .line 309
    :cond_2
    sub-int v1, p0, p1

    invoke-static {v1}, Ljava/lang/Math;->abs(I)I

    move-result v1

    .line 310
    rsub-int v2, v1, 0x168

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    .line 311
    const/16 v2, 0x32

    if-ge v1, v2, :cond_0

    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static b(Landroid/app/Activity;)I
    .locals 5

    .prologue
    const/4 v1, 0x2

    const/4 v0, 0x1

    .line 82
    if-nez p0, :cond_1

    .line 95
    :cond_0
    :goto_0
    return v0

    .line 85
    :cond_1
    invoke-virtual {p0}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v2

    invoke-interface {v2}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/Display;->getRotation()I

    move-result v2

    .line 87
    invoke-virtual {p0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v3

    .line 88
    if-eqz v2, :cond_2

    if-ne v2, v1, :cond_3

    :cond_2
    iget v4, v3, Landroid/content/res/Configuration;->orientation:I

    if-eq v4, v1, :cond_5

    :cond_3
    if-eq v2, v0, :cond_4

    const/4 v4, 0x3

    if-ne v2, v4, :cond_0

    :cond_4
    iget v2, v3, Landroid/content/res/Configuration;->orientation:I

    if-ne v2, v0, :cond_0

    :cond_5
    move v0, v1

    .line 92
    goto :goto_0
.end method

.method private static b(Landroid/graphics/BitmapFactory$Options;II)I
    .locals 6

    .prologue
    const/4 v0, 0x1

    .line 450
    if-gez p1, :cond_1

    .line 477
    :cond_0
    return v0

    .line 453
    :cond_1
    if-gez p2, :cond_2

    .line 454
    const/4 p2, 0x0

    .line 456
    :cond_2
    iget v1, p0, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    iget v2, p0, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v1

    int-to-float v2, v1

    .line 457
    sub-int v3, p1, p2

    move v1, v0

    .line 461
    :goto_0
    int-to-float v4, v0

    div-float v4, v2, v4

    int-to-float v5, p1

    cmpl-float v4, v4, v5

    if-lez v4, :cond_0

    .line 462
    const/16 v4, 0x8

    if-ge v1, v4, :cond_3

    .line 464
    shl-int/lit8 v1, v1, 0x1

    .line 471
    :goto_1
    int-to-float v4, v1

    div-float v4, v2, v4

    int-to-float v5, v3

    cmpg-float v4, v4, v5

    if-ltz v4, :cond_0

    move v0, v1

    .line 475
    goto :goto_0

    .line 469
    :cond_3
    div-int/lit8 v1, v1, 0x8

    add-int/lit8 v1, v1, 0x1

    mul-int/lit8 v1, v1, 0x8

    goto :goto_1
.end method

.method public static b([BI)Landroid/graphics/Bitmap;
    .locals 5

    .prologue
    const/4 v4, -0x1

    const/4 v0, 0x0

    .line 356
    :try_start_0
    new-instance v1, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v1}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 357
    const/4 v2, 0x1

    iput-boolean v2, v1, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 358
    const/4 v2, 0x0

    array-length v3, p0

    invoke-static {p0, v2, v3, v1}, Landroid/graphics/BitmapFactory;->decodeByteArray([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 360
    iget-boolean v2, v1, Landroid/graphics/BitmapFactory$Options;->mCancel:Z

    if-nez v2, :cond_0

    iget v2, v1, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    if-eq v2, v4, :cond_0

    iget v2, v1, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    if-ne v2, v4, :cond_1

    .line 384
    :cond_0
    :goto_0
    return-object v0

    .line 365
    :cond_1
    int-to-float v2, p1

    const v3, 0x3e4ccccd    # 0.2f

    mul-float/2addr v2, v3

    float-to-int v2, v2

    invoke-static {v1, p1, v2}, Lkik/android/util/u;->b(Landroid/graphics/BitmapFactory$Options;II)I

    move-result v2

    iput v2, v1, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 366
    const/4 v2, 0x0

    iput-boolean v2, v1, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 368
    const/4 v2, 0x0

    iput-boolean v2, v1, Landroid/graphics/BitmapFactory$Options;->inDither:Z

    .line 369
    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    iput-object v2, v1, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;

    .line 370
    const/4 v2, 0x0

    array-length v3, p0

    invoke-static {p0, v2, v3, v1}, Landroid/graphics/BitmapFactory;->decodeByteArray([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 371
    if-eqz v1, :cond_0

    .line 374
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v3

    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    move-result v2

    .line 375
    if-ge v2, p1, :cond_2

    move-object v0, v1

    .line 377
    goto :goto_0

    .line 379
    :cond_2
    int-to-float v3, p1

    int-to-float v2, v2

    div-float v2, v3, v2

    .line 380
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    int-to-float v3, v3

    mul-float/2addr v3, v2

    float-to-int v3, v3

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v4

    int-to-float v4, v4

    mul-float/2addr v2, v4

    float-to-int v2, v2

    const/4 v4, 0x1

    invoke-static {v1, v3, v2, v4}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    goto :goto_0

    .line 382
    :catch_0
    move-exception v1

    invoke-static {v1}, Lkik/android/util/bx;->a(Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method public static b(Landroid/app/Activity;Ljava/util/List;D)Landroid/hardware/Camera$Size;
    .locals 12

    .prologue
    .line 234
    if-nez p1, :cond_1

    .line 236
    const/4 v1, 0x0

    .line 270
    :cond_0
    return-object v1

    .line 238
    :cond_1
    const/4 v1, 0x0

    .line 239
    const-wide v2, 0x7fefffffffffffffL    # Double.MAX_VALUE

    .line 246
    new-instance v0, Landroid/graphics/Point;

    invoke-direct {v0}, Landroid/graphics/Point;-><init>()V

    invoke-static {p0, v0}, Lkik/android/util/u;->a(Landroid/app/Activity;Landroid/graphics/Point;)Landroid/graphics/Point;

    move-result-object v0

    .line 247
    iget v4, v0, Landroid/graphics/Point;->x:I

    iget v0, v0, Landroid/graphics/Point;->y:I

    invoke-static {v4, v0}, Ljava/lang/Math;->min(II)I

    move-result v4

    .line 249
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_2
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/hardware/Camera$Size;

    .line 250
    iget v6, v0, Landroid/hardware/Camera$Size;->width:I

    int-to-double v6, v6

    iget v8, v0, Landroid/hardware/Camera$Size;->height:I

    int-to-double v8, v8

    div-double/2addr v6, v8

    .line 251
    sub-double/2addr v6, p2

    invoke-static {v6, v7}, Ljava/lang/Math;->abs(D)D

    move-result-wide v6

    const-wide v8, 0x3f50624dd2f1a9fcL    # 0.001

    cmpl-double v6, v6, v8

    if-gtz v6, :cond_2

    .line 252
    iget v6, v0, Landroid/hardware/Camera$Size;->height:I

    sub-int/2addr v6, v4

    invoke-static {v6}, Ljava/lang/Math;->abs(I)I

    move-result v6

    int-to-double v6, v6

    cmpg-double v6, v6, v2

    if-gez v6, :cond_5

    .line 255
    iget v1, v0, Landroid/hardware/Camera$Size;->height:I

    sub-int/2addr v1, v4

    invoke-static {v1}, Ljava/lang/Math;->abs(I)I

    move-result v1

    int-to-double v2, v1

    move-wide v10, v2

    move-object v2, v0

    move-wide v0, v10

    :goto_1
    move-wide v10, v0

    move-object v1, v2

    move-wide v2, v10

    .line 257
    goto :goto_0

    .line 260
    :cond_3
    if-nez v1, :cond_0

    .line 261
    sget-object v0, Lkik/android/util/u;->b:Lorg/c/b;

    const-string v2, "No preview size match the aspect ratio"

    invoke-interface {v0, v2}, Lorg/c/b;->a(Ljava/lang/String;)V

    .line 262
    const-wide v2, 0x7fefffffffffffffL    # Double.MAX_VALUE

    .line 263
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/hardware/Camera$Size;

    .line 264
    iget v6, v0, Landroid/hardware/Camera$Size;->height:I

    sub-int/2addr v6, v4

    invoke-static {v6}, Ljava/lang/Math;->abs(I)I

    move-result v6

    int-to-double v6, v6

    cmpg-double v6, v6, v2

    if-gez v6, :cond_4

    .line 266
    iget v1, v0, Landroid/hardware/Camera$Size;->height:I

    sub-int/2addr v1, v4

    invoke-static {v1}, Ljava/lang/Math;->abs(I)I

    move-result v1

    int-to-double v2, v1

    move-wide v10, v2

    move-object v2, v0

    move-wide v0, v10

    :goto_3
    move-wide v10, v0

    move-object v1, v2

    move-wide v2, v10

    .line 268
    goto :goto_2

    :cond_4
    move-wide v10, v2

    move-object v2, v1

    move-wide v0, v10

    goto :goto_3

    :cond_5
    move-wide v10, v2

    move-object v2, v1

    move-wide v0, v10

    goto :goto_1
.end method

.method public static b(I)Landroid/hardware/Camera;
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 614
    .line 615
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x9

    if-ge v1, v2, :cond_1

    .line 629
    :cond_0
    :goto_0
    return-object v0

    .line 620
    :cond_1
    invoke-static {}, Lkik/android/util/u;->a()I

    move-result v1

    if-lt p0, v1, :cond_2

    if-ltz p0, :cond_0

    .line 622
    :cond_2
    :try_start_0
    invoke-static {p0}, Landroid/hardware/Camera;->open(I)Landroid/hardware/Camera;
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    goto :goto_0

    .line 624
    :catch_0
    move-exception v1

    const/4 v2, 0x5

    invoke-static {v1, v2}, Lkik/android/util/bx;->a(Ljava/lang/Throwable;I)V

    goto :goto_0
.end method

.method public static b(Ljava/util/List;)[I
    .locals 9

    .prologue
    const/4 v6, 0x0

    const/16 v5, 0x7530

    const/4 v8, 0x1

    const/4 v3, 0x0

    .line 579
    if-eqz p0, :cond_0

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    move-object v0, v6

    .line 609
    :goto_0
    return-object v0

    .line 583
    :cond_1
    const v0, 0x61a80

    .line 584
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    move v1, v0

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [I

    .line 585
    aget v2, v0, v3

    .line 586
    aget v0, v0, v8

    .line 587
    if-lt v0, v5, :cond_6

    if-gt v2, v5, :cond_6

    if-ge v2, v1, :cond_6

    move v0, v2

    :goto_2
    move v1, v0

    .line 592
    goto :goto_1

    .line 595
    :cond_2
    const/4 v0, -0x1

    move v2, v3

    move v4, v3

    move v5, v0

    .line 597
    :goto_3
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v2, v0, :cond_4

    .line 598
    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [I

    .line 599
    aget v7, v0, v3

    .line 600
    aget v0, v0, v8

    .line 601
    if-ne v7, v1, :cond_3

    if-ge v4, v0, :cond_3

    move v4, v0

    move v5, v2

    .line 597
    :cond_3
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_3

    .line 606
    :cond_4
    if-ltz v5, :cond_5

    .line 607
    invoke-interface {p0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [I

    goto :goto_0

    :cond_5
    move-object v0, v6

    .line 609
    goto :goto_0

    :cond_6
    move v0, v1

    goto :goto_2
.end method

.method public static c()I
    .locals 6

    .prologue
    const/4 v2, -0x1

    .line 661
    invoke-static {}, Landroid/hardware/Camera;->getNumberOfCameras()I

    move-result v3

    .line 663
    const/4 v1, 0x0

    move v0, v2

    :goto_0
    if-ge v1, v3, :cond_1

    .line 664
    new-instance v4, Landroid/hardware/Camera$CameraInfo;

    invoke-direct {v4}, Landroid/hardware/Camera$CameraInfo;-><init>()V

    .line 666
    invoke-static {v1, v4}, Landroid/hardware/Camera;->getCameraInfo(ILandroid/hardware/Camera$CameraInfo;)V

    .line 667
    if-ne v0, v2, :cond_0

    iget v4, v4, Landroid/hardware/Camera$CameraInfo;->facing:I

    const/4 v5, 0x1

    if-ne v4, v5, :cond_0

    move v0, v1

    .line 663
    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 671
    :cond_1
    return v0
.end method

.method public static d()Z
    .locals 1

    .prologue
    .line 676
    invoke-static {}, Lkik/android/util/u;->a()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
