.class Lorg/chromium/content/browser/BindingManagerImpl;
.super Ljava/lang/Object;
.source "BindingManagerImpl.java"

# interfaces
.implements Lorg/chromium/content/browser/BindingManager;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/chromium/content/browser/BindingManagerImpl$ManagedConnection;
    }
.end annotation


# static fields
.field static final synthetic $assertionsDisabled:Z

.field private static final DETACH_AS_ACTIVE_HIGH_END_DELAY_MILLIS:J = 0x3e8L

.field private static final REMOVE_INITIAL_BINDING_DELAY_MILLIS:J = 0x3e8L

.field private static final TAG:Ljava/lang/String; = "BindingManager"


# instance fields
.field private mBoundForBackgroundPeriod:Lorg/chromium/content/browser/BindingManagerImpl$ManagedConnection;

.field private final mIsLowMemoryDevice:Z

.field private mLastInForeground:Lorg/chromium/content/browser/BindingManagerImpl$ManagedConnection;

.field private final mLastInForegroundLock:Ljava/lang/Object;

.field private final mManagedConnections:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray",
            "<",
            "Lorg/chromium/content/browser/BindingManagerImpl$ManagedConnection;",
            ">;"
        }
    .end annotation
.end field

.field private final mRemoveInitialBindingDelay:J

.field private final mRemoveStrongBindingDelay:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 17
    const-class v0, Lorg/chromium/content/browser/BindingManagerImpl;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Lorg/chromium/content/browser/BindingManagerImpl;->$assertionsDisabled:Z

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private constructor <init>(ZJJ)V
    .locals 2
    .param p1, "isLowMemoryDevice"    # Z
    .param p2, "removeInitialBindingDelay"    # J
    .param p4, "removeStrongBindingDelay"    # J

    .prologue
    .line 189
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 168
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Lorg/chromium/content/browser/BindingManagerImpl;->mManagedConnections:Landroid/util/SparseArray;

    .line 179
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lorg/chromium/content/browser/BindingManagerImpl;->mLastInForegroundLock:Ljava/lang/Object;

    .line 190
    iput-boolean p1, p0, Lorg/chromium/content/browser/BindingManagerImpl;->mIsLowMemoryDevice:Z

    .line 191
    iput-wide p2, p0, Lorg/chromium/content/browser/BindingManagerImpl;->mRemoveInitialBindingDelay:J

    .line 192
    iput-wide p4, p0, Lorg/chromium/content/browser/BindingManagerImpl;->mRemoveStrongBindingDelay:J

    .line 193
    return-void
.end method

.method static synthetic access$000(Lorg/chromium/content/browser/BindingManagerImpl;)J
    .locals 2
    .param p0, "x0"    # Lorg/chromium/content/browser/BindingManagerImpl;

    .prologue
    .line 17
    iget-wide v0, p0, Lorg/chromium/content/browser/BindingManagerImpl;->mRemoveInitialBindingDelay:J

    return-wide v0
.end method

.method static synthetic access$100(Lorg/chromium/content/browser/BindingManagerImpl;)Z
    .locals 1
    .param p0, "x0"    # Lorg/chromium/content/browser/BindingManagerImpl;

    .prologue
    .line 17
    iget-boolean v0, p0, Lorg/chromium/content/browser/BindingManagerImpl;->mIsLowMemoryDevice:Z

    return v0
.end method

.method static synthetic access$200(Lorg/chromium/content/browser/BindingManagerImpl;)J
    .locals 2
    .param p0, "x0"    # Lorg/chromium/content/browser/BindingManagerImpl;

    .prologue
    .line 17
    iget-wide v0, p0, Lorg/chromium/content/browser/BindingManagerImpl;->mRemoveStrongBindingDelay:J

    return-wide v0
.end method

.method public static createBindingManager()Lorg/chromium/content/browser/BindingManagerImpl;
    .locals 6

    .prologue
    const-wide/16 v2, 0x3e8

    .line 196
    new-instance v0, Lorg/chromium/content/browser/BindingManagerImpl;

    invoke-static {}, Lorg/chromium/base/SysUtils;->isLowEndDevice()Z

    move-result v1

    move-wide v4, v2

    invoke-direct/range {v0 .. v5}, Lorg/chromium/content/browser/BindingManagerImpl;-><init>(ZJJ)V

    return-object v0
.end method

.method public static createBindingManagerForTesting(Z)Lorg/chromium/content/browser/BindingManagerImpl;
    .locals 6
    .param p0, "isLowEndDevice"    # Z

    .prologue
    const-wide/16 v2, 0x0

    .line 206
    new-instance v0, Lorg/chromium/content/browser/BindingManagerImpl;

    move v1, p0

    move-wide v4, v2

    invoke-direct/range {v0 .. v5}, Lorg/chromium/content/browser/BindingManagerImpl;-><init>(ZJJ)V

    return-object v0
.end method


