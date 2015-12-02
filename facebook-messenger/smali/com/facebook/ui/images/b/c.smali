.class public Lcom/facebook/ui/images/b/c;
.super Ljava/lang/Object;
.source "FetchImageCoordinator.java"

# interfaces
.implements Ljava/util/concurrent/Executor;


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


# instance fields
.field private final b:Lcom/facebook/common/executors/a;

.field private final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/Runnable;",
            ">;"
        }
    .end annotation

    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 23
    const-class v0, Lcom/facebook/ui/images/b/c;

    sput-object v0, Lcom/facebook/ui/images/b/c;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/common/executors/a;)V
    .locals 1

    .prologue
    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/ui/images/b/c;->c:Ljava/util/List;

    .line 33
    iput-object p1, p0, Lcom/facebook/ui/images/b/c;->b:Lcom/facebook/common/executors/a;

    .line 34
    return-void
.end method

.method private a()V
    .locals 6

    .prologue
    .line 52
    monitor-enter p0

    .line 53
    :try_start_0
    iget-object v0, p0, Lcom/facebook/ui/images/b/c;->c:Ljava/util/List;

    invoke-static {v0}, Lcom/google/common/a/hq;->a(Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v0

    .line 54
    iget-object v1, p0, Lcom/facebook/ui/images/b/c;->c:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->clear()V

    .line 55
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 56
    sget-object v1, Lcom/facebook/ui/images/b/c;->a:Ljava/lang/Class;

    const-string v2, "Running %d runnables"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v3, v4

    invoke-static {v1, v2, v3}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 57
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Runnable;

    .line 58
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    goto :goto_0

    .line 55
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    .line 60
    :cond_0
    return-void
.end method

.method static synthetic a(Lcom/facebook/ui/images/b/c;)V
    .locals 0

    .prologue
    .line 21
    invoke-direct {p0}, Lcom/facebook/ui/images/b/c;->a()V

    return-void
.end method


# virtual methods
.method public declared-synchronized execute(Ljava/lang/Runnable;)V
    .locals 4

    .prologue
    .line 38
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/ui/images/b/c;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 39
    iget-object v0, p0, Lcom/facebook/ui/images/b/c;->b:Lcom/facebook/common/executors/a;

    new-instance v1, Lcom/facebook/ui/images/b/d;

    invoke-direct {v1, p0}, Lcom/facebook/ui/images/b/d;-><init>(Lcom/facebook/ui/images/b/c;)V

    const-wide/16 v2, 0x32

    invoke-interface {v0, v1, v2, v3}, Lcom/facebook/common/executors/a;->a(Ljava/lang/Runnable;J)V

    .line 46
    :cond_0
    iget-object v0, p0, Lcom/facebook/ui/images/b/c;->c:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    monitor-exit p0

    return-void

    .line 38
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
