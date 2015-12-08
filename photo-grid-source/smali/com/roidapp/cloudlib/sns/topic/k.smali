.class final Lcom/roidapp/cloudlib/sns/topic/k;
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
    .line 93
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/topic/k;->a:Lcom/roidapp/cloudlib/sns/topic/i;

    invoke-direct {p0}, Lcom/roidapp/cloudlib/sns/aa;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(ILjava/lang/Exception;)V
    .locals 1

    .prologue
    .line 117
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/k;->a:Lcom/roidapp/cloudlib/sns/topic/i;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/topic/i;->C(Lcom/roidapp/cloudlib/sns/topic/i;)Lcom/roidapp/cloudlib/sns/basepost/bc;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/basepost/bc;->e()V

    .line 118
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/k;->a:Lcom/roidapp/cloudlib/sns/topic/i;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/topic/i;->D(Lcom/roidapp/cloudlib/sns/topic/i;)Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->a()V

    .line 119
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/k;->a:Lcom/roidapp/cloudlib/sns/topic/i;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/topic/i;->E(Lcom/roidapp/cloudlib/sns/topic/i;)Z

    .line 120
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/k;->a:Lcom/roidapp/cloudlib/sns/topic/i;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/topic/i;->B(Lcom/roidapp/cloudlib/sns/topic/i;)Lcom/roidapp/cloudlib/sns/o;

    .line 121
    return-void
.end method

.method public final synthetic c(Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 93
    check-cast p1, Lcom/roidapp/cloudlib/sns/b/w;

    .line 1096
    if-eqz p1, :cond_0

    iget-object v0, p1, Lcom/roidapp/cloudlib/sns/b/w;->c:Lcom/roidapp/cloudlib/sns/b/a/e;

    if-eqz v0, :cond_0

    iget-object v0, p1, Lcom/roidapp/cloudlib/sns/b/w;->c:Lcom/roidapp/cloudlib/sns/b/a/e;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/b/a/e;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1097
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/k;->a:Lcom/roidapp/cloudlib/sns/topic/i;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/roidapp/cloudlib/sns/topic/i;->a(Lcom/roidapp/cloudlib/sns/topic/i;Z)Z

    .line 1098
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/k;->a:Lcom/roidapp/cloudlib/sns/topic/i;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/topic/i;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    sget v1, Lcom/roidapp/cloudlib/at;->ae:I

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/an;->a(Landroid/content/Context;I)V

    .line 1101
    :cond_1
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/k;->a:Lcom/roidapp/cloudlib/sns/topic/i;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/topic/i;->v(Lcom/roidapp/cloudlib/sns/topic/i;)Lcom/roidapp/cloudlib/sns/basepost/bc;

    move-result-object v0

    iget-object v1, p1, Lcom/roidapp/cloudlib/sns/b/w;->c:Lcom/roidapp/cloudlib/sns/b/a/e;

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/basepost/bc;->a(Lcom/roidapp/cloudlib/sns/b/a/e;)V

    .line 1102
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/topic/k;->a:Lcom/roidapp/cloudlib/sns/topic/i;

    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/k;->a:Lcom/roidapp/cloudlib/sns/topic/i;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/topic/i;->w(Lcom/roidapp/cloudlib/sns/topic/i;)Lcom/roidapp/cloudlib/sns/basepost/bc;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/basepost/bc;->g()Ljava/util/List;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/sns/b/a/e;

    invoke-static {v1, v0}, Lcom/roidapp/cloudlib/sns/topic/i;->a(Lcom/roidapp/cloudlib/sns/topic/i;Lcom/roidapp/cloudlib/sns/b/a/e;)Lcom/roidapp/cloudlib/sns/b/a/e;

    .line 1104
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/k;->a:Lcom/roidapp/cloudlib/sns/topic/i;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/topic/i;->x(Lcom/roidapp/cloudlib/sns/topic/i;)Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->b()Landroid/support/v7/widget/au;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/LinearLayoutManager;

    .line 1105
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/topic/k;->a:Lcom/roidapp/cloudlib/sns/topic/i;

    invoke-static {v1}, Lcom/roidapp/cloudlib/sns/topic/i;->y(Lcom/roidapp/cloudlib/sns/topic/i;)Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->d()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/LinearLayoutManager;->e(I)V

    .line 1107
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/k;->a:Lcom/roidapp/cloudlib/sns/topic/i;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/topic/i;->z(Lcom/roidapp/cloudlib/sns/topic/i;)Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->a()V

    .line 1108
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/k;->a:Lcom/roidapp/cloudlib/sns/topic/i;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/topic/i;->A(Lcom/roidapp/cloudlib/sns/topic/i;)Z

    .line 1109
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/k;->a:Lcom/roidapp/cloudlib/sns/topic/i;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/topic/i;->B(Lcom/roidapp/cloudlib/sns/topic/i;)Lcom/roidapp/cloudlib/sns/o;

    .line 1110
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/k;->a:Lcom/roidapp/cloudlib/sns/topic/i;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/topic/i;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/baselib/e/l;->b(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 1111
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/k;->a:Lcom/roidapp/cloudlib/sns/topic/i;

    sget v1, Lcom/roidapp/cloudlib/at;->aG:I

    invoke-static {v0, v1}, Lcom/roidapp/cloudlib/sns/topic/i;->c(Lcom/roidapp/cloudlib/sns/topic/i;I)V

    .line 93
    :cond_2
    return-void
.end method
