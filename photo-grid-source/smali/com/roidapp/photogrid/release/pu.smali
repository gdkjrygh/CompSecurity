.class final Lcom/roidapp/photogrid/release/pu;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/PickFolder;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/PickFolder;)V
    .locals 0

    .prologue
    .line 99
    iput-object p1, p0, Lcom/roidapp/photogrid/release/pu;->a:Lcom/roidapp/photogrid/release/PickFolder;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .prologue
    .line 101
    iget-object v0, p0, Lcom/roidapp/photogrid/release/pu;->a:Lcom/roidapp/photogrid/release/PickFolder;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/PickFolder;->u:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_0

    .line 102
    iget-object v0, p0, Lcom/roidapp/photogrid/release/pu;->a:Lcom/roidapp/photogrid/release/PickFolder;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/PickFolder;->u:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->removeAllViews()V

    .line 107
    :cond_0
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 108
    const-string v1, "added"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 109
    iget-object v1, p0, Lcom/roidapp/photogrid/release/pu;->a:Lcom/roidapp/photogrid/release/PickFolder;

    const/4 v2, 0x2

    invoke-virtual {v1, v2, v0}, Lcom/roidapp/photogrid/release/PickFolder;->setResult(ILandroid/content/Intent;)V

    .line 110
    iget-object v0, p0, Lcom/roidapp/photogrid/release/pu;->a:Lcom/roidapp/photogrid/release/PickFolder;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PickFolder;->finish()V

    .line 111
    return-void
.end method
