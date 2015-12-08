.class public Lorg/xwalk/core/internal/XWalkNotificationServiceImpl;
.super Ljava/lang/Object;
.source "XWalkNotificationServiceImpl.java"

# interfaces
.implements Lorg/xwalk/core/internal/XWalkNotificationService;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/xwalk/core/internal/XWalkNotificationServiceImpl$WebNotification;
    }
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "XWalkNotificationServiceImpl"

.field private static final XWALK_ACTION_CLICK_NOTIFICATION_SUFFIX:Ljava/lang/String; = ".notification.click"

.field private static final XWALK_ACTION_CLOSE_NOTIFICATION_SUFFIX:Ljava/lang/String; = ".notification.close"

.field private static final XWALK_INTENT_CATEGORY_NOTIFICATION_PREFIX:Ljava/lang/String; = "notification_"

.field private static final XWALK_INTENT_EXTRA_KEY_NOTIFICATION_ID:Ljava/lang/String; = "xwalk.NOTIFICATION_ID"


# instance fields
.field private mBridge:Lorg/xwalk/core/internal/XWalkContentsClientBridge;

.field private mContext:Landroid/content/Context;

.field private mExistNotificationIds:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/Integer;",
            "Lorg/xwalk/core/internal/XWalkNotificationServiceImpl$WebNotification;",
            ">;"
        }
    .end annotation
.end field

.field private mExistReplaceIds:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Lorg/xwalk/core/internal/XWalkNotificationServiceImpl$WebNotification;",
            ">;"
        }
    .end annotation
.end field

.field private mNotificationCloseReceiver:Landroid/content/BroadcastReceiver;

.field private mNotificationManager:Landroid/app/NotificationManager;

.field private mView:Lorg/xwalk/core/internal/XWalkViewInternal;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lorg/xwalk/core/internal/XWalkViewInternal;)V
    .locals 2
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "view"    # Lorg/xwalk/core/internal/XWalkViewInternal;

    .prologue
    .line 56
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 57
    iput-object p1, p0, Lorg/xwalk/core/internal/XWalkNotificationServiceImpl;->mContext:Landroid/content/Context;

    .line 58
    iput-object p2, p0, Lorg/xwalk/core/internal/XWalkNotificationServiceImpl;->mView:Lorg/xwalk/core/internal/XWalkViewInternal;

    .line 59
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkNotificationServiceImpl;->mContext:Landroid/content/Context;

    const-string v1, "notification"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/NotificationManager;

    iput-object v0, p0, Lorg/xwalk/core/internal/XWalkNotificationServiceImpl;->mNotificationManager:Landroid/app/NotificationManager;

    .line 62
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkNotificationServiceImpl;->mNotificationManager:Landroid/app/NotificationManager;

    invoke-virtual {v0}, Landroid/app/NotificationManager;->cancelAll()V

    .line 64
    new-instance v0, Lorg/xwalk/core/internal/XWalkNotificationServiceImpl$1;

    invoke-direct {v0, p0}, Lorg/xwalk/core/internal/XWalkNotificationServiceImpl$1;-><init>(Lorg/xwalk/core/internal/XWalkNotificationServiceImpl;)V

    iput-object v0, p0, Lorg/xwalk/core/internal/XWalkNotificationServiceImpl;->mNotificationCloseReceiver:Landroid/content/BroadcastReceiver;

    .line 71
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lorg/xwalk/core/internal/XWalkNotificationServiceImpl;->mExistNotificationIds:Ljava/util/HashMap;

    .line 72
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lorg/xwalk/core/internal/XWalkNotificationServiceImpl;->mExistReplaceIds:Ljava/util/HashMap;

    .line 73
    return-void
.end method

.method static synthetic access$000(Lorg/xwalk/core/internal/XWalkNotificationServiceImpl;)Lorg/xwalk/core/internal/XWalkViewInternal;
    .locals 1
    .param p0, "x0"    # Lorg/xwalk/core/internal/XWalkNotificationServiceImpl;

    .prologue
    .line 29
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkNotificationServiceImpl;->mView:Lorg/xwalk/core/internal/XWalkViewInternal;

    return-object v0
