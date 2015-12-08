.class public Lorg/spongycastle/jcajce/provider/asymmetric/elgamal/KeyPairGeneratorSpi;
.super Ljava/security/KeyPairGenerator;
.source "SourceFile"


# instance fields
.field a:Lorg/spongycastle/crypto/params/ElGamalKeyGenerationParameters;

.field b:Lorg/spongycastle/crypto/generators/ElGamalKeyPairGenerator;

.field c:I

.field d:I

.field e:Ljava/security/SecureRandom;

.field f:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 32
    const-string v0, "ElGamal"

    invoke-direct {p0, v0}, Ljava/security/KeyPairGenerator;-><init>(Ljava/lang/String;)V

    .line 24
    new-instance v0, Lorg/spongycastle/crypto/generators/ElGamalKeyPairGenerator;

    invoke-direct {v0}, Lorg/spongycastle/crypto/generators/ElGamalKeyPairGenerator;-><init>()V

    iput-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/elgamal/KeyPairGeneratorSpi;->b:Lorg/spongycastle/crypto/generators/ElGamalKeyPairGenerator;

    .line 25
    const/16 v0, 0x400

    iput v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/elgamal/KeyPairGeneratorSpi;->c:I

    .line 26
    const/16 v0, 0x14

    iput v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/elgamal/KeyPairGeneratorSpi;->d:I

    .line 27
    new-instance v0, Ljava/security/SecureRandom;

    invoke-direct {v0}, Ljava/security/SecureRandom;-><init>()V

    iput-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/elgamal/KeyPairGeneratorSpi;->e:Ljava/security/SecureRandom;

    .line 28
    const/4 v0, 0x0

    iput-boolean v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/elgamal/KeyPairGeneratorSpi;->f:Z

    .line 33
    return-void
.end method


