.class public Lorg/xwalk/core/internal/extension/api/messaging/Messaging;
.super Lorg/xwalk/core/internal/extension/XWalkExtensionWithActivityStateListener;
.source "Messaging.java"


# static fields
.field public static final JS_API_PATH:Ljava/lang/String; = "jsapi/messaging_api.js"

.field private static final NAME:Ljava/lang/String; = "xwalk.experimental.messaging"

.field private static sMethodMap:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Lorg/xwalk/core/internal/extension/api/messaging/Command;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private isIntentFiltersRegistered:Z

.field private mMessagingManager:Lorg/xwalk/core/internal/extension/api/messaging/MessagingManager;

.field private mSmsManager:Lorg/xwalk/core/internal/extension/api/messaging/MessagingSmsManager;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 36
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lorg/xwalk/core/internal/extension/api/messaging/Messaging;->sMethodMap:Ljava/util/HashMap;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Landroid/app/Activity;)V
    .locals 1
    .param p1, "jsApiContent"    # Ljava/lang/String;
    .param p2, "activity"    # Landroid/app/Activity;

    .prologue
    .line 104
    const-string v0, "xwalk.experimental.messaging"

    invoke-direct {p0, v0, p1, p2}, Lorg/xwalk/core/internal/extension/XWalkExtensionWithActivityStateListener;-><init>(Ljava/lang/String;Ljava/lang/String;Landroid/app/Activity;)V

    .line 40
    const/4 v0, 0x0

    iput-boolean v0, p0, Lorg/xwalk/core/internal/extension/api/messaging/Messaging;->isIntentFiltersRegistered:Z

    .line 105
    new-instance v0, Lorg/xwalk/core/internal/extension/api/messaging/MessagingSmsManager;

    invoke-direct {v0, p2, p0}, Lorg/xwalk/core/internal/extension/api/messaging/MessagingSmsManager;-><init>(Landroid/app/Activity;Lorg/xwalk/core/internal/extension/api/messaging/Messaging;)V

    iput-object v0, p0, Lorg/xwalk/core/internal/extension/api/messaging/Messaging;->mSmsManager:Lorg/xwalk/core/internal/extension/api/messaging/MessagingSmsManager;

    .line 106
    new-instance v0, Lorg/xwalk/core/internal/extension/api/messaging/MessagingManager;

    invoke-direct {v0, p2, p0}, Lorg/xwalk/core/internal/extension/api/messaging/MessagingManager;-><init>(Landroid/app/Activity;Lorg/xwalk/core/internal/extension/api/messaging/Messaging;)V

    iput-object v0, p0, Lorg/xwalk/core/internal/extension/api/messaging/Messaging;->mMessagingManager:Lorg/xwalk/core/internal/extension/api/messaging/MessagingManager;

    .line 107
    iget-boolean v0, p0, Lorg/xwalk/core/internal/extension/api/messaging/Messaging;->isIntentFiltersRegistered:Z

    if-nez v0, :cond_0

    .line 108
    iget-object v0, p0, Lorg/xwalk/core/internal/extension/api/messaging/Messaging;->mSmsManager:Lorg/xwalk/core/internal/extension/api/messaging/MessagingSmsManager;

    invoke-virtual {v0}, Lorg/xwalk/core/internal/extension/api/messaging/MessagingSmsManager;->registerIntentFilters()V

    .line 109
    const/4 v0, 0x1

    iput-boolean v0, p0, Lorg/xwalk/core/internal/extension/api/messaging/Messaging;->isIntentFiltersRegistered:Z

    .line 112
    :cond_0
    invoke-direct {p0}, Lorg/xwalk/core/internal/extension/api/messaging/Messaging;->initMethodMap()V

    .line 113
    return-void
.end method

.method static synthetic access$000(Lorg/xwalk/core/internal/extension/api/messaging/Messaging;)Lorg/xwalk/core/internal/extension/api/messaging/MessagingSmsManager;
    .locals 1
    .param p0, "x0"    # Lorg/xwalk/core/internal/extension/api/messaging/Messaging;

    .prologue
    .line 31
    iget-object v0, p0, Lorg/xwalk/core/internal/extension/api/messaging/Messaging;->mSmsManager:Lorg/xwalk/core/internal/extension/api/messaging/MessagingSmsManager;

    return-object v0
.end method

.method static synthetic access$100(Lorg/xwalk/core/internal/extension/api/messaging/Messaging;)Lorg/xwalk/core/internal/extension/api/messaging/MessagingManager;
    .locals 1
    .param p0, "x0"    # Lorg/xwalk/core/internal/extension/api/messaging/Messaging;

    .prologue
    .line 31
    iget-object v0, p0, Lorg/xwalk/core/internal/extension/api/messaging/Messaging;->mMessagingManager:Lorg/xwalk/core/internal/extension/api/messaging/MessagingManager;

    return-object v0
