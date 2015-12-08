.class final Lcom/roidapp/cloudlib/sns/d/g;
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
.field final synthetic a:Lcom/roidapp/cloudlib/sns/d/f;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/sns/d/f;)V
    .locals 0

    .prologue
    .line 36
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/d/g;->a:Lcom/roidapp/cloudlib/sns/d/f;

    invoke-direct {p0}, Lcom/roidapp/cloudlib/sns/aa;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(ILjava/lang/Exception;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 55
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/d/g;->a:Lcom/roidapp/cloudlib/sns/d/f;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/d/f;->h(Lcom/roidapp/cloudlib/sns/d/f;)Landroid/widget/ProgressBar;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/ProgressBar;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    .line 56
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/d/g;->a:Lcom/roidapp/cloudlib/sns/d/f;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/d/f;->i(Lcom/roidapp/cloudlib/sns/d/f;)Landroid/widget/ProgressBar;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 58
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/d/g;->a:Lcom/roidapp/cloudlib/sns/d/f;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/d/f;->j(Lcom/roidapp/cloudlib/sns/d/f;)Lcom/roidapp/cloudlib/sns/basepost/bc;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 59
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/d/g;->a:Lcom/roidapp/cloudlib/sns/d/f;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/d/f;->k(Lcom/roidapp/cloudlib/sns/d/f;)Lcom/roidapp/cloudlib/sns/basepost/bc;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/roidapp/cloudlib/sns/basepost/bc;->a(Z)V

    .line 61
    :cond_1
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/d/g;->a:Lcom/roidapp/cloudlib/sns/d/f;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/d/f;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/baselib/e/l;->b(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 62
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/d/g;->a:Lcom/roidapp/cloudlib/sns/d/f;

    sget v1, Lcom/roidapp/cloudlib/at;->aG:I

    invoke-static {v0, v1}, Lcom/roidapp/cloudlib/sns/d/f;->a(Lcom/roidapp/cloudlib/sns/d/f;I)V

    .line 66
    :goto_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/d/g;->a:Lcom/roidapp/cloudlib/sns/d/f;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/d/f;->l(Lcom/roidapp/cloudlib/sns/d/f;)Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->b()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 67
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/d/g;->a:Lcom/roidapp/cloudlib/sns/d/f;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/d/f;->m(Lcom/roidapp/cloudlib/sns/d/f;)Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->a(Z)V

    .line 69
    :cond_2
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/d/g;->a:Lcom/roidapp/cloudlib/sns/d/f;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/d/f;->n(Lcom/roidapp/cloudlib/sns/d/f;)Z

    .line 72
    return-void

    .line 64
    :cond_3
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/d/g;->a:Lcom/roidapp/cloudlib/sns/d/f;

    sget v1, Lcom/roidapp/cloudlib/at;->t:I

    invoke-static {v0, v1}, Lcom/roidapp/cloudlib/sns/d/f;->b(Lcom/roidapp/cloudlib/sns/d/f;I)V

    goto :goto_0
.end method

.method public final synthetic b(Ljava/lang/Object;)V
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 36
    check-cast p1, Lcom/roidapp/cloudlib/sns/b/a/e;

    .line 1076
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/d/g;->a:Lcom/roidapp/cloudlib/sns/d/f;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/d/f;->o(Lcom/roidapp/cloudlib/sns/d/f;)Landroid/widget/ProgressBar;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/ProgressBar;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    .line 1077
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/d/g;->a:Lcom/roidapp/cloudlib/sns/d/f;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/d/f;->p(Lcom/roidapp/cloudlib/sns/d/f;)Landroid/widget/ProgressBar;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 1079
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/d/g;->a:Lcom/roidapp/cloudlib/sns/d/f;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/d/f;->q(Lcom/roidapp/cloudlib/sns/d/f;)Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1080
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/d/g;->a:Lcom/roidapp/cloudlib/sns/d/f;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/d/f;->r(Lcom/roidapp/cloudlib/sns/d/f;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 1081
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/d/g;->a:Lcom/roidapp/cloudlib/sns/d/f;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/d/f;->s(Lcom/roidapp/cloudlib/sns/d/f;)Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->a(Z)V

    .line 1084
    :cond_1
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/d/g;->a:Lcom/roidapp/cloudlib/sns/d/f;

    invoke-virtual {v0, p1, v2, v2}, Lcom/roidapp/cloudlib/sns/d/f;->a(Lcom/roidapp/cloudlib/sns/b/a/e;ZZ)V

    .line 1085
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/d/g;->a:Lcom/roidapp/cloudlib/sns/d/f;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/d/f;->t(Lcom/roidapp/cloudlib/sns/d/f;)Z

    .line 36
    return-void
.end method

.method public final synthetic c(Ljava/lang/Object;)V
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 36
    check-cast p1, Lcom/roidapp/cloudlib/sns/b/a/e;

    .line 2039
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/d/g;->a:Lcom/roidapp/cloudlib/sns/d/f;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/d/f;->a(Lcom/roidapp/cloudlib/sns/d/f;)Z

    .line 2040
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/d/g;->a:Lcom/roidapp/cloudlib/sns/d/f;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/d/f;->b(Lcom/roidapp/cloudlib/sns/d/f;)Z

    .line 2041
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/d/g;->a:Lcom/roidapp/cloudlib/sns/d/f;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/d/f;->c(Lcom/roidapp/cloudlib/sns/d/f;)Landroid/widget/ProgressBar;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/ProgressBar;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    .line 2042
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/d/g;->a:Lcom/roidapp/cloudlib/sns/d/f;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/d/f;->d(Lcom/roidapp/cloudlib/sns/d/f;)Landroid/widget/ProgressBar;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 2044
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/d/g;->a:Lcom/roidapp/cloudlib/sns/d/f;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/d/f;->e(Lcom/roidapp/cloudlib/sns/d/f;)Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2045
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/d/g;->a:Lcom/roidapp/cloudlib/sns/d/f;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/d/f;->f(Lcom/roidapp/cloudlib/sns/d/f;)Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->a(Z)V

    .line 2047
    :cond_1
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/d/g;->a:Lcom/roidapp/cloudlib/sns/d/f;

    invoke-virtual {v0, p1, v2, v2}, Lcom/roidapp/cloudlib/sns/d/f;->a(Lcom/roidapp/cloudlib/sns/b/a/e;ZZ)V

    .line 2048
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/d/g;->a:Lcom/roidapp/cloudlib/sns/d/f;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/d/f;->g(Lcom/roidapp/cloudlib/sns/d/f;)Z

    .line 36
    return-void
.end method
