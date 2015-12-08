.class final Lcom/roidapp/photogrid/r;
.super Lcom/roidapp/cloudlib/sns/aa;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/roidapp/cloudlib/sns/aa",
        "<",
        "Lcom/roidapp/cloudlib/sns/b/a/f;",
        ">;"
    }
.end annotation


# instance fields
.field private a:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference",
            "<",
            "Lcom/roidapp/photogrid/k;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lcom/roidapp/photogrid/k;)V
    .locals 1

    .prologue
    .line 733
    invoke-direct {p0}, Lcom/roidapp/cloudlib/sns/aa;-><init>()V

    .line 734
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/r;->a:Ljava/lang/ref/WeakReference;

    .line 735
    return-void
.end method

.method synthetic constructor <init>(Lcom/roidapp/photogrid/k;B)V
    .locals 0

    .prologue
    .line 730
    invoke-direct {p0, p1}, Lcom/roidapp/photogrid/r;-><init>(Lcom/roidapp/photogrid/k;)V

    return-void
.end method


# virtual methods
.method public final b(ILjava/lang/Exception;)V
    .locals 3

    .prologue
    .line 767
    invoke-super {p0, p1, p2}, Lcom/roidapp/cloudlib/sns/aa;->b(ILjava/lang/Exception;)V

    .line 769
    iget-object v0, p0, Lcom/roidapp/photogrid/r;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/k;

    .line 770
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/k;->isDetached()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 779
    :cond_0
    :goto_0
    return-void

    .line 773
    :cond_1
    invoke-static {v0}, Lcom/roidapp/photogrid/k;->m(Lcom/roidapp/photogrid/k;)Z

    .line 774
    invoke-static {v0}, Lcom/roidapp/photogrid/k;->n(Lcom/roidapp/photogrid/k;)Landroid/support/v4/widget/SwipeRefreshLayout;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-static {v0}, Lcom/roidapp/photogrid/k;->n(Lcom/roidapp/photogrid/k;)Landroid/support/v4/widget/SwipeRefreshLayout;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v4/widget/SwipeRefreshLayout;->isRefreshing()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 775
    invoke-static {v0}, Lcom/roidapp/photogrid/k;->n(Lcom/roidapp/photogrid/k;)Landroid/support/v4/widget/SwipeRefreshLayout;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/support/v4/widget/SwipeRefreshLayout;->setRefreshing(Z)V

    .line 777
    :cond_2
    invoke-virtual {v0}, Lcom/roidapp/photogrid/k;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    instance-of v1, v1, Lcom/roidapp/photogrid/MainPage;

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/k;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    check-cast v1, Lcom/roidapp/photogrid/MainPage;

    iget-boolean v1, v1, Lcom/roidapp/photogrid/MainPage;->a:Z

    if-eqz v1, :cond_0

    .line 778
    invoke-virtual {v0}, Lcom/roidapp/photogrid/k;->v()Lcom/roidapp/cloudlib/sns/i;

    move-result-object v1

    const v2, 0x7f07006b

    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/k;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/roidapp/cloudlib/sns/i;->a(Ljava/lang/String;)V

    goto :goto_0
.end method

.method public final synthetic b(Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 730
    check-cast p1, Lcom/roidapp/cloudlib/sns/b/a/f;

    .line 1783
    if-eqz p1, :cond_0

    .line 1786
    iget-object v0, p0, Lcom/roidapp/photogrid/r;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/k;

    .line 1787
    if-eqz v0, :cond_0

    invoke-static {v0}, Lcom/roidapp/photogrid/k;->o(Lcom/roidapp/photogrid/k;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {v0}, Lcom/roidapp/photogrid/k;->b(Lcom/roidapp/photogrid/k;)Lcom/roidapp/baselib/c/y;

    move-result-object v1

    if-nez v1, :cond_1

    .line 1788
    :cond_0
    :goto_0
    return-void

    .line 1791
    :cond_1
    invoke-static {v0}, Lcom/roidapp/photogrid/k;->b(Lcom/roidapp/photogrid/k;)Lcom/roidapp/baselib/c/y;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/baselib/c/y;->d()Landroid/support/v7/widget/al;

    move-result-object v1

    check-cast v1, Lcom/roidapp/cloudlib/sns/c/a;

    invoke-virtual {v1, p1}, Lcom/roidapp/cloudlib/sns/c/a;->a(Ljava/util/List;)V

    .line 1794
    invoke-static {v0}, Lcom/roidapp/photogrid/k;->c(Lcom/roidapp/photogrid/k;)Landroid/support/v7/widget/RecyclerView;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 1797
    invoke-static {v0}, Lcom/roidapp/photogrid/k;->b(Lcom/roidapp/photogrid/k;)Lcom/roidapp/baselib/c/y;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/baselib/c/y;->c()V

    goto :goto_0
.end method

.method public final synthetic c(Ljava/lang/Object;)V
    .locals 3

    .prologue
    .line 730
    check-cast p1, Lcom/roidapp/cloudlib/sns/b/a/f;

    .line 2739
    if-nez p1, :cond_1

    .line 2740
    const/4 v0, -0x1

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/roidapp/photogrid/r;->b(ILjava/lang/Exception;)V

    .line 2746
    :cond_0
    :goto_0
    return-void

    .line 2744
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/r;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/k;

    .line 2745
    if-eqz v0, :cond_0

    invoke-static {v0}, Lcom/roidapp/photogrid/k;->l(Lcom/roidapp/photogrid/k;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 2748
    invoke-static {v0}, Lcom/roidapp/photogrid/k;->m(Lcom/roidapp/photogrid/k;)Z

    .line 2749
    invoke-static {v0}, Lcom/roidapp/photogrid/k;->n(Lcom/roidapp/photogrid/k;)Landroid/support/v4/widget/SwipeRefreshLayout;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-static {v0}, Lcom/roidapp/photogrid/k;->n(Lcom/roidapp/photogrid/k;)Landroid/support/v4/widget/SwipeRefreshLayout;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v4/widget/SwipeRefreshLayout;->isRefreshing()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 2750
    invoke-static {v0}, Lcom/roidapp/photogrid/k;->n(Lcom/roidapp/photogrid/k;)Landroid/support/v4/widget/SwipeRefreshLayout;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/support/v4/widget/SwipeRefreshLayout;->setRefreshing(Z)V

    .line 2753
    :cond_2
    invoke-static {v0}, Lcom/roidapp/photogrid/k;->b(Lcom/roidapp/photogrid/k;)Lcom/roidapp/baselib/c/y;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 2756
    invoke-static {v0}, Lcom/roidapp/photogrid/k;->b(Lcom/roidapp/photogrid/k;)Lcom/roidapp/baselib/c/y;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/baselib/c/y;->d()Landroid/support/v7/widget/al;

    move-result-object v1

    check-cast v1, Lcom/roidapp/cloudlib/sns/c/a;

    invoke-virtual {v1, p1}, Lcom/roidapp/cloudlib/sns/c/a;->a(Ljava/util/List;)V

    .line 2759
    invoke-static {v0}, Lcom/roidapp/photogrid/k;->c(Lcom/roidapp/photogrid/k;)Landroid/support/v7/widget/RecyclerView;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 2762
    invoke-static {v0}, Lcom/roidapp/photogrid/k;->b(Lcom/roidapp/photogrid/k;)Lcom/roidapp/baselib/c/y;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/baselib/c/y;->c()V

    goto :goto_0
.end method
