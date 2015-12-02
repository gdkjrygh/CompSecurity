.class public Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;
.super Landroid/view/View;
.source "CirclePageIndicator.java"

# interfaces
.implements Lcom/facebook/widget/viewpageindicator/c;


# instance fields
.field private a:F

.field private final b:Landroid/graphics/Paint;

.field private final c:Landroid/graphics/Paint;

.field private final d:Landroid/graphics/Paint;

.field private e:Landroid/support/v4/view/ViewPager;

.field private f:Landroid/support/v4/view/bb;

.field private g:I

.field private h:I

.field private i:F

.field private j:I

.field private k:I

.field private l:Z

.field private m:Z

.field private n:I

.field private o:F

.field private p:I

.field private q:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 70
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 71
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 74
    sget v0, Lcom/facebook/d;->vpiCirclePageIndicatorStyle:I

    invoke-direct {p0, p1, p2, v0}, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 75
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 10

    .prologue
    const/4 v1, 0x1

    .line 78
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 50
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->b:Landroid/graphics/Paint;

    .line 51
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->c:Landroid/graphics/Paint;

    .line 52
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->d:Landroid/graphics/Paint;

    .line 64
    const/high16 v0, -0x40800000    # -1.0f

    iput v0, p0, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->o:F

    .line 65
    const/4 v0, -0x1

    iput v0, p0, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->p:I

    .line 79
    invoke-virtual {p0}, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->isInEditMode()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 119
    :goto_0
    return-void

    .line 82
    :cond_0
    invoke-virtual {p0}, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    .line 83
    sget v1, Lcom/facebook/f;->default_circle_indicator_page_color:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    .line 84
    sget v2, Lcom/facebook/f;->default_circle_indicator_fill_color:I

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    .line 85
    sget v3, Lcom/facebook/j;->default_circle_indicator_orientation:I

    invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getInteger(I)I

    move-result v3

    .line 86
    sget v4, Lcom/facebook/f;->default_circle_indicator_stroke_color:I

    invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getColor(I)I

    move-result v4

    .line 87
    sget v5, Lcom/facebook/g;->default_circle_indicator_stroke_width:I

    invoke-virtual {v0, v5}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v5

    .line 89
    sget v6, Lcom/facebook/g;->default_circle_indicator_radius:I

    invoke-virtual {v0, v6}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v6

    .line 90
    sget v7, Lcom/facebook/e;->default_circle_indicator_centered:I

    invoke-virtual {v0, v7}, Landroid/content/res/Resources;->getBoolean(I)Z

    move-result v7

    .line 91
    sget v8, Lcom/facebook/e;->default_circle_indicator_snap:I

    invoke-virtual {v0, v8}, Landroid/content/res/Resources;->getBoolean(I)Z

    move-result v0

    .line 94
    sget-object v8, Lcom/facebook/q;->CirclePageIndicator:[I

    const/4 v9, 0x0

    invoke-virtual {p1, p2, v8, p3, v9}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v8

    .line 97
    sget v9, Lcom/facebook/q;->CirclePageIndicator_centered:I

    invoke-virtual {v8, v9, v7}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v7

    iput-boolean v7, p0, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->l:Z

    .line 98
    sget v7, Lcom/facebook/q;->CirclePageIndicator_android_orientation:I

    invoke-virtual {v8, v7, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v3

    iput v3, p0, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->k:I

    .line 100
    iget-object v3, p0, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->b:Landroid/graphics/Paint;

    sget-object v7, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v3, v7}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 101
    iget-object v3, p0, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->b:Landroid/graphics/Paint;

    sget v7, Lcom/facebook/q;->CirclePageIndicator_pageColor:I

    invoke-virtual {v8, v7, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v1

    invoke-virtual {v3, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 105
    iget-object v1, p0, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->c:Landroid/graphics/Paint;

    sget-object v3, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v1, v3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 106
    iget-object v1, p0, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->c:Landroid/graphics/Paint;

    sget v3, Lcom/facebook/q;->CirclePageIndicator_strokeColor:I

    invoke-virtual {v8, v3, v4}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v3

    invoke-virtual {v1, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 108
    iget-object v1, p0, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->c:Landroid/graphics/Paint;

    sget v3, Lcom/facebook/q;->CirclePageIndicator_strokeWidth:I

    invoke-virtual {v8, v3, v5}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v3

    invoke-virtual {v1, v3}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 110
    iget-object v1, p0, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->d:Landroid/graphics/Paint;

    sget-object v3, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v1, v3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 111
    iget-object v1, p0, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->d:Landroid/graphics/Paint;

    sget v3, Lcom/facebook/q;->CirclePageIndicator_fillColor:I

    invoke-virtual {v8, v3, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 112
    sget v1, Lcom/facebook/q;->CirclePageIndicator_radius:I

    invoke-virtual {v8, v1, v6}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v1

    iput v1, p0, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->a:F

    .line 113
    sget v1, Lcom/facebook/q;->CirclePageIndicator_snap:I

    invoke-virtual {v8, v1, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    iput-boolean v0, p0, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->m:Z

    .line 115
    invoke-virtual {v8}, Landroid/content/res/TypedArray;->recycle()V

    .line 117
    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object v0

    .line 118
    invoke-static {v0}, Landroid/support/v4/view/ao;->a(Landroid/view/ViewConfiguration;)I

    move-result v0

    iput v0, p0, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->n:I

    goto/16 :goto_0
.end method

.method private c(I)I
    .locals 6

    .prologue
    .line 475
    .line 476
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v2

    .line 477
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v1

    .line 479
    const/high16 v0, 0x40000000    # 2.0f

    if-eq v2, v0, :cond_0

    iget-object v0, p0, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->e:Landroid/support/v4/view/ViewPager;

    if-nez v0, :cond_2

    :cond_0
    move v0, v1

    .line 492
    :cond_1
    :goto_0
    return v0

    .line 484
    :cond_2
    iget-object v0, p0, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->e:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0}, Landroid/support/v4/view/ViewPager;->getAdapter()Landroid/support/v4/view/x;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/view/x;->a()I

    move-result v0

    .line 485
    invoke-virtual {p0}, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->getPaddingLeft()I

    move-result v3

    invoke-virtual {p0}, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->getPaddingRight()I

    move-result v4

    add-int/2addr v3, v4

    int-to-float v3, v3

    mul-int/lit8 v4, v0, 0x2

    int-to-float v4, v4

    iget v5, p0, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->a:F

    mul-float/2addr v4, v5

    add-float/2addr v3, v4

    add-int/lit8 v0, v0, -0x1

    int-to-float v0, v0

    iget v4, p0, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->a:F

    mul-float/2addr v0, v4

    add-float/2addr v0, v3

    const/high16 v3, 0x3f800000    # 1.0f

    add-float/2addr v0, v3

    float-to-int v0, v0

    .line 488
    const/high16 v3, -0x80000000

    if-ne v2, v3, :cond_1

    .line 489
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    goto :goto_0
.end method

.method private d(I)I
    .locals 4

    .prologue
    .line 502
    .line 503
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v2

    .line 504
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v0

    .line 506
    const/high16 v1, 0x40000000    # 2.0f

    if-ne v2, v1, :cond_0

    .line 517
    :goto_0
    return v0

    .line 511
    :cond_0
    const/high16 v1, 0x40000000    # 2.0f

    iget v3, p0, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->a:F

    mul-float/2addr v1, v3

    invoke-virtual {p0}, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->getPaddingTop()I

    move-result v3

    int-to-float v3, v3

    add-float/2addr v1, v3

    invoke-virtual {p0}, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->getPaddingBottom()I

    move-result v3

    int-to-float v3, v3

    add-float/2addr v1, v3

    const/high16 v3, 0x3f800000    # 1.0f

    add-float/2addr v1, v3

    float-to-int v1, v1

    .line 513
    const/high16 v3, -0x80000000

    if-ne v2, v3, :cond_1

    .line 514
    invoke-static {v1, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    goto :goto_0

    :cond_1
    move v0, v1

    goto :goto_0
.end method


# virtual methods
.method public a()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 206
    iput v0, p0, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->g:I

    .line 207
    iput v0, p0, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->h:I

    .line 208
    const/4 v0, 0x0

    iput v0, p0, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->i:F

    .line 209
    invoke-virtual {p0}, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->invalidate()V

    .line 210
    return-void
.end method

.method public a(I)V
    .locals 1

    .prologue
    .line 438
    iget-boolean v0, p0, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->m:Z

    if-nez v0, :cond_0

    iget v0, p0, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->j:I

    if-nez v0, :cond_1

    .line 439
    :cond_0
    iput p1, p0, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->g:I

    .line 440
    iput p1, p0, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->h:I

    .line 441
    invoke-virtual {p0}, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->invalidate()V

    .line 444
    :cond_1
    iget-object v0, p0, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->f:Landroid/support/v4/view/bb;

    if-eqz v0, :cond_2

    .line 445
    iget-object v0, p0, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->f:Landroid/support/v4/view/bb;

    invoke-interface {v0, p1}, Landroid/support/v4/view/bb;->a(I)V

    .line 447
    :cond_2
    return-void
.end method

.method public a(IFI)V
    .locals 1

    .prologue
    .line 427
    iput p1, p0, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->g:I

    .line 428
    iput p2, p0, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->i:F

    .line 429
    invoke-virtual {p0}, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->invalidate()V

    .line 431
    iget-object v0, p0, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->f:Landroid/support/v4/view/bb;

    if-eqz v0, :cond_0

    .line 432
    iget-object v0, p0, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->f:Landroid/support/v4/view/bb;

    invoke-interface {v0, p1, p2, p3}, Landroid/support/v4/view/bb;->a(IFI)V

    .line 434
    :cond_0
    return-void
.end method

.method public b(I)V
    .locals 1

    .prologue
    .line 418
    iput p1, p0, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->j:I

    .line 420
    iget-object v0, p0, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->f:Landroid/support/v4/view/bb;

    if-eqz v0, :cond_0

    .line 421
    iget-object v0, p0, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->f:Landroid/support/v4/view/bb;

    invoke-interface {v0, p1}, Landroid/support/v4/view/bb;->b(I)V

    .line 423
    :cond_0
    return-void
.end method

.method public getFillColor()I
    .locals 1

    .prologue
    .line 146
    iget-object v0, p0, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->d:Landroid/graphics/Paint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->getColor()I

    move-result v0

    return v0
.end method

.method public getOrientation()I
    .locals 1

    .prologue
    .line 163
    iget v0, p0, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->k:I

    return v0
.end method

.method public getPageColor()I
    .locals 1

    .prologue
    .line 137
    iget-object v0, p0, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->b:Landroid/graphics/Paint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->getColor()I

    move-result v0

    return v0
.end method

.method public getRadius()F
    .locals 1

    .prologue
    .line 190
    iget v0, p0, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->a:F

    return v0
.end method

.method public getStrokeColor()I
    .locals 1

    .prologue
    .line 172
    iget-object v0, p0, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->c:Landroid/graphics/Paint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->getColor()I

    move-result v0

    return v0
.end method

.method public getStrokeWidth()F
    .locals 1

    .prologue
    .line 181
    iget-object v0, p0, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->c:Landroid/graphics/Paint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->getStrokeWidth()F

    move-result v0

    return v0
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 11

    .prologue
    const/high16 v8, 0x40000000    # 2.0f

    .line 214
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 216
    iget-object v0, p0, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->e:Landroid/support/v4/view/ViewPager;

    if-nez v0, :cond_1

    .line 295
    :cond_0
    :goto_0
    return-void

    .line 219
    :cond_1
    iget-object v0, p0, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->e:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0}, Landroid/support/v4/view/ViewPager;->getAdapter()Landroid/support/v4/view/x;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/view/x;->a()I

    move-result v6

    .line 220
    if-eqz v6, :cond_0

    .line 224
    iget v0, p0, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->g:I

    if-lt v0, v6, :cond_2

    .line 225
    add-int/lit8 v0, v6, -0x1

    invoke-virtual {p0, v0}, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->setCurrentItem(I)V

    goto :goto_0

    .line 233
    :cond_2
    iget v0, p0, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->k:I

    if-nez v0, :cond_7

    .line 234
    invoke-virtual {p0}, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->getWidth()I

    move-result v3

    .line 235
    invoke-virtual {p0}, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->getPaddingLeft()I

    move-result v2

    .line 236
    invoke-virtual {p0}, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->getPaddingRight()I

    move-result v1

    .line 237
    invoke-virtual {p0}, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->getPaddingTop()I

    move-result v0

    .line 245
    :goto_1
    iget v4, p0, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->a:F

    const/high16 v5, 0x40400000    # 3.0f

    mul-float v7, v4, v5

    .line 246
    int-to-float v0, v0

    iget v4, p0, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->a:F

    add-float/2addr v4, v0

    .line 247
    int-to-float v0, v2

    iget v5, p0, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->a:F

    add-float/2addr v0, v5

    .line 248
    iget-boolean v5, p0, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->l:Z

    if-eqz v5, :cond_3

    .line 249
    sub-int v2, v3, v2

    sub-int v1, v2, v1

    int-to-float v1, v1

    div-float/2addr v1, v8

    int-to-float v2, v6

    mul-float/2addr v2, v7

    div-float/2addr v2, v8

    sub-float/2addr v1, v2

    add-float/2addr v0, v1

    .line 256
    :cond_3
    iget v1, p0, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->a:F

    .line 257
    iget-object v2, p0, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->c:Landroid/graphics/Paint;

    invoke-virtual {v2}, Landroid/graphics/Paint;->getStrokeWidth()F

    move-result v2

    const/4 v3, 0x0

    cmpl-float v2, v2, v3

    if-lez v2, :cond_4

    .line 258
    iget-object v2, p0, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->c:Landroid/graphics/Paint;

    invoke-virtual {v2}, Landroid/graphics/Paint;->getStrokeWidth()F

    move-result v2

    div-float/2addr v2, v8

    sub-float/2addr v1, v2

    .line 262
    :cond_4
    const/4 v2, 0x0

    move v5, v2

    :goto_2
    if-ge v5, v6, :cond_9

    .line 263
    int-to-float v2, v5

    mul-float/2addr v2, v7

    add-float/2addr v2, v0

    .line 264
    iget v3, p0, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->k:I

    if-nez v3, :cond_8

    move v3, v2

    move v2, v4

    .line 272
    :goto_3
    iget-object v8, p0, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->b:Landroid/graphics/Paint;

    invoke-virtual {v8}, Landroid/graphics/Paint;->getAlpha()I

    move-result v8

    if-lez v8, :cond_5

    .line 273
    iget-object v8, p0, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->b:Landroid/graphics/Paint;

    invoke-virtual {p1, v3, v2, v1, v8}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 277
    :cond_5
    iget v8, p0, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->a:F

    cmpl-float v8, v1, v8

    if-eqz v8, :cond_6

    .line 278
    iget v8, p0, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->a:F

    iget-object v9, p0, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->c:Landroid/graphics/Paint;

    invoke-virtual {p1, v3, v2, v8, v9}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 262
    :cond_6
    add-int/lit8 v2, v5, 0x1

    move v5, v2

    goto :goto_2

    .line 239
    :cond_7
    invoke-virtual {p0}, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->getHeight()I

    move-result v3

    .line 240
    invoke-virtual {p0}, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->getPaddingTop()I

    move-result v2

    .line 241
    invoke-virtual {p0}, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->getPaddingBottom()I

    move-result v1

    .line 242
    invoke-virtual {p0}, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->getPaddingLeft()I

    move-result v0

    goto :goto_1

    :cond_8
    move v3, v4

    .line 269
    goto :goto_3

    .line 283
    :cond_9
    iget-boolean v1, p0, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->m:Z

    if-eqz v1, :cond_b

    iget v1, p0, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->h:I

    :goto_4
    int-to-float v1, v1

    mul-float/2addr v1, v7

    .line 284
    iget-boolean v2, p0, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->m:Z

    if-nez v2, :cond_a

    .line 285
    iget v2, p0, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->i:F

    mul-float/2addr v2, v7

    add-float/2addr v1, v2

    .line 287
    :cond_a
    iget v2, p0, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->k:I

    if-nez v2, :cond_c

    .line 288
    add-float/2addr v0, v1

    .line 294
    :goto_5
    iget v1, p0, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->a:F

    iget-object v2, p0, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->d:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v4, v1, v2}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    goto/16 :goto_0

    .line 283
    :cond_b
    iget v1, p0, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->g:I

    goto :goto_4

    .line 292
    :cond_c
    add-float/2addr v0, v1

    move v10, v0

    move v0, v4

    move v4, v10

    goto :goto_5
.end method

.method protected onMeasure(II)V
    .locals 2

    .prologue
    .line 461
    iget v0, p0, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->k:I

    if-nez v0, :cond_0

    .line 462
    invoke-direct {p0, p1}, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->c(I)I

    move-result v0

    invoke-direct {p0, p2}, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->d(I)I

    move-result v1

    invoke-virtual {p0, v0, v1}, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->setMeasuredDimension(II)V

    .line 466
    :goto_0
    return-void

    .line 464
    :cond_0
    invoke-direct {p0, p1}, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->d(I)I

    move-result v0

    invoke-direct {p0, p2}, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->c(I)I

    move-result v1

    invoke-virtual {p0, v0, v1}, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->setMeasuredDimension(II)V

    goto :goto_0
.end method

.method public onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 1

    .prologue
    .line 522
    check-cast p1, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator$SavedState;

    .line 523
    invoke-virtual {p1}, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator$SavedState;->getSuperState()Landroid/os/Parcelable;

    move-result-object v0

    invoke-super {p0, v0}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 524
    iget v0, p1, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator$SavedState;->a:I

    iput v0, p0, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->g:I

    .line 525
    iget v0, p1, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator$SavedState;->a:I

    iput v0, p0, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->h:I

    .line 526
    invoke-virtual {p0}, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->requestLayout()V

    .line 527
    return-void
.end method

.method public onSaveInstanceState()Landroid/os/Parcelable;
    .locals 2

    .prologue
    .line 531
    invoke-super {p0}, Landroid/view/View;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v0

    .line 532
    new-instance v1, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator$SavedState;

    invoke-direct {v1, v0}, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator$SavedState;-><init>(Landroid/os/Parcelable;)V

    .line 533
    iget v0, p0, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->g:I

    iput v0, v1, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator$SavedState;->a:I

    .line 534
    return-object v1
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 7

    .prologue
    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 298
    invoke-super {p0, p1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 376
    :cond_0
    :goto_0
    return v1

    .line 301
    :cond_1
    iget-object v2, p0, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->e:Landroid/support/v4/view/ViewPager;

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->e:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v2}, Landroid/support/v4/view/ViewPager;->getAdapter()Landroid/support/v4/view/x;

    move-result-object v2

    invoke-virtual {v2}, Landroid/support/v4/view/x;->a()I

    move-result v2

    if-nez v2, :cond_3

    :cond_2
    move v1, v0

    .line 302
    goto :goto_0

    .line 305
    :cond_3
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v2

    .line 307
    and-int/lit16 v2, v2, 0xff

    packed-switch v2, :pswitch_data_0

    :pswitch_0
    goto :goto_0

    .line 309
    :pswitch_1
    invoke-static {p1, v0}, Landroid/support/v4/view/s;->b(Landroid/view/MotionEvent;I)I

    move-result v0

    iput v0, p0, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->p:I

    .line 310
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    iput v0, p0, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->o:F

    goto :goto_0

    .line 314
    :pswitch_2
    iget v0, p0, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->p:I

    invoke-static {p1, v0}, Landroid/support/v4/view/s;->a(Landroid/view/MotionEvent;I)I

    move-result v0

    .line 315
    invoke-static {p1, v0}, Landroid/support/v4/view/s;->c(Landroid/view/MotionEvent;I)F

    move-result v0

    .line 316
    iget v2, p0, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->o:F

    sub-float v2, v0, v2

    .line 318
    iget-boolean v3, p0, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->q:Z

    if-nez v3, :cond_4

    .line 319
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    move-result v3

    iget v4, p0, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->n:I

    int-to-float v4, v4

    cmpl-float v3, v3, v4

    if-lez v3, :cond_4

    .line 320
    iput-boolean v1, p0, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->q:Z

    .line 324
    :cond_4
    iget-boolean v3, p0, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->q:Z

    if-eqz v3, :cond_0

    .line 325
    iput v0, p0, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->o:F

    .line 326
    iget-object v0, p0, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->e:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0}, Landroid/support/v4/view/ViewPager;->f()Z

    move-result v0

    if-nez v0, :cond_5

    iget-object v0, p0, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->e:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0}, Landroid/support/v4/view/ViewPager;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 327
    :cond_5
    iget-object v0, p0, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->e:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0, v2}, Landroid/support/v4/view/ViewPager;->b(F)V

    goto :goto_0

    .line 336
    :pswitch_3
    iget-boolean v2, p0, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->q:Z

    if-nez v2, :cond_7

    .line 337
    iget-object v2, p0, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->e:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v2}, Landroid/support/v4/view/ViewPager;->getAdapter()Landroid/support/v4/view/x;

    move-result-object v2

    invoke-virtual {v2}, Landroid/support/v4/view/x;->a()I

    move-result v2

    .line 338
    invoke-virtual {p0}, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->getWidth()I

    move-result v3

    .line 339
    int-to-float v4, v3

    const/high16 v5, 0x40000000    # 2.0f

    div-float/2addr v4, v5

    .line 340
    int-to-float v3, v3

    const/high16 v5, 0x40c00000    # 6.0f

    div-float/2addr v3, v5

    .line 342
    iget v5, p0, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->g:I

    if-lez v5, :cond_6

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v5

    sub-float v6, v4, v3

    cmpg-float v5, v5, v6

    if-gez v5, :cond_6

    .line 343
    iget-object v0, p0, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->e:Landroid/support/v4/view/ViewPager;

    iget v2, p0, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->g:I

    add-int/lit8 v2, v2, -0x1

    invoke-virtual {v0, v2}, Landroid/support/v4/view/ViewPager;->setCurrentItem(I)V

    goto/16 :goto_0

    .line 345
    :cond_6
    iget v5, p0, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->g:I

    add-int/lit8 v2, v2, -0x1

    if-ge v5, v2, :cond_7

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v2

    add-float/2addr v3, v4

    cmpl-float v2, v2, v3

    if-lez v2, :cond_7

    .line 346
    iget-object v0, p0, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->e:Landroid/support/v4/view/ViewPager;

    iget v2, p0, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->g:I

    add-int/lit8 v2, v2, 0x1

    invoke-virtual {v0, v2}, Landroid/support/v4/view/ViewPager;->setCurrentItem(I)V

    goto/16 :goto_0

    .line 351
    :cond_7
    iput-boolean v0, p0, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->q:Z

    .line 352
    const/4 v0, -0x1

    iput v0, p0, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->p:I

    .line 353
    iget-object v0, p0, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->e:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0}, Landroid/support/v4/view/ViewPager;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->e:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0}, Landroid/support/v4/view/ViewPager;->e()V

    goto/16 :goto_0

    .line 357
    :pswitch_4
    invoke-static {p1}, Landroid/support/v4/view/s;->a(Landroid/view/MotionEvent;)I

    move-result v0

    .line 358
    invoke-static {p1, v0}, Landroid/support/v4/view/s;->c(Landroid/view/MotionEvent;I)F

    move-result v2

    .line 359
    iput v2, p0, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->o:F

    .line 360
    invoke-static {p1, v0}, Landroid/support/v4/view/s;->b(Landroid/view/MotionEvent;I)I

    move-result v0

    iput v0, p0, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->p:I

    goto/16 :goto_0

    .line 365
    :pswitch_5
    invoke-static {p1}, Landroid/support/v4/view/s;->a(Landroid/view/MotionEvent;)I

    move-result v2

    .line 366
    invoke-static {p1, v2}, Landroid/support/v4/view/s;->b(Landroid/view/MotionEvent;I)I

    move-result v3

    .line 367
    iget v4, p0, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->p:I

    if-ne v3, v4, :cond_9

    .line 368
    if-nez v2, :cond_8

    move v0, v1

    .line 369
    :cond_8
    invoke-static {p1, v0}, Landroid/support/v4/view/s;->b(Landroid/view/MotionEvent;I)I

    move-result v0

    iput v0, p0, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->p:I

    .line 371
    :cond_9
    iget v0, p0, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->p:I

    invoke-static {p1, v0}, Landroid/support/v4/view/s;->a(Landroid/view/MotionEvent;I)I

    move-result v0

    invoke-static {p1, v0}, Landroid/support/v4/view/s;->c(Landroid/view/MotionEvent;I)F

    move-result v0

    iput v0, p0, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->o:F

    goto/16 :goto_0

    .line 307
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_3
        :pswitch_2
        :pswitch_3
        :pswitch_0
        :pswitch_4
        :pswitch_5
    .end packed-switch