.end method

.method private getCommandString(Ljava/lang/String;)Ljava/lang/String;
    .locals 3
    .param p1, "message"    # Ljava/lang/String;

    .prologue
    .line 91
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 92
    const-string v1, ""

    .line 99
    :goto_0
    return-object v1

    .line 96
    :cond_0
    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string v2, "cmd"

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    goto :goto_0

    .line 97
    :catch_0
    move-exception v0

    .line 98
    .local v0, "e":Ljava/lang/Exception;
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 99
    const-string v1, ""

    goto :goto_0
.end method

.method private initMethodMap()V
    .locals 3

    .prologue
    .line 43
    sget-object v0, Lorg/xwalk/core/internal/extension/api/messaging/Messaging;->sMethodMap:Ljava/util/HashMap;

    const-string v1, "msg_smsSend"

    new-instance v2, Lorg/xwalk/core/internal/extension/api/messaging/Messaging$1;

    invoke-direct {v2, p0}, Lorg/xwalk/core/internal/extension/api/messaging/Messaging$1;-><init>(Lorg/xwalk/core/internal/extension/api/messaging/Messaging;)V

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    sget-object v0, Lorg/xwalk/core/internal/extension/api/messaging/Messaging;->sMethodMap:Ljava/util/HashMap;

    const-string v1, "msg_smsClear"

    new-instance v2, Lorg/xwalk/core/internal/extension/api/messaging/Messaging$2;

    invoke-direct {v2, p0}, Lorg/xwalk/core/internal/extension/api/messaging/Messaging$2;-><init>(Lorg/xwalk/core/internal/extension/api/messaging/Messaging;)V

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    sget-object v0, Lorg/xwalk/core/internal/extension/api/messaging/Messaging;->sMethodMap:Ljava/util/HashMap;

    const-string v1, "msg_smsSegmentInfo"

    new-instance v2, Lorg/xwalk/core/internal/extension/api/messaging/Messaging$3;

    invoke-direct {v2, p0}, Lorg/xwalk/core/internal/extension/api/messaging/Messaging$3;-><init>(Lorg/xwalk/core/internal/extension/api/messaging/Messaging;)V

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    sget-object v0, Lorg/xwalk/core/internal/extension/api/messaging/Messaging;->sMethodMap:Ljava/util/HashMap;

    const-string v1, "msg_findMessages"

    new-instance v2, Lorg/xwalk/core/internal/extension/api/messaging/Messaging$4;

    invoke-direct {v2, p0}, Lorg/xwalk/core/internal/extension/api/messaging/Messaging$4;-><init>(Lorg/xwalk/core/internal/extension/api/messaging/Messaging;)V

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    sget-object v0, Lorg/xwalk/core/internal/extension/api/messaging/Messaging;->sMethodMap:Ljava/util/HashMap;

    const-string v1, "msg_getMessage"

    new-instance v2, Lorg/xwalk/core/internal/extension/api/messaging/Messaging$5;

    invoke-direct {v2, p0}, Lorg/xwalk/core/internal/extension/api/messaging/Messaging$5;-><init>(Lorg/xwalk/core/internal/extension/api/messaging/Messaging;)V

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    sget-object v0, Lorg/xwalk/core/internal/extension/api/messaging/Messaging;->sMethodMap:Ljava/util/HashMap;

    const-string v1, "msg_deleteMessage"

    new-instance v2, Lorg/xwalk/core/internal/extension/api/messaging/Messaging$6;

    invoke-direct {v2, p0}, Lorg/xwalk/core/internal/extension/api/messaging/Messaging$6;-><init>(Lorg/xwalk/core/internal/extension/api/messaging/Messaging;)V

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    sget-object v0, Lorg/xwalk/core/internal/extension/api/messaging/Messaging;->sMethodMap:Ljava/util/HashMap;

    const-string v1, "msg_deleteConversation"

    new-instance v2, Lorg/xwalk/core/internal/extension/api/messaging/Messaging$7;

    invoke-direct {v2, p0}, Lorg/xwalk/core/internal/extension/api/messaging/Messaging$7;-><init>(Lorg/xwalk/core/internal/extension/api/messaging/Messaging;)V

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    sget-object v0, Lorg/xwalk/core/internal/extension/api/messaging/Messaging;->sMethodMap:Ljava/util/HashMap;

    const-string v1, "msg_markMessageRead"

    new-instance v2, Lorg/xwalk/core/internal/extension/api/messaging/Messaging$8;

    invoke-direct {v2, p0}, Lorg/xwalk/core/internal/extension/api/messaging/Messaging$8;-><init>(Lorg/xwalk/core/internal/extension/api/messaging/Messaging;)V

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    sget-object v0, Lorg/xwalk/core/internal/extension/api/messaging/Messaging;->sMethodMap:Ljava/util/HashMap;

    const-string v1, "msg_markConversationRead"

    new-instance v2, Lorg/xwalk/core/internal/extension/api/messaging/Messaging$9;

    invoke-direct {v2, p0}, Lorg/xwalk/core/internal/extension/api/messaging/Messaging$9;-><init>(Lorg/xwalk/core/internal/extension/api/messaging/Messaging;)V

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    return-void
.end method


