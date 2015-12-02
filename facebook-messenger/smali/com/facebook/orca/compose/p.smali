.class Lcom/facebook/orca/compose/p;
.super Ljava/lang/Object;
.source "ComposeFragment.java"

# interfaces
.implements Lcom/facebook/orca/compose/g;


# instance fields
.field final synthetic a:Lcom/facebook/orca/compose/ComposeFragment;


# direct methods
.method constructor <init>(Lcom/facebook/orca/compose/ComposeFragment;)V
    .locals 0

    .prologue
    .line 600
    iput-object p1, p0, Lcom/facebook/orca/compose/p;->a:Lcom/facebook/orca/compose/ComposeFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .prologue
    .line 609
    iget-object v0, p0, Lcom/facebook/orca/compose/p;->a:Lcom/facebook/orca/compose/ComposeFragment;

    invoke-static {v0}, Lcom/facebook/orca/compose/ComposeFragment;->A(Lcom/facebook/orca/compose/ComposeFragment;)V

    .line 610
    iget-object v0, p0, Lcom/facebook/orca/compose/p;->a:Lcom/facebook/orca/compose/ComposeFragment;

    invoke-static {v0}, Lcom/facebook/orca/compose/ComposeFragment;->B(Lcom/facebook/orca/compose/ComposeFragment;)V

    .line 611
    return-void
.end method

.method public a(Lcom/facebook/ui/media/attachments/a;)V
    .locals 2

    .prologue
    .line 603
    iget-object v0, p0, Lcom/facebook/orca/compose/p;->a:Lcom/facebook/orca/compose/ComposeFragment;

    invoke-static {v0}, Lcom/facebook/orca/compose/ComposeFragment;->y(Lcom/facebook/orca/compose/ComposeFragment;)Lcom/facebook/orca/compose/ComposeAttachmentContainer;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/orca/compose/p;->a:Lcom/facebook/orca/compose/ComposeFragment;

    invoke-static {v1}, Lcom/facebook/orca/compose/ComposeFragment;->x(Lcom/facebook/orca/compose/ComposeFragment;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/facebook/orca/compose/ComposeAttachmentContainer;->a(Lcom/facebook/ui/media/attachments/a;Ljava/lang/String;)V

    .line 604
    iget-object v0, p0, Lcom/facebook/orca/compose/p;->a:Lcom/facebook/orca/compose/ComposeFragment;

    invoke-static {v0}, Lcom/facebook/orca/compose/ComposeFragment;->z(Lcom/facebook/orca/compose/ComposeFragment;)V

    .line 605
    return-void
.end method
