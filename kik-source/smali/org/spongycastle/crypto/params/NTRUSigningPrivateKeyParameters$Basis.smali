.class public Lorg/spongycastle/crypto/params/NTRUSigningPrivateKeyParameters$Basis;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/spongycastle/crypto/params/NTRUSigningPrivateKeyParameters;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Basis"
.end annotation


# instance fields
.field public a:Lorg/spongycastle/math/ntru/polynomial/Polynomial;

.field public b:Lorg/spongycastle/math/ntru/polynomial/Polynomial;

.field public c:Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;

.field d:Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 324
    if-ne p0, p1, :cond_1

    .line 381
    :cond_0
    :goto_0
    return v0

    .line 328
    :cond_1
    if-nez p1, :cond_2

    move v0, v1

    .line 330
    goto :goto_0

    .line 332
    :cond_2
    instance-of v2, p1, Lorg/spongycastle/crypto/params/NTRUSigningPrivateKeyParameters$Basis;

    if-nez v2, :cond_3

    move v0, v1

    .line 334
    goto :goto_0

    .line 336
    :cond_3
    check-cast p1, Lorg/spongycastle/crypto/params/NTRUSigningPrivateKeyParameters$Basis;

    .line 337
    iget-object v2, p0, Lorg/spongycastle/crypto/params/NTRUSigningPrivateKeyParameters$Basis;->a:Lorg/spongycastle/math/ntru/polynomial/Polynomial;

    if-nez v2, :cond_4

    .line 339
    iget-object v2, p1, Lorg/spongycastle/crypto/params/NTRUSigningPrivateKeyParameters$Basis;->a:Lorg/spongycastle/math/ntru/polynomial/Polynomial;

    if-eqz v2, :cond_5

    move v0, v1

    .line 341
    goto :goto_0

    .line 344
    :cond_4
    iget-object v2, p0, Lorg/spongycastle/crypto/params/NTRUSigningPrivateKeyParameters$Basis;->a:Lorg/spongycastle/math/ntru/polynomial/Polynomial;

    iget-object v3, p1, Lorg/spongycastle/crypto/params/NTRUSigningPrivateKeyParameters$Basis;->a:Lorg/spongycastle/math/ntru/polynomial/Polynomial;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    move v0, v1

    .line 346
    goto :goto_0

    .line 348
    :cond_5
    iget-object v2, p0, Lorg/spongycastle/crypto/params/NTRUSigningPrivateKeyParameters$Basis;->b:Lorg/spongycastle/math/ntru/polynomial/Polynomial;

    if-nez v2, :cond_6

    .line 350
    iget-object v2, p1, Lorg/spongycastle/crypto/params/NTRUSigningPrivateKeyParameters$Basis;->b:Lorg/spongycastle/math/ntru/polynomial/Polynomial;

    if-eqz v2, :cond_7

    move v0, v1

    .line 352
    goto :goto_0

    .line 355
    :cond_6
    iget-object v2, p0, Lorg/spongycastle/crypto/params/NTRUSigningPrivateKeyParameters$Basis;->b:Lorg/spongycastle/math/ntru/polynomial/Polynomial;

    iget-object v3, p1, Lorg/spongycastle/crypto/params/NTRUSigningPrivateKeyParameters$Basis;->b:Lorg/spongycastle/math/ntru/polynomial/Polynomial;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_7

    move v0, v1

    .line 357
    goto :goto_0

    .line 359
    :cond_7
    iget-object v2, p0, Lorg/spongycastle/crypto/params/NTRUSigningPrivateKeyParameters$Basis;->c:Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;

    if-nez v2, :cond_8

    .line 361
    iget-object v2, p1, Lorg/spongycastle/crypto/params/NTRUSigningPrivateKeyParameters$Basis;->c:Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;

    if-eqz v2, :cond_9

    move v0, v1

    .line 363
    goto :goto_0

    .line 366
    :cond_8
    iget-object v2, p0, Lorg/spongycastle/crypto/params/NTRUSigningPrivateKeyParameters$Basis;->c:Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;

    iget-object v3, p1, Lorg/spongycastle/crypto/params/NTRUSigningPrivateKeyParameters$Basis;->c:Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;

    invoke-virtual {v2, v3}, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_9

    move v0, v1

    .line 368
    goto :goto_0

    .line 370
    :cond_9
    iget-object v2, p0, Lorg/spongycastle/crypto/params/NTRUSigningPrivateKeyParameters$Basis;->d:Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;

    if-nez v2, :cond_a

    .line 372
    iget-object v2, p1, Lorg/spongycastle/crypto/params/NTRUSigningPrivateKeyParameters$Basis;->d:Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;

    if-eqz v2, :cond_0

    move v0, v1

    .line 374
    goto :goto_0

    .line 377
    :cond_a
    iget-object v2, p0, Lorg/spongycastle/crypto/params/NTRUSigningPrivateKeyParameters$Basis;->d:Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;

    iget-object v3, p1, Lorg/spongycastle/crypto/params/NTRUSigningPrivateKeyParameters$Basis;->d:Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;

    invoke-virtual {v2, v3}, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    move v0, v1

    .line 379
    goto :goto_0
.end method

.method public hashCode()I
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 312
    iget-object v0, p0, Lorg/spongycastle/crypto/params/NTRUSigningPrivateKeyParameters$Basis;->a:Lorg/spongycastle/math/ntru/polynomial/Polynomial;

    if-nez v0, :cond_0

    move v0, v1

    :goto_0
    add-int/lit8 v0, v0, 0x1f

    .line 315
    mul-int/lit8 v2, v0, 0x1f

    iget-object v0, p0, Lorg/spongycastle/crypto/params/NTRUSigningPrivateKeyParameters$Basis;->b:Lorg/spongycastle/math/ntru/polynomial/Polynomial;

    if-nez v0, :cond_1

    move v0, v1

    :goto_1
    add-int/2addr v0, v2

    .line 316
    mul-int/lit8 v2, v0, 0x1f

    iget-object v0, p0, Lorg/spongycastle/crypto/params/NTRUSigningPrivateKeyParameters$Basis;->c:Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;

    if-nez v0, :cond_2

    move v0, v1

    :goto_2
    add-int/2addr v0, v2

    .line 317
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lorg/spongycastle/crypto/params/NTRUSigningPrivateKeyParameters$Basis;->d:Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;

    if-nez v2, :cond_3

    :goto_3
    add-int/2addr v0, v1

    .line 318
    return v0

    .line 312
    :cond_0
    iget-object v0, p0, Lorg/spongycastle/crypto/params/NTRUSigningPrivateKeyParameters$Basis;->a:Lorg/spongycastle/math/ntru/polynomial/Polynomial;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    goto :goto_0

    .line 315
    :cond_1
    iget-object v0, p0, Lorg/spongycastle/crypto/params/NTRUSigningPrivateKeyParameters$Basis;->b:Lorg/spongycastle/math/ntru/polynomial/Polynomial;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    goto :goto_1

    .line 316
    :cond_2
    iget-object v0, p0, Lorg/spongycastle/crypto/params/NTRUSigningPrivateKeyParameters$Basis;->c:Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    goto :goto_2

    .line 317
    :cond_3
    iget-object v1, p0, Lorg/spongycastle/crypto/params/NTRUSigningPrivateKeyParameters$Basis;->d:Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;

    invoke-virtual {v1}, Lorg/spongycastle/crypto/params/NTRUSigningKeyGenerationParameters;->hashCode()I

    move-result v1

    goto :goto_3
.end method
