.class public final Lcom/google/inject/internal/util/$Collections2;
.super Ljava/lang/Object;
.source "Collections2.java"


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static setEquals(Ljava/util/Set;Ljava/lang/Object;)Z
    .locals 5
    .param p1, "object"    # Ljava/lang/Object;
        .annotation runtime Lcom/google/inject/internal/util/$Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set",
            "<*>;",
            "Ljava/lang/Object;",
            ")Z"
        }
    .end annotation

    .prologue
    .local p0, "thisSet":Ljava/util/Set;, "Ljava/util/Set<*>;"
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 43
    if-ne p1, p0, :cond_1

    .line 51
    :cond_0
    :goto_0
    return v1

    .line 46
    :cond_1
    instance-of v3, p1, Ljava/util/Set;

    if-eqz v3, :cond_3

    move-object v0, p1

    .line 47
    check-cast v0, Ljava/util/Set;

    .line 48
    .local v0, "thatSet":Ljava/util/Set;, "Ljava/util/Set<*>;"
    invoke-interface {p0}, Ljava/util/Set;->size()I

    move-result v3

    invoke-interface {v0}, Ljava/util/Set;->size()I

    move-result v4

    if-ne v3, v4, :cond_2

    invoke-interface {p0, v0}, Ljava/util/Set;->containsAll(Ljava/util/Collection;)Z

    move-result v3

    if-nez v3, :cond_0

    :cond_2
    move v1, v2

    goto :goto_0

    .end local v0    # "thatSet":Ljava/util/Set;, "Ljava/util/Set<*>;"
    :cond_3
    move v1, v2

    .line 51
    goto :goto_0
.end method

.method static toCollection(Ljava/lang/Iterable;)Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Iterable",
            "<TE;>;)",
            "Ljava/util/Collection",
            "<TE;>;"
        }
    .end annotation

    .prologue
    .line 38
    .local p0, "iterable":Ljava/lang/Iterable;, "Ljava/lang/Iterable<TE;>;"
    instance-of v0, p0, Ljava/util/Collection;

    if-eqz v0, :cond_0

    check-cast p0, Ljava/util/Collection;

    .end local p0    # "iterable":Ljava/lang/Iterable;, "Ljava/lang/Iterable<TE;>;"
    :goto_0
    return-object p0

    .restart local p0    # "iterable":Ljava/lang/Iterable;, "Ljava/lang/Iterable<TE;>;"
    :cond_0
    invoke-static {p0}, Lcom/google/inject/internal/util/$Lists;->newArrayList(Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object p0

    goto :goto_0
.end method
