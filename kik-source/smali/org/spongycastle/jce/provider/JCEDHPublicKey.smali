.class public Lorg/spongycastle/jce/provider/JCEDHPublicKey;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljavax/crypto/interfaces/DHPublicKey;


# instance fields
.field private a:Ljava/math/BigInteger;

.field private b:Ljavax/crypto/spec/DHParameterSpec;

.field private c:Lorg/spongycastle/asn1/x509/SubjectPublicKeyInfo;


# virtual methods
.method public getAlgorithm()Ljava/lang/String;
    .locals 1

    .prologue
    .line 110
    const-string v0, "DH"

    return-object v0
.end method

.method public getEncoded()[B
    .locals 6

    .prologue
    .line 120
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JCEDHPublicKey;->c:Lorg/spongycastle/asn1/x509/SubjectPublicKeyInfo;

    if-eqz v0, :cond_0

    .line 122
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JCEDHPublicKey;->c:Lorg/spongycastle/asn1/x509/SubjectPublicKeyInfo;

    invoke-static {v0}, Lorg/spongycastle/jcajce/provider/asymmetric/util/KeyUtil;->a(Lorg/spongycastle/asn1/x509/SubjectPublicKeyInfo;)[B

    move-result-object v0

    .line 125
    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;

    sget-object v1, Lorg/spongycastle/asn1/pkcs/PKCSObjectIdentifiers;->q:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    new-instance v2, Lorg/spongycastle/asn1/pkcs/DHParameter;

    iget-object v3, p0, Lorg/spongycastle/jce/provider/JCEDHPublicKey;->b:Ljavax/crypto/spec/DHParameterSpec;

    invoke-virtual {v3}, Ljavax/crypto/spec/DHParameterSpec;->getP()Ljava/math/BigInteger;

    move-result-object v3

    iget-object v4, p0, Lorg/spongycastle/jce/provider/JCEDHPublicKey;->b:Ljavax/crypto/spec/DHParameterSpec;

    invoke-virtual {v4}, Ljavax/crypto/spec/DHParameterSpec;->getG()Ljava/math/BigInteger;

    move-result-object v4

    iget-object v5, p0, Lorg/spongycastle/jce/provider/JCEDHPublicKey;->b:Ljavax/crypto/spec/DHParameterSpec;

    invoke-virtual {v5}, Ljavax/crypto/spec/DHParameterSpec;->getL()I

    move-result v5

    invoke-direct {v2, v3, v4, v5}, Lorg/spongycastle/asn1/pkcs/DHParameter;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V

    invoke-direct {v0, v1, v2}, Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;-><init>(Lorg/spongycastle/asn1/ASN1ObjectIdentifier;Lorg/spongycastle/asn1/ASN1Encodable;)V

    new-instance v1, Lorg/spongycastle/asn1/DERInteger;

    iget-object v2, p0, Lorg/spongycastle/jce/provider/JCEDHPublicKey;->a:Ljava/math/BigInteger;

    invoke-direct {v1, v2}, Lorg/spongycastle/asn1/DERInteger;-><init>(Ljava/math/BigInteger;)V

    invoke-static {v0, v1}, Lorg/spongycastle/jcajce/provider/asymmetric/util/KeyUtil;->a(Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;Lorg/spongycastle/asn1/ASN1Encodable;)[B

    move-result-object v0

    goto :goto_0
.end method

.method public getFormat()Ljava/lang/String;
    .locals 1

    .prologue
    .line 115
    const-string v0, "X.509"

    return-object v0
.end method

.method public getParams()Ljavax/crypto/spec/DHParameterSpec;
    .locals 1

    .prologue
    .line 130
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JCEDHPublicKey;->b:Ljavax/crypto/spec/DHParameterSpec;

    return-object v0
.end method

.method public getY()Ljava/math/BigInteger;
    .locals 1

    .prologue
    .line 135
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JCEDHPublicKey;->a:Ljava/math/BigInteger;

    return-object v0
.end method
