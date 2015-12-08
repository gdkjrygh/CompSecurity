.class final Lcom/roidapp/imagelib/a/q;
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
    .line 412
    iput-object p1, p0, Lcom/roidapp/imagelib/a/q;->a:Lcom/roidapp/imagelib/a/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    .line 415
    iget-object v0, p0, Lcom/roidapp/imagelib/a/q;->a:Lcom/roidapp/imagelib/a/i;

    invoke-virtual {v0}, Lcom/roidapp/imagelib/a/i;->isAdded()Z

    move-result v0

    if-nez v0, :cond_1

    .line 422
    :cond_0
    :goto_0
    return-void

    .line 416
    :cond_1
    iget-object v0, p0, Lcom/roidapp/imagelib/a/q;->a:Lcom/roidapp/imagelib/a/i;

    invoke-static {v0}, Lcom/roidapp/imagelib/a/i;->d(Lcom/roidapp/imagelib/a/i;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/TextView;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/roidapp/imagelib/c;->a:I

    invoke-static {v0, v1}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v0

    .line 418
    iget-object v1, p0, Lcom/roidapp/imagelib/a/q;->a:Lcom/roidapp/imagelib/a/i;

    invoke-static {v1}, Lcom/roidapp/imagelib/a/i;->d(Lcom/roidapp/imagelib/a/i;)Landroid/widget/TextView;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/TextView;->clearAnimation()V

    .line 419
    iget-object v1, p0, Lcom/roidapp/imagelib/a/q;->a:Lcom/roidapp/imagelib/a/i;

    invoke-static {v1}, Lcom/roidapp/imagelib/a/i;->d(Lcom/roidapp/imagelib/a/i;)Landroid/widget/TextView;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->startAnimation(Landroid/view/animation/Animation;)V

    .line 420
    iget-object v0, p0, Lcom/roidapp/imagelib/a/q;->a:Lcom/roidapp/imagelib/a/i;

    invoke-static {v0}, Lcom/roidapp/imagelib/a/i;->d(Lcom/roidapp/imagelib/a/i;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/TextView;->isShown()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 421
    iget-object v0, p0, Lcom/roidapp/imagelib/a/q;->a:Lcom/roidapp/imagelib/a/i;

    invoke-static {v0}, Lcom/roidapp/imagelib/a/i;->d(Lcom/roidapp/imagelib/a/i;)Landroid/widget/TextView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0
.end method
