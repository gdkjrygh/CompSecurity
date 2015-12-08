.class public Lorg/chromium/ui/gfx/BitmapHelper;
.super Ljava/lang/Object;
.source "BitmapHelper.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/chromium/ui/gfx/BitmapHelper$1;
    }
.end annotation

.annotation runtime Lorg/chromium/base/JNINamespace;
    value = "gfx"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 96
    return-void
.end method

.method private static calculateInSampleSize(Landroid/graphics/BitmapFactory$Options;II)I
    .locals 7
    .param p0, "options"    # Landroid/graphics/BitmapFactory$Options;
    .param p1, "reqWidth"    # I
    .param p2, "reqHeight"    # I

    .prologue
    .line 59
    iget v0, p0, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    .line 60
    .local v0, "height":I
    iget v3, p0, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    .line 61
    .local v3, "width":I
    const/4 v2, 0x1

    .line 63
    .local v2, "inSampleSize":I
    if-gt v0, p2, :cond_0

    if-le v3, p1, :cond_1

    .line 66
    :cond_0
    int-to-float v5, v0

    int-to-float v6, p2

    div-float/2addr v5, v6

    invoke-static {v5}, Ljava/lang/Math;->round(F)I

    move-result v1

    .line 67
    .local v1, "heightRatio":I
    int-to-float v5, v3

    int-to-float v6, p1

    div-float/2addr v5, v6

    invoke-static {v5}, Ljava/lang/Math;->round(F)I

    move-result v4

    .line 72
    .local v4, "widthRatio":I
    if-ge v1, v4, :cond_2

    move v2, v1

    .line 75
    .end local v1    # "heightRatio":I
    .end local v4    # "widthRatio":I
    :cond_1
    :goto_0
    return v2

    .restart local v1    # "heightRatio":I
    .restart local v4    # "widthRatio":I
    :cond_2
    move v2, v4

    .line 72
    goto :goto_0
.end method

.method private static createBitmap(III)Landroid/graphics/Bitmap;
    .locals 2
    .param p0, "width"    # I
    .param p1, "height"    # I
    .param p2, "bitmapFormatValue"    # I
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 23
    invoke-static {p2}, Lorg/chromium/ui/gfx/BitmapHelper;->getBitmapConfigForFormat(I)Landroid/graphics/Bitmap$Config;

    move-result-object v0

    .line 24
    .local v0, "bitmapConfig":Landroid/graphics/Bitmap$Config;
    invoke-static {p0, p1, v0}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v1

    return-object v1
.end method

.method private static decodeDrawableResource(Ljava/lang/String;II)Landroid/graphics/Bitmap;
    .locals 4
    .param p0, "name"    # Ljava/lang/String;
    .param p1, "reqWidth"    # I
    .param p2, "reqHeight"    # I
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    const/4 v3, 0x0

    .line 40
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v1

    .line 41
    .local v1, "res":Landroid/content/res/Resources;
    invoke-virtual {v1, p0, v3, v3}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v2

    .line 42
    .local v2, "resId":I
    if-nez v2, :cond_0

    .line 51
    :goto_0
    return-object v3

    .line 44
    :cond_0
    new-instance v0, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v0}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 45
    .local v0, "options":Landroid/graphics/BitmapFactory$Options;
    const/4 v3, 0x1

    iput-boolean v3, v0, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 46
    invoke-static {v1, v2, v0}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;ILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 48
    invoke-static {v0, p1, p2}, Lorg/chromium/ui/gfx/BitmapHelper;->calculateInSampleSize(Landroid/graphics/BitmapFactory$Options;II)I

    move-result v3

    iput v3, v0, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 49
    const/4 v3, 0x0

    iput-boolean v3, v0, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 50
    sget-object v3, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    iput-object v3, v0, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;

    .line 51
    invoke-static {v1, v2, v0}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;ILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object v3

    goto :goto_0
.end method

.method private static getBitmapConfigForFormat(I)Landroid/graphics/Bitmap$Config;
    .locals 1
    .param p0, "bitmapFormatValue"    # I

    .prologue
    .line 107
    packed-switch p0, :pswitch_data_0

    .line 116
    :pswitch_0
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    :goto_0
    return-object v0

    .line 109
    :pswitch_1
    sget-object v0, Landroid/graphics/Bitmap$Config;->ALPHA_8:Landroid/graphics/Bitmap$Config;

    goto :goto_0

    .line 111
    :pswitch_2
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_4444:Landroid/graphics/Bitmap$Config;

    goto :goto_0

    .line 113
    :pswitch_3
    sget-object v0, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    goto :goto_0

    .line 107
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_2
        :pswitch_0
        :pswitch_3
    .end packed-switch
.end method

.method private static getBitmapFormatForConfig(Landroid/graphics/Bitmap$Config;)I
    .locals 2
    .param p0, "bitmapConfig"    # Landroid/graphics/Bitmap$Config;
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 86
    sget-object v0, Lorg/chromium/ui/gfx/BitmapHelper$1;->$SwitchMap$android$graphics$Bitmap$Config:[I

    invoke-virtual {p0}, Landroid/graphics/Bitmap$Config;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 96
    const/4 v0, 0x0

    :goto_0
    return v0

    .line 88
    :pswitch_0
    const/4 v0, 0x1

    goto :goto_0

    .line 90
    :pswitch_1
    const/4 v0, 0x2

    goto :goto_0

    .line 92
    :pswitch_2
    const/4 v0, 0x3

    goto :goto_0

    .line 94
    :pswitch_3
    const/4 v0, 0x4

    goto :goto_0

    .line 86
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method
