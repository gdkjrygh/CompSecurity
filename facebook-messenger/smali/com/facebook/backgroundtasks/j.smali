.class public Lcom/facebook/backgroundtasks/j;
.super Ljava/lang/Object;
.source "BackgroundTaskRunner.java"

# interfaces
.implements Lcom/facebook/backgroundtasks/q;


# annotations
.annotation build Ljavax/annotation/concurrent/ThreadSafe;
.end annotation


# static fields
.field private static a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field

.field private static final b:Lcom/facebook/debug/log/l;


# instance fields
.field private final c:Landroid/os/Handler;

.field private final d:Lcom/facebook/common/time/a;

.field private final e:Ljava/util/concurrent/Executor;

.field private final f:Lcom/facebook/common/v/f;

.field private final g:Lcom/facebook/common/v/a;

.field private final h:Landroid/support/v4/a/e;

.field private final i:Lcom/facebook/backgroundtasks/d;

.field private final j:Lcom/google/common/a/ev;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/ev",
            "<",
            "Ljava/lang/String;",
            "Lcom/facebook/backgroundtasks/p;",
            ">;"
        }
    .end annotation
.end field

.field private final k:Lcom/google/common/a/es;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/backgroundtasks/p;",
            ">;"
        }
    .end annotation
.end field

.field private final l:Ljava/util/concurrent/ConcurrentMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentMap",
            "<",
            "Ljava/lang/Class",
            "<+",
            "Ljava/lang/annotation/Annotation;",
            ">;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final m:Ljava/lang/Object;

.field private final n:Lcom/facebook/common/v/j;

.field private final o:Lcom/facebook/backgroundtasks/o;

.field private p:I
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "mBackgroundTaskLock"
    .end annotation
.end field

.field private q:Lcom/facebook/backgroundtasks/p;
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "mBackgroundTaskLock"
    .end annotation
.end field

.field private r:Ljava/lang/Runnable;
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "mScheduleLock"
    .end annotation
.end field

.field private s:J
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "mScheduleLock"
    .end annotation
.end field

.field private t:Z
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "mScheduleLock"
    .end annotation
.end field

