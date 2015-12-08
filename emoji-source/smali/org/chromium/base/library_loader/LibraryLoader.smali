.class public Lorg/chromium/base/library_loader/LibraryLoader;
.super Ljava/lang/Object;
.source "LibraryLoader.java"


# annotations
.annotation runtime Lorg/chromium/base/JNINamespace;
    value = "base::android"
.end annotation


# static fields
.field static final synthetic $assertionsDisabled:Z

.field private static final TAG:Ljava/lang/String; = "LibraryLoader"

.field private static sCommandLineSwitched:Z

.field private static sInitialized:Z

.field private static sLoaded:Z

.field private static final sLock:Ljava/lang/Object;

.field private static sNativeLibraryHackWasUsed:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 30
    const-class v0, Lorg/chromium/base/library_loader/LibraryLoader;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Lorg/chromium/base/library_loader/LibraryLoader;->$assertionsDisabled:Z

    .line 35
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lorg/chromium/base/library_loader/LibraryLoader;->sLock:Ljava/lang/Object;

    .line 38
    sput-boolean v1, Lorg/chromium/base/library_loader/LibraryLoader;->sLoaded:Z

    .line 42
    sput-boolean v1, Lorg/chromium/base/library_loader/LibraryLoader;->sCommandLineSwitched:Z

    .line 47
    sput-boolean v1, Lorg/chromium/base/library_loader/LibraryLoader;->sInitialized:Z

    .line 52
    sput-boolean v1, Lorg/chromium/base/library_loader/LibraryLoader;->sNativeLibraryHackWasUsed:Z

    return-void

    :cond_0
    move v0, v1

    .line 30
    goto :goto_0
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static ensureCommandLineSwitchedAlreadyLocked()V
    .locals 1

    .prologue
    .line 252
    sget-boolean v0, Lorg/chromium/base/library_loader/LibraryLoader;->$assertionsDisabled:Z

    if-nez v0, :cond_0

    sget-boolean v0, Lorg/chromium/base/library_loader/LibraryLoader;->sLoaded:Z

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 253
    :cond_0
    sget-boolean v0, Lorg/chromium/base/library_loader/LibraryLoader;->sCommandLineSwitched:Z

    if-eqz v0, :cond_1

    .line 259
    :goto_0
    return-void

    .line 256
    :cond_1
    invoke-static {}, Lorg/chromium/base/CommandLine;->getJavaSwitchesOrNull()[Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lorg/chromium/base/library_loader/LibraryLoader;->nativeInitCommandLine([Ljava/lang/String;)V

    .line 257
    invoke-static {}, Lorg/chromium/base/CommandLine;->enableNativeProxy()V

    .line 258
    const/4 v0, 0x1

    sput-boolean v0, Lorg/chromium/base/library_loader/LibraryLoader;->sCommandLineSwitched:Z

    goto :goto_0
.end method

.method public static ensureInitialized()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/chromium/base/library_loader/ProcessInitException;
        }
    .end annotation

    .prologue
    .line 61
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lorg/chromium/base/library_loader/LibraryLoader;->ensureInitialized(Landroid/content/Context;Z)V

    .line 62
    return-void
.end method

.method public static ensureInitialized(Landroid/content/Context;Z)V
    .locals 2
    .param p0, "context"    # Landroid/content/Context;
    .param p1, "shouldDeleteOldWorkaroundLibraries"    # Z
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/chromium/base/library_loader/ProcessInitException;
        }
    .end annotation

    .prologue
    .line 84
    sget-object v1, Lorg/chromium/base/library_loader/LibraryLoader;->sLock:Ljava/lang/Object;

    monitor-enter v1

    .line 85
    :try_start_0
    sget-boolean v0, Lorg/chromium/base/library_loader/LibraryLoader;->sInitialized:Z

    if-eqz v0, :cond_0

    .line 87
    monitor-exit v1

    .line 92
    :goto_0
    return-void

    .line 89
    :cond_0
    invoke-static {p0, p1}, Lorg/chromium/base/library_loader/LibraryLoader;->loadAlreadyLocked(Landroid/content/Context;Z)V

    .line 90
    invoke-static {}, Lorg/chromium/base/library_loader/LibraryLoader;->initializeAlreadyLocked()V

    .line 91
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public static initialize()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/chromium/base/library_loader/ProcessInitException;
        }
    .end annotation

    .prologue
    .line 139
    sget-object v1, Lorg/chromium/base/library_loader/LibraryLoader;->sLock:Ljava/lang/Object;

    monitor-enter v1

    .line 140
    :try_start_0
    invoke-static {}, Lorg/chromium/base/library_loader/LibraryLoader;->initializeAlreadyLocked()V

    .line 141
    monitor-exit v1

    .line 142
    return-void

    .line 141
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method private static initializeAlreadyLocked()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/chromium/base/library_loader/ProcessInitException;
        }
    .end annotation

    .prologue
    const/4 v2, 0x1

    .line 263
    sget-boolean v0, Lorg/chromium/base/library_loader/LibraryLoader;->sInitialized:Z

    if-eqz v0, :cond_0

    .line 290
    :goto_0
    return-void

    .line 268
    :cond_0
    sget-boolean v0, Lorg/chromium/base/library_loader/LibraryLoader;->sCommandLineSwitched:Z

    if-nez v0, :cond_1

    .line 269
    invoke-static {}, Lorg/chromium/base/CommandLine;->getJavaSwitchesOrNull()[Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lorg/chromium/base/library_loader/LibraryLoader;->nativeInitCommandLine([Ljava/lang/String;)V

    .line 272
    :cond_1
    invoke-static {}, Lorg/chromium/base/library_loader/LibraryLoader;->nativeLibraryLoaded()Z

    move-result v0

    if-nez v0, :cond_2

    .line 273
    const-string v0, "LibraryLoader"

    const-string v1, "error calling nativeLibraryLoaded"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 274
    new-instance v0, Lorg/chromium/base/library_loader/ProcessInitException;

    invoke-direct {v0, v2}, Lorg/chromium/base/library_loader/ProcessInitException;-><init>(I)V

    throw v0

    .line 279
    :cond_2
    sput-boolean v2, Lorg/chromium/base/library_loader/LibraryLoader;->sInitialized:Z

    .line 283
    sget-boolean v0, Lorg/chromium/base/library_loader/LibraryLoader;->sCommandLineSwitched:Z

    if-nez v0, :cond_3

    .line 284
    invoke-static {}, Lorg/chromium/base/CommandLine;->enableNativeProxy()V

    .line 285
    sput-boolean v2, Lorg/chromium/base/library_loader/LibraryLoader;->sCommandLineSwitched:Z

    .line 289
    :cond_3
    invoke-static {}, Lorg/chromium/base/TraceEvent;->registerNativeEnabledObserver()V

    goto :goto_0
.end method

.method public static isInitialized()Z
    .locals 2

    .prologue
    .line 98
    sget-object v1, Lorg/chromium/base/library_loader/LibraryLoader;->sLock:Ljava/lang/Object;

    monitor-enter v1

    .line 99
    :try_start_0
    sget-boolean v0, Lorg/chromium/base/library_loader/LibraryLoader;->sInitialized:Z

    monitor-exit v1

    return v0

    .line 100
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method private static loadAlreadyLocked(Landroid/content/Context;Z)V
    .locals 20
    .param p0, "context"    # Landroid/content/Context;
    .param p1, "shouldDeleteOldWorkaroundLibraries"    # Z
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/chromium/base/library_loader/ProcessInitException;
        }
    .end annotation

    .prologue
    .line 149
    :try_start_0
    sget-boolean v14, Lorg/chromium/base/library_loader/LibraryLoader;->sLoaded:Z

    if-nez v14, :cond_9

    .line 150
    sget-boolean v14, Lorg/chromium/base/library_loader/LibraryLoader;->$assertionsDisabled:Z

    if-nez v14, :cond_0

    sget-boolean v14, Lorg/chromium/base/library_loader/LibraryLoader;->sInitialized:Z

    if-eqz v14, :cond_0

    new-instance v14, Ljava/lang/AssertionError;

    invoke-direct {v14}, Ljava/lang/AssertionError;-><init>()V

    throw v14
    :try_end_0
    .catch Ljava/lang/UnsatisfiedLinkError; {:try_start_0 .. :try_end_0} :catch_0

    .line 225
    :catch_0
    move-exception v3

    .line 226
    .local v3, "e":Ljava/lang/UnsatisfiedLinkError;
    new-instance v14, Lorg/chromium/base/library_loader/ProcessInitException;

    const/4 v15, 0x2

    invoke-direct {v14, v15, v3}, Lorg/chromium/base/library_loader/ProcessInitException;-><init>(ILjava/lang/Throwable;)V

    throw v14

    .line 152
    .end local v3    # "e":Ljava/lang/UnsatisfiedLinkError;
    :cond_0
    :try_start_1
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v8

    .line 153
    .local v8, "startTime":J
    invoke-static {}, Lorg/chromium/base/library_loader/Linker;->isUsed()Z

    move-result v12

    .line 155
    .local v12, "useChromiumLinker":Z
    if-eqz v12, :cond_a

    .line 157
    invoke-static {}, Lorg/chromium/base/library_loader/Linker;->prepareLibraryLoad()V

    .line 159
    sget-object v2, Lorg/chromium/base/library_loader/NativeLibraries;->LIBRARIES:[Ljava/lang/String;

    .local v2, "arr$":[Ljava/lang/String;
    array-length v6, v2

    .local v6, "len$":I
    const/4 v4, 0x0

    .local v4, "i$":I
    :goto_0
    if-ge v4, v6, :cond_6

    aget-object v7, v2, v4

    .line 160
    .local v7, "library":Ljava/lang/String;
    const/4 v13, 0x0

    .line 161
    .local v13, "zipfile":Ljava/lang/String;
    invoke-static {}, Lorg/chromium/base/library_loader/Linker;->isInZipFile()Z

    move-result v14

    if-eqz v14, :cond_3

    .line 162
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v14

    iget-object v13, v14, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    .line 163
    const-string v14, "LibraryLoader"

    new-instance v15, Ljava/lang/StringBuilder;

    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    const-string v16, "Loading "

    invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v15

    invoke-virtual {v15, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v15

    const-string v16, " from within "

    invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v15

    invoke-virtual {v15, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v15

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v15

    invoke-static {v14, v15}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 168
    :goto_1
    const/4 v5, 0x0

    .line 169
    .local v5, "isLoaded":Z
    invoke-static {}, Lorg/chromium/base/library_loader/Linker;->isUsingBrowserSharedRelros()Z
    :try_end_1
    .catch Ljava/lang/UnsatisfiedLinkError; {:try_start_1 .. :try_end_1} :catch_0

    move-result v14

    if-eqz v14, :cond_1

    .line 171
    if-eqz v13, :cond_4

    .line 172
    :try_start_2
    invoke-static {v13, v7}, Lorg/chromium/base/library_loader/Linker;->loadLibraryInZipFile(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/UnsatisfiedLinkError; {:try_start_2 .. :try_end_2} :catch_1

    .line 176
    :goto_2
    const/4 v5, 0x1

    .line 183
    :cond_1
    :goto_3
    if-nez v5, :cond_2

    .line 184
    if-eqz v13, :cond_5

    .line 185
    :try_start_3
    invoke-static {v13, v7}, Lorg/chromium/base/library_loader/Linker;->loadLibraryInZipFile(Ljava/lang/String;Ljava/lang/String;)V

    .line 159
    :cond_2
    :goto_4
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 165
    .end local v5    # "isLoaded":Z
    :cond_3
    const-string v14, "LibraryLoader"

    new-instance v15, Ljava/lang/StringBuilder;

    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    const-string v16, "Loading: "

    invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v15

    invoke-virtual {v15, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v15

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v15

    invoke-static {v14, v15}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_3
    .catch Ljava/lang/UnsatisfiedLinkError; {:try_start_3 .. :try_end_3} :catch_0

    goto :goto_1

    .line 174
    .restart local v5    # "isLoaded":Z
    :cond_4
    :try_start_4
    invoke-static {v7}, Lorg/chromium/base/library_loader/Linker;->loadLibrary(Ljava/lang/String;)V
    :try_end_4
    .catch Ljava/lang/UnsatisfiedLinkError; {:try_start_4 .. :try_end_4} :catch_1

    goto :goto_2

    .line 177
    :catch_1
    move-exception v3

    .line 178
    .restart local v3    # "e":Ljava/lang/UnsatisfiedLinkError;
    :try_start_5
    const-string v14, "LibraryLoader"

    const-string v15, "Failed to load native library with shared RELRO, retrying without"

    invoke-static {v14, v15}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 180
    invoke-static {}, Lorg/chromium/base/library_loader/Linker;->disableSharedRelros()V

    goto :goto_3

    .line 187
    .end local v3    # "e":Ljava/lang/UnsatisfiedLinkError;
    :cond_5
    invoke-static {v7}, Lorg/chromium/base/library_loader/Linker;->loadLibrary(Ljava/lang/String;)V

    goto :goto_4

    .line 192
    .end local v5    # "isLoaded":Z
    .end local v7    # "library":Ljava/lang/String;
    .end local v13    # "zipfile":Ljava/lang/String;
    :cond_6
    invoke-static {}, Lorg/chromium/base/library_loader/Linker;->finishLibraryLoad()V

    .line 210
    :cond_7
    if-eqz p0, :cond_8

    if-eqz p1, :cond_8

    sget-boolean v14, Lorg/chromium/base/library_loader/LibraryLoader;->sNativeLibraryHackWasUsed:Z

    if-nez v14, :cond_8

    .line 213
    invoke-static/range {p0 .. p0}, Lorg/chromium/base/library_loader/LibraryLoaderHelper;->deleteWorkaroundLibrariesAsynchronously(Landroid/content/Context;)V

    .line 217
    :cond_8
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v10

    .line 218
    .local v10, "stopTime":J
    const-string v14, "LibraryLoader"

    const-string v15, "Time to load native libraries: %d ms (timestamps %d-%d)"

    const/16 v16, 0x3

    move/from16 v0, v16

    new-array v0, v0, [Ljava/lang/Object;

    move-object/from16 v16, v0

    const/16 v17, 0x0

    sub-long v18, v10, v8

    invoke-static/range {v18 .. v19}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v18

    aput-object v18, v16, v17

    const/16 v17, 0x1

    const-wide/16 v18, 0x2710

    rem-long v18, v8, v18

    invoke-static/range {v18 .. v19}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v18

    aput-object v18, v16, v17

    const/16 v17, 0x2

    const-wide/16 v18, 0x2710

    rem-long v18, v10, v18

    invoke-static/range {v18 .. v19}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v18

    aput-object v18, v16, v17

    invoke-static/range {v15 .. v16}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v15

    invoke-static {v14, v15}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 223
    const/4 v14, 0x1

    sput-boolean v14, Lorg/chromium/base/library_loader/LibraryLoader;->sLoaded:Z
    :try_end_5
    .catch Ljava/lang/UnsatisfiedLinkError; {:try_start_5 .. :try_end_5} :catch_0

    .line 229
    .end local v2    # "arr$":[Ljava/lang/String;
    .end local v4    # "i$":I
    .end local v6    # "len$":I
    .end local v8    # "startTime":J
    .end local v10    # "stopTime":J
    .end local v12    # "useChromiumLinker":Z
    :cond_9
    const-string v14, "LibraryLoader"

    const-string v15, "Expected native library version number \"%s\",actual native library version number \"%s\""

    const/16 v16, 0x2

    move/from16 v0, v16

    new-array v0, v0, [Ljava/lang/Object;

    move-object/from16 v16, v0

    const/16 v17, 0x0

    sget-object v18, Lorg/chromium/base/library_loader/NativeLibraries;->VERSION_NUMBER:Ljava/lang/String;

    aput-object v18, v16, v17

    const/16 v17, 0x1

    invoke-static {}, Lorg/chromium/base/library_loader/LibraryLoader;->nativeGetVersionNumber()Ljava/lang/String;

    move-result-object v18

    aput-object v18, v16, v17

    invoke-static/range {v15 .. v16}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v15

    invoke-static {v14, v15}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 234
    sget-object v14, Lorg/chromium/base/library_loader/NativeLibraries;->VERSION_NUMBER:Ljava/lang/String;

    invoke-static {}, Lorg/chromium/base/library_loader/LibraryLoader;->nativeGetVersionNumber()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v14, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_c

    .line 235
    new-instance v14, Lorg/chromium/base/library_loader/ProcessInitException;

    const/4 v15, 0x3

    invoke-direct {v14, v15}, Lorg/chromium/base/library_loader/ProcessInitException;-><init>(I)V

    throw v14

    .line 195
    .restart local v8    # "startTime":J
    .restart local v12    # "useChromiumLinker":Z
    :cond_a
    :try_start_6
    sget-object v2, Lorg/chromium/base/library_loader/NativeLibraries;->LIBRARIES:[Ljava/lang/String;

    .restart local v2    # "arr$":[Ljava/lang/String;
    array-length v6, v2

    .restart local v6    # "len$":I
    const/4 v4, 0x0

    .restart local v4    # "i$":I
    :goto_5
    if-ge v4, v6, :cond_7

    aget-object v7, v2, v4
    :try_end_6
    .catch Ljava/lang/UnsatisfiedLinkError; {:try_start_6 .. :try_end_6} :catch_0

    .line 197
    .restart local v7    # "library":Ljava/lang/String;
    :try_start_7
    invoke-static {v7}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V
    :try_end_7
    .catch Ljava/lang/UnsatisfiedLinkError; {:try_start_7 .. :try_end_7} :catch_2

    .line 195
    :goto_6
    add-int/lit8 v4, v4, 0x1

    goto :goto_5

    .line 198
    :catch_2
    move-exception v3

    .line 199
    .restart local v3    # "e":Ljava/lang/UnsatisfiedLinkError;
    if-eqz p0, :cond_b

    :try_start_8
    move-object/from16 v0, p0

    invoke-static {v0, v7}, Lorg/chromium/base/library_loader/LibraryLoaderHelper;->tryLoadLibraryUsingWorkaround(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v14

    if-eqz v14, :cond_b

    .line 202
    const/4 v14, 0x1

    sput-boolean v14, Lorg/chromium/base/library_loader/LibraryLoader;->sNativeLibraryHackWasUsed:Z

    goto :goto_6

    .line 204
    :cond_b
    throw v3
    :try_end_8
    .catch Ljava/lang/UnsatisfiedLinkError; {:try_start_8 .. :try_end_8} :catch_0

    .line 237
    .end local v2    # "arr$":[Ljava/lang/String;
    .end local v3    # "e":Ljava/lang/UnsatisfiedLinkError;
    .end local v4    # "i$":I
    .end local v6    # "len$":I
    .end local v7    # "library":Ljava/lang/String;
    .end local v8    # "startTime":J
    .end local v12    # "useChromiumLinker":Z
    :cond_c
    return-void
.end method

.method public static loadNow()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/chromium/base/library_loader/ProcessInitException;
        }
    .end annotation

    .prologue
    .line 110
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lorg/chromium/base/library_loader/LibraryLoader;->loadNow(Landroid/content/Context;Z)V

    .line 111
    return-void
.end method

.method public static loadNow(Landroid/content/Context;Z)V
    .locals 2
    .param p0, "context"    # Landroid/content/Context;
    .param p1, "shouldDeleteOldWorkaroundLibraries"    # Z
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/chromium/base/library_loader/ProcessInitException;
        }
    .end annotation

    .prologue
    .line 128
    sget-object v1, Lorg/chromium/base/library_loader/LibraryLoader;->sLock:Ljava/lang/Object;

    monitor-enter v1

    .line 129
    :try_start_0
    invoke-static {p0, p1}, Lorg/chromium/base/library_loader/LibraryLoader;->loadAlreadyLocked(Landroid/content/Context;Z)V

    .line 130
    monitor-exit v1

    .line 131
    return-void

    .line 130
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method private static native nativeGetVersionNumber()Ljava/lang/String;
.end method

.method private static native nativeInitCommandLine([Ljava/lang/String;)V
.end method

.method private static native nativeLibraryLoaded()Z
.end method

.method private static native nativeRecordChromiumAndroidLinkerHistogram(ZZ)V
.end method

.method private static native nativeRecordNativeLibraryHack(Z)V
.end method

.method public static onNativeInitializationComplete()V
    .locals 2

    .prologue
    .line 295
    invoke-static {}, Lorg/chromium/base/library_loader/Linker;->isUsed()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 296
    invoke-static {}, Lorg/chromium/base/library_loader/Linker;->loadAtFixedAddressFailed()Z

    move-result v0

    invoke-static {}, Lorg/chromium/base/SysUtils;->isLowEndDevice()Z

    move-result v1

    invoke-static {v0, v1}, Lorg/chromium/base/library_loader/LibraryLoader;->nativeRecordChromiumAndroidLinkerHistogram(ZZ)V

    .line 300
    :cond_0
    sget-boolean v0, Lorg/chromium/base/library_loader/LibraryLoader;->sNativeLibraryHackWasUsed:Z

    invoke-static {v0}, Lorg/chromium/base/library_loader/LibraryLoader;->nativeRecordNativeLibraryHack(Z)V

    .line 301
    return-void
.end method

.method public static switchCommandLineForWebView()V
    .locals 2

    .prologue
    .line 243
    sget-object v1, Lorg/chromium/base/library_loader/LibraryLoader;->sLock:Ljava/lang/Object;

    monitor-enter v1

    .line 244
    :try_start_0
    invoke-static {}, Lorg/chromium/base/library_loader/LibraryLoader;->ensureCommandLineSwitchedAlreadyLocked()V

    .line 245
    monitor-exit v1

    .line 246
    return-void

    .line 245
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
