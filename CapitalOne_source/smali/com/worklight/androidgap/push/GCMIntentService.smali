.class public Lcom/worklight/androidgap/push/GCMIntentService;
.super Lcom/google/android/gcm/GCMBaseIntentService;
.source "GCMIntentService.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/worklight/androidgap/push/GCMIntentService$Message;
    }
.end annotation


# static fields
.field public static final GCM_ERROR:Ljava/lang/String; = ".C2DM_ERROR"

.field public static final GCM_EXTRA_ALERT:Ljava/lang/String; = "alert"

.field public static final GCM_EXTRA_BADGE:Ljava/lang/String; = "badge"

.field public static final GCM_EXTRA_ERROR_ID:Ljava/lang/String; = "errorId"

.field public static final GCM_EXTRA_MESSAGE:Ljava/lang/String; = "message"

.field public static final GCM_EXTRA_PAYLOAD:Ljava/lang/String; = "payload"

.field public static final GCM_EXTRA_REGISTRATION_ID:Ljava/lang/String; = "registrationId"

.field public static final GCM_EXTRA_SOUND:Ljava/lang/String; = "sound"

.field public static final GCM_MESSAGE:Ljava/lang/String; = ".C2DM_MESSAGE"

.field public static final GCM_NOTIFICATION:Ljava/lang/String; = ".NOTIFICATION"

.field public static final GCM_REGISTERED:Ljava/lang/String; = ".C2DM_REGISTERED"

.field public static final GCM_UNREGISTERED:Ljava/lang/String; = ".C2DM_UNREGISTERED"

.field private static RES_PUSH_NOIIFICATION_TITLE:I

.field private static RES_PUSH_NOTIFICATION_ICON:I


# instance fields
.field private resultReceiver:Landroid/content/BroadcastReceiver;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    const/4 v0, -0x1

    .line 41
    sput v0, Lcom/worklight/androidgap/push/GCMIntentService;->RES_PUSH_NOTIFICATION_ICON:I

    .line 42
    sput v0, Lcom/worklight/androidgap/push/GCMIntentService;->RES_PUSH_NOIIFICATION_TITLE:I

    .line 38
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 60
    invoke-static {}, Lcom/worklight/androidgap/WLDroidGap;->getWLConfig()Lcom/worklight/common/WLConfig;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/worklight/androidgap/WLDroidGap;->getWLConfig()Lcom/worklight/common/WLConfig;

    move-result-object v0

    invoke-virtual {v0}, Lcom/worklight/common/WLConfig;->getGCMSender()Ljava/lang/String;

    move-result-object v0

    :goto_0
    invoke-direct {p0, v0}, Lcom/google/android/gcm/GCMBaseIntentService;-><init>(Ljava/lang/String;)V

    .line 122
    new-instance v0, Lcom/worklight/androidgap/push/GCMIntentService$1;

    invoke-direct {v0, p0}, Lcom/worklight/androidgap/push/GCMIntentService$1;-><init>(Lcom/worklight/androidgap/push/GCMIntentService;)V

    iput-object v0, p0, Lcom/worklight/androidgap/push/GCMIntentService;->resultReceiver:Landroid/content/BroadcastReceiver;

    .line 61
    return-void

    .line 60
    :cond_0
    const-string v0, ""

    goto :goto_0
.end method

