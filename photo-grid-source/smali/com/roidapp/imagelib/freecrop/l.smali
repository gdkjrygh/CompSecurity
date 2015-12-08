.class public abstract Lcom/roidapp/imagelib/freecrop/l;
.super Lcom/roidapp/imagelib/freecrop/m;
.source "SourceFile"


# instance fields
.field private G:Lcom/roidapp/imagelib/freecrop/c;

.field private H:Landroid/graphics/Paint;

.field private I:Landroid/graphics/Paint;

.field private J:Landroid/graphics/Paint;

.field private K:F

.field private L:I

.field protected a:Landroid/graphics/Bitmap;

.field protected b:Z

.field protected c:Z

.field protected d:I

.field protected e:I

.field protected f:Landroid/graphics/Bitmap;

.field protected g:Landroid/graphics/RectF;

.field public h:Lcom/roidapp/imagelib/freecrop/a;

.field protected i:Landroid/graphics/Rect;

.field protected j:Landroid/view/View;

.field protected k:Landroid/content/Context;

.field protected l:Landroid/graphics/Paint;

.field protected m:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/graphics/Bitmap;II)V
    .locals 6

    .prologue
    const/16 v5, 0x32

    const/high16 v4, 0x40000000    # 2.0f

    .line 74
    invoke-direct {p0}, Lcom/roidapp/imagelib/freecrop/m;-><init>()V

    .line 42
    const/16 v0, 0x8

    iput v0, p0, Lcom/roidapp/imagelib/freecrop/l;->L:I

    .line 43
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/imagelib/freecrop/l;->h:Lcom/roidapp/imagelib/freecrop/a;

    .line 44
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lcom/roidapp/imagelib/freecrop/l;->i:Landroid/graphics/Rect;

    .line 47
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/roidapp/imagelib/freecrop/l;->l:Landroid/graphics/Paint;

    .line 48
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/imagelib/freecrop/l;->m:Z

    .line 75
    iput-object p1, p0, Lcom/roidapp/imagelib/freecrop/l;->k:Landroid/content/Context;

    .line 76
    iput-object p2, p0, Lcom/roidapp/imagelib/freecrop/l;->a:Landroid/graphics/Bitmap;

    .line 1081
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/l;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    iput v0, p0, Lcom/roidapp/imagelib/freecrop/l;->r:I

    .line 1082
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/l;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v0

    iput v0, p0, Lcom/roidapp/imagelib/freecrop/l;->q:I

    .line 1083
    int-to-float v0, p3

    iget v1, p0, Lcom/roidapp/imagelib/freecrop/l;->r:I

    int-to-float v1, v1

    div-float/2addr v0, v1

    int-to-float v1, p4

    iget v2, p0, Lcom/roidapp/imagelib/freecrop/l;->q:I

    int-to-float v2, v2

    div-float/2addr v1, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->min(FF)F

    move-result v0

    .line 1084
    int-to-float v1, p3

    div-float/2addr v1, v4

    iget v2, p0, Lcom/roidapp/imagelib/freecrop/l;->r:I

    int-to-float v2, v2

    mul-float/2addr v2, v0

    div-float/2addr v2, v4

    sub-float/2addr v1, v2

    int-to-float v2, p4

    div-float/2addr v2, v4

    iget v3, p0, Lcom/roidapp/imagelib/freecrop/l;->q:I

    int-to-float v3, v3

    mul-float/2addr v3, v0

    div-float/2addr v3, v4

    sub-float/2addr v2, v3

    invoke-virtual {p0, v1, v2, v0}, Lcom/roidapp/imagelib/freecrop/l;->a(FFF)V

    .line 1085
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/l;->l:Landroid/graphics/Paint;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1, v5, v5, v5}, Landroid/graphics/Paint;->setARGB(IIII)V

    .line 1086
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/l;->l:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 78
    return-void
.end method

