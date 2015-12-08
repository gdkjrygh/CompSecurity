.class public final Lcom/roidapp/photogrid/release/qz;
.super Lcom/roidapp/photogrid/release/ao;
.source "SourceFile"


# instance fields
.field public G:Landroid/graphics/Bitmap;

.field public H:F

.field public I:F

.field public J:Z

.field public K:Ljava/lang/String;

.field public L:I

.field public M:F

.field public N:F

.field public O:F

.field public P:I

.field public Q:Ljava/lang/String;

.field public R:Ljava/lang/String;

.field protected S:Lcom/roidapp/photogrid/release/StickerInfo;

.field protected T:Ljava/lang/String;

.field public U:I

.field public V:I

.field private W:Z

.field private X:Z

.field private Y:Landroid/graphics/Paint;

.field private Z:Ljava/lang/Boolean;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/high16 v2, 0x3f000000    # 0.5f

    const/4 v1, 0x0

    .line 45
    invoke-direct {p0, p1}, Lcom/roidapp/photogrid/release/ao;-><init>(Landroid/content/Context;)V

    .line 24
    const/high16 v0, 0x40000000    # 2.0f

    iput v0, p0, Lcom/roidapp/photogrid/release/qz;->H:F

    .line 25
    const/high16 v0, 0x40c00000    # 6.0f

    iput v0, p0, Lcom/roidapp/photogrid/release/qz;->I:F

    .line 26
    iput-boolean v1, p0, Lcom/roidapp/photogrid/release/qz;->J:Z

    .line 27
    iput-boolean v1, p0, Lcom/roidapp/photogrid/release/qz;->W:Z

    .line 28
    iput-boolean v1, p0, Lcom/roidapp/photogrid/release/qz;->X:Z

    .line 32
    iput v2, p0, Lcom/roidapp/photogrid/release/qz;->M:F

    iput v2, p0, Lcom/roidapp/photogrid/release/qz;->N:F

    .line 33
    const v0, 0x3e851eb8    # 0.26f

    iput v0, p0, Lcom/roidapp/photogrid/release/qz;->O:F

    .line 34
    iput v3, p0, Lcom/roidapp/photogrid/release/qz;->P:I

    .line 46
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/qz;->Y:Landroid/graphics/Paint;

    .line 47
    iget v0, p0, Lcom/roidapp/photogrid/release/qz;->H:F

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    iget v1, v1, Landroid/util/DisplayMetrics;->density:F

    mul-float/2addr v0, v1

    iput v0, p0, Lcom/roidapp/photogrid/release/qz;->H:F

    .line 49
    iget v0, p0, Lcom/roidapp/photogrid/release/qz;->I:F

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    iget v1, v1, Landroid/util/DisplayMetrics;->widthPixels:I

    int-to-float v1, v1

    mul-float/2addr v0, v1

    const/high16 v1, 0x44800000    # 1024.0f

    div-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lcom/roidapp/photogrid/release/qz;->I:F

    .line 50
    iget-object v0, p0, Lcom/roidapp/photogrid/release/qz;->Y:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 51
    iget-object v0, p0, Lcom/roidapp/photogrid/release/qz;->Y:Landroid/graphics/Paint;

    iget v1, p0, Lcom/roidapp/photogrid/release/qz;->H:F

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 52
    iget-object v0, p0, Lcom/roidapp/photogrid/release/qz;->Y:Landroid/graphics/Paint;

    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 53
    iget-object v0, p0, Lcom/roidapp/photogrid/release/qz;->Y:Landroid/graphics/Paint;

    const v1, -0xc39b2b

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 54
    return-void
.end method


