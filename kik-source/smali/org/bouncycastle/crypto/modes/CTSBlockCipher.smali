.class public Lorg/bouncycastle/crypto/modes/CTSBlockCipher;
.super Lorg/bouncycastle/crypto/BufferedBlockCipher;


# instance fields
.field private g:I


# direct methods
.method public constructor <init>(Lorg/bouncycastle/crypto/BlockCipher;)V
    .locals 2

    invoke-direct {p0}, Lorg/bouncycastle/crypto/BufferedBlockCipher;-><init>()V

    instance-of v0, p1, Lorg/bouncycastle/crypto/modes/OFBBlockCipher;

    if-nez v0, :cond_0

    instance-of v0, p1, Lorg/bouncycastle/crypto/modes/CFBBlockCipher;

    if-eqz v0, :cond_1

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "CTSBlockCipher can only accept ECB, or CBC ciphers"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iput-object p1, p0, Lorg/bouncycastle/crypto/modes/CTSBlockCipher;->d:Lorg/bouncycastle/crypto/BlockCipher;

    invoke-interface {p1}, Lorg/bouncycastle/crypto/BlockCipher;->getBlockSize()I

    move-result v0

    iput v0, p0, Lorg/bouncycastle/crypto/modes/CTSBlockCipher;->g:I

    iget v0, p0, Lorg/bouncycastle/crypto/modes/CTSBlockCipher;->g:I

    mul-int/lit8 v0, v0, 0x2

    new-array v0, v0, [B

    iput-object v0, p0, Lorg/bouncycastle/crypto/modes/CTSBlockCipher;->a:[B

    const/4 v0, 0x0

    iput v0, p0, Lorg/bouncycastle/crypto/modes/CTSBlockCipher;->b:I

    return-void
.end method


# virtual methods
.method public doFinal([BI)I
    .locals 9

    const/4 v8, 0x0

    iget v0, p0, Lorg/bouncycastle/crypto/modes/CTSBlockCipher;->b:I

    add-int/2addr v0, p2

    array-length v1, p1

    if-le v0, v1, :cond_0

    new-instance v0, Lorg/bouncycastle/crypto/DataLengthException;

    const-string v1, "output buffer to small in doFinal"

    invoke-direct {v0, v1}, Lorg/bouncycastle/crypto/DataLengthException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-object v0, p0, Lorg/bouncycastle/crypto/modes/CTSBlockCipher;->d:Lorg/bouncycastle/crypto/BlockCipher;

    invoke-interface {v0}, Lorg/bouncycastle/crypto/BlockCipher;->getBlockSize()I

    move-result v1

    iget v0, p0, Lorg/bouncycastle/crypto/modes/CTSBlockCipher;->b:I

    sub-int v2, v0, v1

    new-array v3, v1, [B

    iget-boolean v0, p0, Lorg/bouncycastle/crypto/modes/CTSBlockCipher;->c:Z

    if-eqz v0, :cond_5

    iget-object v0, p0, Lorg/bouncycastle/crypto/modes/CTSBlockCipher;->d:Lorg/bouncycastle/crypto/BlockCipher;

    iget-object v4, p0, Lorg/bouncycastle/crypto/modes/CTSBlockCipher;->a:[B

    invoke-interface {v0, v4, v8, v3, v8}, Lorg/bouncycastle/crypto/BlockCipher;->processBlock([BI[BI)I

    iget v0, p0, Lorg/bouncycastle/crypto/modes/CTSBlockCipher;->b:I

    if-ge v0, v1, :cond_1

    new-instance v0, Lorg/bouncycastle/crypto/DataLengthException;

    const-string v1, "need at least one block of input for CTS"

    invoke-direct {v0, v1}, Lorg/bouncycastle/crypto/DataLengthException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget v0, p0, Lorg/bouncycastle/crypto/modes/CTSBlockCipher;->b:I

    :goto_0
    iget-object v4, p0, Lorg/bouncycastle/crypto/modes/CTSBlockCipher;->a:[B

    array-length v4, v4

    if-eq v0, v4, :cond_2

    iget-object v4, p0, Lorg/bouncycastle/crypto/modes/CTSBlockCipher;->a:[B

    sub-int v5, v0, v1

    aget-byte v5, v3, v5

    aput-byte v5, v4, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    move v0, v1

    :goto_1
    iget v4, p0, Lorg/bouncycastle/crypto/modes/CTSBlockCipher;->b:I

    if-eq v0, v4, :cond_3

    iget-object v4, p0, Lorg/bouncycastle/crypto/modes/CTSBlockCipher;->a:[B

    aget-byte v5, v4, v0

    sub-int v6, v0, v1

    aget-byte v6, v3, v6

    xor-int/2addr v5, v6

    int-to-byte v5, v5

    aput-byte v5, v4, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_3
    iget-object v0, p0, Lorg/bouncycastle/crypto/modes/CTSBlockCipher;->d:Lorg/bouncycastle/crypto/BlockCipher;

    instance-of v0, v0, Lorg/bouncycastle/crypto/modes/CBCBlockCipher;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lorg/bouncycastle/crypto/modes/CTSBlockCipher;->d:Lorg/bouncycastle/crypto/BlockCipher;

    check-cast v0, Lorg/bouncycastle/crypto/modes/CBCBlockCipher;

    invoke-virtual {v0}, Lorg/bouncycastle/crypto/modes/CBCBlockCipher;->getUnderlyingCipher()Lorg/bouncycastle/crypto/BlockCipher;

    move-result-object v0

    iget-object v4, p0, Lorg/bouncycastle/crypto/modes/CTSBlockCipher;->a:[B

    invoke-interface {v0, v4, v1, p1, p2}, Lorg/bouncycastle/crypto/BlockCipher;->processBlock([BI[BI)I

    :goto_2
    add-int v0, p2, v1

    invoke-static {v3, v8, p1, v0, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :goto_3
    iget v0, p0, Lorg/bouncycastle/crypto/modes/CTSBlockCipher;->b:I

    invoke-virtual {p0}, Lorg/bouncycastle/crypto/modes/CTSBlockCipher;->reset()V

    return v0

    :cond_4
    iget-object v0, p0, Lorg/bouncycastle/crypto/modes/CTSBlockCipher;->d:Lorg/bouncycastle/crypto/BlockCipher;

    iget-object v4, p0, Lorg/bouncycastle/crypto/modes/CTSBlockCipher;->a:[B

    invoke-interface {v0, v4, v1, p1, p2}, Lorg/bouncycastle/crypto/BlockCipher;->processBlock([BI[BI)I

    goto :goto_2

    :cond_5
    new-array v4, v1, [B

    iget-object v0, p0, Lorg/bouncycastle/crypto/modes/CTSBlockCipher;->d:Lorg/bouncycastle/crypto/BlockCipher;

    instance-of v0, v0, Lorg/bouncycastle/crypto/modes/CBCBlockCipher;

    if-eqz v0, :cond_6

    iget-object v0, p0, Lorg/bouncycastle/crypto/modes/CTSBlockCipher;->d:Lorg/bouncycastle/crypto/BlockCipher;

    check-cast v0, Lorg/bouncycastle/crypto/modes/CBCBlockCipher;

    invoke-virtual {v0}, Lorg/bouncycastle/crypto/modes/CBCBlockCipher;->getUnderlyingCipher()Lorg/bouncycastle/crypto/BlockCipher;

    move-result-object v0

    iget-object v5, p0, Lorg/bouncycastle/crypto/modes/CTSBlockCipher;->a:[B

    invoke-interface {v0, v5, v8, v3, v8}, Lorg/bouncycastle/crypto/BlockCipher;->processBlock([BI[BI)I

    :goto_4
    move v0, v1

    :goto_5
    iget v5, p0, Lorg/bouncycastle/crypto/modes/CTSBlockCipher;->b:I

    if-eq v0, v5, :cond_7

    sub-int v5, v0, v1

    sub-int v6, v0, v1

    aget-byte v6, v3, v6

    iget-object v7, p0, Lorg/bouncycastle/crypto/modes/CTSBlockCipher;->a:[B

    aget-byte v7, v7, v0

    xor-int/2addr v6, v7

    int-to-byte v6, v6

    aput-byte v6, v4, v5

    add-int/lit8 v0, v0, 0x1

    goto :goto_5

    :cond_6
    iget-object v0, p0, Lorg/bouncycastle/crypto/modes/CTSBlockCipher;->d:Lorg/bouncycastle/crypto/BlockCipher;

    iget-object v5, p0, Lorg/bouncycastle/crypto/modes/CTSBlockCipher;->a:[B

    invoke-interface {v0, v5, v8, v3, v8}, Lorg/bouncycastle/crypto/BlockCipher;->processBlock([BI[BI)I

    goto :goto_4

    :cond_7
    iget-object v0, p0, Lorg/bouncycastle/crypto/modes/CTSBlockCipher;->a:[B

    invoke-static {v0, v1, v3, v8, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v0, p0, Lorg/bouncycastle/crypto/modes/CTSBlockCipher;->d:Lorg/bouncycastle/crypto/BlockCipher;

    invoke-interface {v0, v3, v8, p1, p2}, Lorg/bouncycastle/crypto/BlockCipher;->processBlock([BI[BI)I

    add-int v0, p2, v1

    invoke-static {v4, v8, p1, v0, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_3
.end method

.method public getOutputSize(I)I
    .locals 1

    iget v0, p0, Lorg/bouncycastle/crypto/modes/CTSBlockCipher;->b:I

    add-int/2addr v0, p1

    return v0
.end method

.method public getUpdateOutputSize(I)I
    .locals 2

    iget v0, p0, Lorg/bouncycastle/crypto/modes/CTSBlockCipher;->b:I

    add-int/2addr v0, p1

    iget-object v1, p0, Lorg/bouncycastle/crypto/modes/CTSBlockCipher;->a:[B

    array-length v1, v1

    rem-int v1, v0, v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lorg/bouncycastle/crypto/modes/CTSBlockCipher;->a:[B

    array-length v1, v1

    sub-int/2addr v0, v1

    :goto_0
    return v0

    :cond_0
    sub-int/2addr v0, v1

    goto :goto_0
.end method

.method public processByte(B[BI)I
    .locals 6

    const/4 v1, 0x0

    iget v0, p0, Lorg/bouncycastle/crypto/modes/CTSBlockCipher;->b:I

    iget-object v2, p0, Lorg/bouncycastle/crypto/modes/CTSBlockCipher;->a:[B

    array-length v2, v2

    if-ne v0, v2, :cond_0

    iget-object v0, p0, Lorg/bouncycastle/crypto/modes/CTSBlockCipher;->d:Lorg/bouncycastle/crypto/BlockCipher;

    iget-object v2, p0, Lorg/bouncycastle/crypto/modes/CTSBlockCipher;->a:[B

    invoke-interface {v0, v2, v1, p2, p3}, Lorg/bouncycastle/crypto/BlockCipher;->processBlock([BI[BI)I

    move-result v0

    iget-object v2, p0, Lorg/bouncycastle/crypto/modes/CTSBlockCipher;->a:[B

    iget v3, p0, Lorg/bouncycastle/crypto/modes/CTSBlockCipher;->g:I

    iget-object v4, p0, Lorg/bouncycastle/crypto/modes/CTSBlockCipher;->a:[B

    iget v5, p0, Lorg/bouncycastle/crypto/modes/CTSBlockCipher;->g:I

    invoke-static {v2, v3, v4, v1, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget v1, p0, Lorg/bouncycastle/crypto/modes/CTSBlockCipher;->g:I

    iput v1, p0, Lorg/bouncycastle/crypto/modes/CTSBlockCipher;->b:I

    :goto_0
    iget-object v1, p0, Lorg/bouncycastle/crypto/modes/CTSBlockCipher;->a:[B

    iget v2, p0, Lorg/bouncycastle/crypto/modes/CTSBlockCipher;->b:I

    add-int/lit8 v3, v2, 0x1

    iput v3, p0, Lorg/bouncycastle/crypto/modes/CTSBlockCipher;->b:I

    aput-byte p1, v1, v2

    return v0

    :cond_0
    move v0, v1

    goto :goto_0
.end method

.method public processBytes([BII[BI)I
    .locals 6

    const/4 v1, 0x0

    if-gez p3, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Can\'t have a negative input length!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    invoke-virtual {p0}, Lorg/bouncycastle/crypto/modes/CTSBlockCipher;->getBlockSize()I

    move-result v2

    invoke-virtual {p0, p3}, Lorg/bouncycastle/crypto/modes/CTSBlockCipher;->getUpdateOutputSize(I)I

    move-result v0

    if-lez v0, :cond_1

    add-int/2addr v0, p5

    array-length v3, p4

    if-le v0, v3, :cond_1

    new-instance v0, Lorg/bouncycastle/crypto/DataLengthException;

    const-string v1, "output buffer too short"

    invoke-direct {v0, v1}, Lorg/bouncycastle/crypto/DataLengthException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget-object v0, p0, Lorg/bouncycastle/crypto/modes/CTSBlockCipher;->a:[B

    array-length v0, v0

    iget v3, p0, Lorg/bouncycastle/crypto/modes/CTSBlockCipher;->b:I

    sub-int v3, v0, v3

    if-le p3, v3, :cond_2

    iget-object v0, p0, Lorg/bouncycastle/crypto/modes/CTSBlockCipher;->a:[B

    iget v4, p0, Lorg/bouncycastle/crypto/modes/CTSBlockCipher;->b:I

    invoke-static {p1, p2, v0, v4, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v0, p0, Lorg/bouncycastle/crypto/modes/CTSBlockCipher;->d:Lorg/bouncycastle/crypto/BlockCipher;

    iget-object v4, p0, Lorg/bouncycastle/crypto/modes/CTSBlockCipher;->a:[B

    invoke-interface {v0, v4, v1, p4, p5}, Lorg/bouncycastle/crypto/BlockCipher;->processBlock([BI[BI)I

    move-result v0

    add-int/lit8 v0, v0, 0x0

    iget-object v4, p0, Lorg/bouncycastle/crypto/modes/CTSBlockCipher;->a:[B

    iget-object v5, p0, Lorg/bouncycastle/crypto/modes/CTSBlockCipher;->a:[B

    invoke-static {v4, v2, v5, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput v2, p0, Lorg/bouncycastle/crypto/modes/CTSBlockCipher;->b:I

    sub-int/2addr p3, v3

    add-int/2addr p2, v3

    :goto_0
    if-le p3, v2, :cond_3

    iget-object v3, p0, Lorg/bouncycastle/crypto/modes/CTSBlockCipher;->a:[B

    iget v4, p0, Lorg/bouncycastle/crypto/modes/CTSBlockCipher;->b:I

    invoke-static {p1, p2, v3, v4, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v3, p0, Lorg/bouncycastle/crypto/modes/CTSBlockCipher;->d:Lorg/bouncycastle/crypto/BlockCipher;

    iget-object v4, p0, Lorg/bouncycastle/crypto/modes/CTSBlockCipher;->a:[B

    add-int v5, p5, v0

    invoke-interface {v3, v4, v1, p4, v5}, Lorg/bouncycastle/crypto/BlockCipher;->processBlock([BI[BI)I

    move-result v3

    add-int/2addr v0, v3

    iget-object v3, p0, Lorg/bouncycastle/crypto/modes/CTSBlockCipher;->a:[B

    iget-object v4, p0, Lorg/bouncycastle/crypto/modes/CTSBlockCipher;->a:[B

    invoke-static {v3, v2, v4, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    sub-int/2addr p3, v2

    add-int/2addr p2, v2

    goto :goto_0

    :cond_2
    move v0, v1

    :cond_3
    iget-object v1, p0, Lorg/bouncycastle/crypto/modes/CTSBlockCipher;->a:[B

    iget v2, p0, Lorg/bouncycastle/crypto/modes/CTSBlockCipher;->b:I

    invoke-static {p1, p2, v1, v2, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget v1, p0, Lorg/bouncycastle/crypto/modes/CTSBlockCipher;->b:I

    add-int/2addr v1, p3

    iput v1, p0, Lorg/bouncycastle/crypto/modes/CTSBlockCipher;->b:I

    return v0
.end method
