.class public Lcom/facebook/analytics/service/a;
.super Ljava/lang/Object;
.source "AnalyticsEventUploader.java"

# interfaces
.implements Lcom/facebook/analytics/service/k;
.implements Lcom/facebook/base/c;


# static fields
.field static final b:Ljava/lang/String;
    .annotation build Lcom/google/common/annotations/VisibleForTesting;
    .end annotation
.end field

.field private static final c:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field

.field private static e:Z

.field private static f:Z


# instance fields
.field private A:I

.field private B:Z
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "mIdleSync"
    .end annotation
.end field

.field a:Ljava/util/Set;
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

.field private d:J

.field private final g:Landroid/content/Context;

.field private final h:Lcom/facebook/analytics/c/e;

.field private final i:Lcom/facebook/analytics/c/g;

.field private final j:Lcom/facebook/base/a/d;

.field private final k:Lcom/facebook/common/time/a;

.field private final l:Lcom/facebook/analytics/service/t;

.field private final m:Lcom/facebook/prefs/shared/d;

.field private final n:Ljava/util/concurrent/Executor;

.field private final o:Lcom/facebook/analytics/service/h;

.field private final p:Ljava/util/concurrent/LinkedBlockingQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/LinkedBlockingQueue",
            "<",
            "Lcom/facebook/analytics/am;",
            ">;"
        }
    .end annotation
.end field

.field private final q:Ljava/lang/Object;

.field private final r:Ljava/util/concurrent/ConcurrentMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentMap",
            "<",
            "Lcom/facebook/analytics/service/f;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final s:Landroid/app/AlarmManager;

.field private final t:Ljava/lang/Long;

.field private u:Z

.field private v:Z

.field private w:Z

.field private x:J

.field private y:I

.field private z:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 51
    const-class v0, Lcom/facebook/analytics/service/a;

    sput-object v0, Lcom/facebook/analytics/service/a;->c:Ljava/lang/Class;

    .line 64
    sput-boolean v1, Lcom/facebook/analytics/service/a;->e:Z

    .line 65
    sput-boolean v1, Lcom/facebook/analytics/service/a;->f:Z

    .line 111
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-class v1, Lcom/facebook/analytics/service/a;

    invoke-virtual {v1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".ACTION_ALARM"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/facebook/analytics/service/a;->b:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/facebook/analytics/c/e;Lcom/facebook/analytics/c/g;Lcom/facebook/analytics/service/t;Lcom/facebook/prefs/shared/d;Lcom/facebook/base/a/d;Lcom/facebook/common/time/a;Ljava/util/concurrent/Executor;Landroid/app/AlarmManager;Ljava/lang/Long;)V
    .locals 4

    .prologue
    const-wide/16 v2, -0x1

    const/4 v1, 0x0

    .line 124
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 62
    iput-wide v2, p0, Lcom/facebook/analytics/service/a;->d:J

    .line 87
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/facebook/analytics/service/a;->q:Ljava/lang/Object;

    .line 93
    iput-boolean v1, p0, Lcom/facebook/analytics/service/a;->u:Z

    .line 96
    iput-boolean v1, p0, Lcom/facebook/analytics/service/a;->w:Z

    .line 97
    iput-wide v2, p0, Lcom/facebook/analytics/service/a;->x:J

    .line 98
    iput v1, p0, Lcom/facebook/analytics/service/a;->y:I

    .line 99
    iput v1, p0, Lcom/facebook/analytics/service/a;->z:I

    .line 103
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/analytics/service/a;->a:Ljava/util/Set;

    .line 105
    iput v1, p0, Lcom/facebook/analytics/service/a;->A:I

    .line 107
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/analytics/service/a;->B:Z

    .line 125
    iput-object p1, p0, Lcom/facebook/analytics/service/a;->g:Landroid/content/Context;

    .line 126
    iput-object p2, p0, Lcom/facebook/analytics/service/a;->h:Lcom/facebook/analytics/c/e;

    .line 127
    iput-object p3, p0, Lcom/facebook/analytics/service/a;->i:Lcom/facebook/analytics/c/g;

    .line 128
    iput-object p6, p0, Lcom/facebook/analytics/service/a;->j:Lcom/facebook/base/a/d;

    .line 129
    iput-object p7, p0, Lcom/facebook/analytics/service/a;->k:Lcom/facebook/common/time/a;

    .line 130
    iput-object p4, p0, Lcom/facebook/analytics/service/a;->l:Lcom/facebook/analytics/service/t;

    .line 131
    iput-object p5, p0, Lcom/facebook/analytics/service/a;->m:Lcom/facebook/prefs/shared/d;

    .line 132
    iput-object p8, p0, Lcom/facebook/analytics/service/a;->n:Ljava/util/concurrent/Executor;

    .line 133
    iput-object p9, p0, Lcom/facebook/analytics/service/a;->s:Landroid/app/AlarmManager;

    .line 135
    invoke-static {}, Lcom/google/common/a/ik;->c()Ljava/util/concurrent/ConcurrentMap;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/analytics/service/a;->r:Ljava/util/concurrent/ConcurrentMap;

    .line 136
    iput-object p10, p0, Lcom/facebook/analytics/service/a;->t:Ljava/lang/Long;

    .line 137
    new-instance v0, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v0}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    iput-object v0, p0, Lcom/facebook/analytics/service/a;->p:Ljava/util/concurrent/LinkedBlockingQueue;

    .line 139
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    .line 140
    const-string v1, "android.intent.action.SCREEN_OFF"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 141
    const-string v1, "android.intent.action.SCREEN_ON"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 143
    new-instance v1, Lcom/facebook/analytics/service/h;

    invoke-direct {v1, p0, p1, v0}, Lcom/facebook/analytics/service/h;-><init>(Lcom/facebook/analytics/service/a;Landroid/content/Context;Landroid/content/IntentFilter;)V

    iput-object v1, p0, Lcom/facebook/analytics/service/a;->o:Lcom/facebook/analytics/service/h;

    .line 144
    invoke-direct {p0}, Lcom/facebook/analytics/service/a;->n()V

    .line 145
    return-void
