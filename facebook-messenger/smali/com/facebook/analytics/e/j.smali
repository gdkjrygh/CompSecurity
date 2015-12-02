.class Lcom/facebook/analytics/e/j;
.super Ljava/lang/Object;
.source "PerformanceMarker.java"


# annotations
.annotation build Ljavax/annotation/concurrent/ThreadSafe;
.end annotation


# instance fields
.field final a:Ljava/lang/String;

.field final b:Ljava/lang/String;

.field private c:D
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation
.end field

.field private d:J
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation
.end field

.field private e:Lcom/google/common/a/fi;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/fi",
            "<",
            "Ljava/lang/Class",
            "<*>;>;"
        }
    .end annotation

    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation
.end field

.field private f:Z
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 83
    invoke-static {}, Lcom/facebook/common/h/a;->a()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    const-wide/16 v1, 0x0

    invoke-direct {p0, p1, v0, v1, v2}, Lcom/facebook/analytics/e/j;-><init>(Ljava/lang/String;Ljava/lang/String;J)V

    .line 84
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;J)V
    .locals 2

    .prologue
    .line 59
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 60
    invoke-static {p1}, Lcom/facebook/debug/b/a;->a(Ljava/lang/Object;)V

    .line 61
    invoke-static {p2}, Lcom/facebook/debug/b/a;->a(Ljava/lang/Object;)V

    .line 62
    iput-object p1, p0, Lcom/facebook/analytics/e/j;->a:Ljava/lang/String;

    .line 63
    iput-object p2, p0, Lcom/facebook/analytics/e/j;->b:Ljava/lang/String;

    .line 64
    long-to-double v0, p3

    iput-wide v0, p0, Lcom/facebook/analytics/e/j;->c:D

    .line 65
    return-void
.end method


# virtual methods
.method public declared-synchronized a()D
    .locals 2

    .prologue
    .line 115
    monitor-enter p0

    :try_start_0
    iget-wide v0, p0, Lcom/facebook/analytics/e/j;->c:D
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-wide v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized a(D)V
    .locals 1

    .prologue
    .line 130
    monitor-enter p0

    :try_start_0
    iput-wide p1, p0, Lcom/facebook/analytics/e/j;->c:D
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 131
    monitor-exit p0

    return-void

    .line 130
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized a(J)V
    .locals 1

    .prologue
    .line 146
    monitor-enter p0

    :try_start_0
    iput-wide p1, p0, Lcom/facebook/analytics/e/j;->d:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 147
    monitor-exit p0

    return-void

    .line 146
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized a(Ljava/util/Set;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/Class",
            "<*>;>;)V"
        }
    .end annotation

    .prologue
    .line 154
    monitor-enter p0

    if-eqz p1, :cond_0

    .line 155
    :try_start_0
    invoke-static {p1}, Lcom/google/common/a/fi;->a(Ljava/util/Collection;)Lcom/google/common/a/fi;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/analytics/e/j;->e:Lcom/google/common/a/fi;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 159
    :goto_0
    monitor-exit p0

    return-void

    .line 157
    :cond_0
    const/4 v0, 0x0

    :try_start_1
    iput-object v0, p0, Lcom/facebook/analytics/e/j;->e:Lcom/google/common/a/fi;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 154
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized b()J
    .locals 2

    .prologue
    .line 138
    monitor-enter p0

    :try_start_0
    iget-wide v0, p0, Lcom/facebook/analytics/e/j;->d:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-wide v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public c()V
    .locals 1

    .prologue
    .line 181
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/analytics/e/j;->f:Z

    .line 182
    return-void
.end method

.method public d()Z
    .locals 1

    .prologue
    .line 195
    iget-boolean v0, p0, Lcom/facebook/analytics/e/j;->f:Z

    return v0
.end method
