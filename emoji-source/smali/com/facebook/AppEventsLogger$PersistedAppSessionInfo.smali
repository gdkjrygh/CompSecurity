.class Lcom/facebook/AppEventsLogger$PersistedAppSessionInfo;
.super Ljava/lang/Object;
.source "AppEventsLogger.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/AppEventsLogger;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "PersistedAppSessionInfo"
.end annotation


# static fields
.field private static final PERSISTED_SESSION_INFO_FILENAME:Ljava/lang/String; = "AppEventsLogger.persistedsessioninfo"

.field private static final appSessionInfoFlushRunnable:Ljava/lang/Runnable;

.field private static appSessionInfoMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Lcom/facebook/AppEventsLogger$AccessTokenAppIdPair;",
            "Lcom/facebook/FacebookTimeSpentData;",
            ">;"
        }
    .end annotation
.end field

.field private static hasChanges:Z

.field private static isLoaded:Z

.field private static final staticLock:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 1350
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/facebook/AppEventsLogger$PersistedAppSessionInfo;->staticLock:Ljava/lang/Object;

    .line 1351
    sput-boolean v1, Lcom/facebook/AppEventsLogger$PersistedAppSessionInfo;->hasChanges:Z

    .line 1352
    sput-boolean v1, Lcom/facebook/AppEventsLogger$PersistedAppSessionInfo;->isLoaded:Z

    .line 1355
    new-instance v0, Lcom/facebook/AppEventsLogger$PersistedAppSessionInfo$1;

    invoke-direct {v0}, Lcom/facebook/AppEventsLogger$PersistedAppSessionInfo$1;-><init>()V

    sput-object v0, Lcom/facebook/AppEventsLogger$PersistedAppSessionInfo;->appSessionInfoFlushRunnable:Ljava/lang/Runnable;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    .prologue
    .line 1346
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static getTimeSpentData(Landroid/content/Context;Lcom/facebook/AppEventsLogger$AccessTokenAppIdPair;)Lcom/facebook/FacebookTimeSpentData;
    .locals 2
    .param p0, "context"    # Landroid/content/Context;
    .param p1, "accessTokenAppId"    # Lcom/facebook/AppEventsLogger$AccessTokenAppIdPair;

    .prologue
    .line 1454
    invoke-static {p0}, Lcom/facebook/AppEventsLogger$PersistedAppSessionInfo;->restoreAppSessionInformation(Landroid/content/Context;)V

    .line 1455
    const/4 v0, 0x0

    .line 1457
    .local v0, "result":Lcom/facebook/FacebookTimeSpentData;
    sget-object v1, Lcom/facebook/AppEventsLogger$PersistedAppSessionInfo;->appSessionInfoMap:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .end local v0    # "result":Lcom/facebook/FacebookTimeSpentData;
    check-cast v0, Lcom/facebook/FacebookTimeSpentData;

    .line 1458
    .restart local v0    # "result":Lcom/facebook/FacebookTimeSpentData;
    if-nez v0, :cond_0

    .line 1459
    new-instance v0, Lcom/facebook/FacebookTimeSpentData;

    .end local v0    # "result":Lcom/facebook/FacebookTimeSpentData;
    invoke-direct {v0}, Lcom/facebook/FacebookTimeSpentData;-><init>()V

    .line 1460
    .restart local v0    # "result":Lcom/facebook/FacebookTimeSpentData;
    sget-object v1, Lcom/facebook/AppEventsLogger$PersistedAppSessionInfo;->appSessionInfoMap:Ljava/util/Map;

    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1463
    :cond_0
    return-object v0
.end method

