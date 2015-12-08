.class final Lkik/a/a/i;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/a/a/c;


# direct methods
.method constructor <init>(Lkik/a/a/c;)V
    .locals 0

    .prologue
    .line 390
    iput-object p1, p0, Lkik/a/a/i;->a:Lkik/a/a/c;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 6

    .prologue
    .line 390
    check-cast p1, Lcom/kik/a/a/a$e;

    invoke-super {p0, p1}, Lcom/kik/g/r;->a(Ljava/lang/Object;)V

    if-eqz p1, :cond_5

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    invoke-virtual {p1}, Lcom/kik/a/a/a$e;->h()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/a/a/a$a;

    iget-object v3, p0, Lkik/a/a/i;->a:Lkik/a/a/c;

    invoke-virtual {v0}, Lcom/kik/a/a/a$a;->h()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Lcom/kik/a/a/a$a;->i()Ljava/lang/String;

    move-result-object v5

    invoke-static {v3, v4, v5}, Lkik/a/a/c;->a(Lkik/a/a/c;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    new-instance v3, Lkik/a/a/a;

    invoke-virtual {v0}, Lcom/kik/a/a/a$a;->h()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Lcom/kik/a/a/a$a;->i()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v3, v4, v5}, Lkik/a/a/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/kik/a/a/a$a;->j()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v4

    if-lez v4, :cond_1

    invoke-virtual {v3, v0}, Lkik/a/a/a;->a(Ljava/lang/String;)V

    :cond_1
    invoke-virtual {v3}, Lkik/a/a/a;->a()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lkik/a/a/i;->a:Lkik/a/a/c;

    invoke-static {v0}, Lkik/a/a/c;->d(Lkik/a/a/c;)Ljava/lang/Object;

    move-result-object v2

    monitor-enter v2

    :try_start_0
    iget-object v0, p0, Lkik/a/a/i;->a:Lkik/a/a/c;

    invoke-static {v0, v1}, Lkik/a/a/c;->a(Lkik/a/a/c;Ljava/util/Map;)Ljava/util/Map;

    iget-object v0, p0, Lkik/a/a/i;->a:Lkik/a/a/c;

    invoke-static {v0}, Lkik/a/a/c;->e(Lkik/a/a/c;)Lcom/kik/g/k;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/kik/g/k;->a(Ljava/lang/Object;)V

    iget-object v0, p0, Lkik/a/a/i;->a:Lkik/a/a/c;

    invoke-static {v0}, Lkik/a/a/c;->g(Lkik/a/a/c;)Lkik/a/e/a;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    iget-object v3, p0, Lkik/a/a/i;->a:Lkik/a/a/c;

    invoke-static {v3}, Lkik/a/a/c;->f(Lkik/a/a/c;)Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v3

    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-interface {v0, v1}, Lkik/a/e/a;->a(Ljava/util/List;)Z

    iget-object v0, p0, Lkik/a/a/i;->a:Lkik/a/a/c;

    invoke-static {v0}, Lkik/a/a/c;->g(Lkik/a/a/c;)Lkik/a/e/a;

    move-result-object v0

    iget-object v1, p0, Lkik/a/a/i;->a:Lkik/a/a/c;

    invoke-static {v1}, Lkik/a/a/c;->a(Lkik/a/a/c;)Lkik/a/a/l;

    move-result-object v1

    invoke-interface {v1}, Lkik/a/a/l;->b()J

    move-result-wide v4

    invoke-interface {v0, v4, v5}, Lkik/a/e/a;->a(J)V

    iget-object v0, p0, Lkik/a/a/i;->a:Lkik/a/a/c;

    invoke-static {v0}, Lkik/a/a/c;->g(Lkik/a/a/c;)Lkik/a/e/a;

    move-result-object v0

    const-wide/16 v4, 0x0

    invoke-interface {v0, v4, v5}, Lkik/a/e/a;->c(J)V

    invoke-virtual {p1}, Lcom/kik/a/a/a$e;->i()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lkik/a/a/i;->a:Lkik/a/a/c;

    invoke-static {v0}, Lkik/a/a/c;->a(Lkik/a/a/c;)Lkik/a/a/l;

    move-result-object v0

    iget-object v1, p0, Lkik/a/a/i;->a:Lkik/a/a/c;

    invoke-static {v1}, Lkik/a/a/c;->h(Lkik/a/a/c;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-interface {v0, v1}, Lkik/a/a/l;->a(Ljava/util/List;)V

    :cond_3
    iget-object v0, p0, Lkik/a/a/i;->a:Lkik/a/a/c;

    invoke-static {v0}, Lkik/a/a/c;->i(Lkik/a/a/c;)Lkik/a/h/b;

    move-result-object v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lkik/a/a/i;->a:Lkik/a/a/c;

    invoke-static {v0}, Lkik/a/a/c;->i(Lkik/a/a/c;)Lkik/a/h/b;

    move-result-object v0

    invoke-virtual {v0}, Lkik/a/h/b;->c()V

    :cond_4
    monitor-exit v2

    :cond_5
    return-void

    :catchall_0
    move-exception v0

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final synthetic b(Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 390
    check-cast p1, Lcom/kik/a/a/a$e;

    invoke-super {p0, p1}, Lcom/kik/g/r;->b(Ljava/lang/Object;)V

    iget-object v0, p0, Lkik/a/a/i;->a:Lkik/a/a/c;

    invoke-static {v0}, Lkik/a/a/c;->d(Lkik/a/a/c;)Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lkik/a/a/i;->a:Lkik/a/a/c;

    invoke-static {v0}, Lkik/a/a/c;->k(Lkik/a/a/c;)Lcom/kik/g/p;

    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final b(Ljava/lang/Throwable;)V
    .locals 4

    .prologue
    .line 441
    invoke-super {p0, p1}, Lcom/kik/g/r;->b(Ljava/lang/Throwable;)V

    .line 442
    iget-object v0, p0, Lkik/a/a/i;->a:Lkik/a/a/c;

    invoke-static {v0}, Lkik/a/a/c;->d(Lkik/a/a/c;)Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    .line 446
    :try_start_0
    iget-object v0, p0, Lkik/a/a/i;->a:Lkik/a/a/c;

    invoke-static {v0}, Lkik/a/a/c;->i(Lkik/a/a/c;)Lkik/a/h/b;

    move-result-object v0

    if-nez v0, :cond_0

    .line 447
    iget-object v0, p0, Lkik/a/a/i;->a:Lkik/a/a/c;

    invoke-static {v0}, Lkik/a/a/c;->j(Lkik/a/a/c;)V

    .line 452
    :cond_0
    iget-object v0, p0, Lkik/a/a/i;->a:Lkik/a/a/c;

    invoke-static {v0}, Lkik/a/a/c;->i(Lkik/a/a/c;)Lkik/a/h/b;

    move-result-object v0

    invoke-virtual {v0}, Lkik/a/h/b;->a()Z

    move-result v0

    if-nez v0, :cond_1

    .line 455
    iget-object v0, p0, Lkik/a/a/i;->a:Lkik/a/a/c;

    invoke-static {v0}, Lkik/a/a/c;->g(Lkik/a/a/c;)Lkik/a/e/a;

    move-result-object v0

    iget-object v2, p0, Lkik/a/a/i;->a:Lkik/a/a/c;

    invoke-static {v2}, Lkik/a/a/c;->a(Lkik/a/a/c;)Lkik/a/a/l;

    move-result-object v2

    invoke-interface {v2}, Lkik/a/a/l;->b()J

    move-result-wide v2

    invoke-interface {v0, v2, v3}, Lkik/a/e/a;->a(J)V

    .line 458
    iget-object v0, p0, Lkik/a/a/i;->a:Lkik/a/a/c;

    invoke-static {v0}, Lkik/a/a/c;->g(Lkik/a/a/c;)Lkik/a/e/a;

    move-result-object v0

    const-wide/16 v2, 0x0

    invoke-interface {v0, v2, v3}, Lkik/a/e/a;->c(J)V

    .line 460
    :cond_1
    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
