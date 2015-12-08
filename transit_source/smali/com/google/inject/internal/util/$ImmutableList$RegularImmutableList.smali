.class final Lcom/google/inject/internal/util/$ImmutableList$RegularImmutableList;
.super Lcom/google/inject/internal/util/$ImmutableList;
.source "ImmutableList.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/inject/internal/util/$ImmutableList;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "RegularImmutableList"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/inject/internal/util/$ImmutableList",
        "<TE;>;"
    }
.end annotation


# instance fields
.field private final array:[Ljava/lang/Object;

.field private final offset:I

.field private final size:I


# direct methods
.method private constructor <init>([Ljava/lang/Object;)V
    .locals 2
    .param p1, "array"    # [Ljava/lang/Object;

    .prologue
    .line 350
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableList$RegularImmutableList;, "Lcom/google/inject/internal/util/$ImmutableList$RegularImmutableList<TE;>;"
    const/4 v0, 0x0

    array-length v1, p1

    invoke-direct {p0, p1, v0, v1}, Lcom/google/inject/internal/util/$ImmutableList$RegularImmutableList;-><init>([Ljava/lang/Object;II)V

    .line 351
    return-void
.end method

.method private constructor <init>([Ljava/lang/Object;II)V
    .locals 1
    .param p1, "array"    # [Ljava/lang/Object;
    .param p2, "offset"    # I
    .param p3, "size"    # I

    .prologue
    .line 343
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableList$RegularImmutableList;, "Lcom/google/inject/internal/util/$ImmutableList$RegularImmutableList<TE;>;"
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/inject/internal/util/$ImmutableList;-><init>(Lcom/google/inject/internal/util/$ImmutableList$1;)V

    .line 344
    iput p2, p0, Lcom/google/inject/internal/util/$ImmutableList$RegularImmutableList;->offset:I

    .line 345
    iput p3, p0, Lcom/google/inject/internal/util/$ImmutableList$RegularImmutableList;->size:I

    .line 346
    iput-object p1, p0, Lcom/google/inject/internal/util/$ImmutableList$RegularImmutableList;->array:[Ljava/lang/Object;

    .line 347
    return-void
.end method

.method synthetic constructor <init>([Ljava/lang/Object;IILcom/google/inject/internal/util/$ImmutableList$1;)V
    .locals 0
    .param p1, "x0"    # [Ljava/lang/Object;
    .param p2, "x1"    # I
    .param p3, "x2"    # I
    .param p4, "x3"    # Lcom/google/inject/internal/util/$ImmutableList$1;

    .prologue
    .line 338
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableList$RegularImmutableList;, "Lcom/google/inject/internal/util/$ImmutableList$RegularImmutableList<TE;>;"
    invoke-direct {p0, p1, p2, p3}, Lcom/google/inject/internal/util/$ImmutableList$RegularImmutableList;-><init>([Ljava/lang/Object;II)V

    return-void
.end method

.method synthetic constructor <init>([Ljava/lang/Object;Lcom/google/inject/internal/util/$ImmutableList$1;)V
    .locals 0
    .param p1, "x0"    # [Ljava/lang/Object;
    .param p2, "x1"    # Lcom/google/inject/internal/util/$ImmutableList$1;

    .prologue
    .line 338
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableList$RegularImmutableList;, "Lcom/google/inject/internal/util/$ImmutableList$RegularImmutableList<TE;>;"
    invoke-direct {p0, p1}, Lcom/google/inject/internal/util/$ImmutableList$RegularImmutableList;-><init>([Ljava/lang/Object;)V

    return-void
.end method

.method static synthetic access$300(Lcom/google/inject/internal/util/$ImmutableList$RegularImmutableList;)I
    .locals 1
    .param p0, "x0"    # Lcom/google/inject/internal/util/$ImmutableList$RegularImmutableList;

    .prologue
    .line 338
    iget v0, p0, Lcom/google/inject/internal/util/$ImmutableList$RegularImmutableList;->size:I

    return v0
.end method


# virtual methods
.method public contains(Ljava/lang/Object;)Z
    .locals 2
    .param p1, "target"    # Ljava/lang/Object;

    .prologue
    .line 362
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableList$RegularImmutableList;, "Lcom/google/inject/internal/util/$ImmutableList$RegularImmutableList<TE;>;"
    invoke-virtual {p0, p1}, Lcom/google/inject/internal/util/$ImmutableList$RegularImmutableList;->indexOf(Ljava/lang/Object;)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 11
    .param p1, "object"    # Ljava/lang/Object;
        .annotation runtime Lcom/google/inject/internal/util/$Nullable;
        .end annotation
    .end param

    .prologue
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableList$RegularImmutableList;, "Lcom/google/inject/internal/util/$ImmutableList$RegularImmutableList<TE;>;"
    const/4 v7, 0x1

    const/4 v8, 0x0

    .line 482
    if-ne p1, p0, :cond_1

    .line 509
    :cond_0
    :goto_0
    return v7

    .line 485
    :cond_1
    instance-of v9, p1, Ljava/util/List;

    if-nez v9, :cond_2

    move v7, v8

    .line 486
    goto :goto_0

    :cond_2
    move-object v6, p1

    .line 489
    check-cast v6, Ljava/util/List;

    .line 490
    .local v6, "that":Ljava/util/List;, "Ljava/util/List<*>;"
    invoke-virtual {p0}, Lcom/google/inject/internal/util/$ImmutableList$RegularImmutableList;->size()I

    move-result v9

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v10

    if-eq v9, v10, :cond_3

    move v7, v8

    .line 491
    goto :goto_0

    .line 494
    :cond_3
    iget v3, p0, Lcom/google/inject/internal/util/$ImmutableList$RegularImmutableList;->offset:I

    .line 495
    .local v3, "index":I
    instance-of v9, p1, Lcom/google/inject/internal/util/$ImmutableList$RegularImmutableList;

    if-eqz v9, :cond_5

    move-object v5, p1

    .line 496
    check-cast v5, Lcom/google/inject/internal/util/$ImmutableList$RegularImmutableList;

    .line 497
    .local v5, "other":Lcom/google/inject/internal/util/$ImmutableList$RegularImmutableList;, "Lcom/google/inject/internal/util/$ImmutableList$RegularImmutableList<*>;"
    iget v1, v5, Lcom/google/inject/internal/util/$ImmutableList$RegularImmutableList;->offset:I

    .local v1, "i":I
    :goto_1
    iget v9, v5, Lcom/google/inject/internal/util/$ImmutableList$RegularImmutableList;->offset:I

    iget v10, v5, Lcom/google/inject/internal/util/$ImmutableList$RegularImmutableList;->size:I

    add-int/2addr v9, v10

    if-ge v1, v9, :cond_0

    .line 498
    iget-object v9, p0, Lcom/google/inject/internal/util/$ImmutableList$RegularImmutableList;->array:[Ljava/lang/Object;

    add-int/lit8 v4, v3, 0x1

    .end local v3    # "index":I
    .local v4, "index":I
    aget-object v9, v9, v3

    iget-object v10, v5, Lcom/google/inject/internal/util/$ImmutableList$RegularImmutableList;->array:[Ljava/lang/Object;

    aget-object v10, v10, v1

    invoke-virtual {v9, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_4

    move v7, v8

    .line 499
    goto :goto_0

    .line 497
    :cond_4
    add-int/lit8 v1, v1, 0x1

    move v3, v4

    .end local v4    # "index":I
    .restart local v3    # "index":I
    goto :goto_1

    .line 503
    .end local v1    # "i":I
    .end local v5    # "other":Lcom/google/inject/internal/util/$ImmutableList$RegularImmutableList;, "Lcom/google/inject/internal/util/$ImmutableList$RegularImmutableList<*>;"
    :cond_5
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .local v2, "i$":Ljava/util/Iterator;
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .line 504
    .local v0, "element":Ljava/lang/Object;
    iget-object v9, p0, Lcom/google/inject/internal/util/$ImmutableList$RegularImmutableList;->array:[Ljava/lang/Object;

    add-int/lit8 v4, v3, 0x1

    .end local v3    # "index":I
    .restart local v4    # "index":I
    aget-object v9, v9, v3

    invoke-virtual {v9, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_6

    move v7, v8

    .line 505
    goto :goto_0

    :cond_6
    move v3, v4

    .end local v4    # "index":I
    .restart local v3    # "index":I
    goto :goto_2
.end method

.method public get(I)Ljava/lang/Object;
    .locals 2
    .param p1, "index"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TE;"
        }
    .end annotation

    .prologue
    .line 390
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableList$RegularImmutableList;, "Lcom/google/inject/internal/util/$ImmutableList$RegularImmutableList<TE;>;"
    iget v0, p0, Lcom/google/inject/internal/util/$ImmutableList$RegularImmutableList;->size:I

    invoke-static {p1, v0}, Lcom/google/inject/internal/util/$Preconditions;->checkElementIndex(II)V

    .line 391
    iget-object v0, p0, Lcom/google/inject/internal/util/$ImmutableList$RegularImmutableList;->array:[Ljava/lang/Object;

    iget v1, p0, Lcom/google/inject/internal/util/$ImmutableList$RegularImmutableList;->offset:I

    add-int/2addr v1, p1

    aget-object v0, v0, v1

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    .prologue
    .line 515
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableList$RegularImmutableList;, "Lcom/google/inject/internal/util/$ImmutableList$RegularImmutableList<TE;>;"
    const/4 v0, 0x1

    .line 516
    .local v0, "hashCode":I
    iget v1, p0, Lcom/google/inject/internal/util/$ImmutableList$RegularImmutableList;->offset:I

    .local v1, "i":I
    :goto_0
    iget v2, p0, Lcom/google/inject/internal/util/$ImmutableList$RegularImmutableList;->offset:I

    iget v3, p0, Lcom/google/inject/internal/util/$ImmutableList$RegularImmutableList;->size:I

    add-int/2addr v2, v3

    if-ge v1, v2, :cond_0

    .line 517
    mul-int/lit8 v2, v0, 0x1f

    iget-object v3, p0, Lcom/google/inject/internal/util/$ImmutableList$RegularImmutableList;->array:[Ljava/lang/Object;

    aget-object v3, v3, v1

    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    add-int v0, v2, v3

    .line 516
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 519
    :cond_0
    return v0
.end method

.method public indexOf(Ljava/lang/Object;)I
    .locals 3
    .param p1, "target"    # Ljava/lang/Object;

    .prologue
    .line 395
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableList$RegularImmutableList;, "Lcom/google/inject/internal/util/$ImmutableList$RegularImmutableList<TE;>;"
    if-eqz p1, :cond_1

    .line 396
    iget v0, p0, Lcom/google/inject/internal/util/$ImmutableList$RegularImmutableList;->offset:I

    .local v0, "i":I
    :goto_0
    iget v1, p0, Lcom/google/inject/internal/util/$ImmutableList$RegularImmutableList;->offset:I

    iget v2, p0, Lcom/google/inject/internal/util/$ImmutableList$RegularImmutableList;->size:I

    add-int/2addr v1, v2

    if-ge v0, v1, :cond_1

    .line 397
    iget-object v1, p0, Lcom/google/inject/internal/util/$ImmutableList$RegularImmutableList;->array:[Ljava/lang/Object;

    aget-object v1, v1, v0

    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 398
    iget v1, p0, Lcom/google/inject/internal/util/$ImmutableList$RegularImmutableList;->offset:I

    sub-int v1, v0, v1

    .line 402
    .end local v0    # "i":I
    :goto_1
    return v1

    .line 396
    .restart local v0    # "i":I
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 402
    .end local v0    # "i":I
    :cond_1
    const/4 v1, -0x1

    goto :goto_1
.end method

.method public isEmpty()Z
    .locals 1

    .prologue
    .line 358
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableList$RegularImmutableList;, "Lcom/google/inject/internal/util/$ImmutableList$RegularImmutableList<TE;>;"
    const/4 v0, 0x0

    return v0
.end method

.method public iterator()Lcom/google/inject/internal/util/$UnmodifiableIterator;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/inject/internal/util/$UnmodifiableIterator",
            "<TE;>;"
        }
    .end annotation

    .prologue
    .line 368
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableList$RegularImmutableList;, "Lcom/google/inject/internal/util/$ImmutableList$RegularImmutableList<TE;>;"
    iget-object v0, p0, Lcom/google/inject/internal/util/$ImmutableList$RegularImmutableList;->array:[Ljava/lang/Object;

    iget v1, p0, Lcom/google/inject/internal/util/$ImmutableList$RegularImmutableList;->offset:I

    iget v2, p0, Lcom/google/inject/internal/util/$ImmutableList$RegularImmutableList;->size:I

    invoke-static {v0, v1, v2}, Lcom/google/inject/internal/util/$Iterators;->forArray([Ljava/lang/Object;II)Lcom/google/inject/internal/util/$UnmodifiableIterator;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic iterator()Ljava/util/Iterator;
    .locals 1

    .prologue
    .line 338
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableList$RegularImmutableList;, "Lcom/google/inject/internal/util/$ImmutableList$RegularImmutableList<TE;>;"
    invoke-virtual {p0}, Lcom/google/inject/internal/util/$ImmutableList$RegularImmutableList;->iterator()Lcom/google/inject/internal/util/$UnmodifiableIterator;

    move-result-object v0

    return-object v0
.end method

.method public lastIndexOf(Ljava/lang/Object;)I
    .locals 3
    .param p1, "target"    # Ljava/lang/Object;

    .prologue
    .line 406
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableList$RegularImmutableList;, "Lcom/google/inject/internal/util/$ImmutableList$RegularImmutableList<TE;>;"
    if-eqz p1, :cond_1

    .line 407
    iget v1, p0, Lcom/google/inject/internal/util/$ImmutableList$RegularImmutableList;->offset:I

    iget v2, p0, Lcom/google/inject/internal/util/$ImmutableList$RegularImmutableList;->size:I

    add-int/2addr v1, v2

    add-int/lit8 v0, v1, -0x1

    .local v0, "i":I
    :goto_0
    iget v1, p0, Lcom/google/inject/internal/util/$ImmutableList$RegularImmutableList;->offset:I

    if-lt v0, v1, :cond_1

    .line 408
    iget-object v1, p0, Lcom/google/inject/internal/util/$ImmutableList$RegularImmutableList;->array:[Ljava/lang/Object;

    aget-object v1, v1, v0

    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 409
    iget v1, p0, Lcom/google/inject/internal/util/$ImmutableList$RegularImmutableList;->offset:I

    sub-int v1, v0, v1

    .line 413
    .end local v0    # "i":I
    :goto_1
    return v1

    .line 407
    .restart local v0    # "i":I
    :cond_0
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    .line 413
    .end local v0    # "i":I
    :cond_1
    const/4 v1, -0x1

    goto :goto_1
.end method

.method public listIterator()Ljava/util/ListIterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ListIterator",
            "<TE;>;"
        }
    .end annotation

    .prologue
    .line 425
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableList$RegularImmutableList;, "Lcom/google/inject/internal/util/$ImmutableList$RegularImmutableList<TE;>;"
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/google/inject/internal/util/$ImmutableList$RegularImmutableList;->listIterator(I)Ljava/util/ListIterator;

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
            "<TE;>;"
        }
    .end annotation

    .prologue
    .line 429
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableList$RegularImmutableList;, "Lcom/google/inject/internal/util/$ImmutableList$RegularImmutableList<TE;>;"
    iget v0, p0, Lcom/google/inject/internal/util/$ImmutableList$RegularImmutableList;->size:I

    invoke-static {p1, v0}, Lcom/google/inject/internal/util/$Preconditions;->checkPositionIndex(II)V

    .line 431
    new-instance v0, Lcom/google/inject/internal/util/$ImmutableList$RegularImmutableList$1;

    invoke-direct {v0, p0, p1}, Lcom/google/inject/internal/util/$ImmutableList$RegularImmutableList$1;-><init>(Lcom/google/inject/internal/util/$ImmutableList$RegularImmutableList;I)V

    return-object v0
.end method

.method public size()I
    .locals 1

    .prologue
    .line 354
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableList$RegularImmutableList;, "Lcom/google/inject/internal/util/$ImmutableList$RegularImmutableList<TE;>;"
    iget v0, p0, Lcom/google/inject/internal/util/$ImmutableList$RegularImmutableList;->size:I

    return v0
.end method

.method public subList(II)Lcom/google/inject/internal/util/$ImmutableList;
    .locals 4
    .param p1, "fromIndex"    # I
    .param p2, "toIndex"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)",
            "Lcom/google/inject/internal/util/$ImmutableList",
            "<TE;>;"
        }
    .end annotation

    .prologue
    .line 417
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableList$RegularImmutableList;, "Lcom/google/inject/internal/util/$ImmutableList$RegularImmutableList<TE;>;"
    iget v0, p0, Lcom/google/inject/internal/util/$ImmutableList$RegularImmutableList;->size:I

    invoke-static {p1, p2, v0}, Lcom/google/inject/internal/util/$Preconditions;->checkPositionIndexes(III)V

    .line 418
    if-ne p1, p2, :cond_0

    invoke-static {}, Lcom/google/inject/internal/util/$ImmutableList;->of()Lcom/google/inject/internal/util/$ImmutableList;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Lcom/google/inject/internal/util/$ImmutableList$RegularImmutableList;

    iget-object v1, p0, Lcom/google/inject/internal/util/$ImmutableList$RegularImmutableList;->array:[Ljava/lang/Object;

    iget v2, p0, Lcom/google/inject/internal/util/$ImmutableList$RegularImmutableList;->offset:I

    add-int/2addr v2, p1

    sub-int v3, p2, p1

    invoke-direct {v0, v1, v2, v3}, Lcom/google/inject/internal/util/$ImmutableList$RegularImmutableList;-><init>([Ljava/lang/Object;II)V

    goto :goto_0
.end method

.method public bridge synthetic subList(II)Ljava/util/List;
    .locals 1
    .param p1, "x0"    # I
    .param p2, "x1"    # I

    .prologue
    .line 338
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableList$RegularImmutableList;, "Lcom/google/inject/internal/util/$ImmutableList$RegularImmutableList<TE;>;"
    invoke-virtual {p0, p1, p2}, Lcom/google/inject/internal/util/$ImmutableList$RegularImmutableList;->subList(II)Lcom/google/inject/internal/util/$ImmutableList;

    move-result-object v0

    return-object v0
.end method

.method public toArray()[Ljava/lang/Object;
    .locals 5

    .prologue
    .line 372
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableList$RegularImmutableList;, "Lcom/google/inject/internal/util/$ImmutableList$RegularImmutableList<TE;>;"
    invoke-virtual {p0}, Lcom/google/inject/internal/util/$ImmutableList$RegularImmutableList;->size()I

    move-result v1

    new-array v0, v1, [Ljava/lang/Object;

    .line 373
    .local v0, "newArray":[Ljava/lang/Object;
    iget-object v1, p0, Lcom/google/inject/internal/util/$ImmutableList$RegularImmutableList;->array:[Ljava/lang/Object;

    iget v2, p0, Lcom/google/inject/internal/util/$ImmutableList$RegularImmutableList;->offset:I

    const/4 v3, 0x0

    iget v4, p0, Lcom/google/inject/internal/util/$ImmutableList$RegularImmutableList;->size:I

    invoke-static {v1, v2, v0, v3, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 374
    return-object v0
.end method

.method public toArray([Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([TT;)[TT;"
        }
    .end annotation

    .prologue
    .line 378
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableList$RegularImmutableList;, "Lcom/google/inject/internal/util/$ImmutableList$RegularImmutableList<TE;>;"
    .local p1, "other":[Ljava/lang/Object;, "[TT;"
    array-length v0, p1

    iget v1, p0, Lcom/google/inject/internal/util/$ImmutableList$RegularImmutableList;->size:I

    if-ge v0, v1, :cond_1

    .line 379
    iget v0, p0, Lcom/google/inject/internal/util/$ImmutableList$RegularImmutableList;->size:I

    invoke-static {p1, v0}, Lcom/google/inject/internal/util/$ObjectArrays;->newArray([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    .line 383
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/google/inject/internal/util/$ImmutableList$RegularImmutableList;->array:[Ljava/lang/Object;

    iget v1, p0, Lcom/google/inject/internal/util/$ImmutableList$RegularImmutableList;->offset:I

    const/4 v2, 0x0

    iget v3, p0, Lcom/google/inject/internal/util/$ImmutableList$RegularImmutableList;->size:I

    invoke-static {v0, v1, p1, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 384
    return-object p1

    .line 380
    :cond_1
    array-length v0, p1

    iget v1, p0, Lcom/google/inject/internal/util/$ImmutableList$RegularImmutableList;->size:I

    if-le v0, v1, :cond_0

    .line 381
    iget v0, p0, Lcom/google/inject/internal/util/$ImmutableList$RegularImmutableList;->size:I

    const/4 v1, 0x0

    aput-object v1, p1, v0

    goto :goto_0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    .prologue
    .line 523
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableList$RegularImmutableList;, "Lcom/google/inject/internal/util/$ImmutableList$RegularImmutableList<TE;>;"
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/google/inject/internal/util/$ImmutableList$RegularImmutableList;->size()I

    move-result v2

    mul-int/lit8 v2, v2, 0x10

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 524
    .local v1, "sb":Ljava/lang/StringBuilder;
    const/16 v2, 0x5b

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/google/inject/internal/util/$ImmutableList$RegularImmutableList;->array:[Ljava/lang/Object;

    iget v4, p0, Lcom/google/inject/internal/util/$ImmutableList$RegularImmutableList;->offset:I

    aget-object v3, v3, v4

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 525
    iget v2, p0, Lcom/google/inject/internal/util/$ImmutableList$RegularImmutableList;->offset:I

    add-int/lit8 v0, v2, 0x1

    .local v0, "i":I
    :goto_0
    iget v2, p0, Lcom/google/inject/internal/util/$ImmutableList$RegularImmutableList;->offset:I

    iget v3, p0, Lcom/google/inject/internal/util/$ImmutableList$RegularImmutableList;->size:I

    add-int/2addr v2, v3

    if-ge v0, v2, :cond_0

    .line 526
    const-string v2, ", "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/google/inject/internal/util/$ImmutableList$RegularImmutableList;->array:[Ljava/lang/Object;

    aget-object v3, v3, v0

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 525
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 528
    :cond_0
    const/16 v2, 0x5d

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    return-object v2
.end method
