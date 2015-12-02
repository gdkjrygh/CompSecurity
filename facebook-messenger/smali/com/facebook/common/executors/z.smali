.class public Lcom/facebook/common/executors/z;
.super Ljava/util/concurrent/AbstractExecutorService;
.source "WakingExecutorService.java"

# interfaces
.implements Lcom/google/common/d/a/v;


# annotations
.annotation build Ljavax/annotation/concurrent/ThreadSafe;
.end annotation


# static fields
.field static final a:Ljava/lang/String;
    .annotation build Lcom/google/common/annotations/VisibleForTesting;
    .end annotation
.end field

.field private static final b:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# instance fields
.field private final c:Landroid/content/Context;

.field private final d:Lcom/facebook/common/time/a;

.field private final e:Landroid/app/AlarmManager;

.field private final f:Lcom/facebook/common/executors/a;

.field private final g:Ljava/util/PriorityQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/PriorityQueue",
            "<",
            "Lcom/facebook/common/executors/ae",
            "<*>;>;"
        }
    .end annotation

    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 54
    const-class v0, Lcom/facebook/common/executors/z;

    sput-object v0, Lcom/facebook/common/executors/z;->b:Ljava/lang/Class;

    .line 57
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-class v1, Lcom/facebook/common/executors/z;

    invoke-virtual {v1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".ACTION_ALARM"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/facebook/common/executors/z;->a:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/facebook/common/time/a;Landroid/app/AlarmManager;Lcom/facebook/common/executors/a;)V
    .locals 4

    .prologue
    .line 73
    invoke-direct {p0}, Ljava/util/concurrent/AbstractExecutorService;-><init>()V

    .line 65
    new-instance v0, Ljava/util/PriorityQueue;

    invoke-direct {v0}, Ljava/util/PriorityQueue;-><init>()V

    iput-object v0, p0, Lcom/facebook/common/executors/z;->g:Ljava/util/PriorityQueue;

    .line 74
    iput-object p1, p0, Lcom/facebook/common/executors/z;->c:Landroid/content/Context;

    .line 75
    iput-object p2, p0, Lcom/facebook/common/executors/z;->d:Lcom/facebook/common/time/a;

    .line 76
    iput-object p3, p0, Lcom/facebook/common/executors/z;->e:Landroid/app/AlarmManager;

    .line 77
    iput-object p4, p0, Lcom/facebook/common/executors/z;->f:Lcom/facebook/common/executors/a;

    .line 79
    iget-object v0, p0, Lcom/facebook/common/executors/z;->c:Landroid/content/Context;

    new-instance v1, Lcom/facebook/common/executors/aa;

    invoke-direct {v1, p0}, Lcom/facebook/common/executors/aa;-><init>(Lcom/facebook/common/executors/z;)V

    new-instance v2, Landroid/content/IntentFilter;

    sget-object v3, Lcom/facebook/common/executors/z;->a:Ljava/lang/String;

    invoke-direct {v2, v3}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 80
    return-void
.end method

