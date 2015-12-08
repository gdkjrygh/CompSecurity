.class public Lorg/apache/cordova/inappbrowser/InAppChromeClient;
.super Landroid/webkit/WebChromeClient;
.source "InAppChromeClient.java"


# instance fields
.field private LOG_TAG:Ljava/lang/String;

.field private MAX_QUOTA:J

.field private webView:Lorg/apache/cordova/CordovaWebView;


# direct methods
.method public constructor <init>(Lorg/apache/cordova/CordovaWebView;)V
    .locals 2
    .param p1, "webView"    # Lorg/apache/cordova/CordovaWebView;

    .prologue
    .line 41
    invoke-direct {p0}, Landroid/webkit/WebChromeClient;-><init>()V

    .line 37
    const-string v0, "InAppChromeClient"

    iput-object v0, p0, Lorg/apache/cordova/inappbrowser/InAppChromeClient;->LOG_TAG:Ljava/lang/String;

    .line 38
    const-wide/32 v0, 0x6400000

    iput-wide v0, p0, Lorg/apache/cordova/inappbrowser/InAppChromeClient;->MAX_QUOTA:J

    .line 42
    iput-object p1, p0, Lorg/apache/cordova/inappbrowser/InAppChromeClient;->webView:Lorg/apache/cordova/CordovaWebView;

    .line 43
    return-void
.end method


