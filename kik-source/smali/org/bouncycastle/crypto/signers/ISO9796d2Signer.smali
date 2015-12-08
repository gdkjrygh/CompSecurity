.class public Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/bouncycastle/crypto/SignerWithRecovery;


# static fields
.field private static a:Ljava/util/Hashtable;


# instance fields
.field private b:Lorg/bouncycastle/crypto/Digest;

.field private c:Lorg/bouncycastle/crypto/AsymmetricBlockCipher;

.field private d:I

.field private e:I

.field private f:[B

.field private g:[B

.field private h:I

.field private i:Z

.field private j:[B

.field private k:[B

.field private l:[B


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Ljava/util/Hashtable;

    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    sput-object v0, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->a:Ljava/util/Hashtable;

    const-string v1, "RIPEMD128"

    new-instance v2, Ljava/lang/Integer;

    const/16 v3, 0x32cc

    invoke-direct {v2, v3}, Ljava/lang/Integer;-><init>(I)V

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->a:Ljava/util/Hashtable;

    const-string v1, "RIPEMD160"

    new-instance v2, Ljava/lang/Integer;

    const/16 v3, 0x31cc

    invoke-direct {v2, v3}, Ljava/lang/Integer;-><init>(I)V

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->a:Ljava/util/Hashtable;

    const-string v1, "SHA-1"

    new-instance v2, Ljava/lang/Integer;

    const/16 v3, 0x33cc

    invoke-direct {v2, v3}, Ljava/lang/Integer;-><init>(I)V

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->a:Ljava/util/Hashtable;

    const-string v1, "SHA-256"

    new-instance v2, Ljava/lang/Integer;

    const/16 v3, 0x34cc

    invoke-direct {v2, v3}, Ljava/lang/Integer;-><init>(I)V

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->a:Ljava/util/Hashtable;

    const-string v1, "SHA-384"

    new-instance v2, Ljava/lang/Integer;

    const/16 v3, 0x36cc

    invoke-direct {v2, v3}, Ljava/lang/Integer;-><init>(I)V

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->a:Ljava/util/Hashtable;

    const-string v1, "SHA-512"

    new-instance v2, Ljava/lang/Integer;

    const/16 v3, 0x35cc

    invoke-direct {v2, v3}, Ljava/lang/Integer;-><init>(I)V

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->a:Ljava/util/Hashtable;

    const-string v1, "Whirlpool"

    new-instance v2, Ljava/lang/Integer;

    const/16 v3, 0x37cc

    invoke-direct {v2, v3}, Ljava/lang/Integer;-><init>(I)V

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lorg/bouncycastle/crypto/AsymmetricBlockCipher;Lorg/bouncycastle/crypto/Digest;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;-><init>(Lorg/bouncycastle/crypto/AsymmetricBlockCipher;Lorg/bouncycastle/crypto/Digest;Z)V

    return-void
.end method

.method public constructor <init>(Lorg/bouncycastle/crypto/AsymmetricBlockCipher;Lorg/bouncycastle/crypto/Digest;Z)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->c:Lorg/bouncycastle/crypto/AsymmetricBlockCipher;

    iput-object p2, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->b:Lorg/bouncycastle/crypto/Digest;

    if-eqz p3, :cond_0

    const/16 v0, 0xbc

    iput v0, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->d:I

    :goto_0
    return-void

    :cond_0
    sget-object v0, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->a:Ljava/util/Hashtable;

    invoke-interface {p2}, Lorg/bouncycastle/crypto/Digest;->getAlgorithmName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->d:I

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "no valid trailer for digest"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
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

    iget v2, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->h:I

    iget-object v3, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->g:[B

    array-length v3, v3

    if-le v2, v3, :cond_2

    iget-object v2, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->g:[B

    array-length v2, v2

    array-length v3, p2

    if-le v2, v3, :cond_0

    move v0, v1

    :cond_0
    move v2, v0

    move v0, v1

    :goto_0
    iget-object v3, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->g:[B

    array-length v3, v3

    if-eq v0, v3, :cond_5

    aget-byte v3, p1, v0

    aget-byte v4, p2, v0

    if-eq v3, v4, :cond_1

    move v2, v1

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    iget v2, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->h:I

    array-length v3, p2

    if-eq v2, v3, :cond_3

    move v0, v1

    :cond_3
    move v2, v0

    move v0, v1

    :goto_1
    array-length v3, p2

    if-eq v0, v3, :cond_5

    aget-byte v3, p1, v0

    aget-byte v4, p2, v0

    if-eq v3, v4, :cond_4

    move v2, v1

    :cond_4
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_5
    return v2
.end method

.method private returnFalse([B)Z
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->g:[B

    invoke-direct {p0, v0}, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->clearBlock([B)V

    invoke-direct {p0, p1}, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->clearBlock([B)V

    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public generateSignature()[B
    .locals 7

    const/4 v6, 0x0

    iget-object v0, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->b:Lorg/bouncycastle/crypto/Digest;

    invoke-interface {v0}, Lorg/bouncycastle/crypto/Digest;->getDigestSize()I

    move-result v2

    iget v0, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->d:I

    const/16 v1, 0xbc

    if-ne v0, v1, :cond_0

    const/16 v1, 0x8

    iget-object v0, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->f:[B

    array-length v0, v0

    sub-int/2addr v0, v2

    add-int/lit8 v0, v0, -0x1

    iget-object v3, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->b:Lorg/bouncycastle/crypto/Digest;

    iget-object v4, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->f:[B

    invoke-interface {v3, v4, v0}, Lorg/bouncycastle/crypto/Digest;->doFinal([BI)I

    iget-object v3, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->f:[B

    iget-object v4, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->f:[B

    array-length v4, v4

    add-int/lit8 v4, v4, -0x1

    const/16 v5, -0x44

    aput-byte v5, v3, v4

    :goto_0
    iget v3, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->h:I

    add-int/2addr v2, v3

    mul-int/lit8 v2, v2, 0x8

    add-int/2addr v1, v2

    add-int/lit8 v1, v1, 0x4

    iget v2, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->e:I

    sub-int/2addr v1, v2

    if-lez v1, :cond_1

    iget v2, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->h:I

    add-int/lit8 v1, v1, 0x7

    div-int/lit8 v1, v1, 0x8

    sub-int/2addr v2, v1

    const/16 v1, 0x60

    sub-int/2addr v0, v2

    iget-object v3, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->g:[B

    iget-object v4, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->f:[B

    invoke-static {v3, v6, v4, v0, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move v2, v1

    move v1, v0

    :goto_1
    add-int/lit8 v0, v1, -0x1

    if-lez v0, :cond_3

    add-int/lit8 v0, v1, -0x1

    :goto_2
    if-eqz v0, :cond_2

    iget-object v3, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->f:[B

    const/16 v4, -0x45

    aput-byte v4, v3, v0

    add-int/lit8 v0, v0, -0x1

    goto :goto_2

    :cond_0
    const/16 v1, 0x10

    iget-object v0, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->f:[B

    array-length v0, v0

    sub-int/2addr v0, v2

    add-int/lit8 v0, v0, -0x2

    iget-object v3, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->b:Lorg/bouncycastle/crypto/Digest;

    iget-object v4, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->f:[B

    invoke-interface {v3, v4, v0}, Lorg/bouncycastle/crypto/Digest;->doFinal([BI)I

    iget-object v3, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->f:[B

    iget-object v4, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->f:[B

    array-length v4, v4

    add-int/lit8 v4, v4, -0x2

    iget v5, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->d:I

    ushr-int/lit8 v5, v5, 0x8

    int-to-byte v5, v5

    aput-byte v5, v3, v4

    iget-object v3, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->f:[B

    iget-object v4, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->f:[B

    array-length v4, v4

    add-int/lit8 v4, v4, -0x1

    iget v5, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->d:I

    int-to-byte v5, v5

    aput-byte v5, v3, v4

    goto :goto_0

    :cond_1
    const/16 v1, 0x40

    iget v2, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->h:I

    sub-int/2addr v0, v2

    iget-object v2, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->g:[B

    iget-object v3, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->f:[B

    iget v4, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->h:I

    invoke-static {v2, v6, v3, v0, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move v2, v1

    move v1, v0

    goto :goto_1

    :cond_2
    iget-object v0, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->f:[B

    add-int/lit8 v1, v1, -0x1

    aget-byte v3, v0, v1

    xor-int/lit8 v3, v3, 0x1

    int-to-byte v3, v3

    aput-byte v3, v0, v1

    iget-object v0, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->f:[B

    const/16 v1, 0xb

    aput-byte v1, v0, v6

    iget-object v0, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->f:[B

    aget-byte v1, v0, v6

    or-int/2addr v1, v2

    int-to-byte v1, v1

    aput-byte v1, v0, v6

    :goto_3
    iget-object v0, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->c:Lorg/bouncycastle/crypto/AsymmetricBlockCipher;

    iget-object v1, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->f:[B

    iget-object v2, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->f:[B

    array-length v2, v2

    invoke-interface {v0, v1, v6, v2}, Lorg/bouncycastle/crypto/AsymmetricBlockCipher;->processBlock([BII)[B

    move-result-object v0

    iget-object v1, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->g:[B

    invoke-direct {p0, v1}, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->clearBlock([B)V

    iget-object v1, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->f:[B

    invoke-direct {p0, v1}, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->clearBlock([B)V

    return-object v0

    :cond_3
    iget-object v0, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->f:[B

    const/16 v1, 0xa

    aput-byte v1, v0, v6

    iget-object v0, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->f:[B

    aget-byte v1, v0, v6

    or-int/2addr v1, v2

    int-to-byte v1, v1

    aput-byte v1, v0, v6

    goto :goto_3
.end method

.method public getRecoveredMessage()[B
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->j:[B

    return-object v0
.end method

.method public hasFullMessage()Z
    .locals 1

    iget-boolean v0, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->i:Z

    return v0
.end method

.method public init(ZLorg/bouncycastle/crypto/CipherParameters;)V
    .locals 2

    check-cast p2, Lorg/bouncycastle/crypto/params/RSAKeyParameters;

    iget-object v0, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->c:Lorg/bouncycastle/crypto/AsymmetricBlockCipher;

    invoke-interface {v0, p1, p2}, Lorg/bouncycastle/crypto/AsymmetricBlockCipher;->init(ZLorg/bouncycastle/crypto/CipherParameters;)V

    invoke-virtual {p2}, Lorg/bouncycastle/crypto/params/RSAKeyParameters;->getModulus()Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigInteger;->bitLength()I

    move-result v0

    iput v0, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->e:I

    iget v0, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->e:I

    add-int/lit8 v0, v0, 0x7

    div-int/lit8 v0, v0, 0x8

    new-array v0, v0, [B

    iput-object v0, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->f:[B

    iget v0, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->d:I

    const/16 v1, 0xbc

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->f:[B

    array-length v0, v0

    iget-object v1, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->b:Lorg/bouncycastle/crypto/Digest;

    invoke-interface {v1}, Lorg/bouncycastle/crypto/Digest;->getDigestSize()I

    move-result v1

    sub-int/2addr v0, v1

    add-int/lit8 v0, v0, -0x2

    new-array v0, v0, [B

    iput-object v0, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->g:[B

    :goto_0
    invoke-virtual {p0}, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->reset()V

    return-void

    :cond_0
    iget-object v0, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->f:[B

    array-length v0, v0

    iget-object v1, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->b:Lorg/bouncycastle/crypto/Digest;

    invoke-interface {v1}, Lorg/bouncycastle/crypto/Digest;->getDigestSize()I

    move-result v1

    sub-int/2addr v0, v1

    add-int/lit8 v0, v0, -0x3

    new-array v0, v0, [B

    iput-object v0, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->g:[B

    goto :goto_0
.end method

.method public reset()V
    .locals 2

    const/4 v1, 0x0

    iget-object v0, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->b:Lorg/bouncycastle/crypto/Digest;

    invoke-interface {v0}, Lorg/bouncycastle/crypto/Digest;->reset()V

    iput v1, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->h:I

    iget-object v0, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->g:[B

    invoke-direct {p0, v0}, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->clearBlock([B)V

    iget-object v0, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->j:[B

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->j:[B

    invoke-direct {p0, v0}, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->clearBlock([B)V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->j:[B

    iput-boolean v1, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->i:Z

    return-void
.end method

.method public update(B)V
    .locals 2

    iget-object v0, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->b:Lorg/bouncycastle/crypto/Digest;

    invoke-interface {v0, p1}, Lorg/bouncycastle/crypto/Digest;->update(B)V

    iget-object v0, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->k:[B

    if-nez v0, :cond_0

    iget v0, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->h:I

    iget-object v1, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->g:[B

    array-length v1, v1

    if-ge v0, v1, :cond_0

    iget-object v0, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->g:[B

    iget v1, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->h:I

    aput-byte p1, v0, v1

    :cond_0
    iget v0, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->h:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->h:I

    return-void
.end method

.method public update([BII)V
    .locals 4

    iget-object v0, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->b:Lorg/bouncycastle/crypto/Digest;

    invoke-interface {v0, p1, p2, p3}, Lorg/bouncycastle/crypto/Digest;->update([BII)V

    iget-object v0, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->k:[B

    if-nez v0, :cond_0

    iget v0, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->h:I

    iget-object v1, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->g:[B

    array-length v1, v1

    if-ge v0, v1, :cond_0

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p3, :cond_0

    iget v1, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->h:I

    add-int/2addr v1, v0

    iget-object v2, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->g:[B

    array-length v2, v2

    if-ge v1, v2, :cond_0

    iget-object v1, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->g:[B

    iget v2, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->h:I

    add-int/2addr v2, v0

    add-int v3, p2, v0

    aget-byte v3, p1, v3

    aput-byte v3, v1, v2

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    iget v0, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->h:I

    add-int/2addr v0, p3

    iput v0, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->h:I

    return-void
.end method

.method public updateWithRecoveredMessage([B)V
    .locals 6

    const/4 v1, 0x1

    const/4 v3, 0x0

    iget-object v0, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->c:Lorg/bouncycastle/crypto/AsymmetricBlockCipher;

    array-length v2, p1

    invoke-interface {v0, p1, v3, v2}, Lorg/bouncycastle/crypto/AsymmetricBlockCipher;->processBlock([BII)[B

    move-result-object v4

    aget-byte v0, v4, v3

    and-int/lit16 v0, v0, 0xc0

    xor-int/lit8 v0, v0, 0x40

    if-eqz v0, :cond_0

    new-instance v0, Lorg/bouncycastle/crypto/InvalidCipherTextException;

    const-string v1, "malformed signature"

    invoke-direct {v0, v1}, Lorg/bouncycastle/crypto/InvalidCipherTextException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    array-length v0, v4

    add-int/lit8 v0, v0, -0x1

    aget-byte v0, v4, v0

    and-int/lit8 v0, v0, 0xf

    xor-int/lit8 v0, v0, 0xc

    if-eqz v0, :cond_1

    new-instance v0, Lorg/bouncycastle/crypto/InvalidCipherTextException;

    const-string v1, "malformed signature"

    invoke-direct {v0, v1}, Lorg/bouncycastle/crypto/InvalidCipherTextException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    array-length v0, v4

    add-int/lit8 v0, v0, -0x1

    aget-byte v0, v4, v0

    and-int/lit16 v0, v0, 0xff

    xor-int/lit16 v0, v0, 0xbc

    if-nez v0, :cond_2

    move v0, v1

    :goto_0
    move v2, v3

    :goto_1
    array-length v5, v4

    if-eq v2, v5, :cond_5

    aget-byte v5, v4, v2

    and-int/lit8 v5, v5, 0xf

    xor-int/lit8 v5, v5, 0xa

    if-eqz v5, :cond_5

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_2
    array-length v0, v4

    add-int/lit8 v0, v0, -0x2

    aget-byte v0, v4, v0

    and-int/lit16 v0, v0, 0xff

    shl-int/lit8 v0, v0, 0x8

    array-length v2, v4

    add-int/lit8 v2, v2, -0x1

    aget-byte v2, v4, v2

    and-int/lit16 v2, v2, 0xff

    or-int/2addr v2, v0

    sget-object v0, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->a:Ljava/util/Hashtable;

    iget-object v5, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->b:Lorg/bouncycastle/crypto/Digest;

    invoke-interface {v5}, Lorg/bouncycastle/crypto/Digest;->getAlgorithmName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-eq v2, v0, :cond_4

    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "signer initialised with wrong digest for trailer "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "unrecognised hash in signature"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    const/4 v0, 0x2

    goto :goto_0

    :cond_5
    add-int/lit8 v2, v2, 0x1

    array-length v5, v4

    sub-int v0, v5, v0

    iget-object v5, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->b:Lorg/bouncycastle/crypto/Digest;

    invoke-interface {v5}, Lorg/bouncycastle/crypto/Digest;->getDigestSize()I

    move-result v5

    sub-int/2addr v0, v5

    sub-int v5, v0, v2

    if-gtz v5, :cond_6

    new-instance v0, Lorg/bouncycastle/crypto/InvalidCipherTextException;

    const-string v1, "malformed block"

    invoke-direct {v0, v1}, Lorg/bouncycastle/crypto/InvalidCipherTextException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_6
    aget-byte v5, v4, v3

    and-int/lit8 v5, v5, 0x20

    if-nez v5, :cond_7

    iput-boolean v1, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->i:Z

    sub-int/2addr v0, v2

    new-array v0, v0, [B

    iput-object v0, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->j:[B

    iget-object v0, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->j:[B

    iget-object v1, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->j:[B

    array-length v1, v1

    invoke-static {v4, v2, v0, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :goto_2
    iput-object p1, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->k:[B

    iput-object v4, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->l:[B

    iget-object v0, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->b:Lorg/bouncycastle/crypto/Digest;

    iget-object v1, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->j:[B

    iget-object v2, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->j:[B

    array-length v2, v2

    invoke-interface {v0, v1, v3, v2}, Lorg/bouncycastle/crypto/Digest;->update([BII)V

    iget-object v0, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->j:[B

    array-length v0, v0

    iput v0, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->h:I

    return-void

    :cond_7
    iput-boolean v3, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->i:Z

    sub-int/2addr v0, v2

    new-array v0, v0, [B

    iput-object v0, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->j:[B

    iget-object v0, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->j:[B

    iget-object v1, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->j:[B

    array-length v1, v1

    invoke-static {v4, v2, v0, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_2
.end method

.method public verifySignature([B)Z
    .locals 12

    const/4 v1, 0x0

    const/4 v3, 0x1

    const/4 v2, 0x0

    iget-object v0, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->k:[B

    if-nez v0, :cond_0

    :try_start_0
    iget-object v0, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->c:Lorg/bouncycastle/crypto/AsymmetricBlockCipher;

    const/4 v1, 0x0

    array-length v4, p1

    invoke-interface {v0, p1, v1, v4}, Lorg/bouncycastle/crypto/AsymmetricBlockCipher;->processBlock([BII)[B
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move v1, v2

    move-object v4, v0

    :goto_0
    aget-byte v0, v4, v2

    and-int/lit16 v0, v0, 0xc0

    xor-int/lit8 v0, v0, 0x40

    if-eqz v0, :cond_2

    invoke-direct {p0, v4}, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->returnFalse([B)Z

    move-result v2

    :goto_1
    return v2

    :cond_0
    iget-object v0, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->k:[B

    invoke-static {v0, p1}, Lorg/bouncycastle/util/Arrays;->a([B[B)Z

    move-result v0

    if-nez v0, :cond_1

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "updateWithRecoveredMessage called on different signature"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget-object v0, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->l:[B

    iput-object v1, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->k:[B

    iput-object v1, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->l:[B

    move v1, v3

    move-object v4, v0

    goto :goto_0

    :cond_2
    array-length v0, v4

    add-int/lit8 v0, v0, -0x1

    aget-byte v0, v4, v0

    and-int/lit8 v0, v0, 0xf

    xor-int/lit8 v0, v0, 0xc

    if-eqz v0, :cond_3

    invoke-direct {p0, v4}, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->returnFalse([B)Z

    move-result v2

    goto :goto_1

    :cond_3
    array-length v0, v4

    add-int/lit8 v0, v0, -0x1

    aget-byte v0, v4, v0

    and-int/lit16 v0, v0, 0xff

    xor-int/lit16 v0, v0, 0xbc

    if-nez v0, :cond_4

    move v0, v3

    :goto_2
    move v5, v2

    :goto_3
    array-length v6, v4

    if-eq v5, v6, :cond_7

    aget-byte v6, v4, v5

    and-int/lit8 v6, v6, 0xf

    xor-int/lit8 v6, v6, 0xa

    if-eqz v6, :cond_7

    add-int/lit8 v5, v5, 0x1

    goto :goto_3

    :cond_4
    array-length v0, v4

    add-int/lit8 v0, v0, -0x2

    aget-byte v0, v4, v0

    and-int/lit16 v0, v0, 0xff

    shl-int/lit8 v0, v0, 0x8

    array-length v5, v4

    add-int/lit8 v5, v5, -0x1

    aget-byte v5, v4, v5

    and-int/lit16 v5, v5, 0xff

    or-int/2addr v5, v0

    sget-object v0, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->a:Ljava/util/Hashtable;

    iget-object v6, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->b:Lorg/bouncycastle/crypto/Digest;

    invoke-interface {v6}, Lorg/bouncycastle/crypto/Digest;->getAlgorithmName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0, v6}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-eq v5, v0, :cond_6

    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "signer initialised with wrong digest for trailer "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "unrecognised hash in signature"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_6
    const/4 v0, 0x2

    goto :goto_2

    :cond_7
    add-int/lit8 v6, v5, 0x1

    iget-object v5, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->b:Lorg/bouncycastle/crypto/Digest;

    invoke-interface {v5}, Lorg/bouncycastle/crypto/Digest;->getDigestSize()I

    move-result v5

    new-array v7, v5, [B

    array-length v5, v4

    sub-int v0, v5, v0

    array-length v5, v7

    sub-int v8, v0, v5

    sub-int v0, v8, v6

    if-gtz v0, :cond_8

    invoke-direct {p0, v4}, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->returnFalse([B)Z

    move-result v2

    goto/16 :goto_1

    :cond_8
    aget-byte v0, v4, v2

    and-int/lit8 v0, v0, 0x20

    if-nez v0, :cond_d

    iput-boolean v3, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->i:Z

    iget v0, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->h:I

    sub-int v5, v8, v6

    if-le v0, v5, :cond_9

    invoke-direct {p0, v4}, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->returnFalse([B)Z

    move-result v2

    goto/16 :goto_1

    :cond_9
    iget-object v0, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->b:Lorg/bouncycastle/crypto/Digest;

    invoke-interface {v0}, Lorg/bouncycastle/crypto/Digest;->reset()V

    iget-object v0, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->b:Lorg/bouncycastle/crypto/Digest;

    sub-int v5, v8, v6

    invoke-interface {v0, v4, v6, v5}, Lorg/bouncycastle/crypto/Digest;->update([BII)V

    iget-object v0, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->b:Lorg/bouncycastle/crypto/Digest;

    invoke-interface {v0, v7, v2}, Lorg/bouncycastle/crypto/Digest;->doFinal([BI)I

    move v0, v2

    move v5, v3

    :goto_4
    array-length v9, v7

    if-eq v0, v9, :cond_b

    add-int v9, v8, v0

    aget-byte v10, v4, v9

    aget-byte v11, v7, v0

    xor-int/2addr v10, v11

    int-to-byte v10, v10

    aput-byte v10, v4, v9

    add-int v9, v8, v0

    aget-byte v9, v4, v9

    if-eqz v9, :cond_a

    move v5, v2

    :cond_a
    add-int/lit8 v0, v0, 0x1

    goto :goto_4

    :cond_b
    if-nez v5, :cond_c

    invoke-direct {p0, v4}, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->returnFalse([B)Z

    move-result v2

    goto/16 :goto_1

    :cond_c
    sub-int v0, v8, v6

    new-array v0, v0, [B

    iput-object v0, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->j:[B

    iget-object v0, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->j:[B

    iget-object v5, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->j:[B

    array-length v5, v5

    invoke-static {v4, v6, v0, v2, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :goto_5
    iget v0, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->h:I

    if-eqz v0, :cond_11

    if-nez v1, :cond_11

    iget-object v0, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->g:[B

    iget-object v1, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->j:[B

    invoke-direct {p0, v0, v1}, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->isSameAs([B[B)Z

    move-result v0

    if-nez v0, :cond_11

    invoke-direct {p0, v4}, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->returnFalse([B)Z

    move-result v2

    goto/16 :goto_1

    :cond_d
    iput-boolean v2, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->i:Z

    iget-object v0, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->b:Lorg/bouncycastle/crypto/Digest;

    invoke-interface {v0, v7, v2}, Lorg/bouncycastle/crypto/Digest;->doFinal([BI)I

    move v0, v2

    move v5, v3

    :goto_6
    array-length v9, v7

    if-eq v0, v9, :cond_f

    add-int v9, v8, v0

    aget-byte v10, v4, v9

    aget-byte v11, v7, v0

    xor-int/2addr v10, v11

    int-to-byte v10, v10

    aput-byte v10, v4, v9

    add-int v9, v8, v0

    aget-byte v9, v4, v9

    if-eqz v9, :cond_e

    move v5, v2

    :cond_e
    add-int/lit8 v0, v0, 0x1

    goto :goto_6

    :cond_f
    if-nez v5, :cond_10

    invoke-direct {p0, v4}, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->returnFalse([B)Z

    move-result v2

    goto/16 :goto_1

    :cond_10
    sub-int v0, v8, v6

    new-array v0, v0, [B

    iput-object v0, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->j:[B

    iget-object v0, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->j:[B

    iget-object v5, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->j:[B

    array-length v5, v5

    invoke-static {v4, v6, v0, v2, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_5

    :cond_11
    iget-object v0, p0, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->g:[B

    invoke-direct {p0, v0}, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->clearBlock([B)V

    invoke-direct {p0, v4}, Lorg/bouncycastle/crypto/signers/ISO9796d2Signer;->clearBlock([B)V

    move v2, v3

    goto/16 :goto_1

    :catch_0
    move-exception v0

    goto/16 :goto_1
.end method
