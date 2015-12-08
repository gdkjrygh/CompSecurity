.class public Lorg/bouncycastle/openssl/MiscPEMGenerator;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/bouncycastle/util/io/pem/PemObjectGenerator;


# instance fields
.field private a:Ljava/lang/Object;

.field private b:Ljava/lang/String;

.field private c:[C

.field private d:Ljava/security/SecureRandom;

.field private e:Ljava/security/Provider;


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/bouncycastle/openssl/MiscPEMGenerator;->a:Ljava/lang/Object;

    return-void
.end method

.method private static a([B)Ljava/lang/String;
    .locals 4

    invoke-static {p0}, Lorg/bouncycastle/util/encoders/Hex;->a([B)[B

    move-result-object v1

    array-length v0, v1

    new-array v2, v0, [C

    const/4 v0, 0x0

    :goto_0
    array-length v3, v1

    if-eq v0, v3, :cond_0

    aget-byte v3, v1, v0

    int-to-char v3, v3

    aput-char v3, v2, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v2}, Ljava/lang/String;-><init>([C)V

    return-object v0
.end method

.method private static a(Ljava/lang/Object;)Lorg/bouncycastle/util/io/pem/PemObject;
    .locals 7

    move-object v0, p0

    :goto_0
    instance-of v1, v0, Lorg/bouncycastle/util/io/pem/PemObject;

    if-eqz v1, :cond_0

    check-cast v0, Lorg/bouncycastle/util/io/pem/PemObject;

    :goto_1
    return-object v0

    :cond_0
    instance-of v1, v0, Lorg/bouncycastle/util/io/pem/PemObjectGenerator;

    if-eqz v1, :cond_1

    check-cast v0, Lorg/bouncycastle/util/io/pem/PemObjectGenerator;

    invoke-interface {v0}, Lorg/bouncycastle/util/io/pem/PemObjectGenerator;->a()Lorg/bouncycastle/util/io/pem/PemObject;

    move-result-object v0

    goto :goto_1

    :cond_1
    instance-of v1, v0, Ljava/security/cert/X509Certificate;

    if-eqz v1, :cond_2

    const-string v1, "CERTIFICATE"

    :try_start_0
    check-cast v0, Ljava/security/cert/X509Certificate;

    invoke-virtual {v0}, Ljava/security/cert/X509Certificate;->getEncoded()[B
    :try_end_0
    .catch Ljava/security/cert/CertificateEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v6, v1

    move-object v1, v0

    move-object v0, v6

    :goto_2
    new-instance v2, Lorg/bouncycastle/util/io/pem/PemObject;

    invoke-direct {v2, v0, v1}, Lorg/bouncycastle/util/io/pem/PemObject;-><init>(Ljava/lang/String;[B)V

    move-object v0, v2

    goto :goto_1

    :catch_0
    move-exception v0

    new-instance v1, Lorg/bouncycastle/util/io/pem/PemGenerationException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Cannot encode object: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/security/cert/CertificateEncodingException;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Lorg/bouncycastle/util/io/pem/PemGenerationException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    instance-of v1, v0, Ljava/security/cert/X509CRL;

    if-eqz v1, :cond_3

    const-string v1, "X509 CRL"

    :try_start_1
    check-cast v0, Ljava/security/cert/X509CRL;

    invoke-virtual {v0}, Ljava/security/cert/X509CRL;->getEncoded()[B
    :try_end_1
    .catch Ljava/security/cert/CRLException; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v0

    move-object v6, v1

    move-object v1, v0

    move-object v0, v6

    goto :goto_2

    :catch_1
    move-exception v0

    new-instance v1, Lorg/bouncycastle/util/io/pem/PemGenerationException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Cannot encode object: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/security/cert/CRLException;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Lorg/bouncycastle/util/io/pem/PemGenerationException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_3
    instance-of v1, v0, Ljava/security/KeyPair;

    if-eqz v1, :cond_4

    check-cast v0, Ljava/security/KeyPair;

    invoke-virtual {v0}, Ljava/security/KeyPair;->getPrivate()Ljava/security/PrivateKey;

    move-result-object v0

    goto :goto_0

    :cond_4
    instance-of v1, v0, Ljava/security/PrivateKey;

    if-eqz v1, :cond_8

    new-instance v2, Lorg/bouncycastle/asn1/pkcs/PrivateKeyInfo;

    move-object v1, v0

    check-cast v1, Ljava/security/Key;

    invoke-interface {v1}, Ljava/security/Key;->getEncoded()[B

    move-result-object v1

    invoke-static {v1}, Lorg/bouncycastle/asn1/ASN1Object;->a([B)Lorg/bouncycastle/asn1/ASN1Object;

    move-result-object v1

    check-cast v1, Lorg/bouncycastle/asn1/ASN1Sequence;

    invoke-direct {v2, v1}, Lorg/bouncycastle/asn1/pkcs/PrivateKeyInfo;-><init>(Lorg/bouncycastle/asn1/ASN1Sequence;)V

    instance-of v1, v0, Ljava/security/interfaces/RSAPrivateKey;

    if-eqz v1, :cond_5

    const-string v0, "RSA PRIVATE KEY"

    invoke-virtual {v2}, Lorg/bouncycastle/asn1/pkcs/PrivateKeyInfo;->f()Lorg/bouncycastle/asn1/DERObject;

    move-result-object v1

    invoke-virtual {v1}, Lorg/bouncycastle/asn1/DERObject;->a()[B

    move-result-object v1

    goto :goto_2

    :cond_5
    instance-of v1, v0, Ljava/security/interfaces/DSAPrivateKey;

    if-eqz v1, :cond_6

    const-string v1, "DSA PRIVATE KEY"

    invoke-virtual {v2}, Lorg/bouncycastle/asn1/pkcs/PrivateKeyInfo;->e()Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    move-result-object v2

    invoke-virtual {v2}, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;->g()Lorg/bouncycastle/asn1/DEREncodable;

    move-result-object v2

    invoke-static {v2}, Lorg/bouncycastle/asn1/x509/DSAParameter;->a(Ljava/lang/Object;)Lorg/bouncycastle/asn1/x509/DSAParameter;

    move-result-object v2

    new-instance v3, Lorg/bouncycastle/asn1/ASN1EncodableVector;

    invoke-direct {v3}, Lorg/bouncycastle/asn1/ASN1EncodableVector;-><init>()V

    new-instance v4, Lorg/bouncycastle/asn1/DERInteger;

    const/4 v5, 0x0

    invoke-direct {v4, v5}, Lorg/bouncycastle/asn1/DERInteger;-><init>(I)V

    invoke-virtual {v3, v4}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    new-instance v4, Lorg/bouncycastle/asn1/DERInteger;

    invoke-virtual {v2}, Lorg/bouncycastle/asn1/x509/DSAParameter;->e()Ljava/math/BigInteger;

    move-result-object v5

    invoke-direct {v4, v5}, Lorg/bouncycastle/asn1/DERInteger;-><init>(Ljava/math/BigInteger;)V

    invoke-virtual {v3, v4}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    new-instance v4, Lorg/bouncycastle/asn1/DERInteger;

    invoke-virtual {v2}, Lorg/bouncycastle/asn1/x509/DSAParameter;->f()Ljava/math/BigInteger;

    move-result-object v5

    invoke-direct {v4, v5}, Lorg/bouncycastle/asn1/DERInteger;-><init>(Ljava/math/BigInteger;)V

    invoke-virtual {v3, v4}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    new-instance v4, Lorg/bouncycastle/asn1/DERInteger;

    invoke-virtual {v2}, Lorg/bouncycastle/asn1/x509/DSAParameter;->g()Ljava/math/BigInteger;

    move-result-object v5

    invoke-direct {v4, v5}, Lorg/bouncycastle/asn1/DERInteger;-><init>(Ljava/math/BigInteger;)V

    invoke-virtual {v3, v4}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    check-cast v0, Ljava/security/interfaces/DSAPrivateKey;

    invoke-interface {v0}, Ljava/security/interfaces/DSAPrivateKey;->getX()Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v2}, Lorg/bouncycastle/asn1/x509/DSAParameter;->g()Ljava/math/BigInteger;

    move-result-object v4

    invoke-virtual {v2}, Lorg/bouncycastle/asn1/x509/DSAParameter;->e()Ljava/math/BigInteger;

    move-result-object v2

    invoke-virtual {v4, v0, v2}, Ljava/math/BigInteger;->modPow(Ljava/math/BigInteger;Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v2

    new-instance v4, Lorg/bouncycastle/asn1/DERInteger;

    invoke-direct {v4, v2}, Lorg/bouncycastle/asn1/DERInteger;-><init>(Ljava/math/BigInteger;)V

    invoke-virtual {v3, v4}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    new-instance v2, Lorg/bouncycastle/asn1/DERInteger;

    invoke-direct {v2, v0}, Lorg/bouncycastle/asn1/DERInteger;-><init>(Ljava/math/BigInteger;)V

    invoke-virtual {v3, v2}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    new-instance v0, Lorg/bouncycastle/asn1/DERSequence;

    invoke-direct {v0, v3}, Lorg/bouncycastle/asn1/DERSequence;-><init>(Lorg/bouncycastle/asn1/ASN1EncodableVector;)V

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/DERSequence;->a()[B

    move-result-object v0

    move-object v6, v1

    move-object v1, v0

    move-object v0, v6

    goto/16 :goto_2

    :cond_6
    check-cast v0, Ljava/security/PrivateKey;

    invoke-interface {v0}, Ljava/security/PrivateKey;->getAlgorithm()Ljava/lang/String;

    move-result-object v0

    const-string v1, "ECDSA"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    const-string v0, "EC PRIVATE KEY"

    invoke-virtual {v2}, Lorg/bouncycastle/asn1/pkcs/PrivateKeyInfo;->f()Lorg/bouncycastle/asn1/DERObject;

    move-result-object v1

    invoke-virtual {v1}, Lorg/bouncycastle/asn1/DERObject;->a()[B

    move-result-object v1

    goto/16 :goto_2

    :cond_7
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Cannot identify private key"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_8
    instance-of v1, v0, Ljava/security/PublicKey;

    if-eqz v1, :cond_9

    const-string v1, "PUBLIC KEY"

    check-cast v0, Ljava/security/PublicKey;

    invoke-interface {v0}, Ljava/security/PublicKey;->getEncoded()[B

    move-result-object v0

    move-object v6, v1

    move-object v1, v0

    move-object v0, v6

    goto/16 :goto_2

    :cond_9
    instance-of v1, v0, Lorg/bouncycastle/x509/X509AttributeCertificate;

    if-eqz v1, :cond_a

    const-string v1, "ATTRIBUTE CERTIFICATE"

    check-cast v0, Lorg/bouncycastle/x509/X509V2AttributeCertificate;

    invoke-virtual {v0}, Lorg/bouncycastle/x509/X509V2AttributeCertificate;->e()[B

    move-result-object v0

    move-object v6, v1

    move-object v1, v0

    move-object v0, v6

    goto/16 :goto_2

    :cond_a
    instance-of v1, v0, Lorg/bouncycastle/jce/PKCS10CertificationRequest;

    if-eqz v1, :cond_b

    const-string v1, "CERTIFICATE REQUEST"

    check-cast v0, Lorg/bouncycastle/jce/PKCS10CertificationRequest;

    invoke-virtual {v0}, Lorg/bouncycastle/jce/PKCS10CertificationRequest;->a()[B

    move-result-object v0

    move-object v6, v1

    move-object v1, v0

    move-object v0, v6

    goto/16 :goto_2

    :cond_b
    instance-of v1, v0, Lorg/bouncycastle/asn1/cms/ContentInfo;

    if-eqz v1, :cond_c

    const-string v1, "PKCS7"

    check-cast v0, Lorg/bouncycastle/asn1/cms/ContentInfo;

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/cms/ContentInfo;->a()[B

    move-result-object v0

    move-object v6, v1

    move-object v1, v0

    move-object v0, v6

    goto/16 :goto_2

    :cond_c
    new-instance v0, Lorg/bouncycastle/util/io/pem/PemGenerationException;

    const-string v1, "unknown object passed - can\'t encode."

    invoke-direct {v0, v1}, Lorg/bouncycastle/util/io/pem/PemGenerationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final a()Lorg/bouncycastle/util/io/pem/PemObject;
    .locals 15

    const/4 v2, 0x0

    :try_start_0
    iget-object v1, p0, Lorg/bouncycastle/openssl/MiscPEMGenerator;->b:Ljava/lang/String;

    if-eqz v1, :cond_6

    iget-object v10, p0, Lorg/bouncycastle/openssl/MiscPEMGenerator;->a:Ljava/lang/Object;

    iget-object v12, p0, Lorg/bouncycastle/openssl/MiscPEMGenerator;->b:Ljava/lang/String;

    iget-object v13, p0, Lorg/bouncycastle/openssl/MiscPEMGenerator;->c:[C

    iget-object v14, p0, Lorg/bouncycastle/openssl/MiscPEMGenerator;->d:Ljava/security/SecureRandom;

    :goto_0
    instance-of v1, v10, Ljava/security/KeyPair;

    if-eqz v1, :cond_0

    move-object v0, v10

    check-cast v0, Ljava/security/KeyPair;

    move-object v1, v0

    invoke-virtual {v1}, Ljava/security/KeyPair;->getPrivate()Ljava/security/PrivateKey;

    move-result-object v10

    goto :goto_0

    :cond_0
    instance-of v1, v10, Ljava/security/interfaces/RSAPrivateCrtKey;

    if-eqz v1, :cond_2

    const-string v11, "RSA PRIVATE KEY"

    move-object v0, v10

    check-cast v0, Ljava/security/interfaces/RSAPrivateCrtKey;

    move-object v9, v0

    new-instance v1, Lorg/bouncycastle/asn1/pkcs/RSAPrivateKeyStructure;

    invoke-interface {v9}, Ljava/security/interfaces/RSAPrivateCrtKey;->getModulus()Ljava/math/BigInteger;

    move-result-object v2

    invoke-interface {v9}, Ljava/security/interfaces/RSAPrivateCrtKey;->getPublicExponent()Ljava/math/BigInteger;

    move-result-object v3

    invoke-interface {v9}, Ljava/security/interfaces/RSAPrivateCrtKey;->getPrivateExponent()Ljava/math/BigInteger;

    move-result-object v4

    invoke-interface {v9}, Ljava/security/interfaces/RSAPrivateCrtKey;->getPrimeP()Ljava/math/BigInteger;

    move-result-object v5

    invoke-interface {v9}, Ljava/security/interfaces/RSAPrivateCrtKey;->getPrimeQ()Ljava/math/BigInteger;

    move-result-object v6

    invoke-interface {v9}, Ljava/security/interfaces/RSAPrivateCrtKey;->getPrimeExponentP()Ljava/math/BigInteger;

    move-result-object v7

    invoke-interface {v9}, Ljava/security/interfaces/RSAPrivateCrtKey;->getPrimeExponentQ()Ljava/math/BigInteger;

    move-result-object v8

    invoke-interface {v9}, Ljava/security/interfaces/RSAPrivateCrtKey;->getCrtCoefficient()Ljava/math/BigInteger;

    move-result-object v9

    invoke-direct/range {v1 .. v9}, Lorg/bouncycastle/asn1/pkcs/RSAPrivateKeyStructure;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    invoke-virtual {v1}, Lorg/bouncycastle/asn1/pkcs/RSAPrivateKeyStructure;->a()[B

    move-result-object v1

    move-object v3, v1

    move-object v4, v11

    :goto_1
    if-eqz v4, :cond_1

    if-nez v3, :cond_4

    :cond_1
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Object type not supported: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception v1

    new-instance v2, Lorg/bouncycastle/util/io/pem/PemGenerationException;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "encoding exception: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3, v1}, Lorg/bouncycastle/util/io/pem/PemGenerationException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2

    :cond_2
    :try_start_1
    instance-of v1, v10, Ljava/security/interfaces/DSAPrivateKey;

    if-eqz v1, :cond_3

    const-string v2, "DSA PRIVATE KEY"

    move-object v0, v10

    check-cast v0, Ljava/security/interfaces/DSAPrivateKey;

    move-object v1, v0

    invoke-interface {v1}, Ljava/security/interfaces/DSAPrivateKey;->getParams()Ljava/security/interfaces/DSAParams;

    move-result-object v3

    new-instance v4, Lorg/bouncycastle/asn1/ASN1EncodableVector;

    invoke-direct {v4}, Lorg/bouncycastle/asn1/ASN1EncodableVector;-><init>()V

    new-instance v5, Lorg/bouncycastle/asn1/DERInteger;

    const/4 v6, 0x0

    invoke-direct {v5, v6}, Lorg/bouncycastle/asn1/DERInteger;-><init>(I)V

    invoke-virtual {v4, v5}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    new-instance v5, Lorg/bouncycastle/asn1/DERInteger;

    invoke-interface {v3}, Ljava/security/interfaces/DSAParams;->getP()Ljava/math/BigInteger;

    move-result-object v6

    invoke-direct {v5, v6}, Lorg/bouncycastle/asn1/DERInteger;-><init>(Ljava/math/BigInteger;)V

    invoke-virtual {v4, v5}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    new-instance v5, Lorg/bouncycastle/asn1/DERInteger;

    invoke-interface {v3}, Ljava/security/interfaces/DSAParams;->getQ()Ljava/math/BigInteger;

    move-result-object v6

    invoke-direct {v5, v6}, Lorg/bouncycastle/asn1/DERInteger;-><init>(Ljava/math/BigInteger;)V

    invoke-virtual {v4, v5}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    new-instance v5, Lorg/bouncycastle/asn1/DERInteger;

    invoke-interface {v3}, Ljava/security/interfaces/DSAParams;->getG()Ljava/math/BigInteger;

    move-result-object v6

    invoke-direct {v5, v6}, Lorg/bouncycastle/asn1/DERInteger;-><init>(Ljava/math/BigInteger;)V

    invoke-virtual {v4, v5}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    invoke-interface {v1}, Ljava/security/interfaces/DSAPrivateKey;->getX()Ljava/math/BigInteger;

    move-result-object v1

    invoke-interface {v3}, Ljava/security/interfaces/DSAParams;->getG()Ljava/math/BigInteger;

    move-result-object v5

    invoke-interface {v3}, Ljava/security/interfaces/DSAParams;->getP()Ljava/math/BigInteger;

    move-result-object v3

    invoke-virtual {v5, v1, v3}, Ljava/math/BigInteger;->modPow(Ljava/math/BigInteger;Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v3

    new-instance v5, Lorg/bouncycastle/asn1/DERInteger;

    invoke-direct {v5, v3}, Lorg/bouncycastle/asn1/DERInteger;-><init>(Ljava/math/BigInteger;)V

    invoke-virtual {v4, v5}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    new-instance v3, Lorg/bouncycastle/asn1/DERInteger;

    invoke-direct {v3, v1}, Lorg/bouncycastle/asn1/DERInteger;-><init>(Ljava/math/BigInteger;)V

    invoke-virtual {v4, v3}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    new-instance v1, Lorg/bouncycastle/asn1/DERSequence;

    invoke-direct {v1, v4}, Lorg/bouncycastle/asn1/DERSequence;-><init>(Lorg/bouncycastle/asn1/ASN1EncodableVector;)V

    invoke-virtual {v1}, Lorg/bouncycastle/asn1/DERSequence;->a()[B

    move-result-object v1

    move-object v3, v1

    move-object v4, v2

    goto/16 :goto_1

    :cond_3
    instance-of v1, v10, Ljava/security/PrivateKey;

    if-eqz v1, :cond_8

    const-string v3, "ECDSA"

    move-object v0, v10

    check-cast v0, Ljava/security/PrivateKey;

    move-object v1, v0

    invoke-interface {v1}, Ljava/security/PrivateKey;->getAlgorithm()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_8

    const-string v2, "EC PRIVATE KEY"

    move-object v0, v10

    check-cast v0, Ljava/security/PrivateKey;

    move-object v1, v0

    invoke-interface {v1}, Ljava/security/PrivateKey;->getEncoded()[B

    move-result-object v1

    invoke-static {v1}, Lorg/bouncycastle/asn1/ASN1Object;->a([B)Lorg/bouncycastle/asn1/ASN1Object;

    move-result-object v1

    invoke-static {v1}, Lorg/bouncycastle/asn1/pkcs/PrivateKeyInfo;->a(Ljava/lang/Object;)Lorg/bouncycastle/asn1/pkcs/PrivateKeyInfo;

    move-result-object v1

    invoke-virtual {v1}, Lorg/bouncycastle/asn1/pkcs/PrivateKeyInfo;->f()Lorg/bouncycastle/asn1/DERObject;

    move-result-object v1

    invoke-virtual {v1}, Lorg/bouncycastle/asn1/DERObject;->a()[B

    move-result-object v1

    move-object v3, v1

    move-object v4, v2

    goto/16 :goto_1

    :cond_4
    invoke-static {v12}, Lorg/bouncycastle/util/Strings;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "DESEDE"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_7

    const-string v1, "DES-EDE3-CBC"

    move-object v2, v1

    :goto_2
    const-string v1, "AES-"

    invoke-virtual {v2, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_5

    const/16 v1, 0x10

    :goto_3
    new-array v1, v1, [B

    invoke-virtual {v14, v1}, Ljava/security/SecureRandom;->nextBytes([B)V

    iget-object v5, p0, Lorg/bouncycastle/openssl/MiscPEMGenerator;->e:Ljava/security/Provider;

    invoke-static {v5, v3, v13, v2, v1}, Lorg/bouncycastle/openssl/a;->a(Ljava/security/Provider;[B[CLjava/lang/String;[B)[B

    move-result-object v3

    new-instance v5, Ljava/util/ArrayList;

    const/4 v6, 0x2

    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    new-instance v6, Lorg/bouncycastle/util/io/pem/PemHeader;

    const-string v7, "Proc-Type"

    const-string v8, "4,ENCRYPTED"

    invoke-direct {v6, v7, v8}, Lorg/bouncycastle/util/io/pem/PemHeader;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v5, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v6, Lorg/bouncycastle/util/io/pem/PemHeader;

    const-string v7, "DEK-Info"

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v8, ","

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v1}, Lorg/bouncycastle/openssl/MiscPEMGenerator;->a([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v6, v7, v1}, Lorg/bouncycastle/util/io/pem/PemHeader;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v5, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v1, Lorg/bouncycastle/util/io/pem/PemObject;

    invoke-direct {v1, v4, v5, v3}, Lorg/bouncycastle/util/io/pem/PemObject;-><init>(Ljava/lang/String;Ljava/util/List;[B)V

    :goto_4
    return-object v1

    :cond_5
    const/16 v1, 0x8

    goto :goto_3

    :cond_6
    iget-object v1, p0, Lorg/bouncycastle/openssl/MiscPEMGenerator;->a:Ljava/lang/Object;

    invoke-static {v1}, Lorg/bouncycastle/openssl/MiscPEMGenerator;->a(Ljava/lang/Object;)Lorg/bouncycastle/util/io/pem/PemObject;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    move-result-object v1

    goto :goto_4

    :cond_7
    move-object v2, v1

    goto :goto_2

    :cond_8
    move-object v3, v2

    move-object v4, v2

    goto/16 :goto_1
.end method
