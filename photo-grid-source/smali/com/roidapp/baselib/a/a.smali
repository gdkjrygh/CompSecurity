.class public Lcom/roidapp/baselib/a/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static b:Lcom/roidapp/baselib/a/a;


# instance fields
.field private a:Landroid/graphics/Bitmap;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static a(I)I
    .locals 1

    .prologue
    .line 439
    const/16 v0, 0x8

    if-gt p0, v0, :cond_0

    .line 440
    const/4 v0, 0x1

    .line 441
    :goto_0
    if-ge v0, p0, :cond_1

    .line 442
    shl-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 445
    :cond_0
    add-int/lit8 v0, p0, 0x7

    div-int/lit8 v0, v0, 0x8

    mul-int/lit8 v0, v0, 0x8

    .line 448
    :cond_1
    return v0
.end method

.method private static a(Landroid/graphics/BitmapFactory$Options;I)I
    .locals 7

    .prologue
    const/4 v6, -0x1

    const/4 v0, 0x1

    .line 671
    .line 2685
    iget v1, p0, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    int-to-double v2, v1

    .line 2686
    iget v1, p0, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    int-to-double v4, v1

    .line 2687
    if-ne p1, v6, :cond_1

    move v1, v0

    .line 2688
    :goto_0
    const/16 v2, 0x80

    .line 2689
    if-lt v2, v1, :cond_0

    .line 2693
    if-ne p1, v6, :cond_0

    move v1, v0

    .line 673
    :cond_0
    const/16 v2, 0x8

    if-gt v1, v2, :cond_2

    .line 675
    :goto_1
    if-ge v0, v1, :cond_3

    .line 676
    shl-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 2687
    :cond_1
    mul-double/2addr v2, v4

    int-to-double v4, p1

    div-double/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v2

    double-to-int v1, v2

    goto :goto_0

    .line 679
    :cond_2
    add-int/lit8 v0, v1, 0x7

    div-int/lit8 v0, v0, 0x8

    mul-int/lit8 v0, v0, 0x8

    .line 681
    :cond_3
    return v0
.end method

