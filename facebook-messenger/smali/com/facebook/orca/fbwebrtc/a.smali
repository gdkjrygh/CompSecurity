.class public Lcom/facebook/orca/fbwebrtc/a;
.super Ljava/lang/Object;
.source "IncallWakeLocks.java"


# static fields
.field private static final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# instance fields
.field private final b:Z

.field private final c:Landroid/os/PowerManager;

.field private final d:Landroid/net/wifi/WifiManager;

.field private final e:Lcom/facebook/e/c;

.field private f:Landroid/os/PowerManager$WakeLock;

.field private g:Landroid/os/PowerManager$WakeLock;

.field private h:Landroid/net/wifi/WifiManager$WifiLock;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 18
    const-class v0, Lcom/facebook/orca/fbwebrtc/a;

    sput-object v0, Lcom/facebook/orca/fbwebrtc/a;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Landroid/os/PowerManager;Landroid/net/wifi/WifiManager;Lcom/facebook/e/c;)V
    .locals 1

    .prologue
    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    iput-object p1, p0, Lcom/facebook/orca/fbwebrtc/a;->c:Landroid/os/PowerManager;

    .line 35
    iput-object p2, p0, Lcom/facebook/orca/fbwebrtc/a;->d:Landroid/net/wifi/WifiManager;

    .line 36
    iput-object p3, p0, Lcom/facebook/orca/fbwebrtc/a;->e:Lcom/facebook/e/c;

    .line 38
    invoke-static {p1}, Lcom/facebook/orca/fbwebrtc/a;->a(Landroid/os/PowerManager;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/facebook/orca/fbwebrtc/a;->b:Z

    .line 39
    return-void
.end method

.method private static a(Landroid/os/PowerManager;)Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 44
    const/16 v1, 0x20

    :try_start_0
    sget-object v2, Lcom/facebook/orca/fbwebrtc/a;->a:Ljava/lang/Class;

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v1, v2}, Landroid/os/PowerManager;->newWakeLock(ILjava/lang/String;)Landroid/os/PowerManager$WakeLock;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    if-eqz v1, :cond_0

    const/4 v0, 0x1

    .line 46
    :cond_0
    :goto_0
    return v0

    .line 45
    :catch_0
    move-exception v1

    goto :goto_0
.end method


