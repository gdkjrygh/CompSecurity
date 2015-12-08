.class public Lcom/arist/model/skin/ColorProgressBar;
.super Landroid/view/View;

# interfaces
.implements Lcom/arist/model/skin/m;


# instance fields
.field private a:Landroid/graphics/drawable/Drawable;

.field private b:Landroid/graphics/drawable/Drawable;

.field private c:I

.field private d:Z

.field private e:F

.field private f:Landroid/graphics/RectF;

.field private g:Landroid/graphics/RectF;

.field private h:Landroid/graphics/Paint;

.field private i:I

.field private j:I

.field private k:Landroid/graphics/Rect;

.field private l:Z

.field private m:Landroid/graphics/PointF;

.field private n:Lcom/arist/model/skin/l;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 6

    const/4 v5, 0x6

    const/4 v4, 0x1

    const/4 v3, -0x1

    const/4 v2, 0x0

    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    iput v5, p0, Lcom/arist/model/skin/ColorProgressBar;->c:I

    iput-boolean v2, p0, Lcom/arist/model/skin/ColorProgressBar;->d:Z

    const/4 v0, 0x0

    iput v0, p0, Lcom/arist/model/skin/ColorProgressBar;->e:F

    const v0, -0xffff01

    iput v0, p0, Lcom/arist/model/skin/ColorProgressBar;->i:I

    const v0, -0x333334

    iput v0, p0, Lcom/arist/model/skin/ColorProgressBar;->j:I

    iput-boolean v2, p0, Lcom/arist/model/skin/ColorProgressBar;->l:Z

    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0, v4}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lcom/arist/model/skin/ColorProgressBar;->h:Landroid/graphics/Paint;

    iget-object v0, p0, Lcom/arist/model/skin/ColorProgressBar;->h:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lcom/arist/model/skin/ColorProgressBar;->f:Landroid/graphics/RectF;

    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lcom/arist/model/skin/ColorProgressBar;->g:Landroid/graphics/RectF;

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lcom/arist/model/skin/ColorProgressBar;->k:Landroid/graphics/Rect;

    new-instance v0, Landroid/graphics/PointF;

    invoke-direct {v0}, Landroid/graphics/PointF;-><init>()V

    iput-object v0, p0, Lcom/arist/model/skin/ColorProgressBar;->m:Landroid/graphics/PointF;

    sget-object v0, La/a/a/a/b;->c:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v0

    iget v1, p0, Lcom/arist/model/skin/ColorProgressBar;->e:F

    invoke-virtual {v0, v2, v1}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v1

    invoke-static {v1}, Lcom/arist/model/skin/ColorProgressBar;->b(F)F

    move-result v1

    iput v1, p0, Lcom/arist/model/skin/ColorProgressBar;->e:F

    const/4 v1, 0x2

    iget v2, p0, Lcom/arist/model/skin/ColorProgressBar;->c:I

    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v1

    iput v1, p0, Lcom/arist/model/skin/ColorProgressBar;->c:I

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    iput-object v1, p0, Lcom/arist/model/skin/ColorProgressBar;->a:Landroid/graphics/drawable/Drawable;

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    iput-object v1, p0, Lcom/arist/model/skin/ColorProgressBar;->b:Landroid/graphics/drawable/Drawable;

    iget v1, p0, Lcom/arist/model/skin/ColorProgressBar;->i:I

    invoke-virtual {v0, v4, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v1

    iput v1, p0, Lcom/arist/model/skin/ColorProgressBar;->i:I

    iget v1, p0, Lcom/arist/model/skin/ColorProgressBar;->j:I

    invoke-virtual {v0, v5, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v1

    iput v1, p0, Lcom/arist/model/skin/ColorProgressBar;->j:I

    const/4 v1, 0x7

    iget-boolean v2, p0, Lcom/arist/model/skin/ColorProgressBar;->d:Z

    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    iput-boolean v1, p0, Lcom/arist/model/skin/ColorProgressBar;->d:Z

    const/4 v1, 0x4

    invoke-virtual {v0, v1, v3}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v1

    if-eq v1, v3, :cond_0

    invoke-direct {p0, v1}, Lcom/arist/model/skin/ColorProgressBar;->b(I)V

    :cond_0
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method private a(ZF)V
    .locals 8

    const/4 v7, 0x0

    const/high16 v6, 0x3f800000    # 1.0f

    invoke-static {p2}, Lcom/arist/model/skin/ColorProgressBar;->b(F)F

    move-result v2

    iput v2, p0, Lcom/arist/model/skin/ColorProgressBar;->e:F

    iget-object v3, p0, Lcom/arist/model/skin/ColorProgressBar;->g:Landroid/graphics/RectF;

    iget-object v0, p0, Lcom/arist/model/skin/ColorProgressBar;->f:Landroid/graphics/RectF;

    iget v4, v0, Landroid/graphics/RectF;->left:F

    iget-boolean v0, p0, Lcom/arist/model/skin/ColorProgressBar;->d:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/arist/model/skin/ColorProgressBar;->f:Landroid/graphics/RectF;

    invoke-virtual {v0}, Landroid/graphics/RectF;->height()F

    move-result v0

    sub-float v1, v6, v2

    mul-float/2addr v0, v1

    iget-object v1, p0, Lcom/arist/model/skin/ColorProgressBar;->f:Landroid/graphics/RectF;

    iget v1, v1, Landroid/graphics/RectF;->top:F

    add-float/2addr v0, v1

    :goto_0
    iget-boolean v1, p0, Lcom/arist/model/skin/ColorProgressBar;->d:Z

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/arist/model/skin/ColorProgressBar;->f:Landroid/graphics/RectF;

    iget v1, v1, Landroid/graphics/RectF;->right:F

    :goto_1
    iget-object v5, p0, Lcom/arist/model/skin/ColorProgressBar;->f:Landroid/graphics/RectF;

    iget v5, v5, Landroid/graphics/RectF;->bottom:F

    invoke-virtual {v3, v4, v0, v1, v5}, Landroid/graphics/RectF;->set(FFFF)V

    iget-boolean v0, p0, Lcom/arist/model/skin/ColorProgressBar;->d:Z

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/arist/model/skin/ColorProgressBar;->k:Landroid/graphics/Rect;

    iget-object v1, p0, Lcom/arist/model/skin/ColorProgressBar;->f:Landroid/graphics/RectF;

    invoke-virtual {v1}, Landroid/graphics/RectF;->height()F

    move-result v1

    sub-float v3, v6, v2

    mul-float/2addr v1, v3

    float-to-int v1, v1

    invoke-virtual {v0, v7, v1}, Landroid/graphics/Rect;->offsetTo(II)V

    :goto_2
    invoke-virtual {p0}, Lcom/arist/model/skin/ColorProgressBar;->invalidate()V

    iget-object v0, p0, Lcom/arist/model/skin/ColorProgressBar;->n:Lcom/arist/model/skin/l;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/arist/model/skin/ColorProgressBar;->n:Lcom/arist/model/skin/l;

    invoke-interface {v0, p0, p1, v2}, Lcom/arist/model/skin/l;->a(Lcom/arist/model/skin/ColorProgressBar;ZF)V

    :cond_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/arist/model/skin/ColorProgressBar;->f:Landroid/graphics/RectF;

    iget v0, v0, Landroid/graphics/RectF;->top:F

    goto :goto_0

    :cond_2
    iget-object v1, p0, Lcom/arist/model/skin/ColorProgressBar;->f:Landroid/graphics/RectF;

    invoke-virtual {v1}, Landroid/graphics/RectF;->width()F

    move-result v1

    mul-float/2addr v1, v2

    iget-object v5, p0, Lcom/arist/model/skin/ColorProgressBar;->f:Landroid/graphics/RectF;

    iget v5, v5, Landroid/graphics/RectF;->left:F

    add-float/2addr v1, v5

    goto :goto_1

    :cond_3
    iget-object v0, p0, Lcom/arist/model/skin/ColorProgressBar;->k:Landroid/graphics/Rect;

    iget-object v1, p0, Lcom/arist/model/skin/ColorProgressBar;->f:Landroid/graphics/RectF;

    invoke-virtual {v1}, Landroid/graphics/RectF;->width()F

    move-result v1

    mul-float/2addr v1, v2

    float-to-int v1, v1

    invoke-virtual {v0, v1, v7}, Landroid/graphics/Rect;->offsetTo(II)V

    goto :goto_2
.end method

.method private static b(F)F
    .locals 3

    const/high16 v0, 0x3f800000    # 1.0f

    const/4 v1, 0x0

    cmpl-float v2, p0, v0

    if-lez v2, :cond_1

    move p0, v0

    :cond_0
    :goto_0
    return p0

    :cond_1
    cmpg-float v0, p0, v1

    if-gez v0, :cond_0

    move p0, v1

    goto :goto_0
.end method

.method private b(I)V
    .locals 3

    const/4 v2, 0x1

    iget-object v0, p0, Lcom/arist/model/skin/ColorProgressBar;->a:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/arist/model/skin/ColorProgressBar;->a:Landroid/graphics/drawable/Drawable;

    new-instance v1, Landroid/graphics/LightingColorFilter;

    invoke-direct {v1, p1, v2}, Landroid/graphics/LightingColorFilter;-><init>(II)V

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    :cond_0
    iget-object v0, p0, Lcom/arist/model/skin/ColorProgressBar;->b:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/arist/model/skin/ColorProgressBar;->b:Landroid/graphics/drawable/Drawable;

    new-instance v1, Landroid/graphics/LightingColorFilter;

    invoke-direct {v1, p1, v2}, Landroid/graphics/LightingColorFilter;-><init>(II)V

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    :cond_1
    return-void
.end method


# virtual methods
.method public final a()F
    .locals 1

    iget v0, p0, Lcom/arist/model/skin/ColorProgressBar;->e:F

    return v0
.end method

.method public final a(F)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0, p1}, Lcom/arist/model/skin/ColorProgressBar;->a(ZF)V

    return-void
.end method

.method public final a(I)V
    .locals 1

    invoke-direct {p0, p1}, Lcom/arist/model/skin/ColorProgressBar;->b(I)V

    iget v0, p0, Lcom/arist/model/skin/ColorProgressBar;->j:I

    iput v0, p0, Lcom/arist/model/skin/ColorProgressBar;->j:I

    iput p1, p0, Lcom/arist/model/skin/ColorProgressBar;->i:I

    invoke-virtual {p0}, Lcom/arist/model/skin/ColorProgressBar;->invalidate()V

    return-void
.end method

.method public final a(Lcom/arist/model/skin/l;)V
    .locals 0

    iput-object p1, p0, Lcom/arist/model/skin/ColorProgressBar;->n:Lcom/arist/model/skin/l;

    return-void
.end method

.method protected onAttachedToWindow()V
    .locals 1

    invoke-static {}, Lcom/arist/model/skin/b;->a()Lcom/arist/model/skin/b;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/arist/model/skin/b;->a(Lcom/arist/model/skin/m;)V

    invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V

    return-void
.end method

.method protected onDetachedFromWindow()V
    .locals 1

    invoke-static {}, Lcom/arist/model/skin/b;->a()Lcom/arist/model/skin/b;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/arist/model/skin/b;->b(Lcom/arist/model/skin/m;)V

    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    return-void
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 3

    const/high16 v2, 0x40000000    # 2.0f

    iget-object v0, p0, Lcom/arist/model/skin/ColorProgressBar;->h:Landroid/graphics/Paint;

    iget v1, p0, Lcom/arist/model/skin/ColorProgressBar;->j:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v0, p0, Lcom/arist/model/skin/ColorProgressBar;->f:Landroid/graphics/RectF;

    iget-object v1, p0, Lcom/arist/model/skin/ColorProgressBar;->h:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v2, v2, v1}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    iget v0, p0, Lcom/arist/model/skin/ColorProgressBar;->e:F

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_0

    iget-object v0, p0, Lcom/arist/model/skin/ColorProgressBar;->h:Landroid/graphics/Paint;

    iget v1, p0, Lcom/arist/model/skin/ColorProgressBar;->i:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v0, p0, Lcom/arist/model/skin/ColorProgressBar;->g:Landroid/graphics/RectF;

    iget-object v1, p0, Lcom/arist/model/skin/ColorProgressBar;->h:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v2, v2, v1}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    :cond_0
    iget-boolean v0, p0, Lcom/arist/model/skin/ColorProgressBar;->l:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/arist/model/skin/ColorProgressBar;->b:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/arist/model/skin/ColorProgressBar;->b:Landroid/graphics/drawable/Drawable;

    iget-object v1, p0, Lcom/arist/model/skin/ColorProgressBar;->k:Landroid/graphics/Rect;

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    iget-object v0, p0, Lcom/arist/model/skin/ColorProgressBar;->b:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    :cond_1
    :goto_0
    return-void

    :cond_2
    iget-object v0, p0, Lcom/arist/model/skin/ColorProgressBar;->a:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/arist/model/skin/ColorProgressBar;->a:Landroid/graphics/drawable/Drawable;

    iget-object v1, p0, Lcom/arist/model/skin/ColorProgressBar;->k:Landroid/graphics/Rect;

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    iget-object v0, p0, Lcom/arist/model/skin/ColorProgressBar;->a:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    goto :goto_0
.end method

