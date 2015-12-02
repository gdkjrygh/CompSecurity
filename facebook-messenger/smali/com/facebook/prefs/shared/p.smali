.class public Lcom/facebook/prefs/shared/p;
.super Ljava/lang/Object;
.source "FbSharedPreferencesImpl.java"

# interfaces
.implements Lcom/facebook/prefs/shared/e;


# instance fields
.field final synthetic a:Lcom/facebook/prefs/shared/j;

.field private final b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Lcom/facebook/prefs/shared/ae;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/facebook/prefs/shared/j;)V
    .locals 1

    .prologue
    .line 377
    iput-object p1, p0, Lcom/facebook/prefs/shared/p;->a:Lcom/facebook/prefs/shared/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 378
    invoke-static {}, Lcom/google/common/a/ik;->a()Ljava/util/HashMap;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/prefs/shared/p;->b:Ljava/util/Map;

    .line 379
    return-void
.end method


# virtual methods
.method public declared-synchronized a(Lcom/facebook/prefs/shared/ae;)Lcom/facebook/prefs/shared/e;
    .locals 2

    .prologue
    .line 425
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/prefs/shared/p;->b:Ljava/util/Map;

    invoke-static {}, Lcom/facebook/prefs/shared/j;->g()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 426
    monitor-exit p0

    return-object p0

    .line 425
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized a(Lcom/facebook/prefs/shared/ae;F)Lcom/facebook/prefs/shared/e;
    .locals 2

    .prologue
    .line 413
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/prefs/shared/p;->b:Ljava/util/Map;

    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 414
    monitor-exit p0

    return-object p0

    .line 413
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized a(Lcom/facebook/prefs/shared/ae;I)Lcom/facebook/prefs/shared/e;
    .locals 2

    .prologue
    .line 401
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/prefs/shared/p;->b:Ljava/util/Map;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 402
    monitor-exit p0

    return-object p0

    .line 401
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized a(Lcom/facebook/prefs/shared/ae;J)Lcom/facebook/prefs/shared/e;
    .locals 2

    .prologue
    .line 407
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/prefs/shared/p;->b:Ljava/util/Map;

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 408
    monitor-exit p0

    return-object p0

    .line 407
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized a(Lcom/facebook/prefs/shared/ae;Ljava/lang/String;)Lcom/facebook/prefs/shared/e;
    .locals 2

    .prologue
    .line 383
    monitor-enter p0

    if-nez p2, :cond_0

    .line 385
    :try_start_0
    iget-object v0, p0, Lcom/facebook/prefs/shared/p;->b:Ljava/util/Map;

    invoke-static {}, Lcom/facebook/prefs/shared/j;->g()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 386
    iget-object v0, p0, Lcom/facebook/prefs/shared/p;->a:Lcom/facebook/prefs/shared/j;

    invoke-static {v0, p1}, Lcom/facebook/prefs/shared/j;->a(Lcom/facebook/prefs/shared/j;Lcom/facebook/prefs/shared/ae;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 390
    :goto_0
    monitor-exit p0

    return-object p0

    .line 388
    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/facebook/prefs/shared/p;->b:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 383
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized a(Lcom/facebook/prefs/shared/ae;Z)Lcom/facebook/prefs/shared/e;
    .locals 2

    .prologue
    .line 395
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/prefs/shared/p;->b:Ljava/util/Map;

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 396
    monitor-exit p0

    return-object p0

    .line 395
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized a()V
    .locals 3

    .prologue
    .line 469
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/prefs/shared/p;->b:Ljava/util/Map;

    invoke-static {v0}, Lcom/google/common/a/ik;->a(Ljava/util/Map;)Ljava/util/HashMap;

    move-result-object v0

    .line 470
    iget-object v1, p0, Lcom/facebook/prefs/shared/p;->a:Lcom/facebook/prefs/shared/j;

    const/4 v2, 0x1

    invoke-static {v1, v0, v2}, Lcom/facebook/prefs/shared/j;->a(Lcom/facebook/prefs/shared/j;Ljava/util/Map;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 471
    monitor-exit p0

    return-void

    .line 469
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized b(Lcom/facebook/prefs/shared/ae;)Lcom/facebook/prefs/shared/e;
    .locals 4

    .prologue
    .line 431
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/prefs/shared/p;->a:Lcom/facebook/prefs/shared/j;

    invoke-virtual {v0, p1}, Lcom/facebook/prefs/shared/j;->d(Lcom/facebook/prefs/shared/ae;)Ljava/util/SortedSet;

    move-result-object v0

    .line 432
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    .line 433
    iget-object v2, p0, Lcom/facebook/prefs/shared/p;->b:Ljava/util/Map;

    invoke-static {}, Lcom/facebook/prefs/shared/j;->g()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v2, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 431
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 435
    :cond_0
    monitor-exit p0

    return-object p0
.end method
