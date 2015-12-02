.class public final Lcom/mobvista/sdk/m/b/d;
.super Landroid/view/ViewGroup;
.source "360Security"


# instance fields
.field private a:I

.field private b:I

.field private c:I

.field private d:Landroid/widget/Scroller;

.field private e:I

.field private f:Z

.field private g:F

.field private h:F

.field private i:I

.field private j:Z

.field private k:Landroid/view/VelocityTracker;

.field private l:I

.field private m:Lcom/mobvista/sdk/m/b/e;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .prologue
    const/4 v1, 0x1

    .line 48
    invoke-direct {p0, p1}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;)V

    .line 24
    iput v1, p0, Lcom/mobvista/sdk/m/b/d;->a:I

    .line 26
    const/4 v0, -0x1

    iput v0, p0, Lcom/mobvista/sdk/m/b/d;->c:I

    .line 30
    iput-boolean v1, p0, Lcom/mobvista/sdk/m/b/d;->f:Z

    .line 37
    const/4 v0, 0x0

    iput v0, p0, Lcom/mobvista/sdk/m/b/d;->l:I

    .line 49
    invoke-direct {p0}, Lcom/mobvista/sdk/m/b/d;->a()V

    .line 50
    return-void
.end method

.method private a()V
    .locals 2

    .prologue
    .line 95
    new-instance v0, Landroid/widget/Scroller;

    invoke-virtual {p0}, Lcom/mobvista/sdk/m/b/d;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/widget/Scroller;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/mobvista/sdk/m/b/d;->d:Landroid/widget/Scroller;

    .line 96
    iget v0, p0, Lcom/mobvista/sdk/m/b/d;->a:I

    iput v0, p0, Lcom/mobvista/sdk/m/b/d;->b:I

    .line 97
    invoke-virtual {p0}, Lcom/mobvista/sdk/m/b/d;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object v0

    .line 99
    invoke-virtual {v0}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    move-result v0

    iput v0, p0, Lcom/mobvista/sdk/m/b/d;->i:I

    .line 101
    return-void
.end method

.method private b()I
    .locals 1

    .prologue
    .line 108
    iget v0, p0, Lcom/mobvista/sdk/m/b/d;->b:I

    return v0
.end method

.method private b(I)V
    .locals 6

    .prologue
    const/4 v0, 0x1

    const/4 v2, 0x0

    .line 588
    iget-object v1, p0, Lcom/mobvista/sdk/m/b/d;->d:Landroid/widget/Scroller;

    invoke-virtual {v1}, Landroid/widget/Scroller;->isFinished()Z

    move-result v1

    if-nez v1, :cond_0

    .line 633
    :goto_0
    return-void

    .line 590
    :cond_0
    invoke-direct {p0}, Lcom/mobvista/sdk/m/b/d;->c()V

    .line 591
    invoke-virtual {p0}, Lcom/mobvista/sdk/m/b/d;->getChildCount()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    .line 592
    if-gez p1, :cond_1

    .line 595
    const/4 v0, -0x1

    iput v0, p0, Lcom/mobvista/sdk/m/b/d;->l:I

    goto :goto_0

    .line 597
    :cond_1
    if-le p1, v1, :cond_2

    .line 599
    iput v0, p0, Lcom/mobvista/sdk/m/b/d;->l:I

    goto :goto_0

    .line 602
    :cond_2
    iput v2, p0, Lcom/mobvista/sdk/m/b/d;->l:I

    .line 605
    iget v1, p0, Lcom/mobvista/sdk/m/b/d;->b:I

    if-eq p1, v1, :cond_4

    .line 606
    :goto_1
    iput p1, p0, Lcom/mobvista/sdk/m/b/d;->c:I

    .line 607
    invoke-virtual {p0}, Lcom/mobvista/sdk/m/b/d;->getFocusedChild()Landroid/view/View;

    move-result-object v1

    .line 608
    if-eqz v1, :cond_3

    if-eqz v0, :cond_3

    iget v0, p0, Lcom/mobvista/sdk/m/b/d;->b:I

    invoke-virtual {p0, v0}, Lcom/mobvista/sdk/m/b/d;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    if-ne v1, v0, :cond_3

    .line 610
    invoke-virtual {v1}, Landroid/view/View;->clearFocus()V

    .line 612
    :cond_3
    invoke-virtual {p0}, Lcom/mobvista/sdk/m/b/d;->getWidth()I

    move-result v0

    mul-int/2addr v0, p1

    .line 613
    invoke-virtual {p0}, Lcom/mobvista/sdk/m/b/d;->getScrollX()I

    move-result v1

    sub-int v3, v0, v1

    .line 614
    iget-object v0, p0, Lcom/mobvista/sdk/m/b/d;->d:Landroid/widget/Scroller;

    invoke-virtual {p0}, Lcom/mobvista/sdk/m/b/d;->getScrollX()I

    move-result v1

    invoke-static {v3}, Ljava/lang/Math;->abs(I)I

    move-result v4

    div-int/lit8 v5, v4, 0x2

    move v4, v2

    invoke-virtual/range {v0 .. v5}, Landroid/widget/Scroller;->startScroll(IIIII)V

    .line 615
    invoke-virtual {p0}, Lcom/mobvista/sdk/m/b/d;->invalidate()V

    goto :goto_0

    :cond_4
    move v0, v2

    .line 605
    goto :goto_1
