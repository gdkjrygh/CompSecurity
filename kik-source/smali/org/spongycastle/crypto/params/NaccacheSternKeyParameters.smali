.class public Lorg/spongycastle/crypto/params/NaccacheSternKeyParameters;
.super Lorg/spongycastle/crypto/params/AsymmetricKeyParameter;
.source "SourceFile"


# instance fields
.field b:I

.field private c:Ljava/math/BigInteger;

.field private d:Ljava/math/BigInteger;


# virtual methods
.method public final b()Ljava/math/BigInteger;
    .locals 1

    .prologue
    .line 34
    iget-object v0, p0, Lorg/spongycastle/crypto/params/NaccacheSternKeyParameters;->c:Ljava/math/BigInteger;

    return-object v0
.end method

.method public final c()I
    .locals 1

    .prologue
    .line 42
    iget v0, p0, Lorg/spongycastle/crypto/params/NaccacheSternKeyParameters;->b:I

    return v0
.end method

.method public final d()Ljava/math/BigInteger;
    .locals 1

    .prologue
    .line 50
    iget-object v0, p0, Lorg/spongycastle/crypto/params/NaccacheSternKeyParameters;->d:Ljava/math/BigInteger;

    return-object v0
.end method
