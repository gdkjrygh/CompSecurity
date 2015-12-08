.class public Lorg/bouncycastle/crypto/signers/RSADigestSigner;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/bouncycastle/crypto/Signer;


# static fields
.field private static final e:Ljava/util/Hashtable;


# instance fields
.field private final a:Lorg/bouncycastle/crypto/AsymmetricBlockCipher;

.field private final b:Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

.field private final c:Lorg/bouncycastle/crypto/Digest;

.field private d:Z


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Ljava/util/Hashtable;

    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    sput-object v0, Lorg/bouncycastle/crypto/signers/RSADigestSigner;->e:Ljava/util/Hashtable;

    const-string v1, "RIPEMD128"

    sget-object v2, Lorg/bouncycastle/asn1/teletrust/TeleTrusTObjectIdentifiers;->c:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/crypto/signers/RSADigestSigner;->e:Ljava/util/Hashtable;

    const-string v1, "RIPEMD160"

    sget-object v2, Lorg/bouncycastle/asn1/teletrust/TeleTrusTObjectIdentifiers;->b:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/crypto/signers/RSADigestSigner;->e:Ljava/util/Hashtable;

    const-string v1, "RIPEMD256"

    sget-object v2, Lorg/bouncycastle/asn1/teletrust/TeleTrusTObjectIdentifiers;->d:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/crypto/signers/RSADigestSigner;->e:Ljava/util/Hashtable;

    const-string v1, "SHA-1"

    sget-object v2, Lorg/bouncycastle/asn1/x509/X509ObjectIdentifiers;->i:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/crypto/signers/RSADigestSigner;->e:Ljava/util/Hashtable;

    const-string v1, "SHA-224"

    sget-object v2, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->e:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/crypto/signers/RSADigestSigner;->e:Ljava/util/Hashtable;

    const-string v1, "SHA-256"

    sget-object v2, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->b:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/crypto/signers/RSADigestSigner;->e:Ljava/util/Hashtable;

    const-string v1, "SHA-384"

    sget-object v2, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->c:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/crypto/signers/RSADigestSigner;->e:Ljava/util/Hashtable;

    const-string v1, "SHA-512"

    sget-object v2, Lorg/bouncycastle/asn1/nist/NISTObjectIdentifiers;->d:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/crypto/signers/RSADigestSigner;->e:Ljava/util/Hashtable;

    const-string v1, "MD2"

    sget-object v2, Lorg/bouncycastle/asn1/pkcs/PKCSObjectIdentifiers;->E:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/crypto/signers/RSADigestSigner;->e:Ljava/util/Hashtable;

    const-string v1, "MD4"

    sget-object v2, Lorg/bouncycastle/asn1/pkcs/PKCSObjectIdentifiers;->F:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lorg/bouncycastle/crypto/signers/RSADigestSigner;->e:Ljava/util/Hashtable;

    const-string v1, "MD5"

    sget-object v2, Lorg/bouncycastle/asn1/pkcs/PKCSObjectIdentifiers;->G:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lorg/bouncycastle/crypto/Digest;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lorg/bouncycastle/crypto/encodings/PKCS1Encoding;

    new-instance v1, Lorg/bouncycastle/crypto/engines/RSABlindedEngine;

    invoke-direct {v1}, Lorg/bouncycastle/crypto/engines/RSABlindedEngine;-><init>()V

    invoke-direct {v0, v1}, Lorg/bouncycastle/crypto/encodings/PKCS1Encoding;-><init>(Lorg/bouncycastle/crypto/AsymmetricBlockCipher;)V

    iput-object v0, p0, Lorg/bouncycastle/crypto/signers/RSADigestSigner;->a:Lorg/bouncycastle/crypto/AsymmetricBlockCipher;

    iput-object p1, p0, Lorg/bouncycastle/crypto/signers/RSADigestSigner;->c:Lorg/bouncycastle/crypto/Digest;

    new-instance v1, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    sget-object v0, Lorg/bouncycastle/crypto/signers/RSADigestSigner;->e:Ljava/util/Hashtable;

    invoke-interface {p1}, Lorg/bouncycastle/crypto/Digest;->getAlgorithmName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/asn1/DERObjectIdentifier;

    sget-object v2, Lorg/bouncycastle/asn1/DERNull;->b:Lorg/bouncycastle/asn1/DERNull;

    invoke-direct {v1, v0, v2}, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;-><init>(Lorg/bouncycastle/asn1/DERObjectIdentifier;Lorg/bouncycastle/asn1/DEREncodable;)V

    iput-object v1, p0, Lorg/bouncycastle/crypto/signers/RSADigestSigner;->b:Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    return-void
