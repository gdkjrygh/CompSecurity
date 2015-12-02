.class public Lcom/facebook/widget/listview/m;
.super Landroid/widget/BaseAdapter;
.source "ManagedRecycleViewAdapter.java"


# instance fields
.field private final a:Lcom/facebook/widget/listview/h;

.field private final b:Lcom/facebook/widget/listview/i;

.field private final c:Landroid/database/DataSetObserver;


# virtual methods
.method public areAllItemsEnabled()Z
    .locals 1

    .prologue
    .line 146
    iget-object v0, p0, Lcom/facebook/widget/listview/m;->a:Lcom/facebook/widget/listview/h;

    invoke-virtual {v0}, Lcom/facebook/widget/listview/h;->areAllItemsEnabled()Z

    move-result v0

    return v0
.end method

.method protected finalize()V
    .locals 2

    .prologue
    .line 171
    iget-object v0, p0, Lcom/facebook/widget/listview/m;->a:Lcom/facebook/widget/listview/h;

    iget-object v1, p0, Lcom/facebook/widget/listview/m;->c:Landroid/database/DataSetObserver;

    invoke-virtual {v0, v1}, Lcom/facebook/widget/listview/h;->unregisterDataSetObserver(Landroid/database/DataSetObserver;)V

    .line 172
    invoke-super {p0}, Ljava/lang/Object;->finalize()V

    .line 173
    return-void
.end method

.method public getCount()I
    .locals 1

    .prologue
    .line 86
    iget-object v0, p0, Lcom/facebook/widget/listview/m;->a:Lcom/facebook/widget/listview/h;

    invoke-virtual {v0}, Lcom/facebook/widget/listview/h;->getCount()I

    move-result v0

    return v0
.end method

.method public getDropDownView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 1

    .prologue
    .line 141
    iget-object v0, p0, Lcom/facebook/widget/listview/m;->a:Lcom/facebook/widget/listview/h;

    invoke-virtual {v0, p1, p2, p3}, Lcom/facebook/widget/listview/h;->getDropDownView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method public getItem(I)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 91
    iget-object v0, p0, Lcom/facebook/widget/listview/m;->a:Lcom/facebook/widget/listview/h;

    invoke-virtual {v0, p1}, Lcom/facebook/widget/listview/h;->getItem(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public getItemId(I)J
    .locals 2

    .prologue
    .line 96
    iget-object v0, p0, Lcom/facebook/widget/listview/m;->a:Lcom/facebook/widget/listview/h;

    invoke-virtual {v0, p1}, Lcom/facebook/widget/listview/h;->getItemId(I)J

    move-result-wide v0

    return-wide v0
.end method

.method public getItemViewType(I)I
    .locals 1

    .prologue
    .line 156
    iget-object v0, p0, Lcom/facebook/widget/listview/m;->a:Lcom/facebook/widget/listview/h;

    invoke-virtual {v0, p1}, Lcom/facebook/widget/listview/h;->getItemViewType(I)I

    move-result v0

    return v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 5

    .prologue
    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 101
    iget-object v0, p0, Lcom/facebook/widget/listview/m;->a:Lcom/facebook/widget/listview/h;

    invoke-virtual {v0, p1}, Lcom/facebook/widget/listview/h;->getItemViewType(I)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    .line 102
    check-cast p2, Lcom/facebook/widget/e/a;

    .line 103
    if-nez p2, :cond_0

    .line 104
    new-instance p2, Lcom/facebook/widget/e/a;

    invoke-virtual {p3}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p2, v0}, Lcom/facebook/widget/e/a;-><init>(Landroid/content/Context;)V

    .line 106
    :cond_0
    invoke-virtual {p2, v3}, Lcom/facebook/widget/e/a;->setRecycleViewType(Ljava/lang/Integer;)V

    .line 107
    invoke-virtual {p2, p1}, Lcom/facebook/widget/e/a;->setPositionInListView(I)V

    .line 108
    invoke-virtual {p2}, Lcom/facebook/widget/e/a;->getChildCount()I

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p2}, Lcom/facebook/widget/e/a;->getChildCount()I

    move-result v0

    if-ne v0, v2, :cond_3

    :cond_1
    move v0, v2

    :goto_0
    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkState(Z)V

    .line 110
    const/4 v0, 0x0

    .line 111
    invoke-virtual {p2}, Lcom/facebook/widget/e/a;->getChildCount()I

    move-result v4

    if-nez v4, :cond_4

    .line 112
    iget-object v0, p0, Lcom/facebook/widget/listview/m;->b:Lcom/facebook/widget/listview/i;

    iget-object v2, p0, Lcom/facebook/widget/listview/m;->a:Lcom/facebook/widget/listview/h;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v0, v2, v3, p1}, Lcom/facebook/widget/listview/i;->a(Ljava/lang/Class;Ljava/lang/Integer;I)Landroid/view/View;

    move-result-object v0

    .line 122
    :cond_2
    :goto_1
    iget-object v2, p0, Lcom/facebook/widget/listview/m;->a:Lcom/facebook/widget/listview/h;

    invoke-virtual {v2, p1, v0, p3}, Lcom/facebook/widget/listview/h;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    .line 123
    instance-of v2, v0, Lcom/facebook/widget/j;

    if-eqz v2, :cond_5

    .line 125
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    invoke-virtual {p2, v0, v1, v2}, Lcom/facebook/widget/e/a;->attachRecyclableViewToParent(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 131
    :goto_2
    return-object p2

    :cond_3
    move v0, v1

    .line 108
    goto :goto_0

    .line 116
    :cond_4
    invoke-virtual {p2}, Lcom/facebook/widget/e/a;->getChildCount()I

    move-result v3

    if-ne v3, v2, :cond_2

    .line 118
    invoke-virtual {p2, v1}, Lcom/facebook/widget/e/a;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 119
    invoke-virtual {p2, v1}, Lcom/facebook/widget/e/a;->removeViewAt(I)V

    goto :goto_1

    .line 128
    :cond_5
    invoke-virtual {p2, v0}, Lcom/facebook/widget/e/a;->addView(Landroid/view/View;)V

    goto :goto_2
.end method

.method public getViewTypeCount()I
    .locals 1

    .prologue
    .line 161
    iget-object v0, p0, Lcom/facebook/widget/listview/m;->a:Lcom/facebook/widget/listview/h;

    invoke-virtual {v0}, Lcom/facebook/widget/listview/h;->getViewTypeCount()I

    move-result v0

    return v0
.end method

.method public hasStableIds()Z
    .locals 1

    .prologue
    .line 136
    iget-object v0, p0, Lcom/facebook/widget/listview/m;->a:Lcom/facebook/widget/listview/h;

    invoke-virtual {v0}, Lcom/facebook/widget/listview/h;->hasStableIds()Z

    move-result v0

    return v0
.end method

.method public isEmpty()Z
    .locals 1

    .prologue
    .line 166
    iget-object v0, p0, Lcom/facebook/widget/listview/m;->a:Lcom/facebook/widget/listview/h;

    invoke-virtual {v0}, Lcom/facebook/widget/listview/h;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public isEnabled(I)Z
    .locals 1

    .prologue
    .line 151
    iget-object v0, p0, Lcom/facebook/widget/listview/m;->a:Lcom/facebook/widget/listview/h;

    invoke-virtual {v0, p1}, Lcom/facebook/widget/listview/h;->isEnabled(I)Z

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 181
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/widget/listview/m;->a:Lcom/facebook/widget/listview/h;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
