.class public Lcom/facebook/widget/images/zoomableimageview/j;
.super Lcom/facebook/widget/images/zoomableimageview/b;
.source "ZoomableImageView.java"


# instance fields
.field final synthetic b:Lcom/facebook/widget/images/zoomableimageview/ZoomableImageView;


# direct methods
.method public constructor <init>(Lcom/facebook/widget/images/zoomableimageview/ZoomableImageView;)V
    .locals 0

    .prologue
    .line 284
    iput-object p1, p0, Lcom/facebook/widget/images/zoomableimageview/j;->b:Lcom/facebook/widget/images/zoomableimageview/ZoomableImageView;

    invoke-direct {p0, p1}, Lcom/facebook/widget/images/zoomableimageview/b;-><init>(Lcom/facebook/widget/images/zoomableimageview/a;)V

    return-void
.end method


# virtual methods
.method public onLongPress(Landroid/view/MotionEvent;)V
    .locals 3

    .prologue
    .line 299
    iget-object v0, p0, Lcom/facebook/widget/images/zoomableimageview/j;->b:Lcom/facebook/widget/images/zoomableimageview/ZoomableImageView;

    invoke-static {v0}, Lcom/facebook/widget/images/zoomableimageview/ZoomableImageView;->a(Lcom/facebook/widget/images/zoomableimageview/ZoomableImageView;)Lcom/facebook/widget/images/zoomableimageview/l;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 300
    iget-object v0, p0, Lcom/facebook/widget/images/zoomableimageview/j;->b:Lcom/facebook/widget/images/zoomableimageview/ZoomableImageView;

    iget-object v0, v0, Lcom/facebook/widget/images/zoomableimageview/ZoomableImageView;->a:Landroid/view/ScaleGestureDetector;

    invoke-virtual {v0}, Landroid/view/ScaleGestureDetector;->isInProgress()Z

    move-result v0

    if-nez v0, :cond_0

    .line 301
    new-instance v0, Landroid/graphics/PointF;

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v2

    invoke-direct {v0, v1, v2}, Landroid/graphics/PointF;-><init>(FF)V

    .line 302
    iget-object v1, p0, Lcom/facebook/widget/images/zoomableimageview/j;->b:Lcom/facebook/widget/images/zoomableimageview/ZoomableImageView;

    invoke-static {v1}, Lcom/facebook/widget/images/zoomableimageview/ZoomableImageView;->a(Lcom/facebook/widget/images/zoomableimageview/ZoomableImageView;)Lcom/facebook/widget/images/zoomableimageview/l;

    move-result-object v1

    iget-object v2, p0, Lcom/facebook/widget/images/zoomableimageview/j;->b:Lcom/facebook/widget/images/zoomableimageview/ZoomableImageView;

    invoke-static {v2, v0}, Lcom/facebook/widget/images/zoomableimageview/ZoomableImageView;->a(Lcom/facebook/widget/images/zoomableimageview/ZoomableImageView;Landroid/graphics/PointF;)Landroid/graphics/PointF;

    move-result-object v2

    invoke-interface {v1, v0, v2}, Lcom/facebook/widget/images/zoomableimageview/l;->b(Landroid/graphics/PointF;Landroid/graphics/PointF;)V

    .line 305
    :cond_0
    invoke-super {p0, p1}, Lcom/facebook/widget/images/zoomableimageview/b;->onLongPress(Landroid/view/MotionEvent;)V

    .line 307
    :cond_1
    return-void
.end method

.method public onSingleTapConfirmed(Landroid/view/MotionEvent;)Z
    .locals 3

    .prologue
    .line 288
    iget-object v0, p0, Lcom/facebook/widget/images/zoomableimageview/j;->b:Lcom/facebook/widget/images/zoomableimageview/ZoomableImageView;

    invoke-static {v0}, Lcom/facebook/widget/images/zoomableimageview/ZoomableImageView;->a(Lcom/facebook/widget/images/zoomableimageview/ZoomableImageView;)Lcom/facebook/widget/images/zoomableimageview/l;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 290
    new-instance v0, Landroid/graphics/PointF;

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v2

    invoke-direct {v0, v1, v2}, Landroid/graphics/PointF;-><init>(FF)V

    .line 291
    iget-object v1, p0, Lcom/facebook/widget/images/zoomableimageview/j;->b:Lcom/facebook/widget/images/zoomableimageview/ZoomableImageView;

    invoke-static {v1}, Lcom/facebook/widget/images/zoomableimageview/ZoomableImageView;->a(Lcom/facebook/widget/images/zoomableimageview/ZoomableImageView;)Lcom/facebook/widget/images/zoomableimageview/l;

    move-result-object v1

    iget-object v2, p0, Lcom/facebook/widget/images/zoomableimageview/j;->b:Lcom/facebook/widget/images/zoomableimageview/ZoomableImageView;

    invoke-static {v2, v0}, Lcom/facebook/widget/images/zoomableimageview/ZoomableImageView;->a(Lcom/facebook/widget/images/zoomableimageview/ZoomableImageView;Landroid/graphics/PointF;)Landroid/graphics/PointF;

    move-result-object v2

    invoke-interface {v1, v0, v2}, Lcom/facebook/widget/images/zoomableimageview/l;->a(Landroid/graphics/PointF;Landroid/graphics/PointF;)V

    .line 294
    :cond_0
    invoke-super {p0, p1}, Lcom/facebook/widget/images/zoomableimageview/b;->onSingleTapConfirmed(Landroid/view/MotionEvent;)Z

    move-result v0

    return v0
.end method
