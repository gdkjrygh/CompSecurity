.class public Lcom/facebook/push/mqtt/ca;
.super Ljava/lang/Object;
.source "MqttPushServiceManager.java"

# interfaces
.implements Lcom/facebook/base/c;


# annotations
.annotation build Ljavax/annotation/concurrent/NotThreadSafe;
.end annotation


# static fields
.field public static final a:Ljava/lang/String;

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

.field private final e:Ljava/util/concurrent/ScheduledExecutorService;

.field private final f:Lcom/facebook/push/mqtt/v;

.field private final g:Lcom/facebook/common/v/a;

.field private final h:Lcom/facebook/common/v/d;

.field private final i:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/push/mqtt/ar;",
            ">;"
        }
    .end annotation
.end field

.field private final j:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final k:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Lcom/facebook/push/mqtt/m;",
            ">;"
        }
    .end annotation
.end field

.field private final l:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Lcom/facebook/push/mqtt/i;",
            ">;"
        }
    .end annotation
.end field

.field private m:Lcom/facebook/base/broadcast/q;

.field private n:Z

.field private o:Z

.field private p:Lcom/facebook/push/mqtt/cg;

.field private q:Lcom/facebook/push/mqtt/cg;

.field private r:Ljava/util/concurrent/ScheduledFuture;

.field private s:Ljava/util/concurrent/ScheduledFuture;

.field private final t:Ljava/lang/Runnable;

.field private final u:Ljava/lang/Runnable;

.field private v:Ljava/util/concurrent/ScheduledFuture;

.field private final w:Ljava/lang/Runnable;

.field private x:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet",
            "<",
            "Lcom/facebook/mqtt/messages/SubscribeTopic;",
            ">;"
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
    .line 49
    const-class v0, Lcom/facebook/push/mqtt/ca;

    sput-object v0, Lcom/facebook/push/mqtt/ca;->b:Ljava/lang/Class;

    .line 56
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-class v1, Lcom/facebook/push/mqtt/ca;

    invoke-virtual {v1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".ACTION_WAKEUP"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/facebook/push/mqtt/ca;->a:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/facebook/common/time/a;Ljava/util/concurrent/ScheduledExecutorService;Lcom/facebook/push/mqtt/v;Lcom/facebook/common/v/a;Lcom/facebook/common/v/d;Ljavax/inject/a;Ljavax/inject/a;Ljava/util/Set;Ljava/util/Set;)V
    .locals 1
    .param p3    # Ljava/util/concurrent/ScheduledExecutorService;
        .annotation runtime Lcom/facebook/common/executors/ForUiThreadWakeup;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/facebook/common/time/a;",
            "Ljava/util/concurrent/ScheduledExecutorService;",
            "Lcom/facebook/push/mqtt/v;",
            "Lcom/facebook/common/v/a;",
            "Lcom/facebook/common/v/d;",
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/push/mqtt/ar;",
            ">;",
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Set",
            "<",
            "Lcom/facebook/push/mqtt/m;",
            ">;",
            "Ljava/util/Set",
            "<",
            "Lcom/facebook/push/mqtt/i;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 133
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 86
    sget-object v0, Lcom/facebook/push/mqtt/cg;->STOPPED:Lcom/facebook/push/mqtt/cg;

    iput-object v0, p0, Lcom/facebook/push/mqtt/ca;->p:Lcom/facebook/push/mqtt/cg;

    .line 87
    sget-object v0, Lcom/facebook/push/mqtt/cg;->STOPPED:Lcom/facebook/push/mqtt/cg;

    iput-object v0, p0, Lcom/facebook/push/mqtt/ca;->q:Lcom/facebook/push/mqtt/cg;

    .line 90
    new-instance v0, Lcom/facebook/push/mqtt/cb;

    invoke-direct {v0, p0}, Lcom/facebook/push/mqtt/cb;-><init>(Lcom/facebook/push/mqtt/ca;)V

    iput-object v0, p0, Lcom/facebook/push/mqtt/ca;->t:Ljava/lang/Runnable;

    .line 96
    new-instance v0, Lcom/facebook/push/mqtt/cc;

    invoke-direct {v0, p0}, Lcom/facebook/push/mqtt/cc;-><init>(Lcom/facebook/push/mqtt/ca;)V

    iput-object v0, p0, Lcom/facebook/push/mqtt/ca;->u:Ljava/lang/Runnable;

    .line 107
    new-instance v0, Lcom/facebook/push/mqtt/cd;

    invoke-direct {v0, p0}, Lcom/facebook/push/mqtt/cd;-><init>(Lcom/facebook/push/mqtt/ca;)V

    iput-object v0, p0, Lcom/facebook/push/mqtt/ca;->w:Ljava/lang/Runnable;

    .line 114
    invoke-static {}, Lcom/google/common/a/kl;->a()Ljava/util/HashSet;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/push/mqtt/ca;->x:Ljava/util/HashSet;

    .line 134
    iput-object p1, p0, Lcom/facebook/push/mqtt/ca;->c:Landroid/content/Context;

    .line 135
    iput-object p2, p0, Lcom/facebook/push/mqtt/ca;->d:Lcom/facebook/common/time/a;

    .line 136
    iput-object p3, p0, Lcom/facebook/push/mqtt/ca;->e:Ljava/util/concurrent/ScheduledExecutorService;

    .line 137
    iput-object p4, p0, Lcom/facebook/push/mqtt/ca;->f:Lcom/facebook/push/mqtt/v;

    .line 138
    iput-object p5, p0, Lcom/facebook/push/mqtt/ca;->g:Lcom/facebook/common/v/a;

    .line 139
    iput-object p6, p0, Lcom/facebook/push/mqtt/ca;->h:Lcom/facebook/common/v/d;

    .line 140
    iput-object p7, p0, Lcom/facebook/push/mqtt/ca;->i:Ljavax/inject/a;

    .line 141
    iput-object p8, p0, Lcom/facebook/push/mqtt/ca;->j:Ljavax/inject/a;

    .line 142
    iput-object p9, p0, Lcom/facebook/push/mqtt/ca;->k:Ljava/util/Set;

    .line 143
    iput-object p10, p0, Lcom/facebook/push/mqtt/ca;->l:Ljava/util/Set;

    .line 144
    return-void
