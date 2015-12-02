.class public Lcom/google/common/a/fu;
.super Lcom/google/common/a/ew;
.source "ImmutableSortedMap.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/common/a/ew",
        "<TK;TV;>;"
    }
.end annotation


# instance fields
.field private final b:Ljava/util/Comparator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Comparator",
            "<-TK;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/Comparator;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Comparator",
            "<-TK;>;)V"
        }
    .end annotation

    .prologue
    .line 358
    invoke-direct {p0}, Lcom/google/common/a/ew;-><init>()V

    .line 359
    invoke-static {p1}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Comparator;

    iput-object v0, p0, Lcom/google/common/a/fu;->b:Ljava/util/Comparator;

    .line 360
    return-void
.end method


# virtual methods
.method public a()Lcom/google/common/a/fp;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/fp",
            "<TK;TV;>;"
        }
    .end annotation

    .prologue
    .line 393
    iget-object v0, p0, Lcom/google/common/a/fu;->a:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/google/common/a/fu;->b:Ljava/util/Comparator;

    invoke-static {v0, v1}, Lcom/google/common/a/fp;->a(Ljava/util/List;Ljava/util/Comparator;)V

    .line 394
    iget-object v0, p0, Lcom/google/common/a/fu;->a:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/google/common/a/fu;->b:Ljava/util/Comparator;

    invoke-static {v0, v1}, Lcom/google/common/a/fp;->b(Ljava/util/List;Ljava/util/Comparator;)V

    .line 395
    new-instance v0, Lcom/google/common/a/fp;

    iget-object v1, p0, Lcom/google/common/a/fu;->a:Ljava/util/ArrayList;

    invoke-static {v1}, Lcom/google/common/a/es;->a(Ljava/util/Collection;)Lcom/google/common/a/es;

    move-result-object v1

    iget-object v2, p0, Lcom/google/common/a/fu;->b:Ljava/util/Comparator;

    invoke-direct {v0, v1, v2}, Lcom/google/common/a/fp;-><init>(Lcom/google/common/a/es;Ljava/util/Comparator;)V

    return-object v0
.end method

.method public a(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/fu;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;)",
            "Lcom/google/common/a/fu",
            "<TK;TV;>;"
        }
    .end annotation

    .prologue
    .line 368
    iget-object v0, p0, Lcom/google/common/a/fu;->a:Ljava/util/ArrayList;

    invoke-static {p1, p2}, Lcom/google/common/a/ev;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 369
    return-object p0
.end method

.method public a(Ljava/util/Map;)Lcom/google/common/a/fu;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<+TK;+TV;>;)",
            "Lcom/google/common/a/fu",
            "<TK;TV;>;"
        }
    .end annotation

    .prologue
    .line 380
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 381
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v2, v0}, Lcom/google/common/a/fu;->a(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/fu;

    goto :goto_0

    .line 383
    :cond_0
    return-object p0
.end method

.method public synthetic b()Lcom/google/common/a/ev;
    .locals 1

    .prologue
    .line 351
    invoke-virtual {p0}, Lcom/google/common/a/fu;->a()Lcom/google/common/a/fp;

    move-result-object v0

    return-object v0
.end method

.method public synthetic b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;
    .locals 1

    .prologue
    .line 351
    invoke-virtual {p0, p1, p2}, Lcom/google/common/a/fu;->a(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/fu;

    move-result-object v0

    return-object v0
.end method

.method public synthetic b(Ljava/util/Map;)Lcom/google/common/a/ew;
    .locals 1

    .prologue
    .line 351
    invoke-virtual {p0, p1}, Lcom/google/common/a/fu;->a(Ljava/util/Map;)Lcom/google/common/a/fu;

    move-result-object v0

    return-object v0
.end method
