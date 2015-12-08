.class final Lcom/google/inject/internal/util/$ImmutableList$EmptyImmutableList;
.super Lcom/google/inject/internal/util/$ImmutableList;
.source "ImmutableList.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/inject/internal/util/$ImmutableList;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "EmptyImmutableList"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/inject/internal/util/$ImmutableList",
        "<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# static fields
.field private static final EMPTY_ARRAY:[Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 276
    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    sput-object v0, Lcom/google/inject/internal/util/$ImmutableList$EmptyImmutableList;->EMPTY_ARRAY:[Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .prologue
    .line 259
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/inject/internal/util/$ImmutableList;-><init>(Lcom/google/inject/internal/util/$ImmutableList$1;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/inject/internal/util/$ImmutableList$1;)V
    .locals 0
    .param p1, "x0"    # Lcom/google/inject/internal/util/$ImmutableList$1;

    .prologue
    .line 259
    invoke-direct {p0}, Lcom/google/inject/internal/util/$ImmutableList$EmptyImmutableList;-><init>()V

    return-void
.end method


# virtual methods
.method public contains(Ljava/lang/Object;)Z
    .locals 1
    .param p1, "target"    # Ljava/lang/Object;

    .prologue
    .line 269
    const/4 v0, 0x0

    return v0
.end method

.method public containsAll(Ljava/util/Collection;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<*>;)Z"
        }
    .end annotation

    .prologue
    .line 318
    .local p1, "targets":Ljava/util/Collection;, "Ljava/util/Collection<*>;"
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2
    .param p1, "object"    # Ljava/lang/Object;
        .annotation runtime Lcom/google/inject/internal/util/$Nullable;
        .end annotation
    .end param

    .prologue
    .line 322
    instance-of v1, p1, Ljava/util/List;

    if-eqz v1, :cond_0

    move-object v0, p1

    .line 323
    check-cast v0, Ljava/util/List;

    .line 324
    .local v0, "that":Ljava/util/List;, "Ljava/util/List<*>;"
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    .line 326
    .end local v0    # "that":Ljava/util/List;, "Ljava/util/List<*>;"
    :goto_0
    return v1

    :cond_0
    const/4 v1, 0x0

    goto :goto_0
.end method

.method public get(I)Ljava/lang/Object;
    .locals 2
    .param p1, "index"    # I

    .prologue
    .line 291
    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/google/inject/internal/util/$Preconditions;->checkElementIndex(II)V

    .line 292
    new-instance v0, Ljava/lang/AssertionError;

    const-string v1, "unreachable"

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0
.end method

.method public hashCode()I
    .locals 1

    .prologue
    .line 330
    const/4 v0, 0x1

    return v0
.end method

.method public indexOf(Ljava/lang/Object;)I
    .locals 1
    .param p1, "target"    # Ljava/lang/Object;

    .prologue
    .line 296
    const/4 v0, -0x1

    return v0
.end method

.method public isEmpty()Z
    .locals 1

    .prologue
    .line 265
    const/4 v0, 0x1

    return v0
.end method

.method public iterator()Lcom/google/inject/internal/util/$UnmodifiableIterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/inject/internal/util/$UnmodifiableIterator",
            "<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .prologue
    .line 273
    invoke-static {}, Lcom/google/inject/internal/util/$Iterators;->emptyIterator()Lcom/google/inject/internal/util/$UnmodifiableIterator;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic iterator()Ljava/util/Iterator;
    .locals 1

    .prologue
    .line 259
    invoke-virtual {p0}, Lcom/google/inject/internal/util/$ImmutableList$EmptyImmutableList;->iterator()Lcom/google/inject/internal/util/$UnmodifiableIterator;

    move-result-object v0

    return-object v0
.end method

.method public lastIndexOf(Ljava/lang/Object;)I
    .locals 1
    .param p1, "target"    # Ljava/lang/Object;

    .prologue
    .line 300
    const/4 v0, -0x1

    return v0
.end method

.method public listIterator()Ljava/util/ListIterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ListIterator",
            "<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .prologue
    .line 309
    invoke-static {}, Lcom/google/inject/internal/util/$Iterators;->emptyListIterator()Ljava/util/ListIterator;

    move-result-object v0

    return-object v0
.end method

.method public listIterator(I)Ljava/util/ListIterator;
    .locals 1
    .param p1, "start"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/ListIterator",
            "<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .prologue
    .line 313
    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/google/inject/internal/util/$Preconditions;->checkPositionIndex(II)V

    .line 314
    invoke-static {}, Lcom/google/inject/internal/util/$Iterators;->emptyListIterator()Ljava/util/ListIterator;

    move-result-object v0

    return-object v0
.end method

.method public size()I
    .locals 1

    .prologue
    .line 261
    const/4 v0, 0x0

    return v0
.end method

.method public subList(II)Lcom/google/inject/internal/util/$ImmutableList;
    .locals 1
    .param p1, "fromIndex"    # I
    .param p2, "toIndex"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)",
            "Lcom/google/inject/internal/util/$ImmutableList",
            "<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .prologue
    .line 304
    const/4 v0, 0x0

    invoke-static {p1, p2, v0}, Lcom/google/inject/internal/util/$Preconditions;->checkPositionIndexes(III)V

    .line 305
    return-object p0
.end method

.method public bridge synthetic subList(II)Ljava/util/List;
    .locals 1
    .param p1, "x0"    # I
    .param p2, "x1"    # I

    .prologue
    .line 259
    invoke-virtual {p0, p1, p2}, Lcom/google/inject/internal/util/$ImmutableList$EmptyImmutableList;->subList(II)Lcom/google/inject/internal/util/$ImmutableList;

    move-result-object v0

    return-object v0
.end method

.method public toArray()[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 279
    sget-object v0, Lcom/google/inject/internal/util/$ImmutableList$EmptyImmutableList;->EMPTY_ARRAY:[Ljava/lang/Object;

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
    .line 283
    .local p1, "a":[Ljava/lang/Object;, "[TT;"
    array-length v0, p1

    if-lez v0, :cond_0

    .line 284
    const/4 v0, 0x0

    const/4 v1, 0x0

    aput-object v1, p1, v0

    .line 286
    :cond_0
    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 334
    const-string v0, "[]"

    return-object v0
.end method