.method private a()V
    .locals 2

    .prologue
    .line 205
    sget-object v0, Lcom/facebook/common/executors/z;->b:Ljava/lang/Class;

    const-string v1, "Alarm fired"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;)V

    .line 207
    monitor-enter p0

    .line 208
    :try_start_0
    invoke-direct {p0}, Lcom/facebook/common/executors/z;->c()Lcom/google/common/a/es;

    move-result-object v0

    .line 209
    invoke-direct {p0}, Lcom/facebook/common/executors/z;->b()V

    .line 210
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 211
    invoke-direct {p0, v0}, Lcom/facebook/common/executors/z;->a(Lcom/google/common/a/es;)V

    .line 212
    return-void

    .line 210
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method private a(Lcom/facebook/common/executors/ac;J)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/common/executors/ac",
            "<*>;J)V"
        }
    .end annotation

    .prologue
    .line 189
    sget-object v0, Lcom/facebook/common/executors/z;->b:Ljava/lang/Class;

    const-string v1, "Scheduling task for %d seconds from now"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    iget-object v4, p0, Lcom/facebook/common/executors/z;->d:Lcom/facebook/common/time/a;

    invoke-interface {v4}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v4

    sub-long v4, p2, v4

    const-wide/16 v6, 0x3e8

    div-long/2addr v4, v6

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-static {v0, v1, v2}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 190
    monitor-enter p0

    .line 191
    :try_start_0
    iget-object v0, p0, Lcom/facebook/common/executors/z;->g:Ljava/util/PriorityQueue;

    new-instance v1, Lcom/facebook/common/executors/ae;

    invoke-direct {v1, p1, p2, p3}, Lcom/facebook/common/executors/ae;-><init>(Lcom/facebook/common/executors/ac;J)V

    invoke-virtual {v0, v1}, Ljava/util/PriorityQueue;->add(Ljava/lang/Object;)Z

    .line 192
    invoke-direct {p0}, Lcom/facebook/common/executors/z;->b()V

    .line 193
    monitor-exit p0

    .line 194
    return-void

    .line 193
    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method static synthetic a(Lcom/facebook/common/executors/z;)V
    .locals 0

    .prologue
    .line 52
    invoke-direct {p0}, Lcom/facebook/common/executors/z;->a()V

    return-void
.end method

.method private a(Lcom/google/common/a/es;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/common/executors/ac;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 260
    sget-object v0, Lcom/facebook/common/executors/z;->b:Ljava/lang/Class;

    const-string v1, "Executing %d tasks"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-virtual {p1}, Lcom/google/common/a/es;->size()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-static {v0, v1, v2}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 261
    iget-object v0, p0, Lcom/facebook/common/executors/z;->f:Lcom/facebook/common/executors/a;

    invoke-interface {v0}, Lcom/facebook/common/executors/a;->a()V

    .line 262
    invoke-virtual {p1}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/common/executors/ac;

    .line 263
    invoke-virtual {v0}, Lcom/facebook/common/executors/ac;->run()V

    goto :goto_0

    .line 265
    :cond_0
    return-void
.end method

.method private b(Ljava/lang/Runnable;Ljava/lang/Object;)Lcom/facebook/common/executors/ac;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Runnable;",
            "TT;)",
            "Lcom/facebook/common/executors/ac",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 177
    new-instance v0, Lcom/facebook/common/executors/ac;

    invoke-direct {v0, p1, p2}, Lcom/facebook/common/executors/ac;-><init>(Ljava/lang/Runnable;Ljava/lang/Object;)V

    return-object v0
.end method

.method private b(Ljava/util/concurrent/Callable;)Lcom/facebook/common/executors/ac;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/concurrent/Callable",
            "<TT;>;)",
            "Lcom/facebook/common/executors/ac",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 181
    new-instance v0, Lcom/facebook/common/executors/ac;

    invoke-direct {v0, p1}, Lcom/facebook/common/executors/ac;-><init>(Ljava/util/concurrent/Callable;)V

    return-object v0
.end method

.method private b()V
    .locals 10

    .prologue
    const/4 v9, 0x0

    .line 220
    iget-object v0, p0, Lcom/facebook/common/executors/z;->g:Ljava/util/PriorityQueue;

    invoke-virtual {v0}, Ljava/util/PriorityQueue;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 221
    sget-object v0, Lcom/facebook/common/executors/z;->b:Ljava/lang/Class;

    const-string v1, "No pending tasks, so not setting alarm"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;)V

    .line 230
    :goto_0
    return-void

    .line 224
    :cond_0
    iget-object v0, p0, Lcom/facebook/common/executors/z;->g:Ljava/util/PriorityQueue;

    invoke-virtual {v0}, Ljava/util/PriorityQueue;->peek()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/common/executors/ae;

    iget-wide v0, v0, Lcom/facebook/common/executors/ae;->b:J

    .line 225
    sget-object v2, Lcom/facebook/common/executors/z;->b:Ljava/lang/Class;

    const-string v3, "Next alarm in %d seconds"

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    iget-object v5, p0, Lcom/facebook/common/executors/z;->d:Lcom/facebook/common/time/a;

    invoke-interface {v5}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v5

    sub-long v5, v0, v5

    const-wide/16 v7, 0x3e8

    div-long/2addr v5, v7

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    aput-object v5, v4, v9

    invoke-static {v2, v3, v4}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 226
    new-instance v2, Landroid/content/Intent;

    sget-object v3, Lcom/facebook/common/executors/z;->a:Ljava/lang/String;

    invoke-direct {v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 227
    iget-object v3, p0, Lcom/facebook/common/executors/z;->c:Landroid/content/Context;

    invoke-static {v3, v9, v2, v9}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v2

    .line 229
    iget-object v3, p0, Lcom/facebook/common/executors/z;->e:Landroid/app/AlarmManager;

    invoke-virtual {v3, v9, v0, v1, v2}, Landroid/app/AlarmManager;->set(IJLandroid/app/PendingIntent;)V

    goto :goto_0
.end method

.method private c()Lcom/google/common/a/es;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/common/executors/ac;",
            ">;"
        }
    .end annotation

    .prologue
    .line 236
    sget-object v0, Lcom/facebook/common/executors/z;->b:Ljava/lang/Class;

    const-string v1, "Removing expired tasks from the queue to be executed"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;)V

    .line 237
    invoke-static {}, Lcom/google/common/a/es;->e()Lcom/google/common/a/et;

    move-result-object v1

    .line 238
    :goto_0
    invoke-direct {p0}, Lcom/facebook/common/executors/z;->d()Z

    move-result v0

    if-nez v0, :cond_0

    .line 239
    iget-object v0, p0, Lcom/facebook/common/executors/z;->g:Ljava/util/PriorityQueue;

    invoke-virtual {v0}, Ljava/util/PriorityQueue;->remove()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/common/executors/ae;

    .line 240
    iget-object v0, v0, Lcom/facebook/common/executors/ae;->a:Lcom/facebook/common/executors/ac;

    invoke-virtual {v1, v0}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    goto :goto_0

    .line 242
    :cond_0
    invoke-virtual {v1}, Lcom/google/common/a/et;->b()Lcom/google/common/a/es;

    move-result-object v0

    return-object v0
