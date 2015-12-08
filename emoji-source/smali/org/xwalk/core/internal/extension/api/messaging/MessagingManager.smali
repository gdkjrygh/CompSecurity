.class public Lorg/xwalk/core/internal/extension/api/messaging/MessagingManager;
.super Ljava/lang/Object;
.source "MessagingManager.java"


# static fields
.field private static final TAG:Ljava/lang/String; = "MessagingManager"


# instance fields
.field private final mMainActivity:Landroid/app/Activity;

.field private final mMessagingHandler:Lorg/xwalk/core/internal/extension/api/messaging/Messaging;


# direct methods
.method constructor <init>(Landroid/app/Activity;Lorg/xwalk/core/internal/extension/api/messaging/Messaging;)V
    .locals 0
    .param p1, "activity"    # Landroid/app/Activity;
    .param p2, "messaging"    # Lorg/xwalk/core/internal/extension/api/messaging/Messaging;

    .prologue
    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    iput-object p1, p0, Lorg/xwalk/core/internal/extension/api/messaging/MessagingManager;->mMainActivity:Landroid/app/Activity;

    .line 42
    iput-object p2, p0, Lorg/xwalk/core/internal/extension/api/messaging/MessagingManager;->mMessagingHandler:Lorg/xwalk/core/internal/extension/api/messaging/Messaging;

    .line 43
    return-void
.end method

.method private getUri(Ljava/lang/String;)Landroid/net/Uri;
    .locals 1
    .param p1, "type"    # Ljava/lang/String;

    .prologue
    .line 70
    const-string v0, "mms"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 71
    const-string v0, "content://mms"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    .line 73
    :goto_0
    return-object v0

    :cond_0
    const-string v0, "content://sms"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    goto :goto_0
.end method

