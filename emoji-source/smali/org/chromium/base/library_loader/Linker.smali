.class public Lorg/chromium/base/library_loader/Linker;
.super Ljava/lang/Object;
.source "Linker.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/chromium/base/library_loader/Linker$LibInfo;,
        Lorg/chromium/base/library_loader/Linker$TestRunner;
    }
.end annotation


# static fields
.field static final synthetic $assertionsDisabled:Z

.field public static final BROWSER_SHARED_RELRO_CONFIG:I = 0x1

.field public static final BROWSER_SHARED_RELRO_CONFIG_ALWAYS:I = 0x2

.field public static final BROWSER_SHARED_RELRO_CONFIG_LOW_RAM_ONLY:I = 0x1

.field public static final BROWSER_SHARED_RELRO_CONFIG_NEVER:I = 0x0

.field private static final DEBUG:Z = false

.field public static final EXTRA_LINKER_SHARED_RELROS:Ljava/lang/String; = "org.chromium.base.android.linker.shared_relros"

.field public static final MEMORY_DEVICE_CONFIG_INIT:I = 0x0

.field public static final MEMORY_DEVICE_CONFIG_LOW:I = 0x1

.field public static final MEMORY_DEVICE_CONFIG_NORMAL:I = 0x2

.field private static final TAG:Ljava/lang/String; = "chromium_android_linker"

.field private static sBaseLoadAddress:J

.field private static sBrowserUsesSharedRelro:Z

.field private static sCurrentLoadAddress:J

.field private static sInBrowserProcess:Z

.field private static sInitialized:Z

.field private static sLoadAtFixedAddressFailed:Z

.field private static sLoadedLibraries:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Lorg/chromium/base/library_loader/Linker$LibInfo;",
            ">;"
        }
    .end annotation
.end field

.field private static sMemoryDeviceConfig:I

.field private static sPrepareLibraryLoadCalled:Z

.field private static sRelroSharingSupported:Z

.field private static sSharedRelros:Landroid/os/Bundle;

.field static sTestRunnerClassName:Ljava/lang/String;

.field private static sWaitForSharedRelros:Z


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .prologue
    const-wide/16 v4, 0x0

    const/4 v1, 0x1

    const/4 v3, 0x0

    const/4 v2, 0x0

    .line 155
    const-class v0, Lorg/chromium/base/library_loader/Linker;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    move v0, v1

    :goto_0
    sput-boolean v0, Lorg/chromium/base/library_loader/Linker;->$assertionsDisabled:Z

    .line 190
    sput v2, Lorg/chromium/base/library_loader/Linker;->sMemoryDeviceConfig:I

    .line 193
    sput-boolean v2, Lorg/chromium/base/library_loader/Linker;->sInitialized:Z

    .line 196
    sput-boolean v2, Lorg/chromium/base/library_loader/Linker;->sRelroSharingSupported:Z

    .line 199
    sput-boolean v1, Lorg/chromium/base/library_loader/Linker;->sInBrowserProcess:Z

    .line 203
    sput-boolean v2, Lorg/chromium/base/library_loader/Linker;->sWaitForSharedRelros:Z

    .line 207
    sput-boolean v2, Lorg/chromium/base/library_loader/Linker;->sBrowserUsesSharedRelro:Z

    .line 210
    sput-object v3, Lorg/chromium/base/library_loader/Linker;->sSharedRelros:Landroid/os/Bundle;

    .line 213
    sput-wide v4, Lorg/chromium/base/library_loader/Linker;->sBaseLoadAddress:J

    .line 216
    sput-wide v4, Lorg/chromium/base/library_loader/Linker;->sCurrentLoadAddress:J

    .line 219
    sput-boolean v2, Lorg/chromium/base/library_loader/Linker;->sLoadAtFixedAddressFailed:Z

    .line 222
    sput-boolean v2, Lorg/chromium/base/library_loader/Linker;->sPrepareLibraryLoadCalled:Z

    .line 298
    sput-object v3, Lorg/chromium/base/library_loader/Linker;->sTestRunnerClassName:Ljava/lang/String;

    .line 1065
    sput-object v3, Lorg/chromium/base/library_loader/Linker;->sLoadedLibraries:Ljava/util/HashMap;

    return-void

    :cond_0
    move v0, v2

    .line 155
    goto :goto_0
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 155
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 942
    return-void
.end method

.method static synthetic access$000(J)V
    .locals 0
    .param p0, "x0"    # J

    .prologue
    .line 155
    invoke-static {p0, p1}, Lorg/chromium/base/library_loader/Linker;->nativeRunCallbackOnUiThread(J)V

    return-void
.end method

