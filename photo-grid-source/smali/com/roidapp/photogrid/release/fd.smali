.class final Lcom/roidapp/photogrid/release/fd;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/fb;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/fb;)V
    .locals 0

    .prologue
    .line 191
    iput-object p1, p0, Lcom/roidapp/photogrid/release/fd;->a:Lcom/roidapp/photogrid/release/fb;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 5

    .prologue
    const v4, 0x7f0d0493

    const/4 v3, 0x0

    .line 195
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fd;->a:Lcom/roidapp/photogrid/release/fb;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/fb;->b(Lcom/roidapp/photogrid/release/fb;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v0

    iget-boolean v0, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->i:Z

    if-eqz v0, :cond_1

    .line 221
    :cond_0
    :goto_0
    return-void

    .line 199
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fd;->a:Lcom/roidapp/photogrid/release/fb;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/fb;->d(Lcom/roidapp/photogrid/release/fb;)Landroid/widget/HorizontalScrollView;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 200
    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    move-result v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/fd;->a:Lcom/roidapp/photogrid/release/fb;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/fb;->d(Lcom/roidapp/photogrid/release/fb;)Landroid/widget/HorizontalScrollView;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/HorizontalScrollView;->getScrollX()I

    move-result v1

    sub-int/2addr v0, v1

    .line 202
    iget-object v1, p0, Lcom/roidapp/photogrid/release/fd;->a:Lcom/roidapp/photogrid/release/fb;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/fb;->e(Lcom/roidapp/photogrid/release/fb;)I

    move-result v1

    if-ge v0, v1, :cond_2

    .line 203
    iget-object v1, p0, Lcom/roidapp/photogrid/release/fd;->a:Lcom/roidapp/photogrid/release/fb;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/fb;->d(Lcom/roidapp/photogrid/release/fb;)Landroid/widget/HorizontalScrollView;

    move-result-object v1

    iget-object v2, p0, Lcom/roidapp/photogrid/release/fd;->a:Lcom/roidapp/photogrid/release/fb;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/fb;->e(Lcom/roidapp/photogrid/release/fb;)I

    move-result v2

    sub-int/2addr v0, v2

    invoke-virtual {v1, v0, v3}, Landroid/widget/HorizontalScrollView;->smoothScrollBy(II)V

    .line 207
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fd;->a:Lcom/roidapp/photogrid/release/fb;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/fb;->f(Lcom/roidapp/photogrid/release/fb;)I

    move-result v0

    if-nez v0, :cond_3

    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->W()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->W()I

    move-result v0

    if-eqz v0, :cond_0

    .line 213
    :cond_3
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fd;->a:Lcom/roidapp/photogrid/release/fb;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/fb;->g(Lcom/roidapp/photogrid/release/fb;)Landroid/view/ViewGroup;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/fd;->a:Lcom/roidapp/photogrid/release/fb;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/fb;->f(Lcom/roidapp/photogrid/release/fb;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    move-result-object v0

    .line 214
    if-eqz v0, :cond_4

    .line 215
    invoke-virtual {v0, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 217
    :cond_4
    invoke-virtual {p1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 218
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fd;->a:Lcom/roidapp/photogrid/release/fb;

    invoke-static {v0, v3}, Lcom/roidapp/photogrid/release/fb;->a(Lcom/roidapp/photogrid/release/fb;I)I

    .line 219
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fd;->a:Lcom/roidapp/photogrid/release/fb;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/fb;->b(Lcom/roidapp/photogrid/release/fb;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v0

    iget-object v0, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b:Lcom/roidapp/photogrid/release/mm;

    invoke-virtual {v0, v3, v3}, Lcom/roidapp/photogrid/release/mm;->a(IZ)V

    .line 220
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fd;->a:Lcom/roidapp/photogrid/release/fb;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/fb;->b(Lcom/roidapp/photogrid/release/fb;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v0

    invoke-virtual {v0, v3, v3}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->c(ZZ)V

    goto/16 :goto_0
.end method
