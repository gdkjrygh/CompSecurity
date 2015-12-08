.class public final Lcom/roidapp/photogrid/release/rd;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Lcom/roidapp/photogrid/release/rd;


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    return-void
.end method

.method public static a(Landroid/content/Context;III)Landroid/graphics/Bitmap;
    .locals 8

    .prologue
    const/4 v6, 0x4

    const/4 v5, 0x2

    const/4 v0, 0x1

    const/4 v7, 0x0

    const/4 v2, 0x0

    .line 472
    new-instance v3, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v3}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 473
    iput-boolean v0, v3, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 474
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-static {v1, p1, v3}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;ILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 477
    iget v1, v3, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    iget v4, v3, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    if-le v1, v4, :cond_0

    .line 478
    iget v1, v3, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    div-int/2addr v1, p2

    .line 482
    :goto_0
    if-nez v1, :cond_3

    .line 485
    :goto_1
    iput v0, v3, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 486
    iput-boolean v7, v3, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 489
    :try_start_0
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    invoke-static {p0, p1, v3}, Lcom/roidapp/photogrid/release/rf;->a(Landroid/content/Context;ILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v0

    move-object v1, v0

    .line 503
    :goto_2
    if-nez v1, :cond_1

    move-object v0, v2

    .line 522
    :goto_3
    return-object v0

    .line 480
    :cond_0
    iget v1, v3, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    div-int/2addr v1, p3

    goto :goto_0

    .line 495
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    move-object v1, v2

    .line 502
    goto :goto_2

    .line 501
    :catch_1
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    move-object v1, v2

    goto :goto_2

    .line 506
    :cond_1
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v3

    if-ge v0, v3, :cond_2

    .line 507
    new-instance v0, Ljava/math/BigDecimal;

    invoke-direct {v0, p2}, Ljava/math/BigDecimal;-><init>(I)V

    .line 508
    new-instance v3, Ljava/math/BigDecimal;

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v4

    invoke-direct {v3, v4}, Ljava/math/BigDecimal;-><init>(I)V

    invoke-virtual {v0, v3, v5, v6}, Ljava/math/BigDecimal;->divide(Ljava/math/BigDecimal;II)Ljava/math/BigDecimal;

    move-result-object v0

    .line 513
    :goto_4
    invoke-virtual {v0}, Ljava/math/BigDecimal;->floatValue()F

    move-result v3

    .line 514
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    int-to-float v0, v0

    mul-float/2addr v0, v3

    float-to-int v0, v0

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v4

    int-to-float v4, v4

    mul-float/2addr v4, v3

    float-to-int v4, v4

    sget-object v5, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v0, v4, v5}, Lcom/roidapp/photogrid/release/rf;->a(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 515
    new-instance v4, Landroid/graphics/Canvas;

    invoke-direct {v4, v0}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 516
    new-instance v5, Landroid/graphics/Matrix;

    invoke-direct {v5}, Landroid/graphics/Matrix;-><init>()V

    .line 517
    invoke-virtual {v5, v3, v3}, Landroid/graphics/Matrix;->postScale(FF)Z

    .line 518
    new-instance v3, Landroid/graphics/PaintFlagsDrawFilter;

    const/4 v6, 0x3

    invoke-direct {v3, v7, v6}, Landroid/graphics/PaintFlagsDrawFilter;-><init>(II)V

    invoke-virtual {v4, v3}, Landroid/graphics/Canvas;->setDrawFilter(Landroid/graphics/DrawFilter;)V

    .line 519
    invoke-virtual {v4, v1, v5, v2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V

    .line 520
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V

    goto :goto_3

    .line 510
    :cond_2
    new-instance v0, Ljava/math/BigDecimal;

    invoke-direct {v0, p3}, Ljava/math/BigDecimal;-><init>(I)V

    .line 511
    new-instance v3, Ljava/math/BigDecimal;

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v4

    invoke-direct {v3, v4}, Ljava/math/BigDecimal;-><init>(I)V

    invoke-virtual {v0, v3, v5, v6}, Ljava/math/BigDecimal;->divide(Ljava/math/BigDecimal;II)Ljava/math/BigDecimal;

    move-result-object v0

    goto :goto_4

    :cond_3
    move v0, v1

    goto/16 :goto_1
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;II)Landroid/graphics/Bitmap;
    .locals 9

    .prologue
    const/4 v8, 0x4

    const/4 v6, 0x2

    const/4 v0, 0x1

    const/4 v7, 0x0

    const/4 v2, 0x0

    .line 536
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v3

    .line 541
    new-instance v4, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v4}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 542
    iput-boolean v0, v4, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 543
    invoke-static {v3, v2, v4}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 546
    iget v1, v4, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    iget v5, v4, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    if-le v1, v5, :cond_2

    .line 547
    iget v1, v4, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    div-int/2addr v1, p2

    .line 551
    :goto_0
    if-nez v1, :cond_5

    .line 554
    :goto_1
    iput v0, v4, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 555
    iput-boolean v7, v4, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 557
    if-eqz v3, :cond_0

    :try_start_1
    invoke-virtual {v3}, Ljava/io/InputStream;->reset()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    .line 562
    :cond_0
    invoke-static {v3, v2, v4}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 564
    if-eqz v3, :cond_1

    .line 566
    :try_start_2
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2

    .line 572
    :cond_1
    :goto_2
    if-nez v1, :cond_3

    move-object v0, v2

    .line 591
    :goto_3
    return-object v0

    .line 538
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    move-object v0, v2

    .line 539
    goto :goto_3

    .line 549
    :cond_2
    iget v1, v4, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    div-int/2addr v1, p3

    goto :goto_0

    .line 559
    :catch_1
    move-exception v0

    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    move-object v0, v2

    .line 560
    goto :goto_3

    .line 569
    :catch_2
    move-exception v0

    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_2

    .line 575
    :cond_3
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v3

    if-ge v0, v3, :cond_4

    .line 576
    new-instance v0, Ljava/math/BigDecimal;

    invoke-direct {v0, p2}, Ljava/math/BigDecimal;-><init>(I)V

    .line 577
    new-instance v3, Ljava/math/BigDecimal;

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v4

    invoke-direct {v3, v4}, Ljava/math/BigDecimal;-><init>(I)V

    invoke-virtual {v0, v3, v6, v8}, Ljava/math/BigDecimal;->divide(Ljava/math/BigDecimal;II)Ljava/math/BigDecimal;

    move-result-object v0

    .line 582
    :goto_4
    invoke-virtual {v0}, Ljava/math/BigDecimal;->floatValue()F

    move-result v3

    .line 583
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    int-to-float v0, v0

    mul-float/2addr v0, v3

    float-to-int v0, v0

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v4

    int-to-float v4, v4

    mul-float/2addr v4, v3

    float-to-int v4, v4

    sget-object v5, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v0, v4, v5}, Lcom/roidapp/photogrid/release/rf;->a(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 584
    new-instance v4, Landroid/graphics/Canvas;

    invoke-direct {v4, v0}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 585
    new-instance v5, Landroid/graphics/Matrix;

    invoke-direct {v5}, Landroid/graphics/Matrix;-><init>()V

    .line 586
    invoke-virtual {v5, v3, v3}, Landroid/graphics/Matrix;->postScale(FF)Z

    .line 587
    new-instance v3, Landroid/graphics/PaintFlagsDrawFilter;

    const/4 v6, 0x3

    invoke-direct {v3, v7, v6}, Landroid/graphics/PaintFlagsDrawFilter;-><init>(II)V

    invoke-virtual {v4, v3}, Landroid/graphics/Canvas;->setDrawFilter(Landroid/graphics/DrawFilter;)V

    .line 588
    invoke-virtual {v4, v1, v5, v2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V

    .line 589
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V

    goto :goto_3

    .line 579
    :cond_4
    new-instance v0, Ljava/math/BigDecimal;

    invoke-direct {v0, p3}, Ljava/math/BigDecimal;-><init>(I)V

    .line 580
    new-instance v3, Ljava/math/BigDecimal;

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v4

    invoke-direct {v3, v4}, Ljava/math/BigDecimal;-><init>(I)V

    invoke-virtual {v0, v3, v6, v8}, Ljava/math/BigDecimal;->divide(Ljava/math/BigDecimal;II)Ljava/math/BigDecimal;

    move-result-object v0

    goto :goto_4

    :cond_5
    move v0, v1

    goto/16 :goto_1
.end method

.method public static a(Ljava/lang/String;II)Landroid/graphics/Bitmap;
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 330
    :try_start_0
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    invoke-static {p0}, Lcom/roidapp/photogrid/release/rf;->a(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 387
    :cond_0
    :goto_0
    return-object v0

    .line 333
    :cond_1
    invoke-static {p0, p1, p2}, Lcom/roidapp/photogrid/release/rd;->c(Ljava/lang/String;II)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v2

    .line 349
    :goto_1
    if-nez v2, :cond_5

    .line 351
    :try_start_1
    div-int/lit8 v1, p1, 0x2

    div-int/lit8 v3, p2, 0x2

    invoke-static {p0, v1, v3}, Lcom/roidapp/photogrid/release/rd;->c(Ljava/lang/String;II)Landroid/graphics/Bitmap;
    :try_end_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_3

    move-result-object v1

    .line 367
    :goto_2
    if-eqz v1, :cond_4

    .line 369
    :try_start_2
    invoke-static {v1, p0}, Lcom/roidapp/photogrid/common/bb;->a(Landroid/graphics/Bitmap;Ljava/lang/String;)Landroid/graphics/Bitmap;
    :try_end_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_2 .. :try_end_2} :catch_4
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_5

    move-result-object v0

    goto :goto_0

    .line 336
    :catch_0
    move-exception v1

    invoke-virtual {v1}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    move-object v2, v0

    .line 347
    goto :goto_1

    .line 342
    :catch_1
    move-exception v1

    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    move-object v2, v0

    .line 346
    goto :goto_1

    .line 353
    :catch_2
    move-exception v1

    invoke-virtual {v1}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    .line 354
    if-eqz v2, :cond_2

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v1

    if-nez v1, :cond_2

    .line 355
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->recycle()V

    :cond_2
    move-object v1, v0

    .line 364
    goto :goto_2

    .line 359
    :catch_3
    move-exception v1

    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    .line 360
    if-eqz v2, :cond_3

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v1

    if-nez v1, :cond_3

    .line 361
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->recycle()V

    :cond_3
    move-object v1, v0

    .line 363
    goto :goto_2

    .line 371
    :catch_4
    move-exception v2

    invoke-virtual {v2}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    .line 372
    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v2

    if-nez v2, :cond_0

    .line 373
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V

    goto :goto_0

    .line 378
    :catch_5
    move-exception v2

    invoke-virtual {v2}, Ljava/lang/Exception;->printStackTrace()V

    .line 379
    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v2

    if-nez v2, :cond_0

    .line 380
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V

    goto :goto_0

    :cond_4
    move-object v0, v1

    goto :goto_0

    :cond_5
    move-object v1, v2

    goto :goto_2
.end method

.method public static declared-synchronized a()Lcom/roidapp/photogrid/release/rd;
    .locals 2

    .prologue
    .line 49
    const-class v1, Lcom/roidapp/photogrid/release/rd;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/roidapp/photogrid/release/rd;->a:Lcom/roidapp/photogrid/release/rd;

    if-nez v0, :cond_0

    .line 50
    new-instance v0, Lcom/roidapp/photogrid/release/rd;

    invoke-direct {v0}, Lcom/roidapp/photogrid/release/rd;-><init>()V

    sput-object v0, Lcom/roidapp/photogrid/release/rd;->a:Lcom/roidapp/photogrid/release/rd;

    .line 53
    :cond_0
    sget-object v0, Lcom/roidapp/photogrid/release/rd;->a:Lcom/roidapp/photogrid/release/rd;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    .line 49
    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method

.method public static b(Ljava/lang/String;II)Landroid/graphics/Bitmap;
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 399
    .line 418
    :try_start_0
    invoke-static {p0, p1, p2}, Lcom/roidapp/photogrid/release/rd;->c(Ljava/lang/String;II)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v1

    .line 419
    if-nez v1, :cond_2

    .line 458
    :cond_0
    :goto_0
    return-object v0

    .line 424
    :catch_0
    move-exception v1

    invoke-virtual {v1}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    .line 425
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v1

    if-nez v1, :cond_1

    .line 426
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    :cond_1
    move-object v1, v0

    .line 439
    :cond_2
    :goto_1
    if-eqz v1, :cond_4

    .line 441
    :try_start_1
    invoke-static {v1, p0}, Lcom/roidapp/photogrid/common/bb;->a(Landroid/graphics/Bitmap;Ljava/lang/String;)Landroid/graphics/Bitmap;
    :try_end_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_3

    move-result-object v0

    goto :goto_0

    .line 431
    :catch_1
    move-exception v1

    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    .line 432
    if-eqz v0, :cond_3

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v1

    if-nez v1, :cond_3

    .line 433
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    :cond_3
    move-object v1, v0

    .line 436
    goto :goto_1

    .line 443
    :catch_2
    move-exception v2

    invoke-virtual {v2}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    .line 444
    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v2

    if-nez v2, :cond_0

    .line 445
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V

    goto :goto_0

    .line 450
    :catch_3
    move-exception v2

    invoke-virtual {v2}, Ljava/lang/Exception;->printStackTrace()V

    .line 451
    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v2

    if-nez v2, :cond_0

    .line 452
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V

    goto :goto_0

    :cond_4
    move-object v0, v1

    goto :goto_0
.end method

.method private static c(Ljava/lang/String;II)Landroid/graphics/Bitmap;
    .locals 7

    .prologue
    const/4 v5, -0x1

    const/4 v0, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 229
    new-instance v4, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v4}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 231
    const/4 v3, 0x1

    :try_start_0
    iput v3, v4, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 232
    const/4 v3, 0x1

    iput-boolean v3, v4, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 233
    invoke-static {p0, v4}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 234
    iget v3, v4, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    if-eq v3, v5, :cond_0

    iget v3, v4, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    if-ne v3, v5, :cond_1

    .line 280
    :cond_0
    :goto_0
    return-object v0

    .line 1291
    :cond_1
    iget v5, v4, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    .line 1292
    iget v6, v4, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    .line 1296
    mul-int v3, v6, p2

    div-int/2addr v3, v5

    .line 1297
    if-ge v3, p1, :cond_3

    move v3, v2

    .line 1303
    :goto_1
    mul-int/2addr v5, p1

    div-int/2addr v5, v6

    .line 1304
    if-ge v5, p2, :cond_4

    .line 1311
    :goto_2
    if-eqz v3, :cond_2

    if-eqz v2, :cond_5

    .line 1313
    :cond_2
    if-nez v3, :cond_5

    if-eqz v2, :cond_5

    .line 1314
    iget v2, v4, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    div-int/2addr v2, p1

    .line 1318
    :goto_3
    int-to-double v2, v2

    invoke-static {v2, v3}, Ljava/lang/Math;->floor(D)D

    move-result-wide v2

    double-to-int v2, v2

    .line 1319
    if-gez v2, :cond_7

    .line 237
    :goto_4
    iput v1, v4, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 238
    const/4 v1, 0x0

    iput-boolean v1, v4, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 239
    const/4 v1, 0x0

    iput-boolean v1, v4, Landroid/graphics/BitmapFactory$Options;->inDither:Z

    .line 240
    const/4 v1, 0x0

    iput-boolean v1, v4, Landroid/graphics/BitmapFactory$Options;->inScaled:Z

    .line 242
    invoke-static {p0, v4}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v1

    .line 258
    :goto_5
    if-nez v1, :cond_6

    .line 259
    iget v2, v4, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    mul-int/lit8 v2, v2, 0x2

    iput v2, v4, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 262
    :try_start_1
    invoke-static {p0, v4}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    :try_end_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_3

    move-result-object v0

    goto :goto_0

    :cond_3
    move v3, v1

    .line 1300
    goto :goto_1

    :cond_4
    move v2, v1

    .line 1307
    goto :goto_2

    .line 1316
    :cond_5
    :try_start_2
    iget v2, v4, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    div-int/2addr v2, p2
    :try_end_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_3

    .line 244
    :catch_0
    move-exception v1

    invoke-virtual {v1}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    move-object v1, v0

    .line 255
    goto :goto_5

    .line 250
    :catch_1
    move-exception v1

    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    move-object v1, v0

    .line 254
    goto :goto_5

    .line 265
    :catch_2
    move-exception v2

    invoke-virtual {v2}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    .line 266
    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v2

    if-nez v2, :cond_0

    .line 267
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V

    goto :goto_0

    .line 272
    :catch_3
    move-exception v2

    invoke-virtual {v2}, Ljava/lang/Exception;->printStackTrace()V

    .line 273
    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v2

    if-nez v2, :cond_0

    .line 274
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V

    goto :goto_0

    :cond_6
    move-object v0, v1

    goto :goto_0

    :cond_7
    move v1, v2

    goto :goto_4
.end method