.end method

.method static synthetic a(Lcom/facebook/push/mqtt/ca;)V
    .locals 0

    .prologue
    .line 48
    invoke-direct {p0}, Lcom/facebook/push/mqtt/ca;->e()V

    return-void
.end method

.method static synthetic a(Lcom/facebook/push/mqtt/ca;Lcom/facebook/push/mqtt/cj;)V
    .locals 0

    .prologue
    .line 48
    invoke-direct {p0, p1}, Lcom/facebook/push/mqtt/ca;->a(Lcom/facebook/push/mqtt/cj;)V

    return-void
.end method

.method private a(Lcom/facebook/push/mqtt/cj;)V
    .locals 2

    .prologue
    .line 470
    sget-object v0, Lcom/facebook/push/mqtt/cf;->a:[I

    invoke-virtual {p1}, Lcom/facebook/push/mqtt/cj;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 478
    :goto_0
    return-void

    .line 472
    :pswitch_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/push/mqtt/ca;->o:Z

    goto :goto_0

    .line 475
    :pswitch_1
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/push/mqtt/ca;->o:Z

    goto :goto_0

    .line 470
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method private declared-synchronized a(Ljava/util/Collection;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<",
            "Lcom/facebook/mqtt/messages/SubscribeTopic;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 453
    monitor-enter p0

    :try_start_0
    sget-object v0, Lcom/facebook/push/mqtt/ca;->b:Ljava/lang/Class;

    const-string v1, "Subscribing to %s"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-static {v0, v1, v2}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 454
    iget-object v0, p0, Lcom/facebook/push/mqtt/ca;->x:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->addAll(Ljava/util/Collection;)Z

    .line 455
    iget-object v0, p0, Lcom/facebook/push/mqtt/ca;->f:Lcom/facebook/push/mqtt/v;

    invoke-virtual {v0, p1}, Lcom/facebook/push/mqtt/v;->a(Ljava/util/Collection;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 456
    monitor-exit p0

    return-void

    .line 453
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method private b()Lcom/facebook/push/mqtt/cg;
    .locals 4

    .prologue
    .line 202
    iget-object v0, p0, Lcom/facebook/push/mqtt/ca;->g:Lcom/facebook/common/v/a;

    invoke-virtual {v0}, Lcom/facebook/common/v/a;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 203
    sget-object v0, Lcom/facebook/push/mqtt/cg;->ACTIVE:Lcom/facebook/push/mqtt/cg;

    .line 208
    :goto_0
    return-object v0

    .line 205
    :cond_0
    iget-object v0, p0, Lcom/facebook/push/mqtt/ca;->d:Lcom/facebook/common/time/a;

    invoke-interface {v0}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v0

    iget-object v2, p0, Lcom/facebook/push/mqtt/ca;->g:Lcom/facebook/common/v/a;

    invoke-virtual {v2}, Lcom/facebook/common/v/a;->e()J

    move-result-wide v2

    sub-long/2addr v0, v2

    const-wide/32 v2, 0x1d4c0

    cmp-long v0, v0, v2

    if-gez v0, :cond_1

    .line 206
    sget-object v0, Lcom/facebook/push/mqtt/cg;->PAUSED:Lcom/facebook/push/mqtt/cg;

    goto :goto_0

    .line 208
    :cond_1
    sget-object v0, Lcom/facebook/push/mqtt/cg;->STOPPED:Lcom/facebook/push/mqtt/cg;

    goto :goto_0
.end method

.method static synthetic b(Lcom/facebook/push/mqtt/ca;)V
    .locals 0

    .prologue
    .line 48
    invoke-direct {p0}, Lcom/facebook/push/mqtt/ca;->p()V

    return-void
.end method

.method private declared-synchronized b(Ljava/util/Collection;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<",
            "Lcom/facebook/mqtt/messages/SubscribeTopic;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 459
    monitor-enter p0

    :try_start_0
    sget-object v0, Lcom/facebook/push/mqtt/ca;->b:Ljava/lang/Class;

    const-string v1, "Unsubscribing from %s"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-static {v0, v1, v2}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 460
    iget-object v0, p0, Lcom/facebook/push/mqtt/ca;->x:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->removeAll(Ljava/util/Collection;)Z

    .line 461
    iget-object v0, p0, Lcom/facebook/push/mqtt/ca;->f:Lcom/facebook/push/mqtt/v;

    invoke-virtual {v0, p1}, Lcom/facebook/push/mqtt/v;->b(Ljava/util/Collection;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 462
    monitor-exit p0

    return-void

    .line 459
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method private c()Lcom/facebook/push/mqtt/cg;
    .locals 4

    .prologue
    .line 214
    iget-object v0, p0, Lcom/facebook/push/mqtt/ca;->h:Lcom/facebook/common/v/d;

    invoke-virtual {v0}, Lcom/facebook/common/v/d;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 215
    sget-object v0, Lcom/facebook/push/mqtt/cg;->ACTIVE:Lcom/facebook/push/mqtt/cg;

    .line 220
    :goto_0
    return-object v0

    .line 217
    :cond_0
    iget-object v0, p0, Lcom/facebook/push/mqtt/ca;->d:Lcom/facebook/common/time/a;

    invoke-interface {v0}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v0

    iget-object v2, p0, Lcom/facebook/push/mqtt/ca;->h:Lcom/facebook/common/v/d;

    invoke-virtual {v2}, Lcom/facebook/common/v/d;->a()J

    move-result-wide v2

    sub-long/2addr v0, v2

    const-wide/32 v2, 0x1d4c0

    cmp-long v0, v0, v2

    if-gez v0, :cond_1

    .line 218
    sget-object v0, Lcom/facebook/push/mqtt/cg;->PAUSED:Lcom/facebook/push/mqtt/cg;

    goto :goto_0

    .line 220
    :cond_1
    sget-object v0, Lcom/facebook/push/mqtt/cg;->STOPPED:Lcom/facebook/push/mqtt/cg;

    goto :goto_0
.end method

.method static synthetic c(Lcom/facebook/push/mqtt/ca;)V
    .locals 0

    .prologue
    .line 48
    invoke-direct {p0}, Lcom/facebook/push/mqtt/ca;->d()V

    return-void
.end method

.method private d()V
    .locals 1

    .prologue
    .line 226
    iget-boolean v0, p0, Lcom/facebook/push/mqtt/ca;->o:Z

    if-eqz v0, :cond_1

    invoke-direct {p0}, Lcom/facebook/push/mqtt/ca;->s()Z

    move-result v0

    if-nez v0, :cond_1

    .line 227
    invoke-direct {p0}, Lcom/facebook/push/mqtt/ca;->q()V

    .line 235
    :cond_0
    :goto_0
    return-void

    .line 228
    :cond_1
    invoke-direct {p0}, Lcom/facebook/push/mqtt/ca;->s()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 229
    iget-boolean v0, p0, Lcom/facebook/push/mqtt/ca;->o:Z

    if-nez v0, :cond_2

    .line 230
    invoke-direct {p0}, Lcom/facebook/push/mqtt/ca;->n()V

    goto :goto_0

    .line 232
    :cond_2
    invoke-direct {p0}, Lcom/facebook/push/mqtt/ca;->o()V

    goto :goto_0
.end method

.method private e()V
    .locals 6

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 253
    iget-object v0, p0, Lcom/facebook/push/mqtt/ca;->p:Lcom/facebook/push/mqtt/cg;

    .line 254
    iget-object v3, p0, Lcom/facebook/push/mqtt/ca;->q:Lcom/facebook/push/mqtt/cg;

    .line 255
    invoke-direct {p0}, Lcom/facebook/push/mqtt/ca;->b()Lcom/facebook/push/mqtt/cg;

    move-result-object v4

    iput-object v4, p0, Lcom/facebook/push/mqtt/ca;->p:Lcom/facebook/push/mqtt/cg;

    .line 256
    invoke-direct {p0}, Lcom/facebook/push/mqtt/ca;->c()Lcom/facebook/push/mqtt/cg;

    move-result-object v4

    iput-object v4, p0, Lcom/facebook/push/mqtt/ca;->q:Lcom/facebook/push/mqtt/cg;

    .line 260
    iget-object v4, p0, Lcom/facebook/push/mqtt/ca;->p:Lcom/facebook/push/mqtt/cg;

    sget-object v5, Lcom/facebook/push/mqtt/cg;->ACTIVE:Lcom/facebook/push/mqtt/cg;

    if-ne v4, v5, :cond_0

    .line 261
    sget-object v4, Lcom/facebook/push/mqtt/cg;->ACTIVE:Lcom/facebook/push/mqtt/cg;

    iput-object v4, p0, Lcom/facebook/push/mqtt/ca;->q:Lcom/facebook/push/mqtt/cg;

    .line 264
    :cond_0
    iget-object v4, p0, Lcom/facebook/push/mqtt/ca;->q:Lcom/facebook/push/mqtt/cg;

    sget-object v5, Lcom/facebook/push/mqtt/cg;->PAUSED:Lcom/facebook/push/mqtt/cg;

    if-ne v4, v5, :cond_1

    iget-object v4, p0, Lcom/facebook/push/mqtt/ca;->p:Lcom/facebook/push/mqtt/cg;

    sget-object v5, Lcom/facebook/push/mqtt/cg;->ACTIVE:Lcom/facebook/push/mqtt/cg;

    if-ne v4, v5, :cond_1

    .line 266
    sget-object v4, Lcom/facebook/push/mqtt/cg;->PAUSED:Lcom/facebook/push/mqtt/cg;

    iput-object v4, p0, Lcom/facebook/push/mqtt/ca;->p:Lcom/facebook/push/mqtt/cg;

    .line 269
    :cond_1
    iget-object v4, p0, Lcom/facebook/push/mqtt/ca;->q:Lcom/facebook/push/mqtt/cg;

    sget-object v5, Lcom/facebook/push/mqtt/cg;->STOPPED:Lcom/facebook/push/mqtt/cg;

    if-ne v4, v5, :cond_2

    .line 270
    sget-object v4, Lcom/facebook/push/mqtt/cg;->STOPPED:Lcom/facebook/push/mqtt/cg;

    iput-object v4, p0, Lcom/facebook/push/mqtt/ca;->p:Lcom/facebook/push/mqtt/cg;

    .line 273
    :cond_2
    iget-object v4, p0, Lcom/facebook/push/mqtt/ca;->p:Lcom/facebook/push/mqtt/cg;

    if-eq v4, v0, :cond_4

    move v0, v1

    .line 274
    :goto_0
    iget-object v4, p0, Lcom/facebook/push/mqtt/ca;->q:Lcom/facebook/push/mqtt/cg;

    if-eq v4, v3, :cond_5

    .line 275
    :goto_1
    if-nez v0, :cond_6

    if-nez v1, :cond_6

    .line 299
    :cond_3
    :goto_2
    return-void

    :cond_4
    move v0, v2

    .line 273
    goto :goto_0

    :cond_5
    move v1, v2

    .line 274
    goto :goto_1

    .line 280
    :cond_6
    iget-object v2, p0, Lcom/facebook/push/mqtt/ca;->q:Lcom/facebook/push/mqtt/cg;

    sget-object v3, Lcom/facebook/push/mqtt/cg;->ACTIVE:Lcom/facebook/push/mqtt/cg;

    if-ne v2, v3, :cond_7

    if-eqz v1, :cond_7

    .line 281
    invoke-direct {p0}, Lcom/facebook/push/mqtt/ca;->f()V

    .line 283
    :cond_7
    iget-object v2, p0, Lcom/facebook/push/mqtt/ca;->p:Lcom/facebook/push/mqtt/cg;

    sget-object v3, Lcom/facebook/push/mqtt/cg;->ACTIVE:Lcom/facebook/push/mqtt/cg;

    if-ne v2, v3, :cond_8

    if-eqz v0, :cond_8

    .line 284
    invoke-direct {p0}, Lcom/facebook/push/mqtt/ca;->g()V

    .line 286
    :cond_8
    iget-object v2, p0, Lcom/facebook/push/mqtt/ca;->p:Lcom/facebook/push/mqtt/cg;

    sget-object v3, Lcom/facebook/push/mqtt/cg;->PAUSED:Lcom/facebook/push/mqtt/cg;

    if-ne v2, v3, :cond_9

    if-eqz v0, :cond_9

    .line 287
    invoke-direct {p0}, Lcom/facebook/push/mqtt/ca;->h()V

    .line 289
    :cond_9
    iget-object v2, p0, Lcom/facebook/push/mqtt/ca;->q:Lcom/facebook/push/mqtt/cg;

    sget-object v3, Lcom/facebook/push/mqtt/cg;->PAUSED:Lcom/facebook/push/mqtt/cg;

    if-ne v2, v3, :cond_a

    if-eqz v1, :cond_a

    .line 290
    invoke-direct {p0}, Lcom/facebook/push/mqtt/ca;->i()V

    .line 292
    :cond_a
    iget-object v2, p0, Lcom/facebook/push/mqtt/ca;->p:Lcom/facebook/push/mqtt/cg;

    sget-object v3, Lcom/facebook/push/mqtt/cg;->STOPPED:Lcom/facebook/push/mqtt/cg;

    if-ne v2, v3, :cond_b

    if-eqz v0, :cond_b

    .line 293
    invoke-direct {p0}, Lcom/facebook/push/mqtt/ca;->j()V

    .line 295
    :cond_b
    iget-object v0, p0, Lcom/facebook/push/mqtt/ca;->q:Lcom/facebook/push/mqtt/cg;

    sget-object v2, Lcom/facebook/push/mqtt/cg;->STOPPED:Lcom/facebook/push/mqtt/cg;

    if-ne v0, v2, :cond_3

    if-eqz v1, :cond_3

    .line 296
    invoke-direct {p0}, Lcom/facebook/push/mqtt/ca;->k()V

    goto :goto_2
.end method

.method private f()V
    .locals 2

    .prologue
    .line 302
    sget-object v0, Lcom/facebook/push/mqtt/ca;->b:Ljava/lang/Class;

    const-string v1, "Device is now active"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;)V

    .line 304
    iget-object v0, p0, Lcom/facebook/push/mqtt/ca;->s:Ljava/util/concurrent/ScheduledFuture;

    if-eqz v0, :cond_0

    .line 305
    iget-object v0, p0, Lcom/facebook/push/mqtt/ca;->s:Ljava/util/concurrent/ScheduledFuture;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/concurrent/ScheduledFuture;->cancel(Z)Z

    .line 306
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/push/mqtt/ca;->s:Ljava/util/concurrent/ScheduledFuture;

    .line 308
    :cond_0
    iget-boolean v0, p0, Lcom/facebook/push/mqtt/ca;->o:Z

    if-nez v0, :cond_1

    invoke-direct {p0}, Lcom/facebook/push/mqtt/ca;->s()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 309
    invoke-direct {p0}, Lcom/facebook/push/mqtt/ca;->n()V

    .line 311
    :cond_1
    invoke-direct {p0}, Lcom/facebook/push/mqtt/ca;->l()V

    .line 312
    return-void
.end method

.method private g()V
    .locals 2

    .prologue
    .line 315
    sget-object v0, Lcom/facebook/push/mqtt/ca;->b:Ljava/lang/Class;

    const-string v1, "App is now active"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;)V

    .line 317
    iget-object v0, p0, Lcom/facebook/push/mqtt/ca;->r:Ljava/util/concurrent/ScheduledFuture;

    if-eqz v0, :cond_0

    .line 318
    iget-object v0, p0, Lcom/facebook/push/mqtt/ca;->r:Ljava/util/concurrent/ScheduledFuture;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/concurrent/ScheduledFuture;->cancel(Z)Z

    .line 319
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/push/mqtt/ca;->r:Ljava/util/concurrent/ScheduledFuture;

    .line 321
    :cond_0
    iget-boolean v0, p0, Lcom/facebook/push/mqtt/ca;->o:Z

    if-nez v0, :cond_1

    invoke-direct {p0}, Lcom/facebook/push/mqtt/ca;->s()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 322
    invoke-direct {p0}, Lcom/facebook/push/mqtt/ca;->n()V

    .line 324
    :cond_1
    invoke-direct {p0}, Lcom/facebook/push/mqtt/ca;->l()V

    .line 325
    return-void
.end method

.method private h()V
    .locals 5

    .prologue
    .line 328
    sget-object v0, Lcom/facebook/push/mqtt/ca;->b:Ljava/lang/Class;

    const-string v1, "App is now paused"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;)V

    .line 330
    iget-object v0, p0, Lcom/facebook/push/mqtt/ca;->r:Ljava/util/concurrent/ScheduledFuture;

    if-nez v0, :cond_0

    .line 331
    iget-object v0, p0, Lcom/facebook/push/mqtt/ca;->e:Ljava/util/concurrent/ScheduledExecutorService;

    iget-object v1, p0, Lcom/facebook/push/mqtt/ca;->t:Ljava/lang/Runnable;

    const-wide/32 v2, 0x1d4c0

    sget-object v4, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v0, v1, v2, v3, v4}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/push/mqtt/ca;->r:Ljava/util/concurrent/ScheduledFuture;

    .line 337
    :cond_0
    return-void
.end method

.method private i()V
    .locals 5

    .prologue
    .line 340
    sget-object v0, Lcom/facebook/push/mqtt/ca;->b:Ljava/lang/Class;

    const-string v1, "Device is now paused"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;)V

    .line 342
    iget-object v0, p0, Lcom/facebook/push/mqtt/ca;->s:Ljava/util/concurrent/ScheduledFuture;

    if-nez v0, :cond_0

    .line 343
    iget-object v0, p0, Lcom/facebook/push/mqtt/ca;->e:Ljava/util/concurrent/ScheduledExecutorService;

    iget-object v1, p0, Lcom/facebook/push/mqtt/ca;->u:Ljava/lang/Runnable;

    const-wide/32 v2, 0x1d4c0

    sget-object v4, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v0, v1, v2, v3, v4}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/push/mqtt/ca;->s:Ljava/util/concurrent/ScheduledFuture;

    .line 349
    :cond_0
    return-void
