.class public final Lcom/roidapp/photogrid/cloud/n;
.super Landroid/support/v4/app/DialogFragment;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field private a:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference",
            "<",
            "Lcom/roidapp/photogrid/cloud/BaseShareActivity;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 1849
    invoke-direct {p0}, Landroid/support/v4/app/DialogFragment;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/roidapp/photogrid/cloud/BaseShareActivity;)Lcom/roidapp/photogrid/cloud/n;
    .locals 1

    .prologue
    .line 1853
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/n;->a:Ljava/lang/ref/WeakReference;

    .line 1854
    return-object p0
.end method

.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 1879
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/n;->a:Ljava/lang/ref/WeakReference;

    if-nez v0, :cond_0

    .line 1880
    iput-object v2, p0, Lcom/roidapp/photogrid/cloud/n;->a:Ljava/lang/ref/WeakReference;

    .line 1901
    :goto_0
    return-void

    .line 1883
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/n;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    .line 1884
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->isFinishing()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 1885
    :cond_1
    iput-object v2, p0, Lcom/roidapp/photogrid/cloud/n;->a:Ljava/lang/ref/WeakReference;

    goto :goto_0

    .line 1888
    :cond_2
    packed-switch p2, :pswitch_data_0

    goto :goto_0

    .line 1897
    :pswitch_0
    const-string v1, "FitInstagramDialog/No"

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/common/af;->c(Landroid/content/Context;Ljava/lang/String;)V

    .line 1898
    iget-object v1, v0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->f:Ljava/lang/String;

    iget-object v2, v0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->h:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->a(Lcom/roidapp/photogrid/cloud/BaseShareActivity;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 1891
    :pswitch_1
    const-string v1, "FitInstagramDialog/Yes"

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/common/af;->c(Landroid/content/Context;Ljava/lang/String;)V

    .line 1892
    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->f(Lcom/roidapp/photogrid/cloud/BaseShareActivity;)V

    goto :goto_0

    .line 1888
    nop

    :pswitch_data_0
    .packed-switch -0x2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public final onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 4

    .prologue
    const/4 v3, 0x0

    const/4 v1, 0x0

    .line 1859
    const-string v0, "FitInstagramDialog/onCreate"

    invoke-static {v0}, Lcom/roidapp/photogrid/common/b;->a(Ljava/lang/String;)V

    .line 1860
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/n;->a:Ljava/lang/ref/WeakReference;

    if-nez v0, :cond_0

    .line 1861
    iput-object v1, p0, Lcom/roidapp/photogrid/cloud/n;->a:Ljava/lang/ref/WeakReference;

    .line 1862
    invoke-virtual {p0, v3}, Lcom/roidapp/photogrid/cloud/n;->setShowsDialog(Z)V

    move-object v0, v1

    .line 1874
    :goto_0
    return-object v0

    .line 1865
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/n;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    .line 1866
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->isFinishing()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 1867
    :cond_1
    iput-object v1, p0, Lcom/roidapp/photogrid/cloud/n;->a:Ljava/lang/ref/WeakReference;

    .line 1868
    invoke-virtual {p0, v3}, Lcom/roidapp/photogrid/cloud/n;->setShowsDialog(Z)V

    move-object v0, v1

    .line 1869
    goto :goto_0

    .line 1871
    :cond_2
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v2

    const v3, 0x7f0300a1

    invoke-virtual {v2, v3, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    .line 1872
    new-instance v2, Landroid/app/AlertDialog$Builder;

    invoke-direct {v2, v0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    invoke-virtual {v2, v1}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const v1, 0x7f070164

    invoke-virtual {v0, v1, p0}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const v1, 0x7f070163

    invoke-virtual {v0, v1, p0}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    goto :goto_0
.end method
