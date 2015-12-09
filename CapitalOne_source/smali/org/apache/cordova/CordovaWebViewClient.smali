.class public Lorg/apache/cordova/CordovaWebViewClient;
.super Landroid/webkit/WebViewClient;
.source "CordovaWebViewClient.java"


# static fields
.field private static final CORDOVA_EXEC_URL_PREFIX:Ljava/lang/String; = "http://cdv_exec/"

.field private static final TAG:Ljava/lang/String; = "Cordova"


# instance fields
.field appView:Lorg/apache/cordova/CordovaWebView;

.field private authenticationTokens:Ljava/util/Hashtable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Hashtable",
            "<",
            "Ljava/lang/String;",
            "Lorg/apache/cordova/AuthenticationToken;",
            ">;"
        }
    .end annotation
.end field

.field cordova:Lorg/apache/cordova/api/CordovaInterface;

.field private doClearHistory:Z


# direct methods
.method public constructor <init>(Lorg/apache/cordova/api/CordovaInterface;)V
    .locals 1
    .param p1, "cordova"    # Lorg/apache/cordova/api/CordovaInterface;

    .prologue
    .line 64
    invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V

    .line 54
    const/4 v0, 0x0

    iput-boolean v0, p0, Lorg/apache/cordova/CordovaWebViewClient;->doClearHistory:Z

    .line 57
    new-instance v0, Ljava/util/Hashtable;

    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    iput-object v0, p0, Lorg/apache/cordova/CordovaWebViewClient;->authenticationTokens:Ljava/util/Hashtable;

    .line 65
    iput-object p1, p0, Lorg/apache/cordova/CordovaWebViewClient;->cordova:Lorg/apache/cordova/api/CordovaInterface;

    .line 66
    return-void
.end method

.method public constructor <init>(Lorg/apache/cordova/api/CordovaInterface;Lorg/apache/cordova/CordovaWebView;)V
    .locals 1
    .param p1, "cordova"    # Lorg/apache/cordova/api/CordovaInterface;
    .param p2, "view"    # Lorg/apache/cordova/CordovaWebView;

    .prologue
    .line 74
    invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V

    .line 54
    const/4 v0, 0x0

    iput-boolean v0, p0, Lorg/apache/cordova/CordovaWebViewClient;->doClearHistory:Z

    .line 57
    new-instance v0, Ljava/util/Hashtable;

    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    iput-object v0, p0, Lorg/apache/cordova/CordovaWebViewClient;->authenticationTokens:Ljava/util/Hashtable;

    .line 75
    iput-object p1, p0, Lorg/apache/cordova/CordovaWebViewClient;->cordova:Lorg/apache/cordova/api/CordovaInterface;

    .line 76
    iput-object p2, p0, Lorg/apache/cordova/CordovaWebViewClient;->appView:Lorg/apache/cordova/CordovaWebView;

    .line 77
    return-void
.end method