.end method

.method private d()Z
    .locals 4

    .prologue
    .line 250
    iget-object v0, p0, Lcom/facebook/common/executors/z;->f:Lcom/facebook/common/executors/a;

    invoke-interface {v0}, Lcom/facebook/common/executors/a;->a()V

    .line 251
    iget-object v0, p0, Lcom/facebook/common/executors/z;->g:Ljava/util/PriorityQueue;

    invoke-virtual {v0}, Ljava/util/PriorityQueue;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/facebook/common/executors/z;->g:Ljava/util/PriorityQueue;

    invoke-virtual {v0}, Ljava/util/PriorityQueue;->peek()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/common/executors/ae;

    iget-wide v0, v0, Lcom/facebook/common/executors/ae;->b:J

    iget-object v2, p0, Lcom/facebook/common/executors/z;->d:Lcom/facebook/common/time/a;

    invoke-interface {v2}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-lez v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public a(Ljava/lang/Runnable;)Lcom/facebook/common/executors/ac;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Runnable;",
            ")",
            "Lcom/facebook/common/executors/ac",
            "<*>;"
        }
    .end annotation

    .prologue
    .line 113
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/facebook/common/executors/z;->a(Ljava/lang/Runnable;Ljava/lang/Object;)Lcom/facebook/common/executors/ac;

    move-result-object v0

    return-object v0
.end method

