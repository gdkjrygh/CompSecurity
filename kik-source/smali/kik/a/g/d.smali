.class final Lkik/a/g/d;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/a/g/b;


# direct methods
.method constructor <init>(Lkik/a/g/b;)V
    .locals 0

    .prologue
    .line 515
    iput-object p1, p0, Lkik/a/g/d;->a:Lkik/a/g/b;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 515
    check-cast p1, Lkik/a/f/f/l;

    iget-object v0, p0, Lkik/a/g/d;->a:Lkik/a/g/b;

    invoke-virtual {p1}, Lkik/a/f/f/l;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, v4}, Lkik/a/g/b;->a(Ljava/lang/String;Z)Lkik/a/d/n;

    move-result-object v1

    invoke-virtual {p1}, Lkik/a/f/f/l;->e()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v1, :cond_0

    invoke-virtual {v1, v0}, Lkik/a/d/n;->d(Ljava/lang/String;)Z

    iget-object v3, p0, Lkik/a/g/d;->a:Lkik/a/g/b;

    invoke-static {v3, v1, v0}, Lkik/a/g/b;->a(Lkik/a/g/b;Lkik/a/d/n;Ljava/lang/String;)V

    iget-object v3, p0, Lkik/a/g/d;->a:Lkik/a/g/b;

    invoke-static {v3}, Lkik/a/g/b;->b(Lkik/a/g/b;)Lkik/a/e/r;

    move-result-object v3

    invoke-interface {v3, v1}, Lkik/a/e/r;->a(Lkik/a/d/k;)V

    invoke-virtual {v1}, Lkik/a/d/n;->I()Z

    move-result v3

    if-nez v3, :cond_0

    iget-object v3, p0, Lkik/a/g/d;->a:Lkik/a/g/b;

    invoke-static {v3}, Lkik/a/g/b;->b(Lkik/a/g/b;)Lkik/a/e/r;

    move-result-object v3

    invoke-interface {v3, v0, v4}, Lkik/a/e/r;->a(Ljava/lang/String;Z)Lkik/a/d/k;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lkik/a/d/k;->p()Z

    move-result v3

    if-nez v3, :cond_0

    iget-object v3, p0, Lkik/a/g/d;->a:Lkik/a/g/b;

    invoke-static {v3}, Lkik/a/g/b;->b(Lkik/a/g/b;)Lkik/a/e/r;

    move-result-object v3

    invoke-virtual {v0}, Lkik/a/d/k;->a()Lkik/a/d/j;

    move-result-object v0

    invoke-interface {v3, v0}, Lkik/a/e/r;->a(Lkik/a/d/j;)Lcom/kik/g/p;

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lkik/a/g/d;->a:Lkik/a/g/b;

    invoke-static {v0}, Lkik/a/g/b;->b(Lkik/a/g/b;)Lkik/a/e/r;

    move-result-object v0

    invoke-interface {v0}, Lkik/a/e/r;->j()V

    return-void
.end method

.method public final a(Ljava/lang/Throwable;)V
    .locals 1

    .prologue
    .line 519
    iget-object v0, p0, Lkik/a/g/d;->a:Lkik/a/g/b;

    invoke-static {v0}, Lkik/a/g/b;->d(Lkik/a/g/b;)Lcom/kik/g/k;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/kik/g/k;->a(Ljava/lang/Object;)V

    .line 520
    return-void
.end method
