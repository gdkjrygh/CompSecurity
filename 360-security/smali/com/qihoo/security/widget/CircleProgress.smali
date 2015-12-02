.class public Lcom/qihoo/security/widget/CircleProgress;
.super Landroid/view/View;
.source "360Security"


# instance fields
.field private a:Landroid/graphics/Paint;

.field private b:I

.field private c:I

.field private d:I

.field private e:I

.field private f:F

.field private g:Landroid/graphics/RectF;

.field private h:Landroid/widget/Scroller;

.field private i:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 56
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/qihoo/security/widget/CircleProgress;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 57
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 60
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/qihoo/security/widget/CircleProgress;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 61
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 3

    .prologue
    .line 64
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 51
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/qihoo/security/widget/CircleProgress;->h:Landroid/widget/Scroller;

    .line 65
    new-instance v0, Landroid/widget/Scroller;

    invoke-virtual {p0}, Lcom/qihoo/security/widget/CircleProgress;->getContext()Landroid/content/Context;

    move-result-object v1

    new-instance v2, Landroid/view/animation/LinearInterpolator;

    invoke-direct {v2}, Landroid/view/animation/LinearInterpolator;-><init>()V

    invoke-direct {v0, v1, v2}, Landroid/widget/Scroller;-><init>(Landroid/content/Context;Landroid/view/animation/Interpolator;)V

    iput-object v0, p0, Lcom/qihoo/security/widget/CircleProgress;->h:Landroid/widget/Scroller;

    .line 66
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/widget/CircleProgress;->a:Landroid/graphics/Paint;

    .line 68
    sget-object v0, Lcom/qihoo/security/lite/a$a;->CircleProgressBar:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v0

    .line 71
    const/4 v1, 0x0

    const/high16 v2, -0x10000

    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v1

    iput v1, p0, Lcom/qihoo/security/widget/CircleProgress;->b:I

    .line 72
    const/4 v1, 0x1

    const v2, -0xff0100

    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v1

    iput v1, p0, Lcom/qihoo/security/widget/CircleProgress;->c:I

    .line 73
    const/4 v1, 0x2

    const/4 v2, 0x5

    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v1

    iput v1, p0, Lcom/qihoo/security/widget/CircleProgress;->d:I

    .line 74
    const/4 v1, 0x3

    const/16 v2, 0x64

    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result v1

    iput v1, p0, Lcom/qihoo/security/widget/CircleProgress;->e:I

    .line 76
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 77
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/widget/CircleProgress;->g:Landroid/graphics/RectF;

    .line 78
    return-void
.end method


# virtual methods
.method public computeScroll()V
    .locals 2

    .prologue
    .line 187
    iget-object v0, p0, Lcom/qihoo/security/widget/CircleProgress;->h:Landroid/widget/Scroller;

    invoke-virtual {v0}, Landroid/widget/Scroller;->computeScrollOffset()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 188
    iget-object v0, p0, Lcom/qihoo/security/widget/CircleProgress;->h:Landroid/widget/Scroller;

    invoke-virtual {v0}, Landroid/widget/Scroller;->getCurrX()I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x42c80000    # 100.0f

    div-float/2addr v0, v1

    invoke-virtual {p0, v0}, Lcom/qihoo/security/widget/CircleProgress;->setProgress(F)V

    .line 189
    invoke-virtual {p0}, Lcom/qihoo/security/widget/CircleProgress;->postInvalidate()V

    .line 196
    :cond_0
    :goto_0
    return-void

    .line 191
    :cond_1
    iget-boolean v0, p0, Lcom/qihoo/security/widget/CircleProgress;->i:Z

    if-eqz v0, :cond_0

    .line 192
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/qihoo/security/widget/CircleProgress;->i:Z

    .line 193
    invoke-virtual {p0}, Lcom/qihoo/security/widget/CircleProgress;->postInvalidate()V

    goto :goto_0
.end method

.method public getCricleColor()I
    .locals 1

    .prologue
    .line 199
    iget v0, p0, Lcom/qihoo/security/widget/CircleProgress;->b:I

    return v0
.end method

