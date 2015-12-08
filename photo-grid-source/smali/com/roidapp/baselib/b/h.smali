.class public final Lcom/roidapp/baselib/b/h;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method private static a(Landroid/graphics/BitmapFactory$Options;II)I
    .locals 5

    .prologue
    const/4 v0, 0x1

    .line 118
    iget v2, p0, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    .line 119
    iget v3, p0, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    .line 122
    if-gt v2, p2, :cond_0

    if-le v3, p1, :cond_2

    .line 123
    :cond_0
    if-le v3, v2, :cond_1

    .line 124
    int-to-float v1, v2

    int-to-float v4, p2

    div-float/2addr v1, v4

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    .line 129
    :goto_0
    if-nez v1, :cond_3

    .line 140
    :goto_1
    mul-int v1, v3, v2

    int-to-float v1, v1

    .line 144
    mul-int v2, p1, p2

    mul-int/lit8 v2, v2, 0x2

    int-to-float v2, v2

    .line 146
    :goto_2
    mul-int v3, v0, v0

    int-to-float v3, v3

    div-float v3, v1, v3

    cmpl-float v3, v3, v2

    if-lez v3, :cond_2

    .line 147
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    .line 126
    :cond_1
    int-to-float v1, v3

    int-to-float v4, p1

    div-float/2addr v1, v4

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    goto :goto_0

    .line 150
    :cond_2
    return v0

    :cond_3
    move v0, v1

    goto :goto_1
.end method

.method public static a(Ljava/lang/String;II)Landroid/graphics/Bitmap;
    .locals 2

    .prologue
    .line 53
    new-instance v1, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v1}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 54
    const/4 v0, 0x1

    iput-boolean v0, v1, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 55
    invoke-static {p0, v1}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 58
    invoke-static {v1, p1, p2}, Lcom/roidapp/baselib/b/h;->a(Landroid/graphics/BitmapFactory$Options;II)I

    move-result v0

    iput v0, v1, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 61
    const/4 v0, 0x0

    iput-boolean v0, v1, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 63
    const/4 v0, 0x0

    .line 65
    :try_start_0
    invoke-static {p0, v1}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 67
    :goto_0
    return-object v0

    :catch_0
    move-exception v1

    goto :goto_0
.end method
