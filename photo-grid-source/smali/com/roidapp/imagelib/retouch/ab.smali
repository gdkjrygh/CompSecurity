.class final Lcom/roidapp/imagelib/retouch/ab;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/roidapp/imagelib/retouch/x;

.field private final b:F

.field private final c:F

.field private final d:J

.field private final e:F

.field private final f:F


# direct methods
.method public constructor <init>(Lcom/roidapp/imagelib/retouch/x;FFF)V
    .locals 2

    .prologue
    .line 363
    iput-object p1, p0, Lcom/roidapp/imagelib/retouch/ab;->a:Lcom/roidapp/imagelib/retouch/x;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 364
    iput p3, p0, Lcom/roidapp/imagelib/retouch/ab;->b:F

    .line 365
    iput p4, p0, Lcom/roidapp/imagelib/retouch/ab;->c:F

    .line 366
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/roidapp/imagelib/retouch/ab;->d:J

    .line 367
    iput p2, p0, Lcom/roidapp/imagelib/retouch/ab;->e:F

    .line 368
    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lcom/roidapp/imagelib/retouch/ab;->f:F

    .line 369
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    .prologue
    const/high16 v6, 0x3f800000    # 1.0f

    .line 373
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/ab;->a:Lcom/roidapp/imagelib/retouch/x;

    invoke-static {v0}, Lcom/roidapp/imagelib/retouch/x;->c(Lcom/roidapp/imagelib/retouch/x;)Ljava/lang/ref/WeakReference;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 374
    if-nez v0, :cond_1

    .line 389
    :cond_0
    :goto_0
    return-void

    .line 1392
    :cond_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iget-wide v4, p0, Lcom/roidapp/imagelib/retouch/ab;->d:J

    sub-long/2addr v2, v4

    long-to-float v1, v2

    mul-float/2addr v1, v6

    const/high16 v2, 0x43480000    # 200.0f

    div-float/2addr v1, v2

    .line 1393
    invoke-static {v6, v1}, Ljava/lang/Math;->min(FF)F

    move-result v1

    .line 1394
    invoke-static {}, Lcom/roidapp/imagelib/retouch/x;->c()Landroid/view/animation/Interpolator;

    move-result-object v2

    invoke-interface {v2, v1}, Landroid/view/animation/Interpolator;->getInterpolation(F)F

    move-result v1

    .line 379
    iget v2, p0, Lcom/roidapp/imagelib/retouch/ab;->e:F

    iget v3, p0, Lcom/roidapp/imagelib/retouch/ab;->f:F

    iget v4, p0, Lcom/roidapp/imagelib/retouch/ab;->e:F

    sub-float/2addr v3, v4

    mul-float/2addr v3, v1

    add-float/2addr v2, v3

    .line 380
    iget-object v3, p0, Lcom/roidapp/imagelib/retouch/ab;->a:Lcom/roidapp/imagelib/retouch/x;

    invoke-virtual {v3}, Lcom/roidapp/imagelib/retouch/x;->b()F

    move-result v3

    div-float/2addr v2, v3

    .line 382
    iget-object v3, p0, Lcom/roidapp/imagelib/retouch/ab;->a:Lcom/roidapp/imagelib/retouch/x;

    invoke-static {v3}, Lcom/roidapp/imagelib/retouch/x;->a(Lcom/roidapp/imagelib/retouch/x;)Landroid/graphics/Matrix;

    move-result-object v3

    iget v4, p0, Lcom/roidapp/imagelib/retouch/ab;->b:F

    iget v5, p0, Lcom/roidapp/imagelib/retouch/ab;->c:F

    invoke-virtual {v3, v2, v2, v4, v5}, Landroid/graphics/Matrix;->postScale(FFFF)Z

    .line 383
    iget-object v2, p0, Lcom/roidapp/imagelib/retouch/ab;->a:Lcom/roidapp/imagelib/retouch/x;

    invoke-static {v2}, Lcom/roidapp/imagelib/retouch/x;->b(Lcom/roidapp/imagelib/retouch/x;)V

    .line 386
    cmpg-float v1, v1, v6

    if-gez v1, :cond_0

    .line 387
    invoke-static {v0, p0}, Landroid/support/v4/view/ViewCompat;->postOnAnimation(Landroid/view/View;Ljava/lang/Runnable;)V

    goto :goto_0
.end method
