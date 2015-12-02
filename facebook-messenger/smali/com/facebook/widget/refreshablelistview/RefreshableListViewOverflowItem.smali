.class public Lcom/facebook/widget/refreshablelistview/RefreshableListViewOverflowItem;
.super Landroid/view/View;
.source "RefreshableListViewOverflowItem.java"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .prologue
    .line 17
    invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 18
    invoke-direct {p0}, Lcom/facebook/widget/refreshablelistview/RefreshableListViewOverflowItem;->a()V

    .line 19
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .prologue
    .line 22
    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 23
    invoke-direct {p0}, Lcom/facebook/widget/refreshablelistview/RefreshableListViewOverflowItem;->a()V

    .line 24
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .prologue
    .line 27
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 28
    invoke-direct {p0}, Lcom/facebook/widget/refreshablelistview/RefreshableListViewOverflowItem;->a()V

    .line 29
    return-void
.end method

.method private a()V
    .locals 3

    .prologue
    const/16 v2, 0xff

    .line 32
    const/high16 v0, 0x43fa0000    # 500.0f

    invoke-virtual {p0}, Lcom/facebook/widget/refreshablelistview/RefreshableListViewOverflowItem;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    iget v1, v1, Landroid/util/DisplayMetrics;->density:F

    mul-float/2addr v0, v1

    float-to-int v0, v0

    invoke-virtual {p0, v0}, Lcom/facebook/widget/refreshablelistview/RefreshableListViewOverflowItem;->setMinimumHeight(I)V

    .line 33
    new-instance v0, Landroid/graphics/drawable/ColorDrawable;

    invoke-static {v2, v2, v2}, Landroid/graphics/Color;->rgb(III)I

    move-result v1

    invoke-direct {v0, v1}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {p0, v0}, Lcom/facebook/widget/refreshablelistview/RefreshableListViewOverflowItem;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 34
    return-void
.end method
