.class final Lcom/roidapp/imagelib/a/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/SeekBar$OnSeekBarChangeListener;


# instance fields
.field final synthetic a:Lcom/roidapp/imagelib/a/i;

.field private b:I


# direct methods
.method constructor <init>(Lcom/roidapp/imagelib/a/i;)V
    .locals 0

    .prologue
    .line 817
    iput-object p1, p0, Lcom/roidapp/imagelib/a/m;->a:Lcom/roidapp/imagelib/a/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onProgressChanged(Landroid/widget/SeekBar;IZ)V
    .locals 2

    .prologue
    .line 821
    if-eqz p3, :cond_0

    .line 822
    iput p2, p0, Lcom/roidapp/imagelib/a/m;->b:I

    .line 823
    iget-object v0, p0, Lcom/roidapp/imagelib/a/m;->a:Lcom/roidapp/imagelib/a/i;

    invoke-static {v0}, Lcom/roidapp/imagelib/a/i;->l(Lcom/roidapp/imagelib/a/i;)Lcom/roidapp/imagelib/a/ah;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 824
    iget-object v0, p0, Lcom/roidapp/imagelib/a/m;->a:Lcom/roidapp/imagelib/a/i;

    invoke-static {v0}, Lcom/roidapp/imagelib/a/i;->l(Lcom/roidapp/imagelib/a/i;)Lcom/roidapp/imagelib/a/ah;

    move-result-object v0

    iget v1, p0, Lcom/roidapp/imagelib/a/m;->b:I

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/a/ah;->a(I)V

    .line 825
    iget-object v0, p0, Lcom/roidapp/imagelib/a/m;->a:Lcom/roidapp/imagelib/a/i;

    invoke-static {v0}, Lcom/roidapp/imagelib/a/i;->l(Lcom/roidapp/imagelib/a/i;)Lcom/roidapp/imagelib/a/ah;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/imagelib/a/ah;->h()I

    move-result v0

    sput v0, Lcom/roidapp/imagelib/a/h;->i:I

    .line 828
    :cond_0
    return-void
.end method

.method public final onStartTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 832
    iget-object v0, p0, Lcom/roidapp/imagelib/a/m;->a:Lcom/roidapp/imagelib/a/i;

    invoke-static {v0}, Lcom/roidapp/imagelib/a/i;->t(Lcom/roidapp/imagelib/a/i;)Landroid/widget/RelativeLayout;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 833
    iget-object v0, p0, Lcom/roidapp/imagelib/a/m;->a:Lcom/roidapp/imagelib/a/i;

    invoke-static {v0}, Lcom/roidapp/imagelib/a/i;->t(Lcom/roidapp/imagelib/a/i;)Landroid/widget/RelativeLayout;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/imagelib/a/m;->a:Lcom/roidapp/imagelib/a/i;

    invoke-static {v1}, Lcom/roidapp/imagelib/a/i;->o(Lcom/roidapp/imagelib/a/i;)Landroid/view/animation/Animation;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->startAnimation(Landroid/view/animation/Animation;)V

    .line 834
    iget-object v0, p0, Lcom/roidapp/imagelib/a/m;->a:Lcom/roidapp/imagelib/a/i;

    invoke-static {v0}, Lcom/roidapp/imagelib/a/i;->s(Lcom/roidapp/imagelib/a/i;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/imagelib/a/m;->a:Lcom/roidapp/imagelib/a/i;

    invoke-static {v1}, Lcom/roidapp/imagelib/a/i;->u(Lcom/roidapp/imagelib/a/i;)Ljava/lang/Runnable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 835
    iget-object v0, p0, Lcom/roidapp/imagelib/a/m;->a:Lcom/roidapp/imagelib/a/i;

    invoke-static {v0}, Lcom/roidapp/imagelib/a/i;->s(Lcom/roidapp/imagelib/a/i;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/imagelib/a/m;->a:Lcom/roidapp/imagelib/a/i;

    invoke-static {v1}, Lcom/roidapp/imagelib/a/i;->v(Lcom/roidapp/imagelib/a/i;)Ljava/lang/Runnable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 836
    iget-object v0, p0, Lcom/roidapp/imagelib/a/m;->a:Lcom/roidapp/imagelib/a/i;

    invoke-static {v0, v2}, Lcom/roidapp/imagelib/a/i;->b(Lcom/roidapp/imagelib/a/i;Z)Z

    .line 837
    return-void
.end method

.method public final onStopTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 4

    .prologue
    .line 841
    iget-object v0, p0, Lcom/roidapp/imagelib/a/m;->a:Lcom/roidapp/imagelib/a/i;

    invoke-static {v0}, Lcom/roidapp/imagelib/a/i;->s(Lcom/roidapp/imagelib/a/i;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/imagelib/a/m;->a:Lcom/roidapp/imagelib/a/i;

    invoke-static {v1}, Lcom/roidapp/imagelib/a/i;->u(Lcom/roidapp/imagelib/a/i;)Ljava/lang/Runnable;

    move-result-object v1

    const-wide/16 v2, 0x258

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 842
    iget-object v0, p0, Lcom/roidapp/imagelib/a/m;->a:Lcom/roidapp/imagelib/a/i;

    invoke-static {v0}, Lcom/roidapp/imagelib/a/i;->s(Lcom/roidapp/imagelib/a/i;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/imagelib/a/m;->a:Lcom/roidapp/imagelib/a/i;

    invoke-static {v1}, Lcom/roidapp/imagelib/a/i;->v(Lcom/roidapp/imagelib/a/i;)Ljava/lang/Runnable;

    move-result-object v1

    const-wide/16 v2, 0x3e8

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 843
    return-void
.end method
