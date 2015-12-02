.class public Lcom/facebook/push/mqtt/bx;
.super Ljava/lang/Object;
.source "MqttPushServiceClientManager.java"


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
.field private final b:Landroid/content/Context;

.field private final c:Lcom/facebook/common/executors/a;

.field private final d:Lcom/facebook/common/time/a;

.field private final e:Lcom/facebook/push/mqtt/bz;

.field private f:J

.field private g:Lcom/facebook/push/mqtt/j;
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation
.end field

.field private h:Z
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation
.end field

.field private i:Z
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation
.end field

.field private j:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/facebook/push/mqtt/bw;",
            ">;"
        }
    .end annotation

    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 30
    const-class v0, Lcom/facebook/push/mqtt/bx;

    sput-object v0, Lcom/facebook/push/mqtt/bx;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/facebook/common/executors/a;Lcom/facebook/common/time/a;)V
    .locals 2

    .prologue
    .line 75
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 54
    const-wide/16 v0, 0x2710

    iput-wide v0, p0, Lcom/facebook/push/mqtt/bx;->f:J

    .line 69
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/push/mqtt/bx;->j:Ljava/util/List;

    .line 76
    iput-object p1, p0, Lcom/facebook/push/mqtt/bx;->b:Landroid/content/Context;

    .line 77
    iput-object p2, p0, Lcom/facebook/push/mqtt/bx;->c:Lcom/facebook/common/executors/a;

    .line 78
    iput-object p3, p0, Lcom/facebook/push/mqtt/bx;->d:Lcom/facebook/common/time/a;

    .line 79
    new-instance v0, Lcom/facebook/push/mqtt/bz;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/facebook/push/mqtt/bz;-><init>(Lcom/facebook/push/mqtt/bx;Lcom/facebook/push/mqtt/by;)V

    iput-object v0, p0, Lcom/facebook/push/mqtt/bx;->e:Lcom/facebook/push/mqtt/bz;

    .line 80
    return-void
.end method

