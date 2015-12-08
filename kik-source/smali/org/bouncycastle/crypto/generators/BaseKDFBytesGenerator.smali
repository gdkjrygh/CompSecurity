.class public Lorg/bouncycastle/crypto/generators/BaseKDFBytesGenerator;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/bouncycastle/crypto/DerivationFunction;


# instance fields
.field private a:I

.field private b:Lorg/bouncycastle/crypto/Digest;

.field private c:[B

.field private d:[B


# direct methods
.method protected constructor <init>(ILorg/bouncycastle/crypto/Digest;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lorg/bouncycastle/crypto/generators/BaseKDFBytesGenerator;->a:I

    iput-object p2, p0, Lorg/bouncycastle/crypto/generators/BaseKDFBytesGenerator;->b:Lorg/bouncycastle/crypto/Digest;

    return-void
.end method


# virtual methods
.method public generateBytes([BII)I
    .locals 11

    const/4 v3, 0x0

    array-length v0, p1

    sub-int/2addr v0, p3

    if-ge v0, p2, :cond_0

    new-instance v0, Lorg/bouncycastle/crypto/DataLengthException;

    const-string v1, "output buffer too small"

    invoke-direct {v0, v1}, Lorg/bouncycastle/crypto/DataLengthException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    int-to-long v0, p3

    iget-object v2, p0, Lorg/bouncycastle/crypto/generators/BaseKDFBytesGenerator;->b:Lorg/bouncycastle/crypto/Digest;

    invoke-interface {v2}, Lorg/bouncycastle/crypto/Digest;->getDigestSize()I

    move-result v5

    const-wide v6, 0x1ffffffffL

    cmp-long v2, v0, v6

    if-lez v2, :cond_1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Output length too large"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    int-to-long v6, v5

    add-long/2addr v0, v6

    const-wide/16 v6, 0x1

    sub-long/2addr v0, v6

    int-to-long v6, v5

    div-long/2addr v0, v6

    long-to-int v6, v0

    iget-object v0, p0, Lorg/bouncycastle/crypto/generators/BaseKDFBytesGenerator;->b:Lorg/bouncycastle/crypto/Digest;

    invoke-interface {v0}, Lorg/bouncycastle/crypto/Digest;->getDigestSize()I

    move-result v0

    new-array v7, v0, [B

    iget v0, p0, Lorg/bouncycastle/crypto/generators/BaseKDFBytesGenerator;->a:I

    move v2, v3

    move v4, v0

    move v1, p2

    move v0, p3

    :goto_0
    if-ge v2, v6, :cond_4

    iget-object v8, p0, Lorg/bouncycastle/crypto/generators/BaseKDFBytesGenerator;->b:Lorg/bouncycastle/crypto/Digest;

    iget-object v9, p0, Lorg/bouncycastle/crypto/generators/BaseKDFBytesGenerator;->c:[B

    iget-object v10, p0, Lorg/bouncycastle/crypto/generators/BaseKDFBytesGenerator;->c:[B

    array-length v10, v10

    invoke-interface {v8, v9, v3, v10}, Lorg/bouncycastle/crypto/Digest;->update([BII)V

    iget-object v8, p0, Lorg/bouncycastle/crypto/generators/BaseKDFBytesGenerator;->b:Lorg/bouncycastle/crypto/Digest;

    shr-int/lit8 v9, v4, 0x18

    int-to-byte v9, v9

    invoke-interface {v8, v9}, Lorg/bouncycastle/crypto/Digest;->update(B)V

    iget-object v8, p0, Lorg/bouncycastle/crypto/generators/BaseKDFBytesGenerator;->b:Lorg/bouncycastle/crypto/Digest;

    shr-int/lit8 v9, v4, 0x10

    int-to-byte v9, v9

    invoke-interface {v8, v9}, Lorg/bouncycastle/crypto/Digest;->update(B)V

    iget-object v8, p0, Lorg/bouncycastle/crypto/generators/BaseKDFBytesGenerator;->b:Lorg/bouncycastle/crypto/Digest;

    shr-int/lit8 v9, v4, 0x8

    int-to-byte v9, v9

    invoke-interface {v8, v9}, Lorg/bouncycastle/crypto/Digest;->update(B)V

    iget-object v8, p0, Lorg/bouncycastle/crypto/generators/BaseKDFBytesGenerator;->b:Lorg/bouncycastle/crypto/Digest;

    int-to-byte v9, v4

    invoke-interface {v8, v9}, Lorg/bouncycastle/crypto/Digest;->update(B)V

    iget-object v8, p0, Lorg/bouncycastle/crypto/generators/BaseKDFBytesGenerator;->d:[B

    if-eqz v8, :cond_2

    iget-object v8, p0, Lorg/bouncycastle/crypto/generators/BaseKDFBytesGenerator;->b:Lorg/bouncycastle/crypto/Digest;

    iget-object v9, p0, Lorg/bouncycastle/crypto/generators/BaseKDFBytesGenerator;->d:[B

    iget-object v10, p0, Lorg/bouncycastle/crypto/generators/BaseKDFBytesGenerator;->d:[B

    array-length v10, v10

    invoke-interface {v8, v9, v3, v10}, Lorg/bouncycastle/crypto/Digest;->update([BII)V

    :cond_2
    iget-object v8, p0, Lorg/bouncycastle/crypto/generators/BaseKDFBytesGenerator;->b:Lorg/bouncycastle/crypto/Digest;

    invoke-interface {v8, v7, v3}, Lorg/bouncycastle/crypto/Digest;->doFinal([BI)I

    if-le v0, v5, :cond_3

    invoke-static {v7, v3, p1, v1, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/2addr v1, v5

    sub-int/2addr v0, v5

    :goto_1
    add-int/lit8 v4, v4, 0x1

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    invoke-static {v7, v3, p1, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_1

    :cond_4
    iget-object v1, p0, Lorg/bouncycastle/crypto/generators/BaseKDFBytesGenerator;->b:Lorg/bouncycastle/crypto/Digest;

    invoke-interface {v1}, Lorg/bouncycastle/crypto/Digest;->reset()V

    return v0
.end method

.method public getDigest()Lorg/bouncycastle/crypto/Digest;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/crypto/generators/BaseKDFBytesGenerator;->b:Lorg/bouncycastle/crypto/Digest;

    return-object v0
.end method

.method public init(Lorg/bouncycastle/crypto/DerivationParameters;)V
    .locals 2

    instance-of v0, p1, Lorg/bouncycastle/crypto/params/KDFParameters;

    if-eqz v0, :cond_0

    check-cast p1, Lorg/bouncycastle/crypto/params/KDFParameters;

    invoke-virtual {p1}, Lorg/bouncycastle/crypto/params/KDFParameters;->getSharedSecret()[B

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/crypto/generators/BaseKDFBytesGenerator;->c:[B

    invoke-virtual {p1}, Lorg/bouncycastle/crypto/params/KDFParameters;->getIV()[B

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/crypto/generators/BaseKDFBytesGenerator;->d:[B

    :goto_0
    return-void

    :cond_0
    instance-of v0, p1, Lorg/bouncycastle/crypto/params/ISO18033KDFParameters;

    if-eqz v0, :cond_1

    check-cast p1, Lorg/bouncycastle/crypto/params/ISO18033KDFParameters;

    invoke-virtual {p1}, Lorg/bouncycastle/crypto/params/ISO18033KDFParameters;->getSeed()[B

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/crypto/generators/BaseKDFBytesGenerator;->c:[B

    const/4 v0, 0x0

    iput-object v0, p0, Lorg/bouncycastle/crypto/generators/BaseKDFBytesGenerator;->d:[B

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "KDF parameters required for KDF2Generator"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
