.class public abstract Lcom/facebook/common/d/a;
.super Ljava/lang/Object;
.source "AbstractListenableDisposable.java"

# interfaces
.implements Lcom/facebook/common/d/e;


# annotations
.annotation build Ljavax/annotation/concurrent/ThreadSafe;
.end annotation


# instance fields
.field private a:Z

.field private b:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Lcom/facebook/common/d/d;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/common/d/a;->a:Z

    .line 22
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/common/d/a;->b:Ljava/util/Set;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .prologue
    .line 26
    monitor-enter p0

    .line 28
    :try_start_0
    invoke-virtual {p0}, Lcom/facebook/common/d/a;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 29
    monitor-exit p0

    .line 49
    :cond_0
    :goto_0
    return-void

    .line 33
    :cond_1
    invoke-virtual {p0}, Lcom/facebook/common/d/a;->b()V

    .line 34
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/common/d/a;->a:Z

    .line 35
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    iget-object v0, p0, Lcom/facebook/common/d/a;->b:Ljava/util/Set;

    if-eqz v0, :cond_0

    .line 44
    iget-object v0, p0, Lcom/facebook/common/d/a;->b:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/common/d/d;

    .line 45
    invoke-interface {v0, p0}, Lcom/facebook/common/d/d;->a(Lcom/facebook/common/d/e;)V

    goto :goto_1

    .line 35
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    .line 47
    :cond_2
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/common/d/a;->b:Ljava/util/Set;

    goto :goto_0
.end method

.method public final a(Lcom/facebook/common/d/d;)V
    .locals 2

    .prologue
    .line 68
    const/4 v0, 0x0

    .line 69
    monitor-enter p0

    .line 70
    :try_start_0
    invoke-virtual {p0}, Lcom/facebook/common/d/a;->c()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 71
    const/4 v0, 0x1

    .line 78
    :goto_0
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 82
    if-eqz v0, :cond_0

    .line 83
    invoke-interface {p1, p0}, Lcom/facebook/common/d/d;->a(Lcom/facebook/common/d/e;)V

    .line 85
    :cond_0
    return-void

    .line 73
    :cond_1
    :try_start_1
    iget-object v1, p0, Lcom/facebook/common/d/a;->b:Ljava/util/Set;

    if-nez v1, :cond_2

    .line 74
    invoke-static {}, Lcom/google/common/a/kl;->a()Ljava/util/HashSet;

    move-result-object v1

    iput-object v1, p0, Lcom/facebook/common/d/a;->b:Ljava/util/Set;

    .line 76
    :cond_2
    iget-object v1, p0, Lcom/facebook/common/d/a;->b:Ljava/util/Set;

    invoke-interface {v1, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 78
    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method protected abstract b()V
.end method

.method public final declared-synchronized c()Z
    .locals 1

    .prologue
    .line 61
    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/facebook/common/d/a;->a:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