.method private declared-synchronized a(Landroid/os/IBinder;)V
    .locals 3

    .prologue
    .line 179
    monitor-enter p0

    :try_start_0
    invoke-static {p1}, Lcom/facebook/push/mqtt/k;->a(Landroid/os/IBinder;)Lcom/facebook/push/mqtt/j;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/push/mqtt/bx;->g:Lcom/facebook/push/mqtt/j;

    .line 180
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/push/mqtt/bx;->i:Z

    .line 181
    iget-object v0, p0, Lcom/facebook/push/mqtt/bx;->j:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/push/mqtt/bw;

    .line 182
    iget-object v2, p0, Lcom/facebook/push/mqtt/bx;->g:Lcom/facebook/push/mqtt/j;

    invoke-virtual {v0, v2}, Lcom/facebook/push/mqtt/bw;->a(Lcom/facebook/push/mqtt/j;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 179
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 184
    :cond_0
    :try_start_1
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 185
    monitor-exit p0

    return-void
.end method

.method static synthetic a(Lcom/facebook/push/mqtt/bx;)V
    .locals 0

    .prologue
    .line 28
    invoke-direct {p0}, Lcom/facebook/push/mqtt/bx;->d()V

    return-void
.end method

.method static synthetic a(Lcom/facebook/push/mqtt/bx;Landroid/os/IBinder;)V
    .locals 0

    .prologue
    .line 28
    invoke-direct {p0, p1}, Lcom/facebook/push/mqtt/bx;->a(Landroid/os/IBinder;)V

    return-void
.end method

.method private declared-synchronized b()V
    .locals 6

    .prologue
    .line 115
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/push/mqtt/bx;->c:Lcom/facebook/common/executors/a;

    invoke-interface {v0}, Lcom/facebook/common/executors/a;->b()V

    .line 116
    iget-boolean v0, p0, Lcom/facebook/push/mqtt/bx;->h:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz v0, :cond_0

    .line 149
    :goto_0
    monitor-exit p0

    return-void

    .line 120
    :cond_0
    :try_start_1
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/facebook/push/mqtt/bx;->b:Landroid/content/Context;

    const-class v2, Lcom/facebook/push/mqtt/MqttPushService;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 121
    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/facebook/push/mqtt/bx;->i:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 123
    :try_start_2
    iget-object v1, p0, Lcom/facebook/push/mqtt/bx;->b:Landroid/content/Context;

    iget-object v2, p0, Lcom/facebook/push/mqtt/bx;->e:Lcom/facebook/push/mqtt/bz;

    const/4 v3, 0x1

    invoke-virtual {v1, v0, v2, v3}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    move-result v0

    .line 128
    if-nez v0, :cond_1

    .line 129
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Failed to bind to service"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 147
    :catchall_0
    move-exception v0

    const/4 v1, 0x0

    :try_start_3
    iput-boolean v1, p0, Lcom/facebook/push/mqtt/bx;->i:Z

    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 115
    :catchall_1
    move-exception v0

    monitor-exit p0

    throw v0

    .line 131
    :cond_1
    const/4 v0, 0x1

    :try_start_4
    iput-boolean v0, p0, Lcom/facebook/push/mqtt/bx;->h:Z

    .line 134
    iget-object v0, p0, Lcom/facebook/push/mqtt/bx;->d:Lcom/facebook/common/time/a;

    invoke-interface {v0}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/facebook/push/mqtt/bx;->f:J

    add-long/2addr v2, v0

    .line 135
    iget-object v0, p0, Lcom/facebook/push/mqtt/bx;->d:Lcom/facebook/common/time/a;

    invoke-interface {v0}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v0

    sub-long v0, v2, v0

    .line 136
    :goto_1
    iget-boolean v4, p0, Lcom/facebook/push/mqtt/bx;->i:Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    if-eqz v4, :cond_2

    const-wide/16 v4, 0x0

    cmp-long v4, v0, v4

    if-lez v4, :cond_2

    .line 138
    :try_start_5
    invoke-virtual {p0, v0, v1}, Ljava/lang/Object;->wait(J)V

    .line 139
    iget-object v0, p0, Lcom/facebook/push/mqtt/bx;->d:Lcom/facebook/common/time/a;

    invoke-interface {v0}, Lcom/facebook/common/time/a;->a()J
    :try_end_5
    .catch Ljava/lang/InterruptedException; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    move-result-wide v0

    sub-long v0, v2, v0

    goto :goto_1

    .line 140
    :catch_0
    move-exception v0

    .line 142
    :try_start_6
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V

    .line 143
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 147
    :cond_2
    const/4 v0, 0x0

    :try_start_7
    iput-boolean v0, p0, Lcom/facebook/push/mqtt/bx;->i:Z
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    goto :goto_0
.end method

.method private declared-synchronized c()V
    .locals 3

    .prologue
    .line 155
    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/facebook/push/mqtt/bx;->h:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    .line 157
    :try_start_1
    iget-object v0, p0, Lcom/facebook/push/mqtt/bx;->b:Landroid/content/Context;

    iget-object v1, p0, Lcom/facebook/push/mqtt/bx;->e:Lcom/facebook/push/mqtt/bz;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 164
    :goto_0
    const/4 v0, 0x0

    :try_start_2
    iput-boolean v0, p0, Lcom/facebook/push/mqtt/bx;->h:Z

    .line 165
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/push/mqtt/bx;->g:Lcom/facebook/push/mqtt/j;

    .line 168
    :cond_0
    iget-object v0, p0, Lcom/facebook/push/mqtt/bx;->j:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/push/mqtt/bw;

    .line 169
    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Lcom/facebook/push/mqtt/bw;->a(Lcom/facebook/push/mqtt/j;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_1

    .line 155
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 158
    :catch_0
    move-exception v0

    .line 162
    :try_start_3
    sget-object v1, Lcom/facebook/push/mqtt/bx;->a:Ljava/lang/Class;

    const-string v2, "Exception unbinding"

    invoke-static {v1, v2, v0}, Lcom/facebook/debug/log/b;->e(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_0

    .line 171
    :cond_1
    monitor-exit p0

    return-void
.end method

.method private declared-synchronized d()V
    .locals 3

    .prologue
    .line 191
    monitor-enter p0

    const/4 v0, 0x0

    :try_start_0
    iput-object v0, p0, Lcom/facebook/push/mqtt/bx;->g:Lcom/facebook/push/mqtt/j;

    .line 192
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/push/mqtt/bx;->i:Z

    .line 193
    iget-object v0, p0, Lcom/facebook/push/mqtt/bx;->j:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/push/mqtt/bw;

    .line 194
    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Lcom/facebook/push/mqtt/bw;->a(Lcom/facebook/push/mqtt/j;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 191
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 196
    :cond_0
    :try_start_1
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 197
    monitor-exit p0

    return-void
.end method


# virtual methods
.method public declared-synchronized a()Lcom/facebook/push/mqtt/bw;
    .locals 2

    .prologue
    .line 91
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/push/mqtt/bx;->c:Lcom/facebook/common/executors/a;

    invoke-interface {v0}, Lcom/facebook/common/executors/a;->b()V

    .line 92
    invoke-direct {p0}, Lcom/facebook/push/mqtt/bx;->b()V

    .line 93
    new-instance v0, Lcom/facebook/push/mqtt/bw;

    invoke-direct {v0, p0}, Lcom/facebook/push/mqtt/bw;-><init>(Lcom/facebook/push/mqtt/bx;)V

    .line 94
    iget-object v1, p0, Lcom/facebook/push/mqtt/bx;->g:Lcom/facebook/push/mqtt/j;

    invoke-virtual {v0, v1}, Lcom/facebook/push/mqtt/bw;->a(Lcom/facebook/push/mqtt/j;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 95
    monitor-exit p0

    return-object v0

    .line 91
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method declared-synchronized a(Lcom/facebook/push/mqtt/bw;)V
    .locals 1

    .prologue
    .line 104
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/push/mqtt/bx;->c:Lcom/facebook/common/executors/a;

    invoke-interface {v0}, Lcom/facebook/common/executors/a;->b()V

    .line 105
    iget-object v0, p0, Lcom/facebook/push/mqtt/bx;->j:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 106
    iget-object v0, p0, Lcom/facebook/push/mqtt/bx;->j:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 107
    invoke-direct {p0}, Lcom/facebook/push/mqtt/bx;->c()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 109
    :cond_0
    monitor-exit p0

    return-void

    .line 104
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
