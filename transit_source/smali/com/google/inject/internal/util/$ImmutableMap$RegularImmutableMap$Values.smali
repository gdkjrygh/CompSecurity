.class Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap$Values;
.super Lcom/google/inject/internal/util/$ImmutableCollection;
.source "ImmutableMap.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "Values"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<V:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/inject/internal/util/$ImmutableCollection",
        "<TV;>;"
    }
.end annotation


# instance fields
.field final map:Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap",
            "<*TV;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap",
            "<*TV;>;)V"
        }
    .end annotation

    .prologue
    .line 706
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap$Values;, "Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap$Values<TV;>;"
    .local p1, "map":Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap;, "Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap<*TV;>;"
    invoke-direct {p0}, Lcom/google/inject/internal/util/$ImmutableCollection;-><init>()V

    .line 707
    iput-object p1, p0, Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap$Values;->map:Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap;

    .line 708
    return-void
.end method


# virtual methods
.method public contains(Ljava/lang/Object;)Z
    .locals 1
    .param p1, "target"    # Ljava/lang/Object;

    .prologue
    .line 733
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap$Values;, "Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap$Values<TV;>;"
    iget-object v0, p0, Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap$Values;->map:Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap;

    invoke-virtual {v0, p1}, Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap;->containsValue(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public isEmpty()Z
    .locals 1

    .prologue
    .line 715
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap$Values;, "Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap$Values<TV;>;"
    const/4 v0, 0x0

    return v0
.end method

.method public iterator()Lcom/google/inject/internal/util/$UnmodifiableIterator;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/inject/internal/util/$UnmodifiableIterator",
            "<TV;>;"
        }
    .end annotation

    .prologue
    .line 719
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap$Values;, "Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap$Values<TV;>;"
    new-instance v0, Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap$Values$1;

    invoke-direct {v0, p0}, Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap$Values$1;-><init>(Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap$Values;)V

    .line 729
    .local v0, "iterator":Ljava/util/Iterator;, "Ljava/util/Iterator<TV;>;"
    invoke-static {v0}, Lcom/google/inject/internal/util/$Iterators;->unmodifiableIterator(Ljava/util/Iterator;)Lcom/google/inject/internal/util/$UnmodifiableIterator;

    move-result-object v1

    return-object v1
.end method

.method public bridge synthetic iterator()Ljava/util/Iterator;
    .locals 1

    .prologue
    .line 703
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap$Values;, "Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap$Values<TV;>;"
    invoke-virtual {p0}, Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap$Values;->iterator()Lcom/google/inject/internal/util/$UnmodifiableIterator;

    move-result-object v0

    return-object v0
.end method

.method public size()I
    .locals 1

    .prologue
    .line 711
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap$Values;, "Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap$Values<TV;>;"
    iget-object v0, p0, Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap$Values;->map:Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap;

    # getter for: Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap;->entries:[Ljava/util/Map$Entry;
    invoke-static {v0}, Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap;->access$500(Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap;)[Ljava/util/Map$Entry;

    move-result-object v0

    array-length v0, v0

    return v0
.end method
