.class Lcom/facebook/orca/broadcast/m;
.super Ljava/lang/Object;
.source "ComposeBroadcastFragment.java"

# interfaces
.implements Lcom/facebook/orca/compose/k;


# instance fields
.field final synthetic a:Lcom/facebook/orca/broadcast/ComposeBroadcastFragment;


# direct methods
.method constructor <init>(Lcom/facebook/orca/broadcast/ComposeBroadcastFragment;)V
    .locals 0

    .prologue
    .line 127
    iput-object p1, p0, Lcom/facebook/orca/broadcast/m;->a:Lcom/facebook/orca/broadcast/ComposeBroadcastFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .prologue
    .line 130
    iget-object v0, p0, Lcom/facebook/orca/broadcast/m;->a:Lcom/facebook/orca/broadcast/ComposeBroadcastFragment;

    invoke-static {v0}, Lcom/facebook/orca/broadcast/ComposeBroadcastFragment;->c(Lcom/facebook/orca/broadcast/ComposeBroadcastFragment;)Lcom/facebook/orca/compose/ComposeAttachmentContainer;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/compose/ComposeAttachmentContainer;->getMediaAttachments()Ljava/util/LinkedHashMap;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->isEmpty()Z

    move-result v0

    .line 131
    iget-object v1, p0, Lcom/facebook/orca/broadcast/m;->a:Lcom/facebook/orca/broadcast/ComposeBroadcastFragment;

    invoke-static {v1}, Lcom/facebook/orca/broadcast/ComposeBroadcastFragment;->d(Lcom/facebook/orca/broadcast/ComposeBroadcastFragment;)Landroid/view/View;

    move-result-object v1

    if-eqz v0, :cond_0

    const/16 v0, 0x8

    :goto_0
    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 132
    return-void

    .line 131
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public a(Lcom/facebook/ui/media/attachments/a;)V
    .locals 0

    .prologue
    .line 137
    return-void
.end method
