.class final Lcom/roidapp/photogrid/cloud/cb;
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
    .line 853
    iput-object p1, p0, Lcom/roidapp/photogrid/cloud/cb;->b:Lcom/roidapp/photogrid/cloud/br;

    iput-object p2, p0, Lcom/roidapp/photogrid/cloud/cb;->a:Landroid/app/AlertDialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 4

    .prologue
    .line 856
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/cb;->b:Lcom/roidapp/photogrid/cloud/br;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/br;->c(Lcom/roidapp/photogrid/cloud/br;)Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    move-result-object v0

    const-string v1, "SharePage/ShareToFB/policy"

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/common/af;->b(Landroid/content/Context;Ljava/lang/String;)V

    .line 857
    sget-object v0, Lcom/roidapp/photogrid/cloud/br;->c:Ljava/lang/String;

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    .line 858
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/cb;->b:Lcom/roidapp/photogrid/cloud/br;

    invoke-static {v1}, Lcom/roidapp/photogrid/cloud/br;->c(Lcom/roidapp/photogrid/cloud/br;)Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    move-result-object v1

    new-instance v2, Landroid/content/Intent;

    const-string v3, "android.intent.action.VIEW"

    invoke-direct {v2, v3, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    invoke-virtual {v1, v2}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->startActivity(Landroid/content/Intent;)V

    .line 860
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/cb;->a:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->dismiss()V

    .line 861
    return-void
.end method
