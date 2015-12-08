.class final Lcom/roidapp/photogrid/cloud/i;
.super Lcom/pinterest/pinit/PinItListener;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/cloud/BaseShareActivity;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/cloud/BaseShareActivity;)V
    .locals 0

    .prologue
    .line 936
    iput-object p1, p0, Lcom/roidapp/photogrid/cloud/i;->a:Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    invoke-direct {p0}, Lcom/pinterest/pinit/PinItListener;-><init>()V

    return-void
.end method


# virtual methods
.method public final onException(Ljava/lang/Exception;)V
    .locals 3

    .prologue
    .line 939
    invoke-super {p0, p1}, Lcom/pinterest/pinit/PinItListener;->onException(Ljava/lang/Exception;)V

    .line 940
    if-eqz p1, :cond_0

    .line 941
    instance-of v0, p1, Lcom/pinterest/pinit/exceptions/NotInstalledException;

    if-eqz v0, :cond_1

    .line 942
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/i;->a:Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/roidapp/photogrid/cloud/i;->a:Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    iget-object v2, v2, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->l:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "Pinterest/NotInstall"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/common/af;->b(Landroid/content/Context;Ljava/lang/String;)V

    .line 945
    :cond_0
    :goto_0
    return-void

    .line 943
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/i;->a:Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/an;->a(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_0
.end method