.end method

.method static synthetic a(Lcom/facebook/analytics/service/a;J)J
    .locals 0

    .prologue
    .line 48
    iput-wide p1, p0, Lcom/facebook/analytics/service/a;->d:J

    return-wide p1
.end method

.method private a(J)V
    .locals 2

    .prologue
    .line 358
    iput-wide p1, p0, Lcom/facebook/analytics/service/a;->x:J

    .line 359
    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/facebook/analytics/service/a;->d:J

    .line 360
    iget-object v0, p0, Lcom/facebook/analytics/service/a;->h:Lcom/facebook/analytics/c/e;

    sget-object v1, Lcom/facebook/analytics/c/b;->a:Lcom/facebook/analytics/c/c;

    invoke-virtual {v0, v1, p1, p2}, Lcom/facebook/analytics/c/e;->b(Lcom/facebook/common/s/a;J)V

    .line 361
    return-void
.end method

.method static synthetic a(Lcom/facebook/analytics/service/a;)V
    .locals 0

    .prologue
    .line 48
    invoke-direct {p0}, Lcom/facebook/analytics/service/a;->h()V

    return-void
.end method

.method static synthetic a(Lcom/facebook/analytics/service/a;Z)Z
    .locals 0

    .prologue
    .line 48
    iput-boolean p1, p0, Lcom/facebook/analytics/service/a;->v:Z

    return p1
.end method

.method static synthetic a(Z)Z
    .locals 0

    .prologue
    .line 48
    sput-boolean p0, Lcom/facebook/analytics/service/a;->f:Z

    return p0
.end method

.method static synthetic b(Lcom/facebook/analytics/service/a;)Lcom/facebook/common/time/a;
    .locals 1

    .prologue
    .line 48
    iget-object v0, p0, Lcom/facebook/analytics/service/a;->k:Lcom/facebook/common/time/a;

    return-object v0
