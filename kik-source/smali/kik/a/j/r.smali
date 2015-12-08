.class final Lkik/a/j/r;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/a/j/q;


# direct methods
.method constructor <init>(Lkik/a/j/q;)V
    .locals 0

    .prologue
    .line 123
    iput-object p1, p0, Lkik/a/j/r;->a:Lkik/a/j/q;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 6

    .prologue
    const/4 v5, 0x0

    .line 123
    check-cast p1, Ljava/util/Map;

    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    const-string v0, ""

    invoke-interface {p1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lkik/a/j/r;->a:Lkik/a/j/q;

    iget-object v1, v0, Lkik/a/j/q;->d:Lkik/a/j/o;

    const-string v0, ""

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/ab;

    iget-object v2, p0, Lkik/a/j/r;->a:Lkik/a/j/q;

    iget-object v2, v2, Lkik/a/j/q;->b:[B

    iget-object v3, p0, Lkik/a/j/r;->a:Lkik/a/j/q;

    iget-object v3, v3, Lkik/a/j/q;->c:[B

    invoke-static {v1, v0, v2, v3}, Lkik/a/j/o;->a(Lkik/a/j/o;Lkik/a/d/ab;[B[B)Lkik/a/d/ab;

    move-result-object v0

    iget-object v1, p0, Lkik/a/j/r;->a:Lkik/a/j/q;

    iget-object v1, v1, Lkik/a/j/q;->d:Lkik/a/j/o;

    invoke-virtual {v0}, Lkik/a/d/ab;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Lkik/a/d/ab;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Lkik/a/d/ab;->c()[B

    move-result-object v0

    invoke-virtual {v1, v2, v3, v0, v5}, Lkik/a/j/o;->a(Ljava/lang/String;Ljava/lang/String;[BLjava/lang/Long;)Lcom/kik/g/p;

    :cond_0
    return-void

    :cond_1
    invoke-interface {p1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/ab;

    iget-object v2, p0, Lkik/a/j/r;->a:Lkik/a/j/q;

    iget-object v2, v2, Lkik/a/j/q;->d:Lkik/a/j/o;

    iget-object v3, p0, Lkik/a/j/r;->a:Lkik/a/j/q;

    iget-object v3, v3, Lkik/a/j/q;->b:[B

    iget-object v4, p0, Lkik/a/j/r;->a:Lkik/a/j/q;

    iget-object v4, v4, Lkik/a/j/q;->c:[B

    invoke-static {v2, v0, v3, v4}, Lkik/a/j/o;->a(Lkik/a/j/o;Lkik/a/d/ab;[B[B)Lkik/a/d/ab;

    move-result-object v0

    iget-object v2, p0, Lkik/a/j/r;->a:Lkik/a/j/q;

    iget-object v2, v2, Lkik/a/j/q;->d:Lkik/a/j/o;

    invoke-virtual {v0}, Lkik/a/d/ab;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Lkik/a/d/ab;->b()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Lkik/a/d/ab;->c()[B

    move-result-object v0

    invoke-virtual {v2, v3, v4, v0, v5}, Lkik/a/j/o;->a(Ljava/lang/String;Ljava/lang/String;[BLjava/lang/Long;)Lcom/kik/g/p;

    goto :goto_0
.end method
