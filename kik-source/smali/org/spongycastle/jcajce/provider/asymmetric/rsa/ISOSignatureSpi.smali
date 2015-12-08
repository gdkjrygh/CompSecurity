.class public Lorg/spongycastle/jcajce/provider/asymmetric/rsa/ISOSignatureSpi;
.super Ljava/security/SignatureSpi;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/spongycastle/jcajce/provider/asymmetric/rsa/ISOSignatureSpi$RIPEMD160WithRSAEncryption;,
        Lorg/spongycastle/jcajce/provider/asymmetric/rsa/ISOSignatureSpi$MD5WithRSAEncryption;,
        Lorg/spongycastle/jcajce/provider/asymmetric/rsa/ISOSignatureSpi$SHA1WithRSAEncryption;
    }
.end annotation


# instance fields
.field private a:Lorg/spongycastle/crypto/signers/ISO9796d2Signer;


# direct methods
.method protected constructor <init>(Lorg/spongycastle/crypto/Digest;Lorg/spongycastle/crypto/AsymmetricBlockCipher;)V
    .locals 1

    .prologue
    .line 29
    invoke-direct {p0}, Ljava/security/SignatureSpi;-><init>()V

    .line 30
    new-instance v0, Lorg/spongycastle/crypto/signers/ISO9796d2Signer;

    invoke-direct {v0, p2, p1}, Lorg/spongycastle/crypto/signers/ISO9796d2Signer;-><init>(Lorg/spongycastle/crypto/AsymmetricBlockCipher;Lorg/spongycastle/crypto/Digest;)V

    iput-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/ISOSignatureSpi;->a:Lorg/spongycastle/crypto/signers/ISO9796d2Signer;

    .line 31
    return-void
.end method


# virtual methods
.method protected engineGetParameter(Ljava/lang/String;)Ljava/lang/Object;
    .locals 2

    .prologue
    .line 113
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "engineSetParameter unsupported"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method protected engineInitSign(Ljava/security/PrivateKey;)V
    .locals 3

    .prologue
    .line 46
    check-cast p1, Ljava/security/interfaces/RSAPrivateKey;

    invoke-static {p1}, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/RSAUtil;->a(Ljava/security/interfaces/RSAPrivateKey;)Lorg/spongycastle/crypto/params/RSAKeyParameters;

    move-result-object v0

    .line 48
    iget-object v1, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/ISOSignatureSpi;->a:Lorg/spongycastle/crypto/signers/ISO9796d2Signer;

    const/4 v2, 0x1

    invoke-virtual {v1, v2, v0}, Lorg/spongycastle/crypto/signers/ISO9796d2Signer;->a(ZLorg/spongycastle/crypto/CipherParameters;)V

    .line 49
    return-void
.end method

.method protected engineInitVerify(Ljava/security/PublicKey;)V
    .locals 3

    .prologue
    .line 37
    check-cast p1, Ljava/security/interfaces/RSAPublicKey;

    invoke-static {p1}, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/RSAUtil;->a(Ljava/security/interfaces/RSAPublicKey;)Lorg/spongycastle/crypto/params/RSAKeyParameters;

    move-result-object v0

    .line 39
    iget-object v1, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/ISOSignatureSpi;->a:Lorg/spongycastle/crypto/signers/ISO9796d2Signer;

    const/4 v2, 0x0

    invoke-virtual {v1, v2, v0}, Lorg/spongycastle/crypto/signers/ISO9796d2Signer;->a(ZLorg/spongycastle/crypto/CipherParameters;)V

    .line 40
    return-void
.end method

.method protected engineSetParameter(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 104
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "engineSetParameter unsupported"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method protected engineSetParameter(Ljava/security/spec/AlgorithmParameterSpec;)V
    .locals 2

    .prologue
    .line 94
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "engineSetParameter unsupported"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method protected engineSign()[B
    .locals 2

    .prologue
    .line 72
    :try_start_0
    iget-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/ISOSignatureSpi;->a:Lorg/spongycastle/crypto/signers/ISO9796d2Signer;

    invoke-virtual {v0}, Lorg/spongycastle/crypto/signers/ISO9796d2Signer;->a()[B
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 74
    return-object v0

    .line 76
    :catch_0
    move-exception v0

    .line 78
    new-instance v1, Ljava/security/SignatureException;

    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/security/SignatureException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method protected engineUpdate(B)V
    .locals 1

    .prologue
    .line 55
    iget-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/ISOSignatureSpi;->a:Lorg/spongycastle/crypto/signers/ISO9796d2Signer;

    invoke-virtual {v0, p1}, Lorg/spongycastle/crypto/signers/ISO9796d2Signer;->a(B)V

    .line 56
    return-void
.end method

.method protected engineUpdate([BII)V
    .locals 1

    .prologue
    .line 64
    iget-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/ISOSignatureSpi;->a:Lorg/spongycastle/crypto/signers/ISO9796d2Signer;

    invoke-virtual {v0, p1, p2, p3}, Lorg/spongycastle/crypto/signers/ISO9796d2Signer;->a([BII)V

    .line 65
    return-void
.end method

.method protected engineVerify([B)Z
    .locals 1

    .prologue
    .line 86
    iget-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/ISOSignatureSpi;->a:Lorg/spongycastle/crypto/signers/ISO9796d2Signer;

    invoke-virtual {v0, p1}, Lorg/spongycastle/crypto/signers/ISO9796d2Signer;->a([B)Z

    move-result v0

    .line 88
    return v0
.end method
