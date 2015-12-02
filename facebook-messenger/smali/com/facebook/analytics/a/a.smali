.class public Lcom/facebook/analytics/a/a;
.super Ljava/lang/Object;
.source "AnalyticsEventSender.java"


# static fields
.field private static final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field

.field private static final b:Ljava/lang/String;

.field private static final c:Ljava/lang/String;


# instance fields
.field private final d:Landroid/content/Context;

.field private final e:Lcom/facebook/common/time/a;

.field private final f:Ljava/util/concurrent/ScheduledExecutorService;

.field private final g:Lcom/facebook/prefs/shared/d;

.field private final h:Lcom/facebook/common/executors/a;

.field private final i:Lcom/facebook/common/e/h;

.field private final j:Lcom/facebook/common/v/f;

.field private final k:Lcom/facebook/analytics/a/d;

.field private final l:Lcom/facebook/analytics/a/f;

.field private final m:Ljava/lang/Object;

.field private final n:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/facebook/analytics/AnalyticsServiceEvent;",
            ">;"
        }
    .end annotation

    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "mStateSync"
    .end annotation
.end field

.field private o:J
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "mStateSync"
    .end annotation
.end field

.field private p:J
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "mStateSync"
    .end annotation
.end field

.field private q:Z
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "mStateSync"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 50
    const-class v0, Lcom/facebook/analytics/a/a;

    sput-object v0, Lcom/facebook/analytics/a/a;->a:Ljava/lang/Class;

    .line 52
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/facebook/analytics/a/a;->a:Ljava/lang/Class;

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "_BIND_FAILED"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/facebook/analytics/a/a;->b:Ljava/lang/String;

    .line 55
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/facebook/analytics/a/a;->a:Ljava/lang/Class;

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "_REMOTE_EXCEPTION"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/facebook/analytics/a/a;->c:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/facebook/common/time/a;Ljava/util/concurrent/ScheduledExecutorService;Lcom/facebook/prefs/shared/d;Lcom/facebook/common/executors/a;Lcom/facebook/common/e/h;Lcom/facebook/common/v/f;)V
    .locals 4

    .prologue
    const/4 v2, 0x0

    .line 119
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 95
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/facebook/analytics/a/a;->m:Ljava/lang/Object;

    .line 101
    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/facebook/analytics/a/a;->o:J

    .line 110
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/analytics/a/a;->q:Z

    .line 120
    iput-object p1, p0, Lcom/facebook/analytics/a/a;->d:Landroid/content/Context;

    .line 121
    iput-object p2, p0, Lcom/facebook/analytics/a/a;->e:Lcom/facebook/common/time/a;

    .line 122
    iput-object p3, p0, Lcom/facebook/analytics/a/a;->f:Ljava/util/concurrent/ScheduledExecutorService;

    .line 123
    iput-object p4, p0, Lcom/facebook/analytics/a/a;->g:Lcom/facebook/prefs/shared/d;

    .line 124
    iput-object p5, p0, Lcom/facebook/analytics/a/a;->h:Lcom/facebook/common/executors/a;

    .line 125
    iput-object p6, p0, Lcom/facebook/analytics/a/a;->i:Lcom/facebook/common/e/h;

    .line 126
    iput-object p7, p0, Lcom/facebook/analytics/a/a;->j:Lcom/facebook/common/v/f;

    .line 128
    new-instance v0, Lcom/facebook/analytics/a/d;

    invoke-direct {v0, p0, v2}, Lcom/facebook/analytics/a/d;-><init>(Lcom/facebook/analytics/a/a;Lcom/facebook/analytics/a/b;)V

    iput-object v0, p0, Lcom/facebook/analytics/a/a;->k:Lcom/facebook/analytics/a/d;

    .line 129
    new-instance v0, Lcom/facebook/analytics/a/f;

    invoke-direct {v0, p0, v2}, Lcom/facebook/analytics/a/f;-><init>(Lcom/facebook/analytics/a/a;Lcom/facebook/analytics/a/b;)V

    iput-object v0, p0, Lcom/facebook/analytics/a/a;->l:Lcom/facebook/analytics/a/f;

    .line 130
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/analytics/a/a;->n:Ljava/util/List;

    .line 132
    const-wide/16 v0, 0x1388

    iput-wide v0, p0, Lcom/facebook/analytics/a/a;->p:J

    .line 133
    iget-object v0, p0, Lcom/facebook/analytics/a/a;->g:Lcom/facebook/prefs/shared/d;

    iget-object v1, p0, Lcom/facebook/analytics/a/a;->k:Lcom/facebook/analytics/a/d;

    invoke-interface {v0, v1}, Lcom/facebook/prefs/shared/d;->a(Ljava/lang/Runnable;)V

    .line 136
    iget-object v0, p0, Lcom/facebook/analytics/a/a;->e:Lcom/facebook/common/time/a;

    invoke-interface {v0}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/facebook/analytics/a/a;->p:J

    add-long/2addr v0, v2

    iput-wide v0, p0, Lcom/facebook/analytics/a/a;->o:J

    .line 137
    return-void
