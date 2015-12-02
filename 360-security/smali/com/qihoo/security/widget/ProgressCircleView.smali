.class public Lcom/qihoo/security/widget/ProgressCircleView;
.super Landroid/widget/ImageView;
.source "360Security"


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 16
    invoke-direct {p0, p1, p2}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 17
    invoke-virtual {p0}, Lcom/qihoo/security/widget/ProgressCircleView;->isInEditMode()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 24
    :cond_0
    :goto_0
    return-void

    .line 20
    :cond_1
    const v0, 0x7f0200e8

    invoke-virtual {p0, v0}, Lcom/qihoo/security/widget/ProgressCircleView;->setBackgroundResource(I)V

    .line 21
    invoke-virtual {p0}, Lcom/qihoo/security/widget/ProgressCircleView;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    .line 22
    invoke-direct {p0}, Lcom/qihoo/security/widget/ProgressCircleView;->a()V

    goto :goto_0
.end method

.method private a()V
    .locals 7

    .prologue
    const/high16 v4, 0x3f000000    # 0.5f

    const/4 v3, 0x1

    .line 64
    new-instance v0, Landroid/view/animation/RotateAnimation;

    const/4 v1, 0x0

    const/high16 v2, 0x43b40000    # 360.0f

    move v5, v3

    move v6, v4

    invoke-direct/range {v0 .. v6}, Landroid/view/animation/RotateAnimation;-><init>(FFIFIF)V

    .line 66
    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/view/animation/Animation;->setRepeatCount(I)V

    .line 67
    const-wide/16 v4, 0x3e8

    invoke-virtual {v0, v4, v5}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 68
    invoke-virtual {v0, v3}, Landroid/view/animation/Animation;->setRepeatMode(I)V

    .line 69
    new-instance v1, Landroid/view/animation/LinearInterpolator;

    invoke-direct {v1}, Landroid/view/animation/LinearInterpolator;-><init>()V

    invoke-virtual {v0, v1}, Landroid/view/animation/Animation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 70
    invoke-virtual {p0, v0}, Lcom/qihoo/security/widget/ProgressCircleView;->startAnimation(Landroid/view/animation/Animation;)V

    .line 71
    return-void
.end method

.method private b()V
    .locals 0

    .prologue
    .line 74
    invoke-virtual {p0}, Lcom/qihoo/security/widget/ProgressCircleView;->clearAnimation()V

    .line 75
    return-void
.end method


# virtual methods
.method protected onVisibilityChanged(Landroid/view/View;I)V
    .locals 2

    .prologue
    .line 51
    invoke-super {p0, p1, p2}, Landroid/widget/ImageView;->onVisibilityChanged(Landroid/view/View;I)V

    .line 52
    if-eq p1, p0, :cond_0

    .line 61
    :goto_0
    return-void

    .line 56
    :cond_0
    invoke-virtual {p0}, Lcom/qihoo/security/widget/ProgressCircleView;->getVisibility()I

    move-result v0

    const/16 v1, 0x8

    if-eq v0, v1, :cond_1

    invoke-virtual {p0}, Lcom/qihoo/security/widget/ProgressCircleView;->getVisibility()I

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_2

    .line 57
    :cond_1
    invoke-direct {p0}, Lcom/qihoo/security/widget/ProgressCircleView;->b()V

    goto :goto_0

    .line 59
    :cond_2
    invoke-direct {p0}, Lcom/qihoo/security/widget/ProgressCircleView;->a()V

    goto :goto_0
.end method

.method protected onWindowVisibilityChanged(I)V
    .locals 3

    .prologue
    const/16 v2, 0x8

    const/4 v1, 0x4

    .line 41
    if-eq p1, v2, :cond_0

    if-eq p1, v1, :cond_0

    invoke-virtual {p0}, Lcom/qihoo/security/widget/ProgressCircleView;->getVisibility()I

    move-result v0

    if-eq v0, v2, :cond_0

    invoke-virtual {p0}, Lcom/qihoo/security/widget/ProgressCircleView;->getVisibility()I

    move-result v0

    if-ne v0, v1, :cond_1

    .line 42
    :cond_0
    invoke-direct {p0}, Lcom/qihoo/security/widget/ProgressCircleView;->b()V

    .line 46
    :goto_0
    invoke-super {p0, p1}, Landroid/widget/ImageView;->onWindowVisibilityChanged(I)V

    .line 47
    return-void

    .line 44
    :cond_1
    invoke-direct {p0}, Lcom/qihoo/security/widget/ProgressCircleView;->a()V

    goto :goto_0
.end method

.method public setProgressBackground(I)V
    .locals 0

    .prologue
    .line 78
    invoke-virtual {p0, p1}, Lcom/qihoo/security/widget/ProgressCircleView;->setBackgroundResource(I)V

    .line 79
    return-void
.end method

.method public setVisibility(I)V
    .locals 1

    .prologue
    .line 28
    invoke-virtual {p0}, Lcom/qihoo/security/widget/ProgressCircleView;->getVisibility()I

    move-result v0

    if-eq v0, p1, :cond_1

    .line 29
    invoke-super {p0, p1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 31
    const/16 v0, 0x8

    if-eq p1, v0, :cond_0

    const/4 v0, 0x4

    if-ne p1, v0, :cond_2

    .line 32
    :cond_0
    invoke-direct {p0}, Lcom/qihoo/security/widget/ProgressCircleView;->b()V

    .line 37
    :cond_1
    :goto_0
    return-void

    .line 34
    :cond_2
    invoke-direct {p0}, Lcom/qihoo/security/widget/ProgressCircleView;->a()V

    goto :goto_0
.end method
