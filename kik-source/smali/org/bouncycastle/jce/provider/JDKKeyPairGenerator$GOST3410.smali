.class public Lorg/bouncycastle/jce/provider/JDKKeyPairGenerator$GOST3410;
.super Lorg/bouncycastle/jce/provider/JDKKeyPairGenerator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/bouncycastle/jce/provider/JDKKeyPairGenerator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "GOST3410"
.end annotation


# instance fields
.field a:Lorg/bouncycastle/crypto/params/GOST3410KeyGenerationParameters;

.field b:Lorg/bouncycastle/crypto/generators/GOST3410KeyPairGenerator;

.field c:Lorg/bouncycastle/jce/spec/GOST3410ParameterSpec;

.field d:I

.field e:Ljava/security/SecureRandom;

.field f:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    const-string v0, "GOST3410"

    invoke-direct {p0, v0}, Lorg/bouncycastle/jce/provider/JDKKeyPairGenerator;-><init>(Ljava/lang/String;)V

    new-instance v0, Lorg/bouncycastle/crypto/generators/GOST3410KeyPairGenerator;

    invoke-direct {v0}, Lorg/bouncycastle/crypto/generators/GOST3410KeyPairGenerator;-><init>()V

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JDKKeyPairGenerator$GOST3410;->b:Lorg/bouncycastle/crypto/generators/GOST3410KeyPairGenerator;

    const/16 v0, 0x400

    iput v0, p0, Lorg/bouncycastle/jce/provider/JDKKeyPairGenerator$GOST3410;->d:I

    const/4 v0, 0x0

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JDKKeyPairGenerator$GOST3410;->e:Ljava/security/SecureRandom;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lorg/bouncycastle/jce/provider/JDKKeyPairGenerator$GOST3410;->f:Z

    return-void
.end method

