.class public Lcom/facebook/mqtt/b;
.super Ljava/lang/Object;
.source "MqttClient.java"


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

.field private static final b:Ljava/util/EnumSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/EnumSet",
            "<",
            "Lcom/facebook/mqtt/k;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final c:Landroid/net/ConnectivityManager;

.field private final d:Lcom/facebook/mqtt/y;

.field private final e:Lcom/facebook/analytics/cj;

.field private final f:Lcom/facebook/k/a;

.field private final g:Lcom/facebook/mqtt/w;

.field private final h:Lcom/facebook/common/time/a;

.field private i:J

.field private j:J

.field private k:J

.field private l:J

.field private m:J

.field private n:J

.field private o:Ljava/net/Socket;
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "member reference guarded by this"
    .end annotation
.end field

.field private p:Lcom/facebook/mqtt/a/a;
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "member reference guarded by this"
    .end annotation
.end field

.field private q:Lcom/facebook/mqtt/a/f;
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "member reference guarded by this"
    .end annotation
.end field

.field private r:Ljava/lang/Thread;
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "member reference guarded by this"
    .end annotation
.end field

.field private s:Ljava/util/concurrent/atomic/AtomicInteger;

.field private volatile t:Lcom/facebook/mqtt/n;
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this for writes"
    .end annotation
.end field

.field private volatile u:Lcom/facebook/mqtt/o;

.field private v:Lcom/google/common/b/d;
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "member reference guarded by this"
    .end annotation
.end field

.field private w:Lcom/google/common/b/e;
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "member reference guarded by this"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 70
    const-class v0, Lcom/facebook/mqtt/b;

    sput-object v0, Lcom/facebook/mqtt/b;->a:Ljava/lang/Class;

    .line 108
    sget-object v0, Lcom/facebook/mqtt/k;->ACKNOWLEDGED_DELIVERY:Lcom/facebook/mqtt/k;

    invoke-static {v0}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v0

    sput-object v0, Lcom/facebook/mqtt/b;->b:Ljava/util/EnumSet;

    return-void
.end method

.method public constructor <init>(Landroid/net/ConnectivityManager;Lcom/facebook/mqtt/y;Lcom/facebook/analytics/cj;Lcom/facebook/k/a;Lcom/facebook/mqtt/w;Lcom/facebook/common/time/a;)V
    .locals 2

    .prologue
    const-wide v0, 0x7fffffffffffffffL

    .line 208
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 163
    iput-wide v0, p0, Lcom/facebook/mqtt/b;->k:J

    .line 168
    iput-wide v0, p0, Lcom/facebook/mqtt/b;->l:J

    .line 173
    iput-wide v0, p0, Lcom/facebook/mqtt/b;->m:J

    .line 178
    iput-wide v0, p0, Lcom/facebook/mqtt/b;->n:J

    .line 190
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object v0, p0, Lcom/facebook/mqtt/b;->s:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 192
    sget-object v0, Lcom/facebook/mqtt/n;->INIT:Lcom/facebook/mqtt/n;

    iput-object v0, p0, Lcom/facebook/mqtt/b;->t:Lcom/facebook/mqtt/n;

    .line 209
    iput-object p1, p0, Lcom/facebook/mqtt/b;->c:Landroid/net/ConnectivityManager;

    .line 210
    iput-object p2, p0, Lcom/facebook/mqtt/b;->d:Lcom/facebook/mqtt/y;

    .line 211
    iput-object p3, p0, Lcom/facebook/mqtt/b;->e:Lcom/facebook/analytics/cj;

    .line 212
    iput-object p4, p0, Lcom/facebook/mqtt/b;->f:Lcom/facebook/k/a;

    .line 213
    iput-object p5, p0, Lcom/facebook/mqtt/b;->g:Lcom/facebook/mqtt/w;

    .line 214
    iput-object p6, p0, Lcom/facebook/mqtt/b;->h:Lcom/facebook/common/time/a;

    .line 215
    return-void
.end method

.method private a(Z)Ljava/net/Socket;
    .locals 1

    .prologue
    .line 633
    .line 634
    if-eqz p1, :cond_0

    .line 635
    iget-object v0, p0, Lcom/facebook/mqtt/b;->d:Lcom/facebook/mqtt/y;

    invoke-virtual {v0}, Lcom/facebook/mqtt/y;->a()Ljavax/net/SocketFactory;

    move-result-object v0

    .line 636
    invoke-virtual {v0}, Ljavax/net/SocketFactory;->createSocket()Ljava/net/Socket;

    move-result-object v0

    .line 641
    :goto_0
    return-object v0

    .line 638
    :cond_0
    new-instance v0, Ljava/net/Socket;

    invoke-direct {v0}, Ljava/net/Socket;-><init>()V

    goto :goto_0
.end method