.end method

.method static synthetic a(Lcom/facebook/analytics/a/a;)V
    .locals 0

    .prologue
    .line 48
    invoke-direct {p0}, Lcom/facebook/analytics/a/a;->h()V

    return-void
.end method

.method static synthetic a(Lcom/facebook/analytics/a/a;Landroid/content/ServiceConnection;)V
    .locals 0

    .prologue
    .line 48
    invoke-direct {p0, p1}, Lcom/facebook/analytics/a/a;->b(Landroid/content/ServiceConnection;)V

    return-void
.end method

.method private a(Landroid/content/ServiceConnection;)Z
    .locals 3

    .prologue
    .line 255
    sget-object v0, Lcom/facebook/analytics/a/a;->a:Ljava/lang/Class;

    const-string v1, "bindService()"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;)V

    .line 256
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/facebook/analytics/a/a;->d:Landroid/content/Context;

    const-class v2, Lcom/facebook/analytics/service/AnalyticsService;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 257
    iget-object v1, p0, Lcom/facebook/analytics/a/a;->d:Landroid/content/Context;

    invoke-static {}, Lcom/facebook/analytics/a/a;->f()I

    move-result v2

    invoke-virtual {v1, v0, p1, v2}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    move-result v0

    return v0
.end method

.method static synthetic b(Lcom/facebook/analytics/a/a;)Lcom/facebook/prefs/shared/d;
    .locals 1

    .prologue
    .line 48
    iget-object v0, p0, Lcom/facebook/analytics/a/a;->g:Lcom/facebook/prefs/shared/d;

    return-object v0
.end method

.method private b(Landroid/content/ServiceConnection;)V
    .locals 2

    .prologue
    .line 261
    sget-object v0, Lcom/facebook/analytics/a/a;->a:Ljava/lang/Class;

    const-string v1, "unbindService()"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;)V

    .line 262
    iget-object v0, p0, Lcom/facebook/analytics/a/a;->d:Landroid/content/Context;

    invoke-virtual {v0, p1}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    .line 263
    return-void
.end method

.method static synthetic e()Ljava/lang/Class;
    .locals 1

    .prologue
    .line 48
    sget-object v0, Lcom/facebook/analytics/a/a;->a:Ljava/lang/Class;

    return-object v0
.end method

.method private static f()I
    .locals 3
    .annotation build Landroid/annotation/TargetApi;
        value = 0xe
    .end annotation

    .prologue
    .line 141
    const/4 v0, 0x5

    .line 142
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0xe

    if-lt v1, v2, :cond_0

    .line 143
    const/16 v0, 0x25

    .line 145
    :cond_0
    return v0
.end method

.method private g()V
    .locals 2

    .prologue
    .line 172
    iget-object v0, p0, Lcom/facebook/analytics/a/a;->e:Lcom/facebook/common/time/a;

    invoke-interface {v0}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/analytics/a/a;->o:J

    .line 173
    return-void
.end method