.method static onResume(Landroid/content/Context;Lcom/facebook/AppEventsLogger$AccessTokenAppIdPair;Lcom/facebook/AppEventsLogger;JLjava/lang/String;)V
    .locals 3
    .param p0, "context"    # Landroid/content/Context;
    .param p1, "accessTokenAppId"    # Lcom/facebook/AppEventsLogger$AccessTokenAppIdPair;
    .param p2, "logger"    # Lcom/facebook/AppEventsLogger;
    .param p3, "eventTime"    # J
    .param p5, "sourceApplicationInfo"    # Ljava/lang/String;

    .prologue
    .line 1430
    sget-object v2, Lcom/facebook/AppEventsLogger$PersistedAppSessionInfo;->staticLock:Ljava/lang/Object;

    monitor-enter v2

    .line 1431
    :try_start_0
    invoke-static {p0, p1}, Lcom/facebook/AppEventsLogger$PersistedAppSessionInfo;->getTimeSpentData(Landroid/content/Context;Lcom/facebook/AppEventsLogger$AccessTokenAppIdPair;)Lcom/facebook/FacebookTimeSpentData;

    move-result-object v0

    .line 1432
    .local v0, "timeSpentData":Lcom/facebook/FacebookTimeSpentData;
    invoke-virtual {v0, p2, p3, p4, p5}, Lcom/facebook/FacebookTimeSpentData;->onResume(Lcom/facebook/AppEventsLogger;JLjava/lang/String;)V

    .line 1433
    invoke-static {}, Lcom/facebook/AppEventsLogger$PersistedAppSessionInfo;->onTimeSpentDataUpdate()V

    .line 1434
    monitor-exit v2

    .line 1435
    return-void

    .line 1434
    .end local v0    # "timeSpentData":Lcom/facebook/FacebookTimeSpentData;
    :catchall_0
    move-exception v1

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method static onSuspend(Landroid/content/Context;Lcom/facebook/AppEventsLogger$AccessTokenAppIdPair;Lcom/facebook/AppEventsLogger;J)V
    .locals 3
    .param p0, "context"    # Landroid/content/Context;
    .param p1, "accessTokenAppId"    # Lcom/facebook/AppEventsLogger$AccessTokenAppIdPair;
    .param p2, "logger"    # Lcom/facebook/AppEventsLogger;
    .param p3, "eventTime"    # J

    .prologue
    .line 1443
    sget-object v2, Lcom/facebook/AppEventsLogger$PersistedAppSessionInfo;->staticLock:Ljava/lang/Object;

    monitor-enter v2

    .line 1444
    :try_start_0
    invoke-static {p0, p1}, Lcom/facebook/AppEventsLogger$PersistedAppSessionInfo;->getTimeSpentData(Landroid/content/Context;Lcom/facebook/AppEventsLogger$AccessTokenAppIdPair;)Lcom/facebook/FacebookTimeSpentData;

    move-result-object v0

    .line 1445
    .local v0, "timeSpentData":Lcom/facebook/FacebookTimeSpentData;
    invoke-virtual {v0, p2, p3, p4}, Lcom/facebook/FacebookTimeSpentData;->onSuspend(Lcom/facebook/AppEventsLogger;J)V

    .line 1446
    invoke-static {}, Lcom/facebook/AppEventsLogger$PersistedAppSessionInfo;->onTimeSpentDataUpdate()V

    .line 1447
    monitor-exit v2

    .line 1448
    return-void

    .line 1447
    .end local v0    # "timeSpentData":Lcom/facebook/FacebookTimeSpentData;
    :catchall_0
    move-exception v1

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method private static onTimeSpentDataUpdate()V
    .locals 5

    .prologue
    .line 1467
    sget-boolean v0, Lcom/facebook/AppEventsLogger$PersistedAppSessionInfo;->hasChanges:Z

    if-nez v0, :cond_0

    .line 1468
    const/4 v0, 0x1

    sput-boolean v0, Lcom/facebook/AppEventsLogger$PersistedAppSessionInfo;->hasChanges:Z

    .line 1469
    # getter for: Lcom/facebook/AppEventsLogger;->backgroundExecutor:Ljava/util/concurrent/ScheduledThreadPoolExecutor;
    invoke-static {}, Lcom/facebook/AppEventsLogger;->access$1400()Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    move-result-object v0

    sget-object v1, Lcom/facebook/AppEventsLogger$PersistedAppSessionInfo;->appSessionInfoFlushRunnable:Ljava/lang/Runnable;

    const-wide/16 v2, 0x1e

    sget-object v4, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v1, v2, v3, v4}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 1474
    :cond_0
    return-void
.end method

