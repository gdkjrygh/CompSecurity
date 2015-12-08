.class public Lorg/apache/cordova/api/PluginManager;
.super Ljava/lang/Object;
.source "PluginManager.java"


# static fields
.field private static TAG:Ljava/lang/String;


# instance fields
.field private final app:Lorg/apache/cordova/CordovaWebView;

.field private final ctx:Lorg/apache/cordova/api/CordovaInterface;

.field private final entries:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Lorg/apache/cordova/api/PluginEntry;",
            ">;"
        }
    .end annotation
.end field

.field private firstRun:Z

.field protected urlMap:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 47
    const-string v0, "PluginManager"

    sput-object v0, Lorg/apache/cordova/api/PluginManager;->TAG:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lorg/apache/cordova/CordovaWebView;Lorg/apache/cordova/api/CordovaInterface;)V
    .locals 1
    .param p1, "app"    # Lorg/apache/cordova/CordovaWebView;
    .param p2, "ctx"    # Lorg/apache/cordova/api/CordovaInterface;

    .prologue
    .line 68
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 50
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lorg/apache/cordova/api/PluginManager;->entries:Ljava/util/HashMap;

    .line 60
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lorg/apache/cordova/api/PluginManager;->urlMap:Ljava/util/HashMap;

    .line 69
    iput-object p2, p0, Lorg/apache/cordova/api/PluginManager;->ctx:Lorg/apache/cordova/api/CordovaInterface;

    .line 70
    iput-object p1, p0, Lorg/apache/cordova/api/PluginManager;->app:Lorg/apache/cordova/CordovaWebView;

    .line 71
    const/4 v0, 0x1

    iput-boolean v0, p0, Lorg/apache/cordova/api/PluginManager;->firstRun:Z

    .line 72
    return-void
.end method

