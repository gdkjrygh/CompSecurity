.class final Lkik/android/widget/eg;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field final synthetic a:Lkik/android/widget/TouchImageView;


# direct methods
.method constructor <init>(Lkik/android/widget/TouchImageView;)V
    .locals 0

    .prologue
    .line 73
    iput-object p1, p0, Lkik/android/widget/eg;->a:Lkik/android/widget/TouchImageView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 11

    .prologue
    const/4 v7, 0x3

    const/4 v6, 0x0

    const/4 v9, 0x1

    const/4 v1, 0x0

    .line 78
    iget-object v0, p0, Lkik/android/widget/eg;->a:Lkik/android/widget/TouchImageView;

    invoke-static {v0}, Lkik/android/widget/TouchImageView;->a(Lkik/android/widget/TouchImageView;)Landroid/view/View$OnTouchListener;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Landroid/view/View$OnTouchListener;->onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z

    .line 79
    iget-object v0, p0, Lkik/android/widget/eg;->a:Lkik/android/widget/TouchImageView;

    invoke-static {v0}, Lkik/android/widget/TouchImageView;->b(Lkik/android/widget/TouchImageView;)Landroid/view/ScaleGestureDetector;

    move-result-object v0

    invoke-virtual {v0, p2}, Landroid/view/ScaleGestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 81
    iget-object v0, p0, Lkik/android/widget/eg;->a:Lkik/android/widget/TouchImageView;

    invoke-static {v0}, Lkik/android/widget/TouchImageView;->d(Lkik/android/widget/TouchImageView;)Landroid/graphics/Matrix;

    move-result-object v0

    iget-object v2, p0, Lkik/android/widget/eg;->a:Lkik/android/widget/TouchImageView;

    invoke-static {v2}, Lkik/android/widget/TouchImageView;->c(Lkik/android/widget/TouchImageView;)[F

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/graphics/Matrix;->getValues([F)V

    .line 82
    iget-object v0, p0, Lkik/android/widget/eg;->a:Lkik/android/widget/TouchImageView;

    invoke-static {v0}, Lkik/android/widget/TouchImageView;->c(Lkik/android/widget/TouchImageView;)[F

    move-result-object v0

    const/4 v2, 0x2

    aget v3, v0, v2

    .line 83
    iget-object v0, p0, Lkik/android/widget/eg;->a:Lkik/android/widget/TouchImageView;

    invoke-static {v0}, Lkik/android/widget/TouchImageView;->c(Lkik/android/widget/TouchImageView;)[F

    move-result-object v0

    const/4 v2, 0x5

    aget v4, v0, v2

    .line 84
    new-instance v5, Landroid/graphics/PointF;

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result v2

    invoke-direct {v5, v0, v2}, Landroid/graphics/PointF;-><init>(FF)V

    .line 86
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    .line 149
    :cond_0
    :goto_0
    :pswitch_0
    iget-object v0, p0, Lkik/android/widget/eg;->a:Lkik/android/widget/TouchImageView;

    iget-object v1, p0, Lkik/android/widget/eg;->a:Lkik/android/widget/TouchImageView;

    invoke-static {v1}, Lkik/android/widget/TouchImageView;->d(Lkik/android/widget/TouchImageView;)Landroid/graphics/Matrix;

    move-result-object v1

    invoke-virtual {v0, v1}, Lkik/android/widget/TouchImageView;->setImageMatrix(Landroid/graphics/Matrix;)V

    .line 150
    iget-object v0, p0, Lkik/android/widget/eg;->a:Lkik/android/widget/TouchImageView;

    invoke-virtual {v0}, Lkik/android/widget/TouchImageView;->invalidate()V

    .line 151
    return v9

    .line 88
    :pswitch_1
    iget-object v0, p0, Lkik/android/widget/eg;->a:Lkik/android/widget/TouchImageView;

    invoke-static {v0}, Lkik/android/widget/TouchImageView;->e(Lkik/android/widget/TouchImageView;)Landroid/graphics/PointF;

    move-result-object v0

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result v2

    invoke-virtual {v0, v1, v2}, Landroid/graphics/PointF;->set(FF)V

    .line 89
    iget-object v0, p0, Lkik/android/widget/eg;->a:Lkik/android/widget/TouchImageView;

    invoke-static {v0}, Lkik/android/widget/TouchImageView;->f(Lkik/android/widget/TouchImageView;)Landroid/graphics/PointF;

    move-result-object v0

    iget-object v1, p0, Lkik/android/widget/eg;->a:Lkik/android/widget/TouchImageView;

    invoke-static {v1}, Lkik/android/widget/TouchImageView;->e(Lkik/android/widget/TouchImageView;)Landroid/graphics/PointF;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/graphics/PointF;->set(Landroid/graphics/PointF;)V

    .line 90
    iget-object v0, p0, Lkik/android/widget/eg;->a:Lkik/android/widget/TouchImageView;

    invoke-static {v0, v9}, Lkik/android/widget/TouchImageView;->a(Lkik/android/widget/TouchImageView;I)I

    goto :goto_0

    .line 93
    :pswitch_2
    iget-object v0, p0, Lkik/android/widget/eg;->a:Lkik/android/widget/TouchImageView;

    invoke-static {v0}, Lkik/android/widget/TouchImageView;->g(Lkik/android/widget/TouchImageView;)I

    move-result v0

    if-ne v0, v9, :cond_0

    .line 94
    iget v0, v5, Landroid/graphics/PointF;->x:F

    iget-object v2, p0, Lkik/android/widget/eg;->a:Lkik/android/widget/TouchImageView;

    invoke-static {v2}, Lkik/android/widget/TouchImageView;->e(Lkik/android/widget/TouchImageView;)Landroid/graphics/PointF;

    move-result-object v2

    iget v2, v2, Landroid/graphics/PointF;->x:F

    sub-float v2, v0, v2

    .line 95
    iget v0, v5, Landroid/graphics/PointF;->y:F

    iget-object v6, p0, Lkik/android/widget/eg;->a:Lkik/android/widget/TouchImageView;

    invoke-static {v6}, Lkik/android/widget/TouchImageView;->e(Lkik/android/widget/TouchImageView;)Landroid/graphics/PointF;

    move-result-object v6

    iget v6, v6, Landroid/graphics/PointF;->y:F

    sub-float/2addr v0, v6

    .line 96
    iget-object v6, p0, Lkik/android/widget/eg;->a:Lkik/android/widget/TouchImageView;

    invoke-static {v6}, Lkik/android/widget/TouchImageView;->h(Lkik/android/widget/TouchImageView;)F

    move-result v6

    iget-object v7, p0, Lkik/android/widget/eg;->a:Lkik/android/widget/TouchImageView;

    invoke-static {v7}, Lkik/android/widget/TouchImageView;->i(Lkik/android/widget/TouchImageView;)F

    move-result v7

    mul-float/2addr v6, v7

    invoke-static {v6}, Ljava/lang/Math;->round(F)I

    move-result v6

    int-to-float v6, v6

    .line 97
    iget-object v7, p0, Lkik/android/widget/eg;->a:Lkik/android/widget/TouchImageView;

    invoke-static {v7}, Lkik/android/widget/TouchImageView;->j(Lkik/android/widget/TouchImageView;)F

    move-result v7

    iget-object v8, p0, Lkik/android/widget/eg;->a:Lkik/android/widget/TouchImageView;

    invoke-static {v8}, Lkik/android/widget/TouchImageView;->i(Lkik/android/widget/TouchImageView;)F

    move-result v8

    mul-float/2addr v7, v8

    invoke-static {v7}, Ljava/lang/Math;->round(F)I

    move-result v7

    int-to-float v7, v7

    .line 98
    iget-object v8, p0, Lkik/android/widget/eg;->a:Lkik/android/widget/TouchImageView;

    invoke-static {v8}, Lkik/android/widget/TouchImageView;->k(Lkik/android/widget/TouchImageView;)F

    move-result v8

    cmpg-float v6, v6, v8

    if-gez v6, :cond_3

    .line 100
    add-float v2, v4, v0

    cmpl-float v2, v2, v1

    if-lez v2, :cond_2

    .line 101
    neg-float v0, v4

    .line 131
    :cond_1
    :goto_1
    iget-object v2, p0, Lkik/android/widget/eg;->a:Lkik/android/widget/TouchImageView;

    invoke-static {v2}, Lkik/android/widget/TouchImageView;->d(Lkik/android/widget/TouchImageView;)Landroid/graphics/Matrix;

    move-result-object v2

    invoke-virtual {v2, v1, v0}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 132
    iget-object v0, p0, Lkik/android/widget/eg;->a:Lkik/android/widget/TouchImageView;

    invoke-static {v0}, Lkik/android/widget/TouchImageView;->e(Lkik/android/widget/TouchImageView;)Landroid/graphics/PointF;

    move-result-object v0

    iget v1, v5, Landroid/graphics/PointF;->x:F

    iget v2, v5, Landroid/graphics/PointF;->y:F

    invoke-virtual {v0, v1, v2}, Landroid/graphics/PointF;->set(FF)V

    goto/16 :goto_0

    .line 103
    :cond_2
    add-float v2, v4, v0

    iget-object v3, p0, Lkik/android/widget/eg;->a:Lkik/android/widget/TouchImageView;

    invoke-static {v3}, Lkik/android/widget/TouchImageView;->l(Lkik/android/widget/TouchImageView;)F

    move-result v3

    neg-float v3, v3

    cmpg-float v2, v2, v3

    if-gez v2, :cond_1

    .line 104
    iget-object v0, p0, Lkik/android/widget/eg;->a:Lkik/android/widget/TouchImageView;

    invoke-static {v0}, Lkik/android/widget/TouchImageView;->l(Lkik/android/widget/TouchImageView;)F

    move-result v0

    add-float/2addr v0, v4

    neg-float v0, v0

    goto :goto_1

    .line 107
    :cond_3
    iget-object v6, p0, Lkik/android/widget/eg;->a:Lkik/android/widget/TouchImageView;

    invoke-static {v6}, Lkik/android/widget/TouchImageView;->m(Lkik/android/widget/TouchImageView;)F

    move-result v6

    cmpg-float v6, v7, v6

    if-gez v6, :cond_5

    .line 109
    add-float v0, v3, v2

    cmpl-float v0, v0, v1

    if-lez v0, :cond_4

    .line 110
    neg-float v0, v3

    move v10, v1

    move v1, v0

    move v0, v10

    goto :goto_1

    .line 112
    :cond_4
    add-float v0, v3, v2

    iget-object v4, p0, Lkik/android/widget/eg;->a:Lkik/android/widget/TouchImageView;

    invoke-static {v4}, Lkik/android/widget/TouchImageView;->n(Lkik/android/widget/TouchImageView;)F

    move-result v4

    neg-float v4, v4

    cmpg-float v0, v0, v4

    if-gez v0, :cond_a

    .line 113
    iget-object v0, p0, Lkik/android/widget/eg;->a:Lkik/android/widget/TouchImageView;

    invoke-static {v0}, Lkik/android/widget/TouchImageView;->n(Lkik/android/widget/TouchImageView;)F

    move-result v0

    add-float/2addr v0, v3

    neg-float v0, v0

    move v10, v1

    move v1, v0

    move v0, v10

    goto :goto_1

    .line 117
    :cond_5
    add-float v6, v3, v2

    cmpl-float v6, v6, v1

    if-lez v6, :cond_7

    .line 118
    neg-float v2, v3

    .line 124
    :cond_6
    :goto_2
    add-float v3, v4, v0

    cmpl-float v1, v3, v1

    if-lez v1, :cond_8

    .line 125
    neg-float v0, v4

    move v1, v2

    goto :goto_1

    .line 120
    :cond_7
    add-float v6, v3, v2

    iget-object v7, p0, Lkik/android/widget/eg;->a:Lkik/android/widget/TouchImageView;

    invoke-static {v7}, Lkik/android/widget/TouchImageView;->n(Lkik/android/widget/TouchImageView;)F

    move-result v7

    neg-float v7, v7

    cmpg-float v6, v6, v7

    if-gez v6, :cond_6

    .line 121
    iget-object v2, p0, Lkik/android/widget/eg;->a:Lkik/android/widget/TouchImageView;

    invoke-static {v2}, Lkik/android/widget/TouchImageView;->n(Lkik/android/widget/TouchImageView;)F

    move-result v2

    add-float/2addr v2, v3

    neg-float v2, v2

    goto :goto_2

    .line 127
    :cond_8
    add-float v1, v4, v0

    iget-object v3, p0, Lkik/android/widget/eg;->a:Lkik/android/widget/TouchImageView;

    invoke-static {v3}, Lkik/android/widget/TouchImageView;->l(Lkik/android/widget/TouchImageView;)F

    move-result v3

    neg-float v3, v3

    cmpg-float v1, v1, v3

    if-gez v1, :cond_9

    .line 128
    iget-object v0, p0, Lkik/android/widget/eg;->a:Lkik/android/widget/TouchImageView;

    invoke-static {v0}, Lkik/android/widget/TouchImageView;->l(Lkik/android/widget/TouchImageView;)F

    move-result v0

    add-float/2addr v0, v4

    neg-float v0, v0

    move v1, v2

    goto/16 :goto_1

    .line 137
    :pswitch_3
    iget-object v0, p0, Lkik/android/widget/eg;->a:Lkik/android/widget/TouchImageView;

    invoke-static {v0, v6}, Lkik/android/widget/TouchImageView;->a(Lkik/android/widget/TouchImageView;I)I

    .line 138
    iget v0, v5, Landroid/graphics/PointF;->x:F

    iget-object v1, p0, Lkik/android/widget/eg;->a:Lkik/android/widget/TouchImageView;

    invoke-static {v1}, Lkik/android/widget/TouchImageView;->f(Lkik/android/widget/TouchImageView;)Landroid/graphics/PointF;

    move-result-object v1

    iget v1, v1, Landroid/graphics/PointF;->x:F

    sub-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    float-to-int v0, v0

    .line 139
    iget v1, v5, Landroid/graphics/PointF;->y:F

    iget-object v2, p0, Lkik/android/widget/eg;->a:Lkik/android/widget/TouchImageView;

    invoke-static {v2}, Lkik/android/widget/TouchImageView;->f(Lkik/android/widget/TouchImageView;)Landroid/graphics/PointF;

    move-result-object v2

    iget v2, v2, Landroid/graphics/PointF;->y:F

    sub-float/2addr v1, v2

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    float-to-int v1, v1

    .line 140
    if-ge v0, v7, :cond_0

    if-ge v1, v7, :cond_0

    .line 141
    iget-object v0, p0, Lkik/android/widget/eg;->a:Lkik/android/widget/TouchImageView;

    invoke-virtual {v0}, Lkik/android/widget/TouchImageView;->performClick()Z

    goto/16 :goto_0

    .line 146
    :pswitch_4
    iget-object v0, p0, Lkik/android/widget/eg;->a:Lkik/android/widget/TouchImageView;

    invoke-static {v0, v6}, Lkik/android/widget/TouchImageView;->a(Lkik/android/widget/TouchImageView;I)I

    goto/16 :goto_0

    :cond_9
    move v1, v2

    goto/16 :goto_1

    :cond_a
    move v0, v1

    move v1, v2

    goto/16 :goto_1

    .line 86
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_3
        :pswitch_2
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_4
    .end packed-switch
.end method
