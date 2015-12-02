.class public Lcom/facebook/common/hardware/o;
.super Ljava/lang/Object;
.source "OrcaWakeLockManager.java"


# instance fields
.field final synthetic a:Lcom/facebook/common/hardware/n;

.field private final b:Landroid/os/PowerManager$WakeLock;

.field private final c:Ljava/lang/String;

.field private d:I

.field private e:J

.field private f:J

.field private g:I

.field private h:Z


# direct methods
.method constructor <init>(Lcom/facebook/common/hardware/n;Landroid/os/PowerManager$WakeLock;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 60
    iput-object p1, p0, Lcom/facebook/common/hardware/o;->a:Lcom/facebook/common/hardware/n;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 61
    iput-object p2, p0, Lcom/facebook/common/hardware/o;->b:Landroid/os/PowerManager$WakeLock;

    .line 62
    iput-object p3, p0, Lcom/facebook/common/hardware/o;->c:Ljava/lang/String;

    .line 63
    return-void
.end method


# virtual methods
.method public declared-synchronized a()V
    .locals 2

    .prologue
    .line 66
    monitor-enter p0

    const-wide/16 v0, -0x1

    :try_start_0
    invoke-virtual {p0, v0, v1}, Lcom/facebook/common/hardware/o;->a(J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 67
    monitor-exit p0

    return-void

    .line 66
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized a(J)V
    .locals 2

    .prologue
    .line 74
    monitor-enter p0

    :try_start_0
    invoke-virtual {p0}, Lcom/facebook/common/hardware/o;->c()V

    .line 75
    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-gez v0, :cond_1

    .line 76
    iget-object v0, p0, Lcom/facebook/common/hardware/o;->b:Landroid/os/PowerManager$WakeLock;

    invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->acquire()V

    .line 80
    :goto_0
    iget v0, p0, Lcom/facebook/common/hardware/o;->d:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/facebook/common/hardware/o;->d:I

    .line 81
    iget v0, p0, Lcom/facebook/common/hardware/o;->d:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 82
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/common/hardware/o;->e:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 84
    :cond_0
    monitor-exit p0

    return-void

    .line 78
    :cond_1
    :try_start_1
    iget-object v0, p0, Lcom/facebook/common/hardware/o;->b:Landroid/os/PowerManager$WakeLock;

    invoke-virtual {v0, p1, p2}, Landroid/os/PowerManager$WakeLock;->acquire(J)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 74
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized b()V
    .locals 6

    .prologue
    .line 87
    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/facebook/common/hardware/o;->h:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_1

    .line 100
    :cond_0
    :goto_0
    monitor-exit p0

    return-void

    .line 91
    :cond_1
    :try_start_1
    iget v0, p0, Lcom/facebook/common/hardware/o;->d:I

    if-nez v0, :cond_2

    .line 92
    iget v0, p0, Lcom/facebook/common/hardware/o;->g:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/facebook/common/hardware/o;->g:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 87
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 95
    :cond_2
    :try_start_2
    iget-object v0, p0, Lcom/facebook/common/hardware/o;->b:Landroid/os/PowerManager$WakeLock;

    invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->release()V

    .line 96
    iget v0, p0, Lcom/facebook/common/hardware/o;->d:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/facebook/common/hardware/o;->d:I

    .line 97
    iget v0, p0, Lcom/facebook/common/hardware/o;->d:I

    if-nez v0, :cond_0

    .line 98
    iget-wide v0, p0, Lcom/facebook/common/hardware/o;->f:J

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iget-wide v4, p0, Lcom/facebook/common/hardware/o;->e:J

    sub-long/2addr v2, v4

    add-long/2addr v0, v2

    iput-wide v0, p0, Lcom/facebook/common/hardware/o;->f:J
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0
.end method

.method public c()V
    .locals 2

    .prologue
    .line 117
    iget-boolean v0, p0, Lcom/facebook/common/hardware/o;->h:Z

    if-eqz v0, :cond_0

    .line 118
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Wake lock already disposed"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 120
    :cond_0
    return-void
.end method
