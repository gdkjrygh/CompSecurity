.class public final Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final APPLICATION_ID_PROPERTY:Ljava/lang/String; = "com.cleanmaster.sdk.cmloginsdk.ApplicationId"

.field public static final APPLICATION_SALT_PROPERTY:Ljava/lang/String; = "com.cleanmaster.sdk.cmloginsdk.ApplicationSalt"

.field private static final CLEANMASTER_COM:Ljava/lang/String; = "ksmobile.com"

.field private static final DEFAULT_CORE_POOL_SIZE:I = 0x5

.field private static final DEFAULT_KEEP_ALIVE:I = 0x1

.field private static final DEFAULT_MAXIMUM_POOL_SIZE:I = 0x80

.field private static final DEFAULT_THREAD_FACTORY:Ljava/util/concurrent/ThreadFactory;

.field private static final DEFAULT_WORK_QUEUE:Ljava/util/concurrent/BlockingQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/BlockingQueue",
            "<",
            "Ljava/lang/Runnable;",
            ">;"
        }
    .end annotation
.end field

.field private static final LOCK:Ljava/lang/Object;

.field private static final TAG:Ljava/lang/String;

.field private static volatile accessToken:Ljava/lang/String;

.field private static volatile appVersion:Ljava/lang/String;

.field private static volatile applicationId:Ljava/lang/String;

.field private static volatile applicationSalt:Ljava/lang/String;

.field private static volatile cleanmasterDomain:Ljava/lang/String;

.field private static volatile defaultsLoaded:Z

.field private static volatile executor:Ljava/util/concurrent/Executor;

.field private static volatile fbId:Ljava/lang/String;

.field private static volatile fbToken:Ljava/lang/String;

.field private static volatile fbTriggerbyCm:Z

.field private static volatile isDebugEnabled:Z

.field private static volatile loginSid:Ljava/lang/String;

.field private static volatile loginSidSig:Ljava/lang/String;

.field private static onProgressThreshold:Ljava/util/concurrent/atomic/AtomicLong;

.field private static parentActivity:Landroid/app/Activity;

.field private static volatile registSid:Ljava/lang/String;

.field private static volatile registSidSig:Ljava/lang/String;

.field private static sdkInitialized:Ljava/lang/Boolean;

.field private static volatile sid:Ljava/lang/String;

.field private static volatile sidExpires:J

.field private static volatile ssoTicket:Ljava/lang/String;

.field private static volatile thirdSid:Ljava/lang/String;

