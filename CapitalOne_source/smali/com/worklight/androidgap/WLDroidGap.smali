.class public Lcom/worklight/androidgap/WLDroidGap;
.super Lorg/apache/cordova/DroidGap;
.source "WLDroidGap.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/worklight/androidgap/WLDroidGap$PrepackagedAssetsManager;
    }
.end annotation


# static fields
.field private static final CLEAR_CACHE_NEXT_LOAD:Ljava/lang/String; = "com.worklight.clearCacheNextLoad"

.field private static final ENABLE_SETTINGS_FLAG:Ljava/lang/String; = "enableSettings"

.field public static final EXIT_ON_SKIN_LOADER:Ljava/lang/String; = "exitOnSkinLoader"

.field private static final NATIVE_EMPTY_APP_HTML:Ljava/lang/String; = "NativeEmptyApp.html"

.field public static final RESOURCES_CHECKSUM_PREF_KEY:Ljava/lang/String; = "wlResourcesChecksum"

.field public static final SKIN_LOADER_HTML:Ljava/lang/String; = "skinLoader.html"

.field public static final SKIN_NAME_PREF_KEY:Ljava/lang/String; = "wlSkinName"

.field public static final WL_DEFAULT_SERVER_URL:Ljava/lang/String; = "WLDefaultServerURL"

.field private static isForegound:Z

.field private static wlConfig:Lcom/worklight/common/WLConfig;


# instance fields
.field private fatalErrorOccurred:Z

.field private optionsMenu:Lcom/worklight/androidgap/plugin/WLOptionsMenu;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 73
    const/4 v0, 0x0

    sput-boolean v0, Lcom/worklight/androidgap/WLDroidGap;->isForegound:Z

    .line 63
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 63
    invoke-direct {p0}, Lorg/apache/cordova/DroidGap;-><init>()V

    .line 75
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/worklight/androidgap/WLDroidGap;->optionsMenu:Lcom/worklight/androidgap/plugin/WLOptionsMenu;

    .line 78
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/worklight/androidgap/WLDroidGap;->fatalErrorOccurred:Z

    .line 63
    return-void
.end method

.method static synthetic access$0(Lcom/worklight/androidgap/WLDroidGap;)V
    .locals 0

    .prologue
    .line 109
    invoke-direct {p0}, Lcom/worklight/androidgap/WLDroidGap;->testResourcesChecksum()V

    return-void
.end method

.method static synthetic access$1(Lcom/worklight/androidgap/WLDroidGap;Z)V
    .locals 0

    .prologue
    .line 78
    iput-boolean p1, p0, Lcom/worklight/androidgap/WLDroidGap;->fatalErrorOccurred:Z

    return-void
.end method

.method public static getWLConfig()Lcom/worklight/common/WLConfig;
    .locals 1

    .prologue
    .line 311
    sget-object v0, Lcom/worklight/androidgap/WLDroidGap;->wlConfig:Lcom/worklight/common/WLConfig;

    return-object v0
.end method

.method private isClearCacheNextLoad()Z
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 340
    invoke-virtual {p0, v2}, Lcom/worklight/androidgap/WLDroidGap;->getPreferences(I)Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "com.worklight.clearCacheNextLoad"

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public static isForeGround()Z
    .locals 1

    .prologue
    .line 150
    sget-boolean v0, Lcom/worklight/androidgap/WLDroidGap;->isForegound:Z

    return v0
.end method

.method private removeSessionCookies(Landroid/webkit/WebView;)V
    .locals 1
    .param p1, "appView"    # Landroid/webkit/WebView;

    .prologue
    .line 230
    invoke-virtual {p1}, Landroid/webkit/WebView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/webkit/CookieSyncManager;->createInstance(Landroid/content/Context;)Landroid/webkit/CookieSyncManager;

    .line 231
    invoke-static {}, Landroid/webkit/CookieManager;->getInstance()Landroid/webkit/CookieManager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/webkit/CookieManager;->removeSessionCookie()V

    .line 232
    return-void
.end method

.method private setClearCacheNextLoad(Z)V
    .locals 2
    .param p1, "clearCacheNextLoad"    # Z

    .prologue
    .line 334
    const/4 v1, 0x0

    invoke-virtual {p0, v1}, Lcom/worklight/androidgap/WLDroidGap;->getPreferences(I)Landroid/content/SharedPreferences;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 335
    .local v0, "editor":Landroid/content/SharedPreferences$Editor;
    const-string v1, "com.worklight.clearCacheNextLoad"

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 336
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 337
    return-void