.end method

.method private b(J)Ljava/lang/String;
    .locals 9

    .prologue
    const-wide/16 v7, 0x3e8

    .line 373
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

.method static synthetic b(Lcom/facebook/analytics/service/a;Z)Z
    .locals 0

    .prologue
    .line 48
    iput-boolean p1, p0, Lcom/facebook/analytics/service/a;->w:Z

    return p1
.end method

.method static synthetic c(Lcom/facebook/analytics/service/a;)V
    .locals 0

    .prologue
    .line 48
    invoke-direct {p0}, Lcom/facebook/analytics/service/a;->j()V

    return-void
.end method

.method static synthetic d()Ljava/lang/Class;
    .locals 1

    .prologue
    .line 48
    sget-object v0, Lcom/facebook/analytics/service/a;->c:Ljava/lang/Class;

    return-object v0
.end method

.method static synthetic d(Lcom/facebook/analytics/service/a;)V
    .locals 0

    .prologue
    .line 48
    invoke-direct {p0}, Lcom/facebook/analytics/service/a;->i()V

    return-void
.end method

.method static synthetic e()Z
    .locals 1

    .prologue
    .line 48
    sget-boolean v0, Lcom/facebook/analytics/service/a;->e:Z

    return v0
.end method

.method static synthetic e(Lcom/facebook/analytics/service/a;)Z
    .locals 1

    .prologue
    .line 48
    iget-boolean v0, p0, Lcom/facebook/analytics/service/a;->B:Z

    return v0
.end method

.method static synthetic f(Lcom/facebook/analytics/service/a;)Ljava/util/concurrent/Executor;
    .locals 1

    .prologue
    .line 48
    iget-object v0, p0, Lcom/facebook/analytics/service/a;->n:Ljava/util/concurrent/Executor;

    return-object v0
.end method

.method private f()V
    .locals 2

    .prologue
    .line 186
    iget-object v0, p0, Lcom/facebook/analytics/service/a;->r:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0}, Ljava/util/concurrent/ConcurrentMap;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/analytics/service/f;

    .line 187
    invoke-interface {v0}, Lcom/facebook/analytics/service/f;->a()V

    goto :goto_0

    .line 189
    :cond_0
    return-void
.end method

.method private g()J
    .locals 4

    .prologue
    .line 192
    iget-object v0, p0, Lcom/facebook/analytics/service/a;->m:Lcom/facebook/prefs/shared/d;

    sget-object v1, Lcom/facebook/prefs/shared/aj;->m:Lcom/facebook/prefs/shared/ae;

    const-wide/32 v2, 0x493e0

    invoke-interface {v0, v1, v2, v3}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;J)J

    move-result-wide v0

    return-wide v0
.end method

.method static synthetic g(Lcom/facebook/analytics/service/a;)V
    .locals 0

    .prologue
    .line 48
    invoke-direct {p0}, Lcom/facebook/analytics/service/a;->l()V

    return-void
.end method