.method private getPlugin(Ljava/lang/String;)Lorg/apache/cordova/api/CordovaPlugin;
    .locals 4
    .param p1, "service"    # Ljava/lang/String;

    .prologue
    .line 271
    iget-object v2, p0, Lorg/apache/cordova/api/PluginManager;->entries:Ljava/util/HashMap;

    invoke-virtual {v2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/apache/cordova/api/PluginEntry;

    .line 272
    .local v0, "entry":Lorg/apache/cordova/api/PluginEntry;
    if-nez v0, :cond_1

    .line 273
    const/4 v1, 0x0

    .line 279
    :cond_0
    :goto_0
    return-object v1

    .line 275
    :cond_1
    iget-object v1, v0, Lorg/apache/cordova/api/PluginEntry;->plugin:Lorg/apache/cordova/api/CordovaPlugin;

    .line 276
    .local v1, "plugin":Lorg/apache/cordova/api/CordovaPlugin;
    if-nez v1, :cond_0

    .line 277
    iget-object v2, p0, Lorg/apache/cordova/api/PluginManager;->app:Lorg/apache/cordova/CordovaWebView;

    iget-object v3, p0, Lorg/apache/cordova/api/PluginManager;->ctx:Lorg/apache/cordova/api/CordovaInterface;

    invoke-virtual {v0, v2, v3}, Lorg/apache/cordova/api/PluginEntry;->createPlugin(Lorg/apache/cordova/CordovaWebView;Lorg/apache/cordova/api/CordovaInterface;)Lorg/apache/cordova/api/CordovaPlugin;

    move-result-object v1

    goto :goto_0
.end method

.method private pluginConfigurationMissing()V
    .locals 2

    .prologue
    .line 407
    sget-object v0, Lorg/apache/cordova/api/PluginManager;->TAG:Ljava/lang/String;

    const-string v1, "====================================================================================="

    invoke-static {v0, v1}, Lorg/apache/cordova/api/LOG;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 408
    sget-object v0, Lorg/apache/cordova/api/PluginManager;->TAG:Ljava/lang/String;

    const-string v1, "ERROR: plugin.xml is missing.  Add res/xml/plugins.xml to your project."

    invoke-static {v0, v1}, Lorg/apache/cordova/api/LOG;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 409
    sget-object v0, Lorg/apache/cordova/api/PluginManager;->TAG:Ljava/lang/String;

    const-string v1, "https://git-wip-us.apache.org/repos/asf?p=incubator-cordova-android.git;a=blob;f=framework/res/xml/plugins.xml"

    invoke-static {v0, v1}, Lorg/apache/cordova/api/LOG;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 410
    sget-object v0, Lorg/apache/cordova/api/PluginManager;->TAG:Ljava/lang/String;

    const-string v1, "====================================================================================="

    invoke-static {v0, v1}, Lorg/apache/cordova/api/LOG;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 411
    return-void
.end method


# virtual methods
.method public addService(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2
    .param p1, "service"    # Ljava/lang/String;
    .param p2, "className"    # Ljava/lang/String;

    .prologue
    .line 290
    new-instance v0, Lorg/apache/cordova/api/PluginEntry;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p2, v1}, Lorg/apache/cordova/api/PluginEntry;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 291
    .local v0, "entry":Lorg/apache/cordova/api/PluginEntry;
    invoke-virtual {p0, v0}, Lorg/apache/cordova/api/PluginManager;->addService(Lorg/apache/cordova/api/PluginEntry;)V

    .line 292
    return-void
.end method

.method public addService(Lorg/apache/cordova/api/PluginEntry;)V
    .locals 2
    .param p1, "entry"    # Lorg/apache/cordova/api/PluginEntry;

    .prologue
    .line 301
    iget-object v0, p0, Lorg/apache/cordova/api/PluginManager;->entries:Ljava/util/HashMap;

    iget-object v1, p1, Lorg/apache/cordova/api/PluginEntry;->service:Ljava/lang/String;

    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 302
    return-void
.end method

.method public clearPluginObjects()V
    .locals 3

    .prologue
    .line 184
    iget-object v2, p0, Lorg/apache/cordova/api/PluginManager;->entries:Ljava/util/HashMap;

    invoke-virtual {v2}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .local v1, "i$":Ljava/util/Iterator;
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/apache/cordova/api/PluginEntry;

    .line 185
    .local v0, "entry":Lorg/apache/cordova/api/PluginEntry;
    const/4 v2, 0x0

    iput-object v2, v0, Lorg/apache/cordova/api/PluginEntry;->plugin:Lorg/apache/cordova/api/CordovaPlugin;

    goto :goto_0

    .line 187
    .end local v0    # "entry":Lorg/apache/cordova/api/PluginEntry;
    :cond_0
    return-void
.end method

.method public exec(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 10
    .param p1, "service"    # Ljava/lang/String;
    .param p2, "action"    # Ljava/lang/String;
    .param p3, "callbackId"    # Ljava/lang/String;
    .param p4, "rawArgs"    # Ljava/lang/String;

    .prologue
    .line 219
    const-string v6, "exitOnSkinLoader"

    invoke-virtual {p4, v6}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v6

    if-eqz v6, :cond_1

    const-string v6, "true"

    invoke-virtual {p4, v6}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v6

    if-eqz v6, :cond_1

    .line 221
    const-string v6, "true"

    const-string v7, "false"

    invoke-virtual {p4, v6, v7}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p4

    .line 222
    sget-object v6, Lorg/apache/cordova/api/PluginManager;->TAG:Ljava/lang/String;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "rawArgs is now: "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 235
    :cond_0
    :goto_0
    invoke-direct {p0, p1}, Lorg/apache/cordova/api/PluginManager;->getPlugin(Ljava/lang/String;)Lorg/apache/cordova/api/CordovaPlugin;

    move-result-object v4

    .line 236
    .local v4, "plugin":Lorg/apache/cordova/api/CordovaPlugin;
    if-nez v4, :cond_2

    .line 237
    new-instance v1, Lorg/apache/cordova/api/PluginResult;

    sget-object v6, Lorg/apache/cordova/api/PluginResult$Status;->CLASS_NOT_FOUND_EXCEPTION:Lorg/apache/cordova/api/PluginResult$Status;

    invoke-direct {v1, v6}, Lorg/apache/cordova/api/PluginResult;-><init>(Lorg/apache/cordova/api/PluginResult$Status;)V

    .line 238
    .local v1, "cr":Lorg/apache/cordova/api/PluginResult;
    iget-object v6, p0, Lorg/apache/cordova/api/PluginManager;->app:Lorg/apache/cordova/CordovaWebView;

    invoke-virtual {v6, v1, p3}, Lorg/apache/cordova/CordovaWebView;->sendPluginResult(Lorg/apache/cordova/api/PluginResult;Ljava/lang/String;)V

    .line 239
    const/4 v6, 0x1

    .line 253
    .end local v1    # "cr":Lorg/apache/cordova/api/PluginResult;
    :goto_1
    return v6

    .line 223
    .end local v4    # "plugin":Lorg/apache/cordova/api/CordovaPlugin;
    :cond_1
    const-string v6, "loadSkin"

    invoke-virtual {p2, v6}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v6

    if-eqz v6, :cond_0

    .line 224
    const/16 v6, 0x2c

    invoke-virtual {p4, v6}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v3

    .line 225
    .local v3, "loc":I
    const/4 v6, 0x0

    add-int/lit8 v7, v3, 0x1

    invoke-virtual {p4, v6, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v6

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "\""

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->getLobPage()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    const-string v8, "\"]"

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p4

    .line 226
    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->getAppView()Landroid/webkit/WebView;

    move-result-object v6

    new-instance v7, Lorg/apache/cordova/api/PluginManager$1;

    invoke-direct {v7, p0}, Lorg/apache/cordova/api/PluginManager$1;-><init>(Lorg/apache/cordova/api/PluginManager;)V

    const-wide/16 v8, 0x7d0

    invoke-virtual {v6, v7, v8, v9}, Landroid/webkit/WebView;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_0

    .line 242
    .end local v3    # "loc":I
    .restart local v4    # "plugin":Lorg/apache/cordova/api/CordovaPlugin;
    :cond_2
    :try_start_0
    new-instance v0, Lorg/apache/cordova/api/CallbackContext;

    iget-object v6, p0, Lorg/apache/cordova/api/PluginManager;->app:Lorg/apache/cordova/CordovaWebView;

    invoke-direct {v0, p3, v6}, Lorg/apache/cordova/api/CallbackContext;-><init>(Ljava/lang/String;Lorg/apache/cordova/CordovaWebView;)V

    .line 243
    .local v0, "callbackContext":Lorg/apache/cordova/api/CallbackContext;
    invoke-virtual {v4, p2, p4, v0}, Lorg/apache/cordova/api/CordovaPlugin;->execute(Ljava/lang/String;Ljava/lang/String;Lorg/apache/cordova/api/CallbackContext;)Z

    move-result v5

    .line 244
    .local v5, "wasValidAction":Z
    if-nez v5, :cond_3

    .line 245
    new-instance v1, Lorg/apache/cordova/api/PluginResult;

    sget-object v6, Lorg/apache/cordova/api/PluginResult$Status;->INVALID_ACTION:Lorg/apache/cordova/api/PluginResult$Status;

    invoke-direct {v1, v6}, Lorg/apache/cordova/api/PluginResult;-><init>(Lorg/apache/cordova/api/PluginResult$Status;)V

    .line 246
    .restart local v1    # "cr":Lorg/apache/cordova/api/PluginResult;
    iget-object v6, p0, Lorg/apache/cordova/api/PluginManager;->app:Lorg/apache/cordova/CordovaWebView;

    invoke-virtual {v6, v1, p3}, Lorg/apache/cordova/CordovaWebView;->sendPluginResult(Lorg/apache/cordova/api/PluginResult;Ljava/lang/String;)V

    .line 247
    const/4 v6, 0x1

    goto :goto_1

    .line 249
    .end local v1    # "cr":Lorg/apache/cordova/api/PluginResult;
    :cond_3
    invoke-virtual {v0}, Lorg/apache/cordova/api/CallbackContext;->isFinished()Z
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v6

    goto :goto_1

    .line 250
    .end local v0    # "callbackContext":Lorg/apache/cordova/api/CallbackContext;
    .end local v5    # "wasValidAction":Z
    :catch_0
    move-exception v2

    .line 251
    .local v2, "e":Lorg/json/JSONException;
    new-instance v1, Lorg/apache/cordova/api/PluginResult;

    sget-object v6, Lorg/apache/cordova/api/PluginResult$Status;->JSON_EXCEPTION:Lorg/apache/cordova/api/PluginResult$Status;

    invoke-direct {v1, v6}, Lorg/apache/cordova/api/PluginResult;-><init>(Lorg/apache/cordova/api/PluginResult$Status;)V

    .line 252
    .restart local v1    # "cr":Lorg/apache/cordova/api/PluginResult;
    iget-object v6, p0, Lorg/apache/cordova/api/PluginManager;->app:Lorg/apache/cordova/CordovaWebView;

    invoke-virtual {v6, v1, p3}, Lorg/apache/cordova/CordovaWebView;->sendPluginResult(Lorg/apache/cordova/api/PluginResult;Ljava/lang/String;)V

    .line 253
    const/4 v6, 0x1

    goto :goto_1
.end method

.method public exec(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Z
    .locals 1
    .param p1, "service"    # Ljava/lang/String;
    .param p2, "action"    # Ljava/lang/String;
    .param p3, "callbackId"    # Ljava/lang/String;
    .param p4, "jsonArgs"    # Ljava/lang/String;
    .param p5, "async"    # Z
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 259
    invoke-virtual {p0, p1, p2, p3, p4}, Lorg/apache/cordova/api/PluginManager;->exec(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public init()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 78
    sget-object v0, Lorg/apache/cordova/api/PluginManager;->TAG:Ljava/lang/String;

    const-string v1, "init()"

    invoke-static {v0, v1}, Lorg/apache/cordova/api/LOG;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 81
    iget-boolean v0, p0, Lorg/apache/cordova/api/PluginManager;->firstRun:Z

    if-eqz v0, :cond_0

    .line 82
    invoke-virtual {p0}, Lorg/apache/cordova/api/PluginManager;->loadPlugins()V

    .line 83
    iput-boolean v2, p0, Lorg/apache/cordova/api/PluginManager;->firstRun:Z

    .line 94
    :goto_0
    invoke-virtual {p0}, Lorg/apache/cordova/api/PluginManager;->startupPlugins()V

    .line 95
    return-void

    .line 88
    :cond_0
    invoke-virtual {p0, v2}, Lorg/apache/cordova/api/PluginManager;->onPause(Z)V

    .line 89
    invoke-virtual {p0}, Lorg/apache/cordova/api/PluginManager;->onDestroy()V

    .line 90
    invoke-virtual {p0}, Lorg/apache/cordova/api/PluginManager;->clearPluginObjects()V

    goto :goto_0
.end method

.method public loadPlugins()V
    .locals 15

    .prologue
    .line 101
    iget-object v11, p0, Lorg/apache/cordova/api/PluginManager;->ctx:Lorg/apache/cordova/api/CordovaInterface;

    invoke-interface {v11}, Lorg/apache/cordova/api/CordovaInterface;->getActivity()Landroid/app/Activity;

    move-result-object v11

    invoke-virtual {v11}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v11

    const-string v12, "config"

    const-string v13, "xml"

    iget-object v14, p0, Lorg/apache/cordova/api/PluginManager;->ctx:Lorg/apache/cordova/api/CordovaInterface;

    invoke-interface {v14}, Lorg/apache/cordova/api/CordovaInterface;->getActivity()Landroid/app/Activity;

    move-result-object v14

    invoke-virtual {v14}, Landroid/app/Activity;->getPackageName()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v11, v12, v13, v14}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v3

    .line 102
    .local v3, "id":I
    if-nez v3, :cond_0

    .line 104
    iget-object v11, p0, Lorg/apache/cordova/api/PluginManager;->ctx:Lorg/apache/cordova/api/CordovaInterface;

    invoke-interface {v11}, Lorg/apache/cordova/api/CordovaInterface;->getActivity()Landroid/app/Activity;

    move-result-object v11

    invoke-virtual {v11}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v11

    const-string v12, "plugins"

    const-string v13, "xml"

    iget-object v14, p0, Lorg/apache/cordova/api/PluginManager;->ctx:Lorg/apache/cordova/api/CordovaInterface;

    invoke-interface {v14}, Lorg/apache/cordova/api/CordovaInterface;->getActivity()Landroid/app/Activity;

    move-result-object v14

    invoke-virtual {v14}, Landroid/app/Activity;->getPackageName()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v11, v12, v13, v14}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v3

    .line 105
    sget-object v11, Lorg/apache/cordova/api/PluginManager;->TAG:Ljava/lang/String;

    const-string v12, "Using plugins.xml instead of config.xml.  plugins.xml will eventually be deprecated"

    invoke-static {v11, v12}, Lorg/apache/cordova/api/LOG;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 107
    :cond_0
    if-nez v3, :cond_2

    .line 108
    invoke-direct {p0}, Lorg/apache/cordova/api/PluginManager;->pluginConfigurationMissing()V

    .line 178
    :cond_1
    return-void

    .line 112
    :cond_2
    iget-object v11, p0, Lorg/apache/cordova/api/PluginManager;->ctx:Lorg/apache/cordova/api/CordovaInterface;

    invoke-interface {v11}, Lorg/apache/cordova/api/CordovaInterface;->getActivity()Landroid/app/Activity;

    move-result-object v11

    invoke-virtual {v11}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v11

    invoke-virtual {v11, v3}, Landroid/content/res/Resources;->getXml(I)Landroid/content/res/XmlResourceParser;

    move-result-object v10

    .line 113
    .local v10, "xml":Landroid/content/res/XmlResourceParser;
    const/4 v2, -0x1

    .line 114
    .local v2, "eventType":I
    const-string v8, ""

    .local v8, "service":Ljava/lang/String;
    const-string v7, ""

    .local v7, "pluginClass":Ljava/lang/String;
    const-string v6, ""

    .line 115
    .local v6, "paramType":Ljava/lang/String;
    const/4 v5, 0x0

    .line 116
    .local v5, "onload":Z
    const/4 v1, 0x0

    .line 117
    .local v1, "entry":Lorg/apache/cordova/api/PluginEntry;
    const/4 v4, 0x0

    .line 118
    .local v4, "insideFeature":Z
    :goto_0
    const/4 v11, 0x1

    if-eq v2, v11, :cond_1

    .line 119
    const/4 v11, 0x2

    if-ne v2, v11, :cond_9

    .line 120
    invoke-interface {v10}, Landroid/content/res/XmlResourceParser;->getName()Ljava/lang/String;

    move-result-object v9

    .line 122
    .local v9, "strNode":Ljava/lang/String;
    const-string v11, "plugin"

    invoke-virtual {v9, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_4

    .line 123
    const/4 v11, 0x0

    const-string v12, "name"

    invoke-interface {v10, v11, v12}, Landroid/content/res/XmlResourceParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 124
    const/4 v11, 0x0

    const-string v12, "value"

    invoke-interface {v10, v11, v12}, Landroid/content/res/XmlResourceParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 126
    const-string v11, "true"

    const/4 v12, 0x0

    const-string v13, "onload"

    invoke-interface {v10, v12, v13}, Landroid/content/res/XmlResourceParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    .line 127
    new-instance v1, Lorg/apache/cordova/api/PluginEntry;

    .end local v1    # "entry":Lorg/apache/cordova/api/PluginEntry;
    invoke-direct {v1, v8, v7, v5}, Lorg/apache/cordova/api/PluginEntry;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 128
    .restart local v1    # "entry":Lorg/apache/cordova/api/PluginEntry;
    invoke-virtual {p0, v1}, Lorg/apache/cordova/api/PluginManager;->addService(Lorg/apache/cordova/api/PluginEntry;)V

    .line 171
    .end local v9    # "strNode":Ljava/lang/String;
    :cond_3
    :goto_1
    :try_start_0
    invoke-interface {v10}, Landroid/content/res/XmlResourceParser;->next()I
    :try_end_0
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    move-result v2

    goto :goto_0

    .line 131
    .restart local v9    # "strNode":Ljava/lang/String;
    :cond_4
    const-string v11, "url-filter"

    invoke-virtual {v9, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_5

    .line 132
    iget-object v11, p0, Lorg/apache/cordova/api/PluginManager;->urlMap:Ljava/util/HashMap;

    const/4 v12, 0x0

    const-string v13, "value"

    invoke-interface {v10, v12, v13}, Landroid/content/res/XmlResourceParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v11, v12, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 134
    :cond_5
    const-string v11, "feature"

    invoke-virtual {v9, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_6

    .line 135
    const/4 v4, 0x1

    .line 138
    const/4 v11, 0x0

    const-string v12, "name"

    invoke-interface {v10, v11, v12}, Landroid/content/res/XmlResourceParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    goto :goto_1

    .line 140
    :cond_6
    const-string v11, "param"

    invoke-virtual {v9, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_3

    .line 141
    if-eqz v4, :cond_3

    .line 143
    const/4 v11, 0x0

    const-string v12, "name"

    invoke-interface {v10, v11, v12}, Landroid/content/res/XmlResourceParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 144
    const-string v11, "service"

    invoke-virtual {v6, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_8

    .line 145
    const/4 v11, 0x0

    const-string v12, "value"

    invoke-interface {v10, v11, v12}, Landroid/content/res/XmlResourceParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 148
    :cond_7
    :goto_2
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v11

    if-lez v11, :cond_3

    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v11

    if-lez v11, :cond_3

    .line 150
    const-string v11, "true"

    const/4 v12, 0x0

    const-string v13, "onload"

    invoke-interface {v10, v12, v13}, Landroid/content/res/XmlResourceParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    .line 151
    new-instance v1, Lorg/apache/cordova/api/PluginEntry;

    .end local v1    # "entry":Lorg/apache/cordova/api/PluginEntry;
    invoke-direct {v1, v8, v7, v5}, Lorg/apache/cordova/api/PluginEntry;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 152
    .restart local v1    # "entry":Lorg/apache/cordova/api/PluginEntry;
    invoke-virtual {p0, v1}, Lorg/apache/cordova/api/PluginManager;->addService(Lorg/apache/cordova/api/PluginEntry;)V

    .line 153
    const-string v8, ""

    .line 154
    const-string v7, ""

    goto :goto_1

    .line 146
    :cond_8
    const-string v11, "package"

    invoke-virtual {v6, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_7

    .line 147
    const/4 v11, 0x0

    const-string v12, "value"

    invoke-interface {v10, v11, v12}, Landroid/content/res/XmlResourceParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    goto :goto_2

    .line 159
    .end local v9    # "strNode":Ljava/lang/String;
    :cond_9
    const/4 v11, 0x3

    if-ne v2, v11, :cond_3

    .line 161
    invoke-interface {v10}, Landroid/content/res/XmlResourceParser;->getName()Ljava/lang/String;

    move-result-object v9

    .line 162
    .restart local v9    # "strNode":Ljava/lang/String;
    const-string v11, "feature"

    invoke-virtual {v9, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_3

    .line 165
    const-string v8, ""

    .line 166
    const-string v7, ""

    .line 167
    const/4 v4, 0x0

    goto/16 :goto_1

    .line 172
    .end local v9    # "strNode":Ljava/lang/String;
    :catch_0
    move-exception v0

    .line 173
    .local v0, "e":Lorg/xmlpull/v1/XmlPullParserException;
    invoke-virtual {v0}, Lorg/xmlpull/v1/XmlPullParserException;->printStackTrace()V

    goto/16 :goto_0

    .line 174
    .end local v0    # "e":Lorg/xmlpull/v1/XmlPullParserException;
    :catch_1
    move-exception v0

    .line 175
    .local v0, "e":Ljava/io/IOException;
    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    goto/16 :goto_0
.end method

.method public onDestroy()V
    .locals 3

    .prologue
    .line 334
    iget-object v2, p0, Lorg/apache/cordova/api/PluginManager;->entries:Ljava/util/HashMap;

    invoke-virtual {v2}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .local v1, "i$":Ljava/util/Iterator;
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/apache/cordova/api/PluginEntry;

    .line 335
    .local v0, "entry":Lorg/apache/cordova/api/PluginEntry;
    iget-object v2, v0, Lorg/apache/cordova/api/PluginEntry;->plugin:Lorg/apache/cordova/api/CordovaPlugin;

    if-eqz v2, :cond_0

    .line 336
    iget-object v2, v0, Lorg/apache/cordova/api/PluginEntry;->plugin:Lorg/apache/cordova/api/CordovaPlugin;

    invoke-virtual {v2}, Lorg/apache/cordova/api/CordovaPlugin;->onDestroy()V

    goto :goto_0

    .line 339
    .end local v0    # "entry":Lorg/apache/cordova/api/PluginEntry;
    :cond_1
    return-void
.end method

.method public onNewIntent(Landroid/content/Intent;)V
    .locals 3
    .param p1, "intent"    # Landroid/content/Intent;

    .prologue
    .line 368
    iget-object v2, p0, Lorg/apache/cordova/api/PluginManager;->entries:Ljava/util/HashMap;

    invoke-virtual {v2}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .local v1, "i$":Ljava/util/Iterator;
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/apache/cordova/api/PluginEntry;

    .line 369
    .local v0, "entry":Lorg/apache/cordova/api/PluginEntry;
    iget-object v2, v0, Lorg/apache/cordova/api/PluginEntry;->plugin:Lorg/apache/cordova/api/CordovaPlugin;

    if-eqz v2, :cond_0

    .line 370
    iget-object v2, v0, Lorg/apache/cordova/api/PluginEntry;->plugin:Lorg/apache/cordova/api/CordovaPlugin;

    invoke-virtual {v2, p1}, Lorg/apache/cordova/api/CordovaPlugin;->onNewIntent(Landroid/content/Intent;)V

    goto :goto_0

    .line 373
    .end local v0    # "entry":Lorg/apache/cordova/api/PluginEntry;
    :cond_1
    return-void
.end method

.method public onOverrideUrlLoading(Ljava/lang/String;)Z
    .locals 3
    .param p1, "url"    # Ljava/lang/String;

    .prologue
    .line 382
    iget-object v2, p0, Lorg/apache/cordova/api/PluginManager;->urlMap:Ljava/util/HashMap;

    invoke-virtual {v2}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .line 383
    .local v0, "it":Ljava/util/Iterator;, "Ljava/util/Iterator<Ljava/util/Map$Entry<Ljava/lang/String;Ljava/lang/String;>;>;"
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 384
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 385
    .local v1, "pairs":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Ljava/lang/String;>;"
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {p1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 386
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-direct {p0, v2}, Lorg/apache/cordova/api/PluginManager;->getPlugin(Ljava/lang/String;)Lorg/apache/cordova/api/CordovaPlugin;

    move-result-object v2

    invoke-virtual {v2, p1}, Lorg/apache/cordova/api/CordovaPlugin;->onOverrideUrlLoading(Ljava/lang/String;)Z

    move-result v2

    .line 389
    .end local v1    # "pairs":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Ljava/lang/String;>;"
    :goto_0
    return v2

    :cond_1
    const/4 v2, 0x0

    goto :goto_0
.end method

.method public onPause(Z)V
    .locals 3
    .param p1, "multitasking"    # Z

    .prologue
    .line 310
    iget-object v2, p0, Lorg/apache/cordova/api/PluginManager;->entries:Ljava/util/HashMap;

    invoke-virtual {v2}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .local v1, "i$":Ljava/util/Iterator;
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/apache/cordova/api/PluginEntry;

    .line 311
    .local v0, "entry":Lorg/apache/cordova/api/PluginEntry;
    iget-object v2, v0, Lorg/apache/cordova/api/PluginEntry;->plugin:Lorg/apache/cordova/api/CordovaPlugin;

    if-eqz v2, :cond_0

    .line 312
    iget-object v2, v0, Lorg/apache/cordova/api/PluginEntry;->plugin:Lorg/apache/cordova/api/CordovaPlugin;

    invoke-virtual {v2, p1}, Lorg/apache/cordova/api/CordovaPlugin;->onPause(Z)V

    goto :goto_0

    .line 315
    .end local v0    # "entry":Lorg/apache/cordova/api/PluginEntry;
    :cond_1
    return-void
.end method

.method public onReset()V
    .locals 3

    .prologue
    .line 396
    iget-object v2, p0, Lorg/apache/cordova/api/PluginManager;->entries:Ljava/util/HashMap;

    invoke-virtual {v2}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .line 397
    .local v0, "it":Ljava/util/Iterator;, "Ljava/util/Iterator<Lorg/apache/cordova/api/PluginEntry;>;"
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 398
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lorg/apache/cordova/api/PluginEntry;

    iget-object v1, v2, Lorg/apache/cordova/api/PluginEntry;->plugin:Lorg/apache/cordova/api/CordovaPlugin;

    .line 399
    .local v1, "plugin":Lorg/apache/cordova/api/CordovaPlugin;
    if-eqz v1, :cond_0

    .line 400
    invoke-virtual {v1}, Lorg/apache/cordova/api/CordovaPlugin;->onReset()V

    goto :goto_0

    .line 403
    .end local v1    # "plugin":Lorg/apache/cordova/api/CordovaPlugin;
    :cond_1
    return-void
.end method

.method public onResume(Z)V
    .locals 3
    .param p1, "multitasking"    # Z

    .prologue
    .line 323
    iget-object v2, p0, Lorg/apache/cordova/api/PluginManager;->entries:Ljava/util/HashMap;

    invoke-virtual {v2}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .local v1, "i$":Ljava/util/Iterator;
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/apache/cordova/api/PluginEntry;

    .line 324
    .local v0, "entry":Lorg/apache/cordova/api/PluginEntry;
    iget-object v2, v0, Lorg/apache/cordova/api/PluginEntry;->plugin:Lorg/apache/cordova/api/CordovaPlugin;

    if-eqz v2, :cond_0

    .line 325
    iget-object v2, v0, Lorg/apache/cordova/api/PluginEntry;->plugin:Lorg/apache/cordova/api/CordovaPlugin;

    invoke-virtual {v2, p1}, Lorg/apache/cordova/api/CordovaPlugin;->onResume(Z)V

    goto :goto_0

    .line 328
    .end local v0    # "entry":Lorg/apache/cordova/api/PluginEntry;
    :cond_1
    return-void
.end method

.method public postMessage(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4
    .param p1, "id"    # Ljava/lang/String;
    .param p2, "data"    # Ljava/lang/Object;

    .prologue
    .line 349
    iget-object v3, p0, Lorg/apache/cordova/api/PluginManager;->ctx:Lorg/apache/cordova/api/CordovaInterface;

    invoke-interface {v3, p1, p2}, Lorg/apache/cordova/api/CordovaInterface;->onMessage(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    .line 350
    .local v2, "obj":Ljava/lang/Object;
    if-eqz v2, :cond_0

    move-object v3, v2

    .line 361
    :goto_0
    return-object v3

    .line 353
    :cond_0
    iget-object v3, p0, Lorg/apache/cordova/api/PluginManager;->entries:Ljava/util/HashMap;

    invoke-virtual {v3}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .local v1, "i$":Ljava/util/Iterator;
    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/apache/cordova/api/PluginEntry;

    .line 354
    .local v0, "entry":Lorg/apache/cordova/api/PluginEntry;
    iget-object v3, v0, Lorg/apache/cordova/api/PluginEntry;->plugin:Lorg/apache/cordova/api/CordovaPlugin;

    if-eqz v3, :cond_1

    .line 355
    iget-object v3, v0, Lorg/apache/cordova/api/PluginEntry;->plugin:Lorg/apache/cordova/api/CordovaPlugin;

    invoke-virtual {v3, p1, p2}, Lorg/apache/cordova/api/CordovaPlugin;->onMessage(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    .line 356
    if-eqz v2, :cond_1

    move-object v3, v2

    .line 357
    goto :goto_0

    .line 361
    .end local v0    # "entry":Lorg/apache/cordova/api/PluginEntry;
    :cond_2
    const/4 v3, 0x0

    goto :goto_0
.end method

.method public startupPlugins()V
    .locals 4

    .prologue
    .line 193
    iget-object v2, p0, Lorg/apache/cordova/api/PluginManager;->entries:Ljava/util/HashMap;

    invoke-virtual {v2}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .local v1, "i$":Ljava/util/Iterator;
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/apache/cordova/api/PluginEntry;

    .line 194
    .local v0, "entry":Lorg/apache/cordova/api/PluginEntry;
    iget-boolean v2, v0, Lorg/apache/cordova/api/PluginEntry;->onload:Z

    if-eqz v2, :cond_0

    .line 195
    iget-object v2, p0, Lorg/apache/cordova/api/PluginManager;->app:Lorg/apache/cordova/CordovaWebView;

    iget-object v3, p0, Lorg/apache/cordova/api/PluginManager;->ctx:Lorg/apache/cordova/api/CordovaInterface;

    invoke-virtual {v0, v2, v3}, Lorg/apache/cordova/api/PluginEntry;->createPlugin(Lorg/apache/cordova/CordovaWebView;Lorg/apache/cordova/api/CordovaInterface;)Lorg/apache/cordova/api/CordovaPlugin;

    goto :goto_0

    .line 198
    .end local v0    # "entry":Lorg/apache/cordova/api/PluginEntry;
    :cond_1
    return-void
.end method
