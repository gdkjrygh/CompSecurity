.class final Lcom/kik/cache/at;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field final synthetic a:Lcom/kik/cache/ProfileImageView;


# direct methods
.method constructor <init>(Lcom/kik/cache/ProfileImageView;)V
    .locals 0

    .prologue
    .line 208
    iput-object p1, p0, Lcom/kik/cache/at;->a:Lcom/kik/cache/ProfileImageView;

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

    .line 213
    iget-object v0, p0, Lcom/kik/cache/at;->a:Lcom/kik/cache/ProfileImageView;

    invoke-static {v0}, Lcom/kik/cache/ProfileImageView;->c(Lcom/kik/cache/ProfileImageView;)Landroid/view/View$OnTouchListener;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 214
    iget-object v0, p0, Lcom/kik/cache/at;->a:Lcom/kik/cache/ProfileImageView;

    invoke-static {v0}, Lcom/kik/cache/ProfileImageView;->c(Lcom/kik/cache/ProfileImageView;)Landroid/view/View$OnTouchListener;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Landroid/view/View$OnTouchListener;->onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z

    .line 216
    :cond_0
    iget-object v0, p0, Lcom/kik/cache/at;->a:Lcom/kik/cache/ProfileImageView;

    invoke-static {v0}, Lcom/kik/cache/ProfileImageView;->d(Lcom/kik/cache/ProfileImageView;)Landroid/view/ScaleGestureDetector;

    move-result-object v0

    invoke-virtual {v0, p2}, Landroid/view/ScaleGestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 218
    iget-object v0, p0, Lcom/kik/cache/at;->a:Lcom/kik/cache/ProfileImageView;

    invoke-static {v0}, Lcom/kik/cache/ProfileImageView;->f(Lcom/kik/cache/ProfileImageView;)Landroid/graphics/Matrix;

    move-result-object v0

    iget-object v2, p0, Lcom/kik/cache/at;->a:Lcom/kik/cache/ProfileImageView;

    invoke-static {v2}, Lcom/kik/cache/ProfileImageView;->e(Lcom/kik/cache/ProfileImageView;)[F

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/graphics/Matrix;->getValues([F)V

    .line 219
    iget-object v0, p0, Lcom/kik/cache/at;->a:Lcom/kik/cache/ProfileImageView;

    invoke-static {v0}, Lcom/kik/cache/ProfileImageView;->e(Lcom/kik/cache/ProfileImageView;)[F

    move-result-object v0

    const/4 v2, 0x2

    aget v3, v0, v2

    .line 220
    iget-object v0, p0, Lcom/kik/cache/at;->a:Lcom/kik/cache/ProfileImageView;

    invoke-static {v0}, Lcom/kik/cache/ProfileImageView;->e(Lcom/kik/cache/ProfileImageView;)[F

    move-result-object v0

    const/4 v2, 0x5

    aget v4, v0, v2

    .line 221
    new-instance v5, Landroid/graphics/PointF;

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result v2

    invoke-direct {v5, v0, v2}, Landroid/graphics/PointF;-><init>(FF)V

    .line 223
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    .line 286
    :cond_1
    :goto_0
    :pswitch_0
    iget-object v0, p0, Lcom/kik/cache/at;->a:Lcom/kik/cache/ProfileImageView;

    iget-object v1, p0, Lcom/kik/cache/at;->a:Lcom/kik/cache/ProfileImageView;

    invoke-static {v1}, Lcom/kik/cache/ProfileImageView;->f(Lcom/kik/cache/ProfileImageView;)Landroid/graphics/Matrix;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kik/cache/ProfileImageView;->setImageMatrix(Landroid/graphics/Matrix;)V

    .line 287
    iget-object v0, p0, Lcom/kik/cache/at;->a:Lcom/kik/cache/ProfileImageView;

    invoke-virtual {v0}, Lcom/kik/cache/ProfileImageView;->invalidate()V

    .line 288
    return v9

    .line 225
    :pswitch_1
    iget-object v0, p0, Lcom/kik/cache/at;->a:Lcom/kik/cache/ProfileImageView;

    invoke-static {v0}, Lcom/kik/cache/ProfileImageView;->g(Lcom/kik/cache/ProfileImageView;)Landroid/graphics/PointF;

    move-result-object v0

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result v2

    invoke-virtual {v0, v1, v2}, Landroid/graphics/PointF;->set(FF)V

    .line 226
    iget-object v0, p0, Lcom/kik/cache/at;->a:Lcom/kik/cache/ProfileImageView;

    invoke-static {v0}, Lcom/kik/cache/ProfileImageView;->h(Lcom/kik/cache/ProfileImageView;)Landroid/graphics/PointF;

    move-result-object v0

    iget-object v1, p0, Lcom/kik/cache/at;->a:Lcom/kik/cache/ProfileImageView;

    invoke-static {v1}, Lcom/kik/cache/ProfileImageView;->g(Lcom/kik/cache/ProfileImageView;)Landroid/graphics/PointF;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/graphics/PointF;->set(Landroid/graphics/PointF;)V

    .line 227
    iget-object v0, p0, Lcom/kik/cache/at;->a:Lcom/kik/cache/ProfileImageView;

    invoke-static {v0, v9}, Lcom/kik/cache/ProfileImageView;->a(Lcom/kik/cache/ProfileImageView;I)I

    goto :goto_0

    .line 230
    :pswitch_2
    iget-object v0, p0, Lcom/kik/cache/at;->a:Lcom/kik/cache/ProfileImageView;

    invoke-static {v0}, Lcom/kik/cache/ProfileImageView;->i(Lcom/kik/cache/ProfileImageView;)I

    move-result v0

    if-ne v0, v9, :cond_1

    .line 231
    iget v0, v5, Landroid/graphics/PointF;->x:F

    iget-object v2, p0, Lcom/kik/cache/at;->a:Lcom/kik/cache/ProfileImageView;

    invoke-static {v2}, Lcom/kik/cache/ProfileImageView;->g(Lcom/kik/cache/ProfileImageView;)Landroid/graphics/PointF;

    move-result-object v2

    iget v2, v2, Landroid/graphics/PointF;->x:F

    sub-float v2, v0, v2

    .line 232
    iget v0, v5, Landroid/graphics/PointF;->y:F

    iget-object v6, p0, Lcom/kik/cache/at;->a:Lcom/kik/cache/ProfileImageView;

    invoke-static {v6}, Lcom/kik/cache/ProfileImageView;->g(Lcom/kik/cache/ProfileImageView;)Landroid/graphics/PointF;

    move-result-object v6

    iget v6, v6, Landroid/graphics/PointF;->y:F

    sub-float/2addr v0, v6

    .line 233
    iget-object v6, p0, Lcom/kik/cache/at;->a:Lcom/kik/cache/ProfileImageView;

    invoke-static {v6}, Lcom/kik/cache/ProfileImageView;->j(Lcom/kik/cache/ProfileImageView;)F

    move-result v6

    iget-object v7, p0, Lcom/kik/cache/at;->a:Lcom/kik/cache/ProfileImageView;

    invoke-static {v7}, Lcom/kik/cache/ProfileImageView;->k(Lcom/kik/cache/ProfileImageView;)F

    move-result v7

    mul-float/2addr v6, v7

    invoke-static {v6}, Ljava/lang/Math;->round(F)I

    move-result v6

    int-to-float v6, v6

    .line 234
    iget-object v7, p0, Lcom/kik/cache/at;->a:Lcom/kik/cache/ProfileImageView;

    invoke-static {v7}, Lcom/kik/cache/ProfileImageView;->l(Lcom/kik/cache/ProfileImageView;)F

    move-result v7

    iget-object v8, p0, Lcom/kik/cache/at;->a:Lcom/kik/cache/ProfileImageView;

    invoke-static {v8}, Lcom/kik/cache/ProfileImageView;->k(Lcom/kik/cache/ProfileImageView;)F

    move-result v8

    mul-float/2addr v7, v8

    invoke-static {v7}, Ljava/lang/Math;->round(F)I

    move-result v7

    int-to-float v7, v7

    .line 235
    iget-object v8, p0, Lcom/kik/cache/at;->a:Lcom/kik/cache/ProfileImageView;

    invoke-static {v8}, Lcom/kik/cache/ProfileImageView;->m(Lcom/kik/cache/ProfileImageView;)F

    move-result v8

    cmpg-float v6, v6, v8

    if-gez v6, :cond_4

    .line 237
    add-float v2, v4, v0

    cmpl-float v2, v2, v1

    if-lez v2, :cond_3

    .line 238
    neg-float v0, v4

    .line 268
    :cond_2
    :goto_1
    iget-object v2, p0, Lcom/kik/cache/at;->a:Lcom/kik/cache/ProfileImageView;

    invoke-static {v2}, Lcom/kik/cache/ProfileImageView;->f(Lcom/kik/cache/ProfileImageView;)Landroid/graphics/Matrix;

    move-result-object v2

    invoke-virtual {v2, v1, v0}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 269
    iget-object v0, p0, Lcom/kik/cache/at;->a:Lcom/kik/cache/ProfileImageView;

    invoke-static {v0}, Lcom/kik/cache/ProfileImageView;->g(Lcom/kik/cache/ProfileImageView;)Landroid/graphics/PointF;

    move-result-object v0

    iget v1, v5, Landroid/graphics/PointF;->x:F

    iget v2, v5, Landroid/graphics/PointF;->y:F

    invoke-virtual {v0, v1, v2}, Landroid/graphics/PointF;->set(FF)V

    goto/16 :goto_0

    .line 240
    :cond_3
    add-float v2, v4, v0

    iget-object v3, p0, Lcom/kik/cache/at;->a:Lcom/kik/cache/ProfileImageView;

    invoke-static {v3}, Lcom/kik/cache/ProfileImageView;->n(Lcom/kik/cache/ProfileImageView;)F

    move-result v3

    neg-float v3, v3

    cmpg-float v2, v2, v3

    if-gez v2, :cond_2

    .line 241
    iget-object v0, p0, Lcom/kik/cache/at;->a:Lcom/kik/cache/ProfileImageView;

    invoke-static {v0}, Lcom/kik/cache/ProfileImageView;->n(Lcom/kik/cache/ProfileImageView;)F

    move-result v0

    add-float/2addr v0, v4

    neg-float v0, v0

    goto :goto_1

    .line 244
    :cond_4
    iget-object v6, p0, Lcom/kik/cache/at;->a:Lcom/kik/cache/ProfileImageView;

    invoke-static {v6}, Lcom/kik/cache/ProfileImageView;->o(Lcom/kik/cache/ProfileImageView;)F

    move-result v6

    cmpg-float v6, v7, v6

    if-gez v6, :cond_6

    .line 246
    add-float v0, v3, v2

    cmpl-float v0, v0, v1

    if-lez v0, :cond_5

    .line 247
    neg-float v0, v3

    move v10, v1

    move v1, v0

    move v0, v10

    goto :goto_1

    .line 249
    :cond_5
    add-float v0, v3, v2

    iget-object v4, p0, Lcom/kik/cache/at;->a:Lcom/kik/cache/ProfileImageView;

    invoke-static {v4}, Lcom/kik/cache/ProfileImageView;->p(Lcom/kik/cache/ProfileImageView;)F

    move-result v4

    neg-float v4, v4

    cmpg-float v0, v0, v4

    if-gez v0, :cond_b

    .line 250
    iget-object v0, p0, Lcom/kik/cache/at;->a:Lcom/kik/cache/ProfileImageView;

    invoke-static {v0}, Lcom/kik/cache/ProfileImageView;->p(Lcom/kik/cache/ProfileImageView;)F

    move-result v0

    add-float/2addr v0, v3

    neg-float v0, v0

    move v10, v1

    move v1, v0

    move v0, v10

    goto :goto_1

    .line 254
    :cond_6
    add-float v6, v3, v2

    cmpl-float v6, v6, v1

    if-lez v6, :cond_8

    .line 255
    neg-float v2, v3

    .line 261
    :cond_7
    :goto_2
    add-float v3, v4, v0

    cmpl-float v1, v3, v1

    if-lez v1, :cond_9

    .line 262
    neg-float v0, v4

    move v1, v2

    goto :goto_1

    .line 257
    :cond_8
    add-float v6, v3, v2

    iget-object v7, p0, Lcom/kik/cache/at;->a:Lcom/kik/cache/ProfileImageView;

    invoke-static {v7}, Lcom/kik/cache/ProfileImageView;->p(Lcom/kik/cache/ProfileImageView;)F

    move-result v7

    neg-float v7, v7

    cmpg-float v6, v6, v7

    if-gez v6, :cond_7

    .line 258
    iget-object v2, p0, Lcom/kik/cache/at;->a:Lcom/kik/cache/ProfileImageView;

    invoke-static {v2}, Lcom/kik/cache/ProfileImageView;->p(Lcom/kik/cache/ProfileImageView;)F

    move-result v2

    add-float/2addr v2, v3

    neg-float v2, v2

    goto :goto_2

    .line 264
    :cond_9
    add-float v1, v4, v0

    iget-object v3, p0, Lcom/kik/cache/at;->a:Lcom/kik/cache/ProfileImageView;

    invoke-static {v3}, Lcom/kik/cache/ProfileImageView;->n(Lcom/kik/cache/ProfileImageView;)F

    move-result v3

    neg-float v3, v3

    cmpg-float v1, v1, v3

    if-gez v1, :cond_a

    .line 265
    iget-object v0, p0, Lcom/kik/cache/at;->a:Lcom/kik/cache/ProfileImageView;

    invoke-static {v0}, Lcom/kik/cache/ProfileImageView;->n(Lcom/kik/cache/ProfileImageView;)F

    move-result v0

    add-float/2addr v0, v4

    neg-float v0, v0

    move v1, v2

    goto/16 :goto_1

    .line 274
    :pswitch_3
    iget-object v0, p0, Lcom/kik/cache/at;->a:Lcom/kik/cache/ProfileImageView;

    invoke-static {v0, v6}, Lcom/kik/cache/ProfileImageView;->a(Lcom/kik/cache/ProfileImageView;I)I

    .line 275
    iget v0, v5, Landroid/graphics/PointF;->x:F

    iget-object v1, p0, Lcom/kik/cache/at;->a:Lcom/kik/cache/ProfileImageView;

    invoke-static {v1}, Lcom/kik/cache/ProfileImageView;->h(Lcom/kik/cache/ProfileImageView;)Landroid/graphics/PointF;

    move-result-object v1

    iget v1, v1, Landroid/graphics/PointF;->x:F

    sub-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    float-to-int v0, v0

    .line 276
    iget v1, v5, Landroid/graphics/PointF;->y:F

    iget-object v2, p0, Lcom/kik/cache/at;->a:Lcom/kik/cache/ProfileImageView;

    invoke-static {v2}, Lcom/kik/cache/ProfileImageView;->h(Lcom/kik/cache/ProfileImageView;)Landroid/graphics/PointF;

    move-result-object v2

    iget v2, v2, Landroid/graphics/PointF;->y:F

    sub-float/2addr v1, v2

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    float-to-int v1, v1

    .line 277
    if-ge v0, v7, :cond_1

    if-ge v1, v7, :cond_1

    .line 278
    iget-object v0, p0, Lcom/kik/cache/at;->a:Lcom/kik/cache/ProfileImageView;

    invoke-virtual {v0}, Lcom/kik/cache/ProfileImageView;->performClick()Z

    goto/16 :goto_0

    .line 283
    :pswitch_4
    iget-object v0, p0, Lcom/kik/cache/at;->a:Lcom/kik/cache/ProfileImageView;

    invoke-static {v0, v6}, Lcom/kik/cache/ProfileImageView;->a(Lcom/kik/cache/ProfileImageView;I)I

    goto/16 :goto_0

    :cond_a
    move v1, v2

    goto/16 :goto_1

    :cond_b
    move v0, v1

    move v1, v2

    goto/16 :goto_1

    .line 223
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