.end method

.method private static setForeGround(Z)V
    .locals 0
    .param p0, "foreground"    # Z

    .prologue
    .line 154
    sput-boolean p0, Lcom/worklight/androidgap/WLDroidGap;->isForegound:Z

    .line 155
    return-void
.end method

.method private testResourcesChecksum()V
    .locals 6

    .prologue
    .line 110
    invoke-static {}, Lcom/worklight/androidgap/WLDroidGap;->getWLConfig()Lcom/worklight/common/WLConfig;

    move-result-object v2

    invoke-virtual {v2}, Lcom/worklight/common/WLConfig;->getTestWebResourcesChecksumFlag()Ljava/lang/String;

    move-result-object v2

    const-string v3, "true"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    .line 111
    .local v1, "shouldTestWebResourcesChecksum":Z
    if-nez v1, :cond_0

    .line 112
    const-string v2, "no need to check web resource integrity"

    invoke-static {v2}, Lcom/worklight/common/WLUtils;->debug(Ljava/lang/String;)V

    .line 131
    :goto_0
    return-void

    .line 115
    :cond_0
    const-string v2, "start web resource integrity test"

    invoke-static {v2}, Lcom/worklight/common/WLUtils;->debug(Ljava/lang/String;)V

    .line 117
    invoke-virtual {p0}, Lcom/worklight/androidgap/WLDroidGap;->getLocalStorageWebRoot()Ljava/lang/String;

    move-result-object v0

    .line 118
    .local v0, "resourcesPath":Ljava/lang/String;
    invoke-static {v0, p0}, Lcom/worklight/common/WLUtils;->checksumTestOnResources(Ljava/lang/String;Landroid/content/Context;)Z

    move-result v2

    if-nez v2, :cond_1

    .line 119
    const-string v2, "Error"

    const-string v3, "The application encountered an internal error. Please uninstall the application and then re-install it."

    const-string v4, "Exit"

    new-instance v5, Lcom/worklight/androidgap/WLDroidGap$1;

    invoke-direct {v5, p0}, Lcom/worklight/androidgap/WLDroidGap$1;-><init>(Lcom/worklight/androidgap/WLDroidGap;)V

    invoke-static {p0, v2, v3, v4, v5}, Lcom/worklight/common/WLUtils;->showDialog(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;)V

    .line 127
    const/4 v2, 0x1

    iput-boolean v2, p0, Lcom/worklight/androidgap/WLDroidGap;->fatalErrorOccurred:Z

    goto :goto_0

    .line 129
    :cond_1
    const-string v2, "web resource integrity test: Success"

    invoke-static {v2}, Lcom/worklight/common/WLUtils;->debug(Ljava/lang/String;)V

    goto :goto_0
.end method


# virtual methods
.method protected bindBrowser(Lorg/apache/cordova/CordovaWebView;)V
    .locals 1
    .param p1, "appView"    # Lorg/apache/cordova/CordovaWebView;

    .prologue
    .line 195
    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lcom/worklight/androidgap/WLDroidGap;->bindBrowser(Lorg/apache/cordova/CordovaWebView;Z)V

    .line 196
    return-void
.end method

