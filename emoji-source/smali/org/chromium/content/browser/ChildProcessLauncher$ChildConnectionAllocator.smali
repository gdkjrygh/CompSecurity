.class Lorg/chromium/content/browser/ChildProcessLauncher$ChildConnectionAllocator;
.super Ljava/lang/Object;
.source "ChildProcessLauncher.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/chromium/content/browser/ChildProcessLauncher;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "ChildConnectionAllocator"
.end annotation


# static fields
.field static final synthetic $assertionsDisabled:Z


# instance fields
.field private mChildClass:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<+",
            "Lorg/chromium/content/app/ChildProcessService;",
            ">;"
        }
    .end annotation
.end field

.field private final mChildProcessConnections:[Lorg/chromium/content/browser/ChildProcessConnection;

.field private final mConnectionLock:Ljava/lang/Object;

.field private final mFreeConnectionIndices:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final mInSandbox:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 55
    const-class v0, Lorg/chromium/content/browser/ChildProcessLauncher;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Lorg/chromium/content/browser/ChildProcessLauncher$ChildConnectionAllocator;->$assertionsDisabled:Z

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public constructor <init>(Z)V
    .locals 4
    .param p1, "inSandbox"    # Z

    .prologue
    .line 73
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 68
    new-instance v2, Ljava/lang/Object;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    iput-object v2, p0, Lorg/chromium/content/browser/ChildProcessLauncher$ChildConnectionAllocator;->mConnectionLock:Ljava/lang/Object;

    .line 74
    if-eqz p1, :cond_0

    const/16 v1, 0x14

    .line 76
    .local v1, "numChildServices":I
    :goto_0
    new-array v2, v1, [Lorg/chromium/content/browser/ChildProcessConnectionImpl;

    iput-object v2, p0, Lorg/chromium/content/browser/ChildProcessLauncher$ChildConnectionAllocator;->mChildProcessConnections:[Lorg/chromium/content/browser/ChildProcessConnection;

    .line 77
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v2, p0, Lorg/chromium/content/browser/ChildProcessLauncher$ChildConnectionAllocator;->mFreeConnectionIndices:Ljava/util/ArrayList;

    .line 78
    const/4 v0, 0x0

    .local v0, "i":I
    :goto_1
    if-ge v0, v1, :cond_1

    .line 79
    iget-object v2, p0, Lorg/chromium/content/browser/ChildProcessLauncher$ChildConnectionAllocator;->mFreeConnectionIndices:Ljava/util/ArrayList;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 78
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 74
    .end local v0    # "i":I
    .end local v1    # "numChildServices":I
    :cond_0
    const/4 v1, 0x3

    goto :goto_0

    .line 81
    .restart local v0    # "i":I
    .restart local v1    # "numChildServices":I
    :cond_1
    if-eqz p1, :cond_2

    const-class v2, Lorg/chromium/content/app/SandboxedProcessService;

    :goto_2
    invoke-virtual {p0, v2}, Lorg/chromium/content/browser/ChildProcessLauncher$ChildConnectionAllocator;->setServiceClass(Ljava/lang/Class;)V

    .line 83
    iput-boolean p1, p0, Lorg/chromium/content/browser/ChildProcessLauncher$ChildConnectionAllocator;->mInSandbox:Z

    .line 84
    return-void

    .line 81
    :cond_2
    const-class v2, Lorg/chromium/content/app/PrivilegedProcessService;

    goto :goto_2
.end method


# virtual methods
.method public allocate(Landroid/content/Context;Lorg/chromium/content/browser/ChildProcessConnection$DeathCallback;Lorg/chromium/content/app/ChromiumLinkerParams;)Lorg/chromium/content/browser/ChildProcessConnection;
    .locals 9
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "deathCallback"    # Lorg/chromium/content/browser/ChildProcessConnection$DeathCallback;
    .param p3, "chromiumLinkerParams"    # Lorg/chromium/content/app/ChromiumLinkerParams;

    .prologue
    .line 93
    iget-object v7, p0, Lorg/chromium/content/browser/ChildProcessLauncher$ChildConnectionAllocator;->mConnectionLock:Ljava/lang/Object;

    monitor-enter v7

    .line 94
    :try_start_0
    iget-object v0, p0, Lorg/chromium/content/browser/ChildProcessLauncher$ChildConnectionAllocator;->mFreeConnectionIndices:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 95
    const-string v0, "ChildProcessLauncher"

    const-string v1, "Ran out of services to allocate."

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 96
    sget-boolean v0, Lorg/chromium/content/browser/ChildProcessLauncher$ChildConnectionAllocator;->$assertionsDisabled:Z

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 106
    :catchall_0
    move-exception v0

    monitor-exit v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 97
    :cond_0
    const/4 v0, 0x0

    :try_start_1
    monitor-exit v7

    .line 105
    :goto_0
    return-object v0

    .line 99
    :cond_1
    iget-object v0, p0, Lorg/chromium/content/browser/ChildProcessLauncher$ChildConnectionAllocator;->mFreeConnectionIndices:Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v2

    .line 100
    .local v2, "slot":I
    sget-boolean v0, Lorg/chromium/content/browser/ChildProcessLauncher$ChildConnectionAllocator;->$assertionsDisabled:Z

    if-nez v0, :cond_2

    iget-object v0, p0, Lorg/chromium/content/browser/ChildProcessLauncher$ChildConnectionAllocator;->mChildProcessConnections:[Lorg/chromium/content/browser/ChildProcessConnection;

    aget-object v0, v0, v2

    if-eqz v0, :cond_2

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 101
    :cond_2
    iget-object v8, p0, Lorg/chromium/content/browser/ChildProcessLauncher$ChildConnectionAllocator;->mChildProcessConnections:[Lorg/chromium/content/browser/ChildProcessConnection;

    new-instance v0, Lorg/chromium/content/browser/ChildProcessConnectionImpl;

    iget-boolean v3, p0, Lorg/chromium/content/browser/ChildProcessLauncher$ChildConnectionAllocator;->mInSandbox:Z

    iget-object v5, p0, Lorg/chromium/content/browser/ChildProcessLauncher$ChildConnectionAllocator;->mChildClass:Ljava/lang/Class;

    move-object v1, p1

    move-object v4, p2

    move-object v6, p3

    invoke-direct/range {v0 .. v6}, Lorg/chromium/content/browser/ChildProcessConnectionImpl;-><init>(Landroid/content/Context;IZLorg/chromium/content/browser/ChildProcessConnection$DeathCallback;Ljava/lang/Class;Lorg/chromium/content/app/ChromiumLinkerParams;)V

    aput-object v0, v8, v2

    .line 103
    const-string v0, "ChildProcessLauncher"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Allocator allocated a connection, sandbox: "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-boolean v3, p0, Lorg/chromium/content/browser/ChildProcessLauncher$ChildConnectionAllocator;->mInSandbox:Z

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v3, ", slot: "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 105
    iget-object v0, p0, Lorg/chromium/content/browser/ChildProcessLauncher$ChildConnectionAllocator;->mChildProcessConnections:[Lorg/chromium/content/browser/ChildProcessConnection;

    aget-object v0, v0, v2

    monitor-exit v7
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0
.end method

.method allocatedConnectionsCountForTesting()I
    .locals 2
    .annotation build Lorg/chromium/base/VisibleForTesting;
    .end annotation

    .prologue
    .line 131
    iget-object v0, p0, Lorg/chromium/content/browser/ChildProcessLauncher$ChildConnectionAllocator;->mChildProcessConnections:[Lorg/chromium/content/browser/ChildProcessConnection;

    array-length v0, v0

    iget-object v1, p0, Lorg/chromium/content/browser/ChildProcessLauncher$ChildConnectionAllocator;->mFreeConnectionIndices:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    sub-int/2addr v0, v1

    return v0
.end method

.method public free(Lorg/chromium/content/browser/ChildProcessConnection;)V
    .locals 6
    .param p1, "connection"    # Lorg/chromium/content/browser/ChildProcessConnection;

    .prologue
    .line 110
    iget-object v3, p0, Lorg/chromium/content/browser/ChildProcessLauncher$ChildConnectionAllocator;->mConnectionLock:Ljava/lang/Object;

    monitor-enter v3

    .line 111
    :try_start_0
    invoke-interface {p1}, Lorg/chromium/content/browser/ChildProcessConnection;->getServiceNumber()I

    move-result v1

    .line 112
    .local v1, "slot":I
    iget-object v2, p0, Lorg/chromium/content/browser/ChildProcessLauncher$ChildConnectionAllocator;->mChildProcessConnections:[Lorg/chromium/content/browser/ChildProcessConnection;

    aget-object v2, v2, v1

    if-eq v2, p1, :cond_1

    .line 113
    iget-object v2, p0, Lorg/chromium/content/browser/ChildProcessLauncher$ChildConnectionAllocator;->mChildProcessConnections:[Lorg/chromium/content/browser/ChildProcessConnection;

    aget-object v2, v2, v1

    if-nez v2, :cond_0

    const/4 v0, -0x1

    .line 115
    .local v0, "occupier":I
    :goto_0
    const-string v2, "ChildProcessLauncher"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Unable to find connection to free in slot: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, " already occupied by service: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 117
    sget-boolean v2, Lorg/chromium/content/browser/ChildProcessLauncher$ChildConnectionAllocator;->$assertionsDisabled:Z

    if-nez v2, :cond_3

    new-instance v2, Ljava/lang/AssertionError;

    invoke-direct {v2}, Ljava/lang/AssertionError;-><init>()V

    throw v2

    .line 125
    .end local v0    # "occupier":I
    .end local v1    # "slot":I
    :catchall_0
    move-exception v2

    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v2

    .line 113
    .restart local v1    # "slot":I
    :cond_0
    :try_start_1
    iget-object v2, p0, Lorg/chromium/content/browser/ChildProcessLauncher$ChildConnectionAllocator;->mChildProcessConnections:[Lorg/chromium/content/browser/ChildProcessConnection;

    aget-object v2, v2, v1

    invoke-interface {v2}, Lorg/chromium/content/browser/ChildProcessConnection;->getServiceNumber()I

    move-result v0

    goto :goto_0

    .line 119
    :cond_1
    iget-object v2, p0, Lorg/chromium/content/browser/ChildProcessLauncher$ChildConnectionAllocator;->mChildProcessConnections:[Lorg/chromium/content/browser/ChildProcessConnection;

    const/4 v4, 0x0

    aput-object v4, v2, v1

    .line 120
    sget-boolean v2, Lorg/chromium/content/browser/ChildProcessLauncher$ChildConnectionAllocator;->$assertionsDisabled:Z

    if-nez v2, :cond_2

    iget-object v2, p0, Lorg/chromium/content/browser/ChildProcessLauncher$ChildConnectionAllocator;->mFreeConnectionIndices:Ljava/util/ArrayList;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    new-instance v2, Ljava/lang/AssertionError;

    invoke-direct {v2}, Ljava/lang/AssertionError;-><init>()V

    throw v2

    .line 121
    :cond_2
    iget-object v2, p0, Lorg/chromium/content/browser/ChildProcessLauncher$ChildConnectionAllocator;->mFreeConnectionIndices:Ljava/util/ArrayList;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 122
    const-string v2, "ChildProcessLauncher"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Allocator freed a connection, sandbox: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    iget-boolean v5, p0, Lorg/chromium/content/browser/ChildProcessLauncher$ChildConnectionAllocator;->mInSandbox:Z

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, ", slot: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 125
    :cond_3
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 126
    return-void
.end method

.method public setServiceClass(Ljava/lang/Class;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<+",
            "Lorg/chromium/content/app/ChildProcessService;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 87
    .local p1, "childClass":Ljava/lang/Class;, "Ljava/lang/Class<+Lorg/chromium/content/app/ChildProcessService;>;"
    iput-object p1, p0, Lorg/chromium/content/browser/ChildProcessLauncher$ChildConnectionAllocator;->mChildClass:Ljava/lang/Class;

    .line 88
    return-void
.end method
