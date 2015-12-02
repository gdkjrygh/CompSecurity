.class public abstract Lcom/facebook/orca/nux/e;
.super Lcom/facebook/widget/f;
.source "NuxPopover.java"


# instance fields
.field a:Z

.field b:Z

.field final c:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 33
    invoke-direct {p0, p1}, Lcom/facebook/widget/f;-><init>(Landroid/content/Context;)V

    .line 20
    const/16 v0, 0xfa

    iput v0, p0, Lcom/facebook/orca/nux/e;->c:I

    .line 34
    invoke-virtual {p0}, Lcom/facebook/orca/nux/e;->c()V

    .line 35
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 28
    invoke-direct {p0, p1, p2}, Lcom/facebook/widget/f;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 20
    const/16 v0, 0xfa

    iput v0, p0, Lcom/facebook/orca/nux/e;->c:I

    .line 29
    invoke-virtual {p0}, Lcom/facebook/orca/nux/e;->c()V

    .line 30
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .prologue
    .line 23
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/widget/f;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 20
    const/16 v0, 0xfa

    iput v0, p0, Lcom/facebook/orca/nux/e;->c:I

    .line 24
    invoke-virtual {p0}, Lcom/facebook/orca/nux/e;->c()V

    .line 25
    return-void
.end method

.method private b()V
    .locals 4

    .prologue
    const/4 v3, 0x1

    .line 96
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/facebook/orca/nux/e;->setVisibility(I)V

    .line 98
    new-instance v0, Landroid/view/animation/AlphaAnimation;

    const/4 v1, 0x0

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-direct {v0, v1, v2}, Landroid/view/animation/AlphaAnimation;-><init>(FF)V

    .line 99
    const-wide/16 v1, 0xfa

    invoke-virtual {v0, v1, v2}, Landroid/view/animation/AlphaAnimation;->setDuration(J)V

    .line 100
    invoke-virtual {v0, v3}, Landroid/view/animation/AlphaAnimation;->setFillAfter(Z)V

    .line 101
    invoke-virtual {v0, v3}, Landroid/view/animation/AlphaAnimation;->setFillEnabled(Z)V

    .line 102
    new-instance v1, Landroid/view/animation/LinearInterpolator;

    invoke-direct {v1}, Landroid/view/animation/LinearInterpolator;-><init>()V

    invoke-virtual {v0, v1}, Landroid/view/animation/AlphaAnimation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 103
    invoke-virtual {p0, v0}, Lcom/facebook/orca/nux/e;->startAnimation(Landroid/view/animation/Animation;)V

    .line 104
    return-void
.end method

.method private j()V
    .locals 3

    .prologue
    .line 107
    new-instance v0, Landroid/view/animation/AlphaAnimation;

    const/high16 v1, 0x3f800000    # 1.0f

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Landroid/view/animation/AlphaAnimation;-><init>(FF)V

    .line 108
    const-wide/16 v1, 0xfa

    invoke-virtual {v0, v1, v2}, Landroid/view/animation/AlphaAnimation;->setDuration(J)V

    .line 109
    new-instance v1, Landroid/view/animation/LinearInterpolator;

    invoke-direct {v1}, Landroid/view/animation/LinearInterpolator;-><init>()V

    invoke-virtual {v0, v1}, Landroid/view/animation/AlphaAnimation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 110
    new-instance v1, Lcom/facebook/orca/nux/f;

    invoke-direct {v1, p0}, Lcom/facebook/orca/nux/f;-><init>(Lcom/facebook/orca/nux/e;)V

    invoke-virtual {v0, v1}, Landroid/view/animation/AlphaAnimation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 122
    invoke-virtual {p0, v0}, Lcom/facebook/orca/nux/e;->startAnimation(Landroid/view/animation/Animation;)V

    .line 123
    return-void
.end method


# virtual methods
.method protected abstract a()V
.end method

.method protected c()V
    .locals 1

    .prologue
    .line 39
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/orca/nux/e;->a:Z

    .line 40
    const/16 v0, 0x8

    invoke-virtual {p0, v0}, Lcom/facebook/orca/nux/e;->setVisibility(I)V

    .line 43
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/facebook/orca/nux/e;->setClickable(Z)V

    .line 44
    return-void
.end method

.method protected d()V
    .locals 1

    .prologue
    .line 47
    iget-boolean v0, p0, Lcom/facebook/orca/nux/e;->b:Z

    if-eqz v0, :cond_0

    .line 52
    :goto_0
    return-void

    .line 50
    :cond_0
    invoke-virtual {p0}, Lcom/facebook/orca/nux/e;->a()V

    .line 51
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/orca/nux/e;->b:Z

    goto :goto_0
.end method

.method protected e()Z
    .locals 1

    .prologue
    .line 55
    iget-boolean v0, p0, Lcom/facebook/orca/nux/e;->b:Z

    return v0
.end method

.method f()V
    .locals 1

    .prologue
    .line 64
    invoke-virtual {p0}, Lcom/facebook/orca/nux/e;->d()V

    .line 65
    iget-boolean v0, p0, Lcom/facebook/orca/nux/e;->a:Z

    if-nez v0, :cond_0

    .line 66
    invoke-virtual {p0}, Lcom/facebook/orca/nux/e;->clearAnimation()V

    .line 67
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/orca/nux/e;->a:Z

    .line 68
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/facebook/orca/nux/e;->setVisibility(I)V

    .line 70
    :cond_0
    return-void
.end method

.method g()V
    .locals 1

    .prologue
    .line 73
    iget-boolean v0, p0, Lcom/facebook/orca/nux/e;->a:Z

    if-eqz v0, :cond_0

    .line 74
    invoke-virtual {p0}, Lcom/facebook/orca/nux/e;->clearAnimation()V

    .line 75
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/orca/nux/e;->a:Z

    .line 76
    const/16 v0, 0x8

    invoke-virtual {p0, v0}, Lcom/facebook/orca/nux/e;->setVisibility(I)V

    .line 78
    :cond_0
    return-void
.end method

.method h()V
    .locals 1

    .prologue
    .line 81
    invoke-virtual {p0}, Lcom/facebook/orca/nux/e;->d()V

    .line 82
    iget-boolean v0, p0, Lcom/facebook/orca/nux/e;->a:Z

    if-nez v0, :cond_0

    .line 83
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/orca/nux/e;->a:Z

    .line 84
    invoke-direct {p0}, Lcom/facebook/orca/nux/e;->b()V

    .line 86
    :cond_0
    return-void
.end method

.method i()V
    .locals 1

    .prologue
    .line 89
    iget-boolean v0, p0, Lcom/facebook/orca/nux/e;->a:Z

    if-eqz v0, :cond_0

    .line 90
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/orca/nux/e;->a:Z

    .line 91
    invoke-direct {p0}, Lcom/facebook/orca/nux/e;->j()V

    .line 93
    :cond_0
    return-void
.end method
