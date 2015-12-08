.class public Lorg/spongycastle/crypto/params/NTRUEncryptionPrivateKeyParameters;
.super Lorg/spongycastle/crypto/params/NTRUEncryptionKeyParameters;
.source "SourceFile"


# instance fields
.field public c:Lorg/spongycastle/math/ntru/polynomial/Polynomial;

.field public d:Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;

.field public e:Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 158
    if-ne p0, p1, :cond_1

    .line 197
    :cond_0
    :goto_0
    return v0

    .line 162
    :cond_1
    if-nez p1, :cond_2

    move v0, v1

    .line 164
    goto :goto_0

    .line 166
    :cond_2
    instance-of v2, p1, Lorg/spongycastle/crypto/params/NTRUEncryptionPrivateKeyParameters;

    if-nez v2, :cond_3

    move v0, v1

    .line 168
    goto :goto_0

    .line 170
    :cond_3
    check-cast p1, Lorg/spongycastle/crypto/params/NTRUEncryptionPrivateKeyParameters;

    .line 171
    iget-object v2, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionPrivateKeyParameters;->b:Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;

    if-nez v2, :cond_4

    .line 173
    iget-object v2, p1, Lorg/spongycastle/crypto/params/NTRUEncryptionPrivateKeyParameters;->b:Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;

    if-eqz v2, :cond_5

    move v0, v1

    .line 175
    goto :goto_0

    .line 178
    :cond_4
    iget-object v2, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionPrivateKeyParameters;->b:Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;

    iget-object v3, p1, Lorg/spongycastle/crypto/params/NTRUEncryptionPrivateKeyParameters;->b:Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;

    invoke-virtual {v2, v3}, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    move v0, v1

    .line 180
    goto :goto_0

    .line 182
    :cond_5
    iget-object v2, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionPrivateKeyParameters;->c:Lorg/spongycastle/math/ntru/polynomial/Polynomial;

    if-nez v2, :cond_6

    .line 184
    iget-object v2, p1, Lorg/spongycastle/crypto/params/NTRUEncryptionPrivateKeyParameters;->c:Lorg/spongycastle/math/ntru/polynomial/Polynomial;

    if-eqz v2, :cond_7

    move v0, v1

    .line 186
    goto :goto_0

    .line 189
    :cond_6
    iget-object v2, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionPrivateKeyParameters;->c:Lorg/spongycastle/math/ntru/polynomial/Polynomial;

    iget-object v3, p1, Lorg/spongycastle/crypto/params/NTRUEncryptionPrivateKeyParameters;->c:Lorg/spongycastle/math/ntru/polynomial/Polynomial;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_7

    move v0, v1

    .line 191
    goto :goto_0

    .line 193
    :cond_7
    iget-object v2, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionPrivateKeyParameters;->e:Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;

    iget-object v3, p1, Lorg/spongycastle/crypto/params/NTRUEncryptionPrivateKeyParameters;->e:Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;

    invoke-virtual {v2, v3}, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    move v0, v1

    .line 195
    goto :goto_0
.end method

.method public hashCode()I
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 148
    iget-object v0, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionPrivateKeyParameters;->b:Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;

    if-nez v0, :cond_0

    move v0, v1

    :goto_0
    add-int/lit8 v0, v0, 0x1f

    .line 151
    mul-int/lit8 v2, v0, 0x1f

    iget-object v0, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionPrivateKeyParameters;->c:Lorg/spongycastle/math/ntru/polynomial/Polynomial;

    if-nez v0, :cond_1

    move v0, v1

    :goto_1
    add-int/2addr v0, v2

    .line 152
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionPrivateKeyParameters;->e:Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;

    if-nez v2, :cond_2

    :goto_2
    add-int/2addr v0, v1

    .line 153
    return v0

    .line 148
    :cond_0
    iget-object v0, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionPrivateKeyParameters;->b:Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;

    invoke-virtual {v0}, Lorg/spongycastle/crypto/params/NTRUEncryptionParameters;->hashCode()I

    move-result v0

    goto :goto_0

    .line 151
    :cond_1
    iget-object v0, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionPrivateKeyParameters;->c:Lorg/spongycastle/math/ntru/polynomial/Polynomial;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    goto :goto_1

    .line 152
    :cond_2
    iget-object v1, p0, Lorg/spongycastle/crypto/params/NTRUEncryptionPrivateKeyParameters;->e:Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    goto :goto_2
.end method
