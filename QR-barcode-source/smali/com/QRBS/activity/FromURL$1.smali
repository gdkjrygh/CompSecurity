.class Lcom/QRBS/activity/FromURL$1;
.super Ljava/lang/Object;
.source "FromURL.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/QRBS/activity/FromURL;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/QRBS/activity/FromURL;


# direct methods
.method constructor <init>(Lcom/QRBS/activity/FromURL;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/QRBS/activity/FromURL$1;->this$0:Lcom/QRBS/activity/FromURL;

    .line 71
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 7
    .param p1, "view"    # Landroid/view/View;

    .prologue
    .line 75
    iget-object v2, p0, Lcom/QRBS/activity/FromURL$1;->this$0:Lcom/QRBS/activity/FromURL;

    invoke-virtual {v2}, Lcom/QRBS/activity/FromURL;->getBaseContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Lcom/scannerfire/utils/Utils;->getVibratePref(Landroid/content/Context;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 77
    iget-object v2, p0, Lcom/QRBS/activity/FromURL$1;->this$0:Lcom/QRBS/activity/FromURL;

    # getter for: Lcom/QRBS/activity/FromURL;->utils:Lcom/scannerfire/utils/Utils;
    invoke-static {v2}, Lcom/QRBS/activity/FromURL;->access$1(Lcom/QRBS/activity/FromURL;)Lcom/scannerfire/utils/Utils;

    move-result-object v2

    iget-object v3, p0, Lcom/QRBS/activity/FromURL$1;->this$0:Lcom/QRBS/activity/FromURL;

    invoke-virtual {v3}, Lcom/QRBS/activity/FromURL;->getBaseContext()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/scannerfire/utils/Utils;->getVibrator(Landroid/content/Context;)Landroid/os/Vibrator;

    move-result-object v1

    .line 78
    .local v1, "vibrator":Landroid/os/Vibrator;
    if-eqz v1, :cond_0

    .line 80
    const-wide/16 v2, 0x3c

    invoke-virtual {v1, v2, v3}, Landroid/os/Vibrator;->vibrate(J)V

    .line 85
    .end local v1    # "vibrator":Landroid/os/Vibrator;
    :cond_0
    iget-object v2, p0, Lcom/QRBS/activity/FromURL$1;->this$0:Lcom/QRBS/activity/FromURL;

    # getter for: Lcom/QRBS/activity/FromURL;->editUrl:Landroid/widget/EditText;
    invoke-static {v2}, Lcom/QRBS/activity/FromURL;->access$0(Lcom/QRBS/activity/FromURL;)Landroid/widget/EditText;

    move-result-object v2

    invoke-virtual {v2}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v2

    invoke-interface {v2}, Landroid/text/Editable;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, ""

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 87
    iget-object v2, p0, Lcom/QRBS/activity/FromURL$1;->this$0:Lcom/QRBS/activity/FromURL;

    # getter for: Lcom/QRBS/activity/FromURL;->app:Lcom/actionbarsherlock/app/SherlockActivity;
    invoke-static {v2}, Lcom/QRBS/activity/FromURL;->access$2(Lcom/QRBS/activity/FromURL;)Lcom/actionbarsherlock/app/SherlockActivity;

    move-result-object v2

    iget-object v3, p0, Lcom/QRBS/activity/FromURL$1;->this$0:Lcom/QRBS/activity/FromURL;

    const v4, 0x7f08010d

    invoke-virtual {v3, v4}, Lcom/QRBS/activity/FromURL;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/scannerfire/utils/Utils;->showToastNotification(Landroid/app/Activity;Ljava/lang/String;)V

    .line 94
    :goto_0
    return-void

    .line 91
    :cond_1
    iget-object v2, p0, Lcom/QRBS/activity/FromURL$1;->this$0:Lcom/QRBS/activity/FromURL;

    # getter for: Lcom/QRBS/activity/FromURL;->utils:Lcom/scannerfire/utils/Utils;
    invoke-static {v2}, Lcom/QRBS/activity/FromURL;->access$1(Lcom/QRBS/activity/FromURL;)Lcom/scannerfire/utils/Utils;

    move-result-object v2

    iget-object v3, p0, Lcom/QRBS/activity/FromURL$1;->this$0:Lcom/QRBS/activity/FromURL;

    const-string v4, ""

    iget-object v5, p0, Lcom/QRBS/activity/FromURL$1;->this$0:Lcom/QRBS/activity/FromURL;

    const v6, 0x7f0800f8

    invoke-virtual {v5, v6}, Lcom/QRBS/activity/FromURL;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v3, v4, v5}, Lcom/scannerfire/utils/Utils;->showProgress(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)Landroid/app/ProgressDialog;

    .line 92
    new-instance v0, Lcom/QRBS/activity/FromURL$DecodeTask;

    iget-object v2, p0, Lcom/QRBS/activity/FromURL$1;->this$0:Lcom/QRBS/activity/FromURL;

    const/4 v3, 0x0

    invoke-direct {v0, v2, v3}, Lcom/QRBS/activity/FromURL$DecodeTask;-><init>(Lcom/QRBS/activity/FromURL;Lcom/QRBS/activity/FromURL$DecodeTask;)V

    .line 93
    .local v0, "dt":Lcom/QRBS/activity/FromURL$DecodeTask;
    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/String;

    invoke-virtual {v0, v2}, Lcom/QRBS/activity/FromURL$DecodeTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    goto :goto_0
.end method
