.class public Lcom/facebook/abtest/qe/d/a;
.super Ljava/lang/Object;
.source "QuickExperimentInfoAdapter.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<CONFIG:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation

.annotation build Ljavax/annotation/concurrent/ThreadSafe;
.end annotation


# instance fields
.field private final a:Lcom/facebook/abtest/qe/b/a;

.field private final b:Lcom/facebook/abtest/qe/e/a;

.field private final c:Ljava/lang/String;

.field private final d:Lcom/facebook/abtest/qe/d/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/facebook/abtest/qe/d/c",
            "<TCONFIG;>;"
        }
    .end annotation
.end field

.field private e:Lcom/facebook/abtest/qe/data/QuickExperimentInfo;

.field private f:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TCONFIG;"
        }
    .end annotation
.end field

.field private g:Lcom/facebook/abtest/qe/b/f;

.field private h:Z

.field private i:Lcom/facebook/abtest/qe/d/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/facebook/abtest/qe/d/d",
            "<TCONFIG;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/facebook/abtest/qe/b/a;Lcom/facebook/abtest/qe/e/a;Ljava/lang/String;Lcom/facebook/abtest/qe/d/c;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/abtest/qe/b/a;",
            "Lcom/facebook/abtest/qe/e/a;",
            "Ljava/lang/String;",
            "Lcom/facebook/abtest/qe/d/c",
            "<TCONFIG;>;)V"
        }
    .end annotation

    .prologue
    .line 61
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 62
    invoke-static {p1}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/abtest/qe/b/a;

    iput-object v0, p0, Lcom/facebook/abtest/qe/d/a;->a:Lcom/facebook/abtest/qe/b/a;

    .line 63
    invoke-static {p2}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/abtest/qe/e/a;

    iput-object v0, p0, Lcom/facebook/abtest/qe/d/a;->b:Lcom/facebook/abtest/qe/e/a;

    .line 64
    invoke-static {p3}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/facebook/abtest/qe/d/a;->c:Ljava/lang/String;

    .line 65
    invoke-static {p4}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/abtest/qe/d/c;

    iput-object v0, p0, Lcom/facebook/abtest/qe/d/a;->d:Lcom/facebook/abtest/qe/d/c;

    .line 67
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/abtest/qe/d/a;->h:Z

    .line 68
    new-instance v0, Lcom/facebook/abtest/qe/d/b;

    invoke-direct {v0, p0}, Lcom/facebook/abtest/qe/d/b;-><init>(Lcom/facebook/abtest/qe/d/a;)V

    iput-object v0, p0, Lcom/facebook/abtest/qe/d/a;->g:Lcom/facebook/abtest/qe/b/f;

    .line 82
    iget-object v0, p0, Lcom/facebook/abtest/qe/d/a;->a:Lcom/facebook/abtest/qe/b/a;

    iget-object v1, p0, Lcom/facebook/abtest/qe/d/a;->g:Lcom/facebook/abtest/qe/b/f;

    invoke-virtual {v0, v1}, Lcom/facebook/abtest/qe/b/a;->a(Lcom/facebook/abtest/qe/b/f;)V

    .line 83
    return-void
.end method

