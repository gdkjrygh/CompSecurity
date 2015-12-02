.class public Lcom/facebook/abtest/qe/b/a;
.super Ljava/lang/Object;
.source "QuickExperimentMemoryCache.java"

# interfaces
.implements Lcom/facebook/auth/f/b;


# annotations
.annotation build Ljavax/annotation/concurrent/ThreadSafe;
.end annotation


# static fields
.field private static final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<",
            "Lcom/facebook/abtest/qe/b/a;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final b:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation
.end field

.field private final c:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Lcom/facebook/abtest/qe/data/QuickExperimentInfo;",
            ">;"
        }
    .end annotation

    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation
.end field

.field private final d:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Lcom/facebook/abtest/qe/data/QuickExperimentInfo;",
            ">;"
        }
    .end annotation

    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation
.end field

.field private final e:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Lcom/facebook/abtest/qe/b/f;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation
.end field

.field private final f:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Lcom/facebook/abtest/qe/data/QuickExperimentInfo;",
            ">;"
        }
    .end annotation

    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation
.end field

.field private final g:Lcom/facebook/abtest/qe/b;

.field private final h:Lcom/facebook/abtest/qe/e/a;

.field private final i:Lcom/facebook/abtest/qe/c/e;

.field private final j:Lcom/google/common/d/a/u;

.field private final k:Lcom/facebook/abtest/qe/g/a;

.field private final l:Lcom/facebook/common/e/h;

.field private m:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 43
    const-class v0, Lcom/facebook/abtest/qe/b/a;

    sput-object v0, Lcom/facebook/abtest/qe/b/a;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Ljava/util/Set;Lcom/facebook/abtest/qe/b;Lcom/facebook/abtest/qe/e/a;Lcom/facebook/abtest/qe/c/e;Lcom/google/common/d/a/u;Lcom/facebook/abtest/qe/g/a;Lcom/facebook/common/e/h;)V
    .locals 4
    .param p5    # Lcom/google/common/d/a/u;
        .annotation runtime Lcom/facebook/common/executors/DefaultExecutorService;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set",
            "<",
            "Lcom/facebook/abtest/qe/f/b;",
            ">;",
            "Lcom/facebook/abtest/qe/b;",
            "Lcom/facebook/abtest/qe/e/a;",
            "Lcom/facebook/abtest/qe/c/e;",
            "Lcom/google/common/d/a/u;",
            "Lcom/facebook/abtest/qe/g/a;",
            "Lcom/facebook/common/e/h;",
            ")V"
        }
    .end annotation

    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    .prologue
    .line 98
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 88
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/abtest/qe/b/a;->m:Z

    .line 100
    new-instance v1, Lcom/google/common/a/fk;

    invoke-direct {v1}, Lcom/google/common/a/fk;-><init>()V

    .line 101
    invoke-static {p1}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/abtest/qe/f/b;

    .line 102
    invoke-interface {v0}, Lcom/facebook/abtest/qe/f/b;->a()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/abtest/qe/f/a;

    .line 103
    iget-object v0, v0, Lcom/facebook/abtest/qe/f/a;->a:Ljava/lang/String;

    invoke-virtual {v1, v0}, Lcom/google/common/a/fk;->b(Ljava/lang/Object;)Lcom/google/common/a/fk;

    goto :goto_0

    .line 106
    :cond_1
    invoke-virtual {v1}, Lcom/google/common/a/fk;->b()Lcom/google/common/a/fi;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/abtest/qe/b/a;->b:Ljava/util/Set;

    .line 107
    invoke-static {}, Lcom/google/common/a/ik;->a()Ljava/util/HashMap;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/abtest/qe/b/a;->c:Ljava/util/Map;

    .line 108
    invoke-static {}, Lcom/google/common/a/ik;->a()Ljava/util/HashMap;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/abtest/qe/b/a;->d:Ljava/util/Map;

    .line 109
    new-instance v0, Lcom/google/common/a/hy;

    invoke-direct {v0}, Lcom/google/common/a/hy;-><init>()V

    invoke-virtual {v0}, Lcom/google/common/a/hy;->f()Lcom/google/common/a/hy;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/hy;->n()Ljava/util/concurrent/ConcurrentMap;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/abtest/qe/b/a;->e:Ljava/util/Map;

    .line 110
    invoke-static {}, Lcom/google/common/a/ik;->a()Ljava/util/HashMap;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/abtest/qe/b/a;->f:Ljava/util/Map;

    .line 112
    invoke-static {p2}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/abtest/qe/b;

    iput-object v0, p0, Lcom/facebook/abtest/qe/b/a;->g:Lcom/facebook/abtest/qe/b;

    .line 113
    invoke-static {p3}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/abtest/qe/e/a;

    iput-object v0, p0, Lcom/facebook/abtest/qe/b/a;->h:Lcom/facebook/abtest/qe/e/a;

    .line 114
    invoke-static {p4}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/abtest/qe/c/e;

    iput-object v0, p0, Lcom/facebook/abtest/qe/b/a;->i:Lcom/facebook/abtest/qe/c/e;

    .line 115
    invoke-static {p5}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/common/d/a/u;

    iput-object v0, p0, Lcom/facebook/abtest/qe/b/a;->j:Lcom/google/common/d/a/u;

    .line 116
    invoke-static {p6}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/abtest/qe/g/a;

    iput-object v0, p0, Lcom/facebook/abtest/qe/b/a;->k:Lcom/facebook/abtest/qe/g/a;

    .line 117
    invoke-static {p7}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/common/e/h;

    iput-object v0, p0, Lcom/facebook/abtest/qe/b/a;->l:Lcom/facebook/common/e/h;

    .line 118
    return-void
