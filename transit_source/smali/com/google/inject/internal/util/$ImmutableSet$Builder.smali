.class public Lcom/google/inject/internal/util/$ImmutableSet$Builder;
.super Ljava/lang/Object;
.source "ImmutableSet.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/inject/internal/util/$ImmutableSet;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Builder"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field final contents:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<TE;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 575
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableSet$Builder;, "Lcom/google/inject/internal/util/$ImmutableSet$Builder<TE;>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 569
    invoke-static {}, Lcom/google/inject/internal/util/$Lists;->newArrayList()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/google/inject/internal/util/$ImmutableSet$Builder;->contents:Ljava/util/ArrayList;

    .line 575
    return-void
.end method


# virtual methods
.method public add(Ljava/lang/Object;)Lcom/google/inject/internal/util/$ImmutableSet$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)",
            "Lcom/google/inject/internal/util/$ImmutableSet$Builder",
            "<TE;>;"
        }
    .end annotation

    .prologue
    .line 588
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableSet$Builder;, "Lcom/google/inject/internal/util/$ImmutableSet$Builder<TE;>;"
    .local p1, "element":Ljava/lang/Object;, "TE;"
    const-string v0, "element cannot be null"

    invoke-static {p1, v0}, Lcom/google/inject/internal/util/$Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 589
    iget-object v0, p0, Lcom/google/inject/internal/util/$ImmutableSet$Builder;->contents:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 590
    return-object p0
.end method

.method public varargs add([Ljava/lang/Object;)Lcom/google/inject/internal/util/$ImmutableSet$Builder;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([TE;)",
            "Lcom/google/inject/internal/util/$ImmutableSet$Builder",
            "<TE;>;"
        }
    .end annotation

    .prologue
    .line 602
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableSet$Builder;, "Lcom/google/inject/internal/util/$ImmutableSet$Builder<TE;>;"
    .local p1, "elements":[Ljava/lang/Object;, "[TE;"
    const-string v1, "elements cannot be null"

    invoke-static {p1, v1}, Lcom/google/inject/internal/util/$Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 603
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    .line 604
    .local v0, "elemsAsList":Ljava/util/List;, "Ljava/util/List<TE;>;"
    const-string v1, "elements cannot contain null"

    invoke-static {v0, v1}, Lcom/google/inject/internal/util/$Preconditions;->checkContentsNotNull(Ljava/lang/Iterable;Ljava/lang/Object;)Ljava/lang/Iterable;

    .line 606
    iget-object v1, p0, Lcom/google/inject/internal/util/$ImmutableSet$Builder;->contents:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 607
    return-object p0
.end method

.method public addAll(Ljava/lang/Iterable;)Lcom/google/inject/internal/util/$ImmutableSet$Builder;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable",
            "<+TE;>;)",
            "Lcom/google/inject/internal/util/$ImmutableSet$Builder",
            "<TE;>;"
        }
    .end annotation

    .prologue
    .line 619
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableSet$Builder;, "Lcom/google/inject/internal/util/$ImmutableSet$Builder<TE;>;"
    .local p1, "elements":Ljava/lang/Iterable;, "Ljava/lang/Iterable<+TE;>;"
    instance-of v3, p1, Ljava/util/Collection;

    if-eqz v3, :cond_0

    move-object v0, p1

    .line 621
    check-cast v0, Ljava/util/Collection;

    .line 622
    .local v0, "collection":Ljava/util/Collection;, "Ljava/util/Collection<+TE;>;"
    iget-object v3, p0, Lcom/google/inject/internal/util/$ImmutableSet$Builder;->contents:Ljava/util/ArrayList;

    iget-object v4, p0, Lcom/google/inject/internal/util/$ImmutableSet$Builder;->contents:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v5

    add-int/2addr v4, v5

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->ensureCapacity(I)V

    .line 624
    .end local v0    # "collection":Ljava/util/Collection;, "Ljava/util/Collection<+TE;>;"
    :cond_0
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .local v2, "i$":Ljava/util/Iterator;
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 625
    .local v1, "elem":Ljava/lang/Object;, "TE;"
    const-string v3, "elements contains a null"

    invoke-static {v1, v3}, Lcom/google/inject/internal/util/$Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 626
    iget-object v3, p0, Lcom/google/inject/internal/util/$ImmutableSet$Builder;->contents:Ljava/util/ArrayList;

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 628
    .end local v1    # "elem":Ljava/lang/Object;, "TE;"
    :cond_1
    return-object p0
.end method

.method public addAll(Ljava/util/Iterator;)Lcom/google/inject/internal/util/$ImmutableSet$Builder;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Iterator",
            "<+TE;>;)",
            "Lcom/google/inject/internal/util/$ImmutableSet$Builder",
            "<TE;>;"
        }
    .end annotation

    .prologue
    .line 640
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableSet$Builder;, "Lcom/google/inject/internal/util/$ImmutableSet$Builder<TE;>;"
    .local p1, "elements":Ljava/util/Iterator;, "Ljava/util/Iterator<+TE;>;"
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 641
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .line 642
    .local v0, "element":Ljava/lang/Object;, "TE;"
    const-string v1, "element cannot be null"

    invoke-static {v0, v1}, Lcom/google/inject/internal/util/$Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 643
    iget-object v1, p0, Lcom/google/inject/internal/util/$ImmutableSet$Builder;->contents:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 645
    .end local v0    # "element":Ljava/lang/Object;, "TE;"
    :cond_0
    return-object p0
.end method

.method public build()Lcom/google/inject/internal/util/$ImmutableSet;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/inject/internal/util/$ImmutableSet",
            "<TE;>;"
        }
    .end annotation

    .prologue
    .line 653
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableSet$Builder;, "Lcom/google/inject/internal/util/$ImmutableSet$Builder<TE;>;"
    iget-object v0, p0, Lcom/google/inject/internal/util/$ImmutableSet$Builder;->contents:Ljava/util/ArrayList;

    invoke-static {v0}, Lcom/google/inject/internal/util/$ImmutableSet;->copyOf(Ljava/lang/Iterable;)Lcom/google/inject/internal/util/$ImmutableSet;

    move-result-object v0

    return-object v0
.end method
