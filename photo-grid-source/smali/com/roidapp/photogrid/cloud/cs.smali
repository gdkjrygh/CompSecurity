.class final Lcom/roidapp/photogrid/cloud/cs;
.super Lcom/roidapp/cloudlib/common/e;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;)V
    .locals 0

    .prologue
    .line 899
    iput-object p1, p0, Lcom/roidapp/photogrid/cloud/cs;->a:Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;

    invoke-direct {p0}, Lcom/roidapp/cloudlib/common/e;-><init>()V

    return-void
.end method


# virtual methods
.method public final onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 2

    .prologue
    .line 903
    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/cs;->getDialog()Landroid/app/Dialog;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    .line 904
    invoke-super {p0, p1, p2, p3}, Lcom/roidapp/cloudlib/common/e;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method public final onDismiss(Landroid/content/DialogInterface;)V
    .locals 2

    .prologue
    .line 909
    invoke-super {p0, p1}, Lcom/roidapp/cloudlib/common/e;->onDismiss(Landroid/content/DialogInterface;)V

    .line 910
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/cs;->a:Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->d(Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;)Lcom/roidapp/cloudlib/template/b/c;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 911
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/cs;->a:Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->d(Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;)Lcom/roidapp/cloudlib/template/b/c;

    move-result-object v0

    const/16 v1, 0x2402

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/template/b/c;->removeMessages(I)V

    .line 913
    :cond_0
    return-void
.end method
