.class final Lcom/roidapp/cloudlib/b/m;
.super Landroid/widget/BaseAdapter;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/roidapp/cloudlib/b/j;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/b/j;)V
    .locals 0

    .prologue
    .line 470
    iput-object p1, p0, Lcom/roidapp/cloudlib/b/m;->a:Lcom/roidapp/cloudlib/b/j;

    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public final getCount()I
    .locals 1

    .prologue
    .line 474
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/m;->a:Lcom/roidapp/cloudlib/b/j;

    invoke-static {v0}, Lcom/roidapp/cloudlib/b/j;->b(Lcom/roidapp/cloudlib/b/j;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 475
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/m;->a:Lcom/roidapp/cloudlib/b/j;

    invoke-static {v0}, Lcom/roidapp/cloudlib/b/j;->b(Lcom/roidapp/cloudlib/b/j;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    .line 477
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final getItem(I)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 487
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/m;->a:Lcom/roidapp/cloudlib/b/j;

    invoke-static {v0}, Lcom/roidapp/cloudlib/b/j;->b(Lcom/roidapp/cloudlib/b/j;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 488
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/m;->a:Lcom/roidapp/cloudlib/b/j;

    invoke-static {v0}, Lcom/roidapp/cloudlib/b/j;->b(Lcom/roidapp/cloudlib/b/j;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    .line 490
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final getItemId(I)J
    .locals 2

    .prologue
    .line 482
    int-to-long v0, p1

    return-wide v0
.end method

.method public final getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 5

    .prologue
    .line 495
    if-nez p2, :cond_0

    .line 496
    invoke-virtual {p3}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/roidapp/cloudlib/as;->am:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    .line 498
    :cond_0
    sget v0, Lcom/roidapp/cloudlib/ar;->ds:I

    invoke-static {p2, v0}, Lcom/roidapp/baselib/c/u;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/roidapp/baselib/view/RoundImageView;

    .line 499
    sget v1, Lcom/roidapp/cloudlib/ar;->dr:I

    invoke-static {p2, v1}, Lcom/roidapp/baselib/c/u;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    .line 501
    iget-object v2, p0, Lcom/roidapp/cloudlib/b/m;->a:Lcom/roidapp/cloudlib/b/j;

    invoke-static {v2}, Lcom/roidapp/cloudlib/b/j;->b(Lcom/roidapp/cloudlib/b/j;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/roidapp/cloudlib/sns/b/x;

    .line 502
    if-eqz v2, :cond_1

    .line 503
    iget-object v3, p0, Lcom/roidapp/cloudlib/b/m;->a:Lcom/roidapp/cloudlib/b/j;

    iget-object v4, v2, Lcom/roidapp/cloudlib/sns/b/x;->h:Ljava/lang/String;

    invoke-static {v3, v4, v0}, Lcom/roidapp/cloudlib/b/j;->a(Lcom/roidapp/cloudlib/b/j;Ljava/lang/String;Landroid/widget/ImageView;)V

    .line 504
    iget-object v0, v2, Lcom/roidapp/cloudlib/sns/b/x;->b:Ljava/lang/String;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 506
    :cond_1
    return-object p2
.end method
