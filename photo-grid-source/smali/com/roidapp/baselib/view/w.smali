.class public final Lcom/roidapp/baselib/view/w;
.super Landroid/graphics/drawable/Drawable;
.source "SourceFile"


# instance fields
.field final a:Landroid/graphics/Rect;

.field final b:Landroid/graphics/RectF;

.field private c:I

.field private d:Landroid/graphics/Paint;

.field private e:F

.field private f:I

.field private g:I

.field private h:Z


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .prologue
    .line 55
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/roidapp/baselib/view/w;-><init>(IB)V

    .line 56
    return-void
.end method

.method private constructor <init>(IB)V
    .locals 3

    .prologue
    const/4 v2, -0x1

    .line 58
    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    .line 43
    const/16 v0, 0x77

    iput v0, p0, Lcom/roidapp/baselib/view/w;->c:I

    .line 44
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x6

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lcom/roidapp/baselib/view/w;->d:Landroid/graphics/Paint;

    .line 49
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lcom/roidapp/baselib/view/w;->a:Landroid/graphics/Rect;

    .line 50
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lcom/roidapp/baselib/view/w;->b:Landroid/graphics/RectF;

    .line 52
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/baselib/view/w;->h:Z

    .line 59
    iget-object v0, p0, Lcom/roidapp/baselib/view/w;->d:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 60
    iput v2, p0, Lcom/roidapp/baselib/view/w;->f:I

    .line 61
    iput v2, p0, Lcom/roidapp/baselib/view/w;->g:I

    .line 62
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .prologue
    .line 106
    iget-object v0, p0, Lcom/roidapp/baselib/view/w;->d:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 107
    invoke-virtual {p0}, Lcom/roidapp/baselib/view/w;->invalidateSelf()V

    .line 108
    return-void
.end method

.method public final a(F)V
    .locals 0

    .prologue
    .line 171
    iput p1, p0, Lcom/roidapp/baselib/view/w;->e:F

    .line 172
    return-void
.end method

.method public final draw(Landroid/graphics/Canvas;)V
    .locals 6

    .prologue
    const/4 v5, 0x0

    .line 144
    .line 1134
    iget-boolean v0, p0, Lcom/roidapp/baselib/view/w;->h:Z

    if-eqz v0, :cond_0

    .line 1135
    iget v0, p0, Lcom/roidapp/baselib/view/w;->c:I

    iget v1, p0, Lcom/roidapp/baselib/view/w;->f:I

    iget v2, p0, Lcom/roidapp/baselib/view/w;->g:I

    invoke-virtual {p0}, Lcom/roidapp/baselib/view/w;->getBounds()Landroid/graphics/Rect;

    move-result-object v3

    iget-object v4, p0, Lcom/roidapp/baselib/view/w;->a:Landroid/graphics/Rect;

    .line 2129
    invoke-static/range {v0 .. v5}, Landroid/support/v4/view/GravityCompat;->apply(IIILandroid/graphics/Rect;Landroid/graphics/Rect;I)V

    .line 1137
    iget-object v0, p0, Lcom/roidapp/baselib/view/w;->b:Landroid/graphics/RectF;

    iget-object v1, p0, Lcom/roidapp/baselib/view/w;->a:Landroid/graphics/Rect;

    invoke-virtual {v0, v1}, Landroid/graphics/RectF;->set(Landroid/graphics/Rect;)V

    .line 1138
    iput-boolean v5, p0, Lcom/roidapp/baselib/view/w;->h:Z

    .line 145
    :cond_0
    iget-object v0, p0, Lcom/roidapp/baselib/view/w;->b:Landroid/graphics/RectF;

    iget v1, p0, Lcom/roidapp/baselib/view/w;->e:F

    iget v2, p0, Lcom/roidapp/baselib/view/w;->e:F

    iget-object v3, p0, Lcom/roidapp/baselib/view/w;->d:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 146
    return-void
.end method

.method public final getAlpha()I
    .locals 1

    .prologue
    .line 154
    iget-object v0, p0, Lcom/roidapp/baselib/view/w;->d:Landroid/graphics/Paint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->getAlpha()I

    move-result v0

    return v0
.end method

.method public final getColorFilter()Landroid/graphics/ColorFilter;
    .locals 1

    .prologue
    .line 164
    iget-object v0, p0, Lcom/roidapp/baselib/view/w;->d:Landroid/graphics/Paint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->getColorFilter()Landroid/graphics/ColorFilter;

    move-result-object v0

    return-object v0
.end method

.method public final getIntrinsicHeight()I
    .locals 1

    .prologue
    .line 188
    iget v0, p0, Lcom/roidapp/baselib/view/w;->g:I

    return v0
.end method

.method public final getIntrinsicWidth()I
    .locals 1

    .prologue
    .line 183
    iget v0, p0, Lcom/roidapp/baselib/view/w;->f:I

    return v0
.end method

.method public final getOpacity()I
    .locals 3

    .prologue
    const/4 v0, -0x3

    .line 193
    iget v1, p0, Lcom/roidapp/baselib/view/w;->c:I

    const/16 v2, 0x77

    if-eq v1, v2, :cond_1

    .line 196
    :cond_0
    :goto_0
    return v0

    :cond_1
    iget-object v1, p0, Lcom/roidapp/baselib/view/w;->d:Landroid/graphics/Paint;

    invoke-virtual {v1}, Landroid/graphics/Paint;->getAlpha()I

    move-result v1

    const/16 v2, 0xff

    if-lt v1, v2, :cond_0

    const/4 v0, -0x1

    goto :goto_0
.end method

.method public final setAlpha(I)V
    .locals 0

    .prologue
    .line 151
    return-void
.end method

.method public final setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 1

    .prologue
    .line 159
    iget-object v0, p0, Lcom/roidapp/baselib/view/w;->d:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    .line 160
    invoke-virtual {p0}, Lcom/roidapp/baselib/view/w;->invalidateSelf()V

    .line 161
    return-void
.end method

.method public final setDither(Z)V
    .locals 1

    .prologue
    .line 123
    iget-object v0, p0, Lcom/roidapp/baselib/view/w;->d:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setDither(Z)V

    .line 124
    invoke-virtual {p0}, Lcom/roidapp/baselib/view/w;->invalidateSelf()V

    .line 125
    return-void
.end method
