.class final Lcom/roidapp/cloudlib/sns/basepost/ai;
.super Lcom/roidapp/cloudlib/sns/aa;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/roidapp/cloudlib/sns/aa",
        "<",
        "Lcom/roidapp/cloudlib/sns/b/n;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/roidapp/cloudlib/sns/basepost/ad;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/sns/basepost/ad;)V
    .locals 0

    .prologue
    .line 1095
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/basepost/ai;->a:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-direct {p0}, Lcom/roidapp/cloudlib/sns/aa;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(ILjava/lang/Exception;)V
    .locals 2

    .prologue
    .line 1137
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/ai;->a:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/ad;->H(Lcom/roidapp/cloudlib/sns/basepost/ad;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 1151
    :cond_0
    :goto_0
    return-void

    .line 1141
    :cond_1
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/ai;->a:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/ad;->G(Lcom/roidapp/cloudlib/sns/basepost/ad;)Lcom/roidapp/cloudlib/sns/o;

    .line 1142
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/ai;->a:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/ad;->c(Lcom/roidapp/cloudlib/sns/basepost/ad;)Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->c()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1143
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/ai;->a:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/ad;->c(Lcom/roidapp/cloudlib/sns/basepost/ad;)Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->a()V

    .line 1145
    :cond_2
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/ai;->a:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/ad;->C(Lcom/roidapp/cloudlib/sns/basepost/ad;)Z

    .line 1147
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/ai;->a:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/basepost/ad;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/baselib/e/l;->b(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1148
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/ai;->a:Lcom/roidapp/cloudlib/sns/basepost/ad;

    sget v1, Lcom/roidapp/cloudlib/at;->aG:I

    invoke-static {v0, v1}, Lcom/roidapp/cloudlib/sns/basepost/ad;->a(Lcom/roidapp/cloudlib/sns/basepost/ad;I)V

    goto :goto_0
.end method

.method public final synthetic c(Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 1095
    check-cast p1, Lcom/roidapp/cloudlib/sns/b/n;

    .line 2100
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/ai;->a:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/ad;->E(Lcom/roidapp/cloudlib/sns/basepost/ad;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 2104
    if-eqz p1, :cond_0

    .line 2105
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/ai;->a:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/ad;->b(Lcom/roidapp/cloudlib/sns/basepost/ad;)Lcom/roidapp/cloudlib/sns/b/n;

    move-result-object v0

    iget-object v1, p1, Lcom/roidapp/cloudlib/sns/b/n;->a:Lcom/roidapp/cloudlib/sns/b/o;

    iput-object v1, v0, Lcom/roidapp/cloudlib/sns/b/n;->a:Lcom/roidapp/cloudlib/sns/b/o;

    .line 2106
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/ai;->a:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/ad;->b(Lcom/roidapp/cloudlib/sns/basepost/ad;)Lcom/roidapp/cloudlib/sns/b/n;

    move-result-object v0

    iget-object v1, p1, Lcom/roidapp/cloudlib/sns/b/n;->b:Lcom/roidapp/cloudlib/sns/b/x;

    iput-object v1, v0, Lcom/roidapp/cloudlib/sns/b/n;->b:Lcom/roidapp/cloudlib/sns/b/x;

    .line 2107
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/ai;->a:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/ad;->b(Lcom/roidapp/cloudlib/sns/basepost/ad;)Lcom/roidapp/cloudlib/sns/b/n;

    move-result-object v0

    iget-object v1, p1, Lcom/roidapp/cloudlib/sns/b/n;->c:Lcom/roidapp/cloudlib/sns/b/a/a;

    iput-object v1, v0, Lcom/roidapp/cloudlib/sns/b/n;->c:Lcom/roidapp/cloudlib/sns/b/a/a;

    .line 2108
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/ai;->a:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/ad;->b(Lcom/roidapp/cloudlib/sns/basepost/ad;)Lcom/roidapp/cloudlib/sns/b/n;

    move-result-object v0

    iget-object v1, p1, Lcom/roidapp/cloudlib/sns/b/n;->d:Lcom/roidapp/cloudlib/sns/b/a/i;

    iput-object v1, v0, Lcom/roidapp/cloudlib/sns/b/n;->d:Lcom/roidapp/cloudlib/sns/b/a/i;

    .line 2109
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/ai;->a:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/ad;->b(Lcom/roidapp/cloudlib/sns/basepost/ad;)Lcom/roidapp/cloudlib/sns/b/n;

    move-result-object v0

    iget-object v1, p1, Lcom/roidapp/cloudlib/sns/b/n;->e:Ljava/util/List;

    iput-object v1, v0, Lcom/roidapp/cloudlib/sns/b/n;->e:Ljava/util/List;

    .line 2110
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/ai;->a:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/ad;->b(Lcom/roidapp/cloudlib/sns/basepost/ad;)Lcom/roidapp/cloudlib/sns/b/n;

    move-result-object v0

    iget-object v1, p1, Lcom/roidapp/cloudlib/sns/b/n;->f:Lcom/roidapp/cloudlib/sns/b/g;

    iput-object v1, v0, Lcom/roidapp/cloudlib/sns/b/n;->f:Lcom/roidapp/cloudlib/sns/b/g;

    .line 2112
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/ai;->a:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/ad;->a(Lcom/roidapp/cloudlib/sns/basepost/ad;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 2114
    iget-object v0, p1, Lcom/roidapp/cloudlib/sns/b/n;->c:Lcom/roidapp/cloudlib/sns/b/a/a;

    if-eqz v0, :cond_3

    .line 2115
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/ai;->a:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/ad;->a(Lcom/roidapp/cloudlib/sns/basepost/ad;)Ljava/util/List;

    move-result-object v0

    iget-object v1, p1, Lcom/roidapp/cloudlib/sns/b/n;->c:Lcom/roidapp/cloudlib/sns/b/a/a;

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 2117
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/ai;->a:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/ad;->l(Lcom/roidapp/cloudlib/sns/basepost/ad;)Lcom/roidapp/cloudlib/sns/basepost/w;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/basepost/ai;->a:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-static {v1}, Lcom/roidapp/cloudlib/sns/basepost/ad;->a(Lcom/roidapp/cloudlib/sns/basepost/ad;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/basepost/w;->a(Ljava/util/List;)V

    .line 2118
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/ai;->a:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/ad;->l(Lcom/roidapp/cloudlib/sns/basepost/ad;)Lcom/roidapp/cloudlib/sns/basepost/w;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/basepost/w;->notifyDataSetChanged()V

    .line 2119
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/ai;->a:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/ad;->F(Lcom/roidapp/cloudlib/sns/basepost/ad;)Landroid/widget/ListView;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/basepost/ai;->a:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-static {v1}, Lcom/roidapp/cloudlib/sns/basepost/ad;->l(Lcom/roidapp/cloudlib/sns/basepost/ad;)Lcom/roidapp/cloudlib/sns/basepost/w;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/cloudlib/sns/basepost/w;->getCount()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setSelection(I)V

    .line 2128
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/ai;->a:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/ad;->G(Lcom/roidapp/cloudlib/sns/basepost/ad;)Lcom/roidapp/cloudlib/sns/o;

    .line 2129
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/ai;->a:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/ad;->c(Lcom/roidapp/cloudlib/sns/basepost/ad;)Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2130
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/ai;->a:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/ad;->c(Lcom/roidapp/cloudlib/sns/basepost/ad;)Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->a()V

    .line 2132
    :cond_1
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/ai;->a:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/ad;->C(Lcom/roidapp/cloudlib/sns/basepost/ad;)Z

    .line 1095
    :cond_2
    return-void

    .line 2121
    :cond_3
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/ai;->a:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/ad;->l(Lcom/roidapp/cloudlib/sns/basepost/ad;)Lcom/roidapp/cloudlib/sns/basepost/w;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/basepost/ai;->a:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-static {v1}, Lcom/roidapp/cloudlib/sns/basepost/ad;->a(Lcom/roidapp/cloudlib/sns/basepost/ad;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/basepost/w;->a(Ljava/util/List;)V

    .line 2122
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/ai;->a:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/ad;->l(Lcom/roidapp/cloudlib/sns/basepost/ad;)Lcom/roidapp/cloudlib/sns/basepost/w;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/basepost/w;->notifyDataSetChanged()V

    goto :goto_0
.end method
