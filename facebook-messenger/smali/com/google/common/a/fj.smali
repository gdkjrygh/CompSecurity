.class abstract Lcom/google/common/a/fj;
.super Lcom/google/common/a/fi;
.source "ImmutableSet.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/common/a/fi",
        "<TE;>;"
    }
.end annotation


# instance fields
.field final transient a:[Ljava/lang/Object;


# direct methods
.method constructor <init>([Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 397
    invoke-direct {p0}, Lcom/google/common/a/fi;-><init>()V

    .line 398
    iput-object p1, p0, Lcom/google/common/a/fj;->a:[Ljava/lang/Object;

    .line 399
    return-void
.end method


# virtual methods
.method a()Z
    .locals 1

    .prologue
    .line 455
    const/4 v0, 0x0

    return v0
.end method

.method public containsAll(Ljava/util/Collection;)Z
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<*>;)Z"
        }
    .end annotation

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 437
    if-ne p1, p0, :cond_1

    .line 451
    :cond_0
    :goto_0
    return v0

    .line 440
    :cond_1
    instance-of v2, p1, Lcom/google/common/a/fj;

    if-nez v2, :cond_2

    .line 441
    invoke-super {p0, p1}, Lcom/google/common/a/fi;->containsAll(Ljava/util/Collection;)Z

    move-result v0

    goto :goto_0

    .line 443
    :cond_2
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result v2

    invoke-virtual {p0}, Lcom/google/common/a/fj;->size()I

    move-result v3

    if-le v2, v3, :cond_3

    move v0, v1

    .line 444
    goto :goto_0

    .line 446
    :cond_3
    check-cast p1, Lcom/google/common/a/fj;

    iget-object v3, p1, Lcom/google/common/a/fj;->a:[Ljava/lang/Object;

    array-length v4, v3

    move v2, v1

    :goto_1
    if-ge v2, v4, :cond_0

    aget-object v5, v3, v2

    .line 447
    invoke-virtual {p0, v5}, Lcom/google/common/a/fj;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_4

    move v0, v1

    .line 448
    goto :goto_0

    .line 446
    :cond_4
    add-int/lit8 v2, v2, 0x1

    goto :goto_1
.end method

.method public h_()Lcom/google/common/a/mh;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/mh",
            "<TE;>;"
        }
    .end annotation

    .prologue
    .line 416
    iget-object v0, p0, Lcom/google/common/a/fj;->a:[Ljava/lang/Object;

    invoke-static {v0}, Lcom/google/common/a/gg;->a([Ljava/lang/Object;)Lcom/google/common/a/mh;

    move-result-object v0

    return-object v0
.end method

.method i()Lcom/google/common/a/es;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/es",
            "<TE;>;"
        }
    .end annotation

    .prologue
    .line 459
    new-instance v0, Lcom/google/common/a/ei;

    iget-object v1, p0, Lcom/google/common/a/fj;->a:[Ljava/lang/Object;

    invoke-direct {v0, v1, p0}, Lcom/google/common/a/ei;-><init>([Ljava/lang/Object;Lcom/google/common/a/em;)V

    return-object v0
.end method

.method public isEmpty()Z
    .locals 1

    .prologue
    .line 407
    const/4 v0, 0x0

    return v0
.end method

.method public synthetic iterator()Ljava/util/Iterator;
    .locals 1

    .prologue
    .line 393
    invoke-virtual {p0}, Lcom/google/common/a/fj;->h_()Lcom/google/common/a/mh;

    move-result-object v0

    return-object v0
.end method

.method public size()I
    .locals 1

    .prologue
    .line 403
    iget-object v0, p0, Lcom/google/common/a/fj;->a:[Ljava/lang/Object;

    array-length v0, v0

    return v0
.end method

.method public toArray()[Ljava/lang/Object;
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 420
    invoke-virtual {p0}, Lcom/google/common/a/fj;->size()I

    move-result v0

    new-array v0, v0, [Ljava/lang/Object;

    .line 421
    iget-object v1, p0, Lcom/google/common/a/fj;->a:[Ljava/lang/Object;

    invoke-virtual {p0}, Lcom/google/common/a/fj;->size()I

    move-result v2

    invoke-static {v1, v3, v0, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 422
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
    const/4 v2, 0x0

    .line 426
    invoke-virtual {p0}, Lcom/google/common/a/fj;->size()I

    move-result v0

    .line 427
    array-length v1, p1

    if-ge v1, v0, :cond_1

    .line 428
    invoke-static {p1, v0}, Lcom/google/common/a/jp;->a([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    .line 432
    :cond_0
    :goto_0
    iget-object v1, p0, Lcom/google/common/a/fj;->a:[Ljava/lang/Object;

    invoke-static {v1, v2, p1, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 433
    return-object p1

    .line 429
    :cond_1
    array-length v1, p1

    if-le v1, v0, :cond_0

    .line 430
    const/4 v1, 0x0

    aput-object v1, p1, v0

    goto :goto_0
.end method
