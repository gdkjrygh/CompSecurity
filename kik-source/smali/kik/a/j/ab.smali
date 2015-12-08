.class final Lkik/a/j/ab;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Ljava/lang/Long;

.field final synthetic b:Ljava/util/List;

.field final synthetic c:Lcom/kik/g/p;

.field final synthetic d:Lkik/a/j/u;


# direct methods
.method constructor <init>(Lkik/a/j/u;Ljava/lang/Long;Ljava/util/List;Lcom/kik/g/p;)V
    .locals 0

    .prologue
    .line 664
    iput-object p1, p0, Lkik/a/j/ab;->d:Lkik/a/j/u;

    iput-object p2, p0, Lkik/a/j/ab;->a:Ljava/lang/Long;

    iput-object p3, p0, Lkik/a/j/ab;->b:Ljava/util/List;

    iput-object p4, p0, Lkik/a/j/ab;->c:Lcom/kik/g/p;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 8

    .prologue
    .line 669
    iget-object v0, p0, Lkik/a/j/ab;->a:Ljava/lang/Long;

    if-nez v0, :cond_1

    .line 673
    iget-object v0, p0, Lkik/a/j/ab;->d:Lkik/a/j/u;

    invoke-static {v0}, Lkik/a/j/u;->b(Lkik/a/j/u;)Lkik/a/e/f;

    move-result-object v0

    invoke-interface {v0}, Lkik/a/e/f;->k()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 674
    iget-object v0, p0, Lkik/a/j/ab;->d:Lkik/a/j/u;

    invoke-static {v0}, Lkik/a/j/u;->b(Lkik/a/j/u;)Lkik/a/e/f;

    move-result-object v0

    new-instance v1, Lkik/a/f/f/aq;

    iget-object v2, p0, Lkik/a/j/ab;->b:Ljava/util/List;

    invoke-direct {v1, v2}, Lkik/a/f/f/aq;-><init>(Ljava/util/List;)V

    invoke-interface {v0, v1}, Lkik/a/e/f;->a(Lkik/a/f/f/z;)Lcom/kik/g/p;

    move-result-object v0

    .line 694
    :goto_0
    new-instance v1, Lkik/a/j/ac;

    invoke-direct {v1, p0}, Lkik/a/j/ac;-><init>(Lkik/a/j/ab;)V

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    .line 729
    return-void

    .line 677
    :cond_0
    new-instance v0, Ljava/util/concurrent/TimeoutException;

    const-string v1, "Network not connected"

    invoke-direct {v0, v1}, Ljava/util/concurrent/TimeoutException;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lcom/kik/g/s;->a(Ljava/lang/Throwable;)Lcom/kik/g/p;

    move-result-object v0

    .line 679
    iget-object v1, p0, Lkik/a/j/ab;->d:Lkik/a/j/u;

    invoke-static {v1}, Lkik/a/j/u;->b(Lkik/a/j/u;)Lkik/a/e/f;

    move-result-object v1

    invoke-interface {v1}, Lkik/a/e/f;->o()V

    goto :goto_0

    .line 683
    :cond_1
    invoke-static {}, Lkik/a/h/j;->b()J

    move-result-wide v2

    .line 685
    iget-object v0, p0, Lkik/a/j/ab;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/ab;

    .line 686
    iget-object v4, p0, Lkik/a/j/ab;->d:Lkik/a/j/u;

    invoke-static {v4}, Lkik/a/j/u;->e(Lkik/a/j/u;)Ljava/util/Map;

    move-result-object v4

    invoke-virtual {v0}, Lkik/a/d/ab;->e()Ljava/lang/String;

    move-result-object v0

    iget-object v5, p0, Lkik/a/j/ab;->a:Ljava/lang/Long;

    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    add-long/2addr v6, v2

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-interface {v4, v0, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 689
    :cond_2
    iget-object v0, p0, Lkik/a/j/ab;->d:Lkik/a/j/u;

    invoke-static {v0}, Lkik/a/j/u;->d(Lkik/a/j/u;)V

    .line 691
    new-instance v0, Ljava/util/concurrent/TimeoutException;

    const-string v1, "Flush scheduled"

    invoke-direct {v0, v1}, Ljava/util/concurrent/TimeoutException;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lcom/kik/g/s;->a(Ljava/lang/Throwable;)Lcom/kik/g/p;

    move-result-object v0

    goto :goto_0
.end method

.method public final a(Ljava/lang/Throwable;)V
    .locals 1

    .prologue
    .line 734
    iget-object v0, p0, Lkik/a/j/ab;->c:Lcom/kik/g/p;

    invoke-virtual {v0, p1}, Lcom/kik/g/p;->a(Ljava/lang/Throwable;)V

    .line 735
    return-void
.end method
