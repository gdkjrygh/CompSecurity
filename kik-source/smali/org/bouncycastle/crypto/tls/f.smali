.class abstract Lorg/bouncycastle/crypto/tls/f;
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
.method public calculateRawSignature(Ljava/security/SecureRandom;Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;[B)[B
    .locals 3

    new-instance v0, Lorg/bouncycastle/crypto/signers/DSADigestSigner;

    invoke-virtual {p0}, Lorg/bouncycastle/crypto/tls/f;->createDSAImpl()Lorg/bouncycastle/crypto/DSA;

    move-result-object v1

    new-instance v2, Lorg/bouncycastle/crypto/digests/NullDigest;

    invoke-direct {v2}, Lorg/bouncycastle/crypto/digests/NullDigest;-><init>()V

    invoke-direct {v0, v1, v2}, Lorg/bouncycastle/crypto/signers/DSADigestSigner;-><init>(Lorg/bouncycastle/crypto/DSA;Lorg/bouncycastle/crypto/Digest;)V

    const/4 v1, 0x1

    new-instance v2, Lorg/bouncycastle/crypto/params/ParametersWithRandom;

    invoke-direct {v2, p2, p1}, Lorg/bouncycastle/crypto/params/ParametersWithRandom;-><init>(Lorg/bouncycastle/crypto/CipherParameters;Ljava/security/SecureRandom;)V

    invoke-interface {v0, v1, v2}, Lorg/bouncycastle/crypto/Signer;->init(ZLorg/bouncycastle/crypto/CipherParameters;)V

    const/16 v1, 0x10

    const/16 v2, 0x14

    invoke-interface {v0, p3, v1, v2}, Lorg/bouncycastle/crypto/Signer;->update([BII)V

    invoke-interface {v0}, Lorg/bouncycastle/crypto/Signer;->generateSignature()[B

    move-result-object v0

    return-object v0
.end method

.method protected abstract createDSAImpl()Lorg/bouncycastle/crypto/DSA;
.end method

.method public createVerifyer(Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;)Lorg/bouncycastle/crypto/Signer;
    .locals 3

    new-instance v0, Lorg/bouncycastle/crypto/signers/DSADigestSigner;

    invoke-virtual {p0}, Lorg/bouncycastle/crypto/tls/f;->createDSAImpl()Lorg/bouncycastle/crypto/DSA;

    move-result-object v1

    new-instance v2, Lorg/bouncycastle/crypto/digests/SHA1Digest;

    invoke-direct {v2}, Lorg/bouncycastle/crypto/digests/SHA1Digest;-><init>()V

    invoke-direct {v0, v1, v2}, Lorg/bouncycastle/crypto/signers/DSADigestSigner;-><init>(Lorg/bouncycastle/crypto/DSA;Lorg/bouncycastle/crypto/Digest;)V

    const/4 v1, 0x0

    invoke-interface {v0, v1, p1}, Lorg/bouncycastle/crypto/Signer;->init(ZLorg/bouncycastle/crypto/CipherParameters;)V

    return-object v0
.end method
