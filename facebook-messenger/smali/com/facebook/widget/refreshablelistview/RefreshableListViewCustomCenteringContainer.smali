.class public Lcom/facebook/widget/refreshablelistview/RefreshableListViewCustomCenteringContainer;
.super Landroid/view/ViewGroup;
.source "RefreshableListViewCustomCenteringContainer.java"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .prologue
    .line 18
    invoke-direct {p0, p1}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;)V

    .line 19
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .prologue
    .line 22
    invoke-direct {p0, p1, p2}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 23
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .prologue
    .line 27
    invoke-direct {p0, p1, p2, p3}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 28
    return-void
.end method


# virtual methods
.method protected onLayout(ZIIII)V
    .locals 9

    .prologue
    .line 71
    invoke-virtual {p0}, Lcom/facebook/widget/refreshablelistview/RefreshableListViewCustomCenteringContainer;->getChildCount()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    .line 72
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Expecting 2 children not "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lcom/facebook/widget/refreshablelistview/RefreshableListViewCustomCenteringContainer;->getChildCount()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 74
    :cond_0
    const-string v0, "RefreshableListViewCustomCenteringContainer.onLayout"

    invoke-static {v0}, Lcom/facebook/debug/d/e;->a(Ljava/lang/String;)Lcom/facebook/debug/d/e;

    move-result-object v0

    .line 77
    invoke-virtual {p0}, Lcom/facebook/widget/refreshablelistview/RefreshableListViewCustomCenteringContainer;->getPaddingLeft()I

    move-result v1

    .line 78
    invoke-virtual {p0}, Lcom/facebook/widget/refreshablelistview/RefreshableListViewCustomCenteringContainer;->getRight()I

    move-result v2

    invoke-virtual {p0}, Lcom/facebook/widget/refreshablelistview/RefreshableListViewCustomCenteringContainer;->getLeft()I

    move-result v3

    sub-int/2addr v2, v3

    invoke-virtual {p0}, Lcom/facebook/widget/refreshablelistview/RefreshableListViewCustomCenteringContainer;->getPaddingRight()I

    move-result v3

    sub-int/2addr v2, v3

    .line 79
    invoke-virtual {p0}, Lcom/facebook/widget/refreshablelistview/RefreshableListViewCustomCenteringContainer;->getBottom()I

    move-result v3

    invoke-virtual {p0}, Lcom/facebook/widget/refreshablelistview/RefreshableListViewCustomCenteringContainer;->getTop()I

    move-result v4

    sub-int/2addr v3, v4

    invoke-virtual {p0}, Lcom/facebook/widget/refreshablelistview/RefreshableListViewCustomCenteringContainer;->getPaddingBottom()I

    move-result v4

    sub-int/2addr v3, v4

    .line 80
    invoke-virtual {p0}, Lcom/facebook/widget/refreshablelistview/RefreshableListViewCustomCenteringContainer;->getPaddingTop()I

    move-result v4

    .line 82
    const/4 v5, 0x0

    invoke-virtual {p0, v5}, Lcom/facebook/widget/refreshablelistview/RefreshableListViewCustomCenteringContainer;->getChildAt(I)Landroid/view/View;

    move-result-object v5

    .line 83
    const/4 v6, 0x1

    invoke-virtual {p0, v6}, Lcom/facebook/widget/refreshablelistview/RefreshableListViewCustomCenteringContainer;->getChildAt(I)Landroid/view/View;

    move-result-object v6

    .line 86
    sub-int/2addr v2, v1

    div-int/lit8 v2, v2, 0x2

    add-int/2addr v1, v2

    .line 87
    sub-int v2, v3, v4

    div-int/lit8 v2, v2, 0x2

    add-int/2addr v2, v4

    .line 90
    invoke-virtual {v6}, Landroid/view/View;->getMeasuredWidth()I

    move-result v3

    div-int/lit8 v3, v3, 0x2

    sub-int/2addr v1, v3

    .line 91
    invoke-virtual {v6}, Landroid/view/View;->getMeasuredHeight()I

    move-result v3

    div-int/lit8 v3, v3, 0x2

    sub-int v3, v2, v3

    .line 92
    invoke-virtual {v5}, Landroid/view/View;->getMeasuredWidth()I

    move-result v4

    sub-int v4, v1, v4

    .line 93
    invoke-virtual {v5}, Landroid/view/View;->getMeasuredHeight()I

    move-result v7

    div-int/lit8 v7, v7, 0x2

    sub-int/2addr v2, v7

    .line 95
    invoke-virtual {v6}, Landroid/view/View;->getMeasuredWidth()I

    move-result v7

    add-int/2addr v7, v1

    invoke-virtual {v6}, Landroid/view/View;->getMeasuredHeight()I

    move-result v8

    add-int/2addr v8, v3

    invoke-virtual {v6, v1, v3, v7, v8}, Landroid/view/View;->layout(IIII)V

    .line 99
    invoke-virtual {v5}, Landroid/view/View;->getMeasuredHeight()I

    move-result v3

    add-int/2addr v3, v2

    invoke-virtual {v5, v4, v2, v1, v3}, Landroid/view/View;->layout(IIII)V

    .line 103
    invoke-virtual {v0}, Lcom/facebook/debug/d/e;->a()J

    .line 104
    return-void
