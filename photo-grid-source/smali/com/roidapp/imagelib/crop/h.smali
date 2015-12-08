.class public final Lcom/roidapp/imagelib/crop/h;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field a:Landroid/view/View;

.field public b:Z

.field c:Z

.field public d:Landroid/graphics/Rect;

.field public e:Landroid/graphics/RectF;

.field public f:Landroid/graphics/Matrix;

.field private g:I

.field private h:Landroid/graphics/RectF;

.field private i:Z

.field private j:F

.field private k:Z

.field private l:Landroid/graphics/drawable/Drawable;

.field private final m:Landroid/graphics/Paint;

.field private final n:Landroid/graphics/Paint;

.field private final o:Landroid/graphics/Paint;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 410
    sget v0, Lcom/roidapp/imagelib/crop/i;->a:I

    iput v0, p0, Lcom/roidapp/imagelib/crop/h;->g:I

    .line 417
    iput-boolean v1, p0, Lcom/roidapp/imagelib/crop/h;->i:Z

    .line 419
    iput-boolean v1, p0, Lcom/roidapp/imagelib/crop/h;->k:Z

    .line 423
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/roidapp/imagelib/crop/h;->m:Landroid/graphics/Paint;

    .line 424
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/roidapp/imagelib/crop/h;->n:Landroid/graphics/Paint;

    .line 425
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/roidapp/imagelib/crop/h;->o:Landroid/graphics/Paint;

    .line 30
    iput-object p1, p0, Lcom/roidapp/imagelib/crop/h;->a:Landroid/view/View;

    .line 31
    return-void
.end method

.method private c()Landroid/graphics/Rect;
    .locals 5

    .prologue
    .line 373
    new-instance v0, Landroid/graphics/RectF;

    iget-object v1, p0, Lcom/roidapp/imagelib/crop/h;->e:Landroid/graphics/RectF;

    iget v1, v1, Landroid/graphics/RectF;->left:F

    iget-object v2, p0, Lcom/roidapp/imagelib/crop/h;->e:Landroid/graphics/RectF;

    iget v2, v2, Landroid/graphics/RectF;->top:F

    iget-object v3, p0, Lcom/roidapp/imagelib/crop/h;->e:Landroid/graphics/RectF;

    iget v3, v3, Landroid/graphics/RectF;->right:F

    iget-object v4, p0, Lcom/roidapp/imagelib/crop/h;->e:Landroid/graphics/RectF;

    iget v4, v4, Landroid/graphics/RectF;->bottom:F

    invoke-direct {v0, v1, v2, v3, v4}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 374
    iget-object v1, p0, Lcom/roidapp/imagelib/crop/h;->f:Landroid/graphics/Matrix;

    invoke-virtual {v1, v0}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    .line 375
    new-instance v1, Landroid/graphics/Rect;

    iget v2, v0, Landroid/graphics/RectF;->left:F

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v2

    iget v3, v0, Landroid/graphics/RectF;->top:F

    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    move-result v3

    iget v4, v0, Landroid/graphics/RectF;->right:F

    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    move-result v4

    iget v0, v0, Landroid/graphics/RectF;->bottom:F

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    invoke-direct {v1, v2, v3, v4, v0}, Landroid/graphics/Rect;-><init>(IIII)V

    return-object v1
.end method


# virtual methods
.method public final a(FF)I
    .locals 10

    .prologue
    const/16 v4, 0x20

    const/4 v2, 0x0

    const/4 v9, 0x0

    const/4 v1, 0x1

    const/high16 v8, 0x41f00000    # 30.0f

    .line 152
    invoke-direct {p0}, Lcom/roidapp/imagelib/crop/h;->c()Landroid/graphics/Rect;

    move-result-object v5

    .line 156
    iget-boolean v0, p0, Lcom/roidapp/imagelib/crop/h;->k:Z

    if-eqz v0, :cond_5

    .line 157
    invoke-virtual {v5}, Landroid/graphics/Rect;->centerX()I

    move-result v0

    int-to-float v0, v0

    sub-float v0, p1, v0

    .line 158
    invoke-virtual {v5}, Landroid/graphics/Rect;->centerY()I

    move-result v2

    int-to-float v2, v2

    sub-float v2, p2, v2

    .line 159
    mul-float v3, v0, v0

    mul-float v5, v2, v2

    add-float/2addr v3, v5

    float-to-double v6, v3

    invoke-static {v6, v7}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v6

    double-to-int v3, v6

    .line 160
    iget-object v5, p0, Lcom/roidapp/imagelib/crop/h;->d:Landroid/graphics/Rect;

    invoke-virtual {v5}, Landroid/graphics/Rect;->width()I

    move-result v5

    div-int/lit8 v5, v5, 0x2

    .line 161
    sub-int v6, v3, v5

    .line 162
    invoke-static {v6}, Ljava/lang/Math;->abs(I)I

    move-result v6

    int-to-float v6, v6

    cmpg-float v6, v6, v8

    if-gtz v6, :cond_4

    .line 163
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    move-result v1

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v3

    cmpl-float v1, v1, v3

    if-lez v1, :cond_2

    .line 164
    cmpg-float v0, v2, v9

    if-gez v0, :cond_1

    .line 165
    const/16 v1, 0x8

    .line 206
    :cond_0
    :goto_0
    return v1

    .line 167
    :cond_1
    const/16 v1, 0x10

    goto :goto_0

    .line 170
    :cond_2
    cmpg-float v0, v0, v9

    if-gez v0, :cond_3

    .line 171
    const/4 v1, 0x2

    goto :goto_0

    .line 173
    :cond_3
    const/4 v1, 0x4

    goto :goto_0

    .line 176
    :cond_4
    if-ge v3, v5, :cond_0

    move v1, v4

    .line 177
    goto :goto_0

    .line 184
    :cond_5
    iget v0, v5, Landroid/graphics/Rect;->top:I

    int-to-float v0, v0

    sub-float/2addr v0, v8

    cmpl-float v0, p2, v0

    if-ltz v0, :cond_9

    iget v0, v5, Landroid/graphics/Rect;->bottom:I

    int-to-float v0, v0

    add-float/2addr v0, v8

    cmpg-float v0, p2, v0

    if-gez v0, :cond_9

    move v0, v1

    .line 185
    :goto_1
    iget v3, v5, Landroid/graphics/Rect;->left:I

    int-to-float v3, v3

    sub-float/2addr v3, v8

    cmpl-float v3, p1, v3

    if-ltz v3, :cond_6

    iget v3, v5, Landroid/graphics/Rect;->right:I

    int-to-float v3, v3

    add-float/2addr v3, v8

    cmpg-float v3, p1, v3

    if-gez v3, :cond_6

    move v2, v1

    .line 188
    :cond_6
    iget v3, v5, Landroid/graphics/Rect;->left:I

    int-to-float v3, v3

    sub-float/2addr v3, p1

    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    move-result v3

    cmpg-float v3, v3, v8

    if-gez v3, :cond_c

    if-eqz v0, :cond_c

    .line 189
    const/4 v3, 0x3

    .line 191
    :goto_2
    iget v6, v5, Landroid/graphics/Rect;->right:I

    int-to-float v6, v6

    sub-float/2addr v6, p1

    invoke-static {v6}, Ljava/lang/Math;->abs(F)F

    move-result v6

    cmpg-float v6, v6, v8

    if-gez v6, :cond_7

    if-eqz v0, :cond_7

    .line 192
    or-int/lit8 v3, v3, 0x4

    .line 194
    :cond_7
    iget v0, v5, Landroid/graphics/Rect;->top:I

    int-to-float v0, v0

    sub-float/2addr v0, p2

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    cmpg-float v0, v0, v8

    if-gez v0, :cond_8

    if-eqz v2, :cond_8

    .line 195
    or-int/lit8 v3, v3, 0x8

    .line 197
    :cond_8
    iget v0, v5, Landroid/graphics/Rect;->bottom:I

    int-to-float v0, v0

    sub-float/2addr v0, p2

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    cmpg-float v0, v0, v8

    if-gez v0, :cond_b

    if-eqz v2, :cond_b

    .line 198
    or-int/lit8 v3, v3, 0x10

    move v0, v3

    .line 202
    :goto_3
    if-ne v0, v1, :cond_a

    float-to-int v1, p1

    float-to-int v2, p2

    invoke-virtual {v5, v1, v2}, Landroid/graphics/Rect;->contains(II)Z

    move-result v1

    if-eqz v1, :cond_a

    move v1, v4

    .line 203
    goto :goto_0

    :cond_9
    move v0, v2

    .line 184
    goto :goto_1

    :cond_a
    move v1, v0

    goto/16 :goto_0

    :cond_b
    move v0, v3

    goto :goto_3

    :cond_c
    move v3, v1

    goto :goto_2
