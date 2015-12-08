.class final Lcom/roidapp/imagelib/crop/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:F

.field final synthetic b:J

.field final synthetic c:F

.field final synthetic d:F

.field final synthetic e:F

.field final synthetic f:F

.field final synthetic g:F

.field final synthetic h:F

.field final synthetic i:Lcom/roidapp/imagelib/crop/ImageViewTouchBase;


# direct methods
.method constructor <init>(Lcom/roidapp/imagelib/crop/ImageViewTouchBase;JFFFFFF)V
    .locals 2

    .prologue
    .line 329
    iput-object p1, p0, Lcom/roidapp/imagelib/crop/s;->i:Lcom/roidapp/imagelib/crop/ImageViewTouchBase;

    const/high16 v0, 0x43960000    # 300.0f

    iput v0, p0, Lcom/roidapp/imagelib/crop/s;->a:F

    iput-wide p2, p0, Lcom/roidapp/imagelib/crop/s;->b:J

    iput p4, p0, Lcom/roidapp/imagelib/crop/s;->c:F

    iput p5, p0, Lcom/roidapp/imagelib/crop/s;->d:F

    iput p6, p0, Lcom/roidapp/imagelib/crop/s;->e:F

    iput p7, p0, Lcom/roidapp/imagelib/crop/s;->f:F

    iput p8, p0, Lcom/roidapp/imagelib/crop/s;->g:F

    iput p9, p0, Lcom/roidapp/imagelib/crop/s;->h:F

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    .prologue
    .line 331
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 332
    iget v2, p0, Lcom/roidapp/imagelib/crop/s;->a:F

    iget-wide v4, p0, Lcom/roidapp/imagelib/crop/s;->b:J

    sub-long/2addr v0, v4

    long-to-float v0, v0

    invoke-static {v2, v0}, Ljava/lang/Math;->min(FF)F

    move-result v6

    .line 333
    iget v0, p0, Lcom/roidapp/imagelib/crop/s;->c:F

    iget v1, p0, Lcom/roidapp/imagelib/crop/s;->d:F

    mul-float/2addr v1, v6

    add-float/2addr v1, v0

    .line 334
    iget v0, p0, Lcom/roidapp/imagelib/crop/s;->e:F

    mul-float v4, v0, v6

    .line 335
    iget v0, p0, Lcom/roidapp/imagelib/crop/s;->f:F

    mul-float v5, v0, v6

    .line 336
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/s;->i:Lcom/roidapp/imagelib/crop/ImageViewTouchBase;

    iget v2, p0, Lcom/roidapp/imagelib/crop/s;->g:F

    iget v3, p0, Lcom/roidapp/imagelib/crop/s;->h:F

    invoke-virtual/range {v0 .. v5}, Lcom/roidapp/imagelib/crop/ImageViewTouchBase;->a(FFFFF)V

    .line 338
    iget v0, p0, Lcom/roidapp/imagelib/crop/s;->a:F

    cmpg-float v0, v6, v0

    if-gez v0, :cond_0

    .line 339
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/s;->i:Lcom/roidapp/imagelib/crop/ImageViewTouchBase;

    iget-object v0, v0, Lcom/roidapp/imagelib/crop/ImageViewTouchBase;->m:Landroid/os/Handler;

    invoke-virtual {v0, p0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 341
    :cond_0
    return-void
.end method
