.class public Lcom/facebook/push/mqtt/v;
.super Ljava/lang/Object;
.source "MqttConnectionManager.java"


# annotations
.annotation build Ljavax/annotation/concurrent/NotThreadSafe;
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
.field private final b:Lcom/facebook/analytics/a;

.field private final c:Landroid/os/Handler;

.field private final d:Lcom/facebook/push/mqtt/u;

.field private final e:Lcom/facebook/push/mqtt/d;

.field private final f:Lcom/facebook/push/mqtt/ap;

.field private final g:Lcom/facebook/push/mqtt/abtest/a;

.field private final h:Lcom/facebook/analytics/cj;

.field private final i:Lcom/facebook/common/time/a;

.field private j:Lcom/facebook/mqtt/b;

.field private k:Lcom/facebook/push/mqtt/MqttPushService;

.field private l:Z

.field private m:J

.field private n:J

.field private final o:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Lcom/facebook/mqtt/messages/SubscribeTopic;",
            ">;"
        }
    .end annotation

    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "itself"
    .end annotation
.end field

.field private final p:Ljava/lang/Runnable;

.field private final q:Ljava/lang/Runnable;

.field private r:I

.field private s:Lcom/facebook/push/mqtt/abtest/e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 50
    const-class v0, Lcom/facebook/push/mqtt/v;

    sput-object v0, Lcom/facebook/push/mqtt/v;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/analytics/a;Lcom/facebook/push/mqtt/u;Lcom/facebook/push/mqtt/d;Lcom/facebook/push/mqtt/ap;Lcom/facebook/push/mqtt/abtest/a;Lcom/facebook/analytics/cj;Lcom/facebook/common/time/a;)V
    .locals 2

    .prologue
    .line 115
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 84
    invoke-static {}, Lcom/google/common/a/ik;->a()Ljava/util/HashMap;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/push/mqtt/v;->o:Ljava/util/Map;

    .line 88
    new-instance v0, Lcom/facebook/push/mqtt/w;

    invoke-direct {v0, p0}, Lcom/facebook/push/mqtt/w;-><init>(Lcom/facebook/push/mqtt/v;)V

    iput-object v0, p0, Lcom/facebook/push/mqtt/v;->p:Ljava/lang/Runnable;

    .line 95
    new-instance v0, Lcom/facebook/push/mqtt/x;

    invoke-direct {v0, p0}, Lcom/facebook/push/mqtt/x;-><init>(Lcom/facebook/push/mqtt/v;)V

    iput-object v0, p0, Lcom/facebook/push/mqtt/v;->q:Ljava/lang/Runnable;

    .line 116
    iput-object p1, p0, Lcom/facebook/push/mqtt/v;->b:Lcom/facebook/analytics/a;

    .line 117
    iput-object p2, p0, Lcom/facebook/push/mqtt/v;->d:Lcom/facebook/push/mqtt/u;

    .line 118
    iput-object p5, p0, Lcom/facebook/push/mqtt/v;->g:Lcom/facebook/push/mqtt/abtest/a;

    .line 119
    iput-object p6, p0, Lcom/facebook/push/mqtt/v;->h:Lcom/facebook/analytics/cj;

    .line 120
    iput-object p7, p0, Lcom/facebook/push/mqtt/v;->i:Lcom/facebook/common/time/a;

    .line 121
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/facebook/push/mqtt/v;->c:Landroid/os/Handler;

    .line 122
    iput-object p3, p0, Lcom/facebook/push/mqtt/v;->e:Lcom/facebook/push/mqtt/d;

    .line 123
    iget-object v0, p0, Lcom/facebook/push/mqtt/v;->e:Lcom/facebook/push/mqtt/d;

    iget-object v1, p0, Lcom/facebook/push/mqtt/v;->q:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Lcom/facebook/push/mqtt/d;->a(Ljava/lang/Runnable;)V

    .line 124
    iput-object p4, p0, Lcom/facebook/push/mqtt/v;->f:Lcom/facebook/push/mqtt/ap;

    .line 125
    iget-object v0, p0, Lcom/facebook/push/mqtt/v;->g:Lcom/facebook/push/mqtt/abtest/a;

    invoke-virtual {v0}, Lcom/facebook/push/mqtt/abtest/a;->a()Lcom/facebook/push/mqtt/abtest/e;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/push/mqtt/v;->s:Lcom/facebook/push/mqtt/abtest/e;

    .line 129
    const/16 v0, 0x384

    iput v0, p0, Lcom/facebook/push/mqtt/v;->r:I

    .line 130
    return-void
.end method

.method private a(ZZ)I
    .locals 6

    .prologue
    .line 453
    iget-object v0, p0, Lcom/facebook/push/mqtt/v;->s:Lcom/facebook/push/mqtt/abtest/e;

    if-nez v0, :cond_0

    .line 454
    iget-object v0, p0, Lcom/facebook/push/mqtt/v;->g:Lcom/facebook/push/mqtt/abtest/a;

    invoke-virtual {v0}, Lcom/facebook/push/mqtt/abtest/a;->a()Lcom/facebook/push/mqtt/abtest/e;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/push/mqtt/v;->s:Lcom/facebook/push/mqtt/abtest/e;

    .line 458
    :cond_0
    if-eqz p1, :cond_1

    .line 459
    iget-object v0, p0, Lcom/facebook/push/mqtt/v;->s:Lcom/facebook/push/mqtt/abtest/e;

    invoke-virtual {v0}, Lcom/facebook/push/mqtt/abtest/e;->i()I

    move-result v0

    .line 466
    :goto_0
    sget-object v1, Lcom/facebook/push/mqtt/v;->a:Ljava/lang/Class;

    const-string v2, "Asking keepalive cycle of %d seconds. isForeground:%b, isPersistent:%b"

    const/4 v3, 0x3

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v3, v4

    const/4 v4, 0x1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    aput-object v5, v3, v4

    const/4 v4, 0x2

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    aput-object v5, v3, v4

    invoke-static {v1, v2, v3}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 472
    return v0

    .line 461
    :cond_1
    if-eqz p2, :cond_2

    iget-object v0, p0, Lcom/facebook/push/mqtt/v;->s:Lcom/facebook/push/mqtt/abtest/e;

    invoke-virtual {v0}, Lcom/facebook/push/mqtt/abtest/e;->j()I

    move-result v0

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/facebook/push/mqtt/v;->s:Lcom/facebook/push/mqtt/abtest/e;

    invoke-virtual {v0}, Lcom/facebook/push/mqtt/abtest/e;->k()I

    move-result v0

    goto :goto_0
