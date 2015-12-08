.class final Lcom/kik/cache/ContentImageView$a;
.super Landroid/view/ScaleGestureDetector$SimpleOnScaleGestureListener;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kik/cache/ContentImageView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lcom/kik/cache/ContentImageView;


# direct methods
.method private constructor <init>(Lcom/kik/cache/ContentImageView;)V
    .locals 0

    .prologue
    .line 270
    iput-object p1, p0, Lcom/kik/cache/ContentImageView$a;->a:Lcom/kik/cache/ContentImageView;

    invoke-direct {p0}, Landroid/view/ScaleGestureDetector$SimpleOnScaleGestureListener;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/kik/cache/ContentImageView;B)V
    .locals 0

    .prologue
    .line 270
    invoke-direct {p0, p1}, Lcom/kik/cache/ContentImageView$a;-><init>(Lcom/kik/cache/ContentImageView;)V

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

    .line 282
    invoke-virtual {p1}, Landroid/view/ScaleGestureDetector;->getScaleFactor()F

    move-result v0

    .line 283
    iget-object v1, p0, Lcom/kik/cache/ContentImageView$a;->a:Lcom/kik/cache/ContentImageView;

    invoke-static {v1}, Lcom/kik/cache/ContentImageView;->k(Lcom/kik/cache/ContentImageView;)F

    move-result v1

    .line 284
    iget-object v2, p0, Lcom/kik/cache/ContentImageView$a;->a:Lcom/kik/cache/ContentImageView;

    invoke-static {v2, v0}, Lcom/kik/cache/ContentImageView;->a(Lcom/kik/cache/ContentImageView;F)F

    .line 285
    iget-object v2, p0, Lcom/kik/cache/ContentImageView$a;->a:Lcom/kik/cache/ContentImageView;

    invoke-static {v2}, Lcom/kik/cache/ContentImageView;->k(Lcom/kik/cache/ContentImageView;)F

    move-result v2

    iget-object v3, p0, Lcom/kik/cache/ContentImageView$a;->a:Lcom/kik/cache/ContentImageView;

    invoke-static {v3}, Lcom/kik/cache/ContentImageView;->q(Lcom/kik/cache/ContentImageView;)F

    move-result v3

    cmpl-float v2, v2, v3

    if-lez v2, :cond_3

    .line 286
    iget-object v0, p0, Lcom/kik/cache/ContentImageView$a;->a:Lcom/kik/cache/ContentImageView;

    iget-object v2, p0, Lcom/kik/cache/ContentImageView$a;->a:Lcom/kik/cache/ContentImageView;

    invoke-static {v2}, Lcom/kik/cache/ContentImageView;->q(Lcom/kik/cache/ContentImageView;)F

    move-result v2

    invoke-static {v0, v2}, Lcom/kik/cache/ContentImageView;->b(Lcom/kik/cache/ContentImageView;F)F

    .line 287
    iget-object v0, p0, Lcom/kik/cache/ContentImageView$a;->a:Lcom/kik/cache/ContentImageView;

    invoke-static {v0}, Lcom/kik/cache/ContentImageView;->q(Lcom/kik/cache/ContentImageView;)F

    move-result v0

    div-float/2addr v0, v1

    .line 293
    :cond_0
    :goto_0
    iget-object v1, p0, Lcom/kik/cache/ContentImageView$a;->a:Lcom/kik/cache/ContentImageView;

    iget-object v2, p0, Lcom/kik/cache/ContentImageView$a;->a:Lcom/kik/cache/ContentImageView;

    invoke-static {v2}, Lcom/kik/cache/ContentImageView;->m(Lcom/kik/cache/ContentImageView;)F

    move-result v2

    iget-object v3, p0, Lcom/kik/cache/ContentImageView$a;->a:Lcom/kik/cache/ContentImageView;

    invoke-static {v3}, Lcom/kik/cache/ContentImageView;->k(Lcom/kik/cache/ContentImageView;)F

    move-result v3

    mul-float/2addr v2, v3

    iget-object v3, p0, Lcom/kik/cache/ContentImageView$a;->a:Lcom/kik/cache/ContentImageView;

    invoke-static {v3}, Lcom/kik/cache/ContentImageView;->m(Lcom/kik/cache/ContentImageView;)F

    move-result v3

    sub-float/2addr v2, v3

    iget-object v3, p0, Lcom/kik/cache/ContentImageView$a;->a:Lcom/kik/cache/ContentImageView;

    invoke-static {v3}, Lcom/kik/cache/ContentImageView;->s(Lcom/kik/cache/ContentImageView;)F

    move-result v3

    mul-float/2addr v3, v6

    iget-object v4, p0, Lcom/kik/cache/ContentImageView$a;->a:Lcom/kik/cache/ContentImageView;

    invoke-static {v4}, Lcom/kik/cache/ContentImageView;->k(Lcom/kik/cache/ContentImageView;)F

    move-result v4

    mul-float/2addr v3, v4

    sub-float/2addr v2, v3

    invoke-static {v1, v2}, Lcom/kik/cache/ContentImageView;->c(Lcom/kik/cache/ContentImageView;F)F

    .line 294
    iget-object v1, p0, Lcom/kik/cache/ContentImageView$a;->a:Lcom/kik/cache/ContentImageView;

    iget-object v2, p0, Lcom/kik/cache/ContentImageView$a;->a:Lcom/kik/cache/ContentImageView;

    invoke-static {v2}, Lcom/kik/cache/ContentImageView;->o(Lcom/kik/cache/ContentImageView;)F

    move-result v2

    iget-object v3, p0, Lcom/kik/cache/ContentImageView$a;->a:Lcom/kik/cache/ContentImageView;

    invoke-static {v3}, Lcom/kik/cache/ContentImageView;->k(Lcom/kik/cache/ContentImageView;)F

    move-result v3

    mul-float/2addr v2, v3

    iget-object v3, p0, Lcom/kik/cache/ContentImageView$a;->a:Lcom/kik/cache/ContentImageView;

    invoke-static {v3}, Lcom/kik/cache/ContentImageView;->o(Lcom/kik/cache/ContentImageView;)F

    move-result v3

    sub-float/2addr v2, v3

    iget-object v3, p0, Lcom/kik/cache/ContentImageView$a;->a:Lcom/kik/cache/ContentImageView;

    invoke-static {v3}, Lcom/kik/cache/ContentImageView;->t(Lcom/kik/cache/ContentImageView;)F

    move-result v3

    mul-float/2addr v3, v6

    iget-object v4, p0, Lcom/kik/cache/ContentImageView$a;->a:Lcom/kik/cache/ContentImageView;

    invoke-static {v4}, Lcom/kik/cache/ContentImageView;->k(Lcom/kik/cache/ContentImageView;)F

    move-result v4

    mul-float/2addr v3, v4

    sub-float/2addr v2, v3

    invoke-static {v1, v2}, Lcom/kik/cache/ContentImageView;->d(Lcom/kik/cache/ContentImageView;F)F

    .line 295
    iget-object v1, p0, Lcom/kik/cache/ContentImageView$a;->a:Lcom/kik/cache/ContentImageView;

    invoke-static {v1}, Lcom/kik/cache/ContentImageView;->j(Lcom/kik/cache/ContentImageView;)F

    move-result v1

    iget-object v2, p0, Lcom/kik/cache/ContentImageView$a;->a:Lcom/kik/cache/ContentImageView;

    invoke-static {v2}, Lcom/kik/cache/ContentImageView;->k(Lcom/kik/cache/ContentImageView;)F

    move-result v2

    mul-float/2addr v1, v2

    iget-object v2, p0, Lcom/kik/cache/ContentImageView$a;->a:Lcom/kik/cache/ContentImageView;

    invoke-static {v2}, Lcom/kik/cache/ContentImageView;->m(Lcom/kik/cache/ContentImageView;)F

    move-result v2

    cmpg-float v1, v1, v2

    if-lez v1, :cond_1

    iget-object v1, p0, Lcom/kik/cache/ContentImageView$a;->a:Lcom/kik/cache/ContentImageView;

    invoke-static {v1}, Lcom/kik/cache/ContentImageView;->l(Lcom/kik/cache/ContentImageView;)F

    move-result v1

    iget-object v2, p0, Lcom/kik/cache/ContentImageView$a;->a:Lcom/kik/cache/ContentImageView;

    invoke-static {v2}, Lcom/kik/cache/ContentImageView;->k(Lcom/kik/cache/ContentImageView;)F

    move-result v2

    mul-float/2addr v1, v2

    iget-object v2, p0, Lcom/kik/cache/ContentImageView$a;->a:Lcom/kik/cache/ContentImageView;

    invoke-static {v2}, Lcom/kik/cache/ContentImageView;->o(Lcom/kik/cache/ContentImageView;)F

    move-result v2

    cmpg-float v1, v1, v2

    if-gtz v1, :cond_7

    .line 296
    :cond_1
    iget-object v1, p0, Lcom/kik/cache/ContentImageView$a;->a:Lcom/kik/cache/ContentImageView;

    invoke-static {v1}, Lcom/kik/cache/ContentImageView;->f(Lcom/kik/cache/ContentImageView;)Landroid/graphics/Matrix;

    move-result-object v1

    iget-object v2, p0, Lcom/kik/cache/ContentImageView$a;->a:Lcom/kik/cache/ContentImageView;

    invoke-static {v2}, Lcom/kik/cache/ContentImageView;->m(Lcom/kik/cache/ContentImageView;)F

    move-result v2

    div-float/2addr v2, v6

    iget-object v3, p0, Lcom/kik/cache/ContentImageView$a;->a:Lcom/kik/cache/ContentImageView;

    invoke-static {v3}, Lcom/kik/cache/ContentImageView;->o(Lcom/kik/cache/ContentImageView;)F

    move-result v3

    div-float/2addr v3, v6

    invoke-virtual {v1, v0, v0, v2, v3}, Landroid/graphics/Matrix;->postScale(FFFF)Z

    .line 297
    cmpg-float v1, v0, v7

    if-gez v1, :cond_2

    .line 298
    iget-object v1, p0, Lcom/kik/cache/ContentImageView$a;->a:Lcom/kik/cache/ContentImageView;

    invoke-static {v1}, Lcom/kik/cache/ContentImageView;->f(Lcom/kik/cache/ContentImageView;)Landroid/graphics/Matrix;

    move-result-object v1

    iget-object v2, p0, Lcom/kik/cache/ContentImageView$a;->a:Lcom/kik/cache/ContentImageView;

    invoke-static {v2}, Lcom/kik/cache/ContentImageView;->e(Lcom/kik/cache/ContentImageView;)[F

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/graphics/Matrix;->getValues([F)V

    .line 299
    iget-object v1, p0, Lcom/kik/cache/ContentImageView$a;->a:Lcom/kik/cache/ContentImageView;

    invoke-static {v1}, Lcom/kik/cache/ContentImageView;->e(Lcom/kik/cache/ContentImageView;)[F

    move-result-object v1

    aget v1, v1, v8

    .line 300
    iget-object v2, p0, Lcom/kik/cache/ContentImageView$a;->a:Lcom/kik/cache/ContentImageView;

    invoke-static {v2}, Lcom/kik/cache/ContentImageView;->e(Lcom/kik/cache/ContentImageView;)[F

    move-result-object v2

    aget v2, v2, v9

    .line 301
    cmpg-float v0, v0, v7

    if-gez v0, :cond_2

    .line 302
    iget-object v0, p0, Lcom/kik/cache/ContentImageView$a;->a:Lcom/kik/cache/ContentImageView;

    invoke-static {v0}, Lcom/kik/cache/ContentImageView;->j(Lcom/kik/cache/ContentImageView;)F

    move-result v0

    iget-object v3, p0, Lcom/kik/cache/ContentImageView$a;->a:Lcom/kik/cache/ContentImageView;

    invoke-static {v3}, Lcom/kik/cache/ContentImageView;->k(Lcom/kik/cache/ContentImageView;)F

    move-result v3

    mul-float/2addr v0, v3

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    int-to-float v0, v0

    iget-object v3, p0, Lcom/kik/cache/ContentImageView$a;->a:Lcom/kik/cache/ContentImageView;

    invoke-static {v3}, Lcom/kik/cache/ContentImageView;->m(Lcom/kik/cache/ContentImageView;)F

    move-result v3

    cmpg-float v0, v0, v3

    if-gez v0, :cond_5

    .line 303
    iget-object v0, p0, Lcom/kik/cache/ContentImageView$a;->a:Lcom/kik/cache/ContentImageView;

    invoke-static {v0}, Lcom/kik/cache/ContentImageView;->n(Lcom/kik/cache/ContentImageView;)F

    move-result v0

    neg-float v0, v0

    cmpg-float v0, v2, v0

    if-gez v0, :cond_4

    .line 304
    iget-object v0, p0, Lcom/kik/cache/ContentImageView$a;->a:Lcom/kik/cache/ContentImageView;

    invoke-static {v0}, Lcom/kik/cache/ContentImageView;->f(Lcom/kik/cache/ContentImageView;)Landroid/graphics/Matrix;

    move-result-object v0

    iget-object v1, p0, Lcom/kik/cache/ContentImageView$a;->a:Lcom/kik/cache/ContentImageView;

    invoke-static {v1}, Lcom/kik/cache/ContentImageView;->n(Lcom/kik/cache/ContentImageView;)F

    move-result v1

    add-float/2addr v1, v2

    neg-float v1, v1

    invoke-virtual {v0, v5, v1}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 342
    :cond_2
    :goto_1
    const/4 v0, 0x1

    return v0

    .line 289
    :cond_3
    iget-object v2, p0, Lcom/kik/cache/ContentImageView$a;->a:Lcom/kik/cache/ContentImageView;

    invoke-static {v2}, Lcom/kik/cache/ContentImageView;->k(Lcom/kik/cache/ContentImageView;)F

    move-result v2

    iget-object v3, p0, Lcom/kik/cache/ContentImageView$a;->a:Lcom/kik/cache/ContentImageView;

    invoke-static {v3}, Lcom/kik/cache/ContentImageView;->r(Lcom/kik/cache/ContentImageView;)F

    move-result v3

    cmpg-float v2, v2, v3

    if-gez v2, :cond_0

    .line 290
    iget-object v0, p0, Lcom/kik/cache/ContentImageView$a;->a:Lcom/kik/cache/ContentImageView;

    iget-object v2, p0, Lcom/kik/cache/ContentImageView$a;->a:Lcom/kik/cache/ContentImageView;

    invoke-static {v2}, Lcom/kik/cache/ContentImageView;->r(Lcom/kik/cache/ContentImageView;)F

    move-result v2

    invoke-static {v0, v2}, Lcom/kik/cache/ContentImageView;->b(Lcom/kik/cache/ContentImageView;F)F

    .line 291
    iget-object v0, p0, Lcom/kik/cache/ContentImageView$a;->a:Lcom/kik/cache/ContentImageView;

    invoke-static {v0}, Lcom/kik/cache/ContentImageView;->r(Lcom/kik/cache/ContentImageView;)F

    move-result v0

    div-float/2addr v0, v1

    goto/16 :goto_0

    .line 306
    :cond_4
    cmpl-float v0, v2, v5

    if-lez v0, :cond_2

    .line 307
    iget-object v0, p0, Lcom/kik/cache/ContentImageView$a;->a:Lcom/kik/cache/ContentImageView;

    invoke-static {v0}, Lcom/kik/cache/ContentImageView;->f(Lcom/kik/cache/ContentImageView;)Landroid/graphics/Matrix;

    move-result-object v0

    neg-float v1, v2

    invoke-virtual {v0, v5, v1}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    goto :goto_1

    .line 311
    :cond_5
    iget-object v0, p0, Lcom/kik/cache/ContentImageView$a;->a:Lcom/kik/cache/ContentImageView;

    invoke-static {v0}, Lcom/kik/cache/ContentImageView;->p(Lcom/kik/cache/ContentImageView;)F

    move-result v0

    neg-float v0, v0

    cmpg-float v0, v1, v0

    if-gez v0, :cond_6

    .line 312
    iget-object v0, p0, Lcom/kik/cache/ContentImageView$a;->a:Lcom/kik/cache/ContentImageView;

    invoke-static {v0}, Lcom/kik/cache/ContentImageView;->f(Lcom/kik/cache/ContentImageView;)Landroid/graphics/Matrix;

    move-result-object v0

    iget-object v2, p0, Lcom/kik/cache/ContentImageView$a;->a:Lcom/kik/cache/ContentImageView;

    invoke-static {v2}, Lcom/kik/cache/ContentImageView;->p(Lcom/kik/cache/ContentImageView;)F

    move-result v2

    add-float/2addr v1, v2

    neg-float v1, v1

    invoke-virtual {v0, v1, v5}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    goto :goto_1

    .line 314
    :cond_6
    cmpl-float v0, v1, v5

    if-lez v0, :cond_2

    .line 315
    iget-object v0, p0, Lcom/kik/cache/ContentImageView$a;->a:Lcom/kik/cache/ContentImageView;

    invoke-static {v0}, Lcom/kik/cache/ContentImageView;->f(Lcom/kik/cache/ContentImageView;)Landroid/graphics/Matrix;

    move-result-object v0

    neg-float v1, v1

    invoke-virtual {v0, v1, v5}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    goto :goto_1

    .line 322
    :cond_7
    iget-object v1, p0, Lcom/kik/cache/ContentImageView$a;->a:Lcom/kik/cache/ContentImageView;

    invoke-static {v1}, Lcom/kik/cache/ContentImageView;->f(Lcom/kik/cache/ContentImageView;)Landroid/graphics/Matrix;

    move-result-object v1

    invoke-virtual {p1}, Landroid/view/ScaleGestureDetector;->getFocusX()F

    move-result v2

    invoke-virtual {p1}, Landroid/view/ScaleGestureDetector;->getFocusY()F

    move-result v3

    invoke-virtual {v1, v0, v0, v2, v3}, Landroid/graphics/Matrix;->postScale(FFFF)Z

    .line 323
    iget-object v1, p0, Lcom/kik/cache/ContentImageView$a;->a:Lcom/kik/cache/ContentImageView;

    invoke-static {v1}, Lcom/kik/cache/ContentImageView;->f(Lcom/kik/cache/ContentImageView;)Landroid/graphics/Matrix;

    move-result-object v1

    iget-object v2, p0, Lcom/kik/cache/ContentImageView$a;->a:Lcom/kik/cache/ContentImageView;

    invoke-static {v2}, Lcom/kik/cache/ContentImageView;->e(Lcom/kik/cache/ContentImageView;)[F

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/graphics/Matrix;->getValues([F)V

    .line 324
    iget-object v1, p0, Lcom/kik/cache/ContentImageView$a;->a:Lcom/kik/cache/ContentImageView;

    invoke-static {v1}, Lcom/kik/cache/ContentImageView;->e(Lcom/kik/cache/ContentImageView;)[F

    move-result-object v1

    aget v1, v1, v8

    .line 325
    iget-object v2, p0, Lcom/kik/cache/ContentImageView$a;->a:Lcom/kik/cache/ContentImageView;

    invoke-static {v2}, Lcom/kik/cache/ContentImageView;->e(Lcom/kik/cache/ContentImageView;)[F

    move-result-object v2

    aget v2, v2, v9

    .line 326
    cmpg-float v0, v0, v7

    if-gez v0, :cond_2

    .line 327
    iget-object v0, p0, Lcom/kik/cache/ContentImageView$a;->a:Lcom/kik/cache/ContentImageView;

    invoke-static {v0}, Lcom/kik/cache/ContentImageView;->p(Lcom/kik/cache/ContentImageView;)F

    move-result v0

    neg-float v0, v0

    cmpg-float v0, v1, v0

    if-gez v0, :cond_9

    .line 328
    iget-object v0, p0, Lcom/kik/cache/ContentImageView$a;->a:Lcom/kik/cache/ContentImageView;

    invoke-static {v0}, Lcom/kik/cache/ContentImageView;->f(Lcom/kik/cache/ContentImageView;)Landroid/graphics/Matrix;

    move-result-object v0

    iget-object v3, p0, Lcom/kik/cache/ContentImageView$a;->a:Lcom/kik/cache/ContentImageView;

    invoke-static {v3}, Lcom/kik/cache/ContentImageView;->p(Lcom/kik/cache/ContentImageView;)F

    move-result v3

    add-float/2addr v1, v3

    neg-float v1, v1

    invoke-virtual {v0, v1, v5}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 334
    :cond_8
    :goto_2
    iget-object v0, p0, Lcom/kik/cache/ContentImageView$a;->a:Lcom/kik/cache/ContentImageView;

    invoke-static {v0}, Lcom/kik/cache/ContentImageView;->n(Lcom/kik/cache/ContentImageView;)F

    move-result v0

    neg-float v0, v0

    cmpg-float v0, v2, v0

    if-gez v0, :cond_a

    .line 335
    iget-object v0, p0, Lcom/kik/cache/ContentImageView$a;->a:Lcom/kik/cache/ContentImageView;

    invoke-static {v0}, Lcom/kik/cache/ContentImageView;->f(Lcom/kik/cache/ContentImageView;)Landroid/graphics/Matrix;

    move-result-object v0

    iget-object v1, p0, Lcom/kik/cache/ContentImageView$a;->a:Lcom/kik/cache/ContentImageView;

    invoke-static {v1}, Lcom/kik/cache/ContentImageView;->n(Lcom/kik/cache/ContentImageView;)F

    move-result v1

    add-float/2addr v1, v2

    neg-float v1, v1

    invoke-virtual {v0, v5, v1}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    goto/16 :goto_1

    .line 330
    :cond_9
    cmpl-float v0, v1, v5

    if-lez v0, :cond_8

    .line 331
    iget-object v0, p0, Lcom/kik/cache/ContentImageView$a;->a:Lcom/kik/cache/ContentImageView;

    invoke-static {v0}, Lcom/kik/cache/ContentImageView;->f(Lcom/kik/cache/ContentImageView;)Landroid/graphics/Matrix;

    move-result-object v0

    neg-float v1, v1

    invoke-virtual {v0, v1, v5}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    goto :goto_2

    .line 337
    :cond_a
    cmpl-float v0, v2, v5

    if-lez v0, :cond_2

    .line 338
    iget-object v0, p0, Lcom/kik/cache/ContentImageView$a;->a:Lcom/kik/cache/ContentImageView;

    invoke-static {v0}, Lcom/kik/cache/ContentImageView;->f(Lcom/kik/cache/ContentImageView;)Landroid/graphics/Matrix;

    move-result-object v0

    neg-float v1, v2

    invoke-virtual {v0, v5, v1}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    goto/16 :goto_1
.end method

.method public final onScaleBegin(Landroid/view/ScaleGestureDetector;)Z
    .locals 2

    .prologue
    .line 275
    iget-object v0, p0, Lcom/kik/cache/ContentImageView$a;->a:Lcom/kik/cache/ContentImageView;

    const/4 v1, 0x2

    invoke-static {v0, v1}, Lcom/kik/cache/ContentImageView;->a(Lcom/kik/cache/ContentImageView;I)I

    .line 276
    const/4 v0, 0x1

    return v0
.end method
