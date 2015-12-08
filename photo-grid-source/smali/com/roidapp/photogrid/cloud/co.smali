.class final Lcom/roidapp/photogrid/cloud/co;
.super Lcom/roidapp/cloudlib/common/e;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;)V
    .locals 0

    .prologue
    .line 350
    iput-object p1, p0, Lcom/roidapp/photogrid/cloud/co;->a:Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;

    invoke-direct {p0}, Lcom/roidapp/cloudlib/common/e;-><init>()V

    return-void
.end method


# virtual methods
.method public final onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 2

    .prologue
    .line 354
    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/co;->getDialog()Landroid/app/Dialog;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    .line 355
    invoke-super {p0, p1, p2, p3}, Lcom/roidapp/cloudlib/common/e;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method public final onDismiss(Landroid/content/DialogInterface;)V
    .locals 2

    .prologue
    .line 360
    invoke-super {p0, p1}, Lcom/roidapp/cloudlib/common/e;->onDismiss(Landroid/content/DialogInterface;)V

    .line 361
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/co;->a:Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;->c(Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;)Lcom/roidapp/cloudlib/template/b/c;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 362
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/co;->a:Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;->c(Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;)Lcom/roidapp/cloudlib/template/b/c;

    move-result-object v0

    const/16 v1, 0x2402

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/template/b/c;->removeMessages(I)V

    .line 364
    :cond_0
    return-void
.end method
