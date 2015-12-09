.class public Lorg/apache/cordova/api/CallbackContext;
.super Ljava/lang/Object;
.source "CallbackContext.java"


# static fields
.field private static final LOG_TAG:Ljava/lang/String; = "CordovaPlugin"


# instance fields
.field private callbackId:Ljava/lang/String;

.field private changingThreads:I

.field private finished:Z

.field private webView:Lorg/apache/cordova/CordovaWebView;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lorg/apache/cordova/CordovaWebView;)V
    .locals 0
    .param p1, "callbackId"    # Ljava/lang/String;
    .param p2, "webView"    # Lorg/apache/cordova/CordovaWebView;

    .prologue
    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    iput-object p1, p0, Lorg/apache/cordova/api/CallbackContext;->callbackId:Ljava/lang/String;

    .line 20
    iput-object p2, p0, Lorg/apache/cordova/api/CallbackContext;->webView:Lorg/apache/cordova/CordovaWebView;

    .line 21
    return-void
.end method


# virtual methods
.method public error(I)V
    .locals 2
    .param p1, "message"    # I

    .prologue
    .line 109
    new-instance v0, Lorg/apache/cordova/api/PluginResult;

    sget-object v1, Lorg/apache/cordova/api/PluginResult$Status;->ERROR:Lorg/apache/cordova/api/PluginResult$Status;

    invoke-direct {v0, v1, p1}, Lorg/apache/cordova/api/PluginResult;-><init>(Lorg/apache/cordova/api/PluginResult$Status;I)V

    invoke-virtual {p0, v0}, Lorg/apache/cordova/api/CallbackContext;->sendPluginResult(Lorg/apache/cordova/api/PluginResult;)V

    .line 110
    return-void
.end method

