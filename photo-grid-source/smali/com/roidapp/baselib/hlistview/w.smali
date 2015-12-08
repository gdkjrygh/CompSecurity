.class public final Lcom/roidapp/baselib/hlistview/w;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final A:I

.field private final B:I

.field private final C:I

.field private final D:I

.field private final a:I

.field private final b:Landroid/graphics/drawable/Drawable;

.field private final c:Landroid/graphics/drawable/Drawable;

.field private d:I

.field private e:I

.field private f:I

.field private g:I

.field private final h:I

.field private i:F

.field private j:F

.field private k:F

.field private l:F

.field private m:F

.field private n:F

.field private o:F

.field private p:F

.field private q:F

.field private r:F

.field private s:F

.field private t:F

.field private u:J

.field private v:F

.field private final w:Landroid/view/animation/Interpolator;

.field private x:I

.field private y:F

.field private final z:Landroid/graphics/Rect;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 5

    .prologue
    const/high16 v4, 0x40800000    # 4.0f

    const/high16 v3, 0x3f000000    # 0.5f

    .line 140
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 125
    const/4 v0, 0x0

    iput v0, p0, Lcom/roidapp/baselib/hlistview/w;->x:I

    .line 129
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lcom/roidapp/baselib/hlistview/w;->z:Landroid/graphics/Rect;

    .line 141
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    .line 142
    sget v1, Lcom/roidapp/baselib/e;->bC:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    iput-object v1, p0, Lcom/roidapp/baselib/hlistview/w;->b:Landroid/graphics/drawable/Drawable;

    .line 143
    sget v1, Lcom/roidapp/baselib/e;->bD:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    iput-object v1, p0, Lcom/roidapp/baselib/hlistview/w;->c:Landroid/graphics/drawable/Drawable;

    .line 145
    const/4 v1, 0x1

    iput v1, p0, Lcom/roidapp/baselib/hlistview/w;->a:I

    .line 147
    iget-object v1, p0, Lcom/roidapp/baselib/hlistview/w;->b:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v1

    iput v1, p0, Lcom/roidapp/baselib/hlistview/w;->A:I

    .line 148
    iget-object v1, p0, Lcom/roidapp/baselib/hlistview/w;->c:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v1

    iput v1, p0, Lcom/roidapp/baselib/hlistview/w;->B:I

    .line 149
    iget-object v1, p0, Lcom/roidapp/baselib/hlistview/w;->c:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v1

    iput v1, p0, Lcom/roidapp/baselib/hlistview/w;->C:I

    .line 151
    iget v1, p0, Lcom/roidapp/baselib/hlistview/w;->B:I

    int-to-float v1, v1

    mul-float/2addr v1, v4

    iget v2, p0, Lcom/roidapp/baselib/hlistview/w;->B:I

    int-to-float v2, v2

    mul-float/2addr v1, v2

    iget v2, p0, Lcom/roidapp/baselib/hlistview/w;->C:I

    int-to-float v2, v2

    div-float/2addr v1, v2

    const v2, 0x3f19999a    # 0.6f

    mul-float/2addr v1, v2

    iget v2, p0, Lcom/roidapp/baselib/hlistview/w;->B:I

    int-to-float v2, v2

    mul-float/2addr v2, v4

    invoke-static {v1, v2}, Ljava/lang/Math;->min(FF)F

    move-result v1

    add-float/2addr v1, v3

    float-to-int v1, v1

    iput v1, p0, Lcom/roidapp/baselib/hlistview/w;->D:I

    .line 155
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    const/high16 v1, 0x43960000    # 300.0f

    mul-float/2addr v0, v1

    add-float/2addr v0, v3

    float-to-int v0, v0

    iput v0, p0, Lcom/roidapp/baselib/hlistview/w;->h:I

    .line 156
    new-instance v0, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v0}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    iput-object v0, p0, Lcom/roidapp/baselib/hlistview/w;->w:Landroid/view/animation/Interpolator;

    .line 157
    return-void
.end method