.end method

.method public final a()Landroid/graphics/Rect;
    .locals 5

    .prologue
    .line 368
    new-instance v0, Landroid/graphics/Rect;

    iget-object v1, p0, Lcom/roidapp/imagelib/crop/h;->e:Landroid/graphics/RectF;

    iget v1, v1, Landroid/graphics/RectF;->left:F

    float-to-int v1, v1

    iget-object v2, p0, Lcom/roidapp/imagelib/crop/h;->e:Landroid/graphics/RectF;

    iget v2, v2, Landroid/graphics/RectF;->top:F

    float-to-int v2, v2

    iget-object v3, p0, Lcom/roidapp/imagelib/crop/h;->e:Landroid/graphics/RectF;

    iget v3, v3, Landroid/graphics/RectF;->right:F

    float-to-int v3, v3

    iget-object v4, p0, Lcom/roidapp/imagelib/crop/h;->e:Landroid/graphics/RectF;

    iget v4, v4, Landroid/graphics/RectF;->bottom:F

    float-to-int v4, v4

    invoke-direct {v0, v1, v2, v3, v4}, Landroid/graphics/Rect;-><init>(IIII)V

    return-object v0
.end method

.method public final a(I)V
    .locals 1

    .prologue
    .line 144
    iget v0, p0, Lcom/roidapp/imagelib/crop/h;->g:I

    if-eq p1, v0, :cond_0

    .line 145
    iput p1, p0, Lcom/roidapp/imagelib/crop/h;->g:I

    .line 146
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/h;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 148
    :cond_0
    return-void
.end method

