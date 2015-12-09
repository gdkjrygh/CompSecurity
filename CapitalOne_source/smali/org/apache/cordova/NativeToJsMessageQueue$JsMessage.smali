.class Lorg/apache/cordova/NativeToJsMessageQueue$JsMessage;
.super Ljava/lang/Object;
.source "NativeToJsMessageQueue.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/apache/cordova/NativeToJsMessageQueue;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "JsMessage"
.end annotation


# instance fields
.field final jsPayloadOrCallbackId:Ljava/lang/String;

.field final pluginResult:Lorg/apache/cordova/api/PluginResult;


# direct methods
.method constructor <init>(Ljava/lang/String;)V
    .locals 1
    .param p1, "js"    # Ljava/lang/String;

    .prologue
    .line 377
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 378
    if-nez p1, :cond_0

    .line 379
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 381
    :cond_0
    iput-object p1, p0, Lorg/apache/cordova/NativeToJsMessageQueue$JsMessage;->jsPayloadOrCallbackId:Ljava/lang/String;

    .line 382
    const/4 v0, 0x0

    iput-object v0, p0, Lorg/apache/cordova/NativeToJsMessageQueue$JsMessage;->pluginResult:Lorg/apache/cordova/api/PluginResult;

    .line 383
    return-void
.end method

.method constructor <init>(Lorg/apache/cordova/api/PluginResult;Ljava/lang/String;)V
    .locals 1
    .param p1, "pluginResult"    # Lorg/apache/cordova/api/PluginResult;
    .param p2, "callbackId"    # Ljava/lang/String;

    .prologue
    .line 384
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 385
    if-eqz p2, :cond_0

    if-nez p1, :cond_1

    .line 386
    :cond_0
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 388
    :cond_1
    iput-object p2, p0, Lorg/apache/cordova/NativeToJsMessageQueue$JsMessage;->jsPayloadOrCallbackId:Ljava/lang/String;

    .line 389
    iput-object p1, p0, Lorg/apache/cordova/NativeToJsMessageQueue$JsMessage;->pluginResult:Lorg/apache/cordova/api/PluginResult;

    .line 390
    return-void
.end method


# virtual methods
.method calculateEncodedLength()I
    .locals 4

    .prologue
    .line 393
    iget-object v2, p0, Lorg/apache/cordova/NativeToJsMessageQueue$JsMessage;->pluginResult:Lorg/apache/cordova/api/PluginResult;

    if-nez v2, :cond_0

    .line 394
    iget-object v2, p0, Lorg/apache/cordova/NativeToJsMessageQueue$JsMessage;->jsPayloadOrCallbackId:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    add-int/lit8 v0, v2, 0x1

    .line 413
    :goto_0
    return v0

    .line 396
    :cond_0
    iget-object v2, p0, Lorg/apache/cordova/NativeToJsMessageQueue$JsMessage;->pluginResult:Lorg/apache/cordova/api/PluginResult;

    invoke-virtual {v2}, Lorg/apache/cordova/api/PluginResult;->getStatus()I

    move-result v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v1

    .line 397
    .local v1, "statusLen":I
    add-int/lit8 v2, v1, 0x2

    add-int/lit8 v2, v2, 0x1

    iget-object v3, p0, Lorg/apache/cordova/NativeToJsMessageQueue$JsMessage;->jsPayloadOrCallbackId:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/2addr v2, v3

    add-int/lit8 v0, v2, 0x1

    .line 398
    .local v0, "ret":I
    iget-object v2, p0, Lorg/apache/cordova/NativeToJsMessageQueue$JsMessage;->pluginResult:Lorg/apache/cordova/api/PluginResult;

    invoke-virtual {v2}, Lorg/apache/cordova/api/PluginResult;->getMessageType()I

    move-result v2

    packed-switch v2, :pswitch_data_0

    .line 411
    :pswitch_0
    iget-object v2, p0, Lorg/apache/cordova/NativeToJsMessageQueue$JsMessage;->pluginResult:Lorg/apache/cordova/api/PluginResult;

    invoke-virtual {v2}, Lorg/apache/cordova/api/PluginResult;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    add-int/2addr v0, v2

    goto :goto_0

    .line 401
    :pswitch_1
    add-int/lit8 v0, v0, 0x1

    .line 402
    goto :goto_0

    .line 404
    :pswitch_2
    iget-object v2, p0, Lorg/apache/cordova/NativeToJsMessageQueue$JsMessage;->pluginResult:Lorg/apache/cordova/api/PluginResult;

    invoke-virtual {v2}, Lorg/apache/cordova/api/PluginResult;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    add-int/lit8 v2, v2, 0x1

    add-int/2addr v0, v2

    .line 405
    goto :goto_0

    .line 407
    :pswitch_3
    iget-object v2, p0, Lorg/apache/cordova/NativeToJsMessageQueue$JsMessage;->pluginResult:Lorg/apache/cordova/api/PluginResult;

    invoke-virtual {v2}, Lorg/apache/cordova/api/PluginResult;->getStrMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    add-int/lit8 v2, v2, 0x1

    add-int/2addr v0, v2

    .line 408
    goto :goto_0

    .line 398
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_0
        :pswitch_2
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method

