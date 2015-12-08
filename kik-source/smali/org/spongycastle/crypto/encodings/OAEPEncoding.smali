.class public Lorg/spongycastle/crypto/encodings/OAEPEncoding;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/spongycastle/crypto/AsymmetricBlockCipher;


# instance fields
.field private a:[B

.field private b:Lorg/spongycastle/crypto/Digest;

.field private c:Lorg/spongycastle/crypto/Digest;

.field private d:Lorg/spongycastle/crypto/AsymmetricBlockCipher;

.field private e:Ljava/security/SecureRandom;

.field private f:Z


# direct methods
.method public constructor <init>(Lorg/spongycastle/crypto/AsymmetricBlockCipher;Lorg/spongycastle/crypto/Digest;Lorg/spongycastle/crypto/Digest;[B)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 53
    iput-object p1, p0, Lorg/spongycastle/crypto/encodings/OAEPEncoding;->d:Lorg/spongycastle/crypto/AsymmetricBlockCipher;

    .line 54
    iput-object p2, p0, Lorg/spongycastle/crypto/encodings/OAEPEncoding;->b:Lorg/spongycastle/crypto/Digest;

    .line 55
    iput-object p3, p0, Lorg/spongycastle/crypto/encodings/OAEPEncoding;->c:Lorg/spongycastle/crypto/Digest;

    .line 56
    invoke-interface {p2}, Lorg/spongycastle/crypto/Digest;->b()I

    move-result v0

    new-array v0, v0, [B

    iput-object v0, p0, Lorg/spongycastle/crypto/encodings/OAEPEncoding;->a:[B

    .line 58
    if-eqz p4, :cond_0

    .line 60
    array-length v0, p4

    invoke-interface {p2, p4, v1, v0}, Lorg/spongycastle/crypto/Digest;->a([BII)V

    .line 63
    :cond_0
    iget-object v0, p0, Lorg/spongycastle/crypto/encodings/OAEPEncoding;->a:[B

    invoke-interface {p2, v0, v1}, Lorg/spongycastle/crypto/Digest;->a([BI)I

    .line 64
    return-void
.end method

.method public constructor <init>(Lorg/spongycastle/crypto/AsymmetricBlockCipher;Lorg/spongycastle/crypto/Digest;[B)V
    .locals 0

    .prologue
    .line 44
    invoke-direct {p0, p1, p2, p2, p3}, Lorg/spongycastle/crypto/encodings/OAEPEncoding;-><init>(Lorg/spongycastle/crypto/AsymmetricBlockCipher;Lorg/spongycastle/crypto/Digest;Lorg/spongycastle/crypto/Digest;[B)V

    .line 45
    return-void
.end method

.method private static a(I[B)V
    .locals 2

    .prologue
    .line 301
    const/4 v0, 0x0

    ushr-int/lit8 v1, p0, 0x18

    int-to-byte v1, v1

    aput-byte v1, p1, v0

    .line 302
    const/4 v0, 0x1

    ushr-int/lit8 v1, p0, 0x10

    int-to-byte v1, v1

    aput-byte v1, p1, v0

    .line 303
    const/4 v0, 0x2

    ushr-int/lit8 v1, p0, 0x8

    int-to-byte v1, v1

    aput-byte v1, p1, v0

    .line 304
    const/4 v0, 0x3

    ushr-int/lit8 v1, p0, 0x0

    int-to-byte v1, v1

    aput-byte v1, p1, v0

    .line 305
    return-void
.end method

.method private a([BIII)[B
    .locals 8

    .prologue
    const/4 v7, 0x4

    const/4 v1, 0x0

    .line 316
    new-array v2, p4, [B

    .line 317
    iget-object v0, p0, Lorg/spongycastle/crypto/encodings/OAEPEncoding;->c:Lorg/spongycastle/crypto/Digest;

    invoke-interface {v0}, Lorg/spongycastle/crypto/Digest;->b()I

    move-result v0

    new-array v3, v0, [B

    .line 318
    new-array v4, v7, [B

    .line 321
    iget-object v0, p0, Lorg/spongycastle/crypto/encodings/OAEPEncoding;->b:Lorg/spongycastle/crypto/Digest;

    invoke-interface {v0}, Lorg/spongycastle/crypto/Digest;->c()V

    move v0, v1

    .line 325
    :cond_0
    invoke-static {v0, v4}, Lorg/spongycastle/crypto/encodings/OAEPEncoding;->a(I[B)V

    .line 327
    iget-object v5, p0, Lorg/spongycastle/crypto/encodings/OAEPEncoding;->c:Lorg/spongycastle/crypto/Digest;

    invoke-interface {v5, p1, p2, p3}, Lorg/spongycastle/crypto/Digest;->a([BII)V

    .line 328
    iget-object v5, p0, Lorg/spongycastle/crypto/encodings/OAEPEncoding;->c:Lorg/spongycastle/crypto/Digest;

    invoke-interface {v5, v4, v1, v7}, Lorg/spongycastle/crypto/Digest;->a([BII)V

    .line 329
    iget-object v5, p0, Lorg/spongycastle/crypto/encodings/OAEPEncoding;->c:Lorg/spongycastle/crypto/Digest;

    invoke-interface {v5, v3, v1}, Lorg/spongycastle/crypto/Digest;->a([BI)I

    .line 331
    array-length v5, v3

    mul-int/2addr v5, v0

    array-length v6, v3

    invoke-static {v3, v1, v2, v5, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 333
    add-int/lit8 v0, v0, 0x1

    array-length v5, v3

    div-int v5, p4, v5

    if-lt v0, v5, :cond_0

    .line 335
    array-length v5, v3

    mul-int/2addr v5, v0

    if-ge v5, p4, :cond_1

    .line 337
    invoke-static {v0, v4}, Lorg/spongycastle/crypto/encodings/OAEPEncoding;->a(I[B)V

    .line 339
    iget-object v5, p0, Lorg/spongycastle/crypto/encodings/OAEPEncoding;->c:Lorg/spongycastle/crypto/Digest;

    invoke-interface {v5, p1, p2, p3}, Lorg/spongycastle/crypto/Digest;->a([BII)V

    .line 340
    iget-object v5, p0, Lorg/spongycastle/crypto/encodings/OAEPEncoding;->c:Lorg/spongycastle/crypto/Digest;

    invoke-interface {v5, v4, v1, v7}, Lorg/spongycastle/crypto/Digest;->a([BII)V

    .line 341
    iget-object v4, p0, Lorg/spongycastle/crypto/encodings/OAEPEncoding;->c:Lorg/spongycastle/crypto/Digest;

    invoke-interface {v4, v3, v1}, Lorg/spongycastle/crypto/Digest;->a([BI)I

    .line 343
    array-length v4, v3

    mul-int/2addr v4, v0

    array-length v5, v2

    array-length v6, v3

    mul-int/2addr v0, v6

    sub-int v0, v5, v0

    invoke-static {v3, v1, v2, v4, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 346
    :cond_1
    return-object v2
.end method


# virtual methods
.method public final a()I
    .locals 2

    .prologue
    .line 93
    iget-object v0, p0, Lorg/spongycastle/crypto/encodings/OAEPEncoding;->d:Lorg/spongycastle/crypto/AsymmetricBlockCipher;

    invoke-interface {v0}, Lorg/spongycastle/crypto/AsymmetricBlockCipher;->a()I

    move-result v0

    .line 95
    iget-boolean v1, p0, Lorg/spongycastle/crypto/encodings/OAEPEncoding;->f:Z

    if-eqz v1, :cond_0

    .line 97
    add-int/lit8 v0, v0, -0x1

    iget-object v1, p0, Lorg/spongycastle/crypto/encodings/OAEPEncoding;->a:[B

    array-length v1, v1

    mul-int/lit8 v1, v1, 0x2

    sub-int/2addr v0, v1

    .line 101
    :cond_0
    return v0
.end method

.method public final a(ZLorg/spongycastle/crypto/CipherParameters;)V
    .locals 1

    .prologue
    .line 75
    instance-of v0, p2, Lorg/spongycastle/crypto/params/ParametersWithRandom;

    if-eqz v0, :cond_0

    move-object v0, p2

    .line 77
    check-cast v0, Lorg/spongycastle/crypto/params/ParametersWithRandom;

    .line 79
    invoke-virtual {v0}, Lorg/spongycastle/crypto/params/ParametersWithRandom;->a()Ljava/security/SecureRandom;

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/crypto/encodings/OAEPEncoding;->e:Ljava/security/SecureRandom;

    .line 86
    :goto_0
    iget-object v0, p0, Lorg/spongycastle/crypto/encodings/OAEPEncoding;->d:Lorg/spongycastle/crypto/AsymmetricBlockCipher;

    invoke-interface {v0, p1, p2}, Lorg/spongycastle/crypto/AsymmetricBlockCipher;->a(ZLorg/spongycastle/crypto/CipherParameters;)V

    .line 88
    iput-boolean p1, p0, Lorg/spongycastle/crypto/encodings/OAEPEncoding;->f:Z

    .line 89
    return-void

    .line 83
    :cond_0
    new-instance v0, Ljava/security/SecureRandom;

    invoke-direct {v0}, Ljava/security/SecureRandom;-><init>()V

    iput-object v0, p0, Lorg/spongycastle/crypto/encodings/OAEPEncoding;->e:Ljava/security/SecureRandom;

    goto :goto_0
.end method

.method public final a([BII)[B
    .locals 7

    .prologue
    const/4 v6, 0x1

    const/4 v1, 0x0

    .line 125
    iget-boolean v0, p0, Lorg/spongycastle/crypto/encodings/OAEPEncoding;->f:Z

    if-eqz v0, :cond_2

    .line 127
    invoke-virtual {p0}, Lorg/spongycastle/crypto/encodings/OAEPEncoding;->a()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    iget-object v2, p0, Lorg/spongycastle/crypto/encodings/OAEPEncoding;->a:[B

    array-length v2, v2

    mul-int/lit8 v2, v2, 0x2

    add-int/2addr v0, v2

    new-array v2, v0, [B

    array-length v0, v2

    sub-int/2addr v0, p3

    invoke-static {p1, p2, v2, v0, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    array-length v0, v2

    sub-int/2addr v0, p3

    add-int/lit8 v0, v0, -0x1

    aput-byte v6, v2, v0

    iget-object v0, p0, Lorg/spongycastle/crypto/encodings/OAEPEncoding;->a:[B

    iget-object v3, p0, Lorg/spongycastle/crypto/encodings/OAEPEncoding;->a:[B

    array-length v3, v3

    iget-object v4, p0, Lorg/spongycastle/crypto/encodings/OAEPEncoding;->a:[B

    array-length v4, v4

    invoke-static {v0, v1, v2, v3, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v0, p0, Lorg/spongycastle/crypto/encodings/OAEPEncoding;->a:[B

    array-length v0, v0

    new-array v3, v0, [B

    iget-object v0, p0, Lorg/spongycastle/crypto/encodings/OAEPEncoding;->e:Ljava/security/SecureRandom;

    invoke-virtual {v0, v3}, Ljava/security/SecureRandom;->nextBytes([B)V

    array-length v0, v3

    array-length v4, v2

    iget-object v5, p0, Lorg/spongycastle/crypto/encodings/OAEPEncoding;->a:[B

    array-length v5, v5

    sub-int/2addr v4, v5

    invoke-direct {p0, v3, v1, v0, v4}, Lorg/spongycastle/crypto/encodings/OAEPEncoding;->a([BIII)[B

    move-result-object v4

    iget-object v0, p0, Lorg/spongycastle/crypto/encodings/OAEPEncoding;->a:[B

    array-length v0, v0

    :goto_0
    array-length v5, v2

    if-eq v0, v5, :cond_0

    aget-byte v5, v2, v0

    iget-object v6, p0, Lorg/spongycastle/crypto/encodings/OAEPEncoding;->a:[B

    array-length v6, v6

    sub-int v6, v0, v6

    aget-byte v6, v4, v6

    xor-int/2addr v5, v6

    int-to-byte v5, v5

    aput-byte v5, v2, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lorg/spongycastle/crypto/encodings/OAEPEncoding;->a:[B

    array-length v0, v0

    invoke-static {v3, v1, v2, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v0, p0, Lorg/spongycastle/crypto/encodings/OAEPEncoding;->a:[B

    array-length v0, v0

    array-length v3, v2

    iget-object v4, p0, Lorg/spongycastle/crypto/encodings/OAEPEncoding;->a:[B

    array-length v4, v4

    sub-int/2addr v3, v4

    iget-object v4, p0, Lorg/spongycastle/crypto/encodings/OAEPEncoding;->a:[B

    array-length v4, v4

    invoke-direct {p0, v2, v0, v3, v4}, Lorg/spongycastle/crypto/encodings/OAEPEncoding;->a([BIII)[B

    move-result-object v3

    move v0, v1

    :goto_1
    iget-object v4, p0, Lorg/spongycastle/crypto/encodings/OAEPEncoding;->a:[B

    array-length v4, v4

    if-eq v0, v4, :cond_1

    aget-byte v4, v2, v0

    aget-byte v5, v3, v0

    xor-int/2addr v4, v5

    int-to-byte v4, v4

    aput-byte v4, v2, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lorg/spongycastle/crypto/encodings/OAEPEncoding;->d:Lorg/spongycastle/crypto/AsymmetricBlockCipher;

    array-length v3, v2

    invoke-interface {v0, v2, v1, v3}, Lorg/spongycastle/crypto/AsymmetricBlockCipher;->a([BII)[B

    move-result-object v0

    .line 131
    :goto_2
    return-object v0

    :cond_2
    iget-object v0, p0, Lorg/spongycastle/crypto/encodings/OAEPEncoding;->d:Lorg/spongycastle/crypto/AsymmetricBlockCipher;

    invoke-interface {v0, p1, p2, p3}, Lorg/spongycastle/crypto/AsymmetricBlockCipher;->a([BII)[B

    move-result-object v2

    array-length v0, v2

    iget-object v3, p0, Lorg/spongycastle/crypto/encodings/OAEPEncoding;->d:Lorg/spongycastle/crypto/AsymmetricBlockCipher;

    invoke-interface {v3}, Lorg/spongycastle/crypto/AsymmetricBlockCipher;->b()I

    move-result v3

    if-ge v0, v3, :cond_3

    iget-object v0, p0, Lorg/spongycastle/crypto/encodings/OAEPEncoding;->d:Lorg/spongycastle/crypto/AsymmetricBlockCipher;

    invoke-interface {v0}, Lorg/spongycastle/crypto/AsymmetricBlockCipher;->b()I

    move-result v0

    new-array v0, v0, [B

    array-length v3, v0

    array-length v4, v2

    sub-int/2addr v3, v4

    array-length v4, v2

    invoke-static {v2, v1, v0, v3, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :goto_3
    array-length v2, v0

    iget-object v3, p0, Lorg/spongycastle/crypto/encodings/OAEPEncoding;->a:[B

    array-length v3, v3

    mul-int/lit8 v3, v3, 0x2

    add-int/lit8 v3, v3, 0x1

    if-ge v2, v3, :cond_4

    new-instance v0, Lorg/spongycastle/crypto/InvalidCipherTextException;

    const-string v1, "data too short"

    invoke-direct {v0, v1}, Lorg/spongycastle/crypto/InvalidCipherTextException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    move-object v0, v2

    goto :goto_3

    :cond_4
    iget-object v2, p0, Lorg/spongycastle/crypto/encodings/OAEPEncoding;->a:[B

    array-length v2, v2

    array-length v3, v0

    iget-object v4, p0, Lorg/spongycastle/crypto/encodings/OAEPEncoding;->a:[B

    array-length v4, v4

    sub-int/2addr v3, v4

    iget-object v4, p0, Lorg/spongycastle/crypto/encodings/OAEPEncoding;->a:[B

    array-length v4, v4

    invoke-direct {p0, v0, v2, v3, v4}, Lorg/spongycastle/crypto/encodings/OAEPEncoding;->a([BIII)[B

    move-result-object v3

    move v2, v1

    :goto_4
    iget-object v4, p0, Lorg/spongycastle/crypto/encodings/OAEPEncoding;->a:[B

    array-length v4, v4

    if-eq v2, v4, :cond_5

    aget-byte v4, v0, v2

    aget-byte v5, v3, v2

    xor-int/2addr v4, v5

    int-to-byte v4, v4

    aput-byte v4, v0, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    :cond_5
    iget-object v2, p0, Lorg/spongycastle/crypto/encodings/OAEPEncoding;->a:[B

    array-length v2, v2

    array-length v3, v0

    iget-object v4, p0, Lorg/spongycastle/crypto/encodings/OAEPEncoding;->a:[B

    array-length v4, v4

    sub-int/2addr v3, v4

    invoke-direct {p0, v0, v1, v2, v3}, Lorg/spongycastle/crypto/encodings/OAEPEncoding;->a([BIII)[B

    move-result-object v3

    iget-object v2, p0, Lorg/spongycastle/crypto/encodings/OAEPEncoding;->a:[B

    array-length v2, v2

    :goto_5
    array-length v4, v0

    if-eq v2, v4, :cond_6

    aget-byte v4, v0, v2

    iget-object v5, p0, Lorg/spongycastle/crypto/encodings/OAEPEncoding;->a:[B

    array-length v5, v5

    sub-int v5, v2, v5

    aget-byte v5, v3, v5

    xor-int/2addr v4, v5

    int-to-byte v4, v4

    aput-byte v4, v0, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_5

    :cond_6
    move v2, v1

    :goto_6
    iget-object v3, p0, Lorg/spongycastle/crypto/encodings/OAEPEncoding;->a:[B

    array-length v3, v3

    if-eq v2, v3, :cond_8

    iget-object v3, p0, Lorg/spongycastle/crypto/encodings/OAEPEncoding;->a:[B

    aget-byte v3, v3, v2

    iget-object v4, p0, Lorg/spongycastle/crypto/encodings/OAEPEncoding;->a:[B

    array-length v4, v4

    add-int/2addr v4, v2

    aget-byte v4, v0, v4

    if-eq v3, v4, :cond_7

    new-instance v0, Lorg/spongycastle/crypto/InvalidCipherTextException;

    const-string v1, "data hash wrong"

    invoke-direct {v0, v1}, Lorg/spongycastle/crypto/InvalidCipherTextException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    add-int/lit8 v2, v2, 0x1

    goto :goto_6

    :cond_8
    iget-object v2, p0, Lorg/spongycastle/crypto/encodings/OAEPEncoding;->a:[B

    array-length v2, v2

    mul-int/lit8 v2, v2, 0x2

    :goto_7
    array-length v3, v0

    if-eq v2, v3, :cond_9

    aget-byte v3, v0, v2

    if-nez v3, :cond_9

    add-int/lit8 v2, v2, 0x1

    goto :goto_7

    :cond_9
    array-length v3, v0

    add-int/lit8 v3, v3, -0x1

    if-ge v2, v3, :cond_a

    aget-byte v3, v0, v2

    if-eq v3, v6, :cond_b

    :cond_a
    new-instance v0, Lorg/spongycastle/crypto/InvalidCipherTextException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "data start wrong "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/spongycastle/crypto/InvalidCipherTextException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_b
    add-int/lit8 v3, v2, 0x1

    array-length v2, v0

    sub-int/2addr v2, v3

    new-array v2, v2, [B

    array-length v4, v2

    invoke-static {v0, v3, v2, v1, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move-object v0, v2

    goto/16 :goto_2
.end method

.method public final b()I
    .locals 2

    .prologue
    .line 107
    iget-object v0, p0, Lorg/spongycastle/crypto/encodings/OAEPEncoding;->d:Lorg/spongycastle/crypto/AsymmetricBlockCipher;

    invoke-interface {v0}, Lorg/spongycastle/crypto/AsymmetricBlockCipher;->b()I

    move-result v0

    .line 109
    iget-boolean v1, p0, Lorg/spongycastle/crypto/encodings/OAEPEncoding;->f:Z

    if-eqz v1, :cond_0

    .line 115
    :goto_0
    return v0

    :cond_0
    add-int/lit8 v0, v0, -0x1

    iget-object v1, p0, Lorg/spongycastle/crypto/encodings/OAEPEncoding;->a:[B

    array-length v1, v1

    mul-int/lit8 v1, v1, 0x2

    sub-int/2addr v0, v1

    goto :goto_0
.end method
