.class final Lcom/roidapp/cloudlib/b/i;
.super Landroid/widget/BaseAdapter;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/roidapp/cloudlib/b/g;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/b/g;)V
    .locals 0

    .prologue
    .line 455
    iput-object p1, p0, Lcom/roidapp/cloudlib/b/i;->a:Lcom/roidapp/cloudlib/b/g;

    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public final getCount()I
    .locals 1

    .prologue
    .line 459
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/i;->a:Lcom/roidapp/cloudlib/b/g;

    invoke-static {v0}, Lcom/roidapp/cloudlib/b/g;->b(Lcom/roidapp/cloudlib/b/g;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 460
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/i;->a:Lcom/roidapp/cloudlib/b/g;

    invoke-static {v0}, Lcom/roidapp/cloudlib/b/g;->b(Lcom/roidapp/cloudlib/b/g;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    .line 462
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final getItem(I)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 472
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/i;->a:Lcom/roidapp/cloudlib/b/g;

    invoke-static {v0}, Lcom/roidapp/cloudlib/b/g;->b(Lcom/roidapp/cloudlib/b/g;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 473
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/i;->a:Lcom/roidapp/cloudlib/b/g;

    invoke-static {v0}, Lcom/roidapp/cloudlib/b/g;->b(Lcom/roidapp/cloudlib/b/g;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    .line 475
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final getItemId(I)J
    .locals 2

    .prologue
    .line 467
    int-to-long v0, p1

    return-wide v0
.end method

.method public final getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 3

    .prologue
    .line 480
    if-nez p2, :cond_0

    .line 481
    invoke-virtual {p3}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/roidapp/cloudlib/as;->F:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    .line 483
    :cond_0
    sget v0, Lcom/roidapp/cloudlib/ar;->aZ:I

    invoke-static {p2, v0}, Lcom/roidapp/baselib/c/u;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 485
    iget-object v1, p0, Lcom/roidapp/cloudlib/b/i;->a:Lcom/roidapp/cloudlib/b/g;

    invoke-static {v1}, Lcom/roidapp/cloudlib/b/g;->b(Lcom/roidapp/cloudlib/b/g;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 487
    return-object p2
.end method
