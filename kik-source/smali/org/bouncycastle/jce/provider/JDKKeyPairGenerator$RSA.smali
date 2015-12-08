.class public Lorg/bouncycastle/jce/provider/JDKKeyPairGenerator$RSA;
.super Lorg/bouncycastle/jce/provider/JDKKeyPairGenerator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/bouncycastle/jce/provider/JDKKeyPairGenerator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "RSA"
.end annotation


# static fields
.field static final a:Ljava/math/BigInteger;


# instance fields
.field b:Lorg/bouncycastle/crypto/params/RSAKeyGenerationParameters;

.field c:Lorg/bouncycastle/crypto/generators/RSAKeyPairGenerator;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-wide/32 v0, 0x10001

    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v0

    sput-object v0, Lorg/bouncycastle/jce/provider/JDKKeyPairGenerator$RSA;->a:Ljava/math/BigInteger;

    return-void
.end method

.method public constructor <init>()V
    .locals 5

    const-string v0, "RSA"

    invoke-direct {p0, v0}, Lorg/bouncycastle/jce/provider/JDKKeyPairGenerator;-><init>(Ljava/lang/String;)V

    new-instance v0, Lorg/bouncycastle/crypto/generators/RSAKeyPairGenerator;

    invoke-direct {v0}, Lorg/bouncycastle/crypto/generators/RSAKeyPairGenerator;-><init>()V

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JDKKeyPairGenerator$RSA;->c:Lorg/bouncycastle/crypto/generators/RSAKeyPairGenerator;

    new-instance v0, Lorg/bouncycastle/crypto/params/RSAKeyGenerationParameters;

    sget-object v1, Lorg/bouncycastle/jce/provider/JDKKeyPairGenerator$RSA;->a:Ljava/math/BigInteger;

    new-instance v2, Ljava/security/SecureRandom;

    invoke-direct {v2}, Ljava/security/SecureRandom;-><init>()V

    const/16 v3, 0x800

    const/16 v4, 0xc

    invoke-direct {v0, v1, v2, v3, v4}, Lorg/bouncycastle/crypto/params/RSAKeyGenerationParameters;-><init>(Ljava/math/BigInteger;Ljava/security/SecureRandom;II)V

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JDKKeyPairGenerator$RSA;->b:Lorg/bouncycastle/crypto/params/RSAKeyGenerationParameters;

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JDKKeyPairGenerator$RSA;->c:Lorg/bouncycastle/crypto/generators/RSAKeyPairGenerator;

    iget-object v1, p0, Lorg/bouncycastle/jce/provider/JDKKeyPairGenerator$RSA;->b:Lorg/bouncycastle/crypto/params/RSAKeyGenerationParameters;

    invoke-virtual {v0, v1}, Lorg/bouncycastle/crypto/generators/RSAKeyPairGenerator;->init(Lorg/bouncycastle/crypto/KeyGenerationParameters;)V

    return-void
.end method


# virtual methods
.method public generateKeyPair()Ljava/security/KeyPair;
    .locals 4

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JDKKeyPairGenerator$RSA;->c:Lorg/bouncycastle/crypto/generators/RSAKeyPairGenerator;

    invoke-virtual {v0}, Lorg/bouncycastle/crypto/generators/RSAKeyPairGenerator;->generateKeyPair()Lorg/bouncycastle/crypto/AsymmetricCipherKeyPair;

    move-result-object v1

    invoke-virtual {v1}, Lorg/bouncycastle/crypto/AsymmetricCipherKeyPair;->getPublic()Lorg/bouncycastle/crypto/CipherParameters;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/crypto/params/RSAKeyParameters;

    invoke-virtual {v1}, Lorg/bouncycastle/crypto/AsymmetricCipherKeyPair;->getPrivate()Lorg/bouncycastle/crypto/CipherParameters;

    move-result-object v1

    check-cast v1, Lorg/bouncycastle/crypto/params/RSAPrivateCrtKeyParameters;

    new-instance v2, Ljava/security/KeyPair;

    new-instance v3, Lorg/bouncycastle/jce/provider/JCERSAPublicKey;

    invoke-direct {v3, v0}, Lorg/bouncycastle/jce/provider/JCERSAPublicKey;-><init>(Lorg/bouncycastle/crypto/params/RSAKeyParameters;)V

    new-instance v0, Lorg/bouncycastle/jce/provider/JCERSAPrivateCrtKey;

    invoke-direct {v0, v1}, Lorg/bouncycastle/jce/provider/JCERSAPrivateCrtKey;-><init>(Lorg/bouncycastle/crypto/params/RSAPrivateCrtKeyParameters;)V

    invoke-direct {v2, v3, v0}, Ljava/security/KeyPair;-><init>(Ljava/security/PublicKey;Ljava/security/PrivateKey;)V

    return-object v2
