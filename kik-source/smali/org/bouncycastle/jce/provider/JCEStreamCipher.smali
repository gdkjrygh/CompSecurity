.class public Lorg/bouncycastle/jce/provider/JCEStreamCipher;
.super Lorg/bouncycastle/jce/provider/WrapCipherSpi;

# interfaces
.implements Lorg/bouncycastle/jce/provider/PBE;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/bouncycastle/jce/provider/JCEStreamCipher$Blowfish_CFB8;,
        Lorg/bouncycastle/jce/provider/JCEStreamCipher$Blowfish_OFB8;,
        Lorg/bouncycastle/jce/provider/JCEStreamCipher$DES_CFB8;,
        Lorg/bouncycastle/jce/provider/JCEStreamCipher$DES_OFB8;,
        Lorg/bouncycastle/jce/provider/JCEStreamCipher$DESede_CFB8;,
        Lorg/bouncycastle/jce/provider/JCEStreamCipher$DESede_OFB8;,
        Lorg/bouncycastle/jce/provider/JCEStreamCipher$PBEWithSHAAnd128BitRC4;,
        Lorg/bouncycastle/jce/provider/JCEStreamCipher$PBEWithSHAAnd40BitRC4;,
        Lorg/bouncycastle/jce/provider/JCEStreamCipher$Skipjack_CFB8;,
        Lorg/bouncycastle/jce/provider/JCEStreamCipher$Skipjack_OFB8;,
        Lorg/bouncycastle/jce/provider/JCEStreamCipher$Twofish_CFB8;,
        Lorg/bouncycastle/jce/provider/JCEStreamCipher$Twofish_OFB8;
    }
.end annotation


