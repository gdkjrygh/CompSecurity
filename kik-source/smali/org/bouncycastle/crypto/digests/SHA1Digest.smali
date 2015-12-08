.class public Lorg/bouncycastle/crypto/digests/SHA1Digest;
.super Lorg/bouncycastle/crypto/digests/GeneralDigest;


# instance fields
.field private a:I

.field private b:I

.field private c:I

.field private d:I

.field private e:I

.field private f:[I

.field private g:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lorg/bouncycastle/crypto/digests/GeneralDigest;-><init>()V

    const/16 v0, 0x50

    new-array v0, v0, [I

    iput-object v0, p0, Lorg/bouncycastle/crypto/digests/SHA1Digest;->f:[I

    invoke-virtual {p0}, Lorg/bouncycastle/crypto/digests/SHA1Digest;->reset()V

    return-void
.end method

.method public constructor <init>(Lorg/bouncycastle/crypto/digests/SHA1Digest;)V
    .locals 4

    const/4 v3, 0x0

    invoke-direct {p0, p1}, Lorg/bouncycastle/crypto/digests/GeneralDigest;-><init>(Lorg/bouncycastle/crypto/digests/GeneralDigest;)V

    const/16 v0, 0x50

    new-array v0, v0, [I

    iput-object v0, p0, Lorg/bouncycastle/crypto/digests/SHA1Digest;->f:[I

    iget v0, p1, Lorg/bouncycastle/crypto/digests/SHA1Digest;->a:I

    iput v0, p0, Lorg/bouncycastle/crypto/digests/SHA1Digest;->a:I

    iget v0, p1, Lorg/bouncycastle/crypto/digests/SHA1Digest;->b:I

    iput v0, p0, Lorg/bouncycastle/crypto/digests/SHA1Digest;->b:I

    iget v0, p1, Lorg/bouncycastle/crypto/digests/SHA1Digest;->c:I

    iput v0, p0, Lorg/bouncycastle/crypto/digests/SHA1Digest;->c:I

    iget v0, p1, Lorg/bouncycastle/crypto/digests/SHA1Digest;->d:I

    iput v0, p0, Lorg/bouncycastle/crypto/digests/SHA1Digest;->d:I

    iget v0, p1, Lorg/bouncycastle/crypto/digests/SHA1Digest;->e:I

    iput v0, p0, Lorg/bouncycastle/crypto/digests/SHA1Digest;->e:I

    iget-object v0, p1, Lorg/bouncycastle/crypto/digests/SHA1Digest;->f:[I

    iget-object v1, p0, Lorg/bouncycastle/crypto/digests/SHA1Digest;->f:[I

    iget-object v2, p1, Lorg/bouncycastle/crypto/digests/SHA1Digest;->f:[I

    array-length v2, v2

    invoke-static {v0, v3, v1, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget v0, p1, Lorg/bouncycastle/crypto/digests/SHA1Digest;->g:I

    iput v0, p0, Lorg/bouncycastle/crypto/digests/SHA1Digest;->g:I

    return-void
.end method

.method private f(III)I
    .locals 2

    and-int v0, p1, p2

    xor-int/lit8 v1, p1, -0x1

    and-int/2addr v1, p3

    or-int/2addr v0, v1

    return v0
.end method

.method private g(III)I
    .locals 2

    and-int v0, p1, p2

    and-int v1, p1, p3

    or-int/2addr v0, v1

    and-int v1, p2, p3

    or-int/2addr v0, v1

    return v0
.end method

.method private h(III)I
    .locals 1

    xor-int v0, p1, p2

    xor-int/2addr v0, p3

    return v0
.end method


# virtual methods
.method public doFinal([BI)I
    .locals 2

    invoke-virtual {p0}, Lorg/bouncycastle/crypto/digests/SHA1Digest;->finish()V

    iget v0, p0, Lorg/bouncycastle/crypto/digests/SHA1Digest;->a:I

    invoke-static {v0, p1, p2}, Lorg/bouncycastle/crypto/util/Pack;->intToBigEndian(I[BI)V

    iget v0, p0, Lorg/bouncycastle/crypto/digests/SHA1Digest;->b:I

    add-int/lit8 v1, p2, 0x4

    invoke-static {v0, p1, v1}, Lorg/bouncycastle/crypto/util/Pack;->intToBigEndian(I[BI)V

    iget v0, p0, Lorg/bouncycastle/crypto/digests/SHA1Digest;->c:I

    add-int/lit8 v1, p2, 0x8

    invoke-static {v0, p1, v1}, Lorg/bouncycastle/crypto/util/Pack;->intToBigEndian(I[BI)V

    iget v0, p0, Lorg/bouncycastle/crypto/digests/SHA1Digest;->d:I

    add-int/lit8 v1, p2, 0xc

    invoke-static {v0, p1, v1}, Lorg/bouncycastle/crypto/util/Pack;->intToBigEndian(I[BI)V

    iget v0, p0, Lorg/bouncycastle/crypto/digests/SHA1Digest;->e:I

    add-int/lit8 v1, p2, 0x10

    invoke-static {v0, p1, v1}, Lorg/bouncycastle/crypto/util/Pack;->intToBigEndian(I[BI)V

    invoke-virtual {p0}, Lorg/bouncycastle/crypto/digests/SHA1Digest;->reset()V

    const/16 v0, 0x14

    return v0
.end method

.method public getAlgorithmName()Ljava/lang/String;
    .locals 1

    const-string v0, "SHA-1"

    return-object v0
.end method

.method public getDigestSize()I
    .locals 1

    const/16 v0, 0x14

    return v0
.end method

.method protected processBlock()V
    .locals 10

    const/16 v0, 0x10

    :goto_0
    const/16 v1, 0x50

    if-ge v0, v1, :cond_0

    iget-object v1, p0, Lorg/bouncycastle/crypto/digests/SHA1Digest;->f:[I

    add-int/lit8 v2, v0, -0x3

    aget v1, v1, v2

    iget-object v2, p0, Lorg/bouncycastle/crypto/digests/SHA1Digest;->f:[I

    add-int/lit8 v3, v0, -0x8

    aget v2, v2, v3

    xor-int/2addr v1, v2

    iget-object v2, p0, Lorg/bouncycastle/crypto/digests/SHA1Digest;->f:[I

    add-int/lit8 v3, v0, -0xe

    aget v2, v2, v3

    xor-int/2addr v1, v2

    iget-object v2, p0, Lorg/bouncycastle/crypto/digests/SHA1Digest;->f:[I

    add-int/lit8 v3, v0, -0x10

    aget v2, v2, v3

    xor-int/2addr v1, v2

    iget-object v2, p0, Lorg/bouncycastle/crypto/digests/SHA1Digest;->f:[I

    shl-int/lit8 v3, v1, 0x1

    ushr-int/lit8 v1, v1, 0x1f

    or-int/2addr v1, v3

    aput v1, v2, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    iget v6, p0, Lorg/bouncycastle/crypto/digests/SHA1Digest;->a:I

    iget v5, p0, Lorg/bouncycastle/crypto/digests/SHA1Digest;->b:I

    iget v4, p0, Lorg/bouncycastle/crypto/digests/SHA1Digest;->c:I

    iget v3, p0, Lorg/bouncycastle/crypto/digests/SHA1Digest;->d:I

    iget v2, p0, Lorg/bouncycastle/crypto/digests/SHA1Digest;->e:I

    const/4 v1, 0x0

    const/4 v0, 0x0

    :goto_1
    const/4 v7, 0x4

    if-ge v0, v7, :cond_1

    shl-int/lit8 v7, v6, 0x5

    ushr-int/lit8 v8, v6, 0x1b

    or-int/2addr v7, v8

    invoke-direct {p0, v5, v4, v3}, Lorg/bouncycastle/crypto/digests/SHA1Digest;->f(III)I

    move-result v8

    add-int/2addr v7, v8

    iget-object v8, p0, Lorg/bouncycastle/crypto/digests/SHA1Digest;->f:[I

    add-int/lit8 v9, v1, 0x1

    aget v1, v8, v1

    add-int/2addr v1, v7

    const v7, 0x5a827999

    add-int/2addr v1, v7

    add-int/2addr v1, v2

    shl-int/lit8 v2, v5, 0x1e

    ushr-int/lit8 v5, v5, 0x2

    or-int/2addr v5, v2

    shl-int/lit8 v2, v1, 0x5

    ushr-int/lit8 v7, v1, 0x1b

    or-int/2addr v2, v7

    invoke-direct {p0, v6, v5, v4}, Lorg/bouncycastle/crypto/digests/SHA1Digest;->f(III)I

    move-result v7

    add-int/2addr v2, v7

    iget-object v7, p0, Lorg/bouncycastle/crypto/digests/SHA1Digest;->f:[I

    add-int/lit8 v8, v9, 0x1

    aget v7, v7, v9

    add-int/2addr v2, v7

    const v7, 0x5a827999

    add-int/2addr v2, v7

    add-int/2addr v3, v2

    shl-int/lit8 v2, v6, 0x1e

    ushr-int/lit8 v6, v6, 0x2

    or-int/2addr v6, v2

    shl-int/lit8 v2, v3, 0x5

    ushr-int/lit8 v7, v3, 0x1b

    or-int/2addr v2, v7

    invoke-direct {p0, v1, v6, v5}, Lorg/bouncycastle/crypto/digests/SHA1Digest;->f(III)I

    move-result v7

    add-int/2addr v2, v7

    iget-object v7, p0, Lorg/bouncycastle/crypto/digests/SHA1Digest;->f:[I

    add-int/lit8 v9, v8, 0x1

    aget v7, v7, v8

    add-int/2addr v2, v7

    const v7, 0x5a827999

    add-int/2addr v2, v7

    add-int/2addr v4, v2

    shl-int/lit8 v2, v1, 0x1e

    ushr-int/lit8 v1, v1, 0x2

    or-int/2addr v2, v1

    shl-int/lit8 v1, v4, 0x5

    ushr-int/lit8 v7, v4, 0x1b

    or-int/2addr v1, v7

    invoke-direct {p0, v3, v2, v6}, Lorg/bouncycastle/crypto/digests/SHA1Digest;->f(III)I

    move-result v7

    add-int/2addr v1, v7

    iget-object v7, p0, Lorg/bouncycastle/crypto/digests/SHA1Digest;->f:[I

    add-int/lit8 v8, v9, 0x1

    aget v7, v7, v9

    add-int/2addr v1, v7

    const v7, 0x5a827999

    add-int/2addr v1, v7

    add-int/2addr v5, v1

    shl-int/lit8 v1, v3, 0x1e

    ushr-int/lit8 v3, v3, 0x2

    or-int/2addr v3, v1

    shl-int/lit8 v1, v5, 0x5

    ushr-int/lit8 v7, v5, 0x1b

    or-int/2addr v1, v7

    invoke-direct {p0, v4, v3, v2}, Lorg/bouncycastle/crypto/digests/SHA1Digest;->f(III)I

    move-result v7

    add-int/2addr v7, v1

    iget-object v9, p0, Lorg/bouncycastle/crypto/digests/SHA1Digest;->f:[I

    add-int/lit8 v1, v8, 0x1

    aget v8, v9, v8

    add-int/2addr v7, v8

    const v8, 0x5a827999

    add-int/2addr v7, v8

    add-int/2addr v6, v7

    shl-int/lit8 v7, v4, 0x1e

    ushr-int/lit8 v4, v4, 0x2

    or-int/2addr v4, v7

    add-int/lit8 v0, v0, 0x1

    goto/16 :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_2
    const/4 v7, 0x4

    if-ge v0, v7, :cond_2

    shl-int/lit8 v7, v6, 0x5

    ushr-int/lit8 v8, v6, 0x1b

    or-int/2addr v7, v8

    invoke-direct {p0, v5, v4, v3}, Lorg/bouncycastle/crypto/digests/SHA1Digest;->h(III)I

    move-result v8

    add-int/2addr v7, v8

    iget-object v8, p0, Lorg/bouncycastle/crypto/digests/SHA1Digest;->f:[I

    add-int/lit8 v9, v1, 0x1

    aget v1, v8, v1

    add-int/2addr v1, v7

    const v7, 0x6ed9eba1

    add-int/2addr v1, v7

    add-int/2addr v1, v2

    shl-int/lit8 v2, v5, 0x1e

    ushr-int/lit8 v5, v5, 0x2

    or-int/2addr v5, v2

    shl-int/lit8 v2, v1, 0x5

    ushr-int/lit8 v7, v1, 0x1b

    or-int/2addr v2, v7

    invoke-direct {p0, v6, v5, v4}, Lorg/bouncycastle/crypto/digests/SHA1Digest;->h(III)I

    move-result v7

    add-int/2addr v2, v7

    iget-object v7, p0, Lorg/bouncycastle/crypto/digests/SHA1Digest;->f:[I

    add-int/lit8 v8, v9, 0x1

    aget v7, v7, v9

    add-int/2addr v2, v7

    const v7, 0x6ed9eba1

    add-int/2addr v2, v7

    add-int/2addr v3, v2

    shl-int/lit8 v2, v6, 0x1e

    ushr-int/lit8 v6, v6, 0x2

    or-int/2addr v6, v2

    shl-int/lit8 v2, v3, 0x5

    ushr-int/lit8 v7, v3, 0x1b

    or-int/2addr v2, v7

    invoke-direct {p0, v1, v6, v5}, Lorg/bouncycastle/crypto/digests/SHA1Digest;->h(III)I

    move-result v7

    add-int/2addr v2, v7

    iget-object v7, p0, Lorg/bouncycastle/crypto/digests/SHA1Digest;->f:[I

    add-int/lit8 v9, v8, 0x1

    aget v7, v7, v8

    add-int/2addr v2, v7

    const v7, 0x6ed9eba1

    add-int/2addr v2, v7

    add-int/2addr v4, v2

    shl-int/lit8 v2, v1, 0x1e

    ushr-int/lit8 v1, v1, 0x2

    or-int/2addr v2, v1

    shl-int/lit8 v1, v4, 0x5

    ushr-int/lit8 v7, v4, 0x1b

    or-int/2addr v1, v7

    invoke-direct {p0, v3, v2, v6}, Lorg/bouncycastle/crypto/digests/SHA1Digest;->h(III)I

    move-result v7

    add-int/2addr v1, v7

    iget-object v7, p0, Lorg/bouncycastle/crypto/digests/SHA1Digest;->f:[I

    add-int/lit8 v8, v9, 0x1

    aget v7, v7, v9

    add-int/2addr v1, v7

    const v7, 0x6ed9eba1

    add-int/2addr v1, v7

    add-int/2addr v5, v1

    shl-int/lit8 v1, v3, 0x1e

    ushr-int/lit8 v3, v3, 0x2

    or-int/2addr v3, v1

    shl-int/lit8 v1, v5, 0x5

    ushr-int/lit8 v7, v5, 0x1b

    or-int/2addr v1, v7

    invoke-direct {p0, v4, v3, v2}, Lorg/bouncycastle/crypto/digests/SHA1Digest;->h(III)I

    move-result v7

    add-int/2addr v7, v1

    iget-object v9, p0, Lorg/bouncycastle/crypto/digests/SHA1Digest;->f:[I

    add-int/lit8 v1, v8, 0x1

    aget v8, v9, v8

    add-int/2addr v7, v8

    const v8, 0x6ed9eba1

    add-int/2addr v7, v8

    add-int/2addr v6, v7

    shl-int/lit8 v7, v4, 0x1e

    ushr-int/lit8 v4, v4, 0x2

    or-int/2addr v4, v7

    add-int/lit8 v0, v0, 0x1

    goto/16 :goto_2

    :cond_2
    const/4 v0, 0x0

    :goto_3
    const/4 v7, 0x4

    if-ge v0, v7, :cond_3

    shl-int/lit8 v7, v6, 0x5

    ushr-int/lit8 v8, v6, 0x1b

    or-int/2addr v7, v8

    invoke-direct {p0, v5, v4, v3}, Lorg/bouncycastle/crypto/digests/SHA1Digest;->g(III)I

    move-result v8

    add-int/2addr v7, v8

    iget-object v8, p0, Lorg/bouncycastle/crypto/digests/SHA1Digest;->f:[I

    add-int/lit8 v9, v1, 0x1

    aget v1, v8, v1

    add-int/2addr v1, v7

    const v7, -0x70e44324

    add-int/2addr v1, v7

    add-int/2addr v1, v2

    shl-int/lit8 v2, v5, 0x1e

    ushr-int/lit8 v5, v5, 0x2

    or-int/2addr v5, v2

    shl-int/lit8 v2, v1, 0x5

    ushr-int/lit8 v7, v1, 0x1b

    or-int/2addr v2, v7

    invoke-direct {p0, v6, v5, v4}, Lorg/bouncycastle/crypto/digests/SHA1Digest;->g(III)I

    move-result v7

    add-int/2addr v2, v7

    iget-object v7, p0, Lorg/bouncycastle/crypto/digests/SHA1Digest;->f:[I

    add-int/lit8 v8, v9, 0x1

    aget v7, v7, v9

    add-int/2addr v2, v7

    const v7, -0x70e44324

    add-int/2addr v2, v7

    add-int/2addr v3, v2

    shl-int/lit8 v2, v6, 0x1e

    ushr-int/lit8 v6, v6, 0x2

    or-int/2addr v6, v2

    shl-int/lit8 v2, v3, 0x5

    ushr-int/lit8 v7, v3, 0x1b

    or-int/2addr v2, v7

    invoke-direct {p0, v1, v6, v5}, Lorg/bouncycastle/crypto/digests/SHA1Digest;->g(III)I

    move-result v7

    add-int/2addr v2, v7

    iget-object v7, p0, Lorg/bouncycastle/crypto/digests/SHA1Digest;->f:[I

    add-int/lit8 v9, v8, 0x1

    aget v7, v7, v8

    add-int/2addr v2, v7

    const v7, -0x70e44324

    add-int/2addr v2, v7

    add-int/2addr v4, v2

    shl-int/lit8 v2, v1, 0x1e

    ushr-int/lit8 v1, v1, 0x2

    or-int/2addr v2, v1

    shl-int/lit8 v1, v4, 0x5

    ushr-int/lit8 v7, v4, 0x1b

    or-int/2addr v1, v7

    invoke-direct {p0, v3, v2, v6}, Lorg/bouncycastle/crypto/digests/SHA1Digest;->g(III)I

    move-result v7

    add-int/2addr v1, v7

    iget-object v7, p0, Lorg/bouncycastle/crypto/digests/SHA1Digest;->f:[I

    add-int/lit8 v8, v9, 0x1

    aget v7, v7, v9

    add-int/2addr v1, v7

    const v7, -0x70e44324

    add-int/2addr v1, v7

    add-int/2addr v5, v1

    shl-int/lit8 v1, v3, 0x1e

    ushr-int/lit8 v3, v3, 0x2

    or-int/2addr v3, v1

    shl-int/lit8 v1, v5, 0x5

    ushr-int/lit8 v7, v5, 0x1b

    or-int/2addr v1, v7

    invoke-direct {p0, v4, v3, v2}, Lorg/bouncycastle/crypto/digests/SHA1Digest;->g(III)I

    move-result v7

    add-int/2addr v7, v1

    iget-object v9, p0, Lorg/bouncycastle/crypto/digests/SHA1Digest;->f:[I

    add-int/lit8 v1, v8, 0x1

    aget v8, v9, v8

    add-int/2addr v7, v8

    const v8, -0x70e44324

    add-int/2addr v7, v8

    add-int/2addr v6, v7

    shl-int/lit8 v7, v4, 0x1e

    ushr-int/lit8 v4, v4, 0x2

    or-int/2addr v4, v7

    add-int/lit8 v0, v0, 0x1

    goto/16 :goto_3

    :cond_3
    const/4 v0, 0x0

    :goto_4
    const/4 v7, 0x3

    if-gt v0, v7, :cond_4

    shl-int/lit8 v7, v6, 0x5

    ushr-int/lit8 v8, v6, 0x1b

    or-int/2addr v7, v8

    invoke-direct {p0, v5, v4, v3}, Lorg/bouncycastle/crypto/digests/SHA1Digest;->h(III)I

    move-result v8

    add-int/2addr v7, v8

    iget-object v8, p0, Lorg/bouncycastle/crypto/digests/SHA1Digest;->f:[I

    add-int/lit8 v9, v1, 0x1

    aget v1, v8, v1

    add-int/2addr v1, v7

    const v7, -0x359d3e2a    # -3715189.5f

    add-int/2addr v1, v7

    add-int/2addr v1, v2

    shl-int/lit8 v2, v5, 0x1e

    ushr-int/lit8 v5, v5, 0x2

    or-int/2addr v5, v2

    shl-int/lit8 v2, v1, 0x5

    ushr-int/lit8 v7, v1, 0x1b

    or-int/2addr v2, v7

    invoke-direct {p0, v6, v5, v4}, Lorg/bouncycastle/crypto/digests/SHA1Digest;->h(III)I

    move-result v7

    add-int/2addr v2, v7

    iget-object v7, p0, Lorg/bouncycastle/crypto/digests/SHA1Digest;->f:[I

    add-int/lit8 v8, v9, 0x1

    aget v7, v7, v9

    add-int/2addr v2, v7

    const v7, -0x359d3e2a    # -3715189.5f

    add-int/2addr v2, v7

    add-int/2addr v3, v2

    shl-int/lit8 v2, v6, 0x1e

    ushr-int/lit8 v6, v6, 0x2

    or-int/2addr v6, v2

    shl-int/lit8 v2, v3, 0x5

    ushr-int/lit8 v7, v3, 0x1b

    or-int/2addr v2, v7

    invoke-direct {p0, v1, v6, v5}, Lorg/bouncycastle/crypto/digests/SHA1Digest;->h(III)I

    move-result v7

    add-int/2addr v2, v7

    iget-object v7, p0, Lorg/bouncycastle/crypto/digests/SHA1Digest;->f:[I

    add-int/lit8 v9, v8, 0x1

    aget v7, v7, v8

    add-int/2addr v2, v7

    const v7, -0x359d3e2a    # -3715189.5f

    add-int/2addr v2, v7

    add-int/2addr v4, v2

    shl-int/lit8 v2, v1, 0x1e

    ushr-int/lit8 v1, v1, 0x2

    or-int/2addr v2, v1

    shl-int/lit8 v1, v4, 0x5

    ushr-int/lit8 v7, v4, 0x1b

    or-int/2addr v1, v7

    invoke-direct {p0, v3, v2, v6}, Lorg/bouncycastle/crypto/digests/SHA1Digest;->h(III)I

    move-result v7

    add-int/2addr v1, v7

    iget-object v7, p0, Lorg/bouncycastle/crypto/digests/SHA1Digest;->f:[I

    add-int/lit8 v8, v9, 0x1

    aget v7, v7, v9

    add-int/2addr v1, v7

    const v7, -0x359d3e2a    # -3715189.5f

    add-int/2addr v1, v7

    add-int/2addr v5, v1

    shl-int/lit8 v1, v3, 0x1e

    ushr-int/lit8 v3, v3, 0x2

    or-int/2addr v3, v1

    shl-int/lit8 v1, v5, 0x5

    ushr-int/lit8 v7, v5, 0x1b

    or-int/2addr v1, v7

    invoke-direct {p0, v4, v3, v2}, Lorg/bouncycastle/crypto/digests/SHA1Digest;->h(III)I

    move-result v7

    add-int/2addr v7, v1

    iget-object v9, p0, Lorg/bouncycastle/crypto/digests/SHA1Digest;->f:[I

    add-int/lit8 v1, v8, 0x1

    aget v8, v9, v8

    add-int/2addr v7, v8

    const v8, -0x359d3e2a    # -3715189.5f

    add-int/2addr v7, v8

    add-int/2addr v6, v7

    shl-int/lit8 v7, v4, 0x1e

    ushr-int/lit8 v4, v4, 0x2

    or-int/2addr v4, v7

    add-int/lit8 v0, v0, 0x1

    goto/16 :goto_4

    :cond_4
    iget v0, p0, Lorg/bouncycastle/crypto/digests/SHA1Digest;->a:I

    add-int/2addr v0, v6

    iput v0, p0, Lorg/bouncycastle/crypto/digests/SHA1Digest;->a:I

    iget v0, p0, Lorg/bouncycastle/crypto/digests/SHA1Digest;->b:I

    add-int/2addr v0, v5

    iput v0, p0, Lorg/bouncycastle/crypto/digests/SHA1Digest;->b:I

    iget v0, p0, Lorg/bouncycastle/crypto/digests/SHA1Digest;->c:I

    add-int/2addr v0, v4

    iput v0, p0, Lorg/bouncycastle/crypto/digests/SHA1Digest;->c:I

    iget v0, p0, Lorg/bouncycastle/crypto/digests/SHA1Digest;->d:I

    add-int/2addr v0, v3

    iput v0, p0, Lorg/bouncycastle/crypto/digests/SHA1Digest;->d:I

    iget v0, p0, Lorg/bouncycastle/crypto/digests/SHA1Digest;->e:I

    add-int/2addr v0, v2

    iput v0, p0, Lorg/bouncycastle/crypto/digests/SHA1Digest;->e:I

    const/4 v0, 0x0

    iput v0, p0, Lorg/bouncycastle/crypto/digests/SHA1Digest;->g:I

    const/4 v0, 0x0

    :goto_5
    const/16 v1, 0x10

    if-ge v0, v1, :cond_5

    iget-object v1, p0, Lorg/bouncycastle/crypto/digests/SHA1Digest;->f:[I

    const/4 v2, 0x0

    aput v2, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_5

    :cond_5
    return-void
.end method

.method protected processLength(J)V
    .locals 5

    const/16 v4, 0xe

    iget v0, p0, Lorg/bouncycastle/crypto/digests/SHA1Digest;->g:I

    if-le v0, v4, :cond_0

    invoke-virtual {p0}, Lorg/bouncycastle/crypto/digests/SHA1Digest;->processBlock()V

    :cond_0
    iget-object v0, p0, Lorg/bouncycastle/crypto/digests/SHA1Digest;->f:[I

    const/16 v1, 0x20

    ushr-long v2, p1, v1

    long-to-int v1, v2

    aput v1, v0, v4

    iget-object v0, p0, Lorg/bouncycastle/crypto/digests/SHA1Digest;->f:[I

    const/16 v1, 0xf

    const-wide/16 v2, -0x1

    and-long/2addr v2, p1

    long-to-int v2, v2

    aput v2, v0, v1

    return-void
.end method

.method protected processWord([BI)V
    .locals 3

    aget-byte v0, p1, p2

    shl-int/lit8 v0, v0, 0x18

    add-int/lit8 v1, p2, 0x1

    aget-byte v2, p1, v1

    and-int/lit16 v2, v2, 0xff

    shl-int/lit8 v2, v2, 0x10

    or-int/2addr v0, v2

    add-int/lit8 v1, v1, 0x1

    aget-byte v2, p1, v1

    and-int/lit16 v2, v2, 0xff

    shl-int/lit8 v2, v2, 0x8

    or-int/2addr v0, v2

    add-int/lit8 v1, v1, 0x1

    aget-byte v1, p1, v1

    and-int/lit16 v1, v1, 0xff

    or-int/2addr v0, v1

    iget-object v1, p0, Lorg/bouncycastle/crypto/digests/SHA1Digest;->f:[I

    iget v2, p0, Lorg/bouncycastle/crypto/digests/SHA1Digest;->g:I

    aput v0, v1, v2

    iget v0, p0, Lorg/bouncycastle/crypto/digests/SHA1Digest;->g:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lorg/bouncycastle/crypto/digests/SHA1Digest;->g:I

    const/16 v1, 0x10

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Lorg/bouncycastle/crypto/digests/SHA1Digest;->processBlock()V

    :cond_0
    return-void
.end method

.method public reset()V
    .locals 3

    const/4 v1, 0x0

    invoke-super {p0}, Lorg/bouncycastle/crypto/digests/GeneralDigest;->reset()V

    const v0, 0x67452301

    iput v0, p0, Lorg/bouncycastle/crypto/digests/SHA1Digest;->a:I

    const v0, -0x10325477

    iput v0, p0, Lorg/bouncycastle/crypto/digests/SHA1Digest;->b:I

    const v0, -0x67452302

    iput v0, p0, Lorg/bouncycastle/crypto/digests/SHA1Digest;->c:I

    const v0, 0x10325476

    iput v0, p0, Lorg/bouncycastle/crypto/digests/SHA1Digest;->d:I

    const v0, -0x3c2d1e10

    iput v0, p0, Lorg/bouncycastle/crypto/digests/SHA1Digest;->e:I

    iput v1, p0, Lorg/bouncycastle/crypto/digests/SHA1Digest;->g:I

    move v0, v1

    :goto_0
    iget-object v2, p0, Lorg/bouncycastle/crypto/digests/SHA1Digest;->f:[I

    array-length v2, v2

    if-eq v0, v2, :cond_0

    iget-object v2, p0, Lorg/bouncycastle/crypto/digests/SHA1Digest;->f:[I

    aput v1, v2, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method
