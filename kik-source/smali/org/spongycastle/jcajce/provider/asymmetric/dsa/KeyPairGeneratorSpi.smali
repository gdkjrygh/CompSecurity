.class public Lorg/spongycastle/jcajce/provider/asymmetric/dsa/KeyPairGeneratorSpi;
.super Ljava/security/KeyPairGenerator;
.source "SourceFile"


# instance fields
.field a:Lorg/spongycastle/crypto/params/DSAKeyGenerationParameters;

.field b:Lorg/spongycastle/crypto/generators/DSAKeyPairGenerator;

.field c:I

.field d:I

.field e:Ljava/security/SecureRandom;

.field f:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 30
    const-string v0, "DSA"

    invoke-direct {p0, v0}, Ljava/security/KeyPairGenerator;-><init>(Ljava/lang/String;)V

    .line 22
    new-instance v0, Lorg/spongycastle/crypto/generators/DSAKeyPairGenerator;

    invoke-direct {v0}, Lorg/spongycastle/crypto/generators/DSAKeyPairGenerator;-><init>()V

    iput-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/dsa/KeyPairGeneratorSpi;->b:Lorg/spongycastle/crypto/generators/DSAKeyPairGenerator;

    .line 23
    const/16 v0, 0x400

    iput v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/dsa/KeyPairGeneratorSpi;->c:I

    .line 24
    const/16 v0, 0x14

    iput v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/dsa/KeyPairGeneratorSpi;->d:I

    .line 25
    new-instance v0, Ljava/security/SecureRandom;

    invoke-direct {v0}, Ljava/security/SecureRandom;-><init>()V

    iput-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/dsa/KeyPairGeneratorSpi;->e:Ljava/security/SecureRandom;

    .line 26
    const/4 v0, 0x0

    iput-boolean v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/dsa/KeyPairGeneratorSpi;->f:Z

    .line 31
    return-void
.end method


# virtual methods
.method public generateKeyPair()Ljava/security/KeyPair;
    .locals 4

    .prologue
    .line 65
    iget-boolean v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/dsa/KeyPairGeneratorSpi;->f:Z

    if-nez v0, :cond_0

    .line 67
    new-instance v0, Lorg/spongycastle/crypto/generators/DSAParametersGenerator;

    invoke-direct {v0}, Lorg/spongycastle/crypto/generators/DSAParametersGenerator;-><init>()V

    .line 69
    iget v1, p0, Lorg/spongycastle/jcajce/provider/asymmetric/dsa/KeyPairGeneratorSpi;->c:I

    iget v2, p0, Lorg/spongycastle/jcajce/provider/asymmetric/dsa/KeyPairGeneratorSpi;->d:I

    iget-object v3, p0, Lorg/spongycastle/jcajce/provider/asymmetric/dsa/KeyPairGeneratorSpi;->e:Ljava/security/SecureRandom;

    invoke-virtual {v0, v1, v2, v3}, Lorg/spongycastle/crypto/generators/DSAParametersGenerator;->a(IILjava/security/SecureRandom;)V

    .line 70
    new-instance v1, Lorg/spongycastle/crypto/params/DSAKeyGenerationParameters;

    iget-object v2, p0, Lorg/spongycastle/jcajce/provider/asymmetric/dsa/KeyPairGeneratorSpi;->e:Ljava/security/SecureRandom;

    invoke-virtual {v0}, Lorg/spongycastle/crypto/generators/DSAParametersGenerator;->a()Lorg/spongycastle/crypto/params/DSAParameters;

    move-result-object v0

    invoke-direct {v1, v2, v0}, Lorg/spongycastle/crypto/params/DSAKeyGenerationParameters;-><init>(Ljava/security/SecureRandom;Lorg/spongycastle/crypto/params/DSAParameters;)V

    iput-object v1, p0, Lorg/spongycastle/jcajce/provider/asymmetric/dsa/KeyPairGeneratorSpi;->a:Lorg/spongycastle/crypto/params/DSAKeyGenerationParameters;

    .line 71
    iget-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/dsa/KeyPairGeneratorSpi;->b:Lorg/spongycastle/crypto/generators/DSAKeyPairGenerator;

    iget-object v1, p0, Lorg/spongycastle/jcajce/provider/asymmetric/dsa/KeyPairGeneratorSpi;->a:Lorg/spongycastle/crypto/params/DSAKeyGenerationParameters;

    invoke-virtual {v0, v1}, Lorg/spongycastle/crypto/generators/DSAKeyPairGenerator;->a(Lorg/spongycastle/crypto/KeyGenerationParameters;)V

    .line 72
    const/4 v0, 0x1

    iput-boolean v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/dsa/KeyPairGeneratorSpi;->f:Z

    .line 75
    :cond_0
    iget-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/dsa/KeyPairGeneratorSpi;->b:Lorg/spongycastle/crypto/generators/DSAKeyPairGenerator;

    invoke-virtual {v0}, Lorg/spongycastle/crypto/generators/DSAKeyPairGenerator;->a()Lorg/spongycastle/crypto/AsymmetricCipherKeyPair;

    move-result-object v1

    .line 76
    invoke-virtual {v1}, Lorg/spongycastle/crypto/AsymmetricCipherKeyPair;->a()Lorg/spongycastle/crypto/CipherParameters;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/crypto/params/DSAPublicKeyParameters;

    .line 77
    invoke-virtual {v1}, Lorg/spongycastle/crypto/AsymmetricCipherKeyPair;->b()Lorg/spongycastle/crypto/CipherParameters;

    move-result-object v1

    check-cast v1, Lorg/spongycastle/crypto/params/DSAPrivateKeyParameters;

    .line 79
    new-instance v2, Ljava/security/KeyPair;

    new-instance v3, Lorg/spongycastle/jcajce/provider/asymmetric/dsa/BCDSAPublicKey;

    invoke-direct {v3, v0}, Lorg/spongycastle/jcajce/provider/asymmetric/dsa/BCDSAPublicKey;-><init>(Lorg/spongycastle/crypto/params/DSAPublicKeyParameters;)V

    new-instance v0, Lorg/spongycastle/jcajce/provider/asymmetric/dsa/BCDSAPrivateKey;

    invoke-direct {v0, v1}, Lorg/spongycastle/jcajce/provider/asymmetric/dsa/BCDSAPrivateKey;-><init>(Lorg/spongycastle/crypto/params/DSAPrivateKeyParameters;)V

    invoke-direct {v2, v3, v0}, Ljava/security/KeyPair;-><init>(Ljava/security/PublicKey;Ljava/security/PrivateKey;)V

    return-object v2
