.class public final Lcom/roidapp/baselib/f/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Lcom/roidapp/baselib/f/c;


# instance fields
.field private b:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/baselib/f/c;->b:Z

    .line 44
    return-void
.end method

.method public static a(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
    .locals 4

    .prologue
    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 62
    if-nez p2, :cond_0

    .line 63
    sget-object p2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 67
    :cond_0
    const/4 v0, 0x0

    .line 69
    :try_start_0
    invoke-static {p0, p1, p2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v0

    .line 77
    :goto_0
    if-nez v0, :cond_1

    .line 79
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 80
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 83
    :try_start_1
    invoke-static {p0, p1, p2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
    :try_end_1
    .catch Ljava/lang/NullPointerException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_3

    move-result-object v0

    .line 92
    :cond_1
    :goto_1
    if-eqz v0, :cond_2

    if-eqz v1, :cond_3

    .line 94
    :cond_2
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 95
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 98
    :try_start_2
    invoke-static {p0, p1, p2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
    :try_end_2
    .catch Ljava/lang/NullPointerException; {:try_start_2 .. :try_end_2} :catch_4
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2 .. :try_end_2} :catch_5

    move-result-object v0

    .line 108
    :cond_3
    :goto_2
    return-object v0

    .line 71
    :catch_0
    move-exception v3

    invoke-virtual {v3}, Ljava/lang/NullPointerException;->printStackTrace()V

    goto :goto_0

    .line 74
    :catch_1
    move-exception v3

    invoke-virtual {v3}, Ljava/lang/IllegalArgumentException;->printStackTrace()V

    goto :goto_0

    .line 85
    :catch_2
    move-exception v1

    invoke-virtual {v1}, Ljava/lang/NullPointerException;->printStackTrace()V

    move v1, v2

    .line 90
    goto :goto_1

    .line 88
    :catch_3
    move-exception v1

    invoke-virtual {v1}, Ljava/lang/IllegalArgumentException;->printStackTrace()V

    move v1, v2

    .line 89
    goto :goto_1

    .line 100
    :catch_4
    move-exception v1

    invoke-virtual {v1}, Ljava/lang/NullPointerException;->printStackTrace()V

    goto :goto_2

    .line 103
    :catch_5
    move-exception v1

    invoke-virtual {v1}, Ljava/lang/IllegalArgumentException;->printStackTrace()V

    goto :goto_2
.end method

.method private static a(Landroid/content/res/Resources;ILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 668
    :try_start_0
    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;
    :try_end_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    .line 673
    invoke-static {v1, v0, p2}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 675
    if-eqz v1, :cond_0

    .line 676
    :try_start_1
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    .line 681
    :cond_0
    :goto_0
    return-object v0

    .line 670
    :catch_0
    move-exception v1

    invoke-virtual {v1}, Landroid/content/res/Resources$NotFoundException;->printStackTrace()V

    goto :goto_0

    .line 679
    :catch_1
    move-exception v1

    invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_0
.end method

.method public static a(Landroid/content/res/Resources;ILandroid/graphics/BitmapFactory$Options;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    .locals 4

    .prologue
    const/4 v3, 0x1

    .line 620
    :try_start_0
    invoke-static {p0, p1, p2}, Lcom/roidapp/baselib/f/c;->a(Landroid/content/res/Resources;ILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/VerifyError; {:try_start_0 .. :try_end_0} :catch_3

    move-result-object v0

    .line 621
    if-eqz v0, :cond_0

    .line 622
    :try_start_1
    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    iget v1, v1, Landroid/util/DisplayMetrics;->density:F

    .line 623
    invoke-static {v0, v1}, Lcom/roidapp/baselib/f/c;->a(Landroid/graphics/Bitmap;F)Landroid/graphics/Bitmap;
    :try_end_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_6
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_5
    .catch Ljava/lang/VerifyError; {:try_start_1 .. :try_end_1} :catch_4

    move-result-object v0

    .line 654
    :cond_0
    :goto_0
    return-object v0

    .line 625
    :catch_0
    move-exception v0

    move-object v1, v0

    move-object v0, p3

    .line 626
    :goto_1
    invoke-virtual {v1}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    .line 627
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 631
    const/4 v2, 0x2

    :try_start_2
    iput v2, p2, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 632
    invoke-static {p0, p1, p2}, Lcom/roidapp/baselib/f/c;->a(Landroid/content/res/Resources;ILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 633
    const/4 v2, 0x1

    iput v2, p2, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 637
    if-eqz v0, :cond_0

    .line 638
    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    iget v2, v2, Landroid/util/DisplayMetrics;->density:F

    .line 639
    invoke-static {v0, v2}, Lcom/roidapp/baselib/f/c;->a(Landroid/graphics/Bitmap;F)Landroid/graphics/Bitmap;
    :try_end_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_2 .. :try_end_2} :catch_1

    move-result-object v0

    goto :goto_0

    .line 644
    :catch_1
    move-exception v2

    iput v3, p2, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 646
    invoke-virtual {v1}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    goto :goto_0

    .line 650
    :catch_2
    move-exception v0

    move-object v1, v0

    move-object v0, p3

    :goto_2
    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0

    .line 652
    :catch_3
    move-exception v0

    move-object v1, v0

    move-object v0, p3

    :goto_3
    invoke-virtual {v1}, Ljava/lang/VerifyError;->printStackTrace()V

    goto :goto_0

    :catch_4
    move-exception v1

    goto :goto_3

    .line 650
    :catch_5
    move-exception v1

    goto :goto_2

    .line 625
    :catch_6
    move-exception v1

    goto :goto_1
.end method

.method public static a(Landroid/graphics/Bitmap;F)Landroid/graphics/Bitmap;
    .locals 7

    .prologue
    const/4 v6, 0x1

    .line 472
    .line 1483
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    int-to-float v0, v0

    mul-float/2addr v0, p1

    float-to-int v0, v0

    .line 1484
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    int-to-float v1, v1

    mul-float/2addr v1, p1

    float-to-int v1, v1

    .line 1485
    sget-object v2, Lcom/roidapp/baselib/f/a;->a:Landroid/graphics/Bitmap$Config;

    invoke-static {v0, v1, v2}, Lcom/roidapp/baselib/f/c;->a(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 1486
    if-nez v0, :cond_0

    .line 1487
    const/4 v0, 0x0

    :goto_0
    return-object v0

    .line 1489
    :cond_0
    new-instance v1, Landroid/graphics/Canvas;

    invoke-direct {v1, v0}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 1490
    new-instance v2, Landroid/graphics/Matrix;

    invoke-direct {v2}, Landroid/graphics/Matrix;-><init>()V

    .line 1491
    invoke-virtual {v2, p1, p1}, Landroid/graphics/Matrix;->postScale(FF)Z

    .line 1492
    new-instance v3, Landroid/graphics/PaintFlagsDrawFilter;

    const/4 v4, 0x0

    const/4 v5, 0x3

    invoke-direct {v3, v4, v5}, Landroid/graphics/PaintFlagsDrawFilter;-><init>(II)V

    invoke-virtual {v1, v3}, Landroid/graphics/Canvas;->setDrawFilter(Landroid/graphics/DrawFilter;)V

    .line 1493
    new-instance v3, Landroid/graphics/Paint;

    invoke-direct {v3}, Landroid/graphics/Paint;-><init>()V

    .line 1494
    invoke-virtual {v3, v6}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 1495
    invoke-virtual {v3, v6}, Landroid/graphics/Paint;->setFilterBitmap(Z)V

    .line 1496
    invoke-virtual {v1, p0, v2, v3}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V

    .line 1497
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->recycle()V

    goto :goto_0
.end method

.method public static a()Lcom/roidapp/baselib/f/c;
    .locals 1

    .prologue
    .line 47
    sget-object v0, Lcom/roidapp/baselib/f/c;->a:Lcom/roidapp/baselib/f/c;

    if-nez v0, :cond_0

    .line 48
    new-instance v0, Lcom/roidapp/baselib/f/c;

    invoke-direct {v0}, Lcom/roidapp/baselib/f/c;-><init>()V

    sput-object v0, Lcom/roidapp/baselib/f/c;->a:Lcom/roidapp/baselib/f/c;

    .line 50
    :cond_0
    sget-object v0, Lcom/roidapp/baselib/f/c;->a:Lcom/roidapp/baselib/f/c;

    return-object v0
.end method

.method public static b()V
    .locals 1

    .prologue
    .line 685
    const/4 v0, 0x0

    sput-object v0, Lcom/roidapp/baselib/f/c;->a:Lcom/roidapp/baselib/f/c;

    .line 686
    return-void
.end method
