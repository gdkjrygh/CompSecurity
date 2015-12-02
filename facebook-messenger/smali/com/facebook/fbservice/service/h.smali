.class public Lcom/facebook/fbservice/service/h;
.super Ljava/lang/Object;
.source "BlueServiceQueue.java"


# annotations
.annotation build Ljavax/annotation/concurrent/ThreadSafe;
.end annotation


# static fields
.field static final a:Lcom/facebook/prefs/shared/ae;

.field private static final b:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# instance fields
.field private final c:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<+",
            "Ljava/lang/annotation/Annotation;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/fbservice/service/e;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/util/Set",
            "<",
            "Lcom/facebook/fbservice/service/n;",
            ">;>;"
        }
    .end annotation
.end field

.field private final f:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/common/executors/i;",
            ">;"
        }
    .end annotation
.end field

.field private final g:Lcom/facebook/fbservice/service/o;

.field private final h:Lcom/facebook/auth/viewercontext/e;

.field private final i:Lcom/facebook/common/e/h;

.field private final j:Lcom/facebook/prefs/shared/d;

.field private final k:Lcom/facebook/analytics/av;

.field private final l:Lcom/facebook/common/time/a;

.field private final m:Ljava/util/LinkedList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedList",
            "<",
            "Lcom/facebook/fbservice/service/ac;",
            ">;"
        }
    .end annotation

    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation
.end field

.field private final n:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Lcom/facebook/fbservice/service/m;",
            ">;"
        }
    .end annotation

    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation
.end field

.field private final o:Ljava/util/LinkedList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedList",
            "<",
            "Lcom/facebook/fbservice/service/ac;",
            ">;"
        }
    .end annotation

    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation
.end field

.field private final p:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private q:Lcom/facebook/common/executors/i;

.field private r:Lcom/facebook/fbservice/service/m;

.field private s:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 53
    const-class v0, Lcom/facebook/fbservice/service/h;

    sput-object v0, Lcom/facebook/fbservice/service/h;->b:Ljava/lang/Class;

    .line 59
    const-string v0, "android_soft_error_on_orca_service_exceptions"

    invoke-static {v0}, Lcom/facebook/f/n;->a(Ljava/lang/String;)Lcom/facebook/prefs/shared/ae;

    move-result-object v0

    sput-object v0, Lcom/facebook/fbservice/service/h;->a:Lcom/facebook/prefs/shared/ae;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Class;Ljavax/inject/a;Ljavax/inject/a;Ljavax/inject/a;Lcom/facebook/fbservice/service/o;Lcom/facebook/auth/viewercontext/e;Lcom/facebook/common/e/h;Lcom/facebook/prefs/shared/d;Lcom/facebook/analytics/av;Lcom/facebook/common/time/a;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<+",
            "Ljava/lang/annotation/Annotation;",
            ">;",
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/fbservice/service/e;",
            ">;",
            "Ljavax/inject/a",
            "<",
            "Ljava/util/Set",
            "<",
            "Lcom/facebook/fbservice/service/n;",
            ">;>;",
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/common/executors/i;",
            ">;",
            "Lcom/facebook/fbservice/service/o;",
            "Lcom/facebook/auth/viewercontext/e;",
            "Lcom/facebook/common/e/h;",
            "Lcom/facebook/prefs/shared/d;",
            "Lcom/facebook/analytics/av;",
            "Lcom/facebook/common/time/a;",
            ")V"
        }
    .end annotation

    .prologue
    const/4 v1, 0x0

    .line 120
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 101
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lcom/facebook/fbservice/service/h;->p:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 108
    iput-boolean v1, p0, Lcom/facebook/fbservice/service/h;->s:Z

    .line 121
    invoke-static {}, Lcom/google/common/a/hq;->b()Ljava/util/LinkedList;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/fbservice/service/h;->m:Ljava/util/LinkedList;

    .line 122
    invoke-static {}, Lcom/google/common/a/hq;->b()Ljava/util/LinkedList;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/fbservice/service/h;->o:Ljava/util/LinkedList;

    .line 123
    invoke-static {}, Lcom/google/common/a/ik;->a()Ljava/util/HashMap;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/fbservice/service/h;->n:Ljava/util/Map;

    .line 124
    iput-object p1, p0, Lcom/facebook/fbservice/service/h;->c:Ljava/lang/Class;

    .line 125
    iput-object p2, p0, Lcom/facebook/fbservice/service/h;->d:Ljavax/inject/a;

    .line 126
    iput-object p3, p0, Lcom/facebook/fbservice/service/h;->e:Ljavax/inject/a;

    .line 127
    iput-object p4, p0, Lcom/facebook/fbservice/service/h;->f:Ljavax/inject/a;

    .line 128
    iput-object p5, p0, Lcom/facebook/fbservice/service/h;->g:Lcom/facebook/fbservice/service/o;

    .line 129
    iput-object p6, p0, Lcom/facebook/fbservice/service/h;->h:Lcom/facebook/auth/viewercontext/e;

    .line 130
    iput-object p7, p0, Lcom/facebook/fbservice/service/h;->i:Lcom/facebook/common/e/h;

    .line 131
    iput-object p8, p0, Lcom/facebook/fbservice/service/h;->j:Lcom/facebook/prefs/shared/d;

    .line 132
    iput-object p9, p0, Lcom/facebook/fbservice/service/h;->k:Lcom/facebook/analytics/av;

    .line 133
    iput-object p10, p0, Lcom/facebook/fbservice/service/h;->l:Lcom/facebook/common/time/a;

    .line 134
    return-void
