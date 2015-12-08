.class final Lcom/roidapp/photogrid/ag;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/MainPage;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/MainPage;)V
    .locals 0

    .prologue
    .line 715
    iput-object p1, p0, Lcom/roidapp/photogrid/ag;->a:Lcom/roidapp/photogrid/MainPage;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 731
    iget-object v0, p0, Lcom/roidapp/photogrid/ag;->a:Lcom/roidapp/photogrid/MainPage;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/roidapp/photogrid/MainPage;->a:Z

    .line 732
    iget-object v0, p0, Lcom/roidapp/photogrid/ag;->a:Lcom/roidapp/photogrid/MainPage;

    invoke-static {v0}, Lcom/roidapp/photogrid/MainPage;->i(Lcom/roidapp/photogrid/MainPage;)Landroid/widget/RelativeLayout;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 733
    iget-object v0, p0, Lcom/roidapp/photogrid/ag;->a:Lcom/roidapp/photogrid/MainPage;

    invoke-static {v0}, Lcom/roidapp/photogrid/MainPage;->j(Lcom/roidapp/photogrid/MainPage;)Landroid/widget/ImageView;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 734
    iget-object v0, p0, Lcom/roidapp/photogrid/ag;->a:Lcom/roidapp/photogrid/MainPage;

    invoke-static {v0}, Lcom/roidapp/photogrid/MainPage;->j(Lcom/roidapp/photogrid/MainPage;)Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 736
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/ag;->a:Lcom/roidapp/photogrid/MainPage;

    invoke-static {v0}, Lcom/roidapp/photogrid/MainPage;->k(Lcom/roidapp/photogrid/MainPage;)Landroid/widget/ImageView;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 737
    iget-object v0, p0, Lcom/roidapp/photogrid/ag;->a:Lcom/roidapp/photogrid/MainPage;

    invoke-static {v0}, Lcom/roidapp/photogrid/MainPage;->k(Lcom/roidapp/photogrid/MainPage;)Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 739
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/ag;->a:Lcom/roidapp/photogrid/MainPage;

    invoke-static {v0}, Lcom/roidapp/photogrid/MainPage;->l(Lcom/roidapp/photogrid/MainPage;)Landroid/graphics/Bitmap;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/roidapp/photogrid/ag;->a:Lcom/roidapp/photogrid/MainPage;

    invoke-static {v0}, Lcom/roidapp/photogrid/MainPage;->l(Lcom/roidapp/photogrid/MainPage;)Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_2

    .line 740
    iget-object v0, p0, Lcom/roidapp/photogrid/ag;->a:Lcom/roidapp/photogrid/MainPage;

    invoke-static {v0}, Lcom/roidapp/photogrid/MainPage;->l(Lcom/roidapp/photogrid/MainPage;)Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 742
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/ag;->a:Lcom/roidapp/photogrid/MainPage;

    invoke-static {v0}, Lcom/roidapp/photogrid/MainPage;->m(Lcom/roidapp/photogrid/MainPage;)Landroid/graphics/Bitmap;

    move-result-object v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/roidapp/photogrid/ag;->a:Lcom/roidapp/photogrid/MainPage;

    invoke-static {v0}, Lcom/roidapp/photogrid/MainPage;->m(Lcom/roidapp/photogrid/MainPage;)Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_3

    .line 743
    iget-object v0, p0, Lcom/roidapp/photogrid/ag;->a:Lcom/roidapp/photogrid/MainPage;

    invoke-static {v0}, Lcom/roidapp/photogrid/MainPage;->m(Lcom/roidapp/photogrid/MainPage;)Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 745
    :cond_3
    iget-object v0, p0, Lcom/roidapp/photogrid/ag;->a:Lcom/roidapp/photogrid/MainPage;

    invoke-static {v0}, Lcom/roidapp/photogrid/MainPage;->n(Lcom/roidapp/photogrid/MainPage;)Landroid/graphics/Bitmap;

    .line 746
    iget-object v0, p0, Lcom/roidapp/photogrid/ag;->a:Lcom/roidapp/photogrid/MainPage;

    invoke-static {v0}, Lcom/roidapp/photogrid/MainPage;->o(Lcom/roidapp/photogrid/MainPage;)Landroid/graphics/Bitmap;

    .line 747
    iget-object v0, p0, Lcom/roidapp/photogrid/ag;->a:Lcom/roidapp/photogrid/MainPage;

    invoke-static {v0}, Lcom/roidapp/photogrid/MainPage;->p(Lcom/roidapp/photogrid/MainPage;)V

    .line 805
    iget-object v0, p0, Lcom/roidapp/photogrid/ag;->a:Lcom/roidapp/photogrid/MainPage;

    invoke-static {v0}, Lcom/roidapp/photogrid/MainPage;->q(Lcom/roidapp/photogrid/MainPage;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 807
    iget-object v0, p0, Lcom/roidapp/photogrid/ag;->a:Lcom/roidapp/photogrid/MainPage;

    invoke-static {v0}, Lcom/roidapp/photogrid/MainPage;->r(Lcom/roidapp/photogrid/MainPage;)V

    .line 808
    iget-object v0, p0, Lcom/roidapp/photogrid/ag;->a:Lcom/roidapp/photogrid/MainPage;

    const-string v1, "workspace_info"

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/MainPage;->a(Lcom/roidapp/photogrid/MainPage;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 809
    iget-object v0, p0, Lcom/roidapp/photogrid/ag;->a:Lcom/roidapp/photogrid/MainPage;

    invoke-static {v0}, Lcom/roidapp/photogrid/MainPage;->s(Lcom/roidapp/photogrid/MainPage;)V

    .line 814
    :cond_4
    iget-object v0, p0, Lcom/roidapp/photogrid/ag;->a:Lcom/roidapp/photogrid/MainPage;

    invoke-static {v0}, Lcom/roidapp/photogrid/MainPage;->h(Lcom/roidapp/photogrid/MainPage;)V

    .line 815
    return-void
.end method

.method public final onAnimationRepeat(Landroid/view/animation/Animation;)V
    .locals 0

    .prologue
    .line 726
    return-void
.end method

.method public final onAnimationStart(Landroid/view/animation/Animation;)V
    .locals 0

    .prologue
    .line 721
    return-void
.end method
