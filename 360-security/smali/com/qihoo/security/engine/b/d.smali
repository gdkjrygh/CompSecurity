.class public Lcom/qihoo/security/engine/b/d;
.super Ljava/lang/Object;


# instance fields
.field a:Z

.field final b:Lcom/qihoo/security/engine/b/c;

.field final c:Ljava/util/concurrent/atomic/AtomicInteger;

.field final d:Ljava/util/concurrent/atomic/AtomicInteger;

.field volatile e:I

.field volatile f:I

.field volatile g:J

.field h:J

.field i:I

.field final j:Landroid/os/Handler;

.field final k:Ljava/lang/Runnable;

.field final l:Ljava/util/concurrent/ConcurrentLinkedQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentLinkedQueue",
            "<",
            "Lcom/qihoo/security/services/ScanResult;",
            ">;"
        }
    .end annotation
.end field

.field final m:Ljava/util/concurrent/ConcurrentLinkedQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentLinkedQueue",
            "<",
            "Lcom/qihoo/security/services/ScanResult;",
            ">;"
        }
    .end annotation
.end field

.field volatile n:Z

.field volatile o:Z

.field volatile p:Z

.field private volatile q:I


# direct methods
.method public constructor <init>(Lcom/qihoo/security/engine/b/c;Landroid/os/Handler;)V
    .locals 4

    const-wide/16 v2, 0x0

    const/4 v1, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean v1, p0, Lcom/qihoo/security/engine/b/d;->a:Z

    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object v0, p0, Lcom/qihoo/security/engine/b/d;->c:Ljava/util/concurrent/atomic/AtomicInteger;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object v0, p0, Lcom/qihoo/security/engine/b/d;->d:Ljava/util/concurrent/atomic/AtomicInteger;

    iput v1, p0, Lcom/qihoo/security/engine/b/d;->q:I

    const/4 v0, -0x1

    iput v0, p0, Lcom/qihoo/security/engine/b/d;->e:I

    iput v1, p0, Lcom/qihoo/security/engine/b/d;->f:I

    iput-wide v2, p0, Lcom/qihoo/security/engine/b/d;->g:J

    iput-wide v2, p0, Lcom/qihoo/security/engine/b/d;->h:J

    iput v1, p0, Lcom/qihoo/security/engine/b/d;->i:I

    new-instance v0, Lcom/qihoo/security/engine/b/d$1;

    invoke-direct {v0, p0}, Lcom/qihoo/security/engine/b/d$1;-><init>(Lcom/qihoo/security/engine/b/d;)V

    iput-object v0, p0, Lcom/qihoo/security/engine/b/d;->k:Ljava/lang/Runnable;

    new-instance v0, Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/engine/b/d;->l:Ljava/util/concurrent/ConcurrentLinkedQueue;

    new-instance v0, Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/engine/b/d;->m:Ljava/util/concurrent/ConcurrentLinkedQueue;

    iput-boolean v1, p0, Lcom/qihoo/security/engine/b/d;->n:Z

    iput-boolean v1, p0, Lcom/qihoo/security/engine/b/d;->o:Z

    iput-boolean v1, p0, Lcom/qihoo/security/engine/b/d;->p:Z

    iput-object p1, p0, Lcom/qihoo/security/engine/b/d;->b:Lcom/qihoo/security/engine/b/c;

    iput-object p2, p0, Lcom/qihoo/security/engine/b/d;->j:Landroid/os/Handler;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 4

    invoke-virtual {p0}, Lcom/qihoo/security/engine/b/d;->d()V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/qihoo/security/engine/b/d;->h:J

    iget-object v0, p0, Lcom/qihoo/security/engine/b/d;->j:Landroid/os/Handler;

    iget-object v1, p0, Lcom/qihoo/security/engine/b/d;->k:Ljava/lang/Runnable;

    const-wide/16 v2, 0xc8

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method public a(I)V
    .locals 0

    iput p1, p0, Lcom/qihoo/security/engine/b/d;->e:I

    return-void
.end method