.end method

.method static synthetic a(Lcom/facebook/fbservice/service/h;)Lcom/facebook/common/executors/i;
    .locals 1

    .prologue
    .line 51
    iget-object v0, p0, Lcom/facebook/fbservice/service/h;->q:Lcom/facebook/common/executors/i;

    return-object v0
.end method

.method static synthetic a(Lcom/facebook/fbservice/service/h;Lcom/facebook/fbservice/service/m;)Lcom/facebook/fbservice/service/m;
    .locals 0

    .prologue
    .line 51
    iput-object p1, p0, Lcom/facebook/fbservice/service/h;->r:Lcom/facebook/fbservice/service/m;

    return-object p1
.end method

.method private a(J)V
    .locals 3

    .prologue
    .line 188
    iget-object v0, p0, Lcom/facebook/fbservice/service/h;->q:Lcom/facebook/common/executors/i;

    new-instance v1, Lcom/facebook/fbservice/service/k;

    invoke-direct {v1, p0}, Lcom/facebook/fbservice/service/k;-><init>(Lcom/facebook/fbservice/service/h;)V

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v0, v1, p1, p2, v2}, Lcom/facebook/common/executors/i;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 194
    return-void
.end method

.method static synthetic a(Lcom/facebook/fbservice/service/h;J)V
    .locals 0

    .prologue
    .line 51
    invoke-direct {p0, p1, p2}, Lcom/facebook/fbservice/service/h;->a(J)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/fbservice/service/h;Lcom/facebook/fbservice/service/m;Lcom/facebook/fbservice/service/OperationResult;)V
    .locals 0

    .prologue
    .line 51
    invoke-direct {p0, p1, p2}, Lcom/facebook/fbservice/service/h;->b(Lcom/facebook/fbservice/service/m;Lcom/facebook/fbservice/service/OperationResult;)V

    return-void
.end method