# virtual methods
.method public final a(Z)Landroid/graphics/Rect;
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 377
    iget-object v1, p0, Lcom/roidapp/baselib/hlistview/w;->z:Landroid/graphics/Rect;

    iget v2, p0, Lcom/roidapp/baselib/hlistview/w;->d:I

    iget v3, p0, Lcom/roidapp/baselib/hlistview/w;->D:I

    invoke-virtual {v1, v0, v0, v2, v3}, Landroid/graphics/Rect;->set(IIII)V

    .line 378
    iget-object v1, p0, Lcom/roidapp/baselib/hlistview/w;->z:Landroid/graphics/Rect;

    iget v2, p0, Lcom/roidapp/baselib/hlistview/w;->f:I

    iget v3, p0, Lcom/roidapp/baselib/hlistview/w;->g:I

    if-eqz p1, :cond_0

    iget v0, p0, Lcom/roidapp/baselib/hlistview/w;->D:I

    :cond_0
    sub-int v0, v3, v0

    invoke-virtual {v1, v2, v0}, Landroid/graphics/Rect;->offset(II)V

    .line 380
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/w;->z:Landroid/graphics/Rect;

    return-object v0
.end method

.method public final a(F)V
    .locals 8

    .prologue
    const/4 v7, 0x1

    const/high16 v6, 0x40e00000    # 7.0f

    const/high16 v5, 0x3f800000    # 1.0f

    const/4 v4, 0x0

    .line 212
    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    move-result-wide v0

    .line 213
    iget v2, p0, Lcom/roidapp/baselib/hlistview/w;->x:I

    const/4 v3, 0x4

    if-ne v2, v3, :cond_0

    iget-wide v2, p0, Lcom/roidapp/baselib/hlistview/w;->u:J

    sub-long v2, v0, v2

    long-to-float v2, v2

    iget v3, p0, Lcom/roidapp/baselib/hlistview/w;->v:F

    cmpg-float v2, v2, v3

    if-gez v2, :cond_0

    .line 251
    :goto_0
    return-void

    .line 216
    :cond_0
    iget v2, p0, Lcom/roidapp/baselib/hlistview/w;->x:I

    if-eq v2, v7, :cond_1

    .line 217
    iput v5, p0, Lcom/roidapp/baselib/hlistview/w;->l:F

    .line 219
    :cond_1
    iput v7, p0, Lcom/roidapp/baselib/hlistview/w;->x:I

    .line 221
    iput-wide v0, p0, Lcom/roidapp/baselib/hlistview/w;->u:J

    .line 222
    const/high16 v0, 0x43270000    # 167.0f

    iput v0, p0, Lcom/roidapp/baselib/hlistview/w;->v:F

    .line 224
    iget v0, p0, Lcom/roidapp/baselib/hlistview/w;->y:F

    add-float/2addr v0, p1

    iput v0, p0, Lcom/roidapp/baselib/hlistview/w;->y:F

    .line 225
    iget v0, p0, Lcom/roidapp/baselib/hlistview/w;->y:F

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    .line 227
    const v1, 0x3f19999a    # 0.6f

    invoke-static {v0, v5}, Ljava/lang/Math;->min(FF)F

    move-result v2

    invoke-static {v1, v2}, Ljava/lang/Math;->max(FF)F

    move-result v1

    iput v1, p0, Lcom/roidapp/baselib/hlistview/w;->m:F

    iput v1, p0, Lcom/roidapp/baselib/hlistview/w;->i:F

    .line 228
    const/high16 v1, 0x3f000000    # 0.5f

    mul-float/2addr v0, v6

    invoke-static {v0, v5}, Ljava/lang/Math;->min(FF)F

    move-result v0

    invoke-static {v1, v0}, Ljava/lang/Math;->max(FF)F

    move-result v0

    iput v0, p0, Lcom/roidapp/baselib/hlistview/w;->o:F

    iput v0, p0, Lcom/roidapp/baselib/hlistview/w;->j:F

    .line 231
    iget v0, p0, Lcom/roidapp/baselib/hlistview/w;->k:F

    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    const v2, 0x3f8ccccd    # 1.1f

    mul-float/2addr v1, v2

    add-float/2addr v0, v1

    invoke-static {v5, v0}, Ljava/lang/Math;->min(FF)F

    move-result v0

    iput v0, p0, Lcom/roidapp/baselib/hlistview/w;->q:F

    iput v0, p0, Lcom/roidapp/baselib/hlistview/w;->k:F

    .line 235
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result v0

    .line 236
    cmpl-float v1, p1, v4

    if-lez v1, :cond_2

    iget v1, p0, Lcom/roidapp/baselib/hlistview/w;->y:F

    cmpg-float v1, v1, v4

    if-gez v1, :cond_2

    .line 237
    neg-float v0, v0

    .line 239
    :cond_2
    iget v1, p0, Lcom/roidapp/baselib/hlistview/w;->y:F

    cmpl-float v1, v1, v4

    if-nez v1, :cond_3

    .line 240
    iput v4, p0, Lcom/roidapp/baselib/hlistview/w;->l:F

    .line 244
    :cond_3
    const/high16 v1, 0x40800000    # 4.0f

    iget v2, p0, Lcom/roidapp/baselib/hlistview/w;->l:F

    mul-float/2addr v0, v6

    add-float/2addr v0, v2

    invoke-static {v4, v0}, Ljava/lang/Math;->max(FF)F

    move-result v0

    invoke-static {v1, v0}, Ljava/lang/Math;->min(FF)F

    move-result v0

    iput v0, p0, Lcom/roidapp/baselib/hlistview/w;->s:F

    iput v0, p0, Lcom/roidapp/baselib/hlistview/w;->l:F

    .line 247
    iget v0, p0, Lcom/roidapp/baselib/hlistview/w;->i:F

    iput v0, p0, Lcom/roidapp/baselib/hlistview/w;->n:F

    .line 248
    iget v0, p0, Lcom/roidapp/baselib/hlistview/w;->j:F

    iput v0, p0, Lcom/roidapp/baselib/hlistview/w;->p:F

    .line 249
    iget v0, p0, Lcom/roidapp/baselib/hlistview/w;->k:F

    iput v0, p0, Lcom/roidapp/baselib/hlistview/w;->r:F

    .line 250
    iget v0, p0, Lcom/roidapp/baselib/hlistview/w;->l:F

    iput v0, p0, Lcom/roidapp/baselib/hlistview/w;->t:F

    goto/16 :goto_0
