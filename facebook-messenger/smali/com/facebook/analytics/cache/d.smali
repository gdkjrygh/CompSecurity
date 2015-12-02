.class public Lcom/facebook/analytics/cache/d;
.super Lcom/facebook/analytics/a;
.source "CacheCounters.java"


# direct methods
.method public constructor <init>(Lcom/facebook/analytics/b/c;)V
    .locals 0
    .param p1    # Lcom/facebook/analytics/b/c;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 18
    invoke-direct {p0, p1}, Lcom/facebook/analytics/a;-><init>(Lcom/facebook/analytics/b/c;)V

    .line 19
    return-void
.end method


# virtual methods
.method protected a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 22
    const-string v0, "cache_counters"

    return-object v0
.end method

.method public b()V
    .locals 7

    .prologue
    .line 36
    invoke-virtual {p0}, Lcom/facebook/analytics/cache/d;->d()Ljava/util/concurrent/ConcurrentMap;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/ConcurrentMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 37
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    sget-object v3, Lcom/facebook/analytics/cache/c;->BYTES_COUNT:Lcom/facebook/analytics/cache/c;

    invoke-virtual {v3}, Lcom/facebook/analytics/cache/c;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 39
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/facebook/analytics/cache/d;->a(Ljava/lang/String;)V

    goto :goto_0

    .line 42
    :cond_1
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    const-wide/16 v5, 0x0

    cmp-long v1, v3, v5

    if-nez v1, :cond_0

    .line 43
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/facebook/analytics/cache/d;->a(Ljava/lang/String;)V

    goto :goto_0

    .line 47
    :cond_2
    return-void
.end method
