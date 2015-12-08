.class public Lorg/spongycastle/crypto/params/GOST3410ValidationParameters;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:I

.field private b:I

.field private c:J

.field private d:J


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 6

    .prologue
    const/4 v0, 0x0

    .line 50
    instance-of v1, p1, Lorg/spongycastle/crypto/params/GOST3410ValidationParameters;

    if-nez v1, :cond_1

    .line 77
    :cond_0
    :goto_0
    return v0

    .line 55
    :cond_1
    check-cast p1, Lorg/spongycastle/crypto/params/GOST3410ValidationParameters;

    .line 57
    iget v1, p1, Lorg/spongycastle/crypto/params/GOST3410ValidationParameters;->b:I

    iget v2, p0, Lorg/spongycastle/crypto/params/GOST3410ValidationParameters;->b:I

    if-ne v1, v2, :cond_0

    .line 62
    iget v1, p1, Lorg/spongycastle/crypto/params/GOST3410ValidationParameters;->a:I

    iget v2, p0, Lorg/spongycastle/crypto/params/GOST3410ValidationParameters;->a:I

    if-ne v1, v2, :cond_0

    .line 67
    iget-wide v2, p1, Lorg/spongycastle/crypto/params/GOST3410ValidationParameters;->d:J

    iget-wide v4, p0, Lorg/spongycastle/crypto/params/GOST3410ValidationParameters;->d:J

    cmp-long v1, v2, v4

    if-nez v1, :cond_0

    .line 72
    iget-wide v2, p1, Lorg/spongycastle/crypto/params/GOST3410ValidationParameters;->c:J

    iget-wide v4, p0, Lorg/spongycastle/crypto/params/GOST3410ValidationParameters;->c:J

    cmp-long v1, v2, v4

    if-nez v1, :cond_0

    .line 77
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public hashCode()I
    .locals 5

    .prologue
    const/16 v4, 0x20

    .line 82
    iget v0, p0, Lorg/spongycastle/crypto/params/GOST3410ValidationParameters;->a:I

    iget v1, p0, Lorg/spongycastle/crypto/params/GOST3410ValidationParameters;->b:I

    xor-int/2addr v0, v1

    iget-wide v2, p0, Lorg/spongycastle/crypto/params/GOST3410ValidationParameters;->c:J

    long-to-int v1, v2

    xor-int/2addr v0, v1

    iget-wide v2, p0, Lorg/spongycastle/crypto/params/GOST3410ValidationParameters;->c:J

    shr-long/2addr v2, v4

    long-to-int v1, v2

    xor-int/2addr v0, v1

    iget-wide v2, p0, Lorg/spongycastle/crypto/params/GOST3410ValidationParameters;->d:J

    long-to-int v1, v2

    xor-int/2addr v0, v1

    iget-wide v2, p0, Lorg/spongycastle/crypto/params/GOST3410ValidationParameters;->d:J

    shr-long/2addr v2, v4

    long-to-int v1, v2

    xor-int/2addr v0, v1

    return v0
.end method