.method private a(ZLjava/net/InetAddress;I)Ljava/net/Socket;
    .locals 10

    .prologue
    const/4 v1, 0x0

    .line 582
    .line 583
    iget-object v0, p0, Lcom/facebook/mqtt/b;->h:Lcom/facebook/common/time/a;

    invoke-interface {v0}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v3

    .line 587
    :try_start_0
    invoke-direct {p0, p1}, Lcom/facebook/mqtt/b;->a(Z)Ljava/net/Socket;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    .line 589
    :try_start_1
    sget-object v2, Lcom/facebook/mqtt/b;->a:Ljava/lang/Class;

    const-string v5, "Connecting on port %d"

    const/4 v6, 0x1

    new-array v6, v6, [Ljava/lang/Object;

    const/4 v7, 0x0

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    aput-object v8, v6, v7

    invoke-static {v2, v5, v6}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 590
    new-instance v2, Ljava/net/InetSocketAddress;

    invoke-direct {v2, p2, p3}, Ljava/net/InetSocketAddress;-><init>(Ljava/net/InetAddress;I)V

    .line 591
    iget-object v5, p0, Lcom/facebook/mqtt/b;->g:Lcom/facebook/mqtt/w;

    invoke-virtual {v5}, Lcom/facebook/mqtt/w;->i()I

    move-result v5

    mul-int/lit16 v5, v5, 0x3e8

    invoke-virtual {v0, v2, v5}, Ljava/net/Socket;->connect(Ljava/net/SocketAddress;I)V

    .line 596
    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Ljava/net/Socket;->setTcpNoDelay(Z)V

    .line 597
    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Ljava/net/Socket;->setSoTimeout(I)V

    .line 598
    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Ljava/net/Socket;->setKeepAlive(Z)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 604
    iget-object v2, p0, Lcom/facebook/mqtt/b;->e:Lcom/facebook/analytics/cj;

    iget-object v5, p0, Lcom/facebook/mqtt/b;->h:Lcom/facebook/common/time/a;

    invoke-interface {v5}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v5

    sub-long v3, v5, v3

    invoke-static {v1}, Lcom/google/common/base/Optional;->fromNullable(Ljava/lang/Object;)Lcom/google/common/base/Optional;

    move-result-object v1

    invoke-virtual {v2, v3, v4, p3, v1}, Lcom/facebook/analytics/cj;->a(JILcom/google/common/base/Optional;)V

    .line 610
    :goto_0
    return-object v0

    .line 599
    :catch_0
    move-exception v0

    move-object v2, v1

    .line 600
    :goto_1
    :try_start_2
    invoke-direct {p0, v2}, Lcom/facebook/mqtt/b;->a(Ljava/net/Socket;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 604
    iget-object v2, p0, Lcom/facebook/mqtt/b;->e:Lcom/facebook/analytics/cj;

    iget-object v5, p0, Lcom/facebook/mqtt/b;->h:Lcom/facebook/common/time/a;

    invoke-interface {v5}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v5

    sub-long v3, v5, v3

    invoke-static {v0}, Lcom/google/common/base/Optional;->fromNullable(Ljava/lang/Object;)Lcom/google/common/base/Optional;

    move-result-object v0

    invoke-virtual {v2, v3, v4, p3, v0}, Lcom/facebook/analytics/cj;->a(JILcom/google/common/base/Optional;)V

    move-object v0, v1

    goto :goto_0

    :catchall_0
    move-exception v0

    iget-object v2, p0, Lcom/facebook/mqtt/b;->e:Lcom/facebook/analytics/cj;

    iget-object v5, p0, Lcom/facebook/mqtt/b;->h:Lcom/facebook/common/time/a;

    invoke-interface {v5}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v5

    sub-long v3, v5, v3

    invoke-static {v1}, Lcom/google/common/base/Optional;->fromNullable(Ljava/lang/Object;)Lcom/google/common/base/Optional;

    move-result-object v1

    invoke-virtual {v2, v3, v4, p3, v1}, Lcom/facebook/analytics/cj;->a(JILcom/google/common/base/Optional;)V

    throw v0

    .line 599
    :catch_1
    move-exception v2

    move-object v9, v2

    move-object v2, v0

    move-object v0, v9

    goto :goto_1
.end method

.method private a(I)V
    .locals 5

    .prologue
    .line 769
    sget-object v0, Lcom/facebook/mqtt/b;->a:Ljava/lang/Class;

    const-string v1, "Acknowledging %d"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-static {v0, v1, v2}, Lcom/facebook/debug/log/b;->c(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 770
    new-instance v0, Lcom/facebook/common/a/a;

    new-instance v1, Lcom/facebook/mqtt/i;

    invoke-direct {v1, p0, p1}, Lcom/facebook/mqtt/i;-><init>(Lcom/facebook/mqtt/b;I)V

    invoke-direct {v0, v1}, Lcom/facebook/common/a/a;-><init>(Ljava/lang/Runnable;)V

    .line 776
    invoke-virtual {v0}, Lcom/facebook/common/a/a;->a()V

    .line 777
    return-void
.end method

.method private a(Lcom/facebook/mqtt/a/f;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 874
    invoke-static {}, Lcom/facebook/mqtt/messages/h;->newBuilder()Lcom/facebook/mqtt/messages/i;

    move-result-object v0

    sget-object v1, Lcom/facebook/mqtt/messages/k;->PINGREQ:Lcom/facebook/mqtt/messages/k;

    invoke-virtual {v0, v1}, Lcom/facebook/mqtt/messages/i;->a(Lcom/facebook/mqtt/messages/k;)Lcom/facebook/mqtt/messages/i;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/facebook/mqtt/messages/i;->b(I)Lcom/facebook/mqtt/messages/i;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/mqtt/messages/i;->f()Lcom/facebook/mqtt/messages/h;

    move-result-object v0

    .line 878
    new-instance v1, Lcom/facebook/mqtt/messages/l;

    invoke-direct {v1, v0, v2, v2}, Lcom/facebook/mqtt/messages/l;-><init>(Lcom/facebook/mqtt/messages/h;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 879
    invoke-direct {p0, p1, v1}, Lcom/facebook/mqtt/b;->a(Lcom/facebook/mqtt/a/f;Lcom/facebook/mqtt/messages/l;)V

    .line 880
    return-void
.end method

.method private a(Lcom/facebook/mqtt/a/f;I)V
    .locals 3

    .prologue
    .line 883
    invoke-static {}, Lcom/facebook/mqtt/messages/h;->newBuilder()Lcom/facebook/mqtt/messages/i;

    move-result-object v0

    sget-object v1, Lcom/facebook/mqtt/messages/k;->PUBACK:Lcom/facebook/mqtt/messages/k;

    invoke-virtual {v0, v1}, Lcom/facebook/mqtt/messages/i;->a(Lcom/facebook/mqtt/messages/k;)Lcom/facebook/mqtt/messages/i;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/mqtt/messages/i;->f()Lcom/facebook/mqtt/messages/h;

    move-result-object v0

    .line 884
    new-instance v1, Lcom/facebook/mqtt/messages/j;

    invoke-direct {v1, p2}, Lcom/facebook/mqtt/messages/j;-><init>(I)V

    .line 886
    new-instance v2, Lcom/facebook/mqtt/messages/m;

    invoke-direct {v2, v0, v1}, Lcom/facebook/mqtt/messages/m;-><init>(Lcom/facebook/mqtt/messages/h;Lcom/facebook/mqtt/messages/j;)V

    .line 887
    invoke-direct {p0, p1, v2}, Lcom/facebook/mqtt/b;->a(Lcom/facebook/mqtt/a/f;Lcom/facebook/mqtt/messages/l;)V

    .line 889
    iget-object v0, p0, Lcom/facebook/mqtt/b;->u:Lcom/facebook/mqtt/o;

    if-eqz v0, :cond_0

    .line 890
    iget-object v0, p0, Lcom/facebook/mqtt/b;->u:Lcom/facebook/mqtt/o;

    invoke-interface {v0, p2}, Lcom/facebook/mqtt/o;->b(I)V

    .line 892
    :cond_0
    return-void
.end method

.method private a(Lcom/facebook/mqtt/a/f;Lcom/facebook/mqtt/messages/l;)V
    .locals 2

    .prologue
    .line 928
    invoke-virtual {p1, p2}, Lcom/facebook/mqtt/a/f;->a(Lcom/facebook/mqtt/messages/l;)V

    .line 929
    iget-object v0, p0, Lcom/facebook/mqtt/b;->h:Lcom/facebook/common/time/a;

    invoke-interface {v0}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/mqtt/b;->m:J

    .line 930
    iget-object v0, p0, Lcom/facebook/mqtt/b;->f:Lcom/facebook/k/a;

    invoke-virtual {v0}, Lcom/facebook/k/a;->a()V

    .line 931
    return-void
.end method

.method private a(Lcom/facebook/mqtt/a/f;Lcom/facebook/mqtt/w;)V
    .locals 6

    .prologue
    const/4 v5, 0x0

    const/4 v4, 0x1

    .line 797
    sget-object v0, Lcom/facebook/mqtt/b;->a:Ljava/lang/Class;

    const-string v1, "Sending connect message with keepalive interval at %d seconds"

    new-array v2, v4, [Ljava/lang/Object;

    invoke-virtual {p2}, Lcom/facebook/mqtt/w;->g()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v2, v5

    invoke-static {v0, v1, v2}, Lcom/facebook/debug/log/b;->c(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 801
    new-instance v0, Lcom/fasterxml/jackson/databind/node/ObjectNode;

    sget-object v1, Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;->instance:Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;

    invoke-direct {v0, v1}, Lcom/fasterxml/jackson/databind/node/ObjectNode;-><init>(Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;)V

    .line 802
    const-string v1, "uid"

    invoke-virtual {p2}, Lcom/facebook/mqtt/w;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 803
    const-string v1, "agent"

    invoke-virtual {p2}, Lcom/facebook/mqtt/w;->f()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 804
    const-string v1, "capabilities"

    invoke-direct {p0}, Lcom/facebook/mqtt/b;->n()J

    move-result-wide v2

    invoke-virtual {v0, v1, v2, v3}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;J)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 805
    invoke-virtual {p2}, Lcom/facebook/mqtt/w;->k()Lcom/fasterxml/jackson/databind/node/ObjectNode;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->putAll(Lcom/fasterxml/jackson/databind/node/ObjectNode;)Lcom/fasterxml/jackson/databind/JsonNode;

    .line 807
    sget-object v1, Lcom/facebook/mqtt/b;->a:Ljava/lang/Class;

    const-string v2, "Connecting with %s"

    new-array v3, v4, [Ljava/lang/Object;

    aput-object v0, v3, v5

    invoke-static {v1, v2, v3}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 809
    invoke-static {}, Lcom/facebook/mqtt/messages/h;->newBuilder()Lcom/facebook/mqtt/messages/i;

    move-result-object v1

    sget-object v2, Lcom/facebook/mqtt/messages/k;->CONNECT:Lcom/facebook/mqtt/messages/k;

    invoke-virtual {v1, v2}, Lcom/facebook/mqtt/messages/i;->a(Lcom/facebook/mqtt/messages/k;)Lcom/facebook/mqtt/messages/i;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/mqtt/messages/i;->f()Lcom/facebook/mqtt/messages/h;

    move-result-object v1

    .line 812
    new-instance v2, Lcom/facebook/mqtt/messages/g;

    invoke-direct {v2}, Lcom/facebook/mqtt/messages/g;-><init>()V

    const/4 v3, 0x3

    invoke-virtual {v2, v3}, Lcom/facebook/mqtt/messages/g;->a(I)Lcom/facebook/mqtt/messages/g;

    move-result-object v2

    invoke-virtual {v2, v4}, Lcom/facebook/mqtt/messages/g;->a(Z)Lcom/facebook/mqtt/messages/g;

    move-result-object v2

    invoke-virtual {v2, v4}, Lcom/facebook/mqtt/messages/g;->b(Z)Lcom/facebook/mqtt/messages/g;

    move-result-object v2

    invoke-virtual {p2}, Lcom/facebook/mqtt/w;->g()I

    move-result v3

    invoke-virtual {v2, v3}, Lcom/facebook/mqtt/messages/g;->c(I)Lcom/facebook/mqtt/messages/g;

    move-result-object v2

    invoke-virtual {p2}, Lcom/facebook/mqtt/w;->b()Z

    move-result v3

    invoke-virtual {v2, v3}, Lcom/facebook/mqtt/messages/g;->e(Z)Lcom/facebook/mqtt/messages/g;

    move-result-object v2

    invoke-virtual {v2}, Lcom/facebook/mqtt/messages/g;->i()Lcom/facebook/mqtt/messages/f;

    move-result-object v2

    .line 819
    new-instance v3, Lcom/facebook/mqtt/messages/e;

    invoke-direct {v3}, Lcom/facebook/mqtt/messages/e;-><init>()V

    invoke-virtual {p2}, Lcom/facebook/mqtt/w;->c()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/facebook/mqtt/messages/e;->a(Ljava/lang/String;)Lcom/facebook/mqtt/messages/e;

    move-result-object v3

    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/facebook/mqtt/messages/e;->d(Ljava/lang/String;)Lcom/facebook/mqtt/messages/e;

    move-result-object v0

    invoke-virtual {p2}, Lcom/facebook/mqtt/w;->e()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/facebook/mqtt/messages/e;->e(Ljava/lang/String;)Lcom/facebook/mqtt/messages/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/mqtt/messages/e;->f()Lcom/facebook/mqtt/messages/d;

    move-result-object v0

    .line 825
    new-instance v3, Lcom/facebook/mqtt/messages/c;

    invoke-direct {v3, v1, v2, v0}, Lcom/facebook/mqtt/messages/c;-><init>(Lcom/facebook/mqtt/messages/h;Lcom/facebook/mqtt/messages/f;Lcom/facebook/mqtt/messages/d;)V

    .line 826
    invoke-direct {p0, p1, v3}, Lcom/facebook/mqtt/b;->a(Lcom/facebook/mqtt/a/f;Lcom/facebook/mqtt/messages/l;)V

    .line 827
    return-void
.end method

.method private a(Lcom/facebook/mqtt/a/f;Ljava/lang/String;[BII)V
    .locals 3

    .prologue
    .line 861
    invoke-static {}, Lcom/facebook/mqtt/messages/h;->newBuilder()Lcom/facebook/mqtt/messages/i;

    move-result-object v0

    sget-object v1, Lcom/facebook/mqtt/messages/k;->PUBLISH:Lcom/facebook/mqtt/messages/k;

    invoke-virtual {v0, v1}, Lcom/facebook/mqtt/messages/i;->a(Lcom/facebook/mqtt/messages/k;)Lcom/facebook/mqtt/messages/i;

    move-result-object v0

    invoke-virtual {v0, p4}, Lcom/facebook/mqtt/messages/i;->a(I)Lcom/facebook/mqtt/messages/i;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/mqtt/messages/i;->f()Lcom/facebook/mqtt/messages/h;

    move-result-object v0

    .line 865
    new-instance v1, Lcom/facebook/mqtt/messages/o;

    invoke-direct {v1, p2, p5}, Lcom/facebook/mqtt/messages/o;-><init>(Ljava/lang/String;I)V

    .line 866
    new-instance v2, Lcom/facebook/mqtt/messages/n;

    invoke-direct {v2, v0, v1, p3}, Lcom/facebook/mqtt/messages/n;-><init>(Lcom/facebook/mqtt/messages/h;Lcom/facebook/mqtt/messages/o;[B)V

    .line 867
    invoke-direct {p0, p1, v2}, Lcom/facebook/mqtt/b;->a(Lcom/facebook/mqtt/a/f;Lcom/facebook/mqtt/messages/l;)V

    .line 868
    iget-object v0, p0, Lcom/facebook/mqtt/b;->u:Lcom/facebook/mqtt/o;

    if-eqz v0, :cond_0

    .line 869
    iget-object v0, p0, Lcom/facebook/mqtt/b;->u:Lcom/facebook/mqtt/o;

    invoke-interface {v0, p5}, Lcom/facebook/mqtt/o;->b(I)V

    .line 871
    :cond_0
    return-void
.end method

.method private a(Lcom/facebook/mqtt/a/f;Ljava/util/List;I)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/mqtt/a/f;",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/mqtt/messages/SubscribeTopic;",
            ">;I)V"
        }
    .end annotation

    .prologue
    .line 831
    invoke-static {}, Lcom/facebook/mqtt/messages/h;->newBuilder()Lcom/facebook/mqtt/messages/i;

    move-result-object v0

    sget-object v1, Lcom/facebook/mqtt/messages/k;->SUBSCRIBE:Lcom/facebook/mqtt/messages/k;

    invoke-virtual {v0, v1}, Lcom/facebook/mqtt/messages/i;->a(Lcom/facebook/mqtt/messages/k;)Lcom/facebook/mqtt/messages/i;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/mqtt/messages/i;->f()Lcom/facebook/mqtt/messages/h;

    move-result-object v0

    .line 834
    new-instance v1, Lcom/facebook/mqtt/messages/j;

    invoke-direct {v1, p3}, Lcom/facebook/mqtt/messages/j;-><init>(I)V

    .line 835
    new-instance v2, Lcom/facebook/mqtt/messages/s;

    invoke-direct {v2, p2}, Lcom/facebook/mqtt/messages/s;-><init>(Ljava/util/List;)V

    .line 836
    new-instance v3, Lcom/facebook/mqtt/messages/r;

    invoke-direct {v3, v0, v1, v2}, Lcom/facebook/mqtt/messages/r;-><init>(Lcom/facebook/mqtt/messages/h;Lcom/facebook/mqtt/messages/j;Lcom/facebook/mqtt/messages/s;)V

    .line 838
    invoke-direct {p0, p1, v3}, Lcom/facebook/mqtt/b;->a(Lcom/facebook/mqtt/a/f;Lcom/facebook/mqtt/messages/l;)V

    .line 839
    iget-object v0, p0, Lcom/facebook/mqtt/b;->u:Lcom/facebook/mqtt/o;

    if-eqz v0, :cond_0

    .line 840
    iget-object v0, p0, Lcom/facebook/mqtt/b;->u:Lcom/facebook/mqtt/o;

    invoke-interface {v0, p3}, Lcom/facebook/mqtt/o;->b(I)V

    .line 842
    :cond_0
    return-void
.end method

.method static synthetic a(Lcom/facebook/mqtt/b;)V
    .locals 0

    .prologue
    .line 68
    invoke-direct {p0}, Lcom/facebook/mqtt/b;->h()V

    return-void
.end method

.method static synthetic a(Lcom/facebook/mqtt/b;I)V
    .locals 0

    .prologue
    .line 68
    invoke-direct {p0, p1}, Lcom/facebook/mqtt/b;->b(I)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/mqtt/b;Lcom/facebook/mqtt/m;Ljava/lang/Throwable;)V
    .locals 0

    .prologue
    .line 68
    invoke-direct {p0, p1, p2}, Lcom/facebook/mqtt/b;->a(Lcom/facebook/mqtt/m;Ljava/lang/Throwable;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/mqtt/b;Ljava/lang/String;[BIZI)V
    .locals 0

    .prologue
    .line 68
    invoke-direct/range {p0 .. p5}, Lcom/facebook/mqtt/b;->a(Ljava/lang/String;[BIZI)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/mqtt/b;Ljava/util/List;I)V
    .locals 0

    .prologue
    .line 68
    invoke-direct {p0, p1, p2}, Lcom/facebook/mqtt/b;->a(Ljava/util/List;I)V

    return-void
.end method

.method private a(Lcom/facebook/mqtt/m;Ljava/lang/Throwable;)V
    .locals 9

    .prologue
    const-wide v7, 0x7fffffffffffffffL

    .line 645
    sget-object v0, Lcom/facebook/mqtt/b;->a:Ljava/lang/Class;

    const-string v1, "Disconnecting %s"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-static {v0, v1, v2}, Lcom/facebook/debug/log/b;->c(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 649
    monitor-enter p0

    .line 650
    :try_start_0
    iget-object v0, p0, Lcom/facebook/mqtt/b;->t:Lcom/facebook/mqtt/n;

    sget-object v1, Lcom/facebook/mqtt/n;->CONNECTED:Lcom/facebook/mqtt/n;

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lcom/facebook/mqtt/b;->t:Lcom/facebook/mqtt/n;

    sget-object v1, Lcom/facebook/mqtt/n;->CONNECTING:Lcom/facebook/mqtt/n;

    if-eq v0, v1, :cond_0

    .line 651
    monitor-exit p0

    .line 687
    :goto_0
    return-void

    .line 654
    :cond_0
    iget-object v0, p0, Lcom/facebook/mqtt/b;->o:Ljava/net/Socket;

    .line 655
    iget-object v1, p0, Lcom/facebook/mqtt/b;->u:Lcom/facebook/mqtt/o;

    .line 656
    const/4 v2, 0x0

    iput-object v2, p0, Lcom/facebook/mqtt/b;->o:Ljava/net/Socket;

    .line 657
    const/4 v2, 0x0

    iput-object v2, p0, Lcom/facebook/mqtt/b;->v:Lcom/google/common/b/d;

    .line 658
    const/4 v2, 0x0

    iput-object v2, p0, Lcom/facebook/mqtt/b;->w:Lcom/google/common/b/e;

    .line 659
    const/4 v2, 0x0

    iput-object v2, p0, Lcom/facebook/mqtt/b;->r:Ljava/lang/Thread;

    .line 660
    const/4 v2, 0x0

    iput-object v2, p0, Lcom/facebook/mqtt/b;->p:Lcom/facebook/mqtt/a/a;

    .line 661
    const/4 v2, 0x0

    iput-object v2, p0, Lcom/facebook/mqtt/b;->q:Lcom/facebook/mqtt/a/f;

    .line 662
    sget-object v2, Lcom/facebook/mqtt/n;->DISCONNECTED:Lcom/facebook/mqtt/n;

    iput-object v2, p0, Lcom/facebook/mqtt/b;->t:Lcom/facebook/mqtt/n;

    .line 663
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    .line 664
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 666
    invoke-direct {p0, v0}, Lcom/facebook/mqtt/b;->a(Ljava/net/Socket;)V

    .line 668
    if-eqz v1, :cond_1

    .line 669
    invoke-virtual {p1}, Lcom/facebook/mqtt/m;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0}, Lcom/facebook/mqtt/o;->a(Ljava/lang/String;)V

    .line 672
    :cond_1
    if-eqz p2, :cond_2

    .line 673
    iget-object v0, p0, Lcom/facebook/mqtt/b;->e:Lcom/facebook/analytics/cj;

    iget-wide v1, p0, Lcom/facebook/mqtt/b;->k:J

    invoke-direct {p0, v1, v2}, Lcom/facebook/mqtt/b;->b(J)Lcom/google/common/base/Optional;

    move-result-object v1

    iget-wide v2, p0, Lcom/facebook/mqtt/b;->l:J

    invoke-direct {p0, v2, v3}, Lcom/facebook/mqtt/b;->b(J)Lcom/google/common/base/Optional;

    move-result-object v2

    iget-wide v3, p0, Lcom/facebook/mqtt/b;->m:J

    invoke-direct {p0, v3, v4}, Lcom/facebook/mqtt/b;->b(J)Lcom/google/common/base/Optional;

    move-result-object v3

    iget-wide v4, p0, Lcom/facebook/mqtt/b;->n:J

    invoke-direct {p0, v4, v5}, Lcom/facebook/mqtt/b;->b(J)Lcom/google/common/base/Optional;

    move-result-object v4

    invoke-virtual {p1}, Lcom/facebook/mqtt/m;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/google/common/base/Optional;->of(Ljava/lang/Object;)Lcom/google/common/base/Optional;

    move-result-object v5

    invoke-static {p2}, Lcom/google/common/base/Optional;->of(Ljava/lang/Object;)Lcom/google/common/base/Optional;

    move-result-object v6

    invoke-virtual/range {v0 .. v6}, Lcom/facebook/analytics/cj;->a(Lcom/google/common/base/Optional;Lcom/google/common/base/Optional;Lcom/google/common/base/Optional;Lcom/google/common/base/Optional;Lcom/google/common/base/Optional;Lcom/google/common/base/Optional;)V

    .line 683
    :cond_2
    iput-wide v7, p0, Lcom/facebook/mqtt/b;->k:J

    .line 684
    iput-wide v7, p0, Lcom/facebook/mqtt/b;->l:J

    .line 685
    iput-wide v7, p0, Lcom/facebook/mqtt/b;->m:J

    .line 686
    iput-wide v7, p0, Lcom/facebook/mqtt/b;->n:J

    goto :goto_0

    .line 664
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method private a(Ljava/lang/String;[BIZI)V
    .locals 6

    .prologue
    .line 728
    :try_start_0
    invoke-direct {p0}, Lcom/facebook/mqtt/b;->l()V

    .line 729
    invoke-virtual {p0}, Lcom/facebook/mqtt/b;->b()Z

    move-result v0

    if-nez v0, :cond_0

    .line 737
    :goto_0
    return-void

    .line 732
    :cond_0
    iget-object v1, p0, Lcom/facebook/mqtt/b;->q:Lcom/facebook/mqtt/a/f;

    move-object v0, p0

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move v5, p5

    invoke-direct/range {v0 .. v5}, Lcom/facebook/mqtt/b;->a(Lcom/facebook/mqtt/a/f;Ljava/lang/String;[BII)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 733
    :catch_0
    move-exception v0

    .line 734
    sget-object v1, Lcom/facebook/mqtt/b;->a:Ljava/lang/Class;

    const-string v2, "Caught exception trying to publish"

    invoke-static {v1, v2, v0}, Lcom/facebook/debug/log/b;->d(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 735
    sget-object v1, Lcom/facebook/mqtt/m;->PUBLISH:Lcom/facebook/mqtt/m;

    invoke-direct {p0, v1, v0}, Lcom/facebook/mqtt/b;->a(Lcom/facebook/mqtt/m;Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method private a(Ljava/net/Socket;)V
    .locals 1

    .prologue
    .line 623
    if-eqz p1, :cond_0

    .line 625
    :try_start_0
    invoke-virtual {p1}, Ljava/net/Socket;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 630
    :cond_0
    :goto_0
    return-void

    .line 626
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method private a(Ljava/util/List;I)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/mqtt/messages/SubscribeTopic;",
            ">;I)V"
        }
    .end annotation

    .prologue
    .line 701
    :try_start_0
    invoke-direct {p0}, Lcom/facebook/mqtt/b;->l()V

    .line 702
    invoke-virtual {p0}, Lcom/facebook/mqtt/b;->b()Z

    move-result v0

    if-nez v0, :cond_0

    .line 710
    :goto_0
    return-void

    .line 705
    :cond_0
    iget-object v0, p0, Lcom/facebook/mqtt/b;->q:Lcom/facebook/mqtt/a/f;

    invoke-direct {p0, v0, p1, p2}, Lcom/facebook/mqtt/b;->a(Lcom/facebook/mqtt/a/f;Ljava/util/List;I)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 706
    :catch_0
    move-exception v0

    .line 707
    sget-object v1, Lcom/facebook/mqtt/b;->a:Ljava/lang/Class;

    const-string v2, "Caught exception trying to subscribe"

    invoke-static {v1, v2, v0}, Lcom/facebook/debug/log/b;->d(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 708
    sget-object v1, Lcom/facebook/mqtt/m;->SUBSCRIBE:Lcom/facebook/mqtt/m;

    invoke-direct {p0, v1, v0}, Lcom/facebook/mqtt/b;->a(Lcom/facebook/mqtt/m;Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method private b(J)Lcom/google/common/base/Optional;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)",
            "Lcom/google/common/base/Optional",
            "<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .prologue
    .line 690
    iget-object v0, p0, Lcom/facebook/mqtt/b;->h:Lcom/facebook/common/time/a;

    invoke-interface {v0}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v0

    .line 691
    cmp-long v2, p1, v0

    if-lez v2, :cond_0

    .line 692
    invoke-static {}, Lcom/google/common/base/Optional;->absent()Lcom/google/common/base/Optional;

    move-result-object v0

    .line 696
    :goto_0
    return-object v0

    .line 695
    :cond_0
    iget-wide v2, p0, Lcom/facebook/mqtt/b;->k:J

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x3e8

    div-long/2addr v0, v2

    .line 696
    long-to-int v0, v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/base/Optional;->of(Ljava/lang/Object;)Lcom/google/common/base/Optional;

    move-result-object v0

    goto :goto_0
.end method

.method private b(I)V
    .locals 3

    .prologue
    .line 781
    :try_start_0
    invoke-virtual {p0}, Lcom/facebook/mqtt/b;->b()Z

    move-result v0

    if-nez v0, :cond_0

    .line 793
    :goto_0
    return-void

    .line 784
    :cond_0
    iget-object v0, p0, Lcom/facebook/mqtt/b;->q:Lcom/facebook/mqtt/a/f;

    invoke-direct {p0, v0, p1}, Lcom/facebook/mqtt/b;->a(Lcom/facebook/mqtt/a/f;I)V

    .line 785
    iget-object v0, p0, Lcom/facebook/mqtt/b;->e:Lcom/facebook/analytics/cj;

    const-string v1, "mqtt_acknowledged_delivery_sent"

    invoke-virtual {v0, v1, p1}, Lcom/facebook/analytics/cj;->a(Ljava/lang/String;I)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 789
    :catch_0
    move-exception v0

    .line 790
    sget-object v1, Lcom/facebook/mqtt/b;->a:Ljava/lang/Class;

    const-string v2, "Caught exception trying to send PUBACK"

    invoke-static {v1, v2, v0}, Lcom/facebook/debug/log/b;->d(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 791
    sget-object v1, Lcom/facebook/mqtt/m;->PUBACK:Lcom/facebook/mqtt/m;

    invoke-direct {p0, v1, v0}, Lcom/facebook/mqtt/b;->a(Lcom/facebook/mqtt/m;Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method private b(Lcom/facebook/mqtt/a/f;Ljava/util/List;I)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/mqtt/a/f;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;I)V"
        }
    .end annotation

    .prologue
    .line 846
    invoke-static {}, Lcom/facebook/mqtt/messages/h;->newBuilder()Lcom/facebook/mqtt/messages/i;

    move-result-object v0

    sget-object v1, Lcom/facebook/mqtt/messages/k;->UNSUBSCRIBE:Lcom/facebook/mqtt/messages/k;

    invoke-virtual {v0, v1}, Lcom/facebook/mqtt/messages/i;->a(Lcom/facebook/mqtt/messages/k;)Lcom/facebook/mqtt/messages/i;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/mqtt/messages/i;->f()Lcom/facebook/mqtt/messages/h;

    move-result-object v0

    .line 849
    new-instance v1, Lcom/facebook/mqtt/messages/j;

    invoke-direct {v1, p3}, Lcom/facebook/mqtt/messages/j;-><init>(I)V

    .line 850
    new-instance v2, Lcom/facebook/mqtt/messages/w;

    invoke-direct {v2, p2}, Lcom/facebook/mqtt/messages/w;-><init>(Ljava/util/List;)V

    .line 851
    new-instance v3, Lcom/facebook/mqtt/messages/v;

    invoke-direct {v3, v0, v1, v2}, Lcom/facebook/mqtt/messages/v;-><init>(Lcom/facebook/mqtt/messages/h;Lcom/facebook/mqtt/messages/j;Lcom/facebook/mqtt/messages/w;)V

    .line 853
    invoke-direct {p0, p1, v3}, Lcom/facebook/mqtt/b;->a(Lcom/facebook/mqtt/a/f;Lcom/facebook/mqtt/messages/l;)V

    .line 854
    iget-object v0, p0, Lcom/facebook/mqtt/b;->u:Lcom/facebook/mqtt/o;

    if-eqz v0, :cond_0

    .line 855
    iget-object v0, p0, Lcom/facebook/mqtt/b;->u:Lcom/facebook/mqtt/o;

    invoke-interface {v0, p3}, Lcom/facebook/mqtt/o;->b(I)V

    .line 857
    :cond_0
    return-void
.end method

.method static synthetic b(Lcom/facebook/mqtt/b;)V
    .locals 0

    .prologue
    .line 68
    invoke-direct {p0}, Lcom/facebook/mqtt/b;->k()V

    return-void
.end method

.method static synthetic b(Lcom/facebook/mqtt/b;Ljava/util/List;I)V
    .locals 0

    .prologue
    .line 68
    invoke-direct {p0, p1, p2}, Lcom/facebook/mqtt/b;->b(Ljava/util/List;I)V

    return-void
.end method

.method private b(Ljava/util/List;I)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;I)V"
        }
    .end annotation

    .prologue
    .line 714
    :try_start_0
    invoke-direct {p0}, Lcom/facebook/mqtt/b;->l()V

    .line 715
    invoke-virtual {p0}, Lcom/facebook/mqtt/b;->b()Z

    move-result v0

    if-nez v0, :cond_0

    .line 723
    :goto_0
    return-void

    .line 718
    :cond_0
    iget-object v0, p0, Lcom/facebook/mqtt/b;->q:Lcom/facebook/mqtt/a/f;

    invoke-direct {p0, v0, p1, p2}, Lcom/facebook/mqtt/b;->b(Lcom/facebook/mqtt/a/f;Ljava/util/List;I)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 719
    :catch_0
    move-exception v0

    .line 720
    sget-object v1, Lcom/facebook/mqtt/b;->a:Ljava/lang/Class;

    const-string v2, "Caught exception trying to unsubscribe"

    invoke-static {v1, v2, v0}, Lcom/facebook/debug/log/b;->d(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 721
    sget-object v1, Lcom/facebook/mqtt/m;->UNSUBSCRIBE:Lcom/facebook/mqtt/m;

    invoke-direct {p0, v1, v0}, Lcom/facebook/mqtt/b;->a(Lcom/facebook/mqtt/m;Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method private h()V
    .locals 13

    .prologue
    const/4 v12, 0x2

    const/4 v11, 0x1

    const/4 v10, 0x0

    .line 353
    iget-object v0, p0, Lcom/facebook/mqtt/b;->h:Lcom/facebook/common/time/a;

    invoke-interface {v0}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v2

    .line 354
    invoke-direct {p0}, Lcom/facebook/mqtt/b;->i()Lcom/facebook/mqtt/l;

    move-result-object v7

    .line 355
    iget-object v0, p0, Lcom/facebook/mqtt/b;->e:Lcom/facebook/analytics/cj;

    iget-boolean v1, v7, Lcom/facebook/mqtt/l;->a:Z

    iget-object v4, p0, Lcom/facebook/mqtt/b;->h:Lcom/facebook/common/time/a;

    invoke-interface {v4}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v4

    sub-long v2, v4, v2

    iget-object v4, v7, Lcom/facebook/mqtt/l;->b:Lcom/google/common/base/Optional;

    invoke-virtual {v4}, Lcom/google/common/base/Optional;->isPresent()Z

    move-result v4

    if-eqz v4, :cond_3

    iget-object v4, v7, Lcom/facebook/mqtt/l;->b:Lcom/google/common/base/Optional;

    invoke-virtual {v4}, Lcom/google/common/base/Optional;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/google/common/base/Optional;->of(Ljava/lang/Object;)Lcom/google/common/base/Optional;

    move-result-object v4

    :goto_0
    iget-object v5, v7, Lcom/facebook/mqtt/l;->c:Lcom/google/common/base/Optional;

    iget-object v6, v7, Lcom/facebook/mqtt/l;->d:Lcom/google/common/base/Optional;

    invoke-virtual/range {v0 .. v6}, Lcom/facebook/analytics/cj;->a(ZJLcom/google/common/base/Optional;Lcom/google/common/base/Optional;Lcom/google/common/base/Optional;)V

    .line 364
    iget-boolean v0, v7, Lcom/facebook/mqtt/l;->a:Z

    if-eqz v0, :cond_0

    .line 365
    iget-object v0, p0, Lcom/facebook/mqtt/b;->h:Lcom/facebook/common/time/a;

    invoke-interface {v0}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/mqtt/b;->k:J

    .line 369
    :cond_0
    iget-object v0, p0, Lcom/facebook/mqtt/b;->u:Lcom/facebook/mqtt/o;

    if-eqz v0, :cond_1

    .line 370
    iget-boolean v0, v7, Lcom/facebook/mqtt/l;->a:Z

    if-eqz v0, :cond_4

    .line 371
    iget-object v0, p0, Lcom/facebook/mqtt/b;->u:Lcom/facebook/mqtt/o;

    invoke-interface {v0}, Lcom/facebook/mqtt/o;->a()V

    .line 380
    :cond_1
    :goto_1
    monitor-enter p0

    .line 381
    :try_start_0
    iget-object v0, p0, Lcom/facebook/mqtt/b;->t:Lcom/facebook/mqtt/n;

    sget-object v1, Lcom/facebook/mqtt/n;->CONNECTED:Lcom/facebook/mqtt/n;

    if-eq v0, v1, :cond_5

    .line 382
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 447
    :cond_2
    :goto_2
    sget-object v0, Lcom/facebook/mqtt/n;->DISCONNECTED:Lcom/facebook/mqtt/n;

    iput-object v0, p0, Lcom/facebook/mqtt/b;->t:Lcom/facebook/mqtt/n;

    .line 448
    sget-object v0, Lcom/facebook/mqtt/b;->a:Ljava/lang/Class;

    const-string v1, "MQTT network thread exiting"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->c(Ljava/lang/Class;Ljava/lang/String;)V

    .line 449
    return-void

    .line 355
    :cond_3
    invoke-static {}, Lcom/google/common/base/Optional;->absent()Lcom/google/common/base/Optional;

    move-result-object v4

    goto :goto_0

    .line 373
    :cond_4
    sget-object v0, Lcom/facebook/mqtt/n;->DISCONNECTED:Lcom/facebook/mqtt/n;

    iput-object v0, p0, Lcom/facebook/mqtt/b;->t:Lcom/facebook/mqtt/n;

    .line 374
    iget-object v1, p0, Lcom/facebook/mqtt/b;->u:Lcom/facebook/mqtt/o;

    iget-object v0, v7, Lcom/facebook/mqtt/l;->b:Lcom/google/common/base/Optional;

    invoke-virtual {v0}, Lcom/google/common/base/Optional;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/mqtt/a;

    invoke-interface {v1, v0}, Lcom/facebook/mqtt/o;->a(Lcom/facebook/mqtt/a;)V

    goto :goto_1

    .line 384
    :cond_5
    :try_start_1
    iget-object v0, p0, Lcom/facebook/mqtt/b;->p:Lcom/facebook/mqtt/a/a;

    .line 385
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 389
    :try_start_2
    invoke-virtual {v0}, Lcom/facebook/mqtt/a/a;->a()Lcom/facebook/mqtt/messages/l;
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    move-result-object v1

    .line 397
    iget-object v2, p0, Lcom/facebook/mqtt/b;->u:Lcom/facebook/mqtt/o;

    .line 398
    invoke-virtual {v1}, Lcom/facebook/mqtt/messages/l;->e()Lcom/facebook/mqtt/messages/k;

    move-result-object v3

    .line 399
    sget-object v0, Lcom/facebook/mqtt/j;->a:[I

    invoke-virtual {v3}, Lcom/facebook/mqtt/messages/k;->ordinal()I

    move-result v4

    aget v0, v0, v4

    packed-switch v0, :pswitch_data_0

    .line 434
    sget-object v0, Lcom/facebook/mqtt/b;->a:Ljava/lang/Class;

    const-string v4, "MQTT Packet received: %s"

    new-array v5, v11, [Ljava/lang/Object;

    aput-object v3, v5, v10

    invoke-static {v0, v4, v5}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 438
    :cond_6
    :goto_3
    iget-object v0, p0, Lcom/facebook/mqtt/b;->h:Lcom/facebook/common/time/a;

    invoke-interface {v0}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v3

    iput-wide v3, p0, Lcom/facebook/mqtt/b;->n:J

    .line 441
    if-eqz v2, :cond_1

    .line 442
    invoke-interface {v2, v1}, Lcom/facebook/mqtt/o;->a(Lcom/facebook/mqtt/messages/l;)V

    .line 443
    iget-object v0, p0, Lcom/facebook/mqtt/b;->f:Lcom/facebook/k/a;

    invoke-virtual {v0}, Lcom/facebook/k/a;->a()V

    goto :goto_1

    .line 385
    :catchall_0
    move-exception v0

    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v0

    .line 390
    :catch_0
    move-exception v0

    .line 391
    iget-object v1, p0, Lcom/facebook/mqtt/b;->t:Lcom/facebook/mqtt/n;

    sget-object v2, Lcom/facebook/mqtt/n;->DISCONNECTED:Lcom/facebook/mqtt/n;

    if-eq v1, v2, :cond_2

    .line 392
    sget-object v1, Lcom/facebook/mqtt/b;->a:Ljava/lang/Class;

    const-string v2, "Error in network loop: "

    invoke-static {v1, v2, v0}, Lcom/facebook/debug/log/b;->d(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 393
    sget-object v1, Lcom/facebook/mqtt/m;->NETWORK_THREAD_LOOP:Lcom/facebook/mqtt/m;

    invoke-direct {p0, v1, v0}, Lcom/facebook/mqtt/b;->a(Lcom/facebook/mqtt/m;Ljava/lang/Throwable;)V

    goto :goto_2

    :pswitch_0
    move-object v0, v1

    .line 401
    check-cast v0, Lcom/facebook/mqtt/messages/n;

    .line 402
    invoke-virtual {v0}, Lcom/facebook/mqtt/messages/n;->a()Lcom/facebook/mqtt/messages/o;

    move-result-object v4

    invoke-virtual {v4}, Lcom/facebook/mqtt/messages/o;->a()Ljava/lang/String;

    move-result-object v4

    .line 403
    invoke-virtual {v0}, Lcom/facebook/mqtt/messages/n;->a()Lcom/facebook/mqtt/messages/o;

    move-result-object v5

    invoke-virtual {v5}, Lcom/facebook/mqtt/messages/o;->b()I

    move-result v5

    .line 404
    invoke-virtual {v0}, Lcom/facebook/mqtt/messages/n;->f()Lcom/facebook/mqtt/messages/h;

    move-result-object v6

    invoke-virtual {v6}, Lcom/facebook/mqtt/messages/h;->c()I

    move-result v6

    .line 406
    sget-object v7, Lcom/facebook/mqtt/b;->a:Ljava/lang/Class;

    const-string v8, "MQTT Packet received: %s id:%d qos:%d topic:%s"

    const/4 v9, 0x4

    new-array v9, v9, [Ljava/lang/Object;

    aput-object v3, v9, v10

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v9, v11

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v9, v12

    const/4 v3, 0x3

    aput-object v4, v9, v3

    invoke-static {v7, v8, v9}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 408
    if-eqz v2, :cond_7

    .line 409
    invoke-virtual {v0}, Lcom/facebook/mqtt/messages/n;->c()[B

    move-result-object v3

    invoke-virtual {v0}, Lcom/facebook/mqtt/messages/n;->f()Lcom/facebook/mqtt/messages/h;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/mqtt/messages/h;->d()Z

    move-result v0

    invoke-interface {v2, v4, v3, v6, v0}, Lcom/facebook/mqtt/o;->a(Ljava/lang/String;[BIZ)V

    .line 417
    :cond_7
    sget-object v0, Lcom/facebook/mqtt/x;->ACKNOWLEDGED_DELIVERY:Lcom/facebook/mqtt/x;

    invoke-virtual {v0}, Lcom/facebook/mqtt/x;->getValue()I

    move-result v0

    if-ne v6, v0, :cond_6

    .line 418
    invoke-direct {p0, v5}, Lcom/facebook/mqtt/b;->a(I)V

    .line 419
    iget-object v0, p0, Lcom/facebook/mqtt/b;->e:Lcom/facebook/analytics/cj;

    const-string v3, "mqtt_acknowledged_delivery_recv"

    invoke-virtual {v0, v3, v5}, Lcom/facebook/analytics/cj;->a(Ljava/lang/String;I)V

    goto/16 :goto_3

    :pswitch_1
    move-object v0, v1

    .line 426
    check-cast v0, Lcom/facebook/mqtt/messages/m;

    .line 427
    sget-object v4, Lcom/facebook/mqtt/b;->a:Ljava/lang/Class;

    const-string v5, "MQTT Packet received: %s id:%d"

    new-array v6, v12, [Ljava/lang/Object;

    aput-object v3, v6, v10

    invoke-virtual {v0}, Lcom/facebook/mqtt/messages/m;->a()Lcom/facebook/mqtt/messages/j;

    move-result-object v3

    invoke-virtual {v3}, Lcom/facebook/mqtt/messages/j;->a()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v6, v11

    invoke-static {v4, v5, v6}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 429
    if-eqz v2, :cond_6

    .line 430
    invoke-virtual {v0}, Lcom/facebook/mqtt/messages/m;->a()Lcom/facebook/mqtt/messages/j;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/mqtt/messages/j;->a()I

    move-result v0

    invoke-interface {v2, v0}, Lcom/facebook/mqtt/o;->a(I)V

    goto/16 :goto_3

    .line 399
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method private i()Lcom/facebook/mqtt/l;
    .locals 12

    .prologue
    const/4 v0, 0x0

    .line 460
    sget-object v1, Lcom/facebook/mqtt/b;->a:Ljava/lang/Class;

    const-string v2, "Connecting"

    invoke-static {v1, v2}, Lcom/facebook/debug/log/b;->c(Ljava/lang/Class;Ljava/lang/String;)V

    .line 462
    iget-object v1, p0, Lcom/facebook/mqtt/b;->g:Lcom/facebook/mqtt/w;

    invoke-virtual {v1}, Lcom/facebook/mqtt/w;->a()Lcom/facebook/mqtt/t;

    move-result-object v1

    .line 465
    iget-object v2, p0, Lcom/facebook/mqtt/b;->h:Lcom/facebook/common/time/a;

    invoke-interface {v2}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v2

    .line 468
    :try_start_0
    invoke-virtual {v1}, Lcom/facebook/mqtt/t;->a()Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, Lcom/facebook/mqtt/b;->g:Lcom/facebook/mqtt/w;

    invoke-virtual {v5}, Lcom/facebook/mqtt/w;->j()I

    move-result v5

    int-to-long v5, v5

    const-wide/16 v7, 0x3e8

    mul-long/2addr v5, v7

    invoke-static {v4, v5, v6}, Lcom/facebook/common/m/a;->a(Ljava/lang/String;J)Ljava/net/InetAddress;
    :try_end_0
    .catch Lcom/facebook/common/m/d; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v4

    .line 475
    iget-object v5, p0, Lcom/facebook/mqtt/b;->e:Lcom/facebook/analytics/cj;

    const-string v6, "mqtt_dns_lookup_duration"

    iget-object v7, p0, Lcom/facebook/mqtt/b;->h:Lcom/facebook/common/time/a;

    invoke-interface {v7}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v7

    sub-long v2, v7, v2

    invoke-virtual {v5, v6, v2, v3}, Lcom/facebook/analytics/cj;->a(Ljava/lang/String;J)V

    .line 481
    invoke-virtual {v1}, Lcom/facebook/mqtt/t;->c()I

    move-result v2

    .line 482
    invoke-virtual {v1}, Lcom/facebook/mqtt/t;->b()I

    move-result v3

    .line 483
    invoke-direct {p0}, Lcom/facebook/mqtt/b;->j()Z

    move-result v5

    if-eqz v5, :cond_0

    if-eq v3, v2, :cond_0

    if-lez v2, :cond_0

    .line 484
    invoke-virtual {v1}, Lcom/facebook/mqtt/t;->d()Z

    move-result v0

    invoke-direct {p0, v0, v4, v2}, Lcom/facebook/mqtt/b;->a(ZLjava/net/InetAddress;I)Ljava/net/Socket;

    move-result-object v0

    .line 488
    :cond_0
    if-nez v0, :cond_5

    .line 489
    invoke-virtual {v1}, Lcom/facebook/mqtt/t;->d()Z

    move-result v0

    invoke-direct {p0, v0, v4, v3}, Lcom/facebook/mqtt/b;->a(ZLjava/net/InetAddress;I)Ljava/net/Socket;

    move-result-object v0

    move-object v2, v0

    .line 492
    :goto_0
    if-nez v2, :cond_1

    .line 493
    sget-object v0, Lcom/facebook/mqtt/b;->a:Ljava/lang/Class;

    const-string v1, "Socket Connection Failed."

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->d(Ljava/lang/Class;Ljava/lang/String;)V

    .line 494
    new-instance v0, Lcom/facebook/mqtt/l;

    sget-object v1, Lcom/facebook/mqtt/a;->FAILED_SOCKET_CONNECT_ERROR:Lcom/facebook/mqtt/a;

    invoke-direct {v0, p0, v1}, Lcom/facebook/mqtt/l;-><init>(Lcom/facebook/mqtt/b;Lcom/facebook/mqtt/a;)V

    .line 578
    :goto_1
    return-object v0

    .line 471
    :catch_0
    move-exception v0

    move-object v1, v0

    .line 472
    sget-object v0, Lcom/facebook/mqtt/b;->a:Ljava/lang/Class;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DNS Unresolved "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v1}, Lcom/facebook/common/m/d;->a()Lcom/facebook/common/m/c;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2, v1}, Lcom/facebook/debug/log/b;->d(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 473
    new-instance v0, Lcom/facebook/mqtt/l;

    sget-object v2, Lcom/facebook/mqtt/a;->FAILED_DNS_UNRESOLVED:Lcom/facebook/mqtt/a;

    invoke-direct {v0, p0, v2, v1}, Lcom/facebook/mqtt/l;-><init>(Lcom/facebook/mqtt/b;Lcom/facebook/mqtt/a;Ljava/lang/Exception;)V

    goto :goto_1

    .line 503
    :cond_1
    :try_start_1
    new-instance v1, Lcom/facebook/mqtt/a/a;

    new-instance v0, Lcom/facebook/mqtt/a/h;

    invoke-direct {v0}, Lcom/facebook/mqtt/a/h;-><init>()V

    invoke-direct {v1, v0}, Lcom/facebook/mqtt/a/a;-><init>(Lcom/facebook/mqtt/a/h;)V

    .line 504
    new-instance v3, Lcom/facebook/mqtt/a/f;

    invoke-direct {v3}, Lcom/facebook/mqtt/a/f;-><init>()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_6

    .line 506
    :try_start_2
    new-instance v4, Lcom/google/common/b/d;

    invoke-virtual {v2}, Ljava/net/Socket;->getInputStream()Ljava/io/InputStream;

    move-result-object v0

    invoke-direct {v4, v0}, Lcom/google/common/b/d;-><init>(Ljava/io/InputStream;)V

    .line 507
    new-instance v0, Ljava/io/DataInputStream;

    invoke-direct {v0, v4}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V

    invoke-virtual {v1, v0}, Lcom/facebook/mqtt/a/a;->a(Ljava/io/DataInputStream;)V

    .line 508
    new-instance v5, Lcom/google/common/b/e;

    invoke-virtual {v2}, Ljava/net/Socket;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v0

    invoke-direct {v5, v0}, Lcom/google/common/b/e;-><init>(Ljava/io/OutputStream;)V

    .line 509
    new-instance v0, Ljava/io/DataOutputStream;

    invoke-direct {v0, v5}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V

    invoke-virtual {v3, v0}, Lcom/facebook/mqtt/a/f;->a(Ljava/io/DataOutputStream;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_6

    .line 517
    :try_start_3
    iget-object v0, p0, Lcom/facebook/mqtt/b;->h:Lcom/facebook/common/time/a;

    invoke-interface {v0}, Lcom/facebook/common/time/a;->a()J
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_6

    move-result-wide v6

    .line 519
    :try_start_4
    iget-object v0, p0, Lcom/facebook/mqtt/b;->g:Lcom/facebook/mqtt/w;

    invoke-direct {p0, v3, v0}, Lcom/facebook/mqtt/b;->a(Lcom/facebook/mqtt/a/f;Lcom/facebook/mqtt/w;)V

    .line 520
    invoke-virtual {v1}, Lcom/facebook/mqtt/a/a;->a()Lcom/facebook/mqtt/messages/l;
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2
    .catchall {:try_start_4 .. :try_end_4} :catchall_6

    move-result-object v0

    .line 526
    :try_start_5
    invoke-virtual {v0}, Lcom/facebook/mqtt/messages/l;->e()Lcom/facebook/mqtt/messages/k;

    move-result-object v8

    sget-object v9, Lcom/facebook/mqtt/messages/k;->CONNACK:Lcom/facebook/mqtt/messages/k;

    if-eq v8, v9, :cond_2

    .line 527
    sget-object v1, Lcom/facebook/mqtt/b;->a:Ljava/lang/Class;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Received unexpected message type "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v0}, Lcom/facebook/mqtt/messages/l;->e()Lcom/facebook/mqtt/messages/k;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/facebook/debug/log/b;->d(Ljava/lang/Class;Ljava/lang/String;)V

    .line 528
    new-instance v0, Lcom/facebook/mqtt/l;

    sget-object v1, Lcom/facebook/mqtt/a;->FAILED_INVALID_CONACK:Lcom/facebook/mqtt/a;

    invoke-direct {v0, p0, v1}, Lcom/facebook/mqtt/l;-><init>(Lcom/facebook/mqtt/b;Lcom/facebook/mqtt/a;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_6

    .line 562
    sget-object v1, Lcom/facebook/mqtt/b;->a:Ljava/lang/Class;

    const-string v3, "Cleaning up connection failure."

    invoke-static {v1, v3}, Lcom/facebook/debug/log/b;->c(Ljava/lang/Class;Ljava/lang/String;)V

    .line 563
    invoke-direct {p0, v2}, Lcom/facebook/mqtt/b;->a(Ljava/net/Socket;)V

    .line 564
    monitor-enter p0

    .line 565
    const/4 v1, 0x0

    :try_start_6
    iput-object v1, p0, Lcom/facebook/mqtt/b;->o:Ljava/net/Socket;

    .line 566
    const/4 v1, 0x0

    iput-object v1, p0, Lcom/facebook/mqtt/b;->q:Lcom/facebook/mqtt/a/f;

    .line 567
    const/4 v1, 0x0

    iput-object v1, p0, Lcom/facebook/mqtt/b;->p:Lcom/facebook/mqtt/a/a;

    .line 568
    const-wide/16 v1, 0x0

    iput-wide v1, p0, Lcom/facebook/mqtt/b;->j:J

    .line 569
    const/4 v1, 0x0

    iput-object v1, p0, Lcom/facebook/mqtt/b;->v:Lcom/google/common/b/d;

    .line 570
    const-wide/16 v1, 0x0

    iput-wide v1, p0, Lcom/facebook/mqtt/b;->i:J

    .line 571
    const/4 v1, 0x0

    iput-object v1, p0, Lcom/facebook/mqtt/b;->w:Lcom/google/common/b/e;

    .line 572
    sget-object v1, Lcom/facebook/mqtt/n;->DISCONNECTED:Lcom/facebook/mqtt/n;

    iput-object v1, p0, Lcom/facebook/mqtt/b;->t:Lcom/facebook/mqtt/n;

    .line 573
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    .line 574
    monitor-exit p0

    goto/16 :goto_1

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    throw v0

    .line 510
    :catch_1
    move-exception v0

    move-object v1, v0

    .line 511
    :try_start_7
    sget-object v0, Lcom/facebook/mqtt/b;->a:Ljava/lang/Class;

    const-string v3, "Failed to create IO stream"

    invoke-static {v0, v3, v1}, Lcom/facebook/debug/log/b;->d(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 512
    new-instance v0, Lcom/facebook/mqtt/l;

    sget-object v3, Lcom/facebook/mqtt/a;->FAILED_CREATE_IOSTREAM:Lcom/facebook/mqtt/a;

    invoke-direct {v0, p0, v3, v1}, Lcom/facebook/mqtt/l;-><init>(Lcom/facebook/mqtt/b;Lcom/facebook/mqtt/a;Ljava/lang/Exception;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_6

    .line 562
    sget-object v1, Lcom/facebook/mqtt/b;->a:Ljava/lang/Class;

    const-string v3, "Cleaning up connection failure."

    invoke-static {v1, v3}, Lcom/facebook/debug/log/b;->c(Ljava/lang/Class;Ljava/lang/String;)V

    .line 563
    invoke-direct {p0, v2}, Lcom/facebook/mqtt/b;->a(Ljava/net/Socket;)V

    .line 564
    monitor-enter p0

    .line 565
    const/4 v1, 0x0

    :try_start_8
    iput-object v1, p0, Lcom/facebook/mqtt/b;->o:Ljava/net/Socket;

    .line 566
    const/4 v1, 0x0

    iput-object v1, p0, Lcom/facebook/mqtt/b;->q:Lcom/facebook/mqtt/a/f;

    .line 567
    const/4 v1, 0x0

    iput-object v1, p0, Lcom/facebook/mqtt/b;->p:Lcom/facebook/mqtt/a/a;

    .line 568
    const-wide/16 v1, 0x0

    iput-wide v1, p0, Lcom/facebook/mqtt/b;->j:J

    .line 569
    const/4 v1, 0x0

    iput-object v1, p0, Lcom/facebook/mqtt/b;->v:Lcom/google/common/b/d;

    .line 570
    const-wide/16 v1, 0x0

    iput-wide v1, p0, Lcom/facebook/mqtt/b;->i:J

    .line 571
    const/4 v1, 0x0

    iput-object v1, p0, Lcom/facebook/mqtt/b;->w:Lcom/google/common/b/e;

    .line 572
    sget-object v1, Lcom/facebook/mqtt/n;->DISCONNECTED:Lcom/facebook/mqtt/n;

    iput-object v1, p0, Lcom/facebook/mqtt/b;->t:Lcom/facebook/mqtt/n;

    .line 573
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    .line 574
    monitor-exit p0

    goto/16 :goto_1

    :catchall_1
    move-exception v0

    monitor-exit p0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    throw v0

    .line 521
    :catch_2
    move-exception v0

    move-object v1, v0

    .line 522
    :try_start_9
    sget-object v0, Lcom/facebook/mqtt/b;->a:Ljava/lang/Class;

    const-string v3, "Failed to send connect message"

    invoke-static {v0, v3, v1}, Lcom/facebook/debug/log/b;->d(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 523
    new-instance v0, Lcom/facebook/mqtt/l;

    sget-object v3, Lcom/facebook/mqtt/a;->FAILED_CONNECT_MESSAGE:Lcom/facebook/mqtt/a;

    invoke-direct {v0, p0, v3, v1}, Lcom/facebook/mqtt/l;-><init>(Lcom/facebook/mqtt/b;Lcom/facebook/mqtt/a;Ljava/lang/Exception;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_6

    .line 562
    sget-object v1, Lcom/facebook/mqtt/b;->a:Ljava/lang/Class;

    const-string v3, "Cleaning up connection failure."

    invoke-static {v1, v3}, Lcom/facebook/debug/log/b;->c(Ljava/lang/Class;Ljava/lang/String;)V

    .line 563
    invoke-direct {p0, v2}, Lcom/facebook/mqtt/b;->a(Ljava/net/Socket;)V

    .line 564
    monitor-enter p0

    .line 565
    const/4 v1, 0x0

    :try_start_a
    iput-object v1, p0, Lcom/facebook/mqtt/b;->o:Ljava/net/Socket;

    .line 566
    const/4 v1, 0x0

    iput-object v1, p0, Lcom/facebook/mqtt/b;->q:Lcom/facebook/mqtt/a/f;

    .line 567
    const/4 v1, 0x0

    iput-object v1, p0, Lcom/facebook/mqtt/b;->p:Lcom/facebook/mqtt/a/a;

    .line 568
    const-wide/16 v1, 0x0

    iput-wide v1, p0, Lcom/facebook/mqtt/b;->j:J

    .line 569
    const/4 v1, 0x0

    iput-object v1, p0, Lcom/facebook/mqtt/b;->v:Lcom/google/common/b/d;

    .line 570
    const-wide/16 v1, 0x0

    iput-wide v1, p0, Lcom/facebook/mqtt/b;->i:J

    .line 571
    const/4 v1, 0x0

    iput-object v1, p0, Lcom/facebook/mqtt/b;->w:Lcom/google/common/b/e;

    .line 572
    sget-object v1, Lcom/facebook/mqtt/n;->DISCONNECTED:Lcom/facebook/mqtt/n;

    iput-object v1, p0, Lcom/facebook/mqtt/b;->t:Lcom/facebook/mqtt/n;

    .line 573
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    .line 574
    monitor-exit p0

    goto/16 :goto_1

    :catchall_2
    move-exception v0

    monitor-exit p0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    throw v0

    .line 531
    :cond_2
    :try_start_b
    iget-object v8, p0, Lcom/facebook/mqtt/b;->e:Lcom/facebook/analytics/cj;

    sget-object v9, Lcom/facebook/mqtt/messages/k;->CONNECT:Lcom/facebook/mqtt/messages/k;

    invoke-virtual {v9}, Lcom/facebook/mqtt/messages/k;->toString()Ljava/lang/String;

    move-result-object v9

    iget-object v10, p0, Lcom/facebook/mqtt/b;->h:Lcom/facebook/common/time/a;

    invoke-interface {v10}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v10

    sub-long v6, v10, v6

    invoke-virtual {v8, v9, v6, v7}, Lcom/facebook/analytics/cj;->b(Ljava/lang/String;J)V

    .line 536
    check-cast v0, Lcom/facebook/mqtt/messages/a;

    .line 537
    invoke-virtual {v0}, Lcom/facebook/mqtt/messages/a;->a()Lcom/facebook/mqtt/messages/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/mqtt/messages/b;->a()B

    move-result v6

    .line 538
    if-eqz v6, :cond_3

    .line 539
    sget-object v0, Lcom/facebook/mqtt/b;->a:Ljava/lang/Class;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "MQTT Connection refused: "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->d(Ljava/lang/Class;Ljava/lang/String;)V

    .line 540
    new-instance v0, Lcom/facebook/mqtt/l;

    sget-object v1, Lcom/facebook/mqtt/a;->FAILED_CONNECTION_REFUSED:Lcom/facebook/mqtt/a;

    invoke-direct {v0, p0, v1, v6}, Lcom/facebook/mqtt/l;-><init>(Lcom/facebook/mqtt/b;Lcom/facebook/mqtt/a;B)V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_6

    .line 562
    sget-object v1, Lcom/facebook/mqtt/b;->a:Ljava/lang/Class;

    const-string v3, "Cleaning up connection failure."

    invoke-static {v1, v3}, Lcom/facebook/debug/log/b;->c(Ljava/lang/Class;Ljava/lang/String;)V

    .line 563
    invoke-direct {p0, v2}, Lcom/facebook/mqtt/b;->a(Ljava/net/Socket;)V

    .line 564
    monitor-enter p0

    .line 565
    const/4 v1, 0x0

    :try_start_c
    iput-object v1, p0, Lcom/facebook/mqtt/b;->o:Ljava/net/Socket;

    .line 566
    const/4 v1, 0x0

    iput-object v1, p0, Lcom/facebook/mqtt/b;->q:Lcom/facebook/mqtt/a/f;

    .line 567
    const/4 v1, 0x0

    iput-object v1, p0, Lcom/facebook/mqtt/b;->p:Lcom/facebook/mqtt/a/a;

    .line 568
    const-wide/16 v1, 0x0

    iput-wide v1, p0, Lcom/facebook/mqtt/b;->j:J

    .line 569
    const/4 v1, 0x0

    iput-object v1, p0, Lcom/facebook/mqtt/b;->v:Lcom/google/common/b/d;

    .line 570
    const-wide/16 v1, 0x0

    iput-wide v1, p0, Lcom/facebook/mqtt/b;->i:J

    .line 571
    const/4 v1, 0x0

    iput-object v1, p0, Lcom/facebook/mqtt/b;->w:Lcom/google/common/b/e;

    .line 572
    sget-object v1, Lcom/facebook/mqtt/n;->DISCONNECTED:Lcom/facebook/mqtt/n;

    iput-object v1, p0, Lcom/facebook/mqtt/b;->t:Lcom/facebook/mqtt/n;

    .line 573
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    .line 574
    monitor-exit p0

    goto/16 :goto_1

    :catchall_3
    move-exception v0

    monitor-exit p0
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_3

    throw v0

    .line 543
    :cond_3
    :try_start_d
    monitor-enter p0
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_6

    .line 544
    :try_start_e
    iget-object v0, p0, Lcom/facebook/mqtt/b;->t:Lcom/facebook/mqtt/n;

    sget-object v6, Lcom/facebook/mqtt/n;->DISCONNECTED:Lcom/facebook/mqtt/n;

    if-ne v0, v6, :cond_4

    .line 545
    sget-object v0, Lcom/facebook/mqtt/b;->a:Ljava/lang/Class;

    const-string v1, "Client is disconnected when setting up the connection"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->d(Ljava/lang/Class;Ljava/lang/String;)V

    .line 546
    new-instance v0, Lcom/facebook/mqtt/l;

    sget-object v1, Lcom/facebook/mqtt/a;->FAILED_UNEXPECTED_DISCONNECT:Lcom/facebook/mqtt/a;

    invoke-direct {v0, p0, v1}, Lcom/facebook/mqtt/l;-><init>(Lcom/facebook/mqtt/b;Lcom/facebook/mqtt/a;)V

    monitor-exit p0
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_5

    .line 562
    sget-object v1, Lcom/facebook/mqtt/b;->a:Ljava/lang/Class;

    const-string v3, "Cleaning up connection failure."

    invoke-static {v1, v3}, Lcom/facebook/debug/log/b;->c(Ljava/lang/Class;Ljava/lang/String;)V

    .line 563
    invoke-direct {p0, v2}, Lcom/facebook/mqtt/b;->a(Ljava/net/Socket;)V

    .line 564
    monitor-enter p0

    .line 565
    const/4 v1, 0x0

    :try_start_f
    iput-object v1, p0, Lcom/facebook/mqtt/b;->o:Ljava/net/Socket;

    .line 566
    const/4 v1, 0x0

    iput-object v1, p0, Lcom/facebook/mqtt/b;->q:Lcom/facebook/mqtt/a/f;

    .line 567
    const/4 v1, 0x0

    iput-object v1, p0, Lcom/facebook/mqtt/b;->p:Lcom/facebook/mqtt/a/a;

    .line 568
    const-wide/16 v1, 0x0

    iput-wide v1, p0, Lcom/facebook/mqtt/b;->j:J

    .line 569
    const/4 v1, 0x0

    iput-object v1, p0, Lcom/facebook/mqtt/b;->v:Lcom/google/common/b/d;

    .line 570
    const-wide/16 v1, 0x0

    iput-wide v1, p0, Lcom/facebook/mqtt/b;->i:J

    .line 571
    const/4 v1, 0x0

    iput-object v1, p0, Lcom/facebook/mqtt/b;->w:Lcom/google/common/b/e;

    .line 572
    sget-object v1, Lcom/facebook/mqtt/n;->DISCONNECTED:Lcom/facebook/mqtt/n;

    iput-object v1, p0, Lcom/facebook/mqtt/b;->t:Lcom/facebook/mqtt/n;

    .line 573
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    .line 574
    monitor-exit p0

    goto/16 :goto_1

    :catchall_4
    move-exception v0

    monitor-exit p0
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_4

    throw v0

    .line 549
    :cond_4
    :try_start_10
    iput-object v2, p0, Lcom/facebook/mqtt/b;->o:Ljava/net/Socket;

    .line 550
    iput-object v3, p0, Lcom/facebook/mqtt/b;->q:Lcom/facebook/mqtt/a/f;

    .line 551
    iput-object v1, p0, Lcom/facebook/mqtt/b;->p:Lcom/facebook/mqtt/a/a;

    .line 552
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/facebook/mqtt/b;->j:J

    .line 553
    iput-object v4, p0, Lcom/facebook/mqtt/b;->v:Lcom/google/common/b/d;

    .line 554
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/facebook/mqtt/b;->i:J

    .line 555
    iput-object v5, p0, Lcom/facebook/mqtt/b;->w:Lcom/google/common/b/e;

    .line 556
    sget-object v0, Lcom/facebook/mqtt/n;->CONNECTED:Lcom/facebook/mqtt/n;

    iput-object v0, p0, Lcom/facebook/mqtt/b;->t:Lcom/facebook/mqtt/n;

    .line 557
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    .line 558
    monitor-exit p0
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_5

    .line 578
    new-instance v0, Lcom/facebook/mqtt/l;

    invoke-direct {v0, p0}, Lcom/facebook/mqtt/l;-><init>(Lcom/facebook/mqtt/b;)V

    goto/16 :goto_1

    .line 558
    :catchall_5
    move-exception v0

    :try_start_11
    monitor-exit p0
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_5

    :try_start_12
    throw v0
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_6

    .line 561
    :catchall_6
    move-exception v0

    .line 562
    sget-object v1, Lcom/facebook/mqtt/b;->a:Ljava/lang/Class;

    const-string v3, "Cleaning up connection failure."

    invoke-static {v1, v3}, Lcom/facebook/debug/log/b;->c(Ljava/lang/Class;Ljava/lang/String;)V

    .line 563
    invoke-direct {p0, v2}, Lcom/facebook/mqtt/b;->a(Ljava/net/Socket;)V

    .line 564
    monitor-enter p0

    .line 565
    const/4 v1, 0x0

    :try_start_13
    iput-object v1, p0, Lcom/facebook/mqtt/b;->o:Ljava/net/Socket;

    .line 566
    const/4 v1, 0x0

    iput-object v1, p0, Lcom/facebook/mqtt/b;->q:Lcom/facebook/mqtt/a/f;

    .line 567
    const/4 v1, 0x0

    iput-object v1, p0, Lcom/facebook/mqtt/b;->p:Lcom/facebook/mqtt/a/a;

    .line 568
    const-wide/16 v1, 0x0

    iput-wide v1, p0, Lcom/facebook/mqtt/b;->j:J

    .line 569
    const/4 v1, 0x0

    iput-object v1, p0, Lcom/facebook/mqtt/b;->v:Lcom/google/common/b/d;

    .line 570
    const-wide/16 v1, 0x0

    iput-wide v1, p0, Lcom/facebook/mqtt/b;->i:J

    .line 571
    const/4 v1, 0x0

    iput-object v1, p0, Lcom/facebook/mqtt/b;->w:Lcom/google/common/b/e;

    .line 572
    sget-object v1, Lcom/facebook/mqtt/n;->DISCONNECTED:Lcom/facebook/mqtt/n;

    iput-object v1, p0, Lcom/facebook/mqtt/b;->t:Lcom/facebook/mqtt/n;

    .line 573
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    .line 574
    monitor-exit p0
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_7

    throw v0

    :catchall_7
    move-exception v0

    :try_start_14
    monitor-exit p0
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_7

    throw v0

    :cond_5
    move-object v2, v0

    goto/16 :goto_0
.end method

.method private j()Z
    .locals 3

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 614
    iget-object v2, p0, Lcom/facebook/mqtt/b;->c:Landroid/net/ConnectivityManager;

    invoke-virtual {v2}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v2

    .line 615
    if-eqz v2, :cond_1

    .line 616
    invoke-virtual {v2}, Landroid/net/NetworkInfo;->getType()I

    move-result v2

    .line 617
    if-ne v2, v0, :cond_0

    .line 619
    :goto_0
    return v0

    :cond_0
    move v0, v1

    .line 617
    goto :goto_0

    :cond_1
    move v0, v1

    .line 619
    goto :goto_0
.end method

.method private k()V
    .locals 3

    .prologue
    .line 742
    :try_start_0
    invoke-virtual {p0}, Lcom/facebook/mqtt/b;->c()Z

    move-result v0

    if-nez v0, :cond_0

    .line 743
    sget-object v0, Lcom/facebook/mqtt/b;->a:Ljava/lang/Class;

    const-string v1, "Client not connected, not sending PINGREQ."

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->c(Ljava/lang/Class;Ljava/lang/String;)V

    .line 752
    :goto_0
    return-void

    .line 746
    :cond_0
    iget-object v0, p0, Lcom/facebook/mqtt/b;->q:Lcom/facebook/mqtt/a/f;

    invoke-direct {p0, v0}, Lcom/facebook/mqtt/b;->a(Lcom/facebook/mqtt/a/f;)V

    .line 747
    iget-object v0, p0, Lcom/facebook/mqtt/b;->h:Lcom/facebook/common/time/a;

    invoke-interface {v0}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/mqtt/b;->l:J
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 748
    :catch_0
    move-exception v0

    .line 749
    sget-object v1, Lcom/facebook/mqtt/b;->a:Ljava/lang/Class;

    const-string v2, "Caught exception trying to send PINGREQ"

    invoke-static {v1, v2, v0}, Lcom/facebook/debug/log/b;->d(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 750
    sget-object v1, Lcom/facebook/mqtt/m;->PING:Lcom/facebook/mqtt/m;

    invoke-direct {p0, v1, v0}, Lcom/facebook/mqtt/b;->a(Lcom/facebook/mqtt/m;Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method private l()V
    .locals 4

    .prologue
    .line 755
    iget-object v0, p0, Lcom/facebook/mqtt/b;->g:Lcom/facebook/mqtt/w;

    invoke-virtual {v0}, Lcom/facebook/mqtt/w;->h()I

    move-result v0

    int-to-long v0, v0

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    invoke-virtual {p0, v0, v1}, Lcom/facebook/mqtt/b;->a(J)V

    .line 756
    return-void
.end method

.method private m()I
    .locals 2

    .prologue
    .line 895
    iget-object v0, p0, Lcom/facebook/mqtt/b;->s:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    move-result v0

    .line 896
    const v1, 0xffff

    and-int/2addr v0, v1

    return v0
.end method

.method private n()J
    .locals 6

    .prologue
    .line 900
    const-wide/16 v0, 0x0

    .line 901
    sget-object v2, Lcom/facebook/mqtt/b;->b:Ljava/util/EnumSet;

    invoke-virtual {v2}, Ljava/util/EnumSet;->iterator()Ljava/util/Iterator;

    move-result-object v3

    move-wide v1, v0

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/mqtt/k;

    .line 902
    const/4 v4, 0x1

    invoke-virtual {v0}, Lcom/facebook/mqtt/k;->getPosition()B

    move-result v0

    shl-int v0, v4, v0

    int-to-long v4, v0

    or-long v0, v1, v4

    move-wide v1, v0

    goto :goto_0

    .line 904
    :cond_0
    return-wide v1
.end method


# virtual methods
.method public declared-synchronized a(Ljava/lang/String;[BLcom/facebook/mqtt/x;Z)I
    .locals 8

    .prologue
    .line 283
    monitor-enter p0

    :try_start_0
    invoke-virtual {p0}, Lcom/facebook/mqtt/b;->b()Z

    move-result v0

    if-nez v0, :cond_0

    .line 284
    new-instance v0, Lcom/facebook/mqtt/u;

    sget-object v1, Lcom/facebook/mqtt/v;->NOT_CONNECTED:Lcom/facebook/mqtt/v;

    invoke-direct {v0, v1}, Lcom/facebook/mqtt/u;-><init>(Lcom/facebook/mqtt/v;)V

    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 283
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 287
    :cond_0
    :try_start_1
    sget-object v0, Lcom/facebook/mqtt/b;->a:Ljava/lang/Class;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Publishing on topic "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->c(Ljava/lang/Class;Ljava/lang/String;)V

    .line 288
    invoke-direct {p0}, Lcom/facebook/mqtt/b;->m()I

    move-result v6

    .line 289
    new-instance v7, Lcom/facebook/common/a/a;

    new-instance v0, Lcom/facebook/mqtt/f;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    invoke-direct/range {v0 .. v6}, Lcom/facebook/mqtt/f;-><init>(Lcom/facebook/mqtt/b;Ljava/lang/String;[BLcom/facebook/mqtt/x;ZI)V

    invoke-direct {v7, v0}, Lcom/facebook/common/a/a;-><init>(Ljava/lang/Runnable;)V

    .line 295
    invoke-virtual {v7}, Lcom/facebook/common/a/a;->a()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 296
    monitor-exit p0

    return v6
.end method

.method public declared-synchronized a(Ljava/util/List;)I
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/mqtt/messages/SubscribeTopic;",
            ">;)I"
        }
    .end annotation

    .prologue
    .line 246
    monitor-enter p0

    :try_start_0
    invoke-virtual {p0}, Lcom/facebook/mqtt/b;->b()Z

    move-result v0

    if-nez v0, :cond_0

    .line 247
    new-instance v0, Lcom/facebook/mqtt/u;

    sget-object v1, Lcom/facebook/mqtt/v;->NOT_CONNECTED:Lcom/facebook/mqtt/v;

    invoke-direct {v0, v1}, Lcom/facebook/mqtt/u;-><init>(Lcom/facebook/mqtt/v;)V

    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 246
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 249
    :cond_0
    :try_start_1
    invoke-direct {p0}, Lcom/facebook/mqtt/b;->m()I

    move-result v0

    .line 250
    new-instance v1, Lcom/facebook/common/a/a;

    new-instance v2, Lcom/facebook/mqtt/d;

    invoke-direct {v2, p0, p1, v0}, Lcom/facebook/mqtt/d;-><init>(Lcom/facebook/mqtt/b;Ljava/util/List;I)V

    invoke-direct {v1, v2}, Lcom/facebook/common/a/a;-><init>(Ljava/lang/Runnable;)V

    .line 256
    invoke-virtual {v1}, Lcom/facebook/common/a/a;->a()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 258
    monitor-exit p0

    return v0
.end method

.method public declared-synchronized a()V
    .locals 3

    .prologue
    .line 218
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/mqtt/b;->t:Lcom/facebook/mqtt/n;

    sget-object v1, Lcom/facebook/mqtt/n;->INIT:Lcom/facebook/mqtt/n;

    if-eq v0, v1, :cond_0

    .line 219
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Tried to connect on used client"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 218
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 222
    :cond_0
    :try_start_1
    sget-object v0, Lcom/facebook/mqtt/n;->CONNECTING:Lcom/facebook/mqtt/n;

    iput-object v0, p0, Lcom/facebook/mqtt/b;->t:Lcom/facebook/mqtt/n;

    .line 223
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/facebook/mqtt/c;

    invoke-direct {v1, p0}, Lcom/facebook/mqtt/c;-><init>(Lcom/facebook/mqtt/b;)V

    const-string v2, "MqttClient Network Thread"

    invoke-direct {v0, v1, v2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/facebook/mqtt/b;->r:Ljava/lang/Thread;

    .line 230
    iget-object v0, p0, Lcom/facebook/mqtt/b;->r:Ljava/lang/Thread;

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 231
    monitor-exit p0

    return-void
.end method

.method public declared-synchronized a(J)V
    .locals 2

    .prologue
    .line 759
    monitor-enter p0

    :goto_0
    :try_start_0
    iget-object v0, p0, Lcom/facebook/mqtt/b;->t:Lcom/facebook/mqtt/n;

    sget-object v1, Lcom/facebook/mqtt/n;->CONNECTING:Lcom/facebook/mqtt/n;

    if-ne v0, v1, :cond_0

    .line 760
    invoke-virtual {p0, p1, p2}, Ljava/lang/Object;->wait(J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 759
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 762
    :cond_0
    monitor-exit p0

    return-void
.end method

.method public a(Lcom/facebook/mqtt/o;)V
    .locals 0
    .param p1    # Lcom/facebook/mqtt/o;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 234
    iput-object p1, p0, Lcom/facebook/mqtt/b;->u:Lcom/facebook/mqtt/o;

    .line 235
    return-void
.end method

.method public declared-synchronized b(Ljava/util/List;)I
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)I"
        }
    .end annotation

    .prologue
    .line 262
    monitor-enter p0

    :try_start_0
    invoke-virtual {p0}, Lcom/facebook/mqtt/b;->b()Z

    move-result v0

    if-nez v0, :cond_0

    .line 263
    new-instance v0, Lcom/facebook/mqtt/u;

    sget-object v1, Lcom/facebook/mqtt/v;->NOT_CONNECTED:Lcom/facebook/mqtt/v;

    invoke-direct {v0, v1}, Lcom/facebook/mqtt/u;-><init>(Lcom/facebook/mqtt/v;)V

    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 262
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 266
    :cond_0
    :try_start_1
    invoke-direct {p0}, Lcom/facebook/mqtt/b;->m()I

    move-result v0

    .line 267
    new-instance v1, Lcom/facebook/common/a/a;

    new-instance v2, Lcom/facebook/mqtt/e;

    invoke-direct {v2, p0, p1, v0}, Lcom/facebook/mqtt/e;-><init>(Lcom/facebook/mqtt/b;Ljava/util/List;I)V

    invoke-direct {v1, v2}, Lcom/facebook/common/a/a;-><init>(Ljava/lang/Runnable;)V

    .line 273
    invoke-virtual {v1}, Lcom/facebook/common/a/a;->a()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 275
    monitor-exit p0

    return v0
.end method

.method public declared-synchronized b()Z
    .locals 2

    .prologue
    .line 238
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/mqtt/b;->t:Lcom/facebook/mqtt/n;

    sget-object v1, Lcom/facebook/mqtt/n;->CONNECTING:Lcom/facebook/mqtt/n;

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lcom/facebook/mqtt/b;->t:Lcom/facebook/mqtt/n;

    sget-object v1, Lcom/facebook/mqtt/n;->CONNECTED:Lcom/facebook/mqtt/n;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-ne v0, v1, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    monitor-exit p0

    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized c()Z
    .locals 2

    .prologue
    .line 242
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/mqtt/b;->t:Lcom/facebook/mqtt/n;

    sget-object v1, Lcom/facebook/mqtt/n;->CONNECTED:Lcom/facebook/mqtt/n;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    monitor-exit p0

    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized d()V
    .locals 2

    .prologue
    .line 301
    monitor-enter p0

    :try_start_0
    invoke-virtual {p0}, Lcom/facebook/mqtt/b;->c()Z

    move-result v0

    if-nez v0, :cond_0

    .line 302
    new-instance v0, Lcom/facebook/mqtt/u;

    sget-object v1, Lcom/facebook/mqtt/v;->NOT_CONNECTED:Lcom/facebook/mqtt/v;

    invoke-direct {v0, v1}, Lcom/facebook/mqtt/u;-><init>(Lcom/facebook/mqtt/v;)V

    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 301
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 305
    :cond_0
    :try_start_1
    sget-object v0, Lcom/facebook/mqtt/b;->a:Ljava/lang/Class;

    const-string v1, "Sending ping request..."

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->c(Ljava/lang/Class;Ljava/lang/String;)V

    .line 306
    new-instance v0, Lcom/facebook/common/a/a;

    new-instance v1, Lcom/facebook/mqtt/g;

    invoke-direct {v1, p0}, Lcom/facebook/mqtt/g;-><init>(Lcom/facebook/mqtt/b;)V

    invoke-direct {v0, v1}, Lcom/facebook/common/a/a;-><init>(Ljava/lang/Runnable;)V

    .line 313
    invoke-virtual {v0}, Lcom/facebook/common/a/a;->a()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 314
    monitor-exit p0

    return-void
.end method

.method public declared-synchronized e()V
    .locals 2

    .prologue
    .line 317
    monitor-enter p0

    :try_start_0
    invoke-virtual {p0}, Lcom/facebook/mqtt/b;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 318
    new-instance v0, Lcom/facebook/common/a/a;

    new-instance v1, Lcom/facebook/mqtt/h;

    invoke-direct {v1, p0}, Lcom/facebook/mqtt/h;-><init>(Lcom/facebook/mqtt/b;)V

    invoke-direct {v0, v1}, Lcom/facebook/common/a/a;-><init>(Ljava/lang/Runnable;)V

    .line 324
    invoke-virtual {v0}, Lcom/facebook/common/a/a;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 326
    :cond_0
    monitor-exit p0

    return-void

    .line 317
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public f()J
    .locals 4

    .prologue
    .line 329
    monitor-enter p0

    .line 330
    :try_start_0
    iget-object v0, p0, Lcom/facebook/mqtt/b;->w:Lcom/google/common/b/e;

    if-eqz v0, :cond_0

    .line 331
    iget-wide v0, p0, Lcom/facebook/mqtt/b;->i:J

    .line 332
    iget-object v2, p0, Lcom/facebook/mqtt/b;->w:Lcom/google/common/b/e;

    invoke-virtual {v2}, Lcom/google/common/b/e;->a()J

    move-result-wide v2

    iput-wide v2, p0, Lcom/facebook/mqtt/b;->i:J

    .line 333
    iget-wide v2, p0, Lcom/facebook/mqtt/b;->i:J

    sub-long v0, v2, v0

    monitor-exit p0

    .line 335
    :goto_0
    return-wide v0

    :cond_0
    const-wide/16 v0, 0x0

    monitor-exit p0

    goto :goto_0

    .line 337
    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public g()J
    .locals 4

    .prologue
    .line 341
    monitor-enter p0

    .line 342
    :try_start_0
    iget-object v0, p0, Lcom/facebook/mqtt/b;->v:Lcom/google/common/b/d;

    if-eqz v0, :cond_0

    .line 343
    iget-wide v0, p0, Lcom/facebook/mqtt/b;->j:J

    .line 344
    iget-object v2, p0, Lcom/facebook/mqtt/b;->v:Lcom/google/common/b/d;

    invoke-virtual {v2}, Lcom/google/common/b/d;->a()J

    move-result-wide v2

    iput-wide v2, p0, Lcom/facebook/mqtt/b;->j:J

    .line 345
    iget-wide v2, p0, Lcom/facebook/mqtt/b;->j:J

    sub-long v0, v2, v0

    monitor-exit p0

    .line 347
    :goto_0
    return-wide v0

    :cond_0
    const-wide/16 v0, 0x0

    monitor-exit p0

    goto :goto_0

    .line 349
    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .prologue
    .line 909
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 910
    const-string v1, "[MqttClient ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 911
    iget-object v1, p0, Lcom/facebook/mqtt/b;->g:Lcom/facebook/mqtt/w;

    invoke-virtual {v1}, Lcom/facebook/mqtt/w;->a()Lcom/facebook/mqtt/t;

    move-result-object v1

    .line 912
    invoke-virtual {v1}, Lcom/facebook/mqtt/t;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 913
    const-string v2, ":"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 914
    invoke-virtual {v1}, Lcom/facebook/mqtt/t;->b()I

    move-result v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 915
    invoke-virtual {v1}, Lcom/facebook/mqtt/t;->d()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 916
    const-string v1, " +ssl"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 918
    :cond_0
    const-string v1, ") "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 919
    iget-object v1, p0, Lcom/facebook/mqtt/b;->t:Lcom/facebook/mqtt/n;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 920
    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 921
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
