.class public Lcom/qihoo360/common/utils/ImageUtil;
.super Ljava/lang/Object;
.source "360Security"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getThumbFromBytes([B)Landroid/graphics/Bitmap;
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 21
    if-nez p0, :cond_1

    .line 44
    :cond_0
    :goto_0
    return-object v0

    .line 29
    :cond_1
    const/4 v1, 0x0

    :try_start_0
    array-length v2, p0

    invoke-static {p0, v1, v2}, Landroid/graphics/BitmapFactory;->decodeByteArray([BII)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    .line 34
    if-eqz v1, :cond_0

    move-object v0, v1

    .line 44
    goto :goto_0

    .line 30
    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method public static getThumbnail(Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;
    .locals 4

    .prologue
    .line 49
    const/4 v0, 0x0

    .line 52
    :try_start_0
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    .line 53
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    .line 54
    invoke-static {v2, v1}, Ljava/lang/Math;->min(II)I

    move-result v3

    .line 55
    sub-int/2addr v1, v3

    div-int/lit8 v1, v1, 0x2

    .line 56
    sub-int/2addr v2, v3

    div-int/lit8 v2, v2, 0x2

    .line 57
    invoke-static {p0, v1, v2, v3, v3}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 58
    const/4 v2, 0x1

    invoke-static {v1, p1, p1, v2}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 59
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 65
    :goto_0
    return-object v0

    .line 60
    :catch_0
    move-exception v1

    goto :goto_0
.end method