.method public error(Ljava/lang/String;)V
    .locals 2
    .param p1, "message"    # Ljava/lang/String;

    .prologue
    .line 99
    new-instance v0, Lorg/apache/cordova/api/PluginResult;

    sget-object v1, Lorg/apache/cordova/api/PluginResult$Status;->ERROR:Lorg/apache/cordova/api/PluginResult$Status;

    invoke-direct {v0, v1, p1}, Lorg/apache/cordova/api/PluginResult;-><init>(Lorg/apache/cordova/api/PluginResult$Status;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lorg/apache/cordova/api/CallbackContext;->sendPluginResult(Lorg/apache/cordova/api/PluginResult;)V

    .line 100
    return-void
.end method

.method public error(Lorg/json/JSONObject;)V
    .locals 2
    .param p1, "message"    # Lorg/json/JSONObject;

    .prologue
    .line 89
    new-instance v0, Lorg/apache/cordova/api/PluginResult;

    sget-object v1, Lorg/apache/cordova/api/PluginResult$Status;->ERROR:Lorg/apache/cordova/api/PluginResult$Status;

    invoke-direct {v0, v1, p1}, Lorg/apache/cordova/api/PluginResult;-><init>(Lorg/apache/cordova/api/PluginResult$Status;Lorg/json/JSONObject;)V

    invoke-virtual {p0, v0}, Lorg/apache/cordova/api/CallbackContext;->sendPluginResult(Lorg/apache/cordova/api/PluginResult;)V

    .line 90
    return-void
.end method

.method public getCallbackId()Ljava/lang/String;
    .locals 1

    .prologue
    .line 32
    iget-object v0, p0, Lorg/apache/cordova/api/CallbackContext;->callbackId:Ljava/lang/String;

    return-object v0
.end method

.method public isChangingThreads()Z
    .locals 1

    .prologue
    .line 28
    iget v0, p0, Lorg/apache/cordova/api/CallbackContext;->changingThreads:I

    if-lez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public isFinished()Z
    .locals 1

    .prologue
    .line 24
    iget-boolean v0, p0, Lorg/apache/cordova/api/CallbackContext;->finished:Z

    return v0
.end method

.method public sendPluginResult(Lorg/apache/cordova/api/PluginResult;)V
    .locals 3
    .param p1, "pluginResult"    # Lorg/apache/cordova/api/PluginResult;

    .prologue
    .line 36
    monitor-enter p0

    .line 37
    :try_start_0
    iget-boolean v0, p0, Lorg/apache/cordova/api/CallbackContext;->finished:Z

    if-eqz v0, :cond_0

    .line 38
    const-string v0, "CordovaPlugin"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Attempted to send a second callback for ID: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lorg/apache/cordova/api/CallbackContext;->callbackId:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\nResult was: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lorg/apache/cordova/api/PluginResult;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 39
    monitor-exit p0

    .line 45
    :goto_0
    return-void

    .line 41
    :cond_0
    invoke-virtual {p1}, Lorg/apache/cordova/api/PluginResult;->getKeepCallback()Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x1

    :goto_1
    iput-boolean v0, p0, Lorg/apache/cordova/api/CallbackContext;->finished:Z

    .line 43
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    iget-object v0, p0, Lorg/apache/cordova/api/CallbackContext;->webView:Lorg/apache/cordova/CordovaWebView;

    iget-object v1, p0, Lorg/apache/cordova/api/CallbackContext;->callbackId:Ljava/lang/String;

    invoke-virtual {v0, p1, v1}, Lorg/apache/cordova/CordovaWebView;->sendPluginResult(Lorg/apache/cordova/api/PluginResult;Ljava/lang/String;)V

    goto :goto_0

    .line 41
    :cond_1
    const/4 v0, 0x0

    goto :goto_1

    .line 43
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public success()V
    .locals 2

    .prologue
    .line 80
    new-instance v0, Lorg/apache/cordova/api/PluginResult;

    sget-object v1, Lorg/apache/cordova/api/PluginResult$Status;->OK:Lorg/apache/cordova/api/PluginResult$Status;

    invoke-direct {v0, v1}, Lorg/apache/cordova/api/PluginResult;-><init>(Lorg/apache/cordova/api/PluginResult$Status;)V

    invoke-virtual {p0, v0}, Lorg/apache/cordova/api/CallbackContext;->sendPluginResult(Lorg/apache/cordova/api/PluginResult;)V

    .line 81
    return-void
.end method

.method public success(Ljava/lang/String;)V
    .locals 2
    .param p1, "message"    # Ljava/lang/String;

    .prologue
    .line 62
    new-instance v0, Lorg/apache/cordova/api/PluginResult;

    sget-object v1, Lorg/apache/cordova/api/PluginResult$Status;->OK:Lorg/apache/cordova/api/PluginResult$Status;

    invoke-direct {v0, v1, p1}, Lorg/apache/cordova/api/PluginResult;-><init>(Lorg/apache/cordova/api/PluginResult$Status;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lorg/apache/cordova/api/CallbackContext;->sendPluginResult(Lorg/apache/cordova/api/PluginResult;)V

    .line 63
    return-void
.end method

.method public success(Lorg/json/JSONArray;)V
    .locals 2
    .param p1, "message"    # Lorg/json/JSONArray;

    .prologue
    .line 71
    new-instance v0, Lorg/apache/cordova/api/PluginResult;

    sget-object v1, Lorg/apache/cordova/api/PluginResult$Status;->OK:Lorg/apache/cordova/api/PluginResult$Status;

    invoke-direct {v0, v1, p1}, Lorg/apache/cordova/api/PluginResult;-><init>(Lorg/apache/cordova/api/PluginResult$Status;Lorg/json/JSONArray;)V

    invoke-virtual {p0, v0}, Lorg/apache/cordova/api/CallbackContext;->sendPluginResult(Lorg/apache/cordova/api/PluginResult;)V

    .line 72
    return-void
.end method

.method public success(Lorg/json/JSONObject;)V
    .locals 2
    .param p1, "message"    # Lorg/json/JSONObject;

    .prologue
    .line 53
    new-instance v0, Lorg/apache/cordova/api/PluginResult;

    sget-object v1, Lorg/apache/cordova/api/PluginResult$Status;->OK:Lorg/apache/cordova/api/PluginResult$Status;

    invoke-direct {v0, v1, p1}, Lorg/apache/cordova/api/PluginResult;-><init>(Lorg/apache/cordova/api/PluginResult$Status;Lorg/json/JSONObject;)V

    invoke-virtual {p0, v0}, Lorg/apache/cordova/api/CallbackContext;->sendPluginResult(Lorg/apache/cordova/api/PluginResult;)V

    .line 54
    return-void
.end method
