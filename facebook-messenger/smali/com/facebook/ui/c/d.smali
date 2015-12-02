.class public Lcom/facebook/ui/c/d;
.super Ljava/lang/Object;
.source "DiskUsageUtil.java"


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Lcom/facebook/common/executors/a;

.field private final c:Lcom/facebook/common/f/f;

.field private final d:Lcom/google/common/base/Stopwatch;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/facebook/common/executors/a;Lcom/facebook/common/f/f;)V
    .locals 1

    .prologue
    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    iput-object p3, p0, Lcom/facebook/ui/c/d;->c:Lcom/facebook/common/f/f;

    .line 38
    iput-object p1, p0, Lcom/facebook/ui/c/d;->a:Landroid/content/Context;

    .line 39
    iput-object p2, p0, Lcom/facebook/ui/c/d;->b:Lcom/facebook/common/executors/a;

    .line 40
    new-instance v0, Lcom/google/common/base/Stopwatch;

    invoke-direct {v0}, Lcom/google/common/base/Stopwatch;-><init>()V

    iput-object v0, p0, Lcom/facebook/ui/c/d;->d:Lcom/google/common/base/Stopwatch;

    .line 41
    iget-object v0, p0, Lcom/facebook/ui/c/d;->d:Lcom/google/common/base/Stopwatch;

    invoke-virtual {v0}, Lcom/google/common/base/Stopwatch;->reset()Lcom/google/common/base/Stopwatch;

    .line 42
    return-void
.end method

.method static synthetic a(Lcom/facebook/ui/c/d;)Landroid/content/Context;
    .locals 1

    .prologue
    .line 21
    iget-object v0, p0, Lcom/facebook/ui/c/d;->a:Landroid/content/Context;

    return-object v0
.end method

.method private declared-synchronized a()V
    .locals 4

    .prologue
    .line 75
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/ui/c/d;->d:Lcom/google/common/base/Stopwatch;

    invoke-virtual {v0}, Lcom/google/common/base/Stopwatch;->isRunning()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/ui/c/d;->d:Lcom/google/common/base/Stopwatch;

    invoke-virtual {v0}, Lcom/google/common/base/Stopwatch;->elapsedMillis()J

    move-result-wide v0

    const-wide/32 v2, 0x36ee80

    cmp-long v0, v0, v2

    if-lez v0, :cond_1

    .line 78
    :cond_0
    iget-object v0, p0, Lcom/facebook/ui/c/d;->b:Lcom/facebook/common/executors/a;

    new-instance v1, Lcom/facebook/ui/c/e;

    invoke-direct {v1, p0}, Lcom/facebook/ui/c/e;-><init>(Lcom/facebook/ui/c/d;)V

    invoke-interface {v0, v1}, Lcom/facebook/common/executors/a;->b(Ljava/lang/Runnable;)V

    .line 86
    iget-object v0, p0, Lcom/facebook/ui/c/d;->d:Lcom/google/common/base/Stopwatch;

    invoke-virtual {v0}, Lcom/google/common/base/Stopwatch;->reset()Lcom/google/common/base/Stopwatch;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/base/Stopwatch;->start()Lcom/google/common/base/Stopwatch;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 88
    :cond_1
    monitor-exit p0

    return-void

    .line 75
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method


# virtual methods
.method public a(JZ)Z
    .locals 2

    .prologue
    .line 58
    iget-object v0, p0, Lcom/facebook/ui/c/d;->c:Lcom/facebook/common/f/f;

    sget-object v1, Lcom/facebook/common/f/g;->INTERNAL:Lcom/facebook/common/f/g;

    invoke-virtual {v0, v1, p1, p2}, Lcom/facebook/common/f/f;->a(Lcom/facebook/common/f/g;J)Z

    move-result v0

    .line 62
    if-eqz v0, :cond_0

    if-eqz p3, :cond_0

    .line 63
    invoke-direct {p0}, Lcom/facebook/ui/c/d;->a()V

    .line 66
    :cond_0
    return v0
.end method