.end method

.method static synthetic a(Lcom/facebook/abtest/qe/b/a;)Lcom/facebook/abtest/qe/c/e;
    .locals 1

    .prologue
    .line 41
    iget-object v0, p0, Lcom/facebook/abtest/qe/b/a;->i:Lcom/facebook/abtest/qe/c/e;

    return-object v0
.end method

.method private declared-synchronized a(Ljava/util/Set;Ljava/util/Set;)Ljava/util/Set;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set",
            "<",
            "Lcom/facebook/abtest/qe/data/QuickExperimentInfo;",
            ">;",
            "Ljava/util/Set",
            "<",
            "Lcom/facebook/abtest/qe/data/QuickExperimentInfo;",
            ">;)",
            "Ljava/util/Set",
            "<",
            "Lcom/facebook/abtest/qe/data/QuickExperimentInfo;",
            ">;"
        }
    .end annotation

    .prologue
    const/4 v0, 0x1

    .line 161
    monitor-enter p0

    :try_start_0
    iget-boolean v1, p0, Lcom/facebook/abtest/qe/b/a;->m:Z

    if-nez v1, :cond_0

    :goto_0
    const-string v1, "QuickExperimentMemoryCache has been initialized more than once"

    invoke-static {v0, v1}, Lcom/google/common/base/Preconditions;->checkState(ZLjava/lang/Object;)V

    .line 162
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/abtest/qe/b/a;->m:Z

    .line 164
    invoke-static {}, Lcom/google/common/a/kl;->a()Ljava/util/HashSet;

    move-result-object v1

    .line 165
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/abtest/qe/data/QuickExperimentInfo;

    .line 166
    iget-object v3, p0, Lcom/facebook/abtest/qe/b/a;->b:Ljava/util/Set;

    invoke-virtual {v0}, Lcom/facebook/abtest/qe/data/QuickExperimentInfo;->a()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 167
    iget-object v3, p0, Lcom/facebook/abtest/qe/b/a;->c:Ljava/util/Map;

    invoke-virtual {v0}, Lcom/facebook/abtest/qe/data/QuickExperimentInfo;->a()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v4, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    .line 161
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    .line 169
    :cond_1
    :try_start_1
    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 173
    :cond_2
    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/abtest/qe/data/QuickExperimentInfo;

    .line 174
    iget-object v3, p0, Lcom/facebook/abtest/qe/b/a;->b:Ljava/util/Set;

    invoke-virtual {v0}, Lcom/facebook/abtest/qe/data/QuickExperimentInfo;->a()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 175
    iget-object v3, p0, Lcom/facebook/abtest/qe/b/a;->d:Ljava/util/Map;

    invoke-virtual {v0}, Lcom/facebook/abtest/qe/data/QuickExperimentInfo;->a()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v4, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    .line 177
    :cond_3
    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_2

    .line 181
    :cond_4
    monitor-exit p0

    return-object v1
