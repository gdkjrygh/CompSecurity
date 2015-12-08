.class final Lcom/roidapp/photogrid/release/nz;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/nn;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/nn;)V
    .locals 0

    .prologue
    .line 254
    iput-object p1, p0, Lcom/roidapp/photogrid/release/nz;->a:Lcom/roidapp/photogrid/release/nn;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 4

    .prologue
    const/4 v3, 0x1

    .line 258
    invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;

    move-result-object v0

    const-string v1, "mounted"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 259
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/nz;->a:Lcom/roidapp/photogrid/release/nn;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/nn;->c(Lcom/roidapp/photogrid/release/nn;)Landroid/content/Context;

    move-result-object v1

    const-class v2, Lcom/roidapp/photogrid/release/PathSelector;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 260
    const-string v1, "isFromDialogFragment"

    invoke-virtual {v0, v1, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 261
    iget-object v1, p0, Lcom/roidapp/photogrid/release/nz;->a:Lcom/roidapp/photogrid/release/nn;

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/nn;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    const v2, 0xcc01

    invoke-virtual {v1, v0, v2}, Landroid/support/v4/app/FragmentActivity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 266
    :goto_0
    return-void

    .line 263
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nz;->a:Lcom/roidapp/photogrid/release/nn;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/nn;->c(Lcom/roidapp/photogrid/release/nn;)Landroid/content/Context;

    move-result-object v0

    const v1, 0x7f07028d

    invoke-static {v0, v1, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    goto :goto_0
.end method
