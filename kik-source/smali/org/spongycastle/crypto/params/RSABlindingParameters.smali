.class public Lorg/spongycastle/crypto/params/RSABlindingParameters;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/spongycastle/crypto/CipherParameters;


# instance fields
.field private a:Lorg/spongycastle/crypto/params/RSAKeyParameters;

.field private b:Ljava/math/BigInteger;


# virtual methods
.method public final a()Lorg/spongycastle/crypto/params/RSAKeyParameters;
    .locals 1

    .prologue
    .line 28
    iget-object v0, p0, Lorg/spongycastle/crypto/params/RSABlindingParameters;->a:Lorg/spongycastle/crypto/params/RSAKeyParameters;

    return-object v0
.end method

.method public final b()Ljava/math/BigInteger;
    .locals 1

    .prologue
    .line 33
    iget-object v0, p0, Lorg/spongycastle/crypto/params/RSABlindingParameters;->b:Ljava/math/BigInteger;

    return-object v0
.end method
