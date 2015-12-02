.class public Lcom/facebook/analytics/b/b;
.super Ljava/lang/Object;
.source "CountersPrefReader.java"


# instance fields
.field private final a:Lcom/facebook/prefs/shared/d;

.field private final b:Lcom/facebook/analytics/b/a;


# direct methods
.method public constructor <init>(Lcom/facebook/prefs/shared/d;Lcom/facebook/analytics/b/a;)V
    .locals 0

    .prologue
    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    iput-object p1, p0, Lcom/facebook/analytics/b/b;->a:Lcom/facebook/prefs/shared/d;

    .line 25
    iput-object p2, p0, Lcom/facebook/analytics/b/b;->b:Lcom/facebook/analytics/b/a;

    .line 26
    return-void
.end method


# virtual methods
.method public declared-synchronized a()Lcom/google/common/a/ev;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/ev",
            "<",
            "Ljava/lang/String;",
            "Lcom/google/common/a/ev",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation

    .prologue
    const/4 v2, 0x0

    .line 35
    monitor-enter p0

    :try_start_0
    invoke-static {}, Lcom/google/common/a/ev;->k()Lcom/google/common/a/ew;

    move-result-object v5

    .line 40
    iget-object v0, p0, Lcom/facebook/analytics/b/b;->a:Lcom/facebook/prefs/shared/d;

    invoke-interface {v0}, Lcom/facebook/prefs/shared/d;->b()Lcom/facebook/prefs/shared/e;

    move-result-object v6

    .line 42
    iget-object v0, p0, Lcom/facebook/analytics/b/b;->a:Lcom/facebook/prefs/shared/d;

    sget-object v1, Lcom/facebook/analytics/b/a;->a:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v0, v1}, Lcom/facebook/prefs/shared/d;->e(Lcom/facebook/prefs/shared/ae;)Ljava/util/SortedMap;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/SortedMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v7

    move-object v3, v2

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 43
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/prefs/shared/ae;

    .line 46
    iget-object v4, p0, Lcom/facebook/analytics/b/b;->b:Lcom/facebook/analytics/b/a;

    invoke-virtual {v4, v1}, Lcom/facebook/analytics/b/a;->b(Lcom/facebook/prefs/shared/ae;)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 47
    iget-object v4, p0, Lcom/facebook/analytics/b/b;->b:Lcom/facebook/analytics/b/a;

    invoke-virtual {v4, v1}, Lcom/facebook/analytics/b/a;->a(Lcom/facebook/prefs/shared/ae;)[Ljava/lang/String;

    move-result-object v8

    .line 49
    array-length v4, v8

    const/4 v9, 0x2

    if-le v4, v9, :cond_2

    .line 50
    const/4 v4, 0x0

    aget-object v4, v8, v4

    .line 51
    const/4 v9, 0x1

    aget-object v8, v8, v9

    .line 52
    invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_1

    .line 53
    if-eqz v2, :cond_0

    if-eqz v3, :cond_0

    .line 57
    invoke-virtual {v3}, Lcom/google/common/a/ew;->b()Lcom/google/common/a/ev;

    move-result-object v3

    invoke-virtual {v5, v2, v3}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    .line 60
    :cond_0
    invoke-static {}, Lcom/google/common/a/ev;->k()Lcom/google/common/a/ew;

    move-result-object v3

    move-object v2, v4

    .line 63
    :cond_1
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v3, v8, v0}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    .line 64
    invoke-interface {v6, v1}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;)Lcom/facebook/prefs/shared/e;

    :cond_2
    move-object v0, v2

    move-object v1, v3

    move-object v2, v0

    move-object v3, v1

    .line 67
    goto :goto_0

    .line 71
    :cond_3
    if-eqz v2, :cond_4

    if-eqz v3, :cond_4

    .line 72
    invoke-virtual {v3}, Lcom/google/common/a/ew;->b()Lcom/google/common/a/ev;

    move-result-object v0

    invoke-virtual {v5, v2, v0}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    .line 74
    :cond_4
    invoke-interface {v6}, Lcom/facebook/prefs/shared/e;->a()V

    .line 76
    invoke-virtual {v5}, Lcom/google/common/a/ew;->b()Lcom/google/common/a/ev;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    monitor-exit p0

    return-object v0

    .line 35
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
