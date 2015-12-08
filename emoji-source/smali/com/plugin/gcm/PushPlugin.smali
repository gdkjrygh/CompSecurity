.class public Lcom/plugin/gcm/PushPlugin;
.super Lorg/apache/cordova/CordovaPlugin;
.source "PushPlugin.java"


# static fields
.field public static final EXIT:Ljava/lang/String; = "exit"

.field public static final REGISTER:Ljava/lang/String; = "register"

.field public static final TAG:Ljava/lang/String; = "PushPlugin"

.field public static final UNREGISTER:Ljava/lang/String; = "unregister"

.field private static gCachedExtras:Landroid/os/Bundle;

.field private static gECB:Ljava/lang/String;

.field private static gForeground:Z

.field private static gSenderID:Ljava/lang/String;

.field private static gWebView:Lorg/apache/cordova/CordovaWebView;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 32
    const/4 v0, 0x0

    sput-object v0, Lcom/plugin/gcm/PushPlugin;->gCachedExtras:Landroid/os/Bundle;

    .line 33
    const/4 v0, 0x0

    sput-boolean v0, Lcom/plugin/gcm/PushPlugin;->gForeground:Z

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 22
    invoke-direct {p0}, Lorg/apache/cordova/CordovaPlugin;-><init>()V

    return-void
.end method

