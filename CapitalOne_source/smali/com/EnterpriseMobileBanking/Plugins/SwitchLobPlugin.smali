.class public Lcom/EnterpriseMobileBanking/Plugins/SwitchLobPlugin;
.super Lorg/apache/cordova/api/Plugin;
.source "SwitchLobPlugin.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 15
    invoke-direct {p0}, Lorg/apache/cordova/api/Plugin;-><init>()V

    return-void
.end method


# virtual methods
.method public execute(Ljava/lang/String;Lorg/json/JSONArray;Ljava/lang/String;)Lorg/apache/cordova/api/PluginResult;
    .locals 6
    .param p1, "action"    # Ljava/lang/String;
    .param p2, "args"    # Lorg/json/JSONArray;
    .param p3, "callbackId"    # Ljava/lang/String;

    .prologue
    .line 23
    new-instance v1, Lorg/apache/cordova/api/PluginResult;

    sget-object v2, Lorg/apache/cordova/api/PluginResult$Status;->NO_RESULT:Lorg/apache/cordova/api/PluginResult$Status;

    invoke-direct {v1, v2}, Lorg/apache/cordova/api/PluginResult;-><init>(Lorg/apache/cordova/api/PluginResult$Status;)V

    .line 25
    .local v1, "result":Lorg/apache/cordova/api/PluginResult;
    const-string v2, "switchLobFinish"

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 32
    const/4 v2, 0x0

    const-string v3, ""

    invoke-virtual {p2, v2, v3}, Lorg/json/JSONArray;->optString(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 33
    .local v0, "actionLob":Ljava/lang/String;
    invoke-static {v0}, Lcom/EnterpriseMobileBanking/AppHelper;->switchLobFinish(Ljava/lang/String;)V

    .line 34
    new-instance v1, Lorg/apache/cordova/api/PluginResult;

    .end local v1    # "result":Lorg/apache/cordova/api/PluginResult;
    sget-object v2, Lorg/apache/cordova/api/PluginResult$Status;->OK:Lorg/apache/cordova/api/PluginResult$Status;

    invoke-direct {v1, v2}, Lorg/apache/cordova/api/PluginResult;-><init>(Lorg/apache/cordova/api/PluginResult$Status;)V

    .line 36
    .restart local v1    # "result":Lorg/apache/cordova/api/PluginResult;
    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->getAppView()Landroid/webkit/WebView;

    move-result-object v2

    new-instance v3, Lcom/EnterpriseMobileBanking/Plugins/SwitchLobPlugin$1;

    invoke-direct {v3, p0}, Lcom/EnterpriseMobileBanking/Plugins/SwitchLobPlugin$1;-><init>(Lcom/EnterpriseMobileBanking/Plugins/SwitchLobPlugin;)V

    const-wide/16 v4, 0x7d0

    invoke-virtual {v2, v3, v4, v5}, Landroid/webkit/WebView;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 44
    .end local v0    # "actionLob":Ljava/lang/String;
    :cond_0
    return-object v1
.end method