.end method

.method public final a(I)V
    .locals 7

    .prologue
    const/high16 v6, 0x3f800000    # 1.0f

    const/high16 v5, 0x3f000000    # 0.5f

    const/4 v4, 0x0

    .line 292
    const/4 v0, 0x2

    iput v0, p0, Lcom/roidapp/baselib/hlistview/w;->x:I

    .line 293
    const/16 v0, 0x64

    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 295
    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    move-result-wide v2

    iput-wide v2, p0, Lcom/roidapp/baselib/hlistview/w;->u:J

    .line 296
    const v1, 0x3dcccccd    # 0.1f

    int-to-float v2, v0

    const v3, 0x3cf5c28f    # 0.03f

    mul-float/2addr v2, v3

    add-float/2addr v1, v2

    iput v1, p0, Lcom/roidapp/baselib/hlistview/w;->v:F

    .line 300
    iput v4, p0, Lcom/roidapp/baselib/hlistview/w;->m:F

    .line 301
    iput v4, p0, Lcom/roidapp/baselib/hlistview/w;->o:F

    iput v4, p0, Lcom/roidapp/baselib/hlistview/w;->j:F

    .line 304
    iput v5, p0, Lcom/roidapp/baselib/hlistview/w;->q:F

    .line 305
    iput v4, p0, Lcom/roidapp/baselib/hlistview/w;->s:F

    .line 309
    const/4 v1, 0x0

    mul-int/lit8 v2, v0, 0x8

    const/4 v3, 0x1

    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    move-result v2

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v1

    int-to-float v1, v1

    iput v1, p0, Lcom/roidapp/baselib/hlistview/w;->n:F

    .line 311
    mul-int/lit8 v1, v0, 0x8

    int-to-float v1, v1

    invoke-static {v1, v6}, Ljava/lang/Math;->min(FF)F

    move-result v1

    invoke-static {v5, v1}, Ljava/lang/Math;->max(FF)F

    move-result v1

    iput v1, p0, Lcom/roidapp/baselib/hlistview/w;->p:F

    .line 318
    const v1, 0x3ccccccd    # 0.025f

    div-int/lit8 v2, v0, 0x64

    mul-int/2addr v2, v0

    int-to-float v2, v2

    const v3, 0x391d4952    # 1.5E-4f

    mul-float/2addr v2, v3

    add-float/2addr v1, v2

    const/high16 v2, 0x3fe00000    # 1.75f

    invoke-static {v1, v2}, Ljava/lang/Math;->min(FF)F

    move-result v1

    iput v1, p0, Lcom/roidapp/baselib/hlistview/w;->t:F

    .line 320
    iget v1, p0, Lcom/roidapp/baselib/hlistview/w;->q:F

    mul-int/lit8 v0, v0, 0x10

    int-to-float v0, v0

    const v2, 0x3727c5ac    # 1.0E-5f

    mul-float/2addr v0, v2

    invoke-static {v0, v6}, Ljava/lang/Math;->min(FF)F

    move-result v0

    invoke-static {v1, v0}, Ljava/lang/Math;->max(FF)F

    move-result v0

    iput v0, p0, Lcom/roidapp/baselib/hlistview/w;->r:F

    .line 322
    return-void
