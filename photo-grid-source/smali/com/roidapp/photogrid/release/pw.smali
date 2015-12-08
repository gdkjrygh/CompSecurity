.class final Lcom/roidapp/photogrid/release/pw;
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
    .line 130
    iput-object p1, p0, Lcom/roidapp/photogrid/release/pw;->a:Lcom/roidapp/photogrid/release/PickFolder;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .prologue
    .line 132
    iget-object v0, p0, Lcom/roidapp/photogrid/release/pw;->a:Lcom/roidapp/photogrid/release/PickFolder;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/pw;->a:Lcom/roidapp/photogrid/release/PickFolder;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/PickFolder;->b(Lcom/roidapp/photogrid/release/PickFolder;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/release/PickFolder;->a(Lcom/roidapp/photogrid/release/PickFolder;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 145
    :goto_0
    return-void

    .line 135
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/pw;->a:Lcom/roidapp/photogrid/release/PickFolder;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/PickFolder;->u:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_1

    .line 136
    iget-object v0, p0, Lcom/roidapp/photogrid/release/pw;->a:Lcom/roidapp/photogrid/release/PickFolder;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/PickFolder;->u:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->removeAllViews()V

    .line 141
    :cond_1
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 142
    const-string v1, "added"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 143
    iget-object v1, p0, Lcom/roidapp/photogrid/release/pw;->a:Lcom/roidapp/photogrid/release/PickFolder;

    const/4 v2, 0x2

    invoke-virtual {v1, v2, v0}, Lcom/roidapp/photogrid/release/PickFolder;->setResult(ILandroid/content/Intent;)V

    .line 144
    iget-object v0, p0, Lcom/roidapp/photogrid/release/pw;->a:Lcom/roidapp/photogrid/release/PickFolder;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PickFolder;->finish()V

    goto :goto_0
.end method
