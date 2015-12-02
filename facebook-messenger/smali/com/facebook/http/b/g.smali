.class public Lcom/facebook/http/b/g;
.super Lorg/apache/http/impl/conn/tsccm/ThreadSafeClientConnManager;
.source "FbClientConnManager.java"


# annotations
.annotation build Ljavax/annotation/concurrent/ThreadSafe;
.end annotation


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

.field private final c:Lcom/facebook/common/time/a;

.field private final d:Lcom/facebook/common/executors/a;

.field private final e:Landroid/os/PowerManager;

.field private final f:Lcom/facebook/common/hardware/n;

.field private final g:Ljava/util/concurrent/ScheduledExecutorService;

.field private final h:Ljava/lang/Runnable;

.field private final i:Lcom/facebook/common/hardware/o;

.field private final j:Lcom/facebook/c/k;

.field private final k:Ljava/lang/Object;

.field private l:Lcom/facebook/http/b/n;

.field private m:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 51
    const-class v0, Lcom/facebook/http/b/g;

    sput-object v0, Lcom/facebook/http/b/g;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lorg/apache/http/params/HttpParams;Lorg/apache/http/conn/scheme/SchemeRegistry;Lcom/facebook/common/time/a;Lcom/facebook/common/executors/a;Landroid/os/PowerManager;Lcom/facebook/common/hardware/n;Ljava/util/concurrent/ScheduledExecutorService;Lcom/facebook/analytics/e/i;)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 176
    invoke-direct {p0, p2, p3}, Lorg/apache/http/impl/conn/tsccm/ThreadSafeClientConnManager;-><init>(Lorg/apache/http/params/HttpParams;Lorg/apache/http/conn/scheme/SchemeRegistry;)V

    .line 177
    iput-object p1, p0, Lcom/facebook/http/b/g;->b:Landroid/content/Context;

    .line 178
    iput-object p4, p0, Lcom/facebook/http/b/g;->c:Lcom/facebook/common/time/a;

    .line 179
    iput-object p5, p0, Lcom/facebook/http/b/g;->d:Lcom/facebook/common/executors/a;

    .line 180
    iput-object p6, p0, Lcom/facebook/http/b/g;->e:Landroid/os/PowerManager;

    .line 181
    iput-object p7, p0, Lcom/facebook/http/b/g;->f:Lcom/facebook/common/hardware/n;

    .line 182
    iput-object p8, p0, Lcom/facebook/http/b/g;->g:Ljava/util/concurrent/ScheduledExecutorService;

    .line 183
    new-instance v0, Lcom/facebook/http/b/i;

    invoke-direct {v0, p0, v3}, Lcom/facebook/http/b/i;-><init>(Lcom/facebook/http/b/g;Lcom/facebook/http/b/h;)V

    iput-object v0, p0, Lcom/facebook/http/b/g;->h:Ljava/lang/Runnable;

    .line 184
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/facebook/http/b/g;->k:Ljava/lang/Object;

    .line 185
    iget-object v0, p0, Lcom/facebook/http/b/g;->f:Lcom/facebook/common/hardware/n;

    const/4 v1, 0x1

    sget-object v2, Lcom/facebook/http/b/g;->a:Ljava/lang/Class;

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/facebook/common/hardware/n;->a(ILjava/lang/String;)Lcom/facebook/common/hardware/o;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/http/b/g;->i:Lcom/facebook/common/hardware/o;

    .line 188
    new-instance v0, Lcom/facebook/c/k;

    const-string v1, "android.intent.action.SCREEN_OFF"

    new-instance v2, Lcom/facebook/http/b/j;

    invoke-direct {v2, p0, v3}, Lcom/facebook/http/b/j;-><init>(Lcom/facebook/http/b/g;Lcom/facebook/http/b/h;)V

    invoke-static {v1, v2}, Lcom/google/common/a/ev;->a(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ev;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/facebook/c/k;-><init>(Ljava/util/Map;)V

    iput-object v0, p0, Lcom/facebook/http/b/g;->j:Lcom/facebook/c/k;

    .line 193
    new-instance v1, Landroid/content/IntentFilter;

    invoke-direct {v1}, Landroid/content/IntentFilter;-><init>()V

    .line 194
    iget-object v0, p0, Lcom/facebook/http/b/g;->j:Lcom/facebook/c/k;

    invoke-virtual {v0}, Lcom/facebook/c/k;->b()Ljava/lang/Iterable;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 195
    invoke-virtual {v1, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    goto :goto_0

    .line 197
    :cond_0
    iget-object v0, p0, Lcom/facebook/http/b/g;->b:Landroid/content/Context;

    iget-object v2, p0, Lcom/facebook/http/b/g;->j:Lcom/facebook/c/k;

    invoke-virtual {v0, v2, v1}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 202
    iget-object v0, p0, Lcom/facebook/http/b/g;->l:Lcom/facebook/http/b/n;

    if-eqz v0, :cond_1

    .line 203
    iget-object v0, p0, Lcom/facebook/http/b/g;->l:Lcom/facebook/http/b/n;

    invoke-virtual {v0, p9}, Lcom/facebook/http/b/n;->a(Lcom/facebook/analytics/e/i;)V

    .line 205
    :cond_1
    return-void
.end method


# virtual methods
.method a()V
    .locals 2
    .annotation build Lcom/google/common/annotations/VisibleForTesting;
    .end annotation

    .prologue
    .line 253
    sget-object v0, Lcom/facebook/http/b/g;->a:Ljava/lang/Class;

    const-string v1, "onScreenOff()"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 254
    invoke-virtual {p0}, Lcom/facebook/http/b/g;->b()V

    .line 255
    return-void
.end method

.method b()V
    .locals 6
    .annotation build Lcom/google/common/annotations/VisibleForTesting;
    .end annotation

    .prologue
    .line 263
    sget-object v0, Lcom/facebook/http/b/g;->a:Ljava/lang/Class;

    const-string v1, "maybeScheduleIdleConnectionsClosure()"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 264
    iget-object v0, p0, Lcom/facebook/http/b/g;->e:Landroid/os/PowerManager;

    invoke-virtual {v0}, Landroid/os/PowerManager;->isScreenOn()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 266
    sget-object v0, Lcom/facebook/http/b/g;->a:Ljava/lang/Class;

    const-string v1, "Not scheduling idle connection closure because screen is on."

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 285
    :goto_0
    return-void

    .line 270
    :cond_0
    iget-object v1, p0, Lcom/facebook/http/b/g;->k:Ljava/lang/Object;

    monitor-enter v1

    .line 274
    :try_start_0
    iget-object v0, p0, Lcom/facebook/http/b/g;->c:Lcom/facebook/common/time/a;

    invoke-interface {v0}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v2

    iget-wide v4, p0, Lcom/facebook/http/b/g;->m:J

    sub-long/2addr v2, v4

    .line 275
    const-wide/16 v4, 0x64

    cmp-long v0, v2, v4

    if-lez v0, :cond_1

    .line 276
    sget-object v0, Lcom/facebook/http/b/g;->a:Ljava/lang/Class;

    const-string v2, "Scheduling idle connection closure."

    invoke-static {v0, v2}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 277
    iget-object v0, p0, Lcom/facebook/http/b/g;->i:Lcom/facebook/common/hardware/o;

    invoke-virtual {v0}, Lcom/facebook/common/hardware/o;->a()V

    .line 278
    iget-object v0, p0, Lcom/facebook/http/b/g;->c:Lcom/facebook/common/time/a;

    invoke-interface {v0}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v2

    iput-wide v2, p0, Lcom/facebook/http/b/g;->m:J

    .line 279
    iget-object v0, p0, Lcom/facebook/http/b/g;->g:Ljava/util/concurrent/ScheduledExecutorService;

    iget-object v2, p0, Lcom/facebook/http/b/g;->h:Ljava/lang/Runnable;

    const-wide/16 v3, 0x5dc

    sget-object v5, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v0, v2, v3, v4, v5}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 284
    :goto_1
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 282
    :cond_1
    :try_start_1
    sget-object v0, Lcom/facebook/http/b/g;->a:Ljava/lang/Class;

    const-string v2, "Not scheduling idle connection closure due to threshold."

    invoke-static {v0, v2}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1
.end method

.method c()V
    .locals 4
    .annotation build Lcom/google/common/annotations/VisibleForTesting;
    .end annotation

    .prologue
    .line 289
    sget-object v0, Lcom/facebook/http/b/g;->a:Ljava/lang/Class;

    const-string v1, "onDeferredCloseIdleConnections()"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 290
    iget-object v0, p0, Lcom/facebook/http/b/g;->d:Lcom/facebook/common/executors/a;

    invoke-interface {v0}, Lcom/facebook/common/executors/a;->b()V

    .line 291
    iget-object v1, p0, Lcom/facebook/http/b/g;->k:Ljava/lang/Object;

    monitor-enter v1

    .line 293
    :try_start_0
    iget-object v0, p0, Lcom/facebook/http/b/g;->e:Landroid/os/PowerManager;

    invoke-virtual {v0}, Landroid/os/PowerManager;->isScreenOn()Z

    move-result v0

    if-nez v0, :cond_0

    .line 294
    const-wide/16 v2, 0x514

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p0, v2, v3, v0}, Lcom/facebook/http/b/g;->closeIdleConnections(JLjava/util/concurrent/TimeUnit;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 297
    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/facebook/http/b/g;->i:Lcom/facebook/common/hardware/o;

    invoke-virtual {v0}, Lcom/facebook/common/hardware/o;->b()V

    .line 299
    monitor-exit v1

    .line 300
    return-void

    .line 297
    :catchall_0
    move-exception v0

    iget-object v2, p0, Lcom/facebook/http/b/g;->i:Lcom/facebook/common/hardware/o;

    invoke-virtual {v2}, Lcom/facebook/common/hardware/o;->b()V

    throw v0

    .line 299
    :catchall_1
    move-exception v0

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    throw v0
.end method

.method protected final createConnectionOperator(Lorg/apache/http/conn/scheme/SchemeRegistry;)Lorg/apache/http/conn/ClientConnectionOperator;
    .locals 2

    .prologue
    .line 212
    new-instance v0, Lcom/facebook/http/b/n;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/facebook/http/b/n;-><init>(Lorg/apache/http/conn/scheme/SchemeRegistry;Lcom/facebook/analytics/e/i;)V

    iput-object v0, p0, Lcom/facebook/http/b/g;->l:Lcom/facebook/http/b/n;

    .line 213
    iget-object v0, p0, Lcom/facebook/http/b/g;->l:Lcom/facebook/http/b/n;

    return-object v0
.end method

.method protected final createConnectionPool(Lorg/apache/http/params/HttpParams;)Lorg/apache/http/impl/conn/tsccm/AbstractConnPool;
    .locals 1

    .prologue
    .line 221
    invoke-super {p0, p1}, Lorg/apache/http/impl/conn/tsccm/ThreadSafeClientConnManager;->createConnectionPool(Lorg/apache/http/params/HttpParams;)Lorg/apache/http/impl/conn/tsccm/AbstractConnPool;

    move-result-object v0

    return-object v0
.end method

.method public releaseConnection(Lorg/apache/http/conn/ManagedClientConnection;JLjava/util/concurrent/TimeUnit;)V
    .locals 2

    .prologue
    .line 234
    sget-object v0, Lcom/facebook/http/b/g;->a:Ljava/lang/Class;

    const-string v1, "releaseConnection()"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 237
    const-wide/16 v0, 0x0

    cmp-long v0, p2, v0

    if-gtz v0, :cond_0

    .line 238
    const-wide/32 p2, 0x1d4c0

    .line 239
    sget-object p4, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 243
    :cond_0
    :try_start_0
    invoke-super {p0, p1, p2, p3, p4}, Lorg/apache/http/impl/conn/tsccm/ThreadSafeClientConnManager;->releaseConnection(Lorg/apache/http/conn/ManagedClientConnection;JLjava/util/concurrent/TimeUnit;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 245
    invoke-virtual {p0}, Lcom/facebook/http/b/g;->b()V

    .line 248
    invoke-virtual {p0}, Lcom/facebook/http/b/g;->closeExpiredConnections()V

    .line 249
    return-void

    .line 245
    :catchall_0
    move-exception v0

    invoke-virtual {p0}, Lcom/facebook/http/b/g;->b()V

    throw v0
.end method
