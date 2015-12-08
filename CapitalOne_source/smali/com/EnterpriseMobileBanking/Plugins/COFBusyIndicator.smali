.class public Lcom/EnterpriseMobileBanking/Plugins/COFBusyIndicator;
.super Lorg/apache/cordova/api/Plugin;
.source "COFBusyIndicator.java"

# interfaces
.implements Lcom/EnterpriseMobileBanking/Plugins/BusyIndicatorCallback;


# static fields
.field private static final TAG:Ljava/lang/String; = "COFBusyIndicator"

.field private static final _Lock:Ljava/lang/Object;

.field private static volatile busy:Lcom/EnterpriseMobileBanking/Plugins/COFBusy;


# instance fields
.field private currentCallbackId:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 22
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/EnterpriseMobileBanking/Plugins/COFBusyIndicator;->_Lock:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 17
    invoke-direct {p0}, Lorg/apache/cordova/api/Plugin;-><init>()V

    return-void
.end method

.method private cancelledBusy()V
    .locals 4

    .prologue
    .line 93
    const-string v1, "COFBusyIndicator"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "cancelledBusy callback for id: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/EnterpriseMobileBanking/Plugins/COFBusyIndicator;->currentCallbackId:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 94
    iget-object v1, p0, Lcom/EnterpriseMobileBanking/Plugins/COFBusyIndicator;->currentCallbackId:Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 96
    new-instance v0, Lorg/apache/cordova/api/PluginResult;

    sget-object v1, Lorg/apache/cordova/api/PluginResult$Status;->OK:Lorg/apache/cordova/api/PluginResult$Status;

    const-string v2, "canceled"

    invoke-direct {v0, v1, v2}, Lorg/apache/cordova/api/PluginResult;-><init>(Lorg/apache/cordova/api/PluginResult$Status;Ljava/lang/String;)V

    .line 97
    .local v0, "result":Lorg/apache/cordova/api/PluginResult;
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lorg/apache/cordova/api/PluginResult;->setKeepCallback(Z)V

    .line 98
    iget-object v1, p0, Lcom/EnterpriseMobileBanking/Plugins/COFBusyIndicator;->currentCallbackId:Ljava/lang/String;

    invoke-virtual {p0, v0, v1}, Lcom/EnterpriseMobileBanking/Plugins/COFBusyIndicator;->success(Lorg/apache/cordova/api/PluginResult;Ljava/lang/String;)V

    .line 100
    .end local v0    # "result":Lorg/apache/cordova/api/PluginResult;
    :cond_0
    return-void
.end method

.method public static getBusy()Lcom/EnterpriseMobileBanking/Plugins/COFBusy;
    .locals 2

    .prologue
    .line 32
    sget-object v1, Lcom/EnterpriseMobileBanking/Plugins/COFBusyIndicator;->_Lock:Ljava/lang/Object;

    monitor-enter v1

    .line 33
    :try_start_0
    sget-object v0, Lcom/EnterpriseMobileBanking/Plugins/COFBusyIndicator;->busy:Lcom/EnterpriseMobileBanking/Plugins/COFBusy;

    monitor-exit v1

    return-object v0

    .line 34
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public static setBusy(Lcom/EnterpriseMobileBanking/Plugins/COFBusy;)V
    .locals 2
    .param p0, "spinner"    # Lcom/EnterpriseMobileBanking/Plugins/COFBusy;

    .prologue
    .line 38
    sget-object v1, Lcom/EnterpriseMobileBanking/Plugins/COFBusyIndicator;->_Lock:Ljava/lang/Object;

    monitor-enter v1

    .line 39
    :try_start_0
    sput-object p0, Lcom/EnterpriseMobileBanking/Plugins/COFBusyIndicator;->busy:Lcom/EnterpriseMobileBanking/Plugins/COFBusy;

    .line 40
    monitor-exit v1

    .line 41
    return-void

    .line 40
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method private success()V
    .locals 4

    .prologue
    .line 82
    const-string v1, "COFBusyIndicator"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "success callback for id: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/EnterpriseMobileBanking/Plugins/COFBusyIndicator;->currentCallbackId:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 83
    iget-object v1, p0, Lcom/EnterpriseMobileBanking/Plugins/COFBusyIndicator;->currentCallbackId:Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 85
    new-instance v0, Lorg/apache/cordova/api/PluginResult;

    sget-object v1, Lorg/apache/cordova/api/PluginResult$Status;->OK:Lorg/apache/cordova/api/PluginResult$Status;

    const-string v2, "ok"

    invoke-direct {v0, v1, v2}, Lorg/apache/cordova/api/PluginResult;-><init>(Lorg/apache/cordova/api/PluginResult$Status;Ljava/lang/String;)V

    .line 86
    .local v0, "result":Lorg/apache/cordova/api/PluginResult;
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lorg/apache/cordova/api/PluginResult;->setKeepCallback(Z)V

    .line 87
    iget-object v1, p0, Lcom/EnterpriseMobileBanking/Plugins/COFBusyIndicator;->currentCallbackId:Ljava/lang/String;

    invoke-virtual {p0, v0, v1}, Lcom/EnterpriseMobileBanking/Plugins/COFBusyIndicator;->success(Lorg/apache/cordova/api/PluginResult;Ljava/lang/String;)V

    .line 89
    .end local v0    # "result":Lorg/apache/cordova/api/PluginResult;
    :cond_0
    return-void
