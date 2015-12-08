.class public Lorg/bouncycastle/jce/provider/JDKDigestSignature;
.super Ljava/security/SignatureSpi;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/bouncycastle/jce/provider/JDKDigestSignature$MD2WithRSAEncryption;,
        Lorg/bouncycastle/jce/provider/JDKDigestSignature$MD4WithRSAEncryption;,
        Lorg/bouncycastle/jce/provider/JDKDigestSignature$MD5WithRSAEncryption;,
        Lorg/bouncycastle/jce/provider/JDKDigestSignature$RIPEMD128WithRSAEncryption;,
        Lorg/bouncycastle/jce/provider/JDKDigestSignature$RIPEMD160WithRSAEncryption;,
        Lorg/bouncycastle/jce/provider/JDKDigestSignature$RIPEMD256WithRSAEncryption;,
        Lorg/bouncycastle/jce/provider/JDKDigestSignature$SHA1WithRSAEncryption;,
        Lorg/bouncycastle/jce/provider/JDKDigestSignature$SHA224WithRSAEncryption;,
        Lorg/bouncycastle/jce/provider/JDKDigestSignature$SHA256WithRSAEncryption;,
        Lorg/bouncycastle/jce/provider/JDKDigestSignature$SHA384WithRSAEncryption;,
        Lorg/bouncycastle/jce/provider/JDKDigestSignature$SHA512WithRSAEncryption;,
        Lorg/bouncycastle/jce/provider/JDKDigestSignature$noneRSA;
    }
.end annotation


# instance fields
.field private a:Lorg/bouncycastle/crypto/Digest;

.field private b:Lorg/bouncycastle/crypto/AsymmetricBlockCipher;

.field private c:Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;


# direct methods
.method protected constructor <init>(Lorg/bouncycastle/asn1/DERObjectIdentifier;Lorg/bouncycastle/crypto/Digest;Lorg/bouncycastle/crypto/AsymmetricBlockCipher;)V
    .locals 2

    invoke-direct {p0}, Ljava/security/SignatureSpi;-><init>()V

    iput-object p2, p0, Lorg/bouncycastle/jce/provider/JDKDigestSignature;->a:Lorg/bouncycastle/crypto/Digest;

    iput-object p3, p0, Lorg/bouncycastle/jce/provider/JDKDigestSignature;->b:Lorg/bouncycastle/crypto/AsymmetricBlockCipher;

    new-instance v0, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    sget-object v1, Lorg/bouncycastle/asn1/DERNull;->b:Lorg/bouncycastle/asn1/DERNull;

    invoke-direct {v0, p1, v1}, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;-><init>(Lorg/bouncycastle/asn1/DERObjectIdentifier;Lorg/bouncycastle/asn1/DEREncodable;)V

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JDKDigestSignature;->c:Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    return-void
.end method

.method protected constructor <init>(Lorg/bouncycastle/crypto/Digest;Lorg/bouncycastle/crypto/AsymmetricBlockCipher;)V
    .locals 1

    invoke-direct {p0}, Ljava/security/SignatureSpi;-><init>()V

    iput-object p1, p0, Lorg/bouncycastle/jce/provider/JDKDigestSignature;->a:Lorg/bouncycastle/crypto/Digest;

    iput-object p2, p0, Lorg/bouncycastle/jce/provider/JDKDigestSignature;->b:Lorg/bouncycastle/crypto/AsymmetricBlockCipher;

    const/4 v0, 0x0

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JDKDigestSignature;->c:Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    return-void
.end method

