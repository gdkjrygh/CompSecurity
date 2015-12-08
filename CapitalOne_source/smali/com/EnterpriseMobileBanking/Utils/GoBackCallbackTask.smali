.class public Lcom/EnterpriseMobileBanking/Utils/GoBackCallbackTask;
.super Lcom/EnterpriseMobileBanking/Utils/CallbackTask;
.source "GoBackCallbackTask.java"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field private static final TAG:Ljava/lang/String; = "GoBackCBT"

.field private static final actions:[Ljava/lang/String;


# instance fields
.field private view:Landroid/webkit/WebView;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 17
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "goBack"

    aput-object v2, v0, v1

    sput-object v0, Lcom/EnterpriseMobileBanking/Utils/GoBackCallbackTask;->actions:[Ljava/lang/String;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .prologue
    .line 24
    invoke-direct {p0}, Lcom/EnterpriseMobileBanking/Utils/CallbackTask;-><init>()V

    .line 21
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/EnterpriseMobileBanking/Utils/GoBackCallbackTask;->view:Landroid/webkit/WebView;

    .line 25
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;Lorg/json/JSONArray;Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;)V
    .locals 1
    .param p1, "callbackId"    # Ljava/lang/String;
    .param p2, "parameters"    # Lorg/json/JSONArray;
    .param p3, "appLink"    # Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;

    .prologue
    .line 29
    invoke-direct {p0, p1, p2, p3}, Lcom/EnterpriseMobileBanking/Utils/CallbackTask;-><init>(Ljava/lang/String;Lorg/json/JSONArray;Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;)V

    .line 21
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/EnterpriseMobileBanking/Utils/GoBackCallbackTask;->view:Landroid/webkit/WebView;

    .line 30
    return-void
.end method

.method public static load()V
    .locals 2

    .prologue
    .line 90
    const-string v0, "GoBackCBT"

    const-string v1, "Loading"

    invoke-static {v0, v1}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 91
    new-instance v0, Lcom/EnterpriseMobileBanking/Utils/GoBackCallbackTask;

    invoke-direct {v0}, Lcom/EnterpriseMobileBanking/Utils/GoBackCallbackTask;-><init>()V

    sget-object v1, Lcom/EnterpriseMobileBanking/Utils/GoBackCallbackTask;->actions:[Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/EnterpriseMobileBanking/Utils/CallbackTaskFactory;->addCallbackTask(Lcom/EnterpriseMobileBanking/Utils/CallbackTask;[Ljava/lang/String;)V

    .line 92
    return-void
.end method


# virtual methods
.method public create(Ljava/lang/String;Lorg/json/JSONArray;Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;)Lcom/EnterpriseMobileBanking/Utils/CallbackTask;
    .locals 1
    .param p1, "callbackId"    # Ljava/lang/String;
    .param p2, "parameters"    # Lorg/json/JSONArray;
    .param p3, "appLink"    # Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;

    .prologue
    .line 35
    new-instance v0, Lcom/EnterpriseMobileBanking/Utils/GoBackCallbackTask;

    invoke-direct {v0, p1, p2, p3}, Lcom/EnterpriseMobileBanking/Utils/GoBackCallbackTask;-><init>(Ljava/lang/String;Lorg/json/JSONArray;Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;)V

    return-object v0
.end method

.method public execute(Landroid/webkit/WebView;)V
    .locals 1
    .param p1, "view"    # Landroid/webkit/WebView;

    .prologue
    .line 82
    iput-object p1, p0, Lcom/EnterpriseMobileBanking/Utils/GoBackCallbackTask;->view:Landroid/webkit/WebView;

    .line 84
    invoke-virtual {p1}, Landroid/webkit/WebView;->getHandler()Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 86
    return-void
.end method

.method public run()V
    .locals 5

    .prologue
    const v3, 0x7f090121

    .line 39
    const-string v0, "goBack();"

    .line 41
    .local v0, "jsCommand":Ljava/lang/String;
    iget-object v1, p0, Lcom/EnterpriseMobileBanking/Utils/GoBackCallbackTask;->view:Landroid/webkit/WebView;

    invoke-virtual {v1}, Landroid/webkit/WebView;->getUrl()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/EnterpriseMobileBanking/Utils/GoBackCallbackTask;->view:Landroid/webkit/WebView;

    invoke-virtual {v1}, Landroid/webkit/WebView;->getUrl()Ljava/lang/String;

    move-result-object v1

    const-string v2, "terms_od"

    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 42
    iget-object v1, p0, Lcom/EnterpriseMobileBanking/Utils/GoBackCallbackTask;->appLink:Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;

    const-string v2, "closeInnerWebView"

    new-instance v3, Lorg/json/JSONArray;

    invoke-direct {v3}, Lorg/json/JSONArray;-><init>()V

    const-string v4, "cbInternal"

    invoke-virtual {v1, v2, v3, v4}, Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;->execute(Ljava/lang/String;Lorg/json/JSONArray;Ljava/lang/String;)Lorg/apache/cordova/api/PluginResult;

    .line 43
    const-string v0, "Ext.dispatch({controller : \'RDCController\',action : \'backtoTAndC\'});"

    .line 72
    :cond_0
    :goto_0
    if-eqz v0, :cond_1

    .line 73
    iget-object v1, p0, Lcom/EnterpriseMobileBanking/Utils/GoBackCallbackTask;->appLink:Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;

    invoke-virtual {v1, v0}, Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;->sendJavascript(Ljava/lang/String;)V

    .line 76
    :cond_1
    iget-object v1, p0, Lcom/EnterpriseMobileBanking/Utils/GoBackCallbackTask;->appLink:Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;

    sget-object v2, Lorg/apache/cordova/api/PluginResult$Status;->OK:Lorg/apache/cordova/api/PluginResult$Status;

    invoke-virtual {v1, v2, p0}, Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;->sendPluginResult(Lorg/apache/cordova/api/PluginResult$Status;Lcom/EnterpriseMobileBanking/Utils/CallbackTask;)V

    .line 77
    return-void

    .line 51
    :cond_2
    iget-object v1, p0, Lcom/EnterpriseMobileBanking/Utils/GoBackCallbackTask;->view:Landroid/webkit/WebView;

    invoke-virtual {v1}, Landroid/webkit/WebView;->getVisibility()I

    move-result v1

    if-nez v1, :cond_0

    .line 52
    const-string v0, "goBackFlow( );"

    .line 53
    iget-object v1, p0, Lcom/EnterpriseMobileBanking/Utils/GoBackCallbackTask;->view:Landroid/webkit/WebView;

    invoke-virtual {v1}, Landroid/webkit/WebView;->canGoBack()Z

    move-result v1

    if-nez v1, :cond_3

    iget-object v1, p0, Lcom/EnterpriseMobileBanking/Utils/GoBackCallbackTask;->view:Landroid/webkit/WebView;

    invoke-virtual {v1}, Landroid/webkit/WebView;->getUrl()Ljava/lang/String;

    move-result-object v1

    invoke-static {v3}, Lcom/EnterpriseMobileBanking/AppHelper;->getAppString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 54
    :cond_3
    iget-object v1, p0, Lcom/EnterpriseMobileBanking/Utils/GoBackCallbackTask;->view:Landroid/webkit/WebView;

    invoke-virtual {v1}, Landroid/webkit/WebView;->getUrl()Ljava/lang/String;

    move-result-object v1

    const v2, 0x7f090113

    invoke-static {v2}, Lcom/EnterpriseMobileBanking/AppHelper;->getAppString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_4

    iget-object v1, p0, Lcom/EnterpriseMobileBanking/Utils/GoBackCallbackTask;->view:Landroid/webkit/WebView;

    invoke-virtual {v1}, Landroid/webkit/WebView;->getUrl()Ljava/lang/String;

    move-result-object v1

    const v2, 0x7f090114

    invoke-static {v2}, Lcom/EnterpriseMobileBanking/AppHelper;->getAppString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_4

    iget-object v1, p0, Lcom/EnterpriseMobileBanking/Utils/GoBackCallbackTask;->view:Landroid/webkit/WebView;

    invoke-virtual {v1}, Landroid/webkit/WebView;->getUrl()Ljava/lang/String;

    move-result-object v1

    invoke-static {v3}, Lcom/EnterpriseMobileBanking/AppHelper;->getAppString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 57
    :cond_4
    const-string v0, "reloadLastFlow();"

    .line 58
    iget-object v1, p0, Lcom/EnterpriseMobileBanking/Utils/GoBackCallbackTask;->view:Landroid/webkit/WebView;

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/webkit/WebView;->setTag(Ljava/lang/Object;)V

    goto :goto_0

    .line 59
    :cond_5
    iget-object v1, p0, Lcom/EnterpriseMobileBanking/Utils/GoBackCallbackTask;->view:Landroid/webkit/WebView;

    invoke-virtual {v1}, Landroid/webkit/WebView;->getUrl()Ljava/lang/String;

    move-result-object v1

    const v2, 0x7f0900ee

    invoke-static {v2}, Lcom/EnterpriseMobileBanking/AppHelper;->getAppString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 65
    const/4 v0, 0x0

    .line 66
    iget-object v1, p0, Lcom/EnterpriseMobileBanking/Utils/GoBackCallbackTask;->view:Landroid/webkit/WebView;

    invoke-virtual {v1}, Landroid/webkit/WebView;->goBack()V

    goto/16 :goto_0
.end method