.end method

.method public final a(II)V
    .locals 0

    .prologue
    .line 166
    iput p1, p0, Lcom/roidapp/baselib/hlistview/w;->d:I

    .line 167
    iput p2, p0, Lcom/roidapp/baselib/hlistview/w;->e:I

    .line 168
    return-void
.end method

.method public final a()Z
    .locals 1

    .prologue
    .line 190
    iget v0, p0, Lcom/roidapp/baselib/hlistview/w;->x:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final a(Landroid/graphics/Canvas;)Z
    .locals 10

    .prologue
    const/high16 v9, 0x437f0000    # 255.0f

    const/4 v8, 0x3

    const/high16 v7, 0x3f800000    # 1.0f

    const/4 v1, 0x0

    const/4 v6, 0x0

    .line 336
    .line 1384
    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    move-result-wide v2

    .line 1385
    iget-wide v4, p0, Lcom/roidapp/baselib/hlistview/w;->u:J

    sub-long/2addr v2, v4

    long-to-float v0, v2

    iget v2, p0, Lcom/roidapp/baselib/hlistview/w;->v:F

    div-float/2addr v0, v2

    invoke-static {v0, v7}, Ljava/lang/Math;->min(FF)F

    move-result v0

    .line 1387
    iget-object v2, p0, Lcom/roidapp/baselib/hlistview/w;->w:Landroid/view/animation/Interpolator;

    invoke-interface {v2, v0}, Landroid/view/animation/Interpolator;->getInterpolation(F)F

    move-result v2

    .line 1389
    iget v3, p0, Lcom/roidapp/baselib/hlistview/w;->m:F

    iget v4, p0, Lcom/roidapp/baselib/hlistview/w;->n:F

    iget v5, p0, Lcom/roidapp/baselib/hlistview/w;->m:F

    sub-float/2addr v4, v5

    mul-float/2addr v4, v2

    add-float/2addr v3, v4

    iput v3, p0, Lcom/roidapp/baselib/hlistview/w;->i:F

    .line 1390
    iget v3, p0, Lcom/roidapp/baselib/hlistview/w;->o:F

    iget v4, p0, Lcom/roidapp/baselib/hlistview/w;->p:F

    iget v5, p0, Lcom/roidapp/baselib/hlistview/w;->o:F

    sub-float/2addr v4, v5

    mul-float/2addr v4, v2

    add-float/2addr v3, v4

    iput v3, p0, Lcom/roidapp/baselib/hlistview/w;->j:F

    .line 1391
    iget v3, p0, Lcom/roidapp/baselib/hlistview/w;->q:F

    iget v4, p0, Lcom/roidapp/baselib/hlistview/w;->r:F

    iget v5, p0, Lcom/roidapp/baselib/hlistview/w;->q:F

    sub-float/2addr v4, v5

    mul-float/2addr v4, v2

    add-float/2addr v3, v4

    iput v3, p0, Lcom/roidapp/baselib/hlistview/w;->k:F

    .line 1392
    iget v3, p0, Lcom/roidapp/baselib/hlistview/w;->s:F

    iget v4, p0, Lcom/roidapp/baselib/hlistview/w;->t:F

    iget v5, p0, Lcom/roidapp/baselib/hlistview/w;->s:F

    sub-float/2addr v4, v5

    mul-float/2addr v4, v2

    add-float/2addr v3, v4

    iput v3, p0, Lcom/roidapp/baselib/hlistview/w;->l:F

    .line 1394
    const v3, 0x3f7fbe77    # 0.999f

    cmpl-float v0, v0, v3

    if-ltz v0, :cond_0

    .line 1395
    iget v0, p0, Lcom/roidapp/baselib/hlistview/w;->x:I

    packed-switch v0, :pswitch_data_0

    .line 338
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/w;->c:Landroid/graphics/drawable/Drawable;

    iget v2, p0, Lcom/roidapp/baselib/hlistview/w;->k:F

    invoke-static {v2, v7}, Ljava/lang/Math;->min(FF)F

    move-result v2

    invoke-static {v6, v2}, Ljava/lang/Math;->max(FF)F

    move-result v2

    mul-float/2addr v2, v9

    float-to-int v2, v2

    invoke-virtual {v0, v2}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 340
    iget v0, p0, Lcom/roidapp/baselib/hlistview/w;->B:I

    int-to-float v0, v0

    iget v2, p0, Lcom/roidapp/baselib/hlistview/w;->l:F

    mul-float/2addr v0, v2

    iget v2, p0, Lcom/roidapp/baselib/hlistview/w;->B:I

    int-to-float v2, v2

    mul-float/2addr v0, v2

    iget v2, p0, Lcom/roidapp/baselib/hlistview/w;->C:I

    int-to-float v2, v2

    div-float/2addr v0, v2

    const v2, 0x3f19999a    # 0.6f

    mul-float/2addr v0, v2

    iget v2, p0, Lcom/roidapp/baselib/hlistview/w;->B:I

    int-to-float v2, v2

    const/high16 v3, 0x40800000    # 4.0f

    mul-float/2addr v2, v3

    invoke-static {v0, v2}, Ljava/lang/Math;->min(FF)F

    move-result v0

    float-to-int v0, v0

    .line 347
    iget-object v2, p0, Lcom/roidapp/baselib/hlistview/w;->c:Landroid/graphics/drawable/Drawable;

    iget v3, p0, Lcom/roidapp/baselib/hlistview/w;->d:I

    invoke-virtual {v2, v1, v1, v3, v0}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 350
    iget-object v2, p0, Lcom/roidapp/baselib/hlistview/w;->c:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v2, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 352
    iget-object v2, p0, Lcom/roidapp/baselib/hlistview/w;->b:Landroid/graphics/drawable/Drawable;

    iget v3, p0, Lcom/roidapp/baselib/hlistview/w;->i:F

    invoke-static {v3, v7}, Ljava/lang/Math;->min(FF)F

    move-result v3

    invoke-static {v6, v3}, Ljava/lang/Math;->max(FF)F

    move-result v3

    mul-float/2addr v3, v9

    float-to-int v3, v3

    invoke-virtual {v2, v3}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 354
    iget v2, p0, Lcom/roidapp/baselib/hlistview/w;->A:I

    int-to-float v2, v2

    iget v3, p0, Lcom/roidapp/baselib/hlistview/w;->j:F

    mul-float/2addr v2, v3

    float-to-int v2, v2

    .line 359
    iget-object v3, p0, Lcom/roidapp/baselib/hlistview/w;->b:Landroid/graphics/drawable/Drawable;

    iget v4, p0, Lcom/roidapp/baselib/hlistview/w;->d:I

    invoke-virtual {v3, v1, v1, v4, v2}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 362
    iget-object v3, p0, Lcom/roidapp/baselib/hlistview/w;->b:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v3, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 364
    iget v3, p0, Lcom/roidapp/baselib/hlistview/w;->x:I

    if-ne v3, v8, :cond_1

    if-nez v0, :cond_1

    if-nez v2, :cond_1

    .line 365
    iput v1, p0, Lcom/roidapp/baselib/hlistview/w;->x:I

    .line 368
    :cond_1
    iget v0, p0, Lcom/roidapp/baselib/hlistview/w;->x:I

    if-eqz v0, :cond_3

    const/4 v0, 0x1

    :goto_1
    return v0

    .line 1397
    :pswitch_0
    iput v8, p0, Lcom/roidapp/baselib/hlistview/w;->x:I

    .line 1398
    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    move-result-wide v2

    iput-wide v2, p0, Lcom/roidapp/baselib/hlistview/w;->u:J

    .line 1399
    const/high16 v0, 0x447a0000    # 1000.0f

    iput v0, p0, Lcom/roidapp/baselib/hlistview/w;->v:F

    .line 1401
    iget v0, p0, Lcom/roidapp/baselib/hlistview/w;->i:F

    iput v0, p0, Lcom/roidapp/baselib/hlistview/w;->m:F

    .line 1402
    iget v0, p0, Lcom/roidapp/baselib/hlistview/w;->j:F

    iput v0, p0, Lcom/roidapp/baselib/hlistview/w;->o:F

    .line 1403
    iget v0, p0, Lcom/roidapp/baselib/hlistview/w;->k:F

    iput v0, p0, Lcom/roidapp/baselib/hlistview/w;->q:F

    .line 1404
    iget v0, p0, Lcom/roidapp/baselib/hlistview/w;->l:F

    iput v0, p0, Lcom/roidapp/baselib/hlistview/w;->s:F

    .line 1407
    iput v6, p0, Lcom/roidapp/baselib/hlistview/w;->n:F

    .line 1408
    iput v6, p0, Lcom/roidapp/baselib/hlistview/w;->p:F

    .line 1409
    iput v6, p0, Lcom/roidapp/baselib/hlistview/w;->r:F

    .line 1410
    iput v6, p0, Lcom/roidapp/baselib/hlistview/w;->t:F

    goto/16 :goto_0

    .line 1413
    :pswitch_1
    const/4 v0, 0x4

    iput v0, p0, Lcom/roidapp/baselib/hlistview/w;->x:I

    .line 1414
    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    move-result-wide v2

    iput-wide v2, p0, Lcom/roidapp/baselib/hlistview/w;->u:J

    .line 1415
    const/high16 v0, 0x447a0000    # 1000.0f

    iput v0, p0, Lcom/roidapp/baselib/hlistview/w;->v:F

    .line 1417
    iget v0, p0, Lcom/roidapp/baselib/hlistview/w;->i:F

    iput v0, p0, Lcom/roidapp/baselib/hlistview/w;->m:F

    .line 1418
    iget v0, p0, Lcom/roidapp/baselib/hlistview/w;->j:F

    iput v0, p0, Lcom/roidapp/baselib/hlistview/w;->o:F

    .line 1419
    iget v0, p0, Lcom/roidapp/baselib/hlistview/w;->k:F

    iput v0, p0, Lcom/roidapp/baselib/hlistview/w;->q:F

    .line 1420
    iget v0, p0, Lcom/roidapp/baselib/hlistview/w;->l:F

    iput v0, p0, Lcom/roidapp/baselib/hlistview/w;->s:F

    .line 1423
    iput v6, p0, Lcom/roidapp/baselib/hlistview/w;->n:F

    .line 1424
    iput v6, p0, Lcom/roidapp/baselib/hlistview/w;->p:F

    .line 1425
    iput v6, p0, Lcom/roidapp/baselib/hlistview/w;->r:F

    .line 1426
    iput v6, p0, Lcom/roidapp/baselib/hlistview/w;->t:F

    goto/16 :goto_0

    .line 1431
    :pswitch_2
    iget v0, p0, Lcom/roidapp/baselib/hlistview/w;->t:F

    cmpl-float v0, v0, v6

    if-eqz v0, :cond_2

    iget v0, p0, Lcom/roidapp/baselib/hlistview/w;->t:F

    iget v3, p0, Lcom/roidapp/baselib/hlistview/w;->t:F

    mul-float/2addr v0, v3

    div-float v0, v7, v0

    .line 1434
    :goto_2
    iget v3, p0, Lcom/roidapp/baselib/hlistview/w;->o:F

    iget v4, p0, Lcom/roidapp/baselib/hlistview/w;->p:F

    iget v5, p0, Lcom/roidapp/baselib/hlistview/w;->o:F

    sub-float/2addr v4, v5

    mul-float/2addr v2, v4

    mul-float/2addr v0, v2

    add-float/2addr v0, v3

    iput v0, p0, Lcom/roidapp/baselib/hlistview/w;->j:F

    .line 1437
    iput v8, p0, Lcom/roidapp/baselib/hlistview/w;->x:I

    goto/16 :goto_0

    .line 1431
    :cond_2
    const v0, 0x7f7fffff    # Float.MAX_VALUE

    goto :goto_2

    .line 1440
    :pswitch_3
    iput v1, p0, Lcom/roidapp/baselib/hlistview/w;->x:I

    goto/16 :goto_0

    :cond_3
    move v0, v1

    .line 368
    goto :goto_1

    .line 1395
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
        :pswitch_3
        :pswitch_2
    .end packed-switch
