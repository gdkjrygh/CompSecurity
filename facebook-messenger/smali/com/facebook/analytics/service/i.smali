.class public Lcom/facebook/analytics/service/i;
.super Ljava/lang/Object;
.source "AnalyticsEventsDataStore.java"


# static fields
.field private static final d:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# instance fields
.field a:Ljava/util/Set;
    .annotation build Lcom/google/common/annotations/VisibleForTesting;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Lcom/facebook/analytics/service/k;",
            ">;"
        }
    .end annotation
.end field

.field b:Ljava/util/Set;
    .annotation build Lcom/google/common/annotations/VisibleForTesting;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Lcom/facebook/analytics/periodicreporters/l;",
            ">;"
        }
    .end annotation
.end field

.field c:Lcom/facebook/analytics/c/f;
    .annotation build Lcom/google/common/annotations/VisibleForTesting;
    .end annotation
.end field

.field private final e:Landroid/content/Context;

.field private final f:Lcom/facebook/common/time/a;

.field private final g:Lcom/facebook/analytics/c/e;

.field private final h:Lcom/facebook/analytics/c/g;

.field private final i:Lcom/facebook/base/a/d;

.field private final j:Ljava/util/concurrent/Executor;

.field private final k:Ljava/util/concurrent/LinkedBlockingQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/LinkedBlockingQueue",
            "<",
            "Lcom/facebook/analytics/am;",
            ">;"
        }
    .end annotation
.end field

.field private final l:Lcom/facebook/analytics/bq;

.field private final m:Lcom/fasterxml/jackson/databind/ObjectMapper;

.field private final n:Lcom/facebook/common/v/f;

.field private final o:Lcom/facebook/common/process/d;

.field private final p:J

.field private final q:Ljava/lang/Object;

.field private final r:Lcom/facebook/analytics/service/l;

.field private s:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field private t:I

.field private u:J

.field private v:J

.field private w:Z
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "mIdleSync"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 50
    const-class v0, Lcom/facebook/analytics/service/i;

    sput-object v0, Lcom/facebook/analytics/service/i;->d:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/facebook/analytics/c/e;Lcom/facebook/analytics/c/g;Lcom/facebook/base/a/d;Lcom/facebook/common/time/a;Ljava/util/concurrent/Executor;Lcom/facebook/analytics/bq;Lcom/fasterxml/jackson/databind/ObjectMapper;Lcom/facebook/common/v/f;Lcom/facebook/common/process/d;)V
    .locals 13

    .prologue
    .line 132
    const-wide/16 v11, 0x1388

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    move-object/from16 v10, p10

    invoke-direct/range {v0 .. v12}, Lcom/facebook/analytics/service/i;-><init>(Landroid/content/Context;Lcom/facebook/analytics/c/e;Lcom/facebook/analytics/c/g;Lcom/facebook/base/a/d;Lcom/facebook/common/time/a;Ljava/util/concurrent/Executor;Lcom/facebook/analytics/bq;Lcom/fasterxml/jackson/databind/ObjectMapper;Lcom/facebook/common/v/f;Lcom/facebook/common/process/d;J)V

    .line 135
    return-void
.end method