.field private u:Z
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "mScheduleLock"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 52
    const-class v0, Lcom/facebook/backgroundtasks/j;

    sput-object v0, Lcom/facebook/backgroundtasks/j;->a:Ljava/lang/Class;

    .line 54
    new-instance v0, Lcom/facebook/debug/log/l;

    invoke-direct {v0}, Lcom/facebook/debug/log/l;-><init>()V

    sput-object v0, Lcom/facebook/backgroundtasks/j;->b:Lcom/facebook/debug/log/l;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/common/v/f;Lcom/facebook/common/v/a;Landroid/support/v4/a/e;Ljava/util/Set;Lcom/facebook/backgroundtasks/d;Lcom/facebook/common/executors/a;Landroid/os/Handler;Lcom/facebook/common/time/a;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/common/v/f;",
            "Lcom/facebook/common/v/a;",
            "Landroid/support/v4/a/e;",
            "Ljava/util/Set",
            "<",
            "Lcom/facebook/backgroundtasks/c;",
            ">;",
            "Lcom/facebook/backgroundtasks/d;",
            "Lcom/facebook/common/executors/a;",
            "Landroid/os/Handler;",
            "Lcom/facebook/common/time/a;",
            ")V"
        }
    .end annotation

    .prologue
    const/4 v1, 0x0

    .line 158
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 120
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/facebook/backgroundtasks/j;->m:Ljava/lang/Object;

    .line 159
    invoke-interface {p4}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkArgument(Z)V

    .line 160
    iput-object p1, p0, Lcom/facebook/backgroundtasks/j;->f:Lcom/facebook/common/v/f;

    .line 161
    iput-object p2, p0, Lcom/facebook/backgroundtasks/j;->g:Lcom/facebook/common/v/a;

    .line 162
    iput-object p3, p0, Lcom/facebook/backgroundtasks/j;->h:Landroid/support/v4/a/e;

    .line 163
    iput-object p5, p0, Lcom/facebook/backgroundtasks/j;->i:Lcom/facebook/backgroundtasks/d;

    .line 164
    iput-object p7, p0, Lcom/facebook/backgroundtasks/j;->c:Landroid/os/Handler;

    .line 165
    iput-object p8, p0, Lcom/facebook/backgroundtasks/j;->d:Lcom/facebook/common/time/a;

    .line 166
    new-instance v0, Lcom/facebook/common/executors/j;

    invoke-direct {v0, p7}, Lcom/facebook/common/executors/j;-><init>(Landroid/os/Handler;)V

    iput-object v0, p0, Lcom/facebook/backgroundtasks/j;->e:Ljava/util/concurrent/Executor;

    .line 167
    invoke-static {}, Lcom/google/common/a/ik;->c()Ljava/util/concurrent/ConcurrentMap;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/backgroundtasks/j;->l:Ljava/util/concurrent/ConcurrentMap;

    .line 168
    new-instance v0, Lcom/facebook/backgroundtasks/o;

    invoke-direct {v0, p6}, Lcom/facebook/backgroundtasks/o;-><init>(Lcom/facebook/common/executors/a;)V

    iput-object v0, p0, Lcom/facebook/backgroundtasks/j;->o:Lcom/facebook/backgroundtasks/o;

    .line 170
    invoke-direct {p0, p4}, Lcom/facebook/backgroundtasks/j;->a(Ljava/util/Set;)Lcom/google/common/a/es;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/backgroundtasks/j;->k:Lcom/google/common/a/es;

    .line 171
    iget-object v0, p0, Lcom/facebook/backgroundtasks/j;->k:Lcom/google/common/a/es;

    invoke-direct {p0, v0}, Lcom/facebook/backgroundtasks/j;->a(Lcom/google/common/a/es;)Lcom/google/common/a/ev;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/backgroundtasks/j;->j:Lcom/google/common/a/ev;

    .line 172
    iget-object v0, p0, Lcom/facebook/backgroundtasks/j;->k:Lcom/google/common/a/es;

    invoke-virtual {v0}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/backgroundtasks/p;

    .line 173
    iget-object v0, v0, Lcom/facebook/backgroundtasks/p;->a:Lcom/facebook/backgroundtasks/c;

    invoke-interface {v0, p0}, Lcom/facebook/backgroundtasks/c;->a(Lcom/facebook/backgroundtasks/q;)V

    goto :goto_1

    :cond_0
    move v0, v1

    .line 159
    goto :goto_0

    .line 175
    :cond_1
    iput v1, p0, Lcom/facebook/backgroundtasks/j;->p:I

    .line 176
    const-wide/16 v0, 0x64

    iput-wide v0, p0, Lcom/facebook/backgroundtasks/j;->s:J

    .line 178
    new-instance v0, Lcom/facebook/backgroundtasks/k;

    invoke-direct {v0, p0}, Lcom/facebook/backgroundtasks/k;-><init>(Lcom/facebook/backgroundtasks/j;)V

    iput-object v0, p0, Lcom/facebook/backgroundtasks/j;->n:Lcom/facebook/common/v/j;

    .line 184
    iget-object v0, p0, Lcom/facebook/backgroundtasks/j;->f:Lcom/facebook/common/v/f;

    iget-object v1, p0, Lcom/facebook/backgroundtasks/j;->n:Lcom/facebook/common/v/j;

    invoke-virtual {v0, v1}, Lcom/facebook/common/v/f;->a(Lcom/facebook/common/v/j;)V

    .line 186
    iget-object v0, p0, Lcom/facebook/backgroundtasks/j;->h:Landroid/support/v4/a/e;

    new-instance v1, Lcom/facebook/backgroundtasks/l;

    invoke-direct {v1, p0}, Lcom/facebook/backgroundtasks/l;-><init>(Lcom/facebook/backgroundtasks/j;)V

    new-instance v2, Landroid/content/IntentFilter;

    sget-object v3, Lcom/facebook/common/v/a;->a:Ljava/lang/String;

    invoke-direct {v2, v3}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1, v2}, Landroid/support/v4/a/e;->a(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    .line 195
    iget-object v0, p0, Lcom/facebook/backgroundtasks/j;->g:Lcom/facebook/common/v/a;

    invoke-virtual {v0}, Lcom/facebook/common/v/a;->a()Z

    move-result v0

    iput-boolean v0, p0, Lcom/facebook/backgroundtasks/j;->u:Z

    .line 196
    return-void
.end method

.method private static a(J)J
    .locals 4

    .prologue
    .line 391
    const-wide/16 v0, 0x64

    cmp-long v0, p0, v0

    if-nez v0, :cond_0

    .line 392
    const-wide/16 v0, 0x7530

    .line 396
    :goto_0
    const-wide/32 v2, 0x493e0

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    return-wide v0

    .line 394
    :cond_0
    const-wide/16 v0, 0x2

    mul-long/2addr v0, p0

    goto :goto_0
.end method

.method private a(Ljava/util/Set;)Lcom/google/common/a/es;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set",
            "<",
            "Lcom/facebook/backgroundtasks/c;",
            ">;)",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/backgroundtasks/p;",
            ">;"
        }
    .end annotation

    .prologue
    .line 199
    invoke-direct {p0, p1}, Lcom/facebook/backgroundtasks/j;->b(Ljava/util/Set;)Ljava/util/Collection;

    move-result-object v0

    .line 200
    invoke-static {v0}, Lcom/facebook/common/b/f;->a(Ljava/util/Collection;)Lcom/google/common/a/es;

    move-result-object v0

    .line 201
    invoke-static {}, Lcom/google/common/a/es;->e()Lcom/google/common/a/et;

    move-result-object v1

    .line 202
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/common/b/h;

    .line 203
    new-instance v3, Lcom/facebook/backgroundtasks/p;

    iget-object v0, v0, Lcom/facebook/common/b/h;->a:Ljava/lang/Object;

    check-cast v0, Lcom/facebook/backgroundtasks/c;

    const/4 v4, 0x0

    invoke-direct {v3, v0, v4}, Lcom/facebook/backgroundtasks/p;-><init>(Lcom/facebook/backgroundtasks/c;Lcom/facebook/backgroundtasks/k;)V

    invoke-virtual {v1, v3}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    goto :goto_0

    .line 205
    :cond_0
    invoke-virtual {v1}, Lcom/google/common/a/et;->b()Lcom/google/common/a/es;

    move-result-object v0

    return-object v0