.method public final a(IFF)V
    .locals 8

    .prologue
    const/16 v6, -0xa

    const/4 v2, 0x1

    const/high16 v7, 0x40000000    # 2.0f

    const/high16 v4, 0x41c80000    # 25.0f

    const/4 v0, 0x0

    .line 212
    invoke-direct {p0}, Lcom/roidapp/imagelib/crop/h;->c()Landroid/graphics/Rect;

    move-result-object v3

    .line 213
    if-ne p1, v2, :cond_0

    .line 243
    :goto_0
    return-void

    .line 215
    :cond_0
    const/16 v1, 0x20

    if-ne p1, v1, :cond_1

    .line 217
    iget-object v1, p0, Lcom/roidapp/imagelib/crop/h;->e:Landroid/graphics/RectF;

    invoke-virtual {v1}, Landroid/graphics/RectF;->width()F

    move-result v1

    invoke-virtual {v3}, Landroid/graphics/Rect;->width()I

    move-result v2

    int-to-float v2, v2

    div-float/2addr v1, v2

    mul-float/2addr v1, p2

    iget-object v2, p0, Lcom/roidapp/imagelib/crop/h;->e:Landroid/graphics/RectF;

    invoke-virtual {v2}, Landroid/graphics/RectF;->height()F

    move-result v2

    invoke-virtual {v3}, Landroid/graphics/Rect;->height()I

    move-result v3

    int-to-float v3, v3

    div-float/2addr v2, v3

    mul-float/2addr v2, p3

    .line 2247
    new-instance v3, Landroid/graphics/Rect;

    iget-object v4, p0, Lcom/roidapp/imagelib/crop/h;->d:Landroid/graphics/Rect;

    invoke-direct {v3, v4}, Landroid/graphics/Rect;-><init>(Landroid/graphics/Rect;)V

    .line 2249
    iget-object v4, p0, Lcom/roidapp/imagelib/crop/h;->e:Landroid/graphics/RectF;

    invoke-virtual {v4, v1, v2}, Landroid/graphics/RectF;->offset(FF)V

    .line 2252
    iget-object v1, p0, Lcom/roidapp/imagelib/crop/h;->e:Landroid/graphics/RectF;

    iget-object v2, p0, Lcom/roidapp/imagelib/crop/h;->h:Landroid/graphics/RectF;

    iget v2, v2, Landroid/graphics/RectF;->left:F

    iget-object v4, p0, Lcom/roidapp/imagelib/crop/h;->e:Landroid/graphics/RectF;

    iget v4, v4, Landroid/graphics/RectF;->left:F

    sub-float/2addr v2, v4

    invoke-static {v0, v2}, Ljava/lang/Math;->max(FF)F

    move-result v2

    iget-object v4, p0, Lcom/roidapp/imagelib/crop/h;->h:Landroid/graphics/RectF;

    iget v4, v4, Landroid/graphics/RectF;->top:F

    iget-object v5, p0, Lcom/roidapp/imagelib/crop/h;->e:Landroid/graphics/RectF;

    iget v5, v5, Landroid/graphics/RectF;->top:F

    sub-float/2addr v4, v5

    invoke-static {v0, v4}, Ljava/lang/Math;->max(FF)F

    move-result v4

    invoke-virtual {v1, v2, v4}, Landroid/graphics/RectF;->offset(FF)V

    .line 2254
    iget-object v1, p0, Lcom/roidapp/imagelib/crop/h;->e:Landroid/graphics/RectF;

    iget-object v2, p0, Lcom/roidapp/imagelib/crop/h;->h:Landroid/graphics/RectF;

    iget v2, v2, Landroid/graphics/RectF;->right:F

    iget-object v4, p0, Lcom/roidapp/imagelib/crop/h;->e:Landroid/graphics/RectF;

    iget v4, v4, Landroid/graphics/RectF;->right:F

    sub-float/2addr v2, v4

    invoke-static {v0, v2}, Ljava/lang/Math;->min(FF)F

    move-result v2

    iget-object v4, p0, Lcom/roidapp/imagelib/crop/h;->h:Landroid/graphics/RectF;

    iget v4, v4, Landroid/graphics/RectF;->bottom:F

    iget-object v5, p0, Lcom/roidapp/imagelib/crop/h;->e:Landroid/graphics/RectF;

    iget v5, v5, Landroid/graphics/RectF;->bottom:F

    sub-float/2addr v4, v5

    invoke-static {v0, v4}, Ljava/lang/Math;->min(FF)F

    move-result v0

    invoke-virtual {v1, v2, v0}, Landroid/graphics/RectF;->offset(FF)V

    .line 2256
    invoke-direct {p0}, Lcom/roidapp/imagelib/crop/h;->c()Landroid/graphics/Rect;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/imagelib/crop/h;->d:Landroid/graphics/Rect;

    .line 2257
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/h;->d:Landroid/graphics/Rect;

    invoke-virtual {v3, v0}, Landroid/graphics/Rect;->union(Landroid/graphics/Rect;)V

    .line 2258
    invoke-virtual {v3, v6, v6}, Landroid/graphics/Rect;->inset(II)V

    .line 2259
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/h;->a:Landroid/view/View;

    invoke-virtual {v0, v3}, Landroid/view/View;->invalidate(Landroid/graphics/Rect;)V

    goto :goto_0

    .line 219
    :cond_1
    and-int/lit8 v1, p1, 0x6

    if-nez v1, :cond_2

    move p2, v0

    .line 223
    :cond_2
    and-int/lit8 v1, p1, 0x18

    if-nez v1, :cond_3

    move p3, v0

    .line 228
    :cond_3
    invoke-virtual {v3}, Landroid/graphics/Rect;->width()I

    move-result v1

    if-nez v1, :cond_c

    move v1, v2

    .line 233
    :goto_1
    invoke-virtual {v3}, Landroid/graphics/Rect;->height()I

    move-result v5

    if-nez v5, :cond_d

    move v3, v2

    .line 239
    :goto_2
    iget-object v5, p0, Lcom/roidapp/imagelib/crop/h;->e:Landroid/graphics/RectF;

    invoke-virtual {v5}, Landroid/graphics/RectF;->width()F

    move-result v5

    int-to-float v1, v1

    div-float v1, v5, v1

    mul-float v5, p2, v1

    .line 240
    iget-object v1, p0, Lcom/roidapp/imagelib/crop/h;->e:Landroid/graphics/RectF;

    invoke-virtual {v1}, Landroid/graphics/RectF;->height()F

    move-result v1

    int-to-float v3, v3

    div-float/2addr v1, v3

    mul-float v6, p3, v1

    .line 241
    and-int/lit8 v1, p1, 0x2

    if-eqz v1, :cond_e

    const/4 v1, -0x1

    :goto_3
    int-to-float v1, v1

    mul-float v3, v1, v5

    and-int/lit8 v1, p1, 0x8

    if-eqz v1, :cond_4

    const/4 v2, -0x1

    :cond_4
    int-to-float v1, v2

    mul-float/2addr v1, v6

    .line 2264
    iget-boolean v2, p0, Lcom/roidapp/imagelib/crop/h;->i:Z

    if-eqz v2, :cond_1b

    .line 2265
    cmpl-float v2, v3, v0

    if-eqz v2, :cond_f

    .line 2266
    iget v1, p0, Lcom/roidapp/imagelib/crop/h;->j:F

    div-float v1, v3, v1

    move v2, v3

    .line 2275
    :goto_4
    new-instance v3, Landroid/graphics/RectF;

    iget-object v5, p0, Lcom/roidapp/imagelib/crop/h;->e:Landroid/graphics/RectF;

    invoke-direct {v3, v5}, Landroid/graphics/RectF;-><init>(Landroid/graphics/RectF;)V

    .line 2276
    cmpl-float v5, v2, v0

    if-lez v5, :cond_5

    invoke-virtual {v3}, Landroid/graphics/RectF;->width()F

    move-result v5

    mul-float v6, v7, v2

    add-float/2addr v5, v6

    iget-object v6, p0, Lcom/roidapp/imagelib/crop/h;->h:Landroid/graphics/RectF;

    invoke-virtual {v6}, Landroid/graphics/RectF;->width()F

    move-result v6

    cmpl-float v5, v5, v6

    if-lez v5, :cond_5

    .line 2277
    iget-object v2, p0, Lcom/roidapp/imagelib/crop/h;->h:Landroid/graphics/RectF;

    invoke-virtual {v2}, Landroid/graphics/RectF;->width()F

    move-result v2

    invoke-virtual {v3}, Landroid/graphics/RectF;->width()F

    move-result v5

    sub-float/2addr v2, v5

    div-float/2addr v2, v7

    .line 2279
    iget-boolean v5, p0, Lcom/roidapp/imagelib/crop/h;->i:Z

    if-eqz v5, :cond_5

    .line 2280
    iget v1, p0, Lcom/roidapp/imagelib/crop/h;->j:F

    div-float v1, v2, v1

    .line 2283
    :cond_5
    cmpl-float v5, v1, v0

    if-lez v5, :cond_6

    invoke-virtual {v3}, Landroid/graphics/RectF;->height()F

    move-result v5

    mul-float v6, v7, v1

    add-float/2addr v5, v6

    iget-object v6, p0, Lcom/roidapp/imagelib/crop/h;->h:Landroid/graphics/RectF;

    invoke-virtual {v6}, Landroid/graphics/RectF;->height()F

    move-result v6

    cmpl-float v5, v5, v6

    if-lez v5, :cond_6

    .line 2284
    iget-object v1, p0, Lcom/roidapp/imagelib/crop/h;->h:Landroid/graphics/RectF;

    invoke-virtual {v1}, Landroid/graphics/RectF;->height()F

    move-result v1

    invoke-virtual {v3}, Landroid/graphics/RectF;->height()F

    move-result v5

    sub-float/2addr v1, v5

    div-float/2addr v1, v7

    .line 2286
    iget-boolean v5, p0, Lcom/roidapp/imagelib/crop/h;->i:Z

    if-eqz v5, :cond_6

    .line 2287
    iget v2, p0, Lcom/roidapp/imagelib/crop/h;->j:F

    mul-float/2addr v2, v1

    .line 2292
    :cond_6
    iget-boolean v5, p0, Lcom/roidapp/imagelib/crop/h;->i:Z

    if-eqz v5, :cond_10

    .line 2293
    neg-float v2, v2

    neg-float v1, v1

    invoke-virtual {v3, v2, v1}, Landroid/graphics/RectF;->inset(FF)V

    .line 2325
    :cond_7
    :goto_5
    invoke-virtual {v3}, Landroid/graphics/RectF;->width()F

    move-result v1

    cmpg-float v1, v1, v4

    if-gez v1, :cond_8

    .line 2326
    invoke-virtual {v3}, Landroid/graphics/RectF;->width()F

    move-result v1

    sub-float v1, v4, v1

    neg-float v1, v1

    div-float/2addr v1, v7

    invoke-virtual {v3, v1, v0}, Landroid/graphics/RectF;->inset(FF)V

    .line 2328
    :cond_8
    iget-boolean v1, p0, Lcom/roidapp/imagelib/crop/h;->i:Z

    if-eqz v1, :cond_14

    iget v1, p0, Lcom/roidapp/imagelib/crop/h;->j:F

    div-float v1, v4, v1

    .line 2329
    :goto_6
    invoke-virtual {v3}, Landroid/graphics/RectF;->height()F

    move-result v2

    cmpg-float v2, v2, v1

    if-gez v2, :cond_9

    .line 2330
    invoke-virtual {v3}, Landroid/graphics/RectF;->height()F

    move-result v2

    sub-float/2addr v1, v2

    neg-float v1, v1

    div-float/2addr v1, v7

    invoke-virtual {v3, v0, v1}, Landroid/graphics/RectF;->inset(FF)V

    .line 2334
    :cond_9
    iget v1, v3, Landroid/graphics/RectF;->left:F

    iget-object v2, p0, Lcom/roidapp/imagelib/crop/h;->h:Landroid/graphics/RectF;

    iget v2, v2, Landroid/graphics/RectF;->left:F

    cmpg-float v1, v1, v2

    if-gez v1, :cond_16

    .line 2335
    iget-boolean v1, p0, Lcom/roidapp/imagelib/crop/h;->i:Z

    if-eqz v1, :cond_15

    .line 2336
    iget-object v1, p0, Lcom/roidapp/imagelib/crop/h;->h:Landroid/graphics/RectF;

    iget v1, v1, Landroid/graphics/RectF;->left:F

    iget v2, v3, Landroid/graphics/RectF;->left:F

    sub-float/2addr v1, v2

    invoke-virtual {v3, v1, v0}, Landroid/graphics/RectF;->offset(FF)V

    .line 2347
    :cond_a
    :goto_7
    iget v1, v3, Landroid/graphics/RectF;->top:F

    iget-object v2, p0, Lcom/roidapp/imagelib/crop/h;->h:Landroid/graphics/RectF;

    iget v2, v2, Landroid/graphics/RectF;->top:F

    cmpg-float v1, v1, v2

    if-gez v1, :cond_19

    .line 2348
    iget-boolean v1, p0, Lcom/roidapp/imagelib/crop/h;->i:Z

    if-eqz v1, :cond_18

    .line 2349
    iget-object v1, p0, Lcom/roidapp/imagelib/crop/h;->h:Landroid/graphics/RectF;

    iget v1, v1, Landroid/graphics/RectF;->top:F

    iget v2, v3, Landroid/graphics/RectF;->top:F

    sub-float/2addr v1, v2

    invoke-virtual {v3, v0, v1}, Landroid/graphics/RectF;->offset(FF)V

    .line 2361
    :cond_b
    :goto_8
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/h;->e:Landroid/graphics/RectF;

    invoke-virtual {v0, v3}, Landroid/graphics/RectF;->set(Landroid/graphics/RectF;)V

    .line 2362
    invoke-direct {p0}, Lcom/roidapp/imagelib/crop/h;->c()Landroid/graphics/Rect;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/imagelib/crop/h;->d:Landroid/graphics/Rect;

    .line 2363
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/h;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    goto/16 :goto_0

    .line 231
    :cond_c
    invoke-virtual {v3}, Landroid/graphics/Rect;->width()I

    move-result v1

    goto/16 :goto_1

    .line 236
    :cond_d
    invoke-virtual {v3}, Landroid/graphics/Rect;->height()I

    move-result v3

    goto/16 :goto_2

    :cond_e
    move v1, v2

    .line 241
    goto/16 :goto_3

    .line 2267
    :cond_f
    cmpl-float v2, v1, v0

    if-eqz v2, :cond_1b

    .line 2268
    iget v2, p0, Lcom/roidapp/imagelib/crop/h;->j:F

    mul-float/2addr v2, v1

    goto/16 :goto_4

    .line 2295
    :cond_10
    and-int/lit8 v5, p1, 0x2

    if-eqz v5, :cond_11

    .line 2296
    iget v5, v3, Landroid/graphics/RectF;->left:F

    sub-float/2addr v5, v2

    iput v5, v3, Landroid/graphics/RectF;->left:F

    .line 2297
    invoke-virtual {v3}, Landroid/graphics/RectF;->width()F

    move-result v5

    cmpg-float v5, v5, v4

    if-gez v5, :cond_11

    .line 2298
    iget v5, v3, Landroid/graphics/RectF;->left:F

    add-float/2addr v5, v2

    iput v5, v3, Landroid/graphics/RectF;->left:F

    .line 2301
    :cond_11
    and-int/lit8 v5, p1, 0x4

    if-eqz v5, :cond_12

    .line 2302
    iget v5, v3, Landroid/graphics/RectF;->right:F

    add-float/2addr v5, v2

    iput v5, v3, Landroid/graphics/RectF;->right:F

    .line 2303
    invoke-virtual {v3}, Landroid/graphics/RectF;->width()F

    move-result v5

    cmpg-float v5, v5, v4

    if-gez v5, :cond_12

    .line 2304
    iget v5, v3, Landroid/graphics/RectF;->right:F

    sub-float v2, v5, v2

    iput v2, v3, Landroid/graphics/RectF;->right:F

    .line 2307
    :cond_12
    and-int/lit8 v2, p1, 0x8

    if-eqz v2, :cond_13

    .line 2308
    iget v2, v3, Landroid/graphics/RectF;->top:F

    sub-float/2addr v2, v1

    iput v2, v3, Landroid/graphics/RectF;->top:F

    .line 2309
    invoke-virtual {v3}, Landroid/graphics/RectF;->height()F

    move-result v2

    cmpg-float v2, v2, v4

    if-gez v2, :cond_13

    .line 2310
    iget v2, v3, Landroid/graphics/RectF;->top:F

    add-float/2addr v2, v1

    iput v2, v3, Landroid/graphics/RectF;->top:F

    .line 2313
    :cond_13
    and-int/lit8 v2, p1, 0x10

    if-eqz v2, :cond_7

    .line 2314
    iget v2, v3, Landroid/graphics/RectF;->bottom:F

    add-float/2addr v2, v1

    iput v2, v3, Landroid/graphics/RectF;->bottom:F

    .line 2315
    invoke-virtual {v3}, Landroid/graphics/RectF;->height()F

    move-result v2

    cmpg-float v2, v2, v4

    if-gez v2, :cond_7

    .line 2316
    iget v2, v3, Landroid/graphics/RectF;->bottom:F

    sub-float v1, v2, v1

    iput v1, v3, Landroid/graphics/RectF;->bottom:F

    goto/16 :goto_5

    :cond_14
    move v1, v4

    .line 2328
    goto/16 :goto_6

    .line 2338
    :cond_15
    iget v1, v3, Landroid/graphics/RectF;->left:F

    iget-object v2, p0, Lcom/roidapp/imagelib/crop/h;->h:Landroid/graphics/RectF;

    iget v2, v2, Landroid/graphics/RectF;->left:F

    iget v4, v3, Landroid/graphics/RectF;->left:F

    sub-float/2addr v2, v4

    add-float/2addr v1, v2

    iput v1, v3, Landroid/graphics/RectF;->left:F

    goto/16 :goto_7

    .line 2340
    :cond_16
    iget v1, v3, Landroid/graphics/RectF;->right:F

    iget-object v2, p0, Lcom/roidapp/imagelib/crop/h;->h:Landroid/graphics/RectF;

    iget v2, v2, Landroid/graphics/RectF;->right:F

    cmpl-float v1, v1, v2

    if-lez v1, :cond_a

    .line 2341
    iget-boolean v1, p0, Lcom/roidapp/imagelib/crop/h;->i:Z

    if-eqz v1, :cond_17

    .line 2342
    iget v1, v3, Landroid/graphics/RectF;->right:F

    iget-object v2, p0, Lcom/roidapp/imagelib/crop/h;->h:Landroid/graphics/RectF;

    iget v2, v2, Landroid/graphics/RectF;->right:F

    sub-float/2addr v1, v2

    neg-float v1, v1

    invoke-virtual {v3, v1, v0}, Landroid/graphics/RectF;->offset(FF)V

    goto/16 :goto_7

    .line 2344
    :cond_17
    iget v1, v3, Landroid/graphics/RectF;->right:F

    iget v2, v3, Landroid/graphics/RectF;->right:F

    iget-object v4, p0, Lcom/roidapp/imagelib/crop/h;->h:Landroid/graphics/RectF;

    iget v4, v4, Landroid/graphics/RectF;->right:F

    sub-float/2addr v2, v4

    neg-float v2, v2

    add-float/2addr v1, v2

    iput v1, v3, Landroid/graphics/RectF;->right:F

    goto/16 :goto_7

    .line 2351
    :cond_18
    iget v0, v3, Landroid/graphics/RectF;->top:F

    iget-object v1, p0, Lcom/roidapp/imagelib/crop/h;->h:Landroid/graphics/RectF;

    iget v1, v1, Landroid/graphics/RectF;->top:F

    iget v2, v3, Landroid/graphics/RectF;->top:F

    sub-float/2addr v1, v2

    add-float/2addr v0, v1

    iput v0, v3, Landroid/graphics/RectF;->top:F

    goto/16 :goto_8

    .line 2353
    :cond_19
    iget v1, v3, Landroid/graphics/RectF;->bottom:F

    iget-object v2, p0, Lcom/roidapp/imagelib/crop/h;->h:Landroid/graphics/RectF;

    iget v2, v2, Landroid/graphics/RectF;->bottom:F

    cmpl-float v1, v1, v2

    if-lez v1, :cond_b

    .line 2354
    iget-boolean v1, p0, Lcom/roidapp/imagelib/crop/h;->i:Z

    if-eqz v1, :cond_1a

    .line 2355
    iget v1, v3, Landroid/graphics/RectF;->bottom:F

    iget-object v2, p0, Lcom/roidapp/imagelib/crop/h;->h:Landroid/graphics/RectF;

    iget v2, v2, Landroid/graphics/RectF;->bottom:F

    sub-float/2addr v1, v2

    neg-float v1, v1

    invoke-virtual {v3, v0, v1}, Landroid/graphics/RectF;->offset(FF)V

    goto/16 :goto_8

    .line 2357
    :cond_1a
    iget v0, v3, Landroid/graphics/RectF;->bottom:F

    iget v1, v3, Landroid/graphics/RectF;->bottom:F

    iget-object v2, p0, Lcom/roidapp/imagelib/crop/h;->h:Landroid/graphics/RectF;

    iget v2, v2, Landroid/graphics/RectF;->bottom:F

    sub-float/2addr v1, v2

    neg-float v1, v1

    add-float/2addr v0, v1

    iput v0, v3, Landroid/graphics/RectF;->bottom:F

    goto/16 :goto_8

    :cond_1b
    move v2, v3

    goto/16 :goto_4
