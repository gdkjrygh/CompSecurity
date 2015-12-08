.class public abstract Lcom/google/inject/internal/util/$ImmutableCollection;
.super Ljava/lang/Object;
.source "ImmutableCollection.java"

# interfaces
.implements Ljava/util/Collection;
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/inject/internal/util/$ImmutableCollection$SerializedForm;,
        Lcom/google/inject/internal/util/$ImmutableCollection$ArrayImmutableCollection;,
        Lcom/google/inject/internal/util/$ImmutableCollection$EmptyImmutableCollection;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/util/Collection",
        "<TE;>;",
        "Ljava/io/Serializable;"
    }
.end annotation


# static fields
.field private static final EMPTY_ARRAY:[Ljava/lang/Object;

.field static final EMPTY_IMMUTABLE_COLLECTION:Lcom/google/inject/internal/util/$ImmutableCollection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/inject/internal/util/$ImmutableCollection",
            "<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private static final EMPTY_ITERATOR:Lcom/google/inject/internal/util/$UnmodifiableIterator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/inject/internal/util/$UnmodifiableIterator",
            "<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 36
    new-instance v0, Lcom/google/inject/internal/util/$ImmutableCollection$EmptyImmutableCollection;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/inject/internal/util/$ImmutableCollection$EmptyImmutableCollection;-><init>(Lcom/google/inject/internal/util/$ImmutableCollection$1;)V

    sput-object v0, Lcom/google/inject/internal/util/$ImmutableCollection;->EMPTY_IMMUTABLE_COLLECTION:Lcom/google/inject/internal/util/$ImmutableCollection;

    .line 40
    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    sput-object v0, Lcom/google/inject/internal/util/$ImmutableCollection;->EMPTY_ARRAY:[Ljava/lang/Object;

    .line 41
    new-instance v0, Lcom/google/inject/internal/util/$ImmutableCollection$1;

    invoke-direct {v0}, Lcom/google/inject/internal/util/$ImmutableCollection$1;-><init>()V

    sput-object v0, Lcom/google/inject/internal/util/$ImmutableCollection;->EMPTY_ITERATOR:Lcom/google/inject/internal/util/$UnmodifiableIterator;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    .prologue
    .line 51
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableCollection;, "Lcom/google/inject/internal/util/$ImmutableCollection<TE;>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic access$100()Lcom/google/inject/internal/util/$UnmodifiableIterator;
    .locals 1

    .prologue
    .line 34
    sget-object v0, Lcom/google/inject/internal/util/$ImmutableCollection;->EMPTY_ITERATOR:Lcom/google/inject/internal/util/$UnmodifiableIterator;

    return-object v0
.end method

.method static synthetic access$200()[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 34
    sget-object v0, Lcom/google/inject/internal/util/$ImmutableCollection;->EMPTY_ARRAY:[Ljava/lang/Object;

    return-object v0
.end method


# virtual methods
.method public final add(Ljava/lang/Object;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)Z"
        }
    .end annotation

    .prologue
    .line 129
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableCollection;, "Lcom/google/inject/internal/util/$ImmutableCollection<TE;>;"
    .local p1, "e":Ljava/lang/Object;, "TE;"
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final addAll(Ljava/util/Collection;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<+TE;>;)Z"
        }
    .end annotation

    .prologue
    .line 147
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableCollection;, "Lcom/google/inject/internal/util/$ImmutableCollection<TE;>;"
    .local p1, "newElements":Ljava/util/Collection;, "Ljava/util/Collection<+TE;>;"
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final clear()V
    .locals 1

    .prologue
    .line 174
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableCollection;, "Lcom/google/inject/internal/util/$ImmutableCollection<TE;>;"
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public contains(Ljava/lang/Object;)Z
    .locals 4
    .param p1, "object"    # Ljava/lang/Object;
        .annotation runtime Lcom/google/inject/internal/util/$Nullable;
        .end annotation
    .end param

    .prologue
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableCollection;, "Lcom/google/inject/internal/util/$ImmutableCollection<TE;>;"
    const/4 v2, 0x0

    .line 85
    if-nez p1, :cond_1

    .line 93
    :cond_0
    :goto_0
    return v2

    .line 88
    :cond_1
    invoke-virtual {p0}, Lcom/google/inject/internal/util/$ImmutableCollection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .local v1, "i$":Ljava/util/Iterator;
    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .line 89
    .local v0, "element":Ljava/lang/Object;, "TE;"
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 90
    const/4 v2, 0x1

    goto :goto_0
.end method

.method public containsAll(Ljava/util/Collection;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<*>;)Z"
        }
    .end annotation

    .prologue
    .line 97
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableCollection;, "Lcom/google/inject/internal/util/$ImmutableCollection<TE;>;"
    .local p1, "targets":Ljava/util/Collection;, "Ljava/util/Collection<*>;"
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .local v0, "i$":Ljava/util/Iterator;
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 98
    .local v1, "target":Ljava/lang/Object;
    invoke-virtual {p0, v1}, Lcom/google/inject/internal/util/$ImmutableCollection;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 99
    const/4 v2, 0x0

    .line 102
    .end local v1    # "target":Ljava/lang/Object;
    :goto_0
    return v2

    :cond_1
    const/4 v2, 0x1

    goto :goto_0
.end method

.method public isEmpty()Z
    .locals 1

    .prologue
    .line 106
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableCollection;, "Lcom/google/inject/internal/util/$ImmutableCollection<TE;>;"
    invoke-virtual {p0}, Lcom/google/inject/internal/util/$ImmutableCollection;->size()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
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
    .line 33
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableCollection;, "Lcom/google/inject/internal/util/$ImmutableCollection<TE;>;"
    invoke-virtual {p0}, Lcom/google/inject/internal/util/$ImmutableCollection;->iterator()Lcom/google/inject/internal/util/$UnmodifiableIterator;

    move-result-object v0

    return-object v0
.end method

.method public final remove(Ljava/lang/Object;)Z
    .locals 1
    .param p1, "object"    # Ljava/lang/Object;

    .prologue
    .line 138
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableCollection;, "Lcom/google/inject/internal/util/$ImmutableCollection<TE;>;"
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final removeAll(Ljava/util/Collection;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<*>;)Z"
        }
    .end annotation

    .prologue
    .line 156
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableCollection;, "Lcom/google/inject/internal/util/$ImmutableCollection<TE;>;"
    .local p1, "oldElements":Ljava/util/Collection;, "Ljava/util/Collection<*>;"
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final retainAll(Ljava/util/Collection;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<*>;)Z"
        }
    .end annotation

    .prologue
    .line 165
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableCollection;, "Lcom/google/inject/internal/util/$ImmutableCollection<TE;>;"
    .local p1, "elementsToKeep":Ljava/util/Collection;, "Ljava/util/Collection<*>;"
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public toArray()[Ljava/lang/Object;
    .locals 2

    .prologue
    .line 59
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableCollection;, "Lcom/google/inject/internal/util/$ImmutableCollection<TE;>;"
    invoke-virtual {p0}, Lcom/google/inject/internal/util/$ImmutableCollection;->size()I

    move-result v1

    new-array v0, v1, [Ljava/lang/Object;

    .line 60
    .local v0, "newArray":[Ljava/lang/Object;
    invoke-virtual {p0, v0}, Lcom/google/inject/internal/util/$ImmutableCollection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    return-object v1
.end method

.method public toArray([Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([TT;)[TT;"
        }
    .end annotation

    .prologue
    .line 64
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableCollection;, "Lcom/google/inject/internal/util/$ImmutableCollection<TE;>;"
    .local p1, "other":[Ljava/lang/Object;, "[TT;"
    invoke-virtual {p0}, Lcom/google/inject/internal/util/$ImmutableCollection;->size()I

    move-result v5

    .line 65
    .local v5, "size":I
    array-length v6, p1

    if-ge v6, v5, :cond_1

    .line 66
    invoke-static {p1, v5}, Lcom/google/inject/internal/util/$ObjectArrays;->newArray([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    .line 70
    :cond_0
    :goto_0
    const/4 v3, 0x0

    .line 71
    .local v3, "index":I
    invoke-virtual {p0}, Lcom/google/inject/internal/util/$ImmutableCollection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .local v2, "i$":Ljava/util/Iterator;
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .line 77
    .local v0, "element":Ljava/lang/Object;, "TE;"
    move-object v1, v0

    .line 79
    .local v1, "elementAsT":Ljava/lang/Object;, "TT;"
    add-int/lit8 v4, v3, 0x1

    .end local v3    # "index":I
    .local v4, "index":I
    aput-object v1, p1, v3

    move v3, v4

    .line 80
    .end local v4    # "index":I
    .restart local v3    # "index":I
    goto :goto_1

    .line 67
    .end local v0    # "element":Ljava/lang/Object;, "TE;"
    .end local v1    # "elementAsT":Ljava/lang/Object;, "TT;"
    .end local v2    # "i$":Ljava/util/Iterator;
    .end local v3    # "index":I
    :cond_1
    array-length v6, p1

    if-le v6, v5, :cond_0

    .line 68
    const/4 v6, 0x0

    aput-object v6, p1, v5

    goto :goto_0

    .line 81
    .restart local v2    # "i$":Ljava/util/Iterator;
    .restart local v3    # "index":I
    :cond_2
    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .prologue
    .line 110
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableCollection;, "Lcom/google/inject/internal/util/$ImmutableCollection<TE;>;"
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/google/inject/internal/util/$ImmutableCollection;->size()I

    move-result v2

    mul-int/lit8 v2, v2, 0x10

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 111
    .local v1, "sb":Ljava/lang/StringBuilder;
    const/16 v2, 0x5b

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 112
    invoke-virtual {p0}, Lcom/google/inject/internal/util/$ImmutableCollection;->iterator()Lcom/google/inject/internal/util/$UnmodifiableIterator;

    move-result-object v0

    .line 113
    .local v0, "i":Ljava/util/Iterator;, "Ljava/util/Iterator<TE;>;"
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 114
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 116
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 117
    const-string v2, ", "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 118
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 120
    :cond_1
    const/16 v2, 0x5d

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    return-object v2
.end method

.method writeReplace()Ljava/lang/Object;
    .locals 2

    .prologue
    .line 257
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableCollection;, "Lcom/google/inject/internal/util/$ImmutableCollection<TE;>;"
    new-instance v0, Lcom/google/inject/internal/util/$ImmutableCollection$SerializedForm;

    invoke-virtual {p0}, Lcom/google/inject/internal/util/$ImmutableCollection;->toArray()[Ljava/lang/Object;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/inject/internal/util/$ImmutableCollection$SerializedForm;-><init>([Ljava/lang/Object;)V

    return-object v0
.end method