.end method

.method private derEncode([B)[B
    .locals 2

    new-instance v0, Lorg/bouncycastle/asn1/x509/DigestInfo;

    iget-object v1, p0, Lorg/bouncycastle/crypto/signers/RSADigestSigner;->b:Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    invoke-direct {v0, v1, p1}, Lorg/bouncycastle/asn1/x509/DigestInfo;-><init>(Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;[B)V

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/x509/DigestInfo;->b()[B

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public generateSignature()[B
    .locals 4

    const/4 v3, 0x0

    iget-boolean v0, p0, Lorg/bouncycastle/crypto/signers/RSADigestSigner;->d:Z

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "RSADigestSigner not initialised for signature generation."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-object v0, p0, Lorg/bouncycastle/crypto/signers/RSADigestSigner;->c:Lorg/bouncycastle/crypto/Digest;

    invoke-interface {v0}, Lorg/bouncycastle/crypto/Digest;->getDigestSize()I

    move-result v0

    new-array v0, v0, [B

    iget-object v1, p0, Lorg/bouncycastle/crypto/signers/RSADigestSigner;->c:Lorg/bouncycastle/crypto/Digest;

    invoke-interface {v1, v0, v3}, Lorg/bouncycastle/crypto/Digest;->doFinal([BI)I

    invoke-direct {p0, v0}, Lorg/bouncycastle/crypto/signers/RSADigestSigner;->derEncode([B)[B

    move-result-object v0

    iget-object v1, p0, Lorg/bouncycastle/crypto/signers/RSADigestSigner;->a:Lorg/bouncycastle/crypto/AsymmetricBlockCipher;

    array-length v2, v0

    invoke-interface {v1, v0, v3, v2}, Lorg/bouncycastle/crypto/AsymmetricBlockCipher;->processBlock([BII)[B

    move-result-object v0

    return-object v0
.end method

.method public getAlgorithmName()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lorg/bouncycastle/crypto/signers/RSADigestSigner;->c:Lorg/bouncycastle/crypto/Digest;

    invoke-interface {v1}, Lorg/bouncycastle/crypto/Digest;->getAlgorithmName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "withRSA"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public init(ZLorg/bouncycastle/crypto/CipherParameters;)V
    .locals 2

    iput-boolean p1, p0, Lorg/bouncycastle/crypto/signers/RSADigestSigner;->d:Z

    instance-of v0, p2, Lorg/bouncycastle/crypto/params/ParametersWithRandom;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lorg/bouncycastle/crypto/params/ParametersWithRandom;

    invoke-virtual {v0}, Lorg/bouncycastle/crypto/params/ParametersWithRandom;->getParameters()Lorg/bouncycastle/crypto/CipherParameters;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;

    :goto_0
    if-eqz p1, :cond_1

    invoke-virtual {v0}, Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;->isPrivate()Z

    move-result v1

    if-nez v1, :cond_1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "signing requires private key"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    move-object v0, p2

    check-cast v0, Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;

    goto :goto_0

    :cond_1
    if-nez p1, :cond_2

    invoke-virtual {v0}, Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;->isPrivate()Z

    move-result v0

    if-eqz v0, :cond_2

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "verification requires public key"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-virtual {p0}, Lorg/bouncycastle/crypto/signers/RSADigestSigner;->reset()V

    iget-object v0, p0, Lorg/bouncycastle/crypto/signers/RSADigestSigner;->a:Lorg/bouncycastle/crypto/AsymmetricBlockCipher;

    invoke-interface {v0, p1, p2}, Lorg/bouncycastle/crypto/AsymmetricBlockCipher;->init(ZLorg/bouncycastle/crypto/CipherParameters;)V

    return-void
.end method

.method public reset()V
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/crypto/signers/RSADigestSigner;->c:Lorg/bouncycastle/crypto/Digest;

    invoke-interface {v0}, Lorg/bouncycastle/crypto/Digest;->reset()V

    return-void
.end method

.method public update(B)V
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/crypto/signers/RSADigestSigner;->c:Lorg/bouncycastle/crypto/Digest;

    invoke-interface {v0, p1}, Lorg/bouncycastle/crypto/Digest;->update(B)V

    return-void
.end method

.method public update([BII)V
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/crypto/signers/RSADigestSigner;->c:Lorg/bouncycastle/crypto/Digest;

    invoke-interface {v0, p1, p2, p3}, Lorg/bouncycastle/crypto/Digest;->update([BII)V

    return-void
.end method

.method public verifySignature([B)Z
    .locals 10

    const/4 v2, 0x1

    const/4 v1, 0x0

    iget-boolean v0, p0, Lorg/bouncycastle/crypto/signers/RSADigestSigner;->d:Z

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "RSADigestSigner not initialised for verification"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-object v0, p0, Lorg/bouncycastle/crypto/signers/RSADigestSigner;->c:Lorg/bouncycastle/crypto/Digest;

    invoke-interface {v0}, Lorg/bouncycastle/crypto/Digest;->getDigestSize()I

    move-result v0

    new-array v3, v0, [B

    iget-object v0, p0, Lorg/bouncycastle/crypto/signers/RSADigestSigner;->c:Lorg/bouncycastle/crypto/Digest;

    invoke-interface {v0, v3, v1}, Lorg/bouncycastle/crypto/Digest;->doFinal([BI)I

    :try_start_0
    iget-object v0, p0, Lorg/bouncycastle/crypto/signers/RSADigestSigner;->a:Lorg/bouncycastle/crypto/AsymmetricBlockCipher;

    const/4 v4, 0x0

    array-length v5, p1

    invoke-interface {v0, p1, v4, v5}, Lorg/bouncycastle/crypto/AsymmetricBlockCipher;->processBlock([BII)[B

    move-result-object v4

    invoke-direct {p0, v3}, Lorg/bouncycastle/crypto/signers/RSADigestSigner;->derEncode([B)[B
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v5

    array-length v0, v4

    array-length v6, v5

    if-ne v0, v6, :cond_3

    move v0, v1

    :goto_0
    array-length v3, v4

    if-ge v0, v3, :cond_5

    aget-byte v3, v4, v0

    aget-byte v6, v5, v0

    if-eq v3, v6, :cond_2

    :cond_1
    :goto_1
    return v1

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    array-length v0, v4

    array-length v6, v5

    add-int/lit8 v6, v6, -0x2

    if-ne v0, v6, :cond_1

    array-length v0, v4

    array-length v6, v3

    sub-int/2addr v0, v6

    add-int/lit8 v6, v0, -0x2

    array-length v0, v5

    array-length v7, v3

    sub-int/2addr v0, v7

    add-int/lit8 v7, v0, -0x2

    aget-byte v0, v5, v2

    add-int/lit8 v0, v0, -0x2

    int-to-byte v0, v0

    aput-byte v0, v5, v2

    const/4 v0, 0x3

    aget-byte v8, v5, v0

    add-int/lit8 v8, v8, -0x2

    int-to-byte v8, v8

    aput-byte v8, v5, v0

    move v0, v1

    :goto_2
    array-length v8, v3

    if-ge v0, v8, :cond_4

    add-int v8, v6, v0

    aget-byte v8, v4, v8

    add-int v9, v7, v0

    aget-byte v9, v5, v9

    if-ne v8, v9, :cond_1

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_4
    move v0, v1

    :goto_3
    if-ge v0, v6, :cond_5

    aget-byte v3, v4, v0

    aget-byte v7, v5, v0

    if-ne v3, v7, :cond_1

    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    :cond_5
    move v1, v2

    goto :goto_1

    :catch_0
    move-exception v0

    goto :goto_1
.end method