.method private a(Lorg/bouncycastle/jce/spec/GOST3410ParameterSpec;Ljava/security/SecureRandom;)V
    .locals 5

    invoke-virtual {p1}, Lorg/bouncycastle/jce/spec/GOST3410ParameterSpec;->d()Lorg/bouncycastle/jce/spec/GOST3410PublicKeyParameterSetSpec;

    move-result-object v0

    new-instance v1, Lorg/bouncycastle/crypto/params/GOST3410KeyGenerationParameters;

    new-instance v2, Lorg/bouncycastle/crypto/params/GOST3410Parameters;

    invoke-virtual {v0}, Lorg/bouncycastle/jce/spec/GOST3410PublicKeyParameterSetSpec;->a()Ljava/math/BigInteger;

    move-result-object v3

    invoke-virtual {v0}, Lorg/bouncycastle/jce/spec/GOST3410PublicKeyParameterSetSpec;->b()Ljava/math/BigInteger;

    move-result-object v4

    invoke-virtual {v0}, Lorg/bouncycastle/jce/spec/GOST3410PublicKeyParameterSetSpec;->c()Ljava/math/BigInteger;

    move-result-object v0

    invoke-direct {v2, v3, v4, v0}, Lorg/bouncycastle/crypto/params/GOST3410Parameters;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    invoke-direct {v1, p2, v2}, Lorg/bouncycastle/crypto/params/GOST3410KeyGenerationParameters;-><init>(Ljava/security/SecureRandom;Lorg/bouncycastle/crypto/params/GOST3410Parameters;)V

    iput-object v1, p0, Lorg/bouncycastle/jce/provider/JDKKeyPairGenerator$GOST3410;->a:Lorg/bouncycastle/crypto/params/GOST3410KeyGenerationParameters;

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JDKKeyPairGenerator$GOST3410;->b:Lorg/bouncycastle/crypto/generators/GOST3410KeyPairGenerator;

    iget-object v1, p0, Lorg/bouncycastle/jce/provider/JDKKeyPairGenerator$GOST3410;->a:Lorg/bouncycastle/crypto/params/GOST3410KeyGenerationParameters;

    invoke-virtual {v0, v1}, Lorg/bouncycastle/crypto/generators/GOST3410KeyPairGenerator;->init(Lorg/bouncycastle/crypto/KeyGenerationParameters;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lorg/bouncycastle/jce/provider/JDKKeyPairGenerator$GOST3410;->f:Z

    iput-object p1, p0, Lorg/bouncycastle/jce/provider/JDKKeyPairGenerator$GOST3410;->c:Lorg/bouncycastle/jce/spec/GOST3410ParameterSpec;

    return-void
.end method


# virtual methods
.method public generateKeyPair()Ljava/security/KeyPair;
    .locals 5

    iget-boolean v0, p0, Lorg/bouncycastle/jce/provider/JDKKeyPairGenerator$GOST3410;->f:Z

    if-nez v0, :cond_0

    new-instance v0, Lorg/bouncycastle/jce/spec/GOST3410ParameterSpec;

    sget-object v1, Lorg/bouncycastle/asn1/cryptopro/CryptoProObjectIdentifiers;->h:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    invoke-virtual {v1}, Lorg/bouncycastle/asn1/DERObjectIdentifier;->e()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/bouncycastle/jce/spec/GOST3410ParameterSpec;-><init>(Ljava/lang/String;)V

    new-instance v1, Ljava/security/SecureRandom;

    invoke-direct {v1}, Ljava/security/SecureRandom;-><init>()V

    invoke-direct {p0, v0, v1}, Lorg/bouncycastle/jce/provider/JDKKeyPairGenerator$GOST3410;->a(Lorg/bouncycastle/jce/spec/GOST3410ParameterSpec;Ljava/security/SecureRandom;)V

    :cond_0
    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JDKKeyPairGenerator$GOST3410;->b:Lorg/bouncycastle/crypto/generators/GOST3410KeyPairGenerator;

    invoke-virtual {v0}, Lorg/bouncycastle/crypto/generators/GOST3410KeyPairGenerator;->generateKeyPair()Lorg/bouncycastle/crypto/AsymmetricCipherKeyPair;

    move-result-object v1

    invoke-virtual {v1}, Lorg/bouncycastle/crypto/AsymmetricCipherKeyPair;->getPublic()Lorg/bouncycastle/crypto/CipherParameters;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/crypto/params/GOST3410PublicKeyParameters;

    invoke-virtual {v1}, Lorg/bouncycastle/crypto/AsymmetricCipherKeyPair;->getPrivate()Lorg/bouncycastle/crypto/CipherParameters;

    move-result-object v1

    check-cast v1, Lorg/bouncycastle/crypto/params/GOST3410PrivateKeyParameters;

    new-instance v2, Ljava/security/KeyPair;

    new-instance v3, Lorg/bouncycastle/jce/provider/JDKGOST3410PublicKey;

    iget-object v4, p0, Lorg/bouncycastle/jce/provider/JDKKeyPairGenerator$GOST3410;->c:Lorg/bouncycastle/jce/spec/GOST3410ParameterSpec;

    invoke-direct {v3, v0, v4}, Lorg/bouncycastle/jce/provider/JDKGOST3410PublicKey;-><init>(Lorg/bouncycastle/crypto/params/GOST3410PublicKeyParameters;Lorg/bouncycastle/jce/spec/GOST3410ParameterSpec;)V

    new-instance v0, Lorg/bouncycastle/jce/provider/JDKGOST3410PrivateKey;

    iget-object v4, p0, Lorg/bouncycastle/jce/provider/JDKKeyPairGenerator$GOST3410;->c:Lorg/bouncycastle/jce/spec/GOST3410ParameterSpec;

    invoke-direct {v0, v1, v4}, Lorg/bouncycastle/jce/provider/JDKGOST3410PrivateKey;-><init>(Lorg/bouncycastle/crypto/params/GOST3410PrivateKeyParameters;Lorg/bouncycastle/jce/spec/GOST3410ParameterSpec;)V

    invoke-direct {v2, v3, v0}, Ljava/security/KeyPair;-><init>(Ljava/security/PublicKey;Ljava/security/PrivateKey;)V

    return-object v2
.end method

.method public initialize(ILjava/security/SecureRandom;)V
    .locals 0

    iput p1, p0, Lorg/bouncycastle/jce/provider/JDKKeyPairGenerator$GOST3410;->d:I

    iput-object p2, p0, Lorg/bouncycastle/jce/provider/JDKKeyPairGenerator$GOST3410;->e:Ljava/security/SecureRandom;

    return-void
.end method

.method public initialize(Ljava/security/spec/AlgorithmParameterSpec;Ljava/security/SecureRandom;)V
    .locals 2

    instance-of v0, p1, Lorg/bouncycastle/jce/spec/GOST3410ParameterSpec;

    if-nez v0, :cond_0

    new-instance v0, Ljava/security/InvalidAlgorithmParameterException;

    const-string v1, "parameter object not a GOST3410ParameterSpec"

    invoke-direct {v0, v1}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    check-cast p1, Lorg/bouncycastle/jce/spec/GOST3410ParameterSpec;

    invoke-direct {p0, p1, p2}, Lorg/bouncycastle/jce/provider/JDKKeyPairGenerator$GOST3410;->a(Lorg/bouncycastle/jce/spec/GOST3410ParameterSpec;Ljava/security/SecureRandom;)V

    return-void
.end method
