.class public Lorg/spongycastle/crypto/signers/DSASigner;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/spongycastle/crypto/DSA;


# instance fields
.field a:Lorg/spongycastle/crypto/params/DSAKeyParameters;

.field b:Ljava/security/SecureRandom;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static a(Ljava/math/BigInteger;[B)Ljava/math/BigInteger;
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 125
    invoke-virtual {p0}, Ljava/math/BigInteger;->bitLength()I

    move-result v0

    array-length v1, p1

    mul-int/lit8 v1, v1, 0x8

    if-lt v0, v1, :cond_0

    .line 127
    new-instance v0, Ljava/math/BigInteger;

    invoke-direct {v0, v3, p1}, Ljava/math/BigInteger;-><init>(I[B)V

    .line 135
    :goto_0
    return-object v0

    .line 131
    :cond_0
    invoke-virtual {p0}, Ljava/math/BigInteger;->bitLength()I

    move-result v0

    div-int/lit8 v0, v0, 0x8

    new-array v1, v0, [B

    .line 133
    array-length v0, v1

    invoke-static {p1, v2, v1, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 135
    new-instance v0, Ljava/math/BigInteger;

    invoke-direct {v0, v3, v1}, Ljava/math/BigInteger;-><init>(I[B)V

    goto :goto_0
.end method


# virtual methods
.method public final a(ZLorg/spongycastle/crypto/CipherParameters;)V
    .locals 1

    .prologue
    .line 29
    if-eqz p1, :cond_1

    .line 31
    instance-of v0, p2, Lorg/spongycastle/crypto/params/ParametersWithRandom;

    if-eqz v0, :cond_0

    .line 33
    check-cast p2, Lorg/spongycastle/crypto/params/ParametersWithRandom;

    .line 35
    invoke-virtual {p2}, Lorg/spongycastle/crypto/params/ParametersWithRandom;->a()Ljava/security/SecureRandom;

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/crypto/signers/DSASigner;->b:Ljava/security/SecureRandom;

    .line 36
    invoke-virtual {p2}, Lorg/spongycastle/crypto/params/ParametersWithRandom;->b()Lorg/spongycastle/crypto/CipherParameters;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/crypto/params/DSAPrivateKeyParameters;

    iput-object v0, p0, Lorg/spongycastle/crypto/signers/DSASigner;->a:Lorg/spongycastle/crypto/params/DSAKeyParameters;

    .line 48
    :goto_0
    return-void

    .line 40
    :cond_0
    new-instance v0, Ljava/security/SecureRandom;

    invoke-direct {v0}, Ljava/security/SecureRandom;-><init>()V

    iput-object v0, p0, Lorg/spongycastle/crypto/signers/DSASigner;->b:Ljava/security/SecureRandom;

    .line 41
    check-cast p2, Lorg/spongycastle/crypto/params/DSAPrivateKeyParameters;

    iput-object p2, p0, Lorg/spongycastle/crypto/signers/DSASigner;->a:Lorg/spongycastle/crypto/params/DSAKeyParameters;

    goto :goto_0

    .line 46
    :cond_1
    check-cast p2, Lorg/spongycastle/crypto/params/DSAPublicKeyParameters;

    iput-object p2, p0, Lorg/spongycastle/crypto/signers/DSASigner;->a:Lorg/spongycastle/crypto/params/DSAKeyParameters;

    goto :goto_0
.end method

.method public final a([BLjava/math/BigInteger;Ljava/math/BigInteger;)Z
    .locals 6

    .prologue
    const/4 v0, 0x0

    .line 96
    iget-object v1, p0, Lorg/spongycastle/crypto/signers/DSASigner;->a:Lorg/spongycastle/crypto/params/DSAKeyParameters;

    invoke-virtual {v1}, Lorg/spongycastle/crypto/params/DSAKeyParameters;->b()Lorg/spongycastle/crypto/params/DSAParameters;

    move-result-object v1

    .line 97
    invoke-virtual {v1}, Lorg/spongycastle/crypto/params/DSAParameters;->b()Ljava/math/BigInteger;

    move-result-object v2

    invoke-static {v2, p1}, Lorg/spongycastle/crypto/signers/DSASigner;->a(Ljava/math/BigInteger;[B)Ljava/math/BigInteger;

    move-result-object v2

    .line 98
    const-wide/16 v4, 0x0

    invoke-static {v4, v5}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v3

    .line 100
    invoke-virtual {v3, p2}, Ljava/math/BigInteger;->compareTo(Ljava/math/BigInteger;)I

    move-result v4

    if-gez v4, :cond_0

    invoke-virtual {v1}, Lorg/spongycastle/crypto/params/DSAParameters;->b()Ljava/math/BigInteger;

    move-result-object v4

    invoke-virtual {v4, p2}, Ljava/math/BigInteger;->compareTo(Ljava/math/BigInteger;)I

    move-result v4

    if-gtz v4, :cond_1

    .line 120
    :cond_0
    :goto_0
    return v0

    .line 105
    :cond_1
    invoke-virtual {v3, p3}, Ljava/math/BigInteger;->compareTo(Ljava/math/BigInteger;)I

    move-result v3

    if-gez v3, :cond_0

    invoke-virtual {v1}, Lorg/spongycastle/crypto/params/DSAParameters;->b()Ljava/math/BigInteger;

    move-result-object v3

    invoke-virtual {v3, p3}, Ljava/math/BigInteger;->compareTo(Ljava/math/BigInteger;)I

    move-result v3

    if-lez v3, :cond_0

    .line 110
    invoke-virtual {v1}, Lorg/spongycastle/crypto/params/DSAParameters;->b()Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/math/BigInteger;->modInverse(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    .line 112
    invoke-virtual {v2, v0}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v2

    invoke-virtual {v1}, Lorg/spongycastle/crypto/params/DSAParameters;->b()Ljava/math/BigInteger;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/math/BigInteger;->mod(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v2

    .line 113
    invoke-virtual {p2, v0}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v1}, Lorg/spongycastle/crypto/params/DSAParameters;->b()Ljava/math/BigInteger;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/math/BigInteger;->mod(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v3

    .line 115
    invoke-virtual {v1}, Lorg/spongycastle/crypto/params/DSAParameters;->c()Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v1}, Lorg/spongycastle/crypto/params/DSAParameters;->a()Ljava/math/BigInteger;

    move-result-object v4

    invoke-virtual {v0, v2, v4}, Ljava/math/BigInteger;->modPow(Ljava/math/BigInteger;Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v2

    .line 116
    iget-object v0, p0, Lorg/spongycastle/crypto/signers/DSASigner;->a:Lorg/spongycastle/crypto/params/DSAKeyParameters;

    check-cast v0, Lorg/spongycastle/crypto/params/DSAPublicKeyParameters;

    invoke-virtual {v0}, Lorg/spongycastle/crypto/params/DSAPublicKeyParameters;->c()Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v1}, Lorg/spongycastle/crypto/params/DSAParameters;->a()Ljava/math/BigInteger;

    move-result-object v4

    invoke-virtual {v0, v3, v4}, Ljava/math/BigInteger;->modPow(Ljava/math/BigInteger;Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    .line 118
    invoke-virtual {v2, v0}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v1}, Lorg/spongycastle/crypto/params/DSAParameters;->a()Ljava/math/BigInteger;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/math/BigInteger;->mod(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v1}, Lorg/spongycastle/crypto/params/DSAParameters;->b()Ljava/math/BigInteger;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/math/BigInteger;->mod(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    .line 120
    invoke-virtual {v0, p2}, Ljava/math/BigInteger;->equals(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0
.end method

.method public final a([B)[Ljava/math/BigInteger;
    .locals 5

    .prologue
    .line 60
    iget-object v0, p0, Lorg/spongycastle/crypto/signers/DSASigner;->a:Lorg/spongycastle/crypto/params/DSAKeyParameters;

    invoke-virtual {v0}, Lorg/spongycastle/crypto/params/DSAKeyParameters;->b()Lorg/spongycastle/crypto/params/DSAParameters;

    move-result-object v1

    .line 61
    invoke-virtual {v1}, Lorg/spongycastle/crypto/params/DSAParameters;->b()Ljava/math/BigInteger;

    move-result-object v0

    invoke-static {v0, p1}, Lorg/spongycastle/crypto/signers/DSASigner;->a(Ljava/math/BigInteger;[B)Ljava/math/BigInteger;

    move-result-object v2

    .line 63
    invoke-virtual {v1}, Lorg/spongycastle/crypto/params/DSAParameters;->b()Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigInteger;->bitLength()I

    move-result v0

    .line 67
    :cond_0
    new-instance v3, Ljava/math/BigInteger;

    iget-object v4, p0, Lorg/spongycastle/crypto/signers/DSASigner;->b:Ljava/security/SecureRandom;

    invoke-direct {v3, v0, v4}, Ljava/math/BigInteger;-><init>(ILjava/util/Random;)V

    .line 69
    invoke-virtual {v1}, Lorg/spongycastle/crypto/params/DSAParameters;->b()Ljava/math/BigInteger;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/math/BigInteger;->compareTo(Ljava/math/BigInteger;)I

    move-result v4

    if-gez v4, :cond_0

    .line 71
    invoke-virtual {v1}, Lorg/spongycastle/crypto/params/DSAParameters;->c()Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v1}, Lorg/spongycastle/crypto/params/DSAParameters;->a()Ljava/math/BigInteger;

    move-result-object v4

    invoke-virtual {v0, v3, v4}, Ljava/math/BigInteger;->modPow(Ljava/math/BigInteger;Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v1}, Lorg/spongycastle/crypto/params/DSAParameters;->b()Ljava/math/BigInteger;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/math/BigInteger;->mod(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v4

    .line 73
    invoke-virtual {v1}, Lorg/spongycastle/crypto/params/DSAParameters;->b()Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/math/BigInteger;->modInverse(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v3

    iget-object v0, p0, Lorg/spongycastle/crypto/signers/DSASigner;->a:Lorg/spongycastle/crypto/params/DSAKeyParameters;

    check-cast v0, Lorg/spongycastle/crypto/params/DSAPrivateKeyParameters;

    invoke-virtual {v0}, Lorg/spongycastle/crypto/params/DSAPrivateKeyParameters;->c()Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/math/BigInteger;->add(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    .line 76
    invoke-virtual {v1}, Lorg/spongycastle/crypto/params/DSAParameters;->b()Ljava/math/BigInteger;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/math/BigInteger;->mod(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    .line 78
    const/4 v1, 0x2

    new-array v1, v1, [Ljava/math/BigInteger;

    .line 80
    const/4 v2, 0x0

    aput-object v4, v1, v2

    .line 81
    const/4 v2, 0x1

    aput-object v0, v1, v2

    .line 83
    return-object v1
.end method
