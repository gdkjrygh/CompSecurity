.class public Lcom/android/volley/j;
.super Ljava/lang/Object;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/android/volley/j$a;
    }
.end annotation


# instance fields
.field protected final a:Ljava/util/concurrent/PriorityBlockingQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/PriorityBlockingQueue",
            "<",
            "Lcom/android/volley/Request",
            "<*>;>;"
        }
    .end annotation
.end field

.field protected final b:Ljava/util/concurrent/PriorityBlockingQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/PriorityBlockingQueue",
            "<",
            "Lcom/android/volley/Request",
            "<*>;>;"
        }
    .end annotation
.end field

.field protected final c:Lcom/android/volley/a;

.field protected final d:Lcom/android/volley/g;

.field protected final e:Lcom/android/volley/l;

.field protected final f:[Lcom/android/volley/h;

.field protected g:Lcom/android/volley/b;

.field private final h:Ljava/util/concurrent/atomic/AtomicInteger;

.field private final i:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/util/Queue",
            "<",
            "Lcom/android/volley/Request",
            "<*>;>;>;"
        }
    .end annotation
.end field

.field private final j:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Lcom/android/volley/Request",
            "<*>;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/android/volley/a;Lcom/android/volley/g;)V
    .locals 1

    .prologue
    .line 127
    const/4 v0, 0x4

    invoke-direct {p0, p1, p2, v0}, Lcom/android/volley/j;-><init>(Lcom/android/volley/a;Lcom/android/volley/g;I)V

    .line 128
    return-void
.end method

.method public constructor <init>(Lcom/android/volley/a;Lcom/android/volley/g;I)V
    .locals 3

    .prologue
    .line 115
    new-instance v0, Lcom/android/volley/f;

    new-instance v1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    invoke-direct {v0, v1}, Lcom/android/volley/f;-><init>(Landroid/os/Handler;)V

    invoke-direct {p0, p1, p2, p3, v0}, Lcom/android/volley/j;-><init>(Lcom/android/volley/a;Lcom/android/volley/g;ILcom/android/volley/l;)V

    .line 116
    return-void
.end method

