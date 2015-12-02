.class Lcom/facebook/widget/images/zoomableimageview/g;
.super Ljava/lang/Object;
.source "ImageViewTouchBase.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field a:D

.field b:D

.field final synthetic c:D

.field final synthetic d:J

.field final synthetic e:D

.field final synthetic f:D

.field final synthetic g:Lcom/facebook/widget/images/zoomableimageview/e;


# direct methods
.method constructor <init>(Lcom/facebook/widget/images/zoomableimageview/e;DJDD)V
    .locals 2

    .prologue
    const-wide/16 v0, 0x0

    .line 482
    iput-object p1, p0, Lcom/facebook/widget/images/zoomableimageview/g;->g:Lcom/facebook/widget/images/zoomableimageview/e;

    iput-wide p2, p0, Lcom/facebook/widget/images/zoomableimageview/g;->c:D

    iput-wide p4, p0, Lcom/facebook/widget/images/zoomableimageview/g;->d:J

    iput-wide p6, p0, Lcom/facebook/widget/images/zoomableimageview/g;->e:D

    iput-wide p8, p0, Lcom/facebook/widget/images/zoomableimageview/g;->f:D

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 484
    iput-wide v0, p0, Lcom/facebook/widget/images/zoomableimageview/g;->a:D

    .line 485
    iput-wide v0, p0, Lcom/facebook/widget/images/zoomableimageview/g;->b:D

    return-void
.end method


# virtual methods
.method public run()V
    .locals 13

    .prologue
    const/4 v12, 0x1

    const/4 v11, 0x0

    const-wide/16 v3, 0x0

    .line 489
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 490
    iget-wide v5, p0, Lcom/facebook/widget/images/zoomableimageview/g;->c:D

    iget-wide v7, p0, Lcom/facebook/widget/images/zoomableimageview/g;->d:J

    sub-long/2addr v0, v7

    long-to-double v0, v0

    invoke-static {v5, v6, v0, v1}, Ljava/lang/Math;->min(DD)D

    move-result-wide v1

    .line 491
    iget-object v0, p0, Lcom/facebook/widget/images/zoomableimageview/g;->g:Lcom/facebook/widget/images/zoomableimageview/e;

    iget-object v0, v0, Lcom/facebook/widget/images/zoomableimageview/e;->l:Lcom/facebook/widget/images/zoomableimageview/a/b;

    iget-wide v5, p0, Lcom/facebook/widget/images/zoomableimageview/g;->e:D

    iget-wide v7, p0, Lcom/facebook/widget/images/zoomableimageview/g;->c:D

    invoke-interface/range {v0 .. v8}, Lcom/facebook/widget/images/zoomableimageview/a/b;->a(DDDD)D

    move-result-wide v9

    .line 492
    iget-object v0, p0, Lcom/facebook/widget/images/zoomableimageview/g;->g:Lcom/facebook/widget/images/zoomableimageview/e;

    iget-object v0, v0, Lcom/facebook/widget/images/zoomableimageview/e;->l:Lcom/facebook/widget/images/zoomableimageview/a/b;

    iget-wide v5, p0, Lcom/facebook/widget/images/zoomableimageview/g;->f:D

    iget-wide v7, p0, Lcom/facebook/widget/images/zoomableimageview/g;->c:D

    invoke-interface/range {v0 .. v8}, Lcom/facebook/widget/images/zoomableimageview/a/b;->a(DDDD)D

    move-result-wide v3

    .line 493
    iget-object v0, p0, Lcom/facebook/widget/images/zoomableimageview/g;->g:Lcom/facebook/widget/images/zoomableimageview/e;

    iget-wide v5, p0, Lcom/facebook/widget/images/zoomableimageview/g;->a:D

    sub-double v5, v9, v5

    iget-wide v7, p0, Lcom/facebook/widget/images/zoomableimageview/g;->b:D

    sub-double v7, v3, v7

    invoke-virtual {v0, v5, v6, v7, v8}, Lcom/facebook/widget/images/zoomableimageview/e;->a(DD)V

    .line 494
    iput-wide v9, p0, Lcom/facebook/widget/images/zoomableimageview/g;->a:D

    .line 495
    iput-wide v3, p0, Lcom/facebook/widget/images/zoomableimageview/g;->b:D

    .line 496
    iget-wide v3, p0, Lcom/facebook/widget/images/zoomableimageview/g;->c:D

    cmpg-double v0, v1, v3

    if-gez v0, :cond_1

    .line 497
    iget-object v0, p0, Lcom/facebook/widget/images/zoomableimageview/g;->g:Lcom/facebook/widget/images/zoomableimageview/e;

    iget-object v0, v0, Lcom/facebook/widget/images/zoomableimageview/e;->o:Landroid/os/Handler;

    invoke-virtual {v0, p0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 503
    :cond_0
    :goto_0
    return-void

    .line 499
    :cond_1
    iget-object v0, p0, Lcom/facebook/widget/images/zoomableimageview/g;->g:Lcom/facebook/widget/images/zoomableimageview/e;

    iget-object v1, p0, Lcom/facebook/widget/images/zoomableimageview/g;->g:Lcom/facebook/widget/images/zoomableimageview/e;

    iget-object v1, v1, Lcom/facebook/widget/images/zoomableimageview/e;->n:Landroid/graphics/Matrix;

    invoke-virtual {v0, v1, v12, v12}, Lcom/facebook/widget/images/zoomableimageview/e;->a(Landroid/graphics/Matrix;ZZ)Landroid/graphics/RectF;

    move-result-object v0

    .line 500
    iget v1, v0, Landroid/graphics/RectF;->left:F

    cmpl-float v1, v1, v11

    if-nez v1, :cond_2

    iget v1, v0, Landroid/graphics/RectF;->top:F

    cmpl-float v1, v1, v11

    if-eqz v1, :cond_0

    .line 501
    :cond_2
    iget-object v1, p0, Lcom/facebook/widget/images/zoomableimageview/g;->g:Lcom/facebook/widget/images/zoomableimageview/e;

    iget v2, v0, Landroid/graphics/RectF;->left:F

    iget v0, v0, Landroid/graphics/RectF;->top:F

    invoke-virtual {v1, v2, v0}, Lcom/facebook/widget/images/zoomableimageview/e;->d(FF)V

    goto :goto_0
.end method
