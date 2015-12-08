.class public Lorg/bouncycastle/crypto/engines/RC6Engine;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/bouncycastle/crypto/BlockCipher;


# instance fields
.field private a:[I

.field private b:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lorg/bouncycastle/crypto/engines/RC6Engine;->a:[I

    return-void
.end method

.method private bytesToWord([BI)I
    .locals 3

    const/4 v1, 0x0

    const/4 v0, 0x3

    :goto_0
    if-ltz v0, :cond_0

    shl-int/lit8 v1, v1, 0x8

    add-int v2, v0, p2

    aget-byte v2, p1, v2

    and-int/lit16 v2, v2, 0xff

    add-int/2addr v1, v2

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_0
    return v1
.end method

.method private decryptBlock([BI[BI)I
    .locals 11

    const/4 v9, 0x5

    invoke-direct {p0, p1, p2}, Lorg/bouncycastle/crypto/engines/RC6Engine;->bytesToWord([BI)I

    move-result v2

    add-int/lit8 v0, p2, 0x4

    invoke-direct {p0, p1, v0}, Lorg/bouncycastle/crypto/engines/RC6Engine;->bytesToWord([BI)I

    move-result v1

    add-int/lit8 v0, p2, 0x8

    invoke-direct {p0, p1, v0}, Lorg/bouncycastle/crypto/engines/RC6Engine;->bytesToWord([BI)I

    move-result v0

    add-int/lit8 v3, p2, 0xc

    invoke-direct {p0, p1, v3}, Lorg/bouncycastle/crypto/engines/RC6Engine;->bytesToWord([BI)I

    move-result v4

    iget-object v3, p0, Lorg/bouncycastle/crypto/engines/RC6Engine;->a:[I

    const/16 v5, 0x2b

    aget v3, v3, v5

    sub-int/2addr v0, v3

    iget-object v3, p0, Lorg/bouncycastle/crypto/engines/RC6Engine;->a:[I

    const/16 v5, 0x2a

    aget v3, v3, v5

    sub-int/2addr v2, v3

    const/16 v3, 0x14

    move v10, v3

    move v3, v4

    move v4, v10

    :goto_0
    if-lez v4, :cond_0

    mul-int/lit8 v5, v2, 0x2

    add-int/lit8 v5, v5, 0x1

    mul-int/2addr v5, v2

    invoke-direct {p0, v5, v9}, Lorg/bouncycastle/crypto/engines/RC6Engine;->rotateLeft(II)I

    move-result v5

    mul-int/lit8 v6, v0, 0x2

    add-int/lit8 v6, v6, 0x1

    mul-int/2addr v6, v0

    invoke-direct {p0, v6, v9}, Lorg/bouncycastle/crypto/engines/RC6Engine;->rotateLeft(II)I

    move-result v6

    iget-object v7, p0, Lorg/bouncycastle/crypto/engines/RC6Engine;->a:[I

    mul-int/lit8 v8, v4, 0x2

    add-int/lit8 v8, v8, 0x1

    aget v7, v7, v8

    sub-int/2addr v1, v7

    invoke-direct {p0, v1, v5}, Lorg/bouncycastle/crypto/engines/RC6Engine;->rotateRight(II)I

    move-result v1

    xor-int/2addr v1, v6

    iget-object v7, p0, Lorg/bouncycastle/crypto/engines/RC6Engine;->a:[I

    mul-int/lit8 v8, v4, 0x2

    aget v7, v7, v8

    sub-int/2addr v3, v7

    invoke-direct {p0, v3, v6}, Lorg/bouncycastle/crypto/engines/RC6Engine;->rotateRight(II)I

    move-result v3

    xor-int/2addr v3, v5

    add-int/lit8 v4, v4, -0x1

    move v10, v1

    move v1, v2

    move v2, v3

    move v3, v0

    move v0, v10

    goto :goto_0

    :cond_0
    iget-object v4, p0, Lorg/bouncycastle/crypto/engines/RC6Engine;->a:[I

    const/4 v5, 0x1

    aget v4, v4, v5

    sub-int/2addr v3, v4

    iget-object v4, p0, Lorg/bouncycastle/crypto/engines/RC6Engine;->a:[I

    const/4 v5, 0x0

    aget v4, v4, v5

    sub-int/2addr v1, v4

    invoke-direct {p0, v2, p3, p4}, Lorg/bouncycastle/crypto/engines/RC6Engine;->wordToBytes(I[BI)V

    add-int/lit8 v2, p4, 0x4

    invoke-direct {p0, v1, p3, v2}, Lorg/bouncycastle/crypto/engines/RC6Engine;->wordToBytes(I[BI)V

    add-int/lit8 v1, p4, 0x8

    invoke-direct {p0, v0, p3, v1}, Lorg/bouncycastle/crypto/engines/RC6Engine;->wordToBytes(I[BI)V

    add-int/lit8 v0, p4, 0xc

    invoke-direct {p0, v3, p3, v0}, Lorg/bouncycastle/crypto/engines/RC6Engine;->wordToBytes(I[BI)V

    const/16 v0, 0x10

    return v0
.end method

.method private encryptBlock([BI[BI)I
    .locals 11

    const/4 v9, 0x5

    const/4 v3, 0x1

    invoke-direct {p0, p1, p2}, Lorg/bouncycastle/crypto/engines/RC6Engine;->bytesToWord([BI)I

    move-result v2

    add-int/lit8 v0, p2, 0x4

    invoke-direct {p0, p1, v0}, Lorg/bouncycastle/crypto/engines/RC6Engine;->bytesToWord([BI)I

    move-result v1

    add-int/lit8 v0, p2, 0x8

    invoke-direct {p0, p1, v0}, Lorg/bouncycastle/crypto/engines/RC6Engine;->bytesToWord([BI)I

    move-result v0

    add-int/lit8 v4, p2, 0xc

    invoke-direct {p0, p1, v4}, Lorg/bouncycastle/crypto/engines/RC6Engine;->bytesToWord([BI)I

    move-result v4

    iget-object v5, p0, Lorg/bouncycastle/crypto/engines/RC6Engine;->a:[I

    const/4 v6, 0x0

    aget v5, v5, v6

    add-int/2addr v1, v5

    iget-object v5, p0, Lorg/bouncycastle/crypto/engines/RC6Engine;->a:[I

    aget v5, v5, v3

    add-int/2addr v4, v5

    move v10, v1

    move v1, v4

    move v4, v3

    move v3, v2

    move v2, v10

    :goto_0
    const/16 v5, 0x14

    if-gt v4, v5, :cond_0

    mul-int/lit8 v5, v2, 0x2

    add-int/lit8 v5, v5, 0x1

    mul-int/2addr v5, v2

    invoke-direct {p0, v5, v9}, Lorg/bouncycastle/crypto/engines/RC6Engine;->rotateLeft(II)I

    move-result v6

    mul-int/lit8 v5, v1, 0x2

    add-int/lit8 v5, v5, 0x1

    mul-int/2addr v5, v1

    invoke-direct {p0, v5, v9}, Lorg/bouncycastle/crypto/engines/RC6Engine;->rotateLeft(II)I

    move-result v7

    xor-int/2addr v3, v6

    invoke-direct {p0, v3, v7}, Lorg/bouncycastle/crypto/engines/RC6Engine;->rotateLeft(II)I

    move-result v3

    iget-object v5, p0, Lorg/bouncycastle/crypto/engines/RC6Engine;->a:[I

    mul-int/lit8 v8, v4, 0x2

    aget v5, v5, v8

    add-int/2addr v5, v3

    xor-int/2addr v0, v7

    invoke-direct {p0, v0, v6}, Lorg/bouncycastle/crypto/engines/RC6Engine;->rotateLeft(II)I

    move-result v0

    iget-object v3, p0, Lorg/bouncycastle/crypto/engines/RC6Engine;->a:[I

    mul-int/lit8 v6, v4, 0x2

    add-int/lit8 v6, v6, 0x1

    aget v3, v3, v6

    add-int/2addr v0, v3

    add-int/lit8 v3, v4, 0x1

    move v4, v3

    move v3, v2

    move v2, v0

    move v0, v1

    move v1, v5

    goto :goto_0

    :cond_0
    iget-object v4, p0, Lorg/bouncycastle/crypto/engines/RC6Engine;->a:[I

    const/16 v5, 0x2a

    aget v4, v4, v5

    add-int/2addr v3, v4

    iget-object v4, p0, Lorg/bouncycastle/crypto/engines/RC6Engine;->a:[I

    const/16 v5, 0x2b

    aget v4, v4, v5

    add-int/2addr v0, v4

    invoke-direct {p0, v3, p3, p4}, Lorg/bouncycastle/crypto/engines/RC6Engine;->wordToBytes(I[BI)V

    add-int/lit8 v3, p4, 0x4

    invoke-direct {p0, v2, p3, v3}, Lorg/bouncycastle/crypto/engines/RC6Engine;->wordToBytes(I[BI)V

    add-int/lit8 v2, p4, 0x8

    invoke-direct {p0, v0, p3, v2}, Lorg/bouncycastle/crypto/engines/RC6Engine;->wordToBytes(I[BI)V

    add-int/lit8 v0, p4, 0xc

    invoke-direct {p0, v1, p3, v0}, Lorg/bouncycastle/crypto/engines/RC6Engine;->wordToBytes(I[BI)V

    const/16 v0, 0x10

    return v0
.end method

.method private rotateLeft(II)I
    .locals 2

    shl-int v0, p1, p2

    neg-int v1, p2

    ushr-int v1, p1, v1

    or-int/2addr v0, v1

    return v0
.end method

.method private rotateRight(II)I
    .locals 2

    ushr-int v0, p1, p2

    neg-int v1, p2

    shl-int v1, p1, v1

    or-int/2addr v0, v1

    return v0
.end method

.method private setKey([B)V
    .locals 9

    const/4 v1, 0x0

    array-length v0, p1

    add-int/lit8 v0, v0, 0x4

    add-int/lit8 v0, v0, -0x1

    div-int/lit8 v0, v0, 0x4

    new-array v6, v0, [I

    array-length v0, p1

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_0

    div-int/lit8 v2, v0, 0x4

    div-int/lit8 v3, v0, 0x4

    aget v3, v6, v3

    shl-int/lit8 v3, v3, 0x8

    aget-byte v4, p1, v0

    and-int/lit16 v4, v4, 0xff

    add-int/2addr v3, v4

    aput v3, v6, v2

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_0
    const/16 v0, 0x2c

    new-array v0, v0, [I

    iput-object v0, p0, Lorg/bouncycastle/crypto/engines/RC6Engine;->a:[I

    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/RC6Engine;->a:[I

    const v2, -0x481eae9d

    aput v2, v0, v1

    const/4 v0, 0x1

    :goto_1
    iget-object v2, p0, Lorg/bouncycastle/crypto/engines/RC6Engine;->a:[I

    array-length v2, v2

    if-ge v0, v2, :cond_1

    iget-object v2, p0, Lorg/bouncycastle/crypto/engines/RC6Engine;->a:[I

    iget-object v3, p0, Lorg/bouncycastle/crypto/engines/RC6Engine;->a:[I

    add-int/lit8 v4, v0, -0x1

    aget v3, v3, v4

    const v4, -0x61c88647

    add-int/2addr v3, v4

    aput v3, v2, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    array-length v0, v6

    iget-object v2, p0, Lorg/bouncycastle/crypto/engines/RC6Engine;->a:[I

    array-length v2, v2

    if-le v0, v2, :cond_2

    array-length v0, v6

    mul-int/lit8 v0, v0, 0x3

    :goto_2
    move v2, v1

    move v3, v1

    move v4, v1

    move v5, v1

    :goto_3
    if-ge v1, v0, :cond_3

    iget-object v7, p0, Lorg/bouncycastle/crypto/engines/RC6Engine;->a:[I

    iget-object v8, p0, Lorg/bouncycastle/crypto/engines/RC6Engine;->a:[I

    aget v8, v8, v3

    add-int/2addr v5, v8

    add-int/2addr v5, v4

    const/4 v8, 0x3

    invoke-direct {p0, v5, v8}, Lorg/bouncycastle/crypto/engines/RC6Engine;->rotateLeft(II)I

    move-result v5

    aput v5, v7, v3

    aget v7, v6, v2

    add-int/2addr v7, v5

    add-int/2addr v7, v4

    add-int/2addr v4, v5

    invoke-direct {p0, v7, v4}, Lorg/bouncycastle/crypto/engines/RC6Engine;->rotateLeft(II)I

    move-result v4

    aput v4, v6, v2

    add-int/lit8 v3, v3, 0x1

    iget-object v7, p0, Lorg/bouncycastle/crypto/engines/RC6Engine;->a:[I

    array-length v7, v7

    rem-int/2addr v3, v7

    add-int/lit8 v2, v2, 0x1

    array-length v7, v6

    rem-int/2addr v2, v7

    add-int/lit8 v1, v1, 0x1

    goto :goto_3

    :cond_2
    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/RC6Engine;->a:[I

    array-length v0, v0

    mul-int/lit8 v0, v0, 0x3

    goto :goto_2

    :cond_3
    return-void
.end method

.method private wordToBytes(I[BI)V
    .locals 3

    const/4 v0, 0x0

    :goto_0
    const/4 v1, 0x4

    if-ge v0, v1, :cond_0

    add-int v1, v0, p3

    int-to-byte v2, p1

    aput-byte v2, p2, v1

    ushr-int/lit8 p1, p1, 0x8

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public getAlgorithmName()Ljava/lang/String;
    .locals 1

    const-string v0, "RC6"

    return-object v0
.end method

.method public getBlockSize()I
    .locals 1

    const/16 v0, 0x10

    return v0
.end method

.method public init(ZLorg/bouncycastle/crypto/CipherParameters;)V
    .locals 3

    instance-of v0, p2, Lorg/bouncycastle/crypto/params/KeyParameter;

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "invalid parameter passed to RC6 init - "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    check-cast p2, Lorg/bouncycastle/crypto/params/KeyParameter;

    iput-boolean p1, p0, Lorg/bouncycastle/crypto/engines/RC6Engine;->b:Z

    invoke-virtual {p2}, Lorg/bouncycastle/crypto/params/KeyParameter;->getKey()[B

    move-result-object v0

    invoke-direct {p0, v0}, Lorg/bouncycastle/crypto/engines/RC6Engine;->setKey([B)V

    return-void
.end method

.method public processBlock([BI[BI)I
    .locals 3

    invoke-virtual {p0}, Lorg/bouncycastle/crypto/engines/RC6Engine;->getBlockSize()I

    move-result v0

    iget-object v1, p0, Lorg/bouncycastle/crypto/engines/RC6Engine;->a:[I

    if-nez v1, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "RC6 engine not initialised"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    add-int v1, p2, v0

    array-length v2, p1

    if-le v1, v2, :cond_1

    new-instance v0, Lorg/bouncycastle/crypto/DataLengthException;

    const-string v1, "input buffer too short"

    invoke-direct {v0, v1}, Lorg/bouncycastle/crypto/DataLengthException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    add-int/2addr v0, p4

    array-length v1, p3

    if-le v0, v1, :cond_2

    new-instance v0, Lorg/bouncycastle/crypto/DataLengthException;

    const-string v1, "output buffer too short"

    invoke-direct {v0, v1}, Lorg/bouncycastle/crypto/DataLengthException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget-boolean v0, p0, Lorg/bouncycastle/crypto/engines/RC6Engine;->b:Z

    if-eqz v0, :cond_3

    invoke-direct {p0, p1, p2, p3, p4}, Lorg/bouncycastle/crypto/engines/RC6Engine;->encryptBlock([BI[BI)I

    move-result v0

    :goto_0
    return v0

    :cond_3
    invoke-direct {p0, p1, p2, p3, p4}, Lorg/bouncycastle/crypto/engines/RC6Engine;->decryptBlock([BI[BI)I

    move-result v0

    goto :goto_0
.end method

.method public reset()V
    .locals 0

    return-void
.end method