.method public getCricleProgressColor()I
    .locals 1

    .prologue
    .line 207
    iget v0, p0, Lcom/qihoo/security/widget/CircleProgress;->c:I

    return v0
.end method

.method public declared-synchronized getMax()I
    .locals 1

    .prologue
    .line 110
    monitor-enter p0

    :try_start_0
    iget v0, p0, Lcom/qihoo/security/widget/CircleProgress;->e:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized getProgress()F
    .locals 1

    .prologue
    .line 131
    monitor-enter p0

    :try_start_0
    iget v0, p0, Lcom/qihoo/security/widget/CircleProgress;->f:F
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public getRoundWidth()F
    .locals 1

    .prologue
    .line 216
    iget v0, p0, Lcom/qihoo/security/widget/CircleProgress;->d:I

    int-to-float v0, v0

    return v0
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 6

    .prologue
    .line 82
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 87
    invoke-virtual {p0}, Lcom/qihoo/security/widget/CircleProgress;->getWidth()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    .line 88
    iget v1, p0, Lcom/qihoo/security/widget/CircleProgress;->d:I

    div-int/lit8 v1, v1, 0x2

    sub-int v1, v0, v1

    .line 89
    iget-object v2, p0, Lcom/qihoo/security/widget/CircleProgress;->a:Landroid/graphics/Paint;

    iget v3, p0, Lcom/qihoo/security/widget/CircleProgress;->b:I

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 90
    iget-object v2, p0, Lcom/qihoo/security/widget/CircleProgress;->a:Landroid/graphics/Paint;

    sget-object v3, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 91
    iget-object v2, p0, Lcom/qihoo/security/widget/CircleProgress;->a:Landroid/graphics/Paint;

    iget v3, p0, Lcom/qihoo/security/widget/CircleProgress;->d:I

    int-to-float v3, v3

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 92
    iget-object v2, p0, Lcom/qihoo/security/widget/CircleProgress;->a:Landroid/graphics/Paint;

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 93
    int-to-float v2, v0

    int-to-float v3, v0

    int-to-float v4, v1

    iget-object v5, p0, Lcom/qihoo/security/widget/CircleProgress;->a:Landroid/graphics/Paint;

    invoke-virtual {p1, v2, v3, v4, v5}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 100
    iget-object v2, p0, Lcom/qihoo/security/widget/CircleProgress;->a:Landroid/graphics/Paint;

    iget v3, p0, Lcom/qihoo/security/widget/CircleProgress;->d:I

    int-to-float v3, v3

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 101
    iget-object v2, p0, Lcom/qihoo/security/widget/CircleProgress;->a:Landroid/graphics/Paint;

    iget v3, p0, Lcom/qihoo/security/widget/CircleProgress;->c:I

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 102
    iget-object v2, p0, Lcom/qihoo/security/widget/CircleProgress;->g:Landroid/graphics/RectF;

    sub-int v3, v0, v1

    int-to-float v3, v3

    sub-int v4, v0, v1

    int-to-float v4, v4

    add-int v5, v0, v1

    int-to-float v5, v5

    add-int/2addr v0, v1

    int-to-float v0, v0

    invoke-virtual {v2, v3, v4, v5, v0}, Landroid/graphics/RectF;->set(FFFF)V

    .line 104
    iget-object v0, p0, Lcom/qihoo/security/widget/CircleProgress;->a:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 105
    iget-object v1, p0, Lcom/qihoo/security/widget/CircleProgress;->g:Landroid/graphics/RectF;

    const/high16 v2, -0x3d4c0000    # -90.0f

    const/high16 v0, 0x43b40000    # 360.0f

    iget v3, p0, Lcom/qihoo/security/widget/CircleProgress;->f:F

    mul-float/2addr v0, v3

    iget v3, p0, Lcom/qihoo/security/widget/CircleProgress;->e:I

    int-to-float v3, v3

    div-float v3, v0, v3

    const/4 v4, 0x0

    iget-object v5, p0, Lcom/qihoo/security/widget/CircleProgress;->a:Landroid/graphics/Paint;

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    .line 107
    return-void
.end method

