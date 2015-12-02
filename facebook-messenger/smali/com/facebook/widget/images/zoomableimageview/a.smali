.class public Lcom/facebook/widget/images/zoomableimageview/a;
.super Lcom/facebook/widget/images/zoomableimageview/e;
.source "ImageViewTouch.java"


# instance fields
.field private C:Lcom/facebook/widget/images/zoomableimageview/c;

.field protected a:Landroid/view/ScaleGestureDetector;

.field protected b:Landroid/view/GestureDetector;

.field protected c:I

.field protected d:F

.field protected e:F

.field protected f:I

.field protected g:Landroid/view/GestureDetector$OnGestureListener;

.field protected h:Landroid/view/ScaleGestureDetector$OnScaleGestureListener;

.field protected i:Z

.field protected j:Z

.field protected k:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    const/4 v0, 0x1

    .line 35
    invoke-direct {p0, p1, p2}, Lcom/facebook/widget/images/zoomableimageview/e;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 29
    iput-boolean v0, p0, Lcom/facebook/widget/images/zoomableimageview/a;->i:Z

    .line 30
    iput-boolean v0, p0, Lcom/facebook/widget/images/zoomableimageview/a;->j:Z

    .line 31
    iput-boolean v0, p0, Lcom/facebook/widget/images/zoomableimageview/a;->k:Z

    .line 36
    return-void
.end method

.method static synthetic a(Lcom/facebook/widget/images/zoomableimageview/a;)Lcom/facebook/widget/images/zoomableimageview/c;
    .locals 1

    .prologue
    .line 17
    iget-object v0, p0, Lcom/facebook/widget/images/zoomableimageview/a;->C:Lcom/facebook/widget/images/zoomableimageview/c;

    return-object v0
.end method


# virtual methods
.method protected a(FF)F
    .locals 2

    .prologue
    const/4 v1, 0x1

    .line 128
    iget v0, p0, Lcom/facebook/widget/images/zoomableimageview/a;->f:I

    if-ne v0, v1, :cond_1

    .line 129
    iget v0, p0, Lcom/facebook/widget/images/zoomableimageview/a;->e:F

    const/high16 v1, 0x40000000    # 2.0f

    mul-float/2addr v0, v1

    add-float/2addr v0, p1

    cmpg-float v0, v0, p2

    if-gtz v0, :cond_0

    .line 130
    iget v0, p0, Lcom/facebook/widget/images/zoomableimageview/a;->e:F

    add-float p2, p1, v0

    .line 137
    :goto_0
    return p2

    .line 132
    :cond_0
    const/4 v0, -0x1

    iput v0, p0, Lcom/facebook/widget/images/zoomableimageview/a;->f:I

    goto :goto_0

    .line 136
    :cond_1
    iput v1, p0, Lcom/facebook/widget/images/zoomableimageview/a;->f:I

    .line 137
    const/high16 p2, 0x3f800000    # 1.0f

    goto :goto_0
.end method

