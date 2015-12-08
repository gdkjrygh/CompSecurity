.class final Lkik/android/widget/TouchImageView$a;
.super Landroid/view/ScaleGestureDetector$SimpleOnScaleGestureListener;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkik/android/widget/TouchImageView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lkik/android/widget/TouchImageView;


# direct methods
.method private constructor <init>(Lkik/android/widget/TouchImageView;)V
    .locals 0

    .prologue
    .line 172
    iput-object p1, p0, Lkik/android/widget/TouchImageView$a;->a:Lkik/android/widget/TouchImageView;

    invoke-direct {p0}, Landroid/view/ScaleGestureDetector$SimpleOnScaleGestureListener;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lkik/android/widget/TouchImageView;B)V
    .locals 0

    .prologue
    .line 172
    invoke-direct {p0, p1}, Lkik/android/widget/TouchImageView$a;-><init>(Lkik/android/widget/TouchImageView;)V

    return-void
.end method


# virtual methods
.method public final onScale(Landroid/view/ScaleGestureDetector;)Z
    .locals 10

    .prologue
    const/4 v9, 0x5

    const/4 v8, 0x2

    const/high16 v7, 0x3f800000    # 1.0f

    const/high16 v6, 0x40000000    # 2.0f

    const/4 v5, 0x0

    .line 184
    invoke-virtual {p1}, Landroid/view/ScaleGestureDetector;->getScaleFactor()F

    move-result v0

    .line 185
    iget-object v1, p0, Lkik/android/widget/TouchImageView$a;->a:Lkik/android/widget/TouchImageView;

    invoke-static {v1}, Lkik/android/widget/TouchImageView;->i(Lkik/android/widget/TouchImageView;)F

    move-result v1

    .line 186
    iget-object v2, p0, Lkik/android/widget/TouchImageView$a;->a:Lkik/android/widget/TouchImageView;

    invoke-static {v2, v0}, Lkik/android/widget/TouchImageView;->a(Lkik/android/widget/TouchImageView;F)F

    .line 187
    iget-object v2, p0, Lkik/android/widget/TouchImageView$a;->a:Lkik/android/widget/TouchImageView;

    invoke-static {v2}, Lkik/android/widget/TouchImageView;->i(Lkik/android/widget/TouchImageView;)F

    move-result v2

    iget-object v3, p0, Lkik/android/widget/TouchImageView$a;->a:Lkik/android/widget/TouchImageView;

    invoke-static {v3}, Lkik/android/widget/TouchImageView;->o(Lkik/android/widget/TouchImageView;)F

    move-result v3

    cmpl-float v2, v2, v3

    if-lez v2, :cond_3

    .line 188
    iget-object v0, p0, Lkik/android/widget/TouchImageView$a;->a:Lkik/android/widget/TouchImageView;

    iget-object v2, p0, Lkik/android/widget/TouchImageView$a;->a:Lkik/android/widget/TouchImageView;

    invoke-static {v2}, Lkik/android/widget/TouchImageView;->o(Lkik/android/widget/TouchImageView;)F

    move-result v2

    invoke-static {v0, v2}, Lkik/android/widget/TouchImageView;->b(Lkik/android/widget/TouchImageView;F)F

    .line 189
    iget-object v0, p0, Lkik/android/widget/TouchImageView$a;->a:Lkik/android/widget/TouchImageView;

    invoke-static {v0}, Lkik/android/widget/TouchImageView;->o(Lkik/android/widget/TouchImageView;)F

    move-result v0

    div-float/2addr v0, v1

    .line 195
    :cond_0
    :goto_0
    iget-object v1, p0, Lkik/android/widget/TouchImageView$a;->a:Lkik/android/widget/TouchImageView;

    iget-object v2, p0, Lkik/android/widget/TouchImageView$a;->a:Lkik/android/widget/TouchImageView;

    invoke-static {v2}, Lkik/android/widget/TouchImageView;->k(Lkik/android/widget/TouchImageView;)F

    move-result v2

    iget-object v3, p0, Lkik/android/widget/TouchImageView$a;->a:Lkik/android/widget/TouchImageView;

    invoke-static {v3}, Lkik/android/widget/TouchImageView;->i(Lkik/android/widget/TouchImageView;)F

    move-result v3

    mul-float/2addr v2, v3

    iget-object v3, p0, Lkik/android/widget/TouchImageView$a;->a:Lkik/android/widget/TouchImageView;

    invoke-static {v3}, Lkik/android/widget/TouchImageView;->k(Lkik/android/widget/TouchImageView;)F

    move-result v3

    sub-float/2addr v2, v3

    iget-object v3, p0, Lkik/android/widget/TouchImageView$a;->a:Lkik/android/widget/TouchImageView;

    invoke-static {v3}, Lkik/android/widget/TouchImageView;->q(Lkik/android/widget/TouchImageView;)F

    move-result v3

    mul-float/2addr v3, v6

    iget-object v4, p0, Lkik/android/widget/TouchImageView$a;->a:Lkik/android/widget/TouchImageView;

    invoke-static {v4}, Lkik/android/widget/TouchImageView;->i(Lkik/android/widget/TouchImageView;)F

    move-result v4

    mul-float/2addr v3, v4

    sub-float/2addr v2, v3

    invoke-static {v1, v2}, Lkik/android/widget/TouchImageView;->c(Lkik/android/widget/TouchImageView;F)F

    .line 196
    iget-object v1, p0, Lkik/android/widget/TouchImageView$a;->a:Lkik/android/widget/TouchImageView;

    iget-object v2, p0, Lkik/android/widget/TouchImageView$a;->a:Lkik/android/widget/TouchImageView;

    invoke-static {v2}, Lkik/android/widget/TouchImageView;->m(Lkik/android/widget/TouchImageView;)F

    move-result v2

    iget-object v3, p0, Lkik/android/widget/TouchImageView$a;->a:Lkik/android/widget/TouchImageView;

    invoke-static {v3}, Lkik/android/widget/TouchImageView;->i(Lkik/android/widget/TouchImageView;)F

    move-result v3

    mul-float/2addr v2, v3

    iget-object v3, p0, Lkik/android/widget/TouchImageView$a;->a:Lkik/android/widget/TouchImageView;

    invoke-static {v3}, Lkik/android/widget/TouchImageView;->m(Lkik/android/widget/TouchImageView;)F

    move-result v3

    sub-float/2addr v2, v3

    iget-object v3, p0, Lkik/android/widget/TouchImageView$a;->a:Lkik/android/widget/TouchImageView;

    invoke-static {v3}, Lkik/android/widget/TouchImageView;->r(Lkik/android/widget/TouchImageView;)F

    move-result v3

    mul-float/2addr v3, v6

    iget-object v4, p0, Lkik/android/widget/TouchImageView$a;->a:Lkik/android/widget/TouchImageView;

    invoke-static {v4}, Lkik/android/widget/TouchImageView;->i(Lkik/android/widget/TouchImageView;)F

    move-result v4

    mul-float/2addr v3, v4

    sub-float/2addr v2, v3

    invoke-static {v1, v2}, Lkik/android/widget/TouchImageView;->d(Lkik/android/widget/TouchImageView;F)F

    .line 197
    iget-object v1, p0, Lkik/android/widget/TouchImageView$a;->a:Lkik/android/widget/TouchImageView;

    invoke-static {v1}, Lkik/android/widget/TouchImageView;->h(Lkik/android/widget/TouchImageView;)F

    move-result v1

    iget-object v2, p0, Lkik/android/widget/TouchImageView$a;->a:Lkik/android/widget/TouchImageView;

    invoke-static {v2}, Lkik/android/widget/TouchImageView;->i(Lkik/android/widget/TouchImageView;)F

    move-result v2

    mul-float/2addr v1, v2

    iget-object v2, p0, Lkik/android/widget/TouchImageView$a;->a:Lkik/android/widget/TouchImageView;

    invoke-static {v2}, Lkik/android/widget/TouchImageView;->k(Lkik/android/widget/TouchImageView;)F

    move-result v2

    cmpg-float v1, v1, v2

    if-lez v1, :cond_1

    iget-object v1, p0, Lkik/android/widget/TouchImageView$a;->a:Lkik/android/widget/TouchImageView;

    invoke-static {v1}, Lkik/android/widget/TouchImageView;->j(Lkik/android/widget/TouchImageView;)F

    move-result v1

    iget-object v2, p0, Lkik/android/widget/TouchImageView$a;->a:Lkik/android/widget/TouchImageView;

    invoke-static {v2}, Lkik/android/widget/TouchImageView;->i(Lkik/android/widget/TouchImageView;)F

    move-result v2

    mul-float/2addr v1, v2

    iget-object v2, p0, Lkik/android/widget/TouchImageView$a;->a:Lkik/android/widget/TouchImageView;

    invoke-static {v2}, Lkik/android/widget/TouchImageView;->m(Lkik/android/widget/TouchImageView;)F

    move-result v2

    cmpg-float v1, v1, v2

    if-gtz v1, :cond_7

    .line 198
    :cond_1
    iget-object v1, p0, Lkik/android/widget/TouchImageView$a;->a:Lkik/android/widget/TouchImageView;

    invoke-static {v1}, Lkik/android/widget/TouchImageView;->d(Lkik/android/widget/TouchImageView;)Landroid/graphics/Matrix;

    move-result-object v1

    iget-object v2, p0, Lkik/android/widget/TouchImageView$a;->a:Lkik/android/widget/TouchImageView;

    invoke-static {v2}, Lkik/android/widget/TouchImageView;->k(Lkik/android/widget/TouchImageView;)F

    move-result v2

    div-float/2addr v2, v6

    iget-object v3, p0, Lkik/android/widget/TouchImageView$a;->a:Lkik/android/widget/TouchImageView;

    invoke-static {v3}, Lkik/android/widget/TouchImageView;->m(Lkik/android/widget/TouchImageView;)F

    move-result v3

    div-float/2addr v3, v6

    invoke-virtual {v1, v0, v0, v2, v3}, Landroid/graphics/Matrix;->postScale(FFFF)Z

    .line 199
    cmpg-float v1, v0, v7

    if-gez v1, :cond_2

    .line 200
    iget-object v1, p0, Lkik/android/widget/TouchImageView$a;->a:Lkik/android/widget/TouchImageView;

    invoke-static {v1}, Lkik/android/widget/TouchImageView;->d(Lkik/android/widget/TouchImageView;)Landroid/graphics/Matrix;

    move-result-object v1

    iget-object v2, p0, Lkik/android/widget/TouchImageView$a;->a:Lkik/android/widget/TouchImageView;

    invoke-static {v2}, Lkik/android/widget/TouchImageView;->c(Lkik/android/widget/TouchImageView;)[F

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/graphics/Matrix;->getValues([F)V

    .line 201
    iget-object v1, p0, Lkik/android/widget/TouchImageView$a;->a:Lkik/android/widget/TouchImageView;

    invoke-static {v1}, Lkik/android/widget/TouchImageView;->c(Lkik/android/widget/TouchImageView;)[F

    move-result-object v1

    aget v1, v1, v8

    .line 202
    iget-object v2, p0, Lkik/android/widget/TouchImageView$a;->a:Lkik/android/widget/TouchImageView;

    invoke-static {v2}, Lkik/android/widget/TouchImageView;->c(Lkik/android/widget/TouchImageView;)[F

    move-result-object v2

    aget v2, v2, v9

    .line 203
    cmpg-float v0, v0, v7

    if-gez v0, :cond_2

    .line 204
    iget-object v0, p0, Lkik/android/widget/TouchImageView$a;->a:Lkik/android/widget/TouchImageView;

    invoke-static {v0}, Lkik/android/widget/TouchImageView;->h(Lkik/android/widget/TouchImageView;)F

    move-result v0

    iget-object v3, p0, Lkik/android/widget/TouchImageView$a;->a:Lkik/android/widget/TouchImageView;

    invoke-static {v3}, Lkik/android/widget/TouchImageView;->i(Lkik/android/widget/TouchImageView;)F

    move-result v3

    mul-float/2addr v0, v3

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    int-to-float v0, v0

    iget-object v3, p0, Lkik/android/widget/TouchImageView$a;->a:Lkik/android/widget/TouchImageView;

    invoke-static {v3}, Lkik/android/widget/TouchImageView;->k(Lkik/android/widget/TouchImageView;)F

    move-result v3

    cmpg-float v0, v0, v3

    if-gez v0, :cond_5

    .line 205
    iget-object v0, p0, Lkik/android/widget/TouchImageView$a;->a:Lkik/android/widget/TouchImageView;

    invoke-static {v0}, Lkik/android/widget/TouchImageView;->l(Lkik/android/widget/TouchImageView;)F

    move-result v0

    neg-float v0, v0

    cmpg-float v0, v2, v0

    if-gez v0, :cond_4

    .line 206
    iget-object v0, p0, Lkik/android/widget/TouchImageView$a;->a:Lkik/android/widget/TouchImageView;

    invoke-static {v0}, Lkik/android/widget/TouchImageView;->d(Lkik/android/widget/TouchImageView;)Landroid/graphics/Matrix;

    move-result-object v0

    iget-object v1, p0, Lkik/android/widget/TouchImageView$a;->a:Lkik/android/widget/TouchImageView;

    invoke-static {v1}, Lkik/android/widget/TouchImageView;->l(Lkik/android/widget/TouchImageView;)F

    move-result v1

    add-float/2addr v1, v2

    neg-float v1, v1

    invoke-virtual {v0, v5, v1}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 244
    :cond_2
    :goto_1
    const/4 v0, 0x1

    return v0

    .line 191
    :cond_3
    iget-object v2, p0, Lkik/android/widget/TouchImageView$a;->a:Lkik/android/widget/TouchImageView;

    invoke-static {v2}, Lkik/android/widget/TouchImageView;->i(Lkik/android/widget/TouchImageView;)F

    move-result v2

    iget-object v3, p0, Lkik/android/widget/TouchImageView$a;->a:Lkik/android/widget/TouchImageView;

    invoke-static {v3}, Lkik/android/widget/TouchImageView;->p(Lkik/android/widget/TouchImageView;)F

    move-result v3

    cmpg-float v2, v2, v3

    if-gez v2, :cond_0

    .line 192
    iget-object v0, p0, Lkik/android/widget/TouchImageView$a;->a:Lkik/android/widget/TouchImageView;

    iget-object v2, p0, Lkik/android/widget/TouchImageView$a;->a:Lkik/android/widget/TouchImageView;

    invoke-static {v2}, Lkik/android/widget/TouchImageView;->p(Lkik/android/widget/TouchImageView;)F

    move-result v2

    invoke-static {v0, v2}, Lkik/android/widget/TouchImageView;->b(Lkik/android/widget/TouchImageView;F)F

    .line 193
    iget-object v0, p0, Lkik/android/widget/TouchImageView$a;->a:Lkik/android/widget/TouchImageView;

    invoke-static {v0}, Lkik/android/widget/TouchImageView;->p(Lkik/android/widget/TouchImageView;)F

    move-result v0

    div-float/2addr v0, v1

    goto/16 :goto_0

    .line 208
    :cond_4
    cmpl-float v0, v2, v5

    if-lez v0, :cond_2

    .line 209
    iget-object v0, p0, Lkik/android/widget/TouchImageView$a;->a:Lkik/android/widget/TouchImageView;

    invoke-static {v0}, Lkik/android/widget/TouchImageView;->d(Lkik/android/widget/TouchImageView;)Landroid/graphics/Matrix;

    move-result-object v0

    neg-float v1, v2

    invoke-virtual {v0, v5, v1}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    goto :goto_1

    .line 213
    :cond_5
    iget-object v0, p0, Lkik/android/widget/TouchImageView$a;->a:Lkik/android/widget/TouchImageView;

    invoke-static {v0}, Lkik/android/widget/TouchImageView;->n(Lkik/android/widget/TouchImageView;)F

    move-result v0

    neg-float v0, v0

    cmpg-float v0, v1, v0

    if-gez v0, :cond_6

    .line 214
    iget-object v0, p0, Lkik/android/widget/TouchImageView$a;->a:Lkik/android/widget/TouchImageView;

    invoke-static {v0}, Lkik/android/widget/TouchImageView;->d(Lkik/android/widget/TouchImageView;)Landroid/graphics/Matrix;

    move-result-object v0

    iget-object v2, p0, Lkik/android/widget/TouchImageView$a;->a:Lkik/android/widget/TouchImageView;

    invoke-static {v2}, Lkik/android/widget/TouchImageView;->n(Lkik/android/widget/TouchImageView;)F

    move-result v2

    add-float/2addr v1, v2

    neg-float v1, v1

    invoke-virtual {v0, v1, v5}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    goto :goto_1

    .line 216
    :cond_6
    cmpl-float v0, v1, v5

    if-lez v0, :cond_2

    .line 217
    iget-object v0, p0, Lkik/android/widget/TouchImageView$a;->a:Lkik/android/widget/TouchImageView;

    invoke-static {v0}, Lkik/android/widget/TouchImageView;->d(Lkik/android/widget/TouchImageView;)Landroid/graphics/Matrix;

    move-result-object v0

    neg-float v1, v1

    invoke-virtual {v0, v1, v5}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    goto :goto_1

    .line 224
    :cond_7
    iget-object v1, p0, Lkik/android/widget/TouchImageView$a;->a:Lkik/android/widget/TouchImageView;

    invoke-static {v1}, Lkik/android/widget/TouchImageView;->d(Lkik/android/widget/TouchImageView;)Landroid/graphics/Matrix;

    move-result-object v1

    invoke-virtual {p1}, Landroid/view/ScaleGestureDetector;->getFocusX()F

    move-result v2

    invoke-virtual {p1}, Landroid/view/ScaleGestureDetector;->getFocusY()F

    move-result v3

    invoke-virtual {v1, v0, v0, v2, v3}, Landroid/graphics/Matrix;->postScale(FFFF)Z

    .line 225
    iget-object v1, p0, Lkik/android/widget/TouchImageView$a;->a:Lkik/android/widget/TouchImageView;

    invoke-static {v1}, Lkik/android/widget/TouchImageView;->d(Lkik/android/widget/TouchImageView;)Landroid/graphics/Matrix;

    move-result-object v1

    iget-object v2, p0, Lkik/android/widget/TouchImageView$a;->a:Lkik/android/widget/TouchImageView;

    invoke-static {v2}, Lkik/android/widget/TouchImageView;->c(Lkik/android/widget/TouchImageView;)[F

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/graphics/Matrix;->getValues([F)V

    .line 226
    iget-object v1, p0, Lkik/android/widget/TouchImageView$a;->a:Lkik/android/widget/TouchImageView;

    invoke-static {v1}, Lkik/android/widget/TouchImageView;->c(Lkik/android/widget/TouchImageView;)[F

    move-result-object v1

    aget v1, v1, v8

    .line 227
    iget-object v2, p0, Lkik/android/widget/TouchImageView$a;->a:Lkik/android/widget/TouchImageView;

    invoke-static {v2}, Lkik/android/widget/TouchImageView;->c(Lkik/android/widget/TouchImageView;)[F

    move-result-object v2

    aget v2, v2, v9

    .line 228
    cmpg-float v0, v0, v7

    if-gez v0, :cond_2

    .line 229
    iget-object v0, p0, Lkik/android/widget/TouchImageView$a;->a:Lkik/android/widget/TouchImageView;

    invoke-static {v0}, Lkik/android/widget/TouchImageView;->n(Lkik/android/widget/TouchImageView;)F

    move-result v0

    neg-float v0, v0

    cmpg-float v0, v1, v0

    if-gez v0, :cond_9

    .line 230
    iget-object v0, p0, Lkik/android/widget/TouchImageView$a;->a:Lkik/android/widget/TouchImageView;

    invoke-static {v0}, Lkik/android/widget/TouchImageView;->d(Lkik/android/widget/TouchImageView;)Landroid/graphics/Matrix;

    move-result-object v0

    iget-object v3, p0, Lkik/android/widget/TouchImageView$a;->a:Lkik/android/widget/TouchImageView;

    invoke-static {v3}, Lkik/android/widget/TouchImageView;->n(Lkik/android/widget/TouchImageView;)F

    move-result v3

    add-float/2addr v1, v3

    neg-float v1, v1

    invoke-virtual {v0, v1, v5}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 236
    :cond_8
    :goto_2
    iget-object v0, p0, Lkik/android/widget/TouchImageView$a;->a:Lkik/android/widget/TouchImageView;

    invoke-static {v0}, Lkik/android/widget/TouchImageView;->l(Lkik/android/widget/TouchImageView;)F

    move-result v0

    neg-float v0, v0

    cmpg-float v0, v2, v0

    if-gez v0, :cond_a

    .line 237
    iget-object v0, p0, Lkik/android/widget/TouchImageView$a;->a:Lkik/android/widget/TouchImageView;

    invoke-static {v0}, Lkik/android/widget/TouchImageView;->d(Lkik/android/widget/TouchImageView;)Landroid/graphics/Matrix;

    move-result-object v0

    iget-object v1, p0, Lkik/android/widget/TouchImageView$a;->a:Lkik/android/widget/TouchImageView;

    invoke-static {v1}, Lkik/android/widget/TouchImageView;->l(Lkik/android/widget/TouchImageView;)F

    move-result v1

    add-float/2addr v1, v2

    neg-float v1, v1

    invoke-virtual {v0, v5, v1}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    goto/16 :goto_1

    .line 232
    :cond_9
    cmpl-float v0, v1, v5

    if-lez v0, :cond_8

    .line 233
    iget-object v0, p0, Lkik/android/widget/TouchImageView$a;->a:Lkik/android/widget/TouchImageView;

    invoke-static {v0}, Lkik/android/widget/TouchImageView;->d(Lkik/android/widget/TouchImageView;)Landroid/graphics/Matrix;

    move-result-object v0

    neg-float v1, v1

    invoke-virtual {v0, v1, v5}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    goto :goto_2

    .line 239
    :cond_a
    cmpl-float v0, v2, v5

    if-lez v0, :cond_2

    .line 240
    iget-object v0, p0, Lkik/android/widget/TouchImageView$a;->a:Lkik/android/widget/TouchImageView;

    invoke-static {v0}, Lkik/android/widget/TouchImageView;->d(Lkik/android/widget/TouchImageView;)Landroid/graphics/Matrix;

    move-result-object v0

    neg-float v1, v2

    invoke-virtual {v0, v5, v1}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    goto/16 :goto_1
.end method

.method public final onScaleBegin(Landroid/view/ScaleGestureDetector;)Z
    .locals 2

    .prologue
    .line 177
    iget-object v0, p0, Lkik/android/widget/TouchImageView$a;->a:Lkik/android/widget/TouchImageView;

    const/4 v1, 0x2

    invoke-static {v0, v1}, Lkik/android/widget/TouchImageView;->a(Lkik/android/widget/TouchImageView;I)I

    .line 178
    const/4 v0, 0x1

    return v0
.end method
