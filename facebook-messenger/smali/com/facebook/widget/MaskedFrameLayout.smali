.class public Lcom/facebook/widget/MaskedFrameLayout;
.super Landroid/widget/FrameLayout;
.source "MaskedFrameLayout.java"


# static fields
.field private static final a:Landroid/graphics/PorterDuffXfermode;


# instance fields
.field private b:Landroid/graphics/drawable/Drawable;

.field private c:Landroid/graphics/Bitmap;

.field private d:Landroid/graphics/Bitmap;

.field private e:Landroid/graphics/Paint;

.field private f:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 40
    new-instance v0, Landroid/graphics/PorterDuffXfermode;

    sget-object v1, Landroid/graphics/PorterDuff$Mode;->DST_IN:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v0, v1}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    sput-object v0, Lcom/facebook/widget/MaskedFrameLayout;->a:Landroid/graphics/PorterDuffXfermode;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 50
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/facebook/widget/MaskedFrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 51
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 54
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/facebook/widget/MaskedFrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 55
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    const/4 v2, 0x1

    .line 58
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 60
    sget-object v0, Lcom/facebook/q;->MaskedFrameLayout:[I

    invoke-virtual {p1, p2, v0, p3, v3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v0

    .line 63
    sget v1, Lcom/facebook/q;->MaskedFrameLayout_mask:I

    invoke-virtual {v0, v1}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    .line 64
    if-eqz v1, :cond_0

    .line 65
    invoke-virtual {p0, v1}, Lcom/facebook/widget/MaskedFrameLayout;->setMaskDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 67
    :cond_0
    sget v1, Lcom/facebook/q;->MaskedFrameLayout_usesFboToMask:I

    invoke-virtual {v0, v1, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    invoke-virtual {p0, v1}, Lcom/facebook/widget/MaskedFrameLayout;->setUsesFboToMask(Z)V

    .line 69
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 72
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/facebook/widget/MaskedFrameLayout;->e:Landroid/graphics/Paint;

    .line 73
    iget-object v0, p0, Lcom/facebook/widget/MaskedFrameLayout;->e:Landroid/graphics/Paint;

    sget-object v1, Lcom/facebook/widget/MaskedFrameLayout;->a:Landroid/graphics/PorterDuffXfermode;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 76
    iget-object v0, p0, Lcom/facebook/widget/MaskedFrameLayout;->e:Landroid/graphics/Paint;

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 77
    iget-object v0, p0, Lcom/facebook/widget/MaskedFrameLayout;->e:Landroid/graphics/Paint;

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setDither(Z)V

    .line 78
    iget-object v0, p0, Lcom/facebook/widget/MaskedFrameLayout;->e:Landroid/graphics/Paint;

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setFilterBitmap(Z)V

    .line 79
    return-void
.end method

.method private static a(II)Landroid/graphics/Bitmap;
    .locals 1

    .prologue
    .line 247
    :try_start_0
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {p0, p1, v0}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 250
    :goto_0
    return-object v0

    .line 248
    :catch_0
    move-exception v0

    .line 249
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 250
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {p0, p1, v0}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    goto :goto_0
.end method

.method private a()V
    .locals 1

    .prologue
    .line 118
    iget-object v0, p0, Lcom/facebook/widget/MaskedFrameLayout;->c:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_0

    .line 119
    iget-object v0, p0, Lcom/facebook/widget/MaskedFrameLayout;->c:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 120
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/widget/MaskedFrameLayout;->c:Landroid/graphics/Bitmap;

    .line 122
    :cond_0
    return-void
.end method

.method private a(Landroid/graphics/Canvas;)V
    .locals 7

    .prologue
    const/4 v1, 0x0

    .line 179
    invoke-virtual {p0}, Lcom/facebook/widget/MaskedFrameLayout;->getWidth()I

    move-result v0

    int-to-float v3, v0

    invoke-virtual {p0}, Lcom/facebook/widget/MaskedFrameLayout;->getHeight()I

    move-result v0

    int-to-float v4, v0

    const/4 v5, 0x0

    const/16 v6, 0x1f

    move-object v0, p1

    move v2, v1

    invoke-virtual/range {v0 .. v6}, Landroid/graphics/Canvas;->saveLayer(FFFFLandroid/graphics/Paint;I)I

    .line 180
    invoke-direct {p0, p1}, Lcom/facebook/widget/MaskedFrameLayout;->c(Landroid/graphics/Canvas;)V

    .line 182
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 183
    return-void
.end method

.method private b()V
    .locals 1

    .prologue
    .line 129
    iget-object v0, p0, Lcom/facebook/widget/MaskedFrameLayout;->d:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_0

    .line 130
    iget-object v0, p0, Lcom/facebook/widget/MaskedFrameLayout;->d:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 131
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/widget/MaskedFrameLayout;->d:Landroid/graphics/Bitmap;

    .line 133
    :cond_0
    return-void
.end method

.method private b(Landroid/graphics/Canvas;)V
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 190
    invoke-direct {p0}, Lcom/facebook/widget/MaskedFrameLayout;->c()Landroid/graphics/Bitmap;

    move-result-object v0

    .line 191
    new-instance v1, Landroid/graphics/Canvas;

    invoke-direct {v1, v0}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 192
    const/4 v2, 0x0

    sget-object v3, Landroid/graphics/PorterDuff$Mode;->CLEAR:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {v1, v2, v3}, Landroid/graphics/Canvas;->drawColor(ILandroid/graphics/PorterDuff$Mode;)V

    .line 193
    invoke-direct {p0, v1}, Lcom/facebook/widget/MaskedFrameLayout;->c(Landroid/graphics/Canvas;)V

    .line 194
    const/4 v1, 0x0

    invoke-virtual {p1, v0, v4, v4, v1}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 195
    return-void
.end method

.method private c()Landroid/graphics/Bitmap;
    .locals 2

    .prologue
    .line 198
    iget-object v0, p0, Lcom/facebook/widget/MaskedFrameLayout;->d:Landroid/graphics/Bitmap;

    if-nez v0, :cond_0

    .line 199
    invoke-virtual {p0}, Lcom/facebook/widget/MaskedFrameLayout;->getWidth()I

    move-result v0

    invoke-virtual {p0}, Lcom/facebook/widget/MaskedFrameLayout;->getHeight()I

    move-result v1

    invoke-static {v0, v1}, Lcom/facebook/widget/MaskedFrameLayout;->a(II)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/widget/MaskedFrameLayout;->d:Landroid/graphics/Bitmap;

    .line 201
    :cond_0
    iget-object v0, p0, Lcom/facebook/widget/MaskedFrameLayout;->d:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method private c(Landroid/graphics/Canvas;)V
    .locals 6

    .prologue
    const/4 v5, 0x0

    const/4 v2, 0x0

    .line 208
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->dispatchDraw(Landroid/graphics/Canvas;)V

    .line 210
    invoke-direct {p0}, Lcom/facebook/widget/MaskedFrameLayout;->getMaskDrawablePaint()Landroid/graphics/Paint;

    move-result-object v0

    .line 211
    if-eqz v0, :cond_0

    .line 213
    invoke-virtual {v0}, Landroid/graphics/Paint;->getXfermode()Landroid/graphics/Xfermode;

    move-result-object v1

    .line 214
    sget-object v2, Lcom/facebook/widget/MaskedFrameLayout;->a:Landroid/graphics/PorterDuffXfermode;

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 215
    iget-object v2, p0, Lcom/facebook/widget/MaskedFrameLayout;->b:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0}, Lcom/facebook/widget/MaskedFrameLayout;->getWidth()I

    move-result v3

    invoke-virtual {p0}, Lcom/facebook/widget/MaskedFrameLayout;->getHeight()I

    move-result v4

    invoke-virtual {v2, v5, v5, v3, v4}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 216
    iget-object v2, p0, Lcom/facebook/widget/MaskedFrameLayout;->b:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v2, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 217
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 224
    :goto_0
    return-void

    .line 221
    :cond_0
    invoke-direct {p0}, Lcom/facebook/widget/MaskedFrameLayout;->getMaskBitmap()Landroid/graphics/Bitmap;

    move-result-object v0

    .line 222
    iget-object v1, p0, Lcom/facebook/widget/MaskedFrameLayout;->e:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v2, v2, v1}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    goto :goto_0
.end method

.method private getMaskBitmap()Landroid/graphics/Bitmap;
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 139
    iget-object v0, p0, Lcom/facebook/widget/MaskedFrameLayout;->c:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_0

    .line 140
    iget-object v0, p0, Lcom/facebook/widget/MaskedFrameLayout;->c:Landroid/graphics/Bitmap;

    .line 152
    :goto_0
    return-object v0

    .line 143
    :cond_0
    invoke-virtual {p0}, Lcom/facebook/widget/MaskedFrameLayout;->getWidth()I

    move-result v0

    .line 144
    invoke-virtual {p0}, Lcom/facebook/widget/MaskedFrameLayout;->getHeight()I

    move-result v1

    .line 146
    invoke-static {v0, v1}, Lcom/facebook/widget/MaskedFrameLayout;->a(II)Landroid/graphics/Bitmap;

    move-result-object v2

    iput-object v2, p0, Lcom/facebook/widget/MaskedFrameLayout;->c:Landroid/graphics/Bitmap;

    .line 147
    new-instance v2, Landroid/graphics/Canvas;

    iget-object v3, p0, Lcom/facebook/widget/MaskedFrameLayout;->c:Landroid/graphics/Bitmap;

    invoke-direct {v2, v3}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 149
    iget-object v3, p0, Lcom/facebook/widget/MaskedFrameLayout;->b:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v3, v4, v4, v0, v1}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 150
    iget-object v0, p0, Lcom/facebook/widget/MaskedFrameLayout;->b:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, v2}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 152
    iget-object v0, p0, Lcom/facebook/widget/MaskedFrameLayout;->c:Landroid/graphics/Bitmap;

    goto :goto_0
