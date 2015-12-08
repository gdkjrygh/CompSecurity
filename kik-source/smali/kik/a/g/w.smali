.class final Lkik/a/g/w;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Ljava/util/Set;

.field final synthetic b:Lkik/a/g/v;


# direct methods
.method constructor <init>(Lkik/a/g/v;Ljava/util/Set;)V
    .locals 0

    .prologue
    .line 299
    iput-object p1, p0, Lkik/a/g/w;->b:Lkik/a/g/v;

    iput-object p2, p0, Lkik/a/g/w;->a:Ljava/util/Set;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 6

    .prologue
    .line 299
    check-cast p1, Ljava/util/Set;

    iget-object v0, p0, Lkik/a/g/w;->b:Lkik/a/g/v;

    invoke-static {v0}, Lkik/a/g/v;->a(Lkik/a/g/v;)Ljava/util/LinkedHashMap;

    move-result-object v2

    monitor-enter v2

    :try_start_0
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/k;

    invoke-virtual {v0}, Lkik/a/d/k;->a()Lkik/a/d/j;

    move-result-object v1

    invoke-virtual {v1}, Lkik/a/d/j;->a()Ljava/lang/String;

    move-result-object v4

    iget-object v1, p0, Lkik/a/g/w;->b:Lkik/a/g/v;

    invoke-static {v1}, Lkik/a/g/v;->a(Lkik/a/g/v;)Ljava/util/LinkedHashMap;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/kik/g/p;

    invoke-virtual {v1, v0}, Lcom/kik/g/p;->a(Ljava/lang/Object;)V

    iget-object v0, p0, Lkik/a/g/w;->b:Lkik/a/g/v;

    invoke-static {v0}, Lkik/a/g/v;->a(Lkik/a/g/v;)Ljava/util/LinkedHashMap;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/util/LinkedHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_0
    :try_start_1
    iget-object v0, p0, Lkik/a/g/w;->a:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iget-object v1, p0, Lkik/a/g/w;->b:Lkik/a/g/v;

    invoke-static {v1}, Lkik/a/g/v;->a(Lkik/a/g/v;)Ljava/util/LinkedHashMap;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/kik/g/p;

    if-eqz v1, :cond_1

    new-instance v4, Ljava/lang/Throwable;

    const-string v5, "failed user lookup"

    invoke-direct {v4, v5}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v4}, Lcom/kik/g/p;->a(Ljava/lang/Throwable;)V

    iget-object v1, p0, Lkik/a/g/w;->b:Lkik/a/g/v;

    invoke-static {v1}, Lkik/a/g/v;->a(Lkik/a/g/v;)Ljava/util/LinkedHashMap;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/util/LinkedHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_2
    iget-object v0, p0, Lkik/a/g/w;->b:Lkik/a/g/v;

    invoke-static {v0}, Lkik/a/g/v;->b(Lkik/a/g/v;)Z

    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    iget-object v0, p0, Lkik/a/g/w;->b:Lkik/a/g/v;

    invoke-virtual {v0}, Lkik/a/g/v;->m()V

    return-void
.end method

.method public final a(Ljava/lang/Throwable;)V
    .locals 4

    .prologue
    .line 332
    iget-object v0, p0, Lkik/a/g/w;->b:Lkik/a/g/v;

    invoke-static {v0}, Lkik/a/g/v;->a(Lkik/a/g/v;)Ljava/util/LinkedHashMap;

    move-result-object v2

    monitor-enter v2

    .line 333
    :try_start_0
    iget-object v0, p0, Lkik/a/g/w;->a:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 334
    iget-object v1, p0, Lkik/a/g/w;->b:Lkik/a/g/v;

    invoke-static {v1}, Lkik/a/g/v;->a(Lkik/a/g/v;)Ljava/util/LinkedHashMap;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/kik/g/p;

    .line 337
    if-eqz v1, :cond_0

    .line 338
    iget-object v1, p0, Lkik/a/g/w;->b:Lkik/a/g/v;

    invoke-static {v1}, Lkik/a/g/v;->a(Lkik/a/g/v;)Ljava/util/LinkedHashMap;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/kik/g/p;

    invoke-virtual {v1, p1}, Lcom/kik/g/p;->a(Ljava/lang/Throwable;)V

    .line 342
    iget-object v1, p0, Lkik/a/g/w;->b:Lkik/a/g/v;

    invoke-static {v1}, Lkik/a/g/v;->a(Lkik/a/g/v;)Ljava/util/LinkedHashMap;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/util/LinkedHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 348
    :catchall_0
    move-exception v0

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 347
    :cond_1
    :try_start_1
    iget-object v0, p0, Lkik/a/g/w;->b:Lkik/a/g/v;

    invoke-static {v0}, Lkik/a/g/v;->b(Lkik/a/g/v;)Z

    .line 348
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 350
    iget-object v0, p0, Lkik/a/g/w;->b:Lkik/a/g/v;

    invoke-static {v0}, Lkik/a/g/v;->c(Lkik/a/g/v;)Lkik/a/e/f;

    move-result-object v0

    invoke-interface {v0}, Lkik/a/e/f;->k()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 351
    iget-object v0, p0, Lkik/a/g/w;->b:Lkik/a/g/v;

    invoke-virtual {v0}, Lkik/a/g/v;->m()V

    .line 353
    :cond_2
    return-void
.end method
