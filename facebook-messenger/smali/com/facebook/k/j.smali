.class public Lcom/facebook/k/j;
.super Ljava/lang/Object;
.source "RadioPowerManager.java"


# annotations
.annotation build Ljavax/annotation/concurrent/ThreadSafe;
.end annotation


# instance fields
.field private final a:Landroid/support/v4/a/e;

.field private final b:Lcom/facebook/common/hardware/f;

.field private final c:Ljava/util/concurrent/ScheduledExecutorService;

.field private final d:Lcom/facebook/common/hardware/k;

.field private final e:Lcom/facebook/common/time/a;

.field private f:Lcom/facebook/base/broadcast/j;

.field private g:Lcom/facebook/base/broadcast/l;

.field private final h:Ljava/util/PriorityQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/PriorityQueue",
            "<",
            "Lcom/facebook/k/n;",
            ">;"
        }
    .end annotation
.end field

.field private final i:Lcom/facebook/common/hardware/h;

.field private j:Ljava/util/concurrent/ScheduledFuture;


# direct methods
.method public constructor <init>(Landroid/support/v4/a/e;Lcom/facebook/common/hardware/f;Ljava/util/concurrent/ScheduledExecutorService;Lcom/facebook/common/hardware/k;Lcom/facebook/base/broadcast/j;Lcom/facebook/common/time/a;)V
    .locals 4
    .param p5    # Lcom/facebook/base/broadcast/j;
        .annotation runtime Lcom/facebook/base/broadcast/CrossFbAppBroadcast;
        .end annotation
    .end param

    .prologue
    .line 70
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 49
    new-instance v0, Ljava/util/PriorityQueue;

    invoke-direct {v0}, Ljava/util/PriorityQueue;-><init>()V

    iput-object v0, p0, Lcom/facebook/k/j;->h:Ljava/util/PriorityQueue;

    .line 72
    iput-object p1, p0, Lcom/facebook/k/j;->a:Landroid/support/v4/a/e;

    .line 73
    iput-object p2, p0, Lcom/facebook/k/j;->b:Lcom/facebook/common/hardware/f;

    .line 74
    iput-object p3, p0, Lcom/facebook/k/j;->c:Ljava/util/concurrent/ScheduledExecutorService;

    .line 75
    iput-object p4, p0, Lcom/facebook/k/j;->d:Lcom/facebook/common/hardware/k;

    .line 76
    iput-object p5, p0, Lcom/facebook/k/j;->f:Lcom/facebook/base/broadcast/j;

    .line 77
    iput-object p6, p0, Lcom/facebook/k/j;->e:Lcom/facebook/common/time/a;

    .line 81
    new-instance v0, Lcom/facebook/k/k;

    invoke-direct {v0, p0}, Lcom/facebook/k/k;-><init>(Lcom/facebook/k/j;)V

    iput-object v0, p0, Lcom/facebook/k/j;->i:Lcom/facebook/common/hardware/h;

    .line 91
    iget-object v0, p0, Lcom/facebook/k/j;->a:Landroid/support/v4/a/e;

    new-instance v1, Lcom/facebook/k/l;

    invoke-direct {v1, p0}, Lcom/facebook/k/l;-><init>(Lcom/facebook/k/j;)V

    new-instance v2, Landroid/content/IntentFilter;

    const-string v3, "com.facebook.orca.ACTION_NETWORK_CONNECTIVITY_CHANGED"

    invoke-direct {v2, v3}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1, v2}, Landroid/support/v4/a/e;->a(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    .line 95
    return-void
.end method

.method private a()V
    .locals 2

    .prologue
    .line 172
    iget-object v0, p0, Lcom/facebook/k/j;->j:Ljava/util/concurrent/ScheduledFuture;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/k/j;->j:Ljava/util/concurrent/ScheduledFuture;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/concurrent/ScheduledFuture;->cancel(Z)Z

    .line 173
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/k/j;->j:Ljava/util/concurrent/ScheduledFuture;

    .line 174
    return-void
.end method

.method static synthetic a(Lcom/facebook/k/j;)V
    .locals 0

    .prologue
    .line 39
    invoke-direct {p0}, Lcom/facebook/k/j;->b()V

    return-void
.end method

.method static synthetic b(Lcom/facebook/k/j;)Lcom/facebook/common/hardware/k;
    .locals 1

    .prologue
    .line 39
    iget-object v0, p0, Lcom/facebook/k/j;->d:Lcom/facebook/common/hardware/k;

    return-object v0
.end method

.method private declared-synchronized b()V
    .locals 1

    .prologue
    .line 198
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/k/j;->h:Ljava/util/PriorityQueue;

    invoke-virtual {v0}, Ljava/util/PriorityQueue;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 199
    invoke-direct {p0}, Lcom/facebook/k/j;->a()V

    .line 200
    invoke-direct {p0}, Lcom/facebook/k/j;->c()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 202
    :cond_0
    monitor-exit p0

    return-void

    .line 198
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method private c()V
    .locals 2

    .prologue
    .line 210
    invoke-direct {p0}, Lcom/facebook/k/j;->d()V

    .line 211
    :goto_0
    iget-object v0, p0, Lcom/facebook/k/j;->h:Ljava/util/PriorityQueue;

    invoke-virtual {v0}, Ljava/util/PriorityQueue;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 212
    iget-object v0, p0, Lcom/facebook/k/j;->h:Ljava/util/PriorityQueue;

    invoke-virtual {v0}, Ljava/util/PriorityQueue;->poll()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/k/n;

    .line 213
    iget-object v1, p0, Lcom/facebook/k/j;->c:Ljava/util/concurrent/ScheduledExecutorService;

    iget-object v0, v0, Lcom/facebook/k/n;->a:Ljava/lang/Runnable;

    invoke-interface {v1, v0}, Ljava/util/concurrent/ScheduledExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    goto :goto_0

    .line 215
    :cond_0
    return-void
.end method

.method private d()V
    .locals 2

    .prologue
    .line 237
    iget-object v0, p0, Lcom/facebook/k/j;->g:Lcom/facebook/base/broadcast/l;

    invoke-interface {v0}, Lcom/facebook/base/broadcast/l;->c()V

    .line 238
    iget-object v0, p0, Lcom/facebook/k/j;->b:Lcom/facebook/common/hardware/f;

    iget-object v1, p0, Lcom/facebook/k/j;->i:Lcom/facebook/common/hardware/h;

    invoke-virtual {v0, v1}, Lcom/facebook/common/hardware/f;->a(Lcom/facebook/common/hardware/h;)Z

    .line 239
    return-void
.end method
