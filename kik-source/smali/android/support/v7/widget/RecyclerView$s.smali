.class final Landroid/support/v7/widget/RecyclerView$s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v7/widget/RecyclerView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "s"
.end annotation


# instance fields
.field final synthetic a:Landroid/support/v7/widget/RecyclerView;

.field private b:I

.field private c:I

.field private d:Landroid/support/v4/widget/ScrollerCompat;

.field private e:Landroid/view/animation/Interpolator;

.field private f:Z

.field private g:Z


# direct methods
.method public constructor <init>(Landroid/support/v7/widget/RecyclerView;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 3746
    iput-object p1, p0, Landroid/support/v7/widget/RecyclerView$s;->a:Landroid/support/v7/widget/RecyclerView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3737
    invoke-static {}, Landroid/support/v7/widget/RecyclerView;->g()Landroid/view/animation/Interpolator;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v7/widget/RecyclerView$s;->e:Landroid/view/animation/Interpolator;

    .line 3741
    iput-boolean v1, p0, Landroid/support/v7/widget/RecyclerView$s;->f:Z

    .line 3744
    iput-boolean v1, p0, Landroid/support/v7/widget/RecyclerView$s;->g:Z

    .line 3747
    invoke-virtual {p1}, Landroid/support/v7/widget/RecyclerView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {}, Landroid/support/v7/widget/RecyclerView;->g()Landroid/view/animation/Interpolator;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/support/v4/widget/ScrollerCompat;->create(Landroid/content/Context;Landroid/view/animation/Interpolator;)Landroid/support/v4/widget/ScrollerCompat;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v7/widget/RecyclerView$s;->d:Landroid/support/v4/widget/ScrollerCompat;

    .line 3748
    return-void
.end method


# virtual methods
.method final a()V
    .locals 1

    .prologue
    .line 3891
    iget-boolean v0, p0, Landroid/support/v7/widget/RecyclerView$s;->f:Z

    if-eqz v0, :cond_0

    .line 3892
    const/4 v0, 0x1

    iput-boolean v0, p0, Landroid/support/v7/widget/RecyclerView$s;->g:Z

    .line 3897
    :goto_0
    return-void

    .line 3894
    :cond_0
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView$s;->a:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0, p0}, Landroid/support/v7/widget/RecyclerView;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 3895
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView$s;->a:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v0, p0}, Landroid/support/v4/view/ViewCompat;->postOnAnimation(Landroid/view/View;Ljava/lang/Runnable;)V

    goto :goto_0
.end method

.method public final a(II)V
    .locals 9

    .prologue
    const v6, 0x7fffffff

    const/high16 v5, -0x80000000

    const/4 v1, 0x0

    .line 3900
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView$s;->a:Landroid/support/v7/widget/RecyclerView;

    const/4 v2, 0x2

    invoke-static {v0, v2}, Landroid/support/v7/widget/RecyclerView;->b(Landroid/support/v7/widget/RecyclerView;I)V

    .line 3901
    iput v1, p0, Landroid/support/v7/widget/RecyclerView$s;->c:I

    iput v1, p0, Landroid/support/v7/widget/RecyclerView$s;->b:I

    .line 3902
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView$s;->d:Landroid/support/v4/widget/ScrollerCompat;

    move v2, v1

    move v3, p1

    move v4, p2

    move v7, v5

    move v8, v6

    invoke-virtual/range {v0 .. v8}, Landroid/support/v4/widget/ScrollerCompat;->fling(IIIIIIII)V

    .line 3904
    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView$s;->a()V

    .line 3905
    return-void
.end method

.method public final a(III)V
    .locals 1

    .prologue
    .line 3944
    invoke-static {}, Landroid/support/v7/widget/RecyclerView;->g()Landroid/view/animation/Interpolator;

    move-result-object v0

    invoke-virtual {p0, p1, p2, p3, v0}, Landroid/support/v7/widget/RecyclerView$s;->a(IIILandroid/view/animation/Interpolator;)V

    .line 3945
    return-void
.end method