.end method

.method private j()V
    .locals 2

    .prologue
    .line 352
    sget-object v0, Lcom/facebook/push/mqtt/ca;->b:Ljava/lang/Class;

    const-string v1, "App is now stopped"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;)V

    .line 353
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/push/mqtt/ca;->r:Ljava/util/concurrent/ScheduledFuture;

    .line 354
    invoke-direct {p0}, Lcom/facebook/push/mqtt/ca;->l()V

    .line 355
    iget-boolean v0, p0, Lcom/facebook/push/mqtt/ca;->o:Z

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/facebook/push/mqtt/ca;->s()Z

    move-result v0

    if-nez v0, :cond_0

    .line 356
    invoke-direct {p0}, Lcom/facebook/push/mqtt/ca;->q()V

    .line 358
    :cond_0
    return-void
.end method

.method private k()V
    .locals 2

    .prologue
    .line 361
    sget-object v0, Lcom/facebook/push/mqtt/ca;->b:Ljava/lang/Class;

    const-string v1, "Device is now stopped"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;)V

    .line 362
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/push/mqtt/ca;->s:Ljava/util/concurrent/ScheduledFuture;

    .line 363
    invoke-direct {p0}, Lcom/facebook/push/mqtt/ca;->l()V

    .line 364
    iget-boolean v0, p0, Lcom/facebook/push/mqtt/ca;->o:Z

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/facebook/push/mqtt/ca;->s()Z

    move-result v0

    if-nez v0, :cond_0

    .line 365
    invoke-direct {p0}, Lcom/facebook/push/mqtt/ca;->q()V

    .line 367
    :cond_0
    return-void
