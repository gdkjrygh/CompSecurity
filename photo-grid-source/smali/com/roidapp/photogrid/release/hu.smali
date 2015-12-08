.class final Lcom/roidapp/photogrid/release/hu;
.super Landroid/widget/BaseAdapter;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/ht;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/ht;)V
    .locals 0

    .prologue
    .line 81
    iput-object p1, p0, Lcom/roidapp/photogrid/release/hu;->a:Lcom/roidapp/photogrid/release/ht;

    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public final getCount()I
    .locals 1

    .prologue
    .line 84
    iget-object v0, p0, Lcom/roidapp/photogrid/release/hu;->a:Lcom/roidapp/photogrid/release/ht;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/ht;->e:[Lcom/roidapp/photogrid/video/bj;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/hu;->a:Lcom/roidapp/photogrid/release/ht;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/ht;->e:[Lcom/roidapp/photogrid/video/bj;

    array-length v0, v0

    goto :goto_0
.end method

.method public final getItem(I)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 89
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public final getItemId(I)J
    .locals 2

    .prologue
    .line 94
    int-to-long v0, p1

    return-wide v0
.end method

.method public final getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 5

    .prologue
    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 99
    if-eqz p2, :cond_0

    .line 119
    :goto_0
    return-object p2

    .line 102
    :cond_0
    iget-object v2, p0, Lcom/roidapp/photogrid/release/hu;->a:Lcom/roidapp/photogrid/release/ht;

    iget-object v2, v2, Lcom/roidapp/photogrid/release/ht;->e:[Lcom/roidapp/photogrid/video/bj;

    aget-object v2, v2, p1

    .line 104
    if-nez v2, :cond_1

    move-object p2, v0

    .line 105
    goto :goto_0

    .line 108
    :cond_1
    iget-object v3, p0, Lcom/roidapp/photogrid/release/hu;->a:Lcom/roidapp/photogrid/release/ht;

    iget-object v3, v3, Lcom/roidapp/photogrid/release/ht;->h:Landroid/view/LayoutInflater;

    iget-object v4, p0, Lcom/roidapp/photogrid/release/hu;->a:Lcom/roidapp/photogrid/release/ht;

    invoke-virtual {v4}, Lcom/roidapp/photogrid/release/ht;->c()I

    move-result v4

    invoke-virtual {v3, v4, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    iput-object v0, v2, Lcom/roidapp/photogrid/video/bj;->g:Landroid/view/View;

    .line 110
    iget-object v0, v2, Lcom/roidapp/photogrid/video/bj;->g:Landroid/view/View;

    const v3, 0x7f0d04e1

    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v2, Lcom/roidapp/photogrid/video/bj;->e:Landroid/widget/TextView;

    .line 111
    iget-object v0, v2, Lcom/roidapp/photogrid/video/bj;->e:Landroid/widget/TextView;

    iget v3, v2, Lcom/roidapp/photogrid/video/bj;->b:I

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(I)V

    .line 112
    iget-object v0, v2, Lcom/roidapp/photogrid/video/bj;->e:Landroid/widget/TextView;

    iget v3, v2, Lcom/roidapp/photogrid/video/bj;->c:I

    invoke-virtual {v0, v1, v3, v1, v1}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(IIII)V

    .line 114
    iget-object v0, v2, Lcom/roidapp/photogrid/video/bj;->g:Landroid/view/View;

    const v3, 0x7f0d04e2

    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v2, Lcom/roidapp/photogrid/video/bj;->f:Landroid/widget/ImageView;

    .line 115
    iget-object v3, v2, Lcom/roidapp/photogrid/video/bj;->f:Landroid/widget/ImageView;

    iget-boolean v0, v2, Lcom/roidapp/photogrid/video/bj;->d:Z

    if-eqz v0, :cond_2

    move v0, v1

    :goto_1
    invoke-virtual {v3, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 117
    iget-object v0, v2, Lcom/roidapp/photogrid/video/bj;->g:Landroid/view/View;

    invoke-virtual {v0, p1}, Landroid/view/View;->setId(I)V

    .line 119
    iget-object p2, v2, Lcom/roidapp/photogrid/video/bj;->g:Landroid/view/View;

    goto :goto_0

    .line 115
    :cond_2
    const/16 v0, 0x8

    goto :goto_1
.end method
