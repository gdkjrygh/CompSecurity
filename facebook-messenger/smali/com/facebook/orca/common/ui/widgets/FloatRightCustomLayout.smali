.class public Lcom/facebook/orca/common/ui/widgets/FloatRightCustomLayout;
.super Landroid/view/ViewGroup;
.source "FloatRightCustomLayout.java"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .prologue
    .line 20
    invoke-direct {p0, p1}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;)V

    .line 21
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .prologue
    .line 24
    invoke-direct {p0, p1, p2}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 25
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .prologue
    .line 28
    invoke-direct {p0, p1, p2, p3}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 29
    return-void
.end method

.method private a(Landroid/view/View;IIII)V
    .locals 2

    .prologue
    .line 138
    add-int v0, p2, p4

    add-int v1, p3, p5

    invoke-virtual {p1, p2, p3, v0, v1}, Landroid/view/View;->layout(IIII)V

    .line 139
    return-void
.end method


# virtual methods
.method protected checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z
    .locals 1

    .prologue
    .line 166
    instance-of v0, p1, Landroid/widget/LinearLayout$LayoutParams;

    return v0
.end method

.method protected generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    .locals 2

    .prologue
    const/4 v1, -0x1

    .line 148
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v0, v1, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    return-object v0
.end method

.method public generateLayoutParams(Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams;
    .locals 2

    .prologue
    .line 158
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    invoke-virtual {p0}, Lcom/facebook/orca/common/ui/widgets/FloatRightCustomLayout;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-object v0
.end method

.method protected generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;
    .locals 1

    .prologue
    .line 171
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v0, p1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    return-object v0
.end method

.method protected onLayout(ZIIII)V
    .locals 11

    .prologue
    .line 85
    invoke-virtual {p0}, Lcom/facebook/orca/common/ui/widgets/FloatRightCustomLayout;->getChildCount()I

    move-result v0

    .line 86
    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    .line 87
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Should be two children"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 90
    :cond_0
    invoke-virtual {p0}, Lcom/facebook/orca/common/ui/widgets/FloatRightCustomLayout;->getPaddingTop()I

    move-result v7

    .line 91
    invoke-virtual {p0}, Lcom/facebook/orca/common/ui/widgets/FloatRightCustomLayout;->getPaddingBottom()I

    move-result v0

    .line 92
    invoke-virtual {p0}, Lcom/facebook/orca/common/ui/widgets/FloatRightCustomLayout;->getHeight()I

    move-result v1

    .line 94
    invoke-virtual {p0}, Lcom/facebook/orca/common/ui/widgets/FloatRightCustomLayout;->getPaddingLeft()I

    move-result v2

    .line 95
    sub-int v3, v1, v7

    sub-int v9, v3, v0

    .line 96
    sub-int v10, v1, v0

    .line 99
    const/4 v0, 0x0

    move v8, v0

    :goto_0
    const/4 v0, 0x2

    if-ge v8, v0, :cond_2

    .line 100
    invoke-virtual {p0, v8}, Lcom/facebook/orca/common/ui/widgets/FloatRightCustomLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    .line 101
    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    move-result v0

    const/16 v3, 0x8

    if-ne v0, v3, :cond_1

    move v0, v2

    .line 99
    :goto_1
    add-int/lit8 v1, v8, 0x1

    move v8, v1

    move v2, v0

    goto :goto_0

    .line 104
    :cond_1
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/widget/LinearLayout$LayoutParams;

    .line 106
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    move-result v4

    .line 107
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I

    move-result v5

    .line 110
    iget v0, v6, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    and-int/lit8 v0, v0, 0x70

    sparse-switch v0, :sswitch_data_0

    move v3, v7

    .line 131
    :goto_2
    iget v0, v6, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    add-int/2addr v2, v0

    move-object v0, p0

    .line 132
    invoke-direct/range {v0 .. v5}, Lcom/facebook/orca/common/ui/widgets/FloatRightCustomLayout;->a(Landroid/view/View;IIII)V

    .line 133
    iget v0, v6, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    add-int/2addr v0, v4

    add-int/2addr v0, v2

    goto :goto_1

    .line 112
    :sswitch_0
    iget v0, v6, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    add-int v3, v7, v0

    .line 113
    goto :goto_2

    .line 116
    :sswitch_1
    sub-int v0, v9, v5

    div-int/lit8 v0, v0, 0x2

    add-int/2addr v0, v7

    iget v3, v6, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    add-int/2addr v0, v3

    iget v3, v6, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    sub-int v3, v0, v3

    .line 121
    goto :goto_2

    .line 124
    :sswitch_2
    sub-int v0, v10, v5

    iget v3, v6, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    sub-int v3, v0, v3

    .line 125
    goto :goto_2

    .line 135
    :cond_2
    return-void

    .line 110
    nop

    :sswitch_data_0
    .sparse-switch
        0x10 -> :sswitch_1
        0x30 -> :sswitch_0
        0x50 -> :sswitch_2
    .end sparse-switch
.end method

.method protected onMeasure(II)V
    .locals 11

    .prologue
    const/4 v3, 0x0

    .line 33
    invoke-virtual {p0}, Lcom/facebook/orca/common/ui/widgets/FloatRightCustomLayout;->getChildCount()I

    move-result v0

    .line 34
    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    .line 35
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Should be two children"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 42
    :cond_0
    invoke-virtual {p0, v3}, Lcom/facebook/orca/common/ui/widgets/FloatRightCustomLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v10

    .line 43
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/facebook/orca/common/ui/widgets/FloatRightCustomLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    .line 45
    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    move-result v0

    const/16 v2, 0x8

    if-eq v0, v2, :cond_1

    .line 47
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/widget/LinearLayout$LayoutParams;

    .line 49
    invoke-static {v3, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v2

    move-object v0, p0

    move v4, p2

    move v5, v3

    .line 50
    invoke-virtual/range {v0 .. v5}, Lcom/facebook/orca/common/ui/widgets/FloatRightCustomLayout;->measureChildWithMargins(Landroid/view/View;IIII)V

    .line 51
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    iget v2, v6, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    add-int/2addr v0, v2

    iget v2, v6, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    add-int v7, v0, v2

    .line 55
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I

    move-result v0

    invoke-static {v3, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 56
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    move-result v1

    iget v2, v6, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    add-int/2addr v1, v2

    iget v2, v6, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    add-int/2addr v1, v2

    add-int/2addr v1, v3

    move v2, v1

    move v1, v0

    :goto_0
    move-object v4, p0

    move-object v5, v10

    move v6, p1

    move v8, p2

    move v9, v3

    .line 60
    invoke-virtual/range {v4 .. v9}, Lcom/facebook/orca/common/ui/widgets/FloatRightCustomLayout;->measureChildWithMargins(Landroid/view/View;IIII)V

    .line 66
    invoke-virtual {v10}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout$LayoutParams;

    .line 68
    invoke-virtual {v10}, Landroid/view/View;->getMeasuredWidth()I

    move-result v3

    iget v4, v0, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    add-int/2addr v3, v4

    iget v0, v0, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    add-int/2addr v0, v3

    add-int/2addr v0, v2

    .line 69
    invoke-virtual {v10}, Landroid/view/View;->getMeasuredHeight()I

    move-result v2

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v1

    .line 72
    invoke-virtual {p0}, Lcom/facebook/orca/common/ui/widgets/FloatRightCustomLayout;->getPaddingTop()I

    move-result v2

    invoke-virtual {p0}, Lcom/facebook/orca/common/ui/widgets/FloatRightCustomLayout;->getPaddingBottom()I

    move-result v3

    add-int/2addr v2, v3

    add-int/2addr v1, v2

    .line 73
    invoke-virtual {p0}, Lcom/facebook/orca/common/ui/widgets/FloatRightCustomLayout;->getPaddingLeft()I

    move-result v2

    invoke-virtual {p0}, Lcom/facebook/orca/common/ui/widgets/FloatRightCustomLayout;->getPaddingRight()I

    move-result v3

    add-int/2addr v2, v3

    add-int/2addr v0, v2

    .line 76
    invoke-virtual {p0}, Lcom/facebook/orca/common/ui/widgets/FloatRightCustomLayout;->getSuggestedMinimumWidth()I

    move-result v2

    invoke-static {v0, v2}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 77
    invoke-virtual {p0}, Lcom/facebook/orca/common/ui/widgets/FloatRightCustomLayout;->getSuggestedMinimumHeight()I

    move-result v2

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v1

    .line 78
    invoke-static {v0, p1}, Lcom/facebook/orca/common/ui/widgets/FloatRightCustomLayout;->resolveSize(II)I

    move-result v0

    invoke-static {v1, p2}, Lcom/facebook/orca/common/ui/widgets/FloatRightCustomLayout;->resolveSize(II)I

    move-result v1

    invoke-virtual {p0, v0, v1}, Lcom/facebook/orca/common/ui/widgets/FloatRightCustomLayout;->setMeasuredDimension(II)V

    .line 81
    return-void

    :cond_1
    move v7, v3

    move v1, v3

    move v2, v3

    goto :goto_0
.end method
