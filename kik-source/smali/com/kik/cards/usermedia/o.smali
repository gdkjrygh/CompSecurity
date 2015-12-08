.class public final Lcom/kik/cards/usermedia/o;
.super Lcom/kik/cache/d;
.source "SourceFile"


# instance fields
.field private a:Landroid/content/ContentResolver;

.field private b:Z

.field private final c:I

.field private d:Ljava/util/Map;

.field private e:Ljava/util/concurrent/ThreadPoolExecutor;


# direct methods
.method public constructor <init>(Lcom/kik/sdkutils/b/a;Landroid/content/ContentResolver;Landroid/content/res/Resources;)V
    .locals 9

    .prologue
    .line 89
    const/4 v0, 0x0

    invoke-direct {p0, v0, p1}, Lcom/kik/cache/d;-><init>(Lcom/kik/cache/d;Lcom/kik/sdkutils/b/a;)V

    .line 81
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/kik/cards/usermedia/o;->b:Z

    .line 83
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/kik/cards/usermedia/o;->d:Ljava/util/Map;

    .line 85
    new-instance v1, Ljava/util/concurrent/ThreadPoolExecutor;

    const/4 v2, 0x5

    const/16 v3, 0xa

    const-wide/16 v4, 0x32

    sget-object v6, Ljava/util/concurrent/TimeUnit;->MICROSECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v7, Ljava/util/concurrent/LinkedBlockingQueue;

    const/16 v0, 0x19

    invoke-direct {v7, v0}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>(I)V

    new-instance v8, Lcom/kik/cards/usermedia/m;

    invoke-direct {v8}, Lcom/kik/cards/usermedia/m;-><init>()V

    invoke-direct/range {v1 .. v8}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/RejectedExecutionHandler;)V

    iput-object v1, p0, Lcom/kik/cards/usermedia/o;->e:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 90
    iput-object p2, p0, Lcom/kik/cards/usermedia/o;->a:Landroid/content/ContentResolver;

    .line 91
    invoke-virtual {p3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    const/high16 v1, 0x40000000    # 2.0f

    cmpl-float v0, v0, v1

    if-ltz v0, :cond_0

    .line 92
    const/4 v0, 0x1

    iput v0, p0, Lcom/kik/cards/usermedia/o;->c:I

    .line 97
    :goto_0
    return-void

    .line 95
    :cond_0
    const/4 v0, 0x3

    iput v0, p0, Lcom/kik/cards/usermedia/o;->c:I

    goto :goto_0
.end method

.method private a(Lcom/kik/cards/usermedia/q;)Lcom/kik/g/p;
    .locals 4

    .prologue
    .line 126
    iget-object v1, p0, Lcom/kik/cards/usermedia/o;->d:Ljava/util/Map;

    monitor-enter v1

    .line 127
    :try_start_0
    iget-boolean v0, p0, Lcom/kik/cards/usermedia/o;->b:Z

    if-eqz v0, :cond_0

    .line 128
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/kik/g/s;->a(Ljava/lang/Throwable;)Lcom/kik/g/p;

    move-result-object v0

    monitor-exit v1

    .line 148
    :goto_0
    return-object v0

    .line 131
    :cond_0
    iget-object v0, p0, Lcom/kik/cards/usermedia/o;->d:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 132
    iget-object v0, p0, Lcom/kik/cards/usermedia/o;->d:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/g/p;

    monitor-exit v1

    goto :goto_0

    .line 150
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 135
    :cond_1
    :try_start_1
    new-instance v2, Lcom/kik/cards/usermedia/n;

    iget-object v0, p0, Lcom/kik/cards/usermedia/o;->a:Landroid/content/ContentResolver;

    iget v3, p0, Lcom/kik/cards/usermedia/o;->c:I

    invoke-direct {v2, p1, v0, v3}, Lcom/kik/cards/usermedia/n;-><init>(Lcom/kik/cards/usermedia/q;Landroid/content/ContentResolver;I)V

    .line 136
    iget-object v0, v2, Lcom/kik/cards/usermedia/n;->a:Lcom/kik/g/p;

    .line 137
    iget-object v3, p0, Lcom/kik/cards/usermedia/o;->d:Ljava/util/Map;

    invoke-interface {v3, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 138
    iget-object v3, p0, Lcom/kik/cards/usermedia/o;->e:Ljava/util/concurrent/ThreadPoolExecutor;

    invoke-virtual {v3, v2}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    .line 139
    new-instance v2, Lcom/kik/cards/usermedia/p;

    invoke-direct {v2, p0, p1}, Lcom/kik/cards/usermedia/p;-><init>(Lcom/kik/cards/usermedia/o;Lcom/kik/cards/usermedia/q;)V

    invoke-virtual {v0, v2}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    .line 148
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0
.end method

.method static synthetic a(Lcom/kik/cards/usermedia/o;)Ljava/util/Map;
    .locals 1

    .prologue
    .line 77
    iget-object v0, p0, Lcom/kik/cards/usermedia/o;->d:Ljava/util/Map;

    return-object v0
.end method


# virtual methods
.method protected final bridge synthetic a(Ljava/lang/Object;)Lcom/kik/g/p;
    .locals 1

    .prologue
    .line 77
    check-cast p1, Lcom/kik/cards/usermedia/q;

    invoke-direct {p0, p1}, Lcom/kik/cards/usermedia/o;->a(Lcom/kik/cards/usermedia/q;)Lcom/kik/g/p;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic a(Ljava/lang/Object;Lcom/kik/cache/h;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 77
    invoke-virtual {p2}, Lcom/kik/cache/h;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/cache/g;

    return-object v0
.end method

.method protected final a()Ljava/util/Set;
    .locals 1

    .prologue
    .line 120
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    return-object v0
.end method

.method protected final bridge synthetic b(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 77
    return-void
.end method

.method public final d()V
    .locals 5

    .prologue
    .line 161
    iget-object v1, p0, Lcom/kik/cards/usermedia/o;->d:Ljava/util/Map;

    monitor-enter v1

    .line 162
    const/4 v0, 0x1

    :try_start_0
    iput-boolean v0, p0, Lcom/kik/cards/usermedia/o;->b:Z

    .line 163
    iget-object v0, p0, Lcom/kik/cards/usermedia/o;->e:Ljava/util/concurrent/ThreadPoolExecutor;

    invoke-virtual {v0}, Ljava/util/concurrent/ThreadPoolExecutor;->shutdownNow()Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 165
    :try_start_1
    iget-object v0, p0, Lcom/kik/cards/usermedia/o;->e:Ljava/util/concurrent/ThreadPoolExecutor;

    const-wide/16 v2, 0xa

    sget-object v4, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v2, v3, v4}, Ljava/util/concurrent/ThreadPoolExecutor;->awaitTermination(JLjava/util/concurrent/TimeUnit;)Z
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 171
    :goto_0
    const/4 v0, 0x0

    :try_start_2
    iput-object v0, p0, Lcom/kik/cards/usermedia/o;->e:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 172
    monitor-exit v1

    return-void

    .line 167
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/InterruptedException;->printStackTrace()V

    goto :goto_0

    .line 172
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0
.end method
