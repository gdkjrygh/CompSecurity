.class final Landroid/support/v7/widget/bh;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


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

    .line 3706
    iput-object p1, p0, Landroid/support/v7/widget/bh;->a:Landroid/support/v7/widget/RecyclerView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3697
    invoke-static {}, Landroid/support/v7/widget/RecyclerView;->h()Landroid/view/animation/Interpolator;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v7/widget/bh;->e:Landroid/view/animation/Interpolator;

    .line 3701
    iput-boolean v1, p0, Landroid/support/v7/widget/bh;->f:Z

    .line 3704
    iput-boolean v1, p0, Landroid/support/v7/widget/bh;->g:Z

    .line 3707
    invoke-virtual {p1}, Landroid/support/v7/widget/RecyclerView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {}, Landroid/support/v7/widget/RecyclerView;->h()Landroid/view/animation/Interpolator;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/support/v4/widget/ScrollerCompat;->create(Landroid/content/Context;Landroid/view/animation/Interpolator;)Landroid/support/v4/widget/ScrollerCompat;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v7/widget/bh;->d:Landroid/support/v4/widget/ScrollerCompat;

    .line 3708
    return-void
.end method


# virtual methods
.method final a()V
    .locals 1

    .prologue
    .line 3846
    iget-boolean v0, p0, Landroid/support/v7/widget/bh;->f:Z

    if-eqz v0, :cond_0

    .line 3847
    const/4 v0, 0x1

    iput-boolean v0, p0, Landroid/support/v7/widget/bh;->g:Z

    .line 3852
    :goto_0
    return-void

    .line 3849
    :cond_0
    iget-object v0, p0, Landroid/support/v7/widget/bh;->a:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0, p0}, Landroid/support/v7/widget/RecyclerView;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 3850
    iget-object v0, p0, Landroid/support/v7/widget/bh;->a:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v0, p0}, Landroid/support/v4/view/ViewCompat;->postOnAnimation(Landroid/view/View;Ljava/lang/Runnable;)V

    goto :goto_0
.end method

.method public final a(II)V
    .locals 9

    .prologue
    const v6, 0x7fffffff

    const/high16 v5, -0x80000000

    const/4 v1, 0x0

    .line 3855
    iget-object v0, p0, Landroid/support/v7/widget/bh;->a:Landroid/support/v7/widget/RecyclerView;

    const/4 v2, 0x2

    invoke-static {v0, v2}, Landroid/support/v7/widget/RecyclerView;->b(Landroid/support/v7/widget/RecyclerView;I)V

    .line 3856
    iput v1, p0, Landroid/support/v7/widget/bh;->c:I

    iput v1, p0, Landroid/support/v7/widget/bh;->b:I

    .line 3857
    iget-object v0, p0, Landroid/support/v7/widget/bh;->d:Landroid/support/v4/widget/ScrollerCompat;

    move v2, v1

    move v3, p1

    move v4, p2

    move v7, v5

    move v8, v6

    invoke-virtual/range {v0 .. v8}, Landroid/support/v4/widget/ScrollerCompat;->fling(IIIIIIII)V

    .line 3859
    invoke-virtual {p0}, Landroid/support/v7/widget/bh;->a()V

    .line 3860
    return-void
.end method

.method public final a(III)V
    .locals 1

    .prologue
    .line 3899
    invoke-static {}, Landroid/support/v7/widget/RecyclerView;->h()Landroid/view/animation/Interpolator;

    move-result-object v0

    invoke-virtual {p0, p1, p2, p3, v0}, Landroid/support/v7/widget/bh;->a(IIILandroid/view/animation/Interpolator;)V

    .line 3900
    return-void
.end method

