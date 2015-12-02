.class Lcom/facebook/orca/compose/q;
.super Ljava/lang/Object;
.source "ComposeFragment.java"

# interfaces
.implements Lcom/facebook/orca/compose/k;


# instance fields
.field final synthetic a:Lcom/facebook/orca/compose/ComposeFragment;


# direct methods
.method constructor <init>(Lcom/facebook/orca/compose/ComposeFragment;)V
    .locals 0

    .prologue
    .line 614
    iput-object p1, p0, Lcom/facebook/orca/compose/q;->a:Lcom/facebook/orca/compose/ComposeFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .prologue
    .line 617
    iget-object v0, p0, Lcom/facebook/orca/compose/q;->a:Lcom/facebook/orca/compose/ComposeFragment;

    invoke-static {v0}, Lcom/facebook/orca/compose/ComposeFragment;->C(Lcom/facebook/orca/compose/ComposeFragment;)V

    .line 618
    return-void
.end method

.method public a(Lcom/facebook/ui/media/attachments/a;)V
    .locals 3

    .prologue
    .line 622
    iget-object v0, p0, Lcom/facebook/orca/compose/q;->a:Lcom/facebook/orca/compose/ComposeFragment;

    invoke-static {v0}, Lcom/facebook/orca/compose/ComposeFragment;->E(Lcom/facebook/orca/compose/ComposeFragment;)Lcom/facebook/orca/compose/aq;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/orca/compose/q;->a:Lcom/facebook/orca/compose/ComposeFragment;

    invoke-static {v1}, Lcom/facebook/orca/compose/ComposeFragment;->D(Lcom/facebook/orca/compose/ComposeFragment;)Lcom/facebook/orca/photos/picking/PickMediaOperation;

    move-result-object v1

    iget-object v2, p0, Lcom/facebook/orca/compose/q;->a:Lcom/facebook/orca/compose/ComposeFragment;

    invoke-static {v2}, Lcom/facebook/orca/compose/ComposeFragment;->y(Lcom/facebook/orca/compose/ComposeFragment;)Lcom/facebook/orca/compose/ComposeAttachmentContainer;

    move-result-object v2

    invoke-virtual {v2}, Lcom/facebook/orca/compose/ComposeAttachmentContainer;->getMediaResources()Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v1, v2, p1}, Lcom/facebook/orca/compose/aq;->a(Lcom/facebook/orca/photos/picking/PickMediaOperation;Ljava/util/List;Lcom/facebook/ui/media/attachments/a;)V

    .line 626
    return-void
.end method