# virtual methods
.method public onExceededDatabaseQuota(Ljava/lang/String;Ljava/lang/String;JJJLandroid/webkit/WebStorage$QuotaUpdater;)V
    .locals 5
    .param p1, "url"    # Ljava/lang/String;
    .param p2, "databaseIdentifier"    # Ljava/lang/String;
    .param p3, "currentQuota"    # J
    .param p5, "estimatedSize"    # J
    .param p7, "totalUsedQuota"    # J
    .param p9, "quotaUpdater"    # Landroid/webkit/WebStorage$QuotaUpdater;

    .prologue
    .line 58
    iget-object v0, p0, Lorg/apache/cordova/inappbrowser/InAppChromeClient;->LOG_TAG:Ljava/lang/String;

    const-string v1, "onExceededDatabaseQuota estimatedSize: %d  currentQuota: %d  totalUsedQuota: %d"

    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-static {p5, p6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    aput-object v4, v2, v3

    const/4 v3, 0x1

    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    aput-object v4, v2, v3

    const/4 v3, 0x2

    invoke-static {p7, p8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-static {v0, v1, v2}, Lorg/apache/cordova/LOG;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 59
    iget-wide v0, p0, Lorg/apache/cordova/inappbrowser/InAppChromeClient;->MAX_QUOTA:J

    invoke-interface {p9, v0, v1}, Landroid/webkit/WebStorage$QuotaUpdater;->updateQuota(J)V

    .line 60
    return-void
.end method

.method public onGeolocationPermissionsShowPrompt(Ljava/lang/String;Landroid/webkit/GeolocationPermissions$Callback;)V
    .locals 2
    .param p1, "origin"    # Ljava/lang/String;
    .param p2, "callback"    # Landroid/webkit/GeolocationPermissions$Callback;

    .prologue
    .line 70
    invoke-super {p0, p1, p2}, Landroid/webkit/WebChromeClient;->onGeolocationPermissionsShowPrompt(Ljava/lang/String;Landroid/webkit/GeolocationPermissions$Callback;)V

    .line 71
    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-interface {p2, p1, v0, v1}, Landroid/webkit/GeolocationPermissions$Callback;->invoke(Ljava/lang/String;ZZ)V

    .line 72
    return-void
.end method

.method public onJsPrompt(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/webkit/JsPromptResult;)Z
    .locals 7
    .param p1, "view"    # Landroid/webkit/WebView;
    .param p2, "url"    # Ljava/lang/String;
    .param p3, "message"    # Ljava/lang/String;
    .param p4, "defaultValue"    # Ljava/lang/String;
    .param p5, "result"    # Landroid/webkit/JsPromptResult;

    .prologue
    const/4 v3, 0x1

    .line 103
    if-eqz p4, :cond_3

    const-string v4, "gap"

    invoke-virtual {p4, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_3

    .line 104
    const-string v4, "gap-iab://"

    invoke-virtual {p4, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 106
    const/16 v4, 0xa

    invoke-virtual {p4, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    .line 107
    .local v1, "scriptCallbackId":Ljava/lang/String;
    const-string v4, "InAppBrowser"

    invoke-virtual {v1, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_3

    .line 108
    if-eqz p3, :cond_0

    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result v4

    if-nez v4, :cond_1

    .line 109
    :cond_0
    new-instance v2, Lorg/apache/cordova/PluginResult;

    sget-object v4, Lorg/apache/cordova/PluginResult$Status;->OK:Lorg/apache/cordova/PluginResult$Status;

    new-instance v5, Lorg/json/JSONArray;

    invoke-direct {v5}, Lorg/json/JSONArray;-><init>()V

    invoke-direct {v2, v4, v5}, Lorg/apache/cordova/PluginResult;-><init>(Lorg/apache/cordova/PluginResult$Status;Lorg/json/JSONArray;)V

    .line 117
    .local v2, "scriptResult":Lorg/apache/cordova/PluginResult;
    :goto_0
    iget-object v4, p0, Lorg/apache/cordova/inappbrowser/InAppChromeClient;->webView:Lorg/apache/cordova/CordovaWebView;

    invoke-virtual {v4, v2, v1}, Lorg/apache/cordova/CordovaWebView;->sendPluginResult(Lorg/apache/cordova/PluginResult;Ljava/lang/String;)V

    .line 118
    const-string v4, ""

    invoke-virtual {p5, v4}, Landroid/webkit/JsPromptResult;->confirm(Ljava/lang/String;)V

    .line 130
    .end local v1    # "scriptCallbackId":Ljava/lang/String;
    .end local v2    # "scriptResult":Lorg/apache/cordova/PluginResult;
    :goto_1
    return v3

    .line 112
    .restart local v1    # "scriptCallbackId":Ljava/lang/String;
    :cond_1
    :try_start_0
    new-instance v2, Lorg/apache/cordova/PluginResult;

    sget-object v4, Lorg/apache/cordova/PluginResult$Status;->OK:Lorg/apache/cordova/PluginResult$Status;

    new-instance v5, Lorg/json/JSONArray;

    invoke-direct {v5, p3}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    invoke-direct {v2, v4, v5}, Lorg/apache/cordova/PluginResult;-><init>(Lorg/apache/cordova/PluginResult$Status;Lorg/json/JSONArray;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .restart local v2    # "scriptResult":Lorg/apache/cordova/PluginResult;
    goto :goto_0

    .line 113
    .end local v2    # "scriptResult":Lorg/apache/cordova/PluginResult;
    :catch_0
    move-exception v0

    .line 114
    .local v0, "e":Lorg/json/JSONException;
    new-instance v2, Lorg/apache/cordova/PluginResult;

    sget-object v4, Lorg/apache/cordova/PluginResult$Status;->JSON_EXCEPTION:Lorg/apache/cordova/PluginResult$Status;

    invoke-virtual {v0}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v2, v4, v5}, Lorg/apache/cordova/PluginResult;-><init>(Lorg/apache/cordova/PluginResult$Status;Ljava/lang/String;)V

    .restart local v2    # "scriptResult":Lorg/apache/cordova/PluginResult;
    goto :goto_0

    .line 125
    .end local v0    # "e":Lorg/json/JSONException;
    .end local v1    # "scriptCallbackId":Ljava/lang/String;
    .end local v2    # "scriptResult":Lorg/apache/cordova/PluginResult;
    :cond_2
    iget-object v4, p0, Lorg/apache/cordova/inappbrowser/InAppChromeClient;->LOG_TAG:Ljava/lang/String;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "InAppBrowser does not support Cordova API calls: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, " "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lorg/apache/cordova/LOG;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 126
    invoke-virtual {p5}, Landroid/webkit/JsPromptResult;->cancel()V

    goto :goto_1

    .line 130
    :cond_3
    const/4 v3, 0x0

    goto :goto_1
.end method