.end method

.method protected onMeasure(II)V
    .locals 9

    .prologue
    const/4 v8, 0x0

    .line 32
    invoke-virtual {p0}, Lcom/facebook/widget/refreshablelistview/RefreshableListViewCustomCenteringContainer;->getChildCount()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    .line 33
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Expecting 2 children not "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lcom/facebook/widget/refreshablelistview/RefreshableListViewCustomCenteringContainer;->getChildCount()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 36
    :cond_0
    const-string v0, "RefreshableListViewCustomCenteringContainer.onMeasure"

    invoke-static {v0}, Lcom/facebook/debug/d/e;->a(Ljava/lang/String;)Lcom/facebook/debug/d/e;

    move-result-object v0

    .line 38
    invoke-virtual {p0, v8}, Lcom/facebook/widget/refreshablelistview/RefreshableListViewCustomCenteringContainer;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    .line 39
    const/4 v2, 0x1

    invoke-virtual {p0, v2}, Lcom/facebook/widget/refreshablelistview/RefreshableListViewCustomCenteringContainer;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    .line 41
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v3

    .line 42
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v4

    .line 47
    invoke-virtual {p0}, Lcom/facebook/widget/refreshablelistview/RefreshableListViewCustomCenteringContainer;->getPaddingLeft()I

    move-result v5

    invoke-virtual {p0}, Lcom/facebook/widget/refreshablelistview/RefreshableListViewCustomCenteringContainer;->getPaddingRight()I

    move-result v6

    add-int/2addr v5, v6

    add-int/2addr v5, v8

    .line 48
    invoke-virtual {p0}, Lcom/facebook/widget/refreshablelistview/RefreshableListViewCustomCenteringContainer;->getPaddingTop()I

    move-result v6

    invoke-virtual {p0}, Lcom/facebook/widget/refreshablelistview/RefreshableListViewCustomCenteringContainer;->getPaddingBottom()I

    move-result v7

    add-int/2addr v6, v7

    add-int/2addr v6, v8

    .line 51
    invoke-virtual {p0, v1, p1, p2}, Lcom/facebook/widget/refreshablelistview/RefreshableListViewCustomCenteringContainer;->measureChild(Landroid/view/View;II)V

    .line 52
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    move-result v7

    mul-int/lit8 v7, v7, 0x2

    add-int/2addr v5, v7

    .line 54
    sub-int/2addr v4, v5

    invoke-static {v4, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v3

    .line 56
    invoke-virtual {p0, v2, v3, p2}, Lcom/facebook/widget/refreshablelistview/RefreshableListViewCustomCenteringContainer;->measureChild(Landroid/view/View;II)V

    .line 57
    invoke-virtual {v2}, Landroid/view/View;->getMeasuredWidth()I

    move-result v3

    add-int/2addr v3, v5

    .line 58
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I

    move-result v1

    invoke-virtual {v2}, Landroid/view/View;->getMeasuredHeight()I

    move-result v2

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v1

    add-int/2addr v1, v6

    .line 61
    invoke-virtual {p0}, Lcom/facebook/widget/refreshablelistview/RefreshableListViewCustomCenteringContainer;->getSuggestedMinimumHeight()I

    move-result v2

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v1

    .line 62
    invoke-virtual {p0}, Lcom/facebook/widget/refreshablelistview/RefreshableListViewCustomCenteringContainer;->getSuggestedMinimumWidth()I

    move-result v2

    invoke-static {v3, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    .line 64
    invoke-static {v2, p1}, Lcom/facebook/widget/refreshablelistview/RefreshableListViewCustomCenteringContainer;->resolveSize(II)I

    move-result v2

    invoke-static {v1, p2}, Lcom/facebook/widget/refreshablelistview/RefreshableListViewCustomCenteringContainer;->resolveSize(II)I

    move-result v1

    invoke-virtual {p0, v2, v1}, Lcom/facebook/widget/refreshablelistview/RefreshableListViewCustomCenteringContainer;->setMeasuredDimension(II)V

    .line 66
    invoke-virtual {v0}, Lcom/facebook/debug/d/e;->a()J

    .line 67
    return-void
.end method
