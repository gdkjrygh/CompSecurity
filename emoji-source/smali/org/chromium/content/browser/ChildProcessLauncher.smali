.class public Lorg/chromium/content/browser/ChildProcessLauncher;
.super Ljava/lang/Object;
.source "ChildProcessLauncher.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/chromium/content/browser/ChildProcessLauncher$ChildConnectionAllocator;
    }
.end annotation

.annotation runtime Lorg/chromium/base/JNINamespace;
    value = "content"
.end annotation


# static fields
.field static final synthetic $assertionsDisabled:Z

.field static final CALLBACK_FOR_GPU_PROCESS:I = 0x1

.field static final CALLBACK_FOR_RENDERER_PROCESS:I = 0x2

.field static final CALLBACK_FOR_UNKNOWN_PROCESS:I = 0x0

.field static final MAX_REGISTERED_PRIVILEGED_SERVICES:I = 0x3

.field static final MAX_REGISTERED_SANDBOXED_SERVICES:I = 0x14

.field private static final NULL_PROCESS_HANDLE:I = 0x0

.field private static final SWITCH_GPU_PROCESS:Ljava/lang/String; = "gpu-process"

.field private static final SWITCH_PPAPI_BROKER_PROCESS:Ljava/lang/String; = "ppapi-broker"

.field private static final SWITCH_PROCESS_TYPE:Ljava/lang/String; = "type"

.field private static final SWITCH_RENDERER_PROCESS:Ljava/lang/String; = "renderer"

.field private static final TAG:Ljava/lang/String; = "ChildProcessLauncher"

.field private static sBindingManager:Lorg/chromium/content/browser/BindingManager;

.field private static sConnectionAllocated:Z

.field private static sLinkerInitialized:Z

.field private static sLinkerLoadAddress:J

.field private static final sPrivilegedChildConnectionAllocator:Lorg/chromium/content/browser/ChildProcessLauncher$ChildConnectionAllocator;

.field private static final sSandboxedChildConnectionAllocator:Lorg/chromium/content/browser/ChildProcessLauncher$ChildConnectionAllocator;

.field private static sServiceMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/Integer;",
            "Lorg/chromium/content/browser/ChildProcessConnection;",
            ">;"
        }
    .end annotation
.end field

.field private static sSpareSandboxedConnection:Lorg/chromium/content/browser/ChildProcessConnection;

.field private static sSurfaceTextureSurfaceMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Landroid/util/Pair",
            "<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;",
            "Landroid/view/Surface;",
            ">;"
        }
    .end annotation
.end field

.field private static sViewSurfaceMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/Integer;",
            "Landroid/view/Surface;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 34
    const-class v0, Lorg/chromium/content/browser/ChildProcessLauncher;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    move v0, v1

    :goto_0
    sput-boolean v0, Lorg/chromium/content/browser/ChildProcessLauncher;->$assertionsDisabled:Z

    .line 137
    new-instance v0, Lorg/chromium/content/browser/ChildProcessLauncher$ChildConnectionAllocator;

    invoke-direct {v0, v1}, Lorg/chromium/content/browser/ChildProcessLauncher$ChildConnectionAllocator;-><init>(Z)V

    sput-object v0, Lorg/chromium/content/browser/ChildProcessLauncher;->sSandboxedChildConnectionAllocator:Lorg/chromium/content/browser/ChildProcessLauncher$ChildConnectionAllocator;

    .line 139
    new-instance v0, Lorg/chromium/content/browser/ChildProcessLauncher$ChildConnectionAllocator;

    invoke-direct {v0, v2}, Lorg/chromium/content/browser/ChildProcessLauncher$ChildConnectionAllocator;-><init>(Z)V

    sput-object v0, Lorg/chromium/content/browser/ChildProcessLauncher;->sPrivilegedChildConnectionAllocator:Lorg/chromium/content/browser/ChildProcessLauncher$ChildConnectionAllocator;

    .line 142
    sput-boolean v2, Lorg/chromium/content/browser/ChildProcessLauncher;->sConnectionAllocated:Z

    .line 179
    sput-boolean v2, Lorg/chromium/content/browser/ChildProcessLauncher;->sLinkerInitialized:Z

    .line 180
    const-wide/16 v0, 0x0

    sput-wide v0, Lorg/chromium/content/browser/ChildProcessLauncher;->sLinkerLoadAddress:J

    .line 222
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    sput-object v0, Lorg/chromium/content/browser/ChildProcessLauncher;->sServiceMap:Ljava/util/Map;

    .line 226
    const/4 v0, 0x0

    sput-object v0, Lorg/chromium/content/browser/ChildProcessLauncher;->sSpareSandboxedConnection:Lorg/chromium/content/browser/ChildProcessConnection;

    .line 229
    invoke-static {}, Lorg/chromium/content/browser/BindingManagerImpl;->createBindingManager()Lorg/chromium/content/browser/BindingManagerImpl;

    move-result-object v0

    sput-object v0, Lorg/chromium/content/browser/ChildProcessLauncher;->sBindingManager:Lorg/chromium/content/browser/BindingManager;

    .line 232
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    sput-object v0, Lorg/chromium/content/browser/ChildProcessLauncher;->sViewSurfaceMap:Ljava/util/Map;

    .line 236
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    sput-object v0, Lorg/chromium/content/browser/ChildProcessLauncher;->sSurfaceTextureSurfaceMap:Ljava/util/Map;

    return-void

    :cond_0
    move v0, v2

    .line 34
    goto :goto_0
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 55
    return-void
