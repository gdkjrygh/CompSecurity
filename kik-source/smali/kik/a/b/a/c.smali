.class final Lkik/a/b/a/c;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/a/d/k;

.field final synthetic b:Lkik/a/d/s;

.field final synthetic c:Lcom/kik/g/p;

.field final synthetic d:Lkik/a/b/a/a;


# direct methods
.method constructor <init>(Lkik/a/b/a/a;Lkik/a/d/k;Lkik/a/d/s;Lcom/kik/g/p;)V
    .locals 0

    .prologue
    .line 1674
    iput-object p1, p0, Lkik/a/b/a/c;->d:Lkik/a/b/a/a;

    iput-object p2, p0, Lkik/a/b/a/c;->a:Lkik/a/d/k;

    iput-object p3, p0, Lkik/a/b/a/c;->b:Lkik/a/d/s;

    iput-object p4, p0, Lkik/a/b/a/c;->c:Lcom/kik/g/p;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 5

    .prologue
    const/4 v1, 0x0

    .line 1674
    check-cast p1, Lcom/kik/m/o;

    if-eqz p1, :cond_1

    iget-object v0, p1, Lcom/kik/m/o;->a:Ljava/lang/Object;

    check-cast v0, Ljava/security/KeyPair;

    iget-object v1, p1, Lcom/kik/m/o;->b:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    :goto_0
    iget-object v2, p0, Lkik/a/b/a/c;->a:Lkik/a/d/k;

    if-eqz v2, :cond_0

    iget-object v2, p0, Lkik/a/b/a/c;->a:Lkik/a/d/k;

    instance-of v2, v2, Lkik/a/d/n;

    if-eqz v2, :cond_0

    iget-object v2, p0, Lkik/a/b/a/c;->b:Lkik/a/d/s;

    iget-object v3, p0, Lkik/a/b/a/c;->d:Lkik/a/b/a/a;

    invoke-static {v3}, Lkik/a/b/a/a;->e(Lkik/a/b/a/a;)Lkik/a/e/o;

    move-result-object v3

    iget-object v4, p0, Lkik/a/b/a/c;->d:Lkik/a/b/a/a;

    invoke-static {v2, v1, v0, v3, v4}, Lkik/a/f/f/v;->a(Lkik/a/d/s;Ljava/util/List;Ljava/security/KeyPair;Lkik/a/e/o;Lkik/a/f/j;)Lkik/a/f/f/v;

    move-result-object v0

    :goto_1
    iget-object v1, p0, Lkik/a/b/a/c;->d:Lkik/a/b/a/a;

    invoke-static {v1}, Lkik/a/b/a/a;->f(Lkik/a/b/a/a;)Lkik/a/e/f;

    move-result-object v1

    invoke-interface {v1, v0}, Lkik/a/e/f;->a(Lkik/a/f/f/z;)Lcom/kik/g/p;

    move-result-object v0

    invoke-static {v0}, Lcom/kik/g/s;->b(Lcom/kik/g/p;)Lcom/kik/g/p;

    move-result-object v0

    iget-object v1, p0, Lkik/a/b/a/c;->c:Lcom/kik/g/p;

    invoke-static {v0, v1}, Lcom/kik/g/s;->b(Lcom/kik/g/p;Lcom/kik/g/p;)Lcom/kik/g/p;

    iget-object v0, p0, Lkik/a/b/a/c;->d:Lkik/a/b/a/a;

    invoke-static {v0}, Lkik/a/b/a/a;->g(Lkik/a/b/a/a;)Ljava/util/List;

    move-result-object v1

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lkik/a/b/a/c;->d:Lkik/a/b/a/a;

    invoke-static {v0}, Lkik/a/b/a/a;->g(Lkik/a/b/a/a;)Ljava/util/List;

    move-result-object v0

    iget-object v2, p0, Lkik/a/b/a/c;->b:Lkik/a/d/s;

    invoke-interface {v0, v2}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :cond_0
    iget-object v2, p0, Lkik/a/b/a/c;->b:Lkik/a/d/s;

    iget-object v3, p0, Lkik/a/b/a/c;->d:Lkik/a/b/a/a;

    invoke-static {v3}, Lkik/a/b/a/a;->e(Lkik/a/b/a/a;)Lkik/a/e/o;

    move-result-object v3

    iget-object v4, p0, Lkik/a/b/a/c;->d:Lkik/a/b/a/a;

    invoke-static {v2, v1, v0, v3, v4}, Lkik/a/f/f/v;->b(Lkik/a/d/s;Ljava/util/List;Ljava/security/KeyPair;Lkik/a/e/o;Lkik/a/f/j;)Lkik/a/f/f/v;

    move-result-object v0

    goto :goto_1

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    :cond_1
    move-object v0, v1

    goto :goto_0
.end method

.method public final a(Ljava/lang/Throwable;)V
    .locals 3

    .prologue
    .line 1705
    iget-object v0, p0, Lkik/a/b/a/c;->d:Lkik/a/b/a/a;

    invoke-static {v0}, Lkik/a/b/a/a;->g(Lkik/a/b/a/a;)Ljava/util/List;

    move-result-object v1

    monitor-enter v1

    .line 1706
    :try_start_0
    iget-object v0, p0, Lkik/a/b/a/c;->d:Lkik/a/b/a/a;

    invoke-static {v0}, Lkik/a/b/a/a;->g(Lkik/a/b/a/a;)Ljava/util/List;

    move-result-object v0

    iget-object v2, p0, Lkik/a/b/a/c;->b:Lkik/a/d/s;

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1707
    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
