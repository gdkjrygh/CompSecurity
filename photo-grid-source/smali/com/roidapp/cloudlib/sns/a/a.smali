.class public final Lcom/roidapp/cloudlib/sns/a/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Landroid/support/v7/widget/RecyclerView;Landroid/support/v7/widget/ax;Lcom/roidapp/baselib/c/y;Landroid/view/View;Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/support/v7/widget/RecyclerView;",
            "Landroid/support/v7/widget/ax;",
            "Lcom/roidapp/baselib/c/y",
            "<*>;",
            "Landroid/view/View;",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    .prologue
    .line 60
    new-instance v0, Lcom/roidapp/baselib/view/SpaceCompat;

    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/roidapp/baselib/view/SpaceCompat;-><init>(Landroid/content/Context;)V

    .line 61
    invoke-virtual {p3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    iget v1, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    invoke-virtual {v0, v1}, Lcom/roidapp/baselib/view/SpaceCompat;->setMinimumHeight(I)V

    .line 62
    invoke-virtual {p2, v0}, Lcom/roidapp/baselib/c/y;->a(Landroid/view/View;)V

    .line 64
    invoke-static {}, Lcom/roidapp/baselib/c/n;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 65
    new-instance v0, Lcom/roidapp/cloudlib/sns/a/b;

    invoke-direct {v0, p1, p3, p4}, Lcom/roidapp/cloudlib/sns/a/b;-><init>(Landroid/support/v7/widget/ax;Landroid/view/View;Ljava/lang/Object;)V

    invoke-virtual {p0, v0}, Landroid/support/v7/widget/RecyclerView;->a(Landroid/support/v7/widget/ax;)V

    .line 67
    :cond_0
    return-void
.end method

.method public static a(Landroid/view/View;Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 70
    if-eqz p0, :cond_0

    .line 71
    invoke-virtual {p0, p1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 73
    :cond_0
    return-void
.end method

.method public static a(Landroid/widget/AbsListView;Landroid/view/View;Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 19
    .line 1023
    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-static {p0, p1, v0, p2, v1}, Lcom/roidapp/cloudlib/sns/a/a;->a(Landroid/widget/AbsListView;Landroid/view/View;ZLjava/lang/Object;Landroid/widget/AbsListView$OnScrollListener;)V

    .line 20
    return-void
.end method

.method public static a(Landroid/widget/AbsListView;Landroid/view/View;ZLjava/lang/Object;Landroid/widget/AbsListView$OnScrollListener;)V
    .locals 3

    .prologue
    .line 27
    instance-of v0, p0, Landroid/widget/ListView;

    if-eqz v0, :cond_2

    move-object v0, p0

    .line 28
    check-cast v0, Landroid/widget/ListView;

    .line 29
    invoke-virtual {v0}, Landroid/widget/ListView;->getHeaderViewsCount()I

    move-result v1

    if-lez v1, :cond_0

    .line 30
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "The listView already has header view, please attach before add your header view!"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 33
    :cond_0
    new-instance v1, Lcom/roidapp/baselib/view/SpaceCompat;

    invoke-virtual {p0}, Landroid/widget/AbsListView;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/roidapp/baselib/view/SpaceCompat;-><init>(Landroid/content/Context;)V

    .line 34
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    iget v2, v2, Landroid/view/ViewGroup$LayoutParams;->height:I

    invoke-virtual {v1, v2}, Lcom/roidapp/baselib/view/SpaceCompat;->setMinimumHeight(I)V

    .line 35
    invoke-virtual {v0, v1}, Landroid/widget/ListView;->addHeaderView(Landroid/view/View;)V

    .line 37
    if-eqz p2, :cond_1

    invoke-static {}, Lcom/roidapp/baselib/c/n;->d()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 38
    new-instance v1, Lcom/roidapp/cloudlib/sns/a/b;

    invoke-direct {v1, p4, p1, p3}, Lcom/roidapp/cloudlib/sns/a/b;-><init>(Landroid/widget/AbsListView$OnScrollListener;Landroid/view/View;Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setOnScrollListener(Landroid/widget/AbsListView$OnScrollListener;)V

    .line 54
    :cond_1
    :goto_0
    return-void

    .line 41
    :cond_2
    instance-of v0, p0, Lcom/roidapp/baselib/view/HeaderFooterGridView;

    if-eqz v0, :cond_4

    move-object v0, p0

    .line 42
    check-cast v0, Lcom/roidapp/baselib/view/HeaderFooterGridView;

    .line 43
    invoke-virtual {v0}, Lcom/roidapp/baselib/view/HeaderFooterGridView;->a()I

    move-result v1

    if-lez v1, :cond_3

    .line 44
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "The listView already has header view, please attach before add your header view!"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 47
    :cond_3
    new-instance v1, Lcom/roidapp/baselib/view/SpaceCompat;

    invoke-virtual {p0}, Landroid/widget/AbsListView;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/roidapp/baselib/view/SpaceCompat;-><init>(Landroid/content/Context;)V

    .line 48
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    iget v2, v2, Landroid/view/ViewGroup$LayoutParams;->height:I

    invoke-virtual {v1, v2}, Lcom/roidapp/baselib/view/SpaceCompat;->setMinimumHeight(I)V

    .line 49
    invoke-virtual {v0, v1}, Lcom/roidapp/baselib/view/HeaderFooterGridView;->a(Landroid/view/View;)V

    .line 51
    if-eqz p2, :cond_1

    invoke-static {}, Lcom/roidapp/baselib/c/n;->d()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 52
    new-instance v1, Lcom/roidapp/cloudlib/sns/a/b;

    invoke-direct {v1, p4, p1, p3}, Lcom/roidapp/cloudlib/sns/a/b;-><init>(Landroid/widget/AbsListView$OnScrollListener;Landroid/view/View;Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Lcom/roidapp/baselib/view/HeaderFooterGridView;->setOnScrollListener(Landroid/widget/AbsListView$OnScrollListener;)V

    goto :goto_0

    .line 55
    :cond_4
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Only support ListView or HeaderFooterGridView"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static a(Lcom/roidapp/cloudlib/sns/a/c;)V
    .locals 1

    .prologue
    .line 76
    invoke-static {}, Lcom/roidapp/baselib/c/n;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 77
    invoke-static {p0}, Lcom/roidapp/cloudlib/sns/a/b;->a(Lcom/roidapp/cloudlib/sns/a/c;)V

    .line 79
    :cond_0
    return-void
.end method

.method public static b(Lcom/roidapp/cloudlib/sns/a/c;)V
    .locals 1

    .prologue
    .line 82
    invoke-static {}, Lcom/roidapp/baselib/c/n;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 83
    invoke-static {p0}, Lcom/roidapp/cloudlib/sns/a/b;->b(Lcom/roidapp/cloudlib/sns/a/c;)V

    .line 85
    :cond_0
    return-void
.end method
