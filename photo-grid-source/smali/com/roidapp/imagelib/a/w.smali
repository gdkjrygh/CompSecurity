.class final Lcom/roidapp/imagelib/a/w;
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
    .line 773
    iput-object p1, p0, Lcom/roidapp/imagelib/a/w;->a:Lcom/roidapp/imagelib/a/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    .line 776
    iget-object v0, p0, Lcom/roidapp/imagelib/a/w;->a:Lcom/roidapp/imagelib/a/i;

    invoke-static {v0}, Lcom/roidapp/imagelib/a/i;->t(Lcom/roidapp/imagelib/a/i;)Landroid/widget/RelativeLayout;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 777
    iget-object v0, p0, Lcom/roidapp/imagelib/a/w;->a:Lcom/roidapp/imagelib/a/i;

    invoke-static {v0}, Lcom/roidapp/imagelib/a/i;->t(Lcom/roidapp/imagelib/a/i;)Landroid/widget/RelativeLayout;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/imagelib/a/w;->a:Lcom/roidapp/imagelib/a/i;

    invoke-static {v1}, Lcom/roidapp/imagelib/a/i;->x(Lcom/roidapp/imagelib/a/i;)Landroid/view/animation/Animation;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->startAnimation(Landroid/view/animation/Animation;)V

    .line 779
    return-void
.end method
