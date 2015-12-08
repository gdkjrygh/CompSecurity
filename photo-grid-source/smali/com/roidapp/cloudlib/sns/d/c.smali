.class final Lcom/roidapp/cloudlib/sns/d/c;
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
    .line 261
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/d/c;->a:Lcom/roidapp/cloudlib/sns/d/a;

    invoke-direct {p0}, Lcom/roidapp/cloudlib/sns/aa;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(ILjava/lang/Exception;)V
    .locals 2

    .prologue
    .line 287
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/d/c;->a:Lcom/roidapp/cloudlib/sns/d/a;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/d/a;->F(Lcom/roidapp/cloudlib/sns/d/a;)Lcom/roidapp/cloudlib/sns/basepost/bc;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/basepost/bc;->e()V

    .line 288
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/d/c;->a:Lcom/roidapp/cloudlib/sns/d/a;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/d/a;->z(Lcom/roidapp/cloudlib/sns/d/a;)Lcom/roidapp/cloudlib/sns/o;

    .line 289
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/d/c;->a:Lcom/roidapp/cloudlib/sns/d/a;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/d/a;->G(Lcom/roidapp/cloudlib/sns/d/a;)Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 290
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/d/c;->a:Lcom/roidapp/cloudlib/sns/d/a;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/d/a;->H(Lcom/roidapp/cloudlib/sns/d/a;)Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->a()V

    .line 292
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/d/c;->a:Lcom/roidapp/cloudlib/sns/d/a;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/d/a;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/baselib/e/l;->b(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 293
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/d/c;->a:Lcom/roidapp/cloudlib/sns/d/a;

    sget v1, Lcom/roidapp/cloudlib/at;->aG:I

    invoke-static {v0, v1}, Lcom/roidapp/cloudlib/sns/d/a;->c(Lcom/roidapp/cloudlib/sns/d/a;I)V

    .line 295
    :cond_1
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/d/c;->a:Lcom/roidapp/cloudlib/sns/d/a;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/d/a;->I(Lcom/roidapp/cloudlib/sns/d/a;)Z

    .line 296
    return-void
.end method

.method public final synthetic c(Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 261
    check-cast p1, Lcom/roidapp/cloudlib/sns/b/a/e;

    .line 1264
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/roidapp/cloudlib/sns/b/a/e;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1265
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/d/c;->a:Lcom/roidapp/cloudlib/sns/d/a;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/roidapp/cloudlib/sns/d/a;->a(Lcom/roidapp/cloudlib/sns/d/a;Z)Z

    .line 1266
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/d/c;->a:Lcom/roidapp/cloudlib/sns/d/a;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/d/a;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    sget v1, Lcom/roidapp/cloudlib/at;->ae:I

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/an;->a(Landroid/content/Context;I)V

    .line 1269
    :cond_1
    invoke-static {p1}, Lcom/roidapp/cloudlib/sns/d/a;->a(Lcom/roidapp/cloudlib/sns/b/a/e;)Lcom/roidapp/cloudlib/sns/b/a/e;

    move-result-object v0

    .line 1271
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/d/c;->a:Lcom/roidapp/cloudlib/sns/d/a;

    invoke-static {v1}, Lcom/roidapp/cloudlib/sns/d/a;->y(Lcom/roidapp/cloudlib/sns/d/a;)Lcom/roidapp/cloudlib/sns/basepost/bc;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/roidapp/cloudlib/sns/basepost/bc;->a(Lcom/roidapp/cloudlib/sns/b/a/e;)V

    .line 1272
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/d/c;->a:Lcom/roidapp/cloudlib/sns/d/a;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/d/a;->z(Lcom/roidapp/cloudlib/sns/d/a;)Lcom/roidapp/cloudlib/sns/o;

    .line 1274
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/d/c;->a:Lcom/roidapp/cloudlib/sns/d/a;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/d/a;->A(Lcom/roidapp/cloudlib/sns/d/a;)Z

    .line 1276
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/d/c;->a:Lcom/roidapp/cloudlib/sns/d/a;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/d/a;->B(Lcom/roidapp/cloudlib/sns/d/a;)Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->b()Landroid/support/v7/widget/au;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/LinearLayoutManager;

    .line 1279
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/d/c;->a:Lcom/roidapp/cloudlib/sns/d/a;

    invoke-static {v1}, Lcom/roidapp/cloudlib/sns/d/a;->C(Lcom/roidapp/cloudlib/sns/d/a;)Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->d()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/LinearLayoutManager;->e(I)V

    .line 1280
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/d/c;->a:Lcom/roidapp/cloudlib/sns/d/a;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/d/a;->D(Lcom/roidapp/cloudlib/sns/d/a;)Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->c()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1281
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/d/c;->a:Lcom/roidapp/cloudlib/sns/d/a;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/d/a;->E(Lcom/roidapp/cloudlib/sns/d/a;)Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->a()V

    .line 261
    :cond_2
    return-void
.end method