.end method

.method private c()V
    .locals 5

    .prologue
    const/4 v4, 0x1

    .line 426
    invoke-virtual {p0}, Lcom/mobvista/sdk/m/b/d;->getChildCount()I

    move-result v2

    .line 427
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-ge v1, v2, :cond_1

    .line 428
    invoke-virtual {p0, v1}, Lcom/mobvista/sdk/m/b/d;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 429
    invoke-virtual {v0, v4}, Landroid/view/View;->setDrawingCacheEnabled(Z)V

    .line 430
    instance-of v3, v0, Landroid/view/ViewGroup;

    if-eqz v3, :cond_0

    .line 431
    check-cast v0, Landroid/view/ViewGroup;

    invoke-virtual {v0, v4}, Landroid/view/ViewGroup;->setAlwaysDrawnWithCacheEnabled(Z)V

    .line 427
    :cond_0
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 434
    :cond_1
    return-void
.end method

.method private d()V
    .locals 5

    .prologue
    const/4 v2, 0x0

    .line 437
    invoke-virtual {p0}, Lcom/mobvista/sdk/m/b/d;->getChildCount()I

    move-result v3

    move v1, v2

    .line 438
    :goto_0
    if-ge v1, v3, :cond_1

    .line 439
    invoke-virtual {p0, v1}, Lcom/mobvista/sdk/m/b/d;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 440
    instance-of v4, v0, Landroid/view/ViewGroup;

    if-eqz v4, :cond_0

    .line 441
    check-cast v0, Landroid/view/ViewGroup;

    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->setAlwaysDrawnWithCacheEnabled(Z)V

    .line 438
    :cond_0
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 444
    :cond_1
    return-void
.end method

.method private e()V
    .locals 4

    .prologue
    .line 574
    invoke-virtual {p0}, Lcom/mobvista/sdk/m/b/d;->getWidth()I

    move-result v1

    .line 575
    invoke-virtual {p0}, Lcom/mobvista/sdk/m/b/d;->getScrollX()I

    move-result v0

    shr-int/lit8 v2, v1, 0x1

    add-int/2addr v2, v0

    .line 576
    invoke-virtual {p0}, Lcom/mobvista/sdk/m/b/d;->getChildCount()I

    move-result v0

    .line 578
    if-gez v2, :cond_1

    .line 579
    const/4 v0, -0x1

    .line 584
    :cond_0
    :goto_0
    invoke-direct {p0, v0}, Lcom/mobvista/sdk/m/b/d;->b(I)V

    .line 585
    return-void

    .line 580
    :cond_1
    mul-int v3, v1, v0

    if-gt v2, v3, :cond_0

    .line 583
    invoke-virtual {p0}, Lcom/mobvista/sdk/m/b/d;->getScrollX()I

    move-result v0

    div-int/lit8 v2, v1, 0x2

    add-int/2addr v0, v2

    div-int/2addr v0, v1

    goto :goto_0
.end method