.method private declared-synchronized a(Lcom/facebook/abtest/qe/data/QuickExperimentInfo;)V
    .locals 1

    .prologue
    .line 195
    monitor-enter p0

    :try_start_0
    iput-object p1, p0, Lcom/facebook/abtest/qe/d/a;->e:Lcom/facebook/abtest/qe/data/QuickExperimentInfo;

    .line 196
    iget-object v0, p0, Lcom/facebook/abtest/qe/d/a;->d:Lcom/facebook/abtest/qe/d/c;

    invoke-interface {v0, p1}, Lcom/facebook/abtest/qe/d/c;->a(Lcom/facebook/abtest/qe/data/QuickExperimentInfo;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/abtest/qe/d/a;->f:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 197
    monitor-exit p0

    return-void

    .line 195
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method static synthetic a(Lcom/facebook/abtest/qe/d/a;)Z
    .locals 1

    .prologue
    .line 24
    iget-boolean v0, p0, Lcom/facebook/abtest/qe/d/a;->h:Z

    return v0
.end method

.method static synthetic b(Lcom/facebook/abtest/qe/d/a;)V
    .locals 0

    .prologue
    .line 24
    invoke-direct {p0}, Lcom/facebook/abtest/qe/d/a;->f()V

    return-void
.end method

.method private f()V
    .locals 2

    .prologue
    .line 118
    invoke-direct {p0}, Lcom/facebook/abtest/qe/d/a;->i()Lcom/facebook/abtest/qe/data/QuickExperimentInfo;

    move-result-object v0

    .line 119
    iget-object v1, p0, Lcom/facebook/abtest/qe/d/a;->e:Lcom/facebook/abtest/qe/data/QuickExperimentInfo;

    invoke-static {v0, v1}, Lcom/facebook/abtest/qe/data/QuickExperimentInfo;->a(Lcom/facebook/abtest/qe/data/QuickExperimentInfo;Lcom/facebook/abtest/qe/data/QuickExperimentInfo;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 120
    invoke-direct {p0, v0}, Lcom/facebook/abtest/qe/d/a;->a(Lcom/facebook/abtest/qe/data/QuickExperimentInfo;)V

    .line 127
    iget-object v0, p0, Lcom/facebook/abtest/qe/d/a;->i:Lcom/facebook/abtest/qe/d/d;

    if-eqz v0, :cond_0

    .line 128
    iget-object v0, p0, Lcom/facebook/abtest/qe/d/a;->i:Lcom/facebook/abtest/qe/d/d;

    iget-object v1, p0, Lcom/facebook/abtest/qe/d/a;->f:Ljava/lang/Object;

    invoke-interface {v0, v1}, Lcom/facebook/abtest/qe/d/d;->a(Ljava/lang/Object;)V

    .line 131
    :cond_0
    return-void
.end method

.method private g()V
    .locals 1

    .prologue
    .line 137
    iget-object v0, p0, Lcom/facebook/abtest/qe/d/a;->e:Lcom/facebook/abtest/qe/data/QuickExperimentInfo;

    if-nez v0, :cond_0

    .line 138
    invoke-direct {p0}, Lcom/facebook/abtest/qe/d/a;->i()Lcom/facebook/abtest/qe/data/QuickExperimentInfo;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/facebook/abtest/qe/d/a;->a(Lcom/facebook/abtest/qe/data/QuickExperimentInfo;)V

    .line 140
    :cond_0
    return-void
.end method

.method private h()Z
    .locals 1

    .prologue
    .line 164
    iget-boolean v0, p0, Lcom/facebook/abtest/qe/d/a;->h:Z

    return v0
.end method

.method private i()Lcom/facebook/abtest/qe/data/QuickExperimentInfo;
    .locals 2

    .prologue
    .line 191
    iget-object v0, p0, Lcom/facebook/abtest/qe/d/a;->a:Lcom/facebook/abtest/qe/b/a;

    iget-object v1, p0, Lcom/facebook/abtest/qe/d/a;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/facebook/abtest/qe/b/a;->a(Ljava/lang/String;)Lcom/facebook/abtest/qe/data/QuickExperimentInfo;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/abtest/qe/data/QuickExperimentInfo;

    return-object v0
.end method


# virtual methods
.method public declared-synchronized a()Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TCONFIG;"
        }
    .end annotation

    .prologue
    .line 90
    monitor-enter p0

    :try_start_0
    invoke-direct {p0}, Lcom/facebook/abtest/qe/d/a;->h()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    const-string v1, "Shall not force to refresh the adapter when auto-refresh is enabled."

    invoke-static {v0, v1}, Lcom/google/common/base/Preconditions;->checkState(ZLjava/lang/Object;)V

    .line 94
    invoke-direct {p0}, Lcom/facebook/abtest/qe/d/a;->f()V

    .line 95
    iget-object v0, p0, Lcom/facebook/abtest/qe/d/a;->f:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    .line 90
    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized a(Lcom/facebook/abtest/qe/d/d;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/abtest/qe/d/d",
            "<TCONFIG;>;)V"
        }
    .end annotation

    .prologue
    .line 172
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/abtest/qe/d/a;->i:Lcom/facebook/abtest/qe/d/d;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    const-string v1, "Only one observer is allowed for an adapter."

    invoke-static {v0, v1}, Lcom/google/common/base/Preconditions;->checkState(ZLjava/lang/Object;)V

    .line 173
    iput-object p1, p0, Lcom/facebook/abtest/qe/d/a;->i:Lcom/facebook/abtest/qe/d/d;

    .line 176
    invoke-virtual {p0}, Lcom/facebook/abtest/qe/d/a;->b()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/facebook/abtest/qe/d/d;->a(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 177
    monitor-exit p0

    return-void

    .line 172
    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public a(Ljava/lang/String;Lcom/fasterxml/jackson/databind/JsonNode;)V
    .locals 2

    .prologue
    .line 147
    iget-object v0, p0, Lcom/facebook/abtest/qe/d/a;->b:Lcom/facebook/abtest/qe/e/a;

    invoke-virtual {p0}, Lcom/facebook/abtest/qe/d/a;->c()Lcom/facebook/abtest/qe/data/QuickExperimentInfo;

    move-result-object v1

    invoke-virtual {v0, v1, p1, p2}, Lcom/facebook/abtest/qe/e/a;->a(Lcom/facebook/abtest/qe/data/QuickExperimentInfo;Ljava/lang/String;Lcom/fasterxml/jackson/databind/JsonNode;)V

    .line 148
    return-void
.end method

.method public declared-synchronized b()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TCONFIG;"
        }
    .end annotation

    .prologue
    .line 102
    monitor-enter p0

    :try_start_0
    invoke-direct {p0}, Lcom/facebook/abtest/qe/d/a;->g()V

    .line 103
    iget-object v0, p0, Lcom/facebook/abtest/qe/d/a;->f:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    .line 102
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized c()Lcom/facebook/abtest/qe/data/QuickExperimentInfo;
    .locals 1

    .prologue
    .line 110
    monitor-enter p0

    :try_start_0
    invoke-direct {p0}, Lcom/facebook/abtest/qe/d/a;->g()V

    .line 111
    iget-object v0, p0, Lcom/facebook/abtest/qe/d/a;->e:Lcom/facebook/abtest/qe/data/QuickExperimentInfo;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    .line 110
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public d()V
    .locals 2

    .prologue
    .line 143
    const-string v0, "ConfigLoaderDefaultExposureContext"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/facebook/abtest/qe/d/a;->a(Ljava/lang/String;Lcom/fasterxml/jackson/databind/JsonNode;)V

    .line 144
    return-void
.end method

.method public declared-synchronized e()V
    .locals 1

    .prologue
    .line 160
    monitor-enter p0

    const/4 v0, 0x1

    :try_start_0
    iput-boolean v0, p0, Lcom/facebook/abtest/qe/d/a;->h:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 161
    monitor-exit p0

    return-void

    .line 160
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