.end method

.method private declared-synchronized l()V
    .locals 8

    .prologue
    .line 392
    monitor-enter p0

    :try_start_0
    invoke-static {}, Lcom/google/common/a/kl;->a()Ljava/util/HashSet;

    move-result-object v3

    .line 393
    iget-object v0, p0, Lcom/facebook/push/mqtt/ca;->x:Ljava/util/HashSet;

    invoke-static {v0}, Lcom/google/common/a/kl;->a(Ljava/lang/Iterable;)Ljava/util/HashSet;

    move-result-object v4

    .line 394
    invoke-direct {p0}, Lcom/facebook/push/mqtt/ca;->m()Lcom/google/common/a/ev;

    move-result-object v1

    .line 398
    iget-object v0, p0, Lcom/facebook/push/mqtt/ca;->p:Lcom/facebook/push/mqtt/cg;

    sget-object v2, Lcom/facebook/push/mqtt/cg;->STOPPED:Lcom/facebook/push/mqtt/cg;

    if-eq v0, v2, :cond_1

    .line 400
    sget-object v0, Lcom/facebook/push/mqtt/ar;->APP_USE:Lcom/facebook/push/mqtt/ar;

    move-object v2, v0

    .line 412
    :goto_0
    sget-object v0, Lcom/facebook/push/mqtt/ca;->b:Ljava/lang/Class;

    const-string v5, "Minimum persistence needed for topics to be subscribed: %s"

    const/4 v6, 0x1

    new-array v6, v6, [Ljava/lang/Object;

    const/4 v7, 0x0

    aput-object v2, v6, v7

    invoke-static {v0, v5, v6}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 413
    if-eqz v2, :cond_5

    .line 414
    invoke-virtual {v1}, Lcom/google/common/a/ev;->a()Lcom/google/common/a/fi;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/fi;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_0
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 415
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/mqtt/messages/SubscribeTopic;

    .line 416
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/push/mqtt/ar;

    .line 417
    invoke-static {v0, v2}, Lcom/facebook/common/w/b;->a(Ljava/lang/Comparable;Ljava/lang/Comparable;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 419
    invoke-virtual {v4, v1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 420
    iget-object v0, p0, Lcom/facebook/push/mqtt/ca;->x:Ljava/util/HashSet;

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 421
    invoke-virtual {v3, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    .line 392
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 401
    :cond_1
    :try_start_1
    iget-object v0, p0, Lcom/facebook/push/mqtt/ca;->q:Lcom/facebook/push/mqtt/cg;

    sget-object v2, Lcom/facebook/push/mqtt/cg;->STOPPED:Lcom/facebook/push/mqtt/cg;

    if-eq v0, v2, :cond_2

    .line 403
    sget-object v0, Lcom/facebook/push/mqtt/ar;->DEVICE_USE:Lcom/facebook/push/mqtt/ar;

    move-object v2, v0

    goto :goto_0

    .line 404
    :cond_2
    iget-boolean v0, p0, Lcom/facebook/push/mqtt/ca;->n:Z

    if-eqz v0, :cond_3

    .line 406
    sget-object v0, Lcom/facebook/push/mqtt/ar;->ALWAYS:Lcom/facebook/push/mqtt/ar;

    move-object v2, v0

    goto :goto_0

    .line 409
    :cond_3
    const/4 v0, 0x0

    move-object v2, v0

    goto :goto_0

    .line 425
    :cond_4
    iget-object v0, p0, Lcom/facebook/push/mqtt/ca;->x:Ljava/util/HashSet;

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 426
    invoke-virtual {v4, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 432
    :cond_5
    invoke-direct {p0, v4}, Lcom/facebook/push/mqtt/ca;->b(Ljava/util/Collection;)V

    .line 433
    invoke-direct {p0, v3}, Lcom/facebook/push/mqtt/ca;->a(Ljava/util/Collection;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 434
    monitor-exit p0

    return-void
.end method

.method private m()Lcom/google/common/a/ev;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/ev",
            "<",
            "Lcom/facebook/mqtt/messages/SubscribeTopic;",
            "Lcom/facebook/push/mqtt/ar;",
            ">;"
        }
    .end annotation

    .prologue
    .line 437
    invoke-static {}, Lcom/google/common/a/kl;->a()Ljava/util/HashSet;

    move-result-object v1

    .line 438
    invoke-static {}, Lcom/google/common/a/ev;->k()Lcom/google/common/a/ew;

    move-result-object v2

    .line 439
    iget-object v0, p0, Lcom/facebook/push/mqtt/ca;->k:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/push/mqtt/m;

    .line 440
    invoke-interface {v0}, Lcom/facebook/push/mqtt/m;->a()Lcom/google/common/a/ev;

    move-result-object v4

    .line 441
    invoke-virtual {v4}, Lcom/google/common/a/ev;->i_()Lcom/google/common/a/fi;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/fi;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/mqtt/messages/SubscribeTopic;

    .line 442
    invoke-virtual {v0}, Lcom/facebook/mqtt/messages/SubscribeTopic;->a()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v6}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    .line 443
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Duplicate topics not allowed at this time"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 445
    :cond_1
    invoke-virtual {v0}, Lcom/facebook/mqtt/messages/SubscribeTopic;->a()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 446
    invoke-virtual {v4, v0}, Lcom/google/common/a/ev;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v2, v0, v6}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    goto :goto_0

    .line 449
    :cond_2
    invoke-virtual {v2}, Lcom/google/common/a/ew;->b()Lcom/google/common/a/ev;

    move-result-object v0

    return-object v0
.end method

.method private n()V
    .locals 3

    .prologue
    .line 481
    sget-object v0, Lcom/facebook/push/mqtt/ca;->b:Ljava/lang/Class;

    const-string v1, "Ensuring service started"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;)V

    .line 482
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/facebook/push/mqtt/ca;->c:Landroid/content/Context;

    const-class v2, Lcom/facebook/push/mqtt/MqttPushService;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 483
    const-string v1, "Orca.START"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 484
    iget-object v1, p0, Lcom/facebook/push/mqtt/ca;->c:Landroid/content/Context;

    invoke-virtual {v1, v0}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 485
    invoke-direct {p0}, Lcom/facebook/push/mqtt/ca;->r()V

    .line 486
    return-void
.end method

.method private o()V
    .locals 3

    .prologue
    .line 492
    sget-object v0, Lcom/facebook/push/mqtt/ca;->b:Ljava/lang/Class;

    const-string v1, "Ensure mqtt connection active"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;)V

    .line 493
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/facebook/push/mqtt/ca;->c:Landroid/content/Context;

    const-class v2, Lcom/facebook/push/mqtt/MqttPushService;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 494
    const-string v1, "Orca.PERSISTENT_KICK"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 495
    iget-object v1, p0, Lcom/facebook/push/mqtt/ca;->c:Landroid/content/Context;

    invoke-virtual {v1, v0}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 496
    return-void
.end method

.method private p()V
    .locals 3

    .prologue
    .line 499
    sget-object v0, Lcom/facebook/push/mqtt/ca;->b:Ljava/lang/Class;

    const-string v1, "Stopping service cleanly"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;)V

    .line 501
    iget-boolean v0, p0, Lcom/facebook/push/mqtt/ca;->o:Z

    if-eqz v0, :cond_0

    .line 503
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/facebook/push/mqtt/ca;->c:Landroid/content/Context;

    const-class v2, Lcom/facebook/push/mqtt/MqttPushService;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 504
    const-string v1, "Orca.STOP"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 505
    iget-object v1, p0, Lcom/facebook/push/mqtt/ca;->c:Landroid/content/Context;

    invoke-virtual {v1, v0}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 511
    :goto_0
    return-void

    .line 508
    :cond_0
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/facebook/push/mqtt/ca;->c:Landroid/content/Context;

    const-class v2, Lcom/facebook/push/mqtt/MqttPushService;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 509
    iget-object v1, p0, Lcom/facebook/push/mqtt/ca;->c:Landroid/content/Context;

    invoke-virtual {v1, v0}, Landroid/content/Context;->stopService(Landroid/content/Intent;)Z

    goto :goto_0
