.class public Lorg/spongycastle/crypto/params/DHValidationParameters;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:[B

.field private b:I


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 31
    instance-of v1, p1, Lorg/spongycastle/crypto/params/DHValidationParameters;

    if-nez v1, :cond_1

    .line 43
    :cond_0
    :goto_0
    return v0

    .line 36
    :cond_1
    check-cast p1, Lorg/spongycastle/crypto/params/DHValidationParameters;

    .line 38
    iget v1, p1, Lorg/spongycastle/crypto/params/DHValidationParameters;->b:I

    iget v2, p0, Lorg/spongycastle/crypto/params/DHValidationParameters;->b:I

    if-ne v1, v2, :cond_0

    .line 43
    iget-object v0, p0, Lorg/spongycastle/crypto/params/DHValidationParameters;->a:[B

    iget-object v1, p1, Lorg/spongycastle/crypto/params/DHValidationParameters;->a:[B

    invoke-static {v0, v1}, Lorg/spongycastle/util/Arrays;->a([B[B)Z

    move-result v0

    goto :goto_0
.end method

.method public hashCode()I
    .locals 2

    .prologue
    .line 48
    iget v0, p0, Lorg/spongycastle/crypto/params/DHValidationParameters;->b:I

    iget-object v1, p0, Lorg/spongycastle/crypto/params/DHValidationParameters;->a:[B

    invoke-static {v1}, Lorg/spongycastle/util/Arrays;->a([B)I

    move-result v1

    xor-int/2addr v0, v1

    return v0
.end method
