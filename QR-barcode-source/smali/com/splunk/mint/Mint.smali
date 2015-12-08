.class public final Lcom/splunk/mint/Mint;
.super Ljava/lang/Object;
.source "Mint.java"


# static fields
.field protected static DEBUG:Z

.field private static isSessionActive:Z

.field protected static mintCallback:Lcom/splunk/mint/MintCallback;

.field static netInitializedSuccessfully:Z

.field private static networkMonitoringEnabled:Z

.field private static registry:Lcom/splunk/mint/network/MonitorRegistry;

.field static triedToInitNet:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 38
    sput-boolean v1, Lcom/splunk/mint/Mint;->DEBUG:Z

    .line 111
    sput-boolean v1, Lcom/splunk/mint/Mint;->netInitializedSuccessfully:Z

    .line 113
    sput-boolean v1, Lcom/splunk/mint/Mint;->triedToInitNet:Z

    .line 150
    new-instance v0, Lcom/splunk/mint/network/MonitorRegistry;

    invoke-direct {v0}, Lcom/splunk/mint/network/MonitorRegistry;-><init>()V

    sput-object v0, Lcom/splunk/mint/Mint;->registry:Lcom/splunk/mint/network/MonitorRegistry;

    .line 160
    sput-boolean v1, Lcom/splunk/mint/Mint;->isSessionActive:Z

    .line 224
    const/4 v0, 0x1

    sput-boolean v0, Lcom/splunk/mint/Mint;->networkMonitoringEnabled:Z

    .line 236
    const/4 v0, 0x0

    sput-object v0, Lcom/splunk/mint/Mint;->mintCallback:Lcom/splunk/mint/MintCallback;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic access$000()V
    .locals 0

    .prologue
    .line 35
    invoke-static {}, Lcom/splunk/mint/Mint;->installExceptionHandler()V

    return-void
.end method

.method static synthetic access$100()V
    .locals 0

    .prologue
    .line 35
    invoke-static {}, Lcom/splunk/mint/Mint;->initializeNetworkMonitoring()V

    return-void
.end method

