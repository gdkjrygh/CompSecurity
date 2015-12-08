.class public final Lcom/kik/d/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field a:Ljava/lang/String;

.field final b:Ljava/io/File;

.field final c:Ljava/util/concurrent/ExecutorService;

.field final d:I


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/io/File;)V
    .locals 1

    .prologue
    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-object p1, p0, Lcom/kik/d/c;->a:Ljava/lang/String;

    .line 19
    iput-object p2, p0, Lcom/kik/d/c;->b:Ljava/io/File;

    .line 20
    const/16 v0, 0x19

    iput v0, p0, Lcom/kik/d/c;->d:I

    .line 22
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/kik/d/c;->c:Ljava/util/concurrent/ExecutorService;

    .line 23
    return-void
.end method


# virtual methods
.method public final declared-synchronized a()V
    .locals 4

    .prologue
    .line 33
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/kik/d/c;->c:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/kik/d/d;

    iget-object v2, p0, Lcom/kik/d/c;->b:Ljava/io/File;

    iget v3, p0, Lcom/kik/d/c;->d:I

    invoke-direct {v1, v2, v3}, Lcom/kik/d/d;-><init>(Ljava/io/File;I)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 34
    iget-object v0, p0, Lcom/kik/d/c;->c:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/kik/d/e;

    iget-object v2, p0, Lcom/kik/d/c;->a:Ljava/lang/String;

    iget-object v3, p0, Lcom/kik/d/c;->b:Ljava/io/File;

    invoke-direct {v1, v2, v3}, Lcom/kik/d/e;-><init>(Ljava/lang/String;Ljava/io/File;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    monitor-exit p0

    return-void

    .line 33
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized a(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 27
    monitor-enter p0

    :try_start_0
    iput-object p1, p0, Lcom/kik/d/c;->a:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    monitor-exit p0

    return-void

    .line 27
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
