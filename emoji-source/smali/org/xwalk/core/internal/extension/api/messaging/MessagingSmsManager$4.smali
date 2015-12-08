.class Lorg/xwalk/core/internal/extension/api/messaging/MessagingSmsManager$4;
.super Lorg/xwalk/core/internal/extension/api/messaging/MessagingSmsManager$MessagingReceiver;
.source "MessagingSmsManager.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/xwalk/core/internal/extension/api/messaging/MessagingSmsManager;->registerIntentFilters()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lorg/xwalk/core/internal/extension/api/messaging/MessagingSmsManager;


# direct methods
.method constructor <init>(Lorg/xwalk/core/internal/extension/api/messaging/MessagingSmsManager;Lorg/xwalk/core/internal/extension/api/messaging/Messaging;)V
    .locals 0
    .param p2, "x0"    # Lorg/xwalk/core/internal/extension/api/messaging/Messaging;

    .prologue
    .line 312
    iput-object p1, p0, Lorg/xwalk/core/internal/extension/api/messaging/MessagingSmsManager$4;->this$0:Lorg/xwalk/core/internal/extension/api/messaging/MessagingSmsManager;

    invoke-direct {p0, p1, p2}, Lorg/xwalk/core/internal/extension/api/messaging/MessagingSmsManager$MessagingReceiver;-><init>(Lorg/xwalk/core/internal/extension/api/messaging/MessagingSmsManager;Lorg/xwalk/core/internal/extension/api/messaging/Messaging;)V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 7
    .param p1, "content"    # Landroid/content/Context;
    .param p2, "intent"    # Landroid/content/Intent;

    .prologue
    .line 316
    :try_start_0
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    .line 317
    .local v3, "jsonMsg":Lorg/json/JSONObject;
    const-string v5, "cmd"

    iget-object v4, p0, Lorg/xwalk/core/internal/extension/api/messaging/MessagingSmsManager$4;->this$0:Lorg/xwalk/core/internal/extension/api/messaging/MessagingSmsManager;

    const-string v6, "sim0"

    # invokes: Lorg/xwalk/core/internal/extension/api/messaging/MessagingSmsManager;->checkService(Ljava/lang/String;)Z
    invoke-static {v4, v6}, Lorg/xwalk/core/internal/extension/api/messaging/MessagingSmsManager;->access$100(Lorg/xwalk/core/internal/extension/api/messaging/MessagingSmsManager;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_0

    const-string v4, "serviceadded"

    :goto_0
    invoke-virtual {v3, v5, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 319
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 320
    .local v1, "jsData":Lorg/json/JSONObject;
    const-string v4, "data"

    invoke-virtual {v3, v4, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 321
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 322
    .local v2, "jsEvent":Lorg/json/JSONObject;
    const-string v4, "event"

    invoke-virtual {v1, v4, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 323
    const-string v4, "serviceID"

    const-string v5, "sim0"

    invoke-virtual {v2, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 324
    iget-object v4, p0, Lorg/xwalk/core/internal/extension/api/messaging/MessagingSmsManager$4;->mMessaging:Lorg/xwalk/core/internal/extension/api/messaging/Messaging;

    invoke-virtual {v3}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Lorg/xwalk/core/internal/extension/api/messaging/Messaging;->broadcastMessage(Ljava/lang/String;)V

    .line 329
    .end local v1    # "jsData":Lorg/json/JSONObject;
    .end local v2    # "jsEvent":Lorg/json/JSONObject;
    .end local v3    # "jsonMsg":Lorg/json/JSONObject;
    :goto_1
    return-void

    .line 317
    .restart local v3    # "jsonMsg":Lorg/json/JSONObject;
    :cond_0
    const-string v4, "serviceremoved"
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 325
    .end local v3    # "jsonMsg":Lorg/json/JSONObject;
    :catch_0
    move-exception v0

    .line 326
    .local v0, "e":Lorg/json/JSONException;
    invoke-virtual {v0}, Lorg/json/JSONException;->printStackTrace()V

    goto :goto_1
.end method
