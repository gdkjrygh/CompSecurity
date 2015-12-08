.class final Lkik/android/widget/PullToRevealView$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkik/android/widget/PullToRevealView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "c"
.end annotation


# instance fields
.field final synthetic a:Lkik/android/widget/PullToRevealView;

.field private final b:Landroid/view/animation/Interpolator;

.field private final c:I

.field private final d:I

.field private final e:J

.field private f:Lkik/android/widget/PullToRevealView$b;

.field private g:Z

.field private h:J

.field private i:I


# direct methods
.method public constructor <init>(Lkik/android/widget/PullToRevealView;IIJLkik/android/widget/PullToRevealView$b;)V
    .locals 2

    .prologue
    .line 456
    iput-object p1, p0, Lkik/android/widget/PullToRevealView$c;->a:Lkik/android/widget/PullToRevealView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 451
    const/4 v0, 0x1

    iput-boolean v0, p0, Lkik/android/widget/PullToRevealView$c;->g:Z

    .line 452
    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lkik/android/widget/PullToRevealView$c;->h:J

    .line 453
    const/4 v0, -0x1

    iput v0, p0, Lkik/android/widget/PullToRevealView$c;->i:I

    .line 457
    iput p2, p0, Lkik/android/widget/PullToRevealView$c;->d:I

    .line 458
    iput p3, p0, Lkik/android/widget/PullToRevealView$c;->c:I

    .line 459
    invoke-static {p1}, Lkik/android/widget/PullToRevealView;->c(Lkik/android/widget/PullToRevealView;)Landroid/view/animation/Interpolator;

    move-result-object v0

    iput-object v0, p0, Lkik/android/widget/PullToRevealView$c;->b:Landroid/view/animation/Interpolator;

    .line 460
    iput-wide p4, p0, Lkik/android/widget/PullToRevealView$c;->e:J

    .line 461
    iput-object p6, p0, Lkik/android/widget/PullToRevealView$c;->f:Lkik/android/widget/PullToRevealView$b;

    .line 462
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    .prologue
    .line 514
    const/4 v0, 0x0

    iput-boolean v0, p0, Lkik/android/widget/PullToRevealView$c;->g:Z

    .line 515
    return-void
.end method

.method public final run()V
    .locals 8

    .prologue
    const-wide/16 v6, 0x3e8

    const/4 v0, 0x0

    .line 472
    iget-wide v2, p0, Lkik/android/widget/PullToRevealView$c;->h:J

    const-wide/16 v4, -0x1

    cmp-long v1, v2, v4

    if-nez v1, :cond_1

    .line 473
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iput-wide v2, p0, Lkik/android/widget/PullToRevealView$c;->h:J

    .line 495
    :goto_0
    iget-boolean v1, p0, Lkik/android/widget/PullToRevealView$c;->g:Z

    if-eqz v1, :cond_3

    iget v1, p0, Lkik/android/widget/PullToRevealView$c;->c:I

    iget v2, p0, Lkik/android/widget/PullToRevealView$c;->i:I

    if-eq v1, v2, :cond_3

    .line 496
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x10

    if-lt v0, v1, :cond_2

    .line 497
    iget-object v0, p0, Lkik/android/widget/PullToRevealView$c;->a:Lkik/android/widget/PullToRevealView;

    invoke-virtual {v0, p0}, Lkik/android/widget/PullToRevealView;->postOnAnimation(Ljava/lang/Runnable;)V

    .line 510
    :cond_0
    :goto_1
    return-void

    .line 482
    :cond_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iget-wide v4, p0, Lkik/android/widget/PullToRevealView$c;->h:J

    sub-long/2addr v2, v4

    mul-long/2addr v2, v6

    iget-wide v4, p0, Lkik/android/widget/PullToRevealView$c;->e:J

    div-long/2addr v2, v4

    .line 483
    invoke-static {v2, v3, v6, v7}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v2

    const-wide/16 v4, 0x0

    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v2

    .line 485
    iget v1, p0, Lkik/android/widget/PullToRevealView$c;->d:I

    iget v4, p0, Lkik/android/widget/PullToRevealView$c;->c:I

    sub-int/2addr v1, v4

    int-to-float v1, v1

    iget-object v4, p0, Lkik/android/widget/PullToRevealView$c;->b:Landroid/view/animation/Interpolator;

    long-to-float v2, v2

    const/high16 v3, 0x447a0000    # 1000.0f

    div-float/2addr v2, v3

    invoke-interface {v4, v2}, Landroid/view/animation/Interpolator;->getInterpolation(F)F

    move-result v2

    mul-float/2addr v1, v2

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    .line 487
    iget v2, p0, Lkik/android/widget/PullToRevealView$c;->d:I

    sub-int v1, v2, v1

    iput v1, p0, Lkik/android/widget/PullToRevealView$c;->i:I

    .line 488
    iget-object v1, p0, Lkik/android/widget/PullToRevealView$c;->a:Lkik/android/widget/PullToRevealView;

    iget v2, p0, Lkik/android/widget/PullToRevealView$c;->i:I

    invoke-virtual {v1, v0, v2}, Lkik/android/widget/PullToRevealView;->scrollTo(II)V

    .line 490
    iget v1, p0, Lkik/android/widget/PullToRevealView$c;->i:I

    neg-int v1, v1

    int-to-float v1, v1

    invoke-static {}, Lkik/android/widget/PullToRevealView;->f()I

    move-result v2

    int-to-float v2, v2

    div-float/2addr v1, v2

    .line 491
    iget-object v2, p0, Lkik/android/widget/PullToRevealView$c;->a:Lkik/android/widget/PullToRevealView;

    invoke-virtual {v2, v1}, Lkik/android/widget/PullToRevealView;->a(F)V

    goto :goto_0

    .line 501
    :cond_2
    iget-object v0, p0, Lkik/android/widget/PullToRevealView$c;->a:Lkik/android/widget/PullToRevealView;

    const-wide/16 v2, 0x10

    invoke-virtual {v0, p0, v2, v3}, Lkik/android/widget/PullToRevealView;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_1

    .line 505
    :cond_3
    iget-object v1, p0, Lkik/android/widget/PullToRevealView$c;->f:Lkik/android/widget/PullToRevealView$b;

    if-eqz v1, :cond_0

    .line 507
    iget-object v1, p0, Lkik/android/widget/PullToRevealView$c;->f:Lkik/android/widget/PullToRevealView$b;

    iget-boolean v2, p0, Lkik/android/widget/PullToRevealView$c;->g:Z

    if-nez v2, :cond_4

    const/4 v0, 0x1

    :cond_4
    invoke-interface {v1, v0}, Lkik/android/widget/PullToRevealView$b;->a(Z)V

    goto :goto_1
.end method
