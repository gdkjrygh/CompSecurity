.class public Lorg/spongycastle/jcajce/provider/asymmetric/gost/KeyPairGeneratorSpi;
.super Ljava/security/KeyPairGenerator;
.source "SourceFile"


# instance fields
.field a:Lorg/spongycastle/crypto/params/GOST3410KeyGenerationParameters;

.field b:Lorg/spongycastle/crypto/generators/GOST3410KeyPairGenerator;

.field c:Lorg/spongycastle/jce/spec/GOST3410ParameterSpec;

.field d:I

.field e:Ljava/security/SecureRandom;

.field f:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 30
    const-string v0, "GOST3410"

    invoke-direct {p0, v0}, Ljava/security/KeyPairGenerator;-><init>(Ljava/lang/String;)V

    .line 22
    new-instance v0, Lorg/spongycastle/crypto/generators/GOST3410KeyPairGenerator;

    invoke-direct {v0}, Lorg/spongycastle/crypto/generators/GOST3410KeyPairGenerator;-><init>()V

    iput-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/gost/KeyPairGeneratorSpi;->b:Lorg/spongycastle/crypto/generators/GOST3410KeyPairGenerator;

    .line 24
    const/16 v0, 0x400

    iput v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/gost/KeyPairGeneratorSpi;->d:I

    .line 25
    const/4 v0, 0x0

    iput-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/gost/KeyPairGeneratorSpi;->e:Ljava/security/SecureRandom;

    .line 26
    const/4 v0, 0x0

    iput-boolean v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/gost/KeyPairGeneratorSpi;->f:Z

    .line 31
    return-void
.end method

.method private a(Lorg/spongycastle/jce/spec/GOST3410ParameterSpec;Ljava/security/SecureRandom;)V
    .locals 5

    .prologue
    .line 45
    invoke-virtual {p1}, Lorg/spongycastle/jce/spec/GOST3410ParameterSpec;->d()Lorg/spongycastle/jce/spec/GOST3410PublicKeyParameterSetSpec;

    move-result-object v0

    .line 47
    new-instance v1, Lorg/spongycastle/crypto/params/GOST3410KeyGenerationParameters;

    new-instance v2, Lorg/spongycastle/crypto/params/GOST3410Parameters;

    invoke-virtual {v0}, Lorg/spongycastle/jce/spec/GOST3410PublicKeyParameterSetSpec;->a()Ljava/math/BigInteger;

    move-result-object v3

    invoke-virtual {v0}, Lorg/spongycastle/jce/spec/GOST3410PublicKeyParameterSetSpec;->b()Ljava/math/BigInteger;

    move-result-object v4

    invoke-virtual {v0}, Lorg/spongycastle/jce/spec/GOST3410PublicKeyParameterSetSpec;->c()Ljava/math/BigInteger;

    move-result-object v0

    invoke-direct {v2, v3, v4, v0}, Lorg/spongycastle/crypto/params/GOST3410Parameters;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    invoke-direct {v1, p2, v2}, Lorg/spongycastle/crypto/params/GOST3410KeyGenerationParameters;-><init>(Ljava/security/SecureRandom;Lorg/spongycastle/crypto/params/GOST3410Parameters;)V

    iput-object v1, p0, Lorg/spongycastle/jcajce/provider/asymmetric/gost/KeyPairGeneratorSpi;->a:Lorg/spongycastle/crypto/params/GOST3410KeyGenerationParameters;

    .line 49
    iget-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/gost/KeyPairGeneratorSpi;->b:Lorg/spongycastle/crypto/generators/GOST3410KeyPairGenerator;

    iget-object v1, p0, Lorg/spongycastle/jcajce/provider/asymmetric/gost/KeyPairGeneratorSpi;->a:Lorg/spongycastle/crypto/params/GOST3410KeyGenerationParameters;

    invoke-virtual {v0, v1}, Lorg/spongycastle/crypto/generators/GOST3410KeyPairGenerator;->a(Lorg/spongycastle/crypto/KeyGenerationParameters;)V

    .line 51
    const/4 v0, 0x1

    iput-boolean v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/gost/KeyPairGeneratorSpi;->f:Z

    .line 52
    iput-object p1, p0, Lorg/spongycastle/jcajce/provider/asymmetric/gost/KeyPairGeneratorSpi;->c:Lorg/spongycastle/jce/spec/GOST3410ParameterSpec;

    .line 53
    return-void
.end method