.end method

.method private q()V
    .locals 6

    .prologue
    .line 519
    sget-object v0, Lcom/facebook/push/mqtt/ca;->b:Ljava/lang/Class;

    const-string v1, "Stopping service in %d sec"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    const-wide/16 v4, 0x1e0

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-static {v0, v1, v2}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 521
    invoke-direct {p0}, Lcom/facebook/push/mqtt/ca;->r()V

    .line 522
    iget-object v0, p0, Lcom/facebook/push/mqtt/ca;->e:Ljava/util/concurrent/ScheduledExecutorService;

    iget-object v1, p0, Lcom/facebook/push/mqtt/ca;->w:Ljava/lang/Runnable;

    const-wide/32 v2, 0x75300

    sget-object v4, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v0, v1, v2, v3, v4}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/push/mqtt/ca;->v:Ljava/util/concurrent/ScheduledFuture;

    .line 527
    return-void
.end method

.method private r()V
    .locals 2

    .prologue
    .line 533
    iget-object v0, p0, Lcom/facebook/push/mqtt/ca;->v:Ljava/util/concurrent/ScheduledFuture;

    if-eqz v0, :cond_0

    .line 534
    iget-object v0, p0, Lcom/facebook/push/mqtt/ca;->v:Ljava/util/concurrent/ScheduledFuture;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/concurrent/ScheduledFuture;->cancel(Z)Z

    .line 535
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/push/mqtt/ca;->v:Ljava/util/concurrent/ScheduledFuture;

    .line 537
    :cond_0
    return-void
