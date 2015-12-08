.class public Lorg/spongycastle/crypto/generators/ECKeyPairGenerator;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/spongycastle/crypto/AsymmetricCipherKeyPairGenerator;
.implements Lorg/spongycastle/math/ec/ECConstants;


# instance fields
.field a:Lorg/spongycastle/crypto/params/ECDomainParameters;

.field b:Ljava/security/SecureRandom;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lorg/spongycastle/crypto/AsymmetricCipherKeyPair;
    .locals 5

    .prologue
    .line 37
    iget-object v0, p0, Lorg/spongycastle/crypto/generators/ECKeyPairGenerator;->a:Lorg/spongycastle/crypto/params/ECDomainParameters;

    invoke-virtual {v0}, Lorg/spongycastle/crypto/params/ECDomainParameters;->c()Ljava/math/BigInteger;

    move-result-object v0

    .line 38
    invoke-virtual {v0}, Ljava/math/BigInteger;->bitLength()I

    move-result v1

    .line 43
    :cond_0
    new-instance v2, Ljava/math/BigInteger;

    iget-object v3, p0, Lorg/spongycastle/crypto/generators/ECKeyPairGenerator;->b:Ljava/security/SecureRandom;

    invoke-direct {v2, v1, v3}, Ljava/math/BigInteger;-><init>(ILjava/util/Random;)V

    .line 45
    sget-object v3, Lorg/spongycastle/crypto/generators/ECKeyPairGenerator;->f:Ljava/math/BigInteger;

    invoke-virtual {v2, v3}, Ljava/math/BigInteger;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    invoke-virtual {v2, v0}, Ljava/math/BigInteger;->compareTo(Ljava/math/BigInteger;)I

    move-result v3

    if-gez v3, :cond_0

    .line 47
    iget-object v0, p0, Lorg/spongycastle/crypto/generators/ECKeyPairGenerator;->a:Lorg/spongycastle/crypto/params/ECDomainParameters;

    invoke-virtual {v0}, Lorg/spongycastle/crypto/params/ECDomainParameters;->b()Lorg/spongycastle/math/ec/ECPoint;

    move-result-object v0

    invoke-virtual {v0, v2}, Lorg/spongycastle/math/ec/ECPoint;->a(Ljava/math/BigInteger;)Lorg/spongycastle/math/ec/ECPoint;

    move-result-object v0

    .line 49
    new-instance v1, Lorg/spongycastle/crypto/AsymmetricCipherKeyPair;

    new-instance v3, Lorg/spongycastle/crypto/params/ECPublicKeyParameters;

    iget-object v4, p0, Lorg/spongycastle/crypto/generators/ECKeyPairGenerator;->a:Lorg/spongycastle/crypto/params/ECDomainParameters;

    invoke-direct {v3, v0, v4}, Lorg/spongycastle/crypto/params/ECPublicKeyParameters;-><init>(Lorg/spongycastle/math/ec/ECPoint;Lorg/spongycastle/crypto/params/ECDomainParameters;)V

    new-instance v0, Lorg/spongycastle/crypto/params/ECPrivateKeyParameters;

    iget-object v4, p0, Lorg/spongycastle/crypto/generators/ECKeyPairGenerator;->a:Lorg/spongycastle/crypto/params/ECDomainParameters;

    invoke-direct {v0, v2, v4}, Lorg/spongycastle/crypto/params/ECPrivateKeyParameters;-><init>(Ljava/math/BigInteger;Lorg/spongycastle/crypto/params/ECDomainParameters;)V

    invoke-direct {v1, v3, v0}, Lorg/spongycastle/crypto/AsymmetricCipherKeyPair;-><init>(Lorg/spongycastle/crypto/CipherParameters;Lorg/spongycastle/crypto/CipherParameters;)V

    return-object v1
.end method

.method public final a(Lorg/spongycastle/crypto/KeyGenerationParameters;)V
    .locals 1

    .prologue
    .line 25
    check-cast p1, Lorg/spongycastle/crypto/params/ECKeyGenerationParameters;

    .line 27
    invoke-virtual {p1}, Lorg/spongycastle/crypto/params/ECKeyGenerationParameters;->a()Ljava/security/SecureRandom;

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/crypto/generators/ECKeyPairGenerator;->b:Ljava/security/SecureRandom;

    .line 28
    invoke-virtual {p1}, Lorg/spongycastle/crypto/params/ECKeyGenerationParameters;->c()Lorg/spongycastle/crypto/params/ECDomainParameters;

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/crypto/generators/ECKeyPairGenerator;->a:Lorg/spongycastle/crypto/params/ECDomainParameters;

    .line 29
    return-void
.end method
