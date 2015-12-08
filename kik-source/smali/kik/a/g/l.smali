.class final Lkik/a/g/l;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/a/g/b;


# direct methods
.method constructor <init>(Lkik/a/g/b;)V
    .locals 0

    .prologue
    .line 659
    iput-object p1, p0, Lkik/a/g/l;->a:Lkik/a/g/b;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 659
    check-cast p1, Lkik/a/f/f/q;

    iget-object v0, p0, Lkik/a/g/l;->a:Lkik/a/g/b;

    invoke-virtual {p1}, Lkik/a/f/f/q;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, v2}, Lkik/a/g/b;->a(Ljava/lang/String;Z)Lkik/a/d/n;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1, v2}, Lkik/a/d/n;->d(Z)V

    invoke-virtual {v1, v2}, Lkik/a/d/n;->f(Z)V

    invoke-virtual {v1, v3}, Lkik/a/d/n;->i(Z)V

    iget-object v0, p0, Lkik/a/g/l;->a:Lkik/a/g/b;

    invoke-static {v0}, Lkik/a/g/b;->b(Lkik/a/g/b;)Lkik/a/e/r;

    move-result-object v0

    invoke-interface {v0, v1, v3, v3}, Lkik/a/e/r;->a(Lkik/a/d/k;ZZ)Z

    invoke-virtual {v1}, Lkik/a/d/n;->w()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iget-object v3, p0, Lkik/a/g/l;->a:Lkik/a/g/b;

    invoke-virtual {v3, v0, v1}, Lkik/a/g/b;->a(Ljava/lang/String;Lkik/a/d/n;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lkik/a/g/l;->a:Lkik/a/g/b;

    invoke-static {v0}, Lkik/a/g/b;->b(Lkik/a/g/b;)Lkik/a/e/r;

    move-result-object v0

    invoke-interface {v0}, Lkik/a/e/r;->j()V

    iget-object v0, p0, Lkik/a/g/l;->a:Lkik/a/g/b;

    invoke-static {v0}, Lkik/a/g/b;->g(Lkik/a/g/b;)Lcom/kik/g/k;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/kik/g/k;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public final a(Ljava/lang/Throwable;)V
    .locals 1

    .prologue
    .line 682
    iget-object v0, p0, Lkik/a/g/l;->a:Lkik/a/g/b;

    invoke-static {v0}, Lkik/a/g/b;->d(Lkik/a/g/b;)Lcom/kik/g/k;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/kik/g/k;->a(Ljava/lang/Object;)V

    .line 683
    return-void
.end method