# virtual methods
.method public declared-synchronized a()V
    .locals 3

    .prologue
    .line 52
    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/facebook/orca/fbwebrtc/a;->b:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_1

    .line 64
    :cond_0
    :goto_0
    monitor-exit p0

    return-void

    .line 55
    :cond_1
    :try_start_1
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/a;->f:Landroid/os/PowerManager$WakeLock;

    if-nez v0, :cond_2

    .line 56
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/a;->c:Landroid/os/PowerManager;

    const/16 v1, 0x20

    sget-object v2, Lcom/facebook/orca/fbwebrtc/a;->a:Ljava/lang/Class;

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/os/PowerManager;->newWakeLock(ILjava/lang/String;)Landroid/os/PowerManager$WakeLock;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/fbwebrtc/a;->f:Landroid/os/PowerManager$WakeLock;

    .line 58
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/a;->f:Landroid/os/PowerManager$WakeLock;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/PowerManager$WakeLock;->setReferenceCounted(Z)V

    .line 61
    :cond_2
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/a;->f:Landroid/os/PowerManager$WakeLock;

    invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->isHeld()Z

    move-result v0

    if-nez v0, :cond_0

    .line 62
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/a;->f:Landroid/os/PowerManager$WakeLock;

    invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->acquire()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 52
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized b()V
    .locals 1

    .prologue
    .line 68
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/a;->f:Landroid/os/PowerManager$WakeLock;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/a;->f:Landroid/os/PowerManager$WakeLock;

    invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->isHeld()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 69
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/a;->f:Landroid/os/PowerManager$WakeLock;

    invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->release()V

    .line 71
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/orca/fbwebrtc/a;->f:Landroid/os/PowerManager$WakeLock;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 72
    monitor-exit p0

    return-void

    .line 68
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized c()V
    .locals 3

    .prologue
    .line 76
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/a;->g:Landroid/os/PowerManager$WakeLock;

    if-nez v0, :cond_0

    .line 77
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/a;->c:Landroid/os/PowerManager;

    const/4 v1, 0x1

    sget-object v2, Lcom/facebook/orca/fbwebrtc/a;->a:Ljava/lang/Class;

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/os/PowerManager;->newWakeLock(ILjava/lang/String;)Landroid/os/PowerManager$WakeLock;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/fbwebrtc/a;->g:Landroid/os/PowerManager$WakeLock;

    .line 79
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/a;->g:Landroid/os/PowerManager$WakeLock;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/PowerManager$WakeLock;->setReferenceCounted(Z)V

    .line 82
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/a;->g:Landroid/os/PowerManager$WakeLock;

    invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->isHeld()Z

    move-result v0

    if-nez v0, :cond_1

    .line 83
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/a;->g:Landroid/os/PowerManager$WakeLock;

    invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->acquire()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 85
    :cond_1
    monitor-exit p0

    return-void

    .line 76
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized d()V
    .locals 1

    .prologue
    .line 89
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/a;->g:Landroid/os/PowerManager$WakeLock;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/a;->g:Landroid/os/PowerManager$WakeLock;

    invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->isHeld()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 90
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/a;->g:Landroid/os/PowerManager$WakeLock;

    invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->release()V

    .line 92
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/orca/fbwebrtc/a;->g:Landroid/os/PowerManager$WakeLock;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 93
    monitor-exit p0

    return-void

    .line 89
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized e()V
    .locals 3

    .prologue
    .line 97
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/a;->e:Lcom/facebook/e/c;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/facebook/e/c;->a(Z)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-nez v0, :cond_1

    .line 109
    :cond_0
    :goto_0
    monitor-exit p0

    return-void

    .line 100
    :cond_1
    :try_start_1
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/a;->h:Landroid/net/wifi/WifiManager$WifiLock;

    if-nez v0, :cond_2

    .line 101
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/a;->d:Landroid/net/wifi/WifiManager;

    const/4 v1, 0x3

    sget-object v2, Lcom/facebook/orca/fbwebrtc/a;->a:Ljava/lang/Class;

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/net/wifi/WifiManager;->createWifiLock(ILjava/lang/String;)Landroid/net/wifi/WifiManager$WifiLock;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/fbwebrtc/a;->h:Landroid/net/wifi/WifiManager$WifiLock;

    .line 103
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/a;->h:Landroid/net/wifi/WifiManager$WifiLock;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/net/wifi/WifiManager$WifiLock;->setReferenceCounted(Z)V

    .line 106
    :cond_2
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/a;->h:Landroid/net/wifi/WifiManager$WifiLock;

    invoke-virtual {v0}, Landroid/net/wifi/WifiManager$WifiLock;->isHeld()Z

    move-result v0

    if-nez v0, :cond_0

    .line 107
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/a;->h:Landroid/net/wifi/WifiManager$WifiLock;

    invoke-virtual {v0}, Landroid/net/wifi/WifiManager$WifiLock;->acquire()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 97
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized f()V
    .locals 1

    .prologue
    .line 113
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/a;->h:Landroid/net/wifi/WifiManager$WifiLock;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/a;->h:Landroid/net/wifi/WifiManager$WifiLock;

    invoke-virtual {v0}, Landroid/net/wifi/WifiManager$WifiLock;->isHeld()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 114
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/a;->h:Landroid/net/wifi/WifiManager$WifiLock;

    invoke-virtual {v0}, Landroid/net/wifi/WifiManager$WifiLock;->release()V

    .line 116
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/orca/fbwebrtc/a;->h:Landroid/net/wifi/WifiManager$WifiLock;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 117
    monitor-exit p0

    return-void

    .line 113
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
