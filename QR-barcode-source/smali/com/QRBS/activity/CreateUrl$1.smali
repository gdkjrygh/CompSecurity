.class Lcom/QRBS/activity/CreateUrl$1;
.super Ljava/lang/Object;
.source "CreateUrl.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/QRBS/activity/CreateUrl;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/QRBS/activity/CreateUrl;


# direct methods
.method constructor <init>(Lcom/QRBS/activity/CreateUrl;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/QRBS/activity/CreateUrl$1;->this$0:Lcom/QRBS/activity/CreateUrl;

    .line 59
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 61
    iget-object v1, p0, Lcom/QRBS/activity/CreateUrl$1;->this$0:Lcom/QRBS/activity/CreateUrl;

    iget-object v1, v1, Lcom/QRBS/activity/CreateUrl;->text:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-interface {v1}, Landroid/text/Editable;->toString()Ljava/lang/String;

    move-result-object v0

    .line 62
    .local v0, "s":Ljava/lang/String;
    invoke-static {v0}, Landroid/webkit/URLUtil;->isValidUrl(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "www."

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 63
    iget-object v1, p0, Lcom/QRBS/activity/CreateUrl$1;->this$0:Lcom/QRBS/activity/CreateUrl;

    iget-object v2, p0, Lcom/QRBS/activity/CreateUrl$1;->this$0:Lcom/QRBS/activity/CreateUrl;

    const v3, 0x7f0800fb

    invoke-virtual {v2, v3}, Lcom/QRBS/activity/CreateUrl;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/scannerfire/utils/Utils;->showToastNotification(Landroid/app/Activity;Ljava/lang/String;)V

    .line 68
    :goto_0
    return-void

    .line 66
    :cond_0
    const-string v1, "www."

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "http://"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 67
    :cond_1
    iget-object v1, p0, Lcom/QRBS/activity/CreateUrl$1;->this$0:Lcom/QRBS/activity/CreateUrl;

    # invokes: Lcom/QRBS/activity/CreateUrl;->compute(Ljava/lang/String;)V
    invoke-static {v1, v0}, Lcom/QRBS/activity/CreateUrl;->access$0(Lcom/QRBS/activity/CreateUrl;Ljava/lang/String;)V

    goto :goto_0
.end method
