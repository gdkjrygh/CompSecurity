.class final Lcom/roidapp/photogrid/release/ff;
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
    .line 364
    iput-object p1, p0, Lcom/roidapp/photogrid/release/ff;->a:Lcom/roidapp/photogrid/release/fb;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 6

    .prologue
    const/16 v5, 0x8

    const v4, 0x7f0d0493

    const/4 v3, 0x0

    .line 367
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ff;->a:Lcom/roidapp/photogrid/release/fb;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/fb;->b(Lcom/roidapp/photogrid/release/fb;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v0

    iget-boolean v0, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->i:Z

    if-eqz v0, :cond_1

    .line 415
    :cond_0
    :goto_0
    return-void

    .line 371
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ff;->a:Lcom/roidapp/photogrid/release/fb;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/fb;->d(Lcom/roidapp/photogrid/release/fb;)Landroid/widget/HorizontalScrollView;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 372
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ff;->a:Lcom/roidapp/photogrid/release/fb;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/fb;->l(Lcom/roidapp/photogrid/release/fb;)I

    move-result v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ff;->a:Lcom/roidapp/photogrid/release/fb;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/fb;->d(Lcom/roidapp/photogrid/release/fb;)Landroid/widget/HorizontalScrollView;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/HorizontalScrollView;->getLeft()I

    move-result v1

    sub-int/2addr v0, v1

    invoke-virtual {p1}, Landroid/view/View;->getRight()I

    move-result v1

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ff;->a:Lcom/roidapp/photogrid/release/fb;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/fb;->d(Lcom/roidapp/photogrid/release/fb;)Landroid/widget/HorizontalScrollView;

    move-result-object v2

    invoke-virtual {v2}, Landroid/widget/HorizontalScrollView;->getScrollX()I

    move-result v2

    sub-int/2addr v1, v2

    sub-int/2addr v0, v1

    .line 374
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ff;->a:Lcom/roidapp/photogrid/release/fb;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/fb;->e(Lcom/roidapp/photogrid/release/fb;)I

    move-result v1

    if-ge v0, v1, :cond_5

    .line 375
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ff;->a:Lcom/roidapp/photogrid/release/fb;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/fb;->d(Lcom/roidapp/photogrid/release/fb;)Landroid/widget/HorizontalScrollView;

    move-result-object v1

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ff;->a:Lcom/roidapp/photogrid/release/fb;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/fb;->e(Lcom/roidapp/photogrid/release/fb;)I

    move-result v2

    sub-int v0, v2, v0

    invoke-virtual {v1, v0, v3}, Landroid/widget/HorizontalScrollView;->smoothScrollBy(II)V

    .line 386
    :cond_2
    :goto_1
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 389
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ff;->a:Lcom/roidapp/photogrid/release/fb;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/fb;->f(Lcom/roidapp/photogrid/release/fb;)I

    move-result v1

    if-eq v1, v0, :cond_0

    .line 395
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ff;->a:Lcom/roidapp/photogrid/release/fb;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/fb;->b(Lcom/roidapp/photogrid/release/fb;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v1

    iget-object v1, v1, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b:Lcom/roidapp/photogrid/release/mm;

    invoke-virtual {v1, v0, v3}, Lcom/roidapp/photogrid/release/mm;->a(IZ)V

    .line 396
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ff;->a:Lcom/roidapp/photogrid/release/fb;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/fb;->b(Lcom/roidapp/photogrid/release/fb;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v1

    invoke-virtual {v1, v3, v3}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(ZZ)Z

    .line 399
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ff;->a:Lcom/roidapp/photogrid/release/fb;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/fb;->g(Lcom/roidapp/photogrid/release/fb;)Landroid/view/ViewGroup;

    move-result-object v1

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ff;->a:Lcom/roidapp/photogrid/release/fb;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/fb;->f(Lcom/roidapp/photogrid/release/fb;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    move-result-object v1

    .line 400
    if-eqz v1, :cond_3

    .line 401
    invoke-virtual {v1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, v5}, Landroid/view/View;->setVisibility(I)V

    .line 403
    :cond_3
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ff;->a:Lcom/roidapp/photogrid/release/fb;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/fb;->m(Lcom/roidapp/photogrid/release/fb;)I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_4

    .line 404
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ff;->a:Lcom/roidapp/photogrid/release/fb;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/fb;->g(Lcom/roidapp/photogrid/release/fb;)Landroid/view/ViewGroup;

    move-result-object v1

    const-string v2, "noMask"

    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    move-result-object v1

    .line 405
    if-eqz v1, :cond_4

    .line 406
    invoke-virtual {v1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, v5}, Landroid/view/View;->setVisibility(I)V

    .line 410
    :cond_4
    invoke-virtual {p1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 411
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ff;->a:Lcom/roidapp/photogrid/release/fb;

    invoke-static {v1, v0}, Lcom/roidapp/photogrid/release/fb;->a(Lcom/roidapp/photogrid/release/fb;I)I

    .line 414
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ff;->a:Lcom/roidapp/photogrid/release/fb;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/fb;->n(Lcom/roidapp/photogrid/release/fb;)Ljava/util/List;

    move-result-object v1

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 378
    :cond_5
    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    move-result v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ff;->a:Lcom/roidapp/photogrid/release/fb;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/fb;->d(Lcom/roidapp/photogrid/release/fb;)Landroid/widget/HorizontalScrollView;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/HorizontalScrollView;->getScrollX()I

    move-result v1

    sub-int/2addr v0, v1

    .line 380
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ff;->a:Lcom/roidapp/photogrid/release/fb;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/fb;->e(Lcom/roidapp/photogrid/release/fb;)I

    move-result v1

    if-ge v0, v1, :cond_2

    .line 381
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ff;->a:Lcom/roidapp/photogrid/release/fb;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/fb;->d(Lcom/roidapp/photogrid/release/fb;)Landroid/widget/HorizontalScrollView;

    move-result-object v1

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ff;->a:Lcom/roidapp/photogrid/release/fb;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/fb;->e(Lcom/roidapp/photogrid/release/fb;)I

    move-result v2

    sub-int/2addr v0, v2

    invoke-virtual {v1, v0, v3}, Landroid/widget/HorizontalScrollView;->smoothScrollBy(II)V

    goto/16 :goto_1
.end method
