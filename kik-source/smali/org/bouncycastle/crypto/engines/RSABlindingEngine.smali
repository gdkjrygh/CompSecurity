.class public Lorg/bouncycastle/crypto/engines/RSABlindingEngine;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/bouncycastle/crypto/AsymmetricBlockCipher;


# instance fields
.field private a:Lorg/bouncycastle/crypto/engines/a;

.field private b:Lorg/bouncycastle/crypto/params/RSAKeyParameters;

.field private c:Ljava/math/BigInteger;

.field private d:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lorg/bouncycastle/crypto/engines/a;

    invoke-direct {v0}, Lorg/bouncycastle/crypto/engines/a;-><init>()V

    iput-object v0, p0, Lorg/bouncycastle/crypto/engines/RSABlindingEngine;->a:Lorg/bouncycastle/crypto/engines/a;

    return-void
.end method

.method private blindMessage(Ljava/math/BigInteger;)Ljava/math/BigInteger;
    .locals 3

    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/RSABlindingEngine;->c:Ljava/math/BigInteger;

    iget-object v1, p0, Lorg/bouncycastle/crypto/engines/RSABlindingEngine;->b:Lorg/bouncycastle/crypto/params/RSAKeyParameters;

    invoke-virtual {v1}, Lorg/bouncycastle/crypto/params/RSAKeyParameters;->getExponent()Ljava/math/BigInteger;

    move-result-object v1

    iget-object v2, p0, Lorg/bouncycastle/crypto/engines/RSABlindingEngine;->b:Lorg/bouncycastle/crypto/params/RSAKeyParameters;

    invoke-virtual {v2}, Lorg/bouncycastle/crypto/params/RSAKeyParameters;->getModulus()Ljava/math/BigInteger;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/math/BigInteger;->modPow(Ljava/math/BigInteger;Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    iget-object v1, p0, Lorg/bouncycastle/crypto/engines/RSABlindingEngine;->b:Lorg/bouncycastle/crypto/params/RSAKeyParameters;

    invoke-virtual {v1}, Lorg/bouncycastle/crypto/params/RSAKeyParameters;->getModulus()Ljava/math/BigInteger;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/math/BigInteger;->mod(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    return-object v0
.end method

.method private unblindMessage(Ljava/math/BigInteger;)Ljava/math/BigInteger;
    .locals 2

    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/RSABlindingEngine;->b:Lorg/bouncycastle/crypto/params/RSAKeyParameters;

    invoke-virtual {v0}, Lorg/bouncycastle/crypto/params/RSAKeyParameters;->getModulus()Ljava/math/BigInteger;

    move-result-object v0

    iget-object v1, p0, Lorg/bouncycastle/crypto/engines/RSABlindingEngine;->c:Ljava/math/BigInteger;

    invoke-virtual {v1, v0}, Ljava/math/BigInteger;->modInverse(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/math/BigInteger;->mod(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public getInputBlockSize()I
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/RSABlindingEngine;->a:Lorg/bouncycastle/crypto/engines/a;

    invoke-virtual {v0}, Lorg/bouncycastle/crypto/engines/a;->getInputBlockSize()I

    move-result v0

    return v0
.end method

.method public getOutputBlockSize()I
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/RSABlindingEngine;->a:Lorg/bouncycastle/crypto/engines/a;

    invoke-virtual {v0}, Lorg/bouncycastle/crypto/engines/a;->getOutputBlockSize()I

    move-result v0

    return v0
.end method

.method public init(ZLorg/bouncycastle/crypto/CipherParameters;)V
    .locals 3

    instance-of v0, p2, Lorg/bouncycastle/crypto/params/ParametersWithRandom;

    if-eqz v0, :cond_0

    check-cast p2, Lorg/bouncycastle/crypto/params/ParametersWithRandom;

    invoke-virtual {p2}, Lorg/bouncycastle/crypto/params/ParametersWithRandom;->getParameters()Lorg/bouncycastle/crypto/CipherParameters;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/crypto/params/RSABlindingParameters;

    :goto_0
    iget-object v1, p0, Lorg/bouncycastle/crypto/engines/RSABlindingEngine;->a:Lorg/bouncycastle/crypto/engines/a;

    invoke-virtual {v0}, Lorg/bouncycastle/crypto/params/RSABlindingParameters;->getPublicKey()Lorg/bouncycastle/crypto/params/RSAKeyParameters;

    move-result-object v2

    invoke-virtual {v1, p1, v2}, Lorg/bouncycastle/crypto/engines/a;->init(ZLorg/bouncycastle/crypto/CipherParameters;)V

    iput-boolean p1, p0, Lorg/bouncycastle/crypto/engines/RSABlindingEngine;->d:Z

    invoke-virtual {v0}, Lorg/bouncycastle/crypto/params/RSABlindingParameters;->getPublicKey()Lorg/bouncycastle/crypto/params/RSAKeyParameters;

    move-result-object v1

    iput-object v1, p0, Lorg/bouncycastle/crypto/engines/RSABlindingEngine;->b:Lorg/bouncycastle/crypto/params/RSAKeyParameters;

    invoke-virtual {v0}, Lorg/bouncycastle/crypto/params/RSABlindingParameters;->getBlindingFactor()Ljava/math/BigInteger;

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/crypto/engines/RSABlindingEngine;->c:Ljava/math/BigInteger;

    return-void

    :cond_0
    check-cast p2, Lorg/bouncycastle/crypto/params/RSABlindingParameters;

    move-object v0, p2

    goto :goto_0
.end method

.method public processBlock([BII)[B
    .locals 2

    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/RSABlindingEngine;->a:Lorg/bouncycastle/crypto/engines/a;

    invoke-virtual {v0, p1, p2, p3}, Lorg/bouncycastle/crypto/engines/a;->convertInput([BII)Ljava/math/BigInteger;

    move-result-object v0

    iget-boolean v1, p0, Lorg/bouncycastle/crypto/engines/RSABlindingEngine;->d:Z

    if-eqz v1, :cond_0

    invoke-direct {p0, v0}, Lorg/bouncycastle/crypto/engines/RSABlindingEngine;->blindMessage(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    :goto_0
    iget-object v1, p0, Lorg/bouncycastle/crypto/engines/RSABlindingEngine;->a:Lorg/bouncycastle/crypto/engines/a;

    invoke-virtual {v1, v0}, Lorg/bouncycastle/crypto/engines/a;->convertOutput(Ljava/math/BigInteger;)[B

    move-result-object v0

    return-object v0

    :cond_0
    invoke-direct {p0, v0}, Lorg/bouncycastle/crypto/engines/RSABlindingEngine;->unblindMessage(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    goto :goto_0
.end method
