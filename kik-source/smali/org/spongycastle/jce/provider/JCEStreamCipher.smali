.class public Lorg/spongycastle/jce/provider/JCEStreamCipher;
.super Ljavax/crypto/CipherSpi;
.source "SourceFile"

# interfaces
.implements Lorg/spongycastle/jcajce/provider/symmetric/util/PBE;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/spongycastle/jce/provider/JCEStreamCipher$PBEWithSHAAnd40BitRC4;,
        Lorg/spongycastle/jce/provider/JCEStreamCipher$PBEWithSHAAnd128BitRC4;,
        Lorg/spongycastle/jce/provider/JCEStreamCipher$Twofish_OFB8;,
        Lorg/spongycastle/jce/provider/JCEStreamCipher$Blowfish_OFB8;,
        Lorg/spongycastle/jce/provider/JCEStreamCipher$Skipjack_OFB8;,
        Lorg/spongycastle/jce/provider/JCEStreamCipher$DESede_OFB8;,
        Lorg/spongycastle/jce/provider/JCEStreamCipher$DES_OFB8;,
        Lorg/spongycastle/jce/provider/JCEStreamCipher$Twofish_CFB8;,
        Lorg/spongycastle/jce/provider/JCEStreamCipher$Blowfish_CFB8;,
        Lorg/spongycastle/jce/provider/JCEStreamCipher$Skipjack_CFB8;,
        Lorg/spongycastle/jce/provider/JCEStreamCipher$DESede_CFB8;,
        Lorg/spongycastle/jce/provider/JCEStreamCipher$DES_CFB8;
    }
.end annotation


