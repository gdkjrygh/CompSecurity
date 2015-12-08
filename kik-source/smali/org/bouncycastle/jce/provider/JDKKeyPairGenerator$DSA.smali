.class public Lorg/bouncycastle/jce/provider/JDKKeyPairGenerator$DSA;
.super Lorg/bouncycastle/jce/provider/JDKKeyPairGenerator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/bouncycastle/jce/provider/JDKKeyPairGenerator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "DSA"
.end annotation


# instance fields
.field a:Lorg/bouncycastle/crypto/params/DSAKeyGenerationParameters;

.field b:Lorg/bouncycastle/crypto/generators/DSAKeyPairGenerator;

.field c:I

.field d:I

.field e:Ljava/security/SecureRandom;

.field f:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    const-string v0, "DSA"

    invoke-direct {p0, v0}, Lorg/bouncycastle/jce/provider/JDKKeyPairGenerator;-><init>(Ljava/lang/String;)V

    new-instance v0, Lorg/bouncycastle/crypto/generators/DSAKeyPairGenerator;

    invoke-direct {v0}, Lorg/bouncycastle/crypto/generators/DSAKeyPairGenerator;-><init>()V

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JDKKeyPairGenerator$DSA;->b:Lorg/bouncycastle/crypto/generators/DSAKeyPairGenerator;

    const/16 v0, 0x400

    iput v0, p0, Lorg/bouncycastle/jce/provider/JDKKeyPairGenerator$DSA;->c:I

    const/16 v0, 0x14

    iput v0, p0, Lorg/bouncycastle/jce/provider/JDKKeyPairGenerator$DSA;->d:I

    new-instance v0, Ljava/security/SecureRandom;

    invoke-direct {v0}, Ljava/security/SecureRandom;-><init>()V

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JDKKeyPairGenerator$DSA;->e:Ljava/security/SecureRandom;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lorg/bouncycastle/jce/provider/JDKKeyPairGenerator$DSA;->f:Z

    return-void
.end method


