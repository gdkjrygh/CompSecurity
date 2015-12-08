.class final Lcom/roidapp/cloudlib/sns/topic/j;
.super Lcom/roidapp/cloudlib/sns/aa;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/roidapp/cloudlib/sns/aa",
        "<",
        "Lcom/roidapp/cloudlib/sns/b/w;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/roidapp/cloudlib/sns/topic/i;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/sns/topic/i;)V
    .locals 0

    .prologue
    .line 30
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/topic/j;->a:Lcom/roidapp/cloudlib/sns/topic/i;

    invoke-direct {p0}, Lcom/roidapp/cloudlib/sns/aa;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(ILjava/lang/Exception;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 58
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/j;->a:Lcom/roidapp/cloudlib/sns/topic/i;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/topic/i;->j(Lcom/roidapp/cloudlib/sns/topic/i;)Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->a(Z)V

    .line 59
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/j;->a:Lcom/roidapp/cloudlib/sns/topic/i;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/topic/i;->k(Lcom/roidapp/cloudlib/sns/topic/i;)Landroid/widget/ProgressBar;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 61
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/j;->a:Lcom/roidapp/cloudlib/sns/topic/i;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/topic/i;->l(Lcom/roidapp/cloudlib/sns/topic/i;)Lcom/roidapp/cloudlib/sns/basepost/bc;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 62
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/j;->a:Lcom/roidapp/cloudlib/sns/topic/i;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/topic/i;->m(Lcom/roidapp/cloudlib/sns/topic/i;)Lcom/roidapp/cloudlib/sns/basepost/bc;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/roidapp/cloudlib/sns/basepost/bc;->a(Z)V

    .line 64
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/j;->a:Lcom/roidapp/cloudlib/sns/topic/i;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/topic/i;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/baselib/e/l;->b(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 65
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/j;->a:Lcom/roidapp/cloudlib/sns/topic/i;

    sget v1, Lcom/roidapp/cloudlib/at;->aG:I

    invoke-static {v0, v1}, Lcom/roidapp/cloudlib/sns/topic/i;->a(Lcom/roidapp/cloudlib/sns/topic/i;I)V

    .line 70
    :goto_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/j;->a:Lcom/roidapp/cloudlib/sns/topic/i;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/topic/i;->n(Lcom/roidapp/cloudlib/sns/topic/i;)Z

    .line 71
    return-void

    .line 67
    :cond_1
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/j;->a:Lcom/roidapp/cloudlib/sns/topic/i;

    sget v1, Lcom/roidapp/cloudlib/at;->I:I

    invoke-static {v0, v1}, Lcom/roidapp/cloudlib/sns/topic/i;->b(Lcom/roidapp/cloudlib/sns/topic/i;I)V

    goto :goto_0
.end method

.method public final synthetic b(Ljava/lang/Object;)V
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 30
    check-cast p1, Lcom/roidapp/cloudlib/sns/b/w;

    .line 1074
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/j;->a:Lcom/roidapp/cloudlib/sns/topic/i;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/topic/i;->o(Lcom/roidapp/cloudlib/sns/topic/i;)Landroid/widget/ProgressBar;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 1076
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/j;->a:Lcom/roidapp/cloudlib/sns/topic/i;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/topic/i;->p(Lcom/roidapp/cloudlib/sns/topic/i;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1077
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/j;->a:Lcom/roidapp/cloudlib/sns/topic/i;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/topic/i;->q(Lcom/roidapp/cloudlib/sns/topic/i;)Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->a(Z)V

    .line 1080
    :cond_0
    if-eqz p1, :cond_2

    .line 1081
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/j;->a:Lcom/roidapp/cloudlib/sns/topic/i;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/topic/i;->r(Lcom/roidapp/cloudlib/sns/topic/i;)Lcom/roidapp/cloudlib/sns/b/a/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/b/a/e;->clear()V

    .line 1082
    iget-object v0, p1, Lcom/roidapp/cloudlib/sns/b/w;->b:Lcom/roidapp/cloudlib/sns/b/a/e;

    if-eqz v0, :cond_1

    .line 1083
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/j;->a:Lcom/roidapp/cloudlib/sns/topic/i;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/topic/i;->s(Lcom/roidapp/cloudlib/sns/topic/i;)Lcom/roidapp/cloudlib/sns/b/a/e;

    move-result-object v0

    iget-object v1, p1, Lcom/roidapp/cloudlib/sns/b/w;->b:Lcom/roidapp/cloudlib/sns/b/a/e;

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/b/a/e;->addAll(Ljava/util/Collection;)Z

    .line 1085
    :cond_1
    iget-object v0, p1, Lcom/roidapp/cloudlib/sns/b/w;->c:Lcom/roidapp/cloudlib/sns/b/a/e;

    if-eqz v0, :cond_2

    .line 1086
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/j;->a:Lcom/roidapp/cloudlib/sns/topic/i;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/topic/i;->t(Lcom/roidapp/cloudlib/sns/topic/i;)Lcom/roidapp/cloudlib/sns/b/a/e;

    move-result-object v0

    iget-object v1, p1, Lcom/roidapp/cloudlib/sns/b/w;->c:Lcom/roidapp/cloudlib/sns/b/a/e;

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/b/a/e;->addAll(Ljava/util/Collection;)Z

    .line 1089
    :cond_2
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/j;->a:Lcom/roidapp/cloudlib/sns/topic/i;

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/topic/j;->a:Lcom/roidapp/cloudlib/sns/topic/i;

    invoke-static {v1}, Lcom/roidapp/cloudlib/sns/topic/i;->u(Lcom/roidapp/cloudlib/sns/topic/i;)Lcom/roidapp/cloudlib/sns/b/a/e;

    move-result-object v1

    invoke-virtual {v0, v1, v2, v2}, Lcom/roidapp/cloudlib/sns/topic/i;->a(Lcom/roidapp/cloudlib/sns/b/a/e;ZZ)V

    .line 30
    return-void
.end method

.method public final synthetic c(Ljava/lang/Object;)V
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 30
    check-cast p1, Lcom/roidapp/cloudlib/sns/b/w;

    .line 2033
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/j;->a:Lcom/roidapp/cloudlib/sns/topic/i;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/topic/i;->a(Lcom/roidapp/cloudlib/sns/topic/i;)Landroid/widget/ProgressBar;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 2034
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/j;->a:Lcom/roidapp/cloudlib/sns/topic/i;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/topic/i;->b(Lcom/roidapp/cloudlib/sns/topic/i;)Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->a(Z)V

    .line 2036
    if-eqz p1, :cond_2

    .line 2037
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/j;->a:Lcom/roidapp/cloudlib/sns/topic/i;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/topic/i;->c(Lcom/roidapp/cloudlib/sns/topic/i;)Lcom/roidapp/cloudlib/sns/b/a/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/b/a/e;->clear()V

    .line 2039
    iget-object v0, p1, Lcom/roidapp/cloudlib/sns/b/w;->b:Lcom/roidapp/cloudlib/sns/b/a/e;

    if-eqz v0, :cond_0

    iget-object v0, p1, Lcom/roidapp/cloudlib/sns/b/w;->b:Lcom/roidapp/cloudlib/sns/b/a/e;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/b/a/e;->size()I

    move-result v0

    const/4 v1, 0x5

    if-ne v0, v1, :cond_0

    .line 2040
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/j;->a:Lcom/roidapp/cloudlib/sns/topic/i;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/topic/i;->d(Lcom/roidapp/cloudlib/sns/topic/i;)Lcom/roidapp/cloudlib/sns/b/a/e;

    move-result-object v0

    iget-object v1, p1, Lcom/roidapp/cloudlib/sns/b/w;->b:Lcom/roidapp/cloudlib/sns/b/a/e;

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/b/a/e;->addAll(Ljava/util/Collection;)Z

    .line 2042
    :cond_0
    iget-object v0, p1, Lcom/roidapp/cloudlib/sns/b/w;->c:Lcom/roidapp/cloudlib/sns/b/a/e;

    if-eqz v0, :cond_1

    .line 2043
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/j;->a:Lcom/roidapp/cloudlib/sns/topic/i;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/topic/i;->e(Lcom/roidapp/cloudlib/sns/topic/i;)Lcom/roidapp/cloudlib/sns/b/a/e;

    move-result-object v0

    iget-object v1, p1, Lcom/roidapp/cloudlib/sns/b/w;->c:Lcom/roidapp/cloudlib/sns/b/a/e;

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/b/a/e;->addAll(Ljava/util/Collection;)Z

    .line 2046
    :cond_1
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/j;->a:Lcom/roidapp/cloudlib/sns/topic/i;

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/topic/j;->a:Lcom/roidapp/cloudlib/sns/topic/i;

    invoke-static {v1}, Lcom/roidapp/cloudlib/sns/topic/i;->f(Lcom/roidapp/cloudlib/sns/topic/i;)Lcom/roidapp/cloudlib/sns/b/a/e;

    move-result-object v1

    invoke-virtual {v0, v1, v3, v3}, Lcom/roidapp/cloudlib/sns/topic/i;->a(Lcom/roidapp/cloudlib/sns/b/a/e;ZZ)V

    .line 2051
    :goto_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/j;->a:Lcom/roidapp/cloudlib/sns/topic/i;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/topic/i;->h(Lcom/roidapp/cloudlib/sns/topic/i;)Z

    .line 2052
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/j;->a:Lcom/roidapp/cloudlib/sns/topic/i;

    invoke-static {v0, v2}, Lcom/roidapp/cloudlib/sns/topic/i;->a(Lcom/roidapp/cloudlib/sns/topic/i;Z)Z

    .line 2053
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/j;->a:Lcom/roidapp/cloudlib/sns/topic/i;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/topic/i;->i(Lcom/roidapp/cloudlib/sns/topic/i;)Z

    .line 30
    return-void

    .line 2048
    :cond_2
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/j;->a:Lcom/roidapp/cloudlib/sns/topic/i;

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/topic/j;->a:Lcom/roidapp/cloudlib/sns/topic/i;

    invoke-static {v1}, Lcom/roidapp/cloudlib/sns/topic/i;->g(Lcom/roidapp/cloudlib/sns/topic/i;)Lcom/roidapp/cloudlib/sns/b/a/e;

    move-result-object v1

    invoke-virtual {v0, v1, v3, v2}, Lcom/roidapp/cloudlib/sns/topic/i;->a(Lcom/roidapp/cloudlib/sns/b/a/e;ZZ)V

    goto :goto_0
.end method
