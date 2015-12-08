.class public Lorg/bouncycastle/jce/provider/JDKKeyPairGenerator$ElGamal;
.super Lorg/bouncycastle/jce/provider/JDKKeyPairGenerator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/bouncycastle/jce/provider/JDKKeyPairGenerator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ElGamal"
.end annotation


# instance fields
.field a:Lorg/bouncycastle/crypto/params/ElGamalKeyGenerationParameters;

.field b:Lorg/bouncycastle/crypto/generators/ElGamalKeyPairGenerator;

.field c:I

.field d:I

.field e:Ljava/security/SecureRandom;

.field f:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    const-string v0, "ElGamal"

    invoke-direct {p0, v0}, Lorg/bouncycastle/jce/provider/JDKKeyPairGenerator;-><init>(Ljava/lang/String;)V

    new-instance v0, Lorg/bouncycastle/crypto/generators/ElGamalKeyPairGenerator;

    invoke-direct {v0}, Lorg/bouncycastle/crypto/generators/ElGamalKeyPairGenerator;-><init>()V

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JDKKeyPairGenerator$ElGamal;->b:Lorg/bouncycastle/crypto/generators/ElGamalKeyPairGenerator;

    const/16 v0, 0x400

    iput v0, p0, Lorg/bouncycastle/jce/provider/JDKKeyPairGenerator$ElGamal;->c:I

    const/16 v0, 0x14

    iput v0, p0, Lorg/bouncycastle/jce/provider/JDKKeyPairGenerator$ElGamal;->d:I

    new-instance v0, Ljava/security/SecureRandom;

    invoke-direct {v0}, Ljava/security/SecureRandom;-><init>()V

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JDKKeyPairGenerator$ElGamal;->e:Ljava/security/SecureRandom;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lorg/bouncycastle/jce/provider/JDKKeyPairGenerator$ElGamal;->f:Z

    return-void
.end method


