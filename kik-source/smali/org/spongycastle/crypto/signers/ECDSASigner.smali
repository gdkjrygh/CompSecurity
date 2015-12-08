.class public Lorg/spongycastle/crypto/signers/ECDSASigner;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/spongycastle/crypto/DSA;
.implements Lorg/spongycastle/math/ec/ECConstants;


# instance fields
.field a:Lorg/spongycastle/crypto/params/ECKeyParameters;

.field b:Ljava/security/SecureRandom;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static a(Ljava/math/BigInteger;[B)Ljava/math/BigInteger;
    .locals 4

    .prologue
    const/4 v3, 0x1

    .line 147
    invoke-virtual {p0}, Ljava/math/BigInteger;->bitLength()I

    move-result v0

    .line 148
    array-length v1, p1

    mul-int/lit8 v1, v1, 0x8

    .line 150
    if-lt v0, v1, :cond_0

    .line 152
    new-instance v0, Ljava/math/BigInteger;

    invoke-direct {v0, v3, p1}, Ljava/math/BigInteger;-><init>(I[B)V

    .line 160
    :goto_0
    return-object v0

    .line 156
    :cond_0
    new-instance v2, Ljava/math/BigInteger;

    invoke-direct {v2, v3, p1}, Ljava/math/BigInteger;-><init>(I[B)V

    .line 158
    sub-int v0, v1, v0

    invoke-virtual {v2, v0}, Ljava/math/BigInteger;->shiftRight(I)Ljava/math/BigInteger;

    move-result-object v0

    goto :goto_0
.end method


# virtual methods
.method public final a(ZLorg/spongycastle/crypto/CipherParameters;)V
    .locals 1

    .prologue
    .line 30
    if-eqz p1, :cond_1

    .line 32
    instance-of v0, p2, Lorg/spongycastle/crypto/params/ParametersWithRandom;

    if-eqz v0, :cond_0

    .line 34
    check-cast p2, Lorg/spongycastle/crypto/params/ParametersWithRandom;

    .line 36
    invoke-virtual {p2}, Lorg/spongycastle/crypto/params/ParametersWithRandom;->a()Ljava/security/SecureRandom;

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/crypto/signers/ECDSASigner;->b:Ljava/security/SecureRandom;

    .line 37
    invoke-virtual {p2}, Lorg/spongycastle/crypto/params/ParametersWithRandom;->b()Lorg/spongycastle/crypto/CipherParameters;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/crypto/params/ECPrivateKeyParameters;

    iput-object v0, p0, Lorg/spongycastle/crypto/signers/ECDSASigner;->a:Lorg/spongycastle/crypto/params/ECKeyParameters;

    .line 49
    :goto_0
    return-void

    .line 41
    :cond_0
    new-instance v0, Ljava/security/SecureRandom;

    invoke-direct {v0}, Ljava/security/SecureRandom;-><init>()V

    iput-object v0, p0, Lorg/spongycastle/crypto/signers/ECDSASigner;->b:Ljava/security/SecureRandom;

    .line 42
    check-cast p2, Lorg/spongycastle/crypto/params/ECPrivateKeyParameters;

    iput-object p2, p0, Lorg/spongycastle/crypto/signers/ECDSASigner;->a:Lorg/spongycastle/crypto/params/ECKeyParameters;

    goto :goto_0

    .line 47
    :cond_1
    check-cast p2, Lorg/spongycastle/crypto/params/ECPublicKeyParameters;

    iput-object p2, p0, Lorg/spongycastle/crypto/signers/ECDSASigner;->a:Lorg/spongycastle/crypto/params/ECKeyParameters;

    goto :goto_0
.end method

.method public final a([BLjava/math/BigInteger;Ljava/math/BigInteger;)Z
    .locals 5

    .prologue
    const/4 v0, 0x0

    .line 115
    iget-object v1, p0, Lorg/spongycastle/crypto/signers/ECDSASigner;->a:Lorg/spongycastle/crypto/params/ECKeyParameters;

    invoke-virtual {v1}, Lorg/spongycastle/crypto/params/ECKeyParameters;->b()Lorg/spongycastle/crypto/params/ECDomainParameters;

    move-result-object v1

    invoke-virtual {v1}, Lorg/spongycastle/crypto/params/ECDomainParameters;->c()Ljava/math/BigInteger;

    move-result-object v1

    .line 116
    invoke-static {v1, p1}, Lorg/spongycastle/crypto/signers/ECDSASigner;->a(Ljava/math/BigInteger;[B)Ljava/math/BigInteger;

    move-result-object v2

    .line 119
    sget-object v3, Lorg/spongycastle/crypto/signers/ECDSASigner;->g:Ljava/math/BigInteger;

    invoke-virtual {p2, v3}, Ljava/math/BigInteger;->compareTo(Ljava/math/BigInteger;)I

    move-result v3

    if-ltz v3, :cond_0

    invoke-virtual {p2, v1}, Ljava/math/BigInteger;->compareTo(Ljava/math/BigInteger;)I

    move-result v3

    if-ltz v3, :cond_1

    .line 142
    :cond_0
    :goto_0
    return v0

    .line 125
    :cond_1
    sget-object v3, Lorg/spongycastle/crypto/signers/ECDSASigner;->g:Ljava/math/BigInteger;

    invoke-virtual {p3, v3}, Ljava/math/BigInteger;->compareTo(Ljava/math/BigInteger;)I

    move-result v3

    if-ltz v3, :cond_0

    invoke-virtual {p3, v1}, Ljava/math/BigInteger;->compareTo(Ljava/math/BigInteger;)I

    move-result v3

    if-gez v3, :cond_0

    .line 130
    invoke-virtual {p3, v1}, Ljava/math/BigInteger;->modInverse(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    .line 132
    invoke-virtual {v2, v0}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/math/BigInteger;->mod(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v2

    .line 133
    invoke-virtual {p2, v0}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/math/BigInteger;->mod(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v3

    .line 135
    iget-object v0, p0, Lorg/spongycastle/crypto/signers/ECDSASigner;->a:Lorg/spongycastle/crypto/params/ECKeyParameters;

    invoke-virtual {v0}, Lorg/spongycastle/crypto/params/ECKeyParameters;->b()Lorg/spongycastle/crypto/params/ECDomainParameters;

    move-result-object v0

    invoke-virtual {v0}, Lorg/spongycastle/crypto/params/ECDomainParameters;->b()Lorg/spongycastle/math/ec/ECPoint;

    move-result-object v4

    .line 136
    iget-object v0, p0, Lorg/spongycastle/crypto/signers/ECDSASigner;->a:Lorg/spongycastle/crypto/params/ECKeyParameters;

    check-cast v0, Lorg/spongycastle/crypto/params/ECPublicKeyParameters;

    invoke-virtual {v0}, Lorg/spongycastle/crypto/params/ECPublicKeyParameters;->c()Lorg/spongycastle/math/ec/ECPoint;

    move-result-object v0

    .line 138
    invoke-static {v4, v2, v0, v3}, Lorg/spongycastle/math/ec/ECAlgorithms;->a(Lorg/spongycastle/math/ec/ECPoint;Ljava/math/BigInteger;Lorg/spongycastle/math/ec/ECPoint;Ljava/math/BigInteger;)Lorg/spongycastle/math/ec/ECPoint;

    move-result-object v0

    .line 140
    invoke-virtual {v0}, Lorg/spongycastle/math/ec/ECPoint;->b()Lorg/spongycastle/math/ec/ECFieldElement;

    move-result-object v0

    invoke-virtual {v0}, Lorg/spongycastle/math/ec/ECFieldElement;->a()Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/math/BigInteger;->mod(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    .line 142
    invoke-virtual {v0, p2}, Ljava/math/BigInteger;->equals(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0
.end method

.method public final a([B)[Ljava/math/BigInteger;
    .locals 6

    .prologue
    .line 62
    iget-object v0, p0, Lorg/spongycastle/crypto/signers/ECDSASigner;->a:Lorg/spongycastle/crypto/params/ECKeyParameters;

    invoke-virtual {v0}, Lorg/spongycastle/crypto/params/ECKeyParameters;->b()Lorg/spongycastle/crypto/params/ECDomainParameters;

    move-result-object v0

    invoke-virtual {v0}, Lorg/spongycastle/crypto/params/ECDomainParameters;->c()Ljava/math/BigInteger;

    move-result-object v1

    .line 63
    invoke-static {v1, p1}, Lorg/spongycastle/crypto/signers/ECDSASigner;->a(Ljava/math/BigInteger;[B)Ljava/math/BigInteger;

    move-result-object v2

    .line 64
    :cond_0
    invoke-virtual {v1}, Ljava/math/BigInteger;->bitLength()I

    move-result v0

    .line 77
    :cond_1
    new-instance v3, Ljava/math/BigInteger;

    iget-object v4, p0, Lorg/spongycastle/crypto/signers/ECDSASigner;->b:Ljava/security/SecureRandom;

    invoke-direct {v3, v0, v4}, Ljava/math/BigInteger;-><init>(ILjava/util/Random;)V

    .line 79
    sget-object v4, Lorg/spongycastle/crypto/signers/ECDSASigner;->f:Ljava/math/BigInteger;

    invoke-virtual {v3, v4}, Ljava/math/BigInteger;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    invoke-virtual {v3, v1}, Ljava/math/BigInteger;->compareTo(Ljava/math/BigInteger;)I

    move-result v4

    if-gez v4, :cond_1

    .line 81
    iget-object v4, p0, Lorg/spongycastle/crypto/signers/ECDSASigner;->a:Lorg/spongycastle/crypto/params/ECKeyParameters;

    invoke-virtual {v4}, Lorg/spongycastle/crypto/params/ECKeyParameters;->b()Lorg/spongycastle/crypto/params/ECDomainParameters;

    move-result-object v4

    invoke-virtual {v4}, Lorg/spongycastle/crypto/params/ECDomainParameters;->b()Lorg/spongycastle/math/ec/ECPoint;

    move-result-object v4

    invoke-virtual {v4, v3}, Lorg/spongycastle/math/ec/ECPoint;->a(Ljava/math/BigInteger;)Lorg/spongycastle/math/ec/ECPoint;

    move-result-object v4

    .line 84
    invoke-virtual {v4}, Lorg/spongycastle/math/ec/ECPoint;->b()Lorg/spongycastle/math/ec/ECFieldElement;

    move-result-object v4

    invoke-virtual {v4}, Lorg/spongycastle/math/ec/ECFieldElement;->a()Ljava/math/BigInteger;

    move-result-object v4

    .line 86
    invoke-virtual {v4, v1}, Ljava/math/BigInteger;->mod(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v4

    .line 88
    sget-object v5, Lorg/spongycastle/crypto/signers/ECDSASigner;->f:Ljava/math/BigInteger;

    invoke-virtual {v4, v5}, Ljava/math/BigInteger;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1

    .line 90
    iget-object v0, p0, Lorg/spongycastle/crypto/signers/ECDSASigner;->a:Lorg/spongycastle/crypto/params/ECKeyParameters;

    check-cast v0, Lorg/spongycastle/crypto/params/ECPrivateKeyParameters;

    invoke-virtual {v0}, Lorg/spongycastle/crypto/params/ECPrivateKeyParameters;->c()Ljava/math/BigInteger;

    move-result-object v0

    .line 92
    invoke-virtual {v3, v1}, Ljava/math/BigInteger;->modInverse(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v3

    invoke-virtual {v0, v4}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/math/BigInteger;->add(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/math/BigInteger;->mod(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    .line 94
    sget-object v3, Lorg/spongycastle/crypto/signers/ECDSASigner;->f:Ljava/math/BigInteger;

    invoke-virtual {v0, v3}, Ljava/math/BigInteger;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 96
    const/4 v1, 0x2

    new-array v1, v1, [Ljava/math/BigInteger;

    .line 98
    const/4 v2, 0x0

    aput-object v4, v1, v2

    .line 99
    const/4 v2, 0x1

    aput-object v0, v1, v2

    .line 101
    return-object v1
.end method
