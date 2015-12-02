.class Lcom/facebook/orca/compose/r;
.super Lcom/facebook/orca/photos/picking/i;
.source "ComposeFragment.java"


# instance fields
.field final synthetic a:Lcom/facebook/orca/compose/ComposeFragment;


# direct methods
.method constructor <init>(Lcom/facebook/orca/compose/ComposeFragment;)V
    .locals 0

    .prologue
    .line 675
    iput-object p1, p0, Lcom/facebook/orca/compose/r;->a:Lcom/facebook/orca/compose/ComposeFragment;

    invoke-direct {p0}, Lcom/facebook/orca/photos/picking/i;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 4

    .prologue
    .line 687
    iget-object v0, p0, Lcom/facebook/orca/compose/r;->a:Lcom/facebook/orca/compose/ComposeFragment;

    iget-object v1, p0, Lcom/facebook/orca/compose/r;->a:Lcom/facebook/orca/compose/ComposeFragment;

    iget-object v2, p0, Lcom/facebook/orca/compose/r;->a:Lcom/facebook/orca/compose/ComposeFragment;

    invoke-virtual {v2}, Lcom/facebook/orca/compose/ComposeFragment;->o()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/facebook/o;->image_attachment_failed_network:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/facebook/orca/compose/ComposeFragment;->b(Lcom/facebook/orca/compose/ComposeFragment;Ljava/lang/String;)Landroid/text/SpannableString;

    move-result-object v1

    sget-object v2, Lcom/facebook/orca/common/ui/widgets/d;->WARNING:Lcom/facebook/orca/common/ui/widgets/d;

    invoke-static {v0, v1, v2}, Lcom/facebook/orca/compose/ComposeFragment;->a(Lcom/facebook/orca/compose/ComposeFragment;Ljava/lang/CharSequence;Lcom/facebook/orca/common/ui/widgets/d;)V

    .line 689
    return-void
.end method

.method public a(Lcom/facebook/ui/media/attachments/MediaResource;)V
    .locals 3

    .prologue
    .line 678
    iget-object v0, p0, Lcom/facebook/orca/compose/r;->a:Lcom/facebook/orca/compose/ComposeFragment;

    invoke-static {v0}, Lcom/facebook/orca/compose/ComposeFragment;->F(Lcom/facebook/orca/compose/ComposeFragment;)Lcom/facebook/ui/media/attachments/d;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/facebook/ui/media/attachments/d;->b(Lcom/facebook/ui/media/attachments/MediaResource;)Lcom/facebook/ui/media/attachments/a;

    move-result-object v0

    .line 680
    if-eqz p1, :cond_0

    .line 681
    iget-object v1, p0, Lcom/facebook/orca/compose/r;->a:Lcom/facebook/orca/compose/ComposeFragment;

    invoke-static {v1}, Lcom/facebook/orca/compose/ComposeFragment;->y(Lcom/facebook/orca/compose/ComposeFragment;)Lcom/facebook/orca/compose/ComposeAttachmentContainer;

    move-result-object v1

    iget-object v2, p0, Lcom/facebook/orca/compose/r;->a:Lcom/facebook/orca/compose/ComposeFragment;

    invoke-static {v2}, Lcom/facebook/orca/compose/ComposeFragment;->x(Lcom/facebook/orca/compose/ComposeFragment;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Lcom/facebook/orca/compose/ComposeAttachmentContainer;->a(Lcom/facebook/ui/media/attachments/a;Ljava/lang/String;)V

    .line 683
    :cond_0
    return-void
.end method

.method public b()V
    .locals 0

    .prologue
    .line 693
    return-void
.end method

.method public c()V
    .locals 0

    .prologue
    .line 697
    return-void
.end method

.method public d()V
    .locals 1

    .prologue
    .line 701
    iget-object v0, p0, Lcom/facebook/orca/compose/r;->a:Lcom/facebook/orca/compose/ComposeFragment;

    invoke-static {v0}, Lcom/facebook/orca/compose/ComposeFragment;->y(Lcom/facebook/orca/compose/ComposeFragment;)Lcom/facebook/orca/compose/ComposeAttachmentContainer;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/compose/ComposeAttachmentContainer;->a()V

    .line 702
    return-void
.end method