.end method

.method private d(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .prologue
    .line 316
    iget-object v0, p0, Lcom/facebook/abtest/qe/b/a;->b:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    const-string v1, "Experiment(%s) can\'t be found in experiment set."

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-static {v0, v1, v2}, Lcom/google/common/base/Preconditions;->checkArgument(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 321
    return-object p1
.end method

.method private declared-synchronized f()V
    .locals 2

    .prologue
    .line 345
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/abtest/qe/b/a;->e:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/abtest/qe/b/f;

    .line 346
    invoke-interface {v0}, Lcom/facebook/abtest/qe/b/f;->b()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 345
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 348
    :cond_0
    monitor-exit p0

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)Lcom/facebook/abtest/qe/data/QuickExperimentInfo;
    .locals 3

    .prologue
    .line 202
    sget-object v0, Lcom/facebook/abtest/qe/c/f;->FROM_USER:Lcom/facebook/abtest/qe/c/f;

    invoke-virtual {p0, p1, v0}, Lcom/facebook/abtest/qe/b/a;->a(Ljava/lang/String;Lcom/facebook/abtest/qe/c/f;)Lcom/facebook/abtest/qe/data/QuickExperimentInfo;

    move-result-object v0

    .line 204
    if-nez v0, :cond_0

    .line 206
    sget-object v0, Lcom/facebook/abtest/qe/c/f;->FROM_SERVER:Lcom/facebook/abtest/qe/c/f;

    invoke-virtual {p0, p1, v0}, Lcom/facebook/abtest/qe/b/a;->a(Ljava/lang/String;Lcom/facebook/abtest/qe/c/f;)Lcom/facebook/abtest/qe/data/QuickExperimentInfo;

    move-result-object v0

    .line 209
    :cond_0
    iget-object v1, p0, Lcom/facebook/abtest/qe/b/a;->g:Lcom/facebook/abtest/qe/b;

    invoke-virtual {v1, p1}, Lcom/facebook/abtest/qe/b;->a(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 210
    if-eqz v0, :cond_1

    .line 212
    invoke-virtual {p0, p1}, Lcom/facebook/abtest/qe/b/a;->c(Ljava/lang/String;)V

    .line 213
    iget-object v1, p0, Lcom/facebook/abtest/qe/b/a;->j:Lcom/google/common/d/a/u;

    new-instance v2, Lcom/facebook/abtest/qe/b/b;

    invoke-direct {v2, p0, p1}, Lcom/facebook/abtest/qe/b/b;-><init>(Lcom/facebook/abtest/qe/b/a;Ljava/lang/String;)V

    invoke-interface {v1, v2}, Lcom/google/common/d/a/u;->b(Ljava/lang/Runnable;)Lcom/google/common/d/a/s;

    .line 219
    iget-object v1, p0, Lcom/facebook/abtest/qe/b/a;->h:Lcom/facebook/abtest/qe/e/a;

    sget-object v2, Lcom/facebook/abtest/qe/e/b;->CLIENT_EXPIRE:Lcom/facebook/abtest/qe/e/b;

    invoke-virtual {v1, v0, v2}, Lcom/facebook/abtest/qe/e/a;->a(Lcom/facebook/abtest/qe/data/QuickExperimentInfo;Lcom/facebook/abtest/qe/e/b;)V

    .line 224
    :cond_1
    const/4 v0, 0x0

    .line 227
    :cond_2
    if-nez v0, :cond_3

    .line 229
    invoke-virtual {p0, p1}, Lcom/facebook/abtest/qe/b/a;->b(Ljava/lang/String;)Lcom/facebook/abtest/qe/data/QuickExperimentInfo;

    move-result-object v0

    .line 231
    :cond_3
    return-object v0
.end method

.method public declared-synchronized a(Ljava/lang/String;Lcom/facebook/abtest/qe/c/f;)Lcom/facebook/abtest/qe/data/QuickExperimentInfo;
    .locals 3

    .prologue
    .line 240
    monitor-enter p0

    :try_start_0
    invoke-direct {p0, p1}, Lcom/facebook/abtest/qe/b/a;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 242
    sget-object v0, Lcom/facebook/abtest/qe/b/d;->a:[I

    invoke-virtual {p2}, Lcom/facebook/abtest/qe/c/f;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 249
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unknown experiment data source "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 240
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 244
    :pswitch_0
    :try_start_1
    iget-object v0, p0, Lcom/facebook/abtest/qe/b/a;->c:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/abtest/qe/data/QuickExperimentInfo;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 246
    :goto_0
    monitor-exit p0

    return-object v0

    :pswitch_1
    :try_start_2
    iget-object v0, p0, Lcom/facebook/abtest/qe/b/a;->d:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/abtest/qe/data/QuickExperimentInfo;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    .line 242
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public a()V
    .locals 4

    .prologue
    .line 125
    :try_start_0
    iget-object v0, p0, Lcom/facebook/abtest/qe/b/a;->i:Lcom/facebook/abtest/qe/c/e;

    sget-object v1, Lcom/facebook/abtest/qe/c/f;->FROM_SERVER:Lcom/facebook/abtest/qe/c/f;

    invoke-virtual {v0, v1}, Lcom/facebook/abtest/qe/c/e;->a(Lcom/facebook/abtest/qe/c/f;)Ljava/util/Set;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/abtest/qe/b/a;->i:Lcom/facebook/abtest/qe/c/e;

    sget-object v2, Lcom/facebook/abtest/qe/c/f;->FROM_USER:Lcom/facebook/abtest/qe/c/f;

    invoke-virtual {v1, v2}, Lcom/facebook/abtest/qe/c/e;->a(Lcom/facebook/abtest/qe/c/f;)Ljava/util/Set;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/facebook/abtest/qe/b/a;->a(Ljava/util/Set;Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    .line 131
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/abtest/qe/data/QuickExperimentInfo;

    .line 132
    iget-object v2, p0, Lcom/facebook/abtest/qe/b/a;->h:Lcom/facebook/abtest/qe/e/a;

    sget-object v3, Lcom/facebook/abtest/qe/e/b;->APP_UPGRADE:Lcom/facebook/abtest/qe/e/b;

    invoke-virtual {v2, v0, v3}, Lcom/facebook/abtest/qe/e/a;->a(Lcom/facebook/abtest/qe/data/QuickExperimentInfo;Lcom/facebook/abtest/qe/e/b;)V

    .line 136
    iget-object v2, p0, Lcom/facebook/abtest/qe/b/a;->i:Lcom/facebook/abtest/qe/c/e;

    invoke-virtual {v0}, Lcom/facebook/abtest/qe/data/QuickExperimentInfo;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/facebook/abtest/qe/c/e;->a(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 140
    :catch_0
    move-exception v0

    .line 142
    iget-object v0, p0, Lcom/facebook/abtest/qe/b/a;->l:Lcom/facebook/common/e/h;

    const-string v1, "QuickExperimentCache"

    const-string v2, "Data in disk cache is corrupted. Delete all of them."

    invoke-interface {v0, v1, v2}, Lcom/facebook/common/e/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 147
    iget-object v0, p0, Lcom/facebook/abtest/qe/b/a;->i:Lcom/facebook/abtest/qe/c/e;

    invoke-virtual {v0}, Lcom/facebook/abtest/qe/c/e;->a()V

    .line 149
    invoke-virtual {p0}, Lcom/facebook/abtest/qe/b/a;->d()V

    .line 151
    :goto_1
    return-void

    .line 139
    :cond_0
    :try_start_1
    invoke-virtual {p0}, Lcom/facebook/abtest/qe/b/a;->c()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1
.end method

.method public declared-synchronized a(Lcom/facebook/abtest/qe/b/f;)V
    .locals 2

    .prologue
    .line 329
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/abtest/qe/b/a;->e:Ljava/util/Map;

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 330
    monitor-exit p0

    return-void

    .line 329
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized a(Lcom/facebook/abtest/qe/data/QuickExperimentInfo;Lcom/facebook/abtest/qe/c/f;)V
    .locals 3

    .prologue
    .line 276
    monitor-enter p0

    :try_start_0
    invoke-virtual {p1}, Lcom/facebook/abtest/qe/data/QuickExperimentInfo;->a()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/facebook/abtest/qe/b/a;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 277
    sget-object v0, Lcom/facebook/abtest/qe/b/d;->a:[I

    invoke-virtual {p2}, Lcom/facebook/abtest/qe/c/f;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 302
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unknown experiment data source "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 276
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 279
    :pswitch_0
    :try_start_1
    iget-object v0, p0, Lcom/facebook/abtest/qe/b/a;->c:Ljava/util/Map;

    invoke-virtual {p1}, Lcom/facebook/abtest/qe/data/QuickExperimentInfo;->a()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/abtest/qe/data/QuickExperimentInfo;

    .line 281
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/facebook/abtest/qe/data/QuickExperimentInfo;->c()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 282
    invoke-virtual {p1}, Lcom/facebook/abtest/qe/data/QuickExperimentInfo;->c()Z

    move-result v1

    if-nez v1, :cond_1

    .line 284
    iget-object v1, p0, Lcom/facebook/abtest/qe/b/a;->h:Lcom/facebook/abtest/qe/e/a;

    sget-object v2, Lcom/facebook/abtest/qe/e/b;->SERVER_EXPIRE:Lcom/facebook/abtest/qe/e/b;

    invoke-virtual {v1, v0, v2}, Lcom/facebook/abtest/qe/e/a;->a(Lcom/facebook/abtest/qe/data/QuickExperimentInfo;Lcom/facebook/abtest/qe/e/b;)V

    .line 296
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/facebook/abtest/qe/b/a;->c:Ljava/util/Map;

    invoke-virtual {p1}, Lcom/facebook/abtest/qe/data/QuickExperimentInfo;->a()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 304
    :goto_1
    monitor-exit p0

    return-void

    .line 288
    :cond_1
    :try_start_2
    invoke-virtual {p1}, Lcom/facebook/abtest/qe/data/QuickExperimentInfo;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Lcom/facebook/abtest/qe/data/QuickExperimentInfo;->b()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 290
    iget-object v1, p0, Lcom/facebook/abtest/qe/b/a;->h:Lcom/facebook/abtest/qe/e/a;

    sget-object v2, Lcom/facebook/abtest/qe/e/b;->CHANGE_GROUP:Lcom/facebook/abtest/qe/e/b;

    invoke-virtual {v1, v0, v2}, Lcom/facebook/abtest/qe/e/a;->a(Lcom/facebook/abtest/qe/data/QuickExperimentInfo;Lcom/facebook/abtest/qe/e/b;)V

    goto :goto_0

    .line 299
    :pswitch_1
    iget-object v0, p0, Lcom/facebook/abtest/qe/b/a;->d:Ljava/util/Map;

    invoke-virtual {p1}, Lcom/facebook/abtest/qe/data/QuickExperimentInfo;->a()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_1

    .line 277
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public b(Ljava/lang/String;)Lcom/facebook/abtest/qe/data/QuickExperimentInfo;
    .locals 3

    .prologue
    .line 253
    iget-object v0, p0, Lcom/facebook/abtest/qe/b/a;->f:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/abtest/qe/data/QuickExperimentInfo;

    .line 256
    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/facebook/abtest/qe/b/a;->k:Lcom/facebook/abtest/qe/g/a;

    invoke-virtual {v1}, Lcom/facebook/abtest/qe/g/a;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Lcom/facebook/abtest/qe/data/QuickExperimentInfo;->e()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 257
    :cond_0
    new-instance v0, Lcom/facebook/abtest/qe/data/c;

    invoke-direct {v0}, Lcom/facebook/abtest/qe/data/c;-><init>()V

    invoke-virtual {v0, p1}, Lcom/facebook/abtest/qe/data/c;->a(Ljava/lang/String;)Lcom/facebook/abtest/qe/data/c;

    move-result-object v0

    const-string v1, "local_default_group"

    invoke-virtual {v0, v1}, Lcom/facebook/abtest/qe/data/c;->b(Ljava/lang/String;)Lcom/facebook/abtest/qe/data/c;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/facebook/abtest/qe/data/c;->a(Z)Lcom/facebook/abtest/qe/data/c;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/abtest/qe/b/a;->k:Lcom/facebook/abtest/qe/g/a;

    invoke-virtual {v1}, Lcom/facebook/abtest/qe/g/a;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/abtest/qe/data/c;->d(Ljava/lang/String;)Lcom/facebook/abtest/qe/data/c;

    move-result-object v0

    invoke-static {}, Lcom/google/common/a/ev;->j()Lcom/google/common/a/ev;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/abtest/qe/data/c;->a(Ljava/util/Map;)Lcom/facebook/abtest/qe/data/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/abtest/qe/data/c;->a()Lcom/facebook/abtest/qe/data/QuickExperimentInfo;

    move-result-object v0

    .line 265
    iget-object v1, p0, Lcom/facebook/abtest/qe/b/a;->f:Ljava/util/Map;

    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 267
    :cond_1
    return-object v0
.end method

.method public b()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 188
    iget-object v0, p0, Lcom/facebook/abtest/qe/b/a;->b:Ljava/util/Set;

    invoke-static {v0}, Lcom/google/common/a/fi;->a(Ljava/util/Collection;)Lcom/google/common/a/fi;

    move-result-object v0

    return-object v0
.end method

.method public declared-synchronized c()V
    .locals 2

    .prologue
    .line 336
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/abtest/qe/b/a;->e:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/abtest/qe/b/f;

    .line 337
    invoke-interface {v0}, Lcom/facebook/abtest/qe/b/f;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 336
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 339
    :cond_0
    monitor-exit p0

    return-void
.end method

.method public declared-synchronized c(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 311
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/abtest/qe/b/a;->c:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 312
    iget-object v0, p0, Lcom/facebook/abtest/qe/b/a;->d:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 313
    monitor-exit p0

    return-void

    .line 311
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized d()V
    .locals 4

    .prologue
    .line 355
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/abtest/qe/b/a;->c:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/abtest/qe/data/QuickExperimentInfo;

    .line 356
    iget-object v2, p0, Lcom/facebook/abtest/qe/b/a;->h:Lcom/facebook/abtest/qe/e/a;

    sget-object v3, Lcom/facebook/abtest/qe/e/b;->USER_LOGOUT:Lcom/facebook/abtest/qe/e/b;

    invoke-virtual {v2, v0, v3}, Lcom/facebook/abtest/qe/e/a;->a(Lcom/facebook/abtest/qe/data/QuickExperimentInfo;Lcom/facebook/abtest/qe/e/b;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 355
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 361
    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/facebook/abtest/qe/b/a;->c:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 362
    iget-object v0, p0, Lcom/facebook/abtest/qe/b/a;->d:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 364
    invoke-direct {p0}, Lcom/facebook/abtest/qe/b/a;->f()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 365
    monitor-exit p0

    return-void
.end method

.method public e()Lcom/facebook/abtest/qe/b/e;
    .locals 1

    .prologue
    .line 371
    new-instance v0, Lcom/facebook/abtest/qe/b/c;

    invoke-direct {v0, p0}, Lcom/facebook/abtest/qe/b/c;-><init>(Lcom/facebook/abtest/qe/b/a;)V

    return-object v0
.end method