.method private h()V
    .locals 6
    .annotation build Lcom/google/common/annotations/VisibleForTesting;
    .end annotation

    .prologue
    const/4 v2, 0x0

    const/4 v1, 0x1

    .line 224
    iget-object v0, p0, Lcom/facebook/analytics/service/a;->j:Lcom/facebook/base/a/d;

    invoke-virtual {v0}, Lcom/facebook/base/a/d;->b()V

    .line 226
    iget-object v0, p0, Lcom/facebook/analytics/service/a;->i:Lcom/facebook/analytics/c/g;

    invoke-virtual {v0}, Lcom/facebook/analytics/c/g;->a()I

    move-result v0

    iput v0, p0, Lcom/facebook/analytics/service/a;->z:I

    .line 228
    sget-object v0, Lcom/facebook/analytics/service/a;->c:Ljava/lang/Class;

    const-string v3, "Running processor thread. %d events pending from DB."

    new-array v4, v1, [Ljava/lang/Object;

    iget v5, p0, Lcom/facebook/analytics/service/a;->z:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v4, v2

    invoke-static {v0, v3, v4}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 231
    :cond_0
    :goto_0
    :try_start_0
    iget-object v0, p0, Lcom/facebook/analytics/service/a;->p:Ljava/util/concurrent/LinkedBlockingQueue;

    iget-object v3, p0, Lcom/facebook/analytics/service/a;->t:Ljava/lang/Long;

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    sget-object v5, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v3, v4, v5}, Ljava/util/concurrent/LinkedBlockingQueue;->poll(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/analytics/am;

    .line 233
    if-eqz v0, :cond_5

    .line 235
    const-string v3, "resume_upload"

    invoke-interface {v0, v3}, Lcom/facebook/analytics/am;->a(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 236
    sget-object v3, Lcom/facebook/analytics/service/a;->c:Ljava/lang/Class;

    const-string v4, "Resuming upload due to RESUME_UPLOAD tag."

    invoke-static {v3, v4}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;)V

    .line 237
    const/4 v3, 0x0

    iput-boolean v3, p0, Lcom/facebook/analytics/service/a;->u:Z

    move v3, v1

    .line 245
    :goto_1
    const-string v4, "upload_batch_now"

    invoke-interface {v0, v4}, Lcom/facebook/analytics/am;->a(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 246
    sget-object v4, Lcom/facebook/analytics/service/a;->c:Ljava/lang/Class;

    const-string v5, "Forcing upload due to EVENT_UPLOAD_BATCH_NOW_TAG tag."

    invoke-static {v4, v5}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;)V

    .line 247
    const/4 v4, 0x1

    iput-boolean v4, p0, Lcom/facebook/analytics/service/a;->w:Z

    .line 250
    :cond_1
    invoke-virtual {p0}, Lcom/facebook/analytics/service/a;->c()Z

    move-result v4

    if-eqz v4, :cond_2

    .line 251
    invoke-direct {p0}, Lcom/facebook/analytics/service/a;->l()V

    .line 254
    :cond_2
    const-string v4, "stop_upload"

    invoke-interface {v0, v4}, Lcom/facebook/analytics/am;->a(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_4

    .line 255
    sget-object v0, Lcom/facebook/analytics/service/a;->c:Ljava/lang/Class;

    const-string v3, "Stopping upload due to STOP_UPLOAD tag."

    invoke-static {v0, v3}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;)V

    .line 256
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/analytics/service/a;->u:Z
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 275
    :catch_0
    move-exception v0

    .line 276
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    .line 280
    :goto_2
    return-void

    .line 238
    :cond_3
    :try_start_1
    const-string v3, "resume_upload_temporary"

    invoke-interface {v0, v3}, Lcom/facebook/analytics/am;->a(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_7

    .line 239
    sget-object v3, Lcom/facebook/analytics/service/a;->c:Ljava/lang/Class;

    const-string v4, "Temporarily resuming upload due to RESUME_UPLOAD_TEMPORARY tag."

    invoke-static {v3, v4}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;)V

    .line 240
    iget-boolean v3, p0, Lcom/facebook/analytics/service/a;->u:Z

    .line 241
    const/4 v4, 0x0

    iput-boolean v4, p0, Lcom/facebook/analytics/service/a;->u:Z

    goto :goto_1

    .line 257
    :cond_4
    const-string v4, "resume_upload_temporary"

    invoke-interface {v0, v4}, Lcom/facebook/analytics/am;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 258
    iput-boolean v3, p0, Lcom/facebook/analytics/service/a;->u:Z

    goto :goto_0

    .line 262
    :cond_5
    iget-object v3, p0, Lcom/facebook/analytics/service/a;->q:Ljava/lang/Object;

    monitor-enter v3
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0

    .line 263
    :try_start_2
    iget-object v0, p0, Lcom/facebook/analytics/service/a;->p:Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-virtual {v0}, Ljava/util/concurrent/LinkedBlockingQueue;->size()I

    move-result v0

    if-nez v0, :cond_6

    .line 264
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/analytics/service/a;->B:Z

    move v0, v1

    .line 266
    :goto_3
    monitor-exit v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 267
    if-eqz v0, :cond_0

    .line 268
    :try_start_3
    sget-object v0, Lcom/facebook/analytics/service/a;->c:Ljava/lang/Class;

    const-string v1, "No more events pending. Stopping thread."

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;)V

    .line 270
    invoke-direct {p0}, Lcom/facebook/analytics/service/a;->f()V
    :try_end_3
    .catch Ljava/lang/InterruptedException; {:try_start_3 .. :try_end_3} :catch_0

    goto :goto_2

    .line 266
    :catchall_0
    move-exception v0

    :try_start_4
    monitor-exit v3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :try_start_5
    throw v0
    :try_end_5
    .catch Ljava/lang/InterruptedException; {:try_start_5 .. :try_end_5} :catch_0

    :cond_6
    move v0, v2

    goto :goto_3

    :cond_7
    move v3, v1

    goto :goto_1
