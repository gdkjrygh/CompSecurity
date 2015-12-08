.class public Lorg/apache/cordova/CordovaBridge;
.super Ljava/lang/Object;
.source "CordovaBridge.java"


# static fields
.field private static final LOG_TAG:Ljava/lang/String; = "CordovaBridge"


# instance fields
.field private volatile expectedBridgeSecret:I

.field private jsMessageQueue:Lorg/apache/cordova/NativeToJsMessageQueue;

.field private loadedUrl:Ljava/lang/String;

.field private pluginManager:Lorg/apache/cordova/PluginManager;


# direct methods
.method public constructor <init>(Lorg/apache/cordova/PluginManager;Lorg/apache/cordova/NativeToJsMessageQueue;)V
    .locals 1
    .param p1, "pluginManager"    # Lorg/apache/cordova/PluginManager;
    .param p2, "jsMessageQueue"    # Lorg/apache/cordova/NativeToJsMessageQueue;

    .prologue
    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    const/4 v0, -0x1

    iput v0, p0, Lorg/apache/cordova/CordovaBridge;->expectedBridgeSecret:I

    .line 41
    iput-object p1, p0, Lorg/apache/cordova/CordovaBridge;->pluginManager:Lorg/apache/cordova/PluginManager;

    .line 42
    iput-object p2, p0, Lorg/apache/cordova/CordovaBridge;->jsMessageQueue:Lorg/apache/cordova/NativeToJsMessageQueue;

    .line 43
    return-void
.end method

.method private verifySecret(Ljava/lang/String;I)Z
    .locals 3
    .param p1, "action"    # Ljava/lang/String;
    .param p2, "bridgeSecret"    # I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalAccessException;
        }
    .end annotation

    .prologue
    .line 93
    iget-object v0, p0, Lorg/apache/cordova/CordovaBridge;->jsMessageQueue:Lorg/apache/cordova/NativeToJsMessageQueue;

    invoke-virtual {v0}, Lorg/apache/cordova/NativeToJsMessageQueue;->isBridgeEnabled()Z

    move-result v0

    if-nez v0, :cond_1

    .line 94
    const/4 v0, -0x1

    if-ne p2, v0, :cond_0

    .line 95
    const-string v0, "CordovaBridge"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " call made before bridge was enabled."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 99
    :goto_0
    const/4 v0, 0x0

    .line 105
    :goto_1
    return v0

    .line 97
    :cond_0
    const-string v0, "CordovaBridge"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Ignoring "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " from previous page load."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 102
    :cond_1
    iget v0, p0, Lorg/apache/cordova/CordovaBridge;->expectedBridgeSecret:I

    if-ltz v0, :cond_2

    iget v0, p0, Lorg/apache/cordova/CordovaBridge;->expectedBridgeSecret:I

    if-eq p2, v0, :cond_3

    .line 103
    :cond_2
    new-instance v0, Ljava/lang/IllegalAccessException;

    invoke-direct {v0}, Ljava/lang/IllegalAccessException;-><init>()V

    throw v0

    .line 105
    :cond_3
    const/4 v0, 0x1

    goto :goto_1
.end method


# virtual methods
.method clearBridgeSecret()V
    .locals 1

    .prologue
    .line 110
    const/4 v0, -0x1

    iput v0, p0, Lorg/apache/cordova/CordovaBridge;->expectedBridgeSecret:I

    .line 111
    return-void
.end method

.method generateBridgeSecret()I
    .locals 4

    .prologue
    .line 115
    invoke-static {}, Ljava/lang/Math;->random()D

    move-result-wide v0

    const-wide v2, 0x41dfffffffc00000L    # 2.147483647E9

    mul-double/2addr v0, v2

    double-to-int v0, v0

    iput v0, p0, Lorg/apache/cordova/CordovaBridge;->expectedBridgeSecret:I

    .line 116
    iget v0, p0, Lorg/apache/cordova/CordovaBridge;->expectedBridgeSecret:I

    return v0
.end method

.method public getMessageQueue()Lorg/apache/cordova/NativeToJsMessageQueue;
    .locals 1

    .prologue
    .line 186
    iget-object v0, p0, Lorg/apache/cordova/CordovaBridge;->jsMessageQueue:Lorg/apache/cordova/NativeToJsMessageQueue;

    return-object v0
