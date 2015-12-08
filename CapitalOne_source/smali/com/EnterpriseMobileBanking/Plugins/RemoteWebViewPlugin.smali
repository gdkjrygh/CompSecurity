.class public Lcom/EnterpriseMobileBanking/Plugins/RemoteWebViewPlugin;
.super Lorg/apache/cordova/api/Plugin;
.source "RemoteWebViewPlugin.java"


# static fields
.field private static final TAG:Ljava/lang/String; = "RemoteWebViewPlugin"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 14
    invoke-direct {p0}, Lorg/apache/cordova/api/Plugin;-><init>()V

    return-void
.end method


# virtual methods
.method public execute(Ljava/lang/String;Lorg/json/JSONArray;Ljava/lang/String;)Lorg/apache/cordova/api/PluginResult;
    .locals 7
    .param p1, "action"    # Ljava/lang/String;
    .param p2, "args"    # Lorg/json/JSONArray;
    .param p3, "callbackId"    # Ljava/lang/String;

    .prologue
    const/4 v6, 0x0

    .line 20
    new-instance v0, Lorg/apache/cordova/api/PluginResult;

    sget-object v3, Lorg/apache/cordova/api/PluginResult$Status;->NO_RESULT:Lorg/apache/cordova/api/PluginResult$Status;

    invoke-direct {v0, v3}, Lorg/apache/cordova/api/PluginResult;-><init>(Lorg/apache/cordova/api/PluginResult$Status;)V

    .line 21
    .local v0, "result":Lorg/apache/cordova/api/PluginResult;
    const-string v3, "open"

    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 23
    const-string v3, ""

    invoke-virtual {p2, v6, v3}, Lorg/json/JSONArray;->optString(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 24
    .local v2, "url":Ljava/lang/String;
    const-string v3, "RemoteWebViewPlugin"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "url: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/EnterpriseMobileBanking/Utils/Log;->v(Ljava/lang/String;Ljava/lang/String;)V

    .line 26
    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->getTransiteView()Lcom/EnterpriseMobileBanking/Plugins/Components/TransiteWebView;

    move-result-object v1

    .line 29
    .local v1, "transite":Landroid/webkit/WebView;
    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->getAppView()Landroid/webkit/WebView;

    move-result-object v3

    invoke-virtual {v3}, Landroid/webkit/WebView;->stopLoading()V

    .line 30
    invoke-virtual {v1}, Landroid/webkit/WebView;->stopLoading()V

    .line 31
    const-string v3, "about:blank"

    invoke-virtual {v1, v3}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 32
    invoke-virtual {v1, v2}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 33
    const-string v3, "freezeCard=true"

    invoke-virtual {v2, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 34
    invoke-virtual {v1, v6}, Landroid/webkit/WebView;->setVisibility(I)V

    .line 37
    :cond_0
    new-instance v0, Lorg/apache/cordova/api/PluginResult;

    .end local v0    # "result":Lorg/apache/cordova/api/PluginResult;
    sget-object v3, Lorg/apache/cordova/api/PluginResult$Status;->OK:Lorg/apache/cordova/api/PluginResult$Status;

    invoke-direct {v0, v3}, Lorg/apache/cordova/api/PluginResult;-><init>(Lorg/apache/cordova/api/PluginResult$Status;)V

    .line 40
    .end local v1    # "transite":Landroid/webkit/WebView;
    .end local v2    # "url":Ljava/lang/String;
    .restart local v0    # "result":Lorg/apache/cordova/api/PluginResult;
    :cond_1
    return-object v0
.end method