.method constructor <init>(Landroid/content/Context;Lcom/facebook/analytics/c/e;Lcom/facebook/analytics/c/g;Lcom/facebook/base/a/d;Lcom/facebook/common/time/a;Ljava/util/concurrent/Executor;Lcom/facebook/analytics/bq;Lcom/fasterxml/jackson/databind/ObjectMapper;Lcom/facebook/common/v/f;Lcom/facebook/common/process/d;J)V
    .locals 2
    .annotation build Lcom/google/common/annotations/VisibleForTesting;
    .end annotation

    .prologue
    .line 149
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 101
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/facebook/analytics/service/i;->q:Ljava/lang/Object;

    .line 105
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/analytics/service/i;->b:Ljava/util/Set;

    .line 113
    const/4 v0, 0x0

    iput v0, p0, Lcom/facebook/analytics/service/i;->t:I

    .line 115
    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/facebook/analytics/service/i;->u:J

    .line 116
    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/facebook/analytics/service/i;->v:J

    .line 118
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/analytics/service/i;->w:Z

    .line 150
    iput-object p1, p0, Lcom/facebook/analytics/service/i;->e:Landroid/content/Context;

    .line 151
    iput-object p5, p0, Lcom/facebook/analytics/service/i;->f:Lcom/facebook/common/time/a;

    .line 152
    iput-object p2, p0, Lcom/facebook/analytics/service/i;->g:Lcom/facebook/analytics/c/e;

    .line 153
    iput-object p3, p0, Lcom/facebook/analytics/service/i;->h:Lcom/facebook/analytics/c/g;

    .line 154
    iput-object p6, p0, Lcom/facebook/analytics/service/i;->j:Ljava/util/concurrent/Executor;

    .line 155
    iput-object p4, p0, Lcom/facebook/analytics/service/i;->i:Lcom/facebook/base/a/d;

    .line 156
    iput-object p7, p0, Lcom/facebook/analytics/service/i;->l:Lcom/facebook/analytics/bq;

    .line 157
    iput-object p8, p0, Lcom/facebook/analytics/service/i;->m:Lcom/fasterxml/jackson/databind/ObjectMapper;

    .line 158
    iput-object p9, p0, Lcom/facebook/analytics/service/i;->n:Lcom/facebook/common/v/f;

    .line 159
    iput-wide p11, p0, Lcom/facebook/analytics/service/i;->p:J

    .line 160
    iput-object p10, p0, Lcom/facebook/analytics/service/i;->o:Lcom/facebook/common/process/d;

    .line 162
    new-instance v0, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v0}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    iput-object v0, p0, Lcom/facebook/analytics/service/i;->k:Ljava/util/concurrent/LinkedBlockingQueue;

    .line 163
    new-instance v0, Lcom/facebook/analytics/service/l;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/facebook/analytics/service/l;-><init>(Lcom/facebook/analytics/service/i;Lcom/facebook/analytics/service/j;)V

    iput-object v0, p0, Lcom/facebook/analytics/service/i;->r:Lcom/facebook/analytics/service/l;

    .line 164
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lcom/facebook/analytics/service/i;->s:Ljava/util/Map;

    .line 165
    return-void
.end method

