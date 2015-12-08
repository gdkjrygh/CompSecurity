.class public Lorg/bouncycastle/jce/provider/asymmetric/ec/Signature;
.super Lorg/bouncycastle/jce/provider/DSABase;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/bouncycastle/jce/provider/asymmetric/ec/Signature$a;,
        Lorg/bouncycastle/jce/provider/asymmetric/ec/Signature$b;,
        Lorg/bouncycastle/jce/provider/asymmetric/ec/Signature$ecCVCDSA;,
        Lorg/bouncycastle/jce/provider/asymmetric/ec/Signature$ecCVCDSA224;,
        Lorg/bouncycastle/jce/provider/asymmetric/ec/Signature$ecCVCDSA256;,
        Lorg/bouncycastle/jce/provider/asymmetric/ec/Signature$ecDSA;,
        Lorg/bouncycastle/jce/provider/asymmetric/ec/Signature$ecDSA224;,
        Lorg/bouncycastle/jce/provider/asymmetric/ec/Signature$ecDSA256;,
        Lorg/bouncycastle/jce/provider/asymmetric/ec/Signature$ecDSA384;,
        Lorg/bouncycastle/jce/provider/asymmetric/ec/Signature$ecDSA512;,
        Lorg/bouncycastle/jce/provider/asymmetric/ec/Signature$ecDSARipeMD160;,
        Lorg/bouncycastle/jce/provider/asymmetric/ec/Signature$ecDSAnone;,
        Lorg/bouncycastle/jce/provider/asymmetric/ec/Signature$ecNR;,
        Lorg/bouncycastle/jce/provider/asymmetric/ec/Signature$ecNR224;,
        Lorg/bouncycastle/jce/provider/asymmetric/ec/Signature$ecNR256;,
        Lorg/bouncycastle/jce/provider/asymmetric/ec/Signature$ecNR384;,
        Lorg/bouncycastle/jce/provider/asymmetric/ec/Signature$ecNR512;
    }
.end annotation


# direct methods
.method constructor <init>(Lorg/bouncycastle/crypto/Digest;Lorg/bouncycastle/crypto/DSA;Lorg/bouncycastle/jce/provider/DSAEncoder;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lorg/bouncycastle/jce/provider/DSABase;-><init>(Lorg/bouncycastle/crypto/Digest;Lorg/bouncycastle/crypto/DSA;Lorg/bouncycastle/jce/provider/DSAEncoder;)V

    return-void
.end method


# virtual methods
.method protected engineInitSign(Ljava/security/PrivateKey;Ljava/security/SecureRandom;)V
    .locals 4

    const/4 v3, 0x1

    instance-of v0, p1, Lorg/bouncycastle/jce/interfaces/ECKey;

    if-eqz v0, :cond_0

    invoke-static {p1}, Lorg/bouncycastle/jce/provider/asymmetric/ec/ECUtil;->a(Ljava/security/PrivateKey;)Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;

    move-result-object v0

    iget-object v1, p0, Lorg/bouncycastle/jce/provider/asymmetric/ec/Signature;->by:Lorg/bouncycastle/crypto/Digest;

    invoke-interface {v1}, Lorg/bouncycastle/crypto/Digest;->reset()V

    if-eqz p2, :cond_1

    iget-object v1, p0, Lorg/bouncycastle/jce/provider/asymmetric/ec/Signature;->bz:Lorg/bouncycastle/crypto/DSA;

    new-instance v2, Lorg/bouncycastle/crypto/params/ParametersWithRandom;

    invoke-direct {v2, v0, p2}, Lorg/bouncycastle/crypto/params/ParametersWithRandom;-><init>(Lorg/bouncycastle/crypto/CipherParameters;Ljava/security/SecureRandom;)V

    invoke-interface {v1, v3, v2}, Lorg/bouncycastle/crypto/DSA;->init(ZLorg/bouncycastle/crypto/CipherParameters;)V

    :goto_0
    return-void

    :cond_0
    new-instance v0, Ljava/security/InvalidKeyException;

    const-string v1, "can\'t recognise key type in ECDSA based signer"

    invoke-direct {v0, v1}, Ljava/security/InvalidKeyException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget-object v1, p0, Lorg/bouncycastle/jce/provider/asymmetric/ec/Signature;->bz:Lorg/bouncycastle/crypto/DSA;

    invoke-interface {v1, v3, v0}, Lorg/bouncycastle/crypto/DSA;->init(ZLorg/bouncycastle/crypto/CipherParameters;)V

    goto :goto_0
.end method

.method protected engineInitVerify(Ljava/security/PublicKey;)V
    .locals 3

    instance-of v0, p1, Ljava/security/interfaces/ECPublicKey;

    if-eqz v0, :cond_0

    invoke-static {p1}, Lorg/bouncycastle/jce/provider/asymmetric/ec/ECUtil;->a(Ljava/security/PublicKey;)Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;

    move-result-object v0

    :goto_0
    iget-object v1, p0, Lorg/bouncycastle/jce/provider/asymmetric/ec/Signature;->by:Lorg/bouncycastle/crypto/Digest;

    invoke-interface {v1}, Lorg/bouncycastle/crypto/Digest;->reset()V

    iget-object v1, p0, Lorg/bouncycastle/jce/provider/asymmetric/ec/Signature;->bz:Lorg/bouncycastle/crypto/DSA;

    const/4 v2, 0x0

    invoke-interface {v1, v2, v0}, Lorg/bouncycastle/crypto/DSA;->init(ZLorg/bouncycastle/crypto/CipherParameters;)V

    return-void

    :cond_0
    :try_start_0
    invoke-interface {p1}, Ljava/security/PublicKey;->getEncoded()[B

    move-result-object v0

    invoke-static {v0}, Lorg/bouncycastle/jce/provider/JDKKeyFactory;->a([B)Ljava/security/PublicKey;

    move-result-object v0

    instance-of v1, v0, Ljava/security/interfaces/ECPublicKey;

    if-eqz v1, :cond_1

    invoke-static {v0}, Lorg/bouncycastle/jce/provider/asymmetric/ec/ECUtil;->a(Ljava/security/PublicKey;)Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;

    move-result-object v0

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/security/InvalidKeyException;

    const-string v1, "can\'t recognise key type in ECDSA based signer"

    invoke-direct {v0, v1}, Ljava/security/InvalidKeyException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception v0

    new-instance v0, Ljava/security/InvalidKeyException;

    const-string v1, "can\'t recognise key type in ECDSA based signer"

    invoke-direct {v0, v1}, Ljava/security/InvalidKeyException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
