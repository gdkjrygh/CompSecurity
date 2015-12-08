.class public Lorg/spongycastle/crypto/paddings/PaddedBufferedBlockCipher;
.super Lorg/spongycastle/crypto/BufferedBlockCipher;
.source "SourceFile"


# instance fields
.field g:Lorg/spongycastle/crypto/paddings/BlockCipherPadding;


# direct methods
.method public constructor <init>(Lorg/spongycastle/crypto/BlockCipher;)V
    .locals 1

    .prologue
    .line 47
    new-instance v0, Lorg/spongycastle/crypto/paddings/PKCS7Padding;

    invoke-direct {v0}, Lorg/spongycastle/crypto/paddings/PKCS7Padding;-><init>()V

    invoke-direct {p0, p1, v0}, Lorg/spongycastle/crypto/paddings/PaddedBufferedBlockCipher;-><init>(Lorg/spongycastle/crypto/BlockCipher;Lorg/spongycastle/crypto/paddings/BlockCipherPadding;)V

    .line 48
    return-void
.end method

.method public constructor <init>(Lorg/spongycastle/crypto/BlockCipher;Lorg/spongycastle/crypto/paddings/BlockCipherPadding;)V
    .locals 1

    .prologue
    .line 31
    invoke-direct {p0}, Lorg/spongycastle/crypto/BufferedBlockCipher;-><init>()V

    .line 32
    iput-object p1, p0, Lorg/spongycastle/crypto/paddings/PaddedBufferedBlockCipher;->d:Lorg/spongycastle/crypto/BlockCipher;

    .line 33
    iput-object p2, p0, Lorg/spongycastle/crypto/paddings/PaddedBufferedBlockCipher;->g:Lorg/spongycastle/crypto/paddings/BlockCipherPadding;

    .line 35
    invoke-interface {p1}, Lorg/spongycastle/crypto/BlockCipher;->b()I

    move-result v0

    new-array v0, v0, [B

    iput-object v0, p0, Lorg/spongycastle/crypto/paddings/PaddedBufferedBlockCipher;->a:[B

    .line 36
    const/4 v0, 0x0

    iput v0, p0, Lorg/spongycastle/crypto/paddings/PaddedBufferedBlockCipher;->b:I

    .line 37
    return-void
.end method


# virtual methods
.method public final a(I)I
    .locals 2

    .prologue
    .line 122
    iget v0, p0, Lorg/spongycastle/crypto/paddings/PaddedBufferedBlockCipher;->b:I

    add-int/2addr v0, p1

    .line 123
    iget-object v1, p0, Lorg/spongycastle/crypto/paddings/PaddedBufferedBlockCipher;->a:[B

    array-length v1, v1

    rem-int v1, v0, v1

    .line 125
    if-nez v1, :cond_0

    .line 127
    iget-object v1, p0, Lorg/spongycastle/crypto/paddings/PaddedBufferedBlockCipher;->a:[B

    array-length v1, v1

    sub-int/2addr v0, v1

    .line 130
    :goto_0
    return v0

    :cond_0
    sub-int/2addr v0, v1

    goto :goto_0
.end method

.method public final a([BI)I
    .locals 5

    .prologue
    const/4 v1, 0x0

    .line 246
    iget-object v0, p0, Lorg/spongycastle/crypto/paddings/PaddedBufferedBlockCipher;->d:Lorg/spongycastle/crypto/BlockCipher;

    invoke-interface {v0}, Lorg/spongycastle/crypto/BlockCipher;->b()I

    move-result v0

    .line 249
    iget-boolean v2, p0, Lorg/spongycastle/crypto/paddings/PaddedBufferedBlockCipher;->c:Z

    if-eqz v2, :cond_1

    .line 251
    iget v2, p0, Lorg/spongycastle/crypto/paddings/PaddedBufferedBlockCipher;->b:I

    if-ne v2, v0, :cond_3

    .line 253
    mul-int/lit8 v0, v0, 0x2

    add-int/2addr v0, p2

    array-length v2, p1

    if-le v0, v2, :cond_0

    .line 255
    invoke-virtual {p0}, Lorg/spongycastle/crypto/paddings/PaddedBufferedBlockCipher;->c()V

    .line 257
    new-instance v0, Lorg/spongycastle/crypto/DataLengthException;

    const-string v1, "output buffer too short"

    invoke-direct {v0, v1}, Lorg/spongycastle/crypto/DataLengthException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 260
    :cond_0
    iget-object v0, p0, Lorg/spongycastle/crypto/paddings/PaddedBufferedBlockCipher;->d:Lorg/spongycastle/crypto/BlockCipher;

    iget-object v2, p0, Lorg/spongycastle/crypto/paddings/PaddedBufferedBlockCipher;->a:[B

    invoke-interface {v0, v2, v1, p1, p2}, Lorg/spongycastle/crypto/BlockCipher;->a([BI[BI)I

    move-result v0

    .line 261
    iput v1, p0, Lorg/spongycastle/crypto/paddings/PaddedBufferedBlockCipher;->b:I

    .line 264
    :goto_0
    iget-object v2, p0, Lorg/spongycastle/crypto/paddings/PaddedBufferedBlockCipher;->g:Lorg/spongycastle/crypto/paddings/BlockCipherPadding;

    iget-object v3, p0, Lorg/spongycastle/crypto/paddings/PaddedBufferedBlockCipher;->a:[B

    iget v4, p0, Lorg/spongycastle/crypto/paddings/PaddedBufferedBlockCipher;->b:I

    invoke-interface {v2, v3, v4}, Lorg/spongycastle/crypto/paddings/BlockCipherPadding;->a([BI)I

    .line 266
    iget-object v2, p0, Lorg/spongycastle/crypto/paddings/PaddedBufferedBlockCipher;->d:Lorg/spongycastle/crypto/BlockCipher;

    iget-object v3, p0, Lorg/spongycastle/crypto/paddings/PaddedBufferedBlockCipher;->a:[B

    add-int v4, p2, v0

    invoke-interface {v2, v3, v1, p1, v4}, Lorg/spongycastle/crypto/BlockCipher;->a([BI[BI)I

    move-result v1

    add-int/2addr v0, v1

    .line 268
    invoke-virtual {p0}, Lorg/spongycastle/crypto/paddings/PaddedBufferedBlockCipher;->c()V

    .line 296
    :goto_1
    return v0

    .line 272
    :cond_1
    iget v2, p0, Lorg/spongycastle/crypto/paddings/PaddedBufferedBlockCipher;->b:I

    if-ne v2, v0, :cond_2

    .line 274
    iget-object v0, p0, Lorg/spongycastle/crypto/paddings/PaddedBufferedBlockCipher;->d:Lorg/spongycastle/crypto/BlockCipher;

    iget-object v2, p0, Lorg/spongycastle/crypto/paddings/PaddedBufferedBlockCipher;->a:[B

    iget-object v3, p0, Lorg/spongycastle/crypto/paddings/PaddedBufferedBlockCipher;->a:[B

    invoke-interface {v0, v2, v1, v3, v1}, Lorg/spongycastle/crypto/BlockCipher;->a([BI[BI)I

    move-result v0

    .line 275
    iput v1, p0, Lorg/spongycastle/crypto/paddings/PaddedBufferedBlockCipher;->b:I

    .line 286
    :try_start_0
    iget-object v1, p0, Lorg/spongycastle/crypto/paddings/PaddedBufferedBlockCipher;->g:Lorg/spongycastle/crypto/paddings/BlockCipherPadding;

    iget-object v2, p0, Lorg/spongycastle/crypto/paddings/PaddedBufferedBlockCipher;->a:[B

    invoke-interface {v1, v2}, Lorg/spongycastle/crypto/paddings/BlockCipherPadding;->a([B)I

    move-result v1

    sub-int/2addr v0, v1

    .line 288
    iget-object v1, p0, Lorg/spongycastle/crypto/paddings/PaddedBufferedBlockCipher;->a:[B

    const/4 v2, 0x0

    invoke-static {v1, v2, p1, p2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 292
    invoke-virtual {p0}, Lorg/spongycastle/crypto/paddings/PaddedBufferedBlockCipher;->c()V

    goto :goto_1

    .line 279
    :cond_2
    invoke-virtual {p0}, Lorg/spongycastle/crypto/paddings/PaddedBufferedBlockCipher;->c()V

    .line 281
    new-instance v0, Lorg/spongycastle/crypto/DataLengthException;

    const-string v1, "last block incomplete in decryption"

    invoke-direct {v0, v1}, Lorg/spongycastle/crypto/DataLengthException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 292
    :catchall_0
    move-exception v0

    invoke-virtual {p0}, Lorg/spongycastle/crypto/paddings/PaddedBufferedBlockCipher;->c()V

    throw v0

    :cond_3
    move v0, v1

    goto :goto_0
.end method

.method public final a([BII[BI)I
    .locals 6

    .prologue
    const/4 v1, 0x0

    .line 182
    if-gez p3, :cond_0

    .line 184
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Can\'t have a negative input length!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 187
    :cond_0
    invoke-virtual {p0}, Lorg/spongycastle/crypto/paddings/PaddedBufferedBlockCipher;->b()I

    move-result v3

    .line 188
    invoke-virtual {p0, p3}, Lorg/spongycastle/crypto/paddings/PaddedBufferedBlockCipher;->a(I)I

    move-result v0

    .line 190
    if-lez v0, :cond_1

    .line 192
    add-int/2addr v0, p5

    array-length v2, p4

    if-le v0, v2, :cond_1

    .line 194
    new-instance v0, Lorg/spongycastle/crypto/DataLengthException;

    const-string v1, "output buffer too short"

    invoke-direct {v0, v1}, Lorg/spongycastle/crypto/DataLengthException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 199
    :cond_1
    iget-object v0, p0, Lorg/spongycastle/crypto/paddings/PaddedBufferedBlockCipher;->a:[B

    array-length v0, v0

    iget v2, p0, Lorg/spongycastle/crypto/paddings/PaddedBufferedBlockCipher;->b:I

    sub-int v2, v0, v2

    .line 201
    if-le p3, v2, :cond_2

    .line 203
    iget-object v0, p0, Lorg/spongycastle/crypto/paddings/PaddedBufferedBlockCipher;->a:[B

    iget v4, p0, Lorg/spongycastle/crypto/paddings/PaddedBufferedBlockCipher;->b:I

    invoke-static {p1, p2, v0, v4, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 205
    iget-object v0, p0, Lorg/spongycastle/crypto/paddings/PaddedBufferedBlockCipher;->d:Lorg/spongycastle/crypto/BlockCipher;

    iget-object v4, p0, Lorg/spongycastle/crypto/paddings/PaddedBufferedBlockCipher;->a:[B

    invoke-interface {v0, v4, v1, p4, p5}, Lorg/spongycastle/crypto/BlockCipher;->a([BI[BI)I

    move-result v0

    add-int/lit8 v0, v0, 0x0

    .line 207
    iput v1, p0, Lorg/spongycastle/crypto/paddings/PaddedBufferedBlockCipher;->b:I

    .line 208
    sub-int v1, p3, v2

    .line 209
    add-int/2addr v2, p2

    .line 211
    :goto_0
    iget-object v4, p0, Lorg/spongycastle/crypto/paddings/PaddedBufferedBlockCipher;->a:[B

    array-length v4, v4

    if-le v1, v4, :cond_3

    .line 213
    iget-object v4, p0, Lorg/spongycastle/crypto/paddings/PaddedBufferedBlockCipher;->d:Lorg/spongycastle/crypto/BlockCipher;

    add-int v5, p5, v0

    invoke-interface {v4, p1, v2, p4, v5}, Lorg/spongycastle/crypto/BlockCipher;->a([BI[BI)I

    move-result v4

    add-int/2addr v0, v4

    .line 215
    sub-int/2addr v1, v3

    .line 216
    add-int/2addr v2, v3

    goto :goto_0

    :cond_2
    move v0, v1

    move v2, p2

    move v1, p3

    .line 220
    :cond_3
    iget-object v3, p0, Lorg/spongycastle/crypto/paddings/PaddedBufferedBlockCipher;->a:[B

    iget v4, p0, Lorg/spongycastle/crypto/paddings/PaddedBufferedBlockCipher;->b:I

    invoke-static {p1, v2, v3, v4, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 222
    iget v2, p0, Lorg/spongycastle/crypto/paddings/PaddedBufferedBlockCipher;->b:I

    add-int/2addr v1, v2

    iput v1, p0, Lorg/spongycastle/crypto/paddings/PaddedBufferedBlockCipher;->b:I

    .line 224
    return v0
.end method

.method public final a(ZLorg/spongycastle/crypto/CipherParameters;)V
    .locals 2

    .prologue
    .line 64
    iput-boolean p1, p0, Lorg/spongycastle/crypto/paddings/PaddedBufferedBlockCipher;->c:Z

    .line 66
    invoke-virtual {p0}, Lorg/spongycastle/crypto/paddings/PaddedBufferedBlockCipher;->c()V

    .line 68
    instance-of v0, p2, Lorg/spongycastle/crypto/params/ParametersWithRandom;

    if-eqz v0, :cond_0

    .line 70
    check-cast p2, Lorg/spongycastle/crypto/params/ParametersWithRandom;

    .line 72
    iget-object v0, p0, Lorg/spongycastle/crypto/paddings/PaddedBufferedBlockCipher;->g:Lorg/spongycastle/crypto/paddings/BlockCipherPadding;

    invoke-virtual {p2}, Lorg/spongycastle/crypto/params/ParametersWithRandom;->a()Ljava/security/SecureRandom;

    move-result-object v1

    invoke-interface {v0, v1}, Lorg/spongycastle/crypto/paddings/BlockCipherPadding;->a(Ljava/security/SecureRandom;)V

    .line 74
    iget-object v0, p0, Lorg/spongycastle/crypto/paddings/PaddedBufferedBlockCipher;->d:Lorg/spongycastle/crypto/BlockCipher;

    invoke-virtual {p2}, Lorg/spongycastle/crypto/params/ParametersWithRandom;->b()Lorg/spongycastle/crypto/CipherParameters;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Lorg/spongycastle/crypto/BlockCipher;->a(ZLorg/spongycastle/crypto/CipherParameters;)V

    .line 82
    :goto_0
    return-void

    .line 78
    :cond_0
    iget-object v0, p0, Lorg/spongycastle/crypto/paddings/PaddedBufferedBlockCipher;->g:Lorg/spongycastle/crypto/paddings/BlockCipherPadding;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lorg/spongycastle/crypto/paddings/BlockCipherPadding;->a(Ljava/security/SecureRandom;)V

    .line 80
    iget-object v0, p0, Lorg/spongycastle/crypto/paddings/PaddedBufferedBlockCipher;->d:Lorg/spongycastle/crypto/BlockCipher;

    invoke-interface {v0, p1, p2}, Lorg/spongycastle/crypto/BlockCipher;->a(ZLorg/spongycastle/crypto/CipherParameters;)V

    goto :goto_0
.end method

.method public final b(I)I
    .locals 2

    .prologue
    .line 95
    iget v0, p0, Lorg/spongycastle/crypto/paddings/PaddedBufferedBlockCipher;->b:I

    add-int/2addr v0, p1

    .line 96
    iget-object v1, p0, Lorg/spongycastle/crypto/paddings/PaddedBufferedBlockCipher;->a:[B

    array-length v1, v1

    rem-int v1, v0, v1

    .line 98
    if-nez v1, :cond_1

    .line 100
    iget-boolean v1, p0, Lorg/spongycastle/crypto/paddings/PaddedBufferedBlockCipher;->c:Z

    if-eqz v1, :cond_0

    .line 102
    iget-object v1, p0, Lorg/spongycastle/crypto/paddings/PaddedBufferedBlockCipher;->a:[B

    array-length v1, v1

    add-int/2addr v0, v1

    .line 108
    :cond_0
    :goto_0
    return v0

    :cond_1
    sub-int/2addr v0, v1

    iget-object v1, p0, Lorg/spongycastle/crypto/paddings/PaddedBufferedBlockCipher;->a:[B

    array-length v1, v1

    add-int/2addr v0, v1

    goto :goto_0
.end method
