.class public Lorg/bouncycastle/openssl/PKCS8Generator;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/bouncycastle/util/io/pem/PemObjectGenerator;


# static fields
.field public static final a:Ljava/lang/String;

.field public static final b:Ljava/lang/String;

.field public static final c:Ljava/lang/String;

.field public static final d:Ljava/lang/String;

.field public static final e:Ljava/lang/String;

.field public static final f:Ljava/lang/String;

.field public static final g:Ljava/lang/String;

.field public static final h:Ljava/lang/String;

.field public static final i:Ljava/lang/String;

.field public static final j:Ljava/lang/String;


# instance fields
.field private k:[C

.field private l:Ljava/lang/String;

.field private m:I

.field private n:Ljava/security/PrivateKey;

.field private o:Ljavax/crypto/Cipher;

.field private p:Ljava/security/SecureRandom;

.field private q:Ljava/security/AlgorithmParameterGenerator;

.field private r:Ljavax/crypto/SecretKeyFactory;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->h:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;->e()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lorg/bouncycastle/openssl/PKCS8Generator;->a:Ljava/lang/String;

    sget-object v0, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->o:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;->e()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lorg/bouncycastle/openssl/PKCS8Generator;->b:Ljava/lang/String;

    sget-object v0, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->v:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;->e()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lorg/bouncycastle/openssl/PKCS8Generator;->c:Ljava/lang/String;

    sget-object v0, Lorg/bouncycastle/asn1/pkcs/PKCSObjectIdentifiers;->B:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;->e()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lorg/bouncycastle/openssl/PKCS8Generator;->d:Ljava/lang/String;

    sget-object v0, Lorg/bouncycastle/asn1/pkcs/PKCSObjectIdentifiers;->bq:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;->e()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lorg/bouncycastle/openssl/PKCS8Generator;->e:Ljava/lang/String;

    sget-object v0, Lorg/bouncycastle/asn1/pkcs/PKCSObjectIdentifiers;->br:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;->e()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lorg/bouncycastle/openssl/PKCS8Generator;->f:Ljava/lang/String;

    sget-object v0, Lorg/bouncycastle/asn1/pkcs/PKCSObjectIdentifiers;->bs:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;->e()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lorg/bouncycastle/openssl/PKCS8Generator;->g:Ljava/lang/String;

    sget-object v0, Lorg/bouncycastle/asn1/pkcs/PKCSObjectIdentifiers;->bt:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;->e()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lorg/bouncycastle/openssl/PKCS8Generator;->h:Ljava/lang/String;

    sget-object v0, Lorg/bouncycastle/asn1/pkcs/PKCSObjectIdentifiers;->bu:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;->e()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lorg/bouncycastle/openssl/PKCS8Generator;->i:Ljava/lang/String;

    sget-object v0, Lorg/bouncycastle/asn1/pkcs/PKCSObjectIdentifiers;->bv:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;->e()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lorg/bouncycastle/openssl/PKCS8Generator;->j:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a()Lorg/bouncycastle/util/io/pem/PemObject;
    .locals 8

    const/16 v3, 0x14

    iget-object v0, p0, Lorg/bouncycastle/openssl/PKCS8Generator;->n:Ljava/security/PrivateKey;

    invoke-interface {v0}, Ljava/security/PrivateKey;->getEncoded()[B

    move-result-object v1

    iget-object v0, p0, Lorg/bouncycastle/openssl/PKCS8Generator;->l:Ljava/lang/String;

    if-nez v0, :cond_0

    new-instance v0, Lorg/bouncycastle/util/io/pem/PemObject;

    const-string v2, "PRIVATE KEY"

    invoke-direct {v0, v2, v1}, Lorg/bouncycastle/util/io/pem/PemObject;-><init>(Ljava/lang/String;[B)V

    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Lorg/bouncycastle/asn1/DERObjectIdentifier;

    iget-object v2, p0, Lorg/bouncycastle/openssl/PKCS8Generator;->l:Ljava/lang/String;

    invoke-direct {v0, v2}, Lorg/bouncycastle/asn1/DERObjectIdentifier;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lorg/bouncycastle/openssl/a;->a(Lorg/bouncycastle/asn1/DERObjectIdentifier;)Z

    move-result v2

    if-eqz v2, :cond_2

    new-array v0, v3, [B

    iget-object v2, p0, Lorg/bouncycastle/openssl/PKCS8Generator;->p:Ljava/security/SecureRandom;

    if-nez v2, :cond_1

    new-instance v2, Ljava/security/SecureRandom;

    invoke-direct {v2}, Ljava/security/SecureRandom;-><init>()V

    iput-object v2, p0, Lorg/bouncycastle/openssl/PKCS8Generator;->p:Ljava/security/SecureRandom;

    :cond_1
    iget-object v2, p0, Lorg/bouncycastle/openssl/PKCS8Generator;->p:Ljava/security/SecureRandom;

    invoke-virtual {v2, v0}, Ljava/security/SecureRandom;->nextBytes([B)V

    iget-object v2, p0, Lorg/bouncycastle/openssl/PKCS8Generator;->l:Ljava/lang/String;

    iget-object v3, p0, Lorg/bouncycastle/openssl/PKCS8Generator;->k:[C

    iget v4, p0, Lorg/bouncycastle/openssl/PKCS8Generator;->m:I

    invoke-static {v2, v3, v0, v4}, Lorg/bouncycastle/openssl/a;->a(Ljava/lang/String;[C[BI)Ljavax/crypto/SecretKey;

    move-result-object v2

    iget-object v3, p0, Lorg/bouncycastle/openssl/PKCS8Generator;->q:Ljava/security/AlgorithmParameterGenerator;

    invoke-virtual {v3}, Ljava/security/AlgorithmParameterGenerator;->generateParameters()Ljava/security/AlgorithmParameters;

    move-result-object v3

    :try_start_0
    iget-object v4, p0, Lorg/bouncycastle/openssl/PKCS8Generator;->o:Ljavax/crypto/Cipher;

    const/4 v5, 0x1

    invoke-virtual {v4, v5, v2, v3}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/AlgorithmParameters;)V

    new-instance v2, Lorg/bouncycastle/asn1/pkcs/EncryptionScheme;

    new-instance v4, Lorg/bouncycastle/asn1/DERObjectIdentifier;

    iget-object v5, p0, Lorg/bouncycastle/openssl/PKCS8Generator;->l:Ljava/lang/String;

    invoke-direct {v4, v5}, Lorg/bouncycastle/asn1/DERObjectIdentifier;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/security/AlgorithmParameters;->getEncoded()[B

    move-result-object v3

    invoke-static {v3}, Lorg/bouncycastle/asn1/ASN1Object;->a([B)Lorg/bouncycastle/asn1/ASN1Object;

    move-result-object v3

    invoke-direct {v2, v4, v3}, Lorg/bouncycastle/asn1/pkcs/EncryptionScheme;-><init>(Lorg/bouncycastle/asn1/DERObjectIdentifier;Lorg/bouncycastle/asn1/DEREncodable;)V

    new-instance v3, Lorg/bouncycastle/asn1/pkcs/KeyDerivationFunc;

    sget-object v4, Lorg/bouncycastle/asn1/pkcs/PKCSObjectIdentifiers;->z:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    new-instance v5, Lorg/bouncycastle/asn1/pkcs/PBKDF2Params;

    iget v6, p0, Lorg/bouncycastle/openssl/PKCS8Generator;->m:I

    invoke-direct {v5, v0, v6}, Lorg/bouncycastle/asn1/pkcs/PBKDF2Params;-><init>([BI)V

    invoke-direct {v3, v4, v5}, Lorg/bouncycastle/asn1/pkcs/KeyDerivationFunc;-><init>(Lorg/bouncycastle/asn1/DERObjectIdentifier;Lorg/bouncycastle/asn1/ASN1Encodable;)V

    new-instance v0, Lorg/bouncycastle/asn1/ASN1EncodableVector;

    invoke-direct {v0}, Lorg/bouncycastle/asn1/ASN1EncodableVector;-><init>()V

    invoke-virtual {v0, v3}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    invoke-virtual {v0, v2}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    new-instance v2, Lorg/bouncycastle/asn1/pkcs/EncryptedPrivateKeyInfo;

    new-instance v3, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    sget-object v4, Lorg/bouncycastle/asn1/pkcs/PKCSObjectIdentifiers;->y:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    new-instance v5, Lorg/bouncycastle/asn1/pkcs/PBES2Parameters;

    new-instance v6, Lorg/bouncycastle/asn1/DERSequence;

    invoke-direct {v6, v0}, Lorg/bouncycastle/asn1/DERSequence;-><init>(Lorg/bouncycastle/asn1/ASN1EncodableVector;)V

    invoke-direct {v5, v6}, Lorg/bouncycastle/asn1/pkcs/PBES2Parameters;-><init>(Lorg/bouncycastle/asn1/ASN1Sequence;)V

    invoke-direct {v3, v4, v5}, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;-><init>(Lorg/bouncycastle/asn1/DERObjectIdentifier;Lorg/bouncycastle/asn1/DEREncodable;)V

    iget-object v0, p0, Lorg/bouncycastle/openssl/PKCS8Generator;->o:Ljavax/crypto/Cipher;

    invoke-virtual {v0, v1}, Ljavax/crypto/Cipher;->doFinal([B)[B

    move-result-object v0

    invoke-direct {v2, v3, v0}, Lorg/bouncycastle/asn1/pkcs/EncryptedPrivateKeyInfo;-><init>(Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;[B)V

    new-instance v0, Lorg/bouncycastle/util/io/pem/PemObject;

    const-string v1, "ENCRYPTED PRIVATE KEY"

    invoke-virtual {v2}, Lorg/bouncycastle/asn1/pkcs/EncryptedPrivateKeyInfo;->a()[B

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lorg/bouncycastle/util/io/pem/PemObject;-><init>(Ljava/lang/String;[B)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_1

    goto/16 :goto_0

    :catch_0
    move-exception v0

    new-instance v1, Lorg/bouncycastle/util/io/pem/PemGenerationException;

    invoke-virtual {v0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Lorg/bouncycastle/util/io/pem/PemGenerationException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :catch_1
    move-exception v0

    new-instance v1, Lorg/bouncycastle/util/io/pem/PemGenerationException;

    invoke-virtual {v0}, Ljava/security/GeneralSecurityException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Lorg/bouncycastle/util/io/pem/PemGenerationException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :cond_2
    invoke-static {v0}, Lorg/bouncycastle/openssl/a;->b(Lorg/bouncycastle/asn1/DERObjectIdentifier;)Z

    move-result v2

    if-eqz v2, :cond_4

    new-array v2, v3, [B

    iget-object v3, p0, Lorg/bouncycastle/openssl/PKCS8Generator;->p:Ljava/security/SecureRandom;

    if-nez v3, :cond_3

    new-instance v3, Ljava/security/SecureRandom;

    invoke-direct {v3}, Ljava/security/SecureRandom;-><init>()V

    iput-object v3, p0, Lorg/bouncycastle/openssl/PKCS8Generator;->p:Ljava/security/SecureRandom;

    :cond_3
    iget-object v3, p0, Lorg/bouncycastle/openssl/PKCS8Generator;->p:Ljava/security/SecureRandom;

    invoke-virtual {v3, v2}, Ljava/security/SecureRandom;->nextBytes([B)V

    :try_start_1
    new-instance v3, Ljavax/crypto/spec/PBEKeySpec;

    iget-object v4, p0, Lorg/bouncycastle/openssl/PKCS8Generator;->k:[C

    invoke-direct {v3, v4}, Ljavax/crypto/spec/PBEKeySpec;-><init>([C)V

    new-instance v4, Ljavax/crypto/spec/PBEParameterSpec;

    iget v5, p0, Lorg/bouncycastle/openssl/PKCS8Generator;->m:I

    invoke-direct {v4, v2, v5}, Ljavax/crypto/spec/PBEParameterSpec;-><init>([BI)V

    iget-object v5, p0, Lorg/bouncycastle/openssl/PKCS8Generator;->o:Ljavax/crypto/Cipher;

    const/4 v6, 0x1

    iget-object v7, p0, Lorg/bouncycastle/openssl/PKCS8Generator;->r:Ljavax/crypto/SecretKeyFactory;

    invoke-virtual {v7, v3}, Ljavax/crypto/SecretKeyFactory;->generateSecret(Ljava/security/spec/KeySpec;)Ljavax/crypto/SecretKey;

    move-result-object v3

    invoke-virtual {v5, v6, v3, v4}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    new-instance v3, Lorg/bouncycastle/asn1/ASN1EncodableVector;

    invoke-direct {v3}, Lorg/bouncycastle/asn1/ASN1EncodableVector;-><init>()V

    new-instance v4, Lorg/bouncycastle/asn1/DEROctetString;

    invoke-direct {v4, v2}, Lorg/bouncycastle/asn1/DEROctetString;-><init>([B)V

    invoke-virtual {v3, v4}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    new-instance v2, Lorg/bouncycastle/asn1/DERInteger;

    iget v4, p0, Lorg/bouncycastle/openssl/PKCS8Generator;->m:I

    invoke-direct {v2, v4}, Lorg/bouncycastle/asn1/DERInteger;-><init>(I)V

    invoke-virtual {v3, v2}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    new-instance v2, Lorg/bouncycastle/asn1/pkcs/EncryptedPrivateKeyInfo;

    new-instance v4, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    new-instance v5, Lorg/bouncycastle/asn1/pkcs/PKCS12PBEParams;

    new-instance v6, Lorg/bouncycastle/asn1/DERSequence;

    invoke-direct {v6, v3}, Lorg/bouncycastle/asn1/DERSequence;-><init>(Lorg/bouncycastle/asn1/ASN1EncodableVector;)V

    invoke-direct {v5, v6}, Lorg/bouncycastle/asn1/pkcs/PKCS12PBEParams;-><init>(Lorg/bouncycastle/asn1/ASN1Sequence;)V

    invoke-direct {v4, v0, v5}, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;-><init>(Lorg/bouncycastle/asn1/DERObjectIdentifier;Lorg/bouncycastle/asn1/DEREncodable;)V

    iget-object v0, p0, Lorg/bouncycastle/openssl/PKCS8Generator;->o:Ljavax/crypto/Cipher;

    invoke-virtual {v0, v1}, Ljavax/crypto/Cipher;->doFinal([B)[B

    move-result-object v0

    invoke-direct {v2, v4, v0}, Lorg/bouncycastle/asn1/pkcs/EncryptedPrivateKeyInfo;-><init>(Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;[B)V

    new-instance v0, Lorg/bouncycastle/util/io/pem/PemObject;

    const-string v1, "ENCRYPTED PRIVATE KEY"

    invoke-virtual {v2}, Lorg/bouncycastle/asn1/pkcs/EncryptedPrivateKeyInfo;->a()[B

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lorg/bouncycastle/util/io/pem/PemObject;-><init>(Ljava/lang/String;[B)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/security/GeneralSecurityException; {:try_start_1 .. :try_end_1} :catch_3

    goto/16 :goto_0

    :catch_2
    move-exception v0

    new-instance v1, Lorg/bouncycastle/util/io/pem/PemGenerationException;

    invoke-virtual {v0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Lorg/bouncycastle/util/io/pem/PemGenerationException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :catch_3
    move-exception v0

    new-instance v1, Lorg/bouncycastle/util/io/pem/PemGenerationException;

    invoke-virtual {v0}, Ljava/security/GeneralSecurityException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Lorg/bouncycastle/util/io/pem/PemGenerationException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :cond_4
    new-instance v0, Lorg/bouncycastle/util/io/pem/PemGenerationException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "unknown algorithm: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lorg/bouncycastle/openssl/PKCS8Generator;->l:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/bouncycastle/util/io/pem/PemGenerationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
