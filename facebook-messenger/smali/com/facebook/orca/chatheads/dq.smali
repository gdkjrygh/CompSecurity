.class Lcom/facebook/orca/chatheads/dq;
.super Ljava/lang/Object;
.source "ChatThreadView.java"

# interfaces
.implements Lcom/facebook/orca/chatheads/em;


# instance fields
.field final synthetic a:Lcom/facebook/orca/chatheads/dh;


# direct methods
.method constructor <init>(Lcom/facebook/orca/chatheads/dh;)V
    .locals 0

    .prologue
    .line 806
    iput-object p1, p0, Lcom/facebook/orca/chatheads/dq;->a:Lcom/facebook/orca/chatheads/dh;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/orca/chatheads/ek;)V
    .locals 1

    .prologue
    .line 824
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dq;->a:Lcom/facebook/orca/chatheads/dh;

    invoke-static {v0}, Lcom/facebook/orca/chatheads/dh;->g(Lcom/facebook/orca/chatheads/dh;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 825
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dq;->a:Lcom/facebook/orca/chatheads/dh;

    invoke-static {v0}, Lcom/facebook/orca/chatheads/dh;->f(Lcom/facebook/orca/chatheads/dh;)Lcom/facebook/orca/threadview/ThreadViewMessageFragment;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->T()V

    .line 828
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dq;->a:Lcom/facebook/orca/chatheads/dh;

    invoke-static {v0}, Lcom/facebook/orca/chatheads/dh;->h(Lcom/facebook/orca/chatheads/dh;)Lcom/facebook/orca/compose/av;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/compose/av;->b()V

    .line 829
    return-void
.end method

.method public a(Landroid/view/MotionEvent;)Z
    .locals 1

    .prologue
    .line 809
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dq;->a:Lcom/facebook/orca/chatheads/dh;

    invoke-static {v0}, Lcom/facebook/orca/chatheads/dh;->f(Lcom/facebook/orca/chatheads/dh;)Lcom/facebook/orca/threadview/ThreadViewMessageFragment;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->Q()Lcom/facebook/orca/compose/ComposeFragment;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/compose/ComposeFragment;->W()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 810
    const/4 v0, 0x0

    .line 819
    :goto_0
    return v0

    .line 813
    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/facebook/orca/chatheads/dq;->a:Lcom/facebook/orca/chatheads/dh;

    invoke-static {v0}, Lcom/facebook/orca/chatheads/dh;->f(Lcom/facebook/orca/chatheads/dh;)Lcom/facebook/orca/threadview/ThreadViewMessageFragment;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->Q()Lcom/facebook/orca/compose/ComposeFragment;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/facebook/orca/compose/ComposeFragment;->a(Landroid/view/MotionEvent;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 816
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dq;->a:Lcom/facebook/orca/chatheads/dh;

    invoke-static {v0}, Lcom/facebook/orca/chatheads/dh;->f(Lcom/facebook/orca/chatheads/dh;)Lcom/facebook/orca/threadview/ThreadViewMessageFragment;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->Q()Lcom/facebook/orca/compose/ComposeFragment;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/compose/ComposeFragment;->X()Z

    move-result v0

    goto :goto_0

    .line 819
    :cond_1
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public b(Lcom/facebook/orca/chatheads/ek;)V
    .locals 2

    .prologue
    .line 834
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dq;->a:Lcom/facebook/orca/chatheads/dh;

    invoke-static {v0}, Lcom/facebook/orca/chatheads/dh;->h(Lcom/facebook/orca/chatheads/dh;)Lcom/facebook/orca/compose/av;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/orca/chatheads/dq;->a:Lcom/facebook/orca/chatheads/dh;

    invoke-static {v1}, Lcom/facebook/orca/chatheads/dh;->f(Lcom/facebook/orca/chatheads/dh;)Lcom/facebook/orca/threadview/ThreadViewMessageFragment;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->Q()Lcom/facebook/orca/compose/ComposeFragment;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/orca/compose/ComposeFragment;->d()Lcom/facebook/orca/compose/ap;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/orca/compose/av;->a(Lcom/facebook/orca/compose/ap;)V

    .line 836
    return-void
.end method

.method public c(Lcom/facebook/orca/chatheads/ek;)V
    .locals 2

    .prologue
    .line 840
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dq;->a:Lcom/facebook/orca/chatheads/dh;

    const-string v1, "swipe_up_thread_view"

    invoke-static {v0, v1}, Lcom/facebook/orca/chatheads/dh;->a(Lcom/facebook/orca/chatheads/dh;Ljava/lang/String;)V

    .line 841
    return-void
.end method
