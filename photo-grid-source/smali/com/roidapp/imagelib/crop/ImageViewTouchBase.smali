.class public abstract Lcom/roidapp/imagelib/crop/ImageViewTouchBase;
.super Landroid/widget/ImageView;
.source "SourceFile"


# instance fields
.field private final a:Landroid/graphics/Matrix;

.field private final b:[F

.field private c:Ljava/lang/Runnable;

.field protected f:Landroid/graphics/Matrix;

.field protected g:Landroid/graphics/Matrix;

.field protected final h:Lcom/roidapp/imagelib/crop/t;

.field i:I

.field j:I

.field k:F

.field protected l:I

.field protected m:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    const/4 v1, -0x1

    .line 234
    invoke-direct {p0, p1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 43
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Lcom/roidapp/imagelib/crop/ImageViewTouchBase;->f:Landroid/graphics/Matrix;

    .line 50
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Lcom/roidapp/imagelib/crop/ImageViewTouchBase;->g:Landroid/graphics/Matrix;

    .line 54
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Lcom/roidapp/imagelib/crop/ImageViewTouchBase;->a:Landroid/graphics/Matrix;

    .line 57
    const/16 v0, 0x9

    new-array v0, v0, [F

    iput-object v0, p0, Lcom/roidapp/imagelib/crop/ImageViewTouchBase;->b:[F

    .line 60
    new-instance v0, Lcom/roidapp/imagelib/crop/t;

    invoke-direct {v0, v2}, Lcom/roidapp/imagelib/crop/t;-><init>(Landroid/graphics/Bitmap;)V

    iput-object v0, p0, Lcom/roidapp/imagelib/crop/ImageViewTouchBase;->h:Lcom/roidapp/imagelib/crop/t;

    .line 62
    iput v1, p0, Lcom/roidapp/imagelib/crop/ImageViewTouchBase;->i:I

    iput v1, p0, Lcom/roidapp/imagelib/crop/ImageViewTouchBase;->j:I

    .line 80
    const/4 v0, 0x0

    iput v0, p0, Lcom/roidapp/imagelib/crop/ImageViewTouchBase;->l:I

    .line 121
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/roidapp/imagelib/crop/ImageViewTouchBase;->m:Landroid/os/Handler;

    .line 151
    iput-object v2, p0, Lcom/roidapp/imagelib/crop/ImageViewTouchBase;->c:Ljava/lang/Runnable;

    .line 3244
    sget-object v0, Landroid/widget/ImageView$ScaleType;->MATRIX:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {p0, v0}, Lcom/roidapp/imagelib/crop/ImageViewTouchBase;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 236
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    const/4 v1, -0x1

    .line 239
    invoke-direct {p0, p1, p2}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 43
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Lcom/roidapp/imagelib/crop/ImageViewTouchBase;->f:Landroid/graphics/Matrix;

    .line 50
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Lcom/roidapp/imagelib/crop/ImageViewTouchBase;->g:Landroid/graphics/Matrix;

    .line 54
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Lcom/roidapp/imagelib/crop/ImageViewTouchBase;->a:Landroid/graphics/Matrix;

    .line 57
    const/16 v0, 0x9

    new-array v0, v0, [F

    iput-object v0, p0, Lcom/roidapp/imagelib/crop/ImageViewTouchBase;->b:[F

    .line 60
    new-instance v0, Lcom/roidapp/imagelib/crop/t;

    invoke-direct {v0, v2}, Lcom/roidapp/imagelib/crop/t;-><init>(Landroid/graphics/Bitmap;)V

    iput-object v0, p0, Lcom/roidapp/imagelib/crop/ImageViewTouchBase;->h:Lcom/roidapp/imagelib/crop/t;

    .line 62
    iput v1, p0, Lcom/roidapp/imagelib/crop/ImageViewTouchBase;->i:I

    iput v1, p0, Lcom/roidapp/imagelib/crop/ImageViewTouchBase;->j:I

    .line 80
    const/4 v0, 0x0

    iput v0, p0, Lcom/roidapp/imagelib/crop/ImageViewTouchBase;->l:I

    .line 121
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/roidapp/imagelib/crop/ImageViewTouchBase;->m:Landroid/os/Handler;

    .line 151
    iput-object v2, p0, Lcom/roidapp/imagelib/crop/ImageViewTouchBase;->c:Ljava/lang/Runnable;

    .line 4244
    sget-object v0, Landroid/widget/ImageView$ScaleType;->MATRIX:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {p0, v0}, Lcom/roidapp/imagelib/crop/ImageViewTouchBase;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 241
    return-void
.end method

.method private a(Landroid/graphics/Bitmap;I)V
    .locals 2

    .prologue
    .line 132
    invoke-super {p0, p1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 133
    invoke-virtual {p0}, Lcom/roidapp/imagelib/crop/ImageViewTouchBase;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 134
    if-eqz v0, :cond_0

    .line 135
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setDither(Z)V

    .line 139
    :cond_0
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/ImageViewTouchBase;->h:Lcom/roidapp/imagelib/crop/t;

    invoke-virtual {v0, p1}, Lcom/roidapp/imagelib/crop/t;->a(Landroid/graphics/Bitmap;)V

    .line 140
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/ImageViewTouchBase;->h:Lcom/roidapp/imagelib/crop/t;

    invoke-virtual {v0, p2}, Lcom/roidapp/imagelib/crop/t;->a(I)V

    .line 145
    return-void
.end method

.method private a(Lcom/roidapp/imagelib/crop/t;Landroid/graphics/Matrix;)V
    .locals 7

    .prologue
    const/high16 v6, 0x40000000    # 2.0f

    .line 263
    invoke-virtual {p0}, Lcom/roidapp/imagelib/crop/ImageViewTouchBase;->getWidth()I

    move-result v0

    int-to-float v0, v0

    .line 264
    invoke-virtual {p0}, Lcom/roidapp/imagelib/crop/ImageViewTouchBase;->getHeight()I

    move-result v1

    int-to-float v1, v1

    .line 266
    invoke-virtual {p1}, Lcom/roidapp/imagelib/crop/t;->e()I

    move-result v2

    int-to-float v2, v2

    .line 267
    invoke-virtual {p1}, Lcom/roidapp/imagelib/crop/t;->d()I

    move-result v3

    int-to-float v3, v3

    .line 268
    invoke-virtual {p2}, Landroid/graphics/Matrix;->reset()V

    .line 272
    div-float v4, v0, v2

    invoke-static {v4, v6}, Ljava/lang/Math;->min(FF)F

    move-result v4

    .line 273
    div-float v5, v1, v3

    invoke-static {v5, v6}, Ljava/lang/Math;->min(FF)F

    move-result v5

    .line 274
    invoke-static {v4, v5}, Ljava/lang/Math;->min(FF)F

    move-result v4

    .line 276
    invoke-virtual {p1}, Lcom/roidapp/imagelib/crop/t;->c()Landroid/graphics/Matrix;

    move-result-object v5

    invoke-virtual {p2, v5}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 277
    invoke-virtual {p2, v4, v4}, Landroid/graphics/Matrix;->postScale(FF)Z

    .line 279
    mul-float/2addr v2, v4

    sub-float/2addr v0, v2

    div-float/2addr v0, v6

    mul-float v2, v3, v4

    sub-float/2addr v1, v2

    div-float/2addr v1, v6

    invoke-virtual {p2, v0, v1}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 280
    return-void
.end method

.method private c()Landroid/graphics/Matrix;
    .locals 2

    .prologue
    .line 286
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/ImageViewTouchBase;->a:Landroid/graphics/Matrix;

    iget-object v1, p0, Lcom/roidapp/imagelib/crop/ImageViewTouchBase;->f:Landroid/graphics/Matrix;

    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 287
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/ImageViewTouchBase;->a:Landroid/graphics/Matrix;

    iget-object v1, p0, Lcom/roidapp/imagelib/crop/ImageViewTouchBase;->g:Landroid/graphics/Matrix;

    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 288
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/ImageViewTouchBase;->a:Landroid/graphics/Matrix;

    return-object v0
.end method


# virtual methods
.method public final a()V
    .locals 7

    .prologue
    const/high16 v6, 0x40000000    # 2.0f

    const/4 v1, 0x0

    .line 192
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/ImageViewTouchBase;->h:Lcom/roidapp/imagelib/crop/t;

    invoke-virtual {v0}, Lcom/roidapp/imagelib/crop/t;->b()Landroid/graphics/Bitmap;

    move-result-object v0

    if-nez v0, :cond_0

    .line 231
    :goto_0
    return-void

    .line 196
    :cond_0
    invoke-direct {p0}, Lcom/roidapp/imagelib/crop/ImageViewTouchBase;->c()Landroid/graphics/Matrix;

    move-result-object v0

    .line 198
    new-instance v2, Landroid/graphics/RectF;

    iget-object v3, p0, Lcom/roidapp/imagelib/crop/ImageViewTouchBase;->h:Lcom/roidapp/imagelib/crop/t;

    invoke-virtual {v3}, Lcom/roidapp/imagelib/crop/t;->b()Landroid/graphics/Bitmap;

    move-result-object v3

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    int-to-float v3, v3

    iget-object v4, p0, Lcom/roidapp/imagelib/crop/ImageViewTouchBase;->h:Lcom/roidapp/imagelib/crop/t;

    invoke-virtual {v4}, Lcom/roidapp/imagelib/crop/t;->b()Landroid/graphics/Bitmap;

    move-result-object v4

    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v4

    int-to-float v4, v4

    invoke-direct {v2, v1, v1, v3, v4}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 200
    invoke-virtual {v0, v2}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    .line 202
    invoke-virtual {v2}, Landroid/graphics/RectF;->height()F

    move-result v0

    .line 203
    invoke-virtual {v2}, Landroid/graphics/RectF;->width()F

    move-result v3

    .line 208
    invoke-virtual {p0}, Lcom/roidapp/imagelib/crop/ImageViewTouchBase;->getHeight()I

    move-result v4

    .line 209
    int-to-float v5, v4

    cmpg-float v5, v0, v5

    if-gez v5, :cond_2

    .line 210
    int-to-float v4, v4

    sub-float v0, v4, v0

    div-float/2addr v0, v6

    iget v4, v2, Landroid/graphics/RectF;->top:F

    sub-float/2addr v0, v4

    .line 219
    :goto_1
    invoke-virtual {p0}, Lcom/roidapp/imagelib/crop/ImageViewTouchBase;->getWidth()I

    move-result v4

    .line 220
    int-to-float v5, v4

    cmpg-float v5, v3, v5

    if-gez v5, :cond_4

    .line 221
    int-to-float v1, v4

    sub-float/2addr v1, v3

    div-float/2addr v1, v6

    iget v2, v2, Landroid/graphics/RectF;->left:F

    sub-float/2addr v1, v2

    .line 229
    :cond_1
    :goto_2
    invoke-virtual {p0, v1, v0}, Lcom/roidapp/imagelib/crop/ImageViewTouchBase;->a(FF)V

    .line 230
    invoke-direct {p0}, Lcom/roidapp/imagelib/crop/ImageViewTouchBase;->c()Landroid/graphics/Matrix;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/roidapp/imagelib/crop/ImageViewTouchBase;->setImageMatrix(Landroid/graphics/Matrix;)V

    goto :goto_0

    .line 211
    :cond_2
    iget v0, v2, Landroid/graphics/RectF;->top:F

    cmpl-float v0, v0, v1

    if-lez v0, :cond_3

    .line 212
    iget v0, v2, Landroid/graphics/RectF;->top:F

    neg-float v0, v0

    goto :goto_1

    .line 213
    :cond_3
    iget v0, v2, Landroid/graphics/RectF;->bottom:F

    int-to-float v4, v4

    cmpg-float v0, v0, v4

    if-gez v0, :cond_6

    .line 214
    invoke-virtual {p0}, Lcom/roidapp/imagelib/crop/ImageViewTouchBase;->getHeight()I

    move-result v0

    int-to-float v0, v0

    iget v4, v2, Landroid/graphics/RectF;->bottom:F

    sub-float/2addr v0, v4

    goto :goto_1

    .line 222
    :cond_4
    iget v3, v2, Landroid/graphics/RectF;->left:F

    cmpl-float v3, v3, v1

    if-lez v3, :cond_5

    .line 223
    iget v1, v2, Landroid/graphics/RectF;->left:F

    neg-float v1, v1

    goto :goto_2

    .line 224
    :cond_5
    iget v3, v2, Landroid/graphics/RectF;->right:F

    int-to-float v5, v4

    cmpg-float v3, v3, v5

    if-gez v3, :cond_1

    .line 225
    int-to-float v1, v4

    iget v2, v2, Landroid/graphics/RectF;->right:F

    sub-float/2addr v1, v2

    goto :goto_2

    :cond_6
    move v0, v1

    goto :goto_1
.end method

.method protected a(FF)V
    .locals 1

    .prologue
    .line 397
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/ImageViewTouchBase;->g:Landroid/graphics/Matrix;

    invoke-virtual {v0, p1, p2}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 398
    return-void
.end method

.method protected a(FFFFF)V
    .locals 2

    .prologue
    .line 309
    iget v0, p0, Lcom/roidapp/imagelib/crop/ImageViewTouchBase;->k:F

    cmpl-float v0, p1, v0

    if-lez v0, :cond_0

    .line 310
    iget p1, p0, Lcom/roidapp/imagelib/crop/ImageViewTouchBase;->k:F

    .line 313
    :cond_0
    invoke-virtual {p0}, Lcom/roidapp/imagelib/crop/ImageViewTouchBase;->b()F

    move-result v0

    .line 314
    div-float v0, p1, v0

    .line 316
    iget-object v1, p0, Lcom/roidapp/imagelib/crop/ImageViewTouchBase;->g:Landroid/graphics/Matrix;

    invoke-virtual {v1, v0, v0, p2, p3}, Landroid/graphics/Matrix;->postScale(FFFF)Z

    .line 317
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/ImageViewTouchBase;->g:Landroid/graphics/Matrix;

    invoke-virtual {v0, p4, p5}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 318
    invoke-direct {p0}, Lcom/roidapp/imagelib/crop/ImageViewTouchBase;->c()Landroid/graphics/Matrix;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/roidapp/imagelib/crop/ImageViewTouchBase;->setImageMatrix(Landroid/graphics/Matrix;)V

    .line 319
    invoke-virtual {p0}, Lcom/roidapp/imagelib/crop/ImageViewTouchBase;->a()V

    .line 320
    return-void
.end method

.method protected final a(FFFLandroid/graphics/Point;)V
    .locals 11

    .prologue
    const/high16 v1, 0x43960000    # 300.0f

    .line 323
    invoke-virtual {p0}, Lcom/roidapp/imagelib/crop/ImageViewTouchBase;->b()F

    move-result v0

    sub-float v0, p1, v0

    div-float v5, v0, v1

    .line 324
    iget v0, p4, Landroid/graphics/Point;->x:I

    int-to-float v0, v0

    div-float v6, v0, v1

    .line 325
    iget v0, p4, Landroid/graphics/Point;->y:I

    int-to-float v0, v0

    div-float v7, v0, v1

    .line 326
    invoke-virtual {p0}, Lcom/roidapp/imagelib/crop/ImageViewTouchBase;->b()F

    move-result v4

    .line 327
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    .line 329
    iget-object v10, p0, Lcom/roidapp/imagelib/crop/ImageViewTouchBase;->m:Landroid/os/Handler;

    new-instance v0, Lcom/roidapp/imagelib/crop/s;

    move-object v1, p0

    move v8, p2

    move v9, p3

    invoke-direct/range {v0 .. v9}, Lcom/roidapp/imagelib/crop/s;-><init>(Lcom/roidapp/imagelib/crop/ImageViewTouchBase;JFFFFFF)V

    invoke-virtual {v10, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 343
    return-void
.end method

.method public final a(Landroid/graphics/Bitmap;)V
    .locals 2

    .prologue
    .line 156
    new-instance v0, Lcom/roidapp/imagelib/crop/t;

    invoke-direct {v0, p1}, Lcom/roidapp/imagelib/crop/t;-><init>(Landroid/graphics/Bitmap;)V

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Lcom/roidapp/imagelib/crop/ImageViewTouchBase;->a(Lcom/roidapp/imagelib/crop/t;Z)V

    .line 157
    return-void
.end method

.method public final a(Lcom/roidapp/imagelib/crop/t;Z)V
    .locals 4

    .prologue
    const/high16 v0, 0x3f800000    # 1.0f

    .line 160
    invoke-virtual {p0}, Lcom/roidapp/imagelib/crop/ImageViewTouchBase;->getWidth()I

    move-result v1

    .line 162
    if-gtz v1, :cond_0

    .line 163
    new-instance v0, Lcom/roidapp/imagelib/crop/r;

    invoke-direct {v0, p0, p1, p2}, Lcom/roidapp/imagelib/crop/r;-><init>(Lcom/roidapp/imagelib/crop/ImageViewTouchBase;Lcom/roidapp/imagelib/crop/t;Z)V

    iput-object v0, p0, Lcom/roidapp/imagelib/crop/ImageViewTouchBase;->c:Ljava/lang/Runnable;

    .line 184
    :goto_0
    return-void

    .line 171
    :cond_0
    invoke-virtual {p1}, Lcom/roidapp/imagelib/crop/t;->b()Landroid/graphics/Bitmap;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 172
    iget-object v1, p0, Lcom/roidapp/imagelib/crop/ImageViewTouchBase;->f:Landroid/graphics/Matrix;

    invoke-direct {p0, p1, v1}, Lcom/roidapp/imagelib/crop/ImageViewTouchBase;->a(Lcom/roidapp/imagelib/crop/t;Landroid/graphics/Matrix;)V

    .line 173
    invoke-virtual {p1}, Lcom/roidapp/imagelib/crop/t;->b()Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {p1}, Lcom/roidapp/imagelib/crop/t;->a()I

    move-result v2

    invoke-direct {p0, v1, v2}, Lcom/roidapp/imagelib/crop/ImageViewTouchBase;->a(Landroid/graphics/Bitmap;I)V

    .line 179
    :goto_1
    if-eqz p2, :cond_1

    .line 180
    iget-object v1, p0, Lcom/roidapp/imagelib/crop/ImageViewTouchBase;->g:Landroid/graphics/Matrix;

    invoke-virtual {v1}, Landroid/graphics/Matrix;->reset()V

    .line 182
    :cond_1
    invoke-direct {p0}, Lcom/roidapp/imagelib/crop/ImageViewTouchBase;->c()Landroid/graphics/Matrix;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/roidapp/imagelib/crop/ImageViewTouchBase;->setImageMatrix(Landroid/graphics/Matrix;)V

    .line 2298
    iget-object v1, p0, Lcom/roidapp/imagelib/crop/ImageViewTouchBase;->h:Lcom/roidapp/imagelib/crop/t;

    invoke-virtual {v1}, Lcom/roidapp/imagelib/crop/t;->b()Landroid/graphics/Bitmap;

    move-result-object v1

    if-nez v1, :cond_3

    .line 183
    :goto_2
    iput v0, p0, Lcom/roidapp/imagelib/crop/ImageViewTouchBase;->k:F

    goto :goto_0

    .line 175
    :cond_2
    iget-object v1, p0, Lcom/roidapp/imagelib/crop/ImageViewTouchBase;->f:Landroid/graphics/Matrix;

    invoke-virtual {v1}, Landroid/graphics/Matrix;->reset()V

    .line 176
    const/4 v1, 0x0

    invoke-virtual {p0, v1}, Lcom/roidapp/imagelib/crop/ImageViewTouchBase;->setImageBitmap(Landroid/graphics/Bitmap;)V

    goto :goto_1

    .line 2302
    :cond_3
    iget-object v1, p0, Lcom/roidapp/imagelib/crop/ImageViewTouchBase;->h:Lcom/roidapp/imagelib/crop/t;

    invoke-virtual {v1}, Lcom/roidapp/imagelib/crop/t;->e()I

    move-result v1

    int-to-float v1, v1

    iget v2, p0, Lcom/roidapp/imagelib/crop/ImageViewTouchBase;->i:I

    int-to-float v2, v2

    div-float/2addr v1, v2

    .line 2303
    iget-object v2, p0, Lcom/roidapp/imagelib/crop/ImageViewTouchBase;->h:Lcom/roidapp/imagelib/crop/t;

    invoke-virtual {v2}, Lcom/roidapp/imagelib/crop/t;->d()I

    move-result v2

    int-to-float v2, v2

    iget v3, p0, Lcom/roidapp/imagelib/crop/ImageViewTouchBase;->j:I

    int-to-float v3, v3

    div-float/2addr v2, v3

    .line 2304
    invoke-static {v1, v2}, Ljava/lang/Math;->max(FF)F

    move-result v1

    const/high16 v2, 0x40800000    # 4.0f

    mul-float/2addr v1, v2

    .line 2305
    invoke-static {v1, v0}, Ljava/lang/Math;->max(FF)F

    move-result v0

    goto :goto_2
.end method

.method public final b()F
    .locals 2

    .prologue
    .line 258
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/ImageViewTouchBase;->g:Landroid/graphics/Matrix;

    .line 5248
    iget-object v1, p0, Lcom/roidapp/imagelib/crop/ImageViewTouchBase;->b:[F

    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->getValues([F)V

    .line 5249
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/ImageViewTouchBase;->b:[F

    const/4 v1, 0x0

    aget v0, v0, v1

    .line 258
    return v0
.end method

.method protected final b(FF)V
    .locals 1

    .prologue
    .line 401
    invoke-virtual {p0, p1, p2}, Lcom/roidapp/imagelib/crop/ImageViewTouchBase;->a(FF)V

    .line 402
    invoke-direct {p0}, Lcom/roidapp/imagelib/crop/ImageViewTouchBase;->c()Landroid/graphics/Matrix;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/roidapp/imagelib/crop/ImageViewTouchBase;->setImageMatrix(Landroid/graphics/Matrix;)V

    .line 403
    return-void
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 6

    .prologue
    const/high16 v3, 0x40000000    # 2.0f

    const/high16 v1, 0x3f800000    # 1.0f

    const/4 v4, 0x0

    .line 112
    const/4 v0, 0x4

    if-ne p1, v0, :cond_0

    invoke-virtual {p0}, Lcom/roidapp/imagelib/crop/ImageViewTouchBase;->b()F

    move-result v0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_0

    .line 1346
    invoke-virtual {p0}, Lcom/roidapp/imagelib/crop/ImageViewTouchBase;->getWidth()I

    move-result v0

    int-to-float v0, v0

    div-float v2, v0, v3

    .line 1347
    invoke-virtual {p0}, Lcom/roidapp/imagelib/crop/ImageViewTouchBase;->getHeight()I

    move-result v0

    int-to-float v0, v0

    div-float v3, v0, v3

    move-object v0, p0

    move v5, v4

    .line 1349
    invoke-virtual/range {v0 .. v5}, Lcom/roidapp/imagelib/crop/ImageViewTouchBase;->a(FFFFF)V

    .line 116
    const/4 v0, 0x1

    .line 118
    :goto_0
    return v0

    :cond_0
    invoke-super {p0, p1, p2}, Landroid/widget/ImageView;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result v0

    goto :goto_0
.end method

.method protected onLayout(ZIIII)V
    .locals 2

    .prologue
    .line 96
    invoke-super/range {p0 .. p5}, Landroid/widget/ImageView;->onLayout(ZIIII)V

    .line 97
    sub-int v0, p4, p2

    iput v0, p0, Lcom/roidapp/imagelib/crop/ImageViewTouchBase;->i:I

    .line 98
    sub-int v0, p5, p3

    iput v0, p0, Lcom/roidapp/imagelib/crop/ImageViewTouchBase;->j:I

    .line 99
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/ImageViewTouchBase;->c:Ljava/lang/Runnable;

    .line 100
    if-eqz v0, :cond_0

    .line 101
    const/4 v1, 0x0

    iput-object v1, p0, Lcom/roidapp/imagelib/crop/ImageViewTouchBase;->c:Ljava/lang/Runnable;

    .line 102
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    .line 104
    :cond_0
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/ImageViewTouchBase;->h:Lcom/roidapp/imagelib/crop/t;

    invoke-virtual {v0}, Lcom/roidapp/imagelib/crop/t;->b()Landroid/graphics/Bitmap;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 105
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/ImageViewTouchBase;->h:Lcom/roidapp/imagelib/crop/t;

    iget-object v1, p0, Lcom/roidapp/imagelib/crop/ImageViewTouchBase;->f:Landroid/graphics/Matrix;

    invoke-direct {p0, v0, v1}, Lcom/roidapp/imagelib/crop/ImageViewTouchBase;->a(Lcom/roidapp/imagelib/crop/t;Landroid/graphics/Matrix;)V

    .line 106
    invoke-direct {p0}, Lcom/roidapp/imagelib/crop/ImageViewTouchBase;->c()Landroid/graphics/Matrix;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/roidapp/imagelib/crop/ImageViewTouchBase;->setImageMatrix(Landroid/graphics/Matrix;)V

    .line 108
    :cond_1
    return-void
.end method

.method public setImageBitmap(Landroid/graphics/Bitmap;)V
    .locals 1

    .prologue
    .line 128
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/roidapp/imagelib/crop/ImageViewTouchBase;->a(Landroid/graphics/Bitmap;I)V

    .line 129
    return-void
.end method