.end method

.method private static getCategoryFromNotificationId(I)Ljava/lang/String;
    .locals 2
    .param p0, "id"    # I

    .prologue
    .line 76
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "notification_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private notificationChanged()V
    .locals 2

    .prologue
    .line 255
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkNotificationServiceImpl;->mExistNotificationIds:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 256
    const-string v0, "XWalkNotificationServiceImpl"

    const-string v1, "notifications are all cleared,unregister broadcast receiver for close pending intent"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 258
    invoke-direct {p0}, Lorg/xwalk/core/internal/XWalkNotificationServiceImpl;->unregisterReceiver()V

    .line 262
    :goto_0
    return-void

    .line 260
    :cond_0
    invoke-direct {p0}, Lorg/xwalk/core/internal/XWalkNotificationServiceImpl;->registerReceiver()V

    goto :goto_0
.end method

.method private registerReceiver()V
    .locals 6

    .prologue
    .line 265
    new-instance v1, Landroid/content/IntentFilter;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v5, p0, Lorg/xwalk/core/internal/XWalkNotificationServiceImpl;->mView:Lorg/xwalk/core/internal/XWalkViewInternal;

    invoke-virtual {v5}, Lorg/xwalk/core/internal/XWalkViewInternal;->getActivity()Landroid/app/Activity;

    move-result-object v5

    invoke-virtual {v5}, Landroid/app/Activity;->getPackageName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, ".notification.close"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v1, v4}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 268
    .local v1, "filter":Landroid/content/IntentFilter;
    iget-object v4, p0, Lorg/xwalk/core/internal/XWalkNotificationServiceImpl;->mExistNotificationIds:Ljava/util/HashMap;

    invoke-virtual {v4}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .local v2, "i$":Ljava/util/Iterator;
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    .line 269
    .local v3, "id":Ljava/lang/Integer;
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v4

    invoke-static {v4}, Lorg/xwalk/core/internal/XWalkNotificationServiceImpl;->getCategoryFromNotificationId(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Landroid/content/IntentFilter;->addCategory(Ljava/lang/String;)V

    goto :goto_0

    .line 273
    .end local v3    # "id":Ljava/lang/Integer;
    :cond_0
    :try_start_0
    iget-object v4, p0, Lorg/xwalk/core/internal/XWalkNotificationServiceImpl;->mView:Lorg/xwalk/core/internal/XWalkViewInternal;

    invoke-virtual {v4}, Lorg/xwalk/core/internal/XWalkViewInternal;->getActivity()Landroid/app/Activity;

    move-result-object v4

    iget-object v5, p0, Lorg/xwalk/core/internal/XWalkNotificationServiceImpl;->mNotificationCloseReceiver:Landroid/content/BroadcastReceiver;

    invoke-virtual {v4, v5, v1}, Landroid/app/Activity;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
    :try_end_0
    .catch Landroid/util/AndroidRuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 279
    :goto_1
    return-void

    .line 274
    :catch_0
    move-exception v0

    .line 277
    .local v0, "e":Landroid/util/AndroidRuntimeException;
    const-string v4, "XWalkNotificationServiceImpl"

    invoke-virtual {v0}, Landroid/util/AndroidRuntimeException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_1
.end method

.method private unregisterReceiver()V
    .locals 2

    .prologue
    .line 282
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkNotificationServiceImpl;->mView:Lorg/xwalk/core/internal/XWalkViewInternal;

    invoke-virtual {v0}, Lorg/xwalk/core/internal/XWalkViewInternal;->getActivity()Landroid/app/Activity;

    move-result-object v0

    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkNotificationServiceImpl;->mNotificationCloseReceiver:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/app/Activity;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 283
    return-void
.end method


# virtual methods
.method public cancelNotification(I)V
    .locals 1
    .param p1, "notificationId"    # I

    .prologue
    .line 204
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkNotificationServiceImpl;->mNotificationManager:Landroid/app/NotificationManager;

    invoke-virtual {v0, p1}, Landroid/app/NotificationManager;->cancel(I)V

    .line 205
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lorg/xwalk/core/internal/XWalkNotificationServiceImpl;->onNotificationClose(IZ)V

    .line 206
    return-void
.end method

.method public doShowNotification(ILandroid/app/Notification;)V
    .locals 1
    .param p1, "notificationId"    # I
    .param p2, "notification"    # Landroid/app/Notification;

    .prologue
    .line 209
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkNotificationServiceImpl;->mNotificationManager:Landroid/app/NotificationManager;

    invoke-virtual {v0, p1, p2}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V

    .line 210
    return-void
.end method

.method public maybeHandleIntent(Landroid/content/Intent;)Z
    .locals 6
    .param p1, "intent"    # Landroid/content/Intent;

    .prologue
    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 94
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_1

    .line 106
    :cond_0
    :goto_0
    return v1

    .line 95
    :cond_1
    const-string v3, "xwalk.NOTIFICATION_ID"

    const/4 v4, -0x1

    invoke-virtual {p1, v3, v4}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    .line 96
    .local v0, "notificationId":I
    if-lez v0, :cond_0

    .line 97
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v5, p0, Lorg/xwalk/core/internal/XWalkNotificationServiceImpl;->mView:Lorg/xwalk/core/internal/XWalkViewInternal;

    invoke-virtual {v5}, Lorg/xwalk/core/internal/XWalkViewInternal;->getActivity()Landroid/app/Activity;

    move-result-object v5

    invoke-virtual {v5}, Landroid/app/Activity;->getPackageName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, ".notification.close"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 99
    invoke-virtual {p0, v0, v2}, Lorg/xwalk/core/internal/XWalkNotificationServiceImpl;->onNotificationClose(IZ)V

    move v1, v2

    .line 100
    goto :goto_0

    .line 101
    :cond_2
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v5, p0, Lorg/xwalk/core/internal/XWalkNotificationServiceImpl;->mView:Lorg/xwalk/core/internal/XWalkViewInternal;

    invoke-virtual {v5}, Lorg/xwalk/core/internal/XWalkViewInternal;->getActivity()Landroid/app/Activity;

    move-result-object v5

    invoke-virtual {v5}, Landroid/app/Activity;->getPackageName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, ".notification.click"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 103
    invoke-virtual {p0, v0}, Lorg/xwalk/core/internal/XWalkNotificationServiceImpl;->onNotificationClick(I)V

    move v1, v2

    .line 104
    goto :goto_0
.end method

.method public onNotificationClick(I)V
    .locals 3
    .param p1, "notificationId"    # I

    .prologue
    .line 224
    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkNotificationServiceImpl;->mExistNotificationIds:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/xwalk/core/internal/XWalkNotificationServiceImpl$WebNotification;

    .line 225
    .local v0, "webNotification":Lorg/xwalk/core/internal/XWalkNotificationServiceImpl$WebNotification;
    if-nez v0, :cond_1

    .line 236
    :cond_0
    :goto_0
    return-void

    .line 229
    :cond_1
    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkNotificationServiceImpl;->mExistNotificationIds:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 230
    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkNotificationServiceImpl;->mExistReplaceIds:Ljava/util/HashMap;

    iget-object v2, v0, Lorg/xwalk/core/internal/XWalkNotificationServiceImpl$WebNotification;->mReplaceId:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 232
    invoke-direct {p0}, Lorg/xwalk/core/internal/XWalkNotificationServiceImpl;->notificationChanged()V

    .line 233
    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkNotificationServiceImpl;->mBridge:Lorg/xwalk/core/internal/XWalkContentsClientBridge;

    if-eqz v1, :cond_0

    .line 234
    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkNotificationServiceImpl;->mBridge:Lorg/xwalk/core/internal/XWalkContentsClientBridge;

    invoke-virtual {v1, p1}, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->notificationClicked(I)V

    goto :goto_0
.end method

.method public onNotificationClose(IZ)V
    .locals 3
    .param p1, "notificationId"    # I
    .param p2, "byUser"    # Z

    .prologue
    .line 240
    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkNotificationServiceImpl;->mExistNotificationIds:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/xwalk/core/internal/XWalkNotificationServiceImpl$WebNotification;

    .line 241
    .local v0, "webNotification":Lorg/xwalk/core/internal/XWalkNotificationServiceImpl$WebNotification;
    if-nez v0, :cond_1

    .line 252
    :cond_0
    :goto_0
    return-void

    .line 245
    :cond_1
    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkNotificationServiceImpl;->mExistNotificationIds:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 246
    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkNotificationServiceImpl;->mExistReplaceIds:Ljava/util/HashMap;

    iget-object v2, v0, Lorg/xwalk/core/internal/XWalkNotificationServiceImpl$WebNotification;->mReplaceId:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 248
    invoke-direct {p0}, Lorg/xwalk/core/internal/XWalkNotificationServiceImpl;->notificationChanged()V

    .line 249
    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkNotificationServiceImpl;->mBridge:Lorg/xwalk/core/internal/XWalkContentsClientBridge;

    if-eqz v1, :cond_0

    .line 250
    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkNotificationServiceImpl;->mBridge:Lorg/xwalk/core/internal/XWalkContentsClientBridge;

    invoke-virtual {v1, p1, p2}, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->notificationClosed(IZ)V

    goto :goto_0
.end method

.method public onNotificationShown(I)V
    .locals 3
    .param p1, "notificationId"    # I

    .prologue
    .line 213
    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkNotificationServiceImpl;->mExistNotificationIds:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/xwalk/core/internal/XWalkNotificationServiceImpl$WebNotification;

    .line 214
    .local v0, "webNotification":Lorg/xwalk/core/internal/XWalkNotificationServiceImpl$WebNotification;
    if-nez v0, :cond_1

    .line 221
    :cond_0
    :goto_0
    return-void

    .line 218
    :cond_1
    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkNotificationServiceImpl;->mBridge:Lorg/xwalk/core/internal/XWalkContentsClientBridge;

    if-eqz v1, :cond_0

    .line 219
    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkNotificationServiceImpl;->mBridge:Lorg/xwalk/core/internal/XWalkContentsClientBridge;

    invoke-virtual {v1, p1}, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->notificationDisplayed(I)V

    goto :goto_0
.end method

.method public setBridge(Lorg/xwalk/core/internal/XWalkContentsClientBridge;)V
    .locals 0
    .param p1, "bridge"    # Lorg/xwalk/core/internal/XWalkContentsClientBridge;

    .prologue
    .line 81
    iput-object p1, p0, Lorg/xwalk/core/internal/XWalkNotificationServiceImpl;->mBridge:Lorg/xwalk/core/internal/XWalkContentsClientBridge;

    .line 82
    return-void
.end method

.method public showNotification(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 10
    .param p1, "title"    # Ljava/lang/String;
    .param p2, "message"    # Ljava/lang/String;
    .param p3, "replaceId"    # Ljava/lang/String;
    .param p4, "notificationId"    # I

    .prologue
    .line 149
    invoke-virtual {p3}, Ljava/lang/String;->isEmpty()Z

    move-result v7

    if-nez v7, :cond_2

    iget-object v7, p0, Lorg/xwalk/core/internal/XWalkNotificationServiceImpl;->mExistReplaceIds:Ljava/util/HashMap;

    invoke-virtual {v7, p3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2

    .line 150
    iget-object v7, p0, Lorg/xwalk/core/internal/XWalkNotificationServiceImpl;->mExistReplaceIds:Ljava/util/HashMap;

    invoke-virtual {v7, p3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lorg/xwalk/core/internal/XWalkNotificationServiceImpl$WebNotification;

    .line 151
    .local v6, "webNotification":Lorg/xwalk/core/internal/XWalkNotificationServiceImpl$WebNotification;
    iget-object v7, v6, Lorg/xwalk/core/internal/XWalkNotificationServiceImpl$WebNotification;->mNotificationId:Ljava/lang/Integer;

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result p4

    .line 152
    iget-object v1, v6, Lorg/xwalk/core/internal/XWalkNotificationServiceImpl$WebNotification;->mBuilder:Landroid/app/Notification$Builder;

    .line 153
    .local v1, "builder":Landroid/app/Notification$Builder;
    iget-object v7, v6, Lorg/xwalk/core/internal/XWalkNotificationServiceImpl$WebNotification;->mMessageNum:Ljava/lang/Integer;

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7

    add-int/lit8 v7, v7, 0x1

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    iput-object v7, v6, Lorg/xwalk/core/internal/XWalkNotificationServiceImpl$WebNotification;->mMessageNum:Ljava/lang/Integer;

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-virtual {v1, v7}, Landroid/app/Notification$Builder;->setNumber(I)Landroid/app/Notification$Builder;

    .line 169
    :cond_0
    :goto_0
    invoke-virtual {v1, p1}, Landroid/app/Notification$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    .line 170
    invoke-virtual {v1, p2}, Landroid/app/Notification$Builder;->setContentText(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    .line 172
    iget-object v7, p0, Lorg/xwalk/core/internal/XWalkNotificationServiceImpl;->mContext:Landroid/content/Context;

    invoke-virtual {v7}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v7

    iget v5, v7, Landroid/content/pm/ApplicationInfo;->icon:I

    .line 173
    .local v5, "iconRes":I
    if-nez v5, :cond_1

    .line 174
    const v5, 0x1080093

    .line 176
    :cond_1
    invoke-virtual {v1, v5}, Landroid/app/Notification$Builder;->setSmallIcon(I)Landroid/app/Notification$Builder;

    .line 178
    iget-object v7, p0, Lorg/xwalk/core/internal/XWalkNotificationServiceImpl;->mView:Lorg/xwalk/core/internal/XWalkViewInternal;

    invoke-virtual {v7}, Lorg/xwalk/core/internal/XWalkViewInternal;->getActivity()Landroid/app/Activity;

    move-result-object v0

    .line 179
    .local v0, "activity":Landroid/content/Context;
    invoke-static {p4}, Lorg/xwalk/core/internal/XWalkNotificationServiceImpl;->getCategoryFromNotificationId(I)Ljava/lang/String;

    move-result-object v2

    .line 181
    .local v2, "category":Ljava/lang/String;
    new-instance v7, Landroid/content/Intent;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v8

    invoke-direct {v7, v0, v8}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    const-string v9, ".notification.click"

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v7

    const-string v8, "xwalk.NOTIFICATION_ID"

    invoke-virtual {v7, v8, p4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    move-result-object v7

    const/high16 v8, 0x20100000

    invoke-virtual {v7, v8}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    move-result-object v7

    invoke-virtual {v7, v2}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v3

    .line 187
    .local v3, "clickIntent":Landroid/content/Intent;
    new-instance v7, Landroid/content/Intent;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    const-string v9, ".notification.close"

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-direct {v7, v8}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v8, "xwalk.NOTIFICATION_ID"

    invoke-virtual {v7, v8, p4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    move-result-object v7

    invoke-virtual {v7, v2}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v4

    .line 191
    .local v4, "closeIntent":Landroid/content/Intent;
    const/4 v7, 0x0

    const/high16 v8, 0x8000000

    invoke-static {v0, v7, v3, v8}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v7

    invoke-virtual {v1, v7}, Landroid/app/Notification$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroid/app/Notification$Builder;

    .line 193
    const/4 v7, 0x0

    const/high16 v8, 0x8000000

    invoke-static {v0, v7, v4, v8}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v7

    invoke-virtual {v1, v7}, Landroid/app/Notification$Builder;->setDeleteIntent(Landroid/app/PendingIntent;)Landroid/app/Notification$Builder;

    .line 196
    sget v7, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v8, 0x10

    if-lt v7, v8, :cond_3

    invoke-virtual {v1}, Landroid/app/Notification$Builder;->build()Landroid/app/Notification;

    move-result-object v7

    :goto_1
    invoke-virtual {p0, p4, v7}, Lorg/xwalk/core/internal/XWalkNotificationServiceImpl;->doShowNotification(ILandroid/app/Notification;)V

    .line 198
    invoke-direct {p0}, Lorg/xwalk/core/internal/XWalkNotificationServiceImpl;->notificationChanged()V

    .line 199
    invoke-virtual {p0, p4}, Lorg/xwalk/core/internal/XWalkNotificationServiceImpl;->onNotificationShown(I)V

    .line 200
    return-void

    .line 155
    .end local v0    # "activity":Landroid/content/Context;
    .end local v1    # "builder":Landroid/app/Notification$Builder;
    .end local v2    # "category":Ljava/lang/String;
    .end local v3    # "clickIntent":Landroid/content/Intent;
    .end local v4    # "closeIntent":Landroid/content/Intent;
    .end local v5    # "iconRes":I
    .end local v6    # "webNotification":Lorg/xwalk/core/internal/XWalkNotificationServiceImpl$WebNotification;
    :cond_2
    new-instance v7, Landroid/app/Notification$Builder;

    iget-object v8, p0, Lorg/xwalk/core/internal/XWalkNotificationServiceImpl;->mContext:Landroid/content/Context;

    invoke-virtual {v8}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v8

    invoke-direct {v7, v8}, Landroid/app/Notification$Builder;-><init>(Landroid/content/Context;)V

    const/4 v8, 0x1

    invoke-virtual {v7, v8}, Landroid/app/Notification$Builder;->setAutoCancel(Z)Landroid/app/Notification$Builder;

    move-result-object v1

    .line 158
    .restart local v1    # "builder":Landroid/app/Notification$Builder;
    new-instance v6, Lorg/xwalk/core/internal/XWalkNotificationServiceImpl$WebNotification;

    invoke-direct {v6, p0}, Lorg/xwalk/core/internal/XWalkNotificationServiceImpl$WebNotification;-><init>(Lorg/xwalk/core/internal/XWalkNotificationServiceImpl;)V

    .line 159
    .restart local v6    # "webNotification":Lorg/xwalk/core/internal/XWalkNotificationServiceImpl$WebNotification;
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    iput-object v7, v6, Lorg/xwalk/core/internal/XWalkNotificationServiceImpl$WebNotification;->mNotificationId:Ljava/lang/Integer;

    .line 160
    iput-object p3, v6, Lorg/xwalk/core/internal/XWalkNotificationServiceImpl$WebNotification;->mReplaceId:Ljava/lang/String;

    .line 161
    iput-object v1, v6, Lorg/xwalk/core/internal/XWalkNotificationServiceImpl$WebNotification;->mBuilder:Landroid/app/Notification$Builder;

    .line 163
    iget-object v7, p0, Lorg/xwalk/core/internal/XWalkNotificationServiceImpl;->mExistNotificationIds:Ljava/util/HashMap;

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-virtual {v7, v8, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 164
    invoke-virtual {p3}, Ljava/lang/String;->isEmpty()Z

    move-result v7

    if-nez v7, :cond_0

    .line 165
    iget-object v7, p0, Lorg/xwalk/core/internal/XWalkNotificationServiceImpl;->mExistReplaceIds:Ljava/util/HashMap;

    invoke-virtual {v7, p3, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_0

    .line 196
    .restart local v0    # "activity":Landroid/content/Context;
    .restart local v2    # "category":Ljava/lang/String;
    .restart local v3    # "clickIntent":Landroid/content/Intent;
    .restart local v4    # "closeIntent":Landroid/content/Intent;
    .restart local v5    # "iconRes":I
    :cond_3
    invoke-virtual {v1}, Landroid/app/Notification$Builder;->getNotification()Landroid/app/Notification;

    move-result-object v7

    goto :goto_1
.end method

.method public shutdown()V
    .locals 1

    .prologue
    .line 86
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkNotificationServiceImpl;->mExistNotificationIds:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 87
    invoke-direct {p0}, Lorg/xwalk/core/internal/XWalkNotificationServiceImpl;->unregisterReceiver()V

    .line 89
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lorg/xwalk/core/internal/XWalkNotificationServiceImpl;->mBridge:Lorg/xwalk/core/internal/XWalkContentsClientBridge;

    .line 90
    return-void
.end method

.method public updateNotificationIcon(ILandroid/graphics/Bitmap;)V
    .locals 8
    .param p1, "notificationId"    # I
    .param p2, "icon"    # Landroid/graphics/Bitmap;

    .prologue
    .line 112
    iget-object v6, p0, Lorg/xwalk/core/internal/XWalkNotificationServiceImpl;->mExistNotificationIds:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lorg/xwalk/core/internal/XWalkNotificationServiceImpl$WebNotification;

    .line 113
    .local v5, "webNotification":Lorg/xwalk/core/internal/XWalkNotificationServiceImpl$WebNotification;
    if-nez v5, :cond_1

    .line 141
    :cond_0
    :goto_0
    return-void

    .line 117
    :cond_1
    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    .line 118
    .local v2, "originalWidth":I
    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    .line 119
    .local v1, "originalHeight":I
    if-eqz v2, :cond_0

    if-eqz v1, :cond_0

    .line 123
    iget-object v6, p0, Lorg/xwalk/core/internal/XWalkNotificationServiceImpl;->mContext:Landroid/content/Context;

    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    const v7, 0x1050005

    invoke-virtual {v6, v7}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v4

    .line 125
    .local v4, "targetWidth":I
    iget-object v6, p0, Lorg/xwalk/core/internal/XWalkNotificationServiceImpl;->mContext:Landroid/content/Context;

    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    const v7, 0x1050006

    invoke-virtual {v6, v7}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v3

    .line 128
    .local v3, "targetHeight":I
    if-le v2, v4, :cond_2

    if-le v1, v3, :cond_2

    .line 129
    mul-int v6, v2, v3

    mul-int v7, v1, v4

    if-le v6, v7, :cond_3

    .line 130
    mul-int v6, v1, v4

    div-int v3, v6, v2

    .line 136
    :cond_2
    :goto_1
    iget-object v0, v5, Lorg/xwalk/core/internal/XWalkNotificationServiceImpl$WebNotification;->mBuilder:Landroid/app/Notification$Builder;

    .line 137
    .local v0, "builder":Landroid/app/Notification$Builder;
    const/4 v6, 0x1

    invoke-static {p2, v4, v3, v6}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    move-result-object v6

    invoke-virtual {v0, v6}, Landroid/app/Notification$Builder;->setLargeIcon(Landroid/graphics/Bitmap;)Landroid/app/Notification$Builder;

    .line 139
    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v7, 0x10

    if-lt v6, v7, :cond_4

    invoke-virtual {v0}, Landroid/app/Notification$Builder;->build()Landroid/app/Notification;

    move-result-object v6

    :goto_2
    invoke-virtual {p0, p1, v6}, Lorg/xwalk/core/internal/XWalkNotificationServiceImpl;->doShowNotification(ILandroid/app/Notification;)V

    goto :goto_0

    .line 132
    .end local v0    # "builder":Landroid/app/Notification$Builder;
    :cond_3
    mul-int v6, v2, v3

    div-int v4, v6, v1

    goto :goto_1

    .line 139
    .restart local v0    # "builder":Landroid/app/Notification$Builder;
    :cond_4
    invoke-virtual {v0}, Landroid/app/Notification$Builder;->getNotification()Landroid/app/Notification;

    move-result-object v6

    goto :goto_2
.end method
