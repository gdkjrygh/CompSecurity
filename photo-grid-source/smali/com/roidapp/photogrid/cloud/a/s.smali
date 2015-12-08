.class final Lcom/roidapp/photogrid/cloud/a/s;
.super Landroid/widget/BaseAdapter;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/cloud/a/q;

.field private b:Landroid/view/LayoutInflater;


# direct methods
.method public constructor <init>(Lcom/roidapp/photogrid/cloud/a/q;)V
    .locals 1

    .prologue
    .line 360
    iput-object p1, p0, Lcom/roidapp/photogrid/cloud/a/s;->a:Lcom/roidapp/photogrid/cloud/a/q;

    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 361
    iget-object v0, p1, Lcom/roidapp/photogrid/cloud/a/q;->d:Lcom/roidapp/photogrid/release/ParentActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ParentActivity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/a/s;->b:Landroid/view/LayoutInflater;

    .line 362
    return-void
.end method

.method private a(I)Lcom/roidapp/photogrid/cloud/a/l;
    .locals 1

    .prologue
    .line 371
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/a/s;->a:Lcom/roidapp/photogrid/cloud/a/q;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/a/q;->a(Lcom/roidapp/photogrid/cloud/a/q;)Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/a/s;->a:Lcom/roidapp/photogrid/cloud/a/q;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/a/q;->a(Lcom/roidapp/photogrid/cloud/a/q;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/cloud/a/l;

    goto :goto_0
.end method


# virtual methods
.method public final getCount()I
    .locals 1

    .prologue
    .line 366
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/a/s;->a:Lcom/roidapp/photogrid/cloud/a/q;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/a/q;->a(Lcom/roidapp/photogrid/cloud/a/q;)Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/a/s;->a:Lcom/roidapp/photogrid/cloud/a/q;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/a/q;->a(Lcom/roidapp/photogrid/cloud/a/q;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    goto :goto_0
.end method

.method public final synthetic getItem(I)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 356
    invoke-direct {p0, p1}, Lcom/roidapp/photogrid/cloud/a/s;->a(I)Lcom/roidapp/photogrid/cloud/a/l;

    move-result-object v0

    return-object v0
.end method

.method public final getItemId(I)J
    .locals 2

    .prologue
    .line 376
    int-to-long v0, p1

    return-wide v0
.end method

.method public final getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 2

    .prologue
    .line 395
    invoke-direct {p0, p1}, Lcom/roidapp/photogrid/cloud/a/s;->a(I)Lcom/roidapp/photogrid/cloud/a/l;

    move-result-object v0

    .line 396
    if-eqz v0, :cond_0

    .line 397
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/a/s;->b:Landroid/view/LayoutInflater;

    invoke-virtual {v0, v1, p2, p3}, Lcom/roidapp/photogrid/cloud/a/l;->a(Landroid/view/LayoutInflater;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    .line 399
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final notifyDataSetChanged()V
    .locals 5

    .prologue
    .line 381
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/a/s;->a:Lcom/roidapp/photogrid/cloud/a/q;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/a/q;->a(Lcom/roidapp/photogrid/cloud/a/q;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/a/s;->a:Lcom/roidapp/photogrid/cloud/a/q;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/a/q;->b(Lcom/roidapp/photogrid/cloud/a/q;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/a/s;->a:Lcom/roidapp/photogrid/cloud/a/q;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/a/q;->b(Lcom/roidapp/photogrid/cloud/a/q;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 382
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/a/s;->a:Lcom/roidapp/photogrid/cloud/a/q;

    invoke-static {v1}, Lcom/roidapp/photogrid/cloud/a/q;->b(Lcom/roidapp/photogrid/cloud/a/q;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 383
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/baselib/c/x;

    .line 384
    if-eqz v0, :cond_0

    iget-object v1, v0, Lcom/roidapp/baselib/c/x;->a:Ljava/lang/Object;

    if-eqz v1, :cond_0

    iget-object v1, v0, Lcom/roidapp/baselib/c/x;->a:Ljava/lang/Object;

    check-cast v1, Lcom/roidapp/photogrid/cloud/a/a;

    iget-boolean v1, v1, Lcom/roidapp/photogrid/cloud/a/a;->c:Z

    if-eqz v1, :cond_0

    .line 385
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/a/s;->a:Lcom/roidapp/photogrid/cloud/a/q;

    invoke-static {v1}, Lcom/roidapp/photogrid/cloud/a/q;->a(Lcom/roidapp/photogrid/cloud/a/q;)Ljava/util/List;

    move-result-object v3

    iget-object v1, v0, Lcom/roidapp/baselib/c/x;->b:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    iget-object v4, v0, Lcom/roidapp/baselib/c/x;->a:Ljava/lang/Object;

    invoke-interface {v3, v1, v4}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 386
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/a/s;->a:Lcom/roidapp/photogrid/cloud/a/q;

    invoke-static {v1}, Lcom/roidapp/photogrid/cloud/a/q;->b(Lcom/roidapp/photogrid/cloud/a/q;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, v0}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    .line 390
    :cond_1
    invoke-super {p0}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    .line 391
    return-void
.end method