.method private static restoreAppSessionInformation(Landroid/content/Context;)V
    .locals 7
    .param p0, "context"    # Landroid/content/Context;

    .prologue
    .line 1364
    const/4 v1, 0x0

    .line 1366
    .local v1, "ois":Ljava/io/ObjectInputStream;
    sget-object v4, Lcom/facebook/AppEventsLogger$PersistedAppSessionInfo;->staticLock:Ljava/lang/Object;

    monitor-enter v4

    .line 1367
    :try_start_0
    sget-boolean v3, Lcom/facebook/AppEventsLogger$PersistedAppSessionInfo;->isLoaded:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v3, :cond_1

    .line 1369
    :try_start_1
    new-instance v2, Ljava/io/ObjectInputStream;

    const-string v3, "AppEventsLogger.persistedsessioninfo"

    .line 1371
    invoke-virtual {p0, v3}, Landroid/content/Context;->openFileInput(Ljava/lang/String;)Ljava/io/FileInputStream;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/io/ObjectInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_1
    .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 1373
    .end local v1    # "ois":Ljava/io/ObjectInputStream;
    .local v2, "ois":Ljava/io/ObjectInputStream;
    :try_start_2
    invoke-virtual {v2}, Ljava/io/ObjectInputStream;->readObject()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/HashMap;

    sput-object v3, Lcom/facebook/AppEventsLogger$PersistedAppSessionInfo;->appSessionInfoMap:Ljava/util/Map;

    .line 1374
    sget-object v3, Lcom/facebook/LoggingBehavior;->APP_EVENTS:Lcom/facebook/LoggingBehavior;

    const-string v5, "AppEvents"

    const-string v6, "App session info loaded"

    invoke-static {v3, v5, v6}, Lcom/facebook/internal/Logger;->log(Lcom/facebook/LoggingBehavior;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/io/FileNotFoundException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    .line 1382
    :try_start_3
    invoke-static {v2}, Lcom/facebook/internal/Utility;->closeQuietly(Ljava/io/Closeable;)V

    .line 1383
    const-string v3, "AppEventsLogger.persistedsessioninfo"

    invoke-virtual {p0, v3}, Landroid/content/Context;->deleteFile(Ljava/lang/String;)Z

    .line 1384
    sget-object v3, Lcom/facebook/AppEventsLogger$PersistedAppSessionInfo;->appSessionInfoMap:Ljava/util/Map;

    if-nez v3, :cond_0

    .line 1385
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    sput-object v3, Lcom/facebook/AppEventsLogger$PersistedAppSessionInfo;->appSessionInfoMap:Ljava/util/Map;

    .line 1391
    :cond_0
    const/4 v3, 0x1

    sput-boolean v3, Lcom/facebook/AppEventsLogger$PersistedAppSessionInfo;->isLoaded:Z

    .line 1392
    const/4 v3, 0x0

    sput-boolean v3, Lcom/facebook/AppEventsLogger$PersistedAppSessionInfo;->hasChanges:Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    move-object v1, v2

    .line 1395
    .end local v2    # "ois":Ljava/io/ObjectInputStream;
    .restart local v1    # "ois":Ljava/io/ObjectInputStream;
    :cond_1
    :goto_0
    :try_start_4
    monitor-exit v4

    .line 1396
    return-void

    .line 1378
    :catch_0
    move-exception v3

    .line 1382
    :goto_1
    invoke-static {v1}, Lcom/facebook/internal/Utility;->closeQuietly(Ljava/io/Closeable;)V

    .line 1383
    const-string v3, "AppEventsLogger.persistedsessioninfo"

    invoke-virtual {p0, v3}, Landroid/content/Context;->deleteFile(Ljava/lang/String;)Z

    .line 1384
    sget-object v3, Lcom/facebook/AppEventsLogger$PersistedAppSessionInfo;->appSessionInfoMap:Ljava/util/Map;

    if-nez v3, :cond_2

    .line 1385
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    sput-object v3, Lcom/facebook/AppEventsLogger$PersistedAppSessionInfo;->appSessionInfoMap:Ljava/util/Map;

    .line 1391
    :cond_2
    const/4 v3, 0x1

    sput-boolean v3, Lcom/facebook/AppEventsLogger$PersistedAppSessionInfo;->isLoaded:Z

    .line 1392
    const/4 v3, 0x0

    sput-boolean v3, Lcom/facebook/AppEventsLogger$PersistedAppSessionInfo;->hasChanges:Z

    goto :goto_0

    .line 1395
    :catchall_0
    move-exception v3

    :goto_2
    monitor-exit v4
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    throw v3

    .line 1379
    :catch_1
    move-exception v0

    .line 1380
    .local v0, "e":Ljava/lang/Exception;
    :goto_3
    :try_start_5
    # getter for: Lcom/facebook/AppEventsLogger;->TAG:Ljava/lang/String;
    invoke-static {}, Lcom/facebook/AppEventsLogger;->access$1300()Ljava/lang/String;

    move-result-object v3

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Got unexpected exception: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v3, v5}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 1382
    :try_start_6
    invoke-static {v1}, Lcom/facebook/internal/Utility;->closeQuietly(Ljava/io/Closeable;)V

    .line 1383
    const-string v3, "AppEventsLogger.persistedsessioninfo"

    invoke-virtual {p0, v3}, Landroid/content/Context;->deleteFile(Ljava/lang/String;)Z

    .line 1384
    sget-object v3, Lcom/facebook/AppEventsLogger$PersistedAppSessionInfo;->appSessionInfoMap:Ljava/util/Map;

    if-nez v3, :cond_3

    .line 1385
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    sput-object v3, Lcom/facebook/AppEventsLogger$PersistedAppSessionInfo;->appSessionInfoMap:Ljava/util/Map;

    .line 1391
    :cond_3
    const/4 v3, 0x1

    sput-boolean v3, Lcom/facebook/AppEventsLogger$PersistedAppSessionInfo;->isLoaded:Z

    .line 1392
    const/4 v3, 0x0

    sput-boolean v3, Lcom/facebook/AppEventsLogger$PersistedAppSessionInfo;->hasChanges:Z

    goto :goto_0

    .line 1382
    .end local v0    # "e":Ljava/lang/Exception;
    :catchall_1
    move-exception v3

    :goto_4
    invoke-static {v1}, Lcom/facebook/internal/Utility;->closeQuietly(Ljava/io/Closeable;)V

    .line 1383
    const-string v5, "AppEventsLogger.persistedsessioninfo"

    invoke-virtual {p0, v5}, Landroid/content/Context;->deleteFile(Ljava/lang/String;)Z

    .line 1384
    sget-object v5, Lcom/facebook/AppEventsLogger$PersistedAppSessionInfo;->appSessionInfoMap:Ljava/util/Map;

    if-nez v5, :cond_4

    .line 1385
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    sput-object v5, Lcom/facebook/AppEventsLogger$PersistedAppSessionInfo;->appSessionInfoMap:Ljava/util/Map;

    .line 1391
    :cond_4
    const/4 v5, 0x1

    sput-boolean v5, Lcom/facebook/AppEventsLogger$PersistedAppSessionInfo;->isLoaded:Z

    .line 1392
    const/4 v5, 0x0

    sput-boolean v5, Lcom/facebook/AppEventsLogger$PersistedAppSessionInfo;->hasChanges:Z

    throw v3
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 1395
    .end local v1    # "ois":Ljava/io/ObjectInputStream;
    .restart local v2    # "ois":Ljava/io/ObjectInputStream;
    :catchall_2
    move-exception v3

    move-object v1, v2

    .end local v2    # "ois":Ljava/io/ObjectInputStream;
    .restart local v1    # "ois":Ljava/io/ObjectInputStream;
    goto :goto_2

    .line 1382
    .end local v1    # "ois":Ljava/io/ObjectInputStream;
    .restart local v2    # "ois":Ljava/io/ObjectInputStream;
    :catchall_3
    move-exception v3

    move-object v1, v2

    .end local v2    # "ois":Ljava/io/ObjectInputStream;
    .restart local v1    # "ois":Ljava/io/ObjectInputStream;
    goto :goto_4

    .line 1379
    .end local v1    # "ois":Ljava/io/ObjectInputStream;
    .restart local v2    # "ois":Ljava/io/ObjectInputStream;
    :catch_2
    move-exception v0

    move-object v1, v2

    .end local v2    # "ois":Ljava/io/ObjectInputStream;
    .restart local v1    # "ois":Ljava/io/ObjectInputStream;
    goto :goto_3

    .line 1378
    .end local v1    # "ois":Ljava/io/ObjectInputStream;
    .restart local v2    # "ois":Ljava/io/ObjectInputStream;
    :catch_3
    move-exception v3

    move-object v1, v2

    .end local v2    # "ois":Ljava/io/ObjectInputStream;
    .restart local v1    # "ois":Ljava/io/ObjectInputStream;
    goto :goto_1
