.class final Lcom/roidapp/cloudlib/sns/basepost/ag;
.super Lcom/roidapp/cloudlib/sns/aa;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/roidapp/cloudlib/sns/aa",
        "<",
        "Lorg/json/JSONObject;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:J

.field final synthetic b:Lcom/roidapp/cloudlib/sns/basepost/ad;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/sns/basepost/ad;J)V
    .locals 0

    .prologue
    .line 924
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/basepost/ag;->b:Lcom/roidapp/cloudlib/sns/basepost/ad;

    iput-wide p2, p0, Lcom/roidapp/cloudlib/sns/basepost/ag;->a:J

    invoke-direct {p0}, Lcom/roidapp/cloudlib/sns/aa;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(ILjava/lang/Exception;)V
    .locals 2

    .prologue
    .line 964
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/ag;->b:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/ad;->A(Lcom/roidapp/cloudlib/sns/basepost/ad;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 971
    :goto_0
    return-void

    .line 967
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/ag;->b:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/ad;->c(Lcom/roidapp/cloudlib/sns/basepost/ad;)Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->setEnabled(Z)V

    .line 968
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/ag;->b:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/ad;->t(Lcom/roidapp/cloudlib/sns/basepost/ad;)Landroid/widget/ProgressBar;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 969
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/ag;->b:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/basepost/ad;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    sget v1, Lcom/roidapp/cloudlib/at;->E:I

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/an;->a(Landroid/content/Context;I)V

    .line 970
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/ag;->b:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/ad;->z(Lcom/roidapp/cloudlib/sns/basepost/ad;)Z

    goto :goto_0
.end method

.method public final synthetic c(Ljava/lang/Object;)V
    .locals 6

    .prologue
    .line 924
    .line 1928
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/ag;->b:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/ad;->y(Lcom/roidapp/cloudlib/sns/basepost/ad;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1931
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/ag;->b:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/ad;->a(Lcom/roidapp/cloudlib/sns/basepost/ad;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 1932
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/ag;->b:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/ad;->a(Lcom/roidapp/cloudlib/sns/basepost/ad;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .line 1933
    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1934
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/sns/b/a;

    .line 1935
    iget-wide v2, v0, Lcom/roidapp/cloudlib/sns/b/a;->a:J

    iget-wide v4, p0, Lcom/roidapp/cloudlib/sns/basepost/ag;->a:J

    cmp-long v2, v2, v4

    if-nez v2, :cond_0

    .line 1937
    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/basepost/ag;->b:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-static {v2}, Lcom/roidapp/cloudlib/sns/basepost/ad;->i(Lcom/roidapp/cloudlib/sns/basepost/ad;)Ljava/util/HashSet;

    move-result-object v2

    iget-wide v4, p0, Lcom/roidapp/cloudlib/sns/basepost/ag;->a:J

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 1938
    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/basepost/ag;->b:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-static {v2}, Lcom/roidapp/cloudlib/sns/basepost/ad;->j(Lcom/roidapp/cloudlib/sns/basepost/ad;)Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 1939
    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    .line 1940
    invoke-static {}, Lcom/roidapp/cloudlib/sns/g/b;->a()Lcom/roidapp/cloudlib/sns/g/b;

    move-result-object v1

    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/basepost/ag;->b:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-static {v2}, Lcom/roidapp/cloudlib/sns/basepost/ad;->b(Lcom/roidapp/cloudlib/sns/basepost/ad;)Lcom/roidapp/cloudlib/sns/b/n;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Lcom/roidapp/cloudlib/sns/g/b;->b(Lcom/roidapp/cloudlib/sns/b/n;Lcom/roidapp/cloudlib/sns/b/a;)V

    .line 1941
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/ag;->b:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/ad;->l(Lcom/roidapp/cloudlib/sns/basepost/ad;)Lcom/roidapp/cloudlib/sns/basepost/w;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/basepost/w;->notifyDataSetChanged()V

    .line 1948
    :cond_1
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/ag;->b:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/ad;->j(Lcom/roidapp/cloudlib/sns/basepost/ad;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_4

    .line 1949
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/ag;->b:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/ad;->f(Lcom/roidapp/cloudlib/sns/basepost/ad;)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 1950
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/ag;->b:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/ad;->g(Lcom/roidapp/cloudlib/sns/basepost/ad;)V

    .line 1952
    :cond_2
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/ag;->b:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/ad;->t(Lcom/roidapp/cloudlib/sns/basepost/ad;)Landroid/widget/ProgressBar;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 1953
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/ag;->b:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/basepost/ad;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    sget v1, Lcom/roidapp/cloudlib/at;->G:I

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/an;->a(Landroid/content/Context;I)V

    .line 1954
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/ag;->b:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/ad;->c(Lcom/roidapp/cloudlib/sns/basepost/ad;)Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->setEnabled(Z)V

    .line 1955
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/ag;->b:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/ad;->z(Lcom/roidapp/cloudlib/sns/basepost/ad;)Z

    :cond_3
    :goto_0
    return-void

    .line 1957
    :cond_4
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/ag;->b:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/ad;->k(Lcom/roidapp/cloudlib/sns/basepost/ad;)V

    .line 1958
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/basepost/ag;->b:Lcom/roidapp/cloudlib/sns/basepost/ad;

    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/ag;->b:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/ad;->j(Lcom/roidapp/cloudlib/sns/basepost/ad;)Ljava/util/ArrayList;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/sns/b/a;

    iget-wide v2, v0, Lcom/roidapp/cloudlib/sns/b/a;->a:J

    invoke-static {v1, v2, v3}, Lcom/roidapp/cloudlib/sns/basepost/ad;->a(Lcom/roidapp/cloudlib/sns/basepost/ad;J)V

    goto :goto_0
.end method
