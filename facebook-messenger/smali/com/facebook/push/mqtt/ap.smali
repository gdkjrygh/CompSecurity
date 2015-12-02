.class public Lcom/facebook/push/mqtt/ap;
.super Ljava/lang/Object;
.source "MqttOperationManager.java"


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
.field private final b:Ljava/util/concurrent/ScheduledExecutorService;

.field private final c:Lcom/facebook/push/mqtt/abtest/a;

.field private final d:Lcom/facebook/analytics/cj;

.field private final e:Lcom/facebook/common/time/a;

.field private final f:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/Integer;",
            "Lcom/facebook/push/mqtt/ao;",
            ">;"
        }
    .end annotation

    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "itself"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 33
    const-class v0, Lcom/facebook/push/mqtt/ap;

    sput-object v0, Lcom/facebook/push/mqtt/ap;->a:Ljava/lang/Class;

    return-void
.end method

.method constructor <init>(Ljava/util/concurrent/ScheduledExecutorService;Lcom/facebook/push/mqtt/abtest/a;Lcom/facebook/analytics/cj;Lcom/facebook/common/time/a;)V
    .locals 1
    .param p1    # Ljava/util/concurrent/ScheduledExecutorService;
        .annotation runtime Lcom/facebook/common/executors/ForUiThreadWakeup;
        .end annotation
    .end param

    .prologue
    .line 49
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    invoke-static {}, Lcom/google/common/a/ik;->a()Ljava/util/HashMap;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/push/mqtt/ap;->f:Ljava/util/Map;

    .line 50
    iput-object p1, p0, Lcom/facebook/push/mqtt/ap;->b:Ljava/util/concurrent/ScheduledExecutorService;

    .line 51
    iput-object p2, p0, Lcom/facebook/push/mqtt/ap;->c:Lcom/facebook/push/mqtt/abtest/a;

    .line 52
    iput-object p3, p0, Lcom/facebook/push/mqtt/ap;->d:Lcom/facebook/analytics/cj;

    .line 53
    iput-object p4, p0, Lcom/facebook/push/mqtt/ap;->e:Lcom/facebook/common/time/a;

    .line 54
    return-void
.end method

