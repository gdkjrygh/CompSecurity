.class public Lorg/bouncycastle/crypto/generators/GOST3410KeyPairGenerator;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/bouncycastle/crypto/AsymmetricCipherKeyPairGenerator;


# static fields
.field private static final a:Ljava/math/BigInteger;


# instance fields
.field private b:Lorg/bouncycastle/crypto/params/GOST3410KeyGenerationParameters;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-wide/16 v0, 0x0

    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v0

    sput-object v0, Lorg/bouncycastle/crypto/generators/GOST3410KeyPairGenerator;->a:Ljava/math/BigInteger;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public generateKeyPair()Lorg/bouncycastle/crypto/AsymmetricCipherKeyPair;
    .locals 7

    iget-object v0, p0, Lorg/bouncycastle/crypto/generators/GOST3410KeyPairGenerator;->b:Lorg/bouncycastle/crypto/params/GOST3410KeyGenerationParameters;

    invoke-virtual {v0}, Lorg/bouncycastle/crypto/params/GOST3410KeyGenerationParameters;->getParameters()Lorg/bouncycastle/crypto/params/GOST3410Parameters;

    move-result-object v0

    iget-object v1, p0, Lorg/bouncycastle/crypto/generators/GOST3410KeyPairGenerator;->b:Lorg/bouncycastle/crypto/params/GOST3410KeyGenerationParameters;

    invoke-virtual {v1}, Lorg/bouncycastle/crypto/params/GOST3410KeyGenerationParameters;->getRandom()Ljava/security/SecureRandom;

    move-result-object v1

    invoke-virtual {v0}, Lorg/bouncycastle/crypto/params/GOST3410Parameters;->getQ()Ljava/math/BigInteger;

    move-result-object v2

    invoke-virtual {v0}, Lorg/bouncycastle/crypto/params/GOST3410Parameters;->getP()Ljava/math/BigInteger;

    move-result-object v3

    invoke-virtual {v0}, Lorg/bouncycastle/crypto/params/GOST3410Parameters;->getA()Ljava/math/BigInteger;

    move-result-object v4

    :cond_0
    new-instance v5, Ljava/math/BigInteger;

    const/16 v6, 0x100

    invoke-direct {v5, v6, v1}, Ljava/math/BigInteger;-><init>(ILjava/util/Random;)V

    sget-object v6, Lorg/bouncycastle/crypto/generators/GOST3410KeyPairGenerator;->a:Ljava/math/BigInteger;

    invoke-virtual {v5, v6}, Ljava/math/BigInteger;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_0

    invoke-virtual {v5, v2}, Ljava/math/BigInteger;->compareTo(Ljava/math/BigInteger;)I

    move-result v6

    if-gez v6, :cond_0

    invoke-virtual {v4, v5, v3}, Ljava/math/BigInteger;->modPow(Ljava/math/BigInteger;Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v1

    new-instance v2, Lorg/bouncycastle/crypto/AsymmetricCipherKeyPair;

    new-instance v3, Lorg/bouncycastle/crypto/params/GOST3410PublicKeyParameters;

    invoke-direct {v3, v1, v0}, Lorg/bouncycastle/crypto/params/GOST3410PublicKeyParameters;-><init>(Ljava/math/BigInteger;Lorg/bouncycastle/crypto/params/GOST3410Parameters;)V

    new-instance v1, Lorg/bouncycastle/crypto/params/GOST3410PrivateKeyParameters;

    invoke-direct {v1, v5, v0}, Lorg/bouncycastle/crypto/params/GOST3410PrivateKeyParameters;-><init>(Ljava/math/BigInteger;Lorg/bouncycastle/crypto/params/GOST3410Parameters;)V

    invoke-direct {v2, v3, v1}, Lorg/bouncycastle/crypto/AsymmetricCipherKeyPair;-><init>(Lorg/bouncycastle/crypto/CipherParameters;Lorg/bouncycastle/crypto/CipherParameters;)V

    return-object v2
.end method

.method public init(Lorg/bouncycastle/crypto/KeyGenerationParameters;)V
    .locals 0

    check-cast p1, Lorg/bouncycastle/crypto/params/GOST3410KeyGenerationParameters;

    iput-object p1, p0, Lorg/bouncycastle/crypto/generators/GOST3410KeyPairGenerator;->b:Lorg/bouncycastle/crypto/params/GOST3410KeyGenerationParameters;

    return-void
.end method
