.class public Lcom/facebook/widget/images/zoomableimageview/b/a;
.super Landroid/graphics/drawable/Drawable;
.source "FastBitmapDrawable.java"


# instance fields
.field protected a:Landroid/graphics/Bitmap;

.field protected b:Landroid/graphics/Paint;


# direct methods
.method public constructor <init>(Landroid/graphics/Bitmap;)V
    .locals 2

    .prologue
    const/4 v1, 0x1

    .line 25
    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    .line 26
    iput-object p1, p0, Lcom/facebook/widget/images/zoomableimageview/b/a;->a:Landroid/graphics/Bitmap;

    .line 27
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/facebook/widget/images/zoomableimageview/b/a;->b:Landroid/graphics/Paint;

    .line 28
    iget-object v0, p0, Lcom/facebook/widget/images/zoomableimageview/b/a;->b:Landroid/graphics/Paint;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setDither(Z)V

    .line 29
    iget-object v0, p0, Lcom/facebook/widget/images/zoomableimageview/b/a;->b:Landroid/graphics/Paint;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setFilterBitmap(Z)V

    .line 30
    return-void
.end method


# virtual methods
.method public draw(Landroid/graphics/Canvas;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 38
    iget-object v0, p0, Lcom/facebook/widget/images/zoomableimageview/b/a;->a:Landroid/graphics/Bitmap;

    iget-object v1, p0, Lcom/facebook/widget/images/zoomableimageview/b/a;->b:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v2, v2, v1}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 39
    return-void
.end method

.method public getIntrinsicHeight()I
    .locals 1

    .prologue
    .line 63
    iget-object v0, p0, Lcom/facebook/widget/images/zoomableimageview/b/a;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v0

    return v0
.end method

.method public getIntrinsicWidth()I
    .locals 1

    .prologue
    .line 58
    iget-object v0, p0, Lcom/facebook/widget/images/zoomableimageview/b/a;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    return v0
.end method

.method public getMinimumHeight()I
    .locals 1

    .prologue
    .line 73
    iget-object v0, p0, Lcom/facebook/widget/images/zoomableimageview/b/a;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v0

    return v0
.end method

.method public getMinimumWidth()I
    .locals 1

    .prologue
    .line 68
    iget-object v0, p0, Lcom/facebook/widget/images/zoomableimageview/b/a;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    return v0
.end method

.method public getOpacity()I
    .locals 1

    .prologue
    .line 43
    const/4 v0, -0x3

    return v0
.end method

.method public setAlpha(I)V
    .locals 1

    .prologue
    .line 48
    iget-object v0, p0, Lcom/facebook/widget/images/zoomableimageview/b/a;->b:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 49
    return-void
.end method

.method public setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 1

    .prologue
    .line 53
    iget-object v0, p0, Lcom/facebook/widget/images/zoomableimageview/b/a;->b:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    .line 54
    return-void
.end method
