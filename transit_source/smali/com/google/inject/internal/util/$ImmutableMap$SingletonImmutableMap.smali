.class final Lcom/google/inject/internal/util/$ImmutableMap$SingletonImmutableMap;
.super Lcom/google/inject/internal/util/$ImmutableMap;
.source "ImmutableMap.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/inject/internal/util/$ImmutableMap;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "SingletonImmutableMap"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/inject/internal/util/$ImmutableMap$SingletonImmutableMap$Values;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/inject/internal/util/$ImmutableMap",
        "<TK;TV;>;"
    }
.end annotation


# instance fields
.field private transient entry:Ljava/util/Map$Entry;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map$Entry",
            "<TK;TV;>;"
        }
    .end annotation
.end field

.field private transient entrySet:Lcom/google/inject/internal/util/$ImmutableSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/inject/internal/util/$ImmutableSet",
            "<",
            "Ljava/util/Map$Entry",
            "<TK;TV;>;>;"
        }
    .end annotation
.end field

.field private transient keySet:Lcom/google/inject/internal/util/$ImmutableSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/inject/internal/util/$ImmutableSet",
            "<TK;>;"
        }
    .end annotation
.end field

.field private final transient singleKey:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TK;"
        }
    .end annotation
.end field

.field private final transient singleValue:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TV;"
        }
    .end annotation
.end field

.field private transient values:Lcom/google/inject/internal/util/$ImmutableCollection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/inject/internal/util/$ImmutableCollection",
            "<TV;>;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;)V"
        }
    .end annotation

    .prologue
    .line 446
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableMap$SingletonImmutableMap;, "Lcom/google/inject/internal/util/$ImmutableMap$SingletonImmutableMap<TK;TV;>;"
    .local p1, "singleKey":Ljava/lang/Object;, "TK;"
    .local p2, "singleValue":Ljava/lang/Object;, "TV;"
    invoke-direct {p0}, Lcom/google/inject/internal/util/$ImmutableMap;-><init>()V

    .line 447
    iput-object p1, p0, Lcom/google/inject/internal/util/$ImmutableMap$SingletonImmutableMap;->singleKey:Ljava/lang/Object;

    .line 448
    iput-object p2, p0, Lcom/google/inject/internal/util/$ImmutableMap$SingletonImmutableMap;->singleValue:Ljava/lang/Object;

    .line 449
    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Lcom/google/inject/internal/util/$ImmutableMap$1;)V
    .locals 0
    .param p1, "x0"    # Ljava/lang/Object;
    .param p2, "x1"    # Ljava/lang/Object;
    .param p3, "x2"    # Lcom/google/inject/internal/util/$ImmutableMap$1;

    .prologue
    .line 440
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableMap$SingletonImmutableMap;, "Lcom/google/inject/internal/util/$ImmutableMap$SingletonImmutableMap<TK;TV;>;"
    invoke-direct {p0, p1, p2}, Lcom/google/inject/internal/util/$ImmutableMap$SingletonImmutableMap;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method private constructor <init>(Ljava/util/Map$Entry;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map$Entry",
            "<TK;TV;>;)V"
        }
    .end annotation

    .prologue
    .line 451
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableMap$SingletonImmutableMap;, "Lcom/google/inject/internal/util/$ImmutableMap$SingletonImmutableMap<TK;TV;>;"
    .local p1, "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<TK;TV;>;"
    invoke-direct {p0}, Lcom/google/inject/internal/util/$ImmutableMap;-><init>()V

    .line 452
    iput-object p1, p0, Lcom/google/inject/internal/util/$ImmutableMap$SingletonImmutableMap;->entry:Ljava/util/Map$Entry;

    .line 453
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lcom/google/inject/internal/util/$ImmutableMap$SingletonImmutableMap;->singleKey:Ljava/lang/Object;

    .line 454
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lcom/google/inject/internal/util/$ImmutableMap$SingletonImmutableMap;->singleValue:Ljava/lang/Object;

    .line 455
    return-void
.end method