# virtual methods
.method public generateKeyPair()Ljava/security/KeyPair;
    .locals 6

    .prologue
    .line 72
    iget-boolean v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/elgamal/KeyPairGeneratorSpi;->f:Z

    if-nez v0, :cond_0

    .line 74
    sget-object v0, Lorg/spongycastle/jce/provider/BouncyCastleProvider;->b:Lorg/spongycastle/jcajce/provider/config/ProviderConfiguration;

    invoke-interface {v0}, Lorg/spongycastle/jcajce/provider/config/ProviderConfiguration;->b()Ljavax/crypto/spec/DHParameterSpec;

    move-result-object v0

    .line 76
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljavax/crypto/spec/DHParameterSpec;->getP()Ljava/math/BigInteger;

    move-result-object v1

    invoke-virtual {v1}, Ljava/math/BigInteger;->bitLength()I

    move-result v1

    iget v2, p0, Lorg/spongycastle/jcajce/provider/asymmetric/elgamal/KeyPairGeneratorSpi;->c:I

    if-ne v1, v2, :cond_1

    .line 78
    new-instance v1, Lorg/spongycastle/crypto/params/ElGamalKeyGenerationParameters;

    iget-object v2, p0, Lorg/spongycastle/jcajce/provider/asymmetric/elgamal/KeyPairGeneratorSpi;->e:Ljava/security/SecureRandom;

    new-instance v3, Lorg/spongycastle/crypto/params/ElGamalParameters;

    invoke-virtual {v0}, Ljavax/crypto/spec/DHParameterSpec;->getP()Ljava/math/BigInteger;

    move-result-object v4

    invoke-virtual {v0}, Ljavax/crypto/spec/DHParameterSpec;->getG()Ljava/math/BigInteger;

    move-result-object v5

    invoke-virtual {v0}, Ljavax/crypto/spec/DHParameterSpec;->getL()I

    move-result v0

    invoke-direct {v3, v4, v5, v0}, Lorg/spongycastle/crypto/params/ElGamalParameters;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V

    invoke-direct {v1, v2, v3}, Lorg/spongycastle/crypto/params/ElGamalKeyGenerationParameters;-><init>(Ljava/security/SecureRandom;Lorg/spongycastle/crypto/params/ElGamalParameters;)V

    iput-object v1, p0, Lorg/spongycastle/jcajce/provider/asymmetric/elgamal/KeyPairGeneratorSpi;->a:Lorg/spongycastle/crypto/params/ElGamalKeyGenerationParameters;

    .line 88
    :goto_0
    iget-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/elgamal/KeyPairGeneratorSpi;->b:Lorg/spongycastle/crypto/generators/ElGamalKeyPairGenerator;

    iget-object v1, p0, Lorg/spongycastle/jcajce/provider/asymmetric/elgamal/KeyPairGeneratorSpi;->a:Lorg/spongycastle/crypto/params/ElGamalKeyGenerationParameters;

    invoke-virtual {v0, v1}, Lorg/spongycastle/crypto/generators/ElGamalKeyPairGenerator;->a(Lorg/spongycastle/crypto/KeyGenerationParameters;)V

    .line 89
    const/4 v0, 0x1

    iput-boolean v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/elgamal/KeyPairGeneratorSpi;->f:Z

    .line 92
    :cond_0
    iget-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/elgamal/KeyPairGeneratorSpi;->b:Lorg/spongycastle/crypto/generators/ElGamalKeyPairGenerator;

    invoke-virtual {v0}, Lorg/spongycastle/crypto/generators/ElGamalKeyPairGenerator;->a()Lorg/spongycastle/crypto/AsymmetricCipherKeyPair;

    move-result-object v1

    .line 93
    invoke-virtual {v1}, Lorg/spongycastle/crypto/AsymmetricCipherKeyPair;->a()Lorg/spongycastle/crypto/CipherParameters;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/crypto/params/ElGamalPublicKeyParameters;

    .line 94
    invoke-virtual {v1}, Lorg/spongycastle/crypto/AsymmetricCipherKeyPair;->b()Lorg/spongycastle/crypto/CipherParameters;

    move-result-object v1

    check-cast v1, Lorg/spongycastle/crypto/params/ElGamalPrivateKeyParameters;

    .line 96
    new-instance v2, Ljava/security/KeyPair;

    new-instance v3, Lorg/spongycastle/jcajce/provider/asymmetric/elgamal/BCElGamalPublicKey;

    invoke-direct {v3, v0}, Lorg/spongycastle/jcajce/provider/asymmetric/elgamal/BCElGamalPublicKey;-><init>(Lorg/spongycastle/crypto/params/ElGamalPublicKeyParameters;)V

    new-instance v0, Lorg/spongycastle/jcajce/provider/asymmetric/elgamal/BCElGamalPrivateKey;

    invoke-direct {v0, v1}, Lorg/spongycastle/jcajce/provider/asymmetric/elgamal/BCElGamalPrivateKey;-><init>(Lorg/spongycastle/crypto/params/ElGamalPrivateKeyParameters;)V

    invoke-direct {v2, v3, v0}, Ljava/security/KeyPair;-><init>(Ljava/security/PublicKey;Ljava/security/PrivateKey;)V

    return-object v2

    .line 82
    :cond_1
    new-instance v0, Lorg/spongycastle/crypto/generators/ElGamalParametersGenerator;

    invoke-direct {v0}, Lorg/spongycastle/crypto/generators/ElGamalParametersGenerator;-><init>()V

    .line 84
    iget v1, p0, Lorg/spongycastle/jcajce/provider/asymmetric/elgamal/KeyPairGeneratorSpi;->c:I

    iget v2, p0, Lorg/spongycastle/jcajce/provider/asymmetric/elgamal/KeyPairGeneratorSpi;->d:I

    iget-object v3, p0, Lorg/spongycastle/jcajce/provider/asymmetric/elgamal/KeyPairGeneratorSpi;->e:Ljava/security/SecureRandom;

    invoke-virtual {v0, v1, v2, v3}, Lorg/spongycastle/crypto/generators/ElGamalParametersGenerator;->a(IILjava/security/SecureRandom;)V

    .line 85
    new-instance v1, Lorg/spongycastle/crypto/params/ElGamalKeyGenerationParameters;

    iget-object v2, p0, Lorg/spongycastle/jcajce/provider/asymmetric/elgamal/KeyPairGeneratorSpi;->e:Ljava/security/SecureRandom;

    invoke-virtual {v0}, Lorg/spongycastle/crypto/generators/ElGamalParametersGenerator;->a()Lorg/spongycastle/crypto/params/ElGamalParameters;

    move-result-object v0

    invoke-direct {v1, v2, v0}, Lorg/spongycastle/crypto/params/ElGamalKeyGenerationParameters;-><init>(Ljava/security/SecureRandom;Lorg/spongycastle/crypto/params/ElGamalParameters;)V

    iput-object v1, p0, Lorg/spongycastle/jcajce/provider/asymmetric/elgamal/KeyPairGeneratorSpi;->a:Lorg/spongycastle/crypto/params/ElGamalKeyGenerationParameters;

    goto :goto_0
.end method

