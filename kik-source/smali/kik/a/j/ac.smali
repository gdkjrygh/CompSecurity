.class final Lkik/a/j/ac;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/a/j/ab;


# direct methods
.method constructor <init>(Lkik/a/j/ab;)V
    .locals 0

    .prologue
    .line 694
    iput-object p1, p0, Lkik/a/j/ac;->a:Lkik/a/j/ab;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 694
    iget-object v0, p0, Lkik/a/j/ac;->a:Lkik/a/j/ab;

    iget-object v0, v0, Lkik/a/j/ab;->d:Lkik/a/j/u;

    invoke-static {v0}, Lkik/a/j/u;->g(Lkik/a/j/u;)Lkik/a/e/x;

    move-result-object v0

    iget-object v1, p0, Lkik/a/j/ac;->a:Lkik/a/j/ab;

    iget-object v1, v1, Lkik/a/j/ab;->b:Ljava/util/List;

    invoke-interface {v0, v1}, Lkik/a/e/x;->a(Ljava/util/List;)Lcom/kik/g/p;

    move-result-object v0

    iget-object v1, p0, Lkik/a/j/ac;->a:Lkik/a/j/ab;

    iget-object v1, v1, Lkik/a/j/ab;->c:Lcom/kik/g/p;

    invoke-static {v0, v1}, Lcom/kik/g/s;->b(Lcom/kik/g/p;Lcom/kik/g/p;)Lcom/kik/g/p;

    return-void
.end method

.method public final a(Ljava/lang/Throwable;)V
    .locals 3

    .prologue
    .line 707
    instance-of v0, p1, Lkik/a/f/q;

    if-eqz v0, :cond_0

    move-object v0, p1

    .line 708
    check-cast v0, Lkik/a/f/q;

    .line 710
    invoke-virtual {v0}, Lkik/a/f/q;->a()I

    move-result v1

    const/16 v2, 0xca

    if-ne v1, v2, :cond_0

    .line 711
    invoke-virtual {v0}, Lkik/a/f/q;->b()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    .line 714
    iget-object v2, p0, Lkik/a/j/ac;->a:Lkik/a/j/ab;

    iget-object v2, v2, Lkik/a/j/ab;->d:Lkik/a/j/u;

    invoke-static {v2}, Lkik/a/j/u;->g(Lkik/a/j/u;)Lkik/a/e/x;

    move-result-object v2

    invoke-interface {v2, v1}, Lkik/a/e/x;->a(Ljava/util/List;)Lcom/kik/g/p;

    move-result-object v1

    new-instance v2, Lkik/a/j/ad;

    invoke-direct {v2, p0, v0}, Lkik/a/j/ad;-><init>(Lkik/a/j/ac;Lkik/a/f/q;)V

    invoke-virtual {v1, v2}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    .line 727
    :goto_0
    return-void

    .line 726
    :cond_0
    iget-object v0, p0, Lkik/a/j/ac;->a:Lkik/a/j/ab;

    iget-object v0, v0, Lkik/a/j/ab;->c:Lcom/kik/g/p;

    invoke-virtual {v0, p1}, Lcom/kik/g/p;->a(Ljava/lang/Throwable;)V

    goto :goto_0
.end method