.method protected onMeasure(II)V
    .locals 2

    const/high16 v1, 0x40000000    # 2.0f

    iget-boolean v0, p0, Lcom/arist/model/skin/ColorProgressBar;->d:Z

    if-eqz v0, :cond_2

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v0

    if-eq v0, v1, :cond_2

    iget-object v0, p0, Lcom/arist/model/skin/ColorProgressBar;->a:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/arist/model/skin/ColorProgressBar;->a:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v0

    :goto_0
    invoke-static {v0, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p1

    :cond_0
    :goto_1
    invoke-super {p0, p1, p2}, Landroid/view/View;->onMeasure(II)V

    return-void

    :cond_1
    iget v0, p0, Lcom/arist/model/skin/ColorProgressBar;->c:I

    goto :goto_0

    :cond_2
    iget-boolean v0, p0, Lcom/arist/model/skin/ColorProgressBar;->d:Z

    if-nez v0, :cond_0

    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v0

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lcom/arist/model/skin/ColorProgressBar;->a:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/arist/model/skin/ColorProgressBar;->a:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v0

    :goto_2
    invoke-static {v0, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p2

    goto :goto_1

    :cond_3
    iget v0, p0, Lcom/arist/model/skin/ColorProgressBar;->c:I

    goto :goto_2
.end method

.method protected onSizeChanged(IIII)V
    .locals 7

    const/4 v0, 0x0

    const/high16 v4, 0x40000000    # 2.0f

    const/4 v5, 0x0

    iget-object v1, p0, Lcom/arist/model/skin/ColorProgressBar;->a:Landroid/graphics/drawable/Drawable;

    if-eqz v1, :cond_2

    iget-boolean v1, p0, Lcom/arist/model/skin/ColorProgressBar;->d:Z

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/arist/model/skin/ColorProgressBar;->k:Landroid/graphics/Rect;

    iget-object v2, p0, Lcom/arist/model/skin/ColorProgressBar;->a:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v2}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v2

    int-to-float v2, v2

    int-to-float v3, p1

    mul-float/2addr v2, v3

    iget-object v3, p0, Lcom/arist/model/skin/ColorProgressBar;->a:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v3}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v3

    int-to-float v3, v3

    div-float/2addr v2, v3

    float-to-int v2, v2

    sub-int v2, p2, v2

    invoke-virtual {v1, v5, v2, p1, p2}, Landroid/graphics/Rect;->set(IIII)V

    :goto_0
    iget-boolean v1, p0, Lcom/arist/model/skin/ColorProgressBar;->d:Z

    if-eqz v1, :cond_4

    iget v1, p0, Lcom/arist/model/skin/ColorProgressBar;->c:I

    sub-int v1, p1, v1

    int-to-float v1, v1

    div-float v3, v1, v4

    iget-object v1, p0, Lcom/arist/model/skin/ColorProgressBar;->a:Landroid/graphics/drawable/Drawable;

    if-eqz v1, :cond_0

    iget-object v0, p0, Lcom/arist/model/skin/ColorProgressBar;->k:Landroid/graphics/Rect;

    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    move-result v0

    int-to-float v0, v0

    div-float/2addr v0, v4

    :cond_0
    int-to-float v1, p1

    sub-float v2, v1, v3

    int-to-float v1, p2

    sub-float/2addr v1, v0

    move v6, v1

    move v1, v2

    move v2, v0

    move v0, v6

    :goto_1
    iget-object v4, p0, Lcom/arist/model/skin/ColorProgressBar;->f:Landroid/graphics/RectF;

    invoke-virtual {v4, v3, v2, v1, v0}, Landroid/graphics/RectF;->set(FFFF)V

    iget v0, p0, Lcom/arist/model/skin/ColorProgressBar;->e:F

    invoke-direct {p0, v5, v0}, Lcom/arist/model/skin/ColorProgressBar;->a(ZF)V

    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    return-void

    :cond_1
    iget-object v1, p0, Lcom/arist/model/skin/ColorProgressBar;->k:Landroid/graphics/Rect;

    iget-object v2, p0, Lcom/arist/model/skin/ColorProgressBar;->a:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v2}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v2

    int-to-float v2, v2

    int-to-float v3, p2

    mul-float/2addr v2, v3

    iget-object v3, p0, Lcom/arist/model/skin/ColorProgressBar;->a:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v3}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v3

    int-to-float v3, v3

    div-float/2addr v2, v3

    float-to-int v2, v2

    invoke-virtual {v1, v5, v5, v2, p2}, Landroid/graphics/Rect;->set(IIII)V

    goto :goto_0

    :cond_2
    iget-boolean v1, p0, Lcom/arist/model/skin/ColorProgressBar;->d:Z

    if-eqz v1, :cond_3

    iget-object v1, p0, Lcom/arist/model/skin/ColorProgressBar;->k:Landroid/graphics/Rect;

    sub-int v2, p2, p1

    invoke-virtual {v1, v5, v2, p1, p1}, Landroid/graphics/Rect;->set(IIII)V

    goto :goto_0

    :cond_3
    iget-object v1, p0, Lcom/arist/model/skin/ColorProgressBar;->k:Landroid/graphics/Rect;

    invoke-virtual {v1, v5, v5, p2, p2}, Landroid/graphics/Rect;->set(IIII)V

    goto :goto_0

    :cond_4
    iget-object v1, p0, Lcom/arist/model/skin/ColorProgressBar;->a:Landroid/graphics/drawable/Drawable;

    if-eqz v1, :cond_5

    iget-object v0, p0, Lcom/arist/model/skin/ColorProgressBar;->k:Landroid/graphics/Rect;

    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v0

    int-to-float v0, v0

    div-float/2addr v0, v4

    :cond_5
    iget v1, p0, Lcom/arist/model/skin/ColorProgressBar;->c:I

    sub-int v1, p2, v1

    int-to-float v1, v1

    div-float v3, v1, v4

    int-to-float v1, p1

    sub-float v2, v1, v0

    int-to-float v1, p2

    sub-float/2addr v1, v3

    move v6, v1

    move v1, v2

    move v2, v3

    move v3, v0

    move v0, v6

    goto :goto_1
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 6

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-virtual {p0}, Lcom/arist/model/skin/ColorProgressBar;->isEnabled()Z

    move-result v2

    if-nez v2, :cond_1

    :cond_0
    :goto_0
    return v0

    :cond_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v2

    packed-switch v2, :pswitch_data_0

    :pswitch_0
    iget-boolean v2, p0, Lcom/arist/model/skin/ColorProgressBar;->l:Z

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/arist/model/skin/ColorProgressBar;->m:Landroid/graphics/PointF;

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v3

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v4

    invoke-virtual {v2, v3, v4}, Landroid/graphics/PointF;->set(FF)V

    iput-boolean v0, p0, Lcom/arist/model/skin/ColorProgressBar;->l:Z

    invoke-virtual {p0}, Lcom/arist/model/skin/ColorProgressBar;->invalidate()V

    :goto_1
    move v0, v1

    goto :goto_0

    :pswitch_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v2

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v3

    iget-object v4, p0, Lcom/arist/model/skin/ColorProgressBar;->k:Landroid/graphics/Rect;

    iget v4, v4, Landroid/graphics/Rect;->left:I

    iget-object v5, p0, Lcom/arist/model/skin/ColorProgressBar;->k:Landroid/graphics/Rect;

    iget v5, v5, Landroid/graphics/Rect;->right:I

    if-ge v4, v5, :cond_2

    iget-object v4, p0, Lcom/arist/model/skin/ColorProgressBar;->k:Landroid/graphics/Rect;

    iget v4, v4, Landroid/graphics/Rect;->top:I

    iget-object v5, p0, Lcom/arist/model/skin/ColorProgressBar;->k:Landroid/graphics/Rect;

    iget v5, v5, Landroid/graphics/Rect;->bottom:I

    if-ge v4, v5, :cond_2

    iget-object v4, p0, Lcom/arist/model/skin/ColorProgressBar;->k:Landroid/graphics/Rect;

    iget v4, v4, Landroid/graphics/Rect;->left:I

    add-int/lit8 v4, v4, -0xf

    int-to-float v4, v4

    cmpl-float v4, v2, v4

    if-ltz v4, :cond_2

    iget-object v4, p0, Lcom/arist/model/skin/ColorProgressBar;->k:Landroid/graphics/Rect;

    iget v4, v4, Landroid/graphics/Rect;->right:I

    add-int/lit8 v4, v4, 0xf

    int-to-float v4, v4

    cmpg-float v2, v2, v4

    if-gez v2, :cond_2

    iget-object v2, p0, Lcom/arist/model/skin/ColorProgressBar;->k:Landroid/graphics/Rect;

    iget v2, v2, Landroid/graphics/Rect;->top:I

    add-int/lit8 v2, v2, -0xf

    int-to-float v2, v2

    cmpl-float v2, v3, v2

    if-ltz v2, :cond_2

    iget-object v2, p0, Lcom/arist/model/skin/ColorProgressBar;->k:Landroid/graphics/Rect;

    iget v2, v2, Landroid/graphics/Rect;->bottom:I

    add-int/lit8 v2, v2, 0xf

    int-to-float v2, v2

    cmpg-float v2, v3, v2

    if-gez v2, :cond_2

    move v0, v1

    :cond_2
    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/arist/model/skin/ColorProgressBar;->m:Landroid/graphics/PointF;

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v2

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v3

    invoke-virtual {v0, v2, v3}, Landroid/graphics/PointF;->set(FF)V

    iput-boolean v1, p0, Lcom/arist/model/skin/ColorProgressBar;->l:Z

    invoke-virtual {p0}, Lcom/arist/model/skin/ColorProgressBar;->invalidate()V

    goto :goto_1

    :cond_3
    iget-boolean v0, p0, Lcom/arist/model/skin/ColorProgressBar;->d:Z

    if-eqz v0, :cond_5

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    iget-object v2, p0, Lcom/arist/model/skin/ColorProgressBar;->f:Landroid/graphics/RectF;

    iget v2, v2, Landroid/graphics/RectF;->bottom:F

    cmpg-float v0, v0, v2

    if-gtz v0, :cond_5

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    iget-object v2, p0, Lcom/arist/model/skin/ColorProgressBar;->f:Landroid/graphics/RectF;

    iget v2, v2, Landroid/graphics/RectF;->top:F

    cmpl-float v0, v0, v2

    if-ltz v0, :cond_5

    iget-object v0, p0, Lcom/arist/model/skin/ColorProgressBar;->f:Landroid/graphics/RectF;

    iget v0, v0, Landroid/graphics/RectF;->bottom:F

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v2

    sub-float/2addr v0, v2

    iget-object v2, p0, Lcom/arist/model/skin/ColorProgressBar;->f:Landroid/graphics/RectF;

    invoke-virtual {v2}, Landroid/graphics/RectF;->height()F

    move-result v2

    div-float/2addr v0, v2

    iput v0, p0, Lcom/arist/model/skin/ColorProgressBar;->e:F

    iget v0, p0, Lcom/arist/model/skin/ColorProgressBar;->e:F

    invoke-direct {p0, v1, v0}, Lcom/arist/model/skin/ColorProgressBar;->a(ZF)V

    :cond_4
    :goto_2
    iget-object v0, p0, Lcom/arist/model/skin/ColorProgressBar;->m:Landroid/graphics/PointF;

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v2

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v3

    invoke-virtual {v0, v2, v3}, Landroid/graphics/PointF;->set(FF)V

    goto/16 :goto_1

    :cond_5
    iget-boolean v0, p0, Lcom/arist/model/skin/ColorProgressBar;->d:Z

    if-nez v0, :cond_4

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    iget-object v2, p0, Lcom/arist/model/skin/ColorProgressBar;->f:Landroid/graphics/RectF;

    iget v2, v2, Landroid/graphics/RectF;->right:F

    cmpg-float v0, v0, v2

    if-gtz v0, :cond_4

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    iget-object v2, p0, Lcom/arist/model/skin/ColorProgressBar;->f:Landroid/graphics/RectF;

    iget v2, v2, Landroid/graphics/RectF;->left:F

    cmpl-float v0, v0, v2

    if-ltz v0, :cond_4

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    iget-object v2, p0, Lcom/arist/model/skin/ColorProgressBar;->f:Landroid/graphics/RectF;

    iget v2, v2, Landroid/graphics/RectF;->left:F

    sub-float/2addr v0, v2

    iget-object v2, p0, Lcom/arist/model/skin/ColorProgressBar;->f:Landroid/graphics/RectF;

    invoke-virtual {v2}, Landroid/graphics/RectF;->width()F

    move-result v2

    div-float/2addr v0, v2

    iput v0, p0, Lcom/arist/model/skin/ColorProgressBar;->e:F

    iget v0, p0, Lcom/arist/model/skin/ColorProgressBar;->e:F

    invoke-direct {p0, v1, v0}, Lcom/arist/model/skin/ColorProgressBar;->a(ZF)V

    goto :goto_2

    :pswitch_2
    iget-boolean v2, p0, Lcom/arist/model/skin/ColorProgressBar;->l:Z

    if-eqz v2, :cond_0

    iget-boolean v0, p0, Lcom/arist/model/skin/ColorProgressBar;->d:Z

    if-eqz v0, :cond_6

    iget v0, p0, Lcom/arist/model/skin/ColorProgressBar;->e:F

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v2

    iget-object v3, p0, Lcom/arist/model/skin/ColorProgressBar;->m:Landroid/graphics/PointF;

    iget v3, v3, Landroid/graphics/PointF;->y:F

    sub-float/2addr v2, v3

    iget-object v3, p0, Lcom/arist/model/skin/ColorProgressBar;->f:Landroid/graphics/RectF;

    invoke-virtual {v3}, Landroid/graphics/RectF;->height()F

    move-result v3

    div-float/2addr v2, v3

    sub-float/2addr v0, v2

    iput v0, p0, Lcom/arist/model/skin/ColorProgressBar;->e:F

    iget v0, p0, Lcom/arist/model/skin/ColorProgressBar;->e:F

    invoke-direct {p0, v1, v0}, Lcom/arist/model/skin/ColorProgressBar;->a(ZF)V

    :goto_3
    iget-object v0, p0, Lcom/arist/model/skin/ColorProgressBar;->m:Landroid/graphics/PointF;

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v2

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v3

    invoke-virtual {v0, v2, v3}, Landroid/graphics/PointF;->set(FF)V

    goto/16 :goto_1

    :cond_6
    iget v0, p0, Lcom/arist/model/skin/ColorProgressBar;->e:F

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v2

    iget-object v3, p0, Lcom/arist/model/skin/ColorProgressBar;->m:Landroid/graphics/PointF;

    iget v3, v3, Landroid/graphics/PointF;->x:F

    sub-float/2addr v2, v3

    iget-object v3, p0, Lcom/arist/model/skin/ColorProgressBar;->f:Landroid/graphics/RectF;

    invoke-virtual {v3}, Landroid/graphics/RectF;->width()F

    move-result v3

    div-float/2addr v2, v3

    add-float/2addr v0, v2

    iput v0, p0, Lcom/arist/model/skin/ColorProgressBar;->e:F

    iget v0, p0, Lcom/arist/model/skin/ColorProgressBar;->e:F

    invoke-direct {p0, v1, v0}, Lcom/arist/model/skin/ColorProgressBar;->a(ZF)V

    goto :goto_3

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
        :pswitch_2
    .end packed-switch
.end method