.method synthetic constructor <init>(Ljava/util/Map$Entry;Lcom/google/inject/internal/util/$ImmutableMap$1;)V
    .locals 0
    .param p1, "x0"    # Ljava/util/Map$Entry;
    .param p2, "x1"    # Lcom/google/inject/internal/util/$ImmutableMap$1;

    .prologue
    .line 440
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableMap$SingletonImmutableMap;, "Lcom/google/inject/internal/util/$ImmutableMap$SingletonImmutableMap<TK;TV;>;"
    invoke-direct {p0, p1}, Lcom/google/inject/internal/util/$ImmutableMap$SingletonImmutableMap;-><init>(Ljava/util/Map$Entry;)V

    return-void
.end method

.method private entry()Ljava/util/Map$Entry;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map$Entry",
            "<TK;TV;>;"
        }
    .end annotation

    .prologue
    .line 458
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableMap$SingletonImmutableMap;, "Lcom/google/inject/internal/util/$ImmutableMap$SingletonImmutableMap<TK;TV;>;"
    iget-object v0, p0, Lcom/google/inject/internal/util/$ImmutableMap$SingletonImmutableMap;->entry:Ljava/util/Map$Entry;

    .line 459
    .local v0, "e":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<TK;TV;>;"
    if-nez v0, :cond_0

    iget-object v1, p0, Lcom/google/inject/internal/util/$ImmutableMap$SingletonImmutableMap;->singleKey:Ljava/lang/Object;

    iget-object v2, p0, Lcom/google/inject/internal/util/$ImmutableMap$SingletonImmutableMap;->singleValue:Ljava/lang/Object;

    invoke-static {v1, v2}, Lcom/google/inject/internal/util/$Maps;->immutableEntry(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object v0

    .end local v0    # "e":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<TK;TV;>;"
    iput-object v0, p0, Lcom/google/inject/internal/util/$ImmutableMap$SingletonImmutableMap;->entry:Ljava/util/Map$Entry;

    :cond_0
    return-object v0
.end method


# virtual methods
.method public containsKey(Ljava/lang/Object;)Z
    .locals 1
    .param p1, "key"    # Ljava/lang/Object;

    .prologue
    .line 476
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableMap$SingletonImmutableMap;, "Lcom/google/inject/internal/util/$ImmutableMap$SingletonImmutableMap<TK;TV;>;"
    iget-object v0, p0, Lcom/google/inject/internal/util/$ImmutableMap$SingletonImmutableMap;->singleKey:Ljava/lang/Object;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public containsValue(Ljava/lang/Object;)Z
    .locals 1
    .param p1, "value"    # Ljava/lang/Object;

    .prologue
    .line 480
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableMap$SingletonImmutableMap;, "Lcom/google/inject/internal/util/$ImmutableMap$SingletonImmutableMap<TK;TV;>;"
    iget-object v0, p0, Lcom/google/inject/internal/util/$ImmutableMap$SingletonImmutableMap;->singleValue:Ljava/lang/Object;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public entrySet()Lcom/google/inject/internal/util/$ImmutableSet;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/inject/internal/util/$ImmutableSet",
            "<",
            "Ljava/util/Map$Entry",
            "<TK;TV;>;>;"
        }
    .end annotation

    .prologue
    .line 486
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableMap$SingletonImmutableMap;, "Lcom/google/inject/internal/util/$ImmutableMap$SingletonImmutableMap<TK;TV;>;"
    iget-object v0, p0, Lcom/google/inject/internal/util/$ImmutableMap$SingletonImmutableMap;->entrySet:Lcom/google/inject/internal/util/$ImmutableSet;

    .line 487
    .local v0, "es":Lcom/google/inject/internal/util/$ImmutableSet;, "Lcom/google/inject/internal/util/$ImmutableSet<Ljava/util/Map$Entry<TK;TV;>;>;"
    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/google/inject/internal/util/$ImmutableMap$SingletonImmutableMap;->entry()Ljava/util/Map$Entry;

    move-result-object v1

    invoke-static {v1}, Lcom/google/inject/internal/util/$ImmutableSet;->of(Ljava/lang/Object;)Lcom/google/inject/internal/util/$ImmutableSet;

    move-result-object v0

    .end local v0    # "es":Lcom/google/inject/internal/util/$ImmutableSet;, "Lcom/google/inject/internal/util/$ImmutableSet<Ljava/util/Map$Entry<TK;TV;>;>;"
    iput-object v0, p0, Lcom/google/inject/internal/util/$ImmutableMap$SingletonImmutableMap;->entrySet:Lcom/google/inject/internal/util/$ImmutableSet;

    :cond_0
    return-object v0