.method private a()Landroid/graphics/Bitmap;
    .locals 8

    .prologue
    const/4 v0, 0x0

    .line 198
    .line 200
    :try_start_0
    iget v1, p0, Lcom/roidapp/imagelib/freecrop/l;->d:I

    iget v2, p0, Lcom/roidapp/imagelib/freecrop/l;->e:I

    sget-object v3, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v1, v2, v3}, Lcom/roidapp/imagelib/b/c;->a(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v1

    .line 201
    if-nez v1, :cond_0

    .line 231
    :goto_0
    return-object v0

    .line 203
    :cond_0
    :try_start_1
    new-instance v2, Landroid/graphics/Canvas;

    invoke-direct {v2, v1}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 204
    iget-object v3, p0, Lcom/roidapp/imagelib/freecrop/l;->a:Landroid/graphics/Bitmap;

    iget-object v4, p0, Lcom/roidapp/imagelib/freecrop/l;->g:Landroid/graphics/RectF;

    iget v4, v4, Landroid/graphics/RectF;->left:F

    neg-float v4, v4

    iget-object v5, p0, Lcom/roidapp/imagelib/freecrop/l;->g:Landroid/graphics/RectF;

    iget v5, v5, Landroid/graphics/RectF;->top:F

    neg-float v5, v5

    const/4 v6, 0x0

    invoke-virtual {v2, v3, v4, v5, v6}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 206
    iget-boolean v3, p0, Lcom/roidapp/imagelib/freecrop/l;->b:Z

    if-eqz v3, :cond_2

    .line 207
    iget-object v3, p0, Lcom/roidapp/imagelib/freecrop/l;->I:Landroid/graphics/Paint;

    if-nez v3, :cond_1

    .line 1188
    new-instance v3, Landroid/graphics/Paint;

    invoke-direct {v3}, Landroid/graphics/Paint;-><init>()V

    iput-object v3, p0, Lcom/roidapp/imagelib/freecrop/l;->I:Landroid/graphics/Paint;

    .line 1189
    iget-object v3, p0, Lcom/roidapp/imagelib/freecrop/l;->I:Landroid/graphics/Paint;

    const/4 v4, -0x1

    invoke-virtual {v3, v4}, Landroid/graphics/Paint;->setColor(I)V

    .line 1190
    iget-object v3, p0, Lcom/roidapp/imagelib/freecrop/l;->I:Landroid/graphics/Paint;

    iget v4, p0, Lcom/roidapp/imagelib/freecrop/l;->K:F

    invoke-virtual {v3, v4}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 1191
    iget-object v3, p0, Lcom/roidapp/imagelib/freecrop/l;->I:Landroid/graphics/Paint;

    sget-object v4, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v3, v4}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 1192
    iget-object v3, p0, Lcom/roidapp/imagelib/freecrop/l;->I:Landroid/graphics/Paint;

    const/4 v4, 0x1

    invoke-virtual {v3, v4}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 209
    :cond_1
    iget-object v3, p0, Lcom/roidapp/imagelib/freecrop/l;->G:Lcom/roidapp/imagelib/freecrop/c;

    iget-object v4, p0, Lcom/roidapp/imagelib/freecrop/l;->I:Landroid/graphics/Paint;

    invoke-virtual {v2, v3, v4}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 211
    :cond_2
    iget-object v3, p0, Lcom/roidapp/imagelib/freecrop/l;->f:Landroid/graphics/Bitmap;

    if-eqz v3, :cond_3

    iget-object v3, p0, Lcom/roidapp/imagelib/freecrop/l;->f:Landroid/graphics/Bitmap;

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v3

    if-nez v3, :cond_3

    .line 212
    invoke-virtual {v2}, Landroid/graphics/Canvas;->save()I

    .line 213
    iget-object v3, p0, Lcom/roidapp/imagelib/freecrop/l;->f:Landroid/graphics/Bitmap;

    const/4 v4, 0x0

    const/4 v5, 0x0

    iget-object v6, p0, Lcom/roidapp/imagelib/freecrop/l;->H:Landroid/graphics/Paint;

    invoke-virtual {v2, v3, v4, v5, v6}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 214
    invoke-virtual {v2}, Landroid/graphics/Canvas;->restore()V

    .line 216
    :cond_3
    iget-boolean v3, p0, Lcom/roidapp/imagelib/freecrop/l;->c:Z

    if-eqz v3, :cond_5

    .line 217
    iget-object v3, p0, Lcom/roidapp/imagelib/freecrop/l;->J:Landroid/graphics/Paint;

    if-nez v3, :cond_4

    .line 2180
    new-instance v3, Landroid/graphics/Paint;

    invoke-direct {v3}, Landroid/graphics/Paint;-><init>()V

    iput-object v3, p0, Lcom/roidapp/imagelib/freecrop/l;->J:Landroid/graphics/Paint;

    .line 2181
    new-instance v3, Landroid/graphics/BlurMaskFilter;

    iget v4, p0, Lcom/roidapp/imagelib/freecrop/l;->L:I

    int-to-float v4, v4

    sget-object v5, Landroid/graphics/BlurMaskFilter$Blur;->OUTER:Landroid/graphics/BlurMaskFilter$Blur;

    invoke-direct {v3, v4, v5}, Landroid/graphics/BlurMaskFilter;-><init>(FLandroid/graphics/BlurMaskFilter$Blur;)V

    .line 2182
    iget-object v4, p0, Lcom/roidapp/imagelib/freecrop/l;->J:Landroid/graphics/Paint;

    const/4 v5, 0x1

    invoke-virtual {v4, v5}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 2183
    iget-object v4, p0, Lcom/roidapp/imagelib/freecrop/l;->J:Landroid/graphics/Paint;

    const/4 v5, 0x1

    invoke-virtual {v4, v5}, Landroid/graphics/Paint;->setFilterBitmap(Z)V

    .line 2184
    iget-object v4, p0, Lcom/roidapp/imagelib/freecrop/l;->J:Landroid/graphics/Paint;

    invoke-virtual {v4, v3}, Landroid/graphics/Paint;->setMaskFilter(Landroid/graphics/MaskFilter;)Landroid/graphics/MaskFilter;

    .line 2185
    iget-object v3, p0, Lcom/roidapp/imagelib/freecrop/l;->J:Landroid/graphics/Paint;

    const/high16 v4, -0x1000000

    invoke-virtual {v3, v4}, Landroid/graphics/Paint;->setColor(I)V

    .line 219
    :cond_4
    iget-object v3, p0, Lcom/roidapp/imagelib/freecrop/l;->G:Lcom/roidapp/imagelib/freecrop/c;

    iget-object v4, p0, Lcom/roidapp/imagelib/freecrop/l;->J:Landroid/graphics/Paint;

    invoke-virtual {v2, v3, v4}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V
    :try_end_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2

    :cond_5
    move-object v0, v1

    .line 231
    goto/16 :goto_0

    .line 222
    :catch_0
    move-exception v1

    move-object v2, v0

    :goto_1
    invoke-virtual {v1}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    .line 223
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 224
    invoke-static {v2}, Lcom/roidapp/imagelib/b/c;->a(Landroid/graphics/Bitmap;)V

    goto/16 :goto_0

    .line 227
    :catch_1
    move-exception v1

    move-object v2, v0

    :goto_2
    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    .line 228
    invoke-static {v2}, Lcom/roidapp/imagelib/b/c;->a(Landroid/graphics/Bitmap;)V

    goto/16 :goto_0

    .line 227
    :catch_2
    move-exception v2

    move-object v7, v2

    move-object v2, v1

    move-object v1, v7

    goto :goto_2

    .line 222
    :catch_3
    move-exception v2

    move-object v7, v2

    move-object v2, v1

    move-object v1, v7

    goto :goto_1
