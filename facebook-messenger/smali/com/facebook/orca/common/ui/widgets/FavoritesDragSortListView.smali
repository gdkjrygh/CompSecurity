.class public Lcom/facebook/orca/common/ui/widgets/FavoritesDragSortListView;
.super Lcom/facebook/widget/listview/d;
.source "FavoritesDragSortListView.java"


# instance fields
.field private d:I

.field private e:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 65
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/facebook/orca/common/ui/widgets/FavoritesDragSortListView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 66
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    const/4 v2, -0x1

    .line 69
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/widget/listview/d;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 23
    iput v2, p0, Lcom/facebook/orca/common/ui/widgets/FavoritesDragSortListView;->d:I

    .line 24
    iput v2, p0, Lcom/facebook/orca/common/ui/widgets/FavoritesDragSortListView;->e:I

    .line 71
    if-eqz p2, :cond_0

    .line 72
    invoke-virtual {p0}, Lcom/facebook/orca/common/ui/widgets/FavoritesDragSortListView;->getContext()Landroid/content/Context;

    move-result-object v0

    sget-object v1, Lcom/facebook/q;->FavoritesDragSortListView:[I

    invoke-virtual {v0, p2, v1, v3, v3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v0

    .line 77
    sget v1, Lcom/facebook/q;->FavoritesDragSortListView_top_divider:I

    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v1

    iput v1, p0, Lcom/facebook/orca/common/ui/widgets/FavoritesDragSortListView;->d:I

    .line 78
    sget v1, Lcom/facebook/q;->FavoritesDragSortListView_bottom_divider:I

    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v1

    iput v1, p0, Lcom/facebook/orca/common/ui/widgets/FavoritesDragSortListView;->e:I

    .line 80
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 82
    :cond_0
    return-void
.end method


# virtual methods
.method protected a(Landroid/view/View;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 90
    invoke-virtual {p0, p1}, Lcom/facebook/orca/common/ui/widgets/FavoritesDragSortListView;->b(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 91
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    .line 92
    iget v1, p0, Lcom/facebook/orca/common/ui/widgets/FavoritesDragSortListView;->a:I

    iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 93
    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 94
    invoke-virtual {p1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 95
    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 96
    iget v0, p0, Lcom/facebook/orca/common/ui/widgets/FavoritesDragSortListView;->d:I

    const/4 v1, 0x4

    invoke-virtual {p0, p1, v0, v1}, Lcom/facebook/orca/common/ui/widgets/FavoritesDragSortListView;->a(Landroid/view/View;II)V

    .line 97
    iget v0, p0, Lcom/facebook/orca/common/ui/widgets/FavoritesDragSortListView;->e:I

    invoke-virtual {p0, p1, v0, v2}, Lcom/facebook/orca/common/ui/widgets/FavoritesDragSortListView;->a(Landroid/view/View;II)V

    .line 99
    :cond_0
    return-void
.end method

.method protected a(Landroid/view/View;III)V
    .locals 6

    .prologue
    const/4 v5, 0x4

    const/4 v4, 0x0

    .line 106
    invoke-virtual {p0, p1}, Lcom/facebook/orca/common/ui/widgets/FavoritesDragSortListView;->b(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_2

    move-object v0, p1

    .line 107
    check-cast v0, Lcom/facebook/orca/common/ui/widgets/e;

    .line 108
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    .line 109
    iput p2, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 110
    invoke-virtual {p1, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 111
    invoke-virtual {p1, p4}, Landroid/view/View;->setVisibility(I)V

    .line 113
    new-instance v1, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v2, -0x1

    iget v3, p0, Lcom/facebook/orca/common/ui/widgets/FavoritesDragSortListView;->a:I

    invoke-direct {v1, v2, v3, p3}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    .line 115
    invoke-virtual {v0}, Lcom/facebook/orca/common/ui/widgets/e;->getInnerRow()Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 117
    iget v1, p0, Lcom/facebook/orca/common/ui/widgets/FavoritesDragSortListView;->b:I

    if-ne p2, v1, :cond_3

    .line 118
    const/16 v1, 0x30

    if-ne p3, v1, :cond_0

    .line 119
    iget v1, p0, Lcom/facebook/orca/common/ui/widgets/FavoritesDragSortListView;->e:I

    invoke-virtual {p0, p1, v1, v4}, Lcom/facebook/orca/common/ui/widgets/FavoritesDragSortListView;->a(Landroid/view/View;II)V

    .line 120
    iget v1, p0, Lcom/facebook/orca/common/ui/widgets/FavoritesDragSortListView;->d:I

    invoke-virtual {p0, p1, v1, v5}, Lcom/facebook/orca/common/ui/widgets/FavoritesDragSortListView;->a(Landroid/view/View;II)V

    .line 121
    iget v1, p0, Lcom/facebook/orca/common/ui/widgets/FavoritesDragSortListView;->e:I

    invoke-virtual {p0, p1, v1, v4}, Lcom/facebook/orca/common/ui/widgets/FavoritesDragSortListView;->a(Landroid/view/View;II)V

    .line 122
    iget v1, p0, Lcom/facebook/orca/common/ui/widgets/FavoritesDragSortListView;->d:I

    invoke-virtual {p0, p1, v1, v4}, Lcom/facebook/orca/common/ui/widgets/FavoritesDragSortListView;->a(Landroid/view/View;II)V

    .line 128
    :cond_0
    :goto_0
    iget v1, p0, Lcom/facebook/orca/common/ui/widgets/FavoritesDragSortListView;->a:I

    if-ne p2, v1, :cond_1

    if-eqz p4, :cond_2

    .line 130
    :cond_1
    invoke-static {v0, v4}, Lcom/facebook/orca/common/ui/widgets/e;->a(Lcom/facebook/orca/common/ui/widgets/e;Z)V

    .line 133
    :cond_2
    return-void

    .line 125
    :cond_3
    iget v1, p0, Lcom/facebook/orca/common/ui/widgets/FavoritesDragSortListView;->d:I

    invoke-virtual {p0, p1, v1, v5}, Lcom/facebook/orca/common/ui/widgets/FavoritesDragSortListView;->a(Landroid/view/View;II)V

    goto :goto_0
.end method

.method protected b(Landroid/view/View;)Z
    .locals 1

    .prologue
    .line 137
    iget v0, p0, Lcom/facebook/orca/common/ui/widgets/FavoritesDragSortListView;->c:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