.field private static volatile thirdSidSig:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .prologue
    const/4 v1, 0x0

    const/4 v4, 0x0

    .line 31
    const-class v0, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;

    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->TAG:Ljava/lang/String;

    .line 35
    sput-object v1, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->applicationId:Ljava/lang/String;

    .line 36
    sput-object v1, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->applicationSalt:Ljava/lang/String;

    .line 46
    const-string v0, ""

    sput-object v0, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->fbToken:Ljava/lang/String;

    .line 47
    const-string v0, ""

    sput-object v0, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->fbId:Ljava/lang/String;

    .line 58
    const-string v0, "ksmobile.com"

    sput-object v0, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->cleanmasterDomain:Ljava/lang/String;

    .line 59
    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    const-wide/32 v2, 0x10000

    invoke-direct {v0, v2, v3}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    sput-object v0, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->onProgressThreshold:Ljava/util/concurrent/atomic/AtomicLong;

    .line 60
    sput-boolean v4, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->isDebugEnabled:Z

    .line 65
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->LOCK:Ljava/lang/Object;

    .line 66
    sput-boolean v4, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->defaultsLoaded:Z

    .line 70
    new-instance v0, Ljava/util/concurrent/LinkedBlockingQueue;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>(I)V

    sput-object v0, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->DEFAULT_WORK_QUEUE:Ljava/util/concurrent/BlockingQueue;

    .line 72
    new-instance v0, Lcom/cleanmaster/sdk/cmloginsdkjar/ag;

    invoke-direct {v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/ag;-><init>()V

    sput-object v0, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->DEFAULT_THREAD_FACTORY:Ljava/util/concurrent/ThreadFactory;

    .line 80
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    sput-object v0, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->sdkInitialized:Ljava/lang/Boolean;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static calcClientLoginSid(Landroid/content/Context;)Ljava/lang/String;
    .locals 9

    .prologue
    const/4 v1, 0x0

    .line 334
    const/16 v0, 0x10

    new-array v2, v0, [C

    fill-array-data v2, :array_0

    .line 335
    const-string v0, "NoAndroidId"

    .line 336
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v3

    .line 341
    new-instance v4, Ljava/util/Random;

    invoke-direct {v4}, Ljava/util/Random;-><init>()V

    .line 345
    const v5, 0x15f90

    invoke-virtual {v4, v5}, Ljava/util/Random;->nextInt(I)I

    move-result v4

    add-int/lit16 v4, v4, 0x2710

    .line 349
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v5

    const-string v6, "android_id"

    invoke-static {v5, v6}, Landroid/provider/Settings$Secure;->getString(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 351
    if-nez v0, :cond_0

    .line 352
    const-string v0, "NoAndroidId"
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2

    .line 358
    :cond_0
    :goto_0
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v3, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->applicationSalt:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 362
    :try_start_1
    const-string v3, "MD5"

    invoke-static {v3}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;
    :try_end_1
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_1 .. :try_end_1} :catch_0

    move-result-object v3

    .line 368
    :try_start_2
    const-string v4, "UTF-8"

    invoke-virtual {v0, v4}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/security/MessageDigest;->update([B)V
    :try_end_2
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_2 .. :try_end_2} :catch_1

    .line 373
    invoke-virtual {v3}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v3

    .line 375
    array-length v4, v3

    .line 376
    mul-int/lit8 v0, v4, 0x2

    new-array v5, v0, [C

    move v0, v1

    .line 378
    :goto_1
    if-ge v0, v4, :cond_1

    .line 379
    aget-byte v6, v3, v0

    .line 380
    add-int/lit8 v7, v1, 0x1

    ushr-int/lit8 v8, v6, 0x4

    and-int/lit8 v8, v8, 0xf

    aget-char v8, v2, v8

    aput-char v8, v5, v1

    .line 381
    add-int/lit8 v1, v7, 0x1

    and-int/lit8 v6, v6, 0xf

    aget-char v6, v2, v6

    aput-char v6, v5, v7

    .line 378
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 364
    :catch_0
    move-exception v0

    const-string v0, ""

    .line 384
    :goto_2
    return-object v0

    .line 370
    :catch_1
    move-exception v0

    const-string v0, ""

    goto :goto_2

    .line 384
    :cond_1
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    goto :goto_2

    :catch_2
    move-exception v5

    goto :goto_0

    .line 334
    nop

    :array_0
    .array-data 2
        0x30s
        0x31s
        0x32s
        0x33s
        0x34s
        0x35s
        0x36s
        0x37s
        0x38s
        0x39s
        0x41s
        0x42s
        0x43s
        0x44s
        0x45s
        0x46s
    .end array-data
.end method

.method public static calcSidSig(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 389
    .line 390
    const-string v1, ""

    invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 391
    const-string v0, ""

    .line 408
    :cond_0
    :goto_0
    return-object v0

    .line 394
    :cond_1
    :try_start_0
    const-string v1, "UTF-8"

    invoke-virtual {p0, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v1

    sget-object v2, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->applicationSalt:Ljava/lang/String;

    const-string v3, "UTF-8"

    invoke-virtual {v2, v3}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v2

    invoke-static {v1, v2}, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/HMACSHA1;->getSignature([B[B)[B
    :try_end_0
    .catch Ljava/security/InvalidKeyException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_2

    move-result-object v1

    .line 403
    :goto_1
    if-eqz v1, :cond_0

    .line 404
    const/4 v0, 0x2

    invoke-static {v1, v0}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v0

    .line 405
    const/16 v1, 0x2b

    const/16 v2, 0x2d

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x2f

    const/16 v2, 0x5f

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v0

    const-string v1, "="

    const-string v2, ""

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 396
    :catch_0
    move-exception v1

    invoke-virtual {v1}, Ljava/security/InvalidKeyException;->printStackTrace()V

    move-object v1, v0

    .line 401
    goto :goto_1

    .line 398
    :catch_1
    move-exception v1

    invoke-virtual {v1}, Ljava/security/NoSuchAlgorithmException;->printStackTrace()V

    move-object v1, v0

    .line 401
    goto :goto_1

    .line 400
    :catch_2
    move-exception v1

    invoke-virtual {v1}, Ljava/io/UnsupportedEncodingException;->printStackTrace()V

    move-object v1, v0

    goto :goto_1
.end method

.method public static getAccessToken()Ljava/lang/String;
    .locals 1

    .prologue
    .line 442
    sget-object v0, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->accessToken:Ljava/lang/String;

    return-object v0
.end method

.method public static getAppVersion()Ljava/lang/String;
    .locals 1

    .prologue
    .line 289
    sget-object v0, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->appVersion:Ljava/lang/String;

    return-object v0
.end method

.method public static getApplicationId()Ljava/lang/String;
    .locals 1

    .prologue
    .line 419
    sget-object v0, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->applicationId:Ljava/lang/String;

    return-object v0
.end method

.method private static getAsyncTaskExecutor()Ljava/util/concurrent/Executor;
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 261
    :try_start_0
    const-class v0, Landroid/os/AsyncTask;

    const-string v2, "THREAD_POOL_EXECUTOR"

    invoke-virtual {v0, v2}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 268
    const/4 v2, 0x0

    :try_start_1
    invoke-virtual {v0, v2}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v0

    .line 273
    if-nez v0, :cond_0

    move-object v0, v1

    .line 281
    :goto_0
    return-object v0

    .line 263
    :catch_0
    move-exception v0

    move-object v0, v1

    goto :goto_0

    .line 270
    :catch_1
    move-exception v0

    move-object v0, v1

    goto :goto_0

    .line 277
    :cond_0
    instance-of v2, v0, Ljava/util/concurrent/Executor;

    if-nez v2, :cond_1

    move-object v0, v1

    .line 278
    goto :goto_0

    .line 281
    :cond_1
    check-cast v0, Ljava/util/concurrent/Executor;

    goto :goto_0
.end method

.method public static getCleanmasterDomain()Ljava/lang/String;
    .locals 1

    .prologue
    .line 240
    sget-object v0, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->cleanmasterDomain:Ljava/lang/String;

    return-object v0
.end method

.method public static getClientLoginSid()Ljava/lang/String;
    .locals 1

    .prologue
    .line 414
    invoke-static {}, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->getLoginSid()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static getExecutor()Ljava/util/concurrent/Executor;
    .locals 10

    .prologue
    .line 207
    sget-object v9, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->LOCK:Ljava/lang/Object;

    monitor-enter v9

    .line 208
    :try_start_0
    sget-object v0, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->executor:Ljava/util/concurrent/Executor;

    if-nez v0, :cond_1

    .line 209
    invoke-static {}, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->getAsyncTaskExecutor()Ljava/util/concurrent/Executor;

    move-result-object v1

    .line 210
    if-nez v1, :cond_0

    .line 211
    new-instance v1, Ljava/util/concurrent/ThreadPoolExecutor;

    const/4 v2, 0x5

    const/16 v3, 0x80

    const-wide/16 v4, 0x1

    sget-object v6, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    sget-object v7, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->DEFAULT_WORK_QUEUE:Ljava/util/concurrent/BlockingQueue;

    sget-object v8, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->DEFAULT_THREAD_FACTORY:Ljava/util/concurrent/ThreadFactory;

    invoke-direct/range {v1 .. v8}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    .line 214
    :cond_0
    sput-object v1, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->executor:Ljava/util/concurrent/Executor;

    .line 216
    :cond_1
    monitor-exit v9
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 217
    sget-object v0, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->executor:Ljava/util/concurrent/Executor;

    return-object v0

    .line 216
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v9
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public static getFbId()Ljava/lang/String;
    .locals 1

    .prologue
    .line 430
    sget-object v0, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->fbId:Ljava/lang/String;

    return-object v0
.end method

.method public static getFbToken()Ljava/lang/String;
    .locals 1

    .prologue
    .line 422
    sget-object v0, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->fbToken:Ljava/lang/String;

    return-object v0
.end method

.method public static getLoginSid()Ljava/lang/String;
    .locals 1

    .prologue
    .line 474
    sget-object v0, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->loginSid:Ljava/lang/String;

    return-object v0
.end method

.method public static getLoginSidSig()Ljava/lang/String;
    .locals 1

    .prologue
    .line 438
    sget-object v0, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->loginSidSig:Ljava/lang/String;

    return-object v0
.end method

.method public static getOnProgressThreshold()J
    .locals 2

    .prologue
    .line 316
    sget-object v0, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->onProgressThreshold:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v0

    return-wide v0
.end method

.method public static getParentActivity()Landroid/app/Activity;
    .locals 1

    .prologue
    .line 482
    sget-object v0, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->parentActivity:Landroid/app/Activity;

    return-object v0
.end method

.method public static getRegistSid()Ljava/lang/String;
    .locals 1

    .prologue
    .line 510
    sget-object v0, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->registSid:Ljava/lang/String;

    return-object v0
.end method

.method public static getRegistSidSig()Ljava/lang/String;
    .locals 1

    .prologue
    .line 526
    sget-object v0, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->registSidSig:Ljava/lang/String;

    return-object v0
.end method

.method public static getSdkVersion()Ljava/lang/String;
    .locals 1

    .prologue
    .line 309
    const-string v0, "0.0.1"

    return-object v0
.end method

.method public static getSid()Ljava/lang/String;
    .locals 1

    .prologue
    .line 450
    sget-object v0, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->sid:Ljava/lang/String;

    return-object v0
.end method

.method public static getSidExpires()J
    .locals 2

    .prologue
    .line 466
    sget-wide v0, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->sidExpires:J

    return-wide v0
.end method

.method public static getSsoTicket()Ljava/lang/String;
    .locals 1

    .prologue
    .line 458
    sget-object v0, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->ssoTicket:Ljava/lang/String;

    return-object v0
.end method

.method public static getThirdSid()Ljava/lang/String;
    .locals 1

    .prologue
    .line 502
    sget-object v0, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->thirdSid:Ljava/lang/String;

    return-object v0
.end method

.method public static getThirdSidSig()Ljava/lang/String;
    .locals 1

    .prologue
    .line 518
    sget-object v0, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->thirdSidSig:Ljava/lang/String;

    return-object v0
.end method

.method public static final isDebugEnabled()Z
    .locals 1

    .prologue
    .line 187
    sget-boolean v0, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->isDebugEnabled:Z

    return v0
.end method

.method public static isFbTriggerbyCm()Z
    .locals 1

    .prologue
    .line 490
    sget-boolean v0, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->fbTriggerbyCm:Z

    return v0
.end method

.method public static final isLoggingEnabled()Z
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 172
    invoke-static {}, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->isDebugEnabled()Z

    move-result v0

    return v0
.end method

.method public static loadDefaultsFromMetadata(Landroid/content/Context;)V
    .locals 3

    .prologue
    .line 140
    const/4 v0, 0x1

    sput-boolean v0, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->defaultsLoaded:Z

    .line 142
    if-nez p0, :cond_1

    .line 165
    :cond_0
    :goto_0
    return-void

    .line 148
    :cond_1
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x80

    invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 154
    if-eqz v0, :cond_0

    iget-object v1, v0, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    if-eqz v1, :cond_0

    .line 158
    sget-object v1, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->applicationId:Ljava/lang/String;

    if-nez v1, :cond_2

    .line 159
    iget-object v1, v0, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    const-string v2, "com.cleanmaster.sdk.cmloginsdk.ApplicationId"

    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    sput-object v1, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->applicationId:Ljava/lang/String;

    .line 162
    :cond_2
    sget-object v1, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->applicationSalt:Ljava/lang/String;

    if-nez v1, :cond_0

    .line 163
    iget-object v0, v0, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    const-string v1, "com.cleanmaster.sdk.cmloginsdk.ApplicationSalt"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->applicationSalt:Ljava/lang/String;

    goto :goto_0

    .line 151
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method static loadDefaultsFromMetadataIfNeeded(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 116
    sget-boolean v0, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->defaultsLoaded:Z

    if-nez v0, :cond_0

    .line 117
    invoke-static {p0}, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->loadDefaultsFromMetadata(Landroid/content/Context;)V

    .line 119
    :cond_0
    return-void
.end method

.method public static declared-synchronized sdkInitialize(Landroid/content/Context;)V
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 88
    const-class v1, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->sdkInitialized:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-ne v0, v2, :cond_0

    .line 113
    :goto_0
    monitor-exit v1

    return-void

    .line 94
    :cond_0
    :try_start_1
    invoke-static {p0}, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->loadDefaultsFromMetadataIfNeeded(Landroid/content/Context;)V

    .line 97
    invoke-static {p0}, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->calcClientLoginSid(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->setLoginSid(Ljava/lang/String;)V

    .line 99
    invoke-static {}, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->getLoginSid()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->calcSidSig(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->setLoginSidSig(Ljava/lang/String;)V

    .line 102
    invoke-static {p0}, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->calcClientLoginSid(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->setRegistSid(Ljava/lang/String;)V

    .line 104
    invoke-static {}, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->getRegistSid()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->calcSidSig(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->setRegistSidSig(Ljava/lang/String;)V

    .line 107
    invoke-static {p0}, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->calcClientLoginSid(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->setThirdSid(Ljava/lang/String;)V

    .line 109
    invoke-static {}, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->getThirdSid()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->calcSidSig(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->setThirdSidSig(Ljava/lang/String;)V

    .line 112
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    sput-object v0, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->sdkInitialized:Ljava/lang/Boolean;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 88
    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method

.method public static setAccessToken(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 446
    sput-object p0, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->accessToken:Ljava/lang/String;

    .line 447
    return-void
.end method

.method public static setAppVersion(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 300
    sput-object p0, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->appVersion:Ljava/lang/String;

    .line 301
    return-void
.end method

.method public static setCleanmasterDomain(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 252
    sget-object v0, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->TAG:Ljava/lang/String;

    const-string v1, "WARNING: Calling setCleanmasterDomain from non-DEBUG code."

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 255
    sput-object p0, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->cleanmasterDomain:Ljava/lang/String;

    .line 256
    return-void
.end method

.method public static setExecutor(Ljava/util/concurrent/Executor;)V
    .locals 2

    .prologue
    .line 227
    const-string v0, "executor"

    invoke-static {p0, v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/Validate;->notNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 228
    sget-object v1, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->LOCK:Ljava/lang/Object;

    monitor-enter v1

    .line 229
    :try_start_0
    sput-object p0, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->executor:Ljava/util/concurrent/Executor;

    .line 230
    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public static setFbId(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 434
    sput-object p0, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->fbId:Ljava/lang/String;

    .line 435
    return-void
.end method

.method public static setFbToken(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 426
    sput-object p0, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->fbToken:Ljava/lang/String;

    .line 427
    return-void
.end method

.method public static setFbTriggerbyCm(Z)V
    .locals 0

    .prologue
    .line 494
    sput-boolean p0, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->fbTriggerbyCm:Z

    .line 495
    return-void
.end method

.method public static final setIsDebugEnabled(Z)V
    .locals 0

    .prologue
    .line 195
    sput-boolean p0, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->isDebugEnabled:Z

    .line 196
    return-void
.end method

.method public static final setIsLoggingEnabled(Z)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 180
    invoke-static {p0}, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->setIsDebugEnabled(Z)V

    .line 181
    return-void
.end method

.method public static setLoginSid(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 478
    sput-object p0, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->loginSid:Ljava/lang/String;

    .line 479
    return-void
.end method

.method public static setLoginSidSig(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 498
    sput-object p0, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->loginSidSig:Ljava/lang/String;

    .line 499
    return-void
.end method

.method public static setOnProgressThreshold(J)V
    .locals 2

    .prologue
    .line 326
    sget-object v0, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->onProgressThreshold:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0, p0, p1}, Ljava/util/concurrent/atomic/AtomicLong;->set(J)V

    .line 327
    return-void
.end method

.method public static setParentActivity(Landroid/app/Activity;)V
    .locals 0

    .prologue
    .line 486
    sput-object p0, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->parentActivity:Landroid/app/Activity;

    .line 487
    return-void
.end method

.method public static setRegistSid(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 514
    sput-object p0, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->registSid:Ljava/lang/String;

    .line 515
    return-void
.end method

.method public static setRegistSidSig(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 530
    sput-object p0, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->registSidSig:Ljava/lang/String;

    .line 531
    return-void
.end method

.method public static setSid(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 454
    sput-object p0, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->sid:Ljava/lang/String;

    .line 455
    return-void
.end method

.method public static setSidExpires(J)V
    .locals 0

    .prologue
    .line 470
    sput-wide p0, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->sidExpires:J

    .line 471
    return-void
.end method

.method public static setSsoTicket(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 462
    sput-object p0, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->ssoTicket:Ljava/lang/String;

    .line 463
    return-void
.end method

.method public static setThirdSid(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 506
    sput-object p0, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->thirdSid:Ljava/lang/String;

    .line 507
    return-void
.end method

.method public static setThirdSidSig(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 522
    sput-object p0, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->thirdSidSig:Ljava/lang/String;

    .line 523
    return-void
.end method
