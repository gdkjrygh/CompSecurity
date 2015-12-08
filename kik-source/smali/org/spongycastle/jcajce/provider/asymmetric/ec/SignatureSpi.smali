.class public Lorg/spongycastle/jcajce/provider/asymmetric/ec/SignatureSpi;
.super Lorg/spongycastle/jcajce/provider/asymmetric/util/DSABase;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/spongycastle/jcajce/provider/asymmetric/ec/SignatureSpi$a;,
        Lorg/spongycastle/jcajce/provider/asymmetric/ec/SignatureSpi$b;,
        Lorg/spongycastle/jcajce/provider/asymmetric/ec/SignatureSpi$ecCVCDSA256;,
        Lorg/spongycastle/jcajce/provider/asymmetric/ec/SignatureSpi$ecCVCDSA224;,
        Lorg/spongycastle/jcajce/provider/asymmetric/ec/SignatureSpi$ecCVCDSA;,
        Lorg/spongycastle/jcajce/provider/asymmetric/ec/SignatureSpi$ecNR512;,
        Lorg/spongycastle/jcajce/provider/asymmetric/ec/SignatureSpi$ecNR384;,
        Lorg/spongycastle/jcajce/provider/asymmetric/ec/SignatureSpi$ecNR256;,
        Lorg/spongycastle/jcajce/provider/asymmetric/ec/SignatureSpi$ecNR224;,
        Lorg/spongycastle/jcajce/provider/asymmetric/ec/SignatureSpi$ecNR;,
        Lorg/spongycastle/jcajce/provider/asymmetric/ec/SignatureSpi$ecDSARipeMD160;,
        Lorg/spongycastle/jcajce/provider/asymmetric/ec/SignatureSpi$ecDSA512;,
        Lorg/spongycastle/jcajce/provider/asymmetric/ec/SignatureSpi$ecDSA384;,
        Lorg/spongycastle/jcajce/provider/asymmetric/ec/SignatureSpi$ecDSA256;,
        Lorg/spongycastle/jcajce/provider/asymmetric/ec/SignatureSpi$ecDSA224;,
        Lorg/spongycastle/jcajce/provider/asymmetric/ec/SignatureSpi$ecDSAnone;,
        Lorg/spongycastle/jcajce/provider/asymmetric/ec/SignatureSpi$ecDSA;
    }
.end annotation


# direct methods
.method constructor <init>(Lorg/spongycastle/crypto/Digest;Lorg/spongycastle/crypto/DSA;Lorg/spongycastle/jcajce/provider/asymmetric/util/DSAEncoder;)V
    .locals 0

    .prologue
    .line 40
    invoke-direct {p0, p1, p2, p3}, Lorg/spongycastle/jcajce/provider/asymmetric/util/DSABase;-><init>(Lorg/spongycastle/crypto/Digest;Lorg/spongycastle/crypto/DSA;Lorg/spongycastle/jcajce/provider/asymmetric/util/DSAEncoder;)V

    .line 41
    return-void
.end method


