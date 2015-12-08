.class public final Lcom/roidapp/photogrid/common/bp;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0x5
.end annotation


# static fields
.field private static a:Lcom/roidapp/photogrid/common/bp;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 27
    const/4 v0, 0x0

    sput-object v0, Lcom/roidapp/photogrid/common/bp;->a:Lcom/roidapp/photogrid/common/bp;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .prologue
    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    return-void
.end method

.method public static a(Landroid/view/MotionEvent;I)F
    .locals 1

    .prologue
    .line 44
    invoke-static {p0, p1}, Landroid/support/v4/view/MotionEventCompat;->getX(Landroid/view/MotionEvent;I)F

    move-result v0

    return v0
.end method

.method public static a(Landroid/view/MotionEvent;)I
    .locals 1

    .prologue
    .line 40
    invoke-static {p0}, Landroid/support/v4/view/MotionEventCompat;->getPointerCount(Landroid/view/MotionEvent;)I

    move-result v0

    return v0
.end method

.method public static a()Lcom/roidapp/photogrid/common/bp;
    .locals 1

    .prologue
    .line 33
    sget-object v0, Lcom/roidapp/photogrid/common/bp;->a:Lcom/roidapp/photogrid/common/bp;

    if-nez v0, :cond_0

    .line 34
    new-instance v0, Lcom/roidapp/photogrid/common/bp;

    invoke-direct {v0}, Lcom/roidapp/photogrid/common/bp;-><init>()V

    sput-object v0, Lcom/roidapp/photogrid/common/bp;->a:Lcom/roidapp/photogrid/common/bp;

    .line 36
    :cond_0
    sget-object v0, Lcom/roidapp/photogrid/common/bp;->a:Lcom/roidapp/photogrid/common/bp;

    return-object v0
.end method

