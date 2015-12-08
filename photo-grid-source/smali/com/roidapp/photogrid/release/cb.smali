.class final Lcom/roidapp/photogrid/release/cb;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/by;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/by;)V
    .locals 0

    .prologue
    .line 234
    iput-object p1, p0, Lcom/roidapp/photogrid/release/cb;->a:Lcom/roidapp/photogrid/release/by;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 5

    .prologue
    const v4, 0x7f0d03ec

    const/4 v3, 0x0

    .line 237
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cb;->a:Lcom/roidapp/photogrid/release/by;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/by;->a(Lcom/roidapp/photogrid/release/by;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v0

    iget-boolean v0, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->i:Z

    if-eqz v0, :cond_1

    .line 271
    :cond_0
    :goto_0
    return-void

    .line 241
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cb;->a:Lcom/roidapp/photogrid/release/by;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/by;->g(Lcom/roidapp/photogrid/release/by;)Landroid/widget/HorizontalScrollView;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 242
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cb;->a:Lcom/roidapp/photogrid/release/by;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/by;->h(Lcom/roidapp/photogrid/release/by;)I

    move-result v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/cb;->a:Lcom/roidapp/photogrid/release/by;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/by;->g(Lcom/roidapp/photogrid/release/by;)Landroid/widget/HorizontalScrollView;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/HorizontalScrollView;->getLeft()I

    move-result v1

    sub-int/2addr v0, v1

    invoke-virtual {p1}, Landroid/view/View;->getRight()I

    move-result v1

    iget-object v2, p0, Lcom/roidapp/photogrid/release/cb;->a:Lcom/roidapp/photogrid/release/by;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/by;->g(Lcom/roidapp/photogrid/release/by;)Landroid/widget/HorizontalScrollView;

    move-result-object v2

    invoke-virtual {v2}, Landroid/widget/HorizontalScrollView;->getScrollX()I

    move-result v2

    sub-int/2addr v1, v2

    sub-int/2addr v0, v1

    .line 243
    iget-object v1, p0, Lcom/roidapp/photogrid/release/cb;->a:Lcom/roidapp/photogrid/release/by;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/by;->i(Lcom/roidapp/photogrid/release/by;)I

    move-result v1

    if-ge v0, v1, :cond_3

    .line 244
    iget-object v1, p0, Lcom/roidapp/photogrid/release/cb;->a:Lcom/roidapp/photogrid/release/by;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/by;->g(Lcom/roidapp/photogrid/release/by;)Landroid/widget/HorizontalScrollView;

    move-result-object v1

    iget-object v2, p0, Lcom/roidapp/photogrid/release/cb;->a:Lcom/roidapp/photogrid/release/by;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/by;->i(Lcom/roidapp/photogrid/release/by;)I

    move-result v2

    sub-int v0, v2, v0

    invoke-virtual {v1, v0, v3}, Landroid/widget/HorizontalScrollView;->smoothScrollBy(II)V

    .line 256
    :cond_2
    :goto_1
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 257
    const/4 v1, 0x1

    if-ne v0, v1, :cond_4

    .line 258
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cb;->a:Lcom/roidapp/photogrid/release/by;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/by;->a(Lcom/roidapp/photogrid/release/by;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/cb;->a:Lcom/roidapp/photogrid/release/by;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/by;->a(Lcom/roidapp/photogrid/release/by;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v1

    iget-object v1, v1, Lcom/roidapp/photogrid/release/PhotoGridActivity;->k:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Ljava/lang/String;)Z

    .line 259
    new-instance v0, Lcom/roidapp/photogrid/release/bu;

    invoke-direct {v0}, Lcom/roidapp/photogrid/release/bu;-><init>()V

    .line 260
    iget-object v1, p0, Lcom/roidapp/photogrid/release/cb;->a:Lcom/roidapp/photogrid/release/by;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/by;->j(Lcom/roidapp/photogrid/release/by;)Z

    move-result v1

    iget-object v2, p0, Lcom/roidapp/photogrid/release/cb;->a:Lcom/roidapp/photogrid/release/by;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/by;->k(Lcom/roidapp/photogrid/release/by;)Z

    move-result v2

    iget-object v3, p0, Lcom/roidapp/photogrid/release/cb;->a:Lcom/roidapp/photogrid/release/by;

    invoke-static {v3}, Lcom/roidapp/photogrid/release/by;->b(Lcom/roidapp/photogrid/release/by;)I

    move-result v3

    invoke-virtual {v0, v1, v2, v3}, Lcom/roidapp/photogrid/release/bu;->a(ZZI)V

    .line 261
    iget-object v1, p0, Lcom/roidapp/photogrid/release/cb;->a:Lcom/roidapp/photogrid/release/by;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/by;->a(Lcom/roidapp/photogrid/release/by;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v1

    const-string v2, "FragmentBgColor"

    invoke-virtual {v1, v4, v0, v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 247
    :cond_3
    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    move-result v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/cb;->a:Lcom/roidapp/photogrid/release/by;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/by;->g(Lcom/roidapp/photogrid/release/by;)Landroid/widget/HorizontalScrollView;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/HorizontalScrollView;->getScrollX()I

    move-result v1

    sub-int/2addr v0, v1

    .line 249
    iget-object v1, p0, Lcom/roidapp/photogrid/release/cb;->a:Lcom/roidapp/photogrid/release/by;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/by;->i(Lcom/roidapp/photogrid/release/by;)I

    move-result v1

    if-ge v0, v1, :cond_2

    .line 250
    iget-object v1, p0, Lcom/roidapp/photogrid/release/cb;->a:Lcom/roidapp/photogrid/release/by;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/by;->g(Lcom/roidapp/photogrid/release/by;)Landroid/widget/HorizontalScrollView;

    move-result-object v1

    iget-object v2, p0, Lcom/roidapp/photogrid/release/cb;->a:Lcom/roidapp/photogrid/release/by;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/by;->i(Lcom/roidapp/photogrid/release/by;)I

    move-result v2

    sub-int/2addr v0, v2

    invoke-virtual {v1, v0, v3}, Landroid/widget/HorizontalScrollView;->smoothScrollBy(II)V

    goto :goto_1

    .line 263
    :cond_4
    iget-object v1, p0, Lcom/roidapp/photogrid/release/cb;->a:Lcom/roidapp/photogrid/release/by;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/by;->a(Lcom/roidapp/photogrid/release/by;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v1

    const-string v2, "FragmentBgListSub"

    invoke-virtual {v1, v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 265
    new-instance v1, Lcom/roidapp/photogrid/release/cd;

    invoke-direct {v1}, Lcom/roidapp/photogrid/release/cd;-><init>()V

    .line 266
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/roidapp/photogrid/release/ih;->q(I)V

    .line 267
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cb;->a:Lcom/roidapp/photogrid/release/by;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/by;->j(Lcom/roidapp/photogrid/release/by;)Z

    move-result v0

    iget-object v2, p0, Lcom/roidapp/photogrid/release/cb;->a:Lcom/roidapp/photogrid/release/by;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/by;->k(Lcom/roidapp/photogrid/release/by;)Z

    move-result v2

    iget-object v3, p0, Lcom/roidapp/photogrid/release/cb;->a:Lcom/roidapp/photogrid/release/by;

    invoke-static {v3}, Lcom/roidapp/photogrid/release/by;->b(Lcom/roidapp/photogrid/release/by;)I

    move-result v3

    invoke-virtual {v1, v0, v2, v3}, Lcom/roidapp/photogrid/release/cd;->a(ZZI)V

    .line 268
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cb;->a:Lcom/roidapp/photogrid/release/by;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/by;->a(Lcom/roidapp/photogrid/release/by;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v0

    const-string v2, "FragmentBgListSub"

    invoke-virtual {v0, v4, v1, v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)V

    goto/16 :goto_0
.end method