.end method

.method private i()V
    .locals 7

    .prologue
    .line 309
    iget-object v0, p0, Lcom/facebook/analytics/service/a;->s:Landroid/app/AlarmManager;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/facebook/analytics/service/a;->k:Lcom/facebook/common/time/a;

    invoke-interface {v2}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v2

    const-wide/32 v4, 0x36ee80

    invoke-direct {p0}, Lcom/facebook/analytics/service/a;->k()Landroid/app/PendingIntent;

    move-result-object v6

    invoke-virtual/range {v0 .. v6}, Landroid/app/AlarmManager;->setInexactRepeating(IJJLandroid/app/PendingIntent;)V

    .line 316
    sget-object v0, Lcom/facebook/analytics/service/a;->c:Ljava/lang/Class;

    const-string v1, "Setting alarm with one hour interval"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;)V

    .line 317
    const/4 v0, 0x1

    sput-boolean v0, Lcom/facebook/analytics/service/a;->e:Z

    .line 318
    return-void
.end method

.method private j()V
    .locals 2

    .prologue
    .line 324
    iget-object v0, p0, Lcom/facebook/analytics/service/a;->s:Landroid/app/AlarmManager;

    invoke-direct {p0}, Lcom/facebook/analytics/service/a;->k()Landroid/app/PendingIntent;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/AlarmManager;->cancel(Landroid/app/PendingIntent;)V

    .line 325
    const/4 v0, 0x0

    sput-boolean v0, Lcom/facebook/analytics/service/a;->e:Z

    .line 326
    return-void
.end method

.method private k()Landroid/app/PendingIntent;
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 329
    new-instance v0, Landroid/content/Intent;

    sget-object v1, Lcom/facebook/analytics/service/a;->b:Ljava/lang/String;

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 330
    iget-object v1, p0, Lcom/facebook/analytics/service/a;->g:Landroid/content/Context;

    invoke-static {v1, v2, v0, v2}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v0

    return-object v0
.end method

.method private l()V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 339
    iget-object v0, p0, Lcom/facebook/analytics/service/a;->k:Lcom/facebook/common/time/a;

    invoke-interface {v0}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v0

    invoke-direct {p0, v0, v1}, Lcom/facebook/analytics/service/a;->a(J)V

    .line 341
    sget-object v0, Lcom/facebook/analytics/service/a;->c:Ljava/lang/Class;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Uploading analytics report with "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lcom/facebook/analytics/service/a;->z:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " events."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 342
    iget-object v0, p0, Lcom/facebook/analytics/service/a;->l:Lcom/facebook/analytics/service/t;

    invoke-interface {v0}, Lcom/facebook/analytics/service/t;->a()V

    .line 344
    iput v3, p0, Lcom/facebook/analytics/service/a;->z:I

    .line 349
    sget-boolean v0, Lcom/facebook/analytics/service/a;->f:Z

    if-eqz v0, :cond_0

    .line 350
    sput-boolean v3, Lcom/facebook/analytics/service/a;->f:Z

    .line 351
    invoke-direct {p0}, Lcom/facebook/analytics/service/a;->i()V

    .line 354
    :cond_0
    iput-boolean v3, p0, Lcom/facebook/analytics/service/a;->w:Z

    .line 355
    return-void
