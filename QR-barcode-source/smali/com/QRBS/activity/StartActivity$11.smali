.class Lcom/QRBS/activity/StartActivity$11;
.super Ljava/lang/Object;
.source "StartActivity.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/QRBS/activity/StartActivity;->saveToCsv()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/QRBS/activity/StartActivity;

.field private final synthetic val$a:Landroid/app/AlertDialog;

.field private final synthetic val$editName:Landroid/widget/EditText;


# direct methods
.method constructor <init>(Lcom/QRBS/activity/StartActivity;Landroid/widget/EditText;Landroid/app/AlertDialog;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/QRBS/activity/StartActivity$11;->this$0:Lcom/QRBS/activity/StartActivity;

    iput-object p2, p0, Lcom/QRBS/activity/StartActivity$11;->val$editName:Landroid/widget/EditText;

    iput-object p3, p0, Lcom/QRBS/activity/StartActivity$11;->val$a:Landroid/app/AlertDialog;

    .line 492
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 14
    .param p1, "v"    # Landroid/view/View;

    .prologue
    const/4 v13, 0x0

    .line 498
    iget-object v11, p0, Lcom/QRBS/activity/StartActivity$11;->val$editName:Landroid/widget/EditText;

    invoke-virtual {v11}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v11

    invoke-interface {v11}, Landroid/text/Editable;->toString()Ljava/lang/String;

    move-result-object v7

    .line 499
    .local v7, "name":Ljava/lang/String;
    if-eqz v7, :cond_0

    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v11

    if-nez v11, :cond_2

    .line 500
    :cond_0
    iget-object v11, p0, Lcom/QRBS/activity/StartActivity$11;->this$0:Lcom/QRBS/activity/StartActivity;

    invoke-virtual {v11}, Lcom/QRBS/activity/StartActivity;->getParent()Landroid/app/Activity;

    move-result-object v11

    const v12, 0x7f08010d

    invoke-static {v11, v12, v13}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v11

    invoke-virtual {v11}, Landroid/widget/Toast;->show()V

    .line 545
    :cond_1
    :goto_0
    return-void

    .line 503
    :cond_2
    const-string v11, ".csv"

    invoke-virtual {v7, v11}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_3

    .line 504
    :goto_1
    new-instance v0, Lcom/scannerfire/db/DbAdapter;

    iget-object v11, p0, Lcom/QRBS/activity/StartActivity$11;->this$0:Lcom/QRBS/activity/StartActivity;

    invoke-direct {v0, v11}, Lcom/scannerfire/db/DbAdapter;-><init>(Landroid/content/Context;)V

    .line 505
    .local v0, "da":Lcom/scannerfire/db/DbAdapter;
    invoke-virtual {v0, v7}, Lcom/scannerfire/db/DbAdapter;->saveCSV(Ljava/lang/String;)Z

    move-result v10

    .line 507
    .local v10, "ret":Z
    if-eqz v10, :cond_1

    .line 508
    iget-object v11, p0, Lcom/QRBS/activity/StartActivity$11;->val$a:Landroid/app/AlertDialog;

    invoke-virtual {v11}, Landroid/app/AlertDialog;->dismiss()V

    .line 511
    new-instance v11, Landroid/support/v4/app/NotificationCompat$Builder;

    iget-object v12, p0, Lcom/QRBS/activity/StartActivity$11;->this$0:Lcom/QRBS/activity/StartActivity;

    invoke-direct {v11, v12}, Landroid/support/v4/app/NotificationCompat$Builder;-><init>(Landroid/content/Context;)V

    .line 512
    const v12, 0x7f0200cd

    invoke-virtual {v11, v12}, Landroid/support/v4/app/NotificationCompat$Builder;->setSmallIcon(I)Landroid/support/v4/app/NotificationCompat$Builder;

    move-result-object v11

    .line 513
    invoke-virtual {v11, v7}, Landroid/support/v4/app/NotificationCompat$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroid/support/v4/app/NotificationCompat$Builder;

    move-result-object v11

    .line 514
    const-string v12, "Open Csv File"

    invoke-virtual {v11, v12}, Landroid/support/v4/app/NotificationCompat$Builder;->setContentText(Ljava/lang/CharSequence;)Landroid/support/v4/app/NotificationCompat$Builder;

    move-result-object v4

    .line 517
    .local v4, "mBuilder":Landroid/support/v4/app/NotificationCompat$Builder;
    new-instance v3, Landroid/content/Intent;

    invoke-direct {v3}, Landroid/content/Intent;-><init>()V

    .line 518
    .local v3, "intent":Landroid/content/Intent;
    const-string v11, "android.intent.action.VIEW"

    invoke-virtual {v3, v11}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 519
    sget-object v11, Landroid/os/Environment;->DIRECTORY_DOWNLOADS:Ljava/lang/String;

    invoke-static {v11}, Landroid/os/Environment;->getExternalStoragePublicDirectory(Ljava/lang/String;)Ljava/io/File;

    move-result-object v1

    .line 520
    .local v1, "exportDir":Ljava/io/File;
    new-instance v2, Ljava/io/File;

    invoke-direct {v2, v1, v7}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 521
    .local v2, "file":Ljava/io/File;
    invoke-static {v2}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v11

    const-string v12, "text/csv"

    invoke-virtual {v3, v11, v12}, Landroid/content/Intent;->setDataAndType(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;

    .line 529
    const-string v11, "Open Csv with..."

    invoke-static {v3, v11}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    .line 531
    iget-object v11, p0, Lcom/QRBS/activity/StartActivity$11;->this$0:Lcom/QRBS/activity/StartActivity;

    .line 530
    invoke-static {v11, v13, v3, v13}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v9

    .line 533
    .local v9, "resultPendingIntent":Landroid/app/PendingIntent;
    invoke-virtual {v4, v9}, Landroid/support/v4/app/NotificationCompat$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroid/support/v4/app/NotificationCompat$Builder;

    .line 536
    const/4 v5, 0x1

    .line 539
    .local v5, "mNotificationId":I
    iget-object v11, p0, Lcom/QRBS/activity/StartActivity$11;->this$0:Lcom/QRBS/activity/StartActivity;

    const-string v12, "notification"

    invoke-virtual {v11, v12}, Lcom/QRBS/activity/StartActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroid/app/NotificationManager;

    .line 541
    .local v6, "mNotifyMgr":Landroid/app/NotificationManager;
    invoke-virtual {v4}, Landroid/support/v4/app/NotificationCompat$Builder;->build()Landroid/app/Notification;

    move-result-object v8

    .line 542
    .local v8, "noti":Landroid/app/Notification;
    const/16 v11, 0x10

    iput v11, v8, Landroid/app/Notification;->flags:I

    .line 543
    invoke-virtual {v6, v5, v8}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V

    goto :goto_0

    .line 503
    .end local v0    # "da":Lcom/scannerfire/db/DbAdapter;
    .end local v1    # "exportDir":Ljava/io/File;
    .end local v2    # "file":Ljava/io/File;
    .end local v3    # "intent":Landroid/content/Intent;
    .end local v4    # "mBuilder":Landroid/support/v4/app/NotificationCompat$Builder;
    .end local v5    # "mNotificationId":I
    .end local v6    # "mNotifyMgr":Landroid/app/NotificationManager;
    .end local v8    # "noti":Landroid/app/Notification;
    .end local v9    # "resultPendingIntent":Landroid/app/PendingIntent;
    .end local v10    # "ret":Z
    :cond_3
    new-instance v11, Ljava/lang/StringBuilder;

    invoke-static {v7}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v12

    invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v12, ".csv"

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    goto :goto_1
.end method
