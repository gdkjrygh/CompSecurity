.class public Lcom/facebook/widget/images/zoomableimageview/d;
.super Landroid/view/ScaleGestureDetector$SimpleOnScaleGestureListener;
.source "ImageViewTouch.java"


# instance fields
.field final synthetic a:Lcom/facebook/widget/images/zoomableimageview/a;


# direct methods
.method public constructor <init>(Lcom/facebook/widget/images/zoomableimageview/a;)V
    .locals 0

    .prologue
    .line 238
    iput-object p1, p0, Lcom/facebook/widget/images/zoomableimageview/d;->a:Lcom/facebook/widget/images/zoomableimageview/a;

    invoke-direct {p0}, Landroid/view/ScaleGestureDetector$SimpleOnScaleGestureListener;-><init>()V

    return-void
.end method


# virtual methods
.method public onScale(Landroid/view/ScaleGestureDetector;)Z
    .locals 6

    .prologue
    const/4 v0, 0x1

    .line 243
    const-string v1, "image"

    const-string v2, "onScale"

    invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 244
    invoke-virtual {p1}, Landroid/view/ScaleGestureDetector;->getCurrentSpan()F

    move-result v1

    invoke-virtual {p1}, Landroid/view/ScaleGestureDetector;->getPreviousSpan()F

    move-result v2

    sub-float/2addr v1, v2

    .line 245
    iget-object v1, p0, Lcom/facebook/widget/images/zoomableimageview/d;->a:Lcom/facebook/widget/images/zoomableimageview/a;

    iget v1, v1, Lcom/facebook/widget/images/zoomableimageview/a;->d:F

    invoke-virtual {p1}, Landroid/view/ScaleGestureDetector;->getScaleFactor()F

    move-result v2

    mul-float/2addr v1, v2

    .line 246
    iget-object v2, p0, Lcom/facebook/widget/images/zoomableimageview/d;->a:Lcom/facebook/widget/images/zoomableimageview/a;

    iget-boolean v2, v2, Lcom/facebook/widget/images/zoomableimageview/a;->j:Z

    if-eqz v2, :cond_0

    .line 247
    iget-object v2, p0, Lcom/facebook/widget/images/zoomableimageview/d;->a:Lcom/facebook/widget/images/zoomableimageview/a;

    invoke-virtual {v2}, Lcom/facebook/widget/images/zoomableimageview/a;->getMaxZoom()F

    move-result v2

    iget-object v3, p0, Lcom/facebook/widget/images/zoomableimageview/d;->a:Lcom/facebook/widget/images/zoomableimageview/a;

    invoke-virtual {v3}, Lcom/facebook/widget/images/zoomableimageview/a;->getMinZoom()F

    move-result v3

    const v4, 0x3dcccccd    # 0.1f

    sub-float/2addr v3, v4

    invoke-static {v1, v3}, Ljava/lang/Math;->max(FF)F

    move-result v1

    invoke-static {v2, v1}, Ljava/lang/Math;->min(FF)F

    move-result v1

    .line 248
    iget-object v2, p0, Lcom/facebook/widget/images/zoomableimageview/d;->a:Lcom/facebook/widget/images/zoomableimageview/a;

    invoke-virtual {p1}, Landroid/view/ScaleGestureDetector;->getFocusX()F

    move-result v3

    invoke-virtual {p1}, Landroid/view/ScaleGestureDetector;->getFocusY()F

    move-result v4

    invoke-virtual {v2, v1, v3, v4}, Lcom/facebook/widget/images/zoomableimageview/a;->b(FFF)V

    .line 249
    iget-object v2, p0, Lcom/facebook/widget/images/zoomableimageview/d;->a:Lcom/facebook/widget/images/zoomableimageview/a;

    iget-object v3, p0, Lcom/facebook/widget/images/zoomableimageview/d;->a:Lcom/facebook/widget/images/zoomableimageview/a;

    invoke-virtual {v3}, Lcom/facebook/widget/images/zoomableimageview/a;->getMaxZoom()F

    move-result v3

    iget-object v4, p0, Lcom/facebook/widget/images/zoomableimageview/d;->a:Lcom/facebook/widget/images/zoomableimageview/a;

    invoke-virtual {v4}, Lcom/facebook/widget/images/zoomableimageview/a;->getMinZoom()F

    move-result v4

    const/high16 v5, 0x3f800000    # 1.0f

    sub-float/2addr v4, v5

    invoke-static {v1, v4}, Ljava/lang/Math;->max(FF)F

    move-result v1

    invoke-static {v3, v1}, Ljava/lang/Math;->min(FF)F

    move-result v1

    iput v1, v2, Lcom/facebook/widget/images/zoomableimageview/a;->d:F

    .line 250
    iget-object v1, p0, Lcom/facebook/widget/images/zoomableimageview/d;->a:Lcom/facebook/widget/images/zoomableimageview/a;

    iput v0, v1, Lcom/facebook/widget/images/zoomableimageview/a;->f:I

    .line 251
    iget-object v1, p0, Lcom/facebook/widget/images/zoomableimageview/d;->a:Lcom/facebook/widget/images/zoomableimageview/a;

    invoke-virtual {v1}, Lcom/facebook/widget/images/zoomableimageview/a;->invalidate()V

    .line 254
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
