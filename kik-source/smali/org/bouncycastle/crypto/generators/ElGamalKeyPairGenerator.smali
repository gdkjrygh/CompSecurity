.class public Lorg/bouncycastle/crypto/generators/ElGamalKeyPairGenerator;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/bouncycastle/crypto/AsymmetricCipherKeyPairGenerator;


# instance fields
.field private a:Lorg/bouncycastle/crypto/params/ElGamalKeyGenerationParameters;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public generateKeyPair()Lorg/bouncycastle/crypto/AsymmetricCipherKeyPair;
    .locals 7

    sget-object v0, Lorg/bouncycastle/crypto/generators/a;->a:Lorg/bouncycastle/crypto/generators/a;

    iget-object v1, p0, Lorg/bouncycastle/crypto/generators/ElGamalKeyPairGenerator;->a:Lorg/bouncycastle/crypto/params/ElGamalKeyGenerationParameters;

    invoke-virtual {v1}, Lorg/bouncycastle/crypto/params/ElGamalKeyGenerationParameters;->getParameters()Lorg/bouncycastle/crypto/params/ElGamalParameters;

    move-result-object v1

    new-instance v2, Lorg/bouncycastle/crypto/params/DHParameters;

    invoke-virtual {v1}, Lorg/bouncycastle/crypto/params/ElGamalParameters;->getP()Ljava/math/BigInteger;

    move-result-object v3

    invoke-virtual {v1}, Lorg/bouncycastle/crypto/params/ElGamalParameters;->getG()Ljava/math/BigInteger;

    move-result-object v4

    const/4 v5, 0x0

    invoke-virtual {v1}, Lorg/bouncycastle/crypto/params/ElGamalParameters;->getL()I

    move-result v6

    invoke-direct {v2, v3, v4, v5, v6}, Lorg/bouncycastle/crypto/params/DHParameters;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;I)V

    iget-object v3, p0, Lorg/bouncycastle/crypto/generators/ElGamalKeyPairGenerator;->a:Lorg/bouncycastle/crypto/params/ElGamalKeyGenerationParameters;

    invoke-virtual {v3}, Lorg/bouncycastle/crypto/params/ElGamalKeyGenerationParameters;->getRandom()Ljava/security/SecureRandom;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Lorg/bouncycastle/crypto/generators/a;->calculatePrivate(Lorg/bouncycastle/crypto/params/DHParameters;Ljava/security/SecureRandom;)Ljava/math/BigInteger;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Lorg/bouncycastle/crypto/generators/a;->calculatePublic(Lorg/bouncycastle/crypto/params/DHParameters;Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    new-instance v2, Lorg/bouncycastle/crypto/AsymmetricCipherKeyPair;

    new-instance v4, Lorg/bouncycastle/crypto/params/ElGamalPublicKeyParameters;

    invoke-direct {v4, v0, v1}, Lorg/bouncycastle/crypto/params/ElGamalPublicKeyParameters;-><init>(Ljava/math/BigInteger;Lorg/bouncycastle/crypto/params/ElGamalParameters;)V

    new-instance v0, Lorg/bouncycastle/crypto/params/ElGamalPrivateKeyParameters;

    invoke-direct {v0, v3, v1}, Lorg/bouncycastle/crypto/params/ElGamalPrivateKeyParameters;-><init>(Ljava/math/BigInteger;Lorg/bouncycastle/crypto/params/ElGamalParameters;)V

    invoke-direct {v2, v4, v0}, Lorg/bouncycastle/crypto/AsymmetricCipherKeyPair;-><init>(Lorg/bouncycastle/crypto/CipherParameters;Lorg/bouncycastle/crypto/CipherParameters;)V

    return-object v2
.end method

.method public init(Lorg/bouncycastle/crypto/KeyGenerationParameters;)V
    .locals 0

    check-cast p1, Lorg/bouncycastle/crypto/params/ElGamalKeyGenerationParameters;

    iput-object p1, p0, Lorg/bouncycastle/crypto/generators/ElGamalKeyPairGenerator;->a:Lorg/bouncycastle/crypto/params/ElGamalKeyGenerationParameters;

    return-void
.end method