.method private generateNotification(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Landroid/content/Intent;)V
    .locals 7
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "ticker"    # Ljava/lang/String;
    .param p3, "title"    # Ljava/lang/String;
    .param p4, "msg"    # Ljava/lang/String;
    .param p5, "badge"    # I
    .param p6, "sound"    # Ljava/lang/String;
    .param p7, "intent"    # Landroid/content/Intent;

    .prologue
    .line 154
    sget v0, Lcom/worklight/androidgap/push/GCMIntentService;->RES_PUSH_NOTIFICATION_ICON:I

    .line 155
    .local v0, "icon":I
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    .line 157
    .local v4, "when":J
    new-instance v1, Landroid/app/Notification;

    invoke-direct {v1, v0, p2, v4, v5}, Landroid/app/Notification;-><init>(ILjava/lang/CharSequence;J)V

    .line 158
    .local v1, "notification":Landroid/app/Notification;
    const/4 v3, 0x0

    const/high16 v6, 0x8000000

    invoke-static {p1, v3, p7, v6}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v3

    invoke-virtual {v1, p1, p3, p4, v3}, Landroid/app/Notification;->setLatestEventInfo(Landroid/content/Context;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Landroid/app/PendingIntent;)V

    .line 159
    iput p5, v1, Landroid/app/Notification;->number:I

    .line 160
    iget v3, v1, Landroid/app/Notification;->flags:I

    or-int/lit8 v3, v3, 0x10

    iput v3, v1, Landroid/app/Notification;->flags:I

    .line 162
    const-string v3, "notification"

    invoke-virtual {p1, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/app/NotificationManager;

    .line 163
    .local v2, "notificationManager":Landroid/app/NotificationManager;
    const/4 v3, 0x1

    invoke-virtual {v2, v3, v1}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V

    .line 165
    if-eqz p6, :cond_0

    const-string v3, ""

    invoke-virtual {p6}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 166
    invoke-virtual {p0, p1}, Lcom/worklight/androidgap/push/GCMIntentService;->playNotificationSound(Landroid/content/Context;)V

    .line 168
    :cond_0
    return-void
.end method

.method private setResources()V
    .locals 4

    .prologue
    const/4 v2, -0x1

    .line 73
    sget v1, Lcom/worklight/androidgap/push/GCMIntentService;->RES_PUSH_NOTIFICATION_ICON:I

    if-eq v1, v2, :cond_0

    sget v1, Lcom/worklight/androidgap/push/GCMIntentService;->RES_PUSH_NOIIFICATION_TITLE:I

    if-ne v1, v2, :cond_1

    .line 75
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Lcom/worklight/androidgap/push/GCMIntentService;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "drawable"

    const-string v3, "push"

    invoke-static {v1, v2, v3}, Lcom/worklight/common/WLUtils;->getResourceId(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)I

    move-result v1

    sput v1, Lcom/worklight/androidgap/push/GCMIntentService;->RES_PUSH_NOTIFICATION_ICON:I

    .line 76
    invoke-virtual {p0}, Lcom/worklight/androidgap/push/GCMIntentService;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "string"

    const-string v3, "push_notification_title"

    invoke-static {v1, v2, v3}, Lcom/worklight/common/WLUtils;->getResourceId(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)I

    move-result v1

    sput v1, Lcom/worklight/androidgap/push/GCMIntentService;->RES_PUSH_NOIIFICATION_TITLE:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 81
    :cond_1
    :goto_0
    return-void

    .line 77
    :catch_0
    move-exception v0

    .line 78
    .local v0, "e":Ljava/lang/Exception;
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "cannot find resource"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Lcom/worklight/common/WLUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method


# virtual methods
.method public notify(Landroid/content/Context;Ljava/lang/String;)V
    .locals 8
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "tickerText"    # Ljava/lang/String;

    .prologue
    .line 146
    sget v0, Lcom/worklight/androidgap/push/GCMIntentService;->RES_PUSH_NOIIFICATION_TITLE:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    const/4 v5, 0x0

    const-string v6, "1"

    const/4 v7, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v4, p2

    invoke-direct/range {v0 .. v7}, Lcom/worklight/androidgap/push/GCMIntentService;->generateNotification(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Landroid/content/Intent;)V

    .line 147
    return-void
.end method

.method public notify(Landroid/content/Context;Ljava/lang/String;ILjava/lang/String;Landroid/content/Intent;)V
    .locals 8
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "alert"    # Ljava/lang/String;
    .param p3, "badge"    # I
    .param p4, "sound"    # Ljava/lang/String;
    .param p5, "intent"    # Landroid/content/Intent;

    .prologue
    .line 150
    sget v0, Lcom/worklight/androidgap/push/GCMIntentService;->RES_PUSH_NOIIFICATION_TITLE:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v4, p2

    move v5, p3

    move-object v6, p4

    move-object v7, p5

    invoke-direct/range {v0 .. v7}, Lcom/worklight/androidgap/push/GCMIntentService;->generateNotification(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Landroid/content/Intent;)V

    .line 151
    return-void
.end method

.method public onError(Landroid/content/Context;Ljava/lang/String;)V
    .locals 3
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "errorId"    # Ljava/lang/String;

    .prologue
    .line 110
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Received error "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/worklight/common/WLUtils;->warning(Ljava/lang/String;)V

    .line 111
    new-instance v0, Landroid/content/Intent;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-static {p1}, Lcom/worklight/common/WLUtils;->getFullAppName(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v2, ".C2DM_ERROR"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 112
    .local v0, "intent":Landroid/content/Intent;
    const-string v1, "errorId"

    invoke-virtual {v0, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 113
    invoke-virtual {p1, v0}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    .line 114
    return-void
.end method

.method protected onMessage(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 11
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "intent"    # Landroid/content/Intent;

    .prologue
    const/4 v2, 0x0

    .line 91
    const-string v0, "Received a message from the GCM server"

    invoke-static {v0}, Lcom/worklight/common/WLUtils;->debug(Ljava/lang/String;)V

    .line 92
    new-instance v10, Lcom/worklight/androidgap/push/GCMIntentService$Message;

    invoke-direct {v10}, Lcom/worklight/androidgap/push/GCMIntentService$Message;-><init>()V

    .line 93
    .local v10, "message":Lcom/worklight/androidgap/push/GCMIntentService$Message;
    invoke-virtual {p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v9

    .line 94
    .local v9, "info":Landroid/os/Bundle;
    const-string v0, "alert"

    invoke-virtual {v9, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v10, v0}, Lcom/worklight/androidgap/push/GCMIntentService$Message;->access$1(Lcom/worklight/androidgap/push/GCMIntentService$Message;Ljava/lang/String;)V

    .line 96
    :try_start_0
    const-string v0, "badge"

    invoke-virtual {v9, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0xa

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-static {v10, v0}, Lcom/worklight/androidgap/push/GCMIntentService$Message;->access$2(Lcom/worklight/androidgap/push/GCMIntentService$Message;I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 100
    :goto_0
    const-string v0, "sound"

    invoke-virtual {v9, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v10, v0}, Lcom/worklight/androidgap/push/GCMIntentService$Message;->access$3(Lcom/worklight/androidgap/push/GCMIntentService$Message;Ljava/lang/String;)V

    .line 101
    const-string v0, "payload"

    invoke-virtual {v9, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v10, v0}, Lcom/worklight/androidgap/push/GCMIntentService$Message;->access$4(Lcom/worklight/androidgap/push/GCMIntentService$Message;Ljava/lang/String;)V

    .line 103
    new-instance p2, Landroid/content/Intent;

    .end local p2    # "intent":Landroid/content/Intent;
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-static {p1}, Lcom/worklight/common/WLUtils;->getFullAppName(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v1, ".C2DM_MESSAGE"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p2, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 104
    .restart local p2    # "intent":Landroid/content/Intent;
    const-string v0, "message"

    invoke-virtual {p2, v0, v10}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 105
    iget-object v3, p0, Lcom/worklight/androidgap/push/GCMIntentService;->resultReceiver:Landroid/content/BroadcastReceiver;

    const/4 v5, 0x1

    move-object v0, p1

    move-object v1, p2

    move-object v4, v2

    move-object v6, v2

    move-object v7, v2

    invoke-virtual/range {v0 .. v7}, Landroid/content/Context;->sendOrderedBroadcast(Landroid/content/Intent;Ljava/lang/String;Landroid/content/BroadcastReceiver;Landroid/os/Handler;ILjava/lang/String;Landroid/os/Bundle;)V

    .line 106
    return-void

    .line 97
    :catch_0
    move-exception v8

    .line 98
    .local v8, "e":Ljava/lang/Exception;
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Problem to parse "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v1, "badge"

    invoke-virtual {v9, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " badge into Integer."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/worklight/common/WLUtils;->warning(Ljava/lang/String;)V

    goto :goto_0
.end method

.method protected onRecoverableError(Landroid/content/Context;Ljava/lang/String;)Z
    .locals 2
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "errorId"    # Ljava/lang/String;

    .prologue
    .line 118
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Received recoverable error "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/worklight/common/WLUtils;->warning(Ljava/lang/String;)V

    .line 119
    invoke-super {p0, p1, p2}, Lcom/google/android/gcm/GCMBaseIntentService;->onRecoverableError(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public onRegistered(Landroid/content/Context;Ljava/lang/String;)V
    .locals 3
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "registrationId"    # Ljava/lang/String;

    .prologue
    .line 65
    invoke-direct {p0}, Lcom/worklight/androidgap/push/GCMIntentService;->setResources()V

    .line 66
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Registered at the GCM server with registration id "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/worklight/common/WLUtils;->debug(Ljava/lang/String;)V

    .line 67
    new-instance v0, Landroid/content/Intent;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-static {p1}, Lcom/worklight/common/WLUtils;->getFullAppName(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v2, ".C2DM_REGISTERED"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 68
    .local v0, "intent":Landroid/content/Intent;
    const-string v1, "registrationId"

    invoke-virtual {v0, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 69
    invoke-virtual {p1, v0}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    .line 70
    return-void
.end method

.method protected onUnhandled(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 8
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "intent"    # Landroid/content/Intent;

    .prologue
    .line 132
    invoke-direct {p0}, Lcom/worklight/androidgap/push/GCMIntentService;->setResources()V

    .line 133
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v6

    .line 134
    .local v6, "action":Ljava/lang/String;
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-static {p1}, Lcom/worklight/common/WLUtils;->getFullAppName(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v1, ".C2DM_MESSAGE"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 135
    const-string v0, "message"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v7

    check-cast v7, Lcom/worklight/androidgap/push/GCMIntentService$Message;

    .line 136
    .local v7, "message":Lcom/worklight/androidgap/push/GCMIntentService$Message;
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Showing notification for unhandled "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7}, Lcom/worklight/androidgap/push/GCMIntentService$Message;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/worklight/common/WLUtils;->debug(Ljava/lang/String;)V

    .line 137
    new-instance p2, Landroid/content/Intent;

    .end local p2    # "intent":Landroid/content/Intent;
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-static {p1}, Lcom/worklight/common/WLUtils;->getFullAppName(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v1, ".NOTIFICATION"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p2, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 138
    .restart local p2    # "intent":Landroid/content/Intent;
    const-string v0, "message"

    invoke-virtual {p2, v0, v7}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 139
    # getter for: Lcom/worklight/androidgap/push/GCMIntentService$Message;->alert:Ljava/lang/String;
    invoke-static {v7}, Lcom/worklight/androidgap/push/GCMIntentService$Message;->access$5(Lcom/worklight/androidgap/push/GCMIntentService$Message;)Ljava/lang/String;

    move-result-object v2

    # getter for: Lcom/worklight/androidgap/push/GCMIntentService$Message;->badge:I
    invoke-static {v7}, Lcom/worklight/androidgap/push/GCMIntentService$Message;->access$6(Lcom/worklight/androidgap/push/GCMIntentService$Message;)I

    move-result v3

    # getter for: Lcom/worklight/androidgap/push/GCMIntentService$Message;->sound:Ljava/lang/String;
    invoke-static {v7}, Lcom/worklight/androidgap/push/GCMIntentService$Message;->access$7(Lcom/worklight/androidgap/push/GCMIntentService$Message;)Ljava/lang/String;

    move-result-object v4

    move-object v0, p0

    move-object v1, p1

    move-object v5, p2

    invoke-virtual/range {v0 .. v5}, Lcom/worklight/androidgap/push/GCMIntentService;->notify(Landroid/content/Context;Ljava/lang/String;ILjava/lang/String;Landroid/content/Intent;)V

    .line 141
    .end local v7    # "message":Lcom/worklight/androidgap/push/GCMIntentService$Message;
    :cond_0
    return-void
.end method

.method protected onUnregistered(Landroid/content/Context;Ljava/lang/String;)V
    .locals 3
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "registrationId"    # Ljava/lang/String;

    .prologue
    .line 85
    const-string v0, "Unregistered at the GCM server"

    invoke-static {v0}, Lcom/worklight/common/WLUtils;->debug(Ljava/lang/String;)V

    .line 86
    new-instance v0, Landroid/content/Intent;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-static {p1}, Lcom/worklight/common/WLUtils;->getFullAppName(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v2, ".C2DM_UNREGISTERED"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    .line 87
    return-void
.end method

.method public playNotificationSound(Landroid/content/Context;)V
    .locals 3
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .line 171
    const/4 v2, 0x2

    invoke-static {v2}, Landroid/media/RingtoneManager;->getDefaultUri(I)Landroid/net/Uri;

    move-result-object v1

    .line 172
    .local v1, "uri":Landroid/net/Uri;
    if-eqz v1, :cond_0

    .line 173
    invoke-static {p1, v1}, Landroid/media/RingtoneManager;->getRingtone(Landroid/content/Context;Landroid/net/Uri;)Landroid/media/Ringtone;

    move-result-object v0

    .line 174
    .local v0, "ringtone":Landroid/media/Ringtone;
    if-eqz v0, :cond_0

    .line 175
    const/4 v2, 0x5

    invoke-virtual {v0, v2}, Landroid/media/Ringtone;->setStreamType(I)V

    .line 176
    invoke-virtual {v0}, Landroid/media/Ringtone;->play()V

    .line 179
    .end local v0    # "ringtone":Landroid/media/Ringtone;
    :cond_0
    return-void
.end method
