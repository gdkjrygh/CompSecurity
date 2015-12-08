.class public final Lcom/roidapp/photogrid/release/ps;
.super Lcom/roidapp/photogrid/release/ao;
.source "SourceFile"


# instance fields
.field public G:Landroid/graphics/Bitmap;

.field public H:Lcom/roidapp/photogrid/release/ig;

.field public I:Lcom/roidapp/photogrid/release/lc;

.field public J:Z

.field public K:I

.field public L:F

.field public M:F

.field public N:F

.field public O:F

.field public P:F

.field public Q:F

.field public R:F

.field public S:F

.field private T:[F

.field private U:Landroid/graphics/Paint;

.field private V:Landroid/graphics/drawable/NinePatchDrawable;

.field private W:Z

.field private X:Landroid/graphics/RectF;

.field private Y:Landroid/graphics/RectF;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 9

    .prologue
    const/high16 v8, 0x40400000    # 3.0f

    const-wide/high16 v6, 0x3ff8000000000000L    # 1.5

    const/high16 v5, 0x40000000    # 2.0f

    const/4 v4, 0x1

    const/high16 v2, 0x3f800000    # 1.0f

    .line 37
    invoke-direct {p0, p1}, Lcom/roidapp/photogrid/release/ao;-><init>(Landroid/content/Context;)V

    .line 20
    iput v4, p0, Lcom/roidapp/photogrid/release/ps;->K:I

    .line 23
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ps;->V:Landroid/graphics/drawable/NinePatchDrawable;

    .line 32
    iput v2, p0, Lcom/roidapp/photogrid/release/ps;->P:F

    .line 33
    iput v2, p0, Lcom/roidapp/photogrid/release/ps;->Q:F

    .line 38
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    move-result-object v0

    .line 1083
    iget v0, v0, Lcom/roidapp/photogrid/release/rf;->a:F

    .line 2076
    iput v2, p0, Lcom/roidapp/photogrid/release/ps;->i:F

    .line 2077
    cmpl-float v1, v0, v2

    if-nez v1, :cond_0

    .line 2078
    iput v2, p0, Lcom/roidapp/photogrid/release/ps;->i:F

    .line 2080
    :cond_0
    cmpl-float v1, v0, v2

    if-lez v1, :cond_1

    float-to-double v2, v0

    cmpg-double v1, v2, v6

    if-gtz v1, :cond_1

    .line 2081
    const/high16 v1, 0x3fc00000    # 1.5f

    iput v1, p0, Lcom/roidapp/photogrid/release/ps;->i:F

    .line 2083
    :cond_1
    float-to-double v2, v0

    cmpl-double v1, v2, v6

    if-lez v1, :cond_2

    cmpg-float v1, v0, v5

    if-gtz v1, :cond_2

    .line 2084
    iput v5, p0, Lcom/roidapp/photogrid/release/ps;->i:F

    .line 2086
    :cond_2
    cmpl-float v1, v0, v5

    if-lez v1, :cond_3

    cmpg-float v0, v0, v8

    if-gtz v0, :cond_3

    .line 2087
    iput v8, p0, Lcom/roidapp/photogrid/release/ps;->i:F

    .line 39
    :cond_3
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->densityDpi:I

    .line 40
    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/roidapp/photogrid/release/ps;->a(IZ)V

    .line 41
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ps;->U:Landroid/graphics/Paint;

    .line 42
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ps;->U:Landroid/graphics/Paint;

    invoke-virtual {v0, v4}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 43
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ps;->U:Landroid/graphics/Paint;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 44
    const/high16 v0, 0x40800000    # 4.0f

    iget v1, p0, Lcom/roidapp/photogrid/release/ps;->i:F

    mul-float/2addr v0, v1

    .line 45
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ps;->U:Landroid/graphics/Paint;

    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 46
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ps;->U:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 47
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ps;->U:Landroid/graphics/Paint;

    invoke-virtual {v0, v4}, Landroid/graphics/Paint;->setDither(Z)V

    .line 50
    iput-boolean v4, p0, Lcom/roidapp/photogrid/release/ps;->W:Z

    .line 51
    return-void
.end method

.method private static a(Landroid/graphics/RectF;)Landroid/graphics/Rect;
    .locals 5

    .prologue
    .line 180
    new-instance v0, Landroid/graphics/Rect;

    iget v1, p0, Landroid/graphics/RectF;->left:F

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    iget v2, p0, Landroid/graphics/RectF;->top:F

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v2

    iget v3, p0, Landroid/graphics/RectF;->right:F

    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    move-result v3

    iget v4, p0, Landroid/graphics/RectF;->bottom:F

    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    move-result v4

    invoke-direct {v0, v1, v2, v3, v4}, Landroid/graphics/Rect;-><init>(IIII)V

    return-object v0
.end method


# virtual methods
.method public final synthetic a(Landroid/content/Context;)Lcom/roidapp/photogrid/release/ao;
    .locals 2

    .prologue
    .line 14
    .line 5430
    new-instance v0, Lcom/roidapp/photogrid/release/ps;

    invoke-direct {v0, p1}, Lcom/roidapp/photogrid/release/ps;-><init>(Landroid/content/Context;)V

    .line 5431
    new-instance v1, Landroid/graphics/Matrix;

    invoke-direct {v1}, Landroid/graphics/Matrix;-><init>()V

    iput-object v1, v0, Lcom/roidapp/photogrid/release/ps;->b:Landroid/graphics/Matrix;

    .line 5432
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ps;->g:Ljava/lang/String;

    iput-object v1, v0, Lcom/roidapp/photogrid/release/ps;->g:Ljava/lang/String;

    .line 5433
    iget v1, p0, Lcom/roidapp/photogrid/release/ps;->j:F

    iput v1, v0, Lcom/roidapp/photogrid/release/ps;->j:F

    .line 5434
    iget v1, p0, Lcom/roidapp/photogrid/release/ps;->k:F

    iput v1, v0, Lcom/roidapp/photogrid/release/ps;->k:F

    .line 5435
    iget v1, p0, Lcom/roidapp/photogrid/release/ps;->K:I

    iput v1, v0, Lcom/roidapp/photogrid/release/ps;->K:I

    .line 5436
    iget v1, p0, Lcom/roidapp/photogrid/release/ps;->l:F

    iput v1, v0, Lcom/roidapp/photogrid/release/ps;->l:F

    .line 5437
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ps;->d()I

    move-result v1

    iput v1, v0, Lcom/roidapp/photogrid/release/ps;->p:I

    .line 5438
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ps;->c()I

    move-result v1

    iput v1, v0, Lcom/roidapp/photogrid/release/ps;->q:I

    .line 5439
    iget v1, p0, Lcom/roidapp/photogrid/release/ps;->h:F

    iput v1, v0, Lcom/roidapp/photogrid/release/ps;->h:F

    .line 5440
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ps;->e()[F

    move-result-object v1

    iput-object v1, v0, Lcom/roidapp/photogrid/release/ps;->r:[F

    .line 5441
    iget v1, p0, Lcom/roidapp/photogrid/release/ps;->s:I

    iput v1, v0, Lcom/roidapp/photogrid/release/ps;->s:I

    .line 5442
    iget v1, p0, Lcom/roidapp/photogrid/release/ps;->t:I

    iput v1, v0, Lcom/roidapp/photogrid/release/ps;->t:I

    .line 5443
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ps;->H:Lcom/roidapp/photogrid/release/ig;

    iput-object v1, v0, Lcom/roidapp/photogrid/release/ps;->H:Lcom/roidapp/photogrid/release/ig;

    .line 5444
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ps;->I:Lcom/roidapp/photogrid/release/lc;

    iput-object v1, v0, Lcom/roidapp/photogrid/release/ps;->I:Lcom/roidapp/photogrid/release/lc;

    .line 5445
    iget v1, p0, Lcom/roidapp/photogrid/release/ps;->u:F

    iput v1, v0, Lcom/roidapp/photogrid/release/ps;->u:F

    .line 5446
    iget-boolean v1, p0, Lcom/roidapp/photogrid/release/ps;->W:Z

    iput-boolean v1, v0, Lcom/roidapp/photogrid/release/ps;->W:Z

    .line 5447
    iget v1, p0, Lcom/roidapp/photogrid/release/ps;->M:F

    iput v1, v0, Lcom/roidapp/photogrid/release/ps;->M:F

    .line 5448
    iget v1, p0, Lcom/roidapp/photogrid/release/ps;->L:F

    iput v1, v0, Lcom/roidapp/photogrid/release/ps;->L:F

    .line 5449
    iget v1, p0, Lcom/roidapp/photogrid/release/ps;->N:F

    iput v1, v0, Lcom/roidapp/photogrid/release/ps;->N:F

    .line 5450
    iget v1, p0, Lcom/roidapp/photogrid/release/ps;->O:F

    iput v1, v0, Lcom/roidapp/photogrid/release/ps;->O:F

    .line 14
    return-object v0
.end method

.method public final a()V
    .locals 0

    .prologue
    .line 427
    return-void
.end method

.method public final a(IZ)V
    .locals 5

    .prologue
    const/high16 v4, 0x40800000    # 4.0f

    const/high16 v3, 0x40000000    # 2.0f

    const/high16 v2, -0x3f800000    # -4.0f

    const/high16 v1, -0x3fc00000    # -3.0f

    .line 94
    if-eqz p2, :cond_0

    .line 95
    iget v0, p0, Lcom/roidapp/photogrid/release/ps;->P:F

    mul-float/2addr v0, v4

    div-float/2addr v0, v3

    .line 98
    :goto_0
    sparse-switch p1, :sswitch_data_0

    .line 100
    iput v1, p0, Lcom/roidapp/photogrid/release/ps;->L:F

    .line 118
    :goto_1
    iget v1, p0, Lcom/roidapp/photogrid/release/ps;->L:F

    float-to-double v2, v1

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->floor(D)D

    move-result-wide v0

    sub-double v0, v2, v0

    double-to-int v0, v0

    int-to-float v0, v0

    iput v0, p0, Lcom/roidapp/photogrid/release/ps;->M:F

    .line 119
    return-void

    .line 97
    :cond_0
    iget v0, p0, Lcom/roidapp/photogrid/release/ps;->i:F

    mul-float/2addr v0, v4

    div-float/2addr v0, v3

    goto :goto_0

    .line 103
    :sswitch_0
    const/high16 v1, -0x40800000    # -1.0f

    iput v1, p0, Lcom/roidapp/photogrid/release/ps;->L:F

    goto :goto_1

    .line 106
    :sswitch_1
    const/high16 v1, -0x40000000    # -2.0f

    iput v1, p0, Lcom/roidapp/photogrid/release/ps;->L:F

    goto :goto_1

    .line 109
    :sswitch_2
    iput v1, p0, Lcom/roidapp/photogrid/release/ps;->L:F

    goto :goto_1

    .line 112
    :sswitch_3
    iput v2, p0, Lcom/roidapp/photogrid/release/ps;->L:F

    goto :goto_1

    .line 115
    :sswitch_4
    iput v2, p0, Lcom/roidapp/photogrid/release/ps;->L:F

    goto :goto_1

    .line 98
    :sswitch_data_0
    .sparse-switch
        0x78 -> :sswitch_0
        0xa0 -> :sswitch_1
        0xf0 -> :sswitch_2
        0x140 -> :sswitch_3
        0x1e0 -> :sswitch_4
    .end sparse-switch
.end method

.method public final a(Landroid/graphics/Bitmap;Z)V
    .locals 12

    .prologue
    const/16 v11, 0x9

    const/4 v10, 0x2

    const/4 v7, 0x0

    const/high16 v9, 0x40000000    # 2.0f

    const/4 v8, 0x0

    .line 302
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 321
    :cond_0
    :goto_0
    return-void

    .line 306
    :cond_1
    iput-object p1, p0, Lcom/roidapp/photogrid/release/ps;->G:Landroid/graphics/Bitmap;

    .line 3184
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ps;->G:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    .line 3185
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ps;->G:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v3

    .line 3188
    const/high16 v0, 0x40800000    # 4.0f

    iget v1, p0, Lcom/roidapp/photogrid/release/ps;->i:F

    mul-float/2addr v0, v1

    div-float/2addr v0, v9

    .line 3190
    new-instance v4, Landroid/graphics/RectF;

    int-to-float v1, v2

    int-to-float v5, v3

    invoke-direct {v4, v8, v8, v1, v5}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 3192
    const/16 v1, 0x10

    new-array v1, v1, [F

    .line 3193
    iget v5, v4, Landroid/graphics/RectF;->left:F

    sub-float/2addr v5, v0

    aput v5, v1, v7

    .line 3194
    const/4 v5, 0x1

    iget v6, v4, Landroid/graphics/RectF;->top:F

    aput v6, v1, v5

    .line 3195
    iget v5, v4, Landroid/graphics/RectF;->right:F

    add-float/2addr v5, v0

    aput v5, v1, v10

    .line 3196
    const/4 v5, 0x3

    iget v6, v4, Landroid/graphics/RectF;->top:F

    aput v6, v1, v5

    .line 3197
    const/4 v5, 0x4

    iget v6, v4, Landroid/graphics/RectF;->left:F

    sub-float/2addr v6, v0

    aput v6, v1, v5

    .line 3198
    const/4 v5, 0x5

    iget v6, v4, Landroid/graphics/RectF;->bottom:F

    aput v6, v1, v5

    .line 3199
    const/4 v5, 0x6

    iget v6, v4, Landroid/graphics/RectF;->right:F

    add-float/2addr v0, v6

    aput v0, v1, v5

    .line 3200
    const/4 v0, 0x7

    iget v5, v4, Landroid/graphics/RectF;->bottom:F

    aput v5, v1, v0

    .line 3201
    const/16 v0, 0x8

    iget v5, v4, Landroid/graphics/RectF;->left:F

    aput v5, v1, v0

    .line 3202
    iget v0, v4, Landroid/graphics/RectF;->top:F

    aput v0, v1, v11

    .line 3203
    const/16 v0, 0xa

    iget v5, v4, Landroid/graphics/RectF;->left:F

    aput v5, v1, v0

    .line 3204
    const/16 v0, 0xb

    iget v5, v4, Landroid/graphics/RectF;->bottom:F

    aput v5, v1, v0

    .line 3205
    const/16 v0, 0xc

    iget v5, v4, Landroid/graphics/RectF;->right:F

    aput v5, v1, v0

    .line 3206
    const/16 v0, 0xd

    iget v5, v4, Landroid/graphics/RectF;->top:F

    aput v5, v1, v0

    .line 3207
    const/16 v0, 0xe

    iget v5, v4, Landroid/graphics/RectF;->right:F

    aput v5, v1, v0

    .line 3208
    const/16 v0, 0xf

    iget v5, v4, Landroid/graphics/RectF;->bottom:F

    aput v5, v1, v0

    move-object v0, v1

    .line 3209
    check-cast v0, [F

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ps;->T:[F

    .line 3211
    aget v0, v1, v10

    aget v5, v1, v7

    sub-float v5, v0, v5

    .line 3212
    const/16 v0, 0xb

    aget v0, v1, v0

    aget v1, v1, v11

    sub-float v1, v0, v1

    .line 3214
    const/16 v0, 0x12

    new-array v0, v0, [F

    aput v8, v0, v7

    const/4 v6, 0x1

    aput v8, v0, v6

    div-float v6, v5, v9

    aput v6, v0, v10

    const/4 v6, 0x3

    aput v8, v0, v6

    const/4 v6, 0x4

    aput v5, v0, v6

    const/4 v6, 0x5

    aput v8, v0, v6

    const/4 v6, 0x6

    aput v5, v0, v6

    const/4 v6, 0x7

    div-float v7, v1, v9

    aput v7, v0, v6

    const/16 v6, 0x8

    aput v5, v0, v6

    aput v1, v0, v11

    const/16 v6, 0xa

    div-float v7, v5, v9

    aput v7, v0, v6

    const/16 v6, 0xb

    aput v1, v0, v6

    const/16 v6, 0xc

    aput v8, v0, v6

    const/16 v6, 0xd

    aput v1, v0, v6

    const/16 v6, 0xe

    aput v8, v0, v6

    const/16 v6, 0xf

    div-float v7, v1, v9

    aput v7, v0, v6

    const/16 v6, 0x10

    div-float v7, v5, v9

    aput v7, v0, v6

    const/16 v6, 0x11

    div-float v7, v1, v9

    aput v7, v0, v6

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ps;->n:[F

    .line 3218
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ps;->n:[F

    invoke-virtual {v0}, [F->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [F

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ps;->o:[F

    .line 3220
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/ps;->J:Z

    if-eqz v0, :cond_6

    .line 3221
    new-instance v0, Landroid/graphics/RectF;

    iget v2, p0, Lcom/roidapp/photogrid/release/ps;->N:F

    iget v3, p0, Lcom/roidapp/photogrid/release/ps;->O:F

    invoke-direct {v0, v8, v8, v2, v3}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 3222
    iget-boolean v2, p0, Lcom/roidapp/photogrid/release/ps;->W:Z

    if-eqz v2, :cond_5

    .line 3223
    iget v2, p0, Lcom/roidapp/photogrid/release/ps;->M:F

    iget v3, p0, Lcom/roidapp/photogrid/release/ps;->M:F

    invoke-virtual {v0, v2, v3}, Landroid/graphics/RectF;->inset(FF)V

    .line 3226
    :goto_1
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ps;->V:Landroid/graphics/drawable/NinePatchDrawable;

    if-eqz v2, :cond_2

    .line 3227
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ps;->V:Landroid/graphics/drawable/NinePatchDrawable;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ps;->a(Landroid/graphics/RectF;)Landroid/graphics/Rect;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/graphics/drawable/NinePatchDrawable;->setBounds(Landroid/graphics/Rect;)V

    .line 3229
    :cond_2
    const/high16 v0, 0x40800000    # 4.0f

    iget v2, p0, Lcom/roidapp/photogrid/release/ps;->P:F

    mul-float/2addr v0, v2

    div-float/2addr v0, v9

    .line 3230
    iget v2, p0, Lcom/roidapp/photogrid/release/ps;->N:F

    mul-float/2addr v0, v9

    add-float/2addr v0, v2

    .line 3231
    iget v2, p0, Lcom/roidapp/photogrid/release/ps;->O:F

    .line 3232
    new-instance v3, Landroid/graphics/RectF;

    invoke-direct {v3, v8, v8, v0, v2}, Landroid/graphics/RectF;-><init>(FFFF)V

    iput-object v3, p0, Lcom/roidapp/photogrid/release/ps;->Y:Landroid/graphics/RectF;

    .line 3245
    :cond_3
    :goto_2
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0, v8, v8, v5, v1}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 310
    iput-object v0, p0, Lcom/roidapp/photogrid/release/ps;->X:Landroid/graphics/RectF;

    .line 312
    if-eqz p2, :cond_4

    .line 313
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ps;->I:Lcom/roidapp/photogrid/release/lc;

    iget v0, v0, Lcom/roidapp/photogrid/release/lc;->j:F

    iget v1, p0, Lcom/roidapp/photogrid/release/ps;->c:I

    int-to-float v1, v1

    mul-float/2addr v0, v1

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ps;->Y:Landroid/graphics/RectF;

    invoke-virtual {v1}, Landroid/graphics/RectF;->width()F

    move-result v1

    div-float/2addr v1, v9

    sub-float/2addr v0, v1

    iput v0, p0, Lcom/roidapp/photogrid/release/ps;->R:F

    .line 314
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ps;->I:Lcom/roidapp/photogrid/release/lc;

    iget v0, v0, Lcom/roidapp/photogrid/release/lc;->k:F

    iget v1, p0, Lcom/roidapp/photogrid/release/ps;->d:I

    int-to-float v1, v1

    mul-float/2addr v0, v1

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ps;->Y:Landroid/graphics/RectF;

    invoke-virtual {v1}, Landroid/graphics/RectF;->height()F

    move-result v1

    div-float/2addr v1, v9

    sub-float/2addr v0, v1

    iput v0, p0, Lcom/roidapp/photogrid/release/ps;->S:F

    .line 317
    :cond_4
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ps;->I:Lcom/roidapp/photogrid/release/lc;

    iget v0, v0, Lcom/roidapp/photogrid/release/lc;->j:F

    iget v1, p0, Lcom/roidapp/photogrid/release/ps;->c:I

    int-to-float v1, v1

    mul-float/2addr v0, v1

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ps;->X:Landroid/graphics/RectF;

    invoke-virtual {v1}, Landroid/graphics/RectF;->width()F

    move-result v1

    div-float/2addr v1, v9

    sub-float/2addr v0, v1

    iput v0, p0, Lcom/roidapp/photogrid/release/ps;->v:F

    .line 318
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ps;->I:Lcom/roidapp/photogrid/release/lc;

    iget v0, v0, Lcom/roidapp/photogrid/release/lc;->k:F

    iget v1, p0, Lcom/roidapp/photogrid/release/ps;->d:I

    int-to-float v1, v1

    mul-float/2addr v0, v1

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ps;->X:Landroid/graphics/RectF;

    invoke-virtual {v1}, Landroid/graphics/RectF;->height()F

    move-result v1

    div-float/2addr v1, v9

    sub-float/2addr v0, v1

    iput v0, p0, Lcom/roidapp/photogrid/release/ps;->w:F

    goto/16 :goto_0

    .line 3225
    :cond_5
    iget v2, p0, Lcom/roidapp/photogrid/release/ps;->L:F

    iget v3, p0, Lcom/roidapp/photogrid/release/ps;->L:F

    invoke-virtual {v0, v2, v3}, Landroid/graphics/RectF;->inset(FF)V

    goto :goto_1

    .line 3235
    :cond_6
    int-to-float v0, v2

    iput v0, p0, Lcom/roidapp/photogrid/release/ps;->N:F

    .line 3236
    int-to-float v0, v3

    iput v0, p0, Lcom/roidapp/photogrid/release/ps;->O:F

    .line 3237
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/ps;->W:Z

    if-eqz v0, :cond_7

    .line 3238
    iget v0, p0, Lcom/roidapp/photogrid/release/ps;->M:F

    iget v2, p0, Lcom/roidapp/photogrid/release/ps;->M:F

    invoke-virtual {v4, v0, v2}, Landroid/graphics/RectF;->inset(FF)V

    .line 3241
    :goto_3
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ps;->V:Landroid/graphics/drawable/NinePatchDrawable;

    if-eqz v0, :cond_3

    .line 3242
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ps;->V:Landroid/graphics/drawable/NinePatchDrawable;

    invoke-static {v4}, Lcom/roidapp/photogrid/release/ps;->a(Landroid/graphics/RectF;)Landroid/graphics/Rect;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/graphics/drawable/NinePatchDrawable;->setBounds(Landroid/graphics/Rect;)V

    goto :goto_2

    .line 3240
    :cond_7
    iget v0, p0, Lcom/roidapp/photogrid/release/ps;->L:F

    iget v2, p0, Lcom/roidapp/photogrid/release/ps;->L:F

    invoke-virtual {v4, v0, v2}, Landroid/graphics/RectF;->inset(FF)V

    goto :goto_3
.end method

.method public final a(Landroid/graphics/Canvas;)V
    .locals 11

    .prologue
    const/16 v7, 0x10

    const/4 v2, 0x1

    const/high16 v10, 0x40000000    # 2.0f

    const/4 v1, 0x0

    const/4 v9, 0x0

    .line 339
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ps;->X:Landroid/graphics/RectF;

    if-nez v0, :cond_0

    .line 381
    :goto_0
    return-void

    .line 342
    :cond_0
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 343
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ps;->b:Landroid/graphics/Matrix;

    invoke-virtual {v0}, Landroid/graphics/Matrix;->reset()V

    .line 344
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/ps;->J:Z

    if-nez v0, :cond_1

    .line 345
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ps;->b:Landroid/graphics/Matrix;

    iget v3, p0, Lcom/roidapp/photogrid/release/ps;->h:F

    iget v4, p0, Lcom/roidapp/photogrid/release/ps;->h:F

    iget-object v5, p0, Lcom/roidapp/photogrid/release/ps;->X:Landroid/graphics/RectF;

    invoke-virtual {v5}, Landroid/graphics/RectF;->width()F

    move-result v5

    div-float/2addr v5, v10

    iget-object v6, p0, Lcom/roidapp/photogrid/release/ps;->X:Landroid/graphics/RectF;

    invoke-virtual {v6}, Landroid/graphics/RectF;->height()F

    move-result v6

    div-float/2addr v6, v10

    invoke-virtual {v0, v3, v4, v5, v6}, Landroid/graphics/Matrix;->postScale(FFFF)Z

    .line 347
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ps;->b:Landroid/graphics/Matrix;

    iget v3, p0, Lcom/roidapp/photogrid/release/ps;->K:I

    int-to-float v3, v3

    const/high16 v4, 0x3f800000    # 1.0f

    iget-object v5, p0, Lcom/roidapp/photogrid/release/ps;->X:Landroid/graphics/RectF;

    invoke-virtual {v5}, Landroid/graphics/RectF;->width()F

    move-result v5

    div-float/2addr v5, v10

    iget-object v6, p0, Lcom/roidapp/photogrid/release/ps;->X:Landroid/graphics/RectF;

    invoke-virtual {v6}, Landroid/graphics/RectF;->height()F

    move-result v6

    div-float/2addr v6, v10

    invoke-virtual {v0, v3, v4, v5, v6}, Landroid/graphics/Matrix;->postScale(FFFF)Z

    .line 348
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ps;->b:Landroid/graphics/Matrix;

    iget v3, p0, Lcom/roidapp/photogrid/release/ps;->l:F

    iget-object v4, p0, Lcom/roidapp/photogrid/release/ps;->X:Landroid/graphics/RectF;

    invoke-virtual {v4}, Landroid/graphics/RectF;->width()F

    move-result v4

    div-float/2addr v4, v10

    iget-object v5, p0, Lcom/roidapp/photogrid/release/ps;->X:Landroid/graphics/RectF;

    invoke-virtual {v5}, Landroid/graphics/RectF;->height()F

    move-result v5

    div-float/2addr v5, v10

    invoke-virtual {v0, v3, v4, v5}, Landroid/graphics/Matrix;->postRotate(FFF)Z

    .line 349
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ps;->b:Landroid/graphics/Matrix;

    iget v3, p0, Lcom/roidapp/photogrid/release/ps;->j:F

    iget v4, p0, Lcom/roidapp/photogrid/release/ps;->v:F

    add-float/2addr v3, v4

    iget v4, p0, Lcom/roidapp/photogrid/release/ps;->k:F

    iget v5, p0, Lcom/roidapp/photogrid/release/ps;->w:F

    add-float/2addr v4, v5

    invoke-virtual {v0, v3, v4}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 350
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ps;->b:Landroid/graphics/Matrix;

    iget-object v3, p0, Lcom/roidapp/photogrid/release/ps;->o:[F

    iget-object v4, p0, Lcom/roidapp/photogrid/release/ps;->n:[F

    invoke-virtual {v0, v3, v4}, Landroid/graphics/Matrix;->mapPoints([F[F)V

    .line 353
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ps;->o:[F

    .line 3474
    aget v3, v0, v7

    cmpl-float v3, v3, v9

    if-lez v3, :cond_7

    aget v3, v0, v7

    iget v4, p0, Lcom/roidapp/photogrid/release/ps;->c:I

    int-to-float v4, v4

    cmpg-float v3, v3, v4

    if-gez v3, :cond_7

    const/16 v3, 0x11

    aget v3, v0, v3

    cmpl-float v3, v3, v9

    if-lez v3, :cond_7

    const/16 v3, 0x11

    aget v3, v0, v3

    iget v4, p0, Lcom/roidapp/photogrid/release/ps;->d:I

    int-to-float v4, v4

    cmpg-float v3, v3, v4

    if-gez v3, :cond_7

    move v0, v1

    .line 353
    :goto_1
    if-eqz v0, :cond_10

    .line 354
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/ps;->B:Z

    if-nez v0, :cond_2

    .line 355
    iput-boolean v2, p0, Lcom/roidapp/photogrid/release/ps;->C:Z

    .line 4460
    iget v0, p0, Lcom/roidapp/photogrid/release/ps;->j:F

    float-to-int v0, v0

    iput v0, p0, Lcom/roidapp/photogrid/release/ps;->D:I

    .line 4461
    iget v0, p0, Lcom/roidapp/photogrid/release/ps;->k:F

    float-to-int v0, v0

    iput v0, p0, Lcom/roidapp/photogrid/release/ps;->E:I

    .line 357
    iput-boolean v2, p0, Lcom/roidapp/photogrid/release/ps;->B:Z

    .line 364
    :cond_2
    :goto_2
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/ps;->J:Z

    if-eqz v0, :cond_11

    .line 5325
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ps;->V:Landroid/graphics/drawable/NinePatchDrawable;

    if-eqz v0, :cond_3

    .line 5326
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 5327
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 5328
    iget v1, p0, Lcom/roidapp/photogrid/release/ps;->Q:F

    iget v2, p0, Lcom/roidapp/photogrid/release/ps;->Q:F

    iget-object v3, p0, Lcom/roidapp/photogrid/release/ps;->Y:Landroid/graphics/RectF;

    invoke-virtual {v3}, Landroid/graphics/RectF;->width()F

    move-result v3

    div-float/2addr v3, v10

    iget-object v4, p0, Lcom/roidapp/photogrid/release/ps;->Y:Landroid/graphics/RectF;

    invoke-virtual {v4}, Landroid/graphics/RectF;->height()F

    move-result v4

    div-float/2addr v4, v10

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/graphics/Matrix;->postScale(FFFF)Z

    .line 5329
    iget v1, p0, Lcom/roidapp/photogrid/release/ps;->K:I

    int-to-float v1, v1

    const/high16 v2, 0x3f800000    # 1.0f

    iget-object v3, p0, Lcom/roidapp/photogrid/release/ps;->Y:Landroid/graphics/RectF;

    invoke-virtual {v3}, Landroid/graphics/RectF;->width()F

    move-result v3

    div-float/2addr v3, v10

    iget-object v4, p0, Lcom/roidapp/photogrid/release/ps;->Y:Landroid/graphics/RectF;

    invoke-virtual {v4}, Landroid/graphics/RectF;->height()F

    move-result v4

    div-float/2addr v4, v10

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/graphics/Matrix;->postScale(FFFF)Z

    .line 5330
    iget v1, p0, Lcom/roidapp/photogrid/release/ps;->l:F

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ps;->Y:Landroid/graphics/RectF;

    invoke-virtual {v2}, Landroid/graphics/RectF;->width()F

    move-result v2

    div-float/2addr v2, v10

    iget-object v3, p0, Lcom/roidapp/photogrid/release/ps;->Y:Landroid/graphics/RectF;

    invoke-virtual {v3}, Landroid/graphics/RectF;->height()F

    move-result v3

    div-float/2addr v3, v10

    invoke-virtual {v0, v1, v2, v3}, Landroid/graphics/Matrix;->postRotate(FFF)Z

    .line 5331
    iget v1, p0, Lcom/roidapp/photogrid/release/ps;->j:F

    iget v2, p0, Lcom/roidapp/photogrid/release/ps;->R:F

    add-float/2addr v1, v2

    iget v2, p0, Lcom/roidapp/photogrid/release/ps;->k:F

    iget v3, p0, Lcom/roidapp/photogrid/release/ps;->S:F

    add-float/2addr v2, v3

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 5332
    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 5333
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ps;->V:Landroid/graphics/drawable/NinePatchDrawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/NinePatchDrawable;->draw(Landroid/graphics/Canvas;)V

    .line 5334
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 367
    :cond_3
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->setMatrix(Landroid/graphics/Matrix;)V

    .line 368
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ps;->b:Landroid/graphics/Matrix;

    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 375
    :cond_4
    :goto_3
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ps;->G:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/roidapp/photogrid/release/ps;->G:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_5

    .line 376
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ps;->G:Landroid/graphics/Bitmap;

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v9, v9, v1}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 378
    :cond_5
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/ps;->W:Z

    if-eqz v0, :cond_6

    .line 379
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ps;->T:[F

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ps;->U:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawLines([FLandroid/graphics/Paint;)V

    .line 380
    :cond_6
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    goto/16 :goto_0

    .line 3479
    :cond_7
    const/16 v3, 0x12

    new-array v3, v3, [F

    .line 3480
    iget-object v4, p0, Lcom/roidapp/photogrid/release/ps;->F:Landroid/graphics/Matrix;

    invoke-virtual {v4}, Landroid/graphics/Matrix;->reset()V

    .line 3502
    iget-object v4, p0, Lcom/roidapp/photogrid/release/ps;->F:Landroid/graphics/Matrix;

    const/high16 v5, 0x3f400000    # 0.75f

    const/high16 v6, 0x3f400000    # 0.75f

    aget v7, v0, v7

    const/16 v8, 0x11

    aget v8, v0, v8

    invoke-virtual {v4, v5, v6, v7, v8}, Landroid/graphics/Matrix;->postScale(FFFF)Z

    .line 3503
    iget-object v4, p0, Lcom/roidapp/photogrid/release/ps;->F:Landroid/graphics/Matrix;

    invoke-virtual {v4, v3, v0}, Landroid/graphics/Matrix;->mapPoints([F[F)V

    .line 3505
    aget v0, v3, v1

    cmpl-float v0, v0, v9

    if-lez v0, :cond_8

    aget v0, v3, v1

    iget v4, p0, Lcom/roidapp/photogrid/release/ps;->c:I

    int-to-float v4, v4

    cmpg-float v0, v0, v4

    if-gez v0, :cond_8

    aget v0, v3, v2

    cmpl-float v0, v0, v9

    if-lez v0, :cond_8

    aget v0, v3, v2

    iget v4, p0, Lcom/roidapp/photogrid/release/ps;->d:I

    int-to-float v4, v4

    cmpg-float v0, v0, v4

    if-gez v0, :cond_8

    move v0, v1

    .line 3506
    goto/16 :goto_1

    .line 3507
    :cond_8
    const/4 v0, 0x2

    aget v0, v3, v0

    cmpl-float v0, v0, v9

    if-lez v0, :cond_9

    const/4 v0, 0x2

    aget v0, v3, v0

    iget v4, p0, Lcom/roidapp/photogrid/release/ps;->c:I

    int-to-float v4, v4

    cmpg-float v0, v0, v4

    if-gez v0, :cond_9

    const/4 v0, 0x3

    aget v0, v3, v0

    cmpl-float v0, v0, v9

    if-lez v0, :cond_9

    const/4 v0, 0x3

    aget v0, v3, v0

    iget v4, p0, Lcom/roidapp/photogrid/release/ps;->d:I

    int-to-float v4, v4

    cmpg-float v0, v0, v4

    if-gez v0, :cond_9

    move v0, v1

    .line 3508
    goto/16 :goto_1

    .line 3509
    :cond_9
    const/4 v0, 0x4

    aget v0, v3, v0

    cmpl-float v0, v0, v9

    if-lez v0, :cond_a

    const/4 v0, 0x4

    aget v0, v3, v0

    iget v4, p0, Lcom/roidapp/photogrid/release/ps;->c:I

    int-to-float v4, v4

    cmpg-float v0, v0, v4

    if-gez v0, :cond_a

    const/4 v0, 0x5

    aget v0, v3, v0

    cmpl-float v0, v0, v9

    if-lez v0, :cond_a

    const/4 v0, 0x5

    aget v0, v3, v0

    iget v4, p0, Lcom/roidapp/photogrid/release/ps;->d:I

    int-to-float v4, v4

    cmpg-float v0, v0, v4

    if-gez v0, :cond_a

    move v0, v1

    .line 3510
    goto/16 :goto_1

    .line 3511
    :cond_a
    const/4 v0, 0x6

    aget v0, v3, v0

    cmpl-float v0, v0, v9

    if-lez v0, :cond_b

    const/4 v0, 0x6

    aget v0, v3, v0

    iget v4, p0, Lcom/roidapp/photogrid/release/ps;->c:I

    int-to-float v4, v4

    cmpg-float v0, v0, v4

    if-gez v0, :cond_b

    const/4 v0, 0x7

    aget v0, v3, v0

    cmpl-float v0, v0, v9

    if-lez v0, :cond_b

    const/4 v0, 0x7

    aget v0, v3, v0

    iget v4, p0, Lcom/roidapp/photogrid/release/ps;->d:I

    int-to-float v4, v4

    cmpg-float v0, v0, v4

    if-gez v0, :cond_b

    move v0, v1

    .line 3512
    goto/16 :goto_1

    .line 3513
    :cond_b
    const/16 v0, 0x8

    aget v0, v3, v0

    cmpl-float v0, v0, v9

    if-lez v0, :cond_c

    const/16 v0, 0x8

    aget v0, v3, v0

    iget v4, p0, Lcom/roidapp/photogrid/release/ps;->c:I

    int-to-float v4, v4

    cmpg-float v0, v0, v4

    if-gez v0, :cond_c

    const/16 v0, 0x9

    aget v0, v3, v0

    cmpl-float v0, v0, v9

    if-lez v0, :cond_c

    const/16 v0, 0x9

    aget v0, v3, v0

    iget v4, p0, Lcom/roidapp/photogrid/release/ps;->d:I

    int-to-float v4, v4

    cmpg-float v0, v0, v4

    if-gez v0, :cond_c

    move v0, v1

    .line 3514
    goto/16 :goto_1

    .line 3515
    :cond_c
    const/16 v0, 0xa

    aget v0, v3, v0

    cmpl-float v0, v0, v9

    if-lez v0, :cond_d

    const/16 v0, 0xa

    aget v0, v3, v0

    iget v4, p0, Lcom/roidapp/photogrid/release/ps;->c:I

    int-to-float v4, v4

    cmpg-float v0, v0, v4

    if-gez v0, :cond_d

    const/16 v0, 0xb

    aget v0, v3, v0

    cmpl-float v0, v0, v9

    if-lez v0, :cond_d

    const/16 v0, 0xb

    aget v0, v3, v0

    iget v4, p0, Lcom/roidapp/photogrid/release/ps;->d:I

    int-to-float v4, v4

    cmpg-float v0, v0, v4

    if-gez v0, :cond_d

    move v0, v1

    .line 3516
    goto/16 :goto_1

    .line 3517
    :cond_d
    const/16 v0, 0xc

    aget v0, v3, v0

    cmpl-float v0, v0, v9

    if-lez v0, :cond_e

    const/16 v0, 0xc

    aget v0, v3, v0

    iget v4, p0, Lcom/roidapp/photogrid/release/ps;->c:I

    int-to-float v4, v4

    cmpg-float v0, v0, v4

    if-gez v0, :cond_e

    const/16 v0, 0xd

    aget v0, v3, v0

    cmpl-float v0, v0, v9

    if-lez v0, :cond_e

    const/16 v0, 0xd

    aget v0, v3, v0

    iget v4, p0, Lcom/roidapp/photogrid/release/ps;->d:I

    int-to-float v4, v4

    cmpg-float v0, v0, v4

    if-gez v0, :cond_e

    move v0, v1

    .line 3518
    goto/16 :goto_1

    .line 3519
    :cond_e
    const/16 v0, 0xe

    aget v0, v3, v0

    cmpl-float v0, v0, v9

    if-lez v0, :cond_f

    const/16 v0, 0xe

    aget v0, v3, v0

    iget v4, p0, Lcom/roidapp/photogrid/release/ps;->c:I

    int-to-float v4, v4

    cmpg-float v0, v0, v4

    if-gez v0, :cond_f

    const/16 v0, 0xf

    aget v0, v3, v0

    cmpl-float v0, v0, v9

    if-lez v0, :cond_f

    const/16 v0, 0xf

    aget v0, v3, v0

    iget v3, p0, Lcom/roidapp/photogrid/release/ps;->d:I

    int-to-float v3, v3

    cmpg-float v0, v0, v3

    if-gez v0, :cond_f

    move v0, v1

    .line 3520
    goto/16 :goto_1

    :cond_f
    move v0, v2

    .line 3522
    goto/16 :goto_1

    .line 360
    :cond_10
    iput-boolean v1, p0, Lcom/roidapp/photogrid/release/ps;->B:Z

    .line 361
    iput-boolean v1, p0, Lcom/roidapp/photogrid/release/ps;->C:Z

    goto/16 :goto_2

    .line 370
    :cond_11
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ps;->b:Landroid/graphics/Matrix;

    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 371
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ps;->V:Landroid/graphics/drawable/NinePatchDrawable;

    if-eqz v0, :cond_4

    .line 372
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ps;->V:Landroid/graphics/drawable/NinePatchDrawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/NinePatchDrawable;->draw(Landroid/graphics/Canvas;)V

    goto/16 :goto_3
.end method

.method public final a(Landroid/graphics/drawable/NinePatchDrawable;)V
    .locals 0

    .prologue
    .line 61
    iput-object p1, p0, Lcom/roidapp/photogrid/release/ps;->V:Landroid/graphics/drawable/NinePatchDrawable;

    .line 62
    return-void
.end method

.method public final a(Z)V
    .locals 0

    .prologue
    .line 54
    iput-boolean p1, p0, Lcom/roidapp/photogrid/release/ps;->W:Z

    .line 55
    return-void
.end method

.method public final a(F)Z
    .locals 8

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 393
    new-instance v1, Landroid/graphics/Matrix;

    iget-object v0, p0, Lcom/roidapp/photogrid/release/ps;->b:Landroid/graphics/Matrix;

    invoke-direct {v1, v0}, Landroid/graphics/Matrix;-><init>(Landroid/graphics/Matrix;)V

    .line 394
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ps;->o:[F

    const/16 v4, 0x10

    aget v0, v0, v4

    iget-object v4, p0, Lcom/roidapp/photogrid/release/ps;->o:[F

    const/16 v5, 0x11

    aget v4, v4, v5

    invoke-virtual {v1, p1, p1, v0, v4}, Landroid/graphics/Matrix;->postScale(FFFF)Z

    .line 395
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ps;->n:[F

    invoke-virtual {v0}, [F->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [F

    .line 396
    iget-object v4, p0, Lcom/roidapp/photogrid/release/ps;->n:[F

    invoke-virtual {v1, v0, v4}, Landroid/graphics/Matrix;->mapPoints([F[F)V

    .line 397
    aget v1, v0, v2

    aget v4, v0, v3

    const/16 v5, 0xc

    aget v5, v0, v5

    const/16 v6, 0xd

    aget v6, v0, v6

    invoke-static {v1, v4, v5, v6}, Lcom/roidapp/photogrid/release/ps;->a(FFFF)F

    move-result v1

    .line 398
    aget v4, v0, v2

    aget v5, v0, v3

    const/4 v6, 0x4

    aget v6, v0, v6

    const/4 v7, 0x5

    aget v0, v0, v7

    invoke-static {v4, v5, v6, v0}, Lcom/roidapp/photogrid/release/ps;->a(FFFF)F

    move-result v0

    .line 399
    cmpl-float v4, v1, v0

    if-ltz v4, :cond_0

    move v0, v1

    .line 400
    :cond_0
    iget v1, p0, Lcom/roidapp/photogrid/release/ps;->d:I

    iget v4, p0, Lcom/roidapp/photogrid/release/ps;->c:I

    if-lt v1, v4, :cond_2

    iget v1, p0, Lcom/roidapp/photogrid/release/ps;->d:I

    .line 401
    :goto_0
    int-to-float v1, v1

    cmpg-float v0, v0, v1

    if-lez v0, :cond_1

    const/high16 v0, 0x3f800000    # 1.0f

    cmpg-float v0, p1, v0

    if-gez v0, :cond_3

    .line 402
    :cond_1
    iget v0, p0, Lcom/roidapp/photogrid/release/ps;->h:F

    mul-float/2addr v0, p1

    iput v0, p0, Lcom/roidapp/photogrid/release/ps;->h:F

    .line 403
    iget v0, p0, Lcom/roidapp/photogrid/release/ps;->h:F

    iput v0, p0, Lcom/roidapp/photogrid/release/ps;->u:F

    move v0, v3

    .line 406
    :goto_1
    return v0

    .line 400
    :cond_2
    iget v1, p0, Lcom/roidapp/photogrid/release/ps;->c:I

    goto :goto_0

    :cond_3
    move v0, v2

    .line 406
    goto :goto_1
.end method

.method public final b()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 466
    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/ps;->C:Z

    .line 467
    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/ps;->B:Z

    .line 468
    iget v0, p0, Lcom/roidapp/photogrid/release/ps;->D:I

    int-to-float v0, v0

    iput v0, p0, Lcom/roidapp/photogrid/release/ps;->j:F

    .line 469
    iget v0, p0, Lcom/roidapp/photogrid/release/ps;->E:I

    int-to-float v0, v0

    iput v0, p0, Lcom/roidapp/photogrid/release/ps;->k:F

    .line 470
    return-void
.end method

.method public final b(F)V
    .locals 1

    .prologue
    .line 388
    iget v0, p0, Lcom/roidapp/photogrid/release/ps;->l:F

    add-float/2addr v0, p1

    iput v0, p0, Lcom/roidapp/photogrid/release/ps;->l:F

    .line 389
    return-void
.end method

.method public final b(FF)V
    .locals 1

    .prologue
    .line 454
    iget v0, p0, Lcom/roidapp/photogrid/release/ps;->k:F

    add-float/2addr v0, p2

    iput v0, p0, Lcom/roidapp/photogrid/release/ps;->k:F

    .line 455
    iget v0, p0, Lcom/roidapp/photogrid/release/ps;->j:F

    add-float/2addr v0, p1

    iput v0, p0, Lcom/roidapp/photogrid/release/ps;->j:F

    .line 456
    return-void
.end method

.method public final b(Z)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 163
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ps;->G:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/release/ps;->G:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_0

    .line 164
    iput-boolean p1, p0, Lcom/roidapp/photogrid/release/ps;->W:Z

    .line 165
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ps;->G:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    .line 166
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ps;->G:Landroid/graphics/Bitmap;

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    .line 167
    new-instance v2, Landroid/graphics/RectF;

    int-to-float v0, v0

    int-to-float v1, v1

    invoke-direct {v2, v3, v3, v0, v1}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 168
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/ps;->W:Z

    if-eqz v0, :cond_1

    .line 169
    iget v0, p0, Lcom/roidapp/photogrid/release/ps;->M:F

    iget v1, p0, Lcom/roidapp/photogrid/release/ps;->M:F

    invoke-virtual {v2, v0, v1}, Landroid/graphics/RectF;->inset(FF)V

    .line 173
    :goto_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ps;->V:Landroid/graphics/drawable/NinePatchDrawable;

    if-eqz v0, :cond_0

    .line 174
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ps;->V:Landroid/graphics/drawable/NinePatchDrawable;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/ps;->a(Landroid/graphics/RectF;)Landroid/graphics/Rect;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/NinePatchDrawable;->setBounds(Landroid/graphics/Rect;)V

    .line 177
    :cond_0
    return-void

    .line 171
    :cond_1
    iget v0, p0, Lcom/roidapp/photogrid/release/ps;->L:F

    iget v1, p0, Lcom/roidapp/photogrid/release/ps;->L:F

    invoke-virtual {v2, v0, v1}, Landroid/graphics/RectF;->inset(FF)V

    goto :goto_0
.end method

.method public final c(F)V
    .locals 2

    .prologue
    .line 153
    const/high16 v0, 0x40800000    # 4.0f

    mul-float/2addr v0, p1

    .line 154
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ps;->U:Landroid/graphics/Paint;

    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 156
    return-void
.end method

.method public final g()Z
    .locals 1

    .prologue
    .line 57
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/ps;->W:Z

    return v0
.end method

.method public final h()Landroid/graphics/drawable/NinePatchDrawable;
    .locals 1

    .prologue
    .line 65
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ps;->V:Landroid/graphics/drawable/NinePatchDrawable;

    return-object v0
.end method
