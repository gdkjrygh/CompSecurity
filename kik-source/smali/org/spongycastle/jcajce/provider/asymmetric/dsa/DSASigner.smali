.class public Lorg/spongycastle/jcajce/provider/asymmetric/dsa/DSASigner;
.super Ljava/security/SignatureSpi;
.source "SourceFile"

# interfaces
.implements Lorg/spongycastle/asn1/pkcs/PKCSObjectIdentifiers;
.implements Lorg/spongycastle/asn1/x509/X509ObjectIdentifiers;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/spongycastle/jcajce/provider/asymmetric/dsa/DSASigner$noneDSA;,
        Lorg/spongycastle/jcajce/provider/asymmetric/dsa/DSASigner$dsa512;,
        Lorg/spongycastle/jcajce/provider/asymmetric/dsa/DSASigner$dsa384;,
        Lorg/spongycastle/jcajce/provider/asymmetric/dsa/DSASigner$dsa256;,
        Lorg/spongycastle/jcajce/provider/asymmetric/dsa/DSASigner$dsa224;,
        Lorg/spongycastle/jcajce/provider/asymmetric/dsa/DSASigner$stdDSA;
    }
.end annotation


# instance fields
.field private bA:Lorg/spongycastle/crypto/DSA;

.field private bB:Ljava/security/SecureRandom;

.field private bz:Lorg/spongycastle/crypto/Digest;


# direct methods
.method protected constructor <init>(Lorg/spongycastle/crypto/Digest;Lorg/spongycastle/crypto/DSA;)V
    .locals 0

    .prologue
    .line 44
    invoke-direct {p0}, Ljava/security/SignatureSpi;-><init>()V

    .line 45
    iput-object p1, p0, Lorg/spongycastle/jcajce/provider/asymmetric/dsa/DSASigner;->bz:Lorg/spongycastle/crypto/Digest;

    .line 46
    iput-object p2, p0, Lorg/spongycastle/jcajce/provider/asymmetric/dsa/DSASigner;->bA:Lorg/spongycastle/crypto/DSA;

    .line 47
    return-void
.end method


# virtual methods
.method protected engineGetParameter(Ljava/lang/String;)Ljava/lang/Object;
    .locals 2

    .prologue
    .line 203
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "engineSetParameter unsupported"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method protected engineInitSign(Ljava/security/PrivateKey;)V
    .locals 3

    .prologue
    .line 112
    invoke-static {p1}, Lorg/spongycastle/jcajce/provider/asymmetric/dsa/DSAUtil;->a(Ljava/security/PrivateKey;)Lorg/spongycastle/crypto/params/AsymmetricKeyParameter;

    move-result-object v1

    .line 115
    iget-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/dsa/DSASigner;->bB:Ljava/security/SecureRandom;

    if-eqz v0, :cond_0

    .line 117
    new-instance v0, Lorg/spongycastle/crypto/params/ParametersWithRandom;

    iget-object v2, p0, Lorg/spongycastle/jcajce/provider/asymmetric/dsa/DSASigner;->bB:Ljava/security/SecureRandom;

    invoke-direct {v0, v1, v2}, Lorg/spongycastle/crypto/params/ParametersWithRandom;-><init>(Lorg/spongycastle/crypto/CipherParameters;Ljava/security/SecureRandom;)V

    .line 120
    :goto_0
    iget-object v1, p0, Lorg/spongycastle/jcajce/provider/asymmetric/dsa/DSASigner;->bz:Lorg/spongycastle/crypto/Digest;

    invoke-interface {v1}, Lorg/spongycastle/crypto/Digest;->c()V

    .line 121
    iget-object v1, p0, Lorg/spongycastle/jcajce/provider/asymmetric/dsa/DSASigner;->bA:Lorg/spongycastle/crypto/DSA;

    const/4 v2, 0x1

    invoke-interface {v1, v2, v0}, Lorg/spongycastle/crypto/DSA;->a(ZLorg/spongycastle/crypto/CipherParameters;)V

    .line 122
    return-void

    :cond_0
    move-object v0, v1

    goto :goto_0
.end method

