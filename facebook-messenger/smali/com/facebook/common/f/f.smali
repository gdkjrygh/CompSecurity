.class public Lcom/facebook/common/f/f;
.super Ljava/lang/Object;
.source "StatFsHelper.java"


# instance fields
.field private final a:Landroid/os/StatFs;

.field private final b:Ljava/lang/String;

.field private final c:Landroid/os/StatFs;

.field private final d:Ljava/lang/String;

.field private final e:Lcom/google/common/base/Stopwatch;

.field private final f:Ljava/util/concurrent/locks/Lock;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    invoke-virtual {p1}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/common/f/f;->b:Ljava/lang/String;

    .line 45
    new-instance v0, Landroid/os/StatFs;

    iget-object v1, p0, Lcom/facebook/common/f/f;->b:Ljava/lang/String;

    invoke-direct {v0, v1}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/facebook/common/f/f;->a:Landroid/os/StatFs;

    .line 47
    invoke-virtual {p1}, Landroid/content/Context;->getExternalCacheDir()Ljava/io/File;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 48
    invoke-virtual {p1}, Landroid/content/Context;->getExternalCacheDir()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/common/f/f;->d:Ljava/lang/String;

    .line 49
    new-instance v0, Landroid/os/StatFs;

    iget-object v1, p0, Lcom/facebook/common/f/f;->d:Ljava/lang/String;

    invoke-direct {v0, v1}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/facebook/common/f/f;->c:Landroid/os/StatFs;

    .line 55
    :goto_0
    new-instance v0, Lcom/google/common/base/Stopwatch;

    invoke-direct {v0}, Lcom/google/common/base/Stopwatch;-><init>()V

    iput-object v0, p0, Lcom/facebook/common/f/f;->e:Lcom/google/common/base/Stopwatch;

    .line 56
    iget-object v0, p0, Lcom/facebook/common/f/f;->e:Lcom/google/common/base/Stopwatch;

    invoke-virtual {v0}, Lcom/google/common/base/Stopwatch;->reset()Lcom/google/common/base/Stopwatch;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/base/Stopwatch;->start()Lcom/google/common/base/Stopwatch;

    .line 57
    new-instance v0, Ljava/util/concurrent/locks/ReentrantLock;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    iput-object v0, p0, Lcom/facebook/common/f/f;->f:Ljava/util/concurrent/locks/Lock;

    .line 58
    return-void

    .line 51
    :cond_0
    iput-object v2, p0, Lcom/facebook/common/f/f;->d:Ljava/lang/String;

    .line 52
    iput-object v2, p0, Lcom/facebook/common/f/f;->c:Landroid/os/StatFs;

    goto :goto_0
.end method

.method private a()V
    .locals 4

    .prologue
    .line 105
    iget-object v0, p0, Lcom/facebook/common/f/f;->f:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->tryLock()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 107
    :try_start_0
    iget-object v0, p0, Lcom/facebook/common/f/f;->e:Lcom/google/common/base/Stopwatch;

    invoke-virtual {v0}, Lcom/google/common/base/Stopwatch;->elapsedMillis()J

    move-result-wide v0

    const-wide/32 v2, 0x927c0

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    .line 108
    invoke-direct {p0}, Lcom/facebook/common/f/f;->b()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 111
    :cond_0
    iget-object v0, p0, Lcom/facebook/common/f/f;->f:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 114
    :cond_1
    return-void

    .line 111
    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/facebook/common/f/f;->f:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v0
.end method

.method private b()V
    .locals 2

    .prologue
    .line 131
    iget-object v0, p0, Lcom/facebook/common/f/f;->a:Landroid/os/StatFs;

    iget-object v1, p0, Lcom/facebook/common/f/f;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/os/StatFs;->restat(Ljava/lang/String;)V

    .line 132
    iget-object v0, p0, Lcom/facebook/common/f/f;->d:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 133
    iget-object v0, p0, Lcom/facebook/common/f/f;->c:Landroid/os/StatFs;

    iget-object v1, p0, Lcom/facebook/common/f/f;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/os/StatFs;->restat(Ljava/lang/String;)V

    .line 135
    :cond_0
    iget-object v0, p0, Lcom/facebook/common/f/f;->e:Lcom/google/common/base/Stopwatch;

    invoke-virtual {v0}, Lcom/google/common/base/Stopwatch;->reset()Lcom/google/common/base/Stopwatch;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/base/Stopwatch;->start()Lcom/google/common/base/Stopwatch;

    .line 136
    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/common/f/g;)J
    .locals 5

    .prologue
    .line 86
    invoke-direct {p0}, Lcom/facebook/common/f/f;->a()V

    .line 88
    sget-object v0, Lcom/facebook/common/f/g;->INTERNAL:Lcom/facebook/common/f/g;

    if-ne p1, v0, :cond_0

    iget-object v0, p0, Lcom/facebook/common/f/f;->a:Landroid/os/StatFs;

    .line 89
    :goto_0
    if-eqz v0, :cond_1

    .line 90
    invoke-virtual {v0}, Landroid/os/StatFs;->getBlockSize()I

    move-result v1

    int-to-long v1, v1

    .line 91
    invoke-virtual {v0}, Landroid/os/StatFs;->getAvailableBlocks()I

    move-result v0

    int-to-long v3, v0

    .line 92
    mul-long v0, v1, v3

    .line 94
    :goto_1
    return-wide v0

    .line 88
    :cond_0
    iget-object v0, p0, Lcom/facebook/common/f/f;->c:Landroid/os/StatFs;

    goto :goto_0

    .line 94
    :cond_1
    const-wide/16 v0, 0x0

    goto :goto_1
.end method

.method public a(Lcom/facebook/common/f/g;J)Z
    .locals 5

    .prologue
    const/4 v0, 0x1

    .line 72
    invoke-virtual {p0, p1}, Lcom/facebook/common/f/f;->a(Lcom/facebook/common/f/g;)J

    move-result-wide v1

    .line 73
    const-wide/16 v3, 0x0

    cmp-long v3, v1, v3

    if-lez v3, :cond_0

    .line 74
    cmp-long v1, v1, p2

    if-gez v1, :cond_1

    .line 76
    :cond_0
    :goto_0
    return v0

    .line 74
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method