.method private handleExecUrl(Ljava/lang/String;)V
    .locals 11
    .param p1, "url"    # Ljava/lang/String;

    .prologue
    const/16 v10, 0x23

    const/4 v9, -0x1

    .line 92
    const-string v8, "http://cdv_exec/"

    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v2

    .line 93
    .local v2, "idx1":I
    add-int/lit8 v8, v2, 0x1

    invoke-virtual {p1, v10, v8}, Ljava/lang/String;->indexOf(II)I

    move-result v3

    .line 94
    .local v3, "idx2":I
    add-int/lit8 v8, v3, 0x1

    invoke-virtual {p1, v10, v8}, Ljava/lang/String;->indexOf(II)I

    move-result v4

    .line 95
    .local v4, "idx3":I
    add-int/lit8 v8, v4, 0x1

    invoke-virtual {p1, v10, v8}, Ljava/lang/String;->indexOf(II)I

    move-result v5

    .line 96
    .local v5, "idx4":I
    if-eq v2, v9, :cond_0

    if-eq v3, v9, :cond_0

    if-eq v4, v9, :cond_0

    if-ne v5, v9, :cond_1

    .line 97
    :cond_0
    const-string v8, "Cordova"

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "Could not decode URL command: "

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-static {v8, v9}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 105
    :goto_0
    return-void

    .line 100
    :cond_1
    invoke-virtual {p1, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v7

    .line 101
    .local v7, "service":Ljava/lang/String;
    add-int/lit8 v8, v3, 0x1

    invoke-virtual {p1, v8, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    .line 102
    .local v0, "action":Ljava/lang/String;
    add-int/lit8 v8, v4, 0x1

    invoke-virtual {p1, v8, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    .line 103
    .local v1, "callbackId":Ljava/lang/String;
    add-int/lit8 v8, v5, 0x1

    invoke-virtual {p1, v8}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v6

    .line 104
    .local v6, "jsonArgs":Ljava/lang/String;
    iget-object v8, p0, Lorg/apache/cordova/CordovaWebViewClient;->appView:Lorg/apache/cordova/CordovaWebView;

    iget-object v8, v8, Lorg/apache/cordova/CordovaWebView;->pluginManager:Lorg/apache/cordova/api/PluginManager;

    invoke-virtual {v8, v7, v0, v1, v6}, Lorg/apache/cordova/api/PluginManager;->exec(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    goto :goto_0
.end method


# virtual methods
.method public clearAuthenticationTokens()V
    .locals 1

    .prologue
    .line 478
    iget-object v0, p0, Lorg/apache/cordova/CordovaWebViewClient;->authenticationTokens:Ljava/util/Hashtable;

    invoke-virtual {v0}, Ljava/util/Hashtable;->clear()V

    .line 479
    return-void
.end method

.method public doUpdateVisitedHistory(Landroid/webkit/WebView;Ljava/lang/String;Z)V
    .locals 1
    .param p1, "view"    # Landroid/webkit/WebView;
    .param p2, "url"    # Ljava/lang/String;
    .param p3, "isReload"    # Z

    .prologue
    .line 404
    iget-object v0, p0, Lorg/apache/cordova/CordovaWebViewClient;->appView:Lorg/apache/cordova/CordovaWebView;

    invoke-virtual {v0}, Lorg/apache/cordova/CordovaWebView;->peekAtUrlStack()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 405
    iget-object v0, p0, Lorg/apache/cordova/CordovaWebViewClient;->appView:Lorg/apache/cordova/CordovaWebView;

    invoke-virtual {v0, p2}, Lorg/apache/cordova/CordovaWebView;->pushUrl(Ljava/lang/String;)V

    .line 407
    :cond_0
    return-void
.end method

.method public getAuthenticationToken(Ljava/lang/String;Ljava/lang/String;)Lorg/apache/cordova/AuthenticationToken;
    .locals 3
    .param p1, "host"    # Ljava/lang/String;
    .param p2, "realm"    # Ljava/lang/String;

    .prologue
    .line 453
    const/4 v0, 0x0

    .line 454
    .local v0, "token":Lorg/apache/cordova/AuthenticationToken;
    iget-object v1, p0, Lorg/apache/cordova/CordovaWebViewClient;->authenticationTokens:Ljava/util/Hashtable;

    invoke-virtual {p1, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .end local v0    # "token":Lorg/apache/cordova/AuthenticationToken;
    check-cast v0, Lorg/apache/cordova/AuthenticationToken;

    .line 456
    .restart local v0    # "token":Lorg/apache/cordova/AuthenticationToken;
    if-nez v0, :cond_1

    .line 458
    iget-object v1, p0, Lorg/apache/cordova/CordovaWebViewClient;->authenticationTokens:Ljava/util/Hashtable;

    invoke-virtual {v1, p1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .end local v0    # "token":Lorg/apache/cordova/AuthenticationToken;
    check-cast v0, Lorg/apache/cordova/AuthenticationToken;

    .line 461
    .restart local v0    # "token":Lorg/apache/cordova/AuthenticationToken;
    if-nez v0, :cond_0

    .line 462
    iget-object v1, p0, Lorg/apache/cordova/CordovaWebViewClient;->authenticationTokens:Ljava/util/Hashtable;

    invoke-virtual {v1, p2}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .end local v0    # "token":Lorg/apache/cordova/AuthenticationToken;
    check-cast v0, Lorg/apache/cordova/AuthenticationToken;

    .line 466
    .restart local v0    # "token":Lorg/apache/cordova/AuthenticationToken;
    :cond_0
    if-nez v0, :cond_1

    .line 467
    iget-object v1, p0, Lorg/apache/cordova/CordovaWebViewClient;->authenticationTokens:Ljava/util/Hashtable;

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .end local v0    # "token":Lorg/apache/cordova/AuthenticationToken;
    check-cast v0, Lorg/apache/cordova/AuthenticationToken;

    .line 471
    .restart local v0    # "token":Lorg/apache/cordova/AuthenticationToken;
    :cond_1
    return-object v0
.end method

.method public onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 5
    .param p1, "view"    # Landroid/webkit/WebView;
    .param p2, "url"    # Ljava/lang/String;

    .prologue
    const/4 v4, 0x0

    .line 277
    invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V

    .line 278
    const-string v1, "Cordova"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onPageFinished("

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ")"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lorg/apache/cordova/api/LOG;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 286
    iget-boolean v1, p0, Lorg/apache/cordova/CordovaWebViewClient;->doClearHistory:Z

    if-eqz v1, :cond_0

    .line 287
    invoke-virtual {p1}, Landroid/webkit/WebView;->clearHistory()V

    .line 288
    const/4 v1, 0x0

    iput-boolean v1, p0, Lorg/apache/cordova/CordovaWebViewClient;->doClearHistory:Z

    .line 292
    :cond_0
    iget-object v1, p0, Lorg/apache/cordova/CordovaWebViewClient;->appView:Lorg/apache/cordova/CordovaWebView;

    iget v2, v1, Lorg/apache/cordova/CordovaWebView;->loadUrlTimeout:I

    add-int/lit8 v2, v2, 0x1

    iput v2, v1, Lorg/apache/cordova/CordovaWebView;->loadUrlTimeout:I

    .line 297
    const-string v1, "about:blank"

    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 298
    iget-object v1, p0, Lorg/apache/cordova/CordovaWebViewClient;->appView:Lorg/apache/cordova/CordovaWebView;

    const-string v2, "javascript:try{ cordova.require(\'cordova/channel\').onNativeReady.fire();}catch(e){_nativeReady = true;}"

    invoke-virtual {v1, v2}, Lorg/apache/cordova/CordovaWebView;->loadUrl(Ljava/lang/String;)V

    .line 299
    iget-object v1, p0, Lorg/apache/cordova/CordovaWebViewClient;->appView:Lorg/apache/cordova/CordovaWebView;

    const-string v2, "onNativeReady"

    invoke-virtual {v1, v2, v4}, Lorg/apache/cordova/CordovaWebView;->postMessage(Ljava/lang/String;Ljava/lang/Object;)V

    .line 303
    :cond_1
    iget-object v1, p0, Lorg/apache/cordova/CordovaWebViewClient;->appView:Lorg/apache/cordova/CordovaWebView;

    const-string v2, "onPageFinished"

    invoke-virtual {v1, v2, p2}, Lorg/apache/cordova/CordovaWebView;->postMessage(Ljava/lang/String;Ljava/lang/Object;)V

    .line 306
    iget-object v1, p0, Lorg/apache/cordova/CordovaWebViewClient;->appView:Lorg/apache/cordova/CordovaWebView;

    invoke-virtual {v1}, Lorg/apache/cordova/CordovaWebView;->getVisibility()I

    move-result v1

    const/4 v2, 0x4

    if-ne v1, v2, :cond_2

    .line 307
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lorg/apache/cordova/CordovaWebViewClient$1;

    invoke-direct {v1, p0}, Lorg/apache/cordova/CordovaWebViewClient$1;-><init>(Lorg/apache/cordova/CordovaWebViewClient;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 320
    .local v0, "t":Ljava/lang/Thread;
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 324
    .end local v0    # "t":Ljava/lang/Thread;
    :cond_2
    const-string v1, "about:blank"

    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 325
    iget-object v1, p0, Lorg/apache/cordova/CordovaWebViewClient;->appView:Lorg/apache/cordova/CordovaWebView;

    const-string v2, "exit"

    invoke-virtual {v1, v2, v4}, Lorg/apache/cordova/CordovaWebView;->postMessage(Ljava/lang/String;Ljava/lang/Object;)V

    .line 327
    :cond_3
    return-void
.end method

.method public onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V
    .locals 2
    .param p1, "view"    # Landroid/webkit/WebView;
    .param p2, "url"    # Ljava/lang/String;
    .param p3, "favicon"    # Landroid/graphics/Bitmap;

    .prologue
    .line 250
    iget-object v0, p0, Lorg/apache/cordova/CordovaWebViewClient;->appView:Lorg/apache/cordova/CordovaWebView;

    iget-boolean v0, v0, Lorg/apache/cordova/CordovaWebView;->useBrowserHistory:Z

    if-nez v0, :cond_0

    .line 251
    invoke-virtual {p1}, Landroid/webkit/WebView;->clearHistory()V

    .line 252
    const/4 v0, 0x1

    iput-boolean v0, p0, Lorg/apache/cordova/CordovaWebViewClient;->doClearHistory:Z

    .line 256
    :cond_0
    iget-object v0, p0, Lorg/apache/cordova/CordovaWebViewClient;->appView:Lorg/apache/cordova/CordovaWebView;

    iget-object v0, v0, Lorg/apache/cordova/CordovaWebView;->jsMessageQueue:Lorg/apache/cordova/NativeToJsMessageQueue;

    invoke-virtual {v0}, Lorg/apache/cordova/NativeToJsMessageQueue;->reset()V

    .line 259
    iget-object v0, p0, Lorg/apache/cordova/CordovaWebViewClient;->appView:Lorg/apache/cordova/CordovaWebView;

    const-string v1, "onPageStarted"

    invoke-virtual {v0, v1, p2}, Lorg/apache/cordova/CordovaWebView;->postMessage(Ljava/lang/String;Ljava/lang/Object;)V

    .line 262
    iget-object v0, p0, Lorg/apache/cordova/CordovaWebViewClient;->appView:Lorg/apache/cordova/CordovaWebView;

    iget-object v0, v0, Lorg/apache/cordova/CordovaWebView;->pluginManager:Lorg/apache/cordova/api/PluginManager;

    if-eqz v0, :cond_1

    .line 263
    iget-object v0, p0, Lorg/apache/cordova/CordovaWebViewClient;->appView:Lorg/apache/cordova/CordovaWebView;

    iget-object v0, v0, Lorg/apache/cordova/CordovaWebView;->pluginManager:Lorg/apache/cordova/api/PluginManager;

    invoke-virtual {v0}, Lorg/apache/cordova/api/PluginManager;->onReset()V

    .line 265
    :cond_1
    return-void
.end method

.method public onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V
    .locals 7
    .param p1, "view"    # Landroid/webkit/WebView;
    .param p2, "errorCode"    # I
    .param p3, "description"    # Ljava/lang/String;
    .param p4, "failingUrl"    # Ljava/lang/String;

    .prologue
    .line 340
    const-string v2, "Cordova"

    const-string v3, "CordovaWebViewClient.onReceivedError: Error code=%s Description=%s URL=%s"

    const/4 v4, 0x3

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v4, v5

    const/4 v5, 0x1

    aput-object p3, v4, v5

    const/4 v5, 0x2

    aput-object p4, v4, v5

    invoke-static {v2, v3, v4}, Lorg/apache/cordova/api/LOG;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 343
    iget-object v2, p0, Lorg/apache/cordova/CordovaWebViewClient;->appView:Lorg/apache/cordova/CordovaWebView;

    iget v3, v2, Lorg/apache/cordova/CordovaWebView;->loadUrlTimeout:I

    add-int/lit8 v3, v3, 0x1

    iput v3, v2, Lorg/apache/cordova/CordovaWebView;->loadUrlTimeout:I

    .line 346
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 348
    .local v0, "data":Lorg/json/JSONObject;
    :try_start_0
    const-string v2, "errorCode"

    invoke-virtual {v0, v2, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 349
    const-string v2, "description"

    invoke-virtual {v0, v2, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 350
    const-string v2, "url"

    invoke-virtual {v0, v2, p4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 354
    :goto_0
    iget-object v2, p0, Lorg/apache/cordova/CordovaWebViewClient;->appView:Lorg/apache/cordova/CordovaWebView;

    const-string v3, "onReceivedError"

    invoke-virtual {v2, v3, v0}, Lorg/apache/cordova/CordovaWebView;->postMessage(Ljava/lang/String;Ljava/lang/Object;)V

    .line 355
    return-void

    .line 351
    :catch_0
    move-exception v1

    .line 352
    .local v1, "e":Lorg/json/JSONException;
    invoke-virtual {v1}, Lorg/json/JSONException;->printStackTrace()V

    goto :goto_0
.end method

.method public onReceivedHttpAuthRequest(Landroid/webkit/WebView;Landroid/webkit/HttpAuthHandler;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3
    .param p1, "view"    # Landroid/webkit/WebView;
    .param p2, "handler"    # Landroid/webkit/HttpAuthHandler;
    .param p3, "host"    # Ljava/lang/String;
    .param p4, "realm"    # Ljava/lang/String;

    .prologue
    .line 231
    invoke-virtual {p0, p3, p4}, Lorg/apache/cordova/CordovaWebViewClient;->getAuthenticationToken(Ljava/lang/String;Ljava/lang/String;)Lorg/apache/cordova/AuthenticationToken;

    move-result-object v0

    .line 232
    .local v0, "token":Lorg/apache/cordova/AuthenticationToken;
    if-eqz v0, :cond_0

    .line 233
    invoke-virtual {v0}, Lorg/apache/cordova/AuthenticationToken;->getUserName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Lorg/apache/cordova/AuthenticationToken;->getPassword()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2, v1, v2}, Landroid/webkit/HttpAuthHandler;->proceed(Ljava/lang/String;Ljava/lang/String;)V

    .line 235
    :cond_0
    return-void
.end method

.method public onReceivedSslError(Landroid/webkit/WebView;Landroid/webkit/SslErrorHandler;Landroid/net/http/SslError;)V
    .locals 5
    .param p1, "view"    # Landroid/webkit/WebView;
    .param p2, "handler"    # Landroid/webkit/SslErrorHandler;
    .param p3, "error"    # Landroid/net/http/SslError;
    .annotation build Landroid/annotation/TargetApi;
        value = 0x8
    .end annotation

    .prologue
    .line 371
    iget-object v4, p0, Lorg/apache/cordova/CordovaWebViewClient;->cordova:Lorg/apache/cordova/api/CordovaInterface;

    invoke-interface {v4}, Lorg/apache/cordova/api/CordovaInterface;->getActivity()Landroid/app/Activity;

    move-result-object v4

    invoke-virtual {v4}, Landroid/app/Activity;->getPackageName()Ljava/lang/String;

    move-result-object v2

    .line 372
    .local v2, "packageName":Ljava/lang/String;
    iget-object v4, p0, Lorg/apache/cordova/CordovaWebViewClient;->cordova:Lorg/apache/cordova/api/CordovaInterface;

    invoke-interface {v4}, Lorg/apache/cordova/api/CordovaInterface;->getActivity()Landroid/app/Activity;

    move-result-object v4

    invoke-virtual {v4}, Landroid/app/Activity;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v3

    .line 376
    .local v3, "pm":Landroid/content/pm/PackageManager;
    const/16 v4, 0x80

    :try_start_0
    invoke-virtual {v3, v2, v4}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    .line 377
    .local v0, "appInfo":Landroid/content/pm/ApplicationInfo;
    iget v4, v0, Landroid/content/pm/ApplicationInfo;->flags:I

    and-int/lit8 v4, v4, 0x2

    if-eqz v4, :cond_0

    .line 379
    invoke-virtual {p2}, Landroid/webkit/SslErrorHandler;->proceed()V

    .line 389
    .end local v0    # "appInfo":Landroid/content/pm/ApplicationInfo;
    :goto_0
    return-void

    .line 383
    .restart local v0    # "appInfo":Landroid/content/pm/ApplicationInfo;
    :cond_0
    invoke-super {p0, p1, p2, p3}, Landroid/webkit/WebViewClient;->onReceivedSslError(Landroid/webkit/WebView;Landroid/webkit/SslErrorHandler;Landroid/net/http/SslError;)V
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 385
    .end local v0    # "appInfo":Landroid/content/pm/ApplicationInfo;
    :catch_0
    move-exception v1

    .line 387
    .local v1, "e":Landroid/content/pm/PackageManager$NameNotFoundException;
    invoke-super {p0, p1, p2, p3}, Landroid/webkit/WebViewClient;->onReceivedSslError(Landroid/webkit/WebView;Landroid/webkit/SslErrorHandler;Landroid/net/http/SslError;)V

    goto :goto_0
.end method

.method public removeAuthenticationToken(Ljava/lang/String;Ljava/lang/String;)Lorg/apache/cordova/AuthenticationToken;
    .locals 2
    .param p1, "host"    # Ljava/lang/String;
    .param p2, "realm"    # Ljava/lang/String;

    .prologue
    .line 435
    iget-object v0, p0, Lorg/apache/cordova/CordovaWebViewClient;->authenticationTokens:Ljava/util/Hashtable;

    invoke-virtual {p1, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/Hashtable;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/apache/cordova/AuthenticationToken;

    return-object v0
.end method

.method public setAuthenticationToken(Lorg/apache/cordova/AuthenticationToken;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2
    .param p1, "authenticationToken"    # Lorg/apache/cordova/AuthenticationToken;
    .param p2, "host"    # Ljava/lang/String;
    .param p3, "realm"    # Ljava/lang/String;

    .prologue
    .line 417
    if-nez p2, :cond_0

    .line 418
    const-string p2, ""

    .line 420
    :cond_0
    if-nez p3, :cond_1

    .line 421
    const-string p3, ""

    .line 423
    :cond_1
    iget-object v0, p0, Lorg/apache/cordova/CordovaWebViewClient;->authenticationTokens:Ljava/util/Hashtable;

    invoke-virtual {p2, p3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 424
    return-void
.end method

.method public setWebView(Lorg/apache/cordova/CordovaWebView;)V
    .locals 0
    .param p1, "view"    # Lorg/apache/cordova/CordovaWebView;

    .prologue
    .line 85
    iput-object p1, p0, Lorg/apache/cordova/CordovaWebViewClient;->appView:Lorg/apache/cordova/CordovaWebView;

    .line 86
    return-void
.end method

.method public shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z
    .locals 9
    .param p1, "view"    # Landroid/webkit/WebView;
    .param p2, "url"    # Ljava/lang/String;

    .prologue
    .line 123
    iget-object v6, p0, Lorg/apache/cordova/CordovaWebViewClient;->appView:Lorg/apache/cordova/CordovaWebView;

    iget-object v6, v6, Lorg/apache/cordova/CordovaWebView;->pluginManager:Lorg/apache/cordova/api/PluginManager;

    if-eqz v6, :cond_0

    iget-object v6, p0, Lorg/apache/cordova/CordovaWebViewClient;->appView:Lorg/apache/cordova/CordovaWebView;

    iget-object v6, v6, Lorg/apache/cordova/CordovaWebView;->pluginManager:Lorg/apache/cordova/api/PluginManager;

    invoke-virtual {v6, p2}, Lorg/apache/cordova/api/PluginManager;->onOverrideUrlLoading(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_0

    .line 215
    :goto_0
    const/4 v6, 0x1

    :goto_1
    return v6

    .line 127
    :cond_0
    const-string v6, "tel:"

    invoke-virtual {p2, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_1

    .line 129
    :try_start_0
    new-instance v2, Landroid/content/Intent;

    const-string v6, "android.intent.action.DIAL"

    invoke-direct {v2, v6}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 130
    .local v2, "intent":Landroid/content/Intent;
    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v6

    invoke-virtual {v2, v6}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 131
    iget-object v6, p0, Lorg/apache/cordova/CordovaWebViewClient;->cordova:Lorg/apache/cordova/api/CordovaInterface;

    invoke-interface {v6}, Lorg/apache/cordova/api/CordovaInterface;->getActivity()Landroid/app/Activity;

    move-result-object v6

    invoke-virtual {v6, v2}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 132
    .end local v2    # "intent":Landroid/content/Intent;
    :catch_0
    move-exception v1

    .line 133
    .local v1, "e":Landroid/content/ActivityNotFoundException;
    const-string v6, "Cordova"

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "Error dialing "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    const-string v8, ": "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v1}, Landroid/content/ActivityNotFoundException;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Lorg/apache/cordova/api/LOG;->e(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 138
    .end local v1    # "e":Landroid/content/ActivityNotFoundException;
    :cond_1
    const-string v6, "geo:"

    invoke-virtual {p2, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_2

    .line 140
    :try_start_1
    new-instance v2, Landroid/content/Intent;

    const-string v6, "android.intent.action.VIEW"

    invoke-direct {v2, v6}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 141
    .restart local v2    # "intent":Landroid/content/Intent;
    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v6

    invoke-virtual {v2, v6}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 142
    iget-object v6, p0, Lorg/apache/cordova/CordovaWebViewClient;->cordova:Lorg/apache/cordova/api/CordovaInterface;

    invoke-interface {v6}, Lorg/apache/cordova/api/CordovaInterface;->getActivity()Landroid/app/Activity;

    move-result-object v6

    invoke-virtual {v6, v2}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
    :try_end_1
    .catch Landroid/content/ActivityNotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    .line 143
    .end local v2    # "intent":Landroid/content/Intent;
    :catch_1
    move-exception v1

    .line 144
    .restart local v1    # "e":Landroid/content/ActivityNotFoundException;
    const-string v6, "Cordova"

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "Error showing map "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    const-string v8, ": "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v1}, Landroid/content/ActivityNotFoundException;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Lorg/apache/cordova/api/LOG;->e(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 149
    .end local v1    # "e":Landroid/content/ActivityNotFoundException;
    :cond_2
    const-string v6, "mailto:"

    invoke-virtual {p2, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_3

    .line 151
    :try_start_2
    new-instance v2, Landroid/content/Intent;

    const-string v6, "android.intent.action.VIEW"

    invoke-direct {v2, v6}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 152
    .restart local v2    # "intent":Landroid/content/Intent;
    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v6

    invoke-virtual {v2, v6}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 153
    iget-object v6, p0, Lorg/apache/cordova/CordovaWebViewClient;->cordova:Lorg/apache/cordova/api/CordovaInterface;

    invoke-interface {v6}, Lorg/apache/cordova/api/CordovaInterface;->getActivity()Landroid/app/Activity;

    move-result-object v6

    invoke-virtual {v6, v2}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
    :try_end_2
    .catch Landroid/content/ActivityNotFoundException; {:try_start_2 .. :try_end_2} :catch_2

    goto/16 :goto_0

    .line 154
    .end local v2    # "intent":Landroid/content/Intent;
    :catch_2
    move-exception v1

    .line 155
    .restart local v1    # "e":Landroid/content/ActivityNotFoundException;
    const-string v6, "Cordova"

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "Error sending email "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    const-string v8, ": "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v1}, Landroid/content/ActivityNotFoundException;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Lorg/apache/cordova/api/LOG;->e(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 160
    .end local v1    # "e":Landroid/content/ActivityNotFoundException;
    :cond_3
    const-string v6, "sms:"

    invoke-virtual {p2, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_6

    .line 162
    :try_start_3
    new-instance v2, Landroid/content/Intent;

    const-string v6, "android.intent.action.VIEW"

    invoke-direct {v2, v6}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 165
    .restart local v2    # "intent":Landroid/content/Intent;
    const/4 v0, 0x0

    .line 166
    .local v0, "address":Ljava/lang/String;
    const/16 v6, 0x3f

    invoke-virtual {p2, v6}, Ljava/lang/String;->indexOf(I)I

    move-result v3

    .line 167
    .local v3, "parmIndex":I
    const/4 v6, -0x1

    if-ne v3, v6, :cond_5

    .line 168
    const/4 v6, 0x4

    invoke-virtual {p2, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    .line 182
    :cond_4
    :goto_2
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "sms:"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v6

    invoke-virtual {v2, v6}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 183
    const-string v6, "address"

    invoke-virtual {v2, v6, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 184
    const-string v6, "vnd.android-dir/mms-sms"

    invoke-virtual {v2, v6}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 185
    iget-object v6, p0, Lorg/apache/cordova/CordovaWebViewClient;->cordova:Lorg/apache/cordova/api/CordovaInterface;

    invoke-interface {v6}, Lorg/apache/cordova/api/CordovaInterface;->getActivity()Landroid/app/Activity;

    move-result-object v6

    invoke-virtual {v6, v2}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
    :try_end_3
    .catch Landroid/content/ActivityNotFoundException; {:try_start_3 .. :try_end_3} :catch_3

    goto/16 :goto_0

    .line 186
    .end local v0    # "address":Ljava/lang/String;
    .end local v2    # "intent":Landroid/content/Intent;
    .end local v3    # "parmIndex":I
    :catch_3
    move-exception v1

    .line 187
    .restart local v1    # "e":Landroid/content/ActivityNotFoundException;
    const-string v6, "Cordova"

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "Error sending sms "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    const-string v8, ":"

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v1}, Landroid/content/ActivityNotFoundException;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Lorg/apache/cordova/api/LOG;->e(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 171
    .end local v1    # "e":Landroid/content/ActivityNotFoundException;
    .restart local v0    # "address":Ljava/lang/String;
    .restart local v2    # "intent":Landroid/content/Intent;
    .restart local v3    # "parmIndex":I
    :cond_5
    const/4 v6, 0x4

    :try_start_4
    invoke-virtual {p2, v6, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    .line 174
    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v5

    .line 175
    .local v5, "uri":Landroid/net/Uri;
    invoke-virtual {v5}, Landroid/net/Uri;->getQuery()Ljava/lang/String;

    move-result-object v4

    .line 176
    .local v4, "query":Ljava/lang/String;
    if-eqz v4, :cond_4

    .line 177
    const-string v6, "body="

    invoke-virtual {v4, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_4

    .line 178
    const-string v6, "sms_body"

    const/4 v7, 0x5

    invoke-virtual {v4, v7}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v2, v6, v7}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    :try_end_4
    .catch Landroid/content/ActivityNotFoundException; {:try_start_4 .. :try_end_4} :catch_3

    goto :goto_2

    .line 196
    .end local v0    # "address":Ljava/lang/String;
    .end local v2    # "intent":Landroid/content/Intent;
    .end local v3    # "parmIndex":I
    .end local v4    # "query":Ljava/lang/String;
    .end local v5    # "uri":Landroid/net/Uri;
    :cond_6
    const-string v6, "file://"

    invoke-virtual {p2, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v6

    if-nez v6, :cond_7

    const-string v6, "data:"

    invoke-virtual {p2, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v6

    if-nez v6, :cond_7

    iget-object v6, p0, Lorg/apache/cordova/CordovaWebViewClient;->appView:Lorg/apache/cordova/CordovaWebView;

    iget-object v6, v6, Lorg/apache/cordova/CordovaWebView;->baseUrl:Ljava/lang/String;

    invoke-virtual {p2, v6}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v6

    if-eqz v6, :cond_7

    iget-object v6, p0, Lorg/apache/cordova/CordovaWebViewClient;->appView:Lorg/apache/cordova/CordovaWebView;

    invoke-virtual {v6, p2}, Lorg/apache/cordova/CordovaWebView;->isUrlWhiteListed(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_a

    .line 198
    :cond_7
    iget-object v6, p0, Lorg/apache/cordova/CordovaWebViewClient;->appView:Lorg/apache/cordova/CordovaWebView;

    iget-boolean v6, v6, Lorg/apache/cordova/CordovaWebView;->useBrowserHistory:Z

    if-nez v6, :cond_8

    const-string v6, "data:"

    invoke-virtual {p2, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_9

    .line 199
    :cond_8
    const/4 v6, 0x0

    goto/16 :goto_1

    .line 201
    :cond_9
    iget-object v6, p0, Lorg/apache/cordova/CordovaWebViewClient;->appView:Lorg/apache/cordova/CordovaWebView;

    invoke-virtual {v6, p2}, Lorg/apache/cordova/CordovaWebView;->loadUrl(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 207
    :cond_a
    :try_start_5
    new-instance v2, Landroid/content/Intent;

    const-string v6, "android.intent.action.VIEW"

    invoke-direct {v2, v6}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 208
    .restart local v2    # "intent":Landroid/content/Intent;
    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v6

    invoke-virtual {v2, v6}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 209
    iget-object v6, p0, Lorg/apache/cordova/CordovaWebViewClient;->cordova:Lorg/apache/cordova/api/CordovaInterface;

    invoke-interface {v6}, Lorg/apache/cordova/api/CordovaInterface;->getActivity()Landroid/app/Activity;

    move-result-object v6

    invoke-virtual {v6, v2}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
    :try_end_5
    .catch Landroid/content/ActivityNotFoundException; {:try_start_5 .. :try_end_5} :catch_4

    goto/16 :goto_0

    .line 210
    .end local v2    # "intent":Landroid/content/Intent;
    :catch_4
    move-exception v1

    .line 211
    .restart local v1    # "e":Landroid/content/ActivityNotFoundException;
    const-string v6, "Cordova"

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "Error loading url "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7, v1}, Lorg/apache/cordova/api/LOG;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto/16 :goto_0
.end method
