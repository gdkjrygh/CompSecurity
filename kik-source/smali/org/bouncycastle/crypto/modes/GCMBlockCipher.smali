.class public Lorg/bouncycastle/crypto/modes/GCMBlockCipher;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/bouncycastle/crypto/modes/AEADBlockCipher;


# static fields
.field private static final a:[B


# instance fields
.field private b:Lorg/bouncycastle/crypto/BlockCipher;

.field private c:Lorg/bouncycastle/crypto/modes/gcm/GCMMultiplier;

.field private d:Z

.field private e:I

.field private f:[B

.field private g:[B

.field private h:Lorg/bouncycastle/crypto/params/KeyParameter;

.field private i:[B

.field private j:[B

.field private k:[B

.field private l:[B

.field private m:[B

.field private n:[B

.field private o:[B

.field private p:I

.field private q:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x10

    new-array v0, v0, [B

    sput-object v0, Lorg/bouncycastle/crypto/modes/GCMBlockCipher;->a:[B

    return-void
.end method

.method public constructor <init>(Lorg/bouncycastle/crypto/BlockCipher;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lorg/bouncycastle/crypto/modes/GCMBlockCipher;-><init>(Lorg/bouncycastle/crypto/BlockCipher;Lorg/bouncycastle/crypto/modes/gcm/GCMMultiplier;)V

    return-void
.end method

.method public constructor <init>(Lorg/bouncycastle/crypto/BlockCipher;Lorg/bouncycastle/crypto/modes/gcm/GCMMultiplier;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-interface {p1}, Lorg/bouncycastle/crypto/BlockCipher;->getBlockSize()I

    move-result v0

    const/16 v1, 0x10

    if-eq v0, v1, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "cipher required with a block size of 16."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    if-nez p2, :cond_1

    new-instance p2, Lorg/bouncycastle/crypto/modes/gcm/Tables8kGCMMultiplier;

    invoke-direct {p2}, Lorg/bouncycastle/crypto/modes/gcm/Tables8kGCMMultiplier;-><init>()V

    :cond_1
    iput-object p1, p0, Lorg/bouncycastle/crypto/modes/GCMBlockCipher;->b:Lorg/bouncycastle/crypto/BlockCipher;

    iput-object p2, p0, Lorg/bouncycastle/crypto/modes/GCMBlockCipher;->c:Lorg/bouncycastle/crypto/modes/gcm/GCMMultiplier;

    return-void
.end method

.method private gCTRBlock([BI[BI)V
    .locals 5

    const/4 v3, 0x0

    const/16 v0, 0xf

    :goto_0
    const/16 v1, 0xc

    if-lt v0, v1, :cond_0

    iget-object v1, p0, Lorg/bouncycastle/crypto/modes/GCMBlockCipher;->o:[B

    aget-byte v1, v1, v0

    add-int/lit8 v1, v1, 0x1

    and-int/lit16 v1, v1, 0xff

    int-to-byte v1, v1

    iget-object v2, p0, Lorg/bouncycastle/crypto/modes/GCMBlockCipher;->o:[B

    aput-byte v1, v2, v0

    if-nez v1, :cond_0

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_0
    const/16 v0, 0x10

    new-array v1, v0, [B

    iget-object v0, p0, Lorg/bouncycastle/crypto/modes/GCMBlockCipher;->b:Lorg/bouncycastle/crypto/BlockCipher;

    iget-object v2, p0, Lorg/bouncycastle/crypto/modes/GCMBlockCipher;->o:[B

    invoke-interface {v0, v2, v3, v1, v3}, Lorg/bouncycastle/crypto/BlockCipher;->processBlock([BI[BI)I

    iget-boolean v0, p0, Lorg/bouncycastle/crypto/modes/GCMBlockCipher;->d:Z

    if-eqz v0, :cond_1

    sget-object v0, Lorg/bouncycastle/crypto/modes/GCMBlockCipher;->a:[B

    rsub-int/lit8 v2, p2, 0x10

    invoke-static {v0, p2, v1, p2, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move-object v0, v1

    :goto_1
    add-int/lit8 v2, p2, -0x1

    :goto_2
    if-ltz v2, :cond_2

    aget-byte v3, v1, v2

    aget-byte v4, p1, v2

    xor-int/2addr v3, v4

    int-to-byte v3, v3

    aput-byte v3, v1, v2

    add-int v3, p4, v2

    aget-byte v4, v1, v2

    aput-byte v4, p3, v3

    add-int/lit8 v2, v2, -0x1

    goto :goto_2

    :cond_1
    move-object v0, p1

    goto :goto_1

    :cond_2
    iget-object v1, p0, Lorg/bouncycastle/crypto/modes/GCMBlockCipher;->n:[B

    invoke-static {v1, v0}, Lorg/bouncycastle/crypto/modes/GCMBlockCipher;->xor([B[B)V

    iget-object v0, p0, Lorg/bouncycastle/crypto/modes/GCMBlockCipher;->c:Lorg/bouncycastle/crypto/modes/gcm/GCMMultiplier;

    iget-object v1, p0, Lorg/bouncycastle/crypto/modes/GCMBlockCipher;->n:[B

    invoke-interface {v0, v1}, Lorg/bouncycastle/crypto/modes/gcm/GCMMultiplier;->multiplyH([B)V

    iget-wide v0, p0, Lorg/bouncycastle/crypto/modes/GCMBlockCipher;->q:J

    int-to-long v2, p2

    add-long/2addr v0, v2

    iput-wide v0, p0, Lorg/bouncycastle/crypto/modes/GCMBlockCipher;->q:J

    return-void
.end method

.method private gHASH([B)[B
    .locals 6

    const/4 v1, 0x0

    const/16 v5, 0x10

    new-array v2, v5, [B

    move v0, v1

    :goto_0
    array-length v3, p1

    if-ge v0, v3, :cond_0

    new-array v3, v5, [B

    array-length v4, p1

    sub-int/2addr v4, v0

    invoke-static {v4, v5}, Ljava/lang/Math;->min(II)I

    move-result v4

    invoke-static {p1, v0, v3, v1, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-static {v2, v3}, Lorg/bouncycastle/crypto/modes/GCMBlockCipher;->xor([B[B)V

    iget-object v3, p0, Lorg/bouncycastle/crypto/modes/GCMBlockCipher;->c:Lorg/bouncycastle/crypto/modes/gcm/GCMMultiplier;

    invoke-interface {v3, v2}, Lorg/bouncycastle/crypto/modes/gcm/GCMMultiplier;->multiplyH([B)V

    add-int/lit8 v0, v0, 0x10

    goto :goto_0

    :cond_0
    return-object v2
.end method

.method private static packLength(J[BI)V
    .locals 2

    const/16 v0, 0x20

    ushr-long v0, p0, v0

    long-to-int v0, v0

    invoke-static {v0, p2, p3}, Lorg/bouncycastle/crypto/util/Pack;->intToBigEndian(I[BI)V

    long-to-int v0, p0

    add-int/lit8 v1, p3, 0x4

    invoke-static {v0, p2, v1}, Lorg/bouncycastle/crypto/util/Pack;->intToBigEndian(I[BI)V

    return-void
.end method

.method private process(B[BI)I
    .locals 5

    const/4 v1, 0x0

    const/16 v0, 0x10

    iget-object v2, p0, Lorg/bouncycastle/crypto/modes/GCMBlockCipher;->l:[B

    iget v3, p0, Lorg/bouncycastle/crypto/modes/GCMBlockCipher;->p:I

    add-int/lit8 v4, v3, 0x1

    iput v4, p0, Lorg/bouncycastle/crypto/modes/GCMBlockCipher;->p:I

    aput-byte p1, v2, v3

    iget v2, p0, Lorg/bouncycastle/crypto/modes/GCMBlockCipher;->p:I

    iget-object v3, p0, Lorg/bouncycastle/crypto/modes/GCMBlockCipher;->l:[B

    array-length v3, v3

    if-ne v2, v3, :cond_1

    iget-object v2, p0, Lorg/bouncycastle/crypto/modes/GCMBlockCipher;->l:[B

    invoke-direct {p0, v2, v0, p2, p3}, Lorg/bouncycastle/crypto/modes/GCMBlockCipher;->gCTRBlock([BI[BI)V

    iget-boolean v2, p0, Lorg/bouncycastle/crypto/modes/GCMBlockCipher;->d:Z

    if-nez v2, :cond_0

    iget-object v2, p0, Lorg/bouncycastle/crypto/modes/GCMBlockCipher;->l:[B

    iget-object v3, p0, Lorg/bouncycastle/crypto/modes/GCMBlockCipher;->l:[B

    iget v4, p0, Lorg/bouncycastle/crypto/modes/GCMBlockCipher;->e:I

    invoke-static {v2, v0, v3, v1, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_0
    iget-object v1, p0, Lorg/bouncycastle/crypto/modes/GCMBlockCipher;->l:[B

    array-length v1, v1

    add-int/lit8 v1, v1, -0x10

    iput v1, p0, Lorg/bouncycastle/crypto/modes/GCMBlockCipher;->p:I

    :goto_0
    return v0

    :cond_1
    move v0, v1

    goto :goto_0
.end method

.method private reset(Z)V
    .locals 2

    iget-object v0, p0, Lorg/bouncycastle/crypto/modes/GCMBlockCipher;->j:[B

    invoke-static {v0}, Lorg/bouncycastle/util/Arrays;->c([B)[B

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/crypto/modes/GCMBlockCipher;->n:[B

    iget-object v0, p0, Lorg/bouncycastle/crypto/modes/GCMBlockCipher;->k:[B

    invoke-static {v0}, Lorg/bouncycastle/util/Arrays;->c([B)[B

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/crypto/modes/GCMBlockCipher;->o:[B

    const/4 v0, 0x0

    iput v0, p0, Lorg/bouncycastle/crypto/modes/GCMBlockCipher;->p:I

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lorg/bouncycastle/crypto/modes/GCMBlockCipher;->q:J

    iget-object v0, p0, Lorg/bouncycastle/crypto/modes/GCMBlockCipher;->l:[B

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/bouncycastle/crypto/modes/GCMBlockCipher;->l:[B

    invoke-static {v0}, Lorg/bouncycastle/util/Arrays;->a([B)V

    :cond_0
    if-eqz p1, :cond_1

    const/4 v0, 0x0

    iput-object v0, p0, Lorg/bouncycastle/crypto/modes/GCMBlockCipher;->m:[B

    :cond_1
    iget-object v0, p0, Lorg/bouncycastle/crypto/modes/GCMBlockCipher;->b:Lorg/bouncycastle/crypto/BlockCipher;

    invoke-interface {v0}, Lorg/bouncycastle/crypto/BlockCipher;->reset()V

    return-void
.end method

.method private static xor([B[B)V
    .locals 3

    const/16 v0, 0xf

    :goto_0
    if-ltz v0, :cond_0

    aget-byte v1, p0, v0

    aget-byte v2, p1, v0

    xor-int/2addr v1, v2

    int-to-byte v1, v1

    aput-byte v1, p0, v0

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public doFinal([BI)I
    .locals 10

    const-wide/16 v8, 0x8

    const/16 v6, 0x10

    const/4 v5, 0x0

    iget v0, p0, Lorg/bouncycastle/crypto/modes/GCMBlockCipher;->p:I

    iget-boolean v1, p0, Lorg/bouncycastle/crypto/modes/GCMBlockCipher;->d:Z

    if-nez v1, :cond_1

    iget v1, p0, Lorg/bouncycastle/crypto/modes/GCMBlockCipher;->e:I

    if-ge v0, v1, :cond_0

    new-instance v0, Lorg/bouncycastle/crypto/InvalidCipherTextException;

    const-string v1, "data too short"

    invoke-direct {v0, v1}, Lorg/bouncycastle/crypto/InvalidCipherTextException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget v1, p0, Lorg/bouncycastle/crypto/modes/GCMBlockCipher;->e:I

    sub-int/2addr v0, v1

    :cond_1
    if-lez v0, :cond_2

    new-array v1, v6, [B

    iget-object v2, p0, Lorg/bouncycastle/crypto/modes/GCMBlockCipher;->l:[B

    invoke-static {v2, v5, v1, v5, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-direct {p0, v1, v0, p1, p2}, Lorg/bouncycastle/crypto/modes/GCMBlockCipher;->gCTRBlock([BI[BI)V

    :cond_2
    new-array v1, v6, [B

    iget-object v2, p0, Lorg/bouncycastle/crypto/modes/GCMBlockCipher;->g:[B

    array-length v2, v2

    int-to-long v2, v2

    mul-long/2addr v2, v8

    invoke-static {v2, v3, v1, v5}, Lorg/bouncycastle/crypto/modes/GCMBlockCipher;->packLength(J[BI)V

    iget-wide v2, p0, Lorg/bouncycastle/crypto/modes/GCMBlockCipher;->q:J

    mul-long/2addr v2, v8

    const/16 v4, 0x8

    invoke-static {v2, v3, v1, v4}, Lorg/bouncycastle/crypto/modes/GCMBlockCipher;->packLength(J[BI)V

    iget-object v2, p0, Lorg/bouncycastle/crypto/modes/GCMBlockCipher;->n:[B

    invoke-static {v2, v1}, Lorg/bouncycastle/crypto/modes/GCMBlockCipher;->xor([B[B)V

    iget-object v1, p0, Lorg/bouncycastle/crypto/modes/GCMBlockCipher;->c:Lorg/bouncycastle/crypto/modes/gcm/GCMMultiplier;

    iget-object v2, p0, Lorg/bouncycastle/crypto/modes/GCMBlockCipher;->n:[B

    invoke-interface {v1, v2}, Lorg/bouncycastle/crypto/modes/gcm/GCMMultiplier;->multiplyH([B)V

    new-array v1, v6, [B

    iget-object v2, p0, Lorg/bouncycastle/crypto/modes/GCMBlockCipher;->b:Lorg/bouncycastle/crypto/BlockCipher;

    iget-object v3, p0, Lorg/bouncycastle/crypto/modes/GCMBlockCipher;->k:[B

    invoke-interface {v2, v3, v5, v1, v5}, Lorg/bouncycastle/crypto/BlockCipher;->processBlock([BI[BI)I

    iget-object v2, p0, Lorg/bouncycastle/crypto/modes/GCMBlockCipher;->n:[B

    invoke-static {v1, v2}, Lorg/bouncycastle/crypto/modes/GCMBlockCipher;->xor([B[B)V

    iget v2, p0, Lorg/bouncycastle/crypto/modes/GCMBlockCipher;->e:I

    new-array v2, v2, [B

    iput-object v2, p0, Lorg/bouncycastle/crypto/modes/GCMBlockCipher;->m:[B

    iget-object v2, p0, Lorg/bouncycastle/crypto/modes/GCMBlockCipher;->m:[B

    iget v3, p0, Lorg/bouncycastle/crypto/modes/GCMBlockCipher;->e:I

    invoke-static {v1, v5, v2, v5, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-boolean v1, p0, Lorg/bouncycastle/crypto/modes/GCMBlockCipher;->d:Z

    if-eqz v1, :cond_4

    iget-object v1, p0, Lorg/bouncycastle/crypto/modes/GCMBlockCipher;->m:[B

    iget v2, p0, Lorg/bouncycastle/crypto/modes/GCMBlockCipher;->p:I

    add-int/2addr v2, p2

    iget v3, p0, Lorg/bouncycastle/crypto/modes/GCMBlockCipher;->e:I

    invoke-static {v1, v5, p1, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget v1, p0, Lorg/bouncycastle/crypto/modes/GCMBlockCipher;->e:I

    add-int/2addr v0, v1

    :cond_3
    invoke-direct {p0, v5}, Lorg/bouncycastle/crypto/modes/GCMBlockCipher;->reset(Z)V

    return v0

    :cond_4
    iget v1, p0, Lorg/bouncycastle/crypto/modes/GCMBlockCipher;->e:I

    new-array v1, v1, [B

    iget-object v2, p0, Lorg/bouncycastle/crypto/modes/GCMBlockCipher;->l:[B

    iget v3, p0, Lorg/bouncycastle/crypto/modes/GCMBlockCipher;->e:I

    invoke-static {v2, v0, v1, v5, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v2, p0, Lorg/bouncycastle/crypto/modes/GCMBlockCipher;->m:[B

    invoke-static {v2, v1}, Lorg/bouncycastle/util/Arrays;->b([B[B)Z

    move-result v1

    if-nez v1, :cond_3

    new-instance v0, Lorg/bouncycastle/crypto/InvalidCipherTextException;

    const-string v1, "mac check in GCM failed"

    invoke-direct {v0, v1}, Lorg/bouncycastle/crypto/InvalidCipherTextException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public getAlgorithmName()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lorg/bouncycastle/crypto/modes/GCMBlockCipher;->b:Lorg/bouncycastle/crypto/BlockCipher;

    invoke-interface {v1}, Lorg/bouncycastle/crypto/BlockCipher;->getAlgorithmName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/GCM"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getMac()[B
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/crypto/modes/GCMBlockCipher;->m:[B

    invoke-static {v0}, Lorg/bouncycastle/util/Arrays;->c([B)[B

    move-result-object v0

    return-object v0
.end method

.method public getOutputSize(I)I
    .locals 2

    iget-boolean v0, p0, Lorg/bouncycastle/crypto/modes/GCMBlockCipher;->d:Z

    if-eqz v0, :cond_0

    iget v0, p0, Lorg/bouncycastle/crypto/modes/GCMBlockCipher;->p:I

    add-int/2addr v0, p1

    iget v1, p0, Lorg/bouncycastle/crypto/modes/GCMBlockCipher;->e:I

    add-int/2addr v0, v1

    :goto_0
    return v0

    :cond_0
    iget v0, p0, Lorg/bouncycastle/crypto/modes/GCMBlockCipher;->p:I

    add-int/2addr v0, p1

    iget v1, p0, Lorg/bouncycastle/crypto/modes/GCMBlockCipher;->e:I

    sub-int/2addr v0, v1

    goto :goto_0
.end method

.method public getUnderlyingCipher()Lorg/bouncycastle/crypto/BlockCipher;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/crypto/modes/GCMBlockCipher;->b:Lorg/bouncycastle/crypto/BlockCipher;

    return-object v0
.end method

.method public getUpdateOutputSize(I)I
    .locals 1

    iget v0, p0, Lorg/bouncycastle/crypto/modes/GCMBlockCipher;->p:I

    add-int/2addr v0, p1

    div-int/lit8 v0, v0, 0x10

    mul-int/lit8 v0, v0, 0x10

    return v0
.end method

.method public init(ZLorg/bouncycastle/crypto/CipherParameters;)V
    .locals 7

    const/4 v2, 0x0

    const/4 v4, 0x1

    const/16 v1, 0x10

    const/4 v6, 0x0

    iput-boolean p1, p0, Lorg/bouncycastle/crypto/modes/GCMBlockCipher;->d:Z

    iput-object v2, p0, Lorg/bouncycastle/crypto/modes/GCMBlockCipher;->m:[B

    instance-of v0, p2, Lorg/bouncycastle/crypto/params/AEADParameters;

    if-eqz v0, :cond_3

    check-cast p2, Lorg/bouncycastle/crypto/params/AEADParameters;

    invoke-virtual {p2}, Lorg/bouncycastle/crypto/params/AEADParameters;->getNonce()[B

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/crypto/modes/GCMBlockCipher;->f:[B

    invoke-virtual {p2}, Lorg/bouncycastle/crypto/params/AEADParameters;->getAssociatedText()[B

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/crypto/modes/GCMBlockCipher;->g:[B

    invoke-virtual {p2}, Lorg/bouncycastle/crypto/params/AEADParameters;->getMacSize()I

    move-result v0

    const/16 v2, 0x60

    if-lt v0, v2, :cond_0

    const/16 v2, 0x80

    if-gt v0, v2, :cond_0

    rem-int/lit8 v2, v0, 0x8

    if-eqz v2, :cond_1

    :cond_0
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Invalid value for MAC size: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    div-int/lit8 v0, v0, 0x8

    iput v0, p0, Lorg/bouncycastle/crypto/modes/GCMBlockCipher;->e:I

    invoke-virtual {p2}, Lorg/bouncycastle/crypto/params/AEADParameters;->getKey()Lorg/bouncycastle/crypto/params/KeyParameter;

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/crypto/modes/GCMBlockCipher;->h:Lorg/bouncycastle/crypto/params/KeyParameter;

    :goto_0
    if-eqz p1, :cond_5

    move v0, v1

    :goto_1
    new-array v0, v0, [B

    iput-object v0, p0, Lorg/bouncycastle/crypto/modes/GCMBlockCipher;->l:[B

    iget-object v0, p0, Lorg/bouncycastle/crypto/modes/GCMBlockCipher;->f:[B

    if-eqz v0, :cond_2

    iget-object v0, p0, Lorg/bouncycastle/crypto/modes/GCMBlockCipher;->f:[B

    array-length v0, v0

    if-gtz v0, :cond_6

    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "IV must be at least 1 byte"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    instance-of v0, p2, Lorg/bouncycastle/crypto/params/ParametersWithIV;

    if-eqz v0, :cond_4

    check-cast p2, Lorg/bouncycastle/crypto/params/ParametersWithIV;

    invoke-virtual {p2}, Lorg/bouncycastle/crypto/params/ParametersWithIV;->getIV()[B

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/crypto/modes/GCMBlockCipher;->f:[B

    iput-object v2, p0, Lorg/bouncycastle/crypto/modes/GCMBlockCipher;->g:[B

    iput v1, p0, Lorg/bouncycastle/crypto/modes/GCMBlockCipher;->e:I

    invoke-virtual {p2}, Lorg/bouncycastle/crypto/params/ParametersWithIV;->getParameters()Lorg/bouncycastle/crypto/CipherParameters;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/crypto/params/KeyParameter;

    iput-object v0, p0, Lorg/bouncycastle/crypto/modes/GCMBlockCipher;->h:Lorg/bouncycastle/crypto/params/KeyParameter;

    goto :goto_0

    :cond_4
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "invalid parameters passed to GCM"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    iget v0, p0, Lorg/bouncycastle/crypto/modes/GCMBlockCipher;->e:I

    add-int/lit8 v0, v0, 0x10

    goto :goto_1

    :cond_6
    iget-object v0, p0, Lorg/bouncycastle/crypto/modes/GCMBlockCipher;->g:[B

    if-nez v0, :cond_7

    new-array v0, v6, [B

    iput-object v0, p0, Lorg/bouncycastle/crypto/modes/GCMBlockCipher;->g:[B

    :cond_7
    iget-object v0, p0, Lorg/bouncycastle/crypto/modes/GCMBlockCipher;->b:Lorg/bouncycastle/crypto/BlockCipher;

    iget-object v2, p0, Lorg/bouncycastle/crypto/modes/GCMBlockCipher;->h:Lorg/bouncycastle/crypto/params/KeyParameter;

    invoke-interface {v0, v4, v2}, Lorg/bouncycastle/crypto/BlockCipher;->init(ZLorg/bouncycastle/crypto/CipherParameters;)V

    new-array v0, v1, [B

    iput-object v0, p0, Lorg/bouncycastle/crypto/modes/GCMBlockCipher;->i:[B

    iget-object v0, p0, Lorg/bouncycastle/crypto/modes/GCMBlockCipher;->b:Lorg/bouncycastle/crypto/BlockCipher;

    sget-object v2, Lorg/bouncycastle/crypto/modes/GCMBlockCipher;->a:[B

    iget-object v3, p0, Lorg/bouncycastle/crypto/modes/GCMBlockCipher;->i:[B

    invoke-interface {v0, v2, v6, v3, v6}, Lorg/bouncycastle/crypto/BlockCipher;->processBlock([BI[BI)I

    iget-object v0, p0, Lorg/bouncycastle/crypto/modes/GCMBlockCipher;->c:Lorg/bouncycastle/crypto/modes/gcm/GCMMultiplier;

    iget-object v2, p0, Lorg/bouncycastle/crypto/modes/GCMBlockCipher;->i:[B

    invoke-interface {v0, v2}, Lorg/bouncycastle/crypto/modes/gcm/GCMMultiplier;->init([B)V

    iget-object v0, p0, Lorg/bouncycastle/crypto/modes/GCMBlockCipher;->g:[B

    invoke-direct {p0, v0}, Lorg/bouncycastle/crypto/modes/GCMBlockCipher;->gHASH([B)[B

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/crypto/modes/GCMBlockCipher;->j:[B

    iget-object v0, p0, Lorg/bouncycastle/crypto/modes/GCMBlockCipher;->f:[B

    array-length v0, v0

    const/16 v2, 0xc

    if-ne v0, v2, :cond_8

    new-array v0, v1, [B

    iput-object v0, p0, Lorg/bouncycastle/crypto/modes/GCMBlockCipher;->k:[B

    iget-object v0, p0, Lorg/bouncycastle/crypto/modes/GCMBlockCipher;->f:[B

    iget-object v1, p0, Lorg/bouncycastle/crypto/modes/GCMBlockCipher;->k:[B

    iget-object v2, p0, Lorg/bouncycastle/crypto/modes/GCMBlockCipher;->f:[B

    array-length v2, v2

    invoke-static {v0, v6, v1, v6, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v0, p0, Lorg/bouncycastle/crypto/modes/GCMBlockCipher;->k:[B

    const/16 v1, 0xf

    aput-byte v4, v0, v1

    :goto_2
    iget-object v0, p0, Lorg/bouncycastle/crypto/modes/GCMBlockCipher;->j:[B

    invoke-static {v0}, Lorg/bouncycastle/util/Arrays;->c([B)[B

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/crypto/modes/GCMBlockCipher;->n:[B

    iget-object v0, p0, Lorg/bouncycastle/crypto/modes/GCMBlockCipher;->k:[B

    invoke-static {v0}, Lorg/bouncycastle/util/Arrays;->c([B)[B

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/crypto/modes/GCMBlockCipher;->o:[B

    iput v6, p0, Lorg/bouncycastle/crypto/modes/GCMBlockCipher;->p:I

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lorg/bouncycastle/crypto/modes/GCMBlockCipher;->q:J

    return-void

    :cond_8
    iget-object v0, p0, Lorg/bouncycastle/crypto/modes/GCMBlockCipher;->f:[B

    invoke-direct {p0, v0}, Lorg/bouncycastle/crypto/modes/GCMBlockCipher;->gHASH([B)[B

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/crypto/modes/GCMBlockCipher;->k:[B

    new-array v0, v1, [B

    iget-object v1, p0, Lorg/bouncycastle/crypto/modes/GCMBlockCipher;->f:[B

    array-length v1, v1

    int-to-long v2, v1

    const-wide/16 v4, 0x8

    mul-long/2addr v2, v4

    const/16 v1, 0x8

    invoke-static {v2, v3, v0, v1}, Lorg/bouncycastle/crypto/modes/GCMBlockCipher;->packLength(J[BI)V

    iget-object v1, p0, Lorg/bouncycastle/crypto/modes/GCMBlockCipher;->k:[B

    invoke-static {v1, v0}, Lorg/bouncycastle/crypto/modes/GCMBlockCipher;->xor([B[B)V

    iget-object v0, p0, Lorg/bouncycastle/crypto/modes/GCMBlockCipher;->c:Lorg/bouncycastle/crypto/modes/gcm/GCMMultiplier;

    iget-object v1, p0, Lorg/bouncycastle/crypto/modes/GCMBlockCipher;->k:[B

    invoke-interface {v0, v1}, Lorg/bouncycastle/crypto/modes/gcm/GCMMultiplier;->multiplyH([B)V

    goto :goto_2
.end method

.method public processByte(B[BI)I
    .locals 1

    invoke-direct {p0, p1, p2, p3}, Lorg/bouncycastle/crypto/modes/GCMBlockCipher;->process(B[BI)I

    move-result v0

    return v0
.end method

.method public processBytes([BII[BI)I
    .locals 7

    const/16 v6, 0x10

    const/4 v2, 0x0

    move v1, v2

    move v0, v2

    :goto_0
    if-eq v1, p3, :cond_2

    iget-object v3, p0, Lorg/bouncycastle/crypto/modes/GCMBlockCipher;->l:[B

    iget v4, p0, Lorg/bouncycastle/crypto/modes/GCMBlockCipher;->p:I

    add-int/lit8 v5, v4, 0x1

    iput v5, p0, Lorg/bouncycastle/crypto/modes/GCMBlockCipher;->p:I

    add-int v5, p2, v1

    aget-byte v5, p1, v5

    aput-byte v5, v3, v4

    iget v3, p0, Lorg/bouncycastle/crypto/modes/GCMBlockCipher;->p:I

    iget-object v4, p0, Lorg/bouncycastle/crypto/modes/GCMBlockCipher;->l:[B

    array-length v4, v4

    if-ne v3, v4, :cond_1

    iget-object v3, p0, Lorg/bouncycastle/crypto/modes/GCMBlockCipher;->l:[B

    add-int v4, p5, v0

    invoke-direct {p0, v3, v6, p4, v4}, Lorg/bouncycastle/crypto/modes/GCMBlockCipher;->gCTRBlock([BI[BI)V

    iget-boolean v3, p0, Lorg/bouncycastle/crypto/modes/GCMBlockCipher;->d:Z

    if-nez v3, :cond_0

    iget-object v3, p0, Lorg/bouncycastle/crypto/modes/GCMBlockCipher;->l:[B

    iget-object v4, p0, Lorg/bouncycastle/crypto/modes/GCMBlockCipher;->l:[B

    iget v5, p0, Lorg/bouncycastle/crypto/modes/GCMBlockCipher;->e:I

    invoke-static {v3, v6, v4, v2, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_0
    iget-object v3, p0, Lorg/bouncycastle/crypto/modes/GCMBlockCipher;->l:[B

    array-length v3, v3

    add-int/lit8 v3, v3, -0x10

    iput v3, p0, Lorg/bouncycastle/crypto/modes/GCMBlockCipher;->p:I

    add-int/lit8 v0, v0, 0x10

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return v0
.end method

.method public reset()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lorg/bouncycastle/crypto/modes/GCMBlockCipher;->reset(Z)V

    return-void
.end method
