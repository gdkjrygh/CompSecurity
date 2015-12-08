.class final Lorg/bouncycastle/openssl/a;
.super Ljava/lang/Object;


# static fields
.field private static final a:Ljava/util/Map;

.field private static final b:Ljava/util/Set;

.field private static final c:Ljava/util/Set;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    const/16 v4, 0xc0

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lorg/bouncycastle/openssl/a;->a:Ljava/util/Map;

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    sput-object v0, Lorg/bouncycastle/openssl/a;->b:Ljava/util/Set;

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    sput-object v0, Lorg/bouncycastle/openssl/a;->c:Ljava/util/Set;

    sget-object v0, Lorg/bouncycastle/openssl/a;->b:Ljava/util/Set;

    sget-object v1, Lorg/bouncycastle/asn1/pkcs/PKCSObjectIdentifiers;->s_:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    sget-object v0, Lorg/bouncycastle/openssl/a;->b:Ljava/util/Set;

    sget-object v1, Lorg/bouncycastle/asn1/pkcs/PKCSObjectIdentifiers;->t:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    sget-object v0, Lorg/bouncycastle/openssl/a;->b:Ljava/util/Set;

    sget-object v1, Lorg/bouncycastle/asn1/pkcs/PKCSObjectIdentifiers;->u:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    sget-object v0, Lorg/bouncycastle/openssl/a;->b:Ljava/util/Set;

    sget-object v1, Lorg/bouncycastle/asn1/pkcs/PKCSObjectIdentifiers;->v:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    sget-object v0, Lorg/bouncycastle/openssl/a;->b:Ljava/util/Set;

    sget-object v1, Lorg/bouncycastle/asn1/pkcs/PKCSObjectIdentifiers;->w:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    sget-object v0, Lorg/bouncycastle/openssl/a;->b:Ljava/util/Set;

    sget-object v1, Lorg/bouncycastle/asn1/pkcs/PKCSObjectIdentifiers;->x:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    sget-object v0, Lorg/bouncycastle/openssl/a;->c:Ljava/util/Set;

    sget-object v1, Lorg/bouncycastle/asn1/pkcs/PKCSObjectIdentifiers;->y:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    sget-object v0, Lorg/bouncycastle/openssl/a;->c:Ljava/util/Set;

    sget-object v1, Lorg/bouncycastle/asn1/pkcs/PKCSObjectIdentifiers;->B:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    sget-object v0, Lorg/bouncycastle/openssl/a;->c:Ljava/util/Set;

    sget-object v1, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->h:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    sget-object v0, Lorg/bouncycastle/openssl/a;->c:Ljava/util/Set;

    sget-object v1, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->o:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    sget-object v0, Lorg/bouncycastle/openssl/a;->c:Ljava/util/Set;

    sget-object v1, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->v:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    sget-object v0, Lorg/bouncycastle/openssl/a;->a:Ljava/util/Map;

    sget-object v1, Lorg/bouncycastle/asn1/pkcs/PKCSObjectIdentifiers;->B:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v1}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;->e()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/Integer;

    invoke-direct {v2, v4}, Ljava/lang/Integer;-><init>(I)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/openssl/a;->a:Ljava/util/Map;

    sget-object v1, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->h:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v1}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;->e()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/Integer;

    const/16 v3, 0x80

    invoke-direct {v2, v3}, Ljava/lang/Integer;-><init>(I)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/openssl/a;->a:Ljava/util/Map;

    sget-object v1, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->o:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v1}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;->e()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/Integer;

    invoke-direct {v2, v4}, Ljava/lang/Integer;-><init>(I)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/openssl/a;->a:Ljava/util/Map;

    sget-object v1, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->v:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v1}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;->e()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/Integer;

    const/16 v3, 0x100

    invoke-direct {v2, v3}, Ljava/lang/Integer;-><init>(I)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method static a(Ljava/lang/String;[C[BI)Ljavax/crypto/SecretKey;
    .locals 3

    new-instance v1, Lorg/bouncycastle/crypto/generators/PKCS5S2ParametersGenerator;

    invoke-direct {v1}, Lorg/bouncycastle/crypto/generators/PKCS5S2ParametersGenerator;-><init>()V

    invoke-static {p1}, Lorg/bouncycastle/crypto/PBEParametersGenerator;->PKCS5PasswordToBytes([C)[B

    move-result-object v0

    invoke-virtual {v1, v0, p2, p3}, Lorg/bouncycastle/crypto/PBEParametersGenerator;->init([B[BI)V

    new-instance v2, Ljavax/crypto/spec/SecretKeySpec;

    sget-object v0, Lorg/bouncycastle/openssl/a;->a:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "no key size for algorithm: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    sget-object v0, Lorg/bouncycastle/openssl/a;->a:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {v1, v0}, Lorg/bouncycastle/crypto/PBEParametersGenerator;->generateDerivedParameters(I)Lorg/bouncycastle/crypto/CipherParameters;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/crypto/params/KeyParameter;

    invoke-virtual {v0}, Lorg/bouncycastle/crypto/params/KeyParameter;->getKey()[B

    move-result-object v0

    invoke-direct {v2, v0, p0}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    return-object v2
.end method

.method private static a([CLjava/lang/String;I[B)Ljavax/crypto/SecretKey;
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, p1, p2, p3, v0}, Lorg/bouncycastle/openssl/a;->a([CLjava/lang/String;I[BZ)Ljavax/crypto/SecretKey;

    move-result-object v0

    return-object v0
.end method

.method private static a([CLjava/lang/String;I[BZ)Ljavax/crypto/SecretKey;
    .locals 4

    new-instance v0, Lorg/bouncycastle/crypto/generators/OpenSSLPBEParametersGenerator;

    invoke-direct {v0}, Lorg/bouncycastle/crypto/generators/OpenSSLPBEParametersGenerator;-><init>()V

    invoke-static {p0}, Lorg/bouncycastle/crypto/PBEParametersGenerator;->PKCS5PasswordToBytes([C)[B

    move-result-object v1

    invoke-virtual {v0, v1, p3}, Lorg/bouncycastle/crypto/generators/OpenSSLPBEParametersGenerator;->init([B[B)V

    mul-int/lit8 v1, p2, 0x8

    invoke-virtual {v0, v1}, Lorg/bouncycastle/crypto/generators/OpenSSLPBEParametersGenerator;->generateDerivedParameters(I)Lorg/bouncycastle/crypto/CipherParameters;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/crypto/params/KeyParameter;

    invoke-virtual {v0}, Lorg/bouncycastle/crypto/params/KeyParameter;->getKey()[B

    move-result-object v0

    if-eqz p4, :cond_0

    array-length v1, v0

    const/16 v2, 0x18

    if-lt v1, v2, :cond_0

    const/4 v1, 0x0

    const/16 v2, 0x10

    const/16 v3, 0x8

    invoke-static {v0, v1, v0, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_0
    new-instance v1, Ljavax/crypto/spec/SecretKeySpec;

    invoke-direct {v1, v0, p1}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    return-object v1
.end method

.method static a(Lorg/bouncycastle/asn1/DERObjectIdentifier;)Z
    .locals 1

    sget-object v0, Lorg/bouncycastle/openssl/a;->c:Ljava/util/Set;

    invoke-interface {v0, p0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method static a(Ljava/security/Provider;[B[CLjava/lang/String;[B)[B
    .locals 9

    const/16 v5, 0x80

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/16 v7, 0x8

    new-instance v2, Ljavax/crypto/spec/IvParameterSpec;

    invoke-direct {v2, p4}, Ljavax/crypto/spec/IvParameterSpec;-><init>([B)V

    const-string v1, "CBC"

    const-string v0, "PKCS5Padding"

    const-string v6, "-CFB"

    invoke-virtual {p3, v6}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_0

    const-string v1, "CFB"

    const-string v0, "NoPadding"

    :cond_0
    const-string v6, "-ECB"

    invoke-virtual {p3, v6}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v6

    if-nez v6, :cond_1

    const-string v6, "DES-EDE"

    invoke-virtual {v6, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_1

    const-string v6, "DES-EDE3"

    invoke-virtual {v6, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    :cond_1
    const-string v1, "ECB"

    const/4 v2, 0x0

    :cond_2
    const-string v6, "-OFB"

    invoke-virtual {p3, v6}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_3

    const-string v1, "OFB"

    const-string v0, "NoPadding"

    :cond_3
    const-string v6, "DES-EDE"

    invoke-virtual {p3, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_5

    const-string v5, "DESede"

    const-string v6, "DES-EDE3"

    invoke-virtual {p3, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v6

    if-nez v6, :cond_4

    :goto_0
    const/16 v4, 0x18

    invoke-static {p2, v5, v4, p4, v3}, Lorg/bouncycastle/openssl/a;->a([CLjava/lang/String;I[BZ)Ljavax/crypto/SecretKey;

    move-result-object v3

    move-object v4, v3

    move-object v3, v2

    move-object v2, v5

    :goto_1
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v5, "/"

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "/"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :try_start_0
    invoke-static {v0, p0}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;Ljava/security/Provider;)Ljavax/crypto/Cipher;

    move-result-object v0

    if-nez v3, :cond_10

    const/4 v1, 0x1

    invoke-virtual {v0, v1, v4}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;)V

    :goto_2
    invoke-virtual {v0, p1}, Ljavax/crypto/Cipher;->doFinal([B)[B
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    :cond_4
    move v3, v4

    goto :goto_0

    :cond_5
    const-string v3, "DES-"

    invoke-virtual {p3, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_6

    const-string v3, "DES"

    invoke-static {p2, v3, v7, p4}, Lorg/bouncycastle/openssl/a;->a([CLjava/lang/String;I[B)Ljavax/crypto/SecretKey;

    move-result-object v4

    move-object v8, v3

    move-object v3, v2

    move-object v2, v8

    goto :goto_1

    :cond_6
    const-string v3, "BF-"

    invoke-virtual {p3, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_7

    const-string v3, "Blowfish"

    const/16 v4, 0x10

    invoke-static {p2, v3, v4, p4}, Lorg/bouncycastle/openssl/a;->a([CLjava/lang/String;I[B)Ljavax/crypto/SecretKey;

    move-result-object v4

    move-object v8, v3

    move-object v3, v2

    move-object v2, v8

    goto :goto_1

    :cond_7
    const-string v3, "RC2-"

    invoke-virtual {p3, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_a

    const-string v4, "RC2"

    const-string v3, "RC2-40-"

    invoke-virtual {p3, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_8

    const/16 v3, 0x28

    :goto_3
    div-int/lit8 v5, v3, 0x8

    invoke-static {p2, v4, v5, p4}, Lorg/bouncycastle/openssl/a;->a([CLjava/lang/String;I[B)Ljavax/crypto/SecretKey;

    move-result-object v5

    if-nez v2, :cond_9

    new-instance v2, Ljavax/crypto/spec/RC2ParameterSpec;

    invoke-direct {v2, v3}, Ljavax/crypto/spec/RC2ParameterSpec;-><init>(I)V

    move-object v3, v2

    move-object v2, v4

    move-object v4, v5

    goto :goto_1

    :cond_8
    const-string v3, "RC2-64-"

    invoke-virtual {p3, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_11

    const/16 v3, 0x40

    goto :goto_3

    :cond_9
    new-instance v2, Ljavax/crypto/spec/RC2ParameterSpec;

    invoke-direct {v2, v3, p4}, Ljavax/crypto/spec/RC2ParameterSpec;-><init>(I[B)V

    move-object v3, v2

    move-object v2, v4

    move-object v4, v5

    goto/16 :goto_1

    :cond_a
    const-string v3, "AES-"

    invoke-virtual {p3, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_f

    const-string v6, "AES"

    array-length v3, p4

    if-le v3, v7, :cond_b

    new-array v3, v7, [B

    invoke-static {p4, v4, v3, v4, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move-object p4, v3

    :cond_b
    const-string v3, "AES-128-"

    invoke-virtual {p3, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_c

    :goto_4
    const-string v3, "AES"

    div-int/lit8 v4, v5, 0x8

    invoke-static {p2, v3, v4, p4}, Lorg/bouncycastle/openssl/a;->a([CLjava/lang/String;I[B)Ljavax/crypto/SecretKey;

    move-result-object v3

    move-object v4, v3

    move-object v3, v2

    move-object v2, v6

    goto/16 :goto_1

    :cond_c
    const-string v3, "AES-192-"

    invoke-virtual {p3, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_d

    const/16 v5, 0xc0

    goto :goto_4

    :cond_d
    const-string v3, "AES-256-"

    invoke-virtual {p3, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_e

    const/16 v5, 0x100

    goto :goto_4

    :cond_e
    new-instance v0, Lorg/bouncycastle/openssl/EncryptionException;

    const-string v1, "unknown AES encryption with private key"

    invoke-direct {v0, v1}, Lorg/bouncycastle/openssl/EncryptionException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_f
    new-instance v0, Lorg/bouncycastle/openssl/EncryptionException;

    const-string v1, "unknown encryption with private key"

    invoke-direct {v0, v1}, Lorg/bouncycastle/openssl/EncryptionException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_10
    const/4 v1, 0x1

    :try_start_1
    invoke-virtual {v0, v1, v4, v3}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto/16 :goto_2

    :catch_0
    move-exception v0

    new-instance v1, Lorg/bouncycastle/openssl/EncryptionException;

    const-string v2, "exception using cipher - please check password and data."

    invoke-direct {v1, v2, v0}, Lorg/bouncycastle/openssl/EncryptionException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :cond_11
    move v3, v5

    goto/16 :goto_3
.end method

.method static b(Lorg/bouncycastle/asn1/DERObjectIdentifier;)Z
    .locals 2

    invoke-virtual {p0}, Lorg/bouncycastle/asn1/DERObjectIdentifier;->e()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lorg/bouncycastle/asn1/pkcs/PKCSObjectIdentifiers;->bp:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v1}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method
