.class public Lcom/EnterpriseMobileBanking/Utils/CloseCallbackTask;
.super Lcom/EnterpriseMobileBanking/Utils/CallbackTask;
.source "CloseCallbackTask.java"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field public static final CAPITALONE_360_LOB:I = 0x7f080081

.field public static final CAPITALONE_BANK_LOB:I = 0x7f080080

.field public static final CAPITALONE_CARD_LOB:I = 0x7f08007f

.field private static final TAG:Ljava/lang/String; = "CloseCBT"

.field private static final actions:[Ljava/lang/String;


# instance fields
.field private view:Landroid/webkit/WebView;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 22
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "closeInnerWebView"

    aput-object v2, v0, v1

    sput-object v0, Lcom/EnterpriseMobileBanking/Utils/CloseCallbackTask;->actions:[Ljava/lang/String;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .prologue
    .line 29
    invoke-direct {p0}, Lcom/EnterpriseMobileBanking/Utils/CallbackTask;-><init>()V

    .line 26
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/EnterpriseMobileBanking/Utils/CloseCallbackTask;->view:Landroid/webkit/WebView;

    .line 30
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;Lorg/json/JSONArray;Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;)V
    .locals 1
    .param p1, "callbackId"    # Ljava/lang/String;
    .param p2, "parameters"    # Lorg/json/JSONArray;
    .param p3, "appLink"    # Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;

    .prologue
    .line 33
    invoke-direct {p0, p1, p2, p3}, Lcom/EnterpriseMobileBanking/Utils/CallbackTask;-><init>(Ljava/lang/String;Lorg/json/JSONArray;Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;)V

    .line 26
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/EnterpriseMobileBanking/Utils/CloseCallbackTask;->view:Landroid/webkit/WebView;

    .line 34
    return-void
.end method

.method public static load()V
    .locals 3

    .prologue
    .line 38
    const-string v0, "CloseCBT"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Adding "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    sget-object v2, Lcom/EnterpriseMobileBanking/Utils/CloseCallbackTask;->actions:[Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 39
    new-instance v0, Lcom/EnterpriseMobileBanking/Utils/CloseCallbackTask;

    invoke-direct {v0}, Lcom/EnterpriseMobileBanking/Utils/CloseCallbackTask;-><init>()V

    sget-object v1, Lcom/EnterpriseMobileBanking/Utils/CloseCallbackTask;->actions:[Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/EnterpriseMobileBanking/Utils/CallbackTaskFactory;->addCallbackTask(Lcom/EnterpriseMobileBanking/Utils/CallbackTask;[Ljava/lang/String;)V

    .line 40
    return-void
.end method


# virtual methods
.method public create(Ljava/lang/String;Lorg/json/JSONArray;Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;)Lcom/EnterpriseMobileBanking/Utils/CallbackTask;
    .locals 3
    .param p1, "callbackId"    # Ljava/lang/String;
    .param p2, "parameters"    # Lorg/json/JSONArray;
    .param p3, "appLink"    # Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;

    .prologue
    .line 111
    const-string v0, "CloseCBT"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Create: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 113
    new-instance v0, Lcom/EnterpriseMobileBanking/Utils/CloseCallbackTask;

    invoke-direct {v0, p1, p2, p3}, Lcom/EnterpriseMobileBanking/Utils/CloseCallbackTask;-><init>(Ljava/lang/String;Lorg/json/JSONArray;Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;)V

    return-object v0
.end method

.method public execute(Landroid/webkit/WebView;)V
    .locals 5
    .param p1, "view"    # Landroid/webkit/WebView;

    .prologue
    .line 76
    const-string v1, "CloseCBT"

    const-string v2, "Executing"

    invoke-static {v1, v2}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 79
    if-eqz p1, :cond_0

    iget-object v1, p0, Lcom/EnterpriseMobileBanking/Utils/CloseCallbackTask;->callbackId:Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 81
    iput-object p1, p0, Lcom/EnterpriseMobileBanking/Utils/CloseCallbackTask;->view:Landroid/webkit/WebView;

    .line 83
    iget-object v2, p0, Lcom/EnterpriseMobileBanking/Utils/CloseCallbackTask;->view:Landroid/webkit/WebView;

    monitor-enter v2

    .line 86
    :try_start_0
    invoke-virtual {p1}, Landroid/webkit/WebView;->getHandler()Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v1, p0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 90
    :try_start_1
    const-string v1, "CloseCBT"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Waiting for VIEW: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, p0, Lcom/EnterpriseMobileBanking/Utils/CloseCallbackTask;->callbackId:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 92
    invoke-virtual {p1}, Ljava/lang/Object;->wait()V

    .line 94
    const-string v1, "CloseCBT"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "View done: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, p0, Lcom/EnterpriseMobileBanking/Utils/CloseCallbackTask;->callbackId:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 97
    iget-object v1, p0, Lcom/EnterpriseMobileBanking/Utils/CloseCallbackTask;->appLink:Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;

    sget-object v3, Lorg/apache/cordova/api/PluginResult$Status;->OK:Lorg/apache/cordova/api/PluginResult$Status;

    invoke-virtual {v1, v3, p0}, Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;->sendPluginResult(Lorg/apache/cordova/api/PluginResult$Status;Lcom/EnterpriseMobileBanking/Utils/CallbackTask;)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 101
    :goto_0
    :try_start_2
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 102
    const/4 v1, 0x0

    iput-object v1, p0, Lcom/EnterpriseMobileBanking/Utils/CloseCallbackTask;->view:Landroid/webkit/WebView;

    .line 106
    :goto_1
    return-void

    .line 98
    :catch_0
    move-exception v0

    .line 99
    .local v0, "e":Ljava/lang/InterruptedException;
    :try_start_3
    iget-object v1, p0, Lcom/EnterpriseMobileBanking/Utils/CloseCallbackTask;->appLink:Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;

    sget-object v3, Lorg/apache/cordova/api/PluginResult$Status;->ERROR:Lorg/apache/cordova/api/PluginResult$Status;

    invoke-virtual {v1, v3, p0}, Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;->sendPluginResult(Lorg/apache/cordova/api/PluginResult$Status;Lcom/EnterpriseMobileBanking/Utils/CallbackTask;)V

    goto :goto_0

    .line 101
    .end local v0    # "e":Ljava/lang/InterruptedException;
    :catchall_0
    move-exception v1

    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v1

    .line 104
    :cond_0
    iget-object v1, p0, Lcom/EnterpriseMobileBanking/Utils/CloseCallbackTask;->appLink:Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;

    sget-object v2, Lorg/apache/cordova/api/PluginResult$Status;->OK:Lorg/apache/cordova/api/PluginResult$Status;

    invoke-virtual {v1, v2, p0}, Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;->sendPluginResult(Lorg/apache/cordova/api/PluginResult$Status;Lcom/EnterpriseMobileBanking/Utils/CallbackTask;)V

    goto :goto_1
.end method

.method public run()V
    .locals 3

    .prologue
    .line 43
    iget-object v1, p0, Lcom/EnterpriseMobileBanking/Utils/CloseCallbackTask;->view:Landroid/webkit/WebView;

    monitor-enter v1

    .line 45
    :try_start_0
    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->getLastLob()I

    move-result v0

    const v2, 0x7f080081

    if-eq v0, v2, :cond_0

    .line 46
    const-string v0, "CloseCBT"

    const-string v2, "Stopping view  "

    invoke-static {v0, v2}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 47
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/Utils/CloseCallbackTask;->view:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->stopLoading()V

    .line 48
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/Utils/CloseCallbackTask;->view:Landroid/webkit/WebView;

    const-string v2, "about:blank"

    invoke-virtual {v0, v2}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 50
    :cond_0
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/Utils/CloseCallbackTask;->view:Landroid/webkit/WebView;

    const/16 v2, 0x8

    invoke-virtual {v0, v2}, Landroid/webkit/WebView;->setVisibility(I)V

    .line 51
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/Utils/CloseCallbackTask;->view:Landroid/webkit/WebView;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Landroid/webkit/WebView;->setEnabled(Z)V

    .line 58
    const-string v0, "CloseCBT"

    const-string v2, "Resetting Touch listener"

    invoke-static {v0, v2}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 60
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/Utils/CloseCallbackTask;->view:Landroid/webkit/WebView;

    new-instance v2, Lcom/EnterpriseMobileBanking/Utils/CloseCallbackTask$1;

    invoke-direct {v2, p0}, Lcom/EnterpriseMobileBanking/Utils/CloseCallbackTask$1;-><init>(Lcom/EnterpriseMobileBanking/Utils/CloseCallbackTask;)V

    invoke-virtual {v0, v2}, Landroid/webkit/WebView;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 68
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/Utils/CloseCallbackTask;->view:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->clearHistory()V

    .line 70
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/Utils/CloseCallbackTask;->view:Landroid/webkit/WebView;

    invoke-virtual {v0}, Ljava/lang/Object;->notify()V

    .line 71
    monitor-exit v1

    .line 72
    return-void

    .line 71
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