.end method

.method private m()J
    .locals 4

    .prologue
    .line 364
    iget-wide v0, p0, Lcom/facebook/analytics/service/a;->x:J

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    .line 365
    iget-object v0, p0, Lcom/facebook/analytics/service/a;->h:Lcom/facebook/analytics/c/e;

    sget-object v1, Lcom/facebook/analytics/c/b;->a:Lcom/facebook/analytics/c/c;

    const-wide/16 v2, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lcom/facebook/analytics/c/e;->a(Lcom/facebook/common/s/a;J)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/analytics/service/a;->x:J

    .line 369
    :cond_0
    iget-wide v0, p0, Lcom/facebook/analytics/service/a;->x:J

    return-wide v0
.end method

.method private n()V
    .locals 2

    .prologue
    .line 398
    iget-object v0, p0, Lcom/facebook/analytics/service/a;->g:Landroid/content/Context;

    const-string v1, "power"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/PowerManager;

    .line 399
    invoke-virtual {v0}, Landroid/os/PowerManager;->isScreenOn()Z

    move-result v0

    iput-boolean v0, p0, Lcom/facebook/analytics/service/a;->v:Z

    .line 400
    return-void
.end method


# virtual methods
.method public a()V
    .locals 4

    .prologue
    .line 171
    iget-object v0, p0, Lcom/facebook/analytics/service/a;->o:Lcom/facebook/analytics/service/h;

    invoke-virtual {v0}, Lcom/facebook/analytics/service/h;->a()V

    .line 172
    iget-object v0, p0, Lcom/facebook/analytics/service/a;->g:Landroid/content/Context;

    new-instance v1, Lcom/facebook/analytics/service/e;

    invoke-direct {v1, p0}, Lcom/facebook/analytics/service/e;-><init>(Lcom/facebook/analytics/service/a;)V

    new-instance v2, Landroid/content/IntentFilter;

    sget-object v3, Lcom/facebook/analytics/service/a;->b:Ljava/lang/String;

    invoke-direct {v2, v3}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 174
    invoke-direct {p0}, Lcom/facebook/analytics/service/a;->n()V

    .line 175
    return-void
.end method

.method public a(Lcom/facebook/analytics/am;)V
    .locals 0

    .prologue
    .line 149
    invoke-virtual {p0, p1}, Lcom/facebook/analytics/service/a;->b(Lcom/facebook/analytics/am;)V

    .line 150
    return-void
.end method

.method public a(Lcom/facebook/analytics/service/f;)V
    .locals 2

    .prologue
    .line 178
    iget-object v0, p0, Lcom/facebook/analytics/service/a;->r:Ljava/util/concurrent/ConcurrentMap;

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {v0, p1, v1}, Ljava/util/concurrent/ConcurrentMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 179
    return-void
.end method

