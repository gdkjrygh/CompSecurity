.class Lcom/facebook/orca/compose/ah;
.super Ljava/lang/Object;
.source "ComposeFragment.java"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field final synthetic a:Lcom/facebook/orca/compose/ComposeFragment;


# direct methods
.method constructor <init>(Lcom/facebook/orca/compose/ComposeFragment;)V
    .locals 0

    .prologue
    .line 581
    iput-object p1, p0, Lcom/facebook/orca/compose/ah;->a:Lcom/facebook/orca/compose/ComposeFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 586
    iget-object v0, p0, Lcom/facebook/orca/compose/ah;->a:Lcom/facebook/orca/compose/ComposeFragment;

    invoke-static {v0}, Lcom/facebook/orca/compose/ComposeFragment;->t(Lcom/facebook/orca/compose/ComposeFragment;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/compose/ah;->a:Lcom/facebook/orca/compose/ComposeFragment;

    invoke-static {v0}, Lcom/facebook/orca/compose/ComposeFragment;->u(Lcom/facebook/orca/compose/ComposeFragment;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 587
    iget-object v0, p0, Lcom/facebook/orca/compose/ah;->a:Lcom/facebook/orca/compose/ComposeFragment;

    invoke-static {v0}, Lcom/facebook/orca/compose/ComposeFragment;->v(Lcom/facebook/orca/compose/ComposeFragment;)V

    .line 589
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/compose/ah;->a:Lcom/facebook/orca/compose/ComposeFragment;

    invoke-static {v0, v1}, Lcom/facebook/orca/compose/ComposeFragment;->c(Lcom/facebook/orca/compose/ComposeFragment;Z)Z

    .line 591
    iget-object v0, p0, Lcom/facebook/orca/compose/ah;->a:Lcom/facebook/orca/compose/ComposeFragment;

    invoke-static {v0}, Lcom/facebook/orca/compose/ComposeFragment;->w(Lcom/facebook/orca/compose/ComposeFragment;)V

    .line 592
    iget-object v0, p0, Lcom/facebook/orca/compose/ah;->a:Lcom/facebook/orca/compose/ComposeFragment;

    invoke-static {v0}, Lcom/facebook/orca/compose/ComposeFragment;->k(Lcom/facebook/orca/compose/ComposeFragment;)V

    .line 594
    return v1
.end method
