.class public abstract Lcom/google/inject/internal/util/$ImmutableList;
.super Lcom/google/inject/internal/util/$ImmutableCollection;
.source "ImmutableList.java"

# interfaces
.implements Ljava/util/List;
.implements Ljava/util/RandomAccess;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/inject/internal/util/$ImmutableList$1;,
        Lcom/google/inject/internal/util/$ImmutableList$Builder;,
        Lcom/google/inject/internal/util/$ImmutableList$SerializedForm;,
        Lcom/google/inject/internal/util/$ImmutableList$RegularImmutableList;,
        Lcom/google/inject/internal/util/$ImmutableList$EmptyImmutableList;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/inject/internal/util/$ImmutableCollection",
        "<TE;>;",
        "Ljava/util/List",
        "<TE;>;",
        "Ljava/util/RandomAccess;"
    }
.end annotation


# static fields
.field private static final EMPTY_IMMUTABLE_LIST:Lcom/google/inject/internal/util/$ImmutableList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/inject/internal/util/$ImmutableList",
            "<*>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 53
    new-instance v0, Lcom/google/inject/internal/util/$ImmutableList$EmptyImmutableList;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/inject/internal/util/$ImmutableList$EmptyImmutableList;-><init>(Lcom/google/inject/internal/util/$ImmutableList$1;)V

    sput-object v0, Lcom/google/inject/internal/util/$ImmutableList;->EMPTY_IMMUTABLE_LIST:Lcom/google/inject/internal/util/$ImmutableList;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .prologue
    .line 201
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableList;, "Lcom/google/inject/internal/util/$ImmutableList<TE;>;"
    invoke-direct {p0}, Lcom/google/inject/internal/util/$ImmutableCollection;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/inject/internal/util/$ImmutableList$1;)V
    .locals 0
    .param p1, "x0"    # Lcom/google/inject/internal/util/$ImmutableList$1;

    .prologue
    .line 51
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableList;, "Lcom/google/inject/internal/util/$ImmutableList<TE;>;"
    invoke-direct {p0}, Lcom/google/inject/internal/util/$ImmutableList;-><init>()V

    return-void
.end method

.method public static builder()Lcom/google/inject/internal/util/$ImmutableList$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">()",
            "Lcom/google/inject/internal/util/$ImmutableList$Builder",
            "<TE;>;"
        }
    .end annotation

    .prologue
    .line 609
    new-instance v0, Lcom/google/inject/internal/util/$ImmutableList$Builder;

    invoke-direct {v0}, Lcom/google/inject/internal/util/$ImmutableList$Builder;-><init>()V

    return-object v0
.end method