.end method

.method public initialize(ILjava/security/SecureRandom;)V
    .locals 3

    new-instance v0, Lorg/bouncycastle/crypto/params/RSAKeyGenerationParameters;

    sget-object v1, Lorg/bouncycastle/jce/provider/JDKKeyPairGenerator$RSA;->a:Ljava/math/BigInteger;

    const/16 v2, 0xc

    invoke-direct {v0, v1, p2, p1, v2}, Lorg/bouncycastle/crypto/params/RSAKeyGenerationParameters;-><init>(Ljava/math/BigInteger;Ljava/security/SecureRandom;II)V

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JDKKeyPairGenerator$RSA;->b:Lorg/bouncycastle/crypto/params/RSAKeyGenerationParameters;

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JDKKeyPairGenerator$RSA;->c:Lorg/bouncycastle/crypto/generators/RSAKeyPairGenerator;

    iget-object v1, p0, Lorg/bouncycastle/jce/provider/JDKKeyPairGenerator$RSA;->b:Lorg/bouncycastle/crypto/params/RSAKeyGenerationParameters;

    invoke-virtual {v0, v1}, Lorg/bouncycastle/crypto/generators/RSAKeyPairGenerator;->init(Lorg/bouncycastle/crypto/KeyGenerationParameters;)V

    return-void
.end method

.method public initialize(Ljava/security/spec/AlgorithmParameterSpec;Ljava/security/SecureRandom;)V
    .locals 4

    instance-of v0, p1, Ljava/security/spec/RSAKeyGenParameterSpec;

    if-nez v0, :cond_0

    new-instance v0, Ljava/security/InvalidAlgorithmParameterException;

    const-string v1, "parameter object not a RSAKeyGenParameterSpec"

    invoke-direct {v0, v1}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    check-cast p1, Ljava/security/spec/RSAKeyGenParameterSpec;

    new-instance v0, Lorg/bouncycastle/crypto/params/RSAKeyGenerationParameters;

    invoke-virtual {p1}, Ljava/security/spec/RSAKeyGenParameterSpec;->getPublicExponent()Ljava/math/BigInteger;

    move-result-object v1

    invoke-virtual {p1}, Ljava/security/spec/RSAKeyGenParameterSpec;->getKeysize()I

    move-result v2

    const/16 v3, 0xc

    invoke-direct {v0, v1, p2, v2, v3}, Lorg/bouncycastle/crypto/params/RSAKeyGenerationParameters;-><init>(Ljava/math/BigInteger;Ljava/security/SecureRandom;II)V

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JDKKeyPairGenerator$RSA;->b:Lorg/bouncycastle/crypto/params/RSAKeyGenerationParameters;

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JDKKeyPairGenerator$RSA;->c:Lorg/bouncycastle/crypto/generators/RSAKeyPairGenerator;

    iget-object v1, p0, Lorg/bouncycastle/jce/provider/JDKKeyPairGenerator$RSA;->b:Lorg/bouncycastle/crypto/params/RSAKeyGenerationParameters;

    invoke-virtual {v0, v1}, Lorg/bouncycastle/crypto/generators/RSAKeyPairGenerator;->init(Lorg/bouncycastle/crypto/KeyGenerationParameters;)V

    return-void
.end method
