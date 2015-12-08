.class public final Lkik/a/c/g;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lkik/a/e/f;

.field private final b:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private final c:Ljava/util/concurrent/LinkedBlockingQueue;


# direct methods
.method public constructor <init>(Lkik/a/e/f;)V
    .locals 2

    .prologue
    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    iput-object v0, p0, Lkik/a/c/g;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 27
    iput-object p1, p0, Lkik/a/c/g;->a:Lkik/a/e/f;

    .line 28
    new-instance v0, Ljava/util/concurrent/LinkedBlockingQueue;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>(I)V

    iput-object v0, p0, Lkik/a/c/g;->c:Ljava/util/concurrent/LinkedBlockingQueue;

    .line 29
    return-void
.end method

.method private a()V
    .locals 3

    .prologue
    .line 72
    iget-object v1, p0, Lkik/a/c/g;->c:Ljava/util/concurrent/LinkedBlockingQueue;

    monitor-enter v1

    .line 73
    :try_start_0
    iget-object v0, p0, Lkik/a/c/g;->c:Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-virtual {v0}, Ljava/util/concurrent/LinkedBlockingQueue;->poll()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 74
    if-nez v0, :cond_0

    .line 75
    iget-object v0, p0, Lkik/a/c/g;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 76
    monitor-exit v1

    .line 88
    :goto_0
    return-void

    .line 78
    :cond_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 79
    iget-object v2, p0, Lkik/a/c/g;->a:Lkik/a/e/f;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkik/a/f/f/z;

    invoke-interface {v2, v1}, Lkik/a/e/f;->a(Lkik/a/f/f/z;)Lcom/kik/g/p;

    move-result-object v1

    .line 80
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/g/r;

    invoke-virtual {v1, v0}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    .line 81
    new-instance v0, Lkik/a/c/h;

    invoke-direct {v0, p0}, Lkik/a/c/h;-><init>(Lkik/a/c/g;)V

    invoke-virtual {v1, v0}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    goto :goto_0

    .line 78
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method static synthetic a(Lkik/a/c/g;)V
    .locals 0

    .prologue
    .line 19
    invoke-direct {p0}, Lkik/a/c/g;->a()V

    return-void
.end method


# virtual methods
.method public final a(Lkik/a/f/f/z;Lcom/kik/g/r;)V
    .locals 3

    .prologue
    .line 39
    iget-object v1, p0, Lkik/a/c/g;->c:Ljava/util/concurrent/LinkedBlockingQueue;

    monitor-enter v1

    .line 41
    :try_start_0
    iget-object v0, p0, Lkik/a/c/g;->c:Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-static {p1, p2}, Lcom/c/a/b/ac;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/concurrent/LinkedBlockingQueue;->offer(Ljava/lang/Object;)Z

    move-result v0

    .line 42
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    if-eqz v0, :cond_1

    .line 44
    iget-object v0, p0, Lkik/a/c/g;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0}, Lkik/a/c/g;->a()V

    .line 49
    :cond_0
    :goto_0
    return-void

    .line 42
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    .line 47
    :cond_1
    new-instance v0, Ljava/lang/Exception;

    const-string v1, "Sending queue at capacity"

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, v0}, Lcom/kik/g/r;->b(Ljava/lang/Throwable;)V

    goto :goto_0
.end method
