.class public Lorg/bouncycastle/crypto/util/PrivateKeyFactory;
.super Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static createKey(Ljava/io/InputStream;)Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;
    .locals 1

    new-instance v0, Lorg/bouncycastle/asn1/ASN1InputStream;

    invoke-direct {v0, p0}, Lorg/bouncycastle/asn1/ASN1InputStream;-><init>(Ljava/io/InputStream;)V

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/ASN1InputStream;->a()Lorg/bouncycastle/asn1/DERObject;

    move-result-object v0

    invoke-static {v0}, Lorg/bouncycastle/asn1/pkcs/PrivateKeyInfo;->a(Ljava/lang/Object;)Lorg/bouncycastle/asn1/pkcs/PrivateKeyInfo;

    move-result-object v0

    invoke-static {v0}, Lorg/bouncycastle/crypto/util/PrivateKeyFactory;->createKey(Lorg/bouncycastle/asn1/pkcs/PrivateKeyInfo;)Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;

    move-result-object v0

    return-object v0
.end method

.method public static createKey(Lorg/bouncycastle/asn1/pkcs/PrivateKeyInfo;)Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;
    .locals 9

    const/4 v2, 0x0

    invoke-virtual {p0}, Lorg/bouncycastle/asn1/pkcs/PrivateKeyInfo;->e()Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    move-result-object v0

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;->f()Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    move-result-object v1

    sget-object v3, Lorg/bouncycastle/asn1/pkcs/PKCSObjectIdentifiers;->h_:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v1, v3}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v8, Lorg/bouncycastle/asn1/pkcs/RSAPrivateKeyStructure;

    invoke-virtual {p0}, Lorg/bouncycastle/asn1/pkcs/PrivateKeyInfo;->f()Lorg/bouncycastle/asn1/DERObject;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/asn1/ASN1Sequence;

    invoke-direct {v8, v0}, Lorg/bouncycastle/asn1/pkcs/RSAPrivateKeyStructure;-><init>(Lorg/bouncycastle/asn1/ASN1Sequence;)V

    new-instance v0, Lorg/bouncycastle/crypto/params/RSAPrivateCrtKeyParameters;

    invoke-virtual {v8}, Lorg/bouncycastle/asn1/pkcs/RSAPrivateKeyStructure;->e()Ljava/math/BigInteger;

    move-result-object v1

    invoke-virtual {v8}, Lorg/bouncycastle/asn1/pkcs/RSAPrivateKeyStructure;->f()Ljava/math/BigInteger;

    move-result-object v2

    invoke-virtual {v8}, Lorg/bouncycastle/asn1/pkcs/RSAPrivateKeyStructure;->g()Ljava/math/BigInteger;

    move-result-object v3

    invoke-virtual {v8}, Lorg/bouncycastle/asn1/pkcs/RSAPrivateKeyStructure;->h()Ljava/math/BigInteger;

    move-result-object v4

    invoke-virtual {v8}, Lorg/bouncycastle/asn1/pkcs/RSAPrivateKeyStructure;->i()Ljava/math/BigInteger;

    move-result-object v5

    invoke-virtual {v8}, Lorg/bouncycastle/asn1/pkcs/RSAPrivateKeyStructure;->j()Ljava/math/BigInteger;

    move-result-object v6

    invoke-virtual {v8}, Lorg/bouncycastle/asn1/pkcs/RSAPrivateKeyStructure;->k()Ljava/math/BigInteger;

    move-result-object v7

    invoke-virtual {v8}, Lorg/bouncycastle/asn1/pkcs/RSAPrivateKeyStructure;->l()Ljava/math/BigInteger;

    move-result-object v8

    invoke-direct/range {v0 .. v8}, Lorg/bouncycastle/crypto/params/RSAPrivateCrtKeyParameters;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    :goto_0
    return-object v0

    :cond_0
    invoke-virtual {v0}, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;->e()Lorg/bouncycastle/asn1/DERObjectIdentifier;

    move-result-object v1

    sget-object v3, Lorg/bouncycastle/asn1/pkcs/PKCSObjectIdentifiers;->q:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v1, v3}, Lorg/bouncycastle/asn1/DERObjectIdentifier;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    new-instance v3, Lorg/bouncycastle/asn1/pkcs/DHParameter;

    invoke-virtual {p0}, Lorg/bouncycastle/asn1/pkcs/PrivateKeyInfo;->e()Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    move-result-object v0

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;->g()Lorg/bouncycastle/asn1/DEREncodable;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/asn1/ASN1Sequence;

    invoke-direct {v3, v0}, Lorg/bouncycastle/asn1/pkcs/DHParameter;-><init>(Lorg/bouncycastle/asn1/ASN1Sequence;)V

    invoke-virtual {p0}, Lorg/bouncycastle/asn1/pkcs/PrivateKeyInfo;->f()Lorg/bouncycastle/asn1/DERObject;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/asn1/DERInteger;

    invoke-virtual {v3}, Lorg/bouncycastle/asn1/pkcs/DHParameter;->g()Ljava/math/BigInteger;

    move-result-object v1

    if-nez v1, :cond_1

    const/4 v1, 0x0

    :goto_1
    new-instance v4, Lorg/bouncycastle/crypto/params/DHParameters;

    invoke-virtual {v3}, Lorg/bouncycastle/asn1/pkcs/DHParameter;->e()Ljava/math/BigInteger;

    move-result-object v5

    invoke-virtual {v3}, Lorg/bouncycastle/asn1/pkcs/DHParameter;->f()Ljava/math/BigInteger;

    move-result-object v3

    invoke-direct {v4, v5, v3, v2, v1}, Lorg/bouncycastle/crypto/params/DHParameters;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;I)V

    new-instance v1, Lorg/bouncycastle/crypto/params/DHPrivateKeyParameters;

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/DERInteger;->e()Ljava/math/BigInteger;

    move-result-object v0

    invoke-direct {v1, v0, v4}, Lorg/bouncycastle/crypto/params/DHPrivateKeyParameters;-><init>(Ljava/math/BigInteger;Lorg/bouncycastle/crypto/params/DHParameters;)V

    move-object v0, v1

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, Ljava/math/BigInteger;->intValue()I

    move-result v1

    goto :goto_1

    :cond_2
    invoke-virtual {v0}, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;->e()Lorg/bouncycastle/asn1/DERObjectIdentifier;

    move-result-object v1

    sget-object v3, Lorg/bouncycastle/asn1/oiw/OIWObjectIdentifiers;->l:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v1, v3}, Lorg/bouncycastle/asn1/DERObjectIdentifier;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    new-instance v2, Lorg/bouncycastle/asn1/oiw/ElGamalParameter;

    invoke-virtual {p0}, Lorg/bouncycastle/asn1/pkcs/PrivateKeyInfo;->e()Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    move-result-object v0

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;->g()Lorg/bouncycastle/asn1/DEREncodable;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/asn1/ASN1Sequence;

    invoke-direct {v2, v0}, Lorg/bouncycastle/asn1/oiw/ElGamalParameter;-><init>(Lorg/bouncycastle/asn1/ASN1Sequence;)V

    invoke-virtual {p0}, Lorg/bouncycastle/asn1/pkcs/PrivateKeyInfo;->f()Lorg/bouncycastle/asn1/DERObject;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/asn1/DERInteger;

    new-instance v1, Lorg/bouncycastle/crypto/params/ElGamalPrivateKeyParameters;

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/DERInteger;->e()Ljava/math/BigInteger;

    move-result-object v0

    new-instance v3, Lorg/bouncycastle/crypto/params/ElGamalParameters;

    invoke-virtual {v2}, Lorg/bouncycastle/asn1/oiw/ElGamalParameter;->e()Ljava/math/BigInteger;

    move-result-object v4

    invoke-virtual {v2}, Lorg/bouncycastle/asn1/oiw/ElGamalParameter;->f()Ljava/math/BigInteger;

    move-result-object v2

    invoke-direct {v3, v4, v2}, Lorg/bouncycastle/crypto/params/ElGamalParameters;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    invoke-direct {v1, v0, v3}, Lorg/bouncycastle/crypto/params/ElGamalPrivateKeyParameters;-><init>(Ljava/math/BigInteger;Lorg/bouncycastle/crypto/params/ElGamalParameters;)V

    move-object v0, v1

    goto :goto_0

    :cond_3
    invoke-virtual {v0}, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;->e()Lorg/bouncycastle/asn1/DERObjectIdentifier;

    move-result-object v1

    sget-object v3, Lorg/bouncycastle/asn1/x9/X9ObjectIdentifiers;->U:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v1, v3}, Lorg/bouncycastle/asn1/DERObjectIdentifier;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-virtual {p0}, Lorg/bouncycastle/asn1/pkcs/PrivateKeyInfo;->f()Lorg/bouncycastle/asn1/DERObject;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/asn1/DERInteger;

    invoke-virtual {p0}, Lorg/bouncycastle/asn1/pkcs/PrivateKeyInfo;->e()Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    move-result-object v1

    invoke-virtual {v1}, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;->g()Lorg/bouncycastle/asn1/DEREncodable;

    move-result-object v1

    if-eqz v1, :cond_8

    invoke-interface {v1}, Lorg/bouncycastle/asn1/DEREncodable;->c()Lorg/bouncycastle/asn1/DERObject;

    move-result-object v1

    invoke-static {v1}, Lorg/bouncycastle/asn1/x509/DSAParameter;->a(Ljava/lang/Object;)Lorg/bouncycastle/asn1/x509/DSAParameter;

    move-result-object v2

    new-instance v1, Lorg/bouncycastle/crypto/params/DSAParameters;

    invoke-virtual {v2}, Lorg/bouncycastle/asn1/x509/DSAParameter;->e()Ljava/math/BigInteger;

    move-result-object v3

    invoke-virtual {v2}, Lorg/bouncycastle/asn1/x509/DSAParameter;->f()Ljava/math/BigInteger;

    move-result-object v4

    invoke-virtual {v2}, Lorg/bouncycastle/asn1/x509/DSAParameter;->g()Ljava/math/BigInteger;

    move-result-object v2

    invoke-direct {v1, v3, v4, v2}, Lorg/bouncycastle/crypto/params/DSAParameters;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    :goto_2
    new-instance v2, Lorg/bouncycastle/crypto/params/DSAPrivateKeyParameters;

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/DERInteger;->e()Ljava/math/BigInteger;

    move-result-object v0

    invoke-direct {v2, v0, v1}, Lorg/bouncycastle/crypto/params/DSAPrivateKeyParameters;-><init>(Ljava/math/BigInteger;Lorg/bouncycastle/crypto/params/DSAParameters;)V

    move-object v0, v2

    goto/16 :goto_0

    :cond_4
    invoke-virtual {v0}, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;->e()Lorg/bouncycastle/asn1/DERObjectIdentifier;

    move-result-object v0

    sget-object v1, Lorg/bouncycastle/asn1/x9/X9ObjectIdentifiers;->k:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1}, Lorg/bouncycastle/asn1/DERObjectIdentifier;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    new-instance v1, Lorg/bouncycastle/asn1/x9/X962Parameters;

    invoke-virtual {p0}, Lorg/bouncycastle/asn1/pkcs/PrivateKeyInfo;->e()Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    move-result-object v0

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;->g()Lorg/bouncycastle/asn1/DEREncodable;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/asn1/DERObject;

    invoke-direct {v1, v0}, Lorg/bouncycastle/asn1/x9/X962Parameters;-><init>(Lorg/bouncycastle/asn1/DERObject;)V

    invoke-virtual {v1}, Lorg/bouncycastle/asn1/x9/X962Parameters;->e()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {v1}, Lorg/bouncycastle/asn1/x9/X962Parameters;->g()Lorg/bouncycastle/asn1/DERObject;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/asn1/DERObjectIdentifier;

    invoke-static {v0}, Lorg/bouncycastle/asn1/x9/X962NamedCurves;->a(Lorg/bouncycastle/asn1/DERObjectIdentifier;)Lorg/bouncycastle/asn1/x9/X9ECParameters;

    move-result-object v1

    if-nez v1, :cond_7

    invoke-static {v0}, Lorg/bouncycastle/asn1/sec/SECNamedCurves;->a(Lorg/bouncycastle/asn1/DERObjectIdentifier;)Lorg/bouncycastle/asn1/x9/X9ECParameters;

    move-result-object v1

    if-nez v1, :cond_7

    invoke-static {v0}, Lorg/bouncycastle/asn1/nist/NISTNamedCurves;->a(Lorg/bouncycastle/asn1/DERObjectIdentifier;)Lorg/bouncycastle/asn1/x9/X9ECParameters;

    move-result-object v1

    if-nez v1, :cond_7

    invoke-static {v0}, Lorg/bouncycastle/asn1/teletrust/TeleTrusTNamedCurves;->a(Lorg/bouncycastle/asn1/DERObjectIdentifier;)Lorg/bouncycastle/asn1/x9/X9ECParameters;

    move-result-object v0

    move-object v5, v0

    :goto_3
    new-instance v0, Lorg/bouncycastle/crypto/params/ECDomainParameters;

    invoke-virtual {v5}, Lorg/bouncycastle/asn1/x9/X9ECParameters;->e()Lorg/bouncycastle/math/ec/ECCurve;

    move-result-object v1

    invoke-virtual {v5}, Lorg/bouncycastle/asn1/x9/X9ECParameters;->f()Lorg/bouncycastle/math/ec/ECPoint;

    move-result-object v2

    invoke-virtual {v5}, Lorg/bouncycastle/asn1/x9/X9ECParameters;->g()Ljava/math/BigInteger;

    move-result-object v3

    invoke-virtual {v5}, Lorg/bouncycastle/asn1/x9/X9ECParameters;->h()Ljava/math/BigInteger;

    move-result-object v4

    invoke-virtual {v5}, Lorg/bouncycastle/asn1/x9/X9ECParameters;->i()[B

    move-result-object v5

    invoke-direct/range {v0 .. v5}, Lorg/bouncycastle/crypto/params/ECDomainParameters;-><init>(Lorg/bouncycastle/math/ec/ECCurve;Lorg/bouncycastle/math/ec/ECPoint;Ljava/math/BigInteger;Ljava/math/BigInteger;[B)V

    move-object v1, v0

    :goto_4
    new-instance v2, Lorg/bouncycastle/asn1/sec/ECPrivateKeyStructure;

    invoke-virtual {p0}, Lorg/bouncycastle/asn1/pkcs/PrivateKeyInfo;->f()Lorg/bouncycastle/asn1/DERObject;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/asn1/ASN1Sequence;

    invoke-direct {v2, v0}, Lorg/bouncycastle/asn1/sec/ECPrivateKeyStructure;-><init>(Lorg/bouncycastle/asn1/ASN1Sequence;)V

    new-instance v0, Lorg/bouncycastle/crypto/params/ECPrivateKeyParameters;

    invoke-virtual {v2}, Lorg/bouncycastle/asn1/sec/ECPrivateKeyStructure;->e()Ljava/math/BigInteger;

    move-result-object v2

    invoke-direct {v0, v2, v1}, Lorg/bouncycastle/crypto/params/ECPrivateKeyParameters;-><init>(Ljava/math/BigInteger;Lorg/bouncycastle/crypto/params/ECDomainParameters;)V

    goto/16 :goto_0

    :cond_5
    new-instance v5, Lorg/bouncycastle/asn1/x9/X9ECParameters;

    invoke-virtual {v1}, Lorg/bouncycastle/asn1/x9/X962Parameters;->g()Lorg/bouncycastle/asn1/DERObject;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/asn1/ASN1Sequence;

    invoke-direct {v5, v0}, Lorg/bouncycastle/asn1/x9/X9ECParameters;-><init>(Lorg/bouncycastle/asn1/ASN1Sequence;)V

    new-instance v0, Lorg/bouncycastle/crypto/params/ECDomainParameters;

    invoke-virtual {v5}, Lorg/bouncycastle/asn1/x9/X9ECParameters;->e()Lorg/bouncycastle/math/ec/ECCurve;

    move-result-object v1

    invoke-virtual {v5}, Lorg/bouncycastle/asn1/x9/X9ECParameters;->f()Lorg/bouncycastle/math/ec/ECPoint;

    move-result-object v2

    invoke-virtual {v5}, Lorg/bouncycastle/asn1/x9/X9ECParameters;->g()Ljava/math/BigInteger;

    move-result-object v3

    invoke-virtual {v5}, Lorg/bouncycastle/asn1/x9/X9ECParameters;->h()Ljava/math/BigInteger;

    move-result-object v4

    invoke-virtual {v5}, Lorg/bouncycastle/asn1/x9/X9ECParameters;->i()[B

    move-result-object v5

    invoke-direct/range {v0 .. v5}, Lorg/bouncycastle/crypto/params/ECDomainParameters;-><init>(Lorg/bouncycastle/math/ec/ECCurve;Lorg/bouncycastle/math/ec/ECPoint;Ljava/math/BigInteger;Ljava/math/BigInteger;[B)V

    move-object v1, v0

    goto :goto_4

    :cond_6
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "algorithm identifier in key not recognised"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    move-object v5, v1

    goto :goto_3

    :cond_8
    move-object v1, v2

    goto/16 :goto_2
.end method

.method public static createKey([B)Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;
    .locals 1

    invoke-static {p0}, Lorg/bouncycastle/asn1/ASN1Object;->a([B)Lorg/bouncycastle/asn1/ASN1Object;

    move-result-object v0

    invoke-static {v0}, Lorg/bouncycastle/asn1/pkcs/PrivateKeyInfo;->a(Ljava/lang/Object;)Lorg/bouncycastle/asn1/pkcs/PrivateKeyInfo;

    move-result-object v0

    invoke-static {v0}, Lorg/bouncycastle/crypto/util/PrivateKeyFactory;->createKey(Lorg/bouncycastle/asn1/pkcs/PrivateKeyInfo;)Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;

    move-result-object v0

    return-object v0
.end method