.method public final a(IIILandroid/view/animation/Interpolator;)V
    .locals 6

    .prologue
    const/4 v1, 0x0

    .line 3903
    iget-object v0, p0, Landroid/support/v7/widget/bh;->e:Landroid/view/animation/Interpolator;

    if-eq v0, p4, :cond_0

    .line 3904
    iput-object p4, p0, Landroid/support/v7/widget/bh;->e:Landroid/view/animation/Interpolator;

    .line 3905
    iget-object v0, p0, Landroid/support/v7/widget/bh;->a:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p4}, Landroid/support/v4/widget/ScrollerCompat;->create(Landroid/content/Context;Landroid/view/animation/Interpolator;)Landroid/support/v4/widget/ScrollerCompat;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v7/widget/bh;->d:Landroid/support/v4/widget/ScrollerCompat;

    .line 3907
    :cond_0
    iget-object v0, p0, Landroid/support/v7/widget/bh;->a:Landroid/support/v7/widget/RecyclerView;

    const/4 v2, 0x2

    invoke-static {v0, v2}, Landroid/support/v7/widget/RecyclerView;->b(Landroid/support/v7/widget/RecyclerView;I)V

    .line 3908
    iput v1, p0, Landroid/support/v7/widget/bh;->c:I

    iput v1, p0, Landroid/support/v7/widget/bh;->b:I

    .line 3909
    iget-object v0, p0, Landroid/support/v7/widget/bh;->d:Landroid/support/v4/widget/ScrollerCompat;

    move v2, v1

    move v3, p1

    move v4, p2

    move v5, p3

    invoke-virtual/range {v0 .. v5}, Landroid/support/v4/widget/ScrollerCompat;->startScroll(IIIII)V

    .line 3910
    invoke-virtual {p0}, Landroid/support/v7/widget/bh;->a()V

    .line 3911
    return-void
.end method

.method public final b()V
    .locals 1

    .prologue
    .line 3914
    iget-object v0, p0, Landroid/support/v7/widget/bh;->a:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0, p0}, Landroid/support/v7/widget/RecyclerView;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 3915
    iget-object v0, p0, Landroid/support/v7/widget/bh;->d:Landroid/support/v4/widget/ScrollerCompat;

    invoke-virtual {v0}, Landroid/support/v4/widget/ScrollerCompat;->abortAnimation()V

    .line 3916
    return-void
.end method

.method public final b(II)V
    .locals 13

    .prologue
    const/high16 v12, 0x3f800000    # 1.0f

    .line 3863
    .line 4877
    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    move-result v2

    .line 4878
    invoke-static {p2}, Ljava/lang/Math;->abs(I)I

    move-result v3

    .line 4879
    if-le v2, v3, :cond_0

    const/4 v0, 0x1

    .line 4880
    :goto_0
    const-wide/16 v4, 0x0

    invoke-static {v4, v5}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v4

    double-to-int v4, v4

    .line 4881
    mul-int v1, p1, p1

    mul-int v5, p2, p2

    add-int/2addr v1, v5

    int-to-double v6, v1

    invoke-static {v6, v7}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v6

    double-to-int v5, v6

    .line 4882
    if-eqz v0, :cond_1

    iget-object v1, p0, Landroid/support/v7/widget/bh;->a:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v1}, Landroid/support/v7/widget/RecyclerView;->getWidth()I

    move-result v1

    .line 4883
    :goto_1
    div-int/lit8 v6, v1, 0x2

    .line 4884
    int-to-float v5, v5

    mul-float/2addr v5, v12

    int-to-float v7, v1

    div-float/2addr v5, v7

    invoke-static {v12, v5}, Ljava/lang/Math;->min(FF)F

    move-result v5

    .line 4885
    int-to-float v7, v6

    int-to-float v6, v6

    .line 5871
    const/high16 v8, 0x3f000000    # 0.5f

    sub-float/2addr v5, v8

    .line 5872
    float-to-double v8, v5

    const-wide v10, 0x3fde28c7460698c7L    # 0.4712389167638204

    mul-double/2addr v8, v10

    double-to-float v5, v8

    .line 5873
    float-to-double v8, v5

    invoke-static {v8, v9}, Ljava/lang/Math;->sin(D)D

    move-result-wide v8

    double-to-float v5, v8

    .line 4885
    mul-float/2addr v5, v6

    add-float/2addr v5, v7

    .line 4889
    if-lez v4, :cond_2

    .line 4890
    const/high16 v0, 0x447a0000    # 1000.0f

    int-to-float v1, v4

    div-float v1, v5, v1

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    mul-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    mul-int/lit8 v0, v0, 0x4

    .line 4895
    :goto_2
    const/16 v1, 0x7d0

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    .line 4867
    invoke-virtual {p0, p1, p2, v0}, Landroid/support/v7/widget/bh;->a(III)V

    .line 3864
    return-void

    .line 4879
    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    .line 4882
    :cond_1
    iget-object v1, p0, Landroid/support/v7/widget/bh;->a:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v1}, Landroid/support/v7/widget/RecyclerView;->getHeight()I

    move-result v1

    goto :goto_1

    .line 4892
    :cond_2
    if-eqz v0, :cond_3

    move v0, v2

    :goto_3
    int-to-float v0, v0

    .line 4893
    int-to-float v1, v1

    div-float/2addr v0, v1

    add-float/2addr v0, v12

    const/high16 v1, 0x43960000    # 300.0f

    mul-float/2addr v0, v1

    float-to-int v0, v0

    goto :goto_2

    :cond_3
    move v0, v3

    .line 4892
    goto :goto_3
