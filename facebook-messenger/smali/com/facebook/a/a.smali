.class public Lcom/facebook/a/a;
.super Ljava/lang/Object;
.source "BitmapScalingUtils.java"


# static fields
.field private static final a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/Integer;",
            "[",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final b:Landroid/graphics/Paint;

.field private static final c:Landroid/graphics/Paint;

.field private static final d:Landroid/graphics/Paint;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .prologue
    const/high16 v8, 0x3f800000    # 1.0f

    const/4 v7, 0x3

    const/4 v6, 0x2

    const/4 v5, 0x1

    const/4 v4, 0x0

    .line 102
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/facebook/a/a;->a:Ljava/util/Map;

    .line 105
    sget-object v0, Lcom/facebook/a/a;->a:Ljava/util/Map;

    const/16 v1, 0xb

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-array v2, v7, [Ljava/lang/String;

    const-string v3, "FNumber"

    aput-object v3, v2, v4

    const-string v3, "ExposureTime"

    aput-object v3, v2, v5

    const-string v3, "ISOSpeedRatings"

    aput-object v3, v2, v6

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    sget-object v0, Lcom/facebook/a/a;->a:Ljava/util/Map;

    const/16 v1, 0x9

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-array v2, v6, [Ljava/lang/String;

    const-string v3, "GPSAltitude"

    aput-object v3, v2, v4

    const-string v3, "GPSAltitudeRef"

    aput-object v3, v2, v5

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 116
    sget-object v0, Lcom/facebook/a/a;->a:Ljava/util/Map;

    const/16 v1, 0x8

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x4

    new-array v2, v2, [Ljava/lang/String;

    const-string v3, "FocalLength"

    aput-object v3, v2, v4

    const-string v3, "GPSDateStamp"

    aput-object v3, v2, v5

    const-string v3, "GPSTimeStamp"

    aput-object v3, v2, v6

    const-string v3, "GPSProcessingMethod"

    aput-object v3, v2, v7

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 123
    sget-object v0, Lcom/facebook/a/a;->a:Ljava/util/Map;

    const/4 v1, 0x5

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/16 v2, 0xa

    new-array v2, v2, [Ljava/lang/String;

    const-string v3, "DateTime"

    aput-object v3, v2, v4

    const-string v3, "Flash"

    aput-object v3, v2, v5

    const-string v3, "Orientation"

    aput-object v3, v2, v6

    const-string v3, "GPSLatitude"

    aput-object v3, v2, v7

    const/4 v3, 0x4

    const-string v4, "GPSLatitudeRef"

    aput-object v4, v2, v3

    const/4 v3, 0x5

    const-string v4, "GPSLongitude"

    aput-object v4, v2, v3

    const/4 v3, 0x6

    const-string v4, "GPSLongitudeRef"

    aput-object v4, v2, v3

    const/4 v3, 0x7

    const-string v4, "Make"

    aput-object v4, v2, v3

    const/16 v3, 0x8

    const-string v4, "Model"

    aput-object v4, v2, v3

    const/16 v3, 0x9

    const-string v4, "WhiteBalance"

    aput-object v4, v2, v3

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 138
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    sput-object v0, Lcom/facebook/a/a;->b:Landroid/graphics/Paint;

    .line 140
    sget-object v0, Lcom/facebook/a/a;->b:Landroid/graphics/Paint;

    invoke-virtual {v0, v8}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 141
    sget-object v0, Lcom/facebook/a/a;->b:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 142
    sget-object v0, Lcom/facebook/a/a;->b:Landroid/graphics/Paint;

    const v1, -0x1f1f20

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 145
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    sput-object v0, Lcom/facebook/a/a;->c:Landroid/graphics/Paint;

    .line 147
    sget-object v0, Lcom/facebook/a/a;->c:Landroid/graphics/Paint;

    invoke-virtual {v0, v8}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 148
    sget-object v0, Lcom/facebook/a/a;->c:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 149
    sget-object v0, Lcom/facebook/a/a;->c:Landroid/graphics/Paint;

    const v1, -0xf0f10

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 152
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    sput-object v0, Lcom/facebook/a/a;->d:Landroid/graphics/Paint;

    .line 154
    sget-object v0, Lcom/facebook/a/a;->d:Landroid/graphics/Paint;

    const/high16 v1, 0x40400000    # 3.0f

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 155
    sget-object v0, Lcom/facebook/a/a;->d:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 156
    sget-object v0, Lcom/facebook/a/a;->d:Landroid/graphics/Paint;

    const v1, -0xf0f10

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 157
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 383
    return-void
.end method

.method private static a(IIIIIZ)F
    .locals 4

    .prologue
    .line 347
    if-eqz p5, :cond_2

    const/16 v0, 0x5a

    if-eq p2, v0, :cond_0

    const/16 v0, 0x10e

    if-ne p2, v0, :cond_2

    .line 355
    :cond_0
    :goto_0
    if-gt p1, p3, :cond_1

    if-le p0, p4, :cond_3

    .line 356
    :cond_1
    int-to-float v0, p1

    int-to-float v1, p3

    div-float/2addr v0, v1

    .line 357
    int-to-float v1, p0

    int-to-float v2, p4

    div-float/2addr v1, v2

    .line 358
    invoke-static {v0, v1}, Ljava/lang/Math;->max(FF)F

    move-result v0

    .line 360
    :goto_1
    return v0

    :cond_2
    move v3, p1

    move p1, p0

    move p0, v3

    .line 352
    goto :goto_0

    .line 360
    :cond_3
    const/high16 v0, 0x3f800000    # 1.0f

    goto :goto_1
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;II)V
    .locals 9

    .prologue
    .line 316
    :try_start_0
    new-instance v2, Landroid/media/ExifInterface;

    invoke-direct {v2, p0}, Landroid/media/ExifInterface;-><init>(Ljava/lang/String;)V

    .line 317
    new-instance v3, Landroid/media/ExifInterface;

    invoke-direct {v3, p1}, Landroid/media/ExifInterface;-><init>(Ljava/lang/String;)V

    .line 319
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 321
    sget-object v0, Lcom/facebook/a/a;->a:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    .line 322
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-lt v4, v1, :cond_0

    .line 323
    sget-object v1, Lcom/facebook/a/a;->a:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    array-length v6, v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v6, :cond_0

    aget-object v7, v0, v1

    .line 324
    invoke-virtual {v2, v7}, Landroid/media/ExifInterface;->getAttribute(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 325
    if-eqz v8, :cond_1

    .line 326
    invoke-virtual {v3, v7, v8}, Landroid/media/ExifInterface;->setAttribute(Ljava/lang/String;Ljava/lang/String;)V

    .line 323
    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 332
    :cond_2
    invoke-virtual {v3}, Landroid/media/ExifInterface;->saveAttributes()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 336
    return-void

    .line 333
    :catch_0
    move-exception v0

    .line 334
    new-instance v1, Lcom/facebook/a/d;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "copyExif from "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " to "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Lcom/facebook/a/d;-><init>(Ljava/lang/String;Ljava/io/IOException;)V

    throw v1
.end method

.method private a(Landroid/content/Context;Ljava/io/File;Ljava/io/File;IIIZ)Z
    .locals 8

    .prologue
    const/4 v6, 0x0

    const/4 v7, 0x0

    .line 705
    .line 709
    if-nez p7, :cond_2

    .line 710
    :try_start_0
    invoke-static {p2}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v2

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move v3, p4

    move v4, p5

    invoke-virtual/range {v0 .. v5}, Lcom/facebook/a/a;->a(Landroid/content/Context;Landroid/net/Uri;IIZ)Landroid/graphics/Bitmap;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v1

    .line 716
    :goto_0
    if-eqz v1, :cond_6

    .line 717
    :try_start_1
    sget-object v0, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    invoke-virtual {p0, v1, v0, p6, p3}, Lcom/facebook/a/a;->a(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap$CompressFormat;ILjava/io/File;)V

    .line 718
    invoke-virtual {p2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v4

    invoke-static {v0, v2, v3, v4}, Lcom/facebook/a/a;->a(Ljava/lang/String;Ljava/lang/String;II)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 723
    const/4 v0, 0x1

    .line 726
    :goto_1
    if-eqz v1, :cond_0

    .line 727
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V

    .line 729
    :cond_0
    if-eqz v6, :cond_1

    invoke-virtual {v6}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 730
    invoke-virtual {v6}, Ljava/io/File;->delete()Z

    .line 733
    :cond_1
    return v0

    .line 712
    :cond_2
    if-le p4, p5, :cond_3

    .line 713
    :goto_2
    :try_start_2
    invoke-virtual {p0, p1, p2, p4}, Lcom/facebook/a/a;->a(Landroid/content/Context;Ljava/io/File;I)Landroid/graphics/Bitmap;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-result-object v1

    goto :goto_0

    :cond_3
    move p4, p5

    .line 712
    goto :goto_2

    .line 726
    :catchall_0
    move-exception v0

    move-object v1, v6

    :goto_3
    if-eqz v1, :cond_4

    .line 727
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V

    .line 729
    :cond_4
    if-eqz p3, :cond_5

    invoke-virtual {p3}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_5

    .line 730
    invoke-virtual {p3}, Ljava/io/File;->delete()Z

    :cond_5
    throw v0

    .line 726
    :catchall_1
    move-exception v0

    goto :goto_3

    :cond_6
    move v0, v7

    move-object v6, p3

    goto :goto_1
.end method


# virtual methods
.method public a(Landroid/content/Context;Landroid/net/Uri;)I
    .locals 9

    .prologue
    const/4 v8, 0x1

    const/4 v7, 0x0

    const/4 v6, -0x1

    const/4 v3, 0x0

    .line 574
    invoke-virtual {p2}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v0

    const-string v1, "content"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p2}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    move-result-object v0

    const-string v1, "media"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p2}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Landroid/provider/MediaStore$Images$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    invoke-virtual {v1}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 579
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    new-array v2, v8, [Ljava/lang/String;

    const-string v1, "orientation"

    aput-object v1, v2, v7

    move-object v1, p2

    move-object v4, v3

    move-object v5, v3

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    .line 583
    invoke-interface {v0}, Landroid/database/Cursor;->getCount()I

    move-result v1

    if-eq v1, v8, :cond_0

    move v0, v6

    .line 593
    :goto_0
    return v0

    .line 587
    :cond_0
    invoke-interface {v0}, Landroid/database/Cursor;->moveToFirst()Z

    .line 588
    invoke-interface {v0, v7}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    goto :goto_0

    .line 589
    :cond_1
    invoke-virtual {p2}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v0

    const-string v1, "file"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 590
    invoke-virtual {p2}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/facebook/a/a;->a(Ljava/lang/String;)I

    move-result v0

    goto :goto_0

    :cond_2
    move v0, v6

    .line 593
    goto :goto_0
.end method

.method public a(Ljava/lang/String;)I
    .locals 4

    .prologue
    const/4 v0, -0x1

    .line 602
    :try_start_0
    new-instance v1, Landroid/media/ExifInterface;

    invoke-direct {v1, p1}, Landroid/media/ExifInterface;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 607
    const-string v2, "Orientation"

    const/4 v3, 0x1

    invoke-virtual {v1, v2, v3}, Landroid/media/ExifInterface;->getAttributeInt(Ljava/lang/String;I)I

    move-result v1

    packed-switch v1, :pswitch_data_0

    .line 619
    :goto_0
    :pswitch_0
    return v0

    .line 610
    :pswitch_1
    const/4 v0, 0x0

    goto :goto_0

    .line 612
    :pswitch_2
    const/16 v0, 0x5a

    goto :goto_0

    .line 614
    :pswitch_3
    const/16 v0, 0xb4

    goto :goto_0

    .line 616
    :pswitch_4
    const/16 v0, 0x10e

    goto :goto_0

    .line 603
    :catch_0
    move-exception v1

    goto :goto_0

    .line 607
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
        :pswitch_3
        :pswitch_0
        :pswitch_0
        :pswitch_2
        :pswitch_0
        :pswitch_4
    .end packed-switch
.end method

.method public a(Landroid/content/Context;Landroid/net/Uri;IIZ)Landroid/graphics/Bitmap;
    .locals 7

    .prologue
    .line 485
    new-instance v2, Lcom/facebook/a/f;

    invoke-direct {v2, p2}, Lcom/facebook/a/f;-><init>(Landroid/net/Uri;)V

    .line 488
    :try_start_0
    invoke-virtual {p0, p1, p2}, Lcom/facebook/a/a;->a(Landroid/content/Context;Landroid/net/Uri;)I

    move-result v3

    move-object v0, p0

    move-object v1, p1

    move v4, p3

    move v5, p4

    move v6, p5

    .line 489
    invoke-virtual/range {v0 .. v6}, Lcom/facebook/a/a;->a(Landroid/content/Context;Lcom/facebook/a/f;IIIZ)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 490
    :catch_0
    move-exception v0

    .line 491
    new-instance v1, Lcom/facebook/a/d;

    invoke-virtual {p2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Lcom/facebook/a/d;-><init>(Ljava/lang/String;Ljava/io/IOException;)V

    throw v1
.end method

.method public a(Landroid/content/Context;Lcom/facebook/a/f;IIIZ)Landroid/graphics/Bitmap;
    .locals 8

    .prologue
    const v7, 0x3f9851ec    # 1.19f

    .line 518
    :try_start_0
    invoke-virtual {p2, p1}, Lcom/facebook/a/f;->a(Landroid/content/Context;)Landroid/graphics/BitmapFactory$Options;
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    .line 525
    const/4 v6, 0x0

    .line 541
    iget v0, v1, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    iget v1, v1, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    move v2, p3

    move v3, p4

    move v4, p5

    move v5, p6

    invoke-static/range {v0 .. v5}, Lcom/facebook/a/a;->a(IIIIIZ)F

    move-result v0

    .line 548
    const/high16 v2, 0x3f800000    # 1.0f

    const/4 v1, 0x0

    move v3, v2

    move v2, v1

    move v1, v0

    move-object v0, v6

    .line 549
    :goto_0
    const/high16 v4, 0x40000000    # 2.0f

    cmpg-float v4, v3, v4

    if-gez v4, :cond_1

    .line 554
    float-to-int v4, v1

    if-ne v4, v2, :cond_0

    .line 550
    :goto_1
    float-to-int v2, v1

    .line 551
    mul-float/2addr v1, v7

    .line 552
    mul-float/2addr v3, v7

    goto :goto_0

    .line 519
    :catch_0
    move-exception v0

    .line 520
    new-instance v1, Lcom/facebook/a/e;

    invoke-direct {v1, v0}, Lcom/facebook/a/e;-><init>(Ljava/lang/OutOfMemoryError;)V

    throw v1

    .line 559
    :cond_0
    :try_start_1
    new-instance v0, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v0}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 560
    float-to-int v2, v1

    iput v2, v0, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 561
    invoke-virtual {p2, p1, v0}, Lcom/facebook/a/f;->a(Landroid/content/Context;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 562
    invoke-virtual {p0, v0, p3, p6}, Lcom/facebook/a/a;->a(Landroid/graphics/Bitmap;IZ)Landroid/graphics/Bitmap;
    :try_end_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v0

    return-object v0

    .line 569
    :cond_1
    const-string v1, "BitmapScalingUtils"

    const-string v2, "unable to resize image, even after additional subsampling"

    invoke-static {v1, v2}, Lcom/facebook/common/e/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 570
    new-instance v1, Lcom/facebook/a/e;

    invoke-direct {v1, v0}, Lcom/facebook/a/e;-><init>(Ljava/lang/OutOfMemoryError;)V

    throw v1

    .line 563
    :catch_1
    move-exception v0

    goto :goto_1
.end method

.method public a(Landroid/content/Context;Ljava/io/File;I)Landroid/graphics/Bitmap;
    .locals 7

    .prologue
    .line 211
    .line 214
    invoke-static {p2}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v2

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move v3, p3

    move v4, p3

    invoke-virtual/range {v0 .. v5}, Lcom/facebook/a/a;->a(Landroid/content/Context;Landroid/net/Uri;IIZ)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 216
    if-nez v1, :cond_0

    .line 217
    const/4 v0, 0x0

    .line 235
    :goto_0
    return-object v0

    .line 219
    :cond_0
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    if-gt v0, p3, :cond_1

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v0

    if-gt v0, p3, :cond_1

    move-object v0, v1

    .line 220
    goto :goto_0

    .line 224
    :cond_1
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    int-to-double v2, v0

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v0

    int-to-double v4, v0

    div-double/2addr v2, v4

    .line 226
    const-wide/high16 v4, 0x3ff0000000000000L    # 1.0

    cmpl-double v0, v2, v4

    if-lez v0, :cond_2

    .line 229
    int-to-double v4, p3

    div-double v2, v4, v2

    double-to-int v0, v2

    move v6, v0

    move v0, p3

    move p3, v6

    .line 235
    :goto_1
    const/4 v2, 0x1

    invoke-static {v1, v0, p3, v2}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    move-result-object v0

    goto :goto_0

    .line 232
    :cond_2
    int-to-double v4, p3

    mul-double/2addr v2, v4

    double-to-int v0, v2

    goto :goto_1
.end method

.method public a(Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;
    .locals 7

    .prologue
    const/4 v1, 0x0

    const/high16 v2, -0x40800000    # -1.0f

    .line 737
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    .line 738
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v4

    .line 740
    if-le v3, v4, :cond_1

    .line 741
    if-le v3, p2, :cond_2

    .line 742
    int-to-float v0, p2

    int-to-float v5, v3

    div-float/2addr v0, v5

    .line 751
    :goto_0
    cmpl-float v2, v0, v2

    if-eqz v2, :cond_0

    .line 752
    new-instance v5, Landroid/graphics/Matrix;

    invoke-direct {v5}, Landroid/graphics/Matrix;-><init>()V

    .line 753
    invoke-virtual {v5, v0, v0}, Landroid/graphics/Matrix;->postScale(FF)Z

    .line 754
    const/4 v6, 0x1

    move-object v0, p1

    move v2, v1

    invoke-static/range {v0 .. v6}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;

    move-result-object p1

    .line 765
    :cond_0
    return-object p1

    .line 745
    :cond_1
    if-le v4, p2, :cond_2

    .line 746
    int-to-float v0, p2

    int-to-float v5, v4

    div-float/2addr v0, v5

    goto :goto_0

    :cond_2
    move v0, v2

    goto :goto_0
.end method

.method public a(Landroid/graphics/Bitmap;II)Landroid/graphics/Bitmap;
    .locals 7

    .prologue
    const/4 v1, 0x0

    const/high16 v2, -0x40800000    # -1.0f

    .line 801
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    .line 802
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v4

    .line 804
    if-le v3, p2, :cond_2

    .line 805
    int-to-float v0, p2

    int-to-float v5, v3

    div-float/2addr v0, v5

    move v5, v0

    .line 808
    :goto_0
    if-le v4, p3, :cond_1

    .line 809
    int-to-float v0, p3

    int-to-float v6, v4

    div-float/2addr v0, v6

    .line 813
    :goto_1
    cmpl-float v6, v5, v2

    if-nez v6, :cond_0

    cmpl-float v2, v0, v2

    if-nez v2, :cond_0

    .line 828
    :goto_2
    return-object p1

    .line 816
    :cond_0
    invoke-static {v5, v0}, Ljava/lang/Math;->max(FF)F

    move-result v0

    .line 817
    new-instance v5, Landroid/graphics/Matrix;

    invoke-direct {v5}, Landroid/graphics/Matrix;-><init>()V

    .line 818
    invoke-virtual {v5, v0, v0}, Landroid/graphics/Matrix;->postScale(FF)Z

    .line 819
    const/4 v6, 0x1

    move-object v0, p1

    move v2, v1

    invoke-static/range {v0 .. v6}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;

    move-result-object p1

    goto :goto_2

    :cond_1
    move v0, v2

    goto :goto_1

    :cond_2
    move v5, v2

    goto :goto_0
.end method

.method public a(Landroid/graphics/Bitmap;IZ)Landroid/graphics/Bitmap;
    .locals 7

    .prologue
    .line 365
    if-eqz p3, :cond_0

    if-gtz p2, :cond_1

    .line 374
    :cond_0
    :goto_0
    return-object p1

    .line 369
    :cond_1
    :try_start_0
    new-instance v5, Landroid/graphics/Matrix;

    invoke-direct {v5}, Landroid/graphics/Matrix;-><init>()V

    .line 370
    int-to-float v0, p2

    invoke-virtual {v5, v0}, Landroid/graphics/Matrix;->postRotate(F)Z

    .line 371
    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v4

    const/4 v6, 0x1

    move-object v0, p1

    invoke-static/range {v0 .. v6}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    .line 374
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->recycle()V

    move-object p1, v0

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->recycle()V

    throw v0
.end method

.method public a(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap$CompressFormat;ILjava/io/File;)V
    .locals 4

    .prologue
    const/4 v2, 0x0

    .line 649
    .line 651
    :try_start_0
    new-instance v1, Ljava/io/FileOutputStream;

    invoke-direct {v1, p4}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_3
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 652
    :try_start_1
    invoke-virtual {p1, p2, p3, v1}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 653
    new-instance v0, Ljava/io/IOException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "cannot compress bitmap to file: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p4}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 662
    :catch_0
    move-exception v0

    .line 663
    :goto_0
    :try_start_2
    new-instance v2, Lcom/facebook/a/d;

    invoke-virtual {p4}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3, v0}, Lcom/facebook/a/d;-><init>(Ljava/lang/String;Ljava/io/IOException;)V

    throw v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 665
    :catchall_0
    move-exception v0

    :goto_1
    if-eqz v1, :cond_0

    .line 667
    :try_start_3
    invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    .line 673
    :cond_0
    :goto_2
    if-eqz p4, :cond_1

    invoke-virtual {p4}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 674
    invoke-virtual {p4}, Ljava/io/File;->delete()Z

    :cond_1
    throw v0

    .line 658
    :cond_2
    const/4 v0, 0x0

    .line 659
    :try_start_4
    invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 665
    if-eqz v2, :cond_3

    .line 667
    :try_start_5
    invoke-virtual {v0}, Ljava/io/FileOutputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_1

    .line 673
    :cond_3
    :goto_3
    if-eqz v2, :cond_4

    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 674
    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    .line 677
    :cond_4
    return-void

    .line 668
    :catch_1
    move-exception v0

    goto :goto_3

    :catch_2
    move-exception v1

    goto :goto_2

    .line 665
    :catchall_1
    move-exception v0

    move-object v1, v2

    goto :goto_1

    .line 662
    :catch_3
    move-exception v0

    move-object v1, v2

    goto :goto_0
.end method

.method public a(Landroid/content/Context;Ljava/io/File;Ljava/io/File;III)Z
    .locals 8

    .prologue
    .line 686
    const/4 v7, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    move v5, p5

    move v6, p6

    invoke-direct/range {v0 .. v7}, Lcom/facebook/a/a;->a(Landroid/content/Context;Ljava/io/File;Ljava/io/File;IIIZ)Z

    move-result v0

    return v0
.end method
