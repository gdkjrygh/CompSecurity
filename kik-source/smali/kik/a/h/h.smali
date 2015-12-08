.class public final Lkik/a/h/h;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lorg/c/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 52
    const-string v0, "SecurityUtils"

    invoke-static {v0}, Lorg/c/c;->a(Ljava/lang/String;)Lorg/c/b;

    move-result-object v0

    sput-object v0, Lkik/a/h/h;->a:Lorg/c/b;

    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/security/SecureRandom;)Ljava/security/KeyPair;
    .locals 3

    .prologue
    .line 78
    invoke-static {p0}, Lorg/spongycastle/jce/ECNamedCurveTable;->a(Ljava/lang/String;)Lorg/spongycastle/jce/spec/ECNamedCurveParameterSpec;

    move-result-object v0

    .line 80
    if-nez v0, :cond_0

    .line 81
    new-instance v0, Lorg/bouncycastle/openssl/EncryptionException;

    const-string v1, "Unknown curve"

    invoke-direct {v0, v1}, Lorg/bouncycastle/openssl/EncryptionException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 83
    :cond_0
    new-instance v1, Lorg/spongycastle/jce/provider/BouncyCastleProvider;

    invoke-direct {v1}, Lorg/spongycastle/jce/provider/BouncyCastleProvider;-><init>()V

    invoke-static {v1}, Ljava/security/Security;->addProvider(Ljava/security/Provider;)I

    .line 84
    const-string v1, "EC"

    const-string v2, "SC"

    invoke-static {v1, v2}, Ljava/security/KeyPairGenerator;->getInstance(Ljava/lang/String;Ljava/lang/String;)Ljava/security/KeyPairGenerator;

    move-result-object v1

    .line 86
    invoke-virtual {v1, v0, p1}, Ljava/security/KeyPairGenerator;->initialize(Ljava/security/spec/AlgorithmParameterSpec;Ljava/security/SecureRandom;)V

    .line 88
    invoke-virtual {v1}, Ljava/security/KeyPairGenerator;->generateKeyPair()Ljava/security/KeyPair;

    move-result-object v0

    return-object v0
.end method

