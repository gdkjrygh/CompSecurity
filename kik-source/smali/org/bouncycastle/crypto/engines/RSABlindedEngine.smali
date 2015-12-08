.class public Lorg/bouncycastle/crypto/engines/RSABlindedEngine;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/bouncycastle/crypto/AsymmetricBlockCipher;


# static fields
.field private static a:Ljava/math/BigInteger;


# instance fields
.field private b:Lorg/bouncycastle/crypto/engines/a;

.field private c:Lorg/bouncycastle/crypto/params/RSAKeyParameters;

.field private d:Ljava/security/SecureRandom;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-wide/16 v0, 0x1

    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v0

    sput-object v0, Lorg/bouncycastle/crypto/engines/RSABlindedEngine;->a:Ljava/math/BigInteger;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lorg/bouncycastle/crypto/engines/a;

    invoke-direct {v0}, Lorg/bouncycastle/crypto/engines/a;-><init>()V

    iput-object v0, p0, Lorg/bouncycastle/crypto/engines/RSABlindedEngine;->b:Lorg/bouncycastle/crypto/engines/a;

    return-void
.end method


# virtual methods
.method public getInputBlockSize()I
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/RSABlindedEngine;->b:Lorg/bouncycastle/crypto/engines/a;

    invoke-virtual {v0}, Lorg/bouncycastle/crypto/engines/a;->getInputBlockSize()I

    move-result v0

    return v0
.end method

.method public getOutputBlockSize()I
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/RSABlindedEngine;->b:Lorg/bouncycastle/crypto/engines/a;

    invoke-virtual {v0}, Lorg/bouncycastle/crypto/engines/a;->getOutputBlockSize()I

    move-result v0

    return v0
.end method

.method public init(ZLorg/bouncycastle/crypto/CipherParameters;)V
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/RSABlindedEngine;->b:Lorg/bouncycastle/crypto/engines/a;

    invoke-virtual {v0, p1, p2}, Lorg/bouncycastle/crypto/engines/a;->init(ZLorg/bouncycastle/crypto/CipherParameters;)V

    instance-of v0, p2, Lorg/bouncycastle/crypto/params/ParametersWithRandom;

    if-eqz v0, :cond_0

    check-cast p2, Lorg/bouncycastle/crypto/params/ParametersWithRandom;

    invoke-virtual {p2}, Lorg/bouncycastle/crypto/params/ParametersWithRandom;->getParameters()Lorg/bouncycastle/crypto/CipherParameters;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/crypto/params/RSAKeyParameters;

    iput-object v0, p0, Lorg/bouncycastle/crypto/engines/RSABlindedEngine;->c:Lorg/bouncycastle/crypto/params/RSAKeyParameters;

    invoke-virtual {p2}, Lorg/bouncycastle/crypto/params/ParametersWithRandom;->getRandom()Ljava/security/SecureRandom;

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/crypto/engines/RSABlindedEngine;->d:Ljava/security/SecureRandom;

    :goto_0
    return-void

    :cond_0
    check-cast p2, Lorg/bouncycastle/crypto/params/RSAKeyParameters;

    iput-object p2, p0, Lorg/bouncycastle/crypto/engines/RSABlindedEngine;->c:Lorg/bouncycastle/crypto/params/RSAKeyParameters;

    new-instance v0, Ljava/security/SecureRandom;

    invoke-direct {v0}, Ljava/security/SecureRandom;-><init>()V

    iput-object v0, p0, Lorg/bouncycastle/crypto/engines/RSABlindedEngine;->d:Ljava/security/SecureRandom;

    goto :goto_0
.end method

.method public processBlock([BII)[B
    .locals 6

    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/RSABlindedEngine;->c:Lorg/bouncycastle/crypto/params/RSAKeyParameters;

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "RSA engine not initialised"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/RSABlindedEngine;->b:Lorg/bouncycastle/crypto/engines/a;

    invoke-virtual {v0, p1, p2, p3}, Lorg/bouncycastle/crypto/engines/a;->convertInput([BII)Ljava/math/BigInteger;

    move-result-object v1

    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/RSABlindedEngine;->c:Lorg/bouncycastle/crypto/params/RSAKeyParameters;

    instance-of v0, v0, Lorg/bouncycastle/crypto/params/RSAPrivateCrtKeyParameters;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/RSABlindedEngine;->c:Lorg/bouncycastle/crypto/params/RSAKeyParameters;

    check-cast v0, Lorg/bouncycastle/crypto/params/RSAPrivateCrtKeyParameters;

    invoke-virtual {v0}, Lorg/bouncycastle/crypto/params/RSAPrivateCrtKeyParameters;->getPublicExponent()Ljava/math/BigInteger;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {v0}, Lorg/bouncycastle/crypto/params/RSAPrivateCrtKeyParameters;->getModulus()Ljava/math/BigInteger;

    move-result-object v0

    sget-object v3, Lorg/bouncycastle/crypto/engines/RSABlindedEngine;->a:Ljava/math/BigInteger;

    sget-object v4, Lorg/bouncycastle/crypto/engines/RSABlindedEngine;->a:Ljava/math/BigInteger;

    invoke-virtual {v0, v4}, Ljava/math/BigInteger;->subtract(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v4

    iget-object v5, p0, Lorg/bouncycastle/crypto/engines/RSABlindedEngine;->d:Ljava/security/SecureRandom;

    invoke-static {v3, v4, v5}, Lorg/bouncycastle/util/BigIntegers;->a(Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/security/SecureRandom;)Ljava/math/BigInteger;

    move-result-object v3

    invoke-virtual {v3, v2, v0}, Ljava/math/BigInteger;->modPow(Ljava/math/BigInteger;Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/math/BigInteger;->mod(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v1

    iget-object v2, p0, Lorg/bouncycastle/crypto/engines/RSABlindedEngine;->b:Lorg/bouncycastle/crypto/engines/a;

    invoke-virtual {v2, v1}, Lorg/bouncycastle/crypto/engines/a;->processBlock(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v1

    invoke-virtual {v3, v0}, Ljava/math/BigInteger;->modInverse(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/math/BigInteger;->mod(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    :goto_0
    iget-object v1, p0, Lorg/bouncycastle/crypto/engines/RSABlindedEngine;->b:Lorg/bouncycastle/crypto/engines/a;

    invoke-virtual {v1, v0}, Lorg/bouncycastle/crypto/engines/a;->convertOutput(Ljava/math/BigInteger;)[B

    move-result-object v0

    return-object v0

    :cond_1
    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/RSABlindedEngine;->b:Lorg/bouncycastle/crypto/engines/a;

    invoke-virtual {v0, v1}, Lorg/bouncycastle/crypto/engines/a;->processBlock(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/RSABlindedEngine;->b:Lorg/bouncycastle/crypto/engines/a;

    invoke-virtual {v0, v1}, Lorg/bouncycastle/crypto/engines/a;->processBlock(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    goto :goto_0
.end method
