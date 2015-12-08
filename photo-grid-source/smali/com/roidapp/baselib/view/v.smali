.class public final Lcom/roidapp/baselib/view/v;
.super Landroid/graphics/drawable/Drawable;
.source "SourceFile"


# instance fields
.field a:Landroid/graphics/Bitmap;

.field final b:Landroid/graphics/Rect;

.field final c:Landroid/graphics/RectF;

.field private d:I

.field private e:I

.field private f:Landroid/graphics/Paint;

.field private g:Landroid/graphics/BitmapShader;

.field private h:F

.field private i:Z

.field private j:I

.field private k:I


# direct methods
.method public constructor <init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V
    .locals 4

    .prologue
    .line 317
    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    .line 49
    const/16 v0, 0xa0

    iput v0, p0, Lcom/roidapp/baselib/view/v;->d:I

    .line 50
    const/16 v0, 0x77

    iput v0, p0, Lcom/roidapp/baselib/view/v;->e:I

    .line 51
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x6

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lcom/roidapp/baselib/view/v;->f:Landroid/graphics/Paint;

    .line 55
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lcom/roidapp/baselib/view/v;->b:Landroid/graphics/Rect;

    .line 56
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lcom/roidapp/baselib/view/v;->c:Landroid/graphics/RectF;

    .line 58
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/baselib/view/v;->i:Z

    .line 318
    if-eqz p1, :cond_0

    .line 319
    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->densityDpi:I

    iput v0, p0, Lcom/roidapp/baselib/view/v;->d:I

    .line 322
    :cond_0
    iput-object p2, p0, Lcom/roidapp/baselib/view/v;->a:Landroid/graphics/Bitmap;

    .line 323
    iget-object v0, p0, Lcom/roidapp/baselib/view/v;->a:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_1

    .line 3079
    iget-object v0, p0, Lcom/roidapp/baselib/view/v;->a:Landroid/graphics/Bitmap;

    iget v1, p0, Lcom/roidapp/baselib/view/v;->d:I

    invoke-virtual {v0, v1}, Landroid/graphics/Bitmap;->getScaledWidth(I)I

    move-result v0

    iput v0, p0, Lcom/roidapp/baselib/view/v;->j:I

    .line 3080
    iget-object v0, p0, Lcom/roidapp/baselib/view/v;->a:Landroid/graphics/Bitmap;

    iget v1, p0, Lcom/roidapp/baselib/view/v;->d:I

    invoke-virtual {v0, v1}, Landroid/graphics/Bitmap;->getScaledHeight(I)I

    move-result v0

    iput v0, p0, Lcom/roidapp/baselib/view/v;->k:I

    .line 325
    new-instance v0, Landroid/graphics/BitmapShader;

    iget-object v1, p0, Lcom/roidapp/baselib/view/v;->a:Landroid/graphics/Bitmap;

    sget-object v2, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    sget-object v3, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    invoke-direct {v0, v1, v2, v3}, Landroid/graphics/BitmapShader;-><init>(Landroid/graphics/Bitmap;Landroid/graphics/Shader$TileMode;Landroid/graphics/Shader$TileMode;)V

    iput-object v0, p0, Lcom/roidapp/baselib/view/v;->g:Landroid/graphics/BitmapShader;

    .line 329
    :goto_0
    return-void

    .line 327
    :cond_1
    const/4 v0, -0x1

    iput v0, p0, Lcom/roidapp/baselib/view/v;->k:I

    iput v0, p0, Lcom/roidapp/baselib/view/v;->j:I

    goto :goto_0
.end method

.method private static b(F)Z
    .locals 1

    .prologue
    .line 332
    const/4 v0, 0x0

    invoke-static {p0, v0}, Ljava/lang/Float;->compare(FF)I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public final a()V
    .locals 2

    .prologue
    .line 192
    iget-object v0, p0, Lcom/roidapp/baselib/view/v;->f:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 193
    invoke-virtual {p0}, Lcom/roidapp/baselib/view/v;->invalidateSelf()V

    .line 194
    return-void
.end method

.method public final a(F)V
    .locals 2

    .prologue
    .line 279
    invoke-static {p1}, Lcom/roidapp/baselib/view/v;->b(F)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 280
    iget-object v0, p0, Lcom/roidapp/baselib/view/v;->f:Landroid/graphics/Paint;

    iget-object v1, p0, Lcom/roidapp/baselib/view/v;->g:Landroid/graphics/BitmapShader;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 284
    :goto_0
    iput p1, p0, Lcom/roidapp/baselib/view/v;->h:F

    .line 285
    return-void

    .line 282
    :cond_0
    iget-object v0, p0, Lcom/roidapp/baselib/view/v;->f:Landroid/graphics/Paint;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    goto :goto_0
.end method