.method public setCricleColor(I)V
    .locals 0

    .prologue
    .line 203
    iput p1, p0, Lcom/qihoo/security/widget/CircleProgress;->b:I

    .line 204
    return-void
.end method

.method public setCricleProgressColor(I)V
    .locals 0

    .prologue
    .line 211
    iput p1, p0, Lcom/qihoo/security/widget/CircleProgress;->c:I

    .line 212
    invoke-virtual {p0}, Lcom/qihoo/security/widget/CircleProgress;->postInvalidate()V

    .line 213
    return-void
.end method

.method public declared-synchronized setMax(I)V
    .locals 2

    .prologue
    .line 119
    monitor-enter p0

    if-gez p1, :cond_0

    .line 120
    :try_start_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string/jumbo v1, "max not less than 0"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 119
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 122
    :cond_0
    :try_start_1
    iput p1, p0, Lcom/qihoo/security/widget/CircleProgress;->e:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 123
    monitor-exit p0

    return-void
.end method

.method public declared-synchronized setProgress(F)V
    .locals 2

    .prologue
    .line 141
    monitor-enter p0

    const/4 v0, 0x0

    cmpg-float v0, p1, v0

    if-gez v0, :cond_0

    .line 142
    :try_start_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string/jumbo v1, "progress not less than 0"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 141
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 144
    :cond_0
    :try_start_1
    iget v0, p0, Lcom/qihoo/security/widget/CircleProgress;->e:I

    int-to-float v0, v0

    cmpl-float v0, p1, v0

    if-lez v0, :cond_1

    .line 145
    iget v0, p0, Lcom/qihoo/security/widget/CircleProgress;->e:I

    int-to-float p1, v0

    .line 147
    :cond_1
    iget v0, p0, Lcom/qihoo/security/widget/CircleProgress;->e:I

    int-to-float v0, v0

    cmpg-float v0, p1, v0

    if-gtz v0, :cond_2

    .line 148
    iput p1, p0, Lcom/qihoo/security/widget/CircleProgress;->f:F

    .line 149
    invoke-virtual {p0}, Lcom/qihoo/security/widget/CircleProgress;->postInvalidate()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 152
    :cond_2
    monitor-exit p0

    return-void
.end method

.method public declared-synchronized setRealProgress(F)V
    .locals 2

    .prologue
    .line 156
    monitor-enter p0

    const/4 v0, 0x0

    cmpg-float v0, p1, v0

    if-gez v0, :cond_0

    .line 157
    :try_start_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string/jumbo v1, "progress not less than 0"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 156
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 160
    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/qihoo/security/widget/CircleProgress;->h:Landroid/widget/Scroller;

    invoke-virtual {v0}, Landroid/widget/Scroller;->isFinished()Z

    move-result v0

    if-nez v0, :cond_1

    .line 161
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/qihoo/security/widget/CircleProgress;->i:Z

    .line 162
    iget-object v0, p0, Lcom/qihoo/security/widget/CircleProgress;->h:Landroid/widget/Scroller;

    invoke-virtual {v0}, Landroid/widget/Scroller;->abortAnimation()V

    .line 164
    :cond_1
    iget v0, p0, Lcom/qihoo/security/widget/CircleProgress;->e:I

    int-to-float v0, v0

    cmpl-float v0, p1, v0

    if-lez v0, :cond_2

    .line 165
    iget v0, p0, Lcom/qihoo/security/widget/CircleProgress;->e:I

    int-to-float p1, v0

    .line 167
    :cond_2
    iget v0, p0, Lcom/qihoo/security/widget/CircleProgress;->e:I

    int-to-float v0, v0

    cmpg-float v0, p1, v0

    if-gtz v0, :cond_3

    .line 168
    iput p1, p0, Lcom/qihoo/security/widget/CircleProgress;->f:F

    .line 169
    invoke-virtual {p0}, Lcom/qihoo/security/widget/CircleProgress;->postInvalidate()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 172
    :cond_3
    monitor-exit p0

    return-void
.end method

.method public setRoundWidth(I)V
    .locals 0

    .prologue
    .line 220
    iput p1, p0, Lcom/qihoo/security/widget/CircleProgress;->d:I

    .line 221
    return-void
.end method
