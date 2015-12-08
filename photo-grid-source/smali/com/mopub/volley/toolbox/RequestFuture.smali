.class public Lcom/mopub/volley/toolbox/RequestFuture;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/mopub/volley/Response$ErrorListener;
.implements Lcom/mopub/volley/Response$Listener;
.implements Ljava/util/concurrent/Future;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/mopub/volley/Response$ErrorListener;",
        "Lcom/mopub/volley/Response$Listener",
        "<TT;>;",
        "Ljava/util/concurrent/Future",
        "<TT;>;"
    }
.end annotation


# instance fields
.field private a:Lcom/mopub/volley/Request;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/mopub/volley/Request",
            "<*>;"
        }
    .end annotation
.end field

.field private b:Z

.field private c:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field private d:Lcom/mopub/volley/VolleyError;


# direct methods
.method private constructor <init>()V
    .locals 1

    .prologue
    .line 65
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 57
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/mopub/volley/toolbox/RequestFuture;->b:Z

    .line 65
    return-void
.end method

.method private declared-synchronized a(Ljava/lang/Long;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Long;",
            ")TT;"
        }
    .end annotation

    .prologue
    const-wide/16 v2, 0x0

    .line 102
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/mopub/volley/toolbox/RequestFuture;->d:Lcom/mopub/volley/VolleyError;

    if-eqz v0, :cond_0

    .line 103
    new-instance v0, Ljava/util/concurrent/ExecutionException;

    iget-object v1, p0, Lcom/mopub/volley/toolbox/RequestFuture;->d:Lcom/mopub/volley/VolleyError;

    invoke-direct {v0, v1}, Ljava/util/concurrent/ExecutionException;-><init>(Ljava/lang/Throwable;)V

    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 102
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 106
    :cond_0
    :try_start_1
    iget-boolean v0, p0, Lcom/mopub/volley/toolbox/RequestFuture;->b:Z

    if-eqz v0, :cond_1

    .line 107
    iget-object v0, p0, Lcom/mopub/volley/toolbox/RequestFuture;->c:Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 124
    :goto_0
    monitor-exit p0

    return-object v0

    .line 110
    :cond_1
    if-nez p1, :cond_3

    .line 111
    const-wide/16 v0, 0x0

    :try_start_2
    invoke-virtual {p0, v0, v1}, Ljava/lang/Object;->wait(J)V

    .line 116
    :cond_2
    :goto_1
    iget-object v0, p0, Lcom/mopub/volley/toolbox/RequestFuture;->d:Lcom/mopub/volley/VolleyError;

    if-eqz v0, :cond_4

    .line 117
    new-instance v0, Ljava/util/concurrent/ExecutionException;

    iget-object v1, p0, Lcom/mopub/volley/toolbox/RequestFuture;->d:Lcom/mopub/volley/VolleyError;

    invoke-direct {v0, v1}, Ljava/util/concurrent/ExecutionException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    .line 112
    :cond_3
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    cmp-long v0, v0, v2

    if-lez v0, :cond_2

    .line 113
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Ljava/lang/Object;->wait(J)V

    goto :goto_1

    .line 120
    :cond_4
    iget-boolean v0, p0, Lcom/mopub/volley/toolbox/RequestFuture;->b:Z

    if-nez v0, :cond_5

    .line 121
    new-instance v0, Ljava/util/concurrent/TimeoutException;

    invoke-direct {v0}, Ljava/util/concurrent/TimeoutException;-><init>()V

    throw v0

    .line 124
    :cond_5
    iget-object v0, p0, Lcom/mopub/volley/toolbox/RequestFuture;->c:Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0
.end method

.method public static newFuture()Lcom/mopub/volley/toolbox/RequestFuture;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">()",
            "Lcom/mopub/volley/toolbox/RequestFuture",
            "<TE;>;"
        }
    .end annotation

    .prologue
    .line 62
    new-instance v0, Lcom/mopub/volley/toolbox/RequestFuture;

    invoke-direct {v0}, Lcom/mopub/volley/toolbox/RequestFuture;-><init>()V

    return-object v0
