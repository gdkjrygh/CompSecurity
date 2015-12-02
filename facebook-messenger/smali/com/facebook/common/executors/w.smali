.class public Lcom/facebook/common/executors/w;
.super Ljava/lang/Object;
.source "PrioritySerialExecutorImpl.java"

# interfaces
.implements Lcom/facebook/common/executors/u;


# static fields
.field private static final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# instance fields
.field private final b:Ljava/util/concurrent/Executor;

.field private final c:[Ljava/util/Queue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ljava/util/Queue",
            "<",
            "Ljava/lang/Runnable;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Lcom/facebook/common/executors/y;

.field private e:Z

.field private f:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 16
    const-class v0, Lcom/facebook/common/executors/w;

    sput-object v0, Lcom/facebook/common/executors/w;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Ljava/util/concurrent/Executor;)V
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    new-instance v1, Lcom/facebook/common/executors/y;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/facebook/common/executors/y;-><init>(Lcom/facebook/common/executors/w;Lcom/facebook/common/executors/x;)V

    iput-object v1, p0, Lcom/facebook/common/executors/w;->d:Lcom/facebook/common/executors/y;

    .line 21
    iput-boolean v0, p0, Lcom/facebook/common/executors/w;->e:Z

    .line 25
    iput-object p1, p0, Lcom/facebook/common/executors/w;->b:Ljava/util/concurrent/Executor;

    .line 26
    invoke-static {}, Lcom/facebook/common/executors/v;->values()[Lcom/facebook/common/executors/v;

    move-result-object v1

    array-length v1, v1

    .line 27
    new-array v2, v1, [Ljava/util/Queue;

    iput-object v2, p0, Lcom/facebook/common/executors/w;->c:[Ljava/util/Queue;

    .line 28
    :goto_0
    if-ge v0, v1, :cond_0

    .line 29
    iget-object v2, p0, Lcom/facebook/common/executors/w;->c:[Ljava/util/Queue;

    invoke-static {}, Lcom/google/common/a/hq;->b()Ljava/util/LinkedList;

    move-result-object v3

    aput-object v3, v2, v0

    .line 28
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 31
    :cond_0
    iput v1, p0, Lcom/facebook/common/executors/w;->f:I

    .line 32
    return-void
.end method

.method static synthetic a(Lcom/facebook/common/executors/w;)Ljava/lang/Runnable;
    .locals 1

    .prologue
    .line 14
    invoke-direct {p0}, Lcom/facebook/common/executors/w;->b()Ljava/lang/Runnable;

    move-result-object v0

    return-object v0
.end method

.method static synthetic a(Lcom/facebook/common/executors/w;Z)Z
    .locals 0

    .prologue
    .line 14
    iput-boolean p1, p0, Lcom/facebook/common/executors/w;->e:Z

    return p1
.end method

.method private declared-synchronized b()Ljava/lang/Runnable;
    .locals 2

    .prologue
    .line 70
    monitor-enter p0

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    :try_start_0
    iget v0, p0, Lcom/facebook/common/executors/w;->f:I

    if-ge v1, v0, :cond_1

    .line 71
    iget-object v0, p0, Lcom/facebook/common/executors/w;->c:[Ljava/util/Queue;

    aget-object v0, v0, v1

    invoke-interface {v0}, Ljava/util/Queue;->poll()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Runnable;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 72
    if-eqz v0, :cond_0

    .line 76
    :goto_1
    monitor-exit p0

    return-object v0

    .line 70
    :cond_0
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 76
    :cond_1
    const/4 v0, 0x0

    goto :goto_1

    .line 70
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method static synthetic b(Lcom/facebook/common/executors/w;)Ljava/util/concurrent/Executor;
    .locals 1

    .prologue
    .line 14
    iget-object v0, p0, Lcom/facebook/common/executors/w;->b:Ljava/util/concurrent/Executor;

    return-object v0
.end method

.method private declared-synchronized c()V
    .locals 2

    .prologue
    .line 80
    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/facebook/common/executors/w;->e:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/facebook/common/executors/w;->a()Z

    move-result v0

    if-nez v0, :cond_0

    .line 81
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/common/executors/w;->e:Z

    .line 82
    iget-object v0, p0, Lcom/facebook/common/executors/w;->b:Ljava/util/concurrent/Executor;

    iget-object v1, p0, Lcom/facebook/common/executors/w;->d:Lcom/facebook/common/executors/y;

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 84
    :cond_0
    monitor-exit p0

    return-void

    .line 80
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method


# virtual methods
.method public declared-synchronized a(Ljava/lang/Runnable;Lcom/facebook/common/executors/v;)V
    .locals 2

    .prologue
    .line 41
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/common/executors/w;->c:[Ljava/util/Queue;

    invoke-virtual {p2}, Lcom/facebook/common/executors/v;->ordinal()I

    move-result v1

    aget-object v0, v0, v1

    invoke-interface {v0, p1}, Ljava/util/Queue;->offer(Ljava/lang/Object;)Z

    .line 42
    invoke-direct {p0}, Lcom/facebook/common/executors/w;->c()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    monitor-exit p0

    return-void

    .line 41
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized a()Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 61
    monitor-enter p0

    move v1, v0

    :goto_0
    :try_start_0
    iget v2, p0, Lcom/facebook/common/executors/w;->f:I

    if-ge v1, v2, :cond_1

    .line 62
    iget-object v2, p0, Lcom/facebook/common/executors/w;->c:[Ljava/util/Queue;

    aget-object v2, v2, v1

    invoke-interface {v2}, Ljava/util/Queue;->isEmpty()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v2

    if-nez v2, :cond_0

    .line 66
    :goto_1
    monitor-exit p0

    return v0

    .line 61
    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 66
    :cond_1
    const/4 v0, 0x1

    goto :goto_1

    .line 61
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized execute(Ljava/lang/Runnable;)V
    .locals 1

    .prologue
    .line 36
    monitor-enter p0

    :try_start_0
    sget-object v0, Lcom/facebook/common/executors/v;->NORMAL:Lcom/facebook/common/executors/v;

    invoke-virtual {p0, p1, v0}, Lcom/facebook/common/executors/w;->a(Ljava/lang/Runnable;Lcom/facebook/common/executors/v;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    monitor-exit p0

    return-void

    .line 36
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