.method public static a([B)Lorg/spongycastle/jce/interfaces/ECPublicKey;
    .locals 2

    .prologue
    .line 124
    const-string v0, "EC"

    const-string v1, "SC"

    invoke-static {v0, v1}, Ljava/security/KeyFactory;->getInstance(Ljava/lang/String;Ljava/lang/String;)Ljava/security/KeyFactory;

    move-result-object v0

    .line 126
    new-instance v1, Ljava/security/spec/X509EncodedKeySpec;

    invoke-direct {v1, p0}, Ljava/security/spec/X509EncodedKeySpec;-><init>([B)V

    invoke-virtual {v0, v1}, Ljava/security/KeyFactory;->generatePublic(Ljava/security/spec/KeySpec;)Ljava/security/PublicKey;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/jce/interfaces/ECPublicKey;

    .line 128
    return-object v0
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)[B
    .locals 5

    .prologue
    .line 58
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 59
    new-instance v2, Lorg/bouncycastle/crypto/generators/PKCS5S2ParametersGenerator;

    invoke-direct {v2}, Lorg/bouncycastle/crypto/generators/PKCS5S2ParametersGenerator;-><init>()V

    .line 61
    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    invoke-static {v0}, Lorg/bouncycastle/crypto/PBEParametersGenerator;->PKCS5PasswordToBytes([C)[B

    move-result-object v3

    .line 62
    const/4 v0, 0x0

    .line 65
    :try_start_0
    const-string v4, "UTF-8"

    invoke-virtual {v1, v4}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 70
    :goto_0
    const/16 v1, 0x2000

    invoke-virtual {v2, v3, v0, v1}, Lorg/bouncycastle/crypto/PBEParametersGenerator;->init([B[BI)V

    .line 71
    const/16 v0, 0x80

    invoke-virtual {v2, v0}, Lorg/bouncycastle/crypto/PBEParametersGenerator;->generateDerivedParameters(I)Lorg/bouncycastle/crypto/CipherParameters;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/crypto/params/KeyParameter;

    .line 73
    invoke-virtual {v0}, Lorg/bouncycastle/crypto/params/KeyParameter;->getKey()[B

    move-result-object v0

    return-object v0

    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method public static a(Lorg/spongycastle/jce/interfaces/ECPublicKey;Lorg/spongycastle/jce/interfaces/ECPrivateKey;)[B
    .locals 7

    .prologue
    .line 93
    new-instance v6, Lorg/spongycastle/crypto/agreement/ECDHCBasicAgreement;

    invoke-direct {v6}, Lorg/spongycastle/crypto/agreement/ECDHCBasicAgreement;-><init>()V

    .line 95
    invoke-interface {p1}, Lorg/spongycastle/jce/interfaces/ECPrivateKey;->b()Lorg/spongycastle/jce/spec/ECParameterSpec;

    move-result-object v5

    .line 97
    new-instance v0, Lorg/spongycastle/crypto/params/ECDomainParameters;

    invoke-virtual {v5}, Lorg/spongycastle/jce/spec/ECParameterSpec;->b()Lorg/spongycastle/math/ec/ECCurve;

    move-result-object v1

    invoke-virtual {v5}, Lorg/spongycastle/jce/spec/ECParameterSpec;->c()Lorg/spongycastle/math/ec/ECPoint;

    move-result-object v2

    invoke-virtual {v5}, Lorg/spongycastle/jce/spec/ECParameterSpec;->d()Ljava/math/BigInteger;

    move-result-object v3

    invoke-virtual {v5}, Lorg/spongycastle/jce/spec/ECParameterSpec;->e()Ljava/math/BigInteger;

    move-result-object v4

    invoke-virtual {v5}, Lorg/spongycastle/jce/spec/ECParameterSpec;->f()[B

    move-result-object v5

    invoke-direct/range {v0 .. v5}, Lorg/spongycastle/crypto/params/ECDomainParameters;-><init>(Lorg/spongycastle/math/ec/ECCurve;Lorg/spongycastle/math/ec/ECPoint;Ljava/math/BigInteger;Ljava/math/BigInteger;[B)V

    .line 98
    new-instance v1, Lorg/spongycastle/crypto/params/ECPrivateKeyParameters;

    invoke-interface {p1}, Lorg/spongycastle/jce/interfaces/ECPrivateKey;->c()Ljava/math/BigInteger;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Lorg/spongycastle/crypto/params/ECPrivateKeyParameters;-><init>(Ljava/math/BigInteger;Lorg/spongycastle/crypto/params/ECDomainParameters;)V

    .line 100
    invoke-virtual {v6, v1}, Lorg/spongycastle/crypto/agreement/ECDHCBasicAgreement;->a(Lorg/spongycastle/crypto/CipherParameters;)V

    .line 102
    new-instance v1, Lorg/spongycastle/crypto/params/ECPublicKeyParameters;

    invoke-interface {p0}, Lorg/spongycastle/jce/interfaces/ECPublicKey;->a()Lorg/spongycastle/math/ec/ECPoint;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Lorg/spongycastle/crypto/params/ECPublicKeyParameters;-><init>(Lorg/spongycastle/math/ec/ECPoint;Lorg/spongycastle/crypto/params/ECDomainParameters;)V

    .line 104
    invoke-virtual {v6, v1}, Lorg/spongycastle/crypto/agreement/ECDHCBasicAgreement;->b(Lorg/spongycastle/crypto/CipherParameters;)Ljava/math/BigInteger;

    move-result-object v0

    .line 105
    invoke-virtual {v0}, Ljava/math/BigInteger;->toByteArray()[B

    move-result-object v0

    .line 107
    invoke-interface {p0}, Lorg/spongycastle/jce/interfaces/ECPublicKey;->b()Lorg/spongycastle/jce/spec/ECParameterSpec;

    move-result-object v1

    invoke-virtual {v1}, Lorg/spongycastle/jce/spec/ECParameterSpec;->b()Lorg/spongycastle/math/ec/ECCurve;

    move-result-object v1

    invoke-virtual {v1}, Lorg/spongycastle/math/ec/ECCurve;->a()I

    move-result v1

    .line 108
    div-int/lit8 v1, v1, 0x8

    .line 110
    array-length v2, v0

    if-le v2, v1, :cond_0

    .line 111
    array-length v2, v0

    sub-int/2addr v2, v1

    invoke-static {v0, v2, v1}, Lkik/a/h/h;->a([BII)[B

    move-result-object v0

    .line 114
    :cond_0
    new-array v1, v1, [B

    .line 117
    const/4 v2, 0x0

    array-length v3, v1

    array-length v4, v0

    sub-int/2addr v3, v4

    array-length v4, v0

    invoke-static {v0, v2, v1, v3, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 119
    return-object v1
.end method

.method private static a([BI)[B
    .locals 4

    .prologue
    .line 219
    const/4 v0, 0x0

    .line 222
    :try_start_0
    const-string v1, "SHA-256"

    invoke-static {v1}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v1

    .line 224
    const/4 v2, 0x0

    invoke-virtual {v1, p0, v2, p1}, Ljava/security/MessageDigest;->update([BII)V

    .line 226
    invoke-virtual {v1}, Ljava/security/MessageDigest;->digest()[B
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 232
    :goto_0
    return-object v0

    .line 228
    :catch_0
    move-exception v1

    .line 229
    sget-object v2, Lkik/a/h/h;->a:Lorg/c/b;

    const-string v3, "SHA256 error"

    invoke-interface {v2, v3, v1}, Lorg/c/b;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method private static a([BII)[B
    .locals 3

    .prologue
    .line 237
    new-array v1, p2, [B

    .line 239
    const/4 v0, 0x0

    :goto_0
    if-ge v0, p2, :cond_0

    .line 240
    add-int v2, p1, v0

    aget-byte v2, p0, v2

    aput-byte v2, v1, v0

    .line 239
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 243
    :cond_0
    return-object v1
.end method

.method private static a([BI[BI[BII)[B
    .locals 7

    .prologue
    .line 152
    const/4 v6, 0x0

    .line 155
    :try_start_0
    new-instance v0, Lorg/bouncycastle/crypto/paddings/PaddedBufferedBlockCipher;

    new-instance v1, Lorg/bouncycastle/crypto/modes/CBCBlockCipher;

    new-instance v2, Lorg/bouncycastle/crypto/engines/AESEngine;

    invoke-direct {v2}, Lorg/bouncycastle/crypto/engines/AESEngine;-><init>()V

    invoke-direct {v1, v2}, Lorg/bouncycastle/crypto/modes/CBCBlockCipher;-><init>(Lorg/bouncycastle/crypto/BlockCipher;)V

    new-instance v2, Lorg/bouncycastle/crypto/paddings/PKCS7Padding;

    invoke-direct {v2}, Lorg/bouncycastle/crypto/paddings/PKCS7Padding;-><init>()V

    invoke-direct {v0, v1, v2}, Lorg/bouncycastle/crypto/paddings/PaddedBufferedBlockCipher;-><init>(Lorg/bouncycastle/crypto/BlockCipher;Lorg/bouncycastle/crypto/paddings/BlockCipherPadding;)V

    .line 156
    new-instance v1, Lorg/bouncycastle/crypto/params/ParametersWithIV;

    new-instance v2, Lorg/bouncycastle/crypto/params/KeyParameter;

    const/4 v3, 0x0

    invoke-direct {v2, p2, v3, p3}, Lorg/bouncycastle/crypto/params/KeyParameter;-><init>([BII)V

    invoke-direct {v1, v2, p4, p5, p6}, Lorg/bouncycastle/crypto/params/ParametersWithIV;-><init>(Lorg/bouncycastle/crypto/CipherParameters;[BII)V

    .line 158
    const/4 v2, 0x1

    invoke-virtual {v0, v2, v1}, Lorg/bouncycastle/crypto/paddings/PaddedBufferedBlockCipher;->init(ZLorg/bouncycastle/crypto/CipherParameters;)V

    .line 160
    invoke-virtual {v0, p1}, Lorg/bouncycastle/crypto/paddings/PaddedBufferedBlockCipher;->getOutputSize(I)I

    move-result v1

    .line 161
    new-array v4, v1, [B

    .line 162
    const/4 v2, 0x0

    const/4 v5, 0x0

    move-object v1, p0

    move v3, p1

    invoke-virtual/range {v0 .. v5}, Lorg/bouncycastle/crypto/paddings/PaddedBufferedBlockCipher;->processBytes([BII[BI)I

    move-result v1

    .line 163
    invoke-virtual {v0, v4, v1}, Lorg/bouncycastle/crypto/paddings/PaddedBufferedBlockCipher;->doFinal([BI)I

    move-result v0

    .line 165
    const/4 v2, 0x0

    add-int/2addr v0, v1

    invoke-static {v4, v2, v0}, Lkik/a/h/h;->a([BII)[B
    :try_end_0
    .catch Lorg/bouncycastle/crypto/InvalidCipherTextException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lorg/bouncycastle/crypto/RuntimeCryptoException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v0

    .line 174
    :goto_0
    return-object v0

    .line 167
    :catch_0
    move-exception v0

    .line 168
    sget-object v1, Lkik/a/h/h;->a:Lorg/c/b;

    const-string v2, "Failed to encrypt text"

    invoke-interface {v1, v2, v0}, Lorg/c/b;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    move-object v0, v6

    .line 172
    goto :goto_0

    .line 170
    :catch_1
    move-exception v0

    .line 171
    sget-object v1, Lkik/a/h/h;->a:Lorg/c/b;

    const-string v2, "Failed to decrypt text"

    invoke-interface {v1, v2, v0}, Lorg/c/b;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    move-object v0, v6

    goto :goto_0
.end method

.method public static a([B[B)[B
    .locals 3

    .prologue
    .line 248
    const-string v0, "HmacSHA1"

    invoke-static {v0}, Ljavax/crypto/Mac;->getInstance(Ljava/lang/String;)Ljavax/crypto/Mac;

    move-result-object v0

    .line 250
    new-instance v1, Ljavax/crypto/spec/SecretKeySpec;

    invoke-virtual {v0}, Ljavax/crypto/Mac;->getAlgorithm()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, p1, v2}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    .line 252
    invoke-virtual {v0, v1}, Ljavax/crypto/Mac;->init(Ljava/security/Key;)V

    .line 254
    invoke-virtual {v0, p0}, Ljavax/crypto/Mac;->doFinal([B)[B

    move-result-object v0

    return-object v0
.end method

.method public static a([B[BI[BII)[B
    .locals 7

    .prologue
    .line 147
    array-length v1, p0

    move-object v0, p0

    move-object v2, p1

    move v3, p2

    move-object v4, p3

    move v5, p4

    move v6, p5

    invoke-static/range {v0 .. v6}, Lkik/a/h/h;->a([BI[BI[BII)[B

    move-result-object v0

    return-object v0
.end method

.method public static a([B[B[B)[B
    .locals 6

    .prologue
    .line 142
    array-length v2, p1

    const/4 v4, 0x0

    array-length v5, p2

    move-object v0, p0

    move-object v1, p1

    move-object v3, p2

    invoke-static/range {v0 .. v5}, Lkik/a/h/h;->a([B[BI[BII)[B

    move-result-object v0

    return-object v0
.end method

.method public static b([B)Lorg/spongycastle/jce/interfaces/ECPrivateKey;
    .locals 2

    .prologue
    .line 133
    const-string v0, "EC"

    const-string v1, "SC"

    invoke-static {v0, v1}, Ljava/security/KeyFactory;->getInstance(Ljava/lang/String;Ljava/lang/String;)Ljava/security/KeyFactory;

    move-result-object v0

    .line 135
    new-instance v1, Ljava/security/spec/PKCS8EncodedKeySpec;

    invoke-direct {v1, p0}, Ljava/security/spec/PKCS8EncodedKeySpec;-><init>([B)V

    invoke-virtual {v0, v1}, Ljava/security/KeyFactory;->generatePrivate(Ljava/security/spec/KeySpec;)Ljava/security/PrivateKey;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/jce/interfaces/ECPrivateKey;

    .line 137
    return-object v0
.end method

.method public static b([B[B)[B
    .locals 3

    .prologue
    .line 259
    invoke-static {p0, p1}, Lkik/a/h/h;->a([B[B)[B

    move-result-object v0

    .line 261
    const/4 v1, 0x0

    const/4 v2, 0x5

    invoke-static {v0, v1, v2}, Lkik/a/h/h;->a([BII)[B

    move-result-object v0

    return-object v0
.end method

.method public static b([B[BI[BII)[B
    .locals 6

    .prologue
    .line 184
    :try_start_0
    new-instance v0, Lorg/bouncycastle/crypto/paddings/PaddedBufferedBlockCipher;

    new-instance v1, Lorg/bouncycastle/crypto/modes/CBCBlockCipher;

    new-instance v2, Lorg/bouncycastle/crypto/engines/AESEngine;

    invoke-direct {v2}, Lorg/bouncycastle/crypto/engines/AESEngine;-><init>()V

    invoke-direct {v1, v2}, Lorg/bouncycastle/crypto/modes/CBCBlockCipher;-><init>(Lorg/bouncycastle/crypto/BlockCipher;)V

    new-instance v2, Lorg/bouncycastle/crypto/paddings/PKCS7Padding;

    invoke-direct {v2}, Lorg/bouncycastle/crypto/paddings/PKCS7Padding;-><init>()V

    invoke-direct {v0, v1, v2}, Lorg/bouncycastle/crypto/paddings/PaddedBufferedBlockCipher;-><init>(Lorg/bouncycastle/crypto/BlockCipher;Lorg/bouncycastle/crypto/paddings/BlockCipherPadding;)V

    .line 188
    new-instance v1, Lorg/bouncycastle/crypto/params/ParametersWithIV;

    new-instance v2, Lorg/bouncycastle/crypto/params/KeyParameter;

    const/4 v3, 0x0

    invoke-direct {v2, p1, v3, p2}, Lorg/bouncycastle/crypto/params/KeyParameter;-><init>([BII)V

    invoke-direct {v1, v2, p3, p4, p5}, Lorg/bouncycastle/crypto/params/ParametersWithIV;-><init>(Lorg/bouncycastle/crypto/CipherParameters;[BII)V

    .line 190
    invoke-virtual {v0}, Lorg/bouncycastle/crypto/paddings/PaddedBufferedBlockCipher;->reset()V

    .line 191
    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Lorg/bouncycastle/crypto/paddings/PaddedBufferedBlockCipher;->init(ZLorg/bouncycastle/crypto/CipherParameters;)V

    .line 193
    array-length v1, p0

    invoke-virtual {v0, v1}, Lorg/bouncycastle/crypto/paddings/PaddedBufferedBlockCipher;->getOutputSize(I)I

    move-result v1

    .line 194
    new-array v4, v1, [B

    .line 195
    const/4 v2, 0x0

    array-length v3, p0

    const/4 v5, 0x0

    move-object v1, p0

    invoke-virtual/range {v0 .. v5}, Lorg/bouncycastle/crypto/paddings/PaddedBufferedBlockCipher;->processBytes([BII[BI)I

    move-result v1

    .line 196
    invoke-virtual {v0, v4, v1}, Lorg/bouncycastle/crypto/paddings/PaddedBufferedBlockCipher;->doFinal([BI)I

    move-result v0

    .line 198
    const/4 v2, 0x0

    add-int/2addr v0, v1

    invoke-static {v4, v2, v0}, Lkik/a/h/h;->a([BII)[B
    :try_end_0
    .catch Lorg/bouncycastle/crypto/InvalidCipherTextException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lorg/bouncycastle/crypto/RuntimeCryptoException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v0

    .line 209
    :goto_0
    return-object v0

    .line 202
    :catch_0
    move-exception v0

    .line 203
    sget-object v1, Lkik/a/h/h;->a:Lorg/c/b;

    const-string v2, "Failed to decrypt text"

    invoke-interface {v1, v2, v0}, Lorg/c/b;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 209
    :goto_1
    const/4 v0, 0x0

    goto :goto_0

    .line 205
    :catch_1
    move-exception v0

    .line 206
    sget-object v1, Lkik/a/h/h;->a:Lorg/c/b;

    const-string v2, "Failed to decrypt text"

    invoke-interface {v1, v2, v0}, Lorg/c/b;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1
.end method

.method public static b([B[B[B)[B
    .locals 6

    .prologue
    .line 179
    array-length v2, p1

    const/4 v4, 0x0

    array-length v5, p2

    move-object v0, p0

    move-object v1, p1

    move-object v3, p2

    invoke-static/range {v0 .. v5}, Lkik/a/h/h;->b([B[BI[BII)[B

    move-result-object v0

    return-object v0
.end method

.method public static c([B)[B
    .locals 1

    .prologue
    .line 214
    array-length v0, p0

    invoke-static {p0, v0}, Lkik/a/h/h;->a([BI)[B

    move-result-object v0

    return-object v0
.end method

.method public static c([B[B)[B
    .locals 3

    .prologue
    .line 266
    invoke-static {p0, p1}, Lkik/a/h/h;->a([B[B)[B

    move-result-object v0

    .line 268
    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lkik/a/h/h;->a([BII)[B

    move-result-object v0

    return-object v0
.end method
