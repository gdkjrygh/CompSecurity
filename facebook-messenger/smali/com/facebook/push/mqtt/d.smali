.class public Lcom/facebook/push/mqtt/d;
.super Ljava/lang/Object;
.source "ConnectionRetryManager.java"


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

.field private final c:Landroid/content/Context;

.field private final d:Lcom/facebook/common/time/a;

.field private final e:Lcom/facebook/push/mqtt/abtest/a;

.field private f:Lcom/facebook/push/mqtt/h;

.field private g:Ljava/lang/Runnable;

.field private h:Ljava/util/concurrent/ScheduledFuture;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ScheduledFuture",
            "<*>;"
        }
    .end annotation
.end field

.field private i:J

.field private j:I

.field private k:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 26
    const-class v0, Lcom/facebook/push/mqtt/d;

    sput-object v0, Lcom/facebook/push/mqtt/d;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/facebook/common/time/a;Ljava/util/concurrent/ScheduledExecutorService;Lcom/facebook/push/mqtt/abtest/a;)V
    .locals 1
    .param p3    # Ljava/util/concurrent/ScheduledExecutorService;
        .annotation runtime Lcom/facebook/common/executors/ForUiThreadWakeup;
        .end annotation
    .end param

    .prologue
    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    iput-object p1, p0, Lcom/facebook/push/mqtt/d;->c:Landroid/content/Context;

    .line 46
    iput-object p2, p0, Lcom/facebook/push/mqtt/d;->d:Lcom/facebook/common/time/a;

    .line 47
    iput-object p3, p0, Lcom/facebook/push/mqtt/d;->b:Ljava/util/concurrent/ScheduledExecutorService;

    .line 48
    iput-object p4, p0, Lcom/facebook/push/mqtt/d;->e:Lcom/facebook/push/mqtt/abtest/a;

    .line 49
    const/4 v0, 0x0

    iput v0, p0, Lcom/facebook/push/mqtt/d;->j:I

    .line 50
    return-void
.end method

.method private a(Lcom/facebook/push/mqtt/e;)V
    .locals 4

    .prologue
    .line 75
    sget-object v0, Lcom/facebook/push/mqtt/d;->a:Ljava/lang/Class;

    const-string v1, "set strategy to %s"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-static {v0, v1, v2}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 77
    invoke-direct {p0}, Lcom/facebook/push/mqtt/d;->f()V

    .line 79
    iget-object v0, p0, Lcom/facebook/push/mqtt/d;->e:Lcom/facebook/push/mqtt/abtest/a;

    invoke-virtual {v0}, Lcom/facebook/push/mqtt/abtest/a;->a()Lcom/facebook/push/mqtt/abtest/e;

    move-result-object v0

    .line 81
    sget-object v1, Lcom/facebook/push/mqtt/e;->BACK_TO_BACK:Lcom/facebook/push/mqtt/e;

    if-ne p1, v1, :cond_0

    .line 82
    new-instance v1, Lcom/facebook/push/mqtt/b;

    invoke-virtual {v0}, Lcom/facebook/push/mqtt/abtest/e;->e()I

    move-result v2

    invoke-virtual {v0}, Lcom/facebook/push/mqtt/abtest/e;->f()I

    move-result v0

    invoke-direct {v1, v2, v0}, Lcom/facebook/push/mqtt/b;-><init>(II)V

    iput-object v1, p0, Lcom/facebook/push/mqtt/d;->f:Lcom/facebook/push/mqtt/h;

    .line 95
    :goto_0
    return-void

    .line 86
    :cond_0
    sget-object v1, Lcom/facebook/push/mqtt/e;->BACK_OFF:Lcom/facebook/push/mqtt/e;

    if-ne p1, v1, :cond_1

    .line 87
    new-instance v1, Lcom/facebook/push/mqtt/c;

    invoke-virtual {v0}, Lcom/facebook/push/mqtt/abtest/e;->g()I

    move-result v2

    invoke-virtual {v0}, Lcom/facebook/push/mqtt/abtest/e;->h()I

    move-result v0

    invoke-direct {v1, v2, v0}, Lcom/facebook/push/mqtt/c;-><init>(II)V

    iput-object v1, p0, Lcom/facebook/push/mqtt/d;->f:Lcom/facebook/push/mqtt/h;

    goto :goto_0

    .line 91
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Invalid strategy "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " specified."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 92
    sget-object v1, Lcom/facebook/push/mqtt/d;->a:Ljava/lang/Class;

    invoke-static {v1, v0}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 93
    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method private f()V
    .locals 2

    .prologue
    .line 167
    invoke-direct {p0}, Lcom/facebook/push/mqtt/d;->g()V

    .line 168
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/push/mqtt/d;->f:Lcom/facebook/push/mqtt/h;

    .line 169
    const-wide/high16 v0, -0x8000000000000000L

    iput-wide v0, p0, Lcom/facebook/push/mqtt/d;->i:J

    .line 170
    return-void
