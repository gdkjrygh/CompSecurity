.class public abstract Lcom/google/inject/internal/util/$ImmutableMap;
.super Ljava/lang/Object;
.source "ImmutableMap.java"

# interfaces
.implements Ljava/util/concurrent/ConcurrentMap;
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/inject/internal/util/$ImmutableMap$1;,
        Lcom/google/inject/internal/util/$ImmutableMap$SerializedForm;,
        Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap;,
        Lcom/google/inject/internal/util/$ImmutableMap$SingletonImmutableMap;,
        Lcom/google/inject/internal/util/$ImmutableMap$EmptyImmutableMap;,
        Lcom/google/inject/internal/util/$ImmutableMap$Builder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/ConcurrentMap",
        "<TK;TV;>;",
        "Ljava/io/Serializable;"
    }
.end annotation


# static fields
.field private static final EMPTY_IMMUTABLE_MAP:Lcom/google/inject/internal/util/$ImmutableMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/inject/internal/util/$ImmutableMap",
            "<**>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 49
    new-instance v0, Lcom/google/inject/internal/util/$ImmutableMap$EmptyImmutableMap;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/inject/internal/util/$ImmutableMap$EmptyImmutableMap;-><init>(Lcom/google/inject/internal/util/$ImmutableMap$1;)V

    sput-object v0, Lcom/google/inject/internal/util/$ImmutableMap;->EMPTY_IMMUTABLE_MAP:Lcom/google/inject/internal/util/$ImmutableMap;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    .prologue
    .line 260
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableMap;, "Lcom/google/inject/internal/util/$ImmutableMap<TK;TV;>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic access$300(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;
    .locals 1
    .param p0, "x0"    # Ljava/lang/Object;
    .param p1, "x1"    # Ljava/lang/Object;

    .prologue
    .line 47
    invoke-static {p0, p1}, Lcom/google/inject/internal/util/$ImmutableMap;->entryOf(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object v0

    return-object v0
.end method

.method public static builder()Lcom/google/inject/internal/util/$ImmutableMap$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">()",
            "Lcom/google/inject/internal/util/$ImmutableMap$Builder",
            "<TK;TV;>;"
        }
    .end annotation

    .prologue
    .line 125
    new-instance v0, Lcom/google/inject/internal/util/$ImmutableMap$Builder;

    invoke-direct {v0}, Lcom/google/inject/internal/util/$ImmutableMap$Builder;-><init>()V

    return-object v0
.end method

