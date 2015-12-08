.class public final Lcom/roidapp/photogrid/release/rf;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static d:Lcom/roidapp/photogrid/release/rf;


# instance fields
.field public a:F

.field public b:I

.field public c:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 59
    new-instance v0, Lcom/roidapp/photogrid/release/rf;

    invoke-direct {v0}, Lcom/roidapp/photogrid/release/rf;-><init>()V

    sput-object v0, Lcom/roidapp/photogrid/release/rf;->d:Lcom/roidapp/photogrid/release/rf;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .prologue
    .line 63
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 60
    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lcom/roidapp/photogrid/release/rf;->a:F

    .line 1942
    const/4 v0, 0x1

    iput v0, p0, Lcom/roidapp/photogrid/release/rf;->b:I

    .line 1943
    const/4 v0, 0x2

    iput v0, p0, Lcom/roidapp/photogrid/release/rf;->c:I

    .line 65
    return-void
.end method

.method private static a(I)I
    .locals 1

    .prologue
    .line 1893
    const/16 v0, 0x8

    if-gt p0, v0, :cond_0

    .line 1894
    const/4 v0, 0x1

    .line 1895
    :goto_0
    if-ge v0, p0, :cond_1

    .line 1896
    shl-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 1899
    :cond_0
    add-int/lit8 v0, p0, 0x7

    div-int/lit8 v0, v0, 0x8

    mul-int/lit8 v0, v0, 0x8

    .line 1902
    :cond_1
    return v0
.end method

.method public static a(Landroid/content/Context;)I
    .locals 4

    .prologue
    const/16 v1, 0xf0

    const/16 v0, 0x140

    .line 2152
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    iget v2, v2, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 2153
    const/16 v3, 0x320

    if-le v2, v3, :cond_1

    .line 2154
    const/16 v0, 0x190

    .line 2164
    :cond_0
    :goto_0
    return v0

    .line 2155
    :cond_1
    const/16 v3, 0x258

    if-gt v2, v3, :cond_0

    .line 2157
    if-gt v2, v0, :cond_0

    .line 2159
    if-le v2, v1, :cond_2

    move v0, v1

    .line 2160
    goto :goto_0

    .line 2162
    :cond_2
    const/16 v0, 0xa0

    goto :goto_0
.end method

