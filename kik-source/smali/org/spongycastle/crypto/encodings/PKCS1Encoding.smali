.class public Lorg/spongycastle/crypto/encodings/PKCS1Encoding;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/spongycastle/crypto/AsymmetricBlockCipher;


# instance fields
.field private a:Ljava/security/SecureRandom;

.field private b:Lorg/spongycastle/crypto/AsymmetricBlockCipher;

.field private c:Z

.field private d:Z

.field private e:Z


# direct methods
.method public constructor <init>(Lorg/spongycastle/crypto/AsymmetricBlockCipher;)V
    .locals 2

    .prologue
    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    iput-object p1, p0, Lorg/spongycastle/crypto/encodings/PKCS1Encoding;->b:Lorg/spongycastle/crypto/AsymmetricBlockCipher;

    .line 46
    new-instance v0, Lorg/spongycastle/crypto/encodings/a;

    invoke-direct {v0, p0}, Lorg/spongycastle/crypto/encodings/a;-><init>(Lorg/spongycastle/crypto/encodings/PKCS1Encoding;)V

    invoke-static {v0}, Ljava/security/AccessController;->doPrivileged(Ljava/security/PrivilegedAction;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_0

    const-string v1, "true"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    iput-boolean v0, p0, Lorg/spongycastle/crypto/encodings/PKCS1Encoding;->e:Z

    .line 47
    return-void

    .line 46
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private b([BII)[B
    .locals 7

    .prologue
    const/4 v6, 0x0

    const/4 v1, 0x1

    .line 196
    iget-object v0, p0, Lorg/spongycastle/crypto/encodings/PKCS1Encoding;->b:Lorg/spongycastle/crypto/AsymmetricBlockCipher;

    invoke-interface {v0, p1, p2, p3}, Lorg/spongycastle/crypto/AsymmetricBlockCipher;->a([BII)[B

    move-result-object v2

    .line 198
    array-length v0, v2

    invoke-virtual {p0}, Lorg/spongycastle/crypto/encodings/PKCS1Encoding;->b()I

    move-result v3

    if-ge v0, v3, :cond_0

    .line 200
    new-instance v0, Lorg/spongycastle/crypto/InvalidCipherTextException;

    const-string v1, "block truncated"

    invoke-direct {v0, v1}, Lorg/spongycastle/crypto/InvalidCipherTextException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 203
    :cond_0
    aget-byte v3, v2, v6

    .line 205
    if-eq v3, v1, :cond_1

    const/4 v0, 0x2

    if-eq v3, v0, :cond_1

    .line 207
    new-instance v0, Lorg/spongycastle/crypto/InvalidCipherTextException;

    const-string v1, "unknown block type"

    invoke-direct {v0, v1}, Lorg/spongycastle/crypto/InvalidCipherTextException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 210
    :cond_1
    iget-boolean v0, p0, Lorg/spongycastle/crypto/encodings/PKCS1Encoding;->e:Z

    if-eqz v0, :cond_2

    array-length v0, v2

    iget-object v4, p0, Lorg/spongycastle/crypto/encodings/PKCS1Encoding;->b:Lorg/spongycastle/crypto/AsymmetricBlockCipher;

    invoke-interface {v4}, Lorg/spongycastle/crypto/AsymmetricBlockCipher;->b()I

    move-result v4

    if-eq v0, v4, :cond_2

    .line 212
    new-instance v0, Lorg/spongycastle/crypto/InvalidCipherTextException;

    const-string v1, "block incorrect size"

    invoke-direct {v0, v1}, Lorg/spongycastle/crypto/InvalidCipherTextException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    move v0, v1

    .line 220
    :goto_0
    array-length v4, v2

    if-eq v0, v4, :cond_4

    .line 222
    aget-byte v4, v2, v0

    .line 224
    if-eqz v4, :cond_4

    .line 226
    if-ne v3, v1, :cond_3

    const/4 v5, -0x1

    if-eq v4, v5, :cond_3

    .line 230
    new-instance v0, Lorg/spongycastle/crypto/InvalidCipherTextException;

    const-string v1, "block padding incorrect"

    invoke-direct {v0, v1}, Lorg/spongycastle/crypto/InvalidCipherTextException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 220
    :cond_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 234
    :cond_4
    add-int/lit8 v0, v0, 0x1

    .line 236
    array-length v1, v2

    if-gt v0, v1, :cond_5

    const/16 v1, 0xa

    if-ge v0, v1, :cond_6

    .line 238
    :cond_5
    new-instance v0, Lorg/spongycastle/crypto/InvalidCipherTextException;

    const-string v1, "no data in block"

    invoke-direct {v0, v1}, Lorg/spongycastle/crypto/InvalidCipherTextException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 241
    :cond_6
    array-length v1, v2

    sub-int/2addr v1, v0

    new-array v1, v1, [B

    .line 243
    array-length v3, v1

    invoke-static {v2, v0, v1, v6, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 245
    return-object v1
.end method


# virtual methods
.method public final a()I
    .locals 2

    .prologue
    .line 98
    iget-object v0, p0, Lorg/spongycastle/crypto/encodings/PKCS1Encoding;->b:Lorg/spongycastle/crypto/AsymmetricBlockCipher;

    invoke-interface {v0}, Lorg/spongycastle/crypto/AsymmetricBlockCipher;->a()I

    move-result v0

    .line 100
    iget-boolean v1, p0, Lorg/spongycastle/crypto/encodings/PKCS1Encoding;->c:Z

    if-eqz v1, :cond_0

    .line 102
    add-int/lit8 v0, v0, -0xa

    .line 106
    :cond_0
    return v0
.end method

.method public final a(ZLorg/spongycastle/crypto/CipherParameters;)V
    .locals 2

    .prologue
    .line 77
    instance-of v0, p2, Lorg/spongycastle/crypto/params/ParametersWithRandom;

    if-eqz v0, :cond_0

    move-object v0, p2

    .line 79
    check-cast v0, Lorg/spongycastle/crypto/params/ParametersWithRandom;

    .line 81
    invoke-virtual {v0}, Lorg/spongycastle/crypto/params/ParametersWithRandom;->a()Ljava/security/SecureRandom;

    move-result-object v1

    iput-object v1, p0, Lorg/spongycastle/crypto/encodings/PKCS1Encoding;->a:Ljava/security/SecureRandom;

    .line 82
    invoke-virtual {v0}, Lorg/spongycastle/crypto/params/ParametersWithRandom;->b()Lorg/spongycastle/crypto/CipherParameters;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/crypto/params/AsymmetricKeyParameter;

    .line 90
    :goto_0
    iget-object v1, p0, Lorg/spongycastle/crypto/encodings/PKCS1Encoding;->b:Lorg/spongycastle/crypto/AsymmetricBlockCipher;

    invoke-interface {v1, p1, p2}, Lorg/spongycastle/crypto/AsymmetricBlockCipher;->a(ZLorg/spongycastle/crypto/CipherParameters;)V

    .line 92
    invoke-virtual {v0}, Lorg/spongycastle/crypto/params/AsymmetricKeyParameter;->a()Z

    move-result v0

    iput-boolean v0, p0, Lorg/spongycastle/crypto/encodings/PKCS1Encoding;->d:Z

    .line 93
    iput-boolean p1, p0, Lorg/spongycastle/crypto/encodings/PKCS1Encoding;->c:Z

    .line 94
    return-void

    .line 86
    :cond_0
    new-instance v0, Ljava/security/SecureRandom;

    invoke-direct {v0}, Ljava/security/SecureRandom;-><init>()V

    iput-object v0, p0, Lorg/spongycastle/crypto/encodings/PKCS1Encoding;->a:Ljava/security/SecureRandom;

    move-object v0, p2

    .line 87
    check-cast v0, Lorg/spongycastle/crypto/params/AsymmetricKeyParameter;

    goto :goto_0
.end method

.method public final a([BII)[B
    .locals 4

    .prologue
    const/4 v0, 0x1

    const/4 v3, 0x0

    .line 130
    iget-boolean v1, p0, Lorg/spongycastle/crypto/encodings/PKCS1Encoding;->c:Z

    if-eqz v1, :cond_4

    .line 132
    invoke-virtual {p0}, Lorg/spongycastle/crypto/encodings/PKCS1Encoding;->a()I

    move-result v1

    if-le p3, v1, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "input data too large"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-object v1, p0, Lorg/spongycastle/crypto/encodings/PKCS1Encoding;->b:Lorg/spongycastle/crypto/AsymmetricBlockCipher;

    invoke-interface {v1}, Lorg/spongycastle/crypto/AsymmetricBlockCipher;->a()I

    move-result v1

    new-array v1, v1, [B

    iget-boolean v2, p0, Lorg/spongycastle/crypto/encodings/PKCS1Encoding;->d:Z

    if-eqz v2, :cond_1

    aput-byte v0, v1, v3

    :goto_0
    array-length v2, v1

    sub-int/2addr v2, p3

    add-int/lit8 v2, v2, -0x1

    if-eq v0, v2, :cond_3

    const/4 v2, -0x1

    aput-byte v2, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    iget-object v2, p0, Lorg/spongycastle/crypto/encodings/PKCS1Encoding;->a:Ljava/security/SecureRandom;

    invoke-virtual {v2, v1}, Ljava/security/SecureRandom;->nextBytes([B)V

    const/4 v2, 0x2

    aput-byte v2, v1, v3

    :goto_1
    array-length v2, v1

    sub-int/2addr v2, p3

    add-int/lit8 v2, v2, -0x1

    if-eq v0, v2, :cond_3

    :goto_2
    aget-byte v2, v1, v0

    if-nez v2, :cond_2

    iget-object v2, p0, Lorg/spongycastle/crypto/encodings/PKCS1Encoding;->a:Ljava/security/SecureRandom;

    invoke-virtual {v2}, Ljava/security/SecureRandom;->nextInt()I

    move-result v2

    int-to-byte v2, v2

    aput-byte v2, v1, v0

    goto :goto_2

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_3
    array-length v0, v1

    sub-int/2addr v0, p3

    add-int/lit8 v0, v0, -0x1

    aput-byte v3, v1, v0

    array-length v0, v1

    sub-int/2addr v0, p3

    invoke-static {p1, p2, v1, v0, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v0, p0, Lorg/spongycastle/crypto/encodings/PKCS1Encoding;->b:Lorg/spongycastle/crypto/AsymmetricBlockCipher;

    array-length v2, v1

    invoke-interface {v0, v1, v3, v2}, Lorg/spongycastle/crypto/AsymmetricBlockCipher;->a([BII)[B

    move-result-object v0

    .line 136
    :goto_3
    return-object v0

    :cond_4
    invoke-direct {p0, p1, p2, p3}, Lorg/spongycastle/crypto/encodings/PKCS1Encoding;->b([BII)[B

    move-result-object v0

    goto :goto_3
.end method

.method public final b()I
    .locals 2

    .prologue
    .line 112
    iget-object v0, p0, Lorg/spongycastle/crypto/encodings/PKCS1Encoding;->b:Lorg/spongycastle/crypto/AsymmetricBlockCipher;

    invoke-interface {v0}, Lorg/spongycastle/crypto/AsymmetricBlockCipher;->b()I

    move-result v0

    .line 114
    iget-boolean v1, p0, Lorg/spongycastle/crypto/encodings/PKCS1Encoding;->c:Z

    if-eqz v1, :cond_0

    .line 120
    :goto_0
    return v0

    :cond_0
    add-int/lit8 v0, v0, -0xa

    goto :goto_0
.end method
