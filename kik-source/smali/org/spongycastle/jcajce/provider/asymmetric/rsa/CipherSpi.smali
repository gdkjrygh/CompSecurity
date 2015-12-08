.class public Lorg/spongycastle/jcajce/provider/asymmetric/rsa/CipherSpi;
.super Lorg/spongycastle/jcajce/provider/asymmetric/util/BaseCipherSpi;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/spongycastle/jcajce/provider/asymmetric/rsa/CipherSpi$ISO9796d1Padding;,
        Lorg/spongycastle/jcajce/provider/asymmetric/rsa/CipherSpi$OAEPPadding;,
        Lorg/spongycastle/jcajce/provider/asymmetric/rsa/CipherSpi$PKCS1v1_5Padding_PublicOnly;,
        Lorg/spongycastle/jcajce/provider/asymmetric/rsa/CipherSpi$PKCS1v1_5Padding_PrivateOnly;,
        Lorg/spongycastle/jcajce/provider/asymmetric/rsa/CipherSpi$PKCS1v1_5Padding;,
        Lorg/spongycastle/jcajce/provider/asymmetric/rsa/CipherSpi$NoPadding;
    }
.end annotation


# instance fields
.field private c:Lorg/spongycastle/crypto/AsymmetricBlockCipher;

.field private d:Ljava/security/spec/AlgorithmParameterSpec;

.field private e:Ljava/security/AlgorithmParameters;

.field private f:Z

.field private g:Z

.field private h:Ljava/io/ByteArrayOutputStream;


# direct methods
.method public constructor <init>(Ljavax/crypto/spec/OAEPParameterSpec;)V
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 57
    invoke-direct {p0}, Lorg/spongycastle/jcajce/provider/asymmetric/util/BaseCipherSpi;-><init>()V

    .line 45
    iput-boolean v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/CipherSpi;->f:Z

    .line 46
    iput-boolean v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/CipherSpi;->g:Z

    .line 47
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    iput-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/CipherSpi;->h:Ljava/io/ByteArrayOutputStream;

    .line 60
    :try_start_0
    invoke-direct {p0, p1}, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/CipherSpi;->a(Ljavax/crypto/spec/OAEPParameterSpec;)V
    :try_end_0
    .catch Ljavax/crypto/NoSuchPaddingException; {:try_start_0 .. :try_end_0} :catch_0

    .line 65
    return-void

    .line 62
    :catch_0
    move-exception v0

    .line 64
    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljavax/crypto/NoSuchPaddingException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public constructor <init>(Lorg/spongycastle/crypto/AsymmetricBlockCipher;)V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 51
    invoke-direct {p0}, Lorg/spongycastle/jcajce/provider/asymmetric/util/BaseCipherSpi;-><init>()V

    .line 45
    iput-boolean v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/CipherSpi;->f:Z

    .line 46
    iput-boolean v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/CipherSpi;->g:Z

    .line 47
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    iput-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/CipherSpi;->h:Ljava/io/ByteArrayOutputStream;

    .line 52
    iput-object p1, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/CipherSpi;->c:Lorg/spongycastle/crypto/AsymmetricBlockCipher;

    .line 53
    return-void
.end method

.method public constructor <init>(ZZLorg/spongycastle/crypto/AsymmetricBlockCipher;)V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 72
    invoke-direct {p0}, Lorg/spongycastle/jcajce/provider/asymmetric/util/BaseCipherSpi;-><init>()V

    .line 45
    iput-boolean v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/CipherSpi;->f:Z

    .line 46
    iput-boolean v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/CipherSpi;->g:Z

    .line 47
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    iput-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/CipherSpi;->h:Ljava/io/ByteArrayOutputStream;

    .line 73
    iput-boolean p1, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/CipherSpi;->f:Z

    .line 74
    iput-boolean p2, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/CipherSpi;->g:Z

    .line 75
    iput-object p3, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/CipherSpi;->c:Lorg/spongycastle/crypto/AsymmetricBlockCipher;

    .line 76
    return-void
.end method

