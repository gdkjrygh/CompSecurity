.class public Lcom/mopub/volley/RequestQueue;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Ljava/util/concurrent/atomic/AtomicInteger;

.field private final b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/util/Queue",
            "<",
            "Lcom/mopub/volley/Request",
            "<*>;>;>;"
        }
    .end annotation
.end field

.field private final c:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Lcom/mopub/volley/Request",
            "<*>;>;"
        }
    .end annotation
.end field

.field private final d:Ljava/util/concurrent/PriorityBlockingQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/PriorityBlockingQueue",
            "<",
            "Lcom/mopub/volley/Request",
            "<*>;>;"
        }
    .end annotation
.end field

.field private final e:Ljava/util/concurrent/PriorityBlockingQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/PriorityBlockingQueue",
            "<",
            "Lcom/mopub/volley/Request",
            "<*>;>;"
        }
    .end annotation
.end field

.field private final f:Lcom/mopub/volley/Cache;

.field private final g:Lcom/mopub/volley/Network;

.field private final h:Lcom/mopub/volley/ResponseDelivery;

.field private i:[Lcom/mopub/volley/NetworkDispatcher;

.field private j:Lcom/mopub/volley/CacheDispatcher;


# direct methods
.method public constructor <init>(Lcom/mopub/volley/Cache;Lcom/mopub/volley/Network;)V
    .locals 1

    .prologue
    .line 124
    const/4 v0, 0x4

    invoke-direct {p0, p1, p2, v0}, Lcom/mopub/volley/RequestQueue;-><init>(Lcom/mopub/volley/Cache;Lcom/mopub/volley/Network;I)V

    .line 125
    return-void
.end method

.method public constructor <init>(Lcom/mopub/volley/Cache;Lcom/mopub/volley/Network;I)V
    .locals 3

    .prologue
    .line 113
    new-instance v0, Lcom/mopub/volley/ExecutorDelivery;

    new-instance v1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    invoke-direct {v0, v1}, Lcom/mopub/volley/ExecutorDelivery;-><init>(Landroid/os/Handler;)V

    invoke-direct {p0, p1, p2, p3, v0}, Lcom/mopub/volley/RequestQueue;-><init>(Lcom/mopub/volley/Cache;Lcom/mopub/volley/Network;ILcom/mopub/volley/ResponseDelivery;)V

    .line 115
    return-void
.end method

.method public constructor <init>(Lcom/mopub/volley/Cache;Lcom/mopub/volley/Network;ILcom/mopub/volley/ResponseDelivery;)V
    .locals 1

    .prologue
    .line 98
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object v0, p0, Lcom/mopub/volley/RequestQueue;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 53
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/mopub/volley/RequestQueue;->b:Ljava/util/Map;

    .line 61
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/mopub/volley/RequestQueue;->c:Ljava/util/Set;

    .line 64
    new-instance v0, Ljava/util/concurrent/PriorityBlockingQueue;

    invoke-direct {v0}, Ljava/util/concurrent/PriorityBlockingQueue;-><init>()V

    iput-object v0, p0, Lcom/mopub/volley/RequestQueue;->d:Ljava/util/concurrent/PriorityBlockingQueue;

    .line 68
    new-instance v0, Ljava/util/concurrent/PriorityBlockingQueue;

    invoke-direct {v0}, Ljava/util/concurrent/PriorityBlockingQueue;-><init>()V

    iput-object v0, p0, Lcom/mopub/volley/RequestQueue;->e:Ljava/util/concurrent/PriorityBlockingQueue;

    .line 99
    iput-object p1, p0, Lcom/mopub/volley/RequestQueue;->f:Lcom/mopub/volley/Cache;

    .line 100
    iput-object p2, p0, Lcom/mopub/volley/RequestQueue;->g:Lcom/mopub/volley/Network;

    .line 101
    new-array v0, p3, [Lcom/mopub/volley/NetworkDispatcher;

    iput-object v0, p0, Lcom/mopub/volley/RequestQueue;->i:[Lcom/mopub/volley/NetworkDispatcher;

    .line 102
    iput-object p4, p0, Lcom/mopub/volley/RequestQueue;->h:Lcom/mopub/volley/ResponseDelivery;

    .line 103
    return-void
.end method


# virtual methods
.method final a(Lcom/mopub/volley/Request;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/mopub/volley/Request",
            "<*>;)V"
        }
    .end annotation

    .prologue
    .line 266
    iget-object v1, p0, Lcom/mopub/volley/RequestQueue;->c:Ljava/util/Set;

    monitor-enter v1

    .line 267
    :try_start_0
    iget-object v0, p0, Lcom/mopub/volley/RequestQueue;->c:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 268
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 270
    invoke-virtual {p1}, Lcom/mopub/volley/Request;->shouldCache()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 271
    iget-object v1, p0, Lcom/mopub/volley/RequestQueue;->b:Ljava/util/Map;

    monitor-enter v1

    .line 272
    :try_start_1
    invoke-virtual {p1}, Lcom/mopub/volley/Request;->getCacheKey()Ljava/lang/String;

    move-result-object v2

    .line 273
    iget-object v0, p0, Lcom/mopub/volley/RequestQueue;->b:Ljava/util/Map;

    invoke-interface {v0, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Queue;

    .line 274
    if-eqz v0, :cond_1

    .line 275
    sget-boolean v3, Lcom/mopub/volley/VolleyLog;->DEBUG:Z

    if-eqz v3, :cond_0

    .line 276
    const-string v3, "Releasing %d waiting requests for cacheKey=%s."

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    invoke-interface {v0}, Ljava/util/Queue;->size()I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v4, v5

    const/4 v5, 0x1

    aput-object v2, v4, v5

    invoke-static {v3, v4}, Lcom/mopub/volley/VolleyLog;->v(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 281
    :cond_0
    iget-object v2, p0, Lcom/mopub/volley/RequestQueue;->d:Ljava/util/concurrent/PriorityBlockingQueue;

    invoke-virtual {v2, v0}, Ljava/util/concurrent/PriorityBlockingQueue;->addAll(Ljava/util/Collection;)Z

    .line 283
    :cond_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 285
    :cond_2
    return-void

    .line 268
    :catchall_0
    move-exception v0

    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    .line 283
    :catchall_1
    move-exception v0

    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw v0
.end method

.method public add(Lcom/mopub/volley/Request;)Lcom/mopub/volley/Request;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/mopub/volley/Request",
            "<TT;>;)",
            "Lcom/mopub/volley/Request",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 218
    invoke-virtual {p1, p0}, Lcom/mopub/volley/Request;->setRequestQueue(Lcom/mopub/volley/RequestQueue;)Lcom/mopub/volley/Request;

    .line 219
    iget-object v1, p0, Lcom/mopub/volley/RequestQueue;->c:Ljava/util/Set;

    monitor-enter v1

    .line 220
    :try_start_0
    iget-object v0, p0, Lcom/mopub/volley/RequestQueue;->c:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 221
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 224
    invoke-virtual {p0}, Lcom/mopub/volley/RequestQueue;->getSequenceNumber()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/mopub/volley/Request;->setSequence(I)Lcom/mopub/volley/Request;

    .line 225
    const-string v0, "add-to-queue"

    invoke-virtual {p1, v0}, Lcom/mopub/volley/Request;->addMarker(Ljava/lang/String;)V

    .line 228
    invoke-virtual {p1}, Lcom/mopub/volley/Request;->shouldCache()Z

    move-result v0

    if-nez v0, :cond_0

    .line 229
    iget-object v0, p0, Lcom/mopub/volley/RequestQueue;->e:Ljava/util/concurrent/PriorityBlockingQueue;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/PriorityBlockingQueue;->add(Ljava/lang/Object;)Z

    .line 253
    :goto_0
    return-object p1

    .line 221
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    .line 234
    :cond_0
    iget-object v1, p0, Lcom/mopub/volley/RequestQueue;->b:Ljava/util/Map;

    monitor-enter v1

    .line 235
    :try_start_2
    invoke-virtual {p1}, Lcom/mopub/volley/Request;->getCacheKey()Ljava/lang/String;

    move-result-object v2

    .line 236
    iget-object v0, p0, Lcom/mopub/volley/RequestQueue;->b:Ljava/util/Map;

    invoke-interface {v0, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 238
    iget-object v0, p0, Lcom/mopub/volley/RequestQueue;->b:Ljava/util/Map;

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Queue;

    .line 239
    if-nez v0, :cond_1

    .line 240
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    .line 242
    :cond_1
    invoke-interface {v0, p1}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    .line 243
    iget-object v3, p0, Lcom/mopub/volley/RequestQueue;->b:Ljava/util/Map;

    invoke-interface {v3, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 244
    sget-boolean v0, Lcom/mopub/volley/VolleyLog;->DEBUG:Z

    if-eqz v0, :cond_2

    .line 245
    const-string v0, "Request for cacheKey=%s is in flight, putting on hold."

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v2, v3, v4

    invoke-static {v0, v3}, Lcom/mopub/volley/VolleyLog;->v(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 253
    :cond_2
    :goto_1
    monitor-exit v1

    goto :goto_0

    .line 254
    :catchall_1
    move-exception v0

    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw v0

    .line 250
    :cond_3
    :try_start_3
    iget-object v0, p0, Lcom/mopub/volley/RequestQueue;->b:Ljava/util/Map;

    const/4 v3, 0x0

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 251
    iget-object v0, p0, Lcom/mopub/volley/RequestQueue;->d:Ljava/util/concurrent/PriorityBlockingQueue;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/PriorityBlockingQueue;->add(Ljava/lang/Object;)Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_1
.end method

.method public cancelAll(Lcom/mopub/volley/RequestQueue$RequestFilter;)V
    .locals 4

    .prologue
    .line 186
    iget-object v1, p0, Lcom/mopub/volley/RequestQueue;->c:Ljava/util/Set;

    monitor-enter v1

    .line 187
    :try_start_0
    iget-object v0, p0, Lcom/mopub/volley/RequestQueue;->c:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/mopub/volley/Request;

    .line 188
    invoke-interface {p1, v0}, Lcom/mopub/volley/RequestQueue$RequestFilter;->apply(Lcom/mopub/volley/Request;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 189
    invoke-virtual {v0}, Lcom/mopub/volley/Request;->cancel()V

    goto :goto_0

    .line 192
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_1
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-void
.end method

.method public cancelAll(Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 200
    if-nez p1, :cond_0

    .line 201
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Cannot cancelAll with a null tag"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 203
    :cond_0
    new-instance v0, Lcom/mopub/volley/e;

    invoke-direct {v0, p0, p1}, Lcom/mopub/volley/e;-><init>(Lcom/mopub/volley/RequestQueue;Ljava/lang/Object;)V

    invoke-virtual {p0, v0}, Lcom/mopub/volley/RequestQueue;->cancelAll(Lcom/mopub/volley/RequestQueue$RequestFilter;)V

    .line 209
    return-void
.end method

.method public getCache()Lcom/mopub/volley/Cache;
    .locals 1

    .prologue
    .line 170
    iget-object v0, p0, Lcom/mopub/volley/RequestQueue;->f:Lcom/mopub/volley/Cache;

    return-object v0
.end method

.method public getSequenceNumber()I
    .locals 1

    .prologue
    .line 163
    iget-object v0, p0, Lcom/mopub/volley/RequestQueue;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    move-result v0

    return v0
.end method

.method public start()V
    .locals 6

    .prologue
    .line 131
    invoke-virtual {p0}, Lcom/mopub/volley/RequestQueue;->stop()V

    .line 133
    new-instance v0, Lcom/mopub/volley/CacheDispatcher;

    iget-object v1, p0, Lcom/mopub/volley/RequestQueue;->d:Ljava/util/concurrent/PriorityBlockingQueue;

    iget-object v2, p0, Lcom/mopub/volley/RequestQueue;->e:Ljava/util/concurrent/PriorityBlockingQueue;

    iget-object v3, p0, Lcom/mopub/volley/RequestQueue;->f:Lcom/mopub/volley/Cache;

    iget-object v4, p0, Lcom/mopub/volley/RequestQueue;->h:Lcom/mopub/volley/ResponseDelivery;

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/mopub/volley/CacheDispatcher;-><init>(Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/BlockingQueue;Lcom/mopub/volley/Cache;Lcom/mopub/volley/ResponseDelivery;)V

    iput-object v0, p0, Lcom/mopub/volley/RequestQueue;->j:Lcom/mopub/volley/CacheDispatcher;

    .line 134
    iget-object v0, p0, Lcom/mopub/volley/RequestQueue;->j:Lcom/mopub/volley/CacheDispatcher;

    invoke-virtual {v0}, Lcom/mopub/volley/CacheDispatcher;->start()V

    .line 137
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lcom/mopub/volley/RequestQueue;->i:[Lcom/mopub/volley/NetworkDispatcher;

    array-length v1, v1

    if-ge v0, v1, :cond_0

    .line 138
    new-instance v1, Lcom/mopub/volley/NetworkDispatcher;

    iget-object v2, p0, Lcom/mopub/volley/RequestQueue;->e:Ljava/util/concurrent/PriorityBlockingQueue;

    iget-object v3, p0, Lcom/mopub/volley/RequestQueue;->g:Lcom/mopub/volley/Network;

    iget-object v4, p0, Lcom/mopub/volley/RequestQueue;->f:Lcom/mopub/volley/Cache;

    iget-object v5, p0, Lcom/mopub/volley/RequestQueue;->h:Lcom/mopub/volley/ResponseDelivery;

    invoke-direct {v1, v2, v3, v4, v5}, Lcom/mopub/volley/NetworkDispatcher;-><init>(Ljava/util/concurrent/BlockingQueue;Lcom/mopub/volley/Network;Lcom/mopub/volley/Cache;Lcom/mopub/volley/ResponseDelivery;)V

    .line 140
    iget-object v2, p0, Lcom/mopub/volley/RequestQueue;->i:[Lcom/mopub/volley/NetworkDispatcher;

    aput-object v1, v2, v0

    .line 141
    invoke-virtual {v1}, Lcom/mopub/volley/NetworkDispatcher;->start()V

    .line 137
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 143
    :cond_0
    return-void
.end method

.method public stop()V
    .locals 2

    .prologue
    .line 149
    iget-object v0, p0, Lcom/mopub/volley/RequestQueue;->j:Lcom/mopub/volley/CacheDispatcher;

    if-eqz v0, :cond_0

    .line 150
    iget-object v0, p0, Lcom/mopub/volley/RequestQueue;->j:Lcom/mopub/volley/CacheDispatcher;

    invoke-virtual {v0}, Lcom/mopub/volley/CacheDispatcher;->quit()V

    .line 152
    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lcom/mopub/volley/RequestQueue;->i:[Lcom/mopub/volley/NetworkDispatcher;

    array-length v1, v1

    if-ge v0, v1, :cond_2

    .line 153
    iget-object v1, p0, Lcom/mopub/volley/RequestQueue;->i:[Lcom/mopub/volley/NetworkDispatcher;

    aget-object v1, v1, v0

    if-eqz v1, :cond_1

    .line 154
    iget-object v1, p0, Lcom/mopub/volley/RequestQueue;->i:[Lcom/mopub/volley/NetworkDispatcher;

    aget-object v1, v1, v0

    invoke-virtual {v1}, Lcom/mopub/volley/NetworkDispatcher;->quit()V

    .line 152
    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 157
    :cond_2
    return-void
.end method
