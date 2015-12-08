.class public Lorg/spongycastle/crypto/engines/IESEngine;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field a:Lorg/spongycastle/crypto/BasicAgreement;

.field b:Lorg/spongycastle/crypto/DerivationFunction;

.field c:Lorg/spongycastle/crypto/Mac;

.field d:Lorg/spongycastle/crypto/BufferedBlockCipher;

.field e:[B

.field f:Z

.field g:Lorg/spongycastle/crypto/CipherParameters;

.field h:Lorg/spongycastle/crypto/CipherParameters;

.field i:Lorg/spongycastle/crypto/params/IESParameters;


# direct methods
.method public constructor <init>(Lorg/spongycastle/crypto/BasicAgreement;Lorg/spongycastle/crypto/DerivationFunction;Lorg/spongycastle/crypto/Mac;)V
    .locals 1

    .prologue
    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 46
    iput-object p1, p0, Lorg/spongycastle/crypto/engines/IESEngine;->a:Lorg/spongycastle/crypto/BasicAgreement;

    .line 47
    iput-object p2, p0, Lorg/spongycastle/crypto/engines/IESEngine;->b:Lorg/spongycastle/crypto/DerivationFunction;

    .line 48
    iput-object p3, p0, Lorg/spongycastle/crypto/engines/IESEngine;->c:Lorg/spongycastle/crypto/Mac;

    .line 49
    invoke-interface {p3}, Lorg/spongycastle/crypto/Mac;->a()I

    move-result v0

    new-array v0, v0, [B

    iput-object v0, p0, Lorg/spongycastle/crypto/engines/IESEngine;->e:[B

    .line 50
    const/4 v0, 0x0

    iput-object v0, p0, Lorg/spongycastle/crypto/engines/IESEngine;->d:Lorg/spongycastle/crypto/BufferedBlockCipher;

    .line 51
    return-void
.end method

.method private a(Lorg/spongycastle/crypto/params/KDFParameters;I)[B
    .locals 4

    .prologue
    .line 230
    new-array v0, p2, [B

    .line 232
    iget-object v1, p0, Lorg/spongycastle/crypto/engines/IESEngine;->b:Lorg/spongycastle/crypto/DerivationFunction;

    invoke-interface {v1, p1}, Lorg/spongycastle/crypto/DerivationFunction;->a(Lorg/spongycastle/crypto/DerivationParameters;)V

    .line 234
    iget-object v1, p0, Lorg/spongycastle/crypto/engines/IESEngine;->b:Lorg/spongycastle/crypto/DerivationFunction;

    const/4 v2, 0x0

    array-length v3, v0

    invoke-interface {v1, v0, v2, v3}, Lorg/spongycastle/crypto/DerivationFunction;->a([BII)I

    .line 236
    return-object v0
.end method


# virtual methods
.method public final a(ZLorg/spongycastle/crypto/CipherParameters;Lorg/spongycastle/crypto/CipherParameters;Lorg/spongycastle/crypto/CipherParameters;)V
    .locals 0

    .prologue
    .line 89
    iput-boolean p1, p0, Lorg/spongycastle/crypto/engines/IESEngine;->f:Z

    .line 90
    iput-object p2, p0, Lorg/spongycastle/crypto/engines/IESEngine;->g:Lorg/spongycastle/crypto/CipherParameters;

    .line 91
    iput-object p3, p0, Lorg/spongycastle/crypto/engines/IESEngine;->h:Lorg/spongycastle/crypto/CipherParameters;

    .line 92
    check-cast p4, Lorg/spongycastle/crypto/params/IESParameters;

    iput-object p4, p0, Lorg/spongycastle/crypto/engines/IESEngine;->i:Lorg/spongycastle/crypto/params/IESParameters;

    .line 93
    return-void
.end method

.method public final a([BI)[B
    .locals 9

    .prologue
    const/4 v2, 0x0

    .line 245
    iget-object v0, p0, Lorg/spongycastle/crypto/engines/IESEngine;->a:Lorg/spongycastle/crypto/BasicAgreement;

    iget-object v1, p0, Lorg/spongycastle/crypto/engines/IESEngine;->g:Lorg/spongycastle/crypto/CipherParameters;

    invoke-interface {v0, v1}, Lorg/spongycastle/crypto/BasicAgreement;->a(Lorg/spongycastle/crypto/CipherParameters;)V

    .line 247
    iget-object v0, p0, Lorg/spongycastle/crypto/engines/IESEngine;->a:Lorg/spongycastle/crypto/BasicAgreement;

    iget-object v1, p0, Lorg/spongycastle/crypto/engines/IESEngine;->h:Lorg/spongycastle/crypto/CipherParameters;

    invoke-interface {v0, v1}, Lorg/spongycastle/crypto/BasicAgreement;->b(Lorg/spongycastle/crypto/CipherParameters;)Ljava/math/BigInteger;

    move-result-object v0

    .line 250
    invoke-static {v0}, Lorg/spongycastle/util/BigIntegers;->a(Ljava/math/BigInteger;)[B

    move-result-object v0

    .line 252
    iget-boolean v1, p0, Lorg/spongycastle/crypto/engines/IESEngine;->f:Z

    if-eqz v1, :cond_3

    new-instance v1, Lorg/spongycastle/crypto/params/KDFParameters;

    iget-object v3, p0, Lorg/spongycastle/crypto/engines/IESEngine;->i:Lorg/spongycastle/crypto/params/IESParameters;

    invoke-virtual {v3}, Lorg/spongycastle/crypto/params/IESParameters;->a()[B

    move-result-object v3

    invoke-direct {v1, v0, v3}, Lorg/spongycastle/crypto/params/KDFParameters;-><init>([B[B)V

    iget-object v0, p0, Lorg/spongycastle/crypto/engines/IESEngine;->i:Lorg/spongycastle/crypto/params/IESParameters;

    invoke-virtual {v0}, Lorg/spongycastle/crypto/params/IESParameters;->c()I

    move-result v6

    iget-object v0, p0, Lorg/spongycastle/crypto/engines/IESEngine;->d:Lorg/spongycastle/crypto/BufferedBlockCipher;

    if-nez v0, :cond_2

    div-int/lit8 v0, v6, 0x8

    add-int/2addr v0, p2

    invoke-direct {p0, v1, v0}, Lorg/spongycastle/crypto/engines/IESEngine;->a(Lorg/spongycastle/crypto/params/KDFParameters;I)[B

    move-result-object v3

    iget-object v0, p0, Lorg/spongycastle/crypto/engines/IESEngine;->c:Lorg/spongycastle/crypto/Mac;

    invoke-interface {v0}, Lorg/spongycastle/crypto/Mac;->a()I

    move-result v0

    add-int/2addr v0, p2

    new-array v1, v0, [B

    move v0, v2

    :goto_0
    if-eq v0, p2, :cond_0

    add-int/lit8 v4, v0, 0x0

    aget-byte v4, p1, v4

    aget-byte v5, v3, v0

    xor-int/2addr v4, v5

    int-to-byte v4, v4

    aput-byte v4, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    new-instance v0, Lorg/spongycastle/crypto/params/KeyParameter;

    div-int/lit8 v4, v6, 0x8

    invoke-direct {v0, v3, p2, v4}, Lorg/spongycastle/crypto/params/KeyParameter;-><init>([BII)V

    :goto_1
    iget-object v3, p0, Lorg/spongycastle/crypto/engines/IESEngine;->i:Lorg/spongycastle/crypto/params/IESParameters;

    invoke-virtual {v3}, Lorg/spongycastle/crypto/params/IESParameters;->b()[B

    move-result-object v3

    iget-object v4, p0, Lorg/spongycastle/crypto/engines/IESEngine;->c:Lorg/spongycastle/crypto/Mac;

    invoke-interface {v4, v0}, Lorg/spongycastle/crypto/Mac;->a(Lorg/spongycastle/crypto/CipherParameters;)V

    iget-object v0, p0, Lorg/spongycastle/crypto/engines/IESEngine;->c:Lorg/spongycastle/crypto/Mac;

    invoke-interface {v0, v1, v2, p2}, Lorg/spongycastle/crypto/Mac;->a([BII)V

    iget-object v0, p0, Lorg/spongycastle/crypto/engines/IESEngine;->c:Lorg/spongycastle/crypto/Mac;

    array-length v4, v3

    invoke-interface {v0, v3, v2, v4}, Lorg/spongycastle/crypto/Mac;->a([BII)V

    iget-object v0, p0, Lorg/spongycastle/crypto/engines/IESEngine;->c:Lorg/spongycastle/crypto/Mac;

    invoke-interface {v0, v1, p2}, Lorg/spongycastle/crypto/Mac;->a([BI)I

    :cond_1
    return-object v1

    :cond_2
    iget-object v0, p0, Lorg/spongycastle/crypto/engines/IESEngine;->i:Lorg/spongycastle/crypto/params/IESParameters;

    check-cast v0, Lorg/spongycastle/crypto/params/IESWithCipherParameters;

    invoke-virtual {v0}, Lorg/spongycastle/crypto/params/IESWithCipherParameters;->d()I

    move-result v7

    div-int/lit8 v0, v7, 0x8

    div-int/lit8 v3, v6, 0x8

    add-int/2addr v0, v3

    invoke-direct {p0, v1, v0}, Lorg/spongycastle/crypto/engines/IESEngine;->a(Lorg/spongycastle/crypto/params/KDFParameters;I)[B

    move-result-object v8

    iget-object v0, p0, Lorg/spongycastle/crypto/engines/IESEngine;->d:Lorg/spongycastle/crypto/BufferedBlockCipher;

    const/4 v1, 0x1

    new-instance v3, Lorg/spongycastle/crypto/params/KeyParameter;

    div-int/lit8 v4, v7, 0x8

    invoke-direct {v3, v8, v2, v4}, Lorg/spongycastle/crypto/params/KeyParameter;-><init>([BII)V

    invoke-virtual {v0, v1, v3}, Lorg/spongycastle/crypto/BufferedBlockCipher;->a(ZLorg/spongycastle/crypto/CipherParameters;)V

    iget-object v0, p0, Lorg/spongycastle/crypto/engines/IESEngine;->d:Lorg/spongycastle/crypto/BufferedBlockCipher;

    invoke-virtual {v0, p2}, Lorg/spongycastle/crypto/BufferedBlockCipher;->b(I)I

    move-result v0

    new-array v4, v0, [B

    iget-object v0, p0, Lorg/spongycastle/crypto/engines/IESEngine;->d:Lorg/spongycastle/crypto/BufferedBlockCipher;

    move-object v1, p1

    move v3, p2

    move v5, v2

    invoke-virtual/range {v0 .. v5}, Lorg/spongycastle/crypto/BufferedBlockCipher;->a([BII[BI)I

    move-result v0

    iget-object v1, p0, Lorg/spongycastle/crypto/engines/IESEngine;->d:Lorg/spongycastle/crypto/BufferedBlockCipher;

    invoke-virtual {v1, v4, v0}, Lorg/spongycastle/crypto/BufferedBlockCipher;->a([BI)I

    move-result v1

    add-int p2, v0, v1

    iget-object v0, p0, Lorg/spongycastle/crypto/engines/IESEngine;->c:Lorg/spongycastle/crypto/Mac;

    invoke-interface {v0}, Lorg/spongycastle/crypto/Mac;->a()I

    move-result v0

    add-int/2addr v0, p2

    new-array v1, v0, [B

    invoke-static {v4, v2, v1, v2, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    new-instance v0, Lorg/spongycastle/crypto/params/KeyParameter;

    div-int/lit8 v3, v7, 0x8

    div-int/lit8 v4, v6, 0x8

    invoke-direct {v0, v8, v3, v4}, Lorg/spongycastle/crypto/params/KeyParameter;-><init>([BII)V

    goto :goto_1

    :cond_3
    new-instance v1, Lorg/spongycastle/crypto/params/KDFParameters;

    iget-object v3, p0, Lorg/spongycastle/crypto/engines/IESEngine;->i:Lorg/spongycastle/crypto/params/IESParameters;

    invoke-virtual {v3}, Lorg/spongycastle/crypto/params/IESParameters;->a()[B

    move-result-object v3

    invoke-direct {v1, v0, v3}, Lorg/spongycastle/crypto/params/KDFParameters;-><init>([B[B)V

    iget-object v0, p0, Lorg/spongycastle/crypto/engines/IESEngine;->i:Lorg/spongycastle/crypto/params/IESParameters;

    invoke-virtual {v0}, Lorg/spongycastle/crypto/params/IESParameters;->c()I

    move-result v6

    iget-object v0, p0, Lorg/spongycastle/crypto/engines/IESEngine;->b:Lorg/spongycastle/crypto/DerivationFunction;

    invoke-interface {v0, v1}, Lorg/spongycastle/crypto/DerivationFunction;->a(Lorg/spongycastle/crypto/DerivationParameters;)V

    iget-object v0, p0, Lorg/spongycastle/crypto/engines/IESEngine;->c:Lorg/spongycastle/crypto/Mac;

    invoke-interface {v0}, Lorg/spongycastle/crypto/Mac;->a()I

    move-result v0

    sub-int v3, p2, v0

    iget-object v0, p0, Lorg/spongycastle/crypto/engines/IESEngine;->d:Lorg/spongycastle/crypto/BufferedBlockCipher;

    if-nez v0, :cond_5

    div-int/lit8 v0, v6, 0x8

    add-int/2addr v0, v3

    invoke-direct {p0, v1, v0}, Lorg/spongycastle/crypto/engines/IESEngine;->a(Lorg/spongycastle/crypto/params/KDFParameters;I)[B

    move-result-object v4

    new-array v1, v3, [B

    move v0, v2

    :goto_2
    if-eq v0, v3, :cond_4

    add-int/lit8 v5, v0, 0x0

    aget-byte v5, p1, v5

    aget-byte v7, v4, v0

    xor-int/2addr v5, v7

    int-to-byte v5, v5

    aput-byte v5, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_4
    new-instance v0, Lorg/spongycastle/crypto/params/KeyParameter;

    div-int/lit8 v5, v6, 0x8

    invoke-direct {v0, v4, v3, v5}, Lorg/spongycastle/crypto/params/KeyParameter;-><init>([BII)V

    :goto_3
    iget-object v4, p0, Lorg/spongycastle/crypto/engines/IESEngine;->i:Lorg/spongycastle/crypto/params/IESParameters;

    invoke-virtual {v4}, Lorg/spongycastle/crypto/params/IESParameters;->b()[B

    move-result-object v4

    iget-object v5, p0, Lorg/spongycastle/crypto/engines/IESEngine;->c:Lorg/spongycastle/crypto/Mac;

    invoke-interface {v5, v0}, Lorg/spongycastle/crypto/Mac;->a(Lorg/spongycastle/crypto/CipherParameters;)V

    iget-object v0, p0, Lorg/spongycastle/crypto/engines/IESEngine;->c:Lorg/spongycastle/crypto/Mac;

    invoke-interface {v0, p1, v2, v3}, Lorg/spongycastle/crypto/Mac;->a([BII)V

    iget-object v0, p0, Lorg/spongycastle/crypto/engines/IESEngine;->c:Lorg/spongycastle/crypto/Mac;

    array-length v5, v4

    invoke-interface {v0, v4, v2, v5}, Lorg/spongycastle/crypto/Mac;->a([BII)V

    iget-object v0, p0, Lorg/spongycastle/crypto/engines/IESEngine;->c:Lorg/spongycastle/crypto/Mac;

    iget-object v4, p0, Lorg/spongycastle/crypto/engines/IESEngine;->e:[B

    invoke-interface {v0, v4, v2}, Lorg/spongycastle/crypto/Mac;->a([BI)I

    add-int/lit8 v0, v3, 0x0

    :goto_4
    iget-object v3, p0, Lorg/spongycastle/crypto/engines/IESEngine;->e:[B

    array-length v3, v3

    if-ge v2, v3, :cond_1

    iget-object v3, p0, Lorg/spongycastle/crypto/engines/IESEngine;->e:[B

    aget-byte v3, v3, v2

    add-int v4, v0, v2

    aget-byte v4, p1, v4

    if-eq v3, v4, :cond_6

    new-instance v0, Lorg/spongycastle/crypto/InvalidCipherTextException;

    const-string v1, "Mac codes failed to equal."

    invoke-direct {v0, v1}, Lorg/spongycastle/crypto/InvalidCipherTextException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    iget-object v0, p0, Lorg/spongycastle/crypto/engines/IESEngine;->i:Lorg/spongycastle/crypto/params/IESParameters;

    check-cast v0, Lorg/spongycastle/crypto/params/IESWithCipherParameters;

    invoke-virtual {v0}, Lorg/spongycastle/crypto/params/IESWithCipherParameters;->d()I

    move-result v7

    div-int/lit8 v0, v7, 0x8

    div-int/lit8 v4, v6, 0x8

    add-int/2addr v0, v4

    invoke-direct {p0, v1, v0}, Lorg/spongycastle/crypto/engines/IESEngine;->a(Lorg/spongycastle/crypto/params/KDFParameters;I)[B

    move-result-object v8

    iget-object v0, p0, Lorg/spongycastle/crypto/engines/IESEngine;->d:Lorg/spongycastle/crypto/BufferedBlockCipher;

    new-instance v1, Lorg/spongycastle/crypto/params/KeyParameter;

    div-int/lit8 v4, v7, 0x8

    invoke-direct {v1, v8, v2, v4}, Lorg/spongycastle/crypto/params/KeyParameter;-><init>([BII)V

    invoke-virtual {v0, v2, v1}, Lorg/spongycastle/crypto/BufferedBlockCipher;->a(ZLorg/spongycastle/crypto/CipherParameters;)V

    iget-object v0, p0, Lorg/spongycastle/crypto/engines/IESEngine;->d:Lorg/spongycastle/crypto/BufferedBlockCipher;

    invoke-virtual {v0, v3}, Lorg/spongycastle/crypto/BufferedBlockCipher;->b(I)I

    move-result v0

    new-array v4, v0, [B

    iget-object v0, p0, Lorg/spongycastle/crypto/engines/IESEngine;->d:Lorg/spongycastle/crypto/BufferedBlockCipher;

    move-object v1, p1

    move v5, v2

    invoke-virtual/range {v0 .. v5}, Lorg/spongycastle/crypto/BufferedBlockCipher;->a([BII[BI)I

    move-result v0

    iget-object v1, p0, Lorg/spongycastle/crypto/engines/IESEngine;->d:Lorg/spongycastle/crypto/BufferedBlockCipher;

    invoke-virtual {v1, v4, v0}, Lorg/spongycastle/crypto/BufferedBlockCipher;->a([BI)I

    move-result v1

    add-int/2addr v0, v1

    new-array v1, v0, [B

    invoke-static {v4, v2, v1, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    new-instance v0, Lorg/spongycastle/crypto/params/KeyParameter;

    div-int/lit8 v4, v7, 0x8

    div-int/lit8 v5, v6, 0x8

    invoke-direct {v0, v8, v4, v5}, Lorg/spongycastle/crypto/params/KeyParameter;-><init>([BII)V

    goto :goto_3

    :cond_6
    add-int/lit8 v2, v2, 0x1

    goto :goto_4
.end method