.end method

.method public setCentered(Z)V
    .locals 0

    .prologue
    .line 123
    iput-boolean p1, p0, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->l:Z

    .line 124
    invoke-virtual {p0}, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->invalidate()V

    .line 125
    return-void
.end method

.method public setCurrentItem(I)V
    .locals 2

    .prologue
    .line 403
    iget-object v0, p0, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->e:Landroid/support/v4/view/ViewPager;

    if-nez v0, :cond_0

    .line 404
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "ViewPager has not been bound."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 406
    :cond_0
    iget-object v0, p0, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->e:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0, p1}, Landroid/support/v4/view/ViewPager;->setCurrentItem(I)V

    .line 407
    iput p1, p0, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->g:I

    .line 408
    invoke-virtual {p0}, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->invalidate()V

    .line 409
    return-void
.end method

.method public setFillColor(I)V
    .locals 1

    .prologue
    .line 141
    iget-object v0, p0, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->d:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 142
    invoke-virtual {p0}, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->invalidate()V

    .line 143
    return-void
.end method

.method public setOnPageChangeListener(Landroid/support/v4/view/bb;)V
    .locals 0

    .prologue
    .line 451
    iput-object p1, p0, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->f:Landroid/support/v4/view/bb;

    .line 452
    return-void
.end method

.method public setOrientation(I)V
    .locals 2

    .prologue
    .line 150
    packed-switch p1, :pswitch_data_0

    .line 158
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Orientation must be either HORIZONTAL or VERTICAL."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 153
    :pswitch_0
    iput p1, p0, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->k:I

    .line 154
    invoke-virtual {p0}, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->requestLayout()V

    .line 160
    return-void

    .line 150
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public setPageColor(I)V
    .locals 1

    .prologue
    .line 132
    iget-object v0, p0, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->b:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 133
    invoke-virtual {p0}, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->invalidate()V

    .line 134
    return-void
