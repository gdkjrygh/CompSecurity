.class public Lcom/facebook/common/hardware/q;
.super Ljava/lang/Object;
.source "ScreenPowerState.java"


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Landroid/os/PowerManager;

.field private final c:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Lcom/facebook/common/hardware/t;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Landroid/content/BroadcastReceiver;

.field private final e:Landroid/content/BroadcastReceiver;

.field private f:Ljava/lang/Boolean;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/os/PowerManager;)V
    .locals 1

    .prologue
    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    invoke-static {}, Lcom/google/common/a/ik;->c()Ljava/util/concurrent/ConcurrentMap;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/common/hardware/q;->c:Ljava/util/Map;

    .line 40
    invoke-static {p1}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    iput-object v0, p0, Lcom/facebook/common/hardware/q;->a:Landroid/content/Context;

    .line 41
    invoke-static {p2}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/PowerManager;

    iput-object v0, p0, Lcom/facebook/common/hardware/q;->b:Landroid/os/PowerManager;

    .line 43
    new-instance v0, Lcom/facebook/common/hardware/r;

    invoke-direct {v0, p0}, Lcom/facebook/common/hardware/r;-><init>(Lcom/facebook/common/hardware/q;)V

    iput-object v0, p0, Lcom/facebook/common/hardware/q;->d:Landroid/content/BroadcastReceiver;

    .line 53
    new-instance v0, Lcom/facebook/common/hardware/s;

    invoke-direct {v0, p0}, Lcom/facebook/common/hardware/s;-><init>(Lcom/facebook/common/hardware/q;)V

    iput-object v0, p0, Lcom/facebook/common/hardware/q;->e:Landroid/content/BroadcastReceiver;

    .line 62
    return-void
.end method

.method static synthetic a(Lcom/facebook/common/hardware/q;Ljava/lang/Boolean;)Ljava/lang/Boolean;
    .locals 0

    .prologue
    .line 21
    iput-object p1, p0, Lcom/facebook/common/hardware/q;->f:Ljava/lang/Boolean;

    return-object p1
.end method

.method static synthetic a(Lcom/facebook/common/hardware/q;)Ljava/util/Map;
    .locals 1

    .prologue
    .line 21
    iget-object v0, p0, Lcom/facebook/common/hardware/q;->c:Ljava/util/Map;

    return-object v0
.end method

.method private a(Landroid/content/Context;Ljava/lang/String;Landroid/content/BroadcastReceiver;)V
    .locals 2

    .prologue
    .line 68
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0, p2}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 69
    const/16 v1, 0x3e7

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->setPriority(I)V

    .line 70
    invoke-virtual {p1, p3, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 71
    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/common/hardware/t;)V
    .locals 3

    .prologue
    .line 80
    monitor-enter p0

    .line 81
    :try_start_0
    iget-object v0, p0, Lcom/facebook/common/hardware/q;->c:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 82
    iget-object v0, p0, Lcom/facebook/common/hardware/q;->a:Landroid/content/Context;

    const-string v1, "android.intent.action.SCREEN_ON"

    iget-object v2, p0, Lcom/facebook/common/hardware/q;->d:Landroid/content/BroadcastReceiver;

    invoke-direct {p0, v0, v1, v2}, Lcom/facebook/common/hardware/q;->a(Landroid/content/Context;Ljava/lang/String;Landroid/content/BroadcastReceiver;)V

    .line 83
    iget-object v0, p0, Lcom/facebook/common/hardware/q;->a:Landroid/content/Context;

    const-string v1, "android.intent.action.SCREEN_OFF"

    iget-object v2, p0, Lcom/facebook/common/hardware/q;->e:Landroid/content/BroadcastReceiver;

    invoke-direct {p0, v0, v1, v2}, Lcom/facebook/common/hardware/q;->a(Landroid/content/Context;Ljava/lang/String;Landroid/content/BroadcastReceiver;)V

    .line 86
    :cond_0
    iget-object v0, p0, Lcom/facebook/common/hardware/q;->c:Ljava/util/Map;

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    monitor-exit p0

    .line 88
    return-void

    .line 87
    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public a()Z
    .locals 1

    .prologue
    .line 123
    iget-object v0, p0, Lcom/facebook/common/hardware/q;->f:Ljava/lang/Boolean;

    if-eqz v0, :cond_0

    .line 124
    iget-object v0, p0, Lcom/facebook/common/hardware/q;->f:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    .line 127
    :goto_0
    return v0

    :cond_0
    invoke-virtual {p0}, Lcom/facebook/common/hardware/q;->b()Z

    move-result v0

    goto :goto_0
.end method

.method public b(Lcom/facebook/common/hardware/t;)V
    .locals 2

    .prologue
    .line 96
    monitor-enter p0

    .line 98
    :try_start_0
    iget-object v0, p0, Lcom/facebook/common/hardware/q;->c:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 99
    monitor-exit p0

    .line 113
    :goto_0
    return-void

    .line 102
    :cond_0
    iget-object v0, p0, Lcom/facebook/common/hardware/q;->c:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    iget-object v0, p0, Lcom/facebook/common/hardware/q;->c:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 105
    iget-object v0, p0, Lcom/facebook/common/hardware/q;->a:Landroid/content/Context;

    iget-object v1, p0, Lcom/facebook/common/hardware/q;->d:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 106
    iget-object v0, p0, Lcom/facebook/common/hardware/q;->a:Landroid/content/Context;

    iget-object v1, p0, Lcom/facebook/common/hardware/q;->e:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 110
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/common/hardware/q;->f:Ljava/lang/Boolean;

    .line 112
    :cond_1
    monitor-exit p0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public b()Z
    .locals 1

    .prologue
    .line 134
    iget-object v0, p0, Lcom/facebook/common/hardware/q;->b:Landroid/os/PowerManager;

    invoke-virtual {v0}, Landroid/os/PowerManager;->isScreenOn()Z

    move-result v0

    return v0
.end method
