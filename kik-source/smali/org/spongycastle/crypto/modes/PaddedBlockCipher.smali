.class public Lorg/spongycastle/crypto/modes/PaddedBlockCipher;
.super Lorg/spongycastle/crypto/BufferedBlockCipher;
.source "SourceFile"


# virtual methods
.method public final a(I)I
    .locals 2

    .prologue
    .line 72
    iget v0, p0, Lorg/spongycastle/crypto/modes/PaddedBlockCipher;->b:I

    add-int/2addr v0, p1

    .line 73
    iget-object v1, p0, Lorg/spongycastle/crypto/modes/PaddedBlockCipher;->a:[B

    array-length v1, v1

    rem-int v1, v0, v1

    .line 75
    if-nez v1, :cond_0

    .line 77
    iget-object v1, p0, Lorg/spongycastle/crypto/modes/PaddedBlockCipher;->a:[B

    array-length v1, v1

    sub-int/2addr v0, v1

    .line 80
    :goto_0
    return v0

    :cond_0
    sub-int/2addr v0, v1

    goto :goto_0
.end method

.method public final a([BI)I
    .locals 6

    .prologue
    const/4 v1, 0x0

    .line 193
    iget-object v0, p0, Lorg/spongycastle/crypto/modes/PaddedBlockCipher;->d:Lorg/spongycastle/crypto/BlockCipher;

    invoke-interface {v0}, Lorg/spongycastle/crypto/BlockCipher;->b()I

    move-result v2

    .line 196
    iget-boolean v0, p0, Lorg/spongycastle/crypto/modes/PaddedBlockCipher;->c:Z

    if-eqz v0, :cond_2

    .line 198
    iget v0, p0, Lorg/spongycastle/crypto/modes/PaddedBlockCipher;->b:I

    if-ne v0, v2, :cond_6

    .line 200
    mul-int/lit8 v0, v2, 0x2

    add-int/2addr v0, p2

    array-length v3, p1

    if-le v0, v3, :cond_0

    .line 202
    new-instance v0, Lorg/spongycastle/crypto/DataLengthException;

    const-string v1, "output buffer too short"

    invoke-direct {v0, v1}, Lorg/spongycastle/crypto/DataLengthException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 205
    :cond_0
    iget-object v0, p0, Lorg/spongycastle/crypto/modes/PaddedBlockCipher;->d:Lorg/spongycastle/crypto/BlockCipher;

    iget-object v3, p0, Lorg/spongycastle/crypto/modes/PaddedBlockCipher;->a:[B

    invoke-interface {v0, v3, v1, p1, p2}, Lorg/spongycastle/crypto/BlockCipher;->a([BI[BI)I

    move-result v0

    .line 206
    iput v1, p0, Lorg/spongycastle/crypto/modes/PaddedBlockCipher;->b:I

    .line 212
    :goto_0
    iget v3, p0, Lorg/spongycastle/crypto/modes/PaddedBlockCipher;->b:I

    sub-int v3, v2, v3

    int-to-byte v3, v3

    .line 214
    :goto_1
    iget v4, p0, Lorg/spongycastle/crypto/modes/PaddedBlockCipher;->b:I

    if-ge v4, v2, :cond_1

    .line 216
    iget-object v4, p0, Lorg/spongycastle/crypto/modes/PaddedBlockCipher;->a:[B

    iget v5, p0, Lorg/spongycastle/crypto/modes/PaddedBlockCipher;->b:I

    aput-byte v3, v4, v5

    .line 217
    iget v4, p0, Lorg/spongycastle/crypto/modes/PaddedBlockCipher;->b:I

    add-int/lit8 v4, v4, 0x1

    iput v4, p0, Lorg/spongycastle/crypto/modes/PaddedBlockCipher;->b:I

    goto :goto_1

    .line 220
    :cond_1
    iget-object v2, p0, Lorg/spongycastle/crypto/modes/PaddedBlockCipher;->d:Lorg/spongycastle/crypto/BlockCipher;

    iget-object v3, p0, Lorg/spongycastle/crypto/modes/PaddedBlockCipher;->a:[B

    add-int v4, p2, v0

    invoke-interface {v2, v3, v1, p1, v4}, Lorg/spongycastle/crypto/BlockCipher;->a([BI[BI)I

    move-result v1

    add-int/2addr v0, v1

    .line 249
    :goto_2
    invoke-virtual {p0}, Lorg/spongycastle/crypto/modes/PaddedBlockCipher;->c()V

    .line 251
    return v0

    .line 224
    :cond_2
    iget v0, p0, Lorg/spongycastle/crypto/modes/PaddedBlockCipher;->b:I

    if-ne v0, v2, :cond_4

    .line 226
    iget-object v0, p0, Lorg/spongycastle/crypto/modes/PaddedBlockCipher;->d:Lorg/spongycastle/crypto/BlockCipher;

    iget-object v3, p0, Lorg/spongycastle/crypto/modes/PaddedBlockCipher;->a:[B

    iget-object v4, p0, Lorg/spongycastle/crypto/modes/PaddedBlockCipher;->a:[B

    invoke-interface {v0, v3, v1, v4, v1}, Lorg/spongycastle/crypto/BlockCipher;->a([BI[BI)I

    move-result v0

    .line 227
    iput v1, p0, Lorg/spongycastle/crypto/modes/PaddedBlockCipher;->b:I

    .line 237
    iget-object v3, p0, Lorg/spongycastle/crypto/modes/PaddedBlockCipher;->a:[B

    add-int/lit8 v4, v2, -0x1

    aget-byte v3, v3, v4

    and-int/lit16 v3, v3, 0xff

    .line 239
    if-ltz v3, :cond_3

    if-le v3, v2, :cond_5

    .line 241
    :cond_3
    new-instance v0, Lorg/spongycastle/crypto/InvalidCipherTextException;

    const-string v1, "pad block corrupted"

    invoke-direct {v0, v1}, Lorg/spongycastle/crypto/InvalidCipherTextException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 231
    :cond_4
    new-instance v0, Lorg/spongycastle/crypto/DataLengthException;

    const-string v1, "last block incomplete in decryption"

    invoke-direct {v0, v1}, Lorg/spongycastle/crypto/DataLengthException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 244
    :cond_5
    sub-int/2addr v0, v3

    .line 246
    iget-object v2, p0, Lorg/spongycastle/crypto/modes/PaddedBlockCipher;->a:[B

    invoke-static {v2, v1, p1, p2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_2

    :cond_6
    move v0, v1

    goto :goto_0
.end method

.method public final a([BII[BI)I
    .locals 6

    .prologue
    const/4 v1, 0x0

    .line 130
    if-gez p3, :cond_0

    .line 132
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Can\'t have a negative input length!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 135
    :cond_0
    invoke-virtual {p0}, Lorg/spongycastle/crypto/modes/PaddedBlockCipher;->b()I

    move-result v3

    .line 136
    invoke-virtual {p0, p3}, Lorg/spongycastle/crypto/modes/PaddedBlockCipher;->a(I)I

    move-result v0

    .line 138
    if-lez v0, :cond_1

    .line 140
    add-int/2addr v0, p5

    array-length v2, p4

    if-le v0, v2, :cond_1

    .line 142
    new-instance v0, Lorg/spongycastle/crypto/DataLengthException;

    const-string v1, "output buffer too short"

    invoke-direct {v0, v1}, Lorg/spongycastle/crypto/DataLengthException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 147
    :cond_1
    iget-object v0, p0, Lorg/spongycastle/crypto/modes/PaddedBlockCipher;->a:[B

    array-length v0, v0

    iget v2, p0, Lorg/spongycastle/crypto/modes/PaddedBlockCipher;->b:I

    sub-int v2, v0, v2

    .line 149
    if-le p3, v2, :cond_2

    .line 151
    iget-object v0, p0, Lorg/spongycastle/crypto/modes/PaddedBlockCipher;->a:[B

    iget v4, p0, Lorg/spongycastle/crypto/modes/PaddedBlockCipher;->b:I

    invoke-static {p1, p2, v0, v4, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 153
    iget-object v0, p0, Lorg/spongycastle/crypto/modes/PaddedBlockCipher;->d:Lorg/spongycastle/crypto/BlockCipher;

    iget-object v4, p0, Lorg/spongycastle/crypto/modes/PaddedBlockCipher;->a:[B

    invoke-interface {v0, v4, v1, p4, p5}, Lorg/spongycastle/crypto/BlockCipher;->a([BI[BI)I

    move-result v0

    add-int/lit8 v0, v0, 0x0

    .line 155
    iput v1, p0, Lorg/spongycastle/crypto/modes/PaddedBlockCipher;->b:I

    .line 156
    sub-int v1, p3, v2

    .line 157
    add-int/2addr v2, p2

    .line 159
    :goto_0
    iget-object v4, p0, Lorg/spongycastle/crypto/modes/PaddedBlockCipher;->a:[B

    array-length v4, v4

    if-le v1, v4, :cond_3

    .line 161
    iget-object v4, p0, Lorg/spongycastle/crypto/modes/PaddedBlockCipher;->d:Lorg/spongycastle/crypto/BlockCipher;

    add-int v5, p5, v0

    invoke-interface {v4, p1, v2, p4, v5}, Lorg/spongycastle/crypto/BlockCipher;->a([BI[BI)I

    move-result v4

    add-int/2addr v0, v4

    .line 163
    sub-int/2addr v1, v3

    .line 164
    add-int/2addr v2, v3

    goto :goto_0

    :cond_2
    move v0, v1

    move v2, p2

    move v1, p3

    .line 168
    :cond_3
    iget-object v3, p0, Lorg/spongycastle/crypto/modes/PaddedBlockCipher;->a:[B

    iget v4, p0, Lorg/spongycastle/crypto/modes/PaddedBlockCipher;->b:I

    invoke-static {p1, v2, v3, v4, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 170
    iget v2, p0, Lorg/spongycastle/crypto/modes/PaddedBlockCipher;->b:I

    add-int/2addr v1, v2

    iput v1, p0, Lorg/spongycastle/crypto/modes/PaddedBlockCipher;->b:I

    .line 172
    return v0
.end method

.method public final b(I)I
    .locals 2

    .prologue
    .line 45
    iget v0, p0, Lorg/spongycastle/crypto/modes/PaddedBlockCipher;->b:I

    add-int/2addr v0, p1

    .line 46
    iget-object v1, p0, Lorg/spongycastle/crypto/modes/PaddedBlockCipher;->a:[B

    array-length v1, v1

    rem-int v1, v0, v1

    .line 48
    if-nez v1, :cond_1

    .line 50
    iget-boolean v1, p0, Lorg/spongycastle/crypto/modes/PaddedBlockCipher;->c:Z

    if-eqz v1, :cond_0

    .line 52
    iget-object v1, p0, Lorg/spongycastle/crypto/modes/PaddedBlockCipher;->a:[B

    array-length v1, v1

    add-int/2addr v0, v1

    .line 58
    :cond_0
    :goto_0
    return v0

    :cond_1
    sub-int/2addr v0, v1

    iget-object v1, p0, Lorg/spongycastle/crypto/modes/PaddedBlockCipher;->a:[B

    array-length v1, v1

    add-int/2addr v0, v1

    goto :goto_0
.end method
