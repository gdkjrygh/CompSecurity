.class public Lcom/facebook/widget/OverlayLayout;
.super Lcom/facebook/widget/f;
.source "OverlayLayout.java"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .prologue
    .line 35
    invoke-direct {p0, p1}, Lcom/facebook/widget/f;-><init>(Landroid/content/Context;)V

    .line 36
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .prologue
    .line 39
    invoke-direct {p0, p1, p2}, Lcom/facebook/widget/f;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 40
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .prologue
    .line 43
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/widget/f;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 44
    return-void
.end method


# virtual methods
.method public a(Landroid/util/AttributeSet;)Lcom/facebook/widget/k;
    .locals 2

    .prologue
    .line 146
    new-instance v0, Lcom/facebook/widget/k;

    invoke-virtual {p0}, Lcom/facebook/widget/OverlayLayout;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Lcom/facebook/widget/k;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-object v0
.end method

.method protected a(Landroid/view/ViewGroup$LayoutParams;)Lcom/facebook/widget/k;
    .locals 1

    .prologue
    .line 156
    new-instance v0, Lcom/facebook/widget/k;

    invoke-direct {v0, p1}, Lcom/facebook/widget/k;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    return-object v0
.end method

.method protected checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z
    .locals 1

    .prologue
    .line 151
    instance-of v0, p1, Lcom/facebook/widget/k;

    return v0
.end method

