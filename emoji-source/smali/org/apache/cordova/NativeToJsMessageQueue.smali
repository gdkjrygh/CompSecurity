.class public Lorg/apache/cordova/NativeToJsMessageQueue;
.super Ljava/lang/Object;
.source "NativeToJsMessageQueue.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/apache/cordova/NativeToJsMessageQueue$JsMessage;,
        Lorg/apache/cordova/NativeToJsMessageQueue$PrivateApiBridgeMode;,
        Lorg/apache/cordova/NativeToJsMessageQueue$OnlineEventsBridgeMode;,
        Lorg/apache/cordova/NativeToJsMessageQueue$LoadUrlBridgeMode;,
        Lorg/apache/cordova/NativeToJsMessageQueue$PollingBridgeMode;,
        Lorg/apache/cordova/NativeToJsMessageQueue$BridgeMode;
    }
.end annotation


# static fields
.field static final DISABLE_EXEC_CHAINING:Z = false

.field private static final FORCE_ENCODE_USING_EVAL:Z = false

.field private static final LOG_TAG:Ljava/lang/String; = "JsMessageQueue"

.field private static MAX_PAYLOAD_SIZE:I


# instance fields
.field private activeBridgeMode:Lorg/apache/cordova/NativeToJsMessageQueue$BridgeMode;

.field private final cordova:Lorg/apache/cordova/CordovaInterface;

.field private paused:Z

.field private final queue:Ljava/util/LinkedList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedList",
            "<",
            "Lorg/apache/cordova/NativeToJsMessageQueue$JsMessage;",
            ">;"
        }
    .end annotation
.end field

