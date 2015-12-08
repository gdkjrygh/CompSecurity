.class final Lcom/roidapp/photogrid/common/bj;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/common/be;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/common/be;)V
    .locals 0

    .prologue
    .line 228
    iput-object p1, p0, Lcom/roidapp/photogrid/common/bj;->a:Lcom/roidapp/photogrid/common/be;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 2

    .prologue
    .line 242
    iget-object v0, p0, Lcom/roidapp/photogrid/common/bj;->a:Lcom/roidapp/photogrid/common/be;

    invoke-static {v0}, Lcom/roidapp/photogrid/common/be;->e(Lcom/roidapp/photogrid/common/be;)Landroid/view/ViewGroup;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 243
    iget-object v0, p0, Lcom/roidapp/photogrid/common/bj;->a:Lcom/roidapp/photogrid/common/be;

    invoke-static {v0}, Lcom/roidapp/photogrid/common/be;->e(Lcom/roidapp/photogrid/common/be;)Landroid/view/ViewGroup;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 244
    iget-object v0, p0, Lcom/roidapp/photogrid/common/bj;->a:Lcom/roidapp/photogrid/common/be;

    invoke-static {v0}, Lcom/roidapp/photogrid/common/be;->e(Lcom/roidapp/photogrid/common/be;)Landroid/view/ViewGroup;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 246
    :cond_0
    return-void
.end method

.method public final onAnimationRepeat(Landroid/view/animation/Animation;)V
    .locals 0

    .prologue
    .line 238
    return-void
.end method

.method public final onAnimationStart(Landroid/view/animation/Animation;)V
    .locals 0

    .prologue
    .line 233
    return-void
.end method
