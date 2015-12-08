.class Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap$EntrySet;
.super Lcom/google/inject/internal/util/$ImmutableSet$ArrayImmutableSet;
.source "ImmutableMap.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "EntrySet"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/inject/internal/util/$ImmutableSet$ArrayImmutableSet",
        "<",
        "Ljava/util/Map$Entry",
        "<TK;TV;>;>;"
    }
.end annotation


# instance fields
.field final map:Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap",
            "<TK;TV;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap",
            "<TK;TV;>;)V"
        }
    .end annotation

    .prologue
    .line 657
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap$EntrySet;, "Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap$EntrySet<TK;TV;>;"
    .local p1, "map":Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap;, "Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap<TK;TV;>;"
    # getter for: Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap;->entries:[Ljava/util/Map$Entry;
    invoke-static {p1}, Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap;->access$500(Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap;)[Ljava/util/Map$Entry;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/inject/internal/util/$ImmutableSet$ArrayImmutableSet;-><init>([Ljava/lang/Object;)V

    .line 658
    iput-object p1, p0, Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap$EntrySet;->map:Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap;

    .line 659
    return-void
.end method


# virtual methods
.method public contains(Ljava/lang/Object;)Z
    .locals 5
    .param p1, "target"    # Ljava/lang/Object;

    .prologue
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap$EntrySet;, "Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap$EntrySet<TK;TV;>;"
    const/4 v2, 0x0

    .line 662
    instance-of v3, p1, Ljava/util/Map$Entry;

    if-eqz v3, :cond_0

    move-object v0, p1

    .line 663
    check-cast v0, Ljava/util/Map$Entry;

    .line 664
    .local v0, "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<**>;"
    iget-object v3, p0, Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap$EntrySet;->map:Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .line 665
    .local v1, "mappedValue":Ljava/lang/Object;, "TV;"
    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v2, 0x1

    .line 667
    .end local v0    # "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<**>;"
    .end local v1    # "mappedValue":Ljava/lang/Object;, "TV;"
    :cond_0
    return v2
.end method
