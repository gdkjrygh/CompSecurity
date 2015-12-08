.class final Lcom/roidapp/photogrid/release/fe;
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
    .line 257
    iput-object p1, p0, Lcom/roidapp/photogrid/release/fe;->a:Lcom/roidapp/photogrid/release/fb;

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

    .line 261
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fe;->a:Lcom/roidapp/photogrid/release/fb;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/fb;->b(Lcom/roidapp/photogrid/release/fb;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v0

    iget-boolean v0, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->i:Z

    if-eqz v0, :cond_0

    .line 319
    :goto_0
    return-void

    .line 265
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fe;->a:Lcom/roidapp/photogrid/release/fb;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/fb;->d(Lcom/roidapp/photogrid/release/fb;)Landroid/widget/HorizontalScrollView;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 266
    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    move-result v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/fe;->a:Lcom/roidapp/photogrid/release/fb;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/fb;->d(Lcom/roidapp/photogrid/release/fb;)Landroid/widget/HorizontalScrollView;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/HorizontalScrollView;->getScrollX()I

    move-result v1

    sub-int/2addr v0, v1

    .line 268
    iget-object v1, p0, Lcom/roidapp/photogrid/release/fe;->a:Lcom/roidapp/photogrid/release/fb;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/fb;->e(Lcom/roidapp/photogrid/release/fb;)I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 269
    iget-object v1, p0, Lcom/roidapp/photogrid/release/fe;->a:Lcom/roidapp/photogrid/release/fb;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/fb;->d(Lcom/roidapp/photogrid/release/fb;)Landroid/widget/HorizontalScrollView;

    move-result-object v1

    iget-object v2, p0, Lcom/roidapp/photogrid/release/fe;->a:Lcom/roidapp/photogrid/release/fb;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/fb;->e(Lcom/roidapp/photogrid/release/fb;)I

    move-result v2

    sub-int/2addr v0, v2

    invoke-virtual {v1, v0, v3}, Landroid/widget/HorizontalScrollView;->smoothScrollBy(II)V

    .line 292
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fe;->a:Lcom/roidapp/photogrid/release/fb;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/fb;->h(Lcom/roidapp/photogrid/release/fb;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 293
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fe;->a:Lcom/roidapp/photogrid/release/fb;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/fb;->i(Lcom/roidapp/photogrid/release/fb;)I

    move-result v0

    .line 294
    const/4 v1, -0x1

    if-eq v0, v1, :cond_3

    .line 296
    iget-object v1, p0, Lcom/roidapp/photogrid/release/fe;->a:Lcom/roidapp/photogrid/release/fb;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/fb;->b(Lcom/roidapp/photogrid/release/fb;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v1

    iget-object v1, v1, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b:Lcom/roidapp/photogrid/release/mm;

    invoke-virtual {v1, v0, v3}, Lcom/roidapp/photogrid/release/mm;->a(IZ)V

    .line 297
    iget-object v1, p0, Lcom/roidapp/photogrid/release/fe;->a:Lcom/roidapp/photogrid/release/fb;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/fb;->b(Lcom/roidapp/photogrid/release/fb;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v1

    invoke-virtual {v1, v3, v3}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(ZZ)Z

    .line 300
    iget-object v1, p0, Lcom/roidapp/photogrid/release/fe;->a:Lcom/roidapp/photogrid/release/fb;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/fb;->g(Lcom/roidapp/photogrid/release/fb;)Landroid/view/ViewGroup;

    move-result-object v1

    iget-object v2, p0, Lcom/roidapp/photogrid/release/fe;->a:Lcom/roidapp/photogrid/release/fb;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/fb;->f(Lcom/roidapp/photogrid/release/fb;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    move-result-object v1

    .line 301
    if-eqz v1, :cond_2

    .line 302
    invoke-virtual {v1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, v5}, Landroid/view/View;->setVisibility(I)V

    .line 304
    :cond_2
    iget-object v1, p0, Lcom/roidapp/photogrid/release/fe;->a:Lcom/roidapp/photogrid/release/fb;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/fb;->g(Lcom/roidapp/photogrid/release/fb;)Landroid/view/ViewGroup;

    move-result-object v1

    add-int/lit8 v2, v0, 0x2

    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 305
    iget-object v1, p0, Lcom/roidapp/photogrid/release/fe;->a:Lcom/roidapp/photogrid/release/fb;

    invoke-static {v1, v0}, Lcom/roidapp/photogrid/release/fb;->a(Lcom/roidapp/photogrid/release/fb;I)I

    goto/16 :goto_0

    .line 308
    :cond_3
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fe;->a:Lcom/roidapp/photogrid/release/fb;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/fb;->j(Lcom/roidapp/photogrid/release/fb;)Z

    .line 312
    :cond_4
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fe;->a:Lcom/roidapp/photogrid/release/fb;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/fb;->f(Lcom/roidapp/photogrid/release/fb;)I

    move-result v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/fe;->a:Lcom/roidapp/photogrid/release/fb;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/fb;->k(Lcom/roidapp/photogrid/release/fb;)I

    move-result v1

    if-eq v0, v1, :cond_5

    .line 313
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fe;->a:Lcom/roidapp/photogrid/release/fb;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/fb;->g(Lcom/roidapp/photogrid/release/fb;)Landroid/view/ViewGroup;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/fe;->a:Lcom/roidapp/photogrid/release/fb;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/fb;->f(Lcom/roidapp/photogrid/release/fb;)I

    move-result v1

    add-int/lit8 v1, v1, 0x2

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/view/View;->setVisibility(I)V

    .line 314
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fe;->a:Lcom/roidapp/photogrid/release/fb;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/fe;->a:Lcom/roidapp/photogrid/release/fb;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/fb;->k(Lcom/roidapp/photogrid/release/fb;)I

    move-result v1

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/release/fb;->a(Lcom/roidapp/photogrid/release/fb;I)I

    .line 317
    :cond_5
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fe;->a:Lcom/roidapp/photogrid/release/fb;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/fb;->b(Lcom/roidapp/photogrid/release/fb;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v0

    iget-object v0, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b:Lcom/roidapp/photogrid/release/mm;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/fe;->a:Lcom/roidapp/photogrid/release/fb;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/fb;->k(Lcom/roidapp/photogrid/release/fb;)I

    move-result v1

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/photogrid/release/mm;->a(IZ)V

    .line 318
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fe;->a:Lcom/roidapp/photogrid/release/fb;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/fb;->b(Lcom/roidapp/photogrid/release/fb;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v0

    invoke-virtual {v0, v3, v3}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(ZZ)Z

    goto/16 :goto_0
.end method