.method protected dispatchDraw(Landroid/graphics/Canvas;)V
    .locals 2

    .prologue
    .line 68
    const-string v0, "Overlayout.dispatchDraw"

    invoke-static {v0}, Lcom/facebook/debug/d/e;->a(Ljava/lang/String;)Lcom/facebook/debug/d/e;

    move-result-object v0

    .line 70
    :try_start_0
    invoke-super {p0, p1}, Lcom/facebook/widget/f;->dispatchDraw(Landroid/graphics/Canvas;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 72
    invoke-virtual {v0}, Lcom/facebook/debug/d/e;->a()J

    .line 74
    return-void

    .line 72
    :catchall_0
    move-exception v1

    invoke-virtual {v0}, Lcom/facebook/debug/d/e;->a()J

    throw v1
.end method

.method protected g()Lcom/facebook/widget/k;
    .locals 2

    .prologue
    const/4 v1, -0x1

    .line 141
    new-instance v0, Lcom/facebook/widget/k;

    invoke-direct {v0, v1, v1}, Lcom/facebook/widget/k;-><init>(II)V

    return-object v0
.end method

.method protected synthetic generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    .locals 1

    .prologue
    .line 21
    invoke-virtual {p0}, Lcom/facebook/widget/OverlayLayout;->g()Lcom/facebook/widget/k;

    move-result-object v0

    return-object v0
.end method

.method public synthetic generateLayoutParams(Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams;
    .locals 1

    .prologue
    .line 21
    invoke-virtual {p0, p1}, Lcom/facebook/widget/OverlayLayout;->a(Landroid/util/AttributeSet;)Lcom/facebook/widget/k;

    move-result-object v0

    return-object v0
.end method

.method protected synthetic generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;
    .locals 1

    .prologue
    .line 21
    invoke-virtual {p0, p1}, Lcom/facebook/widget/OverlayLayout;->a(Landroid/view/ViewGroup$LayoutParams;)Lcom/facebook/widget/k;

    move-result-object v0

    return-object v0
.end method

.method protected layoutChild(IIIILandroid/view/View;)V
    .locals 8

    .prologue
    .line 79
    invoke-virtual {p5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Lcom/facebook/widget/k;

    .line 80
    iget-boolean v1, v0, Lcom/facebook/widget/k;->a:Z

    if-nez v1, :cond_1

    .line 81
    invoke-super/range {p0 .. p5}, Lcom/facebook/widget/f;->layoutChild(IIIILandroid/view/View;)V

    .line 137
    :cond_0
    :goto_0
    return-void

    .line 85
    :cond_1
    iget v1, v0, Lcom/facebook/widget/k;->b:I

    .line 86
    const/4 v2, -0x1

    if-eq v1, v2, :cond_0

    .line 89
    invoke-virtual {p0, v1}, Lcom/facebook/widget/OverlayLayout;->findViewById(I)Landroid/view/View;

    move-result-object v1

    .line 90
    if-eqz v1, :cond_0

    .line 94
    new-instance v2, Landroid/graphics/Rect;

    invoke-direct {v2}, Landroid/graphics/Rect;-><init>()V

    .line 95
    new-instance v3, Landroid/graphics/Rect;

    invoke-direct {v3}, Landroid/graphics/Rect;-><init>()V

    .line 96
    invoke-virtual {v1, v2}, Landroid/view/View;->getGlobalVisibleRect(Landroid/graphics/Rect;)Z

    .line 97
    invoke-virtual {p0, v3}, Lcom/facebook/widget/OverlayLayout;->getGlobalVisibleRect(Landroid/graphics/Rect;)Z

    .line 98
    iget v1, v3, Landroid/graphics/Rect;->left:I

    neg-int v1, v1

    iget v3, v3, Landroid/graphics/Rect;->top:I

    neg-int v3, v3

    invoke-virtual {v2, v1, v3}, Landroid/graphics/Rect;->offset(II)V

    .line 100
    iget v1, v0, Lcom/facebook/widget/k;->c:I

    .line 101
    invoke-virtual {p5}, Landroid/view/View;->getMeasuredWidth()I

    move-result v3

    .line 102
    invoke-virtual {p5}, Landroid/view/View;->getMeasuredHeight()I

    move-result v4

    .line 106
    and-int/lit8 v5, v1, 0x1

    const/4 v6, 0x1

    if-ne v5, v6, :cond_4

    .line 107
    iget v5, v2, Landroid/graphics/Rect;->bottom:I

    iget v6, v0, Lcom/facebook/widget/k;->topMargin:I

    add-int p3, v5, v6

    .line 121
    :cond_2
    :goto_1
    and-int/lit8 v5, v1, 0x10

    const/16 v6, 0x10

    if-ne v5, v6, :cond_8

    .line 122
    iget v1, v2, Landroid/graphics/Rect;->left:I

    sub-int/2addr v1, v3

    iget v0, v0, Lcom/facebook/widget/k;->rightMargin:I

    sub-int p1, v1, v0

    .line 136
    :cond_3
    :goto_2
    add-int v0, p1, v3

    add-int v1, p3, v4

    invoke-virtual {p5, p1, p3, v0, v1}, Landroid/view/View;->layout(IIII)V

    goto :goto_0

    .line 108
    :cond_4
    and-int/lit8 v5, v1, 0x2

    const/4 v6, 0x2

    if-ne v5, v6, :cond_5

    .line 109
    iget v5, v2, Landroid/graphics/Rect;->top:I

    sub-int/2addr v5, v4

    iget v6, v0, Lcom/facebook/widget/k;->bottomMargin:I

    sub-int p3, v5, v6

    goto :goto_1

    .line 110
    :cond_5
    and-int/lit8 v5, v1, 0x4

    const/4 v6, 0x4

    if-ne v5, v6, :cond_6

    .line 111
    iget v5, v2, Landroid/graphics/Rect;->top:I

    iget v6, v0, Lcom/facebook/widget/k;->topMargin:I

    add-int p3, v5, v6

    goto :goto_1

    .line 112
    :cond_6
    and-int/lit8 v5, v1, 0x8

    const/16 v6, 0x8

    if-ne v5, v6, :cond_7

    .line 113
    iget v5, v2, Landroid/graphics/Rect;->bottom:I

    sub-int/2addr v5, v4

    iget v6, v0, Lcom/facebook/widget/k;->bottomMargin:I

    sub-int p3, v5, v6

    goto :goto_1

    .line 114
    :cond_7
    and-int/lit16 v5, v1, 0x100

    const/16 v6, 0x100

    if-ne v5, v6, :cond_2

    .line 115
    iget v5, v2, Landroid/graphics/Rect;->bottom:I

    iget v6, v2, Landroid/graphics/Rect;->top:I

    add-int/2addr v5, v6

    sub-int/2addr v5, v4

    div-int/lit8 v5, v5, 0x2

    iget v6, v0, Lcom/facebook/widget/k;->topMargin:I

    iget v7, v0, Lcom/facebook/widget/k;->bottomMargin:I

    sub-int/2addr v6, v7

    div-int/lit8 v6, v6, 0x2

    add-int p3, v5, v6

    goto :goto_1

    .line 123
    :cond_8
    and-int/lit8 v5, v1, 0x20

    const/16 v6, 0x20

    if-ne v5, v6, :cond_9

    .line 124
    iget v1, v2, Landroid/graphics/Rect;->right:I

    iget v0, v0, Lcom/facebook/widget/k;->leftMargin:I

    add-int p1, v1, v0

    goto :goto_2

    .line 125
    :cond_9
    and-int/lit8 v5, v1, 0x40

    const/16 v6, 0x40

    if-ne v5, v6, :cond_a

    .line 126
    iget v1, v2, Landroid/graphics/Rect;->left:I

    iget v0, v0, Lcom/facebook/widget/k;->leftMargin:I

    add-int p1, v1, v0

    goto :goto_2

    .line 127
    :cond_a
    and-int/lit16 v5, v1, 0x80

    const/16 v6, 0x80

    if-ne v5, v6, :cond_b

    .line 128
    iget v1, v2, Landroid/graphics/Rect;->right:I

    sub-int/2addr v1, v3

    iget v0, v0, Lcom/facebook/widget/k;->rightMargin:I

    sub-int p1, v1, v0

    goto :goto_2

    .line 129
    :cond_b
    and-int/lit16 v1, v1, 0x200

    const/16 v5, 0x200

    if-ne v1, v5, :cond_3

    .line 130
    iget v1, v2, Landroid/graphics/Rect;->right:I

    iget v2, v2, Landroid/graphics/Rect;->left:I

    add-int/2addr v1, v2

    sub-int/2addr v1, v3

    div-int/lit8 v1, v1, 0x2

    iget v2, v0, Lcom/facebook/widget/k;->leftMargin:I

    iget v0, v0, Lcom/facebook/widget/k;->rightMargin:I

    sub-int v0, v2, v0

    div-int/lit8 v0, v0, 0x2

    add-int p1, v1, v0

    goto/16 :goto_2
.end method

.method protected onLayout(ZIIII)V
    .locals 2

    .prologue
    .line 58
    const-string v0, "Overlayout.onLayout"

    invoke-static {v0}, Lcom/facebook/debug/d/e;->a(Ljava/lang/String;)Lcom/facebook/debug/d/e;

    move-result-object v0

    .line 60
    :try_start_0
    invoke-super/range {p0 .. p5}, Lcom/facebook/widget/f;->onLayout(ZIIII)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 62
    invoke-virtual {v0}, Lcom/facebook/debug/d/e;->a()J

    .line 64
    return-void

    .line 62
    :catchall_0
    move-exception v1

    invoke-virtual {v0}, Lcom/facebook/debug/d/e;->a()J

    throw v1
.end method

.method protected onMeasure(II)V
    .locals 2

    .prologue
    .line 48
    const-string v0, "Overlayout.onMeasure"

    invoke-static {v0}, Lcom/facebook/debug/d/e;->a(Ljava/lang/String;)Lcom/facebook/debug/d/e;

    move-result-object v0

    .line 50
    :try_start_0
    invoke-super {p0, p1, p2}, Lcom/facebook/widget/f;->onMeasure(II)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 52
    invoke-virtual {v0}, Lcom/facebook/debug/d/e;->a()J

    .line 54
    return-void

    .line 52
    :catchall_0
    move-exception v1

    invoke-virtual {v0}, Lcom/facebook/debug/d/e;->a()J

    throw v1
.end method