.method private operation(ILorg/json/JSONObject;)V
    .locals 23
    .param p1, "instanceID"    # I
    .param p2, "jsonMsg"    # Lorg/json/JSONObject;

    .prologue
    .line 167
    const/4 v8, 0x0

    .line 168
    .local v8, "eventBody":Lorg/json/JSONObject;
    const/4 v3, 0x0

    .local v3, "asyncCallId":Ljava/lang/String;
    const/4 v15, 0x0

    .local v15, "msgType":Ljava/lang/String;
    const/4 v9, 0x0

    .local v9, "id":Ljava/lang/String;
    const/4 v4, 0x0

    .line 169
    .local v4, "cmd":Ljava/lang/String;
    const/4 v10, 0x0

    .line 172
    .local v10, "isRead":Z
    :try_start_0
    const-string v19, "asyncCallId"

    move-object/from16 v0, p2

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 173
    const-string v19, "data"

    move-object/from16 v0, p2

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v8

    .line 174
    const-string v19, "messageID"

    move-object/from16 v0, v19

    invoke-virtual {v8, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v19

    if-eqz v19, :cond_3

    .line 175
    const-string v19, "messageID"

    move-object/from16 v0, v19

    invoke-virtual {v8, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 179
    :goto_0
    const-string v19, "cmd"

    move-object/from16 v0, p2

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 180
    const-string v19, "value"

    move-object/from16 v0, v19

    invoke-virtual {v8, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v19

    if-eqz v19, :cond_0

    .line 181
    const-string v19, "value"

    move-object/from16 v0, v19

    invoke-virtual {v8, v0}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    move-result v10

    .line 183
    :cond_0
    const-string v19, "type"

    move-object/from16 v0, v19

    invoke-virtual {v8, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v15

    .line 189
    const/16 v17, 0x0

    .line 190
    .local v17, "selString":Ljava/lang/String;
    const-string v19, "messageID"

    move-object/from16 v0, v19

    invoke-virtual {v8, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v19

    if-eqz v19, :cond_4

    .line 191
    const-string v19, "%s = ?"

    const/16 v20, 0x1

    move/from16 v0, v20

    new-array v0, v0, [Ljava/lang/Object;

    move-object/from16 v20, v0

    const/16 v21, 0x0

    const-string v22, "_id"

    aput-object v22, v20, v21

    invoke-static/range {v19 .. v20}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v17

    .line 196
    :goto_1
    const/16 v19, 0x1

    move/from16 v0, v19

    new-array v0, v0, [Ljava/lang/String;

    move-object/from16 v16, v0

    const/16 v19, 0x0

    aput-object v9, v16, v19

    .line 197
    .local v16, "selArgs":[Ljava/lang/String;
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/xwalk/core/internal/extension/api/messaging/MessagingManager;->mMainActivity:Landroid/app/Activity;

    move-object/from16 v19, v0

    invoke-virtual/range {v19 .. v19}, Landroid/app/Activity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v6

    .line 198
    .local v6, "cr":Landroid/content/ContentResolver;
    move-object/from16 v0, p0

    invoke-direct {v0, v15}, Lorg/xwalk/core/internal/extension/api/messaging/MessagingManager;->getUri(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v5

    .line 200
    .local v5, "contentUri":Landroid/net/Uri;
    const-string v19, "msg_deleteMessage"

    move-object/from16 v0, v19

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v19

    if-nez v19, :cond_1

    const-string v19, "msg_deleteConversation"

    move-object/from16 v0, v19

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v19

    if-eqz v19, :cond_5

    .line 201
    :cond_1
    move-object/from16 v0, v17

    move-object/from16 v1, v16

    invoke-virtual {v6, v5, v0, v1}, Landroid/content/ContentResolver;->delete(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I

    .line 208
    :cond_2
    :goto_2
    const/4 v13, 0x0

    .line 210
    .local v13, "jsonMsgRet":Lorg/json/JSONObject;
    :try_start_1
    new-instance v14, Lorg/json/JSONObject;

    invoke-direct {v14}, Lorg/json/JSONObject;-><init>()V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_2

    .line 211
    .end local v13    # "jsonMsgRet":Lorg/json/JSONObject;
    .local v14, "jsonMsgRet":Lorg/json/JSONObject;
    :try_start_2
    const-string v19, "asyncCallId"

    move-object/from16 v0, v19

    invoke-virtual {v14, v0, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 212
    new-instance v12, Lorg/json/JSONObject;

    invoke-direct {v12}, Lorg/json/JSONObject;-><init>()V

    .line 213
    .local v12, "jsData":Lorg/json/JSONObject;
    const-string v19, "data"

    move-object/from16 v0, v19

    invoke-virtual {v14, v0, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 214
    const-string v19, "error"

    const/16 v20, 0x0

    move-object/from16 v0, v19

    move/from16 v1, v20

    invoke-virtual {v12, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 215
    new-instance v11, Lorg/json/JSONObject;

    invoke-direct {v11}, Lorg/json/JSONObject;-><init>()V

    .line 216
    .local v11, "jsBody":Lorg/json/JSONObject;
    const-string v19, "body"

    move-object/from16 v0, v19

    invoke-virtual {v12, v0, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 217
    const-string v19, "messageID"

    move-object/from16 v0, v19

    invoke-virtual {v8, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v19

    if-eqz v19, :cond_8

    .line 218
    const-string v19, "messageID"

    move-object/from16 v0, v19

    invoke-virtual {v11, v0, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 222
    :goto_3
    const-string v19, "cmd"

    new-instance v20, Ljava/lang/StringBuilder;

    invoke-direct/range {v20 .. v20}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v0, v20

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v20

    const-string v21, "_ret"

    invoke-virtual/range {v20 .. v21}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v20

    invoke-virtual/range {v20 .. v20}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v20

    move-object/from16 v0, v19

    move-object/from16 v1, v20

    invoke-virtual {v14, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_1

    .line 228
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/xwalk/core/internal/extension/api/messaging/MessagingManager;->mMessagingHandler:Lorg/xwalk/core/internal/extension/api/messaging/Messaging;

    move-object/from16 v19, v0

    invoke-virtual {v14}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v20

    move-object/from16 v0, v19

    move/from16 v1, p1

    move-object/from16 v2, v20

    invoke-virtual {v0, v1, v2}, Lorg/xwalk/core/internal/extension/api/messaging/Messaging;->postMessage(ILjava/lang/String;)V

    .line 229
    .end local v5    # "contentUri":Landroid/net/Uri;
    .end local v6    # "cr":Landroid/content/ContentResolver;
    .end local v11    # "jsBody":Lorg/json/JSONObject;
    .end local v12    # "jsData":Lorg/json/JSONObject;
    .end local v14    # "jsonMsgRet":Lorg/json/JSONObject;
    .end local v16    # "selArgs":[Ljava/lang/String;
    .end local v17    # "selString":Ljava/lang/String;
    :goto_4
    return-void

    .line 177
    :cond_3
    :try_start_3
    const-string v19, "conversationID"

    move-object/from16 v0, v19

    invoke-virtual {v8, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
    :try_end_3
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_0

    move-result-object v9

    goto/16 :goto_0

    .line 184
    :catch_0
    move-exception v7

    .line 185
    .local v7, "e":Lorg/json/JSONException;
    invoke-virtual {v7}, Lorg/json/JSONException;->printStackTrace()V

    goto :goto_4

    .line 193
    .end local v7    # "e":Lorg/json/JSONException;
    .restart local v17    # "selString":Ljava/lang/String;
    :cond_4
    const-string v19, "%s = ?"

    const/16 v20, 0x1

    move/from16 v0, v20

    new-array v0, v0, [Ljava/lang/Object;

    move-object/from16 v20, v0

    const/16 v21, 0x0

    const-string v22, "thread_id"

    aput-object v22, v20, v21

    invoke-static/range {v19 .. v20}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v17

    goto/16 :goto_1

    .line 202
    .restart local v5    # "contentUri":Landroid/net/Uri;
    .restart local v6    # "cr":Landroid/content/ContentResolver;
    .restart local v16    # "selArgs":[Ljava/lang/String;
    :cond_5
    const-string v19, "msg_markMessageRead"

    move-object/from16 v0, v19

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v19

    if-nez v19, :cond_6

    const-string v19, "msg_markConversationRead"

    move-object/from16 v0, v19

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v19

    if-eqz v19, :cond_2

    .line 203
    :cond_6
    new-instance v18, Landroid/content/ContentValues;

    invoke-direct/range {v18 .. v18}, Landroid/content/ContentValues;-><init>()V

    .line 204
    .local v18, "values":Landroid/content/ContentValues;
    const-string v20, "read"

    if-eqz v10, :cond_7

    const-string v19, "1"

    :goto_5
    move-object/from16 v0, v18

    move-object/from16 v1, v20

    move-object/from16 v2, v19

    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 205
    move-object/from16 v0, v18

    move-object/from16 v1, v17

    move-object/from16 v2, v16

    invoke-virtual {v6, v5, v0, v1, v2}, Landroid/content/ContentResolver;->update(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    goto/16 :goto_2

    .line 204
    :cond_7
    const-string v19, "0"

    goto :goto_5

    .line 220
    .end local v18    # "values":Landroid/content/ContentValues;
    .restart local v11    # "jsBody":Lorg/json/JSONObject;
    .restart local v12    # "jsData":Lorg/json/JSONObject;
    .restart local v14    # "jsonMsgRet":Lorg/json/JSONObject;
    :cond_8
    :try_start_4
    const-string v19, "conversationID"

    move-object/from16 v0, v19

    invoke-virtual {v11, v0, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_4
    .catch Lorg/json/JSONException; {:try_start_4 .. :try_end_4} :catch_1

    goto/16 :goto_3

    .line 223
    .end local v11    # "jsBody":Lorg/json/JSONObject;
    .end local v12    # "jsData":Lorg/json/JSONObject;
    :catch_1
    move-exception v7

    move-object v13, v14

    .line 224
    .end local v14    # "jsonMsgRet":Lorg/json/JSONObject;
    .restart local v7    # "e":Lorg/json/JSONException;
    .restart local v13    # "jsonMsgRet":Lorg/json/JSONObject;
    :goto_6
    invoke-virtual {v7}, Lorg/json/JSONException;->printStackTrace()V

    goto :goto_4

    .line 223
    .end local v7    # "e":Lorg/json/JSONException;
    :catch_2
    move-exception v7

    goto :goto_6
.end method

.method private queryMessage(ILorg/json/JSONObject;)V
    .locals 28
    .param p1, "instanceID"    # I
    .param p2, "jsonMsg"    # Lorg/json/JSONObject;

    .prologue
    .line 78
    const/4 v8, 0x0

    .local v8, "asyncCallId":Ljava/lang/String;
    const/16 v21, 0x0

    .local v21, "msgType":Ljava/lang/String;
    const/4 v9, 0x0

    .local v9, "cmd":Ljava/lang/String;
    const/16 v20, 0x0

    .line 79
    .local v20, "messageID":Ljava/lang/String;
    const/4 v13, 0x0

    .local v13, "filter":Lorg/json/JSONObject;
    const/4 v14, 0x0

    .line 82
    .local v14, "filterOption":Lorg/json/JSONObject;
    :try_start_0
    const-string v4, "asyncCallId"

    move-object/from16 v0, p2

    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 83
    const-string v4, "cmd"

    move-object/from16 v0, p2

    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 84
    const-string v4, "data"

    move-object/from16 v0, p2

    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v12

    .line 85
    .local v12, "eventBody":Lorg/json/JSONObject;
    const-string v4, "messageID"

    invoke-virtual {v12, v4}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 86
    const-string v4, "messageID"

    invoke-virtual {v12, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v20

    .line 88
    :cond_0
    const-string v4, "filter"

    invoke-virtual {v12, v4}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 89
    const-string v4, "filter"

    invoke-virtual {v12, v4}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v13

    .line 91
    :cond_1
    const-string v4, "options"

    invoke-virtual {v12, v4}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 92
    const-string v4, "options"

    invoke-virtual {v12, v4}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v14

    .line 94
    :cond_2
    if-eqz v13, :cond_3

    .line 95
    const-string v4, "type"

    invoke-virtual {v13, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v21

    .line 104
    :goto_0
    const-string v4, "sms"

    move-object/from16 v0, v21

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_4

    const-string v4, "mms"

    move-object/from16 v0, v21

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_4

    .line 105
    const-string v4, "MessagingManager"

    new-instance v25, Ljava/lang/StringBuilder;

    invoke-direct/range {v25 .. v25}, Ljava/lang/StringBuilder;-><init>()V

    const-string v26, "Invalidate message type: "

    invoke-virtual/range {v25 .. v26}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v25

    move-object/from16 v0, v25

    move-object/from16 v1, v21

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v25

    invoke-virtual/range {v25 .. v25}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v25

    move-object/from16 v0, v25

    invoke-static {v4, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 164
    .end local v12    # "eventBody":Lorg/json/JSONObject;
    :goto_1
    return-void

    .line 97
    .restart local v12    # "eventBody":Lorg/json/JSONObject;
    :cond_3
    :try_start_1
    const-string v4, "type"

    invoke-virtual {v12, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    move-result-object v21

    goto :goto_0

    .line 99
    .end local v12    # "eventBody":Lorg/json/JSONObject;
    :catch_0
    move-exception v11

    .line 100
    .local v11, "e":Lorg/json/JSONException;
    invoke-virtual {v11}, Lorg/json/JSONException;->printStackTrace()V

    goto :goto_1

    .line 109
    .end local v11    # "e":Lorg/json/JSONException;
    .restart local v12    # "eventBody":Lorg/json/JSONObject;
    :cond_4
    move-object/from16 v0, p0

    iget-object v4, v0, Lorg/xwalk/core/internal/extension/api/messaging/MessagingManager;->mMainActivity:Landroid/app/Activity;

    invoke-virtual {v4}, Landroid/app/Activity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v2

    .line 110
    .local v2, "cr":Landroid/content/ContentResolver;
    move-object/from16 v0, p0

    move-object/from16 v1, v21

    invoke-direct {v0, v1}, Lorg/xwalk/core/internal/extension/api/messaging/MessagingManager;->getUri(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v3

    .line 111
    .local v3, "contentUri":Landroid/net/Uri;
    const/4 v5, 0x0

    .line 112
    .local v5, "sqlString":Ljava/lang/String;
    const/4 v6, 0x0

    .line 113
    .local v6, "sqlArgs":[Ljava/lang/String;
    const/4 v7, 0x0

    .line 115
    .local v7, "sqlOption":Ljava/lang/String;
    const-string v4, "msg_findMessages"

    invoke-virtual {v9, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    .line 116
    invoke-static {v13}, Lorg/xwalk/core/internal/extension/api/messaging/MessagingHelpers;->buildSqlFilterString(Lorg/json/JSONObject;)[Ljava/lang/Object;

    move-result-object v24

    .line 117
    .local v24, "retValue":[Ljava/lang/Object;
    const/4 v4, 0x0

    aget-object v5, v24, v4

    .end local v5    # "sqlString":Ljava/lang/String;
    check-cast v5, Ljava/lang/String;

    .line 118
    .restart local v5    # "sqlString":Ljava/lang/String;
    const/4 v4, 0x1

    aget-object v4, v24, v4

    check-cast v4, [Ljava/lang/String;

    move-object v6, v4

    check-cast v6, [Ljava/lang/String;

    .line 119
    invoke-static {v14}, Lorg/xwalk/core/internal/extension/api/messaging/MessagingHelpers;->buildSqlFilterOptionString(Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v7

    .line 125
    .end local v24    # "retValue":[Ljava/lang/Object;
    :goto_2
    const/4 v4, 0x0

    invoke-virtual/range {v2 .. v7}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v10

    .line 127
    .local v10, "cursor":Landroid/database/Cursor;
    const/16 v17, 0x0

    .line 128
    .local v17, "jsonMsgRet":Lorg/json/JSONObject;
    const/16 v22, 0x0

    .line 130
    .local v22, "results":Lorg/json/JSONArray;
    :try_start_2
    new-instance v18, Lorg/json/JSONObject;

    invoke-direct/range {v18 .. v18}, Lorg/json/JSONObject;-><init>()V
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_1

    .line 131
    .end local v17    # "jsonMsgRet":Lorg/json/JSONObject;
    .local v18, "jsonMsgRet":Lorg/json/JSONObject;
    :try_start_3
    new-instance v23, Lorg/json/JSONArray;

    invoke-direct/range {v23 .. v23}, Lorg/json/JSONArray;-><init>()V
    :try_end_3
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_2

    .line 132
    .end local v22    # "results":Lorg/json/JSONArray;
    .local v23, "results":Lorg/json/JSONArray;
    :try_start_4
    const-string v4, "asyncCallId"

    move-object/from16 v0, v18

    invoke-virtual {v0, v4, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 133
    const-string v4, "cmd"

    new-instance v25, Ljava/lang/StringBuilder;

    invoke-direct/range {v25 .. v25}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v0, v25

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v25

    const-string v26, "_ret"

    invoke-virtual/range {v25 .. v26}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v25

    invoke-virtual/range {v25 .. v25}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v25

    move-object/from16 v0, v18

    move-object/from16 v1, v25

    invoke-virtual {v0, v4, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 134
    new-instance v16, Lorg/json/JSONObject;

    invoke-direct/range {v16 .. v16}, Lorg/json/JSONObject;-><init>()V

    .line 135
    .local v16, "jsData":Lorg/json/JSONObject;
    const-string v4, "data"

    move-object/from16 v0, v18

    move-object/from16 v1, v16

    invoke-virtual {v0, v4, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 136
    const-string v4, "error"

    const/16 v25, 0x0

    move-object/from16 v0, v16

    move/from16 v1, v25

    invoke-virtual {v0, v4, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 137
    new-instance v15, Lorg/json/JSONObject;

    invoke-direct {v15}, Lorg/json/JSONObject;-><init>()V

    .line 138
    .local v15, "jsBody":Lorg/json/JSONObject;
    const-string v4, "body"

    move-object/from16 v0, v16

    invoke-virtual {v0, v4, v15}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 139
    const-string v4, "results"

    move-object/from16 v0, v23

    invoke-virtual {v15, v4, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_4
    .catch Lorg/json/JSONException; {:try_start_4 .. :try_end_4} :catch_3

    .line 146
    :try_start_5
    const-string v4, "mms"

    move-object/from16 v0, v21

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    move-result v4

    if-eqz v4, :cond_7

    .line 160
    :cond_5
    invoke-interface {v10}, Landroid/database/Cursor;->close()V

    .line 163
    move-object/from16 v0, p0

    iget-object v4, v0, Lorg/xwalk/core/internal/extension/api/messaging/MessagingManager;->mMessagingHandler:Lorg/xwalk/core/internal/extension/api/messaging/Messaging;

    invoke-virtual/range {v18 .. v18}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v25

    move/from16 v0, p1

    move-object/from16 v1, v25

    invoke-virtual {v4, v0, v1}, Lorg/xwalk/core/internal/extension/api/messaging/Messaging;->postMessage(ILjava/lang/String;)V

    goto/16 :goto_1

    .line 121
    .end local v10    # "cursor":Landroid/database/Cursor;
    .end local v15    # "jsBody":Lorg/json/JSONObject;
    .end local v16    # "jsData":Lorg/json/JSONObject;
    .end local v18    # "jsonMsgRet":Lorg/json/JSONObject;
    .end local v23    # "results":Lorg/json/JSONArray;
    :cond_6
    const-string v4, "%s = ?"

    const/16 v25, 0x1

    move/from16 v0, v25

    new-array v0, v0, [Ljava/lang/Object;

    move-object/from16 v25, v0

    const/16 v26, 0x0

    const-string v27, "_id"

    aput-object v27, v25, v26

    move-object/from16 v0, v25

    invoke-static {v4, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    .line 122
    const/4 v4, 0x1

    new-array v6, v4, [Ljava/lang/String;

    .end local v6    # "sqlArgs":[Ljava/lang/String;
    const/4 v4, 0x0

    aput-object v20, v6, v4

    .restart local v6    # "sqlArgs":[Ljava/lang/String;
    goto/16 :goto_2

    .line 140
    .restart local v10    # "cursor":Landroid/database/Cursor;
    .restart local v17    # "jsonMsgRet":Lorg/json/JSONObject;
    .restart local v22    # "results":Lorg/json/JSONArray;
    :catch_1
    move-exception v11

    .line 141
    .restart local v11    # "e":Lorg/json/JSONException;
    :goto_3
    invoke-virtual {v11}, Lorg/json/JSONException;->printStackTrace()V

    goto/16 :goto_1

    .line 151
    .end local v11    # "e":Lorg/json/JSONException;
    .end local v17    # "jsonMsgRet":Lorg/json/JSONObject;
    .end local v22    # "results":Lorg/json/JSONArray;
    .restart local v15    # "jsBody":Lorg/json/JSONObject;
    .restart local v16    # "jsData":Lorg/json/JSONObject;
    .restart local v18    # "jsonMsgRet":Lorg/json/JSONObject;
    .restart local v23    # "results":Lorg/json/JSONArray;
    :cond_7
    :try_start_6
    invoke-interface {v10}, Landroid/database/Cursor;->getCount()I

    move-result v4

    if-lez v4, :cond_5

    .line 152
    :cond_8
    :goto_4
    invoke-interface {v10}, Landroid/database/Cursor;->moveToNext()Z

    move-result v4

    if-eqz v4, :cond_5

    .line 153
    invoke-static {v10}, Lorg/xwalk/core/internal/extension/api/messaging/MessagingHelpers;->SmsMessageCursor2Json(Landroid/database/Cursor;)Lorg/json/JSONObject;

    move-result-object v19

    .line 154
    .local v19, "jsonSmsObj":Lorg/json/JSONObject;
    if-eqz v19, :cond_8

    .line 155
    move-object/from16 v0, v23

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    goto :goto_4

    .line 160
    .end local v19    # "jsonSmsObj":Lorg/json/JSONObject;
    :catchall_0
    move-exception v4

    invoke-interface {v10}, Landroid/database/Cursor;->close()V

    throw v4

    .line 140
    .end local v15    # "jsBody":Lorg/json/JSONObject;
    .end local v16    # "jsData":Lorg/json/JSONObject;
    .end local v23    # "results":Lorg/json/JSONArray;
    .restart local v22    # "results":Lorg/json/JSONArray;
    :catch_2
    move-exception v11

    move-object/from16 v17, v18

    .end local v18    # "jsonMsgRet":Lorg/json/JSONObject;
    .restart local v17    # "jsonMsgRet":Lorg/json/JSONObject;
    goto :goto_3

    .end local v17    # "jsonMsgRet":Lorg/json/JSONObject;
    .end local v22    # "results":Lorg/json/JSONArray;
    .restart local v18    # "jsonMsgRet":Lorg/json/JSONObject;
    .restart local v23    # "results":Lorg/json/JSONArray;
    :catch_3
    move-exception v11

    move-object/from16 v22, v23

    .end local v23    # "results":Lorg/json/JSONArray;
    .restart local v22    # "results":Lorg/json/JSONArray;
    move-object/from16 v17, v18

    .end local v18    # "jsonMsgRet":Lorg/json/JSONObject;
    .restart local v17    # "jsonMsgRet":Lorg/json/JSONObject;
    goto :goto_3
.end method


# virtual methods
.method public onMsgDeleteConversation(ILorg/json/JSONObject;)V
    .locals 0
    .param p1, "instanceID"    # I
    .param p2, "jsonMsg"    # Lorg/json/JSONObject;

    .prologue
    .line 58
    invoke-direct {p0, p1, p2}, Lorg/xwalk/core/internal/extension/api/messaging/MessagingManager;->operation(ILorg/json/JSONObject;)V

    .line 59
    return-void
.end method

.method public onMsgDeleteMessage(ILorg/json/JSONObject;)V
    .locals 0
    .param p1, "instanceID"    # I
    .param p2, "jsonMsg"    # Lorg/json/JSONObject;

    .prologue
    .line 54
    invoke-direct {p0, p1, p2}, Lorg/xwalk/core/internal/extension/api/messaging/MessagingManager;->operation(ILorg/json/JSONObject;)V

    .line 55
    return-void
.end method

.method public onMsgFindMessages(ILorg/json/JSONObject;)V
    .locals 0
    .param p1, "instanceID"    # I
    .param p2, "jsonMsg"    # Lorg/json/JSONObject;

    .prologue
    .line 46
    invoke-direct {p0, p1, p2}, Lorg/xwalk/core/internal/extension/api/messaging/MessagingManager;->queryMessage(ILorg/json/JSONObject;)V

    .line 47
    return-void
.end method

.method public onMsgGetMessage(ILorg/json/JSONObject;)V
    .locals 0
    .param p1, "instanceID"    # I
    .param p2, "jsonMsg"    # Lorg/json/JSONObject;

    .prologue
    .line 50
    invoke-direct {p0, p1, p2}, Lorg/xwalk/core/internal/extension/api/messaging/MessagingManager;->queryMessage(ILorg/json/JSONObject;)V

    .line 51
    return-void
.end method

.method public onMsgMarkConversationRead(ILorg/json/JSONObject;)V
    .locals 0
    .param p1, "instanceID"    # I
    .param p2, "jsonMsg"    # Lorg/json/JSONObject;

    .prologue
    .line 66
    invoke-direct {p0, p1, p2}, Lorg/xwalk/core/internal/extension/api/messaging/MessagingManager;->operation(ILorg/json/JSONObject;)V

    .line 67
    return-void
.end method

.method public onMsgMarkMessageRead(ILorg/json/JSONObject;)V
    .locals 0
    .param p1, "instanceID"    # I
    .param p2, "jsonMsg"    # Lorg/json/JSONObject;

    .prologue
    .line 62
    invoke-direct {p0, p1, p2}, Lorg/xwalk/core/internal/extension/api/messaging/MessagingManager;->operation(ILorg/json/JSONObject;)V

    .line 63
    return-void
.end method