# virtual methods
.method public generateKeyPair()Ljava/security/KeyPair;
    .locals 5

    .prologue
    .line 70
    iget-boolean v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/gost/KeyPairGeneratorSpi;->f:Z

    if-nez v0, :cond_0

    .line 72
    new-instance v0, Lorg/spongycastle/jce/spec/GOST3410ParameterSpec;

    sget-object v1, Lorg/spongycastle/asn1/cryptopro/CryptoProObjectIdentifiers;->h:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v1}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;->c()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/spongycastle/jce/spec/GOST3410ParameterSpec;-><init>(Ljava/lang/String;)V

    new-instance v1, Ljava/security/SecureRandom;

    invoke-direct {v1}, Ljava/security/SecureRandom;-><init>()V

    invoke-direct {p0, v0, v1}, Lorg/spongycastle/jcajce/provider/asymmetric/gost/KeyPairGeneratorSpi;->a(Lorg/spongycastle/jce/spec/GOST3410ParameterSpec;Ljava/security/SecureRandom;)V

    .line 75
    :cond_0
    iget-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/gost/KeyPairGeneratorSpi;->b:Lorg/spongycastle/crypto/generators/GOST3410KeyPairGenerator;

    invoke-virtual {v0}, Lorg/spongycastle/crypto/generators/GOST3410KeyPairGenerator;->a()Lorg/spongycastle/crypto/AsymmetricCipherKeyPair;

    move-result-object v1

    .line 76
    invoke-virtual {v1}, Lorg/spongycastle/crypto/AsymmetricCipherKeyPair;->a()Lorg/spongycastle/crypto/CipherParameters;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/crypto/params/GOST3410PublicKeyParameters;

    .line 77
    invoke-virtual {v1}, Lorg/spongycastle/crypto/AsymmetricCipherKeyPair;->b()Lorg/spongycastle/crypto/CipherParameters;

    move-result-object v1

    check-cast v1, Lorg/spongycastle/crypto/params/GOST3410PrivateKeyParameters;

    .line 79
    new-instance v2, Ljava/security/KeyPair;

    new-instance v3, Lorg/spongycastle/jcajce/provider/asymmetric/gost/BCGOST3410PublicKey;

    iget-object v4, p0, Lorg/spongycastle/jcajce/provider/asymmetric/gost/KeyPairGeneratorSpi;->c:Lorg/spongycastle/jce/spec/GOST3410ParameterSpec;

    invoke-direct {v3, v0, v4}, Lorg/spongycastle/jcajce/provider/asymmetric/gost/BCGOST3410PublicKey;-><init>(Lorg/spongycastle/crypto/params/GOST3410PublicKeyParameters;Lorg/spongycastle/jce/spec/GOST3410ParameterSpec;)V

    new-instance v0, Lorg/spongycastle/jcajce/provider/asymmetric/gost/BCGOST3410PrivateKey;

    iget-object v4, p0, Lorg/spongycastle/jcajce/provider/asymmetric/gost/KeyPairGeneratorSpi;->c:Lorg/spongycastle/jce/spec/GOST3410ParameterSpec;

    invoke-direct {v0, v1, v4}, Lorg/spongycastle/jcajce/provider/asymmetric/gost/BCGOST3410PrivateKey;-><init>(Lorg/spongycastle/crypto/params/GOST3410PrivateKeyParameters;Lorg/spongycastle/jce/spec/GOST3410ParameterSpec;)V

    invoke-direct {v2, v3, v0}, Ljava/security/KeyPair;-><init>(Ljava/security/PublicKey;Ljava/security/PrivateKey;)V

    return-object v2
.end method

.method public initialize(ILjava/security/SecureRandom;)V
    .locals 0

    .prologue
    .line 37
    iput p1, p0, Lorg/spongycastle/jcajce/provider/asymmetric/gost/KeyPairGeneratorSpi;->d:I

    .line 38
    iput-object p2, p0, Lorg/spongycastle/jcajce/provider/asymmetric/gost/KeyPairGeneratorSpi;->e:Ljava/security/SecureRandom;

    .line 39
    return-void
.end method

.method public initialize(Ljava/security/spec/AlgorithmParameterSpec;Ljava/security/SecureRandom;)V
    .locals 2

    .prologue
    .line 60
    instance-of v0, p1, Lorg/spongycastle/jce/spec/GOST3410ParameterSpec;

    if-nez v0, :cond_0

    .line 62
    new-instance v0, Ljava/security/InvalidAlgorithmParameterException;

    const-string v1, "parameter object not a GOST3410ParameterSpec"

    invoke-direct {v0, v1}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 65
    :cond_0
    check-cast p1, Lorg/spongycastle/jce/spec/GOST3410ParameterSpec;

    invoke-direct {p0, p1, p2}, Lorg/spongycastle/jcajce/provider/asymmetric/gost/KeyPairGeneratorSpi;->a(Lorg/spongycastle/jce/spec/GOST3410ParameterSpec;Ljava/security/SecureRandom;)V

    .line 66
    return-void
.end method
