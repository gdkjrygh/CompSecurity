.class public Lcom/thetransitapp/droid/ui/ShadowImageView;
.super Landroid/widget/ImageView;
.source "ShadowImageView.java"


# instance fields
.field private cacheBitmap:Landroid/graphics/Bitmap;

.field private cachedDrawable:Landroid/graphics/drawable/Drawable;

.field private colorFilter:Landroid/graphics/ColorFilter;

.field private paddingSet:Z

.field private pressedColorFilter:Landroid/graphics/ColorFilter;

.field private shadowColorFilter:Landroid/graphics/ColorFilter;

.field private shadowDx:F

.field private shadowDy:F


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    const/4 v0, 0x0

    .line 27
    invoke-direct {p0, p1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 15
    iput-object v0, p0, Lcom/thetransitapp/droid/ui/ShadowImageView;->colorFilter:Landroid/graphics/ColorFilter;

    .line 16
    iput-object v0, p0, Lcom/thetransitapp/droid/ui/ShadowImageView;->shadowColorFilter:Landroid/graphics/ColorFilter;

    .line 17
    iput-object v0, p0, Lcom/thetransitapp/droid/ui/ShadowImageView;->pressedColorFilter:Landroid/graphics/ColorFilter;

    .line 28
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;

    .prologue
    const/4 v0, 0x0

    .line 31
    invoke-direct {p0, p1, p2}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 15
    iput-object v0, p0, Lcom/thetransitapp/droid/ui/ShadowImageView;->colorFilter:Landroid/graphics/ColorFilter;

    .line 16
    iput-object v0, p0, Lcom/thetransitapp/droid/ui/ShadowImageView;->shadowColorFilter:Landroid/graphics/ColorFilter;

    .line 17
    iput-object v0, p0, Lcom/thetransitapp/droid/ui/ShadowImageView;->pressedColorFilter:Landroid/graphics/ColorFilter;

    .line 32
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;
    .param p3, "defStyle"    # I

    .prologue
    const/4 v0, 0x0

    .line 35
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 15
    iput-object v0, p0, Lcom/thetransitapp/droid/ui/ShadowImageView;->colorFilter:Landroid/graphics/ColorFilter;

    .line 16
    iput-object v0, p0, Lcom/thetransitapp/droid/ui/ShadowImageView;->shadowColorFilter:Landroid/graphics/ColorFilter;

    .line 17
    iput-object v0, p0, Lcom/thetransitapp/droid/ui/ShadowImageView;->pressedColorFilter:Landroid/graphics/ColorFilter;

    .line 36
    return-void
.end method


# virtual methods
.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 6
    .param p1, "canvas"    # Landroid/graphics/Canvas;

    .prologue
    const/4 v3, 0x0

    .line 40
    invoke-virtual {p0}, Lcom/thetransitapp/droid/ui/ShadowImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    .line 42
    .local v1, "drawable":Landroid/graphics/drawable/Drawable;
    if-eqz v1, :cond_3

    .line 43
    iget-object v2, p0, Lcom/thetransitapp/droid/ui/ShadowImageView;->cacheBitmap:Landroid/graphics/Bitmap;

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/thetransitapp/droid/ui/ShadowImageView;->cachedDrawable:Landroid/graphics/drawable/Drawable;

    if-eq v2, v1, :cond_2

    .line 44
    :cond_0
    invoke-super {p0}, Landroid/widget/ImageView;->getWidth()I

    move-result v2

    invoke-super {p0}, Landroid/widget/ImageView;->getHeight()I

    move-result v4

    sget-object v5, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v2, v4, v5}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v2

    iput-object v2, p0, Lcom/thetransitapp/droid/ui/ShadowImageView;->cacheBitmap:Landroid/graphics/Bitmap;

    .line 45
    new-instance v0, Landroid/graphics/Canvas;

    iget-object v2, p0, Lcom/thetransitapp/droid/ui/ShadowImageView;->cacheBitmap:Landroid/graphics/Bitmap;

    invoke-direct {v0, v2}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 47
    .local v0, "can":Landroid/graphics/Canvas;
    iget-object v2, p0, Lcom/thetransitapp/droid/ui/ShadowImageView;->shadowColorFilter:Landroid/graphics/ColorFilter;

    if-eqz v2, :cond_1

    .line 48
    invoke-virtual {p0}, Lcom/thetransitapp/droid/ui/ShadowImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v2

    iget-object v4, p0, Lcom/thetransitapp/droid/ui/ShadowImageView;->shadowColorFilter:Landroid/graphics/ColorFilter;

    invoke-virtual {v2, v4}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    .line 49
    iget v2, p0, Lcom/thetransitapp/droid/ui/ShadowImageView;->shadowDx:F

    cmpl-float v2, v2, v3

    if-lez v2, :cond_4

    iget v2, p0, Lcom/thetransitapp/droid/ui/ShadowImageView;->shadowDx:F

    :goto_0
    iget v4, p0, Lcom/thetransitapp/droid/ui/ShadowImageView;->shadowDy:F

    cmpl-float v4, v4, v3

    if-lez v4, :cond_5

    iget v4, p0, Lcom/thetransitapp/droid/ui/ShadowImageView;->shadowDy:F

    :goto_1
    invoke-virtual {v0, v2, v4}, Landroid/graphics/Canvas;->translate(FF)V

    .line 50
    invoke-super {p0, v0}, Landroid/widget/ImageView;->onDraw(Landroid/graphics/Canvas;)V

    .line 51
    iget v2, p0, Lcom/thetransitapp/droid/ui/ShadowImageView;->shadowDx:F

    neg-float v2, v2

    iget v4, p0, Lcom/thetransitapp/droid/ui/ShadowImageView;->shadowDy:F

    neg-float v4, v4

    invoke-virtual {v0, v2, v4}, Landroid/graphics/Canvas;->translate(FF)V

    .line 54
    :cond_1
    invoke-virtual {p0}, Lcom/thetransitapp/droid/ui/ShadowImageView;->isPressed()Z

    move-result v2

    if-eqz v2, :cond_6

    iget-object v2, p0, Lcom/thetransitapp/droid/ui/ShadowImageView;->pressedColorFilter:Landroid/graphics/ColorFilter;

    if-eqz v2, :cond_6

    .line 55
    invoke-virtual {p0}, Lcom/thetransitapp/droid/ui/ShadowImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v2

    iget-object v4, p0, Lcom/thetransitapp/droid/ui/ShadowImageView;->pressedColorFilter:Landroid/graphics/ColorFilter;

    invoke-virtual {v2, v4}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    .line 60
    :goto_2
    invoke-super {p0, v0}, Landroid/widget/ImageView;->onDraw(Landroid/graphics/Canvas;)V

    .line 61
    iput-object v1, p0, Lcom/thetransitapp/droid/ui/ShadowImageView;->cachedDrawable:Landroid/graphics/drawable/Drawable;

    .line 64
    .end local v0    # "can":Landroid/graphics/Canvas;
    :cond_2
    iget-object v2, p0, Lcom/thetransitapp/droid/ui/ShadowImageView;->cacheBitmap:Landroid/graphics/Bitmap;

    const/4 v4, 0x0

    invoke-virtual {p1, v2, v3, v3, v4}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 66
    :cond_3
    return-void

    .restart local v0    # "can":Landroid/graphics/Canvas;
    :cond_4
    move v2, v3

    .line 49
    goto :goto_0

    :cond_5
    move v4, v3

    goto :goto_1

    .line 57
    :cond_6
    invoke-virtual {p0}, Lcom/thetransitapp/droid/ui/ShadowImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v2

    iget-object v4, p0, Lcom/thetransitapp/droid/ui/ShadowImageView;->colorFilter:Landroid/graphics/ColorFilter;

    invoke-virtual {v2, v4}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    goto :goto_2
