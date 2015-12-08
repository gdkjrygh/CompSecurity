.class final Lcom/roidapp/photogrid/common/cd;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/common/cc;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/common/cc;)V
    .locals 0

    .prologue
    .line 32
    iput-object p1, p0, Lcom/roidapp/photogrid/common/cd;->a:Lcom/roidapp/photogrid/common/cc;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 3

    .prologue
    .line 36
    iget-object v0, p0, Lcom/roidapp/photogrid/common/cd;->a:Lcom/roidapp/photogrid/common/cc;

    iget-object v0, v0, Lcom/roidapp/photogrid/common/cc;->d:Ljava/lang/String;

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    .line 37
    new-instance v1, Landroid/content/Intent;

    const-string v2, "android.intent.action.VIEW"

    invoke-direct {v1, v2, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 38
    const/high16 v0, 0x10000000

    invoke-virtual {v1, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 39
    iget-object v0, p0, Lcom/roidapp/photogrid/common/cd;->a:Lcom/roidapp/photogrid/common/cc;

    invoke-static {v0}, Lcom/roidapp/photogrid/common/cc;->a(Lcom/roidapp/photogrid/common/cc;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 40
    return-void
.end method