.method protected a()V
    .locals 5

    .prologue
    const/4 v4, 0x1

    .line 40
    invoke-super {p0}, Lcom/facebook/widget/images/zoomableimageview/e;->a()V

    .line 41
    invoke-virtual {p0}, Lcom/facebook/widget/images/zoomableimageview/a;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    move-result v0

    iput v0, p0, Lcom/facebook/widget/images/zoomableimageview/a;->c:I

    .line 42
    invoke-virtual {p0}, Lcom/facebook/widget/images/zoomableimageview/a;->getGestureListener()Landroid/view/GestureDetector$OnGestureListener;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/widget/images/zoomableimageview/a;->g:Landroid/view/GestureDetector$OnGestureListener;

    .line 43
    invoke-virtual {p0}, Lcom/facebook/widget/images/zoomableimageview/a;->getScaleListener()Landroid/view/ScaleGestureDetector$OnScaleGestureListener;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/widget/images/zoomableimageview/a;->h:Landroid/view/ScaleGestureDetector$OnScaleGestureListener;

    .line 45
    new-instance v0, Landroid/view/ScaleGestureDetector;

    invoke-virtual {p0}, Lcom/facebook/widget/images/zoomableimageview/a;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/facebook/widget/images/zoomableimageview/a;->h:Landroid/view/ScaleGestureDetector$OnScaleGestureListener;

    invoke-direct {v0, v1, v2}, Landroid/view/ScaleGestureDetector;-><init>(Landroid/content/Context;Landroid/view/ScaleGestureDetector$OnScaleGestureListener;)V

    iput-object v0, p0, Lcom/facebook/widget/images/zoomableimageview/a;->a:Landroid/view/ScaleGestureDetector;

    .line 46
    new-instance v0, Landroid/view/GestureDetector;

    invoke-virtual {p0}, Lcom/facebook/widget/images/zoomableimageview/a;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/facebook/widget/images/zoomableimageview/a;->g:Landroid/view/GestureDetector$OnGestureListener;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Landroid/view/GestureDetector;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;Landroid/os/Handler;Z)V

    iput-object v0, p0, Lcom/facebook/widget/images/zoomableimageview/a;->b:Landroid/view/GestureDetector;

    .line 48
    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lcom/facebook/widget/images/zoomableimageview/a;->d:F

    .line 49
    iput v4, p0, Lcom/facebook/widget/images/zoomableimageview/a;->f:I

    .line 50
    return-void
.end method

.method protected a(F)V
    .locals 1

    .prologue
    .line 113
    invoke-super {p0, p1}, Lcom/facebook/widget/images/zoomableimageview/e;->a(F)V

    .line 114
    iget-object v0, p0, Lcom/facebook/widget/images/zoomableimageview/a;->a:Landroid/view/ScaleGestureDetector;

    invoke-virtual {v0}, Landroid/view/ScaleGestureDetector;->isInProgress()Z

    move-result v0

    if-nez v0, :cond_0

    iput p1, p0, Lcom/facebook/widget/images/zoomableimageview/a;->d:F

    .line 115
    :cond_0
    return-void
.end method