.end method

.method public jsExec(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 5
    .param p1, "bridgeSecret"    # I
    .param p2, "service"    # Ljava/lang/String;
    .param p3, "action"    # Ljava/lang/String;
    .param p4, "callbackId"    # Ljava/lang/String;
    .param p5, "arguments"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;,
            Ljava/lang/IllegalAccessException;
        }
    .end annotation

    .prologue
    const/4 v4, 0x0

    .line 46
    const-string v2, "exec()"

    invoke-direct {p0, v2, p1}, Lorg/apache/cordova/CordovaBridge;->verifySecret(Ljava/lang/String;I)Z

    move-result v2

    if-nez v2, :cond_0

    .line 47
    const/4 v1, 0x0

    .line 74
    :goto_0
    return-object v1

    .line 51
    :cond_0
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v2

    if-nez v2, :cond_1

    .line 52
    invoke-static {}, Landroid/os/Looper;->prepare()V

    .line 55
    :cond_1
    if-nez p5, :cond_2

    .line 56
    const-string v1, "@Null arguments."

    goto :goto_0

    .line 59
    :cond_2
    iget-object v2, p0, Lorg/apache/cordova/CordovaBridge;->jsMessageQueue:Lorg/apache/cordova/NativeToJsMessageQueue;

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Lorg/apache/cordova/NativeToJsMessageQueue;->setPaused(Z)V

    .line 62
    :try_start_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v2

    sput-object v2, Lorg/apache/cordova/CordovaResourceApi;->jsThread:Ljava/lang/Thread;

    .line 64
    iget-object v2, p0, Lorg/apache/cordova/CordovaBridge;->pluginManager:Lorg/apache/cordova/PluginManager;

    invoke-virtual {v2, p2, p3, p4, p5}, Lorg/apache/cordova/PluginManager;->exec(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 65
    const/4 v1, 0x0

    .line 67
    .local v1, "ret":Ljava/lang/String;
    iget-object v2, p0, Lorg/apache/cordova/CordovaBridge;->jsMessageQueue:Lorg/apache/cordova/NativeToJsMessageQueue;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Lorg/apache/cordova/NativeToJsMessageQueue;->popAndEncode(Z)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v1

    .line 74
    iget-object v2, p0, Lorg/apache/cordova/CordovaBridge;->jsMessageQueue:Lorg/apache/cordova/NativeToJsMessageQueue;

    invoke-virtual {v2, v4}, Lorg/apache/cordova/NativeToJsMessageQueue;->setPaused(Z)V

    goto :goto_0

    .line 70
    .end local v1    # "ret":Ljava/lang/String;
    :catch_0
    move-exception v0

    .line 71
    .local v0, "e":Ljava/lang/Throwable;
    :try_start_1
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 72
    const-string v1, ""
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 74
    iget-object v2, p0, Lorg/apache/cordova/CordovaBridge;->jsMessageQueue:Lorg/apache/cordova/NativeToJsMessageQueue;

    invoke-virtual {v2, v4}, Lorg/apache/cordova/NativeToJsMessageQueue;->setPaused(Z)V

    goto :goto_0

    .end local v0    # "e":Ljava/lang/Throwable;
    :catchall_0
    move-exception v2

    iget-object v3, p0, Lorg/apache/cordova/CordovaBridge;->jsMessageQueue:Lorg/apache/cordova/NativeToJsMessageQueue;

    invoke-virtual {v3, v4}, Lorg/apache/cordova/NativeToJsMessageQueue;->setPaused(Z)V

    throw v2
.end method

.method public jsRetrieveJsMessages(IZ)Ljava/lang/String;
    .locals 1
    .param p1, "bridgeSecret"    # I
    .param p2, "fromOnlineEvent"    # Z
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalAccessException;
        }
    .end annotation

    .prologue
    .line 86
    const-string v0, "retrieveJsMessages()"

    invoke-direct {p0, v0, p1}, Lorg/apache/cordova/CordovaBridge;->verifySecret(Ljava/lang/String;I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 87
    const/4 v0, 0x0

    .line 89
    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lorg/apache/cordova/CordovaBridge;->jsMessageQueue:Lorg/apache/cordova/NativeToJsMessageQueue;

    invoke-virtual {v0, p2}, Lorg/apache/cordova/NativeToJsMessageQueue;->popAndEncode(Z)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public jsSetNativeToJsBridgeMode(II)V
    .locals 1
    .param p1, "bridgeSecret"    # I
    .param p2, "value"    # I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalAccessException;
        }
    .end annotation

    .prologue
    .line 79
    const-string v0, "setNativeToJsBridgeMode()"

    invoke-direct {p0, v0, p1}, Lorg/apache/cordova/CordovaBridge;->verifySecret(Ljava/lang/String;I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 83
    :goto_0
    return-void

    .line 82
    :cond_0
    iget-object v0, p0, Lorg/apache/cordova/CordovaBridge;->jsMessageQueue:Lorg/apache/cordova/NativeToJsMessageQueue;

    invoke-virtual {v0, p2}, Lorg/apache/cordova/NativeToJsMessageQueue;->setBridgeMode(I)V

    goto :goto_0
.end method

.method public promptOnJsPrompt(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 12
    .param p1, "origin"    # Ljava/lang/String;
    .param p2, "message"    # Ljava/lang/String;
    .param p3, "defaultValue"    # Ljava/lang/String;

    .prologue
    const/16 v11, 0x9

    const/4 v5, 0x3

    .line 126
    if-eqz p3, :cond_1

    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result v0

    if-le v0, v5, :cond_1

    const-string v0, "gap:"

    invoke-virtual {p3, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 129
    :try_start_0
    new-instance v6, Lorg/json/JSONArray;

    const/4 v0, 0x4

    invoke-virtual {p3, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v6, v0}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 130
    .local v6, "array":Lorg/json/JSONArray;
    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Lorg/json/JSONArray;->getInt(I)I

    move-result v1

    .line 131
    .local v1, "bridgeSecret":I
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 132
    .local v2, "service":Ljava/lang/String;
    const/4 v0, 0x2

    invoke-virtual {v6, v0}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v3

    .line 133
    .local v3, "action":Ljava/lang/String;
    const/4 v0, 0x3

    invoke-virtual {v6, v0}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v4

    .local v4, "callbackId":Ljava/lang/String;
    move-object v0, p0

    move-object v5, p2

    .line 134
    invoke-virtual/range {v0 .. v5}, Lorg/apache/cordova/CordovaBridge;->jsExec(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 135
    .local v9, "r":Ljava/lang/String;
    if-nez v9, :cond_0

    const-string v9, ""
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1

    .line 182
    .end local v1    # "bridgeSecret":I
    .end local v2    # "service":Ljava/lang/String;
    .end local v3    # "action":Ljava/lang/String;
    .end local v4    # "callbackId":Ljava/lang/String;
    .end local v6    # "array":Lorg/json/JSONArray;
    .end local v9    # "r":Ljava/lang/String;
    :cond_0
    :goto_0
    return-object v9

    .line 136
    :catch_0
    move-exception v8

    .line 137
    .local v8, "e":Lorg/json/JSONException;
    invoke-virtual {v8}, Lorg/json/JSONException;->printStackTrace()V

    .line 141
    .end local v8    # "e":Lorg/json/JSONException;
    :goto_1
    const-string v9, ""

    goto :goto_0

    .line 138
    :catch_1
    move-exception v8

    .line 139
    .local v8, "e":Ljava/lang/IllegalAccessException;
    invoke-virtual {v8}, Ljava/lang/IllegalAccessException;->printStackTrace()V

    goto :goto_1

    .line 144
    .end local v8    # "e":Ljava/lang/IllegalAccessException;
    :cond_1
    if-eqz p3, :cond_2

    const-string v0, "gap_bridge_mode:"

    invoke-virtual {p3, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 146
    const/16 v0, 0x10

    :try_start_1
    invoke-virtual {p3, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    .line 147
    .restart local v1    # "bridgeSecret":I
    invoke-static {p2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v1, v0}, Lorg/apache/cordova/CordovaBridge;->jsSetNativeToJsBridgeMode(II)V
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_3

    .line 153
    .end local v1    # "bridgeSecret":I
    :goto_2
    const-string v9, ""

    goto :goto_0

    .line 148
    :catch_2
    move-exception v8

    .line 149
    .local v8, "e":Ljava/lang/NumberFormatException;
    invoke-virtual {v8}, Ljava/lang/NumberFormatException;->printStackTrace()V

    goto :goto_2

    .line 150
    .end local v8    # "e":Ljava/lang/NumberFormatException;
    :catch_3
    move-exception v8

    .line 151
    .local v8, "e":Ljava/lang/IllegalAccessException;
    invoke-virtual {v8}, Ljava/lang/IllegalAccessException;->printStackTrace()V

    goto :goto_2

    .line 156
    .end local v8    # "e":Ljava/lang/IllegalAccessException;
    :cond_2
    if-eqz p3, :cond_3

    const-string v0, "gap_poll:"

    invoke-virtual {p3, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 157
    invoke-virtual {p3, v11}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    .line 159
    .restart local v1    # "bridgeSecret":I
    :try_start_2
    const-string v0, "1"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {p0, v1, v0}, Lorg/apache/cordova/CordovaBridge;->jsRetrieveJsMessages(IZ)Ljava/lang/String;

    move-result-object v9

    .line 160
    .restart local v9    # "r":Ljava/lang/String;
    if-nez v9, :cond_0

    const-string v9, ""
    :try_end_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_2 .. :try_end_2} :catch_4

    goto :goto_0

    .line 161
    .end local v9    # "r":Ljava/lang/String;
    :catch_4
    move-exception v8

    .line 162
    .restart local v8    # "e":Ljava/lang/IllegalAccessException;
    invoke-virtual {v8}, Ljava/lang/IllegalAccessException;->printStackTrace()V

    .line 164
    const-string v9, ""

    goto :goto_0

    .line 166
    .end local v1    # "bridgeSecret":I
    .end local v8    # "e":Ljava/lang/IllegalAccessException;
    :cond_3
    if-eqz p3, :cond_6

    const-string v0, "gap_init:"

    invoke-virtual {p3, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 170
    const-string v0, "file:"

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_4

    const-string v0, "http"

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, p0, Lorg/apache/cordova/CordovaBridge;->loadedUrl:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 172
    :cond_4
    invoke-virtual {p3, v11}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v7

    .line 173
    .local v7, "bridgeMode":I
    iget-object v0, p0, Lorg/apache/cordova/CordovaBridge;->jsMessageQueue:Lorg/apache/cordova/NativeToJsMessageQueue;

    invoke-virtual {v0, v7}, Lorg/apache/cordova/NativeToJsMessageQueue;->setBridgeMode(I)V

    .line 175
    invoke-virtual {p0}, Lorg/apache/cordova/CordovaBridge;->generateBridgeSecret()I

    move-result v10

    .line 176
    .local v10, "secret":I
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, ""

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    goto/16 :goto_0

    .line 178
    .end local v7    # "bridgeMode":I
    .end local v10    # "secret":I
    :cond_5
    const-string v0, "CordovaBridge"

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "gap_init called from restricted origin: "

    invoke-virtual {v5, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v0, v5}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 180
    const-string v9, ""

    goto/16 :goto_0

    .line 182
    :cond_6
    const/4 v9, 0x0

    goto/16 :goto_0
.end method

.method public reset(Ljava/lang/String;)V
    .locals 1
    .param p1, "loadedUrl"    # Ljava/lang/String;

    .prologue
    .line 120
    iget-object v0, p0, Lorg/apache/cordova/CordovaBridge;->jsMessageQueue:Lorg/apache/cordova/NativeToJsMessageQueue;

    invoke-virtual {v0}, Lorg/apache/cordova/NativeToJsMessageQueue;->reset()V

    .line 121
    invoke-virtual {p0}, Lorg/apache/cordova/CordovaBridge;->clearBridgeSecret()V

    .line 122
    iput-object p1, p0, Lorg/apache/cordova/CordovaBridge;->loadedUrl:Ljava/lang/String;

    .line 123
    return-void
.end method