.end method

.method private getMaskDrawablePaint()Landroid/graphics/Paint;
    .locals 1

    .prologue
    .line 230
    iget-object v0, p0, Lcom/facebook/widget/MaskedFrameLayout;->b:Landroid/graphics/drawable/Drawable;

    instance-of v0, v0, Landroid/graphics/drawable/BitmapDrawable;

    if-eqz v0, :cond_0

    .line 231
    iget-object v0, p0, Lcom/facebook/widget/MaskedFrameLayout;->b:Landroid/graphics/drawable/Drawable;

    check-cast v0, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/BitmapDrawable;->getPaint()Landroid/graphics/Paint;

    move-result-object v0

    .line 237
    :goto_0
    return-object v0

    .line 232
    :cond_0
    iget-object v0, p0, Lcom/facebook/widget/MaskedFrameLayout;->b:Landroid/graphics/drawable/Drawable;

    instance-of v0, v0, Landroid/graphics/drawable/NinePatchDrawable;

    if-eqz v0, :cond_1

    .line 233
    iget-object v0, p0, Lcom/facebook/widget/MaskedFrameLayout;->b:Landroid/graphics/drawable/Drawable;

    check-cast v0, Landroid/graphics/drawable/NinePatchDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/NinePatchDrawable;->getPaint()Landroid/graphics/Paint;

    move-result-object v0

    goto :goto_0

    .line 234
    :cond_1
    iget-object v0, p0, Lcom/facebook/widget/MaskedFrameLayout;->b:Landroid/graphics/drawable/Drawable;

    instance-of v0, v0, Landroid/graphics/drawable/ShapeDrawable;

    if-eqz v0, :cond_2

    .line 235
    iget-object v0, p0, Lcom/facebook/widget/MaskedFrameLayout;->b:Landroid/graphics/drawable/Drawable;

    check-cast v0, Landroid/graphics/drawable/ShapeDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/ShapeDrawable;->getPaint()Landroid/graphics/Paint;

    move-result-object v0

    goto :goto_0

    .line 237
    :cond_2
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method protected dispatchDraw(Landroid/graphics/Canvas;)V
    .locals 1

    .prologue
    .line 161
    iget-object v0, p0, Lcom/facebook/widget/MaskedFrameLayout;->b:Landroid/graphics/drawable/Drawable;

    if-nez v0, :cond_0

    .line 163
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->dispatchDraw(Landroid/graphics/Canvas;)V

    .line 169
    :goto_0
    return-void

    .line 164
    :cond_0
    iget-boolean v0, p0, Lcom/facebook/widget/MaskedFrameLayout;->f:Z

    if-eqz v0, :cond_1

    .line 165
    invoke-direct {p0, p1}, Lcom/facebook/widget/MaskedFrameLayout;->a(Landroid/graphics/Canvas;)V

    goto :goto_0

    .line 167
    :cond_1
    invoke-direct {p0, p1}, Lcom/facebook/widget/MaskedFrameLayout;->b(Landroid/graphics/Canvas;)V

    goto :goto_0
