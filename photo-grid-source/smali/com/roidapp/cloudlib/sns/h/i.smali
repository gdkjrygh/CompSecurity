.class final Lcom/roidapp/cloudlib/sns/h/i;
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
.field final synthetic a:Lcom/roidapp/cloudlib/sns/h/h;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/sns/h/h;)V
    .locals 0

    .prologue
    .line 295
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/h/i;->a:Lcom/roidapp/cloudlib/sns/h/h;

    invoke-direct {p0}, Lcom/roidapp/cloudlib/sns/aa;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(ILjava/lang/Exception;)V
    .locals 2

    .prologue
    .line 319
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/i;->a:Lcom/roidapp/cloudlib/sns/h/h;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/h/h;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    if-nez v0, :cond_0

    .line 330
    :goto_0
    return-void

    .line 322
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/i;->a:Lcom/roidapp/cloudlib/sns/h/h;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/h/h;->k(Lcom/roidapp/cloudlib/sns/h/h;)Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 323
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/i;->a:Lcom/roidapp/cloudlib/sns/h/h;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/h/h;->l(Lcom/roidapp/cloudlib/sns/h/h;)Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->a()V

    .line 324
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/i;->a:Lcom/roidapp/cloudlib/sns/h/h;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/h/h;->m(Lcom/roidapp/cloudlib/sns/h/h;)Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->setEnabled(Z)V

    .line 325
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/i;->a:Lcom/roidapp/cloudlib/sns/h/h;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/h/h;->n(Lcom/roidapp/cloudlib/sns/h/h;)Z

    .line 327
    :cond_1
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/i;->a:Lcom/roidapp/cloudlib/sns/h/h;

    sget v1, Lcom/roidapp/cloudlib/at;->aG:I

    invoke-static {v0, v1}, Lcom/roidapp/cloudlib/sns/h/h;->a(Lcom/roidapp/cloudlib/sns/h/h;I)V

    .line 328
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/i;->a:Lcom/roidapp/cloudlib/sns/h/h;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/h/h;->o(Lcom/roidapp/cloudlib/sns/h/h;)Lcom/roidapp/cloudlib/sns/basepost/bc;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/basepost/bc;->e()V

    .line 329
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/i;->a:Lcom/roidapp/cloudlib/sns/h/h;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/h/h;->j(Lcom/roidapp/cloudlib/sns/h/h;)Lcom/roidapp/cloudlib/sns/o;

    goto :goto_0
.end method

.method public final synthetic c(Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 295
    check-cast p1, Lcom/roidapp/cloudlib/sns/b/a/e;

    .line 1298
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/i;->a:Lcom/roidapp/cloudlib/sns/h/h;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/h/h;->a(Lcom/roidapp/cloudlib/sns/h/h;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1301
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/i;->a:Lcom/roidapp/cloudlib/sns/h/h;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/h/h;->b(Lcom/roidapp/cloudlib/sns/h/h;)Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1302
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/i;->a:Lcom/roidapp/cloudlib/sns/h/h;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/h/h;->c(Lcom/roidapp/cloudlib/sns/h/h;)Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->a()V

    .line 1303
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/i;->a:Lcom/roidapp/cloudlib/sns/h/h;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/h/h;->d(Lcom/roidapp/cloudlib/sns/h/h;)Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->setEnabled(Z)V

    .line 1304
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/i;->a:Lcom/roidapp/cloudlib/sns/h/h;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/h/h;->e(Lcom/roidapp/cloudlib/sns/h/h;)Z

    .line 1306
    :cond_0
    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lcom/roidapp/cloudlib/sns/b/a/e;->size()I

    move-result v0

    const/16 v1, 0xa

    if-ge v0, v1, :cond_2

    .line 1307
    :cond_1
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/i;->a:Lcom/roidapp/cloudlib/sns/h/h;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/h/h;->f(Lcom/roidapp/cloudlib/sns/h/h;)Z

    .line 1309
    :cond_2
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/i;->a:Lcom/roidapp/cloudlib/sns/h/h;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/h/h;->g(Lcom/roidapp/cloudlib/sns/h/h;)Lcom/roidapp/cloudlib/sns/basepost/bc;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/roidapp/cloudlib/sns/basepost/bc;->a(Lcom/roidapp/cloudlib/sns/b/a/e;)V

    .line 1311
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/i;->a:Lcom/roidapp/cloudlib/sns/h/h;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/h/h;->h(Lcom/roidapp/cloudlib/sns/h/h;)Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->b()Landroid/support/v7/widget/au;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/LinearLayoutManager;

    .line 1312
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/h/i;->a:Lcom/roidapp/cloudlib/sns/h/h;

    invoke-static {v1}, Lcom/roidapp/cloudlib/sns/h/h;->i(Lcom/roidapp/cloudlib/sns/h/h;)Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->d()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/LinearLayoutManager;->e(I)V

    .line 1314
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/i;->a:Lcom/roidapp/cloudlib/sns/h/h;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/h/h;->j(Lcom/roidapp/cloudlib/sns/h/h;)Lcom/roidapp/cloudlib/sns/o;

    .line 295
    :cond_3
    return-void
.end method