.method private a(Lcom/facebook/push/mqtt/ao;)V
    .locals 11

    .prologue
    const/4 v2, 0x2

    const/4 v10, 0x0

    const/4 v9, 0x1

    .line 154
    sget-object v0, Lcom/facebook/push/mqtt/ap;->a:Ljava/lang/Class;

    const-string v1, "Response %s timed out for operation %d"

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/facebook/push/mqtt/ao;->b()Lcom/facebook/mqtt/messages/k;

    move-result-object v3

    invoke-virtual {v3}, Lcom/facebook/mqtt/messages/k;->name()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v10

    invoke-virtual {p1}, Lcom/facebook/push/mqtt/ao;->c()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v2, v9

    invoke-static {v0, v1, v2}, Lcom/facebook/debug/log/b;->c(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 158
    iget-object v1, p0, Lcom/facebook/push/mqtt/ap;->f:Ljava/util/Map;

    monitor-enter v1

    .line 159
    :try_start_0
    iget-object v0, p0, Lcom/facebook/push/mqtt/ap;->f:Ljava/util/Map;

    invoke-virtual {p1}, Lcom/facebook/push/mqtt/ao;->c()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, p1, :cond_1

    .line 160
    iget-object v0, p0, Lcom/facebook/push/mqtt/ap;->f:Ljava/util/Map;

    invoke-virtual {p1}, Lcom/facebook/push/mqtt/ao;->c()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 162
    iget-object v0, p0, Lcom/facebook/push/mqtt/ap;->c:Lcom/facebook/push/mqtt/abtest/a;

    invoke-virtual {v0}, Lcom/facebook/push/mqtt/abtest/a;->a()Lcom/facebook/push/mqtt/abtest/e;

    move-result-object v0

    .line 163
    iget-object v2, p0, Lcom/facebook/push/mqtt/ap;->d:Lcom/facebook/analytics/cj;

    invoke-virtual {p1}, Lcom/facebook/push/mqtt/ao;->b()Lcom/facebook/mqtt/messages/k;

    move-result-object v3

    invoke-virtual {v3}, Lcom/facebook/mqtt/messages/k;->name()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lcom/facebook/push/mqtt/ao;->c()I

    move-result v4

    invoke-virtual {v0}, Lcom/facebook/push/mqtt/abtest/e;->d()I

    move-result v0

    int-to-long v5, v0

    const-wide/16 v7, 0x3e8

    mul-long/2addr v5, v7

    invoke-virtual {v2, v3, v4, v5, v6}, Lcom/facebook/analytics/cj;->a(Ljava/lang/String;IJ)V

    .line 171
    :goto_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 174
    new-instance v0, Ljava/util/concurrent/TimeoutException;

    invoke-direct {v0}, Ljava/util/concurrent/TimeoutException;-><init>()V

    invoke-virtual {p1, v0}, Lcom/facebook/push/mqtt/ao;->a(Ljava/lang/Throwable;)V

    .line 177
    iget-object v0, p0, Lcom/facebook/push/mqtt/ap;->c:Lcom/facebook/push/mqtt/abtest/a;

    invoke-virtual {v0}, Lcom/facebook/push/mqtt/abtest/a;->a()Lcom/facebook/push/mqtt/abtest/e;

    move-result-object v0

    .line 178
    invoke-virtual {p1}, Lcom/facebook/push/mqtt/ao;->b()Lcom/facebook/mqtt/messages/k;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/mqtt/messages/k;->toInt()I

    move-result v1

    shl-int v1, v9, v1

    .line 179
    invoke-virtual {v0}, Lcom/facebook/push/mqtt/abtest/e;->l()I

    move-result v0

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    .line 180
    sget-object v0, Lcom/facebook/push/mqtt/ap;->a:Ljava/lang/Class;

    const-string v1, "Disconnecting client %h due to request timeout"

    new-array v2, v9, [Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/facebook/push/mqtt/ao;->a()Lcom/facebook/mqtt/b;

    move-result-object v3

    aput-object v3, v2, v10

    invoke-static {v0, v1, v2}, Lcom/facebook/debug/log/b;->c(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 181
    invoke-virtual {p1}, Lcom/facebook/push/mqtt/ao;->a()Lcom/facebook/mqtt/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/mqtt/b;->e()V

    .line 183
    :cond_0
    return-void

    .line 168
    :cond_1
    :try_start_1
    sget-object v0, Lcom/facebook/push/mqtt/ap;->a:Ljava/lang/Class;

    const-string v2, "Duplicate operation ID %d for operation %s and client %h."

    const/4 v3, 0x3

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    invoke-virtual {p1}, Lcom/facebook/push/mqtt/ao;->c()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v3, v4

    const/4 v4, 0x1

    invoke-virtual {p1}, Lcom/facebook/push/mqtt/ao;->b()Lcom/facebook/mqtt/messages/k;

    move-result-object v5

    invoke-virtual {v5}, Lcom/facebook/mqtt/messages/k;->name()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v3, v4

    const/4 v4, 0x2

    invoke-virtual {p1}, Lcom/facebook/push/mqtt/ao;->a()Lcom/facebook/mqtt/b;

    move-result-object v5

    aput-object v5, v3, v4

    invoke-static {v0, v2, v3}, Lcom/facebook/debug/log/b;->d(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 171
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method static synthetic a(Lcom/facebook/push/mqtt/ap;Lcom/facebook/push/mqtt/ao;)V
    .locals 0

    .prologue
    .line 32
    invoke-direct {p0, p1}, Lcom/facebook/push/mqtt/ap;->a(Lcom/facebook/push/mqtt/ao;)V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/mqtt/b;Lcom/facebook/mqtt/messages/k;I)Lcom/facebook/push/mqtt/ao;
    .locals 7

    .prologue
    .line 67
    invoke-static {p1}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    new-instance v0, Lcom/facebook/push/mqtt/ao;

    iget-object v1, p0, Lcom/facebook/push/mqtt/ap;->e:Lcom/facebook/common/time/a;

    invoke-interface {v1}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v4

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    invoke-direct/range {v0 .. v5}, Lcom/facebook/push/mqtt/ao;-><init>(Lcom/facebook/mqtt/b;Lcom/facebook/mqtt/messages/k;IJ)V

    .line 74
    iget-object v2, p0, Lcom/facebook/push/mqtt/ap;->f:Ljava/util/Map;

    monitor-enter v2

    .line 75
    :try_start_0
    iget-object v1, p0, Lcom/facebook/push/mqtt/ap;->f:Ljava/util/Map;

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v1, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/push/mqtt/ao;

    .line 76
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 77
    if-eqz v1, :cond_0

    .line 78
    new-instance v2, Ljava/util/concurrent/TimeoutException;

    invoke-direct {v2}, Ljava/util/concurrent/TimeoutException;-><init>()V

    invoke-virtual {v1, v2}, Lcom/facebook/push/mqtt/ao;->a(Ljava/lang/Throwable;)V

    .line 79
    sget-object v2, Lcom/facebook/push/mqtt/ap;->a:Ljava/lang/Class;

    const-string v3, "Unexpected duplicate message ID %d for operation %s."

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    invoke-virtual {v1}, Lcom/facebook/push/mqtt/ao;->c()I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v4, v5

    const/4 v5, 0x1

    invoke-virtual {v1}, Lcom/facebook/push/mqtt/ao;->b()Lcom/facebook/mqtt/messages/k;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/mqtt/messages/k;->name()Ljava/lang/String;

    move-result-object v1

    aput-object v1, v4, v5

    invoke-static {v2, v3, v4}, Lcom/facebook/debug/log/b;->e(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 85
    :cond_0
    iget-object v1, p0, Lcom/facebook/push/mqtt/ap;->c:Lcom/facebook/push/mqtt/abtest/a;

    invoke-virtual {v1}, Lcom/facebook/push/mqtt/abtest/a;->a()Lcom/facebook/push/mqtt/abtest/e;

    move-result-object v1

    .line 86
    iget-object v2, p0, Lcom/facebook/push/mqtt/ap;->b:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v3, Lcom/facebook/push/mqtt/aq;

    invoke-direct {v3, p0, v0}, Lcom/facebook/push/mqtt/aq;-><init>(Lcom/facebook/push/mqtt/ap;Lcom/facebook/push/mqtt/ao;)V

    invoke-virtual {v1}, Lcom/facebook/push/mqtt/abtest/e;->d()I

    move-result v1

    int-to-long v4, v1

    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v2, v3, v4, v5, v1}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object v1

    .line 97
    invoke-virtual {v0, v1}, Lcom/facebook/push/mqtt/ao;->a(Ljava/util/concurrent/ScheduledFuture;)V

    .line 99
    return-object v0

    .line 76
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public a(Ljava/lang/Throwable;)V
    .locals 6

    .prologue
    .line 132
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v0

    .line 135
    iget-object v1, p0, Lcom/facebook/push/mqtt/ap;->f:Ljava/util/Map;

    monitor-enter v1

    .line 136
    :try_start_0
    iget-object v2, p0, Lcom/facebook/push/mqtt/ap;->f:Ljava/util/Map;

    invoke-interface {v2}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 137
    iget-object v2, p0, Lcom/facebook/push/mqtt/ap;->f:Ljava/util/Map;

    invoke-interface {v2}, Ljava/util/Map;->clear()V

    .line 138
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 140
    sget-object v1, Lcom/facebook/push/mqtt/ap;->a:Ljava/lang/Class;

    const-string v2, "Aborting %d pending operations."

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v3, v4

    invoke-static {v1, v2, v3}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 143
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/push/mqtt/ao;

    .line 144
    invoke-virtual {v0, p1}, Lcom/facebook/push/mqtt/ao;->a(Ljava/lang/Throwable;)V

    goto :goto_0

    .line 138
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    .line 146
    :cond_0
    return-void
.end method

.method public a(I)Z
    .locals 8

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 110
    iget-object v3, p0, Lcom/facebook/push/mqtt/ap;->f:Ljava/util/Map;

    monitor-enter v3

    .line 111
    :try_start_0
    iget-object v0, p0, Lcom/facebook/push/mqtt/ap;->f:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v0, v4}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/push/mqtt/ao;

    .line 112
    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 115
    if-eqz v0, :cond_0

    .line 116
    invoke-virtual {v0}, Lcom/facebook/push/mqtt/ao;->f()V

    .line 117
    iget-object v2, p0, Lcom/facebook/push/mqtt/ap;->d:Lcom/facebook/analytics/cj;

    invoke-virtual {v0}, Lcom/facebook/push/mqtt/ao;->b()Lcom/facebook/mqtt/messages/k;

    move-result-object v3

    invoke-virtual {v3}, Lcom/facebook/mqtt/messages/k;->name()Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lcom/facebook/push/mqtt/ap;->e:Lcom/facebook/common/time/a;

    invoke-interface {v4}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v4

    invoke-virtual {v0}, Lcom/facebook/push/mqtt/ao;->e()J

    move-result-wide v6

    sub-long/2addr v4, v6

    invoke-virtual {v2, v3, v4, v5}, Lcom/facebook/analytics/cj;->b(Ljava/lang/String;J)V

    move v0, v1

    .line 123
    :goto_0
    return v0

    .line 112
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    .line 122
    :cond_0
    sget-object v0, Lcom/facebook/push/mqtt/ap;->a:Ljava/lang/Class;

    const-string v3, "Operation %d not found."

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v1, v2

    invoke-static {v0, v3, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    move v0, v2

    .line 123
    goto :goto_0
.end method
