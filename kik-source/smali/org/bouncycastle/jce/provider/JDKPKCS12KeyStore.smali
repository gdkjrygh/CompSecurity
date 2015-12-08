.class public Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;
.super Ljava/security/KeyStoreSpi;

# interfaces
.implements Lorg/bouncycastle/asn1/pkcs/PKCSObjectIdentifiers;
.implements Lorg/bouncycastle/asn1/x509/X509ObjectIdentifiers;
.implements Lorg/bouncycastle/jce/interfaces/BCKeyStore;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore$BCPKCS12KeyStore;,
        Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore$BCPKCS12KeyStore3DES;,
        Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore$a;,
        Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore$DefPKCS12KeyStore;,
        Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore$DefPKCS12KeyStore3DES;,
        Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore$b;
    }
.end annotation


# static fields
.field private static final bz:Ljava/security/Provider;


# instance fields
.field private bA:Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore$b;

.field private bB:Ljava/util/Hashtable;

.field private bC:Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore$b;

.field private bD:Ljava/util/Hashtable;

.field private bE:Ljava/util/Hashtable;

.field private bF:Ljava/security/cert/CertificateFactory;

.field private bG:Lorg/bouncycastle/asn1/DERObjectIdentifier;

.field private bH:Lorg/bouncycastle/asn1/DERObjectIdentifier;

.field protected by:Ljava/security/SecureRandom;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lorg/bouncycastle/jce/provider/BouncyCastleProvider;

    invoke-direct {v0}, Lorg/bouncycastle/jce/provider/BouncyCastleProvider;-><init>()V

    sput-object v0, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->bz:Ljava/security/Provider;

    return-void
.end method