.end method


# virtual methods
.method public declared-synchronized cancel(Z)Z
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 73
    monitor-enter p0

    :try_start_0
    iget-object v1, p0, Lcom/mopub/volley/toolbox/RequestFuture;->a:Lcom/mopub/volley/Request;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v1, :cond_1

    .line 81
    :cond_0
    :goto_0
    monitor-exit p0

    return v0

    .line 77
    :cond_1
    :try_start_1
    invoke-virtual {p0}, Lcom/mopub/volley/toolbox/RequestFuture;->isDone()Z

    move-result v1

    if-nez v1, :cond_0

    .line 78
    iget-object v0, p0, Lcom/mopub/volley/toolbox/RequestFuture;->a:Lcom/mopub/volley/Request;

    invoke-virtual {v0}, Lcom/mopub/volley/Request;->cancel()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 79
    const/4 v0, 0x1

    goto :goto_0

    .line 73
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public get()Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .prologue
    .line 88
    const/4 v0, 0x0

    :try_start_0
    invoke-direct {p0, v0}, Lcom/mopub/volley/toolbox/RequestFuture;->a(Ljava/lang/Long;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 89
    :catch_0
    move-exception v0

    .line 90
    new-instance v1, Ljava/lang/AssertionError;

    invoke-direct {v1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v1
.end method

.method public get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/util/concurrent/TimeUnit;",
            ")TT;"
        }
    .end annotation

    .prologue
    .line 97
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, p1, p2, p3}, Ljava/util/concurrent/TimeUnit;->convert(JLjava/util/concurrent/TimeUnit;)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/mopub/volley/toolbox/RequestFuture;->a(Ljava/lang/Long;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public isCancelled()Z
    .locals 1

    .prologue
    .line 129
    iget-object v0, p0, Lcom/mopub/volley/toolbox/RequestFuture;->a:Lcom/mopub/volley/Request;

    if-nez v0, :cond_0

    .line 130
    const/4 v0, 0x0

    .line 132
    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/mopub/volley/toolbox/RequestFuture;->a:Lcom/mopub/volley/Request;

    invoke-virtual {v0}, Lcom/mopub/volley/Request;->isCanceled()Z

    move-result v0

    goto :goto_0
.end method

.method public declared-synchronized isDone()Z
    .locals 1

    .prologue
    .line 137
    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/mopub/volley/toolbox/RequestFuture;->b:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/mopub/volley/toolbox/RequestFuture;->d:Lcom/mopub/volley/VolleyError;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/mopub/volley/toolbox/RequestFuture;->isCancelled()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    monitor-exit p0

    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized onErrorResponse(Lcom/mopub/volley/VolleyError;)V
    .locals 1

    .prologue
    .line 149
    monitor-enter p0

    :try_start_0
    iput-object p1, p0, Lcom/mopub/volley/toolbox/RequestFuture;->d:Lcom/mopub/volley/VolleyError;

    .line 150
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 151
    monitor-exit p0

    return-void

    .line 149
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized onResponse(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .prologue
    .line 142
    monitor-enter p0

    const/4 v0, 0x1

    :try_start_0
    iput-boolean v0, p0, Lcom/mopub/volley/toolbox/RequestFuture;->b:Z

    .line 143
    iput-object p1, p0, Lcom/mopub/volley/toolbox/RequestFuture;->c:Ljava/lang/Object;

    .line 144
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 145
    monitor-exit p0

    return-void

    .line 142
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public setRequest(Lcom/mopub/volley/Request;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/mopub/volley/Request",
            "<*>;)V"
        }
    .end annotation

    .prologue
    .line 68
    iput-object p1, p0, Lcom/mopub/volley/toolbox/RequestFuture;->a:Lcom/mopub/volley/Request;

    .line 69
    return-void
.end method
