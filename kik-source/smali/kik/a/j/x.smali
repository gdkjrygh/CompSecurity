.class final Lkik/a/j/x;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/a/j/u;


# direct methods
.method constructor <init>(Lkik/a/j/u;)V
    .locals 0

    .prologue
    .line 419
    iput-object p1, p0, Lkik/a/j/x;->a:Lkik/a/j/u;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    .prologue
    .line 448
    iget-object v0, p0, Lkik/a/j/x;->a:Lkik/a/j/u;

    invoke-static {v0}, Lkik/a/j/u;->f(Lkik/a/j/u;)Z

    .line 449
    return-void
.end method

.method public final synthetic a(Ljava/lang/Object;)V
    .locals 5

    .prologue
    .line 419
    check-cast p1, Ljava/util/List;

    if-eqz p1, :cond_2

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/ab;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lkik/a/d/ab;->e()Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lkik/a/j/x;->a:Lkik/a/j/u;

    invoke-static {v4}, Lkik/a/j/u;->e(Lkik/a/j/u;)Ljava/util/Map;

    move-result-object v4

    invoke-interface {v4, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_2

    iget-object v0, p0, Lkik/a/j/x;->a:Lkik/a/j/u;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lkik/a/j/u;->a(Ljava/util/List;Ljava/lang/Long;)Lcom/kik/g/p;

    :cond_2
    return-void
.end method