.method protected engineInitSign(Ljava/security/PrivateKey;Ljava/security/SecureRandom;)V
    .locals 0

    .prologue
    .line 96
    iput-object p2, p0, Lorg/spongycastle/jcajce/provider/asymmetric/dsa/DSASigner;->bB:Ljava/security/SecureRandom;

    .line 97
    invoke-virtual {p0, p1}, Lorg/spongycastle/jcajce/provider/asymmetric/dsa/DSASigner;->engineInitSign(Ljava/security/PrivateKey;)V

    .line 98
    return-void
.end method

.method protected engineInitVerify(Ljava/security/PublicKey;)V
    .locals 3

    .prologue
    .line 60
    instance-of v0, p1, Ljava/security/interfaces/DSAKey;

    if-eqz v0, :cond_0

    .line 62
    invoke-static {p1}, Lorg/spongycastle/jcajce/provider/asymmetric/dsa/DSAUtil;->a(Ljava/security/PublicKey;)Lorg/spongycastle/crypto/params/AsymmetricKeyParameter;

    move-result-object v0

    .line 87
    :goto_0
    iget-object v1, p0, Lorg/spongycastle/jcajce/provider/asymmetric/dsa/DSASigner;->bz:Lorg/spongycastle/crypto/Digest;

    invoke-interface {v1}, Lorg/spongycastle/crypto/Digest;->c()V

    .line 88
    iget-object v1, p0, Lorg/spongycastle/jcajce/provider/asymmetric/dsa/DSASigner;->bA:Lorg/spongycastle/crypto/DSA;

    const/4 v2, 0x0

    invoke-interface {v1, v2, v0}, Lorg/spongycastle/crypto/DSA;->a(ZLorg/spongycastle/crypto/CipherParameters;)V

    .line 89
    return-void

    .line 68
    :cond_0
    :try_start_0
    invoke-interface {p1}, Ljava/security/PublicKey;->getEncoded()[B

    move-result-object v0

    .line 70
    new-instance v1, Lorg/spongycastle/jcajce/provider/asymmetric/dsa/BCDSAPublicKey;

    invoke-static {v0}, Lorg/spongycastle/asn1/x509/SubjectPublicKeyInfo;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/x509/SubjectPublicKeyInfo;

    move-result-object v0

    invoke-direct {v1, v0}, Lorg/spongycastle/jcajce/provider/asymmetric/dsa/BCDSAPublicKey;-><init>(Lorg/spongycastle/asn1/x509/SubjectPublicKeyInfo;)V

    .line 72
    invoke-static {v1}, Lorg/spongycastle/jcajce/provider/asymmetric/dsa/DSAUtil;->a(Ljava/security/PublicKey;)Lorg/spongycastle/crypto/params/AsymmetricKeyParameter;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    goto :goto_0

    .line 83
    :catch_0
    move-exception v0

    new-instance v0, Ljava/security/InvalidKeyException;

    const-string v1, "can\'t recognise key type in DSA based signer"

    invoke-direct {v0, v1}, Ljava/security/InvalidKeyException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method protected engineSetParameter(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 194
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "engineSetParameter unsupported"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method protected engineSetParameter(Ljava/security/spec/AlgorithmParameterSpec;)V
    .locals 2

    .prologue
    .line 184
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "engineSetParameter unsupported"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method protected engineSign()[B
    .locals 5

    .prologue
    const/4 v2, 0x0

    .line 143
    iget-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/dsa/DSASigner;->bz:Lorg/spongycastle/crypto/Digest;

    invoke-interface {v0}, Lorg/spongycastle/crypto/Digest;->b()I

    move-result v0

    new-array v0, v0, [B

    .line 145
    iget-object v1, p0, Lorg/spongycastle/jcajce/provider/asymmetric/dsa/DSASigner;->bz:Lorg/spongycastle/crypto/Digest;

    invoke-interface {v1, v0, v2}, Lorg/spongycastle/crypto/Digest;->a([BI)I

    .line 149
    :try_start_0
    iget-object v1, p0, Lorg/spongycastle/jcajce/provider/asymmetric/dsa/DSASigner;->bA:Lorg/spongycastle/crypto/DSA;

    invoke-interface {v1, v0}, Lorg/spongycastle/crypto/DSA;->a([B)[Ljava/math/BigInteger;

    move-result-object v0

    .line 151
    const/4 v1, 0x0

    aget-object v1, v0, v1

    const/4 v2, 0x1

    aget-object v0, v0, v2

    const/4 v2, 0x2

    new-array v2, v2, [Lorg/spongycastle/asn1/ASN1Integer;

    const/4 v3, 0x0

    new-instance v4, Lorg/spongycastle/asn1/ASN1Integer;

    invoke-direct {v4, v1}, Lorg/spongycastle/asn1/ASN1Integer;-><init>(Ljava/math/BigInteger;)V

    aput-object v4, v2, v3

    const/4 v1, 0x1

    new-instance v3, Lorg/spongycastle/asn1/ASN1Integer;

    invoke-direct {v3, v0}, Lorg/spongycastle/asn1/ASN1Integer;-><init>(Ljava/math/BigInteger;)V

    aput-object v3, v2, v1

    new-instance v0, Lorg/spongycastle/asn1/DERSequence;

    invoke-direct {v0, v2}, Lorg/spongycastle/asn1/DERSequence;-><init>([Lorg/spongycastle/asn1/ASN1Encodable;)V

    const-string v1, "DER"

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/DERSequence;->a(Ljava/lang/String;)[B
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 153
    :catch_0
    move-exception v0

    .line 155
    new-instance v1, Ljava/security/SignatureException;

    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/security/SignatureException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method protected engineUpdate(B)V
    .locals 1

    .prologue
    .line 128
    iget-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/dsa/DSASigner;->bz:Lorg/spongycastle/crypto/Digest;

    invoke-interface {v0, p1}, Lorg/spongycastle/crypto/Digest;->a(B)V

    .line 129
    return-void
.end method

.method protected engineUpdate([BII)V
    .locals 1

    .prologue
    .line 137
    iget-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/dsa/DSASigner;->bz:Lorg/spongycastle/crypto/Digest;

    invoke-interface {v0, p1, p2, p3}, Lorg/spongycastle/crypto/Digest;->a([BII)V

    .line 138
    return-void
.end method

.method protected engineVerify([B)Z
    .locals 7

    .prologue
    const/4 v6, 0x1

    const/4 v5, 0x0

    .line 163
    iget-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/dsa/DSASigner;->bz:Lorg/spongycastle/crypto/Digest;

    invoke-interface {v0}, Lorg/spongycastle/crypto/Digest;->b()I

    move-result v0

    new-array v2, v0, [B

    .line 165
    iget-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/dsa/DSASigner;->bz:Lorg/spongycastle/crypto/Digest;

    invoke-interface {v0, v2, v5}, Lorg/spongycastle/crypto/Digest;->a([BI)I

    .line 171
    :try_start_0
    invoke-static {p1}, Lorg/spongycastle/asn1/ASN1Primitive;->a([B)Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/asn1/ASN1Sequence;

    const/4 v1, 0x2

    new-array v3, v1, [Ljava/math/BigInteger;

    const/4 v4, 0x0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1Sequence;->a(I)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v1

    check-cast v1, Lorg/spongycastle/asn1/ASN1Integer;

    invoke-virtual {v1}, Lorg/spongycastle/asn1/ASN1Integer;->c()Ljava/math/BigInteger;

    move-result-object v1

    aput-object v1, v3, v4

    const/4 v1, 0x1

    const/4 v4, 0x1

    invoke-virtual {v0, v4}, Lorg/spongycastle/asn1/ASN1Sequence;->a(I)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/asn1/ASN1Integer;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/ASN1Integer;->c()Ljava/math/BigInteger;

    move-result-object v0

    aput-object v0, v3, v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 178
    iget-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/dsa/DSASigner;->bA:Lorg/spongycastle/crypto/DSA;

    aget-object v1, v3, v5

    aget-object v3, v3, v6

    invoke-interface {v0, v2, v1, v3}, Lorg/spongycastle/crypto/DSA;->a([BLjava/math/BigInteger;Ljava/math/BigInteger;)Z

    move-result v0

    return v0

    .line 175
    :catch_0
    move-exception v0

    new-instance v0, Ljava/security/SignatureException;

    const-string v1, "error decoding signature bytes."

    invoke-direct {v0, v1}, Ljava/security/SignatureException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
