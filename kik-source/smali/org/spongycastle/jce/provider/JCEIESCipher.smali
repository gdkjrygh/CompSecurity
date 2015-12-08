.class public Lorg/spongycastle/jce/provider/JCEIESCipher;
.super Ljavax/crypto/CipherSpi;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/spongycastle/jce/provider/JCEIESCipher$IES;,
        Lorg/spongycastle/jce/provider/JCEIESCipher$ECIES;,
        Lorg/spongycastle/jce/provider/JCEIESCipher$BrokenIES;,
        Lorg/spongycastle/jce/provider/JCEIESCipher$BrokenECIES;
    }
.end annotation


# instance fields
.field private a:Lorg/spongycastle/crypto/engines/IESEngine;

.field private b:I

.field private c:Ljava/io/ByteArrayOutputStream;

.field private d:Ljava/security/AlgorithmParameters;

.field private e:Lorg/spongycastle/jce/spec/IESParameterSpec;

.field private f:[Ljava/lang/Class;


# direct methods
.method public constructor <init>(Lorg/spongycastle/crypto/engines/IESEngine;)V
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 51
    invoke-direct {p0}, Ljavax/crypto/CipherSpi;-><init>()V

    .line 36
    const/4 v0, -0x1

    iput v0, p0, Lorg/spongycastle/jce/provider/JCEIESCipher;->b:I

    .line 37
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    iput-object v0, p0, Lorg/spongycastle/jce/provider/JCEIESCipher;->c:Ljava/io/ByteArrayOutputStream;

    .line 38
    iput-object v1, p0, Lorg/spongycastle/jce/provider/JCEIESCipher;->d:Ljava/security/AlgorithmParameters;

    .line 39
    iput-object v1, p0, Lorg/spongycastle/jce/provider/JCEIESCipher;->e:Lorg/spongycastle/jce/spec/IESParameterSpec;

    .line 44
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Class;

    const/4 v1, 0x0

    const-class v2, Lorg/spongycastle/jce/spec/IESParameterSpec;

    aput-object v2, v0, v1

    iput-object v0, p0, Lorg/spongycastle/jce/provider/JCEIESCipher;->f:[Ljava/lang/Class;

    .line 52
    iput-object p1, p0, Lorg/spongycastle/jce/provider/JCEIESCipher;->a:Lorg/spongycastle/crypto/engines/IESEngine;

    .line 53
    return-void
.end method


# virtual methods
.method protected engineDoFinal([BII[BI)I
    .locals 3

    .prologue
    .line 328
    if-eqz p3, :cond_0

    .line 330
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JCEIESCipher;->c:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    .line 335
    :cond_0
    :try_start_0
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JCEIESCipher;->c:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    .line 337
    iget-object v1, p0, Lorg/spongycastle/jce/provider/JCEIESCipher;->c:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->reset()V

    .line 339
    iget-object v1, p0, Lorg/spongycastle/jce/provider/JCEIESCipher;->a:Lorg/spongycastle/crypto/engines/IESEngine;

    array-length v2, v0

    invoke-virtual {v1, v0, v2}, Lorg/spongycastle/crypto/engines/IESEngine;->a([BI)[B

    move-result-object v0

    .line 341
    const/4 v1, 0x0

    array-length v2, v0

    invoke-static {v0, v1, p4, p5, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 343
    array-length v0, v0
    :try_end_0
    .catch Lorg/spongycastle/crypto/InvalidCipherTextException; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    .line 345
    :catch_0
    move-exception v0

    .line 347
    new-instance v1, Ljavax/crypto/BadPaddingException;

    invoke-virtual {v0}, Lorg/spongycastle/crypto/InvalidCipherTextException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljavax/crypto/BadPaddingException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method protected engineDoFinal([BII)[B
    .locals 3

    .prologue
    .line 301
    if-eqz p3, :cond_0

    .line 303
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JCEIESCipher;->c:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    .line 308
    :cond_0
    :try_start_0
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JCEIESCipher;->c:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    .line 310
    iget-object v1, p0, Lorg/spongycastle/jce/provider/JCEIESCipher;->c:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->reset()V

    .line 312
    iget-object v1, p0, Lorg/spongycastle/jce/provider/JCEIESCipher;->a:Lorg/spongycastle/crypto/engines/IESEngine;

    array-length v2, v0

    invoke-virtual {v1, v0, v2}, Lorg/spongycastle/crypto/engines/IESEngine;->a([BI)[B
    :try_end_0
    .catch Lorg/spongycastle/crypto/InvalidCipherTextException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 314
    :catch_0
    move-exception v0

    .line 316
    new-instance v1, Ljavax/crypto/BadPaddingException;

    invoke-virtual {v0}, Lorg/spongycastle/crypto/InvalidCipherTextException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljavax/crypto/BadPaddingException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method protected engineGetBlockSize()I
    .locals 1

    .prologue
    .line 57
    const/4 v0, 0x0

    return v0
.end method

.method protected engineGetIV()[B
    .locals 1

    .prologue
    .line 62
    const/4 v0, 0x0

    return-object v0
.end method

.method protected engineGetKeySize(Ljava/security/Key;)I
    .locals 2

    .prologue
    .line 68
    instance-of v0, p1, Lorg/spongycastle/jce/interfaces/IESKey;

    if-nez v0, :cond_0

    .line 70
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "must be passed IE key"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 73
    :cond_0
    check-cast p1, Lorg/spongycastle/jce/interfaces/IESKey;

    .line 75
    invoke-interface {p1}, Lorg/spongycastle/jce/interfaces/IESKey;->b()Ljava/security/PrivateKey;

    move-result-object v0

    instance-of v0, v0, Ljavax/crypto/interfaces/DHPrivateKey;

    if-eqz v0, :cond_1

    .line 77
    invoke-interface {p1}, Lorg/spongycastle/jce/interfaces/IESKey;->b()Ljava/security/PrivateKey;

    move-result-object v0

    check-cast v0, Ljavax/crypto/interfaces/DHPrivateKey;

    .line 79
    invoke-interface {v0}, Ljavax/crypto/interfaces/DHPrivateKey;->getX()Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigInteger;->bitLength()I

    move-result v0

    .line 85
    :goto_0
    return v0

    .line 81
    :cond_1
    invoke-interface {p1}, Lorg/spongycastle/jce/interfaces/IESKey;->b()Ljava/security/PrivateKey;

    move-result-object v0

    instance-of v0, v0, Lorg/spongycastle/jce/interfaces/ECPrivateKey;

    if-eqz v0, :cond_2

    .line 83
    invoke-interface {p1}, Lorg/spongycastle/jce/interfaces/IESKey;->b()Ljava/security/PrivateKey;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/jce/interfaces/ECPrivateKey;

    .line 85
    invoke-interface {v0}, Lorg/spongycastle/jce/interfaces/ECPrivateKey;->c()Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigInteger;->bitLength()I

    move-result v0

    goto :goto_0

    .line 88
    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "not an IE key!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method protected engineGetOutputSize(I)I
    .locals 2

    .prologue
    .line 94
    iget v0, p0, Lorg/spongycastle/jce/provider/JCEIESCipher;->b:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    iget v0, p0, Lorg/spongycastle/jce/provider/JCEIESCipher;->b:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_1

    .line 96
    :cond_0
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JCEIESCipher;->c:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->size()I

    move-result v0

    add-int/2addr v0, p1

    add-int/lit8 v0, v0, 0x14

    .line 100
    :goto_0
    return v0

    .line 98
    :cond_1
    iget v0, p0, Lorg/spongycastle/jce/provider/JCEIESCipher;->b:I

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    iget v0, p0, Lorg/spongycastle/jce/provider/JCEIESCipher;->b:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_3

    .line 100
    :cond_2
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JCEIESCipher;->c:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->size()I

    move-result v0

    add-int/2addr v0, p1

    add-int/lit8 v0, v0, -0x14

    goto :goto_0

    .line 104
    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "cipher not initialised"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method protected engineGetParameters()Ljava/security/AlgorithmParameters;
    .locals 2

    .prologue
    .line 110
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JCEIESCipher;->d:Ljava/security/AlgorithmParameters;

    if-nez v0, :cond_0

    .line 112
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JCEIESCipher;->e:Lorg/spongycastle/jce/spec/IESParameterSpec;

    if-eqz v0, :cond_0

    .line 114
    const-string v0, "IES"

    .line 118
    :try_start_0
    sget-object v1, Lorg/spongycastle/jce/provider/BouncyCastleProvider;->a:Ljava/lang/String;

    invoke-static {v0, v1}, Ljava/security/AlgorithmParameters;->getInstance(Ljava/lang/String;Ljava/lang/String;)Ljava/security/AlgorithmParameters;

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/jce/provider/JCEIESCipher;->d:Ljava/security/AlgorithmParameters;

    .line 119
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JCEIESCipher;->d:Ljava/security/AlgorithmParameters;

    iget-object v1, p0, Lorg/spongycastle/jce/provider/JCEIESCipher;->e:Lorg/spongycastle/jce/spec/IESParameterSpec;

    invoke-virtual {v0, v1}, Ljava/security/AlgorithmParameters;->init(Ljava/security/spec/AlgorithmParameterSpec;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 128
    :cond_0
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JCEIESCipher;->d:Ljava/security/AlgorithmParameters;

    return-object v0

    .line 121
    :catch_0
    move-exception v0

    .line 123
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method protected engineInit(ILjava/security/Key;Ljava/security/AlgorithmParameters;Ljava/security/SecureRandom;)V
    .locals 3

    .prologue
    .line 226
    const/4 v1, 0x0

    .line 228
    if-eqz p3, :cond_0

    .line 230
    const/4 v0, 0x0

    :goto_0
    iget-object v2, p0, Lorg/spongycastle/jce/provider/JCEIESCipher;->f:[Ljava/lang/Class;

    array-length v2, v2

    if-eq v0, v2, :cond_2

    .line 234
    :try_start_0
    iget-object v2, p0, Lorg/spongycastle/jce/provider/JCEIESCipher;->f:[Ljava/lang/Class;

    aget-object v2, v2, v0

    invoke-virtual {p3, v2}, Ljava/security/AlgorithmParameters;->getParameterSpec(Ljava/lang/Class;)Ljava/security/spec/AlgorithmParameterSpec;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 243
    :goto_1
    if-nez v0, :cond_1

    .line 245
    new-instance v0, Ljava/security/InvalidAlgorithmParameterException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "can\'t handle parameter "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3}, Ljava/security/AlgorithmParameters;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 239
    :catch_0
    move-exception v2

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    move-object v0, v1

    .line 249
    :cond_1
    iput-object p3, p0, Lorg/spongycastle/jce/provider/JCEIESCipher;->d:Ljava/security/AlgorithmParameters;

    .line 250
    invoke-virtual {p0, p1, p2, v0, p4}, Lorg/spongycastle/jce/provider/JCEIESCipher;->engineInit(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;Ljava/security/SecureRandom;)V

    .line 251
    return-void

    :cond_2
    move-object v0, v1

    goto :goto_1
.end method

.method protected engineInit(ILjava/security/Key;Ljava/security/SecureRandom;)V
    .locals 2

    .prologue
    .line 259
    const/4 v0, 0x1

    if-eq p1, v0, :cond_0

    const/4 v0, 0x3

    if-ne p1, v0, :cond_1

    .line 263
    :cond_0
    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p0, p1, p2, v0, p3}, Lorg/spongycastle/jce/provider/JCEIESCipher;->engineInit(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;Ljava/security/SecureRandom;)V
    :try_end_0
    .catch Ljava/security/InvalidAlgorithmParameterException; {:try_start_0 .. :try_end_0} :catch_0

    .line 264
    return-void

    :catch_0
    move-exception v0

    .line 272
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "can\'t handle null parameter spec in IES"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method protected engineInit(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;Ljava/security/SecureRandom;)V
    .locals 7

    .prologue
    const/16 v2, 0x10

    const/4 v6, 0x1

    .line 151
    instance-of v0, p2, Lorg/spongycastle/jce/interfaces/IESKey;

    if-nez v0, :cond_0

    .line 153
    new-instance v0, Ljava/security/InvalidKeyException;

    const-string v1, "must be passed IES key"

    invoke-direct {v0, v1}, Ljava/security/InvalidKeyException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 156
    :cond_0
    if-nez p3, :cond_3

    if-eq p1, v6, :cond_1

    const/4 v0, 0x3

    if-ne p1, v0, :cond_3

    .line 162
    :cond_1
    new-array v1, v2, [B

    .line 163
    new-array v2, v2, [B

    .line 165
    if-nez p4, :cond_2

    .line 167
    new-instance p4, Ljava/security/SecureRandom;

    invoke-direct {p4}, Ljava/security/SecureRandom;-><init>()V

    .line 170
    :cond_2
    invoke-virtual {p4, v1}, Ljava/security/SecureRandom;->nextBytes([B)V

    .line 171
    invoke-virtual {p4, v2}, Ljava/security/SecureRandom;->nextBytes([B)V

    .line 173
    new-instance v0, Lorg/spongycastle/jce/spec/IESParameterSpec;

    const/16 v3, 0x80

    invoke-direct {v0, v1, v2, v3}, Lorg/spongycastle/jce/spec/IESParameterSpec;-><init>([B[BI)V

    .line 180
    :goto_0
    check-cast p2, Lorg/spongycastle/jce/interfaces/IESKey;

    .line 185
    invoke-interface {p2}, Lorg/spongycastle/jce/interfaces/IESKey;->a()Ljava/security/PublicKey;

    move-result-object v1

    instance-of v1, v1, Lorg/spongycastle/jce/interfaces/ECPublicKey;

    if-eqz v1, :cond_4

    .line 187
    invoke-interface {p2}, Lorg/spongycastle/jce/interfaces/IESKey;->a()Ljava/security/PublicKey;

    move-result-object v1

    invoke-static {v1}, Lorg/spongycastle/jcajce/provider/asymmetric/ec/ECUtil;->a(Ljava/security/PublicKey;)Lorg/spongycastle/crypto/params/AsymmetricKeyParameter;

    move-result-object v1

    .line 188
    invoke-interface {p2}, Lorg/spongycastle/jce/interfaces/IESKey;->b()Ljava/security/PrivateKey;

    move-result-object v2

    invoke-static {v2}, Lorg/spongycastle/jcajce/provider/asymmetric/ec/ECUtil;->a(Ljava/security/PrivateKey;)Lorg/spongycastle/crypto/params/AsymmetricKeyParameter;

    move-result-object v2

    .line 196
    :goto_1
    check-cast v0, Lorg/spongycastle/jce/spec/IESParameterSpec;

    iput-object v0, p0, Lorg/spongycastle/jce/provider/JCEIESCipher;->e:Lorg/spongycastle/jce/spec/IESParameterSpec;

    .line 198
    new-instance v0, Lorg/spongycastle/crypto/params/IESParameters;

    iget-object v3, p0, Lorg/spongycastle/jce/provider/JCEIESCipher;->e:Lorg/spongycastle/jce/spec/IESParameterSpec;

    invoke-virtual {v3}, Lorg/spongycastle/jce/spec/IESParameterSpec;->a()[B

    move-result-object v3

    iget-object v4, p0, Lorg/spongycastle/jce/provider/JCEIESCipher;->e:Lorg/spongycastle/jce/spec/IESParameterSpec;

    invoke-virtual {v4}, Lorg/spongycastle/jce/spec/IESParameterSpec;->b()[B

    move-result-object v4

    iget-object v5, p0, Lorg/spongycastle/jce/provider/JCEIESCipher;->e:Lorg/spongycastle/jce/spec/IESParameterSpec;

    invoke-virtual {v5}, Lorg/spongycastle/jce/spec/IESParameterSpec;->c()I

    move-result v5

    invoke-direct {v0, v3, v4, v5}, Lorg/spongycastle/crypto/params/IESParameters;-><init>([B[BI)V

    .line 200
    iput p1, p0, Lorg/spongycastle/jce/provider/JCEIESCipher;->b:I

    .line 202
    iget-object v3, p0, Lorg/spongycastle/jce/provider/JCEIESCipher;->c:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->reset()V

    .line 204
    packed-switch p1, :pswitch_data_0

    .line 215
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v1, "eeek!"

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 217
    :goto_2
    return-void

    .line 175
    :cond_3
    instance-of v0, p3, Lorg/spongycastle/jce/spec/IESParameterSpec;

    if-nez v0, :cond_5

    .line 177
    new-instance v0, Ljava/security/InvalidAlgorithmParameterException;

    const-string v1, "must be passed IES parameters"

    invoke-direct {v0, v1}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 192
    :cond_4
    invoke-interface {p2}, Lorg/spongycastle/jce/interfaces/IESKey;->a()Ljava/security/PublicKey;

    move-result-object v1

    invoke-static {v1}, Lorg/spongycastle/jce/provider/DHUtil;->a(Ljava/security/PublicKey;)Lorg/spongycastle/crypto/params/AsymmetricKeyParameter;

    move-result-object v1

    .line 193
    invoke-interface {p2}, Lorg/spongycastle/jce/interfaces/IESKey;->b()Ljava/security/PrivateKey;

    move-result-object v2

    invoke-static {v2}, Lorg/spongycastle/jce/provider/DHUtil;->a(Ljava/security/PrivateKey;)Lorg/spongycastle/crypto/params/AsymmetricKeyParameter;

    move-result-object v2

    goto :goto_1

    .line 208
    :pswitch_0
    iget-object v3, p0, Lorg/spongycastle/jce/provider/JCEIESCipher;->a:Lorg/spongycastle/crypto/engines/IESEngine;

    invoke-virtual {v3, v6, v2, v1, v0}, Lorg/spongycastle/crypto/engines/IESEngine;->a(ZLorg/spongycastle/crypto/CipherParameters;Lorg/spongycastle/crypto/CipherParameters;Lorg/spongycastle/crypto/CipherParameters;)V

    goto :goto_2

    .line 212
    :pswitch_1
    iget-object v3, p0, Lorg/spongycastle/jce/provider/JCEIESCipher;->a:Lorg/spongycastle/crypto/engines/IESEngine;

    const/4 v4, 0x0

    invoke-virtual {v3, v4, v2, v1, v0}, Lorg/spongycastle/crypto/engines/IESEngine;->a(ZLorg/spongycastle/crypto/CipherParameters;Lorg/spongycastle/crypto/CipherParameters;Lorg/spongycastle/crypto/CipherParameters;)V

    goto :goto_2

    :cond_5
    move-object v0, p3

    goto :goto_0

    .line 204
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method protected engineSetMode(Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 134
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "can\'t support mode "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method protected engineSetPadding(Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 141
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
    .locals 1

    .prologue
    .line 291
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JCEIESCipher;->c:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    .line 292
    const/4 v0, 0x0

    return v0
.end method

.method protected engineUpdate([BII)[B
    .locals 1

    .prologue
    .line 280
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JCEIESCipher;->c:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    .line 281
    const/4 v0, 0x0

    return-object v0
.end method