.method public static copyOf(Ljava/util/Map;)Lcom/google/inject/internal/util/$ImmutableMap;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Map",
            "<+TK;+TV;>;)",
            "Lcom/google/inject/internal/util/$ImmutableMap",
            "<TK;TV;>;"
        }
    .end annotation

    .prologue
    .line 227
    .local p0, "map":Ljava/util/Map;, "Ljava/util/Map<+TK;+TV;>;"
    instance-of v8, p0, Lcom/google/inject/internal/util/$ImmutableMap;

    if-eqz v8, :cond_0

    move-object v5, p0

    .line 229
    check-cast v5, Lcom/google/inject/internal/util/$ImmutableMap;

    .line 256
    :goto_0
    return-object v5

    .line 233
    :cond_0
    invoke-interface {p0}, Ljava/util/Map;->size()I

    move-result v7

    .line 234
    .local v7, "size":I
    packed-switch v7, :pswitch_data_0

    .line 248
    new-array v0, v7, [Ljava/util/Map$Entry;

    .line 249
    .local v0, "array":[Ljava/util/Map$Entry;, "[Ljava/util/Map$Entry<**>;"
    const/4 v2, 0x0

    .line 250
    .local v2, "i":I
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v8

    invoke-interface {v8}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    .local v4, "i$":Ljava/util/Iterator;
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 254
    .local v1, "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<+TK;+TV;>;"
    add-int/lit8 v3, v2, 0x1

    .end local v2    # "i":I
    .local v3, "i":I
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v8

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v8, v9}, Lcom/google/inject/internal/util/$ImmutableMap;->entryOf(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object v8

    aput-object v8, v0, v2

    move v2, v3

    .end local v3    # "i":I
    .restart local v2    # "i":I
    goto :goto_1

    .line 236
    .end local v0    # "array":[Ljava/util/Map$Entry;, "[Ljava/util/Map$Entry<**>;"
    .end local v1    # "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<+TK;+TV;>;"
    .end local v2    # "i":I
    .end local v4    # "i$":Ljava/util/Iterator;
    :pswitch_0
    invoke-static {}, Lcom/google/inject/internal/util/$ImmutableMap;->of()Lcom/google/inject/internal/util/$ImmutableMap;

    move-result-object v5

    goto :goto_0

    .line 238
    :pswitch_1
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v8

    invoke-static {v8}, Lcom/google/inject/internal/util/$Iterables;->getOnlyElement(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/Map$Entry;

    .line 246
    .local v6, "loneEntry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<+TK;+TV;>;"
    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v8

    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v8, v9}, Lcom/google/inject/internal/util/$ImmutableMap;->of(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/inject/internal/util/$ImmutableMap;

    move-result-object v5

    goto :goto_0

    .line 256
    .end local v6    # "loneEntry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<+TK;+TV;>;"
    .restart local v0    # "array":[Ljava/util/Map$Entry;, "[Ljava/util/Map$Entry<**>;"
    .restart local v2    # "i":I
    .restart local v4    # "i$":Ljava/util/Iterator;
    :cond_1
    new-instance v5, Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap;

    const/4 v8, 0x0

    invoke-direct {v5, v0, v8}, Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap;-><init>([Ljava/util/Map$Entry;Lcom/google/inject/internal/util/$ImmutableMap$1;)V

    goto :goto_0

    .line 234
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method private static entryOf(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">(TK;TV;)",
            "Ljava/util/Map$Entry",
            "<TK;TV;>;"
        }
    .end annotation

    .prologue
    .line 133
    .local p0, "key":Ljava/lang/Object;, "TK;"
    .local p1, "value":Ljava/lang/Object;, "TV;"
    invoke-static {p0}, Lcom/google/inject/internal/util/$Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {p1}, Lcom/google/inject/internal/util/$Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/inject/internal/util/$Maps;->immutableEntry(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object v0

    return-object v0
.end method

.method public static of()Lcom/google/inject/internal/util/$ImmutableMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">()",
            "Lcom/google/inject/internal/util/$ImmutableMap",
            "<TK;TV;>;"
        }
    .end annotation

    .prologue
    .line 62
    sget-object v0, Lcom/google/inject/internal/util/$ImmutableMap;->EMPTY_IMMUTABLE_MAP:Lcom/google/inject/internal/util/$ImmutableMap;

    return-object v0
.end method

.method public static of(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/inject/internal/util/$ImmutableMap;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">(TK;TV;)",
            "Lcom/google/inject/internal/util/$ImmutableMap",
            "<TK;TV;>;"
        }
    .end annotation

    .prologue
    .line 72
    .local p0, "k1":Ljava/lang/Object;, "TK;"
    .local p1, "v1":Ljava/lang/Object;, "TV;"
    new-instance v0, Lcom/google/inject/internal/util/$ImmutableMap$SingletonImmutableMap;

    invoke-static {p0}, Lcom/google/inject/internal/util/$Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {p1}, Lcom/google/inject/internal/util/$Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lcom/google/inject/internal/util/$ImmutableMap$SingletonImmutableMap;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lcom/google/inject/internal/util/$ImmutableMap$1;)V

    return-object v0
.end method

.method public static of(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/inject/internal/util/$ImmutableMap;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">(TK;TV;TK;TV;)",
            "Lcom/google/inject/internal/util/$ImmutableMap",
            "<TK;TV;>;"
        }
    .end annotation

    .prologue
    .line 82
    .local p0, "k1":Ljava/lang/Object;, "TK;"
    .local p1, "v1":Ljava/lang/Object;, "TV;"
    .local p2, "k2":Ljava/lang/Object;, "TK;"
    .local p3, "v2":Ljava/lang/Object;, "TV;"
    new-instance v0, Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/util/Map$Entry;

    const/4 v2, 0x0

    invoke-static {p0, p1}, Lcom/google/inject/internal/util/$ImmutableMap;->entryOf(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x1

    invoke-static {p2, p3}, Lcom/google/inject/internal/util/$ImmutableMap;->entryOf(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap;-><init>([Ljava/util/Map$Entry;Lcom/google/inject/internal/util/$ImmutableMap$1;)V

    return-object v0
.end method

.method public static of(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/inject/internal/util/$ImmutableMap;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">(TK;TV;TK;TV;TK;TV;)",
            "Lcom/google/inject/internal/util/$ImmutableMap",
            "<TK;TV;>;"
        }
    .end annotation

    .prologue
    .line 92
    .local p0, "k1":Ljava/lang/Object;, "TK;"
    .local p1, "v1":Ljava/lang/Object;, "TV;"
    .local p2, "k2":Ljava/lang/Object;, "TK;"
    .local p3, "v2":Ljava/lang/Object;, "TV;"
    .local p4, "k3":Ljava/lang/Object;, "TK;"
    .local p5, "v3":Ljava/lang/Object;, "TV;"
    new-instance v0, Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap;

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/util/Map$Entry;

    const/4 v2, 0x0

    invoke-static {p0, p1}, Lcom/google/inject/internal/util/$ImmutableMap;->entryOf(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x1

    invoke-static {p2, p3}, Lcom/google/inject/internal/util/$ImmutableMap;->entryOf(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x2

    invoke-static {p4, p5}, Lcom/google/inject/internal/util/$ImmutableMap;->entryOf(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap;-><init>([Ljava/util/Map$Entry;Lcom/google/inject/internal/util/$ImmutableMap$1;)V

    return-object v0
.end method

.method public static of(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/inject/internal/util/$ImmutableMap;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">(TK;TV;TK;TV;TK;TV;TK;TV;)",
            "Lcom/google/inject/internal/util/$ImmutableMap",
            "<TK;TV;>;"
        }
    .end annotation

    .prologue
    .line 103
    .local p0, "k1":Ljava/lang/Object;, "TK;"
    .local p1, "v1":Ljava/lang/Object;, "TV;"
    .local p2, "k2":Ljava/lang/Object;, "TK;"
    .local p3, "v2":Ljava/lang/Object;, "TV;"
    .local p4, "k3":Ljava/lang/Object;, "TK;"
    .local p5, "v3":Ljava/lang/Object;, "TV;"
    .local p6, "k4":Ljava/lang/Object;, "TK;"
    .local p7, "v4":Ljava/lang/Object;, "TV;"
    new-instance v0, Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap;

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/util/Map$Entry;

    const/4 v2, 0x0

    invoke-static {p0, p1}, Lcom/google/inject/internal/util/$ImmutableMap;->entryOf(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x1

    invoke-static {p2, p3}, Lcom/google/inject/internal/util/$ImmutableMap;->entryOf(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x2

    invoke-static {p4, p5}, Lcom/google/inject/internal/util/$ImmutableMap;->entryOf(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x3

    invoke-static {p6, p7}, Lcom/google/inject/internal/util/$ImmutableMap;->entryOf(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap;-><init>([Ljava/util/Map$Entry;Lcom/google/inject/internal/util/$ImmutableMap$1;)V

    return-object v0
.end method

.method public static of(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/inject/internal/util/$ImmutableMap;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">(TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;)",
            "Lcom/google/inject/internal/util/$ImmutableMap",
            "<TK;TV;>;"
        }
    .end annotation

    .prologue
    .line 114
    .local p0, "k1":Ljava/lang/Object;, "TK;"
    .local p1, "v1":Ljava/lang/Object;, "TV;"
    .local p2, "k2":Ljava/lang/Object;, "TK;"
    .local p3, "v2":Ljava/lang/Object;, "TV;"
    .local p4, "k3":Ljava/lang/Object;, "TK;"
    .local p5, "v3":Ljava/lang/Object;, "TV;"
    .local p6, "k4":Ljava/lang/Object;, "TK;"
    .local p7, "v4":Ljava/lang/Object;, "TV;"
    .local p8, "k5":Ljava/lang/Object;, "TK;"
    .local p9, "v5":Ljava/lang/Object;, "TV;"
    new-instance v0, Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap;

    const/4 v1, 0x5

    new-array v1, v1, [Ljava/util/Map$Entry;

    const/4 v2, 0x0

    invoke-static {p0, p1}, Lcom/google/inject/internal/util/$ImmutableMap;->entryOf(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x1

    invoke-static {p2, p3}, Lcom/google/inject/internal/util/$ImmutableMap;->entryOf(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x2

    invoke-static {p4, p5}, Lcom/google/inject/internal/util/$ImmutableMap;->entryOf(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x3

    invoke-static {p6, p7}, Lcom/google/inject/internal/util/$ImmutableMap;->entryOf(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x4

    invoke-static {p8, p9}, Lcom/google/inject/internal/util/$ImmutableMap;->entryOf(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/google/inject/internal/util/$ImmutableMap$RegularImmutableMap;-><init>([Ljava/util/Map$Entry;Lcom/google/inject/internal/util/$ImmutableMap$1;)V

    return-object v0
.end method


# virtual methods
.method public final clear()V
    .locals 1

    .prologue
    .line 331
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableMap;, "Lcom/google/inject/internal/util/$ImmutableMap<TK;TV;>;"
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public abstract containsKey(Ljava/lang/Object;)Z
    .param p1    # Ljava/lang/Object;
        .annotation runtime Lcom/google/inject/internal/util/$Nullable;
        .end annotation
    .end param
.end method

.method public abstract containsValue(Ljava/lang/Object;)Z
    .param p1    # Ljava/lang/Object;
        .annotation runtime Lcom/google/inject/internal/util/$Nullable;
        .end annotation
    .end param
.end method

.method public abstract entrySet()Lcom/google/inject/internal/util/$ImmutableSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/inject/internal/util/$ImmutableSet",
            "<",
            "Ljava/util/Map$Entry",
            "<TK;TV;>;>;"
        }
    .end annotation
.end method

.method public bridge synthetic entrySet()Ljava/util/Set;
    .locals 1

    .prologue
    .line 46
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableMap;, "Lcom/google/inject/internal/util/$ImmutableMap<TK;TV;>;"
    invoke-virtual {p0}, Lcom/google/inject/internal/util/$ImmutableMap;->entrySet()Lcom/google/inject/internal/util/$ImmutableSet;

    move-result-object v0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3
    .param p1, "object"    # Ljava/lang/Object;
        .annotation runtime Lcom/google/inject/internal/util/$Nullable;
        .end annotation
    .end param

    .prologue
    .line 362
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableMap;, "Lcom/google/inject/internal/util/$ImmutableMap<TK;TV;>;"
    if-ne p1, p0, :cond_0

    .line 363
    const/4 v1, 0x1

    .line 369
    :goto_0
    return v1

    .line 365
    :cond_0
    instance-of v1, p1, Ljava/util/Map;

    if-eqz v1, :cond_1

    move-object v0, p1

    .line 366
    check-cast v0, Ljava/util/Map;

    .line 367
    .local v0, "that":Ljava/util/Map;, "Ljava/util/Map<**>;"
    invoke-virtual {p0}, Lcom/google/inject/internal/util/$ImmutableMap;->entrySet()Lcom/google/inject/internal/util/$ImmutableSet;

    move-result-object v1

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/google/inject/internal/util/$ImmutableSet;->equals(Ljava/lang/Object;)Z

    move-result v1

    goto :goto_0

    .line 369
    .end local v0    # "that":Ljava/util/Map;, "Ljava/util/Map<**>;"
    :cond_1
    const/4 v1, 0x0

    goto :goto_0
.end method

.method public abstract get(Ljava/lang/Object;)Ljava/lang/Object;
    .param p1    # Ljava/lang/Object;
        .annotation runtime Lcom/google/inject/internal/util/$Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")TV;"
        }
    .end annotation
.end method

.method public hashCode()I
    .locals 1

    .prologue
    .line 375
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableMap;, "Lcom/google/inject/internal/util/$ImmutableMap<TK;TV;>;"
    invoke-virtual {p0}, Lcom/google/inject/internal/util/$ImmutableMap;->entrySet()Lcom/google/inject/internal/util/$ImmutableSet;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/inject/internal/util/$ImmutableSet;->hashCode()I

    move-result v0

    return v0
.end method

.method public abstract keySet()Lcom/google/inject/internal/util/$ImmutableSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/inject/internal/util/$ImmutableSet",
            "<TK;>;"
        }
    .end annotation
.end method

.method public bridge synthetic keySet()Ljava/util/Set;
    .locals 1

    .prologue
    .line 46
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableMap;, "Lcom/google/inject/internal/util/$ImmutableMap<TK;TV;>;"
    invoke-virtual {p0}, Lcom/google/inject/internal/util/$ImmutableMap;->keySet()Lcom/google/inject/internal/util/$ImmutableSet;

    move-result-object v0

    return-object v0
.end method

.method public final put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;)TV;"
        }
    .end annotation

    .prologue
    .line 268
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableMap;, "Lcom/google/inject/internal/util/$ImmutableMap<TK;TV;>;"
    .local p1, "k":Ljava/lang/Object;, "TK;"
    .local p2, "v":Ljava/lang/Object;, "TV;"
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final putAll(Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<+TK;+TV;>;)V"
        }
    .end annotation

    .prologue
    .line 322
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableMap;, "Lcom/google/inject/internal/util/$ImmutableMap<TK;TV;>;"
    .local p1, "map":Ljava/util/Map;, "Ljava/util/Map<+TK;+TV;>;"
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;)TV;"
        }
    .end annotation

    .prologue
    .line 286
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableMap;, "Lcom/google/inject/internal/util/$ImmutableMap<TK;TV;>;"
    .local p1, "key":Ljava/lang/Object;, "TK;"
    .local p2, "value":Ljava/lang/Object;, "TV;"
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final remove(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .param p1, "o"    # Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")TV;"
        }
    .end annotation

    .prologue
    .line 277
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableMap;, "Lcom/google/inject/internal/util/$ImmutableMap<TK;TV;>;"
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final remove(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1
    .param p1, "key"    # Ljava/lang/Object;
    .param p2, "value"    # Ljava/lang/Object;

    .prologue
    .line 295
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableMap;, "Lcom/google/inject/internal/util/$ImmutableMap<TK;TV;>;"
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;)TV;"
        }
    .end annotation

    .prologue
    .line 313
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableMap;, "Lcom/google/inject/internal/util/$ImmutableMap<TK;TV;>;"
    .local p1, "key":Ljava/lang/Object;, "TK;"
    .local p2, "value":Ljava/lang/Object;, "TV;"
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;TV;)Z"
        }
    .end annotation

    .prologue
    .line 304
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableMap;, "Lcom/google/inject/internal/util/$ImmutableMap<TK;TV;>;"
    .local p1, "key":Ljava/lang/Object;, "TK;"
    .local p2, "oldValue":Ljava/lang/Object;, "TV;"
    .local p3, "newValue":Ljava/lang/Object;, "TV;"
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .prologue
    .line 379
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableMap;, "Lcom/google/inject/internal/util/$ImmutableMap<TK;TV;>;"
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/google/inject/internal/util/$ImmutableMap;->size()I

    move-result v3

    mul-int/lit8 v3, v3, 0x10

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const/16 v3, 0x7b

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 380
    .local v1, "result":Ljava/lang/StringBuilder;
    invoke-virtual {p0}, Lcom/google/inject/internal/util/$ImmutableMap;->entrySet()Lcom/google/inject/internal/util/$ImmutableSet;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/inject/internal/util/$ImmutableSet;->iterator()Lcom/google/inject/internal/util/$UnmodifiableIterator;

    move-result-object v0

    .line 381
    .local v0, "entries":Ljava/util/Iterator;, "Ljava/util/Iterator<Ljava/util/Map$Entry<TK;TV;>;>;"
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 382
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 383
    const-string v2, ", "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 385
    :cond_0
    const/16 v2, 0x7d

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    return-object v2
.end method

.method public abstract values()Lcom/google/inject/internal/util/$ImmutableCollection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/inject/internal/util/$ImmutableCollection",
            "<TV;>;"
        }
    .end annotation
.end method

.method public bridge synthetic values()Ljava/util/Collection;
    .locals 1

    .prologue
    .line 46
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableMap;, "Lcom/google/inject/internal/util/$ImmutableMap<TK;TV;>;"
    invoke-virtual {p0}, Lcom/google/inject/internal/util/$ImmutableMap;->values()Lcom/google/inject/internal/util/$ImmutableCollection;

    move-result-object v0

    return-object v0
.end method

.method writeReplace()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 777
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableMap;, "Lcom/google/inject/internal/util/$ImmutableMap<TK;TV;>;"
    new-instance v0, Lcom/google/inject/internal/util/$ImmutableMap$SerializedForm;

    invoke-direct {v0, p0}, Lcom/google/inject/internal/util/$ImmutableMap$SerializedForm;-><init>(Lcom/google/inject/internal/util/$ImmutableMap;)V

    return-object v0
.end method
