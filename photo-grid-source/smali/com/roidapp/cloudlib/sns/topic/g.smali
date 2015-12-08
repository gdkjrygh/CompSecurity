.class final Lcom/roidapp/cloudlib/sns/topic/g;
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
.field final synthetic a:Lcom/roidapp/cloudlib/sns/topic/e;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/sns/topic/e;)V
    .locals 0

    .prologue
    .line 53
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/topic/g;->a:Lcom/roidapp/cloudlib/sns/topic/e;

    invoke-direct {p0}, Lcom/roidapp/cloudlib/sns/aa;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(ILjava/lang/Exception;)V
    .locals 3

    .prologue
    .line 77
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/g;->a:Lcom/roidapp/cloudlib/sns/topic/e;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/topic/e;->u()I

    move-result v0

    .line 78
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/topic/g;->a:Lcom/roidapp/cloudlib/sns/topic/e;

    iget-object v1, v1, Lcom/roidapp/cloudlib/sns/topic/e;->c:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    invoke-virtual {v1}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->a()V

    .line 79
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/topic/g;->a:Lcom/roidapp/cloudlib/sns/topic/e;

    invoke-virtual {v1}, Lcom/roidapp/cloudlib/sns/topic/e;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-static {v1}, Lcom/roidapp/baselib/e/l;->b(Landroid/content/Context;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 80
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/topic/g;->a:Lcom/roidapp/cloudlib/sns/topic/e;

    sget v2, Lcom/roidapp/cloudlib/at;->aG:I

    invoke-virtual {v1, v2, v0}, Lcom/roidapp/cloudlib/sns/topic/e;->a(II)V

    .line 85
    :goto_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/g;->a:Lcom/roidapp/cloudlib/sns/topic/e;

    const/4 v1, 0x0

    iput-boolean v1, v0, Lcom/roidapp/cloudlib/sns/topic/e;->i:Z

    .line 86
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/g;->a:Lcom/roidapp/cloudlib/sns/topic/e;

    const/4 v1, 0x0

    iput-object v1, v0, Lcom/roidapp/cloudlib/sns/topic/e;->h:Lcom/roidapp/cloudlib/sns/o;

    .line 87
    return-void

    .line 82
    :cond_0
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/topic/g;->a:Lcom/roidapp/cloudlib/sns/topic/e;

    sget v2, Lcom/roidapp/cloudlib/at;->bb:I

    invoke-virtual {v1, v2, v0}, Lcom/roidapp/cloudlib/sns/topic/e;->a(II)V

    goto :goto_0
.end method

.method public final synthetic c(Ljava/lang/Object;)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    const/4 v2, 0x0

    .line 53
    check-cast p1, Lcom/roidapp/cloudlib/sns/b/w;

    .line 1056
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/g;->a:Lcom/roidapp/cloudlib/sns/topic/e;

    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/topic/e;->c:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->a()V

    .line 1058
    if-eqz p1, :cond_0

    iget-object v0, p1, Lcom/roidapp/cloudlib/sns/b/w;->c:Lcom/roidapp/cloudlib/sns/b/a/e;

    if-eqz v0, :cond_0

    iget-object v0, p1, Lcom/roidapp/cloudlib/sns/b/w;->c:Lcom/roidapp/cloudlib/sns/b/a/e;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/b/a/e;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1059
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/g;->a:Lcom/roidapp/cloudlib/sns/topic/e;

    iput-boolean v2, v0, Lcom/roidapp/cloudlib/sns/topic/e;->i:Z

    .line 1060
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/g;->a:Lcom/roidapp/cloudlib/sns/topic/e;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/roidapp/cloudlib/sns/topic/e;->j:Z

    .line 1061
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/g;->a:Lcom/roidapp/cloudlib/sns/topic/e;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/topic/e;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    sget v1, Lcom/roidapp/cloudlib/at;->ae:I

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/an;->a(Landroid/content/Context;I)V

    .line 1062
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/g;->a:Lcom/roidapp/cloudlib/sns/topic/e;

    iput-object v3, v0, Lcom/roidapp/cloudlib/sns/topic/e;->h:Lcom/roidapp/cloudlib/sns/o;

    .line 1063
    :goto_0
    return-void

    .line 1066
    :cond_1
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/g;->a:Lcom/roidapp/cloudlib/sns/topic/e;

    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/topic/e;->k:Ljava/lang/Object;

    check-cast v0, Lcom/roidapp/cloudlib/sns/b/w;

    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/b/w;->c:Lcom/roidapp/cloudlib/sns/b/a/e;

    iget-object v1, p1, Lcom/roidapp/cloudlib/sns/b/w;->c:Lcom/roidapp/cloudlib/sns/b/a/e;

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/b/a/e;->addAll(Ljava/util/Collection;)Z

    .line 1067
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/g;->a:Lcom/roidapp/cloudlib/sns/topic/e;

    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/topic/e;->d:Lcom/roidapp/baselib/c/y;

    invoke-virtual {v0}, Lcom/roidapp/baselib/c/y;->d()Landroid/support/v7/widget/al;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/sns/topic/a;

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/topic/g;->a:Lcom/roidapp/cloudlib/sns/topic/e;

    iget-object v1, v1, Lcom/roidapp/cloudlib/sns/topic/e;->k:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/topic/a;->b(Ljava/lang/Object;)V

    .line 1068
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/g;->a:Lcom/roidapp/cloudlib/sns/topic/e;

    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/topic/e;->d:Lcom/roidapp/baselib/c/y;

    invoke-virtual {v0}, Lcom/roidapp/baselib/c/y;->c()V

    .line 1069
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/g;->a:Lcom/roidapp/cloudlib/sns/topic/e;

    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/topic/e;->e:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView;->b()Landroid/support/v7/widget/au;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/GridLayoutManager;

    .line 1070
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/topic/g;->a:Lcom/roidapp/cloudlib/sns/topic/e;

    iget-object v1, v1, Lcom/roidapp/cloudlib/sns/topic/e;->c:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    invoke-virtual {v1}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->d()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/GridLayoutManager;->e(I)V

    .line 1071
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/g;->a:Lcom/roidapp/cloudlib/sns/topic/e;

    iput-boolean v2, v0, Lcom/roidapp/cloudlib/sns/topic/e;->i:Z

    .line 1072
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/g;->a:Lcom/roidapp/cloudlib/sns/topic/e;

    iput-object v3, v0, Lcom/roidapp/cloudlib/sns/topic/e;->h:Lcom/roidapp/cloudlib/sns/o;

    goto :goto_0
.end method
