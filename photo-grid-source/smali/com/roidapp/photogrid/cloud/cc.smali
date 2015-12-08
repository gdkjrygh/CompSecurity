.class final Lcom/roidapp/photogrid/cloud/cc;
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
    .line 865
    iput-object p1, p0, Lcom/roidapp/photogrid/cloud/cc;->b:Lcom/roidapp/photogrid/cloud/br;

    iput-object p2, p0, Lcom/roidapp/photogrid/cloud/cc;->a:Landroid/app/AlertDialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 868
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/cc;->b:Lcom/roidapp/photogrid/cloud/br;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/br;->c(Lcom/roidapp/photogrid/cloud/br;)Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    move-result-object v0

    const-string v1, "SharePage/ShareToFB/continue_share"

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/common/af;->b(Landroid/content/Context;Ljava/lang/String;)V

    .line 869
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/cc;->b:Lcom/roidapp/photogrid/cloud/br;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/br;->j(Lcom/roidapp/photogrid/cloud/br;)V

    .line 870
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/cc;->a:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->dismiss()V

    .line 871
    return-void
.end method
