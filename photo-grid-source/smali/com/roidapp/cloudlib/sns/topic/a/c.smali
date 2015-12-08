.class final Lcom/roidapp/cloudlib/sns/topic/a/c;
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
.field final synthetic a:Lcom/roidapp/cloudlib/sns/topic/a/b;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/sns/topic/a/b;)V
    .locals 0

    .prologue
    .line 30
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/topic/a/c;->a:Lcom/roidapp/cloudlib/sns/topic/a/b;

    invoke-direct {p0}, Lcom/roidapp/cloudlib/sns/aa;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(ILjava/lang/Exception;)V
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 61
    .line 62
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/topic/a/c;->a:Lcom/roidapp/cloudlib/sns/topic/a/b;

    invoke-static {v1}, Lcom/roidapp/cloudlib/sns/topic/a/b;->b(Lcom/roidapp/cloudlib/sns/topic/a/b;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 63
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/c;->a:Lcom/roidapp/cloudlib/sns/topic/a/b;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/topic/a/b;->u()I

    move-result v0

    .line 64
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/topic/a/c;->a:Lcom/roidapp/cloudlib/sns/topic/a/b;

    invoke-static {v1}, Lcom/roidapp/cloudlib/sns/topic/a/b;->r(Lcom/roidapp/cloudlib/sns/topic/a/b;)Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->a()V

    .line 65
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/topic/a/c;->a:Lcom/roidapp/cloudlib/sns/topic/a/b;

    invoke-static {v1}, Lcom/roidapp/cloudlib/sns/topic/a/b;->s(Lcom/roidapp/cloudlib/sns/topic/a/b;)Lcom/roidapp/cloudlib/sns/o;

    .line 71
    :goto_0
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/topic/a/c;->a:Lcom/roidapp/cloudlib/sns/topic/a/b;

    invoke-virtual {v1}, Lcom/roidapp/cloudlib/sns/topic/a/b;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-static {v1}, Lcom/roidapp/baselib/e/l;->b(Landroid/content/Context;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 72
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/topic/a/c;->a:Lcom/roidapp/cloudlib/sns/topic/a/b;

    sget v2, Lcom/roidapp/cloudlib/at;->aG:I

    invoke-static {v1, v2, v0}, Lcom/roidapp/cloudlib/sns/topic/a/b;->a(Lcom/roidapp/cloudlib/sns/topic/a/b;II)V

    .line 77
    :goto_1
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/c;->a:Lcom/roidapp/cloudlib/sns/topic/a/b;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/topic/a/b;->u(Lcom/roidapp/cloudlib/sns/topic/a/b;)Z

    .line 78
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/c;->a:Lcom/roidapp/cloudlib/sns/topic/a/b;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/topic/a/b;->v(Lcom/roidapp/cloudlib/sns/topic/a/b;)Z

    .line 79
    return-void

    .line 68
    :cond_0
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/topic/a/c;->a:Lcom/roidapp/cloudlib/sns/topic/a/b;

    invoke-static {v1}, Lcom/roidapp/cloudlib/sns/topic/a/b;->t(Lcom/roidapp/cloudlib/sns/topic/a/b;)Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->a(Z)V

    goto :goto_0

    .line 74
    :cond_1
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/topic/a/c;->a:Lcom/roidapp/cloudlib/sns/topic/a/b;

    sget v2, Lcom/roidapp/cloudlib/at;->bc:I

    invoke-static {v1, v2, v0}, Lcom/roidapp/cloudlib/sns/topic/a/b;->b(Lcom/roidapp/cloudlib/sns/topic/a/b;II)V

    goto :goto_1
.end method

.method public final bridge synthetic b(Ljava/lang/Object;)V
    .locals 1

    .prologue
    .line 30
    check-cast p1, Lcom/roidapp/cloudlib/sns/b/a/e;

    .line 1082
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/c;->a:Lcom/roidapp/cloudlib/sns/topic/a/b;

    invoke-static {v0, p1}, Lcom/roidapp/cloudlib/sns/topic/a/b;->b(Lcom/roidapp/cloudlib/sns/topic/a/b;Ljava/lang/Object;)V

    .line 30
    return-void
.end method

.method public final synthetic c(Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 30
    check-cast p1, Lcom/roidapp/cloudlib/sns/b/a/e;

    .line 2032
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/roidapp/cloudlib/sns/b/a/e;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2033
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/c;->a:Lcom/roidapp/cloudlib/sns/topic/a/b;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/topic/a/b;->a(Lcom/roidapp/cloudlib/sns/topic/a/b;)Z

    .line 2035
    :cond_1
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/c;->a:Lcom/roidapp/cloudlib/sns/topic/a/b;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/topic/a/b;->b(Lcom/roidapp/cloudlib/sns/topic/a/b;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 2036
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/c;->a:Lcom/roidapp/cloudlib/sns/topic/a/b;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/topic/a/b;->c(Lcom/roidapp/cloudlib/sns/topic/a/b;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 2037
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/c;->a:Lcom/roidapp/cloudlib/sns/topic/a/b;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/topic/a/b;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    sget v1, Lcom/roidapp/cloudlib/at;->ae:I

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/an;->a(Landroid/content/Context;I)V

    .line 2048
    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/c;->a:Lcom/roidapp/cloudlib/sns/topic/a/b;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/topic/a/b;->l(Lcom/roidapp/cloudlib/sns/topic/a/b;)Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->a()V

    .line 2049
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/c;->a:Lcom/roidapp/cloudlib/sns/topic/a/b;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/topic/a/b;->m(Lcom/roidapp/cloudlib/sns/topic/a/b;)Lcom/roidapp/cloudlib/sns/o;

    .line 2057
    :goto_1
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/c;->a:Lcom/roidapp/cloudlib/sns/topic/a/b;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/topic/a/b;->q(Lcom/roidapp/cloudlib/sns/topic/a/b;)Z

    .line 30
    return-void

    .line 2039
    :cond_3
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/c;->a:Lcom/roidapp/cloudlib/sns/topic/a/b;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/topic/a/b;->d(Lcom/roidapp/cloudlib/sns/topic/a/b;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 2040
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/c;->a:Lcom/roidapp/cloudlib/sns/topic/a/b;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/topic/a/b;->e(Lcom/roidapp/cloudlib/sns/topic/a/b;)I

    .line 2041
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/c;->a:Lcom/roidapp/cloudlib/sns/topic/a/b;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/topic/a/b;->f(Lcom/roidapp/cloudlib/sns/topic/a/b;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/sns/b/a/e;

    invoke-virtual {v0, p1}, Lcom/roidapp/cloudlib/sns/b/a/e;->addAll(Ljava/util/Collection;)Z

    .line 2042
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/c;->a:Lcom/roidapp/cloudlib/sns/topic/a/b;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/topic/a/b;->h(Lcom/roidapp/cloudlib/sns/topic/a/b;)Lcom/roidapp/baselib/c/y;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/baselib/c/y;->d()Landroid/support/v7/widget/al;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/sns/topic/a;

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/topic/a/c;->a:Lcom/roidapp/cloudlib/sns/topic/a/b;

    invoke-static {v1}, Lcom/roidapp/cloudlib/sns/topic/a/b;->g(Lcom/roidapp/cloudlib/sns/topic/a/b;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/topic/a;->b(Ljava/lang/Object;)V

    .line 2043
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/c;->a:Lcom/roidapp/cloudlib/sns/topic/a/b;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/topic/a/b;->i(Lcom/roidapp/cloudlib/sns/topic/a/b;)Lcom/roidapp/baselib/c/y;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/baselib/c/y;->c()V

    .line 2045
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/c;->a:Lcom/roidapp/cloudlib/sns/topic/a/b;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/topic/a/b;->j(Lcom/roidapp/cloudlib/sns/topic/a/b;)Landroid/support/v7/widget/RecyclerView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView;->b()Landroid/support/v7/widget/au;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/GridLayoutManager;

    .line 2046
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/topic/a/c;->a:Lcom/roidapp/cloudlib/sns/topic/a/b;

    invoke-static {v1}, Lcom/roidapp/cloudlib/sns/topic/a/b;->k(Lcom/roidapp/cloudlib/sns/topic/a/b;)Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->d()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/GridLayoutManager;->e(I)V

    goto :goto_0

    .line 2052
    :cond_4
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/c;->a:Lcom/roidapp/cloudlib/sns/topic/a/b;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/topic/a/b;->n(Lcom/roidapp/cloudlib/sns/topic/a/b;)Z

    .line 2053
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/c;->a:Lcom/roidapp/cloudlib/sns/topic/a/b;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/topic/a/b;->o(Lcom/roidapp/cloudlib/sns/topic/a/b;)I

    .line 2054
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/c;->a:Lcom/roidapp/cloudlib/sns/topic/a/b;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/topic/a/b;->p(Lcom/roidapp/cloudlib/sns/topic/a/b;)Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->a(Z)V

    .line 2055
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/c;->a:Lcom/roidapp/cloudlib/sns/topic/a/b;

    invoke-static {v0, p1}, Lcom/roidapp/cloudlib/sns/topic/a/b;->a(Lcom/roidapp/cloudlib/sns/topic/a/b;Ljava/lang/Object;)V

    goto :goto_1
.end method
