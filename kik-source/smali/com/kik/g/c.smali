.class public final Lcom/kik/g/c;
.super Lcom/kik/g/i;
.source "SourceFile"


# instance fields
.field private final a:Lcom/kik/g/i;

.field private final b:J

.field private c:Ljava/lang/Object;

.field private d:Ljava/lang/Object;

.field private final e:Ljava/lang/Object;

.field private f:Ljava/util/concurrent/ScheduledFuture;

.field private g:Ljava/util/concurrent/ScheduledExecutorService;

.field private h:Ljava/lang/Runnable;


# direct methods
.method constructor <init>(Ljava/util/concurrent/ScheduledExecutorService;Lcom/kik/g/i;)V
    .locals 2

    .prologue
    .line 28
    invoke-direct {p0}, Lcom/kik/g/i;-><init>()V

    .line 15
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/kik/g/c;->e:Ljava/lang/Object;

    .line 16
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/kik/g/c;->f:Ljava/util/concurrent/ScheduledFuture;

    .line 19
    new-instance v0, Lcom/kik/g/d;

    invoke-direct {v0, p0}, Lcom/kik/g/d;-><init>(Lcom/kik/g/c;)V

    iput-object v0, p0, Lcom/kik/g/c;->h:Ljava/lang/Runnable;

    .line 29
    iput-object p2, p0, Lcom/kik/g/c;->a:Lcom/kik/g/i;

    .line 30
    const-wide/16 v0, 0xc8

    iput-wide v0, p0, Lcom/kik/g/c;->b:J

    .line 31
    iput-object p1, p0, Lcom/kik/g/c;->g:Ljava/util/concurrent/ScheduledExecutorService;

    .line 32
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    .prologue
    .line 49
    iget-object v1, p0, Lcom/kik/g/c;->e:Ljava/lang/Object;

    monitor-enter v1

    .line 53
    :try_start_0
    iget-object v0, p0, Lcom/kik/g/c;->f:Ljava/util/concurrent/ScheduledFuture;

    if-eqz v0, :cond_0

    .line 54
    iget-object v0, p0, Lcom/kik/g/c;->f:Ljava/util/concurrent/ScheduledFuture;

    const/4 v2, 0x0

    invoke-interface {v0, v2}, Ljava/util/concurrent/ScheduledFuture;->cancel(Z)Z

    .line 55
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/kik/g/c;->f:Ljava/util/concurrent/ScheduledFuture;

    .line 58
    :cond_0
    iget-object v0, p0, Lcom/kik/g/c;->c:Ljava/lang/Object;

    .line 59
    iget-object v2, p0, Lcom/kik/g/c;->d:Ljava/lang/Object;

    .line 61
    const/4 v3, 0x0

    iput-object v3, p0, Lcom/kik/g/c;->d:Ljava/lang/Object;

    .line 62
    const/4 v3, 0x0

    iput-object v3, p0, Lcom/kik/g/c;->c:Ljava/lang/Object;

    .line 63
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 65
    if-eqz v0, :cond_1

    .line 66
    iget-object v1, p0, Lcom/kik/g/c;->a:Lcom/kik/g/i;

    invoke-virtual {v1, v0, v2}, Lcom/kik/g/i;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 68
    :cond_1
    return-void

    .line 63
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 6

    .prologue
    .line 37
    iget-object v1, p0, Lcom/kik/g/c;->e:Ljava/lang/Object;

    monitor-enter v1

    .line 38
    :try_start_0
    iput-object p1, p0, Lcom/kik/g/c;->c:Ljava/lang/Object;

    .line 39
    iput-object p2, p0, Lcom/kik/g/c;->d:Ljava/lang/Object;

    .line 41
    iget-object v0, p0, Lcom/kik/g/c;->f:Ljava/util/concurrent/ScheduledFuture;

    if-nez v0, :cond_0

    .line 42
    iget-object v0, p0, Lcom/kik/g/c;->g:Ljava/util/concurrent/ScheduledExecutorService;

    iget-object v2, p0, Lcom/kik/g/c;->h:Ljava/lang/Runnable;

    iget-wide v4, p0, Lcom/kik/g/c;->b:J

    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v0, v2, v4, v5, v3}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object v0

    iput-object v0, p0, Lcom/kik/g/c;->f:Ljava/util/concurrent/ScheduledFuture;

    .line 44
    :cond_0
    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