# virtual methods
.method public onActivityStateChange(Landroid/app/Activity;I)V
    .locals 1
    .param p1, "activity"    # Landroid/app/Activity;
    .param p2, "newState"    # I

    .prologue
    .line 139
    const/4 v0, 0x5

    if-ne p2, v0, :cond_1

    iget-boolean v0, p0, Lorg/xwalk/core/internal/extension/api/messaging/Messaging;->isIntentFiltersRegistered:Z

    if-eqz v0, :cond_1

    .line 140
    iget-object v0, p0, Lorg/xwalk/core/internal/extension/api/messaging/Messaging;->mSmsManager:Lorg/xwalk/core/internal/extension/api/messaging/MessagingSmsManager;

    invoke-virtual {v0}, Lorg/xwalk/core/internal/extension/api/messaging/MessagingSmsManager;->unregisterIntentFilters()V

    .line 141
    const/4 v0, 0x0

    iput-boolean v0, p0, Lorg/xwalk/core/internal/extension/api/messaging/Messaging;->isIntentFiltersRegistered:Z

    .line 146
    :cond_0
    :goto_0
    return-void

    .line 142
    :cond_1
    const/4 v0, 0x2

    if-ne p2, v0, :cond_0

    iget-boolean v0, p0, Lorg/xwalk/core/internal/extension/api/messaging/Messaging;->isIntentFiltersRegistered:Z

    if-nez v0, :cond_0

    .line 143
    iget-object v0, p0, Lorg/xwalk/core/internal/extension/api/messaging/Messaging;->mSmsManager:Lorg/xwalk/core/internal/extension/api/messaging/MessagingSmsManager;

    invoke-virtual {v0}, Lorg/xwalk/core/internal/extension/api/messaging/MessagingSmsManager;->registerIntentFilters()V

    .line 144
    const/4 v0, 0x1

    iput-boolean v0, p0, Lorg/xwalk/core/internal/extension/api/messaging/Messaging;->isIntentFiltersRegistered:Z

    goto :goto_0
.end method

.method public onMessage(ILjava/lang/String;)V
    .locals 4
    .param p1, "instanceID"    # I
    .param p2, "message"    # Ljava/lang/String;

    .prologue
    .line 117
    sget-object v2, Lorg/xwalk/core/internal/extension/api/messaging/Messaging;->sMethodMap:Ljava/util/HashMap;

    invoke-direct {p0, p2}, Lorg/xwalk/core/internal/extension/api/messaging/Messaging;->getCommandString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/xwalk/core/internal/extension/api/messaging/Command;

    .line 119
    .local v0, "command":Lorg/xwalk/core/internal/extension/api/messaging/Command;
    if-eqz v0, :cond_0

    .line 121
    :try_start_0
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2, p2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-interface {v0, p1, v2}, Lorg/xwalk/core/internal/extension/api/messaging/Command;->runCommand(ILorg/json/JSONObject;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 127
    :cond_0
    :goto_0
    return-void

    .line 122
    :catch_0
    move-exception v1

    .line 123
    .local v1, "e":Ljava/lang/Exception;
    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0
.end method

.method public onSyncMessage(ILjava/lang/String;)Ljava/lang/String;
    .locals 2
    .param p1, "instanceID"    # I
    .param p2, "message"    # Ljava/lang/String;

    .prologue
    .line 131
    invoke-direct {p0, p2}, Lorg/xwalk/core/internal/extension/api/messaging/Messaging;->getCommandString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "msg_smsServiceId"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 132
    iget-object v0, p0, Lorg/xwalk/core/internal/extension/api/messaging/Messaging;->mSmsManager:Lorg/xwalk/core/internal/extension/api/messaging/MessagingSmsManager;

    invoke-virtual {v0}, Lorg/xwalk/core/internal/extension/api/messaging/MessagingSmsManager;->getServiceIds()Ljava/lang/String;

    move-result-object v0

    .line 134
    :goto_0
    return-object v0

    :cond_0
    const-string v0, ""

    goto :goto_0
.end method
