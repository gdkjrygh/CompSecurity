.class public Lcom/facebook/widget/images/zoomableimageview/ZoomableImageView;
.super Lcom/facebook/widget/images/zoomableimageview/a;
.source "ZoomableImageView.java"


# instance fields
.field private C:Z

.field private D:Z

.field private E:Lcom/facebook/widget/images/zoomableimageview/l;

.field private F:Lcom/facebook/widget/images/zoomableimageview/m;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    const/4 v0, 0x1

    .line 25
    invoke-direct {p0, p1, p2}, Lcom/facebook/widget/images/zoomableimageview/a;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 19
    iput-boolean v0, p0, Lcom/facebook/widget/images/zoomableimageview/ZoomableImageView;->C:Z

    .line 20
    iput-boolean v0, p0, Lcom/facebook/widget/images/zoomableimageview/ZoomableImageView;->D:Z

    .line 26
    invoke-virtual {p0, v0}, Lcom/facebook/widget/images/zoomableimageview/ZoomableImageView;->setFitToScreen(Z)V

    .line 27
    return-void
.end method

.method private a(Landroid/graphics/PointF;)Landroid/graphics/PointF;
    .locals 5

    .prologue
    .line 274
    invoke-virtual {p0}, Lcom/facebook/widget/images/zoomableimageview/ZoomableImageView;->getBitmapRect()Landroid/graphics/RectF;

    move-result-object v1

    .line 275
    if-eqz v1, :cond_0

    iget v0, p1, Landroid/graphics/PointF;->x:F

    iget v2, p1, Landroid/graphics/PointF;->y:F

    invoke-virtual {v1, v0, v2}, Landroid/graphics/RectF;->contains(FF)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 276
    new-instance v0, Landroid/graphics/PointF;

    iget v2, p1, Landroid/graphics/PointF;->x:F

    iget v3, v1, Landroid/graphics/RectF;->left:F

    sub-float/2addr v2, v3

    invoke-virtual {v1}, Landroid/graphics/RectF;->width()F

    move-result v3

    div-float/2addr v2, v3

    iget v3, p1, Landroid/graphics/PointF;->y:F

    iget v4, v1, Landroid/graphics/RectF;->top:F

    sub-float/2addr v3, v4

    invoke-virtual {v1}, Landroid/graphics/RectF;->height()F

    move-result v1

    div-float v1, v3, v1

    invoke-direct {v0, v2, v1}, Landroid/graphics/PointF;-><init>(FF)V

    .line 280
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method static synthetic a(Lcom/facebook/widget/images/zoomableimageview/ZoomableImageView;Landroid/graphics/PointF;)Landroid/graphics/PointF;
    .locals 1

    .prologue
    .line 15
    invoke-direct {p0, p1}, Lcom/facebook/widget/images/zoomableimageview/ZoomableImageView;->a(Landroid/graphics/PointF;)Landroid/graphics/PointF;

    move-result-object v0

    return-object v0
.end method

.method static synthetic a(Lcom/facebook/widget/images/zoomableimageview/ZoomableImageView;)Lcom/facebook/widget/images/zoomableimageview/l;
    .locals 1

    .prologue
    .line 15
    iget-object v0, p0, Lcom/facebook/widget/images/zoomableimageview/ZoomableImageView;->E:Lcom/facebook/widget/images/zoomableimageview/l;

    return-object v0
.end method

.method private d()Z
    .locals 1

    .prologue
    .line 117
    iget-boolean v0, p0, Lcom/facebook/widget/images/zoomableimageview/ZoomableImageView;->D:Z

    return v0
.end method


# virtual methods
.method protected a(FF)F
    .locals 2

    .prologue
    const/4 v1, 0x1

    .line 81
    iget v0, p0, Lcom/facebook/widget/images/zoomableimageview/ZoomableImageView;->f:I

    if-ne v0, v1, :cond_0

    .line 82
    const/4 v0, -0x1

    iput v0, p0, Lcom/facebook/widget/images/zoomableimageview/ZoomableImageView;->f:I

    .line 86
    :goto_0
    return p2

    .line 85
    :cond_0
    iput v1, p0, Lcom/facebook/widget/images/zoomableimageview/ZoomableImageView;->f:I

    .line 86
    const/high16 p2, 0x3f800000    # 1.0f

    goto :goto_0