.end method

.method static synthetic access$000(Lorg/chromium/content/browser/ChildProcessConnection;)V
    .locals 0
    .param p0, "x0"    # Lorg/chromium/content/browser/ChildProcessConnection;

    .prologue
    .line 35
    invoke-static {p0}, Lorg/chromium/content/browser/ChildProcessLauncher;->freeConnection(Lorg/chromium/content/browser/ChildProcessConnection;)V

    return-void
.end method

.method static synthetic access$100()Lorg/chromium/content/browser/BindingManager;
    .locals 1

    .prologue
    .line 35
    sget-object v0, Lorg/chromium/content/browser/ChildProcessLauncher;->sBindingManager:Lorg/chromium/content/browser/BindingManager;

    return-object v0
.end method

.method static synthetic access$200()Ljava/util/Map;
    .locals 1

    .prologue
    .line 35
    sget-object v0, Lorg/chromium/content/browser/ChildProcessLauncher;->sServiceMap:Ljava/util/Map;

    return-object v0
.end method

.method static synthetic access$300(JI)V
    .locals 0
    .param p0, "x0"    # J
    .param p2, "x1"    # I

    .prologue
    .line 35
    invoke-static {p0, p1, p2}, Lorg/chromium/content/browser/ChildProcessLauncher;->nativeOnChildProcessStarted(JI)V

    return-void
.end method

.method static synthetic access$400(ILandroid/view/Surface;II)V
    .locals 0
    .param p0, "x0"    # I
    .param p1, "x1"    # Landroid/view/Surface;
    .param p2, "x2"    # I
    .param p3, "x3"    # I

    .prologue
    .line 35
    invoke-static {p0, p1, p2, p3}, Lorg/chromium/content/browser/ChildProcessLauncher;->nativeEstablishSurfacePeer(ILandroid/view/Surface;II)V

    return-void
.end method

.method static synthetic access$500()Ljava/util/Map;
    .locals 1

    .prologue
    .line 35
    sget-object v0, Lorg/chromium/content/browser/ChildProcessLauncher;->sViewSurfaceMap:Ljava/util/Map;

    return-object v0
.end method

.method static synthetic access$600()Ljava/util/Map;
    .locals 1

    .prologue
    .line 35
    sget-object v0, Lorg/chromium/content/browser/ChildProcessLauncher;->sSurfaceTextureSurfaceMap:Ljava/util/Map;

    return-object v0
.end method

