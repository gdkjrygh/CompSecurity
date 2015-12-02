.class Lcom/facebook/orca/broadcast/o;
.super Lcom/facebook/orca/photos/picking/i;
.source "ComposeBroadcastFragment.java"


# instance fields
.field final synthetic a:Lcom/facebook/orca/broadcast/ComposeBroadcastFragment;


# direct methods
.method constructor <init>(Lcom/facebook/orca/broadcast/ComposeBroadcastFragment;)V
    .locals 0

    .prologue
    .line 173
    iput-object p1, p0, Lcom/facebook/orca/broadcast/o;->a:Lcom/facebook/orca/broadcast/ComposeBroadcastFragment;

    invoke-direct {p0}, Lcom/facebook/orca/photos/picking/i;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    .prologue
    .line 187
    return-void
.end method

.method public a(Lcom/facebook/ui/media/attachments/MediaResource;)V
    .locals 4

    .prologue
    .line 176
    if-nez p1, :cond_0

    .line 183
    :goto_0
    return-void

    .line 180
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/broadcast/o;->a:Lcom/facebook/orca/broadcast/ComposeBroadcastFragment;

    invoke-static {v0}, Lcom/facebook/orca/broadcast/ComposeBroadcastFragment;->c(Lcom/facebook/orca/broadcast/ComposeBroadcastFragment;)Lcom/facebook/orca/compose/ComposeAttachmentContainer;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/orca/broadcast/o;->a:Lcom/facebook/orca/broadcast/ComposeBroadcastFragment;

    invoke-static {v1}, Lcom/facebook/orca/broadcast/ComposeBroadcastFragment;->g(Lcom/facebook/orca/broadcast/ComposeBroadcastFragment;)Lcom/facebook/ui/media/attachments/d;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/facebook/ui/media/attachments/d;->b(Lcom/facebook/ui/media/attachments/MediaResource;)Lcom/facebook/ui/media/attachments/a;

    move-result-object v1

    iget-object v2, p0, Lcom/facebook/orca/broadcast/o;->a:Lcom/facebook/orca/broadcast/ComposeBroadcastFragment;

    invoke-static {v2}, Lcom/facebook/orca/broadcast/ComposeBroadcastFragment;->h(Lcom/facebook/orca/broadcast/ComposeBroadcastFragment;)Lcom/facebook/common/time/a;

    move-result-object v2

    invoke-interface {v2}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/facebook/orca/compose/ComposeAttachmentContainer;->a(Lcom/facebook/ui/media/attachments/a;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public b()V
    .locals 0

    .prologue
    .line 191
    return-void
.end method

.method public c()V
    .locals 0

    .prologue
    .line 195
    return-void
.end method

.method public d()V
    .locals 1

    .prologue
    .line 199
    iget-object v0, p0, Lcom/facebook/orca/broadcast/o;->a:Lcom/facebook/orca/broadcast/ComposeBroadcastFragment;

    invoke-static {v0}, Lcom/facebook/orca/broadcast/ComposeBroadcastFragment;->c(Lcom/facebook/orca/broadcast/ComposeBroadcastFragment;)Lcom/facebook/orca/compose/ComposeAttachmentContainer;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/compose/ComposeAttachmentContainer;->a()V

    .line 200
    return-void
.end method