.method private static a(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    if-nez p0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method private a([B)[B
    .locals 2

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JDKDigestSignature;->c:Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    if-nez v0, :cond_0

    :goto_0
    return-object p1

    :cond_0
    new-instance v0, Lorg/bouncycastle/asn1/x509/DigestInfo;

    iget-object v1, p0, Lorg/bouncycastle/jce/provider/JDKDigestSignature;->c:Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    invoke-direct {v0, v1, p1}, Lorg/bouncycastle/asn1/x509/DigestInfo;-><init>(Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;[B)V

    const-string v1, "DER"

    invoke-virtual {v0, v1}, Lorg/bouncycastle/asn1/x509/DigestInfo;->a(Ljava/lang/String;)[B

    move-result-object p1

    goto :goto_0
.end method


# virtual methods
.method protected engineGetParameter(Ljava/lang/String;)Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method protected engineGetParameters()Ljava/security/AlgorithmParameters;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method protected engineInitSign(Ljava/security/PrivateKey;)V
    .locals 3

    instance-of v0, p1, Ljava/security/interfaces/RSAPrivateKey;

    if-nez v0, :cond_0

    new-instance v0, Ljava/security/InvalidKeyException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Supplied key ("

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lorg/bouncycastle/jce/provider/JDKDigestSignature;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ") is not a RSAPrivateKey instance"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/security/InvalidKeyException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    check-cast p1, Ljava/security/interfaces/RSAPrivateKey;

    invoke-static {p1}, Lorg/bouncycastle/jce/provider/g;->a(Ljava/security/interfaces/RSAPrivateKey;)Lorg/bouncycastle/crypto/params/RSAKeyParameters;

    move-result-object v0

    iget-object v1, p0, Lorg/bouncycastle/jce/provider/JDKDigestSignature;->a:Lorg/bouncycastle/crypto/Digest;

    invoke-interface {v1}, Lorg/bouncycastle/crypto/Digest;->reset()V

    iget-object v1, p0, Lorg/bouncycastle/jce/provider/JDKDigestSignature;->b:Lorg/bouncycastle/crypto/AsymmetricBlockCipher;

    const/4 v2, 0x1

    invoke-interface {v1, v2, v0}, Lorg/bouncycastle/crypto/AsymmetricBlockCipher;->init(ZLorg/bouncycastle/crypto/CipherParameters;)V

    return-void
.end method

.method protected engineInitVerify(Ljava/security/PublicKey;)V
    .locals 3

    instance-of v0, p1, Ljava/security/interfaces/RSAPublicKey;

    if-nez v0, :cond_0

    new-instance v0, Ljava/security/InvalidKeyException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Supplied key ("

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lorg/bouncycastle/jce/provider/JDKDigestSignature;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ") is not a RSAPublicKey instance"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/security/InvalidKeyException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    check-cast p1, Ljava/security/interfaces/RSAPublicKey;

    invoke-static {p1}, Lorg/bouncycastle/jce/provider/g;->a(Ljava/security/interfaces/RSAPublicKey;)Lorg/bouncycastle/crypto/params/RSAKeyParameters;

    move-result-object v0

    iget-object v1, p0, Lorg/bouncycastle/jce/provider/JDKDigestSignature;->a:Lorg/bouncycastle/crypto/Digest;

    invoke-interface {v1}, Lorg/bouncycastle/crypto/Digest;->reset()V

    iget-object v1, p0, Lorg/bouncycastle/jce/provider/JDKDigestSignature;->b:Lorg/bouncycastle/crypto/AsymmetricBlockCipher;

    const/4 v2, 0x0

    invoke-interface {v1, v2, v0}, Lorg/bouncycastle/crypto/AsymmetricBlockCipher;->init(ZLorg/bouncycastle/crypto/CipherParameters;)V

    return-void
.end method

.method protected engineSetParameter(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 2

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "engineSetParameter unsupported"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method protected engineSetParameter(Ljava/security/spec/AlgorithmParameterSpec;)V
    .locals 2

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "engineSetParameter unsupported"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method protected engineSign()[B
    .locals 4

    const/4 v2, 0x0

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JDKDigestSignature;->a:Lorg/bouncycastle/crypto/Digest;

    invoke-interface {v0}, Lorg/bouncycastle/crypto/Digest;->getDigestSize()I

    move-result v0

    new-array v0, v0, [B

    iget-object v1, p0, Lorg/bouncycastle/jce/provider/JDKDigestSignature;->a:Lorg/bouncycastle/crypto/Digest;

    invoke-interface {v1, v0, v2}, Lorg/bouncycastle/crypto/Digest;->doFinal([BI)I

    :try_start_0
    invoke-direct {p0, v0}, Lorg/bouncycastle/jce/provider/JDKDigestSignature;->a([B)[B

    move-result-object v0

    iget-object v1, p0, Lorg/bouncycastle/jce/provider/JDKDigestSignature;->b:Lorg/bouncycastle/crypto/AsymmetricBlockCipher;

    const/4 v2, 0x0

    array-length v3, v0

    invoke-interface {v1, v0, v2, v3}, Lorg/bouncycastle/crypto/AsymmetricBlockCipher;->processBlock([BII)[B
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v0, Ljava/security/SignatureException;

    const-string v1, "key too small for signature type"

    invoke-direct {v0, v1}, Ljava/security/SignatureException;-><init>(Ljava/lang/String;)V

    throw v0

    :catch_1
    move-exception v0

    new-instance v1, Ljava/security/SignatureException;

    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/security/SignatureException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method protected engineUpdate(B)V
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JDKDigestSignature;->a:Lorg/bouncycastle/crypto/Digest;

    invoke-interface {v0, p1}, Lorg/bouncycastle/crypto/Digest;->update(B)V

    return-void
.end method

.method protected engineUpdate([BII)V
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JDKDigestSignature;->a:Lorg/bouncycastle/crypto/Digest;

    invoke-interface {v0, p1, p2, p3}, Lorg/bouncycastle/crypto/Digest;->update([BII)V

    return-void
.end method

.method protected engineVerify([B)Z
    .locals 10

    const/4 v2, 0x1

    const/4 v1, 0x0

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JDKDigestSignature;->a:Lorg/bouncycastle/crypto/Digest;

    invoke-interface {v0}, Lorg/bouncycastle/crypto/Digest;->getDigestSize()I

    move-result v0

    new-array v3, v0, [B

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JDKDigestSignature;->a:Lorg/bouncycastle/crypto/Digest;

    invoke-interface {v0, v3, v1}, Lorg/bouncycastle/crypto/Digest;->doFinal([BI)I

    :try_start_0
    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JDKDigestSignature;->b:Lorg/bouncycastle/crypto/AsymmetricBlockCipher;

    const/4 v4, 0x0

    array-length v5, p1

    invoke-interface {v0, p1, v4, v5}, Lorg/bouncycastle/crypto/AsymmetricBlockCipher;->processBlock([BII)[B

    move-result-object v4

    invoke-direct {p0, v3}, Lorg/bouncycastle/jce/provider/JDKDigestSignature;->a([B)[B
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v5

    array-length v0, v4

    array-length v6, v5

    if-ne v0, v6, :cond_2

    move v0, v1

    :goto_0
    array-length v3, v4

    if-ge v0, v3, :cond_4

    aget-byte v3, v4, v0

    aget-byte v6, v5, v0

    if-eq v3, v6, :cond_1

    :cond_0
    :goto_1
    return v1

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    array-length v0, v4

    array-length v6, v5

    add-int/lit8 v6, v6, -0x2

    if-ne v0, v6, :cond_0

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

    if-ge v0, v8, :cond_3

    add-int v8, v6, v0

    aget-byte v8, v4, v8

    add-int v9, v7, v0

    aget-byte v9, v5, v9

    if-ne v8, v9, :cond_0

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_3
    move v0, v1

    :goto_3
    if-ge v0, v6, :cond_4

    aget-byte v3, v4, v0

    aget-byte v7, v5, v0

    if-ne v3, v7, :cond_0

    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    :cond_4
    move v1, v2

    goto :goto_1

    :catch_0
    move-exception v0

    goto :goto_1
.end method