.end method


# virtual methods
.method public a(Landroid/graphics/Canvas;Landroid/graphics/Matrix;Z)V
    .locals 3

    .prologue
    .line 116
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/l;->j:Landroid/view/View;

    iget-object v1, p0, Lcom/roidapp/imagelib/freecrop/l;->i:Landroid/graphics/Rect;

    invoke-virtual {v0, v1}, Landroid/view/View;->getDrawingRect(Landroid/graphics/Rect;)V

    .line 118
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/l;->f:Landroid/graphics/Bitmap;

    if-nez v0, :cond_1

    .line 120
    if-eqz p3, :cond_0

    .line 121
    invoke-virtual {p1, p2}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 126
    :cond_0
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/l;->a:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/l;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/l;->t:Landroid/graphics/Matrix;

    if-eqz v0, :cond_1

    .line 127
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/l;->a:Landroid/graphics/Bitmap;

    iget-object v1, p0, Lcom/roidapp/imagelib/freecrop/l;->t:Landroid/graphics/Matrix;

    const/4 v2, 0x0

    invoke-virtual {p1, v0, v1, v2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V

    .line 144
    :cond_1
    return-void
.end method

.method public a(Lcom/roidapp/imagelib/freecrop/FreeCropView;)V
    .locals 0

    .prologue
    .line 105
    iput-object p1, p0, Lcom/roidapp/imagelib/freecrop/l;->j:Landroid/view/View;

    .line 107
    return-void
.end method

.method public final a(Z)V
    .locals 0

    .prologue
    .line 91
    iput-boolean p1, p0, Lcom/roidapp/imagelib/freecrop/l;->m:Z

    .line 92
    return-void
.end method

.method public final a([F)V
    .locals 5

    .prologue
    const/4 v4, 0x0

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 236
    aget v0, p1, v2

    aget v1, p1, v3

    invoke-virtual {p0, v0, v1}, Lcom/roidapp/imagelib/freecrop/l;->c(FF)Z

    move-result v0

    if-nez v0, :cond_3

    .line 238
    aget v0, p1, v2

    iget v1, p0, Lcom/roidapp/imagelib/freecrop/l;->r:I

    int-to-float v1, v1

    cmpl-float v0, v0, v1

    if-lez v0, :cond_0

    .line 239
    iget v0, p0, Lcom/roidapp/imagelib/freecrop/l;->r:I

    int-to-float v0, v0

    aput v0, p1, v2

    .line 240
    :cond_0
    aget v0, p1, v3

    iget v1, p0, Lcom/roidapp/imagelib/freecrop/l;->q:I

    int-to-float v1, v1

    cmpl-float v0, v0, v1

    if-lez v0, :cond_1

    .line 241
    iget v0, p0, Lcom/roidapp/imagelib/freecrop/l;->q:I

    int-to-float v0, v0

    aput v0, p1, v3

    .line 242
    :cond_1
    aget v0, p1, v2

    cmpg-float v0, v0, v4

    if-gez v0, :cond_2

    .line 243
    aput v4, p1, v2

    .line 244
    :cond_2
    aget v0, p1, v3

    cmpg-float v0, v0, v4

    if-gez v0, :cond_3

    .line 245
    aput v4, p1, v3

    .line 249
    :cond_3
    return-void
.end method

.method public a(FF)Z
    .locals 1

    .prologue
    .line 274
    const/4 v0, 0x0

    return v0
.end method

.method public a(FFFF)Z
    .locals 1

    .prologue
    .line 286
    const/4 v0, 0x0

    return v0
.end method

.method public c()Z
    .locals 3

    .prologue
    .line 161
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/roidapp/imagelib/freecrop/l;->H:Landroid/graphics/Paint;

    .line 162
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/l;->H:Landroid/graphics/Paint;

    const/high16 v1, -0x1000000

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 163
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/l;->H:Landroid/graphics/Paint;

    new-instance v1, Landroid/graphics/PorterDuffXfermode;

    sget-object v2, Landroid/graphics/PorterDuff$Mode;->DST_IN:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v1, v2}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 164
    const/4 v0, 0x1

    return v0
.end method

.method public d()Z
    .locals 1

    .prologue
    .line 280
    const/4 v0, 0x0

    return v0
.end method

.method public final e()Landroid/graphics/Bitmap;
    .locals 1

    .prologue
    .line 101
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/l;->a:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method public final f()Landroid/graphics/Bitmap;
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 169
    invoke-virtual {p0}, Lcom/roidapp/imagelib/freecrop/l;->c()Z

    move-result v0

    if-nez v0, :cond_0

    .line 170
    const/4 v0, 0x0

    .line 176
    :goto_0
    return-object v0

    .line 171
    :cond_0
    iput-boolean v1, p0, Lcom/roidapp/imagelib/freecrop/l;->b:Z

    .line 172
    iput-boolean v1, p0, Lcom/roidapp/imagelib/freecrop/l;->c:Z

    .line 173
    invoke-direct {p0}, Lcom/roidapp/imagelib/freecrop/l;->a()Landroid/graphics/Bitmap;

    move-result-object v0

    .line 174
    iget-object v1, p0, Lcom/roidapp/imagelib/freecrop/l;->f:Landroid/graphics/Bitmap;

    invoke-static {v1}, Lcom/roidapp/imagelib/b/c;->a(Landroid/graphics/Bitmap;)V

    goto :goto_0
.end method
