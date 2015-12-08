.class final Lcom/roidapp/cloudlib/sns/topic/a/f;
.super Lcom/roidapp/cloudlib/sns/aa;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/roidapp/cloudlib/sns/aa",
        "<",
        "Lcom/roidapp/cloudlib/sns/b/a/e;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/roidapp/cloudlib/sns/topic/a/e;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/sns/topic/a/e;)V
    .locals 0

    .prologue
    .line 30
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/topic/a/f;->a:Lcom/roidapp/cloudlib/sns/topic/a/e;

    invoke-direct {p0}, Lcom/roidapp/cloudlib/sns/aa;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(ILjava/lang/Exception;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 64
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/f;->a:Lcom/roidapp/cloudlib/sns/topic/a/e;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/topic/a/e;->m(Lcom/roidapp/cloudlib/sns/topic/a/e;)Landroid/widget/ProgressBar;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 65
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/f;->a:Lcom/roidapp/cloudlib/sns/topic/a/e;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/topic/a/e;->b(Lcom/roidapp/cloudlib/sns/topic/a/e;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 66
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/f;->a:Lcom/roidapp/cloudlib/sns/topic/a/e;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/topic/a/e;->n(Lcom/roidapp/cloudlib/sns/topic/a/e;)Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->a()V

    .line 67
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/f;->a:Lcom/roidapp/cloudlib/sns/topic/a/e;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/topic/a/e;->i(Lcom/roidapp/cloudlib/sns/topic/a/e;)Lcom/roidapp/cloudlib/sns/o;

    .line 73
    :goto_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/f;->a:Lcom/roidapp/cloudlib/sns/topic/a/e;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/topic/a/e;->p(Lcom/roidapp/cloudlib/sns/topic/a/e;)Lcom/roidapp/cloudlib/sns/basepost/bc;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 74
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/f;->a:Lcom/roidapp/cloudlib/sns/topic/a/e;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/topic/a/e;->b(Lcom/roidapp/cloudlib/sns/topic/a/e;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 75
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/f;->a:Lcom/roidapp/cloudlib/sns/topic/a/e;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/topic/a/e;->q(Lcom/roidapp/cloudlib/sns/topic/a/e;)Lcom/roidapp/cloudlib/sns/basepost/bc;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/basepost/bc;->e()V

    .line 82
    :cond_0
    :goto_1
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/f;->a:Lcom/roidapp/cloudlib/sns/topic/a/e;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/topic/a/e;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/baselib/e/l;->b(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 83
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/f;->a:Lcom/roidapp/cloudlib/sns/topic/a/e;

    sget v1, Lcom/roidapp/cloudlib/at;->aG:I

    invoke-static {v0, v1}, Lcom/roidapp/cloudlib/sns/topic/a/e;->a(Lcom/roidapp/cloudlib/sns/topic/a/e;I)V

    .line 89
    :goto_2
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/f;->a:Lcom/roidapp/cloudlib/sns/topic/a/e;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/topic/a/e;->s(Lcom/roidapp/cloudlib/sns/topic/a/e;)Z

    .line 90
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/f;->a:Lcom/roidapp/cloudlib/sns/topic/a/e;

    invoke-static {v0, v2}, Lcom/roidapp/cloudlib/sns/topic/a/e;->a(Lcom/roidapp/cloudlib/sns/topic/a/e;Z)Z

    .line 91
    return-void

    .line 70
    :cond_1
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/f;->a:Lcom/roidapp/cloudlib/sns/topic/a/e;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/topic/a/e;->o(Lcom/roidapp/cloudlib/sns/topic/a/e;)Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->a(Z)V

    goto :goto_0

    .line 78
    :cond_2
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/f;->a:Lcom/roidapp/cloudlib/sns/topic/a/e;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/topic/a/e;->r(Lcom/roidapp/cloudlib/sns/topic/a/e;)Lcom/roidapp/cloudlib/sns/basepost/bc;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/roidapp/cloudlib/sns/basepost/bc;->a(Z)V

    goto :goto_1

    .line 86
    :cond_3
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/f;->a:Lcom/roidapp/cloudlib/sns/topic/a/e;

    sget v1, Lcom/roidapp/cloudlib/at;->bb:I

    invoke-static {v0, v1}, Lcom/roidapp/cloudlib/sns/topic/a/e;->b(Lcom/roidapp/cloudlib/sns/topic/a/e;I)V

    goto :goto_2
.end method

.method public final synthetic b(Ljava/lang/Object;)V
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 30
    check-cast p1, Lcom/roidapp/cloudlib/sns/b/a/e;

    .line 1094
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/f;->a:Lcom/roidapp/cloudlib/sns/topic/a/e;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/topic/a/e;->t(Lcom/roidapp/cloudlib/sns/topic/a/e;)Landroid/widget/ProgressBar;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 1095
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/f;->a:Lcom/roidapp/cloudlib/sns/topic/a/e;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/topic/a/e;->u(Lcom/roidapp/cloudlib/sns/topic/a/e;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1096
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/f;->a:Lcom/roidapp/cloudlib/sns/topic/a/e;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/topic/a/e;->v(Lcom/roidapp/cloudlib/sns/topic/a/e;)Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->a(Z)V

    .line 1098
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/f;->a:Lcom/roidapp/cloudlib/sns/topic/a/e;

    invoke-virtual {v0, p1, v2, v2}, Lcom/roidapp/cloudlib/sns/topic/a/e;->a(Lcom/roidapp/cloudlib/sns/b/a/e;ZZ)V

    .line 30
    return-void
.end method

.method public final synthetic c(Ljava/lang/Object;)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    const/4 v2, 0x1

    .line 30
    check-cast p1, Lcom/roidapp/cloudlib/sns/b/a/e;

    .line 2033
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/f;->a:Lcom/roidapp/cloudlib/sns/topic/a/e;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/topic/a/e;->a(Lcom/roidapp/cloudlib/sns/topic/a/e;)Landroid/widget/ProgressBar;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 2035
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/roidapp/cloudlib/sns/b/a/e;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2036
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/f;->a:Lcom/roidapp/cloudlib/sns/topic/a/e;

    invoke-static {v0, v2}, Lcom/roidapp/cloudlib/sns/topic/a/e;->a(Lcom/roidapp/cloudlib/sns/topic/a/e;Z)Z

    .line 2038
    :cond_1
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/f;->a:Lcom/roidapp/cloudlib/sns/topic/a/e;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/topic/a/e;->b(Lcom/roidapp/cloudlib/sns/topic/a/e;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 2039
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/f;->a:Lcom/roidapp/cloudlib/sns/topic/a/e;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/topic/a/e;->c(Lcom/roidapp/cloudlib/sns/topic/a/e;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 2040
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/f;->a:Lcom/roidapp/cloudlib/sns/topic/a/e;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/topic/a/e;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    sget v1, Lcom/roidapp/cloudlib/at;->ae:I

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/an;->a(Landroid/content/Context;I)V

    .line 2049
    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/f;->a:Lcom/roidapp/cloudlib/sns/topic/a/e;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/topic/a/e;->h(Lcom/roidapp/cloudlib/sns/topic/a/e;)Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->a()V

    .line 2050
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/f;->a:Lcom/roidapp/cloudlib/sns/topic/a/e;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/topic/a/e;->i(Lcom/roidapp/cloudlib/sns/topic/a/e;)Lcom/roidapp/cloudlib/sns/o;

    .line 2058
    :goto_1
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/f;->a:Lcom/roidapp/cloudlib/sns/topic/a/e;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/topic/a/e;->k(Lcom/roidapp/cloudlib/sns/topic/a/e;)Z

    .line 2059
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/f;->a:Lcom/roidapp/cloudlib/sns/topic/a/e;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/topic/a/e;->l(Lcom/roidapp/cloudlib/sns/topic/a/e;)Z

    .line 30
    return-void

    .line 2042
    :cond_3
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/f;->a:Lcom/roidapp/cloudlib/sns/topic/a/e;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/topic/a/e;->d(Lcom/roidapp/cloudlib/sns/topic/a/e;)Lcom/roidapp/cloudlib/sns/basepost/bc;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 2043
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/f;->a:Lcom/roidapp/cloudlib/sns/topic/a/e;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/topic/a/e;->e(Lcom/roidapp/cloudlib/sns/topic/a/e;)Lcom/roidapp/cloudlib/sns/basepost/bc;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/roidapp/cloudlib/sns/basepost/bc;->a(Lcom/roidapp/cloudlib/sns/b/a/e;)V

    .line 2045
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/f;->a:Lcom/roidapp/cloudlib/sns/topic/a/e;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/topic/a/e;->f(Lcom/roidapp/cloudlib/sns/topic/a/e;)Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->b()Landroid/support/v7/widget/au;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/LinearLayoutManager;

    .line 2046
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/topic/a/f;->a:Lcom/roidapp/cloudlib/sns/topic/a/e;

    invoke-static {v1}, Lcom/roidapp/cloudlib/sns/topic/a/e;->g(Lcom/roidapp/cloudlib/sns/topic/a/e;)Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->d()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/LinearLayoutManager;->e(I)V

    goto :goto_0

    .line 2053
    :cond_4
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/f;->a:Lcom/roidapp/cloudlib/sns/topic/a/e;

    invoke-static {v0, v3}, Lcom/roidapp/cloudlib/sns/topic/a/e;->a(Lcom/roidapp/cloudlib/sns/topic/a/e;Z)Z

    .line 2054
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/f;->a:Lcom/roidapp/cloudlib/sns/topic/a/e;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/topic/a/e;->j(Lcom/roidapp/cloudlib/sns/topic/a/e;)Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->a(Z)V

    .line 2055
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/f;->a:Lcom/roidapp/cloudlib/sns/topic/a/e;

    invoke-virtual {v0, p1, v2, v2}, Lcom/roidapp/cloudlib/sns/topic/a/e;->a(Lcom/roidapp/cloudlib/sns/b/a/e;ZZ)V

    goto :goto_1
.end method