.end method

.method private s()Z
    .locals 6

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 540
    sget-object v0, Lcom/facebook/push/mqtt/ca;->b:Ljava/lang/Class;

    const-string v3, "Checking if push service should run"

    invoke-static {v0, v3}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;)V

    .line 541
    iget-boolean v0, p0, Lcom/facebook/push/mqtt/ca;->n:Z

    if-nez v0, :cond_0

    .line 569
    :goto_0
    return v2

    .line 544
    :cond_0
    sget-object v0, Lcom/facebook/push/mqtt/ca;->b:Ljava/lang/Class;

    const-string v3, "Service enabled"

    invoke-static {v0, v3}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;)V

    .line 545
    iget-object v0, p0, Lcom/facebook/push/mqtt/ca;->j:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_1

    .line 546
    sget-object v0, Lcom/facebook/push/mqtt/ca;->b:Ljava/lang/Class;

    const-string v1, "Not logged in"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;)V

    goto :goto_0

    .line 550
    :cond_1
    iget-object v0, p0, Lcom/facebook/push/mqtt/ca;->l:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/push/mqtt/i;

    .line 551
    invoke-interface {v0}, Lcom/facebook/push/mqtt/i;->a()Z

    move-result v4

    if-eqz v4, :cond_2

    .line 552
    sget-object v3, Lcom/facebook/push/mqtt/ca;->b:Ljava/lang/Class;

    const-string v4, "Active client prevented mqtt from shutting down: %s"

    new-array v5, v1, [Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    aput-object v0, v5, v2

    invoke-static {v3, v4, v5}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    move v2, v1

    .line 553
    goto :goto_0

    .line 556
    :cond_3
    iget-object v0, p0, Lcom/facebook/push/mqtt/ca;->i:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/push/mqtt/ar;

    .line 557
    sget-object v3, Lcom/facebook/push/mqtt/ca;->b:Ljava/lang/Class;

    const-string v4, "Required persistence: %s"

    new-array v5, v1, [Ljava/lang/Object;

    aput-object v0, v5, v2

    invoke-static {v3, v4, v5}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 558
    sget-object v3, Lcom/facebook/push/mqtt/cf;->b:[I

    invoke-virtual {v0}, Lcom/facebook/push/mqtt/ar;->ordinal()I

    move-result v4

    aget v3, v3, v4

    packed-switch v3, :pswitch_data_0

    .line 568
    sget-object v3, Lcom/facebook/push/mqtt/ca;->b:Ljava/lang/Class;

    const-string v4, "Invalid value from HighestMqttPersistenceProvider: %s"

    new-array v1, v1, [Ljava/lang/Object;

    aput-object v0, v1, v2

    invoke-static {v3, v4, v1}, Lcom/facebook/debug/log/b;->d(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :pswitch_0
    move v2, v1

    .line 560
    goto :goto_0

    .line 562
    :pswitch_1
    sget-object v0, Lcom/facebook/push/mqtt/ca;->b:Ljava/lang/Class;

    const-string v3, "Device activity status: %s"

    new-array v4, v1, [Ljava/lang/Object;

    iget-object v5, p0, Lcom/facebook/push/mqtt/ca;->q:Lcom/facebook/push/mqtt/cg;

    aput-object v5, v4, v2

    invoke-static {v0, v3, v4}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 563
    iget-object v0, p0, Lcom/facebook/push/mqtt/ca;->q:Lcom/facebook/push/mqtt/cg;

    sget-object v3, Lcom/facebook/push/mqtt/cg;->STOPPED:Lcom/facebook/push/mqtt/cg;

    if-eq v0, v3, :cond_4

    move v0, v1

    :goto_1
    move v2, v0

    goto/16 :goto_0

    :cond_4
    move v0, v2

    goto :goto_1

    .line 565
    :pswitch_2
    sget-object v0, Lcom/facebook/push/mqtt/ca;->b:Ljava/lang/Class;

    const-string v3, "App activity status: %s"

    new-array v4, v1, [Ljava/lang/Object;

    iget-object v5, p0, Lcom/facebook/push/mqtt/ca;->p:Lcom/facebook/push/mqtt/cg;

    aput-object v5, v4, v2

    invoke-static {v0, v3, v4}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 566
    iget-object v0, p0, Lcom/facebook/push/mqtt/ca;->p:Lcom/facebook/push/mqtt/cg;

    sget-object v3, Lcom/facebook/push/mqtt/cg;->STOPPED:Lcom/facebook/push/mqtt/cg;

    if-eq v0, v3, :cond_5

    :goto_2
    move v2, v1

    goto/16 :goto_0

    :cond_5
    move v1, v2

    goto :goto_2

    .line 558
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method


# virtual methods
.method public a()V
    .locals 5

    .prologue
    .line 150
    iget-object v0, p0, Lcom/facebook/push/mqtt/ca;->c:Landroid/content/Context;

    invoke-static {v0}, Lcom/facebook/base/a/g;->a(Landroid/content/Context;)V

    .line 152
    new-instance v1, Landroid/content/IntentFilter;

    invoke-direct {v1}, Landroid/content/IntentFilter;-><init>()V

    .line 153
    sget-object v0, Lcom/facebook/push/mqtt/ca;->a:Ljava/lang/String;

    invoke-virtual {v1, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 154
    sget-object v0, Lcom/facebook/common/v/a;->b:Ljava/lang/String;

    sget-object v2, Lcom/facebook/common/v/d;->b:Ljava/lang/String;

    sget-object v3, Lcom/facebook/common/v/a;->c:Ljava/lang/String;

    sget-object v4, Lcom/facebook/common/v/d;->c:Ljava/lang/String;

    invoke-static {v0, v2, v3, v4}, Lcom/google/common/a/fi;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/fi;

    move-result-object v2

    .line 160
    invoke-virtual {v2}, Lcom/google/common/a/fi;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 161
    invoke-virtual {v1, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    goto :goto_0

    .line 163
    :cond_0
    const-string v0, "com.facebook.push.mqtt.ACTION_CHANNEL_STATE_CHANGED"

    invoke-virtual {v1, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 164
    new-instance v0, Lcom/facebook/push/mqtt/ce;

    iget-object v3, p0, Lcom/facebook/push/mqtt/ca;->c:Landroid/content/Context;

    invoke-direct {v0, p0, v3, v1, v2}, Lcom/facebook/push/mqtt/ce;-><init>(Lcom/facebook/push/mqtt/ca;Landroid/content/Context;Landroid/content/IntentFilter;Lcom/google/common/a/fi;)V

    iput-object v0, p0, Lcom/facebook/push/mqtt/ca;->m:Lcom/facebook/base/broadcast/q;

    .line 179
    iget-object v0, p0, Lcom/facebook/push/mqtt/ca;->m:Lcom/facebook/base/broadcast/q;

    invoke-virtual {v0}, Lcom/facebook/base/broadcast/q;->a()V

    .line 181
    invoke-direct {p0}, Lcom/facebook/push/mqtt/ca;->e()V

    .line 182
    return-void
.end method

.method public a(Z)V
    .locals 1

    .prologue
    .line 189
    iget-boolean v0, p0, Lcom/facebook/push/mqtt/ca;->n:Z

    if-eq v0, p1, :cond_0

    .line 190
    iput-boolean p1, p0, Lcom/facebook/push/mqtt/ca;->n:Z

    .line 191
    invoke-direct {p0}, Lcom/facebook/push/mqtt/ca;->l()V

    .line 194
    :cond_0
    iget-boolean v0, p0, Lcom/facebook/push/mqtt/ca;->o:Z

    if-eqz v0, :cond_2

    invoke-direct {p0}, Lcom/facebook/push/mqtt/ca;->s()Z

    move-result v0

    if-nez v0, :cond_2

    .line 195
    invoke-direct {p0}, Lcom/facebook/push/mqtt/ca;->p()V

    .line 199
    :cond_1
    :goto_0
    return-void

    .line 196
    :cond_2
    iget-boolean v0, p0, Lcom/facebook/push/mqtt/ca;->o:Z

    if-nez v0, :cond_1

    invoke-direct {p0}, Lcom/facebook/push/mqtt/ca;->s()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 197
    invoke-direct {p0}, Lcom/facebook/push/mqtt/ca;->n()V

    goto :goto_0
.end method
