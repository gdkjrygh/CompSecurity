.class final Lcom/roidapp/cloudlib/sns/basepost/aj;
.super Lcom/roidapp/cloudlib/sns/aa;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/roidapp/cloudlib/sns/aa",
        "<",
        "Lcom/roidapp/cloudlib/sns/b/a/a;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/roidapp/cloudlib/sns/basepost/ad;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/sns/basepost/ad;)V
    .locals 0

    .prologue
    .line 1187
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/basepost/aj;->a:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-direct {p0}, Lcom/roidapp/cloudlib/sns/aa;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(ILjava/lang/Exception;)V
    .locals 2

    .prologue
    .line 1215
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/aj;->a:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/ad;->K(Lcom/roidapp/cloudlib/sns/basepost/ad;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 1229
    :cond_0
    :goto_0
    return-void

    .line 1219
    :cond_1
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/aj;->a:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/ad;->J(Lcom/roidapp/cloudlib/sns/basepost/ad;)Lcom/roidapp/cloudlib/sns/o;

    .line 1220
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/aj;->a:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/ad;->c(Lcom/roidapp/cloudlib/sns/basepost/ad;)Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->b()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1221
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/aj;->a:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/ad;->c(Lcom/roidapp/cloudlib/sns/basepost/ad;)Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->a(Z)V

    .line 1223
    :cond_2
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/aj;->a:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/ad;->C(Lcom/roidapp/cloudlib/sns/basepost/ad;)Z

    .line 1225
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/aj;->a:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/basepost/ad;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/baselib/e/l;->b(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1226
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/aj;->a:Lcom/roidapp/cloudlib/sns/basepost/ad;

    sget v1, Lcom/roidapp/cloudlib/at;->aG:I

    invoke-static {v0, v1}, Lcom/roidapp/cloudlib/sns/basepost/ad;->a(Lcom/roidapp/cloudlib/sns/basepost/ad;I)V

    goto :goto_0
.end method

.method public final synthetic c(Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 1187
    check-cast p1, Lcom/roidapp/cloudlib/sns/b/a/a;

    .line 2192
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/aj;->a:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/ad;->I(Lcom/roidapp/cloudlib/sns/basepost/ad;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 2196
    if-eqz p1, :cond_0

    .line 2197
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/aj;->a:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/ad;->b(Lcom/roidapp/cloudlib/sns/basepost/ad;)Lcom/roidapp/cloudlib/sns/b/n;

    move-result-object v0

    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/b/n;->c:Lcom/roidapp/cloudlib/sns/b/a/a;

    invoke-virtual {v0, p1}, Lcom/roidapp/cloudlib/sns/b/a/a;->addAll(Ljava/util/Collection;)Z

    .line 2199
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/aj;->a:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/ad;->a(Lcom/roidapp/cloudlib/sns/basepost/ad;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 2200
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/aj;->a:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/ad;->a(Lcom/roidapp/cloudlib/sns/basepost/ad;)Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/basepost/aj;->a:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-static {v1}, Lcom/roidapp/cloudlib/sns/basepost/ad;->b(Lcom/roidapp/cloudlib/sns/basepost/ad;)Lcom/roidapp/cloudlib/sns/b/n;

    move-result-object v1

    iget-object v1, v1, Lcom/roidapp/cloudlib/sns/b/n;->c:Lcom/roidapp/cloudlib/sns/b/a/a;

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 2202
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/aj;->a:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/ad;->l(Lcom/roidapp/cloudlib/sns/basepost/ad;)Lcom/roidapp/cloudlib/sns/basepost/w;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/basepost/aj;->a:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-static {v1}, Lcom/roidapp/cloudlib/sns/basepost/ad;->a(Lcom/roidapp/cloudlib/sns/basepost/ad;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/basepost/w;->a(Ljava/util/List;)V

    .line 2203
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/aj;->a:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/ad;->l(Lcom/roidapp/cloudlib/sns/basepost/ad;)Lcom/roidapp/cloudlib/sns/basepost/w;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/basepost/w;->notifyDataSetChanged()V

    .line 2206
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/aj;->a:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/ad;->J(Lcom/roidapp/cloudlib/sns/basepost/ad;)Lcom/roidapp/cloudlib/sns/o;

    .line 2207
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/aj;->a:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/ad;->c(Lcom/roidapp/cloudlib/sns/basepost/ad;)Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2208
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/aj;->a:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/ad;->c(Lcom/roidapp/cloudlib/sns/basepost/ad;)Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->a(Z)V

    .line 2210
    :cond_1
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/aj;->a:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/ad;->C(Lcom/roidapp/cloudlib/sns/basepost/ad;)Z

    .line 1187
    :cond_2
    return-void
.end method
