.class public Lcom/google/inject/internal/util/$ImmutableList$Builder;
.super Ljava/lang/Object;
.source "ImmutableList.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/inject/internal/util/$ImmutableList;
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
.field private final contents:Ljava/util/ArrayList;
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
    .line 635
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableList$Builder;, "Lcom/google/inject/internal/util/$ImmutableList$Builder<TE;>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 629
    invoke-static {}, Lcom/google/inject/internal/util/$Lists;->newArrayList()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/google/inject/internal/util/$ImmutableList$Builder;->contents:Ljava/util/ArrayList;

    .line 635
    return-void
.end method


# virtual methods
.method public add(Ljava/lang/Object;)Lcom/google/inject/internal/util/$ImmutableList$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)",
            "Lcom/google/inject/internal/util/$ImmutableList$Builder",
            "<TE;>;"
        }
    .end annotation

    .prologue
    .line 645
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableList$Builder;, "Lcom/google/inject/internal/util/$ImmutableList$Builder<TE;>;"
    .local p1, "element":Ljava/lang/Object;, "TE;"
    const-string v0, "element cannot be null"

    invoke-static {p1, v0}, Lcom/google/inject/internal/util/$Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 646
    iget-object v0, p0, Lcom/google/inject/internal/util/$ImmutableList$Builder;->contents:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 647
    return-object p0
.end method

.method public addAll(Ljava/lang/Iterable;)Lcom/google/inject/internal/util/$ImmutableList$Builder;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable",
            "<+TE;>;)",
            "Lcom/google/inject/internal/util/$ImmutableList$Builder",
            "<TE;>;"
        }
    .end annotation

    .prologue
    .line 658
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableList$Builder;, "Lcom/google/inject/internal/util/$ImmutableList$Builder<TE;>;"
    .local p1, "elements":Ljava/lang/Iterable;, "Ljava/lang/Iterable<+TE;>;"
    instance-of v3, p1, Ljava/util/Collection;

    if-eqz v3, :cond_0

    move-object v0, p1

    .line 660
    check-cast v0, Ljava/util/Collection;

    .line 661
    .local v0, "collection":Ljava/util/Collection;, "Ljava/util/Collection<+TE;>;"
    iget-object v3, p0, Lcom/google/inject/internal/util/$ImmutableList$Builder;->contents:Ljava/util/ArrayList;

    iget-object v4, p0, Lcom/google/inject/internal/util/$ImmutableList$Builder;->contents:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v5

    add-int/2addr v4, v5

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->ensureCapacity(I)V

    .line 663
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

    .line 664
    .local v1, "elem":Ljava/lang/Object;, "TE;"
    const-string v3, "elements contains a null"

    invoke-static {v1, v3}, Lcom/google/inject/internal/util/$Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 665
    iget-object v3, p0, Lcom/google/inject/internal/util/$ImmutableList$Builder;->contents:Ljava/util/ArrayList;

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 667
    .end local v1    # "elem":Ljava/lang/Object;, "TE;"
    :cond_1
    return-object p0
.end method

.method public build()Lcom/google/inject/internal/util/$ImmutableList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/inject/internal/util/$ImmutableList",
            "<TE;>;"
        }
    .end annotation

    .prologue
    .line 675
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableList$Builder;, "Lcom/google/inject/internal/util/$ImmutableList$Builder<TE;>;"
    iget-object v0, p0, Lcom/google/inject/internal/util/$ImmutableList$Builder;->contents:Ljava/util/ArrayList;

    invoke-static {v0}, Lcom/google/inject/internal/util/$ImmutableList;->copyOf(Ljava/lang/Iterable;)Lcom/google/inject/internal/util/$ImmutableList;

    move-result-object v0

    return-object v0
.end method