.method public a(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Lcom/facebook/common/executors/ac;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Runnable;",
            "J",
            "Ljava/util/concurrent/TimeUnit;",
            ")",
            "Lcom/facebook/common/executors/ac",
            "<*>;"
        }
    .end annotation

    .prologue
    .line 84
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/facebook/common/executors/z;->b(Ljava/lang/Runnable;Ljava/lang/Object;)Lcom/facebook/common/executors/ac;

    move-result-object v0

    .line 85
    iget-object v1, p0, Lcom/facebook/common/executors/z;->d:Lcom/facebook/common/time/a;

    invoke-interface {v1}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v1

    invoke-virtual {p4, p2, p3}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v3

    add-long/2addr v1, v3

    invoke-direct {p0, v0, v1, v2}, Lcom/facebook/common/executors/z;->a(Lcom/facebook/common/executors/ac;J)V

    .line 86
    return-object v0
.end method

.method public a(Ljava/lang/Runnable;Ljava/lang/Object;)Lcom/facebook/common/executors/ac;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Runnable;",
            "TT;)",
            "Lcom/facebook/common/executors/ac",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 106
    invoke-direct {p0, p1, p2}, Lcom/facebook/common/executors/z;->b(Ljava/lang/Runnable;Ljava/lang/Object;)Lcom/facebook/common/executors/ac;

    move-result-object v0

    .line 107
    iget-object v1, p0, Lcom/facebook/common/executors/z;->d:Lcom/facebook/common/time/a;

    invoke-interface {v1}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v1

    invoke-direct {p0, v0, v1, v2}, Lcom/facebook/common/executors/z;->a(Lcom/facebook/common/executors/ac;J)V

    .line 108
    return-object v0
.end method

.method public a(Ljava/util/concurrent/Callable;)Lcom/facebook/common/executors/ac;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/concurrent/Callable",
            "<TT;>;)",
            "Lcom/facebook/common/executors/ac",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 101
    const-wide/16 v0, 0x0

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p0, p1, v0, v1, v2}, Lcom/facebook/common/executors/z;->a(Ljava/util/concurrent/Callable;JLjava/util/concurrent/TimeUnit;)Lcom/facebook/common/executors/ac;

    move-result-object v0

    return-object v0
.end method

.method public a(Ljava/util/concurrent/Callable;JLjava/util/concurrent/TimeUnit;)Lcom/facebook/common/executors/ac;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/concurrent/Callable",
            "<TV;>;J",
            "Ljava/util/concurrent/TimeUnit;",
            ")",
            "Lcom/facebook/common/executors/ac",
            "<TV;>;"
        }
    .end annotation

    .prologue
    .line 94
    invoke-direct {p0, p1}, Lcom/facebook/common/executors/z;->b(Ljava/util/concurrent/Callable;)Lcom/facebook/common/executors/ac;

    move-result-object v0

    .line 95
    iget-object v1, p0, Lcom/facebook/common/executors/z;->d:Lcom/facebook/common/time/a;

    invoke-interface {v1}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v1

    invoke-virtual {p4, p2, p3}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v3

    add-long/2addr v1, v3

    invoke-direct {p0, v0, v1, v2}, Lcom/facebook/common/executors/z;->a(Lcom/facebook/common/executors/ac;J)V

    .line 96
    return-object v0
.end method

.method public awaitTermination(JLjava/util/concurrent/TimeUnit;)Z
    .locals 1

    .prologue
    .line 161
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public synthetic b(Ljava/lang/Runnable;)Lcom/google/common/d/a/s;
    .locals 1

    .prologue
    .line 51
    invoke-virtual {p0, p1}, Lcom/facebook/common/executors/z;->a(Ljava/lang/Runnable;)Lcom/facebook/common/executors/ac;

    move-result-object v0

    return-object v0
.end method

.method public synthetic c(Ljava/util/concurrent/Callable;)Lcom/google/common/d/a/s;
    .locals 1

    .prologue
    .line 51
    invoke-virtual {p0, p1}, Lcom/facebook/common/executors/z;->a(Ljava/util/concurrent/Callable;)Lcom/facebook/common/executors/ac;

    move-result-object v0

    return-object v0
.end method

