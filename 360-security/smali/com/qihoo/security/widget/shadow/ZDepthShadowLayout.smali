.class public Lcom/qihoo/security/widget/shadow/ZDepthShadowLayout;
.super Landroid/widget/FrameLayout;
.source "360Security"


# instance fields
.field protected a:Lcom/qihoo/security/widget/shadow/d;

.field protected b:I

.field protected c:I

.field protected d:I

.field protected e:I

.field protected f:I

.field protected g:I

.field protected h:J

.field protected i:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 37
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/qihoo/security/widget/shadow/ZDepthShadowLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 38
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 41
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/qihoo/security/widget/shadow/ZDepthShadowLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 42
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .prologue
    .line 45
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 46
    invoke-virtual {p0, p2, p3}, Lcom/qihoo/security/widget/shadow/ZDepthShadowLayout;->a(Landroid/util/AttributeSet;I)V

    .line 47
    return-void
.end method


# virtual methods
.method protected a(Landroid/util/AttributeSet;I)V
    .locals 8

    .prologue
    const/4 v4, 0x1

    const/4 v3, 0x0

    const/4 v1, 0x5

    const/4 v7, -0x1

    .line 50
    invoke-virtual {p0, v3}, Lcom/qihoo/security/widget/shadow/ZDepthShadowLayout;->setClipToPadding(Z)V

    .line 52
    invoke-virtual {p0}, Lcom/qihoo/security/widget/shadow/ZDepthShadowLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    sget-object v2, Lcom/qihoo/security/lite/a$a;->ZDepthShadowLayout:[I

    invoke-virtual {v0, p1, v2, p2, v3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v5

    .line 54
    invoke-virtual {v5, v4, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    iput v0, p0, Lcom/qihoo/security/widget/shadow/ZDepthShadowLayout;->b:I

    .line 55
    invoke-virtual {v5, v3, v4}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    iput v0, p0, Lcom/qihoo/security/widget/shadow/ZDepthShadowLayout;->c:I

    .line 56
    const/4 v0, 0x7

    const/16 v2, 0x96

    invoke-virtual {v5, v0, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    int-to-long v2, v0

    iput-wide v2, p0, Lcom/qihoo/security/widget/shadow/ZDepthShadowLayout;->h:J

    .line 58
    const/16 v0, 0x8

    invoke-virtual {v5, v0, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    iput-boolean v0, p0, Lcom/qihoo/security/widget/shadow/ZDepthShadowLayout;->i:Z

    .line 61
    const/4 v0, 0x2

    invoke-virtual {v5, v0, v7}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v6

    .line 62
    const/4 v0, 0x3

    invoke-virtual {v5, v0, v7}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    .line 63
    const/4 v2, 0x4

    invoke-virtual {v5, v2, v7}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v2

    .line 64
    invoke-virtual {v5, v1, v7}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v3

    .line 65
    const/4 v4, 0x6

    invoke-virtual {v5, v4, v7}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v4

    .line 67
    if-le v6, v7, :cond_0

    .line 68
    iput v6, p0, Lcom/qihoo/security/widget/shadow/ZDepthShadowLayout;->d:I

    .line 69
    iput v6, p0, Lcom/qihoo/security/widget/shadow/ZDepthShadowLayout;->e:I

    .line 70
    iput v6, p0, Lcom/qihoo/security/widget/shadow/ZDepthShadowLayout;->f:I

    .line 71
    iput v6, p0, Lcom/qihoo/security/widget/shadow/ZDepthShadowLayout;->g:I

    .line 81
    :goto_0
    invoke-virtual {v5}, Landroid/content/res/TypedArray;->recycle()V

    .line 82
    return-void

    .line 73
    :cond_0
    if-le v0, v7, :cond_2

    :goto_1
    iput v0, p0, Lcom/qihoo/security/widget/shadow/ZDepthShadowLayout;->d:I

    .line 74
    if-le v2, v7, :cond_3

    move v0, v2

    :goto_2
    iput v0, p0, Lcom/qihoo/security/widget/shadow/ZDepthShadowLayout;->e:I

    .line 75
    if-le v3, v7, :cond_4

    move v0, v3

    :goto_3
    iput v0, p0, Lcom/qihoo/security/widget/shadow/ZDepthShadowLayout;->f:I

    .line 77
    if-le v4, v7, :cond_1

    move v1, v4

    :cond_1
    iput v1, p0, Lcom/qihoo/security/widget/shadow/ZDepthShadowLayout;->g:I

    goto :goto_0

    :cond_2
    move v0, v1

    .line 73
    goto :goto_1

    :cond_3
    move v0, v1

    .line 74
    goto :goto_2

    :cond_4
    move v0, v1

    .line 75
    goto :goto_3
.end method

.method public a(Lcom/qihoo/security/widget/shadow/ZDepth;)V
    .locals 1

    .prologue
    .line 155
    iget-object v0, p0, Lcom/qihoo/security/widget/shadow/ZDepthShadowLayout;->a:Lcom/qihoo/security/widget/shadow/d;

    if-eqz v0, :cond_0

    .line 156
    iget-object v0, p0, Lcom/qihoo/security/widget/shadow/ZDepthShadowLayout;->a:Lcom/qihoo/security/widget/shadow/d;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/widget/shadow/d;->b(Lcom/qihoo/security/widget/shadow/ZDepth;)V

    .line 158
    :cond_0
    return-void
.end method

.method public f()V
    .locals 2

    .prologue
    .line 161
    iget-object v0, p0, Lcom/qihoo/security/widget/shadow/ZDepthShadowLayout;->a:Lcom/qihoo/security/widget/shadow/d;

    if-eqz v0, :cond_0

    .line 162
    iget-object v0, p0, Lcom/qihoo/security/widget/shadow/ZDepthShadowLayout;->a:Lcom/qihoo/security/widget/shadow/d;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/qihoo/security/widget/shadow/d;->setVisibility(I)V

    .line 164
    :cond_0
    return-void
.end method

.method public g()V
    .locals 2

    .prologue
    .line 167
    iget-object v0, p0, Lcom/qihoo/security/widget/shadow/ZDepthShadowLayout;->a:Lcom/qihoo/security/widget/shadow/d;

    if-eqz v0, :cond_0

    .line 168
    iget-object v0, p0, Lcom/qihoo/security/widget/shadow/ZDepthShadowLayout;->a:Lcom/qihoo/security/widget/shadow/d;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lcom/qihoo/security/widget/shadow/d;->setVisibility(I)V

    .line 170
    :cond_0
    return-void
.end method

.method public getHeightExceptShadow()I
    .locals 2

    .prologue
    .line 151
    invoke-virtual {p0}, Lcom/qihoo/security/widget/shadow/ZDepthShadowLayout;->getHeight()I

    move-result v0

    invoke-virtual {p0}, Lcom/qihoo/security/widget/shadow/ZDepthShadowLayout;->getPaddingTop()I

    move-result v1

    sub-int/2addr v0, v1

    invoke-virtual {p0}, Lcom/qihoo/security/widget/shadow/ZDepthShadowLayout;->getPaddingBottom()I

    move-result v1

    sub-int/2addr v0, v1

    return v0
.end method

.method public getWidthExceptShadow()I
    .locals 2

    .prologue
    .line 147
    invoke-virtual {p0}, Lcom/qihoo/security/widget/shadow/ZDepthShadowLayout;->getWidth()I

    move-result v0

    invoke-virtual {p0}, Lcom/qihoo/security/widget/shadow/ZDepthShadowLayout;->getPaddingLeft()I

    move-result v1

    sub-int/2addr v0, v1

    invoke-virtual {p0}, Lcom/qihoo/security/widget/shadow/ZDepthShadowLayout;->getPaddingRight()I

    move-result v1

    sub-int/2addr v0, v1

    return v0
.end method

.method protected onAttachedToWindow()V
    .locals 4

    .prologue
    .line 86
    invoke-super {p0}, Landroid/widget/FrameLayout;->onAttachedToWindow()V

    .line 88
    new-instance v0, Lcom/qihoo/security/widget/shadow/d;

    invoke-virtual {p0}, Lcom/qihoo/security/widget/shadow/ZDepthShadowLayout;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/qihoo/security/widget/shadow/d;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/qihoo/security/widget/shadow/ZDepthShadowLayout;->a:Lcom/qihoo/security/widget/shadow/d;

    .line 89
    iget-object v0, p0, Lcom/qihoo/security/widget/shadow/ZDepthShadowLayout;->a:Lcom/qihoo/security/widget/shadow/d;

    iget v1, p0, Lcom/qihoo/security/widget/shadow/ZDepthShadowLayout;->b:I

    invoke-virtual {v0, v1}, Lcom/qihoo/security/widget/shadow/d;->setShape(I)V

    .line 90
    iget-object v0, p0, Lcom/qihoo/security/widget/shadow/ZDepthShadowLayout;->a:Lcom/qihoo/security/widget/shadow/d;

    iget v1, p0, Lcom/qihoo/security/widget/shadow/ZDepthShadowLayout;->c:I

    invoke-virtual {v0, v1}, Lcom/qihoo/security/widget/shadow/d;->setZDepth(I)V

    .line 91
    iget-object v0, p0, Lcom/qihoo/security/widget/shadow/ZDepthShadowLayout;->a:Lcom/qihoo/security/widget/shadow/d;

    iget v1, p0, Lcom/qihoo/security/widget/shadow/ZDepthShadowLayout;->d:I

    invoke-virtual {v0, v1}, Lcom/qihoo/security/widget/shadow/d;->setZDepthPaddingLeft(I)V

    .line 92
    iget-object v0, p0, Lcom/qihoo/security/widget/shadow/ZDepthShadowLayout;->a:Lcom/qihoo/security/widget/shadow/d;

    iget v1, p0, Lcom/qihoo/security/widget/shadow/ZDepthShadowLayout;->e:I

    invoke-virtual {v0, v1}, Lcom/qihoo/security/widget/shadow/d;->setZDepthPaddingTop(I)V

    .line 93
    iget-object v0, p0, Lcom/qihoo/security/widget/shadow/ZDepthShadowLayout;->a:Lcom/qihoo/security/widget/shadow/d;

    iget v1, p0, Lcom/qihoo/security/widget/shadow/ZDepthShadowLayout;->f:I

    invoke-virtual {v0, v1}, Lcom/qihoo/security/widget/shadow/d;->setZDepthPaddingRight(I)V

    .line 94
    iget-object v0, p0, Lcom/qihoo/security/widget/shadow/ZDepthShadowLayout;->a:Lcom/qihoo/security/widget/shadow/d;

    iget v1, p0, Lcom/qihoo/security/widget/shadow/ZDepthShadowLayout;->g:I

    invoke-virtual {v0, v1}, Lcom/qihoo/security/widget/shadow/d;->setZDepthPaddingBottom(I)V

    .line 95
    iget-object v0, p0, Lcom/qihoo/security/widget/shadow/ZDepthShadowLayout;->a:Lcom/qihoo/security/widget/shadow/d;

    iget-wide v2, p0, Lcom/qihoo/security/widget/shadow/ZDepthShadowLayout;->h:J

    invoke-virtual {v0, v2, v3}, Lcom/qihoo/security/widget/shadow/d;->setZDepthAnimDuration(J)V

    .line 96
    iget-object v0, p0, Lcom/qihoo/security/widget/shadow/ZDepthShadowLayout;->a:Lcom/qihoo/security/widget/shadow/d;

    iget-boolean v1, p0, Lcom/qihoo/security/widget/shadow/ZDepthShadowLayout;->i:Z

    invoke-virtual {v0, v1}, Lcom/qihoo/security/widget/shadow/d;->setZDepthDoAnimation(Z)V

    .line 97
    iget-object v0, p0, Lcom/qihoo/security/widget/shadow/ZDepthShadowLayout;->a:Lcom/qihoo/security/widget/shadow/d;

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/qihoo/security/widget/shadow/ZDepthShadowLayout;->addView(Landroid/view/View;I)V

    .line 99
    iget-object v0, p0, Lcom/qihoo/security/widget/shadow/ZDepthShadowLayout;->a:Lcom/qihoo/security/widget/shadow/d;

    invoke-virtual {v0}, Lcom/qihoo/security/widget/shadow/d;->getZDepthPaddingLeft()I

    move-result v0

    .line 100
    iget-object v1, p0, Lcom/qihoo/security/widget/shadow/ZDepthShadowLayout;->a:Lcom/qihoo/security/widget/shadow/d;

    invoke-virtual {v1}, Lcom/qihoo/security/widget/shadow/d;->getZDepthPaddingTop()I

    move-result v1

    .line 101
    iget-object v2, p0, Lcom/qihoo/security/widget/shadow/ZDepthShadowLayout;->a:Lcom/qihoo/security/widget/shadow/d;

    invoke-virtual {v2}, Lcom/qihoo/security/widget/shadow/d;->getZDepthPaddingRight()I

    move-result v2

    .line 102
    iget-object v3, p0, Lcom/qihoo/security/widget/shadow/ZDepthShadowLayout;->a:Lcom/qihoo/security/widget/shadow/d;

    invoke-virtual {v3}, Lcom/qihoo/security/widget/shadow/d;->getZDepthPaddingBottom()I

    move-result v3

    .line 103
    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/qihoo/security/widget/shadow/ZDepthShadowLayout;->setPadding(IIII)V

    .line 104
    return-void
.end method

.method protected onLayout(ZIIII)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 139
    invoke-super/range {p0 .. p5}, Landroid/widget/FrameLayout;->onLayout(ZIIII)V

    .line 141
    sub-int v0, p4, p2

    .line 142
    sub-int v1, p5, p3

    .line 143
    iget-object v2, p0, Lcom/qihoo/security/widget/shadow/ZDepthShadowLayout;->a:Lcom/qihoo/security/widget/shadow/d;

    invoke-virtual {v2, v3, v3, v0, v1}, Lcom/qihoo/security/widget/shadow/d;->layout(IIII)V

    .line 144
    return-void
.end method

.method protected onMeasure(II)V
    .locals 7

    .prologue
    const/high16 v6, 0x40000000    # 2.0f

    const/4 v0, 0x0

    .line 108
    invoke-virtual {p0, p1, p2}, Lcom/qihoo/security/widget/shadow/ZDepthShadowLayout;->measureChildren(II)V

    .line 109
    invoke-super {p0, p1, p2}, Landroid/widget/FrameLayout;->onMeasure(II)V

    .line 111
    invoke-virtual {p0}, Lcom/qihoo/security/widget/shadow/ZDepthShadowLayout;->getChildCount()I

    move-result v3

    move v2, v0

    move v1, v0

    .line 116
    :goto_0
    if-ge v2, v3, :cond_2

    .line 117
    invoke-virtual {p0, v2}, Lcom/qihoo/security/widget/shadow/ZDepthShadowLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    .line 118
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredWidth()I

    move-result v5

    if-ge v0, v5, :cond_0

    .line 119
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    .line 121
    :cond_0
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredHeight()I

    move-result v5

    if-ge v1, v5, :cond_1

    .line 122
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredHeight()I

    move-result v1

    .line 116
    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 127
    :cond_2
    iget-object v2, p0, Lcom/qihoo/security/widget/shadow/ZDepthShadowLayout;->a:Lcom/qihoo/security/widget/shadow/d;

    invoke-virtual {v2}, Lcom/qihoo/security/widget/shadow/d;->getZDepthPaddingLeft()I

    move-result v2

    .line 128
    iget-object v3, p0, Lcom/qihoo/security/widget/shadow/ZDepthShadowLayout;->a:Lcom/qihoo/security/widget/shadow/d;

    invoke-virtual {v3}, Lcom/qihoo/security/widget/shadow/d;->getZDepthPaddingTop()I

    move-result v3

    .line 129
    iget-object v4, p0, Lcom/qihoo/security/widget/shadow/ZDepthShadowLayout;->a:Lcom/qihoo/security/widget/shadow/d;

    invoke-virtual {v4}, Lcom/qihoo/security/widget/shadow/d;->getZDepthPaddingRight()I

    move-result v4

    .line 130
    iget-object v5, p0, Lcom/qihoo/security/widget/shadow/ZDepthShadowLayout;->a:Lcom/qihoo/security/widget/shadow/d;

    invoke-virtual {v5}, Lcom/qihoo/security/widget/shadow/d;->getZDepthPaddingBottom()I

    move-result v5

    .line 131
    add-int/2addr v2, v4

    add-int/2addr v0, v2

    .line 132
    add-int v2, v3, v5

    add-int/2addr v1, v2

    .line 133
    iget-object v2, p0, Lcom/qihoo/security/widget/shadow/ZDepthShadowLayout;->a:Lcom/qihoo/security/widget/shadow/d;

    invoke-static {v0, v6}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v0

    invoke-static {v1, v6}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v1

    invoke-virtual {v2, v0, v1}, Lcom/qihoo/security/widget/shadow/d;->measure(II)V

    .line 135
    return-void
.end method
