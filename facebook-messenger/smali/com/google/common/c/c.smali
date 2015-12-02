.class Lcom/google/common/c/c;
.super Ljava/util/AbstractList;
.source "Longs.java"

# interfaces
.implements Ljava/io/Serializable;
.implements Ljava/util/RandomAccess;


# annotations
.annotation build Lcom/google/common/annotations/GwtCompatible;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/AbstractList",
        "<",
        "Ljava/lang/Long;",
        ">;",
        "Ljava/io/Serializable;",
        "Ljava/util/RandomAccess;"
    }
.end annotation


# instance fields
.field final a:[J

.field final b:I

.field final c:I


# direct methods
.method constructor <init>([J)V
    .locals 2

    .prologue
    .line 461
    const/4 v0, 0x0

    array-length v1, p1

    invoke-direct {p0, p1, v0, v1}, Lcom/google/common/c/c;-><init>([JII)V

    .line 462
    return-void
.end method

.method constructor <init>([JII)V
    .locals 0

    .prologue
    .line 464
    invoke-direct {p0}, Ljava/util/AbstractList;-><init>()V

    .line 465
    iput-object p1, p0, Lcom/google/common/c/c;->a:[J

    .line 466
    iput p2, p0, Lcom/google/common/c/c;->b:I

    .line 467
    iput p3, p0, Lcom/google/common/c/c;->c:I

    .line 468
    return-void
.end method


# virtual methods
.method public a(I)Ljava/lang/Long;
    .locals 2

    .prologue
    .line 479
    invoke-virtual {p0}, Lcom/google/common/c/c;->size()I

    move-result v0

    invoke-static {p1, v0}, Lcom/google/common/base/Preconditions;->checkElementIndex(II)I

    .line 480
    iget-object v0, p0, Lcom/google/common/c/c;->a:[J

    iget v1, p0, Lcom/google/common/c/c;->b:I

    add-int/2addr v1, p1

    aget-wide v0, v0, v1

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    return-object v0
.end method

.method public a(ILjava/lang/Long;)Ljava/lang/Long;
    .locals 7

    .prologue
    .line 512
    invoke-virtual {p0}, Lcom/google/common/c/c;->size()I

    move-result v0

    invoke-static {p1, v0}, Lcom/google/common/base/Preconditions;->checkElementIndex(II)I

    .line 513
    iget-object v0, p0, Lcom/google/common/c/c;->a:[J

    iget v1, p0, Lcom/google/common/c/c;->b:I

    add-int/2addr v1, p1

    aget-wide v1, v0, v1

    .line 514
    iget-object v3, p0, Lcom/google/common/c/c;->a:[J

    iget v0, p0, Lcom/google/common/c/c;->b:I

    add-int v4, v0, p1

    invoke-static {p2}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    aput-wide v5, v3, v4

    .line 515
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    return-object v0
.end method

.method a()[J
    .locals 5

    .prologue
    .line 566
    invoke-virtual {p0}, Lcom/google/common/c/c;->size()I

    move-result v0

    .line 567
    new-array v1, v0, [J

    .line 568
    iget-object v2, p0, Lcom/google/common/c/c;->a:[J

    iget v3, p0, Lcom/google/common/c/c;->b:I

    const/4 v4, 0x0

    invoke-static {v2, v3, v1, v4, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 569
    return-object v1
.end method

.method public contains(Ljava/lang/Object;)Z
    .locals 5

    .prologue
    .line 485
    instance-of v0, p1, Ljava/lang/Long;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/common/c/c;->a:[J

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    iget v3, p0, Lcom/google/common/c/c;->b:I

    iget v4, p0, Lcom/google/common/c/c;->c:I

    invoke-static {v0, v1, v2, v3, v4}, Lcom/google/common/c/b;->a([JJII)I

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
    .locals 8

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 528
    if-ne p1, p0, :cond_1

    .line 544
    :cond_0
    :goto_0
    return v0

    .line 531
    :cond_1
    instance-of v2, p1, Lcom/google/common/c/c;

    if-eqz v2, :cond_4

    .line 532
    check-cast p1, Lcom/google/common/c/c;

    .line 533
    invoke-virtual {p0}, Lcom/google/common/c/c;->size()I

    move-result v3

    .line 534
    invoke-virtual {p1}, Lcom/google/common/c/c;->size()I

    move-result v2

    if-eq v2, v3, :cond_2

    move v0, v1

    .line 535
    goto :goto_0

    :cond_2
    move v2, v1

    .line 537
    :goto_1
    if-ge v2, v3, :cond_0

    .line 538
    iget-object v4, p0, Lcom/google/common/c/c;->a:[J

    iget v5, p0, Lcom/google/common/c/c;->b:I

    add-int/2addr v5, v2

    aget-wide v4, v4, v5

    iget-object v6, p1, Lcom/google/common/c/c;->a:[J

    iget v7, p1, Lcom/google/common/c/c;->b:I

    add-int/2addr v7, v2

    aget-wide v6, v6, v7

    cmp-long v4, v4, v6

    if-eqz v4, :cond_3

    move v0, v1

    .line 539
    goto :goto_0

    .line 537
    :cond_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 544
    :cond_4
    invoke-super {p0, p1}, Ljava/util/AbstractList;->equals(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0
.end method

.method public synthetic get(I)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 453
    invoke-virtual {p0, p1}, Lcom/google/common/c/c;->a(I)Ljava/lang/Long;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    .prologue
    .line 548
    const/4 v1, 0x1

    .line 549
    iget v0, p0, Lcom/google/common/c/c;->b:I

    :goto_0
    iget v2, p0, Lcom/google/common/c/c;->c:I

    if-ge v0, v2, :cond_0

    .line 550
    mul-int/lit8 v1, v1, 0x1f

    iget-object v2, p0, Lcom/google/common/c/c;->a:[J

    aget-wide v2, v2, v0

    invoke-static {v2, v3}, Lcom/google/common/c/b;->a(J)I

    move-result v2

    add-int/2addr v1, v2

    .line 549
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 552
    :cond_0
    return v1
.end method

.method public indexOf(Ljava/lang/Object;)I
    .locals 5

    .prologue
    .line 491
    instance-of v0, p1, Ljava/lang/Long;

    if-eqz v0, :cond_0

    .line 492
    iget-object v0, p0, Lcom/google/common/c/c;->a:[J

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    iget v3, p0, Lcom/google/common/c/c;->b:I

    iget v4, p0, Lcom/google/common/c/c;->c:I

    invoke-static {v0, v1, v2, v3, v4}, Lcom/google/common/c/b;->a([JJII)I

    move-result v0

    .line 493
    if-ltz v0, :cond_0

    .line 494
    iget v1, p0, Lcom/google/common/c/c;->b:I

    sub-int/2addr v0, v1

    .line 497
    :goto_0
    return v0

    :cond_0
    const/4 v0, -0x1

    goto :goto_0
.end method

.method public isEmpty()Z
    .locals 1

    .prologue
    .line 475
    const/4 v0, 0x0

    return v0
.end method

.method public lastIndexOf(Ljava/lang/Object;)I
    .locals 5

    .prologue
    .line 502
    instance-of v0, p1, Ljava/lang/Long;

    if-eqz v0, :cond_0

    .line 503
    iget-object v0, p0, Lcom/google/common/c/c;->a:[J

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    iget v3, p0, Lcom/google/common/c/c;->b:I

    iget v4, p0, Lcom/google/common/c/c;->c:I

    invoke-static {v0, v1, v2, v3, v4}, Lcom/google/common/c/b;->b([JJII)I

    move-result v0

    .line 504
    if-ltz v0, :cond_0

    .line 505
    iget v1, p0, Lcom/google/common/c/c;->b:I

    sub-int/2addr v0, v1

    .line 508
    :goto_0
    return v0

    :cond_0
    const/4 v0, -0x1

    goto :goto_0
.end method

.method public synthetic set(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 453
    check-cast p2, Ljava/lang/Long;

    invoke-virtual {p0, p1, p2}, Lcom/google/common/c/c;->a(ILjava/lang/Long;)Ljava/lang/Long;

    move-result-object v0

    return-object v0
.end method

.method public size()I
    .locals 2

    .prologue
    .line 471
    iget v0, p0, Lcom/google/common/c/c;->c:I

    iget v1, p0, Lcom/google/common/c/c;->b:I

    sub-int/2addr v0, v1

    return v0
.end method

.method public subList(II)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)",
            "Ljava/util/List",
            "<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    .prologue
    .line 519
    invoke-virtual {p0}, Lcom/google/common/c/c;->size()I

    move-result v0

    .line 520
    invoke-static {p1, p2, v0}, Lcom/google/common/base/Preconditions;->checkPositionIndexes(III)V

    .line 521
    if-ne p1, p2, :cond_0

    .line 522
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    .line 524
    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Lcom/google/common/c/c;

    iget-object v1, p0, Lcom/google/common/c/c;->a:[J

    iget v2, p0, Lcom/google/common/c/c;->b:I

    add-int/2addr v2, p1

    iget v3, p0, Lcom/google/common/c/c;->b:I

    add-int/2addr v3, p2

    invoke-direct {v0, v1, v2, v3}, Lcom/google/common/c/c;-><init>([JII)V

    goto :goto_0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    .prologue
    .line 556
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/google/common/c/c;->size()I

    move-result v0

    mul-int/lit8 v0, v0, 0xa

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 557
    const/16 v0, 0x5b

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v2, p0, Lcom/google/common/c/c;->a:[J

    iget v3, p0, Lcom/google/common/c/c;->b:I

    aget-wide v2, v2, v3

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 558
    iget v0, p0, Lcom/google/common/c/c;->b:I

    add-int/lit8 v0, v0, 0x1

    :goto_0
    iget v2, p0, Lcom/google/common/c/c;->c:I

    if-ge v0, v2, :cond_0

    .line 559
    const-string v2, ", "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/google/common/c/c;->a:[J

    aget-wide v3, v3, v0

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 558
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 561
    :cond_0
    const/16 v0, 0x5d

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
