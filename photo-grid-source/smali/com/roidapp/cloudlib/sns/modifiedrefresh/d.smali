.class final Lcom/roidapp/cloudlib/sns/modifiedrefresh/d;
.super Landroid/view/animation/Animation;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/roidapp/cloudlib/sns/modifiedrefresh/g;

.field final synthetic b:Lcom/roidapp/cloudlib/sns/modifiedrefresh/c;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/sns/modifiedrefresh/c;Lcom/roidapp/cloudlib/sns/modifiedrefresh/g;)V
    .locals 0

    .prologue
    .line 364
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/d;->b:Lcom/roidapp/cloudlib/sns/modifiedrefresh/c;

    iput-object p2, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/d;->a:Lcom/roidapp/cloudlib/sns/modifiedrefresh/g;

    invoke-direct {p0}, Landroid/view/animation/Animation;-><init>()V

    return-void
.end method


# virtual methods
.method public final applyTransformation(FLandroid/view/animation/Transformation;)V
    .locals 9

    .prologue
    const v8, 0x3f4ccccd    # 0.8f

    const/high16 v7, 0x3f000000    # 0.5f

    .line 367
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/d;->b:Lcom/roidapp/cloudlib/sns/modifiedrefresh/c;

    iget-boolean v0, v0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/c;->a:Z

    if-eqz v0, :cond_0

    .line 368
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/d;->a:Lcom/roidapp/cloudlib/sns/modifiedrefresh/g;

    invoke-static {p1, v0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/c;->a(FLcom/roidapp/cloudlib/sns/modifiedrefresh/g;)V

    .line 414
    :goto_0
    return-void

    .line 372
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/d;->a:Lcom/roidapp/cloudlib/sns/modifiedrefresh/g;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/c;->a(Lcom/roidapp/cloudlib/sns/modifiedrefresh/g;)F

    move-result v0

    .line 373
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/d;->a:Lcom/roidapp/cloudlib/sns/modifiedrefresh/g;

    invoke-virtual {v1}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/g;->h()F

    move-result v1

    .line 374
    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/d;->a:Lcom/roidapp/cloudlib/sns/modifiedrefresh/g;

    invoke-virtual {v2}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/g;->g()F

    move-result v2

    .line 375
    iget-object v3, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/d;->a:Lcom/roidapp/cloudlib/sns/modifiedrefresh/g;

    invoke-virtual {v3}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/g;->l()F

    move-result v3

    .line 377
    iget-object v4, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/d;->a:Lcom/roidapp/cloudlib/sns/modifiedrefresh/g;

    invoke-static {p1, v4}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/c;->b(FLcom/roidapp/cloudlib/sns/modifiedrefresh/g;)V

    .line 381
    cmpg-float v4, p1, v7

    if-gtz v4, :cond_1

    .line 385
    div-float v4, p1, v7

    .line 387
    sub-float v5, v8, v0

    invoke-static {}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/c;->c()Landroid/view/animation/Interpolator;

    move-result-object v6

    invoke-interface {v6, v4}, Landroid/view/animation/Interpolator;->getInterpolation(F)F

    move-result v4

    mul-float/2addr v4, v5

    add-float/2addr v2, v4

    .line 390
    iget-object v4, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/d;->a:Lcom/roidapp/cloudlib/sns/modifiedrefresh/g;

    invoke-virtual {v4, v2}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/g;->b(F)V

    .line 395
    :cond_1
    cmpl-float v2, p1, v7

    if-lez v2, :cond_2

    .line 399
    sub-float v0, v8, v0

    .line 400
    sub-float v2, p1, v7

    div-float/2addr v2, v7

    .line 402
    invoke-static {}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/c;->c()Landroid/view/animation/Interpolator;

    move-result-object v4

    invoke-interface {v4, v2}, Landroid/view/animation/Interpolator;->getInterpolation(F)F

    move-result v2

    mul-float/2addr v0, v2

    add-float/2addr v0, v1

    .line 404
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/d;->a:Lcom/roidapp/cloudlib/sns/modifiedrefresh/g;

    invoke-virtual {v1, v0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/g;->c(F)V

    .line 407
    :cond_2
    const/high16 v0, 0x3e800000    # 0.25f

    mul-float/2addr v0, p1

    add-float/2addr v0, v3

    .line 408
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/d;->a:Lcom/roidapp/cloudlib/sns/modifiedrefresh/g;

    invoke-virtual {v1, v0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/g;->d(F)V

    .line 410
    const/high16 v0, 0x43580000    # 216.0f

    mul-float/2addr v0, p1

    const/high16 v1, 0x44870000    # 1080.0f

    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/d;->b:Lcom/roidapp/cloudlib/sns/modifiedrefresh/c;

    invoke-static {v2}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/c;->a(Lcom/roidapp/cloudlib/sns/modifiedrefresh/c;)F

    move-result v2

    const/high16 v3, 0x40a00000    # 5.0f

    div-float/2addr v2, v3

    mul-float/2addr v1, v2

    add-float/2addr v0, v1

    .line 412
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/d;->b:Lcom/roidapp/cloudlib/sns/modifiedrefresh/c;

    invoke-virtual {v1, v0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/c;->d(F)V

    goto :goto_0
.end method
