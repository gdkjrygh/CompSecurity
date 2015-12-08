.class public Lorg/spongycastle/crypto/params/NTRUSigningPublicKeyParameters;
.super Lorg/spongycastle/crypto/params/AsymmetricKeyParameter;
.source "SourceFile"


# instance fields
.field public b:Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;

.field private c:Lorg/spongycastle/crypto/params/NTRUSigningParameters;


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 81
    if-ne p0, p1, :cond_1

    .line 98
    :cond_0
    :goto_0
    return v0

    .line 83
    :cond_1
    if-nez p1, :cond_2

    move v0, v1

    .line 84
    goto :goto_0

    .line 85
    :cond_2
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_3

    move v0, v1

    .line 86
    goto :goto_0

    .line 87
    :cond_3
    check-cast p1, Lorg/spongycastle/crypto/params/NTRUSigningPublicKeyParameters;

    .line 88
    iget-object v2, p0, Lorg/spongycastle/crypto/params/NTRUSigningPublicKeyParameters;->b:Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;

    if-nez v2, :cond_4

    .line 89
    iget-object v2, p1, Lorg/spongycastle/crypto/params/NTRUSigningPublicKeyParameters;->b:Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;

    if-eqz v2, :cond_5

    move v0, v1

    .line 90
    goto :goto_0

    .line 91
    :cond_4
    iget-object v2, p0, Lorg/spongycastle/crypto/params/NTRUSigningPublicKeyParameters;->b:Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;

    iget-object v3, p1, Lorg/spongycastle/crypto/params/NTRUSigningPublicKeyParameters;->b:Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;

    invoke-virtual {v2, v3}, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    move v0, v1

    .line 92
    goto :goto_0

    .line 93
    :cond_5
    iget-object v2, p0, Lorg/spongycastle/crypto/params/NTRUSigningPublicKeyParameters;->c:Lorg/spongycastle/crypto/params/NTRUSigningParameters;

    if-nez v2, :cond_6

    .line 94
    iget-object v2, p1, Lorg/spongycastle/crypto/params/NTRUSigningPublicKeyParameters;->c:Lorg/spongycastle/crypto/params/NTRUSigningParameters;

    if-eqz v2, :cond_0

    move v0, v1

    .line 95
    goto :goto_0

    .line 96
    :cond_6
    iget-object v2, p0, Lorg/spongycastle/crypto/params/NTRUSigningPublicKeyParameters;->c:Lorg/spongycastle/crypto/params/NTRUSigningParameters;

    iget-object v3, p1, Lorg/spongycastle/crypto/params/NTRUSigningPublicKeyParameters;->c:Lorg/spongycastle/crypto/params/NTRUSigningParameters;

    invoke-virtual {v2, v3}, Lorg/spongycastle/crypto/params/NTRUSigningParameters;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    move v0, v1

    .line 97
    goto :goto_0
.end method

.method public hashCode()I
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 72
    iget-object v0, p0, Lorg/spongycastle/crypto/params/NTRUSigningPublicKeyParameters;->b:Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;

    if-nez v0, :cond_0

    move v0, v1

    :goto_0
    add-int/lit8 v0, v0, 0x1f

    .line 75
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lorg/spongycastle/crypto/params/NTRUSigningPublicKeyParameters;->c:Lorg/spongycastle/crypto/params/NTRUSigningParameters;

    if-nez v2, :cond_1

    :goto_1
    add-int/2addr v0, v1

    .line 76
    return v0

    .line 72
    :cond_0
    iget-object v0, p0, Lorg/spongycastle/crypto/params/NTRUSigningPublicKeyParameters;->b:Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    goto :goto_0

    .line 75
    :cond_1
    iget-object v1, p0, Lorg/spongycastle/crypto/params/NTRUSigningPublicKeyParameters;->c:Lorg/spongycastle/crypto/params/NTRUSigningParameters;

    invoke-virtual {v1}, Lorg/spongycastle/crypto/params/NTRUSigningParameters;->hashCode()I

    move-result v1

    goto :goto_1
.end method