.end method

.method protected a(FFFF)V
    .locals 1

    .prologue
    .line 166
    const/high16 v0, 0x43480000    # 200.0f

    cmpl-float v0, p4, v0

    if-nez v0, :cond_0

    .line 167
    const/high16 p4, 0x43c80000    # 400.0f

    .line 169
    :cond_0
    invoke-super {p0, p1, p2, p3, p4}, Lcom/facebook/widget/images/zoomableimageview/a;->a(FFFF)V

    .line 170
    return-void
.end method

.method protected a(Landroid/graphics/RectF;Landroid/graphics/RectF;)V
    .locals 1

    .prologue
    .line 239
    if-eqz p1, :cond_0

    invoke-direct {p0}, Lcom/facebook/widget/images/zoomableimageview/ZoomableImageView;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 240
    invoke-super {p0, p1, p2}, Lcom/facebook/widget/images/zoomableimageview/a;->a(Landroid/graphics/RectF;Landroid/graphics/RectF;)V

    .line 242
    :cond_0
    return-void
.end method

.method protected a(ZZ)V
    .locals 1

    .prologue
    .line 246
    invoke-direct {p0}, Lcom/facebook/widget/images/zoomableimageview/ZoomableImageView;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 247
    invoke-super {p0, p1, p2}, Lcom/facebook/widget/images/zoomableimageview/a;->a(ZZ)V

    .line 249
    :cond_0
    return-void
.end method

.method protected b()F
    .locals 3

    .prologue
    .line 67
    invoke-virtual {p0}, Lcom/facebook/widget/images/zoomableimageview/ZoomableImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 69
    if-nez v0, :cond_0

    .line 70
    const/high16 v0, 0x3f800000    # 1.0f

    .line 76
    :goto_0
    return v0

    .line 73
    :cond_0
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v1

    int-to-float v1, v1

    iget v2, p0, Lcom/facebook/widget/images/zoomableimageview/ZoomableImageView;->u:I

    int-to-float v2, v2

    div-float/2addr v1, v2

    .line 74
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v0

    int-to-float v0, v0

    iget v2, p0, Lcom/facebook/widget/images/zoomableimageview/ZoomableImageView;->v:I

    int-to-float v2, v2

    div-float/2addr v0, v2

    .line 75
    invoke-static {v1, v0}, Ljava/lang/Math;->max(FF)F

    move-result v0

    const/high16 v1, 0x40400000    # 3.0f

    mul-float/2addr v0, v1

    .line 76
    goto :goto_0
.end method

.method protected b(F)V
    .locals 1

    .prologue
    .line 138
    iget-object v0, p0, Lcom/facebook/widget/images/zoomableimageview/ZoomableImageView;->a:Landroid/view/ScaleGestureDetector;

    invoke-virtual {v0}, Landroid/view/ScaleGestureDetector;->isInProgress()Z

    move-result v0

    if-nez v0, :cond_0

    .line 139
    iput p1, p0, Lcom/facebook/widget/images/zoomableimageview/ZoomableImageView;->d:F

    .line 141
    :cond_0
    return-void
.end method

.method public c(F)V
    .locals 1

    .prologue
    .line 145
    invoke-super {p0, p1}, Lcom/facebook/widget/images/zoomableimageview/a;->c(F)V

    .line 150
    const/4 v0, 0x1

    iput v0, p0, Lcom/facebook/widget/images/zoomableimageview/ZoomableImageView;->f:I

    .line 151
    return-void
.end method

.method public getBaseMatrix()Landroid/graphics/Matrix;
    .locals 1

    .prologue
    .line 234
    iget-object v0, p0, Lcom/facebook/widget/images/zoomableimageview/ZoomableImageView;->m:Landroid/graphics/Matrix;

    return-object v0
.end method