.method private h()V
    .locals 3

    .prologue
    .line 198
    :try_start_0
    sget-object v0, Lcom/facebook/analytics/a/a;->a:Ljava/lang/Class;

    const-string v1, "send()"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;)V

    .line 199
    iget-object v0, p0, Lcom/facebook/analytics/a/a;->n:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 200
    sget-object v0, Lcom/facebook/analytics/a/a;->a:Ljava/lang/Class;

    const-string v1, "send(): no events in queue. Shutting down thread."

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 217
    iget-object v1, p0, Lcom/facebook/analytics/a/a;->m:Ljava/lang/Object;

    monitor-enter v1

    .line 218
    :try_start_1
    invoke-direct {p0}, Lcom/facebook/analytics/a/a;->g()V

    .line 219
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/analytics/a/a;->q:Z

    .line 220
    monitor-exit v1

    .line 222
    :goto_0
    return-void

    .line 220
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    .line 204
    :cond_0
    :try_start_2
    iget-object v0, p0, Lcom/facebook/analytics/a/a;->h:Lcom/facebook/common/executors/a;

    invoke-interface {v0}, Lcom/facebook/common/executors/a;->b()V

    .line 206
    iget-object v0, p0, Lcom/facebook/analytics/a/a;->j:Lcom/facebook/common/v/f;

    const-wide/16 v1, 0x1388

    invoke-virtual {v0, v1, v2}, Lcom/facebook/common/v/f;->a(J)V

    .line 208
    sget-object v0, Lcom/facebook/analytics/a/a;->a:Ljava/lang/Class;

    const-string v1, "Initializing Service connection."

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;)V

    .line 209
    new-instance v0, Lcom/facebook/analytics/a/e;

    invoke-direct {v0}, Lcom/facebook/analytics/a/e;-><init>()V

    .line 210
    new-instance v1, Lcom/facebook/analytics/a/c;

    invoke-direct {v1, p0, v0}, Lcom/facebook/analytics/a/c;-><init>(Lcom/facebook/analytics/a/a;Landroid/content/ServiceConnection;)V

    .line 211
    invoke-direct {p0, v0}, Lcom/facebook/analytics/a/a;->a(Landroid/content/ServiceConnection;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 212
    invoke-virtual {v0}, Lcom/facebook/analytics/a/e;->a()Lcom/google/common/d/a/s;

    move-result-object v0

    iget-object v2, p0, Lcom/facebook/analytics/a/a;->f:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-static {v0, v1, v2}, Lcom/google/common/d/a/i;->a(Lcom/google/common/d/a/s;Lcom/google/common/d/a/h;Ljava/util/concurrent/Executor;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 217
    :goto_1
    iget-object v1, p0, Lcom/facebook/analytics/a/a;->m:Ljava/lang/Object;

    monitor-enter v1

    .line 218
    :try_start_3
    invoke-direct {p0}, Lcom/facebook/analytics/a/a;->g()V

    .line 219
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/analytics/a/a;->q:Z

    .line 220
    monitor-exit v1

    goto :goto_0

    :catchall_1
    move-exception v0

    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw v0

    .line 214
    :cond_1
    :try_start_4
    iget-object v0, p0, Lcom/facebook/analytics/a/a;->i:Lcom/facebook/common/e/h;

    sget-object v1, Lcom/facebook/analytics/a/a;->b:Ljava/lang/String;

    const-string v2, "Failed to bind to service."

    invoke-interface {v0, v1, v2}, Lcom/facebook/common/e/h;->a(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    goto :goto_1

    .line 217
    :catchall_2
    move-exception v0

    iget-object v1, p0, Lcom/facebook/analytics/a/a;->m:Ljava/lang/Object;

    monitor-enter v1

    .line 218
    :try_start_5
    invoke-direct {p0}, Lcom/facebook/analytics/a/a;->g()V

    .line 219
    const/4 v2, 0x0

    iput-boolean v2, p0, Lcom/facebook/analytics/a/a;->q:Z

    .line 220
    monitor-exit v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    throw v0

    :catchall_3
    move-exception v0

    :try_start_6
    monitor-exit v1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    throw v0
.end method


# virtual methods
.method a()J
    .locals 4
    .annotation build Lcom/google/common/annotations/VisibleForTesting;
    .end annotation

    .prologue
    .line 159
    iget-wide v0, p0, Lcom/facebook/analytics/a/a;->o:J

    iget-wide v2, p0, Lcom/facebook/analytics/a/a;->p:J

    add-long/2addr v0, v2

    return-wide v0
.end method

.method public a(Lcom/facebook/analytics/AnalyticsServiceEvent;)V
    .locals 6

    .prologue
    .line 149
    sget-object v0, Lcom/facebook/analytics/a/a;->a:Ljava/lang/Class;

    const-string v1, "offer()"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;)V

    .line 151
    iget-object v1, p0, Lcom/facebook/analytics/a/a;->m:Ljava/lang/Object;

    monitor-enter v1

    .line 152
    :try_start_0
    iget-object v0, p0, Lcom/facebook/analytics/a/a;->n:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 153
    sget-object v0, Lcom/facebook/analytics/a/a;->a:Ljava/lang/Class;

    const-string v2, "Pending events: %d"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    iget-object v5, p0, Lcom/facebook/analytics/a/a;->n:Ljava/util/List;

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v3, v4

    invoke-static {v0, v2, v3}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 154
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 155
    invoke-virtual {p0}, Lcom/facebook/analytics/a/a;->c()V

    .line 156
    return-void

    .line 154
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method a(Lcom/facebook/analytics/cd;)V
    .locals 6
    .annotation build Lcom/google/common/annotations/VisibleForTesting;
    .end annotation

    .prologue
    .line 231
    sget-object v0, Lcom/facebook/analytics/a/a;->a:Ljava/lang/Class;

    const-string v1, "onReportEvents()"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;)V

    .line 232
    iget-object v0, p0, Lcom/facebook/analytics/a/a;->h:Lcom/facebook/common/executors/a;

    invoke-interface {v0}, Lcom/facebook/common/executors/a;->b()V

    .line 233
    iget-object v0, p0, Lcom/facebook/analytics/a/a;->j:Lcom/facebook/common/v/f;

    const-wide/16 v1, 0x1388

    invoke-virtual {v0, v1, v2}, Lcom/facebook/common/v/f;->a(J)V

    .line 236
    iget-object v1, p0, Lcom/facebook/analytics/a/a;->m:Ljava/lang/Object;

    monitor-enter v1

    .line 237
    :try_start_0
    sget-object v0, Lcom/facebook/analytics/a/a;->a:Ljava/lang/Class;

    const-string v2, "Copying %d events and clearing pending list."

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    iget-object v5, p0, Lcom/facebook/analytics/a/a;->n:Ljava/util/List;

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v3, v4

    invoke-static {v0, v2, v3}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 238
    iget-object v0, p0, Lcom/facebook/analytics/a/a;->n:Ljava/util/List;

    invoke-static {v0}, Lcom/google/common/a/es;->a(Ljava/util/Collection;)Lcom/google/common/a/es;

    move-result-object v2

    .line 239
    iget-object v0, p0, Lcom/facebook/analytics/a/a;->n:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 240
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 243
    :try_start_1
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 244
    const/16 v0, 0x32

    invoke-static {v2, v0}, Lcom/google/common/a/hq;->a(Ljava/util/List;I)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    .line 245
    invoke-interface {p1, v0}, Lcom/facebook/analytics/cd;->a(Ljava/util/List;)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    .line 249
    :catch_0
    move-exception v0

    .line 250
    iget-object v1, p0, Lcom/facebook/analytics/a/a;->i:Lcom/facebook/common/e/h;

    sget-object v2, Lcom/facebook/analytics/a/a;->c:Ljava/lang/String;

    const-string v3, "Failed to send events."

    invoke-interface {v1, v2, v3, v0}, Lcom/facebook/common/e/h;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 252
    :goto_1
    return-void

    .line 240
    :catchall_0
    move-exception v0

    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    .line 248
    :cond_0
    :try_start_3
    sget-object v0, Lcom/facebook/analytics/a/a;->a:Ljava/lang/Class;

    const-string v1, "Reported %d events to service."

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v3, v4

    invoke-static {v0, v1, v3}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_3
    .catch Landroid/os/RemoteException; {:try_start_3 .. :try_end_3} :catch_0

    goto :goto_1
.end method

.method b()J
    .locals 4
    .annotation build Lcom/google/common/annotations/VisibleForTesting;
    .end annotation

    .prologue
    .line 163
    invoke-virtual {p0}, Lcom/facebook/analytics/a/a;->a()J

    move-result-wide v0

    iget-object v2, p0, Lcom/facebook/analytics/a/a;->e:Lcom/facebook/common/time/a;

    invoke-interface {v2}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v2

    sub-long/2addr v0, v2

    .line 164
    const-wide/16 v2, 0x0

    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    return-wide v0
.end method

.method c()V
    .locals 7
    .annotation build Lcom/google/common/annotations/VisibleForTesting;
    .end annotation

    .prologue
    .line 180
    sget-object v0, Lcom/facebook/analytics/a/a;->a:Ljava/lang/Class;

    const-string v1, "maybeSendEvents()"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;)V

    .line 181
    iget-object v1, p0, Lcom/facebook/analytics/a/a;->m:Ljava/lang/Object;

    monitor-enter v1

    .line 182
    :try_start_0
    iget-object v0, p0, Lcom/facebook/analytics/a/a;->n:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_0

    .line 183
    monitor-exit v1

    .line 191
    :goto_0
    return-void

    .line 185
    :cond_0
    iget-boolean v0, p0, Lcom/facebook/analytics/a/a;->q:Z

    if-nez v0, :cond_1

    .line 186
    sget-object v0, Lcom/facebook/analytics/a/a;->a:Ljava/lang/Class;

    const-string v2, "Scheduling send on background thread in %d ms"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    invoke-virtual {p0}, Lcom/facebook/analytics/a/a;->b()J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    aput-object v5, v3, v4

    invoke-static {v0, v2, v3}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 187
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/analytics/a/a;->q:Z

    .line 188
    iget-object v0, p0, Lcom/facebook/analytics/a/a;->f:Ljava/util/concurrent/ScheduledExecutorService;

    iget-object v2, p0, Lcom/facebook/analytics/a/a;->l:Lcom/facebook/analytics/a/f;

    invoke-virtual {p0}, Lcom/facebook/analytics/a/a;->b()J

    move-result-wide v3

    sget-object v5, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v0, v2, v3, v4, v5}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 190
    :cond_1
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method d()V
    .locals 6
    .annotation build Lcom/google/common/annotations/VisibleForTesting;
    .end annotation

    .prologue
    const-wide/16 v3, 0x1388

    .line 359
    iget-object v0, p0, Lcom/facebook/analytics/a/a;->g:Lcom/facebook/prefs/shared/d;

    sget-object v1, Lcom/facebook/prefs/shared/aj;->m:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v0, v1, v3, v4}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;J)J

    move-result-wide v0

    .line 374
    iget-object v2, p0, Lcom/facebook/analytics/a/a;->m:Ljava/lang/Object;

    monitor-enter v2

    .line 375
    cmp-long v3, v0, v3

    if-ltz v3, :cond_0

    .line 376
    const-wide/16 v0, 0x1388

    :try_start_0
    iput-wide v0, p0, Lcom/facebook/analytics/a/a;->p:J

    .line 380
    :goto_0
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 381
    sget-object v0, Lcom/facebook/analytics/a/a;->a:Ljava/lang/Class;

    const-string v1, "onPreferencesChanged(): mSendInterval = %d ms"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    iget-wide v4, p0, Lcom/facebook/analytics/a/a;->p:J

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-static {v0, v1, v2}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 382
    return-void

    .line 378
    :cond_0
    :try_start_1
    iput-wide v0, p0, Lcom/facebook/analytics/a/a;->p:J

    goto :goto_0

    .line 380
    :catchall_0
    move-exception v0

    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method
