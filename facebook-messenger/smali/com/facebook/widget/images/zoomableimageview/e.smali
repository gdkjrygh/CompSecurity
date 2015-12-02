.class public Lcom/facebook/widget/images/zoomableimageview/e;
.super Landroid/widget/ImageView;
.source "ImageViewTouchBase.java"


# instance fields
.field protected A:Landroid/graphics/RectF;

.field protected B:Landroid/graphics/RectF;

.field private a:Lcom/facebook/widget/images/zoomableimageview/i;

.field protected l:Lcom/facebook/widget/images/zoomableimageview/a/b;

.field protected m:Landroid/graphics/Matrix;

.field protected n:Landroid/graphics/Matrix;

.field protected o:Landroid/os/Handler;

.field protected p:Ljava/lang/Runnable;

.field protected q:F

.field protected r:F

.field protected final s:Landroid/graphics/Matrix;

.field protected final t:[F

.field protected u:I

.field protected v:I

.field protected w:Z

.field protected final x:F

.field protected final y:I

.field protected z:Landroid/graphics/RectF;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .prologue
    const/4 v1, -0x1

    .line 54
    invoke-direct {p0, p1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 33
    new-instance v0, Lcom/facebook/widget/images/zoomableimageview/a/a;

    invoke-direct {v0}, Lcom/facebook/widget/images/zoomableimageview/a/a;-><init>()V

    iput-object v0, p0, Lcom/facebook/widget/images/zoomableimageview/e;->l:Lcom/facebook/widget/images/zoomableimageview/a/b;

    .line 34
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Lcom/facebook/widget/images/zoomableimageview/e;->m:Landroid/graphics/Matrix;

    .line 35
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Lcom/facebook/widget/images/zoomableimageview/e;->n:Landroid/graphics/Matrix;

    .line 36
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/facebook/widget/images/zoomableimageview/e;->o:Landroid/os/Handler;

    .line 37
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/widget/images/zoomableimageview/e;->p:Ljava/lang/Runnable;

    .line 39
    const/high16 v0, -0x40800000    # -1.0f

    iput v0, p0, Lcom/facebook/widget/images/zoomableimageview/e;->r:F

    .line 40
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Lcom/facebook/widget/images/zoomableimageview/e;->s:Landroid/graphics/Matrix;

    .line 41
    const/16 v0, 0x9

    new-array v0, v0, [F

    iput-object v0, p0, Lcom/facebook/widget/images/zoomableimageview/e;->t:[F

    .line 42
    iput v1, p0, Lcom/facebook/widget/images/zoomableimageview/e;->u:I

    iput v1, p0, Lcom/facebook/widget/images/zoomableimageview/e;->v:I

    .line 43
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/widget/images/zoomableimageview/e;->w:Z

    .line 44
    const/high16 v0, 0x40000000    # 2.0f

    iput v0, p0, Lcom/facebook/widget/images/zoomableimageview/e;->x:F

    .line 45
    const/16 v0, 0xc8

    iput v0, p0, Lcom/facebook/widget/images/zoomableimageview/e;->y:I

    .line 47
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lcom/facebook/widget/images/zoomableimageview/e;->z:Landroid/graphics/RectF;

    .line 48
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lcom/facebook/widget/images/zoomableimageview/e;->A:Landroid/graphics/RectF;

    .line 49
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lcom/facebook/widget/images/zoomableimageview/e;->B:Landroid/graphics/RectF;

    .line 55
    invoke-virtual {p0}, Lcom/facebook/widget/images/zoomableimageview/e;->a()V

    .line 56
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    .prologue
    const/4 v1, -0x1

    .line 59
    invoke-direct {p0, p1, p2}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 33
    new-instance v0, Lcom/facebook/widget/images/zoomableimageview/a/a;

    invoke-direct {v0}, Lcom/facebook/widget/images/zoomableimageview/a/a;-><init>()V

    iput-object v0, p0, Lcom/facebook/widget/images/zoomableimageview/e;->l:Lcom/facebook/widget/images/zoomableimageview/a/b;

    .line 34
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Lcom/facebook/widget/images/zoomableimageview/e;->m:Landroid/graphics/Matrix;

    .line 35
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Lcom/facebook/widget/images/zoomableimageview/e;->n:Landroid/graphics/Matrix;

    .line 36
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/facebook/widget/images/zoomableimageview/e;->o:Landroid/os/Handler;

    .line 37
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/widget/images/zoomableimageview/e;->p:Ljava/lang/Runnable;

    .line 39
    const/high16 v0, -0x40800000    # -1.0f

    iput v0, p0, Lcom/facebook/widget/images/zoomableimageview/e;->r:F

    .line 40
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Lcom/facebook/widget/images/zoomableimageview/e;->s:Landroid/graphics/Matrix;

    .line 41
    const/16 v0, 0x9

    new-array v0, v0, [F

    iput-object v0, p0, Lcom/facebook/widget/images/zoomableimageview/e;->t:[F

    .line 42
    iput v1, p0, Lcom/facebook/widget/images/zoomableimageview/e;->u:I

    iput v1, p0, Lcom/facebook/widget/images/zoomableimageview/e;->v:I

    .line 43
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/widget/images/zoomableimageview/e;->w:Z

    .line 44
    const/high16 v0, 0x40000000    # 2.0f

    iput v0, p0, Lcom/facebook/widget/images/zoomableimageview/e;->x:F

    .line 45
    const/16 v0, 0xc8

    iput v0, p0, Lcom/facebook/widget/images/zoomableimageview/e;->y:I

    .line 47
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lcom/facebook/widget/images/zoomableimageview/e;->z:Landroid/graphics/RectF;

    .line 48
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lcom/facebook/widget/images/zoomableimageview/e;->A:Landroid/graphics/RectF;

    .line 49
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lcom/facebook/widget/images/zoomableimageview/e;->B:Landroid/graphics/RectF;

    .line 60
    invoke-virtual {p0}, Lcom/facebook/widget/images/zoomableimageview/e;->a()V

    .line 61
    return-void
.end method


# virtual methods
.method protected a(Landroid/graphics/Matrix;I)F
    .locals 1

    .prologue
    .line 338
    iget-object v0, p0, Lcom/facebook/widget/images/zoomableimageview/e;->t:[F

    invoke-virtual {p1, v0}, Landroid/graphics/Matrix;->getValues([F)V

    .line 339
    iget-object v0, p0, Lcom/facebook/widget/images/zoomableimageview/e;->t:[F

    aget v0, v0, p2

    return v0
.end method

.method public a(Landroid/graphics/Matrix;)Landroid/graphics/Matrix;
    .locals 2

    .prologue
    .line 271
    iget-object v0, p0, Lcom/facebook/widget/images/zoomableimageview/e;->s:Landroid/graphics/Matrix;

    iget-object v1, p0, Lcom/facebook/widget/images/zoomableimageview/e;->m:Landroid/graphics/Matrix;

    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 272
    iget-object v0, p0, Lcom/facebook/widget/images/zoomableimageview/e;->s:Landroid/graphics/Matrix;

    invoke-virtual {v0, p1}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 273
    iget-object v0, p0, Lcom/facebook/widget/images/zoomableimageview/e;->s:Landroid/graphics/Matrix;

    return-object v0
.end method

.method protected a(Landroid/graphics/Matrix;ZZ)Landroid/graphics/RectF;
    .locals 7

    .prologue
    const/high16 v6, 0x40000000    # 2.0f

    const/4 v1, 0x0

    .line 380
    invoke-virtual {p0}, Lcom/facebook/widget/images/zoomableimageview/e;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 382
    if-nez v0, :cond_0

    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0, v1, v1, v1, v1}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 410
    :goto_0
    return-object v0

    .line 384
    :cond_0
    iget-object v0, p0, Lcom/facebook/widget/images/zoomableimageview/e;->A:Landroid/graphics/RectF;

    invoke-virtual {v0, v1, v1, v1, v1}, Landroid/graphics/RectF;->set(FFFF)V

    .line 385
    invoke-virtual {p0, p1}, Lcom/facebook/widget/images/zoomableimageview/e;->b(Landroid/graphics/Matrix;)Landroid/graphics/RectF;

    move-result-object v3

    .line 386
    invoke-virtual {v3}, Landroid/graphics/RectF;->height()F

    move-result v0

    .line 387
    invoke-virtual {v3}, Landroid/graphics/RectF;->width()F

    move-result v4

    .line 389
    if-eqz p3, :cond_6

    .line 390
    invoke-virtual {p0}, Lcom/facebook/widget/images/zoomableimageview/e;->getHeight()I

    move-result v2

    .line 391
    int-to-float v5, v2

    cmpg-float v5, v0, v5

    if-gez v5, :cond_1

    .line 392
    int-to-float v2, v2

    sub-float v0, v2, v0

    div-float/2addr v0, v6

    iget v2, v3, Landroid/graphics/RectF;->top:F

    sub-float/2addr v0, v2

    move v2, v0

    .line 399
    :goto_1
    if-eqz p2, :cond_5

    .line 400
    invoke-virtual {p0}, Lcom/facebook/widget/images/zoomableimageview/e;->getWidth()I

    move-result v0

    .line 401
    int-to-float v5, v0

    cmpg-float v5, v4, v5

    if-gez v5, :cond_3

    .line 402
    int-to-float v0, v0

    sub-float/2addr v0, v4

    div-float/2addr v0, v6

    iget v3, v3, Landroid/graphics/RectF;->left:F

    sub-float/2addr v0, v3

    .line 409
    :goto_2
    iget-object v3, p0, Lcom/facebook/widget/images/zoomableimageview/e;->A:Landroid/graphics/RectF;

    invoke-virtual {v3, v0, v2, v1, v1}, Landroid/graphics/RectF;->set(FFFF)V

    .line 410
    iget-object v0, p0, Lcom/facebook/widget/images/zoomableimageview/e;->A:Landroid/graphics/RectF;

    goto :goto_0

    .line 393
    :cond_1
    iget v0, v3, Landroid/graphics/RectF;->top:F

    cmpl-float v0, v0, v1

    if-lez v0, :cond_2

    .line 394
    iget v0, v3, Landroid/graphics/RectF;->top:F

    neg-float v0, v0

    move v2, v0

    goto :goto_1

    .line 395
    :cond_2
    iget v0, v3, Landroid/graphics/RectF;->bottom:F

    int-to-float v2, v2

    cmpg-float v0, v0, v2

    if-gez v0, :cond_6

    .line 396
    invoke-virtual {p0}, Lcom/facebook/widget/images/zoomableimageview/e;->getHeight()I

    move-result v0

    int-to-float v0, v0

    iget v2, v3, Landroid/graphics/RectF;->bottom:F

    sub-float/2addr v0, v2

    move v2, v0

    goto :goto_1

    .line 403
    :cond_3
    iget v4, v3, Landroid/graphics/RectF;->left:F

    cmpl-float v4, v4, v1

    if-lez v4, :cond_4

    .line 404
    iget v0, v3, Landroid/graphics/RectF;->left:F

    neg-float v0, v0

    goto :goto_2

    .line 405
    :cond_4
    iget v4, v3, Landroid/graphics/RectF;->right:F

    int-to-float v5, v0

    cmpg-float v4, v4, v5

    if-gez v4, :cond_5

    .line 406
    int-to-float v0, v0

    iget v3, v3, Landroid/graphics/RectF;->right:F

    sub-float/2addr v0, v3

    goto :goto_2

    :cond_5
    move v0, v1

    goto :goto_2

    :cond_6
    move v2, v1

    goto :goto_1
.end method

.method protected a()V
    .locals 1

    .prologue
    .line 68
    sget-object v0, Landroid/widget/ImageView$ScaleType;->MATRIX:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {p0, v0}, Lcom/facebook/widget/images/zoomableimageview/e;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 69
    return-void
.end method

.method protected a(DD)V
    .locals 6

    .prologue
    const/4 v5, 0x1

    const/4 v4, 0x0

    .line 456
    invoke-virtual {p0}, Lcom/facebook/widget/images/zoomableimageview/e;->getBitmapRect()Landroid/graphics/RectF;

    move-result-object v0

    .line 457
    iget-object v1, p0, Lcom/facebook/widget/images/zoomableimageview/e;->B:Landroid/graphics/RectF;

    double-to-float v2, p1

    double-to-float v3, p3

    invoke-virtual {v1, v2, v3, v4, v4}, Landroid/graphics/RectF;->set(FFFF)V

    .line 458
    iget-object v1, p0, Lcom/facebook/widget/images/zoomableimageview/e;->B:Landroid/graphics/RectF;

    invoke-virtual {p0, v0, v1}, Lcom/facebook/widget/images/zoomableimageview/e;->a(Landroid/graphics/RectF;Landroid/graphics/RectF;)V

    .line 459
    iget-object v0, p0, Lcom/facebook/widget/images/zoomableimageview/e;->B:Landroid/graphics/RectF;

    iget v0, v0, Landroid/graphics/RectF;->left:F

    iget-object v1, p0, Lcom/facebook/widget/images/zoomableimageview/e;->B:Landroid/graphics/RectF;

    iget v1, v1, Landroid/graphics/RectF;->top:F

    invoke-virtual {p0, v0, v1}, Lcom/facebook/widget/images/zoomableimageview/e;->b(FF)V

    .line 460
    invoke-virtual {p0, v5, v5}, Lcom/facebook/widget/images/zoomableimageview/e;->a(ZZ)V

    .line 461
    return-void
.end method

.method protected a(F)V
    .locals 0

    .prologue
    .line 446
    return-void
.end method

.method protected a(FFD)V
    .locals 11

    .prologue
    .line 479
    float-to-double v6, p1

    .line 480
    float-to-double v8, p2

    .line 481
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    .line 482
    iget-object v10, p0, Lcom/facebook/widget/images/zoomableimageview/e;->o:Landroid/os/Handler;

    new-instance v0, Lcom/facebook/widget/images/zoomableimageview/g;

    move-object v1, p0

    move-wide v2, p3

    invoke-direct/range {v0 .. v9}, Lcom/facebook/widget/images/zoomableimageview/g;-><init>(Lcom/facebook/widget/images/zoomableimageview/e;DJDD)V

    invoke-virtual {v10, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 505
    return-void
.end method

.method protected a(FFF)V
    .locals 1

    .prologue
    .line 419
    iget-object v0, p0, Lcom/facebook/widget/images/zoomableimageview/e;->n:Landroid/graphics/Matrix;

    invoke-virtual {v0, p1, p1, p2, p3}, Landroid/graphics/Matrix;->postScale(FFFF)Z

    .line 420
    invoke-virtual {p0}, Lcom/facebook/widget/images/zoomableimageview/e;->getImageViewMatrix()Landroid/graphics/Matrix;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/facebook/widget/images/zoomableimageview/e;->setImageMatrix(Landroid/graphics/Matrix;)V

    .line 421
    return-void
.end method

.method protected a(FFFF)V
    .locals 10

    .prologue
    const/4 v2, 0x1

    .line 508
    invoke-virtual {p0}, Lcom/facebook/widget/images/zoomableimageview/e;->getMaxZoom()F

    move-result v0

    cmpl-float v0, p1, v0

    if-lez v0, :cond_0

    invoke-virtual {p0}, Lcom/facebook/widget/images/zoomableimageview/e;->getMaxZoom()F

    move-result p1

    .line 509
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    .line 510
    invoke-virtual {p0}, Lcom/facebook/widget/images/zoomableimageview/e;->getScale()F

    move-result v6

    .line 512
    sub-float v5, p1, v6

    .line 514
    new-instance v0, Landroid/graphics/Matrix;

    iget-object v1, p0, Lcom/facebook/widget/images/zoomableimageview/e;->n:Landroid/graphics/Matrix;

    invoke-direct {v0, v1}, Landroid/graphics/Matrix;-><init>(Landroid/graphics/Matrix;)V

    .line 515
    invoke-virtual {v0, p1, p1, p2, p3}, Landroid/graphics/Matrix;->postScale(FFFF)Z

    .line 516
    invoke-virtual {p0, v0, v2, v2}, Lcom/facebook/widget/images/zoomableimageview/e;->a(Landroid/graphics/Matrix;ZZ)Landroid/graphics/RectF;

    move-result-object v0

    .line 518
    iget v1, v0, Landroid/graphics/RectF;->left:F

    mul-float/2addr v1, p1

    add-float v7, p2, v1

    .line 519
    iget v0, v0, Landroid/graphics/RectF;->top:F

    mul-float/2addr v0, p1

    add-float v8, p3, v0

    .line 521
    iget-object v9, p0, Lcom/facebook/widget/images/zoomableimageview/e;->o:Landroid/os/Handler;

    new-instance v0, Lcom/facebook/widget/images/zoomableimageview/h;

    move-object v1, p0

    move v2, p4

    invoke-direct/range {v0 .. v8}, Lcom/facebook/widget/images/zoomableimageview/h;-><init>(Lcom/facebook/widget/images/zoomableimageview/e;FJFFFF)V

    invoke-virtual {v9, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 537
    return-void
.end method

.method public a(Landroid/graphics/Bitmap;Z)V
    .locals 1

    .prologue
    .line 129
    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0}, Lcom/facebook/widget/images/zoomableimageview/e;->a(Landroid/graphics/Bitmap;ZLandroid/graphics/Matrix;)V

    .line 130
    return-void
.end method

.method public a(Landroid/graphics/Bitmap;ZLandroid/graphics/Matrix;)V
    .locals 1

    .prologue
    .line 147
    const/high16 v0, -0x40800000    # -1.0f

    invoke-virtual {p0, p1, p2, p3, v0}, Lcom/facebook/widget/images/zoomableimageview/e;->a(Landroid/graphics/Bitmap;ZLandroid/graphics/Matrix;F)V

    .line 148
    return-void
.end method

.method public a(Landroid/graphics/Bitmap;ZLandroid/graphics/Matrix;F)V
    .locals 1

    .prologue
    .line 160
    if-eqz p1, :cond_0

    .line 161
    new-instance v0, Lcom/facebook/widget/images/zoomableimageview/b/a;

    invoke-direct {v0, p1}, Lcom/facebook/widget/images/zoomableimageview/b/a;-><init>(Landroid/graphics/Bitmap;)V

    invoke-virtual {p0, v0, p2, p3, p4}, Lcom/facebook/widget/images/zoomableimageview/e;->b(Landroid/graphics/drawable/Drawable;ZLandroid/graphics/Matrix;F)V

    .line 164
    :goto_0
    return-void

    .line 163
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0, p2, p3, p4}, Lcom/facebook/widget/images/zoomableimageview/e;->b(Landroid/graphics/drawable/Drawable;ZLandroid/graphics/Matrix;F)V

    goto :goto_0
.end method

.method protected a(Landroid/graphics/RectF;Landroid/graphics/RectF;)V
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 464
    invoke-virtual {p0}, Lcom/facebook/widget/images/zoomableimageview/e;->getWidth()I

    move-result v0

    int-to-float v0, v0

    .line 465
    invoke-virtual {p0}, Lcom/facebook/widget/images/zoomableimageview/e;->getHeight()I

    move-result v1

    int-to-float v1, v1

    .line 467
    iget v2, p1, Landroid/graphics/RectF;->top:F

    cmpl-float v2, v2, v4

    if-ltz v2, :cond_0

    iget v2, p1, Landroid/graphics/RectF;->bottom:F

    cmpg-float v2, v2, v1

    if-gtz v2, :cond_0

    iput v4, p2, Landroid/graphics/RectF;->top:F

    .line 468
    :cond_0
    iget v2, p1, Landroid/graphics/RectF;->left:F

    cmpl-float v2, v2, v4

    if-ltz v2, :cond_1

    iget v2, p1, Landroid/graphics/RectF;->right:F

    cmpg-float v2, v2, v0

    if-gtz v2, :cond_1

    iput v4, p2, Landroid/graphics/RectF;->left:F

    .line 469
    :cond_1
    iget v2, p1, Landroid/graphics/RectF;->top:F

    iget v3, p2, Landroid/graphics/RectF;->top:F

    add-float/2addr v2, v3

    cmpl-float v2, v2, v4

    if-ltz v2, :cond_2

    iget v2, p1, Landroid/graphics/RectF;->bottom:F

    cmpl-float v2, v2, v1

    if-lez v2, :cond_2

    .line 470
    iget v2, p1, Landroid/graphics/RectF;->top:F

    sub-float v2, v4, v2

    float-to-int v2, v2

    int-to-float v2, v2

    iput v2, p2, Landroid/graphics/RectF;->top:F

    .line 471
    :cond_2
    iget v2, p1, Landroid/graphics/RectF;->bottom:F

    iget v3, p2, Landroid/graphics/RectF;->top:F

    add-float/2addr v2, v3

    sub-float v3, v1, v4

    cmpg-float v2, v2, v3

    if-gtz v2, :cond_3

    iget v2, p1, Landroid/graphics/RectF;->top:F

    cmpg-float v2, v2, v4

    if-gez v2, :cond_3

    .line 472
    sub-float/2addr v1, v4

    iget v2, p1, Landroid/graphics/RectF;->bottom:F

    sub-float/2addr v1, v2

    float-to-int v1, v1

    int-to-float v1, v1

    iput v1, p2, Landroid/graphics/RectF;->top:F

    .line 473
    :cond_3
    iget v1, p1, Landroid/graphics/RectF;->left:F

    iget v2, p2, Landroid/graphics/RectF;->left:F

    add-float/2addr v1, v2

    cmpl-float v1, v1, v4

    if-ltz v1, :cond_4

    iget v1, p1, Landroid/graphics/RectF;->left:F

    sub-float v1, v4, v1

    float-to-int v1, v1

    int-to-float v1, v1

    iput v1, p2, Landroid/graphics/RectF;->left:F

    .line 474
    :cond_4
    iget v1, p1, Landroid/graphics/RectF;->right:F

    iget v2, p2, Landroid/graphics/RectF;->left:F

    add-float/2addr v1, v2

    sub-float v2, v0, v4

    cmpg-float v1, v1, v2

    if-gtz v1, :cond_5

    .line 475
    sub-float/2addr v0, v4

    iget v1, p1, Landroid/graphics/RectF;->right:F

    sub-float/2addr v0, v1

    float-to-int v0, v0

    int-to-float v0, v0

    iput v0, p2, Landroid/graphics/RectF;->left:F

    .line 476
    :cond_5
    return-void
.end method

.method protected a(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .prologue
    .line 225
    iget-object v0, p0, Lcom/facebook/widget/images/zoomableimageview/e;->a:Lcom/facebook/widget/images/zoomableimageview/i;

    if-eqz v0, :cond_0

    .line 226
    iget-object v0, p0, Lcom/facebook/widget/images/zoomableimageview/e;->a:Lcom/facebook/widget/images/zoomableimageview/i;

    invoke-interface {v0, p1}, Lcom/facebook/widget/images/zoomableimageview/i;->a(Landroid/graphics/drawable/Drawable;)V

    .line 228
    :cond_0
    return-void
.end method

.method protected a(Landroid/graphics/drawable/Drawable;Landroid/graphics/Matrix;)V
    .locals 9

    .prologue
    const/high16 v8, 0x40000000    # 2.0f

    .line 294
    const-string v0, "image"

    const-string v1, "getProperBaseMatrix"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 295
    invoke-virtual {p0}, Lcom/facebook/widget/images/zoomableimageview/e;->getWidth()I

    move-result v0

    int-to-float v0, v0

    .line 296
    invoke-virtual {p0}, Lcom/facebook/widget/images/zoomableimageview/e;->getHeight()I

    move-result v1

    int-to-float v1, v1

    .line 297
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v2

    int-to-float v2, v2

    .line 298
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v3

    int-to-float v3, v3

    .line 299
    invoke-virtual {p2}, Landroid/graphics/Matrix;->reset()V

    .line 301
    cmpl-float v4, v2, v0

    if-gtz v4, :cond_0

    cmpl-float v4, v3, v1

    if-lez v4, :cond_1

    .line 302
    :cond_0
    div-float v4, v0, v2

    invoke-static {v4, v8}, Ljava/lang/Math;->min(FF)F

    move-result v4

    .line 303
    div-float v5, v1, v3

    invoke-static {v5, v8}, Ljava/lang/Math;->min(FF)F

    move-result v5

    .line 304
    invoke-static {v4, v5}, Ljava/lang/Math;->min(FF)F

    move-result v4

    .line 305
    const-string v5, "image"

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "scale: "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 306
    invoke-virtual {p2, v4, v4}, Landroid/graphics/Matrix;->postScale(FF)Z

    .line 307
    mul-float/2addr v2, v4

    sub-float/2addr v0, v2

    div-float/2addr v0, v8

    .line 308
    mul-float v2, v3, v4

    sub-float/2addr v1, v2

    div-float/2addr v1, v8

    .line 309
    invoke-virtual {p2, v0, v1}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 316
    :goto_0
    return-void

    .line 311
    :cond_1
    sub-float/2addr v0, v2

    div-float/2addr v0, v8

    .line 312
    sub-float/2addr v1, v3

    div-float/2addr v1, v8

    .line 313
    invoke-virtual {p2, v0, v1}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 314
    const-string v0, "image"

    const-string v1, "scale: null"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0
.end method

.method protected a(Landroid/graphics/drawable/Drawable;ZLandroid/graphics/Matrix;F)V
    .locals 1

    .prologue
    .line 193
    if-eqz p1, :cond_2

    .line 194
    iget-boolean v0, p0, Lcom/facebook/widget/images/zoomableimageview/e;->w:Z

    if-eqz v0, :cond_1

    .line 195
    iget-object v0, p0, Lcom/facebook/widget/images/zoomableimageview/e;->m:Landroid/graphics/Matrix;

    invoke-virtual {p0, p1, v0}, Lcom/facebook/widget/images/zoomableimageview/e;->b(Landroid/graphics/drawable/Drawable;Landroid/graphics/Matrix;)V

    .line 196
    iget-object v0, p0, Lcom/facebook/widget/images/zoomableimageview/e;->m:Landroid/graphics/Matrix;

    invoke-virtual {p0, v0}, Lcom/facebook/widget/images/zoomableimageview/e;->c(Landroid/graphics/Matrix;)F

    move-result v0

    invoke-virtual {p0, v0}, Lcom/facebook/widget/images/zoomableimageview/e;->setMinZoom(F)V

    .line 201
    :goto_0
    invoke-super {p0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 207
    :goto_1
    if-eqz p2, :cond_0

    .line 208
    iget-object v0, p0, Lcom/facebook/widget/images/zoomableimageview/e;->n:Landroid/graphics/Matrix;

    invoke-virtual {v0}, Landroid/graphics/Matrix;->reset()V

    .line 209
    if-eqz p3, :cond_0

    .line 210
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0, p3}, Landroid/graphics/Matrix;-><init>(Landroid/graphics/Matrix;)V

    iput-object v0, p0, Lcom/facebook/widget/images/zoomableimageview/e;->n:Landroid/graphics/Matrix;

    .line 214
    :cond_0
    invoke-virtual {p0}, Lcom/facebook/widget/images/zoomableimageview/e;->getImageViewMatrix()Landroid/graphics/Matrix;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/facebook/widget/images/zoomableimageview/e;->setImageMatrix(Landroid/graphics/Matrix;)V

    .line 216
    const/high16 v0, 0x3f800000    # 1.0f

    cmpg-float v0, p4, v0

    if-gez v0, :cond_3

    .line 217
    invoke-virtual {p0}, Lcom/facebook/widget/images/zoomableimageview/e;->b()F

    move-result v0

    iput v0, p0, Lcom/facebook/widget/images/zoomableimageview/e;->q:F

    .line 221
    :goto_2
    invoke-virtual {p0, p1}, Lcom/facebook/widget/images/zoomableimageview/e;->a(Landroid/graphics/drawable/Drawable;)V

    .line 222
    return-void

    .line 198
    :cond_1
    iget-object v0, p0, Lcom/facebook/widget/images/zoomableimageview/e;->m:Landroid/graphics/Matrix;

    invoke-virtual {p0, p1, v0}, Lcom/facebook/widget/images/zoomableimageview/e;->a(Landroid/graphics/drawable/Drawable;Landroid/graphics/Matrix;)V

    .line 199
    invoke-virtual {p0}, Lcom/facebook/widget/images/zoomableimageview/e;->getMinZoom()F

    move-result v0

    invoke-virtual {p0, v0}, Lcom/facebook/widget/images/zoomableimageview/e;->setMinZoom(F)V

    goto :goto_0

    .line 203
    :cond_2
    iget-object v0, p0, Lcom/facebook/widget/images/zoomableimageview/e;->m:Landroid/graphics/Matrix;

    invoke-virtual {v0}, Landroid/graphics/Matrix;->reset()V

    .line 204
    const/4 v0, 0x0

    invoke-super {p0, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_1

    .line 219
    :cond_3
    iput p4, p0, Lcom/facebook/widget/images/zoomableimageview/e;->q:F

    goto :goto_2
.end method

.method protected a(ZZ)V
    .locals 4

    .prologue
    const/4 v2, 0x0

    .line 369
    invoke-virtual {p0}, Lcom/facebook/widget/images/zoomableimageview/e;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 371
    if-nez v0, :cond_1

    .line 377
    :cond_0
    :goto_0
    return-void

    .line 372
    :cond_1
    iget-object v0, p0, Lcom/facebook/widget/images/zoomableimageview/e;->n:Landroid/graphics/Matrix;

    invoke-virtual {p0, v0, p1, p2}, Lcom/facebook/widget/images/zoomableimageview/e;->a(Landroid/graphics/Matrix;ZZ)Landroid/graphics/RectF;

    move-result-object v0

    .line 373
    iget v1, v0, Landroid/graphics/RectF;->left:F

    cmpl-float v1, v1, v2

    if-nez v1, :cond_2

    iget v1, v0, Landroid/graphics/RectF;->top:F

    cmpl-float v1, v1, v2

    if-eqz v1, :cond_0

    .line 374
    :cond_2
    const-string v1, "image"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "center.rect: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, v0, Landroid/graphics/RectF;->left:F

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "x"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, v0, Landroid/graphics/RectF;->top:F

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 375
    iget v1, v0, Landroid/graphics/RectF;->left:F

    iget v0, v0, Landroid/graphics/RectF;->top:F

    invoke-virtual {p0, v1, v0}, Lcom/facebook/widget/images/zoomableimageview/e;->b(FF)V

    goto :goto_0
.end method

.method protected b()F
    .locals 3

    .prologue
    .line 236
    invoke-virtual {p0}, Lcom/facebook/widget/images/zoomableimageview/e;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 238
    if-nez v0, :cond_0

    .line 239
    const/high16 v0, 0x3f800000    # 1.0f

    .line 245
    :goto_0
    return v0

    .line 242
    :cond_0
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v1

    int-to-float v1, v1

    iget v2, p0, Lcom/facebook/widget/images/zoomableimageview/e;->u:I

    int-to-float v2, v2

    div-float/2addr v1, v2

    .line 243
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v0

    int-to-float v0, v0

    iget v2, p0, Lcom/facebook/widget/images/zoomableimageview/e;->v:I

    int-to-float v2, v2

    div-float/2addr v0, v2

    .line 244
    invoke-static {v1, v0}, Ljava/lang/Math;->max(FF)F

    move-result v0

    const/high16 v1, 0x40800000    # 4.0f

    mul-float/2addr v0, v1

    .line 245
    goto :goto_0
.end method

.method protected b(Landroid/graphics/Matrix;)Landroid/graphics/RectF;
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 347
    invoke-virtual {p0}, Lcom/facebook/widget/images/zoomableimageview/e;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 349
    if-nez v0, :cond_0

    const/4 v0, 0x0

    .line 353
    :goto_0
    return-object v0

    .line 350
    :cond_0
    invoke-virtual {p0, p1}, Lcom/facebook/widget/images/zoomableimageview/e;->a(Landroid/graphics/Matrix;)Landroid/graphics/Matrix;

    move-result-object v1

    .line 351
    iget-object v2, p0, Lcom/facebook/widget/images/zoomableimageview/e;->z:Landroid/graphics/RectF;

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v3

    int-to-float v3, v3

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {v2, v4, v4, v3, v0}, Landroid/graphics/RectF;->set(FFFF)V

    .line 352
    iget-object v0, p0, Lcom/facebook/widget/images/zoomableimageview/e;->z:Landroid/graphics/RectF;

    invoke-virtual {v1, v0}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    .line 353
    iget-object v0, p0, Lcom/facebook/widget/images/zoomableimageview/e;->z:Landroid/graphics/RectF;

    goto :goto_0
.end method

.method protected b(F)V
    .locals 0

    .prologue
    .line 449
    return-void
.end method

.method protected b(FF)V
    .locals 1

    .prologue
    .line 414
    iget-object v0, p0, Lcom/facebook/widget/images/zoomableimageview/e;->n:Landroid/graphics/Matrix;

    invoke-virtual {v0, p1, p2}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 415
    invoke-virtual {p0}, Lcom/facebook/widget/images/zoomableimageview/e;->getImageViewMatrix()Landroid/graphics/Matrix;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/facebook/widget/images/zoomableimageview/e;->setImageMatrix(Landroid/graphics/Matrix;)V

    .line 416
    return-void
.end method

.method protected b(FFF)V
    .locals 5

    .prologue
    const/4 v4, 0x1

    .line 436
    iget v0, p0, Lcom/facebook/widget/images/zoomableimageview/e;->q:F

    cmpl-float v0, p1, v0

    if-lez v0, :cond_0

    iget p1, p0, Lcom/facebook/widget/images/zoomableimageview/e;->q:F

    .line 437
    :cond_0
    invoke-virtual {p0}, Lcom/facebook/widget/images/zoomableimageview/e;->getScale()F

    move-result v0

    .line 438
    div-float v0, p1, v0

    .line 439
    const-string v1, "image"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "zoomTo: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", center: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "x"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 440
    invoke-virtual {p0, v0, p2, p3}, Lcom/facebook/widget/images/zoomableimageview/e;->a(FFF)V

    .line 441
    invoke-virtual {p0}, Lcom/facebook/widget/images/zoomableimageview/e;->getScale()F

    move-result v0

    invoke-virtual {p0, v0}, Lcom/facebook/widget/images/zoomableimageview/e;->a(F)V

    .line 442
    invoke-virtual {p0, v4, v4}, Lcom/facebook/widget/images/zoomableimageview/e;->a(ZZ)V

    .line 443
    return-void
.end method

.method protected b(Landroid/graphics/drawable/Drawable;Landroid/graphics/Matrix;)V
    .locals 7

    .prologue
    const/high16 v6, 0x40000000    # 2.0f

    .line 325
    invoke-virtual {p0}, Lcom/facebook/widget/images/zoomableimageview/e;->getWidth()I

    move-result v0

    int-to-float v0, v0

    .line 326
    invoke-virtual {p0}, Lcom/facebook/widget/images/zoomableimageview/e;->getHeight()I

    move-result v1

    int-to-float v1, v1

    .line 327
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v2

    int-to-float v2, v2

    .line 328
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v3

    int-to-float v3, v3

    .line 329
    invoke-virtual {p2}, Landroid/graphics/Matrix;->reset()V

    .line 330
    div-float v4, v0, v2

    invoke-static {v4, v6}, Ljava/lang/Math;->min(FF)F

    move-result v4

    .line 331
    div-float v5, v1, v3

    invoke-static {v5, v6}, Ljava/lang/Math;->min(FF)F

    move-result v5

    .line 332
    invoke-static {v4, v5}, Ljava/lang/Math;->min(FF)F

    move-result v4

    .line 333
    invoke-virtual {p2, v4, v4}, Landroid/graphics/Matrix;->postScale(FF)Z

    .line 334
    mul-float/2addr v2, v4

    sub-float/2addr v0, v2

    div-float/2addr v0, v6

    mul-float v2, v3, v4

    sub-float/2addr v1, v2

    div-float/2addr v1, v6

    invoke-virtual {p2, v0, v1}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 335
    return-void
.end method

.method public b(Landroid/graphics/drawable/Drawable;ZLandroid/graphics/Matrix;F)V
    .locals 6

    .prologue
    .line 174
    invoke-virtual {p0}, Lcom/facebook/widget/images/zoomableimageview/e;->getWidth()I

    move-result v0

    .line 176
    if-gtz v0, :cond_0

    .line 177
    new-instance v0, Lcom/facebook/widget/images/zoomableimageview/f;

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move-object v4, p3

    move v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/facebook/widget/images/zoomableimageview/f;-><init>(Lcom/facebook/widget/images/zoomableimageview/e;Landroid/graphics/drawable/Drawable;ZLandroid/graphics/Matrix;F)V

    iput-object v0, p0, Lcom/facebook/widget/images/zoomableimageview/e;->p:Ljava/lang/Runnable;

    .line 188
    :goto_0
    return-void

    .line 187
    :cond_0
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/facebook/widget/images/zoomableimageview/e;->a(Landroid/graphics/drawable/Drawable;ZLandroid/graphics/Matrix;F)V

    goto :goto_0
.end method

.method protected c()F
    .locals 1

    .prologue
    .line 249
    const/high16 v0, 0x3f800000    # 1.0f

    return v0
.end method

.method protected c(Landroid/graphics/Matrix;)F
    .locals 1

    .prologue
    .line 357
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/facebook/widget/images/zoomableimageview/e;->a(Landroid/graphics/Matrix;I)F

    move-result v0

    return v0
.end method

.method protected c(F)V
    .locals 3

    .prologue
    const/high16 v2, 0x40000000    # 2.0f

    .line 424
    invoke-virtual {p0}, Lcom/facebook/widget/images/zoomableimageview/e;->getWidth()I

    move-result v0

    int-to-float v0, v0

    div-float/2addr v0, v2

    .line 425
    invoke-virtual {p0}, Lcom/facebook/widget/images/zoomableimageview/e;->getHeight()I

    move-result v1

    int-to-float v1, v1

    div-float/2addr v1, v2

    .line 426
    invoke-virtual {p0, p1, v0, v1}, Lcom/facebook/widget/images/zoomableimageview/e;->b(FFF)V

    .line 427
    return-void
.end method

.method public c(FF)V
    .locals 3

    .prologue
    const/high16 v2, 0x40000000    # 2.0f

    .line 430
    invoke-virtual {p0}, Lcom/facebook/widget/images/zoomableimageview/e;->getWidth()I

    move-result v0

    int-to-float v0, v0

    div-float/2addr v0, v2

    .line 431
    invoke-virtual {p0}, Lcom/facebook/widget/images/zoomableimageview/e;->getHeight()I

    move-result v1

    int-to-float v1, v1

    div-float/2addr v1, v2

    .line 432
    invoke-virtual {p0, p1, v0, v1, p2}, Lcom/facebook/widget/images/zoomableimageview/e;->a(FFFF)V

    .line 433
    return-void
.end method

.method public d(FF)V
    .locals 4

    .prologue
    .line 452
    float-to-double v0, p1

    float-to-double v2, p2

    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/facebook/widget/images/zoomableimageview/e;->a(DD)V

    .line 453
    return-void
.end method

.method protected getBitmapRect()Landroid/graphics/RectF;
    .locals 1

    .prologue
    .line 343
    iget-object v0, p0, Lcom/facebook/widget/images/zoomableimageview/e;->n:Landroid/graphics/Matrix;

    invoke-virtual {p0, v0}, Lcom/facebook/widget/images/zoomableimageview/e;->b(Landroid/graphics/Matrix;)Landroid/graphics/RectF;

    move-result-object v0

    return-object v0
.end method

.method public getDisplayMatrix()Landroid/graphics/Matrix;
    .locals 2

    .prologue
    .line 284
    new-instance v0, Landroid/graphics/Matrix;

    iget-object v1, p0, Lcom/facebook/widget/images/zoomableimageview/e;->n:Landroid/graphics/Matrix;

    invoke-direct {v0, v1}, Landroid/graphics/Matrix;-><init>(Landroid/graphics/Matrix;)V

    return-object v0
.end method

.method public getImageViewMatrix()Landroid/graphics/Matrix;
    .locals 1

    .prologue
    .line 267
    iget-object v0, p0, Lcom/facebook/widget/images/zoomableimageview/e;->n:Landroid/graphics/Matrix;

    invoke-virtual {p0, v0}, Lcom/facebook/widget/images/zoomableimageview/e;->a(Landroid/graphics/Matrix;)Landroid/graphics/Matrix;

    move-result-object v0

    return-object v0
.end method

.method public getMaxZoom()F
    .locals 2

    .prologue
    .line 253
    iget v0, p0, Lcom/facebook/widget/images/zoomableimageview/e;->q:F

    const/high16 v1, 0x3f800000    # 1.0f

    cmpg-float v0, v0, v1

    if-gez v0, :cond_0

    .line 254
    invoke-virtual {p0}, Lcom/facebook/widget/images/zoomableimageview/e;->b()F

    move-result v0

    iput v0, p0, Lcom/facebook/widget/images/zoomableimageview/e;->q:F

    .line 256
    :cond_0
    iget v0, p0, Lcom/facebook/widget/images/zoomableimageview/e;->q:F

    return v0
.end method

.method public getMinZoom()F
    .locals 2

    .prologue
    .line 260
    iget v0, p0, Lcom/facebook/widget/images/zoomableimageview/e;->r:F

    const/4 v1, 0x0

    cmpg-float v0, v0, v1

    if-gez v0, :cond_0

    .line 261
    invoke-virtual {p0}, Lcom/facebook/widget/images/zoomableimageview/e;->c()F

    move-result v0

    iput v0, p0, Lcom/facebook/widget/images/zoomableimageview/e;->r:F

    .line 263
    :cond_0
    iget v0, p0, Lcom/facebook/widget/images/zoomableimageview/e;->r:F

    return v0
.end method

.method public getRotation()F
    .locals 1

    .prologue
    .line 361
    const/4 v0, 0x0

    return v0
.end method

.method public getScale()F
    .locals 1

    .prologue
    .line 365
    iget-object v0, p0, Lcom/facebook/widget/images/zoomableimageview/e;->n:Landroid/graphics/Matrix;

    invoke-virtual {p0, v0}, Lcom/facebook/widget/images/zoomableimageview/e;->c(Landroid/graphics/Matrix;)F

    move-result v0

    return v0
.end method

.method protected onLayout(ZIIII)V
    .locals 2

    .prologue
    .line 89
    invoke-super/range {p0 .. p5}, Landroid/widget/ImageView;->onLayout(ZIIII)V

    .line 90
    sub-int v0, p4, p2

    iput v0, p0, Lcom/facebook/widget/images/zoomableimageview/e;->u:I

    .line 91
    sub-int v0, p5, p3

    iput v0, p0, Lcom/facebook/widget/images/zoomableimageview/e;->v:I

    .line 92
    iget-object v0, p0, Lcom/facebook/widget/images/zoomableimageview/e;->p:Ljava/lang/Runnable;

    .line 93
    if-eqz v0, :cond_0

    .line 94
    const/4 v1, 0x0

    iput-object v1, p0, Lcom/facebook/widget/images/zoomableimageview/e;->p:Ljava/lang/Runnable;

    .line 95
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    .line 97
    :cond_0
    invoke-virtual {p0}, Lcom/facebook/widget/images/zoomableimageview/e;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 98
    iget-boolean v0, p0, Lcom/facebook/widget/images/zoomableimageview/e;->w:Z

    if-eqz v0, :cond_2

    .line 99
    invoke-virtual {p0}, Lcom/facebook/widget/images/zoomableimageview/e;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/widget/images/zoomableimageview/e;->m:Landroid/graphics/Matrix;

    invoke-virtual {p0, v0, v1}, Lcom/facebook/widget/images/zoomableimageview/e;->b(Landroid/graphics/drawable/Drawable;Landroid/graphics/Matrix;)V

    .line 100
    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {p0, v0}, Lcom/facebook/widget/images/zoomableimageview/e;->setMinZoom(F)V

    .line 105
    :goto_0
    invoke-virtual {p0}, Lcom/facebook/widget/images/zoomableimageview/e;->getImageViewMatrix()Landroid/graphics/Matrix;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/facebook/widget/images/zoomableimageview/e;->setImageMatrix(Landroid/graphics/Matrix;)V

    .line 106
    invoke-virtual {p0}, Lcom/facebook/widget/images/zoomableimageview/e;->getMinZoom()F

    move-result v0

    invoke-virtual {p0, v0}, Lcom/facebook/widget/images/zoomableimageview/e;->c(F)V

    .line 108
    :cond_1
    return-void

    .line 102
    :cond_2
    invoke-virtual {p0}, Lcom/facebook/widget/images/zoomableimageview/e;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/widget/images/zoomableimageview/e;->m:Landroid/graphics/Matrix;

    invoke-virtual {p0, v0, v1}, Lcom/facebook/widget/images/zoomableimageview/e;->a(Landroid/graphics/drawable/Drawable;Landroid/graphics/Matrix;)V

    .line 103
    invoke-virtual {p0}, Lcom/facebook/widget/images/zoomableimageview/e;->getMinZoom()F

    move-result v0

    invoke-virtual {p0, v0}, Lcom/facebook/widget/images/zoomableimageview/e;->setMinZoom(F)V

    goto :goto_0
.end method

.method public setFitToScreen(Z)V
    .locals 1

    .prologue
    .line 76
    iget-boolean v0, p0, Lcom/facebook/widget/images/zoomableimageview/e;->w:Z

    if-eq p1, v0, :cond_0

    .line 77
    iput-boolean p1, p0, Lcom/facebook/widget/images/zoomableimageview/e;->w:Z

    .line 78
    invoke-virtual {p0}, Lcom/facebook/widget/images/zoomableimageview/e;->requestLayout()V

    .line 80
    :cond_0
    return-void
.end method

.method public setImageBitmap(Landroid/graphics/Bitmap;)V
    .locals 1

    .prologue
    .line 112
    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lcom/facebook/widget/images/zoomableimageview/e;->a(Landroid/graphics/Bitmap;Z)V

    .line 113
    return-void
.end method

.method public setImageDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 3

    .prologue
    .line 168
    const/4 v0, 0x1

    const/4 v1, 0x0

    const/high16 v2, -0x40800000    # -1.0f

    invoke-virtual {p0, p1, v0, v1, v2}, Lcom/facebook/widget/images/zoomableimageview/e;->b(Landroid/graphics/drawable/Drawable;ZLandroid/graphics/Matrix;F)V

    .line 169
    return-void
.end method

.method public setImageResource(I)V
    .locals 1

    .prologue
    .line 117
    invoke-virtual {p0}, Lcom/facebook/widget/images/zoomableimageview/e;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/facebook/widget/images/zoomableimageview/e;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 118
    return-void
.end method

.method public setMinZoom(F)V
    .locals 3

    .prologue
    .line 83
    const-string v0, "image"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "minZoom: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 84
    iput p1, p0, Lcom/facebook/widget/images/zoomableimageview/e;->r:F

    .line 85
    return-void
.end method

.method public setOnBitmapChangedListener(Lcom/facebook/widget/images/zoomableimageview/i;)V
    .locals 0

    .prologue
    .line 64
    iput-object p1, p0, Lcom/facebook/widget/images/zoomableimageview/e;->a:Lcom/facebook/widget/images/zoomableimageview/i;

    .line 65
    return-void
.end method
