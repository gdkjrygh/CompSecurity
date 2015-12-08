.class Lorg/xwalk/core/internal/extension/api/messaging/MessagingSmsManager$2;
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
    .line 233
    iput-object p1, p0, Lorg/xwalk/core/internal/extension/api/messaging/MessagingSmsManager$2;->this$0:Lorg/xwalk/core/internal/extension/api/messaging/MessagingSmsManager;

    invoke-direct {p0, p1, p2}, Lorg/xwalk/core/internal/extension/api/messaging/MessagingSmsManager$MessagingReceiver;-><init>(Lorg/xwalk/core/internal/extension/api/messaging/MessagingSmsManager;Lorg/xwalk/core/internal/extension/api/messaging/Messaging;)V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 15
    .param p1, "content"    # Landroid/content/Context;
    .param p2, "intent"    # Landroid/content/Intent;

    .prologue
    .line 236
    iget-object v13, p0, Lorg/xwalk/core/internal/extension/api/messaging/MessagingSmsManager$2;->this$0:Lorg/xwalk/core/internal/extension/api/messaging/MessagingSmsManager;

    # getter for: Lorg/xwalk/core/internal/extension/api/messaging/MessagingSmsManager;->mActivity:Ljava/lang/ref/WeakReference;
    invoke-static {v13}, Lorg/xwalk/core/internal/extension/api/messaging/MessagingSmsManager;->access$000(Lorg/xwalk/core/internal/extension/api/messaging/MessagingSmsManager;)Ljava/lang/ref/WeakReference;

    move-result-object v13

    invoke-virtual {v13}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/app/Activity;

    .line 237
    .local v1, "activity":Landroid/app/Activity;
    if-nez v1, :cond_0

    .line 280
    :goto_0
    return-void

    .line 239
    :cond_0
    invoke-virtual {p0}, Lorg/xwalk/core/internal/extension/api/messaging/MessagingSmsManager$2;->getResultCode()I

    move-result v13

    const/4 v14, -0x1

    if-eq v13, v14, :cond_1

    const/4 v4, 0x1

    .line 240
    .local v4, "error":Z
    :goto_1
    const-string v13, "asyncCallId"

    move-object/from16 v0, p2

    invoke-virtual {v0, v13}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 241
    .local v2, "asyncCallId":Ljava/lang/String;
    const-string v13, "message"

    move-object/from16 v0, p2

    invoke-virtual {v0, v13}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 242
    .local v10, "smsMessage":Ljava/lang/String;
    const-string v13, "to"

    move-object/from16 v0, p2

    invoke-virtual {v0, v13}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 243
    .local v11, "to":Ljava/lang/String;
    const-string v13, "instanceid"

    move-object/from16 v0, p2

    invoke-virtual {v0, v13}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v13

    invoke-virtual {v13}, Ljava/lang/Integer;->intValue()I

    move-result v5

    .line 246
    .local v5, "instanceID":I
    :try_start_0
    new-instance v7, Lorg/json/JSONObject;

    invoke-direct {v7}, Lorg/json/JSONObject;-><init>()V

    .line 247
    .local v7, "jsSentMsg":Lorg/json/JSONObject;
    const-string v13, "type"

    const-string v14, "sms"

    invoke-virtual {v7, v13, v14}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 248
    const-string v13, "from"

    const-string v14, ""

    invoke-virtual {v7, v13, v14}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 249
    const-string v13, "read"

    const/4 v14, 0x1

    invoke-virtual {v7, v13, v14}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 250
    const-string v13, "to"

    invoke-virtual {v7, v13, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 251
    const-string v13, "body"

    invoke-virtual {v7, v13, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 252
    const-string v13, "messageClass"

    const-string v14, "class1"

    invoke-virtual {v7, v13, v14}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 253
    const-string v14, "state"

    if-eqz v4, :cond_2

    const-string v13, "failed"

    :goto_2
    invoke-virtual {v7, v14, v13}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 254
    const-string v14, "deliveryStatus"

    if-eqz v4, :cond_3

    const-string v13, "error"

    :goto_3
    invoke-virtual {v7, v14, v13}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 256
    new-instance v9, Lorg/json/JSONObject;

    invoke-direct {v9}, Lorg/json/JSONObject;-><init>()V

    .line 257
    .local v9, "jsonMsgPromise":Lorg/json/JSONObject;
    const-string v13, "asyncCallId"

    invoke-virtual {v9, v13, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 258
    const-string v13, "cmd"

    const-string v14, "msg_smsSend_ret"

    invoke-virtual {v9, v13, v14}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 259
    new-instance v6, Lorg/json/JSONObject;

    invoke-direct {v6}, Lorg/json/JSONObject;-><init>()V

    .line 260
    .local v6, "jsData":Lorg/json/JSONObject;
    const-string v13, "data"

    invoke-virtual {v9, v13, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 261
    const-string v13, "error"

    invoke-virtual {v6, v13, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 262
    const-string v13, "body"

    invoke-virtual {v6, v13, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 264
    iget-object v13, p0, Lorg/xwalk/core/internal/extension/api/messaging/MessagingSmsManager$2;->mMessaging:Lorg/xwalk/core/internal/extension/api/messaging/Messaging;

    invoke-virtual {v9}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v13, v5, v14}, Lorg/xwalk/core/internal/extension/api/messaging/Messaging;->postMessage(ILjava/lang/String;)V

    .line 266
    new-instance v8, Lorg/json/JSONObject;

    invoke-direct {v8}, Lorg/json/JSONObject;-><init>()V

    .line 267
    .local v8, "jsonMsgEvent":Lorg/json/JSONObject;
    const-string v13, "cmd"

    const-string v14, "sent"

    invoke-virtual {v8, v13, v14}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 268
    const-string v13, "data"

    invoke-virtual {v8, v13, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 270
    iget-object v13, p0, Lorg/xwalk/core/internal/extension/api/messaging/MessagingSmsManager$2;->mMessaging:Lorg/xwalk/core/internal/extension/api/messaging/Messaging;

    invoke-virtual {v8}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v13, v14}, Lorg/xwalk/core/internal/extension/api/messaging/Messaging;->broadcastMessage(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 276
    new-instance v12, Landroid/content/ContentValues;

    invoke-direct {v12}, Landroid/content/ContentValues;-><init>()V

    .line 277
    .local v12, "values":Landroid/content/ContentValues;
    const-string v13, "address"

    invoke-virtual {v12, v13, v11}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 278
    const-string v13, "body"

    invoke-virtual {v12, v13, v10}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 279
    invoke-virtual {v1}, Landroid/app/Activity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v13

    const-string v14, "content://sms/sent"

    invoke-static {v14}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v14

    invoke-virtual {v13, v14, v12}, Landroid/content/ContentResolver;->insert(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;

    goto/16 :goto_0

    .line 239
    .end local v2    # "asyncCallId":Ljava/lang/String;
    .end local v4    # "error":Z
    .end local v5    # "instanceID":I
    .end local v6    # "jsData":Lorg/json/JSONObject;
    .end local v7    # "jsSentMsg":Lorg/json/JSONObject;
    .end local v8    # "jsonMsgEvent":Lorg/json/JSONObject;
    .end local v9    # "jsonMsgPromise":Lorg/json/JSONObject;
    .end local v10    # "smsMessage":Ljava/lang/String;
    .end local v11    # "to":Ljava/lang/String;
    .end local v12    # "values":Landroid/content/ContentValues;
    :cond_1
    const/4 v4, 0x0

    goto/16 :goto_1

    .line 253
    .restart local v2    # "asyncCallId":Ljava/lang/String;
    .restart local v4    # "error":Z
    .restart local v5    # "instanceID":I
    .restart local v7    # "jsSentMsg":Lorg/json/JSONObject;
    .restart local v10    # "smsMessage":Ljava/lang/String;
    .restart local v11    # "to":Ljava/lang/String;
    :cond_2
    :try_start_1
    const-string v13, "sending"

    goto :goto_2

    .line 254
    :cond_3
    const-string v13, "pending"
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_3

    .line 271
    .end local v7    # "jsSentMsg":Lorg/json/JSONObject;
    :catch_0
    move-exception v3

    .line 272
    .local v3, "e":Lorg/json/JSONException;
    invoke-virtual {v3}, Lorg/json/JSONException;->printStackTrace()V

    goto/16 :goto_0
.end method