.method public final a(IIILandroid/view/animation/Interpolator;)V
    .locals 6

    .prologue
    const/4 v1, 0x0

    .line 3948
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView$s;->e:Landroid/view/animation/Interpolator;

    if-eq v0, p4, :cond_0

    .line 3949
    iput-object p4, p0, Landroid/support/v7/widget/RecyclerView$s;->e:Landroid/view/animation/Interpolator;

    .line 3950
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView$s;->a:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p4}, Landroid/support/v4/widget/ScrollerCompat;->create(Landroid/content/Context;Landroid/view/animation/Interpolator;)Landroid/support/v4/widget/ScrollerCompat;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v7/widget/RecyclerView$s;->d:Landroid/support/v4/widget/ScrollerCompat;

    .line 3952
    :cond_0
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView$s;->a:Landroid/support/v7/widget/RecyclerView;

    const/4 v2, 0x2

    invoke-static {v0, v2}, Landroid/support/v7/widget/RecyclerView;->b(Landroid/support/v7/widget/RecyclerView;I)V

    .line 3953
    iput v1, p0, Landroid/support/v7/widget/RecyclerView$s;->c:I

    iput v1, p0, Landroid/support/v7/widget/RecyclerView$s;->b:I

    .line 3954
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView$s;->d:Landroid/support/v4/widget/ScrollerCompat;

    move v2, v1

    move v3, p1

    move v4, p2

    move v5, p3

    invoke-virtual/range {v0 .. v5}, Landroid/support/v4/widget/ScrollerCompat;->startScroll(IIIII)V

    .line 3955
    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView$s;->a()V

    .line 3956
    return-void
.end method

.method public final b()V
    .locals 1

    .prologue
    .line 3959
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView$s;->a:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0, p0}, Landroid/support/v7/widget/RecyclerView;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 3960
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView$s;->d:Landroid/support/v4/widget/ScrollerCompat;

    invoke-virtual {v0}, Landroid/support/v4/widget/ScrollerCompat;->abortAnimation()V

    .line 3961
    return-void
.end method

.method public final b(II)V
    .locals 13

    .prologue
    const/high16 v12, 0x3f800000    # 1.0f

    .line 3908
    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    move-result v2

    invoke-static {p2}, Ljava/lang/Math;->abs(I)I

    move-result v3

    if-le v2, v3, :cond_0

    const/4 v0, 0x1

    :goto_0
    const-wide/16 v4, 0x0

    invoke-static {v4, v5}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v4

    double-to-int v4, v4

    mul-int v1, p1, p1

    mul-int v5, p2, p2

    add-int/2addr v1, v5

    int-to-double v6, v1

    invoke-static {v6, v7}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v6

    double-to-int v5, v6

    if-eqz v0, :cond_1

    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView$s;->a:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v1}, Landroid/support/v7/widget/RecyclerView;->getWidth()I

    move-result v1

    :goto_1
    div-int/lit8 v6, v1, 0x2

    int-to-float v5, v5

    mul-float/2addr v5, v12

    int-to-float v7, v1

    div-float/2addr v5, v7

    invoke-static {v12, v5}, Ljava/lang/Math;->min(FF)F

    move-result v5

    int-to-float v7, v6

    int-to-float v6, v6

    const/high16 v8, 0x3f000000    # 0.5f

    sub-float/2addr v5, v8

    float-to-double v8, v5

    const-wide v10, 0x3fde28c7460698c7L    # 0.4712389167638204

    mul-double/2addr v8, v10

    double-to-float v5, v8

    float-to-double v8, v5

    invoke-static {v8, v9}, Ljava/lang/Math;->sin(D)D

    move-result-wide v8

    double-to-float v5, v8

    mul-float/2addr v5, v6

    add-float/2addr v5, v7

    if-lez v4, :cond_2

    const/high16 v0, 0x447a0000    # 1000.0f

    int-to-float v1, v4

    div-float v1, v5, v1

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    mul-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    mul-int/lit8 v0, v0, 0x4

    :goto_2
    const/16 v1, 0x7d0

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    invoke-virtual {p0, p1, p2, v0}, Landroid/support/v7/widget/RecyclerView$s;->a(III)V

    .line 3909
    return-void

    .line 3908
    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :cond_1
    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView$s;->a:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v1}, Landroid/support/v7/widget/RecyclerView;->getHeight()I

    move-result v1

    goto :goto_1

    :cond_2
    if-eqz v0, :cond_3

    move v0, v2

    :goto_3
    int-to-float v0, v0

    int-to-float v1, v1

    div-float/2addr v0, v1

    add-float/2addr v0, v12

    const/high16 v1, 0x43960000    # 300.0f

    mul-float/2addr v0, v1

    float-to-int v0, v0

    goto :goto_2

    :cond_3
    move v0, v3

    goto :goto_3
