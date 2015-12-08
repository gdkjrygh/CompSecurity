.class public Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;
.super Ljava/security/KeyStoreSpi;
.source "SourceFile"

# interfaces
.implements Lorg/spongycastle/asn1/pkcs/PKCSObjectIdentifiers;
.implements Lorg/spongycastle/asn1/x509/X509ObjectIdentifiers;
.implements Lorg/spongycastle/jce/interfaces/BCKeyStore;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore$b;,
        Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore$DefPKCS12KeyStore3DES;,
        Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore$DefPKCS12KeyStore;,
        Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore$BCPKCS12KeyStore3DES;,
        Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore$BCPKCS12KeyStore;,
        Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore$a;
    }
.end annotation


# static fields
.field private static final bA:Ljava/security/Provider;


# instance fields
.field private bB:Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore$b;

.field private bC:Ljava/util/Hashtable;

.field private bD:Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore$b;

.field private bE:Ljava/util/Hashtable;

.field private bF:Ljava/util/Hashtable;

.field private bG:Ljava/security/cert/CertificateFactory;

.field private bH:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

.field private bI:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

.field protected bz:Ljava/security/SecureRandom;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 87
    new-instance v0, Lorg/spongycastle/jce/provider/BouncyCastleProvider;

    invoke-direct {v0}, Lorg/spongycastle/jce/provider/BouncyCastleProvider;-><init>()V

    sput-object v0, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->bA:Ljava/security/Provider;

    return-void
.end method

.method public constructor <init>(Ljava/security/Provider;Lorg/spongycastle/asn1/ASN1ObjectIdentifier;Lorg/spongycastle/asn1/ASN1ObjectIdentifier;)V
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 162
    invoke-direct {p0}, Ljava/security/KeyStoreSpi;-><init>()V

    .line 89
    new-instance v0, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore$b;

    invoke-direct {v0, v1}, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore$b;-><init>(B)V

    iput-object v0, p0, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->bB:Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore$b;

    .line 90
    new-instance v0, Ljava/util/Hashtable;

    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    iput-object v0, p0, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->bC:Ljava/util/Hashtable;

    .line 91
    new-instance v0, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore$b;

    invoke-direct {v0, v1}, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore$b;-><init>(B)V

    iput-object v0, p0, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->bD:Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore$b;

    .line 92
    new-instance v0, Ljava/util/Hashtable;

    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    iput-object v0, p0, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->bE:Ljava/util/Hashtable;

    .line 93
    new-instance v0, Ljava/util/Hashtable;

    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    iput-object v0, p0, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->bF:Ljava/util/Hashtable;

    .line 111
    new-instance v0, Ljava/security/SecureRandom;

    invoke-direct {v0}, Ljava/security/SecureRandom;-><init>()V

    iput-object v0, p0, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->bz:Ljava/security/SecureRandom;

    .line 163
    iput-object p2, p0, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->bH:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    .line 164
    iput-object p3, p0, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->bI:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    .line 168
    if-eqz p1, :cond_0

    .line 170
    :try_start_0
    const-string v0, "X.509"

    invoke-static {v0, p1}, Ljava/security/cert/CertificateFactory;->getInstance(Ljava/lang/String;Ljava/security/Provider;)Ljava/security/cert/CertificateFactory;

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->bG:Ljava/security/cert/CertificateFactory;

    .line 180
    :goto_0
    return-void

    .line 174
    :cond_0
    const-string v0, "X.509"

    invoke-static {v0}, Ljava/security/cert/CertificateFactory;->getInstance(Ljava/lang/String;)Ljava/security/cert/CertificateFactory;

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->bG:Ljava/security/cert/CertificateFactory;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 177
    :catch_0
    move-exception v0

    .line 179
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

