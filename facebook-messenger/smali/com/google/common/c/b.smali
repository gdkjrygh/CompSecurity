.class public final Lcom/google/common/c/b;
.super Ljava/lang/Object;
.source "Longs.java"


# annotations
.annotation build Lcom/google/common/annotations/GwtCompatible;
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(J)I
    .locals 2

    .prologue
    .line 73
    const/16 v0, 0x20

    ushr-long v0, p0, v0

    xor-long/2addr v0, p0

    long-to-int v0, v0

    return v0
.end method

.method public static a(JJ)I
    .locals 1

    .prologue
    .line 86
    cmp-long v0, p0, p2

    if-gez v0, :cond_0

    const/4 v0, -0x1

    :goto_0
    return v0

    :cond_0
    cmp-long v0, p0, p2

    if-lez v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method static synthetic a([JJII)I
    .locals 1

    .prologue
    .line 44
    invoke-static {p0, p1, p2, p3, p4}, Lcom/google/common/c/b;->c([JJII)I

    move-result v0

    return v0
.end method

.method public static varargs a([J)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([J)",
            "Ljava/util/List",
            "<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    .prologue
    .line 447
    array-length v0, p0

    if-nez v0, :cond_0

    .line 448
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    .line 450
    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Lcom/google/common/c/c;

    invoke-direct {v0, p0}, Lcom/google/common/c/c;-><init>([J)V

    goto :goto_0
.end method

.method public static a(Ljava/util/Collection;)[J
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<",
            "Ljava/lang/Long;",
            ">;)[J"
        }
    .end annotation

    .prologue
    .line 418
    instance-of v0, p0, Lcom/google/common/c/c;

    if-eqz v0, :cond_0

    .line 419
    check-cast p0, Lcom/google/common/c/c;

    invoke-virtual {p0}, Lcom/google/common/c/c;->a()[J

    move-result-object v0

    .line 429
    :goto_0
    return-object v0

    .line 422
    :cond_0
    invoke-interface {p0}, Ljava/util/Collection;->toArray()[Ljava/lang/Object;

    move-result-object v3

    .line 423
    array-length v4, v3

    .line 424
    new-array v1, v4, [J

    .line 425
    const/4 v0, 0x0

    move v2, v0

    :goto_1
    if-ge v2, v4, :cond_1

    .line 427
    aget-object v0, v3, v2

    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    aput-wide v5, v1, v2

    .line 425
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_1

    :cond_1
    move-object v0, v1

    .line 429
    goto :goto_0
.end method

.method static synthetic b([JJII)I
    .locals 1

    .prologue
    .line 44
    invoke-static {p0, p1, p2, p3, p4}, Lcom/google/common/c/b;->d([JJII)I

    move-result v0

    return v0
.end method

.method private static c([JJII)I
    .locals 3

    .prologue
    .line 123
    move v0, p3

    :goto_0
    if-ge v0, p4, :cond_1

    .line 124
    aget-wide v1, p0, v0

    cmp-long v1, v1, p1

    if-nez v1, :cond_0

    .line 128
    :goto_1
    return v0

    .line 123
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 128
    :cond_1
    const/4 v0, -0x1

    goto :goto_1
.end method

.method private static d([JJII)I
    .locals 3

    .prologue
    .line 177
    add-int/lit8 v0, p4, -0x1

    :goto_0
    if-lt v0, p3, :cond_1

    .line 178
    aget-wide v1, p0, v0

    cmp-long v1, v1, p1

    if-nez v1, :cond_0

    .line 182
    :goto_1
    return v0

    .line 177
    :cond_0
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    .line 182
    :cond_1
    const/4 v0, -0x1

    goto :goto_1
.end method
