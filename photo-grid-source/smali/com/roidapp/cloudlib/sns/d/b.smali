.class final Lcom/roidapp/cloudlib/sns/d/b;
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
.field final synthetic a:Lcom/roidapp/cloudlib/sns/d/a;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/sns/d/a;)V
    .locals 0

    .prologue
    .line 51
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/d/b;->a:Lcom/roidapp/cloudlib/sns/d/a;

    invoke-direct {p0}, Lcom/roidapp/cloudlib/sns/aa;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(ILjava/lang/Exception;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 71
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/d/b;->a:Lcom/roidapp/cloudlib/sns/d/a;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/d/a;->h(Lcom/roidapp/cloudlib/sns/d/a;)Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->setEnabled(Z)V

    .line 72
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/d/b;->a:Lcom/roidapp/cloudlib/sns/d/a;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/d/a;->i(Lcom/roidapp/cloudlib/sns/d/a;)Landroid/widget/ProgressBar;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/ProgressBar;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    .line 73
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/d/b;->a:Lcom/roidapp/cloudlib/sns/d/a;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/d/a;->j(Lcom/roidapp/cloudlib/sns/d/a;)Landroid/widget/ProgressBar;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 75
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/d/b;->a:Lcom/roidapp/cloudlib/sns/d/a;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/d/a;->k(Lcom/roidapp/cloudlib/sns/d/a;)Lcom/roidapp/cloudlib/sns/basepost/bc;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 76
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/d/b;->a:Lcom/roidapp/cloudlib/sns/d/a;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/d/a;->l(Lcom/roidapp/cloudlib/sns/d/a;)Lcom/roidapp/cloudlib/sns/basepost/bc;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/roidapp/cloudlib/sns/basepost/bc;->a(Z)V

    .line 78
    :cond_1
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/d/b;->a:Lcom/roidapp/cloudlib/sns/d/a;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/d/a;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/baselib/e/l;->b(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 79
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/d/b;->a:Lcom/roidapp/cloudlib/sns/d/a;

    sget v1, Lcom/roidapp/cloudlib/at;->aG:I

    invoke-static {v0, v1}, Lcom/roidapp/cloudlib/sns/d/a;->a(Lcom/roidapp/cloudlib/sns/d/a;I)V

    .line 83
    :goto_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/d/b;->a:Lcom/roidapp/cloudlib/sns/d/a;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/d/a;->m(Lcom/roidapp/cloudlib/sns/d/a;)Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->b()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 84
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/d/b;->a:Lcom/roidapp/cloudlib/sns/d/a;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/d/a;->n(Lcom/roidapp/cloudlib/sns/d/a;)Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->a(Z)V

    .line 86
    :cond_2
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/d/b;->a:Lcom/roidapp/cloudlib/sns/d/a;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/d/a;->o(Lcom/roidapp/cloudlib/sns/d/a;)Z

    .line 88
    return-void

    .line 81
    :cond_3
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/d/b;->a:Lcom/roidapp/cloudlib/sns/d/a;

    sget v1, Lcom/roidapp/cloudlib/at;->I:I

    invoke-static {v0, v1}, Lcom/roidapp/cloudlib/sns/d/a;->b(Lcom/roidapp/cloudlib/sns/d/a;I)V

    goto :goto_0
.end method

.method public final synthetic b(Ljava/lang/Object;)V
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 51
    check-cast p1, Lcom/roidapp/cloudlib/sns/b/a/e;

    .line 1091
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/d/b;->a:Lcom/roidapp/cloudlib/sns/d/a;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/d/a;->p(Lcom/roidapp/cloudlib/sns/d/a;)Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->setEnabled(Z)V

    .line 1092
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/d/b;->a:Lcom/roidapp/cloudlib/sns/d/a;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/d/a;->q(Lcom/roidapp/cloudlib/sns/d/a;)Landroid/widget/ProgressBar;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/ProgressBar;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    .line 1093
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/d/b;->a:Lcom/roidapp/cloudlib/sns/d/a;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/d/a;->r(Lcom/roidapp/cloudlib/sns/d/a;)Landroid/widget/ProgressBar;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 1095
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/d/b;->a:Lcom/roidapp/cloudlib/sns/d/a;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/d/a;->s(Lcom/roidapp/cloudlib/sns/d/a;)Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1096
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/d/b;->a:Lcom/roidapp/cloudlib/sns/d/a;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/d/a;->t(Lcom/roidapp/cloudlib/sns/d/a;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 1097
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/d/b;->a:Lcom/roidapp/cloudlib/sns/d/a;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/d/a;->u(Lcom/roidapp/cloudlib/sns/d/a;)Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->a(Z)V

    .line 1100
    :cond_1
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/d/b;->a:Lcom/roidapp/cloudlib/sns/d/a;

    invoke-virtual {v0, p1, v2, v2}, Lcom/roidapp/cloudlib/sns/d/a;->a(Lcom/roidapp/cloudlib/sns/b/a/e;ZZ)V

    .line 1101
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/d/b;->a:Lcom/roidapp/cloudlib/sns/d/a;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/d/a;->v(Lcom/roidapp/cloudlib/sns/d/a;)Z

    .line 1105
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/d/b;->a:Lcom/roidapp/cloudlib/sns/d/a;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/d/a;->w(Lcom/roidapp/cloudlib/sns/d/a;)Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->b()Z

    move-result v0

    if-nez v0, :cond_2

    .line 1106
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/d/b;->a:Lcom/roidapp/cloudlib/sns/d/a;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/d/a;->x(Lcom/roidapp/cloudlib/sns/d/a;)Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->a(Z)V

    .line 51
    :cond_2
    return-void
.end method

.method public final synthetic c(Ljava/lang/Object;)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    const/4 v2, 0x1

    .line 51
    check-cast p1, Lcom/roidapp/cloudlib/sns/b/a/e;

    .line 2054
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/d/b;->a:Lcom/roidapp/cloudlib/sns/d/a;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/d/a;->a(Lcom/roidapp/cloudlib/sns/d/a;)Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->setEnabled(Z)V

    .line 2055
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/d/b;->a:Lcom/roidapp/cloudlib/sns/d/a;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/d/a;->b(Lcom/roidapp/cloudlib/sns/d/a;)Z

    .line 2056
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/d/b;->a:Lcom/roidapp/cloudlib/sns/d/a;

    invoke-static {v0, v3}, Lcom/roidapp/cloudlib/sns/d/a;->a(Lcom/roidapp/cloudlib/sns/d/a;Z)Z

    .line 2057
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/d/b;->a:Lcom/roidapp/cloudlib/sns/d/a;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/d/a;->c(Lcom/roidapp/cloudlib/sns/d/a;)Landroid/widget/ProgressBar;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/ProgressBar;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    .line 2058
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/d/b;->a:Lcom/roidapp/cloudlib/sns/d/a;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/d/a;->d(Lcom/roidapp/cloudlib/sns/d/a;)Landroid/widget/ProgressBar;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 2060
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/d/b;->a:Lcom/roidapp/cloudlib/sns/d/a;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/d/a;->e(Lcom/roidapp/cloudlib/sns/d/a;)Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2061
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/d/b;->a:Lcom/roidapp/cloudlib/sns/d/a;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/d/a;->f(Lcom/roidapp/cloudlib/sns/d/a;)Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->a(Z)V

    .line 2063
    :cond_1
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/d/b;->a:Lcom/roidapp/cloudlib/sns/d/a;

    invoke-virtual {v0, p1, v2, v2}, Lcom/roidapp/cloudlib/sns/d/a;->a(Lcom/roidapp/cloudlib/sns/b/a/e;ZZ)V

    .line 2064
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/d/b;->a:Lcom/roidapp/cloudlib/sns/d/a;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/d/a;->g(Lcom/roidapp/cloudlib/sns/d/a;)Z

    .line 51
    return-void
.end method
