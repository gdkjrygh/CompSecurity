.class public Lorg/bouncycastle/crypto/engines/RSAEngine;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/bouncycastle/crypto/AsymmetricBlockCipher;


# instance fields
.field private a:Lorg/bouncycastle/crypto/engines/a;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getInputBlockSize()I
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/RSAEngine;->a:Lorg/bouncycastle/crypto/engines/a;

    invoke-virtual {v0}, Lorg/bouncycastle/crypto/engines/a;->getInputBlockSize()I

    move-result v0

    return v0
.end method

.method public getOutputBlockSize()I
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/RSAEngine;->a:Lorg/bouncycastle/crypto/engines/a;

    invoke-virtual {v0}, Lorg/bouncycastle/crypto/engines/a;->getOutputBlockSize()I

    move-result v0

    return v0
.end method

.method public init(ZLorg/bouncycastle/crypto/CipherParameters;)V
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/RSAEngine;->a:Lorg/bouncycastle/crypto/engines/a;

    if-nez v0, :cond_0

    new-instance v0, Lorg/bouncycastle/crypto/engines/a;

    invoke-direct {v0}, Lorg/bouncycastle/crypto/engines/a;-><init>()V

    iput-object v0, p0, Lorg/bouncycastle/crypto/engines/RSAEngine;->a:Lorg/bouncycastle/crypto/engines/a;

    :cond_0
    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/RSAEngine;->a:Lorg/bouncycastle/crypto/engines/a;

    invoke-virtual {v0, p1, p2}, Lorg/bouncycastle/crypto/engines/a;->init(ZLorg/bouncycastle/crypto/CipherParameters;)V

    return-void
.end method

.method public processBlock([BII)[B
    .locals 3

    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/RSAEngine;->a:Lorg/bouncycastle/crypto/engines/a;

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "RSA engine not initialised"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/RSAEngine;->a:Lorg/bouncycastle/crypto/engines/a;

    iget-object v1, p0, Lorg/bouncycastle/crypto/engines/RSAEngine;->a:Lorg/bouncycastle/crypto/engines/a;

    iget-object v2, p0, Lorg/bouncycastle/crypto/engines/RSAEngine;->a:Lorg/bouncycastle/crypto/engines/a;

    invoke-virtual {v2, p1, p2, p3}, Lorg/bouncycastle/crypto/engines/a;->convertInput([BII)Ljava/math/BigInteger;

    move-result-object v2

    invoke-virtual {v1, v2}, Lorg/bouncycastle/crypto/engines/a;->processBlock(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/bouncycastle/crypto/engines/a;->convertOutput(Ljava/math/BigInteger;)[B

    move-result-object v0

    return-object v0
.end method