.method protected a(Landroid/graphics/drawable/Drawable;)V
    .locals 2

    .prologue
    .line 82
    invoke-super {p0, p1}, Lcom/facebook/widget/images/zoomableimageview/e;->a(Landroid/graphics/drawable/Drawable;)V

    .line 84
    const/16 v0, 0x9

    new-array v0, v0, [F

    .line 85
    iget-object v1, p0, Lcom/facebook/widget/images/zoomableimageview/a;->n:Landroid/graphics/Matrix;

    invoke-virtual {v1, v0}, Landroid/graphics/Matrix;->getValues([F)V

    .line 86
    const/4 v1, 0x0

    aget v0, v0, v1

    iput v0, p0, Lcom/facebook/widget/images/zoomableimageview/a;->d:F

    .line 87
    return-void
.end method

.method protected a(Landroid/graphics/drawable/Drawable;ZLandroid/graphics/Matrix;F)V
    .locals 2

    .prologue
    .line 92
    invoke-super {p0, p1, p2, p3, p4}, Lcom/facebook/widget/images/zoomableimageview/e;->a(Landroid/graphics/drawable/Drawable;ZLandroid/graphics/Matrix;F)V

    .line 93
    invoke-virtual {p0}, Lcom/facebook/widget/images/zoomableimageview/a;->getMaxZoom()F

    move-result v0

    const/high16 v1, 0x40400000    # 3.0f

    div-float/2addr v0, v1

    iput v0, p0, Lcom/facebook/widget/images/zoomableimageview/a;->e:F

    .line 94
    return-void
.end method

.method public a(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
    .locals 4

    .prologue
    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 142
    iget-boolean v2, p0, Lcom/facebook/widget/images/zoomableimageview/a;->k:Z

    if-nez v2, :cond_1

    .line 152
    :cond_0
    :goto_0
    return v0

    .line 144
    :cond_1
    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    .line 145
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result v2

    if-gt v2, v1, :cond_0

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result v2

    if-gt v2, v1, :cond_0

    .line 146
    iget-object v2, p0, Lcom/facebook/widget/images/zoomableimageview/a;->a:Landroid/view/ScaleGestureDetector;

    invoke-virtual {v2}, Landroid/view/ScaleGestureDetector;->isInProgress()Z

    move-result v2

    if-nez v2, :cond_0

    .line 147
    invoke-virtual {p0}, Lcom/facebook/widget/images/zoomableimageview/a;->getScale()F

    move-result v2

    const/high16 v3, 0x3f800000    # 1.0f

    cmpl-float v2, v2, v3

    if-eqz v2, :cond_0

    .line 149
    const-string v0, "image"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onScroll: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p4}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 150
    neg-float v0, p3

    neg-float v2, p4

    invoke-virtual {p0, v0, v2}, Lcom/facebook/widget/images/zoomableimageview/a;->d(FF)V

    .line 151
    invoke-virtual {p0}, Lcom/facebook/widget/images/zoomableimageview/a;->invalidate()V

    move v0, v1

    .line 152
    goto :goto_0
.end method

.method protected b(F)V
    .locals 2

    .prologue
    .line 119
    invoke-super {p0, p1}, Lcom/facebook/widget/images/zoomableimageview/e;->b(F)V

    .line 120
    iget-object v0, p0, Lcom/facebook/widget/images/zoomableimageview/a;->a:Landroid/view/ScaleGestureDetector;

    invoke-virtual {v0}, Landroid/view/ScaleGestureDetector;->isInProgress()Z

    move-result v0

    if-nez v0, :cond_0

    iput p1, p0, Lcom/facebook/widget/images/zoomableimageview/a;->d:F

    .line 122
    :cond_0
    invoke-virtual {p0}, Lcom/facebook/widget/images/zoomableimageview/a;->getMinZoom()F

    move-result v0

    cmpg-float v0, p1, v0

    if-gez v0, :cond_1

    .line 123
    invoke-virtual {p0}, Lcom/facebook/widget/images/zoomableimageview/a;->getMinZoom()F

    move-result v0

    const/high16 v1, 0x42480000    # 50.0f

    invoke-virtual {p0, v0, v1}, Lcom/facebook/widget/images/zoomableimageview/a;->c(FF)V

    .line 125
    :cond_1
    return-void
.end method

.method public b(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
    .locals 7

    .prologue
    const/high16 v6, 0x44480000    # 800.0f

    const/high16 v5, 0x40000000    # 2.0f

    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 156
    iget-boolean v2, p0, Lcom/facebook/widget/images/zoomableimageview/a;->k:Z

    if-nez v2, :cond_1

    .line 169
    :cond_0
    :goto_0
    return v0

    .line 158
    :cond_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result v2

    if-gt v2, v1, :cond_0

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result v2

    if-gt v2, v1, :cond_0

    .line 159
    iget-object v2, p0, Lcom/facebook/widget/images/zoomableimageview/a;->a:Landroid/view/ScaleGestureDetector;

    invoke-virtual {v2}, Landroid/view/ScaleGestureDetector;->isInProgress()Z

    move-result v2

    if-nez v2, :cond_0

    .line 161
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result v2

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v3

    sub-float/2addr v2, v3

    .line 162
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result v3

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v4

    sub-float/2addr v3, v4

    .line 164
    invoke-static {p3}, Ljava/lang/Math;->abs(F)F

    move-result v4

    cmpl-float v4, v4, v6

    if-gtz v4, :cond_2

    invoke-static {p4}, Ljava/lang/Math;->abs(F)F

    move-result v4

    cmpl-float v4, v4, v6

    if-lez v4, :cond_0

    .line 165
    :cond_2
    div-float v0, v2, v5

    div-float v2, v3, v5

    const-wide v3, 0x4072c00000000000L    # 300.0

    invoke-virtual {p0, v0, v2, v3, v4}, Lcom/facebook/widget/images/zoomableimageview/a;->a(FFD)V

    .line 166
    invoke-virtual {p0}, Lcom/facebook/widget/images/zoomableimageview/a;->invalidate()V

    move v0, v1

    .line 167
    goto :goto_0
.end method

.method public getDoubleTapEnabled()Z
    .locals 1

    .prologue
    .line 69
    iget-boolean v0, p0, Lcom/facebook/widget/images/zoomableimageview/a;->i:Z

    return v0
.end method

.method protected getGestureListener()Landroid/view/GestureDetector$OnGestureListener;
    .locals 1

    .prologue
    .line 73
    new-instance v0, Lcom/facebook/widget/images/zoomableimageview/b;

    invoke-direct {v0, p0}, Lcom/facebook/widget/images/zoomableimageview/b;-><init>(Lcom/facebook/widget/images/zoomableimageview/a;)V

    return-object v0
.end method

.method protected getScaleListener()Landroid/view/ScaleGestureDetector$OnScaleGestureListener;
    .locals 1

    .prologue
    .line 77
    new-instance v0, Lcom/facebook/widget/images/zoomableimageview/d;

    invoke-direct {v0, p0}, Lcom/facebook/widget/images/zoomableimageview/d;-><init>(Lcom/facebook/widget/images/zoomableimageview/a;)V

    return-object v0
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 2

    .prologue
    .line 98
    iget-object v0, p0, Lcom/facebook/widget/images/zoomableimageview/a;->a:Landroid/view/ScaleGestureDetector;

    invoke-virtual {v0, p1}, Landroid/view/ScaleGestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 99
    iget-object v0, p0, Lcom/facebook/widget/images/zoomableimageview/a;->a:Landroid/view/ScaleGestureDetector;

    invoke-virtual {v0}, Landroid/view/ScaleGestureDetector;->isInProgress()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/facebook/widget/images/zoomableimageview/a;->b:Landroid/view/GestureDetector;

    invoke-virtual {v0, p1}, Landroid/view/GestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 100
    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    .line 101
    and-int/lit16 v0, v0, 0xff

    packed-switch v0, :pswitch_data_0

    .line 108
    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0

    .line 103
    :pswitch_0
    invoke-virtual {p0}, Lcom/facebook/widget/images/zoomableimageview/a;->getScale()F

    move-result v0

    invoke-virtual {p0}, Lcom/facebook/widget/images/zoomableimageview/a;->getMinZoom()F

    move-result v1

    cmpg-float v0, v0, v1

    if-gez v0, :cond_1

    .line 104
    invoke-virtual {p0}, Lcom/facebook/widget/images/zoomableimageview/a;->getMinZoom()F

    move-result v0

    const/high16 v1, 0x42480000    # 50.0f

    invoke-virtual {p0, v0, v1}, Lcom/facebook/widget/images/zoomableimageview/a;->c(FF)V

    goto :goto_0

    .line 101
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public setDoubleTapEnabled(Z)V
    .locals 0

    .prologue
    .line 57
    iput-boolean p1, p0, Lcom/facebook/widget/images/zoomableimageview/a;->i:Z

    .line 58
    return-void
.end method

.method public setDoubleTapListener(Lcom/facebook/widget/images/zoomableimageview/c;)V
    .locals 0

    .prologue
    .line 53
    iput-object p1, p0, Lcom/facebook/widget/images/zoomableimageview/a;->C:Lcom/facebook/widget/images/zoomableimageview/c;

    .line 54
    return-void
.end method

.method public setScaleEnabled(Z)V
    .locals 0

    .prologue
    .line 61
    iput-boolean p1, p0, Lcom/facebook/widget/images/zoomableimageview/a;->j:Z

    .line 62
    return-void
.end method

.method public setScrollEnabled(Z)V
    .locals 0

    .prologue
    .line 65
    iput-boolean p1, p0, Lcom/facebook/widget/images/zoomableimageview/a;->k:Z

    .line 66
    return-void
.end method