.end method

.method public setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 1
    .param p1, "cf"    # Landroid/graphics/ColorFilter;

    .prologue
    .line 70
    iput-object p1, p0, Lcom/thetransitapp/droid/ui/ShadowImageView;->colorFilter:Landroid/graphics/ColorFilter;

    .line 71
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/thetransitapp/droid/ui/ShadowImageView;->cacheBitmap:Landroid/graphics/Bitmap;

    .line 73
    invoke-virtual {p0}, Lcom/thetransitapp/droid/ui/ShadowImageView;->invalidate()V

    .line 74
    return-void
.end method

.method public setPressedColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 1
    .param p1, "cf"    # Landroid/graphics/ColorFilter;

    .prologue
    .line 77
    iput-object p1, p0, Lcom/thetransitapp/droid/ui/ShadowImageView;->pressedColorFilter:Landroid/graphics/ColorFilter;

    .line 78
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/thetransitapp/droid/ui/ShadowImageView;->cacheBitmap:Landroid/graphics/Bitmap;

    .line 80
    invoke-virtual {p0}, Lcom/thetransitapp/droid/ui/ShadowImageView;->invalidate()V

    .line 81
    return-void
.end method

.method public setShadowLayer(FFFI)V
    .locals 5
    .param p1, "radius"    # F
    .param p2, "dx"    # F
    .param p3, "dy"    # F
    .param p4, "color"    # I

    .prologue
    .line 84
    new-instance v0, Landroid/graphics/PorterDuffColorFilter;

    sget-object v1, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v0, p4, v1}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    iput-object v0, p0, Lcom/thetransitapp/droid/ui/ShadowImageView;->shadowColorFilter:Landroid/graphics/ColorFilter;

    .line 86
    iput p2, p0, Lcom/thetransitapp/droid/ui/ShadowImageView;->shadowDx:F

    .line 87
    iput p3, p0, Lcom/thetransitapp/droid/ui/ShadowImageView;->shadowDy:F

    .line 89
    iget-boolean v0, p0, Lcom/thetransitapp/droid/ui/ShadowImageView;->paddingSet:Z

    if-nez v0, :cond_0

    .line 90
    invoke-super {p0}, Landroid/widget/ImageView;->getPaddingLeft()I

    move-result v0

    invoke-super {p0}, Landroid/widget/ImageView;->getPaddingTop()I

    move-result v1

    .line 91
    invoke-super {p0}, Landroid/widget/ImageView;->getPaddingRight()I

    move-result v2

    int-to-float v2, v2

    iget v3, p0, Lcom/thetransitapp/droid/ui/ShadowImageView;->shadowDx:F

    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    move-result v3

    add-float/2addr v2, v3

    float-to-int v2, v2

    .line 92
    invoke-super {p0}, Landroid/widget/ImageView;->getPaddingBottom()I

    move-result v3

    int-to-float v3, v3

    iget v4, p0, Lcom/thetransitapp/droid/ui/ShadowImageView;->shadowDy:F

    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    move-result v4

    add-float/2addr v3, v4

    float-to-int v3, v3

    .line 90
    invoke-super {p0, v0, v1, v2, v3}, Landroid/widget/ImageView;->setPadding(IIII)V

    .line 94
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/thetransitapp/droid/ui/ShadowImageView;->paddingSet:Z

    .line 97
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/thetransitapp/droid/ui/ShadowImageView;->cacheBitmap:Landroid/graphics/Bitmap;

    .line 98
    invoke-virtual {p0}, Lcom/thetransitapp/droid/ui/ShadowImageView;->invalidate()V

    .line 99
    return-void
.end method
