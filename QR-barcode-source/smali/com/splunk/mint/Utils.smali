.class Lcom/splunk/mint/Utils;
.super Ljava/lang/Object;
.source "Utils.java"


# static fields
.field protected static final CONNECTION:Ljava/lang/String; = "connection"

.field private static final Debug:I = 0x14

.field private static final Error:I = 0x3c

.field private static final Info:I = 0x1e

.field private static final LASTPINGTIME:Ljava/lang/String; = "LASTPINGTIME"

.field protected static final STATE:Ljava/lang/String; = "state"

.field private static final Verbose:I = 0xa

.field private static final Warning:I = 0x32

.field private static executor:Ljava/util/concurrent/ExecutorService; = null

.field private static final forceSendPingFile:Ljava/lang/String; = ".setForceSendPingOnNextStart"


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 219
    const/4 v0, 0x0

    sput-object v0, Lcom/splunk/mint/Utils;->executor:Ljava/util/concurrent/ExecutorService;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    .prologue
    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method protected static MD5(Ljava/lang/String;)Ljava/lang/String;
    .locals 4
    .param p0, "data"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .prologue
    .line 371
    const-string v1, "MD5"

    invoke-static {v1}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v0

    .line 373
    .local v0, "m":Ljava/security/MessageDigest;
    invoke-virtual {p0}, Ljava/lang/String;->getBytes()[B

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v3

    invoke-virtual {v0, v1, v2, v3}, Ljava/security/MessageDigest;->update([BII)V

    .line 374
    new-instance v1, Ljava/math/BigInteger;

    const/4 v2, 0x1

    invoke-virtual {v0}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v3

    invoke-direct {v1, v2, v3}, Ljava/math/BigInteger;-><init>(I[B)V

    const/16 v2, 0x10

    invoke-virtual {v1, v2}, Ljava/math/BigInteger;->toString(I)Ljava/lang/String;

    move-result-object v1

    return-object v1
.end method

.method protected static checkForRoot()Z
    .locals 9

    .prologue
    .line 347
    const/4 v4, 0x0

    .line 349
    .local v4, "foundSU":Z
    const/16 v7, 0x8

    new-array v2, v7, [Ljava/lang/String;

    const/4 v7, 0x0

    const-string v8, "/sbin/"

    aput-object v8, v2, v7

    const/4 v7, 0x1

    const-string v8, "/system/bin/"

    aput-object v8, v2, v7

    const/4 v7, 0x2

    const-string v8, "/system/xbin/"

    aput-object v8, v2, v7

    const/4 v7, 0x3

    const-string v8, "/data/local/xbin/"

    aput-object v8, v2, v7

    const/4 v7, 0x4

    const-string v8, "/data/local/bin/"

    aput-object v8, v2, v7

    const/4 v7, 0x5

    const-string v8, "/system/sd/xbin/"

    aput-object v8, v2, v7

    const/4 v7, 0x6

    const-string v8, "/system/bin/failsafe/"

    aput-object v8, v2, v7

    const/4 v7, 0x7

    const-string v8, "/data/local/"

    aput-object v8, v2, v7

    .line 351
    .local v2, "directories":[Ljava/lang/String;
    move-object v0, v2

    .local v0, "arr$":[Ljava/lang/String;
    array-length v6, v0

    .local v6, "len$":I
    const/4 v5, 0x0

    .local v5, "i$":I
    :goto_0
    if-ge v5, v6, :cond_0

    aget-object v1, v0, v5

    .line 352
    .local v1, "dir":Ljava/lang/String;
    new-instance v3, Ljava/io/File;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    const-string v8, "su"

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-direct {v3, v7}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 353
    .local v3, "file":Ljava/io/File;
    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    move-result v7

    if-eqz v7, :cond_1

    .line 354
    const/4 v4, 0x1

    .line 358
    .end local v1    # "dir":Ljava/lang/String;
    .end local v3    # "file":Ljava/io/File;
    :cond_0
    return v4

    .line 351
    .restart local v1    # "dir":Ljava/lang/String;
    .restart local v3    # "file":Ljava/io/File;
    :cond_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_0
.end method

.method protected static clearLastPingSentTime(Landroid/content/Context;)V
    .locals 4
    .param p0, "ctx"    # Landroid/content/Context;

    .prologue
    .line 257
    new-instance v2, Lcom/splunk/mint/LowPriorityThreadFactory;

    invoke-direct {v2}, Lcom/splunk/mint/LowPriorityThreadFactory;-><init>()V

    new-instance v3, Lcom/splunk/mint/Utils$3;

    invoke-direct {v3, p0}, Lcom/splunk/mint/Utils$3;-><init>(Landroid/content/Context;)V

    invoke-virtual {v2, v3}, Lcom/splunk/mint/LowPriorityThreadFactory;->newThread(Ljava/lang/Runnable;)Ljava/lang/Thread;

    move-result-object v1

    .line 269
    .local v1, "t":Ljava/lang/Thread;
    invoke-static {}, Lcom/splunk/mint/Utils;->getExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    .line 270
    .local v0, "executor":Ljava/util/concurrent/ExecutorService;
    if-eqz v1, :cond_0

    if-eqz v0, :cond_0

    .line 271
    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 274
    :cond_0
    return-void
.end method

.method public static convertLoggingLevelToInt(Lcom/splunk/mint/MintLogLevel;)I
    .locals 2
    .param p0, "level"    # Lcom/splunk/mint/MintLogLevel;

    .prologue
    const/16 v0, 0xa

    .line 97
    sget-object v1, Lcom/splunk/mint/MintLogLevel;->Debug:Lcom/splunk/mint/MintLogLevel;

    invoke-virtual {p0, v1}, Lcom/splunk/mint/MintLogLevel;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 98
    const/16 v0, 0x14

    .line 108
    :cond_0
    :goto_0
    return v0

    .line 99
    :cond_1
    sget-object v1, Lcom/splunk/mint/MintLogLevel;->Error:Lcom/splunk/mint/MintLogLevel;

    invoke-virtual {p0, v1}, Lcom/splunk/mint/MintLogLevel;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 100
    const/16 v0, 0x3c

    goto :goto_0

    .line 101
    :cond_2
    sget-object v1, Lcom/splunk/mint/MintLogLevel;->Info:Lcom/splunk/mint/MintLogLevel;

    invoke-virtual {p0, v1}, Lcom/splunk/mint/MintLogLevel;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 102
    const/16 v0, 0x1e

    goto :goto_0

    .line 103
    :cond_3
    sget-object v1, Lcom/splunk/mint/MintLogLevel;->Verbose:Lcom/splunk/mint/MintLogLevel;

    invoke-virtual {p0, v1}, Lcom/splunk/mint/MintLogLevel;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 105
    sget-object v1, Lcom/splunk/mint/MintLogLevel;->Warning:Lcom/splunk/mint/MintLogLevel;

    invoke-virtual {p0, v1}, Lcom/splunk/mint/MintLogLevel;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 106
    const/16 v0, 0x32

    goto :goto_0
.end method

.method public static final getCarrier(Landroid/content/Context;)Ljava/lang/String;
    .locals 4
    .param p0, "context"    # Landroid/content/Context;

    .prologue
    .line 405
    const-string v2, "phone"

    invoke-virtual {p0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/telephony/TelephonyManager;

    .line 406
    .local v1, "manager":Landroid/telephony/TelephonyManager;
    if-eqz v1, :cond_5

    .line 407
    const/4 v0, 0x0

    .line 408
    .local v0, "carrier":Ljava/lang/String;
    invoke-virtual {v1}, Landroid/telephony/TelephonyManager;->getSimState()I

    move-result v2

    const/4 v3, 0x5

    if-ne v2, v3, :cond_0

    .line 409
    invoke-virtual {v1}, Landroid/telephony/TelephonyManager;->getSimOperatorName()Ljava/lang/String;

    move-result-object v0

    .line 412
    :cond_0
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    if-nez v2, :cond_2

    .line 413
    :cond_1
    invoke-virtual {v1}, Landroid/telephony/TelephonyManager;->getNetworkOperatorName()Ljava/lang/String;

    move-result-object v0

    .line 416
    :cond_2
    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    if-nez v2, :cond_4

    .line 417
    :cond_3
    const-string v0, "unknown"

    .line 421
    .end local v0    # "carrier":Ljava/lang/String;
    :cond_4
    :goto_0
    return-object v0

    :cond_5
    const-string v0, "unknown"

    goto :goto_0
.end method

.method protected static getConnectionInfo(Landroid/content/Context;)Ljava/util/HashMap;
    .locals 6
    .param p0, "context"    # Landroid/content/Context;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 116
    new-instance v1, Ljava/util/HashMap;

    const/4 v4, 0x2

    invoke-direct {v1, v4}, Ljava/util/HashMap;-><init>(I)V

    .line 117
    .local v1, "infoMap":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;"
    const-string v4, "connection"

    const-string v5, "NA"

    invoke-virtual {v1, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 118
    const-string v4, "state"

    const-string v5, "NA"

    invoke-virtual {v1, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 120
    if-nez p0, :cond_1

    .line 121
    sget-boolean v4, Lcom/splunk/mint/Mint;->DEBUG:Z

    if-eqz v4, :cond_0

    .line 122
    const-string v4, "Context in getConnection is null!"

    invoke-static {v4}, Lcom/splunk/mint/Logger;->logError(Ljava/lang/String;)V

    .line 150
    :cond_0
    :goto_0
    return-object v1

    .line 125
    :cond_1
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v3

    .line 126
    .local v3, "packageManager":Landroid/content/pm/PackageManager;
    if-nez v3, :cond_2

    .line 127
    sget-boolean v4, Lcom/splunk/mint/Mint;->DEBUG:Z

    if-eqz v4, :cond_0

    .line 128
    const-string v4, "PackageManager in CheckNetworkConnection is null!"

    invoke-static {v4}, Lcom/splunk/mint/Logger;->logError(Ljava/lang/String;)V

    goto :goto_0

    .line 131
    :cond_2
    const-string v4, "android.permission.ACCESS_NETWORK_STATE"

    sget-object v5, Lcom/splunk/mint/Properties;->APP_PACKAGE:Ljava/lang/String;

    invoke-virtual {v3, v4, v5}, Landroid/content/pm/PackageManager;->checkPermission(Ljava/lang/String;Ljava/lang/String;)I

    move-result v4

    if-nez v4, :cond_0

    .line 132
    const-string v4, "connectivity"

    invoke-virtual {p0, v4}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/net/ConnectivityManager;

    .line 135
    .local v2, "mConnectivityManager":Landroid/net/ConnectivityManager;
    invoke-virtual {v2}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v0

    .line 136
    .local v0, "info":Landroid/net/NetworkInfo;
    if-eqz v0, :cond_5

    .line 137
    invoke-virtual {v0}, Landroid/net/NetworkInfo;->getSubtypeName()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_3

    invoke-virtual {v0}, Landroid/net/NetworkInfo;->getSubtypeName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    if-nez v4, :cond_4

    .line 138
    :cond_3
    const-string v4, "connection"

    invoke-virtual {v0}, Landroid/net/NetworkInfo;->getTypeName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 142
    :goto_1
    const-string v4, "state"

    invoke-virtual {v0}, Landroid/net/NetworkInfo;->getState()Landroid/net/NetworkInfo$State;

    move-result-object v5

    invoke-virtual {v5}, Landroid/net/NetworkInfo$State;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 140
    :cond_4
    const-string v4, "connection"

    invoke-virtual {v0}, Landroid/net/NetworkInfo;->getSubtypeName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 144
    :cond_5
    const-string v4, "connection"

    const-string v5, "No connection"

    invoke-virtual {v1, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0
.end method

.method private static getExecutor()Ljava/util/concurrent/ExecutorService;
    .locals 1

    .prologue
    .line 222
    sget-object v0, Lcom/splunk/mint/Utils;->executor:Ljava/util/concurrent/ExecutorService;

    if-nez v0, :cond_0

    .line 223
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    sput-object v0, Lcom/splunk/mint/Utils;->executor:Ljava/util/concurrent/ExecutorService;

    .line 224
    :cond_0
    sget-object v0, Lcom/splunk/mint/Utils;->executor:Ljava/util/concurrent/ExecutorService;

    return-object v0
.end method

.method protected static final getMilisFromStart()Ljava/lang/String;
    .locals 6

    .prologue
    .line 378
    const-wide/16 v0, 0x0

    .line 379
    .local v0, "ms_from_start":J
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sget-wide v4, Lcom/splunk/mint/Properties;->TIMESTAMP:J

    sub-long v0, v2, v4

    .line 380
    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v2

    return-object v2
.end method

.method public static getRandomSessionNumber()Ljava/lang/String;
    .locals 4

    .prologue
    .line 35
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    .line 36
    .local v0, "time":Ljava/lang/String;
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v1, v1, -0x8

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    .line 37
    return-object v0
.end method

.method protected static final getTime()Ljava/lang/String;
    .locals 6

    .prologue
    .line 328
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    .line 331
    .local v0, "time":Ljava/lang/String;
    :try_start_0
    const-string v1, "UTC"

    invoke-static {v1}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Calendar;->getInstance(Ljava/util/TimeZone;)Ljava/util/Calendar;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v2

    const-wide/16 v4, 0x3e8

    div-long/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 336
    :goto_0
    return-object v0

    .line 332
    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method protected static isGPSOn(Landroid/content/Context;)Lcom/splunk/mint/EnumStateStatus;
    .locals 5
    .param p0, "gContext"    # Landroid/content/Context;

    .prologue
    .line 309
    sget-object v0, Lcom/splunk/mint/EnumStateStatus;->ON:Lcom/splunk/mint/EnumStateStatus;

    .line 311
    .local v0, "gps_status":Lcom/splunk/mint/EnumStateStatus;
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    .line 312
    .local v2, "packageManager":Landroid/content/pm/PackageManager;
    const-string v3, "android.permission.ACCESS_FINE_LOCATION"

    sget-object v4, Lcom/splunk/mint/Properties;->APP_PACKAGE:Ljava/lang/String;

    invoke-virtual {v2, v3, v4}, Landroid/content/pm/PackageManager;->checkPermission(Ljava/lang/String;Ljava/lang/String;)I

    move-result v3

    if-nez v3, :cond_1

    .line 314
    const-string v3, "location"

    invoke-virtual {p0, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/location/LocationManager;

    .line 315
    .local v1, "locManager":Landroid/location/LocationManager;
    const-string v3, "gps"

    invoke-virtual {v1, v3}, Landroid/location/LocationManager;->isProviderEnabled(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 316
    sget-object v0, Lcom/splunk/mint/EnumStateStatus;->OFF:Lcom/splunk/mint/EnumStateStatus;

    .line 322
    .end local v1    # "locManager":Landroid/location/LocationManager;
    :cond_0
    :goto_0
    return-object v0

    .line 319
    :cond_1
    sget-object v0, Lcom/splunk/mint/EnumStateStatus;->NA:Lcom/splunk/mint/EnumStateStatus;

    goto :goto_0
.end method

.method public static final isKitKat()Z
    .locals 2

    .prologue
    .line 78
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x13

    if-ne v0, v1, :cond_0

    .line 79
    const/4 v0, 0x1

    .line 81
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static readFile(Ljava/lang/String;)Ljava/lang/String;
    .locals 7
    .param p0, "filePath"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .prologue
    .line 426
    if-nez p0, :cond_0

    .line 427
    new-instance v5, Ljava/lang/IllegalArgumentException;

    const-string v6, "filePath Argument is null"

    invoke-direct {v5, v6}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v5

    .line 429
    :cond_0
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 430
    .local v4, "sb1":Ljava/lang/StringBuilder;
    const/4 v1, 0x0

    .line 432
    .local v1, "input":Ljava/io/BufferedReader;
    :try_start_0
    new-instance v2, Ljava/io/BufferedReader;

    new-instance v5, Ljava/io/FileReader;

    invoke-direct {v5, p0}, Ljava/io/FileReader;-><init>(Ljava/lang/String;)V

    invoke-direct {v2, v5}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_3
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 433
    .end local v1    # "input":Ljava/io/BufferedReader;
    .local v2, "input":Ljava/io/BufferedReader;
    const/4 v3, 0x0

    .line 434
    .local v3, "line":Ljava/lang/String;
    :goto_0
    :try_start_1
    invoke-virtual {v2}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_2

    .line 436
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    .line 438
    :catch_0
    move-exception v0

    move-object v1, v2

    .line 439
    .end local v2    # "input":Ljava/io/BufferedReader;
    .end local v3    # "line":Ljava/lang/String;
    .local v0, "e":Ljava/lang/Exception;
    .restart local v1    # "input":Ljava/io/BufferedReader;
    :goto_1
    :try_start_2
    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 441
    .end local v0    # "e":Ljava/lang/Exception;
    :catchall_0
    move-exception v5

    :goto_2
    if-eqz v1, :cond_1

    .line 443
    :try_start_3
    invoke-virtual {v1}, Ljava/io/BufferedReader;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    .line 445
    :cond_1
    throw v5

    .line 441
    .end local v1    # "input":Ljava/io/BufferedReader;
    .restart local v2    # "input":Ljava/io/BufferedReader;
    .restart local v3    # "line":Ljava/lang/String;
    :cond_2
    if-eqz v2, :cond_3

    .line 443
    :try_start_4
    invoke-virtual {v2}, Ljava/io/BufferedReader;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1

    .line 449
    :cond_3
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    return-object v5

    .line 444
    :catch_1
    move-exception v0

    .line 445
    .local v0, "e":Ljava/io/IOException;
    throw v0

    .line 444
    .end local v0    # "e":Ljava/io/IOException;
    .end local v2    # "input":Ljava/io/BufferedReader;
    .end local v3    # "line":Ljava/lang/String;
    .restart local v1    # "input":Ljava/io/BufferedReader;
    :catch_2
    move-exception v0

    .line 445
    .restart local v0    # "e":Ljava/io/IOException;
    throw v0

    .line 441
    .end local v0    # "e":Ljava/io/IOException;
    .end local v1    # "input":Ljava/io/BufferedReader;
    .restart local v2    # "input":Ljava/io/BufferedReader;
    .restart local v3    # "line":Ljava/lang/String;
    :catchall_1
    move-exception v5

    move-object v1, v2

    .end local v2    # "input":Ljava/io/BufferedReader;
    .restart local v1    # "input":Ljava/io/BufferedReader;
    goto :goto_2

    .line 438
    .end local v3    # "line":Ljava/lang/String;
    :catch_3
    move-exception v0

    goto :goto_1
.end method

.method public static final readLogs()Ljava/lang/String;
    .locals 13

    .prologue
    .line 453
    sget v5, Lcom/splunk/mint/Properties;->LOG_LINES:I

    .line 454
    .local v5, "lines":I
    if-gez v5, :cond_0

    .line 455
    const/16 v5, 0x64

    .line 456
    :cond_0
    sget-object v2, Lcom/splunk/mint/Properties;->LOG_FILTER:Ljava/lang/String;

    .line 457
    .local v2, "filter":Ljava/lang/String;
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 459
    .local v7, "log":Ljava/lang/StringBuilder;
    :try_start_0
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v10

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "logcat -d "

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v11, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v10, v11}, Ljava/lang/Runtime;->exec(Ljava/lang/String;)Ljava/lang/Process;

    move-result-object v8

    .line 460
    .local v8, "process":Ljava/lang/Process;
    new-instance v0, Ljava/io/BufferedReader;

    new-instance v10, Ljava/io/InputStreamReader;

    invoke-virtual {v8}, Ljava/lang/Process;->getInputStream()Ljava/io/InputStream;

    move-result-object v11

    invoke-direct {v10, v11}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    invoke-direct {v0, v10}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    .line 461
    .local v0, "bufferedReader":Ljava/io/BufferedReader;
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 464
    .local v6, "linesList":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    :goto_0
    invoke-virtual {v0}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v4

    .local v4, "line":Ljava/lang/String;
    if-eqz v4, :cond_1

    .line 465
    invoke-interface {v6, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 479
    .end local v0    # "bufferedReader":Ljava/io/BufferedReader;
    .end local v4    # "line":Ljava/lang/String;
    .end local v6    # "linesList":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    .end local v8    # "process":Ljava/lang/Process;
    :catch_0
    move-exception v1

    .line 480
    .local v1, "e":Ljava/lang/Exception;
    const-string v10, "Error reading logcat output!"

    invoke-static {v10}, Lcom/splunk/mint/Logger;->logError(Ljava/lang/String;)V

    .line 481
    invoke-virtual {v1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v10

    .end local v1    # "e":Ljava/lang/Exception;
    :goto_1
    return-object v10

    .line 467
    .restart local v0    # "bufferedReader":Ljava/io/BufferedReader;
    .restart local v4    # "line":Ljava/lang/String;
    .restart local v6    # "linesList":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    .restart local v8    # "process":Ljava/lang/Process;
    :cond_1
    :try_start_1
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v10

    if-nez v10, :cond_2

    .line 468
    const-string v10, "You must add the android.permission.READ_LOGS permission to your manifest file!"

    goto :goto_1

    .line 470
    :cond_2
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v10

    sub-int v9, v10, v5

    .line 471
    .local v9, "start":I
    if-gez v9, :cond_3

    .line 472
    const/4 v9, 0x0

    .line 474
    :cond_3
    move v3, v9

    .local v3, "index":I
    :goto_2
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v10

    if-ge v3, v10, :cond_4

    .line 475
    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {v6, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    const-string v11, "\n"

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v7, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 474
    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    .line 477
    :cond_4
    const/4 v6, 0x0

    .line 478
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    move-result-object v10

    goto :goto_1
.end method

.method protected static setForceSendPingOnNextStart()V
    .locals 4

    .prologue
    .line 197
    new-instance v2, Lcom/splunk/mint/LowPriorityThreadFactory;

    invoke-direct {v2}, Lcom/splunk/mint/LowPriorityThreadFactory;-><init>()V

    new-instance v3, Lcom/splunk/mint/Utils$1;

    invoke-direct {v3}, Lcom/splunk/mint/Utils$1;-><init>()V

    invoke-virtual {v2, v3}, Lcom/splunk/mint/LowPriorityThreadFactory;->newThread(Ljava/lang/Runnable;)Ljava/lang/Thread;

    move-result-object v1

    .line 213
    .local v1, "t":Ljava/lang/Thread;
    invoke-static {}, Lcom/splunk/mint/Utils;->getExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    .line 214
    .local v0, "executor":Ljava/util/concurrent/ExecutorService;
    if-eqz v1, :cond_0

    if-eqz v0, :cond_0

    .line 215
    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 217
    :cond_0
    return-void
.end method

.method protected static setLastPingSentTime(Landroid/content/Context;)V
    .locals 4
    .param p0, "ctx"    # Landroid/content/Context;

    .prologue
    .line 233
    new-instance v2, Lcom/splunk/mint/LowPriorityThreadFactory;

    invoke-direct {v2}, Lcom/splunk/mint/LowPriorityThreadFactory;-><init>()V

    new-instance v3, Lcom/splunk/mint/Utils$2;

    invoke-direct {v3, p0}, Lcom/splunk/mint/Utils$2;-><init>(Landroid/content/Context;)V

    invoke-virtual {v2, v3}, Lcom/splunk/mint/LowPriorityThreadFactory;->newThread(Ljava/lang/Runnable;)Ljava/lang/Thread;

    move-result-object v1

    .line 245
    .local v1, "t":Ljava/lang/Thread;
    invoke-static {}, Lcom/splunk/mint/Utils;->getExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    .line 246
    .local v0, "executor":Ljava/util/concurrent/ExecutorService;
    if-eqz v1, :cond_0

    if-eqz v0, :cond_0

    .line 247
    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 249
    :cond_0
    return-void
.end method

.method protected static declared-synchronized shouldSendPing(Landroid/content/Context;)Z
    .locals 14
    .param p0, "ctx"    # Landroid/content/Context;

    .prologue
    .line 163
    const-class v10, Lcom/splunk/mint/Utils;

    monitor-enter v10

    :try_start_0
    new-instance v0, Ljava/io/File;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v11, Lcom/splunk/mint/Properties;->FILES_PATH:Ljava/lang/String;

    invoke-virtual {v7, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    const-string v11, "/"

    invoke-virtual {v7, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    const-string v11, ".setForceSendPingOnNextStart"

    invoke-virtual {v7, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-direct {v0, v7}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 164
    .local v0, "forcePingfile":Ljava/io/File;
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v7

    if-eqz v7, :cond_1

    .line 165
    invoke-virtual {v0}, Ljava/io/File;->delete()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 166
    const/4 v6, 0x1

    .line 190
    :cond_0
    :goto_0
    monitor-exit v10

    return v6

    .line 168
    :cond_1
    const/4 v6, 0x1

    .line 169
    .local v6, "shouldSendPing":Z
    if-eqz p0, :cond_0

    .line 170
    :try_start_1
    const-string v7, "Mint"

    const/4 v11, 0x0

    invoke-virtual {p0, v7, v11}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v1

    .line 171
    .local v1, "preferences":Landroid/content/SharedPreferences;
    if-eqz v1, :cond_0

    .line 172
    const-string v7, "LASTPINGTIME"

    const-wide/16 v12, 0x0

    invoke-interface {v1, v7, v12, v13}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v2

    .line 173
    .local v2, "lastPing":J
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    .line 175
    .local v8, "timeNow":J
    sget-object v7, Lcom/splunk/mint/Properties$RemoteSettingsProps;->sessionTime:Ljava/lang/Integer;

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7

    mul-int/lit16 v7, v7, 0x3e8

    int-to-long v4, v7

    .line 182
    .local v4, "minSessionTimeInMiliseconds":J
    sub-long v12, v8, v2

    cmp-long v7, v12, v4

    if-lez v7, :cond_2

    const/4 v6, 0x1

    .line 183
    :goto_1
    if-eqz v6, :cond_0

    .line 184
    invoke-static {p0}, Lcom/splunk/mint/Utils;->setLastPingSentTime(Landroid/content/Context;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 163
    .end local v0    # "forcePingfile":Ljava/io/File;
    .end local v1    # "preferences":Landroid/content/SharedPreferences;
    .end local v2    # "lastPing":J
    .end local v4    # "minSessionTimeInMiliseconds":J
    .end local v6    # "shouldSendPing":Z
    .end local v8    # "timeNow":J
    :catchall_0
    move-exception v7

    monitor-exit v10

    throw v7

    .line 182
    .restart local v0    # "forcePingfile":Ljava/io/File;
    .restart local v1    # "preferences":Landroid/content/SharedPreferences;
    .restart local v2    # "lastPing":J
    .restart local v4    # "minSessionTimeInMiliseconds":J
    .restart local v6    # "shouldSendPing":Z
    .restart local v8    # "timeNow":J
    :cond_2
    const/4 v6, 0x0

    goto :goto_1
.end method