.method public execute(Ljava/lang/Runnable;)V
    .locals 0

    .prologue
    .line 118
    invoke-virtual {p0, p1}, Lcom/facebook/common/executors/z;->a(Ljava/lang/Runnable;)Lcom/facebook/common/executors/ac;

    .line 119
    return-void
.end method

.method public isShutdown()Z
    .locals 1

    .prologue
    .line 151
    const/4 v0, 0x0

    return v0
.end method

.method public isTerminated()Z
    .locals 1

    .prologue
    .line 156
    const/4 v0, 0x0

    return v0
.end method

.method protected newTaskFor(Ljava/lang/Runnable;Ljava/lang/Object;)Ljava/util/concurrent/RunnableFuture;
    .locals 1
    .annotation build Landroid/annotation/TargetApi;
        value = 0xb
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Runnable;",
            "TT;)",
            "Ljava/util/concurrent/RunnableFuture",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 167
    new-instance v0, Lcom/facebook/common/executors/ad;

    invoke-direct {v0, p1, p2}, Lcom/facebook/common/executors/ad;-><init>(Ljava/lang/Runnable;Ljava/lang/Object;)V

    return-object v0
.end method

.method protected newTaskFor(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/RunnableFuture;
    .locals 1
    .annotation build Landroid/annotation/TargetApi;
        value = 0xb
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/concurrent/Callable",
            "<TT;>;)",
            "Ljava/util/concurrent/RunnableFuture",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 173
    new-instance v0, Lcom/facebook/common/executors/ad;

    invoke-direct {v0, p1}, Lcom/facebook/common/executors/ad;-><init>(Ljava/util/concurrent/Callable;)V

    return-object v0
.end method

.method public synthetic schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;
    .locals 1

    .prologue
    .line 51
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/facebook/common/executors/z;->a(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Lcom/facebook/common/executors/ac;

    move-result-object v0

    return-object v0
.end method

.method public synthetic schedule(Ljava/util/concurrent/Callable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;
    .locals 1

    .prologue
    .line 51
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/facebook/common/executors/z;->a(Ljava/util/concurrent/Callable;JLjava/util/concurrent/TimeUnit;)Lcom/facebook/common/executors/ac;

    move-result-object v0

    return-object v0
.end method

.method public scheduleAtFixedRate(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Runnable;",
            "JJ",
            "Ljava/util/concurrent/TimeUnit;",
            ")",
            "Ljava/util/concurrent/ScheduledFuture",
            "<*>;"
        }
    .end annotation

    .prologue
    .line 127
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public scheduleWithFixedDelay(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Runnable;",
            "JJ",
            "Ljava/util/concurrent/TimeUnit;",
            ")",
            "Ljava/util/concurrent/ScheduledFuture",
            "<*>;"
        }
    .end annotation

    .prologue
    .line 136
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public shutdown()V
    .locals 1

    .prologue
    .line 141
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public shutdownNow()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Ljava/lang/Runnable;",
            ">;"
        }
    .end annotation

    .prologue
    .line 146
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public synthetic submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    .locals 1

    .prologue
    .line 51
    invoke-virtual {p0, p1}, Lcom/facebook/common/executors/z;->a(Ljava/lang/Runnable;)Lcom/facebook/common/executors/ac;

    move-result-object v0

    return-object v0
.end method

.method public synthetic submit(Ljava/lang/Runnable;Ljava/lang/Object;)Ljava/util/concurrent/Future;
    .locals 1

    .prologue
    .line 51
    invoke-virtual {p0, p1, p2}, Lcom/facebook/common/executors/z;->a(Ljava/lang/Runnable;Ljava/lang/Object;)Lcom/facebook/common/executors/ac;

    move-result-object v0

    return-object v0
.end method

.method public synthetic submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;
    .locals 1

    .prologue
    .line 51
    invoke-virtual {p0, p1}, Lcom/facebook/common/executors/z;->a(Ljava/util/concurrent/Callable;)Lcom/facebook/common/executors/ac;

    move-result-object v0

    return-object v0
.end method
