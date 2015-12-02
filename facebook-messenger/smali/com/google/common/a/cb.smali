.class final Lcom/google/common/a/cb;
.super Ljava/util/AbstractSet;
.source "CustomConcurrentHashMap.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/AbstractSet",
        "<",
        "Ljava/util/Map$Entry",
        "<TK;TV;>;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/common/a/bj;


# direct methods
.method constructor <init>(Lcom/google/common/a/bj;)V
    .locals 0

    .prologue
    .line 3885
    iput-object p1, p0, Lcom/google/common/a/cb;->a:Lcom/google/common/a/bj;

    invoke-direct {p0}, Ljava/util/AbstractSet;-><init>()V

    return-void
.end method


# virtual methods
.method public clear()V
    .locals 1

    .prologue
    .line 3929
    iget-object v0, p0, Lcom/google/common/a/cb;->a:Lcom/google/common/a/bj;

    invoke-virtual {v0}, Lcom/google/common/a/bj;->clear()V

    .line 3930
    return-void
.end method

.method public contains(Ljava/lang/Object;)Z
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 3894
    instance-of v1, p1, Ljava/util/Map$Entry;

    if-nez v1, :cond_1

    .line 3904
    :cond_0
    :goto_0
    return v0

    .line 3897
    :cond_1
    check-cast p1, Ljava/util/Map$Entry;

    .line 3898
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    .line 3899
    if-eqz v1, :cond_0

    .line 3902
    iget-object v2, p0, Lcom/google/common/a/cb;->a:Lcom/google/common/a/bj;

    invoke-virtual {v2, v1}, Lcom/google/common/a/bj;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .line 3904
    if-eqz v1, :cond_0

    iget-object v2, p0, Lcom/google/common/a/cb;->a:Lcom/google/common/a/bj;

    iget-object v2, v2, Lcom/google/common/a/bj;->g:Lcom/google/common/base/Equivalence;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v3, v1}, Lcom/google/common/base/Equivalence;->equivalent(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0
.end method

.method public isEmpty()Z
    .locals 1

    .prologue
    .line 3924
    iget-object v0, p0, Lcom/google/common/a/cb;->a:Lcom/google/common/a/bj;

    invoke-virtual {v0}, Lcom/google/common/a/bj;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator",
            "<",
            "Ljava/util/Map$Entry",
            "<TK;TV;>;>;"
        }
    .end annotation

    .prologue
    .line 3889
    new-instance v0, Lcom/google/common/a/ca;

    iget-object v1, p0, Lcom/google/common/a/cb;->a:Lcom/google/common/a/bj;

    invoke-direct {v0, v1}, Lcom/google/common/a/ca;-><init>(Lcom/google/common/a/bj;)V

    return-object v0
.end method

.method public remove(Ljava/lang/Object;)Z
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 3909
    instance-of v1, p1, Ljava/util/Map$Entry;

    if-nez v1, :cond_1

    .line 3914
    :cond_0
    :goto_0
    return v0

    .line 3912
    :cond_1
    check-cast p1, Ljava/util/Map$Entry;

    .line 3913
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    .line 3914
    if-eqz v1, :cond_0

    iget-object v2, p0, Lcom/google/common/a/cb;->a:Lcom/google/common/a/bj;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v1, v3}, Lcom/google/common/a/bj;->remove(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0
.end method

.method public size()I
    .locals 1

    .prologue
    .line 3919
    iget-object v0, p0, Lcom/google/common/a/cb;->a:Lcom/google/common/a/bj;

    invoke-virtual {v0}, Lcom/google/common/a/bj;->size()I

    move-result v0

    return v0
.end method