.method private static allocateBoundConnection(Landroid/content/Context;[Ljava/lang/String;Z)Lorg/chromium/content/browser/ChildProcessConnection;
    .locals 2
    .param p0, "context"    # Landroid/content/Context;
    .param p1, "commandLine"    # [Ljava/lang/String;
    .param p2, "inSandbox"    # Z

    .prologue
    .line 205
    invoke-static {}, Lorg/chromium/content/browser/ChildProcessLauncher;->getLinkerParamsForNewConnection()Lorg/chromium/content/app/ChromiumLinkerParams;

    move-result-object v0

    .line 206
    .local v0, "chromiumLinkerParams":Lorg/chromium/content/app/ChromiumLinkerParams;
    invoke-static {p0, p2, v0}, Lorg/chromium/content/browser/ChildProcessLauncher;->allocateConnection(Landroid/content/Context;ZLorg/chromium/content/app/ChromiumLinkerParams;)Lorg/chromium/content/browser/ChildProcessConnection;

    move-result-object v1

    .line 208
    .local v1, "connection":Lorg/chromium/content/browser/ChildProcessConnection;
    if-eqz v1, :cond_0

    .line 209
    invoke-interface {v1, p1}, Lorg/chromium/content/browser/ChildProcessConnection;->start([Ljava/lang/String;)V

    .line 211
    :cond_0
    return-object v1
.end method

.method static allocateBoundConnectionForTesting(Landroid/content/Context;)Lorg/chromium/content/browser/ChildProcessConnection;
    .locals 2
    .param p0, "context"    # Landroid/content/Context;
    .annotation build Lorg/chromium/base/VisibleForTesting;
    .end annotation

    .prologue
    .line 523
    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {p0, v0, v1}, Lorg/chromium/content/browser/ChildProcessLauncher;->allocateBoundConnection(Landroid/content/Context;[Ljava/lang/String;Z)Lorg/chromium/content/browser/ChildProcessConnection;

    move-result-object v0

    return-object v0
.end method

.method private static allocateConnection(Landroid/content/Context;ZLorg/chromium/content/app/ChromiumLinkerParams;)Lorg/chromium/content/browser/ChildProcessConnection;
    .locals 2
    .param p0, "context"    # Landroid/content/Context;
    .param p1, "inSandbox"    # Z
    .param p2, "chromiumLinkerParams"    # Lorg/chromium/content/app/ChromiumLinkerParams;

    .prologue
    .line 163
    new-instance v0, Lorg/chromium/content/browser/ChildProcessLauncher$1;

    invoke-direct {v0}, Lorg/chromium/content/browser/ChildProcessLauncher$1;-><init>()V

    .line 174
    .local v0, "deathCallback":Lorg/chromium/content/browser/ChildProcessConnection$DeathCallback;
    const/4 v1, 0x1

    sput-boolean v1, Lorg/chromium/content/browser/ChildProcessLauncher;->sConnectionAllocated:Z

    .line 175
    invoke-static {p1}, Lorg/chromium/content/browser/ChildProcessLauncher;->getConnectionAllocator(Z)Lorg/chromium/content/browser/ChildProcessLauncher$ChildConnectionAllocator;

    move-result-object v1

    invoke-virtual {v1, p0, v0, p2}, Lorg/chromium/content/browser/ChildProcessLauncher$ChildConnectionAllocator;->allocate(Landroid/content/Context;Lorg/chromium/content/browser/ChildProcessConnection$DeathCallback;Lorg/chromium/content/app/ChromiumLinkerParams;)Lorg/chromium/content/browser/ChildProcessConnection;

    move-result-object v1

    return-object v1
.end method

.method static allocatedConnectionsCountForTesting()I
    .locals 1
    .annotation build Lorg/chromium/base/VisibleForTesting;
    .end annotation

    .prologue
    .line 529
    sget-object v0, Lorg/chromium/content/browser/ChildProcessLauncher;->sSandboxedChildConnectionAllocator:Lorg/chromium/content/browser/ChildProcessLauncher$ChildConnectionAllocator;

    invoke-virtual {v0}, Lorg/chromium/content/browser/ChildProcessLauncher$ChildConnectionAllocator;->allocatedConnectionsCountForTesting()I

    move-result v0

    return v0
.end method

.method static connectedServicesCountForTesting()I
    .locals 1
    .annotation build Lorg/chromium/base/VisibleForTesting;
    .end annotation

    .prologue
    .line 535
    sget-object v0, Lorg/chromium/content/browser/ChildProcessLauncher;->sServiceMap:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    return v0
.end method

.method public static crashProcessForTesting(I)Z
    .locals 4
    .param p0, "pid"    # I
    .annotation build Lorg/chromium/base/VisibleForTesting;
    .end annotation

    .prologue
    const/4 v2, 0x0

    .line 544
    sget-object v1, Lorg/chromium/content/browser/ChildProcessLauncher;->sServiceMap:Ljava/util/Map;

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_0

    move v1, v2

    .line 552
    :goto_0
    return v1

    .line 547
    :cond_0
    :try_start_0
    sget-object v1, Lorg/chromium/content/browser/ChildProcessLauncher;->sServiceMap:Ljava/util/Map;

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/chromium/content/browser/ChildProcessConnectionImpl;

    invoke-virtual {v1}, Lorg/chromium/content/browser/ChildProcessConnectionImpl;->crashServiceForTesting()Z
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 552
    const/4 v1, 0x1

    goto :goto_0

    .line 548
    :catch_0
    move-exception v0

    .local v0, "ex":Landroid/os/RemoteException;
    move v1, v2

    .line 549
    goto :goto_0
.end method

.method private static createCallback(II)Lorg/chromium/content/common/IChildProcessCallback;
    .locals 1
    .param p0, "childProcessId"    # I
    .param p1, "callbackType"    # I

    .prologue
    .line 452
    new-instance v0, Lorg/chromium/content/browser/ChildProcessLauncher$3;

    invoke-direct {v0, p1, p0}, Lorg/chromium/content/browser/ChildProcessLauncher$3;-><init>(II)V

    return-object v0
.end method

.method private static freeConnection(Lorg/chromium/content/browser/ChildProcessConnection;)V
    .locals 1
    .param p0, "connection"    # Lorg/chromium/content/browser/ChildProcessConnection;

    .prologue
    .line 215
    invoke-interface {p0}, Lorg/chromium/content/browser/ChildProcessConnection;->isInSandbox()Z

    move-result v0

    invoke-static {v0}, Lorg/chromium/content/browser/ChildProcessLauncher;->getConnectionAllocator(Z)Lorg/chromium/content/browser/ChildProcessLauncher$ChildConnectionAllocator;

    move-result-object v0

    invoke-virtual {v0, p0}, Lorg/chromium/content/browser/ChildProcessLauncher$ChildConnectionAllocator;->free(Lorg/chromium/content/browser/ChildProcessConnection;)V

    .line 216
    return-void
.end method

.method private static getConnectionAllocator(Z)Lorg/chromium/content/browser/ChildProcessLauncher$ChildConnectionAllocator;
    .locals 1
    .param p0, "inSandbox"    # Z

    .prologue
    .line 157
    if-eqz p0, :cond_0

    sget-object v0, Lorg/chromium/content/browser/ChildProcessLauncher;->sSandboxedChildConnectionAllocator:Lorg/chromium/content/browser/ChildProcessLauncher$ChildConnectionAllocator;

    :goto_0
    return-object v0

    :cond_0
    sget-object v0, Lorg/chromium/content/browser/ChildProcessLauncher;->sPrivilegedChildConnectionAllocator:Lorg/chromium/content/browser/ChildProcessLauncher$ChildConnectionAllocator;

    goto :goto_0
.end method

.method private static getLinkerParamsForNewConnection()Lorg/chromium/content/app/ChromiumLinkerParams;
    .locals 8

    .prologue
    const-wide/16 v6, 0x0

    const/4 v5, 0x1

    .line 183
    sget-boolean v1, Lorg/chromium/content/browser/ChildProcessLauncher;->sLinkerInitialized:Z

    if-nez v1, :cond_1

    .line 184
    invoke-static {}, Lorg/chromium/base/library_loader/Linker;->isUsed()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 185
    invoke-static {}, Lorg/chromium/base/library_loader/Linker;->getBaseLoadAddress()J

    move-result-wide v2

    sput-wide v2, Lorg/chromium/content/browser/ChildProcessLauncher;->sLinkerLoadAddress:J

    .line 186
    sget-wide v2, Lorg/chromium/content/browser/ChildProcessLauncher;->sLinkerLoadAddress:J

    cmp-long v1, v2, v6

    if-nez v1, :cond_0

    .line 187
    const-string v1, "ChildProcessLauncher"

    const-string v2, "Shared RELRO support disabled!"

    invoke-static {v1, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 190
    :cond_0
    sput-boolean v5, Lorg/chromium/content/browser/ChildProcessLauncher;->sLinkerInitialized:Z

    .line 193
    :cond_1
    sget-wide v2, Lorg/chromium/content/browser/ChildProcessLauncher;->sLinkerLoadAddress:J

    cmp-long v1, v2, v6

    if-nez v1, :cond_2

    .line 194
    const/4 v1, 0x0

    .line 198
    .local v0, "waitForSharedRelros":Z
    :goto_0
    return-object v1

    .line 197
    .end local v0    # "waitForSharedRelros":Z
    :cond_2
    const/4 v0, 0x1

    .line 198
    .restart local v0    # "waitForSharedRelros":Z
    new-instance v1, Lorg/chromium/content/app/ChromiumLinkerParams;

    sget-wide v2, Lorg/chromium/content/browser/ChildProcessLauncher;->sLinkerLoadAddress:J

    invoke-static {}, Lorg/chromium/base/library_loader/Linker;->getTestRunnerClassName()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v1, v2, v3, v5, v4}, Lorg/chromium/content/app/ChromiumLinkerParams;-><init>(JZLjava/lang/String;)V

    goto :goto_0
.end method

.method private static getSwitchValue([Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 8
    .param p0, "commandLine"    # [Ljava/lang/String;
    .param p1, "switchKey"    # Ljava/lang/String;

    .prologue
    const/4 v5, 0x0

    .line 312
    if-eqz p0, :cond_0

    if-nez p1, :cond_1

    .line 322
    :cond_0
    :goto_0
    return-object v5

    .line 316
    :cond_1
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "--"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, "="

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 317
    .local v4, "switchKeyPrefix":Ljava/lang/String;
    move-object v0, p0

    .local v0, "arr$":[Ljava/lang/String;
    array-length v3, v0

    .local v3, "len$":I
    const/4 v2, 0x0

    .local v2, "i$":I
    :goto_1
    if-ge v2, v3, :cond_0

    aget-object v1, v0, v2

    .line 318
    .local v1, "command":Ljava/lang/String;
    if-eqz v1, :cond_2

    invoke-virtual {v1, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_2

    .line 319
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v5

    invoke-virtual {v1, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v5

    goto :goto_0

    .line 317
    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_1
.end method

.method private static isOomProtected(I)Z
    .locals 1
    .param p0, "pid"    # I
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 247
    sget-object v0, Lorg/chromium/content/browser/ChildProcessLauncher;->sBindingManager:Lorg/chromium/content/browser/BindingManager;

    invoke-interface {v0, p0}, Lorg/chromium/content/browser/BindingManager;->isOomProtected(I)Z

    move-result v0

    return v0
.end method

.method static logPidWarning(ILjava/lang/String;)V
    .locals 3
    .param p0, "pid"    # I
    .param p1, "message"    # Ljava/lang/String;

    .prologue
    .line 516
    if-lez p0, :cond_0

    invoke-static {}, Lorg/chromium/content/browser/ChildProcessLauncher;->nativeIsSingleProcess()Z

    move-result v0

    if-nez v0, :cond_0

    .line 517
    const-string v0, "ChildProcessLauncher"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", pid="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 519
    :cond_0
    return-void
.end method

.method private static native nativeEstablishSurfacePeer(ILandroid/view/Surface;II)V
.end method

.method private static native nativeIsSingleProcess()Z
.end method

.method private static native nativeOnChildProcessStarted(JI)V
.end method

.method public static onBroughtToForeground()V
    .locals 1

    .prologue
    .line 293
    sget-object v0, Lorg/chromium/content/browser/ChildProcessLauncher;->sBindingManager:Lorg/chromium/content/browser/BindingManager;

    invoke-interface {v0}, Lorg/chromium/content/browser/BindingManager;->onBroughtToForeground()V

    .line 294
    return-void
.end method

.method public static onSentToBackground()V
    .locals 1

    .prologue
    .line 286
    sget-object v0, Lorg/chromium/content/browser/ChildProcessLauncher;->sBindingManager:Lorg/chromium/content/browser/BindingManager;

    invoke-interface {v0}, Lorg/chromium/content/browser/BindingManager;->onSentToBackground()V

    .line 287
    return-void
.end method

.method private static registerSurfaceTexture(IILandroid/graphics/SurfaceTexture;)V
    .locals 3
    .param p0, "surfaceTextureId"    # I
    .param p1, "childProcessId"    # I
    .param p2, "surfaceTexture"    # Landroid/graphics/SurfaceTexture;
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 263
    new-instance v0, Landroid/util/Pair;

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 264
    .local v0, "key":Landroid/util/Pair;, "Landroid/util/Pair<Ljava/lang/Integer;Ljava/lang/Integer;>;"
    sget-object v1, Lorg/chromium/content/browser/ChildProcessLauncher;->sSurfaceTextureSurfaceMap:Ljava/util/Map;

    new-instance v2, Landroid/view/Surface;

    invoke-direct {v2, p2}, Landroid/view/Surface;-><init>(Landroid/graphics/SurfaceTexture;)V

    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 265
    return-void
.end method

.method private static registerViewSurface(ILandroid/view/Surface;)V
    .locals 2
    .param p0, "surfaceId"    # I
    .param p1, "surface"    # Landroid/view/Surface;
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 252
    sget-object v0, Lorg/chromium/content/browser/ChildProcessLauncher;->sViewSurfaceMap:Ljava/util/Map;

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 253
    return-void
.end method

.method public static setBindingManagerForTesting(Lorg/chromium/content/browser/BindingManager;)V
    .locals 0
    .param p0, "manager"    # Lorg/chromium/content/browser/BindingManager;
    .annotation build Lorg/chromium/base/VisibleForTesting;
    .end annotation

    .prologue
    .line 241
    sput-object p0, Lorg/chromium/content/browser/ChildProcessLauncher;->sBindingManager:Lorg/chromium/content/browser/BindingManager;

    .line 242
    return-void
.end method

.method public static setChildProcessClass(Ljava/lang/Class;Ljava/lang/Class;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<+",
            "Lorg/chromium/content/app/SandboxedProcessService;",
            ">;",
            "Ljava/lang/Class",
            "<+",
            "Lorg/chromium/content/app/PrivilegedProcessService;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 151
    .local p0, "sandboxedServiceClass":Ljava/lang/Class;, "Ljava/lang/Class<+Lorg/chromium/content/app/SandboxedProcessService;>;"
    .local p1, "privilegedServiceClass":Ljava/lang/Class;, "Ljava/lang/Class<+Lorg/chromium/content/app/PrivilegedProcessService;>;"
    sget-boolean v0, Lorg/chromium/content/browser/ChildProcessLauncher;->$assertionsDisabled:Z

    if-nez v0, :cond_0

    sget-boolean v0, Lorg/chromium/content/browser/ChildProcessLauncher;->sConnectionAllocated:Z

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 152
    :cond_0
    sget-object v0, Lorg/chromium/content/browser/ChildProcessLauncher;->sSandboxedChildConnectionAllocator:Lorg/chromium/content/browser/ChildProcessLauncher$ChildConnectionAllocator;

    invoke-virtual {v0, p0}, Lorg/chromium/content/browser/ChildProcessLauncher$ChildConnectionAllocator;->setServiceClass(Ljava/lang/Class;)V

    .line 153
    sget-object v0, Lorg/chromium/content/browser/ChildProcessLauncher;->sPrivilegedChildConnectionAllocator:Lorg/chromium/content/browser/ChildProcessLauncher$ChildConnectionAllocator;

    invoke-virtual {v0, p1}, Lorg/chromium/content/browser/ChildProcessLauncher$ChildConnectionAllocator;->setServiceClass(Ljava/lang/Class;)V

    .line 154
    return-void
.end method

.method public static setInForeground(IZ)V
    .locals 1
    .param p0, "pid"    # I
    .param p1, "inForeground"    # Z
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 279
    sget-object v0, Lorg/chromium/content/browser/ChildProcessLauncher;->sBindingManager:Lorg/chromium/content/browser/BindingManager;

    invoke-interface {v0, p0, p1}, Lorg/chromium/content/browser/BindingManager;->setInForeground(IZ)V

    .line 280
    return-void
.end method

.method static start(Landroid/content/Context;[Ljava/lang/String;I[I[I[ZJ)V
    .locals 12
    .param p0, "context"    # Landroid/content/Context;
    .param p1, "commandLine"    # [Ljava/lang/String;
    .param p2, "childProcessId"    # I
    .param p3, "fileIds"    # [I
    .param p4, "fileFds"    # [I
    .param p5, "fileAutoClose"    # [Z
    .param p6, "clientContext"    # J
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 348
    invoke-static {}, Lorg/chromium/base/TraceEvent;->begin()V

    .line 349
    sget-boolean v4, Lorg/chromium/content/browser/ChildProcessLauncher;->$assertionsDisabled:Z

    if-nez v4, :cond_1

    array-length v4, p3

    move-object/from16 v0, p4

    array-length v5, v0

    if-ne v4, v5, :cond_0

    move-object/from16 v0, p4

    array-length v4, v0

    move-object/from16 v0, p5

    array-length v5, v0

    if-eq v4, v5, :cond_1

    :cond_0
    new-instance v4, Ljava/lang/AssertionError;

    invoke-direct {v4}, Ljava/lang/AssertionError;-><init>()V

    throw v4

    .line 350
    :cond_1
    move-object/from16 v0, p4

    array-length v4, v0

    new-array v6, v4, [Lorg/chromium/content/browser/FileDescriptorInfo;

    .line 351
    .local v6, "filesToBeMapped":[Lorg/chromium/content/browser/FileDescriptorInfo;
    const/4 v2, 0x0

    .local v2, "i":I
    :goto_0
    move-object/from16 v0, p4

    array-length v4, v0

    if-ge v2, v4, :cond_2

    .line 352
    new-instance v4, Lorg/chromium/content/browser/FileDescriptorInfo;

    aget v5, p3, v2

    aget v8, p4, v2

    aget-boolean v9, p5, v2

    invoke-direct {v4, v5, v8, v9}, Lorg/chromium/content/browser/FileDescriptorInfo;-><init>(IIZ)V

    aput-object v4, v6, v2

    .line 351
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 355
    :cond_2
    sget-boolean v4, Lorg/chromium/content/browser/ChildProcessLauncher;->$assertionsDisabled:Z

    if-nez v4, :cond_3

    const-wide/16 v4, 0x0

    cmp-long v4, p6, v4

    if-nez v4, :cond_3

    new-instance v4, Ljava/lang/AssertionError;

    invoke-direct {v4}, Ljava/lang/AssertionError;-><init>()V

    throw v4

    .line 357
    :cond_3
    const/4 v7, 0x0

    .line 358
    .local v7, "callbackType":I
    const/4 v10, 0x1

    .line 359
    .local v10, "inSandbox":Z
    const-string v4, "type"

    invoke-static {p1, v4}, Lorg/chromium/content/browser/ChildProcessLauncher;->getSwitchValue([Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 360
    .local v11, "processType":Ljava/lang/String;
    const-string v4, "renderer"

    invoke-virtual {v4, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    .line 361
    const/4 v7, 0x2

    .line 368
    :cond_4
    :goto_1
    const/4 v3, 0x0

    .line 369
    .local v3, "allocatedConnection":Lorg/chromium/content/browser/ChildProcessConnection;
    const-class v5, Lorg/chromium/content/browser/ChildProcessLauncher;

    monitor-enter v5

    .line 370
    if-eqz v10, :cond_5

    .line 371
    :try_start_0
    sget-object v3, Lorg/chromium/content/browser/ChildProcessLauncher;->sSpareSandboxedConnection:Lorg/chromium/content/browser/ChildProcessConnection;

    .line 372
    const/4 v4, 0x0

    sput-object v4, Lorg/chromium/content/browser/ChildProcessLauncher;->sSpareSandboxedConnection:Lorg/chromium/content/browser/ChildProcessConnection;

    .line 374
    :cond_5
    monitor-exit v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 375
    if-nez v3, :cond_8

    .line 376
    invoke-static {p0, p1, v10}, Lorg/chromium/content/browser/ChildProcessLauncher;->allocateBoundConnection(Landroid/content/Context;[Ljava/lang/String;Z)Lorg/chromium/content/browser/ChildProcessConnection;

    move-result-object v3

    .line 377
    if-nez v3, :cond_8

    .line 379
    const/4 v4, 0x0

    move-wide/from16 v0, p6

    invoke-static {v0, v1, v4}, Lorg/chromium/content/browser/ChildProcessLauncher;->nativeOnChildProcessStarted(JI)V

    .line 380
    const-string v4, "ChildProcessLauncher"

    const-string v5, "Allocation of new service failed."

    invoke-static {v4, v5}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 381
    invoke-static {}, Lorg/chromium/base/TraceEvent;->end()V

    .line 391
    :goto_2
    return-void

    .line 362
    .end local v3    # "allocatedConnection":Lorg/chromium/content/browser/ChildProcessConnection;
    :cond_6
    const-string v4, "gpu-process"

    invoke-virtual {v4, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_7

    .line 363
    const/4 v7, 0x1

    goto :goto_1

    .line 364
    :cond_7
    const-string v4, "ppapi-broker"

    invoke-virtual {v4, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    .line 365
    const/4 v10, 0x0

    goto :goto_1

    .line 374
    .restart local v3    # "allocatedConnection":Lorg/chromium/content/browser/ChildProcessConnection;
    :catchall_0
    move-exception v4

    :try_start_1
    monitor-exit v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v4

    .line 386
    :cond_8
    const-string v4, "ChildProcessLauncher"

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "Setting up connection to process: slot="

    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-interface {v3}, Lorg/chromium/content/browser/ChildProcessConnection;->getServiceNumber()I

    move-result v8

    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    move-object v4, p1

    move v5, p2

    move-wide/from16 v8, p6

    .line 388
    invoke-static/range {v3 .. v9}, Lorg/chromium/content/browser/ChildProcessLauncher;->triggerConnectionSetup(Lorg/chromium/content/browser/ChildProcessConnection;[Ljava/lang/String;I[Lorg/chromium/content/browser/FileDescriptorInfo;IJ)V

    .line 390
    invoke-static {}, Lorg/chromium/base/TraceEvent;->end()V

    goto :goto_2
.end method

.method static stop(I)V
    .locals 4
    .param p0, "pid"    # I
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 436
    const-string v1, "ChildProcessLauncher"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "stopping child connection: pid="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 437
    sget-object v1, Lorg/chromium/content/browser/ChildProcessLauncher;->sServiceMap:Ljava/util/Map;

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/chromium/content/browser/ChildProcessConnection;

    .line 438
    .local v0, "connection":Lorg/chromium/content/browser/ChildProcessConnection;
    if-nez v0, :cond_0

    .line 439
    const-string v1, "Tried to stop non-existent connection"

    invoke-static {p0, v1}, Lorg/chromium/content/browser/ChildProcessLauncher;->logPidWarning(ILjava/lang/String;)V

    .line 445
    :goto_0
    return-void

    .line 442
    :cond_0
    sget-object v1, Lorg/chromium/content/browser/ChildProcessLauncher;->sBindingManager:Lorg/chromium/content/browser/BindingManager;

    invoke-interface {v1, p0}, Lorg/chromium/content/browser/BindingManager;->clearConnection(I)V

    .line 443
    invoke-interface {v0}, Lorg/chromium/content/browser/ChildProcessConnection;->stop()V

    .line 444
    invoke-static {v0}, Lorg/chromium/content/browser/ChildProcessLauncher;->freeConnection(Lorg/chromium/content/browser/ChildProcessConnection;)V

    goto :goto_0
.end method

.method static triggerConnectionSetup(Lorg/chromium/content/browser/ChildProcessConnection;[Ljava/lang/String;I[Lorg/chromium/content/browser/FileDescriptorInfo;IJ)V
    .locals 7
    .param p0, "connection"    # Lorg/chromium/content/browser/ChildProcessConnection;
    .param p1, "commandLine"    # [Ljava/lang/String;
    .param p2, "childProcessId"    # I
    .param p3, "filesToBeMapped"    # [Lorg/chromium/content/browser/FileDescriptorInfo;
    .param p4, "callbackType"    # I
    .param p5, "clientContext"    # J
    .annotation build Lorg/chromium/base/VisibleForTesting;
    .end annotation

    .prologue
    .line 401
    new-instance v4, Lorg/chromium/content/browser/ChildProcessLauncher$2;

    invoke-direct {v4, p5, p6, p0}, Lorg/chromium/content/browser/ChildProcessLauncher$2;-><init>(JLorg/chromium/content/browser/ChildProcessConnection;)V

    .line 422
    .local v4, "connectionCallback":Lorg/chromium/content/browser/ChildProcessConnection$ConnectionCallback;
    invoke-static {p2, p4}, Lorg/chromium/content/browser/ChildProcessLauncher;->createCallback(II)Lorg/chromium/content/common/IChildProcessCallback;

    move-result-object v3

    invoke-static {}, Lorg/chromium/base/library_loader/Linker;->getSharedRelros()Landroid/os/Bundle;

    move-result-object v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p3

    invoke-interface/range {v0 .. v5}, Lorg/chromium/content/browser/ChildProcessConnection;->setupConnection([Ljava/lang/String;[Lorg/chromium/content/browser/FileDescriptorInfo;Lorg/chromium/content/common/IChildProcessCallback;Lorg/chromium/content/browser/ChildProcessConnection$ConnectionCallback;Landroid/os/Bundle;)V

    .line 427
    return-void
.end method

.method private static unregisterSurfaceTexture(II)V
    .locals 3
    .param p0, "surfaceTextureId"    # I
    .param p1, "childProcessId"    # I
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 269
    new-instance v0, Landroid/util/Pair;

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 270
    .local v0, "key":Landroid/util/Pair;, "Landroid/util/Pair<Ljava/lang/Integer;Ljava/lang/Integer;>;"
    sget-object v1, Lorg/chromium/content/browser/ChildProcessLauncher;->sSurfaceTextureSurfaceMap:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 271
    return-void
.end method

.method private static unregisterViewSurface(I)V
    .locals 2
    .param p0, "surfaceId"    # I
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 257
    sget-object v0, Lorg/chromium/content/browser/ChildProcessLauncher;->sViewSurfaceMap:Ljava/util/Map;

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 258
    return-void
.end method

.method public static warmUp(Landroid/content/Context;)V
    .locals 3
    .param p0, "context"    # Landroid/content/Context;

    .prologue
    .line 303
    const-class v1, Lorg/chromium/content/browser/ChildProcessLauncher;

    monitor-enter v1

    .line 304
    :try_start_0
    sget-boolean v0, Lorg/chromium/content/browser/ChildProcessLauncher;->$assertionsDisabled:Z

    if-nez v0, :cond_0

    invoke-static {}, Lorg/chromium/base/ThreadUtils;->runningOnUiThread()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 308
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 305
    :cond_0
    :try_start_1
    sget-object v0, Lorg/chromium/content/browser/ChildProcessLauncher;->sSpareSandboxedConnection:Lorg/chromium/content/browser/ChildProcessConnection;

    if-nez v0, :cond_1

    .line 306
    const/4 v0, 0x0

    const/4 v2, 0x1

    invoke-static {p0, v0, v2}, Lorg/chromium/content/browser/ChildProcessLauncher;->allocateBoundConnection(Landroid/content/Context;[Ljava/lang/String;Z)Lorg/chromium/content/browser/ChildProcessConnection;

    move-result-object v0

    sput-object v0, Lorg/chromium/content/browser/ChildProcessLauncher;->sSpareSandboxedConnection:Lorg/chromium/content/browser/ChildProcessConnection;

    .line 308
    :cond_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 309
    return-void
.end method
