.class public Lorg/bouncycastle/crypto/engines/IESEngine;
.super Ljava/lang/Object;


# instance fields
.field a:Lorg/bouncycastle/crypto/BasicAgreement;

.field b:Lorg/bouncycastle/crypto/DerivationFunction;

.field c:Lorg/bouncycastle/crypto/Mac;

.field d:Lorg/bouncycastle/crypto/BufferedBlockCipher;

.field e:[B

.field f:Z

.field g:Lorg/bouncycastle/crypto/CipherParameters;

.field h:Lorg/bouncycastle/crypto/CipherParameters;

.field i:Lorg/bouncycastle/crypto/params/IESParameters;


# direct methods
.method public constructor <init>(Lorg/bouncycastle/crypto/BasicAgreement;Lorg/bouncycastle/crypto/DerivationFunction;Lorg/bouncycastle/crypto/Mac;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/bouncycastle/crypto/engines/IESEngine;->a:Lorg/bouncycastle/crypto/BasicAgreement;

    iput-object p2, p0, Lorg/bouncycastle/crypto/engines/IESEngine;->b:Lorg/bouncycastle/crypto/DerivationFunction;

    iput-object p3, p0, Lorg/bouncycastle/crypto/engines/IESEngine;->c:Lorg/bouncycastle/crypto/Mac;

    invoke-interface {p3}, Lorg/bouncycastle/crypto/Mac;->getMacSize()I

    move-result v0

    new-array v0, v0, [B

    iput-object v0, p0, Lorg/bouncycastle/crypto/engines/IESEngine;->e:[B

    const/4 v0, 0x0

    iput-object v0, p0, Lorg/bouncycastle/crypto/engines/IESEngine;->d:Lorg/bouncycastle/crypto/BufferedBlockCipher;

    return-void
.end method

.method public constructor <init>(Lorg/bouncycastle/crypto/BasicAgreement;Lorg/bouncycastle/crypto/DerivationFunction;Lorg/bouncycastle/crypto/Mac;Lorg/bouncycastle/crypto/BufferedBlockCipher;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/bouncycastle/crypto/engines/IESEngine;->a:Lorg/bouncycastle/crypto/BasicAgreement;

    iput-object p2, p0, Lorg/bouncycastle/crypto/engines/IESEngine;->b:Lorg/bouncycastle/crypto/DerivationFunction;

    iput-object p3, p0, Lorg/bouncycastle/crypto/engines/IESEngine;->c:Lorg/bouncycastle/crypto/Mac;

    invoke-interface {p3}, Lorg/bouncycastle/crypto/Mac;->getMacSize()I

    move-result v0

    new-array v0, v0, [B

    iput-object v0, p0, Lorg/bouncycastle/crypto/engines/IESEngine;->e:[B

    iput-object p4, p0, Lorg/bouncycastle/crypto/engines/IESEngine;->d:Lorg/bouncycastle/crypto/BufferedBlockCipher;

    return-void
.end method

.method private decryptBlock([BII[B)[B
    .locals 9

    const/4 v5, 0x0

    new-instance v1, Lorg/bouncycastle/crypto/params/KDFParameters;

    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/IESEngine;->i:Lorg/bouncycastle/crypto/params/IESParameters;

    invoke-virtual {v0}, Lorg/bouncycastle/crypto/params/IESParameters;->getDerivationV()[B

    move-result-object v0

    invoke-direct {v1, p4, v0}, Lorg/bouncycastle/crypto/params/KDFParameters;-><init>([B[B)V

    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/IESEngine;->i:Lorg/bouncycastle/crypto/params/IESParameters;

    invoke-virtual {v0}, Lorg/bouncycastle/crypto/params/IESParameters;->getMacKeySize()I

    move-result v6

    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/IESEngine;->b:Lorg/bouncycastle/crypto/DerivationFunction;

    invoke-interface {v0, v1}, Lorg/bouncycastle/crypto/DerivationFunction;->init(Lorg/bouncycastle/crypto/DerivationParameters;)V

    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/IESEngine;->c:Lorg/bouncycastle/crypto/Mac;

    invoke-interface {v0}, Lorg/bouncycastle/crypto/Mac;->getMacSize()I

    move-result v0

    sub-int v3, p3, v0

    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/IESEngine;->d:Lorg/bouncycastle/crypto/BufferedBlockCipher;

    if-nez v0, :cond_1

    div-int/lit8 v0, v6, 0x8

    add-int/2addr v0, v3

    invoke-direct {p0, v1, v0}, Lorg/bouncycastle/crypto/engines/IESEngine;->generateKdfBytes(Lorg/bouncycastle/crypto/params/KDFParameters;I)[B

    move-result-object v2

    new-array v1, v3, [B

    move v0, v5

    :goto_0
    if-eq v0, v3, :cond_0

    add-int v4, p2, v0

    aget-byte v4, p1, v4

    aget-byte v7, v2, v0

    xor-int/2addr v4, v7

    int-to-byte v4, v4

    aput-byte v4, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    new-instance v0, Lorg/bouncycastle/crypto/params/KeyParameter;

    div-int/lit8 v4, v6, 0x8

    invoke-direct {v0, v2, v3, v4}, Lorg/bouncycastle/crypto/params/KeyParameter;-><init>([BII)V

    :goto_1
    iget-object v2, p0, Lorg/bouncycastle/crypto/engines/IESEngine;->i:Lorg/bouncycastle/crypto/params/IESParameters;

    invoke-virtual {v2}, Lorg/bouncycastle/crypto/params/IESParameters;->getEncodingV()[B

    move-result-object v2

    iget-object v4, p0, Lorg/bouncycastle/crypto/engines/IESEngine;->c:Lorg/bouncycastle/crypto/Mac;

    invoke-interface {v4, v0}, Lorg/bouncycastle/crypto/Mac;->init(Lorg/bouncycastle/crypto/CipherParameters;)V

    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/IESEngine;->c:Lorg/bouncycastle/crypto/Mac;

    invoke-interface {v0, p1, p2, v3}, Lorg/bouncycastle/crypto/Mac;->update([BII)V

    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/IESEngine;->c:Lorg/bouncycastle/crypto/Mac;

    array-length v4, v2

    invoke-interface {v0, v2, v5, v4}, Lorg/bouncycastle/crypto/Mac;->update([BII)V

    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/IESEngine;->c:Lorg/bouncycastle/crypto/Mac;

    iget-object v2, p0, Lorg/bouncycastle/crypto/engines/IESEngine;->e:[B

    invoke-interface {v0, v2, v5}, Lorg/bouncycastle/crypto/Mac;->doFinal([BI)I

    add-int v0, p2, v3

    :goto_2
    iget-object v2, p0, Lorg/bouncycastle/crypto/engines/IESEngine;->e:[B

    array-length v2, v2

    if-ge v5, v2, :cond_3

    iget-object v2, p0, Lorg/bouncycastle/crypto/engines/IESEngine;->e:[B

    aget-byte v2, v2, v5

    add-int v3, v0, v5

    aget-byte v3, p1, v3

    if-eq v2, v3, :cond_2

    new-instance v0, Lorg/bouncycastle/crypto/InvalidCipherTextException;

    const-string v1, "Mac codes failed to equal."

    invoke-direct {v0, v1}, Lorg/bouncycastle/crypto/InvalidCipherTextException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/IESEngine;->i:Lorg/bouncycastle/crypto/params/IESParameters;

    check-cast v0, Lorg/bouncycastle/crypto/params/IESWithCipherParameters;

    invoke-virtual {v0}, Lorg/bouncycastle/crypto/params/IESWithCipherParameters;->getCipherKeySize()I

    move-result v7

    div-int/lit8 v0, v7, 0x8

    div-int/lit8 v2, v6, 0x8

    add-int/2addr v0, v2

    invoke-direct {p0, v1, v0}, Lorg/bouncycastle/crypto/engines/IESEngine;->generateKdfBytes(Lorg/bouncycastle/crypto/params/KDFParameters;I)[B

    move-result-object v8

    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/IESEngine;->d:Lorg/bouncycastle/crypto/BufferedBlockCipher;

    new-instance v1, Lorg/bouncycastle/crypto/params/KeyParameter;

    div-int/lit8 v2, v7, 0x8

    invoke-direct {v1, v8, v5, v2}, Lorg/bouncycastle/crypto/params/KeyParameter;-><init>([BII)V

    invoke-virtual {v0, v5, v1}, Lorg/bouncycastle/crypto/BufferedBlockCipher;->init(ZLorg/bouncycastle/crypto/CipherParameters;)V

    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/IESEngine;->d:Lorg/bouncycastle/crypto/BufferedBlockCipher;

    invoke-virtual {v0, v3}, Lorg/bouncycastle/crypto/BufferedBlockCipher;->getOutputSize(I)I

    move-result v0

    new-array v4, v0, [B

    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/IESEngine;->d:Lorg/bouncycastle/crypto/BufferedBlockCipher;

    move-object v1, p1

    move v2, p2

    invoke-virtual/range {v0 .. v5}, Lorg/bouncycastle/crypto/BufferedBlockCipher;->processBytes([BII[BI)I

    move-result v0

    iget-object v1, p0, Lorg/bouncycastle/crypto/engines/IESEngine;->d:Lorg/bouncycastle/crypto/BufferedBlockCipher;

    invoke-virtual {v1, v4, v0}, Lorg/bouncycastle/crypto/BufferedBlockCipher;->doFinal([BI)I

    move-result v1

    add-int/2addr v0, v1

    new-array v1, v0, [B

    invoke-static {v4, v5, v1, v5, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    new-instance v0, Lorg/bouncycastle/crypto/params/KeyParameter;

    div-int/lit8 v2, v7, 0x8

    div-int/lit8 v4, v6, 0x8

    invoke-direct {v0, v8, v2, v4}, Lorg/bouncycastle/crypto/params/KeyParameter;-><init>([BII)V

    goto :goto_1

    :cond_2
    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    :cond_3
    return-object v1
.end method

.method private encryptBlock([BII[B)[B
    .locals 9

    const/4 v5, 0x0

    new-instance v1, Lorg/bouncycastle/crypto/params/KDFParameters;

    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/IESEngine;->i:Lorg/bouncycastle/crypto/params/IESParameters;

    invoke-virtual {v0}, Lorg/bouncycastle/crypto/params/IESParameters;->getDerivationV()[B

    move-result-object v0

    invoke-direct {v1, p4, v0}, Lorg/bouncycastle/crypto/params/KDFParameters;-><init>([B[B)V

    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/IESEngine;->i:Lorg/bouncycastle/crypto/params/IESParameters;

    invoke-virtual {v0}, Lorg/bouncycastle/crypto/params/IESParameters;->getMacKeySize()I

    move-result v6

    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/IESEngine;->d:Lorg/bouncycastle/crypto/BufferedBlockCipher;

    if-nez v0, :cond_1

    div-int/lit8 v0, v6, 0x8

    add-int/2addr v0, p3

    invoke-direct {p0, v1, v0}, Lorg/bouncycastle/crypto/engines/IESEngine;->generateKdfBytes(Lorg/bouncycastle/crypto/params/KDFParameters;I)[B

    move-result-object v2

    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/IESEngine;->c:Lorg/bouncycastle/crypto/Mac;

    invoke-interface {v0}, Lorg/bouncycastle/crypto/Mac;->getMacSize()I

    move-result v0

    add-int/2addr v0, p3

    new-array v0, v0, [B

    move v1, v5

    :goto_0
    if-eq v1, p3, :cond_0

    add-int v3, p2, v1

    aget-byte v3, p1, v3

    aget-byte v4, v2, v1

    xor-int/2addr v3, v4

    int-to-byte v3, v3

    aput-byte v3, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    new-instance v1, Lorg/bouncycastle/crypto/params/KeyParameter;

    div-int/lit8 v3, v6, 0x8

    invoke-direct {v1, v2, p3, v3}, Lorg/bouncycastle/crypto/params/KeyParameter;-><init>([BII)V

    :goto_1
    iget-object v2, p0, Lorg/bouncycastle/crypto/engines/IESEngine;->i:Lorg/bouncycastle/crypto/params/IESParameters;

    invoke-virtual {v2}, Lorg/bouncycastle/crypto/params/IESParameters;->getEncodingV()[B

    move-result-object v2

    iget-object v3, p0, Lorg/bouncycastle/crypto/engines/IESEngine;->c:Lorg/bouncycastle/crypto/Mac;

    invoke-interface {v3, v1}, Lorg/bouncycastle/crypto/Mac;->init(Lorg/bouncycastle/crypto/CipherParameters;)V

    iget-object v1, p0, Lorg/bouncycastle/crypto/engines/IESEngine;->c:Lorg/bouncycastle/crypto/Mac;

    invoke-interface {v1, v0, v5, p3}, Lorg/bouncycastle/crypto/Mac;->update([BII)V

    iget-object v1, p0, Lorg/bouncycastle/crypto/engines/IESEngine;->c:Lorg/bouncycastle/crypto/Mac;

    array-length v3, v2

    invoke-interface {v1, v2, v5, v3}, Lorg/bouncycastle/crypto/Mac;->update([BII)V

    iget-object v1, p0, Lorg/bouncycastle/crypto/engines/IESEngine;->c:Lorg/bouncycastle/crypto/Mac;

    invoke-interface {v1, v0, p3}, Lorg/bouncycastle/crypto/Mac;->doFinal([BI)I

    return-object v0

    :cond_1
    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/IESEngine;->i:Lorg/bouncycastle/crypto/params/IESParameters;

    check-cast v0, Lorg/bouncycastle/crypto/params/IESWithCipherParameters;

    invoke-virtual {v0}, Lorg/bouncycastle/crypto/params/IESWithCipherParameters;->getCipherKeySize()I

    move-result v7

    div-int/lit8 v0, v7, 0x8

    div-int/lit8 v2, v6, 0x8

    add-int/2addr v0, v2

    invoke-direct {p0, v1, v0}, Lorg/bouncycastle/crypto/engines/IESEngine;->generateKdfBytes(Lorg/bouncycastle/crypto/params/KDFParameters;I)[B

    move-result-object v8

    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/IESEngine;->d:Lorg/bouncycastle/crypto/BufferedBlockCipher;

    const/4 v1, 0x1

    new-instance v2, Lorg/bouncycastle/crypto/params/KeyParameter;

    div-int/lit8 v3, v7, 0x8

    invoke-direct {v2, v8, v5, v3}, Lorg/bouncycastle/crypto/params/KeyParameter;-><init>([BII)V

    invoke-virtual {v0, v1, v2}, Lorg/bouncycastle/crypto/BufferedBlockCipher;->init(ZLorg/bouncycastle/crypto/CipherParameters;)V

    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/IESEngine;->d:Lorg/bouncycastle/crypto/BufferedBlockCipher;

    invoke-virtual {v0, p3}, Lorg/bouncycastle/crypto/BufferedBlockCipher;->getOutputSize(I)I

    move-result v0

    new-array v4, v0, [B

    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/IESEngine;->d:Lorg/bouncycastle/crypto/BufferedBlockCipher;

    move-object v1, p1

    move v2, p2

    move v3, p3

    invoke-virtual/range {v0 .. v5}, Lorg/bouncycastle/crypto/BufferedBlockCipher;->processBytes([BII[BI)I

    move-result v0

    iget-object v1, p0, Lorg/bouncycastle/crypto/engines/IESEngine;->d:Lorg/bouncycastle/crypto/BufferedBlockCipher;

    invoke-virtual {v1, v4, v0}, Lorg/bouncycastle/crypto/BufferedBlockCipher;->doFinal([BI)I

    move-result v1

    add-int p3, v0, v1

    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/IESEngine;->c:Lorg/bouncycastle/crypto/Mac;

    invoke-interface {v0}, Lorg/bouncycastle/crypto/Mac;->getMacSize()I

    move-result v0

    add-int/2addr v0, p3

    new-array v0, v0, [B

    invoke-static {v4, v5, v0, v5, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    new-instance v1, Lorg/bouncycastle/crypto/params/KeyParameter;

    div-int/lit8 v2, v7, 0x8

    div-int/lit8 v3, v6, 0x8

    invoke-direct {v1, v8, v2, v3}, Lorg/bouncycastle/crypto/params/KeyParameter;-><init>([BII)V

    goto :goto_1
.end method

.method private generateKdfBytes(Lorg/bouncycastle/crypto/params/KDFParameters;I)[B
    .locals 3

    new-array v0, p2, [B

    iget-object v1, p0, Lorg/bouncycastle/crypto/engines/IESEngine;->b:Lorg/bouncycastle/crypto/DerivationFunction;

    invoke-interface {v1, p1}, Lorg/bouncycastle/crypto/DerivationFunction;->init(Lorg/bouncycastle/crypto/DerivationParameters;)V

    iget-object v1, p0, Lorg/bouncycastle/crypto/engines/IESEngine;->b:Lorg/bouncycastle/crypto/DerivationFunction;

    const/4 v2, 0x0

    invoke-interface {v1, v0, v2, p2}, Lorg/bouncycastle/crypto/DerivationFunction;->generateBytes([BII)I

    return-object v0
.end method


# virtual methods
.method public init(ZLorg/bouncycastle/crypto/CipherParameters;Lorg/bouncycastle/crypto/CipherParameters;Lorg/bouncycastle/crypto/CipherParameters;)V
    .locals 0

    iput-boolean p1, p0, Lorg/bouncycastle/crypto/engines/IESEngine;->f:Z

    iput-object p2, p0, Lorg/bouncycastle/crypto/engines/IESEngine;->g:Lorg/bouncycastle/crypto/CipherParameters;

    iput-object p3, p0, Lorg/bouncycastle/crypto/engines/IESEngine;->h:Lorg/bouncycastle/crypto/CipherParameters;

    check-cast p4, Lorg/bouncycastle/crypto/params/IESParameters;

    iput-object p4, p0, Lorg/bouncycastle/crypto/engines/IESEngine;->i:Lorg/bouncycastle/crypto/params/IESParameters;

    return-void
.end method

.method public processBlock([BII)[B
    .locals 2

    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/IESEngine;->a:Lorg/bouncycastle/crypto/BasicAgreement;

    iget-object v1, p0, Lorg/bouncycastle/crypto/engines/IESEngine;->g:Lorg/bouncycastle/crypto/CipherParameters;

    invoke-interface {v0, v1}, Lorg/bouncycastle/crypto/BasicAgreement;->init(Lorg/bouncycastle/crypto/CipherParameters;)V

    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/IESEngine;->a:Lorg/bouncycastle/crypto/BasicAgreement;

    iget-object v1, p0, Lorg/bouncycastle/crypto/engines/IESEngine;->h:Lorg/bouncycastle/crypto/CipherParameters;

    invoke-interface {v0, v1}, Lorg/bouncycastle/crypto/BasicAgreement;->calculateAgreement(Lorg/bouncycastle/crypto/CipherParameters;)Ljava/math/BigInteger;

    move-result-object v0

    iget-boolean v1, p0, Lorg/bouncycastle/crypto/engines/IESEngine;->f:Z

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Ljava/math/BigInteger;->toByteArray()[B

    move-result-object v0

    invoke-direct {p0, p1, p2, p3, v0}, Lorg/bouncycastle/crypto/engines/IESEngine;->encryptBlock([BII[B)[B

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    invoke-virtual {v0}, Ljava/math/BigInteger;->toByteArray()[B

    move-result-object v0

    invoke-direct {p0, p1, p2, p3, v0}, Lorg/bouncycastle/crypto/engines/IESEngine;->decryptBlock([BII[B)[B

    move-result-object v0

    goto :goto_0
.end method
