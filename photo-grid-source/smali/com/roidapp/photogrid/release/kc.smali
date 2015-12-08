.class final Lcom/roidapp/photogrid/release/kc;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/ig;

.field final synthetic b:Lcom/roidapp/photogrid/release/ImageSelector;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/ImageSelector;Lcom/roidapp/photogrid/release/ig;)V
    .locals 0

    .prologue
    .line 1518
    iput-object p1, p0, Lcom/roidapp/photogrid/release/kc;->b:Lcom/roidapp/photogrid/release/ImageSelector;

    iput-object p2, p0, Lcom/roidapp/photogrid/release/kc;->a:Lcom/roidapp/photogrid/release/ig;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 4

    .prologue
    .line 1522
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kc;->b:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ImageSelector;->C(Lcom/roidapp/photogrid/release/ImageSelector;)Landroid/widget/TextView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 1523
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    invoke-interface {v0}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 1524
    iget-object v1, p0, Lcom/roidapp/photogrid/release/kc;->b:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/ImageSelector;->D(Lcom/roidapp/photogrid/release/ImageSelector;)Landroid/widget/LinearLayout;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/widget/LinearLayout;->removeView(Landroid/view/View;)V

    .line 1525
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 1526
    const-string v1, "#"

    invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v2

    .line 1527
    iget-object v1, p0, Lcom/roidapp/photogrid/release/kc;->b:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-static {v1, v2}, Lcom/roidapp/photogrid/release/ImageSelector;->b(Lcom/roidapp/photogrid/release/ImageSelector;Ljava/lang/String;)V

    .line 1528
    iget-object v1, p0, Lcom/roidapp/photogrid/release/kc;->b:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/ImageSelector;->E(Lcom/roidapp/photogrid/release/ImageSelector;)Ljava/util/HashMap;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/Bitmap;

    .line 1529
    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v3

    if-nez v3, :cond_0

    .line 1530
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V

    .line 1533
    :cond_0
    iget-object v1, p0, Lcom/roidapp/photogrid/release/kc;->b:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/ImageSelector;->l(Lcom/roidapp/photogrid/release/ImageSelector;)Z

    .line 1534
    iget-object v1, p0, Lcom/roidapp/photogrid/release/kc;->b:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/ImageSelector;->E(Lcom/roidapp/photogrid/release/ImageSelector;)Ljava/util/HashMap;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1536
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kc;->b:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ImageSelector;->k(Lcom/roidapp/photogrid/release/ImageSelector;)Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/kc;->a:Lcom/roidapp/photogrid/release/ig;

    invoke-interface {v0, v1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 1537
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kc;->b:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ImageSelector;->F(Lcom/roidapp/photogrid/release/ImageSelector;)V

    .line 1538
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kc;->b:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ImageSelector;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    const-string v1, "FragmentImagePreview"

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v0

    .line 1539
    if-eqz v0, :cond_1

    .line 1540
    check-cast v0, Lcom/roidapp/photogrid/release/kg;

    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/release/kg;->a(Ljava/lang/String;)V

    .line 1543
    :cond_1
    return-void
.end method
