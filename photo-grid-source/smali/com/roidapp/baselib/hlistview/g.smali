.class final Lcom/roidapp/baselib/hlistview/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/roidapp/baselib/hlistview/AbsHListView;

.field private final b:Lcom/roidapp/baselib/hlistview/ad;

.field private c:I

.field private final d:Ljava/lang/Runnable;


# direct methods
.method constructor <init>(Lcom/roidapp/baselib/hlistview/AbsHListView;)V
    .locals 2

    .prologue
    .line 3708
    iput-object p1, p0, Lcom/roidapp/baselib/hlistview/g;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3681
    new-instance v0, Lcom/roidapp/baselib/hlistview/h;

    invoke-direct {v0, p0}, Lcom/roidapp/baselib/hlistview/h;-><init>(Lcom/roidapp/baselib/hlistview/g;)V

    iput-object v0, p0, Lcom/roidapp/baselib/hlistview/g;->d:Ljava/lang/Runnable;

    .line 3709
    new-instance v0, Lcom/roidapp/baselib/hlistview/ad;

    invoke-virtual {p1}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/roidapp/baselib/hlistview/ad;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/roidapp/baselib/hlistview/g;->b:Lcom/roidapp/baselib/hlistview/ad;

    .line 3710
    return-void
.end method

.method static synthetic a(Lcom/roidapp/baselib/hlistview/g;)Lcom/roidapp/baselib/hlistview/ad;
    .locals 1

    .prologue
    .line 3669
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/g;->b:Lcom/roidapp/baselib/hlistview/ad;

    return-object v0
.end method


