.class public Lorg/bouncycastle/jce/provider/JDKDSASigner;
.super Ljava/security/SignatureSpi;

# interfaces
.implements Lorg/bouncycastle/asn1/pkcs/PKCSObjectIdentifiers;
.implements Lorg/bouncycastle/asn1/x509/X509ObjectIdentifiers;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/bouncycastle/jce/provider/JDKDSASigner$dsa224;,
        Lorg/bouncycastle/jce/provider/JDKDSASigner$dsa256;,
        Lorg/bouncycastle/jce/provider/JDKDSASigner$dsa384;,
        Lorg/bouncycastle/jce/provider/JDKDSASigner$dsa512;,
        Lorg/bouncycastle/jce/provider/JDKDSASigner$noneDSA;,
        Lorg/bouncycastle/jce/provider/JDKDSASigner$stdDSA;
    }
.end annotation


# instance fields
.field private bA:Ljava/security/SecureRandom;

.field private by:Lorg/bouncycastle/crypto/Digest;

.field private bz:Lorg/bouncycastle/crypto/DSA;


# direct methods
.method protected constructor <init>(Lorg/bouncycastle/crypto/Digest;Lorg/bouncycastle/crypto/DSA;)V
    .locals 0

    invoke-direct {p0}, Ljava/security/SignatureSpi;-><init>()V

    iput-object p1, p0, Lorg/bouncycastle/jce/provider/JDKDSASigner;->by:Lorg/bouncycastle/crypto/Digest;

    iput-object p2, p0, Lorg/bouncycastle/jce/provider/JDKDSASigner;->bz:Lorg/bouncycastle/crypto/DSA;

    return-void
.end method


# virtual methods
.method protected engineGetParameter(Ljava/lang/String;)Ljava/lang/Object;
    .locals 2

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "engineSetParameter unsupported"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method protected engineInitSign(Ljava/security/PrivateKey;)V
    .locals 3

    instance-of v0, p1, Lorg/bouncycastle/jce/interfaces/GOST3410Key;

    if-eqz v0, :cond_1

    invoke-static {p1}, Lorg/bouncycastle/jce/provider/GOST3410Util;->a(Ljava/security/PrivateKey;)Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;

    move-result-object v0

    :goto_0
    iget-object v1, p0, Lorg/bouncycastle/jce/provider/JDKDSASigner;->bA:Ljava/security/SecureRandom;

    if-eqz v1, :cond_0

    new-instance v1, Lorg/bouncycastle/crypto/params/ParametersWithRandom;

    iget-object v2, p0, Lorg/bouncycastle/jce/provider/JDKDSASigner;->bA:Ljava/security/SecureRandom;

    invoke-direct {v1, v0, v2}, Lorg/bouncycastle/crypto/params/ParametersWithRandom;-><init>(Lorg/bouncycastle/crypto/CipherParameters;Ljava/security/SecureRandom;)V

    move-object v0, v1

    :cond_0
    iget-object v1, p0, Lorg/bouncycastle/jce/provider/JDKDSASigner;->by:Lorg/bouncycastle/crypto/Digest;

    invoke-interface {v1}, Lorg/bouncycastle/crypto/Digest;->reset()V

    iget-object v1, p0, Lorg/bouncycastle/jce/provider/JDKDSASigner;->bz:Lorg/bouncycastle/crypto/DSA;

    const/4 v2, 0x1

    invoke-interface {v1, v2, v0}, Lorg/bouncycastle/crypto/DSA;->init(ZLorg/bouncycastle/crypto/CipherParameters;)V

    return-void

    :cond_1
    invoke-static {p1}, Lorg/bouncycastle/jce/provider/DSAUtil;->a(Ljava/security/PrivateKey;)Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;

    move-result-object v0

    goto :goto_0
.end method

.method protected engineInitSign(Ljava/security/PrivateKey;Ljava/security/SecureRandom;)V
    .locals 0

    iput-object p2, p0, Lorg/bouncycastle/jce/provider/JDKDSASigner;->bA:Ljava/security/SecureRandom;

    invoke-virtual {p0, p1}, Lorg/bouncycastle/jce/provider/JDKDSASigner;->engineInitSign(Ljava/security/PrivateKey;)V

    return-void
