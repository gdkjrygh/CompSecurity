.class Lcom/facebook/orca/compose/ad;
.super Ljava/lang/Object;
.source "ComposeFragment.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/facebook/orca/compose/ComposeFragment;


# direct methods
.method constructor <init>(Lcom/facebook/orca/compose/ComposeFragment;)V
    .locals 0

    .prologue
    .line 521
    iput-object p1, p0, Lcom/facebook/orca/compose/ad;->a:Lcom/facebook/orca/compose/ComposeFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 524
    iget-object v0, p0, Lcom/facebook/orca/compose/ad;->a:Lcom/facebook/orca/compose/ComposeFragment;

    invoke-static {v0}, Lcom/facebook/orca/compose/ComposeFragment;->m(Lcom/facebook/orca/compose/ComposeFragment;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 525
    iget-object v0, p0, Lcom/facebook/orca/compose/ad;->a:Lcom/facebook/orca/compose/ComposeFragment;

    const-string v1, "popup_dismiss_button"

    invoke-static {v0, v1}, Lcom/facebook/orca/compose/ComposeFragment;->a(Lcom/facebook/orca/compose/ComposeFragment;Ljava/lang/String;)V

    .line 526
    iget-object v0, p0, Lcom/facebook/orca/compose/ad;->a:Lcom/facebook/orca/compose/ComposeFragment;

    invoke-static {v0}, Lcom/facebook/orca/compose/ComposeFragment;->c(Lcom/facebook/orca/compose/ComposeFragment;)Lcom/facebook/orca/emoji/ah;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 527
    iget-object v0, p0, Lcom/facebook/orca/compose/ad;->a:Lcom/facebook/orca/compose/ComposeFragment;

    invoke-static {v0}, Lcom/facebook/orca/compose/ComposeFragment;->c(Lcom/facebook/orca/compose/ComposeFragment;)Lcom/facebook/orca/emoji/ah;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/orca/emoji/ah;->a()V

    .line 539
    :goto_0
    return-void

    .line 529
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/compose/ad;->a:Lcom/facebook/orca/compose/ComposeFragment;

    invoke-static {v0}, Lcom/facebook/orca/compose/ComposeFragment;->n(Lcom/facebook/orca/compose/ComposeFragment;)V

    goto :goto_0

    .line 532
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/compose/ad;->a:Lcom/facebook/orca/compose/ComposeFragment;

    invoke-static {v0}, Lcom/facebook/orca/compose/ComposeFragment;->o(Lcom/facebook/orca/compose/ComposeFragment;)Ljavax/inject/a;

    move-result-object v0

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 533
    iget-object v0, p0, Lcom/facebook/orca/compose/ad;->a:Lcom/facebook/orca/compose/ComposeFragment;

    const-string v1, "popup_open_button"

    invoke-static {v0, v1}, Lcom/facebook/orca/compose/ComposeFragment;->a(Lcom/facebook/orca/compose/ComposeFragment;Ljava/lang/String;)V

    .line 534
    iget-object v0, p0, Lcom/facebook/orca/compose/ad;->a:Lcom/facebook/orca/compose/ComposeFragment;

    invoke-static {v0}, Lcom/facebook/orca/compose/ComposeFragment;->p(Lcom/facebook/orca/compose/ComposeFragment;)V

    goto :goto_0

    .line 536
    :cond_2
    iget-object v0, p0, Lcom/facebook/orca/compose/ad;->a:Lcom/facebook/orca/compose/ComposeFragment;

    invoke-static {v0}, Lcom/facebook/orca/compose/ComposeFragment;->q(Lcom/facebook/orca/compose/ComposeFragment;)V

    goto :goto_0
.end method