# virtual methods
.method public final a(I)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 113
    invoke-virtual {p0}, Lcom/mobvista/sdk/m/b/d;->getChildCount()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    invoke-static {v2, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    iput v0, p0, Lcom/mobvista/sdk/m/b/d;->b:I

    .line 115
    iget v0, p0, Lcom/mobvista/sdk/m/b/d;->b:I

    invoke-virtual {p0}, Lcom/mobvista/sdk/m/b/d;->getWidth()I

    move-result v1

    mul-int/2addr v0, v1

    invoke-virtual {p0, v0, v2}, Lcom/mobvista/sdk/m/b/d;->scrollTo(II)V

    .line 116
    iget-object v0, p0, Lcom/mobvista/sdk/m/b/d;->m:Lcom/mobvista/sdk/m/b/e;

    if-eqz v0, :cond_0

    .line 117
    iget-object v0, p0, Lcom/mobvista/sdk/m/b/d;->m:Lcom/mobvista/sdk/m/b/e;

    iget v1, p0, Lcom/mobvista/sdk/m/b/d;->b:I

    invoke-interface {v0, v1}, Lcom/mobvista/sdk/m/b/e;->a(I)V

    .line 119
    :cond_0
    invoke-virtual {p0}, Lcom/mobvista/sdk/m/b/d;->invalidate()V

    .line 120
    return-void
.end method

.method public final a(Lcom/mobvista/sdk/m/b/e;)V
    .locals 0

    .prologue
    .line 667
    iput-object p1, p0, Lcom/mobvista/sdk/m/b/d;->m:Lcom/mobvista/sdk/m/b/e;

    .line 668
    return-void
.end method

.method public final computeScroll()V
    .locals 4

    .prologue
    const/4 v3, 0x0

    const/4 v2, -0x1

    .line 130
    iget-object v0, p0, Lcom/mobvista/sdk/m/b/d;->d:Landroid/widget/Scroller;

    invoke-virtual {v0}, Landroid/widget/Scroller;->computeScrollOffset()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 132
    iget-object v0, p0, Lcom/mobvista/sdk/m/b/d;->d:Landroid/widget/Scroller;

    invoke-virtual {v0}, Landroid/widget/Scroller;->getCurrX()I

    move-result v0

    iget-object v1, p0, Lcom/mobvista/sdk/m/b/d;->d:Landroid/widget/Scroller;

    invoke-virtual {v1}, Landroid/widget/Scroller;->getCurrY()I

    move-result v1

    .line 133
    invoke-virtual {p0}, Lcom/mobvista/sdk/m/b/d;->getScrollX()I

    move-result v2

    invoke-virtual {p0}, Lcom/mobvista/sdk/m/b/d;->getScrollY()I

    move-result v3

    .line 134
    if-ne v0, v2, :cond_0

    if-eq v1, v3, :cond_2

    .line 135
    :cond_0
    iget-object v0, p0, Lcom/mobvista/sdk/m/b/d;->d:Landroid/widget/Scroller;

    invoke-virtual {v0}, Landroid/widget/Scroller;->getCurrX()I

    move-result v0

    iget-object v1, p0, Lcom/mobvista/sdk/m/b/d;->d:Landroid/widget/Scroller;

    invoke-virtual {v1}, Landroid/widget/Scroller;->getCurrY()I

    move-result v1

    invoke-virtual {p0, v0, v1}, Lcom/mobvista/sdk/m/b/d;->scrollTo(II)V

    .line 152
    :cond_1
    :goto_0
    return-void

    .line 137
    :cond_2
    invoke-virtual {p0}, Lcom/mobvista/sdk/m/b/d;->invalidate()V

    goto :goto_0

    .line 138
    :cond_3
    iget v0, p0, Lcom/mobvista/sdk/m/b/d;->c:I

    if-eq v0, v2, :cond_1

    .line 139
    iget v0, p0, Lcom/mobvista/sdk/m/b/d;->c:I

    invoke-virtual {p0}, Lcom/mobvista/sdk/m/b/d;->getChildCount()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    invoke-static {v3, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    iput v0, p0, Lcom/mobvista/sdk/m/b/d;->b:I

    .line 141
    iput v2, p0, Lcom/mobvista/sdk/m/b/d;->c:I

    .line 142
    iput v3, p0, Lcom/mobvista/sdk/m/b/d;->l:I

    .line 143
    invoke-direct {p0}, Lcom/mobvista/sdk/m/b/d;->d()V

    .line 144
    invoke-virtual {p0}, Lcom/mobvista/sdk/m/b/d;->getScrollX()I

    move-result v0

    invoke-virtual {p0}, Lcom/mobvista/sdk/m/b/d;->getScrollY()I

    move-result v1

    iget v2, p0, Lcom/mobvista/sdk/m/b/d;->b:I

    invoke-virtual {p0}, Lcom/mobvista/sdk/m/b/d;->getWidth()I

    move-result v3

    mul-int/2addr v2, v3

    .line 146
    if-eq v0, v2, :cond_4

    .line 147
    invoke-virtual {p0, v2, v1}, Lcom/mobvista/sdk/m/b/d;->scrollTo(II)V

    .line 148
    :cond_4
    iget-object v0, p0, Lcom/mobvista/sdk/m/b/d;->m:Lcom/mobvista/sdk/m/b/e;

    if-eqz v0, :cond_1

    .line 149
    iget-object v0, p0, Lcom/mobvista/sdk/m/b/d;->m:Lcom/mobvista/sdk/m/b/e;

    iget v1, p0, Lcom/mobvista/sdk/m/b/d;->b:I

    invoke-interface {v0, v1}, Lcom/mobvista/sdk/m/b/e;->a(I)V

    goto :goto_0
.end method

.method protected final dispatchDraw(Landroid/graphics/Canvas;)V
    .locals 6

    .prologue
    const/4 v2, 0x1

    const/4 v0, 0x0

    .line 162
    iget v1, p0, Lcom/mobvista/sdk/m/b/d;->e:I

    if-eq v1, v2, :cond_1

    iget v1, p0, Lcom/mobvista/sdk/m/b/d;->c:I

    const/4 v3, -0x1

    if-ne v1, v3, :cond_1

    move v1, v2

    .line 165
    :goto_0
    if-eqz v1, :cond_2

    .line 166
    iget v0, p0, Lcom/mobvista/sdk/m/b/d;->b:I

    invoke-virtual {p0, v0}, Lcom/mobvista/sdk/m/b/d;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {p0}, Lcom/mobvista/sdk/m/b/d;->getDrawingTime()J

    move-result-wide v2

    invoke-virtual {p0, p1, v0, v2, v3}, Lcom/mobvista/sdk/m/b/d;->drawChild(Landroid/graphics/Canvas;Landroid/view/View;J)Z

    .line 254
    :cond_0
    :goto_1
    return-void

    :cond_1
    move v1, v0

    .line 162
    goto :goto_0

    .line 168
    :cond_2
    invoke-virtual {p0}, Lcom/mobvista/sdk/m/b/d;->getDrawingTime()J

    move-result-wide v4

    .line 171
    iget v1, p0, Lcom/mobvista/sdk/m/b/d;->c:I

    if-ltz v1, :cond_8

    iget v1, p0, Lcom/mobvista/sdk/m/b/d;->c:I

    invoke-virtual {p0}, Lcom/mobvista/sdk/m/b/d;->getChildCount()I

    move-result v3

    if-ge v1, v3, :cond_8

    iget v1, p0, Lcom/mobvista/sdk/m/b/d;->b:I

    iget v3, p0, Lcom/mobvista/sdk/m/b/d;->c:I

    sub-int/2addr v1, v3

    invoke-static {v1}, Ljava/lang/Math;->abs(I)I

    move-result v1

    if-eq v1, v2, :cond_3

    iget v1, p0, Lcom/mobvista/sdk/m/b/d;->l:I

    if-eqz v1, :cond_8

    .line 174
    :cond_3
    iget v0, p0, Lcom/mobvista/sdk/m/b/d;->b:I

    invoke-virtual {p0, v0}, Lcom/mobvista/sdk/m/b/d;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    iget v1, p0, Lcom/mobvista/sdk/m/b/d;->c:I

    invoke-virtual {p0, v1}, Lcom/mobvista/sdk/m/b/d;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    .line 175
    invoke-virtual {v1}, Landroid/view/View;->getDrawingCache()Landroid/graphics/Bitmap;

    move-result-object v2

    .line 176
    invoke-virtual {p0, p1, v0, v4, v5}, Lcom/mobvista/sdk/m/b/d;->drawChild(Landroid/graphics/Canvas;Landroid/view/View;J)Z

    .line 177
    iget v0, p0, Lcom/mobvista/sdk/m/b/d;->l:I

    if-nez v0, :cond_4

    .line 178
    invoke-virtual {p0, p1, v1, v4, v5}, Lcom/mobvista/sdk/m/b/d;->drawChild(Landroid/graphics/Canvas;Landroid/view/View;J)Z

    goto :goto_1

    .line 180
    :cond_4
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    .line 181
    iget v3, p0, Lcom/mobvista/sdk/m/b/d;->l:I

    if-gez v3, :cond_6

    .line 182
    if-eqz v2, :cond_5

    .line 183
    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    move-result v3

    neg-int v3, v3

    int-to-float v3, v3

    invoke-virtual {v1}, Landroid/view/View;->getTop()I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {p1, v2, v3, v1, v0}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    goto :goto_1

    .line 186
    :cond_5
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 187
    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    move-result v0

    neg-int v0, v0

    int-to-float v0, v0

    invoke-virtual {v1}, Landroid/view/View;->getTop()I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {p1, v0, v2}, Landroid/graphics/Canvas;->translate(FF)V

    .line 189
    invoke-virtual {p0, p1, v1, v4, v5}, Lcom/mobvista/sdk/m/b/d;->drawChild(Landroid/graphics/Canvas;Landroid/view/View;J)Z

    .line 190
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    goto :goto_1

    .line 194
    :cond_6
    if-eqz v2, :cond_7

    .line 195
    invoke-virtual {p0}, Lcom/mobvista/sdk/m/b/d;->getWidth()I

    move-result v3

    invoke-virtual {p0}, Lcom/mobvista/sdk/m/b/d;->getChildCount()I

    move-result v4

    mul-int/2addr v3, v4

    int-to-float v3, v3

    invoke-virtual {v1}, Landroid/view/View;->getTop()I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {p1, v2, v3, v1, v0}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    goto/16 :goto_1

    .line 198
    :cond_7
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 199
    invoke-virtual {p0}, Lcom/mobvista/sdk/m/b/d;->getWidth()I

    move-result v0

    invoke-virtual {p0}, Lcom/mobvista/sdk/m/b/d;->getChildCount()I

    move-result v2

    mul-int/2addr v0, v2

    int-to-float v0, v0

    invoke-virtual {v1}, Landroid/view/View;->getTop()I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {p1, v0, v2}, Landroid/graphics/Canvas;->translate(FF)V

    .line 201
    invoke-virtual {p0, p1, v1, v4, v5}, Lcom/mobvista/sdk/m/b/d;->drawChild(Landroid/graphics/Canvas;Landroid/view/View;J)Z

    .line 202
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    goto/16 :goto_1

    .line 210
    :cond_8
    :try_start_0
    invoke-virtual {p0}, Lcom/mobvista/sdk/m/b/d;->getChildCount()I

    move-result v1

    .line 211
    :goto_2
    if-ge v0, v1, :cond_9

    .line 212
    invoke-virtual {p0, v0}, Lcom/mobvista/sdk/m/b/d;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {p0, p1, v2, v4, v5}, Lcom/mobvista/sdk/m/b/d;->drawChild(Landroid/graphics/Canvas;Landroid/view/View;J)Z

    .line 211
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    .line 214
    :cond_9
    iget v0, p0, Lcom/mobvista/sdk/m/b/d;->l:I

    if-eqz v0, :cond_0

    .line 216
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    .line 217
    iget v1, p0, Lcom/mobvista/sdk/m/b/d;->l:I

    if-gez v1, :cond_b

    .line 218
    invoke-virtual {p0}, Lcom/mobvista/sdk/m/b/d;->getChildCount()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {p0, v1}, Lcom/mobvista/sdk/m/b/d;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    .line 219
    invoke-virtual {v1}, Landroid/view/View;->getDrawingCache()Landroid/graphics/Bitmap;

    move-result-object v2

    .line 220
    if-eqz v2, :cond_a

    .line 221
    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    move-result v3

    neg-int v3, v3

    int-to-float v3, v3

    invoke-virtual {v1}, Landroid/view/View;->getTop()I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {p1, v2, v3, v1, v0}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    goto/16 :goto_1

    :catch_0
    move-exception v0

    goto/16 :goto_1

    .line 225
    :cond_a
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 226
    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    move-result v0

    neg-int v0, v0

    int-to-float v0, v0

    invoke-virtual {v1}, Landroid/view/View;->getTop()I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {p1, v0, v2}, Landroid/graphics/Canvas;->translate(FF)V

    .line 228
    invoke-virtual {p0, p1, v1, v4, v5}, Lcom/mobvista/sdk/m/b/d;->drawChild(Landroid/graphics/Canvas;Landroid/view/View;J)Z

    .line 229
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    goto/16 :goto_1

    .line 233
    :cond_b
    const/4 v1, 0x0

    invoke-virtual {p0, v1}, Lcom/mobvista/sdk/m/b/d;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    .line 234
    invoke-virtual {v1}, Landroid/view/View;->getDrawingCache()Landroid/graphics/Bitmap;

    move-result-object v2

    .line 235
    if-eqz v2, :cond_c

    .line 236
    invoke-virtual {p0}, Lcom/mobvista/sdk/m/b/d;->getWidth()I

    move-result v3

    invoke-virtual {p0}, Lcom/mobvista/sdk/m/b/d;->getChildCount()I

    move-result v4

    mul-int/2addr v3, v4

    int-to-float v3, v3

    invoke-virtual {v1}, Landroid/view/View;->getTop()I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {p1, v2, v3, v1, v0}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    goto/16 :goto_1

    .line 240
    :cond_c
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 241
    invoke-virtual {p0}, Lcom/mobvista/sdk/m/b/d;->getWidth()I

    move-result v0

    invoke-virtual {p0}, Lcom/mobvista/sdk/m/b/d;->getChildCount()I

    move-result v2

    mul-int/2addr v0, v2

    int-to-float v0, v0

    invoke-virtual {v1}, Landroid/view/View;->getTop()I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {p1, v0, v2}, Landroid/graphics/Canvas;->translate(FF)V

    .line 243
    invoke-virtual {p0, p1, v1, v4, v5}, Lcom/mobvista/sdk/m/b/d;->drawChild(Landroid/graphics/Canvas;Landroid/view/View;J)Z

    .line 244
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_1
.end method

.method public final dispatchUnhandledMove(Landroid/view/View;I)Z
    .locals 3

    .prologue
    const/4 v0, 0x1

    .line 322
    const/16 v1, 0x11

    if-ne p2, v1, :cond_0

    .line 323
    invoke-direct {p0}, Lcom/mobvista/sdk/m/b/d;->b()I

    move-result v1

    if-lez v1, :cond_1

    .line 324
    invoke-direct {p0}, Lcom/mobvista/sdk/m/b/d;->b()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-direct {p0, v1}, Lcom/mobvista/sdk/m/b/d;->b(I)V

    .line 333
    :goto_0
    return v0

    .line 327
    :cond_0
    const/16 v1, 0x42

    if-ne p2, v1, :cond_1

    .line 328
    invoke-direct {p0}, Lcom/mobvista/sdk/m/b/d;->b()I

    move-result v1

    invoke-virtual {p0}, Lcom/mobvista/sdk/m/b/d;->getChildCount()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    if-ge v1, v2, :cond_1

    .line 329
    invoke-direct {p0}, Lcom/mobvista/sdk/m/b/d;->b()I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    invoke-direct {p0, v1}, Lcom/mobvista/sdk/m/b/d;->b(I)V

    goto :goto_0

    .line 333
    :cond_1
    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->dispatchUnhandledMove(Landroid/view/View;I)Z

    move-result v0

    goto :goto_0
.end method

.method public final onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 6

    .prologue
    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 352
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    .line 353
    const/4 v3, 0x2

    if-ne v0, v3, :cond_1

    iget v3, p0, Lcom/mobvista/sdk/m/b/d;->e:I

    if-eqz v3, :cond_1

    .line 422
    :cond_0
    :goto_0
    return v2

    .line 357
    :cond_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v3

    .line 358
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v4

    .line 359
    packed-switch v0, :pswitch_data_0

    .line 422
    :cond_2
    :goto_1
    iget v0, p0, Lcom/mobvista/sdk/m/b/d;->e:I

    if-nez v0, :cond_0

    move v2, v1

    goto :goto_0

    .line 362
    :pswitch_0
    iget v0, p0, Lcom/mobvista/sdk/m/b/d;->g:F

    sub-float v0, v3, v0

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    float-to-int v0, v0

    .line 363
    iget v3, p0, Lcom/mobvista/sdk/m/b/d;->h:F

    sub-float v3, v4, v3

    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    move-result v3

    float-to-int v4, v3

    .line 364
    iget v5, p0, Lcom/mobvista/sdk/m/b/d;->i:I

    .line 365
    if-le v0, v5, :cond_5

    move v3, v2

    .line 366
    :goto_2
    if-le v4, v5, :cond_6

    move v0, v2

    .line 374
    :goto_3
    if-nez v3, :cond_3

    if-eqz v0, :cond_2

    .line 375
    :cond_3
    if-eqz v3, :cond_4

    .line 377
    iput v2, p0, Lcom/mobvista/sdk/m/b/d;->e:I

    .line 378
    invoke-direct {p0}, Lcom/mobvista/sdk/m/b/d;->c()V

    .line 381
    :cond_4
    iget-boolean v0, p0, Lcom/mobvista/sdk/m/b/d;->j:Z

    if-eqz v0, :cond_2

    .line 382
    iput-boolean v1, p0, Lcom/mobvista/sdk/m/b/d;->j:Z

    .line 388
    iget v0, p0, Lcom/mobvista/sdk/m/b/d;->b:I

    invoke-virtual {p0, v0}, Lcom/mobvista/sdk/m/b/d;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 389
    invoke-virtual {v0}, Landroid/view/View;->cancelLongPress()V

    goto :goto_1

    :cond_5
    move v3, v1

    .line 365
    goto :goto_2

    :cond_6
    move v0, v1

    .line 366
    goto :goto_3

    .line 398
    :pswitch_1
    iput v3, p0, Lcom/mobvista/sdk/m/b/d;->g:F

    .line 399
    iput v4, p0, Lcom/mobvista/sdk/m/b/d;->h:F

    .line 400
    iput-boolean v2, p0, Lcom/mobvista/sdk/m/b/d;->j:Z

    .line 406
    iget-object v0, p0, Lcom/mobvista/sdk/m/b/d;->d:Landroid/widget/Scroller;

    invoke-virtual {v0}, Landroid/widget/Scroller;->isFinished()Z

    move-result v0

    if-eqz v0, :cond_7

    move v0, v1

    :goto_4
    iput v0, p0, Lcom/mobvista/sdk/m/b/d;->e:I

    goto :goto_1

    :cond_7
    move v0, v2

    goto :goto_4

    .line 413
    :pswitch_2
    iput v1, p0, Lcom/mobvista/sdk/m/b/d;->e:I

    .line 414
    iput-boolean v1, p0, Lcom/mobvista/sdk/m/b/d;->j:Z

    goto :goto_1

    .line 359
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_2
        :pswitch_0
        :pswitch_2
    .end packed-switch
.end method

.method protected final onLayout(ZIIII)V
    .locals 8

    .prologue
    const/4 v2, 0x0

    .line 78
    .line 79
    invoke-virtual {p0}, Lcom/mobvista/sdk/m/b/d;->getChildCount()I

    move-result v3

    move v1, v2

    move v0, v2

    .line 80
    :goto_0
    if-ge v1, v3, :cond_1

    .line 81
    invoke-virtual {p0, v1}, Lcom/mobvista/sdk/m/b/d;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    .line 82
    invoke-virtual {v4}, Landroid/view/View;->getVisibility()I

    move-result v5

    const/16 v6, 0x8

    if-eq v5, v6, :cond_0

    .line 83
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredWidth()I

    move-result v5

    .line 84
    add-int v6, v0, v5

    invoke-virtual {v4}, Landroid/view/View;->getMeasuredHeight()I

    move-result v7

    invoke-virtual {v4, v0, v2, v6, v7}, Landroid/view/View;->layout(IIII)V

    .line 86
    add-int/2addr v0, v5

    .line 80
    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 89
    :cond_1
    return-void
.end method

.method protected final onMeasure(II)V
    .locals 5

    .prologue
    const/4 v1, 0x0

    .line 264
    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->onMeasure(II)V

    .line 265
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v2

    .line 266
    invoke-virtual {p0}, Lcom/mobvista/sdk/m/b/d;->getChildCount()I

    move-result v3

    move v0, v1

    .line 267
    :goto_0
    if-ge v0, v3, :cond_0

    .line 268
    invoke-virtual {p0, v0}, Lcom/mobvista/sdk/m/b/d;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    invoke-virtual {v4, p1, p2}, Landroid/view/View;->measure(II)V

    .line 267
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 270
    :cond_0
    iget-boolean v0, p0, Lcom/mobvista/sdk/m/b/d;->f:Z

    if-eqz v0, :cond_1

    .line 271
    iget v0, p0, Lcom/mobvista/sdk/m/b/d;->b:I

    mul-int/2addr v0, v2

    invoke-virtual {p0, v0, v1}, Lcom/mobvista/sdk/m/b/d;->scrollTo(II)V

    .line 272
    iput-boolean v1, p0, Lcom/mobvista/sdk/m/b/d;->f:Z

    .line 274
    :cond_1
    return-void
.end method

.method protected final onRequestFocusInDescendants(ILandroid/graphics/Rect;)Z
    .locals 2

    .prologue
    .line 305
    iget v0, p0, Lcom/mobvista/sdk/m/b/d;->c:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 306
    iget v0, p0, Lcom/mobvista/sdk/m/b/d;->c:I

    .line 310
    :goto_0
    invoke-virtual {p0, v0}, Lcom/mobvista/sdk/m/b/d;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Landroid/view/View;->requestFocus(ILandroid/graphics/Rect;)Z

    .line 312
    const/4 v0, 0x0

    return v0

    .line 308
    :cond_0
    iget v0, p0, Lcom/mobvista/sdk/m/b/d;->b:I

    goto :goto_0
.end method

.method public final onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 8

    .prologue
    const/16 v2, 0x3e8

    const/16 v7, 0xc8

    const/16 v6, -0xc8

    const/4 v5, 0x1

    const/4 v4, 0x0

    .line 459
    iget-object v0, p0, Lcom/mobvista/sdk/m/b/d;->k:Landroid/view/VelocityTracker;

    if-nez v0, :cond_0

    .line 460
    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    move-result-object v0

    iput-object v0, p0, Lcom/mobvista/sdk/m/b/d;->k:Landroid/view/VelocityTracker;

    .line 462
    :cond_0
    iget-object v0, p0, Lcom/mobvista/sdk/m/b/d;->k:Landroid/view/VelocityTracker;

    invoke-virtual {v0, p1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    .line 467
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    .line 468
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    .line 469
    packed-switch v0, :pswitch_data_0

    .line 570
    :cond_1
    :goto_0
    return v5

    .line 476
    :pswitch_0
    iget-object v0, p0, Lcom/mobvista/sdk/m/b/d;->d:Landroid/widget/Scroller;

    invoke-virtual {v0}, Landroid/widget/Scroller;->isFinished()Z

    move-result v0

    if-nez v0, :cond_2

    .line 477
    iget-object v0, p0, Lcom/mobvista/sdk/m/b/d;->d:Landroid/widget/Scroller;

    invoke-virtual {v0}, Landroid/widget/Scroller;->abortAnimation()V

    .line 481
    :cond_2
    iput v1, p0, Lcom/mobvista/sdk/m/b/d;->g:F

    goto :goto_0

    .line 485
    :pswitch_1
    iput v5, p0, Lcom/mobvista/sdk/m/b/d;->e:I

    .line 489
    iget v0, p0, Lcom/mobvista/sdk/m/b/d;->g:F

    sub-float/2addr v0, v1

    float-to-int v0, v0

    .line 490
    iput v1, p0, Lcom/mobvista/sdk/m/b/d;->g:F

    .line 491
    if-gez v0, :cond_4

    .line 496
    invoke-virtual {p0}, Lcom/mobvista/sdk/m/b/d;->getScrollX()I

    move-result v1

    add-int/2addr v1, v0

    if-gtz v1, :cond_3

    .line 497
    const/4 v0, -0x1

    iput v0, p0, Lcom/mobvista/sdk/m/b/d;->l:I

    .line 498
    invoke-virtual {p0, v4, v4}, Lcom/mobvista/sdk/m/b/d;->scrollBy(II)V

    goto :goto_0

    .line 500
    :cond_3
    invoke-virtual {p0, v0, v4}, Lcom/mobvista/sdk/m/b/d;->scrollBy(II)V

    goto :goto_0

    .line 502
    :cond_4
    if-lez v0, :cond_1

    .line 503
    invoke-virtual {p0}, Lcom/mobvista/sdk/m/b/d;->getChildCount()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {p0, v1}, Lcom/mobvista/sdk/m/b/d;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getRight()I

    move-result v1

    invoke-virtual {p0}, Lcom/mobvista/sdk/m/b/d;->getScrollX()I

    move-result v2

    sub-int/2addr v1, v2

    invoke-virtual {p0}, Lcom/mobvista/sdk/m/b/d;->getWidth()I

    move-result v2

    sub-int/2addr v1, v2

    .line 509
    if-gtz v1, :cond_5

    .line 510
    iput v5, p0, Lcom/mobvista/sdk/m/b/d;->l:I

    .line 513
    :cond_5
    if-lez v1, :cond_1

    .line 514
    invoke-static {v1, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    invoke-virtual {p0, v0, v4}, Lcom/mobvista/sdk/m/b/d;->scrollBy(II)V

    goto :goto_0

    .line 520
    :pswitch_2
    iget-object v0, p0, Lcom/mobvista/sdk/m/b/d;->k:Landroid/view/VelocityTracker;

    .line 521
    iget-object v1, p0, Lcom/mobvista/sdk/m/b/d;->k:Landroid/view/VelocityTracker;

    invoke-virtual {v1, v2}, Landroid/view/VelocityTracker;->computeCurrentVelocity(I)V

    .line 522
    invoke-virtual {v0}, Landroid/view/VelocityTracker;->getXVelocity()F

    move-result v1

    float-to-int v1, v1

    .line 523
    invoke-virtual {v0}, Landroid/view/VelocityTracker;->getYVelocity()F

    move-result v0

    float-to-int v0, v0

    .line 525
    invoke-static {v1}, Ljava/lang/Math;->abs(I)I

    move-result v2

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v3

    if-le v2, v3, :cond_6

    if-le v1, v7, :cond_6

    .line 528
    iget v0, p0, Lcom/mobvista/sdk/m/b/d;->b:I

    add-int/lit8 v0, v0, -0x1

    invoke-direct {p0, v0}, Lcom/mobvista/sdk/m/b/d;->b(I)V

    .line 542
    :goto_1
    iput v4, p0, Lcom/mobvista/sdk/m/b/d;->e:I

    goto :goto_0

    .line 529
    :cond_6
    invoke-static {v1}, Ljava/lang/Math;->abs(I)I

    move-result v2

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v0

    if-le v2, v0, :cond_7

    if-ge v1, v6, :cond_7

    .line 532
    iget v0, p0, Lcom/mobvista/sdk/m/b/d;->b:I

    add-int/lit8 v0, v0, 0x1

    invoke-direct {p0, v0}, Lcom/mobvista/sdk/m/b/d;->b(I)V

    goto :goto_1

    .line 534
    :cond_7
    invoke-direct {p0}, Lcom/mobvista/sdk/m/b/d;->e()V

    goto :goto_1

    .line 547
    :pswitch_3
    iget-object v0, p0, Lcom/mobvista/sdk/m/b/d;->k:Landroid/view/VelocityTracker;

    .line 548
    iget-object v1, p0, Lcom/mobvista/sdk/m/b/d;->k:Landroid/view/VelocityTracker;

    invoke-virtual {v1, v2}, Landroid/view/VelocityTracker;->computeCurrentVelocity(I)V

    .line 549
    invoke-virtual {v0}, Landroid/view/VelocityTracker;->getXVelocity()F

    move-result v1

    float-to-int v1, v1

    .line 550
    invoke-virtual {v0}, Landroid/view/VelocityTracker;->getYVelocity()F

    move-result v0

    float-to-int v0, v0

    .line 551
    invoke-static {v1}, Ljava/lang/Math;->abs(I)I

    move-result v2

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v3

    if-le v2, v3, :cond_8

    if-le v1, v7, :cond_8

    .line 554
    iget v0, p0, Lcom/mobvista/sdk/m/b/d;->b:I

    add-int/lit8 v0, v0, -0x1

    invoke-direct {p0, v0}, Lcom/mobvista/sdk/m/b/d;->b(I)V

    .line 567
    :goto_2
    iput v4, p0, Lcom/mobvista/sdk/m/b/d;->e:I

    goto/16 :goto_0

    .line 555
    :cond_8
    invoke-static {v1}, Ljava/lang/Math;->abs(I)I

    move-result v2

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v0

    if-le v2, v0, :cond_9

    if-ge v1, v6, :cond_9

    .line 558
    iget v0, p0, Lcom/mobvista/sdk/m/b/d;->b:I

    add-int/lit8 v0, v0, 0x1

    invoke-direct {p0, v0}, Lcom/mobvista/sdk/m/b/d;->b(I)V

    goto :goto_2

    .line 560
    :cond_9
    invoke-direct {p0}, Lcom/mobvista/sdk/m/b/d;->e()V

    goto :goto_2

    .line 469
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_2
        :pswitch_1
        :pswitch_3
    .end packed-switch
.end method
