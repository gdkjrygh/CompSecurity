.class public abstract Lorg/apache/cordova/api/Plugin;
.super Lorg/apache/cordova/api/CordovaPlugin;
.source "Plugin.java"


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# instance fields
.field public ctx:Lorg/apache/cordova/api/LegacyContext;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 31
    invoke-direct {p0}, Lorg/apache/cordova/api/CordovaPlugin;-><init>()V

    return-void
.end method


# virtual methods
.method public error(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3
    .param p1, "message"    # Ljava/lang/String;
    .param p2, "callbackId"    # Ljava/lang/String;

    .prologue
    .line 174
    iget-object v0, p0, Lorg/apache/cordova/api/Plugin;->webView:Lorg/apache/cordova/CordovaWebView;

    new-instance v1, Lorg/apache/cordova/api/PluginResult;

    sget-object v2, Lorg/apache/cordova/api/PluginResult$Status;->ERROR:Lorg/apache/cordova/api/PluginResult$Status;

    invoke-direct {v1, v2, p1}, Lorg/apache/cordova/api/PluginResult;-><init>(Lorg/apache/cordova/api/PluginResult$Status;Ljava/lang/String;)V

    invoke-virtual {v0, v1, p2}, Lorg/apache/cordova/CordovaWebView;->sendPluginResult(Lorg/apache/cordova/api/PluginResult;Ljava/lang/String;)V

    .line 175
    return-void
.end method

.method public error(Lorg/apache/cordova/api/PluginResult;Ljava/lang/String;)V
    .locals 1
    .param p1, "pluginResult"    # Lorg/apache/cordova/api/PluginResult;
    .param p2, "callbackId"    # Ljava/lang/String;

    .prologue
    .line 154
    iget-object v0, p0, Lorg/apache/cordova/api/Plugin;->webView:Lorg/apache/cordova/CordovaWebView;

    invoke-virtual {v0, p1, p2}, Lorg/apache/cordova/CordovaWebView;->sendPluginResult(Lorg/apache/cordova/api/PluginResult;Ljava/lang/String;)V

    .line 155
    return-void
.end method

.method public error(Lorg/json/JSONObject;Ljava/lang/String;)V
    .locals 3
    .param p1, "message"    # Lorg/json/JSONObject;
    .param p2, "callbackId"    # Ljava/lang/String;

    .prologue
    .line 164
    iget-object v0, p0, Lorg/apache/cordova/api/Plugin;->webView:Lorg/apache/cordova/CordovaWebView;

    new-instance v1, Lorg/apache/cordova/api/PluginResult;

    sget-object v2, Lorg/apache/cordova/api/PluginResult$Status;->ERROR:Lorg/apache/cordova/api/PluginResult$Status;

    invoke-direct {v1, v2, p1}, Lorg/apache/cordova/api/PluginResult;-><init>(Lorg/apache/cordova/api/PluginResult$Status;Lorg/json/JSONObject;)V

    invoke-virtual {v0, v1, p2}, Lorg/apache/cordova/CordovaWebView;->sendPluginResult(Lorg/apache/cordova/api/PluginResult;Ljava/lang/String;)V

    .line 165
    return-void
.end method

.method public abstract execute(Ljava/lang/String;Lorg/json/JSONArray;Ljava/lang/String;)Lorg/apache/cordova/api/PluginResult;
.end method

.method public execute(Ljava/lang/String;Lorg/json/JSONArray;Lorg/apache/cordova/api/CallbackContext;)Z
    .locals 6
    .param p1, "action"    # Ljava/lang/String;
    .param p2, "args"    # Lorg/json/JSONArray;
    .param p3, "callbackContext"    # Lorg/apache/cordova/api/CallbackContext;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .prologue
    const/4 v3, 0x1

    .line 70
    invoke-virtual {p3}, Lorg/apache/cordova/api/CallbackContext;->getCallbackId()Ljava/lang/String;

    move-result-object v0

    .line 71
    .local v0, "callbackId":Ljava/lang/String;
    invoke-virtual {p0, p1}, Lorg/apache/cordova/api/Plugin;->isSynch(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_0

    move v2, v3

    .line 72
    .local v2, "runAsync":Z
    :goto_0
    if-eqz v2, :cond_1

    .line 74
    iget-object v4, p0, Lorg/apache/cordova/api/Plugin;->cordova:Lorg/apache/cordova/api/CordovaInterface;

    invoke-interface {v4}, Lorg/apache/cordova/api/CordovaInterface;->getThreadPool()Ljava/util/concurrent/ExecutorService;

    move-result-object v4

    new-instance v5, Lorg/apache/cordova/api/Plugin$1;

    invoke-direct {v5, p0, p1, p2, v0}, Lorg/apache/cordova/api/Plugin$1;-><init>(Lorg/apache/cordova/api/Plugin;Ljava/lang/String;Lorg/json/JSONArray;Ljava/lang/String;)V

    invoke-interface {v4, v5}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 95
    :goto_1
    return v3

    .line 71
    .end local v2    # "runAsync":Z
    :cond_0
    const/4 v2, 0x0

    goto :goto_0

    .line 86
    .restart local v2    # "runAsync":Z
    :cond_1
    invoke-virtual {p0, p1, p2, v0}, Lorg/apache/cordova/api/Plugin;->execute(Ljava/lang/String;Lorg/json/JSONArray;Ljava/lang/String;)Lorg/apache/cordova/api/PluginResult;

    move-result-object v1

    .line 89
    .local v1, "cr":Lorg/apache/cordova/api/PluginResult;
    if-nez v1, :cond_2

    .line 90
    new-instance v1, Lorg/apache/cordova/api/PluginResult;

    .end local v1    # "cr":Lorg/apache/cordova/api/PluginResult;
    sget-object v4, Lorg/apache/cordova/api/PluginResult$Status;->NO_RESULT:Lorg/apache/cordova/api/PluginResult$Status;

    invoke-direct {v1, v4}, Lorg/apache/cordova/api/PluginResult;-><init>(Lorg/apache/cordova/api/PluginResult$Status;)V

    .line 93
    .restart local v1    # "cr":Lorg/apache/cordova/api/PluginResult;
    :cond_2
    invoke-virtual {p3, v1}, Lorg/apache/cordova/api/CallbackContext;->sendPluginResult(Lorg/apache/cordova/api/PluginResult;)V

    goto :goto_1
.end method

.method public initialize(Lorg/apache/cordova/api/CordovaInterface;Lorg/apache/cordova/CordovaWebView;)V
    .locals 0
    .param p1, "cordova"    # Lorg/apache/cordova/api/CordovaInterface;
    .param p2, "webView"    # Lorg/apache/cordova/CordovaWebView;

    .prologue
    .line 42
    invoke-super {p0, p1, p2}, Lorg/apache/cordova/api/CordovaPlugin;->initialize(Lorg/apache/cordova/api/CordovaInterface;Lorg/apache/cordova/CordovaWebView;)V

    .line 43
    invoke-virtual {p0, p1}, Lorg/apache/cordova/api/Plugin;->setContext(Lorg/apache/cordova/api/CordovaInterface;)V

    .line 44
    invoke-virtual {p0, p2}, Lorg/apache/cordova/api/Plugin;->setView(Lorg/apache/cordova/CordovaWebView;)V

    .line 45
    return-void
.end method

.method public isSynch(Ljava/lang/String;)Z
    .locals 1
    .param p1, "action"    # Ljava/lang/String;

    .prologue
    .line 37
    const/4 v0, 0x0

    return v0
.end method

.method public sendJavascript(Ljava/lang/String;)V
    .locals 1
    .param p1, "statement"    # Ljava/lang/String;

    .prologue
    .line 103
    iget-object v0, p0, Lorg/apache/cordova/api/Plugin;->webView:Lorg/apache/cordova/CordovaWebView;

    invoke-virtual {v0, p1}, Lorg/apache/cordova/CordovaWebView;->sendJavascript(Ljava/lang/String;)V

    .line 104
    return-void
.end method

.method public sendPluginResult(Lorg/apache/cordova/api/PluginResult;Ljava/lang/String;)V
    .locals 1
    .param p1, "pluginResult"    # Lorg/apache/cordova/api/PluginResult;
    .param p2, "callbackId"    # Ljava/lang/String;

    .prologue
    .line 110
    iget-object v0, p0, Lorg/apache/cordova/api/Plugin;->webView:Lorg/apache/cordova/CordovaWebView;

    invoke-virtual {v0, p1, p2}, Lorg/apache/cordova/CordovaWebView;->sendPluginResult(Lorg/apache/cordova/api/PluginResult;Ljava/lang/String;)V

    .line 111
    return-void
.end method

.method public setContext(Lorg/apache/cordova/api/CordovaInterface;)V
    .locals 2
    .param p1, "ctx"    # Lorg/apache/cordova/api/CordovaInterface;

    .prologue
    .line 54
    iput-object p1, p0, Lorg/apache/cordova/api/Plugin;->cordova:Lorg/apache/cordova/api/CordovaInterface;

    .line 55
    new-instance v0, Lorg/apache/cordova/api/LegacyContext;

    iget-object v1, p0, Lorg/apache/cordova/api/Plugin;->cordova:Lorg/apache/cordova/api/CordovaInterface;

    invoke-direct {v0, v1}, Lorg/apache/cordova/api/LegacyContext;-><init>(Lorg/apache/cordova/api/CordovaInterface;)V

    iput-object v0, p0, Lorg/apache/cordova/api/Plugin;->ctx:Lorg/apache/cordova/api/LegacyContext;

    .line 56
    return-void
.end method

.method public setView(Lorg/apache/cordova/CordovaWebView;)V
    .locals 0
    .param p1, "webView"    # Lorg/apache/cordova/CordovaWebView;

    .prologue
    .line 65
    iput-object p1, p0, Lorg/apache/cordova/api/Plugin;->webView:Lorg/apache/cordova/CordovaWebView;

    .line 66
    return-void
.end method

.method public success(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3
    .param p1, "message"    # Ljava/lang/String;
    .param p2, "callbackId"    # Ljava/lang/String;

    .prologue
    .line 144
    iget-object v0, p0, Lorg/apache/cordova/api/Plugin;->webView:Lorg/apache/cordova/CordovaWebView;

    new-instance v1, Lorg/apache/cordova/api/PluginResult;

    sget-object v2, Lorg/apache/cordova/api/PluginResult$Status;->OK:Lorg/apache/cordova/api/PluginResult$Status;

    invoke-direct {v1, v2, p1}, Lorg/apache/cordova/api/PluginResult;-><init>(Lorg/apache/cordova/api/PluginResult$Status;Ljava/lang/String;)V

    invoke-virtual {v0, v1, p2}, Lorg/apache/cordova/CordovaWebView;->sendPluginResult(Lorg/apache/cordova/api/PluginResult;Ljava/lang/String;)V

    .line 145
    return-void
.end method

.method public success(Lorg/apache/cordova/api/PluginResult;Ljava/lang/String;)V
    .locals 1
    .param p1, "pluginResult"    # Lorg/apache/cordova/api/PluginResult;
    .param p2, "callbackId"    # Ljava/lang/String;

    .prologue
    .line 124
    iget-object v0, p0, Lorg/apache/cordova/api/Plugin;->webView:Lorg/apache/cordova/CordovaWebView;

    invoke-virtual {v0, p1, p2}, Lorg/apache/cordova/CordovaWebView;->sendPluginResult(Lorg/apache/cordova/api/PluginResult;Ljava/lang/String;)V

    .line 125
    return-void
.end method

.method public success(Lorg/json/JSONObject;Ljava/lang/String;)V
    .locals 3
    .param p1, "message"    # Lorg/json/JSONObject;
    .param p2, "callbackId"    # Ljava/lang/String;

    .prologue
    .line 134
    iget-object v0, p0, Lorg/apache/cordova/api/Plugin;->webView:Lorg/apache/cordova/CordovaWebView;

    new-instance v1, Lorg/apache/cordova/api/PluginResult;

    sget-object v2, Lorg/apache/cordova/api/PluginResult$Status;->OK:Lorg/apache/cordova/api/PluginResult$Status;

    invoke-direct {v1, v2, p1}, Lorg/apache/cordova/api/PluginResult;-><init>(Lorg/apache/cordova/api/PluginResult$Status;Lorg/json/JSONObject;)V

    invoke-virtual {v0, v1, p2}, Lorg/apache/cordova/CordovaWebView;->sendPluginResult(Lorg/apache/cordova/api/PluginResult;Ljava/lang/String;)V

    .line 135
    return-void
.end method