.method private static a(Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;[B[CZ)Ljava/security/PrivateKey;
    .locals 7

    .prologue
    .line 549
    invoke-virtual {p0}, Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;->d()Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    move-result-object v1

    invoke-virtual {v1}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;->c()Ljava/lang/String;

    move-result-object v3

    .line 550
    invoke-virtual {p0}, Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;->e()Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v1

    invoke-static {v1}, Lorg/spongycastle/asn1/pkcs/PKCS12PBEParams;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/pkcs/PKCS12PBEParams;

    move-result-object v1

    .line 552
    new-instance v2, Ljavax/crypto/spec/PBEKeySpec;

    invoke-direct {v2, p2}, Ljavax/crypto/spec/PBEKeySpec;-><init>([C)V

    .line 557
    :try_start_0
    sget-object v4, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->bA:Ljava/security/Provider;

    invoke-static {v3, v4}, Ljavax/crypto/SecretKeyFactory;->getInstance(Ljava/lang/String;Ljava/security/Provider;)Ljavax/crypto/SecretKeyFactory;

    move-result-object v4

    .line 559
    new-instance v5, Ljavax/crypto/spec/PBEParameterSpec;

    invoke-virtual {v1}, Lorg/spongycastle/asn1/pkcs/PKCS12PBEParams;->d()[B

    move-result-object v6

    invoke-virtual {v1}, Lorg/spongycastle/asn1/pkcs/PKCS12PBEParams;->c()Ljava/math/BigInteger;

    move-result-object v1

    invoke-virtual {v1}, Ljava/math/BigInteger;->intValue()I

    move-result v1

    invoke-direct {v5, v6, v1}, Ljavax/crypto/spec/PBEParameterSpec;-><init>([BI)V

    .line 563
    invoke-virtual {v4, v2}, Ljavax/crypto/SecretKeyFactory;->generateSecret(Ljava/security/spec/KeySpec;)Ljavax/crypto/SecretKey;

    move-result-object v2

    .line 565
    move-object v0, v2

    check-cast v0, Lorg/spongycastle/jcajce/provider/symmetric/util/BCPBEKey;

    move-object v1, v0

    invoke-virtual {v1, p3}, Lorg/spongycastle/jcajce/provider/symmetric/util/BCPBEKey;->a(Z)V

    .line 567
    sget-object v1, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->bA:Ljava/security/Provider;

    invoke-static {v3, v1}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;Ljava/security/Provider;)Ljavax/crypto/Cipher;

    move-result-object v1

    .line 569
    const/4 v3, 0x4

    invoke-virtual {v1, v3, v2, v5}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    .line 572
    const-string v2, ""

    const/4 v3, 0x2

    invoke-virtual {v1, p1, v2, v3}, Ljavax/crypto/Cipher;->unwrap([BLjava/lang/String;I)Ljava/security/Key;

    move-result-object v1

    check-cast v1, Ljava/security/PrivateKey;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 579
    return-object v1

    .line 574
    :catch_0
    move-exception v1

    .line 576
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

    .prologue
    .line 80
    sget-object v0, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->bA:Ljava/security/Provider;

    return-object v0
.end method

.method static synthetic a(Ljava/security/PublicKey;)Lorg/spongycastle/asn1/x509/SubjectKeyIdentifier;
    .locals 1

    .prologue
    .line 80
    invoke-static {p0}, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->b(Ljava/security/PublicKey;)Lorg/spongycastle/asn1/x509/SubjectKeyIdentifier;

    move-result-object v0

    return-object v0
.end method

.method private a(Ljava/io/OutputStream;[CZ)V
    .locals 15

    .prologue
    .line 1133
    if-nez p2, :cond_0

    .line 1135
    new-instance v1, Ljava/lang/NullPointerException;

    const-string v2, "No password supplied for PKCS#12 KeyStore."

    invoke-direct {v1, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 1141
    :cond_0
    new-instance v5, Lorg/spongycastle/asn1/ASN1EncodableVector;

    invoke-direct {v5}, Lorg/spongycastle/asn1/ASN1EncodableVector;-><init>()V

    .line 1144
    iget-object v1, p0, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->bB:Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore$b;

    invoke-virtual {v1}, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore$b;->a()Ljava/util/Enumeration;

    move-result-object v6

    .line 1146
    :goto_0
    invoke-interface {v6}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v1

    if-eqz v1, :cond_7

    .line 1148
    const/16 v1, 0x14

    new-array v3, v1, [B

    .line 1150
    iget-object v1, p0, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->bz:Ljava/security/SecureRandom;

    invoke-virtual {v1, v3}, Ljava/security/SecureRandom;->nextBytes([B)V

    .line 1152
    invoke-interface {v6}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 1153
    iget-object v2, p0, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->bB:Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore$b;

    invoke-virtual {v2, v1}, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore$b;->b(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/security/PrivateKey;

    .line 1154
    new-instance v4, Lorg/spongycastle/asn1/pkcs/PKCS12PBEParams;

    const/16 v7, 0x400

    invoke-direct {v4, v3, v7}, Lorg/spongycastle/asn1/pkcs/PKCS12PBEParams;-><init>([BI)V

    .line 1155
    iget-object v3, p0, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->bH:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v3}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;->c()Ljava/lang/String;

    move-result-object v3

    move-object/from16 v0, p2

    invoke-static {v3, v2, v4, v0}, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->a(Ljava/lang/String;Ljava/security/Key;Lorg/spongycastle/asn1/pkcs/PKCS12PBEParams;[C)[B

    move-result-object v3

    .line 1156
    new-instance v7, Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;

    iget-object v8, p0, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->bH:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v4}, Lorg/spongycastle/asn1/pkcs/PKCS12PBEParams;->a()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v4

    invoke-direct {v7, v8, v4}, Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;-><init>(Lorg/spongycastle/asn1/ASN1ObjectIdentifier;Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 1157
    new-instance v8, Lorg/spongycastle/asn1/pkcs/EncryptedPrivateKeyInfo;

    invoke-direct {v8, v7, v3}, Lorg/spongycastle/asn1/pkcs/EncryptedPrivateKeyInfo;-><init>(Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;[B)V

    .line 1158
    const/4 v4, 0x0

    .line 1159
    new-instance v7, Lorg/spongycastle/asn1/ASN1EncodableVector;

    invoke-direct {v7}, Lorg/spongycastle/asn1/ASN1EncodableVector;-><init>()V

    .line 1161
    instance-of v3, v2, Lorg/spongycastle/jce/interfaces/PKCS12BagAttributeCarrier;

    if-eqz v3, :cond_4

    .line 1163
    check-cast v2, Lorg/spongycastle/jce/interfaces/PKCS12BagAttributeCarrier;

    .line 1167
    sget-object v3, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->af:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v2, v3}, Lorg/spongycastle/jce/interfaces/PKCS12BagAttributeCarrier;->a(Lorg/spongycastle/asn1/DERObjectIdentifier;)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v3

    check-cast v3, Lorg/spongycastle/asn1/DERBMPString;

    .line 1168
    if-eqz v3, :cond_1

    invoke-virtual {v3}, Lorg/spongycastle/asn1/DERBMPString;->o_()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    .line 1170
    :cond_1
    sget-object v3, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->af:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    new-instance v9, Lorg/spongycastle/asn1/DERBMPString;

    invoke-direct {v9, v1}, Lorg/spongycastle/asn1/DERBMPString;-><init>(Ljava/lang/String;)V

    invoke-interface {v2, v3, v9}, Lorg/spongycastle/jce/interfaces/PKCS12BagAttributeCarrier;->a(Lorg/spongycastle/asn1/ASN1ObjectIdentifier;Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 1176
    :cond_2
    sget-object v3, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->ag:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v2, v3}, Lorg/spongycastle/jce/interfaces/PKCS12BagAttributeCarrier;->a(Lorg/spongycastle/asn1/DERObjectIdentifier;)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v3

    if-nez v3, :cond_3

    .line 1178
    invoke-virtual {p0, v1}, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->engineGetCertificate(Ljava/lang/String;)Ljava/security/cert/Certificate;

    move-result-object v3

    .line 1180
    sget-object v9, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->ag:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v3}, Ljava/security/cert/Certificate;->getPublicKey()Ljava/security/PublicKey;

    move-result-object v3

    invoke-static {v3}, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->b(Ljava/security/PublicKey;)Lorg/spongycastle/asn1/x509/SubjectKeyIdentifier;

    move-result-object v3

    invoke-interface {v2, v9, v3}, Lorg/spongycastle/jce/interfaces/PKCS12BagAttributeCarrier;->a(Lorg/spongycastle/asn1/ASN1ObjectIdentifier;Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 1183
    :cond_3
    invoke-interface {v2}, Lorg/spongycastle/jce/interfaces/PKCS12BagAttributeCarrier;->a()Ljava/util/Enumeration;

    move-result-object v9

    move v3, v4

    .line 1185
    :goto_1
    invoke-interface {v9}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v4

    if-eqz v4, :cond_5

    .line 1187
    invoke-interface {v9}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    .line 1188
    new-instance v4, Lorg/spongycastle/asn1/ASN1EncodableVector;

    invoke-direct {v4}, Lorg/spongycastle/asn1/ASN1EncodableVector;-><init>()V

    .line 1190
    invoke-virtual {v4, v3}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 1191
    new-instance v10, Lorg/spongycastle/asn1/DERSet;

    invoke-interface {v2, v3}, Lorg/spongycastle/jce/interfaces/PKCS12BagAttributeCarrier;->a(Lorg/spongycastle/asn1/DERObjectIdentifier;)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v3

    invoke-direct {v10, v3}, Lorg/spongycastle/asn1/DERSet;-><init>(Lorg/spongycastle/asn1/ASN1Encodable;)V

    invoke-virtual {v4, v10}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 1193
    const/4 v3, 0x1

    .line 1195
    new-instance v10, Lorg/spongycastle/asn1/DERSequence;

    invoke-direct {v10, v4}, Lorg/spongycastle/asn1/DERSequence;-><init>(Lorg/spongycastle/asn1/ASN1EncodableVector;)V

    invoke-virtual {v7, v10}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    goto :goto_1

    :cond_4
    move v3, v4

    .line 1199
    :cond_5
    if-nez v3, :cond_6

    .line 1204
    new-instance v2, Lorg/spongycastle/asn1/ASN1EncodableVector;

    invoke-direct {v2}, Lorg/spongycastle/asn1/ASN1EncodableVector;-><init>()V

    .line 1205
    invoke-virtual {p0, v1}, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->engineGetCertificate(Ljava/lang/String;)Ljava/security/cert/Certificate;

    move-result-object v3

    .line 1207
    sget-object v4, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->ag:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v2, v4}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 1208
    new-instance v4, Lorg/spongycastle/asn1/DERSet;

    invoke-virtual {v3}, Ljava/security/cert/Certificate;->getPublicKey()Ljava/security/PublicKey;

    move-result-object v3

    invoke-static {v3}, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->b(Ljava/security/PublicKey;)Lorg/spongycastle/asn1/x509/SubjectKeyIdentifier;

    move-result-object v3

    invoke-direct {v4, v3}, Lorg/spongycastle/asn1/DERSet;-><init>(Lorg/spongycastle/asn1/ASN1Encodable;)V

    invoke-virtual {v2, v4}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 1210
    new-instance v3, Lorg/spongycastle/asn1/DERSequence;

    invoke-direct {v3, v2}, Lorg/spongycastle/asn1/DERSequence;-><init>(Lorg/spongycastle/asn1/ASN1EncodableVector;)V

    invoke-virtual {v7, v3}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 1212
    new-instance v2, Lorg/spongycastle/asn1/ASN1EncodableVector;

    invoke-direct {v2}, Lorg/spongycastle/asn1/ASN1EncodableVector;-><init>()V

    .line 1214
    sget-object v3, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->af:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v2, v3}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 1215
    new-instance v3, Lorg/spongycastle/asn1/DERSet;

    new-instance v4, Lorg/spongycastle/asn1/DERBMPString;

    invoke-direct {v4, v1}, Lorg/spongycastle/asn1/DERBMPString;-><init>(Ljava/lang/String;)V

    invoke-direct {v3, v4}, Lorg/spongycastle/asn1/DERSet;-><init>(Lorg/spongycastle/asn1/ASN1Encodable;)V

    invoke-virtual {v2, v3}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 1217
    new-instance v1, Lorg/spongycastle/asn1/DERSequence;

    invoke-direct {v1, v2}, Lorg/spongycastle/asn1/DERSequence;-><init>(Lorg/spongycastle/asn1/ASN1EncodableVector;)V

    invoke-virtual {v7, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 1220
    :cond_6
    new-instance v1, Lorg/spongycastle/asn1/pkcs/SafeBag;

    sget-object v2, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->bk:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v8}, Lorg/spongycastle/asn1/pkcs/EncryptedPrivateKeyInfo;->a()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v3

    new-instance v4, Lorg/spongycastle/asn1/DERSet;

    invoke-direct {v4, v7}, Lorg/spongycastle/asn1/DERSet;-><init>(Lorg/spongycastle/asn1/ASN1EncodableVector;)V

    invoke-direct {v1, v2, v3, v4}, Lorg/spongycastle/asn1/pkcs/SafeBag;-><init>(Lorg/spongycastle/asn1/ASN1ObjectIdentifier;Lorg/spongycastle/asn1/ASN1Encodable;Lorg/spongycastle/asn1/ASN1Set;)V

    .line 1221
    invoke-virtual {v5, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    goto/16 :goto_0

    .line 1224
    :cond_7
    new-instance v1, Lorg/spongycastle/asn1/DERSequence;

    invoke-direct {v1, v5}, Lorg/spongycastle/asn1/DERSequence;-><init>(Lorg/spongycastle/asn1/ASN1EncodableVector;)V

    const-string v2, "DER"

    invoke-virtual {v1, v2}, Lorg/spongycastle/asn1/DERSequence;->a(Ljava/lang/String;)[B

    move-result-object v1

    .line 1225
    new-instance v6, Lorg/spongycastle/asn1/BERConstructedOctetString;

    invoke-direct {v6, v1}, Lorg/spongycastle/asn1/BERConstructedOctetString;-><init>([B)V

    .line 1230
    const/16 v1, 0x14

    new-array v1, v1, [B

    .line 1232
    iget-object v2, p0, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->bz:Ljava/security/SecureRandom;

    invoke-virtual {v2, v1}, Ljava/security/SecureRandom;->nextBytes([B)V

    .line 1234
    new-instance v7, Lorg/spongycastle/asn1/ASN1EncodableVector;

    invoke-direct {v7}, Lorg/spongycastle/asn1/ASN1EncodableVector;-><init>()V

    .line 1235
    new-instance v2, Lorg/spongycastle/asn1/pkcs/PKCS12PBEParams;

    const/16 v3, 0x400

    invoke-direct {v2, v1, v3}, Lorg/spongycastle/asn1/pkcs/PKCS12PBEParams;-><init>([BI)V

    .line 1236
    new-instance v8, Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;

    iget-object v1, p0, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->bI:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v2}, Lorg/spongycastle/asn1/pkcs/PKCS12PBEParams;->a()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v2

    invoke-direct {v8, v1, v2}, Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;-><init>(Lorg/spongycastle/asn1/ASN1ObjectIdentifier;Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 1237
    new-instance v9, Ljava/util/Hashtable;

    invoke-direct {v9}, Ljava/util/Hashtable;-><init>()V

    .line 1239
    iget-object v1, p0, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->bB:Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore$b;

    invoke-virtual {v1}, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore$b;->a()Ljava/util/Enumeration;

    move-result-object v10

    .line 1240
    :goto_2
    invoke-interface {v10}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v1

    if-eqz v1, :cond_e

    .line 1244
    :try_start_0
    invoke-interface {v10}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v1

    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    move-object v2, v0

    .line 1245
    invoke-virtual {p0, v2}, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->engineGetCertificate(Ljava/lang/String;)Ljava/security/cert/Certificate;

    move-result-object v4

    .line 1246
    const/4 v5, 0x0

    .line 1247
    new-instance v11, Lorg/spongycastle/asn1/pkcs/CertBag;

    sget-object v1, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->aj:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    new-instance v3, Lorg/spongycastle/asn1/DEROctetString;

    invoke-virtual {v4}, Ljava/security/cert/Certificate;->getEncoded()[B

    move-result-object v12

    invoke-direct {v3, v12}, Lorg/spongycastle/asn1/DEROctetString;-><init>([B)V

    invoke-direct {v11, v1, v3}, Lorg/spongycastle/asn1/pkcs/CertBag;-><init>(Lorg/spongycastle/asn1/ASN1ObjectIdentifier;Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 1250
    new-instance v12, Lorg/spongycastle/asn1/ASN1EncodableVector;

    invoke-direct {v12}, Lorg/spongycastle/asn1/ASN1EncodableVector;-><init>()V

    .line 1252
    instance-of v1, v4, Lorg/spongycastle/jce/interfaces/PKCS12BagAttributeCarrier;

    if-eqz v1, :cond_b

    .line 1254
    move-object v0, v4

    check-cast v0, Lorg/spongycastle/jce/interfaces/PKCS12BagAttributeCarrier;

    move-object v3, v0

    .line 1258
    sget-object v1, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->af:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v3, v1}, Lorg/spongycastle/jce/interfaces/PKCS12BagAttributeCarrier;->a(Lorg/spongycastle/asn1/DERObjectIdentifier;)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v1

    check-cast v1, Lorg/spongycastle/asn1/DERBMPString;

    .line 1259
    if-eqz v1, :cond_8

    invoke-virtual {v1}, Lorg/spongycastle/asn1/DERBMPString;->o_()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    .line 1261
    :cond_8
    sget-object v1, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->af:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    new-instance v13, Lorg/spongycastle/asn1/DERBMPString;

    invoke-direct {v13, v2}, Lorg/spongycastle/asn1/DERBMPString;-><init>(Ljava/lang/String;)V

    invoke-interface {v3, v1, v13}, Lorg/spongycastle/jce/interfaces/PKCS12BagAttributeCarrier;->a(Lorg/spongycastle/asn1/ASN1ObjectIdentifier;Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 1267
    :cond_9
    sget-object v1, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->ag:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v3, v1}, Lorg/spongycastle/jce/interfaces/PKCS12BagAttributeCarrier;->a(Lorg/spongycastle/asn1/DERObjectIdentifier;)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v1

    if-nez v1, :cond_a

    .line 1269
    sget-object v1, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->ag:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v4}, Ljava/security/cert/Certificate;->getPublicKey()Ljava/security/PublicKey;

    move-result-object v13

    invoke-static {v13}, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->b(Ljava/security/PublicKey;)Lorg/spongycastle/asn1/x509/SubjectKeyIdentifier;

    move-result-object v13

    invoke-interface {v3, v1, v13}, Lorg/spongycastle/jce/interfaces/PKCS12BagAttributeCarrier;->a(Lorg/spongycastle/asn1/ASN1ObjectIdentifier;Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 1272
    :cond_a
    invoke-interface {v3}, Lorg/spongycastle/jce/interfaces/PKCS12BagAttributeCarrier;->a()Ljava/util/Enumeration;

    move-result-object v13

    move v1, v5

    .line 1274
    :goto_3
    invoke-interface {v13}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v5

    if-eqz v5, :cond_c

    .line 1276
    invoke-interface {v13}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    .line 1277
    new-instance v5, Lorg/spongycastle/asn1/ASN1EncodableVector;

    invoke-direct {v5}, Lorg/spongycastle/asn1/ASN1EncodableVector;-><init>()V

    .line 1279
    invoke-virtual {v5, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 1280
    new-instance v14, Lorg/spongycastle/asn1/DERSet;

    invoke-interface {v3, v1}, Lorg/spongycastle/jce/interfaces/PKCS12BagAttributeCarrier;->a(Lorg/spongycastle/asn1/DERObjectIdentifier;)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v1

    invoke-direct {v14, v1}, Lorg/spongycastle/asn1/DERSet;-><init>(Lorg/spongycastle/asn1/ASN1Encodable;)V

    invoke-virtual {v5, v14}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 1281
    new-instance v1, Lorg/spongycastle/asn1/DERSequence;

    invoke-direct {v1, v5}, Lorg/spongycastle/asn1/DERSequence;-><init>(Lorg/spongycastle/asn1/ASN1EncodableVector;)V

    invoke-virtual {v12, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 1283
    const/4 v1, 0x1

    .line 1284
    goto :goto_3

    :cond_b
    move v1, v5

    .line 1287
    :cond_c
    if-nez v1, :cond_d

    .line 1289
    new-instance v1, Lorg/spongycastle/asn1/ASN1EncodableVector;

    invoke-direct {v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;-><init>()V

    .line 1291
    sget-object v3, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->ag:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v1, v3}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 1292
    new-instance v3, Lorg/spongycastle/asn1/DERSet;

    invoke-virtual {v4}, Ljava/security/cert/Certificate;->getPublicKey()Ljava/security/PublicKey;

    move-result-object v5

    invoke-static {v5}, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->b(Ljava/security/PublicKey;)Lorg/spongycastle/asn1/x509/SubjectKeyIdentifier;

    move-result-object v5

    invoke-direct {v3, v5}, Lorg/spongycastle/asn1/DERSet;-><init>(Lorg/spongycastle/asn1/ASN1Encodable;)V

    invoke-virtual {v1, v3}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 1293
    new-instance v3, Lorg/spongycastle/asn1/DERSequence;

    invoke-direct {v3, v1}, Lorg/spongycastle/asn1/DERSequence;-><init>(Lorg/spongycastle/asn1/ASN1EncodableVector;)V

    invoke-virtual {v12, v3}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 1295
    new-instance v1, Lorg/spongycastle/asn1/ASN1EncodableVector;

    invoke-direct {v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;-><init>()V

    .line 1297
    sget-object v3, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->af:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v1, v3}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 1298
    new-instance v3, Lorg/spongycastle/asn1/DERSet;

    new-instance v5, Lorg/spongycastle/asn1/DERBMPString;

    invoke-direct {v5, v2}, Lorg/spongycastle/asn1/DERBMPString;-><init>(Ljava/lang/String;)V

    invoke-direct {v3, v5}, Lorg/spongycastle/asn1/DERSet;-><init>(Lorg/spongycastle/asn1/ASN1Encodable;)V

    invoke-virtual {v1, v3}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 1300
    new-instance v2, Lorg/spongycastle/asn1/DERSequence;

    invoke-direct {v2, v1}, Lorg/spongycastle/asn1/DERSequence;-><init>(Lorg/spongycastle/asn1/ASN1EncodableVector;)V

    invoke-virtual {v12, v2}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 1303
    :cond_d
    new-instance v1, Lorg/spongycastle/asn1/pkcs/SafeBag;

    sget-object v2, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->bl:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v11}, Lorg/spongycastle/asn1/pkcs/CertBag;->a()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v3

    new-instance v5, Lorg/spongycastle/asn1/DERSet;

    invoke-direct {v5, v12}, Lorg/spongycastle/asn1/DERSet;-><init>(Lorg/spongycastle/asn1/ASN1EncodableVector;)V

    invoke-direct {v1, v2, v3, v5}, Lorg/spongycastle/asn1/pkcs/SafeBag;-><init>(Lorg/spongycastle/asn1/ASN1ObjectIdentifier;Lorg/spongycastle/asn1/ASN1Encodable;Lorg/spongycastle/asn1/ASN1Set;)V

    .line 1305
    invoke-virtual {v7, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 1307
    invoke-virtual {v9, v4, v4}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/security/cert/CertificateEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_2

    .line 1309
    :catch_0
    move-exception v1

    .line 1311
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

    .line 1315
    :cond_e
    iget-object v1, p0, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->bD:Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore$b;

    invoke-virtual {v1}, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore$b;->a()Ljava/util/Enumeration;

    move-result-object v10

    .line 1316
    :cond_f
    :goto_4
    invoke-interface {v10}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v1

    if-eqz v1, :cond_15

    .line 1320
    :try_start_1
    invoke-interface {v10}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 1321
    iget-object v2, p0, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->bD:Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore$b;

    invoke-virtual {v2, v1}, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore$b;->b(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/security/cert/Certificate;

    .line 1322
    const/4 v5, 0x0

    .line 1324
    iget-object v3, p0, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->bB:Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore$b;

    invoke-virtual {v3, v1}, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore$b;->b(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    if-nez v3, :cond_f

    .line 1329
    new-instance v11, Lorg/spongycastle/asn1/pkcs/CertBag;

    sget-object v3, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->aj:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    new-instance v4, Lorg/spongycastle/asn1/DEROctetString;

    invoke-virtual {v2}, Ljava/security/cert/Certificate;->getEncoded()[B

    move-result-object v12

    invoke-direct {v4, v12}, Lorg/spongycastle/asn1/DEROctetString;-><init>([B)V

    invoke-direct {v11, v3, v4}, Lorg/spongycastle/asn1/pkcs/CertBag;-><init>(Lorg/spongycastle/asn1/ASN1ObjectIdentifier;Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 1332
    new-instance v12, Lorg/spongycastle/asn1/ASN1EncodableVector;

    invoke-direct {v12}, Lorg/spongycastle/asn1/ASN1EncodableVector;-><init>()V

    .line 1334
    instance-of v3, v2, Lorg/spongycastle/jce/interfaces/PKCS12BagAttributeCarrier;

    if-eqz v3, :cond_13

    .line 1336
    move-object v0, v2

    check-cast v0, Lorg/spongycastle/jce/interfaces/PKCS12BagAttributeCarrier;

    move-object v3, v0

    .line 1340
    sget-object v4, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->af:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v3, v4}, Lorg/spongycastle/jce/interfaces/PKCS12BagAttributeCarrier;->a(Lorg/spongycastle/asn1/DERObjectIdentifier;)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v4

    check-cast v4, Lorg/spongycastle/asn1/DERBMPString;

    .line 1341
    if-eqz v4, :cond_10

    invoke-virtual {v4}, Lorg/spongycastle/asn1/DERBMPString;->o_()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_11

    .line 1343
    :cond_10
    sget-object v4, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->af:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    new-instance v13, Lorg/spongycastle/asn1/DERBMPString;

    invoke-direct {v13, v1}, Lorg/spongycastle/asn1/DERBMPString;-><init>(Ljava/lang/String;)V

    invoke-interface {v3, v4, v13}, Lorg/spongycastle/jce/interfaces/PKCS12BagAttributeCarrier;->a(Lorg/spongycastle/asn1/ASN1ObjectIdentifier;Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 1346
    :cond_11
    invoke-interface {v3}, Lorg/spongycastle/jce/interfaces/PKCS12BagAttributeCarrier;->a()Ljava/util/Enumeration;

    move-result-object v13

    .line 1348
    :cond_12
    :goto_5
    invoke-interface {v13}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v4

    if-eqz v4, :cond_13

    .line 1350
    invoke-interface {v13}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    .line 1356
    sget-object v14, Lorg/spongycastle/asn1/pkcs/PKCSObjectIdentifiers;->ag:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v4, v14}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_12

    .line 1358
    new-instance v5, Lorg/spongycastle/asn1/ASN1EncodableVector;

    invoke-direct {v5}, Lorg/spongycastle/asn1/ASN1EncodableVector;-><init>()V

    .line 1363
    invoke-virtual {v5, v4}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 1364
    new-instance v14, Lorg/spongycastle/asn1/DERSet;

    invoke-interface {v3, v4}, Lorg/spongycastle/jce/interfaces/PKCS12BagAttributeCarrier;->a(Lorg/spongycastle/asn1/DERObjectIdentifier;)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v4

    invoke-direct {v14, v4}, Lorg/spongycastle/asn1/DERSet;-><init>(Lorg/spongycastle/asn1/ASN1Encodable;)V

    invoke-virtual {v5, v14}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 1365
    new-instance v4, Lorg/spongycastle/asn1/DERSequence;

    invoke-direct {v4, v5}, Lorg/spongycastle/asn1/DERSequence;-><init>(Lorg/spongycastle/asn1/ASN1EncodableVector;)V

    invoke-virtual {v12, v4}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 1367
    const/4 v5, 0x1

    .line 1368
    goto :goto_5

    :cond_13
    move v3, v5

    .line 1371
    if-nez v3, :cond_14

    .line 1373
    new-instance v3, Lorg/spongycastle/asn1/ASN1EncodableVector;

    invoke-direct {v3}, Lorg/spongycastle/asn1/ASN1EncodableVector;-><init>()V

    .line 1375
    sget-object v4, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->af:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v3, v4}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 1376
    new-instance v4, Lorg/spongycastle/asn1/DERSet;

    new-instance v5, Lorg/spongycastle/asn1/DERBMPString;

    invoke-direct {v5, v1}, Lorg/spongycastle/asn1/DERBMPString;-><init>(Ljava/lang/String;)V

    invoke-direct {v4, v5}, Lorg/spongycastle/asn1/DERSet;-><init>(Lorg/spongycastle/asn1/ASN1Encodable;)V

    invoke-virtual {v3, v4}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 1378
    new-instance v1, Lorg/spongycastle/asn1/DERSequence;

    invoke-direct {v1, v3}, Lorg/spongycastle/asn1/DERSequence;-><init>(Lorg/spongycastle/asn1/ASN1EncodableVector;)V

    invoke-virtual {v12, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 1381
    :cond_14
    new-instance v1, Lorg/spongycastle/asn1/pkcs/SafeBag;

    sget-object v3, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->bl:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v11}, Lorg/spongycastle/asn1/pkcs/CertBag;->a()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v4

    new-instance v5, Lorg/spongycastle/asn1/DERSet;

    invoke-direct {v5, v12}, Lorg/spongycastle/asn1/DERSet;-><init>(Lorg/spongycastle/asn1/ASN1EncodableVector;)V

    invoke-direct {v1, v3, v4, v5}, Lorg/spongycastle/asn1/pkcs/SafeBag;-><init>(Lorg/spongycastle/asn1/ASN1ObjectIdentifier;Lorg/spongycastle/asn1/ASN1Encodable;Lorg/spongycastle/asn1/ASN1Set;)V

    .line 1383
    invoke-virtual {v7, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 1385
    invoke-virtual {v9, v2, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/security/cert/CertificateEncodingException; {:try_start_1 .. :try_end_1} :catch_1

    goto/16 :goto_4

    .line 1387
    :catch_1
    move-exception v1

    .line 1389
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

    .line 1393
    :cond_15
    iget-object v1, p0, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->bE:Ljava/util/Hashtable;

    invoke-virtual {v1}, Ljava/util/Hashtable;->keys()Ljava/util/Enumeration;

    move-result-object v3

    .line 1394
    :cond_16
    :goto_6
    invoke-interface {v3}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v1

    if-eqz v1, :cond_19

    .line 1398
    :try_start_2
    invoke-interface {v3}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore$a;

    .line 1399
    iget-object v2, p0, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->bE:Ljava/util/Hashtable;

    invoke-virtual {v2, v1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/security/cert/Certificate;

    .line 1401
    invoke-virtual {v9, v1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_16

    .line 1406
    new-instance v4, Lorg/spongycastle/asn1/pkcs/CertBag;

    sget-object v2, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->aj:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    new-instance v5, Lorg/spongycastle/asn1/DEROctetString;

    invoke-virtual {v1}, Ljava/security/cert/Certificate;->getEncoded()[B

    move-result-object v10

    invoke-direct {v5, v10}, Lorg/spongycastle/asn1/DEROctetString;-><init>([B)V

    invoke-direct {v4, v2, v5}, Lorg/spongycastle/asn1/pkcs/CertBag;-><init>(Lorg/spongycastle/asn1/ASN1ObjectIdentifier;Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 1409
    new-instance v5, Lorg/spongycastle/asn1/ASN1EncodableVector;

    invoke-direct {v5}, Lorg/spongycastle/asn1/ASN1EncodableVector;-><init>()V

    .line 1411
    instance-of v2, v1, Lorg/spongycastle/jce/interfaces/PKCS12BagAttributeCarrier;

    if-eqz v2, :cond_18

    .line 1413
    move-object v0, v1

    check-cast v0, Lorg/spongycastle/jce/interfaces/PKCS12BagAttributeCarrier;

    move-object v2, v0

    .line 1414
    invoke-interface {v2}, Lorg/spongycastle/jce/interfaces/PKCS12BagAttributeCarrier;->a()Ljava/util/Enumeration;

    move-result-object v10

    .line 1416
    :cond_17
    :goto_7
    invoke-interface {v10}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v1

    if-eqz v1, :cond_18

    .line 1418
    invoke-interface {v10}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    .line 1424
    sget-object v11, Lorg/spongycastle/asn1/pkcs/PKCSObjectIdentifiers;->ag:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v1, v11}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_17

    .line 1426
    new-instance v11, Lorg/spongycastle/asn1/ASN1EncodableVector;

    invoke-direct {v11}, Lorg/spongycastle/asn1/ASN1EncodableVector;-><init>()V

    .line 1431
    invoke-virtual {v11, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 1432
    new-instance v12, Lorg/spongycastle/asn1/DERSet;

    invoke-interface {v2, v1}, Lorg/spongycastle/jce/interfaces/PKCS12BagAttributeCarrier;->a(Lorg/spongycastle/asn1/DERObjectIdentifier;)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v1

    invoke-direct {v12, v1}, Lorg/spongycastle/asn1/DERSet;-><init>(Lorg/spongycastle/asn1/ASN1Encodable;)V

    invoke-virtual {v11, v12}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 1433
    new-instance v1, Lorg/spongycastle/asn1/DERSequence;

    invoke-direct {v1, v11}, Lorg/spongycastle/asn1/DERSequence;-><init>(Lorg/spongycastle/asn1/ASN1EncodableVector;)V

    invoke-virtual {v5, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V
    :try_end_2
    .catch Ljava/security/cert/CertificateEncodingException; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_7

    .line 1441
    :catch_2
    move-exception v1

    .line 1443
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

    .line 1437
    :cond_18
    :try_start_3
    new-instance v1, Lorg/spongycastle/asn1/pkcs/SafeBag;

    sget-object v2, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->bl:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v4}, Lorg/spongycastle/asn1/pkcs/CertBag;->a()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v4

    new-instance v10, Lorg/spongycastle/asn1/DERSet;

    invoke-direct {v10, v5}, Lorg/spongycastle/asn1/DERSet;-><init>(Lorg/spongycastle/asn1/ASN1EncodableVector;)V

    invoke-direct {v1, v2, v4, v10}, Lorg/spongycastle/asn1/pkcs/SafeBag;-><init>(Lorg/spongycastle/asn1/ASN1ObjectIdentifier;Lorg/spongycastle/asn1/ASN1Encodable;Lorg/spongycastle/asn1/ASN1Set;)V

    .line 1439
    invoke-virtual {v7, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V
    :try_end_3
    .catch Ljava/security/cert/CertificateEncodingException; {:try_start_3 .. :try_end_3} :catch_2

    goto/16 :goto_6

    .line 1447
    :cond_19
    new-instance v1, Lorg/spongycastle/asn1/DERSequence;

    invoke-direct {v1, v7}, Lorg/spongycastle/asn1/DERSequence;-><init>(Lorg/spongycastle/asn1/ASN1EncodableVector;)V

    const-string v2, "DER"

    invoke-virtual {v1, v2}, Lorg/spongycastle/asn1/DERSequence;->a(Ljava/lang/String;)[B

    move-result-object v1

    .line 1448
    const/4 v2, 0x1

    const/4 v3, 0x0

    move-object/from16 v0, p2

    invoke-static {v2, v8, v0, v3, v1}, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->a(ZLorg/spongycastle/asn1/x509/AlgorithmIdentifier;[CZ[B)[B

    move-result-object v1

    .line 1449
    new-instance v2, Lorg/spongycastle/asn1/pkcs/EncryptedData;

    sget-object v3, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->M:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    new-instance v4, Lorg/spongycastle/asn1/BERConstructedOctetString;

    invoke-direct {v4, v1}, Lorg/spongycastle/asn1/BERConstructedOctetString;-><init>([B)V

    invoke-direct {v2, v3, v8, v4}, Lorg/spongycastle/asn1/pkcs/EncryptedData;-><init>(Lorg/spongycastle/asn1/ASN1ObjectIdentifier;Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 1451
    const/4 v1, 0x2

    new-array v1, v1, [Lorg/spongycastle/asn1/pkcs/ContentInfo;

    const/4 v3, 0x0

    new-instance v4, Lorg/spongycastle/asn1/pkcs/ContentInfo;

    sget-object v5, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->M:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-direct {v4, v5, v6}, Lorg/spongycastle/asn1/pkcs/ContentInfo;-><init>(Lorg/spongycastle/asn1/ASN1ObjectIdentifier;Lorg/spongycastle/asn1/ASN1Encodable;)V

    aput-object v4, v1, v3

    const/4 v3, 0x1

    new-instance v4, Lorg/spongycastle/asn1/pkcs/ContentInfo;

    sget-object v5, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->R:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v2}, Lorg/spongycastle/asn1/pkcs/EncryptedData;->a()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v2

    invoke-direct {v4, v5, v2}, Lorg/spongycastle/asn1/pkcs/ContentInfo;-><init>(Lorg/spongycastle/asn1/ASN1ObjectIdentifier;Lorg/spongycastle/asn1/ASN1Encodable;)V

    aput-object v4, v1, v3

    .line 1457
    new-instance v2, Lorg/spongycastle/asn1/pkcs/AuthenticatedSafe;

    invoke-direct {v2, v1}, Lorg/spongycastle/asn1/pkcs/AuthenticatedSafe;-><init>([Lorg/spongycastle/asn1/pkcs/ContentInfo;)V

    .line 1459
    new-instance v3, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v3}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 1461
    if-eqz p3, :cond_1a

    .line 1463
    new-instance v1, Lorg/spongycastle/asn1/DEROutputStream;

    invoke-direct {v1, v3}, Lorg/spongycastle/asn1/DEROutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 1470
    :goto_8
    invoke-virtual {v1, v2}, Lorg/spongycastle/asn1/DEROutputStream;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 1472
    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v1

    .line 1474
    new-instance v7, Lorg/spongycastle/asn1/pkcs/ContentInfo;

    sget-object v2, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->M:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    new-instance v3, Lorg/spongycastle/asn1/BERConstructedOctetString;

    invoke-direct {v3, v1}, Lorg/spongycastle/asn1/BERConstructedOctetString;-><init>([B)V

    invoke-direct {v7, v2, v3}, Lorg/spongycastle/asn1/pkcs/ContentInfo;-><init>(Lorg/spongycastle/asn1/ASN1ObjectIdentifier;Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 1479
    const/16 v1, 0x14

    new-array v2, v1, [B

    .line 1480
    iget-object v1, p0, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->bz:Ljava/security/SecureRandom;

    invoke-virtual {v1, v2}, Ljava/security/SecureRandom;->nextBytes([B)V

    .line 1484
    invoke-virtual {v7}, Lorg/spongycastle/asn1/pkcs/ContentInfo;->d()Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v1

    check-cast v1, Lorg/spongycastle/asn1/ASN1OctetString;

    invoke-virtual {v1}, Lorg/spongycastle/asn1/ASN1OctetString;->d()[B

    move-result-object v6

    .line 1490
    :try_start_4
    sget-object v1, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->i:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    const/16 v3, 0x400

    const/4 v5, 0x0

    move-object/from16 v4, p2

    invoke-static/range {v1 .. v6}, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->a(Lorg/spongycastle/asn1/ASN1ObjectIdentifier;[BI[CZ[B)[B

    move-result-object v1

    .line 1492
    new-instance v3, Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;

    sget-object v4, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->i:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    new-instance v5, Lorg/spongycastle/asn1/DERNull;

    invoke-direct {v5}, Lorg/spongycastle/asn1/DERNull;-><init>()V

    invoke-direct {v3, v4, v5}, Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;-><init>(Lorg/spongycastle/asn1/ASN1ObjectIdentifier;Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 1493
    new-instance v4, Lorg/spongycastle/asn1/x509/DigestInfo;

    invoke-direct {v4, v3, v1}, Lorg/spongycastle/asn1/x509/DigestInfo;-><init>(Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;[B)V

    .line 1495
    new-instance v1, Lorg/spongycastle/asn1/pkcs/MacData;

    invoke-direct {v1, v4, v2}, Lorg/spongycastle/asn1/pkcs/MacData;-><init>(Lorg/spongycastle/asn1/x509/DigestInfo;[B)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_3

    .line 1505
    new-instance v2, Lorg/spongycastle/asn1/pkcs/Pfx;

    invoke-direct {v2, v7, v1}, Lorg/spongycastle/asn1/pkcs/Pfx;-><init>(Lorg/spongycastle/asn1/pkcs/ContentInfo;Lorg/spongycastle/asn1/pkcs/MacData;)V

    .line 1507
    if-eqz p3, :cond_1b

    .line 1509
    new-instance v1, Lorg/spongycastle/asn1/DEROutputStream;

    move-object/from16 v0, p1

    invoke-direct {v1, v0}, Lorg/spongycastle/asn1/DEROutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 1516
    :goto_9
    invoke-virtual {v1, v2}, Lorg/spongycastle/asn1/DEROutputStream;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 1517
    return-void

    .line 1467
    :cond_1a
    new-instance v1, Lorg/spongycastle/asn1/BEROutputStream;

    invoke-direct {v1, v3}, Lorg/spongycastle/asn1/BEROutputStream;-><init>(Ljava/io/OutputStream;)V

    goto :goto_8

    .line 1497
    :catch_3
    move-exception v1

    .line 1499
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

    .line 1513
    :cond_1b
    new-instance v1, Lorg/spongycastle/asn1/BEROutputStream;

    move-object/from16 v0, p1

    invoke-direct {v1, v0}, Lorg/spongycastle/asn1/BEROutputStream;-><init>(Ljava/io/OutputStream;)V

    goto :goto_9
.end method

.method private static a(Ljava/lang/String;Ljava/security/Key;Lorg/spongycastle/asn1/pkcs/PKCS12PBEParams;[C)[B
    .locals 5

    .prologue
    .line 589
    new-instance v0, Ljavax/crypto/spec/PBEKeySpec;

    invoke-direct {v0, p3}, Ljavax/crypto/spec/PBEKeySpec;-><init>([C)V

    .line 594
    :try_start_0
    sget-object v1, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->bA:Ljava/security/Provider;

    invoke-static {p0, v1}, Ljavax/crypto/SecretKeyFactory;->getInstance(Ljava/lang/String;Ljava/security/Provider;)Ljavax/crypto/SecretKeyFactory;

    move-result-object v1

    .line 596
    new-instance v2, Ljavax/crypto/spec/PBEParameterSpec;

    invoke-virtual {p2}, Lorg/spongycastle/asn1/pkcs/PKCS12PBEParams;->d()[B

    move-result-object v3

    invoke-virtual {p2}, Lorg/spongycastle/asn1/pkcs/PKCS12PBEParams;->c()Ljava/math/BigInteger;

    move-result-object v4

    invoke-virtual {v4}, Ljava/math/BigInteger;->intValue()I

    move-result v4

    invoke-direct {v2, v3, v4}, Ljavax/crypto/spec/PBEParameterSpec;-><init>([BI)V

    .line 600
    sget-object v3, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->bA:Ljava/security/Provider;

    invoke-static {p0, v3}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;Ljava/security/Provider;)Ljavax/crypto/Cipher;

    move-result-object v3

    .line 602
    const/4 v4, 0x3

    invoke-virtual {v1, v0}, Ljavax/crypto/SecretKeyFactory;->generateSecret(Ljava/security/spec/KeySpec;)Ljavax/crypto/SecretKey;

    move-result-object v0

    invoke-virtual {v3, v4, v0, v2}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    .line 604
    invoke-virtual {v3, p1}, Ljavax/crypto/Cipher;->wrap(Ljava/security/Key;)[B
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 611
    return-object v0

    .line 606
    :catch_0
    move-exception v0

    .line 608
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

.method private static a(Lorg/spongycastle/asn1/ASN1ObjectIdentifier;[BI[CZ[B)[B
    .locals 4

    .prologue
    .line 1528
    invoke-virtual {p0}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;->c()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->bA:Ljava/security/Provider;

    invoke-static {v0, v1}, Ljavax/crypto/SecretKeyFactory;->getInstance(Ljava/lang/String;Ljava/security/Provider;)Ljavax/crypto/SecretKeyFactory;

    move-result-object v0

    .line 1529
    new-instance v1, Ljavax/crypto/spec/PBEParameterSpec;

    invoke-direct {v1, p1, p2}, Ljavax/crypto/spec/PBEParameterSpec;-><init>([BI)V

    .line 1530
    new-instance v2, Ljavax/crypto/spec/PBEKeySpec;

    invoke-direct {v2, p3}, Ljavax/crypto/spec/PBEKeySpec;-><init>([C)V

    .line 1531
    invoke-virtual {v0, v2}, Ljavax/crypto/SecretKeyFactory;->generateSecret(Ljava/security/spec/KeySpec;)Ljavax/crypto/SecretKey;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/jcajce/provider/symmetric/util/BCPBEKey;

    .line 1532
    invoke-virtual {v0, p4}, Lorg/spongycastle/jcajce/provider/symmetric/util/BCPBEKey;->a(Z)V

    .line 1534
    invoke-virtual {p0}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;->c()Ljava/lang/String;

    move-result-object v2

    sget-object v3, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->bA:Ljava/security/Provider;

    invoke-static {v2, v3}, Ljavax/crypto/Mac;->getInstance(Ljava/lang/String;Ljava/security/Provider;)Ljavax/crypto/Mac;

    move-result-object v2

    .line 1535
    invoke-virtual {v2, v0, v1}, Ljavax/crypto/Mac;->init(Ljava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    .line 1536
    invoke-virtual {v2, p5}, Ljavax/crypto/Mac;->update([B)V

    .line 1537
    invoke-virtual {v2}, Ljavax/crypto/Mac;->doFinal()[B

    move-result-object v0

    return-object v0
.end method

.method private static a(ZLorg/spongycastle/asn1/x509/AlgorithmIdentifier;[CZ[B)[B
    .locals 6

    .prologue
    .line 622
    invoke-virtual {p1}, Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;->d()Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    move-result-object v0

    invoke-virtual {v0}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;->c()Ljava/lang/String;

    move-result-object v1

    .line 623
    invoke-virtual {p1}, Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;->e()Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v0

    invoke-static {v0}, Lorg/spongycastle/asn1/pkcs/PKCS12PBEParams;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/pkcs/PKCS12PBEParams;

    move-result-object v0

    .line 624
    new-instance v2, Ljavax/crypto/spec/PBEKeySpec;

    invoke-direct {v2, p2}, Ljavax/crypto/spec/PBEKeySpec;-><init>([C)V

    .line 628
    :try_start_0
    sget-object v3, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->bA:Ljava/security/Provider;

    invoke-static {v1, v3}, Ljavax/crypto/SecretKeyFactory;->getInstance(Ljava/lang/String;Ljava/security/Provider;)Ljavax/crypto/SecretKeyFactory;

    move-result-object v3

    .line 629
    new-instance v4, Ljavax/crypto/spec/PBEParameterSpec;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/pkcs/PKCS12PBEParams;->d()[B

    move-result-object v5

    invoke-virtual {v0}, Lorg/spongycastle/asn1/pkcs/PKCS12PBEParams;->c()Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigInteger;->intValue()I

    move-result v0

    invoke-direct {v4, v5, v0}, Ljavax/crypto/spec/PBEParameterSpec;-><init>([BI)V

    .line 632
    invoke-virtual {v3, v2}, Ljavax/crypto/SecretKeyFactory;->generateSecret(Ljava/security/spec/KeySpec;)Ljavax/crypto/SecretKey;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/jcajce/provider/symmetric/util/BCPBEKey;

    .line 634
    invoke-virtual {v0, p3}, Lorg/spongycastle/jcajce/provider/symmetric/util/BCPBEKey;->a(Z)V

    .line 636
    sget-object v2, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->bA:Ljava/security/Provider;

    invoke-static {v1, v2}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;Ljava/security/Provider;)Ljavax/crypto/Cipher;

    move-result-object v2

    .line 637
    if-eqz p0, :cond_0

    const/4 v1, 0x1

    .line 638
    :goto_0
    invoke-virtual {v2, v1, v0, v4}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    .line 639
    invoke-virtual {v2, p4}, Ljavax/crypto/Cipher;->doFinal([B)[B
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 637
    :cond_0
    const/4 v1, 0x2

    goto :goto_0

    .line 641
    :catch_0
    move-exception v0

    .line 643
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

.method private static b(Ljava/security/PublicKey;)Lorg/spongycastle/asn1/x509/SubjectKeyIdentifier;
    .locals 2

    .prologue
    .line 188
    :try_start_0
    new-instance v1, Lorg/spongycastle/asn1/x509/SubjectPublicKeyInfo;

    invoke-interface {p0}, Ljava/security/PublicKey;->getEncoded()[B

    move-result-object v0

    invoke-static {v0}, Lorg/spongycastle/asn1/ASN1Primitive;->a([B)Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/asn1/ASN1Sequence;

    invoke-direct {v1, v0}, Lorg/spongycastle/asn1/x509/SubjectPublicKeyInfo;-><init>(Lorg/spongycastle/asn1/ASN1Sequence;)V

    .line 191
    new-instance v0, Lorg/spongycastle/asn1/x509/SubjectKeyIdentifier;

    invoke-direct {v0, v1}, Lorg/spongycastle/asn1/x509/SubjectKeyIdentifier;-><init>(Lorg/spongycastle/asn1/x509/SubjectPublicKeyInfo;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    .line 195
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

    .prologue
    .line 207
    new-instance v1, Ljava/util/Hashtable;

    invoke-direct {v1}, Ljava/util/Hashtable;-><init>()V

    .line 209
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->bD:Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore$b;

    invoke-virtual {v0}, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore$b;->a()Ljava/util/Enumeration;

    move-result-object v0

    .line 210
    :goto_0
    invoke-interface {v0}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 212
    invoke-interface {v0}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v2

    const-string v3, "cert"

    invoke-virtual {v1, v2, v3}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 215
    :cond_0
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->bB:Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore$b;

    invoke-virtual {v0}, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore$b;->a()Ljava/util/Enumeration;

    move-result-object v2

    .line 216
    :cond_1
    :goto_1
    invoke-interface {v2}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 218
    invoke-interface {v2}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 219
    invoke-virtual {v1, v0}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-nez v3, :cond_1

    .line 221
    const-string v3, "key"

    invoke-virtual {v1, v0, v3}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 225
    :cond_2
    invoke-virtual {v1}, Ljava/util/Hashtable;->keys()Ljava/util/Enumeration;

    move-result-object v0

    return-object v0
.end method

.method public engineContainsAlias(Ljava/lang/String;)Z
    .locals 1

    .prologue
    .line 231
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->bD:Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore$b;

    invoke-virtual {v0, p1}, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore$b;->b(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->bB:Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore$b;

    invoke-virtual {v0, p1}, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore$b;->b(Ljava/lang/String;)Ljava/lang/Object;

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

    .prologue
    .line 242
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->bB:Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore$b;

    invoke-virtual {v0, p1}, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore$b;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/security/Key;

    .line 244
    iget-object v1, p0, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->bD:Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore$b;

    invoke-virtual {v1, p1}, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore$b;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/security/cert/Certificate;

    .line 246
    if-eqz v1, :cond_0

    .line 248
    iget-object v2, p0, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->bE:Ljava/util/Hashtable;

    new-instance v3, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore$a;

    invoke-virtual {v1}, Ljava/security/cert/Certificate;->getPublicKey()Ljava/security/PublicKey;

    move-result-object v4

    invoke-direct {v3, p0, v4}, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore$a;-><init>(Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;Ljava/security/PublicKey;)V

    invoke-virtual {v2, v3}, Ljava/util/Hashtable;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 251
    :cond_0
    if-eqz v0, :cond_2

    .line 253
    iget-object v2, p0, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->bC:Ljava/util/Hashtable;

    invoke-virtual {v2, p1}, Ljava/util/Hashtable;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 254
    if-eqz v2, :cond_1

    .line 256
    iget-object v1, p0, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->bF:Ljava/util/Hashtable;

    invoke-virtual {v1, v2}, Ljava/util/Hashtable;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/security/cert/Certificate;

    .line 258
    :cond_1
    if-eqz v1, :cond_2

    .line 260
    iget-object v2, p0, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->bE:Ljava/util/Hashtable;

    new-instance v3, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore$a;

    invoke-virtual {v1}, Ljava/security/cert/Certificate;->getPublicKey()Ljava/security/PublicKey;

    move-result-object v4

    invoke-direct {v3, p0, v4}, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore$a;-><init>(Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;Ljava/security/PublicKey;)V

    invoke-virtual {v2, v3}, Ljava/util/Hashtable;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 264
    :cond_2
    if-nez v1, :cond_3

    if-nez v0, :cond_3

    .line 266
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

    .line 268
    :cond_3
    return-void
.end method

.method public engineGetCertificate(Ljava/lang/String;)Ljava/security/cert/Certificate;
    .locals 2

    .prologue
    .line 276
    if-nez p1, :cond_0

    .line 278
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "null alias passed to getCertificate."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 281
    :cond_0
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->bD:Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore$b;

    invoke-virtual {v0, p1}, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore$b;->b(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/security/cert/Certificate;

    .line 286
    if-nez v0, :cond_1

    .line 288
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->bC:Ljava/util/Hashtable;

    invoke-virtual {v0, p1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 289
    if-eqz v0, :cond_2

    .line 291
    iget-object v1, p0, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->bF:Ljava/util/Hashtable;

    invoke-virtual {v1, v0}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/security/cert/Certificate;

    .line 299
    :cond_1
    :goto_0
    return-object v0

    .line 295
    :cond_2
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->bF:Ljava/util/Hashtable;

    invoke-virtual {v0, p1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/security/cert/Certificate;

    goto :goto_0
.end method

.method public engineGetCertificateAlias(Ljava/security/cert/Certificate;)Ljava/lang/String;
    .locals 4

    .prologue
    .line 305
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->bD:Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore$b;

    invoke-virtual {v0}, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore$b;->b()Ljava/util/Enumeration;

    move-result-object v2

    .line 306
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->bD:Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore$b;

    invoke-virtual {v0}, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore$b;->a()Ljava/util/Enumeration;

    move-result-object v3

    .line 308
    :cond_0
    invoke-interface {v2}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 310
    invoke-interface {v2}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/security/cert/Certificate;

    .line 311
    invoke-interface {v3}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 313
    invoke-virtual {v0, p1}, Ljava/security/cert/Certificate;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 333
    :goto_0
    return-object v1

    .line 319
    :cond_1
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->bF:Ljava/util/Hashtable;

    invoke-virtual {v0}, Ljava/util/Hashtable;->elements()Ljava/util/Enumeration;

    move-result-object v2

    .line 320
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->bF:Ljava/util/Hashtable;

    invoke-virtual {v0}, Ljava/util/Hashtable;->keys()Ljava/util/Enumeration;

    move-result-object v3

    .line 322
    :cond_2
    invoke-interface {v2}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 324
    invoke-interface {v2}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/security/cert/Certificate;

    .line 325
    invoke-interface {v3}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 327
    invoke-virtual {v0, p1}, Ljava/security/cert/Certificate;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_0

    .line 333
    :cond_3
    const/4 v1, 0x0

    goto :goto_0
.end method

.method public engineGetCertificateChain(Ljava/lang/String;)[Ljava/security/cert/Certificate;
    .locals 9

    .prologue
    const/4 v3, 0x0

    .line 339
    if-nez p1, :cond_0

    .line 341
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "null alias passed to getCertificateChain."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 344
    :cond_0
    invoke-virtual {p0, p1}, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->engineIsKeyEntry(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 437
    :cond_1
    return-object v3

    .line 349
    :cond_2
    invoke-virtual {p0, p1}, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->engineGetCertificate(Ljava/lang/String;)Ljava/security/cert/Certificate;

    move-result-object v1

    .line 351
    if-eqz v1, :cond_1

    .line 353
    new-instance v5, Ljava/util/Vector;

    invoke-direct {v5}, Ljava/util/Vector;-><init>()V

    .line 355
    :goto_0
    if-eqz v1, :cond_5

    move-object v0, v1

    .line 357
    check-cast v0, Ljava/security/cert/X509Certificate;

    .line 360
    sget-object v2, Lorg/spongycastle/asn1/x509/X509Extensions;->s:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v2}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/security/cert/X509Certificate;->getExtensionValue(Ljava/lang/String;)[B

    move-result-object v2

    .line 361
    if-eqz v2, :cond_8

    .line 365
    :try_start_0
    new-instance v4, Lorg/spongycastle/asn1/ASN1InputStream;

    invoke-direct {v4, v2}, Lorg/spongycastle/asn1/ASN1InputStream;-><init>([B)V

    .line 367
    invoke-virtual {v4}, Lorg/spongycastle/asn1/ASN1InputStream;->b()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v2

    check-cast v2, Lorg/spongycastle/asn1/ASN1OctetString;

    invoke-virtual {v2}, Lorg/spongycastle/asn1/ASN1OctetString;->d()[B

    move-result-object v2

    .line 368
    new-instance v4, Lorg/spongycastle/asn1/ASN1InputStream;

    invoke-direct {v4, v2}, Lorg/spongycastle/asn1/ASN1InputStream;-><init>([B)V

    .line 370
    invoke-virtual {v4}, Lorg/spongycastle/asn1/ASN1InputStream;->b()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v2

    check-cast v2, Lorg/spongycastle/asn1/ASN1Sequence;

    invoke-static {v2}, Lorg/spongycastle/asn1/x509/AuthorityKeyIdentifier;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/x509/AuthorityKeyIdentifier;

    move-result-object v2

    .line 371
    invoke-virtual {v2}, Lorg/spongycastle/asn1/x509/AuthorityKeyIdentifier;->c()[B

    move-result-object v4

    if-eqz v4, :cond_7

    .line 373
    iget-object v4, p0, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->bE:Ljava/util/Hashtable;

    new-instance v6, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore$a;

    invoke-virtual {v2}, Lorg/spongycastle/asn1/x509/AuthorityKeyIdentifier;->c()[B

    move-result-object v2

    invoke-direct {v6, p0, v2}, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore$a;-><init>(Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;[B)V

    invoke-virtual {v4, v6}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/security/cert/Certificate;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_1
    move-object v4, v2

    .line 383
    :goto_2
    if-nez v4, :cond_6

    .line 388
    invoke-virtual {v0}, Ljava/security/cert/X509Certificate;->getIssuerDN()Ljava/security/Principal;

    move-result-object v6

    .line 389
    invoke-virtual {v0}, Ljava/security/cert/X509Certificate;->getSubjectDN()Ljava/security/Principal;

    move-result-object v2

    .line 391
    invoke-virtual {v6, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6

    .line 393
    iget-object v2, p0, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->bE:Ljava/util/Hashtable;

    invoke-virtual {v2}, Ljava/util/Hashtable;->keys()Ljava/util/Enumeration;

    move-result-object v7

    .line 395
    :cond_3
    :goto_3
    invoke-interface {v7}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v2

    if-eqz v2, :cond_6

    .line 397
    iget-object v2, p0, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->bE:Ljava/util/Hashtable;

    invoke-interface {v7}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v8

    invoke-virtual {v2, v8}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/security/cert/X509Certificate;

    .line 398
    invoke-virtual {v2}, Ljava/security/cert/X509Certificate;->getSubjectDN()Ljava/security/Principal;

    move-result-object v8

    .line 399
    invoke-virtual {v8, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_3

    .line 403
    :try_start_1
    invoke-virtual {v2}, Ljava/security/cert/X509Certificate;->getPublicKey()Ljava/security/PublicKey;

    move-result-object v8

    invoke-virtual {v0, v8}, Ljava/security/cert/X509Certificate;->verify(Ljava/security/PublicKey;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 416
    :goto_4
    invoke-virtual {v5, v1}, Ljava/util/Vector;->addElement(Ljava/lang/Object;)V

    .line 417
    if-eq v2, v1, :cond_4

    move-object v1, v2

    .line 419
    goto/16 :goto_0

    .line 377
    :catch_0
    move-exception v0

    .line 379
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-virtual {v0}, Ljava/io/IOException;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_4
    move-object v1, v3

    .line 425
    goto/16 :goto_0

    .line 427
    :cond_5
    invoke-virtual {v5}, Ljava/util/Vector;->size()I

    move-result v0

    new-array v3, v0, [Ljava/security/cert/Certificate;

    .line 429
    const/4 v0, 0x0

    move v1, v0

    :goto_5
    array-length v0, v3

    if-eq v1, v0, :cond_1

    .line 431
    invoke-virtual {v5, v1}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/security/cert/Certificate;

    aput-object v0, v3, v1

    .line 429
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

    .prologue
    .line 442
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    return-object v0
.end method

.method public engineGetKey(Ljava/lang/String;[C)Ljava/security/Key;
    .locals 2

    .prologue
    .line 450
    if-nez p1, :cond_0

    .line 452
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "null alias passed to getKey."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 455
    :cond_0
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->bB:Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore$b;

    invoke-virtual {v0, p1}, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore$b;->b(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/security/Key;

    return-object v0
.end method

.method public engineIsCertificateEntry(Ljava/lang/String;)Z
    .locals 1

    .prologue
    .line 461
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->bD:Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore$b;

    invoke-virtual {v0, p1}, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore$b;->b(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->bB:Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore$b;

    invoke-virtual {v0, p1}, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore$b;->b(Ljava/lang/String;)Ljava/lang/Object;

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

    .prologue
    .line 467
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->bB:Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore$b;

    invoke-virtual {v0, p1}, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore$b;->b(Ljava/lang/String;)Ljava/lang/Object;

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

    .prologue
    .line 652
    if-nez p1, :cond_1

    .line 1087
    :cond_0
    return-void

    .line 657
    :cond_1
    if-nez p2, :cond_2

    .line 659
    new-instance v1, Ljava/lang/NullPointerException;

    const-string v2, "No password supplied for PKCS#12 KeyStore."

    invoke-direct {v1, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 662
    :cond_2
    new-instance v1, Ljava/io/BufferedInputStream;

    move-object/from16 v0, p1

    invoke-direct {v1, v0}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V

    .line 664
    const/16 v2, 0xa

    invoke-virtual {v1, v2}, Ljava/io/BufferedInputStream;->mark(I)V

    .line 666
    invoke-virtual {v1}, Ljava/io/BufferedInputStream;->read()I

    move-result v2

    .line 668
    const/16 v3, 0x30

    if-eq v2, v3, :cond_3

    .line 670
    new-instance v1, Ljava/io/IOException;

    const-string v2, "stream does not represent a PKCS12 key store"

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 673
    :cond_3
    invoke-virtual {v1}, Ljava/io/BufferedInputStream;->reset()V

    .line 675
    new-instance v2, Lorg/spongycastle/asn1/ASN1InputStream;

    invoke-direct {v2, v1}, Lorg/spongycastle/asn1/ASN1InputStream;-><init>(Ljava/io/InputStream;)V

    .line 676
    invoke-virtual {v2}, Lorg/spongycastle/asn1/ASN1InputStream;->b()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v1

    check-cast v1, Lorg/spongycastle/asn1/ASN1Sequence;

    .line 677
    invoke-static {v1}, Lorg/spongycastle/asn1/pkcs/Pfx;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/pkcs/Pfx;

    move-result-object v1

    .line 678
    invoke-virtual {v1}, Lorg/spongycastle/asn1/pkcs/Pfx;->c()Lorg/spongycastle/asn1/pkcs/ContentInfo;

    move-result-object v8

    .line 679
    new-instance v13, Ljava/util/Vector;

    invoke-direct {v13}, Ljava/util/Vector;-><init>()V

    .line 680
    const/4 v10, 0x0

    .line 681
    const/4 v7, 0x0

    .line 683
    invoke-virtual {v1}, Lorg/spongycastle/asn1/pkcs/Pfx;->d()Lorg/spongycastle/asn1/pkcs/MacData;

    move-result-object v2

    if-eqz v2, :cond_6

    .line 685
    invoke-virtual {v1}, Lorg/spongycastle/asn1/pkcs/Pfx;->d()Lorg/spongycastle/asn1/pkcs/MacData;

    move-result-object v1

    .line 686
    invoke-virtual {v1}, Lorg/spongycastle/asn1/pkcs/MacData;->c()Lorg/spongycastle/asn1/x509/DigestInfo;

    move-result-object v9

    .line 687
    invoke-virtual {v9}, Lorg/spongycastle/asn1/x509/DigestInfo;->c()Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;

    move-result-object v11

    .line 688
    invoke-virtual {v1}, Lorg/spongycastle/asn1/pkcs/MacData;->d()[B

    move-result-object v2

    .line 689
    invoke-virtual {v1}, Lorg/spongycastle/asn1/pkcs/MacData;->e()Ljava/math/BigInteger;

    move-result-object v1

    invoke-virtual {v1}, Ljava/math/BigInteger;->intValue()I

    move-result v3

    .line 691
    invoke-virtual {v8}, Lorg/spongycastle/asn1/pkcs/ContentInfo;->d()Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v1

    check-cast v1, Lorg/spongycastle/asn1/ASN1OctetString;

    invoke-virtual {v1}, Lorg/spongycastle/asn1/ASN1OctetString;->d()[B

    move-result-object v6

    .line 695
    :try_start_0
    invoke-virtual {v11}, Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;->c()Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    move-result-object v1

    const/4 v5, 0x0

    move-object/from16 v4, p2

    invoke-static/range {v1 .. v6}, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->a(Lorg/spongycastle/asn1/ASN1ObjectIdentifier;[BI[CZ[B)[B

    move-result-object v1

    .line 696
    invoke-virtual {v9}, Lorg/spongycastle/asn1/x509/DigestInfo;->d()[B

    move-result-object v9

    .line 698
    invoke-static {v1, v9}, Lorg/spongycastle/util/Arrays;->b([B[B)Z

    move-result v1

    if-nez v1, :cond_31

    .line 700
    move-object/from16 v0, p2

    array-length v1, v0

    if-lez v1, :cond_4

    .line 702
    new-instance v1, Ljava/io/IOException;

    const-string v2, "PKCS12 key store mac invalid - wrong password or corrupted file."

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 716
    :catch_0
    move-exception v1

    throw v1

    .line 706
    :cond_4
    :try_start_1
    invoke-virtual {v11}, Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;->c()Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    move-result-object v1

    const/4 v5, 0x1

    move-object/from16 v4, p2

    invoke-static/range {v1 .. v6}, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->a(Lorg/spongycastle/asn1/ASN1ObjectIdentifier;[BI[CZ[B)[B

    move-result-object v1

    .line 708
    invoke-static {v1, v9}, Lorg/spongycastle/util/Arrays;->b([B[B)Z

    move-result v1

    if-nez v1, :cond_5

    .line 710
    new-instance v1, Ljava/io/IOException;

    const-string v2, "PKCS12 key store mac invalid - wrong password or corrupted file."

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 720
    :catch_1
    move-exception v1

    .line 722
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

    .line 713
    :cond_5
    const/4 v1, 0x1

    :goto_0
    move v7, v1

    .line 726
    :cond_6
    new-instance v1, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore$b;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore$b;-><init>(B)V

    move-object/from16 v0, p0

    iput-object v1, v0, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->bB:Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore$b;

    .line 727
    new-instance v1, Ljava/util/Hashtable;

    invoke-direct {v1}, Ljava/util/Hashtable;-><init>()V

    move-object/from16 v0, p0

    iput-object v1, v0, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->bC:Ljava/util/Hashtable;

    .line 729
    invoke-virtual {v8}, Lorg/spongycastle/asn1/pkcs/ContentInfo;->c()Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    move-result-object v1

    sget-object v2, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->M:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v1, v2}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_20

    .line 731
    new-instance v2, Lorg/spongycastle/asn1/ASN1InputStream;

    invoke-virtual {v8}, Lorg/spongycastle/asn1/pkcs/ContentInfo;->d()Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v1

    check-cast v1, Lorg/spongycastle/asn1/ASN1OctetString;

    invoke-virtual {v1}, Lorg/spongycastle/asn1/ASN1OctetString;->d()[B

    move-result-object v1

    invoke-direct {v2, v1}, Lorg/spongycastle/asn1/ASN1InputStream;-><init>([B)V

    .line 733
    invoke-virtual {v2}, Lorg/spongycastle/asn1/ASN1InputStream;->b()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v1

    invoke-static {v1}, Lorg/spongycastle/asn1/pkcs/AuthenticatedSafe;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/pkcs/AuthenticatedSafe;

    move-result-object v1

    .line 734
    invoke-virtual {v1}, Lorg/spongycastle/asn1/pkcs/AuthenticatedSafe;->c()[Lorg/spongycastle/asn1/pkcs/ContentInfo;

    move-result-object v14

    .line 736
    const/4 v1, 0x0

    move v12, v1

    :goto_1
    array-length v1, v14

    if-eq v12, v1, :cond_20

    .line 738
    aget-object v1, v14, v12

    invoke-virtual {v1}, Lorg/spongycastle/asn1/pkcs/ContentInfo;->c()Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    move-result-object v1

    sget-object v2, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->M:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v1, v2}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_10

    .line 740
    new-instance v2, Lorg/spongycastle/asn1/ASN1InputStream;

    aget-object v1, v14, v12

    invoke-virtual {v1}, Lorg/spongycastle/asn1/pkcs/ContentInfo;->d()Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v1

    check-cast v1, Lorg/spongycastle/asn1/ASN1OctetString;

    invoke-virtual {v1}, Lorg/spongycastle/asn1/ASN1OctetString;->d()[B

    move-result-object v1

    invoke-direct {v2, v1}, Lorg/spongycastle/asn1/ASN1InputStream;-><init>([B)V

    .line 741
    invoke-virtual {v2}, Lorg/spongycastle/asn1/ASN1InputStream;->b()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Lorg/spongycastle/asn1/ASN1Sequence;

    .line 743
    const/4 v1, 0x0

    move v11, v1

    :goto_2
    invoke-virtual {v5}, Lorg/spongycastle/asn1/ASN1Sequence;->e()I

    move-result v1

    if-eq v11, v1, :cond_1f

    .line 745
    invoke-virtual {v5, v11}, Lorg/spongycastle/asn1/ASN1Sequence;->a(I)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v1

    invoke-static {v1}, Lorg/spongycastle/asn1/pkcs/SafeBag;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/pkcs/SafeBag;

    move-result-object v2

    .line 746
    invoke-virtual {v2}, Lorg/spongycastle/asn1/pkcs/SafeBag;->c()Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    move-result-object v1

    sget-object v3, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->bk:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v1, v3}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_e

    .line 748
    invoke-virtual {v2}, Lorg/spongycastle/asn1/pkcs/SafeBag;->d()Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v1

    invoke-static {v1}, Lorg/spongycastle/asn1/pkcs/EncryptedPrivateKeyInfo;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/pkcs/EncryptedPrivateKeyInfo;

    move-result-object v1

    .line 749
    invoke-virtual {v1}, Lorg/spongycastle/asn1/pkcs/EncryptedPrivateKeyInfo;->c()Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;

    move-result-object v3

    invoke-virtual {v1}, Lorg/spongycastle/asn1/pkcs/EncryptedPrivateKeyInfo;->d()[B

    move-result-object v1

    move-object/from16 v0, p2

    invoke-static {v3, v1, v0, v7}, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->a(Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;[B[CZ)Ljava/security/PrivateKey;

    move-result-object v4

    move-object v3, v4

    .line 754
    check-cast v3, Lorg/spongycastle/jce/interfaces/PKCS12BagAttributeCarrier;

    .line 755
    const/4 v1, 0x0

    .line 756
    const/4 v6, 0x0

    .line 758
    invoke-virtual {v2}, Lorg/spongycastle/asn1/pkcs/SafeBag;->e()Lorg/spongycastle/asn1/ASN1Set;

    move-result-object v8

    if-eqz v8, :cond_a

    .line 760
    invoke-virtual {v2}, Lorg/spongycastle/asn1/pkcs/SafeBag;->e()Lorg/spongycastle/asn1/ASN1Set;

    move-result-object v2

    invoke-virtual {v2}, Lorg/spongycastle/asn1/ASN1Set;->c()Ljava/util/Enumeration;

    move-result-object v15

    move-object v8, v1

    .line 761
    :goto_3
    invoke-interface {v15}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v1

    if-eqz v1, :cond_b

    .line 763
    invoke-interface {v15}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/spongycastle/asn1/ASN1Sequence;

    .line 764
    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lorg/spongycastle/asn1/ASN1Sequence;->a(I)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v2

    check-cast v2, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    .line 765
    const/4 v9, 0x1

    invoke-virtual {v1, v9}, Lorg/spongycastle/asn1/ASN1Sequence;->a(I)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v1

    check-cast v1, Lorg/spongycastle/asn1/ASN1Set;

    .line 766
    const/4 v9, 0x0

    .line 768
    invoke-virtual {v1}, Lorg/spongycastle/asn1/ASN1Set;->d()I

    move-result v16

    if-lez v16, :cond_30

    .line 770
    const/4 v9, 0x0

    invoke-virtual {v1, v9}, Lorg/spongycastle/asn1/ASN1Set;->a(I)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v1

    check-cast v1, Lorg/spongycastle/asn1/ASN1Primitive;

    .line 772
    invoke-interface {v3, v2}, Lorg/spongycastle/jce/interfaces/PKCS12BagAttributeCarrier;->a(Lorg/spongycastle/asn1/DERObjectIdentifier;)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v9

    .line 773
    if-eqz v9, :cond_7

    .line 776
    invoke-interface {v9}, Lorg/spongycastle/asn1/ASN1Encodable;->a()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v9

    invoke-virtual {v9, v1}, Lorg/spongycastle/asn1/ASN1Primitive;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_8

    .line 778
    new-instance v1, Ljava/io/IOException;

    const-string v2, "attempt to add existing attribute with different value"

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 784
    :cond_7
    invoke-interface {v3, v2, v1}, Lorg/spongycastle/jce/interfaces/PKCS12BagAttributeCarrier;->a(Lorg/spongycastle/asn1/ASN1ObjectIdentifier;Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 788
    :cond_8
    :goto_4
    sget-object v9, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->af:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v2, v9}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_9

    .line 790
    check-cast v1, Lorg/spongycastle/asn1/DERBMPString;

    invoke-virtual {v1}, Lorg/spongycastle/asn1/DERBMPString;->o_()Ljava/lang/String;

    move-result-object v1

    .line 791
    move-object/from16 v0, p0

    iget-object v2, v0, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->bB:Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore$b;

    invoke-virtual {v2, v1, v4}, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore$b;->a(Ljava/lang/String;Ljava/lang/Object;)V

    move-object v8, v1

    goto :goto_3

    .line 793
    :cond_9
    sget-object v9, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->ag:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v2, v9}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2f

    .line 795
    check-cast v1, Lorg/spongycastle/asn1/ASN1OctetString;

    :goto_5
    move-object v6, v1

    .line 797
    goto :goto_3

    :cond_a
    move-object v8, v1

    .line 800
    :cond_b
    if-eqz v6, :cond_d

    .line 802
    new-instance v1, Ljava/lang/String;

    invoke-virtual {v6}, Lorg/spongycastle/asn1/ASN1OctetString;->d()[B

    move-result-object v2

    invoke-static {v2}, Lorg/spongycastle/util/encoders/Hex;->a([B)[B

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/String;-><init>([B)V

    .line 804
    if-nez v8, :cond_c

    .line 806
    move-object/from16 v0, p0

    iget-object v2, v0, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->bB:Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore$b;

    invoke-virtual {v2, v1, v4}, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore$b;->a(Ljava/lang/String;Ljava/lang/Object;)V

    move v1, v10

    .line 743
    :goto_6
    add-int/lit8 v2, v11, 0x1

    move v11, v2

    move v10, v1

    goto/16 :goto_2

    .line 810
    :cond_c
    move-object/from16 v0, p0

    iget-object v2, v0, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->bC:Ljava/util/Hashtable;

    invoke-virtual {v2, v8, v1}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move v1, v10

    .line 812
    goto :goto_6

    .line 815
    :cond_d
    const/4 v1, 0x1

    .line 816
    move-object/from16 v0, p0

    iget-object v2, v0, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->bB:Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore$b;

    const-string v3, "unmarked"

    invoke-virtual {v2, v3, v4}, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore$b;->a(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_6

    .line 819
    :cond_e
    invoke-virtual {v2}, Lorg/spongycastle/asn1/pkcs/SafeBag;->c()Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    move-result-object v1

    sget-object v3, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->bl:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v1, v3}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_f

    .line 821
    invoke-virtual {v13, v2}, Ljava/util/Vector;->addElement(Ljava/lang/Object;)V

    move v1, v10

    goto :goto_6

    .line 825
    :cond_f
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "extra in data "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Lorg/spongycastle/asn1/pkcs/SafeBag;->c()Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 826
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-static {v2}, Lorg/spongycastle/asn1/util/ASN1Dump;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    move v1, v10

    goto :goto_6

    .line 830
    :cond_10
    aget-object v1, v14, v12

    invoke-virtual {v1}, Lorg/spongycastle/asn1/pkcs/ContentInfo;->c()Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    move-result-object v1

    sget-object v2, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->R:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v1, v2}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1e

    .line 832
    aget-object v1, v14, v12

    invoke-virtual {v1}, Lorg/spongycastle/asn1/pkcs/ContentInfo;->d()Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v1

    invoke-static {v1}, Lorg/spongycastle/asn1/pkcs/EncryptedData;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/pkcs/EncryptedData;

    move-result-object v1

    .line 833
    const/4 v2, 0x0

    invoke-virtual {v1}, Lorg/spongycastle/asn1/pkcs/EncryptedData;->c()Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;

    move-result-object v3

    invoke-virtual {v1}, Lorg/spongycastle/asn1/pkcs/EncryptedData;->d()Lorg/spongycastle/asn1/ASN1OctetString;

    move-result-object v1

    invoke-virtual {v1}, Lorg/spongycastle/asn1/ASN1OctetString;->d()[B

    move-result-object v1

    move-object/from16 v0, p2

    invoke-static {v2, v3, v0, v7, v1}, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->a(ZLorg/spongycastle/asn1/x509/AlgorithmIdentifier;[CZ[B)[B

    move-result-object v1

    .line 835
    invoke-static {v1}, Lorg/spongycastle/asn1/ASN1Primitive;->a([B)Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Lorg/spongycastle/asn1/ASN1Sequence;

    .line 837
    const/4 v1, 0x0

    move v11, v1

    :goto_7
    invoke-virtual {v5}, Lorg/spongycastle/asn1/ASN1Sequence;->e()I

    move-result v1

    if-eq v11, v1, :cond_1f

    .line 839
    invoke-virtual {v5, v11}, Lorg/spongycastle/asn1/ASN1Sequence;->a(I)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v1

    invoke-static {v1}, Lorg/spongycastle/asn1/pkcs/SafeBag;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/pkcs/SafeBag;

    move-result-object v2

    .line 841
    invoke-virtual {v2}, Lorg/spongycastle/asn1/pkcs/SafeBag;->c()Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    move-result-object v1

    sget-object v3, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->bl:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v1, v3}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_11

    .line 843
    invoke-virtual {v13, v2}, Ljava/util/Vector;->addElement(Ljava/lang/Object;)V

    .line 837
    :goto_8
    add-int/lit8 v1, v11, 0x1

    move v11, v1

    goto :goto_7

    .line 845
    :cond_11
    invoke-virtual {v2}, Lorg/spongycastle/asn1/pkcs/SafeBag;->c()Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    move-result-object v1

    sget-object v3, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->bk:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v1, v3}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_17

    .line 847
    invoke-virtual {v2}, Lorg/spongycastle/asn1/pkcs/SafeBag;->d()Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v1

    invoke-static {v1}, Lorg/spongycastle/asn1/pkcs/EncryptedPrivateKeyInfo;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/pkcs/EncryptedPrivateKeyInfo;

    move-result-object v1

    .line 848
    invoke-virtual {v1}, Lorg/spongycastle/asn1/pkcs/EncryptedPrivateKeyInfo;->c()Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;

    move-result-object v3

    invoke-virtual {v1}, Lorg/spongycastle/asn1/pkcs/EncryptedPrivateKeyInfo;->d()[B

    move-result-object v1

    move-object/from16 v0, p2

    invoke-static {v3, v1, v0, v7}, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->a(Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;[B[CZ)Ljava/security/PrivateKey;

    move-result-object v4

    move-object v3, v4

    .line 853
    check-cast v3, Lorg/spongycastle/jce/interfaces/PKCS12BagAttributeCarrier;

    .line 854
    const/4 v1, 0x0

    .line 855
    const/4 v6, 0x0

    .line 857
    invoke-virtual {v2}, Lorg/spongycastle/asn1/pkcs/SafeBag;->e()Lorg/spongycastle/asn1/ASN1Set;

    move-result-object v2

    invoke-virtual {v2}, Lorg/spongycastle/asn1/ASN1Set;->c()Ljava/util/Enumeration;

    move-result-object v15

    move-object v8, v1

    .line 858
    :goto_9
    invoke-interface {v15}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v1

    if-eqz v1, :cond_15

    .line 860
    invoke-interface {v15}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/spongycastle/asn1/ASN1Sequence;

    .line 861
    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lorg/spongycastle/asn1/ASN1Sequence;->a(I)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v2

    check-cast v2, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    .line 862
    const/4 v9, 0x1

    invoke-virtual {v1, v9}, Lorg/spongycastle/asn1/ASN1Sequence;->a(I)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v1

    check-cast v1, Lorg/spongycastle/asn1/ASN1Set;

    .line 863
    const/4 v9, 0x0

    .line 865
    invoke-virtual {v1}, Lorg/spongycastle/asn1/ASN1Set;->d()I

    move-result v16

    if-lez v16, :cond_2e

    .line 867
    const/4 v9, 0x0

    invoke-virtual {v1, v9}, Lorg/spongycastle/asn1/ASN1Set;->a(I)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v1

    check-cast v1, Lorg/spongycastle/asn1/ASN1Primitive;

    .line 869
    invoke-interface {v3, v2}, Lorg/spongycastle/jce/interfaces/PKCS12BagAttributeCarrier;->a(Lorg/spongycastle/asn1/DERObjectIdentifier;)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v9

    .line 870
    if-eqz v9, :cond_12

    .line 873
    invoke-interface {v9}, Lorg/spongycastle/asn1/ASN1Encodable;->a()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v9

    invoke-virtual {v9, v1}, Lorg/spongycastle/asn1/ASN1Primitive;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_13

    .line 875
    new-instance v1, Ljava/io/IOException;

    const-string v2, "attempt to add existing attribute with different value"

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 881
    :cond_12
    invoke-interface {v3, v2, v1}, Lorg/spongycastle/jce/interfaces/PKCS12BagAttributeCarrier;->a(Lorg/spongycastle/asn1/ASN1ObjectIdentifier;Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 885
    :cond_13
    :goto_a
    sget-object v9, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->af:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v2, v9}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_14

    .line 887
    check-cast v1, Lorg/spongycastle/asn1/DERBMPString;

    invoke-virtual {v1}, Lorg/spongycastle/asn1/DERBMPString;->o_()Ljava/lang/String;

    move-result-object v1

    .line 888
    move-object/from16 v0, p0

    iget-object v2, v0, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->bB:Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore$b;

    invoke-virtual {v2, v1, v4}, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore$b;->a(Ljava/lang/String;Ljava/lang/Object;)V

    move-object v8, v1

    goto :goto_9

    .line 890
    :cond_14
    sget-object v9, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->ag:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v2, v9}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2d

    .line 892
    check-cast v1, Lorg/spongycastle/asn1/ASN1OctetString;

    :goto_b
    move-object v6, v1

    .line 894
    goto :goto_9

    .line 896
    :cond_15
    new-instance v1, Ljava/lang/String;

    invoke-virtual {v6}, Lorg/spongycastle/asn1/ASN1OctetString;->d()[B

    move-result-object v2

    invoke-static {v2}, Lorg/spongycastle/util/encoders/Hex;->a([B)[B

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/String;-><init>([B)V

    .line 898
    if-nez v8, :cond_16

    .line 900
    move-object/from16 v0, p0

    iget-object v2, v0, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->bB:Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore$b;

    invoke-virtual {v2, v1, v4}, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore$b;->a(Ljava/lang/String;Ljava/lang/Object;)V

    goto/16 :goto_8

    .line 904
    :cond_16
    move-object/from16 v0, p0

    iget-object v2, v0, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->bC:Ljava/util/Hashtable;

    invoke-virtual {v2, v8, v1}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_8

    .line 907
    :cond_17
    invoke-virtual {v2}, Lorg/spongycastle/asn1/pkcs/SafeBag;->c()Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    move-result-object v1

    sget-object v3, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->bj:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v1, v3}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1d

    .line 909
    new-instance v3, Lorg/spongycastle/asn1/pkcs/PrivateKeyInfo;

    invoke-virtual {v2}, Lorg/spongycastle/asn1/pkcs/SafeBag;->d()Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v1

    check-cast v1, Lorg/spongycastle/asn1/ASN1Sequence;

    invoke-direct {v3, v1}, Lorg/spongycastle/asn1/pkcs/PrivateKeyInfo;-><init>(Lorg/spongycastle/asn1/ASN1Sequence;)V

    .line 910
    invoke-static {v3}, Lorg/spongycastle/jce/provider/BouncyCastleProvider;->a(Lorg/spongycastle/asn1/pkcs/PrivateKeyInfo;)Ljava/security/PrivateKey;

    move-result-object v4

    move-object v3, v4

    .line 915
    check-cast v3, Lorg/spongycastle/jce/interfaces/PKCS12BagAttributeCarrier;

    .line 916
    const/4 v1, 0x0

    .line 917
    const/4 v6, 0x0

    .line 919
    invoke-virtual {v2}, Lorg/spongycastle/asn1/pkcs/SafeBag;->e()Lorg/spongycastle/asn1/ASN1Set;

    move-result-object v2

    invoke-virtual {v2}, Lorg/spongycastle/asn1/ASN1Set;->c()Ljava/util/Enumeration;

    move-result-object v15

    move-object v8, v1

    .line 920
    :goto_c
    invoke-interface {v15}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v1

    if-eqz v1, :cond_1b

    .line 922
    invoke-interface {v15}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/spongycastle/asn1/ASN1Sequence;

    .line 923
    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lorg/spongycastle/asn1/ASN1Sequence;->a(I)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v2

    check-cast v2, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    .line 924
    const/4 v9, 0x1

    invoke-virtual {v1, v9}, Lorg/spongycastle/asn1/ASN1Sequence;->a(I)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v1

    check-cast v1, Lorg/spongycastle/asn1/ASN1Set;

    .line 925
    const/4 v9, 0x0

    .line 927
    invoke-virtual {v1}, Lorg/spongycastle/asn1/ASN1Set;->d()I

    move-result v16

    if-lez v16, :cond_2c

    .line 929
    const/4 v9, 0x0

    invoke-virtual {v1, v9}, Lorg/spongycastle/asn1/ASN1Set;->a(I)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v1

    check-cast v1, Lorg/spongycastle/asn1/ASN1Primitive;

    .line 931
    invoke-interface {v3, v2}, Lorg/spongycastle/jce/interfaces/PKCS12BagAttributeCarrier;->a(Lorg/spongycastle/asn1/DERObjectIdentifier;)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v9

    .line 932
    if-eqz v9, :cond_18

    .line 935
    invoke-interface {v9}, Lorg/spongycastle/asn1/ASN1Encodable;->a()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v9

    invoke-virtual {v9, v1}, Lorg/spongycastle/asn1/ASN1Primitive;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_19

    .line 937
    new-instance v1, Ljava/io/IOException;

    const-string v2, "attempt to add existing attribute with different value"

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 943
    :cond_18
    invoke-interface {v3, v2, v1}, Lorg/spongycastle/jce/interfaces/PKCS12BagAttributeCarrier;->a(Lorg/spongycastle/asn1/ASN1ObjectIdentifier;Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 947
    :cond_19
    :goto_d
    sget-object v9, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->af:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v2, v9}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1a

    .line 949
    check-cast v1, Lorg/spongycastle/asn1/DERBMPString;

    invoke-virtual {v1}, Lorg/spongycastle/asn1/DERBMPString;->o_()Ljava/lang/String;

    move-result-object v1

    .line 950
    move-object/from16 v0, p0

    iget-object v2, v0, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->bB:Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore$b;

    invoke-virtual {v2, v1, v4}, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore$b;->a(Ljava/lang/String;Ljava/lang/Object;)V

    move-object v8, v1

    goto :goto_c

    .line 952
    :cond_1a
    sget-object v9, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->ag:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v2, v9}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2b

    .line 954
    check-cast v1, Lorg/spongycastle/asn1/ASN1OctetString;

    :goto_e
    move-object v6, v1

    .line 956
    goto :goto_c

    .line 958
    :cond_1b
    new-instance v1, Ljava/lang/String;

    invoke-virtual {v6}, Lorg/spongycastle/asn1/ASN1OctetString;->d()[B

    move-result-object v2

    invoke-static {v2}, Lorg/spongycastle/util/encoders/Hex;->a([B)[B

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/String;-><init>([B)V

    .line 960
    if-nez v8, :cond_1c

    .line 962
    move-object/from16 v0, p0

    iget-object v2, v0, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->bB:Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore$b;

    invoke-virtual {v2, v1, v4}, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore$b;->a(Ljava/lang/String;Ljava/lang/Object;)V

    goto/16 :goto_8

    .line 966
    :cond_1c
    move-object/from16 v0, p0

    iget-object v2, v0, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->bC:Ljava/util/Hashtable;

    invoke-virtual {v2, v8, v1}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_8

    .line 971
    :cond_1d
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "extra in encryptedData "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Lorg/spongycastle/asn1/pkcs/SafeBag;->c()Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 972
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-static {v2}, Lorg/spongycastle/asn1/util/ASN1Dump;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    goto/16 :goto_8

    .line 978
    :cond_1e
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "extra "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    aget-object v3, v14, v12

    invoke-virtual {v3}, Lorg/spongycastle/asn1/pkcs/ContentInfo;->c()Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    move-result-object v3

    invoke-virtual {v3}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 979
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "extra "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    aget-object v3, v14, v12

    invoke-virtual {v3}, Lorg/spongycastle/asn1/pkcs/ContentInfo;->d()Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v3

    invoke-static {v3}, Lorg/spongycastle/asn1/util/ASN1Dump;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 736
    :cond_1f
    add-int/lit8 v1, v12, 0x1

    move v12, v1

    goto/16 :goto_1

    .line 984
    :cond_20
    new-instance v1, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore$b;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore$b;-><init>(B)V

    move-object/from16 v0, p0

    iput-object v1, v0, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->bD:Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore$b;

    .line 985
    new-instance v1, Ljava/util/Hashtable;

    invoke-direct {v1}, Ljava/util/Hashtable;-><init>()V

    move-object/from16 v0, p0

    iput-object v1, v0, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->bE:Ljava/util/Hashtable;

    .line 986
    new-instance v1, Ljava/util/Hashtable;

    invoke-direct {v1}, Ljava/util/Hashtable;-><init>()V

    move-object/from16 v0, p0

    iput-object v1, v0, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->bF:Ljava/util/Hashtable;

    .line 988
    const/4 v1, 0x0

    move v5, v1

    :goto_f
    invoke-virtual {v13}, Ljava/util/Vector;->size()I

    move-result v1

    if-eq v5, v1, :cond_0

    .line 990
    invoke-virtual {v13, v5}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/spongycastle/asn1/pkcs/SafeBag;

    .line 991
    invoke-virtual {v1}, Lorg/spongycastle/asn1/pkcs/SafeBag;->d()Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v2

    invoke-static {v2}, Lorg/spongycastle/asn1/pkcs/CertBag;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/pkcs/CertBag;

    move-result-object v2

    .line 993
    invoke-virtual {v2}, Lorg/spongycastle/asn1/pkcs/CertBag;->c()Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    move-result-object v3

    sget-object v4, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->aj:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v3, v4}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_21

    .line 995
    new-instance v1, Ljava/lang/RuntimeException;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Unsupported certificate type: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Lorg/spongycastle/asn1/pkcs/CertBag;->c()Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 1002
    :cond_21
    :try_start_2
    new-instance v3, Ljava/io/ByteArrayInputStream;

    invoke-virtual {v2}, Lorg/spongycastle/asn1/pkcs/CertBag;->d()Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v2

    check-cast v2, Lorg/spongycastle/asn1/ASN1OctetString;

    invoke-virtual {v2}, Lorg/spongycastle/asn1/ASN1OctetString;->d()[B

    move-result-object v2

    invoke-direct {v3, v2}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 1004
    move-object/from16 v0, p0

    iget-object v2, v0, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->bG:Ljava/security/cert/CertificateFactory;

    invoke-virtual {v2, v3}, Ljava/security/cert/CertificateFactory;->generateCertificate(Ljava/io/InputStream;)Ljava/security/cert/Certificate;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    move-result-object v4

    .line 1014
    const/4 v6, 0x0

    .line 1015
    const/4 v2, 0x0

    .line 1017
    invoke-virtual {v1}, Lorg/spongycastle/asn1/pkcs/SafeBag;->e()Lorg/spongycastle/asn1/ASN1Set;

    move-result-object v3

    if-eqz v3, :cond_25

    .line 1019
    invoke-virtual {v1}, Lorg/spongycastle/asn1/pkcs/SafeBag;->e()Lorg/spongycastle/asn1/ASN1Set;

    move-result-object v1

    invoke-virtual {v1}, Lorg/spongycastle/asn1/ASN1Set;->c()Ljava/util/Enumeration;

    move-result-object v8

    move-object v7, v2

    .line 1020
    :goto_10
    invoke-interface {v8}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v1

    if-eqz v1, :cond_26

    .line 1022
    invoke-interface {v8}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/spongycastle/asn1/ASN1Sequence;

    .line 1023
    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lorg/spongycastle/asn1/ASN1Sequence;->a(I)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v2

    check-cast v2, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    .line 1024
    const/4 v3, 0x1

    invoke-virtual {v1, v3}, Lorg/spongycastle/asn1/ASN1Sequence;->a(I)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v1

    check-cast v1, Lorg/spongycastle/asn1/ASN1Set;

    const/4 v3, 0x0

    invoke-virtual {v1, v3}, Lorg/spongycastle/asn1/ASN1Set;->a(I)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v1

    check-cast v1, Lorg/spongycastle/asn1/ASN1Primitive;

    .line 1025
    instance-of v3, v4, Lorg/spongycastle/jce/interfaces/PKCS12BagAttributeCarrier;

    if-eqz v3, :cond_23

    move-object v3, v4

    .line 1029
    check-cast v3, Lorg/spongycastle/jce/interfaces/PKCS12BagAttributeCarrier;

    .line 1031
    invoke-interface {v3, v2}, Lorg/spongycastle/jce/interfaces/PKCS12BagAttributeCarrier;->a(Lorg/spongycastle/asn1/DERObjectIdentifier;)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v9

    .line 1032
    if-eqz v9, :cond_22

    .line 1035
    invoke-interface {v9}, Lorg/spongycastle/asn1/ASN1Encodable;->a()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v3

    invoke-virtual {v3, v1}, Lorg/spongycastle/asn1/ASN1Primitive;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_23

    .line 1037
    new-instance v1, Ljava/io/IOException;

    const-string v2, "attempt to add existing attribute with different value"

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 1006
    :catch_2
    move-exception v1

    .line 1008
    new-instance v2, Ljava/lang/RuntimeException;

    invoke-virtual {v1}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 1043
    :cond_22
    invoke-interface {v3, v2, v1}, Lorg/spongycastle/jce/interfaces/PKCS12BagAttributeCarrier;->a(Lorg/spongycastle/asn1/ASN1ObjectIdentifier;Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 1047
    :cond_23
    sget-object v3, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->af:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v2, v3}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_24

    .line 1049
    check-cast v1, Lorg/spongycastle/asn1/DERBMPString;

    invoke-virtual {v1}, Lorg/spongycastle/asn1/DERBMPString;->o_()Ljava/lang/String;

    move-result-object v1

    move-object v7, v1

    goto :goto_10

    .line 1051
    :cond_24
    sget-object v3, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->ag:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v2, v3}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2a

    .line 1053
    check-cast v1, Lorg/spongycastle/asn1/ASN1OctetString;

    :goto_11
    move-object v6, v1

    .line 1055
    goto :goto_10

    :cond_25
    move-object v7, v2

    .line 1058
    :cond_26
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->bE:Ljava/util/Hashtable;

    new-instance v2, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore$a;

    invoke-virtual {v4}, Ljava/security/cert/Certificate;->getPublicKey()Ljava/security/PublicKey;

    move-result-object v3

    move-object/from16 v0, p0

    invoke-direct {v2, v0, v3}, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore$a;-><init>(Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;Ljava/security/PublicKey;)V

    invoke-virtual {v1, v2, v4}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1060
    if-eqz v10, :cond_28

    .line 1062
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->bF:Ljava/util/Hashtable;

    invoke-virtual {v1}, Ljava/util/Hashtable;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_27

    .line 1064
    new-instance v1, Ljava/lang/String;

    invoke-virtual {v4}, Ljava/security/cert/Certificate;->getPublicKey()Ljava/security/PublicKey;

    move-result-object v2

    invoke-static {v2}, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->b(Ljava/security/PublicKey;)Lorg/spongycastle/asn1/x509/SubjectKeyIdentifier;

    move-result-object v2

    invoke-virtual {v2}, Lorg/spongycastle/asn1/x509/SubjectKeyIdentifier;->c()[B

    move-result-object v2

    invoke-static {v2}, Lorg/spongycastle/util/encoders/Hex;->a([B)[B

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/String;-><init>([B)V

    .line 1066
    move-object/from16 v0, p0

    iget-object v2, v0, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->bF:Ljava/util/Hashtable;

    invoke-virtual {v2, v1, v4}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1067
    move-object/from16 v0, p0

    iget-object v2, v0, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->bB:Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore$b;

    move-object/from16 v0, p0

    iget-object v3, v0, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->bB:Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore$b;

    const-string v4, "unmarked"

    invoke-virtual {v3, v4}, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore$b;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v1, v3}, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore$b;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 988
    :cond_27
    :goto_12
    add-int/lit8 v1, v5, 0x1

    move v5, v1

    goto/16 :goto_f

    .line 1075
    :cond_28
    if-eqz v6, :cond_29

    .line 1077
    new-instance v1, Ljava/lang/String;

    invoke-virtual {v6}, Lorg/spongycastle/asn1/ASN1OctetString;->d()[B

    move-result-object v2

    invoke-static {v2}, Lorg/spongycastle/util/encoders/Hex;->a([B)[B

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/String;-><init>([B)V

    .line 1079
    move-object/from16 v0, p0

    iget-object v2, v0, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->bF:Ljava/util/Hashtable;

    invoke-virtual {v2, v1, v4}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1081
    :cond_29
    if-eqz v7, :cond_27

    .line 1083
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->bD:Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore$b;

    invoke-virtual {v1, v7, v4}, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore$b;->a(Ljava/lang/String;Ljava/lang/Object;)V

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

    .prologue
    .line 475
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->bB:Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore$b;

    invoke-virtual {v0, p1}, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore$b;->b(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 477
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

    .line 480
    :cond_0
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->bD:Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore$b;

    invoke-virtual {v0, p1, p2}, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore$b;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 481
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->bE:Ljava/util/Hashtable;

    new-instance v1, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore$a;

    invoke-virtual {p2}, Ljava/security/cert/Certificate;->getPublicKey()Ljava/security/PublicKey;

    move-result-object v2

    invoke-direct {v1, p0, v2}, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore$a;-><init>(Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;Ljava/security/PublicKey;)V

    invoke-virtual {v0, v1, p2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 482
    return-void
.end method

.method public engineSetKeyEntry(Ljava/lang/String;Ljava/security/Key;[C[Ljava/security/cert/Certificate;)V
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 500
    instance-of v1, p2, Ljava/security/PrivateKey;

    if-eqz v1, :cond_0

    if-nez p4, :cond_0

    .line 502
    new-instance v0, Ljava/security/KeyStoreException;

    const-string v1, "no certificate chain for private key"

    invoke-direct {v0, v1}, Ljava/security/KeyStoreException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 505
    :cond_0
    iget-object v1, p0, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->bB:Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore$b;

    invoke-virtual {v1, p1}, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore$b;->b(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 507
    invoke-virtual {p0, p1}, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->engineDeleteEntry(Ljava/lang/String;)V

    .line 510
    :cond_1
    iget-object v1, p0, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->bB:Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore$b;

    invoke-virtual {v1, p1, p2}, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore$b;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 511
    iget-object v1, p0, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->bD:Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore$b;

    aget-object v2, p4, v0

    invoke-virtual {v1, p1, v2}, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore$b;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 513
    :goto_0
    array-length v1, p4

    if-eq v0, v1, :cond_2

    .line 515
    iget-object v1, p0, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->bE:Ljava/util/Hashtable;

    new-instance v2, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore$a;

    aget-object v3, p4, v0

    invoke-virtual {v3}, Ljava/security/cert/Certificate;->getPublicKey()Ljava/security/PublicKey;

    move-result-object v3

    invoke-direct {v2, p0, v3}, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore$a;-><init>(Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;Ljava/security/PublicKey;)V

    aget-object v3, p4, v0

    invoke-virtual {v1, v2, v3}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 513
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 517
    :cond_2
    return-void
.end method

.method public engineSetKeyEntry(Ljava/lang/String;[B[Ljava/security/cert/Certificate;)V
    .locals 2

    .prologue
    .line 490
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "operation not supported"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public engineSize()I
    .locals 4

    .prologue
    .line 521
    new-instance v1, Ljava/util/Hashtable;

    invoke-direct {v1}, Ljava/util/Hashtable;-><init>()V

    .line 523
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->bD:Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore$b;

    invoke-virtual {v0}, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore$b;->a()Ljava/util/Enumeration;

    move-result-object v0

    .line 524
    :goto_0
    invoke-interface {v0}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 526
    invoke-interface {v0}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v2

    const-string v3, "cert"

    invoke-virtual {v1, v2, v3}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 529
    :cond_0
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->bB:Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore$b;

    invoke-virtual {v0}, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore$b;->a()Ljava/util/Enumeration;

    move-result-object v2

    .line 530
    :cond_1
    :goto_1
    invoke-interface {v2}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 532
    invoke-interface {v2}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 533
    invoke-virtual {v1, v0}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-nez v3, :cond_1

    .line 535
    const-string v3, "key"

    invoke-virtual {v1, v0, v3}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 539
    :cond_2
    invoke-virtual {v1}, Ljava/util/Hashtable;->size()I

    move-result v0

    return v0
.end method

.method public engineStore(Ljava/io/OutputStream;[C)V
    .locals 1

    .prologue
    .line 1127
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->a(Ljava/io/OutputStream;[CZ)V

    .line 1128
    return-void
.end method

.method public engineStore(Ljava/security/KeyStore$LoadStoreParameter;)V
    .locals 4

    .prologue
    .line 1092
    if-nez p1, :cond_0

    .line 1094
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "\'param\' arg cannot be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1097
    :cond_0
    instance-of v0, p1, Lorg/spongycastle/jce/provider/JDKPKCS12StoreParameter;

    if-nez v0, :cond_1

    .line 1099
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

    .line 1103
    check-cast v0, Lorg/spongycastle/jce/provider/JDKPKCS12StoreParameter;

    .line 1106
    invoke-interface {p1}, Ljava/security/KeyStore$LoadStoreParameter;->getProtectionParameter()Ljava/security/KeyStore$ProtectionParameter;

    move-result-object v1

    .line 1107
    if-nez v1, :cond_2

    .line 1109
    const/4 v1, 0x0

    .line 1121
    :goto_0
    invoke-virtual {v0}, Lorg/spongycastle/jce/provider/JDKPKCS12StoreParameter;->a()Ljava/io/OutputStream;

    move-result-object v2

    invoke-virtual {v0}, Lorg/spongycastle/jce/provider/JDKPKCS12StoreParameter;->b()Z

    move-result v0

    invoke-direct {p0, v2, v1, v0}, Lorg/spongycastle/jce/provider/JDKPKCS12KeyStore;->a(Ljava/io/OutputStream;[CZ)V

    .line 1122
    return-void

    .line 1111
    :cond_2
    instance-of v2, v1, Ljava/security/KeyStore$PasswordProtection;

    if-eqz v2, :cond_3

    .line 1113
    check-cast v1, Ljava/security/KeyStore$PasswordProtection;

    invoke-virtual {v1}, Ljava/security/KeyStore$PasswordProtection;->getPassword()[C

    move-result-object v1

    goto :goto_0

    .line 1117
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
