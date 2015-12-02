.class public Lcom/facebook/orca/contacts/picker/MultipickerCustomLayout;
.super Lcom/facebook/widget/e;
.source "MultipickerCustomLayout.java"


# instance fields
.field private a:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 26
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/facebook/orca/contacts/picker/MultipickerCustomLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 27
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 30
    invoke-direct {p0, p1, p2}, Lcom/facebook/widget/e;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 31
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/facebook/orca/contacts/picker/MultipickerCustomLayout;->setOrientation(I)V

    .line 32
    return-void
.end method


# virtual methods
.method protected bridge synthetic generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    .locals 1

    .prologue
    .line 21
    invoke-virtual {p0}, Lcom/facebook/orca/contacts/picker/MultipickerCustomLayout;->generateDefaultLayoutParams()Landroid/widget/LinearLayout$LayoutParams;

    move-result-object v0

    return-object v0
.end method

.method protected generateDefaultLayoutParams()Landroid/widget/LinearLayout$LayoutParams;
    .locals 2

    .prologue
    const/4 v1, -0x1

    .line 92
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v0, v1, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    return-object v0
.end method

.method protected onMeasure(II)V
    .locals 12

    .prologue
    const/4 v11, 0x0

    .line 39
    invoke-virtual {p0}, Lcom/facebook/orca/contacts/picker/MultipickerCustomLayout;->getChildCount()I

    move-result v0

    .line 40
    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    .line 41
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Should be two children"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 44
    :cond_0
    invoke-virtual {p0}, Lcom/facebook/orca/contacts/picker/MultipickerCustomLayout;->getPaddingLeft()I

    move-result v0

    invoke-virtual {p0}, Lcom/facebook/orca/contacts/picker/MultipickerCustomLayout;->getPaddingRight()I

    move-result v1

    add-int v3, v0, v1

    .line 45
    invoke-virtual {p0}, Lcom/facebook/orca/contacts/picker/MultipickerCustomLayout;->getPaddingTop()I

    move-result v0

    invoke-virtual {p0}, Lcom/facebook/orca/contacts/picker/MultipickerCustomLayout;->getPaddingBottom()I

    move-result v1

    add-int v5, v0, v1

    .line 49
    invoke-virtual {p0, v11}, Lcom/facebook/orca/contacts/picker/MultipickerCustomLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    .line 50
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/facebook/orca/contacts/picker/MultipickerCustomLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v10

    .line 52
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v0

    iget v2, p0, Lcom/facebook/orca/contacts/picker/MultipickerCustomLayout;->a:I

    sub-int/2addr v0, v2

    .line 54
    const/high16 v2, -0x80000000

    invoke-static {v0, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v4

    move-object v0, p0

    move v2, p1

    invoke-virtual/range {v0 .. v5}, Lcom/facebook/orca/contacts/picker/MultipickerCustomLayout;->measureChildWithMargins(Landroid/view/View;IIII)V

    .line 61
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I

    move-result v0

    add-int v9, v5, v0

    move-object v4, p0

    move-object v5, v10

    move v6, p1

    move v7, v3

    move v8, p2

    .line 63
    invoke-virtual/range {v4 .. v9}, Lcom/facebook/orca/contacts/picker/MultipickerCustomLayout;->measureChildWithMargins(Landroid/view/View;IIII)V

    .line 70
    invoke-virtual {v10}, Landroid/view/View;->getMeasuredHeight()I

    move-result v0

    add-int/2addr v0, v9

    .line 73
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    move-result v1

    invoke-static {v11, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    .line 74
    invoke-virtual {v10}, Landroid/view/View;->getMeasuredWidth()I

    move-result v2

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v1

    .line 75
    add-int/2addr v1, v3

    .line 78
    invoke-virtual {p0}, Lcom/facebook/orca/contacts/picker/MultipickerCustomLayout;->getSuggestedMinimumHeight()I

    move-result v2

    invoke-static {v0, v2}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 79
    invoke-virtual {p0}, Lcom/facebook/orca/contacts/picker/MultipickerCustomLayout;->getSuggestedMinimumWidth()I

    move-result v2

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v1

    .line 80
    invoke-static {v1, p1}, Lcom/facebook/orca/contacts/picker/MultipickerCustomLayout;->resolveSize(II)I

    move-result v1

    invoke-static {v0, p2}, Lcom/facebook/orca/contacts/picker/MultipickerCustomLayout;->resolveSize(II)I

    move-result v0

    invoke-virtual {p0, v1, v0}, Lcom/facebook/orca/contacts/picker/MultipickerCustomLayout;->setMeasuredDimension(II)V

    .line 83
    return-void
.end method

.method public setMinBottomSizePx(I)V
    .locals 0

    .prologue
    .line 35
    iput p1, p0, Lcom/facebook/orca/contacts/picker/MultipickerCustomLayout;->a:I

    .line 36
    return-void
.end method
