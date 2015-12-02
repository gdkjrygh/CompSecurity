.class Lcom/facebook/orca/compose/i;
.super Ljava/lang/Object;
.source "ComposeAttachmentContainer.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/facebook/ui/media/attachments/a;

.field final synthetic b:Lcom/facebook/orca/compose/ComposeAttachmentContainer;


# direct methods
.method constructor <init>(Lcom/facebook/orca/compose/ComposeAttachmentContainer;Lcom/facebook/ui/media/attachments/a;)V
    .locals 0

    .prologue
    .line 229
    iput-object p1, p0, Lcom/facebook/orca/compose/i;->b:Lcom/facebook/orca/compose/ComposeAttachmentContainer;

    iput-object p2, p0, Lcom/facebook/orca/compose/i;->a:Lcom/facebook/ui/media/attachments/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 232
    iget-object v0, p0, Lcom/facebook/orca/compose/i;->b:Lcom/facebook/orca/compose/ComposeAttachmentContainer;

    iget-object v1, p0, Lcom/facebook/orca/compose/i;->a:Lcom/facebook/ui/media/attachments/a;

    invoke-static {v0, v1}, Lcom/facebook/orca/compose/ComposeAttachmentContainer;->a(Lcom/facebook/orca/compose/ComposeAttachmentContainer;Lcom/facebook/ui/media/attachments/a;)V

    .line 233
    return-void
.end method
