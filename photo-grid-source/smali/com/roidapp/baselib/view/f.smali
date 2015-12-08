.class final Lcom/roidapp/baselib/view/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/roidapp/baselib/view/e;


# direct methods
.method constructor <init>(Lcom/roidapp/baselib/view/e;)V
    .locals 0

    .prologue
    .line 59
    iput-object p1, p0, Lcom/roidapp/baselib/view/f;->a:Lcom/roidapp/baselib/view/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 14

    .prologue
    const/16 v13, 0x169

    const/4 v12, 0x3

    const/4 v11, 0x2

    const/4 v2, 0x0

    const/4 v1, 0x1

    .line 63
    iget-object v0, p0, Lcom/roidapp/baselib/view/f;->a:Lcom/roidapp/baselib/view/e;

    invoke-static {v0}, Lcom/roidapp/baselib/view/e;->a(Lcom/roidapp/baselib/view/e;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/baselib/view/f;->a:Lcom/roidapp/baselib/view/e;

    invoke-static {v0}, Lcom/roidapp/baselib/view/e;->b(Lcom/roidapp/baselib/view/e;)I

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/roidapp/baselib/view/f;->a:Lcom/roidapp/baselib/view/e;

    invoke-static {v0}, Lcom/roidapp/baselib/view/e;->c(Lcom/roidapp/baselib/view/e;)I

    move-result v0

    if-nez v0, :cond_1

    .line 126
    :cond_0
    :goto_0
    return-void

    .line 67
    :cond_1
    iget-object v0, p0, Lcom/roidapp/baselib/view/f;->a:Lcom/roidapp/baselib/view/e;

    invoke-virtual {v0}, Lcom/roidapp/baselib/view/e;->getWidth()I

    move-result v3

    .line 68
    iget-object v0, p0, Lcom/roidapp/baselib/view/f;->a:Lcom/roidapp/baselib/view/e;

    invoke-virtual {v0}, Lcom/roidapp/baselib/view/e;->getHeight()I

    move-result v4

    .line 69
    if-lez v3, :cond_7

    if-lez v4, :cond_7

    .line 71
    iget-object v0, p0, Lcom/roidapp/baselib/view/f;->a:Lcom/roidapp/baselib/view/e;

    invoke-static {v0}, Lcom/roidapp/baselib/view/e;->b(Lcom/roidapp/baselib/view/e;)I

    move-result v0

    iget-object v5, p0, Lcom/roidapp/baselib/view/f;->a:Lcom/roidapp/baselib/view/e;

    invoke-static {v5}, Lcom/roidapp/baselib/view/e;->d(Lcom/roidapp/baselib/view/e;)Ljava/util/Random;

    move-result-object v5

    iget-object v6, p0, Lcom/roidapp/baselib/view/f;->a:Lcom/roidapp/baselib/view/e;

    invoke-static {v6}, Lcom/roidapp/baselib/view/e;->c(Lcom/roidapp/baselib/view/e;)I

    move-result v6

    iget-object v7, p0, Lcom/roidapp/baselib/view/f;->a:Lcom/roidapp/baselib/view/e;

    invoke-static {v7}, Lcom/roidapp/baselib/view/e;->b(Lcom/roidapp/baselib/view/e;)I

    move-result v7

    sub-int/2addr v6, v7

    add-int/lit8 v6, v6, 0x1

    invoke-virtual {v5, v6}, Ljava/util/Random;->nextInt(I)I

    move-result v5

    add-int/2addr v5, v0

    .line 72
    iget-object v0, p0, Lcom/roidapp/baselib/view/f;->a:Lcom/roidapp/baselib/view/e;

    invoke-static {v0}, Lcom/roidapp/baselib/view/e;->c(Lcom/roidapp/baselib/view/e;)I

    move-result v0

    int-to-float v0, v0

    iget-object v6, p0, Lcom/roidapp/baselib/view/f;->a:Lcom/roidapp/baselib/view/e;

    invoke-static {v6}, Lcom/roidapp/baselib/view/e;->e(Lcom/roidapp/baselib/view/e;)F

    move-result v6

    mul-float/2addr v0, v6

    float-to-int v0, v0

    if-le v5, v0, :cond_8

    move v0, v1

    .line 73
    :goto_1
    iget-object v6, p0, Lcom/roidapp/baselib/view/f;->a:Lcom/roidapp/baselib/view/e;

    invoke-static {v6}, Lcom/roidapp/baselib/view/e;->d(Lcom/roidapp/baselib/view/e;)Ljava/util/Random;

    move-result-object v6

    sub-int v7, v3, v5

    invoke-virtual {v6, v7}, Ljava/util/Random;->nextInt(I)I

    move-result v6

    .line 75
    new-instance v7, Landroid/widget/ImageView;

    iget-object v8, p0, Lcom/roidapp/baselib/view/f;->a:Lcom/roidapp/baselib/view/e;

    invoke-virtual {v8}, Lcom/roidapp/baselib/view/e;->getContext()Landroid/content/Context;

    move-result-object v8

    invoke-direct {v7, v8}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 77
    new-instance v8, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {v8, v5, v5}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 78
    iput v6, v8, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    .line 79
    invoke-virtual {v7, v8}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 80
    iget-object v8, p0, Lcom/roidapp/baselib/view/f;->a:Lcom/roidapp/baselib/view/e;

    invoke-static {v8}, Lcom/roidapp/baselib/view/e;->f(Lcom/roidapp/baselib/view/e;)[Landroid/graphics/drawable/Drawable;

    move-result-object v8

    iget-object v9, p0, Lcom/roidapp/baselib/view/f;->a:Lcom/roidapp/baselib/view/e;

    invoke-static {v9}, Lcom/roidapp/baselib/view/e;->d(Lcom/roidapp/baselib/view/e;)Ljava/util/Random;

    move-result-object v9

    iget-object v10, p0, Lcom/roidapp/baselib/view/f;->a:Lcom/roidapp/baselib/view/e;

    invoke-static {v10}, Lcom/roidapp/baselib/view/e;->f(Lcom/roidapp/baselib/view/e;)[Landroid/graphics/drawable/Drawable;

    move-result-object v10

    array-length v10, v10

    invoke-virtual {v9, v10}, Ljava/util/Random;->nextInt(I)I

    move-result v9

    aget-object v8, v8, v9

    invoke-virtual {v7, v8}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 82
    iget-object v8, p0, Lcom/roidapp/baselib/view/f;->a:Lcom/roidapp/baselib/view/e;

    invoke-static {v8}, Lcom/roidapp/baselib/view/e;->g(Lcom/roidapp/baselib/view/e;)[I

    move-result-object v8

    if-eqz v8, :cond_2

    .line 83
    iget-object v8, p0, Lcom/roidapp/baselib/view/f;->a:Lcom/roidapp/baselib/view/e;

    invoke-static {v8}, Lcom/roidapp/baselib/view/e;->g(Lcom/roidapp/baselib/view/e;)[I

    move-result-object v8

    iget-object v9, p0, Lcom/roidapp/baselib/view/f;->a:Lcom/roidapp/baselib/view/e;

    invoke-static {v9}, Lcom/roidapp/baselib/view/e;->d(Lcom/roidapp/baselib/view/e;)Ljava/util/Random;

    move-result-object v9

    iget-object v10, p0, Lcom/roidapp/baselib/view/f;->a:Lcom/roidapp/baselib/view/e;

    invoke-static {v10}, Lcom/roidapp/baselib/view/e;->g(Lcom/roidapp/baselib/view/e;)[I

    move-result-object v10

    array-length v10, v10

    invoke-virtual {v9, v10}, Ljava/util/Random;->nextInt(I)I

    move-result v9

    aget v8, v8, v9

    invoke-virtual {v7, v8}, Landroid/widget/ImageView;->setColorFilter(I)V

    .line 86
    :cond_2
    new-instance v8, Landroid/animation/AnimatorSet;

    invoke-direct {v8}, Landroid/animation/AnimatorSet;-><init>()V

    .line 87
    iget-object v9, p0, Lcom/roidapp/baselib/view/f;->a:Lcom/roidapp/baselib/view/e;

    invoke-static {v9}, Lcom/roidapp/baselib/view/e;->h(Lcom/roidapp/baselib/view/e;)Z

    move-result v9

    if-eqz v9, :cond_4

    .line 88
    div-int/lit8 v3, v3, 0x2

    .line 89
    if-le v6, v3, :cond_3

    neg-int v3, v3

    .line 90
    :cond_3
    new-array v6, v1, [Landroid/animation/Animator;

    const-string v9, "translationX"

    new-array v10, v1, [F

    int-to-float v3, v3

    aput v3, v10, v2

    invoke-static {v7, v9, v10}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v3

    aput-object v3, v6, v2

    invoke-virtual {v8, v6}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    .line 93
    :cond_4
    iget-object v3, p0, Lcom/roidapp/baselib/view/f;->a:Lcom/roidapp/baselib/view/e;

    invoke-static {v3}, Lcom/roidapp/baselib/view/e;->i(Lcom/roidapp/baselib/view/e;)Z

    move-result v3

    if-eqz v3, :cond_5

    .line 94
    new-array v3, v1, [Landroid/animation/Animator;

    const-string v6, "translationY"

    new-array v9, v11, [F

    neg-int v5, v5

    int-to-float v5, v5

    aput v5, v9, v2

    int-to-float v5, v4

    aput v5, v9, v1

    invoke-static {v7, v6, v9}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v5

    aput-object v5, v3, v2

    invoke-virtual {v8, v3}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    .line 97
    :cond_5
    iget-object v3, p0, Lcom/roidapp/baselib/view/f;->a:Lcom/roidapp/baselib/view/e;

    invoke-static {v3}, Lcom/roidapp/baselib/view/e;->j(Lcom/roidapp/baselib/view/e;)Z

    move-result v3

    if-eqz v3, :cond_6

    .line 98
    new-array v3, v1, [Landroid/animation/Animator;

    const-string v5, "rotation"

    new-array v6, v11, [F

    iget-object v9, p0, Lcom/roidapp/baselib/view/f;->a:Lcom/roidapp/baselib/view/e;

    invoke-static {v9}, Lcom/roidapp/baselib/view/e;->d(Lcom/roidapp/baselib/view/e;)Ljava/util/Random;

    move-result-object v9

    invoke-virtual {v9, v13}, Ljava/util/Random;->nextInt(I)I

    move-result v9

    iget-object v10, p0, Lcom/roidapp/baselib/view/f;->a:Lcom/roidapp/baselib/view/e;

    invoke-static {v10}, Lcom/roidapp/baselib/view/e;->d(Lcom/roidapp/baselib/view/e;)Ljava/util/Random;

    move-result-object v10

    invoke-virtual {v10, v12}, Ljava/util/Random;->nextInt(I)I

    move-result v10

    add-int/lit8 v10, v10, -0x1

    mul-int/2addr v9, v10

    int-to-float v9, v9

    aput v9, v6, v2

    iget-object v9, p0, Lcom/roidapp/baselib/view/f;->a:Lcom/roidapp/baselib/view/e;

    invoke-static {v9}, Lcom/roidapp/baselib/view/e;->d(Lcom/roidapp/baselib/view/e;)Ljava/util/Random;

    move-result-object v9

    invoke-virtual {v9, v13}, Ljava/util/Random;->nextInt(I)I

    move-result v9

    iget-object v10, p0, Lcom/roidapp/baselib/view/f;->a:Lcom/roidapp/baselib/view/e;

    invoke-static {v10}, Lcom/roidapp/baselib/view/e;->d(Lcom/roidapp/baselib/view/e;)Ljava/util/Random;

    move-result-object v10

    invoke-virtual {v10, v12}, Ljava/util/Random;->nextInt(I)I

    move-result v10

    add-int/lit8 v10, v10, -0x1

    mul-int/2addr v9, v10

    int-to-float v9, v9

    aput v9, v6, v1

    invoke-static {v7, v5, v6}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v5

    aput-object v5, v3, v2

    invoke-virtual {v8, v3}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    .line 103
    :cond_6
    iget-object v2, p0, Lcom/roidapp/baselib/view/f;->a:Lcom/roidapp/baselib/view/e;

    invoke-static {v2}, Lcom/roidapp/baselib/view/e;->k(Lcom/roidapp/baselib/view/e;)I

    move-result v2

    div-int v2, v4, v2

    .line 105
    if-eqz v0, :cond_9

    iget-object v0, p0, Lcom/roidapp/baselib/view/f;->a:Lcom/roidapp/baselib/view/e;

    invoke-static {v0}, Lcom/roidapp/baselib/view/e;->d(Lcom/roidapp/baselib/view/e;)Ljava/util/Random;

    move-result-object v0

    invoke-virtual {v0, v11}, Ljava/util/Random;->nextInt(I)I

    move-result v0

    sub-int v0, v2, v0

    add-int/lit8 v0, v0, -0x1

    :goto_2
    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 107
    mul-int/lit16 v0, v0, 0x3e8

    int-to-long v0, v0

    invoke-virtual {v8, v0, v1}, Landroid/animation/AnimatorSet;->setDuration(J)Landroid/animation/AnimatorSet;

    .line 109
    iget-object v0, p0, Lcom/roidapp/baselib/view/f;->a:Lcom/roidapp/baselib/view/e;

    invoke-static {v0}, Lcom/roidapp/baselib/view/e;->l(Lcom/roidapp/baselib/view/e;)Landroid/view/animation/Interpolator;

    move-result-object v0

    invoke-virtual {v8, v0}, Landroid/animation/AnimatorSet;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 110
    new-instance v0, Lcom/roidapp/baselib/view/g;

    invoke-direct {v0, p0, v7}, Lcom/roidapp/baselib/view/g;-><init>(Lcom/roidapp/baselib/view/f;Landroid/widget/ImageView;)V

    invoke-virtual {v8, v0}, Landroid/animation/AnimatorSet;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 121
    iget-object v0, p0, Lcom/roidapp/baselib/view/f;->a:Lcom/roidapp/baselib/view/e;

    invoke-virtual {v0, v7}, Lcom/roidapp/baselib/view/e;->addView(Landroid/view/View;)V

    .line 122
    invoke-virtual {v8}, Landroid/animation/AnimatorSet;->start()V

    .line 123
    iget-object v0, p0, Lcom/roidapp/baselib/view/f;->a:Lcom/roidapp/baselib/view/e;

    invoke-static {v0}, Lcom/roidapp/baselib/view/e;->m(Lcom/roidapp/baselib/view/e;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 125
    :cond_7
    iget-object v0, p0, Lcom/roidapp/baselib/view/f;->a:Lcom/roidapp/baselib/view/e;

    invoke-static {v0}, Lcom/roidapp/baselib/view/e;->n(Lcom/roidapp/baselib/view/e;)V

    goto/16 :goto_0

    :cond_8
    move v0, v2

    .line 72
    goto/16 :goto_1

    .line 105
    :cond_9
    iget-object v0, p0, Lcom/roidapp/baselib/view/f;->a:Lcom/roidapp/baselib/view/e;

    invoke-static {v0}, Lcom/roidapp/baselib/view/e;->d(Lcom/roidapp/baselib/view/e;)Ljava/util/Random;

    move-result-object v0

    const/16 v3, 0xa

    invoke-virtual {v0, v3}, Ljava/util/Random;->nextInt(I)I

    move-result v0

    add-int/2addr v0, v2

    goto :goto_2
.end method
