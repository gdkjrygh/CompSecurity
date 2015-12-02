.class public Lcom/facebook/common/hardware/n;
.super Ljava/lang/Object;
.source "OrcaWakeLockManager.java"


# instance fields
.field private final a:Landroid/os/PowerManager;

.field private final b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Lcom/facebook/common/hardware/o;",
            "Lcom/facebook/common/hardware/o;",
            ">;"
        }
    .end annotation
.end field

.field private c:J


# direct methods
.method public constructor <init>(Landroid/os/PowerManager;)V
    .locals 2

    .prologue
    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    invoke-static {}, Lcom/google/common/a/ik;->c()Ljava/util/concurrent/ConcurrentMap;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/common/hardware/n;->b:Ljava/util/Map;

    .line 21
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/facebook/common/hardware/n;->c:J

    .line 25
    iput-object p1, p0, Lcom/facebook/common/hardware/n;->a:Landroid/os/PowerManager;

    .line 26
    return-void
.end method


# virtual methods
.method public declared-synchronized a(ILjava/lang/String;)Lcom/facebook/common/hardware/o;
    .locals 2

    .prologue
    .line 29
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/common/hardware/n;->a:Landroid/os/PowerManager;

    invoke-virtual {v0, p1, p2}, Landroid/os/PowerManager;->newWakeLock(ILjava/lang/String;)Landroid/os/PowerManager$WakeLock;

    move-result-object v0

    .line 30
    new-instance v1, Lcom/facebook/common/hardware/o;

    invoke-direct {v1, p0, v0, p2}, Lcom/facebook/common/hardware/o;-><init>(Lcom/facebook/common/hardware/n;Landroid/os/PowerManager$WakeLock;Ljava/lang/String;)V

    .line 31
    iget-object v0, p0, Lcom/facebook/common/hardware/n;->b:Ljava/util/Map;

    invoke-interface {v0, v1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    monitor-exit p0

    return-object v1

    .line 29
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
