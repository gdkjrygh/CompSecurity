.class public Lkik/a/h/k;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field protected a:J

.field private b:Ljava/util/concurrent/ScheduledExecutorService;

.field private c:Ljava/util/concurrent/ScheduledFuture;

.field private d:Lcom/kik/g/k;


# direct methods
.method public constructor <init>(J)V
    .locals 1

    .prologue
    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newScheduledThreadPool(I)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    iput-object v0, p0, Lkik/a/h/k;->b:Ljava/util/concurrent/ScheduledExecutorService;

    .line 31
    iput-wide p1, p0, Lkik/a/h/k;->a:J

    .line 32
    new-instance v0, Lcom/kik/g/k;

    invoke-direct {v0, p0}, Lcom/kik/g/k;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lkik/a/h/k;->d:Lcom/kik/g/k;

    .line 33
    return-void
.end method

.method static synthetic a(Lkik/a/h/k;)Ljava/util/concurrent/ScheduledFuture;
    .locals 1

    .prologue
    .line 14
    const/4 v0, 0x0

    iput-object v0, p0, Lkik/a/h/k;->c:Ljava/util/concurrent/ScheduledFuture;

    return-object v0
.end method

.method static synthetic b(Lkik/a/h/k;)Lcom/kik/g/k;
    .locals 1

    .prologue
    .line 14
    iget-object v0, p0, Lkik/a/h/k;->d:Lcom/kik/g/k;

    return-object v0
.end method


# virtual methods
.method public a()Z
    .locals 5

    .prologue
    .line 38
    iget-object v0, p0, Lkik/a/h/k;->b:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v1, Lkik/a/h/l;

    invoke-direct {v1, p0}, Lkik/a/h/l;-><init>(Lkik/a/h/k;)V

    invoke-virtual {p0}, Lkik/a/h/k;->b()J

    move-result-wide v2

    sget-object v4, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v0, v1, v2, v3, v4}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object v0

    iput-object v0, p0, Lkik/a/h/k;->c:Ljava/util/concurrent/ScheduledFuture;

    .line 47
    iget-object v0, p0, Lkik/a/h/k;->c:Ljava/util/concurrent/ScheduledFuture;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method protected b()J
    .locals 2

    .prologue
    .line 73
    iget-wide v0, p0, Lkik/a/h/k;->a:J

    return-wide v0
.end method

.method public c()V
    .locals 2

    .prologue
    .line 59
    iget-object v0, p0, Lkik/a/h/k;->c:Ljava/util/concurrent/ScheduledFuture;

    if-eqz v0, :cond_0

    .line 60
    iget-object v0, p0, Lkik/a/h/k;->c:Ljava/util/concurrent/ScheduledFuture;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Ljava/util/concurrent/ScheduledFuture;->cancel(Z)Z

    .line 61
    const/4 v0, 0x0

    iput-object v0, p0, Lkik/a/h/k;->c:Ljava/util/concurrent/ScheduledFuture;

    .line 63
    :cond_0
    return-void
.end method

.method public final d()Z
    .locals 1

    .prologue
    .line 53
    iget-object v0, p0, Lkik/a/h/k;->c:Ljava/util/concurrent/ScheduledFuture;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final e()Lcom/kik/g/e;
    .locals 1

    .prologue
    .line 68
    iget-object v0, p0, Lkik/a/h/k;->d:Lcom/kik/g/k;

    invoke-virtual {v0}, Lcom/kik/g/k;->a()Lcom/kik/g/e;

    move-result-object v0

    return-object v0
.end method