.method public static a(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
    .locals 4

    .prologue
    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 2509
    if-nez p2, :cond_0

    .line 2510
    sget-object p2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 2514
    :cond_0
    const/4 v0, 0x0

    .line 2516
    :try_start_0
    invoke-static {p0, p1, p2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v0

    .line 2524
    :goto_0
    if-nez v0, :cond_1

    .line 2526
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 2527
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 2530
    :try_start_1
    invoke-static {p0, p1, p2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
    :try_end_1
    .catch Ljava/lang/NullPointerException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_3

    move-result-object v0

    .line 2539
    :cond_1
    :goto_1
    if-eqz v0, :cond_2

    if-eqz v1, :cond_3

    .line 2541
    :cond_2
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 2542
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 2545
    :try_start_2
    invoke-static {p0, p1, p2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
    :try_end_2
    .catch Ljava/lang/NullPointerException; {:try_start_2 .. :try_end_2} :catch_4
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2 .. :try_end_2} :catch_5

    move-result-object v0

    .line 2555
    :cond_3
    :goto_2
    return-object v0

    .line 2518
    :catch_0
    move-exception v3

    invoke-virtual {v3}, Ljava/lang/NullPointerException;->printStackTrace()V

    goto :goto_0

    .line 2521
    :catch_1
    move-exception v3

    invoke-virtual {v3}, Ljava/lang/IllegalArgumentException;->printStackTrace()V

    goto :goto_0

    .line 2532
    :catch_2
    move-exception v1

    invoke-virtual {v1}, Ljava/lang/NullPointerException;->printStackTrace()V

    move v1, v2

    .line 2537
    goto :goto_1

    .line 2535
    :catch_3
    move-exception v1

    invoke-virtual {v1}, Ljava/lang/IllegalArgumentException;->printStackTrace()V

    move v1, v2

    .line 2536
    goto :goto_1

    .line 2547
    :catch_4
    move-exception v1

    invoke-virtual {v1}, Ljava/lang/NullPointerException;->printStackTrace()V

    goto :goto_2

    .line 2550
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

    .line 2703
    new-instance v5, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v5}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 2704
    iput-boolean v2, v5, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 2705
    iput v2, v5, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 2710
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v4, v0

    move v0, v3

    .line 2715
    :goto_0
    if-nez v0, :cond_3

    .line 2716
    invoke-static {v4, v1, v5}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 2717
    iget v6, v5, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    if-lez v6, :cond_3

    iget v6, v5, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    if-lez v6, :cond_3

    .line 2718
    iget v6, v5, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    iget v7, v5, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    if-le v6, v7, :cond_2

    .line 2719
    iget v6, v5, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    int-to-float v6, v6

    mul-float v7, v8, p2

    cmpl-float v6, v6, v7

    if-lez v6, :cond_0

    .line 2720
    iput v9, v5, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 2727
    :cond_0
    :goto_1
    iput-boolean v3, v5, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 2729
    :try_start_1
    invoke-virtual {v4}, Ljava/io/InputStream;->reset()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    .line 2734
    :goto_2
    if-nez v0, :cond_3

    .line 2735
    invoke-static {v4, v1, v5}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 2739
    :goto_3
    if-eqz v4, :cond_1

    .line 2741
    :try_start_2
    invoke-virtual {v4}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2

    .line 2746
    :cond_1
    :goto_4
    return-object v0

    .line 2712
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    move v0, v2

    move-object v4, v1

    .line 2713
    goto :goto_0

    .line 2723
    :cond_2
    iget v6, v5, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    int-to-float v6, v6

    mul-float v7, v8, p2

    cmpl-float v6, v6, v7

    if-lez v6, :cond_0

    .line 2724
    iput v9, v5, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    goto :goto_1

    .line 2731
    :catch_1
    move-exception v0

    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    move v0, v2

    .line 2732
    goto :goto_2

    .line 2743
    :catch_2
    move-exception v1

    invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_4

    :cond_3
    move-object v0, v1

    goto :goto_3
.end method

.method public static a(Landroid/content/Context;ILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    .locals 1

    .prologue
    .line 2285
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-static {v0, p1, p2}, Lcom/roidapp/photogrid/release/rf;->a(Landroid/content/res/Resources;ILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method

.method public static a(Landroid/content/Context;ILandroid/graphics/BitmapFactory$Options;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    .locals 4

    .prologue
    const/4 v3, 0x1

    .line 2324
    :try_start_0
    invoke-static {p0, p1, p2}, Lcom/roidapp/photogrid/release/rf;->a(Landroid/content/Context;ILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2

    move-result-object v0

    .line 2325
    if-eqz v0, :cond_0

    .line 2326
    :try_start_1
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    iget v1, v1, Landroid/util/DisplayMetrics;->density:F

    .line 6590
    invoke-static {v0, v1, v1}, Lcom/roidapp/photogrid/release/rf;->a(Landroid/graphics/Bitmap;FF)Landroid/graphics/Bitmap;
    :try_end_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_4
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_3

    move-result-object v0

    .line 2354
    :cond_0
    :goto_0
    return-object v0

    .line 2329
    :catch_0
    move-exception v0

    move-object v1, v0

    move-object v0, p3

    .line 2330
    :goto_1
    invoke-virtual {v1}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    .line 2331
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 2334
    const/4 v2, 0x2

    :try_start_2
    iput v2, p2, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 2335
    invoke-static {p0, p1, p2}, Lcom/roidapp/photogrid/release/rf;->a(Landroid/content/Context;ILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 2336
    const/4 v2, 0x1

    iput v2, p2, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 2340
    if-eqz v0, :cond_0

    .line 2341
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    iget v2, v2, Landroid/util/DisplayMetrics;->density:F

    .line 7590
    invoke-static {v0, v2, v2}, Lcom/roidapp/photogrid/release/rf;->a(Landroid/graphics/Bitmap;FF)Landroid/graphics/Bitmap;
    :try_end_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_2 .. :try_end_2} :catch_1

    move-result-object v0

    goto :goto_0

    .line 2346
    :catch_1
    move-exception v2

    iput v3, p2, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 2348
    invoke-virtual {v1}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    goto :goto_0

    .line 2351
    :catch_2
    move-exception v0

    move-object v1, v0

    move-object v0, p3

    :goto_2
    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0

    :catch_3
    move-exception v1

    goto :goto_2

    .line 2329
    :catch_4
    move-exception v1

    goto :goto_1
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;F)Landroid/graphics/Bitmap;
    .locals 10

    .prologue
    const/4 v9, 0x2

    const/4 v3, 0x0

    const/high16 v8, 0x40000000    # 2.0f

    const/4 v1, 0x0

    const/4 v2, 0x1

    .line 2757
    new-instance v5, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v5}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 2758
    iput-boolean v2, v5, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 2759
    iput v2, v5, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 2764
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v4, v0

    move v0, v3

    .line 2769
    :goto_0
    if-nez v0, :cond_3

    .line 2770
    invoke-static {v4, v1, v5}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 2771
    iget v6, v5, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    if-lez v6, :cond_3

    iget v6, v5, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    if-lez v6, :cond_3

    .line 2772
    iget v6, v5, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    iget v7, v5, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    if-le v6, v7, :cond_2

    .line 2773
    iget v6, v5, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    int-to-float v6, v6

    mul-float v7, v8, p2

    cmpl-float v6, v6, v7

    if-lez v6, :cond_0

    .line 2774
    iput v9, v5, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 2781
    :cond_0
    :goto_1
    iput-boolean v3, v5, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 2783
    :try_start_1
    invoke-virtual {v4}, Ljava/io/InputStream;->reset()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    .line 2788
    :goto_2
    if-nez v0, :cond_3

    .line 2789
    invoke-static {v4, v1, v5}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 2793
    :goto_3
    if-eqz v4, :cond_1

    .line 2795
    :try_start_2
    invoke-virtual {v4}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2

    .line 2800
    :cond_1
    :goto_4
    return-object v0

    .line 2766
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    move v0, v2

    move-object v4, v1

    .line 2767
    goto :goto_0

    .line 2777
    :cond_2
    iget v6, v5, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    int-to-float v6, v6

    mul-float v7, v8, p2

    cmpl-float v6, v6, v7

    if-lez v6, :cond_0

    .line 2778
    iput v9, v5, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    goto :goto_1

    .line 2785
    :catch_1
    move-exception v0

    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    move v0, v2

    .line 2786
    goto :goto_2

    .line 2797
    :catch_2
    move-exception v1

    invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_4

    :cond_3
    move-object v0, v1

    goto :goto_3
.end method

.method private static a(Landroid/content/res/Resources;ILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 2298
    :try_start_0
    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;
    :try_end_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    .line 2303
    invoke-static {v1, v0, p2}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 2305
    if-eqz v1, :cond_0

    .line 2306
    :try_start_1
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    .line 2311
    :cond_0
    :goto_0
    return-object v0

    .line 2300
    :catch_0
    move-exception v1

    invoke-virtual {v1}, Landroid/content/res/Resources$NotFoundException;->printStackTrace()V

    goto :goto_0

    .line 2309
    :catch_1
    move-exception v1

    invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_0
.end method

.method public static a(Landroid/content/res/Resources;ILandroid/graphics/BitmapFactory$Options;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    .locals 4

    .prologue
    const/4 v3, 0x1

    .line 2444
    :try_start_0
    invoke-static {p0, p1, p2}, Lcom/roidapp/photogrid/release/rf;->a(Landroid/content/res/Resources;ILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/VerifyError; {:try_start_0 .. :try_end_0} :catch_3

    move-result-object v0

    .line 2445
    if-eqz v0, :cond_0

    .line 2446
    :try_start_1
    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    iget v1, v1, Landroid/util/DisplayMetrics;->density:F

    .line 8590
    invoke-static {v0, v1, v1}, Lcom/roidapp/photogrid/release/rf;->a(Landroid/graphics/Bitmap;FF)Landroid/graphics/Bitmap;
    :try_end_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_6
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_5
    .catch Ljava/lang/VerifyError; {:try_start_1 .. :try_end_1} :catch_4

    move-result-object v0

    .line 2478
    :cond_0
    :goto_0
    return-object v0

    .line 2449
    :catch_0
    move-exception v0

    move-object v1, v0

    move-object v0, p3

    .line 2450
    :goto_1
    invoke-virtual {v1}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    .line 2451
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 2455
    const/4 v2, 0x2

    :try_start_2
    iput v2, p2, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 2456
    invoke-static {p0, p1, p2}, Lcom/roidapp/photogrid/release/rf;->a(Landroid/content/res/Resources;ILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 2457
    const/4 v2, 0x1

    iput v2, p2, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 2461
    if-eqz v0, :cond_0

    .line 2462
    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    iget v2, v2, Landroid/util/DisplayMetrics;->density:F

    .line 9590
    invoke-static {v0, v2, v2}, Lcom/roidapp/photogrid/release/rf;->a(Landroid/graphics/Bitmap;FF)Landroid/graphics/Bitmap;
    :try_end_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_2 .. :try_end_2} :catch_1

    move-result-object v0

    goto :goto_0

    .line 2468
    :catch_1
    move-exception v2

    iput v3, p2, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 2470
    invoke-virtual {v1}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    goto :goto_0

    .line 2474
    :catch_2
    move-exception v0

    move-object v1, v0

    move-object v0, p3

    :goto_2
    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0

    .line 2476
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

    .line 2474
    :catch_5
    move-exception v1

    goto :goto_2

    .line 2449
    :catch_6
    move-exception v1

    goto :goto_1
.end method

.method private a(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    .locals 23

    .prologue
    .line 2001
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 2003
    const/16 v21, 0x0

    .line 2006
    :try_start_0
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v5

    .line 2007
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v9

    .line 2011
    mul-int v2, v5, v9

    new-array v3, v2, [I

    .line 2012
    mul-int v2, v5, v9

    new-array v0, v2, [I

    move-object/from16 v22, v0

    .line 2013
    mul-int v2, v5, v9

    new-array v10, v2, [I

    .line 2014
    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object/from16 v2, p1

    move v8, v5

    invoke-virtual/range {v2 .. v9}, Landroid/graphics/Bitmap;->getPixels([IIIIIII)V

    .line 2015
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Bitmap;->recycle()V

    .line 2018
    const/4 v2, 0x0

    move v4, v2

    :goto_0
    if-ge v4, v9, :cond_1

    .line 2020
    const/4 v2, 0x0

    :goto_1
    if-ge v2, v5, :cond_0

    .line 2022
    mul-int v6, v4, v5

    add-int/2addr v6, v2

    .line 2023
    aget v7, v3, v6

    shr-int/lit8 v7, v7, 0x10

    and-int/lit16 v7, v7, 0xff

    .line 2024
    aget v8, v3, v6

    shr-int/lit8 v8, v8, 0x8

    and-int/lit16 v8, v8, 0xff

    .line 2025
    aget v11, v3, v6

    and-int/lit16 v11, v11, 0xff

    .line 2027
    const-wide v12, 0x3fbd2f1a9fbe76c9L    # 0.114

    int-to-double v14, v7

    mul-double/2addr v12, v14

    const-wide v14, 0x3fe2c8b439581062L    # 0.587

    int-to-double v0, v8

    move-wide/from16 v16, v0

    mul-double v14, v14, v16

    add-double/2addr v12, v14

    const-wide v14, 0x3fd322d0e5604189L    # 0.299

    int-to-double v0, v11

    move-wide/from16 v16, v0

    mul-double v14, v14, v16

    add-double/2addr v12, v14

    double-to-int v7, v12

    aput v7, v22, v6

    .line 2028
    aget v7, v22, v6

    rsub-int v7, v7, 0xff

    aput v7, v10, v6

    .line 2020
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 2018
    :cond_0
    add-int/lit8 v2, v4, 0x1

    move v4, v2

    goto :goto_0

    .line 5922
    :cond_1
    const/16 v2, 0x3d

    new-array v11, v2, [F

    .line 5926
    const-wide v6, 0x4083a28c60000000L    # 628.3185424804688

    invoke-static {v6, v7}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v6

    double-to-float v7, v6

    .line 5928
    const/4 v6, 0x0

    .line 5929
    const/4 v4, 0x0

    .line 5930
    const/16 v2, -0x1e

    :goto_2
    const/16 v8, 0x1e

    if-gt v2, v8, :cond_2

    .line 5931
    mul-int v8, v2, v2

    int-to-float v8, v8

    .line 5932
    neg-float v8, v8

    const/high16 v12, 0x43480000    # 200.0f

    div-float/2addr v8, v12

    float-to-double v12, v8

    invoke-static {v12, v13}, Ljava/lang/Math;->exp(D)D

    move-result-wide v12

    double-to-float v8, v12

    div-float/2addr v8, v7

    aput v8, v11, v4

    .line 5933
    aget v8, v11, v4

    add-float/2addr v6, v8

    .line 5934
    add-int/lit8 v4, v4, 0x1

    .line 5930
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    .line 5936
    :cond_2
    const/4 v2, 0x0

    :goto_3
    const/16 v4, 0x3d

    if-ge v2, v4, :cond_3

    .line 5937
    aget v4, v11, v2

    div-float/2addr v4, v6

    aput v4, v11, v2

    .line 5936
    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    .line 5948
    :cond_3
    invoke-virtual {v10}, [I->clone()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, [I

    .line 5949
    invoke-virtual {v3}, [I->clone()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, [I

    .line 5951
    move-object/from16 v0, p0

    iget v0, v0, Lcom/roidapp/photogrid/release/rf;->b:I

    move/from16 v16, v0

    move-object/from16 v10, p0

    move v14, v5

    move v15, v9

    invoke-direct/range {v10 .. v16}, Lcom/roidapp/photogrid/release/rf;->a([F[I[IIII)V

    .line 5952
    move-object/from16 v0, p0

    iget v0, v0, Lcom/roidapp/photogrid/release/rf;->b:I

    move/from16 v20, v0

    move-object/from16 v14, p0

    move-object v15, v11

    move-object/from16 v16, v13

    move-object/from16 v17, v12

    move/from16 v18, v9

    move/from16 v19, v5

    invoke-direct/range {v14 .. v20}, Lcom/roidapp/photogrid/release/rf;->a([F[I[IIII)V

    .line 5955
    const/4 v2, 0x0

    const/4 v4, 0x0

    array-length v6, v3

    invoke-static {v12, v2, v3, v4, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 2042
    const/4 v2, 0x0

    :goto_4
    move-object/from16 v0, v22

    array-length v4, v0

    if-ge v2, v4, :cond_5

    .line 2044
    aget v4, v3, v2

    .line 2045
    aget v6, v22, v2

    aget v7, v3, v2

    .line 6099
    mul-int v8, v6, v7

    rsub-int v7, v7, 0x100

    div-int v7, v8, v7

    add-int/2addr v6, v7

    .line 2045
    invoke-static {v6}, Lcom/roidapp/photogrid/release/rf;->b(I)I

    move-result v6

    aput v6, v3, v2

    .line 2046
    aget v6, v22, v2

    .line 6103
    if-nez v4, :cond_4

    .line 6104
    const/4 v4, 0x0

    .line 2046
    :goto_5
    invoke-static {v4}, Lcom/roidapp/photogrid/release/rf;->b(I)I

    move-result v4

    aput v4, v22, v2

    .line 2047
    aget v4, v3, v2

    aget v6, v22, v2

    add-int/2addr v4, v6

    aput v4, v3, v2

    .line 2048
    aget v4, v3, v2

    invoke-static {v4}, Lcom/roidapp/photogrid/release/rf;->b(I)I

    move-result v4

    aput v4, v3, v2

    .line 2049
    const/high16 v4, -0x1000000

    aget v6, v3, v2

    shl-int/lit8 v6, v6, 0x10

    or-int/2addr v4, v6

    aget v6, v3, v2

    shl-int/lit8 v6, v6, 0x8

    or-int/2addr v4, v6

    aget v6, v3, v2

    or-int/2addr v4, v6

    aput v4, v3, v2

    .line 2042
    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    .line 6106
    :cond_4
    rsub-int v7, v6, 0xff

    rsub-int v8, v4, 0xff

    mul-int/2addr v7, v8

    div-int v4, v7, v4

    sub-int v4, v6, v4

    goto :goto_5

    .line 2051
    :cond_5
    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_4444:Landroid/graphics/Bitmap$Config;

    invoke-static {v5, v9, v2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v2

    .line 2052
    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move v8, v5

    :try_start_1
    invoke-virtual/range {v2 .. v9}, Landroid/graphics/Bitmap;->setPixels([IIIIIII)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_2

    .line 2095
    :goto_6
    return-object v2

    .line 2057
    :catch_0
    move-exception v2

    move-object v3, v2

    move-object/from16 v2, v21

    .line 2064
    :goto_7
    if-eqz v2, :cond_6

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v4

    if-nez v4, :cond_6

    .line 2065
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->recycle()V

    .line 2066
    const/4 v2, 0x0

    .line 2074
    :cond_6
    invoke-virtual {v3}, Ljava/lang/Exception;->printStackTrace()V

    .line 2094
    :goto_8
    invoke-static {}, Ljava/lang/System;->gc()V

    goto :goto_6

    .line 2075
    :catch_1
    move-exception v2

    move-object v3, v2

    move-object/from16 v2, v21

    .line 2082
    :goto_9
    if-eqz v2, :cond_7

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v4

    if-nez v4, :cond_7

    .line 2083
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->recycle()V

    .line 2084
    const/4 v2, 0x0

    .line 2092
    :cond_7
    invoke-virtual {v3}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    goto :goto_8

    .line 2075
    :catch_2
    move-exception v3

    goto :goto_9

    .line 2057
    :catch_3
    move-exception v3

    goto :goto_7
.end method

.method public static a(Landroid/graphics/Bitmap;FF)Landroid/graphics/Bitmap;
    .locals 7

    .prologue
    const/4 v6, 0x1

    .line 2565
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    int-to-float v0, v0

    mul-float/2addr v0, p1

    float-to-int v0, v0

    .line 2566
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    int-to-float v1, v1

    mul-float/2addr v1, p2

    float-to-int v1, v1

    .line 2567
    sget-object v2, Lcom/roidapp/photogrid/common/az;->c:Landroid/graphics/Bitmap$Config;

    invoke-static {v0, v1, v2}, Lcom/roidapp/photogrid/release/rf;->a(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 2568
    if-nez v0, :cond_0

    .line 2569
    const/4 v0, 0x0

    .line 2580
    :goto_0
    return-object v0

    .line 2571
    :cond_0
    new-instance v1, Landroid/graphics/Canvas;

    invoke-direct {v1, v0}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 2572
    new-instance v2, Landroid/graphics/Matrix;

    invoke-direct {v2}, Landroid/graphics/Matrix;-><init>()V

    .line 2573
    invoke-virtual {v2, p1, p2}, Landroid/graphics/Matrix;->postScale(FF)Z

    .line 2574
    new-instance v3, Landroid/graphics/PaintFlagsDrawFilter;

    const/4 v4, 0x0

    const/4 v5, 0x3

    invoke-direct {v3, v4, v5}, Landroid/graphics/PaintFlagsDrawFilter;-><init>(II)V

    invoke-virtual {v1, v3}, Landroid/graphics/Canvas;->setDrawFilter(Landroid/graphics/DrawFilter;)V

    .line 2575
    new-instance v3, Landroid/graphics/Paint;

    invoke-direct {v3}, Landroid/graphics/Paint;-><init>()V

    .line 2576
    invoke-virtual {v3, v6}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 2577
    invoke-virtual {v3, v6}, Landroid/graphics/Paint;->setFilterBitmap(Z)V

    .line 2578
    invoke-virtual {v1, p0, v2, v3}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V

    .line 2579
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->recycle()V

    goto :goto_0
.end method

.method public static a(Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;
    .locals 8

    .prologue
    const/4 v7, 0x1

    const/high16 v6, 0x40000000    # 2.0f

    const/4 v2, 0x0

    .line 2602
    rem-int/lit16 v0, p1, 0xb4

    if-eqz v0, :cond_0

    .line 2603
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    .line 2604
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    .line 2609
    :goto_0
    new-instance v4, Landroid/graphics/Matrix;

    invoke-direct {v4}, Landroid/graphics/Matrix;-><init>()V

    .line 2610
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

    .line 2611
    int-to-float v3, p1

    invoke-virtual {v4, v3}, Landroid/graphics/Matrix;->postRotate(F)Z

    .line 2612
    int-to-float v3, v1

    div-float/2addr v3, v6

    int-to-float v5, v0

    div-float/2addr v5, v6

    invoke-virtual {v4, v3, v5}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 2615
    :try_start_0
    sget-object v3, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v1, v0, v3}, Lcom/roidapp/photogrid/release/rf;->a(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v3

    .line 2623
    :goto_1
    if-nez v3, :cond_2

    .line 2625
    :try_start_1
    div-int/lit8 v1, v1, 0x2

    div-int/lit8 v0, v0, 0x2

    sget-object v3, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v1, v0, v3}, Lcom/roidapp/photogrid/release/rf;->a(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 2626
    const/high16 v1, 0x3f000000    # 0.5f

    const/high16 v3, 0x3f000000    # 0.5f

    invoke-virtual {v4, v1, v3}, Landroid/graphics/Matrix;->postScale(FF)Z
    :try_end_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/NullPointerException; {:try_start_1 .. :try_end_1} :catch_3

    .line 2635
    :goto_2
    if-nez v0, :cond_1

    move-object v0, v2

    .line 2645
    :goto_3
    return-object v0

    .line 2606
    :cond_0
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    .line 2607
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v0

    goto :goto_0

    .line 2616
    :catch_0
    move-exception v3

    .line 2618
    invoke-virtual {v3}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    move-object v3, v2

    .line 2622
    goto :goto_1

    .line 2619
    :catch_1
    move-exception v3

    .line 2621
    invoke-virtual {v3}, Ljava/lang/NullPointerException;->printStackTrace()V

    move-object v3, v2

    goto :goto_1

    .line 2627
    :catch_2
    move-exception v0

    .line 2629
    invoke-virtual {v0}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    move-object v0, v2

    .line 2633
    goto :goto_2

    .line 2630
    :catch_3
    move-exception v0

    .line 2632
    invoke-virtual {v0}, Ljava/lang/NullPointerException;->printStackTrace()V

    move-object v0, v2

    goto :goto_2

    .line 2638
    :cond_1
    new-instance v1, Landroid/graphics/Canvas;

    invoke-direct {v1, v0}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 2639
    new-instance v2, Landroid/graphics/PaintFlagsDrawFilter;

    const/4 v3, 0x0

    const/4 v5, 0x3

    invoke-direct {v2, v3, v5}, Landroid/graphics/PaintFlagsDrawFilter;-><init>(II)V

    invoke-virtual {v1, v2}, Landroid/graphics/Canvas;->setDrawFilter(Landroid/graphics/DrawFilter;)V

    .line 2640
    new-instance v2, Landroid/graphics/Paint;

    invoke-direct {v2}, Landroid/graphics/Paint;-><init>()V

    .line 2641
    invoke-virtual {v2, v7}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 2642
    invoke-virtual {v2, v7}, Landroid/graphics/Paint;->setFilterBitmap(Z)V

    .line 2643
    invoke-virtual {v1, p0, v4, v2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V

    .line 2644
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->recycle()V

    goto :goto_3

    :cond_2
    move-object v0, v3

    goto :goto_2
.end method

.method public static a(Lcom/roidapp/photogrid/release/ig;)Landroid/graphics/Bitmap;
    .locals 2

    .prologue
    const/16 v1, 0x64

    .line 1156
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {p0, v1, v1, v0}, Lcom/roidapp/photogrid/release/rf;->a(Lcom/roidapp/photogrid/release/ig;IILjava/lang/Boolean;)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method

.method public static a(Lcom/roidapp/photogrid/release/ig;IILjava/lang/Boolean;)Landroid/graphics/Bitmap;
    .locals 12

    .prologue
    .line 1173
    if-lez p1, :cond_0

    if-gtz p2, :cond_1

    .line 1174
    :cond_0
    const/4 v0, 0x0

    .line 1319
    :goto_0
    return-object v0

    .line 1179
    :cond_1
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    const/4 v1, 0x6

    if-ne v0, v1, :cond_4

    .line 1180
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ig;->e:Ljava/lang/String;

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/roidapp/photogrid/release/ig;->n:Ljava/lang/String;

    .line 1189
    :goto_1
    new-instance v1, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v1}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 1190
    const/4 v2, 0x1

    iput-boolean v2, v1, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 1191
    invoke-static {v0, v1}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 1192
    iget v3, v1, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    .line 1193
    iget v2, v1, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    .line 1196
    if-lez v3, :cond_2

    if-gtz v2, :cond_5

    .line 1197
    :cond_2
    const/4 v0, 0x0

    goto :goto_0

    .line 1180
    :cond_3
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ig;->e:Ljava/lang/String;

    goto :goto_1

    .line 4408
    :cond_4
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ig;->d()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    .line 1200
    :cond_5
    invoke-static {v0}, Lcom/roidapp/photogrid/common/bb;->a(Ljava/lang/String;)I

    move-result v4

    .line 1203
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->W()I

    move-result v0

    const/4 v5, 0x2

    if-ne v0, v5, :cond_6

    .line 1204
    iget v0, p0, Lcom/roidapp/photogrid/release/ig;->q:I

    add-int/2addr v4, v0

    .line 1209
    :cond_6
    div-int/lit8 v0, v4, 0x5a

    rem-int/lit8 v0, v0, 0x2

    const/4 v5, 0x1

    if-ne v0, v5, :cond_a

    .line 1210
    iget v2, v1, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    .line 1211
    iget v0, v1, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    .line 1223
    :goto_2
    int-to-float v3, p2

    int-to-float v5, p1

    div-float/2addr v3, v5

    .line 1224
    int-to-float v5, v2

    int-to-float v6, v0

    div-float/2addr v5, v6

    .line 1226
    cmpl-float v3, v5, v3

    if-lez v3, :cond_8

    .line 1232
    div-int v2, v0, p1

    .line 1234
    const/4 v5, 0x1

    move v3, p1

    .line 1250
    :goto_3
    if-gtz v2, :cond_7

    .line 1251
    const/4 v2, 0x1

    :cond_7
    move-object v0, p0

    .line 1307
    :try_start_0
    invoke-static/range {v0 .. v5}, Lcom/roidapp/photogrid/release/rf;->a(Lcom/roidapp/photogrid/release/ig;Landroid/graphics/BitmapFactory$Options;IIIZ)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    goto :goto_0

    .line 1244
    :cond_8
    div-int/2addr v2, p2

    .line 1246
    const/4 v5, 0x0

    move v3, p2

    .line 1247
    goto :goto_3

    .line 1308
    :catch_0
    move-exception v6

    .line 1309
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_9

    .line 1311
    int-to-double v8, v2

    invoke-static {v8, v9}, Ljava/lang/Math;->log10(D)D

    move-result-wide v8

    const-wide/high16 v10, 0x4000000000000000L    # 2.0

    invoke-static {v10, v11}, Ljava/lang/Math;->log10(D)D

    move-result-wide v10

    div-double/2addr v8, v10

    invoke-static {v8, v9}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v8

    double-to-int v0, v8

    .line 1312
    const-wide/high16 v8, 0x4000000000000000L    # 2.0

    add-int/lit8 v0, v0, 0x1

    int-to-double v10, v0

    invoke-static {v8, v9, v10, v11}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v8

    invoke-static {v8, v9}, Ljava/lang/Math;->round(D)J

    move-result-wide v8

    long-to-int v2, v8

    move-object v0, p0

    invoke-static/range {v0 .. v5}, Lcom/roidapp/photogrid/release/rf;->a(Lcom/roidapp/photogrid/release/ig;Landroid/graphics/BitmapFactory$Options;IIIZ)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 1316
    invoke-virtual {v6}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    goto/16 :goto_0

    .line 1314
    :cond_9
    new-instance v0, Ljava/lang/OutOfMemoryError;

    const-string v1, "load bitmap oom isHDtest"

    invoke-direct {v0, v1}, Ljava/lang/OutOfMemoryError;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_a
    move v0, v2

    move v2, v3

    goto :goto_2
.end method

.method private static a(Lcom/roidapp/photogrid/release/ig;Landroid/graphics/BitmapFactory$Options;IIIZ)Landroid/graphics/Bitmap;
    .locals 10

    .prologue
    .line 1543
    const/4 v0, 0x1

    if-gt p2, v0, :cond_0

    .line 1544
    const/4 p2, 0x1

    .line 1546
    :cond_0
    iput p2, p1, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 1548
    sget v0, Lcom/roidapp/photogrid/common/az;->a:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    .line 1549
    sget v0, Lcom/roidapp/photogrid/common/az;->a:I

    iput v0, p1, Landroid/graphics/BitmapFactory$Options;->inDensity:I

    .line 1551
    :cond_1
    sget v0, Lcom/roidapp/photogrid/common/az;->a:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_2

    .line 1552
    sget v0, Lcom/roidapp/photogrid/common/az;->a:I

    iput v0, p1, Landroid/graphics/BitmapFactory$Options;->inTargetDensity:I

    .line 1554
    :cond_2
    sget-object v0, Lcom/roidapp/photogrid/common/az;->b:Ljava/lang/Boolean;

    if-eqz v0, :cond_3

    .line 1555
    sget-object v0, Lcom/roidapp/photogrid/common/az;->b:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p1, Landroid/graphics/BitmapFactory$Options;->inScaled:Z

    .line 1557
    :cond_3
    const/4 v0, 0x0

    iput-boolean v0, p1, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 1559
    const/4 v1, 0x0

    .line 1560
    const/4 v2, 0x0

    .line 5408
    :try_start_0
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ig;->d()Ljava/lang/String;

    move-result-object v0

    .line 1564
    invoke-static {v0, p1}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_3

    move-result-object v1

    .line 1565
    if-nez v1, :cond_7

    .line 1566
    :try_start_1
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 1567
    invoke-static {}, Ljava/lang/System;->gc()V
    :try_end_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_1

    .line 1569
    const-wide/16 v4, 0x3e8

    :try_start_2
    invoke-static {v4, v5}, Ljava/lang/Thread;->sleep(J)V
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_2 .. :try_end_2} :catch_1

    .line 1573
    :goto_0
    :try_start_3
    invoke-static {v0, p1}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 1574
    if-nez v0, :cond_8

    .line 1575
    const/4 v0, 0x0

    .line 1678
    :cond_4
    :goto_1
    return-object v0

    .line 1571
    :catch_0
    move-exception v3

    invoke-virtual {v3}, Ljava/lang/InterruptedException;->printStackTrace()V
    :try_end_3
    .catch Ljava/lang/OutOfMemoryError; {:try_start_3 .. :try_end_3} :catch_1

    goto :goto_0

    .line 1683
    :catch_1
    move-exception v0

    move-object v9, v2

    move-object v2, v1

    move-object v1, v9

    .line 1685
    :goto_2
    if-eqz v2, :cond_5

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v3

    if-nez v3, :cond_5

    .line 1686
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->recycle()V

    .line 1689
    :cond_5
    if-eqz v1, :cond_6

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v2

    if-nez v2, :cond_6

    .line 1690
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V

    .line 1693
    :cond_6
    invoke-virtual {v0}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    .line 1694
    new-instance v0, Ljava/lang/OutOfMemoryError;

    const-string v1, "load bitmap oom"

    invoke-direct {v0, v1}, Ljava/lang/OutOfMemoryError;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    move-object v0, v1

    .line 1581
    :cond_8
    :try_start_4
    rem-int/lit16 v1, p4, 0xb4

    if-eqz v1, :cond_9

    .line 1582
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    .line 1583
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    move v5, v1

    move v6, v3

    .line 1591
    :goto_3
    if-eqz p5, :cond_a

    .line 1592
    int-to-float v1, p3

    int-to-float v3, v6

    div-float/2addr v1, v3

    .line 1596
    :goto_4
    const/high16 v3, 0x3f800000    # 1.0f

    cmpl-float v3, v1, v3

    if-ltz v3, :cond_c

    .line 1599
    if-nez p4, :cond_b

    .line 1600
    sget-object v1, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v3}, Landroid/graphics/Bitmap;->copy(Landroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 1601
    if-eqz v1, :cond_4

    .line 1604
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    move-object v0, v1

    .line 1605
    goto :goto_1

    .line 1585
    :cond_9
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    .line 1586
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v3

    move v5, v1

    move v6, v3

    goto :goto_3

    .line 1594
    :cond_a
    int-to-float v1, p3

    int-to-float v3, v5

    div-float/2addr v1, v3

    goto :goto_4

    .line 1608
    :cond_b
    invoke-static {v0, p4}, Lcom/roidapp/photogrid/release/rf;->a(Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;

    move-result-object v0

    goto :goto_1

    .line 1618
    :cond_c
    new-instance v7, Landroid/graphics/Matrix;

    invoke-direct {v7}, Landroid/graphics/Matrix;-><init>()V

    .line 1619
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    neg-int v3, v3

    int-to-float v3, v3

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v3, v4

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v4

    neg-int v4, v4

    int-to-float v4, v4

    const/high16 v8, 0x40000000    # 2.0f

    div-float/2addr v4, v8

    invoke-virtual {v7, v3, v4}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 1620
    int-to-float v3, p4

    invoke-virtual {v7, v3}, Landroid/graphics/Matrix;->postRotate(F)Z

    .line 1621
    int-to-float v3, v5

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v3, v4

    int-to-float v4, v6

    const/high16 v8, 0x40000000    # 2.0f

    div-float/2addr v4, v8

    invoke-virtual {v7, v3, v4}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 1629
    if-eqz p5, :cond_d

    .line 1630
    int-to-float v3, v5

    mul-float/2addr v1, v3

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    move v3, p3

    .line 1638
    :goto_5
    const/16 v4, 0x1000

    if-le v1, v4, :cond_f

    const/16 v4, 0x1000

    if-le v3, v4, :cond_f

    .line 1639
    if-le v1, v3, :cond_e

    .line 1640
    const/high16 v4, 0x45800000    # 4096.0f

    int-to-float v3, v3

    div-float v3, v4, v3

    int-to-float v1, v1

    mul-float/2addr v1, v3

    float-to-int v1, v1

    .line 1641
    const/16 v3, 0x1000

    move v4, v3

    move v3, v1

    .line 1658
    :goto_6
    if-eqz p5, :cond_11

    .line 1659
    int-to-float v1, v4

    int-to-float v5, v6

    div-float/2addr v1, v5

    .line 1664
    :goto_7
    invoke-virtual {v7, v1, v1}, Landroid/graphics/Matrix;->postScale(FF)Z

    .line 1665
    sget-object v1, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v3, v4, v1}, Lcom/roidapp/photogrid/release/rf;->a(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
    :try_end_4
    .catch Ljava/lang/OutOfMemoryError; {:try_start_4 .. :try_end_4} :catch_4

    move-result-object v1

    .line 1666
    if-nez v1, :cond_12

    .line 1667
    :try_start_5
    new-instance v2, Ljava/lang/OutOfMemoryError;

    const-string v3, "create bitmap border_bitmap==null"

    invoke-direct {v2, v3}, Ljava/lang/OutOfMemoryError;-><init>(Ljava/lang/String;)V

    throw v2
    :try_end_5
    .catch Ljava/lang/OutOfMemoryError; {:try_start_5 .. :try_end_5} :catch_2

    .line 1683
    :catch_2
    move-exception v2

    move-object v9, v2

    move-object v2, v0

    move-object v0, v9

    goto/16 :goto_2

    .line 1634
    :cond_d
    int-to-float v3, v6

    mul-float/2addr v1, v3

    :try_start_6
    invoke-static {v1}, Ljava/lang/Math;->round(F)I
    :try_end_6
    .catch Ljava/lang/OutOfMemoryError; {:try_start_6 .. :try_end_6} :catch_4

    move-result v3

    move v1, p3

    goto :goto_5

    .line 1643
    :cond_e
    const/high16 v4, 0x45800000    # 4096.0f

    int-to-float v1, v1

    div-float v1, v4, v1

    int-to-float v3, v3

    mul-float/2addr v1, v3

    float-to-int v3, v1

    .line 1644
    const/16 v1, 0x1000

    move v4, v3

    move v3, v1

    goto :goto_6

    .line 1647
    :cond_f
    const/16 v4, 0x1000

    if-le v1, v4, :cond_10

    .line 1648
    const/high16 v4, 0x45800000    # 4096.0f

    int-to-float v1, v1

    div-float v1, v4, v1

    int-to-float v3, v3

    mul-float/2addr v1, v3

    float-to-int v3, v1

    .line 1649
    const/16 v1, 0x1000

    move v4, v3

    move v3, v1

    goto :goto_6

    .line 1651
    :cond_10
    const/16 v4, 0x1000

    if-le v3, v4, :cond_13

    .line 1652
    const/high16 v4, 0x45800000    # 4096.0f

    int-to-float v3, v3

    div-float v3, v4, v3

    int-to-float v1, v1

    mul-float/2addr v1, v3

    float-to-int v1, v1

    .line 1653
    const/16 v3, 0x1000

    move v4, v3

    move v3, v1

    goto :goto_6

    .line 1661
    :cond_11
    int-to-float v1, v3

    int-to-float v5, v5

    div-float/2addr v1, v5

    goto :goto_7

    .line 1669
    :cond_12
    :try_start_7
    new-instance v2, Landroid/graphics/Canvas;

    invoke-direct {v2, v1}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 1670
    new-instance v3, Landroid/graphics/Paint;

    invoke-direct {v3}, Landroid/graphics/Paint;-><init>()V

    .line 1671
    const/4 v4, 0x1

    invoke-virtual {v3, v4}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 1672
    const/4 v4, 0x1

    invoke-virtual {v3, v4}, Landroid/graphics/Paint;->setFilterBitmap(Z)V

    .line 1673
    const/4 v4, 0x0

    invoke-virtual {v3, v4}, Landroid/graphics/Paint;->setColor(I)V

    .line 1674
    new-instance v4, Landroid/graphics/PaintFlagsDrawFilter;

    const/4 v5, 0x0

    const/4 v6, 0x3

    invoke-direct {v4, v5, v6}, Landroid/graphics/PaintFlagsDrawFilter;-><init>(II)V

    invoke-virtual {v2, v4}, Landroid/graphics/Canvas;->setDrawFilter(Landroid/graphics/DrawFilter;)V

    .line 1675
    const/4 v4, -0x1

    invoke-virtual {v3, v4}, Landroid/graphics/Paint;->setColor(I)V

    .line 1676
    invoke-virtual {v2, v0, v7, v3}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V

    .line 1677
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V
    :try_end_7
    .catch Ljava/lang/OutOfMemoryError; {:try_start_7 .. :try_end_7} :catch_2

    move-object v0, v1

    .line 1678
    goto/16 :goto_1

    .line 1683
    :catch_3
    move-exception v0

    move-object v9, v2

    move-object v2, v1

    move-object v1, v9

    goto/16 :goto_2

    :catch_4
    move-exception v1

    move-object v9, v1

    move-object v1, v2

    move-object v2, v0

    move-object v0, v9

    goto/16 :goto_2

    :cond_13
    move v4, v3

    move v3, v1

    goto/16 :goto_6
.end method

.method public static a(Ljava/lang/String;F)Landroid/graphics/Bitmap;
    .locals 10

    .prologue
    const/4 v9, 0x2

    const/4 v4, 0x0

    const/high16 v8, 0x40000000    # 2.0f

    const/4 v0, 0x0

    const/4 v3, 0x1

    .line 2184
    new-instance v5, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v5}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 2185
    iput-boolean v3, v5, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 2186
    iput v3, v5, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 2191
    :try_start_0
    invoke-static {p0}, Lcom/roidapp/photogrid/release/a/b;->a(Ljava/lang/String;)Ljava/io/InputStream;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    move v2, v4

    .line 2196
    :goto_0
    if-nez v2, :cond_2

    .line 2197
    invoke-static {v1, v0, v5}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 2198
    iget v6, v5, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    if-lez v6, :cond_2

    iget v6, v5, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    if-lez v6, :cond_2

    .line 2199
    iget v6, v5, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    iget v7, v5, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    if-le v6, v7, :cond_4

    .line 2200
    iget v6, v5, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    int-to-float v6, v6

    mul-float v7, v8, p1

    cmpl-float v6, v6, v7

    if-lez v6, :cond_0

    .line 2201
    iput v9, v5, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 2208
    :cond_0
    :goto_1
    iput-boolean v4, v5, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 2209
    if-eqz v1, :cond_1

    .line 2211
    :try_start_1
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    .line 2217
    :cond_1
    :goto_2
    :try_start_2
    invoke-static {p0}, Lcom/roidapp/photogrid/release/a/b;->a(Ljava/lang/String;)Ljava/io/InputStream;
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2

    move-result-object v1

    .line 2222
    :goto_3
    if-nez v2, :cond_2

    .line 2223
    invoke-static {v1, v0, v5}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 2227
    :cond_2
    if-eqz v1, :cond_3

    .line 2229
    :try_start_3
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3

    .line 2234
    :cond_3
    :goto_4
    return-object v0

    .line 2193
    :catch_0
    move-exception v1

    invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V

    move v2, v3

    move-object v1, v0

    .line 2194
    goto :goto_0

    .line 2204
    :cond_4
    iget v6, v5, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    int-to-float v6, v6

    mul-float v7, v8, p1

    cmpl-float v6, v6, v7

    if-lez v6, :cond_0

    .line 2205
    iput v9, v5, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    goto :goto_1

    .line 2213
    :catch_1
    move-exception v4

    invoke-virtual {v4}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_2

    .line 2219
    :catch_2
    move-exception v2

    invoke-virtual {v2}, Ljava/io/IOException;->printStackTrace()V

    move v2, v3

    .line 2220
    goto :goto_3

    .line 2231
    :catch_3
    move-exception v1

    invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_4
.end method

.method public static a(Ljava/lang/String;I)Landroid/graphics/Bitmap;
    .locals 11

    .prologue
    const/4 v3, 0x0

    const/4 v10, 0x0

    const/4 v1, 0x1

    const/high16 v9, 0x40000000    # 2.0f

    .line 1824
    invoke-static {p0}, Lcom/roidapp/photogrid/common/bb;->a(Ljava/lang/String;)I

    move-result v5

    .line 1825
    new-instance v4, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v4}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 1826
    iput-boolean v1, v4, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 1827
    invoke-static {p0, v4}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 1828
    iput-boolean v10, v4, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 1830
    rem-int/lit16 v0, v5, 0xb4

    if-nez v0, :cond_1

    .line 1831
    iget v0, v4, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    .line 1836
    :goto_0
    int-to-float v0, v0

    int-to-float v2, p1

    div-float/2addr v0, v2

    float-to-double v6, v0

    .line 1837
    invoke-static {v6, v7}, Ljava/lang/Math;->floor(D)D

    move-result-wide v6

    double-to-int v0, v6

    .line 1838
    if-gtz v0, :cond_0

    move v0, v1

    .line 1839
    :cond_0
    iput v0, v4, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 1841
    :try_start_0
    invoke-static {p0, v4}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v2

    .line 1846
    :goto_1
    if-nez v2, :cond_2

    .line 1847
    invoke-static {v0}, Lcom/roidapp/photogrid/release/rf;->a(I)I

    move-result v2

    .line 1848
    if-gt v2, v0, :cond_6

    .line 1849
    mul-int/lit8 v0, v2, 0x2

    .line 1851
    :goto_2
    iput v0, v4, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 1852
    invoke-static {p0, v4}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 1853
    if-nez v0, :cond_3

    move-object v0, v3

    .line 1887
    :goto_3
    return-object v0

    .line 1833
    :cond_1
    iget v0, v4, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    goto :goto_0

    .line 1842
    :catch_0
    move-exception v2

    .line 1844
    invoke-virtual {v2}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    move-object v2, v3

    goto :goto_1

    :cond_2
    move-object v0, v2

    .line 1861
    :cond_3
    rem-int/lit16 v2, v5, 0xb4

    if-nez v2, :cond_4

    .line 1862
    int-to-float v2, p1

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    int-to-float v3, v3

    div-float/2addr v2, v3

    .line 1864
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v3

    int-to-float v3, v3

    mul-float/2addr v3, v2

    float-to-int v3, v3

    .line 1871
    :goto_4
    sget-object v4, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {p1, v3, v4}, Lcom/roidapp/photogrid/release/rf;->a(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v4

    .line 1872
    if-nez v4, :cond_5

    .line 1873
    new-instance v0, Ljava/lang/OutOfMemoryError;

    const-string v1, "free save createbitmap == null"

    invoke-direct {v0, v1}, Ljava/lang/OutOfMemoryError;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1866
    :cond_4
    int-to-float v2, p1

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v3

    int-to-float v3, v3

    div-float/2addr v2, v3

    .line 1868
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    int-to-float v3, v3

    mul-float/2addr v3, v2

    float-to-int v3, v3

    goto :goto_4

    .line 1875
    :cond_5
    new-instance v6, Landroid/graphics/Matrix;

    invoke-direct {v6}, Landroid/graphics/Matrix;-><init>()V

    .line 1876
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v7

    neg-int v7, v7

    int-to-float v7, v7

    div-float/2addr v7, v9

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v8

    neg-int v8, v8

    int-to-float v8, v8

    div-float/2addr v8, v9

    invoke-virtual {v6, v7, v8}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 1877
    int-to-float v5, v5

    invoke-virtual {v6, v5}, Landroid/graphics/Matrix;->postRotate(F)Z

    .line 1878
    invoke-virtual {v6, v2, v2}, Landroid/graphics/Matrix;->postScale(FF)Z

    .line 1879
    int-to-float v2, p1

    div-float/2addr v2, v9

    int-to-float v3, v3

    div-float/2addr v3, v9

    invoke-virtual {v6, v2, v3}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 1880
    new-instance v2, Landroid/graphics/Canvas;

    invoke-direct {v2, v4}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 1881
    new-instance v3, Landroid/graphics/Paint;

    invoke-direct {v3}, Landroid/graphics/Paint;-><init>()V

    .line 1882
    invoke-virtual {v3, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 1883
    invoke-virtual {v3, v1}, Landroid/graphics/Paint;->setFilterBitmap(Z)V

    .line 1884
    new-instance v1, Landroid/graphics/PaintFlagsDrawFilter;

    const/4 v5, 0x3

    invoke-direct {v1, v10, v5}, Landroid/graphics/PaintFlagsDrawFilter;-><init>(II)V

    invoke-virtual {v2, v1}, Landroid/graphics/Canvas;->setDrawFilter(Landroid/graphics/DrawFilter;)V

    .line 1885
    invoke-virtual {v2, v0, v6, v3}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V

    .line 1886
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    move-object v0, v4

    .line 1887
    goto :goto_3

    :cond_6
    move v0, v2

    goto/16 :goto_2
.end method

.method public static a(Ljava/lang/String;II)Landroid/graphics/Bitmap;
    .locals 7

    .prologue
    const/4 v2, 0x0

    const/4 v0, 0x1

    .line 1756
    .line 1759
    if-le p1, p2, :cond_1

    :goto_0
    :try_start_0
    div-int/lit8 v5, p1, 0x2

    .line 1761
    new-instance v4, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v4}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 1762
    const/4 v1, 0x1

    iput-boolean v1, v4, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 1763
    invoke-static {p0, v4}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v1

    .line 1764
    const/4 v3, 0x0

    :try_start_1
    iput-boolean v3, v4, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 1765
    iget v3, v4, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    .line 1766
    iget v4, v4, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    .line 1768
    if-le v3, v4, :cond_2

    .line 1770
    :goto_1
    int-to-float v3, v3

    int-to-float v4, v5

    div-float/2addr v3, v4

    float-to-double v4, v3

    .line 1771
    invoke-static {v4, v5}, Ljava/lang/Math;->floor(D)D

    move-result-wide v4

    double-to-int v3, v4

    .line 1772
    if-gtz v3, :cond_6

    .line 1775
    :goto_2
    new-instance v3, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v3}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 1776
    iput v0, v3, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 1777
    invoke-static {p0, v3}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    :try_end_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_4
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2

    move-result-object v0

    .line 1778
    :try_start_2
    sget-object v1, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-virtual {p0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    const-string v3, ".gif"

    invoke-virtual {v1, v3}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v1

    if-ltz v1, :cond_0

    .line 1781
    sget-object v1, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v3}, Landroid/graphics/Bitmap;->copy(Landroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 1782
    if-nez v1, :cond_3

    .line 1813
    :cond_0
    :goto_3
    return-object v0

    :cond_1
    move p1, p2

    .line 1759
    goto :goto_0

    :cond_2
    move v3, v4

    .line 1768
    goto :goto_1

    .line 1785
    :cond_3
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V
    :try_end_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_2 .. :try_end_2} :catch_5
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_3

    move-object v0, v1

    .line 1786
    goto :goto_3

    .line 1800
    :catch_0
    move-exception v0

    move-object v1, v2

    .line 1801
    :goto_4
    if-eqz v1, :cond_4

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v3

    if-nez v3, :cond_4

    .line 1802
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V

    .line 1805
    :cond_4
    invoke-virtual {v0}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    move-object v0, v2

    .line 1806
    goto :goto_3

    .line 1807
    :catch_1
    move-exception v0

    move-object v1, v2

    .line 1808
    :goto_5
    if-eqz v1, :cond_5

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v3

    if-nez v3, :cond_5

    .line 1809
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V

    .line 1812
    :cond_5
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    move-object v0, v2

    .line 1813
    goto :goto_3

    .line 1807
    :catch_2
    move-exception v0

    goto :goto_5

    :catch_3
    move-exception v1

    move-object v6, v1

    move-object v1, v0

    move-object v0, v6

    goto :goto_5

    .line 1800
    :catch_4
    move-exception v0

    goto :goto_4

    :catch_5
    move-exception v1

    move-object v6, v1

    move-object v1, v0

    move-object v0, v6

    goto :goto_4

    :cond_6
    move v0, v3

    goto :goto_2
.end method

.method public static a()Lcom/roidapp/photogrid/release/rf;
    .locals 1

    .prologue
    .line 72
    sget-object v0, Lcom/roidapp/photogrid/release/rf;->d:Lcom/roidapp/photogrid/release/rf;

    return-object v0
.end method

.method public static a(J)Ljava/lang/String;
    .locals 8

    .prologue
    const/4 v0, 0x3

    const/high16 v6, 0x447a0000    # 1000.0f

    .line 2919
    const-wide/32 v2, 0x40000000

    cmp-long v1, p0, v2

    if-ltz v1, :cond_1

    .line 2920
    long-to-float v1, p0

    const/high16 v2, 0x4e800000

    div-float/2addr v1, v2

    .line 2921
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    new-instance v3, Ljava/math/BigDecimal;

    float-to-double v4, v1

    invoke-direct {v3, v4, v5}, Ljava/math/BigDecimal;-><init>(D)V

    new-instance v4, Ljava/math/MathContext;

    cmpl-float v5, v1, v6

    if-ltz v5, :cond_0

    float-to-double v0, v1

    invoke-static {v0, v1}, Ljava/lang/Math;->log10(D)D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-int v0, v0

    :cond_0
    invoke-direct {v4, v0}, Ljava/math/MathContext;-><init>(I)V

    invoke-virtual {v3, v4}, Ljava/math/BigDecimal;->round(Ljava/math/MathContext;)Ljava/math/BigDecimal;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigDecimal;->toPlainString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "GB"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 2931
    :goto_0
    return-object v0

    .line 2923
    :cond_1
    const-wide/32 v2, 0x100000

    cmp-long v1, p0, v2

    if-ltz v1, :cond_3

    .line 2924
    long-to-float v1, p0

    const/high16 v2, 0x49800000    # 1048576.0f

    div-float/2addr v1, v2

    .line 2925
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    new-instance v3, Ljava/math/BigDecimal;

    float-to-double v4, v1

    invoke-direct {v3, v4, v5}, Ljava/math/BigDecimal;-><init>(D)V

    new-instance v4, Ljava/math/MathContext;

    cmpl-float v5, v1, v6

    if-ltz v5, :cond_2

    float-to-double v0, v1

    invoke-static {v0, v1}, Ljava/lang/Math;->log10(D)D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-int v0, v0

    :cond_2
    invoke-direct {v4, v0}, Ljava/math/MathContext;-><init>(I)V

    invoke-virtual {v3, v4}, Ljava/math/BigDecimal;->round(Ljava/math/MathContext;)Ljava/math/BigDecimal;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigDecimal;->toPlainString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "MB"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 2927
    :cond_3
    const-wide/16 v2, 0x400

    cmp-long v1, p0, v2

    if-ltz v1, :cond_5

    .line 2928
    long-to-float v1, p0

    const/high16 v2, 0x44800000    # 1024.0f

    div-float/2addr v1, v2

    .line 2929
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    new-instance v3, Ljava/math/BigDecimal;

    float-to-double v4, v1

    invoke-direct {v3, v4, v5}, Ljava/math/BigDecimal;-><init>(D)V

    new-instance v4, Ljava/math/MathContext;

    cmpl-float v5, v1, v6

    if-ltz v5, :cond_4

    float-to-double v0, v1

    invoke-static {v0, v1}, Ljava/lang/Math;->log10(D)D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-int v0, v0

    :cond_4
    invoke-direct {v4, v0}, Ljava/math/MathContext;-><init>(I)V

    invoke-virtual {v3, v4}, Ljava/math/BigDecimal;->round(Ljava/math/MathContext;)Ljava/math/BigDecimal;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigDecimal;->toPlainString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "KB"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 2931
    :cond_5
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p0, p1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "B"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_0
.end method

.method private static a(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;Z)Ljava/lang/String;
    .locals 8

    .prologue
    const/4 v7, -0x1

    const/4 v6, 0x0

    .line 3094
    .line 3096
    if-eqz p4, :cond_2

    .line 3099
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const/4 v1, 0x3

    new-array v2, v1, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v3, "_data"

    aput-object v3, v2, v1

    const/4 v1, 0x1

    const-string v3, "title"

    aput-object v3, v2, v1

    const/4 v1, 0x2

    const-string v3, "artist"

    aput-object v3, v2, v1

    const/4 v5, 0x0

    move-object v1, p1

    move-object v3, p2

    move-object v4, p3

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    .line 3102
    if-eqz v1, :cond_5

    .line 3103
    :try_start_1
    invoke-interface {v1}, Landroid/database/Cursor;->moveToFirst()Z

    .line 3104
    const-string v0, "_data"

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 3105
    const-string v2, "title"

    invoke-interface {v1, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v2

    invoke-interface {v1, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 3106
    const-string v3, "artist"

    invoke-interface {v1, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v3

    invoke-interface {v1, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    .line 3107
    if-eqz v2, :cond_1

    if-eqz v3, :cond_1

    .line 3108
    const-string v4, "Music: "

    .line 3109
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 3110
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v4, " - "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 3111
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 3120
    :goto_0
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v3

    invoke-virtual {v3, v2}, Lcom/roidapp/photogrid/release/ih;->f(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_5

    .line 3126
    :goto_1
    if-eqz v1, :cond_0

    .line 3128
    :try_start_2
    invoke-interface {v1}, Landroid/database/Cursor;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 3156
    :cond_0
    :goto_2
    return-object v0

    .line 3113
    :cond_1
    :try_start_3
    const-string v2, "/"

    invoke-virtual {v0, v2}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v2

    .line 3114
    const-string v3, "."

    invoke-virtual {v0, v3}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v3

    .line 3115
    if-eq v2, v7, :cond_4

    if-eq v3, v7, :cond_4

    .line 3116
    const-string v4, "Music: "

    .line 3117
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    add-int/lit8 v2, v2, 0x1

    invoke-virtual {v0, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_5

    move-result-object v2

    goto :goto_0

    .line 3123
    :catch_0
    move-exception v0

    move-object v1, v6

    :goto_3
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    move-object v0, v6

    .line 3124
    goto :goto_1

    .line 3130
    :catch_1
    move-exception v1

    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_2

    .line 3137
    :cond_2
    :try_start_4
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const/4 v1, 0x1

    new-array v2, v1, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v3, "_data"

    aput-object v3, v2, v1

    const/4 v5, 0x0

    move-object v1, p1

    move-object v3, p2

    move-object v4, p3

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_3

    move-result-object v1

    .line 3138
    if-eqz v1, :cond_3

    .line 3139
    :try_start_5
    invoke-interface {v1}, Landroid/database/Cursor;->moveToFirst()Z

    .line 3140
    const-string v0, "_data"

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_4

    move-result-object v6

    :cond_3
    move-object v0, v6

    .line 3146
    :goto_4
    if-eqz v1, :cond_0

    .line 3148
    :try_start_6
    invoke-interface {v1}, Landroid/database/Cursor;->close()V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_2

    goto :goto_2

    .line 3150
    :catch_2
    move-exception v1

    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_2

    .line 3143
    :catch_3
    move-exception v0

    move-object v1, v6

    :goto_5
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    move-object v0, v6

    .line 3144
    goto :goto_4

    .line 3143
    :catch_4
    move-exception v0

    goto :goto_5

    .line 3123
    :catch_5
    move-exception v0

    goto :goto_3

    :cond_4
    move-object v2, v6

    goto :goto_0

    :cond_5
    move-object v0, v6

    goto :goto_1
.end method

.method public static a(Landroid/content/Context;Ljava/util/ArrayList;[III)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/roidapp/photogrid/release/ic;",
            ">;[III)V"
        }
    .end annotation

    .prologue
    const/4 v3, 0x4

    const/4 v0, 0x1

    .line 716
    :try_start_0
    sget v1, Lcom/roidapp/photogrid/common/az;->q:I

    if-ne v1, v3, :cond_6

    .line 717
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ih;->h()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ih;->W()I

    move-result v1

    if-ne v1, v3, :cond_4

    .line 718
    :cond_0
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->c()Ljava/util/List;

    move-result-object v0

    .line 771
    :goto_0
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/rg;

    .line 772
    new-instance v3, Lcom/roidapp/photogrid/release/ic;

    invoke-direct {v3}, Lcom/roidapp/photogrid/release/ic;-><init>()V

    .line 773
    iget-object v1, v3, Lcom/roidapp/photogrid/release/ic;->b:Lcom/roidapp/photogrid/release/lc;

    .line 774
    if-nez v1, :cond_2

    .line 775
    new-instance v1, Lcom/roidapp/photogrid/release/lc;

    invoke-direct {v1}, Lcom/roidapp/photogrid/release/lc;-><init>()V

    .line 776
    iput-object v1, v3, Lcom/roidapp/photogrid/release/ic;->b:Lcom/roidapp/photogrid/release/lc;

    .line 779
    :cond_2
    iget v4, v0, Lcom/roidapp/photogrid/release/rg;->a:I

    iput v4, v3, Lcom/roidapp/photogrid/release/ic;->c:I

    .line 782
    invoke-static {v1, v0}, Lcom/roidapp/photogrid/release/rf;->a(Lcom/roidapp/photogrid/release/lc;Lcom/roidapp/photogrid/release/rg;)V

    .line 792
    if-eqz p1, :cond_1

    .line 793
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_1

    .line 801
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Lorg/xmlpull/v1/XmlPullParserException;->printStackTrace()V

    .line 805
    :cond_3
    :goto_2
    return-void

    .line 720
    :cond_4
    :try_start_1
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ih;->az()Ljava/util/List;

    move-result-object v1

    .line 721
    if-eqz v1, :cond_5

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    if-ne v2, p4, :cond_5

    .line 723
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    move v1, v0

    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/lc;

    .line 724
    new-instance v3, Lcom/roidapp/photogrid/release/ic;

    invoke-direct {v3}, Lcom/roidapp/photogrid/release/ic;-><init>()V

    .line 725
    iput-object v0, v3, Lcom/roidapp/photogrid/release/ic;->b:Lcom/roidapp/photogrid/release/lc;

    .line 726
    iput v1, v3, Lcom/roidapp/photogrid/release/ic;->c:I

    .line 727
    add-int/lit8 v0, v1, 0x1

    .line 728
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move v1, v0

    .line 729
    goto :goto_3

    .line 733
    :cond_5
    aget v0, p2, p3

    invoke-static {p0, v0}, Lcom/roidapp/photogrid/release/rf;->b(Landroid/content/Context;I)Ljava/util/List;

    move-result-object v0

    goto :goto_0

    .line 736
    :cond_6
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ih;->az()Ljava/util/List;

    move-result-object v1

    .line 737
    if-eqz v1, :cond_7

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    if-ne v2, p4, :cond_7

    .line 739
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    move v1, v0

    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/lc;

    .line 740
    new-instance v3, Lcom/roidapp/photogrid/release/ic;

    invoke-direct {v3}, Lcom/roidapp/photogrid/release/ic;-><init>()V

    .line 741
    iput-object v0, v3, Lcom/roidapp/photogrid/release/ic;->b:Lcom/roidapp/photogrid/release/lc;

    .line 742
    iput v1, v3, Lcom/roidapp/photogrid/release/ic;->c:I

    .line 743
    add-int/lit8 v0, v1, 0x1

    .line 744
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move v1, v0

    .line 745
    goto :goto_4

    .line 749
    :cond_7
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->W()I

    move-result v0

    if-ne v0, v3, :cond_8

    .line 750
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->c()Ljava/util/List;

    move-result-object v0

    goto/16 :goto_0

    .line 752
    :cond_8
    array-length v0, p2

    if-ge p3, v0, :cond_9

    aget v0, p2, p3

    const/16 v1, 0x14

    if-ge v0, v1, :cond_a

    .line 753
    :cond_9
    invoke-static {}, Lcom/roidapp/photogrid/common/aj;->a()Lcom/roidapp/photogrid/common/aj;

    move-result-object v0

    iget-object v0, v0, Lcom/roidapp/photogrid/common/aj;->a:[I

    add-int/lit8 v1, p4, -0x1

    aget p3, v0, v1

    .line 755
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Shape/Error/Load/"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/photogrid/common/b;->a(Ljava/lang/String;)V

    .line 756
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    const/4 v1, 0x5

    if-ne v0, v1, :cond_b

    .line 757
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->k(I)V

    .line 761
    :goto_5
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->p(Z)V

    .line 762
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0, p3}, Lcom/roidapp/photogrid/release/ih;->i(I)V

    .line 763
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0, p3}, Lcom/roidapp/photogrid/release/ih;->r(I)V

    .line 766
    :cond_a
    aget v0, p2, p3

    invoke-static {p0, v0}, Lcom/roidapp/photogrid/release/rf;->b(Landroid/content/Context;I)Ljava/util/List;

    move-result-object v0

    goto/16 :goto_0

    .line 759
    :cond_b
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->k(I)V
    :try_end_1
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_5

    .line 803
    :catch_1
    move-exception v0

    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    goto/16 :goto_2
.end method

.method public static a(Landroid/view/View;Landroid/widget/RelativeLayout;Landroid/content/Context;)V
    .locals 8

    .prologue
    const/high16 v7, 0x42c80000    # 100.0f

    const/high16 v6, 0x3f800000    # 1.0f

    const/4 v0, 0x0

    const v4, 0x42416666    # 48.35f

    const/4 v5, 0x0

    .line 607
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    .line 611
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v2

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/ih;->R()F

    move-result v2

    cmpg-float v2, v2, v0

    if-gez v2, :cond_0

    .line 612
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/roidapp/photogrid/release/ih;->d(F)V

    .line 617
    :cond_0
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v2

    const v3, 0x42c16666    # 96.7f

    invoke-virtual {v2, v3}, Lcom/roidapp/photogrid/release/ih;->c(F)V

    .line 624
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v2

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/ih;->R()F

    move-result v2

    cmpl-float v2, v2, v4

    if-lez v2, :cond_1

    .line 625
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v2

    invoke-virtual {v2, v4}, Lcom/roidapp/photogrid/release/ih;->d(F)V

    .line 627
    :cond_1
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v2

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/ih;->S()F

    move-result v2

    cmpl-float v2, v2, v4

    if-lez v2, :cond_2

    .line 628
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v2

    invoke-virtual {v2, v4}, Lcom/roidapp/photogrid/release/ih;->e(F)V

    .line 631
    :cond_2
    iget v2, v1, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 632
    iget v3, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 635
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ih;->t()F

    move-result v1

    cmpg-float v1, v1, v6

    if-gez v1, :cond_5

    .line 636
    int-to-float v0, v2

    move v1, v0

    .line 644
    :goto_0
    invoke-virtual {p1}, Landroid/widget/RelativeLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 646
    invoke-virtual {v0, v5, v5, v5, v5}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 647
    iput v2, v0, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    .line 648
    iput v3, v0, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 649
    invoke-virtual {p1, v0}, Landroid/widget/RelativeLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 652
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->Q()F

    move-result v0

    mul-float/2addr v0, v1

    div-float/2addr v0, v7

    .line 653
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ih;->V()F

    move-result v1

    div-float/2addr v1, v0

    const/high16 v4, 0x43480000    # 200.0f

    mul-float/2addr v1, v4

    float-to-int v1, v1

    .line 654
    int-to-float v1, v1

    cmpl-float v1, v1, v7

    if-lez v1, :cond_3

    .line 655
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v0, v4

    invoke-virtual {v1, v0}, Lcom/roidapp/photogrid/release/ih;->f(F)V

    .line 659
    :cond_3
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/roidapp/videolib/gl/GPUVideoView;

    .line 660
    if-nez v0, :cond_4

    .line 661
    new-instance v0, Lcom/roidapp/videolib/gl/GPUVideoView;

    invoke-direct {v0, p2}, Lcom/roidapp/videolib/gl/GPUVideoView;-><init>(Landroid/content/Context;)V

    .line 662
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/roidapp/videolib/gl/GPUVideoView;->setId(I)V

    .line 663
    invoke-virtual {p1, v0}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V

    .line 665
    :cond_4
    new-instance v1, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-direct {v1, v2, v3}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 668
    invoke-virtual {v1, v5, v5, v5, v5}, Landroid/widget/RelativeLayout$LayoutParams;->setMargins(IIII)V

    .line 669
    invoke-virtual {v0, v1}, Lcom/roidapp/videolib/gl/GPUVideoView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 671
    return-void

    .line 637
    :cond_5
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ih;->t()F

    move-result v1

    cmpl-float v1, v1, v6

    if-lez v1, :cond_6

    .line 638
    int-to-float v0, v3

    move v1, v0

    goto :goto_0

    .line 639
    :cond_6
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ih;->t()F

    move-result v1

    cmpl-float v1, v1, v6

    if-nez v1, :cond_7

    .line 640
    int-to-float v0, v2

    move v1, v0

    goto :goto_0

    :cond_7
    move v1, v0

    goto :goto_0
.end method

.method public static a(Landroid/view/View;Landroid/widget/RelativeLayout;Landroid/widget/LinearLayout;Landroid/app/Activity;[Lcom/roidapp/photogrid/release/ig;Ljava/util/ArrayList;)V
    .locals 25
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            "Landroid/widget/RelativeLayout;",
            "Landroid/widget/LinearLayout;",
            "Landroid/app/Activity;",
            "[",
            "Lcom/roidapp/photogrid/release/ig;",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/roidapp/photogrid/release/ic;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 329
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v8

    .line 330
    const/high16 v3, 0x42c80000    # 100.0f

    .line 333
    const/4 v2, 0x0

    .line 335
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v12

    .line 338
    sget v4, Lcom/roidapp/photogrid/common/az;->q:I

    const/4 v5, 0x4

    if-ne v4, v5, :cond_2

    .line 339
    invoke-virtual {v12}, Lcom/roidapp/photogrid/release/ih;->h()Z

    move-result v4

    if-nez v4, :cond_1

    .line 340
    invoke-virtual {v12}, Lcom/roidapp/photogrid/release/ih;->n()Ljava/util/List;

    move-result-object v2

    move-object/from16 v18, v2

    .line 348
    :goto_0
    invoke-virtual/range {p5 .. p5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_1
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/roidapp/photogrid/release/ic;

    .line 349
    const/4 v5, 0x0

    .line 350
    iget-object v10, v2, Lcom/roidapp/photogrid/release/ic;->b:Lcom/roidapp/photogrid/release/lc;

    .line 352
    iget-object v11, v10, Lcom/roidapp/photogrid/release/lc;->b:Ljava/util/List;

    .line 353
    invoke-interface {v11}, Ljava/util/List;->size()I

    move-result v2

    add-int/lit8 v13, v2, -0x1

    .line 354
    const/4 v2, 0x0

    move v6, v2

    move v4, v3

    :goto_2
    if-ge v6, v13, :cond_4

    .line 355
    invoke-interface {v11, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/graphics/PointF;

    .line 356
    add-int/lit8 v3, v6, 0x1

    invoke-interface {v11, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/graphics/PointF;

    .line 357
    iget v7, v3, Landroid/graphics/PointF;->x:F

    iget v14, v2, Landroid/graphics/PointF;->x:F

    sub-float/2addr v7, v14

    invoke-static {v7}, Ljava/lang/Math;->abs(F)F

    move-result v7

    .line 358
    iget v3, v3, Landroid/graphics/PointF;->y:F

    iget v2, v2, Landroid/graphics/PointF;->y:F

    sub-float v2, v3, v2

    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    move-result v3

    .line 359
    cmpl-float v2, v7, v3

    if-lez v2, :cond_3

    move v2, v7

    .line 364
    :goto_3
    const/4 v14, 0x0

    cmpl-float v7, v7, v14

    if-eqz v7, :cond_0

    const/4 v7, 0x0

    cmpl-float v3, v3, v7

    if-eqz v3, :cond_0

    .line 365
    const/4 v5, 0x1

    .line 367
    :cond_0
    const/high16 v3, 0x40400000    # 3.0f

    cmpl-float v3, v2, v3

    if-lez v3, :cond_28

    cmpl-float v3, v4, v2

    if-lez v3, :cond_28

    .line 354
    :goto_4
    add-int/lit8 v3, v6, 0x1

    move v6, v3

    move v4, v2

    goto :goto_2

    .line 341
    :cond_1
    invoke-virtual {v12}, Lcom/roidapp/photogrid/release/ih;->W()I

    move-result v4

    const/4 v5, 0x4

    if-ne v4, v5, :cond_29

    .line 342
    invoke-virtual {v12}, Lcom/roidapp/photogrid/release/ih;->n()Ljava/util/List;

    move-result-object v2

    move-object/from16 v18, v2

    goto :goto_0

    .line 344
    :cond_2
    invoke-virtual {v12}, Lcom/roidapp/photogrid/release/ih;->W()I

    move-result v4

    const/4 v5, 0x4

    if-ne v4, v5, :cond_29

    .line 345
    invoke-virtual {v12}, Lcom/roidapp/photogrid/release/ih;->n()Ljava/util/List;

    move-result-object v2

    move-object/from16 v18, v2

    goto :goto_0

    :cond_3
    move v2, v3

    .line 362
    goto :goto_3

    .line 371
    :cond_4
    const/4 v2, 0x0

    invoke-interface {v11, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/graphics/PointF;

    .line 372
    invoke-interface {v11}, Ljava/util/List;->size()I

    move-result v3

    add-int/lit8 v3, v3, -0x1

    invoke-interface {v11, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/graphics/PointF;

    .line 373
    iget v6, v3, Landroid/graphics/PointF;->x:F

    iget v7, v2, Landroid/graphics/PointF;->x:F

    sub-float/2addr v6, v7

    invoke-static {v6}, Ljava/lang/Math;->abs(F)F

    move-result v6

    .line 374
    iget v3, v3, Landroid/graphics/PointF;->y:F

    iget v2, v2, Landroid/graphics/PointF;->y:F

    sub-float v2, v3, v2

    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    move-result v3

    .line 375
    cmpl-float v2, v6, v3

    if-lez v2, :cond_5

    move v2, v6

    .line 380
    :goto_5
    const/4 v7, 0x0

    cmpl-float v6, v6, v7

    if-eqz v6, :cond_27

    const/4 v6, 0x0

    cmpl-float v3, v3, v6

    if-eqz v3, :cond_27

    .line 381
    const/4 v3, 0x1

    .line 383
    :goto_6
    const/high16 v5, 0x40400000    # 3.0f

    cmpl-float v5, v2, v5

    if-lez v5, :cond_26

    cmpl-float v5, v4, v2

    if-lez v5, :cond_26

    .line 387
    :goto_7
    iput-boolean v3, v10, Lcom/roidapp/photogrid/release/lc;->f:Z

    move v3, v2

    .line 388
    goto/16 :goto_1

    :cond_5
    move v2, v3

    .line 378
    goto :goto_5

    .line 391
    :cond_6
    invoke-virtual {v12}, Lcom/roidapp/photogrid/release/ih;->R()F

    move-result v2

    const/4 v4, 0x0

    cmpg-float v2, v2, v4

    if-gez v2, :cond_7

    .line 392
    const/4 v2, 0x0

    invoke-virtual {v12, v2}, Lcom/roidapp/photogrid/release/ih;->d(F)V

    .line 396
    :cond_7
    const/high16 v2, 0x3f800000    # 1.0f

    sub-float v2, v3, v2

    const v3, 0x40133333    # 2.3f

    sub-float v11, v2, v3

    .line 397
    invoke-virtual {v12, v11}, Lcom/roidapp/photogrid/release/ih;->c(F)V

    .line 404
    invoke-virtual {v12}, Lcom/roidapp/photogrid/release/ih;->R()F

    move-result v2

    const/high16 v3, 0x40000000    # 2.0f

    div-float v3, v11, v3

    cmpl-float v2, v2, v3

    if-lez v2, :cond_8

    .line 405
    const/high16 v2, 0x40000000    # 2.0f

    div-float v2, v11, v2

    invoke-virtual {v12, v2}, Lcom/roidapp/photogrid/release/ih;->d(F)V

    .line 407
    :cond_8
    invoke-virtual {v12}, Lcom/roidapp/photogrid/release/ih;->S()F

    move-result v2

    const/high16 v3, 0x40000000    # 2.0f

    div-float v3, v11, v3

    cmpl-float v2, v2, v3

    if-lez v2, :cond_9

    .line 408
    const/high16 v2, 0x40000000    # 2.0f

    div-float v2, v11, v2

    invoke-virtual {v12, v2}, Lcom/roidapp/photogrid/release/ih;->e(F)V

    .line 413
    :cond_9
    iget v9, v8, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 414
    iget v8, v8, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 416
    invoke-virtual {v12}, Lcom/roidapp/photogrid/release/ih;->R()F

    move-result v4

    .line 417
    invoke-virtual {v12}, Lcom/roidapp/photogrid/release/ih;->S()F

    move-result v10

    .line 419
    const/4 v5, 0x0

    .line 420
    const/4 v3, 0x0

    .line 422
    const/4 v2, 0x0

    .line 424
    invoke-virtual {v12}, Lcom/roidapp/photogrid/release/ih;->t()F

    move-result v6

    .line 425
    const/high16 v7, 0x3f800000    # 1.0f

    cmpg-float v7, v6, v7

    if-gez v7, :cond_f

    .line 427
    int-to-float v2, v9

    int-to-float v3, v8

    div-float/2addr v2, v3

    mul-float v3, v2, v4

    .line 428
    int-to-float v2, v9

    move/from16 v19, v3

    move/from16 v20, v4

    move v3, v2

    .line 439
    :goto_8
    const/4 v5, 0x0

    .line 440
    const/4 v2, 0x0

    .line 442
    sget v7, Lcom/roidapp/photogrid/common/az;->q:I

    const/4 v13, 0x4

    if-eq v7, v13, :cond_24

    sget v7, Lcom/roidapp/photogrid/common/az;->q:I

    const/16 v13, 0x8

    if-eq v7, v13, :cond_24

    .line 444
    const/high16 v2, 0x3f800000    # 1.0f

    cmpg-float v2, v6, v2

    if-gez v2, :cond_11

    .line 445
    const v2, 0x3c3c6a7f    # 0.0115f

    mul-float/2addr v2, v3

    .line 446
    mul-float v5, v2, v6

    move v6, v2

    move v7, v5

    .line 457
    :goto_9
    if-eqz p2, :cond_a

    .line 458
    invoke-virtual/range {p2 .. p2}, Landroid/widget/LinearLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    check-cast v2, Landroid/widget/RelativeLayout$LayoutParams;

    .line 459
    float-to-double v14, v7

    invoke-static {v14, v15}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v14

    double-to-int v5, v14

    .line 460
    float-to-double v14, v6

    invoke-static {v14, v15}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v14

    double-to-int v13, v14

    .line 461
    mul-int/lit8 v14, v5, 0x2

    sub-int v14, v9, v14

    iput v14, v2, Landroid/widget/RelativeLayout$LayoutParams;->width:I

    .line 462
    mul-int/lit8 v14, v13, 0x2

    sub-int v14, v8, v14

    iput v14, v2, Landroid/widget/RelativeLayout$LayoutParams;->height:I

    .line 463
    invoke-virtual {v2, v5, v13, v5, v13}, Landroid/widget/RelativeLayout$LayoutParams;->setMargins(IIII)V

    .line 464
    move-object/from16 v0, p2

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 470
    :cond_a
    invoke-virtual/range {p1 .. p1}, Landroid/widget/RelativeLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    check-cast v2, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 473
    const/4 v5, 0x0

    .line 474
    invoke-virtual {v12}, Lcom/roidapp/photogrid/release/ih;->A()I

    move-result v13

    if-eqz v13, :cond_23

    invoke-virtual {v12}, Lcom/roidapp/photogrid/release/ih;->B()Z

    move-result v13

    if-nez v13, :cond_23

    const/4 v13, 0x0

    cmpl-float v13, v10, v13

    if-nez v13, :cond_b

    const/4 v13, 0x0

    cmpl-float v4, v4, v13

    if-eqz v4, :cond_23

    .line 475
    :cond_b
    invoke-virtual/range {p5 .. p5}, Ljava/util/ArrayList;->size()I

    move-result v4

    const/4 v5, 0x1

    if-le v4, v5, :cond_13

    .line 476
    const v4, 0x3b9d0369

    .line 482
    :goto_a
    const/high16 v5, 0x42c80000    # 100.0f

    div-float v5, v10, v5

    add-float/2addr v5, v4

    mul-float/2addr v5, v3

    add-float/2addr v5, v7

    invoke-static {v5}, Ljava/lang/Math;->round(F)I

    move-result v5

    .line 483
    const/high16 v7, 0x42c80000    # 100.0f

    div-float v7, v10, v7

    add-float/2addr v4, v7

    mul-float/2addr v4, v3

    add-float/2addr v4, v6

    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    move-result v6

    .line 485
    mul-int/lit8 v4, v5, 0x2

    sub-int v4, v9, v4

    .line 486
    mul-int/lit8 v7, v6, 0x2

    sub-int v9, v8, v7

    .line 489
    invoke-virtual {v2, v5, v6, v5, v6}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 491
    invoke-virtual {v12}, Lcom/roidapp/photogrid/release/ih;->W()I

    move-result v5

    const/4 v6, 0x4

    if-ne v5, v6, :cond_22

    .line 492
    if-le v4, v9, :cond_14

    move v10, v9

    .line 498
    :goto_b
    iput v9, v2, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    .line 499
    iput v10, v2, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 500
    move-object/from16 v0, p1

    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 503
    mul-float v2, v11, v3

    const/high16 v3, 0x42c80000    # 100.0f

    div-float/2addr v2, v3

    .line 504
    invoke-virtual {v12}, Lcom/roidapp/photogrid/release/ih;->V()F

    move-result v3

    div-float/2addr v3, v2

    const/high16 v4, 0x43480000    # 200.0f

    mul-float/2addr v3, v4

    float-to-int v3, v3

    .line 505
    int-to-float v3, v3

    const/high16 v4, 0x42c80000    # 100.0f

    cmpl-float v3, v3, v4

    if-lez v3, :cond_c

    .line 506
    const/high16 v3, 0x40000000    # 2.0f

    div-float v3, v2, v3

    invoke-virtual {v12, v3}, Lcom/roidapp/photogrid/release/ih;->f(F)V

    .line 507
    const/4 v3, 0x0

    move-object/from16 v0, p3

    invoke-virtual {v0, v3}, Landroid/app/Activity;->getPreferences(I)Landroid/content/SharedPreferences;

    move-result-object v3

    invoke-interface {v3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v3

    const-string v4, "CORNER_RADIOUS"

    const/high16 v5, 0x40000000    # 2.0f

    div-float/2addr v2, v5

    invoke-interface {v3, v4, v2}, Landroid/content/SharedPreferences$Editor;->putFloat(Ljava/lang/String;F)Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 509
    :cond_c
    const/4 v2, 0x0

    .line 510
    invoke-virtual {v12}, Lcom/roidapp/photogrid/release/ih;->I()I

    move-result v11

    .line 512
    move/from16 v0, v20

    invoke-virtual {v12, v0}, Lcom/roidapp/photogrid/release/ih;->j(F)V

    .line 513
    move/from16 v0, v19

    invoke-virtual {v12, v0}, Lcom/roidapp/photogrid/release/ih;->k(F)V

    .line 515
    invoke-virtual/range {p5 .. p5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v22

    move/from16 v21, v2

    :goto_c
    invoke-interface/range {v22 .. v22}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_21

    invoke-interface/range {v22 .. v22}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lcom/roidapp/photogrid/release/ic;

    .line 516
    iget-object v2, v3, Lcom/roidapp/photogrid/release/ic;->b:Lcom/roidapp/photogrid/release/lc;

    .line 517
    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/lc;->a()Lcom/roidapp/photogrid/release/lc;

    move-result-object v5

    .line 3682
    iget-object v2, v5, Lcom/roidapp/photogrid/release/lc;->e:Landroid/graphics/PointF;

    .line 3683
    iget v4, v2, Landroid/graphics/PointF;->x:F

    .line 3684
    iget v6, v2, Landroid/graphics/PointF;->y:F

    .line 3685
    iget v2, v5, Lcom/roidapp/photogrid/release/lc;->j:F

    add-float v2, v2, v20

    iput v2, v5, Lcom/roidapp/photogrid/release/lc;->j:F

    .line 3686
    iget v2, v5, Lcom/roidapp/photogrid/release/lc;->k:F

    add-float v2, v2, v19

    iput v2, v5, Lcom/roidapp/photogrid/release/lc;->k:F

    .line 3688
    iget-object v2, v5, Lcom/roidapp/photogrid/release/lc;->b:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_d
    :goto_d
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_15

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/graphics/PointF;

    .line 3689
    iget v8, v2, Landroid/graphics/PointF;->x:F

    cmpl-float v8, v8, v4

    if-lez v8, :cond_e

    .line 3690
    iget v8, v2, Landroid/graphics/PointF;->x:F

    const/high16 v12, 0x40000000    # 2.0f

    mul-float v12, v12, v20

    sub-float/2addr v8, v12

    iput v8, v2, Landroid/graphics/PointF;->x:F

    .line 3692
    :cond_e
    iget v8, v2, Landroid/graphics/PointF;->y:F

    cmpl-float v8, v8, v6

    if-lez v8, :cond_d

    .line 3693
    iget v8, v2, Landroid/graphics/PointF;->y:F

    const/high16 v12, 0x40000000    # 2.0f

    mul-float v12, v12, v19

    sub-float/2addr v8, v12

    iput v8, v2, Landroid/graphics/PointF;->y:F

    goto :goto_d

    .line 429
    :cond_f
    const/high16 v7, 0x3f800000    # 1.0f

    cmpl-float v7, v6, v7

    if-lez v7, :cond_10

    .line 430
    int-to-float v2, v8

    int-to-float v3, v9

    div-float/2addr v2, v3

    mul-float v3, v2, v4

    .line 432
    int-to-float v2, v8

    move/from16 v19, v4

    move/from16 v20, v3

    move v3, v2

    goto/16 :goto_8

    .line 433
    :cond_10
    const/high16 v7, 0x3f800000    # 1.0f

    cmpl-float v7, v6, v7

    if-nez v7, :cond_25

    .line 436
    int-to-float v2, v9

    move v3, v2

    move/from16 v19, v4

    move/from16 v20, v4

    goto/16 :goto_8

    .line 447
    :cond_11
    const/high16 v2, 0x3f800000    # 1.0f

    cmpl-float v2, v6, v2

    if-lez v2, :cond_12

    .line 448
    const v2, 0x3c3c6a7f    # 0.0115f

    mul-float v5, v2, v3

    .line 449
    div-float v2, v5, v6

    move v6, v2

    move v7, v5

    goto/16 :goto_9

    .line 451
    :cond_12
    const v2, 0x3c3c6a7f    # 0.0115f

    mul-float/2addr v2, v3

    move v6, v2

    move v7, v2

    .line 452
    goto/16 :goto_9

    .line 478
    :cond_13
    const v4, 0x3c1d0369

    goto/16 :goto_a

    :cond_14
    move v9, v4

    move v10, v4

    .line 495
    goto/16 :goto_b

    .line 3696
    :cond_15
    iget v2, v5, Lcom/roidapp/photogrid/release/lc;->l:F

    const/high16 v4, 0x40000000    # 2.0f

    mul-float v4, v4, v20

    sub-float/2addr v2, v4

    iput v2, v5, Lcom/roidapp/photogrid/release/lc;->l:F

    .line 3697
    iget v2, v5, Lcom/roidapp/photogrid/release/lc;->m:F

    const/high16 v4, 0x40000000    # 2.0f

    mul-float v4, v4, v19

    sub-float/2addr v2, v4

    iput v2, v5, Lcom/roidapp/photogrid/release/lc;->m:F

    .line 3699
    new-instance v2, Landroid/graphics/PointF;

    iget v4, v5, Lcom/roidapp/photogrid/release/lc;->l:F

    const/high16 v6, 0x40000000    # 2.0f

    div-float/2addr v4, v6

    iget v6, v5, Lcom/roidapp/photogrid/release/lc;->m:F

    const/high16 v7, 0x40000000    # 2.0f

    div-float/2addr v6, v7

    invoke-direct {v2, v4, v6}, Landroid/graphics/PointF;-><init>(FF)V

    iput-object v2, v5, Lcom/roidapp/photogrid/release/lc;->e:Landroid/graphics/PointF;

    .line 533
    iget v2, v5, Lcom/roidapp/photogrid/release/lc;->l:F

    const/4 v4, 0x0

    cmpg-float v2, v2, v4

    if-gtz v2, :cond_16

    .line 534
    const/high16 v2, 0x3f800000    # 1.0f

    iput v2, v5, Lcom/roidapp/photogrid/release/lc;->l:F

    .line 536
    :cond_16
    iget v2, v5, Lcom/roidapp/photogrid/release/lc;->m:F

    const/4 v4, 0x0

    cmpg-float v2, v2, v4

    if-gtz v2, :cond_17

    .line 537
    const/high16 v2, 0x3f800000    # 1.0f

    iput v2, v5, Lcom/roidapp/photogrid/release/lc;->m:F

    .line 540
    :cond_17
    int-to-float v2, v9

    iget v4, v5, Lcom/roidapp/photogrid/release/lc;->j:F

    mul-float/2addr v2, v4

    const/high16 v4, 0x42c80000    # 100.0f

    div-float/2addr v2, v4

    float-to-double v6, v2

    invoke-static {v6, v7}, Ljava/lang/Math;->floor(D)D

    move-result-wide v6

    double-to-int v0, v6

    move/from16 v23, v0

    .line 541
    int-to-float v2, v10

    iget v4, v5, Lcom/roidapp/photogrid/release/lc;->k:F

    mul-float/2addr v2, v4

    const/high16 v4, 0x42c80000    # 100.0f

    div-float/2addr v2, v4

    float-to-double v6, v2

    invoke-static {v6, v7}, Ljava/lang/Math;->floor(D)D

    move-result-wide v6

    double-to-int v0, v6

    move/from16 v24, v0

    .line 543
    int-to-float v2, v9

    iget v4, v5, Lcom/roidapp/photogrid/release/lc;->l:F

    mul-float/2addr v2, v4

    const/high16 v4, 0x42c80000    # 100.0f

    div-float/2addr v2, v4

    float-to-double v6, v2

    invoke-static {v6, v7}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v6

    double-to-int v7, v6

    .line 544
    int-to-float v2, v10

    iget v4, v5, Lcom/roidapp/photogrid/release/lc;->m:F

    mul-float/2addr v2, v4

    const/high16 v4, 0x42c80000    # 100.0f

    div-float/2addr v2, v4

    float-to-double v12, v2

    invoke-static {v12, v13}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v12

    double-to-int v8, v12

    .line 546
    iget v13, v3, Lcom/roidapp/photogrid/release/ic;->c:I

    .line 547
    move-object/from16 v0, p1

    invoke-virtual {v0, v13}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v12

    check-cast v12, Lcom/roidapp/photogrid/release/if;

    .line 548
    if-nez v12, :cond_1c

    .line 550
    const/4 v4, 0x0

    .line 551
    if-eqz v18, :cond_18

    invoke-interface/range {v18 .. v18}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_18

    .line 552
    move-object/from16 v0, v18

    move/from16 v1, v21

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-static {v2, v7, v8}, Lcom/roidapp/photogrid/release/rf;->b(Ljava/lang/String;II)Landroid/graphics/Bitmap;

    move-result-object v4

    .line 554
    :cond_18
    if-eqz p4, :cond_19

    move-object/from16 v0, p4

    array-length v2, v0

    move/from16 v0, v21

    if-ge v0, v2, :cond_19

    aget-object v2, p4, v21

    if-nez v2, :cond_1a

    .line 555
    :cond_19
    new-instance v2, Ljava/lang/OutOfMemoryError;

    const-string v3, "create OOM"

    invoke-direct {v2, v3}, Ljava/lang/OutOfMemoryError;-><init>(Ljava/lang/String;)V

    throw v2

    .line 557
    :cond_1a
    new-instance v2, Lcom/roidapp/photogrid/release/if;

    aget-object v6, p4, v21

    move-object/from16 v3, p3

    invoke-direct/range {v2 .. v11}, Lcom/roidapp/photogrid/release/if;-><init>(Landroid/content/Context;Landroid/graphics/Bitmap;Lcom/roidapp/photogrid/release/lc;Lcom/roidapp/photogrid/release/ig;IIIII)V

    .line 558
    aget-object v3, p4, v21

    iput-object v5, v3, Lcom/roidapp/photogrid/release/ig;->y:Lcom/roidapp/photogrid/release/lc;

    .line 559
    aget-object v3, p4, v21

    iput v7, v3, Lcom/roidapp/photogrid/release/ig;->C:I

    .line 560
    aget-object v3, p4, v21

    iput v8, v3, Lcom/roidapp/photogrid/release/ig;->D:I

    .line 561
    iget v3, v2, Lcom/roidapp/photogrid/release/if;->x:F

    iget-object v4, v5, Lcom/roidapp/photogrid/release/lc;->i:Landroid/graphics/PointF;

    iget v4, v4, Landroid/graphics/PointF;->x:F

    int-to-float v6, v7

    mul-float/2addr v4, v6

    float-to-int v4, v4

    int-to-float v4, v4

    add-float/2addr v3, v4

    iput v3, v2, Lcom/roidapp/photogrid/release/if;->x:F

    .line 562
    iget v3, v2, Lcom/roidapp/photogrid/release/if;->y:F

    iget-object v4, v5, Lcom/roidapp/photogrid/release/lc;->i:Landroid/graphics/PointF;

    iget v4, v4, Landroid/graphics/PointF;->y:F

    int-to-float v6, v8

    mul-float/2addr v4, v6

    float-to-int v4, v4

    int-to-float v4, v4

    add-float/2addr v3, v4

    iput v3, v2, Lcom/roidapp/photogrid/release/if;->y:F

    .line 563
    iget v3, v2, Lcom/roidapp/photogrid/release/if;->z:F

    iget v4, v5, Lcom/roidapp/photogrid/release/lc;->g:F

    float-to-int v4, v4

    int-to-float v4, v4

    add-float/2addr v3, v4

    iput v3, v2, Lcom/roidapp/photogrid/release/if;->z:F

    .line 564
    iget v3, v2, Lcom/roidapp/photogrid/release/if;->o:F

    iget v4, v5, Lcom/roidapp/photogrid/release/lc;->h:F

    mul-float/2addr v3, v4

    iput v3, v2, Lcom/roidapp/photogrid/release/if;->o:F

    .line 565
    invoke-virtual {v2, v13}, Lcom/roidapp/photogrid/release/if;->setId(I)V

    .line 566
    move-object/from16 v0, p1

    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V

    move-object v12, v2

    .line 586
    :cond_1b
    :goto_e
    new-instance v2, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-direct {v2, v7, v8}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 589
    const/4 v3, 0x0

    const/4 v4, 0x0

    move/from16 v0, v23

    move/from16 v1, v24

    invoke-virtual {v2, v0, v1, v3, v4}, Landroid/widget/RelativeLayout$LayoutParams;->setMargins(IIII)V

    .line 591
    invoke-virtual {v12, v2}, Lcom/roidapp/photogrid/release/if;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 592
    add-int/lit8 v2, v21, 0x1

    move/from16 v21, v2

    .line 593
    goto/16 :goto_c

    .line 568
    :cond_1c
    if-eqz p4, :cond_1d

    aget-object v2, p4, v21

    if-nez v2, :cond_1e

    .line 569
    :cond_1d
    new-instance v2, Ljava/lang/OutOfMemoryError;

    const-string v3, "create OOM"

    invoke-direct {v2, v3}, Ljava/lang/OutOfMemoryError;-><init>(Ljava/lang/String;)V

    throw v2

    .line 571
    :cond_1e
    aget-object v2, p4, v21

    iput-object v5, v2, Lcom/roidapp/photogrid/release/ig;->y:Lcom/roidapp/photogrid/release/lc;

    .line 572
    aget-object v2, p4, v21

    iput v7, v2, Lcom/roidapp/photogrid/release/ig;->C:I

    .line 573
    aget-object v2, p4, v21

    iput v8, v2, Lcom/roidapp/photogrid/release/ig;->D:I

    move-object v13, v5

    move v14, v7

    move v15, v8

    move/from16 v16, v9

    move/from16 v17, v10

    .line 574
    invoke-virtual/range {v12 .. v17}, Lcom/roidapp/photogrid/release/if;->a(Lcom/roidapp/photogrid/release/lc;IIII)V

    .line 575
    iget v2, v12, Lcom/roidapp/photogrid/release/if;->B:I

    if-eq v2, v11, :cond_20

    .line 576
    iput v11, v12, Lcom/roidapp/photogrid/release/if;->B:I

    .line 577
    const/4 v2, 0x0

    .line 578
    if-eqz v18, :cond_1f

    invoke-interface/range {v18 .. v18}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_1f

    .line 579
    move-object/from16 v0, v18

    move/from16 v1, v21

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-static {v2, v7, v8}, Lcom/roidapp/photogrid/release/rf;->b(Ljava/lang/String;II)Landroid/graphics/Bitmap;

    move-result-object v2

    .line 581
    :cond_1f
    invoke-virtual {v12, v2}, Lcom/roidapp/photogrid/release/if;->c(Landroid/graphics/Bitmap;)V

    goto :goto_e

    .line 582
    :cond_20
    iget-object v2, v12, Lcom/roidapp/photogrid/release/if;->e:Landroid/graphics/Bitmap;

    if-eqz v2, :cond_1b

    .line 583
    invoke-virtual {v12}, Lcom/roidapp/photogrid/release/if;->f()V

    goto :goto_e

    .line 594
    :cond_21
    return-void

    :cond_22
    move v10, v9

    move v9, v4

    goto/16 :goto_b

    :cond_23
    move v4, v5

    goto/16 :goto_a

    :cond_24
    move v6, v2

    move v7, v5

    goto/16 :goto_9

    :cond_25
    move/from16 v19, v3

    move/from16 v20, v5

    move v3, v2

    goto/16 :goto_8

    :cond_26
    move v2, v4

    goto/16 :goto_7

    :cond_27
    move v3, v5

    goto/16 :goto_6

    :cond_28
    move v2, v4

    goto/16 :goto_4

    :cond_29
    move-object/from16 v18, v2

    goto/16 :goto_0
.end method

.method public static a(Landroid/widget/LinearLayout;Landroid/content/Context;[Lcom/roidapp/photogrid/release/ig;)V
    .locals 13

    .prologue
    .line 230
    array-length v9, p2

    .line 231
    new-instance v10, Landroid/widget/RelativeLayout;

    invoke-direct {v10, p1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    .line 232
    const/4 v0, -0x1

    invoke-virtual {v10, v0}, Landroid/widget/RelativeLayout;->setBackgroundColor(I)V

    .line 233
    invoke-static {p1}, Lcom/roidapp/photogrid/release/rf;->b(Landroid/content/Context;)I

    move-result v4

    .line 234
    int-to-float v0, v4

    const/high16 v1, 0x3f400000    # 0.75f

    mul-float/2addr v0, v1

    float-to-int v5, v0

    .line 235
    mul-int v1, v5, v9

    .line 238
    const v0, 0x3c2aaaab

    int-to-float v2, v4

    mul-float/2addr v0, v2

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    .line 239
    const/4 v2, 0x2

    if-ge v0, v2, :cond_1

    .line 240
    const/4 v0, 0x2

    move v6, v0

    .line 243
    :goto_0
    mul-int v0, v6, v9

    add-int/2addr v0, v1

    add-int/2addr v0, v6

    .line 244
    new-instance v11, Landroid/widget/LinearLayout$LayoutParams;

    mul-int/lit8 v1, v6, 0x2

    add-int/2addr v1, v4

    invoke-direct {v11, v1, v0}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 246
    const/4 v0, 0x0

    move v7, v0

    move v8, v6

    :goto_1
    if-ge v7, v9, :cond_0

    .line 247
    new-instance v2, Lcom/roidapp/photogrid/release/lc;

    invoke-direct {v2}, Lcom/roidapp/photogrid/release/lc;-><init>()V

    .line 248
    new-instance v0, Lcom/roidapp/photogrid/release/rn;

    aget-object v3, p2, v7

    invoke-static {p1}, Lcom/roidapp/photogrid/release/rf;->c(Landroid/content/Context;)F

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, Lcom/roidapp/photogrid/release/rn;-><init>(Landroid/content/Context;Lcom/roidapp/photogrid/release/lc;Lcom/roidapp/photogrid/release/ig;II)V

    .line 249
    const v1, -0x777778

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/rn;->setBackgroundColor(I)V

    .line 250
    new-instance v3, Landroid/widget/LinearLayout;

    invoke-direct {v3, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 252
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v12, "mask"

    invoke-direct {v1, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Landroid/widget/LinearLayout;->setTag(Ljava/lang/Object;)V

    .line 253
    add-int/lit8 v1, v7, 0x1

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/rn;->setId(I)V

    .line 254
    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/release/rn;->setTag(Ljava/lang/Object;)V

    .line 255
    aget-object v1, p2, v7

    iput-object v2, v1, Lcom/roidapp/photogrid/release/ig;->y:Lcom/roidapp/photogrid/release/lc;

    .line 256
    new-instance v2, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-direct {v2, v4, v5}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 259
    const/4 v1, 0x0

    const/4 v12, 0x0

    invoke-virtual {v2, v6, v8, v1, v12}, Landroid/widget/RelativeLayout$LayoutParams;->setMargins(IIII)V

    .line 260
    add-int v1, v8, v5

    add-int/2addr v1, v6

    .line 261
    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/release/rn;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 262
    invoke-virtual {v3, v2}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 263
    invoke-virtual {v10, v0}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V

    .line 264
    invoke-virtual {v10, v3}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V

    .line 246
    add-int/lit8 v0, v7, 0x1

    move v7, v0

    move v8, v1

    goto :goto_1

    .line 266
    :cond_0
    invoke-virtual {p0, v10, v11}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 267
    const/4 v0, -0x1

    invoke-virtual {p0, v0}, Landroid/widget/LinearLayout;->setBackgroundColor(I)V

    .line 268
    return-void

    :cond_1
    move v6, v0

    goto :goto_0
.end method

.method private static a(Lcom/roidapp/photogrid/release/lc;FFFF)V
    .locals 4

    .prologue
    const/high16 v3, 0x40000000    # 2.0f

    .line 1060
    sub-float v0, p1, p2

    iput v0, p0, Lcom/roidapp/photogrid/release/lc;->l:F

    .line 1061
    sub-float v0, p3, p4

    iput v0, p0, Lcom/roidapp/photogrid/release/lc;->m:F

    .line 1065
    iput p2, p0, Lcom/roidapp/photogrid/release/lc;->j:F

    .line 1066
    iput p4, p0, Lcom/roidapp/photogrid/release/lc;->k:F

    .line 1069
    iget-object v0, p0, Lcom/roidapp/photogrid/release/lc;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/PointF;

    .line 1070
    iget v2, v0, Landroid/graphics/PointF;->x:F

    sub-float/2addr v2, p2

    iput v2, v0, Landroid/graphics/PointF;->x:F

    .line 1071
    iget v2, v0, Landroid/graphics/PointF;->y:F

    sub-float/2addr v2, p4

    iput v2, v0, Landroid/graphics/PointF;->y:F

    goto :goto_0

    .line 1077
    :cond_0
    new-instance v0, Landroid/graphics/PointF;

    iget v1, p0, Lcom/roidapp/photogrid/release/lc;->l:F

    div-float/2addr v1, v3

    iget v2, p0, Lcom/roidapp/photogrid/release/lc;->m:F

    div-float/2addr v2, v3

    invoke-direct {v0, v1, v2}, Landroid/graphics/PointF;-><init>(FF)V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/lc;->e:Landroid/graphics/PointF;

    .line 1079
    return-void
.end method

.method private static a(Lcom/roidapp/photogrid/release/lc;Lcom/roidapp/photogrid/release/rg;)V
    .locals 10

    .prologue
    const/high16 v0, 0x42c80000    # 100.0f

    const/4 v3, 0x0

    .line 915
    iget-object v1, p1, Lcom/roidapp/photogrid/release/rg;->b:Ljava/util/List;

    .line 916
    iget-object v6, p1, Lcom/roidapp/photogrid/release/rg;->i:Lcom/roidapp/cloudlib/template/f;

    .line 917
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 922
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    move v1, v0

    move v2, v3

    move v4, v0

    move v5, v3

    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 923
    invoke-static {v0}, Lcom/roidapp/photogrid/release/rf;->c(Ljava/lang/String;)Landroid/graphics/PointF;

    move-result-object v9

    .line 924
    iget v0, v9, Landroid/graphics/PointF;->x:F

    cmpl-float v0, v0, v5

    if-lez v0, :cond_0

    .line 925
    iget v5, v9, Landroid/graphics/PointF;->x:F

    .line 927
    :cond_0
    iget v0, v9, Landroid/graphics/PointF;->x:F

    cmpg-float v0, v0, v4

    if-gez v0, :cond_1

    .line 928
    iget v4, v9, Landroid/graphics/PointF;->x:F

    .line 931
    :cond_1
    iget v0, v9, Landroid/graphics/PointF;->y:F

    cmpl-float v0, v0, v2

    if-lez v0, :cond_2

    .line 932
    iget v2, v9, Landroid/graphics/PointF;->y:F

    .line 934
    :cond_2
    iget v0, v9, Landroid/graphics/PointF;->y:F

    cmpg-float v0, v0, v1

    if-gez v0, :cond_6

    .line 935
    iget v0, v9, Landroid/graphics/PointF;->y:F

    .line 937
    :goto_1
    invoke-interface {v7, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move v1, v0

    .line 938
    goto :goto_0

    .line 939
    :cond_3
    iput-object v7, p0, Lcom/roidapp/photogrid/release/lc;->b:Ljava/util/List;

    .line 941
    iget-object v0, p0, Lcom/roidapp/photogrid/release/lc;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_2
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/PointF;

    .line 942
    new-instance v8, Landroid/graphics/PointF;

    iget v9, v0, Landroid/graphics/PointF;->x:F

    iget v0, v0, Landroid/graphics/PointF;->y:F

    invoke-direct {v8, v9, v0}, Landroid/graphics/PointF;-><init>(FF)V

    .line 943
    iget-object v0, p0, Lcom/roidapp/photogrid/release/lc;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 945
    :cond_4
    iget v0, p1, Lcom/roidapp/photogrid/release/rg;->h:F

    iput v0, p0, Lcom/roidapp/photogrid/release/lc;->g:F

    .line 946
    iget v0, p1, Lcom/roidapp/photogrid/release/rg;->g:F

    iput v0, p0, Lcom/roidapp/photogrid/release/lc;->h:F

    .line 948
    if-nez v6, :cond_5

    .line 949
    new-instance v0, Landroid/graphics/PointF;

    invoke-direct {v0, v3, v3}, Landroid/graphics/PointF;-><init>(FF)V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/lc;->i:Landroid/graphics/PointF;

    .line 954
    :goto_3
    invoke-static {p0, v5, v4, v2, v1}, Lcom/roidapp/photogrid/release/rf;->a(Lcom/roidapp/photogrid/release/lc;FFFF)V

    .line 955
    return-void

    .line 951
    :cond_5
    new-instance v0, Landroid/graphics/PointF;

    iget v3, v6, Lcom/roidapp/cloudlib/template/f;->a:F

    iget v6, v6, Lcom/roidapp/cloudlib/template/f;->b:F

    invoke-direct {v0, v3, v6}, Landroid/graphics/PointF;-><init>(FF)V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/lc;->i:Landroid/graphics/PointF;

    goto :goto_3

    :cond_6
    move v0, v1

    goto :goto_1
.end method

.method public static a(Ljava/util/ArrayList;I)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/roidapp/photogrid/release/ic;",
            ">;I)V"
        }
    .end annotation

    .prologue
    const/4 v1, 0x1

    const/4 v0, 0x0

    const/4 v11, 0x0

    .line 816
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v2

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/ih;->az()Ljava/util/List;

    move-result-object v2

    .line 819
    if-eqz v2, :cond_0

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    if-eq v3, p1, :cond_4

    .line 821
    :cond_0
    new-instance v2, Lcom/roidapp/photogrid/release/rh;

    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v3

    invoke-virtual {v3}, Lcom/roidapp/photogrid/release/ih;->N()I

    move-result v3

    invoke-direct {v2, v3}, Lcom/roidapp/photogrid/release/rh;-><init>(I)V

    .line 822
    invoke-virtual {v2, v0}, Lcom/roidapp/photogrid/release/rh;->a(I)Ljava/util/List;

    move-result-object v0

    move v2, v1

    move-object v3, v0

    .line 825
    :goto_0
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    move v4, v1

    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/lc;

    .line 826
    iget-object v1, v0, Lcom/roidapp/photogrid/release/lc;->c:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-nez v1, :cond_1

    .line 827
    iget-object v1, v0, Lcom/roidapp/photogrid/release/lc;->b:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_2
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/PointF;

    .line 828
    iget-object v7, v0, Lcom/roidapp/photogrid/release/lc;->c:Ljava/util/ArrayList;

    new-instance v8, Landroid/graphics/PointF;

    iget v9, v1, Landroid/graphics/PointF;->x:F

    iget v10, v0, Lcom/roidapp/photogrid/release/lc;->j:F

    add-float/2addr v9, v10

    iget v1, v1, Landroid/graphics/PointF;->y:F

    iget v10, v0, Lcom/roidapp/photogrid/release/lc;->k:F

    add-float/2addr v1, v10

    invoke-direct {v8, v9, v1}, Landroid/graphics/PointF;-><init>(FF)V

    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 831
    :cond_1
    new-instance v6, Lcom/roidapp/photogrid/release/ic;

    invoke-direct {v6}, Lcom/roidapp/photogrid/release/ic;-><init>()V

    .line 832
    iput v11, v0, Lcom/roidapp/photogrid/release/lc;->g:F

    .line 833
    const/high16 v1, 0x3f800000    # 1.0f

    iput v1, v0, Lcom/roidapp/photogrid/release/lc;->h:F

    .line 834
    new-instance v1, Landroid/graphics/PointF;

    invoke-direct {v1, v11, v11}, Landroid/graphics/PointF;-><init>(FF)V

    iput-object v1, v0, Lcom/roidapp/photogrid/release/lc;->i:Landroid/graphics/PointF;

    .line 835
    iput-object v0, v6, Lcom/roidapp/photogrid/release/ic;->b:Lcom/roidapp/photogrid/release/lc;

    .line 836
    iput v4, v6, Lcom/roidapp/photogrid/release/ic;->c:I

    .line 837
    add-int/lit8 v1, v4, 0x1

    .line 838
    invoke-virtual {p0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move v4, v1

    .line 839
    goto :goto_1

    .line 840
    :cond_2
    if-eqz v2, :cond_3

    .line 841
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/roidapp/photogrid/release/ih;->m(Ljava/util/List;)V

    .line 845
    :cond_3
    return-void

    :cond_4
    move-object v3, v2

    move v2, v0

    goto :goto_0
.end method

.method public static a(Ljava/util/ArrayList;Ljava/lang/String;)V
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/roidapp/photogrid/release/ic;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .prologue
    .line 848
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ih;->W()I

    move-result v1

    const/4 v2, 0x4

    if-ne v1, v2, :cond_2

    .line 849
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->c()Ljava/util/List;

    move-result-object v1

    .line 850
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/roidapp/photogrid/release/rg;

    .line 851
    new-instance v4, Lcom/roidapp/photogrid/release/ic;

    invoke-direct {v4}, Lcom/roidapp/photogrid/release/ic;-><init>()V

    .line 852
    iget-object v2, v4, Lcom/roidapp/photogrid/release/ic;->b:Lcom/roidapp/photogrid/release/lc;

    .line 853
    if-nez v2, :cond_1

    .line 854
    new-instance v2, Lcom/roidapp/photogrid/release/lc;

    invoke-direct {v2}, Lcom/roidapp/photogrid/release/lc;-><init>()V

    .line 855
    iput-object v2, v4, Lcom/roidapp/photogrid/release/ic;->b:Lcom/roidapp/photogrid/release/lc;

    .line 858
    :cond_1
    iget v5, v1, Lcom/roidapp/photogrid/release/rg;->a:I

    iput v5, v4, Lcom/roidapp/photogrid/release/ic;->c:I

    .line 861
    invoke-static {v2, v1}, Lcom/roidapp/photogrid/release/rf;->a(Lcom/roidapp/photogrid/release/lc;Lcom/roidapp/photogrid/release/rg;)V

    .line 871
    if-eqz p0, :cond_0

    .line 872
    move-object/from16 v0, p0

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 878
    :cond_2
    const-string v1, "@"

    move-object/from16 v0, p1

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v10

    .line 881
    const/4 v1, 0x1

    .line 882
    array-length v11, v10

    const/4 v2, 0x0

    move v3, v1

    move v9, v2

    :goto_1
    if-ge v9, v11, :cond_6

    aget-object v4, v10, v9

    .line 883
    new-instance v12, Lcom/roidapp/photogrid/release/ic;

    invoke-direct {v12}, Lcom/roidapp/photogrid/release/ic;-><init>()V

    .line 884
    iget-object v1, v12, Lcom/roidapp/photogrid/release/ic;->b:Lcom/roidapp/photogrid/release/lc;

    .line 885
    if-nez v1, :cond_b

    .line 886
    new-instance v1, Lcom/roidapp/photogrid/release/lc;

    invoke-direct {v1}, Lcom/roidapp/photogrid/release/lc;-><init>()V

    .line 887
    iput-object v1, v12, Lcom/roidapp/photogrid/release/ic;->b:Lcom/roidapp/photogrid/release/lc;

    move-object v2, v1

    .line 890
    :goto_2
    iput v3, v12, Lcom/roidapp/photogrid/release/ic;->c:I

    .line 891
    add-int/lit8 v8, v3, 0x1

    .line 3963
    const-string v1, "_"

    invoke-virtual {v4, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v13

    .line 3964
    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 3965
    const/4 v3, 0x0

    .line 3966
    const/high16 v4, 0x42c80000    # 100.0f

    .line 3967
    const/4 v5, 0x0

    .line 3968
    const/high16 v6, 0x42c80000    # 100.0f

    .line 3969
    array-length v15, v13

    const/4 v1, 0x0

    move v7, v1

    :goto_3
    if-ge v7, v15, :cond_3

    aget-object v1, v13, v7

    .line 3970
    invoke-static {v1}, Lcom/roidapp/photogrid/release/rf;->c(Ljava/lang/String;)Landroid/graphics/PointF;

    move-result-object v16

    .line 3971
    move-object/from16 v0, v16

    iget v1, v0, Landroid/graphics/PointF;->x:F

    cmpl-float v1, v1, v3

    if-lez v1, :cond_a

    .line 3972
    move-object/from16 v0, v16

    iget v1, v0, Landroid/graphics/PointF;->x:F

    .line 3974
    :goto_4
    move-object/from16 v0, v16

    iget v3, v0, Landroid/graphics/PointF;->x:F

    cmpg-float v3, v3, v4

    if-gez v3, :cond_9

    .line 3975
    move-object/from16 v0, v16

    iget v3, v0, Landroid/graphics/PointF;->x:F

    .line 3978
    :goto_5
    move-object/from16 v0, v16

    iget v4, v0, Landroid/graphics/PointF;->y:F

    cmpl-float v4, v4, v5

    if-lez v4, :cond_8

    .line 3979
    move-object/from16 v0, v16

    iget v4, v0, Landroid/graphics/PointF;->y:F

    .line 3981
    :goto_6
    move-object/from16 v0, v16

    iget v5, v0, Landroid/graphics/PointF;->y:F

    cmpg-float v5, v5, v6

    if-gez v5, :cond_7

    .line 3982
    move-object/from16 v0, v16

    iget v5, v0, Landroid/graphics/PointF;->y:F

    .line 3984
    :goto_7
    move-object/from16 v0, v16

    invoke-interface {v14, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 3969
    add-int/lit8 v6, v7, 0x1

    move v7, v6

    move v6, v5

    move v5, v4

    move v4, v3

    move v3, v1

    goto :goto_3

    .line 3986
    :cond_3
    iput-object v14, v2, Lcom/roidapp/photogrid/release/lc;->b:Ljava/util/List;

    .line 3988
    iget-object v1, v2, Lcom/roidapp/photogrid/release/lc;->b:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_8
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/PointF;

    .line 3989
    new-instance v13, Landroid/graphics/PointF;

    iget v14, v1, Landroid/graphics/PointF;->x:F

    iget v1, v1, Landroid/graphics/PointF;->y:F

    invoke-direct {v13, v14, v1}, Landroid/graphics/PointF;-><init>(FF)V

    .line 3990
    iget-object v1, v2, Lcom/roidapp/photogrid/release/lc;->c:Ljava/util/ArrayList;

    invoke-virtual {v1, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_8

    .line 3992
    :cond_4
    const/4 v1, 0x0

    iput v1, v2, Lcom/roidapp/photogrid/release/lc;->g:F

    .line 3993
    const/high16 v1, 0x3f800000    # 1.0f

    iput v1, v2, Lcom/roidapp/photogrid/release/lc;->h:F

    .line 3994
    new-instance v1, Landroid/graphics/PointF;

    const/4 v7, 0x0

    const/4 v13, 0x0

    invoke-direct {v1, v7, v13}, Landroid/graphics/PointF;-><init>(FF)V

    iput-object v1, v2, Lcom/roidapp/photogrid/release/lc;->i:Landroid/graphics/PointF;

    .line 3996
    invoke-static {v2, v3, v4, v5, v6}, Lcom/roidapp/photogrid/release/rf;->a(Lcom/roidapp/photogrid/release/lc;FFFF)V

    .line 896
    if-eqz p0, :cond_5

    .line 897
    move-object/from16 v0, p0

    invoke-virtual {v0, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 882
    :cond_5
    add-int/lit8 v1, v9, 0x1

    move v3, v8

    move v9, v1

    goto/16 :goto_1

    .line 904
    :cond_6
    return-void

    :cond_7
    move v5, v6

    goto :goto_7

    :cond_8
    move v4, v5

    goto :goto_6

    :cond_9
    move v3, v4

    goto :goto_5

    :cond_a
    move v1, v3

    goto :goto_4

    :cond_b
    move-object v2, v1

    goto/16 :goto_2
.end method

.method private a([F[I[IIII)V
    .locals 12

    .prologue
    .line 1963
    const/4 v8, 0x0

    :goto_0
    move/from16 v0, p5

    if-ge v8, v0, :cond_6

    .line 1965
    mul-int v9, v8, p4

    .line 1966
    const/4 v1, 0x0

    move v6, v1

    move v7, v8

    :goto_1
    move/from16 v0, p4

    if-ge v6, v0, :cond_5

    .line 1967
    const/4 v4, 0x0

    .line 1968
    const/4 v3, 0x0

    .line 1969
    const/4 v2, 0x0

    .line 1971
    const/16 v1, -0x1e

    move v5, v1

    :goto_2
    const/16 v1, 0x1e

    if-gt v5, v1, :cond_4

    .line 1972
    add-int/lit8 v1, v5, 0x1e

    aget v10, p1, v1

    .line 1974
    const/4 v1, 0x0

    cmpl-float v1, v10, v1

    if-eqz v1, :cond_7

    .line 1975
    add-int v1, v6, v5

    .line 1976
    if-gez v1, :cond_2

    .line 1977
    iget v11, p0, Lcom/roidapp/photogrid/release/rf;->b:I

    move/from16 v0, p6

    if-ne v0, v11, :cond_1

    .line 1978
    const/4 v1, 0x0

    .line 1987
    :cond_0
    :goto_3
    add-int/2addr v1, v9

    aget v1, p2, v1

    .line 1988
    shr-int/lit8 v11, v1, 0x10

    and-int/lit16 v11, v11, 0xff

    int-to-float v11, v11

    mul-float/2addr v11, v10

    add-float/2addr v4, v11

    .line 1989
    shr-int/lit8 v11, v1, 0x8

    and-int/lit16 v11, v11, 0xff

    int-to-float v11, v11

    mul-float/2addr v11, v10

    add-float/2addr v3, v11

    .line 1990
    and-int/lit16 v1, v1, 0xff

    int-to-float v1, v1

    mul-float/2addr v1, v10

    add-float/2addr v1, v2

    move v2, v3

    move v3, v4

    .line 1971
    :goto_4
    add-int/lit8 v4, v5, 0x1

    move v5, v4

    move v4, v3

    move v3, v2

    move v2, v1

    goto :goto_2

    .line 1979
    :cond_1
    iget v11, p0, Lcom/roidapp/photogrid/release/rf;->c:I

    move/from16 v0, p6

    if-ne v0, v11, :cond_0

    .line 1980
    add-int v1, v6, p4

    rem-int v1, v1, p4

    goto :goto_3

    .line 1981
    :cond_2
    move/from16 v0, p4

    if-lt v1, v0, :cond_0

    .line 1982
    iget v11, p0, Lcom/roidapp/photogrid/release/rf;->b:I

    move/from16 v0, p6

    if-ne v0, v11, :cond_3

    .line 1983
    add-int/lit8 v1, p4, -0x1

    goto :goto_3

    .line 1984
    :cond_3
    iget v11, p0, Lcom/roidapp/photogrid/release/rf;->c:I

    move/from16 v0, p6

    if-ne v0, v11, :cond_0

    .line 1985
    add-int v1, v6, p4

    rem-int v1, v1, p4

    goto :goto_3

    .line 1994
    :cond_4
    float-to-int v1, v4

    shl-int/lit8 v1, v1, 0x10

    float-to-int v3, v3

    shl-int/lit8 v3, v3, 0x8

    or-int/2addr v1, v3

    float-to-int v2, v2

    or-int/2addr v1, v2

    aput v1, p3, v7

    .line 1995
    add-int v2, v7, p5

    .line 1966
    add-int/lit8 v1, v6, 0x1

    move v6, v1

    move v7, v2

    goto :goto_1

    .line 1963
    :cond_5
    add-int/lit8 v8, v8, 0x1

    goto/16 :goto_0

    .line 1998
    :cond_6
    return-void

    :cond_7
    move v1, v2

    move v2, v3

    move v3, v4

    goto :goto_4
.end method

.method public static a(Landroid/content/Context;I)Z
    .locals 8

    .prologue
    const/4 v1, 0x0

    const/4 v0, 0x1

    .line 2244
    .line 2246
    :try_start_0
    invoke-static {p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v2

    .line 2247
    const-string v3, "get_memory_error"

    const/4 v4, 0x0

    invoke-interface {v2, v3, v4}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v3

    if-eq v3, v0, :cond_2

    .line 2249
    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v3

    const-string v4, "get_memory_error"

    const/4 v5, 0x1

    invoke-interface {v3, v4, v5}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object v3

    invoke-interface {v3}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 2250
    invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;

    move-result-object v3

    const-string v4, "mounted"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 2251
    const-string v3, "SAVEPATH"

    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v4

    invoke-virtual {v4}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v2, v3, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 2252
    new-instance v4, Ljava/io/File;

    invoke-direct {v4, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 2253
    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    move-result v5

    if-nez v5, :cond_0

    .line 2254
    invoke-virtual {v4}, Ljava/io/File;->mkdirs()Z

    .line 2256
    :cond_0
    new-instance v4, Landroid/os/StatFs;

    invoke-direct {v4, v3}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V

    .line 2257
    invoke-virtual {v4}, Landroid/os/StatFs;->getBlockSize()I

    move-result v3

    int-to-long v6, v3

    .line 2258
    invoke-virtual {v4}, Landroid/os/StatFs;->getAvailableBlocks()I

    move-result v3

    int-to-long v4, v3

    .line 2259
    mul-long/2addr v4, v6

    const-wide/32 v6, 0x100000

    div-long/2addr v4, v6

    .line 2260
    int-to-long v6, p1

    cmp-long v3, v6, v4

    if-lez v3, :cond_1

    move v0, v1

    .line 2268
    :cond_1
    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    const-string v2, "get_memory_error"

    const/4 v3, 0x2

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 2274
    :cond_2
    :goto_0
    return v0

    .line 2272
    :catch_0
    move-exception v1

    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0
.end method

.method public static a(Ljava/io/File;)Z
    .locals 1

    .prologue
    .line 2490
    invoke-static {p0}, Lcom/roidapp/baselib/a/b;->a(Ljava/io/File;)Z

    move-result v0

    return v0
.end method

.method public static a(Ljava/lang/String;)Z
    .locals 1

    .prologue
    .line 1911
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 1912
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    return v0
.end method

.method public static a(Landroid/view/View;)[I
    .locals 3

    .prologue
    .line 2118
    const/4 v0, 0x2

    new-array v0, v0, [I

    .line 2119
    const/4 v1, 0x0

    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    iget v2, v2, Landroid/view/ViewGroup$LayoutParams;->width:I

    aput v2, v0, v1

    .line 2120
    const/4 v1, 0x1

    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    iget v2, v2, Landroid/view/ViewGroup$LayoutParams;->height:I

    aput v2, v0, v1

    .line 2121
    return-object v0
.end method

.method public static a(Landroid/content/Context;II)[Lcom/roidapp/photogrid/release/lc;
    .locals 7

    .prologue
    const/high16 v6, 0x42c80000    # 100.0f

    .line 1094
    new-array v2, p2, [Lcom/roidapp/photogrid/release/lc;

    .line 4138
    :try_start_0
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 4139
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getXml(I)Landroid/content/res/XmlResourceParser;

    move-result-object v4

    .line 4140
    invoke-interface {v4}, Landroid/content/res/XmlResourceParser;->getEventType()I

    move-result v1

    .line 4141
    const/4 v0, 0x0

    .line 4143
    :goto_0
    const/4 v5, 0x1

    if-eq v1, v5, :cond_7

    .line 4144
    packed-switch v1, :pswitch_data_0

    .line 4178
    :cond_0
    :goto_1
    invoke-interface {v4}, Landroid/content/res/XmlResourceParser;->next()I

    move-result v1

    goto :goto_0

    .line 4146
    :pswitch_0
    const-string v1, "control"

    invoke-interface {v4}, Landroid/content/res/XmlResourceParser;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 4147
    new-instance v0, Lcom/roidapp/photogrid/release/rg;

    invoke-direct {v0}, Lcom/roidapp/photogrid/release/rg;-><init>()V
    :try_end_0
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_1

    .line 1112
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Lorg/xmlpull/v1/XmlPullParserException;->printStackTrace()V

    .line 1116
    :cond_1
    :goto_2
    return-object v2

    .line 4149
    :cond_2
    :try_start_1
    const-string v1, "ID"

    invoke-interface {v4}, Landroid/content/res/XmlResourceParser;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 4150
    invoke-interface {v4}, Landroid/content/res/XmlResourceParser;->next()I

    .line 4151
    invoke-interface {v4}, Landroid/content/res/XmlResourceParser;->getText()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    iput v1, v0, Lcom/roidapp/photogrid/release/rg;->a:I
    :try_end_1
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    .line 1114
    :catch_1
    move-exception v0

    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_2

    .line 4154
    :cond_3
    :try_start_2
    const-string v1, "x"

    invoke-interface {v4}, Landroid/content/res/XmlResourceParser;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 4155
    invoke-interface {v4}, Landroid/content/res/XmlResourceParser;->next()I

    .line 4156
    invoke-interface {v4}, Landroid/content/res/XmlResourceParser;->getText()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v1

    iput v1, v0, Lcom/roidapp/photogrid/release/rg;->c:F

    goto :goto_1

    .line 4158
    :cond_4
    const-string v1, "y"

    invoke-interface {v4}, Landroid/content/res/XmlResourceParser;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 4159
    invoke-interface {v4}, Landroid/content/res/XmlResourceParser;->next()I

    .line 4160
    invoke-interface {v4}, Landroid/content/res/XmlResourceParser;->getText()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v1

    iput v1, v0, Lcom/roidapp/photogrid/release/rg;->d:F

    goto :goto_1

    .line 4162
    :cond_5
    const-string v1, "maxedge"

    invoke-interface {v4}, Landroid/content/res/XmlResourceParser;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    .line 4163
    invoke-interface {v4}, Landroid/content/res/XmlResourceParser;->next()I

    .line 4164
    invoke-interface {v4}, Landroid/content/res/XmlResourceParser;->getText()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v1

    iput v1, v0, Lcom/roidapp/photogrid/release/rg;->e:F

    goto/16 :goto_1

    .line 4166
    :cond_6
    const-string v1, "rotate"

    invoke-interface {v4}, Landroid/content/res/XmlResourceParser;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 4167
    invoke-interface {v4}, Landroid/content/res/XmlResourceParser;->next()I

    .line 4168
    invoke-interface {v4}, Landroid/content/res/XmlResourceParser;->getText()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    iput v1, v0, Lcom/roidapp/photogrid/release/rg;->f:I

    goto/16 :goto_1

    .line 4172
    :pswitch_1
    const-string v1, "control"

    invoke-interface {v4}, Landroid/content/res/XmlResourceParser;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 4173
    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_1

    .line 1097
    :cond_7
    const/4 v0, 0x0

    .line 1098
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    move v1, v0

    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/rg;

    .line 1102
    new-instance v4, Lcom/roidapp/photogrid/release/lc;

    invoke-direct {v4}, Lcom/roidapp/photogrid/release/lc;-><init>()V

    .line 1103
    iget v5, v0, Lcom/roidapp/photogrid/release/rg;->f:I

    iput v5, v4, Lcom/roidapp/photogrid/release/lc;->o:I

    .line 1104
    iget v5, v0, Lcom/roidapp/photogrid/release/rg;->e:F

    div-float/2addr v5, v6

    iput v5, v4, Lcom/roidapp/photogrid/release/lc;->n:F

    .line 1105
    iget v5, v0, Lcom/roidapp/photogrid/release/rg;->c:F

    div-float/2addr v5, v6

    iput v5, v4, Lcom/roidapp/photogrid/release/lc;->j:F

    .line 1106
    iget v0, v0, Lcom/roidapp/photogrid/release/rg;->d:F

    div-float/2addr v0, v6

    iput v0, v4, Lcom/roidapp/photogrid/release/lc;->k:F

    .line 1107
    aput-object v4, v2, v1
    :try_end_2
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    .line 1108
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    .line 1110
    goto :goto_3

    .line 4144
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public static a(Landroid/content/Context;Landroid/net/Uri;Z)[Ljava/lang/String;
    .locals 9

    .prologue
    const/4 v8, 0x2

    const/4 v2, 0x0

    const/4 v7, 0x1

    const/4 v1, 0x0

    .line 2950
    .line 2952
    invoke-virtual {p1}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 2953
    const-string v0, "com.google.android.apps.docs.storage"

    invoke-virtual {p1}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2954
    new-array v0, v8, [Ljava/lang/String;

    const-string v3, "-1"

    aput-object v3, v0, v1

    aput-object v2, v0, v7

    .line 3089
    :goto_0
    return-object v0

    .line 2955
    :cond_0
    const-string v0, "com.google.android.apps.docs.files"

    invoke-virtual {p1}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2956
    new-array v0, v8, [Ljava/lang/String;

    const-string v3, "-1"

    aput-object v3, v0, v1

    aput-object v2, v0, v7

    goto :goto_0

    .line 2957
    :cond_1
    const-string v0, "com.google.android.apps.photos.content"

    invoke-virtual {p1}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 2958
    new-array v0, v8, [Ljava/lang/String;

    const-string v3, "-1"

    aput-object v3, v0, v1

    aput-object v2, v0, v7

    goto :goto_0

    .line 2959
    :cond_2
    const-string v0, "com.google.android.apps.docs.storage.legacy"

    invoke-virtual {p1}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 2960
    new-array v0, v8, [Ljava/lang/String;

    const-string v3, "-1"

    aput-object v3, v0, v1

    aput-object v2, v0, v7

    goto :goto_0

    .line 2966
    :cond_3
    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v3, "file:///"

    invoke-virtual {v0, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 2967
    invoke-virtual {p1}, Landroid/net/Uri;->getEncodedPath()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->decode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    move-object v2, v0

    .line 3036
    :cond_4
    :goto_1
    if-eqz v2, :cond_5

    new-instance v0, Ljava/io/File;

    invoke-direct {v0, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_11

    .line 3037
    :cond_5
    new-array v0, v8, [Ljava/lang/String;

    const-string v3, "-2"

    aput-object v3, v0, v1

    aput-object v2, v0, v7

    goto :goto_0

    .line 2969
    :cond_6
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x13

    if-lt v0, v3, :cond_e

    invoke-static {}, Lcom/roidapp/photogrid/common/bo;->a()Lcom/roidapp/photogrid/common/bo;

    invoke-static {p0, p1}, Lcom/roidapp/photogrid/common/bo;->a(Landroid/content/Context;Landroid/net/Uri;)Z

    move-result v0

    if-eqz v0, :cond_e

    .line 2971
    const-string v0, "com.android.providers.media.documents"

    invoke-virtual {p1}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 2972
    invoke-static {}, Lcom/roidapp/photogrid/common/bo;->a()Lcom/roidapp/photogrid/common/bo;

    invoke-static {p1}, Lcom/roidapp/photogrid/common/bo;->a(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v0

    .line 2973
    const-string v2, ":"

    invoke-virtual {v0, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    aget-object v0, v0, v7

    .line 2974
    if-eqz p2, :cond_7

    .line 2975
    const-string v2, "_id=?"

    .line 2976
    sget-object v3, Landroid/provider/MediaStore$Audio$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    new-array v4, v7, [Ljava/lang/String;

    aput-object v0, v4, v1

    invoke-static {p0, v3, v2, v4, p2}, Lcom/roidapp/photogrid/release/rf;->a(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v0

    move-object v2, v0

    .line 2977
    goto :goto_1

    .line 2978
    :cond_7
    const-string v2, "_id=?"

    .line 2979
    sget-object v3, Landroid/provider/MediaStore$Images$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    new-array v4, v7, [Ljava/lang/String;

    aput-object v0, v4, v1

    invoke-static {p0, v3, v2, v4, p2}, Lcom/roidapp/photogrid/release/rf;->a(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v0

    move-object v2, v0

    .line 2982
    goto :goto_1

    :cond_8
    const-string v0, "com.android.providers.downloads.documents"

    invoke-virtual {p1}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 2983
    invoke-static {}, Lcom/roidapp/photogrid/common/bo;->a()Lcom/roidapp/photogrid/common/bo;

    invoke-static {p1}, Lcom/roidapp/photogrid/common/bo;->a(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v0

    .line 2984
    const-string v3, "content://downloads/public_downloads"

    invoke-static {v3}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v3

    invoke-static {v0}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    invoke-static {v3, v4, v5}, Landroid/content/ContentUris;->withAppendedId(Landroid/net/Uri;J)Landroid/net/Uri;

    move-result-object v0

    .line 2987
    invoke-static {p0, v0, v2, v2, p2}, Lcom/roidapp/photogrid/release/rf;->a(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v0

    move-object v2, v0

    .line 2989
    goto/16 :goto_1

    :cond_9
    const-string v0, "com.android.externalstorage.documents"

    invoke-virtual {p1}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_d

    .line 2990
    invoke-static {}, Lcom/roidapp/photogrid/common/bo;->a()Lcom/roidapp/photogrid/common/bo;

    invoke-static {p1}, Lcom/roidapp/photogrid/common/bo;->a(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v0

    .line 2992
    const-string v3, ":"

    invoke-virtual {v0, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    .line 2993
    aget-object v3, v0, v1

    .line 2994
    aget-object v4, v0, v7

    .line 2995
    const-string v0, "primary"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 2996
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "/"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    move-object v2, v0

    goto/16 :goto_1

    .line 2998
    :cond_a
    new-instance v0, Ljava/io/File;

    const-string v3, "/storage"

    invoke-direct {v0, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v3

    .line 2999
    if-nez v3, :cond_b

    .line 3000
    new-array v0, v8, [Ljava/lang/String;

    const-string v3, "-2"

    aput-object v3, v0, v1

    aput-object v2, v0, v7

    goto/16 :goto_0

    :cond_b
    move v0, v1

    .line 3002
    :goto_2
    array-length v5, v3

    if-ge v0, v5, :cond_4

    .line 3003
    new-instance v5, Ljava/io/File;

    aget-object v6, v3, v0

    invoke-virtual {v6}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v5, v6, v4}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v5}, Ljava/io/File;->exists()Z

    move-result v5

    if-eqz v5, :cond_c

    .line 3004
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    aget-object v0, v3, v0

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "/"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    move-object v2, v0

    .line 3005
    goto/16 :goto_1

    .line 3002
    :cond_c
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    .line 3011
    :cond_d
    :try_start_0
    invoke-static {}, Lcom/roidapp/photogrid/common/bo;->a()Lcom/roidapp/photogrid/common/bo;

    invoke-static {p1}, Lcom/roidapp/photogrid/common/bo;->a(Landroid/net/Uri;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v2, v0

    .line 3014
    goto/16 :goto_1

    .line 3013
    :catch_0
    move-exception v0

    new-array v0, v8, [Ljava/lang/String;

    const-string v3, "-1"

    aput-object v3, v0, v1

    aput-object v2, v0, v7

    goto/16 :goto_0

    .line 3017
    :cond_e
    const-string v0, "com.google.android.apps.photos.contentprovider"

    invoke-virtual {p1}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_10

    .line 3019
    :try_start_1
    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->decode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 3020
    const-string v3, "content://media/"

    invoke-virtual {v0, v3}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v3

    .line 3021
    if-gez v3, :cond_f

    .line 3022
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    const/4 v3, 0x0

    const-string v4, "-2"

    aput-object v4, v0, v3

    const/4 v3, 0x1

    const/4 v4, 0x0

    aput-object v4, v0, v3
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto/16 :goto_0

    .line 3026
    :catch_1
    move-exception v0

    new-array v0, v8, [Ljava/lang/String;

    const-string v3, "-2"

    aput-object v3, v0, v1

    aput-object v2, v0, v7

    goto/16 :goto_0

    .line 3024
    :cond_f
    :try_start_2
    const-string v4, "/ACTUAL"

    invoke-virtual {v0, v4}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v4

    invoke-virtual {v0, v3, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    move-result-object v0

    .line 3028
    invoke-static {p0, v0, v2, v2, p2}, Lcom/roidapp/photogrid/release/rf;->a(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v0

    move-object v2, v0

    goto/16 :goto_1

    .line 3031
    :cond_10
    invoke-static {p0, p1, v2, v2, p2}, Lcom/roidapp/photogrid/release/rf;->a(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v0

    move-object v2, v0

    goto/16 :goto_1

    .line 3042
    :cond_11
    if-eqz p2, :cond_13

    .line 3045
    const-string v0, "/"

    invoke-virtual {v2, v0}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {v2, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    .line 3046
    if-eqz v0, :cond_12

    .line 3047
    const-string v0, "."

    invoke-virtual {v2, v0}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {v2, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    sget-object v3, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-virtual {v0, v3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    .line 3048
    const-string v3, "mp3"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_16

    const-string v3, "m4a"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_16

    const-string v3, "amr"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_16

    const-string v3, "aac"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_16

    const-string v3, "ogg"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_16

    const-string v3, "flac"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_16

    const-string v3, "3gpp"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_16

    const-string v3, "3ga"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_16

    const-string v3, "wav"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_16

    .line 3061
    new-array v0, v8, [Ljava/lang/String;

    const-string v3, "-3"

    aput-object v3, v0, v1

    aput-object v2, v0, v7

    goto/16 :goto_0

    .line 3065
    :cond_12
    new-array v0, v8, [Ljava/lang/String;

    const-string v3, "-3"

    aput-object v3, v0, v1

    aput-object v2, v0, v7

    goto/16 :goto_0

    .line 3069
    :cond_13
    sget-object v0, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-virtual {v2, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    .line 3070
    const-string v3, ".png"

    invoke-virtual {v0, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_14

    const-string v3, ".jpg"

    invoke-virtual {v0, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_14

    const-string v3, ".gif"

    invoke-virtual {v0, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_14

    const-string v3, ".bmp"

    invoke-virtual {v0, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_14

    const-string v3, ".jpeg"

    invoke-virtual {v0, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_14

    const-string v3, ".mpo"

    invoke-virtual {v0, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_14

    invoke-static {v2}, Lcom/roidapp/photogrid/common/bn;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_15

    .line 3079
    :cond_14
    invoke-static {v2}, Lcom/roidapp/photogrid/release/rf;->b(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_16

    .line 3080
    new-array v0, v8, [Ljava/lang/String;

    const-string v3, "-2"

    aput-object v3, v0, v1

    aput-object v2, v0, v7

    goto/16 :goto_0

    .line 3084
    :cond_15
    new-array v0, v8, [Ljava/lang/String;

    const-string v3, "-3"

    aput-object v3, v0, v1

    aput-object v2, v0, v7

    goto/16 :goto_0

    .line 3089
    :cond_16
    new-array v0, v8, [Ljava/lang/String;

    const-string v3, "1"

    aput-object v3, v0, v1

    aput-object v2, v0, v7

    goto/16 :goto_0
.end method

.method private static b(I)I
    .locals 1

    .prologue
    const/16 v0, 0xff

    .line 1916
    if-gez p0, :cond_1

    const/4 p0, 0x0

    :cond_0
    :goto_0
    return p0

    :cond_1
    if-le p0, v0, :cond_0

    move p0, v0

    goto :goto_0
.end method

.method public static b(Landroid/content/Context;)I
    .locals 2

    .prologue
    .line 2172
    invoke-static {p0}, Lcom/roidapp/photogrid/release/rf;->a(Landroid/content/Context;)I

    move-result v0

    int-to-float v0, v0

    invoke-static {p0}, Lcom/roidapp/photogrid/release/rf;->c(Landroid/content/Context;)F

    move-result v1

    mul-float/2addr v0, v1

    float-to-int v0, v0

    return v0
.end method

.method public static b(Landroid/content/Context;II)Landroid/graphics/Bitmap;
    .locals 7

    .prologue
    const/4 v6, 0x1

    const/4 v5, 0x0

    const/4 v3, -0x1

    const/high16 v4, 0x3f800000    # 1.0f

    const/4 v1, 0x0

    .line 2367
    new-instance v2, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v2}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 2368
    iput-boolean v6, v2, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 2369
    iput-boolean v5, v2, Landroid/graphics/BitmapFactory$Options;->inScaled:Z

    .line 2372
    :try_start_0
    invoke-static {p0, p1, v2}, Lcom/roidapp/photogrid/release/rf;->a(Landroid/content/Context;ILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 2381
    iget v0, v2, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    if-eq v0, v3, :cond_0

    iget v0, v2, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    if-ne v0, v3, :cond_2

    :cond_0
    move-object v0, v1

    .line 2420
    :cond_1
    :goto_0
    return-object v0

    .line 2374
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    move-object v0, v1

    .line 2375
    goto :goto_0

    .line 2377
    :catch_1
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    move-object v0, v1

    .line 2378
    goto :goto_0

    .line 2385
    :cond_2
    iput-boolean v5, v2, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 2386
    iget v0, v2, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    int-to-float v0, v0

    mul-float/2addr v0, v4

    int-to-float v3, p2

    div-float/2addr v0, v3

    .line 2387
    cmpg-float v3, v0, v4

    if-gez v3, :cond_3

    .line 2388
    iput v6, v2, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 2393
    :goto_1
    :try_start_1
    invoke-static {p0, p1, v2}, Lcom/roidapp/photogrid/release/rf;->a(Landroid/content/Context;ILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    :try_end_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_3

    move-result-object v0

    .line 2408
    :goto_2
    if-nez v0, :cond_1

    .line 2409
    iget v0, v2, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    mul-int/lit8 v0, v0, 0x2

    iput v0, v2, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 2411
    :try_start_2
    invoke-static {p0, p1, v2}, Lcom/roidapp/photogrid/release/rf;->a(Landroid/content/Context;ILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    :try_end_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_2 .. :try_end_2} :catch_4
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_5

    move-result-object v0

    goto :goto_0

    .line 2390
    :cond_3
    float-to-double v4, v0

    invoke-static {v4, v5}, Ljava/lang/Math;->floor(D)D

    move-result-wide v4

    double-to-int v0, v4

    iput v0, v2, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    goto :goto_1

    .line 2402
    :catch_2
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    move-object v0, v1

    .line 2407
    goto :goto_2

    .line 2405
    :catch_3
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    move-object v0, v1

    .line 2406
    goto :goto_2

    .line 2413
    :catch_4
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    move-object v0, v1

    .line 2414
    goto :goto_0

    .line 2416
    :catch_5
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    move-object v0, v1

    .line 2417
    goto :goto_0
.end method

.method public static b(Ljava/lang/String;F)Landroid/graphics/Bitmap;
    .locals 7

    .prologue
    const/4 v6, 0x2

    const/4 v2, 0x0

    const/high16 v5, 0x40000000    # 2.0f

    const/4 v1, 0x1

    .line 2810
    new-instance v3, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v3}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 2811
    iput-boolean v1, v3, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 2812
    iput v1, v3, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 2813
    const/4 v0, 0x0

    .line 2816
    :try_start_0
    invoke-static {p0, v3}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move v1, v2

    .line 2821
    :goto_0
    if-nez v1, :cond_1

    .line 2822
    iget v1, v3, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    if-lez v1, :cond_1

    iget v1, v3, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    if-lez v1, :cond_1

    .line 2823
    iget v0, v3, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    iget v1, v3, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    if-le v0, v1, :cond_2

    .line 2824
    iget v0, v3, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    int-to-float v0, v0

    mul-float v1, v5, p1

    cmpl-float v0, v0, v1

    if-lez v0, :cond_0

    .line 2825
    iput v6, v3, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 2832
    :cond_0
    :goto_1
    iput-boolean v2, v3, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 2833
    invoke-static {p0, v3}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 2836
    :cond_1
    return-object v0

    .line 2818
    :catch_0
    move-exception v4

    invoke-virtual {v4}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0

    .line 2828
    :cond_2
    iget v0, v3, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    int-to-float v0, v0

    mul-float v1, v5, p1

    cmpl-float v0, v0, v1

    if-lez v0, :cond_0

    .line 2829
    iput v6, v3, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    goto :goto_1
.end method

.method public static b(Ljava/lang/String;II)Landroid/graphics/Bitmap;
    .locals 9

    .prologue
    const/4 v2, 0x0

    const/4 v8, 0x0

    const/4 v7, 0x1

    .line 2875
    const-string v0, "null"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    move-object v0, v2

    .line 2915
    :goto_0
    return-object v0

    .line 2878
    :cond_0
    new-instance v3, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v3}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 2879
    iput-boolean v7, v3, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 2880
    invoke-static {p0, v3}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 2881
    iget v1, v3, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    .line 2882
    iget v4, v3, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    .line 2883
    const/high16 v0, 0x3f800000    # 1.0f

    .line 2884
    if-gt v1, p2, :cond_1

    if-le v4, p1, :cond_2

    .line 2885
    :cond_1
    int-to-float v0, v1

    int-to-float v1, p2

    div-float v1, v0, v1

    .line 2886
    int-to-float v0, v4

    int-to-float v4, p1

    div-float/2addr v0, v4

    .line 2887
    cmpl-float v4, v1, v0

    if-lez v4, :cond_3

    .line 2889
    :cond_2
    :goto_1
    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    iput v0, v3, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 2890
    iput-boolean v8, v3, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 2891
    invoke-static {p0, v3}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 2892
    if-nez v0, :cond_4

    .line 2893
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 2894
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 2896
    const-wide/16 v0, 0x3e8

    :try_start_0
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 2900
    :goto_2
    invoke-static {p0, v3}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 2901
    if-nez v0, :cond_4

    move-object v0, v2

    .line 2902
    goto :goto_0

    :cond_3
    move v0, v1

    .line 2887
    goto :goto_1

    .line 2898
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/InterruptedException;->printStackTrace()V

    goto :goto_2

    .line 2905
    :cond_4
    sget-object v1, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {p1, p2, v1}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 2906
    new-instance v2, Landroid/graphics/Canvas;

    invoke-direct {v2, v1}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 2907
    new-instance v3, Landroid/graphics/Matrix;

    invoke-direct {v3}, Landroid/graphics/Matrix;-><init>()V

    .line 2908
    int-to-float v4, p1

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v5

    int-to-float v5, v5

    div-float/2addr v4, v5

    int-to-float v5, p2

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v6

    int-to-float v6, v6

    div-float/2addr v5, v6

    invoke-virtual {v3, v4, v5}, Landroid/graphics/Matrix;->postScale(FF)Z

    .line 2909
    new-instance v4, Landroid/graphics/Paint;

    invoke-direct {v4}, Landroid/graphics/Paint;-><init>()V

    .line 2910
    invoke-virtual {v4, v7}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 2911
    invoke-virtual {v4, v7}, Landroid/graphics/Paint;->setFilterBitmap(Z)V

    .line 2912
    new-instance v5, Landroid/graphics/PaintFlagsDrawFilter;

    const/4 v6, 0x3

    invoke-direct {v5, v8, v6}, Landroid/graphics/PaintFlagsDrawFilter;-><init>(II)V

    invoke-virtual {v2, v5}, Landroid/graphics/Canvas;->setDrawFilter(Landroid/graphics/DrawFilter;)V

    .line 2913
    invoke-virtual {v2, v0, v3, v4}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V

    .line 2914
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    move-object v0, v1

    .line 2915
    goto/16 :goto_0
.end method

.method private static b(Landroid/content/Context;I)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "I)",
            "Ljava/util/List",
            "<",
            "Lcom/roidapp/photogrid/release/rg;",
            ">;"
        }
    .end annotation

    .prologue
    const/4 v0, 0x0

    .line 94
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 95
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroid/content/res/Resources;->getXml(I)Landroid/content/res/XmlResourceParser;

    move-result-object v4

    .line 96
    invoke-interface {v4}, Landroid/content/res/XmlResourceParser;->getEventType()I

    move-result v1

    move v2, v1

    move-object v1, v0

    .line 100
    :goto_0
    const/4 v5, 0x1

    if-eq v2, v5, :cond_3

    .line 101
    packed-switch v2, :pswitch_data_0

    .line 124
    :cond_0
    :goto_1
    invoke-interface {v4}, Landroid/content/res/XmlResourceParser;->next()I

    move-result v2

    goto :goto_0

    .line 103
    :pswitch_0
    const-string v2, "control"

    invoke-interface {v4}, Landroid/content/res/XmlResourceParser;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 104
    new-instance v1, Lcom/roidapp/photogrid/release/rg;

    invoke-direct {v1}, Lcom/roidapp/photogrid/release/rg;-><init>()V

    .line 105
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    goto :goto_1

    .line 107
    :cond_1
    const-string v2, "ID"

    invoke-interface {v4}, Landroid/content/res/XmlResourceParser;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 108
    invoke-interface {v4}, Landroid/content/res/XmlResourceParser;->next()I

    .line 109
    invoke-interface {v4}, Landroid/content/res/XmlResourceParser;->getText()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    iput v2, v1, Lcom/roidapp/photogrid/release/rg;->a:I

    goto :goto_1

    .line 111
    :cond_2
    const-string v2, "P"

    invoke-interface {v4}, Landroid/content/res/XmlResourceParser;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 112
    invoke-interface {v4}, Landroid/content/res/XmlResourceParser;->next()I

    .line 113
    invoke-interface {v4}, Landroid/content/res/XmlResourceParser;->getText()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 117
    :pswitch_1
    const-string v2, "control"

    invoke-interface {v4}, Landroid/content/res/XmlResourceParser;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 118
    iput-object v0, v1, Lcom/roidapp/photogrid/release/rg;->b:Ljava/util/List;

    .line 119
    invoke-interface {v3, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 126
    :cond_3
    return-object v3

    .line 101
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public static b(Landroid/widget/LinearLayout;Landroid/content/Context;[Lcom/roidapp/photogrid/release/ig;)V
    .locals 13

    .prologue
    .line 277
    array-length v9, p2

    .line 278
    new-instance v10, Landroid/widget/RelativeLayout;

    invoke-direct {v10, p1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    .line 279
    const/4 v0, -0x1

    invoke-virtual {v10, v0}, Landroid/widget/RelativeLayout;->setBackgroundColor(I)V

    .line 280
    invoke-static {p1}, Lcom/roidapp/photogrid/release/rf;->b(Landroid/content/Context;)I

    move-result v5

    .line 281
    int-to-float v0, v5

    const/high16 v1, 0x3f400000    # 0.75f

    mul-float/2addr v0, v1

    float-to-int v4, v0

    .line 282
    mul-int v1, v4, v9

    .line 285
    const v0, 0x3c2aaaab

    int-to-float v2, v5

    mul-float/2addr v0, v2

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    .line 286
    const/4 v2, 0x2

    if-ge v0, v2, :cond_1

    .line 287
    const/4 v0, 0x2

    move v6, v0

    .line 290
    :goto_0
    mul-int v0, v6, v9

    add-int/2addr v0, v1

    add-int/2addr v0, v6

    .line 291
    new-instance v11, Landroid/widget/LinearLayout$LayoutParams;

    mul-int/lit8 v1, v6, 0x2

    add-int/2addr v1, v5

    invoke-direct {v11, v0, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 293
    const/4 v0, 0x0

    move v7, v0

    move v8, v6

    :goto_1
    if-ge v7, v9, :cond_0

    .line 294
    new-instance v2, Lcom/roidapp/photogrid/release/lc;

    invoke-direct {v2}, Lcom/roidapp/photogrid/release/lc;-><init>()V

    .line 295
    new-instance v0, Lcom/roidapp/photogrid/release/rn;

    aget-object v3, p2, v7

    invoke-static {p1}, Lcom/roidapp/photogrid/release/rf;->c(Landroid/content/Context;)F

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, Lcom/roidapp/photogrid/release/rn;-><init>(Landroid/content/Context;Lcom/roidapp/photogrid/release/lc;Lcom/roidapp/photogrid/release/ig;II)V

    .line 296
    const v1, -0x777778

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/rn;->setBackgroundColor(I)V

    .line 297
    new-instance v3, Landroid/widget/LinearLayout;

    invoke-direct {v3, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 299
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v12, "mask"

    invoke-direct {v1, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Landroid/widget/LinearLayout;->setTag(Ljava/lang/Object;)V

    .line 300
    add-int/lit8 v1, v7, 0x1

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/rn;->setId(I)V

    .line 301
    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/release/rn;->setTag(Ljava/lang/Object;)V

    .line 302
    aget-object v1, p2, v7

    iput-object v2, v1, Lcom/roidapp/photogrid/release/ig;->y:Lcom/roidapp/photogrid/release/lc;

    .line 303
    new-instance v1, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-direct {v1, v4, v5}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 306
    const/4 v2, 0x0

    const/4 v12, 0x0

    invoke-virtual {v1, v8, v6, v2, v12}, Landroid/widget/RelativeLayout$LayoutParams;->setMargins(IIII)V

    .line 307
    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/rn;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 308
    invoke-virtual {v3, v1}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 309
    add-int v1, v8, v4

    add-int/2addr v1, v6

    .line 310
    invoke-virtual {v10, v0}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V

    .line 311
    invoke-virtual {v10, v3}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V

    .line 293
    add-int/lit8 v0, v7, 0x1

    move v7, v0

    move v8, v1

    goto :goto_1

    .line 313
    :cond_0
    invoke-virtual {p0, v10, v11}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 314
    const/4 v0, -0x1

    invoke-virtual {p0, v0}, Landroid/widget/LinearLayout;->setBackgroundColor(I)V

    .line 315
    return-void

    :cond_1
    move v6, v0

    goto :goto_0
.end method

.method public static b()Z
    .locals 2

    .prologue
    .line 1124
    invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;

    move-result-object v0

    const-string v1, "mounted"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1126
    const/4 v0, 0x1

    .line 1128
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static b(Ljava/lang/String;)Z
    .locals 1

    .prologue
    .line 2498
    .line 10060
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lcom/roidapp/baselib/a/b;->a(Ljava/io/File;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    .line 2498
    goto :goto_0
.end method

.method private static c(Landroid/content/Context;)F
    .locals 2

    .prologue
    .line 2131
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 2132
    const/16 v1, 0x320

    if-le v0, v1, :cond_0

    .line 2133
    const/high16 v0, 0x40000000    # 2.0f

    .line 2143
    :goto_0
    return v0

    .line 2134
    :cond_0
    const/16 v1, 0x258

    if-le v0, v1, :cond_1

    .line 2135
    const/high16 v0, 0x3fc00000    # 1.5f

    goto :goto_0

    .line 2141
    :cond_1
    const/high16 v0, 0x3f800000    # 1.0f

    goto :goto_0
.end method

.method private static c(Ljava/lang/String;)Landroid/graphics/PointF;
    .locals 3

    .prologue
    .line 1004
    const-string v0, "#"

    invoke-virtual {p0, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    .line 1005
    const/4 v1, 0x0

    aget-object v1, v0, v1

    invoke-static {v1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v1

    .line 1006
    const/4 v2, 0x1

    aget-object v0, v0, v2

    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v0

    .line 1007
    new-instance v2, Landroid/graphics/PointF;

    invoke-direct {v2, v1, v0}, Landroid/graphics/PointF;-><init>(FF)V

    .line 1010
    return-object v2
.end method

.method private static c()Ljava/util/List;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/roidapp/photogrid/release/rg;",
            ">;"
        }
    .end annotation

    .prologue
    const/4 v3, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x1

    .line 190
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 191
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->i()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    .line 192
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v4

    invoke-virtual {v4}, Lcom/roidapp/photogrid/release/ih;->j()Ljava/util/List;

    move-result-object v8

    .line 193
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v4

    invoke-virtual {v4}, Lcom/roidapp/photogrid/release/ih;->k()Ljava/util/List;

    move-result-object v9

    .line 194
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v4

    invoke-virtual {v4}, Lcom/roidapp/photogrid/release/ih;->l()Ljava/util/List;

    move-result-object v10

    .line 196
    if-eqz v8, :cond_0

    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v4

    if-nez v4, :cond_6

    :cond_0
    move v6, v2

    .line 197
    :goto_0
    if-eqz v9, :cond_1

    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v4

    if-nez v4, :cond_7

    :cond_1
    move v5, v2

    .line 198
    :goto_1
    if-eqz v10, :cond_2

    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v4

    if-nez v4, :cond_3

    :cond_2
    move v1, v2

    .line 200
    :cond_3
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_2
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    .line 201
    new-instance v12, Lcom/roidapp/photogrid/release/rg;

    invoke-direct {v12}, Lcom/roidapp/photogrid/release/rg;-><init>()V

    .line 202
    iput v2, v12, Lcom/roidapp/photogrid/release/rg;->a:I

    .line 203
    iput-object v0, v12, Lcom/roidapp/photogrid/release/rg;->b:Ljava/util/List;

    .line 204
    if-eqz v6, :cond_8

    move-object v4, v3

    .line 205
    :goto_3
    if-eqz v5, :cond_9

    move-object v0, v3

    .line 206
    :goto_4
    if-eqz v4, :cond_4

    .line 207
    invoke-virtual {v4}, Ljava/lang/Float;->floatValue()F

    move-result v4

    iput v4, v12, Lcom/roidapp/photogrid/release/rg;->g:F

    .line 209
    :cond_4
    if-eqz v0, :cond_5

    .line 210
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    iput v0, v12, Lcom/roidapp/photogrid/release/rg;->h:F

    .line 212
    :cond_5
    if-eqz v1, :cond_a

    move-object v0, v3

    :goto_5
    iput-object v0, v12, Lcom/roidapp/photogrid/release/rg;->i:Lcom/roidapp/cloudlib/template/f;

    .line 213
    invoke-interface {v7, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 214
    add-int/lit8 v2, v2, 0x1

    .line 215
    goto :goto_2

    :cond_6
    move v6, v1

    .line 196
    goto :goto_0

    :cond_7
    move v5, v1

    .line 197
    goto :goto_1

    .line 204
    :cond_8
    add-int/lit8 v0, v2, -0x1

    invoke-interface {v8, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    move-object v4, v0

    goto :goto_3

    .line 205
    :cond_9
    add-int/lit8 v0, v2, -0x1

    invoke-interface {v9, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    goto :goto_4

    .line 212
    :cond_a
    add-int/lit8 v0, v2, -0x1

    invoke-interface {v10, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/template/f;

    goto :goto_5

    .line 217
    :cond_b
    return-object v7
.end method


# virtual methods
.method public final a(Lcom/roidapp/photogrid/release/ig;II)Landroid/graphics/Bitmap;
    .locals 1

    .prologue
    .line 2110
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {p1, p2, p3, v0}, Lcom/roidapp/photogrid/release/rf;->a(Lcom/roidapp/photogrid/release/ig;IILjava/lang/Boolean;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 2111
    if-eqz v0, :cond_0

    .line 2112
    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/release/rf;->a(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 2114
    :cond_0
    return-object v0
.end method