.method public getBitmapHeight()I
    .locals 1

    .prologue
    .line 105
    invoke-virtual {p0}, Lcom/facebook/widget/images/zoomableimageview/ZoomableImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v0

    return v0
.end method

.method public getBitmapWidth()I
    .locals 1

    .prologue
    .line 101
    invoke-virtual {p0}, Lcom/facebook/widget/images/zoomableimageview/ZoomableImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v0

    return v0
.end method

.method protected getGestureListener()Landroid/view/GestureDetector$OnGestureListener;
    .locals 1

    .prologue
    .line 31
    new-instance v0, Lcom/facebook/widget/images/zoomableimageview/j;

    invoke-direct {v0, p0}, Lcom/facebook/widget/images/zoomableimageview/j;-><init>(Lcom/facebook/widget/images/zoomableimageview/ZoomableImageView;)V

    return-object v0
.end method

.method protected getScaleListener()Landroid/view/ScaleGestureDetector$OnScaleGestureListener;
    .locals 1

    .prologue
    .line 36
    new-instance v0, Lcom/facebook/widget/images/zoomableimageview/k;

    invoke-direct {v0, p0}, Lcom/facebook/widget/images/zoomableimageview/k;-><init>(Lcom/facebook/widget/images/zoomableimageview/ZoomableImageView;)V

    return-object v0
.end method

.method protected onLayout(ZIIII)V
    .locals 0

    .prologue
    .line 60
    if-eqz p1, :cond_0

    .line 61
    invoke-super/range {p0 .. p5}, Lcom/facebook/widget/images/zoomableimageview/a;->onLayout(ZIIII)V

    .line 63
    :cond_0
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .prologue
    .line 50
    iget-boolean v0, p0, Lcom/facebook/widget/images/zoomableimageview/ZoomableImageView;->C:Z

    if-eqz v0, :cond_1

    .line 51
    iget-object v0, p0, Lcom/facebook/widget/images/zoomableimageview/ZoomableImageView;->a:Landroid/view/ScaleGestureDetector;

    invoke-virtual {v0, p1}, Landroid/view/ScaleGestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 52
    iget-object v0, p0, Lcom/facebook/widget/images/zoomableimageview/ZoomableImageView;->a:Landroid/view/ScaleGestureDetector;

    invoke-virtual {v0}, Landroid/view/ScaleGestureDetector;->isInProgress()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/facebook/widget/images/zoomableimageview/ZoomableImageView;->b:Landroid/view/GestureDetector;

    invoke-virtual {v0, p1}, Landroid/view/GestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 53
    :cond_0
    const/4 v0, 0x1

    .line 55
    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public setImageMatrix(Landroid/graphics/Matrix;)V
    .locals 1

    .prologue
    .line 41
    invoke-super {p0, p1}, Lcom/facebook/widget/images/zoomableimageview/a;->setImageMatrix(Landroid/graphics/Matrix;)V

    .line 43
    iget-object v0, p0, Lcom/facebook/widget/images/zoomableimageview/ZoomableImageView;->E:Lcom/facebook/widget/images/zoomableimageview/l;

    if-eqz v0, :cond_0

    .line 44
    iget-object v0, p0, Lcom/facebook/widget/images/zoomableimageview/ZoomableImageView;->E:Lcom/facebook/widget/images/zoomableimageview/l;

    invoke-interface {v0, p1}, Lcom/facebook/widget/images/zoomableimageview/l;->a(Landroid/graphics/Matrix;)V

    .line 46
    :cond_0
    return-void
.end method

.method public setMinZoom(F)V
    .locals 1

    .prologue
    .line 97
    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lcom/facebook/widget/images/zoomableimageview/ZoomableImageView;->r:F

    .line 98
    return-void
.end method

.method public setZoomAndPanListener(Lcom/facebook/widget/images/zoomableimageview/m;)V
    .locals 0

    .prologue
    .line 265
    iput-object p1, p0, Lcom/facebook/widget/images/zoomableimageview/ZoomableImageView;->F:Lcom/facebook/widget/images/zoomableimageview/m;

    .line 266
    return-void
.end method