.method private a(Ljavax/crypto/spec/OAEPParameterSpec;)V
    .locals 4

    .prologue
    .line 82
    invoke-virtual {p1}, Ljavax/crypto/spec/OAEPParameterSpec;->getMGFParameters()Ljava/security/spec/AlgorithmParameterSpec;

    move-result-object v0

    check-cast v0, Ljava/security/spec/MGF1ParameterSpec;

    .line 83
    invoke-virtual {v0}, Ljava/security/spec/MGF1ParameterSpec;->getDigestAlgorithm()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lorg/spongycastle/jcajce/provider/util/DigestFactory;->a(Ljava/lang/String;)Lorg/spongycastle/crypto/Digest;

    move-result-object v1

    .line 85
    if-nez v1, :cond_0

    .line 87
    new-instance v1, Ljavax/crypto/NoSuchPaddingException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "no match on OAEP constructor for digest algorithm: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/security/spec/MGF1ParameterSpec;->getDigestAlgorithm()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljavax/crypto/NoSuchPaddingException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 90
    :cond_0
    new-instance v2, Lorg/spongycastle/crypto/encodings/OAEPEncoding;

    new-instance v3, Lorg/spongycastle/crypto/engines/RSABlindedEngine;

    invoke-direct {v3}, Lorg/spongycastle/crypto/engines/RSABlindedEngine;-><init>()V

    invoke-virtual {p1}, Ljavax/crypto/spec/OAEPParameterSpec;->getPSource()Ljavax/crypto/spec/PSource;

    move-result-object v0

    check-cast v0, Ljavax/crypto/spec/PSource$PSpecified;

    invoke-virtual {v0}, Ljavax/crypto/spec/PSource$PSpecified;->getValue()[B

    move-result-object v0

    invoke-direct {v2, v3, v1, v0}, Lorg/spongycastle/crypto/encodings/OAEPEncoding;-><init>(Lorg/spongycastle/crypto/AsymmetricBlockCipher;Lorg/spongycastle/crypto/Digest;[B)V

    iput-object v2, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/CipherSpi;->c:Lorg/spongycastle/crypto/AsymmetricBlockCipher;

    .line 91
    iput-object p1, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/CipherSpi;->d:Ljava/security/spec/AlgorithmParameterSpec;

    .line 92
    return-void
.end method


# virtual methods
.method protected engineDoFinal([BII[BI)I
    .locals 5

    .prologue
    const/4 v0, 0x0

    .line 482
    if-eqz p1, :cond_0

    .line 484
    iget-object v1, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/CipherSpi;->h:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {v1, p1, p2, p3}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    .line 487
    :cond_0
    iget-object v1, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/CipherSpi;->c:Lorg/spongycastle/crypto/AsymmetricBlockCipher;

    instance-of v1, v1, Lorg/spongycastle/crypto/engines/RSABlindedEngine;

    if-eqz v1, :cond_1

    .line 489
    iget-object v1, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/CipherSpi;->h:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->size()I

    move-result v1

    iget-object v2, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/CipherSpi;->c:Lorg/spongycastle/crypto/AsymmetricBlockCipher;

    invoke-interface {v2}, Lorg/spongycastle/crypto/AsymmetricBlockCipher;->a()I

    move-result v2

    add-int/lit8 v2, v2, 0x1

    if-le v1, v2, :cond_2

    .line 491
    new-instance v0, Ljava/lang/ArrayIndexOutOfBoundsException;

    const-string v1, "too much data for RSA block"

    invoke-direct {v0, v1}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 496
    :cond_1
    iget-object v1, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/CipherSpi;->h:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->size()I

    move-result v1

    iget-object v2, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/CipherSpi;->c:Lorg/spongycastle/crypto/AsymmetricBlockCipher;

    invoke-interface {v2}, Lorg/spongycastle/crypto/AsymmetricBlockCipher;->a()I

    move-result v2

    if-le v1, v2, :cond_2

    .line 498
    new-instance v0, Ljava/lang/ArrayIndexOutOfBoundsException;

    const-string v1, "too much data for RSA block"

    invoke-direct {v0, v1}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 506
    :cond_2
    :try_start_0
    iget-object v1, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/CipherSpi;->h:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v1

    .line 507
    iget-object v2, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/CipherSpi;->h:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->reset()V

    .line 509
    iget-object v2, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/CipherSpi;->c:Lorg/spongycastle/crypto/AsymmetricBlockCipher;

    const/4 v3, 0x0

    array-length v4, v1

    invoke-interface {v2, v1, v3, v4}, Lorg/spongycastle/crypto/AsymmetricBlockCipher;->a([BII)[B
    :try_end_0
    .catch Lorg/spongycastle/crypto/InvalidCipherTextException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    .line 516
    :goto_0
    array-length v2, v1

    if-eq v0, v2, :cond_3

    .line 518
    add-int v2, p5, v0

    aget-byte v3, v1, v0

    aput-byte v3, p4, v2

    .line 516
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 511
    :catch_0
    move-exception v0

    .line 513
    new-instance v1, Ljavax/crypto/BadPaddingException;

    invoke-virtual {v0}, Lorg/spongycastle/crypto/InvalidCipherTextException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljavax/crypto/BadPaddingException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 521
    :cond_3
    array-length v0, v1

    return v0
.end method

.method protected engineDoFinal([BII)[B
    .locals 4

    .prologue
    .line 440
    if-eqz p1, :cond_0

    .line 442
    iget-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/CipherSpi;->h:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    .line 445
    :cond_0
    iget-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/CipherSpi;->c:Lorg/spongycastle/crypto/AsymmetricBlockCipher;

    instance-of v0, v0, Lorg/spongycastle/crypto/engines/RSABlindedEngine;

    if-eqz v0, :cond_1

    .line 447
    iget-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/CipherSpi;->h:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->size()I

    move-result v0

    iget-object v1, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/CipherSpi;->c:Lorg/spongycastle/crypto/AsymmetricBlockCipher;

    invoke-interface {v1}, Lorg/spongycastle/crypto/AsymmetricBlockCipher;->a()I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    if-le v0, v1, :cond_2

    .line 449
    new-instance v0, Ljava/lang/ArrayIndexOutOfBoundsException;

    const-string v1, "too much data for RSA block"

    invoke-direct {v0, v1}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 454
    :cond_1
    iget-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/CipherSpi;->h:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->size()I

    move-result v0

    iget-object v1, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/CipherSpi;->c:Lorg/spongycastle/crypto/AsymmetricBlockCipher;

    invoke-interface {v1}, Lorg/spongycastle/crypto/AsymmetricBlockCipher;->a()I

    move-result v1

    if-le v0, v1, :cond_2

    .line 456
    new-instance v0, Ljava/lang/ArrayIndexOutOfBoundsException;

    const-string v1, "too much data for RSA block"

    invoke-direct {v0, v1}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 462
    :cond_2
    :try_start_0
    iget-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/CipherSpi;->h:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    .line 464
    iget-object v1, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/CipherSpi;->h:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->reset()V

    .line 466
    iget-object v1, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/CipherSpi;->c:Lorg/spongycastle/crypto/AsymmetricBlockCipher;

    const/4 v2, 0x0

    array-length v3, v0

    invoke-interface {v1, v0, v2, v3}, Lorg/spongycastle/crypto/AsymmetricBlockCipher;->a([BII)[B
    :try_end_0
    .catch Lorg/spongycastle/crypto/InvalidCipherTextException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 468
    :catch_0
    move-exception v0

    .line 470
    new-instance v1, Ljavax/crypto/BadPaddingException;

    invoke-virtual {v0}, Lorg/spongycastle/crypto/InvalidCipherTextException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljavax/crypto/BadPaddingException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method protected engineGetBlockSize()I
    .locals 2

    .prologue
    .line 98
    :try_start_0
    iget-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/CipherSpi;->c:Lorg/spongycastle/crypto/AsymmetricBlockCipher;

    invoke-interface {v0}, Lorg/spongycastle/crypto/AsymmetricBlockCipher;->a()I
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    return v0

    .line 102
    :catch_0
    move-exception v0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "RSA Cipher not initialised"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method protected engineGetKeySize(Ljava/security/Key;)I
    .locals 2

    .prologue
    .line 109
    instance-of v0, p1, Ljava/security/interfaces/RSAPrivateKey;

    if-eqz v0, :cond_0

    .line 111
    check-cast p1, Ljava/security/interfaces/RSAPrivateKey;

    .line 113
    invoke-interface {p1}, Ljava/security/interfaces/RSAPrivateKey;->getModulus()Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigInteger;->bitLength()I

    move-result v0

    .line 119
    :goto_0
    return v0

    .line 115
    :cond_0
    instance-of v0, p1, Ljava/security/interfaces/RSAPublicKey;

    if-eqz v0, :cond_1

    .line 117
    check-cast p1, Ljava/security/interfaces/RSAPublicKey;

    .line 119
    invoke-interface {p1}, Ljava/security/interfaces/RSAPublicKey;->getModulus()Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigInteger;->bitLength()I

    move-result v0

    goto :goto_0

    .line 122
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "not an RSA key!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method protected engineGetOutputSize(I)I
    .locals 2

    .prologue
    .line 130
    :try_start_0
    iget-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/CipherSpi;->c:Lorg/spongycastle/crypto/AsymmetricBlockCipher;

    invoke-interface {v0}, Lorg/spongycastle/crypto/AsymmetricBlockCipher;->b()I
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    return v0

    .line 134
    :catch_0
    move-exception v0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "RSA Cipher not initialised"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method protected engineGetParameters()Ljava/security/AlgorithmParameters;
    .locals 2

    .prologue
    .line 140
    iget-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/CipherSpi;->e:Ljava/security/AlgorithmParameters;

    if-nez v0, :cond_0

    .line 142
    iget-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/CipherSpi;->d:Ljava/security/spec/AlgorithmParameterSpec;

    if-eqz v0, :cond_0

    .line 146
    :try_start_0
    const-string v0, "OAEP"

    sget-object v1, Lorg/spongycastle/jce/provider/BouncyCastleProvider;->a:Ljava/lang/String;

    invoke-static {v0, v1}, Ljava/security/AlgorithmParameters;->getInstance(Ljava/lang/String;Ljava/lang/String;)Ljava/security/AlgorithmParameters;

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/CipherSpi;->e:Ljava/security/AlgorithmParameters;

    .line 147
    iget-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/CipherSpi;->e:Ljava/security/AlgorithmParameters;

    iget-object v1, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/CipherSpi;->d:Ljava/security/spec/AlgorithmParameterSpec;

    invoke-virtual {v0, v1}, Ljava/security/AlgorithmParameters;->init(Ljava/security/spec/AlgorithmParameterSpec;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 156
    :cond_0
    iget-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/CipherSpi;->e:Ljava/security/AlgorithmParameters;

    return-object v0

    .line 149
    :catch_0
    move-exception v0

    .line 151
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method protected engineInit(ILjava/security/Key;Ljava/security/AlgorithmParameters;Ljava/security/SecureRandom;)V
    .locals 4

    .prologue
    .line 347
    const/4 v0, 0x0

    .line 349
    if-eqz p3, :cond_0

    .line 353
    :try_start_0
    const-class v0, Ljavax/crypto/spec/OAEPParameterSpec;

    invoke-virtual {p3, v0}, Ljava/security/AlgorithmParameters;->getParameterSpec(Ljava/lang/Class;)Ljava/security/spec/AlgorithmParameterSpec;
    :try_end_0
    .catch Ljava/security/spec/InvalidParameterSpecException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 361
    :cond_0
    iput-object p3, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/CipherSpi;->e:Ljava/security/AlgorithmParameters;

    .line 362
    invoke-virtual {p0, p1, p2, v0, p4}, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/CipherSpi;->engineInit(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;Ljava/security/SecureRandom;)V

    .line 363
    return-void

    .line 355
    :catch_0
    move-exception v0

    .line 357
    new-instance v1, Ljava/security/InvalidAlgorithmParameterException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "cannot recognise parameters: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/security/spec/InvalidParameterSpecException;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method protected engineInit(ILjava/security/Key;Ljava/security/SecureRandom;)V
    .locals 4

    .prologue
    .line 373
    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p0, p1, p2, v0, p3}, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/CipherSpi;->engineInit(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;Ljava/security/SecureRandom;)V
    :try_end_0
    .catch Ljava/security/InvalidAlgorithmParameterException; {:try_start_0 .. :try_end_0} :catch_0

    .line 379
    return-void

    .line 375
    :catch_0
    move-exception v0

    .line 378
    new-instance v1, Ljava/security/InvalidKeyException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Eeeek! "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/security/InvalidAlgorithmParameterException;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Ljava/security/InvalidKeyException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method protected engineInit(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;Ljava/security/SecureRandom;)V
    .locals 7

    .prologue
    const/4 v6, 0x1

    .line 247
    if-eqz p3, :cond_0

    instance-of v0, p3, Ljavax/crypto/spec/OAEPParameterSpec;

    if-eqz v0, :cond_a

    .line 249
    :cond_0
    instance-of v0, p2, Ljava/security/interfaces/RSAPublicKey;

    if-eqz v0, :cond_2

    .line 251
    iget-boolean v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/CipherSpi;->g:Z

    if-eqz v0, :cond_1

    if-ne p1, v6, :cond_1

    .line 253
    new-instance v0, Ljava/security/InvalidKeyException;

    const-string v1, "mode 1 requires RSAPrivateKey"

    invoke-direct {v0, v1}, Ljava/security/InvalidKeyException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 257
    :cond_1
    check-cast p2, Ljava/security/interfaces/RSAPublicKey;

    invoke-static {p2}, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/RSAUtil;->a(Ljava/security/interfaces/RSAPublicKey;)Lorg/spongycastle/crypto/params/RSAKeyParameters;

    move-result-object v2

    .line 274
    :goto_0
    if-eqz p3, :cond_9

    move-object v0, p3

    .line 276
    check-cast v0, Ljavax/crypto/spec/OAEPParameterSpec;

    .line 278
    iput-object p3, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/CipherSpi;->d:Ljava/security/spec/AlgorithmParameterSpec;

    .line 280
    invoke-virtual {v0}, Ljavax/crypto/spec/OAEPParameterSpec;->getMGFAlgorithm()Ljava/lang/String;

    move-result-object v1

    const-string v3, "MGF1"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_5

    invoke-virtual {v0}, Ljavax/crypto/spec/OAEPParameterSpec;->getMGFAlgorithm()Ljava/lang/String;

    move-result-object v1

    sget-object v3, Lorg/spongycastle/asn1/pkcs/PKCSObjectIdentifiers;->H_:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v3}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    .line 282
    new-instance v0, Ljava/security/InvalidAlgorithmParameterException;

    const-string v1, "unknown mask generation function specified"

    invoke-direct {v0, v1}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 259
    :cond_2
    instance-of v0, p2, Ljava/security/interfaces/RSAPrivateKey;

    if-eqz v0, :cond_4

    .line 261
    iget-boolean v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/CipherSpi;->f:Z

    if-eqz v0, :cond_3

    if-ne p1, v6, :cond_3

    .line 263
    new-instance v0, Ljava/security/InvalidKeyException;

    const-string v1, "mode 2 requires RSAPublicKey"

    invoke-direct {v0, v1}, Ljava/security/InvalidKeyException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 267
    :cond_3
    check-cast p2, Ljava/security/interfaces/RSAPrivateKey;

    invoke-static {p2}, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/RSAUtil;->a(Ljava/security/interfaces/RSAPrivateKey;)Lorg/spongycastle/crypto/params/RSAKeyParameters;

    move-result-object v2

    goto :goto_0

    .line 271
    :cond_4
    new-instance v0, Ljava/security/InvalidKeyException;

    const-string v1, "unknown key type passed to RSA"

    invoke-direct {v0, v1}, Ljava/security/InvalidKeyException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 285
    :cond_5
    invoke-virtual {v0}, Ljavax/crypto/spec/OAEPParameterSpec;->getMGFParameters()Ljava/security/spec/AlgorithmParameterSpec;

    move-result-object v1

    instance-of v1, v1, Ljava/security/spec/MGF1ParameterSpec;

    if-nez v1, :cond_6

    .line 287
    new-instance v0, Ljava/security/InvalidAlgorithmParameterException;

    const-string v1, "unkown MGF parameters"

    invoke-direct {v0, v1}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 290
    :cond_6
    invoke-virtual {v0}, Ljavax/crypto/spec/OAEPParameterSpec;->getDigestAlgorithm()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lorg/spongycastle/jcajce/provider/util/DigestFactory;->a(Ljava/lang/String;)Lorg/spongycastle/crypto/Digest;

    move-result-object v3

    .line 292
    if-nez v3, :cond_7

    .line 294
    new-instance v1, Ljava/security/InvalidAlgorithmParameterException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "no match on digest algorithm: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljavax/crypto/spec/OAEPParameterSpec;->getDigestAlgorithm()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 297
    :cond_7
    invoke-virtual {v0}, Ljavax/crypto/spec/OAEPParameterSpec;->getMGFParameters()Ljava/security/spec/AlgorithmParameterSpec;

    move-result-object v1

    check-cast v1, Ljava/security/spec/MGF1ParameterSpec;

    .line 298
    invoke-virtual {v1}, Ljava/security/spec/MGF1ParameterSpec;->getDigestAlgorithm()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lorg/spongycastle/jcajce/provider/util/DigestFactory;->a(Ljava/lang/String;)Lorg/spongycastle/crypto/Digest;

    move-result-object v4

    .line 300
    if-nez v4, :cond_8

    .line 302
    new-instance v0, Ljava/security/InvalidAlgorithmParameterException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "no match on MGF digest algorithm: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/security/spec/MGF1ParameterSpec;->getDigestAlgorithm()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 305
    :cond_8
    new-instance v1, Lorg/spongycastle/crypto/encodings/OAEPEncoding;

    new-instance v5, Lorg/spongycastle/crypto/engines/RSABlindedEngine;

    invoke-direct {v5}, Lorg/spongycastle/crypto/engines/RSABlindedEngine;-><init>()V

    invoke-virtual {v0}, Ljavax/crypto/spec/OAEPParameterSpec;->getPSource()Ljavax/crypto/spec/PSource;

    move-result-object v0

    check-cast v0, Ljavax/crypto/spec/PSource$PSpecified;

    invoke-virtual {v0}, Ljavax/crypto/spec/PSource$PSpecified;->getValue()[B

    move-result-object v0

    invoke-direct {v1, v5, v3, v4, v0}, Lorg/spongycastle/crypto/encodings/OAEPEncoding;-><init>(Lorg/spongycastle/crypto/AsymmetricBlockCipher;Lorg/spongycastle/crypto/Digest;Lorg/spongycastle/crypto/Digest;[B)V

    iput-object v1, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/CipherSpi;->c:Lorg/spongycastle/crypto/AsymmetricBlockCipher;

    .line 313
    :cond_9
    iget-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/CipherSpi;->c:Lorg/spongycastle/crypto/AsymmetricBlockCipher;

    instance-of v0, v0, Lorg/spongycastle/crypto/engines/RSABlindedEngine;

    if-nez v0, :cond_c

    .line 315
    if-eqz p4, :cond_b

    .line 317
    new-instance v0, Lorg/spongycastle/crypto/params/ParametersWithRandom;

    invoke-direct {v0, v2, p4}, Lorg/spongycastle/crypto/params/ParametersWithRandom;-><init>(Lorg/spongycastle/crypto/CipherParameters;Ljava/security/SecureRandom;)V

    .line 325
    :goto_1
    packed-switch p1, :pswitch_data_0

    .line 336
    new-instance v0, Ljava/security/InvalidParameterException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "unknown opmode "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " passed to RSA"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/security/InvalidParameterException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 310
    :cond_a
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "unknown parameter type."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 321
    :cond_b
    new-instance v0, Lorg/spongycastle/crypto/params/ParametersWithRandom;

    new-instance v1, Ljava/security/SecureRandom;

    invoke-direct {v1}, Ljava/security/SecureRandom;-><init>()V

    invoke-direct {v0, v2, v1}, Lorg/spongycastle/crypto/params/ParametersWithRandom;-><init>(Lorg/spongycastle/crypto/CipherParameters;Ljava/security/SecureRandom;)V

    goto :goto_1

    .line 329
    :pswitch_0
    iget-object v1, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/CipherSpi;->c:Lorg/spongycastle/crypto/AsymmetricBlockCipher;

    invoke-interface {v1, v6, v0}, Lorg/spongycastle/crypto/AsymmetricBlockCipher;->a(ZLorg/spongycastle/crypto/CipherParameters;)V

    .line 334
    :goto_2
    return-void

    .line 333
    :pswitch_1
    iget-object v1, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/CipherSpi;->c:Lorg/spongycastle/crypto/AsymmetricBlockCipher;

    const/4 v2, 0x0

    invoke-interface {v1, v2, v0}, Lorg/spongycastle/crypto/AsymmetricBlockCipher;->a(ZLorg/spongycastle/crypto/CipherParameters;)V

    goto :goto_2

    :cond_c
    move-object v0, v2

    goto :goto_1

    .line 325
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method protected engineSetMode(Ljava/lang/String;)V
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 163
    invoke-static {p1}, Lorg/spongycastle/util/Strings;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 165
    const-string v1, "NONE"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "ECB"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 180
    :cond_0
    :goto_0
    return-void

    .line 170
    :cond_1
    const-string v1, "1"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 172
    iput-boolean v3, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/CipherSpi;->g:Z

    .line 173
    iput-boolean v2, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/CipherSpi;->f:Z

    goto :goto_0

    .line 176
    :cond_2
    const-string v1, "2"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 178
    iput-boolean v2, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/CipherSpi;->g:Z

    .line 179
    iput-boolean v3, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/CipherSpi;->f:Z

    goto :goto_0

    .line 183
    :cond_3
    new-instance v0, Ljava/security/NoSuchAlgorithmException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "can\'t support mode "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/security/NoSuchAlgorithmException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method protected engineSetPadding(Ljava/lang/String;)V
    .locals 5

    .prologue
    .line 190
    invoke-static {p1}, Lorg/spongycastle/util/Strings;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 192
    const-string v1, "NOPADDING"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 194
    new-instance v0, Lorg/spongycastle/crypto/engines/RSABlindedEngine;

    invoke-direct {v0}, Lorg/spongycastle/crypto/engines/RSABlindedEngine;-><init>()V

    iput-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/CipherSpi;->c:Lorg/spongycastle/crypto/AsymmetricBlockCipher;

    .line 230
    :goto_0
    return-void

    .line 196
    :cond_0
    const-string v1, "PKCS1PADDING"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 198
    new-instance v0, Lorg/spongycastle/crypto/encodings/PKCS1Encoding;

    new-instance v1, Lorg/spongycastle/crypto/engines/RSABlindedEngine;

    invoke-direct {v1}, Lorg/spongycastle/crypto/engines/RSABlindedEngine;-><init>()V

    invoke-direct {v0, v1}, Lorg/spongycastle/crypto/encodings/PKCS1Encoding;-><init>(Lorg/spongycastle/crypto/AsymmetricBlockCipher;)V

    iput-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/CipherSpi;->c:Lorg/spongycastle/crypto/AsymmetricBlockCipher;

    goto :goto_0

    .line 200
    :cond_1
    const-string v1, "ISO9796-1PADDING"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 202
    new-instance v0, Lorg/spongycastle/crypto/encodings/ISO9796d1Encoding;

    new-instance v1, Lorg/spongycastle/crypto/engines/RSABlindedEngine;

    invoke-direct {v1}, Lorg/spongycastle/crypto/engines/RSABlindedEngine;-><init>()V

    invoke-direct {v0, v1}, Lorg/spongycastle/crypto/encodings/ISO9796d1Encoding;-><init>(Lorg/spongycastle/crypto/AsymmetricBlockCipher;)V

    iput-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/CipherSpi;->c:Lorg/spongycastle/crypto/AsymmetricBlockCipher;

    goto :goto_0

    .line 204
    :cond_2
    const-string v1, "OAEPWITHMD5ANDMGF1PADDING"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 206
    new-instance v0, Ljavax/crypto/spec/OAEPParameterSpec;

    const-string v1, "MD5"

    const-string v2, "MGF1"

    new-instance v3, Ljava/security/spec/MGF1ParameterSpec;

    const-string v4, "MD5"

    invoke-direct {v3, v4}, Ljava/security/spec/MGF1ParameterSpec;-><init>(Ljava/lang/String;)V

    sget-object v4, Ljavax/crypto/spec/PSource$PSpecified;->DEFAULT:Ljavax/crypto/spec/PSource$PSpecified;

    invoke-direct {v0, v1, v2, v3, v4}, Ljavax/crypto/spec/OAEPParameterSpec;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/security/spec/AlgorithmParameterSpec;Ljavax/crypto/spec/PSource;)V

    invoke-direct {p0, v0}, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/CipherSpi;->a(Ljavax/crypto/spec/OAEPParameterSpec;)V

    goto :goto_0

    .line 208
    :cond_3
    const-string v1, "OAEPPADDING"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 210
    sget-object v0, Ljavax/crypto/spec/OAEPParameterSpec;->DEFAULT:Ljavax/crypto/spec/OAEPParameterSpec;

    invoke-direct {p0, v0}, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/CipherSpi;->a(Ljavax/crypto/spec/OAEPParameterSpec;)V

    goto :goto_0

    .line 212
    :cond_4
    const-string v1, "OAEPWITHSHA1ANDMGF1PADDING"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    const-string v1, "OAEPWITHSHA-1ANDMGF1PADDING"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    .line 214
    :cond_5
    sget-object v0, Ljavax/crypto/spec/OAEPParameterSpec;->DEFAULT:Ljavax/crypto/spec/OAEPParameterSpec;

    invoke-direct {p0, v0}, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/CipherSpi;->a(Ljavax/crypto/spec/OAEPParameterSpec;)V

    goto :goto_0

    .line 216
    :cond_6
    const-string v1, "OAEPWITHSHA224ANDMGF1PADDING"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    const-string v1, "OAEPWITHSHA-224ANDMGF1PADDING"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_8

    .line 218
    :cond_7
    new-instance v0, Ljavax/crypto/spec/OAEPParameterSpec;

    const-string v1, "SHA-224"

    const-string v2, "MGF1"

    new-instance v3, Ljava/security/spec/MGF1ParameterSpec;

    const-string v4, "SHA-224"

    invoke-direct {v3, v4}, Ljava/security/spec/MGF1ParameterSpec;-><init>(Ljava/lang/String;)V

    sget-object v4, Ljavax/crypto/spec/PSource$PSpecified;->DEFAULT:Ljavax/crypto/spec/PSource$PSpecified;

    invoke-direct {v0, v1, v2, v3, v4}, Ljavax/crypto/spec/OAEPParameterSpec;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/security/spec/AlgorithmParameterSpec;Ljavax/crypto/spec/PSource;)V

    invoke-direct {p0, v0}, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/CipherSpi;->a(Ljavax/crypto/spec/OAEPParameterSpec;)V

    goto/16 :goto_0

    .line 220
    :cond_8
    const-string v1, "OAEPWITHSHA256ANDMGF1PADDING"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    const-string v1, "OAEPWITHSHA-256ANDMGF1PADDING"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_a

    .line 222
    :cond_9
    new-instance v0, Ljavax/crypto/spec/OAEPParameterSpec;

    const-string v1, "SHA-256"

    const-string v2, "MGF1"

    sget-object v3, Ljava/security/spec/MGF1ParameterSpec;->SHA256:Ljava/security/spec/MGF1ParameterSpec;

    sget-object v4, Ljavax/crypto/spec/PSource$PSpecified;->DEFAULT:Ljavax/crypto/spec/PSource$PSpecified;

    invoke-direct {v0, v1, v2, v3, v4}, Ljavax/crypto/spec/OAEPParameterSpec;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/security/spec/AlgorithmParameterSpec;Ljavax/crypto/spec/PSource;)V

    invoke-direct {p0, v0}, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/CipherSpi;->a(Ljavax/crypto/spec/OAEPParameterSpec;)V

    goto/16 :goto_0

    .line 224
    :cond_a
    const-string v1, "OAEPWITHSHA384ANDMGF1PADDING"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    const-string v1, "OAEPWITHSHA-384ANDMGF1PADDING"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_c

    .line 226
    :cond_b
    new-instance v0, Ljavax/crypto/spec/OAEPParameterSpec;

    const-string v1, "SHA-384"

    const-string v2, "MGF1"

    sget-object v3, Ljava/security/spec/MGF1ParameterSpec;->SHA384:Ljava/security/spec/MGF1ParameterSpec;

    sget-object v4, Ljavax/crypto/spec/PSource$PSpecified;->DEFAULT:Ljavax/crypto/spec/PSource$PSpecified;

    invoke-direct {v0, v1, v2, v3, v4}, Ljavax/crypto/spec/OAEPParameterSpec;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/security/spec/AlgorithmParameterSpec;Ljavax/crypto/spec/PSource;)V

    invoke-direct {p0, v0}, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/CipherSpi;->a(Ljavax/crypto/spec/OAEPParameterSpec;)V

    goto/16 :goto_0

    .line 228
    :cond_c
    const-string v1, "OAEPWITHSHA512ANDMGF1PADDING"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    const-string v1, "OAEPWITHSHA-512ANDMGF1PADDING"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_e

    .line 230
    :cond_d
    new-instance v0, Ljavax/crypto/spec/OAEPParameterSpec;

    const-string v1, "SHA-512"

    const-string v2, "MGF1"

    sget-object v3, Ljava/security/spec/MGF1ParameterSpec;->SHA512:Ljava/security/spec/MGF1ParameterSpec;

    sget-object v4, Ljavax/crypto/spec/PSource$PSpecified;->DEFAULT:Ljavax/crypto/spec/PSource$PSpecified;

    invoke-direct {v0, v1, v2, v3, v4}, Ljavax/crypto/spec/OAEPParameterSpec;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/security/spec/AlgorithmParameterSpec;Ljavax/crypto/spec/PSource;)V

    invoke-direct {p0, v0}, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/CipherSpi;->a(Ljavax/crypto/spec/OAEPParameterSpec;)V

    goto/16 :goto_0

    .line 234
    :cond_e
    new-instance v0, Ljavax/crypto/NoSuchPaddingException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " unavailable with RSA."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljavax/crypto/NoSuchPaddingException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method protected engineUpdate([BII[BI)I
    .locals 2

    .prologue
    .line 414
    iget-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/CipherSpi;->h:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    .line 416
    iget-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/CipherSpi;->c:Lorg/spongycastle/crypto/AsymmetricBlockCipher;

    instance-of v0, v0, Lorg/spongycastle/crypto/engines/RSABlindedEngine;

    if-eqz v0, :cond_0

    .line 418
    iget-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/CipherSpi;->h:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->size()I

    move-result v0

    iget-object v1, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/CipherSpi;->c:Lorg/spongycastle/crypto/AsymmetricBlockCipher;

    invoke-interface {v1}, Lorg/spongycastle/crypto/AsymmetricBlockCipher;->a()I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    if-le v0, v1, :cond_1

    .line 420
    new-instance v0, Ljava/lang/ArrayIndexOutOfBoundsException;

    const-string v1, "too much data for RSA block"

    invoke-direct {v0, v1}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 425
    :cond_0
    iget-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/CipherSpi;->h:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->size()I

    move-result v0

    iget-object v1, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/CipherSpi;->c:Lorg/spongycastle/crypto/AsymmetricBlockCipher;

    invoke-interface {v1}, Lorg/spongycastle/crypto/AsymmetricBlockCipher;->a()I

    move-result v1

    if-le v0, v1, :cond_1

    .line 427
    new-instance v0, Ljava/lang/ArrayIndexOutOfBoundsException;

    const-string v1, "too much data for RSA block"

    invoke-direct {v0, v1}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 431
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method protected engineUpdate([BII)[B
    .locals 2

    .prologue
    .line 387
    iget-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/CipherSpi;->h:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    .line 389
    iget-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/CipherSpi;->c:Lorg/spongycastle/crypto/AsymmetricBlockCipher;

    instance-of v0, v0, Lorg/spongycastle/crypto/engines/RSABlindedEngine;

    if-eqz v0, :cond_0

    .line 391
    iget-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/CipherSpi;->h:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->size()I

    move-result v0

    iget-object v1, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/CipherSpi;->c:Lorg/spongycastle/crypto/AsymmetricBlockCipher;

    invoke-interface {v1}, Lorg/spongycastle/crypto/AsymmetricBlockCipher;->a()I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    if-le v0, v1, :cond_1

    .line 393
    new-instance v0, Ljava/lang/ArrayIndexOutOfBoundsException;

    const-string v1, "too much data for RSA block"

    invoke-direct {v0, v1}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 398
    :cond_0
    iget-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/CipherSpi;->h:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->size()I

    move-result v0

    iget-object v1, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/CipherSpi;->c:Lorg/spongycastle/crypto/AsymmetricBlockCipher;

    invoke-interface {v1}, Lorg/spongycastle/crypto/AsymmetricBlockCipher;->a()I

    move-result v1

    if-le v0, v1, :cond_1

    .line 400
    new-instance v0, Ljava/lang/ArrayIndexOutOfBoundsException;

    const-string v1, "too much data for RSA block"

    invoke-direct {v0, v1}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 404
    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method
