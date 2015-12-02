.class public Lcom/facebook/analytics/cache/e;
.super Ljava/lang/Object;
.source "CacheTracker.java"


# instance fields
.field private final a:Lcom/facebook/analytics/cache/d;

.field private final b:Ljava/lang/String;

.field private final c:Lcom/facebook/analytics/ak;

.field private final d:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Lcom/facebook/analytics/cache/c;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lcom/facebook/analytics/cache/d;Ljava/lang/String;Lcom/facebook/analytics/ak;)V
    .locals 1

    .prologue
    .line 49
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 50
    iput-object p1, p0, Lcom/facebook/analytics/cache/e;->a:Lcom/facebook/analytics/cache/d;

    .line 51
    iput-object p2, p0, Lcom/facebook/analytics/cache/e;->b:Ljava/lang/String;

    .line 52
    iput-object p3, p0, Lcom/facebook/analytics/cache/e;->c:Lcom/facebook/analytics/ak;

    .line 53
    invoke-static {}, Lcom/google/common/a/ik;->a()Ljava/util/HashMap;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/analytics/cache/e;->d:Ljava/util/Map;

    .line 54
    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/analytics/cache/d;Ljava/lang/String;Lcom/facebook/analytics/ak;Lcom/facebook/analytics/cache/f;)V
    .locals 0

    .prologue
    .line 16
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/analytics/cache/e;-><init>(Lcom/facebook/analytics/cache/d;Ljava/lang/String;Lcom/facebook/analytics/ak;)V

    return-void
.end method

.method private d()Z
    .locals 2

    .prologue
    .line 161
    iget-object v0, p0, Lcom/facebook/analytics/cache/e;->c:Lcom/facebook/analytics/ak;

    invoke-interface {v0}, Lcom/facebook/analytics/ak;->a()Lcom/facebook/analytics/al;

    move-result-object v0

    sget-object v1, Lcom/facebook/analytics/al;->CORE_AND_SAMPLED:Lcom/facebook/analytics/al;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 60
    iget-object v0, p0, Lcom/facebook/analytics/cache/e;->b:Ljava/lang/String;

    return-object v0
.end method

.method public declared-synchronized a(Lcom/facebook/analytics/cache/c;)Ljava/lang/String;
    .locals 3

    .prologue
    .line 69
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/analytics/cache/e;->d:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 70
    iget-object v0, p0, Lcom/facebook/analytics/cache/e;->d:Ljava/util/Map;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/facebook/analytics/cache/e;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "_"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lcom/facebook/analytics/cache/c;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    :cond_0
    iget-object v0, p0, Lcom/facebook/analytics/cache/e;->d:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    .line 69
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public a(J)V
    .locals 1

    .prologue
    .line 107
    sget-object v0, Lcom/facebook/analytics/cache/c;->HITS_COUNT:Lcom/facebook/analytics/cache/c;

    invoke-virtual {p0, v0, p1, p2}, Lcom/facebook/analytics/cache/e;->a(Lcom/facebook/analytics/cache/c;J)V

    .line 108
    return-void
.end method

.method public a(Lcom/facebook/analytics/cache/c;J)V
    .locals 2

    .prologue
    .line 81
    invoke-direct {p0}, Lcom/facebook/analytics/cache/e;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 82
    iget-object v0, p0, Lcom/facebook/analytics/cache/e;->a:Lcom/facebook/analytics/cache/d;

    invoke-virtual {p0, p1}, Lcom/facebook/analytics/cache/e;->a(Lcom/facebook/analytics/cache/c;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p2, p3}, Lcom/facebook/analytics/cache/d;->a(Ljava/lang/String;J)V

    .line 84
    :cond_0
    return-void
.end method

