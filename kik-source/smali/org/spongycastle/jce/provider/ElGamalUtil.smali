.class public Lorg/spongycastle/jce/provider/ElGamalUtil;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/security/PrivateKey;)Lorg/spongycastle/crypto/params/AsymmetricKeyParameter;
    .locals 5

    .prologue
    .line 49
    instance-of v0, p0, Lorg/spongycastle/jce/interfaces/ElGamalPrivateKey;

    if-eqz v0, :cond_0

    .line 51
    check-cast p0, Lorg/spongycastle/jce/interfaces/ElGamalPrivateKey;

    .line 53
    new-instance v0, Lorg/spongycastle/crypto/params/ElGamalPrivateKeyParameters;

    invoke-interface {p0}, Lorg/spongycastle/jce/interfaces/ElGamalPrivateKey;->getX()Ljava/math/BigInteger;

    move-result-object v1

    new-instance v2, Lorg/spongycastle/crypto/params/ElGamalParameters;

    invoke-interface {p0}, Lorg/spongycastle/jce/interfaces/ElGamalPrivateKey;->b()Lorg/spongycastle/jce/spec/ElGamalParameterSpec;

    move-result-object v3

    invoke-virtual {v3}, Lorg/spongycastle/jce/spec/ElGamalParameterSpec;->a()Ljava/math/BigInteger;

    move-result-object v3

    invoke-interface {p0}, Lorg/spongycastle/jce/interfaces/ElGamalPrivateKey;->b()Lorg/spongycastle/jce/spec/ElGamalParameterSpec;

    move-result-object v4

    invoke-virtual {v4}, Lorg/spongycastle/jce/spec/ElGamalParameterSpec;->b()Ljava/math/BigInteger;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Lorg/spongycastle/crypto/params/ElGamalParameters;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    invoke-direct {v0, v1, v2}, Lorg/spongycastle/crypto/params/ElGamalPrivateKeyParameters;-><init>(Ljava/math/BigInteger;Lorg/spongycastle/crypto/params/ElGamalParameters;)V

    .line 60
    :goto_0
    return-object v0

    .line 56
    :cond_0
    instance-of v0, p0, Ljavax/crypto/interfaces/DHPrivateKey;

    if-eqz v0, :cond_1

    .line 58
    check-cast p0, Ljavax/crypto/interfaces/DHPrivateKey;

    .line 60
    new-instance v0, Lorg/spongycastle/crypto/params/ElGamalPrivateKeyParameters;

    invoke-interface {p0}, Ljavax/crypto/interfaces/DHPrivateKey;->getX()Ljava/math/BigInteger;

    move-result-object v1

    new-instance v2, Lorg/spongycastle/crypto/params/ElGamalParameters;

    invoke-interface {p0}, Ljavax/crypto/interfaces/DHPrivateKey;->getParams()Ljavax/crypto/spec/DHParameterSpec;

    move-result-object v3

    invoke-virtual {v3}, Ljavax/crypto/spec/DHParameterSpec;->getP()Ljava/math/BigInteger;

    move-result-object v3

    invoke-interface {p0}, Ljavax/crypto/interfaces/DHPrivateKey;->getParams()Ljavax/crypto/spec/DHParameterSpec;

    move-result-object v4

    invoke-virtual {v4}, Ljavax/crypto/spec/DHParameterSpec;->getG()Ljava/math/BigInteger;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Lorg/spongycastle/crypto/params/ElGamalParameters;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    invoke-direct {v0, v1, v2}, Lorg/spongycastle/crypto/params/ElGamalPrivateKeyParameters;-><init>(Ljava/math/BigInteger;Lorg/spongycastle/crypto/params/ElGamalParameters;)V

    goto :goto_0

    .line 64
    :cond_1
    new-instance v0, Ljava/security/InvalidKeyException;

    const-string v1, "can\'t identify private key for El Gamal."

    invoke-direct {v0, v1}, Ljava/security/InvalidKeyException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static a(Ljava/security/PublicKey;)Lorg/spongycastle/crypto/params/AsymmetricKeyParameter;
    .locals 5

    .prologue
    .line 27
    instance-of v0, p0, Lorg/spongycastle/jce/interfaces/ElGamalPublicKey;

    if-eqz v0, :cond_0

    .line 29
    check-cast p0, Lorg/spongycastle/jce/interfaces/ElGamalPublicKey;

    .line 31
    new-instance v0, Lorg/spongycastle/crypto/params/ElGamalPublicKeyParameters;

    invoke-interface {p0}, Lorg/spongycastle/jce/interfaces/ElGamalPublicKey;->getY()Ljava/math/BigInteger;

    move-result-object v1

    new-instance v2, Lorg/spongycastle/crypto/params/ElGamalParameters;

    invoke-interface {p0}, Lorg/spongycastle/jce/interfaces/ElGamalPublicKey;->b()Lorg/spongycastle/jce/spec/ElGamalParameterSpec;

    move-result-object v3

    invoke-virtual {v3}, Lorg/spongycastle/jce/spec/ElGamalParameterSpec;->a()Ljava/math/BigInteger;

    move-result-object v3

    invoke-interface {p0}, Lorg/spongycastle/jce/interfaces/ElGamalPublicKey;->b()Lorg/spongycastle/jce/spec/ElGamalParameterSpec;

    move-result-object v4

    invoke-virtual {v4}, Lorg/spongycastle/jce/spec/ElGamalParameterSpec;->b()Ljava/math/BigInteger;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Lorg/spongycastle/crypto/params/ElGamalParameters;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    invoke-direct {v0, v1, v2}, Lorg/spongycastle/crypto/params/ElGamalPublicKeyParameters;-><init>(Ljava/math/BigInteger;Lorg/spongycastle/crypto/params/ElGamalParameters;)V

    .line 38
    :goto_0
    return-object v0

    .line 34
    :cond_0
    instance-of v0, p0, Ljavax/crypto/interfaces/DHPublicKey;

    if-eqz v0, :cond_1

    .line 36
    check-cast p0, Ljavax/crypto/interfaces/DHPublicKey;

    .line 38
    new-instance v0, Lorg/spongycastle/crypto/params/ElGamalPublicKeyParameters;

    invoke-interface {p0}, Ljavax/crypto/interfaces/DHPublicKey;->getY()Ljava/math/BigInteger;

    move-result-object v1

    new-instance v2, Lorg/spongycastle/crypto/params/ElGamalParameters;

    invoke-interface {p0}, Ljavax/crypto/interfaces/DHPublicKey;->getParams()Ljavax/crypto/spec/DHParameterSpec;

    move-result-object v3

    invoke-virtual {v3}, Ljavax/crypto/spec/DHParameterSpec;->getP()Ljava/math/BigInteger;

    move-result-object v3

    invoke-interface {p0}, Ljavax/crypto/interfaces/DHPublicKey;->getParams()Ljavax/crypto/spec/DHParameterSpec;

    move-result-object v4

    invoke-virtual {v4}, Ljavax/crypto/spec/DHParameterSpec;->getG()Ljava/math/BigInteger;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Lorg/spongycastle/crypto/params/ElGamalParameters;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    invoke-direct {v0, v1, v2}, Lorg/spongycastle/crypto/params/ElGamalPublicKeyParameters;-><init>(Ljava/math/BigInteger;Lorg/spongycastle/crypto/params/ElGamalParameters;)V

    goto :goto_0

    .line 42
    :cond_1
    new-instance v0, Ljava/security/InvalidKeyException;

    const-string v1, "can\'t identify public key for El Gamal."

    invoke-direct {v0, v1}, Ljava/security/InvalidKeyException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
