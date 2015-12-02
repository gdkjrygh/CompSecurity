.class public Lcom/facebook/fbservice/service/o;
.super Ljava/lang/Object;
.source "BlueServiceQueueManager.java"


# annotations
.annotation build Ljavax/annotation/concurrent/ThreadSafe;
.end annotation


# static fields
.field private static final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field

.field private static final b:Lcom/facebook/debug/log/l;


# instance fields
.field private final c:Landroid/content/Context;

.field private final d:Lcom/facebook/fbservice/service/p;

.field private final e:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Lcom/facebook/fbservice/service/h;",
            ">;"
        }
    .end annotation
.end field

.field private f:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 34
    const-class v0, Lcom/facebook/fbservice/service/o;

    sput-object v0, Lcom/facebook/fbservice/service/o;->a:Ljava/lang/Class;

    .line 36
    new-instance v0, Lcom/facebook/debug/log/l;

    invoke-direct {v0}, Lcom/facebook/debug/log/l;-><init>()V

    sput-object v0, Lcom/facebook/fbservice/service/o;->b:Lcom/facebook/debug/log/l;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/facebook/fbservice/service/p;)V
    .locals 1

    .prologue
    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    invoke-static {}, Lcom/google/common/a/kl;->a()Ljava/util/HashSet;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/fbservice/service/o;->e:Ljava/util/Set;

    .line 47
    iput-object p1, p0, Lcom/facebook/fbservice/service/o;->c:Landroid/content/Context;

    .line 48
    iput-object p2, p0, Lcom/facebook/fbservice/service/o;->d:Lcom/facebook/fbservice/service/p;

    .line 49
    return-void
.end method

.method private c(Lcom/facebook/fbservice/service/h;)Z
    .locals 2

    .prologue
    .line 150
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/h;->a()Ljava/lang/Class;

    move-result-object v0

    const-class v1, Lcom/facebook/auth/annotations/AuthQueue;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public declared-synchronized a()V
    .locals 7

    .prologue
    .line 91
    monitor-enter p0

    const/4 v0, 0x1

    :try_start_0
    iput-boolean v0, p0, Lcom/facebook/fbservice/service/o;->f:Z

    .line 94
    sget-object v0, Lcom/facebook/fbservice/service/o;->a:Ljava/lang/Class;

    const-string v1, "Draining all BlueService instances with started queues"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->c(Ljava/lang/Class;Ljava/lang/String;)V

    .line 95
    invoke-static {}, Lcom/google/common/a/kl;->a()Ljava/util/HashSet;

    move-result-object v1

    .line 96
    iget-object v0, p0, Lcom/facebook/fbservice/service/o;->e:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/fbservice/service/h;

    .line 97
    invoke-virtual {v0}, Lcom/facebook/fbservice/service/h;->a()Ljava/lang/Class;

    move-result-object v0

    .line 98
    iget-object v3, p0, Lcom/facebook/fbservice/service/o;->d:Lcom/facebook/fbservice/service/p;

    invoke-virtual {v3, v0}, Lcom/facebook/fbservice/service/p;->a(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v0

    .line 99
    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 91
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 104
    :cond_0
    :try_start_1
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Class;

    .line 105
    sget-object v2, Lcom/facebook/fbservice/service/o;->a:Ljava/lang/Class;

    const-string v3, "Draining service %s"

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v6

    aput-object v6, v4, v5

    invoke-static {v2, v3, v4}, Lcom/facebook/debug/log/b;->c(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 106
    new-instance v2, Landroid/content/Intent;

    iget-object v3, p0, Lcom/facebook/fbservice/service/o;->c:Landroid/content/Context;

    invoke-direct {v2, v3, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 107
    const-string v0, "Orca.DRAIN"

    invoke-virtual {v2, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 108
    iget-object v0, p0, Lcom/facebook/fbservice/service/o;->c:Landroid/content/Context;

    invoke-virtual {v0, v2}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    .line 110
    :cond_1
    monitor-exit p0

    return-void
.end method

.method public declared-synchronized a(Lcom/facebook/fbservice/service/h;)V
    .locals 1

    .prologue
    .line 54
    monitor-enter p0

    :try_start_0
    invoke-direct {p0, p1}, Lcom/facebook/fbservice/service/o;->c(Lcom/facebook/fbservice/service/h;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-eqz v0, :cond_0

    .line 67
    :goto_0
    monitor-exit p0

    return-void

    .line 65
    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/facebook/fbservice/service/o;->e:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 66
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 54
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized b()V
    .locals 1

    .prologue
    .line 117
    monitor-enter p0

    const/4 v0, 0x0

    :try_start_0
    iput-boolean v0, p0, Lcom/facebook/fbservice/service/o;->f:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 118
    monitor-exit p0

    return-void

    .line 117
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized b(Lcom/facebook/fbservice/service/h;)V
    .locals 6

    .prologue
    .line 72
    monitor-enter p0

    :try_start_0
    invoke-direct {p0, p1}, Lcom/facebook/fbservice/service/o;->c(Lcom/facebook/fbservice/service/h;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-eqz v0, :cond_0

    .line 81
    :goto_0
    monitor-exit p0

    return-void

    .line 76
    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/facebook/fbservice/service/o;->e:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    move-result v0

    .line 77
    if-nez v0, :cond_1

    .line 78
    sget-object v0, Lcom/facebook/fbservice/service/o;->b:Lcom/facebook/debug/log/l;

    sget-object v1, Lcom/facebook/fbservice/service/o;->a:Ljava/lang/Class;

    const-string v2, "Unknown queue [%s]"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    invoke-virtual {p1}, Lcom/facebook/fbservice/service/h;->a()Ljava/lang/Class;

    move-result-object v5

    aput-object v5, v3, v4

    invoke-static {v0, v1, v2, v3}, Lcom/facebook/debug/log/b;->a(Lcom/facebook/debug/log/l;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 80
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 72
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized c()Z
    .locals 1

    .prologue
    .line 126
    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/facebook/fbservice/service/o;->f:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized d()V
    .locals 5

    .prologue
    .line 134
    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/facebook/fbservice/service/o;->f:Z

    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkState(Z)V

    .line 135
    :goto_0
    iget-object v0, p0, Lcom/facebook/fbservice/service/o;->e:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 136
    sget-object v0, Lcom/facebook/fbservice/service/o;->a:Ljava/lang/Class;

    const-string v1, "Waiting for %d queues to stop"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    iget-object v4, p0, Lcom/facebook/fbservice/service/o;->e:Ljava/util/Set;

    invoke-interface {v4}, Ljava/util/Set;->size()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-static {v0, v1, v2}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 138
    :try_start_1
    invoke-virtual {p0}, Ljava/lang/Object;->wait()V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 139
    :catch_0
    move-exception v0

    goto :goto_0

    .line 143
    :cond_0
    monitor-exit p0

    return-void

    .line 134
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