# virtual methods
.method final a()V
    .locals 2

    .prologue
    .line 3722
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/g;->b:Lcom/roidapp/baselib/hlistview/ad;

    iget-object v1, p0, Lcom/roidapp/baselib/hlistview/g;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    invoke-virtual {v1}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getScrollX()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/roidapp/baselib/hlistview/ad;->a(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3723
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/g;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    const/4 v1, 0x6

    iput v1, v0, Lcom/roidapp/baselib/hlistview/AbsHListView;->F:I

    .line 3724
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/g;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    invoke-virtual {v0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->invalidate()V

    .line 3725
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/g;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    iget-object v0, v0, Lcom/roidapp/baselib/hlistview/AbsHListView;->a:Lcom/roidapp/baselib/hlistview/ag;

    invoke-virtual {v0, p0}, Lcom/roidapp/baselib/hlistview/ag;->a(Ljava/lang/Runnable;)V

    .line 3730
    :goto_0
    return-void

    .line 3727
    :cond_0
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/g;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    const/4 v1, -0x1

    iput v1, v0, Lcom/roidapp/baselib/hlistview/AbsHListView;->F:I

    .line 3728
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/g;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/roidapp/baselib/hlistview/AbsHListView;->b(I)V

    goto :goto_0
.end method

.method final a(I)V
    .locals 7

    .prologue
    const v5, 0x7fffffff

    const/4 v3, 0x0

    .line 3713
    if-gez p1, :cond_0

    move v1, v5

    .line 3714
    :goto_0
    iput v1, p0, Lcom/roidapp/baselib/hlistview/g;->c:I

    .line 3715
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/g;->b:Lcom/roidapp/baselib/hlistview/ad;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Lcom/roidapp/baselib/hlistview/ad;->a(Landroid/view/animation/Interpolator;)V

    .line 3716
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/g;->b:Lcom/roidapp/baselib/hlistview/ad;

    move v2, p1

    move v4, v3

    move v6, v3

    .line 4428
    invoke-virtual/range {v0 .. v6}, Lcom/roidapp/baselib/hlistview/ad;->a(IIIIII)V

    .line 3717
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/g;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    const/4 v1, 0x4

    iput v1, v0, Lcom/roidapp/baselib/hlistview/AbsHListView;->F:I

    .line 3718
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/g;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    iget-object v0, v0, Lcom/roidapp/baselib/hlistview/AbsHListView;->a:Lcom/roidapp/baselib/hlistview/ag;

    invoke-virtual {v0, p0}, Lcom/roidapp/baselib/hlistview/ag;->a(Ljava/lang/Runnable;)V

    .line 3719
    return-void

    :cond_0
    move v1, v3

    .line 3713
    goto :goto_0
.end method

.method final a(IIZ)V
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 3762
    if-gez p1, :cond_0

    const v0, 0x7fffffff

    .line 3763
    :goto_0
    iput v0, p0, Lcom/roidapp/baselib/hlistview/g;->c:I

    .line 3764
    iget-object v3, p0, Lcom/roidapp/baselib/hlistview/g;->b:Lcom/roidapp/baselib/hlistview/ad;

    if-eqz p3, :cond_1

    sget-object v2, Lcom/roidapp/baselib/hlistview/AbsHListView;->T:Landroid/view/animation/Interpolator;

    :goto_1
    invoke-virtual {v3, v2}, Lcom/roidapp/baselib/hlistview/ad;->a(Landroid/view/animation/Interpolator;)V

    .line 3765
    iget-object v2, p0, Lcom/roidapp/baselib/hlistview/g;->b:Lcom/roidapp/baselib/hlistview/ad;

    invoke-virtual {v2, v0, v1, p1, p2}, Lcom/roidapp/baselib/hlistview/ad;->a(IIII)V

    .line 3766
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/g;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    const/4 v1, 0x4

    iput v1, v0, Lcom/roidapp/baselib/hlistview/AbsHListView;->F:I

    .line 3767
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/g;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    iget-object v0, v0, Lcom/roidapp/baselib/hlistview/AbsHListView;->a:Lcom/roidapp/baselib/hlistview/ag;

    invoke-virtual {v0, p0}, Lcom/roidapp/baselib/hlistview/ag;->a(Ljava/lang/Runnable;)V

    .line 3768
    return-void

    :cond_0
    move v0, v1

    .line 3762
    goto :goto_0

    .line 3764
    :cond_1
    const/4 v2, 0x0

    goto :goto_1
.end method

.method final b()V
    .locals 2

    .prologue
    .line 3771
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/g;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    const/4 v1, -0x1

    iput v1, v0, Lcom/roidapp/baselib/hlistview/AbsHListView;->F:I

    .line 3773
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/g;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    invoke-virtual {v0, p0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 3774
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/g;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    iget-object v1, p0, Lcom/roidapp/baselib/hlistview/g;->d:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Lcom/roidapp/baselib/hlistview/AbsHListView;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 3776
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/g;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/roidapp/baselib/hlistview/AbsHListView;->b(I)V

    .line 3777
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/g;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    invoke-static {v0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->k(Lcom/roidapp/baselib/hlistview/AbsHListView;)V

    .line 3778
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/g;->b:Lcom/roidapp/baselib/hlistview/ad;

    invoke-virtual {v0}, Lcom/roidapp/baselib/hlistview/ad;->f()V

    .line 3780
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/g;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    invoke-static {v0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->l(Lcom/roidapp/baselib/hlistview/AbsHListView;)Z

    .line 3782
    return-void
.end method

.method final b(I)V
    .locals 7

    .prologue
    const/4 v3, 0x0

    .line 3733
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/g;->b:Lcom/roidapp/baselib/hlistview/ad;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/roidapp/baselib/hlistview/ad;->a(Landroid/view/animation/Interpolator;)V

    .line 3734
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/g;->b:Lcom/roidapp/baselib/hlistview/ad;

    iget-object v1, p0, Lcom/roidapp/baselib/hlistview/g;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    invoke-virtual {v1}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getScrollX()I

    move-result v1

    const/high16 v4, -0x80000000

    iget-object v2, p0, Lcom/roidapp/baselib/hlistview/g;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    invoke-virtual {v2}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getWidth()I

    move-result v6

    move v2, p1

    move v5, v3

    invoke-virtual/range {v0 .. v6}, Lcom/roidapp/baselib/hlistview/ad;->a(IIIIII)V

    .line 3735
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/g;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    const/4 v1, 0x6

    iput v1, v0, Lcom/roidapp/baselib/hlistview/AbsHListView;->F:I

    .line 3736
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/g;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    invoke-virtual {v0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->invalidate()V

    .line 3737
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/g;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    iget-object v0, v0, Lcom/roidapp/baselib/hlistview/AbsHListView;->a:Lcom/roidapp/baselib/hlistview/ag;

    invoke-virtual {v0, p0}, Lcom/roidapp/baselib/hlistview/ag;->a(Ljava/lang/Runnable;)V

    .line 3738
    return-void
.end method

.method final c()V
    .locals 4

    .prologue
    .line 3785
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/g;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    iget-object v1, p0, Lcom/roidapp/baselib/hlistview/g;->d:Ljava/lang/Runnable;

    const-wide/16 v2, 0x28

    invoke-virtual {v0, v1, v2, v3}, Lcom/roidapp/baselib/hlistview/AbsHListView;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 3786
    return-void
.end method

.method public final run()V
    .locals 8

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 3790
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/g;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    iget v0, v0, Lcom/roidapp/baselib/hlistview/AbsHListView;->F:I

    packed-switch v0, :pswitch_data_0

    .line 3792
    :pswitch_0
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/g;->b()V

    .line 3901
    :cond_0
    :goto_0
    return-void

    .line 3796
    :pswitch_1
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/g;->b:Lcom/roidapp/baselib/hlistview/ad;

    invoke-virtual {v0}, Lcom/roidapp/baselib/hlistview/ad;->a()Z

    move-result v0

    if-nez v0, :cond_0

    .line 3801
    :pswitch_2
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/g;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    iget-boolean v0, v0, Lcom/roidapp/baselib/hlistview/AbsHListView;->aj:Z

    if-eqz v0, :cond_1

    .line 3802
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/g;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    invoke-virtual {v0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->d()V

    .line 3805
    :cond_1
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/g;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    iget v0, v0, Lcom/roidapp/baselib/hlistview/AbsHListView;->ao:I

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/g;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    invoke-virtual {v0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getChildCount()I

    move-result v0

    if-nez v0, :cond_3

    .line 3806
    :cond_2
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/g;->b()V

    goto :goto_0

    .line 3810
    :cond_3
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/g;->b:Lcom/roidapp/baselib/hlistview/ad;

    .line 3811
    invoke-virtual {v0}, Lcom/roidapp/baselib/hlistview/ad;->e()Z

    move-result v4

    .line 3812
    invoke-virtual {v0}, Lcom/roidapp/baselib/hlistview/ad;->c()I

    move-result v5

    .line 3816
    iget v0, p0, Lcom/roidapp/baselib/hlistview/g;->c:I

    sub-int/2addr v0, v5

    .line 3819
    if-lez v0, :cond_8

    .line 3821
    iget-object v1, p0, Lcom/roidapp/baselib/hlistview/g;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    iget-object v6, p0, Lcom/roidapp/baselib/hlistview/g;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    iget v6, v6, Lcom/roidapp/baselib/hlistview/AbsHListView;->V:I

    iput v6, v1, Lcom/roidapp/baselib/hlistview/AbsHListView;->A:I

    .line 3822
    iget-object v1, p0, Lcom/roidapp/baselib/hlistview/g;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    invoke-virtual {v1, v2}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    .line 3823
    iget-object v6, p0, Lcom/roidapp/baselib/hlistview/g;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    invoke-virtual {v1}, Landroid/view/View;->getLeft()I

    move-result v1

    iput v1, v6, Lcom/roidapp/baselib/hlistview/AbsHListView;->B:I

    .line 3826
    iget-object v1, p0, Lcom/roidapp/baselib/hlistview/g;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    invoke-virtual {v1}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getWidth()I

    move-result v1

    iget-object v6, p0, Lcom/roidapp/baselib/hlistview/g;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    invoke-virtual {v6}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getPaddingRight()I

    move-result v6

    sub-int/2addr v1, v6

    iget-object v6, p0, Lcom/roidapp/baselib/hlistview/g;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    invoke-virtual {v6}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getPaddingLeft()I

    move-result v6

    sub-int/2addr v1, v6

    add-int/lit8 v1, v1, -0x1

    invoke-static {v1, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    .line 3840
    :goto_1
    iget-object v1, p0, Lcom/roidapp/baselib/hlistview/g;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    iget-object v6, p0, Lcom/roidapp/baselib/hlistview/g;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    iget v6, v6, Lcom/roidapp/baselib/hlistview/AbsHListView;->A:I

    iget-object v7, p0, Lcom/roidapp/baselib/hlistview/g;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    iget v7, v7, Lcom/roidapp/baselib/hlistview/AbsHListView;->V:I

    sub-int/2addr v6, v7

    invoke-virtual {v1, v6}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getChildAt(I)Landroid/view/View;

    move-result-object v6

    .line 3842
    if-eqz v6, :cond_15

    .line 3843
    invoke-virtual {v6}, Landroid/view/View;->getLeft()I

    move-result v1

    .line 3847
    :goto_2
    iget-object v7, p0, Lcom/roidapp/baselib/hlistview/g;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    invoke-virtual {v7, v0, v0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->a(II)Z

    move-result v7

    .line 3848
    if-eqz v7, :cond_4

    if-eqz v0, :cond_4

    move v2, v3

    .line 3849
    :cond_4
    if-eqz v2, :cond_b

    .line 3850
    if-eqz v6, :cond_5

    .line 3852
    invoke-virtual {v6}, Landroid/view/View;->getLeft()I

    move-result v2

    sub-int v1, v2, v1

    sub-int v1, v0, v1

    neg-int v1, v1

    .line 3853
    iget-object v2, p0, Lcom/roidapp/baselib/hlistview/g;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    iget-object v5, p0, Lcom/roidapp/baselib/hlistview/g;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    invoke-virtual {v5}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getScrollX()I

    move-result v5

    iget-object v6, p0, Lcom/roidapp/baselib/hlistview/g;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    iget v6, v6, Lcom/roidapp/baselib/hlistview/AbsHListView;->R:I

    invoke-static {v2, v1, v5, v6}, Lcom/roidapp/baselib/hlistview/AbsHListView;->a(Lcom/roidapp/baselib/hlistview/AbsHListView;III)Z

    .line 3855
    :cond_5
    if-eqz v4, :cond_0

    .line 4741
    iget-object v1, p0, Lcom/roidapp/baselib/hlistview/g;->b:Lcom/roidapp/baselib/hlistview/ad;

    iget-object v2, p0, Lcom/roidapp/baselib/hlistview/g;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    invoke-virtual {v2}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getScrollX()I

    move-result v2

    iget-object v4, p0, Lcom/roidapp/baselib/hlistview/g;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    iget v4, v4, Lcom/roidapp/baselib/hlistview/AbsHListView;->R:I

    invoke-virtual {v1, v2, v4}, Lcom/roidapp/baselib/hlistview/ad;->a(II)V

    .line 4742
    iget-object v1, p0, Lcom/roidapp/baselib/hlistview/g;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    invoke-virtual {v1}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getOverScrollMode()I

    move-result v1

    .line 4743
    if-eqz v1, :cond_6

    if-ne v1, v3, :cond_a

    iget-object v1, p0, Lcom/roidapp/baselib/hlistview/g;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    invoke-static {v1}, Lcom/roidapp/baselib/hlistview/AbsHListView;->h(Lcom/roidapp/baselib/hlistview/AbsHListView;)Z

    move-result v1

    if-nez v1, :cond_a

    .line 4744
    :cond_6
    iget-object v1, p0, Lcom/roidapp/baselib/hlistview/g;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    const/4 v2, 0x6

    iput v2, v1, Lcom/roidapp/baselib/hlistview/AbsHListView;->F:I

    .line 4745
    iget-object v1, p0, Lcom/roidapp/baselib/hlistview/g;->b:Lcom/roidapp/baselib/hlistview/ad;

    invoke-virtual {v1}, Lcom/roidapp/baselib/hlistview/ad;->d()F

    move-result v1

    float-to-int v1, v1

    .line 4746
    if-lez v0, :cond_9

    .line 4747
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/g;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    invoke-static {v0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->i(Lcom/roidapp/baselib/hlistview/AbsHListView;)Lcom/roidapp/baselib/hlistview/w;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/roidapp/baselib/hlistview/w;->a(I)V

    .line 4757
    :cond_7
    :goto_3
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/g;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    invoke-virtual {v0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->invalidate()V

    .line 4758
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/g;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    iget-object v0, v0, Lcom/roidapp/baselib/hlistview/AbsHListView;->a:Lcom/roidapp/baselib/hlistview/ag;

    invoke-virtual {v0, p0}, Lcom/roidapp/baselib/hlistview/ag;->a(Ljava/lang/Runnable;)V

    goto/16 :goto_0

    .line 3829
    :cond_8
    iget-object v1, p0, Lcom/roidapp/baselib/hlistview/g;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    invoke-virtual {v1}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getChildCount()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    .line 3830
    iget-object v6, p0, Lcom/roidapp/baselib/hlistview/g;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    iget-object v7, p0, Lcom/roidapp/baselib/hlistview/g;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    iget v7, v7, Lcom/roidapp/baselib/hlistview/AbsHListView;->V:I

    add-int/2addr v7, v1

    iput v7, v6, Lcom/roidapp/baselib/hlistview/AbsHListView;->A:I

    .line 3832
    iget-object v6, p0, Lcom/roidapp/baselib/hlistview/g;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    invoke-virtual {v6, v1}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    .line 3833
    iget-object v6, p0, Lcom/roidapp/baselib/hlistview/g;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    invoke-virtual {v1}, Landroid/view/View;->getLeft()I

    move-result v1

    iput v1, v6, Lcom/roidapp/baselib/hlistview/AbsHListView;->B:I

    .line 3836
    iget-object v1, p0, Lcom/roidapp/baselib/hlistview/g;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    invoke-virtual {v1}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getWidth()I

    move-result v1

    iget-object v6, p0, Lcom/roidapp/baselib/hlistview/g;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    invoke-virtual {v6}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getPaddingRight()I

    move-result v6

    sub-int/2addr v1, v6

    iget-object v6, p0, Lcom/roidapp/baselib/hlistview/g;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    invoke-virtual {v6}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getPaddingLeft()I

    move-result v6

    sub-int/2addr v1, v6

    add-int/lit8 v1, v1, -0x1

    neg-int v1, v1

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    goto/16 :goto_1

    .line 4749
    :cond_9
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/g;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    invoke-static {v0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->j(Lcom/roidapp/baselib/hlistview/AbsHListView;)Lcom/roidapp/baselib/hlistview/w;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/roidapp/baselib/hlistview/w;->a(I)V

    goto :goto_3

    .line 4752
    :cond_a
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/g;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    const/4 v1, -0x1

    iput v1, v0, Lcom/roidapp/baselib/hlistview/AbsHListView;->F:I

    .line 4753
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/g;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    iget-object v0, v0, Lcom/roidapp/baselib/hlistview/AbsHListView;->I:Lcom/roidapp/baselib/hlistview/l;

    if-eqz v0, :cond_7

    .line 4754
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/g;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    iget-object v0, v0, Lcom/roidapp/baselib/hlistview/AbsHListView;->I:Lcom/roidapp/baselib/hlistview/l;

    invoke-virtual {v0}, Lcom/roidapp/baselib/hlistview/l;->a()V

    goto :goto_3

    .line 3861
    :cond_b
    if-eqz v4, :cond_d

    if-nez v2, :cond_d

    .line 3862
    if-eqz v7, :cond_c

    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/g;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    invoke-virtual {v0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->invalidate()V

    .line 3863
    :cond_c
    iput v5, p0, Lcom/roidapp/baselib/hlistview/g;->c:I

    .line 3864
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/g;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    iget-object v0, v0, Lcom/roidapp/baselib/hlistview/AbsHListView;->a:Lcom/roidapp/baselib/hlistview/ag;

    invoke-virtual {v0, p0}, Lcom/roidapp/baselib/hlistview/ag;->a(Ljava/lang/Runnable;)V

    goto/16 :goto_0

    .line 3866
    :cond_d
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/g;->b()V

    goto/16 :goto_0

    .line 3873
    :pswitch_3
    iget-object v1, p0, Lcom/roidapp/baselib/hlistview/g;->b:Lcom/roidapp/baselib/hlistview/ad;

    .line 3874
    invoke-virtual {v1}, Lcom/roidapp/baselib/hlistview/ad;->e()Z

    move-result v0

    if-eqz v0, :cond_14

    .line 3875
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/g;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    invoke-virtual {v0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getScrollX()I

    move-result v4

    .line 3876
    invoke-virtual {v1}, Lcom/roidapp/baselib/hlistview/ad;->c()I

    move-result v5

    .line 3877
    sub-int v0, v5, v4

    .line 3878
    iget-object v6, p0, Lcom/roidapp/baselib/hlistview/g;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    iget-object v7, p0, Lcom/roidapp/baselib/hlistview/g;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    iget v7, v7, Lcom/roidapp/baselib/hlistview/AbsHListView;->R:I

    invoke-static {v6, v0, v4, v7}, Lcom/roidapp/baselib/hlistview/AbsHListView;->b(Lcom/roidapp/baselib/hlistview/AbsHListView;III)Z

    move-result v0

    if-eqz v0, :cond_13

    .line 3879
    if-gtz v4, :cond_11

    if-lez v5, :cond_11

    move v0, v3

    .line 3880
    :goto_4
    if-ltz v4, :cond_e

    if-gez v5, :cond_e

    move v2, v3

    .line 3881
    :cond_e
    if-nez v0, :cond_f

    if-eqz v2, :cond_12

    .line 3882
    :cond_f
    invoke-virtual {v1}, Lcom/roidapp/baselib/hlistview/ad;->d()F

    move-result v0

    float-to-int v0, v0

    .line 3883
    if-eqz v2, :cond_10

    neg-int v0, v0

    .line 3886
    :cond_10
    invoke-virtual {v1}, Lcom/roidapp/baselib/hlistview/ad;->f()V

    .line 3887
    invoke-virtual {p0, v0}, Lcom/roidapp/baselib/hlistview/g;->a(I)V

    goto/16 :goto_0

    :cond_11
    move v0, v2

    .line 3879
    goto :goto_4

    .line 3889
    :cond_12
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/g;->a()V

    goto/16 :goto_0

    .line 3892
    :cond_13
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/g;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    invoke-virtual {v0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->invalidate()V

    .line 3893
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/g;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    iget-object v0, v0, Lcom/roidapp/baselib/hlistview/AbsHListView;->a:Lcom/roidapp/baselib/hlistview/ag;

    invoke-virtual {v0, p0}, Lcom/roidapp/baselib/hlistview/ag;->a(Ljava/lang/Runnable;)V

    goto/16 :goto_0

    .line 3896
    :cond_14
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/g;->b()V

    goto/16 :goto_0

    :cond_15
    move v1, v2

    goto/16 :goto_2

    .line 3790
    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_1
        :pswitch_2
        :pswitch_0
        :pswitch_3
    .end packed-switch
.end method
