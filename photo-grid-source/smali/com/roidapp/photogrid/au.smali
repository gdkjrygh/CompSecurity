.class final Lcom/roidapp/photogrid/au;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Ljava/io/File;

.field final synthetic b:Lcom/roidapp/photogrid/MainPage;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/MainPage;Ljava/io/File;)V
    .locals 0

    .prologue
    .line 1397
    iput-object p1, p0, Lcom/roidapp/photogrid/au;->b:Lcom/roidapp/photogrid/MainPage;

    iput-object p2, p0, Lcom/roidapp/photogrid/au;->a:Ljava/io/File;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 3

    .prologue
    .line 1403
    iget-object v0, p0, Lcom/roidapp/photogrid/au;->b:Lcom/roidapp/photogrid/MainPage;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/MainPage;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1404
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/roidapp/photogrid/au;->b:Lcom/roidapp/photogrid/MainPage;

    const-class v2, Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 1405
    const-string v1, "isCrash"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 1406
    const-string v1, "crashFile"

    iget-object v2, p0, Lcom/roidapp/photogrid/au;->a:Ljava/io/File;

    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1407
    iget-object v1, p0, Lcom/roidapp/photogrid/au;->b:Lcom/roidapp/photogrid/MainPage;

    invoke-virtual {v1, v0}, Lcom/roidapp/photogrid/MainPage;->startActivity(Landroid/content/Intent;)V

    .line 1408
    iget-object v0, p0, Lcom/roidapp/photogrid/au;->b:Lcom/roidapp/photogrid/MainPage;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/MainPage;->finish()V

    .line 1410
    :cond_0
    return-void
.end method
