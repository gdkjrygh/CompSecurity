.class public Lcom/facebook/common/b/f;
.super Ljava/lang/Object;
.source "TopologicalSort.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    return-void
.end method

.method public static a(Ljava/util/Collection;)Lcom/google/common/a/es;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Collection",
            "<",
            "Lcom/facebook/common/b/h",
            "<TT;>;>;)",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/common/b/h",
            "<TT;>;>;"
        }
    .end annotation

    .prologue
    .line 54
    invoke-static {}, Lcom/google/common/a/kl;->b()Ljava/util/LinkedHashSet;

    move-result-object v1

    .line 55
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/common/b/h;

    .line 56
    iget-object v3, v0, Lcom/facebook/common/b/h;->b:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 57
    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 61
    :cond_1
    invoke-static {}, Lcom/google/common/a/es;->e()Lcom/google/common/a/et;

    move-result-object v2

    .line 62
    :cond_2
    invoke-interface {v1}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_4

    .line 63
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/common/b/h;

    .line 64
    invoke-interface {v1, v0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 65
    invoke-virtual {v2, v0}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    .line 66
    iget-object v0, v0, Lcom/facebook/common/b/h;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_3
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 67
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/common/b/g;

    .line 68
    iget-object v4, v0, Lcom/facebook/common/b/g;->b:Lcom/facebook/common/b/h;

    .line 69
    invoke-interface {v3}, Ljava/util/Iterator;->remove()V

    .line 70
    iget-object v5, v4, Lcom/facebook/common/b/h;->b:Ljava/util/List;

    invoke-interface {v5, v0}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 71
    iget-object v0, v4, Lcom/facebook/common/b/h;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 72
    invoke-interface {v1, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 77
    :cond_4
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/common/b/h;

    .line 78
    iget-object v0, v0, Lcom/facebook/common/b/h;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_5

    .line 79
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Cycle in background tasks dependencies"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 82
    :cond_6
    invoke-virtual {v2}, Lcom/google/common/a/et;->b()Lcom/google/common/a/es;

    move-result-object v0

    return-object v0
.end method