.end method

.method public final a(Landroid/graphics/Canvas;)V
    .locals 13

    .prologue
    const v7, -0x77ffff01

    const/high16 v6, 0x40000000    # 2.0f

    .line 54
    iget-boolean v0, p0, Lcom/roidapp/imagelib/crop/h;->c:Z

    if-eqz v0, :cond_1

    .line 141
    :cond_0
    :goto_0
    return-void

    .line 57
    :cond_1
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 58
    new-instance v1, Landroid/graphics/Path;

    invoke-direct {v1}, Landroid/graphics/Path;-><init>()V

    .line 1042
    iget-boolean v0, p0, Lcom/roidapp/imagelib/crop/h;->b:Z

    .line 59
    if-nez v0, :cond_2

    .line 60
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/h;->o:Landroid/graphics/Paint;

    const/high16 v1, -0x1000000

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 61
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/h;->d:Landroid/graphics/Rect;

    iget-object v1, p0, Lcom/roidapp/imagelib/crop/h;->o:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    goto :goto_0

    .line 63
    :cond_2
    new-instance v2, Landroid/graphics/Rect;

    invoke-direct {v2}, Landroid/graphics/Rect;-><init>()V

    .line 64
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/h;->a:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->getDrawingRect(Landroid/graphics/Rect;)V

    .line 65
    iget-boolean v0, p0, Lcom/roidapp/imagelib/crop/h;->k:Z

    if-eqz v0, :cond_4

    .line 66
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/h;->d:Landroid/graphics/Rect;

    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v0

    int-to-float v0, v0

    .line 67
    iget-object v3, p0, Lcom/roidapp/imagelib/crop/h;->d:Landroid/graphics/Rect;

    invoke-virtual {v3}, Landroid/graphics/Rect;->height()I

    move-result v3

    int-to-float v3, v3

    .line 68
    iget-object v4, p0, Lcom/roidapp/imagelib/crop/h;->d:Landroid/graphics/Rect;

    iget v4, v4, Landroid/graphics/Rect;->left:I

    int-to-float v4, v4

    div-float v5, v0, v6

    add-float/2addr v4, v5

    iget-object v5, p0, Lcom/roidapp/imagelib/crop/h;->d:Landroid/graphics/Rect;

    iget v5, v5, Landroid/graphics/Rect;->top:I

    int-to-float v5, v5

    div-float/2addr v3, v6

    add-float/2addr v3, v5

    div-float/2addr v0, v6

    sget-object v5, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    invoke-virtual {v1, v4, v3, v0, v5}, Landroid/graphics/Path;->addCircle(FFFLandroid/graphics/Path$Direction;)V

    .line 69
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/h;->o:Landroid/graphics/Paint;

    invoke-virtual {v0, v7}, Landroid/graphics/Paint;->setColor(I)V

    .line 75
    :goto_1
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/h;->o:Landroid/graphics/Paint;

    const/4 v3, 0x1

    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 76
    sget-object v0, Landroid/graphics/Region$Op;->DIFFERENCE:Landroid/graphics/Region$Op;

    invoke-virtual {p1, v1, v0}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;Landroid/graphics/Region$Op;)Z

    .line 2042
    iget-boolean v0, p0, Lcom/roidapp/imagelib/crop/h;->b:Z

    .line 77
    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/roidapp/imagelib/crop/h;->m:Landroid/graphics/Paint;

    :goto_2
    invoke-virtual {p1, v2, v0}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    .line 79
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 80
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/h;->o:Landroid/graphics/Paint;

    invoke-virtual {p1, v1, v0}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 83
    iget v0, p0, Lcom/roidapp/imagelib/crop/h;->g:I

    sget v1, Lcom/roidapp/imagelib/crop/i;->a:I

    if-eq v0, v1, :cond_3

    iget v0, p0, Lcom/roidapp/imagelib/crop/h;->g:I

    sget v1, Lcom/roidapp/imagelib/crop/i;->c:I

    if-ne v0, v1, :cond_0

    .line 84
    :cond_3
    iget-boolean v0, p0, Lcom/roidapp/imagelib/crop/h;->k:Z

    if-eqz v0, :cond_6

    .line 85
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/h;->l:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v0

    .line 86
    iget-object v1, p0, Lcom/roidapp/imagelib/crop/h;->l:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v1

    .line 88
    const-wide v2, 0x3fe921fb54442d18L    # 0.7853981633974483

    invoke-static {v2, v3}, Ljava/lang/Math;->cos(D)D

    move-result-wide v2

    iget-object v4, p0, Lcom/roidapp/imagelib/crop/h;->d:Landroid/graphics/Rect;

    invoke-virtual {v4}, Landroid/graphics/Rect;->width()I

    move-result v4

    int-to-double v4, v4

    const-wide/high16 v6, 0x4000000000000000L    # 2.0

    div-double/2addr v4, v6

    mul-double/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Math;->round(D)J

    move-result-wide v2

    long-to-int v2, v2

    .line 89
    iget-object v3, p0, Lcom/roidapp/imagelib/crop/h;->d:Landroid/graphics/Rect;

    iget v3, v3, Landroid/graphics/Rect;->left:I

    iget-object v4, p0, Lcom/roidapp/imagelib/crop/h;->d:Landroid/graphics/Rect;

    invoke-virtual {v4}, Landroid/graphics/Rect;->width()I

    move-result v4

    div-int/lit8 v4, v4, 0x2

    add-int/2addr v3, v4

    add-int/2addr v3, v2

    div-int/lit8 v0, v0, 0x2

    sub-int v0, v3, v0

    .line 90
    iget-object v3, p0, Lcom/roidapp/imagelib/crop/h;->d:Landroid/graphics/Rect;

    iget v3, v3, Landroid/graphics/Rect;->top:I

    iget-object v4, p0, Lcom/roidapp/imagelib/crop/h;->d:Landroid/graphics/Rect;

    invoke-virtual {v4}, Landroid/graphics/Rect;->height()I

    move-result v4

    div-int/lit8 v4, v4, 0x2

    add-int/2addr v3, v4

    sub-int v2, v3, v2

    div-int/lit8 v1, v1, 0x2

    sub-int v1, v2, v1

    .line 91
    iget-object v2, p0, Lcom/roidapp/imagelib/crop/h;->l:Landroid/graphics/drawable/Drawable;

    iget-object v3, p0, Lcom/roidapp/imagelib/crop/h;->l:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v3}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v3

    add-int/2addr v3, v0

    iget-object v4, p0, Lcom/roidapp/imagelib/crop/h;->l:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v4}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v4

    add-int/2addr v4, v1

    invoke-virtual {v2, v0, v1, v3, v4}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 93
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/h;->l:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    goto/16 :goto_0

    .line 71
    :cond_4
    new-instance v0, Landroid/graphics/RectF;

    iget-object v3, p0, Lcom/roidapp/imagelib/crop/h;->d:Landroid/graphics/Rect;

    invoke-direct {v0, v3}, Landroid/graphics/RectF;-><init>(Landroid/graphics/Rect;)V

    sget-object v3, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    invoke-virtual {v1, v0, v3}, Landroid/graphics/Path;->addRect(Landroid/graphics/RectF;Landroid/graphics/Path$Direction;)V

    .line 72
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/h;->o:Landroid/graphics/Paint;

    invoke-virtual {v0, v7}, Landroid/graphics/Paint;->setColor(I)V

    goto/16 :goto_1

    .line 77
    :cond_5
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/h;->n:Landroid/graphics/Paint;

    goto/16 :goto_2

    .line 95
    :cond_6
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/h;->d:Landroid/graphics/Rect;

    iget v0, v0, Landroid/graphics/Rect;->left:I

    .line 96
    iget-object v1, p0, Lcom/roidapp/imagelib/crop/h;->d:Landroid/graphics/Rect;

    iget v1, v1, Landroid/graphics/Rect;->right:I

    .line 97
    iget-object v2, p0, Lcom/roidapp/imagelib/crop/h;->d:Landroid/graphics/Rect;

    iget v2, v2, Landroid/graphics/Rect;->top:I

    .line 98
    iget-object v3, p0, Lcom/roidapp/imagelib/crop/h;->d:Landroid/graphics/Rect;

    iget v3, v3, Landroid/graphics/Rect;->bottom:I

    .line 100
    iget-object v4, p0, Lcom/roidapp/imagelib/crop/h;->l:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v4}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v4

    div-int/lit8 v4, v4, 0x2

    .line 101
    iget-object v5, p0, Lcom/roidapp/imagelib/crop/h;->l:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v5}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v5

    div-int/lit8 v5, v5, 0x2

    .line 103
    iget-object v6, p0, Lcom/roidapp/imagelib/crop/h;->d:Landroid/graphics/Rect;

    iget v6, v6, Landroid/graphics/Rect;->left:I

    iget-object v7, p0, Lcom/roidapp/imagelib/crop/h;->d:Landroid/graphics/Rect;

    iget v7, v7, Landroid/graphics/Rect;->right:I

    iget-object v8, p0, Lcom/roidapp/imagelib/crop/h;->d:Landroid/graphics/Rect;

    iget v8, v8, Landroid/graphics/Rect;->left:I

    sub-int/2addr v7, v8

    div-int/lit8 v7, v7, 0x2

    add-int/2addr v6, v7

    .line 104
    iget-object v7, p0, Lcom/roidapp/imagelib/crop/h;->d:Landroid/graphics/Rect;

    iget v7, v7, Landroid/graphics/Rect;->top:I

    iget-object v8, p0, Lcom/roidapp/imagelib/crop/h;->d:Landroid/graphics/Rect;

    iget v8, v8, Landroid/graphics/Rect;->bottom:I

    iget-object v9, p0, Lcom/roidapp/imagelib/crop/h;->d:Landroid/graphics/Rect;

    iget v9, v9, Landroid/graphics/Rect;->top:I

    sub-int/2addr v8, v9

    div-int/lit8 v8, v8, 0x2

    add-int/2addr v7, v8

    .line 106
    iget-object v8, p0, Lcom/roidapp/imagelib/crop/h;->l:Landroid/graphics/drawable/Drawable;

    sub-int v9, v0, v4

    sub-int v10, v7, v5

    add-int v11, v0, v4

    add-int v12, v7, v5

    invoke-virtual {v8, v9, v10, v11, v12}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 108
    iget-object v8, p0, Lcom/roidapp/imagelib/crop/h;->l:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v8, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 110
    iget-object v8, p0, Lcom/roidapp/imagelib/crop/h;->l:Landroid/graphics/drawable/Drawable;

    sub-int v9, v1, v4

    sub-int v10, v7, v5

    add-int v11, v1, v4

    add-int/2addr v7, v5

    invoke-virtual {v8, v9, v10, v11, v7}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 112
    iget-object v7, p0, Lcom/roidapp/imagelib/crop/h;->l:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v7, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 114
    iget-object v7, p0, Lcom/roidapp/imagelib/crop/h;->l:Landroid/graphics/drawable/Drawable;

    sub-int v8, v6, v4

    sub-int v9, v2, v5

    add-int v10, v6, v4

    add-int v11, v2, v5

    invoke-virtual {v7, v8, v9, v10, v11}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 116
    iget-object v7, p0, Lcom/roidapp/imagelib/crop/h;->l:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v7, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 118
    iget-object v7, p0, Lcom/roidapp/imagelib/crop/h;->l:Landroid/graphics/drawable/Drawable;

    sub-int v8, v6, v4

    sub-int v9, v3, v5

    add-int/2addr v6, v4

    add-int v10, v3, v5

    invoke-virtual {v7, v8, v9, v6, v10}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 120
    iget-object v6, p0, Lcom/roidapp/imagelib/crop/h;->l:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v6, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 123
    iget-object v6, p0, Lcom/roidapp/imagelib/crop/h;->l:Landroid/graphics/drawable/Drawable;

    sub-int v7, v0, v4

    sub-int v8, v2, v5

    add-int v9, v0, v4

    add-int v10, v2, v5

    invoke-virtual {v6, v7, v8, v9, v10}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 125
    iget-object v6, p0, Lcom/roidapp/imagelib/crop/h;->l:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v6, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 127
    iget-object v6, p0, Lcom/roidapp/imagelib/crop/h;->l:Landroid/graphics/drawable/Drawable;

    sub-int v7, v1, v4

    sub-int v8, v2, v5

    add-int v9, v1, v4

    add-int/2addr v2, v5

    invoke-virtual {v6, v7, v8, v9, v2}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 129
    iget-object v2, p0, Lcom/roidapp/imagelib/crop/h;->l:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v2, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 131
    iget-object v2, p0, Lcom/roidapp/imagelib/crop/h;->l:Landroid/graphics/drawable/Drawable;

    sub-int v6, v0, v4

    sub-int v7, v3, v5

    add-int/2addr v0, v4

    add-int v8, v3, v5

    invoke-virtual {v2, v6, v7, v0, v8}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 133
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/h;->l:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 135
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/h;->l:Landroid/graphics/drawable/Drawable;

    sub-int v2, v1, v4

    sub-int v6, v3, v5

    add-int/2addr v1, v4

    add-int/2addr v3, v5

    invoke-virtual {v0, v2, v6, v1, v3}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 137
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/h;->l:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    goto/16 :goto_0
.end method