.method encodeAsJsMessage(Ljava/lang/StringBuilder;)V
    .locals 4
    .param p1, "sb"    # Ljava/lang/StringBuilder;

    .prologue
    .line 455
    iget-object v2, p0, Lorg/apache/cordova/NativeToJsMessageQueue$JsMessage;->pluginResult:Lorg/apache/cordova/api/PluginResult;

    if-nez v2, :cond_0

    .line 456
    iget-object v2, p0, Lorg/apache/cordova/NativeToJsMessageQueue$JsMessage;->jsPayloadOrCallbackId:Ljava/lang/String;

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 472
    :goto_0
    return-void

    .line 458
    :cond_0
    iget-object v2, p0, Lorg/apache/cordova/NativeToJsMessageQueue$JsMessage;->pluginResult:Lorg/apache/cordova/api/PluginResult;

    invoke-virtual {v2}, Lorg/apache/cordova/api/PluginResult;->getStatus()I

    move-result v0

    .line 459
    .local v0, "status":I
    sget-object v2, Lorg/apache/cordova/api/PluginResult$Status;->OK:Lorg/apache/cordova/api/PluginResult$Status;

    invoke-virtual {v2}, Lorg/apache/cordova/api/PluginResult$Status;->ordinal()I

    move-result v2

    if-eq v0, v2, :cond_1

    sget-object v2, Lorg/apache/cordova/api/PluginResult$Status;->NO_RESULT:Lorg/apache/cordova/api/PluginResult$Status;

    invoke-virtual {v2}, Lorg/apache/cordova/api/PluginResult$Status;->ordinal()I

    move-result v2

    if-ne v0, v2, :cond_2

    :cond_1
    const/4 v1, 0x1

    .line 460
    .local v1, "success":Z
    :goto_1
    const-string v2, "cordova.callbackFromNative(\'"

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lorg/apache/cordova/NativeToJsMessageQueue$JsMessage;->jsPayloadOrCallbackId:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "\',"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ","

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ","

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lorg/apache/cordova/NativeToJsMessageQueue$JsMessage;->pluginResult:Lorg/apache/cordova/api/PluginResult;

    invoke-virtual {v3}, Lorg/apache/cordova/api/PluginResult;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ","

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lorg/apache/cordova/NativeToJsMessageQueue$JsMessage;->pluginResult:Lorg/apache/cordova/api/PluginResult;

    invoke-virtual {v3}, Lorg/apache/cordova/api/PluginResult;->getKeepCallback()Z

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ");"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 459
    .end local v1    # "success":Z
    :cond_2
    const/4 v1, 0x0

    goto :goto_1
.end method