.end method

.method public initialize(ILjava/security/SecureRandom;)V
    .locals 2

    .prologue
    .line 37
    const/16 v0, 0x200

    if-lt p1, v0, :cond_0

    const/16 v0, 0x400

    if-gt p1, v0, :cond_0

    rem-int/lit8 v0, p1, 0x40

    if-eqz v0, :cond_1

    .line 39
    :cond_0
    new-instance v0, Ljava/security/InvalidParameterException;

    const-string v1, "strength must be from 512 - 1024 and a multiple of 64"

    invoke-direct {v0, v1}, Ljava/security/InvalidParameterException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 42
    :cond_1
    iput p1, p0, Lorg/spongycastle/jcajce/provider/asymmetric/dsa/KeyPairGeneratorSpi;->c:I

    .line 43
    iput-object p2, p0, Lorg/spongycastle/jcajce/provider/asymmetric/dsa/KeyPairGeneratorSpi;->e:Ljava/security/SecureRandom;

    .line 44
    return-void
.end method

.method public initialize(Ljava/security/spec/AlgorithmParameterSpec;Ljava/security/SecureRandom;)V
    .locals 5

    .prologue
    .line 51
    instance-of v0, p1, Ljava/security/spec/DSAParameterSpec;

    if-nez v0, :cond_0

    .line 53
    new-instance v0, Ljava/security/InvalidAlgorithmParameterException;

    const-string v1, "parameter object not a DSAParameterSpec"

    invoke-direct {v0, v1}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 55
    :cond_0
    check-cast p1, Ljava/security/spec/DSAParameterSpec;

    .line 57
    new-instance v0, Lorg/spongycastle/crypto/params/DSAKeyGenerationParameters;

    new-instance v1, Lorg/spongycastle/crypto/params/DSAParameters;

    invoke-virtual {p1}, Ljava/security/spec/DSAParameterSpec;->getP()Ljava/math/BigInteger;

    move-result-object v2

    invoke-virtual {p1}, Ljava/security/spec/DSAParameterSpec;->getQ()Ljava/math/BigInteger;

    move-result-object v3

    invoke-virtual {p1}, Ljava/security/spec/DSAParameterSpec;->getG()Ljava/math/BigInteger;

    move-result-object v4

    invoke-direct {v1, v2, v3, v4}, Lorg/spongycastle/crypto/params/DSAParameters;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    invoke-direct {v0, p2, v1}, Lorg/spongycastle/crypto/params/DSAKeyGenerationParameters;-><init>(Ljava/security/SecureRandom;Lorg/spongycastle/crypto/params/DSAParameters;)V

    iput-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/dsa/KeyPairGeneratorSpi;->a:Lorg/spongycastle/crypto/params/DSAKeyGenerationParameters;

    .line 59
    iget-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/dsa/KeyPairGeneratorSpi;->b:Lorg/spongycastle/crypto/generators/DSAKeyPairGenerator;

    iget-object v1, p0, Lorg/spongycastle/jcajce/provider/asymmetric/dsa/KeyPairGeneratorSpi;->a:Lorg/spongycastle/crypto/params/DSAKeyGenerationParameters;

    invoke-virtual {v0, v1}, Lorg/spongycastle/crypto/generators/DSAKeyPairGenerator;->a(Lorg/spongycastle/crypto/KeyGenerationParameters;)V

    .line 60
    const/4 v0, 0x1

    iput-boolean v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/dsa/KeyPairGeneratorSpi;->f:Z

    .line 61
    return-void
.end method