.method private static closeLibInfoMap(Ljava/util/HashMap;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Lorg/chromium/base/library_loader/Linker$LibInfo;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 1059
    .local p0, "map":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Lorg/chromium/base/library_loader/Linker$LibInfo;>;"
    invoke-virtual {p0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .local v1, "i$":Ljava/util/Iterator;
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 1060
    .local v0, "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Lorg/chromium/base/library_loader/Linker$LibInfo;>;"
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lorg/chromium/base/library_loader/Linker$LibInfo;

    invoke-virtual {v2}, Lorg/chromium/base/library_loader/Linker$LibInfo;->close()V

    goto :goto_0

    .line 1062
    .end local v0    # "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Lorg/chromium/base/library_loader/Linker$LibInfo;>;"
    :cond_0
    return-void
.end method

.method private static computeRandomBaseLoadAddress()J
    .locals 6

    .prologue
    .line 640
    const-wide/32 v2, 0xc000000

    .line 641
    .local v2, "maxExpectedBytes":J
    const-wide/32 v4, 0xc000000

    invoke-static {v4, v5}, Lorg/chromium/base/library_loader/Linker;->nativeGetRandomBaseLoadAddress(J)J

    move-result-wide v0

    .line 646
    .local v0, "address":J
    return-wide v0
.end method

.method private static createBundleFromLibInfoMap(Ljava/util/HashMap;)Landroid/os/Bundle;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Lorg/chromium/base/library_loader/Linker$LibInfo;",
            ">;)",
            "Landroid/os/Bundle;"
        }
    .end annotation

    .prologue
    .line 1039
    .local p0, "map":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Lorg/chromium/base/library_loader/Linker$LibInfo;>;"
    new-instance v0, Landroid/os/Bundle;

    invoke-virtual {p0}, Ljava/util/HashMap;->size()I

    move-result v3

    invoke-direct {v0, v3}, Landroid/os/Bundle;-><init>(I)V

    .line 1040
    .local v0, "bundle":Landroid/os/Bundle;
    invoke-virtual {p0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .local v2, "i$":Ljava/util/Iterator;
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 1041
    .local v1, "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Lorg/chromium/base/library_loader/Linker$LibInfo;>;"
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/os/Parcelable;

    invoke-virtual {v0, v3, v4}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    goto :goto_0

    .line 1044
    .end local v1    # "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Lorg/chromium/base/library_loader/Linker$LibInfo;>;"
    :cond_0
    return-object v0
.end method

.method private static createLibInfoMapFromBundle(Landroid/os/Bundle;)Ljava/util/HashMap;
    .locals 5
    .param p0, "bundle"    # Landroid/os/Bundle;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/os/Bundle;",
            ")",
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Lorg/chromium/base/library_loader/Linker$LibInfo;",
            ">;"
        }
    .end annotation

    .prologue
    .line 1049
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 1050
    .local v3, "map":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Lorg/chromium/base/library_loader/Linker$LibInfo;>;"
    invoke-virtual {p0}, Landroid/os/Bundle;->keySet()Ljava/util/Set;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .local v0, "i$":Ljava/util/Iterator;
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 1051
    .local v2, "library":Ljava/lang/String;
    invoke-virtual {p0, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v1

    check-cast v1, Lorg/chromium/base/library_loader/Linker$LibInfo;

    .line 1052
    .local v1, "libInfo":Lorg/chromium/base/library_loader/Linker$LibInfo;
    invoke-virtual {v3, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 1054
    .end local v1    # "libInfo":Lorg/chromium/base/library_loader/Linker$LibInfo;
    .end local v2    # "library":Ljava/lang/String;
    :cond_0
    return-object v3
.end method

.method public static disableSharedRelros()V
    .locals 2

    .prologue
    .line 549
    const-class v1, Lorg/chromium/base/library_loader/Linker;

    monitor-enter v1

    .line 550
    const/4 v0, 0x0

    :try_start_0
    sput-boolean v0, Lorg/chromium/base/library_loader/Linker;->sInBrowserProcess:Z

    .line 551
    const/4 v0, 0x0

    sput-boolean v0, Lorg/chromium/base/library_loader/Linker;->sWaitForSharedRelros:Z

    .line 552
    const/4 v0, 0x0

    sput-boolean v0, Lorg/chromium/base/library_loader/Linker;->sBrowserUsesSharedRelro:Z

    .line 553
    monitor-exit v1

    .line 554
    return-void

    .line 553
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method private static dumpBundle(Landroid/os/Bundle;)V
    .locals 0
    .param p0, "bundle"    # Landroid/os/Bundle;

    .prologue
    .line 652
    return-void
.end method

.method private static ensureInitializedLocked()V
    .locals 5

    .prologue
    const/4 v3, 0x0

    const/4 v2, 0x1

    .line 226
    sget-boolean v1, Lorg/chromium/base/library_loader/Linker;->$assertionsDisabled:Z

    if-nez v1, :cond_0

    const-class v1, Lorg/chromium/base/library_loader/Linker;

    invoke-static {v1}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    new-instance v1, Ljava/lang/AssertionError;

    invoke-direct {v1}, Ljava/lang/AssertionError;-><init>()V

    throw v1

    .line 228
    :cond_0
    sget-boolean v1, Lorg/chromium/base/library_loader/Linker;->sInitialized:Z

    if-nez v1, :cond_6

    .line 229
    sput-boolean v3, Lorg/chromium/base/library_loader/Linker;->sRelroSharingSupported:Z

    .line 230
    sget-boolean v1, Lorg/chromium/base/library_loader/NativeLibraries;->USE_LINKER:Z

    if-eqz v1, :cond_4

    .line 233
    :try_start_0
    const-string v1, "chromium_android_linker"

    invoke-static {v1}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/UnsatisfiedLinkError; {:try_start_0 .. :try_end_0} :catch_0

    .line 238
    .local v0, "e":Ljava/lang/UnsatisfiedLinkError;
    :goto_0
    invoke-static {}, Lorg/chromium/base/library_loader/Linker;->nativeCanUseSharedRelro()Z

    move-result v1

    sput-boolean v1, Lorg/chromium/base/library_loader/Linker;->sRelroSharingSupported:Z

    .line 239
    sget-boolean v1, Lorg/chromium/base/library_loader/Linker;->sRelroSharingSupported:Z

    if-nez v1, :cond_1

    .line 240
    const-string v1, "chromium_android_linker"

    const-string v4, "This system cannot safely share RELRO sections"

    invoke-static {v1, v4}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 245
    :cond_1
    sget v1, Lorg/chromium/base/library_loader/Linker;->sMemoryDeviceConfig:I

    if-nez v1, :cond_2

    .line 246
    invoke-static {}, Lorg/chromium/base/SysUtils;->isLowEndDevice()Z

    move-result v1

    if-eqz v1, :cond_3

    move v1, v2

    :goto_1
    sput v1, Lorg/chromium/base/library_loader/Linker;->sMemoryDeviceConfig:I

    .line 250
    :cond_2
    packed-switch v2, :pswitch_data_0

    .line 265
    sget-boolean v1, Lorg/chromium/base/library_loader/Linker;->$assertionsDisabled:Z

    if-nez v1, :cond_4

    new-instance v1, Ljava/lang/AssertionError;

    const-string v2, "Unreached"

    invoke-direct {v1, v2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v1

    .line 234
    .end local v0    # "e":Ljava/lang/UnsatisfiedLinkError;
    :catch_0
    move-exception v0

    .line 236
    .restart local v0    # "e":Ljava/lang/UnsatisfiedLinkError;
    const-string v1, "chromium_android_linker.cr"

    invoke-static {v1}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    goto :goto_0

    .line 246
    :cond_3
    const/4 v1, 0x2

    goto :goto_1

    .line 252
    :pswitch_0
    sput-boolean v3, Lorg/chromium/base/library_loader/Linker;->sBrowserUsesSharedRelro:Z

    .line 272
    :cond_4
    :goto_2
    sget-boolean v1, Lorg/chromium/base/library_loader/Linker;->sRelroSharingSupported:Z

    if-nez v1, :cond_5

    .line 274
    sput-boolean v3, Lorg/chromium/base/library_loader/Linker;->sBrowserUsesSharedRelro:Z

    .line 275
    sput-boolean v3, Lorg/chromium/base/library_loader/Linker;->sWaitForSharedRelros:Z

    .line 278
    :cond_5
    sput-boolean v2, Lorg/chromium/base/library_loader/Linker;->sInitialized:Z

    .line 280
    :cond_6
    return-void

    .line 255
    :pswitch_1
    sget v1, Lorg/chromium/base/library_loader/Linker;->sMemoryDeviceConfig:I

    if-ne v1, v2, :cond_7

    move v1, v2

    :goto_3
    sput-boolean v1, Lorg/chromium/base/library_loader/Linker;->sBrowserUsesSharedRelro:Z

    .line 257
    sget-boolean v1, Lorg/chromium/base/library_loader/Linker;->sBrowserUsesSharedRelro:Z

    if-eqz v1, :cond_4

    .line 258
    const-string v1, "chromium_android_linker"

    const-string v4, "Low-memory device: shared RELROs used in all processes"

    invoke-static {v1, v4}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_2

    :cond_7
    move v1, v3

    .line 255
    goto :goto_3

    .line 261
    :pswitch_2
    const-string v1, "chromium_android_linker"

    const-string v4, "Beware: shared RELROs used in all processes!"

    invoke-static {v1, v4}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 262
    sput-boolean v2, Lorg/chromium/base/library_loader/Linker;->sBrowserUsesSharedRelro:Z

    goto :goto_2

    .line 250
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public static finishLibraryLoad()V
    .locals 5

    .prologue
    .line 418
    const-class v3, Lorg/chromium/base/library_loader/Linker;

    monitor-enter v3

    .line 426
    :try_start_0
    sget-object v2, Lorg/chromium/base/library_loader/Linker;->sLoadedLibraries:Ljava/util/HashMap;

    if-nez v2, :cond_1

    .line 461
    :cond_0
    :goto_0
    sget-boolean v2, Lorg/chromium/base/library_loader/NativeLibraries;->ENABLE_LINKER_TESTS:Z

    if-eqz v2, :cond_6

    sget-object v2, Lorg/chromium/base/library_loader/Linker;->sTestRunnerClassName:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v2, :cond_6

    .line 466
    const/4 v1, 0x0

    .line 468
    .local v1, "testRunner":Lorg/chromium/base/library_loader/Linker$TestRunner;
    :try_start_1
    sget-object v2, Lorg/chromium/base/library_loader/Linker;->sTestRunnerClassName:Ljava/lang/String;

    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v1

    .end local v1    # "testRunner":Lorg/chromium/base/library_loader/Linker$TestRunner;
    check-cast v1, Lorg/chromium/base/library_loader/Linker$TestRunner;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 474
    .restart local v1    # "testRunner":Lorg/chromium/base/library_loader/Linker$TestRunner;
    :goto_1
    if-eqz v1, :cond_6

    .line 475
    :try_start_2
    sget v2, Lorg/chromium/base/library_loader/Linker;->sMemoryDeviceConfig:I

    sget-boolean v4, Lorg/chromium/base/library_loader/Linker;->sInBrowserProcess:Z

    invoke-interface {v1, v2, v4}, Lorg/chromium/base/library_loader/Linker$TestRunner;->runChecks(IZ)Z

    move-result v2

    if-nez v2, :cond_5

    .line 476
    const-string v2, "chromium_android_linker"

    const-string v4, "Linker runtime tests failed in this process!!"

    invoke-static {v2, v4}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;)I

    .line 477
    sget-boolean v2, Lorg/chromium/base/library_loader/Linker;->$assertionsDisabled:Z

    if-nez v2, :cond_6

    new-instance v2, Ljava/lang/AssertionError;

    invoke-direct {v2}, Ljava/lang/AssertionError;-><init>()V

    throw v2

    .line 483
    .end local v1    # "testRunner":Lorg/chromium/base/library_loader/Linker$TestRunner;
    :catchall_0
    move-exception v2

    monitor-exit v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v2

    .line 429
    :cond_1
    :try_start_3
    sget-boolean v2, Lorg/chromium/base/library_loader/Linker;->sInBrowserProcess:Z

    if-eqz v2, :cond_2

    .line 432
    sget-object v2, Lorg/chromium/base/library_loader/Linker;->sLoadedLibraries:Ljava/util/HashMap;

    invoke-static {v2}, Lorg/chromium/base/library_loader/Linker;->createBundleFromLibInfoMap(Ljava/util/HashMap;)Landroid/os/Bundle;

    move-result-object v2

    sput-object v2, Lorg/chromium/base/library_loader/Linker;->sSharedRelros:Landroid/os/Bundle;

    .line 438
    sget-boolean v2, Lorg/chromium/base/library_loader/Linker;->sBrowserUsesSharedRelro:Z

    if-eqz v2, :cond_2

    .line 439
    sget-object v2, Lorg/chromium/base/library_loader/Linker;->sSharedRelros:Landroid/os/Bundle;

    invoke-static {v2}, Lorg/chromium/base/library_loader/Linker;->useSharedRelrosLocked(Landroid/os/Bundle;)V

    .line 443
    :cond_2
    sget-boolean v2, Lorg/chromium/base/library_loader/Linker;->sWaitForSharedRelros:Z

    if-eqz v2, :cond_0

    .line 444
    sget-boolean v2, Lorg/chromium/base/library_loader/Linker;->$assertionsDisabled:Z

    if-nez v2, :cond_3

    sget-boolean v2, Lorg/chromium/base/library_loader/Linker;->sInBrowserProcess:Z

    if-eqz v2, :cond_3

    new-instance v2, Ljava/lang/AssertionError;

    invoke-direct {v2}, Ljava/lang/AssertionError;-><init>()V

    throw v2

    .line 447
    :cond_3
    :goto_2
    sget-object v2, Lorg/chromium/base/library_loader/Linker;->sSharedRelros:Landroid/os/Bundle;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    if-nez v2, :cond_4

    .line 449
    :try_start_4
    const-class v2, Lorg/chromium/base/library_loader/Linker;

    invoke-virtual {v2}, Ljava/lang/Object;->wait()V
    :try_end_4
    .catch Ljava/lang/InterruptedException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto :goto_2

    .line 450
    :catch_0
    move-exception v2

    goto :goto_2

    .line 454
    :cond_4
    :try_start_5
    sget-object v2, Lorg/chromium/base/library_loader/Linker;->sSharedRelros:Landroid/os/Bundle;

    invoke-static {v2}, Lorg/chromium/base/library_loader/Linker;->useSharedRelrosLocked(Landroid/os/Bundle;)V

    .line 456
    sget-object v2, Lorg/chromium/base/library_loader/Linker;->sSharedRelros:Landroid/os/Bundle;

    invoke-virtual {v2}, Landroid/os/Bundle;->clear()V

    .line 457
    const/4 v2, 0x0

    sput-object v2, Lorg/chromium/base/library_loader/Linker;->sSharedRelros:Landroid/os/Bundle;

    goto :goto_0

    .line 470
    :catch_1
    move-exception v0

    .line 471
    .local v0, "e":Ljava/lang/Exception;
    const-string v2, "chromium_android_linker"

    const-string v4, "Could not extract test runner class name"

    invoke-static {v2, v4, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 472
    const/4 v1, 0x0

    .restart local v1    # "testRunner":Lorg/chromium/base/library_loader/Linker$TestRunner;
    goto :goto_1

    .line 479
    .end local v0    # "e":Ljava/lang/Exception;
    :cond_5
    const-string v2, "chromium_android_linker"

    const-string v4, "All linker tests passed!"

    invoke-static {v2, v4}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 483
    :cond_6
    monitor-exit v3
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 485
    return-void
.end method

.method public static getBaseLoadAddress()J
    .locals 3

    .prologue
    .line 587
    const-class v2, Lorg/chromium/base/library_loader/Linker;

    monitor-enter v2

    .line 588
    :try_start_0
    invoke-static {}, Lorg/chromium/base/library_loader/Linker;->ensureInitializedLocked()V

    .line 589
    sget-boolean v0, Lorg/chromium/base/library_loader/Linker;->sInBrowserProcess:Z

    if-nez v0, :cond_0

    .line 590
    const-string v0, "chromium_android_linker"

    const-string v1, "Shared RELRO sections are disabled in this process!"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 591
    const-wide/16 v0, 0x0

    monitor-exit v2

    .line 597
    :goto_0
    return-wide v0

    .line 594
    :cond_0
    invoke-static {}, Lorg/chromium/base/library_loader/Linker;->setupBaseLoadAddressLocked()V

    .line 597
    sget-wide v0, Lorg/chromium/base/library_loader/Linker;->sBaseLoadAddress:J

    monitor-exit v2

    goto :goto_0

    .line 598
    :catchall_0
    move-exception v0

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public static getSharedRelros()Landroid/os/Bundle;
    .locals 2

    .prologue
    .line 530
    const-class v1, Lorg/chromium/base/library_loader/Linker;

    monitor-enter v1

    .line 531
    :try_start_0
    sget-boolean v0, Lorg/chromium/base/library_loader/Linker;->sInBrowserProcess:Z

    if-nez v0, :cond_0

    .line 533
    const/4 v0, 0x0

    monitor-exit v1

    .line 538
    :goto_0
    return-object v0

    :cond_0
    sget-object v0, Lorg/chromium/base/library_loader/Linker;->sSharedRelros:Landroid/os/Bundle;

    monitor-exit v1

    goto :goto_0

    .line 539
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public static getTestRunnerClassName()Ljava/lang/String;
    .locals 2

    .prologue
    .line 328
    const-class v1, Lorg/chromium/base/library_loader/Linker;

    monitor-enter v1

    .line 329
    :try_start_0
    sget-object v0, Lorg/chromium/base/library_loader/Linker;->sTestRunnerClassName:Ljava/lang/String;

    monitor-exit v1

    return-object v0

    .line 330
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public static initServiceProcess(J)V
    .locals 2
    .param p0, "baseLoadAddress"    # J

    .prologue
    .line 567
    const-class v1, Lorg/chromium/base/library_loader/Linker;

    monitor-enter v1

    .line 568
    :try_start_0
    invoke-static {}, Lorg/chromium/base/library_loader/Linker;->ensureInitializedLocked()V

    .line 569
    const/4 v0, 0x0

    sput-boolean v0, Lorg/chromium/base/library_loader/Linker;->sInBrowserProcess:Z

    .line 570
    const/4 v0, 0x0

    sput-boolean v0, Lorg/chromium/base/library_loader/Linker;->sBrowserUsesSharedRelro:Z

    .line 571
    sget-boolean v0, Lorg/chromium/base/library_loader/Linker;->sRelroSharingSupported:Z

    if-eqz v0, :cond_0

    .line 572
    const/4 v0, 0x1

    sput-boolean v0, Lorg/chromium/base/library_loader/Linker;->sWaitForSharedRelros:Z

    .line 573
    sput-wide p0, Lorg/chromium/base/library_loader/Linker;->sBaseLoadAddress:J

    .line 574
    sput-wide p0, Lorg/chromium/base/library_loader/Linker;->sCurrentLoadAddress:J

    .line 576
    :cond_0
    monitor-exit v1

    .line 577
    return-void

    .line 576
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public static isInZipFile()Z
    .locals 1

    .prologue
    .line 392
    sget-boolean v0, Lorg/chromium/base/library_loader/NativeLibraries;->USE_LIBRARY_IN_ZIP_FILE:Z

    return v0
.end method

.method public static isUsed()Z
    .locals 2

    .prologue
    .line 365
    sget-boolean v0, Lorg/chromium/base/library_loader/NativeLibraries;->USE_LINKER:Z

    if-nez v0, :cond_0

    .line 366
    const/4 v0, 0x0

    .line 372
    :goto_0
    return v0

    .line 368
    :cond_0
    const-class v1, Lorg/chromium/base/library_loader/Linker;

    monitor-enter v1

    .line 369
    :try_start_0
    invoke-static {}, Lorg/chromium/base/library_loader/Linker;->ensureInitializedLocked()V

    .line 372
    sget-boolean v0, Lorg/chromium/base/library_loader/Linker;->sRelroSharingSupported:Z

    monitor-exit v1

    goto :goto_0

    .line 373
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public static isUsingBrowserSharedRelros()Z
    .locals 2

    .prologue
    .line 381
    const-class v1, Lorg/chromium/base/library_loader/Linker;

    monitor-enter v1

    .line 382
    :try_start_0
    invoke-static {}, Lorg/chromium/base/library_loader/Linker;->ensureInitializedLocked()V

    .line 383
    sget-boolean v0, Lorg/chromium/base/library_loader/Linker;->sBrowserUsesSharedRelro:Z

    monitor-exit v1

    return v0

    .line 384
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public static loadAtFixedAddressFailed()Z
    .locals 1

    .prologue
    .line 708
    sget-boolean v0, Lorg/chromium/base/library_loader/Linker;->sLoadAtFixedAddressFailed:Z

    return v0
.end method

.method public static loadLibrary(Ljava/lang/String;)V
    .locals 1
    .param p0, "library"    # Ljava/lang/String;

    .prologue
    .line 730
    const/4 v0, 0x0

    invoke-static {v0, p0}, Lorg/chromium/base/library_loader/Linker;->loadLibraryMaybeInZipFile(Ljava/lang/String;Ljava/lang/String;)V

    .line 731
    return-void
.end method

.method public static loadLibraryInZipFile(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .param p0, "zipfile"    # Ljava/lang/String;
    .param p1, "library"    # Ljava/lang/String;

    .prologue
    .line 721
    invoke-static {p0, p1}, Lorg/chromium/base/library_loader/Linker;->loadLibraryMaybeInZipFile(Ljava/lang/String;Ljava/lang/String;)V

    .line 722
    return-void
.end method

.method private static loadLibraryMaybeInZipFile(Ljava/lang/String;Ljava/lang/String;)V
    .locals 14
    .param p0, "zipFile"    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p1, "library"    # Ljava/lang/String;

    .prologue
    .line 741
    const-string v6, "chromium_android_linker"

    invoke-virtual {p1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_0

    const-string v6, "chromium_android_linker.cr"

    invoke-virtual {p1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    .line 837
    :cond_0
    :goto_0
    return-void

    .line 746
    :cond_1
    const-class v7, Lorg/chromium/base/library_loader/Linker;

    monitor-enter v7

    .line 747
    :try_start_0
    invoke-static {}, Lorg/chromium/base/library_loader/Linker;->ensureInitializedLocked()V

    .line 753
    sget-boolean v6, Lorg/chromium/base/library_loader/Linker;->$assertionsDisabled:Z

    if-nez v6, :cond_2

    sget-boolean v6, Lorg/chromium/base/library_loader/Linker;->sPrepareLibraryLoadCalled:Z

    if-nez v6, :cond_2

    new-instance v6, Ljava/lang/AssertionError;

    invoke-direct {v6}, Ljava/lang/AssertionError;-><init>()V

    throw v6

    .line 836
    :catchall_0
    move-exception v6

    monitor-exit v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v6

    .line 755
    :cond_2
    :try_start_1
    invoke-static {p1}, Ljava/lang/System;->mapLibraryName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 757
    .local v2, "libName":Ljava/lang/String;
    sget-object v6, Lorg/chromium/base/library_loader/Linker;->sLoadedLibraries:Ljava/util/HashMap;

    if-nez v6, :cond_3

    .line 758
    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    sput-object v6, Lorg/chromium/base/library_loader/Linker;->sLoadedLibraries:Ljava/util/HashMap;

    .line 760
    :cond_3
    sget-object v6, Lorg/chromium/base/library_loader/Linker;->sLoadedLibraries:Ljava/util/HashMap;

    invoke-virtual {v6, v2}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    .line 762
    monitor-exit v7

    goto :goto_0

    .line 765
    :cond_4
    new-instance v1, Lorg/chromium/base/library_loader/Linker$LibInfo;

    invoke-direct {v1}, Lorg/chromium/base/library_loader/Linker$LibInfo;-><init>()V

    .line 766
    .local v1, "libInfo":Lorg/chromium/base/library_loader/Linker$LibInfo;
    const-wide/16 v4, 0x0

    .line 767
    .local v4, "loadAddress":J
    sget-boolean v6, Lorg/chromium/base/library_loader/Linker;->sInBrowserProcess:Z

    if-eqz v6, :cond_5

    sget-boolean v6, Lorg/chromium/base/library_loader/Linker;->sBrowserUsesSharedRelro:Z

    if-nez v6, :cond_6

    :cond_5
    sget-boolean v6, Lorg/chromium/base/library_loader/Linker;->sWaitForSharedRelros:Z

    if-eqz v6, :cond_7

    .line 769
    :cond_6
    sget-wide v4, Lorg/chromium/base/library_loader/Linker;->sCurrentLoadAddress:J

    .line 772
    :cond_7
    move-object v3, v2

    .line 773
    .local v3, "sharedRelRoName":Ljava/lang/String;
    if-eqz p0, :cond_e

    .line 774
    invoke-static {p0, v2, v4, v5, v1}, Lorg/chromium/base/library_loader/Linker;->nativeLoadLibraryInZipFile(Ljava/lang/String;Ljava/lang/String;JLorg/chromium/base/library_loader/Linker$LibInfo;)Z

    move-result v6

    if-nez v6, :cond_8

    .line 776
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "Unable to load library: "

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v8, " in: "

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 779
    .local v0, "errorMessage":Ljava/lang/String;
    const-string v6, "chromium_android_linker"

    invoke-static {v6, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 780
    new-instance v6, Ljava/lang/UnsatisfiedLinkError;

    invoke-direct {v6, v0}, Ljava/lang/UnsatisfiedLinkError;-><init>(Ljava/lang/String;)V

    throw v6

    .line 782
    .end local v0    # "errorMessage":Ljava/lang/String;
    :cond_8
    move-object v3, p0

    .line 791
    :cond_9
    const-wide/16 v8, 0x0

    cmp-long v6, v4, v8

    if-eqz v6, :cond_a

    iget-wide v8, v1, Lorg/chromium/base/library_loader/Linker$LibInfo;->mLoadAddress:J

    cmp-long v6, v4, v8

    if-eqz v6, :cond_a

    .line 792
    const/4 v6, 0x1

    sput-boolean v6, Lorg/chromium/base/library_loader/Linker;->sLoadAtFixedAddressFailed:Z

    .line 800
    :cond_a
    sget-boolean v6, Lorg/chromium/base/library_loader/NativeLibraries;->ENABLE_LINKER_TESTS:Z

    if-eqz v6, :cond_b

    .line 801
    const-string v8, "chromium_android_linker"

    sget-object v9, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v10, "%s_LIBRARY_ADDRESS: %s %x"

    const/4 v6, 0x3

    new-array v11, v6, [Ljava/lang/Object;

    const/4 v12, 0x0

    sget-boolean v6, Lorg/chromium/base/library_loader/Linker;->sInBrowserProcess:Z

    if-eqz v6, :cond_f

    const-string v6, "BROWSER"

    :goto_1
    aput-object v6, v11, v12

    const/4 v6, 0x1

    aput-object v2, v11, v6

    const/4 v6, 0x2

    iget-wide v12, v1, Lorg/chromium/base/library_loader/Linker$LibInfo;->mLoadAddress:J

    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v12

    aput-object v12, v11, v6

    invoke-static {v9, v10, v11}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v8, v6}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 809
    :cond_b
    sget-boolean v6, Lorg/chromium/base/library_loader/Linker;->sInBrowserProcess:Z

    if-eqz v6, :cond_c

    .line 811
    sget-wide v8, Lorg/chromium/base/library_loader/Linker;->sCurrentLoadAddress:J

    invoke-static {v3, v8, v9, v1}, Lorg/chromium/base/library_loader/Linker;->nativeCreateSharedRelro(Ljava/lang/String;JLorg/chromium/base/library_loader/Linker$LibInfo;)Z

    move-result v6

    if-nez v6, :cond_c

    .line 812
    const-string v6, "chromium_android_linker"

    sget-object v8, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v9, "Could not create shared RELRO for %s at %x"

    const/4 v10, 0x2

    new-array v10, v10, [Ljava/lang/Object;

    const/4 v11, 0x0

    aput-object v2, v10, v11

    const/4 v11, 0x1

    sget-wide v12, Lorg/chromium/base/library_loader/Linker;->sCurrentLoadAddress:J

    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v12

    aput-object v12, v10, v11

    invoke-static {v8, v9, v10}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v6, v8}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 826
    :cond_c
    sget-wide v8, Lorg/chromium/base/library_loader/Linker;->sCurrentLoadAddress:J

    const-wide/16 v10, 0x0

    cmp-long v6, v8, v10

    if-eqz v6, :cond_d

    .line 831
    iget-wide v8, v1, Lorg/chromium/base/library_loader/Linker$LibInfo;->mLoadAddress:J

    iget-wide v10, v1, Lorg/chromium/base/library_loader/Linker$LibInfo;->mLoadSize:J

    add-long/2addr v8, v10

    sput-wide v8, Lorg/chromium/base/library_loader/Linker;->sCurrentLoadAddress:J

    .line 834
    :cond_d
    sget-object v6, Lorg/chromium/base/library_loader/Linker;->sLoadedLibraries:Ljava/util/HashMap;

    invoke-virtual {v6, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 836
    monitor-exit v7

    goto/16 :goto_0

    .line 784
    :cond_e
    invoke-static {v2, v4, v5, v1}, Lorg/chromium/base/library_loader/Linker;->nativeLoadLibrary(Ljava/lang/String;JLorg/chromium/base/library_loader/Linker$LibInfo;)Z

    move-result v6

    if-nez v6, :cond_9

    .line 785
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "Unable to load library: "

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 786
    .restart local v0    # "errorMessage":Ljava/lang/String;
    const-string v6, "chromium_android_linker"

    invoke-static {v6, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 787
    new-instance v6, Ljava/lang/UnsatisfiedLinkError;

    invoke-direct {v6, v0}, Ljava/lang/UnsatisfiedLinkError;-><init>(Ljava/lang/String;)V

    throw v6

    .line 801
    .end local v0    # "errorMessage":Ljava/lang/String;
    :cond_f
    const-string v6, "RENDERER"
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1
.end method

.method private static native nativeCanUseSharedRelro()Z
.end method

.method private static native nativeCreateSharedRelro(Ljava/lang/String;JLorg/chromium/base/library_loader/Linker$LibInfo;)Z
.end method

.method private static native nativeGetRandomBaseLoadAddress(J)J
.end method

.method private static native nativeLoadLibrary(Ljava/lang/String;JLorg/chromium/base/library_loader/Linker$LibInfo;)Z
.end method

.method private static native nativeLoadLibraryInZipFile(Ljava/lang/String;Ljava/lang/String;JLorg/chromium/base/library_loader/Linker$LibInfo;)Z
.end method

.method private static native nativeRunCallbackOnUiThread(J)V
.end method

.method private static native nativeUseSharedRelro(Ljava/lang/String;Lorg/chromium/base/library_loader/Linker$LibInfo;)Z
.end method

.method public static postCallbackOnMainThread(J)V
    .locals 2
    .param p0, "opaque"    # J
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 848
    new-instance v0, Lorg/chromium/base/library_loader/Linker$1;

    invoke-direct {v0, p0, p1}, Lorg/chromium/base/library_loader/Linker$1;-><init>(J)V

    invoke-static {v0}, Lorg/chromium/base/ThreadUtils;->postOnUiThread(Ljava/lang/Runnable;)V

    .line 854
    return-void
.end method

.method public static prepareLibraryLoad()V
    .locals 2

    .prologue
    .line 400
    const-class v1, Lorg/chromium/base/library_loader/Linker;

    monitor-enter v1

    .line 401
    const/4 v0, 0x1

    :try_start_0
    sput-boolean v0, Lorg/chromium/base/library_loader/Linker;->sPrepareLibraryLoadCalled:Z

    .line 403
    sget-boolean v0, Lorg/chromium/base/library_loader/Linker;->sInBrowserProcess:Z

    if-eqz v0, :cond_0

    .line 406
    invoke-static {}, Lorg/chromium/base/library_loader/Linker;->setupBaseLoadAddressLocked()V

    .line 408
    :cond_0
    monitor-exit v1

    .line 409
    return-void

    .line 408
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public static setMemoryDeviceConfig(I)V
    .locals 2
    .param p0, "memoryDeviceConfig"    # I

    .prologue
    .line 341
    sget-boolean v0, Lorg/chromium/base/library_loader/Linker;->$assertionsDisabled:Z

    if-nez v0, :cond_0

    sget-boolean v0, Lorg/chromium/base/library_loader/NativeLibraries;->ENABLE_LINKER_TESTS:Z

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 342
    :cond_0
    const-class v1, Lorg/chromium/base/library_loader/Linker;

    monitor-enter v1

    .line 343
    :try_start_0
    sget-boolean v0, Lorg/chromium/base/library_loader/Linker;->$assertionsDisabled:Z

    if-nez v0, :cond_1

    sget v0, Lorg/chromium/base/library_loader/Linker;->sMemoryDeviceConfig:I

    if-eqz v0, :cond_1

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 353
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 344
    :cond_1
    :try_start_1
    sget-boolean v0, Lorg/chromium/base/library_loader/Linker;->$assertionsDisabled:Z

    if-nez v0, :cond_2

    const/4 v0, 0x1

    if-eq p0, v0, :cond_2

    const/4 v0, 0x2

    if-eq p0, v0, :cond_2

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 352
    :cond_2
    sput p0, Lorg/chromium/base/library_loader/Linker;->sMemoryDeviceConfig:I

    .line 353
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 354
    return-void
.end method

.method public static setTestRunnerClassName(Ljava/lang/String;)V
    .locals 2
    .param p0, "testRunnerClassName"    # Ljava/lang/String;

    .prologue
    .line 309
    sget-boolean v0, Lorg/chromium/base/library_loader/NativeLibraries;->ENABLE_LINKER_TESTS:Z

    if-nez v0, :cond_0

    .line 318
    :goto_0
    return-void

    .line 314
    :cond_0
    const-class v1, Lorg/chromium/base/library_loader/Linker;

    monitor-enter v1

    .line 315
    :try_start_0
    sget-boolean v0, Lorg/chromium/base/library_loader/Linker;->$assertionsDisabled:Z

    if-nez v0, :cond_1

    sget-object v0, Lorg/chromium/base/library_loader/Linker;->sTestRunnerClassName:Ljava/lang/String;

    if-eqz v0, :cond_1

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 317
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 316
    :cond_1
    :try_start_1
    sput-object p0, Lorg/chromium/base/library_loader/Linker;->sTestRunnerClassName:Ljava/lang/String;

    .line 317
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0
.end method

.method private static setupBaseLoadAddressLocked()V
    .locals 8

    .prologue
    const-wide/16 v6, 0x0

    const/4 v4, 0x0

    .line 603
    sget-boolean v2, Lorg/chromium/base/library_loader/Linker;->$assertionsDisabled:Z

    if-nez v2, :cond_0

    const-class v2, Lorg/chromium/base/library_loader/Linker;

    invoke-static {v2}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    new-instance v2, Ljava/lang/AssertionError;

    invoke-direct {v2}, Ljava/lang/AssertionError;-><init>()V

    throw v2

    .line 604
    :cond_0
    sget-wide v2, Lorg/chromium/base/library_loader/Linker;->sBaseLoadAddress:J

    cmp-long v2, v2, v6

    if-nez v2, :cond_1

    .line 605
    invoke-static {}, Lorg/chromium/base/library_loader/Linker;->computeRandomBaseLoadAddress()J

    move-result-wide v0

    .line 606
    .local v0, "address":J
    sput-wide v0, Lorg/chromium/base/library_loader/Linker;->sBaseLoadAddress:J

    .line 607
    sput-wide v0, Lorg/chromium/base/library_loader/Linker;->sCurrentLoadAddress:J

    .line 608
    cmp-long v2, v0, v6

    if-nez v2, :cond_1

    .line 611
    const-string v2, "chromium_android_linker"

    const-string v3, "Disabling shared RELROs due address space pressure"

    invoke-static {v2, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 612
    sput-boolean v4, Lorg/chromium/base/library_loader/Linker;->sBrowserUsesSharedRelro:Z

    .line 613
    sput-boolean v4, Lorg/chromium/base/library_loader/Linker;->sWaitForSharedRelros:Z

    .line 616
    :cond_1
    return-void
.end method

.method public static useSharedRelros(Landroid/os/Bundle;)V
    .locals 4
    .param p0, "bundle"    # Landroid/os/Bundle;

    .prologue
    const/4 v3, 0x0

    .line 499
    const/4 v0, 0x0

    .line 500
    .local v0, "clonedBundle":Landroid/os/Bundle;
    if-eqz p0, :cond_0

    .line 501
    const-class v2, Lorg/chromium/base/library_loader/Linker$LibInfo;

    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v2

    invoke-virtual {p0, v2}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 502
    new-instance v0, Landroid/os/Bundle;

    .end local v0    # "clonedBundle":Landroid/os/Bundle;
    const-class v2, Lorg/chromium/base/library_loader/Linker$LibInfo;

    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v2

    invoke-direct {v0, v2}, Landroid/os/Bundle;-><init>(Ljava/lang/ClassLoader;)V

    .line 503
    .restart local v0    # "clonedBundle":Landroid/os/Bundle;
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v1

    .line 504
    .local v1, "parcel":Landroid/os/Parcel;
    invoke-virtual {p0, v1, v3}, Landroid/os/Bundle;->writeToParcel(Landroid/os/Parcel;I)V

    .line 505
    invoke-virtual {v1, v3}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 506
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->readFromParcel(Landroid/os/Parcel;)V

    .line 507
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 513
    .end local v1    # "parcel":Landroid/os/Parcel;
    :cond_0
    const-class v3, Lorg/chromium/base/library_loader/Linker;

    monitor-enter v3

    .line 516
    :try_start_0
    sput-object v0, Lorg/chromium/base/library_loader/Linker;->sSharedRelros:Landroid/os/Bundle;

    .line 518
    const-class v2, Lorg/chromium/base/library_loader/Linker;

    invoke-virtual {v2}, Ljava/lang/Object;->notifyAll()V

    .line 519
    monitor-exit v3

    .line 520
    return-void

    .line 519
    :catchall_0
    move-exception v2

    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v2
.end method

.method private static useSharedRelrosLocked(Landroid/os/Bundle;)V
    .locals 8
    .param p0, "bundle"    # Landroid/os/Bundle;

    .prologue
    .line 662
    sget-boolean v5, Lorg/chromium/base/library_loader/Linker;->$assertionsDisabled:Z

    if-nez v5, :cond_0

    const-class v5, Lorg/chromium/base/library_loader/Linker;

    invoke-static {v5}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_0

    new-instance v5, Ljava/lang/AssertionError;

    invoke-direct {v5}, Ljava/lang/AssertionError;-><init>()V

    throw v5

    .line 666
    :cond_0
    if-nez p0, :cond_2

    .line 700
    :cond_1
    :goto_0
    return-void

    .line 671
    :cond_2
    sget-boolean v5, Lorg/chromium/base/library_loader/Linker;->sRelroSharingSupported:Z

    if-eqz v5, :cond_1

    .line 676
    sget-object v5, Lorg/chromium/base/library_loader/Linker;->sLoadedLibraries:Ljava/util/HashMap;

    if-eqz v5, :cond_1

    .line 682
    invoke-static {p0}, Lorg/chromium/base/library_loader/Linker;->createLibInfoMapFromBundle(Landroid/os/Bundle;)Ljava/util/HashMap;

    move-result-object v4

    .line 685
    .local v4, "relroMap":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Lorg/chromium/base/library_loader/Linker$LibInfo;>;"
    invoke-virtual {v4}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .local v1, "i$":Ljava/util/Iterator;
    :cond_3
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 686
    .local v0, "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Lorg/chromium/base/library_loader/Linker$LibInfo;>;"
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 687
    .local v3, "libName":Ljava/lang/String;
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lorg/chromium/base/library_loader/Linker$LibInfo;

    .line 688
    .local v2, "libInfo":Lorg/chromium/base/library_loader/Linker$LibInfo;
    invoke-static {v3, v2}, Lorg/chromium/base/library_loader/Linker;->nativeUseSharedRelro(Ljava/lang/String;Lorg/chromium/base/library_loader/Linker$LibInfo;)Z

    move-result v5

    if-nez v5, :cond_3

    .line 689
    const-string v5, "chromium_android_linker"

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Could not use shared RELRO section for "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_1

    .line 696
    .end local v0    # "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Lorg/chromium/base/library_loader/Linker$LibInfo;>;"
    .end local v2    # "libInfo":Lorg/chromium/base/library_loader/Linker$LibInfo;
    .end local v3    # "libName":Ljava/lang/String;
    :cond_4
    sget-boolean v5, Lorg/chromium/base/library_loader/Linker;->sInBrowserProcess:Z

    if-nez v5, :cond_1

    .line 697
    invoke-static {v4}, Lorg/chromium/base/library_loader/Linker;->closeLibInfoMap(Ljava/util/HashMap;)V

    goto :goto_0
.end method
