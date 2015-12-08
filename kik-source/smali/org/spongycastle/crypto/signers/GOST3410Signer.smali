.class public Lorg/spongycastle/crypto/signers/GOST3410Signer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/spongycastle/crypto/DSA;


# instance fields
.field a:Lorg/spongycastle/crypto/params/GOST3410KeyParameters;

.field b:Ljava/security/SecureRandom;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(ZLorg/spongycastle/crypto/CipherParameters;)V
    .locals 1

    .prologue
    .line 24
    if-eqz p1, :cond_1

    .line 26
    instance-of v0, p2, Lorg/spongycastle/crypto/params/ParametersWithRandom;

    if-eqz v0, :cond_0

    .line 28
    check-cast p2, Lorg/spongycastle/crypto/params/ParametersWithRandom;

    .line 30
    invoke-virtual {p2}, Lorg/spongycastle/crypto/params/ParametersWithRandom;->a()Ljava/security/SecureRandom;

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/crypto/signers/GOST3410Signer;->b:Ljava/security/SecureRandom;

    .line 31
    invoke-virtual {p2}, Lorg/spongycastle/crypto/params/ParametersWithRandom;->b()Lorg/spongycastle/crypto/CipherParameters;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/crypto/params/GOST3410PrivateKeyParameters;

    iput-object v0, p0, Lorg/spongycastle/crypto/signers/GOST3410Signer;->a:Lorg/spongycastle/crypto/params/GOST3410KeyParameters;

    .line 43
    :goto_0
    return-void

    .line 35
    :cond_0
    new-instance v0, Ljava/security/SecureRandom;

    invoke-direct {v0}, Ljava/security/SecureRandom;-><init>()V

    iput-object v0, p0, Lorg/spongycastle/crypto/signers/GOST3410Signer;->b:Ljava/security/SecureRandom;

    .line 36
    check-cast p2, Lorg/spongycastle/crypto/params/GOST3410PrivateKeyParameters;

    iput-object p2, p0, Lorg/spongycastle/crypto/signers/GOST3410Signer;->a:Lorg/spongycastle/crypto/params/GOST3410KeyParameters;

    goto :goto_0

    .line 41
    :cond_1
    check-cast p2, Lorg/spongycastle/crypto/params/GOST3410PublicKeyParameters;

    iput-object p2, p0, Lorg/spongycastle/crypto/signers/GOST3410Signer;->a:Lorg/spongycastle/crypto/params/GOST3410KeyParameters;

    goto :goto_0
.end method