.end method

.method protected onDetachedFromWindow()V
    .locals 0

    .prologue
    .line 110
    invoke-direct {p0}, Lcom/facebook/widget/MaskedFrameLayout;->a()V

    .line 111
    return-void
.end method

.method protected onSizeChanged(IIII)V
    .locals 0

    .prologue
    .line 101
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/FrameLayout;->onSizeChanged(IIII)V

    .line 104
    invoke-direct {p0}, Lcom/facebook/widget/MaskedFrameLayout;->a()V

    .line 105
    invoke-direct {p0}, Lcom/facebook/widget/MaskedFrameLayout;->b()V

    .line 106
    return-void
.end method

.method public setMaskDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .prologue
    .line 85
    iput-object p1, p0, Lcom/facebook/widget/MaskedFrameLayout;->b:Landroid/graphics/drawable/Drawable;

    .line 87
    invoke-direct {p0}, Lcom/facebook/widget/MaskedFrameLayout;->a()V

    .line 88
    invoke-virtual {p0}, Lcom/facebook/widget/MaskedFrameLayout;->invalidate()V

    .line 89
    return-void
.end method

.method public setUsesFboToMask(Z)V
    .locals 1

    .prologue
    .line 92
    iput-boolean p1, p0, Lcom/facebook/widget/MaskedFrameLayout;->f:Z

    .line 93
    iget-boolean v0, p0, Lcom/facebook/widget/MaskedFrameLayout;->f:Z

    if-eqz v0, :cond_0

    .line 94
    invoke-direct {p0}, Lcom/facebook/widget/MaskedFrameLayout;->b()V

    .line 96
    :cond_0
    invoke-virtual {p0}, Lcom/facebook/widget/MaskedFrameLayout;->invalidate()V

    .line 97
    return-void
.end method