.method public constructor <init>(Lcom/android/volley/a;Lcom/android/volley/g;ILcom/android/volley/l;)V
    .locals 1

    .prologue
    .line 97
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object v0, p0, Lcom/android/volley/j;->h:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 52
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/android/volley/j;->i:Ljava/util/Map;

    .line 59
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/android/volley/j;->j:Ljava/util/Set;

    .line 62
    new-instance v0, Ljava/util/concurrent/PriorityBlockingQueue;

    invoke-direct {v0}, Ljava/util/concurrent/PriorityBlockingQueue;-><init>()V

    iput-object v0, p0, Lcom/android/volley/j;->a:Ljava/util/concurrent/PriorityBlockingQueue;

    .line 65
    new-instance v0, Ljava/util/concurrent/PriorityBlockingQueue;

    invoke-direct {v0}, Ljava/util/concurrent/PriorityBlockingQueue;-><init>()V

    iput-object v0, p0, Lcom/android/volley/j;->b:Ljava/util/concurrent/PriorityBlockingQueue;

    .line 98
    iput-object p1, p0, Lcom/android/volley/j;->c:Lcom/android/volley/a;

    .line 99
    iput-object p2, p0, Lcom/android/volley/j;->d:Lcom/android/volley/g;

    .line 100
    new-array v0, p3, [Lcom/android/volley/h;

    iput-object v0, p0, Lcom/android/volley/j;->f:[Lcom/android/volley/h;

    .line 101
    iput-object p4, p0, Lcom/android/volley/j;->e:Lcom/android/volley/l;

    .line 102
    return-void
.end method


# virtual methods
.method public a(Lcom/android/volley/Request;)Lcom/android/volley/Request;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/android/volley/Request",
            "<TT;>;)",
            "Lcom/android/volley/Request",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 223
    invoke-virtual {p1, p0}, Lcom/android/volley/Request;->a(Lcom/android/volley/j;)Lcom/android/volley/Request;

    .line 224
    iget-object v1, p0, Lcom/android/volley/j;->j:Ljava/util/Set;

    monitor-enter v1

    .line 225
    :try_start_0
    iget-object v0, p0, Lcom/android/volley/j;->j:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 224
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 229
    invoke-virtual {p0}, Lcom/android/volley/j;->c()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/android/volley/Request;->a(I)Lcom/android/volley/Request;

    .line 230
    const-string/jumbo v0, "add-to-queue"

    invoke-virtual {p1, v0}, Lcom/android/volley/Request;->a(Ljava/lang/String;)V

    .line 233
    invoke-virtual {p1}, Lcom/android/volley/Request;->r()Z

    move-result v0

    if-nez v0, :cond_0

    .line 234
    iget-object v0, p0, Lcom/android/volley/j;->b:Ljava/util/concurrent/PriorityBlockingQueue;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/PriorityBlockingQueue;->add(Ljava/lang/Object;)Z

    .line 258
    :goto_0
    return-object p1

    .line 224
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    .line 239
    :cond_0
    iget-object v1, p0, Lcom/android/volley/j;->i:Ljava/util/Map;

    monitor-enter v1

    .line 240
    :try_start_2
    invoke-virtual {p1}, Lcom/android/volley/Request;->e()Ljava/lang/String;

    move-result-object v2

    .line 241
    iget-object v0, p0, Lcom/android/volley/j;->i:Ljava/util/Map;

    invoke-interface {v0, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 243
    iget-object v0, p0, Lcom/android/volley/j;->i:Ljava/util/Map;

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Queue;

    .line 244
    if-nez v0, :cond_1

    .line 245
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    .line 247
    :cond_1
    invoke-interface {v0, p1}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    .line 248
    iget-object v3, p0, Lcom/android/volley/j;->i:Ljava/util/Map;

    invoke-interface {v3, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 249
    sget-boolean v0, Lcom/android/volley/n;->b:Z

    if-eqz v0, :cond_2

    .line 250
    const-string/jumbo v0, "Request for cacheKey=%s is in flight, putting on hold."

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v2, v3, v4

    invoke-static {v0, v3}, Lcom/android/volley/n;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 258
    :cond_2
    :goto_1
    monitor-exit v1

    goto :goto_0

    .line 239
    :catchall_1
    move-exception v0

    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw v0

    .line 255
    :cond_3
    :try_start_3
    iget-object v0, p0, Lcom/android/volley/j;->i:Ljava/util/Map;

    const/4 v3, 0x0

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 256
    iget-object v0, p0, Lcom/android/volley/j;->a:Ljava/util/concurrent/PriorityBlockingQueue;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/PriorityBlockingQueue;->add(Ljava/lang/Object;)Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_1
.end method

.method public a()V
    .locals 6

    .prologue
    .line 134
    invoke-virtual {p0}, Lcom/android/volley/j;->b()V

    .line 136
    new-instance v0, Lcom/android/volley/b;

    iget-object v1, p0, Lcom/android/volley/j;->a:Ljava/util/concurrent/PriorityBlockingQueue;

    iget-object v2, p0, Lcom/android/volley/j;->b:Ljava/util/concurrent/PriorityBlockingQueue;

    iget-object v3, p0, Lcom/android/volley/j;->c:Lcom/android/volley/a;

    iget-object v4, p0, Lcom/android/volley/j;->e:Lcom/android/volley/l;

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/android/volley/b;-><init>(Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/BlockingQueue;Lcom/android/volley/a;Lcom/android/volley/l;)V

    iput-object v0, p0, Lcom/android/volley/j;->g:Lcom/android/volley/b;

    .line 137
    iget-object v0, p0, Lcom/android/volley/j;->g:Lcom/android/volley/b;

    invoke-virtual {v0}, Lcom/android/volley/b;->start()V

    .line 140
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lcom/android/volley/j;->f:[Lcom/android/volley/h;

    array-length v1, v1

    if-lt v0, v1, :cond_0

    .line 145
    return-void

    .line 141
    :cond_0
    new-instance v1, Lcom/android/volley/h;

    iget-object v2, p0, Lcom/android/volley/j;->b:Ljava/util/concurrent/PriorityBlockingQueue;

    iget-object v3, p0, Lcom/android/volley/j;->d:Lcom/android/volley/g;

    iget-object v4, p0, Lcom/android/volley/j;->c:Lcom/android/volley/a;

    iget-object v5, p0, Lcom/android/volley/j;->e:Lcom/android/volley/l;

    invoke-direct {v1, v2, v3, v4, v5}, Lcom/android/volley/h;-><init>(Ljava/util/concurrent/BlockingQueue;Lcom/android/volley/g;Lcom/android/volley/a;Lcom/android/volley/l;)V

    .line 142
    iget-object v2, p0, Lcom/android/volley/j;->f:[Lcom/android/volley/h;

    aput-object v1, v2, v0

    .line 143
    invoke-virtual {v1}, Lcom/android/volley/h;->start()V

    .line 140
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method public a(Lcom/android/volley/j$a;)V
    .locals 4

    .prologue
    .line 189
    iget-object v1, p0, Lcom/android/volley/j;->j:Ljava/util/Set;

    monitor-enter v1

    .line 190
    :try_start_0
    iget-object v0, p0, Lcom/android/volley/j;->j:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_1

    .line 189
    monitor-exit v1

    .line 196
    return-void

    .line 190
    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/android/volley/Request;

    .line 191
    invoke-interface {p1, v0}, Lcom/android/volley/j$a;->a(Lcom/android/volley/Request;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 192
    invoke-virtual {v0}, Lcom/android/volley/Request;->g()V

    goto :goto_0

    .line 189
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public a(Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 203
    if-nez p1, :cond_0

    .line 204
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string/jumbo v1, "Cannot cancelAll with a null tag"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 206
    :cond_0
    new-instance v0, Lcom/android/volley/j$1;

    invoke-direct {v0, p0, p1}, Lcom/android/volley/j$1;-><init>(Lcom/android/volley/j;Ljava/lang/Object;)V

    invoke-virtual {p0, v0}, Lcom/android/volley/j;->a(Lcom/android/volley/j$a;)V

    .line 212
    return-void
.end method

.method public b()V
    .locals 2

    .prologue
    .line 151
    iget-object v0, p0, Lcom/android/volley/j;->g:Lcom/android/volley/b;

    if-eqz v0, :cond_0

    .line 152
    iget-object v0, p0, Lcom/android/volley/j;->g:Lcom/android/volley/b;

    invoke-virtual {v0}, Lcom/android/volley/b;->a()V

    .line 154
    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lcom/android/volley/j;->f:[Lcom/android/volley/h;

    array-length v1, v1

    if-lt v0, v1, :cond_1

    .line 159
    return-void

    .line 155
    :cond_1
    iget-object v1, p0, Lcom/android/volley/j;->f:[Lcom/android/volley/h;

    aget-object v1, v1, v0

    if-eqz v1, :cond_2

    .line 156
    iget-object v1, p0, Lcom/android/volley/j;->f:[Lcom/android/volley/h;

    aget-object v1, v1, v0

    invoke-virtual {v1}, Lcom/android/volley/h;->a()V

    .line 154
    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method b(Lcom/android/volley/Request;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/android/volley/Request",
            "<*>;)V"
        }
    .end annotation

    .prologue
    .line 272
    iget-object v1, p0, Lcom/android/volley/j;->j:Ljava/util/Set;

    monitor-enter v1

    .line 273
    :try_start_0
    iget-object v0, p0, Lcom/android/volley/j;->j:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 272
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 276
    invoke-virtual {p1}, Lcom/android/volley/Request;->r()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 277
    iget-object v1, p0, Lcom/android/volley/j;->i:Ljava/util/Map;

    monitor-enter v1

    .line 278
    :try_start_1
    invoke-virtual {p1}, Lcom/android/volley/Request;->e()Ljava/lang/String;

    move-result-object v2

    .line 279
    iget-object v0, p0, Lcom/android/volley/j;->i:Ljava/util/Map;

    invoke-interface {v0, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Queue;

    .line 280
    if-eqz v0, :cond_1

    .line 281
    sget-boolean v3, Lcom/android/volley/n;->b:Z

    if-eqz v3, :cond_0

    .line 282
    const-string/jumbo v3, "Releasing %d waiting requests for cacheKey=%s."

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

    invoke-static {v3, v4}, Lcom/android/volley/n;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 286
    :cond_0
    iget-object v2, p0, Lcom/android/volley/j;->a:Ljava/util/concurrent/PriorityBlockingQueue;

    invoke-virtual {v2, v0}, Ljava/util/concurrent/PriorityBlockingQueue;->addAll(Ljava/util/Collection;)Z

    .line 277
    :cond_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 290
    :cond_2
    return-void

    .line 272
    :catchall_0
    move-exception v0

    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    .line 277
    :catchall_1
    move-exception v0

    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw v0
.end method

.method public c()I
    .locals 1

    .prologue
    .line 165
    iget-object v0, p0, Lcom/android/volley/j;->h:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    move-result v0

    return v0
.end method

.method public d()Lcom/android/volley/a;
    .locals 1

    .prologue
    .line 172
    iget-object v0, p0, Lcom/android/volley/j;->c:Lcom/android/volley/a;

    return-object v0
.end method
