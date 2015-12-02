.class abstract Lcom/facebook/orca/camera/s;
.super Landroid/widget/ImageView;
.source "ImageViewTouchBase.java"


# static fields
.field private static final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# instance fields
.field private final b:Landroid/graphics/Matrix;

.field private final c:[F

.field private d:Lcom/facebook/orca/camera/v;

.field private e:Ljava/lang/Runnable;

.field protected f:Landroid/graphics/Matrix;

.field protected g:Landroid/graphics/Matrix;

.field protected final h:Lcom/facebook/widget/images/e;

.field i:I

.field j:I

.field k:F

.field protected l:Landroid/os/Handler;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 36
    const-class v0, Lcom/facebook/orca/camera/s;

    sput-object v0, Lcom/facebook/orca/camera/s;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    const/4 v1, -0x1

    .line 238
    invoke-direct {p0, p1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 45
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Lcom/facebook/orca/camera/s;->f:Landroid/graphics/Matrix;

    .line 52
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Lcom/facebook/orca/camera/s;->g:Landroid/graphics/Matrix;

    .line 56
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Lcom/facebook/orca/camera/s;->b:Landroid/graphics/Matrix;

    .line 59
    const/16 v0, 0x9

    new-array v0, v0, [F

    iput-object v0, p0, Lcom/facebook/orca/camera/s;->c:[F

    .line 62
    new-instance v0, Lcom/facebook/widget/images/e;

    invoke-direct {v0, v2}, Lcom/facebook/widget/images/e;-><init>(Landroid/graphics/Bitmap;)V

    iput-object v0, p0, Lcom/facebook/orca/camera/s;->h:Lcom/facebook/widget/images/e;

    .line 64
    iput v1, p0, Lcom/facebook/orca/camera/s;->i:I

    iput v1, p0, Lcom/facebook/orca/camera/s;->j:I

    .line 121
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/facebook/orca/camera/s;->l:Landroid/os/Handler;

    .line 151
    iput-object v2, p0, Lcom/facebook/orca/camera/s;->e:Ljava/lang/Runnable;

    .line 239
    invoke-direct {p0}, Lcom/facebook/orca/camera/s;->e()V

    .line 240
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    const/4 v1, -0x1

    .line 243
    invoke-direct {p0, p1, p2}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 45
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Lcom/facebook/orca/camera/s;->f:Landroid/graphics/Matrix;

    .line 52
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Lcom/facebook/orca/camera/s;->g:Landroid/graphics/Matrix;

    .line 56
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Lcom/facebook/orca/camera/s;->b:Landroid/graphics/Matrix;

    .line 59
    const/16 v0, 0x9

    new-array v0, v0, [F

    iput-object v0, p0, Lcom/facebook/orca/camera/s;->c:[F

    .line 62
    new-instance v0, Lcom/facebook/widget/images/e;

    invoke-direct {v0, v2}, Lcom/facebook/widget/images/e;-><init>(Landroid/graphics/Bitmap;)V

    iput-object v0, p0, Lcom/facebook/orca/camera/s;->h:Lcom/facebook/widget/images/e;

    .line 64
    iput v1, p0, Lcom/facebook/orca/camera/s;->i:I

    iput v1, p0, Lcom/facebook/orca/camera/s;->j:I

    .line 121
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/facebook/orca/camera/s;->l:Landroid/os/Handler;

    .line 151
    iput-object v2, p0, Lcom/facebook/orca/camera/s;->e:Ljava/lang/Runnable;

    .line 244
    invoke-direct {p0}, Lcom/facebook/orca/camera/s;->e()V

    .line 245
    return-void
.end method

.method private a(Landroid/graphics/Bitmap;I)V
    .locals 2

    .prologue
    .line 132
    invoke-super {p0, p1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 133
    invoke-virtual {p0}, Lcom/facebook/orca/camera/s;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 134
    if-eqz v0, :cond_0

    .line 135
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setDither(Z)V

    .line 138
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/camera/s;->h:Lcom/facebook/widget/images/e;

    invoke-virtual {v0}, Lcom/facebook/widget/images/e;->b()Landroid/graphics/Bitmap;

    move-result-object v0

    .line 139
    iget-object v1, p0, Lcom/facebook/orca/camera/s;->h:Lcom/facebook/widget/images/e;

    invoke-virtual {v1, p1}, Lcom/facebook/widget/images/e;->a(Landroid/graphics/Bitmap;)V

    .line 140
    iget-object v1, p0, Lcom/facebook/orca/camera/s;->h:Lcom/facebook/widget/images/e;

    invoke-virtual {v1, p2}, Lcom/facebook/widget/images/e;->a(I)V

    .line 142
    if-eqz v0, :cond_1

    if-eq v0, p1, :cond_1

    iget-object v1, p0, Lcom/facebook/orca/camera/s;->d:Lcom/facebook/orca/camera/v;

    if-eqz v1, :cond_1

    .line 143
    iget-object v1, p0, Lcom/facebook/orca/camera/s;->d:Lcom/facebook/orca/camera/v;

    invoke-interface {v1, v0}, Lcom/facebook/orca/camera/v;->a(Landroid/graphics/Bitmap;)V

    .line 145
    :cond_1
    return-void
.end method

.method private a(Lcom/facebook/widget/images/e;Landroid/graphics/Matrix;)V
    .locals 8

    .prologue
    const/high16 v7, 0x40400000    # 3.0f

    const/high16 v6, 0x40000000    # 2.0f

    .line 267
    invoke-virtual {p0}, Lcom/facebook/orca/camera/s;->getWidth()I

    move-result v0

    int-to-float v0, v0

    .line 268
    invoke-virtual {p0}, Lcom/facebook/orca/camera/s;->getHeight()I

    move-result v1

    int-to-float v1, v1

    .line 270
    invoke-virtual {p1}, Lcom/facebook/widget/images/e;->f()I

    move-result v2

    int-to-float v2, v2

    .line 271
    invoke-virtual {p1}, Lcom/facebook/widget/images/e;->e()I

    move-result v3

    int-to-float v3, v3

    .line 272
    invoke-virtual {p2}, Landroid/graphics/Matrix;->reset()V

    .line 276
    div-float v4, v0, v2

    invoke-static {v4, v7}, Ljava/lang/Math;->min(FF)F

    move-result v4

    .line 277
    div-float v5, v1, v3

    invoke-static {v5, v7}, Ljava/lang/Math;->min(FF)F

    move-result v5

    .line 278
    invoke-static {v4, v5}, Ljava/lang/Math;->min(FF)F

    move-result v4

    .line 280
    invoke-virtual {p1}, Lcom/facebook/widget/images/e;->c()Landroid/graphics/Matrix;

    move-result-object v5

    invoke-virtual {p2, v5}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 281
    invoke-virtual {p2, v4, v4}, Landroid/graphics/Matrix;->postScale(FF)Z

    .line 283
    mul-float/2addr v2, v4

    sub-float/2addr v0, v2

    div-float/2addr v0, v6

    mul-float v2, v3, v4

    sub-float/2addr v1, v2

    div-float/2addr v1, v6

    invoke-virtual {p2, v0, v1}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 286
    return-void
.end method

.method private e()V
    .locals 1

    .prologue
    .line 248
    sget-object v0, Landroid/widget/ImageView$ScaleType;->MATRIX:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/camera/s;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 249
    return-void
.end method


# virtual methods
.method protected a(Landroid/graphics/Matrix;)F
    .locals 1

    .prologue
    .line 258
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/facebook/orca/camera/s;->a(Landroid/graphics/Matrix;I)F

    move-result v0

    return v0
.end method

.method protected a(Landroid/graphics/Matrix;I)F
    .locals 1

    .prologue
    .line 252
    iget-object v0, p0, Lcom/facebook/orca/camera/s;->c:[F

    invoke-virtual {p1, v0}, Landroid/graphics/Matrix;->getValues([F)V

    .line 253
    iget-object v0, p0, Lcom/facebook/orca/camera/s;->c:[F

    aget v0, v0, p2

    return v0
.end method

.method public a()V
    .locals 2

    .prologue
    .line 148
    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Lcom/facebook/orca/camera/s;->a(Landroid/graphics/Bitmap;Z)V

    .line 149
    return-void
.end method

.method protected a(F)V
    .locals 3

    .prologue
    const/high16 v2, 0x40000000    # 2.0f

    .line 348
    invoke-virtual {p0}, Lcom/facebook/orca/camera/s;->getWidth()I

    move-result v0

    int-to-float v0, v0

    div-float/2addr v0, v2

    .line 349
    invoke-virtual {p0}, Lcom/facebook/orca/camera/s;->getHeight()I

    move-result v1

    int-to-float v1, v1

    div-float/2addr v1, v2

    .line 351
    invoke-virtual {p0, p1, v0, v1}, Lcom/facebook/orca/camera/s;->a(FFF)V

    .line 352
    return-void
.end method

.method protected a(FF)V
    .locals 1

    .prologue
    .line 407
    iget-object v0, p0, Lcom/facebook/orca/camera/s;->g:Landroid/graphics/Matrix;

    invoke-virtual {v0, p1, p2}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 408
    return-void
.end method

.method protected a(FFF)V
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 315
    iget v0, p0, Lcom/facebook/orca/camera/s;->k:F

    cmpl-float v0, p1, v0

    if-lez v0, :cond_0

    .line 316
    iget p1, p0, Lcom/facebook/orca/camera/s;->k:F

    .line 319
    :cond_0
    invoke-virtual {p0}, Lcom/facebook/orca/camera/s;->b()F

    move-result v0

    .line 320
    div-float v0, p1, v0

    .line 322
    iget-object v1, p0, Lcom/facebook/orca/camera/s;->g:Landroid/graphics/Matrix;

    invoke-virtual {v1, v0, v0, p2, p3}, Landroid/graphics/Matrix;->postScale(FFFF)Z

    .line 323
    invoke-virtual {p0}, Lcom/facebook/orca/camera/s;->c()Landroid/graphics/Matrix;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/facebook/orca/camera/s;->setImageMatrix(Landroid/graphics/Matrix;)V

    .line 324
    invoke-virtual {p0, v2, v2}, Lcom/facebook/orca/camera/s;->a(ZZ)V

    .line 325
    return-void
.end method

.method protected a(FFFF)V
    .locals 10

    .prologue
    .line 329
    invoke-virtual {p0}, Lcom/facebook/orca/camera/s;->b()F

    move-result v0

    sub-float v0, p1, v0

    div-float v6, v0, p4

    .line 330
    invoke-virtual {p0}, Lcom/facebook/orca/camera/s;->b()F

    move-result v5

    .line 331
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    .line 333
    iget-object v9, p0, Lcom/facebook/orca/camera/s;->l:Landroid/os/Handler;

    new-instance v0, Lcom/facebook/orca/camera/u;

    move-object v1, p0

    move v2, p4

    move v7, p2

    move v8, p3

    invoke-direct/range {v0 .. v8}, Lcom/facebook/orca/camera/u;-><init>(Lcom/facebook/orca/camera/s;FJFFFF)V

    invoke-virtual {v9, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 345
    return-void
.end method

.method public a(Landroid/graphics/Bitmap;Z)V
    .locals 1

    .prologue
    .line 157
    new-instance v0, Lcom/facebook/widget/images/e;

    invoke-direct {v0, p1}, Lcom/facebook/widget/images/e;-><init>(Landroid/graphics/Bitmap;)V

    invoke-virtual {p0, v0, p2}, Lcom/facebook/orca/camera/s;->a(Lcom/facebook/widget/images/e;Z)V

    .line 158
    return-void
.end method

.method public a(Lcom/facebook/widget/images/e;Z)V
    .locals 2

    .prologue
    .line 162
    invoke-virtual {p0}, Lcom/facebook/orca/camera/s;->getWidth()I

    move-result v0

    .line 164
    if-gtz v0, :cond_0

    .line 165
    new-instance v0, Lcom/facebook/orca/camera/t;

    invoke-direct {v0, p0, p1, p2}, Lcom/facebook/orca/camera/t;-><init>(Lcom/facebook/orca/camera/s;Lcom/facebook/widget/images/e;Z)V

    iput-object v0, p0, Lcom/facebook/orca/camera/s;->e:Ljava/lang/Runnable;

    .line 186
    :goto_0
    return-void

    .line 173
    :cond_0
    invoke-virtual {p1}, Lcom/facebook/widget/images/e;->b()Landroid/graphics/Bitmap;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 174
    iget-object v0, p0, Lcom/facebook/orca/camera/s;->f:Landroid/graphics/Matrix;

    invoke-direct {p0, p1, v0}, Lcom/facebook/orca/camera/s;->a(Lcom/facebook/widget/images/e;Landroid/graphics/Matrix;)V

    .line 175
    invoke-virtual {p1}, Lcom/facebook/widget/images/e;->b()Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-virtual {p1}, Lcom/facebook/widget/images/e;->a()I

    move-result v1

    invoke-direct {p0, v0, v1}, Lcom/facebook/orca/camera/s;->a(Landroid/graphics/Bitmap;I)V

    .line 181
    :goto_1
    if-eqz p2, :cond_1

    .line 182
    iget-object v0, p0, Lcom/facebook/orca/camera/s;->g:Landroid/graphics/Matrix;

    invoke-virtual {v0}, Landroid/graphics/Matrix;->reset()V

    .line 184
    :cond_1
    invoke-virtual {p0}, Lcom/facebook/orca/camera/s;->c()Landroid/graphics/Matrix;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/facebook/orca/camera/s;->setImageMatrix(Landroid/graphics/Matrix;)V

    .line 185
    invoke-virtual {p0}, Lcom/facebook/orca/camera/s;->d()F

    move-result v0

    iput v0, p0, Lcom/facebook/orca/camera/s;->k:F

    goto :goto_0

    .line 177
    :cond_2
    iget-object v0, p0, Lcom/facebook/orca/camera/s;->f:Landroid/graphics/Matrix;

    invoke-virtual {v0}, Landroid/graphics/Matrix;->reset()V

    .line 178
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/facebook/orca/camera/s;->setImageBitmap(Landroid/graphics/Bitmap;)V

    goto :goto_1
.end method

.method protected a(ZZ)V
    .locals 7

    .prologue
    const/high16 v6, 0x40000000    # 2.0f

    const/4 v0, 0x0

    .line 194
    iget-object v1, p0, Lcom/facebook/orca/camera/s;->h:Lcom/facebook/widget/images/e;

    invoke-virtual {v1}, Lcom/facebook/widget/images/e;->b()Landroid/graphics/Bitmap;

    move-result-object v1

    if-nez v1, :cond_0

    .line 235
    :goto_0
    return-void

    .line 198
    :cond_0
    invoke-virtual {p0}, Lcom/facebook/orca/camera/s;->c()Landroid/graphics/Matrix;

    move-result-object v1

    .line 200
    new-instance v2, Landroid/graphics/RectF;

    iget-object v3, p0, Lcom/facebook/orca/camera/s;->h:Lcom/facebook/widget/images/e;

    invoke-virtual {v3}, Lcom/facebook/widget/images/e;->b()Landroid/graphics/Bitmap;

    move-result-object v3

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    int-to-float v3, v3

    iget-object v4, p0, Lcom/facebook/orca/camera/s;->h:Lcom/facebook/widget/images/e;

    invoke-virtual {v4}, Lcom/facebook/widget/images/e;->b()Landroid/graphics/Bitmap;

    move-result-object v4

    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v4

    int-to-float v4, v4

    invoke-direct {v2, v0, v0, v3, v4}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 204
    invoke-virtual {v1, v2}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    .line 206
    invoke-virtual {v2}, Landroid/graphics/RectF;->height()F

    move-result v1

    .line 207
    invoke-virtual {v2}, Landroid/graphics/RectF;->width()F

    move-result v3

    .line 211
    if-eqz p2, :cond_6

    .line 212
    invoke-virtual {p0}, Lcom/facebook/orca/camera/s;->getHeight()I

    move-result v4

    .line 213
    int-to-float v5, v4

    cmpg-float v5, v1, v5

    if-gez v5, :cond_2

    .line 214
    int-to-float v4, v4

    sub-float v1, v4, v1

    div-float/2addr v1, v6

    iget v4, v2, Landroid/graphics/RectF;->top:F

    sub-float/2addr v1, v4

    .line 222
    :goto_1
    if-eqz p1, :cond_1

    .line 223
    invoke-virtual {p0}, Lcom/facebook/orca/camera/s;->getWidth()I

    move-result v4

    .line 224
    int-to-float v5, v4

    cmpg-float v5, v3, v5

    if-gez v5, :cond_4

    .line 225
    int-to-float v0, v4

    sub-float/2addr v0, v3

    div-float/2addr v0, v6

    iget v2, v2, Landroid/graphics/RectF;->left:F

    sub-float/2addr v0, v2

    .line 233
    :cond_1
    :goto_2
    invoke-virtual {p0, v0, v1}, Lcom/facebook/orca/camera/s;->a(FF)V

    .line 234
    invoke-virtual {p0}, Lcom/facebook/orca/camera/s;->c()Landroid/graphics/Matrix;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/facebook/orca/camera/s;->setImageMatrix(Landroid/graphics/Matrix;)V

    goto :goto_0

    .line 215
    :cond_2
    iget v1, v2, Landroid/graphics/RectF;->top:F

    cmpl-float v1, v1, v0

    if-lez v1, :cond_3

    .line 216
    iget v1, v2, Landroid/graphics/RectF;->top:F

    neg-float v1, v1

    goto :goto_1

    .line 217
    :cond_3
    iget v1, v2, Landroid/graphics/RectF;->bottom:F

    int-to-float v4, v4

    cmpg-float v1, v1, v4

    if-gez v1, :cond_6

    .line 218
    invoke-virtual {p0}, Lcom/facebook/orca/camera/s;->getHeight()I

    move-result v1

    int-to-float v1, v1

    iget v4, v2, Landroid/graphics/RectF;->bottom:F

    sub-float/2addr v1, v4

    goto :goto_1

    .line 226
    :cond_4
    iget v3, v2, Landroid/graphics/RectF;->left:F

    cmpl-float v3, v3, v0

    if-lez v3, :cond_5

    .line 227
    iget v0, v2, Landroid/graphics/RectF;->left:F

    neg-float v0, v0

    goto :goto_2

    .line 228
    :cond_5
    iget v3, v2, Landroid/graphics/RectF;->right:F

    int-to-float v5, v4

    cmpg-float v3, v3, v5

    if-gez v3, :cond_1

    .line 229
    int-to-float v0, v4

    iget v2, v2, Landroid/graphics/RectF;->right:F

    sub-float/2addr v0, v2

    goto :goto_2

    :cond_6
    move v1, v0

    goto :goto_1
.end method

.method protected b()F
    .locals 1

    .prologue
    .line 262
    iget-object v0, p0, Lcom/facebook/orca/camera/s;->g:Landroid/graphics/Matrix;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/camera/s;->a(Landroid/graphics/Matrix;)F

    move-result v0

    return v0
.end method

.method protected b(FF)V
    .locals 1

    .prologue
    .line 411
    invoke-virtual {p0, p1, p2}, Lcom/facebook/orca/camera/s;->a(FF)V

    .line 412
    invoke-virtual {p0}, Lcom/facebook/orca/camera/s;->c()Landroid/graphics/Matrix;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/facebook/orca/camera/s;->setImageMatrix(Landroid/graphics/Matrix;)V

    .line 413
    return-void
.end method

.method protected c()Landroid/graphics/Matrix;
    .locals 2

    .prologue
    .line 292
    iget-object v0, p0, Lcom/facebook/orca/camera/s;->b:Landroid/graphics/Matrix;

    iget-object v1, p0, Lcom/facebook/orca/camera/s;->f:Landroid/graphics/Matrix;

    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 293
    iget-object v0, p0, Lcom/facebook/orca/camera/s;->b:Landroid/graphics/Matrix;

    iget-object v1, p0, Lcom/facebook/orca/camera/s;->g:Landroid/graphics/Matrix;

    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 294
    iget-object v0, p0, Lcom/facebook/orca/camera/s;->b:Landroid/graphics/Matrix;

    return-object v0
.end method

.method protected d()F
    .locals 3

    .prologue
    .line 304
    iget-object v0, p0, Lcom/facebook/orca/camera/s;->h:Lcom/facebook/widget/images/e;

    invoke-virtual {v0}, Lcom/facebook/widget/images/e;->b()Landroid/graphics/Bitmap;

    move-result-object v0

    if-nez v0, :cond_0

    .line 305
    const/high16 v0, 0x3f800000    # 1.0f

    .line 311
    :goto_0
    return v0

    .line 308
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/camera/s;->h:Lcom/facebook/widget/images/e;

    invoke-virtual {v0}, Lcom/facebook/widget/images/e;->f()I

    move-result v0

    int-to-float v0, v0

    iget v1, p0, Lcom/facebook/orca/camera/s;->i:I

    int-to-float v1, v1

    div-float/2addr v0, v1

    .line 309
    iget-object v1, p0, Lcom/facebook/orca/camera/s;->h:Lcom/facebook/widget/images/e;

    invoke-virtual {v1}, Lcom/facebook/widget/images/e;->e()I

    move-result v1

    int-to-float v1, v1

    iget v2, p0, Lcom/facebook/orca/camera/s;->j:I

    int-to-float v2, v2

    div-float/2addr v1, v2

    .line 310
    invoke-static {v0, v1}, Ljava/lang/Math;->max(FF)F

    move-result v0

    const/high16 v1, 0x40800000    # 4.0f

    mul-float/2addr v0, v1

    .line 311
    goto :goto_0
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 1

    .prologue
    .line 99
    const/4 v0, 0x4

    if-ne p1, v0, :cond_0

    invoke-virtual {p2}, Landroid/view/KeyEvent;->getRepeatCount()I

    move-result v0

    if-nez v0, :cond_0

    .line 101
    invoke-virtual {p2}, Landroid/view/KeyEvent;->startTracking()V

    .line 102
    const/4 v0, 0x1

    .line 104
    :goto_0
    return v0

    :cond_0
    invoke-super {p0, p1, p2}, Landroid/widget/ImageView;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result v0

    goto :goto_0
.end method

.method public onKeyUp(ILandroid/view/KeyEvent;)Z
    .locals 2

    .prologue
    const/high16 v1, 0x3f800000    # 1.0f

    .line 109
    const/4 v0, 0x4

    if-ne p1, v0, :cond_0

    invoke-virtual {p2}, Landroid/view/KeyEvent;->isTracking()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p2}, Landroid/view/KeyEvent;->isCanceled()Z

    move-result v0

    if-nez v0, :cond_0

    .line 111
    invoke-virtual {p0}, Lcom/facebook/orca/camera/s;->b()F

    move-result v0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_0

    .line 114
    invoke-virtual {p0, v1}, Lcom/facebook/orca/camera/s;->a(F)V

    .line 115
    const/4 v0, 0x1

    .line 118
    :goto_0
    return v0

    :cond_0
    invoke-super {p0, p1, p2}, Landroid/widget/ImageView;->onKeyUp(ILandroid/view/KeyEvent;)Z

    move-result v0

    goto :goto_0
.end method

.method protected onLayout(ZIIII)V
    .locals 2

    .prologue
    .line 83
    invoke-super/range {p0 .. p5}, Landroid/widget/ImageView;->onLayout(ZIIII)V

    .line 84
    sub-int v0, p4, p2

    iput v0, p0, Lcom/facebook/orca/camera/s;->i:I

    .line 85
    sub-int v0, p5, p3

    iput v0, p0, Lcom/facebook/orca/camera/s;->j:I

    .line 86
    iget-object v0, p0, Lcom/facebook/orca/camera/s;->e:Ljava/lang/Runnable;

    .line 87
    if-eqz v0, :cond_0

    .line 88
    const/4 v1, 0x0

    iput-object v1, p0, Lcom/facebook/orca/camera/s;->e:Ljava/lang/Runnable;

    .line 89
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    .line 91
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/camera/s;->h:Lcom/facebook/widget/images/e;

    invoke-virtual {v0}, Lcom/facebook/widget/images/e;->b()Landroid/graphics/Bitmap;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 92
    iget-object v0, p0, Lcom/facebook/orca/camera/s;->h:Lcom/facebook/widget/images/e;

    iget-object v1, p0, Lcom/facebook/orca/camera/s;->f:Landroid/graphics/Matrix;

    invoke-direct {p0, v0, v1}, Lcom/facebook/orca/camera/s;->a(Lcom/facebook/widget/images/e;Landroid/graphics/Matrix;)V

    .line 93
    invoke-virtual {p0}, Lcom/facebook/orca/camera/s;->c()Landroid/graphics/Matrix;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/facebook/orca/camera/s;->setImageMatrix(Landroid/graphics/Matrix;)V

    .line 95
    :cond_1
    return-void
.end method

.method public setImageBitmap(Landroid/graphics/Bitmap;)V
    .locals 1

    .prologue
    .line 128
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/facebook/orca/camera/s;->a(Landroid/graphics/Bitmap;I)V

    .line 129
    return-void
.end method
