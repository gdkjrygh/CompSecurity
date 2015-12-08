.class public Lorg/spongycastle/jcajce/provider/asymmetric/rsa/DigestSignatureSpi;
.super Ljava/security/SignatureSpi;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/spongycastle/jcajce/provider/asymmetric/rsa/DigestSignatureSpi$noneRSA;,
        Lorg/spongycastle/jcajce/provider/asymmetric/rsa/DigestSignatureSpi$RIPEMD256;,
        Lorg/spongycastle/jcajce/provider/asymmetric/rsa/DigestSignatureSpi$RIPEMD128;,
        Lorg/spongycastle/jcajce/provider/asymmetric/rsa/DigestSignatureSpi$RIPEMD160;,
        Lorg/spongycastle/jcajce/provider/asymmetric/rsa/DigestSignatureSpi$MD5;,
        Lorg/spongycastle/jcajce/provider/asymmetric/rsa/DigestSignatureSpi$MD4;,
        Lorg/spongycastle/jcajce/provider/asymmetric/rsa/DigestSignatureSpi$MD2;,
        Lorg/spongycastle/jcajce/provider/asymmetric/rsa/DigestSignatureSpi$SHA512;,
        Lorg/spongycastle/jcajce/provider/asymmetric/rsa/DigestSignatureSpi$SHA384;,
        Lorg/spongycastle/jcajce/provider/asymmetric/rsa/DigestSignatureSpi$SHA256;,
        Lorg/spongycastle/jcajce/provider/asymmetric/rsa/DigestSignatureSpi$SHA224;,
        Lorg/spongycastle/jcajce/provider/asymmetric/rsa/DigestSignatureSpi$SHA1;
    }
.end annotation


# instance fields
.field private a:Lorg/spongycastle/crypto/Digest;

.field private b:Lorg/spongycastle/crypto/AsymmetricBlockCipher;

.field private c:Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;


# direct methods
.method protected constructor <init>(Lorg/spongycastle/asn1/ASN1ObjectIdentifier;Lorg/spongycastle/crypto/Digest;Lorg/spongycastle/crypto/AsymmetricBlockCipher;)V
    .locals 2

    .prologue
    .line 63
    invoke-direct {p0}, Ljava/security/SignatureSpi;-><init>()V

    .line 64
    iput-object p2, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/DigestSignatureSpi;->a:Lorg/spongycastle/crypto/Digest;

    .line 65
    iput-object p3, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/DigestSignatureSpi;->b:Lorg/spongycastle/crypto/AsymmetricBlockCipher;

    .line 66
    new-instance v0, Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;

    sget-object v1, Lorg/spongycastle/asn1/DERNull;->a:Lorg/spongycastle/asn1/DERNull;

    invoke-direct {v0, p1, v1}, Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;-><init>(Lorg/spongycastle/asn1/ASN1ObjectIdentifier;Lorg/spongycastle/asn1/ASN1Encodable;)V

    iput-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/DigestSignatureSpi;->c:Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;

    .line 67
    return-void
.end method

.method protected constructor <init>(Lorg/spongycastle/crypto/Digest;Lorg/spongycastle/crypto/AsymmetricBlockCipher;)V
    .locals 1

    .prologue
    .line 52
    invoke-direct {p0}, Ljava/security/SignatureSpi;-><init>()V

    .line 53
    iput-object p1, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/DigestSignatureSpi;->a:Lorg/spongycastle/crypto/Digest;

    .line 54
    iput-object p2, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/DigestSignatureSpi;->b:Lorg/spongycastle/crypto/AsymmetricBlockCipher;

    .line 55
    const/4 v0, 0x0

    iput-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/DigestSignatureSpi;->c:Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;

    .line 56
    return-void
.end method