# virtual methods
.method public generateKeyPair()Ljava/security/KeyPair;
    .locals 4

    iget-boolean v0, p0, Lorg/bouncycastle/jce/provider/JDKKeyPairGenerator$ElGamal;->f:Z

    if-nez v0, :cond_0

    new-instance v0, Lorg/bouncycastle/crypto/generators/ElGamalParametersGenerator;

    invoke-direct {v0}, Lorg/bouncycastle/crypto/generators/ElGamalParametersGenerator;-><init>()V

    iget v1, p0, Lorg/bouncycastle/jce/provider/JDKKeyPairGenerator$ElGamal;->c:I

    iget v2, p0, Lorg/bouncycastle/jce/provider/JDKKeyPairGenerator$ElGamal;->d:I

    iget-object v3, p0, Lorg/bouncycastle/jce/provider/JDKKeyPairGenerator$ElGamal;->e:Ljava/security/SecureRandom;

    invoke-virtual {v0, v1, v2, v3}, Lorg/bouncycastle/crypto/generators/ElGamalParametersGenerator;->init(IILjava/security/SecureRandom;)V

    new-instance v1, Lorg/bouncycastle/crypto/params/ElGamalKeyGenerationParameters;

    iget-object v2, p0, Lorg/bouncycastle/jce/provider/JDKKeyPairGenerator$ElGamal;->e:Ljava/security/SecureRandom;

    invoke-virtual {v0}, Lorg/bouncycastle/crypto/generators/ElGamalParametersGenerator;->generateParameters()Lorg/bouncycastle/crypto/params/ElGamalParameters;

    move-result-object v0

    invoke-direct {v1, v2, v0}, Lorg/bouncycastle/crypto/params/ElGamalKeyGenerationParameters;-><init>(Ljava/security/SecureRandom;Lorg/bouncycastle/crypto/params/ElGamalParameters;)V

    iput-object v1, p0, Lorg/bouncycastle/jce/provider/JDKKeyPairGenerator$ElGamal;->a:Lorg/bouncycastle/crypto/params/ElGamalKeyGenerationParameters;

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JDKKeyPairGenerator$ElGamal;->b:Lorg/bouncycastle/crypto/generators/ElGamalKeyPairGenerator;

    iget-object v1, p0, Lorg/bouncycastle/jce/provider/JDKKeyPairGenerator$ElGamal;->a:Lorg/bouncycastle/crypto/params/ElGamalKeyGenerationParameters;

    invoke-virtual {v0, v1}, Lorg/bouncycastle/crypto/generators/ElGamalKeyPairGenerator;->init(Lorg/bouncycastle/crypto/KeyGenerationParameters;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lorg/bouncycastle/jce/provider/JDKKeyPairGenerator$ElGamal;->f:Z

    :cond_0
    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JDKKeyPairGenerator$ElGamal;->b:Lorg/bouncycastle/crypto/generators/ElGamalKeyPairGenerator;

    invoke-virtual {v0}, Lorg/bouncycastle/crypto/generators/ElGamalKeyPairGenerator;->generateKeyPair()Lorg/bouncycastle/crypto/AsymmetricCipherKeyPair;

    move-result-object v1

    invoke-virtual {v1}, Lorg/bouncycastle/crypto/AsymmetricCipherKeyPair;->getPublic()Lorg/bouncycastle/crypto/CipherParameters;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/crypto/params/ElGamalPublicKeyParameters;

    invoke-virtual {v1}, Lorg/bouncycastle/crypto/AsymmetricCipherKeyPair;->getPrivate()Lorg/bouncycastle/crypto/CipherParameters;

    move-result-object v1

    check-cast v1, Lorg/bouncycastle/crypto/params/ElGamalPrivateKeyParameters;

    new-instance v2, Ljava/security/KeyPair;

    new-instance v3, Lorg/bouncycastle/jce/provider/JCEElGamalPublicKey;

    invoke-direct {v3, v0}, Lorg/bouncycastle/jce/provider/JCEElGamalPublicKey;-><init>(Lorg/bouncycastle/crypto/params/ElGamalPublicKeyParameters;)V

    new-instance v0, Lorg/bouncycastle/jce/provider/JCEElGamalPrivateKey;

    invoke-direct {v0, v1}, Lorg/bouncycastle/jce/provider/JCEElGamalPrivateKey;-><init>(Lorg/bouncycastle/crypto/params/ElGamalPrivateKeyParameters;)V

    invoke-direct {v2, v3, v0}, Ljava/security/KeyPair;-><init>(Ljava/security/PublicKey;Ljava/security/PrivateKey;)V

    return-object v2
.end method

.method public initialize(ILjava/security/SecureRandom;)V
    .locals 0

    iput p1, p0, Lorg/bouncycastle/jce/provider/JDKKeyPairGenerator$ElGamal;->c:I

    iput-object p2, p0, Lorg/bouncycastle/jce/provider/JDKKeyPairGenerator$ElGamal;->e:Ljava/security/SecureRandom;

    return-void
.end method

.method public initialize(Ljava/security/spec/AlgorithmParameterSpec;Ljava/security/SecureRandom;)V
    .locals 5

    instance-of v0, p1, Lorg/bouncycastle/jce/spec/ElGamalParameterSpec;

    if-nez v0, :cond_0

    instance-of v0, p1, Ljavax/crypto/spec/DHParameterSpec;

    if-nez v0, :cond_0

    new-instance v0, Ljava/security/InvalidAlgorithmParameterException;

    const-string v1, "parameter object not a DHParameterSpec or an ElGamalParameterSpec"

    invoke-direct {v0, v1}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    instance-of v0, p1, Lorg/bouncycastle/jce/spec/ElGamalParameterSpec;

    if-eqz v0, :cond_1

    check-cast p1, Lorg/bouncycastle/jce/spec/ElGamalParameterSpec;

    new-instance v0, Lorg/bouncycastle/crypto/params/ElGamalKeyGenerationParameters;

    new-instance v1, Lorg/bouncycastle/crypto/params/ElGamalParameters;

    invoke-virtual {p1}, Lorg/bouncycastle/jce/spec/ElGamalParameterSpec;->a()Ljava/math/BigInteger;

    move-result-object v2

    invoke-virtual {p1}, Lorg/bouncycastle/jce/spec/ElGamalParameterSpec;->b()Ljava/math/BigInteger;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lorg/bouncycastle/crypto/params/ElGamalParameters;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    invoke-direct {v0, p2, v1}, Lorg/bouncycastle/crypto/params/ElGamalKeyGenerationParameters;-><init>(Ljava/security/SecureRandom;Lorg/bouncycastle/crypto/params/ElGamalParameters;)V

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JDKKeyPairGenerator$ElGamal;->a:Lorg/bouncycastle/crypto/params/ElGamalKeyGenerationParameters;

    :goto_0
    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JDKKeyPairGenerator$ElGamal;->b:Lorg/bouncycastle/crypto/generators/ElGamalKeyPairGenerator;

    iget-object v1, p0, Lorg/bouncycastle/jce/provider/JDKKeyPairGenerator$ElGamal;->a:Lorg/bouncycastle/crypto/params/ElGamalKeyGenerationParameters;

    invoke-virtual {v0, v1}, Lorg/bouncycastle/crypto/generators/ElGamalKeyPairGenerator;->init(Lorg/bouncycastle/crypto/KeyGenerationParameters;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lorg/bouncycastle/jce/provider/JDKKeyPairGenerator$ElGamal;->f:Z

    return-void

    :cond_1
    check-cast p1, Ljavax/crypto/spec/DHParameterSpec;

    new-instance v0, Lorg/bouncycastle/crypto/params/ElGamalKeyGenerationParameters;

    new-instance v1, Lorg/bouncycastle/crypto/params/ElGamalParameters;

    invoke-virtual {p1}, Ljavax/crypto/spec/DHParameterSpec;->getP()Ljava/math/BigInteger;

    move-result-object v2

    invoke-virtual {p1}, Ljavax/crypto/spec/DHParameterSpec;->getG()Ljava/math/BigInteger;

    move-result-object v3

    invoke-virtual {p1}, Ljavax/crypto/spec/DHParameterSpec;->getL()I

    move-result v4

    invoke-direct {v1, v2, v3, v4}, Lorg/bouncycastle/crypto/params/ElGamalParameters;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V

    invoke-direct {v0, p2, v1}, Lorg/bouncycastle/crypto/params/ElGamalKeyGenerationParameters;-><init>(Ljava/security/SecureRandom;Lorg/bouncycastle/crypto/params/ElGamalParameters;)V

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JDKKeyPairGenerator$ElGamal;->a:Lorg/bouncycastle/crypto/params/ElGamalKeyGenerationParameters;

    goto :goto_0
.end method