.method private declared-synchronized a(Lcom/facebook/fbservice/service/m;Lcom/facebook/fbservice/service/OperationResult;)V
    .locals 3

    .prologue
    .line 365
    monitor-enter p0

    :try_start_0
    invoke-static {p1, p2}, Lcom/facebook/fbservice/service/m;->a(Lcom/facebook/fbservice/service/m;Lcom/facebook/fbservice/service/OperationResult;)Lcom/facebook/fbservice/service/OperationResult;

    .line 366
    iget-object v0, p0, Lcom/facebook/fbservice/service/h;->l:Lcom/facebook/common/time/a;

    invoke-interface {v0}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v0

    invoke-static {p1, v0, v1}, Lcom/facebook/fbservice/service/m;->b(Lcom/facebook/fbservice/service/m;J)J

    .line 367
    iget-object v0, p0, Lcom/facebook/fbservice/service/h;->o:Ljava/util/LinkedList;

    invoke-static {p1}, Lcom/facebook/fbservice/service/m;->d(Lcom/facebook/fbservice/service/m;)Lcom/facebook/fbservice/service/ac;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 368
    invoke-static {p1}, Lcom/facebook/fbservice/service/m;->e(Lcom/facebook/fbservice/service/m;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/fbservice/service/z;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 370
    :try_start_1
    invoke-static {p1}, Lcom/facebook/fbservice/service/m;->f(Lcom/facebook/fbservice/service/m;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v2

    invoke-interface {v0, v2}, Lcom/facebook/fbservice/service/z;->b(Lcom/facebook/fbservice/service/OperationResult;)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 371
    :catch_0
    move-exception v0

    goto :goto_0

    .line 375
    :cond_0
    const/4 v0, 0x0

    :try_start_2
    invoke-static {p1, v0}, Lcom/facebook/fbservice/service/m;->a(Lcom/facebook/fbservice/service/m;Ljava/util/List;)Ljava/util/List;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 376
    monitor-exit p0

    return-void

    .line 365
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method private a(Lcom/facebook/fbservice/service/m;Lcom/google/common/d/a/s;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/fbservice/service/m;",
            "Lcom/google/common/d/a/s",
            "<",
            "Lcom/facebook/fbservice/service/OperationResult;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 331
    invoke-static {p1, p2}, Lcom/facebook/fbservice/service/m;->a(Lcom/facebook/fbservice/service/m;Lcom/google/common/d/a/s;)Lcom/google/common/d/a/s;

    .line 332
    iput-object p1, p0, Lcom/facebook/fbservice/service/h;->r:Lcom/facebook/fbservice/service/m;

    .line 333
    invoke-static {p1}, Lcom/facebook/fbservice/service/m;->a(Lcom/facebook/fbservice/service/m;)Lcom/google/common/d/a/s;

    move-result-object v0

    new-instance v1, Lcom/facebook/fbservice/service/l;

    invoke-direct {v1, p0, p1}, Lcom/facebook/fbservice/service/l;-><init>(Lcom/facebook/fbservice/service/h;Lcom/facebook/fbservice/service/m;)V

    iget-object v2, p0, Lcom/facebook/fbservice/service/h;->q:Lcom/facebook/common/executors/i;

    invoke-static {v0, v1, v2}, Lcom/google/common/d/a/i;->a(Lcom/google/common/d/a/s;Lcom/google/common/d/a/h;Ljava/util/concurrent/Executor;)V

    .line 353
    return-void
.end method

.method static synthetic b(Lcom/facebook/fbservice/service/h;)Lcom/facebook/fbservice/service/m;
    .locals 1

    .prologue
    .line 51
    iget-object v0, p0, Lcom/facebook/fbservice/service/h;->r:Lcom/facebook/fbservice/service/m;

    return-object v0
.end method

.method static synthetic b(Lcom/facebook/fbservice/service/h;Lcom/facebook/fbservice/service/m;Lcom/facebook/fbservice/service/OperationResult;)V
    .locals 0

    .prologue
    .line 51
    invoke-direct {p0, p1, p2}, Lcom/facebook/fbservice/service/h;->a(Lcom/facebook/fbservice/service/m;Lcom/facebook/fbservice/service/OperationResult;)V

    return-void
.end method

.method private declared-synchronized b(Lcom/facebook/fbservice/service/m;Lcom/facebook/fbservice/service/OperationResult;)V
    .locals 2

    .prologue
    .line 381
    monitor-enter p0

    :try_start_0
    invoke-static {p1}, Lcom/facebook/fbservice/service/m;->e(Lcom/facebook/fbservice/service/m;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 382
    invoke-static {p1}, Lcom/facebook/fbservice/service/m;->e(Lcom/facebook/fbservice/service/m;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/fbservice/service/z;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 384
    :try_start_1
    invoke-interface {v0, p2}, Lcom/facebook/fbservice/service/z;->a(Lcom/facebook/fbservice/service/OperationResult;)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 385
    :catch_0
    move-exception v0

    goto :goto_0

    .line 390
    :cond_0
    monitor-exit p0

    return-void

    .line 381
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method static synthetic c(Lcom/facebook/fbservice/service/h;)Lcom/facebook/fbservice/service/o;
    .locals 1

    .prologue
    .line 51
    iget-object v0, p0, Lcom/facebook/fbservice/service/h;->g:Lcom/facebook/fbservice/service/o;

    return-object v0
.end method

.method private d()V
    .locals 12

    .prologue
    const-wide/16 v10, 0x0

    const/4 v9, 0x3

    .line 200
    :goto_0
    iget-object v1, p0, Lcom/facebook/fbservice/service/h;->r:Lcom/facebook/fbservice/service/m;

    if-nez v1, :cond_1

    .line 203
    monitor-enter p0

    .line 204
    :try_start_0
    iget-object v1, p0, Lcom/facebook/fbservice/service/h;->m:Ljava/util/LinkedList;

    invoke-virtual {v1}, Ljava/util/LinkedList;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 205
    iget-boolean v1, p0, Lcom/facebook/fbservice/service/h;->s:Z

    if-nez v1, :cond_0

    .line 206
    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/facebook/fbservice/service/h;->s:Z

    .line 208
    iget-object v1, p0, Lcom/facebook/fbservice/service/h;->e:Ljavax/inject/a;

    invoke-interface {v1}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Set;

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/fbservice/service/n;

    .line 209
    iget-object v3, p0, Lcom/facebook/fbservice/service/h;->c:Ljava/lang/Class;

    invoke-interface {v1, v3}, Lcom/facebook/fbservice/service/n;->a(Ljava/lang/Class;)V

    goto :goto_1

    .line 223
    :catchall_0
    move-exception v1

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    .line 212
    :cond_0
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 277
    :cond_1
    invoke-direct {p0}, Lcom/facebook/fbservice/service/h;->e()V

    .line 278
    return-void

    .line 214
    :cond_2
    const/4 v1, 0x0

    :try_start_2
    iput-boolean v1, p0, Lcom/facebook/fbservice/service/h;->s:Z

    .line 216
    iget-object v1, p0, Lcom/facebook/fbservice/service/h;->m:Ljava/util/LinkedList;

    invoke-virtual {v1}, Ljava/util/LinkedList;->removeFirst()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/fbservice/service/ac;

    .line 217
    iget-object v2, p0, Lcom/facebook/fbservice/service/h;->n:Ljava/util/Map;

    invoke-virtual {v1}, Lcom/facebook/fbservice/service/ac;->b()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/fbservice/service/m;

    .line 218
    if-nez v2, :cond_3

    .line 219
    sget-object v1, Lcom/facebook/fbservice/service/h;->b:Ljava/lang/Class;

    const-string v2, "No holder for queued operation!"

    invoke-static {v1, v2}, Lcom/facebook/debug/log/b;->d(Ljava/lang/Class;Ljava/lang/String;)V

    .line 220
    monitor-exit p0

    goto :goto_0

    .line 222
    :cond_3
    iget-object v3, p0, Lcom/facebook/fbservice/service/h;->l:Lcom/facebook/common/time/a;

    invoke-interface {v3}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v3

    invoke-static {v2, v3, v4}, Lcom/facebook/fbservice/service/m;->a(Lcom/facebook/fbservice/service/m;J)J

    .line 223
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 225
    const-wide/16 v3, 0x5

    invoke-static {v3, v4}, Lcom/facebook/debug/d/e;->b(J)V

    .line 226
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "BlueService ("

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v1}, Lcom/facebook/fbservice/service/ac;->a()Lcom/facebook/fbservice/service/OperationType;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, ")"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/facebook/debug/d/e;->a(Ljava/lang/String;)Lcom/facebook/debug/d/e;

    move-result-object v5

    .line 228
    :try_start_3
    iget-object v3, p0, Lcom/facebook/fbservice/service/h;->p:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v3

    if-eqz v3, :cond_4

    .line 230
    new-instance v3, Ljava/lang/Exception;

    const-string v4, "Queue stopped"

    invoke-direct {v3, v4}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v3
    :try_end_3
    .catch Ljava/lang/Throwable; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 258
    :catch_0
    move-exception v3

    .line 259
    :try_start_4
    sget-object v4, Lcom/facebook/fbservice/service/h;->b:Ljava/lang/Class;

    const-string v6, "Exception during service"

    invoke-static {v4, v6, v3}, Lcom/facebook/debug/log/b;->d(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 260
    invoke-virtual {v1}, Lcom/facebook/fbservice/service/ac;->a()Lcom/facebook/fbservice/service/OperationType;

    move-result-object v1

    invoke-virtual {p0, v3, v1}, Lcom/facebook/fbservice/service/h;->a(Ljava/lang/Throwable;Lcom/facebook/fbservice/service/OperationType;)V

    .line 261
    invoke-static {v3}, Lcom/facebook/fbservice/service/u;->a(Ljava/lang/Throwable;)Lcom/facebook/fbservice/service/t;

    move-result-object v1

    invoke-static {v3}, Lcom/facebook/fbservice/service/u;->b(Ljava/lang/Throwable;)Landroid/os/Bundle;

    move-result-object v3

    invoke-static {v1, v3}, Lcom/facebook/fbservice/service/OperationResult;->a(Lcom/facebook/fbservice/service/t;Landroid/os/Bundle;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v1

    .line 265
    invoke-direct {p0, v2, v1}, Lcom/facebook/fbservice/service/h;->a(Lcom/facebook/fbservice/service/m;Lcom/facebook/fbservice/service/OperationResult;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 267
    invoke-virtual {v5, v10, v11}, Lcom/facebook/debug/d/e;->a(J)J

    .line 268
    invoke-static {v9}, Lcom/facebook/debug/log/b;->b(I)Z

    move-result v1

    if-eqz v1, :cond_a

    .line 269
    sget-object v1, Lcom/facebook/fbservice/service/h;->b:Ljava/lang/Class;

    invoke-static {v1}, Lcom/facebook/debug/d/e;->a(Ljava/lang/Class;)V

    goto/16 :goto_0

    .line 235
    :cond_4
    :try_start_5
    invoke-virtual {v1}, Lcom/facebook/fbservice/service/ac;->c()Landroid/os/Bundle;

    move-result-object v3

    const-string v4, "overridden_viewer_context"

    invoke-virtual {v3, v4}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v3

    check-cast v3, Lcom/facebook/auth/viewercontext/ViewerContext;

    .line 237
    if-eqz v3, :cond_5

    .line 238
    iget-object v4, p0, Lcom/facebook/fbservice/service/h;->h:Lcom/facebook/auth/viewercontext/e;

    invoke-interface {v4, v3}, Lcom/facebook/auth/viewercontext/e;->b(Lcom/facebook/auth/viewercontext/ViewerContext;)V
    :try_end_5
    .catch Ljava/lang/Throwable; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 242
    :cond_5
    :try_start_6
    new-instance v6, Lcom/facebook/fbservice/service/ad;

    invoke-virtual {v1}, Lcom/facebook/fbservice/service/ac;->a()Lcom/facebook/fbservice/service/OperationType;

    move-result-object v4

    invoke-virtual {v1}, Lcom/facebook/fbservice/service/ac;->c()Landroid/os/Bundle;

    move-result-object v7

    invoke-static {v2}, Lcom/facebook/fbservice/service/m;->b(Lcom/facebook/fbservice/service/m;)Lcom/facebook/fbservice/service/g;

    move-result-object v8

    invoke-direct {v6, v4, v7, v8}, Lcom/facebook/fbservice/service/ad;-><init>(Lcom/facebook/fbservice/service/OperationType;Landroid/os/Bundle;Lcom/facebook/fbservice/service/g;)V

    .line 244
    iget-object v4, p0, Lcom/facebook/fbservice/service/h;->d:Ljavax/inject/a;

    invoke-interface {v4}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/facebook/fbservice/service/e;

    .line 245
    invoke-interface {v4, v6}, Lcom/facebook/fbservice/service/e;->a(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    move-result-object v4

    .line 247
    if-eqz v3, :cond_6

    .line 248
    :try_start_7
    iget-object v3, p0, Lcom/facebook/fbservice/service/h;->h:Lcom/facebook/auth/viewercontext/e;

    invoke-interface {v3}, Lcom/facebook/auth/viewercontext/e;->d()V

    .line 252
    :cond_6
    instance-of v3, v4, Lcom/facebook/fbservice/service/FutureOperationResult;

    if-eqz v3, :cond_8

    .line 253
    move-object v0, v4

    check-cast v0, Lcom/facebook/fbservice/service/FutureOperationResult;

    move-object v3, v0

    .line 254
    invoke-virtual {v3}, Lcom/facebook/fbservice/service/FutureOperationResult;->a()Lcom/google/common/d/a/s;

    move-result-object v3

    invoke-direct {p0, v2, v3}, Lcom/facebook/fbservice/service/h;->a(Lcom/facebook/fbservice/service/m;Lcom/google/common/d/a/s;)V
    :try_end_7
    .catch Ljava/lang/Throwable; {:try_start_7 .. :try_end_7} :catch_0
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 267
    :goto_2
    invoke-virtual {v5, v10, v11}, Lcom/facebook/debug/d/e;->a(J)J

    .line 268
    invoke-static {v9}, Lcom/facebook/debug/log/b;->b(I)Z

    move-result v1

    if-eqz v1, :cond_9

    .line 269
    sget-object v1, Lcom/facebook/fbservice/service/h;->b:Ljava/lang/Class;

    invoke-static {v1}, Lcom/facebook/debug/d/e;->a(Ljava/lang/Class;)V

    goto/16 :goto_0

    .line 247
    :catchall_1
    move-exception v4

    if-eqz v3, :cond_7

    .line 248
    :try_start_8
    iget-object v3, p0, Lcom/facebook/fbservice/service/h;->h:Lcom/facebook/auth/viewercontext/e;

    invoke-interface {v3}, Lcom/facebook/auth/viewercontext/e;->d()V

    :cond_7
    throw v4
    :try_end_8
    .catch Ljava/lang/Throwable; {:try_start_8 .. :try_end_8} :catch_0
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    .line 267
    :catchall_2
    move-exception v1

    invoke-virtual {v5, v10, v11}, Lcom/facebook/debug/d/e;->a(J)J

    .line 268
    invoke-static {v9}, Lcom/facebook/debug/log/b;->b(I)Z

    move-result v2

    if-eqz v2, :cond_b

    .line 269
    sget-object v2, Lcom/facebook/fbservice/service/h;->b:Ljava/lang/Class;

    invoke-static {v2}, Lcom/facebook/debug/d/e;->a(Ljava/lang/Class;)V

    .line 271
    :goto_3
    throw v1

    .line 256
    :cond_8
    :try_start_9
    invoke-direct {p0, v2, v4}, Lcom/facebook/fbservice/service/h;->a(Lcom/facebook/fbservice/service/m;Lcom/facebook/fbservice/service/OperationResult;)V
    :try_end_9
    .catch Ljava/lang/Throwable; {:try_start_9 .. :try_end_9} :catch_0
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    goto :goto_2

    .line 271
    :cond_9
    invoke-static {}, Lcom/facebook/debug/d/e;->b()V

    goto/16 :goto_0

    :cond_a
    invoke-static {}, Lcom/facebook/debug/d/e;->b()V

    goto/16 :goto_0

    :cond_b
    invoke-static {}, Lcom/facebook/debug/d/e;->b()V

    goto :goto_3
.end method

.method static synthetic d(Lcom/facebook/fbservice/service/h;)V
    .locals 0

    .prologue
    .line 51
    invoke-direct {p0}, Lcom/facebook/fbservice/service/h;->d()V

    return-void
.end method

.method private declared-synchronized e()V
    .locals 9

    .prologue
    .line 305
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/fbservice/service/h;->l:Lcom/facebook/common/time/a;

    invoke-interface {v0}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v2

    .line 306
    iget-object v0, p0, Lcom/facebook/fbservice/service/h;->o:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    .line 307
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 308
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/fbservice/service/ac;

    .line 309
    iget-object v1, p0, Lcom/facebook/fbservice/service/h;->n:Ljava/util/Map;

    invoke-virtual {v0}, Lcom/facebook/fbservice/service/ac;->b()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v1, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/fbservice/service/m;

    .line 310
    if-nez v1, :cond_0

    .line 311
    sget-object v5, Lcom/facebook/fbservice/service/h;->b:Ljava/lang/Class;

    const-string v6, "No holder for recently completed operation!"

    invoke-static {v5, v6}, Lcom/facebook/debug/log/b;->d(Ljava/lang/Class;Ljava/lang/String;)V

    .line 312
    invoke-interface {v4}, Ljava/util/Iterator;->remove()V

    .line 314
    :cond_0
    invoke-static {v1}, Lcom/facebook/fbservice/service/m;->c(Lcom/facebook/fbservice/service/m;)J

    move-result-wide v5

    sub-long v5, v2, v5

    const-wide/16 v7, 0x7530

    cmp-long v1, v5, v7

    if-lez v1, :cond_1

    .line 315
    iget-object v1, p0, Lcom/facebook/fbservice/service/h;->n:Ljava/util/Map;

    invoke-virtual {v0}, Lcom/facebook/fbservice/service/ac;->b()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 316
    invoke-interface {v4}, Ljava/util/Iterator;->remove()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 305
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 323
    :cond_1
    :try_start_1
    iget-object v0, p0, Lcom/facebook/fbservice/service/h;->o:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 324
    const-wide/16 v0, 0x3a98

    invoke-direct {p0, v0, v1}, Lcom/facebook/fbservice/service/h;->a(J)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 326
    :cond_2
    monitor-exit p0

    return-void
.end method


# virtual methods
.method a()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class",
            "<+",
            "Ljava/lang/annotation/Annotation;",
            ">;"
        }
    .end annotation

    .prologue
    .line 137
    iget-object v0, p0, Lcom/facebook/fbservice/service/h;->c:Ljava/lang/Class;

    return-object v0
.end method

.method a(Lcom/facebook/fbservice/service/ac;)V
    .locals 3

    .prologue
    .line 168
    iget-object v0, p0, Lcom/facebook/fbservice/service/h;->p:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    const-string v1, "Cannot add an operation after queue was stopped"

    invoke-static {v0, v1}, Lcom/google/common/base/Preconditions;->checkState(ZLjava/lang/Object;)V

    .line 170
    monitor-enter p0

    .line 171
    :try_start_0
    new-instance v0, Lcom/facebook/fbservice/service/m;

    iget-object v1, p0, Lcom/facebook/fbservice/service/h;->l:Lcom/facebook/common/time/a;

    invoke-interface {v1}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v1

    invoke-direct {v0, p1, v1, v2}, Lcom/facebook/fbservice/service/m;-><init>(Lcom/facebook/fbservice/service/ac;J)V

    .line 172
    new-instance v1, Lcom/facebook/fbservice/service/j;

    invoke-direct {v1, p0, v0}, Lcom/facebook/fbservice/service/j;-><init>(Lcom/facebook/fbservice/service/h;Lcom/facebook/fbservice/service/m;)V

    invoke-static {v0, v1}, Lcom/facebook/fbservice/service/m;->a(Lcom/facebook/fbservice/service/m;Lcom/facebook/fbservice/service/g;)Lcom/facebook/fbservice/service/g;

    .line 178
    iget-object v1, p0, Lcom/facebook/fbservice/service/h;->m:Ljava/util/LinkedList;

    invoke-virtual {v1, p1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 179
    iget-object v1, p0, Lcom/facebook/fbservice/service/h;->n:Ljava/util/Map;

    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ac;->b()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 180
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 181
    iget-object v0, p0, Lcom/facebook/fbservice/service/h;->e:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/fbservice/service/n;

    .line 182
    iget-object v2, p0, Lcom/facebook/fbservice/service/h;->c:Ljava/lang/Class;

    invoke-interface {v0, v2, p1}, Lcom/facebook/fbservice/service/n;->a(Ljava/lang/Class;Lcom/facebook/fbservice/service/ac;)V

    goto :goto_1

    .line 168
    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    .line 180
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    .line 184
    :cond_1
    const-wide/16 v0, 0x0

    invoke-direct {p0, v0, v1}, Lcom/facebook/fbservice/service/h;->a(J)V

    .line 185
    return-void
.end method

.method a(Ljava/lang/Throwable;Lcom/facebook/fbservice/service/OperationType;)V
    .locals 3
    .param p2    # Lcom/facebook/fbservice/service/OperationType;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Lcom/google/common/annotations/VisibleForTesting;
    .end annotation

    .prologue
    .line 282
    iget-object v0, p0, Lcom/facebook/fbservice/service/h;->j:Lcom/facebook/prefs/shared/d;

    sget-object v1, Lcom/facebook/fbservice/service/h;->a:Lcom/facebook/prefs/shared/ae;

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;Z)Z

    move-result v0

    if-nez v0, :cond_0

    .line 299
    :goto_0
    return-void

    .line 285
    :cond_0
    instance-of v0, p1, Ljava/io/IOException;

    if-eqz v0, :cond_2

    .line 288
    new-instance v0, Lcom/facebook/analytics/cb;

    const-string v1, "orca_service_exception"

    invoke-direct {v0, v1}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    const-string v1, "type"

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v0

    const-string v1, "msg"

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v0

    .line 291
    if-eqz p2, :cond_1

    .line 292
    const-string v1, "operation"

    invoke-virtual {p2}, Lcom/facebook/fbservice/service/OperationType;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    .line 294
    :cond_1
    iget-object v1, p0, Lcom/facebook/fbservice/service/h;->k:Lcom/facebook/analytics/av;

    invoke-interface {v1, v0}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    goto :goto_0

    .line 297
    :cond_2
    iget-object v0, p0, Lcom/facebook/fbservice/service/h;->i:Lcom/facebook/common/e/h;

    const-string v1, "BlueServiceQueue"

    const-string v2, "Failed BlueService operation"

    invoke-interface {v0, v1, v2, p1}, Lcom/facebook/common/e/h;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method declared-synchronized a(Ljava/lang/String;)Z
    .locals 1

    .prologue
    .line 393
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/fbservice/service/h;->n:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method a(Ljava/lang/String;Lcom/facebook/fbservice/service/z;)Z
    .locals 3

    .prologue
    .line 405
    const/4 v1, 0x0

    .line 406
    monitor-enter p0

    .line 407
    :try_start_0
    iget-object v0, p0, Lcom/facebook/fbservice/service/h;->n:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/fbservice/service/m;

    .line 408
    if-nez v0, :cond_0

    .line 409
    const/4 v0, 0x0

    monitor-exit p0

    .line 429
    :goto_0
    return v0

    .line 412
    :cond_0
    invoke-static {v0}, Lcom/facebook/fbservice/service/m;->f(Lcom/facebook/fbservice/service/m;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v2

    if-eqz v2, :cond_2

    .line 414
    invoke-static {v0}, Lcom/facebook/fbservice/service/m;->f(Lcom/facebook/fbservice/service/m;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    .line 418
    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 420
    if-eqz v0, :cond_1

    .line 423
    :try_start_1
    invoke-interface {p2, v0}, Lcom/facebook/fbservice/service/z;->b(Lcom/facebook/fbservice/service/OperationResult;)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0

    .line 429
    :cond_1
    :goto_2
    const/4 v0, 0x1

    goto :goto_0

    .line 416
    :cond_2
    :try_start_2
    invoke-static {v0}, Lcom/facebook/fbservice/service/m;->e(Lcom/facebook/fbservice/service/m;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-object v0, v1

    goto :goto_1

    .line 418
    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    .line 424
    :catch_0
    move-exception v0

    goto :goto_2
.end method

.method b()V
    .locals 2

    .prologue
    .line 141
    iget-object v0, p0, Lcom/facebook/fbservice/service/h;->p:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    const-string v1, "Queue cannot be started after stopped"

    invoke-static {v0, v1}, Lcom/google/common/base/Preconditions;->checkState(ZLjava/lang/Object;)V

    .line 142
    iget-object v0, p0, Lcom/facebook/fbservice/service/h;->f:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/common/executors/i;

    iput-object v0, p0, Lcom/facebook/fbservice/service/h;->q:Lcom/facebook/common/executors/i;

    .line 143
    iget-object v0, p0, Lcom/facebook/fbservice/service/h;->g:Lcom/facebook/fbservice/service/o;

    invoke-virtual {v0, p0}, Lcom/facebook/fbservice/service/o;->a(Lcom/facebook/fbservice/service/h;)V

    .line 144
    return-void

    .line 141
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method c()V
    .locals 2

    .prologue
    .line 147
    iget-object v0, p0, Lcom/facebook/fbservice/service/h;->p:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    move-result v0

    if-nez v0, :cond_0

    .line 148
    iget-object v0, p0, Lcom/facebook/fbservice/service/h;->q:Lcom/facebook/common/executors/i;

    new-instance v1, Lcom/facebook/fbservice/service/i;

    invoke-direct {v1, p0}, Lcom/facebook/fbservice/service/i;-><init>(Lcom/facebook/fbservice/service/h;)V

    invoke-interface {v0, v1}, Lcom/facebook/common/executors/i;->execute(Ljava/lang/Runnable;)V

    .line 161
    :cond_0
    return-void
.end method
