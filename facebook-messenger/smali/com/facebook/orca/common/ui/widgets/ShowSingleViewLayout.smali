.class public Lcom/facebook/orca/common/ui/widgets/ShowSingleViewLayout;
.super Lcom/facebook/widget/f;
.source "ShowSingleViewLayout.java"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .prologue
    .line 16
    invoke-direct {p0, p1}, Lcom/facebook/widget/f;-><init>(Landroid/content/Context;)V

    .line 17
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .prologue
    .line 20
    invoke-direct {p0, p1, p2}, Lcom/facebook/widget/f;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 21
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .prologue
    .line 24
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/widget/f;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 25
    return-void
.end method


# virtual methods
.method protected onMeasure(II)V
    .locals 7

    .prologue
    const/4 v3, 0x0

    .line 29
    invoke-virtual {p0}, Lcom/facebook/orca/common/ui/widgets/ShowSingleViewLayout;->getChildCount()I

    move-result v0

    .line 35
    add-int/lit8 v0, v0, -0x1

    move v6, v0

    move v2, v3

    move v0, v3

    :goto_0
    if-ltz v6, :cond_2

    .line 36
    invoke-virtual {p0, v6}, Lcom/facebook/orca/common/ui/widgets/ShowSingleViewLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    .line 37
    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    move-result v4

    const/16 v5, 0x8

    if-eq v4, v5, :cond_0

    move-object v0, p0

    move v2, p1

    move v4, p2

    move v5, v3

    .line 38
    invoke-virtual/range {v0 .. v5}, Lcom/facebook/orca/common/ui/widgets/ShowSingleViewLayout;->measureChildWithMargins(Landroid/view/View;IIII)V

    .line 39
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    .line 40
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I

    move-result v1

    .line 41
    if-lez v0, :cond_1

    if-lez v1, :cond_1

    .line 48
    :goto_1
    invoke-virtual {p0}, Lcom/facebook/orca/common/ui/widgets/ShowSingleViewLayout;->getPaddingLeft()I

    move-result v2

    invoke-virtual {p0}, Lcom/facebook/orca/common/ui/widgets/ShowSingleViewLayout;->getPaddingRight()I

    move-result v3

    add-int/2addr v2, v3

    add-int/2addr v0, v2

    .line 49
    invoke-virtual {p0}, Lcom/facebook/orca/common/ui/widgets/ShowSingleViewLayout;->getPaddingTop()I

    move-result v2

    invoke-virtual {p0}, Lcom/facebook/orca/common/ui/widgets/ShowSingleViewLayout;->getPaddingBottom()I

    move-result v3

    add-int/2addr v2, v3

    add-int/2addr v1, v2

    .line 51
    invoke-virtual {p0}, Lcom/facebook/orca/common/ui/widgets/ShowSingleViewLayout;->getSuggestedMinimumHeight()I

    move-result v2

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v1

    .line 52
    invoke-virtual {p0}, Lcom/facebook/orca/common/ui/widgets/ShowSingleViewLayout;->getSuggestedMinimumWidth()I

    move-result v2

    invoke-static {v0, v2}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 53
    invoke-static {v0, p1}, Lcom/facebook/orca/common/ui/widgets/ShowSingleViewLayout;->resolveSize(II)I

    move-result v0

    invoke-static {v1, p2}, Lcom/facebook/orca/common/ui/widgets/ShowSingleViewLayout;->resolveSize(II)I

    move-result v1

    invoke-virtual {p0, v0, v1}, Lcom/facebook/orca/common/ui/widgets/ShowSingleViewLayout;->setMeasuredDimension(II)V

    .line 56
    return-void

    :cond_0
    move v1, v2

    .line 35
    :cond_1
    add-int/lit8 v2, v6, -0x1

    move v6, v2

    move v2, v1

    goto :goto_0

    :cond_2
    move v1, v2

    goto :goto_1
.end method
