.class public Lcom/facebook/orca/fbwebrtc/f;
.super Ljava/lang/Object;
.source "MessageCache.java"


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
.field private b:Ljava/util/Queue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Queue",
            "<",
            "Lcom/facebook/orca/fbwebrtc/g;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 15
    const-class v0, Lcom/facebook/orca/fbwebrtc/f;

    sput-object v0, Lcom/facebook/orca/fbwebrtc/f;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lcom/facebook/orca/fbwebrtc/f;->b:Ljava/util/Queue;

    .line 35
    return-void
.end method

.method private b()V
    .locals 8

    .prologue
    .line 54
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/f;->b:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 55
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/f;->b:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/fbwebrtc/g;

    .line 56
    sget-object v2, Lcom/facebook/orca/fbwebrtc/f;->a:Ljava/lang/Class;

    const-string v3, "clear message from peer: %d, callId=%d, msgId=%d"

    const/4 v4, 0x3

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    iget-wide v6, v0, Lcom/facebook/orca/fbwebrtc/g;->a:J

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    aput-object v6, v4, v5

    const/4 v5, 0x1

    iget-wide v6, v0, Lcom/facebook/orca/fbwebrtc/g;->b:J

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    aput-object v6, v4, v5

    const/4 v5, 0x2

    iget-wide v6, v0, Lcom/facebook/orca/fbwebrtc/g;->c:J

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    aput-object v0, v4, v5

    invoke-static {v2, v3, v4}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 59
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/f;->b:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->clear()V

    .line 61
    :cond_1
    return-void
.end method


# virtual methods
.method public declared-synchronized a(JJ)V
    .locals 3

    .prologue
    .line 86
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/f;->b:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->peek()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/fbwebrtc/g;

    .line 87
    if-eqz v0, :cond_0

    iget-wide v1, v0, Lcom/facebook/orca/fbwebrtc/g;->a:J

    cmp-long v1, v1, p1

    if-nez v1, :cond_0

    iget-wide v0, v0, Lcom/facebook/orca/fbwebrtc/g;->b:J

    cmp-long v0, v0, p3

    if-nez v0, :cond_0

    .line 88
    invoke-direct {p0}, Lcom/facebook/orca/fbwebrtc/f;->b()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 90
    :cond_0
    monitor-exit p0

    return-void

    .line 86
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized a(Lcom/facebook/orca/fbwebrtc/g;)V
    .locals 1

    .prologue
    .line 48
    monitor-enter p0

    :try_start_0
    invoke-direct {p0}, Lcom/facebook/orca/fbwebrtc/f;->b()V

    .line 49
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/f;->b:Ljava/util/Queue;

    invoke-interface {v0, p1}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 50
    monitor-exit p0

    return-void

    .line 48
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized a()[Lcom/facebook/orca/fbwebrtc/g;
    .locals 2

    .prologue
    .line 97
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/f;->b:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->size()I

    move-result v0

    if-nez v0, :cond_0

    .line 98
    const/4 v0, 0x0

    new-array v0, v0, [Lcom/facebook/orca/fbwebrtc/g;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 102
    :goto_0
    monitor-exit p0

    return-object v0

    .line 100
    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/f;->b:Ljava/util/Queue;

    const/4 v1, 0x0

    new-array v1, v1, [Lcom/facebook/orca/fbwebrtc/g;

    invoke-interface {v0, v1}, Ljava/util/Queue;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/orca/fbwebrtc/g;

    .line 101
    iget-object v1, p0, Lcom/facebook/orca/fbwebrtc/f;->b:Ljava/util/Queue;

    invoke-interface {v1}, Ljava/util/Queue;->clear()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 97
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized b(Lcom/facebook/orca/fbwebrtc/g;)Z
    .locals 6

    .prologue
    const/4 v1, 0x0

    .line 72
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/f;->b:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->size()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-nez v0, :cond_0

    move v0, v1

    .line 81
    :goto_0
    monitor-exit p0

    return v0

    .line 75
    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/f;->b:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->peek()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/fbwebrtc/g;

    .line 76
    iget-wide v2, v0, Lcom/facebook/orca/fbwebrtc/g;->a:J

    iget-wide v4, p1, Lcom/facebook/orca/fbwebrtc/g;->a:J

    cmp-long v2, v2, v4

    if-nez v2, :cond_1

    iget-wide v2, v0, Lcom/facebook/orca/fbwebrtc/g;->b:J

    iget-wide v4, p1, Lcom/facebook/orca/fbwebrtc/g;->b:J

    cmp-long v0, v2, v4

    if-eqz v0, :cond_2

    :cond_1
    move v0, v1

    .line 77
    goto :goto_0

    .line 80
    :cond_2
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/f;->b:Ljava/util/Queue;

    invoke-interface {v0, p1}, Ljava/util/Queue;->offer(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 81
    const/4 v0, 0x1

    goto :goto_0

    .line 72
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