.method public static addExtraData(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .param p0, "key"    # Ljava/lang/String;
    .param p1, "value"    # Ljava/lang/String;

    .prologue
    .line 392
    invoke-static {}, Lcom/splunk/mint/Properties;->isPluginInitialized()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 393
    if-eqz p0, :cond_1

    .line 394
    if-nez p1, :cond_0

    .line 395
    const-string p1, "null"

    .line 397
    :cond_0
    sget-object v0, Lcom/splunk/mint/Properties;->extraData:Lcom/splunk/mint/ExtraData;

    invoke-virtual {v0, p0, p1}, Lcom/splunk/mint/ExtraData;->addExtraData(Ljava/lang/String;Ljava/lang/String;)Z

    .line 400
    :cond_1
    return-void
.end method

.method public static addExtraDataMap(Ljava/util/HashMap;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 409
    .local p0, "extras":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;"
    invoke-static {}, Lcom/splunk/mint/Properties;->isPluginInitialized()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 410
    if-eqz p0, :cond_0

    .line 411
    sget-object v0, Lcom/splunk/mint/Properties;->extraData:Lcom/splunk/mint/ExtraData;

    invoke-virtual {v0, p0}, Lcom/splunk/mint/ExtraData;->addExtraDataMap(Ljava/util/HashMap;)Z

    .line 414
    :cond_0
    return-void
.end method

.method public static addURLToBlackList(Ljava/lang/String;)V
    .locals 1
    .param p0, "url"    # Ljava/lang/String;

    .prologue
    .line 597
    if-eqz p0, :cond_0

    .line 598
    sget-object v0, Lcom/splunk/mint/Properties;->excludedUrls:Lcom/splunk/mint/ExcludedUrls;

    invoke-virtual {v0, p0}, Lcom/splunk/mint/ExcludedUrls;->addValue(Ljava/lang/String;)V

    .line 600
    :cond_0
    return-void
.end method

.method public static clearExtraData()V
    .locals 1

    .prologue
    .line 434
    invoke-static {}, Lcom/splunk/mint/Properties;->isPluginInitialized()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 435
    sget-object v0, Lcom/splunk/mint/Properties;->extraData:Lcom/splunk/mint/ExtraData;

    invoke-virtual {v0}, Lcom/splunk/mint/ExtraData;->clearData()V

    .line 437
    :cond_0
    return-void
.end method

.method public static clearTotalCrashesNum()V
    .locals 2

    .prologue
    .line 454
    invoke-static {}, Lcom/splunk/mint/Properties;->isPluginInitialized()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 455
    new-instance v0, Lcom/splunk/mint/CrashInfo;

    invoke-direct {v0}, Lcom/splunk/mint/CrashInfo;-><init>()V

    .line 456
    .local v0, "mCrashInfo":Lcom/splunk/mint/CrashInfo;
    invoke-virtual {v0}, Lcom/splunk/mint/CrashInfo;->clearCrashCounter()V

    .line 458
    :cond_0
    return-void
.end method

.method public static closeSession(Landroid/content/Context;)V
    .locals 2
    .param p0, "context"    # Landroid/content/Context;

    .prologue
    .line 204
    invoke-static {}, Lcom/splunk/mint/Properties;->isPluginInitialized()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 206
    sget-boolean v1, Lcom/splunk/mint/Mint;->isSessionActive:Z

    if-eqz v1, :cond_0

    .line 207
    const/4 v1, 0x0

    sput-boolean v1, Lcom/splunk/mint/Mint;->isSessionActive:Z

    .line 208
    invoke-static {}, Lcom/splunk/mint/ActionEvent;->createGnip()Lcom/splunk/mint/ActionEvent;

    move-result-object v0

    .line 209
    .local v0, "event":Lcom/splunk/mint/ActionEvent;
    new-instance v1, Lcom/splunk/mint/DataSaver;

    invoke-direct {v1}, Lcom/splunk/mint/DataSaver;-><init>()V

    invoke-virtual {v0, v1}, Lcom/splunk/mint/ActionEvent;->save(Lcom/splunk/mint/DataSaver;)V

    .line 210
    invoke-static {p0}, Lcom/splunk/mint/Utils;->clearLastPingSentTime(Landroid/content/Context;)V

    .line 213
    .end local v0    # "event":Lcom/splunk/mint/ActionEvent;
    :cond_0
    return-void
.end method

.method public static disableNetworkMonitoring()V
    .locals 1

    .prologue
    .line 230
    const/4 v0, 0x0

    sput-boolean v0, Lcom/splunk/mint/Mint;->networkMonitoringEnabled:Z

    .line 231
    return-void
.end method

.method public static enableDebug()V
    .locals 1

    .prologue
    .line 323
    const/4 v0, 0x1

    sput-boolean v0, Lcom/splunk/mint/Mint;->DEBUG:Z

    .line 324
    return-void
.end method

.method public static enableLogging(Z)V
    .locals 0
    .param p0, "enable"    # Z

    .prologue
    .line 532
    sput-boolean p0, Lcom/splunk/mint/Properties;->SEND_LOG:Z

    .line 533
    return-void
.end method

.method public static flush()V
    .locals 1

    .prologue
    .line 219
    invoke-static {}, Lcom/splunk/mint/Properties;->isPluginInitialized()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 220
    new-instance v0, Lcom/splunk/mint/DataFlusher;

    invoke-direct {v0}, Lcom/splunk/mint/DataFlusher;-><init>()V

    invoke-virtual {v0}, Lcom/splunk/mint/DataFlusher;->send()V

    .line 222
    :cond_0
    return-void
.end method

.method public static getDevSettings()Lorg/json/JSONObject;
    .locals 1

    .prologue
    .line 587
    sget-object v0, Lcom/splunk/mint/Properties$RemoteSettingsProps;->devSettings:Lorg/json/JSONObject;

    return-object v0
.end method

.method public static getExtraData()Ljava/util/HashMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 380
    sget-object v0, Lcom/splunk/mint/Properties;->extraData:Lcom/splunk/mint/ExtraData;

    invoke-virtual {v0}, Lcom/splunk/mint/ExtraData;->getExtraData()Ljava/util/HashMap;

    move-result-object v0

    return-object v0
.end method

.method public static getLastCrashID()Ljava/lang/String;
    .locals 1

    .prologue
    .line 467
    invoke-static {}, Lcom/splunk/mint/CrashInfo;->getLastCrashID()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static getTotalCrashesNum()I
    .locals 1

    .prologue
    .line 446
    invoke-static {}, Lcom/splunk/mint/CrashInfo;->getCrashCounter()I

    move-result v0

    return v0
.end method

.method public static initAndStartSession(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1
    .param p0, "context"    # Landroid/content/Context;
    .param p1, "apiKey"    # Ljava/lang/String;

    .prologue
    .line 52
    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Lcom/splunk/mint/Mint;->initAndStartSession(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 53
    return-void
.end method

.method private static initAndStartSession(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 4
    .param p0, "context"    # Landroid/content/Context;
    .param p1, "apiKey"    # Ljava/lang/String;
    .param p2, "url"    # Ljava/lang/String;

    .prologue
    .line 66
    if-nez p0, :cond_0

    .line 67
    const-string v1, "Context is null!"

    invoke-static {v1}, Lcom/splunk/mint/Logger;->logWarning(Ljava/lang/String;)V

    .line 109
    :goto_0
    return-void

    .line 72
    :cond_0
    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    const/16 v2, 0x8

    if-lt v1, v2, :cond_1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    const/16 v2, 0xe

    if-le v1, v2, :cond_2

    .line 73
    :cond_1
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Your Mint API Key is invalid!"

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 75
    :cond_2
    sput-object p1, Lcom/splunk/mint/Properties;->API_KEY:Ljava/lang/String;

    .line 78
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sput-wide v2, Lcom/splunk/mint/Properties;->TIMESTAMP:J

    .line 82
    new-instance v1, Lcom/splunk/mint/LowPriorityThreadFactory;

    invoke-direct {v1}, Lcom/splunk/mint/LowPriorityThreadFactory;-><init>()V

    new-instance v2, Lcom/splunk/mint/Mint$1;

    invoke-direct {v2, p0, p2, p1}, Lcom/splunk/mint/Mint$1;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Lcom/splunk/mint/LowPriorityThreadFactory;->newThread(Ljava/lang/Runnable;)Ljava/lang/Thread;

    move-result-object v0

    .line 106
    .local v0, "startThread":Ljava/lang/Thread;
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    goto :goto_0
.end method

.method private static initializeNetworkMonitoring()V
    .locals 5

    .prologue
    const/4 v3, 0x1

    const/4 v4, 0x0

    .line 117
    sget-boolean v2, Lcom/splunk/mint/Mint;->networkMonitoringEnabled:Z

    if-eqz v2, :cond_0

    .line 119
    sget-boolean v2, Lcom/splunk/mint/Mint;->triedToInitNet:Z

    if-nez v2, :cond_0

    invoke-static {}, Lcom/splunk/mint/network/NetLogManager;->deviceSupporsNetworkMonitoring()Z

    move-result v2

    if-eqz v2, :cond_0

    sget-object v2, Lcom/splunk/mint/Properties$RemoteSettingsProps;->netMonitoringEnabled:Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 121
    const-string v2, "Initializing Network Monitoring"

    invoke-static {v2}, Lcom/splunk/mint/Logger;->logInfo(Ljava/lang/String;)V

    .line 122
    sput-boolean v3, Lcom/splunk/mint/Mint;->triedToInitNet:Z

    .line 124
    :try_start_0
    new-instance v2, Lcom/splunk/mint/network/http/MonitorableURLStreamHandlerFactory;

    sget-object v3, Lcom/splunk/mint/Mint;->registry:Lcom/splunk/mint/network/MonitorRegistry;

    invoke-direct {v2, v3}, Lcom/splunk/mint/network/http/MonitorableURLStreamHandlerFactory;-><init>(Lcom/splunk/mint/network/MonitorRegistry;)V

    invoke-static {v2}, Ljava/net/URL;->setURLStreamHandlerFactory(Ljava/net/URLStreamHandlerFactory;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 131
    .local v0, "e":Ljava/lang/Exception;
    :goto_0
    :try_start_1
    new-instance v1, Lcom/splunk/mint/network/socket/MonitoringSocketFactory;

    sget-object v2, Lcom/splunk/mint/Mint;->registry:Lcom/splunk/mint/network/MonitorRegistry;

    invoke-direct {v1, v2}, Lcom/splunk/mint/network/socket/MonitoringSocketFactory;-><init>(Lcom/splunk/mint/network/MonitorRegistry;)V

    .line 132
    .local v1, "factory":Ljava/net/SocketImplFactory;
    invoke-static {v1}, Ljava/net/Socket;->setSocketImplFactory(Ljava/net/SocketImplFactory;)V

    .line 133
    .end local v0    # "e":Ljava/lang/Exception;
    invoke-static {v1}, Ljava/net/ServerSocket;->setSocketFactory(Ljava/net/SocketImplFactory;)V

    .line 134
    invoke-static {v1}, Ljavax/net/ssl/SSLSocket;->setSocketImplFactory(Ljava/net/SocketImplFactory;)V

    .line 135
    invoke-static {v1}, Ljavax/net/ssl/SSLServerSocket;->setSocketFactory(Ljava/net/SocketImplFactory;)V

    .line 136
    const/4 v2, 0x1

    sput-boolean v2, Lcom/splunk/mint/Mint;->netInitializedSuccessfully:Z
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    .line 143
    .end local v1    # "factory":Ljava/net/SocketImplFactory;
    :goto_1
    sget-boolean v2, Lcom/splunk/mint/Mint;->netInitializedSuccessfully:Z

    if-eqz v2, :cond_0

    .line 144
    const-string v2, "Network monitoring was initialized successfully!"

    invoke-static {v2}, Lcom/splunk/mint/Logger;->logInfo(Ljava/lang/String;)V

    .line 148
    :cond_0
    return-void

    .line 125
    :catch_0
    move-exception v0

    .line 126
    .restart local v0    # "e":Ljava/lang/Exception;
    sput-boolean v4, Lcom/splunk/mint/Mint;->netInitializedSuccessfully:Z

    .line 127
    const-string v2, "Unable to set URLStreamHandlerFactory."

    invoke-static {v2}, Lcom/splunk/mint/Logger;->logWarning(Ljava/lang/String;)V

    goto :goto_0

    .line 137
    :catch_1
    move-exception v0

    .line 139
    .local v0, "e":Ljava/io/IOException;
    sput-boolean v4, Lcom/splunk/mint/Mint;->netInitializedSuccessfully:Z

    goto :goto_1
.end method

.method private static installExceptionHandler()V
    .locals 2

    .prologue
    .line 606
    const-string v1, "Registering the exception handler"

    invoke-static {v1}, Lcom/splunk/mint/Logger;->logInfo(Ljava/lang/String;)V

    .line 607
    invoke-static {}, Ljava/lang/Thread;->getDefaultUncaughtExceptionHandler()Ljava/lang/Thread$UncaughtExceptionHandler;

    move-result-object v0

    .line 608
    .local v0, "currentHandler":Ljava/lang/Thread$UncaughtExceptionHandler;
    instance-of v1, v0, Lcom/splunk/mint/ExceptionHandler;

    if-nez v1, :cond_0

    .line 610
    new-instance v1, Lcom/splunk/mint/ExceptionHandler;

    invoke-direct {v1, v0}, Lcom/splunk/mint/ExceptionHandler;-><init>(Ljava/lang/Thread$UncaughtExceptionHandler;)V

    invoke-static {v1}, Ljava/lang/Thread;->setDefaultUncaughtExceptionHandler(Ljava/lang/Thread$UncaughtExceptionHandler;)V

    .line 613
    :cond_0
    return-void
.end method

.method public static leaveBreadcrumb(Ljava/lang/String;)V
    .locals 1
    .param p0, "breadcrumb"    # Ljava/lang/String;

    .prologue
    .line 256
    invoke-static {}, Lcom/splunk/mint/Properties;->isPluginInitialized()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 257
    if-eqz p0, :cond_0

    .line 258
    sget-object v0, Lcom/splunk/mint/Properties;->breadcrumbs:Lcom/splunk/mint/BreadcrumbsLimited;

    invoke-virtual {v0, p0}, Lcom/splunk/mint/BreadcrumbsLimited;->addToList(Ljava/lang/String;)Z

    .line 261
    :cond_0
    return-void
.end method

.method public static logEvent(Ljava/lang/String;)V
    .locals 2
    .param p0, "eventName"    # Ljava/lang/String;

    .prologue
    .line 284
    invoke-static {}, Lcom/splunk/mint/Properties;->isPluginInitialized()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 285
    if-eqz p0, :cond_0

    .line 286
    invoke-static {p0}, Lcom/splunk/mint/ActionEvent;->createEvent(Ljava/lang/String;)Lcom/splunk/mint/ActionEvent;

    move-result-object v0

    .line 287
    .local v0, "event":Lcom/splunk/mint/ActionEvent;
    new-instance v1, Lcom/splunk/mint/DataSaver;

    invoke-direct {v1}, Lcom/splunk/mint/DataSaver;-><init>()V

    invoke-virtual {v0, v1}, Lcom/splunk/mint/ActionEvent;->save(Lcom/splunk/mint/DataSaver;)V

    .line 290
    .end local v0    # "event":Lcom/splunk/mint/ActionEvent;
    :cond_0
    return-void
.end method

.method public static logEvent(Ljava/lang/String;Lcom/splunk/mint/MintLogLevel;)V
    .locals 2
    .param p0, "eventName"    # Ljava/lang/String;
    .param p1, "logLevel"    # Lcom/splunk/mint/MintLogLevel;

    .prologue
    .line 301
    invoke-static {}, Lcom/splunk/mint/Properties;->isPluginInitialized()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 302
    if-eqz p0, :cond_0

    .line 303
    invoke-static {p0, p1}, Lcom/splunk/mint/ActionEvent;->createEvent(Ljava/lang/String;Lcom/splunk/mint/MintLogLevel;)Lcom/splunk/mint/ActionEvent;

    move-result-object v0

    .line 304
    .local v0, "event":Lcom/splunk/mint/ActionEvent;
    new-instance v1, Lcom/splunk/mint/DataSaver;

    invoke-direct {v1}, Lcom/splunk/mint/DataSaver;-><init>()V

    invoke-virtual {v0, v1}, Lcom/splunk/mint/ActionEvent;->save(Lcom/splunk/mint/DataSaver;)V

    .line 307
    .end local v0    # "event":Lcom/splunk/mint/ActionEvent;
    :cond_0
    return-void
.end method

.method public static logException(Ljava/lang/Exception;)V
    .locals 2
    .param p0, "ex"    # Ljava/lang/Exception;

    .prologue
    .line 503
    new-instance v0, Ljava/util/HashMap;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    .line 504
    .local v0, "extraData":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;"
    invoke-static {v0, p0}, Lcom/splunk/mint/Mint;->logExceptionMap(Ljava/util/HashMap;Ljava/lang/Exception;)V

    .line 505
    return-void
.end method

.method public static logExceptionMap(Ljava/util/HashMap;Ljava/lang/Exception;)V
    .locals 7
    .param p1, "exception"    # Ljava/lang/Exception;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/Exception;",
            ")V"
        }
    .end annotation

    .prologue
    .line 480
    .local p0, "customData":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;"
    invoke-static {}, Lcom/splunk/mint/Properties;->isPluginInitialized()Z

    move-result v4

    if-eqz v4, :cond_0

    .line 481
    new-instance v3, Ljava/io/StringWriter;

    invoke-direct {v3}, Ljava/io/StringWriter;-><init>()V

    .line 482
    .local v3, "stacktrace":Ljava/io/Writer;
    new-instance v2, Ljava/io/PrintWriter;

    invoke-direct {v2, v3}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V

    .line 484
    .local v2, "printWriter":Ljava/io/PrintWriter;
    invoke-virtual {p1, v2}, Ljava/lang/Exception;->printStackTrace(Ljava/io/PrintWriter;)V

    .line 486
    new-instance v1, Lcom/splunk/mint/ExtraData;

    invoke-direct {v1, p0}, Lcom/splunk/mint/ExtraData;-><init>(Ljava/util/HashMap;)V

    .line 488
    .local v1, "mExtraData":Lcom/splunk/mint/ExtraData;
    new-instance v0, Lcom/splunk/mint/ActionError;

    sget-object v4, Lcom/splunk/mint/EnumActionType;->error:Lcom/splunk/mint/EnumActionType;

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v5

    sget-object v6, Lcom/splunk/mint/EnumExceptionType;->HANDLED:Lcom/splunk/mint/EnumExceptionType;

    invoke-direct {v0, v4, v5, v6, v1}, Lcom/splunk/mint/ActionError;-><init>(Lcom/splunk/mint/EnumActionType;Ljava/lang/String;Lcom/splunk/mint/EnumExceptionType;Lcom/splunk/mint/ExtraData;)V

    .line 491
    .local v0, "mCrashData":Lcom/splunk/mint/ActionError;
    new-instance v4, Lcom/splunk/mint/DataSaver;

    invoke-direct {v4}, Lcom/splunk/mint/DataSaver;-><init>()V

    invoke-virtual {v0, v4}, Lcom/splunk/mint/ActionError;->save(Lcom/splunk/mint/DataSaver;)V

    .line 493
    .end local v0    # "mCrashData":Lcom/splunk/mint/ActionError;
    .end local v1    # "mExtraData":Lcom/splunk/mint/ExtraData;
    .end local v2    # "printWriter":Ljava/io/PrintWriter;
    .end local v3    # "stacktrace":Ljava/io/Writer;
    :cond_0
    return-void
.end method

.method public static logExceptionMessage(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V
    .locals 2
    .param p0, "key"    # Ljava/lang/String;
    .param p1, "value"    # Ljava/lang/String;
    .param p2, "exception"    # Ljava/lang/Exception;

    .prologue
    .line 518
    new-instance v0, Ljava/util/HashMap;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    .line 519
    .local v0, "extraData":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;"
    if-eqz p0, :cond_0

    if-eqz p1, :cond_0

    .line 520
    invoke-virtual {v0, p0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 522
    :cond_0
    invoke-static {v0, p2}, Lcom/splunk/mint/Mint;->logExceptionMap(Ljava/util/HashMap;Ljava/lang/Exception;)V

    .line 523
    return-void
.end method

.method private static logView(Ljava/lang/String;)V
    .locals 2
    .param p0, "view"    # Ljava/lang/String;

    .prologue
    .line 270
    invoke-static {}, Lcom/splunk/mint/Properties;->isPluginInitialized()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 271
    if-eqz p0, :cond_0

    .line 272
    invoke-static {p0}, Lcom/splunk/mint/ActionView;->logView(Ljava/lang/String;)Lcom/splunk/mint/ActionView;

    move-result-object v0

    new-instance v1, Lcom/splunk/mint/DataSaver;

    invoke-direct {v1}, Lcom/splunk/mint/DataSaver;-><init>()V

    invoke-virtual {v0, v1}, Lcom/splunk/mint/ActionView;->save(Lcom/splunk/mint/DataSaver;)V

    .line 275
    :cond_0
    return-void
.end method

.method public static removeExtraData(Ljava/lang/String;)V
    .locals 1
    .param p0, "key"    # Ljava/lang/String;

    .prologue
    .line 423
    invoke-static {}, Lcom/splunk/mint/Properties;->isPluginInitialized()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 424
    if-eqz p0, :cond_0

    .line 425
    sget-object v0, Lcom/splunk/mint/Properties;->extraData:Lcom/splunk/mint/ExtraData;

    invoke-virtual {v0, p0}, Lcom/splunk/mint/ExtraData;->removeKey(Ljava/lang/String;)Z

    .line 428
    :cond_0
    return-void
.end method

.method public static setLogging(I)V
    .locals 1
    .param p0, "lines"    # I

    .prologue
    .line 542
    if-lez p0, :cond_0

    .line 543
    const/4 v0, 0x1

    sput-boolean v0, Lcom/splunk/mint/Properties;->SEND_LOG:Z

    .line 544
    sput p0, Lcom/splunk/mint/Properties;->LOG_LINES:I

    .line 546
    :cond_0
    return-void
.end method

.method public static setLogging(ILjava/lang/String;)V
    .locals 1
    .param p0, "lines"    # I
    .param p1, "filter"    # Ljava/lang/String;

    .prologue
    .line 574
    if-eqz p1, :cond_0

    if-lez p0, :cond_0

    .line 575
    const/4 v0, 0x1

    sput-boolean v0, Lcom/splunk/mint/Properties;->SEND_LOG:Z

    .line 576
    sput p0, Lcom/splunk/mint/Properties;->LOG_LINES:I

    .line 577
    sput-object p1, Lcom/splunk/mint/Properties;->LOG_FILTER:Ljava/lang/String;

    .line 579
    :cond_0
    return-void
.end method

.method public static setLogging(Ljava/lang/String;)V
    .locals 1
    .param p0, "filter"    # Ljava/lang/String;

    .prologue
    .line 557
    if-eqz p0, :cond_0

    .line 558
    const/4 v0, 0x1

    sput-boolean v0, Lcom/splunk/mint/Properties;->SEND_LOG:Z

    .line 559
    sput-object p0, Lcom/splunk/mint/Properties;->LOG_FILTER:Ljava/lang/String;

    .line 561
    :cond_0
    return-void
.end method

.method public static final setMintCallback(Lcom/splunk/mint/MintCallback;)V
    .locals 0
    .param p0, "mintCallback"    # Lcom/splunk/mint/MintCallback;

    .prologue
    .line 246
    sput-object p0, Lcom/splunk/mint/Mint;->mintCallback:Lcom/splunk/mint/MintCallback;

    .line 247
    return-void
.end method

.method public static setUserIdentifier(Ljava/lang/String;)V
    .locals 0
    .param p0, "userIdentifier"    # Ljava/lang/String;

    .prologue
    .line 316
    sput-object p0, Lcom/splunk/mint/Properties;->userIdentifier:Ljava/lang/String;

    .line 317
    return-void
.end method

.method public static startSession(Landroid/content/Context;)V
    .locals 2
    .param p0, "context"    # Landroid/content/Context;

    .prologue
    .line 170
    if-nez p0, :cond_0

    .line 171
    const-string v0, "Context is null!"

    invoke-static {v0}, Lcom/splunk/mint/Logger;->logWarning(Ljava/lang/String;)V

    .line 195
    :goto_0
    return-void

    .line 175
    :cond_0
    sget-boolean v0, Lcom/splunk/mint/Mint;->isSessionActive:Z

    if-nez v0, :cond_1

    .line 176
    const/4 v0, 0x1

    sput-boolean v0, Lcom/splunk/mint/Mint;->isSessionActive:Z

    .line 179
    invoke-static {p0}, Lcom/splunk/mint/Properties;->initialize(Landroid/content/Context;)V

    .line 183
    :cond_1
    new-instance v0, Lcom/splunk/mint/LowPriorityThreadFactory;

    invoke-direct {v0}, Lcom/splunk/mint/LowPriorityThreadFactory;-><init>()V

    new-instance v1, Lcom/splunk/mint/Mint$2;

    invoke-direct {v1, p0}, Lcom/splunk/mint/Mint$2;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Lcom/splunk/mint/LowPriorityThreadFactory;->newThread(Ljava/lang/Runnable;)Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    goto :goto_0
.end method

.method public static transactionCancel(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2
    .param p0, "name"    # Ljava/lang/String;
    .param p1, "reason"    # Ljava/lang/String;

    .prologue
    .line 365
    invoke-static {}, Lcom/splunk/mint/Properties;->isPluginInitialized()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 366
    if-eqz p0, :cond_0

    .line 367
    invoke-static {p0, p1}, Lcom/splunk/mint/ActionTransactionStop;->createTransactionCancel(Ljava/lang/String;Ljava/lang/String;)Lcom/splunk/mint/ActionTransactionStop;

    move-result-object v0

    .line 368
    .local v0, "mTransactionStop":Lcom/splunk/mint/ActionTransactionStop;
    new-instance v1, Lcom/splunk/mint/DataSaver;

    invoke-direct {v1}, Lcom/splunk/mint/DataSaver;-><init>()V

    invoke-virtual {v0, v1}, Lcom/splunk/mint/ActionTransactionStop;->save(Lcom/splunk/mint/DataSaver;)V

    .line 371
    .end local v0    # "mTransactionStop":Lcom/splunk/mint/ActionTransactionStop;
    :cond_0
    return-void
.end method

.method public static transactionStart(Ljava/lang/String;)V
    .locals 2
    .param p0, "name"    # Ljava/lang/String;

    .prologue
    .line 333
    invoke-static {}, Lcom/splunk/mint/Properties;->isPluginInitialized()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 334
    if-eqz p0, :cond_0

    .line 335
    invoke-static {p0}, Lcom/splunk/mint/ActionTransactionStart;->createTransactionStart(Ljava/lang/String;)Lcom/splunk/mint/ActionTransactionStart;

    move-result-object v0

    .line 336
    .local v0, "mTransactionStart":Lcom/splunk/mint/ActionTransactionStart;
    new-instance v1, Lcom/splunk/mint/DataSaver;

    invoke-direct {v1}, Lcom/splunk/mint/DataSaver;-><init>()V

    invoke-virtual {v0, v1}, Lcom/splunk/mint/ActionTransactionStart;->save(Lcom/splunk/mint/DataSaver;)V

    .line 339
    .end local v0    # "mTransactionStart":Lcom/splunk/mint/ActionTransactionStart;
    :cond_0
    return-void
.end method

.method public static transactionStop(Ljava/lang/String;)V
    .locals 2
    .param p0, "name"    # Ljava/lang/String;

    .prologue
    .line 348
    invoke-static {}, Lcom/splunk/mint/Properties;->isPluginInitialized()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 349
    if-eqz p0, :cond_0

    .line 350
    invoke-static {p0}, Lcom/splunk/mint/ActionTransactionStop;->createTransactionStop(Ljava/lang/String;)Lcom/splunk/mint/ActionTransactionStop;

    move-result-object v0

    .line 351
    .local v0, "mTransactionStop":Lcom/splunk/mint/ActionTransactionStop;
    new-instance v1, Lcom/splunk/mint/DataSaver;

    invoke-direct {v1}, Lcom/splunk/mint/DataSaver;-><init>()V

    invoke-virtual {v0, v1}, Lcom/splunk/mint/ActionTransactionStop;->save(Lcom/splunk/mint/DataSaver;)V

    .line 354
    .end local v0    # "mTransactionStop":Lcom/splunk/mint/ActionTransactionStop;
    :cond_0
    return-void
.end method


# virtual methods
.method public getRegistry()Lcom/splunk/mint/network/MonitorRegistry;
    .locals 1

    .prologue
    .line 153
    sget-object v0, Lcom/splunk/mint/Mint;->registry:Lcom/splunk/mint/network/MonitorRegistry;

    if-nez v0, :cond_0

    .line 154
    new-instance v0, Lcom/splunk/mint/network/MonitorRegistry;

    invoke-direct {v0}, Lcom/splunk/mint/network/MonitorRegistry;-><init>()V

    sput-object v0, Lcom/splunk/mint/Mint;->registry:Lcom/splunk/mint/network/MonitorRegistry;

    .line 156
    :cond_0
    sget-object v0, Lcom/splunk/mint/Mint;->registry:Lcom/splunk/mint/network/MonitorRegistry;

    return-object v0
.end method
