.class final Lkik/a/g/t;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Lkik/a/g/b;


# direct methods
.method constructor <init>(Lkik/a/g/b;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 452
    iput-object p1, p0, Lkik/a/g/t;->c:Lkik/a/g/b;

    iput-object p2, p0, Lkik/a/g/t;->a:Ljava/lang/String;

    iput-object p3, p0, Lkik/a/g/t;->b:Ljava/lang/String;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 4

    .prologue
    .line 452
    check-cast p1, Lkik/a/f/f/n;

    iget-object v0, p0, Lkik/a/g/t;->c:Lkik/a/g/b;

    invoke-static {v0}, Lkik/a/g/b;->b(Lkik/a/g/b;)Lkik/a/e/r;

    move-result-object v0

    invoke-virtual {p1}, Lkik/a/f/f/n;->g()Lkik/a/d/n;

    move-result-object v1

    invoke-interface {v0, v1}, Lkik/a/e/r;->a(Lkik/a/d/k;)V

    iget-object v0, p0, Lkik/a/g/t;->c:Lkik/a/g/b;

    invoke-virtual {p1}, Lkik/a/f/f/n;->g()Lkik/a/d/n;

    move-result-object v1

    invoke-virtual {v0, v1}, Lkik/a/g/b;->c(Lkik/a/d/n;)V

    invoke-virtual {p1}, Lkik/a/f/f/n;->g()Lkik/a/d/n;

    move-result-object v0

    invoke-virtual {v0}, Lkik/a/d/n;->I()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Lkik/a/f/f/n;->g()Lkik/a/d/n;

    move-result-object v0

    invoke-virtual {v0}, Lkik/a/d/n;->w()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iget-object v2, p0, Lkik/a/g/t;->c:Lkik/a/g/b;

    invoke-static {v2}, Lkik/a/g/b;->b(Lkik/a/g/b;)Lkik/a/e/r;

    move-result-object v2

    const/4 v3, 0x0

    invoke-interface {v2, v0, v3}, Lkik/a/e/r;->a(Ljava/lang/String;Z)Lkik/a/d/k;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lkik/a/d/k;->p()Z

    move-result v2

    if-nez v2, :cond_0

    iget-object v2, p0, Lkik/a/g/t;->c:Lkik/a/g/b;

    invoke-static {v2}, Lkik/a/g/b;->b(Lkik/a/g/b;)Lkik/a/e/r;

    move-result-object v2

    invoke-virtual {v0}, Lkik/a/d/k;->a()Lkik/a/d/j;

    move-result-object v0

    invoke-interface {v2, v0}, Lkik/a/e/r;->a(Lkik/a/d/j;)Lcom/kik/g/p;

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lkik/a/g/t;->c:Lkik/a/g/b;

    invoke-static {v0}, Lkik/a/g/b;->b(Lkik/a/g/b;)Lkik/a/e/r;

    move-result-object v0

    invoke-interface {v0}, Lkik/a/e/r;->j()V

    iget-object v0, p0, Lkik/a/g/t;->c:Lkik/a/g/b;

    invoke-static {v0}, Lkik/a/g/b;->e(Lkik/a/g/b;)Lcom/kik/g/k;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/kik/g/k;->a(Ljava/lang/Object;)V

    iget-object v0, p0, Lkik/a/g/t;->c:Lkik/a/g/b;

    invoke-static {v0}, Lkik/a/g/b;->f(Lkik/a/g/b;)Ljava/util/Map;

    move-result-object v0

    iget-object v1, p0, Lkik/a/g/t;->a:Ljava/lang/String;

    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final a(Ljava/lang/Throwable;)V
    .locals 3

    .prologue
    .line 477
    instance-of v0, p1, Lkik/a/f/q;

    if-eqz v0, :cond_1

    move-object v0, p1

    .line 478
    check-cast v0, Lkik/a/f/q;

    .line 479
    invoke-virtual {v0}, Lkik/a/f/q;->a()I

    move-result v1

    const/16 v2, 0xca

    if-ne v1, v2, :cond_1

    .line 480
    invoke-virtual {v0}, Lkik/a/f/q;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    .line 481
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 482
    iget-object v2, p0, Lkik/a/g/t;->c:Lkik/a/g/b;

    invoke-virtual {v2, v0}, Lkik/a/g/b;->a(Ljava/lang/String;)V

    goto :goto_0

    .line 484
    :cond_0
    iget-object v0, p0, Lkik/a/g/t;->c:Lkik/a/g/b;

    invoke-static {v0}, Lkik/a/g/b;->b(Lkik/a/g/b;)Lkik/a/e/r;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lkik/a/e/r;->a(ZZ)V

    .line 487
    :cond_1
    iget-object v0, p0, Lkik/a/g/t;->c:Lkik/a/g/b;

    invoke-static {v0}, Lkik/a/g/b;->f(Lkik/a/g/b;)Ljava/util/Map;

    move-result-object v0

    iget-object v1, p0, Lkik/a/g/t;->a:Ljava/lang/String;

    iget-object v2, p0, Lkik/a/g/t;->b:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 488
    iget-object v0, p0, Lkik/a/g/t;->c:Lkik/a/g/b;

    invoke-static {v0}, Lkik/a/g/b;->d(Lkik/a/g/b;)Lcom/kik/g/k;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/kik/g/k;->a(Ljava/lang/Object;)V

    .line 489
    return-void
.end method