.field private final registeredListeners:[Lorg/apache/cordova/NativeToJsMessageQueue$BridgeMode;

.field private final webView:Lorg/apache/cordova/CordovaWebView;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 49
    const/high16 v0, 0x1f400000

    sput v0, Lorg/apache/cordova/NativeToJsMessageQueue;->MAX_PAYLOAD_SIZE:I

    return-void
.end method

.method public constructor <init>(Lorg/apache/cordova/CordovaWebView;Lorg/apache/cordova/CordovaInterface;)V
    .locals 4
    .param p1, "webView"    # Lorg/apache/cordova/CordovaWebView;
    .param p2, "cordova"    # Lorg/apache/cordova/CordovaInterface;

    .prologue
    const/4 v3, 0x0

    .line 77
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 60
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lorg/apache/cordova/NativeToJsMessageQueue;->queue:Ljava/util/LinkedList;

    .line 78
    iput-object p2, p0, Lorg/apache/cordova/NativeToJsMessageQueue;->cordova:Lorg/apache/cordova/CordovaInterface;

    .line 79
    iput-object p1, p0, Lorg/apache/cordova/NativeToJsMessageQueue;->webView:Lorg/apache/cordova/CordovaWebView;

    .line 80
    const/4 v0, 0x4

    new-array v0, v0, [Lorg/apache/cordova/NativeToJsMessageQueue$BridgeMode;

    iput-object v0, p0, Lorg/apache/cordova/NativeToJsMessageQueue;->registeredListeners:[Lorg/apache/cordova/NativeToJsMessageQueue$BridgeMode;

    .line 81
    iget-object v0, p0, Lorg/apache/cordova/NativeToJsMessageQueue;->registeredListeners:[Lorg/apache/cordova/NativeToJsMessageQueue$BridgeMode;

    const/4 v1, 0x0

    new-instance v2, Lorg/apache/cordova/NativeToJsMessageQueue$PollingBridgeMode;

    invoke-direct {v2, p0, v3}, Lorg/apache/cordova/NativeToJsMessageQueue$PollingBridgeMode;-><init>(Lorg/apache/cordova/NativeToJsMessageQueue;Lorg/apache/cordova/NativeToJsMessageQueue$1;)V

    aput-object v2, v0, v1

    .line 82
    iget-object v0, p0, Lorg/apache/cordova/NativeToJsMessageQueue;->registeredListeners:[Lorg/apache/cordova/NativeToJsMessageQueue$BridgeMode;

    const/4 v1, 0x1

    new-instance v2, Lorg/apache/cordova/NativeToJsMessageQueue$LoadUrlBridgeMode;

    invoke-direct {v2, p0, v3}, Lorg/apache/cordova/NativeToJsMessageQueue$LoadUrlBridgeMode;-><init>(Lorg/apache/cordova/NativeToJsMessageQueue;Lorg/apache/cordova/NativeToJsMessageQueue$1;)V

    aput-object v2, v0, v1

    .line 83
    iget-object v0, p0, Lorg/apache/cordova/NativeToJsMessageQueue;->registeredListeners:[Lorg/apache/cordova/NativeToJsMessageQueue$BridgeMode;

    const/4 v1, 0x2

    new-instance v2, Lorg/apache/cordova/NativeToJsMessageQueue$OnlineEventsBridgeMode;

    invoke-direct {v2, p0, v3}, Lorg/apache/cordova/NativeToJsMessageQueue$OnlineEventsBridgeMode;-><init>(Lorg/apache/cordova/NativeToJsMessageQueue;Lorg/apache/cordova/NativeToJsMessageQueue$1;)V

    aput-object v2, v0, v1

    .line 84
    iget-object v0, p0, Lorg/apache/cordova/NativeToJsMessageQueue;->registeredListeners:[Lorg/apache/cordova/NativeToJsMessageQueue$BridgeMode;

    const/4 v1, 0x3

    new-instance v2, Lorg/apache/cordova/NativeToJsMessageQueue$PrivateApiBridgeMode;

    invoke-direct {v2, p0, v3}, Lorg/apache/cordova/NativeToJsMessageQueue$PrivateApiBridgeMode;-><init>(Lorg/apache/cordova/NativeToJsMessageQueue;Lorg/apache/cordova/NativeToJsMessageQueue$1;)V

    aput-object v2, v0, v1

    .line 85
    invoke-virtual {p0}, Lorg/apache/cordova/NativeToJsMessageQueue;->reset()V

    .line 86
    return-void
.end method

.method static synthetic access$500(Lorg/apache/cordova/NativeToJsMessageQueue;)Ljava/lang/String;
    .locals 1
    .param p0, "x0"    # Lorg/apache/cordova/NativeToJsMessageQueue;

    .prologue
    .line 35
    invoke-direct {p0}, Lorg/apache/cordova/NativeToJsMessageQueue;->popAndEncodeAsJs()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic access$600(Lorg/apache/cordova/NativeToJsMessageQueue;)Lorg/apache/cordova/CordovaWebView;
    .locals 1
    .param p0, "x0"    # Lorg/apache/cordova/NativeToJsMessageQueue;

    .prologue
    .line 35
    iget-object v0, p0, Lorg/apache/cordova/NativeToJsMessageQueue;->webView:Lorg/apache/cordova/CordovaWebView;

    return-object v0
.end method

.method static synthetic access$700(Lorg/apache/cordova/NativeToJsMessageQueue;)Lorg/apache/cordova/CordovaInterface;
    .locals 1
    .param p0, "x0"    # Lorg/apache/cordova/NativeToJsMessageQueue;

    .prologue
    .line 35
    iget-object v0, p0, Lorg/apache/cordova/NativeToJsMessageQueue;->cordova:Lorg/apache/cordova/CordovaInterface;

    return-object v0
.end method

.method static synthetic access$800(Lorg/apache/cordova/NativeToJsMessageQueue;)Ljava/util/LinkedList;
    .locals 1
    .param p0, "x0"    # Lorg/apache/cordova/NativeToJsMessageQueue;

    .prologue
    .line 35
    iget-object v0, p0, Lorg/apache/cordova/NativeToJsMessageQueue;->queue:Ljava/util/LinkedList;

    return-object v0
.end method

.method private calculatePackedMessageLength(Lorg/apache/cordova/NativeToJsMessageQueue$JsMessage;)I
    .locals 3
    .param p1, "message"    # Lorg/apache/cordova/NativeToJsMessageQueue$JsMessage;

    .prologue
    .line 126
    invoke-virtual {p1}, Lorg/apache/cordova/NativeToJsMessageQueue$JsMessage;->calculateEncodedLength()I

    move-result v0

    .line 127
    .local v0, "messageLen":I
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    .line 128
    .local v1, "messageLenStr":Ljava/lang/String;
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    add-int/2addr v2, v0

    add-int/lit8 v2, v2, 0x1

    return v2
.end method

.method private enqueueMessage(Lorg/apache/cordova/NativeToJsMessageQueue$JsMessage;)V
    .locals 2
    .param p1, "message"    # Lorg/apache/cordova/NativeToJsMessageQueue$JsMessage;

    .prologue
    .line 255
    monitor-enter p0

    .line 256
    :try_start_0
    iget-object v0, p0, Lorg/apache/cordova/NativeToJsMessageQueue;->activeBridgeMode:Lorg/apache/cordova/NativeToJsMessageQueue$BridgeMode;

    if-nez v0, :cond_0

    .line 257
    const-string v0, "JsMessageQueue"

    const-string v1, "Dropping Native->JS message due to disabled bridge"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 258
    monitor-exit p0

    .line 265
    :goto_0
    return-void

    .line 260
    :cond_0
    iget-object v0, p0, Lorg/apache/cordova/NativeToJsMessageQueue;->queue:Ljava/util/LinkedList;

    invoke-virtual {v0, p1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 261
    iget-boolean v0, p0, Lorg/apache/cordova/NativeToJsMessageQueue;->paused:Z

    if-nez v0, :cond_1

    .line 262
    iget-object v0, p0, Lorg/apache/cordova/NativeToJsMessageQueue;->activeBridgeMode:Lorg/apache/cordova/NativeToJsMessageQueue$BridgeMode;

    invoke-virtual {v0}, Lorg/apache/cordova/NativeToJsMessageQueue$BridgeMode;->onNativeToJsMessageAvailable()V

    .line 264
    :cond_1
    monitor-exit p0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method private packMessage(Lorg/apache/cordova/NativeToJsMessageQueue$JsMessage;Ljava/lang/StringBuilder;)V
    .locals 3
    .param p1, "message"    # Lorg/apache/cordova/NativeToJsMessageQueue$JsMessage;
    .param p2, "sb"    # Ljava/lang/StringBuilder;

    .prologue
    .line 132
    invoke-virtual {p1}, Lorg/apache/cordova/NativeToJsMessageQueue$JsMessage;->calculateEncodedLength()I

    move-result v0

    .line 133
    .local v0, "len":I
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const/16 v2, 0x20

    .line 134
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 135
    invoke-virtual {p1, p2}, Lorg/apache/cordova/NativeToJsMessageQueue$JsMessage;->encodeAsMessage(Ljava/lang/StringBuilder;)V

    .line 136
    return-void
.end method

.method private popAndEncodeAsJs()Ljava/lang/String;
    .locals 14

    .prologue
    const/4 v9, 0x1

    const/4 v10, 0x0

    .line 182
    monitor-enter p0

    .line 183
    :try_start_0
    iget-object v11, p0, Lorg/apache/cordova/NativeToJsMessageQueue;->queue:Ljava/util/LinkedList;

    invoke-virtual {v11}, Ljava/util/LinkedList;->size()I

    move-result v1

    .line 184
    .local v1, "length":I
    if-nez v1, :cond_0

    .line 185
    const/4 v5, 0x0

    monitor-exit p0

    .line 218
    :goto_0
    return-object v5

    .line 187
    :cond_0
    const/4 v7, 0x0

    .line 188
    .local v7, "totalPayloadLen":I
    const/4 v4, 0x0

    .line 189
    .local v4, "numMessagesToSend":I
    iget-object v11, p0, Lorg/apache/cordova/NativeToJsMessageQueue;->queue:Ljava/util/LinkedList;

    invoke-virtual {v11}, Ljava/util/LinkedList;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_1
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_1

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lorg/apache/cordova/NativeToJsMessageQueue$JsMessage;

    .line 190
    .local v2, "message":Lorg/apache/cordova/NativeToJsMessageQueue$JsMessage;
    invoke-virtual {v2}, Lorg/apache/cordova/NativeToJsMessageQueue$JsMessage;->calculateEncodedLength()I

    move-result v12

    add-int/lit8 v3, v12, 0x32

    .line 191
    .local v3, "messageSize":I
    if-lez v4, :cond_2

    add-int v12, v7, v3

    sget v13, Lorg/apache/cordova/NativeToJsMessageQueue;->MAX_PAYLOAD_SIZE:I

    if-le v12, v13, :cond_2

    sget v12, Lorg/apache/cordova/NativeToJsMessageQueue;->MAX_PAYLOAD_SIZE:I

    if-lez v12, :cond_2

    .line 197
    .end local v2    # "message":Lorg/apache/cordova/NativeToJsMessageQueue$JsMessage;
    .end local v3    # "messageSize":I
    :cond_1
    iget-object v11, p0, Lorg/apache/cordova/NativeToJsMessageQueue;->queue:Ljava/util/LinkedList;

    invoke-virtual {v11}, Ljava/util/LinkedList;->size()I

    move-result v11

    if-ne v4, v11, :cond_3

    move v8, v9

    .line 198
    .local v8, "willSendAllMessages":Z
    :goto_2
    new-instance v6, Ljava/lang/StringBuilder;

    if-eqz v8, :cond_4

    move v11, v10

    :goto_3
    add-int/2addr v11, v7

    invoke-direct {v6, v11}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 201
    .local v6, "sb":Ljava/lang/StringBuilder;
    const/4 v0, 0x0

    .local v0, "i":I
    :goto_4
    if-ge v0, v4, :cond_6

    .line 202
    iget-object v11, p0, Lorg/apache/cordova/NativeToJsMessageQueue;->queue:Ljava/util/LinkedList;

    invoke-virtual {v11}, Ljava/util/LinkedList;->removeFirst()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lorg/apache/cordova/NativeToJsMessageQueue$JsMessage;

    .line 203
    .restart local v2    # "message":Lorg/apache/cordova/NativeToJsMessageQueue$JsMessage;
    if-eqz v8, :cond_5

    add-int/lit8 v11, v0, 0x1

    if-ne v11, v4, :cond_5

    .line 204
    invoke-virtual {v2, v6}, Lorg/apache/cordova/NativeToJsMessageQueue$JsMessage;->encodeAsJsMessage(Ljava/lang/StringBuilder;)V

    .line 201
    :goto_5
    add-int/lit8 v0, v0, 0x1

    goto :goto_4

    .line 194
    .end local v0    # "i":I
    .end local v6    # "sb":Ljava/lang/StringBuilder;
    .end local v8    # "willSendAllMessages":Z
    .restart local v3    # "messageSize":I
    :cond_2
    add-int/2addr v7, v3

    .line 195
    add-int/lit8 v4, v4, 0x1

    .line 196
    goto :goto_1

    .end local v2    # "message":Lorg/apache/cordova/NativeToJsMessageQueue$JsMessage;
    .end local v3    # "messageSize":I
    :cond_3
    move v8, v10

    .line 197
    goto :goto_2

    .line 198
    .restart local v8    # "willSendAllMessages":Z
    :cond_4
    const/16 v11, 0x64

    goto :goto_3

    .line 206
    .restart local v0    # "i":I
    .restart local v2    # "message":Lorg/apache/cordova/NativeToJsMessageQueue$JsMessage;
    .restart local v6    # "sb":Ljava/lang/StringBuilder;
    :cond_5
    const-string v11, "try{"

    invoke-virtual {v6, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 207
    invoke-virtual {v2, v6}, Lorg/apache/cordova/NativeToJsMessageQueue$JsMessage;->encodeAsJsMessage(Ljava/lang/StringBuilder;)V

    .line 208
    const-string v11, "}finally{"

    invoke-virtual {v6, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_5

    .line 219
    .end local v0    # "i":I
    .end local v1    # "length":I
    .end local v2    # "message":Lorg/apache/cordova/NativeToJsMessageQueue$JsMessage;
    .end local v4    # "numMessagesToSend":I
    .end local v6    # "sb":Ljava/lang/StringBuilder;
    .end local v7    # "totalPayloadLen":I
    .end local v8    # "willSendAllMessages":Z
    :catchall_0
    move-exception v9

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v9

    .line 211
    .restart local v0    # "i":I
    .restart local v1    # "length":I
    .restart local v4    # "numMessagesToSend":I
    .restart local v6    # "sb":Ljava/lang/StringBuilder;
    .restart local v7    # "totalPayloadLen":I
    .restart local v8    # "willSendAllMessages":Z
    :cond_6
    if-nez v8, :cond_7

    .line 212
    :try_start_1
    const-string v11, "window.setTimeout(function(){cordova.require(\'cordova/plugin/android/polling\').pollOnce();},0);"

    invoke-virtual {v6, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 214
    :cond_7
    if-eqz v8, :cond_8

    move v0, v9

    :goto_6
    if-ge v0, v4, :cond_9

    .line 215
    const/16 v9, 0x7d

    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 214
    add-int/lit8 v0, v0, 0x1

    goto :goto_6

    :cond_8
    move v0, v10

    goto :goto_6

    .line 217
    :cond_9
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 218
    .local v5, "ret":Ljava/lang/String;
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto/16 :goto_0
.end method


# virtual methods
.method public addJavaScript(Ljava/lang/String;)V
    .locals 1
    .param p1, "statement"    # Ljava/lang/String;

    .prologue
    .line 226
    new-instance v0, Lorg/apache/cordova/NativeToJsMessageQueue$JsMessage;

    invoke-direct {v0, p1}, Lorg/apache/cordova/NativeToJsMessageQueue$JsMessage;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v0}, Lorg/apache/cordova/NativeToJsMessageQueue;->enqueueMessage(Lorg/apache/cordova/NativeToJsMessageQueue$JsMessage;)V

    .line 227
    return-void
.end method

.method public addPluginResult(Lorg/apache/cordova/PluginResult;Ljava/lang/String;)V
    .locals 6
    .param p1, "result"    # Lorg/apache/cordova/PluginResult;
    .param p2, "callbackId"    # Ljava/lang/String;

    .prologue
    .line 233
    if-nez p2, :cond_1

    .line 234
    const-string v3, "JsMessageQueue"

    const-string v4, "Got plugin result with no callbackId"

    new-instance v5, Ljava/lang/Throwable;

    invoke-direct {v5}, Ljava/lang/Throwable;-><init>()V

    invoke-static {v3, v4, v5}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 252
    :cond_0
    :goto_0
    return-void

    .line 239
    :cond_1
    invoke-virtual {p1}, Lorg/apache/cordova/PluginResult;->getStatus()I

    move-result v3

    sget-object v4, Lorg/apache/cordova/PluginResult$Status;->NO_RESULT:Lorg/apache/cordova/PluginResult$Status;

    invoke-virtual {v4}, Lorg/apache/cordova/PluginResult$Status;->ordinal()I

    move-result v4

    if-ne v3, v4, :cond_3

    const/4 v2, 0x1

    .line 240
    .local v2, "noResult":Z
    :goto_1
    invoke-virtual {p1}, Lorg/apache/cordova/PluginResult;->getKeepCallback()Z

    move-result v0

    .line 241
    .local v0, "keepCallback":Z
    if-eqz v2, :cond_2

    if-nez v0, :cond_0

    .line 244
    :cond_2
    new-instance v1, Lorg/apache/cordova/NativeToJsMessageQueue$JsMessage;

    invoke-direct {v1, p1, p2}, Lorg/apache/cordova/NativeToJsMessageQueue$JsMessage;-><init>(Lorg/apache/cordova/PluginResult;Ljava/lang/String;)V

    .line 251
    .local v1, "message":Lorg/apache/cordova/NativeToJsMessageQueue$JsMessage;
    invoke-direct {p0, v1}, Lorg/apache/cordova/NativeToJsMessageQueue;->enqueueMessage(Lorg/apache/cordova/NativeToJsMessageQueue$JsMessage;)V

    goto :goto_0

    .line 239
    .end local v0    # "keepCallback":Z
    .end local v1    # "message":Lorg/apache/cordova/NativeToJsMessageQueue$JsMessage;
    .end local v2    # "noResult":Z
    :cond_3
    const/4 v2, 0x0

    goto :goto_1
.end method

.method public isBridgeEnabled()Z
    .locals 1

    .prologue
    .line 89
    iget-object v0, p0, Lorg/apache/cordova/NativeToJsMessageQueue;->activeBridgeMode:Lorg/apache/cordova/NativeToJsMessageQueue$BridgeMode;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public popAndEncode(Z)Ljava/lang/String;
    .locals 10
    .param p1, "fromOnlineEvent"    # Z

    .prologue
    const/4 v4, 0x0

    .line 144
    monitor-enter p0

    .line 145
    :try_start_0
    iget-object v7, p0, Lorg/apache/cordova/NativeToJsMessageQueue;->activeBridgeMode:Lorg/apache/cordova/NativeToJsMessageQueue$BridgeMode;

    if-nez v7, :cond_0

    .line 146
    monitor-exit p0

    .line 174
    :goto_0
    return-object v4

    .line 148
    :cond_0
    iget-object v7, p0, Lorg/apache/cordova/NativeToJsMessageQueue;->activeBridgeMode:Lorg/apache/cordova/NativeToJsMessageQueue$BridgeMode;

    invoke-virtual {v7, p1}, Lorg/apache/cordova/NativeToJsMessageQueue$BridgeMode;->notifyOfFlush(Z)V

    .line 149
    iget-object v7, p0, Lorg/apache/cordova/NativeToJsMessageQueue;->queue:Ljava/util/LinkedList;

    invoke-virtual {v7}, Ljava/util/LinkedList;->isEmpty()Z

    move-result v7

    if-eqz v7, :cond_1

    .line 150
    monitor-exit p0

    goto :goto_0

    .line 175
    :catchall_0
    move-exception v7

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v7

    .line 152
    :cond_1
    const/4 v6, 0x0

    .line 153
    .local v6, "totalPayloadLen":I
    const/4 v3, 0x0

    .line 154
    .local v3, "numMessagesToSend":I
    :try_start_1
    iget-object v7, p0, Lorg/apache/cordova/NativeToJsMessageQueue;->queue:Ljava/util/LinkedList;

    invoke-virtual {v7}, Ljava/util/LinkedList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_2

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/apache/cordova/NativeToJsMessageQueue$JsMessage;

    .line 155
    .local v1, "message":Lorg/apache/cordova/NativeToJsMessageQueue$JsMessage;
    invoke-direct {p0, v1}, Lorg/apache/cordova/NativeToJsMessageQueue;->calculatePackedMessageLength(Lorg/apache/cordova/NativeToJsMessageQueue$JsMessage;)I

    move-result v2

    .line 156
    .local v2, "messageSize":I
    if-lez v3, :cond_3

    add-int v8, v6, v2

    sget v9, Lorg/apache/cordova/NativeToJsMessageQueue;->MAX_PAYLOAD_SIZE:I

    if-le v8, v9, :cond_3

    sget v8, Lorg/apache/cordova/NativeToJsMessageQueue;->MAX_PAYLOAD_SIZE:I

    if-lez v8, :cond_3

    .line 163
    .end local v1    # "message":Lorg/apache/cordova/NativeToJsMessageQueue$JsMessage;
    .end local v2    # "messageSize":I
    :cond_2
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 164
    .local v5, "sb":Ljava/lang/StringBuilder;
    const/4 v0, 0x0

    .local v0, "i":I
    :goto_2
    if-ge v0, v3, :cond_4

    .line 165
    iget-object v7, p0, Lorg/apache/cordova/NativeToJsMessageQueue;->queue:Ljava/util/LinkedList;

    invoke-virtual {v7}, Ljava/util/LinkedList;->removeFirst()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/apache/cordova/NativeToJsMessageQueue$JsMessage;

    .line 166
    .restart local v1    # "message":Lorg/apache/cordova/NativeToJsMessageQueue$JsMessage;
    invoke-direct {p0, v1, v5}, Lorg/apache/cordova/NativeToJsMessageQueue;->packMessage(Lorg/apache/cordova/NativeToJsMessageQueue$JsMessage;Ljava/lang/StringBuilder;)V

    .line 164
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    .line 159
    .end local v0    # "i":I
    .end local v5    # "sb":Ljava/lang/StringBuilder;
    .restart local v2    # "messageSize":I
    :cond_3
    add-int/2addr v6, v2

    .line 160
    add-int/lit8 v3, v3, 0x1

    .line 161
    goto :goto_1

    .line 169
    .end local v1    # "message":Lorg/apache/cordova/NativeToJsMessageQueue$JsMessage;
    .end local v2    # "messageSize":I
    .restart local v0    # "i":I
    .restart local v5    # "sb":Ljava/lang/StringBuilder;
    :cond_4
    iget-object v7, p0, Lorg/apache/cordova/NativeToJsMessageQueue;->queue:Ljava/util/LinkedList;

    invoke-virtual {v7}, Ljava/util/LinkedList;->isEmpty()Z

    move-result v7

    if-nez v7, :cond_5

    .line 171
    const/16 v7, 0x2a

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 173
    :cond_5
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 174
    .local v4, "ret":Ljava/lang/String;
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0
.end method

.method public reset()V
    .locals 1

    .prologue
    .line 119
    monitor-enter p0

    .line 120
    :try_start_0
    iget-object v0, p0, Lorg/apache/cordova/NativeToJsMessageQueue;->queue:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->clear()V

    .line 121
    const/4 v0, -0x1

    invoke-virtual {p0, v0}, Lorg/apache/cordova/NativeToJsMessageQueue;->setBridgeMode(I)V

    .line 122
    monitor-exit p0

    .line 123
    return-void

    .line 122
    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public setBridgeMode(I)V
    .locals 4
    .param p1, "value"    # I

    .prologue
    .line 96
    const/4 v1, -0x1

    if-lt p1, v1, :cond_0

    iget-object v1, p0, Lorg/apache/cordova/NativeToJsMessageQueue;->registeredListeners:[Lorg/apache/cordova/NativeToJsMessageQueue$BridgeMode;

    array-length v1, v1

    if-lt p1, v1, :cond_2

    .line 97
    :cond_0
    const-string v1, "JsMessageQueue"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Invalid NativeToJsBridgeMode: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 113
    :cond_1
    :goto_0
    return-void

    .line 99
    :cond_2
    if-gez p1, :cond_4

    const/4 v0, 0x0

    .line 100
    .local v0, "newMode":Lorg/apache/cordova/NativeToJsMessageQueue$BridgeMode;
    :goto_1
    iget-object v1, p0, Lorg/apache/cordova/NativeToJsMessageQueue;->activeBridgeMode:Lorg/apache/cordova/NativeToJsMessageQueue$BridgeMode;

    if-eq v0, v1, :cond_1

    .line 101
    const-string v2, "JsMessageQueue"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Set native->JS mode to "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    if-nez v0, :cond_5

    const-string v1, "null"

    :goto_2
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 102
    monitor-enter p0

    .line 103
    :try_start_0
    iput-object v0, p0, Lorg/apache/cordova/NativeToJsMessageQueue;->activeBridgeMode:Lorg/apache/cordova/NativeToJsMessageQueue$BridgeMode;

    .line 104
    if-eqz v0, :cond_3

    .line 105
    invoke-virtual {v0}, Lorg/apache/cordova/NativeToJsMessageQueue$BridgeMode;->reset()V

    .line 106
    iget-boolean v1, p0, Lorg/apache/cordova/NativeToJsMessageQueue;->paused:Z

    if-nez v1, :cond_3

    iget-object v1, p0, Lorg/apache/cordova/NativeToJsMessageQueue;->queue:Ljava/util/LinkedList;

    invoke-virtual {v1}, Ljava/util/LinkedList;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_3

    .line 107
    invoke-virtual {v0}, Lorg/apache/cordova/NativeToJsMessageQueue$BridgeMode;->onNativeToJsMessageAvailable()V

    .line 110
    :cond_3
    monitor-exit p0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    .line 99
    .end local v0    # "newMode":Lorg/apache/cordova/NativeToJsMessageQueue$BridgeMode;
    :cond_4
    iget-object v1, p0, Lorg/apache/cordova/NativeToJsMessageQueue;->registeredListeners:[Lorg/apache/cordova/NativeToJsMessageQueue$BridgeMode;

    aget-object v0, v1, p1

    goto :goto_1

    .line 101
    .restart local v0    # "newMode":Lorg/apache/cordova/NativeToJsMessageQueue$BridgeMode;
    :cond_5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    goto :goto_2
.end method

.method public setPaused(Z)V
    .locals 3
    .param p1, "value"    # Z

    .prologue
    .line 268
    iget-boolean v0, p0, Lorg/apache/cordova/NativeToJsMessageQueue;->paused:Z

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    .line 271
    const-string v0, "JsMessageQueue"

    const-string v1, "nested call to setPaused detected."

    new-instance v2, Ljava/lang/Throwable;

    invoke-direct {v2}, Ljava/lang/Throwable;-><init>()V

    invoke-static {v0, v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 273
    :cond_0
    iput-boolean p1, p0, Lorg/apache/cordova/NativeToJsMessageQueue;->paused:Z

    .line 274
    if-nez p1, :cond_2

    .line 275
    monitor-enter p0

    .line 276
    :try_start_0
    iget-object v0, p0, Lorg/apache/cordova/NativeToJsMessageQueue;->queue:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lorg/apache/cordova/NativeToJsMessageQueue;->activeBridgeMode:Lorg/apache/cordova/NativeToJsMessageQueue$BridgeMode;

    if-eqz v0, :cond_1

    .line 277
    iget-object v0, p0, Lorg/apache/cordova/NativeToJsMessageQueue;->activeBridgeMode:Lorg/apache/cordova/NativeToJsMessageQueue$BridgeMode;

    invoke-virtual {v0}, Lorg/apache/cordova/NativeToJsMessageQueue$BridgeMode;->onNativeToJsMessageAvailable()V

    .line 279
    :cond_1
    monitor-exit p0

    .line 281
    :cond_2
    return-void

    .line 279
    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