.end method

.method public setRadius(F)V
    .locals 0

    .prologue
    .line 185
    iput p1, p0, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->a:F

    .line 186
    invoke-virtual {p0}, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->invalidate()V

    .line 187
    return-void
.end method

.method public setSnap(Z)V
    .locals 0

    .prologue
    .line 194
    iput-boolean p1, p0, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->m:Z

    .line 195
    invoke-virtual {p0}, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->invalidate()V

    .line 196
    return-void
.end method

.method public setStrokeColor(I)V
    .locals 1

    .prologue
    .line 167
    iget-object v0, p0, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->c:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 168
    invoke-virtual {p0}, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->invalidate()V

    .line 169
    return-void
.end method

.method public setStrokeWidth(F)V
    .locals 1

    .prologue
    .line 176
    iget-object v0, p0, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->c:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 177
    invoke-virtual {p0}, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->invalidate()V

    .line 178
    return-void
.end method

.method public setViewPager(Landroid/support/v4/view/ViewPager;)V
    .locals 2

    .prologue
    .line 381
    iget-object v0, p0, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->e:Landroid/support/v4/view/ViewPager;

    if-ne v0, p1, :cond_0

    .line 393
    :goto_0
    return-void

    .line 384
    :cond_0
    iget-object v0, p0, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->e:Landroid/support/v4/view/ViewPager;

    if-eqz v0, :cond_1

    .line 385
    iget-object v0, p0, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->e:Landroid/support/v4/view/ViewPager;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->setOnPageChangeListener(Landroid/support/v4/view/bb;)V

    .line 387
    :cond_1
    invoke-virtual {p1}, Landroid/support/v4/view/ViewPager;->getAdapter()Landroid/support/v4/view/x;

    move-result-object v0

    if-nez v0, :cond_2

    .line 388
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "ViewPager does not have adapter instance."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 390
    :cond_2
    iput-object p1, p0, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->e:Landroid/support/v4/view/ViewPager;

    .line 391
    iget-object v0, p0, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->e:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0, p0}, Landroid/support/v4/view/ViewPager;->setOnPageChangeListener(Landroid/support/v4/view/bb;)V

    .line 392
    invoke-virtual {p0}, Lcom/facebook/widget/viewpageindicator/CirclePageIndicator;->invalidate()V

    goto :goto_0
.end method
