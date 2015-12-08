.class abstract Lcom/google/inject/internal/util/$ImmutableSet$TransformedImmutableSet;
.super Lcom/google/inject/internal/util/$ImmutableSet;
.source "ImmutableSet.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/inject/internal/util/$ImmutableSet;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x408
    name = "TransformedImmutableSet"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<D:",
        "Ljava/lang/Object;",
        "E:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/inject/internal/util/$ImmutableSet",
        "<TE;>;"
    }
.end annotation


# instance fields
.field final hashCode:I

.field final source:[Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[TD;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>([Ljava/lang/Object;I)V
    .locals 0
    .param p2, "hashCode"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([TD;I)V"
        }
    .end annotation

    .prologue
    .line 465
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableSet$TransformedImmutableSet;, "Lcom/google/inject/internal/util/$ImmutableSet$TransformedImmutableSet<TD;TE;>;"
    .local p1, "source":[Ljava/lang/Object;, "[TD;"
    invoke-direct {p0}, Lcom/google/inject/internal/util/$ImmutableSet;-><init>()V

    .line 466
    iput-object p1, p0, Lcom/google/inject/internal/util/$ImmutableSet$TransformedImmutableSet;->source:[Ljava/lang/Object;

    .line 467
    iput p2, p0, Lcom/google/inject/internal/util/$ImmutableSet$TransformedImmutableSet;->hashCode:I

    .line 468
    return-void
.end method


# virtual methods
.method public final hashCode()I
    .locals 1

    .prologue
    .line 514
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableSet$TransformedImmutableSet;, "Lcom/google/inject/internal/util/$ImmutableSet$TransformedImmutableSet<TD;TE;>;"
    iget v0, p0, Lcom/google/inject/internal/util/$ImmutableSet$TransformedImmutableSet;->hashCode:I

    return v0
.end method

.method public isEmpty()Z
    .locals 1

    .prologue
    .line 477
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableSet$TransformedImmutableSet;, "Lcom/google/inject/internal/util/$ImmutableSet$TransformedImmutableSet<TD;TE;>;"
    const/4 v0, 0x0

    return v0
.end method

.method isHashCodeFast()Z
    .locals 1

    .prologue
    .line 518
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableSet$TransformedImmutableSet;, "Lcom/google/inject/internal/util/$ImmutableSet$TransformedImmutableSet<TD;TE;>;"
    const/4 v0, 0x1

    return v0
.end method

.method public iterator()Lcom/google/inject/internal/util/$UnmodifiableIterator;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/inject/internal/util/$UnmodifiableIterator",
            "<TE;>;"
        }
    .end annotation

    .prologue
    .line 481
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableSet$TransformedImmutableSet;, "Lcom/google/inject/internal/util/$ImmutableSet$TransformedImmutableSet<TD;TE;>;"
    new-instance v0, Lcom/google/inject/internal/util/$ImmutableSet$TransformedImmutableSet$1;

    invoke-direct {v0, p0}, Lcom/google/inject/internal/util/$ImmutableSet$TransformedImmutableSet$1;-><init>(Lcom/google/inject/internal/util/$ImmutableSet$TransformedImmutableSet;)V

    .line 491
    .local v0, "iterator":Ljava/util/Iterator;, "Ljava/util/Iterator<TE;>;"
    invoke-static {v0}, Lcom/google/inject/internal/util/$Iterators;->unmodifiableIterator(Ljava/util/Iterator;)Lcom/google/inject/internal/util/$UnmodifiableIterator;

    move-result-object v1

    return-object v1
.end method

.method public bridge synthetic iterator()Ljava/util/Iterator;
    .locals 1

    .prologue
    .line 461
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableSet$TransformedImmutableSet;, "Lcom/google/inject/internal/util/$ImmutableSet$TransformedImmutableSet<TD;TE;>;"
    invoke-virtual {p0}, Lcom/google/inject/internal/util/$ImmutableSet$TransformedImmutableSet;->iterator()Lcom/google/inject/internal/util/$UnmodifiableIterator;

    move-result-object v0

    return-object v0
.end method

.method public size()I
    .locals 1

    .prologue
    .line 473
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableSet$TransformedImmutableSet;, "Lcom/google/inject/internal/util/$ImmutableSet$TransformedImmutableSet<TD;TE;>;"
    iget-object v0, p0, Lcom/google/inject/internal/util/$ImmutableSet$TransformedImmutableSet;->source:[Ljava/lang/Object;

    array-length v0, v0

    return v0
.end method

.method public toArray()[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 495
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableSet$TransformedImmutableSet;, "Lcom/google/inject/internal/util/$ImmutableSet$TransformedImmutableSet<TD;TE;>;"
    invoke-virtual {p0}, Lcom/google/inject/internal/util/$ImmutableSet$TransformedImmutableSet;->size()I

    move-result v0

    new-array v0, v0, [Ljava/lang/Object;

    invoke-virtual {p0, v0}, Lcom/google/inject/internal/util/$ImmutableSet$TransformedImmutableSet;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public toArray([Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([TT;)[TT;"
        }
    .end annotation

    .prologue
    .line 500
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableSet$TransformedImmutableSet;, "Lcom/google/inject/internal/util/$ImmutableSet$TransformedImmutableSet<TD;TE;>;"
    .local p1, "array":[Ljava/lang/Object;, "[TT;"
    invoke-virtual {p0}, Lcom/google/inject/internal/util/$ImmutableSet$TransformedImmutableSet;->size()I

    move-result v1

    .line 501
    .local v1, "size":I
    array-length v2, p1

    if-ge v2, v1, :cond_1

    .line 502
    invoke-static {p1, v1}, Lcom/google/inject/internal/util/$ObjectArrays;->newArray([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    .line 507
    :cond_0
    :goto_0
    const/4 v0, 0x0

    .local v0, "i":I
    :goto_1
    iget-object v2, p0, Lcom/google/inject/internal/util/$ImmutableSet$TransformedImmutableSet;->source:[Ljava/lang/Object;

    array-length v2, v2

    if-ge v0, v2, :cond_2

    .line 508
    iget-object v2, p0, Lcom/google/inject/internal/util/$ImmutableSet$TransformedImmutableSet;->source:[Ljava/lang/Object;

    aget-object v2, v2, v0

    invoke-virtual {p0, v2}, Lcom/google/inject/internal/util/$ImmutableSet$TransformedImmutableSet;->transform(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    aput-object v2, p1, v0

    .line 507
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 503
    .end local v0    # "i":I
    :cond_1
    array-length v2, p1

    if-le v2, v1, :cond_0

    .line 504
    const/4 v2, 0x0

    aput-object v2, p1, v1

    goto :goto_0

    .line 510
    .restart local v0    # "i":I
    :cond_2
    return-object p1
.end method

.method abstract transform(Ljava/lang/Object;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TD;)TE;"
        }
    .end annotation
.end method