.end method

.method private g()V
    .locals 2

    .prologue
    .line 173
    iget-object v0, p0, Lcom/facebook/push/mqtt/d;->h:Ljava/util/concurrent/ScheduledFuture;

    if-eqz v0, :cond_0

    .line 174
    iget-object v0, p0, Lcom/facebook/push/mqtt/d;->h:Ljava/util/concurrent/ScheduledFuture;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/concurrent/ScheduledFuture;->cancel(Z)Z

    .line 176
    :cond_0
    return-void
.end method


# virtual methods
.method public declared-synchronized a()V
    .locals 2

    .prologue
    .line 65
    monitor-enter p0

    :try_start_0
    sget-object v0, Lcom/facebook/push/mqtt/e;->BACK_TO_BACK:Lcom/facebook/push/mqtt/e;

    invoke-direct {p0, v0}, Lcom/facebook/push/mqtt/d;->a(Lcom/facebook/push/mqtt/e;)V

    .line 66
    const/4 v0, 0x0

    iput v0, p0, Lcom/facebook/push/mqtt/d;->j:I

    .line 67
    iget-object v0, p0, Lcom/facebook/push/mqtt/d;->d:Lcom/facebook/common/time/a;

    invoke-interface {v0}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/push/mqtt/d;->k:J

    .line 68
    invoke-virtual {p0}, Lcom/facebook/push/mqtt/d;->b()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 69
    monitor-exit p0

    return-void

    .line 65
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized a(Ljava/lang/Runnable;)V
    .locals 1

    .prologue
    .line 56
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/push/mqtt/d;->g:Ljava/lang/Runnable;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkState(Z)V

    .line 57
    iput-object p1, p0, Lcom/facebook/push/mqtt/d;->g:Ljava/lang/Runnable;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 58
    monitor-exit p0

    return-void

    .line 56
    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized b()Z
    .locals 9

    .prologue
    const-wide/16 v6, 0x3e8

    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 101
    monitor-enter p0

    :try_start_0
    sget-object v2, Lcom/facebook/push/mqtt/d;->a:Ljava/lang/Class;

    const-string v3, "next"

    invoke-static {v2, v3}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;)V

    .line 104
    iget-object v2, p0, Lcom/facebook/push/mqtt/d;->f:Lcom/facebook/push/mqtt/h;

    if-nez v2, :cond_0

    .line 105
    sget-object v1, Lcom/facebook/push/mqtt/d;->a:Ljava/lang/Class;

    const-string v2, "next is called before having a strategy."

    invoke-static {v1, v2}, Lcom/facebook/debug/log/b;->d(Ljava/lang/Class;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 147
    :goto_0
    monitor-exit p0

    return v0

    .line 110
    :cond_0
    :try_start_1
    iget-object v2, p0, Lcom/facebook/push/mqtt/d;->d:Lcom/facebook/common/time/a;

    invoke-interface {v2}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v2

    .line 111
    iget-wide v4, p0, Lcom/facebook/push/mqtt/d;->i:J

    cmp-long v4, v4, v2

    if-lez v4, :cond_1

    .line 112
    sget-object v0, Lcom/facebook/push/mqtt/d;->a:Ljava/lang/Class;

    const-string v4, "Retry attempt already scheduled. Next retry due in %d seconds."

    const/4 v5, 0x1

    new-array v5, v5, [Ljava/lang/Object;

    const/4 v6, 0x0

    iget-wide v7, p0, Lcom/facebook/push/mqtt/d;->i:J

    sub-long v2, v7, v2

    const-wide/16 v7, 0x3e8

    div-long/2addr v2, v7

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    aput-object v2, v5, v6

    invoke-static {v0, v4, v5}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    move v0, v1

    .line 115
    goto :goto_0

    .line 118
    :cond_1
    iget-object v2, p0, Lcom/facebook/push/mqtt/d;->f:Lcom/facebook/push/mqtt/h;

    invoke-interface {v2}, Lcom/facebook/push/mqtt/h;->b()Z

    move-result v2

    .line 119
    if-nez v2, :cond_3

    .line 121
    iget-object v3, p0, Lcom/facebook/push/mqtt/d;->f:Lcom/facebook/push/mqtt/h;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    const-class v4, Lcom/facebook/push/mqtt/b;

    if-ne v3, v4, :cond_2

    .line 122
    sget-object v2, Lcom/facebook/push/mqtt/d;->a:Ljava/lang/Class;

    const-string v3, "Auto switching from B2B to back off retry strategy."

    invoke-static {v2, v3}, Lcom/facebook/debug/log/b;->c(Ljava/lang/Class;Ljava/lang/String;)V

    .line 123
    sget-object v2, Lcom/facebook/push/mqtt/e;->BACK_OFF:Lcom/facebook/push/mqtt/e;

    invoke-direct {p0, v2}, Lcom/facebook/push/mqtt/d;->a(Lcom/facebook/push/mqtt/e;)V

    .line 124
    iget-object v2, p0, Lcom/facebook/push/mqtt/d;->f:Lcom/facebook/push/mqtt/h;

    invoke-interface {v2}, Lcom/facebook/push/mqtt/h;->b()Z

    move-result v2

    .line 127
    :cond_2
    if-nez v2, :cond_3

    .line 128
    sget-object v1, Lcom/facebook/push/mqtt/d;->a:Ljava/lang/Class;

    const-string v2, "No more retry!"

    invoke-static {v1, v2}, Lcom/facebook/debug/log/b;->d(Ljava/lang/Class;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 101
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 133
    :cond_3
    :try_start_2
    iget-object v0, p0, Lcom/facebook/push/mqtt/d;->f:Lcom/facebook/push/mqtt/h;

    invoke-interface {v0}, Lcom/facebook/push/mqtt/h;->a()I

    move-result v0

    .line 134
    int-to-long v2, v0

    mul-long/2addr v2, v6

    .line 135
    iget-object v4, p0, Lcom/facebook/push/mqtt/d;->d:Lcom/facebook/common/time/a;

    invoke-interface {v4}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v4

    add-long/2addr v2, v4

    iput-wide v2, p0, Lcom/facebook/push/mqtt/d;->i:J

    .line 136
    sget-object v2, Lcom/facebook/push/mqtt/d;->a:Ljava/lang/Class;

    iget-object v3, p0, Lcom/facebook/push/mqtt/d;->f:Lcom/facebook/push/mqtt/h;

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/facebook/debug/log/b;->c(Ljava/lang/Class;Ljava/lang/String;)V

    .line 138
    invoke-direct {p0}, Lcom/facebook/push/mqtt/d;->g()V

    .line 139
    sget-object v2, Lcom/facebook/push/mqtt/d;->a:Ljava/lang/Class;

    const-string v3, "Scheduling retry in %d"

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v4, v5

    invoke-static {v2, v3, v4}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 140
    iget-object v2, p0, Lcom/facebook/push/mqtt/d;->b:Ljava/util/concurrent/ScheduledExecutorService;

    iget-object v3, p0, Lcom/facebook/push/mqtt/d;->g:Ljava/lang/Runnable;

    int-to-long v4, v0

    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v2, v3, v4, v5, v0}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/push/mqtt/d;->h:Ljava/util/concurrent/ScheduledFuture;

    .line 146
    iget v0, p0, Lcom/facebook/push/mqtt/d;->j:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/facebook/push/mqtt/d;->j:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move v0, v1

    .line 147
    goto/16 :goto_0
.end method

.method public declared-synchronized c()V
    .locals 2

    .prologue
    .line 154
    monitor-enter p0

    :try_start_0
    sget-object v0, Lcom/facebook/push/mqtt/d;->a:Ljava/lang/Class;

    const-string v1, "stop retry"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;)V

    .line 155
    invoke-direct {p0}, Lcom/facebook/push/mqtt/d;->f()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 156
    monitor-exit p0

    return-void

    .line 154
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public d()I
    .locals 1

    .prologue
    .line 159
    iget v0, p0, Lcom/facebook/push/mqtt/d;->j:I

    return v0
.end method

.method public e()J
    .locals 2

    .prologue
    .line 163
    iget-wide v0, p0, Lcom/facebook/push/mqtt/d;->k:J

    return-wide v0
.end method
