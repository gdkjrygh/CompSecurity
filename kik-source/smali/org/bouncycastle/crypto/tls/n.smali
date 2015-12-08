.class final Lorg/bouncycastle/crypto/tls/n;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/bouncycastle/crypto/tls/p;


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final calculateRawSignature(Ljava/security/SecureRandom;Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;[B)[B
    .locals 3

    new-instance v0, Lorg/bouncycastle/crypto/signers/GenericSigner;

    new-instance v1, Lorg/bouncycastle/crypto/encodings/PKCS1Encoding;

    new-instance v2, Lorg/bouncycastle/crypto/engines/RSABlindedEngine;

    invoke-direct {v2}, Lorg/bouncycastle/crypto/engines/RSABlindedEngine;-><init>()V

    invoke-direct {v1, v2}, Lorg/bouncycastle/crypto/encodings/PKCS1Encoding;-><init>(Lorg/bouncycastle/crypto/AsymmetricBlockCipher;)V

    new-instance v2, Lorg/bouncycastle/crypto/digests/NullDigest;

    invoke-direct {v2}, Lorg/bouncycastle/crypto/digests/NullDigest;-><init>()V

    invoke-direct {v0, v1, v2}, Lorg/bouncycastle/crypto/signers/GenericSigner;-><init>(Lorg/bouncycastle/crypto/AsymmetricBlockCipher;Lorg/bouncycastle/crypto/Digest;)V

    const/4 v1, 0x1

    new-instance v2, Lorg/bouncycastle/crypto/params/ParametersWithRandom;

    invoke-direct {v2, p2, p1}, Lorg/bouncycastle/crypto/params/ParametersWithRandom;-><init>(Lorg/bouncycastle/crypto/CipherParameters;Ljava/security/SecureRandom;)V

    invoke-interface {v0, v1, v2}, Lorg/bouncycastle/crypto/Signer;->init(ZLorg/bouncycastle/crypto/CipherParameters;)V

    const/4 v1, 0x0

    array-length v2, p3

    invoke-interface {v0, p3, v1, v2}, Lorg/bouncycastle/crypto/Signer;->update([BII)V

    invoke-interface {v0}, Lorg/bouncycastle/crypto/Signer;->generateSignature()[B

    move-result-object v0

    return-object v0
.end method

.method public final createVerifyer(Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;)Lorg/bouncycastle/crypto/Signer;
    .locals 3

    new-instance v0, Lorg/bouncycastle/crypto/signers/GenericSigner;

    new-instance v1, Lorg/bouncycastle/crypto/encodings/PKCS1Encoding;

    new-instance v2, Lorg/bouncycastle/crypto/engines/RSABlindedEngine;

    invoke-direct {v2}, Lorg/bouncycastle/crypto/engines/RSABlindedEngine;-><init>()V

    invoke-direct {v1, v2}, Lorg/bouncycastle/crypto/encodings/PKCS1Encoding;-><init>(Lorg/bouncycastle/crypto/AsymmetricBlockCipher;)V

    new-instance v2, Lorg/bouncycastle/crypto/tls/a;

    invoke-direct {v2}, Lorg/bouncycastle/crypto/tls/a;-><init>()V

    invoke-direct {v0, v1, v2}, Lorg/bouncycastle/crypto/signers/GenericSigner;-><init>(Lorg/bouncycastle/crypto/AsymmetricBlockCipher;Lorg/bouncycastle/crypto/Digest;)V

    const/4 v1, 0x0

    invoke-interface {v0, v1, p1}, Lorg/bouncycastle/crypto/Signer;->init(ZLorg/bouncycastle/crypto/CipherParameters;)V

    return-object v0
.end method

.method public final isValidPublicKey(Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;)Z
    .locals 1

    instance-of v0, p1, Lorg/bouncycastle/crypto/params/RSAKeyParameters;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;->isPrivate()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
