.class public Lorg/bouncycastle/crypto/modes/SICBlockCipher;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/bouncycastle/crypto/BlockCipher;


# instance fields
.field private final a:Lorg/bouncycastle/crypto/BlockCipher;

.field private final b:I

.field private c:[B

.field private d:[B

.field private e:[B


# direct methods
.method public constructor <init>(Lorg/bouncycastle/crypto/BlockCipher;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/bouncycastle/crypto/modes/SICBlockCipher;->a:Lorg/bouncycastle/crypto/BlockCipher;

    iget-object v0, p0, Lorg/bouncycastle/crypto/modes/SICBlockCipher;->a:Lorg/bouncycastle/crypto/BlockCipher;

    invoke-interface {v0}, Lorg/bouncycastle/crypto/BlockCipher;->getBlockSize()I

    move-result v0

    iput v0, p0, Lorg/bouncycastle/crypto/modes/SICBlockCipher;->b:I

    iget v0, p0, Lorg/bouncycastle/crypto/modes/SICBlockCipher;->b:I

    new-array v0, v0, [B

    iput-object v0, p0, Lorg/bouncycastle/crypto/modes/SICBlockCipher;->c:[B

    iget v0, p0, Lorg/bouncycastle/crypto/modes/SICBlockCipher;->b:I

    new-array v0, v0, [B

    iput-object v0, p0, Lorg/bouncycastle/crypto/modes/SICBlockCipher;->d:[B

    iget v0, p0, Lorg/bouncycastle/crypto/modes/SICBlockCipher;->b:I

    new-array v0, v0, [B

    iput-object v0, p0, Lorg/bouncycastle/crypto/modes/SICBlockCipher;->e:[B

    return-void
.end method


# virtual methods
.method public getAlgorithmName()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lorg/bouncycastle/crypto/modes/SICBlockCipher;->a:Lorg/bouncycastle/crypto/BlockCipher;

    invoke-interface {v1}, Lorg/bouncycastle/crypto/BlockCipher;->getAlgorithmName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/SIC"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getBlockSize()I
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/crypto/modes/SICBlockCipher;->a:Lorg/bouncycastle/crypto/BlockCipher;

    invoke-interface {v0}, Lorg/bouncycastle/crypto/BlockCipher;->getBlockSize()I

    move-result v0

    return v0
.end method

.method public getUnderlyingCipher()Lorg/bouncycastle/crypto/BlockCipher;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/crypto/modes/SICBlockCipher;->a:Lorg/bouncycastle/crypto/BlockCipher;

    return-object v0
.end method

.method public init(ZLorg/bouncycastle/crypto/CipherParameters;)V
    .locals 4

    const/4 v3, 0x0

    instance-of v0, p2, Lorg/bouncycastle/crypto/params/ParametersWithIV;

    if-eqz v0, :cond_0

    check-cast p2, Lorg/bouncycastle/crypto/params/ParametersWithIV;

    invoke-virtual {p2}, Lorg/bouncycastle/crypto/params/ParametersWithIV;->getIV()[B

    move-result-object v0

    iget-object v1, p0, Lorg/bouncycastle/crypto/modes/SICBlockCipher;->c:[B

    iget-object v2, p0, Lorg/bouncycastle/crypto/modes/SICBlockCipher;->c:[B

    array-length v2, v2

    invoke-static {v0, v3, v1, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-virtual {p0}, Lorg/bouncycastle/crypto/modes/SICBlockCipher;->reset()V

    iget-object v0, p0, Lorg/bouncycastle/crypto/modes/SICBlockCipher;->a:Lorg/bouncycastle/crypto/BlockCipher;

    const/4 v1, 0x1

    invoke-virtual {p2}, Lorg/bouncycastle/crypto/params/ParametersWithIV;->getParameters()Lorg/bouncycastle/crypto/CipherParameters;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lorg/bouncycastle/crypto/BlockCipher;->init(ZLorg/bouncycastle/crypto/CipherParameters;)V

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "SIC mode requires ParametersWithIV"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public processBlock([BI[BI)I
    .locals 6

    const/4 v2, 0x1

    const/4 v1, 0x0

    iget-object v0, p0, Lorg/bouncycastle/crypto/modes/SICBlockCipher;->a:Lorg/bouncycastle/crypto/BlockCipher;

    iget-object v3, p0, Lorg/bouncycastle/crypto/modes/SICBlockCipher;->d:[B

    iget-object v4, p0, Lorg/bouncycastle/crypto/modes/SICBlockCipher;->e:[B

    invoke-interface {v0, v3, v1, v4, v1}, Lorg/bouncycastle/crypto/BlockCipher;->processBlock([BI[BI)I

    move v0, v1

    :goto_0
    iget-object v3, p0, Lorg/bouncycastle/crypto/modes/SICBlockCipher;->e:[B

    array-length v3, v3

    if-ge v0, v3, :cond_0

    add-int v3, p4, v0

    iget-object v4, p0, Lorg/bouncycastle/crypto/modes/SICBlockCipher;->e:[B

    aget-byte v4, v4, v0

    add-int v5, p2, v0

    aget-byte v5, p1, v5

    xor-int/2addr v4, v5

    int-to-byte v4, v4

    aput-byte v4, p3, v3

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lorg/bouncycastle/crypto/modes/SICBlockCipher;->d:[B

    array-length v0, v0

    add-int/lit8 v0, v0, -0x1

    move v3, v0

    move v0, v2

    :goto_1
    if-ltz v3, :cond_2

    iget-object v4, p0, Lorg/bouncycastle/crypto/modes/SICBlockCipher;->d:[B

    aget-byte v4, v4, v3

    and-int/lit16 v4, v4, 0xff

    add-int/2addr v4, v0

    const/16 v0, 0xff

    if-le v4, v0, :cond_1

    move v0, v2

    :goto_2
    iget-object v5, p0, Lorg/bouncycastle/crypto/modes/SICBlockCipher;->d:[B

    int-to-byte v4, v4

    aput-byte v4, v5, v3

    add-int/lit8 v3, v3, -0x1

    goto :goto_1

    :cond_1
    move v0, v1

    goto :goto_2

    :cond_2
    iget-object v0, p0, Lorg/bouncycastle/crypto/modes/SICBlockCipher;->d:[B

    array-length v0, v0

    return v0
.end method

.method public reset()V
    .locals 4

    const/4 v3, 0x0

    iget-object v0, p0, Lorg/bouncycastle/crypto/modes/SICBlockCipher;->c:[B

    iget-object v1, p0, Lorg/bouncycastle/crypto/modes/SICBlockCipher;->d:[B

    iget-object v2, p0, Lorg/bouncycastle/crypto/modes/SICBlockCipher;->d:[B

    array-length v2, v2

    invoke-static {v0, v3, v1, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v0, p0, Lorg/bouncycastle/crypto/modes/SICBlockCipher;->a:Lorg/bouncycastle/crypto/BlockCipher;

    invoke-interface {v0}, Lorg/bouncycastle/crypto/BlockCipher;->reset()V

    return-void
.end method