.method private static a(Ljava/lang/String;)I
    .locals 6

    .prologue
    const/4 v1, 0x0

    .line 147
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v2, 0x5

    if-gt v0, v2, :cond_0

    move v0, v1

    .line 207
    :goto_0
    return v0

    .line 151
    :cond_0
    :try_start_0
    const-string v0, "android.media.ExifInterface"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    .line 152
    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Class;

    const/4 v3, 0x0

    const-class v4, Ljava/lang/String;

    aput-object v4, v2, v3

    .line 153
    invoke-virtual {v0, v2}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    .line 154
    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object p0, v3, v4

    invoke-virtual {v0, v3}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 155
    if-nez v0, :cond_1

    move v0, v1

    .line 156
    goto :goto_0

    .line 158
    :cond_1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    const-string v4, "getAttribute"

    invoke-virtual {v3, v4, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    .line 159
    if-nez v2, :cond_2

    move v0, v1

    .line 160
    goto :goto_0

    .line 162
    :cond_2
    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    const-string v5, "Orientation"

    aput-object v5, v3, v4

    invoke-virtual {v2, v0, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 163
    if-nez v0, :cond_3

    move v0, v1

    .line 164
    goto :goto_0

    .line 166
    :cond_3
    const-string v2, "3"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 167
    const/16 v0, 0xb4

    goto :goto_0

    .line 168
    :cond_4
    const-string v2, "6"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    .line 169
    const/16 v0, 0x5a

    goto :goto_0

    .line 170
    :cond_5
    const-string v2, "8"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_5
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_6
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_7

    move-result v0

    if-eqz v0, :cond_6

    .line 171
    const/16 v0, 0x10e

    goto :goto_0

    :cond_6
    move v0, v1

    .line 173
    goto :goto_0

    .line 176
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/ClassNotFoundException;->printStackTrace()V

    :goto_1
    move v0, v1

    .line 207
    goto :goto_0

    .line 178
    :catch_1
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/SecurityException;->printStackTrace()V

    goto :goto_1

    .line 180
    :catch_2
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/NoSuchMethodException;->printStackTrace()V

    goto :goto_1

    .line 182
    :catch_3
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/IllegalArgumentException;->printStackTrace()V

    goto :goto_1

    .line 184
    :catch_4
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/InstantiationException;->printStackTrace()V

    goto :goto_1

    .line 186
    :catch_5
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/IllegalAccessException;->printStackTrace()V

    goto :goto_1

    .line 188
    :catch_6
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/reflect/InvocationTargetException;->printStackTrace()V

    goto :goto_1

    .line 190
    :catch_7
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_1
.end method

.method private static a(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;II)I
    .locals 6

    .prologue
    const/4 v0, 0x1

    const/high16 v5, 0x3f800000    # 1.0f

    .line 396
    iget v2, p1, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    .line 397
    iget v1, p1, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    .line 399
    invoke-static {p0}, Lcom/roidapp/baselib/a/a;->a(Ljava/lang/String;)I

    move-result v3

    div-int/lit8 v3, v3, 0x5a

    rem-int/lit8 v3, v3, 0x2

    if-ne v3, v0, :cond_0

    .line 400
    iget v2, p1, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    .line 401
    iget v1, p1, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    .line 404
    :cond_0
    if-gt v2, p2, :cond_1

    if-gt v1, p3, :cond_1

    .line 420
    :goto_0
    return v0

    .line 408
    :cond_1
    int-to-float v0, p2

    int-to-float v3, p3

    div-float/2addr v0, v3

    .line 409
    int-to-float v3, v2

    int-to-float v4, v1

    div-float/2addr v3, v4

    .line 410
    cmpl-float v0, v0, v3

    if-lez v0, :cond_2

    .line 411
    int-to-float v0, v1

    mul-float/2addr v0, v5

    int-to-float v1, p3

    div-float/2addr v0, v1

    float-to-int v0, v0

    goto :goto_0

    .line 414
    :cond_2
    int-to-float v0, v2

    mul-float/2addr v0, v5

    int-to-float v1, p2

    div-float/2addr v0, v1

    float-to-int v0, v0

    goto :goto_0
.end method

.method public static a(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
    .locals 4

    .prologue
    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 756
    if-nez p2, :cond_0

    .line 757
    sget-object p2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 761
    :cond_0
    const/4 v0, 0x0

    .line 763
    :try_start_0
    invoke-static {p0, p1, p2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v0

    .line 771
    :goto_0
    if-nez v0, :cond_1

    .line 773
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 774
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 777
    :try_start_1
    invoke-static {p0, p1, p2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
    :try_end_1
    .catch Ljava/lang/NullPointerException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_3

    move-result-object v0

    .line 786
    :cond_1
    :goto_1
    if-eqz v0, :cond_2

    if-eqz v1, :cond_3

    .line 788
    :cond_2
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 789
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 792
    :try_start_2
    invoke-static {p0, p1, p2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
    :try_end_2
    .catch Ljava/lang/NullPointerException; {:try_start_2 .. :try_end_2} :catch_4
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2 .. :try_end_2} :catch_5

    move-result-object v0

    .line 802
    :cond_3
    :goto_2
    return-object v0

    .line 765
    :catch_0
    move-exception v3

    invoke-virtual {v3}, Ljava/lang/NullPointerException;->printStackTrace()V

    goto :goto_0

    .line 768
    :catch_1
    move-exception v3

    invoke-virtual {v3}, Ljava/lang/IllegalArgumentException;->printStackTrace()V

    goto :goto_0

    .line 779
    :catch_2
    move-exception v1

    invoke-virtual {v1}, Ljava/lang/NullPointerException;->printStackTrace()V

    move v1, v2

    .line 784
    goto :goto_1

    .line 782
    :catch_3
    move-exception v1

    invoke-virtual {v1}, Ljava/lang/IllegalArgumentException;->printStackTrace()V

    move v1, v2

    .line 783
    goto :goto_1

    .line 794
    :catch_4
    move-exception v1

    invoke-virtual {v1}, Ljava/lang/NullPointerException;->printStackTrace()V

    goto :goto_2

    .line 797
    :catch_5
    move-exception v1

    invoke-virtual {v1}, Ljava/lang/IllegalArgumentException;->printStackTrace()V

    goto :goto_2
.end method

.method public static a(Landroid/content/Context;IF)Landroid/graphics/Bitmap;
    .locals 10

    .prologue
    const/4 v9, 0x2

    const/4 v3, 0x0

    const/high16 v8, 0x40000000    # 2.0f

    const/4 v1, 0x0

    const/4 v2, 0x1

    .line 69
    new-instance v5, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v5}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 70
    iput-boolean v2, v5, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 71
    iput v2, v5, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 76
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v4, v0

    move v0, v3

    .line 81
    :goto_0
    if-nez v0, :cond_3

    .line 82
    invoke-static {v4, v1, v5}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 83
    iget v6, v5, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    if-lez v6, :cond_3

    iget v6, v5, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    if-lez v6, :cond_3

    .line 84
    iget v6, v5, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    iget v7, v5, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    if-le v6, v7, :cond_2

    .line 85
    iget v6, v5, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    int-to-float v6, v6

    mul-float v7, v8, p2

    cmpl-float v6, v6, v7

    if-lez v6, :cond_0

    .line 86
    iput v9, v5, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 93
    :cond_0
    :goto_1
    iput-boolean v3, v5, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 95
    :try_start_1
    invoke-virtual {v4}, Ljava/io/InputStream;->reset()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    .line 100
    :goto_2
    if-nez v0, :cond_3

    .line 101
    invoke-static {v4, v1, v5}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 105
    :goto_3
    if-eqz v4, :cond_1

    .line 107
    :try_start_2
    invoke-virtual {v4}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2

    .line 112
    :cond_1
    :goto_4
    return-object v0

    .line 78
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    move v0, v2

    move-object v4, v1

    .line 79
    goto :goto_0

    .line 89
    :cond_2
    iget v6, v5, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    int-to-float v6, v6

    mul-float v7, v8, p2

    cmpl-float v6, v6, v7

    if-lez v6, :cond_0

    .line 90
    iput v9, v5, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    goto :goto_1

    .line 97
    :catch_1
    move-exception v0

    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    move v0, v2

    .line 98
    goto :goto_2

    .line 109
    :catch_2
    move-exception v1

    invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_4

    :cond_3
    move-object v0, v1

    goto :goto_3
.end method

.method public static a(Landroid/graphics/Bitmap;F)Landroid/graphics/Bitmap;
    .locals 1

    .prologue
    .line 709
    const/4 v0, 0x1

    invoke-static {p0, p1, p1, v0}, Lcom/roidapp/baselib/a/a;->a(Landroid/graphics/Bitmap;FFZ)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 710
    return-object v0
.end method

.method private static a(Landroid/graphics/Bitmap;FFZ)Landroid/graphics/Bitmap;
    .locals 7

    .prologue
    const/4 v0, 0x0

    const/4 v6, 0x1

    .line 721
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    int-to-float v1, v1

    mul-float/2addr v1, p1

    float-to-int v1, v1

    .line 722
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    int-to-float v2, v2

    mul-float/2addr v2, p2

    float-to-int v2, v2

    .line 725
    :try_start_0
    sget-object v3, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v1, v2, v3}, Lcom/roidapp/baselib/a/a;->a(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    .line 729
    :goto_0
    if-nez v1, :cond_0

    .line 742
    :goto_1
    return-object v0

    .line 727
    :catch_0
    move-exception v1

    move-object v1, v0

    goto :goto_0

    .line 732
    :cond_0
    new-instance v0, Landroid/graphics/Canvas;

    invoke-direct {v0, v1}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 733
    new-instance v2, Landroid/graphics/Matrix;

    invoke-direct {v2}, Landroid/graphics/Matrix;-><init>()V

    .line 734
    invoke-virtual {v2, p1, p2}, Landroid/graphics/Matrix;->postScale(FF)Z

    .line 735
    new-instance v3, Landroid/graphics/PaintFlagsDrawFilter;

    const/4 v4, 0x0

    const/4 v5, 0x3

    invoke-direct {v3, v4, v5}, Landroid/graphics/PaintFlagsDrawFilter;-><init>(II)V

    invoke-virtual {v0, v3}, Landroid/graphics/Canvas;->setDrawFilter(Landroid/graphics/DrawFilter;)V

    .line 736
    new-instance v3, Landroid/graphics/Paint;

    invoke-direct {v3}, Landroid/graphics/Paint;-><init>()V

    .line 737
    invoke-virtual {v3, v6}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 738
    invoke-virtual {v3, v6}, Landroid/graphics/Paint;->setFilterBitmap(Z)V

    .line 739
    invoke-virtual {v0, p0, v2, v3}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V

    .line 740
    if-eqz p3, :cond_1

    .line 741
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->recycle()V

    :cond_1
    move-object v0, v1

    .line 742
    goto :goto_1
.end method

.method private static a(Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;
    .locals 8

    .prologue
    const/4 v7, 0x1

    const/high16 v6, 0x40000000    # 2.0f

    const/4 v2, 0x0

    .line 814
    rem-int/lit16 v0, p1, 0xb4

    if-eqz v0, :cond_0

    .line 815
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    .line 816
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    .line 821
    :goto_0
    new-instance v4, Landroid/graphics/Matrix;

    invoke-direct {v4}, Landroid/graphics/Matrix;-><init>()V

    .line 822
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    neg-int v3, v3

    int-to-float v3, v3

    div-float/2addr v3, v6

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v5

    neg-int v5, v5

    int-to-float v5, v5

    div-float/2addr v5, v6

    invoke-virtual {v4, v3, v5}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 823
    int-to-float v3, p1

    invoke-virtual {v4, v3}, Landroid/graphics/Matrix;->postRotate(F)Z

    .line 824
    int-to-float v3, v1

    div-float/2addr v3, v6

    int-to-float v5, v0

    div-float/2addr v5, v6

    invoke-virtual {v4, v3, v5}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 827
    :try_start_0
    sget-object v3, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v1, v0, v3}, Lcom/roidapp/baselib/a/a;->a(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v3

    .line 835
    :goto_1
    if-nez v3, :cond_2

    .line 837
    :try_start_1
    div-int/lit8 v1, v1, 0x2

    div-int/lit8 v0, v0, 0x2

    sget-object v3, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v1, v0, v3}, Lcom/roidapp/baselib/a/a;->a(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 838
    const/high16 v1, 0x3f000000    # 0.5f

    const/high16 v3, 0x3f000000    # 0.5f

    invoke-virtual {v4, v1, v3}, Landroid/graphics/Matrix;->postScale(FF)Z
    :try_end_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/NullPointerException; {:try_start_1 .. :try_end_1} :catch_3

    .line 847
    :goto_2
    if-nez v0, :cond_1

    move-object v0, v2

    .line 857
    :goto_3
    return-object v0

    .line 818
    :cond_0
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    .line 819
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v0

    goto :goto_0

    .line 828
    :catch_0
    move-exception v3

    .line 830
    invoke-virtual {v3}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    move-object v3, v2

    .line 834
    goto :goto_1

    .line 831
    :catch_1
    move-exception v3

    .line 833
    invoke-virtual {v3}, Ljava/lang/NullPointerException;->printStackTrace()V

    move-object v3, v2

    goto :goto_1

    .line 839
    :catch_2
    move-exception v0

    .line 841
    invoke-virtual {v0}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    move-object v0, v2

    .line 845
    goto :goto_2

    .line 842
    :catch_3
    move-exception v0

    .line 844
    invoke-virtual {v0}, Ljava/lang/NullPointerException;->printStackTrace()V

    move-object v0, v2

    goto :goto_2

    .line 850
    :cond_1
    new-instance v1, Landroid/graphics/Canvas;

    invoke-direct {v1, v0}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 851
    new-instance v2, Landroid/graphics/PaintFlagsDrawFilter;

    const/4 v3, 0x0

    const/4 v5, 0x3

    invoke-direct {v2, v3, v5}, Landroid/graphics/PaintFlagsDrawFilter;-><init>(II)V

    invoke-virtual {v1, v2}, Landroid/graphics/Canvas;->setDrawFilter(Landroid/graphics/DrawFilter;)V

    .line 852
    new-instance v2, Landroid/graphics/Paint;

    invoke-direct {v2}, Landroid/graphics/Paint;-><init>()V

    .line 853
    invoke-virtual {v2, v7}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 854
    invoke-virtual {v2, v7}, Landroid/graphics/Paint;->setFilterBitmap(Z)V

    .line 855
    invoke-virtual {v1, p0, v4, v2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V

    .line 856
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->recycle()V

    goto :goto_3

    :cond_2
    move-object v0, v3

    goto :goto_2
.end method

.method public static a(Landroid/graphics/Bitmap;II)Landroid/graphics/Bitmap;
    .locals 7

    .prologue
    const/4 v0, 0x0

    .line 237
    :try_start_0
    sget-object v1, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {p1, p2, v1}, Lcom/roidapp/baselib/a/a;->a(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v1

    .line 247
    if-nez v1, :cond_0

    .line 262
    :goto_0
    return-object v0

    .line 240
    :catch_0
    move-exception v1

    invoke-virtual {v1}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    goto :goto_0

    .line 244
    :catch_1
    move-exception v1

    invoke-virtual {v1}, Ljava/lang/NullPointerException;->printStackTrace()V

    goto :goto_0

    .line 251
    :cond_0
    new-instance v2, Landroid/graphics/Canvas;

    invoke-direct {v2, v1}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 252
    const/4 v0, -0x1

    invoke-virtual {v2, v0}, Landroid/graphics/Canvas;->drawColor(I)V

    .line 253
    new-instance v3, Landroid/graphics/Matrix;

    invoke-direct {v3}, Landroid/graphics/Matrix;-><init>()V

    .line 254
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v4

    if-le v0, v4, :cond_1

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    .line 255
    :goto_1
    int-to-float v4, p1

    int-to-float v0, v0

    div-float v0, v4, v0

    .line 256
    div-int/lit8 v4, p1, 0x2

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v5

    div-int/lit8 v5, v5, 0x2

    sub-int/2addr v4, v5

    .line 257
    div-int/lit8 v5, p2, 0x2

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v6

    div-int/lit8 v6, v6, 0x2

    sub-int/2addr v5, v6

    .line 258
    int-to-float v4, v4

    int-to-float v5, v5

    invoke-virtual {v3, v4, v5}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 259
    div-int/lit8 v4, p1, 0x2

    int-to-float v4, v4

    div-int/lit8 v5, p2, 0x2

    int-to-float v5, v5

    invoke-virtual {v3, v0, v0, v4, v5}, Landroid/graphics/Matrix;->postScale(FFFF)Z

    .line 260
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    invoke-virtual {v2, p0, v3, v0}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V

    move-object v0, v1

    .line 262
    goto :goto_0

    .line 254
    :cond_1
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v0

    goto :goto_1
.end method

.method private static a(Landroid/graphics/Bitmap;Ljava/lang/String;)Landroid/graphics/Bitmap;
    .locals 2

    .prologue
    .line 121
    if-eqz p0, :cond_0

    :try_start_0
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 122
    :cond_0
    const/4 p0, 0x0

    .line 143
    :cond_1
    :goto_0
    return-object p0

    .line 124
    :cond_2
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v1, 0x5

    if-le v0, v1, :cond_1

    .line 127
    const/4 v0, 0x0

    .line 128
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_3

    .line 129
    invoke-static {p1}, Lcom/roidapp/baselib/a/a;->a(Ljava/lang/String;)I

    move-result v0

    .line 131
    :cond_3
    if-lez v0, :cond_1

    .line 135
    invoke-static {p0, v0}, Lcom/roidapp/baselib/a/a;->a(Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/VerifyError; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object p0

    goto :goto_0

    .line 139
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/VerifyError;->printStackTrace()V

    goto :goto_0

    .line 141
    :catch_1
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    goto :goto_0
.end method

.method public static a(Ljava/io/FileInputStream;IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
    .locals 6

    .prologue
    const/4 v1, 0x1

    const/4 v4, -0x1

    const/4 v0, 0x0

    .line 623
    .line 624
    new-instance v2, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v2}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 625
    iput-object p3, v2, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;

    .line 626
    iput-boolean v1, v2, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 631
    :try_start_0
    invoke-virtual {p0}, Ljava/io/FileInputStream;->getFD()Ljava/io/FileDescriptor;

    move-result-object v1

    .line 632
    const/4 v3, 0x0

    invoke-static {v1, v3, v2}, Landroid/graphics/BitmapFactory;->decodeFileDescriptor(Ljava/io/FileDescriptor;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 633
    mul-int v3, p1, p2

    invoke-static {v2, v3}, Lcom/roidapp/baselib/a/a;->a(Landroid/graphics/BitmapFactory$Options;I)I

    move-result v3

    .line 634
    iput v3, v2, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 635
    const/4 v3, 0x0

    iput-boolean v3, v2, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 636
    const/4 v3, 0x0

    invoke-static {v1, v3, v2}, Landroid/graphics/BitmapFactory;->decodeFileDescriptor(Ljava/io/FileDescriptor;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v1

    .line 637
    :try_start_1
    iget v3, v2, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    if-eq v3, v4, :cond_0

    iget v2, v2, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    if-ne v2, v4, :cond_1

    .line 655
    :cond_0
    :goto_0
    return-object v0

    .line 640
    :cond_1
    invoke-static {p0}, Lcom/roidapp/baselib/c/v;->a(Ljava/io/FileInputStream;)Ljava/lang/String;

    move-result-object v0

    .line 641
    invoke-virtual {p0}, Ljava/io/FileInputStream;->close()V

    .line 2096
    const-string v2, "FFD8FF"

    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 2097
    const-string v0, "jpg"

    .line 642
    :cond_2
    :goto_1
    const-string v2, "gif"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    move-object v0, v1

    .line 643
    goto :goto_0

    .line 2098
    :cond_3
    const-string v2, "89504E47"

    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 2099
    const-string v0, "png"

    goto :goto_1

    .line 2100
    :cond_4
    const-string v2, "47494638"

    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_5

    .line 2101
    const-string v0, "gif"

    goto :goto_1

    .line 2102
    :cond_5
    const-string v2, "49492A00"

    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_6

    .line 2103
    const-string v0, "tif"

    goto :goto_1

    .line 2104
    :cond_6
    const-string v2, "424D"

    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 2105
    const-string v0, "bmp"

    goto :goto_1

    .line 645
    :cond_7
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    const/4 v2, 0x1

    invoke-virtual {v1, v0, v2}, Landroid/graphics/Bitmap;->copy(Landroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 646
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_2

    goto :goto_0

    .line 649
    :catch_0
    move-exception v0

    move-object v5, v0

    move-object v0, v1

    move-object v1, v5

    :goto_2
    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0

    .line 650
    :catch_1
    move-exception v1

    .line 651
    :goto_3
    const-class v2, Lcom/roidapp/baselib/a/a;

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/OutOfMemoryError;->getMessage()Ljava/lang/String;

    .line 652
    invoke-virtual {v1}, Ljava/lang/OutOfMemoryError;->getMessage()Ljava/lang/String;

    goto :goto_0

    .line 650
    :catch_2
    move-exception v0

    move-object v5, v0

    move-object v0, v1

    move-object v1, v5

    goto :goto_3

    .line 649
    :catch_3
    move-exception v1

    goto :goto_2
.end method

.method public static a(Ljava/lang/String;I)Landroid/graphics/Bitmap;
    .locals 6

    .prologue
    const/4 v3, 0x0

    const/4 v2, 0x1

    .line 521
    new-instance v4, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v4}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 522
    iput-boolean v2, v4, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 523
    invoke-static {p0, v4}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 524
    iget v1, v4, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    .line 525
    iget v0, v4, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    .line 526
    invoke-static {p0}, Lcom/roidapp/baselib/a/a;->a(Ljava/lang/String;)I

    move-result v5

    div-int/lit8 v5, v5, 0x5a

    rem-int/lit8 v5, v5, 0x2

    if-ne v5, v2, :cond_0

    .line 527
    iget v1, v4, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    .line 528
    iget v0, v4, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    .line 530
    :cond_0
    const/4 v5, 0x0

    iput-boolean v5, v4, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 531
    if-le v1, v0, :cond_3

    .line 533
    :goto_0
    int-to-float v0, v1

    int-to-float v1, p1

    div-float/2addr v0, v1

    .line 534
    float-to-int v0, v0

    .line 535
    if-gtz v0, :cond_1

    move v0, v2

    .line 538
    :cond_1
    iput v0, v4, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 539
    sget-object v1, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    iput-object v1, v4, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;

    .line 541
    :try_start_0
    invoke-static {p0, v4}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_3

    move-result-object v0

    .line 559
    :goto_1
    if-eqz v0, :cond_2

    .line 560
    invoke-static {v0, p0}, Lcom/roidapp/baselib/a/a;->a(Landroid/graphics/Bitmap;Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 562
    :cond_2
    return-object v0

    :cond_3
    move v1, v0

    .line 531
    goto :goto_0

    .line 542
    :catch_0
    move-exception v1

    .line 544
    :try_start_1
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 545
    mul-int/lit8 v0, v0, 0x2

    iput v0, v4, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 546
    invoke-static {p0, v4}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    :try_end_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/NullPointerException; {:try_start_1 .. :try_end_1} :catch_2

    move-result-object v0

    .line 554
    :goto_2
    invoke-virtual {v1}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    goto :goto_1

    .line 547
    :catch_1
    move-exception v0

    .line 549
    invoke-virtual {v0}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    move-object v0, v3

    .line 553
    goto :goto_2

    .line 550
    :catch_2
    move-exception v0

    .line 552
    invoke-virtual {v0}, Ljava/lang/NullPointerException;->printStackTrace()V

    move-object v0, v3

    goto :goto_2

    .line 555
    :catch_3
    move-exception v0

    .line 557
    invoke-virtual {v0}, Ljava/lang/NullPointerException;->printStackTrace()V

    move-object v0, v3

    goto :goto_1
.end method

.method public static a(Ljava/lang/String;II)Landroid/graphics/Bitmap;
    .locals 8

    .prologue
    const/4 v3, 0x0

    const/4 v2, 0x0

    .line 358
    new-instance v0, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v0}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 359
    const/4 v1, 0x1

    iput-boolean v1, v0, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 360
    invoke-static {p0, v0}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 363
    invoke-static {p0, v0, p1, p2}, Lcom/roidapp/baselib/a/a;->a(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;II)I

    move-result v1

    iput v1, v0, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 366
    iput-boolean v3, v0, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 368
    :try_start_0
    invoke-static {p0, v0}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 369
    sget-object v3, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-virtual {p0, v3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v3

    const-string v4, ".gif"

    invoke-virtual {v3, v4}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v3

    if-ltz v3, :cond_1

    .line 370
    new-instance v3, Landroid/graphics/Matrix;

    invoke-direct {v3}, Landroid/graphics/Matrix;-><init>()V

    .line 371
    const/high16 v4, 0x3f800000    # 1.0f

    iget v0, v0, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    int-to-float v0, v0

    div-float v0, v4, v0

    .line 372
    invoke-virtual {v3, v0, v0}, Landroid/graphics/Matrix;->postScale(FF)Z

    .line 373
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v4

    int-to-float v4, v4

    mul-float/2addr v4, v0

    float-to-int v4, v4

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v5

    int-to-float v5, v5

    mul-float/2addr v0, v5

    float-to-int v0, v0

    sget-object v5, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v4, v0, v5}, Lcom/roidapp/baselib/a/a;->a(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 374
    new-instance v4, Landroid/graphics/Canvas;

    invoke-direct {v4, v0}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 375
    new-instance v5, Landroid/graphics/PaintFlagsDrawFilter;

    const/4 v6, 0x0

    const/4 v7, 0x3

    invoke-direct {v5, v6, v7}, Landroid/graphics/PaintFlagsDrawFilter;-><init>(II)V

    invoke-virtual {v4, v5}, Landroid/graphics/Canvas;->setDrawFilter(Landroid/graphics/DrawFilter;)V

    .line 376
    const/4 v5, 0x0

    invoke-virtual {v4, v1, v3, v5}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V

    .line 377
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_1

    .line 390
    :cond_0
    :goto_0
    return-object v0

    :cond_1
    move-object v0, v1

    .line 387
    :goto_1
    if-eqz v0, :cond_0

    .line 388
    invoke-static {v0, p0}, Lcom/roidapp/baselib/a/a;->a(Landroid/graphics/Bitmap;Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v0

    goto :goto_0

    .line 380
    :catch_0
    move-exception v0

    .line 382
    invoke-virtual {v0}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    move-object v0, v2

    .line 386
    goto :goto_1

    .line 383
    :catch_1
    move-exception v0

    .line 385
    invoke-virtual {v0}, Ljava/lang/NullPointerException;->printStackTrace()V

    move-object v0, v2

    goto :goto_1
.end method

.method public static a(Ljava/lang/String;IIZZ)Landroid/graphics/Bitmap;
    .locals 2

    .prologue
    .line 43
    if-eqz p0, :cond_3

    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 45
    if-eqz p4, :cond_2

    .line 46
    invoke-static {}, Lcom/roidapp/baselib/a/a;->a()Lcom/roidapp/baselib/a/a;

    invoke-static {p0, p1}, Lcom/roidapp/baselib/a/a;->b(Ljava/lang/String;I)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 47
    if-eqz v0, :cond_3

    .line 48
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    if-ne v1, p1, :cond_0

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    if-eq v1, p2, :cond_1

    .line 49
    :cond_0
    invoke-static {}, Lcom/roidapp/baselib/a/a;->a()Lcom/roidapp/baselib/a/a;

    move-result-object v1

    invoke-virtual {v1, v0, p1, p2, p3}, Lcom/roidapp/baselib/a/a;->a(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 50
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    move-object v0, v1

    .line 62
    :cond_1
    :goto_0
    return-object v0

    .line 57
    :cond_2
    invoke-static {}, Lcom/roidapp/baselib/a/a;->a()Lcom/roidapp/baselib/a/a;

    invoke-static {p0, p1}, Lcom/roidapp/baselib/a/a;->b(Ljava/lang/String;I)Landroid/graphics/Bitmap;

    move-result-object v0

    goto :goto_0

    .line 62
    :cond_3
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static a()Lcom/roidapp/baselib/a/a;
    .locals 1

    .prologue
    .line 35
    sget-object v0, Lcom/roidapp/baselib/a/a;->b:Lcom/roidapp/baselib/a/a;

    if-nez v0, :cond_0

    .line 36
    new-instance v0, Lcom/roidapp/baselib/a/a;

    invoke-direct {v0}, Lcom/roidapp/baselib/a/a;-><init>()V

    sput-object v0, Lcom/roidapp/baselib/a/a;->b:Lcom/roidapp/baselib/a/a;

    .line 38
    :cond_0
    sget-object v0, Lcom/roidapp/baselib/a/a;->b:Lcom/roidapp/baselib/a/a;

    return-object v0
.end method

.method private static b(Ljava/lang/String;I)Landroid/graphics/Bitmap;
    .locals 10

    .prologue
    const/4 v2, 0x1

    const/4 v3, 0x0

    .line 459
    new-instance v5, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v5}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 460
    iput-boolean v2, v5, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 461
    invoke-static {p0, v5}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 462
    iget v1, v5, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    .line 463
    iget v0, v5, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    .line 464
    invoke-static {p0}, Lcom/roidapp/baselib/a/a;->a(Ljava/lang/String;)I

    move-result v4

    div-int/lit8 v4, v4, 0x5a

    rem-int/lit8 v4, v4, 0x2

    if-ne v4, v2, :cond_0

    .line 465
    iget v1, v5, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    .line 466
    iget v0, v5, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    .line 468
    :cond_0
    const/4 v4, 0x0

    iput-boolean v4, v5, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 469
    if-le v1, v0, :cond_5

    move v4, v0

    .line 470
    :goto_0
    if-le v1, v0, :cond_1

    move v0, v1

    .line 472
    :cond_1
    int-to-float v1, v0

    int-to-float v6, v4

    div-float/2addr v1, v6

    .line 473
    float-to-double v6, v1

    const-wide v8, 0x3ffc71de69ad42c4L    # 1.7778

    cmpl-double v1, v6, v8

    if-gtz v1, :cond_2

    move v0, v4

    .line 478
    :cond_2
    int-to-float v0, v0

    int-to-float v1, p1

    div-float/2addr v0, v1

    .line 479
    float-to-int v0, v0

    .line 480
    if-gtz v0, :cond_3

    move v0, v2

    .line 483
    :cond_3
    iput v0, v5, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 484
    sget-object v1, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    iput-object v1, v5, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;

    .line 486
    :try_start_0
    invoke-static {p0, v5}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v1

    .line 494
    :goto_1
    if-nez v1, :cond_6

    .line 496
    :try_start_1
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 497
    mul-int/lit8 v0, v0, 0x2

    iput v0, v5, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 498
    invoke-static {p0, v5}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    :try_end_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/NullPointerException; {:try_start_1 .. :try_end_1} :catch_3

    move-result-object v0

    .line 507
    :goto_2
    if-eqz v0, :cond_4

    .line 508
    invoke-static {v0, p0}, Lcom/roidapp/baselib/a/a;->a(Landroid/graphics/Bitmap;Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 510
    :cond_4
    return-object v0

    :cond_5
    move v4, v1

    .line 469
    goto :goto_0

    .line 487
    :catch_0
    move-exception v1

    .line 489
    invoke-virtual {v1}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    move-object v1, v3

    .line 493
    goto :goto_1

    .line 490
    :catch_1
    move-exception v1

    .line 492
    invoke-virtual {v1}, Ljava/lang/NullPointerException;->printStackTrace()V

    move-object v1, v3

    goto :goto_1

    .line 499
    :catch_2
    move-exception v0

    .line 501
    invoke-virtual {v0}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    move-object v0, v3

    .line 505
    goto :goto_2

    .line 502
    :catch_3
    move-exception v0

    .line 504
    invoke-virtual {v0}, Ljava/lang/NullPointerException;->printStackTrace()V

    move-object v0, v3

    goto :goto_2

    :cond_6
    move-object v0, v1

    goto :goto_2
.end method

.method public static b(Ljava/lang/String;II)Landroid/graphics/Bitmap;
    .locals 5

    .prologue
    const/4 v0, 0x1

    const/4 v4, -0x1

    const/4 v2, 0x0

    .line 576
    new-instance v3, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v3}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 577
    iput-boolean v0, v3, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 578
    invoke-static {p0, v3}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 579
    iget v1, v3, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    if-eq v1, v4, :cond_0

    iget v1, v3, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    if-ne v1, v4, :cond_2

    :cond_0
    move-object v0, v2

    .line 619
    :cond_1
    :goto_0
    return-object v0

    .line 582
    :cond_2
    invoke-static {p0, v3, p1, p2}, Lcom/roidapp/baselib/a/a;->a(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;II)I

    move-result v1

    .line 583
    if-gtz v1, :cond_5

    .line 586
    :goto_1
    iput v0, v3, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 587
    const/4 v1, 0x0

    iput-boolean v1, v3, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 588
    sget-object v1, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    iput-object v1, v3, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;

    .line 590
    :try_start_0
    invoke-static {p0, v3}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v1

    .line 598
    :goto_2
    if-nez v1, :cond_4

    .line 602
    :try_start_1
    invoke-static {v0}, Lcom/roidapp/baselib/a/a;->a(I)I

    move-result v1

    .line 603
    if-gt v1, v0, :cond_3

    .line 604
    mul-int/lit8 v0, v1, 0x2

    .line 606
    :goto_3
    iput v0, v3, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 607
    invoke-static {p0, v3}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    :try_end_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/NullPointerException; {:try_start_1 .. :try_end_1} :catch_3

    move-result-object v2

    move-object v0, v2

    .line 616
    :goto_4
    if-eqz v0, :cond_1

    .line 617
    invoke-static {v0, p0}, Lcom/roidapp/baselib/a/a;->a(Landroid/graphics/Bitmap;Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v0

    goto :goto_0

    .line 591
    :catch_0
    move-exception v1

    .line 593
    invoke-virtual {v1}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    move-object v1, v2

    .line 597
    goto :goto_2

    .line 594
    :catch_1
    move-exception v1

    .line 596
    invoke-virtual {v1}, Ljava/lang/NullPointerException;->printStackTrace()V

    move-object v1, v2

    goto :goto_2

    .line 608
    :catch_2
    move-exception v0

    .line 610
    invoke-virtual {v0}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    move-object v0, v2

    .line 614
    goto :goto_4

    .line 611
    :catch_3
    move-exception v0

    .line 613
    invoke-virtual {v0}, Ljava/lang/NullPointerException;->printStackTrace()V

    move-object v0, v2

    goto :goto_4

    :cond_3
    move v0, v1

    goto :goto_3

    :cond_4
    move-object v0, v1

    goto :goto_4

    :cond_5
    move v0, v1

    goto :goto_1
.end method

.method public static b()V
    .locals 2

    .prologue
    .line 861
    sget-object v0, Lcom/roidapp/baselib/a/a;->b:Lcom/roidapp/baselib/a/a;

    if-nez v0, :cond_0

    .line 866
    :goto_0
    return-void

    .line 862
    :cond_0
    sget-object v0, Lcom/roidapp/baselib/a/a;->b:Lcom/roidapp/baselib/a/a;

    iget-object v0, v0, Lcom/roidapp/baselib/a/a;->a:Landroid/graphics/Bitmap;

    .line 863
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v1

    if-nez v1, :cond_1

    .line 864
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 865
    :cond_1
    const/4 v0, 0x0

    sput-object v0, Lcom/roidapp/baselib/a/a;->b:Lcom/roidapp/baselib/a/a;

    goto :goto_0
.end method


# virtual methods
.method public final a(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;
    .locals 9

    .prologue
    const/4 v5, 0x0

    const/4 v1, 0x0

    const/high16 v8, 0x40000000    # 2.0f

    .line 268
    :try_start_0
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {p2, p3, v0}, Lcom/roidapp/baselib/a/a;->a(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v2

    .line 278
    if-nez v2, :cond_0

    move-object v0, v1

    .line 312
    :goto_0
    return-object v0

    .line 271
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    move-object v0, v1

    .line 272
    goto :goto_0

    .line 275
    :catch_1
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/NullPointerException;->printStackTrace()V

    move-object v0, v1

    .line 276
    goto :goto_0

    .line 282
    :cond_0
    new-instance v3, Landroid/graphics/Canvas;

    invoke-direct {v3, v2}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 283
    new-instance v0, Landroid/graphics/PaintFlagsDrawFilter;

    const/4 v4, 0x3

    invoke-direct {v0, v5, v4}, Landroid/graphics/PaintFlagsDrawFilter;-><init>(II)V

    invoke-virtual {v3, v0}, Landroid/graphics/Canvas;->setDrawFilter(Landroid/graphics/DrawFilter;)V

    .line 284
    const/4 v0, -0x1

    invoke-virtual {v3, v0}, Landroid/graphics/Canvas;->drawColor(I)V

    .line 285
    new-instance v4, Landroid/graphics/Matrix;

    invoke-direct {v4}, Landroid/graphics/Matrix;-><init>()V

    .line 286
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v5

    if-ge v0, v5, :cond_1

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    .line 287
    :goto_1
    int-to-float v5, p2

    int-to-float v0, v0

    div-float v0, v5, v0

    .line 288
    int-to-float v5, p2

    div-float/2addr v5, v8

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v6

    int-to-float v6, v6

    div-float/2addr v6, v8

    sub-float/2addr v5, v6

    .line 289
    int-to-float v6, p3

    div-float/2addr v6, v8

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v7

    int-to-float v7, v7

    div-float/2addr v7, v8

    sub-float/2addr v6, v7

    .line 290
    invoke-virtual {v4, v5, v6}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 291
    int-to-float v5, p2

    div-float/2addr v5, v8

    int-to-float v6, p3

    div-float/2addr v6, v8

    invoke-virtual {v4, v0, v0, v5, v6}, Landroid/graphics/Matrix;->postScale(FFFF)Z

    .line 292
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    invoke-virtual {v3, p1, v4, v0}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V

    .line 293
    if-eqz p4, :cond_3

    iget-object v0, p0, Lcom/roidapp/baselib/a/a;->a:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/roidapp/baselib/a/a;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_3

    .line 295
    int-to-float v0, p2

    const v4, 0x3e8a3d71    # 0.27f

    mul-float/2addr v0, v4

    iget-object v4, p0, Lcom/roidapp/baselib/a/a;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v4

    int-to-float v4, v4

    div-float/2addr v0, v4

    .line 298
    :try_start_1
    iget-object v4, p0, Lcom/roidapp/baselib/a/a;->a:Landroid/graphics/Bitmap;

    .line 1709
    const/4 v5, 0x0

    invoke-static {v4, v0, v0, v5}, Lcom/roidapp/baselib/a/a;->a(Landroid/graphics/Bitmap;FFZ)Landroid/graphics/Bitmap;
    :try_end_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_2

    move-result-object v0

    .line 302
    :goto_2
    if-nez v0, :cond_2

    move-object v0, v1

    .line 303
    goto :goto_0

    .line 286
    :cond_1
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v0

    goto :goto_1

    .line 300
    :catch_2
    move-exception v0

    move-object v0, v1

    goto :goto_2

    .line 304
    :cond_2
    int-to-float v1, p2

    const v4, 0x3ca3d70a    # 0.02f

    mul-float/2addr v1, v4

    .line 305
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v4

    sub-int v4, p2, v4

    int-to-float v4, v4

    sub-float/2addr v4, v1

    .line 306
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v5

    sub-int v5, p3, v5

    int-to-float v5, v5

    sub-float v1, v5, v1

    .line 307
    new-instance v5, Landroid/graphics/Paint;

    invoke-direct {v5}, Landroid/graphics/Paint;-><init>()V

    invoke-virtual {v3, v0, v4, v1, v5}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 308
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    :cond_3
    move-object v0, v2

    .line 312
    goto/16 :goto_0
.end method

.method public final a(Landroid/graphics/Bitmap;)V
    .locals 0

    .prologue
    .line 116
    iput-object p1, p0, Lcom/roidapp/baselib/a/a;->a:Landroid/graphics/Bitmap;

    .line 117
    return-void
.end method