# virtual methods
.method public final synthetic a(Landroid/content/Context;)Lcom/roidapp/photogrid/release/ao;
    .locals 2

    .prologue
    .line 20
    .line 6292
    new-instance v0, Lcom/roidapp/photogrid/release/qz;

    invoke-direct {v0, p1}, Lcom/roidapp/photogrid/release/qz;-><init>(Landroid/content/Context;)V

    .line 6293
    new-instance v1, Landroid/graphics/Matrix;

    invoke-direct {v1}, Landroid/graphics/Matrix;-><init>()V

    iput-object v1, v0, Lcom/roidapp/photogrid/release/qz;->b:Landroid/graphics/Matrix;

    .line 6294
    iget v1, p0, Lcom/roidapp/photogrid/release/qz;->M:F

    iput v1, v0, Lcom/roidapp/photogrid/release/qz;->M:F

    .line 6295
    iget v1, p0, Lcom/roidapp/photogrid/release/qz;->N:F

    iput v1, v0, Lcom/roidapp/photogrid/release/qz;->N:F

    .line 6296
    iget v1, p0, Lcom/roidapp/photogrid/release/qz;->P:I

    iput v1, v0, Lcom/roidapp/photogrid/release/qz;->P:I

    .line 6297
    iget-object v1, p0, Lcom/roidapp/photogrid/release/qz;->g:Ljava/lang/String;

    iput-object v1, v0, Lcom/roidapp/photogrid/release/qz;->g:Ljava/lang/String;

    .line 6298
    iget v1, p0, Lcom/roidapp/photogrid/release/qz;->j:F

    iput v1, v0, Lcom/roidapp/photogrid/release/qz;->j:F

    .line 6299
    iget v1, p0, Lcom/roidapp/photogrid/release/qz;->k:F

    iput v1, v0, Lcom/roidapp/photogrid/release/qz;->k:F

    .line 6300
    iget v1, p0, Lcom/roidapp/photogrid/release/qz;->l:F

    iput v1, v0, Lcom/roidapp/photogrid/release/qz;->l:F

    .line 6301
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/qz;->d()I

    move-result v1

    iput v1, v0, Lcom/roidapp/photogrid/release/qz;->p:I

    .line 6302
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/qz;->c()I

    move-result v1

    iput v1, v0, Lcom/roidapp/photogrid/release/qz;->q:I

    .line 6303
    iget v1, p0, Lcom/roidapp/photogrid/release/qz;->h:F

    iput v1, v0, Lcom/roidapp/photogrid/release/qz;->h:F

    .line 6304
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/qz;->e()[F

    move-result-object v1

    iput-object v1, v0, Lcom/roidapp/photogrid/release/qz;->r:[F

    .line 6305
    iget v1, p0, Lcom/roidapp/photogrid/release/qz;->s:I

    iput v1, v0, Lcom/roidapp/photogrid/release/qz;->s:I

    .line 6306
    iget v1, p0, Lcom/roidapp/photogrid/release/qz;->t:I

    iput v1, v0, Lcom/roidapp/photogrid/release/qz;->t:I

    .line 6307
    iget v1, p0, Lcom/roidapp/photogrid/release/qz;->L:I

    iput v1, v0, Lcom/roidapp/photogrid/release/qz;->L:I

    .line 6308
    iget-object v1, p0, Lcom/roidapp/photogrid/release/qz;->K:Ljava/lang/String;

    iput-object v1, v0, Lcom/roidapp/photogrid/release/qz;->K:Ljava/lang/String;

    .line 6309
    iget-boolean v1, p0, Lcom/roidapp/photogrid/release/qz;->J:Z

    iput-boolean v1, v0, Lcom/roidapp/photogrid/release/qz;->J:Z

    .line 6310
    iget-boolean v1, p0, Lcom/roidapp/photogrid/release/qz;->W:Z

    iput-boolean v1, v0, Lcom/roidapp/photogrid/release/qz;->W:Z

    .line 6311
    iget-boolean v1, p0, Lcom/roidapp/photogrid/release/qz;->X:Z

    iput-boolean v1, v0, Lcom/roidapp/photogrid/release/qz;->X:Z

    .line 6312
    iget v1, p0, Lcom/roidapp/photogrid/release/qz;->c:I

    iput v1, v0, Lcom/roidapp/photogrid/release/qz;->c:I

    .line 6313
    iget v1, p0, Lcom/roidapp/photogrid/release/qz;->d:I

    iput v1, v0, Lcom/roidapp/photogrid/release/qz;->d:I

    .line 6314
    iget v1, p0, Lcom/roidapp/photogrid/release/qz;->H:F

    iput v1, v0, Lcom/roidapp/photogrid/release/qz;->H:F

    .line 6315
    iget v1, p0, Lcom/roidapp/photogrid/release/qz;->u:F

    iput v1, v0, Lcom/roidapp/photogrid/release/qz;->u:F

    .line 6316
    iget v1, p0, Lcom/roidapp/photogrid/release/qz;->O:F

    iput v1, v0, Lcom/roidapp/photogrid/release/qz;->O:F

    .line 6318
    iget-object v1, p0, Lcom/roidapp/photogrid/release/qz;->Q:Ljava/lang/String;

    iput-object v1, v0, Lcom/roidapp/photogrid/release/qz;->Q:Ljava/lang/String;

    .line 6319
    iget-object v1, p0, Lcom/roidapp/photogrid/release/qz;->R:Ljava/lang/String;

    iput-object v1, v0, Lcom/roidapp/photogrid/release/qz;->R:Ljava/lang/String;

    .line 6321
    iget-object v1, p0, Lcom/roidapp/photogrid/release/qz;->S:Lcom/roidapp/photogrid/release/StickerInfo;

    iput-object v1, v0, Lcom/roidapp/photogrid/release/qz;->S:Lcom/roidapp/photogrid/release/StickerInfo;

    .line 6323
    iget v1, p0, Lcom/roidapp/photogrid/release/qz;->V:I

    iput v1, v0, Lcom/roidapp/photogrid/release/qz;->V:I

    .line 6324
    iget-object v1, p0, Lcom/roidapp/photogrid/release/qz;->T:Ljava/lang/String;

    iput-object v1, v0, Lcom/roidapp/photogrid/release/qz;->T:Ljava/lang/String;

    .line 6325
    iget v1, p0, Lcom/roidapp/photogrid/release/qz;->U:I

    iput v1, v0, Lcom/roidapp/photogrid/release/qz;->U:I

    .line 20
    return-object v0
.end method

.method public final a()V
    .locals 1

    .prologue
    .line 358
    iget-object v0, p0, Lcom/roidapp/photogrid/release/qz;->G:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/release/qz;->G:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_0

    .line 359
    iget-object v0, p0, Lcom/roidapp/photogrid/release/qz;->G:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 360
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/qz;->G:Landroid/graphics/Bitmap;

    .line 362
    :cond_0
    return-void
.end method

.method public final a(Landroid/graphics/Canvas;)V
    .locals 10

    .prologue
    const/16 v8, 0x10

    const/4 v3, 0x1

    const/high16 v9, 0x40000000    # 2.0f

    const/4 v2, 0x0

    const/4 v1, 0x0

    .line 227
    iget-object v0, p0, Lcom/roidapp/photogrid/release/qz;->G:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/roidapp/photogrid/release/qz;->G:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_2

    .line 228
    iget-object v0, p0, Lcom/roidapp/photogrid/release/qz;->b:Landroid/graphics/Matrix;

    invoke-virtual {v0}, Landroid/graphics/Matrix;->reset()V

    .line 229
    iget-object v0, p0, Lcom/roidapp/photogrid/release/qz;->b:Landroid/graphics/Matrix;

    iget v4, p0, Lcom/roidapp/photogrid/release/qz;->h:F

    iget v5, p0, Lcom/roidapp/photogrid/release/qz;->h:F

    iget-object v6, p0, Lcom/roidapp/photogrid/release/qz;->G:Landroid/graphics/Bitmap;

    invoke-virtual {v6}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v6

    int-to-float v6, v6

    div-float/2addr v6, v9

    iget-object v7, p0, Lcom/roidapp/photogrid/release/qz;->G:Landroid/graphics/Bitmap;

    invoke-virtual {v7}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v7

    int-to-float v7, v7

    div-float/2addr v7, v9

    invoke-virtual {v0, v4, v5, v6, v7}, Landroid/graphics/Matrix;->postScale(FFFF)Z

    .line 231
    iget-object v0, p0, Lcom/roidapp/photogrid/release/qz;->b:Landroid/graphics/Matrix;

    iget v4, p0, Lcom/roidapp/photogrid/release/qz;->P:I

    int-to-float v4, v4

    const/high16 v5, 0x3f800000    # 1.0f

    iget-object v6, p0, Lcom/roidapp/photogrid/release/qz;->G:Landroid/graphics/Bitmap;

    invoke-virtual {v6}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v6

    int-to-float v6, v6

    div-float/2addr v6, v9

    iget-object v7, p0, Lcom/roidapp/photogrid/release/qz;->G:Landroid/graphics/Bitmap;

    invoke-virtual {v7}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v7

    int-to-float v7, v7

    div-float/2addr v7, v9

    invoke-virtual {v0, v4, v5, v6, v7}, Landroid/graphics/Matrix;->postScale(FFFF)Z

    .line 232
    iget-object v0, p0, Lcom/roidapp/photogrid/release/qz;->b:Landroid/graphics/Matrix;

    iget v4, p0, Lcom/roidapp/photogrid/release/qz;->l:F

    iget-object v5, p0, Lcom/roidapp/photogrid/release/qz;->G:Landroid/graphics/Bitmap;

    invoke-virtual {v5}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v5

    int-to-float v5, v5

    div-float/2addr v5, v9

    iget-object v6, p0, Lcom/roidapp/photogrid/release/qz;->G:Landroid/graphics/Bitmap;

    invoke-virtual {v6}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v6

    int-to-float v6, v6

    div-float/2addr v6, v9

    invoke-virtual {v0, v4, v5, v6}, Landroid/graphics/Matrix;->postRotate(FFF)Z

    .line 234
    iget-object v0, p0, Lcom/roidapp/photogrid/release/qz;->b:Landroid/graphics/Matrix;

    iget v4, p0, Lcom/roidapp/photogrid/release/qz;->j:F

    iget v5, p0, Lcom/roidapp/photogrid/release/qz;->v:F

    add-float/2addr v4, v5

    iget v5, p0, Lcom/roidapp/photogrid/release/qz;->k:F

    iget v6, p0, Lcom/roidapp/photogrid/release/qz;->w:F

    add-float/2addr v5, v6

    invoke-virtual {v0, v4, v5}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 235
    iget-object v0, p0, Lcom/roidapp/photogrid/release/qz;->b:Landroid/graphics/Matrix;

    iget-object v4, p0, Lcom/roidapp/photogrid/release/qz;->o:[F

    iget-object v5, p0, Lcom/roidapp/photogrid/release/qz;->n:[F

    invoke-virtual {v0, v4, v5}, Landroid/graphics/Matrix;->mapPoints([F[F)V

    .line 238
    iget-object v4, p0, Lcom/roidapp/photogrid/release/qz;->o:[F

    .line 5374
    aget v0, v4, v8

    cmpl-float v0, v0, v1

    if-lez v0, :cond_3

    aget v0, v4, v8

    iget v5, p0, Lcom/roidapp/photogrid/release/qz;->c:I

    int-to-float v5, v5

    cmpg-float v0, v0, v5

    if-gez v0, :cond_3

    const/16 v0, 0x11

    aget v0, v4, v0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_3

    const/16 v0, 0x11

    aget v0, v4, v0

    iget v5, p0, Lcom/roidapp/photogrid/release/qz;->d:I

    int-to-float v5, v5

    cmpg-float v0, v0, v5

    if-gez v0, :cond_3

    move v0, v2

    .line 238
    :goto_0
    if-eqz v0, :cond_e

    .line 239
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/qz;->B:Z

    if-nez v0, :cond_0

    .line 240
    iput-boolean v3, p0, Lcom/roidapp/photogrid/release/qz;->C:Z

    .line 5413
    iget v0, p0, Lcom/roidapp/photogrid/release/qz;->j:F

    float-to-int v0, v0

    iput v0, p0, Lcom/roidapp/photogrid/release/qz;->D:I

    .line 5414
    iget v0, p0, Lcom/roidapp/photogrid/release/qz;->k:F

    float-to-int v0, v0

    iput v0, p0, Lcom/roidapp/photogrid/release/qz;->E:I

    .line 242
    iput-boolean v3, p0, Lcom/roidapp/photogrid/release/qz;->B:Z

    .line 257
    :cond_0
    :goto_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/qz;->G:Landroid/graphics/Bitmap;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/qz;->b:Landroid/graphics/Matrix;

    const/4 v3, 0x0

    invoke-virtual {p1, v0, v2, v3}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V

    .line 258
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/qz;->f:Z

    if-eqz v0, :cond_2

    .line 259
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 260
    iget-object v0, p0, Lcom/roidapp/photogrid/release/qz;->b:Landroid/graphics/Matrix;

    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 262
    iget-object v0, p0, Lcom/roidapp/photogrid/release/qz;->Z:Ljava/lang/Boolean;

    if-nez v0, :cond_1

    .line 263
    invoke-static {}, Lcom/roidapp/photogrid/common/bl;->a()Lcom/roidapp/photogrid/common/bl;

    invoke-static {p1}, Lcom/roidapp/photogrid/common/bl;->a(Landroid/graphics/Canvas;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/qz;->Z:Ljava/lang/Boolean;

    .line 266
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/qz;->Z:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_f

    .line 267
    iget v0, p0, Lcom/roidapp/photogrid/release/qz;->s:I

    int-to-float v3, v0

    iget-object v5, p0, Lcom/roidapp/photogrid/release/qz;->Y:Landroid/graphics/Paint;

    move-object v0, p1

    move v2, v1

    move v4, v1

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 268
    iget v0, p0, Lcom/roidapp/photogrid/release/qz;->s:I

    int-to-float v0, v0

    iget v2, p0, Lcom/roidapp/photogrid/release/qz;->H:F

    div-float/2addr v2, v9

    sub-float v3, v0, v2

    iget v0, p0, Lcom/roidapp/photogrid/release/qz;->s:I

    int-to-float v0, v0

    iget v2, p0, Lcom/roidapp/photogrid/release/qz;->H:F

    div-float/2addr v2, v9

    sub-float v5, v0, v2

    iget v0, p0, Lcom/roidapp/photogrid/release/qz;->t:I

    int-to-float v6, v0

    iget-object v7, p0, Lcom/roidapp/photogrid/release/qz;->Y:Landroid/graphics/Paint;

    move-object v2, p1

    move v4, v1

    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 269
    iget v0, p0, Lcom/roidapp/photogrid/release/qz;->s:I

    int-to-float v3, v0

    iget v0, p0, Lcom/roidapp/photogrid/release/qz;->t:I

    int-to-float v4, v0

    iget v0, p0, Lcom/roidapp/photogrid/release/qz;->t:I

    int-to-float v6, v0

    iget-object v7, p0, Lcom/roidapp/photogrid/release/qz;->Y:Landroid/graphics/Paint;

    move-object v2, p1

    move v5, v1

    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 270
    iget v0, p0, Lcom/roidapp/photogrid/release/qz;->H:F

    div-float v3, v0, v9

    iget v0, p0, Lcom/roidapp/photogrid/release/qz;->t:I

    int-to-float v4, v0

    iget v0, p0, Lcom/roidapp/photogrid/release/qz;->H:F

    div-float v5, v0, v9

    iget-object v7, p0, Lcom/roidapp/photogrid/release/qz;->Y:Landroid/graphics/Paint;

    move-object v2, p1

    move v6, v1

    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 282
    :goto_2
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 285
    :cond_2
    return-void

    .line 5378
    :cond_3
    const v0, 0x3e99999a    # 0.3f

    .line 5379
    iget v5, p0, Lcom/roidapp/photogrid/release/qz;->h:F

    const/high16 v6, 0x3f800000    # 1.0f

    cmpl-float v5, v5, v6

    if-lez v5, :cond_4

    .line 5380
    const v0, 0x3e99999a    # 0.3f

    iget v5, p0, Lcom/roidapp/photogrid/release/qz;->h:F

    mul-float/2addr v0, v5

    .line 5382
    :cond_4
    const v5, 0x3f333333    # 0.7f

    cmpl-float v5, v0, v5

    if-lez v5, :cond_5

    .line 5383
    const v0, 0x3f333333    # 0.7f

    .line 5386
    :cond_5
    const/16 v5, 0x12

    new-array v5, v5, [F

    .line 5387
    iget-object v6, p0, Lcom/roidapp/photogrid/release/qz;->F:Landroid/graphics/Matrix;

    invoke-virtual {v6}, Landroid/graphics/Matrix;->reset()V

    .line 5388
    iget-object v6, p0, Lcom/roidapp/photogrid/release/qz;->F:Landroid/graphics/Matrix;

    aget v7, v4, v8

    const/16 v8, 0x11

    aget v8, v4, v8

    invoke-virtual {v6, v0, v0, v7, v8}, Landroid/graphics/Matrix;->postScale(FFFF)Z

    .line 5389
    iget-object v0, p0, Lcom/roidapp/photogrid/release/qz;->F:Landroid/graphics/Matrix;

    invoke-virtual {v0, v5, v4}, Landroid/graphics/Matrix;->mapPoints([F[F)V

    .line 5391
    aget v0, v5, v2

    cmpl-float v0, v0, v1

    if-lez v0, :cond_6

    aget v0, v5, v2

    iget v4, p0, Lcom/roidapp/photogrid/release/qz;->c:I

    int-to-float v4, v4

    cmpg-float v0, v0, v4

    if-gez v0, :cond_6

    aget v0, v5, v3

    cmpl-float v0, v0, v1

    if-lez v0, :cond_6

    aget v0, v5, v3

    iget v4, p0, Lcom/roidapp/photogrid/release/qz;->d:I

    int-to-float v4, v4

    cmpg-float v0, v0, v4

    if-gez v0, :cond_6

    move v0, v2

    .line 5392
    goto/16 :goto_0

    .line 5393
    :cond_6
    const/4 v0, 0x2

    aget v0, v5, v0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_7

    const/4 v0, 0x2

    aget v0, v5, v0

    iget v4, p0, Lcom/roidapp/photogrid/release/qz;->c:I

    int-to-float v4, v4

    cmpg-float v0, v0, v4

    if-gez v0, :cond_7

    const/4 v0, 0x3

    aget v0, v5, v0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_7

    const/4 v0, 0x3

    aget v0, v5, v0

    iget v4, p0, Lcom/roidapp/photogrid/release/qz;->d:I

    int-to-float v4, v4

    cmpg-float v0, v0, v4

    if-gez v0, :cond_7

    move v0, v2

    .line 5394
    goto/16 :goto_0

    .line 5395
    :cond_7
    const/4 v0, 0x4

    aget v0, v5, v0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_8

    const/4 v0, 0x4

    aget v0, v5, v0

    iget v4, p0, Lcom/roidapp/photogrid/release/qz;->c:I

    int-to-float v4, v4

    cmpg-float v0, v0, v4

    if-gez v0, :cond_8

    const/4 v0, 0x5

    aget v0, v5, v0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_8

    const/4 v0, 0x5

    aget v0, v5, v0

    iget v4, p0, Lcom/roidapp/photogrid/release/qz;->d:I

    int-to-float v4, v4

    cmpg-float v0, v0, v4

    if-gez v0, :cond_8

    move v0, v2

    .line 5396
    goto/16 :goto_0

    .line 5397
    :cond_8
    const/4 v0, 0x6

    aget v0, v5, v0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_9

    const/4 v0, 0x6

    aget v0, v5, v0

    iget v4, p0, Lcom/roidapp/photogrid/release/qz;->c:I

    int-to-float v4, v4

    cmpg-float v0, v0, v4

    if-gez v0, :cond_9

    const/4 v0, 0x7

    aget v0, v5, v0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_9

    const/4 v0, 0x7

    aget v0, v5, v0

    iget v4, p0, Lcom/roidapp/photogrid/release/qz;->d:I

    int-to-float v4, v4

    cmpg-float v0, v0, v4

    if-gez v0, :cond_9

    move v0, v2

    .line 5398
    goto/16 :goto_0

    .line 5399
    :cond_9
    const/16 v0, 0x8

    aget v0, v5, v0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_a

    const/16 v0, 0x8

    aget v0, v5, v0

    iget v4, p0, Lcom/roidapp/photogrid/release/qz;->c:I

    int-to-float v4, v4

    cmpg-float v0, v0, v4

    if-gez v0, :cond_a

    const/16 v0, 0x9

    aget v0, v5, v0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_a

    const/16 v0, 0x9

    aget v0, v5, v0

    iget v4, p0, Lcom/roidapp/photogrid/release/qz;->d:I

    int-to-float v4, v4

    cmpg-float v0, v0, v4

    if-gez v0, :cond_a

    move v0, v2

    .line 5400
    goto/16 :goto_0

    .line 5401
    :cond_a
    const/16 v0, 0xa

    aget v0, v5, v0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_b

    const/16 v0, 0xa

    aget v0, v5, v0

    iget v4, p0, Lcom/roidapp/photogrid/release/qz;->c:I

    int-to-float v4, v4

    cmpg-float v0, v0, v4

    if-gez v0, :cond_b

    const/16 v0, 0xb

    aget v0, v5, v0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_b

    const/16 v0, 0xb

    aget v0, v5, v0

    iget v4, p0, Lcom/roidapp/photogrid/release/qz;->d:I

    int-to-float v4, v4

    cmpg-float v0, v0, v4

    if-gez v0, :cond_b

    move v0, v2

    .line 5402
    goto/16 :goto_0

    .line 5403
    :cond_b
    const/16 v0, 0xc

    aget v0, v5, v0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_c

    const/16 v0, 0xc

    aget v0, v5, v0

    iget v4, p0, Lcom/roidapp/photogrid/release/qz;->c:I

    int-to-float v4, v4

    cmpg-float v0, v0, v4

    if-gez v0, :cond_c

    const/16 v0, 0xd

    aget v0, v5, v0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_c

    const/16 v0, 0xd

    aget v0, v5, v0

    iget v4, p0, Lcom/roidapp/photogrid/release/qz;->d:I

    int-to-float v4, v4

    cmpg-float v0, v0, v4

    if-gez v0, :cond_c

    move v0, v2

    .line 5404
    goto/16 :goto_0

    .line 5405
    :cond_c
    const/16 v0, 0xe

    aget v0, v5, v0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_d

    const/16 v0, 0xe

    aget v0, v5, v0

    iget v4, p0, Lcom/roidapp/photogrid/release/qz;->c:I

    int-to-float v4, v4

    cmpg-float v0, v0, v4

    if-gez v0, :cond_d

    const/16 v0, 0xf

    aget v0, v5, v0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_d

    const/16 v0, 0xf

    aget v0, v5, v0

    iget v4, p0, Lcom/roidapp/photogrid/release/qz;->d:I

    int-to-float v4, v4

    cmpg-float v0, v0, v4

    if-gez v0, :cond_d

    move v0, v2

    .line 5406
    goto/16 :goto_0

    :cond_d
    move v0, v3

    .line 5408
    goto/16 :goto_0

    .line 245
    :cond_e
    iput-boolean v2, p0, Lcom/roidapp/photogrid/release/qz;->B:Z

    .line 246
    iput-boolean v2, p0, Lcom/roidapp/photogrid/release/qz;->C:Z

    goto/16 :goto_1

    .line 272
    :cond_f
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    .line 273
    invoke-virtual {v0, v1, v1}, Landroid/graphics/Path;->moveTo(FF)V

    .line 274
    iget v2, p0, Lcom/roidapp/photogrid/release/qz;->s:I

    int-to-float v2, v2

    invoke-virtual {v0, v2, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 275
    iget v2, p0, Lcom/roidapp/photogrid/release/qz;->s:I

    int-to-float v2, v2

    iget v3, p0, Lcom/roidapp/photogrid/release/qz;->t:I

    int-to-float v3, v3

    invoke-virtual {v0, v2, v3}, Landroid/graphics/Path;->lineTo(FF)V

    .line 276
    iget v2, p0, Lcom/roidapp/photogrid/release/qz;->t:I

    int-to-float v2, v2

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V

    .line 277
    invoke-virtual {v0}, Landroid/graphics/Path;->close()V

    .line 278
    iget-object v1, p0, Lcom/roidapp/photogrid/release/qz;->Y:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    goto/16 :goto_2
.end method

.method public final a(F)Z
    .locals 8

    .prologue
    const/4 v2, 0x1

    const/4 v3, 0x0

    .line 335
    new-instance v1, Landroid/graphics/Matrix;

    iget-object v0, p0, Lcom/roidapp/photogrid/release/qz;->b:Landroid/graphics/Matrix;

    invoke-direct {v1, v0}, Landroid/graphics/Matrix;-><init>(Landroid/graphics/Matrix;)V

    .line 336
    iget-object v0, p0, Lcom/roidapp/photogrid/release/qz;->o:[F

    const/16 v4, 0x10

    aget v0, v0, v4

    iget-object v4, p0, Lcom/roidapp/photogrid/release/qz;->o:[F

    const/16 v5, 0x11

    aget v4, v4, v5

    invoke-virtual {v1, p1, p1, v0, v4}, Landroid/graphics/Matrix;->postScale(FFFF)Z

    .line 337
    iget-object v0, p0, Lcom/roidapp/photogrid/release/qz;->n:[F

    invoke-virtual {v0}, [F->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [F

    .line 338
    iget-object v4, p0, Lcom/roidapp/photogrid/release/qz;->n:[F

    invoke-virtual {v1, v0, v4}, Landroid/graphics/Matrix;->mapPoints([F[F)V

    .line 339
    aget v1, v0, v3

    aget v4, v0, v2

    const/16 v5, 0xc

    aget v5, v0, v5

    const/16 v6, 0xd

    aget v6, v0, v6

    invoke-static {v1, v4, v5, v6}, Lcom/roidapp/photogrid/release/qz;->a(FFFF)F

    move-result v1

    .line 340
    aget v4, v0, v3

    aget v5, v0, v2

    const/4 v6, 0x4

    aget v6, v0, v6

    const/4 v7, 0x5

    aget v0, v0, v7

    invoke-static {v4, v5, v6, v0}, Lcom/roidapp/photogrid/release/qz;->a(FFFF)F

    move-result v0

    .line 341
    cmpl-float v4, v1, v0

    if-ltz v4, :cond_0

    move v0, v1

    .line 342
    :cond_0
    iget v1, p0, Lcom/roidapp/photogrid/release/qz;->d:I

    iget v4, p0, Lcom/roidapp/photogrid/release/qz;->c:I

    if-lt v1, v4, :cond_1

    iget v1, p0, Lcom/roidapp/photogrid/release/qz;->d:I

    .line 343
    :goto_0
    int-to-float v1, v1

    cmpg-float v0, v0, v1

    if-gtz v0, :cond_2

    .line 344
    iget v0, p0, Lcom/roidapp/photogrid/release/qz;->h:F

    mul-float/2addr v0, p1

    iput v0, p0, Lcom/roidapp/photogrid/release/qz;->h:F

    .line 345
    iget v0, p0, Lcom/roidapp/photogrid/release/qz;->h:F

    iput v0, p0, Lcom/roidapp/photogrid/release/qz;->u:F

    move v0, v2

    .line 348
    :goto_1
    return v0

    .line 342
    :cond_1
    iget v1, p0, Lcom/roidapp/photogrid/release/qz;->c:I

    goto :goto_0

    :cond_2
    move v0, v3

    .line 348
    goto :goto_1
.end method

.method public final b()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 419
    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/qz;->C:Z

    .line 420
    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/qz;->B:Z

    .line 421
    iget v0, p0, Lcom/roidapp/photogrid/release/qz;->D:I

    int-to-float v0, v0

    iput v0, p0, Lcom/roidapp/photogrid/release/qz;->j:F

    .line 422
    iget v0, p0, Lcom/roidapp/photogrid/release/qz;->E:I

    int-to-float v0, v0

    iput v0, p0, Lcom/roidapp/photogrid/release/qz;->k:F

    .line 423
    return-void
.end method

.method public final b(FF)V
    .locals 1

    .prologue
    .line 329
    iget v0, p0, Lcom/roidapp/photogrid/release/qz;->k:F

    add-float/2addr v0, p2

    iput v0, p0, Lcom/roidapp/photogrid/release/qz;->k:F

    .line 330
    iget v0, p0, Lcom/roidapp/photogrid/release/qz;->j:F

    add-float/2addr v0, p1

    iput v0, p0, Lcom/roidapp/photogrid/release/qz;->j:F

    .line 331
    return-void
.end method

.method public final g()V
    .locals 11

    .prologue
    const/4 v10, 0x2

    const/4 v9, 0x1

    const/4 v8, 0x0

    const/4 v7, 0x0

    const/high16 v6, 0x40000000    # 2.0f

    .line 61
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/qz;->a()V

    .line 63
    iget v0, p0, Lcom/roidapp/photogrid/release/qz;->c:I

    int-to-float v0, v0

    iget v1, p0, Lcom/roidapp/photogrid/release/qz;->O:F

    mul-float/2addr v0, v1

    .line 64
    iget v1, p0, Lcom/roidapp/photogrid/release/qz;->c:I

    iget v2, p0, Lcom/roidapp/photogrid/release/qz;->d:I

    if-le v1, v2, :cond_0

    .line 65
    iget v0, p0, Lcom/roidapp/photogrid/release/qz;->d:I

    int-to-float v0, v0

    iget v1, p0, Lcom/roidapp/photogrid/release/qz;->O:F

    mul-float/2addr v0, v1

    .line 67
    :cond_0
    const/4 v1, 0x0

    .line 69
    iget v2, p0, Lcom/roidapp/photogrid/release/qz;->V:I

    packed-switch v2, :pswitch_data_0

    .line 110
    :goto_0
    if-nez v1, :cond_2

    .line 111
    new-instance v0, Ljava/lang/OutOfMemoryError;

    const-string v1, "sticker create bitmap null"

    invoke-direct {v0, v1}, Ljava/lang/OutOfMemoryError;-><init>(Ljava/lang/String;)V

    throw v0

    .line 71
    :pswitch_0
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/qz;->a:Landroid/content/Context;

    iget v2, p0, Lcom/roidapp/photogrid/release/qz;->L:I

    invoke-static {v1, v2, v0}, Lcom/roidapp/photogrid/release/rf;->a(Landroid/content/Context;IF)Landroid/graphics/Bitmap;

    move-result-object v1

    goto :goto_0

    .line 74
    :pswitch_1
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/qz;->K:Ljava/lang/String;

    invoke-static {v1, v0}, Lcom/roidapp/photogrid/release/rf;->b(Ljava/lang/String;F)Landroid/graphics/Bitmap;

    move-result-object v1

    goto :goto_0

    .line 79
    :pswitch_2
    :try_start_0
    iget-object v1, p0, Lcom/roidapp/photogrid/release/qz;->a:Landroid/content/Context;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/qz;->R:Ljava/lang/String;

    const/4 v3, 0x2

    invoke-virtual {v1, v2, v3}, Landroid/content/Context;->createPackageContext(Ljava/lang/String;I)Landroid/content/Context;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    .line 84
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/qz;->Q:Ljava/lang/String;

    invoke-static {v1, v2, v0}, Lcom/roidapp/photogrid/release/rf;->a(Landroid/content/Context;Ljava/lang/String;F)Landroid/graphics/Bitmap;

    move-result-object v1

    goto :goto_0

    .line 81
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Landroid/content/pm/PackageManager$NameNotFoundException;->printStackTrace()V

    .line 125
    :cond_1
    :goto_1
    return-void

    .line 88
    :pswitch_3
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/qz;->Q:Ljava/lang/String;

    invoke-static {v1, v0}, Lcom/roidapp/photogrid/release/rf;->a(Ljava/lang/String;F)Landroid/graphics/Bitmap;

    move-result-object v1

    goto :goto_0

    .line 114
    :cond_2
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v3

    if-le v2, v3, :cond_3

    .line 115
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    int-to-float v2, v2

    div-float/2addr v0, v2

    .line 119
    :goto_2
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    .line 3590
    invoke-static {v1, v0, v0}, Lcom/roidapp/photogrid/release/rf;->a(Landroid/graphics/Bitmap;FF)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 119
    iput-object v0, p0, Lcom/roidapp/photogrid/release/qz;->G:Landroid/graphics/Bitmap;

    .line 120
    iget-object v0, p0, Lcom/roidapp/photogrid/release/qz;->G:Landroid/graphics/Bitmap;

    if-nez v0, :cond_4

    .line 121
    new-instance v0, Ljava/lang/OutOfMemoryError;

    const-string v1, "sticker create bitmap null"

    invoke-direct {v0, v1}, Ljava/lang/OutOfMemoryError;-><init>(Ljava/lang/String;)V

    throw v0

    .line 117
    :cond_3
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    int-to-float v2, v2

    div-float/2addr v0, v2

    goto :goto_2

    .line 123
    :cond_4
    iget-object v0, p0, Lcom/roidapp/photogrid/release/qz;->G:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/qz;->G:Landroid/graphics/Bitmap;

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    .line 4216
    int-to-float v0, v0

    iget v2, p0, Lcom/roidapp/photogrid/release/qz;->H:F

    mul-float/2addr v2, v6

    add-float/2addr v0, v2

    float-to-int v0, v0

    iput v0, p0, Lcom/roidapp/photogrid/release/qz;->s:I

    .line 4217
    int-to-float v0, v1

    iget v1, p0, Lcom/roidapp/photogrid/release/qz;->H:F

    mul-float/2addr v1, v6

    add-float/2addr v0, v1

    float-to-int v0, v0

    iput v0, p0, Lcom/roidapp/photogrid/release/qz;->t:I

    .line 5184
    iget-object v0, p0, Lcom/roidapp/photogrid/release/qz;->G:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/roidapp/photogrid/release/qz;->G:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_5

    .line 5185
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    iget-object v0, p0, Lcom/roidapp/photogrid/release/qz;->G:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    int-to-float v0, v0

    iget v1, p0, Lcom/roidapp/photogrid/release/qz;->H:F

    mul-float/2addr v1, v6

    add-float/2addr v0, v1

    float-to-int v0, v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/qz;->G:Landroid/graphics/Bitmap;

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    int-to-float v1, v1

    iget v2, p0, Lcom/roidapp/photogrid/release/qz;->H:F

    mul-float/2addr v2, v6

    add-float/2addr v1, v2

    float-to-int v1, v1

    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v0, v1, v2}, Lcom/roidapp/photogrid/release/rf;->a(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 5186
    if-eqz v0, :cond_1

    .line 5189
    new-instance v1, Landroid/graphics/Canvas;

    invoke-direct {v1, v0}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 5190
    new-instance v2, Landroid/graphics/PaintFlagsDrawFilter;

    const/4 v3, 0x3

    invoke-direct {v2, v8, v3}, Landroid/graphics/PaintFlagsDrawFilter;-><init>(II)V

    invoke-virtual {v1, v2}, Landroid/graphics/Canvas;->setDrawFilter(Landroid/graphics/DrawFilter;)V

    .line 5191
    new-instance v2, Landroid/graphics/Paint;

    invoke-direct {v2}, Landroid/graphics/Paint;-><init>()V

    .line 5192
    invoke-virtual {v2, v9}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 5193
    invoke-virtual {v2, v8}, Landroid/graphics/Paint;->setColor(I)V

    .line 5194
    iget-object v2, p0, Lcom/roidapp/photogrid/release/qz;->G:Landroid/graphics/Bitmap;

    iget v3, p0, Lcom/roidapp/photogrid/release/qz;->H:F

    iget v4, p0, Lcom/roidapp/photogrid/release/qz;->H:F

    const/4 v5, 0x0

    invoke-virtual {v1, v2, v3, v4, v5}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 5195
    iget-object v1, p0, Lcom/roidapp/photogrid/release/qz;->G:Landroid/graphics/Bitmap;

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V

    .line 5196
    iput-object v0, p0, Lcom/roidapp/photogrid/release/qz;->G:Landroid/graphics/Bitmap;

    .line 5198
    :cond_5
    iget-object v0, p0, Lcom/roidapp/photogrid/release/qz;->G:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_1

    .line 5199
    iget-object v0, p0, Lcom/roidapp/photogrid/release/qz;->G:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    .line 5200
    iget-object v0, p0, Lcom/roidapp/photogrid/release/qz;->G:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    .line 5201
    const/16 v0, 0x12

    new-array v0, v0, [F

    aput v7, v0, v8

    aput v7, v0, v9

    int-to-float v3, v1

    div-float/2addr v3, v6

    aput v3, v0, v10

    const/4 v3, 0x3

    aput v7, v0, v3

    const/4 v3, 0x4

    int-to-float v4, v1

    aput v4, v0, v3

    const/4 v3, 0x5

    aput v7, v0, v3

    const/4 v3, 0x6

    int-to-float v4, v1

    aput v4, v0, v3

    const/4 v3, 0x7

    int-to-float v4, v2

    div-float/2addr v4, v6

    aput v4, v0, v3

    const/16 v3, 0x8

    int-to-float v4, v1

    aput v4, v0, v3

    const/16 v3, 0x9

    int-to-float v4, v2

    aput v4, v0, v3

    const/16 v3, 0xa

    int-to-float v4, v1

    div-float/2addr v4, v6

    aput v4, v0, v3

    const/16 v3, 0xb

    int-to-float v4, v2

    aput v4, v0, v3

    const/16 v3, 0xc

    aput v7, v0, v3

    const/16 v3, 0xd

    int-to-float v4, v2

    aput v4, v0, v3

    const/16 v3, 0xe

    aput v7, v0, v3

    const/16 v3, 0xf

    int-to-float v4, v2

    div-float/2addr v4, v6

    aput v4, v0, v3

    const/16 v3, 0x10

    int-to-float v4, v1

    div-float/2addr v4, v6

    aput v4, v0, v3

    const/16 v3, 0x11

    int-to-float v4, v2

    div-float/2addr v4, v6

    aput v4, v0, v3

    iput-object v0, p0, Lcom/roidapp/photogrid/release/qz;->n:[F

    .line 5205
    iget-object v0, p0, Lcom/roidapp/photogrid/release/qz;->n:[F

    invoke-virtual {v0}, [F->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [F

    iput-object v0, p0, Lcom/roidapp/photogrid/release/qz;->o:[F

    .line 5206
    iget v0, p0, Lcom/roidapp/photogrid/release/qz;->M:F

    iget v3, p0, Lcom/roidapp/photogrid/release/qz;->c:I

    int-to-float v3, v3

    mul-float/2addr v0, v3

    int-to-float v1, v1

    div-float/2addr v1, v6

    sub-float/2addr v0, v1

    iput v0, p0, Lcom/roidapp/photogrid/release/qz;->v:F

    .line 5207
    iget v0, p0, Lcom/roidapp/photogrid/release/qz;->N:F

    iget v1, p0, Lcom/roidapp/photogrid/release/qz;->d:I

    int-to-float v1, v1

    mul-float/2addr v0, v1

    int-to-float v1, v2

    div-float/2addr v1, v6

    sub-float/2addr v0, v1

    iput v0, p0, Lcom/roidapp/photogrid/release/qz;->w:F

    goto/16 :goto_1

    .line 69
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_2
        :pswitch_1
        :pswitch_3
    .end packed-switch
.end method