.method private static a(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 103
    if-nez p0, :cond_0

    .line 105
    const/4 v0, 0x0

    .line 108
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

    .prologue
    .line 248
    iget-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/DigestSignatureSpi;->c:Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;

    if-nez v0, :cond_0

    .line 256
    :goto_0
    return-object p1

    .line 254
    :cond_0
    new-instance v0, Lorg/spongycastle/asn1/x509/DigestInfo;

    iget-object v1, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/DigestSignatureSpi;->c:Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;

    invoke-direct {v0, v1, p1}, Lorg/spongycastle/asn1/x509/DigestInfo;-><init>(Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;[B)V

    .line 256
    const-string v1, "DER"

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/x509/DigestInfo;->a(Ljava/lang/String;)[B

    move-result-object p1

    goto :goto_0
.end method


# virtual methods
.method protected engineGetParameter(Ljava/lang/String;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 236
    const/4 v0, 0x0

    return-object v0
.end method

.method protected engineGetParameters()Ljava/security/AlgorithmParameters;
    .locals 1

    .prologue
    .line 241
    const/4 v0, 0x0

    return-object v0
.end method

.method protected engineInitSign(Ljava/security/PrivateKey;)V
    .locals 3

    .prologue
    .line 88
    instance-of v0, p1, Ljava/security/interfaces/RSAPrivateKey;

    if-nez v0, :cond_0

    .line 90
    new-instance v0, Ljava/security/InvalidKeyException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Supplied key ("

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/DigestSignatureSpi;->a(Ljava/lang/Object;)Ljava/lang/String;

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

    .line 93
    :cond_0
    check-cast p1, Ljava/security/interfaces/RSAPrivateKey;

    invoke-static {p1}, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/RSAUtil;->a(Ljava/security/interfaces/RSAPrivateKey;)Lorg/spongycastle/crypto/params/RSAKeyParameters;

    move-result-object v0

    .line 95
    iget-object v1, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/DigestSignatureSpi;->a:Lorg/spongycastle/crypto/Digest;

    invoke-interface {v1}, Lorg/spongycastle/crypto/Digest;->c()V

    .line 97
    iget-object v1, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/DigestSignatureSpi;->b:Lorg/spongycastle/crypto/AsymmetricBlockCipher;

    const/4 v2, 0x1

    invoke-interface {v1, v2, v0}, Lorg/spongycastle/crypto/AsymmetricBlockCipher;->a(ZLorg/spongycastle/crypto/CipherParameters;)V

    .line 98
    return-void
.end method

.method protected engineInitVerify(Ljava/security/PublicKey;)V
    .locals 3

    .prologue
    .line 73
    instance-of v0, p1, Ljava/security/interfaces/RSAPublicKey;

    if-nez v0, :cond_0

    .line 75
    new-instance v0, Ljava/security/InvalidKeyException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Supplied key ("

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/DigestSignatureSpi;->a(Ljava/lang/Object;)Ljava/lang/String;

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

    .line 78
    :cond_0
    check-cast p1, Ljava/security/interfaces/RSAPublicKey;

    invoke-static {p1}, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/RSAUtil;->a(Ljava/security/interfaces/RSAPublicKey;)Lorg/spongycastle/crypto/params/RSAKeyParameters;

    move-result-object v0

    .line 80
    iget-object v1, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/DigestSignatureSpi;->a:Lorg/spongycastle/crypto/Digest;

    invoke-interface {v1}, Lorg/spongycastle/crypto/Digest;->c()V

    .line 81
    iget-object v1, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/DigestSignatureSpi;->b:Lorg/spongycastle/crypto/AsymmetricBlockCipher;

    const/4 v2, 0x0

    invoke-interface {v1, v2, v0}, Lorg/spongycastle/crypto/AsymmetricBlockCipher;->a(ZLorg/spongycastle/crypto/CipherParameters;)V

    .line 82
    return-void
.end method

.method protected engineSetParameter(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 227
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "engineSetParameter unsupported"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method protected engineSetParameter(Ljava/security/spec/AlgorithmParameterSpec;)V
    .locals 2

    .prologue
    .line 217
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "engineSetParameter unsupported"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method protected engineSign()[B
    .locals 4

    .prologue
    const/4 v2, 0x0

    .line 130
    iget-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/DigestSignatureSpi;->a:Lorg/spongycastle/crypto/Digest;

    invoke-interface {v0}, Lorg/spongycastle/crypto/Digest;->b()I

    move-result v0

    new-array v0, v0, [B

    .line 132
    iget-object v1, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/DigestSignatureSpi;->a:Lorg/spongycastle/crypto/Digest;

    invoke-interface {v1, v0, v2}, Lorg/spongycastle/crypto/Digest;->a([BI)I

    .line 136
    :try_start_0
    invoke-direct {p0, v0}, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/DigestSignatureSpi;->a([B)[B

    move-result-object v0

    .line 138
    iget-object v1, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/DigestSignatureSpi;->b:Lorg/spongycastle/crypto/AsymmetricBlockCipher;

    const/4 v2, 0x0

    array-length v3, v0

    invoke-interface {v1, v0, v2, v3}, Lorg/spongycastle/crypto/AsymmetricBlockCipher;->a([BII)[B
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v0

    return-object v0

    .line 142
    :catch_0
    move-exception v0

    new-instance v0, Ljava/security/SignatureException;

    const-string v1, "key too small for signature type"

    invoke-direct {v0, v1}, Ljava/security/SignatureException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 144
    :catch_1
    move-exception v0

    .line 146
    new-instance v1, Ljava/security/SignatureException;

    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/security/SignatureException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method protected engineUpdate(B)V
    .locals 1

    .prologue
    .line 115
    iget-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/DigestSignatureSpi;->a:Lorg/spongycastle/crypto/Digest;

    invoke-interface {v0, p1}, Lorg/spongycastle/crypto/Digest;->a(B)V

    .line 116
    return-void
.end method

.method protected engineUpdate([BII)V
    .locals 1

    .prologue
    .line 124
    iget-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/DigestSignatureSpi;->a:Lorg/spongycastle/crypto/Digest;

    invoke-interface {v0, p1, p2, p3}, Lorg/spongycastle/crypto/Digest;->a([BII)V

    .line 125
    return-void
.end method

.method protected engineVerify([B)Z
    .locals 10

    .prologue
    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 154
    iget-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/DigestSignatureSpi;->a:Lorg/spongycastle/crypto/Digest;

    invoke-interface {v0}, Lorg/spongycastle/crypto/Digest;->b()I

    move-result v0

    new-array v3, v0, [B

    .line 156
    iget-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/DigestSignatureSpi;->a:Lorg/spongycastle/crypto/Digest;

    invoke-interface {v0, v3, v1}, Lorg/spongycastle/crypto/Digest;->a([BI)I

    .line 163
    :try_start_0
    iget-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/DigestSignatureSpi;->b:Lorg/spongycastle/crypto/AsymmetricBlockCipher;

    const/4 v4, 0x0

    array-length v5, p1

    invoke-interface {v0, p1, v4, v5}, Lorg/spongycastle/crypto/AsymmetricBlockCipher;->a([BII)[B

    move-result-object v4

    .line 165
    invoke-direct {p0, v3}, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/DigestSignatureSpi;->a([B)[B
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v5

    .line 172
    array-length v0, v4

    array-length v6, v5

    if-ne v0, v6, :cond_2

    move v0, v1

    .line 174
    :goto_0
    array-length v3, v4

    if-ge v0, v3, :cond_4

    .line 176
    aget-byte v3, v4, v0

    aget-byte v6, v5, v0

    if-eq v3, v6, :cond_1

    .line 211
    :cond_0
    :goto_1
    return v1

    .line 174
    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 182
    :cond_2
    array-length v0, v4

    array-length v6, v5

    add-int/lit8 v6, v6, -0x2

    if-ne v0, v6, :cond_0

    .line 184
    array-length v0, v4

    array-length v6, v3

    sub-int/2addr v0, v6

    add-int/lit8 v6, v0, -0x2

    .line 185
    array-length v0, v5

    array-length v7, v3

    sub-int/2addr v0, v7

    add-int/lit8 v7, v0, -0x2

    .line 187
    aget-byte v0, v5, v2

    add-int/lit8 v0, v0, -0x2

    int-to-byte v0, v0

    aput-byte v0, v5, v2

    .line 188
    const/4 v0, 0x3

    aget-byte v8, v5, v0

    add-int/lit8 v8, v8, -0x2

    int-to-byte v8, v8

    aput-byte v8, v5, v0

    move v0, v1

    .line 190
    :goto_2
    array-length v8, v3

    if-ge v0, v8, :cond_3

    .line 192
    add-int v8, v6, v0

    aget-byte v8, v4, v8

    add-int v9, v7, v0

    aget-byte v9, v5, v9

    if-ne v8, v9, :cond_0

    .line 190
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_3
    move v0, v1

    .line 198
    :goto_3
    if-ge v0, v6, :cond_4

    .line 200
    aget-byte v3, v4, v0

    aget-byte v7, v5, v0

    if-ne v3, v7, :cond_0

    .line 198
    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    :cond_4
    move v1, v2

    .line 211
    goto :goto_1

    .line 169
    :catch_0
    move-exception v0

    goto :goto_1
.end method