# instance fields
.field private e:[Ljava/lang/Class;

.field private f:Lorg/bouncycastle/crypto/StreamCipher;

.field private g:Lorg/bouncycastle/crypto/params/ParametersWithIV;

.field private h:I

.field private i:Ljavax/crypto/spec/PBEParameterSpec;

.field private j:Ljava/lang/String;


# direct methods
.method protected constructor <init>(Lorg/bouncycastle/crypto/BlockCipher;I)V
    .locals 5

    const/4 v4, 0x0

    const/4 v3, 0x0

    invoke-direct {p0}, Lorg/bouncycastle/jce/provider/WrapCipherSpi;-><init>()V

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

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JCEStreamCipher;->e:[Ljava/lang/Class;

    iput v3, p0, Lorg/bouncycastle/jce/provider/JCEStreamCipher;->h:I

    iput-object v4, p0, Lorg/bouncycastle/jce/provider/JCEStreamCipher;->i:Ljavax/crypto/spec/PBEParameterSpec;

    iput-object v4, p0, Lorg/bouncycastle/jce/provider/JCEStreamCipher;->j:Ljava/lang/String;

    iput p2, p0, Lorg/bouncycastle/jce/provider/JCEStreamCipher;->h:I

    new-instance v0, Lorg/bouncycastle/crypto/StreamBlockCipher;

    invoke-direct {v0, p1}, Lorg/bouncycastle/crypto/StreamBlockCipher;-><init>(Lorg/bouncycastle/crypto/BlockCipher;)V

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JCEStreamCipher;->f:Lorg/bouncycastle/crypto/StreamCipher;

    return-void
.end method

.method protected constructor <init>(Lorg/bouncycastle/crypto/StreamCipher;I)V
    .locals 5

    const/4 v4, 0x0

    const/4 v3, 0x0

    invoke-direct {p0}, Lorg/bouncycastle/jce/provider/WrapCipherSpi;-><init>()V

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

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JCEStreamCipher;->e:[Ljava/lang/Class;

    iput v3, p0, Lorg/bouncycastle/jce/provider/JCEStreamCipher;->h:I

    iput-object v4, p0, Lorg/bouncycastle/jce/provider/JCEStreamCipher;->i:Ljavax/crypto/spec/PBEParameterSpec;

    iput-object v4, p0, Lorg/bouncycastle/jce/provider/JCEStreamCipher;->j:Ljava/lang/String;

    iput-object p1, p0, Lorg/bouncycastle/jce/provider/JCEStreamCipher;->f:Lorg/bouncycastle/crypto/StreamCipher;

    iput p2, p0, Lorg/bouncycastle/jce/provider/JCEStreamCipher;->h:I

    return-void
.end method


# virtual methods
.method protected engineDoFinal([BII[BI)I
    .locals 6

    if-eqz p3, :cond_0

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JCEStreamCipher;->f:Lorg/bouncycastle/crypto/StreamCipher;

    move-object v1, p1

    move v2, p2

    move v3, p3

    move-object v4, p4

    move v5, p5

    invoke-interface/range {v0 .. v5}, Lorg/bouncycastle/crypto/StreamCipher;->processBytes([BII[BI)V

    :cond_0
    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JCEStreamCipher;->f:Lorg/bouncycastle/crypto/StreamCipher;

    invoke-interface {v0}, Lorg/bouncycastle/crypto/StreamCipher;->reset()V

    return p3
.end method

.method protected engineDoFinal([BII)[B
    .locals 2

    if-eqz p3, :cond_0

    invoke-virtual {p0, p1, p2, p3}, Lorg/bouncycastle/jce/provider/JCEStreamCipher;->engineUpdate([BII)[B

    move-result-object v0

    iget-object v1, p0, Lorg/bouncycastle/jce/provider/JCEStreamCipher;->f:Lorg/bouncycastle/crypto/StreamCipher;

    invoke-interface {v1}, Lorg/bouncycastle/crypto/StreamCipher;->reset()V

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JCEStreamCipher;->f:Lorg/bouncycastle/crypto/StreamCipher;

    invoke-interface {v0}, Lorg/bouncycastle/crypto/StreamCipher;->reset()V

    const/4 v0, 0x0

    new-array v0, v0, [B

    goto :goto_0
.end method

.method protected engineGetBlockSize()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method protected engineGetIV()[B
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JCEStreamCipher;->g:Lorg/bouncycastle/crypto/params/ParametersWithIV;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JCEStreamCipher;->g:Lorg/bouncycastle/crypto/params/ParametersWithIV;

    invoke-virtual {v0}, Lorg/bouncycastle/crypto/params/ParametersWithIV;->getIV()[B

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method protected engineGetKeySize(Ljava/security/Key;)I
    .locals 1

    invoke-interface {p1}, Ljava/security/Key;->getEncoded()[B

    move-result-object v0

    array-length v0, v0

    mul-int/lit8 v0, v0, 0x8

    return v0
.end method

.method protected engineGetOutputSize(I)I
    .locals 0

    return p1
.end method

.method protected engineGetParameters()Ljava/security/AlgorithmParameters;
    .locals 2

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JCEStreamCipher;->c:Ljava/security/AlgorithmParameters;

    if-nez v0, :cond_0

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JCEStreamCipher;->i:Ljavax/crypto/spec/PBEParameterSpec;

    if-eqz v0, :cond_0

    :try_start_0
    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JCEStreamCipher;->j:Ljava/lang/String;

    sget-object v1, Lorg/bouncycastle/jce/provider/BouncyCastleProvider;->a:Ljava/lang/String;

    invoke-static {v0, v1}, Ljava/security/AlgorithmParameters;->getInstance(Ljava/lang/String;Ljava/lang/String;)Ljava/security/AlgorithmParameters;

    move-result-object v0

    iget-object v1, p0, Lorg/bouncycastle/jce/provider/JCEStreamCipher;->i:Ljavax/crypto/spec/PBEParameterSpec;

    invoke-virtual {v0, v1}, Ljava/security/AlgorithmParameters;->init(Ljava/security/spec/AlgorithmParameterSpec;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JCEStreamCipher;->c:Ljava/security/AlgorithmParameters;

    goto :goto_0
.end method

.method protected engineInit(ILjava/security/Key;Ljava/security/AlgorithmParameters;Ljava/security/SecureRandom;)V
    .locals 3

    const/4 v1, 0x0

    if-eqz p3, :cond_0

    const/4 v0, 0x0

    :goto_0
    iget-object v2, p0, Lorg/bouncycastle/jce/provider/JCEStreamCipher;->e:[Ljava/lang/Class;

    array-length v2, v2

    if-eq v0, v2, :cond_2

    :try_start_0
    iget-object v2, p0, Lorg/bouncycastle/jce/provider/JCEStreamCipher;->e:[Ljava/lang/Class;

    aget-object v2, v2, v0

    invoke-virtual {p3, v2}, Ljava/security/AlgorithmParameters;->getParameterSpec(Ljava/lang/Class;)Ljava/security/spec/AlgorithmParameterSpec;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :goto_1
    if-nez v0, :cond_1

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

    :catch_0
    move-exception v2

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    move-object v0, v1

    :cond_1
    invoke-virtual {p0, p1, p2, v0, p4}, Lorg/bouncycastle/jce/provider/JCEStreamCipher;->engineInit(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;Ljava/security/SecureRandom;)V

    iput-object p3, p0, Lorg/bouncycastle/jce/provider/JCEStreamCipher;->c:Ljava/security/AlgorithmParameters;

    return-void

    :cond_2
    move-object v0, v1

    goto :goto_1
.end method

.method protected engineInit(ILjava/security/Key;Ljava/security/SecureRandom;)V
    .locals 2

    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p0, p1, p2, v0, p3}, Lorg/bouncycastle/jce/provider/JCEStreamCipher;->engineInit(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;Ljava/security/SecureRandom;)V
    :try_end_0
    .catch Ljava/security/InvalidAlgorithmParameterException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Ljava/security/InvalidKeyException;

    invoke-virtual {v0}, Ljava/security/InvalidAlgorithmParameterException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/security/InvalidKeyException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method protected engineInit(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;Ljava/security/SecureRandom;)V
    .locals 5

    const/4 v4, 0x1

    const/4 v0, 0x0

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JCEStreamCipher;->i:Ljavax/crypto/spec/PBEParameterSpec;

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JCEStreamCipher;->j:Ljava/lang/String;

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JCEStreamCipher;->c:Ljava/security/AlgorithmParameters;

    instance-of v0, p2, Ljavax/crypto/SecretKey;

    if-nez v0, :cond_0

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

    :cond_0
    instance-of v0, p2, Lorg/bouncycastle/jce/provider/JCEPBEKey;

    if-eqz v0, :cond_8

    check-cast p2, Lorg/bouncycastle/jce/provider/JCEPBEKey;

    iget-object v0, p2, Lorg/bouncycastle/jce/provider/JCEPBEKey;->b:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    if-eqz v0, :cond_5

    iget-object v0, p2, Lorg/bouncycastle/jce/provider/JCEPBEKey;->b:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/DERObjectIdentifier;->e()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JCEStreamCipher;->j:Ljava/lang/String;

    :goto_0
    iget-object v0, p2, Lorg/bouncycastle/jce/provider/JCEPBEKey;->g:Lorg/bouncycastle/crypto/CipherParameters;

    if-eqz v0, :cond_6

    iget-object v1, p2, Lorg/bouncycastle/jce/provider/JCEPBEKey;->g:Lorg/bouncycastle/crypto/CipherParameters;

    new-instance v0, Ljavax/crypto/spec/PBEParameterSpec;

    invoke-virtual {p2}, Lorg/bouncycastle/jce/provider/JCEPBEKey;->getSalt()[B

    move-result-object v2

    invoke-virtual {p2}, Lorg/bouncycastle/jce/provider/JCEPBEKey;->getIterationCount()I

    move-result v3

    invoke-direct {v0, v2, v3}, Ljavax/crypto/spec/PBEParameterSpec;-><init>([BI)V

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JCEStreamCipher;->i:Ljavax/crypto/spec/PBEParameterSpec;

    :goto_1
    iget v0, p2, Lorg/bouncycastle/jce/provider/JCEPBEKey;->f:I

    if-eqz v0, :cond_1

    move-object v0, v1

    check-cast v0, Lorg/bouncycastle/crypto/params/ParametersWithIV;

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JCEStreamCipher;->g:Lorg/bouncycastle/crypto/params/ParametersWithIV;

    :cond_1
    move-object v0, v1

    :goto_2
    iget v1, p0, Lorg/bouncycastle/jce/provider/JCEStreamCipher;->h:I

    if-eqz v1, :cond_4

    instance-of v1, v0, Lorg/bouncycastle/crypto/params/ParametersWithIV;

    if-nez v1, :cond_4

    if-nez p4, :cond_2

    new-instance p4, Ljava/security/SecureRandom;

    invoke-direct {p4}, Ljava/security/SecureRandom;-><init>()V

    :cond_2
    if-eq p1, v4, :cond_3

    const/4 v1, 0x3

    if-ne p1, v1, :cond_b

    :cond_3
    iget v1, p0, Lorg/bouncycastle/jce/provider/JCEStreamCipher;->h:I

    new-array v2, v1, [B

    invoke-virtual {p4, v2}, Ljava/security/SecureRandom;->nextBytes([B)V

    new-instance v1, Lorg/bouncycastle/crypto/params/ParametersWithIV;

    invoke-direct {v1, v0, v2}, Lorg/bouncycastle/crypto/params/ParametersWithIV;-><init>(Lorg/bouncycastle/crypto/CipherParameters;[B)V

    move-object v0, v1

    check-cast v0, Lorg/bouncycastle/crypto/params/ParametersWithIV;

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JCEStreamCipher;->g:Lorg/bouncycastle/crypto/params/ParametersWithIV;

    move-object v0, v1

    :cond_4
    packed-switch p1, :pswitch_data_0

    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v1, "eeek!"

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    :goto_3
    return-void

    :cond_5
    invoke-virtual {p2}, Lorg/bouncycastle/jce/provider/JCEPBEKey;->getAlgorithm()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JCEStreamCipher;->j:Ljava/lang/String;

    goto :goto_0

    :cond_6
    instance-of v0, p3, Ljavax/crypto/spec/PBEParameterSpec;

    if-eqz v0, :cond_7

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JCEStreamCipher;->f:Lorg/bouncycastle/crypto/StreamCipher;

    invoke-interface {v0}, Lorg/bouncycastle/crypto/StreamCipher;->getAlgorithmName()Ljava/lang/String;

    move-result-object v0

    invoke-static {p2, p3, v0}, Lorg/bouncycastle/jce/provider/PBE$Util;->a(Lorg/bouncycastle/jce/provider/JCEPBEKey;Ljava/security/spec/AlgorithmParameterSpec;Ljava/lang/String;)Lorg/bouncycastle/crypto/CipherParameters;

    move-result-object v1

    check-cast p3, Ljavax/crypto/spec/PBEParameterSpec;

    iput-object p3, p0, Lorg/bouncycastle/jce/provider/JCEStreamCipher;->i:Ljavax/crypto/spec/PBEParameterSpec;

    goto :goto_1

    :cond_7
    new-instance v0, Ljava/security/InvalidAlgorithmParameterException;

    const-string v1, "PBE requires PBE parameters to be set."

    invoke-direct {v0, v1}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_8
    if-nez p3, :cond_9

    new-instance v1, Lorg/bouncycastle/crypto/params/KeyParameter;

    invoke-interface {p2}, Ljava/security/Key;->getEncoded()[B

    move-result-object v0

    invoke-direct {v1, v0}, Lorg/bouncycastle/crypto/params/KeyParameter;-><init>([B)V

    move-object v0, v1

    goto :goto_2

    :cond_9
    instance-of v0, p3, Ljavax/crypto/spec/IvParameterSpec;

    if-eqz v0, :cond_a

    new-instance v1, Lorg/bouncycastle/crypto/params/ParametersWithIV;

    new-instance v0, Lorg/bouncycastle/crypto/params/KeyParameter;

    invoke-interface {p2}, Ljava/security/Key;->getEncoded()[B

    move-result-object v2

    invoke-direct {v0, v2}, Lorg/bouncycastle/crypto/params/KeyParameter;-><init>([B)V

    check-cast p3, Ljavax/crypto/spec/IvParameterSpec;

    invoke-virtual {p3}, Ljavax/crypto/spec/IvParameterSpec;->getIV()[B

    move-result-object v2

    invoke-direct {v1, v0, v2}, Lorg/bouncycastle/crypto/params/ParametersWithIV;-><init>(Lorg/bouncycastle/crypto/CipherParameters;[B)V

    move-object v0, v1

    check-cast v0, Lorg/bouncycastle/crypto/params/ParametersWithIV;

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JCEStreamCipher;->g:Lorg/bouncycastle/crypto/params/ParametersWithIV;

    move-object v0, v1

    goto :goto_2

    :cond_a
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "unknown parameter type."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_b
    new-instance v0, Ljava/security/InvalidAlgorithmParameterException;

    const-string v1, "no IV set when one expected"

    invoke-direct {v0, v1}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    iget-object v1, p0, Lorg/bouncycastle/jce/provider/JCEStreamCipher;->f:Lorg/bouncycastle/crypto/StreamCipher;

    invoke-interface {v1, v4, v0}, Lorg/bouncycastle/crypto/StreamCipher;->init(ZLorg/bouncycastle/crypto/CipherParameters;)V

    goto :goto_3

    :pswitch_1
    iget-object v1, p0, Lorg/bouncycastle/jce/provider/JCEStreamCipher;->f:Lorg/bouncycastle/crypto/StreamCipher;

    const/4 v2, 0x0

    invoke-interface {v1, v2, v0}, Lorg/bouncycastle/crypto/StreamCipher;->init(ZLorg/bouncycastle/crypto/CipherParameters;)V

    goto :goto_3

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

    const-string v0, "ECB"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

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

    :cond_0
    return-void
.end method

.method protected engineSetPadding(Ljava/lang/String;)V
    .locals 3

    const-string v0, "NoPadding"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

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

    :cond_0
    return-void
.end method

.method protected engineUpdate([BII[BI)I
    .locals 6

    :try_start_0
    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JCEStreamCipher;->f:Lorg/bouncycastle/crypto/StreamCipher;

    move-object v1, p1

    move v2, p2

    move v3, p3

    move-object v4, p4

    move v5, p5

    invoke-interface/range {v0 .. v5}, Lorg/bouncycastle/crypto/StreamCipher;->processBytes([BII[BI)V
    :try_end_0
    .catch Lorg/bouncycastle/crypto/DataLengthException; {:try_start_0 .. :try_end_0} :catch_0

    return p3

    :catch_0
    move-exception v0

    new-instance v1, Ljavax/crypto/ShortBufferException;

    invoke-virtual {v0}, Lorg/bouncycastle/crypto/DataLengthException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljavax/crypto/ShortBufferException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method protected engineUpdate([BII)[B
    .locals 6

    new-array v4, p3, [B

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JCEStreamCipher;->f:Lorg/bouncycastle/crypto/StreamCipher;

    const/4 v5, 0x0

    move-object v1, p1

    move v2, p2

    move v3, p3

    invoke-interface/range {v0 .. v5}, Lorg/bouncycastle/crypto/StreamCipher;->processBytes([BII[BI)V

    return-object v4
.end method
