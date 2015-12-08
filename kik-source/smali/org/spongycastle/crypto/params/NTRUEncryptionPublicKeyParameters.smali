.class public Lorg/spongycastle/crypto/params/NTRUEncryptionPublicKeyParameters;
.super Lorg/spongycastle/crypto/params/NTRUEncryptionKeyParameters;
.source "SourceFile"


# instance fields
.field public c:Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 94
    if-ne p0, p1, :cond_1

    .line 129
    :cond_0
    :goto_0
    return v0

    .line 98
    :cond_1
    if-nez p1, :cond_2

    move v0, v1

    .line 100
    goto :goto_0

    .line 102
    :cond_2
    instance-of v2, p1, Lorg/spongycastle/crypto/params/NTRUEncryptionPublicKeyParameters;

    if-nez v2, :cond_3

    move v0, v1

    .line 104
    goto :goto_0

    .line 106
    :cond_3
    check-cast p1, Lorg/spongycastle/crypto/params/NTRUEncryptionPublicKeyParameters;

    .line 107
    iget-object v2, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionPublicKeyParameters;->c:Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;

    if-nez v2, :cond_4

    .line 109
    iget-object v2, p1, Lorg/spongycastle/crypto/params/NTRUEncryptionPublicKeyParameters;->c:Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;

    if-eqz v2, :cond_5

    move v0, v1

    .line 111
    goto :goto_0

    .line 114
    :cond_4
    iget-object v2, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionPublicKeyParameters;->c:Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;

    iget-object v3, p1, Lorg/spongycastle/crypto/params/NTRUEncryptionPublicKeyParameters;->c:Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;

    invoke-virtual {v2, v3}, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    move v0, v1

    .line 116
    goto :goto_0

    .line 118
    :cond_5
    iget-object v2, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionPublicKeyParameters;->b:Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;

    if-nez v2, :cond_6

    .line 120
    iget-object v2, p1, Lorg/spongycastle/crypto/params/NTRUEncryptionPublicKeyParameters;->b:Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;

    if-eqz v2, :cond_0

    move v0, v1

    .line 122
    goto :goto_0

    .line 125
    :cond_6
    iget-object v2, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionPublicKeyParameters;->b:Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;

    iget-object v3, p1, Lorg/spongycastle/crypto/params/NTRUEncryptionPublicKeyParameters;->b:Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;

    invoke-virtual {v2, v3}, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    move v0, v1

    .line 127
    goto :goto_0
.end method

.method public hashCode()I
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 85
    iget-object v0, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionPublicKeyParameters;->c:Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;

    if-nez v0, :cond_0

    move v0, v1

    :goto_0
    add-int/lit8 v0, v0, 0x1f

    .line 88
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionPublicKeyParameters;->b:Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;

    if-nez v2, :cond_1

    :goto_1
    add-int/2addr v0, v1

    .line 89
    return v0

    .line 85
    :cond_0
    iget-object v0, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionPublicKeyParameters;->c:Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    goto :goto_0

    .line 88
    :cond_1
    iget-object v1, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionPublicKeyParameters;->b:Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;

    invoke-virtual {v1}, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->hashCode()I

    move-result v1

    goto :goto_1
.end method