.end method

.method public final run()V
    .locals 22

    .prologue
    .line 3752
    const/4 v4, 0x0

    move-object/from16 v0, p0

    iput-boolean v4, v0, Landroid/support/v7/widget/RecyclerView$s;->g:Z

    const/4 v4, 0x1

    move-object/from16 v0, p0

    iput-boolean v4, v0, Landroid/support/v7/widget/RecyclerView$s;->f:Z

    .line 3753
    move-object/from16 v0, p0

    iget-object v4, v0, Landroid/support/v7/widget/RecyclerView$s;->a:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v4}, Landroid/support/v7/widget/RecyclerView;->f(Landroid/support/v7/widget/RecyclerView;)V

    .line 3756
    move-object/from16 v0, p0

    iget-object v11, v0, Landroid/support/v7/widget/RecyclerView$s;->d:Landroid/support/v4/widget/ScrollerCompat;

    .line 3757
    move-object/from16 v0, p0

    iget-object v4, v0, Landroid/support/v7/widget/RecyclerView$s;->a:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v4}, Landroid/support/v7/widget/RecyclerView;->e(Landroid/support/v7/widget/RecyclerView;)Landroid/support/v7/widget/RecyclerView$i;

    move-result-object v4

    iget-object v12, v4, Landroid/support/v7/widget/RecyclerView$i;->s:Landroid/support/v7/widget/RecyclerView$p;

    .line 3758
    invoke-virtual {v11}, Landroid/support/v4/widget/ScrollerCompat;->computeScrollOffset()Z

    move-result v4

    if-eqz v4, :cond_13

    .line 3759
    invoke-virtual {v11}, Landroid/support/v4/widget/ScrollerCompat;->getCurrX()I

    move-result v13

    .line 3760
    invoke-virtual {v11}, Landroid/support/v4/widget/ScrollerCompat;->getCurrY()I

    move-result v14

    .line 3761
    move-object/from16 v0, p0

    iget v4, v0, Landroid/support/v7/widget/RecyclerView$s;->b:I

    sub-int v15, v13, v4

    .line 3762
    move-object/from16 v0, p0

    iget v4, v0, Landroid/support/v7/widget/RecyclerView$s;->c:I

    sub-int v16, v14, v4

    .line 3763
    const/4 v7, 0x0

    .line 3764
    const/4 v5, 0x0

    .line 3765
    move-object/from16 v0, p0

    iput v13, v0, Landroid/support/v7/widget/RecyclerView$s;->b:I

    .line 3766
    move-object/from16 v0, p0

    iput v14, v0, Landroid/support/v7/widget/RecyclerView$s;->c:I

    .line 3767
    const/4 v6, 0x0

    const/4 v4, 0x0

    .line 3768
    move-object/from16 v0, p0

    iget-object v8, v0, Landroid/support/v7/widget/RecyclerView$s;->a:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v8}, Landroid/support/v7/widget/RecyclerView;->g(Landroid/support/v7/widget/RecyclerView;)Landroid/support/v7/widget/RecyclerView$a;

    move-result-object v8

    if-eqz v8, :cond_19

    .line 3769
    move-object/from16 v0, p0

    iget-object v8, v0, Landroid/support/v7/widget/RecyclerView$s;->a:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v8}, Landroid/support/v7/widget/RecyclerView;->c()V

    .line 3770
    move-object/from16 v0, p0

    iget-object v8, v0, Landroid/support/v7/widget/RecyclerView$s;->a:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v8}, Landroid/support/v7/widget/RecyclerView;->h(Landroid/support/v7/widget/RecyclerView;)V

    .line 3771
    const-string v8, "RV Scroll"

    invoke-static {v8}, Landroid/support/v4/os/TraceCompat;->beginSection(Ljava/lang/String;)V

    .line 3772
    if-eqz v15, :cond_0

    .line 3773
    move-object/from16 v0, p0

    iget-object v6, v0, Landroid/support/v7/widget/RecyclerView$s;->a:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v6}, Landroid/support/v7/widget/RecyclerView;->e(Landroid/support/v7/widget/RecyclerView;)Landroid/support/v7/widget/RecyclerView$i;

    move-result-object v6

    move-object/from16 v0, p0

    iget-object v7, v0, Landroid/support/v7/widget/RecyclerView$s;->a:Landroid/support/v7/widget/RecyclerView;

    iget-object v7, v7, Landroid/support/v7/widget/RecyclerView;->a:Landroid/support/v7/widget/RecyclerView$m;

    move-object/from16 v0, p0

    iget-object v8, v0, Landroid/support/v7/widget/RecyclerView$s;->a:Landroid/support/v7/widget/RecyclerView;

    iget-object v8, v8, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/RecyclerView$q;

    invoke-virtual {v6, v15, v7, v8}, Landroid/support/v7/widget/RecyclerView$i;->a(ILandroid/support/v7/widget/RecyclerView$m;Landroid/support/v7/widget/RecyclerView$q;)I

    move-result v7

    .line 3774
    sub-int v6, v15, v7

    .line 3776
    :cond_0
    if-eqz v16, :cond_1

    .line 3777
    move-object/from16 v0, p0

    iget-object v4, v0, Landroid/support/v7/widget/RecyclerView$s;->a:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v4}, Landroid/support/v7/widget/RecyclerView;->e(Landroid/support/v7/widget/RecyclerView;)Landroid/support/v7/widget/RecyclerView$i;

    move-result-object v4

    move-object/from16 v0, p0

    iget-object v5, v0, Landroid/support/v7/widget/RecyclerView$s;->a:Landroid/support/v7/widget/RecyclerView;

    iget-object v5, v5, Landroid/support/v7/widget/RecyclerView;->a:Landroid/support/v7/widget/RecyclerView$m;

    move-object/from16 v0, p0

    iget-object v8, v0, Landroid/support/v7/widget/RecyclerView$s;->a:Landroid/support/v7/widget/RecyclerView;

    iget-object v8, v8, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/RecyclerView$q;

    move/from16 v0, v16

    invoke-virtual {v4, v0, v5, v8}, Landroid/support/v7/widget/RecyclerView$i;->b(ILandroid/support/v7/widget/RecyclerView$m;Landroid/support/v7/widget/RecyclerView$q;)I

    move-result v5

    .line 3778
    sub-int v4, v16, v5

    .line 3780
    :cond_1
    invoke-static {}, Landroid/support/v4/os/TraceCompat;->endSection()V

    .line 3781
    move-object/from16 v0, p0

    iget-object v8, v0, Landroid/support/v7/widget/RecyclerView$s;->a:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v8}, Landroid/support/v7/widget/RecyclerView;->i(Landroid/support/v7/widget/RecyclerView;)Z

    move-result v8

    if-eqz v8, :cond_4

    .line 3783
    move-object/from16 v0, p0

    iget-object v8, v0, Landroid/support/v7/widget/RecyclerView$s;->a:Landroid/support/v7/widget/RecyclerView;

    iget-object v8, v8, Landroid/support/v7/widget/RecyclerView;->c:Landroid/support/v7/widget/b;

    invoke-virtual {v8}, Landroid/support/v7/widget/b;->a()I

    move-result v9

    .line 3784
    const/4 v8, 0x0

    :goto_0
    if-ge v8, v9, :cond_4

    .line 3785
    move-object/from16 v0, p0

    iget-object v10, v0, Landroid/support/v7/widget/RecyclerView$s;->a:Landroid/support/v7/widget/RecyclerView;

    iget-object v10, v10, Landroid/support/v7/widget/RecyclerView;->c:Landroid/support/v7/widget/b;

    invoke-virtual {v10, v8}, Landroid/support/v7/widget/b;->b(I)Landroid/view/View;

    move-result-object v10

    .line 3786
    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v7/widget/RecyclerView$s;->a:Landroid/support/v7/widget/RecyclerView;

    move-object/from16 v17, v0

    move-object/from16 v0, v17

    invoke-virtual {v0, v10}, Landroid/support/v7/widget/RecyclerView;->a(Landroid/view/View;)Landroid/support/v7/widget/RecyclerView$t;

    move-result-object v17

    .line 3787
    if-eqz v17, :cond_3

    move-object/from16 v0, v17

    iget-object v0, v0, Landroid/support/v7/widget/RecyclerView$t;->h:Landroid/support/v7/widget/RecyclerView$t;

    move-object/from16 v18, v0

    if-eqz v18, :cond_3

    .line 3788
    move-object/from16 v0, v17

    iget-object v0, v0, Landroid/support/v7/widget/RecyclerView$t;->h:Landroid/support/v7/widget/RecyclerView$t;

    move-object/from16 v17, v0

    move-object/from16 v0, v17

    iget-object v0, v0, Landroid/support/v7/widget/RecyclerView$t;->a:Landroid/view/View;

    move-object/from16 v17, v0

    .line 3789
    invoke-virtual {v10}, Landroid/view/View;->getLeft()I

    move-result v18

    .line 3790
    invoke-virtual {v10}, Landroid/view/View;->getTop()I

    move-result v10

    .line 3791
    invoke-virtual/range {v17 .. v17}, Landroid/view/View;->getLeft()I

    move-result v19

    move/from16 v0, v18

    move/from16 v1, v19

    if-ne v0, v1, :cond_2

    invoke-virtual/range {v17 .. v17}, Landroid/view/View;->getTop()I

    move-result v19

    move/from16 v0, v19

    if-eq v10, v0, :cond_3

    .line 3793
    :cond_2
    invoke-virtual/range {v17 .. v17}, Landroid/view/View;->getWidth()I

    move-result v19

    add-int v19, v19, v18

    invoke-virtual/range {v17 .. v17}, Landroid/view/View;->getHeight()I

    move-result v20

    add-int v20, v20, v10

    move-object/from16 v0, v17

    move/from16 v1, v18

    move/from16 v2, v19

    move/from16 v3, v20

    invoke-virtual {v0, v1, v10, v2, v3}, Landroid/view/View;->layout(IIII)V

    .line 3784
    :cond_3
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 3800
    :cond_4
    move-object/from16 v0, p0

    iget-object v8, v0, Landroid/support/v7/widget/RecyclerView$s;->a:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v8}, Landroid/support/v7/widget/RecyclerView;->j(Landroid/support/v7/widget/RecyclerView;)V

    .line 3801
    move-object/from16 v0, p0

    iget-object v8, v0, Landroid/support/v7/widget/RecyclerView$s;->a:Landroid/support/v7/widget/RecyclerView;

    const/4 v9, 0x0

    invoke-virtual {v8, v9}, Landroid/support/v7/widget/RecyclerView;->a(Z)V

    .line 3803
    if-eqz v12, :cond_19

    invoke-virtual {v12}, Landroid/support/v7/widget/RecyclerView$p;->d()Z

    move-result v8

    if-nez v8, :cond_19

    invoke-virtual {v12}, Landroid/support/v7/widget/RecyclerView$p;->e()Z

    move-result v8

    if-eqz v8, :cond_19

    .line 3805
    move-object/from16 v0, p0

    iget-object v8, v0, Landroid/support/v7/widget/RecyclerView$s;->a:Landroid/support/v7/widget/RecyclerView;

    iget-object v8, v8, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/RecyclerView$q;

    invoke-virtual {v8}, Landroid/support/v7/widget/RecyclerView$q;->e()I

    move-result v8

    .line 3806
    if-nez v8, :cond_17

    .line 3807
    invoke-virtual {v12}, Landroid/support/v7/widget/RecyclerView$p;->c()V

    move/from16 v21, v6

    move v6, v5

    move/from16 v5, v21

    .line 3816
    :goto_1
    move-object/from16 v0, p0

    iget-object v8, v0, Landroid/support/v7/widget/RecyclerView$s;->a:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v8}, Landroid/support/v7/widget/RecyclerView;->k(Landroid/support/v7/widget/RecyclerView;)Ljava/util/ArrayList;

    move-result-object v8

    invoke-virtual {v8}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v8

    if-nez v8, :cond_5

    .line 3817
    move-object/from16 v0, p0

    iget-object v8, v0, Landroid/support/v7/widget/RecyclerView$s;->a:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v8}, Landroid/support/v7/widget/RecyclerView;->invalidate()V

    .line 3819
    :cond_5
    move-object/from16 v0, p0

    iget-object v8, v0, Landroid/support/v7/widget/RecyclerView$s;->a:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v8}, Landroid/support/v4/view/ViewCompat;->getOverScrollMode(Landroid/view/View;)I

    move-result v8

    const/4 v9, 0x2

    if-eq v8, v9, :cond_6

    .line 3821
    move-object/from16 v0, p0

    iget-object v8, v0, Landroid/support/v7/widget/RecyclerView$s;->a:Landroid/support/v7/widget/RecyclerView;

    move/from16 v0, v16

    invoke-static {v8, v15, v0}, Landroid/support/v7/widget/RecyclerView;->a(Landroid/support/v7/widget/RecyclerView;II)V

    .line 3823
    :cond_6
    if-nez v5, :cond_7

    if-eqz v4, :cond_c

    .line 3824
    :cond_7
    invoke-virtual {v11}, Landroid/support/v4/widget/ScrollerCompat;->getCurrVelocity()F

    move-result v8

    float-to-int v9, v8

    .line 3826
    const/4 v8, 0x0

    .line 3827
    if-eq v5, v13, :cond_22

    .line 3828
    if-gez v5, :cond_1a

    neg-int v8, v9

    :goto_2
    move v10, v8

    .line 3831
    :goto_3
    const/4 v8, 0x0

    .line 3832
    if-eq v4, v14, :cond_21

    .line 3833
    if-gez v4, :cond_1c

    neg-int v9, v9

    .line 3836
    :cond_8
    :goto_4
    move-object/from16 v0, p0

    iget-object v8, v0, Landroid/support/v7/widget/RecyclerView$s;->a:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v8}, Landroid/support/v4/view/ViewCompat;->getOverScrollMode(Landroid/view/View;)I

    move-result v8

    const/16 v17, 0x2

    move/from16 v0, v17

    if-eq v8, v0, :cond_9

    .line 3838
    move-object/from16 v0, p0

    iget-object v8, v0, Landroid/support/v7/widget/RecyclerView$s;->a:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v8, v10, v9}, Landroid/support/v7/widget/RecyclerView;->a(II)V

    .line 3840
    :cond_9
    if-nez v10, :cond_a

    if-eq v5, v13, :cond_a

    invoke-virtual {v11}, Landroid/support/v4/widget/ScrollerCompat;->getFinalX()I

    move-result v5

    if-nez v5, :cond_c

    :cond_a
    if-nez v9, :cond_b

    if-eq v4, v14, :cond_b

    invoke-virtual {v11}, Landroid/support/v4/widget/ScrollerCompat;->getFinalY()I

    move-result v4

    if-nez v4, :cond_c

    .line 3842
    :cond_b
    invoke-virtual {v11}, Landroid/support/v4/widget/ScrollerCompat;->abortAnimation()V

    .line 3845
    :cond_c
    if-nez v7, :cond_d

    if-eqz v6, :cond_e

    .line 3846
    :cond_d
    move-object/from16 v0, p0

    iget-object v4, v0, Landroid/support/v7/widget/RecyclerView$s;->a:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v4, v6}, Landroid/support/v7/widget/RecyclerView;->b(I)V

    .line 3849
    :cond_e
    move-object/from16 v0, p0

    iget-object v4, v0, Landroid/support/v7/widget/RecyclerView$s;->a:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v4}, Landroid/support/v7/widget/RecyclerView;->l(Landroid/support/v7/widget/RecyclerView;)Z

    move-result v4

    if-nez v4, :cond_f

    .line 3850
    move-object/from16 v0, p0

    iget-object v4, v0, Landroid/support/v7/widget/RecyclerView$s;->a:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v4}, Landroid/support/v7/widget/RecyclerView;->invalidate()V

    .line 3853
    :cond_f
    if-eqz v16, :cond_1d

    move-object/from16 v0, p0

    iget-object v4, v0, Landroid/support/v7/widget/RecyclerView$s;->a:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v4}, Landroid/support/v7/widget/RecyclerView;->e(Landroid/support/v7/widget/RecyclerView;)Landroid/support/v7/widget/RecyclerView$i;

    move-result-object v4

    invoke-virtual {v4}, Landroid/support/v7/widget/RecyclerView$i;->g()Z

    move-result v4

    if-eqz v4, :cond_1d

    move/from16 v0, v16

    if-ne v6, v0, :cond_1d

    const/4 v4, 0x1

    move v5, v4

    .line 3855
    :goto_5
    if-eqz v15, :cond_1e

    move-object/from16 v0, p0

    iget-object v4, v0, Landroid/support/v7/widget/RecyclerView$s;->a:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v4}, Landroid/support/v7/widget/RecyclerView;->e(Landroid/support/v7/widget/RecyclerView;)Landroid/support/v7/widget/RecyclerView$i;

    move-result-object v4

    invoke-virtual {v4}, Landroid/support/v7/widget/RecyclerView$i;->f()Z

    move-result v4

    if-eqz v4, :cond_1e

    if-ne v7, v15, :cond_1e

    const/4 v4, 0x1

    .line 3857
    :goto_6
    if-nez v15, :cond_10

    if-eqz v16, :cond_11

    :cond_10
    if-nez v4, :cond_11

    if-eqz v5, :cond_1f

    :cond_11
    const/4 v4, 0x1

    .line 3860
    :goto_7
    invoke-virtual {v11}, Landroid/support/v4/widget/ScrollerCompat;->isFinished()Z

    move-result v5

    if-nez v5, :cond_12

    if-nez v4, :cond_20

    .line 3861
    :cond_12
    move-object/from16 v0, p0

    iget-object v4, v0, Landroid/support/v7/widget/RecyclerView$s;->a:Landroid/support/v7/widget/RecyclerView;

    const/4 v5, 0x0

    invoke-static {v4, v5}, Landroid/support/v7/widget/RecyclerView;->b(Landroid/support/v7/widget/RecyclerView;I)V

    .line 3867
    :cond_13
    :goto_8
    if-eqz v12, :cond_15

    .line 3868
    invoke-virtual {v12}, Landroid/support/v7/widget/RecyclerView$p;->d()Z

    move-result v4

    if-eqz v4, :cond_14

    .line 3869
    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static {v12, v4, v5}, Landroid/support/v7/widget/RecyclerView$p;->a(Landroid/support/v7/widget/RecyclerView$p;II)V

    .line 3871
    :cond_14
    move-object/from16 v0, p0

    iget-boolean v4, v0, Landroid/support/v7/widget/RecyclerView$s;->g:Z

    if-nez v4, :cond_15

    .line 3872
    invoke-virtual {v12}, Landroid/support/v7/widget/RecyclerView$p;->c()V

    .line 3875
    :cond_15
    const/4 v4, 0x0

    move-object/from16 v0, p0

    iput-boolean v4, v0, Landroid/support/v7/widget/RecyclerView$s;->f:Z

    move-object/from16 v0, p0

    iget-boolean v4, v0, Landroid/support/v7/widget/RecyclerView$s;->g:Z

    if-eqz v4, :cond_16

    invoke-virtual/range {p0 .. p0}, Landroid/support/v7/widget/RecyclerView$s;->a()V

    .line 3876
    :cond_16
    return-void

    .line 3808
    :cond_17
    invoke-virtual {v12}, Landroid/support/v7/widget/RecyclerView$p;->f()I

    move-result v9

    if-lt v9, v8, :cond_18

    .line 3809
    add-int/lit8 v8, v8, -0x1

    invoke-virtual {v12, v8}, Landroid/support/v7/widget/RecyclerView$p;->b(I)V

    .line 3810
    :cond_18
    sub-int v8, v15, v6

    sub-int v9, v16, v4

    invoke-static {v12, v8, v9}, Landroid/support/v7/widget/RecyclerView$p;->a(Landroid/support/v7/widget/RecyclerView$p;II)V

    :cond_19
    move/from16 v21, v6

    move v6, v5

    move/from16 v5, v21

    goto/16 :goto_1

    .line 3828
    :cond_1a
    if-lez v5, :cond_1b

    move v8, v9

    goto/16 :goto_2

    :cond_1b
    const/4 v8, 0x0

    goto/16 :goto_2

    .line 3833
    :cond_1c
    if-gtz v4, :cond_8

    const/4 v9, 0x0

    goto/16 :goto_4

    .line 3853
    :cond_1d
    const/4 v4, 0x0

    move v5, v4

    goto :goto_5

    .line 3855
    :cond_1e
    const/4 v4, 0x0

    goto :goto_6

    .line 3857
    :cond_1f
    const/4 v4, 0x0

    goto :goto_7

    .line 3863
    :cond_20
    invoke-virtual/range {p0 .. p0}, Landroid/support/v7/widget/RecyclerView$s;->a()V

    goto :goto_8

    :cond_21
    move v9, v8

    goto/16 :goto_4

    :cond_22
    move v10, v8

    goto/16 :goto_3
.end method
