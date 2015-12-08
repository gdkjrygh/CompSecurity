.class abstract Lorg/spongycastle/crypto/modes/gcm/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method static a([I)V
    .locals 6

    .prologue
    const/4 v1, 0x0

    .line 64
    const/4 v0, 0x3

    aget v0, p0, v0

    and-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    move v2, v1

    move v3, v1

    .line 65
    :goto_1
    aget v4, p0, v3

    ushr-int/lit8 v5, v4, 0x1

    or-int/2addr v2, v5

    aput v2, p0, v3

    add-int/lit8 v3, v3, 0x1

    const/4 v2, 0x4

    if-eq v3, v2, :cond_1

    shl-int/lit8 v2, v4, 0x1f

    goto :goto_1

    :cond_0
    move v0, v1

    .line 64
    goto :goto_0

    .line 66
    :cond_1
    if-eqz v0, :cond_2

    .line 70
    aget v0, p0, v1

    const/high16 v2, -0x1f000000

    xor-int/2addr v0, v2

    aput v0, p0, v1

    .line 72
    :cond_2
    return-void
.end method

.method static a([I[I)V
    .locals 3

    .prologue
    .line 150
    const/4 v0, 0x3

    :goto_0
    if-ltz v0, :cond_0

    .line 152
    aget v1, p0, v0

    aget v2, p1, v0

    xor-int/2addr v1, v2

    aput v1, p0, v0

    .line 150
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    .line 154
    :cond_0
    return-void
.end method

.method static a([B)[I
    .locals 4

    .prologue
    const/4 v3, 0x4

    const/4 v2, 0x0

    .line 24
    new-array v0, v3, [I

    .line 25
    invoke-static {p0, v2}, Lorg/spongycastle/crypto/util/Pack;->a([BI)I

    move-result v1

    aput v1, v0, v2

    .line 26
    const/4 v1, 0x1

    invoke-static {p0, v3}, Lorg/spongycastle/crypto/util/Pack;->a([BI)I

    move-result v2

    aput v2, v0, v1

    .line 27
    const/4 v1, 0x2

    const/16 v2, 0x8

    invoke-static {p0, v2}, Lorg/spongycastle/crypto/util/Pack;->a([BI)I

    move-result v2

    aput v2, v0, v1

    .line 28
    const/4 v1, 0x3

    const/16 v2, 0xc

    invoke-static {p0, v2}, Lorg/spongycastle/crypto/util/Pack;->a([BI)I

    move-result v2

    aput v2, v0, v1

    .line 29
    return-object v0
.end method

.method static b([I)V
    .locals 6

    .prologue
    const/4 v1, 0x0

    .line 81
    const/4 v0, 0x3

    aget v3, p0, v0

    move v0, v1

    move v2, v1

    .line 82
    :goto_0
    aget v4, p0, v2

    ushr-int/lit8 v5, v4, 0x8

    or-int/2addr v0, v5

    aput v0, p0, v2

    add-int/lit8 v2, v2, 0x1

    const/4 v0, 0x4

    if-eq v2, v0, :cond_0

    shl-int/lit8 v0, v4, 0x18

    goto :goto_0

    .line 83
    :cond_0
    const/4 v0, 0x7

    :goto_1
    if-ltz v0, :cond_2

    .line 85
    const/4 v2, 0x1

    shl-int/2addr v2, v0

    and-int/2addr v2, v3

    if-eqz v2, :cond_1

    .line 87
    aget v2, p0, v1

    const/high16 v4, -0x1f000000

    rsub-int/lit8 v5, v0, 0x7

    ushr-int/2addr v4, v5

    xor-int/2addr v2, v4

    aput v2, p0, v1

    .line 83
    :cond_1
    add-int/lit8 v0, v0, -0x1

    goto :goto_1

    .line 90
    :cond_2
    return-void
.end method