.method public final draw(Landroid/graphics/Canvas;)V
    .locals 7

    .prologue
    const/4 v5, 0x0

    .line 236
    iget-object v6, p0, Lcom/roidapp/baselib/view/v;->a:Landroid/graphics/Bitmap;

    .line 237
    if-nez v6, :cond_0

    .line 250
    :goto_0
    return-void

    .line 1226
    :cond_0
    iget-boolean v0, p0, Lcom/roidapp/baselib/view/v;->i:Z

    if-eqz v0, :cond_1

    .line 1227
    iget v0, p0, Lcom/roidapp/baselib/view/v;->e:I

    iget v1, p0, Lcom/roidapp/baselib/view/v;->j:I

    iget v2, p0, Lcom/roidapp/baselib/view/v;->k:I

    invoke-virtual {p0}, Lcom/roidapp/baselib/view/v;->getBounds()Landroid/graphics/Rect;

    move-result-object v3

    iget-object v4, p0, Lcom/roidapp/baselib/view/v;->b:Landroid/graphics/Rect;

    .line 2221
    invoke-static/range {v0 .. v5}, Landroid/support/v4/view/GravityCompat;->apply(IIILandroid/graphics/Rect;Landroid/graphics/Rect;I)V

    .line 1229
    iget-object v0, p0, Lcom/roidapp/baselib/view/v;->c:Landroid/graphics/RectF;

    iget-object v1, p0, Lcom/roidapp/baselib/view/v;->b:Landroid/graphics/Rect;

    invoke-virtual {v0, v1}, Landroid/graphics/RectF;->set(Landroid/graphics/Rect;)V

    .line 1230
    iput-boolean v5, p0, Lcom/roidapp/baselib/view/v;->i:Z

    .line 243
    :cond_1
    iget-object v0, p0, Lcom/roidapp/baselib/view/v;->f:Landroid/graphics/Paint;

    .line 244
    invoke-virtual {v0}, Landroid/graphics/Paint;->getShader()Landroid/graphics/Shader;

    move-result-object v1

    .line 245
    if-nez v1, :cond_2

    .line 246
    const/4 v1, 0x0

    iget-object v2, p0, Lcom/roidapp/baselib/view/v;->b:Landroid/graphics/Rect;

    invoke-virtual {p1, v6, v1, v2, v0}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    goto :goto_0

    .line 248
    :cond_2
    iget-object v1, p0, Lcom/roidapp/baselib/view/v;->c:Landroid/graphics/RectF;

    iget v2, p0, Lcom/roidapp/baselib/view/v;->h:F

    iget v3, p0, Lcom/roidapp/baselib/view/v;->h:F

    invoke-virtual {p1, v1, v2, v3, v0}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    goto :goto_0
.end method

.method public final getAlpha()I
    .locals 1

    .prologue
    .line 262
    iget-object v0, p0, Lcom/roidapp/baselib/view/v;->f:Landroid/graphics/Paint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->getAlpha()I

    move-result v0

    return v0
.end method

.method public final getColorFilter()Landroid/graphics/ColorFilter;
    .locals 1

    .prologue
    .line 272
    iget-object v0, p0, Lcom/roidapp/baselib/view/v;->f:Landroid/graphics/Paint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->getColorFilter()Landroid/graphics/ColorFilter;

    move-result-object v0

    return-object v0
.end method

.method public final getIntrinsicHeight()I
    .locals 1

    .prologue
    .line 301
    iget v0, p0, Lcom/roidapp/baselib/view/v;->k:I

    return v0
.end method

.method public final getIntrinsicWidth()I
    .locals 1

    .prologue
    .line 296
    iget v0, p0, Lcom/roidapp/baselib/view/v;->j:I

    return v0
.end method

.method public final getOpacity()I
    .locals 3

    .prologue
    const/4 v0, -0x3

    .line 306
    iget v1, p0, Lcom/roidapp/baselib/view/v;->e:I

    const/16 v2, 0x77

    if-eq v1, v2, :cond_1

    .line 310
    :cond_0
    :goto_0
    return v0

    .line 309
    :cond_1
    iget-object v1, p0, Lcom/roidapp/baselib/view/v;->a:Landroid/graphics/Bitmap;

    .line 310
    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->hasAlpha()Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/roidapp/baselib/view/v;->f:Landroid/graphics/Paint;

    invoke-virtual {v1}, Landroid/graphics/Paint;->getAlpha()I

    move-result v1

    const/16 v2, 0xff

    if-lt v1, v2, :cond_0

    iget v1, p0, Lcom/roidapp/baselib/view/v;->h:F

    invoke-static {v1}, Lcom/roidapp/baselib/view/v;->b(F)Z

    move-result v1

    if-nez v1, :cond_0

    const/4 v0, -0x1

    goto :goto_0
.end method

.method public final setAlpha(I)V
    .locals 1

    .prologue
    .line 254
    iget-object v0, p0, Lcom/roidapp/baselib/view/v;->f:Landroid/graphics/Paint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->getAlpha()I

    move-result v0

    .line 255
    if-eq p1, v0, :cond_0

    .line 256
    iget-object v0, p0, Lcom/roidapp/baselib/view/v;->f:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 257
    invoke-virtual {p0}, Lcom/roidapp/baselib/view/v;->invalidateSelf()V

    .line 259
    :cond_0
    return-void
.end method

.method public final setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 1

    .prologue
    .line 267
    iget-object v0, p0, Lcom/roidapp/baselib/view/v;->f:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    .line 268
    invoke-virtual {p0}, Lcom/roidapp/baselib/view/v;->invalidateSelf()V

    .line 269
    return-void
.end method

.method public final setDither(Z)V
    .locals 1

    .prologue
    .line 215
    iget-object v0, p0, Lcom/roidapp/baselib/view/v;->f:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setDither(Z)V

    .line 216
    invoke-virtual {p0}, Lcom/roidapp/baselib/view/v;->invalidateSelf()V

    .line 217
    return-void
.end method

.method public final setFilterBitmap(Z)V
    .locals 1

    .prologue
    .line 209
    iget-object v0, p0, Lcom/roidapp/baselib/view/v;->f:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setFilterBitmap(Z)V

    .line 210
    invoke-virtual {p0}, Lcom/roidapp/baselib/view/v;->invalidateSelf()V

    .line 211
    return-void
.end method
