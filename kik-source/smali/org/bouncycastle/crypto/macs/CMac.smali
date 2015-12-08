.class public Lorg/bouncycastle/crypto/macs/CMac;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/bouncycastle/crypto/Mac;


# instance fields
.field private a:[B

.field private b:[B

.field private c:[B

.field private d:I

.field private e:Lorg/bouncycastle/crypto/BlockCipher;

.field private f:I

.field private g:[B

.field private h:[B

.field private i:[B


# direct methods
.method public constructor <init>(Lorg/bouncycastle/crypto/BlockCipher;)V
    .locals 1

    invoke-interface {p1}, Lorg/bouncycastle/crypto/BlockCipher;->getBlockSize()I

    move-result v0

    mul-int/lit8 v0, v0, 0x8

    invoke-direct {p0, p1, v0}, Lorg/bouncycastle/crypto/macs/CMac;-><init>(Lorg/bouncycastle/crypto/BlockCipher;I)V

    return-void
.end method

.method public constructor <init>(Lorg/bouncycastle/crypto/BlockCipher;I)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    rem-int/lit8 v0, p2, 0x8

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "MAC size must be multiple of 8"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    invoke-interface {p1}, Lorg/bouncycastle/crypto/BlockCipher;->getBlockSize()I

    move-result v0

    mul-int/lit8 v0, v0, 0x8

    if-le p2, v0, :cond_1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "MAC size must be less or equal to "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {p1}, Lorg/bouncycastle/crypto/BlockCipher;->getBlockSize()I

    move-result v2

    mul-int/lit8 v2, v2, 0x8

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-interface {p1}, Lorg/bouncycastle/crypto/BlockCipher;->getBlockSize()I

    move-result v0

    const/16 v1, 0x8

    if-eq v0, v1, :cond_2

    invoke-interface {p1}, Lorg/bouncycastle/crypto/BlockCipher;->getBlockSize()I

    move-result v0

    const/16 v1, 0x10

    if-eq v0, v1, :cond_2

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Block size must be either 64 or 128 bits"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    new-instance v0, Lorg/bouncycastle/crypto/modes/CBCBlockCipher;

    invoke-direct {v0, p1}, Lorg/bouncycastle/crypto/modes/CBCBlockCipher;-><init>(Lorg/bouncycastle/crypto/BlockCipher;)V

    iput-object v0, p0, Lorg/bouncycastle/crypto/macs/CMac;->e:Lorg/bouncycastle/crypto/BlockCipher;

    div-int/lit8 v0, p2, 0x8

    iput v0, p0, Lorg/bouncycastle/crypto/macs/CMac;->f:I

    invoke-interface {p1}, Lorg/bouncycastle/crypto/BlockCipher;->getBlockSize()I

    move-result v0

    new-array v0, v0, [B

    iput-object v0, p0, Lorg/bouncycastle/crypto/macs/CMac;->b:[B

    invoke-interface {p1}, Lorg/bouncycastle/crypto/BlockCipher;->getBlockSize()I

    move-result v0

    new-array v0, v0, [B

    iput-object v0, p0, Lorg/bouncycastle/crypto/macs/CMac;->c:[B

    invoke-interface {p1}, Lorg/bouncycastle/crypto/BlockCipher;->getBlockSize()I

    move-result v0

    new-array v0, v0, [B

    iput-object v0, p0, Lorg/bouncycastle/crypto/macs/CMac;->a:[B

    const/4 v0, 0x0

    iput v0, p0, Lorg/bouncycastle/crypto/macs/CMac;->d:I

    return-void
.end method

.method private doubleLu([B)[B
    .locals 5

    const/4 v0, 0x0

    aget-byte v1, p1, v0

    and-int/lit16 v1, v1, 0xff

    shr-int/lit8 v1, v1, 0x7

    array-length v2, p1

    new-array v2, v2, [B

    :goto_0
    array-length v3, p1

    add-int/lit8 v3, v3, -0x1

    if-ge v0, v3, :cond_0

    aget-byte v3, p1, v0

    shl-int/lit8 v3, v3, 0x1

    add-int/lit8 v4, v0, 0x1

    aget-byte v4, p1, v4

    and-int/lit16 v4, v4, 0xff

    shr-int/lit8 v4, v4, 0x7

    add-int/2addr v3, v4

    int-to-byte v3, v3

    aput-byte v3, v2, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    array-length v0, p1

    add-int/lit8 v0, v0, -0x1

    array-length v3, p1

    add-int/lit8 v3, v3, -0x1

    aget-byte v3, p1, v3

    shl-int/lit8 v3, v3, 0x1

    int-to-byte v3, v3

    aput-byte v3, v2, v0

    const/4 v0, 0x1

    if-ne v1, v0, :cond_1

    array-length v0, p1

    add-int/lit8 v1, v0, -0x1

    aget-byte v3, v2, v1

    array-length v0, p1

    const/16 v4, 0x10

    if-ne v0, v4, :cond_2

    const/16 v0, -0x79

    :goto_1
    xor-int/2addr v0, v3

    int-to-byte v0, v0

    aput-byte v0, v2, v1

    :cond_1
    return-object v2

    :cond_2
    const/16 v0, 0x1b

    goto :goto_1
.end method


# virtual methods
.method public doFinal([BI)I
    .locals 6

    const/4 v2, 0x0

    iget-object v0, p0, Lorg/bouncycastle/crypto/macs/CMac;->e:Lorg/bouncycastle/crypto/BlockCipher;

    invoke-interface {v0}, Lorg/bouncycastle/crypto/BlockCipher;->getBlockSize()I

    move-result v0

    iget v1, p0, Lorg/bouncycastle/crypto/macs/CMac;->d:I

    if-ne v1, v0, :cond_0

    iget-object v0, p0, Lorg/bouncycastle/crypto/macs/CMac;->h:[B

    :goto_0
    move v1, v2

    :goto_1
    iget-object v3, p0, Lorg/bouncycastle/crypto/macs/CMac;->b:[B

    array-length v3, v3

    if-ge v1, v3, :cond_1

    iget-object v3, p0, Lorg/bouncycastle/crypto/macs/CMac;->c:[B

    aget-byte v4, v3, v1

    aget-byte v5, v0, v1

    xor-int/2addr v4, v5

    int-to-byte v4, v4

    aput-byte v4, v3, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_0
    new-instance v0, Lorg/bouncycastle/crypto/paddings/ISO7816d4Padding;

    invoke-direct {v0}, Lorg/bouncycastle/crypto/paddings/ISO7816d4Padding;-><init>()V

    iget-object v1, p0, Lorg/bouncycastle/crypto/macs/CMac;->c:[B

    iget v3, p0, Lorg/bouncycastle/crypto/macs/CMac;->d:I

    invoke-virtual {v0, v1, v3}, Lorg/bouncycastle/crypto/paddings/ISO7816d4Padding;->addPadding([BI)I

    iget-object v0, p0, Lorg/bouncycastle/crypto/macs/CMac;->i:[B

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lorg/bouncycastle/crypto/macs/CMac;->e:Lorg/bouncycastle/crypto/BlockCipher;

    iget-object v1, p0, Lorg/bouncycastle/crypto/macs/CMac;->c:[B

    iget-object v3, p0, Lorg/bouncycastle/crypto/macs/CMac;->b:[B

    invoke-interface {v0, v1, v2, v3, v2}, Lorg/bouncycastle/crypto/BlockCipher;->processBlock([BI[BI)I

    iget-object v0, p0, Lorg/bouncycastle/crypto/macs/CMac;->b:[B

    iget v1, p0, Lorg/bouncycastle/crypto/macs/CMac;->f:I

    invoke-static {v0, v2, p1, p2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-virtual {p0}, Lorg/bouncycastle/crypto/macs/CMac;->reset()V

    iget v0, p0, Lorg/bouncycastle/crypto/macs/CMac;->f:I

    return v0
.end method

.method public getAlgorithmName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/crypto/macs/CMac;->e:Lorg/bouncycastle/crypto/BlockCipher;

    invoke-interface {v0}, Lorg/bouncycastle/crypto/BlockCipher;->getAlgorithmName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getMacSize()I
    .locals 1

    iget v0, p0, Lorg/bouncycastle/crypto/macs/CMac;->f:I

    return v0
.end method

.method public init(Lorg/bouncycastle/crypto/CipherParameters;)V
    .locals 5

    const/4 v4, 0x1

    const/4 v3, 0x0

    invoke-virtual {p0}, Lorg/bouncycastle/crypto/macs/CMac;->reset()V

    iget-object v0, p0, Lorg/bouncycastle/crypto/macs/CMac;->e:Lorg/bouncycastle/crypto/BlockCipher;

    invoke-interface {v0, v4, p1}, Lorg/bouncycastle/crypto/BlockCipher;->init(ZLorg/bouncycastle/crypto/CipherParameters;)V

    iget-object v0, p0, Lorg/bouncycastle/crypto/macs/CMac;->a:[B

    array-length v0, v0

    new-array v0, v0, [B

    iput-object v0, p0, Lorg/bouncycastle/crypto/macs/CMac;->g:[B

    iget-object v0, p0, Lorg/bouncycastle/crypto/macs/CMac;->e:Lorg/bouncycastle/crypto/BlockCipher;

    iget-object v1, p0, Lorg/bouncycastle/crypto/macs/CMac;->a:[B

    iget-object v2, p0, Lorg/bouncycastle/crypto/macs/CMac;->g:[B

    invoke-interface {v0, v1, v3, v2, v3}, Lorg/bouncycastle/crypto/BlockCipher;->processBlock([BI[BI)I

    iget-object v0, p0, Lorg/bouncycastle/crypto/macs/CMac;->g:[B

    invoke-direct {p0, v0}, Lorg/bouncycastle/crypto/macs/CMac;->doubleLu([B)[B

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/crypto/macs/CMac;->h:[B

    iget-object v0, p0, Lorg/bouncycastle/crypto/macs/CMac;->h:[B

    invoke-direct {p0, v0}, Lorg/bouncycastle/crypto/macs/CMac;->doubleLu([B)[B

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/crypto/macs/CMac;->i:[B

    iget-object v0, p0, Lorg/bouncycastle/crypto/macs/CMac;->e:Lorg/bouncycastle/crypto/BlockCipher;

    invoke-interface {v0, v4, p1}, Lorg/bouncycastle/crypto/BlockCipher;->init(ZLorg/bouncycastle/crypto/CipherParameters;)V

    return-void
.end method

.method public reset()V
    .locals 3

    const/4 v1, 0x0

    move v0, v1

    :goto_0
    iget-object v2, p0, Lorg/bouncycastle/crypto/macs/CMac;->c:[B

    array-length v2, v2

    if-ge v0, v2, :cond_0

    iget-object v2, p0, Lorg/bouncycastle/crypto/macs/CMac;->c:[B

    aput-byte v1, v2, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    iput v1, p0, Lorg/bouncycastle/crypto/macs/CMac;->d:I

    iget-object v0, p0, Lorg/bouncycastle/crypto/macs/CMac;->e:Lorg/bouncycastle/crypto/BlockCipher;

    invoke-interface {v0}, Lorg/bouncycastle/crypto/BlockCipher;->reset()V

    return-void
.end method

.method public update(B)V
    .locals 4

    const/4 v3, 0x0

    iget v0, p0, Lorg/bouncycastle/crypto/macs/CMac;->d:I

    iget-object v1, p0, Lorg/bouncycastle/crypto/macs/CMac;->c:[B

    array-length v1, v1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lorg/bouncycastle/crypto/macs/CMac;->e:Lorg/bouncycastle/crypto/BlockCipher;

    iget-object v1, p0, Lorg/bouncycastle/crypto/macs/CMac;->c:[B

    iget-object v2, p0, Lorg/bouncycastle/crypto/macs/CMac;->b:[B

    invoke-interface {v0, v1, v3, v2, v3}, Lorg/bouncycastle/crypto/BlockCipher;->processBlock([BI[BI)I

    iput v3, p0, Lorg/bouncycastle/crypto/macs/CMac;->d:I

    :cond_0
    iget-object v0, p0, Lorg/bouncycastle/crypto/macs/CMac;->c:[B

    iget v1, p0, Lorg/bouncycastle/crypto/macs/CMac;->d:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lorg/bouncycastle/crypto/macs/CMac;->d:I

    aput-byte p1, v0, v1

    return-void
.end method

.method public update([BII)V
    .locals 6

    const/4 v5, 0x0

    if-gez p3, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Can\'t have a negative input length!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-object v0, p0, Lorg/bouncycastle/crypto/macs/CMac;->e:Lorg/bouncycastle/crypto/BlockCipher;

    invoke-interface {v0}, Lorg/bouncycastle/crypto/BlockCipher;->getBlockSize()I

    move-result v0

    iget v1, p0, Lorg/bouncycastle/crypto/macs/CMac;->d:I

    sub-int v1, v0, v1

    if-le p3, v1, :cond_1

    iget-object v2, p0, Lorg/bouncycastle/crypto/macs/CMac;->c:[B

    iget v3, p0, Lorg/bouncycastle/crypto/macs/CMac;->d:I

    invoke-static {p1, p2, v2, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v2, p0, Lorg/bouncycastle/crypto/macs/CMac;->e:Lorg/bouncycastle/crypto/BlockCipher;

    iget-object v3, p0, Lorg/bouncycastle/crypto/macs/CMac;->c:[B

    iget-object v4, p0, Lorg/bouncycastle/crypto/macs/CMac;->b:[B

    invoke-interface {v2, v3, v5, v4, v5}, Lorg/bouncycastle/crypto/BlockCipher;->processBlock([BI[BI)I

    iput v5, p0, Lorg/bouncycastle/crypto/macs/CMac;->d:I

    sub-int/2addr p3, v1

    add-int/2addr p2, v1

    :goto_0
    if-le p3, v0, :cond_1

    iget-object v1, p0, Lorg/bouncycastle/crypto/macs/CMac;->e:Lorg/bouncycastle/crypto/BlockCipher;

    iget-object v2, p0, Lorg/bouncycastle/crypto/macs/CMac;->b:[B

    invoke-interface {v1, p1, p2, v2, v5}, Lorg/bouncycastle/crypto/BlockCipher;->processBlock([BI[BI)I

    sub-int/2addr p3, v0

    add-int/2addr p2, v0

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lorg/bouncycastle/crypto/macs/CMac;->c:[B

    iget v1, p0, Lorg/bouncycastle/crypto/macs/CMac;->d:I

    invoke-static {p1, p2, v0, v1, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget v0, p0, Lorg/bouncycastle/crypto/macs/CMac;->d:I

    add-int/2addr v0, p3

    iput v0, p0, Lorg/bouncycastle/crypto/macs/CMac;->d:I

    return-void
.end method