.method protected bindBrowser(Lorg/apache/cordova/CordovaWebView;Z)V
    .locals 3
    .param p1, "appView"    # Lorg/apache/cordova/CordovaWebView;
    .param p2, "clearCache"    # Z

    .prologue
    .line 200
    iget-object v0, p1, Lorg/apache/cordova/CordovaWebView;->pluginManager:Lorg/apache/cordova/api/PluginManager;

    const-string v1, "Logger"

    const-string v2, "com.worklight.androidgap.plugin.Logger"

    invoke-virtual {v0, v1, v2}, Lorg/apache/cordova/api/PluginManager;->addService(Ljava/lang/String;Ljava/lang/String;)V

    .line 201
    iget-object v0, p1, Lorg/apache/cordova/CordovaWebView;->pluginManager:Lorg/apache/cordova/api/PluginManager;

    const-string v1, "Utils"

    const-string v2, "com.worklight.androidgap.plugin.Utils"

    invoke-virtual {v0, v1, v2}, Lorg/apache/cordova/api/PluginManager;->addService(Ljava/lang/String;Ljava/lang/String;)V

    .line 202
    iget-object v0, p1, Lorg/apache/cordova/CordovaWebView;->pluginManager:Lorg/apache/cordova/api/PluginManager;

    const-string v1, "NativePage"

    const-string v2, "com.worklight.androidgap.plugin.NativePage"

    invoke-virtual {v0, v1, v2}, Lorg/apache/cordova/api/PluginManager;->addService(Ljava/lang/String;Ljava/lang/String;)V

    .line 203
    iget-object v0, p1, Lorg/apache/cordova/CordovaWebView;->pluginManager:Lorg/apache/cordova/api/PluginManager;

    const-string v1, "NativeBusyIndicator"

    const-string v2, "com.worklight.androidgap.plugin.BusyIndicator"

    invoke-virtual {v0, v1, v2}, Lorg/apache/cordova/api/PluginManager;->addService(Ljava/lang/String;Ljava/lang/String;)V

    .line 204
    iget-object v0, p1, Lorg/apache/cordova/CordovaWebView;->pluginManager:Lorg/apache/cordova/api/PluginManager;

    const-string v1, "SecurityPlugin"

    const-string v2, "com.worklight.androidgap.plugin.SecurityPlugin"

    invoke-virtual {v0, v1, v2}, Lorg/apache/cordova/api/PluginManager;->addService(Ljava/lang/String;Ljava/lang/String;)V

    .line 207
    iget-object v0, p1, Lorg/apache/cordova/CordovaWebView;->pluginManager:Lorg/apache/cordova/api/PluginManager;

    const-string v1, "NetworkDetector"

    const-string v2, "com.worklight.androidgap.plugin.NetworkDetector"

    invoke-virtual {v0, v1, v2}, Lorg/apache/cordova/api/PluginManager;->addService(Ljava/lang/String;Ljava/lang/String;)V

    .line 208
    iget-object v0, p1, Lorg/apache/cordova/CordovaWebView;->pluginManager:Lorg/apache/cordova/api/PluginManager;

    const-string v1, "DeviceAuth"

    const-string v2, "com.worklight.androidgap.plugin.DeviceAuthPlugin"

    invoke-virtual {v0, v1, v2}, Lorg/apache/cordova/api/PluginManager;->addService(Ljava/lang/String;Ljava/lang/String;)V

    .line 212
    iget-object v0, p1, Lorg/apache/cordova/CordovaWebView;->pluginManager:Lorg/apache/cordova/api/PluginManager;

    const-string v1, "NetworkStatus"

    const-string v2, "com.worklight.androidgap.plugin.WLNetworkManager"

    invoke-virtual {v0, v1, v2}, Lorg/apache/cordova/api/PluginManager;->addService(Ljava/lang/String;Ljava/lang/String;)V

    .line 215
    new-instance v0, Lcom/worklight/androidgap/WLDroidGap$2;

    invoke-direct {v0, p0}, Lcom/worklight/androidgap/WLDroidGap$2;-><init>(Lcom/worklight/androidgap/WLDroidGap;)V

    invoke-virtual {p0, v0}, Lcom/worklight/androidgap/WLDroidGap;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 224
    if-eqz p2, :cond_0

    .line 225
    invoke-direct {p0, p1}, Lcom/worklight/androidgap/WLDroidGap;->removeSessionCookies(Landroid/webkit/WebView;)V

    .line 227
    :cond_0
    return-void
.end method

.method public getAppWebUrl(Ljava/lang/String;)Ljava/lang/String;
    .locals 4
    .param p1, "skinName"    # Ljava/lang/String;

    .prologue
    .line 371
    invoke-static {}, Lcom/worklight/androidgap/WLDroidGap;->getWLConfig()Lcom/worklight/common/WLConfig;

    move-result-object v2

    invoke-virtual {v2}, Lcom/worklight/common/WLConfig;->getMainFilePath()Ljava/lang/String;

    move-result-object v1

    .line 372
    .local v1, "mainHTMLFile":Ljava/lang/String;
    new-instance v0, Ljava/io/File;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/worklight/androidgap/WLDroidGap;->getLocalStorageWebRoot()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v3, "/"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "/"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "NativeEmptyApp.html"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 373
    .local v0, "file":Ljava/io/File;
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 374
    const-string v1, "NativeEmptyApp.html"

    .line 376
    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/worklight/androidgap/WLDroidGap;->getWebUrl()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v3, "/"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "/"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    return-object v2
