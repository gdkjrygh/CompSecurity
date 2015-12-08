.class final Lcom/roidapp/photogrid/cloud/bp;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/ig;

.field final synthetic b:Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;Lcom/roidapp/photogrid/release/ig;)V
    .locals 0

    .prologue
    .line 477
    iput-object p1, p0, Lcom/roidapp/photogrid/cloud/bp;->b:Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;

    iput-object p2, p0, Lcom/roidapp/photogrid/cloud/bp;->a:Lcom/roidapp/photogrid/release/ig;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .prologue
    .line 481
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/bp;->b:Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;

    iget-object v0, v0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->i:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 482
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    invoke-interface {v0}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 483
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/bp;->b:Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;

    iget-object v1, v1, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->e:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v0}, Landroid/widget/LinearLayout;->removeView(Landroid/view/View;)V

    .line 484
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 485
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/bp;->b:Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;

    iget-object v1, v1, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->k:Ljava/util/HashMap;

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/Bitmap;

    .line 486
    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v2

    if-nez v2, :cond_0

    .line 487
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V

    .line 490
    :cond_0
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/bp;->b:Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;

    invoke-static {v1}, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->a(Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;)Z

    .line 491
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/bp;->b:Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;

    iget-object v1, v1, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->k:Ljava/util/HashMap;

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 492
    const-string v1, "delete_tag"

    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 493
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/bp;->b:Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;

    iget-object v0, v0, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->l:Ljava/util/List;

    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/bp;->a:Lcom/roidapp/photogrid/release/ig;

    invoke-interface {v0, v1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 494
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/bp;->b:Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->g()V

    .line 497
    return-void
.end method
