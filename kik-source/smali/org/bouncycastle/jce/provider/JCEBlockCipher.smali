.class public Lorg/bouncycastle/jce/provider/JCEBlockCipher;
.super Lorg/bouncycastle/jce/provider/WrapCipherSpi;

# interfaces
.implements Lorg/bouncycastle/jce/provider/PBE;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/bouncycastle/jce/provider/JCEBlockCipher$a;,
        Lorg/bouncycastle/jce/provider/JCEBlockCipher$b;,
        Lorg/bouncycastle/jce/provider/JCEBlockCipher$DES;,
        Lorg/bouncycastle/jce/provider/JCEBlockCipher$DESCBC;,
        Lorg/bouncycastle/jce/provider/JCEBlockCipher$GOST28147;,
        Lorg/bouncycastle/jce/provider/JCEBlockCipher$GOST28147cbc;,
        Lorg/bouncycastle/jce/provider/JCEBlockCipher$c;,
        Lorg/bouncycastle/jce/provider/JCEBlockCipher$PBEWithAESCBC;,
        Lorg/bouncycastle/jce/provider/JCEBlockCipher$PBEWithMD5AndDES;,
        Lorg/bouncycastle/jce/provider/JCEBlockCipher$PBEWithMD5AndRC2;,
        Lorg/bouncycastle/jce/provider/JCEBlockCipher$PBEWithSHA1AndDES;,
        Lorg/bouncycastle/jce/provider/JCEBlockCipher$PBEWithSHA1AndRC2;,
        Lorg/bouncycastle/jce/provider/JCEBlockCipher$PBEWithSHAAnd128BitRC2;,
        Lorg/bouncycastle/jce/provider/JCEBlockCipher$PBEWithSHAAnd40BitRC2;,
        Lorg/bouncycastle/jce/provider/JCEBlockCipher$PBEWithSHAAndDES2Key;,
        Lorg/bouncycastle/jce/provider/JCEBlockCipher$PBEWithSHAAndDES3Key;,
        Lorg/bouncycastle/jce/provider/JCEBlockCipher$PBEWithSHAAndTwofish;,
        Lorg/bouncycastle/jce/provider/JCEBlockCipher$RC2;,
        Lorg/bouncycastle/jce/provider/JCEBlockCipher$RC2CBC;
    }
.end annotation


