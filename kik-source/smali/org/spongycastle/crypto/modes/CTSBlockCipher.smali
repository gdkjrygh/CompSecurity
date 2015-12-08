.class public Lorg/spongycastle/crypto/modes/CTSBlockCipher;
.super Lorg/spongycastle/crypto/BufferedBlockCipher;
.source "SourceFile"


# instance fields
.field private g:I


# direct methods
.method public constructor <init>(Lorg/spongycastle/crypto/BlockCipher;)V
    .locals 2

    .prologue
    .line 24
    invoke-direct {p0}, Lorg/spongycastle/crypto/BufferedBlockCipher;-><init>()V

    .line 25
    instance-of v0, p1, Lorg/spongycastle/crypto/modes/OFBBlockCipher;

    if-nez v0, :cond_0

    instance-of v0, p1, Lorg/spongycastle/crypto/modes/CFBBlockCipher;

    if-eqz v0, :cond_1

    .line 27
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "CTSBlockCipher can only accept ECB, or CBC ciphers"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 30
    :cond_1
    iput-object p1, p0, Lorg/spongycastle/crypto/modes/CTSBlockCipher;->d:Lorg/spongycastle/crypto/BlockCipher;

    .line 32
    invoke-interface {p1}, Lorg/spongycastle/crypto/BlockCipher;->b()I

    move-result v0

    iput v0, p0, Lorg/spongycastle/crypto/modes/CTSBlockCipher;->g:I

    .line 34
    iget v0, p0, Lorg/spongycastle/crypto/modes/CTSBlockCipher;->g:I

    mul-int/lit8 v0, v0, 0x2

    new-array v0, v0, [B

    iput-object v0, p0, Lorg/spongycastle/crypto/modes/CTSBlockCipher;->a:[B

    .line 35
    const/4 v0, 0x0

    iput v0, p0, Lorg/spongycastle/crypto/modes/CTSBlockCipher;->b:I

    .line 36
    return-void
.end method


# virtual methods
.method public final a(I)I
    .locals 2

    .prologue
    .line 49
    iget v0, p0, Lorg/spongycastle/crypto/modes/CTSBlockCipher;->b:I

    add-int/2addr v0, p1

    .line 50
    iget-object v1, p0, Lorg/spongycastle/crypto/modes/CTSBlockCipher;->a:[B

    array-length v1, v1

    rem-int v1, v0, v1

    .line 52
    if-nez v1, :cond_0

    .line 54
    iget-object v1, p0, Lorg/spongycastle/crypto/modes/CTSBlockCipher;->a:[B

    array-length v1, v1

    sub-int/2addr v0, v1

    .line 57
    :goto_0
    return v0

    :cond_0
    sub-int/2addr v0, v1

    goto :goto_0
.end method

.method public final a([BI)I
    .locals 9

    .prologue
    const/4 v8, 0x0

    .line 192
    iget v0, p0, Lorg/spongycastle/crypto/modes/CTSBlockCipher;->b:I

    add-int/2addr v0, p2

    array-length v1, p1

    if-le v0, v1, :cond_0

    .line 194
    new-instance v0, Lorg/spongycastle/crypto/DataLengthException;

    const-string v1, "output buffer to small in doFinal"

    invoke-direct {v0, v1}, Lorg/spongycastle/crypto/DataLengthException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 197
    :cond_0
    iget-object v0, p0, Lorg/spongycastle/crypto/modes/CTSBlockCipher;->d:Lorg/spongycastle/crypto/BlockCipher;

    invoke-interface {v0}, Lorg/spongycastle/crypto/BlockCipher;->b()I

    move-result v1

    .line 198
    iget v0, p0, Lorg/spongycastle/crypto/modes/CTSBlockCipher;->b:I

    sub-int v2, v0, v1

    .line 199
    new-array v3, v1, [B

    .line 201
    iget-boolean v0, p0, Lorg/spongycastle/crypto/modes/CTSBlockCipher;->c:Z

    if-eqz v0, :cond_5

    .line 203
    iget-object v0, p0, Lorg/spongycastle/crypto/modes/CTSBlockCipher;->d:Lorg/spongycastle/crypto/BlockCipher;

    iget-object v4, p0, Lorg/spongycastle/crypto/modes/CTSBlockCipher;->a:[B

    invoke-interface {v0, v4, v8, v3, v8}, Lorg/spongycastle/crypto/BlockCipher;->a([BI[BI)I

    .line 205
    iget v0, p0, Lorg/spongycastle/crypto/modes/CTSBlockCipher;->b:I

    if-ge v0, v1, :cond_1

    .line 207
    new-instance v0, Lorg/spongycastle/crypto/DataLengthException;

    const-string v1, "need at least one block of input for CTS"

    invoke-direct {v0, v1}, Lorg/spongycastle/crypto/DataLengthException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 210
    :cond_1
    iget v0, p0, Lorg/spongycastle/crypto/modes/CTSBlockCipher;->b:I

    :goto_0
    iget-object v4, p0, Lorg/spongycastle/crypto/modes/CTSBlockCipher;->a:[B

    array-length v4, v4

    if-eq v0, v4, :cond_2

    .line 212
    iget-object v4, p0, Lorg/spongycastle/crypto/modes/CTSBlockCipher;->a:[B

    sub-int v5, v0, v1

    aget-byte v5, v3, v5

    aput-byte v5, v4, v0

    .line 210
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    move v0, v1

    .line 215
    :goto_1
    iget v4, p0, Lorg/spongycastle/crypto/modes/CTSBlockCipher;->b:I

    if-eq v0, v4, :cond_3

    .line 217
    iget-object v4, p0, Lorg/spongycastle/crypto/modes/CTSBlockCipher;->a:[B

    aget-byte v5, v4, v0

    sub-int v6, v0, v1

    aget-byte v6, v3, v6

    xor-int/2addr v5, v6

    int-to-byte v5, v5

    aput-byte v5, v4, v0

    .line 215
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 220
    :cond_3
    iget-object v0, p0, Lorg/spongycastle/crypto/modes/CTSBlockCipher;->d:Lorg/spongycastle/crypto/BlockCipher;

    instance-of v0, v0, Lorg/spongycastle/crypto/modes/CBCBlockCipher;

    if-eqz v0, :cond_4

    .line 222
    iget-object v0, p0, Lorg/spongycastle/crypto/modes/CTSBlockCipher;->d:Lorg/spongycastle/crypto/BlockCipher;

    check-cast v0, Lorg/spongycastle/crypto/modes/CBCBlockCipher;

    invoke-virtual {v0}, Lorg/spongycastle/crypto/modes/CBCBlockCipher;->d()Lorg/spongycastle/crypto/BlockCipher;

    move-result-object v0

    .line 224
    iget-object v4, p0, Lorg/spongycastle/crypto/modes/CTSBlockCipher;->a:[B

    invoke-interface {v0, v4, v1, p1, p2}, Lorg/spongycastle/crypto/BlockCipher;->a([BI[BI)I

    .line 231
    :goto_2
    add-int v0, p2, v1

    invoke-static {v3, v8, p1, v0, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 259
    :goto_3
    iget v0, p0, Lorg/spongycastle/crypto/modes/CTSBlockCipher;->b:I

    .line 261
    invoke-virtual {p0}, Lorg/spongycastle/crypto/modes/CTSBlockCipher;->c()V

    .line 263
    return v0

    .line 228
    :cond_4
    iget-object v0, p0, Lorg/spongycastle/crypto/modes/CTSBlockCipher;->d:Lorg/spongycastle/crypto/BlockCipher;

    iget-object v4, p0, Lorg/spongycastle/crypto/modes/CTSBlockCipher;->a:[B

    invoke-interface {v0, v4, v1, p1, p2}, Lorg/spongycastle/crypto/BlockCipher;->a([BI[BI)I

    goto :goto_2

    .line 235
    :cond_5
    new-array v4, v1, [B

    .line 237
    iget-object v0, p0, Lorg/spongycastle/crypto/modes/CTSBlockCipher;->d:Lorg/spongycastle/crypto/BlockCipher;

    instance-of v0, v0, Lorg/spongycastle/crypto/modes/CBCBlockCipher;

    if-eqz v0, :cond_6

    .line 239
    iget-object v0, p0, Lorg/spongycastle/crypto/modes/CTSBlockCipher;->d:Lorg/spongycastle/crypto/BlockCipher;

    check-cast v0, Lorg/spongycastle/crypto/modes/CBCBlockCipher;

    invoke-virtual {v0}, Lorg/spongycastle/crypto/modes/CBCBlockCipher;->d()Lorg/spongycastle/crypto/BlockCipher;

    move-result-object v0

    .line 241
    iget-object v5, p0, Lorg/spongycastle/crypto/modes/CTSBlockCipher;->a:[B

    invoke-interface {v0, v5, v8, v3, v8}, Lorg/spongycastle/crypto/BlockCipher;->a([BI[BI)I

    :goto_4
    move v0, v1

    .line 248
    :goto_5
    iget v5, p0, Lorg/spongycastle/crypto/modes/CTSBlockCipher;->b:I

    if-eq v0, v5, :cond_7

    .line 250
    sub-int v5, v0, v1

    sub-int v6, v0, v1

    aget-byte v6, v3, v6

    iget-object v7, p0, Lorg/spongycastle/crypto/modes/CTSBlockCipher;->a:[B

    aget-byte v7, v7, v0

    xor-int/2addr v6, v7

    int-to-byte v6, v6

    aput-byte v6, v4, v5

    .line 248
    add-int/lit8 v0, v0, 0x1

    goto :goto_5

    .line 245
    :cond_6
    iget-object v0, p0, Lorg/spongycastle/crypto/modes/CTSBlockCipher;->d:Lorg/spongycastle/crypto/BlockCipher;

    iget-object v5, p0, Lorg/spongycastle/crypto/modes/CTSBlockCipher;->a:[B

    invoke-interface {v0, v5, v8, v3, v8}, Lorg/spongycastle/crypto/BlockCipher;->a([BI[BI)I

    goto :goto_4

    .line 253
    :cond_7
    iget-object v0, p0, Lorg/spongycastle/crypto/modes/CTSBlockCipher;->a:[B

    invoke-static {v0, v1, v3, v8, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 255
    iget-object v0, p0, Lorg/spongycastle/crypto/modes/CTSBlockCipher;->d:Lorg/spongycastle/crypto/BlockCipher;

    invoke-interface {v0, v3, v8, p1, p2}, Lorg/spongycastle/crypto/BlockCipher;->a([BI[BI)I

    .line 256
    add-int v0, p2, v1

    invoke-static {v4, v8, p1, v0, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_3
.end method

.method public final a([BII[BI)I
    .locals 6

    .prologue
    const/4 v1, 0x0

    .line 125
    if-gez p3, :cond_0

    .line 127
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Can\'t have a negative input length!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 130
    :cond_0
    invoke-virtual {p0}, Lorg/spongycastle/crypto/modes/CTSBlockCipher;->b()I

    move-result v2

    .line 131
    invoke-virtual {p0, p3}, Lorg/spongycastle/crypto/modes/CTSBlockCipher;->a(I)I

    move-result v0

    .line 133
    if-lez v0, :cond_1

    .line 135
    add-int/2addr v0, p5

    array-length v3, p4

    if-le v0, v3, :cond_1

    .line 137
    new-instance v0, Lorg/spongycastle/crypto/DataLengthException;

    const-string v1, "output buffer too short"

    invoke-direct {v0, v1}, Lorg/spongycastle/crypto/DataLengthException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 142
    :cond_1
    iget-object v0, p0, Lorg/spongycastle/crypto/modes/CTSBlockCipher;->a:[B

    array-length v0, v0

    iget v3, p0, Lorg/spongycastle/crypto/modes/CTSBlockCipher;->b:I

    sub-int v3, v0, v3

    .line 144
    if-le p3, v3, :cond_2

    .line 146
    iget-object v0, p0, Lorg/spongycastle/crypto/modes/CTSBlockCipher;->a:[B

    iget v4, p0, Lorg/spongycastle/crypto/modes/CTSBlockCipher;->b:I

    invoke-static {p1, p2, v0, v4, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 148
    iget-object v0, p0, Lorg/spongycastle/crypto/modes/CTSBlockCipher;->d:Lorg/spongycastle/crypto/BlockCipher;

    iget-object v4, p0, Lorg/spongycastle/crypto/modes/CTSBlockCipher;->a:[B

    invoke-interface {v0, v4, v1, p4, p5}, Lorg/spongycastle/crypto/BlockCipher;->a([BI[BI)I

    move-result v0

    add-int/lit8 v0, v0, 0x0

    .line 149
    iget-object v4, p0, Lorg/spongycastle/crypto/modes/CTSBlockCipher;->a:[B

    iget-object v5, p0, Lorg/spongycastle/crypto/modes/CTSBlockCipher;->a:[B

    invoke-static {v4, v2, v5, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 151
    iput v2, p0, Lorg/spongycastle/crypto/modes/CTSBlockCipher;->b:I

    .line 153
    sub-int/2addr p3, v3

    .line 154
    add-int/2addr p2, v3

    .line 156
    :goto_0
    if-le p3, v2, :cond_3

    .line 158
    iget-object v3, p0, Lorg/spongycastle/crypto/modes/CTSBlockCipher;->a:[B

    iget v4, p0, Lorg/spongycastle/crypto/modes/CTSBlockCipher;->b:I

    invoke-static {p1, p2, v3, v4, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 159
    iget-object v3, p0, Lorg/spongycastle/crypto/modes/CTSBlockCipher;->d:Lorg/spongycastle/crypto/BlockCipher;

    iget-object v4, p0, Lorg/spongycastle/crypto/modes/CTSBlockCipher;->a:[B

    add-int v5, p5, v0

    invoke-interface {v3, v4, v1, p4, v5}, Lorg/spongycastle/crypto/BlockCipher;->a([BI[BI)I

    move-result v3

    add-int/2addr v0, v3

    .line 160
    iget-object v3, p0, Lorg/spongycastle/crypto/modes/CTSBlockCipher;->a:[B

    iget-object v4, p0, Lorg/spongycastle/crypto/modes/CTSBlockCipher;->a:[B

    invoke-static {v3, v2, v4, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 162
    sub-int/2addr p3, v2

    .line 163
    add-int/2addr p2, v2

    goto :goto_0

    :cond_2
    move v0, v1

    .line 167
    :cond_3
    iget-object v1, p0, Lorg/spongycastle/crypto/modes/CTSBlockCipher;->a:[B

    iget v2, p0, Lorg/spongycastle/crypto/modes/CTSBlockCipher;->b:I

    invoke-static {p1, p2, v1, v2, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 169
    iget v1, p0, Lorg/spongycastle/crypto/modes/CTSBlockCipher;->b:I

    add-int/2addr v1, p3

    iput v1, p0, Lorg/spongycastle/crypto/modes/CTSBlockCipher;->b:I

    .line 171
    return v0
.end method

.method public final b(I)I
    .locals 1

    .prologue
    .line 71
    iget v0, p0, Lorg/spongycastle/crypto/modes/CTSBlockCipher;->b:I

    add-int/2addr v0, p1

    return v0
.end method