.method private static varargs copyIntoArray([Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 10
    .param p0, "source"    # [Ljava/lang/Object;

    .prologue
    .line 533
    array-length v7, p0

    new-array v1, v7, [Ljava/lang/Object;

    .line 534
    .local v1, "array":[Ljava/lang/Object;
    const/4 v4, 0x0

    .line 535
    .local v4, "index":I
    move-object v0, p0

    .local v0, "arr$":[Ljava/lang/Object;
    array-length v6, v0

    .local v6, "len$":I
    const/4 v3, 0x0

    .local v3, "i$":I
    move v5, v4

    .end local v4    # "index":I
    .local v5, "index":I
    :goto_0
    if-ge v3, v6, :cond_1

    aget-object v2, v0, v3

    .line 536
    .local v2, "element":Ljava/lang/Object;
    if-nez v2, :cond_0

    .line 537
    new-instance v7, Ljava/lang/NullPointerException;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "at index "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-direct {v7, v8}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v7

    .line 539
    :cond_0
    add-int/lit8 v4, v5, 0x1

    .end local v5    # "index":I
    .restart local v4    # "index":I
    aput-object v2, v1, v5

    .line 535
    add-int/lit8 v3, v3, 0x1

    move v5, v4

    .end local v4    # "index":I
    .restart local v5    # "index":I
    goto :goto_0

    .line 541
    .end local v2    # "element":Ljava/lang/Object;
    :cond_1
    return-object v1
.end method

.method public static copyOf(Ljava/lang/Iterable;)Lcom/google/inject/internal/util/$ImmutableList;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Iterable",
            "<+TE;>;)",
            "Lcom/google/inject/internal/util/$ImmutableList",
            "<TE;>;"
        }
    .end annotation

    .prologue
    .line 145
    .local p0, "elements":Ljava/lang/Iterable;, "Ljava/lang/Iterable<+TE;>;"
    instance-of v2, p0, Lcom/google/inject/internal/util/$ImmutableList;

    if-eqz v2, :cond_0

    move-object v1, p0

    .line 151
    check-cast v1, Lcom/google/inject/internal/util/$ImmutableList;

    .line 158
    :goto_0
    return-object v1

    .line 153
    :cond_0
    instance-of v2, p0, Ljava/util/Collection;

    if-eqz v2, :cond_1

    move-object v0, p0

    .line 155
    check-cast v0, Ljava/util/Collection;

    .line 156
    .local v0, "coll":Ljava/util/Collection;, "Ljava/util/Collection<+TE;>;"
    invoke-static {v0}, Lcom/google/inject/internal/util/$ImmutableList;->copyOfInternal(Ljava/util/Collection;)Lcom/google/inject/internal/util/$ImmutableList;

    move-result-object v1

    goto :goto_0

    .line 158
    .end local v0    # "coll":Ljava/util/Collection;, "Ljava/util/Collection<+TE;>;"
    :cond_1
    invoke-static {p0}, Lcom/google/inject/internal/util/$Lists;->newArrayList(Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v2

    invoke-static {v2}, Lcom/google/inject/internal/util/$ImmutableList;->copyOfInternal(Ljava/util/ArrayList;)Lcom/google/inject/internal/util/$ImmutableList;

    move-result-object v1

    goto :goto_0
.end method

.method public static copyOf(Ljava/util/Iterator;)Lcom/google/inject/internal/util/$ImmutableList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Iterator",
            "<+TE;>;)",
            "Lcom/google/inject/internal/util/$ImmutableList",
            "<TE;>;"
        }
    .end annotation

    .prologue
    .line 168
    .local p0, "elements":Ljava/util/Iterator;, "Ljava/util/Iterator<+TE;>;"
    invoke-static {p0}, Lcom/google/inject/internal/util/$Lists;->newArrayList(Ljava/util/Iterator;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-static {v0}, Lcom/google/inject/internal/util/$ImmutableList;->copyOfInternal(Ljava/util/ArrayList;)Lcom/google/inject/internal/util/$ImmutableList;

    move-result-object v0

    return-object v0
.end method

.method private static copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;
    .locals 3
    .param p0, "oldArray"    # [Ljava/lang/Object;
    .param p1, "newSize"    # I

    .prologue
    const/4 v2, 0x0

    .line 574
    new-array v0, p1, [Ljava/lang/Object;

    .line 575
    .local v0, "newArray":[Ljava/lang/Object;
    array-length v1, p0

    invoke-static {v1, p1}, Ljava/lang/Math;->min(II)I

    move-result v1

    invoke-static {p0, v2, v0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 577
    return-object v0
.end method

.method private static copyOfInternal(Ljava/util/ArrayList;)Lcom/google/inject/internal/util/$ImmutableList;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/ArrayList",
            "<+TE;>;)",
            "Lcom/google/inject/internal/util/$ImmutableList",
            "<TE;>;"
        }
    .end annotation

    .prologue
    .line 173
    .local p0, "list":Ljava/util/ArrayList;, "Ljava/util/ArrayList<+TE;>;"
    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/google/inject/internal/util/$ImmutableList;->of()Lcom/google/inject/internal/util/$ImmutableList;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Lcom/google/inject/internal/util/$ImmutableList$RegularImmutableList;

    invoke-virtual {p0}, Ljava/util/ArrayList;->toArray()[Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lcom/google/inject/internal/util/$ImmutableList;->nullChecked([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/google/inject/internal/util/$ImmutableList$RegularImmutableList;-><init>([Ljava/lang/Object;Lcom/google/inject/internal/util/$ImmutableList$1;)V

    goto :goto_0
.end method

.method private static copyOfInternal(Ljava/util/Collection;)Lcom/google/inject/internal/util/$ImmutableList;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Collection",
            "<+TE;>;)",
            "Lcom/google/inject/internal/util/$ImmutableList",
            "<TE;>;"
        }
    .end annotation

    .prologue
    .line 195
    .local p0, "collection":Ljava/util/Collection;, "Ljava/util/Collection<+TE;>;"
    invoke-interface {p0}, Ljava/util/Collection;->size()I

    move-result v0

    .line 196
    .local v0, "size":I
    if-nez v0, :cond_0

    invoke-static {}, Lcom/google/inject/internal/util/$ImmutableList;->of()Lcom/google/inject/internal/util/$ImmutableList;

    move-result-object v1

    :goto_0
    return-object v1

    :cond_0
    invoke-static {p0, v0}, Lcom/google/inject/internal/util/$ImmutableList;->createFromIterable(Ljava/lang/Iterable;I)Lcom/google/inject/internal/util/$ImmutableList;

    move-result-object v1

    goto :goto_0
.end method

.method private static createFromIterable(Ljava/lang/Iterable;I)Lcom/google/inject/internal/util/$ImmutableList;
    .locals 8
    .param p1, "estimatedSize"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Iterable",
            "<*>;I)",
            "Lcom/google/inject/internal/util/$ImmutableList",
            "<TE;>;"
        }
    .end annotation

    .prologue
    .line 546
    .local p0, "source":Ljava/lang/Iterable;, "Ljava/lang/Iterable<*>;"
    new-array v0, p1, [Ljava/lang/Object;

    .line 547
    .local v0, "array":[Ljava/lang/Object;
    const/4 v3, 0x0

    .line 549
    .local v3, "index":I
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .local v2, "i$":Ljava/util/Iterator;
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 550
    .local v1, "element":Ljava/lang/Object;
    if-ne v3, p1, :cond_0

    .line 552
    div-int/lit8 v5, p1, 0x2

    add-int/lit8 v5, v5, 0x1

    mul-int/lit8 p1, v5, 0x3

    .line 553
    invoke-static {v0, p1}, Lcom/google/inject/internal/util/$ImmutableList;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    .line 555
    :cond_0
    if-nez v1, :cond_1

    .line 556
    new-instance v5, Ljava/lang/NullPointerException;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "at index "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v5, v6}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v5

    .line 558
    :cond_1
    add-int/lit8 v4, v3, 0x1

    .end local v3    # "index":I
    .local v4, "index":I
    aput-object v1, v0, v3

    move v3, v4

    .end local v4    # "index":I
    .restart local v3    # "index":I
    goto :goto_0

    .line 561
    .end local v1    # "element":Ljava/lang/Object;
    :cond_2
    if-nez v3, :cond_3

    .line 562
    invoke-static {}, Lcom/google/inject/internal/util/$ImmutableList;->of()Lcom/google/inject/internal/util/$ImmutableList;

    move-result-object v5

    .line 569
    :goto_1
    return-object v5

    .line 565
    :cond_3
    if-eq v3, p1, :cond_4

    .line 566
    invoke-static {v0, v3}, Lcom/google/inject/internal/util/$ImmutableList;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    .line 569
    :cond_4
    new-instance v5, Lcom/google/inject/internal/util/$ImmutableList$RegularImmutableList;

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct {v5, v0, v6, v3, v7}, Lcom/google/inject/internal/util/$ImmutableList$RegularImmutableList;-><init>([Ljava/lang/Object;IILcom/google/inject/internal/util/$ImmutableList$1;)V

    goto :goto_1
.end method

.method private static nullChecked([Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 5
    .param p0, "array"    # [Ljava/lang/Object;

    .prologue
    .line 185
    const/4 v0, 0x0

    .local v0, "i":I
    array-length v1, p0

    .local v1, "len":I
    :goto_0
    if-ge v0, v1, :cond_1

    .line 186
    aget-object v2, p0, v0

    if-nez v2, :cond_0

    .line 187
    new-instance v2, Ljava/lang/NullPointerException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "at index "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 185
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 190
    :cond_1
    return-object p0
.end method

.method public static of()Lcom/google/inject/internal/util/$ImmutableList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">()",
            "Lcom/google/inject/internal/util/$ImmutableList",
            "<TE;>;"
        }
    .end annotation

    .prologue
    .line 64
    sget-object v0, Lcom/google/inject/internal/util/$ImmutableList;->EMPTY_IMMUTABLE_LIST:Lcom/google/inject/internal/util/$ImmutableList;

    return-object v0
.end method

.method public static of(Ljava/lang/Object;)Lcom/google/inject/internal/util/$ImmutableList;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(TE;)",
            "Lcom/google/inject/internal/util/$ImmutableList",
            "<TE;>;"
        }
    .end annotation

    .prologue
    .line 77
    .local p0, "element":Ljava/lang/Object;, "TE;"
    new-instance v0, Lcom/google/inject/internal/util/$ImmutableList$RegularImmutableList;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p0, v1, v2

    invoke-static {v1}, Lcom/google/inject/internal/util/$ImmutableList;->copyIntoArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/google/inject/internal/util/$ImmutableList$RegularImmutableList;-><init>([Ljava/lang/Object;Lcom/google/inject/internal/util/$ImmutableList$1;)V

    return-object v0
.end method

.method public static of(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/inject/internal/util/$ImmutableList;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(TE;TE;)",
            "Lcom/google/inject/internal/util/$ImmutableList",
            "<TE;>;"
        }
    .end annotation

    .prologue
    .line 88
    .local p0, "e1":Ljava/lang/Object;, "TE;"
    .local p1, "e2":Ljava/lang/Object;, "TE;"
    new-instance v0, Lcom/google/inject/internal/util/$ImmutableList$RegularImmutableList;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p0, v1, v2

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v1}, Lcom/google/inject/internal/util/$ImmutableList;->copyIntoArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/google/inject/internal/util/$ImmutableList$RegularImmutableList;-><init>([Ljava/lang/Object;Lcom/google/inject/internal/util/$ImmutableList$1;)V

    return-object v0
.end method

.method public static of(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/inject/internal/util/$ImmutableList;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(TE;TE;TE;)",
            "Lcom/google/inject/internal/util/$ImmutableList",
            "<TE;>;"
        }
    .end annotation

    .prologue
    .line 97
    .local p0, "e1":Ljava/lang/Object;, "TE;"
    .local p1, "e2":Ljava/lang/Object;, "TE;"
    .local p2, "e3":Ljava/lang/Object;, "TE;"
    new-instance v0, Lcom/google/inject/internal/util/$ImmutableList$RegularImmutableList;

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p0, v1, v2

    const/4 v2, 0x1

    aput-object p1, v1, v2

    const/4 v2, 0x2

    aput-object p2, v1, v2

    invoke-static {v1}, Lcom/google/inject/internal/util/$ImmutableList;->copyIntoArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/google/inject/internal/util/$ImmutableList$RegularImmutableList;-><init>([Ljava/lang/Object;Lcom/google/inject/internal/util/$ImmutableList$1;)V

    return-object v0
.end method

.method public static of(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/inject/internal/util/$ImmutableList;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(TE;TE;TE;TE;)",
            "Lcom/google/inject/internal/util/$ImmutableList",
            "<TE;>;"
        }
    .end annotation

    .prologue
    .line 106
    .local p0, "e1":Ljava/lang/Object;, "TE;"
    .local p1, "e2":Ljava/lang/Object;, "TE;"
    .local p2, "e3":Ljava/lang/Object;, "TE;"
    .local p3, "e4":Ljava/lang/Object;, "TE;"
    new-instance v0, Lcom/google/inject/internal/util/$ImmutableList$RegularImmutableList;

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p0, v1, v2

    const/4 v2, 0x1

    aput-object p1, v1, v2

    const/4 v2, 0x2

    aput-object p2, v1, v2

    const/4 v2, 0x3

    aput-object p3, v1, v2

    invoke-static {v1}, Lcom/google/inject/internal/util/$ImmutableList;->copyIntoArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/google/inject/internal/util/$ImmutableList$RegularImmutableList;-><init>([Ljava/lang/Object;Lcom/google/inject/internal/util/$ImmutableList$1;)V

    return-object v0
.end method

.method public static of(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/inject/internal/util/$ImmutableList;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(TE;TE;TE;TE;TE;)",
            "Lcom/google/inject/internal/util/$ImmutableList",
            "<TE;>;"
        }
    .end annotation

    .prologue
    .line 115
    .local p0, "e1":Ljava/lang/Object;, "TE;"
    .local p1, "e2":Ljava/lang/Object;, "TE;"
    .local p2, "e3":Ljava/lang/Object;, "TE;"
    .local p3, "e4":Ljava/lang/Object;, "TE;"
    .local p4, "e5":Ljava/lang/Object;, "TE;"
    new-instance v0, Lcom/google/inject/internal/util/$ImmutableList$RegularImmutableList;

    const/4 v1, 0x5

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p0, v1, v2

    const/4 v2, 0x1

    aput-object p1, v1, v2

    const/4 v2, 0x2

    aput-object p2, v1, v2

    const/4 v2, 0x3

    aput-object p3, v1, v2

    const/4 v2, 0x4

    aput-object p4, v1, v2

    invoke-static {v1}, Lcom/google/inject/internal/util/$ImmutableList;->copyIntoArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/google/inject/internal/util/$ImmutableList$RegularImmutableList;-><init>([Ljava/lang/Object;Lcom/google/inject/internal/util/$ImmutableList$1;)V

    return-object v0
.end method

.method public static varargs of([Ljava/lang/Object;)Lcom/google/inject/internal/util/$ImmutableList;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">([TE;)",
            "Lcom/google/inject/internal/util/$ImmutableList",
            "<TE;>;"
        }
    .end annotation

    .prologue
    .line 124
    .local p0, "elements":[Ljava/lang/Object;, "[TE;"
    array-length v0, p0

    if-nez v0, :cond_0

    invoke-static {}, Lcom/google/inject/internal/util/$ImmutableList;->of()Lcom/google/inject/internal/util/$ImmutableList;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Lcom/google/inject/internal/util/$ImmutableList$RegularImmutableList;

    invoke-static {p0}, Lcom/google/inject/internal/util/$ImmutableList;->copyIntoArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/google/inject/internal/util/$ImmutableList$RegularImmutableList;-><init>([Ljava/lang/Object;Lcom/google/inject/internal/util/$ImmutableList$1;)V

    goto :goto_0
.end method

.method private readObject(Ljava/io/ObjectInputStream;)V
    .locals 2
    .param p1, "stream"    # Ljava/io/ObjectInputStream;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/InvalidObjectException;
        }
    .end annotation

    .prologue
    .line 597
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableList;, "Lcom/google/inject/internal/util/$ImmutableList<TE;>;"
    new-instance v0, Ljava/io/InvalidObjectException;

    const-string v1, "Use SerializedForm"

    invoke-direct {v0, v1}, Ljava/io/InvalidObjectException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final add(ILjava/lang/Object;)V
    .locals 1
    .param p1, "index"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ITE;)V"
        }
    .end annotation

    .prologue
    .line 247
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableList;, "Lcom/google/inject/internal/util/$ImmutableList<TE;>;"
    .local p2, "element":Ljava/lang/Object;, "TE;"
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final addAll(ILjava/util/Collection;)Z
    .locals 1
    .param p1, "index"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/Collection",
            "<+TE;>;)Z"
        }
    .end annotation

    .prologue
    .line 229
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableList;, "Lcom/google/inject/internal/util/$ImmutableList<TE;>;"
    .local p2, "newElements":Ljava/util/Collection;, "Ljava/util/Collection<+TE;>;"
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public abstract indexOf(Ljava/lang/Object;)I
    .param p1    # Ljava/lang/Object;
        .annotation runtime Lcom/google/inject/internal/util/$Nullable;
        .end annotation
    .end param
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
    .line 50
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableList;, "Lcom/google/inject/internal/util/$ImmutableList<TE;>;"
    invoke-virtual {p0}, Lcom/google/inject/internal/util/$ImmutableList;->iterator()Lcom/google/inject/internal/util/$UnmodifiableIterator;

    move-result-object v0

    return-object v0
.end method

.method public abstract lastIndexOf(Ljava/lang/Object;)I
    .param p1    # Ljava/lang/Object;
        .annotation runtime Lcom/google/inject/internal/util/$Nullable;
        .end annotation
    .end param
.end method

.method public final remove(I)Ljava/lang/Object;
    .locals 1
    .param p1, "index"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TE;"
        }
    .end annotation

    .prologue
    .line 256
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableList;, "Lcom/google/inject/internal/util/$ImmutableList<TE;>;"
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final set(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .param p1, "index"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ITE;)TE;"
        }
    .end annotation

    .prologue
    .line 238
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableList;, "Lcom/google/inject/internal/util/$ImmutableList<TE;>;"
    .local p2, "element":Ljava/lang/Object;, "TE;"
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public abstract subList(II)Lcom/google/inject/internal/util/$ImmutableList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)",
            "Lcom/google/inject/internal/util/$ImmutableList",
            "<TE;>;"
        }
    .end annotation
.end method

.method public bridge synthetic subList(II)Ljava/util/List;
    .locals 1
    .param p1, "x0"    # I
    .param p2, "x1"    # I

    .prologue
    .line 50
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableList;, "Lcom/google/inject/internal/util/$ImmutableList<TE;>;"
    invoke-virtual {p0, p1, p2}, Lcom/google/inject/internal/util/$ImmutableList;->subList(II)Lcom/google/inject/internal/util/$ImmutableList;

    move-result-object v0

    return-object v0
.end method

.method writeReplace()Ljava/lang/Object;
    .locals 2

    .prologue
    .line 601
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableList;, "Lcom/google/inject/internal/util/$ImmutableList<TE;>;"
    new-instance v0, Lcom/google/inject/internal/util/$ImmutableList$SerializedForm;

    invoke-virtual {p0}, Lcom/google/inject/internal/util/$ImmutableList;->toArray()[Ljava/lang/Object;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/inject/internal/util/$ImmutableList$SerializedForm;-><init>([Ljava/lang/Object;)V

    return-object v0
.end method