.method private static convertBundleToJson(Landroid/os/Bundle;)Lorg/json/JSONObject;
    .locals 12
    .param p0, "extras"    # Landroid/os/Bundle;

    .prologue
    .line 160
    :try_start_0
    new-instance v9, Lorg/json/JSONObject;

    invoke-direct {v9}, Lorg/json/JSONObject;-><init>()V

    const-string v10, "event"

    const-string v11, "message"

    invoke-virtual {v9, v10, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v3

    .line 162
    .local v3, "json":Lorg/json/JSONObject;
    new-instance v5, Lorg/json/JSONObject;

    invoke-direct {v5}, Lorg/json/JSONObject;-><init>()V

    .line 163
    .local v5, "jsondata":Lorg/json/JSONObject;
    invoke-virtual {p0}, Landroid/os/Bundle;->keySet()Ljava/util/Set;

    move-result-object v9

    invoke-interface {v9}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .line 164
    .local v2, "it":Ljava/util/Iterator;, "Ljava/util/Iterator<Ljava/lang/String;>;"
    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_9

    .line 166
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    .line 167
    .local v6, "key":Ljava/lang/String;
    invoke-virtual {p0, v6}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v8

    .line 170
    .local v8, "value":Ljava/lang/Object;
    const-string v9, "from"

    invoke-virtual {v6, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_1

    const-string v9, "collapse_key"

    invoke-virtual {v6, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_2

    .line 172
    :cond_1
    invoke-virtual {v3, v6, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 229
    .end local v2    # "it":Ljava/util/Iterator;, "Ljava/util/Iterator<Ljava/lang/String;>;"
    .end local v3    # "json":Lorg/json/JSONObject;
    .end local v5    # "jsondata":Lorg/json/JSONObject;
    .end local v6    # "key":Ljava/lang/String;
    .end local v8    # "value":Ljava/lang/Object;
    :catch_0
    move-exception v1

    .line 231
    .local v1, "e":Lorg/json/JSONException;
    const-string v9, "PushPlugin"

    const-string v10, "extrasToJSON: JSON exception"

    invoke-static {v9, v10}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 233
    const/4 v3, 0x0

    .end local v1    # "e":Lorg/json/JSONException;
    :goto_1
    return-object v3

    .line 174
    .restart local v2    # "it":Ljava/util/Iterator;, "Ljava/util/Iterator<Ljava/lang/String;>;"
    .restart local v3    # "json":Lorg/json/JSONObject;
    .restart local v5    # "jsondata":Lorg/json/JSONObject;
    .restart local v6    # "key":Ljava/lang/String;
    .restart local v8    # "value":Ljava/lang/Object;
    :cond_2
    :try_start_1
    const-string v9, "foreground"

    invoke-virtual {v6, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_3

    .line 176
    const-string v9, "foreground"

    invoke-virtual {p0, v9}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v9

    invoke-virtual {v3, v6, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    goto :goto_0

    .line 178
    :cond_3
    const-string v9, "coldstart"

    invoke-virtual {v6, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_4

    .line 180
    const-string v9, "coldstart"

    invoke-virtual {p0, v9}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v9

    invoke-virtual {v3, v6, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    goto :goto_0

    .line 185
    :cond_4
    const-string v9, "message"

    invoke-virtual {v6, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_5

    const-string v9, "msgcnt"

    invoke-virtual {v6, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_5

    const-string v9, "soundname"

    invoke-virtual {v6, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_6

    .line 187
    :cond_5
    invoke-virtual {v3, v6, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 190
    :cond_6
    instance-of v9, v8, Ljava/lang/String;

    if-eqz v9, :cond_0

    .line 193
    move-object v0, v8

    check-cast v0, Ljava/lang/String;

    move-object v7, v0

    .line 194
    .local v7, "strValue":Ljava/lang/String;
    const-string v9, "{"

    invoke-virtual {v7, v9}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    move-result v9

    if-eqz v9, :cond_7

    .line 196
    :try_start_2
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4, v7}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 197
    .local v4, "json2":Lorg/json/JSONObject;
    invoke-virtual {v5, v6, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_0

    goto/16 :goto_0

    .line 199
    .end local v4    # "json2":Lorg/json/JSONObject;
    :catch_1
    move-exception v1

    .line 200
    .local v1, "e":Ljava/lang/Exception;
    :try_start_3
    invoke-virtual {v5, v6, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto/16 :goto_0

    .line 204
    .end local v1    # "e":Ljava/lang/Exception;
    :cond_7
    const-string v9, "["

    invoke-virtual {v7, v9}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
    :try_end_3
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_0

    move-result v9

    if-eqz v9, :cond_8

    .line 208
    :try_start_4
    new-instance v4, Lorg/json/JSONArray;

    invoke-direct {v4, v7}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 209
    .local v4, "json2":Lorg/json/JSONArray;
    invoke-virtual {v5, v6, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2
    .catch Lorg/json/JSONException; {:try_start_4 .. :try_end_4} :catch_0

    goto/16 :goto_0

    .line 211
    .end local v4    # "json2":Lorg/json/JSONArray;
    :catch_2
    move-exception v1

    .line 213
    .restart local v1    # "e":Ljava/lang/Exception;
    :try_start_5
    invoke-virtual {v5, v6, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto/16 :goto_0

    .line 218
    .end local v1    # "e":Ljava/lang/Exception;
    :cond_8
    invoke-virtual {v5, v6, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto/16 :goto_0

    .line 223
    .end local v6    # "key":Ljava/lang/String;
    .end local v7    # "strValue":Ljava/lang/String;
    .end local v8    # "value":Ljava/lang/Object;
    :cond_9
    const-string v9, "payload"

    invoke-virtual {v3, v9, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 225
    const-string v9, "PushPlugin"

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "extrasToJSON: "

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v3}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-static {v9, v10}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_5
    .catch Lorg/json/JSONException; {:try_start_5 .. :try_end_5} :catch_0

    goto/16 :goto_1
.end method

.method private getApplicationContext()Landroid/content/Context;
    .locals 1

    .prologue
    .line 40
    iget-object v0, p0, Lcom/plugin/gcm/PushPlugin;->cordova:Lorg/apache/cordova/CordovaInterface;

    invoke-interface {v0}, Lorg/apache/cordova/CordovaInterface;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    return-object v0
.end method

.method public static isActive()Z
    .locals 1

    .prologue
    .line 243
    sget-object v0, Lcom/plugin/gcm/PushPlugin;->gWebView:Lorg/apache/cordova/CordovaWebView;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static isInForeground()Z
    .locals 1

    .prologue
    .line 238
    sget-boolean v0, Lcom/plugin/gcm/PushPlugin;->gForeground:Z

    return v0
.end method

.method public static sendExtras(Landroid/os/Bundle;)V
    .locals 2
    .param p0, "extras"    # Landroid/os/Bundle;

    .prologue
    .line 114
    if-eqz p0, :cond_0

    .line 115
    sget-object v0, Lcom/plugin/gcm/PushPlugin;->gECB:Ljava/lang/String;

    if-eqz v0, :cond_1

    sget-object v0, Lcom/plugin/gcm/PushPlugin;->gWebView:Lorg/apache/cordova/CordovaWebView;

    if-eqz v0, :cond_1

    .line 116
    invoke-static {p0}, Lcom/plugin/gcm/PushPlugin;->convertBundleToJson(Landroid/os/Bundle;)Lorg/json/JSONObject;

    move-result-object v0

    invoke-static {v0}, Lcom/plugin/gcm/PushPlugin;->sendJavascript(Lorg/json/JSONObject;)V

    .line 122
    :cond_0
    :goto_0
    return-void

    .line 118
    :cond_1
    const-string v0, "PushPlugin"

    const-string v1, "sendExtras: caching extras to send at a later time."

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 119
    sput-object p0, Lcom/plugin/gcm/PushPlugin;->gCachedExtras:Landroid/os/Bundle;

    goto :goto_0
.end method

.method public static sendJavascript(Lorg/json/JSONObject;)V
    .locals 4
    .param p0, "_json"    # Lorg/json/JSONObject;

    .prologue
    .line 100
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "javascript:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    sget-object v2, Lcom/plugin/gcm/PushPlugin;->gECB:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ")"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 101
    .local v0, "_d":Ljava/lang/String;
    const-string v1, "PushPlugin"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "sendJavascript: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 103
    sget-object v1, Lcom/plugin/gcm/PushPlugin;->gECB:Ljava/lang/String;

    if-eqz v1, :cond_0

    sget-object v1, Lcom/plugin/gcm/PushPlugin;->gWebView:Lorg/apache/cordova/CordovaWebView;

    if-eqz v1, :cond_0

    .line 104
    sget-object v1, Lcom/plugin/gcm/PushPlugin;->gWebView:Lorg/apache/cordova/CordovaWebView;

    invoke-virtual {v1, v0}, Lorg/apache/cordova/CordovaWebView;->sendJavascript(Ljava/lang/String;)V

    .line 106
    :cond_0
    return-void
.end method


# virtual methods
.method public execute(Ljava/lang/String;Lorg/json/JSONArray;Lorg/apache/cordova/CallbackContext;)Z
    .locals 7
    .param p1, "action"    # Ljava/lang/String;
    .param p2, "data"    # Lorg/json/JSONArray;
    .param p3, "callbackContext"    # Lorg/apache/cordova/CallbackContext;

    .prologue
    .line 46
    const/4 v2, 0x0

    .line 48
    .local v2, "result":Z
    const-string v3, "PushPlugin"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "execute: action="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 50
    const-string v3, "register"

    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 52
    const-string v3, "PushPlugin"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "execute: data="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {p2}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 55
    const/4 v3, 0x0

    :try_start_0
    invoke-virtual {p2, v3}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v1

    .line 57
    .local v1, "jo":Lorg/json/JSONObject;
    iget-object v3, p0, Lcom/plugin/gcm/PushPlugin;->webView:Lorg/apache/cordova/CordovaWebView;

    sput-object v3, Lcom/plugin/gcm/PushPlugin;->gWebView:Lorg/apache/cordova/CordovaWebView;

    .line 58
    const-string v3, "PushPlugin"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "execute: jo="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 60
    const-string v3, "ecb"

    invoke-virtual {v1, v3}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    sput-object v3, Lcom/plugin/gcm/PushPlugin;->gECB:Ljava/lang/String;

    .line 61
    const-string v3, "senderID"

    invoke-virtual {v1, v3}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    sput-object v3, Lcom/plugin/gcm/PushPlugin;->gSenderID:Ljava/lang/String;

    .line 63
    const-string v3, "PushPlugin"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "execute: ECB="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    sget-object v5, Lcom/plugin/gcm/PushPlugin;->gECB:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, " senderID="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    sget-object v5, Lcom/plugin/gcm/PushPlugin;->gSenderID:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 65
    invoke-direct {p0}, Lcom/plugin/gcm/PushPlugin;->getApplicationContext()Landroid/content/Context;

    move-result-object v3

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/String;

    const/4 v5, 0x0

    sget-object v6, Lcom/plugin/gcm/PushPlugin;->gSenderID:Ljava/lang/String;

    aput-object v6, v4, v5

    invoke-static {v3, v4}, Lcom/google/android/gcm/GCMRegistrar;->register(Landroid/content/Context;[Ljava/lang/String;)V

    .line 66
    const/4 v2, 0x1

    .line 67
    invoke-virtual {p3}, Lorg/apache/cordova/CallbackContext;->success()V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 74
    .end local v1    # "jo":Lorg/json/JSONObject;
    :goto_0
    sget-object v3, Lcom/plugin/gcm/PushPlugin;->gCachedExtras:Landroid/os/Bundle;

    if-eqz v3, :cond_0

    .line 75
    const-string v3, "PushPlugin"

    const-string v4, "sending cached extras"

    invoke-static {v3, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 76
    sget-object v3, Lcom/plugin/gcm/PushPlugin;->gCachedExtras:Landroid/os/Bundle;

    invoke-static {v3}, Lcom/plugin/gcm/PushPlugin;->sendExtras(Landroid/os/Bundle;)V

    .line 77
    const/4 v3, 0x0

    sput-object v3, Lcom/plugin/gcm/PushPlugin;->gCachedExtras:Landroid/os/Bundle;

    .line 93
    :cond_0
    :goto_1
    return v2

    .line 68
    :catch_0
    move-exception v0

    .line 69
    .local v0, "e":Lorg/json/JSONException;
    const-string v3, "PushPlugin"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "execute: Got JSON Exception "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v0}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 70
    const/4 v2, 0x0

    .line 71
    invoke-virtual {v0}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p3, v3}, Lorg/apache/cordova/CallbackContext;->error(Ljava/lang/String;)V

    goto :goto_0

    .line 80
    .end local v0    # "e":Lorg/json/JSONException;
    :cond_1
    const-string v3, "unregister"

    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 82
    invoke-direct {p0}, Lcom/plugin/gcm/PushPlugin;->getApplicationContext()Landroid/content/Context;

    move-result-object v3

    invoke-static {v3}, Lcom/google/android/gcm/GCMRegistrar;->unregister(Landroid/content/Context;)V

    .line 84
    const-string v3, "PushPlugin"

    const-string v4, "UNREGISTER"

    invoke-static {v3, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 85
    const/4 v2, 0x1

    .line 86
    invoke-virtual {p3}, Lorg/apache/cordova/CallbackContext;->success()V

    goto :goto_1

    .line 88
    :cond_2
    const/4 v2, 0x0

    .line 89
    const-string v3, "PushPlugin"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Invalid action : "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 90
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Invalid action : "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p3, v3}, Lorg/apache/cordova/CallbackContext;->error(Ljava/lang/String;)V

    goto :goto_1
.end method

.method public initialize(Lorg/apache/cordova/CordovaInterface;Lorg/apache/cordova/CordovaWebView;)V
    .locals 1
    .param p1, "cordova"    # Lorg/apache/cordova/CordovaInterface;
    .param p2, "webView"    # Lorg/apache/cordova/CordovaWebView;

    .prologue
    .line 126
    invoke-super {p0, p1, p2}, Lorg/apache/cordova/CordovaPlugin;->initialize(Lorg/apache/cordova/CordovaInterface;Lorg/apache/cordova/CordovaWebView;)V

    .line 127
    const/4 v0, 0x1

    sput-boolean v0, Lcom/plugin/gcm/PushPlugin;->gForeground:Z

    .line 128
    return-void
.end method

.method public onDestroy()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 146
    invoke-super {p0}, Lorg/apache/cordova/CordovaPlugin;->onDestroy()V

    .line 147
    const/4 v0, 0x0

    sput-boolean v0, Lcom/plugin/gcm/PushPlugin;->gForeground:Z

    .line 148
    sput-object v1, Lcom/plugin/gcm/PushPlugin;->gECB:Ljava/lang/String;

    .line 149
    sput-object v1, Lcom/plugin/gcm/PushPlugin;->gWebView:Lorg/apache/cordova/CordovaWebView;

    .line 150
    return-void
.end method

.method public onPause(Z)V
    .locals 3
    .param p1, "multitasking"    # Z

    .prologue
    .line 132
    invoke-super {p0, p1}, Lorg/apache/cordova/CordovaPlugin;->onPause(Z)V

    .line 133
    const/4 v1, 0x0

    sput-boolean v1, Lcom/plugin/gcm/PushPlugin;->gForeground:Z

    .line 134
    iget-object v1, p0, Lcom/plugin/gcm/PushPlugin;->cordova:Lorg/apache/cordova/CordovaInterface;

    invoke-interface {v1}, Lorg/apache/cordova/CordovaInterface;->getActivity()Landroid/app/Activity;

    move-result-object v1

    const-string v2, "notification"

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/NotificationManager;

    .line 135
    .local v0, "notificationManager":Landroid/app/NotificationManager;
    invoke-virtual {v0}, Landroid/app/NotificationManager;->cancelAll()V

    .line 136
    return-void
.end method

.method public onResume(Z)V
    .locals 1
    .param p1, "multitasking"    # Z

    .prologue
    .line 140
    invoke-super {p0, p1}, Lorg/apache/cordova/CordovaPlugin;->onResume(Z)V

    .line 141
    const/4 v0, 0x1

    sput-boolean v0, Lcom/plugin/gcm/PushPlugin;->gForeground:Z

    .line 142
    return-void
.end method
