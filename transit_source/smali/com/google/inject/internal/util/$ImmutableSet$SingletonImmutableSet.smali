.class final Lcom/google/inject/internal/util/$ImmutableSet$SingletonImmutableSet;
.super Lcom/google/inject/internal/util/$ImmutableSet;
.source "ImmutableSet.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/inject/internal/util/$ImmutableSet;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "SingletonImmutableSet"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/inject/internal/util/$ImmutableSet",
        "<TE;>;"
    }
.end annotation


# instance fields
.field final element:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TE;"
        }
    .end annotation
.end field

.field final hashCode:I


# direct methods
.method constructor <init>(Ljava/lang/Object;I)V
    .locals 0
    .param p2, "hashCode"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;I)V"
        }
    .end annotation

    .prologue
    .line 264
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableSet$SingletonImmutableSet;, "Lcom/google/inject/internal/util/$ImmutableSet$SingletonImmutableSet<TE;>;"
    .local p1, "element":Ljava/lang/Object;, "TE;"
    invoke-direct {p0}, Lcom/google/inject/internal/util/$ImmutableSet;-><init>()V

    .line 265
    iput-object p1, p0, Lcom/google/inject/internal/util/$ImmutableSet$SingletonImmutableSet;->element:Ljava/lang/Object;

    .line 266
    iput p2, p0, Lcom/google/inject/internal/util/$ImmutableSet$SingletonImmutableSet;->hashCode:I

    .line 267
    return-void
.end method


# virtual methods
.method public contains(Ljava/lang/Object;)Z
    .locals 1
    .param p1, "target"    # Ljava/lang/Object;

    .prologue
    .line 278
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableSet$SingletonImmutableSet;, "Lcom/google/inject/internal/util/$ImmutableSet$SingletonImmutableSet<TE;>;"
    iget-object v0, p0, Lcom/google/inject/internal/util/$ImmutableSet$SingletonImmutableSet;->element:Ljava/lang/Object;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 5
    .param p1, "object"    # Ljava/lang/Object;
        .annotation runtime Lcom/google/inject/internal/util/$Nullable;
        .end annotation
    .end param

    .prologue
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableSet$SingletonImmutableSet;, "Lcom/google/inject/internal/util/$ImmutableSet$SingletonImmutableSet<TE;>;"
    const/4 v2, 0x0

    const/4 v1, 0x1

    .line 301
    if-ne p1, p0, :cond_1

    .line 308
    :cond_0
    :goto_0
    return v1

    .line 304
    :cond_1
    instance-of v3, p1, Ljava/util/Set;

    if-eqz v3, :cond_3

    move-object v0, p1

    .line 305
    check-cast v0, Ljava/util/Set;

    .line 306
    .local v0, "that":Ljava/util/Set;, "Ljava/util/Set<*>;"
    invoke-interface {v0}, Ljava/util/Set;->size()I

    move-result v3

    if-ne v3, v1, :cond_2

    iget-object v3, p0, Lcom/google/inject/internal/util/$ImmutableSet$SingletonImmutableSet;->element:Ljava/lang/Object;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    :cond_2
    move v1, v2

    goto :goto_0

    .end local v0    # "that":Ljava/util/Set;, "Ljava/util/Set<*>;"
    :cond_3
    move v1, v2

    .line 308
    goto :goto_0
.end method

.method public final hashCode()I
    .locals 1

    .prologue
    .line 312
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableSet$SingletonImmutableSet;, "Lcom/google/inject/internal/util/$ImmutableSet$SingletonImmutableSet<TE;>;"
    iget v0, p0, Lcom/google/inject/internal/util/$ImmutableSet$SingletonImmutableSet;->hashCode:I

    return v0
.end method

.method public isEmpty()Z
    .locals 1

    .prologue
    .line 274
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableSet$SingletonImmutableSet;, "Lcom/google/inject/internal/util/$ImmutableSet$SingletonImmutableSet<TE;>;"
    const/4 v0, 0x0

    return v0
.end method

.method isHashCodeFast()Z
    .locals 1

    .prologue
    .line 316
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableSet$SingletonImmutableSet;, "Lcom/google/inject/internal/util/$ImmutableSet$SingletonImmutableSet<TE;>;"
    const/4 v0, 0x1

    return v0
.end method

.method public iterator()Lcom/google/inject/internal/util/$UnmodifiableIterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/inject/internal/util/$UnmodifiableIterator",
            "<TE;>;"
        }
    .end annotation

    .prologue
    .line 282
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableSet$SingletonImmutableSet;, "Lcom/google/inject/internal/util/$ImmutableSet$SingletonImmutableSet<TE;>;"
    iget-object v0, p0, Lcom/google/inject/internal/util/$ImmutableSet$SingletonImmutableSet;->element:Ljava/lang/Object;

    invoke-static {v0}, Lcom/google/inject/internal/util/$Iterators;->singletonIterator(Ljava/lang/Object;)Lcom/google/inject/internal/util/$UnmodifiableIterator;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic iterator()Ljava/util/Iterator;
    .locals 1

    .prologue
    .line 260
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableSet$SingletonImmutableSet;, "Lcom/google/inject/internal/util/$ImmutableSet$SingletonImmutableSet<TE;>;"
    invoke-virtual {p0}, Lcom/google/inject/internal/util/$ImmutableSet$SingletonImmutableSet;->iterator()Lcom/google/inject/internal/util/$UnmodifiableIterator;

    move-result-object v0

    return-object v0
.end method

.method public size()I
    .locals 1

    .prologue
    .line 270
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableSet$SingletonImmutableSet;, "Lcom/google/inject/internal/util/$ImmutableSet$SingletonImmutableSet<TE;>;"
    const/4 v0, 0x1

    return v0
.end method

.method public toArray()[Ljava/lang/Object;
    .locals 3

    .prologue
    .line 286
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableSet$SingletonImmutableSet;, "Lcom/google/inject/internal/util/$ImmutableSet$SingletonImmutableSet<TE;>;"
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/google/inject/internal/util/$ImmutableSet$SingletonImmutableSet;->element:Ljava/lang/Object;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public toArray([Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([TT;)[TT;"
        }
    .end annotation

    .prologue
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableSet$SingletonImmutableSet;, "Lcom/google/inject/internal/util/$ImmutableSet$SingletonImmutableSet<TE;>;"
    .local p1, "array":[Ljava/lang/Object;, "[TT;"
    const/4 v1, 0x1

    .line 291
    array-length v0, p1

    if-nez v0, :cond_1

    .line 292
    invoke-static {p1, v1}, Lcom/google/inject/internal/util/$ObjectArrays;->newArray([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    .line 296
    :cond_0
    :goto_0
    const/4 v0, 0x0

    iget-object v1, p0, Lcom/google/inject/internal/util/$ImmutableSet$SingletonImmutableSet;->element:Ljava/lang/Object;

    aput-object v1, p1, v0

    .line 297
    return-object p1

    .line 293
    :cond_1
    array-length v0, p1

    if-le v0, v1, :cond_0

    .line 294
    const/4 v0, 0x0

    aput-object v0, p1, v1

    goto :goto_0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .prologue
    .line 320
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableSet$SingletonImmutableSet;, "Lcom/google/inject/internal/util/$ImmutableSet$SingletonImmutableSet<TE;>;"
    iget-object v1, p0, Lcom/google/inject/internal/util/$ImmutableSet$SingletonImmutableSet;->element:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    .line 321
    .local v0, "elementToString":Ljava/lang/String;
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    add-int/lit8 v2, v2, 0x2

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const/16 v2, 0x5b

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const/16 v2, 0x5d

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    return-object v1
.end method