.end method

.method private a(Lcom/facebook/mqtt/b;)V
    .locals 4

    .prologue
    .line 286
    if-eqz p1, :cond_0

    .line 287
    iget-object v0, p0, Lcom/facebook/push/mqtt/v;->b:Lcom/facebook/analytics/a;

    const-string v1, "mqtt_bytes_sent"

    invoke-virtual {p1}, Lcom/facebook/mqtt/b;->f()J

    move-result-wide v2

    invoke-virtual {v0, v1, v2, v3}, Lcom/facebook/analytics/a;->a(Ljava/lang/String;J)V

    .line 288
    iget-object v0, p0, Lcom/facebook/push/mqtt/v;->b:Lcom/facebook/analytics/a;

    const-string v1, "mqtt_bytes_received"

    invoke-virtual {p1}, Lcom/facebook/mqtt/b;->g()J

    move-result-wide v2

    invoke-virtual {v0, v1, v2, v3}, Lcom/facebook/analytics/a;->a(Ljava/lang/String;J)V

    .line 291
    :cond_0
    return-void
.end method

.method private a(Lcom/facebook/mqtt/messages/l;)V
    .locals 2

    .prologue
    .line 600
    invoke-direct {p0, p1}, Lcom/facebook/push/mqtt/v;->b(Lcom/facebook/mqtt/messages/l;)Lcom/google/common/base/Optional;

    move-result-object v0

    .line 603
    invoke-virtual {v0}, Lcom/google/common/base/Optional;->isPresent()Z

    move-result v1

    if-nez v1, :cond_1

    .line 617
    :cond_0
    :goto_0
    return-void

    .line 608
    :cond_1
    iget-object v1, p0, Lcom/facebook/push/mqtt/v;->f:Lcom/facebook/push/mqtt/ap;

    invoke-virtual {v0}, Lcom/google/common/base/Optional;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/facebook/push/mqtt/ap;->a(I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 613
    invoke-virtual {p1}, Lcom/facebook/mqtt/messages/l;->e()Lcom/facebook/mqtt/messages/k;

    move-result-object v0

    sget-object v1, Lcom/facebook/mqtt/messages/k;->PUBACK:Lcom/facebook/mqtt/messages/k;

    if-ne v0, v1, :cond_0

    .line 615
    iget-object v0, p0, Lcom/facebook/push/mqtt/v;->h:Lcom/facebook/analytics/cj;

    invoke-virtual {v0}, Lcom/facebook/analytics/cj;->a()V

    goto :goto_0
.end method

.method private a(Lcom/facebook/push/mqtt/ag;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 247
    iget-object v0, p0, Lcom/facebook/push/mqtt/v;->j:Lcom/facebook/mqtt/b;

    .line 248
    if-eqz v0, :cond_0

    .line 249
    iput-object v2, p0, Lcom/facebook/push/mqtt/v;->j:Lcom/facebook/mqtt/b;

    .line 250
    invoke-direct {p0, v0}, Lcom/facebook/push/mqtt/v;->a(Lcom/facebook/mqtt/b;)V

    .line 251
    invoke-virtual {v0, v2}, Lcom/facebook/mqtt/b;->a(Lcom/facebook/mqtt/o;)V

    .line 252
    invoke-virtual {v0}, Lcom/facebook/mqtt/b;->e()V

    .line 253
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/push/mqtt/v;->n:J

    .line 256
    :cond_0
    invoke-direct {p0, p1, v2}, Lcom/facebook/push/mqtt/v;->a(Lcom/facebook/push/mqtt/ag;Ljava/lang/String;)V

    .line 257
    return-void
.end method

.method private a(Lcom/facebook/push/mqtt/ag;Ljava/lang/String;)V
    .locals 6

    .prologue
    const/4 v5, 0x1

    const/4 v4, 0x0

    .line 160
    sget-object v0, Lcom/facebook/push/mqtt/v;->a:Ljava/lang/Class;

    const-string v1, "Connection lost with reason %s"

    new-array v2, v5, [Ljava/lang/Object;

    aput-object p1, v2, v4

    invoke-static {v0, v1, v2}, Lcom/facebook/debug/log/b;->c(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 163
    iget-object v0, p0, Lcom/facebook/push/mqtt/v;->f:Lcom/facebook/push/mqtt/ap;

    new-instance v1, Lcom/facebook/mqtt/u;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Connection lost "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Lcom/facebook/mqtt/u;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {v0, v1}, Lcom/facebook/push/mqtt/ap;->a(Ljava/lang/Throwable;)V

    .line 165
    sget-object v0, Lcom/facebook/push/mqtt/z;->a:[I

    invoke-virtual {p1}, Lcom/facebook/push/mqtt/ag;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 177
    sget-object v0, Lcom/facebook/push/mqtt/v;->a:Ljava/lang/Class;

    const-string v1, "No more reconnect attempt for %s"

    new-array v2, v5, [Ljava/lang/Object;

    aput-object p1, v2, v4

    invoke-static {v0, v1, v2}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 181
    :goto_0
    iget-object v0, p0, Lcom/facebook/push/mqtt/v;->k:Lcom/facebook/push/mqtt/MqttPushService;

    invoke-virtual {v0}, Lcom/facebook/push/mqtt/MqttPushService;->c()V

    .line 182
    return-void

    .line 168
    :pswitch_0
    iget-object v0, p0, Lcom/facebook/push/mqtt/v;->e:Lcom/facebook/push/mqtt/d;

    invoke-virtual {v0}, Lcom/facebook/push/mqtt/d;->b()Z

    goto :goto_0

    .line 172
    :pswitch_1
    iget-object v0, p0, Lcom/facebook/push/mqtt/v;->e:Lcom/facebook/push/mqtt/d;

    invoke-virtual {v0}, Lcom/facebook/push/mqtt/d;->a()V

    goto :goto_0

    .line 165
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method static synthetic a(Lcom/facebook/push/mqtt/v;)V
    .locals 0

    .prologue
    .line 48
    invoke-direct {p0}, Lcom/facebook/push/mqtt/v;->k()V

    return-void
.end method

.method static synthetic a(Lcom/facebook/push/mqtt/v;Lcom/facebook/mqtt/messages/l;)V
    .locals 0

    .prologue
    .line 48
    invoke-direct {p0, p1}, Lcom/facebook/push/mqtt/v;->a(Lcom/facebook/mqtt/messages/l;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/push/mqtt/v;Lcom/facebook/push/mqtt/ag;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 48
    invoke-direct {p0, p1, p2}, Lcom/facebook/push/mqtt/v;->a(Lcom/facebook/push/mqtt/ag;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/push/mqtt/v;Lcom/google/common/a/es;)V
    .locals 0

    .prologue
    .line 48
    invoke-direct {p0, p1}, Lcom/facebook/push/mqtt/v;->a(Lcom/google/common/a/es;)V

    return-void
.end method

.method private a(Lcom/google/common/a/es;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/mqtt/messages/SubscribeTopic;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 553
    sget-object v0, Lcom/facebook/push/mqtt/v;->a:Ljava/lang/Class;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "New topics: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;)V

    .line 554
    iget-object v0, p0, Lcom/facebook/push/mqtt/v;->j:Lcom/facebook/mqtt/b;

    .line 555
    invoke-direct {p0, v0}, Lcom/facebook/push/mqtt/v;->c(Lcom/facebook/mqtt/b;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Lcom/google/common/a/es;->size()I

    move-result v1

    if-lez v1, :cond_0

    .line 557
    :try_start_0
    invoke-virtual {v0, p1}, Lcom/facebook/mqtt/b;->a(Ljava/util/List;)I

    move-result v1

    .line 558
    iget-object v2, p0, Lcom/facebook/push/mqtt/v;->f:Lcom/facebook/push/mqtt/ap;

    sget-object v3, Lcom/facebook/mqtt/messages/k;->SUBACK:Lcom/facebook/mqtt/messages/k;

    invoke-virtual {v2, v0, v3, v1}, Lcom/facebook/push/mqtt/ap;->a(Lcom/facebook/mqtt/b;Lcom/facebook/mqtt/messages/k;I)Lcom/facebook/push/mqtt/ao;
    :try_end_0
    .catch Lcom/facebook/mqtt/u; {:try_start_0 .. :try_end_0} :catch_0

    .line 564
    :cond_0
    :goto_0
    return-void

    .line 559
    :catch_0
    move-exception v0

    move-object v1, v0

    .line 560
    sget-object v2, Lcom/facebook/push/mqtt/v;->a:Ljava/lang/Class;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "MqttException: "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v1}, Lcom/facebook/mqtt/u;->getMessage()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v1}, Lcom/facebook/mqtt/u;->getMessage()Ljava/lang/String;

    move-result-object v0

    :goto_1
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0, v1}, Lcom/facebook/debug/log/b;->c(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 561
    sget-object v0, Lcom/facebook/push/mqtt/ag;->CONNECTION_LOST:Lcom/facebook/push/mqtt/ag;

    invoke-direct {p0, v0}, Lcom/facebook/push/mqtt/v;->a(Lcom/facebook/push/mqtt/ag;)V

    goto :goto_0

    .line 560
    :cond_1
    const-string v0, "NULL"

    goto :goto_1
.end method

.method private a(Ljava/lang/Runnable;)V
    .locals 3

    .prologue
    .line 644
    new-instance v0, Ljava/util/concurrent/Semaphore;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/Semaphore;-><init>(I)V

    .line 647
    iget-object v1, p0, Lcom/facebook/push/mqtt/v;->c:Landroid/os/Handler;

    new-instance v2, Lcom/facebook/push/mqtt/y;

    invoke-direct {v2, p0, p1, v0}, Lcom/facebook/push/mqtt/y;-><init>(Lcom/facebook/push/mqtt/v;Ljava/lang/Runnable;Ljava/util/concurrent/Semaphore;)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 657
    invoke-virtual {v0}, Ljava/util/concurrent/Semaphore;->acquire()V

    .line 658
    return-void
.end method

.method static synthetic b(Lcom/facebook/push/mqtt/v;)Lcom/facebook/mqtt/b;
    .locals 1

    .prologue
    .line 48
    iget-object v0, p0, Lcom/facebook/push/mqtt/v;->j:Lcom/facebook/mqtt/b;

    return-object v0
.end method

.method private b(Lcom/facebook/mqtt/messages/l;)Lcom/google/common/base/Optional;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/mqtt/messages/l;",
            ")",
            "Lcom/google/common/base/Optional",
            "<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .prologue
    .line 620
    invoke-static {}, Lcom/google/common/base/Optional;->absent()Lcom/google/common/base/Optional;

    move-result-object v0

    .line 623
    sget-object v1, Lcom/facebook/push/mqtt/z;->b:[I

    invoke-virtual {p1}, Lcom/facebook/mqtt/messages/l;->e()Lcom/facebook/mqtt/messages/k;

    move-result-object v2

    invoke-virtual {v2}, Lcom/facebook/mqtt/messages/k;->ordinal()I

    move-result v2

    aget v1, v1, v2

    packed-switch v1, :pswitch_data_0

    .line 639
    :goto_0
    return-object v0

    .line 627
    :pswitch_0
    invoke-virtual {p1}, Lcom/facebook/mqtt/messages/l;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/mqtt/messages/j;

    invoke-virtual {v0}, Lcom/facebook/mqtt/messages/j;->a()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/base/Optional;->of(Ljava/lang/Object;)Lcom/google/common/base/Optional;

    move-result-object v0

    goto :goto_0

    .line 632
    :pswitch_1
    const/4 v0, -0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/base/Optional;->of(Ljava/lang/Object;)Lcom/google/common/base/Optional;

    move-result-object v0

    goto :goto_0

    .line 623
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method private b(Ljava/lang/String;[BLcom/facebook/mqtt/x;)Lcom/google/common/base/Optional;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "[B",
            "Lcom/facebook/mqtt/x;",
            ")",
            "Lcom/google/common/base/Optional",
            "<",
            "Lcom/facebook/push/mqtt/ao;",
            ">;"
        }
    .end annotation

    .prologue
    const/4 v0, 0x0

    .line 394
    invoke-virtual {p3}, Lcom/facebook/mqtt/x;->getValue()I

    move-result v1

    sget-object v2, Lcom/facebook/mqtt/x;->ASSURED_DELIVERY:Lcom/facebook/mqtt/x;

    invoke-virtual {v2}, Lcom/facebook/mqtt/x;->getValue()I

    move-result v2

    if-ge v1, v2, :cond_0

    const/4 v0, 0x1

    :cond_0
    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkArgument(Z)V

    .line 396
    iget-object v0, p0, Lcom/facebook/push/mqtt/v;->j:Lcom/facebook/mqtt/b;

    .line 397
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/facebook/mqtt/b;->b()Z

    move-result v1

    if-nez v1, :cond_2

    .line 398
    :cond_1
    invoke-static {}, Lcom/google/common/base/Optional;->absent()Lcom/google/common/base/Optional;

    move-result-object v0

    .line 418
    :goto_0
    return-object v0

    .line 402
    :cond_2
    const/4 v1, 0x0

    :try_start_0
    invoke-virtual {v0, p1, p2, p3, v1}, Lcom/facebook/mqtt/b;->a(Ljava/lang/String;[BLcom/facebook/mqtt/x;Z)I

    move-result v3

    .line 403
    invoke-direct {p0, v0}, Lcom/facebook/push/mqtt/v;->a(Lcom/facebook/mqtt/b;)V

    .line 406
    sget-object v1, Lcom/facebook/mqtt/x;->ACKNOWLEDGED_DELIVERY:Lcom/facebook/mqtt/x;

    if-ne p3, v1, :cond_3

    .line 407
    iget-object v1, p0, Lcom/facebook/push/mqtt/v;->f:Lcom/facebook/push/mqtt/ap;

    sget-object v2, Lcom/facebook/mqtt/messages/k;->PUBACK:Lcom/facebook/mqtt/messages/k;

    invoke-virtual {v1, v0, v2, v3}, Lcom/facebook/push/mqtt/ap;->a(Lcom/facebook/mqtt/b;Lcom/facebook/mqtt/messages/k;I)Lcom/facebook/push/mqtt/ao;

    move-result-object v0

    .line 414
    :goto_1
    invoke-static {v0}, Lcom/google/common/base/Optional;->of(Ljava/lang/Object;)Lcom/google/common/base/Optional;

    move-result-object v0

    goto :goto_0

    .line 410
    :cond_3
    new-instance v0, Lcom/facebook/push/mqtt/ao;

    iget-object v1, p0, Lcom/facebook/push/mqtt/v;->j:Lcom/facebook/mqtt/b;

    sget-object v2, Lcom/facebook/mqtt/messages/k;->PUBACK:Lcom/facebook/mqtt/messages/k;

    const-wide/16 v4, 0x0

    invoke-direct/range {v0 .. v5}, Lcom/facebook/push/mqtt/ao;-><init>(Lcom/facebook/mqtt/b;Lcom/facebook/mqtt/messages/k;IJ)V

    .line 411
    invoke-virtual {v0}, Lcom/facebook/push/mqtt/ao;->f()V
    :try_end_0
    .catch Lcom/facebook/mqtt/u; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    .line 415
    :catch_0
    move-exception v0

    .line 416
    sget-object v1, Lcom/facebook/push/mqtt/v;->a:Ljava/lang/Class;

    const-string v2, "MqttException caught on publish."

    invoke-static {v1, v2, v0}, Lcom/facebook/debug/log/b;->c(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 417
    sget-object v0, Lcom/facebook/push/mqtt/ag;->CONNECTION_LOST:Lcom/facebook/push/mqtt/ag;

    invoke-direct {p0, v0}, Lcom/facebook/push/mqtt/v;->a(Lcom/facebook/push/mqtt/ag;)V

    .line 418
    invoke-static {}, Lcom/google/common/base/Optional;->absent()Lcom/google/common/base/Optional;

    move-result-object v0

    goto :goto_0
.end method

.method private b(Lcom/facebook/mqtt/b;)Z
    .locals 1

    .prologue
    .line 298
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/facebook/mqtt/b;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method static synthetic c(Lcom/facebook/push/mqtt/v;)Ljava/util/Map;
    .locals 1

    .prologue
    .line 48
    iget-object v0, p0, Lcom/facebook/push/mqtt/v;->o:Ljava/util/Map;

    return-object v0
.end method

.method private c(Lcom/facebook/mqtt/b;)Z
    .locals 1

    .prologue
    .line 306
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/facebook/mqtt/b;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method static synthetic d(Lcom/facebook/push/mqtt/v;)V
    .locals 0

    .prologue
    .line 48
    invoke-direct {p0}, Lcom/facebook/push/mqtt/v;->j()V

    return-void
.end method

.method static synthetic e(Lcom/facebook/push/mqtt/v;)Landroid/os/Handler;
    .locals 1

    .prologue
    .line 48
    iget-object v0, p0, Lcom/facebook/push/mqtt/v;->c:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic f(Lcom/facebook/push/mqtt/v;)Lcom/facebook/push/mqtt/MqttPushService;
    .locals 1

    .prologue
    .line 48
    iget-object v0, p0, Lcom/facebook/push/mqtt/v;->k:Lcom/facebook/push/mqtt/MqttPushService;

    return-object v0
.end method

.method static synthetic i()Ljava/lang/Class;
    .locals 1

    .prologue
    .line 48
    sget-object v0, Lcom/facebook/push/mqtt/v;->a:Ljava/lang/Class;

    return-object v0
.end method

.method private j()V
    .locals 4

    .prologue
    .line 185
    iget-object v0, p0, Lcom/facebook/push/mqtt/v;->e:Lcom/facebook/push/mqtt/d;

    invoke-virtual {v0}, Lcom/facebook/push/mqtt/d;->c()V

    .line 186
    iget-object v0, p0, Lcom/facebook/push/mqtt/v;->k:Lcom/facebook/push/mqtt/MqttPushService;

    invoke-virtual {v0}, Lcom/facebook/push/mqtt/MqttPushService;->b()V

    .line 188
    iget-object v0, p0, Lcom/facebook/push/mqtt/v;->i:Lcom/facebook/common/time/a;

    invoke-interface {v0}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v0

    iget-object v2, p0, Lcom/facebook/push/mqtt/v;->e:Lcom/facebook/push/mqtt/d;

    invoke-virtual {v2}, Lcom/facebook/push/mqtt/d;->e()J

    move-result-wide v2

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x3e8

    div-long/2addr v0, v2

    .line 190
    iget-object v2, p0, Lcom/facebook/push/mqtt/v;->h:Lcom/facebook/analytics/cj;

    iget-object v3, p0, Lcom/facebook/push/mqtt/v;->e:Lcom/facebook/push/mqtt/d;

    invoke-virtual {v3}, Lcom/facebook/push/mqtt/d;->d()I

    move-result v3

    long-to-int v0, v0

    invoke-virtual {v2, v3, v0}, Lcom/facebook/analytics/cj;->a(II)V

    .line 194
    return-void
.end method

.method private k()V
    .locals 5

    .prologue
    .line 201
    iget-object v0, p0, Lcom/facebook/push/mqtt/v;->j:Lcom/facebook/mqtt/b;

    if-nez v0, :cond_1

    .line 203
    invoke-direct {p0}, Lcom/facebook/push/mqtt/v;->m()V

    .line 208
    :cond_0
    :goto_0
    sget-object v0, Lcom/facebook/push/mqtt/v;->a:Ljava/lang/Class;

    const-string v1, "kick called when connection exists: %s"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    iget-object v4, p0, Lcom/facebook/push/mqtt/v;->j:Lcom/facebook/mqtt/b;

    invoke-virtual {v4}, Lcom/facebook/mqtt/b;->b()Z

    move-result v4

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-static {v0, v1, v2}, Lcom/facebook/debug/log/b;->c(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 212
    return-void

    .line 204
    :cond_1
    iget-object v0, p0, Lcom/facebook/push/mqtt/v;->j:Lcom/facebook/mqtt/b;

    invoke-virtual {v0}, Lcom/facebook/mqtt/b;->b()Z

    move-result v0

    if-nez v0, :cond_0

    .line 206
    invoke-direct {p0}, Lcom/facebook/push/mqtt/v;->l()V

    goto :goto_0
.end method

.method private l()V
    .locals 2

    .prologue
    .line 218
    sget-object v0, Lcom/facebook/push/mqtt/v;->a:Ljava/lang/Class;

    const-string v1, "Reconnecting..."

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->c(Ljava/lang/Class;Ljava/lang/String;)V

    .line 219
    sget-object v0, Lcom/facebook/push/mqtt/ag;->BY_REQUEST:Lcom/facebook/push/mqtt/ag;

    invoke-direct {p0, v0}, Lcom/facebook/push/mqtt/v;->a(Lcom/facebook/push/mqtt/ag;)V

    .line 220
    invoke-direct {p0}, Lcom/facebook/push/mqtt/v;->m()V

    .line 221
    return-void
.end method

.method private m()V
    .locals 3

    .prologue
    .line 228
    iget-object v0, p0, Lcom/facebook/push/mqtt/v;->d:Lcom/facebook/push/mqtt/u;

    iget v1, p0, Lcom/facebook/push/mqtt/v;->r:I

    invoke-virtual {v0, v1}, Lcom/facebook/push/mqtt/u;->a(I)Lcom/facebook/mqtt/b;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/push/mqtt/v;->j:Lcom/facebook/mqtt/b;

    .line 229
    iget-object v0, p0, Lcom/facebook/push/mqtt/v;->j:Lcom/facebook/mqtt/b;

    if-nez v0, :cond_0

    .line 237
    :goto_0
    return-void

    .line 233
    :cond_0
    sget-object v0, Lcom/facebook/push/mqtt/v;->a:Ljava/lang/Class;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Created mqtt client: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/facebook/push/mqtt/v;->j:Lcom/facebook/mqtt/b;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;)V

    .line 234
    iget-object v0, p0, Lcom/facebook/push/mqtt/v;->j:Lcom/facebook/mqtt/b;

    new-instance v1, Lcom/facebook/push/mqtt/aa;

    iget-object v2, p0, Lcom/facebook/push/mqtt/v;->j:Lcom/facebook/mqtt/b;

    invoke-direct {v1, p0, v2}, Lcom/facebook/push/mqtt/aa;-><init>(Lcom/facebook/push/mqtt/v;Lcom/facebook/mqtt/b;)V

    invoke-virtual {v0, v1}, Lcom/facebook/mqtt/b;->a(Lcom/facebook/mqtt/o;)V

    .line 235
    iget-object v0, p0, Lcom/facebook/push/mqtt/v;->j:Lcom/facebook/mqtt/b;

    invoke-virtual {v0}, Lcom/facebook/mqtt/b;->a()V

    .line 236
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/push/mqtt/v;->m:J

    goto :goto_0
.end method

.method private n()V
    .locals 4

    .prologue
    .line 269
    :try_start_0
    iget-object v0, p0, Lcom/facebook/push/mqtt/v;->j:Lcom/facebook/mqtt/b;

    .line 271
    invoke-direct {p0, v0}, Lcom/facebook/push/mqtt/v;->c(Lcom/facebook/mqtt/b;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 272
    invoke-virtual {v0}, Lcom/facebook/mqtt/b;->d()V

    .line 273
    iget-object v1, p0, Lcom/facebook/push/mqtt/v;->f:Lcom/facebook/push/mqtt/ap;

    sget-object v2, Lcom/facebook/mqtt/messages/k;->PINGRESP:Lcom/facebook/mqtt/messages/k;

    const/4 v3, -0x1

    invoke-virtual {v1, v0, v2, v3}, Lcom/facebook/push/mqtt/ap;->a(Lcom/facebook/mqtt/b;Lcom/facebook/mqtt/messages/k;I)Lcom/facebook/push/mqtt/ao;

    .line 274
    invoke-direct {p0, v0}, Lcom/facebook/push/mqtt/v;->a(Lcom/facebook/mqtt/b;)V
    :try_end_0
    .catch Lcom/facebook/mqtt/u; {:try_start_0 .. :try_end_0} :catch_0

    .line 280
    :cond_0
    :goto_0
    return-void

    .line 276
    :catch_0
    move-exception v0

    move-object v1, v0

    .line 277
    sget-object v2, Lcom/facebook/push/mqtt/v;->a:Ljava/lang/Class;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "MqttException: "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v1}, Lcom/facebook/mqtt/u;->getMessage()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v1}, Lcom/facebook/mqtt/u;->getMessage()Ljava/lang/String;

    move-result-object v0

    :goto_1
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0, v1}, Lcom/facebook/debug/log/b;->e(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 278
    sget-object v0, Lcom/facebook/push/mqtt/ag;->CONNECTION_LOST:Lcom/facebook/push/mqtt/ag;

    invoke-direct {p0, v0}, Lcom/facebook/push/mqtt/v;->a(Lcom/facebook/push/mqtt/ag;)V

    goto :goto_0

    .line 277
    :cond_1
    const-string v0, "NULL"

    goto :goto_1
.end method


# virtual methods
.method public a(Ljava/lang/String;Lcom/fasterxml/jackson/databind/JsonNode;Lcom/facebook/mqtt/x;)I
    .locals 1

    .prologue
    .line 369
    invoke-virtual {p2}, Lcom/fasterxml/jackson/databind/JsonNode;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/n;->c(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {p0, p1, v0, p3}, Lcom/facebook/push/mqtt/v;->a(Ljava/lang/String;[BLcom/facebook/mqtt/x;)I

    move-result v0

    return v0
.end method

.method public a(Ljava/lang/String;[BLcom/facebook/mqtt/x;)I
    .locals 2

    .prologue
    .line 380
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/push/mqtt/v;->b(Ljava/lang/String;[BLcom/facebook/mqtt/x;)Lcom/google/common/base/Optional;

    move-result-object v0

    .line 382
    invoke-virtual {v0}, Lcom/google/common/base/Optional;->isPresent()Z

    move-result v1

    if-nez v1, :cond_0

    .line 383
    const/4 v0, -0x1

    .line 386
    :goto_0
    return v0

    :cond_0
    invoke-virtual {v0}, Lcom/google/common/base/Optional;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/push/mqtt/ao;

    invoke-virtual {v0}, Lcom/facebook/push/mqtt/ao;->c()I

    move-result v0

    goto :goto_0
.end method

.method a()V
    .locals 1

    .prologue
    .line 142
    iget-object v0, p0, Lcom/facebook/push/mqtt/v;->g:Lcom/facebook/push/mqtt/abtest/a;

    invoke-virtual {v0}, Lcom/facebook/push/mqtt/abtest/a;->a()Lcom/facebook/push/mqtt/abtest/e;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/push/mqtt/v;->s:Lcom/facebook/push/mqtt/abtest/e;

    .line 145
    iget-object v0, p0, Lcom/facebook/push/mqtt/v;->e:Lcom/facebook/push/mqtt/d;

    invoke-virtual {v0}, Lcom/facebook/push/mqtt/d;->a()V

    .line 146
    return-void
.end method

.method a(I)V
    .locals 5

    .prologue
    .line 480
    sget-object v0, Lcom/facebook/push/mqtt/v;->a:Ljava/lang/Class;

    const-string v1, "Update keepalive interval to %d"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-static {v0, v1, v2}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 481
    iput p1, p0, Lcom/facebook/push/mqtt/v;->r:I

    .line 482
    iget-object v0, p0, Lcom/facebook/push/mqtt/v;->k:Lcom/facebook/push/mqtt/MqttPushService;

    invoke-virtual {v0, p1}, Lcom/facebook/push/mqtt/MqttPushService;->a(I)V

    .line 483
    return-void
.end method

.method a(Lcom/facebook/push/mqtt/MqttPushService;)V
    .locals 1

    .prologue
    .line 133
    iput-object p1, p0, Lcom/facebook/push/mqtt/v;->k:Lcom/facebook/push/mqtt/MqttPushService;

    .line 134
    iget v0, p0, Lcom/facebook/push/mqtt/v;->r:I

    invoke-virtual {p1, v0}, Lcom/facebook/push/mqtt/MqttPushService;->a(I)V

    .line 135
    return-void
.end method

.method public a(Ljava/util/Collection;)V
    .locals 6
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
    .line 538
    sget-object v0, Lcom/facebook/push/mqtt/v;->a:Ljava/lang/Class;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Subscribing to "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;)V

    .line 539
    invoke-static {}, Lcom/google/common/a/es;->e()Lcom/google/common/a/et;

    move-result-object v1

    .line 540
    iget-object v2, p0, Lcom/facebook/push/mqtt/v;->o:Ljava/util/Map;

    monitor-enter v2

    .line 541
    :try_start_0
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/mqtt/messages/SubscribeTopic;

    .line 542
    invoke-virtual {v0}, Lcom/facebook/mqtt/messages/SubscribeTopic;->a()Ljava/lang/String;

    move-result-object v4

    .line 543
    iget-object v5, p0, Lcom/facebook/push/mqtt/v;->o:Ljava/util/Map;

    invoke-interface {v5, v4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_0

    .line 544
    iget-object v5, p0, Lcom/facebook/push/mqtt/v;->o:Ljava/util/Map;

    invoke-interface {v5, v4, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 545
    invoke-virtual {v1, v0}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    goto :goto_0

    .line 548
    :catchall_0
    move-exception v0

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_1
    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 549
    invoke-virtual {v1}, Lcom/google/common/a/et;->b()Lcom/google/common/a/es;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/facebook/push/mqtt/v;->a(Lcom/google/common/a/es;)V

    .line 550
    return-void
.end method

.method public a(J)Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 334
    :try_start_0
    iget-object v1, p0, Lcom/facebook/push/mqtt/v;->j:Lcom/facebook/mqtt/b;

    .line 335
    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/facebook/mqtt/b;->b()Z

    move-result v1

    if-nez v1, :cond_1

    .line 336
    :cond_0
    iget-object v1, p0, Lcom/facebook/push/mqtt/v;->p:Ljava/lang/Runnable;

    invoke-direct {p0, v1}, Lcom/facebook/push/mqtt/v;->a(Ljava/lang/Runnable;)V

    .line 340
    :cond_1
    iget-object v1, p0, Lcom/facebook/push/mqtt/v;->j:Lcom/facebook/mqtt/b;

    .line 341
    if-nez v1, :cond_2

    .line 342
    sget-object v1, Lcom/facebook/push/mqtt/v;->a:Ljava/lang/Class;

    const-string v2, "Failed to initialize client."

    invoke-static {v1, v2}, Lcom/facebook/debug/log/b;->e(Ljava/lang/Class;Ljava/lang/String;)V

    .line 357
    :goto_0
    return v0

    .line 347
    :cond_2
    invoke-virtual {v1}, Lcom/facebook/mqtt/b;->c()Z

    move-result v2

    if-eqz v2, :cond_3

    .line 348
    const/4 v0, 0x1

    goto :goto_0

    .line 352
    :cond_3
    invoke-virtual {v1, p1, p2}, Lcom/facebook/mqtt/b;->a(J)V

    .line 353
    invoke-virtual {v1}, Lcom/facebook/mqtt/b;->c()Z
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    goto :goto_0

    .line 354
    :catch_0
    move-exception v1

    .line 355
    sget-object v1, Lcom/facebook/push/mqtt/v;->a:Ljava/lang/Class;

    const-string v2, "Interrupted while waiting for connection establishment."

    invoke-static {v1, v2}, Lcom/facebook/debug/log/b;->d(Ljava/lang/Class;Ljava/lang/String;)V

    .line 356
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V

    goto :goto_0
.end method

.method public a(Ljava/lang/String;Lcom/fasterxml/jackson/databind/JsonNode;J)Z
    .locals 1

    .prologue
    .line 500
    invoke-virtual {p2}, Lcom/fasterxml/jackson/databind/JsonNode;->toString()Ljava/lang/String;

    move-result-object v0

    .line 501
    invoke-static {v0}, Lcom/facebook/common/w/n;->c(Ljava/lang/String;)[B

    move-result-object v0

    .line 502
    invoke-virtual {p0, p1, v0, p3, p4}, Lcom/facebook/push/mqtt/v;->a(Ljava/lang/String;[BJ)Z

    move-result v0

    return v0
.end method

.method public a(Ljava/lang/String;[BJ)Z
    .locals 5

    .prologue
    const/4 v1, 0x0

    .line 510
    sget-object v0, Lcom/facebook/push/mqtt/v;->a:Ljava/lang/Class;

    const-string v2, "publishAndWait"

    invoke-static {v0, v2}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;)V

    .line 513
    sget-object v0, Lcom/facebook/mqtt/x;->ACKNOWLEDGED_DELIVERY:Lcom/facebook/mqtt/x;

    invoke-direct {p0, p1, p2, v0}, Lcom/facebook/push/mqtt/v;->b(Ljava/lang/String;[BLcom/facebook/mqtt/x;)Lcom/google/common/base/Optional;

    move-result-object v0

    .line 515
    invoke-virtual {v0}, Lcom/google/common/base/Optional;->isPresent()Z

    move-result v2

    if-nez v2, :cond_0

    move v0, v1

    .line 529
    :goto_0
    return v0

    .line 521
    :cond_0
    :try_start_0
    invoke-virtual {v0}, Lcom/google/common/base/Optional;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/push/mqtt/ao;

    invoke-virtual {v0}, Lcom/facebook/push/mqtt/ao;->d()Lcom/google/common/d/a/s;

    move-result-object v0

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v0, p3, p4, v2}, Lcom/google/common/d/a/s;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_1

    .line 522
    const/4 v0, 0x1

    goto :goto_0

    .line 523
    :catch_0
    move-exception v0

    .line 525
    sget-object v2, Lcom/facebook/push/mqtt/v;->a:Ljava/lang/Class;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Publish failed for "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Ljava/util/concurrent/ExecutionException;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    invoke-static {v2, v3, v0}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V

    move v0, v1

    .line 526
    goto :goto_0

    .line 527
    :catch_1
    move-exception v0

    move v0, v1

    .line 529
    goto :goto_0
.end method

.method a(Z)Z
    .locals 1

    .prologue
    .line 430
    iget-boolean v0, p0, Lcom/facebook/push/mqtt/v;->l:Z

    if-ne v0, p1, :cond_0

    .line 431
    const/4 v0, 0x0

    .line 435
    :goto_0
    return v0

    .line 434
    :cond_0
    iput-boolean p1, p0, Lcom/facebook/push/mqtt/v;->l:Z

    .line 435
    const/4 v0, 0x1

    goto :goto_0
.end method

.method b(Z)I
    .locals 1

    .prologue
    .line 446
    iget-object v0, p0, Lcom/facebook/push/mqtt/v;->k:Lcom/facebook/push/mqtt/MqttPushService;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    .line 447
    :goto_0
    invoke-direct {p0, p1, v0}, Lcom/facebook/push/mqtt/v;->a(ZZ)I

    move-result v0

    return v0

    .line 446
    :cond_0
    iget-object v0, p0, Lcom/facebook/push/mqtt/v;->k:Lcom/facebook/push/mqtt/MqttPushService;

    invoke-virtual {v0}, Lcom/facebook/push/mqtt/MqttPushService;->d()Z

    move-result v0

    goto :goto_0
.end method

.method b()V
    .locals 1

    .prologue
    .line 152
    iget-object v0, p0, Lcom/facebook/push/mqtt/v;->e:Lcom/facebook/push/mqtt/d;

    invoke-virtual {v0}, Lcom/facebook/push/mqtt/d;->c()V

    .line 153
    sget-object v0, Lcom/facebook/push/mqtt/ag;->BY_REQUEST:Lcom/facebook/push/mqtt/ag;

    invoke-direct {p0, v0}, Lcom/facebook/push/mqtt/v;->a(Lcom/facebook/push/mqtt/ag;)V

    .line 154
    return-void
.end method

.method public b(Ljava/util/Collection;)V
    .locals 6
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
    .line 570
    const/4 v1, 0x0

    .line 571
    invoke-static {}, Lcom/google/common/a/es;->e()Lcom/google/common/a/et;

    move-result-object v2

    .line 572
    iget-object v3, p0, Lcom/facebook/push/mqtt/v;->o:Ljava/util/Map;

    monitor-enter v3

    .line 573
    :try_start_0
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/mqtt/messages/SubscribeTopic;

    .line 574
    invoke-virtual {v0}, Lcom/facebook/mqtt/messages/SubscribeTopic;->a()Ljava/lang/String;

    move-result-object v0

    .line 575
    iget-object v5, p0, Lcom/facebook/push/mqtt/v;->o:Ljava/util/Map;

    invoke-interface {v5, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    .line 576
    iget-object v1, p0, Lcom/facebook/push/mqtt/v;->o:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 577
    invoke-virtual {v2, v0}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    .line 578
    const/4 v0, 0x1

    :goto_1
    move v1, v0

    .line 580
    goto :goto_0

    .line 581
    :cond_0
    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 582
    iget-object v0, p0, Lcom/facebook/push/mqtt/v;->j:Lcom/facebook/mqtt/b;

    .line 583
    invoke-direct {p0, v0}, Lcom/facebook/push/mqtt/v;->c(Lcom/facebook/mqtt/b;)Z

    move-result v3

    if-eqz v3, :cond_1

    if-eqz v1, :cond_1

    .line 585
    :try_start_1
    invoke-virtual {v2}, Lcom/google/common/a/et;->b()Lcom/google/common/a/es;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/mqtt/b;->b(Ljava/util/List;)I

    move-result v1

    .line 586
    iget-object v2, p0, Lcom/facebook/push/mqtt/v;->f:Lcom/facebook/push/mqtt/ap;

    sget-object v3, Lcom/facebook/mqtt/messages/k;->UNSUBACK:Lcom/facebook/mqtt/messages/k;

    invoke-virtual {v2, v0, v3, v1}, Lcom/facebook/push/mqtt/ap;->a(Lcom/facebook/mqtt/b;Lcom/facebook/mqtt/messages/k;I)Lcom/facebook/push/mqtt/ao;
    :try_end_1
    .catch Lcom/facebook/mqtt/u; {:try_start_1 .. :try_end_1} :catch_0

    .line 592
    :cond_1
    :goto_2
    return-void

    .line 581
    :catchall_0
    move-exception v0

    :try_start_2
    monitor-exit v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    .line 587
    :catch_0
    move-exception v0

    .line 588
    sget-object v1, Lcom/facebook/push/mqtt/v;->a:Ljava/lang/Class;

    const-string v2, "MqttException when unsubscribing"

    invoke-static {v1, v2, v0}, Lcom/facebook/debug/log/b;->c(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 589
    sget-object v0, Lcom/facebook/push/mqtt/ag;->CONNECTION_LOST:Lcom/facebook/push/mqtt/ag;

    invoke-direct {p0, v0}, Lcom/facebook/push/mqtt/v;->a(Lcom/facebook/push/mqtt/ag;)V

    goto :goto_2

    :cond_2
    move v0, v1

    goto :goto_1
.end method

.method c()V
    .locals 2

    .prologue
    .line 260
    sget-object v0, Lcom/facebook/push/mqtt/v;->a:Ljava/lang/Class;

    const-string v1, "sendKeepAlive"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->c(Ljava/lang/Class;Ljava/lang/String;)V

    .line 261
    invoke-direct {p0}, Lcom/facebook/push/mqtt/v;->n()V

    .line 262
    return-void
.end method

.method public d()Z
    .locals 1

    .prologue
    .line 294
    iget-object v0, p0, Lcom/facebook/push/mqtt/v;->j:Lcom/facebook/mqtt/b;

    invoke-direct {p0, v0}, Lcom/facebook/push/mqtt/v;->b(Lcom/facebook/mqtt/b;)Z

    move-result v0

    return v0
.end method

.method public e()Z
    .locals 1

    .prologue
    .line 302
    iget-object v0, p0, Lcom/facebook/push/mqtt/v;->j:Lcom/facebook/mqtt/b;

    invoke-direct {p0, v0}, Lcom/facebook/push/mqtt/v;->c(Lcom/facebook/mqtt/b;)Z

    move-result v0

    return v0
.end method

.method public f()Lcom/facebook/push/mqtt/bu;
    .locals 1

    .prologue
    .line 310
    iget-object v0, p0, Lcom/facebook/push/mqtt/v;->k:Lcom/facebook/push/mqtt/MqttPushService;

    if-nez v0, :cond_0

    sget-object v0, Lcom/facebook/push/mqtt/bu;->DISCONNECTED:Lcom/facebook/push/mqtt/bu;

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/facebook/push/mqtt/v;->k:Lcom/facebook/push/mqtt/MqttPushService;

    invoke-virtual {v0}, Lcom/facebook/push/mqtt/MqttPushService;->a()Lcom/facebook/push/mqtt/bu;

    move-result-object v0

    goto :goto_0
.end method

.method public g()J
    .locals 2

    .prologue
    .line 316
    iget-wide v0, p0, Lcom/facebook/push/mqtt/v;->n:J

    return-wide v0
.end method

.method public h()J
    .locals 2

    .prologue
    .line 320
    iget-wide v0, p0, Lcom/facebook/push/mqtt/v;->m:J

    return-wide v0
.end method
