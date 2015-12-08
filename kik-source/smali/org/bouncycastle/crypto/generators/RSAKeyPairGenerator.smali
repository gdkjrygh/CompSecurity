.class public Lorg/bouncycastle/crypto/generators/RSAKeyPairGenerator;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/bouncycastle/crypto/AsymmetricCipherKeyPairGenerator;


# static fields
.field private static final a:Ljava/math/BigInteger;


# instance fields
.field private b:Lorg/bouncycastle/crypto/params/RSAKeyGenerationParameters;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-wide/16 v0, 0x1

    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v0

    sput-object v0, Lorg/bouncycastle/crypto/generators/RSAKeyPairGenerator;->a:Ljava/math/BigInteger;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public generateKeyPair()Lorg/bouncycastle/crypto/AsymmetricCipherKeyPair;
    .locals 11

    const/4 v8, 0x1

    iget-object v0, p0, Lorg/bouncycastle/crypto/generators/RSAKeyPairGenerator;->b:Lorg/bouncycastle/crypto/params/RSAKeyGenerationParameters;

    invoke-virtual {v0}, Lorg/bouncycastle/crypto/params/RSAKeyGenerationParameters;->getStrength()I

    move-result v0

    add-int/lit8 v1, v0, 0x1

    div-int/lit8 v1, v1, 0x2

    sub-int v3, v0, v1

    div-int/lit8 v4, v0, 0x3

    iget-object v0, p0, Lorg/bouncycastle/crypto/generators/RSAKeyPairGenerator;->b:Lorg/bouncycastle/crypto/params/RSAKeyGenerationParameters;

    invoke-virtual {v0}, Lorg/bouncycastle/crypto/params/RSAKeyGenerationParameters;->getPublicExponent()Ljava/math/BigInteger;

    move-result-object v2

    :cond_0
    new-instance v0, Ljava/math/BigInteger;

    iget-object v5, p0, Lorg/bouncycastle/crypto/generators/RSAKeyPairGenerator;->b:Lorg/bouncycastle/crypto/params/RSAKeyGenerationParameters;

    invoke-virtual {v5}, Lorg/bouncycastle/crypto/params/RSAKeyGenerationParameters;->getRandom()Ljava/security/SecureRandom;

    move-result-object v5

    invoke-direct {v0, v1, v8, v5}, Ljava/math/BigInteger;-><init>(IILjava/util/Random;)V

    invoke-virtual {v0, v2}, Ljava/math/BigInteger;->mod(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v5

    sget-object v6, Lorg/bouncycastle/crypto/generators/RSAKeyPairGenerator;->a:Ljava/math/BigInteger;

    invoke-virtual {v5, v6}, Ljava/math/BigInteger;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_0

    iget-object v5, p0, Lorg/bouncycastle/crypto/generators/RSAKeyPairGenerator;->b:Lorg/bouncycastle/crypto/params/RSAKeyGenerationParameters;

    invoke-virtual {v5}, Lorg/bouncycastle/crypto/params/RSAKeyGenerationParameters;->getCertainty()I

    move-result v5

    invoke-virtual {v0, v5}, Ljava/math/BigInteger;->isProbablePrime(I)Z

    move-result v5

    if-eqz v5, :cond_0

    sget-object v5, Lorg/bouncycastle/crypto/generators/RSAKeyPairGenerator;->a:Ljava/math/BigInteger;

    invoke-virtual {v0, v5}, Ljava/math/BigInteger;->subtract(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/math/BigInteger;->gcd(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v5

    sget-object v6, Lorg/bouncycastle/crypto/generators/RSAKeyPairGenerator;->a:Ljava/math/BigInteger;

    invoke-virtual {v5, v6}, Ljava/math/BigInteger;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    :cond_1
    :goto_0
    new-instance v5, Ljava/math/BigInteger;

    iget-object v1, p0, Lorg/bouncycastle/crypto/generators/RSAKeyPairGenerator;->b:Lorg/bouncycastle/crypto/params/RSAKeyGenerationParameters;

    invoke-virtual {v1}, Lorg/bouncycastle/crypto/params/RSAKeyGenerationParameters;->getRandom()Ljava/security/SecureRandom;

    move-result-object v1

    invoke-direct {v5, v3, v8, v1}, Ljava/math/BigInteger;-><init>(IILjava/util/Random;)V

    invoke-virtual {v5, v0}, Ljava/math/BigInteger;->subtract(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v1

    invoke-virtual {v1}, Ljava/math/BigInteger;->abs()Ljava/math/BigInteger;

    move-result-object v1

    invoke-virtual {v1}, Ljava/math/BigInteger;->bitLength()I

    move-result v1

    if-lt v1, v4, :cond_1

    invoke-virtual {v5, v2}, Ljava/math/BigInteger;->mod(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v1

    sget-object v6, Lorg/bouncycastle/crypto/generators/RSAKeyPairGenerator;->a:Ljava/math/BigInteger;

    invoke-virtual {v1, v6}, Ljava/math/BigInteger;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, p0, Lorg/bouncycastle/crypto/generators/RSAKeyPairGenerator;->b:Lorg/bouncycastle/crypto/params/RSAKeyGenerationParameters;

    invoke-virtual {v1}, Lorg/bouncycastle/crypto/params/RSAKeyGenerationParameters;->getCertainty()I

    move-result v1

    invoke-virtual {v5, v1}, Ljava/math/BigInteger;->isProbablePrime(I)Z

    move-result v1

    if-eqz v1, :cond_1

    sget-object v1, Lorg/bouncycastle/crypto/generators/RSAKeyPairGenerator;->a:Ljava/math/BigInteger;

    invoke-virtual {v5, v1}, Ljava/math/BigInteger;->subtract(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/math/BigInteger;->gcd(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v1

    sget-object v6, Lorg/bouncycastle/crypto/generators/RSAKeyPairGenerator;->a:Ljava/math/BigInteger;

    invoke-virtual {v1, v6}, Ljava/math/BigInteger;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {v0, v5}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v1

    invoke-virtual {v1}, Ljava/math/BigInteger;->bitLength()I

    move-result v6

    iget-object v7, p0, Lorg/bouncycastle/crypto/generators/RSAKeyPairGenerator;->b:Lorg/bouncycastle/crypto/params/RSAKeyGenerationParameters;

    invoke-virtual {v7}, Lorg/bouncycastle/crypto/params/RSAKeyGenerationParameters;->getStrength()I

    move-result v7

    if-eq v6, v7, :cond_2

    invoke-virtual {v0, v5}, Ljava/math/BigInteger;->max(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    goto :goto_0

    :cond_2
    invoke-virtual {v0, v5}, Ljava/math/BigInteger;->compareTo(Ljava/math/BigInteger;)I

    move-result v3

    if-gez v3, :cond_3

    move-object v4, v5

    move-object v5, v0

    :goto_1
    sget-object v0, Lorg/bouncycastle/crypto/generators/RSAKeyPairGenerator;->a:Ljava/math/BigInteger;

    invoke-virtual {v4, v0}, Ljava/math/BigInteger;->subtract(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    sget-object v3, Lorg/bouncycastle/crypto/generators/RSAKeyPairGenerator;->a:Ljava/math/BigInteger;

    invoke-virtual {v5, v3}, Ljava/math/BigInteger;->subtract(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v7

    invoke-virtual {v0, v7}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/math/BigInteger;->modInverse(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/math/BigInteger;->remainder(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v6

    invoke-virtual {v3, v7}, Ljava/math/BigInteger;->remainder(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v7

    invoke-virtual {v5, v4}, Ljava/math/BigInteger;->modInverse(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v8

    new-instance v9, Lorg/bouncycastle/crypto/AsymmetricCipherKeyPair;

    new-instance v10, Lorg/bouncycastle/crypto/params/RSAKeyParameters;

    const/4 v0, 0x0

    invoke-direct {v10, v0, v1, v2}, Lorg/bouncycastle/crypto/params/RSAKeyParameters;-><init>(ZLjava/math/BigInteger;Ljava/math/BigInteger;)V

    new-instance v0, Lorg/bouncycastle/crypto/params/RSAPrivateCrtKeyParameters;

    invoke-direct/range {v0 .. v8}, Lorg/bouncycastle/crypto/params/RSAPrivateCrtKeyParameters;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    invoke-direct {v9, v10, v0}, Lorg/bouncycastle/crypto/AsymmetricCipherKeyPair;-><init>(Lorg/bouncycastle/crypto/CipherParameters;Lorg/bouncycastle/crypto/CipherParameters;)V

    return-object v9

    :cond_3
    move-object v4, v0

    goto :goto_1
.end method

.method public init(Lorg/bouncycastle/crypto/KeyGenerationParameters;)V
    .locals 0

    check-cast p1, Lorg/bouncycastle/crypto/params/RSAKeyGenerationParameters;

    iput-object p1, p0, Lorg/bouncycastle/crypto/generators/RSAKeyPairGenerator;->b:Lorg/bouncycastle/crypto/params/RSAKeyGenerationParameters;

    return-void
.end method