.method public initialize(ILjava/security/SecureRandom;)V
    .locals 0

    .prologue
    .line 39
    iput p1, p0, Lorg/spongycastle/jcajce/provider/asymmetric/elgamal/KeyPairGeneratorSpi;->c:I

    .line 40
    iput-object p2, p0, Lorg/spongycastle/jcajce/provider/asymmetric/elgamal/KeyPairGeneratorSpi;->e:Ljava/security/SecureRandom;

    .line 41
    return-void
.end method

.method public initialize(Ljava/security/spec/AlgorithmParameterSpec;Ljava/security/SecureRandom;)V
    .locals 5

    .prologue
    .line 48
    instance-of v0, p1, Lorg/spongycastle/jce/spec/ElGamalParameterSpec;

    if-nez v0, :cond_0

    instance-of v0, p1, Ljavax/crypto/spec/DHParameterSpec;

    if-nez v0, :cond_0

    .line 50
    new-instance v0, Ljava/security/InvalidAlgorithmParameterException;

    const-string v1, "parameter object not a DHParameterSpec or an ElGamalParameterSpec"

    invoke-direct {v0, v1}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 53
    :cond_0
    instance-of v0, p1, Lorg/spongycastle/jce/spec/ElGamalParameterSpec;

    if-eqz v0, :cond_1

    .line 55
    check-cast p1, Lorg/spongycastle/jce/spec/ElGamalParameterSpec;

    .line 57
    new-instance v0, Lorg/spongycastle/crypto/params/ElGamalKeyGenerationParameters;

    new-instance v1, Lorg/spongycastle/crypto/params/ElGamalParameters;

    invoke-virtual {p1}, Lorg/spongycastle/jce/spec/ElGamalParameterSpec;->a()Ljava/math/BigInteger;

    move-result-object v2

    invoke-virtual {p1}, Lorg/spongycastle/jce/spec/ElGamalParameterSpec;->b()Ljava/math/BigInteger;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lorg/spongycastle/crypto/params/ElGamalParameters;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    invoke-direct {v0, p2, v1}, Lorg/spongycastle/crypto/params/ElGamalKeyGenerationParameters;-><init>(Ljava/security/SecureRandom;Lorg/spongycastle/crypto/params/ElGamalParameters;)V

    iput-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/elgamal/KeyPairGeneratorSpi;->a:Lorg/spongycastle/crypto/params/ElGamalKeyGenerationParameters;

    .line 66
    :goto_0
    iget-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/elgamal/KeyPairGeneratorSpi;->b:Lorg/spongycastle/crypto/generators/ElGamalKeyPairGenerator;

    iget-object v1, p0, Lorg/spongycastle/jcajce/provider/asymmetric/elgamal/KeyPairGeneratorSpi;->a:Lorg/spongycastle/crypto/params/ElGamalKeyGenerationParameters;

    invoke-virtual {v0, v1}, Lorg/spongycastle/crypto/generators/ElGamalKeyPairGenerator;->a(Lorg/spongycastle/crypto/KeyGenerationParameters;)V

    .line 67
    const/4 v0, 0x1

    iput-boolean v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/elgamal/KeyPairGeneratorSpi;->f:Z

    .line 68
    return-void

    .line 61
    :cond_1
    check-cast p1, Ljavax/crypto/spec/DHParameterSpec;

    .line 63
    new-instance v0, Lorg/spongycastle/crypto/params/ElGamalKeyGenerationParameters;

    new-instance v1, Lorg/spongycastle/crypto/params/ElGamalParameters;

    invoke-virtual {p1}, Ljavax/crypto/spec/DHParameterSpec;->getP()Ljava/math/BigInteger;

    move-result-object v2

    invoke-virtual {p1}, Ljavax/crypto/spec/DHParameterSpec;->getG()Ljava/math/BigInteger;

    move-result-object v3

    invoke-virtual {p1}, Ljavax/crypto/spec/DHParameterSpec;->getL()I

    move-result v4

    invoke-direct {v1, v2, v3, v4}, Lorg/spongycastle/crypto/params/ElGamalParameters;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V

    invoke-direct {v0, p2, v1}, Lorg/spongycastle/crypto/params/ElGamalKeyGenerationParameters;-><init>(Ljava/security/SecureRandom;Lorg/spongycastle/crypto/params/ElGamalParameters;)V

    iput-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/elgamal/KeyPairGeneratorSpi;->a:Lorg/spongycastle/crypto/params/ElGamalKeyGenerationParameters;

    goto :goto_0
.end method
