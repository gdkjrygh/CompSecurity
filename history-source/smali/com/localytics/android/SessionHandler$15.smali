.class Lcom/localytics/android/SessionHandler$15;
.super Ljava/lang/Object;
.source "SessionHandler.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/localytics/android/SessionHandler;->handleMessage(Landroid/os/Message;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/localytics/android/SessionHandler;

.field final synthetic val$intent:Landroid/content/Intent;


# direct methods
.method constructor <init>(Lcom/localytics/android/SessionHandler;Landroid/content/Intent;)V
    .locals 0

    .prologue
    .line 913
    iput-object p1, p0, Lcom/localytics/android/SessionHandler$15;->this$0:Lcom/localytics/android/SessionHandler;

    iput-object p2, p0, Lcom/localytics/android/SessionHandler$15;->val$intent:Landroid/content/Intent;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 15

    .prologue
    .line 918
    iget-object v12, p0, Lcom/localytics/android/SessionHandler$15;->this$0:Lcom/localytics/android/SessionHandler;

    # invokes: Lcom/localytics/android/SessionHandler;->isPushDisabled()Z
    invoke-static {v12}, Lcom/localytics/android/SessionHandler;->access$000(Lcom/localytics/android/SessionHandler;)Z

    move-result v12

    if-eqz v12, :cond_1

    .line 920
    sget-boolean v12, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v12, :cond_0

    .line 922
    const-string v12, "Localytics"

    const-string v13, "Got push notification while push is disabled."

    invoke-static {v12, v13}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 998
    :cond_0
    :goto_0
    return-void

    .line 928
    :cond_1
    const/4 v8, 0x0

    .line 929
    .local v8, "llString":Ljava/lang/String;
    iget-object v12, p0, Lcom/localytics/android/SessionHandler$15;->val$intent:Landroid/content/Intent;

    invoke-virtual {v12}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v12

    if-eqz v12, :cond_2

    .line 931
    iget-object v12, p0, Lcom/localytics/android/SessionHandler$15;->val$intent:Landroid/content/Intent;

    invoke-virtual {v12}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v12

    const-string v13, "ll"

    invoke-virtual {v12, v13}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 933
    :cond_2
    if-nez v8, :cond_3

    .line 935
    sget-boolean v12, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v12, :cond_0

    .line 937
    const-string v12, "Localytics"

    const-string v13, "Ignoring message that aren\'t from Localytics."

    invoke-static {v12, v13}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 943
    :cond_3
    const/4 v3, 0x0

    .line 947
    .local v3, "campaignId":I
    :try_start_0
    new-instance v7, Lorg/json/JSONObject;

    invoke-direct {v7, v8}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 948
    .local v7, "llObject":Lorg/json/JSONObject;
    const-string v12, "ca"

    invoke-virtual {v7, v12}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v3

    .line 960
    iget-object v12, p0, Lcom/localytics/android/SessionHandler$15;->val$intent:Landroid/content/Intent;

    invoke-virtual {v12}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v12

    const-string v13, "message"

    invoke-virtual {v12, v13}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 963
    .local v9, "message":Ljava/lang/String;
    const-string v1, ""

    .line 964
    .local v1, "appName":Ljava/lang/CharSequence;
    iget-object v12, p0, Lcom/localytics/android/SessionHandler$15;->this$0:Lcom/localytics/android/SessionHandler;

    iget-object v12, v12, Lcom/localytics/android/SessionHandler;->mContext:Landroid/content/Context;

    invoke-static {v12}, Lcom/localytics/android/DatapointHelper;->getLocalyticsNotificationIcon(Landroid/content/Context;)I

    move-result v0

    .line 965
    .local v0, "appIcon":I
    const/4 v6, 0x0

    .line 968
    .local v6, "launchIntent":Landroid/content/Intent;
    :try_start_1
    iget-object v12, p0, Lcom/localytics/android/SessionHandler$15;->this$0:Lcom/localytics/android/SessionHandler;

    iget-object v12, v12, Lcom/localytics/android/SessionHandler;->mContext:Landroid/content/Context;

    invoke-virtual {v12}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v12

    iget-object v13, p0, Lcom/localytics/android/SessionHandler$15;->this$0:Lcom/localytics/android/SessionHandler;

    iget-object v13, v13, Lcom/localytics/android/SessionHandler;->mContext:Landroid/content/Context;

    invoke-virtual {v13}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v13

    const/4 v14, 0x0

    invoke-virtual {v12, v13, v14}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object v2

    .line 969
    .local v2, "applicationInfo":Landroid/content/pm/ApplicationInfo;
    iget-object v12, p0, Lcom/localytics/android/SessionHandler$15;->this$0:Lcom/localytics/android/SessionHandler;

    iget-object v12, v12, Lcom/localytics/android/SessionHandler;->mContext:Landroid/content/Context;

    invoke-virtual {v12}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v12

    invoke-virtual {v12, v2}, Landroid/content/pm/PackageManager;->getApplicationLabel(Landroid/content/pm/ApplicationInfo;)Ljava/lang/CharSequence;

    move-result-object v1

    .line 970
    iget-object v12, p0, Lcom/localytics/android/SessionHandler$15;->this$0:Lcom/localytics/android/SessionHandler;

    iget-object v12, v12, Lcom/localytics/android/SessionHandler;->mContext:Landroid/content/Context;

    invoke-virtual {v12}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v12

    iget-object v13, p0, Lcom/localytics/android/SessionHandler$15;->this$0:Lcom/localytics/android/SessionHandler;

    iget-object v13, v13, Lcom/localytics/android/SessionHandler;->mContext:Landroid/content/Context;

    invoke-virtual {v13}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v12, v13}, Landroid/content/pm/PackageManager;->getLaunchIntentForPackage(Ljava/lang/String;)Landroid/content/Intent;
    :try_end_1
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v6

    .line 981
    .end local v2    # "applicationInfo":Landroid/content/pm/ApplicationInfo;
    :cond_4
    :goto_1
    new-instance v10, Landroid/app/Notification;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v12

    invoke-direct {v10, v0, v9, v12, v13}, Landroid/app/Notification;-><init>(ILjava/lang/CharSequence;J)V

    .line 984
    .local v10, "notification":Landroid/app/Notification;
    if-eqz v6, :cond_5

    .line 986
    iget-object v12, p0, Lcom/localytics/android/SessionHandler$15;->val$intent:Landroid/content/Intent;

    invoke-virtual {v6, v12}, Landroid/content/Intent;->putExtras(Landroid/content/Intent;)Landroid/content/Intent;

    .line 987
    iget-object v12, p0, Lcom/localytics/android/SessionHandler$15;->this$0:Lcom/localytics/android/SessionHandler;

    iget-object v12, v12, Lcom/localytics/android/SessionHandler;->mContext:Landroid/content/Context;

    const/4 v13, 0x0

    const/high16 v14, 0x8000000

    invoke-static {v12, v13, v6, v14}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v4

    .line 988
    .local v4, "contentIntent":Landroid/app/PendingIntent;
    iget-object v12, p0, Lcom/localytics/android/SessionHandler$15;->this$0:Lcom/localytics/android/SessionHandler;

    iget-object v12, v12, Lcom/localytics/android/SessionHandler;->mContext:Landroid/content/Context;

    invoke-virtual {v10, v12, v1, v9, v4}, Landroid/app/Notification;->setLatestEventInfo(Landroid/content/Context;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Landroid/app/PendingIntent;)V

    .line 992
    .end local v4    # "contentIntent":Landroid/app/PendingIntent;
    :cond_5
    iget v12, v10, Landroid/app/Notification;->flags:I

    or-int/lit8 v12, v12, 0x10

    iput v12, v10, Landroid/app/Notification;->flags:I

    .line 995
    iget-object v12, p0, Lcom/localytics/android/SessionHandler$15;->this$0:Lcom/localytics/android/SessionHandler;

    iget-object v12, v12, Lcom/localytics/android/SessionHandler;->mContext:Landroid/content/Context;

    const-string v13, "notification"

    invoke-virtual {v12, v13}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Landroid/app/NotificationManager;

    .line 997
    .local v11, "notificationManager":Landroid/app/NotificationManager;
    invoke-virtual {v11, v3, v10}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V

    goto/16 :goto_0

    .line 950
    .end local v0    # "appIcon":I
    .end local v1    # "appName":Ljava/lang/CharSequence;
    .end local v6    # "launchIntent":Landroid/content/Intent;
    .end local v7    # "llObject":Lorg/json/JSONObject;
    .end local v9    # "message":Ljava/lang/String;
    .end local v10    # "notification":Landroid/app/Notification;
    .end local v11    # "notificationManager":Landroid/app/NotificationManager;
    :catch_0
    move-exception v5

    .line 952
    .local v5, "e":Lorg/json/JSONException;
    sget-boolean v12, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v12, :cond_0

    .line 954
    const-string v12, "Localytics"

    const-string v13, "Failed to get campaign id from payload, ignoring message"

    invoke-static {v12, v13}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto/16 :goto_0

    .line 972
    .end local v5    # "e":Lorg/json/JSONException;
    .restart local v0    # "appIcon":I
    .restart local v1    # "appName":Ljava/lang/CharSequence;
    .restart local v6    # "launchIntent":Landroid/content/Intent;
    .restart local v7    # "llObject":Lorg/json/JSONObject;
    .restart local v9    # "message":Ljava/lang/String;
    :catch_1
    move-exception v5

    .line 974
    .local v5, "e":Landroid/content/pm/PackageManager$NameNotFoundException;
    sget-boolean v12, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v12, :cond_4

    .line 976
    const-string v12, "Localytics"

    const-string v13, "Failed to get application name, icon, or launch intent"

    invoke-static {v12, v13}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_1
.end method