.end method

.method public bridge synthetic entrySet()Ljava/util/Set;
    .locals 1

    .prologue
    .line 440
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableMap$SingletonImmutableMap;, "Lcom/google/inject/internal/util/$ImmutableMap$SingletonImmutableMap<TK;TV;>;"
    invoke-virtual {p0}, Lcom/google/inject/internal/util/$ImmutableMap$SingletonImmutableMap;->entrySet()Lcom/google/inject/internal/util/$ImmutableSet;

    move-result-object v0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 6
    .param p1, "object"    # Ljava/lang/Object;
        .annotation runtime Lcom/google/inject/internal/util/$Nullable;
        .end annotation
    .end param

    .prologue
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableMap$SingletonImmutableMap;, "Lcom/google/inject/internal/util/$ImmutableMap$SingletonImmutableMap<TK;TV;>;"
    const/4 v2, 0x1

    const/4 v3, 0x0

    .line 529
    if-ne p1, p0, :cond_1

    .line 541
    :cond_0
    :goto_0
    return v2

    .line 532
    :cond_1
    instance-of v4, p1, Ljava/util/Map;

    if-eqz v4, :cond_4

    move-object v1, p1

    .line 533
    check-cast v1, Ljava/util/Map;

    .line 534
    .local v1, "that":Ljava/util/Map;, "Ljava/util/Map<**>;"
    invoke-interface {v1}, Ljava/util/Map;->size()I

    move-result v4

    if-eq v4, v2, :cond_2

    move v2, v3

    .line 535
    goto :goto_0

    .line 537
    :cond_2
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 538
    .local v0, "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<**>;"
    iget-object v4, p0, Lcom/google/inject/internal/util/$ImmutableMap$SingletonImmutableMap;->singleKey:Ljava/lang/Object;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    iget-object v4, p0, Lcom/google/inject/internal/util/$ImmutableMap$SingletonImmutableMap;->singleValue:Ljava/lang/Object;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_0

    :cond_3
    move v2, v3

    goto :goto_0

    .end local v0    # "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<**>;"
    .end local v1    # "that":Ljava/util/Map;, "Ljava/util/Map<**>;"
    :cond_4
    move v2, v3

    .line 541
    goto :goto_0
.end method

.method public get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .param p1, "key"    # Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")TV;"
        }
    .end annotation

    .prologue
    .line 464
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableMap$SingletonImmutableMap;, "Lcom/google/inject/internal/util/$ImmutableMap$SingletonImmutableMap<TK;TV;>;"
    iget-object v0, p0, Lcom/google/inject/internal/util/$ImmutableMap$SingletonImmutableMap;->singleKey:Ljava/lang/Object;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/inject/internal/util/$ImmutableMap$SingletonImmutableMap;->singleValue:Ljava/lang/Object;

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public hashCode()I
    .locals 2

    .prologue
    .line 545
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableMap$SingletonImmutableMap;, "Lcom/google/inject/internal/util/$ImmutableMap$SingletonImmutableMap<TK;TV;>;"
    iget-object v0, p0, Lcom/google/inject/internal/util/$ImmutableMap$SingletonImmutableMap;->singleKey:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    iget-object v1, p0, Lcom/google/inject/internal/util/$ImmutableMap$SingletonImmutableMap;->singleValue:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    xor-int/2addr v0, v1

    return v0
.end method

.method public isEmpty()Z
    .locals 1

    .prologue
    .line 472
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableMap$SingletonImmutableMap;, "Lcom/google/inject/internal/util/$ImmutableMap$SingletonImmutableMap<TK;TV;>;"
    const/4 v0, 0x0

    return v0
.end method

