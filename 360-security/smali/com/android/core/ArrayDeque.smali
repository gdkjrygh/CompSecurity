.class public Lcom/android/core/ArrayDeque;
.super Ljava/util/AbstractCollection;
.source "360Security"

# interfaces
.implements Lcom/android/core/b;
.implements Ljava/io/Serializable;
.implements Ljava/lang/Cloneable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/android/core/ArrayDeque$1;,
        Lcom/android/core/ArrayDeque$b;,
        Lcom/android/core/ArrayDeque$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/util/AbstractCollection",
        "<TE;>;",
        "Lcom/android/core/b",
        "<TE;>;",
        "Ljava/io/Serializable;",
        "Ljava/lang/Cloneable;"
    }
.end annotation


# static fields
.field static final synthetic a:Z


# instance fields
.field private transient b:[Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[TE;"
        }
    .end annotation
.end field

.field private transient c:I

.field private transient d:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 62
    const-class v0, Lcom/android/core/ArrayDeque;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Lcom/android/core/ArrayDeque;->a:Z

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 168
    invoke-direct {p0}, Ljava/util/AbstractCollection;-><init>()V

    .line 169
    const/16 v0, 0x10

    new-array v0, v0, [Ljava/lang/Object;

    check-cast v0, [Ljava/lang/Object;

    iput-object v0, p0, Lcom/android/core/ArrayDeque;->b:[Ljava/lang/Object;

    .line 170
    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .prologue
    .line 179
    invoke-direct {p0}, Ljava/util/AbstractCollection;-><init>()V

    .line 180
    invoke-direct {p0, p1}, Lcom/android/core/ArrayDeque;->a(I)V

    .line 181
    return-void
.end method

.method public constructor <init>(Ljava/util/Collection;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<+TE;>;)V"
        }
    .end annotation

    .prologue
    .line 195
    invoke-direct {p0}, Ljava/util/AbstractCollection;-><init>()V

    .line 196
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result v0

    invoke-direct {p0, v0}, Lcom/android/core/ArrayDeque;->a(I)V

    .line 197
    invoke-virtual {p0, p1}, Lcom/android/core/ArrayDeque;->addAll(Ljava/util/Collection;)Z

    .line 198
    return-void
.end method

.method static synthetic a(Lcom/android/core/ArrayDeque;)I
    .locals 1

    .prologue
    .line 62
    iget v0, p0, Lcom/android/core/ArrayDeque;->c:I

    return v0
.end method

.method private a()V
    .locals 6

    .prologue
    const/4 v5, 0x0

    .line 129
    sget-boolean v0, Lcom/android/core/ArrayDeque;->a:Z

    if-nez v0, :cond_0

    iget v0, p0, Lcom/android/core/ArrayDeque;->c:I

    iget v1, p0, Lcom/android/core/ArrayDeque;->d:I

    if-eq v0, v1, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 130
    :cond_0
    iget v1, p0, Lcom/android/core/ArrayDeque;->c:I

    .line 131
    iget-object v0, p0, Lcom/android/core/ArrayDeque;->b:[Ljava/lang/Object;

    array-length v2, v0

    .line 132
    sub-int v3, v2, v1

    .line 133
    shl-int/lit8 v0, v2, 0x1

    .line 134
    if-gez v0, :cond_1

    .line 135
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string/jumbo v1, "Sorry, deque too big"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 137
    :cond_1
    new-array v0, v0, [Ljava/lang/Object;

    .line 138
    iget-object v4, p0, Lcom/android/core/ArrayDeque;->b:[Ljava/lang/Object;

    invoke-static {v4, v1, v0, v5, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 139
    iget-object v4, p0, Lcom/android/core/ArrayDeque;->b:[Ljava/lang/Object;

    invoke-static {v4, v5, v0, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 140
    check-cast v0, [Ljava/lang/Object;

    iput-object v0, p0, Lcom/android/core/ArrayDeque;->b:[Ljava/lang/Object;

    .line 141
    iput v5, p0, Lcom/android/core/ArrayDeque;->c:I

    .line 142
    iput v2, p0, Lcom/android/core/ArrayDeque;->d:I

    .line 143
    return-void
.end method

.method private a(I)V
    .locals 2

    .prologue
    .line 104
    const/16 v0, 0x8

    .line 107
    if-lt p1, v0, :cond_0

    .line 109
    ushr-int/lit8 v0, p1, 0x1

    or-int/2addr v0, p1

    .line 110
    ushr-int/lit8 v1, v0, 0x2

    or-int/2addr v0, v1

    .line 111
    ushr-int/lit8 v1, v0, 0x4

    or-int/2addr v0, v1

    .line 112
    ushr-int/lit8 v1, v0, 0x8

    or-int/2addr v0, v1

    .line 113
    ushr-int/lit8 v1, v0, 0x10

    or-int/2addr v0, v1

    .line 114
    add-int/lit8 v0, v0, 0x1

    .line 116
    if-gez v0, :cond_0

    .line 117
    ushr-int/lit8 v0, v0, 0x1

    .line 120
    :cond_0
    new-array v0, v0, [Ljava/lang/Object;

    check-cast v0, [Ljava/lang/Object;

    iput-object v0, p0, Lcom/android/core/ArrayDeque;->b:[Ljava/lang/Object;

    .line 121
    return-void
.end method

.method static synthetic a(Lcom/android/core/ArrayDeque;I)Z
    .locals 1

    .prologue
    .line 62
    invoke-direct {p0, p1}, Lcom/android/core/ArrayDeque;->b(I)Z

    move-result v0

    return v0
.end method

.method private a([Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([TT;)[TT;"
        }
    .end annotation

    .prologue
    const/4 v3, 0x0

    .line 153
    iget v0, p0, Lcom/android/core/ArrayDeque;->c:I

    iget v1, p0, Lcom/android/core/ArrayDeque;->d:I

    if-ge v0, v1, :cond_1

    .line 154
    iget-object v0, p0, Lcom/android/core/ArrayDeque;->b:[Ljava/lang/Object;

    iget v1, p0, Lcom/android/core/ArrayDeque;->c:I

    invoke-virtual {p0}, Lcom/android/core/ArrayDeque;->size()I

    move-result v2

    invoke-static {v0, v1, p1, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 160
    :cond_0
    :goto_0
    return-object p1

    .line 155
    :cond_1
    iget v0, p0, Lcom/android/core/ArrayDeque;->c:I

    iget v1, p0, Lcom/android/core/ArrayDeque;->d:I

    if-le v0, v1, :cond_0

    .line 156
    iget-object v0, p0, Lcom/android/core/ArrayDeque;->b:[Ljava/lang/Object;

    array-length v0, v0

    iget v1, p0, Lcom/android/core/ArrayDeque;->c:I

    sub-int/2addr v0, v1

    .line 157
    iget-object v1, p0, Lcom/android/core/ArrayDeque;->b:[Ljava/lang/Object;

    iget v2, p0, Lcom/android/core/ArrayDeque;->c:I

    invoke-static {v1, v2, p1, v3, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 158
    iget-object v1, p0, Lcom/android/core/ArrayDeque;->b:[Ljava/lang/Object;

    iget v2, p0, Lcom/android/core/ArrayDeque;->d:I

    invoke-static {v1, v3, p1, v0, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_0
.end method

.method static synthetic b(Lcom/android/core/ArrayDeque;)I
    .locals 1

    .prologue
    .line 62
    iget v0, p0, Lcom/android/core/ArrayDeque;->d:I

    return v0
.end method

.method private b()V
    .locals 3

    .prologue
    .line 558
    sget-boolean v0, Lcom/android/core/ArrayDeque;->a:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/android/core/ArrayDeque;->b:[Ljava/lang/Object;

    iget v1, p0, Lcom/android/core/ArrayDeque;->d:I

    aget-object v0, v0, v1

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 559
    :cond_0
    sget-boolean v0, Lcom/android/core/ArrayDeque;->a:Z

    if-nez v0, :cond_1

    iget v0, p0, Lcom/android/core/ArrayDeque;->c:I

    iget v1, p0, Lcom/android/core/ArrayDeque;->d:I

    if-ne v0, v1, :cond_2

    iget-object v0, p0, Lcom/android/core/ArrayDeque;->b:[Ljava/lang/Object;

    iget v1, p0, Lcom/android/core/ArrayDeque;->c:I

    aget-object v0, v0, v1

    if-nez v0, :cond_3

    .line 561
    :cond_1
    sget-boolean v0, Lcom/android/core/ArrayDeque;->a:Z

    if-nez v0, :cond_4

    iget-object v0, p0, Lcom/android/core/ArrayDeque;->b:[Ljava/lang/Object;

    iget v1, p0, Lcom/android/core/ArrayDeque;->c:I

    add-int/lit8 v1, v1, -0x1

    iget-object v2, p0, Lcom/android/core/ArrayDeque;->b:[Ljava/lang/Object;

    array-length v2, v2

    add-int/lit8 v2, v2, -0x1

    and-int/2addr v1, v2

    aget-object v0, v0, v1

    if-eqz v0, :cond_4

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 559
    :cond_2
    iget-object v0, p0, Lcom/android/core/ArrayDeque;->b:[Ljava/lang/Object;

    iget v1, p0, Lcom/android/core/ArrayDeque;->c:I

    aget-object v0, v0, v1

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/android/core/ArrayDeque;->b:[Ljava/lang/Object;

    iget v1, p0, Lcom/android/core/ArrayDeque;->d:I

    add-int/lit8 v1, v1, -0x1

    iget-object v2, p0, Lcom/android/core/ArrayDeque;->b:[Ljava/lang/Object;

    array-length v2, v2

    add-int/lit8 v2, v2, -0x1

    and-int/2addr v1, v2

    aget-object v0, v0, v1

    if-nez v0, :cond_1

    :cond_3
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 562
    :cond_4
    return-void
.end method

.method private b(I)Z
    .locals 9

    .prologue
    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 576
    invoke-direct {p0}, Lcom/android/core/ArrayDeque;->b()V

    .line 577
    iget-object v2, p0, Lcom/android/core/ArrayDeque;->b:[Ljava/lang/Object;

    .line 578
    array-length v3, v2

    add-int/lit8 v3, v3, -0x1

    .line 579
    iget v4, p0, Lcom/android/core/ArrayDeque;->c:I

    .line 580
    iget v5, p0, Lcom/android/core/ArrayDeque;->d:I

    .line 581
    sub-int v6, p1, v4

    and-int/2addr v6, v3

    .line 582
    sub-int v7, v5, p1

    and-int/2addr v7, v3

    .line 585
    sub-int v8, v5, v4

    and-int/2addr v8, v3

    if-lt v6, v8, :cond_0

    .line 586
    new-instance v0, Ljava/util/ConcurrentModificationException;

    invoke-direct {v0}, Ljava/util/ConcurrentModificationException;-><init>()V

    throw v0

    .line 590
    :cond_0
    if-ge v6, v7, :cond_2

    .line 591
    if-gt v4, p1, :cond_1

    .line 592
    add-int/lit8 v1, v4, 0x1

    invoke-static {v2, v4, v2, v1, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 598
    :goto_0
    const/4 v1, 0x0

    aput-object v1, v2, v4

    .line 599
    add-int/lit8 v1, v4, 0x1

    and-int/2addr v1, v3

    iput v1, p0, Lcom/android/core/ArrayDeque;->c:I

    .line 611
    :goto_1
    return v0

    .line 594
    :cond_1
    invoke-static {v2, v0, v2, v1, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 595
    aget-object v1, v2, v3

    aput-object v1, v2, v0

    .line 596
    add-int/lit8 v1, v4, 0x1

    sub-int v5, v3, v4

    invoke-static {v2, v4, v2, v1, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_0

    .line 602
    :cond_2
    if-ge p1, v5, :cond_3

    .line 603
    add-int/lit8 v0, p1, 0x1

    invoke-static {v2, v0, v2, p1, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 604
    add-int/lit8 v0, v5, -0x1

    iput v0, p0, Lcom/android/core/ArrayDeque;->d:I

    :goto_2
    move v0, v1

    .line 611
    goto :goto_1

    .line 606
    :cond_3
    add-int/lit8 v4, p1, 0x1

    sub-int v6, v3, p1

    invoke-static {v2, v4, v2, p1, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 607
    aget-object v4, v2, v0

    aput-object v4, v2, v3

    .line 608
    invoke-static {v2, v1, v2, v0, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 609
    add-int/lit8 v0, v5, -0x1

    and-int/2addr v0, v3

    iput v0, p0, Lcom/android/core/ArrayDeque;->d:I

    goto :goto_2
.end method

.method static synthetic c(Lcom/android/core/ArrayDeque;)[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 62
    iget-object v0, p0, Lcom/android/core/ArrayDeque;->b:[Ljava/lang/Object;

    return-object v0
.end method


# virtual methods
.method public add(Ljava/lang/Object;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)Z"
        }
    .end annotation

    .prologue
    .line 437
    invoke-virtual {p0, p1}, Lcom/android/core/ArrayDeque;->addLast(Ljava/lang/Object;)V

    .line 438
    const/4 v0, 0x1

    return v0
.end method

.method public addFirst(Ljava/lang/Object;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)V"
        }
    .end annotation

    .prologue
    .line 214
    if-nez p1, :cond_0

    .line 215
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 217
    :cond_0
    iget-object v0, p0, Lcom/android/core/ArrayDeque;->b:[Ljava/lang/Object;

    iget v1, p0, Lcom/android/core/ArrayDeque;->c:I

    add-int/lit8 v1, v1, -0x1

    iget-object v2, p0, Lcom/android/core/ArrayDeque;->b:[Ljava/lang/Object;

    array-length v2, v2

    add-int/lit8 v2, v2, -0x1

    and-int/2addr v1, v2

    iput v1, p0, Lcom/android/core/ArrayDeque;->c:I

    aput-object p1, v0, v1

    .line 218
    iget v0, p0, Lcom/android/core/ArrayDeque;->c:I

    iget v1, p0, Lcom/android/core/ArrayDeque;->d:I

    if-ne v0, v1, :cond_1

    .line 219
    invoke-direct {p0}, Lcom/android/core/ArrayDeque;->a()V

    .line 221
    :cond_1
    return-void
.end method

.method public addLast(Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)V"
        }
    .end annotation

    .prologue
    .line 236
    if-nez p1, :cond_0

    .line 237
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 239
    :cond_0
    iget-object v0, p0, Lcom/android/core/ArrayDeque;->b:[Ljava/lang/Object;

    iget v1, p0, Lcom/android/core/ArrayDeque;->d:I

    aput-object p1, v0, v1

    .line 240
    iget v0, p0, Lcom/android/core/ArrayDeque;->d:I

    add-int/lit8 v0, v0, 0x1

    iget-object v1, p0, Lcom/android/core/ArrayDeque;->b:[Ljava/lang/Object;

    array-length v1, v1

    add-int/lit8 v1, v1, -0x1

    and-int/2addr v0, v1

    iput v0, p0, Lcom/android/core/ArrayDeque;->d:I

    iget v1, p0, Lcom/android/core/ArrayDeque;->c:I

    if-ne v0, v1, :cond_1

    .line 241
    invoke-direct {p0}, Lcom/android/core/ArrayDeque;->a()V

    .line 243
    :cond_1
    return-void
.end method

.method public clear()V
    .locals 5

    .prologue
    .line 800
    iget v0, p0, Lcom/android/core/ArrayDeque;->c:I

    .line 801
    iget v1, p0, Lcom/android/core/ArrayDeque;->d:I

    .line 802
    if-eq v0, v1, :cond_1

    .line 803
    const/4 v2, 0x0

    iput v2, p0, Lcom/android/core/ArrayDeque;->d:I

    iput v2, p0, Lcom/android/core/ArrayDeque;->c:I

    .line 805
    iget-object v2, p0, Lcom/android/core/ArrayDeque;->b:[Ljava/lang/Object;

    array-length v2, v2

    add-int/lit8 v2, v2, -0x1

    .line 807
    :cond_0
    iget-object v3, p0, Lcom/android/core/ArrayDeque;->b:[Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v4, v3, v0

    .line 808
    add-int/lit8 v0, v0, 0x1

    and-int/2addr v0, v2

    .line 809
    if-ne v0, v1, :cond_0

    .line 811
    :cond_1
    return-void
.end method

.method public clone()Lcom/android/core/ArrayDeque;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/android/core/ArrayDeque",
            "<TE;>;"
        }
    .end annotation

    .prologue
    .line 895
    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/android/core/ArrayDeque;

    .line 896
    iget-object v1, p0, Lcom/android/core/ArrayDeque;->b:[Ljava/lang/Object;

    iget-object v2, p0, Lcom/android/core/ArrayDeque;->b:[Ljava/lang/Object;

    array-length v2, v2

    invoke-static {v1, v2}, Lcom/android/core/a;->a([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    iput-object v1, v0, Lcom/android/core/ArrayDeque;->b:[Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 897
    return-object v0

    .line 899
    :catch_0
    move-exception v0

    .line 900
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    .prologue
    .line 62
    invoke-virtual {p0}, Lcom/android/core/ArrayDeque;->clone()Lcom/android/core/ArrayDeque;

    move-result-object v0

    return-object v0
.end method

.method public contains(Ljava/lang/Object;)Z
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 760
    if-nez p1, :cond_0

    move v0, v1

    .line 772
    :goto_0
    return v0

    .line 763
    :cond_0
    iget-object v0, p0, Lcom/android/core/ArrayDeque;->b:[Ljava/lang/Object;

    array-length v0, v0

    add-int/lit8 v2, v0, -0x1

    .line 764
    iget v0, p0, Lcom/android/core/ArrayDeque;->c:I

    .line 766
    :goto_1
    iget-object v3, p0, Lcom/android/core/ArrayDeque;->b:[Ljava/lang/Object;

    aget-object v3, v3, v0

    if-eqz v3, :cond_2

    .line 767
    invoke-virtual {p1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 768
    const/4 v0, 0x1

    goto :goto_0

    .line 770
    :cond_1
    add-int/lit8 v0, v0, 0x1

    and-int/2addr v0, v2

    goto :goto_1

    :cond_2
    move v0, v1

    .line 772
    goto :goto_0
.end method

.method public descendingIterator()Ljava/util/Iterator;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator",
            "<TE;>;"
        }
    .end annotation

    .prologue
    .line 652
    new-instance v0, Lcom/android/core/ArrayDeque$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/android/core/ArrayDeque$b;-><init>(Lcom/android/core/ArrayDeque;Lcom/android/core/ArrayDeque$1;)V

    return-object v0
.end method

.method public element()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TE;"
        }
    .end annotation

    .prologue
    .line 504
    invoke-virtual {p0}, Lcom/android/core/ArrayDeque;->getFirst()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public getFirst()Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TE;"
        }
    .end annotation

    .prologue
    .line 331
    iget-object v0, p0, Lcom/android/core/ArrayDeque;->b:[Ljava/lang/Object;

    iget v1, p0, Lcom/android/core/ArrayDeque;->c:I

    aget-object v0, v0, v1

    .line 332
    if-nez v0, :cond_0

    .line 333
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0

    .line 335
    :cond_0
    return-object v0
.end method

.method public getLast()Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TE;"
        }
    .end annotation

    .prologue
    .line 344
    iget-object v0, p0, Lcom/android/core/ArrayDeque;->b:[Ljava/lang/Object;

    iget v1, p0, Lcom/android/core/ArrayDeque;->d:I

    add-int/lit8 v1, v1, -0x1

    iget-object v2, p0, Lcom/android/core/ArrayDeque;->b:[Ljava/lang/Object;

    array-length v2, v2

    add-int/lit8 v2, v2, -0x1

    and-int/2addr v1, v2

    aget-object v0, v0, v1

    .line 345
    if-nez v0, :cond_0

    .line 346
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0

    .line 348
    :cond_0
    return-object v0
.end method

.method public isEmpty()Z
    .locals 2

    .prologue
    .line 634
    iget v0, p0, Lcom/android/core/ArrayDeque;->c:I

    iget v1, p0, Lcom/android/core/ArrayDeque;->d:I

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator",
            "<TE;>;"
        }
    .end annotation

    .prologue
    .line 647
    new-instance v0, Lcom/android/core/ArrayDeque$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/android/core/ArrayDeque$a;-><init>(Lcom/android/core/ArrayDeque;Lcom/android/core/ArrayDeque$1;)V

    return-object v0
.end method

.method public offer(Ljava/lang/Object;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)Z"
        }
    .end annotation

    .prologue
    .line 455
    invoke-virtual {p0, p1}, Lcom/android/core/ArrayDeque;->offerLast(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public offerFirst(Ljava/lang/Object;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)Z"
        }
    .end annotation

    .prologue
    .line 256
    invoke-virtual {p0, p1}, Lcom/android/core/ArrayDeque;->addFirst(Ljava/lang/Object;)V

    .line 257
    const/4 v0, 0x1

    return v0
.end method

.method public offerLast(Ljava/lang/Object;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)Z"
        }
    .end annotation

    .prologue
    .line 271
    invoke-virtual {p0, p1}, Lcom/android/core/ArrayDeque;->addLast(Ljava/lang/Object;)V

    .line 272
    const/4 v0, 0x1

    return v0
.end method

.method public peek()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TE;"
        }
    .end annotation

    .prologue
    .line 518
    invoke-virtual {p0}, Lcom/android/core/ArrayDeque;->peekFirst()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public peekFirst()Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TE;"
        }
    .end annotation

    .prologue
    .line 353
    iget-object v0, p0, Lcom/android/core/ArrayDeque;->b:[Ljava/lang/Object;

    iget v1, p0, Lcom/android/core/ArrayDeque;->c:I

    aget-object v0, v0, v1

    return-object v0
.end method

.method public peekLast()Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TE;"
        }
    .end annotation

    .prologue
    .line 358
    iget-object v0, p0, Lcom/android/core/ArrayDeque;->b:[Ljava/lang/Object;

    iget v1, p0, Lcom/android/core/ArrayDeque;->d:I

    add-int/lit8 v1, v1, -0x1

    iget-object v2, p0, Lcom/android/core/ArrayDeque;->b:[Ljava/lang/Object;

    array-length v2, v2

    add-int/lit8 v2, v2, -0x1

    and-int/2addr v1, v2

    aget-object v0, v0, v1

    return-object v0
.end method

.method public poll()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TE;"
        }
    .end annotation

    .prologue
    .line 487
    invoke-virtual {p0}, Lcom/android/core/ArrayDeque;->pollFirst()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public pollFirst()Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TE;"
        }
    .end annotation

    .prologue
    const/4 v0, 0x0

    .line 303
    iget v2, p0, Lcom/android/core/ArrayDeque;->c:I

    .line 304
    iget-object v1, p0, Lcom/android/core/ArrayDeque;->b:[Ljava/lang/Object;

    aget-object v1, v1, v2

    .line 305
    if-nez v1, :cond_0

    .line 310
    :goto_0
    return-object v0

    .line 308
    :cond_0
    iget-object v3, p0, Lcom/android/core/ArrayDeque;->b:[Ljava/lang/Object;

    aput-object v0, v3, v2

    .line 309
    add-int/lit8 v0, v2, 0x1

    iget-object v2, p0, Lcom/android/core/ArrayDeque;->b:[Ljava/lang/Object;

    array-length v2, v2

    add-int/lit8 v2, v2, -0x1

    and-int/2addr v0, v2

    iput v0, p0, Lcom/android/core/ArrayDeque;->c:I

    move-object v0, v1

    .line 310
    goto :goto_0
.end method

.method public pollLast()Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TE;"
        }
    .end annotation

    .prologue
    const/4 v0, 0x0

    .line 315
    iget v1, p0, Lcom/android/core/ArrayDeque;->d:I

    add-int/lit8 v1, v1, -0x1

    iget-object v2, p0, Lcom/android/core/ArrayDeque;->b:[Ljava/lang/Object;

    array-length v2, v2

    add-int/lit8 v2, v2, -0x1

    and-int/2addr v2, v1

    .line 316
    iget-object v1, p0, Lcom/android/core/ArrayDeque;->b:[Ljava/lang/Object;

    aget-object v1, v1, v2

    .line 317
    if-nez v1, :cond_0

    .line 322
    :goto_0
    return-object v0

    .line 320
    :cond_0
    iget-object v3, p0, Lcom/android/core/ArrayDeque;->b:[Ljava/lang/Object;

    aput-object v0, v3, v2

    .line 321
    iput v2, p0, Lcom/android/core/ArrayDeque;->d:I

    move-object v0, v1

    .line 322
    goto :goto_0
.end method

.method public pop()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TE;"
        }
    .end annotation

    .prologue
    .line 554
    invoke-virtual {p0}, Lcom/android/core/ArrayDeque;->removeFirst()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public push(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)V"
        }
    .end annotation

    .prologue
    .line 537
    invoke-virtual {p0, p1}, Lcom/android/core/ArrayDeque;->addFirst(Ljava/lang/Object;)V

    .line 538
    return-void
.end method

.method public remove()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TE;"
        }
    .end annotation

    .prologue
    .line 473
    invoke-virtual {p0}, Lcom/android/core/ArrayDeque;->removeFirst()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public remove(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    .line 791
    invoke-virtual {p0, p1}, Lcom/android/core/ArrayDeque;->removeFirstOccurrence(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public removeFirst()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TE;"
        }
    .end annotation

    .prologue
    .line 281
    invoke-virtual {p0}, Lcom/android/core/ArrayDeque;->pollFirst()Ljava/lang/Object;

    move-result-object v0

    .line 282
    if-nez v0, :cond_0

    .line 283
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0

    .line 285
    :cond_0
    return-object v0
.end method

.method public removeFirstOccurrence(Ljava/lang/Object;)Z
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 375
    if-nez p1, :cond_0

    move v0, v1

    .line 388
    :goto_0
    return v0

    .line 378
    :cond_0
    iget-object v0, p0, Lcom/android/core/ArrayDeque;->b:[Ljava/lang/Object;

    array-length v0, v0

    add-int/lit8 v2, v0, -0x1

    .line 379
    iget v0, p0, Lcom/android/core/ArrayDeque;->c:I

    .line 381
    :goto_1
    iget-object v3, p0, Lcom/android/core/ArrayDeque;->b:[Ljava/lang/Object;

    aget-object v3, v3, v0

    if-eqz v3, :cond_2

    .line 382
    invoke-virtual {p1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 383
    invoke-direct {p0, v0}, Lcom/android/core/ArrayDeque;->b(I)Z

    .line 384
    const/4 v0, 0x1

    goto :goto_0

    .line 386
    :cond_1
    add-int/lit8 v0, v0, 0x1

    and-int/2addr v0, v2

    goto :goto_1

    :cond_2
    move v0, v1

    .line 388
    goto :goto_0
.end method

.method public removeLast()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TE;"
        }
    .end annotation

    .prologue
    .line 294
    invoke-virtual {p0}, Lcom/android/core/ArrayDeque;->pollLast()Ljava/lang/Object;

    move-result-object v0

    .line 295
    if-nez v0, :cond_0

    .line 296
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0

    .line 298
    :cond_0
    return-object v0
.end method

.method public removeLastOccurrence(Ljava/lang/Object;)Z
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 405
    if-nez p1, :cond_0

    move v0, v1

    .line 418
    :goto_0
    return v0

    .line 408
    :cond_0
    iget-object v0, p0, Lcom/android/core/ArrayDeque;->b:[Ljava/lang/Object;

    array-length v0, v0

    add-int/lit8 v2, v0, -0x1

    .line 409
    iget v0, p0, Lcom/android/core/ArrayDeque;->d:I

    add-int/lit8 v0, v0, -0x1

    and-int/2addr v0, v2

    .line 411
    :goto_1
    iget-object v3, p0, Lcom/android/core/ArrayDeque;->b:[Ljava/lang/Object;

    aget-object v3, v3, v0

    if-eqz v3, :cond_2

    .line 412
    invoke-virtual {p1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 413
    invoke-direct {p0, v0}, Lcom/android/core/ArrayDeque;->b(I)Z

    .line 414
    const/4 v0, 0x1

    goto :goto_0

    .line 416
    :cond_1
    add-int/lit8 v0, v0, -0x1

    and-int/2addr v0, v2

    goto :goto_1

    :cond_2
    move v0, v1

    .line 418
    goto :goto_0
.end method

.method public size()I
    .locals 2

    .prologue
    .line 624
    iget v0, p0, Lcom/android/core/ArrayDeque;->d:I

    iget v1, p0, Lcom/android/core/ArrayDeque;->c:I

    sub-int/2addr v0, v1

    iget-object v1, p0, Lcom/android/core/ArrayDeque;->b:[Ljava/lang/Object;

    array-length v1, v1

    add-int/lit8 v1, v1, -0x1

    and-int/2addr v0, v1

    return v0
.end method

.method public toArray()[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 828
    invoke-virtual {p0}, Lcom/android/core/ArrayDeque;->size()I

    move-result v0

    new-array v0, v0, [Ljava/lang/Object;

    invoke-direct {p0, v0}, Lcom/android/core/ArrayDeque;->a([Ljava/lang/Object;)[Ljava/lang/Object;

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
    .line 873
    invoke-virtual {p0}, Lcom/android/core/ArrayDeque;->size()I

    move-result v1

    .line 874
    array-length v0, p1

    if-ge v0, v1, :cond_1

    .line 875
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object v0

    invoke-static {v0, v1}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/Object;

    check-cast v0, [Ljava/lang/Object;

    .line 877
    :goto_0
    invoke-direct {p0, v0}, Lcom/android/core/ArrayDeque;->a([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 878
    array-length v2, v0

    if-le v2, v1, :cond_0

    .line 879
    const/4 v2, 0x0

    aput-object v2, v0, v1

    .line 881
    :cond_0
    return-object v0

    :cond_1
    move-object v0, p1

    goto :goto_0
.end method
