.class final Lcom/google/inject/internal/util/$ImmutableSet$RegularImmutableSet;
.super Lcom/google/inject/internal/util/$ImmutableSet$ArrayImmutableSet;
.source "ImmutableSet.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/inject/internal/util/$ImmutableSet;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "RegularImmutableSet"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/inject/internal/util/$ImmutableSet$ArrayImmutableSet",
        "<TE;>;"
    }
.end annotation


# instance fields
.field final hashCode:I

.field final mask:I

.field final table:[Ljava/lang/Object;


# direct methods
.method constructor <init>([Ljava/lang/Object;I[Ljava/lang/Object;I)V
    .locals 0
    .param p1, "elements"    # [Ljava/lang/Object;
    .param p2, "hashCode"    # I
    .param p3, "table"    # [Ljava/lang/Object;
    .param p4, "mask"    # I

    .prologue
    .line 430
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableSet$RegularImmutableSet;, "Lcom/google/inject/internal/util/$ImmutableSet$RegularImmutableSet<TE;>;"
    invoke-direct {p0, p1}, Lcom/google/inject/internal/util/$ImmutableSet$ArrayImmutableSet;-><init>([Ljava/lang/Object;)V

    .line 431
    iput-object p3, p0, Lcom/google/inject/internal/util/$ImmutableSet$RegularImmutableSet;->table:[Ljava/lang/Object;

    .line 432
    iput p4, p0, Lcom/google/inject/internal/util/$ImmutableSet$RegularImmutableSet;->mask:I

    .line 433
    iput p2, p0, Lcom/google/inject/internal/util/$ImmutableSet$RegularImmutableSet;->hashCode:I

    .line 434
    return-void
.end method


# virtual methods
.method public contains(Ljava/lang/Object;)Z
    .locals 5
    .param p1, "target"    # Ljava/lang/Object;

    .prologue
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableSet$RegularImmutableSet;, "Lcom/google/inject/internal/util/$ImmutableSet$RegularImmutableSet<TE;>;"
    const/4 v2, 0x0

    .line 437
    if-nez p1, :cond_1

    .line 446
    :cond_0
    :goto_0
    return v2

    .line 440
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v3

    invoke-static {v3}, Lcom/google/inject/internal/util/$Hashing;->smear(I)I

    move-result v1

    .line 441
    .local v1, "i":I
    :goto_1
    iget-object v3, p0, Lcom/google/inject/internal/util/$ImmutableSet$RegularImmutableSet;->table:[Ljava/lang/Object;

    iget v4, p0, Lcom/google/inject/internal/util/$ImmutableSet$RegularImmutableSet;->mask:I

    and-int/2addr v4, v1

    aget-object v0, v3, v4

    .line 442
    .local v0, "candidate":Ljava/lang/Object;
    if-eqz v0, :cond_0

    .line 445
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 446
    const/4 v2, 0x1

    goto :goto_0

    .line 440
    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_1
.end method

.method public hashCode()I
    .locals 1

    .prologue
    .line 452
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableSet$RegularImmutableSet;, "Lcom/google/inject/internal/util/$ImmutableSet$RegularImmutableSet<TE;>;"
    iget v0, p0, Lcom/google/inject/internal/util/$ImmutableSet$RegularImmutableSet;->hashCode:I

    return v0
.end method

.method isHashCodeFast()Z
    .locals 1

    .prologue
    .line 456
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableSet$RegularImmutableSet;, "Lcom/google/inject/internal/util/$ImmutableSet$RegularImmutableSet<TE;>;"
    const/4 v0, 0x1

    return v0
.end method