.method public a(Ljava/io/PrintWriter;)V
    .locals 5

    .prologue
    .line 383
    const-string v0, "AnalyticsEventUploader: "

    invoke-virtual {p1, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 384
    iget-object v1, p0, Lcom/facebook/analytics/service/a;->q:Ljava/lang/Object;

    monitor-enter v1

    .line 385
    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, " idle: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v2, p0, Lcom/facebook/analytics/service/a;->B:Z

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 386
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 387
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, " pending batch event count: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/facebook/analytics/service/a;->y:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 388
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, " pending upload event count: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/facebook/analytics/service/a;->z:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 389
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, " total count: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/facebook/analytics/service/a;->A:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 390
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, " upload disabled: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v1, p0, Lcom/facebook/analytics/service/a;->u:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 392
    iget-object v0, p0, Lcom/facebook/analytics/service/a;->k:Lcom/facebook/common/time/a;

    invoke-interface {v0}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/facebook/analytics/service/a;->x:J

    sub-long/2addr v0, v2

    .line 393
    const-string v2, " last sent: %s ago"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    invoke-direct {p0, v0, v1}, Lcom/facebook/analytics/service/a;->b(J)Ljava/lang/String;

    move-result-object v0

    aput-object v0, v3, v4

    invoke-static {v2, v3}, Lcom/facebook/common/w/m;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 395
    return-void

    .line 386
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public b()V
    .locals 1

    .prologue
    .line 154
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/facebook/analytics/service/a;->b(Lcom/facebook/analytics/am;)V

    .line 155
    return-void
.end method

.method public b(Lcom/facebook/analytics/am;)V
    .locals 4
    .param p1    # Lcom/facebook/analytics/am;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 158
    iget-object v1, p0, Lcom/facebook/analytics/service/a;->q:Ljava/lang/Object;

    monitor-enter v1

    .line 159
    if-eqz p1, :cond_0

    .line 160
    :try_start_0
    iget-object v0, p0, Lcom/facebook/analytics/service/a;->p:Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/LinkedBlockingQueue;->add(Ljava/lang/Object;)Z

    .line 162
    :cond_0
    iget-boolean v0, p0, Lcom/facebook/analytics/service/a;->B:Z

    if-eqz v0, :cond_1

    .line 163
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/analytics/service/a;->B:Z

    .line 164
    iget-object v0, p0, Lcom/facebook/analytics/service/a;->n:Ljava/util/concurrent/Executor;

    new-instance v2, Lcom/facebook/analytics/service/g;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3}, Lcom/facebook/analytics/service/g;-><init>(Lcom/facebook/analytics/service/a;Lcom/facebook/analytics/service/b;)V

    invoke-interface {v0, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 166
    :cond_1
    monitor-exit v1

    .line 167
    return-void

    .line 166
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public b(Lcom/facebook/analytics/service/f;)V
    .locals 1

    .prologue
    .line 182
    iget-object v0, p0, Lcom/facebook/analytics/service/a;->r:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0, p1}, Ljava/util/concurrent/ConcurrentMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 183
    return-void
.end method

.method c()Z
    .locals 8
    .annotation build Lcom/google/common/annotations/VisibleForTesting;
    .end annotation

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 283
    iget-boolean v2, p0, Lcom/facebook/analytics/service/a;->w:Z

    if-eqz v2, :cond_1

    .line 301
    :cond_0
    :goto_0
    return v0

    .line 286
    :cond_1
    iget-boolean v2, p0, Lcom/facebook/analytics/service/a;->u:Z

    if-eqz v2, :cond_2

    move v0, v1

    .line 287
    goto :goto_0

    .line 289
    :cond_2
    iget-boolean v2, p0, Lcom/facebook/analytics/service/a;->v:Z

    if-eqz v2, :cond_4

    .line 290
    iget-object v2, p0, Lcom/facebook/analytics/service/a;->k:Lcom/facebook/common/time/a;

    invoke-interface {v2}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v2

    .line 292
    iget-wide v4, p0, Lcom/facebook/analytics/service/a;->d:J

    const-wide/16 v6, -0x1

    cmp-long v4, v4, v6

    if-eqz v4, :cond_3

    .line 293
    iget-wide v4, p0, Lcom/facebook/analytics/service/a;->d:J

    sub-long/2addr v2, v4

    const-wide/16 v4, 0x2710

    cmp-long v2, v2, v4

    if-gtz v2, :cond_0

    move v0, v1

    goto :goto_0

    .line 294
    :cond_3
    invoke-direct {p0}, Lcom/facebook/analytics/service/a;->m()J

    move-result-wide v4

    sub-long/2addr v2, v4

    invoke-direct {p0}, Lcom/facebook/analytics/service/a;->g()J

    move-result-wide v4

    cmp-long v2, v2, v4

    if-gtz v2, :cond_0

    :cond_4
    move v0, v1

    .line 301
    goto :goto_0
.end method