# virtual methods
.method public generateKeyPair()Ljava/security/KeyPair;
    .locals 4

    iget-boolean v0, p0, Lorg/bouncycastle/jce/provider/JDKKeyPairGenerator$DSA;->f:Z

    if-nez v0, :cond_0

    new-instance v0, Lorg/bouncycastle/crypto/generators/DSAParametersGenerator;

    invoke-direct {v0}, Lorg/bouncycastle/crypto/generators/DSAParametersGenerator;-><init>()V

    iget v1, p0, Lorg/bouncycastle/jce/provider/JDKKeyPairGenerator$DSA;->c:I

    iget v2, p0, Lorg/bouncycastle/jce/provider/JDKKeyPairGenerator$DSA;->d:I

    iget-object v3, p0, Lorg/bouncycastle/jce/provider/JDKKeyPairGenerator$DSA;->e:Ljava/security/SecureRandom;

    invoke-virtual {v0, v1, v2, v3}, Lorg/bouncycastle/crypto/generators/DSAParametersGenerator;->init(IILjava/security/SecureRandom;)V

    new-instance v1, Lorg/bouncycastle/crypto/params/DSAKeyGenerationParameters;

    iget-object v2, p0, Lorg/bouncycastle/jce/provider/JDKKeyPairGenerator$DSA;->e:Ljava/security/SecureRandom;

    invoke-virtual {v0}, Lorg/bouncycastle/crypto/generators/DSAParametersGenerator;->generateParameters()Lorg/bouncycastle/crypto/params/DSAParameters;

    move-result-object v0

    invoke-direct {v1, v2, v0}, Lorg/bouncycastle/crypto/params/DSAKeyGenerationParameters;-><init>(Ljava/security/SecureRandom;Lorg/bouncycastle/crypto/params/DSAParameters;)V

    iput-object v1, p0, Lorg/bouncycastle/jce/provider/JDKKeyPairGenerator$DSA;->a:Lorg/bouncycastle/crypto/params/DSAKeyGenerationParameters;

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JDKKeyPairGenerator$DSA;->b:Lorg/bouncycastle/crypto/generators/DSAKeyPairGenerator;

    iget-object v1, p0, Lorg/bouncycastle/jce/provider/JDKKeyPairGenerator$DSA;->a:Lorg/bouncycastle/crypto/params/DSAKeyGenerationParameters;

    invoke-virtual {v0, v1}, Lorg/bouncycastle/crypto/generators/DSAKeyPairGenerator;->init(Lorg/bouncycastle/crypto/KeyGenerationParameters;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lorg/bouncycastle/jce/provider/JDKKeyPairGenerator$DSA;->f:Z

    :cond_0
    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JDKKeyPairGenerator$DSA;->b:Lorg/bouncycastle/crypto/generators/DSAKeyPairGenerator;

    invoke-virtual {v0}, Lorg/bouncycastle/crypto/generators/DSAKeyPairGenerator;->generateKeyPair()Lorg/bouncycastle/crypto/AsymmetricCipherKeyPair;

    move-result-object v1

    invoke-virtual {v1}, Lorg/bouncycastle/crypto/AsymmetricCipherKeyPair;->getPublic()Lorg/bouncycastle/crypto/CipherParameters;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/crypto/params/DSAPublicKeyParameters;

    invoke-virtual {v1}, Lorg/bouncycastle/crypto/AsymmetricCipherKeyPair;->getPrivate()Lorg/bouncycastle/crypto/CipherParameters;

    move-result-object v1

    check-cast v1, Lorg/bouncycastle/crypto/params/DSAPrivateKeyParameters;

    new-instance v2, Ljava/security/KeyPair;

    new-instance v3, Lorg/bouncycastle/jce/provider/JDKDSAPublicKey;

    invoke-direct {v3, v0}, Lorg/bouncycastle/jce/provider/JDKDSAPublicKey;-><init>(Lorg/bouncycastle/crypto/params/DSAPublicKeyParameters;)V

    new-instance v0, Lorg/bouncycastle/jce/provider/JDKDSAPrivateKey;

    invoke-direct {v0, v1}, Lorg/bouncycastle/jce/provider/JDKDSAPrivateKey;-><init>(Lorg/bouncycastle/crypto/params/DSAPrivateKeyParameters;)V

    invoke-direct {v2, v3, v0}, Ljava/security/KeyPair;-><init>(Ljava/security/PublicKey;Ljava/security/PrivateKey;)V

    return-object v2
.end method

.method public initialize(ILjava/security/SecureRandom;)V
    .locals 2

    const/16 v0, 0x200

    if-lt p1, v0, :cond_0

    const/16 v0, 0x400

    if-gt p1, v0, :cond_0

    rem-int/lit8 v0, p1, 0x40

    if-eqz v0, :cond_1

    :cond_0
    new-instance v0, Ljava/security/InvalidParameterException;

    const-string v1, "strength must be from 512 - 1024 and a multiple of 64"

    invoke-direct {v0, v1}, Ljava/security/InvalidParameterException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iput p1, p0, Lorg/bouncycastle/jce/provider/JDKKeyPairGenerator$DSA;->c:I

    iput-object p2, p0, Lorg/bouncycastle/jce/provider/JDKKeyPairGenerator$DSA;->e:Ljava/security/SecureRandom;

    return-void
.end method

.method public initialize(Ljava/security/spec/AlgorithmParameterSpec;Ljava/security/SecureRandom;)V
    .locals 5

    instance-of v0, p1, Ljava/security/spec/DSAParameterSpec;

    if-nez v0, :cond_0

    new-instance v0, Ljava/security/InvalidAlgorithmParameterException;

    const-string v1, "parameter object not a DSAParameterSpec"

    invoke-direct {v0, v1}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    check-cast p1, Ljava/security/spec/DSAParameterSpec;

    new-instance v0, Lorg/bouncycastle/crypto/params/DSAKeyGenerationParameters;

    new-instance v1, Lorg/bouncycastle/crypto/params/DSAParameters;

    invoke-virtual {p1}, Ljava/security/spec/DSAParameterSpec;->getP()Ljava/math/BigInteger;

    move-result-object v2

    invoke-virtual {p1}, Ljava/security/spec/DSAParameterSpec;->getQ()Ljava/math/BigInteger;

    move-result-object v3

    invoke-virtual {p1}, Ljava/security/spec/DSAParameterSpec;->getG()Ljava/math/BigInteger;

    move-result-object v4

    invoke-direct {v1, v2, v3, v4}, Lorg/bouncycastle/crypto/params/DSAParameters;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    invoke-direct {v0, p2, v1}, Lorg/bouncycastle/crypto/params/DSAKeyGenerationParameters;-><init>(Ljava/security/SecureRandom;Lorg/bouncycastle/crypto/params/DSAParameters;)V

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JDKKeyPairGenerator$DSA;->a:Lorg/bouncycastle/crypto/params/DSAKeyGenerationParameters;

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JDKKeyPairGenerator$DSA;->b:Lorg/bouncycastle/crypto/generators/DSAKeyPairGenerator;

    iget-object v1, p0, Lorg/bouncycastle/jce/provider/JDKKeyPairGenerator$DSA;->a:Lorg/bouncycastle/crypto/params/DSAKeyGenerationParameters;

    invoke-virtual {v0, v1}, Lorg/bouncycastle/crypto/generators/DSAKeyPairGenerator;->init(Lorg/bouncycastle/crypto/KeyGenerationParameters;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lorg/bouncycastle/jce/provider/JDKKeyPairGenerator$DSA;->f:Z

    return-void
.end method