.end method

.method protected getIntentDataInJSONFormat(Landroid/content/Intent;)Ljava/lang/String;
    .locals 7
    .param p1, "intent"    # Landroid/content/Intent;

    .prologue
    .line 272
    const-string v3, ""

    .line 273
    .local v3, "json":Ljava/lang/String;
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v5

    if-eqz v5, :cond_0

    .line 274
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v5

    invoke-virtual {v5}, Landroid/os/Bundle;->keySet()Ljava/util/Set;

    move-result-object v0

    .line 275
    .local v0, "dataKey":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/String;>;"
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 276
    .local v2, "extrasMap":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;"
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-nez v6, :cond_1

    .line 279
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1, v2}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    .line 280
    .local v1, "extrasJson":Lorg/json/JSONObject;
    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v3

    .line 282
    .end local v0    # "dataKey":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/String;>;"
    .end local v1    # "extrasJson":Lorg/json/JSONObject;
    .end local v2    # "extrasMap":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;"
    :cond_0
    return-object v3

    .line 276
    .restart local v0    # "dataKey":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/String;>;"
    .restart local v2    # "extrasMap":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;"
    :cond_1
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    .line 277
    .local v4, "key":Ljava/lang/String;
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v6

    invoke-virtual {v6, v4}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v6

    invoke-interface {v2, v4, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0
.end method

.method public getLocalStorageRoot()Ljava/lang/String;
    .locals 1

    .prologue
    .line 348
    invoke-virtual {p0}, Lcom/worklight/androidgap/WLDroidGap;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getLocalStorageWebRoot()Ljava/lang/String;
    .locals 2

    .prologue
    .line 352
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/worklight/androidgap/WLDroidGap;->getLocalStorageRoot()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v1, "/www"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getWebMainFilePath()Ljava/lang/String;
    .locals 4

    .prologue
    .line 356
    const/4 v0, 0x0

    .line 357
    .local v0, "mainFilePath":Ljava/lang/String;
    const-string v2, "wlSkinName"

    invoke-static {p0, v2}, Lcom/worklight/common/WLUtils;->readWLPref(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 358
    .local v1, "skinName":Ljava/lang/String;
    if-eqz v1, :cond_0

    .line 359
    invoke-virtual {p0, v1}, Lcom/worklight/androidgap/WLDroidGap;->getAppWebUrl(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 363
    :goto_0
    return-object v0

    .line 361
    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/worklight/androidgap/WLDroidGap;->getWebUrl()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v3, "/"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "skinLoader.html"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public getWebUrl()Ljava/lang/String;
    .locals 2

    .prologue
    .line 367
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "file://"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/worklight/androidgap/WLDroidGap;->getLocalStorageWebRoot()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public init()V
    .locals 0

    .prologue
    .line 100
    invoke-super {p0}, Lorg/apache/cordova/DroidGap;->init()V

    .line 102
    return-void
.end method

.method public loadUrl(Ljava/lang/String;)V
    .locals 1
    .param p1, "url"    # Ljava/lang/String;

    .prologue
    .line 315
    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lcom/worklight/androidgap/WLDroidGap;->loadUrl(Ljava/lang/String;Z)V

    .line 316
    return-void
.end method

.method public loadUrl(Ljava/lang/String;Z)V
    .locals 2
    .param p1, "url"    # Ljava/lang/String;
    .param p2, "clearCache"    # Z

    .prologue
    .line 319
    iget-boolean v0, p0, Lcom/worklight/androidgap/WLDroidGap;->fatalErrorOccurred:Z

    if-nez v0, :cond_1

    .line 320
    invoke-direct {p0}, Lcom/worklight/androidgap/WLDroidGap;->isClearCacheNextLoad()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 321
    iget-object v0, p0, Lcom/worklight/androidgap/WLDroidGap;->appView:Lorg/apache/cordova/CordovaWebView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lorg/apache/cordova/CordovaWebView;->clearCache(Z)V

    .line 322
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/worklight/androidgap/WLDroidGap;->setClearCacheNextLoad(Z)V

    .line 324
    :cond_0
    invoke-super {p0, p1}, Lorg/apache/cordova/DroidGap;->loadUrl(Ljava/lang/String;)V

    .line 325
    iget-object v0, p0, Lcom/worklight/androidgap/WLDroidGap;->appView:Lorg/apache/cordova/CordovaWebView;

    invoke-virtual {p0, v0, p2}, Lcom/worklight/androidgap/WLDroidGap;->bindBrowser(Lorg/apache/cordova/CordovaWebView;Z)V

    .line 327
    :cond_1
    return-void
.end method

.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 3
    .param p1, "requestCode"    # I
    .param p2, "resultCode"    # I
    .param p3, "intent"    # Landroid/content/Intent;

    .prologue
    .line 236
    sget v1, Lcom/worklight/androidgap/plugin/NativePage;->NATIVE_ACTIVITY_REQ_CODE:I

    if-ne p1, v1, :cond_1

    .line 237
    const/4 v1, -0x1

    if-ne p2, v1, :cond_0

    .line 238
    const-string v1, "NativePage returned OK result code"

    invoke-static {v1}, Lcom/worklight/common/WLUtils;->debug(Ljava/lang/String;)V

    .line 242
    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "WL.NativePage.onNativePageClose("

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, p3}, Lcom/worklight/androidgap/WLDroidGap;->getIntentDataInJSONFormat(Landroid/content/Intent;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ")"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 243
    .local v0, "javascript":Ljava/lang/String;
    invoke-virtual {p0, v0}, Lcom/worklight/androidgap/WLDroidGap;->sendJavascript(Ljava/lang/String;)V

    .line 247
    .end local v0    # "javascript":Ljava/lang/String;
    :goto_1
    return-void

    .line 240
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "NativePage returned result code "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/worklight/common/WLUtils;->error(Ljava/lang/String;)V

    goto :goto_0

    .line 245
    :cond_1
    invoke-super {p0, p1, p2, p3}, Lorg/apache/cordova/DroidGap;->onActivityResult(IILandroid/content/Intent;)V

    goto :goto_1
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    .line 81
    invoke-super {p0, p1}, Lorg/apache/cordova/DroidGap;->onCreate(Landroid/os/Bundle;)V

    .line 82
    invoke-virtual {p0}, Lcom/worklight/androidgap/WLDroidGap;->init()V

    .line 83
    new-instance v0, Lcom/worklight/common/WLConfig;

    invoke-virtual {p0}, Lcom/worklight/androidgap/WLDroidGap;->getApplication()Landroid/app/Application;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/worklight/common/WLConfig;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/worklight/androidgap/WLDroidGap;->wlConfig:Lcom/worklight/common/WLConfig;

    .line 84
    new-instance v0, Lcom/worklight/androidgap/WLDroidGap$PrepackagedAssetsManager;

    invoke-direct {v0, p0}, Lcom/worklight/androidgap/WLDroidGap$PrepackagedAssetsManager;-><init>(Lcom/worklight/androidgap/WLDroidGap;)V

    # invokes: Lcom/worklight/androidgap/WLDroidGap$PrepackagedAssetsManager;->copyPrepackagedAssetsToLocalCopyIfNeeded()V
    invoke-static {v0}, Lcom/worklight/androidgap/WLDroidGap$PrepackagedAssetsManager;->access$0(Lcom/worklight/androidgap/WLDroidGap$PrepackagedAssetsManager;)V

    .line 86
    const-string v0, "WLDefaultServerURL"

    invoke-static {}, Lcom/worklight/androidgap/WLDroidGap;->getWLConfig()Lcom/worklight/common/WLConfig;

    move-result-object v1

    invoke-virtual {v1}, Lcom/worklight/common/WLConfig;->getDefaultRootUrl()Ljava/lang/String;

    move-result-object v1

    invoke-static {p0, v0, v1}, Lcom/worklight/common/WLUtils;->writeWLPref(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 87
    const-string v0, "exitOnSkinLoader"

    const-string v1, "false"

    invoke-static {p0, v0, v1}, Lcom/worklight/common/WLUtils;->writeWLPref(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 88
    const-string v0, "enableSettings"

    invoke-static {}, Lcom/worklight/androidgap/WLDroidGap;->getWLConfig()Lcom/worklight/common/WLConfig;

    move-result-object v1

    invoke-virtual {v1}, Lcom/worklight/common/WLConfig;->getSettingsFlag()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {p0, v0, v1}, Lcom/worklight/common/WLUtils;->writeWLPref(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 89
    iget-object v0, p0, Lcom/worklight/androidgap/WLDroidGap;->appView:Lorg/apache/cordova/CordovaWebView;

    const/high16 v1, -0x1000000

    invoke-virtual {v0, v1}, Lorg/apache/cordova/CordovaWebView;->setBackgroundColor(I)V

    .line 90
    const/4 v0, 0x1

    invoke-static {v0}, Lcom/worklight/androidgap/WLDroidGap;->setForeGround(Z)V

    .line 91
    invoke-static {}, Lcom/worklight/common/security/WLDeviceAuthManager;->getInstance()Lcom/worklight/common/security/WLDeviceAuthManager;

    move-result-object v0

    new-instance v1, Lcom/worklight/common/security/ProvisioningDelegateImpl;

    invoke-direct {v1}, Lcom/worklight/common/security/ProvisioningDelegateImpl;-><init>()V

    invoke-virtual {v0, v1}, Lcom/worklight/common/security/WLDeviceAuthManager;->setProvisioningDelegate(Lcom/worklight/common/security/WLProvisioningDelegate;)V

    .line 92
    return-void
.end method

.method public onCreateOptionsMenu(Landroid/view/Menu;)Z
    .locals 1
    .param p1, "menu"    # Landroid/view/Menu;

    .prologue
    .line 159
    invoke-virtual {p0, p1}, Lcom/worklight/androidgap/WLDroidGap;->onPrepareOptionsMenu(Landroid/view/Menu;)Z

    move-result v0

    return v0
.end method

.method public onDestroy()V
    .locals 1

    .prologue
    .line 288
    invoke-super {p0}, Lorg/apache/cordova/DroidGap;->onDestroy()V

    .line 297
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/System;->runFinalizersOnExit(Z)V

    .line 306
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/System;->exit(I)V

    .line 307
    return-void
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 2
    .param p1, "keyCode"    # I
    .param p2, "event"    # Landroid/view/KeyEvent;

    .prologue
    .line 258
    invoke-super {p0, p1, p2}, Lorg/apache/cordova/DroidGap;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result v0

    .line 259
    .local v0, "returnValue":Z
    const/16 v1, 0x52

    if-ne p1, v1, :cond_0

    .line 260
    const/4 v0, 0x0

    .line 262
    .end local v0    # "returnValue":Z
    :cond_0
    return v0
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 3
    .param p1, "item"    # Landroid/view/MenuItem;

    .prologue
    .line 185
    iget-object v1, p0, Lcom/worklight/androidgap/WLDroidGap;->optionsMenu:Lcom/worklight/androidgap/plugin/WLOptionsMenu;

    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/worklight/androidgap/plugin/WLOptionsMenu;->getItemById(I)Lcom/worklight/androidgap/plugin/WLMenuItem;

    move-result-object v0

    .line 186
    .local v0, "btn":Lcom/worklight/androidgap/plugin/WLMenuItem;
    if-eqz v0, :cond_0

    .line 187
    invoke-virtual {v0}, Lcom/worklight/androidgap/plugin/WLMenuItem;->getCallback()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/worklight/androidgap/WLDroidGap;->sendJavascript(Ljava/lang/String;)V

    .line 188
    const/4 v1, 0x1

    .line 190
    :goto_0
    return v1

    :cond_0
    const/4 v1, 0x0

    goto :goto_0
.end method

.method public onPause()V
    .locals 2

    .prologue
    .line 142
    :try_start_0
    invoke-super {p0}, Lorg/apache/cordova/DroidGap;->onPause()V

    .line 143
    const/4 v1, 0x0

    invoke-static {v1}, Lcom/worklight/androidgap/WLDroidGap;->setForeGround(Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 147
    :goto_0
    return-void

    .line 144
    :catch_0
    move-exception v0

    .line 145
    .local v0, "e":Ljava/lang/Exception;
    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/worklight/common/WLUtils;->debug(Ljava/lang/String;)V

    goto :goto_0
.end method

.method public onPrepareOptionsMenu(Landroid/view/Menu;)Z
    .locals 8
    .param p1, "menu"    # Landroid/view/Menu;

    .prologue
    const/4 v4, 0x1

    const/4 v5, 0x0

    .line 163
    iget-object v3, p0, Lcom/worklight/androidgap/WLDroidGap;->optionsMenu:Lcom/worklight/androidgap/plugin/WLOptionsMenu;

    invoke-virtual {v3}, Lcom/worklight/androidgap/plugin/WLOptionsMenu;->isInit()Z

    move-result v3

    if-eqz v3, :cond_0

    iget-object v3, p0, Lcom/worklight/androidgap/WLDroidGap;->optionsMenu:Lcom/worklight/androidgap/plugin/WLOptionsMenu;

    invoke-virtual {v3}, Lcom/worklight/androidgap/plugin/WLOptionsMenu;->hasChanged()Z

    move-result v3

    if-nez v3, :cond_1

    .line 180
    :cond_0
    :goto_0
    return v4

    .line 166
    :cond_1
    invoke-interface {p1}, Landroid/view/Menu;->clear()V

    .line 168
    iget-object v3, p0, Lcom/worklight/androidgap/WLDroidGap;->optionsMenu:Lcom/worklight/androidgap/plugin/WLOptionsMenu;

    invoke-virtual {v3}, Lcom/worklight/androidgap/plugin/WLOptionsMenu;->isVisible()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 169
    iget-object v3, p0, Lcom/worklight/androidgap/WLDroidGap;->optionsMenu:Lcom/worklight/androidgap/plugin/WLOptionsMenu;

    invoke-virtual {v3}, Lcom/worklight/androidgap/plugin/WLOptionsMenu;->getItems()Ljava/util/List;

    move-result-object v2

    .line 170
    .local v2, "items":Ljava/util/List;, "Ljava/util/List<Lcom/worklight/androidgap/plugin/WLMenuItem;>;"
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_2
    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-nez v3, :cond_3

    .line 177
    iget-object v3, p0, Lcom/worklight/androidgap/WLDroidGap;->optionsMenu:Lcom/worklight/androidgap/plugin/WLOptionsMenu;

    invoke-virtual {v3}, Lcom/worklight/androidgap/plugin/WLOptionsMenu;->unsetChanged()V

    goto :goto_0

    .line 170
    :cond_3
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/worklight/androidgap/plugin/WLMenuItem;

    .line 171
    .local v0, "button":Lcom/worklight/androidgap/plugin/WLMenuItem;
    invoke-virtual {v0}, Lcom/worklight/androidgap/plugin/WLMenuItem;->getId()I

    move-result v3

    invoke-virtual {v0}, Lcom/worklight/androidgap/plugin/WLMenuItem;->getTitle()Ljava/lang/String;

    move-result-object v7

    invoke-interface {p1, v5, v3, v5, v7}, Landroid/view/Menu;->add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    move-result-object v1

    .line 172
    .local v1, "item":Landroid/view/MenuItem;
    invoke-virtual {v0}, Lcom/worklight/androidgap/plugin/WLMenuItem;->isEnabled()Z

    move-result v3

    if-eqz v3, :cond_4

    iget-object v3, p0, Lcom/worklight/androidgap/WLDroidGap;->optionsMenu:Lcom/worklight/androidgap/plugin/WLOptionsMenu;

    invoke-virtual {v3}, Lcom/worklight/androidgap/plugin/WLOptionsMenu;->isEnabled()Z

    move-result v3

    if-eqz v3, :cond_4

    move v3, v4

    :goto_2
    invoke-interface {v1, v3}, Landroid/view/MenuItem;->setEnabled(Z)Landroid/view/MenuItem;

    .line 173
    invoke-virtual {v0}, Lcom/worklight/androidgap/plugin/WLMenuItem;->getImagePath()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_2

    .line 174
    invoke-virtual {v0, p0}, Lcom/worklight/androidgap/plugin/WLMenuItem;->getImage(Lcom/worklight/androidgap/WLDroidGap;)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    invoke-interface {v1, v3}, Landroid/view/MenuItem;->setIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/MenuItem;

    goto :goto_1

    :cond_4
    move v3, v5

    .line 172
    goto :goto_2
.end method

.method public onResume()V
    .locals 1

    .prologue
    .line 135
    invoke-super {p0}, Lorg/apache/cordova/DroidGap;->onResume()V

    .line 136
    const/4 v0, 0x1

    invoke-static {v0}, Lcom/worklight/androidgap/WLDroidGap;->setForeGround(Z)V

    .line 137
    return-void
.end method

.method public setClearCacheNextLoad()V
    .locals 1

    .prologue
    .line 330
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/worklight/androidgap/WLDroidGap;->setClearCacheNextLoad(Z)V

    .line 331
    return-void
.end method
