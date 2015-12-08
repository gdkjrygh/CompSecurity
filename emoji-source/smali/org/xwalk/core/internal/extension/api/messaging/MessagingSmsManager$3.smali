.class Lorg/xwalk/core/internal/extension/api/messaging/MessagingSmsManager$3;
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
    .line 283
    iput-object p1, p0, Lorg/xwalk/core/internal/extension/api/messaging/MessagingSmsManager$3;->this$0:Lorg/xwalk/core/internal/extension/api/messaging/MessagingSmsManager;

    invoke-direct {p0, p1, p2}, Lorg/xwalk/core/internal/extension/api/messaging/MessagingSmsManager$MessagingReceiver;-><init>(Lorg/xwalk/core/internal/extension/api/messaging/MessagingSmsManager;Lorg/xwalk/core/internal/extension/api/messaging/Messaging;)V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 10
    .param p1, "content"    # Landroid/content/Context;
    .param p2, "intent"    # Landroid/content/Intent;

    .prologue
    .line 286
    invoke-virtual {p0}, Lorg/xwalk/core/internal/extension/api/messaging/MessagingSmsManager$3;->getResultCode()I

    move-result v8

    const/4 v9, -0x1

    if-eq v8, v9, :cond_0

    const/4 v2, 0x1

    .line 287
    .local v2, "error":Z
    :goto_0
    const-string v8, "asyncCallId"

    invoke-virtual {p2, v8}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 288
    .local v0, "asyncCallId":Ljava/lang/String;
    const-string v8, "instanceid"

    invoke-virtual {p2, v8}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v3

    .line 291
    .local v3, "instanceID":I
    :try_start_0
    new-instance v6, Lorg/json/JSONObject;

    invoke-direct {v6}, Lorg/json/JSONObject;-><init>()V

    .line 292
    .local v6, "jsonMsg":Lorg/json/JSONObject;
    const-string v8, "asyncCallId"

    invoke-virtual {v6, v8, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 293
    const-string v9, "cmd"

    if-eqz v2, :cond_1

    const-string v8, "deliveryerror"

    :goto_1
    invoke-virtual {v6, v9, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 294
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 295
    .local v4, "jsData":Lorg/json/JSONObject;
    const-string v8, "data"

    invoke-virtual {v6, v8, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 296
    new-instance v5, Lorg/json/JSONObject;

    invoke-direct {v5}, Lorg/json/JSONObject;-><init>()V

    .line 297
    .local v5, "jsEvent":Lorg/json/JSONObject;
    const-string v8, "event"

    invoke-virtual {v4, v8, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 298
    const-string v8, "serviceID"

    const-string v9, "sim0"

    invoke-virtual {v5, v8, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 299
    const-string v8, "messageID"

    const-string v9, ""

    invoke-virtual {v5, v8, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 300
    const-string v8, "recipients"

    const-string v9, ""

    invoke-virtual {v5, v8, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 301
    new-instance v7, Ljava/text/SimpleDateFormat;

    const-string v8, "yyyy-MM-dd hh:mm:ss"

    invoke-direct {v7, v8}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 302
    .local v7, "sDateFormat":Ljava/text/SimpleDateFormat;
    const-string v8, "deliveryTimestamps"

    new-instance v9, Ljava/util/Date;

    invoke-direct {v9}, Ljava/util/Date;-><init>()V

    invoke-virtual {v7, v9}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v5, v8, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 303
    const-string v8, "error"

    invoke-virtual {v4, v8, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 304
    iget-object v8, p0, Lorg/xwalk/core/internal/extension/api/messaging/MessagingSmsManager$3;->mMessaging:Lorg/xwalk/core/internal/extension/api/messaging/Messaging;

    invoke-virtual {v6}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v3, v9}, Lorg/xwalk/core/internal/extension/api/messaging/Messaging;->postMessage(ILjava/lang/String;)V

    .line 309
    .end local v4    # "jsData":Lorg/json/JSONObject;
    .end local v5    # "jsEvent":Lorg/json/JSONObject;
    .end local v6    # "jsonMsg":Lorg/json/JSONObject;
    .end local v7    # "sDateFormat":Ljava/text/SimpleDateFormat;
    :goto_2
    return-void

    .line 286
    .end local v0    # "asyncCallId":Ljava/lang/String;
    .end local v2    # "error":Z
    .end local v3    # "instanceID":I
    :cond_0
    const/4 v2, 0x0

    goto :goto_0

    .line 293
    .restart local v0    # "asyncCallId":Ljava/lang/String;
    .restart local v2    # "error":Z
    .restart local v3    # "instanceID":I
    .restart local v6    # "jsonMsg":Lorg/json/JSONObject;
    :cond_1
    const-string v8, "deliverysuccess"
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    .line 305
    .end local v6    # "jsonMsg":Lorg/json/JSONObject;
    :catch_0
    move-exception v1

    .line 306
    .local v1, "e":Lorg/json/JSONException;
    invoke-virtual {v1}, Lorg/json/JSONException;->printStackTrace()V

    goto :goto_2
.end method