.method private a()V
    .locals 5

    .prologue
    .line 193
    iget-object v0, p0, Lcom/facebook/analytics/service/i;->i:Lcom/facebook/base/a/d;

    invoke-virtual {v0}, Lcom/facebook/base/a/d;->b()V

    .line 196
    iget-object v0, p0, Lcom/facebook/analytics/service/i;->h:Lcom/facebook/analytics/c/g;

    invoke-virtual {v0}, Lcom/facebook/analytics/c/g;->d()Lcom/facebook/analytics/c/f;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/analytics/service/i;->c:Lcom/facebook/analytics/c/f;

    .line 199
    invoke-direct {p0}, Lcom/facebook/analytics/service/i;->d()V

    .line 204
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/facebook/analytics/service/i;->n:Lcom/facebook/common/v/f;

    const-wide/16 v1, 0x1388

    invoke-virtual {v0, v1, v2}, Lcom/facebook/common/v/f;->a(J)V

    .line 208
    :try_start_0
    iget-object v0, p0, Lcom/facebook/analytics/service/i;->k:Ljava/util/concurrent/LinkedBlockingQueue;

    iget-wide v1, p0, Lcom/facebook/analytics/service/i;->p:J

    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v1, v2, v3}, Ljava/util/concurrent/LinkedBlockingQueue;->poll(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/analytics/am;

    .line 210
    if-eqz v0, :cond_4

    .line 212
    invoke-virtual {p0, v0}, Lcom/facebook/analytics/service/i;->a(Lcom/facebook/analytics/am;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 218
    invoke-direct {p0, v0}, Lcom/facebook/analytics/service/i;->d(Lcom/facebook/analytics/am;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 219
    invoke-direct {p0, v0}, Lcom/facebook/analytics/service/i;->e(Lcom/facebook/analytics/am;)V

    .line 223
    :cond_1
    iget-object v1, p0, Lcom/facebook/analytics/service/i;->h:Lcom/facebook/analytics/c/g;

    iget-object v2, p0, Lcom/facebook/analytics/service/i;->c:Lcom/facebook/analytics/c/f;

    invoke-virtual {v1, v2}, Lcom/facebook/analytics/c/g;->c(Lcom/facebook/analytics/c/f;)V

    .line 226
    iget-object v1, p0, Lcom/facebook/analytics/service/i;->c:Lcom/facebook/analytics/c/f;

    invoke-virtual {v1}, Lcom/facebook/analytics/c/f;->h()J

    move-result-wide v1

    const-wide/16 v3, 0x0

    cmp-long v1, v1, v3

    if-nez v1, :cond_2

    .line 227
    invoke-interface {v0}, Lcom/facebook/analytics/am;->b()J

    move-result-wide v1

    invoke-interface {v0}, Lcom/facebook/analytics/am;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0, v1, v2, v3}, Lcom/facebook/analytics/service/i;->a(JLjava/lang/String;)V

    .line 232
    :cond_2
    invoke-direct {p0, v0}, Lcom/facebook/analytics/service/i;->c(Lcom/facebook/analytics/am;)V

    .line 235
    invoke-direct {p0, v0}, Lcom/facebook/analytics/service/i;->f(Lcom/facebook/analytics/am;)V

    .line 238
    invoke-direct {p0, v0}, Lcom/facebook/analytics/service/i;->i(Lcom/facebook/analytics/am;)V

    .line 240
    invoke-direct {p0, v0}, Lcom/facebook/analytics/service/i;->g(Lcom/facebook/analytics/am;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 241
    sget-object v0, Lcom/facebook/analytics/service/i;->d:Ljava/lang/Class;

    const-string v1, "Ending Analytics Session."

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 243
    iget-object v0, p0, Lcom/facebook/analytics/service/i;->h:Lcom/facebook/analytics/c/g;

    iget-object v1, p0, Lcom/facebook/analytics/service/i;->c:Lcom/facebook/analytics/c/f;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/facebook/analytics/c/g;->a(Lcom/facebook/analytics/c/f;Lcom/facebook/analytics/c/f;)Lcom/facebook/analytics/c/f;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/analytics/service/i;->c:Lcom/facebook/analytics/c/f;
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 263
    :catch_0
    move-exception v0

    .line 264
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    .line 268
    :goto_1
    return-void

    .line 244
    :cond_3
    :try_start_1
    invoke-direct {p0, v0}, Lcom/facebook/analytics/service/i;->h(Lcom/facebook/analytics/am;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 245
    sget-object v0, Lcom/facebook/analytics/service/i;->d:Ljava/lang/Class;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Truncating the current batch of events. Events in this batch: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/facebook/analytics/service/i;->c:Lcom/facebook/analytics/c/f;

    invoke-virtual {v2}, Lcom/facebook/analytics/c/f;->h()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 248
    iget-object v0, p0, Lcom/facebook/analytics/service/i;->h:Lcom/facebook/analytics/c/g;

    iget-object v1, p0, Lcom/facebook/analytics/service/i;->c:Lcom/facebook/analytics/c/f;

    invoke-virtual {v0, v1}, Lcom/facebook/analytics/c/g;->b(Lcom/facebook/analytics/c/f;)V

    goto/16 :goto_0

    .line 251
    :cond_4
    const/4 v0, 0x0

    .line 252
    iget-object v1, p0, Lcom/facebook/analytics/service/i;->q:Ljava/lang/Object;

    monitor-enter v1
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0

    .line 253
    :try_start_2
    iget-object v2, p0, Lcom/facebook/analytics/service/i;->k:Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-virtual {v2}, Ljava/util/concurrent/LinkedBlockingQueue;->size()I

    move-result v2

    if-nez v2, :cond_5

    .line 254
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/analytics/service/i;->w:Z

    .line 256
    :cond_5
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 257
    if-eqz v0, :cond_0

    .line 259
    :try_start_3
    invoke-direct {p0}, Lcom/facebook/analytics/service/i;->b()V
    :try_end_3
    .catch Ljava/lang/InterruptedException; {:try_start_3 .. :try_end_3} :catch_0

    goto :goto_1

    .line 256
    :catchall_0
    move-exception v0

    :try_start_4
    monitor-exit v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :try_start_5
    throw v0
    :try_end_5
    .catch Ljava/lang/InterruptedException; {:try_start_5 .. :try_end_5} :catch_0
.end method

.method private a(J)V
    .locals 2

    .prologue
    .line 438
    iput-wide p1, p0, Lcom/facebook/analytics/service/i;->u:J

    .line 439
    iget-object v0, p0, Lcom/facebook/analytics/service/i;->g:Lcom/facebook/analytics/c/e;

    sget-object v1, Lcom/facebook/analytics/c/b;->h:Lcom/facebook/analytics/c/c;

    invoke-virtual {v0, v1, p1, p2}, Lcom/facebook/analytics/c/e;->b(Lcom/facebook/common/s/a;J)V

    .line 440
    return-void
.end method

.method private a(Lcom/facebook/analytics/ca;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 381
    const-string v0, "AUTO_SET"

    invoke-virtual {p1}, Lcom/facebook/analytics/ca;->f()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 382
    iget-object v0, p0, Lcom/facebook/analytics/service/i;->o:Lcom/facebook/common/process/d;

    invoke-interface {v0}, Lcom/facebook/common/process/d;->b()Lcom/facebook/common/process/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/common/process/c;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/facebook/analytics/ca;->d(Ljava/lang/String;)V

    .line 384
    :cond_0
    const-string v0, "AUTO_SET"

    invoke-virtual {p1}, Lcom/facebook/analytics/ca;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 385
    invoke-virtual {p1, p2}, Lcom/facebook/analytics/ca;->c(Ljava/lang/String;)Lcom/facebook/analytics/ca;

    .line 387
    :cond_1
    return-void
.end method

.method static synthetic a(Lcom/facebook/analytics/service/i;)V
    .locals 0

    .prologue
    .line 49
    invoke-direct {p0}, Lcom/facebook/analytics/service/i;->a()V

    return-void
.end method

.method private b(J)Ljava/lang/String;
    .locals 9

    .prologue
    const-wide/16 v7, 0x3e8

    .line 472
    const-string v0, "%02d:%02d.%03d"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    const-wide/32 v3, 0xea60

    div-long v3, p1, v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x1

    div-long v3, p1, v7

    const-wide/16 v5, 0x3c

    rem-long/2addr v3, v5

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x2

    rem-long v3, p1, v7

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    aput-object v3, v1, v2

    invoke-static {v0, v1}, Lcom/facebook/common/w/m;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private b()V
    .locals 2

    .prologue
    .line 309
    invoke-direct {p0}, Lcom/facebook/analytics/service/i;->c()V

    .line 311
    iget-object v0, p0, Lcom/facebook/analytics/service/i;->a:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/analytics/service/k;

    .line 312
    invoke-interface {v0}, Lcom/facebook/analytics/service/k;->b()V

    goto :goto_0

    .line 314
    :cond_0
    return-void
.end method

.method private b(Lcom/facebook/analytics/am;)V
    .locals 2

    .prologue
    .line 301
    invoke-direct {p0}, Lcom/facebook/analytics/service/i;->c()V

    .line 303
    iget-object v0, p0, Lcom/facebook/analytics/service/i;->a:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/analytics/service/k;

    .line 304
    invoke-interface {v0, p1}, Lcom/facebook/analytics/service/k;->a(Lcom/facebook/analytics/am;)V

    goto :goto_0

    .line 306
    :cond_0
    return-void
.end method

.method private c()V
    .locals 2

    .prologue
    .line 318
    iget-object v0, p0, Lcom/facebook/analytics/service/i;->a:Ljava/util/Set;

    if-nez v0, :cond_0

    .line 319
    iget-object v0, p0, Lcom/facebook/analytics/service/i;->e:Landroid/content/Context;

    invoke-static {v0}, Lcom/facebook/inject/t;->a(Landroid/content/Context;)Lcom/facebook/inject/t;

    move-result-object v0

    .line 320
    const-class v1, Lcom/facebook/analytics/service/k;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/t;->c(Ljava/lang/Class;)Ljava/util/Set;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    iput-object v0, p0, Lcom/facebook/analytics/service/i;->a:Ljava/util/Set;

    .line 323
    :cond_0
    return-void
.end method

.method private c(Lcom/facebook/analytics/am;)V
    .locals 6

    .prologue
    .line 326
    const-string v0, "connection"

    invoke-interface {p1, v0}, Lcom/facebook/analytics/am;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "counters"

    invoke-interface {p1, v0}, Lcom/facebook/analytics/am;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 329
    iget-object v0, p0, Lcom/facebook/analytics/service/i;->l:Lcom/facebook/analytics/bq;

    invoke-interface {p1}, Lcom/facebook/analytics/am;->b()J

    move-result-wide v1

    const-string v3, "connection"

    invoke-interface {p1, v3}, Lcom/facebook/analytics/am;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lcom/facebook/analytics/service/i;->m:Lcom/fasterxml/jackson/databind/ObjectMapper;

    const-string v5, "counters"

    invoke-interface {p1, v5}, Lcom/facebook/analytics/am;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lcom/facebook/analytics/a;->a(Lcom/fasterxml/jackson/databind/ObjectMapper;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v4

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/facebook/analytics/bq;->a(JLjava/lang/String;Ljava/util/Map;)V

    .line 334
    :cond_0
    return-void
.end method

.method private d()V
    .locals 6

    .prologue
    .line 427
    iget-object v0, p0, Lcom/facebook/analytics/service/i;->f:Lcom/facebook/common/time/a;

    invoke-interface {v0}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v0

    .line 428
    invoke-direct {p0}, Lcom/facebook/analytics/service/i;->e()J

    move-result-wide v2

    sub-long v2, v0, v2

    .line 430
    const-wide/32 v4, 0x7b98a00

    cmp-long v4, v2, v4

    if-gtz v4, :cond_0

    const-wide/16 v4, 0x0

    cmp-long v2, v2, v4

    if-gez v2, :cond_1

    .line 431
    :cond_0
    sget-object v2, Lcom/facebook/analytics/service/i;->d:Ljava/lang/Class;

    const-string v3, "Attempting to clean stale events from Analytics DB."

    invoke-static {v2, v3}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 432
    iget-object v2, p0, Lcom/facebook/analytics/service/i;->h:Lcom/facebook/analytics/c/g;

    invoke-virtual {v2}, Lcom/facebook/analytics/c/g;->c()V

    .line 433
    invoke-direct {p0, v0, v1}, Lcom/facebook/analytics/service/i;->a(J)V

    .line 435
    :cond_1
    return-void
.end method

.method private d(Lcom/facebook/analytics/am;)Z
    .locals 5

    .prologue
    const/4 v0, 0x1

    .line 337
    iget-object v1, p0, Lcom/facebook/analytics/service/i;->c:Lcom/facebook/analytics/c/f;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/facebook/analytics/service/i;->c:Lcom/facebook/analytics/c/f;

    invoke-virtual {v1}, Lcom/facebook/analytics/c/f;->d()Z

    move-result v1

    if-nez v1, :cond_1

    .line 352
    :cond_0
    :goto_0
    return v0

    .line 340
    :cond_1
    iget-object v1, p0, Lcom/facebook/analytics/service/i;->c:Lcom/facebook/analytics/c/f;

    invoke-virtual {v1}, Lcom/facebook/analytics/c/f;->g()J

    move-result-wide v1

    const-wide/16 v3, 0x0

    cmp-long v1, v1, v3

    if-lez v1, :cond_2

    iget-object v1, p0, Lcom/facebook/analytics/service/i;->f:Lcom/facebook/common/time/a;

    invoke-interface {v1}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v1

    iget-object v3, p0, Lcom/facebook/analytics/service/i;->c:Lcom/facebook/analytics/c/f;

    invoke-virtual {v3}, Lcom/facebook/analytics/c/f;->g()J

    move-result-wide v3

    sub-long/2addr v1, v3

    const-wide/32 v3, 0x36ee80

    cmp-long v1, v1, v3

    if-gtz v1, :cond_0

    .line 344
    :cond_2
    invoke-interface {p1}, Lcom/facebook/analytics/am;->c()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/facebook/analytics/service/i;->c:Lcom/facebook/analytics/c/f;

    invoke-virtual {v2}, Lcom/facebook/analytics/c/f;->e()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 347
    const-string v1, "new_session"

    invoke-interface {p1, v1}, Lcom/facebook/analytics/am;->a(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 352
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private e()J
    .locals 4

    .prologue
    .line 443
    iget-wide v0, p0, Lcom/facebook/analytics/service/i;->u:J

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    .line 444
    iget-object v0, p0, Lcom/facebook/analytics/service/i;->g:Lcom/facebook/analytics/c/e;

    sget-object v1, Lcom/facebook/analytics/c/b;->h:Lcom/facebook/analytics/c/c;

    const-wide/16 v2, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lcom/facebook/analytics/c/e;->a(Lcom/facebook/common/s/a;J)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/analytics/service/i;->u:J

    .line 448
    :cond_0
    iget-wide v0, p0, Lcom/facebook/analytics/service/i;->u:J

    return-wide v0
.end method

.method private e(Lcom/facebook/analytics/am;)V
    .locals 3

    .prologue
    .line 356
    sget-object v0, Lcom/facebook/analytics/service/i;->d:Ljava/lang/Class;

    const-string v1, "Starting new Analytics Session."

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 357
    iget-object v0, p0, Lcom/facebook/analytics/service/i;->h:Lcom/facebook/analytics/c/g;

    iget-object v1, p0, Lcom/facebook/analytics/service/i;->c:Lcom/facebook/analytics/c/f;

    invoke-interface {p1}, Lcom/facebook/analytics/am;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/facebook/analytics/c/g;->a(Lcom/facebook/analytics/c/f;Ljava/lang/String;)Lcom/facebook/analytics/c/f;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/analytics/c/f;

    iput-object v0, p0, Lcom/facebook/analytics/service/i;->c:Lcom/facebook/analytics/c/f;

    .line 360
    return-void
.end method

.method private f(Lcom/facebook/analytics/am;)V
    .locals 3

    .prologue
    .line 390
    iget-object v0, p0, Lcom/facebook/analytics/service/i;->h:Lcom/facebook/analytics/c/g;

    iget-object v1, p0, Lcom/facebook/analytics/service/i;->c:Lcom/facebook/analytics/c/f;

    invoke-virtual {v1}, Lcom/facebook/analytics/c/f;->j()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/facebook/analytics/c/g;->a(Lcom/facebook/analytics/am;Ljava/lang/String;)V

    .line 391
    iget-object v0, p0, Lcom/facebook/analytics/service/i;->c:Lcom/facebook/analytics/c/f;

    invoke-virtual {v0}, Lcom/facebook/analytics/c/f;->i()V

    .line 392
    iget-object v0, p0, Lcom/facebook/analytics/service/i;->c:Lcom/facebook/analytics/c/f;

    invoke-interface {p1}, Lcom/facebook/analytics/am;->b()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/facebook/analytics/c/f;->b(J)V

    .line 393
    sget-object v0, Lcom/facebook/analytics/service/i;->d:Ljava/lang/Class;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Writing event to storage: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-interface {p1}, Lcom/facebook/analytics/am;->e()Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 394
    iget v0, p0, Lcom/facebook/analytics/service/i;->t:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/facebook/analytics/service/i;->t:I

    .line 395
    iget-object v0, p0, Lcom/facebook/analytics/service/i;->f:Lcom/facebook/common/time/a;

    invoke-interface {v0}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/analytics/service/i;->v:J

    .line 396
    invoke-direct {p0, p1}, Lcom/facebook/analytics/service/i;->b(Lcom/facebook/analytics/am;)V

    .line 397
    return-void
.end method

.method private g(Lcom/facebook/analytics/am;)Z
    .locals 1

    .prologue
    .line 400
    const-string v0, "session_timeout"

    invoke-interface {p1, v0}, Lcom/facebook/analytics/am;->a(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method private h(Lcom/facebook/analytics/am;)Z
    .locals 5

    .prologue
    const/4 v0, 0x1

    .line 404
    iget-object v1, p0, Lcom/facebook/analytics/service/i;->c:Lcom/facebook/analytics/c/f;

    invoke-virtual {v1}, Lcom/facebook/analytics/c/f;->h()J

    move-result-wide v1

    const-wide/16 v3, 0x32

    cmp-long v1, v1, v3

    if-ltz v1, :cond_1

    .line 411
    :cond_0
    :goto_0
    return v0

    .line 408
    :cond_1
    const-string v1, "truncate_batch"

    invoke-interface {p1, v1}, Lcom/facebook/analytics/am;->a(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 411
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private i(Lcom/facebook/analytics/am;)V
    .locals 4

    .prologue
    .line 415
    invoke-interface {p1}, Lcom/facebook/analytics/am;->d()Z

    move-result v0

    if-nez v0, :cond_1

    .line 416
    const-string v0, "key_ui_event"

    invoke-interface {p1, v0}, Lcom/facebook/analytics/am;->a(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/facebook/analytics/service/i;->c:Lcom/facebook/analytics/c/f;

    invoke-virtual {v0}, Lcom/facebook/analytics/c/f;->f()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    invoke-interface {p1}, Lcom/facebook/analytics/am;->b()J

    move-result-wide v0

    iget-object v2, p0, Lcom/facebook/analytics/service/i;->c:Lcom/facebook/analytics/c/f;

    invoke-virtual {v2}, Lcom/facebook/analytics/c/f;->f()J

    move-result-wide v2

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x7530

    cmp-long v0, v0, v2

    if-lez v0, :cond_1

    .line 420
    :cond_0
    iget-object v0, p0, Lcom/facebook/analytics/service/i;->c:Lcom/facebook/analytics/c/f;

    invoke-interface {p1}, Lcom/facebook/analytics/am;->b()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/facebook/analytics/c/f;->a(J)V

    .line 421
    iget-object v0, p0, Lcom/facebook/analytics/service/i;->h:Lcom/facebook/analytics/c/g;

    iget-object v1, p0, Lcom/facebook/analytics/service/i;->c:Lcom/facebook/analytics/c/f;

    invoke-virtual {v0, v1}, Lcom/facebook/analytics/c/g;->a(Lcom/facebook/analytics/c/f;)V

    .line 424
    :cond_1
    return-void
.end method


# virtual methods
.method a(JLjava/lang/String;)V
    .locals 6
    .annotation build Lcom/google/common/annotations/VisibleForTesting;
    .end annotation

    .prologue
    .line 364
    iget-object v0, p0, Lcom/facebook/analytics/service/i;->b:Ljava/util/Set;

    if-nez v0, :cond_0

    .line 365
    iget-object v0, p0, Lcom/facebook/analytics/service/i;->e:Landroid/content/Context;

    invoke-static {v0}, Lcom/facebook/inject/t;->a(Landroid/content/Context;)Lcom/facebook/inject/t;

    move-result-object v0

    .line 366
    const-class v1, Lcom/facebook/analytics/periodicreporters/l;

    const-class v2, Lcom/facebook/analytics/periodicreporters/ServicePeriodicReporters;

    invoke-virtual {v0, v1, v2}, Lcom/facebook/inject/t;->c(Ljava/lang/Class;Ljava/lang/Class;)Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/analytics/service/i;->b:Ljava/util/Set;

    .line 369
    :cond_0
    iget-object v0, p0, Lcom/facebook/analytics/service/i;->b:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/analytics/periodicreporters/l;

    .line 370
    invoke-interface {v0, p1, p2}, Lcom/facebook/analytics/periodicreporters/l;->a(J)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 371
    invoke-interface {v0, p1, p2, p3}, Lcom/facebook/analytics/periodicreporters/l;->a(JLjava/lang/String;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/analytics/ca;

    .line 372
    invoke-direct {p0, v0, p3}, Lcom/facebook/analytics/service/i;->a(Lcom/facebook/analytics/ca;Ljava/lang/String;)V

    .line 373
    sget-object v3, Lcom/facebook/analytics/service/i;->d:Ljava/lang/Class;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Injecting periodic service event: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v0}, Lcom/facebook/analytics/ca;->a()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;)V

    .line 374
    invoke-direct {p0, v0}, Lcom/facebook/analytics/service/i;->f(Lcom/facebook/analytics/am;)V

    goto :goto_0

    .line 378
    :cond_2
    return-void
.end method

.method public a(Ljava/io/PrintWriter;)V
    .locals 5

    .prologue
    .line 455
    const-string v0, "AnalyticsEventDataStore: "

    invoke-virtual {p1, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 456
    iget-object v1, p0, Lcom/facebook/analytics/service/i;->q:Ljava/lang/Object;

    monitor-enter v1

    .line 457
    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, " mIdle: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v2, p0, Lcom/facebook/analytics/service/i;->w:Z

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 458
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 459
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, " pending in-memory events: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/analytics/service/i;->k:Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-virtual {v1}, Ljava/util/concurrent/LinkedBlockingQueue;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 460
    iget-object v0, p0, Lcom/facebook/analytics/service/i;->c:Lcom/facebook/analytics/c/f;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/analytics/service/i;->c:Lcom/facebook/analytics/c/f;

    invoke-virtual {v0}, Lcom/facebook/analytics/c/f;->h()J

    move-result-wide v0

    .line 462
    :goto_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " pending events in current batch: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 463
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, " total events logged since start: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/facebook/analytics/service/i;->t:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 465
    iget-object v0, p0, Lcom/facebook/analytics/service/i;->f:Lcom/facebook/common/time/a;

    invoke-interface {v0}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/facebook/analytics/service/i;->v:J

    sub-long/2addr v0, v2

    .line 466
    const-string v2, " last event written: %s ago"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    invoke-direct {p0, v0, v1}, Lcom/facebook/analytics/service/i;->b(J)Ljava/lang/String;

    move-result-object v0

    aput-object v0, v3, v4

    invoke-static {v2, v3}, Lcom/facebook/common/w/m;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 469
    return-void

    .line 458
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    .line 460
    :cond_0
    const-wide/16 v0, 0x0

    goto :goto_0
.end method

.method public a(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<+",
            "Lcom/facebook/analytics/am;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 168
    iget-object v1, p0, Lcom/facebook/analytics/service/i;->q:Ljava/lang/Object;

    monitor-enter v1

    .line 169
    :try_start_0
    iget-object v0, p0, Lcom/facebook/analytics/service/i;->k:Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/LinkedBlockingQueue;->addAll(Ljava/util/Collection;)Z

    .line 170
    iget-boolean v0, p0, Lcom/facebook/analytics/service/i;->w:Z

    if-eqz v0, :cond_0

    .line 171
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/analytics/service/i;->w:Z

    .line 172
    iget-object v0, p0, Lcom/facebook/analytics/service/i;->j:Ljava/util/concurrent/Executor;

    iget-object v2, p0, Lcom/facebook/analytics/service/i;->r:Lcom/facebook/analytics/service/l;

    invoke-interface {v0, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 174
    :cond_0
    monitor-exit v1

    .line 175
    return-void

    .line 174
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method a(Lcom/facebook/analytics/am;)Z
    .locals 9
    .annotation build Lcom/google/common/annotations/VisibleForTesting;
    .end annotation

    .prologue
    const/4 v1, 0x0

    .line 275
    const-string v0, "throttle_key"

    invoke-interface {p1, v0}, Lcom/facebook/analytics/am;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "throttle_duration"

    invoke-interface {p1, v0}, Lcom/facebook/analytics/am;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 278
    const-string v0, "throttle_key"

    invoke-interface {p1, v0}, Lcom/facebook/analytics/am;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 281
    :try_start_0
    const-string v0, "throttle_duration"

    invoke-interface {p1, v0}, Lcom/facebook/analytics/am;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v3

    .line 287
    iget-object v0, p0, Lcom/facebook/analytics/service/i;->f:Lcom/facebook/common/time/a;

    invoke-interface {v0}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v5

    .line 288
    iget-object v0, p0, Lcom/facebook/analytics/service/i;->s:Ljava/util/Map;

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    .line 290
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v7

    sub-long v7, v5, v7

    cmp-long v0, v7, v3

    if-lez v0, :cond_1

    .line 291
    :cond_0
    iget-object v0, p0, Lcom/facebook/analytics/service/i;->s:Ljava/util/Map;

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move v0, v1

    .line 297
    :goto_0
    return v0

    .line 282
    :catch_0
    move-exception v0

    .line 283
    const-string v2, "Invalid throttle duration tag."

    invoke-static {v2, v0}, Lcom/facebook/debug/log/b;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    move v0, v1

    .line 284
    goto :goto_0

    .line 294
    :cond_1
    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    move v0, v1

    .line 297
    goto :goto_0
.end method