.end method


# virtual methods
.method public callbackCall()V
    .locals 0

    .prologue
    .line 105
    invoke-direct {p0}, Lcom/EnterpriseMobileBanking/Plugins/COFBusyIndicator;->cancelledBusy()V

    .line 106
    return-void
.end method

.method public execute(Ljava/lang/String;Lorg/json/JSONArray;Ljava/lang/String;)Lorg/apache/cordova/api/PluginResult;
    .locals 7
    .param p1, "action"    # Ljava/lang/String;
    .param p2, "args"    # Lorg/json/JSONArray;
    .param p3, "callbackId"    # Ljava/lang/String;

    .prologue
    const/4 v5, 0x1

    .line 48
    const-string v0, "COFBusyIndicator"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "execute() : action: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 50
    new-instance v6, Lorg/apache/cordova/api/PluginResult;

    sget-object v0, Lorg/apache/cordova/api/PluginResult$Status;->OK:Lorg/apache/cordova/api/PluginResult$Status;

    invoke-direct {v6, v0}, Lorg/apache/cordova/api/PluginResult;-><init>(Lorg/apache/cordova/api/PluginResult$Status;)V

    .line 52
    .local v6, "result":Lorg/apache/cordova/api/PluginResult;
    const-string v0, "show"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 54
    iput-object p3, p0, Lcom/EnterpriseMobileBanking/Plugins/COFBusyIndicator;->currentCallbackId:Ljava/lang/String;

    .line 56
    sget-object v0, Lcom/EnterpriseMobileBanking/Plugins/COFBusyIndicator;->busy:Lcom/EnterpriseMobileBanking/Plugins/COFBusy;

    if-nez v0, :cond_1

    .line 59
    new-instance v0, Lcom/EnterpriseMobileBanking/Plugins/COFBusy;

    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->getApplicationLink()Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    move-result-object v1

    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->getAppView()Landroid/webkit/WebView;

    move-result-object v2

    move-object v3, p2

    move-object v4, p0

    invoke-direct/range {v0 .. v5}, Lcom/EnterpriseMobileBanking/Plugins/COFBusy;-><init>(Landroid/app/Activity;Landroid/view/View;Lorg/json/JSONArray;Lcom/EnterpriseMobileBanking/Plugins/BusyIndicatorCallback;Z)V

    sput-object v0, Lcom/EnterpriseMobileBanking/Plugins/COFBusyIndicator;->busy:Lcom/EnterpriseMobileBanking/Plugins/COFBusy;

    .line 66
    :goto_0
    new-instance v6, Lorg/apache/cordova/api/PluginResult;

    .end local v6    # "result":Lorg/apache/cordova/api/PluginResult;
    sget-object v0, Lorg/apache/cordova/api/PluginResult$Status;->NO_RESULT:Lorg/apache/cordova/api/PluginResult$Status;

    const-string v1, "PluginResult :: waiting"

    invoke-direct {v6, v0, v1}, Lorg/apache/cordova/api/PluginResult;-><init>(Lorg/apache/cordova/api/PluginResult$Status;Ljava/lang/String;)V

    .line 67
    .restart local v6    # "result":Lorg/apache/cordova/api/PluginResult;
    invoke-virtual {v6, v5}, Lorg/apache/cordova/api/PluginResult;->setKeepCallback(Z)V

    .line 77
    :cond_0
    :goto_1
    return-object v6

    .line 64
    :cond_1
    sget-object v0, Lcom/EnterpriseMobileBanking/Plugins/COFBusyIndicator;->busy:Lcom/EnterpriseMobileBanking/Plugins/COFBusy;

    invoke-virtual {v0, p2, p0}, Lcom/EnterpriseMobileBanking/Plugins/COFBusy;->show(Lorg/json/JSONArray;Lcom/EnterpriseMobileBanking/Plugins/BusyIndicatorCallback;)V

    goto :goto_0

    .line 69
    :cond_2
    const-string v0, "hide"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 71
    sget-object v0, Lcom/EnterpriseMobileBanking/Plugins/COFBusyIndicator;->busy:Lcom/EnterpriseMobileBanking/Plugins/COFBusy;

    if-eqz v0, :cond_0

    .line 73
    sget-object v0, Lcom/EnterpriseMobileBanking/Plugins/COFBusyIndicator;->busy:Lcom/EnterpriseMobileBanking/Plugins/COFBusy;

    invoke-virtual {v0}, Lcom/EnterpriseMobileBanking/Plugins/COFBusy;->hide()V

    .line 74
    invoke-direct {p0}, Lcom/EnterpriseMobileBanking/Plugins/COFBusyIndicator;->success()V

    goto :goto_1
.end method