# instance fields
.field private e:[Ljava/lang/Class;

.field private f:Lorg/bouncycastle/crypto/BlockCipher;

.field private g:Lorg/bouncycastle/jce/provider/JCEBlockCipher$c;

.field private h:Lorg/bouncycastle/crypto/params/ParametersWithIV;

.field private i:I

.field private j:Z

.field private k:Ljavax/crypto/spec/PBEParameterSpec;

.field private l:Ljava/lang/String;

.field private m:Ljava/lang/String;


# direct methods
.method protected constructor <init>(Lorg/bouncycastle/crypto/BlockCipher;)V
    .locals 5

    const/4 v4, 0x0

    const/4 v3, 0x0

    invoke-direct {p0}, Lorg/bouncycastle/jce/provider/WrapCipherSpi;-><init>()V

    const/4 v0, 0x5

    new-array v0, v0, [Ljava/lang/Class;

    const-class v1, Ljavax/crypto/spec/RC2ParameterSpec;

    aput-object v1, v0, v4

    const/4 v1, 0x1

    const-class v2, Ljavax/crypto/spec/RC5ParameterSpec;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    const-class v2, Ljavax/crypto/spec/IvParameterSpec;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    const-class v2, Ljavax/crypto/spec/PBEParameterSpec;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    const-class v2, Lorg/bouncycastle/jce/spec/GOST28147ParameterSpec;

    aput-object v2, v0, v1

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->e:[Ljava/lang/Class;

    iput v4, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->i:I

    iput-object v3, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->k:Ljavax/crypto/spec/PBEParameterSpec;

    iput-object v3, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->l:Ljava/lang/String;

    iput-object v3, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->m:Ljava/lang/String;

    iput-object p1, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->f:Lorg/bouncycastle/crypto/BlockCipher;

    new-instance v0, Lorg/bouncycastle/jce/provider/JCEBlockCipher$b;

    invoke-direct {v0, p1}, Lorg/bouncycastle/jce/provider/JCEBlockCipher$b;-><init>(Lorg/bouncycastle/crypto/BlockCipher;)V

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->g:Lorg/bouncycastle/jce/provider/JCEBlockCipher$c;

    return-void
.end method

.method protected constructor <init>(Lorg/bouncycastle/crypto/BlockCipher;I)V
    .locals 5

    const/4 v4, 0x0

    const/4 v3, 0x0

    invoke-direct {p0}, Lorg/bouncycastle/jce/provider/WrapCipherSpi;-><init>()V

    const/4 v0, 0x5

    new-array v0, v0, [Ljava/lang/Class;

    const-class v1, Ljavax/crypto/spec/RC2ParameterSpec;

    aput-object v1, v0, v4

    const/4 v1, 0x1

    const-class v2, Ljavax/crypto/spec/RC5ParameterSpec;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    const-class v2, Ljavax/crypto/spec/IvParameterSpec;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    const-class v2, Ljavax/crypto/spec/PBEParameterSpec;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    const-class v2, Lorg/bouncycastle/jce/spec/GOST28147ParameterSpec;

    aput-object v2, v0, v1

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->e:[Ljava/lang/Class;

    iput v4, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->i:I

    iput-object v3, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->k:Ljavax/crypto/spec/PBEParameterSpec;

    iput-object v3, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->l:Ljava/lang/String;

    iput-object v3, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->m:Ljava/lang/String;

    iput-object p1, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->f:Lorg/bouncycastle/crypto/BlockCipher;

    new-instance v0, Lorg/bouncycastle/jce/provider/JCEBlockCipher$b;

    invoke-direct {v0, p1}, Lorg/bouncycastle/jce/provider/JCEBlockCipher$b;-><init>(Lorg/bouncycastle/crypto/BlockCipher;)V

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->g:Lorg/bouncycastle/jce/provider/JCEBlockCipher$c;

    div-int/lit8 v0, p2, 0x8

    iput v0, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->i:I

    return-void
.end method

.method protected constructor <init>(Lorg/bouncycastle/crypto/BufferedBlockCipher;)V
    .locals 5

    const/4 v4, 0x0

    const/4 v3, 0x0

    invoke-direct {p0}, Lorg/bouncycastle/jce/provider/WrapCipherSpi;-><init>()V

    const/4 v0, 0x5

    new-array v0, v0, [Ljava/lang/Class;

    const-class v1, Ljavax/crypto/spec/RC2ParameterSpec;

    aput-object v1, v0, v4

    const/4 v1, 0x1

    const-class v2, Ljavax/crypto/spec/RC5ParameterSpec;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    const-class v2, Ljavax/crypto/spec/IvParameterSpec;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    const-class v2, Ljavax/crypto/spec/PBEParameterSpec;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    const-class v2, Lorg/bouncycastle/jce/spec/GOST28147ParameterSpec;

    aput-object v2, v0, v1

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->e:[Ljava/lang/Class;

    iput v4, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->i:I

    iput-object v3, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->k:Ljavax/crypto/spec/PBEParameterSpec;

    iput-object v3, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->l:Ljava/lang/String;

    iput-object v3, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->m:Ljava/lang/String;

    invoke-virtual {p1}, Lorg/bouncycastle/crypto/BufferedBlockCipher;->getUnderlyingCipher()Lorg/bouncycastle/crypto/BlockCipher;

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->f:Lorg/bouncycastle/crypto/BlockCipher;

    new-instance v0, Lorg/bouncycastle/jce/provider/JCEBlockCipher$b;

    invoke-direct {v0, p1}, Lorg/bouncycastle/jce/provider/JCEBlockCipher$b;-><init>(Lorg/bouncycastle/crypto/BufferedBlockCipher;)V

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->g:Lorg/bouncycastle/jce/provider/JCEBlockCipher$c;

    const/16 v0, 0x10

    iput v0, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->i:I

    return-void
.end method

.method private static a(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "CCM"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "EAX"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "GCM"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method protected engineDoFinal([BII[BI)I
    .locals 6

    const/4 v0, 0x0

    if-eqz p3, :cond_0

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->g:Lorg/bouncycastle/jce/provider/JCEBlockCipher$c;

    move-object v1, p1

    move v2, p2

    move v3, p3

    move-object v4, p4

    move v5, p5

    invoke-interface/range {v0 .. v5}, Lorg/bouncycastle/jce/provider/JCEBlockCipher$c;->a([BII[BI)I

    move-result v0

    :cond_0
    :try_start_0
    iget-object v1, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->g:Lorg/bouncycastle/jce/provider/JCEBlockCipher$c;

    add-int v2, p5, v0

    invoke-interface {v1, p4, v2}, Lorg/bouncycastle/jce/provider/JCEBlockCipher$c;->a([BI)I
    :try_end_0
    .catch Lorg/bouncycastle/crypto/DataLengthException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lorg/bouncycastle/crypto/InvalidCipherTextException; {:try_start_0 .. :try_end_0} :catch_1

    move-result v1

    add-int/2addr v0, v1

    return v0

    :catch_0
    move-exception v0

    new-instance v1, Ljavax/crypto/IllegalBlockSizeException;

    invoke-virtual {v0}, Lorg/bouncycastle/crypto/DataLengthException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljavax/crypto/IllegalBlockSizeException;-><init>(Ljava/lang/String;)V

    throw v1

    :catch_1
    move-exception v0

    new-instance v1, Ljavax/crypto/BadPaddingException;

    invoke-virtual {v0}, Lorg/bouncycastle/crypto/InvalidCipherTextException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljavax/crypto/BadPaddingException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method protected engineDoFinal([BII)[B
    .locals 6

    const/4 v5, 0x0

    invoke-virtual {p0, p3}, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->engineGetOutputSize(I)I

    move-result v0

    new-array v4, v0, [B

    if-eqz p3, :cond_1

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->g:Lorg/bouncycastle/jce/provider/JCEBlockCipher$c;

    move-object v1, p1

    move v2, p2

    move v3, p3

    invoke-interface/range {v0 .. v5}, Lorg/bouncycastle/jce/provider/JCEBlockCipher$c;->a([BII[BI)I

    move-result v0

    :goto_0
    :try_start_0
    iget-object v1, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->g:Lorg/bouncycastle/jce/provider/JCEBlockCipher$c;

    invoke-interface {v1, v4, v0}, Lorg/bouncycastle/jce/provider/JCEBlockCipher$c;->a([BI)I
    :try_end_0
    .catch Lorg/bouncycastle/crypto/DataLengthException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lorg/bouncycastle/crypto/InvalidCipherTextException; {:try_start_0 .. :try_end_0} :catch_1

    move-result v1

    add-int/2addr v1, v0

    array-length v0, v4

    if-ne v1, v0, :cond_0

    :goto_1
    return-object v4

    :catch_0
    move-exception v0

    new-instance v1, Ljavax/crypto/IllegalBlockSizeException;

    invoke-virtual {v0}, Lorg/bouncycastle/crypto/DataLengthException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljavax/crypto/IllegalBlockSizeException;-><init>(Ljava/lang/String;)V

    throw v1

    :catch_1
    move-exception v0

    new-instance v1, Ljavax/crypto/BadPaddingException;

    invoke-virtual {v0}, Lorg/bouncycastle/crypto/InvalidCipherTextException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljavax/crypto/BadPaddingException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_0
    new-array v0, v1, [B

    invoke-static {v4, v5, v0, v5, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move-object v4, v0

    goto :goto_1

    :cond_1
    move v0, v5

    goto :goto_0
.end method

.method protected engineGetBlockSize()I
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->f:Lorg/bouncycastle/crypto/BlockCipher;

    invoke-interface {v0}, Lorg/bouncycastle/crypto/BlockCipher;->getBlockSize()I

    move-result v0

    return v0
.end method

.method protected engineGetIV()[B
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->h:Lorg/bouncycastle/crypto/params/ParametersWithIV;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->h:Lorg/bouncycastle/crypto/params/ParametersWithIV;

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
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->g:Lorg/bouncycastle/jce/provider/JCEBlockCipher$c;

    invoke-interface {v0, p1}, Lorg/bouncycastle/jce/provider/JCEBlockCipher$c;->a(I)I

    move-result v0

    return v0
.end method

.method protected engineGetParameters()Ljava/security/AlgorithmParameters;
    .locals 3

    const/16 v2, 0x2f

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->c:Ljava/security/AlgorithmParameters;

    if-nez v0, :cond_0

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->k:Ljavax/crypto/spec/PBEParameterSpec;

    if-eqz v0, :cond_1

    :try_start_0
    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->l:Ljava/lang/String;

    sget-object v1, Lorg/bouncycastle/jce/provider/BouncyCastleProvider;->a:Ljava/lang/String;

    invoke-static {v0, v1}, Ljava/security/AlgorithmParameters;->getInstance(Ljava/lang/String;Ljava/lang/String;)Ljava/security/AlgorithmParameters;

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->c:Ljava/security/AlgorithmParameters;

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->c:Ljava/security/AlgorithmParameters;

    iget-object v1, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->k:Ljavax/crypto/spec/PBEParameterSpec;

    invoke-virtual {v0, v1}, Ljava/security/AlgorithmParameters;->init(Ljava/security/spec/AlgorithmParameterSpec;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->c:Ljava/security/AlgorithmParameters;

    :goto_1
    return-object v0

    :catch_0
    move-exception v0

    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->h:Lorg/bouncycastle/crypto/params/ParametersWithIV;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->g:Lorg/bouncycastle/jce/provider/JCEBlockCipher$c;

    invoke-interface {v0}, Lorg/bouncycastle/jce/provider/JCEBlockCipher$c;->b()Lorg/bouncycastle/crypto/BlockCipher;

    move-result-object v0

    invoke-interface {v0}, Lorg/bouncycastle/crypto/BlockCipher;->getAlgorithmName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/String;->indexOf(I)I

    move-result v1

    if-ltz v1, :cond_2

    const/4 v1, 0x0

    invoke-virtual {v0, v2}, Ljava/lang/String;->indexOf(I)I

    move-result v2

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    :cond_2
    :try_start_1
    sget-object v1, Lorg/bouncycastle/jce/provider/BouncyCastleProvider;->a:Ljava/lang/String;

    invoke-static {v0, v1}, Ljava/security/AlgorithmParameters;->getInstance(Ljava/lang/String;Ljava/lang/String;)Ljava/security/AlgorithmParameters;

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->c:Ljava/security/AlgorithmParameters;

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->c:Ljava/security/AlgorithmParameters;

    iget-object v1, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->h:Lorg/bouncycastle/crypto/params/ParametersWithIV;

    invoke-virtual {v1}, Lorg/bouncycastle/crypto/params/ParametersWithIV;->getIV()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/security/AlgorithmParameters;->init([B)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    :catch_1
    move-exception v0

    new-instance v1, Ljava/lang/RuntimeException;

    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method protected engineInit(ILjava/security/Key;Ljava/security/AlgorithmParameters;Ljava/security/SecureRandom;)V
    .locals 3

    const/4 v1, 0x0

    if-eqz p3, :cond_0

    const/4 v0, 0x0

    :goto_0
    iget-object v2, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->e:[Ljava/lang/Class;

    array-length v2, v2

    if-eq v0, v2, :cond_2

    :try_start_0
    iget-object v2, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->e:[Ljava/lang/Class;

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
    invoke-virtual {p0, p1, p2, v0, p4}, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->engineInit(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;Ljava/security/SecureRandom;)V

    iput-object p3, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->c:Ljava/security/AlgorithmParameters;

    return-void

    :cond_2
    move-object v0, v1

    goto :goto_1
.end method

.method protected engineInit(ILjava/security/Key;Ljava/security/SecureRandom;)V
    .locals 2

    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p0, p1, p2, v0, p3}, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->engineInit(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;Ljava/security/SecureRandom;)V
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

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->k:Ljavax/crypto/spec/PBEParameterSpec;

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->l:Ljava/lang/String;

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->c:Ljava/security/AlgorithmParameters;

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
    if-nez p3, :cond_1

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->f:Lorg/bouncycastle/crypto/BlockCipher;

    invoke-interface {v0}, Lorg/bouncycastle/crypto/BlockCipher;->getAlgorithmName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "RC5-64"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Ljava/security/InvalidAlgorithmParameterException;

    const-string v1, "RC5 requires an RC5ParametersSpec to be passed in."

    invoke-direct {v0, v1}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    instance-of v0, p2, Lorg/bouncycastle/jce/provider/JCEPBEKey;

    if-eqz v0, :cond_7

    check-cast p2, Lorg/bouncycastle/jce/provider/JCEPBEKey;

    iget-object v0, p2, Lorg/bouncycastle/jce/provider/JCEPBEKey;->b:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    if-eqz v0, :cond_4

    iget-object v0, p2, Lorg/bouncycastle/jce/provider/JCEPBEKey;->b:Lorg/bouncycastle/asn1/DERObjectIdentifier;

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/DERObjectIdentifier;->e()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->l:Ljava/lang/String;

    :goto_0
    iget-object v0, p2, Lorg/bouncycastle/jce/provider/JCEPBEKey;->g:Lorg/bouncycastle/crypto/CipherParameters;

    if-eqz v0, :cond_5

    iget-object v1, p2, Lorg/bouncycastle/jce/provider/JCEPBEKey;->g:Lorg/bouncycastle/crypto/CipherParameters;

    new-instance v0, Ljavax/crypto/spec/PBEParameterSpec;

    invoke-virtual {p2}, Lorg/bouncycastle/jce/provider/JCEPBEKey;->getSalt()[B

    move-result-object v2

    invoke-virtual {p2}, Lorg/bouncycastle/jce/provider/JCEPBEKey;->getIterationCount()I

    move-result v3

    invoke-direct {v0, v2, v3}, Ljavax/crypto/spec/PBEParameterSpec;-><init>([BI)V

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->k:Ljavax/crypto/spec/PBEParameterSpec;

    :goto_1
    instance-of v0, v1, Lorg/bouncycastle/crypto/params/ParametersWithIV;

    if-eqz v0, :cond_2

    move-object v0, v1

    check-cast v0, Lorg/bouncycastle/crypto/params/ParametersWithIV;

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->h:Lorg/bouncycastle/crypto/params/ParametersWithIV;

    :cond_2
    move-object v0, v1

    :goto_2
    iget v1, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->i:I

    if-eqz v1, :cond_15

    instance-of v1, v0, Lorg/bouncycastle/crypto/params/ParametersWithIV;

    if-nez v1, :cond_15

    if-nez p4, :cond_16

    new-instance v1, Ljava/security/SecureRandom;

    invoke-direct {v1}, Ljava/security/SecureRandom;-><init>()V

    :goto_3
    if-eq p1, v4, :cond_3

    const/4 v2, 0x3

    if-ne p1, v2, :cond_13

    :cond_3
    iget v2, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->i:I

    new-array v2, v2, [B

    invoke-virtual {v1, v2}, Ljava/security/SecureRandom;->nextBytes([B)V

    new-instance v1, Lorg/bouncycastle/crypto/params/ParametersWithIV;

    invoke-direct {v1, v0, v2}, Lorg/bouncycastle/crypto/params/ParametersWithIV;-><init>(Lorg/bouncycastle/crypto/CipherParameters;[B)V

    move-object v0, v1

    check-cast v0, Lorg/bouncycastle/crypto/params/ParametersWithIV;

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->h:Lorg/bouncycastle/crypto/params/ParametersWithIV;

    :goto_4
    if-eqz p4, :cond_14

    iget-boolean v0, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->j:Z

    if-eqz v0, :cond_14

    new-instance v0, Lorg/bouncycastle/crypto/params/ParametersWithRandom;

    invoke-direct {v0, v1, p4}, Lorg/bouncycastle/crypto/params/ParametersWithRandom;-><init>(Lorg/bouncycastle/crypto/CipherParameters;Ljava/security/SecureRandom;)V

    :goto_5
    packed-switch p1, :pswitch_data_0

    :try_start_0
    new-instance v0, Ljava/security/InvalidParameterException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "unknown opmode "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " passed"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/security/InvalidParameterException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/security/InvalidKeyException;

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/security/InvalidKeyException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_4
    invoke-virtual {p2}, Lorg/bouncycastle/jce/provider/JCEPBEKey;->getAlgorithm()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->l:Ljava/lang/String;

    goto :goto_0

    :cond_5
    instance-of v0, p3, Ljavax/crypto/spec/PBEParameterSpec;

    if-eqz v0, :cond_6

    move-object v0, p3

    check-cast v0, Ljavax/crypto/spec/PBEParameterSpec;

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->k:Ljavax/crypto/spec/PBEParameterSpec;

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->g:Lorg/bouncycastle/jce/provider/JCEBlockCipher$c;

    invoke-interface {v0}, Lorg/bouncycastle/jce/provider/JCEBlockCipher$c;->b()Lorg/bouncycastle/crypto/BlockCipher;

    move-result-object v0

    invoke-interface {v0}, Lorg/bouncycastle/crypto/BlockCipher;->getAlgorithmName()Ljava/lang/String;

    move-result-object v0

    invoke-static {p2, p3, v0}, Lorg/bouncycastle/jce/provider/PBE$Util;->a(Lorg/bouncycastle/jce/provider/JCEPBEKey;Ljava/security/spec/AlgorithmParameterSpec;Ljava/lang/String;)Lorg/bouncycastle/crypto/CipherParameters;

    move-result-object v1

    goto/16 :goto_1

    :cond_6
    new-instance v0, Ljava/security/InvalidAlgorithmParameterException;

    const-string v1, "PBE requires PBE parameters to be set."

    invoke-direct {v0, v1}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    if-nez p3, :cond_8

    new-instance v1, Lorg/bouncycastle/crypto/params/KeyParameter;

    invoke-interface {p2}, Ljava/security/Key;->getEncoded()[B

    move-result-object v0

    invoke-direct {v1, v0}, Lorg/bouncycastle/crypto/params/KeyParameter;-><init>([B)V

    move-object v0, v1

    goto/16 :goto_2

    :cond_8
    instance-of v0, p3, Ljavax/crypto/spec/IvParameterSpec;

    if-eqz v0, :cond_c

    iget v0, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->i:I

    if-eqz v0, :cond_a

    check-cast p3, Ljavax/crypto/spec/IvParameterSpec;

    invoke-virtual {p3}, Ljavax/crypto/spec/IvParameterSpec;->getIV()[B

    move-result-object v0

    array-length v0, v0

    iget v1, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->i:I

    if-eq v0, v1, :cond_9

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->m:Ljava/lang/String;

    invoke-static {v0}, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->a(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_9

    new-instance v0, Ljava/security/InvalidAlgorithmParameterException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "IV must be "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->i:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " bytes long."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_9
    new-instance v1, Lorg/bouncycastle/crypto/params/ParametersWithIV;

    new-instance v0, Lorg/bouncycastle/crypto/params/KeyParameter;

    invoke-interface {p2}, Ljava/security/Key;->getEncoded()[B

    move-result-object v2

    invoke-direct {v0, v2}, Lorg/bouncycastle/crypto/params/KeyParameter;-><init>([B)V

    invoke-virtual {p3}, Ljavax/crypto/spec/IvParameterSpec;->getIV()[B

    move-result-object v2

    invoke-direct {v1, v0, v2}, Lorg/bouncycastle/crypto/params/ParametersWithIV;-><init>(Lorg/bouncycastle/crypto/CipherParameters;[B)V

    move-object v0, v1

    check-cast v0, Lorg/bouncycastle/crypto/params/ParametersWithIV;

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->h:Lorg/bouncycastle/crypto/params/ParametersWithIV;

    move-object v0, v1

    goto/16 :goto_2

    :cond_a
    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->m:Ljava/lang/String;

    if-eqz v0, :cond_b

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->m:Ljava/lang/String;

    const-string v1, "ECB"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_b

    new-instance v0, Ljava/security/InvalidAlgorithmParameterException;

    const-string v1, "ECB mode does not use an IV"

    invoke-direct {v0, v1}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_b
    new-instance v1, Lorg/bouncycastle/crypto/params/KeyParameter;

    invoke-interface {p2}, Ljava/security/Key;->getEncoded()[B

    move-result-object v0

    invoke-direct {v1, v0}, Lorg/bouncycastle/crypto/params/KeyParameter;-><init>([B)V

    move-object v0, v1

    goto/16 :goto_2

    :cond_c
    instance-of v0, p3, Lorg/bouncycastle/jce/spec/GOST28147ParameterSpec;

    if-eqz v0, :cond_d

    move-object v0, p3

    check-cast v0, Lorg/bouncycastle/jce/spec/GOST28147ParameterSpec;

    new-instance v2, Lorg/bouncycastle/crypto/params/ParametersWithSBox;

    new-instance v1, Lorg/bouncycastle/crypto/params/KeyParameter;

    invoke-interface {p2}, Ljava/security/Key;->getEncoded()[B

    move-result-object v3

    invoke-direct {v1, v3}, Lorg/bouncycastle/crypto/params/KeyParameter;-><init>([B)V

    check-cast p3, Lorg/bouncycastle/jce/spec/GOST28147ParameterSpec;

    invoke-virtual {p3}, Lorg/bouncycastle/jce/spec/GOST28147ParameterSpec;->a()[B

    move-result-object v3

    invoke-direct {v2, v1, v3}, Lorg/bouncycastle/crypto/params/ParametersWithSBox;-><init>(Lorg/bouncycastle/crypto/CipherParameters;[B)V

    invoke-virtual {v0}, Lorg/bouncycastle/jce/spec/GOST28147ParameterSpec;->b()[B

    move-result-object v1

    if-eqz v1, :cond_19

    iget v1, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->i:I

    if-eqz v1, :cond_19

    new-instance v1, Lorg/bouncycastle/crypto/params/ParametersWithIV;

    invoke-virtual {v0}, Lorg/bouncycastle/jce/spec/GOST28147ParameterSpec;->b()[B

    move-result-object v0

    invoke-direct {v1, v2, v0}, Lorg/bouncycastle/crypto/params/ParametersWithIV;-><init>(Lorg/bouncycastle/crypto/CipherParameters;[B)V

    move-object v0, v1

    check-cast v0, Lorg/bouncycastle/crypto/params/ParametersWithIV;

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->h:Lorg/bouncycastle/crypto/params/ParametersWithIV;

    :goto_6
    move-object v0, v1

    goto/16 :goto_2

    :cond_d
    instance-of v0, p3, Ljavax/crypto/spec/RC2ParameterSpec;

    if-eqz v0, :cond_e

    move-object v0, p3

    check-cast v0, Ljavax/crypto/spec/RC2ParameterSpec;

    new-instance v2, Lorg/bouncycastle/crypto/params/RC2Parameters;

    invoke-interface {p2}, Ljava/security/Key;->getEncoded()[B

    move-result-object v1

    check-cast p3, Ljavax/crypto/spec/RC2ParameterSpec;

    invoke-virtual {p3}, Ljavax/crypto/spec/RC2ParameterSpec;->getEffectiveKeyBits()I

    move-result v3

    invoke-direct {v2, v1, v3}, Lorg/bouncycastle/crypto/params/RC2Parameters;-><init>([BI)V

    invoke-virtual {v0}, Ljavax/crypto/spec/RC2ParameterSpec;->getIV()[B

    move-result-object v1

    if-eqz v1, :cond_18

    iget v1, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->i:I

    if-eqz v1, :cond_18

    new-instance v1, Lorg/bouncycastle/crypto/params/ParametersWithIV;

    invoke-virtual {v0}, Ljavax/crypto/spec/RC2ParameterSpec;->getIV()[B

    move-result-object v0

    invoke-direct {v1, v2, v0}, Lorg/bouncycastle/crypto/params/ParametersWithIV;-><init>(Lorg/bouncycastle/crypto/CipherParameters;[B)V

    move-object v0, v1

    check-cast v0, Lorg/bouncycastle/crypto/params/ParametersWithIV;

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->h:Lorg/bouncycastle/crypto/params/ParametersWithIV;

    :goto_7
    move-object v0, v1

    goto/16 :goto_2

    :cond_e
    instance-of v0, p3, Ljavax/crypto/spec/RC5ParameterSpec;

    if-eqz v0, :cond_12

    move-object v0, p3

    check-cast v0, Ljavax/crypto/spec/RC5ParameterSpec;

    new-instance v2, Lorg/bouncycastle/crypto/params/RC5Parameters;

    invoke-interface {p2}, Ljava/security/Key;->getEncoded()[B

    move-result-object v1

    check-cast p3, Ljavax/crypto/spec/RC5ParameterSpec;

    invoke-virtual {p3}, Ljavax/crypto/spec/RC5ParameterSpec;->getRounds()I

    move-result v3

    invoke-direct {v2, v1, v3}, Lorg/bouncycastle/crypto/params/RC5Parameters;-><init>([BI)V

    iget-object v1, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->f:Lorg/bouncycastle/crypto/BlockCipher;

    invoke-interface {v1}, Lorg/bouncycastle/crypto/BlockCipher;->getAlgorithmName()Ljava/lang/String;

    move-result-object v1

    const-string v3, "RC5"

    invoke-virtual {v1, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_10

    iget-object v1, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->f:Lorg/bouncycastle/crypto/BlockCipher;

    invoke-interface {v1}, Lorg/bouncycastle/crypto/BlockCipher;->getAlgorithmName()Ljava/lang/String;

    move-result-object v1

    const-string v3, "RC5-32"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_f

    invoke-virtual {v0}, Ljavax/crypto/spec/RC5ParameterSpec;->getWordSize()I

    move-result v1

    const/16 v3, 0x20

    if-eq v1, v3, :cond_11

    new-instance v1, Ljava/security/InvalidAlgorithmParameterException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "RC5 already set up for a word size of 32 not "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljavax/crypto/spec/RC5ParameterSpec;->getWordSize()I

    move-result v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "."

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_f
    iget-object v1, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->f:Lorg/bouncycastle/crypto/BlockCipher;

    invoke-interface {v1}, Lorg/bouncycastle/crypto/BlockCipher;->getAlgorithmName()Ljava/lang/String;

    move-result-object v1

    const-string v3, "RC5-64"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_11

    invoke-virtual {v0}, Ljavax/crypto/spec/RC5ParameterSpec;->getWordSize()I

    move-result v1

    const/16 v3, 0x40

    if-eq v1, v3, :cond_11

    new-instance v1, Ljava/security/InvalidAlgorithmParameterException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "RC5 already set up for a word size of 64 not "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljavax/crypto/spec/RC5ParameterSpec;->getWordSize()I

    move-result v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "."

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_10
    new-instance v0, Ljava/security/InvalidAlgorithmParameterException;

    const-string v1, "RC5 parameters passed to a cipher that is not RC5."

    invoke-direct {v0, v1}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_11
    invoke-virtual {v0}, Ljavax/crypto/spec/RC5ParameterSpec;->getIV()[B

    move-result-object v1

    if-eqz v1, :cond_17

    iget v1, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->i:I

    if-eqz v1, :cond_17

    new-instance v1, Lorg/bouncycastle/crypto/params/ParametersWithIV;

    invoke-virtual {v0}, Ljavax/crypto/spec/RC5ParameterSpec;->getIV()[B

    move-result-object v0

    invoke-direct {v1, v2, v0}, Lorg/bouncycastle/crypto/params/ParametersWithIV;-><init>(Lorg/bouncycastle/crypto/CipherParameters;[B)V

    move-object v0, v1

    check-cast v0, Lorg/bouncycastle/crypto/params/ParametersWithIV;

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->h:Lorg/bouncycastle/crypto/params/ParametersWithIV;

    :goto_8
    move-object v0, v1

    goto/16 :goto_2

    :cond_12
    new-instance v0, Ljava/security/InvalidAlgorithmParameterException;

    const-string v1, "unknown parameter type."

    invoke-direct {v0, v1}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_13
    iget-object v1, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->g:Lorg/bouncycastle/jce/provider/JCEBlockCipher$c;

    invoke-interface {v1}, Lorg/bouncycastle/jce/provider/JCEBlockCipher$c;->b()Lorg/bouncycastle/crypto/BlockCipher;

    move-result-object v1

    invoke-interface {v1}, Lorg/bouncycastle/crypto/BlockCipher;->getAlgorithmName()Ljava/lang/String;

    move-result-object v1

    const-string v2, "PGPCFB"

    invoke-virtual {v1, v2}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v1

    if-gez v1, :cond_15

    new-instance v0, Ljava/security/InvalidAlgorithmParameterException;

    const-string v1, "no IV set when one expected"

    invoke-direct {v0, v1}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    :try_start_1
    iget-object v1, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->g:Lorg/bouncycastle/jce/provider/JCEBlockCipher$c;

    const/4 v2, 0x1

    invoke-interface {v1, v2, v0}, Lorg/bouncycastle/jce/provider/JCEBlockCipher$c;->a(ZLorg/bouncycastle/crypto/CipherParameters;)V

    :goto_9
    return-void

    :pswitch_1
    iget-object v1, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->g:Lorg/bouncycastle/jce/provider/JCEBlockCipher$c;

    const/4 v2, 0x0

    invoke-interface {v1, v2, v0}, Lorg/bouncycastle/jce/provider/JCEBlockCipher$c;->a(ZLorg/bouncycastle/crypto/CipherParameters;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_9

    :cond_14
    move-object v0, v1

    goto/16 :goto_5

    :cond_15
    move-object v1, v0

    goto/16 :goto_4

    :cond_16
    move-object v1, p4

    goto/16 :goto_3

    :cond_17
    move-object v1, v2

    goto :goto_8

    :cond_18
    move-object v1, v2

    goto/16 :goto_7

    :cond_19
    move-object v1, v2

    goto/16 :goto_6

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

    const/4 v3, 0x0

    const/4 v2, 0x3

    invoke-static {p1}, Lorg/bouncycastle/util/Strings;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->m:Ljava/lang/String;

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->m:Ljava/lang/String;

    const-string v1, "ECB"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iput v3, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->i:I

    new-instance v0, Lorg/bouncycastle/jce/provider/JCEBlockCipher$b;

    iget-object v1, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->f:Lorg/bouncycastle/crypto/BlockCipher;

    invoke-direct {v0, v1}, Lorg/bouncycastle/jce/provider/JCEBlockCipher$b;-><init>(Lorg/bouncycastle/crypto/BlockCipher;)V

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->g:Lorg/bouncycastle/jce/provider/JCEBlockCipher$c;

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->m:Ljava/lang/String;

    const-string v1, "CBC"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->f:Lorg/bouncycastle/crypto/BlockCipher;

    invoke-interface {v0}, Lorg/bouncycastle/crypto/BlockCipher;->getBlockSize()I

    move-result v0

    iput v0, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->i:I

    new-instance v0, Lorg/bouncycastle/jce/provider/JCEBlockCipher$b;

    new-instance v1, Lorg/bouncycastle/crypto/modes/CBCBlockCipher;

    iget-object v2, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->f:Lorg/bouncycastle/crypto/BlockCipher;

    invoke-direct {v1, v2}, Lorg/bouncycastle/crypto/modes/CBCBlockCipher;-><init>(Lorg/bouncycastle/crypto/BlockCipher;)V

    invoke-direct {v0, v1}, Lorg/bouncycastle/jce/provider/JCEBlockCipher$b;-><init>(Lorg/bouncycastle/crypto/BlockCipher;)V

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->g:Lorg/bouncycastle/jce/provider/JCEBlockCipher$c;

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->m:Ljava/lang/String;

    const-string v1, "OFB"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->f:Lorg/bouncycastle/crypto/BlockCipher;

    invoke-interface {v0}, Lorg/bouncycastle/crypto/BlockCipher;->getBlockSize()I

    move-result v0

    iput v0, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->i:I

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->m:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-eq v0, v2, :cond_2

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->m:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    new-instance v1, Lorg/bouncycastle/jce/provider/JCEBlockCipher$b;

    new-instance v2, Lorg/bouncycastle/crypto/modes/OFBBlockCipher;

    iget-object v3, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->f:Lorg/bouncycastle/crypto/BlockCipher;

    invoke-direct {v2, v3, v0}, Lorg/bouncycastle/crypto/modes/OFBBlockCipher;-><init>(Lorg/bouncycastle/crypto/BlockCipher;I)V

    invoke-direct {v1, v2}, Lorg/bouncycastle/jce/provider/JCEBlockCipher$b;-><init>(Lorg/bouncycastle/crypto/BlockCipher;)V

    iput-object v1, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->g:Lorg/bouncycastle/jce/provider/JCEBlockCipher$c;

    goto :goto_0

    :cond_2
    new-instance v0, Lorg/bouncycastle/jce/provider/JCEBlockCipher$b;

    new-instance v1, Lorg/bouncycastle/crypto/modes/OFBBlockCipher;

    iget-object v2, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->f:Lorg/bouncycastle/crypto/BlockCipher;

    iget-object v3, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->f:Lorg/bouncycastle/crypto/BlockCipher;

    invoke-interface {v3}, Lorg/bouncycastle/crypto/BlockCipher;->getBlockSize()I

    move-result v3

    mul-int/lit8 v3, v3, 0x8

    invoke-direct {v1, v2, v3}, Lorg/bouncycastle/crypto/modes/OFBBlockCipher;-><init>(Lorg/bouncycastle/crypto/BlockCipher;I)V

    invoke-direct {v0, v1}, Lorg/bouncycastle/jce/provider/JCEBlockCipher$b;-><init>(Lorg/bouncycastle/crypto/BlockCipher;)V

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->g:Lorg/bouncycastle/jce/provider/JCEBlockCipher$c;

    goto :goto_0

    :cond_3
    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->m:Ljava/lang/String;

    const-string v1, "CFB"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->f:Lorg/bouncycastle/crypto/BlockCipher;

    invoke-interface {v0}, Lorg/bouncycastle/crypto/BlockCipher;->getBlockSize()I

    move-result v0

    iput v0, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->i:I

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->m:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-eq v0, v2, :cond_4

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->m:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    new-instance v1, Lorg/bouncycastle/jce/provider/JCEBlockCipher$b;

    new-instance v2, Lorg/bouncycastle/crypto/modes/CFBBlockCipher;

    iget-object v3, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->f:Lorg/bouncycastle/crypto/BlockCipher;

    invoke-direct {v2, v3, v0}, Lorg/bouncycastle/crypto/modes/CFBBlockCipher;-><init>(Lorg/bouncycastle/crypto/BlockCipher;I)V

    invoke-direct {v1, v2}, Lorg/bouncycastle/jce/provider/JCEBlockCipher$b;-><init>(Lorg/bouncycastle/crypto/BlockCipher;)V

    iput-object v1, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->g:Lorg/bouncycastle/jce/provider/JCEBlockCipher$c;

    goto/16 :goto_0

    :cond_4
    new-instance v0, Lorg/bouncycastle/jce/provider/JCEBlockCipher$b;

    new-instance v1, Lorg/bouncycastle/crypto/modes/CFBBlockCipher;

    iget-object v2, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->f:Lorg/bouncycastle/crypto/BlockCipher;

    iget-object v3, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->f:Lorg/bouncycastle/crypto/BlockCipher;

    invoke-interface {v3}, Lorg/bouncycastle/crypto/BlockCipher;->getBlockSize()I

    move-result v3

    mul-int/lit8 v3, v3, 0x8

    invoke-direct {v1, v2, v3}, Lorg/bouncycastle/crypto/modes/CFBBlockCipher;-><init>(Lorg/bouncycastle/crypto/BlockCipher;I)V

    invoke-direct {v0, v1}, Lorg/bouncycastle/jce/provider/JCEBlockCipher$b;-><init>(Lorg/bouncycastle/crypto/BlockCipher;)V

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->g:Lorg/bouncycastle/jce/provider/JCEBlockCipher$c;

    goto/16 :goto_0

    :cond_5
    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->m:Ljava/lang/String;

    const-string v1, "PGP"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->m:Ljava/lang/String;

    const-string v1, "PGPCFBwithIV"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    iget-object v1, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->f:Lorg/bouncycastle/crypto/BlockCipher;

    invoke-interface {v1}, Lorg/bouncycastle/crypto/BlockCipher;->getBlockSize()I

    move-result v1

    iput v1, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->i:I

    new-instance v1, Lorg/bouncycastle/jce/provider/JCEBlockCipher$b;

    new-instance v2, Lorg/bouncycastle/crypto/modes/PGPCFBBlockCipher;

    iget-object v3, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->f:Lorg/bouncycastle/crypto/BlockCipher;

    invoke-direct {v2, v3, v0}, Lorg/bouncycastle/crypto/modes/PGPCFBBlockCipher;-><init>(Lorg/bouncycastle/crypto/BlockCipher;Z)V

    invoke-direct {v1, v2}, Lorg/bouncycastle/jce/provider/JCEBlockCipher$b;-><init>(Lorg/bouncycastle/crypto/BlockCipher;)V

    iput-object v1, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->g:Lorg/bouncycastle/jce/provider/JCEBlockCipher$c;

    goto/16 :goto_0

    :cond_6
    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->m:Ljava/lang/String;

    const-string v1, "OpenPGPCFB"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_7

    iput v3, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->i:I

    new-instance v0, Lorg/bouncycastle/jce/provider/JCEBlockCipher$b;

    new-instance v1, Lorg/bouncycastle/crypto/modes/OpenPGPCFBBlockCipher;

    iget-object v2, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->f:Lorg/bouncycastle/crypto/BlockCipher;

    invoke-direct {v1, v2}, Lorg/bouncycastle/crypto/modes/OpenPGPCFBBlockCipher;-><init>(Lorg/bouncycastle/crypto/BlockCipher;)V

    invoke-direct {v0, v1}, Lorg/bouncycastle/jce/provider/JCEBlockCipher$b;-><init>(Lorg/bouncycastle/crypto/BlockCipher;)V

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->g:Lorg/bouncycastle/jce/provider/JCEBlockCipher$c;

    goto/16 :goto_0

    :cond_7
    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->m:Ljava/lang/String;

    const-string v1, "SIC"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_9

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->f:Lorg/bouncycastle/crypto/BlockCipher;

    invoke-interface {v0}, Lorg/bouncycastle/crypto/BlockCipher;->getBlockSize()I

    move-result v0

    iput v0, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->i:I

    iget v0, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->i:I

    const/16 v1, 0x10

    if-ge v0, v1, :cond_8

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Warning: SIC-Mode can become a twotime-pad if the blocksize of the cipher is too small. Use a cipher with a block size of at least 128 bits (e.g. AES)"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_8
    new-instance v0, Lorg/bouncycastle/jce/provider/JCEBlockCipher$b;

    new-instance v1, Lorg/bouncycastle/crypto/BufferedBlockCipher;

    new-instance v2, Lorg/bouncycastle/crypto/modes/SICBlockCipher;

    iget-object v3, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->f:Lorg/bouncycastle/crypto/BlockCipher;

    invoke-direct {v2, v3}, Lorg/bouncycastle/crypto/modes/SICBlockCipher;-><init>(Lorg/bouncycastle/crypto/BlockCipher;)V

    invoke-direct {v1, v2}, Lorg/bouncycastle/crypto/BufferedBlockCipher;-><init>(Lorg/bouncycastle/crypto/BlockCipher;)V

    invoke-direct {v0, v1}, Lorg/bouncycastle/jce/provider/JCEBlockCipher$b;-><init>(Lorg/bouncycastle/crypto/BufferedBlockCipher;)V

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->g:Lorg/bouncycastle/jce/provider/JCEBlockCipher$c;

    goto/16 :goto_0

    :cond_9
    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->m:Ljava/lang/String;

    const-string v1, "CTR"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_a

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->f:Lorg/bouncycastle/crypto/BlockCipher;

    invoke-interface {v0}, Lorg/bouncycastle/crypto/BlockCipher;->getBlockSize()I

    move-result v0

    iput v0, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->i:I

    new-instance v0, Lorg/bouncycastle/jce/provider/JCEBlockCipher$b;

    new-instance v1, Lorg/bouncycastle/crypto/BufferedBlockCipher;

    new-instance v2, Lorg/bouncycastle/crypto/modes/SICBlockCipher;

    iget-object v3, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->f:Lorg/bouncycastle/crypto/BlockCipher;

    invoke-direct {v2, v3}, Lorg/bouncycastle/crypto/modes/SICBlockCipher;-><init>(Lorg/bouncycastle/crypto/BlockCipher;)V

    invoke-direct {v1, v2}, Lorg/bouncycastle/crypto/BufferedBlockCipher;-><init>(Lorg/bouncycastle/crypto/BlockCipher;)V

    invoke-direct {v0, v1}, Lorg/bouncycastle/jce/provider/JCEBlockCipher$b;-><init>(Lorg/bouncycastle/crypto/BufferedBlockCipher;)V

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->g:Lorg/bouncycastle/jce/provider/JCEBlockCipher$c;

    goto/16 :goto_0

    :cond_a
    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->m:Ljava/lang/String;

    const-string v1, "GOFB"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_b

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->f:Lorg/bouncycastle/crypto/BlockCipher;

    invoke-interface {v0}, Lorg/bouncycastle/crypto/BlockCipher;->getBlockSize()I

    move-result v0

    iput v0, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->i:I

    new-instance v0, Lorg/bouncycastle/jce/provider/JCEBlockCipher$b;

    new-instance v1, Lorg/bouncycastle/crypto/BufferedBlockCipher;

    new-instance v2, Lorg/bouncycastle/crypto/modes/GOFBBlockCipher;

    iget-object v3, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->f:Lorg/bouncycastle/crypto/BlockCipher;

    invoke-direct {v2, v3}, Lorg/bouncycastle/crypto/modes/GOFBBlockCipher;-><init>(Lorg/bouncycastle/crypto/BlockCipher;)V

    invoke-direct {v1, v2}, Lorg/bouncycastle/crypto/BufferedBlockCipher;-><init>(Lorg/bouncycastle/crypto/BlockCipher;)V

    invoke-direct {v0, v1}, Lorg/bouncycastle/jce/provider/JCEBlockCipher$b;-><init>(Lorg/bouncycastle/crypto/BufferedBlockCipher;)V

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->g:Lorg/bouncycastle/jce/provider/JCEBlockCipher$c;

    goto/16 :goto_0

    :cond_b
    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->m:Ljava/lang/String;

    const-string v1, "CTS"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_c

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->f:Lorg/bouncycastle/crypto/BlockCipher;

    invoke-interface {v0}, Lorg/bouncycastle/crypto/BlockCipher;->getBlockSize()I

    move-result v0

    iput v0, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->i:I

    new-instance v0, Lorg/bouncycastle/jce/provider/JCEBlockCipher$b;

    new-instance v1, Lorg/bouncycastle/crypto/modes/CTSBlockCipher;

    new-instance v2, Lorg/bouncycastle/crypto/modes/CBCBlockCipher;

    iget-object v3, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->f:Lorg/bouncycastle/crypto/BlockCipher;

    invoke-direct {v2, v3}, Lorg/bouncycastle/crypto/modes/CBCBlockCipher;-><init>(Lorg/bouncycastle/crypto/BlockCipher;)V

    invoke-direct {v1, v2}, Lorg/bouncycastle/crypto/modes/CTSBlockCipher;-><init>(Lorg/bouncycastle/crypto/BlockCipher;)V

    invoke-direct {v0, v1}, Lorg/bouncycastle/jce/provider/JCEBlockCipher$b;-><init>(Lorg/bouncycastle/crypto/BufferedBlockCipher;)V

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->g:Lorg/bouncycastle/jce/provider/JCEBlockCipher$c;

    goto/16 :goto_0

    :cond_c
    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->m:Ljava/lang/String;

    const-string v1, "CCM"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_d

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->f:Lorg/bouncycastle/crypto/BlockCipher;

    invoke-interface {v0}, Lorg/bouncycastle/crypto/BlockCipher;->getBlockSize()I

    move-result v0

    iput v0, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->i:I

    new-instance v0, Lorg/bouncycastle/jce/provider/JCEBlockCipher$a;

    new-instance v1, Lorg/bouncycastle/crypto/modes/CCMBlockCipher;

    iget-object v2, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->f:Lorg/bouncycastle/crypto/BlockCipher;

    invoke-direct {v1, v2}, Lorg/bouncycastle/crypto/modes/CCMBlockCipher;-><init>(Lorg/bouncycastle/crypto/BlockCipher;)V

    invoke-direct {v0, v1}, Lorg/bouncycastle/jce/provider/JCEBlockCipher$a;-><init>(Lorg/bouncycastle/crypto/modes/AEADBlockCipher;)V

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->g:Lorg/bouncycastle/jce/provider/JCEBlockCipher$c;

    goto/16 :goto_0

    :cond_d
    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->m:Ljava/lang/String;

    const-string v1, "EAX"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_e

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->f:Lorg/bouncycastle/crypto/BlockCipher;

    invoke-interface {v0}, Lorg/bouncycastle/crypto/BlockCipher;->getBlockSize()I

    move-result v0

    iput v0, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->i:I

    new-instance v0, Lorg/bouncycastle/jce/provider/JCEBlockCipher$a;

    new-instance v1, Lorg/bouncycastle/crypto/modes/EAXBlockCipher;

    iget-object v2, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->f:Lorg/bouncycastle/crypto/BlockCipher;

    invoke-direct {v1, v2}, Lorg/bouncycastle/crypto/modes/EAXBlockCipher;-><init>(Lorg/bouncycastle/crypto/BlockCipher;)V

    invoke-direct {v0, v1}, Lorg/bouncycastle/jce/provider/JCEBlockCipher$a;-><init>(Lorg/bouncycastle/crypto/modes/AEADBlockCipher;)V

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->g:Lorg/bouncycastle/jce/provider/JCEBlockCipher$c;

    goto/16 :goto_0

    :cond_e
    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->m:Ljava/lang/String;

    const-string v1, "GCM"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_f

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->f:Lorg/bouncycastle/crypto/BlockCipher;

    invoke-interface {v0}, Lorg/bouncycastle/crypto/BlockCipher;->getBlockSize()I

    move-result v0

    iput v0, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->i:I

    new-instance v0, Lorg/bouncycastle/jce/provider/JCEBlockCipher$a;

    new-instance v1, Lorg/bouncycastle/crypto/modes/GCMBlockCipher;

    iget-object v2, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->f:Lorg/bouncycastle/crypto/BlockCipher;

    invoke-direct {v1, v2}, Lorg/bouncycastle/crypto/modes/GCMBlockCipher;-><init>(Lorg/bouncycastle/crypto/BlockCipher;)V

    invoke-direct {v0, v1}, Lorg/bouncycastle/jce/provider/JCEBlockCipher$a;-><init>(Lorg/bouncycastle/crypto/modes/AEADBlockCipher;)V

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->g:Lorg/bouncycastle/jce/provider/JCEBlockCipher$c;

    goto/16 :goto_0

    :cond_f
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
    .locals 3

    invoke-static {p1}, Lorg/bouncycastle/util/Strings;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "NOPADDING"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->g:Lorg/bouncycastle/jce/provider/JCEBlockCipher$c;

    invoke-interface {v0}, Lorg/bouncycastle/jce/provider/JCEBlockCipher$c;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lorg/bouncycastle/jce/provider/JCEBlockCipher$b;

    new-instance v1, Lorg/bouncycastle/crypto/BufferedBlockCipher;

    iget-object v2, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->g:Lorg/bouncycastle/jce/provider/JCEBlockCipher$c;

    invoke-interface {v2}, Lorg/bouncycastle/jce/provider/JCEBlockCipher$c;->b()Lorg/bouncycastle/crypto/BlockCipher;

    move-result-object v2

    invoke-direct {v1, v2}, Lorg/bouncycastle/crypto/BufferedBlockCipher;-><init>(Lorg/bouncycastle/crypto/BlockCipher;)V

    invoke-direct {v0, v1}, Lorg/bouncycastle/jce/provider/JCEBlockCipher$b;-><init>(Lorg/bouncycastle/crypto/BufferedBlockCipher;)V

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->g:Lorg/bouncycastle/jce/provider/JCEBlockCipher$c;

    :cond_0
    :goto_0
    return-void

    :cond_1
    const-string v1, "WITHCTS"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    new-instance v0, Lorg/bouncycastle/jce/provider/JCEBlockCipher$b;

    new-instance v1, Lorg/bouncycastle/crypto/modes/CTSBlockCipher;

    iget-object v2, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->g:Lorg/bouncycastle/jce/provider/JCEBlockCipher$c;

    invoke-interface {v2}, Lorg/bouncycastle/jce/provider/JCEBlockCipher$c;->b()Lorg/bouncycastle/crypto/BlockCipher;

    move-result-object v2

    invoke-direct {v1, v2}, Lorg/bouncycastle/crypto/modes/CTSBlockCipher;-><init>(Lorg/bouncycastle/crypto/BlockCipher;)V

    invoke-direct {v0, v1}, Lorg/bouncycastle/jce/provider/JCEBlockCipher$b;-><init>(Lorg/bouncycastle/crypto/BufferedBlockCipher;)V

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->g:Lorg/bouncycastle/jce/provider/JCEBlockCipher$c;

    goto :goto_0

    :cond_2
    const/4 v1, 0x1

    iput-boolean v1, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->j:Z

    iget-object v1, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->m:Ljava/lang/String;

    invoke-static {v1}, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->a(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    new-instance v0, Ljavax/crypto/NoSuchPaddingException;

    const-string v1, "Only NoPadding can be used with AEAD modes."

    invoke-direct {v0, v1}, Ljavax/crypto/NoSuchPaddingException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    const-string v1, "PKCS5PADDING"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    const-string v1, "PKCS7PADDING"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    :cond_4
    new-instance v0, Lorg/bouncycastle/jce/provider/JCEBlockCipher$b;

    iget-object v1, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->g:Lorg/bouncycastle/jce/provider/JCEBlockCipher$c;

    invoke-interface {v1}, Lorg/bouncycastle/jce/provider/JCEBlockCipher$c;->b()Lorg/bouncycastle/crypto/BlockCipher;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/bouncycastle/jce/provider/JCEBlockCipher$b;-><init>(Lorg/bouncycastle/crypto/BlockCipher;)V

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->g:Lorg/bouncycastle/jce/provider/JCEBlockCipher$c;

    goto :goto_0

    :cond_5
    const-string v1, "ZEROBYTEPADDING"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    new-instance v0, Lorg/bouncycastle/jce/provider/JCEBlockCipher$b;

    iget-object v1, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->g:Lorg/bouncycastle/jce/provider/JCEBlockCipher$c;

    invoke-interface {v1}, Lorg/bouncycastle/jce/provider/JCEBlockCipher$c;->b()Lorg/bouncycastle/crypto/BlockCipher;

    move-result-object v1

    new-instance v2, Lorg/bouncycastle/crypto/paddings/ZeroBytePadding;

    invoke-direct {v2}, Lorg/bouncycastle/crypto/paddings/ZeroBytePadding;-><init>()V

    invoke-direct {v0, v1, v2}, Lorg/bouncycastle/jce/provider/JCEBlockCipher$b;-><init>(Lorg/bouncycastle/crypto/BlockCipher;Lorg/bouncycastle/crypto/paddings/BlockCipherPadding;)V

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->g:Lorg/bouncycastle/jce/provider/JCEBlockCipher$c;

    goto :goto_0

    :cond_6
    const-string v1, "ISO10126PADDING"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    const-string v1, "ISO10126-2PADDING"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_8

    :cond_7
    new-instance v0, Lorg/bouncycastle/jce/provider/JCEBlockCipher$b;

    iget-object v1, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->g:Lorg/bouncycastle/jce/provider/JCEBlockCipher$c;

    invoke-interface {v1}, Lorg/bouncycastle/jce/provider/JCEBlockCipher$c;->b()Lorg/bouncycastle/crypto/BlockCipher;

    move-result-object v1

    new-instance v2, Lorg/bouncycastle/crypto/paddings/ISO10126d2Padding;

    invoke-direct {v2}, Lorg/bouncycastle/crypto/paddings/ISO10126d2Padding;-><init>()V

    invoke-direct {v0, v1, v2}, Lorg/bouncycastle/jce/provider/JCEBlockCipher$b;-><init>(Lorg/bouncycastle/crypto/BlockCipher;Lorg/bouncycastle/crypto/paddings/BlockCipherPadding;)V

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->g:Lorg/bouncycastle/jce/provider/JCEBlockCipher$c;

    goto/16 :goto_0

    :cond_8
    const-string v1, "X9.23PADDING"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    const-string v1, "X923PADDING"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_a

    :cond_9
    new-instance v0, Lorg/bouncycastle/jce/provider/JCEBlockCipher$b;

    iget-object v1, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->g:Lorg/bouncycastle/jce/provider/JCEBlockCipher$c;

    invoke-interface {v1}, Lorg/bouncycastle/jce/provider/JCEBlockCipher$c;->b()Lorg/bouncycastle/crypto/BlockCipher;

    move-result-object v1

    new-instance v2, Lorg/bouncycastle/crypto/paddings/X923Padding;

    invoke-direct {v2}, Lorg/bouncycastle/crypto/paddings/X923Padding;-><init>()V

    invoke-direct {v0, v1, v2}, Lorg/bouncycastle/jce/provider/JCEBlockCipher$b;-><init>(Lorg/bouncycastle/crypto/BlockCipher;Lorg/bouncycastle/crypto/paddings/BlockCipherPadding;)V

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->g:Lorg/bouncycastle/jce/provider/JCEBlockCipher$c;

    goto/16 :goto_0

    :cond_a
    const-string v1, "ISO7816-4PADDING"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    const-string v1, "ISO9797-1PADDING"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_c

    :cond_b
    new-instance v0, Lorg/bouncycastle/jce/provider/JCEBlockCipher$b;

    iget-object v1, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->g:Lorg/bouncycastle/jce/provider/JCEBlockCipher$c;

    invoke-interface {v1}, Lorg/bouncycastle/jce/provider/JCEBlockCipher$c;->b()Lorg/bouncycastle/crypto/BlockCipher;

    move-result-object v1

    new-instance v2, Lorg/bouncycastle/crypto/paddings/ISO7816d4Padding;

    invoke-direct {v2}, Lorg/bouncycastle/crypto/paddings/ISO7816d4Padding;-><init>()V

    invoke-direct {v0, v1, v2}, Lorg/bouncycastle/jce/provider/JCEBlockCipher$b;-><init>(Lorg/bouncycastle/crypto/BlockCipher;Lorg/bouncycastle/crypto/paddings/BlockCipherPadding;)V

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->g:Lorg/bouncycastle/jce/provider/JCEBlockCipher$c;

    goto/16 :goto_0

    :cond_c
    const-string v1, "TBCPADDING"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_d

    new-instance v0, Lorg/bouncycastle/jce/provider/JCEBlockCipher$b;

    iget-object v1, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->g:Lorg/bouncycastle/jce/provider/JCEBlockCipher$c;

    invoke-interface {v1}, Lorg/bouncycastle/jce/provider/JCEBlockCipher$c;->b()Lorg/bouncycastle/crypto/BlockCipher;

    move-result-object v1

    new-instance v2, Lorg/bouncycastle/crypto/paddings/TBCPadding;

    invoke-direct {v2}, Lorg/bouncycastle/crypto/paddings/TBCPadding;-><init>()V

    invoke-direct {v0, v1, v2}, Lorg/bouncycastle/jce/provider/JCEBlockCipher$b;-><init>(Lorg/bouncycastle/crypto/BlockCipher;Lorg/bouncycastle/crypto/paddings/BlockCipherPadding;)V

    iput-object v0, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->g:Lorg/bouncycastle/jce/provider/JCEBlockCipher$c;

    goto/16 :goto_0

    :cond_d
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
.end method

.method protected engineUpdate([BII[BI)I
    .locals 6

    :try_start_0
    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->g:Lorg/bouncycastle/jce/provider/JCEBlockCipher$c;

    move-object v1, p1

    move v2, p2

    move v3, p3

    move-object v4, p4

    move v5, p5

    invoke-interface/range {v0 .. v5}, Lorg/bouncycastle/jce/provider/JCEBlockCipher$c;->a([BII[BI)I
    :try_end_0
    .catch Lorg/bouncycastle/crypto/DataLengthException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    return v0

    :catch_0
    move-exception v0

    new-instance v1, Ljavax/crypto/ShortBufferException;

    invoke-virtual {v0}, Lorg/bouncycastle/crypto/DataLengthException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljavax/crypto/ShortBufferException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method protected engineUpdate([BII)[B
    .locals 7

    const/4 v6, 0x0

    const/4 v5, 0x0

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->g:Lorg/bouncycastle/jce/provider/JCEBlockCipher$c;

    invoke-interface {v0, p3}, Lorg/bouncycastle/jce/provider/JCEBlockCipher$c;->b(I)I

    move-result v0

    if-lez v0, :cond_2

    new-array v4, v0, [B

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->g:Lorg/bouncycastle/jce/provider/JCEBlockCipher$c;

    move-object v1, p1

    move v2, p2

    move v3, p3

    invoke-interface/range {v0 .. v5}, Lorg/bouncycastle/jce/provider/JCEBlockCipher$c;->a([BII[BI)I

    move-result v1

    if-nez v1, :cond_1

    move-object v4, v6

    :cond_0
    :goto_0
    return-object v4

    :cond_1
    array-length v0, v4

    if-eq v1, v0, :cond_0

    new-array v0, v1, [B

    invoke-static {v4, v5, v0, v5, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move-object v4, v0

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lorg/bouncycastle/jce/provider/JCEBlockCipher;->g:Lorg/bouncycastle/jce/provider/JCEBlockCipher$c;

    move-object v1, p1

    move v2, p2

    move v3, p3

    move-object v4, v6

    invoke-interface/range {v0 .. v5}, Lorg/bouncycastle/jce/provider/JCEBlockCipher$c;->a([BII[BI)I

    move-object v4, v6

    goto :goto_0
.end method