.end method

.method protected engineInitVerify(Ljava/security/PublicKey;)V
    .locals 3

    instance-of v0, p1, Lorg/bouncycastle/jce/interfaces/GOST3410Key;

    if-eqz v0, :cond_0

    invoke-static {p1}, Lorg/bouncycastle/jce/provider/GOST3410Util;->a(Ljava/security/PublicKey;)Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;

    move-result-object v0

    :goto_0
    iget-object v1, p0, Lorg/bouncycastle/jce/provider/JDKDSASigner;->by:Lorg/bouncycastle/crypto/Digest;

    invoke-interface {v1}, Lorg/bouncycastle/crypto/Digest;->reset()V

    iget-object v1, p0, Lorg/bouncycastle/jce/provider/JDKDSASigner;->bz:Lorg/bouncycastle/crypto/DSA;

    const/4 v2, 0x0

    invoke-interface {v1, v2, v0}, Lorg/bouncycastle/crypto/DSA;->init(ZLorg/bouncycastle/crypto/CipherParameters;)V

    return-void

    :cond_0
    instance-of v0, p1, Ljava/security/interfaces/DSAKey;

    if-eqz v0, :cond_1

    invoke-static {p1}, Lorg/bouncycastle/jce/provider/DSAUtil;->a(Ljava/security/PublicKey;)Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;

    move-result-object v0

    goto :goto_0

    :cond_1
    :try_start_0
    invoke-interface {p1}, Ljava/security/PublicKey;->getEncoded()[B

    move-result-object v0

    invoke-static {v0}, Lorg/bouncycastle/jce/provider/JDKKeyFactory;->a([B)Ljava/security/PublicKey;

    move-result-object v0

    instance-of v1, v0, Ljava/security/interfaces/DSAKey;

    if-eqz v1, :cond_2

    invoke-static {v0}, Lorg/bouncycastle/jce/provider/DSAUtil;->a(Ljava/security/PublicKey;)Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;

    move-result-object v0

    goto :goto_0

    :cond_2
    new-instance v0, Ljava/security/InvalidKeyException;

    const-string v1, "can\'t recognise key type in DSA based signer"

    invoke-direct {v0, v1}, Ljava/security/InvalidKeyException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception v0

    new-instance v0, Ljava/security/InvalidKeyException;

    const-string v1, "can\'t recognise key type in DSA based signer"

    invoke-direct {v0, v1}, Ljava/security/InvalidKeyException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method protected engineSetParameter(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 2

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "engineSetParameter unsupported"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method protected engineSetParameter(Ljava/security/spec/AlgorithmParameterSpec;)V
    .locals 2

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "engineSetParameter unsupported"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method protected engineSign()[B
    .locals 5

    const/4 v2, 0x0

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JDKDSASigner;->by:Lorg/bouncycastle/crypto/Digest;

    invoke-interface {v0}, Lorg/bouncycastle/crypto/Digest;->getDigestSize()I

    move-result v0

    new-array v0, v0, [B

    iget-object v1, p0, Lorg/bouncycastle/jce/provider/JDKDSASigner;->by:Lorg/bouncycastle/crypto/Digest;

    invoke-interface {v1, v0, v2}, Lorg/bouncycastle/crypto/Digest;->doFinal([BI)I

    :try_start_0
    iget-object v1, p0, Lorg/bouncycastle/jce/provider/JDKDSASigner;->bz:Lorg/bouncycastle/crypto/DSA;

    invoke-interface {v1, v0}, Lorg/bouncycastle/crypto/DSA;->generateSignature([B)[Ljava/math/BigInteger;

    move-result-object v0

    const/4 v1, 0x0

    aget-object v1, v0, v1

    const/4 v2, 0x1

    aget-object v0, v0, v2

    const/4 v2, 0x2

    new-array v2, v2, [Lorg/bouncycastle/asn1/DERInteger;

    const/4 v3, 0x0

    new-instance v4, Lorg/bouncycastle/asn1/DERInteger;

    invoke-direct {v4, v1}, Lorg/bouncycastle/asn1/DERInteger;-><init>(Ljava/math/BigInteger;)V

    aput-object v4, v2, v3

    const/4 v1, 0x1

    new-instance v3, Lorg/bouncycastle/asn1/DERInteger;

    invoke-direct {v3, v0}, Lorg/bouncycastle/asn1/DERInteger;-><init>(Ljava/math/BigInteger;)V

    aput-object v3, v2, v1

    new-instance v0, Lorg/bouncycastle/asn1/DERSequence;

    invoke-direct {v0, v2}, Lorg/bouncycastle/asn1/DERSequence;-><init>([Lorg/bouncycastle/asn1/ASN1Encodable;)V

    const-string v1, "DER"

    invoke-virtual {v0, v1}, Lorg/bouncycastle/asn1/DERSequence;->a(Ljava/lang/String;)[B
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/security/SignatureException;

    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/security/SignatureException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method protected engineUpdate(B)V
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JDKDSASigner;->by:Lorg/bouncycastle/crypto/Digest;

    invoke-interface {v0, p1}, Lorg/bouncycastle/crypto/Digest;->update(B)V

    return-void
.end method

.method protected engineUpdate([BII)V
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JDKDSASigner;->by:Lorg/bouncycastle/crypto/Digest;

    invoke-interface {v0, p1, p2, p3}, Lorg/bouncycastle/crypto/Digest;->update([BII)V

    return-void
.end method

.method protected engineVerify([B)Z
    .locals 7

    const/4 v6, 0x1

    const/4 v5, 0x0

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JDKDSASigner;->by:Lorg/bouncycastle/crypto/Digest;

    invoke-interface {v0}, Lorg/bouncycastle/crypto/Digest;->getDigestSize()I

    move-result v0

    new-array v2, v0, [B

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JDKDSASigner;->by:Lorg/bouncycastle/crypto/Digest;

    invoke-interface {v0, v2, v5}, Lorg/bouncycastle/crypto/Digest;->doFinal([BI)I

    :try_start_0
    invoke-static {p1}, Lorg/bouncycastle/asn1/ASN1Object;->a([B)Lorg/bouncycastle/asn1/ASN1Object;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/asn1/ASN1Sequence;

    const/4 v1, 0x2

    new-array v3, v1, [Ljava/math/BigInteger;

    const/4 v4, 0x0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lorg/bouncycastle/asn1/ASN1Sequence;->a(I)Lorg/bouncycastle/asn1/DEREncodable;

    move-result-object v1

    check-cast v1, Lorg/bouncycastle/asn1/DERInteger;

    invoke-virtual {v1}, Lorg/bouncycastle/asn1/DERInteger;->e()Ljava/math/BigInteger;

    move-result-object v1

    aput-object v1, v3, v4

    const/4 v1, 0x1

    const/4 v4, 0x1

    invoke-virtual {v0, v4}, Lorg/bouncycastle/asn1/ASN1Sequence;->a(I)Lorg/bouncycastle/asn1/DEREncodable;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/asn1/DERInteger;

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/DERInteger;->e()Ljava/math/BigInteger;

    move-result-object v0

    aput-object v0, v3, v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JDKDSASigner;->bz:Lorg/bouncycastle/crypto/DSA;

    aget-object v1, v3, v5

    aget-object v3, v3, v6

    invoke-interface {v0, v2, v1, v3}, Lorg/bouncycastle/crypto/DSA;->verifySignature([BLjava/math/BigInteger;Ljava/math/BigInteger;)Z

    move-result v0

    return v0

    :catch_0
    move-exception v0

    new-instance v0, Ljava/security/SignatureException;

    const-string v1, "error decoding signature bytes."

    invoke-direct {v0, v1}, Ljava/security/SignatureException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