.method public static a(Ljava/lang/String;)V
    .locals 4

    .prologue
    .line 100
    :try_start_0
    new-instance v0, Landroid/media/ExifInterface;

    invoke-direct {v0, p0}, Landroid/media/ExifInterface;-><init>(Ljava/lang/String;)V

    .line 103
    const-string v1, "DateTime"

    new-instance v2, Ljava/text/SimpleDateFormat;

    const-string v3, "yyyy:MM:dd HH:mm:ss"

    invoke-direct {v2, v3}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    new-instance v3, Ljava/util/Date;

    invoke-direct {v3}, Ljava/util/Date;-><init>()V

    invoke-virtual {v2, v3}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/media/ExifInterface;->setAttribute(Ljava/lang/String;Ljava/lang/String;)V

    .line 105
    const-string v1, "Make"

    const-string v2, "http://photogrid.org"

    invoke-virtual {v0, v1, v2}, Landroid/media/ExifInterface;->setAttribute(Ljava/lang/String;Ljava/lang/String;)V

    .line 106
    invoke-virtual {v0}, Landroid/media/ExifInterface;->saveAttributes()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 111
    :goto_0
    return-void

    .line 109
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_0
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 6

    .prologue
    .line 115
    :try_start_0
    new-instance v0, Landroid/media/ExifInterface;

    invoke-direct {v0, p0}, Landroid/media/ExifInterface;-><init>(Ljava/lang/String;)V

    .line 116
    new-instance v1, Landroid/media/ExifInterface;

    invoke-direct {v1, p1}, Landroid/media/ExifInterface;-><init>(Ljava/lang/String;)V

    .line 123
    const-string v2, "DateTime"

    new-instance v3, Ljava/text/SimpleDateFormat;

    const-string v4, "yyyy:MM:dd HH:mm:ss"

    sget-object v5, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-direct {v3, v4, v5}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    new-instance v4, Ljava/util/Date;

    invoke-direct {v4}, Ljava/util/Date;-><init>()V

    invoke-virtual {v3, v4}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/media/ExifInterface;->setAttribute(Ljava/lang/String;Ljava/lang/String;)V

    .line 125
    const-string v2, "Flash"

    invoke-virtual {v0, v2}, Landroid/media/ExifInterface;->getAttribute(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 126
    const-string v2, "Flash"

    const-string v3, "Flash"

    invoke-virtual {v0, v3}, Landroid/media/ExifInterface;->getAttribute(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/media/ExifInterface;->setAttribute(Ljava/lang/String;Ljava/lang/String;)V

    .line 129
    :cond_0
    const-string v2, "GPSLatitude"

    invoke-virtual {v0, v2}, Landroid/media/ExifInterface;->getAttribute(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 130
    const-string v2, "GPSLatitude"

    const-string v3, "GPSLatitude"

    invoke-virtual {v0, v3}, Landroid/media/ExifInterface;->getAttribute(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/media/ExifInterface;->setAttribute(Ljava/lang/String;Ljava/lang/String;)V

    .line 133
    :cond_1
    const-string v2, "GPSLatitudeRef"

    invoke-virtual {v0, v2}, Landroid/media/ExifInterface;->getAttribute(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_2

    .line 134
    const-string v2, "GPSLatitudeRef"

    const-string v3, "GPSLatitudeRef"

    invoke-virtual {v0, v3}, Landroid/media/ExifInterface;->getAttribute(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/media/ExifInterface;->setAttribute(Ljava/lang/String;Ljava/lang/String;)V

    .line 137
    :cond_2
    const-string v2, "GPSLongitude"

    invoke-virtual {v0, v2}, Landroid/media/ExifInterface;->getAttribute(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_3

    .line 138
    const-string v2, "GPSLongitude"

    const-string v3, "GPSLongitude"

    invoke-virtual {v0, v3}, Landroid/media/ExifInterface;->getAttribute(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/media/ExifInterface;->setAttribute(Ljava/lang/String;Ljava/lang/String;)V

    .line 141
    :cond_3
    const-string v2, "GPSLongitudeRef"

    invoke-virtual {v0, v2}, Landroid/media/ExifInterface;->getAttribute(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_4

    .line 142
    const-string v2, "GPSLongitudeRef"

    const-string v3, "GPSLongitudeRef"

    invoke-virtual {v0, v3}, Landroid/media/ExifInterface;->getAttribute(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/media/ExifInterface;->setAttribute(Ljava/lang/String;Ljava/lang/String;)V

    .line 144
    :cond_4
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x9

    if-lt v2, v3, :cond_6

    .line 146
    const-string v2, "GPSAltitude"

    invoke-virtual {v0, v2}, Landroid/media/ExifInterface;->getAttribute(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_5

    .line 147
    const-string v2, "GPSAltitude"

    const-string v3, "GPSAltitude"

    invoke-virtual {v0, v3}, Landroid/media/ExifInterface;->getAttribute(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/media/ExifInterface;->setAttribute(Ljava/lang/String;Ljava/lang/String;)V

    .line 150
    :cond_5
    const-string v2, "GPSAltitudeRef"

    invoke-virtual {v0, v2}, Landroid/media/ExifInterface;->getAttribute(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_6

    .line 151
    const-string v2, "GPSAltitudeRef"

    const-string v3, "GPSAltitudeRef"

    invoke-virtual {v0, v3}, Landroid/media/ExifInterface;->getAttribute(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/media/ExifInterface;->setAttribute(Ljava/lang/String;Ljava/lang/String;)V

    .line 155
    :cond_6
    const-string v2, "Make"

    invoke-virtual {v0, v2}, Landroid/media/ExifInterface;->getAttribute(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_7

    .line 156
    const-string v2, "Make"

    const-string v3, "Make"

    invoke-virtual {v0, v3}, Landroid/media/ExifInterface;->getAttribute(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/media/ExifInterface;->setAttribute(Ljava/lang/String;Ljava/lang/String;)V

    .line 159
    :cond_7
    const-string v2, "Model"

    invoke-virtual {v0, v2}, Landroid/media/ExifInterface;->getAttribute(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_8

    .line 160
    const-string v2, "Model"

    const-string v3, "Model"

    invoke-virtual {v0, v3}, Landroid/media/ExifInterface;->getAttribute(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/media/ExifInterface;->setAttribute(Ljava/lang/String;Ljava/lang/String;)V

    .line 163
    :cond_8
    const-string v2, "WhiteBalance"

    invoke-virtual {v0, v2}, Landroid/media/ExifInterface;->getAttribute(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_9

    .line 164
    const-string v2, "WhiteBalance"

    const-string v3, "WhiteBalance"

    invoke-virtual {v0, v3}, Landroid/media/ExifInterface;->getAttribute(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v2, v0}, Landroid/media/ExifInterface;->setAttribute(Ljava/lang/String;Ljava/lang/String;)V

    .line 167
    :cond_9
    invoke-virtual {v1}, Landroid/media/ExifInterface;->saveAttributes()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 173
    :goto_0
    return-void

    .line 171
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_0
.end method

.method public static b(Landroid/view/MotionEvent;)F
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v1, 0x0

    .line 56
    .line 1044
    invoke-static {p0, v1}, Landroid/support/v4/view/MotionEventCompat;->getX(Landroid/view/MotionEvent;I)F

    move-result v0

    .line 56
    float-to-int v0, v0

    int-to-float v0, v0

    .line 1048
    invoke-static {p0, v1}, Landroid/support/v4/view/MotionEventCompat;->getY(Landroid/view/MotionEvent;I)F

    move-result v1

    .line 56
    float-to-int v1, v1

    int-to-float v1, v1

    .line 2044
    invoke-static {p0, v3}, Landroid/support/v4/view/MotionEventCompat;->getX(Landroid/view/MotionEvent;I)F

    move-result v2

    .line 56
    float-to-int v2, v2

    int-to-float v2, v2

    .line 2048
    invoke-static {p0, v3}, Landroid/support/v4/view/MotionEventCompat;->getY(Landroid/view/MotionEvent;I)F

    move-result v3

    .line 56
    float-to-int v3, v3

    int-to-float v3, v3

    .line 2070
    sub-float/2addr v0, v2

    .line 2071
    sub-float/2addr v1, v3

    .line 2072
    mul-float/2addr v0, v0

    mul-float/2addr v1, v1

    add-float/2addr v0, v1

    invoke-static {v0}, Landroid/util/FloatMath;->sqrt(F)F

    move-result v0

    .line 56
    return v0
.end method

.method public static b(Landroid/view/MotionEvent;I)F
    .locals 1

    .prologue
    .line 48
    invoke-static {p0, p1}, Landroid/support/v4/view/MotionEventCompat;->getY(Landroid/view/MotionEvent;I)F

    move-result v0

    return v0
.end method

.method public static c(Landroid/view/MotionEvent;)F
    .locals 13

    .prologue
    const/4 v7, 0x0

    const/high16 v12, 0x43340000    # 180.0f

    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    const-wide/high16 v2, -0x4010000000000000L    # -1.0

    const/4 v6, 0x0

    .line 61
    new-instance v4, Landroid/graphics/PointF;

    .line 3044
    invoke-static {p0, v7}, Landroid/support/v4/view/MotionEventCompat;->getX(Landroid/view/MotionEvent;I)F

    move-result v5

    .line 61
    float-to-int v5, v5

    int-to-float v5, v5

    .line 3048
    invoke-static {p0, v7}, Landroid/support/v4/view/MotionEventCompat;->getY(Landroid/view/MotionEvent;I)F

    move-result v7

    .line 61
    float-to-int v7, v7

    int-to-float v7, v7

    invoke-direct {v4, v5, v7}, Landroid/graphics/PointF;-><init>(FF)V

    .line 62
    new-instance v5, Landroid/graphics/PointF;

    .line 4044
    const/4 v7, 0x1

    invoke-static {p0, v7}, Landroid/support/v4/view/MotionEventCompat;->getX(Landroid/view/MotionEvent;I)F

    move-result v7

    .line 62
    float-to-int v7, v7

    int-to-float v7, v7

    .line 4048
    const/4 v8, 0x1

    invoke-static {p0, v8}, Landroid/support/v4/view/MotionEventCompat;->getY(Landroid/view/MotionEvent;I)F

    move-result v8

    .line 62
    float-to-int v8, v8

    int-to-float v8, v8

    invoke-direct {v5, v7, v8}, Landroid/graphics/PointF;-><init>(FF)V

    .line 4076
    iget v7, v4, Landroid/graphics/PointF;->x:F

    iget v8, v5, Landroid/graphics/PointF;->x:F

    sub-float/2addr v7, v8

    .line 4077
    iget v4, v4, Landroid/graphics/PointF;->y:F

    iget v5, v5, Landroid/graphics/PointF;->y:F

    sub-float v8, v4, v5

    .line 4079
    float-to-double v4, v7

    mul-float v9, v7, v7

    mul-float v10, v8, v8

    add-float/2addr v9, v10

    float-to-double v10, v9

    invoke-static {v10, v11}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v10

    div-double/2addr v4, v10

    .line 4080
    cmpl-double v9, v4, v0

    if-lez v9, :cond_0

    .line 4085
    :goto_0
    invoke-static {v0, v1}, Ljava/lang/Math;->asin(D)D

    move-result-wide v0

    const-wide v2, 0x4066800000000000L    # 180.0

    mul-double/2addr v0, v2

    const-wide v2, 0x400921fb54442d18L    # Math.PI

    div-double/2addr v0, v2

    double-to-float v0, v0

    .line 4086
    cmpl-float v1, v7, v6

    if-ltz v1, :cond_1

    cmpg-float v1, v8, v6

    if-gtz v1, :cond_1

    .line 4087
    const/high16 v1, 0x43b40000    # 360.0f

    sub-float v0, v1, v0

    .line 66
    :goto_1
    return v0

    .line 4082
    :cond_0
    cmpg-double v0, v4, v2

    if-gez v0, :cond_5

    move-wide v0, v2

    .line 4083
    goto :goto_0

    .line 4088
    :cond_1
    cmpg-float v1, v7, v6

    if-gtz v1, :cond_2

    cmpg-float v1, v8, v6

    if-gtz v1, :cond_2

    .line 4089
    neg-float v0, v0

    goto :goto_1

    .line 4090
    :cond_2
    cmpg-float v1, v7, v6

    if-gtz v1, :cond_3

    cmpl-float v1, v8, v6

    if-ltz v1, :cond_3

    .line 4091
    add-float/2addr v0, v12

    goto :goto_1

    .line 4092
    :cond_3
    cmpl-float v1, v7, v6

    if-ltz v1, :cond_4

    cmpl-float v1, v8, v6

    if-ltz v1, :cond_4

    .line 4093
    add-float/2addr v0, v12

    goto :goto_1

    :cond_4
    move v0, v6

    goto :goto_1

    :cond_5
    move-wide v0, v4

    goto :goto_0
.end method
