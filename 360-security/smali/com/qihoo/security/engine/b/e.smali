.class public Lcom/qihoo/security/engine/b/e;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo/security/engine/b/e$a;,
        Lcom/qihoo/security/engine/b/e$b;
    }
.end annotation


# static fields
.field private static final e:[B

.field private static final f:Ljava/util/concurrent/ThreadFactory;


# instance fields
.field volatile a:Z

.field volatile b:Z

.field c:Ljava/util/concurrent/atomic/AtomicInteger;

.field final d:Lcom/qihoo/security/engine/b/e$a;

.field private g:Lcom/qihoo/security/engine/b/e$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [B

    sput-object v0, Lcom/qihoo/security/engine/b/e;->e:[B

    new-instance v0, Lcom/qihoo/security/engine/b/e$1;

    invoke-direct {v0}, Lcom/qihoo/security/engine/b/e$1;-><init>()V

    sput-object v0, Lcom/qihoo/security/engine/b/e;->f:Ljava/util/concurrent/ThreadFactory;

    return-void
.end method

.method public constructor <init>(Lcom/qihoo/security/engine/b/e$a;)V
    .locals 2

    const/4 v1, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean v1, p0, Lcom/qihoo/security/engine/b/e;->a:Z

    iput-boolean v1, p0, Lcom/qihoo/security/engine/b/e;->b:Z

    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object v0, p0, Lcom/qihoo/security/engine/b/e;->c:Ljava/util/concurrent/atomic/AtomicInteger;

    iput-object p1, p0, Lcom/qihoo/security/engine/b/e;->d:Lcom/qihoo/security/engine/b/e$a;

    new-instance v0, Lcom/qihoo/security/engine/b/e$b;

    invoke-direct {v0, p0}, Lcom/qihoo/security/engine/b/e$b;-><init>(Lcom/qihoo/security/engine/b/e;)V

    iput-object v0, p0, Lcom/qihoo/security/engine/b/e;->g:Lcom/qihoo/security/engine/b/e$b;

    return-void
.end method

.method static synthetic f()Ljava/util/concurrent/ThreadFactory;
    .locals 1

    sget-object v0, Lcom/qihoo/security/engine/b/e;->f:Ljava/util/concurrent/ThreadFactory;

    return-object v0
.end method


# virtual methods
.method a()V
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/qihoo/security/engine/b/e;->b:Z

    sget-object v1, Lcom/qihoo/security/engine/b/e;->e:[B

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/engine/b/e;->g:Lcom/qihoo/security/engine/b/e$b;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/engine/b/e;->g:Lcom/qihoo/security/engine/b/e$b;

    invoke-virtual {v0}, Lcom/qihoo/security/engine/b/e$b;->b()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/qihoo/security/engine/b/e;->g:Lcom/qihoo/security/engine/b/e$b;

    :cond_0
    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method a(Lcom/qihoo/security/engine/a;)V
    .locals 2

    iget-boolean v0, p0, Lcom/qihoo/security/engine/b/e;->b:Z

    if-eqz v0, :cond_0

    :goto_0
    return-void

    :cond_0
    sget-object v1, Lcom/qihoo/security/engine/b/e;->e:[B

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/engine/b/e;->g:Lcom/qihoo/security/engine/b/e$b;

    if-nez v0, :cond_1

    new-instance v0, Lcom/qihoo/security/engine/b/e$b;

    invoke-direct {v0, p0}, Lcom/qihoo/security/engine/b/e$b;-><init>(Lcom/qihoo/security/engine/b/e;)V

    iput-object v0, p0, Lcom/qihoo/security/engine/b/e;->g:Lcom/qihoo/security/engine/b/e$b;

    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/engine/b/e;->c:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    iget-object v0, p0, Lcom/qihoo/security/engine/b/e;->g:Lcom/qihoo/security/engine/b/e$b;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/engine/b/e$b;->execute(Ljava/lang/Runnable;)V

    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method b()V
    .locals 2

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/qihoo/security/engine/b/e;->b:Z

    iput-boolean v0, p0, Lcom/qihoo/security/engine/b/e;->a:Z

    sget-object v1, Lcom/qihoo/security/engine/b/e;->e:[B

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/engine/b/e;->g:Lcom/qihoo/security/engine/b/e$b;

    if-nez v0, :cond_0

    new-instance v0, Lcom/qihoo/security/engine/b/e$b;

    invoke-direct {v0, p0}, Lcom/qihoo/security/engine/b/e$b;-><init>(Lcom/qihoo/security/engine/b/e;)V

    iput-object v0, p0, Lcom/qihoo/security/engine/b/e;->g:Lcom/qihoo/security/engine/b/e$b;

    :cond_0
    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method c()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/qihoo/security/engine/b/e;->a:Z

    return-void
.end method

.method d()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/qihoo/security/engine/b/e;->a:Z

    return-void
.end method

.method public e()Z
    .locals 4

    const/4 v1, 0x1

    const/4 v0, 0x0

    sget-object v3, Lcom/qihoo/security/engine/b/e;->e:[B

    monitor-enter v3

    :try_start_0
    iget-object v2, p0, Lcom/qihoo/security/engine/b/e;->g:Lcom/qihoo/security/engine/b/e$b;

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/qihoo/security/engine/b/e;->g:Lcom/qihoo/security/engine/b/e$b;

    invoke-virtual {v2}, Lcom/qihoo/security/engine/b/e$b;->a()Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/qihoo/security/engine/b/e;->g:Lcom/qihoo/security/engine/b/e$b;

    invoke-virtual {v2}, Lcom/qihoo/security/engine/b/e$b;->getQueue()Ljava/util/concurrent/BlockingQueue;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/concurrent/BlockingQueue;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_2

    :cond_0
    move v2, v0

    :goto_0
    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-boolean v3, p0, Lcom/qihoo/security/engine/b/e;->b:Z

    if-nez v3, :cond_3

    iget-object v3, p0, Lcom/qihoo/security/engine/b/e;->c:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v3

    if-nez v3, :cond_1

    if-nez v2, :cond_3

    :cond_1
    :goto_1
    return v0

    :cond_2
    move v2, v1

    goto :goto_0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    :cond_3
    move v0, v1

    goto :goto_1
.end method
