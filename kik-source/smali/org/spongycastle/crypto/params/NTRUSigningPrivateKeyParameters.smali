.class public Lorg/spongycastle/crypto/params/NTRUSigningPrivateKeyParameters;
.super Lorg/spongycastle/crypto/params/AsymmetricKeyParameter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/spongycastle/crypto/params/NTRUSigningPrivateKeyParameters$Basis;
    }
.end annotation


# instance fields
.field private b:Ljava/util/List;


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 7

    .prologue
    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 139
    if-ne p0, p1, :cond_1

    move v3, v4

    .line 184
    :cond_0
    :goto_0
    return v3

    .line 143
    :cond_1
    if-eqz p1, :cond_0

    .line 147
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    if-ne v0, v1, :cond_0

    .line 151
    check-cast p1, Lorg/spongycastle/crypto/params/NTRUSigningPrivateKeyParameters;

    .line 152
    iget-object v0, p0, Lorg/spongycastle/crypto/params/NTRUSigningPrivateKeyParameters;->b:Ljava/util/List;

    if-nez v0, :cond_2

    .line 154
    iget-object v0, p1, Lorg/spongycastle/crypto/params/NTRUSigningPrivateKeyParameters;->b:Ljava/util/List;

    if-nez v0, :cond_0

    .line 159
    :cond_2
    iget-object v0, p0, Lorg/spongycastle/crypto/params/NTRUSigningPrivateKeyParameters;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iget-object v1, p1, Lorg/spongycastle/crypto/params/NTRUSigningPrivateKeyParameters;->b:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ne v0, v1, :cond_0

    move v2, v3

    .line 163
    :goto_1
    iget-object v0, p0, Lorg/spongycastle/crypto/params/NTRUSigningPrivateKeyParameters;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v2, v0, :cond_4

    .line 165
    iget-object v0, p0, Lorg/spongycastle/crypto/params/NTRUSigningPrivateKeyParameters;->b:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/crypto/params/NTRUSigningPrivateKeyParameters$Basis;

    .line 166
    iget-object v1, p1, Lorg/spongycastle/crypto/params/NTRUSigningPrivateKeyParameters;->b:Ljava/util/List;

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/spongycastle/crypto/params/NTRUSigningPrivateKeyParameters$Basis;

    .line 167
    iget-object v5, v0, Lorg/spongycastle/crypto/params/NTRUSigningPrivateKeyParameters$Basis;->a:Lorg/spongycastle/math/ntru/polynomial/Polynomial;

    iget-object v6, v1, Lorg/spongycastle/crypto/params/NTRUSigningPrivateKeyParameters$Basis;->a:Lorg/spongycastle/math/ntru/polynomial/Polynomial;

    invoke-virtual {v5, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    .line 171
    iget-object v5, v0, Lorg/spongycastle/crypto/params/NTRUSigningPrivateKeyParameters$Basis;->b:Lorg/spongycastle/math/ntru/polynomial/Polynomial;

    iget-object v6, v1, Lorg/spongycastle/crypto/params/NTRUSigningPrivateKeyParameters$Basis;->b:Lorg/spongycastle/math/ntru/polynomial/Polynomial;

    invoke-virtual {v5, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    .line 175
    if-eqz v2, :cond_3

    iget-object v5, v0, Lorg/spongycastle/crypto/params/NTRUSigningPrivateKeyParameters$Basis;->c:Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;

    iget-object v6, v1, Lorg/spongycastle/crypto/params/NTRUSigningPrivateKeyParameters$Basis;->c:Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;

    invoke-virtual {v5, v6}, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    .line 179
    :cond_3
    iget-object v0, v0, Lorg/spongycastle/crypto/params/NTRUSigningPrivateKeyParameters$Basis;->d:Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;

    iget-object v1, v1, Lorg/spongycastle/crypto/params/NTRUSigningPrivateKeyParameters$Basis;->d:Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;

    invoke-virtual {v0, v1}, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 163
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_1

    :cond_4
    move v3, v4

    .line 184
    goto :goto_0
.end method

.method public hashCode()I
    .locals 3

    .prologue
    .line 126
    iget-object v0, p0, Lorg/spongycastle/crypto/params/NTRUSigningPrivateKeyParameters;->b:Ljava/util/List;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    add-int/lit8 v0, v0, 0x1f

    .line 129
    iget-object v1, p0, Lorg/spongycastle/crypto/params/NTRUSigningPrivateKeyParameters;->b:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    move v1, v0

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/crypto/params/NTRUSigningPrivateKeyParameters$Basis;

    .line 131
    invoke-virtual {v0}, Lorg/spongycastle/crypto/params/NTRUSigningPrivateKeyParameters$Basis;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    move v1, v0

    goto :goto_1

    .line 126
    :cond_0
    iget-object v0, p0, Lorg/spongycastle/crypto/params/NTRUSigningPrivateKeyParameters;->b:Ljava/util/List;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    goto :goto_0

    .line 133
    :cond_1
    return v1
.end method
