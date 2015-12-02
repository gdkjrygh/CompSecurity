.class public Lcom/qihoo/security/booster/widget/DialView/DialBg;
.super Landroid/view/View;
.source "360Security"


# instance fields
.field a:Landroid/graphics/RectF;

.field b:Landroid/graphics/RectF;

.field private final c:Landroid/graphics/Paint;

.field private final d:F

.field private final e:I

.field private final f:F

.field private final g:F

.field private h:F

.field private i:I

.field private j:F


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    const/4 v2, 0x0

    .line 30
    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 31
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/booster/widget/DialView/DialBg;->c:Landroid/graphics/Paint;

    .line 32
    iget-object v0, p0, Lcom/qihoo/security/booster/widget/DialView/DialBg;->c:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 33
    iget-object v0, p0, Lcom/qihoo/security/booster/widget/DialView/DialBg;->c:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 35
    sget-object v0, Lcom/qihoo/security/lite/a$a;->BoostDialView:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v0

    .line 36
    invoke-virtual {v0, v3, v3}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v1

    iput v1, p0, Lcom/qihoo/security/booster/widget/DialView/DialBg;->i:I

    .line 38
    const/4 v1, 0x3

    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v1

    iput v1, p0, Lcom/qihoo/security/booster/widget/DialView/DialBg;->h:F

    .line 39
    const/4 v1, 0x4

    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v1

    iput v1, p0, Lcom/qihoo/security/booster/widget/DialView/DialBg;->g:F

    .line 40
    const/4 v1, 0x5

    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v1

    iput v1, p0, Lcom/qihoo/security/booster/widget/DialView/DialBg;->d:F

    .line 41
    const/4 v1, 0x7

    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v1

    iput v1, p0, Lcom/qihoo/security/booster/widget/DialView/DialBg;->f:F

    .line 42
    const/4 v1, 0x6

    iget v2, p0, Lcom/qihoo/security/booster/widget/DialView/DialBg;->i:I

    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v1

    iput v1, p0, Lcom/qihoo/security/booster/widget/DialView/DialBg;->e:I

    .line 43
    iget v1, p0, Lcom/qihoo/security/booster/widget/DialView/DialBg;->f:F

    iput v1, p0, Lcom/qihoo/security/booster/widget/DialView/DialBg;->j:F

    .line 45
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 46
    return-void
.end method


# virtual methods
.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 11

    .prologue
    const/4 v4, 0x0

    const/high16 v3, 0x43700000    # 240.0f

    const/high16 v10, 0x40000000    # 2.0f

    const/4 v2, 0x0

    .line 53
    invoke-virtual {p0}, Lcom/qihoo/security/booster/widget/DialView/DialBg;->getWidth()I

    move-result v0

    div-int/lit8 v6, v0, 0x2

    .line 54
    const/high16 v0, 0x43160000    # 150.0f

    int-to-float v1, v6

    int-to-float v5, v6

    invoke-virtual {p1, v0, v1, v5}, Landroid/graphics/Canvas;->rotate(FFF)V

    .line 57
    int-to-float v0, v6

    iget v1, p0, Lcom/qihoo/security/booster/widget/DialView/DialBg;->d:F

    sub-float/2addr v0, v1

    iget v1, p0, Lcom/qihoo/security/booster/widget/DialView/DialBg;->f:F

    div-float/2addr v1, v10

    sub-float/2addr v0, v1

    float-to-int v7, v0

    .line 58
    iget-object v0, p0, Lcom/qihoo/security/booster/widget/DialView/DialBg;->c:Landroid/graphics/Paint;

    iget v1, p0, Lcom/qihoo/security/booster/widget/DialView/DialBg;->e:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 60
    iget-object v0, p0, Lcom/qihoo/security/booster/widget/DialView/DialBg;->a:Landroid/graphics/RectF;

    if-nez v0, :cond_0

    .line 61
    new-instance v0, Landroid/graphics/RectF;

    sub-int v1, v6, v7

    int-to-float v1, v1

    sub-int v5, v6, v7

    int-to-float v5, v5

    add-int v8, v6, v7

    int-to-float v8, v8

    add-int v9, v6, v7

    int-to-float v9, v9

    invoke-direct {v0, v1, v5, v8, v9}, Landroid/graphics/RectF;-><init>(FFFF)V

    iput-object v0, p0, Lcom/qihoo/security/booster/widget/DialView/DialBg;->a:Landroid/graphics/RectF;

    .line 65
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/booster/widget/DialView/DialBg;->c:Landroid/graphics/Paint;

    iget v1, p0, Lcom/qihoo/security/booster/widget/DialView/DialBg;->f:F

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 66
    iget-object v1, p0, Lcom/qihoo/security/booster/widget/DialView/DialBg;->a:Landroid/graphics/RectF;

    iget-object v5, p0, Lcom/qihoo/security/booster/widget/DialView/DialBg;->c:Landroid/graphics/Paint;

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    .line 78
    iget-object v0, p0, Lcom/qihoo/security/booster/widget/DialView/DialBg;->c:Landroid/graphics/Paint;

    iget v1, p0, Lcom/qihoo/security/booster/widget/DialView/DialBg;->i:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 79
    int-to-float v0, v7

    iget v1, p0, Lcom/qihoo/security/booster/widget/DialView/DialBg;->h:F

    div-float/2addr v1, v10

    iget v5, p0, Lcom/qihoo/security/booster/widget/DialView/DialBg;->g:F

    add-float/2addr v1, v5

    sub-float/2addr v0, v1

    float-to-int v0, v0

    .line 80
    iget-object v1, p0, Lcom/qihoo/security/booster/widget/DialView/DialBg;->b:Landroid/graphics/RectF;

    if-nez v1, :cond_1

    .line 81
    new-instance v1, Landroid/graphics/RectF;

    sub-int v5, v6, v0

    int-to-float v5, v5

    sub-int v7, v6, v0

    int-to-float v7, v7

    add-int v8, v6, v0

    int-to-float v8, v8

    add-int/2addr v0, v6

    int-to-float v0, v0

    invoke-direct {v1, v5, v7, v8, v0}, Landroid/graphics/RectF;-><init>(FFFF)V

    iput-object v1, p0, Lcom/qihoo/security/booster/widget/DialView/DialBg;->b:Landroid/graphics/RectF;

    .line 83
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/booster/widget/DialView/DialBg;->c:Landroid/graphics/Paint;

    iget v1, p0, Lcom/qihoo/security/booster/widget/DialView/DialBg;->h:F

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 84
    iget-object v1, p0, Lcom/qihoo/security/booster/widget/DialView/DialBg;->b:Landroid/graphics/RectF;

    iget-object v5, p0, Lcom/qihoo/security/booster/widget/DialView/DialBg;->c:Landroid/graphics/Paint;

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    .line 86
    return-void
.end method
