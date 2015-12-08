.class public Lcom/splunk/mint/Properties;
.super Ljava/lang/Object;
.source "Properties.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/splunk/mint/Properties$RemoteSettingsProps;
    }
.end annotation


# static fields
.field protected static API_KEY:Ljava/lang/String; = null

.field protected static final API_VERSION:Ljava/lang/String; = "1"

.field protected static APP_PACKAGE:Ljava/lang/String; = null

.field protected static APP_VERSIONCODE:Ljava/lang/String; = null

.field protected static APP_VERSIONNAME:Ljava/lang/String; = null

.field protected static CARRIER:Ljava/lang/String; = null

.field public static CONNECTION:Ljava/lang/String; = null

.field protected static FILES_PATH:Ljava/lang/String; = null

.field protected static HAS_ROOT:Z = false

.field protected static IS_GPS_ON:Lcom/splunk/mint/EnumStateStatus; = null

.field protected static LOCALE:Ljava/lang/String; = null

.field protected static LOG_FILTER:Ljava/lang/String; = null

.field protected static LOG_LINES:I = 0x0

.field protected static OS_VERSION:Ljava/lang/String; = null

.field protected static PHONE_BRAND:Ljava/lang/String; = null

.field protected static PHONE_MODEL:Ljava/lang/String; = null

.field public static final REMOTEIP_PLACEHOLDER:Ljava/lang/String; = "{%#@@#%}"

.field public static final REST_VERSION:Ljava/lang/String; = "1.0"

.field protected static final SDK_PLATFORM:Ljava/lang/String; = "Android"

.field protected static final SDK_VERSION:Ljava/lang/String; = "4.0"

.field protected static SEND_LOG:Z = false

.field public static STATE:Ljava/lang/String; = null

.field public static final TAG:Ljava/lang/String; = "Mint"

.field protected static TIMESTAMP:J

.field protected static UID:Ljava/lang/String;

.field protected static breadcrumbs:Lcom/splunk/mint/BreadcrumbsLimited;

