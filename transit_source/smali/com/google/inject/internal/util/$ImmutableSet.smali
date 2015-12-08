.class public abstract Lcom/google/inject/internal/util/$ImmutableSet;
.super Lcom/google/inject/internal/util/$ImmutableCollection;
.source "ImmutableSet.java"

# interfaces
.implements Ljava/util/Set;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/inject/internal/util/$ImmutableSet$1;,
        Lcom/google/inject/internal/util/$ImmutableSet$Builder;,
        Lcom/google/inject/internal/util/$ImmutableSet$SerializedForm;,
        Lcom/google/inject/internal/util/$ImmutableSet$TransformedImmutableSet;,
        Lcom/google/inject/internal/util/$ImmutableSet$RegularImmutableSet;,
        Lcom/google/inject/internal/util/$ImmutableSet$ArrayImmutableSet;,
        Lcom/google/inject/internal/util/$ImmutableSet$SingletonImmutableSet;,
        Lcom/google/inject/internal/util/$ImmutableSet$EmptyImmutableSet;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/inject/internal/util/$ImmutableCollection",
        "<TE;>;",
        "Ljava/util/Set",
        "<TE;>;"
    }
.end annotation


# static fields
.field private static final EMPTY_IMMUTABLE_SET:Lcom/google/inject/internal/util/$ImmutableSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/inject/internal/util/$ImmutableSet",
            "<*>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 62
    new-instance v0, Lcom/google/inject/internal/util/$ImmutableSet$EmptyImmutableSet;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/inject/internal/util/$ImmutableSet$EmptyImmutableSet;-><init>(Lcom/google/inject/internal/util/$ImmutableSet$1;)V

    sput-object v0, Lcom/google/inject/internal/util/$ImmutableSet;->EMPTY_IMMUTABLE_SET:Lcom/google/inject/internal/util/$ImmutableSet;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    .prologue
    .line 160
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableSet;, "Lcom/google/inject/internal/util/$ImmutableSet<TE;>;"
    invoke-direct {p0}, Lcom/google/inject/internal/util/$ImmutableCollection;-><init>()V

    return-void
.end method

.method public static builder()Lcom/google/inject/internal/util/$ImmutableSet$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">()",
            "Lcom/google/inject/internal/util/$ImmutableSet$Builder",
            "<TE;>;"
        }
    .end annotation

    .prologue
    .line 549
    new-instance v0, Lcom/google/inject/internal/util/$ImmutableSet$Builder;

    invoke-direct {v0}, Lcom/google/inject/internal/util/$ImmutableSet$Builder;-><init>()V

    return-object v0
.end method

.method public static copyOf(Ljava/lang/Iterable;)Lcom/google/inject/internal/util/$ImmutableSet;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Iterable",
            "<+TE;>;)",
            "Lcom/google/inject/internal/util/$ImmutableSet",
            "<TE;>;"
        }
    .end annotation

    .prologue
    .line 125
    .local p0, "elements":Ljava/lang/Iterable;, "Ljava/lang/Iterable<+TE;>;"
    instance-of v1, p0, Lcom/google/inject/internal/util/$ImmutableSet;

    if-eqz v1, :cond_0

    move-object v0, p0

    .line 127
    check-cast v0, Lcom/google/inject/internal/util/$ImmutableSet;

    .line 130
    :goto_0
    return-object v0

    :cond_0
    invoke-static {p0}, Lcom/google/inject/internal/util/$Collections2;->toCollection(Ljava/lang/Iterable;)Ljava/util/Collection;

    move-result-object v1

    invoke-static {v1}, Lcom/google/inject/internal/util/$ImmutableSet;->copyOfInternal(Ljava/util/Collection;)Lcom/google/inject/internal/util/$ImmutableSet;

    move-result-object v0

    goto :goto_0
.end method

