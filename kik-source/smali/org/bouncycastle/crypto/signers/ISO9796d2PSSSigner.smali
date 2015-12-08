.class public Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/bouncycastle/crypto/SignerWithRecovery;


# instance fields
.field private a:Lorg/bouncycastle/crypto/Digest;

.field private b:Lorg/bouncycastle/crypto/AsymmetricBlockCipher;

.field private c:Ljava/security/SecureRandom;

.field private d:[B

.field private e:I

.field private f:I

.field private g:I

.field private h:[B

.field private i:[B

.field private j:I

.field private k:I

.field private l:Z

.field private m:[B


# direct methods
.method public constructor <init>(Lorg/bouncycastle/crypto/AsymmetricBlockCipher;Lorg/bouncycastle/crypto/Digest;I)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, p3, v0}, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;-><init>(Lorg/bouncycastle/crypto/AsymmetricBlockCipher;Lorg/bouncycastle/crypto/Digest;IZ)V

    return-void
.end method

.method public constructor <init>(Lorg/bouncycastle/crypto/AsymmetricBlockCipher;Lorg/bouncycastle/crypto/Digest;IZ)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->b:Lorg/bouncycastle/crypto/AsymmetricBlockCipher;

    iput-object p2, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->a:Lorg/bouncycastle/crypto/Digest;

    invoke-interface {p2}, Lorg/bouncycastle/crypto/Digest;->getDigestSize()I

    move-result v0

    iput v0, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->e:I

    iput p3, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->k:I

    if-eqz p4, :cond_0

    const/16 v0, 0xbc

    iput v0, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->f:I

    :goto_0
    return-void

    :cond_0
    instance-of v0, p2, Lorg/bouncycastle/crypto/digests/SHA1Digest;

    if-eqz v0, :cond_1

    const/16 v0, 0x33cc

    iput v0, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->f:I

    goto :goto_0

    :cond_1
    instance-of v0, p2, Lorg/bouncycastle/crypto/digests/RIPEMD160Digest;

    if-eqz v0, :cond_2

    const/16 v0, 0x31cc

    iput v0, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->f:I

    goto :goto_0

    :cond_2
    instance-of v0, p2, Lorg/bouncycastle/crypto/digests/RIPEMD128Digest;

    if-eqz v0, :cond_3

    const/16 v0, 0x32cc

    iput v0, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->f:I

    goto :goto_0

    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "no valid trailer for digest"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private ItoOSP(I[B)V
    .locals 2

    const/4 v0, 0x0

    ushr-int/lit8 v1, p1, 0x18

    int-to-byte v1, v1

    aput-byte v1, p2, v0

    const/4 v0, 0x1

    ushr-int/lit8 v1, p1, 0x10

    int-to-byte v1, v1

    aput-byte v1, p2, v0

    const/4 v0, 0x2

    ushr-int/lit8 v1, p1, 0x8

    int-to-byte v1, v1

    aput-byte v1, p2, v0

    const/4 v0, 0x3

    ushr-int/lit8 v1, p1, 0x0

    int-to-byte v1, v1

    aput-byte v1, p2, v0

    return-void
.end method

.method private LtoOSP(J[B)V
    .locals 5

    const/4 v4, 0x0

    const/16 v0, 0x38

    ushr-long v0, p1, v0

    long-to-int v0, v0

    int-to-byte v0, v0

    aput-byte v0, p3, v4

    const/4 v0, 0x1

    const/16 v1, 0x30

    ushr-long v2, p1, v1

    long-to-int v1, v2

    int-to-byte v1, v1

    aput-byte v1, p3, v0

    const/4 v0, 0x2

    const/16 v1, 0x28

    ushr-long v2, p1, v1

    long-to-int v1, v2

    int-to-byte v1, v1

    aput-byte v1, p3, v0

    const/4 v0, 0x3

    const/16 v1, 0x20

    ushr-long v2, p1, v1

    long-to-int v1, v2

    int-to-byte v1, v1

    aput-byte v1, p3, v0

    const/4 v0, 0x4

    const/16 v1, 0x18

    ushr-long v2, p1, v1

    long-to-int v1, v2

    int-to-byte v1, v1

    aput-byte v1, p3, v0

    const/4 v0, 0x5

    const/16 v1, 0x10

    ushr-long v2, p1, v1

    long-to-int v1, v2

    int-to-byte v1, v1

    aput-byte v1, p3, v0

    const/4 v0, 0x6

    const/16 v1, 0x8

    ushr-long v2, p1, v1

    long-to-int v1, v2

    int-to-byte v1, v1

    aput-byte v1, p3, v0

    const/4 v0, 0x7

    ushr-long v2, p1, v4

    long-to-int v1, v2

    int-to-byte v1, v1

    aput-byte v1, p3, v0

    return-void
.end method

.method private clearBlock([B)V
    .locals 3

    const/4 v1, 0x0

    move v0, v1

    :goto_0
    array-length v2, p1

    if-eq v0, v2, :cond_0

    aput-byte v1, p1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method private isSameAs([B[B)Z
    .locals 5

    const/4 v1, 0x0

    const/4 v0, 0x1

    iget v2, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->j:I

    array-length v3, p2

    if-eq v2, v3, :cond_0

    move v0, v1

    :cond_0
    move v2, v0

    move v0, v1

    :goto_0
    array-length v3, p2

    if-eq v0, v3, :cond_2

    aget-byte v3, p1, v0

    aget-byte v4, p2, v0

    if-eq v3, v4, :cond_1

    move v2, v1

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    return v2
.end method

.method private maskGeneratorFunction1([BIII)[B
    .locals 8

    const/4 v7, 0x4

    const/4 v1, 0x0

    new-array v2, p4, [B

    iget v0, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->e:I

    new-array v3, v0, [B

    new-array v4, v7, [B

    iget-object v0, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->a:Lorg/bouncycastle/crypto/Digest;

    invoke-interface {v0}, Lorg/bouncycastle/crypto/Digest;->reset()V

    move v0, v1

    :goto_0
    iget v5, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->e:I

    div-int v5, p4, v5

    if-ge v0, v5, :cond_0

    invoke-direct {p0, v0, v4}, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->ItoOSP(I[B)V

    iget-object v5, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->a:Lorg/bouncycastle/crypto/Digest;

    invoke-interface {v5, p1, p2, p3}, Lorg/bouncycastle/crypto/Digest;->update([BII)V

    iget-object v5, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->a:Lorg/bouncycastle/crypto/Digest;

    invoke-interface {v5, v4, v1, v7}, Lorg/bouncycastle/crypto/Digest;->update([BII)V

    iget-object v5, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->a:Lorg/bouncycastle/crypto/Digest;

    invoke-interface {v5, v3, v1}, Lorg/bouncycastle/crypto/Digest;->doFinal([BI)I

    iget v5, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->e:I

    mul-int/2addr v5, v0

    iget v6, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->e:I

    invoke-static {v3, v1, v2, v5, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    iget v5, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->e:I

    mul-int/2addr v5, v0

    if-ge v5, p4, :cond_1

    invoke-direct {p0, v0, v4}, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->ItoOSP(I[B)V

    iget-object v5, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->a:Lorg/bouncycastle/crypto/Digest;

    invoke-interface {v5, p1, p2, p3}, Lorg/bouncycastle/crypto/Digest;->update([BII)V

    iget-object v5, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->a:Lorg/bouncycastle/crypto/Digest;

    invoke-interface {v5, v4, v1, v7}, Lorg/bouncycastle/crypto/Digest;->update([BII)V

    iget-object v4, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->a:Lorg/bouncycastle/crypto/Digest;

    invoke-interface {v4, v3, v1}, Lorg/bouncycastle/crypto/Digest;->doFinal([BI)I

    iget v4, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->e:I

    mul-int/2addr v4, v0

    iget v5, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->e:I

    mul-int/2addr v0, v5

    sub-int v0, p4, v0

    invoke-static {v3, v1, v2, v4, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_1
    return-object v2
.end method


# virtual methods
.method public generateSignature()[B
    .locals 10

    const/16 v9, 0xbc

    const/16 v8, 0x8

    const/4 v2, 0x1

    const/4 v3, 0x0

    iget-object v0, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->a:Lorg/bouncycastle/crypto/Digest;

    invoke-interface {v0}, Lorg/bouncycastle/crypto/Digest;->getDigestSize()I

    move-result v0

    new-array v1, v0, [B

    iget-object v4, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->a:Lorg/bouncycastle/crypto/Digest;

    invoke-interface {v4, v1, v3}, Lorg/bouncycastle/crypto/Digest;->doFinal([BI)I

    new-array v4, v8, [B

    iget v5, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->j:I

    mul-int/lit8 v5, v5, 0x8

    int-to-long v6, v5

    invoke-direct {p0, v6, v7, v4}, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->LtoOSP(J[B)V

    iget-object v5, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->a:Lorg/bouncycastle/crypto/Digest;

    invoke-interface {v5, v4, v3, v8}, Lorg/bouncycastle/crypto/Digest;->update([BII)V

    iget-object v4, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->a:Lorg/bouncycastle/crypto/Digest;

    iget-object v5, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->i:[B

    iget v6, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->j:I

    invoke-interface {v4, v5, v3, v6}, Lorg/bouncycastle/crypto/Digest;->update([BII)V

    iget-object v4, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->a:Lorg/bouncycastle/crypto/Digest;

    invoke-interface {v4, v1, v3, v0}, Lorg/bouncycastle/crypto/Digest;->update([BII)V

    iget-object v0, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->d:[B

    if-eqz v0, :cond_1

    iget-object v0, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->d:[B

    :goto_0
    iget-object v1, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->a:Lorg/bouncycastle/crypto/Digest;

    array-length v4, v0

    invoke-interface {v1, v0, v3, v4}, Lorg/bouncycastle/crypto/Digest;->update([BII)V

    iget-object v1, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->a:Lorg/bouncycastle/crypto/Digest;

    invoke-interface {v1}, Lorg/bouncycastle/crypto/Digest;->getDigestSize()I

    move-result v1

    new-array v4, v1, [B

    iget-object v1, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->a:Lorg/bouncycastle/crypto/Digest;

    invoke-interface {v1, v4, v3}, Lorg/bouncycastle/crypto/Digest;->doFinal([BI)I

    const/4 v1, 0x2

    iget v5, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->f:I

    if-ne v5, v9, :cond_0

    move v1, v2

    :cond_0
    iget-object v5, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->h:[B

    array-length v5, v5

    iget v6, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->j:I

    sub-int/2addr v5, v6

    array-length v6, v0

    sub-int/2addr v5, v6

    iget v6, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->e:I

    sub-int/2addr v5, v6

    sub-int/2addr v5, v1

    add-int/lit8 v5, v5, -0x1

    iget-object v6, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->h:[B

    aput-byte v2, v6, v5

    iget-object v2, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->i:[B

    iget-object v6, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->h:[B

    add-int/lit8 v7, v5, 0x1

    iget v8, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->j:I

    invoke-static {v2, v3, v6, v7, v8}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v2, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->h:[B

    add-int/lit8 v5, v5, 0x1

    iget v6, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->j:I

    add-int/2addr v5, v6

    array-length v6, v0

    invoke-static {v0, v3, v2, v5, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    array-length v0, v4

    iget-object v2, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->h:[B

    array-length v2, v2

    iget v5, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->e:I

    sub-int/2addr v2, v5

    sub-int/2addr v2, v1

    invoke-direct {p0, v4, v3, v0, v2}, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->maskGeneratorFunction1([BIII)[B

    move-result-object v2

    move v0, v3

    :goto_1
    array-length v5, v2

    if-eq v0, v5, :cond_2

    iget-object v5, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->h:[B

    aget-byte v6, v5, v0

    aget-byte v7, v2, v0

    xor-int/2addr v6, v7

    int-to-byte v6, v6

    aput-byte v6, v5, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    iget v0, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->k:I

    new-array v0, v0, [B

    iget-object v1, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->c:Ljava/security/SecureRandom;

    invoke-virtual {v1, v0}, Ljava/security/SecureRandom;->nextBytes([B)V

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->h:[B

    iget-object v2, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->h:[B

    array-length v2, v2

    iget v5, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->e:I

    sub-int/2addr v2, v5

    sub-int v1, v2, v1

    iget v2, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->e:I

    invoke-static {v4, v3, v0, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget v0, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->f:I

    if-ne v0, v9, :cond_3

    iget-object v0, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->h:[B

    iget-object v1, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->h:[B

    array-length v1, v1

    add-int/lit8 v1, v1, -0x1

    const/16 v2, -0x44

    aput-byte v2, v0, v1

    :goto_2
    iget-object v0, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->h:[B

    aget-byte v1, v0, v3

    and-int/lit8 v1, v1, 0x7f

    int-to-byte v1, v1

    aput-byte v1, v0, v3

    iget-object v0, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->b:Lorg/bouncycastle/crypto/AsymmetricBlockCipher;

    iget-object v1, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->h:[B

    iget-object v2, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->h:[B

    array-length v2, v2

    invoke-interface {v0, v1, v3, v2}, Lorg/bouncycastle/crypto/AsymmetricBlockCipher;->processBlock([BII)[B

    move-result-object v0

    iget-object v1, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->i:[B

    invoke-direct {p0, v1}, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->clearBlock([B)V

    iget-object v1, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->h:[B

    invoke-direct {p0, v1}, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->clearBlock([B)V

    iput v3, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->j:I

    return-object v0

    :cond_3
    iget-object v0, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->h:[B

    iget-object v1, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->h:[B

    array-length v1, v1

    add-int/lit8 v1, v1, -0x2

    iget v2, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->f:I

    ushr-int/lit8 v2, v2, 0x8

    int-to-byte v2, v2

    aput-byte v2, v0, v1

    iget-object v0, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->h:[B

    iget-object v1, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->h:[B

    array-length v1, v1

    add-int/lit8 v1, v1, -0x1

    iget v2, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->f:I

    int-to-byte v2, v2

    aput-byte v2, v0, v1

    goto :goto_2
.end method

.method public getRecoveredMessage()[B
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->m:[B

    return-object v0
.end method

.method public hasFullMessage()Z
    .locals 1

    iget-boolean v0, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->l:Z

    return v0
.end method

.method public init(ZLorg/bouncycastle/crypto/CipherParameters;)V
    .locals 4

    iget v1, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->k:I

    instance-of v0, p2, Lorg/bouncycastle/crypto/params/ParametersWithRandom;

    if-eqz v0, :cond_1

    check-cast p2, Lorg/bouncycastle/crypto/params/ParametersWithRandom;

    invoke-virtual {p2}, Lorg/bouncycastle/crypto/params/ParametersWithRandom;->getParameters()Lorg/bouncycastle/crypto/CipherParameters;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/crypto/params/RSAKeyParameters;

    if-eqz p1, :cond_0

    invoke-virtual {p2}, Lorg/bouncycastle/crypto/params/ParametersWithRandom;->getRandom()Ljava/security/SecureRandom;

    move-result-object v2

    iput-object v2, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->c:Ljava/security/SecureRandom;

    :cond_0
    move-object p2, v0

    move v0, v1

    :goto_0
    iget-object v1, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->b:Lorg/bouncycastle/crypto/AsymmetricBlockCipher;

    invoke-interface {v1, p1, p2}, Lorg/bouncycastle/crypto/AsymmetricBlockCipher;->init(ZLorg/bouncycastle/crypto/CipherParameters;)V

    invoke-virtual {p2}, Lorg/bouncycastle/crypto/params/RSAKeyParameters;->getModulus()Ljava/math/BigInteger;

    move-result-object v1

    invoke-virtual {v1}, Ljava/math/BigInteger;->bitLength()I

    move-result v1

    iput v1, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->g:I

    iget v1, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->g:I

    add-int/lit8 v1, v1, 0x7

    div-int/lit8 v1, v1, 0x8

    new-array v1, v1, [B

    iput-object v1, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->h:[B

    iget v1, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->f:I

    const/16 v2, 0xbc

    if-ne v1, v2, :cond_5

    iget-object v1, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->h:[B

    array-length v1, v1

    iget-object v2, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->a:Lorg/bouncycastle/crypto/Digest;

    invoke-interface {v2}, Lorg/bouncycastle/crypto/Digest;->getDigestSize()I

    move-result v2

    sub-int/2addr v1, v2

    sub-int v0, v1, v0

    add-int/lit8 v0, v0, -0x1

    add-int/lit8 v0, v0, -0x1

    new-array v0, v0, [B

    iput-object v0, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->i:[B

    :goto_1
    invoke-virtual {p0}, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->reset()V

    return-void

    :cond_1
    instance-of v0, p2, Lorg/bouncycastle/crypto/params/ParametersWithSalt;

    if-eqz v0, :cond_3

    check-cast p2, Lorg/bouncycastle/crypto/params/ParametersWithSalt;

    invoke-virtual {p2}, Lorg/bouncycastle/crypto/params/ParametersWithSalt;->getParameters()Lorg/bouncycastle/crypto/CipherParameters;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/crypto/params/RSAKeyParameters;

    invoke-virtual {p2}, Lorg/bouncycastle/crypto/params/ParametersWithSalt;->getSalt()[B

    move-result-object v1

    iput-object v1, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->d:[B

    iget-object v1, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->d:[B

    array-length v1, v1

    iget-object v2, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->d:[B

    array-length v2, v2

    iget v3, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->k:I

    if-eq v2, v3, :cond_2

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Fixed salt is of wrong length"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    move-object p2, v0

    move v0, v1

    goto :goto_0

    :cond_3
    check-cast p2, Lorg/bouncycastle/crypto/params/RSAKeyParameters;

    if-eqz p1, :cond_4

    new-instance v0, Ljava/security/SecureRandom;

    invoke-direct {v0}, Ljava/security/SecureRandom;-><init>()V

    iput-object v0, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->c:Ljava/security/SecureRandom;

    :cond_4
    move v0, v1

    goto :goto_0

    :cond_5
    iget-object v1, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->h:[B

    array-length v1, v1

    iget-object v2, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->a:Lorg/bouncycastle/crypto/Digest;

    invoke-interface {v2}, Lorg/bouncycastle/crypto/Digest;->getDigestSize()I

    move-result v2

    sub-int/2addr v1, v2

    sub-int v0, v1, v0

    add-int/lit8 v0, v0, -0x1

    add-int/lit8 v0, v0, -0x2

    new-array v0, v0, [B

    iput-object v0, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->i:[B

    goto :goto_1
.end method

.method public reset()V
    .locals 2

    const/4 v1, 0x0

    iget-object v0, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->a:Lorg/bouncycastle/crypto/Digest;

    invoke-interface {v0}, Lorg/bouncycastle/crypto/Digest;->reset()V

    iput v1, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->j:I

    iget-object v0, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->i:[B

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->i:[B

    invoke-direct {p0, v0}, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->clearBlock([B)V

    :cond_0
    iget-object v0, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->m:[B

    if-eqz v0, :cond_1

    iget-object v0, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->m:[B

    invoke-direct {p0, v0}, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->clearBlock([B)V

    const/4 v0, 0x0

    iput-object v0, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->m:[B

    :cond_1
    iput-boolean v1, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->l:Z

    return-void
.end method

.method public update(B)V
    .locals 3

    iget v0, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->j:I

    iget-object v1, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->i:[B

    array-length v1, v1

    if-ge v0, v1, :cond_0

    iget-object v0, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->i:[B

    iget v1, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->j:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->j:I

    aput-byte p1, v0, v1

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->a:Lorg/bouncycastle/crypto/Digest;

    invoke-interface {v0, p1}, Lorg/bouncycastle/crypto/Digest;->update(B)V

    goto :goto_0
.end method

.method public update([BII)V
    .locals 2

    :goto_0
    if-lez p3, :cond_0

    iget v0, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->j:I

    iget-object v1, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->i:[B

    array-length v1, v1

    if-ge v0, v1, :cond_0

    aget-byte v0, p1, p2

    invoke-virtual {p0, v0}, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->update(B)V

    add-int/lit8 p2, p2, 0x1

    add-int/lit8 p3, p3, -0x1

    goto :goto_0

    :cond_0
    if-lez p3, :cond_1

    iget-object v0, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->a:Lorg/bouncycastle/crypto/Digest;

    invoke-interface {v0, p1, p2, p3}, Lorg/bouncycastle/crypto/Digest;->update([BII)V

    :cond_1
    return-void
.end method

.method public updateWithRecoveredMessage([B)V
    .locals 2

    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "not implemented"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public verifySignature([B)Z
    .locals 11

    const/16 v10, 0x8

    const/4 v2, 0x1

    const/4 v4, 0x0

    :try_start_0
    iget-object v0, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->b:Lorg/bouncycastle/crypto/AsymmetricBlockCipher;

    const/4 v1, 0x0

    array-length v3, p1

    invoke-interface {v0, p1, v1, v3}, Lorg/bouncycastle/crypto/AsymmetricBlockCipher;->processBlock([BII)[B
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    array-length v0, v1

    iget v3, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->g:I

    add-int/lit8 v3, v3, 0x7

    div-int/lit8 v3, v3, 0x8

    if-ge v0, v3, :cond_c

    iget v0, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->g:I

    add-int/lit8 v0, v0, 0x7

    div-int/lit8 v0, v0, 0x8

    new-array v0, v0, [B

    array-length v3, v0

    array-length v5, v1

    sub-int/2addr v3, v5

    array-length v5, v1

    invoke-static {v1, v4, v0, v3, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-direct {p0, v1}, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->clearBlock([B)V

    :goto_0
    array-length v1, v0

    add-int/lit8 v1, v1, -0x1

    aget-byte v1, v0, v1

    and-int/lit16 v1, v1, 0xff

    xor-int/lit16 v1, v1, 0xbc

    if-nez v1, :cond_0

    move v1, v2

    :goto_1
    iget v3, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->e:I

    new-array v5, v3, [B

    iget-object v3, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->a:Lorg/bouncycastle/crypto/Digest;

    invoke-interface {v3, v5, v4}, Lorg/bouncycastle/crypto/Digest;->doFinal([BI)I

    array-length v3, v0

    iget v6, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->e:I

    sub-int/2addr v3, v6

    sub-int/2addr v3, v1

    iget v6, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->e:I

    array-length v7, v0

    iget v8, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->e:I

    sub-int/2addr v7, v8

    sub-int/2addr v7, v1

    invoke-direct {p0, v0, v3, v6, v7}, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->maskGeneratorFunction1([BIII)[B

    move-result-object v6

    move v3, v4

    :goto_2
    array-length v7, v6

    if-eq v3, v7, :cond_2

    aget-byte v7, v0, v3

    aget-byte v8, v6, v3

    xor-int/2addr v7, v8

    int-to-byte v7, v7

    aput-byte v7, v0, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_0
    array-length v1, v0

    add-int/lit8 v1, v1, -0x2

    aget-byte v1, v0, v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x8

    array-length v3, v0

    add-int/lit8 v3, v3, -0x1

    aget-byte v3, v0, v3

    and-int/lit16 v3, v3, 0xff

    or-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "unrecognised hash in signature"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :sswitch_0
    iget-object v1, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->a:Lorg/bouncycastle/crypto/Digest;

    instance-of v1, v1, Lorg/bouncycastle/crypto/digests/RIPEMD160Digest;

    if-nez v1, :cond_1

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "signer should be initialised with RIPEMD160"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :sswitch_1
    iget-object v1, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->a:Lorg/bouncycastle/crypto/Digest;

    instance-of v1, v1, Lorg/bouncycastle/crypto/digests/SHA1Digest;

    if-nez v1, :cond_1

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "signer should be initialised with SHA1"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :sswitch_2
    iget-object v1, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->a:Lorg/bouncycastle/crypto/Digest;

    instance-of v1, v1, Lorg/bouncycastle/crypto/digests/RIPEMD128Digest;

    if-nez v1, :cond_1

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "signer should be initialised with RIPEMD128"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    const/4 v1, 0x2

    goto :goto_1

    :cond_2
    aget-byte v3, v0, v4

    and-int/lit8 v3, v3, 0x7f

    int-to-byte v3, v3

    aput-byte v3, v0, v4

    move v3, v4

    :goto_3
    array-length v7, v0

    if-eq v3, v7, :cond_3

    aget-byte v7, v0, v3

    if-eq v7, v2, :cond_3

    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    :cond_3
    add-int/lit8 v7, v3, 0x1

    array-length v3, v0

    if-lt v7, v3, :cond_4

    invoke-direct {p0, v0}, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->clearBlock([B)V

    :goto_4
    return v4

    :cond_4
    if-le v7, v2, :cond_7

    move v3, v2

    :goto_5
    iput-boolean v3, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->l:Z

    array-length v3, v6

    sub-int/2addr v3, v7

    iget v6, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->k:I

    sub-int/2addr v3, v6

    new-array v3, v3, [B

    iput-object v3, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->m:[B

    iget-object v3, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->m:[B

    iget-object v6, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->m:[B

    array-length v6, v6

    invoke-static {v0, v7, v3, v4, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    new-array v3, v10, [B

    iget-object v6, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->m:[B

    array-length v6, v6

    mul-int/lit8 v6, v6, 0x8

    int-to-long v8, v6

    invoke-direct {p0, v8, v9, v3}, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->LtoOSP(J[B)V

    iget-object v6, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->a:Lorg/bouncycastle/crypto/Digest;

    invoke-interface {v6, v3, v4, v10}, Lorg/bouncycastle/crypto/Digest;->update([BII)V

    iget-object v3, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->m:[B

    array-length v3, v3

    if-eqz v3, :cond_5

    iget-object v3, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->a:Lorg/bouncycastle/crypto/Digest;

    iget-object v6, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->m:[B

    iget-object v8, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->m:[B

    array-length v8, v8

    invoke-interface {v3, v6, v4, v8}, Lorg/bouncycastle/crypto/Digest;->update([BII)V

    :cond_5
    iget-object v3, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->a:Lorg/bouncycastle/crypto/Digest;

    array-length v6, v5

    invoke-interface {v3, v5, v4, v6}, Lorg/bouncycastle/crypto/Digest;->update([BII)V

    iget-object v3, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->a:Lorg/bouncycastle/crypto/Digest;

    iget-object v5, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->m:[B

    array-length v5, v5

    add-int/2addr v5, v7

    iget v6, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->k:I

    invoke-interface {v3, v0, v5, v6}, Lorg/bouncycastle/crypto/Digest;->update([BII)V

    iget-object v3, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->a:Lorg/bouncycastle/crypto/Digest;

    invoke-interface {v3}, Lorg/bouncycastle/crypto/Digest;->getDigestSize()I

    move-result v3

    new-array v5, v3, [B

    iget-object v3, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->a:Lorg/bouncycastle/crypto/Digest;

    invoke-interface {v3, v5, v4}, Lorg/bouncycastle/crypto/Digest;->doFinal([BI)I

    array-length v3, v0

    sub-int v1, v3, v1

    array-length v3, v5

    sub-int v6, v1, v3

    move v1, v4

    move v3, v2

    :goto_6
    array-length v7, v5

    if-eq v1, v7, :cond_8

    aget-byte v7, v5, v1

    add-int v8, v6, v1

    aget-byte v8, v0, v8

    if-eq v7, v8, :cond_6

    move v3, v4

    :cond_6
    add-int/lit8 v1, v1, 0x1

    goto :goto_6

    :cond_7
    move v3, v4

    goto :goto_5

    :cond_8
    invoke-direct {p0, v0}, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->clearBlock([B)V

    invoke-direct {p0, v5}, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->clearBlock([B)V

    if-nez v3, :cond_9

    iput-boolean v4, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->l:Z

    iget-object v0, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->m:[B

    invoke-direct {p0, v0}, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->clearBlock([B)V

    goto :goto_4

    :cond_9
    iget v0, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->j:I

    if-eqz v0, :cond_b

    iget-object v0, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->i:[B

    iget-object v1, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->m:[B

    invoke-direct {p0, v0, v1}, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->isSameAs([B[B)Z

    move-result v0

    if-nez v0, :cond_a

    iget-object v0, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->i:[B

    invoke-direct {p0, v0}, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->clearBlock([B)V

    goto/16 :goto_4

    :cond_a
    iput v4, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->j:I

    :cond_b
    iget-object v0, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->i:[B

    invoke-direct {p0, v0}, Lorg/bouncycastle/crypto/signers/ISO9796d2PSSSigner;->clearBlock([B)V

    move v4, v2

    goto/16 :goto_4

    :catch_0
    move-exception v0

    goto/16 :goto_4

    :cond_c
    move-object v0, v1

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        0x31cc -> :sswitch_0
        0x32cc -> :sswitch_2
        0x33cc -> :sswitch_1
    .end sparse-switch
.end method