.method encodeAsMessage(Ljava/lang/StringBuilder;)V
    .locals 8
    .param p1, "sb"    # Ljava/lang/StringBuilder;

    .prologue
    const/16 v7, 0x20

    const/4 v4, 0x1

    const/4 v5, 0x0

    .line 417
    iget-object v6, p0, Lorg/apache/cordova/NativeToJsMessageQueue$JsMessage;->pluginResult:Lorg/apache/cordova/api/PluginResult;

    if-nez v6, :cond_0

    .line 418
    const/16 v4, 0x4a

    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v4

    iget-object v5, p0, Lorg/apache/cordova/NativeToJsMessageQueue$JsMessage;->jsPayloadOrCallbackId:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 452
    :goto_0
    return-void

    .line 422
    :cond_0
    iget-object v6, p0, Lorg/apache/cordova/NativeToJsMessageQueue$JsMessage;->pluginResult:Lorg/apache/cordova/api/PluginResult;

    invoke-virtual {v6}, Lorg/apache/cordova/api/PluginResult;->getStatus()I

    move-result v3

    .line 423
    .local v3, "status":I
    sget-object v6, Lorg/apache/cordova/api/PluginResult$Status;->NO_RESULT:Lorg/apache/cordova/api/PluginResult$Status;

    invoke-virtual {v6}, Lorg/apache/cordova/api/PluginResult$Status;->ordinal()I

    move-result v6

    if-ne v3, v6, :cond_2

    move v1, v4

    .line 424
    .local v1, "noResult":Z
    :goto_1
    sget-object v6, Lorg/apache/cordova/api/PluginResult$Status;->OK:Lorg/apache/cordova/api/PluginResult$Status;

    invoke-virtual {v6}, Lorg/apache/cordova/api/PluginResult$Status;->ordinal()I

    move-result v6

    if-ne v3, v6, :cond_3

    move v2, v4

    .line 425
    .local v2, "resultOk":Z
    :goto_2
    iget-object v4, p0, Lorg/apache/cordova/NativeToJsMessageQueue$JsMessage;->pluginResult:Lorg/apache/cordova/api/PluginResult;

    invoke-virtual {v4}, Lorg/apache/cordova/api/PluginResult;->getKeepCallback()Z

    move-result v0

    .line 427
    .local v0, "keepCallback":Z
    if-nez v1, :cond_1

    if-eqz v2, :cond_4

    :cond_1
    const/16 v4, 0x53

    :goto_3
    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v6

    if-eqz v0, :cond_5

    const/16 v4, 0x31

    :goto_4
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v4

    iget-object v6, p0, Lorg/apache/cordova/NativeToJsMessageQueue$JsMessage;->jsPayloadOrCallbackId:Ljava/lang/String;

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 433
    iget-object v4, p0, Lorg/apache/cordova/NativeToJsMessageQueue$JsMessage;->pluginResult:Lorg/apache/cordova/api/PluginResult;

    invoke-virtual {v4}, Lorg/apache/cordova/api/PluginResult;->getMessageType()I

    move-result v4

    packed-switch v4, :pswitch_data_0

    .line 450
    :pswitch_0
    iget-object v4, p0, Lorg/apache/cordova/NativeToJsMessageQueue$JsMessage;->pluginResult:Lorg/apache/cordova/api/PluginResult;

    invoke-virtual {v4}, Lorg/apache/cordova/api/PluginResult;->getMessage()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .end local v0    # "keepCallback":Z
    .end local v1    # "noResult":Z
    .end local v2    # "resultOk":Z
    :cond_2
    move v1, v5

    .line 423
    goto :goto_1

    .restart local v1    # "noResult":Z
    :cond_3
    move v2, v5

    .line 424
    goto :goto_2

    .line 427
    .restart local v0    # "keepCallback":Z
    .restart local v2    # "resultOk":Z
    :cond_4
    const/16 v4, 0x46

    goto :goto_3

    :cond_5
    const/16 v4, 0x30

    goto :goto_4

    .line 435
    :pswitch_1
    iget-object v4, p0, Lorg/apache/cordova/NativeToJsMessageQueue$JsMessage;->pluginResult:Lorg/apache/cordova/api/PluginResult;

    invoke-virtual {v4}, Lorg/apache/cordova/api/PluginResult;->getMessage()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4, v5}, Ljava/lang/String;->charAt(I)C

    move-result v4

    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 438
    :pswitch_2
    const/16 v4, 0x4e

    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 441
    :pswitch_3
    const/16 v4, 0x6e

    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v4

    iget-object v5, p0, Lorg/apache/cordova/NativeToJsMessageQueue$JsMessage;->pluginResult:Lorg/apache/cordova/api/PluginResult;

    invoke-virtual {v5}, Lorg/apache/cordova/api/PluginResult;->getMessage()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto/16 :goto_0

    .line 445
    :pswitch_4
    const/16 v4, 0x73

    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 446
    iget-object v4, p0, Lorg/apache/cordova/NativeToJsMessageQueue$JsMessage;->pluginResult:Lorg/apache/cordova/api/PluginResult;

    invoke-virtual {v4}, Lorg/apache/cordova/api/PluginResult;->getStrMessage()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto/16 :goto_0

    .line 433
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_4
        :pswitch_0
        :pswitch_3
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method