.method public a(Lcom/qihoo/security/services/ScanResult;)V
    .locals 6

    const/4 v5, 0x1

    const/4 v4, 0x0

    iget v0, p1, Lcom/qihoo/security/services/ScanResult;->state:I

    const/16 v1, 0x7f

    if-ne v0, v1, :cond_4

    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/engine/b/d;->b:Lcom/qihoo/security/engine/b/c;

    iget-object v0, v0, Lcom/qihoo/security/engine/b/c;->e:Lcom/qihoo/security/services/d;

    invoke-virtual {v0}, Lcom/qihoo/security/services/d;->e()Lcom/qihoo/security/services/a;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/qihoo/security/services/a;->a(Lcom/qihoo/security/services/ScanResult;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    iget-wide v0, p0, Lcom/qihoo/security/engine/b/d;->h:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/engine/b/d;->b:Lcom/qihoo/security/engine/b/c;

    new-instance v1, Lcom/qihoo/security/services/ScanProgress;

    invoke-direct {v1, p1, v4, v5, v5}, Lcom/qihoo/security/services/ScanProgress;-><init>(Lcom/qihoo/security/services/ScanResult;III)V

    invoke-virtual {v0, v1, v5}, Lcom/qihoo/security/engine/b/c;->a(Lcom/qihoo/security/services/ScanProgress;Z)V

    :goto_1
    return-void

    :cond_0
    iget-boolean v0, p0, Lcom/qihoo/security/engine/b/d;->a:Z

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/qihoo/security/engine/b/d;->c:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    iget-object v1, p0, Lcom/qihoo/security/engine/b/d;->d:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    move-result v1

    iget-object v2, p0, Lcom/qihoo/security/engine/b/d;->c:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v2

    if-ne v1, v2, :cond_1

    iput-boolean v4, p0, Lcom/qihoo/security/engine/b/d;->a:Z

    iget-object v1, p0, Lcom/qihoo/security/engine/b/d;->d:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v1, v4}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    :cond_1
    :goto_2
    const/16 v1, 0x14

    if-le v0, v1, :cond_2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iget-wide v4, p0, Lcom/qihoo/security/engine/b/d;->h:J

    sub-long/2addr v2, v4

    int-to-long v0, v0

    div-long v0, v2, v0

    iput-wide v0, p0, Lcom/qihoo/security/engine/b/d;->g:J

    :cond_2
    iget-object v0, p0, Lcom/qihoo/security/engine/b/d;->m:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->offer(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    iget-object v0, p0, Lcom/qihoo/security/engine/b/d;->c:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    move-result v0

    goto :goto_2

    :cond_4
    iget-object v0, p0, Lcom/qihoo/security/engine/b/d;->l:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->offer(Ljava/lang/Object;)Z

    goto :goto_1

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public b()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/qihoo/security/engine/b/d;->n:Z

    return-void
.end method

.method public b(I)V
    .locals 1

    const/16 v0, 0xa

    if-ge p1, v0, :cond_0

    iput v0, p0, Lcom/qihoo/security/engine/b/d;->q:I

    :goto_0
    return-void

    :cond_0
    iput p1, p0, Lcom/qihoo/security/engine/b/d;->q:I

    goto :goto_0
.end method

.method public c()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/qihoo/security/engine/b/d;->o:Z

    return-void
.end method

.method public c(I)V
    .locals 1

    iget v0, p0, Lcom/qihoo/security/engine/b/d;->f:I

    add-int/2addr v0, p1

    iput v0, p0, Lcom/qihoo/security/engine/b/d;->f:I

    return-void
.end method

.method public d()V
    .locals 4

    const-wide/16 v2, 0x0

    const/4 v1, 0x0

    iput-boolean v1, p0, Lcom/qihoo/security/engine/b/d;->n:Z

    iput-boolean v1, p0, Lcom/qihoo/security/engine/b/d;->o:Z

    iput-boolean v1, p0, Lcom/qihoo/security/engine/b/d;->p:Z

    iget-object v0, p0, Lcom/qihoo/security/engine/b/d;->c:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    iput v1, p0, Lcom/qihoo/security/engine/b/d;->i:I

    iput-wide v2, p0, Lcom/qihoo/security/engine/b/d;->h:J

    iput-wide v2, p0, Lcom/qihoo/security/engine/b/d;->g:J

    const/4 v0, -0x1

    iput v0, p0, Lcom/qihoo/security/engine/b/d;->e:I

    iput v1, p0, Lcom/qihoo/security/engine/b/d;->f:I

    iget-object v0, p0, Lcom/qihoo/security/engine/b/d;->l:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->clear()V

    iget-object v0, p0, Lcom/qihoo/security/engine/b/d;->m:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->clear()V

    iget-object v0, p0, Lcom/qihoo/security/engine/b/d;->j:Landroid/os/Handler;

    iget-object v1, p0, Lcom/qihoo/security/engine/b/d;->k:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    return-void
.end method

.method public e()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/qihoo/security/engine/b/d;->p:Z

    return-void
.end method

.method public f()V
    .locals 2

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/qihoo/security/engine/b/d;->p:Z

    iget-object v0, p0, Lcom/qihoo/security/engine/b/d;->j:Landroid/os/Handler;

    iget-object v1, p0, Lcom/qihoo/security/engine/b/d;->k:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public g()I
    .locals 8

    const-wide/16 v6, 0x0

    iget v0, p0, Lcom/qihoo/security/engine/b/d;->e:I

    if-nez v0, :cond_1

    iget v0, p0, Lcom/qihoo/security/engine/b/d;->f:I

    if-nez v0, :cond_1

    const/16 v0, 0x64

    :goto_0
    iget v1, p0, Lcom/qihoo/security/engine/b/d;->i:I

    if-ge v1, v0, :cond_0

    iput v0, p0, Lcom/qihoo/security/engine/b/d;->i:I

    :cond_0
    iget v0, p0, Lcom/qihoo/security/engine/b/d;->i:I

    return v0

    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/engine/b/d;->c:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    invoke-virtual {p0}, Lcom/qihoo/security/engine/b/d;->i()I

    move-result v1

    sub-int v0, v1, v0

    int-to-long v2, v0

    iget-wide v0, p0, Lcom/qihoo/security/engine/b/d;->g:J

    cmp-long v0, v0, v6

    if-lez v0, :cond_2

    iget-wide v0, p0, Lcom/qihoo/security/engine/b/d;->g:J

    :goto_1
    mul-long/2addr v0, v2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iget-wide v4, p0, Lcom/qihoo/security/engine/b/d;->h:J

    sub-long/2addr v2, v4

    add-long/2addr v0, v2

    cmp-long v4, v0, v6

    if-lez v4, :cond_3

    const-wide/16 v4, 0x64

    mul-long/2addr v2, v4

    div-long v0, v2, v0

    long-to-int v0, v0

    goto :goto_0

    :cond_2
    const-wide/16 v0, 0xc8

    goto :goto_1

    :cond_3
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public h()I
    .locals 1

    iget-object v0, p0, Lcom/qihoo/security/engine/b/d;->c:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    return v0
.end method

.method public i()I
    .locals 2

    iget v0, p0, Lcom/qihoo/security/engine/b/d;->e:I

    if-ltz v0, :cond_0

    iget v0, p0, Lcom/qihoo/security/engine/b/d;->e:I

    iget v1, p0, Lcom/qihoo/security/engine/b/d;->f:I

    add-int/2addr v0, v1

    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/engine/b/d;->c:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    shr-int/lit8 v1, v0, 0x2

    add-int/2addr v0, v1

    iget v1, p0, Lcom/qihoo/security/engine/b/d;->q:I

    if-ge v1, v0, :cond_1

    iget v0, p0, Lcom/qihoo/security/engine/b/d;->q:I

    iget v1, p0, Lcom/qihoo/security/engine/b/d;->q:I

    shr-int/lit8 v1, v1, 0x2

    add-int/2addr v0, v1

    iput v0, p0, Lcom/qihoo/security/engine/b/d;->q:I

    :cond_1
    iget v0, p0, Lcom/qihoo/security/engine/b/d;->q:I

    goto :goto_0
.end method
