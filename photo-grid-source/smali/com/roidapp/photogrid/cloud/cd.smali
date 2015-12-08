.class final Lcom/roidapp/photogrid/cloud/cd;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Landroid/app/AlertDialog;

.field final synthetic b:Lcom/roidapp/photogrid/cloud/br;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/cloud/br;Landroid/app/AlertDialog;)V
    .locals 0

    .prologue
    .line 876
    iput-object p1, p0, Lcom/roidapp/photogrid/cloud/cd;->b:Lcom/roidapp/photogrid/cloud/br;

    iput-object p2, p0, Lcom/roidapp/photogrid/cloud/cd;->a:Landroid/app/AlertDialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 879
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/cd;->b:Lcom/roidapp/photogrid/cloud/br;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/br;->c(Lcom/roidapp/photogrid/cloud/br;)Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    move-result-object v0

    const-string v1, "SharePage/ShareToFB/back_edit"

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/common/af;->b(Landroid/content/Context;Ljava/lang/String;)V

    .line 880
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/cd;->b:Lcom/roidapp/photogrid/cloud/br;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/br;->c(Lcom/roidapp/photogrid/cloud/br;)Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    move-result-object v0

    const v1, 0x8800

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->setResult(I)V

    .line 881
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/cd;->b:Lcom/roidapp/photogrid/cloud/br;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/br;->c(Lcom/roidapp/photogrid/cloud/br;)Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->finish()V

    .line 882
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/cd;->a:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->dismiss()V

    .line 883
    return-void
.end method