.method public static copyOf(Ljava/util/Iterator;)Lcom/google/inject/internal/util/$ImmutableSet;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Iterator",
            "<+TE;>;)",
            "Lcom/google/inject/internal/util/$ImmutableSet",
            "<TE;>;"
        }
    .end annotation

    .prologue
    .line 141
    .local p0, "elements":Ljava/util/Iterator;, "Ljava/util/Iterator<+TE;>;"
    invoke-static {p0}, Lcom/google/inject/internal/util/$Lists;->newArrayList(Ljava/util/Iterator;)Ljava/util/ArrayList;

    move-result-object v0

    .line 142
    .local v0, "list":Ljava/util/Collection;, "Ljava/util/Collection<TE;>;"
    invoke-static {v0}, Lcom/google/inject/internal/util/$ImmutableSet;->copyOfInternal(Ljava/util/Collection;)Lcom/google/inject/internal/util/$ImmutableSet;

    move-result-object v1

    return-object v1
.end method

.method private static copyOfInternal(Ljava/util/Collection;)Lcom/google/inject/internal/util/$ImmutableSet;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Collection",
            "<+TE;>;)",
            "Lcom/google/inject/internal/util/$ImmutableSet",
            "<TE;>;"
        }
    .end annotation

    .prologue
    .line 149
    .local p0, "collection":Ljava/util/Collection;, "Ljava/util/Collection<+TE;>;"
    invoke-interface {p0}, Ljava/util/Collection;->size()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    .line 156
    invoke-interface {p0}, Ljava/util/Collection;->size()I

    move-result v0

    invoke-static {p0, v0}, Lcom/google/inject/internal/util/$ImmutableSet;->create(Ljava/lang/Iterable;I)Lcom/google/inject/internal/util/$ImmutableSet;

    move-result-object v0

    :goto_0
    return-object v0

    .line 151
    :pswitch_0
    invoke-static {}, Lcom/google/inject/internal/util/$ImmutableSet;->of()Lcom/google/inject/internal/util/$ImmutableSet;

    move-result-object v0

    goto :goto_0

    .line 154
    :pswitch_1
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/google/inject/internal/util/$ImmutableSet;->of(Ljava/lang/Object;)Lcom/google/inject/internal/util/$ImmutableSet;

    move-result-object v0

    goto :goto_0

    .line 149
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method private static create(Ljava/lang/Iterable;I)Lcom/google/inject/internal/util/$ImmutableSet;
    .locals 13
    .param p1, "count"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Iterable",
            "<+TE;>;I)",
            "Lcom/google/inject/internal/util/$ImmutableSet",
            "<TE;>;"
        }
    .end annotation

    .prologue
    .line 332
    .local p0, "iterable":Ljava/lang/Iterable;, "Ljava/lang/Iterable<+TE;>;"
    invoke-static {p1}, Lcom/google/inject/internal/util/$Hashing;->chooseTableSize(I)I

    move-result v9

    .line 333
    .local v9, "tableSize":I
    new-array v8, v9, [Ljava/lang/Object;

    .line 334
    .local v8, "table":[Ljava/lang/Object;
    add-int/lit8 v7, v9, -0x1

    .line 336
    .local v7, "mask":I
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, p1}, Ljava/util/ArrayList;-><init>(I)V

    .line 337
    .local v1, "elements":Ljava/util/List;, "Ljava/util/List<TE;>;"
    const/4 v3, 0x0

    .line 339
    .local v3, "hashCode":I
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    .local v5, "i$":Ljava/util/Iterator;
    :cond_0
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_2

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .line 340
    .local v0, "element":Ljava/lang/Object;, "TE;"
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v2

    .line 341
    .local v2, "hash":I
    invoke-static {v2}, Lcom/google/inject/internal/util/$Hashing;->smear(I)I

    move-result v4

    .line 342
    .local v4, "i":I
    :goto_1
    and-int v6, v4, v7

    .line 343
    .local v6, "index":I
    aget-object v10, v8, v6

    .line 344
    .local v10, "value":Ljava/lang/Object;
    if-nez v10, :cond_1

    .line 346
    aput-object v0, v8, v6

    .line 347
    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 348
    add-int/2addr v3, v2

    .line 349
    goto :goto_0

    .line 350
    :cond_1
    invoke-virtual {v10, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_0

    .line 341
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 357
    .end local v0    # "element":Ljava/lang/Object;, "TE;"
    .end local v2    # "hash":I
    .end local v4    # "i":I
    .end local v6    # "index":I
    .end local v10    # "value":Ljava/lang/Object;
    :cond_2
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v11

    const/4 v12, 0x1

    if-ne v11, v12, :cond_3

    new-instance v11, Lcom/google/inject/internal/util/$ImmutableSet$SingletonImmutableSet;

    const/4 v12, 0x0

    invoke-interface {v1, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    invoke-direct {v11, v12, v3}, Lcom/google/inject/internal/util/$ImmutableSet$SingletonImmutableSet;-><init>(Ljava/lang/Object;I)V

    :goto_2
    return-object v11

    :cond_3
    new-instance v11, Lcom/google/inject/internal/util/$ImmutableSet$RegularImmutableSet;

    invoke-interface {v1}, Ljava/util/List;->toArray()[Ljava/lang/Object;

    move-result-object v12

    invoke-direct {v11, v12, v3, v8, v7}, Lcom/google/inject/internal/util/$ImmutableSet$RegularImmutableSet;-><init>([Ljava/lang/Object;I[Ljava/lang/Object;I)V

    goto :goto_2
.end method

.method public static of()Lcom/google/inject/internal/util/$ImmutableSet;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">()",
            "Lcom/google/inject/internal/util/$ImmutableSet",
            "<TE;>;"
        }
    .end annotation

    .prologue
    .line 73
    sget-object v0, Lcom/google/inject/internal/util/$ImmutableSet;->EMPTY_IMMUTABLE_SET:Lcom/google/inject/internal/util/$ImmutableSet;

    return-object v0
.end method

.method public static of(Ljava/lang/Object;)Lcom/google/inject/internal/util/$ImmutableSet;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(TE;)",
            "Lcom/google/inject/internal/util/$ImmutableSet",
            "<TE;>;"
        }
    .end annotation

    .prologue
    .line 83
    .local p0, "element":Ljava/lang/Object;, "TE;"
    new-instance v0, Lcom/google/inject/internal/util/$ImmutableSet$SingletonImmutableSet;

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v1

    invoke-direct {v0, p0, v1}, Lcom/google/inject/internal/util/$ImmutableSet$SingletonImmutableSet;-><init>(Ljava/lang/Object;I)V

    return-object v0
.end method

.method public static varargs of([Ljava/lang/Object;)Lcom/google/inject/internal/util/$ImmutableSet;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">([TE;)",
            "Lcom/google/inject/internal/util/$ImmutableSet",
            "<TE;>;"
        }
    .end annotation

    .prologue
    .line 95
    .local p0, "elements":[Ljava/lang/Object;, "[TE;"
    array-length v0, p0

    packed-switch v0, :pswitch_data_0

    .line 101
    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    array-length v1, p0

    invoke-static {v0, v1}, Lcom/google/inject/internal/util/$ImmutableSet;->create(Ljava/lang/Iterable;I)Lcom/google/inject/internal/util/$ImmutableSet;

    move-result-object v0

    :goto_0
    return-object v0

    .line 97
    :pswitch_0
    invoke-static {}, Lcom/google/inject/internal/util/$ImmutableSet;->of()Lcom/google/inject/internal/util/$ImmutableSet;

    move-result-object v0

    goto :goto_0

    .line 99
    :pswitch_1
    const/4 v0, 0x0

    aget-object v0, p0, v0

    invoke-static {v0}, Lcom/google/inject/internal/util/$ImmutableSet;->of(Ljava/lang/Object;)Lcom/google/inject/internal/util/$ImmutableSet;

    move-result-object v0

    goto :goto_0

    .line 95
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 2
    .param p1, "object"    # Ljava/lang/Object;
        .annotation runtime Lcom/google/inject/internal/util/$Nullable;
        .end annotation
    .end param

    .prologue
    .line 168
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableSet;, "Lcom/google/inject/internal/util/$ImmutableSet<TE;>;"
    if-ne p1, p0, :cond_0

    .line 169
    const/4 v0, 0x1

    .line 177
    :goto_0
    return v0

    .line 171
    :cond_0
    instance-of v0, p1, Lcom/google/inject/internal/util/$ImmutableSet;

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/google/inject/internal/util/$ImmutableSet;->isHashCodeFast()Z

    move-result v0

    if-eqz v0, :cond_1

    move-object v0, p1

    check-cast v0, Lcom/google/inject/internal/util/$ImmutableSet;

    invoke-virtual {v0}, Lcom/google/inject/internal/util/$ImmutableSet;->isHashCodeFast()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/google/inject/internal/util/$ImmutableSet;->hashCode()I

    move-result v0

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    if-eq v0, v1, :cond_1

    .line 175
    const/4 v0, 0x0

    goto :goto_0

    .line 177
    :cond_1
    invoke-static {p0, p1}, Lcom/google/inject/internal/util/$Collections2;->setEquals(Ljava/util/Set;Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0
.end method

.method public hashCode()I
    .locals 4

    .prologue
    .line 181
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableSet;, "Lcom/google/inject/internal/util/$ImmutableSet<TE;>;"
    const/4 v0, 0x0

    .line 182
    .local v0, "hashCode":I
    invoke-virtual {p0}, Lcom/google/inject/internal/util/$ImmutableSet;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .local v1, "i$":Ljava/util/Iterator;
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 183
    .local v2, "o":Ljava/lang/Object;
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v3

    add-int/2addr v0, v3

    goto :goto_0

    .line 185
    .end local v2    # "o":Ljava/lang/Object;
    :cond_0
    return v0
.end method

.method isHashCodeFast()Z
    .locals 1

    .prologue
    .line 164
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableSet;, "Lcom/google/inject/internal/util/$ImmutableSet<TE;>;"
    const/4 v0, 0x0

    return v0
.end method

.method public abstract iterator()Lcom/google/inject/internal/util/$UnmodifiableIterator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/inject/internal/util/$UnmodifiableIterator",
            "<TE;>;"
        }
    .end annotation
.end method

.method public bridge synthetic iterator()Ljava/util/Iterator;
    .locals 1

    .prologue
    .line 59
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableSet;, "Lcom/google/inject/internal/util/$ImmutableSet<TE;>;"
    invoke-virtual {p0}, Lcom/google/inject/internal/util/$ImmutableSet;->iterator()Lcom/google/inject/internal/util/$UnmodifiableIterator;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    .prologue
    .line 193
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableSet;, "Lcom/google/inject/internal/util/$ImmutableSet<TE;>;"
    invoke-virtual {p0}, Lcom/google/inject/internal/util/$ImmutableSet;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 194
    const-string v3, "[]"

    .line 202
    :goto_0
    return-object v3

    .line 196
    :cond_0
    invoke-virtual {p0}, Lcom/google/inject/internal/util/$ImmutableSet;->iterator()Lcom/google/inject/internal/util/$UnmodifiableIterator;

    move-result-object v1

    .line 197
    .local v1, "iterator":Ljava/util/Iterator;, "Ljava/util/Iterator<TE;>;"
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/google/inject/internal/util/$ImmutableSet;->size()I

    move-result v3

    mul-int/lit8 v3, v3, 0x10

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 198
    .local v2, "result":Ljava/lang/StringBuilder;
    const/16 v3, 0x5b

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 199
    const/4 v0, 0x1

    .local v0, "i":I
    :goto_1
    invoke-virtual {p0}, Lcom/google/inject/internal/util/$ImmutableSet;->size()I

    move-result v3

    if-ge v0, v3, :cond_1

    .line 200
    const-string v3, ", "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 199
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 202
    :cond_1
    const/16 v3, 0x5d

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    goto :goto_0
.end method

.method writeReplace()Ljava/lang/Object;
    .locals 2

    .prologue
    .line 541
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableSet;, "Lcom/google/inject/internal/util/$ImmutableSet<TE;>;"
    new-instance v0, Lcom/google/inject/internal/util/$ImmutableSet$SerializedForm;

    invoke-virtual {p0}, Lcom/google/inject/internal/util/$ImmutableSet;->toArray()[Ljava/lang/Object;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/inject/internal/util/$ImmutableSet$SerializedForm;-><init>([Ljava/lang/Object;)V

    return-object v0
.end method
