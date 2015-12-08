.class Lcom/capitalone/mobile/banking/session/TimeoutBroadcastReceiver$1;
.super Ljava/lang/Object;
.source "TimeoutBroadcastReceiver.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/capitalone/mobile/banking/session/TimeoutBroadcastReceiver;->onReceive(Landroid/content/Context;Landroid/content/Intent;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/capitalone/mobile/banking/session/TimeoutBroadcastReceiver;

.field final synthetic val$context:Landroid/content/Context;


# direct methods
.method constructor <init>(Lcom/capitalone/mobile/banking/session/TimeoutBroadcastReceiver;Landroid/content/Context;)V
    .locals 0

    .prologue
    .line 71
    iput-object p1, p0, Lcom/capitalone/mobile/banking/session/TimeoutBroadcastReceiver$1;->this$0:Lcom/capitalone/mobile/banking/session/TimeoutBroadcastReceiver;

    iput-object p2, p0, Lcom/capitalone/mobile/banking/session/TimeoutBroadcastReceiver$1;->val$context:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 8

    .prologue
    const/high16 v6, 0x14000000

    const/4 v7, 0x1

    .line 75
    iget-object v4, p0, Lcom/capitalone/mobile/banking/session/TimeoutBroadcastReceiver$1;->this$0:Lcom/capitalone/mobile/banking/session/TimeoutBroadcastReceiver;

    iget-object v5, p0, Lcom/capitalone/mobile/banking/session/TimeoutBroadcastReceiver$1;->val$context:Landroid/content/Context;

    # invokes: Lcom/capitalone/mobile/banking/session/TimeoutBroadcastReceiver;->isAppOnForeground(Landroid/content/Context;)Z
    invoke-static {v4, v5}, Lcom/capitalone/mobile/banking/session/TimeoutBroadcastReceiver;->access$000(Lcom/capitalone/mobile/banking/session/TimeoutBroadcastReceiver;Landroid/content/Context;)Z

    move-result v4

    if-nez v4, :cond_0

    .line 76
    const-string v4, "TimeoutBroadcastReceiver"

    const-string v5, "Application is in background, will send notification"

    invoke-static {v4, v5}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 82
    new-instance v0, Landroid/content/Intent;

    iget-object v4, p0, Lcom/capitalone/mobile/banking/session/TimeoutBroadcastReceiver$1;->val$context:Landroid/content/Context;

    const-class v5, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    invoke-direct {v0, v4, v5}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 83
    .local v0, "forward":Landroid/content/Intent;
    invoke-virtual {v0, v6}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 84
    const-string v4, "cof.flag_return_to_login"

    invoke-virtual {v0, v4, v7}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 87
    iget-object v4, p0, Lcom/capitalone/mobile/banking/session/TimeoutBroadcastReceiver$1;->val$context:Landroid/content/Context;

    const/16 v5, 0x64

    const/high16 v6, 0x8000000

    invoke-static {v4, v5, v0, v6}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v3

    .line 91
    .local v3, "pendingIntent":Landroid/app/PendingIntent;
    new-instance v4, Landroid/support/v4/app/NotificationCompat$Builder;

    iget-object v5, p0, Lcom/capitalone/mobile/banking/session/TimeoutBroadcastReceiver$1;->val$context:Landroid/content/Context;

    invoke-direct {v4, v5}, Landroid/support/v4/app/NotificationCompat$Builder;-><init>(Landroid/content/Context;)V

    iget-object v5, p0, Lcom/capitalone/mobile/banking/session/TimeoutBroadcastReceiver$1;->val$context:Landroid/content/Context;

    const v6, 0x7f090146

    invoke-virtual {v5, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Landroid/support/v4/app/NotificationCompat$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroid/support/v4/app/NotificationCompat$Builder;

    move-result-object v4

    iget-object v5, p0, Lcom/capitalone/mobile/banking/session/TimeoutBroadcastReceiver$1;->val$context:Landroid/content/Context;

    const v6, 0x7f090147

    invoke-virtual {v5, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Landroid/support/v4/app/NotificationCompat$Builder;->setContentText(Ljava/lang/CharSequence;)Landroid/support/v4/app/NotificationCompat$Builder;

    move-result-object v4

    invoke-virtual {v4, v7}, Landroid/support/v4/app/NotificationCompat$Builder;->setAutoCancel(Z)Landroid/support/v4/app/NotificationCompat$Builder;

    move-result-object v4

    iget-object v5, p0, Lcom/capitalone/mobile/banking/session/TimeoutBroadcastReceiver$1;->val$context:Landroid/content/Context;

    const v6, 0x7f090148

    invoke-virtual {v5, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Landroid/support/v4/app/NotificationCompat$Builder;->setTicker(Ljava/lang/CharSequence;)Landroid/support/v4/app/NotificationCompat$Builder;

    move-result-object v4

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    invoke-virtual {v4, v6, v7}, Landroid/support/v4/app/NotificationCompat$Builder;->setWhen(J)Landroid/support/v4/app/NotificationCompat$Builder;

    move-result-object v4

    const v5, 0x7f0200d2

    invoke-virtual {v4, v5}, Landroid/support/v4/app/NotificationCompat$Builder;->setSmallIcon(I)Landroid/support/v4/app/NotificationCompat$Builder;

    move-result-object v4

    const/4 v5, -0x1

    invoke-virtual {v4, v5}, Landroid/support/v4/app/NotificationCompat$Builder;->setPriority(I)Landroid/support/v4/app/NotificationCompat$Builder;

    move-result-object v4

    invoke-virtual {v4, v3}, Landroid/support/v4/app/NotificationCompat$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroid/support/v4/app/NotificationCompat$Builder;

    move-result-object v4

    invoke-virtual {v4}, Landroid/support/v4/app/NotificationCompat$Builder;->build()Landroid/app/Notification;

    move-result-object v2

    .line 99
    .local v2, "notification":Landroid/app/Notification;
    iget-object v4, p0, Lcom/capitalone/mobile/banking/session/TimeoutBroadcastReceiver$1;->val$context:Landroid/content/Context;

    const-string v5, "notification"

    invoke-virtual {v4, v5}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/app/NotificationManager;

    .line 100
    .local v1, "manager":Landroid/app/NotificationManager;
    const/16 v4, 0x4d2

    invoke-virtual {v1, v4, v2}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V

    .line 116
    .end local v0    # "forward":Landroid/content/Intent;
    .end local v1    # "manager":Landroid/app/NotificationManager;
    .end local v2    # "notification":Landroid/app/Notification;
    .end local v3    # "pendingIntent":Landroid/app/PendingIntent;
    :goto_0
    return-void

    .line 103
    :cond_0
    const-string v4, "TimeoutBroadcastReceiver"

    const-string v5, "Application is in foreground, will forward to timeout activity"

    invoke-static {v4, v5}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 105
    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->isCanadianApp()Z

    move-result v4

    if-eqz v4, :cond_1

    .line 107
    const-string v4, "try { app.returnToLogin(\'\', \'timeout\'); } catch (err) { console.log(err.message); }"

    invoke-static {v4}, Lcom/EnterpriseMobileBanking/AppHelper;->sendJavascript(Ljava/lang/String;)V

    goto :goto_0

    .line 110
    :cond_1
    new-instance v0, Landroid/content/Intent;

    iget-object v4, p0, Lcom/capitalone/mobile/banking/session/TimeoutBroadcastReceiver$1;->val$context:Landroid/content/Context;

    const-class v5, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    invoke-direct {v0, v4, v5}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 111
    .restart local v0    # "forward":Landroid/content/Intent;
    invoke-virtual {v0, v6}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 112
    const-string v4, "cof.flag_return_to_login"

    invoke-virtual {v0, v4, v7}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 113
    iget-object v4, p0, Lcom/capitalone/mobile/banking/session/TimeoutBroadcastReceiver$1;->val$context:Landroid/content/Context;

    invoke-virtual {v4, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    goto :goto_0
.end method
