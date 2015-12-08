.class public Lorg/bouncycastle/crypto/util/PublicKeyFactory;
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

    invoke-static {v0}, Lorg/bouncycastle/asn1/x509/SubjectPublicKeyInfo;->a(Ljava/lang/Object;)Lorg/bouncycastle/asn1/x509/SubjectPublicKeyInfo;

    move-result-object v0

    invoke-static {v0}, Lorg/bouncycastle/crypto/util/PublicKeyFactory;->createKey(Lorg/bouncycastle/asn1/x509/SubjectPublicKeyInfo;)Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;

    move-result-object v0

    return-object v0
.end method

.method public static createKey(Lorg/bouncycastle/asn1/x509/SubjectPublicKeyInfo;)Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;
    .locals 8

    const/4 v1, 0x0

    const/4 v5, 0x0

    invoke-virtual {p0}, Lorg/bouncycastle/asn1/x509/SubjectPublicKeyInfo;->e()Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    move-result-object v0

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;->e()Lorg/bouncycastle/asn1/DERObjectIdentifier;

    move-result-object v2

    sget-object v3, Lorg/bouncycastle/asn1/pkcs/PKCSObjectIdentifiers;->h_:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v2, v3}, Lorg/bouncycastle/asn1/DERObjectIdentifier;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;->e()Lorg/bouncycastle/asn1/DERObjectIdentifier;

    move-result-object v2

    sget-object v3, Lorg/bouncycastle/asn1/x509/X509ObjectIdentifiers;->l:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v2, v3}, Lorg/bouncycastle/asn1/DERObjectIdentifier;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    :cond_0
    new-instance v2, Lorg/bouncycastle/asn1/x509/RSAPublicKeyStructure;

    invoke-virtual {p0}, Lorg/bouncycastle/asn1/x509/SubjectPublicKeyInfo;->f()Lorg/bouncycastle/asn1/DERObject;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/asn1/ASN1Sequence;

    invoke-direct {v2, v0}, Lorg/bouncycastle/asn1/x509/RSAPublicKeyStructure;-><init>(Lorg/bouncycastle/asn1/ASN1Sequence;)V

    new-instance v0, Lorg/bouncycastle/crypto/params/RSAKeyParameters;

    invoke-virtual {v2}, Lorg/bouncycastle/asn1/x509/RSAPublicKeyStructure;->e()Ljava/math/BigInteger;

    move-result-object v3

    invoke-virtual {v2}, Lorg/bouncycastle/asn1/x509/RSAPublicKeyStructure;->f()Ljava/math/BigInteger;

    move-result-object v2

    invoke-direct {v0, v1, v3, v2}, Lorg/bouncycastle/crypto/params/RSAKeyParameters;-><init>(ZLjava/math/BigInteger;Ljava/math/BigInteger;)V

    :goto_0
    return-object v0

    :cond_1
    invoke-virtual {v0}, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;->e()Lorg/bouncycastle/asn1/DERObjectIdentifier;

    move-result-object v2

    sget-object v3, Lorg/bouncycastle/asn1/x9/X9ObjectIdentifiers;->ab:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v2, v3}, Lorg/bouncycastle/asn1/DERObjectIdentifier;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-virtual {p0}, Lorg/bouncycastle/asn1/x509/SubjectPublicKeyInfo;->f()Lorg/bouncycastle/asn1/DERObject;

    move-result-object v0

    invoke-static {v0}, Lorg/bouncycastle/asn1/x9/DHPublicKey;->a(Ljava/lang/Object;)Lorg/bouncycastle/asn1/x9/DHPublicKey;

    move-result-object v0

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/x9/DHPublicKey;->e()Lorg/bouncycastle/asn1/DERInteger;

    move-result-object v0

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/DERInteger;->e()Ljava/math/BigInteger;

    move-result-object v7

    invoke-virtual {p0}, Lorg/bouncycastle/asn1/x509/SubjectPublicKeyInfo;->e()Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    move-result-object v0

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;->g()Lorg/bouncycastle/asn1/DEREncodable;

    move-result-object v0

    invoke-static {v0}, Lorg/bouncycastle/asn1/x9/DHDomainParameters;->a(Ljava/lang/Object;)Lorg/bouncycastle/asn1/x9/DHDomainParameters;

    move-result-object v0

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/x9/DHDomainParameters;->e()Lorg/bouncycastle/asn1/DERInteger;

    move-result-object v1

    invoke-virtual {v1}, Lorg/bouncycastle/asn1/DERInteger;->e()Ljava/math/BigInteger;

    move-result-object v1

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/x9/DHDomainParameters;->f()Lorg/bouncycastle/asn1/DERInteger;

    move-result-object v2

    invoke-virtual {v2}, Lorg/bouncycastle/asn1/DERInteger;->e()Ljava/math/BigInteger;

    move-result-object v2

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/x9/DHDomainParameters;->g()Lorg/bouncycastle/asn1/DERInteger;

    move-result-object v3

    invoke-virtual {v3}, Lorg/bouncycastle/asn1/DERInteger;->e()Ljava/math/BigInteger;

    move-result-object v3

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/x9/DHDomainParameters;->h()Lorg/bouncycastle/asn1/DERInteger;

    move-result-object v4

    if-eqz v4, :cond_d

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/x9/DHDomainParameters;->h()Lorg/bouncycastle/asn1/DERInteger;

    move-result-object v4

    invoke-virtual {v4}, Lorg/bouncycastle/asn1/DERInteger;->e()Ljava/math/BigInteger;

    move-result-object v4

    :goto_1
    invoke-virtual {v0}, Lorg/bouncycastle/asn1/x9/DHDomainParameters;->i()Lorg/bouncycastle/asn1/x9/DHValidationParms;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/x9/DHValidationParms;->e()Lorg/bouncycastle/asn1/DERBitString;

    move-result-object v5

    invoke-virtual {v5}, Lorg/bouncycastle/asn1/DERBitString;->e()[B

    move-result-object v6

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/x9/DHValidationParms;->f()Lorg/bouncycastle/asn1/DERInteger;

    move-result-object v0

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/DERInteger;->e()Ljava/math/BigInteger;

    move-result-object v0

    new-instance v5, Lorg/bouncycastle/crypto/params/DHValidationParameters;

    invoke-virtual {v0}, Ljava/math/BigInteger;->intValue()I

    move-result v0

    invoke-direct {v5, v6, v0}, Lorg/bouncycastle/crypto/params/DHValidationParameters;-><init>([BI)V

    :cond_2
    new-instance v6, Lorg/bouncycastle/crypto/params/DHPublicKeyParameters;

    new-instance v0, Lorg/bouncycastle/crypto/params/DHParameters;

    invoke-direct/range {v0 .. v5}, Lorg/bouncycastle/crypto/params/DHParameters;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Lorg/bouncycastle/crypto/params/DHValidationParameters;)V

    invoke-direct {v6, v7, v0}, Lorg/bouncycastle/crypto/params/DHPublicKeyParameters;-><init>(Ljava/math/BigInteger;Lorg/bouncycastle/crypto/params/DHParameters;)V

    move-object v0, v6

    goto :goto_0

    :cond_3
    invoke-virtual {v0}, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;->e()Lorg/bouncycastle/asn1/DERObjectIdentifier;

    move-result-object v2

    sget-object v3, Lorg/bouncycastle/asn1/pkcs/PKCSObjectIdentifiers;->q:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v2, v3}, Lorg/bouncycastle/asn1/DERObjectIdentifier;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    new-instance v2, Lorg/bouncycastle/asn1/pkcs/DHParameter;

    invoke-virtual {p0}, Lorg/bouncycastle/asn1/x509/SubjectPublicKeyInfo;->e()Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    move-result-object v0

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;->g()Lorg/bouncycastle/asn1/DEREncodable;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/asn1/ASN1Sequence;

    invoke-direct {v2, v0}, Lorg/bouncycastle/asn1/pkcs/DHParameter;-><init>(Lorg/bouncycastle/asn1/ASN1Sequence;)V

    invoke-virtual {p0}, Lorg/bouncycastle/asn1/x509/SubjectPublicKeyInfo;->f()Lorg/bouncycastle/asn1/DERObject;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/asn1/DERInteger;

    invoke-virtual {v2}, Lorg/bouncycastle/asn1/pkcs/DHParameter;->g()Ljava/math/BigInteger;

    move-result-object v3

    if-nez v3, :cond_4

    :goto_2
    new-instance v3, Lorg/bouncycastle/crypto/params/DHParameters;

    invoke-virtual {v2}, Lorg/bouncycastle/asn1/pkcs/DHParameter;->e()Ljava/math/BigInteger;

    move-result-object v4

    invoke-virtual {v2}, Lorg/bouncycastle/asn1/pkcs/DHParameter;->f()Ljava/math/BigInteger;

    move-result-object v2

    invoke-direct {v3, v4, v2, v5, v1}, Lorg/bouncycastle/crypto/params/DHParameters;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;I)V

    new-instance v1, Lorg/bouncycastle/crypto/params/DHPublicKeyParameters;

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/DERInteger;->e()Ljava/math/BigInteger;

    move-result-object v0

    invoke-direct {v1, v0, v3}, Lorg/bouncycastle/crypto/params/DHPublicKeyParameters;-><init>(Ljava/math/BigInteger;Lorg/bouncycastle/crypto/params/DHParameters;)V

    move-object v0, v1

    goto/16 :goto_0

    :cond_4
    invoke-virtual {v3}, Ljava/math/BigInteger;->intValue()I

    move-result v1

    goto :goto_2

    :cond_5
    invoke-virtual {v0}, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;->e()Lorg/bouncycastle/asn1/DERObjectIdentifier;

    move-result-object v1

    sget-object v2, Lorg/bouncycastle/asn1/oiw/OIWObjectIdentifiers;->l:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v1, v2}, Lorg/bouncycastle/asn1/DERObjectIdentifier;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    new-instance v2, Lorg/bouncycastle/asn1/oiw/ElGamalParameter;

    invoke-virtual {p0}, Lorg/bouncycastle/asn1/x509/SubjectPublicKeyInfo;->e()Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    move-result-object v0

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;->g()Lorg/bouncycastle/asn1/DEREncodable;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/asn1/ASN1Sequence;

    invoke-direct {v2, v0}, Lorg/bouncycastle/asn1/oiw/ElGamalParameter;-><init>(Lorg/bouncycastle/asn1/ASN1Sequence;)V

    invoke-virtual {p0}, Lorg/bouncycastle/asn1/x509/SubjectPublicKeyInfo;->f()Lorg/bouncycastle/asn1/DERObject;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/asn1/DERInteger;

    new-instance v1, Lorg/bouncycastle/crypto/params/ElGamalPublicKeyParameters;

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/DERInteger;->e()Ljava/math/BigInteger;

    move-result-object v0

    new-instance v3, Lorg/bouncycastle/crypto/params/ElGamalParameters;

    invoke-virtual {v2}, Lorg/bouncycastle/asn1/oiw/ElGamalParameter;->e()Ljava/math/BigInteger;

    move-result-object v4

    invoke-virtual {v2}, Lorg/bouncycastle/asn1/oiw/ElGamalParameter;->f()Ljava/math/BigInteger;

    move-result-object v2

    invoke-direct {v3, v4, v2}, Lorg/bouncycastle/crypto/params/ElGamalParameters;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    invoke-direct {v1, v0, v3}, Lorg/bouncycastle/crypto/params/ElGamalPublicKeyParameters;-><init>(Ljava/math/BigInteger;Lorg/bouncycastle/crypto/params/ElGamalParameters;)V

    move-object v0, v1

    goto/16 :goto_0

    :cond_6
    invoke-virtual {v0}, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;->e()Lorg/bouncycastle/asn1/DERObjectIdentifier;

    move-result-object v1

    sget-object v2, Lorg/bouncycastle/asn1/x9/X9ObjectIdentifiers;->U:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v1, v2}, Lorg/bouncycastle/asn1/DERObjectIdentifier;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;->e()Lorg/bouncycastle/asn1/DERObjectIdentifier;

    move-result-object v1

    sget-object v2, Lorg/bouncycastle/asn1/oiw/OIWObjectIdentifiers;->j:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v1, v2}, Lorg/bouncycastle/asn1/DERObjectIdentifier;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_9

    :cond_7
    invoke-virtual {p0}, Lorg/bouncycastle/asn1/x509/SubjectPublicKeyInfo;->f()Lorg/bouncycastle/asn1/DERObject;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/asn1/DERInteger;

    invoke-virtual {p0}, Lorg/bouncycastle/asn1/x509/SubjectPublicKeyInfo;->e()Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    move-result-object v1

    invoke-virtual {v1}, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;->g()Lorg/bouncycastle/asn1/DEREncodable;

    move-result-object v1

    if-eqz v1, :cond_8

    invoke-interface {v1}, Lorg/bouncycastle/asn1/DEREncodable;->c()Lorg/bouncycastle/asn1/DERObject;

    move-result-object v1

    invoke-static {v1}, Lorg/bouncycastle/asn1/x509/DSAParameter;->a(Ljava/lang/Object;)Lorg/bouncycastle/asn1/x509/DSAParameter;

    move-result-object v1

    new-instance v5, Lorg/bouncycastle/crypto/params/DSAParameters;

    invoke-virtual {v1}, Lorg/bouncycastle/asn1/x509/DSAParameter;->e()Ljava/math/BigInteger;

    move-result-object v2

    invoke-virtual {v1}, Lorg/bouncycastle/asn1/x509/DSAParameter;->f()Ljava/math/BigInteger;

    move-result-object v3

    invoke-virtual {v1}, Lorg/bouncycastle/asn1/x509/DSAParameter;->g()Ljava/math/BigInteger;

    move-result-object v1

    invoke-direct {v5, v2, v3, v1}, Lorg/bouncycastle/crypto/params/DSAParameters;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    :cond_8
    new-instance v1, Lorg/bouncycastle/crypto/params/DSAPublicKeyParameters;

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/DERInteger;->e()Ljava/math/BigInteger;

    move-result-object v0

    invoke-direct {v1, v0, v5}, Lorg/bouncycastle/crypto/params/DSAPublicKeyParameters;-><init>(Ljava/math/BigInteger;Lorg/bouncycastle/crypto/params/DSAParameters;)V

    move-object v0, v1

    goto/16 :goto_0

    :cond_9
    invoke-virtual {v0}, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;->e()Lorg/bouncycastle/asn1/DERObjectIdentifier;

    move-result-object v0

    sget-object v1, Lorg/bouncycastle/asn1/x9/X9ObjectIdentifiers;->k:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1}, Lorg/bouncycastle/asn1/DERObjectIdentifier;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_b

    new-instance v1, Lorg/bouncycastle/asn1/x9/X962Parameters;

    invoke-virtual {p0}, Lorg/bouncycastle/asn1/x509/SubjectPublicKeyInfo;->e()Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    move-result-object v0

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;->g()Lorg/bouncycastle/asn1/DEREncodable;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/asn1/DERObject;

    invoke-direct {v1, v0}, Lorg/bouncycastle/asn1/x9/X962Parameters;-><init>(Lorg/bouncycastle/asn1/DERObject;)V

    invoke-virtual {v1}, Lorg/bouncycastle/asn1/x9/X962Parameters;->e()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-virtual {v1}, Lorg/bouncycastle/asn1/x9/X962Parameters;->g()Lorg/bouncycastle/asn1/DERObject;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/asn1/DERObjectIdentifier;

    invoke-static {v0}, Lorg/bouncycastle/asn1/x9/X962NamedCurves;->a(Lorg/bouncycastle/asn1/DERObjectIdentifier;)Lorg/bouncycastle/asn1/x9/X9ECParameters;

    move-result-object v1

    if-nez v1, :cond_c

    invoke-static {v0}, Lorg/bouncycastle/asn1/sec/SECNamedCurves;->a(Lorg/bouncycastle/asn1/DERObjectIdentifier;)Lorg/bouncycastle/asn1/x9/X9ECParameters;

    move-result-object v1

    if-nez v1, :cond_c

    invoke-static {v0}, Lorg/bouncycastle/asn1/nist/NISTNamedCurves;->a(Lorg/bouncycastle/asn1/DERObjectIdentifier;)Lorg/bouncycastle/asn1/x9/X9ECParameters;

    move-result-object v1

    if-nez v1, :cond_c

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

    :goto_4
    invoke-virtual {p0}, Lorg/bouncycastle/asn1/x509/SubjectPublicKeyInfo;->g()Lorg/bouncycastle/asn1/DERBitString;

    move-result-object v1

    invoke-virtual {v1}, Lorg/bouncycastle/asn1/DERBitString;->e()[B

    move-result-object v1

    new-instance v2, Lorg/bouncycastle/asn1/DEROctetString;

    invoke-direct {v2, v1}, Lorg/bouncycastle/asn1/DEROctetString;-><init>([B)V

    new-instance v3, Lorg/bouncycastle/asn1/x9/X9ECPoint;

    invoke-virtual {v0}, Lorg/bouncycastle/crypto/params/ECDomainParameters;->getCurve()Lorg/bouncycastle/math/ec/ECCurve;

    move-result-object v1

    invoke-direct {v3, v1, v2}, Lorg/bouncycastle/asn1/x9/X9ECPoint;-><init>(Lorg/bouncycastle/math/ec/ECCurve;Lorg/bouncycastle/asn1/ASN1OctetString;)V

    new-instance v1, Lorg/bouncycastle/crypto/params/ECPublicKeyParameters;

    invoke-virtual {v3}, Lorg/bouncycastle/asn1/x9/X9ECPoint;->e()Lorg/bouncycastle/math/ec/ECPoint;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Lorg/bouncycastle/crypto/params/ECPublicKeyParameters;-><init>(Lorg/bouncycastle/math/ec/ECPoint;Lorg/bouncycastle/crypto/params/ECDomainParameters;)V

    move-object v0, v1

    goto/16 :goto_0

    :cond_a
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

    goto :goto_4

    :cond_b
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "algorithm identifier in key not recognised"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_c
    move-object v5, v1

    goto :goto_3

    :cond_d
    move-object v4, v5

    goto/16 :goto_1
.end method

.method public static createKey([B)Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;
    .locals 1

    invoke-static {p0}, Lorg/bouncycastle/asn1/ASN1Object;->a([B)Lorg/bouncycastle/asn1/ASN1Object;

    move-result-object v0

    invoke-static {v0}, Lorg/bouncycastle/asn1/x509/SubjectPublicKeyInfo;->a(Ljava/lang/Object;)Lorg/bouncycastle/asn1/x509/SubjectPublicKeyInfo;

    move-result-object v0

    invoke-static {v0}, Lorg/bouncycastle/crypto/util/PublicKeyFactory;->createKey(Lorg/bouncycastle/asn1/x509/SubjectPublicKeyInfo;)Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;

    move-result-object v0

    return-object v0
.end method