.end method

.method static saveAppSessionInformation(Landroid/content/Context;)V
    .locals 7
    .param p0, "context"    # Landroid/content/Context;

    .prologue
    .line 1399
    const/4 v1, 0x0

    .line 1401
    .local v1, "oos":Ljava/io/ObjectOutputStream;
    sget-object v4, Lcom/facebook/AppEventsLogger$PersistedAppSessionInfo;->staticLock:Ljava/lang/Object;

    monitor-enter v4

    .line 1402
    :try_start_0
    sget-boolean v3, Lcom/facebook/AppEventsLogger$PersistedAppSessionInfo;->hasChanges:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v3, :cond_0

    .line 1404
    :try_start_1
    new-instance v2, Ljava/io/ObjectOutputStream;

    new-instance v3, Ljava/io/BufferedOutputStream;

    const-string v5, "AppEventsLogger.persistedsessioninfo"

    const/4 v6, 0x0

    .line 1406
    invoke-virtual {p0, v5, v6}, Landroid/content/Context;->openFileOutput(Ljava/lang/String;I)Ljava/io/FileOutputStream;

    move-result-object v5

    invoke-direct {v3, v5}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V

    invoke-direct {v2, v3}, Ljava/io/ObjectOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 1411
    .end local v1    # "oos":Ljava/io/ObjectOutputStream;
    .local v2, "oos":Ljava/io/ObjectOutputStream;
    :try_start_2
    sget-object v3, Lcom/facebook/AppEventsLogger$PersistedAppSessionInfo;->appSessionInfoMap:Ljava/util/Map;

    invoke-virtual {v2, v3}, Ljava/io/ObjectOutputStream;->writeObject(Ljava/lang/Object;)V

    .line 1412
    const/4 v3, 0x0

    sput-boolean v3, Lcom/facebook/AppEventsLogger$PersistedAppSessionInfo;->hasChanges:Z

    .line 1413
    sget-object v3, Lcom/facebook/LoggingBehavior;->APP_EVENTS:Lcom/facebook/LoggingBehavior;

    const-string v5, "AppEvents"

    const-string v6, "App session info saved"

    invoke-static {v3, v5, v6}, Lcom/facebook/internal/Logger;->log(Lcom/facebook/LoggingBehavior;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    .line 1417
    :try_start_3
    invoke-static {v2}, Lcom/facebook/internal/Utility;->closeQuietly(Ljava/io/Closeable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    move-object v1, v2

    .line 1420
    .end local v2    # "oos":Ljava/io/ObjectOutputStream;
    .restart local v1    # "oos":Ljava/io/ObjectOutputStream;
    :cond_0
    :goto_0
    :try_start_4
    monitor-exit v4
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 1421
    return-void

    .line 1414
    :catch_0
    move-exception v0

    .line 1415
    .local v0, "e":Ljava/lang/Exception;
    :goto_1
    :try_start_5
    # getter for: Lcom/facebook/AppEventsLogger;->TAG:Ljava/lang/String;
    invoke-static {}, Lcom/facebook/AppEventsLogger;->access$1300()Ljava/lang/String;

    move-result-object v3

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Got unexpected exception: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v3, v5}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 1417
    :try_start_6
    invoke-static {v1}, Lcom/facebook/internal/Utility;->closeQuietly(Ljava/io/Closeable;)V

    goto :goto_0

    .line 1420
    .end local v0    # "e":Ljava/lang/Exception;
    :catchall_0
    move-exception v3

    :goto_2
    monitor-exit v4
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    throw v3

    .line 1417
    :catchall_1
    move-exception v3

    :goto_3
    :try_start_7
    invoke-static {v1}, Lcom/facebook/internal/Utility;->closeQuietly(Ljava/io/Closeable;)V

    throw v3
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 1420
    .end local v1    # "oos":Ljava/io/ObjectOutputStream;
    .restart local v2    # "oos":Ljava/io/ObjectOutputStream;
    :catchall_2
    move-exception v3

    move-object v1, v2

    .end local v2    # "oos":Ljava/io/ObjectOutputStream;
    .restart local v1    # "oos":Ljava/io/ObjectOutputStream;
    goto :goto_2

    .line 1417
    .end local v1    # "oos":Ljava/io/ObjectOutputStream;
    .restart local v2    # "oos":Ljava/io/ObjectOutputStream;
    :catchall_3
    move-exception v3

    move-object v1, v2

    .end local v2    # "oos":Ljava/io/ObjectOutputStream;
    .restart local v1    # "oos":Ljava/io/ObjectOutputStream;
    goto :goto_3

    .line 1414
    .end local v1    # "oos":Ljava/io/ObjectOutputStream;
    .restart local v2    # "oos":Ljava/io/ObjectOutputStream;
    :catch_1
    move-exception v0

    move-object v1, v2

    .end local v2    # "oos":Ljava/io/ObjectOutputStream;
    .restart local v1    # "oos":Ljava/io/ObjectOutputStream;
    goto :goto_1
.end method
