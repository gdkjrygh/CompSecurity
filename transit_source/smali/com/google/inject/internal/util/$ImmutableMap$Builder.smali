.class public Lcom/google/inject/internal/util/$ImmutableMap$Builder;
.super Ljava/lang/Object;
.source "ImmutableMap.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/inject/internal/util/$ImmutableMap;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Builder"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field final entries:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/util/Map$Entry",
            "<TK;TV;>;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 161
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableMap$Builder;, "Lcom/google/inject/internal/util/$ImmutableMap$Builder<TK;TV;>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 155
    invoke-static {}, Lcom/google/inject/internal/util/$Lists;->newArrayList()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/google/inject/internal/util/$ImmutableMap$Builder;->entries:Ljava/util/List;

    .line 161
    return-void
.end method

.method private static fromEntryList(Ljava/util/List;)Lcom/google/inject/internal/util/$ImmutableMap;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/List",
            "<",
            "Ljava/util/Map$Entry",
            "<TK;TV;>;>;)",
            "Lcom/google/inject/internal/util/$ImmutableMap",
            "<TK;TV;>;"
        }
    .end annotation

    .prologue
    .local p0, "entries":Ljava/util/List;, "Ljava/util/List<Ljava/util/Map$Entry<TK;TV;>;>;"
    const/4 v4, 0x0

    .line 199
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v1

    .line 200
    .local v1, "size":I
    packed-switch v1, :pswitch_data_0

    .line 206
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v2

    new-array v2, v2, [Ljava/util/Map$Entry;

    invoke-interface {p0, v2}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/util/Map$Entry;

    .line 208
    .local v0, "entryArray":[Ljava/util/Map$Entry;, "[Ljava/util/Map$Entry<**>;"
    new-instance v2, Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap;

    invoke-direct {v2, v0, v4}, Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap;-><init>([Ljava/util/Map$Entry;Lcom/google/inject/internal/util/$ImmutableMap$1;)V

    .end local v0    # "entryArray":[Ljava/util/Map$Entry;, "[Ljava/util/Map$Entry<**>;"
    :goto_0
    return-object v2

    .line 202
    :pswitch_0
    invoke-static {}, Lcom/google/inject/internal/util/$ImmutableMap;->of()Lcom/google/inject/internal/util/$ImmutableMap;

    move-result-object v2

    goto :goto_0

    .line 204
    :pswitch_1
    new-instance v3, Lcom/google/inject/internal/util/$ImmutableMap$SingletonImmutableMap;

    invoke-static {p0}, Lcom/google/inject/internal/util/$Iterables;->getOnlyElement(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-direct {v3, v2, v4}, Lcom/google/inject/internal/util/$ImmutableMap$SingletonImmutableMap;-><init>(Ljava/util/Map$Entry;Lcom/google/inject/internal/util/$ImmutableMap$1;)V

    move-object v2, v3

    goto :goto_0

    .line 200
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method


# virtual methods
.method public build()Lcom/google/inject/internal/util/$ImmutableMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/inject/internal/util/$ImmutableMap",
            "<TK;TV;>;"
        }
    .end annotation

    .prologue
    .line 194
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableMap$Builder;, "Lcom/google/inject/internal/util/$ImmutableMap$Builder<TK;TV;>;"
    iget-object v0, p0, Lcom/google/inject/internal/util/$ImmutableMap$Builder;->entries:Ljava/util/List;

    invoke-static {v0}, Lcom/google/inject/internal/util/$ImmutableMap$Builder;->fromEntryList(Ljava/util/List;)Lcom/google/inject/internal/util/$ImmutableMap;

    move-result-object v0

    return-object v0
.end method

.method public put(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/inject/internal/util/$ImmutableMap$Builder;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;)",
            "Lcom/google/inject/internal/util/$ImmutableMap$Builder",
            "<TK;TV;>;"
        }
    .end annotation

    .prologue
    .line 168
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableMap$Builder;, "Lcom/google/inject/internal/util/$ImmutableMap$Builder<TK;TV;>;"
    .local p1, "key":Ljava/lang/Object;, "TK;"
    .local p2, "value":Ljava/lang/Object;, "TV;"
    iget-object v0, p0, Lcom/google/inject/internal/util/$ImmutableMap$Builder;->entries:Ljava/util/List;

    # invokes: Lcom/google/inject/internal/util/$ImmutableMap;->entryOf(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;
    invoke-static {p1, p2}, Lcom/google/inject/internal/util/$ImmutableMap;->access$300(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 169
    return-object p0
.end method

.method public putAll(Ljava/util/Map;)Lcom/google/inject/internal/util/$ImmutableMap$Builder;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<+TK;+TV;>;)",
            "Lcom/google/inject/internal/util/$ImmutableMap$Builder",
            "<TK;TV;>;"
        }
    .end annotation

    .prologue
    .line 179
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableMap$Builder;, "Lcom/google/inject/internal/util/$ImmutableMap$Builder<TK;TV;>;"
    .local p1, "map":Ljava/util/Map;, "Ljava/util/Map<+TK;+TV;>;"
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .local v1, "i$":Ljava/util/Iterator;
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 180
    .local v0, "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<+TK;+TV;>;"
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {p0, v2, v3}, Lcom/google/inject/internal/util/$ImmutableMap$Builder;->put(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/inject/internal/util/$ImmutableMap$Builder;

    goto :goto_0

    .line 182
    .end local v0    # "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<+TK;+TV;>;"
    :cond_0
    return-object p0
.end method
