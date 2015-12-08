.class final Lcom/roidapp/imagelib/a/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/roidapp/imagelib/a/i;


# direct methods
.method constructor <init>(Lcom/roidapp/imagelib/a/i;)V
    .locals 0

    .prologue
    .line 763
    iput-object p1, p0, Lcom/roidapp/imagelib/a/v;->a:Lcom/roidapp/imagelib/a/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    .line 766
    iget-object v0, p0, Lcom/roidapp/imagelib/a/v;->a:Lcom/roidapp/imagelib/a/i;

    invoke-static {v0}, Lcom/roidapp/imagelib/a/i;->l(Lcom/roidapp/imagelib/a/i;)Lcom/roidapp/imagelib/a/ah;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/imagelib/a/v;->a:Lcom/roidapp/imagelib/a/i;

    invoke-static {v0}, Lcom/roidapp/imagelib/a/i;->l(Lcom/roidapp/imagelib/a/i;)Lcom/roidapp/imagelib/a/ah;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/imagelib/a/ah;->k()Z

    move-result v0

    if-nez v0, :cond_0

    .line 767
    iget-object v0, p0, Lcom/roidapp/imagelib/a/v;->a:Lcom/roidapp/imagelib/a/i;

    invoke-static {v0}, Lcom/roidapp/imagelib/a/i;->n(Lcom/roidapp/imagelib/a/i;)Landroid/widget/ImageView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 768
    iget-object v0, p0, Lcom/roidapp/imagelib/a/v;->a:Lcom/roidapp/imagelib/a/i;

    invoke-static {v0}, Lcom/roidapp/imagelib/a/i;->n(Lcom/roidapp/imagelib/a/i;)Landroid/widget/ImageView;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/imagelib/a/v;->a:Lcom/roidapp/imagelib/a/i;

    invoke-static {v1}, Lcom/roidapp/imagelib/a/i;->x(Lcom/roidapp/imagelib/a/i;)Landroid/view/animation/Animation;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->startAnimation(Landroid/view/animation/Animation;)V

    .line 770
    :cond_0
    return-void
.end method