.end method

.method public final run()V
    .locals 22

    .prologue
    .line 3712
    .line 4834
    const/4 v4, 0x0

    move-object/from16 v0, p0

    iput-boolean v4, v0, Landroid/support/v7/widget/bh;->g:Z

    .line 4835
    const/4 v4, 0x1

    move-object/from16 v0, p0

    iput-boolean v4, v0, Landroid/support/v7/widget/bh;->f:Z

    .line 3713
    move-object/from16 v0, p0

    iget-object v4, v0, Landroid/support/v7/widget/bh;->a:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v4}, Landroid/support/v7/widget/RecyclerView;->f(Landroid/support/v7/widget/RecyclerView;)V

    .line 3716
    move-object/from16 v0, p0

    iget-object v11, v0, Landroid/support/v7/widget/bh;->d:Landroid/support/v4/widget/ScrollerCompat;

    .line 3717
    move-object/from16 v0, p0

    iget-object v4, v0, Landroid/support/v7/widget/bh;->a:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v4}, Landroid/support/v7/widget/RecyclerView;->e(Landroid/support/v7/widget/RecyclerView;)Landroid/support/v7/widget/au;

    move-result-object v4

    iget-object v12, v4, Landroid/support/v7/widget/au;->s:Landroid/support/v7/widget/bd;

    .line 3718
    invoke-virtual {v11}, Landroid/support/v4/widget/ScrollerCompat;->computeScrollOffset()Z

    move-result v4

    if-eqz v4, :cond_15

    .line 3719
    invoke-virtual {v11}, Landroid/support/v4/widget/ScrollerCompat;->getCurrX()I

    move-result v13

    .line 3720
    invoke-virtual {v11}, Landroid/support/v4/widget/ScrollerCompat;->getCurrY()I

    move-result v14

    .line 3721
    move-object/from16 v0, p0

    iget v4, v0, Landroid/support/v7/widget/bh;->b:I

    sub-int v15, v13, v4

    .line 3722
    move-object/from16 v0, p0

    iget v4, v0, Landroid/support/v7/widget/bh;->c:I

    sub-int v16, v14, v4

    .line 3723
    const/4 v7, 0x0

    .line 3724
    const/4 v5, 0x0

    .line 3725
    move-object/from16 v0, p0

    iput v13, v0, Landroid/support/v7/widget/bh;->b:I

    .line 3726
    move-object/from16 v0, p0

    iput v14, v0, Landroid/support/v7/widget/bh;->c:I

    .line 3727
    const/4 v6, 0x0

    const/4 v4, 0x0

    .line 3728
    move-object/from16 v0, p0

    iget-object v8, v0, Landroid/support/v7/widget/bh;->a:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v8}, Landroid/support/v7/widget/RecyclerView;->g(Landroid/support/v7/widget/RecyclerView;)Landroid/support/v7/widget/al;

    move-result-object v8

    if-eqz v8, :cond_6

    .line 3729
    move-object/from16 v0, p0

    iget-object v8, v0, Landroid/support/v7/widget/bh;->a:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v8}, Landroid/support/v7/widget/RecyclerView;->d()V

    .line 3730
    move-object/from16 v0, p0

    iget-object v8, v0, Landroid/support/v7/widget/bh;->a:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v8}, Landroid/support/v7/widget/RecyclerView;->h(Landroid/support/v7/widget/RecyclerView;)V

    .line 3731
    const-string v8, "RV Scroll"

    invoke-static {v8}, Landroid/support/v4/os/TraceCompat;->beginSection(Ljava/lang/String;)V

    .line 3732
    if-eqz v15, :cond_0

    .line 3733
    move-object/from16 v0, p0

    iget-object v6, v0, Landroid/support/v7/widget/bh;->a:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v6}, Landroid/support/v7/widget/RecyclerView;->e(Landroid/support/v7/widget/RecyclerView;)Landroid/support/v7/widget/au;

    move-result-object v6

    move-object/from16 v0, p0

    iget-object v7, v0, Landroid/support/v7/widget/bh;->a:Landroid/support/v7/widget/RecyclerView;

    iget-object v7, v7, Landroid/support/v7/widget/RecyclerView;->a:Landroid/support/v7/widget/az;

    move-object/from16 v0, p0

    iget-object v8, v0, Landroid/support/v7/widget/bh;->a:Landroid/support/v7/widget/RecyclerView;

    iget-object v8, v8, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/bf;

    invoke-virtual {v6, v15, v7, v8}, Landroid/support/v7/widget/au;->a(ILandroid/support/v7/widget/az;Landroid/support/v7/widget/bf;)I

    move-result v7

    .line 3734
    sub-int v6, v15, v7

    .line 3736
    :cond_0
    if-eqz v16, :cond_1

    .line 3737
    move-object/from16 v0, p0

    iget-object v4, v0, Landroid/support/v7/widget/bh;->a:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v4}, Landroid/support/v7/widget/RecyclerView;->e(Landroid/support/v7/widget/RecyclerView;)Landroid/support/v7/widget/au;

    move-result-object v4

    move-object/from16 v0, p0

    iget-object v5, v0, Landroid/support/v7/widget/bh;->a:Landroid/support/v7/widget/RecyclerView;

    iget-object v5, v5, Landroid/support/v7/widget/RecyclerView;->a:Landroid/support/v7/widget/az;

    move-object/from16 v0, p0

    iget-object v8, v0, Landroid/support/v7/widget/bh;->a:Landroid/support/v7/widget/RecyclerView;

    iget-object v8, v8, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/bf;

    move/from16 v0, v16

    invoke-virtual {v4, v0, v5, v8}, Landroid/support/v7/widget/au;->b(ILandroid/support/v7/widget/az;Landroid/support/v7/widget/bf;)I

    move-result v5

    .line 3738
    sub-int v4, v16, v5

    .line 3740
    :cond_1
    invoke-static {}, Landroid/support/v4/os/TraceCompat;->endSection()V

    .line 3741
    move-object/from16 v0, p0

    iget-object v8, v0, Landroid/support/v7/widget/bh;->a:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v8}, Landroid/support/v7/widget/RecyclerView;->i(Landroid/support/v7/widget/RecyclerView;)Z

    move-result v8

    if-eqz v8, :cond_4

    .line 3743
    move-object/from16 v0, p0

    iget-object v8, v0, Landroid/support/v7/widget/bh;->a:Landroid/support/v7/widget/RecyclerView;

    iget-object v8, v8, Landroid/support/v7/widget/RecyclerView;->c:Landroid/support/v7/widget/d;

    invoke-virtual {v8}, Landroid/support/v7/widget/d;->a()I

    move-result v9

    .line 3744
    const/4 v8, 0x0

    :goto_0
    if-ge v8, v9, :cond_4

    .line 3745
    move-object/from16 v0, p0

    iget-object v10, v0, Landroid/support/v7/widget/bh;->a:Landroid/support/v7/widget/RecyclerView;

    iget-object v10, v10, Landroid/support/v7/widget/RecyclerView;->c:Landroid/support/v7/widget/d;

    invoke-virtual {v10, v8}, Landroid/support/v7/widget/d;->b(I)Landroid/view/View;

    move-result-object v10

    .line 3746
    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v7/widget/bh;->a:Landroid/support/v7/widget/RecyclerView;

    move-object/from16 v17, v0

    move-object/from16 v0, v17

    invoke-virtual {v0, v10}, Landroid/support/v7/widget/RecyclerView;->a(Landroid/view/View;)Landroid/support/v7/widget/bi;

    move-result-object v17

    .line 3747
    if-eqz v17, :cond_3

    move-object/from16 v0, v17

    iget-object v0, v0, Landroid/support/v7/widget/bi;->h:Landroid/support/v7/widget/bi;

    move-object/from16 v18, v0

    if-eqz v18, :cond_3

    .line 3748
    move-object/from16 v0, v17

    iget-object v0, v0, Landroid/support/v7/widget/bi;->h:Landroid/support/v7/widget/bi;

    move-object/from16 v17, v0

    move-object/from16 v0, v17

    iget-object v0, v0, Landroid/support/v7/widget/bi;->a:Landroid/view/View;

    move-object/from16 v17, v0

    .line 3749
    invoke-virtual {v10}, Landroid/view/View;->getLeft()I

    move-result v18

    .line 3750
    invoke-virtual {v10}, Landroid/view/View;->getTop()I

    move-result v10

    .line 3751
    invoke-virtual/range {v17 .. v17}, Landroid/view/View;->getLeft()I

    move-result v19

    move/from16 v0, v18

    move/from16 v1, v19

    if-ne v0, v1, :cond_2

    invoke-virtual/range {v17 .. v17}, Landroid/view/View;->getTop()I

    move-result v19

    move/from16 v0, v19

    if-eq v10, v0, :cond_3

    .line 3753
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

    .line 3744
    :cond_3
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 3761
    :cond_4
    if-eqz v12, :cond_5

    invoke-virtual {v12}, Landroid/support/v7/widget/bd;->d()Z

    move-result v8

    if-nez v8, :cond_5

    invoke-virtual {v12}, Landroid/support/v7/widget/bd;->e()Z

    move-result v8

    if-eqz v8, :cond_5

    .line 3763
    move-object/from16 v0, p0

    iget-object v8, v0, Landroid/support/v7/widget/bh;->a:Landroid/support/v7/widget/RecyclerView;

    iget-object v8, v8, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/bf;

    invoke-virtual {v8}, Landroid/support/v7/widget/bf;->e()I

    move-result v8

    .line 3764
    if-nez v8, :cond_18

    .line 3765
    invoke-virtual {v12}, Landroid/support/v7/widget/bd;->c()V

    .line 3773
    :cond_5
    :goto_1
    move-object/from16 v0, p0

    iget-object v8, v0, Landroid/support/v7/widget/bh;->a:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v8}, Landroid/support/v7/widget/RecyclerView;->j(Landroid/support/v7/widget/RecyclerView;)V

    .line 3774
    move-object/from16 v0, p0

    iget-object v8, v0, Landroid/support/v7/widget/bh;->a:Landroid/support/v7/widget/RecyclerView;

    const/4 v9, 0x0

    invoke-virtual {v8, v9}, Landroid/support/v7/widget/RecyclerView;->a(Z)V

    :cond_6
    move/from16 v21, v6

    move v6, v5

    move/from16 v5, v21

    .line 3776
    move-object/from16 v0, p0

    iget-object v8, v0, Landroid/support/v7/widget/bh;->a:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v8}, Landroid/support/v7/widget/RecyclerView;->k(Landroid/support/v7/widget/RecyclerView;)Ljava/util/ArrayList;

    move-result-object v8

    invoke-virtual {v8}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v8

    if-nez v8, :cond_7

    .line 3777
    move-object/from16 v0, p0

    iget-object v8, v0, Landroid/support/v7/widget/bh;->a:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v8}, Landroid/support/v7/widget/RecyclerView;->invalidate()V

    .line 3779
    :cond_7
    move-object/from16 v0, p0

    iget-object v8, v0, Landroid/support/v7/widget/bh;->a:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v8}, Landroid/support/v4/view/ViewCompat;->getOverScrollMode(Landroid/view/View;)I

    move-result v8

    const/4 v9, 0x2

    if-eq v8, v9, :cond_8

    .line 3781
    move-object/from16 v0, p0

    iget-object v8, v0, Landroid/support/v7/widget/bh;->a:Landroid/support/v7/widget/RecyclerView;

    move/from16 v0, v16

    invoke-static {v8, v15, v0}, Landroid/support/v7/widget/RecyclerView;->a(Landroid/support/v7/widget/RecyclerView;II)V

    .line 3783
    :cond_8
    if-nez v5, :cond_9

    if-eqz v4, :cond_e

    .line 3784
    :cond_9
    invoke-virtual {v11}, Landroid/support/v4/widget/ScrollerCompat;->getCurrVelocity()F

    move-result v8

    float-to-int v9, v8

    .line 3786
    const/4 v8, 0x0

    .line 3787
    if-eq v5, v13, :cond_22

    .line 3788
    if-gez v5, :cond_1a

    neg-int v8, v9

    :goto_2
    move v10, v8

    .line 3791
    :goto_3
    const/4 v8, 0x0

    .line 3792
    if-eq v4, v14, :cond_21

    .line 3793
    if-gez v4, :cond_1c

    neg-int v9, v9

    .line 3796
    :cond_a
    :goto_4
    move-object/from16 v0, p0

    iget-object v8, v0, Landroid/support/v7/widget/bh;->a:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v8}, Landroid/support/v4/view/ViewCompat;->getOverScrollMode(Landroid/view/View;)I

    move-result v8

    const/16 v17, 0x2

    move/from16 v0, v17

    if-eq v8, v0, :cond_b

    .line 3798
    move-object/from16 v0, p0

    iget-object v8, v0, Landroid/support/v7/widget/bh;->a:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v8, v10, v9}, Landroid/support/v7/widget/RecyclerView;->a(II)V

    .line 3800
    :cond_b
    if-nez v10, :cond_c

    if-eq v5, v13, :cond_c

    invoke-virtual {v11}, Landroid/support/v4/widget/ScrollerCompat;->getFinalX()I

    move-result v5

    if-nez v5, :cond_e

    :cond_c
    if-nez v9, :cond_d

    if-eq v4, v14, :cond_d

    invoke-virtual {v11}, Landroid/support/v4/widget/ScrollerCompat;->getFinalY()I

    move-result v4

    if-nez v4, :cond_e

    .line 3802
    :cond_d
    invoke-virtual {v11}, Landroid/support/v4/widget/ScrollerCompat;->abortAnimation()V

    .line 3805
    :cond_e
    if-nez v7, :cond_f

    if-eqz v6, :cond_10

    .line 3806
    :cond_f
    move-object/from16 v0, p0

    iget-object v4, v0, Landroid/support/v7/widget/bh;->a:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v4, v7, v6}, Landroid/support/v7/widget/RecyclerView;->c(II)V

    .line 3809
    :cond_10
    move-object/from16 v0, p0

    iget-object v4, v0, Landroid/support/v7/widget/bh;->a:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v4}, Landroid/support/v7/widget/RecyclerView;->l(Landroid/support/v7/widget/RecyclerView;)Z

    move-result v4

    if-nez v4, :cond_11

    .line 3810
    move-object/from16 v0, p0

    iget-object v4, v0, Landroid/support/v7/widget/bh;->a:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v4}, Landroid/support/v7/widget/RecyclerView;->invalidate()V

    .line 3813
    :cond_11
    if-eqz v16, :cond_1d

    move-object/from16 v0, p0

    iget-object v4, v0, Landroid/support/v7/widget/bh;->a:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v4}, Landroid/support/v7/widget/RecyclerView;->e(Landroid/support/v7/widget/RecyclerView;)Landroid/support/v7/widget/au;

    move-result-object v4

    invoke-virtual {v4}, Landroid/support/v7/widget/au;->h()Z

    move-result v4

    if-eqz v4, :cond_1d

    move/from16 v0, v16

    if-ne v6, v0, :cond_1d

    const/4 v4, 0x1

    move v5, v4

    .line 3815
    :goto_5
    if-eqz v15, :cond_1e

    move-object/from16 v0, p0

    iget-object v4, v0, Landroid/support/v7/widget/bh;->a:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v4}, Landroid/support/v7/widget/RecyclerView;->e(Landroid/support/v7/widget/RecyclerView;)Landroid/support/v7/widget/au;

    move-result-object v4

    invoke-virtual {v4}, Landroid/support/v7/widget/au;->g()Z

    move-result v4

    if-eqz v4, :cond_1e

    if-ne v7, v15, :cond_1e

    const/4 v4, 0x1

    .line 3817
    :goto_6
    if-nez v15, :cond_12

    if-eqz v16, :cond_13

    :cond_12
    if-nez v4, :cond_13

    if-eqz v5, :cond_1f

    :cond_13
    const/4 v4, 0x1

    .line 3820
    :goto_7
    invoke-virtual {v11}, Landroid/support/v4/widget/ScrollerCompat;->isFinished()Z

    move-result v5

    if-nez v5, :cond_14

    if-nez v4, :cond_20

    .line 3821
    :cond_14
    move-object/from16 v0, p0

    iget-object v4, v0, Landroid/support/v7/widget/bh;->a:Landroid/support/v7/widget/RecyclerView;

    const/4 v5, 0x0

    invoke-static {v4, v5}, Landroid/support/v7/widget/RecyclerView;->b(Landroid/support/v7/widget/RecyclerView;I)V

    .line 3827
    :cond_15
    :goto_8
    if-eqz v12, :cond_16

    invoke-virtual {v12}, Landroid/support/v7/widget/bd;->d()Z

    move-result v4

    if-eqz v4, :cond_16

    .line 3828
    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static {v12, v4, v5}, Landroid/support/v7/widget/bd;->a(Landroid/support/v7/widget/bd;II)V

    .line 4839
    :cond_16
    const/4 v4, 0x0

    move-object/from16 v0, p0

    iput-boolean v4, v0, Landroid/support/v7/widget/bh;->f:Z

    .line 4840
    move-object/from16 v0, p0

    iget-boolean v4, v0, Landroid/support/v7/widget/bh;->g:Z

    if-eqz v4, :cond_17

    .line 4841
    invoke-virtual/range {p0 .. p0}, Landroid/support/v7/widget/bh;->a()V

    .line 3831
    :cond_17
    return-void

    .line 3766
    :cond_18
    invoke-virtual {v12}, Landroid/support/v7/widget/bd;->f()I

    move-result v9

    if-lt v9, v8, :cond_19

    .line 3767
    add-int/lit8 v8, v8, -0x1

    invoke-virtual {v12, v8}, Landroid/support/v7/widget/bd;->b(I)V

    .line 3770
    :cond_19
    sub-int v8, v15, v6

    sub-int v9, v16, v4

    invoke-static {v12, v8, v9}, Landroid/support/v7/widget/bd;->a(Landroid/support/v7/widget/bd;II)V

    goto/16 :goto_1

    .line 3788
    :cond_1a
    if-lez v5, :cond_1b

    move v8, v9

    goto/16 :goto_2

    :cond_1b
    const/4 v8, 0x0

    goto/16 :goto_2

    .line 3793
    :cond_1c
    if-gtz v4, :cond_a

    const/4 v9, 0x0

    goto/16 :goto_4

    .line 3813
    :cond_1d
    const/4 v4, 0x0

    move v5, v4

    goto :goto_5

    .line 3815
    :cond_1e
    const/4 v4, 0x0

    goto :goto_6

    .line 3817
    :cond_1f
    const/4 v4, 0x0

    goto :goto_7

    .line 3823
    :cond_20
    invoke-virtual/range {p0 .. p0}, Landroid/support/v7/widget/bh;->a()V

    goto :goto_8

    :cond_21
    move v9, v8

    goto/16 :goto_4

    :cond_22
    move v10, v8

    goto/16 :goto_3
.end method
