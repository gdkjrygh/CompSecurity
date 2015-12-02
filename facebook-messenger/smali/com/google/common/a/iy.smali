.class abstract Lcom/google/common/a/iy;
.super Ljava/util/AbstractCollection;
.source "Multimaps.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/util/AbstractCollection",
        "<",
        "Ljava/util/Map$Entry",
        "<TK;TV;>;>;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 2043
    invoke-direct {p0}, Ljava/util/AbstractCollection;-><init>()V

    return-void
.end method


# virtual methods
.method abstract a()Lcom/google/common/a/iw;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/iw",
            "<TK;TV;>;"
        }
    .end annotation
.end method

.method public clear()V
    .locals 1

    .prologue
    .line 2068
    invoke-virtual {p0}, Lcom/google/common/a/iy;->a()Lcom/google/common/a/iw;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/common/a/iw;->f()V

    .line 2069
    return-void
.end method

.method public contains(Ljava/lang/Object;)Z
    .locals 3
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 2052
    instance-of v0, p1, Ljava/util/Map$Entry;

    if-eqz v0, :cond_0

    .line 2053
    check-cast p1, Ljava/util/Map$Entry;

    .line 2054
    invoke-virtual {p0}, Lcom/google/common/a/iy;->a()Lcom/google/common/a/iw;

    move-result-object v0

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/google/common/a/iw;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    .line 2056
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public remove(Ljava/lang/Object;)Z
    .locals 3
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 2060
    instance-of v0, p1, Ljava/util/Map$Entry;

    if-eqz v0, :cond_0

    .line 2061
    check-cast p1, Ljava/util/Map$Entry;

    .line 2062
    invoke-virtual {p0}, Lcom/google/common/a/iy;->a()Lcom/google/common/a/iw;

    move-result-object v0

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/google/common/a/iw;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    .line 2064
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public size()I
    .locals 1

    .prologue
    .line 2048
    invoke-virtual {p0}, Lcom/google/common/a/iy;->a()Lcom/google/common/a/iw;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/common/a/iw;->d()I

    move-result v0

    return v0
.end method