.method public constructor <init>(Ljava/security/Provider;Lorg/bouncycastle/asn1/DERObjectIdentifier;Lorg/bouncycastle/asn1/DERObjectIdentifier;)V
    .locals 4

    const/4 v1, 0x0

    invoke-direct {p0}, Ljava/security/KeyStoreSpi;-><init>()V

    new-instance v0, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore$b;

    invoke-direct {v0, v1}, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore$b;-><init>(B)V

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->bA:Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore$b;

    new-instance v0, Ljava/util/Hashtable;

    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->bB:Ljava/util/Hashtable;

    new-instance v0, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore$b;

    invoke-direct {v0, v1}, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore$b;-><init>(B)V

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->bC:Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore$b;

    new-instance v0, Ljava/util/Hashtable;

    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->bD:Ljava/util/Hashtable;

    new-instance v0, Ljava/util/Hashtable;

    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->bE:Ljava/util/Hashtable;

    new-instance v0, Ljava/security/SecureRandom;

    invoke-direct {v0}, Ljava/security/SecureRandom;-><init>()V

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->by:Ljava/security/SecureRandom;

    iput-object p2, p0, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->bG:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    iput-object p3, p0, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->bH:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    if-eqz p1, :cond_0

    :try_start_0
    const-string v0, "X.509"

    invoke-static {v0, p1}, Ljava/security/cert/CertificateFactory;->getInstance(Ljava/lang/String;Ljava/security/Provider;)Ljava/security/cert/CertificateFactory;

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->bF:Ljava/security/cert/CertificateFactory;

    :goto_0
    return-void

    :cond_0
    const-string v0, "X.509"

    invoke-static {v0}, Ljava/security/cert/CertificateFactory;->getInstance(Ljava/lang/String;)Ljava/security/cert/CertificateFactory;

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->bF:Ljava/security/cert/CertificateFactory;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "can\'t create cert factory - "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method private static a(Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;[B[CZ)Ljava/security/PrivateKey;
    .locals 7

    invoke-virtual {p0}, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;->e()Lorg/bouncycastle/asn1/DERObjectIdentifier;

    move-result-object v1

    invoke-virtual {v1}, Lorg/bouncycastle/asn1/DERObjectIdentifier;->e()Ljava/lang/String;

    move-result-object v3

    new-instance v2, Lorg/bouncycastle/asn1/pkcs/PKCS12PBEParams;

    invoke-virtual {p0}, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;->g()Lorg/bouncycastle/asn1/DEREncodable;

    move-result-object v1

    check-cast v1, Lorg/bouncycastle/asn1/ASN1Sequence;

    invoke-direct {v2, v1}, Lorg/bouncycastle/asn1/pkcs/PKCS12PBEParams;-><init>(Lorg/bouncycastle/asn1/ASN1Sequence;)V

    new-instance v1, Ljavax/crypto/spec/PBEKeySpec;

    invoke-direct {v1, p2}, Ljavax/crypto/spec/PBEKeySpec;-><init>([C)V

    :try_start_0
    sget-object v4, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->bz:Ljava/security/Provider;

    invoke-static {v3, v4}, Ljavax/crypto/SecretKeyFactory;->getInstance(Ljava/lang/String;Ljava/security/Provider;)Ljavax/crypto/SecretKeyFactory;

    move-result-object v4

    new-instance v5, Ljavax/crypto/spec/PBEParameterSpec;

    invoke-virtual {v2}, Lorg/bouncycastle/asn1/pkcs/PKCS12PBEParams;->f()[B

    move-result-object v6

    invoke-virtual {v2}, Lorg/bouncycastle/asn1/pkcs/PKCS12PBEParams;->e()Ljava/math/BigInteger;

    move-result-object v2

    invoke-virtual {v2}, Ljava/math/BigInteger;->intValue()I

    move-result v2

    invoke-direct {v5, v6, v2}, Ljavax/crypto/spec/PBEParameterSpec;-><init>([BI)V

    invoke-virtual {v4, v1}, Ljavax/crypto/SecretKeyFactory;->generateSecret(Ljava/security/spec/KeySpec;)Ljavax/crypto/SecretKey;

    move-result-object v2

    move-object v0, v2

    check-cast v0, Lorg/bouncycastle/jce/provider/JCEPBEKey;

    move-object v1, v0

    iput-boolean p3, v1, Lorg/bouncycastle/jce/provider/JCEPBEKey;->i:Z

    sget-object v1, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->bz:Ljava/security/Provider;

    invoke-static {v3, v1}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;Ljava/security/Provider;)Ljavax/crypto/Cipher;

    move-result-object v1

    const/4 v3, 0x4

    invoke-virtual {v1, v3, v2, v5}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    const-string v2, ""

    const/4 v3, 0x2

    invoke-virtual {v1, p1, v2, v3}, Ljavax/crypto/Cipher;->unwrap([BLjava/lang/String;I)Ljava/security/Key;

    move-result-object v1

    check-cast v1, Ljava/security/PrivateKey;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    :catch_0
    move-exception v1

    new-instance v2, Ljava/io/IOException;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "exception unwrapping private key - "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v2
.end method

.method static synthetic a()Ljava/security/Provider;
    .locals 1

    sget-object v0, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->bz:Ljava/security/Provider;

    return-object v0
.end method

.method static synthetic a(Ljava/security/PublicKey;)Lorg/bouncycastle/asn1/x509/SubjectKeyIdentifier;
    .locals 1

    invoke-static {p0}, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->b(Ljava/security/PublicKey;)Lorg/bouncycastle/asn1/x509/SubjectKeyIdentifier;

    move-result-object v0

    return-object v0
.end method

.method private a(Ljava/io/OutputStream;[CZ)V
    .locals 15

    if-nez p2, :cond_0

    new-instance v1, Ljava/lang/NullPointerException;

    const-string v2, "No password supplied for PKCS#12 KeyStore."

    invoke-direct {v1, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_0
    new-instance v5, Lorg/bouncycastle/asn1/ASN1EncodableVector;

    invoke-direct {v5}, Lorg/bouncycastle/asn1/ASN1EncodableVector;-><init>()V

    iget-object v1, p0, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->bA:Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore$b;

    invoke-virtual {v1}, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore$b;->a()Ljava/util/Enumeration;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v1

    if-eqz v1, :cond_7

    const/16 v1, 0x14

    new-array v3, v1, [B

    iget-object v1, p0, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->by:Ljava/security/SecureRandom;

    invoke-virtual {v1, v3}, Ljava/security/SecureRandom;->nextBytes([B)V

    invoke-interface {v6}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iget-object v2, p0, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->bA:Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore$b;

    invoke-virtual {v2, v1}, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore$b;->b(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/security/PrivateKey;

    new-instance v4, Lorg/bouncycastle/asn1/pkcs/PKCS12PBEParams;

    const/16 v7, 0x400

    invoke-direct {v4, v3, v7}, Lorg/bouncycastle/asn1/pkcs/PKCS12PBEParams;-><init>([BI)V

    iget-object v3, p0, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->bG:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    invoke-virtual {v3}, Lorg/bouncycastle/asn1/DERObjectIdentifier;->e()Ljava/lang/String;

    move-result-object v3

    move-object/from16 v0, p2

    invoke-static {v3, v2, v4, v0}, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->a(Ljava/lang/String;Ljava/security/Key;Lorg/bouncycastle/asn1/pkcs/PKCS12PBEParams;[C)[B

    move-result-object v3

    new-instance v7, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    iget-object v8, p0, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->bG:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    invoke-virtual {v4}, Lorg/bouncycastle/asn1/pkcs/PKCS12PBEParams;->c()Lorg/bouncycastle/asn1/DERObject;

    move-result-object v4

    invoke-direct {v7, v8, v4}, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;-><init>(Lorg/bouncycastle/asn1/DERObjectIdentifier;Lorg/bouncycastle/asn1/DEREncodable;)V

    new-instance v8, Lorg/bouncycastle/asn1/pkcs/EncryptedPrivateKeyInfo;

    invoke-direct {v8, v7, v3}, Lorg/bouncycastle/asn1/pkcs/EncryptedPrivateKeyInfo;-><init>(Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;[B)V

    const/4 v4, 0x0

    new-instance v7, Lorg/bouncycastle/asn1/ASN1EncodableVector;

    invoke-direct {v7}, Lorg/bouncycastle/asn1/ASN1EncodableVector;-><init>()V

    instance-of v3, v2, Lorg/bouncycastle/jce/interfaces/PKCS12BagAttributeCarrier;

    if-eqz v3, :cond_4

    check-cast v2, Lorg/bouncycastle/jce/interfaces/PKCS12BagAttributeCarrier;

    sget-object v3, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->af:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v2, v3}, Lorg/bouncycastle/jce/interfaces/PKCS12BagAttributeCarrier;->a(Lorg/bouncycastle/asn1/DERObjectIdentifier;)Lorg/bouncycastle/asn1/DEREncodable;

    move-result-object v3

    check-cast v3, Lorg/bouncycastle/asn1/DERBMPString;

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Lorg/bouncycastle/asn1/DERBMPString;->n_()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    :cond_1
    sget-object v3, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->af:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    new-instance v9, Lorg/bouncycastle/asn1/DERBMPString;

    invoke-direct {v9, v1}, Lorg/bouncycastle/asn1/DERBMPString;-><init>(Ljava/lang/String;)V

    invoke-interface {v2, v3, v9}, Lorg/bouncycastle/jce/interfaces/PKCS12BagAttributeCarrier;->a(Lorg/bouncycastle/asn1/DERObjectIdentifier;Lorg/bouncycastle/asn1/DEREncodable;)V

    :cond_2
    sget-object v3, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->ag:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v2, v3}, Lorg/bouncycastle/jce/interfaces/PKCS12BagAttributeCarrier;->a(Lorg/bouncycastle/asn1/DERObjectIdentifier;)Lorg/bouncycastle/asn1/DEREncodable;

    move-result-object v3

    if-nez v3, :cond_3

    invoke-virtual {p0, v1}, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->engineGetCertificate(Ljava/lang/String;)Ljava/security/cert/Certificate;

    move-result-object v3

    sget-object v9, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->ag:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v3}, Ljava/security/cert/Certificate;->getPublicKey()Ljava/security/PublicKey;

    move-result-object v3

    invoke-static {v3}, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->b(Ljava/security/PublicKey;)Lorg/bouncycastle/asn1/x509/SubjectKeyIdentifier;

    move-result-object v3

    invoke-interface {v2, v9, v3}, Lorg/bouncycastle/jce/interfaces/PKCS12BagAttributeCarrier;->a(Lorg/bouncycastle/asn1/DERObjectIdentifier;Lorg/bouncycastle/asn1/DEREncodable;)V

    :cond_3
    invoke-interface {v2}, Lorg/bouncycastle/jce/interfaces/PKCS12BagAttributeCarrier;->c()Ljava/util/Enumeration;

    move-result-object v9

    move v3, v4

    :goto_1
    invoke-interface {v9}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-interface {v9}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lorg/bouncycastle/asn1/DERObjectIdentifier;

    new-instance v4, Lorg/bouncycastle/asn1/ASN1EncodableVector;

    invoke-direct {v4}, Lorg/bouncycastle/asn1/ASN1EncodableVector;-><init>()V

    invoke-virtual {v4, v3}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    new-instance v10, Lorg/bouncycastle/asn1/DERSet;

    invoke-interface {v2, v3}, Lorg/bouncycastle/jce/interfaces/PKCS12BagAttributeCarrier;->a(Lorg/bouncycastle/asn1/DERObjectIdentifier;)Lorg/bouncycastle/asn1/DEREncodable;

    move-result-object v3

    invoke-direct {v10, v3}, Lorg/bouncycastle/asn1/DERSet;-><init>(Lorg/bouncycastle/asn1/DEREncodable;)V

    invoke-virtual {v4, v10}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    const/4 v3, 0x1

    new-instance v10, Lorg/bouncycastle/asn1/DERSequence;

    invoke-direct {v10, v4}, Lorg/bouncycastle/asn1/DERSequence;-><init>(Lorg/bouncycastle/asn1/ASN1EncodableVector;)V

    invoke-virtual {v7, v10}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    goto :goto_1

    :cond_4
    move v3, v4

    :cond_5
    if-nez v3, :cond_6

    new-instance v2, Lorg/bouncycastle/asn1/ASN1EncodableVector;

    invoke-direct {v2}, Lorg/bouncycastle/asn1/ASN1EncodableVector;-><init>()V

    invoke-virtual {p0, v1}, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->engineGetCertificate(Ljava/lang/String;)Ljava/security/cert/Certificate;

    move-result-object v3

    sget-object v4, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->ag:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v2, v4}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    new-instance v4, Lorg/bouncycastle/asn1/DERSet;

    invoke-virtual {v3}, Ljava/security/cert/Certificate;->getPublicKey()Ljava/security/PublicKey;

    move-result-object v3

    invoke-static {v3}, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->b(Ljava/security/PublicKey;)Lorg/bouncycastle/asn1/x509/SubjectKeyIdentifier;

    move-result-object v3

    invoke-direct {v4, v3}, Lorg/bouncycastle/asn1/DERSet;-><init>(Lorg/bouncycastle/asn1/DEREncodable;)V

    invoke-virtual {v2, v4}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    new-instance v3, Lorg/bouncycastle/asn1/DERSequence;

    invoke-direct {v3, v2}, Lorg/bouncycastle/asn1/DERSequence;-><init>(Lorg/bouncycastle/asn1/ASN1EncodableVector;)V

    invoke-virtual {v7, v3}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    new-instance v2, Lorg/bouncycastle/asn1/ASN1EncodableVector;

    invoke-direct {v2}, Lorg/bouncycastle/asn1/ASN1EncodableVector;-><init>()V

    sget-object v3, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->af:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v2, v3}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    new-instance v3, Lorg/bouncycastle/asn1/DERSet;

    new-instance v4, Lorg/bouncycastle/asn1/DERBMPString;

    invoke-direct {v4, v1}, Lorg/bouncycastle/asn1/DERBMPString;-><init>(Ljava/lang/String;)V

    invoke-direct {v3, v4}, Lorg/bouncycastle/asn1/DERSet;-><init>(Lorg/bouncycastle/asn1/DEREncodable;)V

    invoke-virtual {v2, v3}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    new-instance v1, Lorg/bouncycastle/asn1/DERSequence;

    invoke-direct {v1, v2}, Lorg/bouncycastle/asn1/DERSequence;-><init>(Lorg/bouncycastle/asn1/ASN1EncodableVector;)V

    invoke-virtual {v7, v1}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    :cond_6
    new-instance v1, Lorg/bouncycastle/asn1/pkcs/SafeBag;

    sget-object v2, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->bk:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v8}, Lorg/bouncycastle/asn1/pkcs/EncryptedPrivateKeyInfo;->c()Lorg/bouncycastle/asn1/DERObject;

    move-result-object v3

    new-instance v4, Lorg/bouncycastle/asn1/DERSet;

    invoke-direct {v4, v7}, Lorg/bouncycastle/asn1/DERSet;-><init>(Lorg/bouncycastle/asn1/ASN1EncodableVector;)V

    invoke-direct {v1, v2, v3, v4}, Lorg/bouncycastle/asn1/pkcs/SafeBag;-><init>(Lorg/bouncycastle/asn1/DERObjectIdentifier;Lorg/bouncycastle/asn1/DERObject;Lorg/bouncycastle/asn1/ASN1Set;)V

    invoke-virtual {v5, v1}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    goto/16 :goto_0

    :cond_7
    new-instance v1, Lorg/bouncycastle/asn1/DERSequence;

    invoke-direct {v1, v5}, Lorg/bouncycastle/asn1/DERSequence;-><init>(Lorg/bouncycastle/asn1/ASN1EncodableVector;)V

    invoke-virtual {v1}, Lorg/bouncycastle/asn1/DERSequence;->b()[B

    move-result-object v1

    new-instance v6, Lorg/bouncycastle/asn1/BERConstructedOctetString;

    invoke-direct {v6, v1}, Lorg/bouncycastle/asn1/BERConstructedOctetString;-><init>([B)V

    const/16 v1, 0x14

    new-array v1, v1, [B

    iget-object v2, p0, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->by:Ljava/security/SecureRandom;

    invoke-virtual {v2, v1}, Ljava/security/SecureRandom;->nextBytes([B)V

    new-instance v7, Lorg/bouncycastle/asn1/ASN1EncodableVector;

    invoke-direct {v7}, Lorg/bouncycastle/asn1/ASN1EncodableVector;-><init>()V

    new-instance v2, Lorg/bouncycastle/asn1/pkcs/PKCS12PBEParams;

    const/16 v3, 0x400

    invoke-direct {v2, v1, v3}, Lorg/bouncycastle/asn1/pkcs/PKCS12PBEParams;-><init>([BI)V

    new-instance v8, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    iget-object v1, p0, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->bH:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    invoke-virtual {v2}, Lorg/bouncycastle/asn1/pkcs/PKCS12PBEParams;->c()Lorg/bouncycastle/asn1/DERObject;

    move-result-object v2

    invoke-direct {v8, v1, v2}, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;-><init>(Lorg/bouncycastle/asn1/DERObjectIdentifier;Lorg/bouncycastle/asn1/DEREncodable;)V

    new-instance v9, Ljava/util/Hashtable;

    invoke-direct {v9}, Ljava/util/Hashtable;-><init>()V

    iget-object v1, p0, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->bA:Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore$b;

    invoke-virtual {v1}, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore$b;->a()Ljava/util/Enumeration;

    move-result-object v10

    :goto_2
    invoke-interface {v10}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v1

    if-eqz v1, :cond_e

    :try_start_0
    invoke-interface {v10}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v1

    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    move-object v2, v0

    invoke-virtual {p0, v2}, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->engineGetCertificate(Ljava/lang/String;)Ljava/security/cert/Certificate;

    move-result-object v4

    const/4 v5, 0x0

    new-instance v11, Lorg/bouncycastle/asn1/pkcs/CertBag;

    sget-object v1, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->aj:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    new-instance v3, Lorg/bouncycastle/asn1/DEROctetString;

    invoke-virtual {v4}, Ljava/security/cert/Certificate;->getEncoded()[B

    move-result-object v12

    invoke-direct {v3, v12}, Lorg/bouncycastle/asn1/DEROctetString;-><init>([B)V

    invoke-direct {v11, v1, v3}, Lorg/bouncycastle/asn1/pkcs/CertBag;-><init>(Lorg/bouncycastle/asn1/DERObjectIdentifier;Lorg/bouncycastle/asn1/DERObject;)V

    new-instance v12, Lorg/bouncycastle/asn1/ASN1EncodableVector;

    invoke-direct {v12}, Lorg/bouncycastle/asn1/ASN1EncodableVector;-><init>()V

    instance-of v1, v4, Lorg/bouncycastle/jce/interfaces/PKCS12BagAttributeCarrier;

    if-eqz v1, :cond_b

    move-object v0, v4

    check-cast v0, Lorg/bouncycastle/jce/interfaces/PKCS12BagAttributeCarrier;

    move-object v3, v0

    sget-object v1, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->af:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v3, v1}, Lorg/bouncycastle/jce/interfaces/PKCS12BagAttributeCarrier;->a(Lorg/bouncycastle/asn1/DERObjectIdentifier;)Lorg/bouncycastle/asn1/DEREncodable;

    move-result-object v1

    check-cast v1, Lorg/bouncycastle/asn1/DERBMPString;

    if-eqz v1, :cond_8

    invoke-virtual {v1}, Lorg/bouncycastle/asn1/DERBMPString;->n_()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    :cond_8
    sget-object v1, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->af:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    new-instance v13, Lorg/bouncycastle/asn1/DERBMPString;

    invoke-direct {v13, v2}, Lorg/bouncycastle/asn1/DERBMPString;-><init>(Ljava/lang/String;)V

    invoke-interface {v3, v1, v13}, Lorg/bouncycastle/jce/interfaces/PKCS12BagAttributeCarrier;->a(Lorg/bouncycastle/asn1/DERObjectIdentifier;Lorg/bouncycastle/asn1/DEREncodable;)V

    :cond_9
    sget-object v1, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->ag:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v3, v1}, Lorg/bouncycastle/jce/interfaces/PKCS12BagAttributeCarrier;->a(Lorg/bouncycastle/asn1/DERObjectIdentifier;)Lorg/bouncycastle/asn1/DEREncodable;

    move-result-object v1

    if-nez v1, :cond_a

    sget-object v1, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->ag:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v4}, Ljava/security/cert/Certificate;->getPublicKey()Ljava/security/PublicKey;

    move-result-object v13

    invoke-static {v13}, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->b(Ljava/security/PublicKey;)Lorg/bouncycastle/asn1/x509/SubjectKeyIdentifier;

    move-result-object v13

    invoke-interface {v3, v1, v13}, Lorg/bouncycastle/jce/interfaces/PKCS12BagAttributeCarrier;->a(Lorg/bouncycastle/asn1/DERObjectIdentifier;Lorg/bouncycastle/asn1/DEREncodable;)V

    :cond_a
    invoke-interface {v3}, Lorg/bouncycastle/jce/interfaces/PKCS12BagAttributeCarrier;->c()Ljava/util/Enumeration;

    move-result-object v13

    move v1, v5

    :goto_3
    invoke-interface {v13}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v5

    if-eqz v5, :cond_c

    invoke-interface {v13}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/bouncycastle/asn1/DERObjectIdentifier;

    new-instance v5, Lorg/bouncycastle/asn1/ASN1EncodableVector;

    invoke-direct {v5}, Lorg/bouncycastle/asn1/ASN1EncodableVector;-><init>()V

    invoke-virtual {v5, v1}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    new-instance v14, Lorg/bouncycastle/asn1/DERSet;

    invoke-interface {v3, v1}, Lorg/bouncycastle/jce/interfaces/PKCS12BagAttributeCarrier;->a(Lorg/bouncycastle/asn1/DERObjectIdentifier;)Lorg/bouncycastle/asn1/DEREncodable;

    move-result-object v1

    invoke-direct {v14, v1}, Lorg/bouncycastle/asn1/DERSet;-><init>(Lorg/bouncycastle/asn1/DEREncodable;)V

    invoke-virtual {v5, v14}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    new-instance v1, Lorg/bouncycastle/asn1/DERSequence;

    invoke-direct {v1, v5}, Lorg/bouncycastle/asn1/DERSequence;-><init>(Lorg/bouncycastle/asn1/ASN1EncodableVector;)V

    invoke-virtual {v12, v1}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    const/4 v1, 0x1

    goto :goto_3

    :cond_b
    move v1, v5

    :cond_c
    if-nez v1, :cond_d

    new-instance v1, Lorg/bouncycastle/asn1/ASN1EncodableVector;

    invoke-direct {v1}, Lorg/bouncycastle/asn1/ASN1EncodableVector;-><init>()V

    sget-object v3, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->ag:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v1, v3}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    new-instance v3, Lorg/bouncycastle/asn1/DERSet;

    invoke-virtual {v4}, Ljava/security/cert/Certificate;->getPublicKey()Ljava/security/PublicKey;

    move-result-object v5

    invoke-static {v5}, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->b(Ljava/security/PublicKey;)Lorg/bouncycastle/asn1/x509/SubjectKeyIdentifier;

    move-result-object v5

    invoke-direct {v3, v5}, Lorg/bouncycastle/asn1/DERSet;-><init>(Lorg/bouncycastle/asn1/DEREncodable;)V

    invoke-virtual {v1, v3}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    new-instance v3, Lorg/bouncycastle/asn1/DERSequence;

    invoke-direct {v3, v1}, Lorg/bouncycastle/asn1/DERSequence;-><init>(Lorg/bouncycastle/asn1/ASN1EncodableVector;)V

    invoke-virtual {v12, v3}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    new-instance v1, Lorg/bouncycastle/asn1/ASN1EncodableVector;

    invoke-direct {v1}, Lorg/bouncycastle/asn1/ASN1EncodableVector;-><init>()V

    sget-object v3, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->af:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v1, v3}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    new-instance v3, Lorg/bouncycastle/asn1/DERSet;

    new-instance v5, Lorg/bouncycastle/asn1/DERBMPString;

    invoke-direct {v5, v2}, Lorg/bouncycastle/asn1/DERBMPString;-><init>(Ljava/lang/String;)V

    invoke-direct {v3, v5}, Lorg/bouncycastle/asn1/DERSet;-><init>(Lorg/bouncycastle/asn1/DEREncodable;)V

    invoke-virtual {v1, v3}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    new-instance v2, Lorg/bouncycastle/asn1/DERSequence;

    invoke-direct {v2, v1}, Lorg/bouncycastle/asn1/DERSequence;-><init>(Lorg/bouncycastle/asn1/ASN1EncodableVector;)V

    invoke-virtual {v12, v2}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    :cond_d
    new-instance v1, Lorg/bouncycastle/asn1/pkcs/SafeBag;

    sget-object v2, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->bl:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v11}, Lorg/bouncycastle/asn1/pkcs/CertBag;->c()Lorg/bouncycastle/asn1/DERObject;

    move-result-object v3

    new-instance v5, Lorg/bouncycastle/asn1/DERSet;

    invoke-direct {v5, v12}, Lorg/bouncycastle/asn1/DERSet;-><init>(Lorg/bouncycastle/asn1/ASN1EncodableVector;)V

    invoke-direct {v1, v2, v3, v5}, Lorg/bouncycastle/asn1/pkcs/SafeBag;-><init>(Lorg/bouncycastle/asn1/DERObjectIdentifier;Lorg/bouncycastle/asn1/DERObject;Lorg/bouncycastle/asn1/ASN1Set;)V

    invoke-virtual {v7, v1}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    invoke-virtual {v9, v4, v4}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/security/cert/CertificateEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_2

    :catch_0
    move-exception v1

    new-instance v2, Ljava/io/IOException;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Error encoding certificate: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/security/cert/CertificateEncodingException;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_e
    iget-object v1, p0, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->bC:Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore$b;

    invoke-virtual {v1}, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore$b;->a()Ljava/util/Enumeration;

    move-result-object v10

    :cond_f
    :goto_4
    invoke-interface {v10}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v1

    if-eqz v1, :cond_15

    :try_start_1
    invoke-interface {v10}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iget-object v2, p0, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->bC:Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore$b;

    invoke-virtual {v2, v1}, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore$b;->b(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/security/cert/Certificate;

    const/4 v5, 0x0

    iget-object v3, p0, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->bA:Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore$b;

    invoke-virtual {v3, v1}, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore$b;->b(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    if-nez v3, :cond_f

    new-instance v11, Lorg/bouncycastle/asn1/pkcs/CertBag;

    sget-object v3, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->aj:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    new-instance v4, Lorg/bouncycastle/asn1/DEROctetString;

    invoke-virtual {v2}, Ljava/security/cert/Certificate;->getEncoded()[B

    move-result-object v12

    invoke-direct {v4, v12}, Lorg/bouncycastle/asn1/DEROctetString;-><init>([B)V

    invoke-direct {v11, v3, v4}, Lorg/bouncycastle/asn1/pkcs/CertBag;-><init>(Lorg/bouncycastle/asn1/DERObjectIdentifier;Lorg/bouncycastle/asn1/DERObject;)V

    new-instance v12, Lorg/bouncycastle/asn1/ASN1EncodableVector;

    invoke-direct {v12}, Lorg/bouncycastle/asn1/ASN1EncodableVector;-><init>()V

    instance-of v3, v2, Lorg/bouncycastle/jce/interfaces/PKCS12BagAttributeCarrier;

    if-eqz v3, :cond_13

    move-object v0, v2

    check-cast v0, Lorg/bouncycastle/jce/interfaces/PKCS12BagAttributeCarrier;

    move-object v3, v0

    sget-object v4, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->af:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v3, v4}, Lorg/bouncycastle/jce/interfaces/PKCS12BagAttributeCarrier;->a(Lorg/bouncycastle/asn1/DERObjectIdentifier;)Lorg/bouncycastle/asn1/DEREncodable;

    move-result-object v4

    check-cast v4, Lorg/bouncycastle/asn1/DERBMPString;

    if-eqz v4, :cond_10

    invoke-virtual {v4}, Lorg/bouncycastle/asn1/DERBMPString;->n_()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_11

    :cond_10
    sget-object v4, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->af:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    new-instance v13, Lorg/bouncycastle/asn1/DERBMPString;

    invoke-direct {v13, v1}, Lorg/bouncycastle/asn1/DERBMPString;-><init>(Ljava/lang/String;)V

    invoke-interface {v3, v4, v13}, Lorg/bouncycastle/jce/interfaces/PKCS12BagAttributeCarrier;->a(Lorg/bouncycastle/asn1/DERObjectIdentifier;Lorg/bouncycastle/asn1/DEREncodable;)V

    :cond_11
    invoke-interface {v3}, Lorg/bouncycastle/jce/interfaces/PKCS12BagAttributeCarrier;->c()Ljava/util/Enumeration;

    move-result-object v13

    :cond_12
    :goto_5
    invoke-interface {v13}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v4

    if-eqz v4, :cond_13

    invoke-interface {v13}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lorg/bouncycastle/asn1/DERObjectIdentifier;

    sget-object v14, Lorg/bouncycastle/asn1/pkcs/PKCSObjectIdentifiers;->ag:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v4, v14}, Lorg/bouncycastle/asn1/DERObjectIdentifier;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_12

    new-instance v5, Lorg/bouncycastle/asn1/ASN1EncodableVector;

    invoke-direct {v5}, Lorg/bouncycastle/asn1/ASN1EncodableVector;-><init>()V

    invoke-virtual {v5, v4}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    new-instance v14, Lorg/bouncycastle/asn1/DERSet;

    invoke-interface {v3, v4}, Lorg/bouncycastle/jce/interfaces/PKCS12BagAttributeCarrier;->a(Lorg/bouncycastle/asn1/DERObjectIdentifier;)Lorg/bouncycastle/asn1/DEREncodable;

    move-result-object v4

    invoke-direct {v14, v4}, Lorg/bouncycastle/asn1/DERSet;-><init>(Lorg/bouncycastle/asn1/DEREncodable;)V

    invoke-virtual {v5, v14}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    new-instance v4, Lorg/bouncycastle/asn1/DERSequence;

    invoke-direct {v4, v5}, Lorg/bouncycastle/asn1/DERSequence;-><init>(Lorg/bouncycastle/asn1/ASN1EncodableVector;)V

    invoke-virtual {v12, v4}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    const/4 v5, 0x1

    goto :goto_5

    :cond_13
    move v3, v5

    if-nez v3, :cond_14

    new-instance v3, Lorg/bouncycastle/asn1/ASN1EncodableVector;

    invoke-direct {v3}, Lorg/bouncycastle/asn1/ASN1EncodableVector;-><init>()V

    sget-object v4, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->af:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v3, v4}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    new-instance v4, Lorg/bouncycastle/asn1/DERSet;

    new-instance v5, Lorg/bouncycastle/asn1/DERBMPString;

    invoke-direct {v5, v1}, Lorg/bouncycastle/asn1/DERBMPString;-><init>(Ljava/lang/String;)V

    invoke-direct {v4, v5}, Lorg/bouncycastle/asn1/DERSet;-><init>(Lorg/bouncycastle/asn1/DEREncodable;)V

    invoke-virtual {v3, v4}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    new-instance v1, Lorg/bouncycastle/asn1/DERSequence;

    invoke-direct {v1, v3}, Lorg/bouncycastle/asn1/DERSequence;-><init>(Lorg/bouncycastle/asn1/ASN1EncodableVector;)V

    invoke-virtual {v12, v1}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    :cond_14
    new-instance v1, Lorg/bouncycastle/asn1/pkcs/SafeBag;

    sget-object v3, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->bl:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v11}, Lorg/bouncycastle/asn1/pkcs/CertBag;->c()Lorg/bouncycastle/asn1/DERObject;

    move-result-object v4

    new-instance v5, Lorg/bouncycastle/asn1/DERSet;

    invoke-direct {v5, v12}, Lorg/bouncycastle/asn1/DERSet;-><init>(Lorg/bouncycastle/asn1/ASN1EncodableVector;)V

    invoke-direct {v1, v3, v4, v5}, Lorg/bouncycastle/asn1/pkcs/SafeBag;-><init>(Lorg/bouncycastle/asn1/DERObjectIdentifier;Lorg/bouncycastle/asn1/DERObject;Lorg/bouncycastle/asn1/ASN1Set;)V

    invoke-virtual {v7, v1}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    invoke-virtual {v9, v2, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/security/cert/CertificateEncodingException; {:try_start_1 .. :try_end_1} :catch_1

    goto/16 :goto_4

    :catch_1
    move-exception v1

    new-instance v2, Ljava/io/IOException;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Error encoding certificate: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/security/cert/CertificateEncodingException;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_15
    iget-object v1, p0, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->bD:Ljava/util/Hashtable;

    invoke-virtual {v1}, Ljava/util/Hashtable;->keys()Ljava/util/Enumeration;

    move-result-object v3

    :cond_16
    :goto_6
    invoke-interface {v3}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v1

    if-eqz v1, :cond_19

    :try_start_2
    invoke-interface {v3}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore$a;

    iget-object v2, p0, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->bD:Ljava/util/Hashtable;

    invoke-virtual {v2, v1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/security/cert/Certificate;

    invoke-virtual {v9, v1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_16

    new-instance v4, Lorg/bouncycastle/asn1/pkcs/CertBag;

    sget-object v2, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->aj:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    new-instance v5, Lorg/bouncycastle/asn1/DEROctetString;

    invoke-virtual {v1}, Ljava/security/cert/Certificate;->getEncoded()[B

    move-result-object v10

    invoke-direct {v5, v10}, Lorg/bouncycastle/asn1/DEROctetString;-><init>([B)V

    invoke-direct {v4, v2, v5}, Lorg/bouncycastle/asn1/pkcs/CertBag;-><init>(Lorg/bouncycastle/asn1/DERObjectIdentifier;Lorg/bouncycastle/asn1/DERObject;)V

    new-instance v5, Lorg/bouncycastle/asn1/ASN1EncodableVector;

    invoke-direct {v5}, Lorg/bouncycastle/asn1/ASN1EncodableVector;-><init>()V

    instance-of v2, v1, Lorg/bouncycastle/jce/interfaces/PKCS12BagAttributeCarrier;

    if-eqz v2, :cond_18

    move-object v0, v1

    check-cast v0, Lorg/bouncycastle/jce/interfaces/PKCS12BagAttributeCarrier;

    move-object v2, v0

    invoke-interface {v2}, Lorg/bouncycastle/jce/interfaces/PKCS12BagAttributeCarrier;->c()Ljava/util/Enumeration;

    move-result-object v10

    :cond_17
    :goto_7
    invoke-interface {v10}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v1

    if-eqz v1, :cond_18

    invoke-interface {v10}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/bouncycastle/asn1/DERObjectIdentifier;

    sget-object v11, Lorg/bouncycastle/asn1/pkcs/PKCSObjectIdentifiers;->ag:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v1, v11}, Lorg/bouncycastle/asn1/DERObjectIdentifier;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_17

    new-instance v11, Lorg/bouncycastle/asn1/ASN1EncodableVector;

    invoke-direct {v11}, Lorg/bouncycastle/asn1/ASN1EncodableVector;-><init>()V

    invoke-virtual {v11, v1}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    new-instance v12, Lorg/bouncycastle/asn1/DERSet;

    invoke-interface {v2, v1}, Lorg/bouncycastle/jce/interfaces/PKCS12BagAttributeCarrier;->a(Lorg/bouncycastle/asn1/DERObjectIdentifier;)Lorg/bouncycastle/asn1/DEREncodable;

    move-result-object v1

    invoke-direct {v12, v1}, Lorg/bouncycastle/asn1/DERSet;-><init>(Lorg/bouncycastle/asn1/DEREncodable;)V

    invoke-virtual {v11, v12}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    new-instance v1, Lorg/bouncycastle/asn1/DERSequence;

    invoke-direct {v1, v11}, Lorg/bouncycastle/asn1/DERSequence;-><init>(Lorg/bouncycastle/asn1/ASN1EncodableVector;)V

    invoke-virtual {v5, v1}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V
    :try_end_2
    .catch Ljava/security/cert/CertificateEncodingException; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_7

    :catch_2
    move-exception v1

    new-instance v2, Ljava/io/IOException;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Error encoding certificate: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/security/cert/CertificateEncodingException;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_18
    :try_start_3
    new-instance v1, Lorg/bouncycastle/asn1/pkcs/SafeBag;

    sget-object v2, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->bl:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v4}, Lorg/bouncycastle/asn1/pkcs/CertBag;->c()Lorg/bouncycastle/asn1/DERObject;

    move-result-object v4

    new-instance v10, Lorg/bouncycastle/asn1/DERSet;

    invoke-direct {v10, v5}, Lorg/bouncycastle/asn1/DERSet;-><init>(Lorg/bouncycastle/asn1/ASN1EncodableVector;)V

    invoke-direct {v1, v2, v4, v10}, Lorg/bouncycastle/asn1/pkcs/SafeBag;-><init>(Lorg/bouncycastle/asn1/DERObjectIdentifier;Lorg/bouncycastle/asn1/DERObject;Lorg/bouncycastle/asn1/ASN1Set;)V

    invoke-virtual {v7, v1}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V
    :try_end_3
    .catch Ljava/security/cert/CertificateEncodingException; {:try_start_3 .. :try_end_3} :catch_2

    goto/16 :goto_6

    :cond_19
    new-instance v1, Lorg/bouncycastle/asn1/DERSequence;

    invoke-direct {v1, v7}, Lorg/bouncycastle/asn1/DERSequence;-><init>(Lorg/bouncycastle/asn1/ASN1EncodableVector;)V

    invoke-virtual {v1}, Lorg/bouncycastle/asn1/DERSequence;->b()[B

    move-result-object v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    move-object/from16 v0, p2

    invoke-static {v2, v8, v0, v3, v1}, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->a(ZLorg/bouncycastle/asn1/x509/AlgorithmIdentifier;[CZ[B)[B

    move-result-object v1

    new-instance v2, Lorg/bouncycastle/asn1/pkcs/EncryptedData;

    sget-object v3, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->M:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    new-instance v4, Lorg/bouncycastle/asn1/BERConstructedOctetString;

    invoke-direct {v4, v1}, Lorg/bouncycastle/asn1/BERConstructedOctetString;-><init>([B)V

    invoke-direct {v2, v3, v8, v4}, Lorg/bouncycastle/asn1/pkcs/EncryptedData;-><init>(Lorg/bouncycastle/asn1/DERObjectIdentifier;Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;Lorg/bouncycastle/asn1/DEREncodable;)V

    const/4 v1, 0x2

    new-array v1, v1, [Lorg/bouncycastle/asn1/pkcs/ContentInfo;

    const/4 v3, 0x0

    new-instance v4, Lorg/bouncycastle/asn1/pkcs/ContentInfo;

    sget-object v5, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->M:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-direct {v4, v5, v6}, Lorg/bouncycastle/asn1/pkcs/ContentInfo;-><init>(Lorg/bouncycastle/asn1/DERObjectIdentifier;Lorg/bouncycastle/asn1/DEREncodable;)V

    aput-object v4, v1, v3

    const/4 v3, 0x1

    new-instance v4, Lorg/bouncycastle/asn1/pkcs/ContentInfo;

    sget-object v5, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->R:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v2}, Lorg/bouncycastle/asn1/pkcs/EncryptedData;->c()Lorg/bouncycastle/asn1/DERObject;

    move-result-object v2

    invoke-direct {v4, v5, v2}, Lorg/bouncycastle/asn1/pkcs/ContentInfo;-><init>(Lorg/bouncycastle/asn1/DERObjectIdentifier;Lorg/bouncycastle/asn1/DEREncodable;)V

    aput-object v4, v1, v3

    new-instance v2, Lorg/bouncycastle/asn1/pkcs/AuthenticatedSafe;

    invoke-direct {v2, v1}, Lorg/bouncycastle/asn1/pkcs/AuthenticatedSafe;-><init>([Lorg/bouncycastle/asn1/pkcs/ContentInfo;)V

    new-instance v3, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v3}, Ljava/io/ByteArrayOutputStream;-><init>()V

    if-eqz p3, :cond_1a

    new-instance v1, Lorg/bouncycastle/asn1/DEROutputStream;

    invoke-direct {v1, v3}, Lorg/bouncycastle/asn1/DEROutputStream;-><init>(Ljava/io/OutputStream;)V

    :goto_8
    invoke-virtual {v1, v2}, Lorg/bouncycastle/asn1/DEROutputStream;->a(Ljava/lang/Object;)V

    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v1

    new-instance v7, Lorg/bouncycastle/asn1/pkcs/ContentInfo;

    sget-object v2, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->M:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    new-instance v3, Lorg/bouncycastle/asn1/BERConstructedOctetString;

    invoke-direct {v3, v1}, Lorg/bouncycastle/asn1/BERConstructedOctetString;-><init>([B)V

    invoke-direct {v7, v2, v3}, Lorg/bouncycastle/asn1/pkcs/ContentInfo;-><init>(Lorg/bouncycastle/asn1/DERObjectIdentifier;Lorg/bouncycastle/asn1/DEREncodable;)V

    const/16 v1, 0x14

    new-array v2, v1, [B

    iget-object v1, p0, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->by:Ljava/security/SecureRandom;

    invoke-virtual {v1, v2}, Ljava/security/SecureRandom;->nextBytes([B)V

    invoke-virtual {v7}, Lorg/bouncycastle/asn1/pkcs/ContentInfo;->f()Lorg/bouncycastle/asn1/DEREncodable;

    move-result-object v1

    check-cast v1, Lorg/bouncycastle/asn1/ASN1OctetString;

    invoke-virtual {v1}, Lorg/bouncycastle/asn1/ASN1OctetString;->f()[B

    move-result-object v6

    :try_start_4
    sget-object v1, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->i:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const/16 v3, 0x400

    const/4 v5, 0x0

    move-object/from16 v4, p2

    invoke-static/range {v1 .. v6}, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->a(Lorg/bouncycastle/asn1/DERObjectIdentifier;[BI[CZ[B)[B

    move-result-object v1

    new-instance v3, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    sget-object v4, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->i:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    new-instance v5, Lorg/bouncycastle/asn1/DERNull;

    invoke-direct {v5}, Lorg/bouncycastle/asn1/DERNull;-><init>()V

    invoke-direct {v3, v4, v5}, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;-><init>(Lorg/bouncycastle/asn1/DERObjectIdentifier;Lorg/bouncycastle/asn1/DEREncodable;)V

    new-instance v4, Lorg/bouncycastle/asn1/x509/DigestInfo;

    invoke-direct {v4, v3, v1}, Lorg/bouncycastle/asn1/x509/DigestInfo;-><init>(Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;[B)V

    new-instance v1, Lorg/bouncycastle/asn1/pkcs/MacData;

    invoke-direct {v1, v4, v2}, Lorg/bouncycastle/asn1/pkcs/MacData;-><init>(Lorg/bouncycastle/asn1/x509/DigestInfo;[B)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_3

    new-instance v2, Lorg/bouncycastle/asn1/pkcs/Pfx;

    invoke-direct {v2, v7, v1}, Lorg/bouncycastle/asn1/pkcs/Pfx;-><init>(Lorg/bouncycastle/asn1/pkcs/ContentInfo;Lorg/bouncycastle/asn1/pkcs/MacData;)V

    if-eqz p3, :cond_1b

    new-instance v1, Lorg/bouncycastle/asn1/DEROutputStream;

    move-object/from16 v0, p1

    invoke-direct {v1, v0}, Lorg/bouncycastle/asn1/DEROutputStream;-><init>(Ljava/io/OutputStream;)V

    :goto_9
    invoke-virtual {v1, v2}, Lorg/bouncycastle/asn1/DEROutputStream;->a(Ljava/lang/Object;)V

    return-void

    :cond_1a
    new-instance v1, Lorg/bouncycastle/asn1/BEROutputStream;

    invoke-direct {v1, v3}, Lorg/bouncycastle/asn1/BEROutputStream;-><init>(Ljava/io/OutputStream;)V

    goto :goto_8

    :catch_3
    move-exception v1

    new-instance v2, Ljava/io/IOException;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "error constructing MAC: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_1b
    new-instance v1, Lorg/bouncycastle/asn1/BEROutputStream;

    move-object/from16 v0, p1

    invoke-direct {v1, v0}, Lorg/bouncycastle/asn1/BEROutputStream;-><init>(Ljava/io/OutputStream;)V

    goto :goto_9
.end method

.method private static a(Ljava/lang/String;Ljava/security/Key;Lorg/bouncycastle/asn1/pkcs/PKCS12PBEParams;[C)[B
    .locals 5

    new-instance v0, Ljavax/crypto/spec/PBEKeySpec;

    invoke-direct {v0, p3}, Ljavax/crypto/spec/PBEKeySpec;-><init>([C)V

    :try_start_0
    sget-object v1, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->bz:Ljava/security/Provider;

    invoke-static {p0, v1}, Ljavax/crypto/SecretKeyFactory;->getInstance(Ljava/lang/String;Ljava/security/Provider;)Ljavax/crypto/SecretKeyFactory;

    move-result-object v1

    new-instance v2, Ljavax/crypto/spec/PBEParameterSpec;

    invoke-virtual {p2}, Lorg/bouncycastle/asn1/pkcs/PKCS12PBEParams;->f()[B

    move-result-object v3

    invoke-virtual {p2}, Lorg/bouncycastle/asn1/pkcs/PKCS12PBEParams;->e()Ljava/math/BigInteger;

    move-result-object v4

    invoke-virtual {v4}, Ljava/math/BigInteger;->intValue()I

    move-result v4

    invoke-direct {v2, v3, v4}, Ljavax/crypto/spec/PBEParameterSpec;-><init>([BI)V

    sget-object v3, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->bz:Ljava/security/Provider;

    invoke-static {p0, v3}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;Ljava/security/Provider;)Ljavax/crypto/Cipher;

    move-result-object v3

    const/4 v4, 0x3

    invoke-virtual {v1, v0}, Ljavax/crypto/SecretKeyFactory;->generateSecret(Ljava/security/spec/KeySpec;)Ljavax/crypto/SecretKey;

    move-result-object v0

    invoke-virtual {v3, v4, v0, v2}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    invoke-virtual {v3, p1}, Ljavax/crypto/Cipher;->wrap(Ljava/security/Key;)[B
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/io/IOException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "exception encrypting data - "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method private static a(Lorg/bouncycastle/asn1/DERObjectIdentifier;[BI[CZ[B)[B
    .locals 4

    invoke-virtual {p0}, Lorg/bouncycastle/asn1/DERObjectIdentifier;->e()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->bz:Ljava/security/Provider;

    invoke-static {v0, v1}, Ljavax/crypto/SecretKeyFactory;->getInstance(Ljava/lang/String;Ljava/security/Provider;)Ljavax/crypto/SecretKeyFactory;

    move-result-object v0

    new-instance v1, Ljavax/crypto/spec/PBEParameterSpec;

    invoke-direct {v1, p1, p2}, Ljavax/crypto/spec/PBEParameterSpec;-><init>([BI)V

    new-instance v2, Ljavax/crypto/spec/PBEKeySpec;

    invoke-direct {v2, p3}, Ljavax/crypto/spec/PBEKeySpec;-><init>([C)V

    invoke-virtual {v0, v2}, Ljavax/crypto/SecretKeyFactory;->generateSecret(Ljava/security/spec/KeySpec;)Ljavax/crypto/SecretKey;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/jce/provider/JCEPBEKey;

    iput-boolean p4, v0, Lorg/bouncycastle/jce/provider/JCEPBEKey;->i:Z

    invoke-virtual {p0}, Lorg/bouncycastle/asn1/DERObjectIdentifier;->e()Ljava/lang/String;

    move-result-object v2

    sget-object v3, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->bz:Ljava/security/Provider;

    invoke-static {v2, v3}, Ljavax/crypto/Mac;->getInstance(Ljava/lang/String;Ljava/security/Provider;)Ljavax/crypto/Mac;

    move-result-object v2

    invoke-virtual {v2, v0, v1}, Ljavax/crypto/Mac;->init(Ljava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    invoke-virtual {v2, p5}, Ljavax/crypto/Mac;->update([B)V

    invoke-virtual {v2}, Ljavax/crypto/Mac;->doFinal()[B

    move-result-object v0

    return-object v0
.end method

.method private static a(ZLorg/bouncycastle/asn1/x509/AlgorithmIdentifier;[CZ[B)[B
    .locals 6

    invoke-virtual {p1}, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;->e()Lorg/bouncycastle/asn1/DERObjectIdentifier;

    move-result-object v0

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/DERObjectIdentifier;->e()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lorg/bouncycastle/asn1/pkcs/PKCS12PBEParams;

    invoke-virtual {p1}, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;->g()Lorg/bouncycastle/asn1/DEREncodable;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/asn1/ASN1Sequence;

    invoke-direct {v2, v0}, Lorg/bouncycastle/asn1/pkcs/PKCS12PBEParams;-><init>(Lorg/bouncycastle/asn1/ASN1Sequence;)V

    new-instance v0, Ljavax/crypto/spec/PBEKeySpec;

    invoke-direct {v0, p2}, Ljavax/crypto/spec/PBEKeySpec;-><init>([C)V

    :try_start_0
    sget-object v3, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->bz:Ljava/security/Provider;

    invoke-static {v1, v3}, Ljavax/crypto/SecretKeyFactory;->getInstance(Ljava/lang/String;Ljava/security/Provider;)Ljavax/crypto/SecretKeyFactory;

    move-result-object v3

    new-instance v4, Ljavax/crypto/spec/PBEParameterSpec;

    invoke-virtual {v2}, Lorg/bouncycastle/asn1/pkcs/PKCS12PBEParams;->f()[B

    move-result-object v5

    invoke-virtual {v2}, Lorg/bouncycastle/asn1/pkcs/PKCS12PBEParams;->e()Ljava/math/BigInteger;

    move-result-object v2

    invoke-virtual {v2}, Ljava/math/BigInteger;->intValue()I

    move-result v2

    invoke-direct {v4, v5, v2}, Ljavax/crypto/spec/PBEParameterSpec;-><init>([BI)V

    invoke-virtual {v3, v0}, Ljavax/crypto/SecretKeyFactory;->generateSecret(Ljava/security/spec/KeySpec;)Ljavax/crypto/SecretKey;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/jce/provider/JCEPBEKey;

    iput-boolean p3, v0, Lorg/bouncycastle/jce/provider/JCEPBEKey;->i:Z

    sget-object v2, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->bz:Ljava/security/Provider;

    invoke-static {v1, v2}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;Ljava/security/Provider;)Ljavax/crypto/Cipher;

    move-result-object v2

    if-eqz p0, :cond_0

    const/4 v1, 0x1

    :goto_0
    invoke-virtual {v2, v1, v0, v4}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    invoke-virtual {v2, p4}, Ljavax/crypto/Cipher;->doFinal([B)[B
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v1, 0x2

    goto :goto_0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/io/IOException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "exception decrypting data - "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method private static b(Ljava/security/PublicKey;)Lorg/bouncycastle/asn1/x509/SubjectKeyIdentifier;
    .locals 2

    :try_start_0
    new-instance v1, Lorg/bouncycastle/asn1/x509/SubjectPublicKeyInfo;

    invoke-interface {p0}, Ljava/security/PublicKey;->getEncoded()[B

    move-result-object v0

    invoke-static {v0}, Lorg/bouncycastle/asn1/ASN1Object;->a([B)Lorg/bouncycastle/asn1/ASN1Object;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/asn1/ASN1Sequence;

    invoke-direct {v1, v0}, Lorg/bouncycastle/asn1/x509/SubjectPublicKeyInfo;-><init>(Lorg/bouncycastle/asn1/ASN1Sequence;)V

    new-instance v0, Lorg/bouncycastle/asn1/x509/SubjectKeyIdentifier;

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/x509/SubjectKeyIdentifier;-><init>(Lorg/bouncycastle/asn1/x509/SubjectPublicKeyInfo;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "error creating key"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public engineAliases()Ljava/util/Enumeration;
    .locals 4

    new-instance v1, Ljava/util/Hashtable;

    invoke-direct {v1}, Ljava/util/Hashtable;-><init>()V

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->bC:Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore$b;

    invoke-virtual {v0}, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore$b;->a()Ljava/util/Enumeration;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v2

    const-string v3, "cert"

    invoke-virtual {v1, v2, v3}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->bA:Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore$b;

    invoke-virtual {v0}, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore$b;->a()Ljava/util/Enumeration;

    move-result-object v2

    :cond_1
    :goto_1
    invoke-interface {v2}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v2}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-nez v3, :cond_1

    const-string v3, "key"

    invoke-virtual {v1, v0, v3}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_2
    invoke-virtual {v1}, Ljava/util/Hashtable;->keys()Ljava/util/Enumeration;

    move-result-object v0

    return-object v0
.end method

.method public engineContainsAlias(Ljava/lang/String;)Z
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->bC:Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore$b;

    invoke-virtual {v0, p1}, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore$b;->b(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->bA:Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore$b;

    invoke-virtual {v0, p1}, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore$b;->b(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public engineDeleteEntry(Ljava/lang/String;)V
    .locals 5

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->bA:Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore$b;

    invoke-virtual {v0, p1}, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore$b;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/security/Key;

    iget-object v1, p0, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->bC:Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore$b;

    invoke-virtual {v1, p1}, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore$b;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/security/cert/Certificate;

    if-eqz v1, :cond_0

    iget-object v2, p0, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->bD:Ljava/util/Hashtable;

    new-instance v3, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore$a;

    invoke-virtual {v1}, Ljava/security/cert/Certificate;->getPublicKey()Ljava/security/PublicKey;

    move-result-object v4

    invoke-direct {v3, p0, v4}, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore$a;-><init>(Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;Ljava/security/PublicKey;)V

    invoke-virtual {v2, v3}, Ljava/util/Hashtable;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    if-eqz v0, :cond_2

    iget-object v2, p0, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->bB:Ljava/util/Hashtable;

    invoke-virtual {v2, p1}, Ljava/util/Hashtable;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-eqz v2, :cond_1

    iget-object v1, p0, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->bE:Ljava/util/Hashtable;

    invoke-virtual {v1, v2}, Ljava/util/Hashtable;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/security/cert/Certificate;

    :cond_1
    if-eqz v1, :cond_2

    iget-object v2, p0, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->bD:Ljava/util/Hashtable;

    new-instance v3, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore$a;

    invoke-virtual {v1}, Ljava/security/cert/Certificate;->getPublicKey()Ljava/security/PublicKey;

    move-result-object v4

    invoke-direct {v3, p0, v4}, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore$a;-><init>(Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;Ljava/security/PublicKey;)V

    invoke-virtual {v2, v3}, Ljava/util/Hashtable;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    if-nez v1, :cond_3

    if-nez v0, :cond_3

    new-instance v0, Ljava/security/KeyStoreException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "no such entry as "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/security/KeyStoreException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    return-void
.end method

.method public engineGetCertificate(Ljava/lang/String;)Ljava/security/cert/Certificate;
    .locals 2

    if-nez p1, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "null alias passed to getCertificate."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->bC:Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore$b;

    invoke-virtual {v0, p1}, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore$b;->b(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/security/cert/Certificate;

    if-nez v0, :cond_1

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->bB:Ljava/util/Hashtable;

    invoke-virtual {v0, p1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_2

    iget-object v1, p0, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->bE:Ljava/util/Hashtable;

    invoke-virtual {v1, v0}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/security/cert/Certificate;

    :cond_1
    :goto_0
    return-object v0

    :cond_2
    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->bE:Ljava/util/Hashtable;

    invoke-virtual {v0, p1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/security/cert/Certificate;

    goto :goto_0
.end method

.method public engineGetCertificateAlias(Ljava/security/cert/Certificate;)Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->bC:Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore$b;

    invoke-virtual {v0}, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore$b;->b()Ljava/util/Enumeration;

    move-result-object v2

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->bC:Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore$b;

    invoke-virtual {v0}, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore$b;->a()Ljava/util/Enumeration;

    move-result-object v3

    :cond_0
    invoke-interface {v2}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/security/cert/Certificate;

    invoke-interface {v3}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/security/cert/Certificate;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    :goto_0
    return-object v1

    :cond_1
    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->bE:Ljava/util/Hashtable;

    invoke-virtual {v0}, Ljava/util/Hashtable;->elements()Ljava/util/Enumeration;

    move-result-object v2

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->bE:Ljava/util/Hashtable;

    invoke-virtual {v0}, Ljava/util/Hashtable;->keys()Ljava/util/Enumeration;

    move-result-object v3

    :cond_2
    invoke-interface {v2}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v2}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/security/cert/Certificate;

    invoke-interface {v3}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/security/cert/Certificate;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_3
    const/4 v1, 0x0

    goto :goto_0
.end method

.method public engineGetCertificateChain(Ljava/lang/String;)[Ljava/security/cert/Certificate;
    .locals 9

    const/4 v3, 0x0

    if-nez p1, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "null alias passed to getCertificateChain."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    invoke-virtual {p0, p1}, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->engineIsKeyEntry(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    :cond_1
    return-object v3

    :cond_2
    invoke-virtual {p0, p1}, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->engineGetCertificate(Ljava/lang/String;)Ljava/security/cert/Certificate;

    move-result-object v1

    if-eqz v1, :cond_1

    new-instance v5, Ljava/util/Vector;

    invoke-direct {v5}, Ljava/util/Vector;-><init>()V

    :goto_0
    if-eqz v1, :cond_5

    move-object v0, v1

    check-cast v0, Ljava/security/cert/X509Certificate;

    sget-object v2, Lorg/bouncycastle/asn1/x509/X509Extensions;->s:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v2}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;->e()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/security/cert/X509Certificate;->getExtensionValue(Ljava/lang/String;)[B

    move-result-object v2

    if-eqz v2, :cond_8

    :try_start_0
    new-instance v4, Lorg/bouncycastle/asn1/ASN1InputStream;

    invoke-direct {v4, v2}, Lorg/bouncycastle/asn1/ASN1InputStream;-><init>([B)V

    invoke-virtual {v4}, Lorg/bouncycastle/asn1/ASN1InputStream;->a()Lorg/bouncycastle/asn1/DERObject;

    move-result-object v2

    check-cast v2, Lorg/bouncycastle/asn1/ASN1OctetString;

    invoke-virtual {v2}, Lorg/bouncycastle/asn1/ASN1OctetString;->f()[B

    move-result-object v2

    new-instance v4, Lorg/bouncycastle/asn1/ASN1InputStream;

    invoke-direct {v4, v2}, Lorg/bouncycastle/asn1/ASN1InputStream;-><init>([B)V

    new-instance v6, Lorg/bouncycastle/asn1/x509/AuthorityKeyIdentifier;

    invoke-virtual {v4}, Lorg/bouncycastle/asn1/ASN1InputStream;->a()Lorg/bouncycastle/asn1/DERObject;

    move-result-object v2

    check-cast v2, Lorg/bouncycastle/asn1/ASN1Sequence;

    invoke-direct {v6, v2}, Lorg/bouncycastle/asn1/x509/AuthorityKeyIdentifier;-><init>(Lorg/bouncycastle/asn1/ASN1Sequence;)V

    invoke-virtual {v6}, Lorg/bouncycastle/asn1/x509/AuthorityKeyIdentifier;->e()[B

    move-result-object v2

    if-eqz v2, :cond_7

    iget-object v2, p0, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->bD:Ljava/util/Hashtable;

    new-instance v4, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore$a;

    invoke-virtual {v6}, Lorg/bouncycastle/asn1/x509/AuthorityKeyIdentifier;->e()[B

    move-result-object v6

    invoke-direct {v4, p0, v6}, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore$a;-><init>(Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;[B)V

    invoke-virtual {v2, v4}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/security/cert/Certificate;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_1
    move-object v4, v2

    :goto_2
    if-nez v4, :cond_6

    invoke-virtual {v0}, Ljava/security/cert/X509Certificate;->getIssuerDN()Ljava/security/Principal;

    move-result-object v6

    invoke-virtual {v0}, Ljava/security/cert/X509Certificate;->getSubjectDN()Ljava/security/Principal;

    move-result-object v2

    invoke-virtual {v6, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6

    iget-object v2, p0, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->bD:Ljava/util/Hashtable;

    invoke-virtual {v2}, Ljava/util/Hashtable;->keys()Ljava/util/Enumeration;

    move-result-object v7

    :cond_3
    :goto_3
    invoke-interface {v7}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v2

    if-eqz v2, :cond_6

    iget-object v2, p0, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->bD:Ljava/util/Hashtable;

    invoke-interface {v7}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v8

    invoke-virtual {v2, v8}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/security/cert/X509Certificate;

    invoke-virtual {v2}, Ljava/security/cert/X509Certificate;->getSubjectDN()Ljava/security/Principal;

    move-result-object v8

    invoke-virtual {v8, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_3

    :try_start_1
    invoke-virtual {v2}, Ljava/security/cert/X509Certificate;->getPublicKey()Ljava/security/PublicKey;

    move-result-object v8

    invoke-virtual {v0, v8}, Ljava/security/cert/X509Certificate;->verify(Ljava/security/PublicKey;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    :goto_4
    invoke-virtual {v5, v1}, Ljava/util/Vector;->addElement(Ljava/lang/Object;)V

    if-eq v2, v1, :cond_4

    move-object v1, v2

    goto/16 :goto_0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/RuntimeException;

    invoke-virtual {v0}, Ljava/io/IOException;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_4
    move-object v1, v3

    goto/16 :goto_0

    :cond_5
    invoke-virtual {v5}, Ljava/util/Vector;->size()I

    move-result v0

    new-array v3, v0, [Ljava/security/cert/Certificate;

    const/4 v0, 0x0

    move v1, v0

    :goto_5
    array-length v0, v3

    if-eq v1, v0, :cond_1

    invoke-virtual {v5, v1}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/security/cert/Certificate;

    aput-object v0, v3, v1

    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_5

    :catch_1
    move-exception v2

    goto :goto_3

    :cond_6
    move-object v2, v4

    goto :goto_4

    :cond_7
    move-object v2, v3

    goto :goto_1

    :cond_8
    move-object v4, v3

    goto :goto_2
.end method

.method public engineGetCreationDate(Ljava/lang/String;)Ljava/util/Date;
    .locals 1

    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    return-object v0
.end method

.method public engineGetKey(Ljava/lang/String;[C)Ljava/security/Key;
    .locals 2

    if-nez p1, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "null alias passed to getKey."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->bA:Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore$b;

    invoke-virtual {v0, p1}, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore$b;->b(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/security/Key;

    return-object v0
.end method

.method public engineIsCertificateEntry(Ljava/lang/String;)Z
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->bC:Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore$b;

    invoke-virtual {v0, p1}, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore$b;->b(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->bA:Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore$b;

    invoke-virtual {v0, p1}, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore$b;->b(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public engineIsKeyEntry(Ljava/lang/String;)Z
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->bA:Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore$b;

    invoke-virtual {v0, p1}, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore$b;->b(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public engineLoad(Ljava/io/InputStream;[C)V
    .locals 17

    if-nez p1, :cond_1

    :cond_0
    return-void

    :cond_1
    if-nez p2, :cond_2

    new-instance v1, Ljava/lang/NullPointerException;

    const-string v2, "No password supplied for PKCS#12 KeyStore."

    invoke-direct {v1, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    new-instance v1, Ljava/io/BufferedInputStream;

    move-object/from16 v0, p1

    invoke-direct {v1, v0}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V

    const/16 v2, 0xa

    invoke-virtual {v1, v2}, Ljava/io/BufferedInputStream;->mark(I)V

    invoke-virtual {v1}, Ljava/io/BufferedInputStream;->read()I

    move-result v2

    const/16 v3, 0x30

    if-eq v2, v3, :cond_3

    new-instance v1, Ljava/io/IOException;

    const-string v2, "stream does not represent a PKCS12 key store"

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_3
    invoke-virtual {v1}, Ljava/io/BufferedInputStream;->reset()V

    new-instance v2, Lorg/bouncycastle/asn1/ASN1InputStream;

    invoke-direct {v2, v1}, Lorg/bouncycastle/asn1/ASN1InputStream;-><init>(Ljava/io/InputStream;)V

    invoke-virtual {v2}, Lorg/bouncycastle/asn1/ASN1InputStream;->a()Lorg/bouncycastle/asn1/DERObject;

    move-result-object v1

    check-cast v1, Lorg/bouncycastle/asn1/ASN1Sequence;

    new-instance v2, Lorg/bouncycastle/asn1/pkcs/Pfx;

    invoke-direct {v2, v1}, Lorg/bouncycastle/asn1/pkcs/Pfx;-><init>(Lorg/bouncycastle/asn1/ASN1Sequence;)V

    invoke-virtual {v2}, Lorg/bouncycastle/asn1/pkcs/Pfx;->e()Lorg/bouncycastle/asn1/pkcs/ContentInfo;

    move-result-object v8

    new-instance v13, Ljava/util/Vector;

    invoke-direct {v13}, Ljava/util/Vector;-><init>()V

    const/4 v10, 0x0

    const/4 v7, 0x0

    invoke-virtual {v2}, Lorg/bouncycastle/asn1/pkcs/Pfx;->f()Lorg/bouncycastle/asn1/pkcs/MacData;

    move-result-object v1

    if-eqz v1, :cond_6

    invoke-virtual {v2}, Lorg/bouncycastle/asn1/pkcs/Pfx;->f()Lorg/bouncycastle/asn1/pkcs/MacData;

    move-result-object v1

    invoke-virtual {v1}, Lorg/bouncycastle/asn1/pkcs/MacData;->e()Lorg/bouncycastle/asn1/x509/DigestInfo;

    move-result-object v9

    invoke-virtual {v9}, Lorg/bouncycastle/asn1/x509/DigestInfo;->e()Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    move-result-object v11

    invoke-virtual {v1}, Lorg/bouncycastle/asn1/pkcs/MacData;->f()[B

    move-result-object v2

    invoke-virtual {v1}, Lorg/bouncycastle/asn1/pkcs/MacData;->g()Ljava/math/BigInteger;

    move-result-object v1

    invoke-virtual {v1}, Ljava/math/BigInteger;->intValue()I

    move-result v3

    invoke-virtual {v8}, Lorg/bouncycastle/asn1/pkcs/ContentInfo;->f()Lorg/bouncycastle/asn1/DEREncodable;

    move-result-object v1

    check-cast v1, Lorg/bouncycastle/asn1/ASN1OctetString;

    invoke-virtual {v1}, Lorg/bouncycastle/asn1/ASN1OctetString;->f()[B

    move-result-object v6

    :try_start_0
    invoke-virtual {v11}, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;->e()Lorg/bouncycastle/asn1/DERObjectIdentifier;

    move-result-object v1

    const/4 v5, 0x0

    move-object/from16 v4, p2

    invoke-static/range {v1 .. v6}, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->a(Lorg/bouncycastle/asn1/DERObjectIdentifier;[BI[CZ[B)[B

    move-result-object v1

    invoke-virtual {v9}, Lorg/bouncycastle/asn1/x509/DigestInfo;->f()[B

    move-result-object v9

    invoke-static {v1, v9}, Lorg/bouncycastle/util/Arrays;->b([B[B)Z

    move-result v1

    if-nez v1, :cond_31

    move-object/from16 v0, p2

    array-length v1, v0

    if-lez v1, :cond_4

    new-instance v1, Ljava/io/IOException;

    const-string v2, "PKCS12 key store mac invalid - wrong password or corrupted file."

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    :catch_0
    move-exception v1

    throw v1

    :cond_4
    :try_start_1
    invoke-virtual {v11}, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;->e()Lorg/bouncycastle/asn1/DERObjectIdentifier;

    move-result-object v1

    const/4 v5, 0x1

    move-object/from16 v4, p2

    invoke-static/range {v1 .. v6}, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->a(Lorg/bouncycastle/asn1/DERObjectIdentifier;[BI[CZ[B)[B

    move-result-object v1

    invoke-static {v1, v9}, Lorg/bouncycastle/util/Arrays;->b([B[B)Z

    move-result v1

    if-nez v1, :cond_5

    new-instance v1, Ljava/io/IOException;

    const-string v2, "PKCS12 key store mac invalid - wrong password or corrupted file."

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    move-exception v1

    new-instance v2, Ljava/io/IOException;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "error constructing MAC: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_5
    const/4 v1, 0x1

    :goto_0
    move v7, v1

    :cond_6
    new-instance v1, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore$b;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore$b;-><init>(B)V

    move-object/from16 v0, p0

    iput-object v1, v0, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->bA:Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore$b;

    new-instance v1, Ljava/util/Hashtable;

    invoke-direct {v1}, Ljava/util/Hashtable;-><init>()V

    move-object/from16 v0, p0

    iput-object v1, v0, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->bB:Ljava/util/Hashtable;

    invoke-virtual {v8}, Lorg/bouncycastle/asn1/pkcs/ContentInfo;->e()Lorg/bouncycastle/asn1/DERObjectIdentifier;

    move-result-object v1

    sget-object v2, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->M:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v1, v2}, Lorg/bouncycastle/asn1/DERObjectIdentifier;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_20

    new-instance v2, Lorg/bouncycastle/asn1/ASN1InputStream;

    invoke-virtual {v8}, Lorg/bouncycastle/asn1/pkcs/ContentInfo;->f()Lorg/bouncycastle/asn1/DEREncodable;

    move-result-object v1

    check-cast v1, Lorg/bouncycastle/asn1/ASN1OctetString;

    invoke-virtual {v1}, Lorg/bouncycastle/asn1/ASN1OctetString;->f()[B

    move-result-object v1

    invoke-direct {v2, v1}, Lorg/bouncycastle/asn1/ASN1InputStream;-><init>([B)V

    new-instance v3, Lorg/bouncycastle/asn1/pkcs/AuthenticatedSafe;

    invoke-virtual {v2}, Lorg/bouncycastle/asn1/ASN1InputStream;->a()Lorg/bouncycastle/asn1/DERObject;

    move-result-object v1

    check-cast v1, Lorg/bouncycastle/asn1/ASN1Sequence;

    invoke-direct {v3, v1}, Lorg/bouncycastle/asn1/pkcs/AuthenticatedSafe;-><init>(Lorg/bouncycastle/asn1/ASN1Sequence;)V

    invoke-virtual {v3}, Lorg/bouncycastle/asn1/pkcs/AuthenticatedSafe;->e()[Lorg/bouncycastle/asn1/pkcs/ContentInfo;

    move-result-object v14

    const/4 v1, 0x0

    move v12, v1

    :goto_1
    array-length v1, v14

    if-eq v12, v1, :cond_20

    aget-object v1, v14, v12

    invoke-virtual {v1}, Lorg/bouncycastle/asn1/pkcs/ContentInfo;->e()Lorg/bouncycastle/asn1/DERObjectIdentifier;

    move-result-object v1

    sget-object v2, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->M:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v1, v2}, Lorg/bouncycastle/asn1/DERObjectIdentifier;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_10

    new-instance v2, Lorg/bouncycastle/asn1/ASN1InputStream;

    aget-object v1, v14, v12

    invoke-virtual {v1}, Lorg/bouncycastle/asn1/pkcs/ContentInfo;->f()Lorg/bouncycastle/asn1/DEREncodable;

    move-result-object v1

    check-cast v1, Lorg/bouncycastle/asn1/ASN1OctetString;

    invoke-virtual {v1}, Lorg/bouncycastle/asn1/ASN1OctetString;->f()[B

    move-result-object v1

    invoke-direct {v2, v1}, Lorg/bouncycastle/asn1/ASN1InputStream;-><init>([B)V

    invoke-virtual {v2}, Lorg/bouncycastle/asn1/ASN1InputStream;->a()Lorg/bouncycastle/asn1/DERObject;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Lorg/bouncycastle/asn1/ASN1Sequence;

    const/4 v1, 0x0

    move v11, v1

    :goto_2
    invoke-virtual {v5}, Lorg/bouncycastle/asn1/ASN1Sequence;->f()I

    move-result v1

    if-eq v11, v1, :cond_1f

    new-instance v2, Lorg/bouncycastle/asn1/pkcs/SafeBag;

    invoke-virtual {v5, v11}, Lorg/bouncycastle/asn1/ASN1Sequence;->a(I)Lorg/bouncycastle/asn1/DEREncodable;

    move-result-object v1

    check-cast v1, Lorg/bouncycastle/asn1/ASN1Sequence;

    invoke-direct {v2, v1}, Lorg/bouncycastle/asn1/pkcs/SafeBag;-><init>(Lorg/bouncycastle/asn1/ASN1Sequence;)V

    invoke-virtual {v2}, Lorg/bouncycastle/asn1/pkcs/SafeBag;->e()Lorg/bouncycastle/asn1/DERObjectIdentifier;

    move-result-object v1

    sget-object v3, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->bk:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v1, v3}, Lorg/bouncycastle/asn1/DERObjectIdentifier;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_e

    new-instance v3, Lorg/bouncycastle/asn1/pkcs/EncryptedPrivateKeyInfo;

    invoke-virtual {v2}, Lorg/bouncycastle/asn1/pkcs/SafeBag;->f()Lorg/bouncycastle/asn1/DERObject;

    move-result-object v1

    check-cast v1, Lorg/bouncycastle/asn1/ASN1Sequence;

    invoke-direct {v3, v1}, Lorg/bouncycastle/asn1/pkcs/EncryptedPrivateKeyInfo;-><init>(Lorg/bouncycastle/asn1/ASN1Sequence;)V

    invoke-virtual {v3}, Lorg/bouncycastle/asn1/pkcs/EncryptedPrivateKeyInfo;->e()Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    move-result-object v1

    invoke-virtual {v3}, Lorg/bouncycastle/asn1/pkcs/EncryptedPrivateKeyInfo;->f()[B

    move-result-object v3

    move-object/from16 v0, p2

    invoke-static {v1, v3, v0, v7}, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->a(Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;[B[CZ)Ljava/security/PrivateKey;

    move-result-object v4

    move-object v3, v4

    check-cast v3, Lorg/bouncycastle/jce/interfaces/PKCS12BagAttributeCarrier;

    const/4 v1, 0x0

    const/4 v6, 0x0

    invoke-virtual {v2}, Lorg/bouncycastle/asn1/pkcs/SafeBag;->g()Lorg/bouncycastle/asn1/ASN1Set;

    move-result-object v8

    if-eqz v8, :cond_a

    invoke-virtual {v2}, Lorg/bouncycastle/asn1/pkcs/SafeBag;->g()Lorg/bouncycastle/asn1/ASN1Set;

    move-result-object v2

    invoke-virtual {v2}, Lorg/bouncycastle/asn1/ASN1Set;->e()Ljava/util/Enumeration;

    move-result-object v15

    move-object v8, v1

    :goto_3
    invoke-interface {v15}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v1

    if-eqz v1, :cond_b

    invoke-interface {v15}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/bouncycastle/asn1/ASN1Sequence;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lorg/bouncycastle/asn1/ASN1Sequence;->a(I)Lorg/bouncycastle/asn1/DEREncodable;

    move-result-object v2

    check-cast v2, Lorg/bouncycastle/asn1/DERObjectIdentifier;

    const/4 v9, 0x1

    invoke-virtual {v1, v9}, Lorg/bouncycastle/asn1/ASN1Sequence;->a(I)Lorg/bouncycastle/asn1/DEREncodable;

    move-result-object v1

    check-cast v1, Lorg/bouncycastle/asn1/ASN1Set;

    const/4 v9, 0x0

    invoke-virtual {v1}, Lorg/bouncycastle/asn1/ASN1Set;->f()I

    move-result v16

    if-lez v16, :cond_30

    const/4 v9, 0x0

    invoke-virtual {v1, v9}, Lorg/bouncycastle/asn1/ASN1Set;->a(I)Lorg/bouncycastle/asn1/DEREncodable;

    move-result-object v1

    check-cast v1, Lorg/bouncycastle/asn1/DERObject;

    invoke-interface {v3, v2}, Lorg/bouncycastle/jce/interfaces/PKCS12BagAttributeCarrier;->a(Lorg/bouncycastle/asn1/DERObjectIdentifier;)Lorg/bouncycastle/asn1/DEREncodable;

    move-result-object v9

    if-eqz v9, :cond_7

    invoke-interface {v9}, Lorg/bouncycastle/asn1/DEREncodable;->c()Lorg/bouncycastle/asn1/DERObject;

    move-result-object v9

    invoke-virtual {v9, v1}, Lorg/bouncycastle/asn1/DERObject;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_8

    new-instance v1, Ljava/io/IOException;

    const-string v2, "attempt to add existing attribute with different value"

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_7
    invoke-interface {v3, v2, v1}, Lorg/bouncycastle/jce/interfaces/PKCS12BagAttributeCarrier;->a(Lorg/bouncycastle/asn1/DERObjectIdentifier;Lorg/bouncycastle/asn1/DEREncodable;)V

    :cond_8
    :goto_4
    sget-object v9, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->af:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v2, v9}, Lorg/bouncycastle/asn1/DERObjectIdentifier;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_9

    check-cast v1, Lorg/bouncycastle/asn1/DERBMPString;

    invoke-virtual {v1}, Lorg/bouncycastle/asn1/DERBMPString;->n_()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v0, p0

    iget-object v2, v0, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->bA:Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore$b;

    invoke-virtual {v2, v1, v4}, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore$b;->a(Ljava/lang/String;Ljava/lang/Object;)V

    move-object v8, v1

    goto :goto_3

    :cond_9
    sget-object v9, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->ag:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v2, v9}, Lorg/bouncycastle/asn1/DERObjectIdentifier;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2f

    check-cast v1, Lorg/bouncycastle/asn1/ASN1OctetString;

    :goto_5
    move-object v6, v1

    goto :goto_3

    :cond_a
    move-object v8, v1

    :cond_b
    if-eqz v6, :cond_d

    new-instance v1, Ljava/lang/String;

    invoke-virtual {v6}, Lorg/bouncycastle/asn1/ASN1OctetString;->f()[B

    move-result-object v2

    invoke-static {v2}, Lorg/bouncycastle/util/encoders/Hex;->a([B)[B

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/String;-><init>([B)V

    if-nez v8, :cond_c

    move-object/from16 v0, p0

    iget-object v2, v0, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->bA:Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore$b;

    invoke-virtual {v2, v1, v4}, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore$b;->a(Ljava/lang/String;Ljava/lang/Object;)V

    move v1, v10

    :goto_6
    add-int/lit8 v2, v11, 0x1

    move v11, v2

    move v10, v1

    goto/16 :goto_2

    :cond_c
    move-object/from16 v0, p0

    iget-object v2, v0, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->bB:Ljava/util/Hashtable;

    invoke-virtual {v2, v8, v1}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move v1, v10

    goto :goto_6

    :cond_d
    const/4 v1, 0x1

    move-object/from16 v0, p0

    iget-object v2, v0, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->bA:Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore$b;

    const-string v3, "unmarked"

    invoke-virtual {v2, v3, v4}, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore$b;->a(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_6

    :cond_e
    invoke-virtual {v2}, Lorg/bouncycastle/asn1/pkcs/SafeBag;->e()Lorg/bouncycastle/asn1/DERObjectIdentifier;

    move-result-object v1

    sget-object v3, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->bl:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v1, v3}, Lorg/bouncycastle/asn1/DERObjectIdentifier;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_f

    invoke-virtual {v13, v2}, Ljava/util/Vector;->addElement(Ljava/lang/Object;)V

    move v1, v10

    goto :goto_6

    :cond_f
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "extra in data "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Lorg/bouncycastle/asn1/pkcs/SafeBag;->e()Lorg/bouncycastle/asn1/DERObjectIdentifier;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-static {v2}, Lorg/bouncycastle/asn1/util/ASN1Dump;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    move v1, v10

    goto :goto_6

    :cond_10
    aget-object v1, v14, v12

    invoke-virtual {v1}, Lorg/bouncycastle/asn1/pkcs/ContentInfo;->e()Lorg/bouncycastle/asn1/DERObjectIdentifier;

    move-result-object v1

    sget-object v2, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->R:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v1, v2}, Lorg/bouncycastle/asn1/DERObjectIdentifier;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1e

    new-instance v2, Lorg/bouncycastle/asn1/pkcs/EncryptedData;

    aget-object v1, v14, v12

    invoke-virtual {v1}, Lorg/bouncycastle/asn1/pkcs/ContentInfo;->f()Lorg/bouncycastle/asn1/DEREncodable;

    move-result-object v1

    check-cast v1, Lorg/bouncycastle/asn1/ASN1Sequence;

    invoke-direct {v2, v1}, Lorg/bouncycastle/asn1/pkcs/EncryptedData;-><init>(Lorg/bouncycastle/asn1/ASN1Sequence;)V

    const/4 v1, 0x0

    invoke-virtual {v2}, Lorg/bouncycastle/asn1/pkcs/EncryptedData;->e()Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    move-result-object v3

    invoke-virtual {v2}, Lorg/bouncycastle/asn1/pkcs/EncryptedData;->f()Lorg/bouncycastle/asn1/ASN1OctetString;

    move-result-object v2

    invoke-virtual {v2}, Lorg/bouncycastle/asn1/ASN1OctetString;->f()[B

    move-result-object v2

    move-object/from16 v0, p2

    invoke-static {v1, v3, v0, v7, v2}, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->a(ZLorg/bouncycastle/asn1/x509/AlgorithmIdentifier;[CZ[B)[B

    move-result-object v1

    invoke-static {v1}, Lorg/bouncycastle/asn1/ASN1Object;->a([B)Lorg/bouncycastle/asn1/ASN1Object;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Lorg/bouncycastle/asn1/ASN1Sequence;

    const/4 v1, 0x0

    move v11, v1

    :goto_7
    invoke-virtual {v5}, Lorg/bouncycastle/asn1/ASN1Sequence;->f()I

    move-result v1

    if-eq v11, v1, :cond_1f

    new-instance v2, Lorg/bouncycastle/asn1/pkcs/SafeBag;

    invoke-virtual {v5, v11}, Lorg/bouncycastle/asn1/ASN1Sequence;->a(I)Lorg/bouncycastle/asn1/DEREncodable;

    move-result-object v1

    check-cast v1, Lorg/bouncycastle/asn1/ASN1Sequence;

    invoke-direct {v2, v1}, Lorg/bouncycastle/asn1/pkcs/SafeBag;-><init>(Lorg/bouncycastle/asn1/ASN1Sequence;)V

    invoke-virtual {v2}, Lorg/bouncycastle/asn1/pkcs/SafeBag;->e()Lorg/bouncycastle/asn1/DERObjectIdentifier;

    move-result-object v1

    sget-object v3, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->bl:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v1, v3}, Lorg/bouncycastle/asn1/DERObjectIdentifier;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_11

    invoke-virtual {v13, v2}, Ljava/util/Vector;->addElement(Ljava/lang/Object;)V

    :goto_8
    add-int/lit8 v1, v11, 0x1

    move v11, v1

    goto :goto_7

    :cond_11
    invoke-virtual {v2}, Lorg/bouncycastle/asn1/pkcs/SafeBag;->e()Lorg/bouncycastle/asn1/DERObjectIdentifier;

    move-result-object v1

    sget-object v3, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->bk:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v1, v3}, Lorg/bouncycastle/asn1/DERObjectIdentifier;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_17

    new-instance v3, Lorg/bouncycastle/asn1/pkcs/EncryptedPrivateKeyInfo;

    invoke-virtual {v2}, Lorg/bouncycastle/asn1/pkcs/SafeBag;->f()Lorg/bouncycastle/asn1/DERObject;

    move-result-object v1

    check-cast v1, Lorg/bouncycastle/asn1/ASN1Sequence;

    invoke-direct {v3, v1}, Lorg/bouncycastle/asn1/pkcs/EncryptedPrivateKeyInfo;-><init>(Lorg/bouncycastle/asn1/ASN1Sequence;)V

    invoke-virtual {v3}, Lorg/bouncycastle/asn1/pkcs/EncryptedPrivateKeyInfo;->e()Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    move-result-object v1

    invoke-virtual {v3}, Lorg/bouncycastle/asn1/pkcs/EncryptedPrivateKeyInfo;->f()[B

    move-result-object v3

    move-object/from16 v0, p2

    invoke-static {v1, v3, v0, v7}, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->a(Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;[B[CZ)Ljava/security/PrivateKey;

    move-result-object v4

    move-object v3, v4

    check-cast v3, Lorg/bouncycastle/jce/interfaces/PKCS12BagAttributeCarrier;

    const/4 v1, 0x0

    const/4 v6, 0x0

    invoke-virtual {v2}, Lorg/bouncycastle/asn1/pkcs/SafeBag;->g()Lorg/bouncycastle/asn1/ASN1Set;

    move-result-object v2

    invoke-virtual {v2}, Lorg/bouncycastle/asn1/ASN1Set;->e()Ljava/util/Enumeration;

    move-result-object v15

    move-object v8, v1

    :goto_9
    invoke-interface {v15}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v1

    if-eqz v1, :cond_15

    invoke-interface {v15}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/bouncycastle/asn1/ASN1Sequence;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lorg/bouncycastle/asn1/ASN1Sequence;->a(I)Lorg/bouncycastle/asn1/DEREncodable;

    move-result-object v2

    check-cast v2, Lorg/bouncycastle/asn1/DERObjectIdentifier;

    const/4 v9, 0x1

    invoke-virtual {v1, v9}, Lorg/bouncycastle/asn1/ASN1Sequence;->a(I)Lorg/bouncycastle/asn1/DEREncodable;

    move-result-object v1

    check-cast v1, Lorg/bouncycastle/asn1/ASN1Set;

    const/4 v9, 0x0

    invoke-virtual {v1}, Lorg/bouncycastle/asn1/ASN1Set;->f()I

    move-result v16

    if-lez v16, :cond_2e

    const/4 v9, 0x0

    invoke-virtual {v1, v9}, Lorg/bouncycastle/asn1/ASN1Set;->a(I)Lorg/bouncycastle/asn1/DEREncodable;

    move-result-object v1

    check-cast v1, Lorg/bouncycastle/asn1/DERObject;

    invoke-interface {v3, v2}, Lorg/bouncycastle/jce/interfaces/PKCS12BagAttributeCarrier;->a(Lorg/bouncycastle/asn1/DERObjectIdentifier;)Lorg/bouncycastle/asn1/DEREncodable;

    move-result-object v9

    if-eqz v9, :cond_12

    invoke-interface {v9}, Lorg/bouncycastle/asn1/DEREncodable;->c()Lorg/bouncycastle/asn1/DERObject;

    move-result-object v9

    invoke-virtual {v9, v1}, Lorg/bouncycastle/asn1/DERObject;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_13

    new-instance v1, Ljava/io/IOException;

    const-string v2, "attempt to add existing attribute with different value"

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_12
    invoke-interface {v3, v2, v1}, Lorg/bouncycastle/jce/interfaces/PKCS12BagAttributeCarrier;->a(Lorg/bouncycastle/asn1/DERObjectIdentifier;Lorg/bouncycastle/asn1/DEREncodable;)V

    :cond_13
    :goto_a
    sget-object v9, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->af:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v2, v9}, Lorg/bouncycastle/asn1/DERObjectIdentifier;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_14

    check-cast v1, Lorg/bouncycastle/asn1/DERBMPString;

    invoke-virtual {v1}, Lorg/bouncycastle/asn1/DERBMPString;->n_()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v0, p0

    iget-object v2, v0, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->bA:Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore$b;

    invoke-virtual {v2, v1, v4}, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore$b;->a(Ljava/lang/String;Ljava/lang/Object;)V

    move-object v8, v1

    goto :goto_9

    :cond_14
    sget-object v9, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->ag:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v2, v9}, Lorg/bouncycastle/asn1/DERObjectIdentifier;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2d

    check-cast v1, Lorg/bouncycastle/asn1/ASN1OctetString;

    :goto_b
    move-object v6, v1

    goto :goto_9

    :cond_15
    new-instance v1, Ljava/lang/String;

    invoke-virtual {v6}, Lorg/bouncycastle/asn1/ASN1OctetString;->f()[B

    move-result-object v2

    invoke-static {v2}, Lorg/bouncycastle/util/encoders/Hex;->a([B)[B

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/String;-><init>([B)V

    if-nez v8, :cond_16

    move-object/from16 v0, p0

    iget-object v2, v0, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->bA:Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore$b;

    invoke-virtual {v2, v1, v4}, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore$b;->a(Ljava/lang/String;Ljava/lang/Object;)V

    goto/16 :goto_8

    :cond_16
    move-object/from16 v0, p0

    iget-object v2, v0, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->bB:Ljava/util/Hashtable;

    invoke-virtual {v2, v8, v1}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_8

    :cond_17
    invoke-virtual {v2}, Lorg/bouncycastle/asn1/pkcs/SafeBag;->e()Lorg/bouncycastle/asn1/DERObjectIdentifier;

    move-result-object v1

    sget-object v3, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->bj:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v1, v3}, Lorg/bouncycastle/asn1/DERObjectIdentifier;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1d

    new-instance v3, Lorg/bouncycastle/asn1/pkcs/PrivateKeyInfo;

    invoke-virtual {v2}, Lorg/bouncycastle/asn1/pkcs/SafeBag;->f()Lorg/bouncycastle/asn1/DERObject;

    move-result-object v1

    check-cast v1, Lorg/bouncycastle/asn1/ASN1Sequence;

    invoke-direct {v3, v1}, Lorg/bouncycastle/asn1/pkcs/PrivateKeyInfo;-><init>(Lorg/bouncycastle/asn1/ASN1Sequence;)V

    invoke-static {v3}, Lorg/bouncycastle/jce/provider/JDKKeyFactory;->a(Lorg/bouncycastle/asn1/pkcs/PrivateKeyInfo;)Ljava/security/PrivateKey;

    move-result-object v4

    move-object v3, v4

    check-cast v3, Lorg/bouncycastle/jce/interfaces/PKCS12BagAttributeCarrier;

    const/4 v1, 0x0

    const/4 v6, 0x0

    invoke-virtual {v2}, Lorg/bouncycastle/asn1/pkcs/SafeBag;->g()Lorg/bouncycastle/asn1/ASN1Set;

    move-result-object v2

    invoke-virtual {v2}, Lorg/bouncycastle/asn1/ASN1Set;->e()Ljava/util/Enumeration;

    move-result-object v15

    move-object v8, v1

    :goto_c
    invoke-interface {v15}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v1

    if-eqz v1, :cond_1b

    invoke-interface {v15}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/bouncycastle/asn1/ASN1Sequence;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lorg/bouncycastle/asn1/ASN1Sequence;->a(I)Lorg/bouncycastle/asn1/DEREncodable;

    move-result-object v2

    check-cast v2, Lorg/bouncycastle/asn1/DERObjectIdentifier;

    const/4 v9, 0x1

    invoke-virtual {v1, v9}, Lorg/bouncycastle/asn1/ASN1Sequence;->a(I)Lorg/bouncycastle/asn1/DEREncodable;

    move-result-object v1

    check-cast v1, Lorg/bouncycastle/asn1/ASN1Set;

    const/4 v9, 0x0

    invoke-virtual {v1}, Lorg/bouncycastle/asn1/ASN1Set;->f()I

    move-result v16

    if-lez v16, :cond_2c

    const/4 v9, 0x0

    invoke-virtual {v1, v9}, Lorg/bouncycastle/asn1/ASN1Set;->a(I)Lorg/bouncycastle/asn1/DEREncodable;

    move-result-object v1

    check-cast v1, Lorg/bouncycastle/asn1/DERObject;

    invoke-interface {v3, v2}, Lorg/bouncycastle/jce/interfaces/PKCS12BagAttributeCarrier;->a(Lorg/bouncycastle/asn1/DERObjectIdentifier;)Lorg/bouncycastle/asn1/DEREncodable;

    move-result-object v9

    if-eqz v9, :cond_18

    invoke-interface {v9}, Lorg/bouncycastle/asn1/DEREncodable;->c()Lorg/bouncycastle/asn1/DERObject;

    move-result-object v9

    invoke-virtual {v9, v1}, Lorg/bouncycastle/asn1/DERObject;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_19

    new-instance v1, Ljava/io/IOException;

    const-string v2, "attempt to add existing attribute with different value"

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_18
    invoke-interface {v3, v2, v1}, Lorg/bouncycastle/jce/interfaces/PKCS12BagAttributeCarrier;->a(Lorg/bouncycastle/asn1/DERObjectIdentifier;Lorg/bouncycastle/asn1/DEREncodable;)V

    :cond_19
    :goto_d
    sget-object v9, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->af:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v2, v9}, Lorg/bouncycastle/asn1/DERObjectIdentifier;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1a

    check-cast v1, Lorg/bouncycastle/asn1/DERBMPString;

    invoke-virtual {v1}, Lorg/bouncycastle/asn1/DERBMPString;->n_()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v0, p0

    iget-object v2, v0, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->bA:Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore$b;

    invoke-virtual {v2, v1, v4}, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore$b;->a(Ljava/lang/String;Ljava/lang/Object;)V

    move-object v8, v1

    goto :goto_c

    :cond_1a
    sget-object v9, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->ag:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v2, v9}, Lorg/bouncycastle/asn1/DERObjectIdentifier;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2b

    check-cast v1, Lorg/bouncycastle/asn1/ASN1OctetString;

    :goto_e
    move-object v6, v1

    goto :goto_c

    :cond_1b
    new-instance v1, Ljava/lang/String;

    invoke-virtual {v6}, Lorg/bouncycastle/asn1/ASN1OctetString;->f()[B

    move-result-object v2

    invoke-static {v2}, Lorg/bouncycastle/util/encoders/Hex;->a([B)[B

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/String;-><init>([B)V

    if-nez v8, :cond_1c

    move-object/from16 v0, p0

    iget-object v2, v0, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->bA:Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore$b;

    invoke-virtual {v2, v1, v4}, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore$b;->a(Ljava/lang/String;Ljava/lang/Object;)V

    goto/16 :goto_8

    :cond_1c
    move-object/from16 v0, p0

    iget-object v2, v0, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->bB:Ljava/util/Hashtable;

    invoke-virtual {v2, v8, v1}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_8

    :cond_1d
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "extra in encryptedData "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Lorg/bouncycastle/asn1/pkcs/SafeBag;->e()Lorg/bouncycastle/asn1/DERObjectIdentifier;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-static {v2}, Lorg/bouncycastle/asn1/util/ASN1Dump;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    goto/16 :goto_8

    :cond_1e
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "extra "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    aget-object v3, v14, v12

    invoke-virtual {v3}, Lorg/bouncycastle/asn1/pkcs/ContentInfo;->e()Lorg/bouncycastle/asn1/DERObjectIdentifier;

    move-result-object v3

    invoke-virtual {v3}, Lorg/bouncycastle/asn1/DERObjectIdentifier;->e()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "extra "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    aget-object v3, v14, v12

    invoke-virtual {v3}, Lorg/bouncycastle/asn1/pkcs/ContentInfo;->f()Lorg/bouncycastle/asn1/DEREncodable;

    move-result-object v3

    invoke-static {v3}, Lorg/bouncycastle/asn1/util/ASN1Dump;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    :cond_1f
    add-int/lit8 v1, v12, 0x1

    move v12, v1

    goto/16 :goto_1

    :cond_20
    new-instance v1, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore$b;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore$b;-><init>(B)V

    move-object/from16 v0, p0

    iput-object v1, v0, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->bC:Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore$b;

    new-instance v1, Ljava/util/Hashtable;

    invoke-direct {v1}, Ljava/util/Hashtable;-><init>()V

    move-object/from16 v0, p0

    iput-object v1, v0, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->bD:Ljava/util/Hashtable;

    new-instance v1, Ljava/util/Hashtable;

    invoke-direct {v1}, Ljava/util/Hashtable;-><init>()V

    move-object/from16 v0, p0

    iput-object v1, v0, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->bE:Ljava/util/Hashtable;

    const/4 v1, 0x0

    move v5, v1

    :goto_f
    invoke-virtual {v13}, Ljava/util/Vector;->size()I

    move-result v1

    if-eq v5, v1, :cond_0

    invoke-virtual {v13, v5}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/bouncycastle/asn1/pkcs/SafeBag;

    new-instance v3, Lorg/bouncycastle/asn1/pkcs/CertBag;

    invoke-virtual {v1}, Lorg/bouncycastle/asn1/pkcs/SafeBag;->f()Lorg/bouncycastle/asn1/DERObject;

    move-result-object v2

    check-cast v2, Lorg/bouncycastle/asn1/ASN1Sequence;

    invoke-direct {v3, v2}, Lorg/bouncycastle/asn1/pkcs/CertBag;-><init>(Lorg/bouncycastle/asn1/ASN1Sequence;)V

    invoke-virtual {v3}, Lorg/bouncycastle/asn1/pkcs/CertBag;->e()Lorg/bouncycastle/asn1/DERObjectIdentifier;

    move-result-object v2

    sget-object v4, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->aj:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v2, v4}, Lorg/bouncycastle/asn1/DERObjectIdentifier;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_21

    new-instance v1, Ljava/lang/RuntimeException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v4, "Unsupported certificate type: "

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, Lorg/bouncycastle/asn1/pkcs/CertBag;->e()Lorg/bouncycastle/asn1/DERObjectIdentifier;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_21
    :try_start_2
    new-instance v4, Ljava/io/ByteArrayInputStream;

    invoke-virtual {v3}, Lorg/bouncycastle/asn1/pkcs/CertBag;->f()Lorg/bouncycastle/asn1/DERObject;

    move-result-object v2

    check-cast v2, Lorg/bouncycastle/asn1/ASN1OctetString;

    invoke-virtual {v2}, Lorg/bouncycastle/asn1/ASN1OctetString;->f()[B

    move-result-object v2

    invoke-direct {v4, v2}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    move-object/from16 v0, p0

    iget-object v2, v0, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->bF:Ljava/security/cert/CertificateFactory;

    invoke-virtual {v2, v4}, Ljava/security/cert/CertificateFactory;->generateCertificate(Ljava/io/InputStream;)Ljava/security/cert/Certificate;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    move-result-object v4

    const/4 v6, 0x0

    const/4 v2, 0x0

    invoke-virtual {v1}, Lorg/bouncycastle/asn1/pkcs/SafeBag;->g()Lorg/bouncycastle/asn1/ASN1Set;

    move-result-object v3

    if-eqz v3, :cond_25

    invoke-virtual {v1}, Lorg/bouncycastle/asn1/pkcs/SafeBag;->g()Lorg/bouncycastle/asn1/ASN1Set;

    move-result-object v1

    invoke-virtual {v1}, Lorg/bouncycastle/asn1/ASN1Set;->e()Ljava/util/Enumeration;

    move-result-object v8

    move-object v7, v2

    :goto_10
    invoke-interface {v8}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v1

    if-eqz v1, :cond_26

    invoke-interface {v8}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/bouncycastle/asn1/ASN1Sequence;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lorg/bouncycastle/asn1/ASN1Sequence;->a(I)Lorg/bouncycastle/asn1/DEREncodable;

    move-result-object v2

    check-cast v2, Lorg/bouncycastle/asn1/DERObjectIdentifier;

    const/4 v3, 0x1

    invoke-virtual {v1, v3}, Lorg/bouncycastle/asn1/ASN1Sequence;->a(I)Lorg/bouncycastle/asn1/DEREncodable;

    move-result-object v1

    check-cast v1, Lorg/bouncycastle/asn1/ASN1Set;

    const/4 v3, 0x0

    invoke-virtual {v1, v3}, Lorg/bouncycastle/asn1/ASN1Set;->a(I)Lorg/bouncycastle/asn1/DEREncodable;

    move-result-object v1

    check-cast v1, Lorg/bouncycastle/asn1/DERObject;

    instance-of v3, v4, Lorg/bouncycastle/jce/interfaces/PKCS12BagAttributeCarrier;

    if-eqz v3, :cond_23

    move-object v3, v4

    check-cast v3, Lorg/bouncycastle/jce/interfaces/PKCS12BagAttributeCarrier;

    invoke-interface {v3, v2}, Lorg/bouncycastle/jce/interfaces/PKCS12BagAttributeCarrier;->a(Lorg/bouncycastle/asn1/DERObjectIdentifier;)Lorg/bouncycastle/asn1/DEREncodable;

    move-result-object v9

    if-eqz v9, :cond_22

    invoke-interface {v9}, Lorg/bouncycastle/asn1/DEREncodable;->c()Lorg/bouncycastle/asn1/DERObject;

    move-result-object v3

    invoke-virtual {v3, v1}, Lorg/bouncycastle/asn1/DERObject;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_23

    new-instance v1, Ljava/io/IOException;

    const-string v2, "attempt to add existing attribute with different value"

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    :catch_2
    move-exception v1

    new-instance v2, Ljava/lang/RuntimeException;

    invoke-virtual {v1}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_22
    invoke-interface {v3, v2, v1}, Lorg/bouncycastle/jce/interfaces/PKCS12BagAttributeCarrier;->a(Lorg/bouncycastle/asn1/DERObjectIdentifier;Lorg/bouncycastle/asn1/DEREncodable;)V

    :cond_23
    sget-object v3, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->af:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v2, v3}, Lorg/bouncycastle/asn1/DERObjectIdentifier;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_24

    check-cast v1, Lorg/bouncycastle/asn1/DERBMPString;

    invoke-virtual {v1}, Lorg/bouncycastle/asn1/DERBMPString;->n_()Ljava/lang/String;

    move-result-object v1

    move-object v7, v1

    goto :goto_10

    :cond_24
    sget-object v3, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->ag:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v2, v3}, Lorg/bouncycastle/asn1/DERObjectIdentifier;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2a

    check-cast v1, Lorg/bouncycastle/asn1/ASN1OctetString;

    :goto_11
    move-object v6, v1

    goto :goto_10

    :cond_25
    move-object v7, v2

    :cond_26
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->bD:Ljava/util/Hashtable;

    new-instance v2, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore$a;

    invoke-virtual {v4}, Ljava/security/cert/Certificate;->getPublicKey()Ljava/security/PublicKey;

    move-result-object v3

    move-object/from16 v0, p0

    invoke-direct {v2, v0, v3}, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore$a;-><init>(Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;Ljava/security/PublicKey;)V

    invoke-virtual {v1, v2, v4}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz v10, :cond_28

    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->bE:Ljava/util/Hashtable;

    invoke-virtual {v1}, Ljava/util/Hashtable;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_27

    new-instance v1, Ljava/lang/String;

    invoke-virtual {v4}, Ljava/security/cert/Certificate;->getPublicKey()Ljava/security/PublicKey;

    move-result-object v2

    invoke-static {v2}, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->b(Ljava/security/PublicKey;)Lorg/bouncycastle/asn1/x509/SubjectKeyIdentifier;

    move-result-object v2

    invoke-virtual {v2}, Lorg/bouncycastle/asn1/x509/SubjectKeyIdentifier;->e()[B

    move-result-object v2

    invoke-static {v2}, Lorg/bouncycastle/util/encoders/Hex;->a([B)[B

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/String;-><init>([B)V

    move-object/from16 v0, p0

    iget-object v2, v0, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->bE:Ljava/util/Hashtable;

    invoke-virtual {v2, v1, v4}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v0, p0

    iget-object v2, v0, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->bA:Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore$b;

    move-object/from16 v0, p0

    iget-object v3, v0, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->bA:Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore$b;

    const-string v4, "unmarked"

    invoke-virtual {v3, v4}, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore$b;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v1, v3}, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore$b;->a(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_27
    :goto_12
    add-int/lit8 v1, v5, 0x1

    move v5, v1

    goto/16 :goto_f

    :cond_28
    if-eqz v6, :cond_29

    new-instance v1, Ljava/lang/String;

    invoke-virtual {v6}, Lorg/bouncycastle/asn1/ASN1OctetString;->f()[B

    move-result-object v2

    invoke-static {v2}, Lorg/bouncycastle/util/encoders/Hex;->a([B)[B

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/String;-><init>([B)V

    move-object/from16 v0, p0

    iget-object v2, v0, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->bE:Ljava/util/Hashtable;

    invoke-virtual {v2, v1, v4}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_29
    if-eqz v7, :cond_27

    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->bC:Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore$b;

    invoke-virtual {v1, v7, v4}, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore$b;->a(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_12

    :cond_2a
    move-object v1, v6

    goto :goto_11

    :cond_2b
    move-object v1, v6

    goto/16 :goto_e

    :cond_2c
    move-object v1, v9

    goto/16 :goto_d

    :cond_2d
    move-object v1, v6

    goto/16 :goto_b

    :cond_2e
    move-object v1, v9

    goto/16 :goto_a

    :cond_2f
    move-object v1, v6

    goto/16 :goto_5

    :cond_30
    move-object v1, v9

    goto/16 :goto_4

    :cond_31
    move v1, v7

    goto/16 :goto_0
.end method

.method public engineSetCertificateEntry(Ljava/lang/String;Ljava/security/cert/Certificate;)V
    .locals 3

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->bA:Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore$b;

    invoke-virtual {v0, p1}, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore$b;->b(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/security/KeyStoreException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "There is a key entry with the name "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/security/KeyStoreException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->bC:Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore$b;

    invoke-virtual {v0, p1, p2}, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore$b;->a(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->bD:Ljava/util/Hashtable;

    new-instance v1, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore$a;

    invoke-virtual {p2}, Ljava/security/cert/Certificate;->getPublicKey()Ljava/security/PublicKey;

    move-result-object v2

    invoke-direct {v1, p0, v2}, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore$a;-><init>(Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;Ljava/security/PublicKey;)V

    invoke-virtual {v0, v1, p2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public engineSetKeyEntry(Ljava/lang/String;Ljava/security/Key;[C[Ljava/security/cert/Certificate;)V
    .locals 4

    const/4 v0, 0x0

    instance-of v1, p2, Ljava/security/PrivateKey;

    if-eqz v1, :cond_0

    if-nez p4, :cond_0

    new-instance v0, Ljava/security/KeyStoreException;

    const-string v1, "no certificate chain for private key"

    invoke-direct {v0, v1}, Ljava/security/KeyStoreException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-object v1, p0, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->bA:Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore$b;

    invoke-virtual {v1, p1}, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore$b;->b(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {p0, p1}, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->engineDeleteEntry(Ljava/lang/String;)V

    :cond_1
    iget-object v1, p0, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->bA:Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore$b;

    invoke-virtual {v1, p1, p2}, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore$b;->a(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v1, p0, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->bC:Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore$b;

    aget-object v2, p4, v0

    invoke-virtual {v1, p1, v2}, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore$b;->a(Ljava/lang/String;Ljava/lang/Object;)V

    :goto_0
    array-length v1, p4

    if-eq v0, v1, :cond_2

    iget-object v1, p0, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->bD:Ljava/util/Hashtable;

    new-instance v2, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore$a;

    aget-object v3, p4, v0

    invoke-virtual {v3}, Ljava/security/cert/Certificate;->getPublicKey()Ljava/security/PublicKey;

    move-result-object v3

    invoke-direct {v2, p0, v3}, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore$a;-><init>(Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;Ljava/security/PublicKey;)V

    aget-object v3, p4, v0

    invoke-virtual {v1, v2, v3}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public engineSetKeyEntry(Ljava/lang/String;[B[Ljava/security/cert/Certificate;)V
    .locals 2

    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "operation not supported"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public engineSize()I
    .locals 4

    new-instance v1, Ljava/util/Hashtable;

    invoke-direct {v1}, Ljava/util/Hashtable;-><init>()V

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->bC:Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore$b;

    invoke-virtual {v0}, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore$b;->a()Ljava/util/Enumeration;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v2

    const-string v3, "cert"

    invoke-virtual {v1, v2, v3}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->bA:Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore$b;

    invoke-virtual {v0}, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore$b;->a()Ljava/util/Enumeration;

    move-result-object v2

    :cond_1
    :goto_1
    invoke-interface {v2}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v2}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-nez v3, :cond_1

    const-string v3, "key"

    invoke-virtual {v1, v0, v3}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_2
    invoke-virtual {v1}, Ljava/util/Hashtable;->size()I

    move-result v0

    return v0
.end method

.method public engineStore(Ljava/io/OutputStream;[C)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->a(Ljava/io/OutputStream;[CZ)V

    return-void
.end method

.method public engineStore(Ljava/security/KeyStore$LoadStoreParameter;)V
    .locals 4

    if-nez p1, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "\'param\' arg cannot be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    instance-of v0, p1, Lorg/bouncycastle/jce/provider/JDKPKCS12StoreParameter;

    if-nez v0, :cond_1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "No support for \'param\' of type "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    move-object v0, p1

    check-cast v0, Lorg/bouncycastle/jce/provider/JDKPKCS12StoreParameter;

    invoke-interface {p1}, Ljava/security/KeyStore$LoadStoreParameter;->getProtectionParameter()Ljava/security/KeyStore$ProtectionParameter;

    move-result-object v1

    if-nez v1, :cond_2

    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0}, Lorg/bouncycastle/jce/provider/JDKPKCS12StoreParameter;->a()Ljava/io/OutputStream;

    move-result-object v2

    invoke-virtual {v0}, Lorg/bouncycastle/jce/provider/JDKPKCS12StoreParameter;->b()Z

    move-result v0

    invoke-direct {p0, v2, v1, v0}, Lorg/bouncycastle/jce/provider/JDKPKCS12KeyStore;->a(Ljava/io/OutputStream;[CZ)V

    return-void

    :cond_2
    instance-of v2, v1, Ljava/security/KeyStore$PasswordProtection;

    if-eqz v2, :cond_3

    check-cast v1, Ljava/security/KeyStore$PasswordProtection;

    invoke-virtual {v1}, Ljava/security/KeyStore$PasswordProtection;->getPassword()[C

    move-result-object v1

    goto :goto_0

    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "No support for protection parameter of type "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