.method public a(Lcom/facebook/analytics/cache/g;IJ)V
    .locals 4

    .prologue
    const-wide/16 v2, 0x1

    .line 121
    sget-object v0, Lcom/facebook/analytics/cache/f;->a:[I

    invoke-virtual {p1}, Lcom/facebook/analytics/cache/g;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 133
    :goto_0
    return-void

    .line 123
    :pswitch_0
    sget-object v0, Lcom/facebook/analytics/cache/c;->EVICTIONS_ON_CACHE_FULL_CALL:Lcom/facebook/analytics/cache/c;

    invoke-virtual {p0, v0, v2, v3}, Lcom/facebook/analytics/cache/e;->a(Lcom/facebook/analytics/cache/c;J)V

    .line 124
    sget-object v0, Lcom/facebook/analytics/cache/c;->EVICTIONS_ON_CACHE_FULL_ITEM:Lcom/facebook/analytics/cache/c;

    int-to-long v1, p2

    invoke-virtual {p0, v0, v1, v2}, Lcom/facebook/analytics/cache/e;->a(Lcom/facebook/analytics/cache/c;J)V

    .line 125
    sget-object v0, Lcom/facebook/analytics/cache/c;->EVICTIONS_ON_CACHE_FULL_SIZE:Lcom/facebook/analytics/cache/c;

    invoke-virtual {p0, v0, p3, p4}, Lcom/facebook/analytics/cache/e;->a(Lcom/facebook/analytics/cache/c;J)V

    goto :goto_0

    .line 128
    :pswitch_1
    sget-object v0, Lcom/facebook/analytics/cache/c;->EVICTIONS_ON_CONTENT_STALE_CALL:Lcom/facebook/analytics/cache/c;

    invoke-virtual {p0, v0, v2, v3}, Lcom/facebook/analytics/cache/e;->a(Lcom/facebook/analytics/cache/c;J)V

    .line 129
    sget-object v0, Lcom/facebook/analytics/cache/c;->EVICTIONS_ON_CONTENT_STALE_ITEM:Lcom/facebook/analytics/cache/c;

    int-to-long v1, p2

    invoke-virtual {p0, v0, v1, v2}, Lcom/facebook/analytics/cache/e;->a(Lcom/facebook/analytics/cache/c;J)V

    .line 130
    sget-object v0, Lcom/facebook/analytics/cache/c;->EVICTIONS_ON_CONTENT_STALE_SIZE:Lcom/facebook/analytics/cache/c;

    invoke-virtual {p0, v0, p3, p4}, Lcom/facebook/analytics/cache/e;->a(Lcom/facebook/analytics/cache/c;J)V

    goto :goto_0

    .line 121
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public b()V
    .locals 2

    .prologue
    .line 110
    const-wide/16 v0, 0x1

    invoke-virtual {p0, v0, v1}, Lcom/facebook/analytics/cache/e;->a(J)V

    .line 111
    return-void
.end method

.method public b(J)V
    .locals 1

    .prologue
    .line 114
    sget-object v0, Lcom/facebook/analytics/cache/c;->MISSES_COUNT:Lcom/facebook/analytics/cache/c;

    invoke-virtual {p0, v0, p1, p2}, Lcom/facebook/analytics/cache/e;->a(Lcom/facebook/analytics/cache/c;J)V

    .line 115
    return-void
.end method

.method public b(Lcom/facebook/analytics/cache/c;J)V
    .locals 2

    .prologue
    .line 92
    invoke-direct {p0}, Lcom/facebook/analytics/cache/e;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 93
    iget-object v0, p0, Lcom/facebook/analytics/cache/e;->a:Lcom/facebook/analytics/cache/d;

    invoke-virtual {p0, p1}, Lcom/facebook/analytics/cache/e;->a(Lcom/facebook/analytics/cache/c;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p2, p3}, Lcom/facebook/analytics/cache/d;->b(Ljava/lang/String;J)V

    .line 95
    :cond_0
    return-void
.end method

.method public c()V
    .locals 2

    .prologue
    .line 117
    const-wide/16 v0, 0x1

    invoke-virtual {p0, v0, v1}, Lcom/facebook/analytics/cache/e;->b(J)V

    .line 118
    return-void
.end method

.method public c(J)V
    .locals 1

    .prologue
    .line 136
    sget-object v0, Lcom/facebook/analytics/cache/c;->BYTES_COUNT:Lcom/facebook/analytics/cache/c;

    invoke-virtual {p0, v0, p1, p2}, Lcom/facebook/analytics/cache/e;->b(Lcom/facebook/analytics/cache/c;J)V

    .line 137
    return-void
.end method

.method public d(J)V
    .locals 1

    .prologue
    .line 144
    sget-object v0, Lcom/facebook/analytics/cache/c;->ENTRIES_COUNT:Lcom/facebook/analytics/cache/c;

    invoke-virtual {p0, v0, p1, p2}, Lcom/facebook/analytics/cache/e;->b(Lcom/facebook/analytics/cache/c;J)V

    .line 145
    return-void
.end method

.method public e(J)V
    .locals 3

    .prologue
    .line 156
    sget-object v0, Lcom/facebook/analytics/cache/c;->INSERTION_ITEM:Lcom/facebook/analytics/cache/c;

    const-wide/16 v1, 0x1

    invoke-virtual {p0, v0, v1, v2}, Lcom/facebook/analytics/cache/e;->a(Lcom/facebook/analytics/cache/c;J)V

    .line 157
    sget-object v0, Lcom/facebook/analytics/cache/c;->INSERTION_SIZE:Lcom/facebook/analytics/cache/c;

    invoke-virtual {p0, v0, p1, p2}, Lcom/facebook/analytics/cache/e;->a(Lcom/facebook/analytics/cache/c;J)V

    .line 158
    return-void
.end method
