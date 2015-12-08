.class Lcom/QRBS/activity/CreateUrl$2;
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
    iput-object p1, p0, Lcom/QRBS/activity/CreateUrl$2;->this$0:Lcom/QRBS/activity/CreateUrl;

    .line 74
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 8
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 76
    iget-object v3, p0, Lcom/QRBS/activity/CreateUrl$2;->this$0:Lcom/QRBS/activity/CreateUrl;

    iget-object v3, v3, Lcom/QRBS/activity/CreateUrl;->text:Landroid/widget/EditText;

    invoke-virtual {v3}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v3

    invoke-interface {v3}, Landroid/text/Editable;->toString()Ljava/lang/String;

    move-result-object v0

    .line 77
    .local v0, "s":Ljava/lang/String;
    invoke-static {v0}, Landroid/webkit/URLUtil;->isValidUrl(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_0

    const-string v3, "www."

    invoke-virtual {v0, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 78
    iget-object v3, p0, Lcom/QRBS/activity/CreateUrl$2;->this$0:Lcom/QRBS/activity/CreateUrl;

    iget-object v4, p0, Lcom/QRBS/activity/CreateUrl$2;->this$0:Lcom/QRBS/activity/CreateUrl;

    const v5, 0x7f0800fb

    invoke-virtual {v4, v5}, Lcom/QRBS/activity/CreateUrl;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/scannerfire/utils/Utils;->showToastNotification(Landroid/app/Activity;Ljava/lang/String;)V

    .line 92
    :goto_0
    return-void

    .line 82
    :cond_0
    new-instance v2, Lcom/scannerfire/utils/Utils;

    invoke-direct {v2}, Lcom/scannerfire/utils/Utils;-><init>()V

    .line 83
    .local v2, "u":Lcom/scannerfire/utils/Utils;
    iget-object v3, p0, Lcom/QRBS/activity/CreateUrl$2;->this$0:Lcom/QRBS/activity/CreateUrl;

    iget-object v3, v3, Lcom/QRBS/activity/CreateUrl;->activity:Landroid/app/Activity;

    invoke-virtual {v2, v3}, Lcom/scannerfire/utils/Utils;->checkConnectivity(Landroid/app/Activity;)Z

    move-result v3

    if-nez v3, :cond_1

    .line 84
    iget-object v3, p0, Lcom/QRBS/activity/CreateUrl$2;->this$0:Lcom/QRBS/activity/CreateUrl;

    iget-object v4, p0, Lcom/QRBS/activity/CreateUrl$2;->this$0:Lcom/QRBS/activity/CreateUrl;

    const v5, 0x7f080109

    invoke-virtual {v4, v5}, Lcom/QRBS/activity/CreateUrl;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/scannerfire/utils/Utils;->showToastNotification(Landroid/app/Activity;Ljava/lang/String;)V

    goto :goto_0

    .line 88
    :cond_1
    iget-object v3, p0, Lcom/QRBS/activity/CreateUrl$2;->this$0:Lcom/QRBS/activity/CreateUrl;

    iget-object v4, p0, Lcom/QRBS/activity/CreateUrl$2;->this$0:Lcom/QRBS/activity/CreateUrl;

    iget-object v4, v4, Lcom/QRBS/activity/CreateUrl;->activity:Landroid/app/Activity;

    iget-object v5, p0, Lcom/QRBS/activity/CreateUrl$2;->this$0:Lcom/QRBS/activity/CreateUrl;

    const v6, 0x7f08010a

    invoke-virtual {v5, v6}, Lcom/QRBS/activity/CreateUrl;->getString(I)Ljava/lang/String;

    move-result-object v5

    iget-object v6, p0, Lcom/QRBS/activity/CreateUrl$2;->this$0:Lcom/QRBS/activity/CreateUrl;

    const v7, 0x7f0800f9

    invoke-virtual {v6, v7}, Lcom/QRBS/activity/CreateUrl;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2, v4, v5, v6}, Lcom/scannerfire/utils/Utils;->showProgress(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)Landroid/app/ProgressDialog;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/QRBS/activity/CreateUrl;->access$2(Lcom/QRBS/activity/CreateUrl;Landroid/app/ProgressDialog;)V

    .line 89
    new-instance v1, Lcom/QRBS/activity/CreateUrl$MyTask;

    iget-object v3, p0, Lcom/QRBS/activity/CreateUrl$2;->this$0:Lcom/QRBS/activity/CreateUrl;

    const/4 v4, 0x0

    invoke-direct {v1, v3, v4}, Lcom/QRBS/activity/CreateUrl$MyTask;-><init>(Lcom/QRBS/activity/CreateUrl;Lcom/QRBS/activity/CreateUrl$MyTask;)V

    .line 90
    .local v1, "t":Lcom/QRBS/activity/CreateUrl$MyTask;
    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/String;

    const/4 v4, 0x0

    aput-object v0, v3, v4

    invoke-virtual {v1, v3}, Lcom/QRBS/activity/CreateUrl$MyTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    goto :goto_0
.end method