# instance fields
.field private a:[Ljava/lang/Class;

.field private b:Lorg/spongycastle/crypto/StreamCipher;

.field private c:Lorg/spongycastle/crypto/params/ParametersWithIV;

.field private d:I

.field private e:Ljavax/crypto/spec/PBEParameterSpec;

.field private f:Ljava/lang/String;

.field private g:Ljava/security/AlgorithmParameters;


# direct methods
.method protected constructor <init>(Lorg/spongycastle/crypto/BlockCipher;I)V
    .locals 5

    .prologue
    const/4 v4, 0x0

    const/4 v3, 0x0

    .line 74
    invoke-direct {p0}, Ljavax/crypto/CipherSpi;-><init>()V

    .line 45
    const/4 v0, 0x4

    new-array v0, v0, [Ljava/lang/Class;

    const-class v1, Ljavax/crypto/spec/RC2ParameterSpec;

    aput-object v1, v0, v3

    const/4 v1, 0x1

    const-class v2, Ljavax/crypto/spec/RC5ParameterSpec;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    const-class v2, Ljavax/crypto/spec/IvParameterSpec;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    const-class v2, Ljavax/crypto/spec/PBEParameterSpec;

    aput-object v2, v0, v1

    iput-object v0, p0, Lorg/spongycastle/jce/provider/JCEStreamCipher;->a:[Ljava/lang/Class;

    .line 56
    iput v3, p0, Lorg/spongycastle/jce/provider/JCEStreamCipher;->d:I

    .line 58
    iput-object v4, p0, Lorg/spongycastle/jce/provider/JCEStreamCipher;->e:Ljavax/crypto/spec/PBEParameterSpec;

    .line 59
    iput-object v4, p0, Lorg/spongycastle/jce/provider/JCEStreamCipher;->f:Ljava/lang/String;

    .line 75
    iput p2, p0, Lorg/spongycastle/jce/provider/JCEStreamCipher;->d:I

    .line 77
    new-instance v0, Lorg/spongycastle/crypto/StreamBlockCipher;

    invoke-direct {v0, p1}, Lorg/spongycastle/crypto/StreamBlockCipher;-><init>(Lorg/spongycastle/crypto/BlockCipher;)V

    iput-object v0, p0, Lorg/spongycastle/jce/provider/JCEStreamCipher;->b:Lorg/spongycastle/crypto/StreamCipher;

    .line 78
    return-void
.end method

.method protected constructor <init>(Lorg/spongycastle/crypto/StreamCipher;)V
    .locals 5

    .prologue
    const/4 v4, 0x0

    const/4 v3, 0x0

    .line 66
    invoke-direct {p0}, Ljavax/crypto/CipherSpi;-><init>()V

    .line 45
    const/4 v0, 0x4

    new-array v0, v0, [Ljava/lang/Class;

    const-class v1, Ljavax/crypto/spec/RC2ParameterSpec;

    aput-object v1, v0, v3

    const/4 v1, 0x1

    const-class v2, Ljavax/crypto/spec/RC5ParameterSpec;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    const-class v2, Ljavax/crypto/spec/IvParameterSpec;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    const-class v2, Ljavax/crypto/spec/PBEParameterSpec;

    aput-object v2, v0, v1

    iput-object v0, p0, Lorg/spongycastle/jce/provider/JCEStreamCipher;->a:[Ljava/lang/Class;

    .line 56
    iput v3, p0, Lorg/spongycastle/jce/provider/JCEStreamCipher;->d:I

    .line 58
    iput-object v4, p0, Lorg/spongycastle/jce/provider/JCEStreamCipher;->e:Ljavax/crypto/spec/PBEParameterSpec;

    .line 59
    iput-object v4, p0, Lorg/spongycastle/jce/provider/JCEStreamCipher;->f:Ljava/lang/String;

    .line 67
    iput-object p1, p0, Lorg/spongycastle/jce/provider/JCEStreamCipher;->b:Lorg/spongycastle/crypto/StreamCipher;

    .line 68
    iput v3, p0, Lorg/spongycastle/jce/provider/JCEStreamCipher;->d:I

    .line 69
    return-void
.end method


# virtual methods
.method protected engineDoFinal([BII[BI)I
    .locals 6

    .prologue
    .line 365
    if-eqz p3, :cond_0

    .line 367
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JCEStreamCipher;->b:Lorg/spongycastle/crypto/StreamCipher;

    move-object v1, p1

    move v2, p2

    move v3, p3

    move-object v4, p4

    move v5, p5

    invoke-interface/range {v0 .. v5}, Lorg/spongycastle/crypto/StreamCipher;->a([BII[BI)V

    .line 370
    :cond_0
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JCEStreamCipher;->b:Lorg/spongycastle/crypto/StreamCipher;

    invoke-interface {v0}, Lorg/spongycastle/crypto/StreamCipher;->b()V

    .line 372
    return p3
.end method

.method protected engineDoFinal([BII)[B
    .locals 2

    .prologue
    .line 344
    if-eqz p3, :cond_0

    .line 346
    invoke-virtual {p0, p1, p2, p3}, Lorg/spongycastle/jce/provider/JCEStreamCipher;->engineUpdate([BII)[B

    move-result-object v0

    .line 348
    iget-object v1, p0, Lorg/spongycastle/jce/provider/JCEStreamCipher;->b:Lorg/spongycastle/crypto/StreamCipher;

    invoke-interface {v1}, Lorg/spongycastle/crypto/StreamCipher;->b()V

    .line 355
    :goto_0
    return-object v0

    .line 353
    :cond_0
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JCEStreamCipher;->b:Lorg/spongycastle/crypto/StreamCipher;

    invoke-interface {v0}, Lorg/spongycastle/crypto/StreamCipher;->b()V

    .line 355
    const/4 v0, 0x0

    new-array v0, v0, [B

    goto :goto_0
.end method

.method protected engineGetBlockSize()I
    .locals 1

    .prologue
    .line 82
    const/4 v0, 0x0

    return v0
.end method

.method protected engineGetIV()[B
    .locals 1

    .prologue
    .line 87
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JCEStreamCipher;->c:Lorg/spongycastle/crypto/params/ParametersWithIV;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/spongycastle/jce/provider/JCEStreamCipher;->c:Lorg/spongycastle/crypto/params/ParametersWithIV;

    invoke-virtual {v0}, Lorg/spongycastle/crypto/params/ParametersWithIV;->a()[B

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method protected engineGetKeySize(Ljava/security/Key;)I
    .locals 1

    .prologue
    .line 93
    invoke-interface {p1}, Ljava/security/Key;->getEncoded()[B

    move-result-object v0

    array-length v0, v0

    mul-int/lit8 v0, v0, 0x8

    return v0
.end method

.method protected engineGetOutputSize(I)I
    .locals 0

    .prologue
    .line 99
    return p1
.end method

.method protected engineGetParameters()Ljava/security/AlgorithmParameters;
    .locals 2

    .prologue
    .line 104
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JCEStreamCipher;->g:Ljava/security/AlgorithmParameters;

    if-nez v0, :cond_0

    .line 106
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JCEStreamCipher;->e:Ljavax/crypto/spec/PBEParameterSpec;

    if-eqz v0, :cond_0

    .line 110
    :try_start_0
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JCEStreamCipher;->f:Ljava/lang/String;

    sget-object v1, Lorg/spongycastle/jce/provider/BouncyCastleProvider;->a:Ljava/lang/String;

    invoke-static {v0, v1}, Ljava/security/AlgorithmParameters;->getInstance(Ljava/lang/String;Ljava/lang/String;)Ljava/security/AlgorithmParameters;

    move-result-object v0

    .line 111
    iget-object v1, p0, Lorg/spongycastle/jce/provider/JCEStreamCipher;->e:Ljavax/crypto/spec/PBEParameterSpec;

    invoke-virtual {v0, v1}, Ljava/security/AlgorithmParameters;->init(Ljava/security/spec/AlgorithmParameterSpec;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 122
    :goto_0
    return-object v0

    .line 117
    :catch_0
    move-exception v0

    const/4 v0, 0x0

    goto :goto_0

    .line 122
    :cond_0
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JCEStreamCipher;->g:Ljava/security/AlgorithmParameters;

    goto :goto_0
.end method

.method protected engineInit(ILjava/security/Key;Ljava/security/AlgorithmParameters;Ljava/security/SecureRandom;)V
    .locals 3

    .prologue
    .line 264
    const/4 v1, 0x0

    .line 266
    if-eqz p3, :cond_0

    .line 268
    const/4 v0, 0x0

    :goto_0
    iget-object v2, p0, Lorg/spongycastle/jce/provider/JCEStreamCipher;->a:[Ljava/lang/Class;

    array-length v2, v2

    if-eq v0, v2, :cond_2

    .line 272
    :try_start_0
    iget-object v2, p0, Lorg/spongycastle/jce/provider/JCEStreamCipher;->a:[Ljava/lang/Class;

    aget-object v2, v2, v0

    invoke-virtual {p3, v2}, Ljava/security/AlgorithmParameters;->getParameterSpec(Ljava/lang/Class;)Ljava/security/spec/AlgorithmParameterSpec;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 281
    :goto_1
    if-nez v0, :cond_1

    .line 283
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

    .line 277
    :catch_0
    move-exception v2

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    move-object v0, v1

    .line 287
    :cond_1
    invoke-virtual {p0, p1, p2, v0, p4}, Lorg/spongycastle/jce/provider/JCEStreamCipher;->engineInit(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;Ljava/security/SecureRandom;)V

    .line 288
    iput-object p3, p0, Lorg/spongycastle/jce/provider/JCEStreamCipher;->g:Ljava/security/AlgorithmParameters;

    .line 289
    return-void

    :cond_2
    move-object v0, v1

    goto :goto_1
.end method

.method protected engineInit(ILjava/security/Key;Ljava/security/SecureRandom;)V
    .locals 2

    .prologue
    .line 299
    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p0, p1, p2, v0, p3}, Lorg/spongycastle/jce/provider/JCEStreamCipher;->engineInit(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;Ljava/security/SecureRandom;)V
    :try_end_0
    .catch Ljava/security/InvalidAlgorithmParameterException; {:try_start_0 .. :try_end_0} :catch_0

    .line 304
    return-void

    .line 301
    :catch_0
    move-exception v0

    .line 303
    new-instance v1, Ljava/security/InvalidKeyException;

    invoke-virtual {v0}, Ljava/security/InvalidAlgorithmParameterException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/security/InvalidKeyException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method protected engineInit(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;Ljava/security/SecureRandom;)V
    .locals 5

    .prologue
    const/4 v4, 0x1

    const/4 v0, 0x0

    .line 159
    iput-object v0, p0, Lorg/spongycastle/jce/provider/JCEStreamCipher;->e:Ljavax/crypto/spec/PBEParameterSpec;

    .line 160
    iput-object v0, p0, Lorg/spongycastle/jce/provider/JCEStreamCipher;->f:Ljava/lang/String;

    .line 162
    iput-object v0, p0, Lorg/spongycastle/jce/provider/JCEStreamCipher;->g:Ljava/security/AlgorithmParameters;

    .line 167
    instance-of v0, p2, Ljavax/crypto/SecretKey;

    if-nez v0, :cond_0

    .line 169
    new-instance v0, Ljava/security/InvalidKeyException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Key for algorithm "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {p2}, Ljava/security/Key;->getAlgorithm()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " not suitable for symmetric enryption."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/security/InvalidKeyException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 172
    :cond_0
    instance-of v0, p2, Lorg/spongycastle/jcajce/provider/symmetric/util/BCPBEKey;

    if-eqz v0, :cond_8

    .line 174
    check-cast p2, Lorg/spongycastle/jcajce/provider/symmetric/util/BCPBEKey;

    .line 176
    invoke-virtual {p2}, Lorg/spongycastle/jcajce/provider/symmetric/util/BCPBEKey;->c()Lorg/spongycastle/asn1/DERObjectIdentifier;

    move-result-object v0

    if-eqz v0, :cond_5

    .line 178
    invoke-virtual {p2}, Lorg/spongycastle/jcajce/provider/symmetric/util/BCPBEKey;->c()Lorg/spongycastle/asn1/DERObjectIdentifier;

    move-result-object v0

    invoke-virtual {v0}, Lorg/spongycastle/asn1/DERObjectIdentifier;->c()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/jce/provider/JCEStreamCipher;->f:Ljava/lang/String;

    .line 185
    :goto_0
    invoke-virtual {p2}, Lorg/spongycastle/jcajce/provider/symmetric/util/BCPBEKey;->b()Lorg/spongycastle/crypto/CipherParameters;

    move-result-object v0

    if-eqz v0, :cond_6

    .line 187
    invoke-virtual {p2}, Lorg/spongycastle/jcajce/provider/symmetric/util/BCPBEKey;->b()Lorg/spongycastle/crypto/CipherParameters;

    move-result-object v1

    .line 188
    new-instance v0, Ljavax/crypto/spec/PBEParameterSpec;

    invoke-virtual {p2}, Lorg/spongycastle/jcajce/provider/symmetric/util/BCPBEKey;->getSalt()[B

    move-result-object v2

    invoke-virtual {p2}, Lorg/spongycastle/jcajce/provider/symmetric/util/BCPBEKey;->getIterationCount()I

    move-result v3

    invoke-direct {v0, v2, v3}, Ljavax/crypto/spec/PBEParameterSpec;-><init>([BI)V

    iput-object v0, p0, Lorg/spongycastle/jce/provider/JCEStreamCipher;->e:Ljavax/crypto/spec/PBEParameterSpec;

    .line 200
    :goto_1
    invoke-virtual {p2}, Lorg/spongycastle/jcajce/provider/symmetric/util/BCPBEKey;->a()I

    move-result v0

    if-eqz v0, :cond_1

    move-object v0, v1

    .line 202
    check-cast v0, Lorg/spongycastle/crypto/params/ParametersWithIV;

    iput-object v0, p0, Lorg/spongycastle/jce/provider/JCEStreamCipher;->c:Lorg/spongycastle/crypto/params/ParametersWithIV;

    :cond_1
    move-object v0, v1

    .line 219
    :goto_2
    iget v1, p0, Lorg/spongycastle/jce/provider/JCEStreamCipher;->d:I

    if-eqz v1, :cond_4

    instance-of v1, v0, Lorg/spongycastle/crypto/params/ParametersWithIV;

    if-nez v1, :cond_4

    .line 223
    if-nez p4, :cond_2

    .line 225
    new-instance p4, Ljava/security/SecureRandom;

    invoke-direct {p4}, Ljava/security/SecureRandom;-><init>()V

    .line 228
    :cond_2
    if-eq p1, v4, :cond_3

    const/4 v1, 0x3

    if-ne p1, v1, :cond_b

    .line 230
    :cond_3
    iget v1, p0, Lorg/spongycastle/jce/provider/JCEStreamCipher;->d:I

    new-array v2, v1, [B

    .line 232
    invoke-virtual {p4, v2}, Ljava/security/SecureRandom;->nextBytes([B)V

    .line 233
    new-instance v1, Lorg/spongycastle/crypto/params/ParametersWithIV;

    invoke-direct {v1, v0, v2}, Lorg/spongycastle/crypto/params/ParametersWithIV;-><init>(Lorg/spongycastle/crypto/CipherParameters;[B)V

    move-object v0, v1

    .line 234
    check-cast v0, Lorg/spongycastle/crypto/params/ParametersWithIV;

    iput-object v0, p0, Lorg/spongycastle/jce/provider/JCEStreamCipher;->c:Lorg/spongycastle/crypto/params/ParametersWithIV;

    move-object v0, v1

    .line 242
    :cond_4
    packed-switch p1, :pswitch_data_0

    .line 253
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v1, "eeek!"

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 255
    :goto_3
    return-void

    .line 182
    :cond_5
    invoke-virtual {p2}, Lorg/spongycastle/jcajce/provider/symmetric/util/BCPBEKey;->getAlgorithm()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/jce/provider/JCEStreamCipher;->f:Ljava/lang/String;

    goto :goto_0

    .line 190
    :cond_6
    instance-of v0, p3, Ljavax/crypto/spec/PBEParameterSpec;

    if-eqz v0, :cond_7

    .line 192
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JCEStreamCipher;->b:Lorg/spongycastle/crypto/StreamCipher;

    invoke-interface {v0}, Lorg/spongycastle/crypto/StreamCipher;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {p2, p3, v0}, Lorg/spongycastle/jcajce/provider/symmetric/util/PBE$Util;->a(Lorg/spongycastle/jcajce/provider/symmetric/util/BCPBEKey;Ljava/security/spec/AlgorithmParameterSpec;Ljava/lang/String;)Lorg/spongycastle/crypto/CipherParameters;

    move-result-object v1

    .line 193
    check-cast p3, Ljavax/crypto/spec/PBEParameterSpec;

    iput-object p3, p0, Lorg/spongycastle/jce/provider/JCEStreamCipher;->e:Ljavax/crypto/spec/PBEParameterSpec;

    goto :goto_1

    .line 197
    :cond_7
    new-instance v0, Ljava/security/InvalidAlgorithmParameterException;

    const-string v1, "PBE requires PBE parameters to be set."

    invoke-direct {v0, v1}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 205
    :cond_8
    if-nez p3, :cond_9

    .line 207
    new-instance v1, Lorg/spongycastle/crypto/params/KeyParameter;

    invoke-interface {p2}, Ljava/security/Key;->getEncoded()[B

    move-result-object v0

    invoke-direct {v1, v0}, Lorg/spongycastle/crypto/params/KeyParameter;-><init>([B)V

    move-object v0, v1

    goto :goto_2

    .line 209
    :cond_9
    instance-of v0, p3, Ljavax/crypto/spec/IvParameterSpec;

    if-eqz v0, :cond_a

    .line 211
    new-instance v1, Lorg/spongycastle/crypto/params/ParametersWithIV;

    new-instance v0, Lorg/spongycastle/crypto/params/KeyParameter;

    invoke-interface {p2}, Ljava/security/Key;->getEncoded()[B

    move-result-object v2

    invoke-direct {v0, v2}, Lorg/spongycastle/crypto/params/KeyParameter;-><init>([B)V

    check-cast p3, Ljavax/crypto/spec/IvParameterSpec;

    invoke-virtual {p3}, Ljavax/crypto/spec/IvParameterSpec;->getIV()[B

    move-result-object v2

    invoke-direct {v1, v0, v2}, Lorg/spongycastle/crypto/params/ParametersWithIV;-><init>(Lorg/spongycastle/crypto/CipherParameters;[B)V

    move-object v0, v1

    .line 212
    check-cast v0, Lorg/spongycastle/crypto/params/ParametersWithIV;

    iput-object v0, p0, Lorg/spongycastle/jce/provider/JCEStreamCipher;->c:Lorg/spongycastle/crypto/params/ParametersWithIV;

    move-object v0, v1

    goto :goto_2

    .line 216
    :cond_a
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "unknown parameter type."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 238
    :cond_b
    new-instance v0, Ljava/security/InvalidAlgorithmParameterException;

    const-string v1, "no IV set when one expected"

    invoke-direct {v0, v1}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 246
    :pswitch_0
    iget-object v1, p0, Lorg/spongycastle/jce/provider/JCEStreamCipher;->b:Lorg/spongycastle/crypto/StreamCipher;

    invoke-interface {v1, v4, v0}, Lorg/spongycastle/crypto/StreamCipher;->a(ZLorg/spongycastle/crypto/CipherParameters;)V

    goto :goto_3

    .line 250
    :pswitch_1
    iget-object v1, p0, Lorg/spongycastle/jce/provider/JCEStreamCipher;->b:Lorg/spongycastle/crypto/StreamCipher;

    const/4 v2, 0x0

    invoke-interface {v1, v2, v0}, Lorg/spongycastle/crypto/StreamCipher;->a(ZLorg/spongycastle/crypto/CipherParameters;)V

    goto :goto_3

    .line 242
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
    .line 131
    const-string v0, "ECB"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 133
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

    .line 135
    :cond_0
    return-void
.end method

.method protected engineSetPadding(Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 144
    const-string v0, "NoPadding"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 146
    new-instance v0, Ljavax/crypto/NoSuchPaddingException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Padding "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " unknown."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljavax/crypto/NoSuchPaddingException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 148
    :cond_0
    return-void
.end method

.method protected engineUpdate([BII[BI)I
    .locals 6

    .prologue
    .line 329
    :try_start_0
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JCEStreamCipher;->b:Lorg/spongycastle/crypto/StreamCipher;

    move-object v1, p1

    move v2, p2

    move v3, p3

    move-object v4, p4

    move v5, p5

    invoke-interface/range {v0 .. v5}, Lorg/spongycastle/crypto/StreamCipher;->a([BII[BI)V
    :try_end_0
    .catch Lorg/spongycastle/crypto/DataLengthException; {:try_start_0 .. :try_end_0} :catch_0

    .line 331
    return p3

    .line 333
    :catch_0
    move-exception v0

    .line 335
    new-instance v1, Ljavax/crypto/ShortBufferException;

    invoke-virtual {v0}, Lorg/spongycastle/crypto/DataLengthException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljavax/crypto/ShortBufferException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method protected engineUpdate([BII)[B
    .locals 6

    .prologue
    .line 312
    new-array v4, p3, [B

    .line 314
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JCEStreamCipher;->b:Lorg/spongycastle/crypto/StreamCipher;

    const/4 v5, 0x0

    move-object v1, p1

    move v2, p2

    move v3, p3

    invoke-interface/range {v0 .. v5}, Lorg/spongycastle/crypto/StreamCipher;->a([BII[BI)V

    .line 316
    return-object v4
.end method