.end method

.method private a(Lcom/google/common/a/es;)Lcom/google/common/a/ev;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/backgroundtasks/p;",
            ">;)",
            "Lcom/google/common/a/ev",
            "<",
            "Ljava/lang/String;",
            "Lcom/facebook/backgroundtasks/p;",
            ">;"
        }
    .end annotation

    .prologue
    .line 228
    invoke-static {}, Lcom/google/common/a/ev;->k()Lcom/google/common/a/ew;

    move-result-object v1

    .line 229
    invoke-virtual {p1}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/backgroundtasks/p;

    .line 230
    iget-object v3, v0, Lcom/facebook/backgroundtasks/p;->a:Lcom/facebook/backgroundtasks/c;

    invoke-interface {v3}, Lcom/facebook/backgroundtasks/c;->f()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3, v0}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    goto :goto_0

    .line 232
    :cond_0
    invoke-virtual {v1}, Lcom/google/common/a/ew;->b()Lcom/google/common/a/ev;

    move-result-object v0

    return-object v0
.end method

.method static synthetic a(Lcom/facebook/backgroundtasks/j;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 50
    iget-object v0, p0, Lcom/facebook/backgroundtasks/j;->m:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic a(Lcom/facebook/backgroundtasks/j;Ljava/lang/Runnable;)Ljava/lang/Runnable;
    .locals 0

    .prologue
    .line 50
    iput-object p1, p0, Lcom/facebook/backgroundtasks/j;->r:Ljava/lang/Runnable;

    return-object p1
.end method

.method private a(I)V
    .locals 7

    .prologue
    const-wide/16 v0, 0x0

    .line 279
    iget-object v2, p0, Lcom/facebook/backgroundtasks/j;->m:Ljava/lang/Object;

    monitor-enter v2

    .line 280
    :try_start_0
    iget-boolean v3, p0, Lcom/facebook/backgroundtasks/j;->t:Z

    if-eqz v3, :cond_0

    iget-object v3, p0, Lcom/facebook/backgroundtasks/j;->r:Ljava/lang/Runnable;

    if-eqz v3, :cond_0

    .line 282
    monitor-exit v2

    .line 314
    :goto_0
    return-void

    .line 284
    :cond_0
    iget-object v3, p0, Lcom/facebook/backgroundtasks/j;->r:Ljava/lang/Runnable;

    if-eqz v3, :cond_1

    .line 285
    iget-object v3, p0, Lcom/facebook/backgroundtasks/j;->c:Landroid/os/Handler;

    iget-object v4, p0, Lcom/facebook/backgroundtasks/j;->r:Ljava/lang/Runnable;

    invoke-virtual {v3, v4}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 286
    const/4 v3, 0x0

    iput-object v3, p0, Lcom/facebook/backgroundtasks/j;->r:Ljava/lang/Runnable;

    .line 290
    :cond_1
    packed-switch p1, :pswitch_data_0

    .line 301
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0

    .line 313
    :catchall_0
    move-exception v0

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 295
    :pswitch_0
    :try_start_1
    iget-wide v0, p0, Lcom/facebook/backgroundtasks/j;->s:J

    .line 303
    :goto_1
    :pswitch_1
    new-instance v3, Lcom/facebook/backgroundtasks/m;

    invoke-direct {v3, p0}, Lcom/facebook/backgroundtasks/m;-><init>(Lcom/facebook/backgroundtasks/j;)V

    iput-object v3, p0, Lcom/facebook/backgroundtasks/j;->r:Ljava/lang/Runnable;

    .line 312
    iget-object v3, p0, Lcom/facebook/backgroundtasks/j;->c:Landroid/os/Handler;

    iget-object v4, p0, Lcom/facebook/backgroundtasks/j;->r:Ljava/lang/Runnable;

    invoke-virtual {v3, v4, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 313
    monitor-exit v2

    goto :goto_0

    .line 298
    :pswitch_2
    const-wide/16 v0, 0x0

    invoke-direct {p0}, Lcom/facebook/backgroundtasks/j;->g()J

    move-result-wide v3

    iget-object v5, p0, Lcom/facebook/backgroundtasks/j;->d:Lcom/facebook/common/time/a;

    invoke-interface {v5}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v5

    sub-long/2addr v3, v5

    invoke-static {v0, v1, v3, v4}, Ljava/lang/Math;->max(JJ)J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-wide v0

    goto :goto_1

    .line 290
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
        :pswitch_2
    .end packed-switch
.end method

.method private a(Lcom/facebook/backgroundtasks/b;)V
    .locals 5

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 349
    iget-object v2, p0, Lcom/facebook/backgroundtasks/j;->o:Lcom/facebook/backgroundtasks/o;

    invoke-virtual {v2}, Lcom/facebook/backgroundtasks/o;->a()V

    .line 351
    :try_start_0
    iget-object v2, p0, Lcom/facebook/backgroundtasks/j;->q:Lcom/facebook/backgroundtasks/p;

    .line 352
    const/4 v3, 0x0

    iput-object v3, p0, Lcom/facebook/backgroundtasks/j;->q:Lcom/facebook/backgroundtasks/p;

    .line 353
    sget-object v3, Lcom/facebook/backgroundtasks/j;->a:Ljava/lang/Class;

    const-string v4, "Task completed successfully"

    invoke-static {v3, v4}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 354
    iget-boolean v3, p1, Lcom/facebook/backgroundtasks/b;->a:Z

    if-nez v3, :cond_0

    :goto_0
    iput-boolean v0, v2, Lcom/facebook/backgroundtasks/p;->b:Z

    .line 356
    iget-object v1, p0, Lcom/facebook/backgroundtasks/j;->m:Ljava/lang/Object;

    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 357
    :try_start_1
    iget-boolean v0, p1, Lcom/facebook/backgroundtasks/b;->a:Z

    if-eqz v0, :cond_1

    .line 358
    const-wide/16 v2, 0x64

    iput-wide v2, p0, Lcom/facebook/backgroundtasks/j;->s:J

    .line 359
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/backgroundtasks/j;->t:Z

    .line 364
    :goto_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 365
    const/4 v0, 0x2

    :try_start_2
    invoke-direct {p0, v0}, Lcom/facebook/backgroundtasks/j;->a(I)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 367
    iget-object v0, p0, Lcom/facebook/backgroundtasks/j;->o:Lcom/facebook/backgroundtasks/o;

    invoke-virtual {v0}, Lcom/facebook/backgroundtasks/o;->b()V

    .line 369
    return-void

    :cond_0
    move v0, v1

    .line 354
    goto :goto_0

    .line 361
    :cond_1
    :try_start_3
    iget-wide v2, p0, Lcom/facebook/backgroundtasks/j;->s:J

    invoke-static {v2, v3}, Lcom/facebook/backgroundtasks/j;->a(J)J

    move-result-wide v2

    iput-wide v2, p0, Lcom/facebook/backgroundtasks/j;->s:J

    .line 362
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/backgroundtasks/j;->t:Z

    goto :goto_1

    .line 364
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 367
    :catchall_1
    move-exception v0

    iget-object v1, p0, Lcom/facebook/backgroundtasks/j;->o:Lcom/facebook/backgroundtasks/o;

    invoke-virtual {v1}, Lcom/facebook/backgroundtasks/o;->b()V

    throw v0
.end method

.method static synthetic a(Lcom/facebook/backgroundtasks/j;Lcom/facebook/backgroundtasks/b;)V
    .locals 0

    .prologue
    .line 50
    invoke-direct {p0, p1}, Lcom/facebook/backgroundtasks/j;->a(Lcom/facebook/backgroundtasks/b;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/backgroundtasks/j;Ljava/lang/Throwable;)V
    .locals 0

    .prologue
    .line 50
    invoke-direct {p0, p1}, Lcom/facebook/backgroundtasks/j;->a(Ljava/lang/Throwable;)V

    return-void
.end method

.method private a(Ljava/lang/Throwable;)V
    .locals 5

    .prologue
    .line 372
    iget-object v0, p0, Lcom/facebook/backgroundtasks/j;->o:Lcom/facebook/backgroundtasks/o;

    invoke-virtual {v0}, Lcom/facebook/backgroundtasks/o;->a()V

    .line 375
    :try_start_0
    iget-object v0, p0, Lcom/facebook/backgroundtasks/j;->q:Lcom/facebook/backgroundtasks/p;

    .line 376
    const/4 v1, 0x0

    iput-object v1, p0, Lcom/facebook/backgroundtasks/j;->q:Lcom/facebook/backgroundtasks/p;

    .line 377
    sget-object v1, Lcom/facebook/backgroundtasks/j;->b:Lcom/facebook/debug/log/l;

    sget-object v2, Lcom/facebook/backgroundtasks/j;->a:Ljava/lang/Class;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Task "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, v0, Lcom/facebook/backgroundtasks/p;->a:Lcom/facebook/backgroundtasks/c;

    invoke-interface {v4}, Lcom/facebook/backgroundtasks/c;->f()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, " threw exeption"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v2, v3, p1}, Lcom/facebook/debug/log/b;->a(Lcom/facebook/debug/log/l;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 378
    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/facebook/backgroundtasks/p;->b:Z

    .line 379
    iget-object v1, p0, Lcom/facebook/backgroundtasks/j;->m:Ljava/lang/Object;

    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 380
    :try_start_1
    iget-wide v2, p0, Lcom/facebook/backgroundtasks/j;->s:J

    invoke-static {v2, v3}, Lcom/facebook/backgroundtasks/j;->a(J)J

    move-result-wide v2

    iput-wide v2, p0, Lcom/facebook/backgroundtasks/j;->s:J

    .line 381
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/backgroundtasks/j;->t:Z

    .line 382
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 383
    const/4 v0, 0x2

    :try_start_2
    invoke-direct {p0, v0}, Lcom/facebook/backgroundtasks/j;->a(I)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 385
    iget-object v0, p0, Lcom/facebook/backgroundtasks/j;->o:Lcom/facebook/backgroundtasks/o;

    invoke-virtual {v0}, Lcom/facebook/backgroundtasks/o;->b()V

    .line 387
    return-void

    .line 382
    :catchall_0
    move-exception v0

    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 385
    :catchall_1
    move-exception v0

    iget-object v1, p0, Lcom/facebook/backgroundtasks/j;->o:Lcom/facebook/backgroundtasks/o;

    invoke-virtual {v1}, Lcom/facebook/backgroundtasks/o;->b()V

    throw v0
.end method

.method private a(Lcom/facebook/backgroundtasks/p;)Z
    .locals 1

    .prologue
    .line 457
    invoke-direct {p0, p1}, Lcom/facebook/backgroundtasks/j;->b(Lcom/facebook/backgroundtasks/p;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 458
    const/4 v0, 0x0

    .line 460
    :goto_0
    return v0

    :cond_0
    iget-object v0, p1, Lcom/facebook/backgroundtasks/p;->a:Lcom/facebook/backgroundtasks/c;

    invoke-interface {v0}, Lcom/facebook/backgroundtasks/c;->b()Z

    move-result v0

    goto :goto_0
.end method

.method private b(Ljava/util/Set;)Ljava/util/Collection;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set",
            "<",
            "Lcom/facebook/backgroundtasks/c;",
            ">;)",
            "Ljava/util/Collection",
            "<",
            "Lcom/facebook/common/b/h",
            "<",
            "Lcom/facebook/backgroundtasks/c;",
            ">;>;"
        }
    .end annotation

    .prologue
    .line 210
    invoke-static {}, Lcom/google/common/a/ik;->a()Ljava/util/HashMap;

    move-result-object v3

    .line 211
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/backgroundtasks/c;

    .line 212
    invoke-interface {v0}, Lcom/facebook/backgroundtasks/c;->f()Ljava/lang/String;

    move-result-object v2

    new-instance v4, Lcom/facebook/common/b/h;

    invoke-direct {v4, v0}, Lcom/facebook/common/b/h;-><init>(Ljava/lang/Object;)V

    invoke-interface {v3, v2, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 215
    :cond_0
    invoke-interface {v3}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/common/b/h;

    .line 216
    iget-object v1, v0, Lcom/facebook/common/b/h;->a:Ljava/lang/Object;

    check-cast v1, Lcom/facebook/backgroundtasks/c;

    invoke-interface {v1}, Lcom/facebook/backgroundtasks/c;->h()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 217
    invoke-interface {v3, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/common/b/h;

    .line 218
    if-nez v2, :cond_2

    .line 219
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Missing node for dependency: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 221
    :cond_2
    invoke-virtual {v2, v0}, Lcom/facebook/common/b/h;->a(Lcom/facebook/common/b/h;)V

    goto :goto_1

    .line 224
    :cond_3
    invoke-interface {v3}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method

.method static synthetic b(Lcom/facebook/backgroundtasks/j;)V
    .locals 0

    .prologue
    .line 50
    invoke-direct {p0}, Lcom/facebook/backgroundtasks/j;->d()V

    return-void
.end method

.method private b(Lcom/facebook/backgroundtasks/p;)Z
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 464
    iget-object v0, p1, Lcom/facebook/backgroundtasks/p;->a:Lcom/facebook/backgroundtasks/c;

    invoke-interface {v0}, Lcom/facebook/backgroundtasks/c;->h()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 465
    iget-object v3, p0, Lcom/facebook/backgroundtasks/j;->j:Lcom/google/common/a/ev;

    invoke-virtual {v3, v0}, Lcom/google/common/a/ev;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/backgroundtasks/p;

    .line 466
    iget-boolean v0, v0, Lcom/facebook/backgroundtasks/p;->b:Z

    if-eqz v0, :cond_0

    move v0, v1

    .line 482
    :goto_0
    return v0

    .line 471
    :cond_1
    iget-object v0, p0, Lcom/facebook/backgroundtasks/j;->i:Lcom/facebook/backgroundtasks/d;

    iget-object v2, p1, Lcom/facebook/backgroundtasks/p;->a:Lcom/facebook/backgroundtasks/c;

    invoke-virtual {v0, v2}, Lcom/facebook/backgroundtasks/d;->a(Lcom/facebook/backgroundtasks/c;)Z

    move-result v0

    if-eqz v0, :cond_2

    move v0, v1

    .line 472
    goto :goto_0

    .line 475
    :cond_2
    iget-object v0, p1, Lcom/facebook/backgroundtasks/p;->a:Lcom/facebook/backgroundtasks/c;

    invoke-interface {v0}, Lcom/facebook/backgroundtasks/c;->a()Ljava/util/Set;

    move-result-object v0

    .line 477
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Class;

    .line 478
    iget-object v3, p0, Lcom/facebook/backgroundtasks/j;->l:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v3, v0}, Ljava/util/concurrent/ConcurrentMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    move v0, v1

    .line 479
    goto :goto_0

    .line 482
    :cond_4
    const/4 v0, 0x1

    goto :goto_0
.end method

.method private d()V
    .locals 3

    .prologue
    .line 317
    iget-object v0, p0, Lcom/facebook/backgroundtasks/j;->o:Lcom/facebook/backgroundtasks/o;

    invoke-virtual {v0}, Lcom/facebook/backgroundtasks/o;->a()V

    .line 319
    :try_start_0
    iget-object v0, p0, Lcom/facebook/backgroundtasks/j;->q:Lcom/facebook/backgroundtasks/p;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    .line 344
    iget-object v0, p0, Lcom/facebook/backgroundtasks/j;->o:Lcom/facebook/backgroundtasks/o;

    invoke-virtual {v0}, Lcom/facebook/backgroundtasks/o;->b()V

    .line 346
    :goto_0
    return-void

    .line 322
    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/facebook/backgroundtasks/j;->f:Lcom/facebook/common/v/f;

    invoke-virtual {v0}, Lcom/facebook/common/v/f;->b()Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result v0

    if-eqz v0, :cond_1

    .line 344
    iget-object v0, p0, Lcom/facebook/backgroundtasks/j;->o:Lcom/facebook/backgroundtasks/o;

    invoke-virtual {v0}, Lcom/facebook/backgroundtasks/o;->b()V

    goto :goto_0

    .line 326
    :cond_1
    :try_start_2
    invoke-direct {p0}, Lcom/facebook/backgroundtasks/j;->e()Lcom/google/common/d/a/s;

    move-result-object v0

    .line 327
    if-eqz v0, :cond_2

    .line 328
    new-instance v1, Lcom/facebook/backgroundtasks/n;

    invoke-direct {v1, p0}, Lcom/facebook/backgroundtasks/n;-><init>(Lcom/facebook/backgroundtasks/j;)V

    iget-object v2, p0, Lcom/facebook/backgroundtasks/j;->e:Ljava/util/concurrent/Executor;

    invoke-static {v0, v1, v2}, Lcom/google/common/d/a/i;->a(Lcom/google/common/d/a/s;Lcom/google/common/d/a/h;Ljava/util/concurrent/Executor;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 344
    :goto_1
    iget-object v0, p0, Lcom/facebook/backgroundtasks/j;->o:Lcom/facebook/backgroundtasks/o;

    invoke-virtual {v0}, Lcom/facebook/backgroundtasks/o;->b()V

    goto :goto_0

    .line 341
    :cond_2
    const/4 v0, 0x3

    :try_start_3
    invoke-direct {p0, v0}, Lcom/facebook/backgroundtasks/j;->a(I)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_1

    .line 344
    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/facebook/backgroundtasks/j;->o:Lcom/facebook/backgroundtasks/o;

    invoke-virtual {v1}, Lcom/facebook/backgroundtasks/o;->b()V

    throw v0
.end method

.method private e()Lcom/google/common/d/a/s;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/d/a/s",
            "<",
            "Lcom/facebook/backgroundtasks/b;",
            ">;"
        }
    .end annotation

    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "mBackgroundTaskLock"
    .end annotation

    .prologue
    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 401
    iget-object v0, p0, Lcom/facebook/backgroundtasks/j;->o:Lcom/facebook/backgroundtasks/o;

    invoke-virtual {v0}, Lcom/facebook/backgroundtasks/o;->c()Z

    move-result v0

    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkState(Z)V

    move v0, v1

    .line 402
    :goto_0
    iget-object v3, p0, Lcom/facebook/backgroundtasks/j;->k:Lcom/google/common/a/es;

    invoke-virtual {v3}, Lcom/google/common/a/es;->size()I

    move-result v3

    if-ge v0, v3, :cond_2

    .line 403
    invoke-direct {p0}, Lcom/facebook/backgroundtasks/j;->f()Lcom/facebook/backgroundtasks/p;

    move-result-object v3

    .line 404
    if-nez v3, :cond_0

    .line 405
    sget-object v0, Lcom/facebook/backgroundtasks/j;->a:Ljava/lang/Class;

    const-string v1, "No more tasks to run"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    move-object v0, v2

    .line 423
    :goto_1
    return-object v0

    .line 408
    :cond_0
    sget-object v4, Lcom/facebook/backgroundtasks/j;->a:Ljava/lang/Class;

    const-string v5, "Running %s"

    const/4 v6, 0x1

    new-array v6, v6, [Ljava/lang/Object;

    iget-object v7, v3, Lcom/facebook/backgroundtasks/p;->a:Lcom/facebook/backgroundtasks/c;

    invoke-interface {v7}, Lcom/facebook/backgroundtasks/c;->f()Ljava/lang/String;

    move-result-object v7

    aput-object v7, v6, v1

    invoke-static {v4, v5, v6}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 410
    :try_start_0
    iput-object v3, p0, Lcom/facebook/backgroundtasks/j;->q:Lcom/facebook/backgroundtasks/p;

    .line 411
    iget-object v3, p0, Lcom/facebook/backgroundtasks/j;->q:Lcom/facebook/backgroundtasks/p;

    iget-object v3, v3, Lcom/facebook/backgroundtasks/p;->a:Lcom/facebook/backgroundtasks/c;

    invoke-interface {v3}, Lcom/facebook/backgroundtasks/c;->c()Lcom/google/common/d/a/s;

    move-result-object v3

    .line 412
    if-eqz v3, :cond_1

    .line 413
    sget-object v0, Lcom/facebook/backgroundtasks/j;->a:Ljava/lang/Class;

    const-string v1, "Task started"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    move-object v0, v3

    .line 414
    goto :goto_1

    .line 416
    :cond_1
    const/4 v3, 0x0

    iput-object v3, p0, Lcom/facebook/backgroundtasks/j;->q:Lcom/facebook/backgroundtasks/p;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 402
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 418
    :catch_0
    move-exception v0

    .line 419
    invoke-direct {p0, v0}, Lcom/facebook/backgroundtasks/j;->a(Ljava/lang/Throwable;)V

    move-object v0, v2

    .line 420
    goto :goto_1

    :cond_2
    move-object v0, v2

    .line 423
    goto :goto_1
.end method

.method private f()Lcom/facebook/backgroundtasks/p;
    .locals 5
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "mBackgroundTaskLock"
    .end annotation

    .prologue
    .line 428
    iget-object v0, p0, Lcom/facebook/backgroundtasks/j;->o:Lcom/facebook/backgroundtasks/o;

    invoke-virtual {v0}, Lcom/facebook/backgroundtasks/o;->c()Z

    move-result v0

    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkState(Z)V

    .line 429
    iget-object v0, p0, Lcom/facebook/backgroundtasks/j;->k:Lcom/google/common/a/es;

    invoke-virtual {v0}, Lcom/google/common/a/es;->size()I

    move-result v2

    .line 430
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-ge v1, v2, :cond_1

    .line 431
    iget v0, p0, Lcom/facebook/backgroundtasks/j;->p:I

    add-int/2addr v0, v1

    rem-int v3, v0, v2

    .line 432
    iget-object v0, p0, Lcom/facebook/backgroundtasks/j;->k:Lcom/google/common/a/es;

    invoke-virtual {v0, v3}, Lcom/google/common/a/es;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/backgroundtasks/p;

    .line 433
    invoke-direct {p0, v0}, Lcom/facebook/backgroundtasks/j;->a(Lcom/facebook/backgroundtasks/p;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 434
    add-int/lit8 v1, v3, 0x1

    rem-int/2addr v1, v2

    iput v1, p0, Lcom/facebook/backgroundtasks/j;->p:I

    .line 438
    :goto_1
    return-object v0

    .line 430
    :cond_0
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 438
    :cond_1
    const/4 v0, 0x0

    goto :goto_1
.end method

.method private g()J
    .locals 11

    .prologue
    .line 442
    iget-object v0, p0, Lcom/facebook/backgroundtasks/j;->d:Lcom/facebook/common/time/a;

    invoke-interface {v0}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v0

    const-wide/32 v2, 0x5265c00

    add-long v1, v0, v2

    .line 443
    iget-object v0, p0, Lcom/facebook/backgroundtasks/j;->k:Lcom/google/common/a/es;

    invoke-virtual {v0}, Lcom/google/common/a/es;->size()I

    move-result v4

    .line 444
    const/4 v0, 0x0

    move v3, v0

    :goto_0
    if-ge v3, v4, :cond_0

    .line 445
    iget-object v0, p0, Lcom/facebook/backgroundtasks/j;->k:Lcom/google/common/a/es;

    invoke-virtual {v0, v3}, Lcom/google/common/a/es;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/backgroundtasks/p;

    .line 446
    invoke-direct {p0, v0}, Lcom/facebook/backgroundtasks/j;->b(Lcom/facebook/backgroundtasks/p;)Z

    move-result v5

    if-eqz v5, :cond_1

    .line 447
    iget-object v0, v0, Lcom/facebook/backgroundtasks/p;->a:Lcom/facebook/backgroundtasks/c;

    invoke-interface {v0}, Lcom/facebook/backgroundtasks/c;->i()J

    move-result-wide v5

    .line 448
    const-wide/16 v7, -0x1

    cmp-long v0, v5, v7

    if-eqz v0, :cond_1

    .line 449
    invoke-static {v1, v2, v5, v6}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    .line 444
    :goto_1
    add-int/lit8 v2, v3, 0x1

    move v3, v2

    move-wide v9, v0

    move-wide v1, v9

    goto :goto_0

    .line 453
    :cond_0
    return-wide v1

    :cond_1
    move-wide v0, v1

    goto :goto_1
.end method


# virtual methods
.method public a()V
    .locals 1

    .prologue
    .line 241
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/facebook/backgroundtasks/j;->a(I)V

    .line 242
    return-void
.end method

.method public a(Ljava/lang/Class;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<+",
            "Ljava/lang/annotation/Annotation;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 250
    iget-object v0, p0, Lcom/facebook/backgroundtasks/j;->l:Ljava/util/concurrent/ConcurrentMap;

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Ljava/util/concurrent/ConcurrentMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 251
    return-void
.end method

.method a(Z)V
    .locals 1
    .annotation build Lcom/google/common/annotations/VisibleForTesting;
    .end annotation

    .prologue
    .line 260
    if-nez p1, :cond_0

    .line 261
    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lcom/facebook/backgroundtasks/j;->a(I)V

    .line 263
    :cond_0
    return-void
.end method

.method public b()V
    .locals 1

    .prologue
    .line 246
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/facebook/backgroundtasks/j;->a(I)V

    .line 247
    return-void
.end method

.method public b(Ljava/lang/Class;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<+",
            "Ljava/lang/annotation/Annotation;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 254
    iget-object v0, p0, Lcom/facebook/backgroundtasks/j;->l:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0, p1}, Ljava/util/concurrent/ConcurrentMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 255
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/facebook/backgroundtasks/j;->a(I)V

    .line 256
    return-void
.end method

.method c()V
    .locals 3
    .annotation build Lcom/google/common/annotations/VisibleForTesting;
    .end annotation

    .prologue
    .line 267
    iget-object v1, p0, Lcom/facebook/backgroundtasks/j;->m:Ljava/lang/Object;

    monitor-enter v1

    .line 268
    :try_start_0
    iget-object v0, p0, Lcom/facebook/backgroundtasks/j;->g:Lcom/facebook/common/v/a;

    invoke-virtual {v0}, Lcom/facebook/common/v/a;->a()Z

    move-result v0

    .line 269
    iget-boolean v2, p0, Lcom/facebook/backgroundtasks/j;->u:Z

    if-eq v2, v0, :cond_0

    .line 270
    iput-boolean v0, p0, Lcom/facebook/backgroundtasks/j;->u:Z

    .line 271
    iget-boolean v0, p0, Lcom/facebook/backgroundtasks/j;->u:Z

    if-nez v0, :cond_0

    .line 272
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/facebook/backgroundtasks/j;->a(I)V

    .line 275
    :cond_0
    monitor-exit v1

    .line 276
    return-void

    .line 275
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