.end method

.method public final b()V
    .locals 1

    .prologue
    .line 198
    const/4 v0, 0x0

    iput v0, p0, Lcom/roidapp/baselib/hlistview/w;->x:I

    .line 199
    return-void
.end method

.method public final b(II)V
    .locals 0

    .prologue
    .line 178
    iput p1, p0, Lcom/roidapp/baselib/hlistview/w;->f:I

    .line 179
    iput p2, p0, Lcom/roidapp/baselib/hlistview/w;->g:I

    .line 180
    return-void
.end method

.method public final c()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 260
    iput v2, p0, Lcom/roidapp/baselib/hlistview/w;->y:F

    .line 262
    iget v0, p0, Lcom/roidapp/baselib/hlistview/w;->x:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    iget v0, p0, Lcom/roidapp/baselib/hlistview/w;->x:I

    const/4 v1, 0x4

    if-eq v0, v1, :cond_0

    .line 279
    :goto_0
    return-void

    .line 266
    :cond_0
    const/4 v0, 0x3

    iput v0, p0, Lcom/roidapp/baselib/hlistview/w;->x:I

    .line 267
    iget v0, p0, Lcom/roidapp/baselib/hlistview/w;->i:F

    iput v0, p0, Lcom/roidapp/baselib/hlistview/w;->m:F

    .line 268
    iget v0, p0, Lcom/roidapp/baselib/hlistview/w;->j:F

    iput v0, p0, Lcom/roidapp/baselib/hlistview/w;->o:F

    .line 269
    iget v0, p0, Lcom/roidapp/baselib/hlistview/w;->k:F

    iput v0, p0, Lcom/roidapp/baselib/hlistview/w;->q:F

    .line 270
    iget v0, p0, Lcom/roidapp/baselib/hlistview/w;->l:F

    iput v0, p0, Lcom/roidapp/baselib/hlistview/w;->s:F

    .line 272
    iput v2, p0, Lcom/roidapp/baselib/hlistview/w;->n:F

    .line 273
    iput v2, p0, Lcom/roidapp/baselib/hlistview/w;->p:F

    .line 274
    iput v2, p0, Lcom/roidapp/baselib/hlistview/w;->r:F

    .line 275
    iput v2, p0, Lcom/roidapp/baselib/hlistview/w;->t:F

    .line 277
    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/roidapp/baselib/hlistview/w;->u:J

    .line 278
    const/high16 v0, 0x447a0000    # 1000.0f

    iput v0, p0, Lcom/roidapp/baselib/hlistview/w;->v:F

    goto :goto_0
.end method
