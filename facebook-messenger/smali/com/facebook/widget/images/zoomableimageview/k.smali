.class public Lcom/facebook/widget/images/zoomableimageview/k;
.super Lcom/facebook/widget/images/zoomableimageview/d;
.source "ZoomableImageView.java"


# instance fields
.field final synthetic b:Lcom/facebook/widget/images/zoomableimageview/ZoomableImageView;


# direct methods
.method public constructor <init>(Lcom/facebook/widget/images/zoomableimageview/ZoomableImageView;)V
    .locals 0

    .prologue
    .line 310
    iput-object p1, p0, Lcom/facebook/widget/images/zoomableimageview/k;->b:Lcom/facebook/widget/images/zoomableimageview/ZoomableImageView;

    invoke-direct {p0, p1}, Lcom/facebook/widget/images/zoomableimageview/d;-><init>(Lcom/facebook/widget/images/zoomableimageview/a;)V

    return-void
.end method


# virtual methods
.method public onScale(Landroid/view/ScaleGestureDetector;)Z
    .locals 4

    .prologue
    .line 314
    iget-object v0, p0, Lcom/facebook/widget/images/zoomableimageview/k;->b:Lcom/facebook/widget/images/zoomableimageview/ZoomableImageView;

    iget v0, v0, Lcom/facebook/widget/images/zoomableimageview/ZoomableImageView;->d:F

    invoke-virtual {p1}, Landroid/view/ScaleGestureDetector;->getScaleFactor()F

    move-result v1

    mul-float/2addr v0, v1

    .line 315
    iget-object v1, p0, Lcom/facebook/widget/images/zoomableimageview/k;->b:Lcom/facebook/widget/images/zoomableimageview/ZoomableImageView;

    iget-boolean v1, v1, Lcom/facebook/widget/images/zoomableimageview/ZoomableImageView;->j:Z

    if-eqz v1, :cond_0

    .line 316
    iget-object v1, p0, Lcom/facebook/widget/images/zoomableimageview/k;->b:Lcom/facebook/widget/images/zoomableimageview/ZoomableImageView;

    invoke-virtual {v1}, Lcom/facebook/widget/images/zoomableimageview/ZoomableImageView;->getMaxZoom()F

    move-result v1

    iget-object v2, p0, Lcom/facebook/widget/images/zoomableimageview/k;->b:Lcom/facebook/widget/images/zoomableimageview/ZoomableImageView;

    invoke-virtual {v2}, Lcom/facebook/widget/images/zoomableimageview/ZoomableImageView;->getMinZoom()F

    move-result v2

    invoke-static {v0, v2}, Ljava/lang/Math;->max(FF)F

    move-result v0

    invoke-static {v1, v0}, Ljava/lang/Math;->min(FF)F

    move-result v0

    .line 317
    iget-object v1, p0, Lcom/facebook/widget/images/zoomableimageview/k;->b:Lcom/facebook/widget/images/zoomableimageview/ZoomableImageView;

    invoke-virtual {p1}, Landroid/view/ScaleGestureDetector;->getFocusX()F

    move-result v2

    invoke-virtual {p1}, Landroid/view/ScaleGestureDetector;->getFocusY()F

    move-result v3

    invoke-virtual {v1, v0, v2, v3}, Lcom/facebook/widget/images/zoomableimageview/ZoomableImageView;->b(FFF)V

    .line 318
    iget-object v1, p0, Lcom/facebook/widget/images/zoomableimageview/k;->b:Lcom/facebook/widget/images/zoomableimageview/ZoomableImageView;

    iget-object v2, p0, Lcom/facebook/widget/images/zoomableimageview/k;->b:Lcom/facebook/widget/images/zoomableimageview/ZoomableImageView;

    invoke-virtual {v2}, Lcom/facebook/widget/images/zoomableimageview/ZoomableImageView;->getMaxZoom()F

    move-result v2

    iget-object v3, p0, Lcom/facebook/widget/images/zoomableimageview/k;->b:Lcom/facebook/widget/images/zoomableimageview/ZoomableImageView;

    invoke-virtual {v3}, Lcom/facebook/widget/images/zoomableimageview/ZoomableImageView;->getMinZoom()F

    move-result v3

    invoke-static {v0, v3}, Ljava/lang/Math;->max(FF)F

    move-result v0

    invoke-static {v2, v0}, Ljava/lang/Math;->min(FF)F

    move-result v0

    iput v0, v1, Lcom/facebook/widget/images/zoomableimageview/ZoomableImageView;->d:F

    .line 319
    iget-object v0, p0, Lcom/facebook/widget/images/zoomableimageview/k;->b:Lcom/facebook/widget/images/zoomableimageview/ZoomableImageView;

    const/4 v1, -0x1

    iput v1, v0, Lcom/facebook/widget/images/zoomableimageview/ZoomableImageView;->f:I

    .line 320
    iget-object v0, p0, Lcom/facebook/widget/images/zoomableimageview/k;->b:Lcom/facebook/widget/images/zoomableimageview/ZoomableImageView;

    invoke-virtual {v0}, Lcom/facebook/widget/images/zoomableimageview/ZoomableImageView;->invalidate()V

    .line 321
    const/4 v0, 0x1

    .line 323
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