.method public final a([BLjava/math/BigInteger;Ljava/math/BigInteger;)Z
    .locals 6

    .prologue
    const/4 v1, 0x0

    .line 95
    array-length v0, p1

    new-array v2, v0, [B

    move v0, v1

    .line 96
    :goto_0
    array-length v3, v2

    if-eq v0, v3, :cond_0

    .line 98
    array-length v3, v2

    add-int/lit8 v3, v3, -0x1

    sub-int/2addr v3, v0

    aget-byte v3, p1, v3

    aput-byte v3, v2, v0

    .line 96
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 101
    :cond_0
    new-instance v0, Ljava/math/BigInteger;

    const/4 v3, 0x1

    invoke-direct {v0, v3, v2}, Ljava/math/BigInteger;-><init>(I[B)V

    .line 102
    iget-object v2, p0, Lorg/spongycastle/crypto/signers/GOST3410Signer;->a:Lorg/spongycastle/crypto/params/GOST3410KeyParameters;

    invoke-virtual {v2}, Lorg/spongycastle/crypto/params/GOST3410KeyParameters;->b()Lorg/spongycastle/crypto/params/GOST3410Parameters;

    move-result-object v2

    .line 103
    const-wide/16 v4, 0x0

    invoke-static {v4, v5}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v3

    .line 105
    invoke-virtual {v3, p2}, Ljava/math/BigInteger;->compareTo(Ljava/math/BigInteger;)I

    move-result v4

    if-gez v4, :cond_1

    invoke-virtual {v2}, Lorg/spongycastle/crypto/params/GOST3410Parameters;->b()Ljava/math/BigInteger;

    move-result-object v4

    invoke-virtual {v4, p2}, Ljava/math/BigInteger;->compareTo(Ljava/math/BigInteger;)I

    move-result v4

    if-gtz v4, :cond_2

    .line 125
    :cond_1
    :goto_1
    return v1

    .line 110
    :cond_2
    invoke-virtual {v3, p3}, Ljava/math/BigInteger;->compareTo(Ljava/math/BigInteger;)I

    move-result v3

    if-gez v3, :cond_1

    invoke-virtual {v2}, Lorg/spongycastle/crypto/params/GOST3410Parameters;->b()Ljava/math/BigInteger;

    move-result-object v3

    invoke-virtual {v3, p3}, Ljava/math/BigInteger;->compareTo(Ljava/math/BigInteger;)I

    move-result v3

    if-lez v3, :cond_1

    .line 115
    invoke-virtual {v2}, Lorg/spongycastle/crypto/params/GOST3410Parameters;->b()Ljava/math/BigInteger;

    move-result-object v1

    new-instance v3, Ljava/math/BigInteger;

    const-string v4, "2"

    invoke-direct {v3, v4}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v3}, Ljava/math/BigInteger;->subtract(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v1

    invoke-virtual {v2}, Lorg/spongycastle/crypto/params/GOST3410Parameters;->b()Ljava/math/BigInteger;

    move-result-object v3

    invoke-virtual {v0, v1, v3}, Ljava/math/BigInteger;->modPow(Ljava/math/BigInteger;Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    .line 117
    invoke-virtual {p3, v0}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v1

    invoke-virtual {v2}, Lorg/spongycastle/crypto/params/GOST3410Parameters;->b()Ljava/math/BigInteger;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/math/BigInteger;->mod(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v1

    .line 118
    invoke-virtual {v2}, Lorg/spongycastle/crypto/params/GOST3410Parameters;->b()Ljava/math/BigInteger;

    move-result-object v3

    invoke-virtual {v3, p2}, Ljava/math/BigInteger;->subtract(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v2}, Lorg/spongycastle/crypto/params/GOST3410Parameters;->b()Ljava/math/BigInteger;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/math/BigInteger;->mod(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v3

    .line 120
    invoke-virtual {v2}, Lorg/spongycastle/crypto/params/GOST3410Parameters;->c()Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v2}, Lorg/spongycastle/crypto/params/GOST3410Parameters;->a()Ljava/math/BigInteger;

    move-result-object v4

    invoke-virtual {v0, v1, v4}, Ljava/math/BigInteger;->modPow(Ljava/math/BigInteger;Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v1

    .line 121
    iget-object v0, p0, Lorg/spongycastle/crypto/signers/GOST3410Signer;->a:Lorg/spongycastle/crypto/params/GOST3410KeyParameters;

    check-cast v0, Lorg/spongycastle/crypto/params/GOST3410PublicKeyParameters;

    invoke-virtual {v0}, Lorg/spongycastle/crypto/params/GOST3410PublicKeyParameters;->c()Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v2}, Lorg/spongycastle/crypto/params/GOST3410Parameters;->a()Ljava/math/BigInteger;

    move-result-object v4

    invoke-virtual {v0, v3, v4}, Ljava/math/BigInteger;->modPow(Ljava/math/BigInteger;Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    .line 123
    invoke-virtual {v1, v0}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v2}, Lorg/spongycastle/crypto/params/GOST3410Parameters;->a()Ljava/math/BigInteger;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/math/BigInteger;->mod(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v2}, Lorg/spongycastle/crypto/params/GOST3410Parameters;->b()Ljava/math/BigInteger;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/math/BigInteger;->mod(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    .line 125
    invoke-virtual {v0, p2}, Ljava/math/BigInteger;->equals(Ljava/lang/Object;)Z

    move-result v1

    goto :goto_1
.end method

.method public final a([B)[Ljava/math/BigInteger;
    .locals 7

    .prologue
    const/4 v6, 0x1

    const/4 v1, 0x0

    .line 55
    array-length v0, p1

    new-array v2, v0, [B

    move v0, v1

    .line 56
    :goto_0
    array-length v3, v2

    if-eq v0, v3, :cond_0

    .line 58
    array-length v3, v2

    add-int/lit8 v3, v3, -0x1

    sub-int/2addr v3, v0

    aget-byte v3, p1, v3

    aput-byte v3, v2, v0

    .line 56
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 61
    :cond_0
    new-instance v0, Ljava/math/BigInteger;

    invoke-direct {v0, v6, v2}, Ljava/math/BigInteger;-><init>(I[B)V

    .line 62
    iget-object v2, p0, Lorg/spongycastle/crypto/signers/GOST3410Signer;->a:Lorg/spongycastle/crypto/params/GOST3410KeyParameters;

    invoke-virtual {v2}, Lorg/spongycastle/crypto/params/GOST3410KeyParameters;->b()Lorg/spongycastle/crypto/params/GOST3410Parameters;

    move-result-object v2

    .line 67
    :cond_1
    new-instance v3, Ljava/math/BigInteger;

    invoke-virtual {v2}, Lorg/spongycastle/crypto/params/GOST3410Parameters;->b()Ljava/math/BigInteger;

    move-result-object v4

    invoke-virtual {v4}, Ljava/math/BigInteger;->bitLength()I

    move-result v4

    iget-object v5, p0, Lorg/spongycastle/crypto/signers/GOST3410Signer;->b:Ljava/security/SecureRandom;

    invoke-direct {v3, v4, v5}, Ljava/math/BigInteger;-><init>(ILjava/util/Random;)V

    .line 69
    invoke-virtual {v2}, Lorg/spongycastle/crypto/params/GOST3410Parameters;->b()Ljava/math/BigInteger;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/math/BigInteger;->compareTo(Ljava/math/BigInteger;)I

    move-result v4

    if-gez v4, :cond_1

    .line 71
    invoke-virtual {v2}, Lorg/spongycastle/crypto/params/GOST3410Parameters;->c()Ljava/math/BigInteger;

    move-result-object v4

    invoke-virtual {v2}, Lorg/spongycastle/crypto/params/GOST3410Parameters;->a()Ljava/math/BigInteger;

    move-result-object v5

    invoke-virtual {v4, v3, v5}, Ljava/math/BigInteger;->modPow(Ljava/math/BigInteger;Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v4

    invoke-virtual {v2}, Lorg/spongycastle/crypto/params/GOST3410Parameters;->b()Ljava/math/BigInteger;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/math/BigInteger;->mod(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v4

    .line 73
    invoke-virtual {v3, v0}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v3

    iget-object v0, p0, Lorg/spongycastle/crypto/signers/GOST3410Signer;->a:Lorg/spongycastle/crypto/params/GOST3410KeyParameters;

    check-cast v0, Lorg/spongycastle/crypto/params/GOST3410PrivateKeyParameters;

    invoke-virtual {v0}, Lorg/spongycastle/crypto/params/GOST3410PrivateKeyParameters;->c()Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/math/BigInteger;->add(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v2}, Lorg/spongycastle/crypto/params/GOST3410Parameters;->b()Ljava/math/BigInteger;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/math/BigInteger;->mod(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    .line 77
    const/4 v2, 0x2

    new-array v2, v2, [Ljava/math/BigInteger;

    .line 79
    aput-object v4, v2, v1

    .line 80
    aput-object v0, v2, v6

    .line 82
    return-object v2
.end method
