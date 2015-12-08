.class public Lorg/bouncycastle/crypto/modes/EAXBlockCipher;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/bouncycastle/crypto/modes/AEADBlockCipher;


# instance fields
.field private a:Lorg/bouncycastle/crypto/modes/SICBlockCipher;

.field private b:Z

.field private c:I

.field private d:Lorg/bouncycastle/crypto/Mac;

.field private e:[B

.field private f:[B

.field private g:[B

.field private h:I

.field private i:[B

.field private j:I


# direct methods
.method public constructor <init>(Lorg/bouncycastle/crypto/BlockCipher;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-interface {p1}, Lorg/bouncycastle/crypto/BlockCipher;->getBlockSize()I

    move-result v0

    iput v0, p0, Lorg/bouncycastle/crypto/modes/EAXBlockCipher;->c:I

    new-instance v0, Lorg/bouncycastle/crypto/macs/CMac;

    invoke-direct {v0, p1}, Lorg/bouncycastle/crypto/macs/CMac;-><init>(Lorg/bouncycastle/crypto/BlockCipher;)V

    iput-object v0, p0, Lorg/bouncycastle/crypto/modes/EAXBlockCipher;->d:Lorg/bouncycastle/crypto/Mac;

    iget v0, p0, Lorg/bouncycastle/crypto/modes/EAXBlockCipher;->c:I

    new-array v0, v0, [B

    iput-object v0, p0, Lorg/bouncycastle/crypto/modes/EAXBlockCipher;->g:[B

    iget v0, p0, Lorg/bouncycastle/crypto/modes/EAXBlockCipher;->c:I

    mul-int/lit8 v0, v0, 0x2

    new-array v0, v0, [B

    iput-object v0, p0, Lorg/bouncycastle/crypto/modes/EAXBlockCipher;->i:[B

    iget-object v0, p0, Lorg/bouncycastle/crypto/modes/EAXBlockCipher;->d:Lorg/bouncycastle/crypto/Mac;

    invoke-interface {v0}, Lorg/bouncycastle/crypto/Mac;->getMacSize()I

    move-result v0

    new-array v0, v0, [B

    iput-object v0, p0, Lorg/bouncycastle/crypto/modes/EAXBlockCipher;->f:[B

    iget-object v0, p0, Lorg/bouncycastle/crypto/modes/EAXBlockCipher;->d:Lorg/bouncycastle/crypto/Mac;

    invoke-interface {v0}, Lorg/bouncycastle/crypto/Mac;->getMacSize()I

    move-result v0

    new-array v0, v0, [B

    iput-object v0, p0, Lorg/bouncycastle/crypto/modes/EAXBlockCipher;->e:[B

    new-instance v0, Lorg/bouncycastle/crypto/modes/SICBlockCipher;

    invoke-direct {v0, p1}, Lorg/bouncycastle/crypto/modes/SICBlockCipher;-><init>(Lorg/bouncycastle/crypto/BlockCipher;)V

    iput-object v0, p0, Lorg/bouncycastle/crypto/modes/EAXBlockCipher;->a:Lorg/bouncycastle/crypto/modes/SICBlockCipher;

    return-void
.end method

.method private calculateMac()V
    .locals 5

    const/4 v0, 0x0

    iget v1, p0, Lorg/bouncycastle/crypto/modes/EAXBlockCipher;->c:I

    new-array v1, v1, [B

    iget-object v2, p0, Lorg/bouncycastle/crypto/modes/EAXBlockCipher;->d:Lorg/bouncycastle/crypto/Mac;

    invoke-interface {v2, v1, v0}, Lorg/bouncycastle/crypto/Mac;->doFinal([BI)I

    :goto_0
    iget-object v2, p0, Lorg/bouncycastle/crypto/modes/EAXBlockCipher;->g:[B

    array-length v2, v2

    if-ge v0, v2, :cond_0

    iget-object v2, p0, Lorg/bouncycastle/crypto/modes/EAXBlockCipher;->g:[B

    iget-object v3, p0, Lorg/bouncycastle/crypto/modes/EAXBlockCipher;->e:[B

    aget-byte v3, v3, v0

    iget-object v4, p0, Lorg/bouncycastle/crypto/modes/EAXBlockCipher;->f:[B

    aget-byte v4, v4, v0

    xor-int/2addr v3, v4

    aget-byte v4, v1, v0

    xor-int/2addr v3, v4

    int-to-byte v3, v3

    aput-byte v3, v2, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method private process(B[BI)I
    .locals 6

    const/4 v1, 0x0

    iget-object v0, p0, Lorg/bouncycastle/crypto/modes/EAXBlockCipher;->i:[B

    iget v2, p0, Lorg/bouncycastle/crypto/modes/EAXBlockCipher;->j:I

    add-int/lit8 v3, v2, 0x1

    iput v3, p0, Lorg/bouncycastle/crypto/modes/EAXBlockCipher;->j:I

    aput-byte p1, v0, v2

    iget v0, p0, Lorg/bouncycastle/crypto/modes/EAXBlockCipher;->j:I

    iget-object v2, p0, Lorg/bouncycastle/crypto/modes/EAXBlockCipher;->i:[B

    array-length v2, v2

    if-ne v0, v2, :cond_1

    iget-boolean v0, p0, Lorg/bouncycastle/crypto/modes/EAXBlockCipher;->b:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/bouncycastle/crypto/modes/EAXBlockCipher;->a:Lorg/bouncycastle/crypto/modes/SICBlockCipher;

    iget-object v2, p0, Lorg/bouncycastle/crypto/modes/EAXBlockCipher;->i:[B

    invoke-virtual {v0, v2, v1, p2, p3}, Lorg/bouncycastle/crypto/modes/SICBlockCipher;->processBlock([BI[BI)I

    move-result v0

    iget-object v2, p0, Lorg/bouncycastle/crypto/modes/EAXBlockCipher;->d:Lorg/bouncycastle/crypto/Mac;

    iget v3, p0, Lorg/bouncycastle/crypto/modes/EAXBlockCipher;->c:I

    invoke-interface {v2, p2, p3, v3}, Lorg/bouncycastle/crypto/Mac;->update([BII)V

    :goto_0
    iget v2, p0, Lorg/bouncycastle/crypto/modes/EAXBlockCipher;->c:I

    iput v2, p0, Lorg/bouncycastle/crypto/modes/EAXBlockCipher;->j:I

    iget-object v2, p0, Lorg/bouncycastle/crypto/modes/EAXBlockCipher;->i:[B

    iget v3, p0, Lorg/bouncycastle/crypto/modes/EAXBlockCipher;->c:I

    iget-object v4, p0, Lorg/bouncycastle/crypto/modes/EAXBlockCipher;->i:[B

    iget v5, p0, Lorg/bouncycastle/crypto/modes/EAXBlockCipher;->c:I

    invoke-static {v2, v3, v4, v1, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :goto_1
    return v0

    :cond_0
    iget-object v0, p0, Lorg/bouncycastle/crypto/modes/EAXBlockCipher;->d:Lorg/bouncycastle/crypto/Mac;

    iget-object v2, p0, Lorg/bouncycastle/crypto/modes/EAXBlockCipher;->i:[B

    iget v3, p0, Lorg/bouncycastle/crypto/modes/EAXBlockCipher;->c:I

    invoke-interface {v0, v2, v1, v3}, Lorg/bouncycastle/crypto/Mac;->update([BII)V

    iget-object v0, p0, Lorg/bouncycastle/crypto/modes/EAXBlockCipher;->a:Lorg/bouncycastle/crypto/modes/SICBlockCipher;

    iget-object v2, p0, Lorg/bouncycastle/crypto/modes/EAXBlockCipher;->i:[B

    invoke-virtual {v0, v2, v1, p2, p3}, Lorg/bouncycastle/crypto/modes/SICBlockCipher;->processBlock([BI[BI)I

    move-result v0

    goto :goto_0

    :cond_1
    move v0, v1

    goto :goto_1
.end method

.method private reset(Z)V
    .locals 4

    const/4 v3, 0x0

    iget-object v0, p0, Lorg/bouncycastle/crypto/modes/EAXBlockCipher;->a:Lorg/bouncycastle/crypto/modes/SICBlockCipher;

    invoke-virtual {v0}, Lorg/bouncycastle/crypto/modes/SICBlockCipher;->reset()V

    iget-object v0, p0, Lorg/bouncycastle/crypto/modes/EAXBlockCipher;->d:Lorg/bouncycastle/crypto/Mac;

    invoke-interface {v0}, Lorg/bouncycastle/crypto/Mac;->reset()V

    iput v3, p0, Lorg/bouncycastle/crypto/modes/EAXBlockCipher;->j:I

    iget-object v0, p0, Lorg/bouncycastle/crypto/modes/EAXBlockCipher;->i:[B

    invoke-static {v0}, Lorg/bouncycastle/util/Arrays;->a([B)V

    if-eqz p1, :cond_0

    iget-object v0, p0, Lorg/bouncycastle/crypto/modes/EAXBlockCipher;->g:[B

    invoke-static {v0}, Lorg/bouncycastle/util/Arrays;->a([B)V

    :cond_0
    iget v0, p0, Lorg/bouncycastle/crypto/modes/EAXBlockCipher;->c:I

    new-array v0, v0, [B

    iget v1, p0, Lorg/bouncycastle/crypto/modes/EAXBlockCipher;->c:I

    add-int/lit8 v1, v1, -0x1

    const/4 v2, 0x2

    aput-byte v2, v0, v1

    iget-object v1, p0, Lorg/bouncycastle/crypto/modes/EAXBlockCipher;->d:Lorg/bouncycastle/crypto/Mac;

    iget v2, p0, Lorg/bouncycastle/crypto/modes/EAXBlockCipher;->c:I

    invoke-interface {v1, v0, v3, v2}, Lorg/bouncycastle/crypto/Mac;->update([BII)V

    return-void
.end method

.method private verifyMac([BI)Z
    .locals 4

    const/4 v1, 0x0

    move v0, v1

    :goto_0
    iget v2, p0, Lorg/bouncycastle/crypto/modes/EAXBlockCipher;->h:I

    if-ge v0, v2, :cond_1

    iget-object v2, p0, Lorg/bouncycastle/crypto/modes/EAXBlockCipher;->g:[B

    aget-byte v2, v2, v0

    add-int v3, p2, v0

    aget-byte v3, p1, v3

    if-eq v2, v3, :cond_0

    :goto_1
    return v1

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v1, 0x1

    goto :goto_1
.end method


# virtual methods
.method public doFinal([BI)I
    .locals 7

    const/4 v6, 0x0

    iget v0, p0, Lorg/bouncycastle/crypto/modes/EAXBlockCipher;->j:I

    iget-object v1, p0, Lorg/bouncycastle/crypto/modes/EAXBlockCipher;->i:[B

    array-length v1, v1

    new-array v1, v1, [B

    iput v6, p0, Lorg/bouncycastle/crypto/modes/EAXBlockCipher;->j:I

    iget-boolean v2, p0, Lorg/bouncycastle/crypto/modes/EAXBlockCipher;->b:Z

    if-eqz v2, :cond_0

    iget-object v2, p0, Lorg/bouncycastle/crypto/modes/EAXBlockCipher;->a:Lorg/bouncycastle/crypto/modes/SICBlockCipher;

    iget-object v3, p0, Lorg/bouncycastle/crypto/modes/EAXBlockCipher;->i:[B

    invoke-virtual {v2, v3, v6, v1, v6}, Lorg/bouncycastle/crypto/modes/SICBlockCipher;->processBlock([BI[BI)I

    iget-object v2, p0, Lorg/bouncycastle/crypto/modes/EAXBlockCipher;->a:Lorg/bouncycastle/crypto/modes/SICBlockCipher;

    iget-object v3, p0, Lorg/bouncycastle/crypto/modes/EAXBlockCipher;->i:[B

    iget v4, p0, Lorg/bouncycastle/crypto/modes/EAXBlockCipher;->c:I

    iget v5, p0, Lorg/bouncycastle/crypto/modes/EAXBlockCipher;->c:I

    invoke-virtual {v2, v3, v4, v1, v5}, Lorg/bouncycastle/crypto/modes/SICBlockCipher;->processBlock([BI[BI)I

    invoke-static {v1, v6, p1, p2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v2, p0, Lorg/bouncycastle/crypto/modes/EAXBlockCipher;->d:Lorg/bouncycastle/crypto/Mac;

    invoke-interface {v2, v1, v6, v0}, Lorg/bouncycastle/crypto/Mac;->update([BII)V

    invoke-direct {p0}, Lorg/bouncycastle/crypto/modes/EAXBlockCipher;->calculateMac()V

    iget-object v1, p0, Lorg/bouncycastle/crypto/modes/EAXBlockCipher;->g:[B

    add-int v2, p2, v0

    iget v3, p0, Lorg/bouncycastle/crypto/modes/EAXBlockCipher;->h:I

    invoke-static {v1, v6, p1, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-direct {p0, v6}, Lorg/bouncycastle/crypto/modes/EAXBlockCipher;->reset(Z)V

    iget v1, p0, Lorg/bouncycastle/crypto/modes/EAXBlockCipher;->h:I

    add-int/2addr v0, v1

    :goto_0
    return v0

    :cond_0
    iget v2, p0, Lorg/bouncycastle/crypto/modes/EAXBlockCipher;->h:I

    if-le v0, v2, :cond_1

    iget-object v2, p0, Lorg/bouncycastle/crypto/modes/EAXBlockCipher;->d:Lorg/bouncycastle/crypto/Mac;

    iget-object v3, p0, Lorg/bouncycastle/crypto/modes/EAXBlockCipher;->i:[B

    iget v4, p0, Lorg/bouncycastle/crypto/modes/EAXBlockCipher;->h:I

    sub-int v4, v0, v4

    invoke-interface {v2, v3, v6, v4}, Lorg/bouncycastle/crypto/Mac;->update([BII)V

    iget-object v2, p0, Lorg/bouncycastle/crypto/modes/EAXBlockCipher;->a:Lorg/bouncycastle/crypto/modes/SICBlockCipher;

    iget-object v3, p0, Lorg/bouncycastle/crypto/modes/EAXBlockCipher;->i:[B

    invoke-virtual {v2, v3, v6, v1, v6}, Lorg/bouncycastle/crypto/modes/SICBlockCipher;->processBlock([BI[BI)I

    iget-object v2, p0, Lorg/bouncycastle/crypto/modes/EAXBlockCipher;->a:Lorg/bouncycastle/crypto/modes/SICBlockCipher;

    iget-object v3, p0, Lorg/bouncycastle/crypto/modes/EAXBlockCipher;->i:[B

    iget v4, p0, Lorg/bouncycastle/crypto/modes/EAXBlockCipher;->c:I

    iget v5, p0, Lorg/bouncycastle/crypto/modes/EAXBlockCipher;->c:I

    invoke-virtual {v2, v3, v4, v1, v5}, Lorg/bouncycastle/crypto/modes/SICBlockCipher;->processBlock([BI[BI)I

    iget v2, p0, Lorg/bouncycastle/crypto/modes/EAXBlockCipher;->h:I

    sub-int v2, v0, v2

    invoke-static {v1, v6, p1, p2, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_1
    invoke-direct {p0}, Lorg/bouncycastle/crypto/modes/EAXBlockCipher;->calculateMac()V

    iget-object v1, p0, Lorg/bouncycastle/crypto/modes/EAXBlockCipher;->i:[B

    iget v2, p0, Lorg/bouncycastle/crypto/modes/EAXBlockCipher;->h:I

    sub-int v2, v0, v2

    invoke-direct {p0, v1, v2}, Lorg/bouncycastle/crypto/modes/EAXBlockCipher;->verifyMac([BI)Z

    move-result v1

    if-nez v1, :cond_2

    new-instance v0, Lorg/bouncycastle/crypto/InvalidCipherTextException;

    const-string v1, "mac check in EAX failed"

    invoke-direct {v0, v1}, Lorg/bouncycastle/crypto/InvalidCipherTextException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-direct {p0, v6}, Lorg/bouncycastle/crypto/modes/EAXBlockCipher;->reset(Z)V

    iget v1, p0, Lorg/bouncycastle/crypto/modes/EAXBlockCipher;->h:I

    sub-int/2addr v0, v1

    goto :goto_0
.end method

.method public getAlgorithmName()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lorg/bouncycastle/crypto/modes/EAXBlockCipher;->a:Lorg/bouncycastle/crypto/modes/SICBlockCipher;

    invoke-virtual {v1}, Lorg/bouncycastle/crypto/modes/SICBlockCipher;->getUnderlyingCipher()Lorg/bouncycastle/crypto/BlockCipher;

    move-result-object v1

    invoke-interface {v1}, Lorg/bouncycastle/crypto/BlockCipher;->getAlgorithmName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/EAX"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getBlockSize()I
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/crypto/modes/EAXBlockCipher;->a:Lorg/bouncycastle/crypto/modes/SICBlockCipher;

    invoke-virtual {v0}, Lorg/bouncycastle/crypto/modes/SICBlockCipher;->getBlockSize()I

    move-result v0

    return v0
.end method

.method public getMac()[B
    .locals 4

    const/4 v3, 0x0

    iget v0, p0, Lorg/bouncycastle/crypto/modes/EAXBlockCipher;->h:I

    new-array v0, v0, [B

    iget-object v1, p0, Lorg/bouncycastle/crypto/modes/EAXBlockCipher;->g:[B

    iget v2, p0, Lorg/bouncycastle/crypto/modes/EAXBlockCipher;->h:I

    invoke-static {v1, v3, v0, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v0
.end method

.method public getOutputSize(I)I
    .locals 2

    iget-boolean v0, p0, Lorg/bouncycastle/crypto/modes/EAXBlockCipher;->b:Z

    if-eqz v0, :cond_0

    iget v0, p0, Lorg/bouncycastle/crypto/modes/EAXBlockCipher;->j:I

    add-int/2addr v0, p1

    iget v1, p0, Lorg/bouncycastle/crypto/modes/EAXBlockCipher;->h:I

    add-int/2addr v0, v1

    :goto_0
    return v0

    :cond_0
    iget v0, p0, Lorg/bouncycastle/crypto/modes/EAXBlockCipher;->j:I

    add-int/2addr v0, p1

    iget v1, p0, Lorg/bouncycastle/crypto/modes/EAXBlockCipher;->h:I

    sub-int/2addr v0, v1

    goto :goto_0
.end method

.method public getUnderlyingCipher()Lorg/bouncycastle/crypto/BlockCipher;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/crypto/modes/EAXBlockCipher;->a:Lorg/bouncycastle/crypto/modes/SICBlockCipher;

    invoke-virtual {v0}, Lorg/bouncycastle/crypto/modes/SICBlockCipher;->getUnderlyingCipher()Lorg/bouncycastle/crypto/BlockCipher;

    move-result-object v0

    return-object v0
.end method

.method public getUpdateOutputSize(I)I
    .locals 2

    iget v0, p0, Lorg/bouncycastle/crypto/modes/EAXBlockCipher;->j:I

    add-int/2addr v0, p1

    iget v1, p0, Lorg/bouncycastle/crypto/modes/EAXBlockCipher;->c:I

    div-int/2addr v0, v1

    iget v1, p0, Lorg/bouncycastle/crypto/modes/EAXBlockCipher;->c:I

    mul-int/2addr v0, v1

    return v0
.end method

.method public init(ZLorg/bouncycastle/crypto/CipherParameters;)V
    .locals 8

    const/4 v7, 0x1

    const/4 v6, 0x0

    iput-boolean p1, p0, Lorg/bouncycastle/crypto/modes/EAXBlockCipher;->b:Z

    instance-of v0, p2, Lorg/bouncycastle/crypto/params/AEADParameters;

    if-eqz v0, :cond_0

    check-cast p2, Lorg/bouncycastle/crypto/params/AEADParameters;

    invoke-virtual {p2}, Lorg/bouncycastle/crypto/params/AEADParameters;->getNonce()[B

    move-result-object v2

    invoke-virtual {p2}, Lorg/bouncycastle/crypto/params/AEADParameters;->getAssociatedText()[B

    move-result-object v1

    invoke-virtual {p2}, Lorg/bouncycastle/crypto/params/AEADParameters;->getMacSize()I

    move-result v0

    div-int/lit8 v0, v0, 0x8

    iput v0, p0, Lorg/bouncycastle/crypto/modes/EAXBlockCipher;->h:I

    invoke-virtual {p2}, Lorg/bouncycastle/crypto/params/AEADParameters;->getKey()Lorg/bouncycastle/crypto/params/KeyParameter;

    move-result-object v0

    :goto_0
    iget v3, p0, Lorg/bouncycastle/crypto/modes/EAXBlockCipher;->c:I

    new-array v3, v3, [B

    iget-object v4, p0, Lorg/bouncycastle/crypto/modes/EAXBlockCipher;->d:Lorg/bouncycastle/crypto/Mac;

    invoke-interface {v4, v0}, Lorg/bouncycastle/crypto/Mac;->init(Lorg/bouncycastle/crypto/CipherParameters;)V

    iget v4, p0, Lorg/bouncycastle/crypto/modes/EAXBlockCipher;->c:I

    add-int/lit8 v4, v4, -0x1

    aput-byte v7, v3, v4

    iget-object v4, p0, Lorg/bouncycastle/crypto/modes/EAXBlockCipher;->d:Lorg/bouncycastle/crypto/Mac;

    iget v5, p0, Lorg/bouncycastle/crypto/modes/EAXBlockCipher;->c:I

    invoke-interface {v4, v3, v6, v5}, Lorg/bouncycastle/crypto/Mac;->update([BII)V

    iget-object v4, p0, Lorg/bouncycastle/crypto/modes/EAXBlockCipher;->d:Lorg/bouncycastle/crypto/Mac;

    array-length v5, v1

    invoke-interface {v4, v1, v6, v5}, Lorg/bouncycastle/crypto/Mac;->update([BII)V

    iget-object v1, p0, Lorg/bouncycastle/crypto/modes/EAXBlockCipher;->d:Lorg/bouncycastle/crypto/Mac;

    iget-object v4, p0, Lorg/bouncycastle/crypto/modes/EAXBlockCipher;->f:[B

    invoke-interface {v1, v4, v6}, Lorg/bouncycastle/crypto/Mac;->doFinal([BI)I

    iget v1, p0, Lorg/bouncycastle/crypto/modes/EAXBlockCipher;->c:I

    add-int/lit8 v1, v1, -0x1

    aput-byte v6, v3, v1

    iget-object v1, p0, Lorg/bouncycastle/crypto/modes/EAXBlockCipher;->d:Lorg/bouncycastle/crypto/Mac;

    iget v4, p0, Lorg/bouncycastle/crypto/modes/EAXBlockCipher;->c:I

    invoke-interface {v1, v3, v6, v4}, Lorg/bouncycastle/crypto/Mac;->update([BII)V

    iget-object v1, p0, Lorg/bouncycastle/crypto/modes/EAXBlockCipher;->d:Lorg/bouncycastle/crypto/Mac;

    array-length v4, v2

    invoke-interface {v1, v2, v6, v4}, Lorg/bouncycastle/crypto/Mac;->update([BII)V

    iget-object v1, p0, Lorg/bouncycastle/crypto/modes/EAXBlockCipher;->d:Lorg/bouncycastle/crypto/Mac;

    iget-object v2, p0, Lorg/bouncycastle/crypto/modes/EAXBlockCipher;->e:[B

    invoke-interface {v1, v2, v6}, Lorg/bouncycastle/crypto/Mac;->doFinal([BI)I

    iget v1, p0, Lorg/bouncycastle/crypto/modes/EAXBlockCipher;->c:I

    add-int/lit8 v1, v1, -0x1

    const/4 v2, 0x2

    aput-byte v2, v3, v1

    iget-object v1, p0, Lorg/bouncycastle/crypto/modes/EAXBlockCipher;->d:Lorg/bouncycastle/crypto/Mac;

    iget v2, p0, Lorg/bouncycastle/crypto/modes/EAXBlockCipher;->c:I

    invoke-interface {v1, v3, v6, v2}, Lorg/bouncycastle/crypto/Mac;->update([BII)V

    iget-object v1, p0, Lorg/bouncycastle/crypto/modes/EAXBlockCipher;->a:Lorg/bouncycastle/crypto/modes/SICBlockCipher;

    new-instance v2, Lorg/bouncycastle/crypto/params/ParametersWithIV;

    iget-object v3, p0, Lorg/bouncycastle/crypto/modes/EAXBlockCipher;->e:[B

    invoke-direct {v2, v0, v3}, Lorg/bouncycastle/crypto/params/ParametersWithIV;-><init>(Lorg/bouncycastle/crypto/CipherParameters;[B)V

    invoke-virtual {v1, v7, v2}, Lorg/bouncycastle/crypto/modes/SICBlockCipher;->init(ZLorg/bouncycastle/crypto/CipherParameters;)V

    return-void

    :cond_0
    instance-of v0, p2, Lorg/bouncycastle/crypto/params/ParametersWithIV;

    if-eqz v0, :cond_1

    check-cast p2, Lorg/bouncycastle/crypto/params/ParametersWithIV;

    invoke-virtual {p2}, Lorg/bouncycastle/crypto/params/ParametersWithIV;->getIV()[B

    move-result-object v2

    new-array v1, v6, [B

    iget-object v0, p0, Lorg/bouncycastle/crypto/modes/EAXBlockCipher;->d:Lorg/bouncycastle/crypto/Mac;

    invoke-interface {v0}, Lorg/bouncycastle/crypto/Mac;->getMacSize()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    iput v0, p0, Lorg/bouncycastle/crypto/modes/EAXBlockCipher;->h:I

    invoke-virtual {p2}, Lorg/bouncycastle/crypto/params/ParametersWithIV;->getParameters()Lorg/bouncycastle/crypto/CipherParameters;

    move-result-object v0

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "invalid parameters passed to EAX"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public processByte(B[BI)I
    .locals 1

    invoke-direct {p0, p1, p2, p3}, Lorg/bouncycastle/crypto/modes/EAXBlockCipher;->process(B[BI)I

    move-result v0

    return v0
.end method

.method public processBytes([BII[BI)I
    .locals 4

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-eq v0, p3, :cond_0

    add-int v2, p2, v0

    aget-byte v2, p1, v2

    add-int v3, p5, v1

    invoke-direct {p0, v2, p4, v3}, Lorg/bouncycastle/crypto/modes/EAXBlockCipher;->process(B[BI)I

    move-result v2

    add-int/2addr v1, v2

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return v1
.end method

.method public reset()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lorg/bouncycastle/crypto/modes/EAXBlockCipher;->reset(Z)V

    return-void
.end method
