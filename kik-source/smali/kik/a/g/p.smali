.class final Lkik/a/g/p;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/kik/g/r;

.field final synthetic b:Lkik/a/g/b;


# direct methods
.method constructor <init>(Lkik/a/g/b;Lcom/kik/g/r;)V
    .locals 0

    .prologue
    .line 273
    iput-object p1, p0, Lkik/a/g/p;->b:Lkik/a/g/b;

    iput-object p2, p0, Lkik/a/g/p;->a:Lcom/kik/g/r;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 4

    .prologue
    const/4 v3, 0x1

    .line 273
    check-cast p1, Lkik/a/f/f/ag;

    invoke-super {p0, p1}, Lcom/kik/g/r;->a(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lkik/a/f/f/ag;->e()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lkik/a/g/p;->b:Lkik/a/g/b;

    invoke-static {v1}, Lkik/a/g/b;->b(Lkik/a/g/b;)Lkik/a/e/r;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v1, v0, v2}, Lkik/a/e/r;->a(Ljava/lang/String;Z)Lkik/a/d/k;

    move-result-object v1

    if-eqz v1, :cond_0

    instance-of v0, v1, Lkik/a/d/n;

    if-eqz v0, :cond_0

    move-object v0, v1

    check-cast v0, Lkik/a/d/n;

    invoke-virtual {p1}, Lkik/a/f/f/ag;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lkik/a/d/n;->f(Ljava/lang/String;)Z

    iget-object v0, p0, Lkik/a/g/p;->b:Lkik/a/g/b;

    invoke-static {v0}, Lkik/a/g/b;->b(Lkik/a/g/b;)Lkik/a/e/r;

    move-result-object v0

    invoke-interface {v0, v1, v3, v3}, Lkik/a/e/r;->a(Lkik/a/d/k;ZZ)Z

    :cond_0
    iget-object v0, p0, Lkik/a/g/p;->b:Lkik/a/g/b;

    invoke-static {v0}, Lkik/a/g/b;->b(Lkik/a/g/b;)Lkik/a/e/r;

    move-result-object v0

    invoke-interface {v0}, Lkik/a/e/r;->j()V

    iget-object v0, p0, Lkik/a/g/p;->a:Lcom/kik/g/r;

    invoke-virtual {v0, p1}, Lcom/kik/g/r;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public final a(Ljava/lang/Throwable;)V
    .locals 1

    .prologue
    .line 294
    invoke-super {p0, p1}, Lcom/kik/g/r;->a(Ljava/lang/Throwable;)V

    .line 295
    iget-object v0, p0, Lkik/a/g/p;->a:Lcom/kik/g/r;

    invoke-virtual {v0, p1}, Lcom/kik/g/r;->a(Ljava/lang/Throwable;)V

    .line 296
    return-void
.end method
