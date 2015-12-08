.class public Lorg/chromium/content/browser/input/HandleViewResources;
.super Ljava/lang/Object;
.source "HandleViewResources.java"


# annotations
.annotation runtime Lorg/chromium/base/JNINamespace;
    value = "content"
.end annotation


# static fields
.field static final synthetic $assertionsDisabled:Z

.field private static final CENTER_HANDLE_ATTRS:[I

.field private static final LEFT_HANDLE_ATTRS:[I

.field private static final RIGHT_HANDLE_ATTRS:[I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 21
    const-class v0, Lorg/chromium/content/browser/input/HandleViewResources;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    move v0, v1

    :goto_0
    sput-boolean v0, Lorg/chromium/content/browser/input/HandleViewResources;->$assertionsDisabled:Z

    .line 23
    new-array v0, v1, [I

    const v3, 0x10102c5

    aput v3, v0, v2

    sput-object v0, Lorg/chromium/content/browser/input/HandleViewResources;->LEFT_HANDLE_ATTRS:[I

    .line 27
    new-array v0, v1, [I

    const v3, 0x10102c7

    aput v3, v0, v2

    sput-object v0, Lorg/chromium/content/browser/input/HandleViewResources;->CENTER_HANDLE_ATTRS:[I

    .line 31
    new-array v0, v1, [I

    const v1, 0x10102c6

    aput v1, v0, v2

    sput-object v0, Lorg/chromium/content/browser/input/HandleViewResources;->RIGHT_HANDLE_ATTRS:[I

    return-void

    :cond_0
    move v0, v2

    .line 21
    goto :goto_0
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static getCenterHandleBitmap(Landroid/content/Context;)Landroid/graphics/Bitmap;
    .locals 1
    .param p0, "context"    # Landroid/content/Context;
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 103
    sget-object v0, Lorg/chromium/content/browser/input/HandleViewResources;->CENTER_HANDLE_ATTRS:[I

    invoke-static {p0, v0}, Lorg/chromium/content/browser/input/HandleViewResources;->getHandleBitmap(Landroid/content/Context;[I)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method

.method public static getCenterHandleDrawable(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;
    .locals 1
    .param p0, "context"    # Landroid/content/Context;

    .prologue
    .line 40
    sget-object v0, Lorg/chromium/content/browser/input/HandleViewResources;->CENTER_HANDLE_ATTRS:[I

    invoke-static {p0, v0}, Lorg/chromium/content/browser/input/HandleViewResources;->getHandleDrawable(Landroid/content/Context;[I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    return-object v0
.end method

.method private static getHandleBitmap(Landroid/content/Context;[I)Landroid/graphics/Bitmap;
    .locals 13
    .param p0, "context"    # Landroid/content/Context;
    .param p1, "attrs"    # [I

    .prologue
    const/4 v12, 0x0

    .line 65
    invoke-virtual {p0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v11

    invoke-virtual {v11, p1}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    move-result-object v0

    .line 66
    .local v0, "a":Landroid/content/res/TypedArray;
    invoke-virtual {v0, v12}, Landroid/content/res/TypedArray;->getIndex(I)I

    move-result v11

    invoke-virtual {v0, v11, v12}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v9

    .line 67
    .local v9, "resId":I
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->getResources()Landroid/content/res/Resources;

    move-result-object v8

    .line 68
    .local v8, "res":Landroid/content/res/Resources;
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 70
    sget-object v4, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 71
    .local v4, "config":Landroid/graphics/Bitmap$Config;
    new-instance v7, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v7}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 72
    .local v7, "options":Landroid/graphics/BitmapFactory$Options;
    iput-boolean v12, v7, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 73
    iput-object v4, v7, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;

    .line 74
    invoke-static {v8, v9, v7}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;ILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 75
    .local v1, "bitmap":Landroid/graphics/Bitmap;
    if-eqz v1, :cond_0

    move-object v3, v1

    .line 93
    :goto_0
    return-object v3

    .line 79
    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v11

    if-eq v8, v11, :cond_1

    .line 80
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v11

    invoke-static {v11, v9, v7}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;ILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 81
    if-eqz v1, :cond_1

    move-object v3, v1

    goto :goto_0

    .line 84
    :cond_1
    invoke-static {p0, p1}, Lorg/chromium/content/browser/input/HandleViewResources;->getHandleDrawable(Landroid/content/Context;[I)Landroid/graphics/drawable/Drawable;

    move-result-object v5

    .line 85
    .local v5, "drawable":Landroid/graphics/drawable/Drawable;
    sget-boolean v11, Lorg/chromium/content/browser/input/HandleViewResources;->$assertionsDisabled:Z

    if-nez v11, :cond_2

    if-nez v5, :cond_2

    new-instance v11, Ljava/lang/AssertionError;

    invoke-direct {v11}, Ljava/lang/AssertionError;-><init>()V

    throw v11

    .line 87
    :cond_2
    invoke-virtual {v5}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v10

    .line 88
    .local v10, "width":I
    invoke-virtual {v5}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v6

    .line 89
    .local v6, "height":I
    invoke-static {v10, v6, v4}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v3

    .line 90
    .local v3, "canvasBitmap":Landroid/graphics/Bitmap;
    new-instance v2, Landroid/graphics/Canvas;

    invoke-direct {v2, v3}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 91
    .local v2, "canvas":Landroid/graphics/Canvas;
    invoke-virtual {v5, v12, v12, v10, v6}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 92
    invoke-virtual {v5, v2}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    goto :goto_0
.end method

.method private static getHandleDrawable(Landroid/content/Context;[I)Landroid/graphics/drawable/Drawable;
    .locals 5
    .param p0, "context"    # Landroid/content/Context;
    .param p1, "attrs"    # [I

    .prologue
    const/4 v3, 0x0

    .line 48
    invoke-virtual {p0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v2

    invoke-virtual {v2, p1}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    move-result-object v0

    .line 49
    .local v0, "a":Landroid/content/res/TypedArray;
    invoke-virtual {v0, v3}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    .line 50
    .local v1, "drawable":Landroid/graphics/drawable/Drawable;
    if-nez v1, :cond_0

    .line 54
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v0, v3, v4}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v3

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;
    :try_end_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    .line 59
    :cond_0
    :goto_0
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 60
    return-object v1

    .line 55
    :catch_0
    move-exception v2

    goto :goto_0
.end method

.method private static getLeftHandleBitmap(Landroid/content/Context;)Landroid/graphics/Bitmap;
    .locals 1
    .param p0, "context"    # Landroid/content/Context;
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 98
    sget-object v0, Lorg/chromium/content/browser/input/HandleViewResources;->LEFT_HANDLE_ATTRS:[I

    invoke-static {p0, v0}, Lorg/chromium/content/browser/input/HandleViewResources;->getHandleBitmap(Landroid/content/Context;[I)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method

.method public static getLeftHandleDrawable(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;
    .locals 1
    .param p0, "context"    # Landroid/content/Context;

    .prologue
    .line 36
    sget-object v0, Lorg/chromium/content/browser/input/HandleViewResources;->LEFT_HANDLE_ATTRS:[I

    invoke-static {p0, v0}, Lorg/chromium/content/browser/input/HandleViewResources;->getHandleDrawable(Landroid/content/Context;[I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    return-object v0
.end method

.method private static getRightHandleBitmap(Landroid/content/Context;)Landroid/graphics/Bitmap;
    .locals 1
    .param p0, "context"    # Landroid/content/Context;
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 108
    sget-object v0, Lorg/chromium/content/browser/input/HandleViewResources;->RIGHT_HANDLE_ATTRS:[I

    invoke-static {p0, v0}, Lorg/chromium/content/browser/input/HandleViewResources;->getHandleBitmap(Landroid/content/Context;[I)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method

.method public static getRightHandleDrawable(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;
    .locals 1
    .param p0, "context"    # Landroid/content/Context;

    .prologue
    .line 44
    sget-object v0, Lorg/chromium/content/browser/input/HandleViewResources;->RIGHT_HANDLE_ATTRS:[I

    invoke-static {p0, v0}, Lorg/chromium/content/browser/input/HandleViewResources;->getHandleDrawable(Landroid/content/Context;[I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    return-object v0
.end method
