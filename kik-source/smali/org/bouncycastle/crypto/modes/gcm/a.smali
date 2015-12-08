.class abstract Lorg/bouncycastle/crypto/modes/gcm/a;
.super Ljava/lang/Object;


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static asInts([B)[I
    .locals 4

    const/4 v3, 0x4

    const/4 v2, 0x0

    new-array v0, v3, [I

    invoke-static {p0, v2}, Lorg/bouncycastle/crypto/util/Pack;->bigEndianToInt([BI)I

    move-result v1

    aput v1, v0, v2

    const/4 v1, 0x1

    invoke-static {p0, v3}, Lorg/bouncycastle/crypto/util/Pack;->bigEndianToInt([BI)I

    move-result v2

    aput v2, v0, v1

    const/4 v1, 0x2

    const/16 v2, 0x8

    invoke-static {p0, v2}, Lorg/bouncycastle/crypto/util/Pack;->bigEndianToInt([BI)I

    move-result v2

    aput v2, v0, v1

    const/4 v1, 0x3

    const/16 v2, 0xc

    invoke-static {p0, v2}, Lorg/bouncycastle/crypto/util/Pack;->bigEndianToInt([BI)I

    move-result v2

    aput v2, v0, v1

    return-object v0
.end method

.method static multiply([B[B)V
    .locals 9

    const/4 v1, 0x1

    const/16 v8, 0x10

    const/4 v2, 0x0

    invoke-static {p0}, Lorg/bouncycastle/util/Arrays;->c([B)[B

    move-result-object v5

    new-array v6, v8, [B

    move v4, v2

    :goto_0
    if-ge v4, v8, :cond_4

    aget-byte v7, p1, v4

    const/4 v0, 0x7

    move v3, v0

    :goto_1
    if-ltz v3, :cond_3

    shl-int v0, v1, v3

    and-int/2addr v0, v7

    if-eqz v0, :cond_0

    invoke-static {v6, v5}, Lorg/bouncycastle/crypto/modes/gcm/a;->xor([B[B)V

    :cond_0
    const/16 v0, 0xf

    aget-byte v0, v5, v0

    and-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_2

    move v0, v1

    :goto_2
    invoke-static {v5}, Lorg/bouncycastle/crypto/modes/gcm/a;->shiftRight([B)V

    if-eqz v0, :cond_1

    aget-byte v0, v5, v2

    xor-int/lit8 v0, v0, -0x1f

    int-to-byte v0, v0

    aput-byte v0, v5, v2

    :cond_1
    add-int/lit8 v0, v3, -0x1

    move v3, v0

    goto :goto_1

    :cond_2
    move v0, v2

    goto :goto_2

    :cond_3
    add-int/lit8 v0, v4, 0x1

    move v4, v0

    goto :goto_0

    :cond_4
    invoke-static {v6, v2, p0, v2, v8}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-void
.end method

.method static multiplyP([I)V
    .locals 3

    const/4 v1, 0x0

    const/4 v0, 0x3

    aget v0, p0, v0

    and-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    :goto_0
    invoke-static {p0}, Lorg/bouncycastle/crypto/modes/gcm/a;->shiftRight([I)V

    if-eqz v0, :cond_0

    aget v0, p0, v1

    const/high16 v2, -0x1f000000

    xor-int/2addr v0, v2

    aput v0, p0, v1

    :cond_0
    return-void

    :cond_1
    move v0, v1

    goto :goto_0
.end method

.method static multiplyP8([I)V
    .locals 1

    const/16 v0, 0x8

    :goto_0
    if-eqz v0, :cond_0

    invoke-static {p0}, Lorg/bouncycastle/crypto/modes/gcm/a;->multiplyP([I)V

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method static oneAsBytes()[B
    .locals 3

    const/16 v0, 0x10

    new-array v0, v0, [B

    const/4 v1, 0x0

    const/16 v2, -0x80

    aput-byte v2, v0, v1

    return-object v0
.end method

.method static oneAsInts()[I
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [I

    const/4 v1, 0x0

    const/high16 v2, -0x80000000

    aput v2, v0, v1

    return-object v0
.end method

.method static shiftRight([B)V
    .locals 4

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    aget-byte v2, p0, v1

    and-int/lit16 v2, v2, 0xff

    ushr-int/lit8 v3, v2, 0x1

    or-int/2addr v0, v3

    int-to-byte v0, v0

    aput-byte v0, p0, v1

    add-int/lit8 v1, v1, 0x1

    const/16 v0, 0x10

    if-eq v1, v0, :cond_0

    and-int/lit8 v0, v2, 0x1

    shl-int/lit8 v0, v0, 0x7

    goto :goto_0

    :cond_0
    return-void
.end method

.method static shiftRight([I)V
    .locals 4

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    aget v2, p0, v1

    ushr-int/lit8 v3, v2, 0x1

    or-int/2addr v0, v3

    aput v0, p0, v1

    add-int/lit8 v1, v1, 0x1

    const/4 v0, 0x4

    if-eq v1, v0, :cond_0

    shl-int/lit8 v0, v2, 0x1f

    goto :goto_0

    :cond_0
    return-void
.end method

.method static xor([B[B)V
    .locals 3

    const/16 v0, 0xf

    :goto_0
    if-ltz v0, :cond_0

    aget-byte v1, p0, v0

    aget-byte v2, p1, v0

    xor-int/2addr v1, v2

    int-to-byte v1, v1

    aput-byte v1, p0, v0

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method static xor([I[I)V
    .locals 3

    const/4 v0, 0x3

    :goto_0
    if-ltz v0, :cond_0

    aget v1, p0, v0

    aget v2, p1, v0

    xor-int/2addr v1, v2

    aput v1, p0, v0

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_0
    return-void
.end method