# virtual methods
.method public addNewConnection(ILorg/chromium/content/browser/ChildProcessConnection;)V
    .locals 3
    .param p1, "pid"    # I
    .param p2, "connection"    # Lorg/chromium/content/browser/ChildProcessConnection;

    .prologue
    .line 211
    iget-object v1, p0, Lorg/chromium/content/browser/BindingManagerImpl;->mLastInForegroundLock:Ljava/lang/Object;

    monitor-enter v1

    .line 212
    :try_start_0
    iget-boolean v0, p0, Lorg/chromium/content/browser/BindingManagerImpl;->mIsLowMemoryDevice:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/chromium/content/browser/BindingManagerImpl;->mLastInForeground:Lorg/chromium/content/browser/BindingManagerImpl$ManagedConnection;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/chromium/content/browser/BindingManagerImpl;->mLastInForeground:Lorg/chromium/content/browser/BindingManagerImpl$ManagedConnection;

    # invokes: Lorg/chromium/content/browser/BindingManagerImpl$ManagedConnection;->dropBindings()V
    invoke-static {v0}, Lorg/chromium/content/browser/BindingManagerImpl$ManagedConnection;->access$300(Lorg/chromium/content/browser/BindingManagerImpl$ManagedConnection;)V

    .line 213
    :cond_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 217
    iget-object v1, p0, Lorg/chromium/content/browser/BindingManagerImpl;->mManagedConnections:Landroid/util/SparseArray;

    monitor-enter v1

    .line 218
    :try_start_1
    iget-object v0, p0, Lorg/chromium/content/browser/BindingManagerImpl;->mManagedConnections:Landroid/util/SparseArray;

    new-instance v2, Lorg/chromium/content/browser/BindingManagerImpl$ManagedConnection;

    invoke-direct {v2, p0, p2}, Lorg/chromium/content/browser/BindingManagerImpl$ManagedConnection;-><init>(Lorg/chromium/content/browser/BindingManagerImpl;Lorg/chromium/content/browser/ChildProcessConnection;)V

    invoke-virtual {v0, p1, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 219
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 220
    return-void

    .line 213
    :catchall_0
    move-exception v0

    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    .line 219
    :catchall_1
    move-exception v0

    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw v0
.end method

.method public clearConnection(I)V
    .locals 3
    .param p1, "pid"    # I

    .prologue
    .line 277
    iget-object v2, p0, Lorg/chromium/content/browser/BindingManagerImpl;->mManagedConnections:Landroid/util/SparseArray;

    monitor-enter v2

    .line 278
    :try_start_0
    iget-object v1, p0, Lorg/chromium/content/browser/BindingManagerImpl;->mManagedConnections:Landroid/util/SparseArray;

    invoke-virtual {v1, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/chromium/content/browser/BindingManagerImpl$ManagedConnection;

    .line 279
    .local v0, "managedConnection":Lorg/chromium/content/browser/BindingManagerImpl$ManagedConnection;
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 280
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lorg/chromium/content/browser/BindingManagerImpl$ManagedConnection;->clearConnection()V

    .line 281
    :cond_0
    return-void

    .line 279
    .end local v0    # "managedConnection":Lorg/chromium/content/browser/BindingManagerImpl$ManagedConnection;
    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public isConnectionCleared(I)Z
    .locals 2
    .param p1, "pid"    # I
    .annotation build Lorg/chromium/base/VisibleForTesting;
    .end annotation

    .prologue
    .line 286
    iget-object v1, p0, Lorg/chromium/content/browser/BindingManagerImpl;->mManagedConnections:Landroid/util/SparseArray;

    monitor-enter v1

    .line 287
    :try_start_0
    iget-object v0, p0, Lorg/chromium/content/browser/BindingManagerImpl;->mManagedConnections:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/chromium/content/browser/BindingManagerImpl$ManagedConnection;

    invoke-virtual {v0}, Lorg/chromium/content/browser/BindingManagerImpl$ManagedConnection;->isConnectionCleared()Z

    move-result v0

    monitor-exit v1

    return v0

    .line 288
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public isOomProtected(I)Z
    .locals 3
    .param p1, "pid"    # I

    .prologue
    .line 268
    iget-object v2, p0, Lorg/chromium/content/browser/BindingManagerImpl;->mManagedConnections:Landroid/util/SparseArray;

    monitor-enter v2

    .line 269
    :try_start_0
    iget-object v1, p0, Lorg/chromium/content/browser/BindingManagerImpl;->mManagedConnections:Landroid/util/SparseArray;

    invoke-virtual {v1, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/chromium/content/browser/BindingManagerImpl$ManagedConnection;

    .line 270
    .local v0, "managedConnection":Lorg/chromium/content/browser/BindingManagerImpl$ManagedConnection;
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 271
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lorg/chromium/content/browser/BindingManagerImpl$ManagedConnection;->isOomProtected()Z

    move-result v1

    :goto_0
    return v1

    .line 270
    .end local v0    # "managedConnection":Lorg/chromium/content/browser/BindingManagerImpl$ManagedConnection;
    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1

    .line 271
    .restart local v0    # "managedConnection":Lorg/chromium/content/browser/BindingManagerImpl$ManagedConnection;
    :cond_0
    const/4 v1, 0x0

    goto :goto_0
.end method

.method public onBroughtToForeground()V
    .locals 2

    .prologue
    .line 256
    iget-object v0, p0, Lorg/chromium/content/browser/BindingManagerImpl;->mBoundForBackgroundPeriod:Lorg/chromium/content/browser/BindingManagerImpl$ManagedConnection;

    if-eqz v0, :cond_0

    .line 257
    iget-object v0, p0, Lorg/chromium/content/browser/BindingManagerImpl;->mBoundForBackgroundPeriod:Lorg/chromium/content/browser/BindingManagerImpl$ManagedConnection;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lorg/chromium/content/browser/BindingManagerImpl$ManagedConnection;->setBoundForBackgroundPeriod(Z)V

    .line 258
    const/4 v0, 0x0

    iput-object v0, p0, Lorg/chromium/content/browser/BindingManagerImpl;->mBoundForBackgroundPeriod:Lorg/chromium/content/browser/BindingManagerImpl$ManagedConnection;

    .line 260
    :cond_0
    return-void
.end method

.method public onSentToBackground()V
    .locals 3

    .prologue
    .line 243
    sget-boolean v0, Lorg/chromium/content/browser/BindingManagerImpl;->$assertionsDisabled:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lorg/chromium/content/browser/BindingManagerImpl;->mBoundForBackgroundPeriod:Lorg/chromium/content/browser/BindingManagerImpl$ManagedConnection;

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 244
    :cond_0
    iget-object v1, p0, Lorg/chromium/content/browser/BindingManagerImpl;->mLastInForegroundLock:Ljava/lang/Object;

    monitor-enter v1

    .line 247
    :try_start_0
    iget-object v0, p0, Lorg/chromium/content/browser/BindingManagerImpl;->mLastInForeground:Lorg/chromium/content/browser/BindingManagerImpl$ManagedConnection;

    if-eqz v0, :cond_1

    .line 248
    iget-object v0, p0, Lorg/chromium/content/browser/BindingManagerImpl;->mLastInForeground:Lorg/chromium/content/browser/BindingManagerImpl$ManagedConnection;

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Lorg/chromium/content/browser/BindingManagerImpl$ManagedConnection;->setBoundForBackgroundPeriod(Z)V

    .line 249
    iget-object v0, p0, Lorg/chromium/content/browser/BindingManagerImpl;->mLastInForeground:Lorg/chromium/content/browser/BindingManagerImpl$ManagedConnection;

    iput-object v0, p0, Lorg/chromium/content/browser/BindingManagerImpl;->mBoundForBackgroundPeriod:Lorg/chromium/content/browser/BindingManagerImpl$ManagedConnection;

    .line 251
    :cond_1
    monitor-exit v1

    .line 252
    return-void

    .line 251
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public setInForeground(IZ)V
    .locals 4
    .param p1, "pid"    # I
    .param p2, "inForeground"    # Z

    .prologue
    .line 225
    iget-object v2, p0, Lorg/chromium/content/browser/BindingManagerImpl;->mManagedConnections:Landroid/util/SparseArray;

    monitor-enter v2

    .line 226
    :try_start_0
    iget-object v1, p0, Lorg/chromium/content/browser/BindingManagerImpl;->mManagedConnections:Landroid/util/SparseArray;

    invoke-virtual {v1, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/chromium/content/browser/BindingManagerImpl$ManagedConnection;

    .line 227
    .local v0, "managedConnection":Lorg/chromium/content/browser/BindingManagerImpl$ManagedConnection;
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 229
    if-nez v0, :cond_0

    .line 230
    const-string v1, "BindingManager"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Cannot setInForeground() - never saw a connection for the pid: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 239
    :goto_0
    return-void

    .line 227
    .end local v0    # "managedConnection":Lorg/chromium/content/browser/BindingManagerImpl$ManagedConnection;
    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1

    .line 235
    .restart local v0    # "managedConnection":Lorg/chromium/content/browser/BindingManagerImpl$ManagedConnection;
    :cond_0
    iget-object v2, p0, Lorg/chromium/content/browser/BindingManagerImpl;->mLastInForegroundLock:Ljava/lang/Object;

    monitor-enter v2

    .line 236
    :try_start_2
    invoke-virtual {v0, p2}, Lorg/chromium/content/browser/BindingManagerImpl$ManagedConnection;->setInForeground(Z)V

    .line 237
    if-eqz p2, :cond_1

    iput-object v0, p0, Lorg/chromium/content/browser/BindingManagerImpl;->mLastInForeground:Lorg/chromium/content/browser/BindingManagerImpl$ManagedConnection;

    .line 238
    :cond_1
    monitor-exit v2

    goto :goto_0

    :catchall_1
    move-exception v1

    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw v1
.end method
