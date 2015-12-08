.class public final Lkik/android/util/aa;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Ljava/util/HashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 18
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lkik/android/util/aa;->a:Ljava/util/HashMap;

    return-void
.end method

.method public static a(IIF)I
    .locals 6

    .prologue
    const/high16 v4, 0xff0000

    const v5, 0xff00

    const/high16 v3, -0x1000000

    const/high16 v2, 0x3f800000    # 1.0f

    .line 22
    const/4 v0, 0x0

    invoke-static {v2, p2}, Ljava/lang/Math;->min(FF)F

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->max(FF)F

    move-result v0

    .line 24
    sub-float v1, v2, v0

    .line 26
    and-int v2, p0, v3

    shr-int/lit8 v2, v2, 0x18

    int-to-float v2, v2

    mul-float/2addr v2, v0

    and-int/2addr v3, p1

    shr-int/lit8 v3, v3, 0x18

    int-to-float v3, v3

    mul-float/2addr v3, v1

    add-float/2addr v2, v3

    .line 27
    and-int v3, p0, v4

    shr-int/lit8 v3, v3, 0x10

    int-to-float v3, v3

    mul-float/2addr v3, v0

    and-int/2addr v4, p1

    shr-int/lit8 v4, v4, 0x10

    int-to-float v4, v4

    mul-float/2addr v4, v1

    add-float/2addr v3, v4

    .line 28
    and-int v4, p0, v5

    shr-int/lit8 v4, v4, 0x8

    int-to-float v4, v4

    mul-float/2addr v4, v0

    and-int/2addr v5, p1

    shr-int/lit8 v5, v5, 0x8

    int-to-float v5, v5

    mul-float/2addr v5, v1

    add-float/2addr v4, v5

    .line 29
    and-int/lit16 v5, p0, 0xff

    int-to-float v5, v5

    mul-float/2addr v0, v5

    and-int/lit16 v5, p1, 0xff

    int-to-float v5, v5

    mul-float/2addr v1, v5

    add-float/2addr v0, v1

    .line 31
    float-to-int v1, v2

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x18

    float-to-int v2, v3

    and-int/lit16 v2, v2, 0xff

    shl-int/lit8 v2, v2, 0x10

    or-int/2addr v1, v2

    float-to-int v2, v4

    and-int/lit16 v2, v2, 0xff

    shl-int/lit8 v2, v2, 0x8

    or-int/2addr v1, v2

    float-to-int v0, v0

    and-int/lit16 v0, v0, 0xff

    or-int/2addr v0, v1

    return v0
.end method

.method public static a(Landroid/graphics/Bitmap;)Z
    .locals 1

    .prologue
    const/16 v0, 0xa

    .line 68
    if-nez p0, :cond_0

    .line 69
    const/4 v0, 0x0

    .line 73
    :goto_0
    return v0

    .line 72
    :cond_0
    invoke-static {p0, v0, v0}, Lkik/android/util/r;->a(Landroid/graphics/Bitmap;II)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 73
    invoke-static {v0}, Lkik/android/util/r;->d(Landroid/graphics/Bitmap;)Z

    move-result v0

    goto :goto_0
.end method

.method public static a(Lkik/a/e/v;Lkik/a/d/d;)Z
    .locals 6

    .prologue
    const/4 v5, -0x1

    const/4 v0, 0x0

    .line 36
    if-nez p1, :cond_1

    .line 63
    :cond_0
    :goto_0
    return v0

    .line 39
    :cond_1
    invoke-virtual {p1}, Lkik/a/d/d;->b()Ljava/lang/String;

    move-result-object v1

    .line 40
    if-eqz p0, :cond_0

    if-eqz v1, :cond_0

    .line 43
    sget-object v2, Lkik/android/util/aa;->a:Ljava/util/HashMap;

    invoke-virtual {v2, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 44
    sget-object v0, Lkik/android/util/aa;->a:Ljava/util/HashMap;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    goto :goto_0

    .line 46
    :cond_2
    invoke-interface {p0, v1, v0}, Lkik/a/e/v;->b(Ljava/lang/String;Z)Ljava/io/File;

    move-result-object v2

    .line 47
    if-eqz v2, :cond_0

    .line 50
    new-instance v3, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v3}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 51
    const/4 v4, 0x1

    iput-boolean v4, v3, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 52
    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v3}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 53
    iget-boolean v4, v3, Landroid/graphics/BitmapFactory$Options;->mCancel:Z

    if-nez v4, :cond_0

    iget v4, v3, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    if-eq v4, v5, :cond_0

    iget v4, v3, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    if-eq v4, v5, :cond_0

    .line 56
    const/16 v4, 0xa

    const/16 v5, 0x190

    invoke-static {v3, v4, v5}, Lkik/android/util/u;->a(Landroid/graphics/BitmapFactory$Options;II)I

    move-result v4

    iput v4, v3, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 57
    iput-boolean v0, v3, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 59
    iput-boolean v0, v3, Landroid/graphics/BitmapFactory$Options;->inDither:Z

    .line 60
    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v3}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 61
    invoke-static {v0}, Lkik/android/util/aa;->a(Landroid/graphics/Bitmap;)Z

    move-result v0

    .line 62
    sget-object v2, Lkik/android/util/aa;->a:Ljava/util/HashMap;

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-virtual {v2, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0
.end method
