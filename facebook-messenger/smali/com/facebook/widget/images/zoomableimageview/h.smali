.class Lcom/facebook/widget/images/zoomableimageview/h;
.super Ljava/lang/Object;
.source "ImageViewTouchBase.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:F

.field final synthetic b:J

.field final synthetic c:F

.field final synthetic d:F

.field final synthetic e:F

.field final synthetic f:F

.field final synthetic g:Lcom/facebook/widget/images/zoomableimageview/e;


# direct methods
.method constructor <init>(Lcom/facebook/widget/images/zoomableimageview/e;FJFFFF)V
    .locals 0

    .prologue
    .line 521
    iput-object p1, p0, Lcom/facebook/widget/images/zoomableimageview/h;->g:Lcom/facebook/widget/images/zoomableimageview/e;

    iput p2, p0, Lcom/facebook/widget/images/zoomableimageview/h;->a:F

    iput-wide p3, p0, Lcom/facebook/widget/images/zoomableimageview/h;->b:J

    iput p5, p0, Lcom/facebook/widget/images/zoomableimageview/h;->c:F

    iput p6, p0, Lcom/facebook/widget/images/zoomableimageview/h;->d:F

    iput p7, p0, Lcom/facebook/widget/images/zoomableimageview/h;->e:F

    iput p8, p0, Lcom/facebook/widget/images/zoomableimageview/h;->f:F

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 11

    .prologue
    const/4 v10, 0x1

    .line 525
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 526
    iget v2, p0, Lcom/facebook/widget/images/zoomableimageview/h;->a:F

    iget-wide v3, p0, Lcom/facebook/widget/images/zoomableimageview/h;->b:J

    sub-long/2addr v0, v3

    long-to-float v0, v0

    invoke-static {v2, v0}, Ljava/lang/Math;->min(FF)F

    move-result v9

    .line 527
    iget-object v0, p0, Lcom/facebook/widget/images/zoomableimageview/h;->g:Lcom/facebook/widget/images/zoomableimageview/e;

    iget-object v0, v0, Lcom/facebook/widget/images/zoomableimageview/e;->l:Lcom/facebook/widget/images/zoomableimageview/a/b;

    float-to-double v1, v9

    const-wide/16 v3, 0x0

    iget v5, p0, Lcom/facebook/widget/images/zoomableimageview/h;->c:F

    float-to-double v5, v5

    iget v7, p0, Lcom/facebook/widget/images/zoomableimageview/h;->a:F

    float-to-double v7, v7

    invoke-interface/range {v0 .. v8}, Lcom/facebook/widget/images/zoomableimageview/a/b;->b(DDDD)D

    move-result-wide v0

    double-to-float v0, v0

    .line 528
    iget-object v1, p0, Lcom/facebook/widget/images/zoomableimageview/h;->g:Lcom/facebook/widget/images/zoomableimageview/e;

    iget v2, p0, Lcom/facebook/widget/images/zoomableimageview/h;->d:F

    add-float/2addr v0, v2

    iget v2, p0, Lcom/facebook/widget/images/zoomableimageview/h;->e:F

    iget v3, p0, Lcom/facebook/widget/images/zoomableimageview/h;->f:F

    invoke-virtual {v1, v0, v2, v3}, Lcom/facebook/widget/images/zoomableimageview/e;->b(FFF)V

    .line 529
    iget v0, p0, Lcom/facebook/widget/images/zoomableimageview/h;->a:F

    cmpg-float v0, v9, v0

    if-gez v0, :cond_0

    .line 530
    iget-object v0, p0, Lcom/facebook/widget/images/zoomableimageview/h;->g:Lcom/facebook/widget/images/zoomableimageview/e;

    iget-object v0, v0, Lcom/facebook/widget/images/zoomableimageview/e;->o:Landroid/os/Handler;

    invoke-virtual {v0, p0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 535
    :goto_0
    return-void

    .line 532
    :cond_0
    iget-object v0, p0, Lcom/facebook/widget/images/zoomableimageview/h;->g:Lcom/facebook/widget/images/zoomableimageview/e;

    iget-object v1, p0, Lcom/facebook/widget/images/zoomableimageview/h;->g:Lcom/facebook/widget/images/zoomableimageview/e;

    invoke-virtual {v1}, Lcom/facebook/widget/images/zoomableimageview/e;->getScale()F

    move-result v1

    invoke-virtual {v0, v1}, Lcom/facebook/widget/images/zoomableimageview/e;->b(F)V

    .line 533
    iget-object v0, p0, Lcom/facebook/widget/images/zoomableimageview/h;->g:Lcom/facebook/widget/images/zoomableimageview/e;

    invoke-virtual {v0, v10, v10}, Lcom/facebook/widget/images/zoomableimageview/e;->a(ZZ)V

    goto :goto_0
.end method