.method public keySet()Lcom/google/inject/internal/util/$ImmutableSet;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/inject/internal/util/$ImmutableSet",
            "<TK;>;"
        }
    .end annotation

    .prologue
    .line 493
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableMap$SingletonImmutableMap;, "Lcom/google/inject/internal/util/$ImmutableMap$SingletonImmutableMap<TK;TV;>;"
    iget-object v0, p0, Lcom/google/inject/internal/util/$ImmutableMap$SingletonImmutableMap;->keySet:Lcom/google/inject/internal/util/$ImmutableSet;

    .line 494
    .local v0, "ks":Lcom/google/inject/internal/util/$ImmutableSet;, "Lcom/google/inject/internal/util/$ImmutableSet<TK;>;"
    if-nez v0, :cond_0

    iget-object v1, p0, Lcom/google/inject/internal/util/$ImmutableMap$SingletonImmutableMap;->singleKey:Ljava/lang/Object;

    invoke-static {v1}, Lcom/google/inject/internal/util/$ImmutableSet;->of(Ljava/lang/Object;)Lcom/google/inject/internal/util/$ImmutableSet;

    move-result-object v0

    .end local v0    # "ks":Lcom/google/inject/internal/util/$ImmutableSet;, "Lcom/google/inject/internal/util/$ImmutableSet<TK;>;"
    iput-object v0, p0, Lcom/google/inject/internal/util/$ImmutableMap$SingletonImmutableMap;->keySet:Lcom/google/inject/internal/util/$ImmutableSet;

    :cond_0
    return-object v0
.end method

.method public bridge synthetic keySet()Ljava/util/Set;
    .locals 1

    .prologue
    .line 440
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableMap$SingletonImmutableMap;, "Lcom/google/inject/internal/util/$ImmutableMap$SingletonImmutableMap<TK;TV;>;"
    invoke-virtual {p0}, Lcom/google/inject/internal/util/$ImmutableMap$SingletonImmutableMap;->keySet()Lcom/google/inject/internal/util/$ImmutableSet;

    move-result-object v0

    return-object v0
.end method

.method public size()I
    .locals 1

    .prologue
    .line 468
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableMap$SingletonImmutableMap;, "Lcom/google/inject/internal/util/$ImmutableMap$SingletonImmutableMap<TK;TV;>;"
    const/4 v0, 0x1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 549
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableMap$SingletonImmutableMap;, "Lcom/google/inject/internal/util/$ImmutableMap$SingletonImmutableMap<TK;TV;>;"
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v1, 0x7b

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/google/inject/internal/util/$ImmutableMap$SingletonImmutableMap;->singleKey:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x3d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/google/inject/internal/util/$ImmutableMap$SingletonImmutableMap;->singleValue:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public values()Lcom/google/inject/internal/util/$ImmutableCollection;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/inject/internal/util/$ImmutableCollection",
            "<TV;>;"
        }
    .end annotation

    .prologue
    .line 500
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableMap$SingletonImmutableMap;, "Lcom/google/inject/internal/util/$ImmutableMap$SingletonImmutableMap<TK;TV;>;"
    iget-object v0, p0, Lcom/google/inject/internal/util/$ImmutableMap$SingletonImmutableMap;->values:Lcom/google/inject/internal/util/$ImmutableCollection;

    .line 501
    .local v0, "v":Lcom/google/inject/internal/util/$ImmutableCollection;, "Lcom/google/inject/internal/util/$ImmutableCollection<TV;>;"
    if-nez v0, :cond_0

    new-instance v0, Lcom/google/inject/internal/util/$ImmutableMap$SingletonImmutableMap$Values;

    .end local v0    # "v":Lcom/google/inject/internal/util/$ImmutableCollection;, "Lcom/google/inject/internal/util/$ImmutableCollection<TV;>;"
    iget-object v1, p0, Lcom/google/inject/internal/util/$ImmutableMap$SingletonImmutableMap;->singleValue:Ljava/lang/Object;

    invoke-direct {v0, v1}, Lcom/google/inject/internal/util/$ImmutableMap$SingletonImmutableMap$Values;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/google/inject/internal/util/$ImmutableMap$SingletonImmutableMap;->values:Lcom/google/inject/internal/util/$ImmutableCollection;

    :cond_0
    return-object v0
.end method

.method public bridge synthetic values()Ljava/util/Collection;
    .locals 1

    .prologue
    .line 440
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableMap$SingletonImmutableMap;, "Lcom/google/inject/internal/util/$ImmutableMap$SingletonImmutableMap<TK;TV;>;"
    invoke-virtual {p0}, Lcom/google/inject/internal/util/$ImmutableMap$SingletonImmutableMap;->values()Lcom/google/inject/internal/util/$ImmutableCollection;

    move-result-object v0

    return-object v0
.end method
