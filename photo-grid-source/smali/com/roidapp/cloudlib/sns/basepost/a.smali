.class final Lcom/roidapp/cloudlib/sns/basepost/a;
.super Landroid/support/v7/widget/ax;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;)V
    .locals 0

    .prologue
    .line 147
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/basepost/a;->a:Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;

    invoke-direct {p0}, Landroid/support/v7/widget/ax;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/support/v7/widget/RecyclerView;I)V
    .locals 0

    .prologue
    .line 166
    return-void
.end method

.method public final a(Landroid/support/v7/widget/RecyclerView;II)V
    .locals 4

    .prologue
    .line 170
    invoke-virtual {p1}, Landroid/support/v7/widget/RecyclerView;->b()Landroid/support/v7/widget/au;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/LinearLayoutManager;

    .line 172
    invoke-virtual {v0}, Landroid/support/v7/widget/LinearLayoutManager;->r()I

    move-result v1

    .line 173
    invoke-virtual {v0}, Landroid/support/v7/widget/LinearLayoutManager;->l()I

    move-result v2

    .line 177
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/a;->a:Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->a()Landroid/support/v7/widget/al;

    move-result-object v0

    .line 179
    if-eqz v0, :cond_0

    if-nez v1, :cond_1

    .line 198
    :cond_0
    :goto_0
    return-void

    .line 184
    :cond_1
    iget-object v3, p0, Lcom/roidapp/cloudlib/sns/basepost/a;->a:Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;

    invoke-static {v3}, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->a(Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;)Z

    move-result v3

    if-nez v3, :cond_2

    .line 185
    iget-object v3, p0, Lcom/roidapp/cloudlib/sns/basepost/a;->a:Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;

    invoke-static {v3, v2, v2, v1}, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->a(Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;III)V

    .line 189
    :cond_2
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/basepost/a;->a:Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;

    invoke-static {v1}, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->b(Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;)Z

    move-result v1

    if-nez v1, :cond_0

    const/4 v1, 0x4

    if-ne v2, v1, :cond_0

    .line 190
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/basepost/a;->a:Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;

    invoke-static {v1}, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->c(Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;)Z

    .line 191
    instance-of v1, v0, Lcom/roidapp/baselib/c/y;

    if-eqz v1, :cond_3

    .line 192
    check-cast v0, Lcom/roidapp/baselib/c/y;

    invoke-virtual {v0}, Lcom/roidapp/baselib/c/y;->d()Landroid/support/v7/widget/al;

    move-result-object v0

    .line 194
    :cond_3
    if-eqz v0, :cond_0

    .line 195
    check-cast v0, Lcom/roidapp/cloudlib/sns/basepost/b;

    invoke-interface {v0}, Lcom/roidapp/cloudlib/sns/basepost/b;->j_()V

    goto :goto_0
.end method