.field private static final defaultExcludedUrls:[Ljava/lang/String;

.field public static final excludedUrls:Lcom/splunk/mint/ExcludedUrls;

.field protected static extraData:Lcom/splunk/mint/ExtraData;

.field private static initialized:Z

.field public static isKitKat:Z

.field public static lastPingTime:J

.field protected static proxyEnabled:Z

.field protected static sendOnlyWiFi:Z

.field protected static transactionsDatabase:Lcom/splunk/mint/TransactionsDatabase;

.field protected static userIdentifier:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .prologue
    const-wide/16 v4, 0x0

    const/4 v3, 0x0

    const/4 v2, 0x0

    .line 25
    sput-boolean v2, Lcom/splunk/mint/Properties;->initialized:Z

    .line 116
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "splkmobile.com"

    aput-object v1, v0, v2

    sput-object v0, Lcom/splunk/mint/Properties;->defaultExcludedUrls:[Ljava/lang/String;

    .line 117
    new-instance v0, Lcom/splunk/mint/ExcludedUrls;

    sget-object v1, Lcom/splunk/mint/Properties;->defaultExcludedUrls:[Ljava/lang/String;

    invoke-direct {v0, v1}, Lcom/splunk/mint/ExcludedUrls;-><init>([Ljava/lang/String;)V

    sput-object v0, Lcom/splunk/mint/Properties;->excludedUrls:Lcom/splunk/mint/ExcludedUrls;

    .line 154
    const-string v0, "NA"

    sput-object v0, Lcom/splunk/mint/Properties;->CONNECTION:Ljava/lang/String;

    .line 155
    const-string v0, "NA"

    sput-object v0, Lcom/splunk/mint/Properties;->STATE:Ljava/lang/String;

    .line 158
    sput-object v3, Lcom/splunk/mint/Properties;->FILES_PATH:Ljava/lang/String;

    .line 161
    const-string v0, "unknown"

    sput-object v0, Lcom/splunk/mint/Properties;->APP_VERSIONNAME:Ljava/lang/String;

    .line 164
    const-string v0, "unknown"

    sput-object v0, Lcom/splunk/mint/Properties;->APP_VERSIONCODE:Ljava/lang/String;

    .line 167
    const-string v0, "unknown"

    sput-object v0, Lcom/splunk/mint/Properties;->APP_PACKAGE:Ljava/lang/String;

    .line 176
    const-string v0, "unknown"

    sput-object v0, Lcom/splunk/mint/Properties;->OS_VERSION:Ljava/lang/String;

    .line 179
    const-string v0, "unknown"

    sput-object v0, Lcom/splunk/mint/Properties;->PHONE_MODEL:Ljava/lang/String;

    .line 182
    sput-object v3, Lcom/splunk/mint/Properties;->PHONE_BRAND:Ljava/lang/String;

    .line 185
    const-string v0, "unknown"

    sput-object v0, Lcom/splunk/mint/Properties;->API_KEY:Ljava/lang/String;

    .line 188
    sput-boolean v2, Lcom/splunk/mint/Properties;->HAS_ROOT:Z

    .line 190
    const-string v0, "unknown"

    sput-object v0, Lcom/splunk/mint/Properties;->LOCALE:Ljava/lang/String;

    .line 192
    const-string v0, "unknown"

    sput-object v0, Lcom/splunk/mint/Properties;->CARRIER:Ljava/lang/String;

    .line 195
    const-string v0, ""

    sput-object v0, Lcom/splunk/mint/Properties;->UID:Ljava/lang/String;

    .line 198
    new-instance v0, Lcom/splunk/mint/BreadcrumbsLimited;

    invoke-direct {v0}, Lcom/splunk/mint/BreadcrumbsLimited;-><init>()V

    sput-object v0, Lcom/splunk/mint/Properties;->breadcrumbs:Lcom/splunk/mint/BreadcrumbsLimited;

    .line 200
    new-instance v0, Lcom/splunk/mint/ExtraData;

    invoke-direct {v0}, Lcom/splunk/mint/ExtraData;-><init>()V

    sput-object v0, Lcom/splunk/mint/Properties;->extraData:Lcom/splunk/mint/ExtraData;

    .line 203
    sput-boolean v2, Lcom/splunk/mint/Properties;->SEND_LOG:Z

    .line 206
    const-string v0, ""

    sput-object v0, Lcom/splunk/mint/Properties;->LOG_FILTER:Ljava/lang/String;

    .line 209
    const/16 v0, 0x1388

    sput v0, Lcom/splunk/mint/Properties;->LOG_LINES:I

    .line 212
    sput-wide v4, Lcom/splunk/mint/Properties;->TIMESTAMP:J

    .line 214
    sput-boolean v2, Lcom/splunk/mint/Properties;->proxyEnabled:Z

    .line 216
    sget-object v0, Lcom/splunk/mint/EnumStateStatus;->NA:Lcom/splunk/mint/EnumStateStatus;

    sput-object v0, Lcom/splunk/mint/Properties;->IS_GPS_ON:Lcom/splunk/mint/EnumStateStatus;

    .line 218
    sput-boolean v2, Lcom/splunk/mint/Properties;->sendOnlyWiFi:Z

    .line 220
    sput-object v3, Lcom/splunk/mint/Properties;->userIdentifier:Ljava/lang/String;

    .line 222
    new-instance v0, Lcom/splunk/mint/TransactionsDatabase;

    invoke-direct {v0}, Lcom/splunk/mint/TransactionsDatabase;-><init>()V

    sput-object v0, Lcom/splunk/mint/Properties;->transactionsDatabase:Lcom/splunk/mint/TransactionsDatabase;

    .line 224
    sput-wide v4, Lcom/splunk/mint/Properties;->lastPingTime:J

    .line 226
    sput-boolean v2, Lcom/splunk/mint/Properties;->isKitKat:Z

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 120
    return-void
.end method

.method protected static final getSeparator(Lcom/splunk/mint/EnumActionType;)Ljava/lang/String;
    .locals 2
    .param p0, "actionName"    # Lcom/splunk/mint/EnumActionType;

    .prologue
    .line 149
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "{^1^"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/splunk/mint/EnumActionType;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "^"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Lcom/splunk/mint/Utils;->getTime()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected static initialize(Landroid/content/Context;)V
    .locals 7
    .param p0, "context"    # Landroid/content/Context;

    .prologue
    .line 35
    sget-boolean v5, Lcom/splunk/mint/Properties;->initialized:Z

    if-nez v5, :cond_6

    .line 37
    invoke-static {p0}, Lcom/splunk/mint/UidManager;->getUid(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v5

    sput-object v5, Lcom/splunk/mint/Properties;->UID:Ljava/lang/String;

    .line 41
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v3

    .line 44
    .local v3, "pm":Landroid/content/pm/PackageManager;
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    invoke-virtual {v3, v5, v6}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v2

    .line 45
    .local v2, "pi":Landroid/content/pm/PackageInfo;
    iget-object v5, v2, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    sput-object v5, Lcom/splunk/mint/Properties;->APP_VERSIONNAME:Ljava/lang/String;

    .line 46
    iget v5, v2, Landroid/content/pm/PackageInfo;->versionCode:I

    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    sput-object v5, Lcom/splunk/mint/Properties;->APP_VERSIONCODE:Ljava/lang/String;

    .line 48
    iget-object v5, v2, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    sput-object v5, Lcom/splunk/mint/Properties;->APP_PACKAGE:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 55
    .end local v2    # "pi":Landroid/content/pm/PackageInfo;
    .end local v3    # "pm":Landroid/content/pm/PackageManager;
    :cond_0
    :goto_0
    sget-object v5, Landroid/os/Build;->MODEL:Ljava/lang/String;

    sput-object v5, Lcom/splunk/mint/Properties;->PHONE_MODEL:Ljava/lang/String;

    .line 56
    sget-object v5, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    sput-object v5, Lcom/splunk/mint/Properties;->PHONE_BRAND:Ljava/lang/String;

    .line 57
    sget-object v5, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    sput-object v5, Lcom/splunk/mint/Properties;->OS_VERSION:Ljava/lang/String;

    .line 58
    invoke-static {}, Lcom/splunk/mint/Utils;->checkForRoot()Z

    move-result v5

    sput-boolean v5, Lcom/splunk/mint/Properties;->HAS_ROOT:Z

    .line 60
    invoke-static {}, Lcom/splunk/mint/Utils;->isKitKat()Z

    move-result v5

    sput-boolean v5, Lcom/splunk/mint/Properties;->isKitKat:Z

    .line 63
    sget-object v5, Lcom/splunk/mint/Properties;->breadcrumbs:Lcom/splunk/mint/BreadcrumbsLimited;

    if-nez v5, :cond_1

    .line 64
    new-instance v5, Lcom/splunk/mint/BreadcrumbsLimited;

    invoke-direct {v5}, Lcom/splunk/mint/BreadcrumbsLimited;-><init>()V

    sput-object v5, Lcom/splunk/mint/Properties;->breadcrumbs:Lcom/splunk/mint/BreadcrumbsLimited;

    .line 67
    :cond_1
    sget-object v5, Lcom/splunk/mint/Properties;->extraData:Lcom/splunk/mint/ExtraData;

    if-nez v5, :cond_2

    .line 68
    new-instance v5, Lcom/splunk/mint/ExtraData;

    invoke-direct {v5}, Lcom/splunk/mint/ExtraData;-><init>()V

    sput-object v5, Lcom/splunk/mint/Properties;->extraData:Lcom/splunk/mint/ExtraData;

    .line 71
    :cond_2
    sget-object v5, Lcom/splunk/mint/Properties;->transactionsDatabase:Lcom/splunk/mint/TransactionsDatabase;

    if-nez v5, :cond_3

    .line 72
    new-instance v5, Lcom/splunk/mint/TransactionsDatabase;

    invoke-direct {v5}, Lcom/splunk/mint/TransactionsDatabase;-><init>()V

    sput-object v5, Lcom/splunk/mint/Properties;->transactionsDatabase:Lcom/splunk/mint/TransactionsDatabase;

    .line 77
    :cond_3
    :try_start_1
    invoke-virtual {p0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v5

    invoke-virtual {v5}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v5

    sput-object v5, Lcom/splunk/mint/Properties;->FILES_PATH:Ljava/lang/String;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 83
    :cond_4
    :goto_1
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Files Path set to: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    sget-object v6, Lcom/splunk/mint/Properties;->FILES_PATH:Ljava/lang/String;

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/splunk/mint/Logger;->logInfo(Ljava/lang/String;)V

    .line 85
    invoke-static {p0}, Lcom/splunk/mint/RemoteSettings;->loadRemoteSettings(Landroid/content/Context;)Lcom/splunk/mint/RemoteSettingsData;

    move-result-object v4

    .line 86
    .local v4, "remoteSettings":Lcom/splunk/mint/RemoteSettingsData;
    if-eqz v4, :cond_5

    .line 87
    iget-object v5, v4, Lcom/splunk/mint/RemoteSettingsData;->logLevel:Ljava/lang/Integer;

    sput-object v5, Lcom/splunk/mint/Properties$RemoteSettingsProps;->logLevel:Ljava/lang/Integer;

    .line 88
    iget-object v5, v4, Lcom/splunk/mint/RemoteSettingsData;->eventLevel:Ljava/lang/Integer;

    sput-object v5, Lcom/splunk/mint/Properties$RemoteSettingsProps;->eventLevel:Ljava/lang/Integer;

    .line 89
    iget-object v5, v4, Lcom/splunk/mint/RemoteSettingsData;->netMonitoring:Ljava/lang/Boolean;

    sput-object v5, Lcom/splunk/mint/Properties$RemoteSettingsProps;->netMonitoringEnabled:Ljava/lang/Boolean;

    .line 90
    iget-object v5, v4, Lcom/splunk/mint/RemoteSettingsData;->sessionTime:Ljava/lang/Integer;

    sput-object v5, Lcom/splunk/mint/Properties$RemoteSettingsProps;->sessionTime:Ljava/lang/Integer;

    .line 91
    iget-object v5, v4, Lcom/splunk/mint/RemoteSettingsData;->hashCode:Ljava/lang/String;

    sput-object v5, Lcom/splunk/mint/Properties$RemoteSettingsProps;->hashCode:Ljava/lang/String;

    .line 93
    :try_start_2
    new-instance v5, Lorg/json/JSONObject;

    iget-object v6, v4, Lcom/splunk/mint/RemoteSettingsData;->devSettings:Ljava/lang/String;

    invoke-direct {v5, v6}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    sput-object v5, Lcom/splunk/mint/Properties$RemoteSettingsProps;->devSettings:Lorg/json/JSONObject;
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_2

    .line 101
    :cond_5
    :goto_2
    const/4 v5, 0x1

    sput-boolean v5, Lcom/splunk/mint/Properties;->initialized:Z

    .line 105
    .end local v4    # "remoteSettings":Lcom/splunk/mint/RemoteSettingsData;
    :cond_6
    invoke-static {p0}, Lcom/splunk/mint/Utils;->isGPSOn(Landroid/content/Context;)Lcom/splunk/mint/EnumStateStatus;

    move-result-object v5

    sput-object v5, Lcom/splunk/mint/Properties;->IS_GPS_ON:Lcom/splunk/mint/EnumStateStatus;

    .line 106
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v5

    invoke-virtual {v5}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v5

    sput-object v5, Lcom/splunk/mint/Properties;->LOCALE:Ljava/lang/String;

    .line 108
    invoke-static {p0}, Lcom/splunk/mint/Utils;->getCarrier(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v5

    sput-object v5, Lcom/splunk/mint/Properties;->CARRIER:Ljava/lang/String;

    .line 110
    invoke-static {p0}, Lcom/splunk/mint/Utils;->getConnectionInfo(Landroid/content/Context;)Ljava/util/HashMap;

    move-result-object v0

    .line 111
    .local v0, "conInfo":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;"
    const-string v5, "connection"

    invoke-virtual {v0, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    sput-object v5, Lcom/splunk/mint/Properties;->CONNECTION:Ljava/lang/String;

    .line 112
    const-string v5, "state"

    invoke-virtual {v0, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    sput-object v5, Lcom/splunk/mint/Properties;->STATE:Ljava/lang/String;

    .line 113
    return-void

    .line 50
    .end local v0    # "conInfo":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;"
    :catch_0
    move-exception v1

    .line 51
    .local v1, "e":Ljava/lang/Exception;
    const-string v5, "Error collecting information about the package!"

    invoke-static {v5}, Lcom/splunk/mint/Logger;->logError(Ljava/lang/String;)V

    .line 52
    sget-boolean v5, Lcom/splunk/mint/Mint;->DEBUG:Z

    if-eqz v5, :cond_0

    .line 53
    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    goto/16 :goto_0

    .line 78
    .end local v1    # "e":Ljava/lang/Exception;
    :catch_1
    move-exception v1

    .line 79
    .restart local v1    # "e":Ljava/lang/Exception;
    sget-boolean v5, Lcom/splunk/mint/Mint;->DEBUG:Z

    if-eqz v5, :cond_4

    .line 80
    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    goto/16 :goto_1

    .line 94
    .end local v1    # "e":Ljava/lang/Exception;
    .restart local v4    # "remoteSettings":Lcom/splunk/mint/RemoteSettingsData;
    :catch_2
    move-exception v1

    .line 95
    .local v1, "e":Lorg/json/JSONException;
    invoke-virtual {v1}, Lorg/json/JSONException;->printStackTrace()V

    goto :goto_2
.end method

.method public static isPluginInitialized()Z
    .locals 1

    .prologue
    .line 28
    sget-boolean v0, Lcom/splunk/mint/Properties;->initialized:Z

    if-nez v0, :cond_0

    .line 29
    const-string v0, "Mint SDK is not initialized!"

    invoke-static {v0}, Lcom/splunk/mint/Logger;->logWarning(Ljava/lang/String;)V

    .line 31
    :cond_0
    sget-boolean v0, Lcom/splunk/mint/Properties;->initialized:Z

    return v0
.end method
