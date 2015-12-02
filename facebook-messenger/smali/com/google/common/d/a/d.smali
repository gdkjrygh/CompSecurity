.class public final Lcom/google/common/d/a/d;
.super Ljava/lang/Object;
.source "ExecutionList.java"


# static fields
.field private static final a:Ljava/util/logging/Logger;

.field private static b:Lcom/google/common/d/a/f;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field


# instance fields
.field private final c:Ljava/util/Queue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Queue",
            "<",
            "Lcom/google/common/d/a/e;",
            ">;"
        }
    .end annotation
.end field

.field private d:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 51
    const-class v0, Lcom/google/common/d/a/d;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, Lcom/google/common/d/a/d;->a:Ljava/util/logging/Logger;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 69
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 58
    invoke-static {}, Lcom/google/common/a/hq;->b()Ljava/util/LinkedList;

    move-result-object v0

    iput-object v0, p0, Lcom/google/common/d/a/d;->c:Ljava/util/Queue;

    .line 62
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/common/d/a/d;->d:Z

    .line 70
    return-void
.end method

.method public static a(Lcom/google/common/d/a/f;)V
    .locals 0
    .param p0    # Lcom/google/common/d/a/f;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 161
    sput-object p0, Lcom/google/common/d/a/d;->b:Lcom/google/common/d/a/f;

    .line 162
    return-void
.end method

.method static synthetic b()Lcom/google/common/d/a/f;
    .locals 1

    .prologue
    .line 48
    sget-object v0, Lcom/google/common/d/a/d;->b:Lcom/google/common/d/a/f;

    return-object v0
.end method

.method static synthetic c()Ljava/util/logging/Logger;
    .locals 1

    .prologue
    .line 48
    sget-object v0, Lcom/google/common/d/a/d;->a:Ljava/util/logging/Logger;

    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 2

    .prologue
    .line 145
    iget-object v1, p0, Lcom/google/common/d/a/d;->c:Ljava/util/Queue;

    monitor-enter v1

    .line 146
    :try_start_0
    iget-boolean v0, p0, Lcom/google/common/d/a/d;->d:Z

    if-eqz v0, :cond_1

    .line 147
    monitor-exit v1

    .line 157
    :cond_0
    return-void

    .line 149
    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/common/d/a/d;->d:Z

    .line 150
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 154
    :goto_0
    iget-object v0, p0, Lcom/google/common/d/a/d;->c:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 155
    iget-object v0, p0, Lcom/google/common/d/a/d;->c:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->poll()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/common/d/a/e;

    invoke-virtual {v0}, Lcom/google/common/d/a/e;->a()V

    goto :goto_0

    .line 150
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V
    .locals 4

    .prologue
    .line 93
    const-string v0, "Runnable was null."

    invoke-static {p1, v0}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    const-string v0, "Executor was null."

    invoke-static {p2, v0}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    const/4 v0, 0x0

    .line 101
    iget-object v1, p0, Lcom/google/common/d/a/d;->c:Ljava/util/Queue;

    monitor-enter v1

    .line 102
    :try_start_0
    iget-boolean v2, p0, Lcom/google/common/d/a/d;->d:Z

    if-nez v2, :cond_1

    .line 103
    iget-object v2, p0, Lcom/google/common/d/a/d;->c:Ljava/util/Queue;

    new-instance v3, Lcom/google/common/d/a/e;

    invoke-direct {v3, p1, p2}, Lcom/google/common/d/a/e;-><init>(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    invoke-interface {v2, v3}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    .line 107
    :goto_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 113
    if-eqz v0, :cond_0

    .line 114
    new-instance v0, Lcom/google/common/d/a/e;

    invoke-direct {v0, p1, p2}, Lcom/google/common/d/a/e;-><init>(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    invoke-virtual {v0}, Lcom/google/common/d/a/e;->a()V

    .line 116
    :cond_0
    return-void

    .line 105
    :cond_1
    const/4 v0, 0x1

    goto :goto_0

    .line 107
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method