# virtual methods
.method protected engineInitSign(Ljava/security/PrivateKey;)V
    .locals 5

    .prologue
    const/4 v4, 0x1

    .line 85
    instance-of v0, p1, Lorg/spongycastle/jce/interfaces/ECKey;

    if-eqz v0, :cond_0

    .line 87
    invoke-static {p1}, Lorg/spongycastle/jcajce/provider/asymmetric/ec/ECUtil;->a(Ljava/security/PrivateKey;)Lorg/spongycastle/crypto/params/AsymmetricKeyParameter;

    move-result-object v0

    .line 94
    iget-object v1, p0, Lorg/spongycastle/jcajce/provider/asymmetric/ec/SignatureSpi;->bz:Lorg/spongycastle/crypto/Digest;

    invoke-interface {v1}, Lorg/spongycastle/crypto/Digest;->c()V

    .line 96
    iget-object v1, p0, Lorg/spongycastle/jcajce/provider/asymmetric/ec/SignatureSpi;->appRandom:Ljava/security/SecureRandom;

    if-eqz v1, :cond_1

    .line 98
    iget-object v1, p0, Lorg/spongycastle/jcajce/provider/asymmetric/ec/SignatureSpi;->bA:Lorg/spongycastle/crypto/DSA;

    new-instance v2, Lorg/spongycastle/crypto/params/ParametersWithRandom;

    iget-object v3, p0, Lorg/spongycastle/jcajce/provider/asymmetric/ec/SignatureSpi;->appRandom:Ljava/security/SecureRandom;

    invoke-direct {v2, v0, v3}, Lorg/spongycastle/crypto/params/ParametersWithRandom;-><init>(Lorg/spongycastle/crypto/CipherParameters;Ljava/security/SecureRandom;)V

    invoke-interface {v1, v4, v2}, Lorg/spongycastle/crypto/DSA;->a(ZLorg/spongycastle/crypto/CipherParameters;)V

    .line 104
    :goto_0
    return-void

    .line 91
    :cond_0
    new-instance v0, Ljava/security/InvalidKeyException;

    const-string v1, "can\'t recognise key type in ECDSA based signer"

    invoke-direct {v0, v1}, Ljava/security/InvalidKeyException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 102
    :cond_1
    iget-object v1, p0, Lorg/spongycastle/jcajce/provider/asymmetric/ec/SignatureSpi;->bA:Lorg/spongycastle/crypto/DSA;

    invoke-interface {v1, v4, v0}, Lorg/spongycastle/crypto/DSA;->a(ZLorg/spongycastle/crypto/CipherParameters;)V

    goto :goto_0
.end method

.method protected engineInitVerify(Ljava/security/PublicKey;)V
    .locals 3

    .prologue
    .line 48
    instance-of v0, p1, Ljava/security/interfaces/ECPublicKey;

    if-eqz v0, :cond_0

    .line 50
    invoke-static {p1}, Lorg/spongycastle/jcajce/provider/asymmetric/ec/ECUtil;->a(Ljava/security/PublicKey;)Lorg/spongycastle/crypto/params/AsymmetricKeyParameter;

    move-result-object v0

    .line 75
    :goto_0
    iget-object v1, p0, Lorg/spongycastle/jcajce/provider/asymmetric/ec/SignatureSpi;->bz:Lorg/spongycastle/crypto/Digest;

    invoke-interface {v1}, Lorg/spongycastle/crypto/Digest;->c()V

    .line 76
    iget-object v1, p0, Lorg/spongycastle/jcajce/provider/asymmetric/ec/SignatureSpi;->bA:Lorg/spongycastle/crypto/DSA;

    const/4 v2, 0x0

    invoke-interface {v1, v2, v0}, Lorg/spongycastle/crypto/DSA;->a(ZLorg/spongycastle/crypto/CipherParameters;)V

    .line 77
    return-void

    .line 56
    :cond_0
    :try_start_0
    invoke-interface {p1}, Ljava/security/PublicKey;->getEncoded()[B

    move-result-object v0

    .line 58
    invoke-static {v0}, Lorg/spongycastle/asn1/x509/SubjectPublicKeyInfo;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/x509/SubjectPublicKeyInfo;

    move-result-object v0

    invoke-static {v0}, Lorg/spongycastle/jce/provider/BouncyCastleProvider;->a(Lorg/spongycastle/asn1/x509/SubjectPublicKeyInfo;)Ljava/security/PublicKey;

    move-result-object v0

    .line 60
    instance-of v1, v0, Ljava/security/interfaces/ECPublicKey;

    if-eqz v1, :cond_1

    .line 62
    invoke-static {v0}, Lorg/spongycastle/jcajce/provider/asymmetric/ec/ECUtil;->a(Ljava/security/PublicKey;)Lorg/spongycastle/crypto/params/AsymmetricKeyParameter;

    move-result-object v0

    goto :goto_0

    .line 66
    :cond_1
    new-instance v0, Ljava/security/InvalidKeyException;

    const-string v1, "can\'t recognise key type in ECDSA based signer"

    invoke-direct {v0, v1}, Ljava/security/InvalidKeyException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 71
    :catch_0
    move-exception v0

    new-instance v0, Ljava/security/InvalidKeyException;

    const-string v1, "can\'t recognise key type in ECDSA based signer"

    invoke-direct {v0, v1}, Ljava/security/InvalidKeyException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
