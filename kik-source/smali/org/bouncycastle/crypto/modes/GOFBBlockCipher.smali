.class public Lorg/bouncycastle/crypto/modes/GOFBBlockCipher;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/bouncycastle/crypto/BlockCipher;


# instance fields
.field a:Z

.field b:I

.field c:I

.field private d:[B

.field private e:[B

.field private f:[B

.field private final g:I

.field private final h:Lorg/bouncycastle/crypto/BlockCipher;


# direct methods
.method public constructor <init>(Lorg/bouncycastle/crypto/BlockCipher;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lorg/bouncycastle/crypto/modes/GOFBBlockCipher;->a:Z

    iput-object p1, p0, Lorg/bouncycastle/crypto/modes/GOFBBlockCipher;->h:Lorg/bouncycastle/crypto/BlockCipher;

    invoke-interface {p1}, Lorg/bouncycastle/crypto/BlockCipher;->getBlockSize()I

    move-result v0

    iput v0, p0, Lorg/bouncycastle/crypto/modes/GOFBBlockCipher;->g:I

    iget v0, p0, Lorg/bouncycastle/crypto/modes/GOFBBlockCipher;->g:I

    const/16 v1, 0x8

    if-eq v0, v1, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "GCTR only for 64 bit block ciphers"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    invoke-interface {p1}, Lorg/bouncycastle/crypto/BlockCipher;->getBlockSize()I

    move-result v0

    new-array v0, v0, [B

    iput-object v0, p0, Lorg/bouncycastle/crypto/modes/GOFBBlockCipher;->d:[B

    invoke-interface {p1}, Lorg/bouncycastle/crypto/BlockCipher;->getBlockSize()I

    move-result v0

    new-array v0, v0, [B

    iput-object v0, p0, Lorg/bouncycastle/crypto/modes/GOFBBlockCipher;->e:[B

    invoke-interface {p1}, Lorg/bouncycastle/crypto/BlockCipher;->getBlockSize()I

    move-result v0

    new-array v0, v0, [B

    iput-object v0, p0, Lorg/bouncycastle/crypto/modes/GOFBBlockCipher;->f:[B

    return-void
.end method

.method private bytesToint([BI)I
    .locals 3

    add-int/lit8 v0, p2, 0x3

    aget-byte v0, p1, v0

    shl-int/lit8 v0, v0, 0x18

    const/high16 v1, -0x1000000

    and-int/2addr v0, v1

    add-int/lit8 v1, p2, 0x2

    aget-byte v1, p1, v1

    shl-int/lit8 v1, v1, 0x10

    const/high16 v2, 0xff0000

    and-int/2addr v1, v2

    add-int/2addr v0, v1

    add-int/lit8 v1, p2, 0x1

    aget-byte v1, p1, v1

    shl-int/lit8 v1, v1, 0x8

    const v2, 0xff00

    and-int/2addr v1, v2

    add-int/2addr v0, v1

    aget-byte v1, p1, p2

    and-int/lit16 v1, v1, 0xff

    add-int/2addr v0, v1

    return v0
.end method

.method private intTobytes(I[BI)V
    .locals 2

    add-int/lit8 v0, p3, 0x3

    ushr-int/lit8 v1, p1, 0x18

    int-to-byte v1, v1

    aput-byte v1, p2, v0

    add-int/lit8 v0, p3, 0x2

    ushr-int/lit8 v1, p1, 0x10

    int-to-byte v1, v1

    aput-byte v1, p2, v0

    add-int/lit8 v0, p3, 0x1

    ushr-int/lit8 v1, p1, 0x8

    int-to-byte v1, v1

    aput-byte v1, p2, v0

    int-to-byte v0, p1

    aput-byte v0, p2, p3

    return-void
.end method


# virtual methods
.method public getAlgorithmName()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lorg/bouncycastle/crypto/modes/GOFBBlockCipher;->h:Lorg/bouncycastle/crypto/BlockCipher;

    invoke-interface {v1}, Lorg/bouncycastle/crypto/BlockCipher;->getAlgorithmName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/GCTR"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getBlockSize()I
    .locals 1

    iget v0, p0, Lorg/bouncycastle/crypto/modes/GOFBBlockCipher;->g:I

    return v0
.end method

.method public getUnderlyingCipher()Lorg/bouncycastle/crypto/BlockCipher;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/crypto/modes/GOFBBlockCipher;->h:Lorg/bouncycastle/crypto/BlockCipher;

    return-object v0
.end method

.method public init(ZLorg/bouncycastle/crypto/CipherParameters;)V
    .locals 6

    const/4 v5, 0x1

    const/4 v1, 0x0

    iput-boolean v5, p0, Lorg/bouncycastle/crypto/modes/GOFBBlockCipher;->a:Z

    iput v1, p0, Lorg/bouncycastle/crypto/modes/GOFBBlockCipher;->b:I

    iput v1, p0, Lorg/bouncycastle/crypto/modes/GOFBBlockCipher;->c:I

    instance-of v0, p2, Lorg/bouncycastle/crypto/params/ParametersWithIV;

    if-eqz v0, :cond_2

    check-cast p2, Lorg/bouncycastle/crypto/params/ParametersWithIV;

    invoke-virtual {p2}, Lorg/bouncycastle/crypto/params/ParametersWithIV;->getIV()[B

    move-result-object v2

    array-length v0, v2

    iget-object v3, p0, Lorg/bouncycastle/crypto/modes/GOFBBlockCipher;->d:[B

    array-length v3, v3

    if-ge v0, v3, :cond_0

    iget-object v0, p0, Lorg/bouncycastle/crypto/modes/GOFBBlockCipher;->d:[B

    iget-object v3, p0, Lorg/bouncycastle/crypto/modes/GOFBBlockCipher;->d:[B

    array-length v3, v3

    array-length v4, v2

    sub-int/2addr v3, v4

    array-length v4, v2

    invoke-static {v2, v1, v0, v3, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move v0, v1

    :goto_0
    iget-object v3, p0, Lorg/bouncycastle/crypto/modes/GOFBBlockCipher;->d:[B

    array-length v3, v3

    array-length v4, v2

    sub-int/2addr v3, v4

    if-ge v0, v3, :cond_1

    iget-object v3, p0, Lorg/bouncycastle/crypto/modes/GOFBBlockCipher;->d:[B

    aput-byte v1, v3, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lorg/bouncycastle/crypto/modes/GOFBBlockCipher;->d:[B

    iget-object v3, p0, Lorg/bouncycastle/crypto/modes/GOFBBlockCipher;->d:[B

    array-length v3, v3

    invoke-static {v2, v1, v0, v1, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_1
    invoke-virtual {p0}, Lorg/bouncycastle/crypto/modes/GOFBBlockCipher;->reset()V

    iget-object v0, p0, Lorg/bouncycastle/crypto/modes/GOFBBlockCipher;->h:Lorg/bouncycastle/crypto/BlockCipher;

    invoke-virtual {p2}, Lorg/bouncycastle/crypto/params/ParametersWithIV;->getParameters()Lorg/bouncycastle/crypto/CipherParameters;

    move-result-object v1

    invoke-interface {v0, v5, v1}, Lorg/bouncycastle/crypto/BlockCipher;->init(ZLorg/bouncycastle/crypto/CipherParameters;)V

    :goto_1
    return-void

    :cond_2
    invoke-virtual {p0}, Lorg/bouncycastle/crypto/modes/GOFBBlockCipher;->reset()V

    iget-object v0, p0, Lorg/bouncycastle/crypto/modes/GOFBBlockCipher;->h:Lorg/bouncycastle/crypto/BlockCipher;

    invoke-interface {v0, v5, p2}, Lorg/bouncycastle/crypto/BlockCipher;->init(ZLorg/bouncycastle/crypto/CipherParameters;)V

    goto :goto_1
.end method

.method public processBlock([BI[BI)I
    .locals 6

    const/4 v4, 0x4

    const/4 v1, 0x0

    iget v0, p0, Lorg/bouncycastle/crypto/modes/GOFBBlockCipher;->g:I

    add-int/2addr v0, p2

    array-length v2, p1

    if-le v0, v2, :cond_0

    new-instance v0, Lorg/bouncycastle/crypto/DataLengthException;

    const-string v1, "input buffer too short"

    invoke-direct {v0, v1}, Lorg/bouncycastle/crypto/DataLengthException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget v0, p0, Lorg/bouncycastle/crypto/modes/GOFBBlockCipher;->g:I

    add-int/2addr v0, p4

    array-length v2, p3

    if-le v0, v2, :cond_1

    new-instance v0, Lorg/bouncycastle/crypto/DataLengthException;

    const-string v1, "output buffer too short"

    invoke-direct {v0, v1}, Lorg/bouncycastle/crypto/DataLengthException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget-boolean v0, p0, Lorg/bouncycastle/crypto/modes/GOFBBlockCipher;->a:Z

    if-eqz v0, :cond_2

    iput-boolean v1, p0, Lorg/bouncycastle/crypto/modes/GOFBBlockCipher;->a:Z

    iget-object v0, p0, Lorg/bouncycastle/crypto/modes/GOFBBlockCipher;->h:Lorg/bouncycastle/crypto/BlockCipher;

    iget-object v2, p0, Lorg/bouncycastle/crypto/modes/GOFBBlockCipher;->e:[B

    iget-object v3, p0, Lorg/bouncycastle/crypto/modes/GOFBBlockCipher;->f:[B

    invoke-interface {v0, v2, v1, v3, v1}, Lorg/bouncycastle/crypto/BlockCipher;->processBlock([BI[BI)I

    iget-object v0, p0, Lorg/bouncycastle/crypto/modes/GOFBBlockCipher;->f:[B

    invoke-direct {p0, v0, v1}, Lorg/bouncycastle/crypto/modes/GOFBBlockCipher;->bytesToint([BI)I

    move-result v0

    iput v0, p0, Lorg/bouncycastle/crypto/modes/GOFBBlockCipher;->b:I

    iget-object v0, p0, Lorg/bouncycastle/crypto/modes/GOFBBlockCipher;->f:[B

    invoke-direct {p0, v0, v4}, Lorg/bouncycastle/crypto/modes/GOFBBlockCipher;->bytesToint([BI)I

    move-result v0

    iput v0, p0, Lorg/bouncycastle/crypto/modes/GOFBBlockCipher;->c:I

    :cond_2
    iget v0, p0, Lorg/bouncycastle/crypto/modes/GOFBBlockCipher;->b:I

    const v2, 0x1010101

    add-int/2addr v0, v2

    iput v0, p0, Lorg/bouncycastle/crypto/modes/GOFBBlockCipher;->b:I

    iget v0, p0, Lorg/bouncycastle/crypto/modes/GOFBBlockCipher;->c:I

    const v2, 0x1010104

    add-int/2addr v0, v2

    iput v0, p0, Lorg/bouncycastle/crypto/modes/GOFBBlockCipher;->c:I

    iget v0, p0, Lorg/bouncycastle/crypto/modes/GOFBBlockCipher;->b:I

    iget-object v2, p0, Lorg/bouncycastle/crypto/modes/GOFBBlockCipher;->e:[B

    invoke-direct {p0, v0, v2, v1}, Lorg/bouncycastle/crypto/modes/GOFBBlockCipher;->intTobytes(I[BI)V

    iget v0, p0, Lorg/bouncycastle/crypto/modes/GOFBBlockCipher;->c:I

    iget-object v2, p0, Lorg/bouncycastle/crypto/modes/GOFBBlockCipher;->e:[B

    invoke-direct {p0, v0, v2, v4}, Lorg/bouncycastle/crypto/modes/GOFBBlockCipher;->intTobytes(I[BI)V

    iget-object v0, p0, Lorg/bouncycastle/crypto/modes/GOFBBlockCipher;->h:Lorg/bouncycastle/crypto/BlockCipher;

    iget-object v2, p0, Lorg/bouncycastle/crypto/modes/GOFBBlockCipher;->e:[B

    iget-object v3, p0, Lorg/bouncycastle/crypto/modes/GOFBBlockCipher;->f:[B

    invoke-interface {v0, v2, v1, v3, v1}, Lorg/bouncycastle/crypto/BlockCipher;->processBlock([BI[BI)I

    move v0, v1

    :goto_0
    iget v2, p0, Lorg/bouncycastle/crypto/modes/GOFBBlockCipher;->g:I

    if-ge v0, v2, :cond_3

    add-int v2, p4, v0

    iget-object v3, p0, Lorg/bouncycastle/crypto/modes/GOFBBlockCipher;->f:[B

    aget-byte v3, v3, v0

    add-int v4, p2, v0

    aget-byte v4, p1, v4

    xor-int/2addr v3, v4

    int-to-byte v3, v3

    aput-byte v3, p3, v2

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    iget-object v0, p0, Lorg/bouncycastle/crypto/modes/GOFBBlockCipher;->e:[B

    iget v2, p0, Lorg/bouncycastle/crypto/modes/GOFBBlockCipher;->g:I

    iget-object v3, p0, Lorg/bouncycastle/crypto/modes/GOFBBlockCipher;->e:[B

    iget-object v4, p0, Lorg/bouncycastle/crypto/modes/GOFBBlockCipher;->e:[B

    array-length v4, v4

    iget v5, p0, Lorg/bouncycastle/crypto/modes/GOFBBlockCipher;->g:I

    sub-int/2addr v4, v5

    invoke-static {v0, v2, v3, v1, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v0, p0, Lorg/bouncycastle/crypto/modes/GOFBBlockCipher;->f:[B

    iget-object v2, p0, Lorg/bouncycastle/crypto/modes/GOFBBlockCipher;->e:[B

    iget-object v3, p0, Lorg/bouncycastle/crypto/modes/GOFBBlockCipher;->e:[B

    array-length v3, v3

    iget v4, p0, Lorg/bouncycastle/crypto/modes/GOFBBlockCipher;->g:I

    sub-int/2addr v3, v4

    iget v4, p0, Lorg/bouncycastle/crypto/modes/GOFBBlockCipher;->g:I

    invoke-static {v0, v1, v2, v3, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget v0, p0, Lorg/bouncycastle/crypto/modes/GOFBBlockCipher;->g:I

    return v0
.end method

.method public reset()V
    .locals 4

    const/4 v3, 0x0

    iget-object v0, p0, Lorg/bouncycastle/crypto/modes/GOFBBlockCipher;->d:[B

    iget-object v1, p0, Lorg/bouncycastle/crypto/modes/GOFBBlockCipher;->e:[B

    iget-object v2, p0, Lorg/bouncycastle/crypto/modes/GOFBBlockCipher;->d:[B

    array-length v2, v2

    invoke-static {v0, v3, v1, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v0, p0, Lorg/bouncycastle/crypto/modes/GOFBBlockCipher;->h:Lorg/bouncycastle/crypto/BlockCipher;

    invoke-interface {v0}, Lorg/bouncycastle/crypto/BlockCipher;->reset()V

    return-void
.end method
