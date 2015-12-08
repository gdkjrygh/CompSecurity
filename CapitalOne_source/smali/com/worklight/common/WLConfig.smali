.class public Lcom/worklight/common/WLConfig;
.super Ljava/lang/Object;
.source "WLConfig.java"


# static fields
.field public static final ENABLE_SETTINGS:Ljava/lang/String; = "enableSettings"

.field private static final IGNORED_FILE_EXTENSIONS:Ljava/lang/String; = "ignoredFileExtensions"

.field public static final WL_APP_ID:Ljava/lang/String; = "wlAppId"

.field public static final WL_APP_VERSION:Ljava/lang/String; = "wlAppVersion"

.field public static final WL_CLIENT_PROPS_NAME:Ljava/lang/String; = "wlclient.properties"

.field public static final WL_GCM_SENDER:Ljava/lang/String; = "GcmSenderId"

.field private static final WL_PREFS:Ljava/lang/String; = "WLPrefs"

.field public static final WL_SERVER_CONTEXT:Ljava/lang/String; = "wlServerContext"

.field public static final WL_SERVER_HOST:Ljava/lang/String; = "wlServerHost"

.field public static final WL_SERVER_PORT:Ljava/lang/String; = "wlServerPort"

.field public static final WL_SERVER_PROTOCOL:Ljava/lang/String; = "wlServerProtocol"

.field private static final WL_TEST_WEB_RESOURCES_CHECKSUM:Ljava/lang/String; = "testWebResourcesChecksum"

.field public static final WL_X_VERSION_HEADER:Ljava/lang/String; = "x-wl-app-version"


# instance fields
.field private prefs:Landroid/content/SharedPreferences;

.field private wlProperties:Ljava/util/Properties;