.method public final a(Landroid/graphics/Matrix;Landroid/graphics/Rect;Landroid/graphics/RectF;ZZ)V
    .locals 5

    .prologue
    const/16 v4, 0x7d

    const/4 v0, 0x1

    const/16 v3, 0x32

    .line 383
    if-eqz p4, :cond_0

    move p5, v0

    .line 386
    :cond_0
    new-instance v1, Landroid/graphics/Matrix;

    invoke-direct {v1, p1}, Landroid/graphics/Matrix;-><init>(Landroid/graphics/Matrix;)V

    iput-object v1, p0, Lcom/roidapp/imagelib/crop/h;->f:Landroid/graphics/Matrix;

    .line 388
    iput-object p3, p0, Lcom/roidapp/imagelib/crop/h;->e:Landroid/graphics/RectF;

    .line 389
    new-instance v1, Landroid/graphics/RectF;

    invoke-direct {v1, p2}, Landroid/graphics/RectF;-><init>(Landroid/graphics/Rect;)V

    iput-object v1, p0, Lcom/roidapp/imagelib/crop/h;->h:Landroid/graphics/RectF;

    .line 390
    iput-boolean p5, p0, Lcom/roidapp/imagelib/crop/h;->i:Z

    .line 391
    iput-boolean p4, p0, Lcom/roidapp/imagelib/crop/h;->k:Z

    .line 393
    iget-object v1, p0, Lcom/roidapp/imagelib/crop/h;->e:Landroid/graphics/RectF;

    invoke-virtual {v1}, Landroid/graphics/RectF;->width()F

    move-result v1

    iget-object v2, p0, Lcom/roidapp/imagelib/crop/h;->e:Landroid/graphics/RectF;

    invoke-virtual {v2}, Landroid/graphics/RectF;->height()F

    move-result v2

    div-float/2addr v1, v2

    iput v1, p0, Lcom/roidapp/imagelib/crop/h;->j:F

    .line 394
    invoke-direct {p0}, Lcom/roidapp/imagelib/crop/h;->c()Landroid/graphics/Rect;

    move-result-object v1

    iput-object v1, p0, Lcom/roidapp/imagelib/crop/h;->d:Landroid/graphics/Rect;

    .line 396
    iget-object v1, p0, Lcom/roidapp/imagelib/crop/h;->m:Landroid/graphics/Paint;

    invoke-virtual {v1, v4, v3, v3, v3}, Landroid/graphics/Paint;->setARGB(IIII)V

    .line 397
    iget-object v1, p0, Lcom/roidapp/imagelib/crop/h;->n:Landroid/graphics/Paint;

    invoke-virtual {v1, v4, v3, v3, v3}, Landroid/graphics/Paint;->setARGB(IIII)V

    .line 398
    iget-object v1, p0, Lcom/roidapp/imagelib/crop/h;->o:Landroid/graphics/Paint;

    const/high16 v2, 0x40400000    # 3.0f

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 399
    iget-object v1, p0, Lcom/roidapp/imagelib/crop/h;->o:Landroid/graphics/Paint;

    sget-object v2, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 400
    iget-object v1, p0, Lcom/roidapp/imagelib/crop/h;->o:Landroid/graphics/Paint;

    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 402
    sget v0, Lcom/roidapp/imagelib/crop/i;->a:I

    iput v0, p0, Lcom/roidapp/imagelib/crop/h;->g:I

    .line 3034
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/h;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    .line 3035
    sget v1, Lcom/roidapp/imagelib/f;->at:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/imagelib/crop/h;->l:Landroid/graphics/drawable/Drawable;

    .line 404
    return-void
.end method

.method public final b()V
    .locals 1

    .prologue
    .line 379
    invoke-direct {p0}, Lcom/roidapp/imagelib/crop/h;->c()Landroid/graphics/Rect;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/imagelib/crop/h;->d:Landroid/graphics/Rect;

    .line 380
    return-void
.end method
