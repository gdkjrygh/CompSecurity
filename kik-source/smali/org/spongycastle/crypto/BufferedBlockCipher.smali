.class public Lorg/spongycastle/crypto/BufferedBlockCipher;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field protected a:[B

.field protected b:I

.field protected c:Z

.field protected d:Lorg/spongycastle/crypto/BlockCipher;

.field protected e:Z

.field protected f:Z


# direct methods
.method protected constructor <init>()V
    .locals 0

    .prologue
    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    return-void
.end method

.method public constructor <init>(Lorg/spongycastle/crypto/BlockCipher;)V
    .locals 5

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    iput-object p1, p0, Lorg/spongycastle/crypto/BufferedBlockCipher;->d:Lorg/spongycastle/crypto/BlockCipher;

    .line 40
    invoke-interface {p1}, Lorg/spongycastle/crypto/BlockCipher;->b()I

    move-result v0

    new-array v0, v0, [B

    iput-object v0, p0, Lorg/spongycastle/crypto/BufferedBlockCipher;->a:[B

    .line 41
    iput v2, p0, Lorg/spongycastle/crypto/BufferedBlockCipher;->b:I

    .line 46
    invoke-interface {p1}, Lorg/spongycastle/crypto/BlockCipher;->a()Ljava/lang/String;

    move-result-object v3

    .line 47
    const/16 v0, 0x2f

    invoke-virtual {v3, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    add-int/lit8 v4, v0, 0x1

    .line 49
    if-lez v4, :cond_1

    const-string v0, "PGP"

    invoke-virtual {v3, v0, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_1

    move v0, v1

    :goto_0
    iput-boolean v0, p0, Lorg/spongycastle/crypto/BufferedBlockCipher;->f:Z

    .line 51
    iget-boolean v0, p0, Lorg/spongycastle/crypto/BufferedBlockCipher;->f:Z

    if-eqz v0, :cond_2

    .line 57
    :cond_0
    :goto_1
    iput-boolean v1, p0, Lorg/spongycastle/crypto/BufferedBlockCipher;->e:Z

    .line 59
    return-void

    :cond_1
    move v0, v2

    .line 49
    goto :goto_0

    .line 57
    :cond_2
    if-lez v4, :cond_3

    const-string v0, "CFB"

    invoke-virtual {v3, v0, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;I)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "OFB"

    invoke-virtual {v3, v0, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;I)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "OpenPGP"

    invoke-virtual {v3, v0, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;I)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "SIC"

    invoke-virtual {v3, v0, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;I)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "GCTR"

    invoke-virtual {v3, v0, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;I)Z

    move-result v0

    if-nez v0, :cond_0

    :cond_3
    move v1, v2

    goto :goto_1
.end method


# virtual methods
.method public a(I)I
    .locals 3

    .prologue
    .line 113
    iget v0, p0, Lorg/spongycastle/crypto/BufferedBlockCipher;->b:I

    add-int v1, p1, v0

    .line 116
    iget-boolean v0, p0, Lorg/spongycastle/crypto/BufferedBlockCipher;->f:Z

    if-eqz v0, :cond_0

    .line 118
    iget-object v0, p0, Lorg/spongycastle/crypto/BufferedBlockCipher;->a:[B

    array-length v0, v0

    rem-int v0, v1, v0

    iget-object v2, p0, Lorg/spongycastle/crypto/BufferedBlockCipher;->d:Lorg/spongycastle/crypto/BlockCipher;

    invoke-interface {v2}, Lorg/spongycastle/crypto/BlockCipher;->b()I

    move-result v2

    add-int/lit8 v2, v2, 0x2

    sub-int/2addr v0, v2

    .line 125
    :goto_0
    sub-int v0, v1, v0

    return v0

    .line 122
    :cond_0
    iget-object v0, p0, Lorg/spongycastle/crypto/BufferedBlockCipher;->a:[B

    array-length v0, v0

    rem-int v0, v1, v0

    goto :goto_0
.end method

.method public a([BI)I
    .locals 5

    .prologue
    const/4 v0, 0x0

    .line 264
    .line 266
    :try_start_0
    iget v1, p0, Lorg/spongycastle/crypto/BufferedBlockCipher;->b:I

    add-int/2addr v1, p2

    array-length v2, p1

    if-le v1, v2, :cond_0

    .line 268
    new-instance v0, Lorg/spongycastle/crypto/DataLengthException;

    const-string v1, "output buffer too short for doFinal()"

    invoke-direct {v0, v1}, Lorg/spongycastle/crypto/DataLengthException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 288
    :catchall_0
    move-exception v0

    invoke-virtual {p0}, Lorg/spongycastle/crypto/BufferedBlockCipher;->c()V

    throw v0

    .line 271
    :cond_0
    :try_start_1
    iget v1, p0, Lorg/spongycastle/crypto/BufferedBlockCipher;->b:I

    if-eqz v1, :cond_2

    .line 273
    iget-boolean v0, p0, Lorg/spongycastle/crypto/BufferedBlockCipher;->e:Z

    if-nez v0, :cond_1

    .line 275
    new-instance v0, Lorg/spongycastle/crypto/DataLengthException;

    const-string v1, "data not block size aligned"

    invoke-direct {v0, v1}, Lorg/spongycastle/crypto/DataLengthException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 278
    :cond_1
    iget-object v0, p0, Lorg/spongycastle/crypto/BufferedBlockCipher;->d:Lorg/spongycastle/crypto/BlockCipher;

    iget-object v1, p0, Lorg/spongycastle/crypto/BufferedBlockCipher;->a:[B

    const/4 v2, 0x0

    iget-object v3, p0, Lorg/spongycastle/crypto/BufferedBlockCipher;->a:[B

    const/4 v4, 0x0

    invoke-interface {v0, v1, v2, v3, v4}, Lorg/spongycastle/crypto/BlockCipher;->a([BI[BI)I

    .line 279
    iget v0, p0, Lorg/spongycastle/crypto/BufferedBlockCipher;->b:I

    .line 280
    const/4 v1, 0x0

    iput v1, p0, Lorg/spongycastle/crypto/BufferedBlockCipher;->b:I

    .line 281
    iget-object v1, p0, Lorg/spongycastle/crypto/BufferedBlockCipher;->a:[B

    const/4 v2, 0x0

    invoke-static {v1, v2, p1, p2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 288
    :cond_2
    invoke-virtual {p0}, Lorg/spongycastle/crypto/BufferedBlockCipher;->c()V

    return v0
.end method

.method public a([BII[BI)I
    .locals 7

    .prologue
    const/4 v3, 0x0

    .line 192
    if-gez p3, :cond_0

    .line 194
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Can\'t have a negative input length!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 197
    :cond_0
    invoke-virtual {p0}, Lorg/spongycastle/crypto/BufferedBlockCipher;->b()I

    move-result v4

    .line 198
    invoke-virtual {p0, p3}, Lorg/spongycastle/crypto/BufferedBlockCipher;->a(I)I

    move-result v0

    .line 200
    if-lez v0, :cond_1

    .line 202
    add-int/2addr v0, p5

    array-length v1, p4

    if-le v0, v1, :cond_1

    .line 204
    new-instance v0, Lorg/spongycastle/crypto/DataLengthException;

    const-string v1, "output buffer too short"

    invoke-direct {v0, v1}, Lorg/spongycastle/crypto/DataLengthException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 209
    :cond_1
    iget-object v0, p0, Lorg/spongycastle/crypto/BufferedBlockCipher;->a:[B

    array-length v0, v0

    iget v1, p0, Lorg/spongycastle/crypto/BufferedBlockCipher;->b:I

    sub-int v2, v0, v1

    .line 211
    if-le p3, v2, :cond_2

    .line 213
    iget-object v0, p0, Lorg/spongycastle/crypto/BufferedBlockCipher;->a:[B

    iget v1, p0, Lorg/spongycastle/crypto/BufferedBlockCipher;->b:I

    invoke-static {p1, p2, v0, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 215
    iget-object v0, p0, Lorg/spongycastle/crypto/BufferedBlockCipher;->d:Lorg/spongycastle/crypto/BlockCipher;

    iget-object v1, p0, Lorg/spongycastle/crypto/BufferedBlockCipher;->a:[B

    invoke-interface {v0, v1, v3, p4, p5}, Lorg/spongycastle/crypto/BlockCipher;->a([BI[BI)I

    move-result v0

    add-int/lit8 v0, v0, 0x0

    .line 217
    iput v3, p0, Lorg/spongycastle/crypto/BufferedBlockCipher;->b:I

    .line 218
    sub-int v1, p3, v2

    .line 219
    add-int/2addr v2, p2

    .line 221
    :goto_0
    iget-object v5, p0, Lorg/spongycastle/crypto/BufferedBlockCipher;->a:[B

    array-length v5, v5

    if-le v1, v5, :cond_3

    .line 223
    iget-object v5, p0, Lorg/spongycastle/crypto/BufferedBlockCipher;->d:Lorg/spongycastle/crypto/BlockCipher;

    add-int v6, p5, v0

    invoke-interface {v5, p1, v2, p4, v6}, Lorg/spongycastle/crypto/BlockCipher;->a([BI[BI)I

    move-result v5

    add-int/2addr v0, v5

    .line 225
    sub-int/2addr v1, v4

    .line 226
    add-int/2addr v2, v4

    goto :goto_0

    :cond_2
    move v0, v3

    move v1, p3

    move v2, p2

    .line 230
    :cond_3
    iget-object v4, p0, Lorg/spongycastle/crypto/BufferedBlockCipher;->a:[B

    iget v5, p0, Lorg/spongycastle/crypto/BufferedBlockCipher;->b:I

    invoke-static {p1, v2, v4, v5, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 232
    iget v2, p0, Lorg/spongycastle/crypto/BufferedBlockCipher;->b:I

    add-int/2addr v1, v2

    iput v1, p0, Lorg/spongycastle/crypto/BufferedBlockCipher;->b:I

    .line 234
    iget v1, p0, Lorg/spongycastle/crypto/BufferedBlockCipher;->b:I

    iget-object v2, p0, Lorg/spongycastle/crypto/BufferedBlockCipher;->a:[B

    array-length v2, v2

    if-ne v1, v2, :cond_4

    .line 236
    iget-object v1, p0, Lorg/spongycastle/crypto/BufferedBlockCipher;->d:Lorg/spongycastle/crypto/BlockCipher;

    iget-object v2, p0, Lorg/spongycastle/crypto/BufferedBlockCipher;->a:[B

    add-int v4, p5, v0

    invoke-interface {v1, v2, v3, p4, v4}, Lorg/spongycastle/crypto/BlockCipher;->a([BI[BI)I

    move-result v1

    add-int/2addr v0, v1

    .line 237
    iput v3, p0, Lorg/spongycastle/crypto/BufferedBlockCipher;->b:I

    .line 240
    :cond_4
    return v0
.end method

.method public final a()Lorg/spongycastle/crypto/BlockCipher;
    .locals 1

    .prologue
    .line 68
    iget-object v0, p0, Lorg/spongycastle/crypto/BufferedBlockCipher;->d:Lorg/spongycastle/crypto/BlockCipher;

    return-object v0
.end method

.method public a(ZLorg/spongycastle/crypto/CipherParameters;)V
    .locals 1

    .prologue
    .line 85
    iput-boolean p1, p0, Lorg/spongycastle/crypto/BufferedBlockCipher;->c:Z

    .line 87
    invoke-virtual {p0}, Lorg/spongycastle/crypto/BufferedBlockCipher;->c()V

    .line 89
    iget-object v0, p0, Lorg/spongycastle/crypto/BufferedBlockCipher;->d:Lorg/spongycastle/crypto/BlockCipher;

    invoke-interface {v0, p1, p2}, Lorg/spongycastle/crypto/BlockCipher;->a(ZLorg/spongycastle/crypto/CipherParameters;)V

    .line 90
    return-void
.end method

.method public final b()I
    .locals 1

    .prologue
    .line 99
    iget-object v0, p0, Lorg/spongycastle/crypto/BufferedBlockCipher;->d:Lorg/spongycastle/crypto/BlockCipher;

    invoke-interface {v0}, Lorg/spongycastle/crypto/BlockCipher;->b()I

    move-result v0

    return v0
.end method

.method public b(I)I
    .locals 1

    .prologue
    .line 140
    iget v0, p0, Lorg/spongycastle/crypto/BufferedBlockCipher;->b:I

    add-int/2addr v0, p1

    return v0
.end method

.method public final c()V
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 301
    move v0, v1

    :goto_0
    iget-object v2, p0, Lorg/spongycastle/crypto/BufferedBlockCipher;->a:[B

    array-length v2, v2

    if-ge v0, v2, :cond_0

    .line 303
    iget-object v2, p0, Lorg/spongycastle/crypto/BufferedBlockCipher;->a:[B

    aput-byte v1, v2, v0

    .line 301
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 306
    :cond_0
    iput v1, p0, Lorg/spongycastle/crypto/BufferedBlockCipher;->b:I

    .line 311
    iget-object v0, p0, Lorg/spongycastle/crypto/BufferedBlockCipher;->d:Lorg/spongycastle/crypto/BlockCipher;

    invoke-interface {v0}, Lorg/spongycastle/crypto/BlockCipher;->c()V

    .line 312
    return-void
.end method