# direct methods
.method public constructor <init>(Landroid/app/Activity;)V
    .locals 1
    .param p1, "context"    # Landroid/app/Activity;

    .prologue
    .line 56
    invoke-virtual {p1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/worklight/common/WLConfig;-><init>(Landroid/content/Context;)V

    .line 57
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 4
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 43
    new-instance v1, Ljava/util/Properties;

    invoke-direct {v1}, Ljava/util/Properties;-><init>()V

    iput-object v1, p0, Lcom/worklight/common/WLConfig;->wlProperties:Ljava/util/Properties;

    .line 44
    const/4 v1, 0x0

    iput-object v1, p0, Lcom/worklight/common/WLConfig;->prefs:Landroid/content/SharedPreferences;

    .line 48
    :try_start_0
    iget-object v1, p0, Lcom/worklight/common/WLConfig;->wlProperties:Ljava/util/Properties;

    invoke-virtual {p1}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v2

    const-string v3, "wlclient.properties"

    invoke-virtual {v2, v3}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/Properties;->load(Ljava/io/InputStream;)V

    .line 49
    const-string v1, "WLPrefs"

    const/4 v2, 0x0

    invoke-virtual {p1, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v1

    iput-object v1, p0, Lcom/worklight/common/WLConfig;->prefs:Landroid/content/SharedPreferences;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 53
    return-void

    .line 50
    :catch_0
    move-exception v0

    .line 51
    .local v0, "e":Ljava/io/IOException;
    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "WLConfig(): Can\'t load wlclient.properties file"

    invoke-direct {v1, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method private getPropertyOrPref(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 3
    .param p1, "propertyKey"    # Ljava/lang/String;
    .param p2, "prefKey"    # Ljava/lang/String;

    .prologue
    .line 140
    iget-object v1, p0, Lcom/worklight/common/WLConfig;->prefs:Landroid/content/SharedPreferences;

    const/4 v2, 0x0

    invoke-interface {v1, p2, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 141
    .local v0, "result":Ljava/lang/String;
    if-nez v0, :cond_0

    .line 142
    iget-object v1, p0, Lcom/worklight/common/WLConfig;->wlProperties:Ljava/util/Properties;

    invoke-virtual {v1, p1}, Ljava/util/Properties;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .end local v0    # "result":Ljava/lang/String;
    check-cast v0, Ljava/lang/String;

    .line 144
    .restart local v0    # "result":Ljava/lang/String;
    :cond_0
    return-object v0
.end method


# virtual methods
.method public getAppId()Ljava/lang/String;
    .locals 2

    .prologue
    .line 69
    const-string v0, "wlAppId"

    const-string v1, "appIdPref"

    invoke-direct {p0, v0, v1}, Lcom/worklight/common/WLConfig;->getPropertyOrPref(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getAppURL()Ljava/net/URL;
    .locals 4

    .prologue
    .line 61
    :try_start_0
    new-instance v1, Ljava/net/URL;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/worklight/common/WLConfig;->getRootURL()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v3, "/apps/services/api/"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p0}, Lcom/worklight/common/WLConfig;->getAppId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "/android/0/"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    .line 63
    :catch_0
    move-exception v0

    .line 64
    .local v0, "e":Ljava/net/MalformedURLException;
    new-instance v1, Ljava/lang/RuntimeException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Could not parse URL; check assets/wlclient.properties. "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/net/MalformedURLException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public getApplicationVersion()Ljava/lang/String;
    .locals 2

    .prologue
    .line 73
    const-string v0, "wlAppVersion"

    const-string v1, "appVersionPref"

    invoke-direct {p0, v0, v1}, Lcom/worklight/common/WLConfig;->getPropertyOrPref(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getContext()Ljava/lang/String;
    .locals 2

    .prologue
    .line 136
    iget-object v0, p0, Lcom/worklight/common/WLConfig;->wlProperties:Ljava/util/Properties;

    const-string v1, "wlServerContext"

    invoke-virtual {v0, v1}, Ljava/util/Properties;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getDefaultRootUrl()Ljava/lang/String;
    .locals 8

    .prologue
    const/4 v7, 0x0

    .line 77
    invoke-virtual {p0}, Lcom/worklight/common/WLConfig;->getPort()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/worklight/common/WLUtils;->isStringEmpty(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2

    const-string v1, ""

    .line 78
    .local v1, "port":Ljava/lang/String;
    :goto_0
    invoke-virtual {p0}, Lcom/worklight/common/WLConfig;->getContext()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/worklight/common/WLUtils;->isStringEmpty(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_0

    invoke-virtual {p0}, Lcom/worklight/common/WLConfig;->getContext()Ljava/lang/String;

    move-result-object v3

    const-string v4, "/"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    :cond_0
    const-string v0, ""

    .line 79
    .local v0, "context":Ljava/lang/String;
    :goto_1
    const-string v3, "%s://%s%s%s"

    const/4 v4, 0x4

    new-array v4, v4, [Ljava/lang/Object;

    invoke-virtual {p0}, Lcom/worklight/common/WLConfig;->getProtocol()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v4, v7

    const/4 v5, 0x1

    invoke-virtual {p0}, Lcom/worklight/common/WLConfig;->getHost()Ljava/lang/String;

    move-result-object v6

    aput-object v6, v4, v5

    const/4 v5, 0x2

    aput-object v1, v4, v5

    const/4 v5, 0x3

    aput-object v0, v4, v5

    invoke-static {v3, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 80
    .local v2, "url":Ljava/lang/String;
    const-string v3, "/"

    invoke-virtual {v2, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 81
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    add-int/lit8 v3, v3, -0x1

    invoke-virtual {v2, v7, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    .line 83
    :cond_1
    return-object v2

    .line 77
    .end local v0    # "context":Ljava/lang/String;
    .end local v1    # "port":Ljava/lang/String;
    .end local v2    # "url":Ljava/lang/String;
    :cond_2
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, ":"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/worklight/common/WLConfig;->getPort()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    .line 78
    .restart local v1    # "port":Ljava/lang/String;
    :cond_3
    invoke-virtual {p0}, Lcom/worklight/common/WLConfig;->getContext()Ljava/lang/String;

    move-result-object v0

    goto :goto_1
.end method

.method public getGCMSender()Ljava/lang/String;
    .locals 3

    .prologue
    .line 104
    iget-object v1, p0, Lcom/worklight/common/WLConfig;->wlProperties:Ljava/util/Properties;

    const-string v2, "GcmSenderId"

    invoke-virtual {v1, v2}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 105
    .local v0, "wlGCMSender":Ljava/lang/String;
    if-eqz v0, :cond_0

    .line 106
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    .line 108
    .end local v0    # "wlGCMSender":Ljava/lang/String;
    :cond_0
    return-object v0
.end method

.method public getHost()Ljava/lang/String;
    .locals 2

    .prologue
    .line 128
    iget-object v0, p0, Lcom/worklight/common/WLConfig;->wlProperties:Ljava/util/Properties;

    const-string v1, "wlServerHost"

    invoke-virtual {v0, v1}, Ljava/util/Properties;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getMainFilePath()Ljava/lang/String;
    .locals 2

    .prologue
    .line 112
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/worklight/common/WLConfig;->getAppId()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v1, ".html"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getMediaExtensions()[Ljava/lang/String;
    .locals 4

    .prologue
    .line 95
    iget-object v2, p0, Lcom/worklight/common/WLConfig;->wlProperties:Ljava/util/Properties;

    const-string v3, "ignoredFileExtensions"

    invoke-virtual {v2, v3}, Ljava/util/Properties;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 96
    .local v1, "mediaExtentionStr":Ljava/lang/String;
    if-eqz v1, :cond_0

    .line 97
    const-string v2, " "

    const-string v3, ""

    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, ","

    invoke-virtual {v2, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    .line 100
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public getPort()Ljava/lang/String;
    .locals 2

    .prologue
    .line 132
    iget-object v0, p0, Lcom/worklight/common/WLConfig;->wlProperties:Ljava/util/Properties;

    const-string v1, "wlServerPort"

    invoke-virtual {v0, v1}, Ljava/util/Properties;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getProtocol()Ljava/lang/String;
    .locals 2

    .prologue
    .line 124
    iget-object v0, p0, Lcom/worklight/common/WLConfig;->wlProperties:Ljava/util/Properties;

    const-string v1, "wlServerProtocol"

    invoke-virtual {v0, v1}, Ljava/util/Properties;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getRootURL()Ljava/lang/String;
    .locals 4

    .prologue
    .line 87
    iget-object v1, p0, Lcom/worklight/common/WLConfig;->prefs:Landroid/content/SharedPreferences;

    const-string v2, "WLServerURL"

    const/4 v3, 0x0

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 88
    .local v0, "result":Ljava/lang/String;
    if-nez v0, :cond_0

    .line 89
    invoke-virtual {p0}, Lcom/worklight/common/WLConfig;->getDefaultRootUrl()Ljava/lang/String;

    move-result-object v0

    .line 91
    :cond_0
    return-object v0
.end method

.method public getSettingsFlag()Ljava/lang/String;
    .locals 2

    .prologue
    .line 116
    iget-object v0, p0, Lcom/worklight/common/WLConfig;->wlProperties:Ljava/util/Properties;

    const-string v1, "enableSettings"

    invoke-virtual {v0, v1}, Ljava/util/Properties;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getTestWebResourcesChecksumFlag()Ljava/lang/String;
    .locals 2

    .prologue
    .line 120
    iget-object v0, p0, Lcom/worklight/common/WLConfig;->wlProperties:Ljava/util/Properties;

    const-string v1, "testWebResourcesChecksum"

    invoke-virtual {v0, v1}, Ljava/util/Properties;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method
