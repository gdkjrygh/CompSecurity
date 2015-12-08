.class public Lorg/spongycastle/crypto/util/PrivateKeyFactory;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a([B)Lorg/spongycastle/crypto/params/AsymmetricKeyParameter;
    .locals 9

    .prologue
    .line 54
    invoke-static {p0}, Lorg/spongycastle/asn1/ASN1Primitive;->a([B)Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v0

    invoke-static {v0}, Lorg/spongycastle/asn1/pkcs/PrivateKeyInfo;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/pkcs/PrivateKeyInfo;

    move-result-object v1

    invoke-virtual {v1}, Lorg/spongycastle/asn1/pkcs/PrivateKeyInfo;->c()Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;

    move-result-object v2

    invoke-virtual {v2}, Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;->d()Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    move-result-object v0

    sget-object v3, Lorg/spongycastle/asn1/pkcs/PKCSObjectIdentifiers;->D_:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v3}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {v1}, Lorg/spongycastle/asn1/pkcs/PrivateKeyInfo;->e()Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v0

    invoke-static {v0}, Lorg/spongycastle/asn1/pkcs/RSAPrivateKey;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/pkcs/RSAPrivateKey;

    move-result-object v8

    new-instance v0, Lorg/spongycastle/crypto/params/RSAPrivateCrtKeyParameters;

    invoke-virtual {v8}, Lorg/spongycastle/asn1/pkcs/RSAPrivateKey;->c()Ljava/math/BigInteger;

    move-result-object v1

    invoke-virtual {v8}, Lorg/spongycastle/asn1/pkcs/RSAPrivateKey;->d()Ljava/math/BigInteger;

    move-result-object v2

    invoke-virtual {v8}, Lorg/spongycastle/asn1/pkcs/RSAPrivateKey;->e()Ljava/math/BigInteger;

    move-result-object v3

    invoke-virtual {v8}, Lorg/spongycastle/asn1/pkcs/RSAPrivateKey;->f()Ljava/math/BigInteger;

    move-result-object v4

    invoke-virtual {v8}, Lorg/spongycastle/asn1/pkcs/RSAPrivateKey;->g()Ljava/math/BigInteger;

    move-result-object v5

    invoke-virtual {v8}, Lorg/spongycastle/asn1/pkcs/RSAPrivateKey;->h()Ljava/math/BigInteger;

    move-result-object v6

    invoke-virtual {v8}, Lorg/spongycastle/asn1/pkcs/RSAPrivateKey;->i()Ljava/math/BigInteger;

    move-result-object v7

    invoke-virtual {v8}, Lorg/spongycastle/asn1/pkcs/RSAPrivateKey;->j()Ljava/math/BigInteger;

    move-result-object v8

    invoke-direct/range {v0 .. v8}, Lorg/spongycastle/crypto/params/RSAPrivateCrtKeyParameters;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    :goto_0
    return-object v0

    :cond_0
    invoke-virtual {v2}, Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;->d()Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    move-result-object v0

    sget-object v3, Lorg/spongycastle/asn1/pkcs/PKCSObjectIdentifiers;->q:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v3}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {v2}, Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;->e()Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v0

    invoke-static {v0}, Lorg/spongycastle/asn1/pkcs/DHParameter;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/pkcs/DHParameter;

    move-result-object v2

    invoke-virtual {v1}, Lorg/spongycastle/asn1/pkcs/PrivateKeyInfo;->e()Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/asn1/DERInteger;

    invoke-virtual {v2}, Lorg/spongycastle/asn1/pkcs/DHParameter;->e()Ljava/math/BigInteger;

    move-result-object v1

    if-nez v1, :cond_1

    const/4 v1, 0x0

    :goto_1
    new-instance v3, Lorg/spongycastle/crypto/params/DHParameters;

    invoke-virtual {v2}, Lorg/spongycastle/asn1/pkcs/DHParameter;->c()Ljava/math/BigInteger;

    move-result-object v4

    invoke-virtual {v2}, Lorg/spongycastle/asn1/pkcs/DHParameter;->d()Ljava/math/BigInteger;

    move-result-object v2

    invoke-direct {v3, v4, v2, v1}, Lorg/spongycastle/crypto/params/DHParameters;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V

    new-instance v1, Lorg/spongycastle/crypto/params/DHPrivateKeyParameters;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/DERInteger;->c()Ljava/math/BigInteger;

    move-result-object v0

    invoke-direct {v1, v0, v3}, Lorg/spongycastle/crypto/params/DHPrivateKeyParameters;-><init>(Ljava/math/BigInteger;Lorg/spongycastle/crypto/params/DHParameters;)V

    move-object v0, v1

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, Ljava/math/BigInteger;->intValue()I

    move-result v1

    goto :goto_1

    :cond_2
    invoke-virtual {v2}, Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;->d()Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    move-result-object v0

    sget-object v3, Lorg/spongycastle/asn1/oiw/OIWObjectIdentifiers;->l:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v3}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    new-instance v3, Lorg/spongycastle/asn1/oiw/ElGamalParameter;

    invoke-virtual {v2}, Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;->e()Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/asn1/ASN1Sequence;

    invoke-direct {v3, v0}, Lorg/spongycastle/asn1/oiw/ElGamalParameter;-><init>(Lorg/spongycastle/asn1/ASN1Sequence;)V

    invoke-virtual {v1}, Lorg/spongycastle/asn1/pkcs/PrivateKeyInfo;->e()Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/asn1/DERInteger;

    new-instance v1, Lorg/spongycastle/crypto/params/ElGamalPrivateKeyParameters;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/DERInteger;->c()Ljava/math/BigInteger;

    move-result-object v0

    new-instance v2, Lorg/spongycastle/crypto/params/ElGamalParameters;

    invoke-virtual {v3}, Lorg/spongycastle/asn1/oiw/ElGamalParameter;->c()Ljava/math/BigInteger;

    move-result-object v4

    invoke-virtual {v3}, Lorg/spongycastle/asn1/oiw/ElGamalParameter;->d()Ljava/math/BigInteger;

    move-result-object v3

    invoke-direct {v2, v4, v3}, Lorg/spongycastle/crypto/params/ElGamalParameters;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    invoke-direct {v1, v0, v2}, Lorg/spongycastle/crypto/params/ElGamalPrivateKeyParameters;-><init>(Ljava/math/BigInteger;Lorg/spongycastle/crypto/params/ElGamalParameters;)V

    move-object v0, v1

    goto :goto_0

    :cond_3
    invoke-virtual {v2}, Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;->d()Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    move-result-object v0

    sget-object v3, Lorg/spongycastle/asn1/x9/X9ObjectIdentifiers;->U:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v3}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {v1}, Lorg/spongycastle/asn1/pkcs/PrivateKeyInfo;->e()Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/asn1/DERInteger;

    invoke-virtual {v2}, Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;->e()Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v2

    const/4 v1, 0x0

    if-eqz v2, :cond_4

    invoke-interface {v2}, Lorg/spongycastle/asn1/ASN1Encodable;->a()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v1

    invoke-static {v1}, Lorg/spongycastle/asn1/x509/DSAParameter;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/x509/DSAParameter;

    move-result-object v2

    new-instance v1, Lorg/spongycastle/crypto/params/DSAParameters;

    invoke-virtual {v2}, Lorg/spongycastle/asn1/x509/DSAParameter;->c()Ljava/math/BigInteger;

    move-result-object v3

    invoke-virtual {v2}, Lorg/spongycastle/asn1/x509/DSAParameter;->d()Ljava/math/BigInteger;

    move-result-object v4

    invoke-virtual {v2}, Lorg/spongycastle/asn1/x509/DSAParameter;->e()Ljava/math/BigInteger;

    move-result-object v2

    invoke-direct {v1, v3, v4, v2}, Lorg/spongycastle/crypto/params/DSAParameters;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    :cond_4
    new-instance v2, Lorg/spongycastle/crypto/params/DSAPrivateKeyParameters;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/DERInteger;->c()Ljava/math/BigInteger;

    move-result-object v0

    invoke-direct {v2, v0, v1}, Lorg/spongycastle/crypto/params/DSAPrivateKeyParameters;-><init>(Ljava/math/BigInteger;Lorg/spongycastle/crypto/params/DSAParameters;)V

    move-object v0, v2

    goto/16 :goto_0

    :cond_5
    invoke-virtual {v2}, Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;->d()Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    move-result-object v0

    sget-object v3, Lorg/spongycastle/asn1/x9/X9ObjectIdentifiers;->k:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v3}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    new-instance v3, Lorg/spongycastle/asn1/x9/X962Parameters;

    invoke-virtual {v2}, Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;->e()Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/asn1/ASN1Primitive;

    invoke-direct {v3, v0}, Lorg/spongycastle/asn1/x9/X962Parameters;-><init>(Lorg/spongycastle/asn1/ASN1Primitive;)V

    invoke-virtual {v3}, Lorg/spongycastle/asn1/x9/X962Parameters;->c()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-virtual {v3}, Lorg/spongycastle/asn1/x9/X962Parameters;->e()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v0

    invoke-static {v0}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    move-result-object v2

    invoke-static {v2}, Lorg/spongycastle/asn1/x9/X962NamedCurves;->a(Lorg/spongycastle/asn1/ASN1ObjectIdentifier;)Lorg/spongycastle/asn1/x9/X9ECParameters;

    move-result-object v0

    if-nez v0, :cond_6

    invoke-static {v2}, Lorg/spongycastle/asn1/sec/SECNamedCurves;->a(Lorg/spongycastle/asn1/ASN1ObjectIdentifier;)Lorg/spongycastle/asn1/x9/X9ECParameters;

    move-result-object v0

    if-nez v0, :cond_6

    invoke-static {v2}, Lorg/spongycastle/asn1/nist/NISTNamedCurves;->a(Lorg/spongycastle/asn1/ASN1ObjectIdentifier;)Lorg/spongycastle/asn1/x9/X9ECParameters;

    move-result-object v0

    if-nez v0, :cond_6

    invoke-static {v2}, Lorg/spongycastle/asn1/teletrust/TeleTrusTNamedCurves;->a(Lorg/spongycastle/asn1/ASN1ObjectIdentifier;)Lorg/spongycastle/asn1/x9/X9ECParameters;

    move-result-object v0

    :cond_6
    move-object v5, v0

    :goto_2
    invoke-virtual {v1}, Lorg/spongycastle/asn1/pkcs/PrivateKeyInfo;->e()Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v0

    invoke-static {v0}, Lorg/spongycastle/asn1/sec/ECPrivateKey;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/sec/ECPrivateKey;

    move-result-object v0

    invoke-virtual {v0}, Lorg/spongycastle/asn1/sec/ECPrivateKey;->c()Ljava/math/BigInteger;

    move-result-object v6

    new-instance v0, Lorg/spongycastle/crypto/params/ECDomainParameters;

    invoke-virtual {v5}, Lorg/spongycastle/asn1/x9/X9ECParameters;->c()Lorg/spongycastle/math/ec/ECCurve;

    move-result-object v1

    invoke-virtual {v5}, Lorg/spongycastle/asn1/x9/X9ECParameters;->d()Lorg/spongycastle/math/ec/ECPoint;

    move-result-object v2

    invoke-virtual {v5}, Lorg/spongycastle/asn1/x9/X9ECParameters;->e()Ljava/math/BigInteger;

    move-result-object v3

    invoke-virtual {v5}, Lorg/spongycastle/asn1/x9/X9ECParameters;->f()Ljava/math/BigInteger;

    move-result-object v4

    invoke-virtual {v5}, Lorg/spongycastle/asn1/x9/X9ECParameters;->g()[B

    move-result-object v5

    invoke-direct/range {v0 .. v5}, Lorg/spongycastle/crypto/params/ECDomainParameters;-><init>(Lorg/spongycastle/math/ec/ECCurve;Lorg/spongycastle/math/ec/ECPoint;Ljava/math/BigInteger;Ljava/math/BigInteger;[B)V

    new-instance v1, Lorg/spongycastle/crypto/params/ECPrivateKeyParameters;

    invoke-direct {v1, v6, v0}, Lorg/spongycastle/crypto/params/ECPrivateKeyParameters;-><init>(Ljava/math/BigInteger;Lorg/spongycastle/crypto/params/ECDomainParameters;)V

    move-object v0, v1

    goto/16 :goto_0

    :cond_7
    invoke-virtual {v3}, Lorg/spongycastle/asn1/x9/X962Parameters;->e()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v0

    invoke-static {v0}, Lorg/spongycastle/asn1/x9/X9ECParameters;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/x9/X9ECParameters;

    move-result-object v0

    move-object v5, v0

    goto :goto_2

    :cond_8
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "algorithm identifier in key not recognised"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
