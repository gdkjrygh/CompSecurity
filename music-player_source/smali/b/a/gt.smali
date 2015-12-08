.class public final Lb/a/gt;
.super Lb/a/gi;


# virtual methods
.method public final a(Ljava/util/BitSet;I)V
    .locals 7

    const/4 v1, 0x0

    int-to-double v2, p2

    const-wide/high16 v4, 0x4020000000000000L    # 8.0

    div-double/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v2

    double-to-int v0, v2

    new-array v2, v0, [B

    move v0, v1

    :goto_0
    invoke-virtual {p1}, Ljava/util/BitSet;->length()I

    move-result v3

    if-ge v0, v3, :cond_1

    invoke-virtual {p1, v0}, Ljava/util/BitSet;->get(I)Z

    move-result v3

    if-eqz v3, :cond_0

    array-length v3, v2

    div-int/lit8 v4, v0, 0x8

    sub-int/2addr v3, v4

    add-int/lit8 v3, v3, -0x1

    aget-byte v4, v2, v3

    const/4 v5, 0x1

    rem-int/lit8 v6, v0, 0x8

    shl-int/2addr v5, v6

    or-int/2addr v4, v5

    int-to-byte v4, v4

    aput-byte v4, v2, v3

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    array-length v0, v2

    :goto_1
    if-ge v1, v0, :cond_2

    aget-byte v3, v2, v1

    invoke-virtual {p0, v3}, Lb/a/gt;->a(B)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_2
    return-void
.end method

.method public final b(I)Ljava/util/BitSet;
    .locals 6

    const/4 v0, 0x0

    int-to-double v2, p1

    const-wide/high16 v4, 0x4020000000000000L    # 8.0

    div-double/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v2

    double-to-int v2, v2

    new-array v3, v2, [B

    move v1, v0

    :goto_0
    if-ge v1, v2, :cond_0

    invoke-virtual {p0}, Lb/a/gt;->k()B

    move-result v4

    aput-byte v4, v3, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/util/BitSet;

    invoke-direct {v1}, Ljava/util/BitSet;-><init>()V

    :goto_1
    array-length v2, v3

    mul-int/lit8 v2, v2, 0x8

    if-ge v0, v2, :cond_2

    array-length v2, v3

    div-int/lit8 v4, v0, 0x8

    sub-int/2addr v2, v4

    add-int/lit8 v2, v2, -0x1

    aget-byte v2, v3, v2

    const/4 v4, 0x1

    rem-int/lit8 v5, v0, 0x8

    shl-int/2addr v4, v5

    and-int/2addr v2, v4

    if-lez v2, :cond_1

    invoke-virtual {v1, v0}, Ljava/util/BitSet;->set(I)V

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_2
    return-object v1
.end method

.method public final s()Ljava/lang/Class;
    .locals 1

    const-class v0, Lb/a/gx;

    return-object v0
.end method
