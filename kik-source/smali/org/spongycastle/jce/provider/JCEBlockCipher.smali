.class public Lorg/spongycastle/jce/provider/JCEBlockCipher;
.super Ljavax/crypto/CipherSpi;
.source "SourceFile"

# interfaces
.implements Lorg/spongycastle/jcajce/provider/symmetric/util/PBE;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/spongycastle/jce/provider/JCEBlockCipher$a;,
        Lorg/spongycastle/jce/provider/JCEBlockCipher$b;,
        Lorg/spongycastle/jce/provider/JCEBlockCipher$c;,
        Lorg/spongycastle/jce/provider/JCEBlockCipher$PBEWithAESCBC;,
        Lorg/spongycastle/jce/provider/JCEBlockCipher$PBEWithSHAAndTwofish;,
        Lorg/spongycastle/jce/provider/JCEBlockCipher$PBEWithSHAAnd40BitRC2;,
        Lorg/spongycastle/jce/provider/JCEBlockCipher$PBEWithSHAAnd128BitRC2;,
        Lorg/spongycastle/jce/provider/JCEBlockCipher$PBEWithSHA1AndRC2;,
        Lorg/spongycastle/jce/provider/JCEBlockCipher$PBEWithSHA1AndDES;,
        Lorg/spongycastle/jce/provider/JCEBlockCipher$PBEWithMD5AndRC2;,
        Lorg/spongycastle/jce/provider/JCEBlockCipher$PBEWithMD5AndDES;,
        Lorg/spongycastle/jce/provider/JCEBlockCipher$RC2CBC;,
        Lorg/spongycastle/jce/provider/JCEBlockCipher$RC2;,
        Lorg/spongycastle/jce/provider/JCEBlockCipher$GOST28147cbc;,
        Lorg/spongycastle/jce/provider/JCEBlockCipher$GOST28147;,
        Lorg/spongycastle/jce/provider/JCEBlockCipher$DESCBC;,
        Lorg/spongycastle/jce/provider/JCEBlockCipher$DES;
    }
.end annotation


# instance fields
.field private a:[Ljava/lang/Class;

.field private b:Lorg/spongycastle/crypto/BlockCipher;

.field private c:Lorg/spongycastle/jce/provider/JCEBlockCipher$c;

.field private d:Lorg/spongycastle/crypto/params/ParametersWithIV;

.field private e:I

.field private f:Z

.field private g:Ljavax/crypto/spec/PBEParameterSpec;

.field private h:Ljava/lang/String;

.field private i:Ljava/lang/String;

.field private j:Ljava/security/AlgorithmParameters;


# direct methods
.method protected constructor <init>(Lorg/spongycastle/crypto/BlockCipher;)V
    .locals 5

    .prologue
    const/4 v4, 0x0

    const/4 v3, 0x0

    .line 98
    invoke-direct {p0}, Ljavax/crypto/CipherSpi;-><init>()V

    .line 72
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

    const-class v2, Lorg/spongycastle/jce/spec/GOST28147ParameterSpec;

    aput-object v2, v0, v1

    iput-object v0, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->a:[Ljava/lang/Class;

    .line 85
    iput v4, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->e:I

    .line 89
    iput-object v3, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->g:Ljavax/crypto/spec/PBEParameterSpec;

    .line 90
    iput-object v3, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->h:Ljava/lang/String;

    .line 92
    iput-object v3, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->i:Ljava/lang/String;

    .line 99
    iput-object p1, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->b:Lorg/spongycastle/crypto/BlockCipher;

    .line 101
    new-instance v0, Lorg/spongycastle/jce/provider/JCEBlockCipher$b;

    invoke-direct {v0, p1}, Lorg/spongycastle/jce/provider/JCEBlockCipher$b;-><init>(Lorg/spongycastle/crypto/BlockCipher;)V

    iput-object v0, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->c:Lorg/spongycastle/jce/provider/JCEBlockCipher$c;

    .line 102
    return-void
.end method

.method protected constructor <init>(Lorg/spongycastle/crypto/BlockCipher;B)V
    .locals 5

    .prologue
    const/4 v4, 0x0

    const/4 v3, 0x0

    .line 107
    invoke-direct {p0}, Ljavax/crypto/CipherSpi;-><init>()V

    .line 72
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

    const-class v2, Lorg/spongycastle/jce/spec/GOST28147ParameterSpec;

    aput-object v2, v0, v1

    iput-object v0, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->a:[Ljava/lang/Class;

    .line 85
    iput v4, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->e:I

    .line 89
    iput-object v3, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->g:Ljavax/crypto/spec/PBEParameterSpec;

    .line 90
    iput-object v3, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->h:Ljava/lang/String;

    .line 92
    iput-object v3, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->i:Ljava/lang/String;

    .line 108
    iput-object p1, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->b:Lorg/spongycastle/crypto/BlockCipher;

    .line 110
    new-instance v0, Lorg/spongycastle/jce/provider/JCEBlockCipher$b;

    invoke-direct {v0, p1}, Lorg/spongycastle/jce/provider/JCEBlockCipher$b;-><init>(Lorg/spongycastle/crypto/BlockCipher;)V

    iput-object v0, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->c:Lorg/spongycastle/jce/provider/JCEBlockCipher$c;

    .line 111
    const/16 v0, 0x8

    iput v0, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->e:I

    .line 112
    return-void
.end method

.method private static a(Ljava/lang/String;)Z
    .locals 1

    .prologue
    .line 740
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

    .prologue
    .line 716
    const/4 v0, 0x0

    .line 718
    if-eqz p3, :cond_0

    .line 720
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->c:Lorg/spongycastle/jce/provider/JCEBlockCipher$c;

    move-object v1, p1

    move v2, p2

    move v3, p3

    move-object v4, p4

    move v5, p5

    invoke-interface/range {v0 .. v5}, Lorg/spongycastle/jce/provider/JCEBlockCipher$c;->a([BII[BI)I

    move-result v0

    .line 725
    :cond_0
    :try_start_0
    iget-object v1, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->c:Lorg/spongycastle/jce/provider/JCEBlockCipher$c;

    add-int v2, p5, v0

    invoke-interface {v1, p4, v2}, Lorg/spongycastle/jce/provider/JCEBlockCipher$c;->a([BI)I
    :try_end_0
    .catch Lorg/spongycastle/crypto/DataLengthException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lorg/spongycastle/crypto/InvalidCipherTextException; {:try_start_0 .. :try_end_0} :catch_1

    move-result v1

    add-int/2addr v0, v1

    return v0

    .line 727
    :catch_0
    move-exception v0

    .line 729
    new-instance v1, Ljavax/crypto/IllegalBlockSizeException;

    invoke-virtual {v0}, Lorg/spongycastle/crypto/DataLengthException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljavax/crypto/IllegalBlockSizeException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 731
    :catch_1
    move-exception v0

    .line 733
    new-instance v1, Ljavax/crypto/BadPaddingException;

    invoke-virtual {v0}, Lorg/spongycastle/crypto/InvalidCipherTextException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljavax/crypto/BadPaddingException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method protected engineDoFinal([BII)[B
    .locals 6

    .prologue
    const/4 v5, 0x0

    .line 675
    .line 676
    invoke-virtual {p0, p3}, Lorg/spongycastle/jce/provider/JCEBlockCipher;->engineGetOutputSize(I)I

    move-result v0

    new-array v4, v0, [B

    .line 678
    if-eqz p3, :cond_1

    .line 680
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->c:Lorg/spongycastle/jce/provider/JCEBlockCipher$c;

    move-object v1, p1

    move v2, p2

    move v3, p3

    invoke-interface/range {v0 .. v5}, Lorg/spongycastle/jce/provider/JCEBlockCipher$c;->a([BII[BI)I

    move-result v0

    .line 685
    :goto_0
    :try_start_0
    iget-object v1, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->c:Lorg/spongycastle/jce/provider/JCEBlockCipher$c;

    invoke-interface {v1, v4, v0}, Lorg/spongycastle/jce/provider/JCEBlockCipher$c;->a([BI)I
    :try_end_0
    .catch Lorg/spongycastle/crypto/DataLengthException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lorg/spongycastle/crypto/InvalidCipherTextException; {:try_start_0 .. :try_end_0} :catch_1

    move-result v1

    add-int/2addr v1, v0

    .line 696
    array-length v0, v4

    if-ne v1, v0, :cond_0

    .line 705
    :goto_1
    return-object v4

    .line 687
    :catch_0
    move-exception v0

    .line 689
    new-instance v1, Ljavax/crypto/IllegalBlockSizeException;

    invoke-virtual {v0}, Lorg/spongycastle/crypto/DataLengthException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljavax/crypto/IllegalBlockSizeException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 691
    :catch_1
    move-exception v0

    .line 693
    new-instance v1, Ljavax/crypto/BadPaddingException;

    invoke-virtual {v0}, Lorg/spongycastle/crypto/InvalidCipherTextException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljavax/crypto/BadPaddingException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 701
    :cond_0
    new-array v0, v1, [B

    .line 703
    invoke-static {v4, v5, v0, v5, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move-object v4, v0

    .line 705
    goto :goto_1

    :cond_1
    move v0, v5

    goto :goto_0
.end method

.method protected engineGetBlockSize()I
    .locals 1

    .prologue
    .line 126
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->b:Lorg/spongycastle/crypto/BlockCipher;

    invoke-interface {v0}, Lorg/spongycastle/crypto/BlockCipher;->b()I

    move-result v0

    return v0
.end method

.method protected engineGetIV()[B
    .locals 1

    .prologue
    .line 131
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->d:Lorg/spongycastle/crypto/params/ParametersWithIV;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->d:Lorg/spongycastle/crypto/params/ParametersWithIV;

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
    .line 137
    invoke-interface {p1}, Ljava/security/Key;->getEncoded()[B

    move-result-object v0

    array-length v0, v0

    mul-int/lit8 v0, v0, 0x8

    return v0
.end method

.method protected engineGetOutputSize(I)I
    .locals 1

    .prologue
    .line 143
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->c:Lorg/spongycastle/jce/provider/JCEBlockCipher$c;

    invoke-interface {v0, p1}, Lorg/spongycastle/jce/provider/JCEBlockCipher$c;->a(I)I

    move-result v0

    return v0
.end method

.method protected engineGetParameters()Ljava/security/AlgorithmParameters;
    .locals 3

    .prologue
    const/16 v2, 0x2f

    .line 148
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->j:Ljava/security/AlgorithmParameters;

    if-nez v0, :cond_0

    .line 150
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->g:Ljavax/crypto/spec/PBEParameterSpec;

    if-eqz v0, :cond_1

    .line 154
    :try_start_0
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->h:Ljava/lang/String;

    sget-object v1, Lorg/spongycastle/jce/provider/BouncyCastleProvider;->a:Ljava/lang/String;

    invoke-static {v0, v1}, Ljava/security/AlgorithmParameters;->getInstance(Ljava/lang/String;Ljava/lang/String;)Ljava/security/AlgorithmParameters;

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->j:Ljava/security/AlgorithmParameters;

    .line 155
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->j:Ljava/security/AlgorithmParameters;

    iget-object v1, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->g:Ljavax/crypto/spec/PBEParameterSpec;

    invoke-virtual {v0, v1}, Ljava/security/AlgorithmParameters;->init(Ljava/security/spec/AlgorithmParameterSpec;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 183
    :cond_0
    :goto_0
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->j:Ljava/security/AlgorithmParameters;

    :goto_1
    return-object v0

    .line 159
    :catch_0
    move-exception v0

    const/4 v0, 0x0

    goto :goto_1

    .line 162
    :cond_1
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->d:Lorg/spongycastle/crypto/params/ParametersWithIV;

    if-eqz v0, :cond_0

    .line 164
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->c:Lorg/spongycastle/jce/provider/JCEBlockCipher$c;

    invoke-interface {v0}, Lorg/spongycastle/jce/provider/JCEBlockCipher$c;->b()Lorg/spongycastle/crypto/BlockCipher;

    move-result-object v0

    invoke-interface {v0}, Lorg/spongycastle/crypto/BlockCipher;->a()Ljava/lang/String;

    move-result-object v0

    .line 166
    invoke-virtual {v0, v2}, Ljava/lang/String;->indexOf(I)I

    move-result v1

    if-ltz v1, :cond_2

    .line 168
    const/4 v1, 0x0

    invoke-virtual {v0, v2}, Ljava/lang/String;->indexOf(I)I

    move-result v2

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    .line 173
    :cond_2
    :try_start_1
    sget-object v1, Lorg/spongycastle/jce/provider/BouncyCastleProvider;->a:Ljava/lang/String;

    invoke-static {v0, v1}, Ljava/security/AlgorithmParameters;->getInstance(Ljava/lang/String;Ljava/lang/String;)Ljava/security/AlgorithmParameters;

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->j:Ljava/security/AlgorithmParameters;

    .line 174
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->j:Ljava/security/AlgorithmParameters;

    iget-object v1, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->d:Lorg/spongycastle/crypto/params/ParametersWithIV;

    invoke-virtual {v1}, Lorg/spongycastle/crypto/params/ParametersWithIV;->a()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/security/AlgorithmParameters;->init([B)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    .line 176
    :catch_1
    move-exception v0

    .line 178
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method protected engineInit(ILjava/security/Key;Ljava/security/AlgorithmParameters;Ljava/security/SecureRandom;)V
    .locals 3

    .prologue
    .line 573
    const/4 v1, 0x0

    .line 575
    if-eqz p3, :cond_0

    .line 577
    const/4 v0, 0x0

    :goto_0
    iget-object v2, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->a:[Ljava/lang/Class;

    array-length v2, v2

    if-eq v0, v2, :cond_2

    .line 581
    :try_start_0
    iget-object v2, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->a:[Ljava/lang/Class;

    aget-object v2, v2, v0

    invoke-virtual {p3, v2}, Ljava/security/AlgorithmParameters;->getParameterSpec(Ljava/lang/Class;)Ljava/security/spec/AlgorithmParameterSpec;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 590
    :goto_1
    if-nez v0, :cond_1

    .line 592
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

    .line 577
    :catch_0
    move-exception v2

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    move-object v0, v1

    .line 596
    :cond_1
    invoke-virtual {p0, p1, p2, v0, p4}, Lorg/spongycastle/jce/provider/JCEBlockCipher;->engineInit(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;Ljava/security/SecureRandom;)V

    .line 598
    iput-object p3, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->j:Ljava/security/AlgorithmParameters;

    .line 599
    return-void

    :cond_2
    move-object v0, v1

    goto :goto_1
.end method

.method protected engineInit(ILjava/security/Key;Ljava/security/SecureRandom;)V
    .locals 2

    .prologue
    .line 609
    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p0, p1, p2, v0, p3}, Lorg/spongycastle/jce/provider/JCEBlockCipher;->engineInit(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;Ljava/security/SecureRandom;)V
    :try_end_0
    .catch Ljava/security/InvalidAlgorithmParameterException; {:try_start_0 .. :try_end_0} :catch_0

    .line 614
    return-void

    .line 611
    :catch_0
    move-exception v0

    .line 613
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

    const/4 v2, 0x0

    .line 362
    iput-object v2, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->g:Ljavax/crypto/spec/PBEParameterSpec;

    .line 363
    iput-object v2, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->h:Ljava/lang/String;

    .line 364
    iput-object v2, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->j:Ljava/security/AlgorithmParameters;

    .line 369
    instance-of v0, p2, Ljavax/crypto/SecretKey;

    if-nez v0, :cond_0

    .line 371
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

    .line 377
    :cond_0
    if-nez p3, :cond_1

    iget-object v0, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->b:Lorg/spongycastle/crypto/BlockCipher;

    invoke-interface {v0}, Lorg/spongycastle/crypto/BlockCipher;->a()Ljava/lang/String;

    move-result-object v0

    const-string v1, "RC5-64"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 379
    new-instance v0, Ljava/security/InvalidAlgorithmParameterException;

    const-string v1, "RC5 requires an RC5ParametersSpec to be passed in."

    invoke-direct {v0, v1}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 385
    :cond_1
    instance-of v0, p2, Lorg/spongycastle/jcajce/provider/symmetric/util/BCPBEKey;

    if-eqz v0, :cond_7

    .line 387
    check-cast p2, Lorg/spongycastle/jcajce/provider/symmetric/util/BCPBEKey;

    .line 389
    invoke-virtual {p2}, Lorg/spongycastle/jcajce/provider/symmetric/util/BCPBEKey;->c()Lorg/spongycastle/asn1/DERObjectIdentifier;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 391
    invoke-virtual {p2}, Lorg/spongycastle/jcajce/provider/symmetric/util/BCPBEKey;->c()Lorg/spongycastle/asn1/DERObjectIdentifier;

    move-result-object v0

    invoke-virtual {v0}, Lorg/spongycastle/asn1/DERObjectIdentifier;->c()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->h:Ljava/lang/String;

    .line 398
    :goto_0
    invoke-virtual {p2}, Lorg/spongycastle/jcajce/provider/symmetric/util/BCPBEKey;->b()Lorg/spongycastle/crypto/CipherParameters;

    move-result-object v0

    if-eqz v0, :cond_5

    .line 400
    invoke-virtual {p2}, Lorg/spongycastle/jcajce/provider/symmetric/util/BCPBEKey;->b()Lorg/spongycastle/crypto/CipherParameters;

    move-result-object v1

    .line 401
    new-instance v0, Ljavax/crypto/spec/PBEParameterSpec;

    invoke-virtual {p2}, Lorg/spongycastle/jcajce/provider/symmetric/util/BCPBEKey;->getSalt()[B

    move-result-object v2

    invoke-virtual {p2}, Lorg/spongycastle/jcajce/provider/symmetric/util/BCPBEKey;->getIterationCount()I

    move-result v3

    invoke-direct {v0, v2, v3}, Ljavax/crypto/spec/PBEParameterSpec;-><init>([BI)V

    iput-object v0, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->g:Ljavax/crypto/spec/PBEParameterSpec;

    .line 413
    :goto_1
    instance-of v0, v1, Lorg/spongycastle/crypto/params/ParametersWithIV;

    if-eqz v0, :cond_2

    move-object v0, v1

    .line 415
    check-cast v0, Lorg/spongycastle/crypto/params/ParametersWithIV;

    iput-object v0, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->d:Lorg/spongycastle/crypto/params/ParametersWithIV;

    :cond_2
    move-object v0, v1

    .line 516
    :goto_2
    iget v1, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->e:I

    if-eqz v1, :cond_16

    instance-of v1, v0, Lorg/spongycastle/crypto/params/ParametersWithIV;

    if-nez v1, :cond_16

    .line 520
    if-nez p4, :cond_17

    .line 522
    new-instance v1, Ljava/security/SecureRandom;

    invoke-direct {v1}, Ljava/security/SecureRandom;-><init>()V

    .line 525
    :goto_3
    if-eq p1, v4, :cond_3

    const/4 v2, 0x3

    if-ne p1, v2, :cond_14

    .line 527
    :cond_3
    iget v2, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->e:I

    new-array v2, v2, [B

    .line 529
    invoke-virtual {v1, v2}, Ljava/security/SecureRandom;->nextBytes([B)V

    .line 530
    new-instance v1, Lorg/spongycastle/crypto/params/ParametersWithIV;

    invoke-direct {v1, v0, v2}, Lorg/spongycastle/crypto/params/ParametersWithIV;-><init>(Lorg/spongycastle/crypto/CipherParameters;[B)V

    move-object v0, v1

    .line 531
    check-cast v0, Lorg/spongycastle/crypto/params/ParametersWithIV;

    iput-object v0, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->d:Lorg/spongycastle/crypto/params/ParametersWithIV;

    .line 539
    :goto_4
    if-eqz p4, :cond_15

    iget-boolean v0, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->f:Z

    if-eqz v0, :cond_15

    .line 541
    new-instance v0, Lorg/spongycastle/crypto/params/ParametersWithRandom;

    invoke-direct {v0, v1, p4}, Lorg/spongycastle/crypto/params/ParametersWithRandom;-><init>(Lorg/spongycastle/crypto/CipherParameters;Ljava/security/SecureRandom;)V

    .line 546
    :goto_5
    packed-switch p1, :pswitch_data_0

    .line 557
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

    .line 563
    :catch_0
    move-exception v0

    .line 562
    new-instance v1, Ljava/security/InvalidKeyException;

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/security/InvalidKeyException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 395
    :cond_4
    invoke-virtual {p2}, Lorg/spongycastle/jcajce/provider/symmetric/util/BCPBEKey;->getAlgorithm()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->h:Ljava/lang/String;

    goto/16 :goto_0

    .line 403
    :cond_5
    instance-of v0, p3, Ljavax/crypto/spec/PBEParameterSpec;

    if-eqz v0, :cond_6

    move-object v0, p3

    .line 405
    check-cast v0, Ljavax/crypto/spec/PBEParameterSpec;

    iput-object v0, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->g:Ljavax/crypto/spec/PBEParameterSpec;

    .line 406
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->c:Lorg/spongycastle/jce/provider/JCEBlockCipher$c;

    invoke-interface {v0}, Lorg/spongycastle/jce/provider/JCEBlockCipher$c;->b()Lorg/spongycastle/crypto/BlockCipher;

    move-result-object v0

    invoke-interface {v0}, Lorg/spongycastle/crypto/BlockCipher;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {p2, p3, v0}, Lorg/spongycastle/jcajce/provider/symmetric/util/PBE$Util;->a(Lorg/spongycastle/jcajce/provider/symmetric/util/BCPBEKey;Ljava/security/spec/AlgorithmParameterSpec;Ljava/lang/String;)Lorg/spongycastle/crypto/CipherParameters;

    move-result-object v1

    goto/16 :goto_1

    .line 410
    :cond_6
    new-instance v0, Ljava/security/InvalidAlgorithmParameterException;

    const-string v1, "PBE requires PBE parameters to be set."

    invoke-direct {v0, v1}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 418
    :cond_7
    if-nez p3, :cond_8

    .line 420
    new-instance v1, Lorg/spongycastle/crypto/params/KeyParameter;

    invoke-interface {p2}, Ljava/security/Key;->getEncoded()[B

    move-result-object v0

    invoke-direct {v1, v0}, Lorg/spongycastle/crypto/params/KeyParameter;-><init>([B)V

    move-object v0, v1

    goto/16 :goto_2

    .line 422
    :cond_8
    instance-of v0, p3, Ljavax/crypto/spec/IvParameterSpec;

    if-eqz v0, :cond_d

    .line 424
    iget v0, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->e:I

    if-eqz v0, :cond_b

    .line 426
    check-cast p3, Ljavax/crypto/spec/IvParameterSpec;

    .line 428
    invoke-virtual {p3}, Ljavax/crypto/spec/IvParameterSpec;->getIV()[B

    move-result-object v0

    array-length v0, v0

    iget v1, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->e:I

    if-eq v0, v1, :cond_9

    iget-object v0, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->i:Ljava/lang/String;

    invoke-static {v0}, Lorg/spongycastle/jce/provider/JCEBlockCipher;->a(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_9

    .line 430
    new-instance v0, Ljava/security/InvalidAlgorithmParameterException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "IV must be "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->e:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " bytes long."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 433
    :cond_9
    instance-of v0, p2, Lorg/spongycastle/jce/spec/RepeatedSecretKeySpec;

    if-eqz v0, :cond_a

    .line 435
    new-instance v1, Lorg/spongycastle/crypto/params/ParametersWithIV;

    invoke-virtual {p3}, Ljavax/crypto/spec/IvParameterSpec;->getIV()[B

    move-result-object v0

    invoke-direct {v1, v2, v0}, Lorg/spongycastle/crypto/params/ParametersWithIV;-><init>(Lorg/spongycastle/crypto/CipherParameters;[B)V

    move-object v0, v1

    .line 436
    check-cast v0, Lorg/spongycastle/crypto/params/ParametersWithIV;

    iput-object v0, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->d:Lorg/spongycastle/crypto/params/ParametersWithIV;

    move-object v0, v1

    goto/16 :goto_2

    .line 440
    :cond_a
    new-instance v1, Lorg/spongycastle/crypto/params/ParametersWithIV;

    new-instance v0, Lorg/spongycastle/crypto/params/KeyParameter;

    invoke-interface {p2}, Ljava/security/Key;->getEncoded()[B

    move-result-object v2

    invoke-direct {v0, v2}, Lorg/spongycastle/crypto/params/KeyParameter;-><init>([B)V

    invoke-virtual {p3}, Ljavax/crypto/spec/IvParameterSpec;->getIV()[B

    move-result-object v2

    invoke-direct {v1, v0, v2}, Lorg/spongycastle/crypto/params/ParametersWithIV;-><init>(Lorg/spongycastle/crypto/CipherParameters;[B)V

    move-object v0, v1

    .line 441
    check-cast v0, Lorg/spongycastle/crypto/params/ParametersWithIV;

    iput-object v0, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->d:Lorg/spongycastle/crypto/params/ParametersWithIV;

    move-object v0, v1

    .line 443
    goto/16 :goto_2

    .line 446
    :cond_b
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->i:Ljava/lang/String;

    if-eqz v0, :cond_c

    iget-object v0, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->i:Ljava/lang/String;

    const-string v1, "ECB"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_c

    .line 448
    new-instance v0, Ljava/security/InvalidAlgorithmParameterException;

    const-string v1, "ECB mode does not use an IV"

    invoke-direct {v0, v1}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 451
    :cond_c
    new-instance v1, Lorg/spongycastle/crypto/params/KeyParameter;

    invoke-interface {p2}, Ljava/security/Key;->getEncoded()[B

    move-result-object v0

    invoke-direct {v1, v0}, Lorg/spongycastle/crypto/params/KeyParameter;-><init>([B)V

    move-object v0, v1

    goto/16 :goto_2

    .line 454
    :cond_d
    instance-of v0, p3, Lorg/spongycastle/jce/spec/GOST28147ParameterSpec;

    if-eqz v0, :cond_e

    move-object v0, p3

    .line 456
    check-cast v0, Lorg/spongycastle/jce/spec/GOST28147ParameterSpec;

    .line 458
    new-instance v2, Lorg/spongycastle/crypto/params/ParametersWithSBox;

    new-instance v1, Lorg/spongycastle/crypto/params/KeyParameter;

    invoke-interface {p2}, Ljava/security/Key;->getEncoded()[B

    move-result-object v3

    invoke-direct {v1, v3}, Lorg/spongycastle/crypto/params/KeyParameter;-><init>([B)V

    check-cast p3, Lorg/spongycastle/jce/spec/GOST28147ParameterSpec;

    invoke-virtual {p3}, Lorg/spongycastle/jce/spec/GOST28147ParameterSpec;->a()[B

    move-result-object v3

    invoke-direct {v2, v1, v3}, Lorg/spongycastle/crypto/params/ParametersWithSBox;-><init>(Lorg/spongycastle/crypto/CipherParameters;[B)V

    .line 461
    invoke-virtual {v0}, Lorg/spongycastle/jce/spec/GOST28147ParameterSpec;->b()[B

    move-result-object v1

    if-eqz v1, :cond_1a

    iget v1, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->e:I

    if-eqz v1, :cond_1a

    .line 463
    new-instance v1, Lorg/spongycastle/crypto/params/ParametersWithIV;

    invoke-virtual {v0}, Lorg/spongycastle/jce/spec/GOST28147ParameterSpec;->b()[B

    move-result-object v0

    invoke-direct {v1, v2, v0}, Lorg/spongycastle/crypto/params/ParametersWithIV;-><init>(Lorg/spongycastle/crypto/CipherParameters;[B)V

    move-object v0, v1

    .line 464
    check-cast v0, Lorg/spongycastle/crypto/params/ParametersWithIV;

    iput-object v0, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->d:Lorg/spongycastle/crypto/params/ParametersWithIV;

    :goto_6
    move-object v0, v1

    .line 466
    goto/16 :goto_2

    .line 467
    :cond_e
    instance-of v0, p3, Ljavax/crypto/spec/RC2ParameterSpec;

    if-eqz v0, :cond_f

    move-object v0, p3

    .line 469
    check-cast v0, Ljavax/crypto/spec/RC2ParameterSpec;

    .line 471
    new-instance v2, Lorg/spongycastle/crypto/params/RC2Parameters;

    invoke-interface {p2}, Ljava/security/Key;->getEncoded()[B

    move-result-object v1

    check-cast p3, Ljavax/crypto/spec/RC2ParameterSpec;

    invoke-virtual {p3}, Ljavax/crypto/spec/RC2ParameterSpec;->getEffectiveKeyBits()I

    move-result v3

    invoke-direct {v2, v1, v3}, Lorg/spongycastle/crypto/params/RC2Parameters;-><init>([BI)V

    .line 473
    invoke-virtual {v0}, Ljavax/crypto/spec/RC2ParameterSpec;->getIV()[B

    move-result-object v1

    if-eqz v1, :cond_19

    iget v1, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->e:I

    if-eqz v1, :cond_19

    .line 475
    new-instance v1, Lorg/spongycastle/crypto/params/ParametersWithIV;

    invoke-virtual {v0}, Ljavax/crypto/spec/RC2ParameterSpec;->getIV()[B

    move-result-object v0

    invoke-direct {v1, v2, v0}, Lorg/spongycastle/crypto/params/ParametersWithIV;-><init>(Lorg/spongycastle/crypto/CipherParameters;[B)V

    move-object v0, v1

    .line 476
    check-cast v0, Lorg/spongycastle/crypto/params/ParametersWithIV;

    iput-object v0, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->d:Lorg/spongycastle/crypto/params/ParametersWithIV;

    :goto_7
    move-object v0, v1

    .line 478
    goto/16 :goto_2

    .line 479
    :cond_f
    instance-of v0, p3, Ljavax/crypto/spec/RC5ParameterSpec;

    if-eqz v0, :cond_13

    move-object v0, p3

    .line 481
    check-cast v0, Ljavax/crypto/spec/RC5ParameterSpec;

    .line 483
    new-instance v2, Lorg/spongycastle/crypto/params/RC5Parameters;

    invoke-interface {p2}, Ljava/security/Key;->getEncoded()[B

    move-result-object v1

    check-cast p3, Ljavax/crypto/spec/RC5ParameterSpec;

    invoke-virtual {p3}, Ljavax/crypto/spec/RC5ParameterSpec;->getRounds()I

    move-result v3

    invoke-direct {v2, v1, v3}, Lorg/spongycastle/crypto/params/RC5Parameters;-><init>([BI)V

    .line 484
    iget-object v1, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->b:Lorg/spongycastle/crypto/BlockCipher;

    invoke-interface {v1}, Lorg/spongycastle/crypto/BlockCipher;->a()Ljava/lang/String;

    move-result-object v1

    const-string v3, "RC5"

    invoke-virtual {v1, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_11

    .line 486
    iget-object v1, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->b:Lorg/spongycastle/crypto/BlockCipher;

    invoke-interface {v1}, Lorg/spongycastle/crypto/BlockCipher;->a()Ljava/lang/String;

    move-result-object v1

    const-string v3, "RC5-32"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_10

    .line 488
    invoke-virtual {v0}, Ljavax/crypto/spec/RC5ParameterSpec;->getWordSize()I

    move-result v1

    const/16 v3, 0x20

    if-eq v1, v3, :cond_12

    .line 490
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

    .line 493
    :cond_10
    iget-object v1, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->b:Lorg/spongycastle/crypto/BlockCipher;

    invoke-interface {v1}, Lorg/spongycastle/crypto/BlockCipher;->a()Ljava/lang/String;

    move-result-object v1

    const-string v3, "RC5-64"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_12

    .line 495
    invoke-virtual {v0}, Ljavax/crypto/spec/RC5ParameterSpec;->getWordSize()I

    move-result v1

    const/16 v3, 0x40

    if-eq v1, v3, :cond_12

    .line 497
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

    .line 503
    :cond_11
    new-instance v0, Ljava/security/InvalidAlgorithmParameterException;

    const-string v1, "RC5 parameters passed to a cipher that is not RC5."

    invoke-direct {v0, v1}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 505
    :cond_12
    invoke-virtual {v0}, Ljavax/crypto/spec/RC5ParameterSpec;->getIV()[B

    move-result-object v1

    if-eqz v1, :cond_18

    iget v1, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->e:I

    if-eqz v1, :cond_18

    .line 507
    new-instance v1, Lorg/spongycastle/crypto/params/ParametersWithIV;

    invoke-virtual {v0}, Ljavax/crypto/spec/RC5ParameterSpec;->getIV()[B

    move-result-object v0

    invoke-direct {v1, v2, v0}, Lorg/spongycastle/crypto/params/ParametersWithIV;-><init>(Lorg/spongycastle/crypto/CipherParameters;[B)V

    move-object v0, v1

    .line 508
    check-cast v0, Lorg/spongycastle/crypto/params/ParametersWithIV;

    iput-object v0, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->d:Lorg/spongycastle/crypto/params/ParametersWithIV;

    :goto_8
    move-object v0, v1

    .line 510
    goto/16 :goto_2

    .line 513
    :cond_13
    new-instance v0, Ljava/security/InvalidAlgorithmParameterException;

    const-string v1, "unknown parameter type."

    invoke-direct {v0, v1}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 533
    :cond_14
    iget-object v1, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->c:Lorg/spongycastle/jce/provider/JCEBlockCipher$c;

    invoke-interface {v1}, Lorg/spongycastle/jce/provider/JCEBlockCipher$c;->b()Lorg/spongycastle/crypto/BlockCipher;

    move-result-object v1

    invoke-interface {v1}, Lorg/spongycastle/crypto/BlockCipher;->a()Ljava/lang/String;

    move-result-object v1

    const-string v2, "PGPCFB"

    invoke-virtual {v1, v2}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v1

    if-gez v1, :cond_16

    .line 535
    new-instance v0, Ljava/security/InvalidAlgorithmParameterException;

    const-string v1, "no IV set when one expected"

    invoke-direct {v0, v1}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 550
    :pswitch_0
    :try_start_1
    iget-object v1, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->c:Lorg/spongycastle/jce/provider/JCEBlockCipher$c;

    const/4 v2, 0x1

    invoke-interface {v1, v2, v0}, Lorg/spongycastle/jce/provider/JCEBlockCipher$c;->a(ZLorg/spongycastle/crypto/CipherParameters;)V

    .line 555
    :goto_9
    return-void

    .line 554
    :pswitch_1
    iget-object v1, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->c:Lorg/spongycastle/jce/provider/JCEBlockCipher$c;

    const/4 v2, 0x0

    invoke-interface {v1, v2, v0}, Lorg/spongycastle/jce/provider/JCEBlockCipher$c;->a(ZLorg/spongycastle/crypto/CipherParameters;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_9

    :cond_15
    move-object v0, v1

    goto/16 :goto_5

    :cond_16
    move-object v1, v0

    goto/16 :goto_4

    :cond_17
    move-object v1, p4

    goto/16 :goto_3

    :cond_18
    move-object v1, v2

    goto :goto_8

    :cond_19
    move-object v1, v2

    goto/16 :goto_7

    :cond_1a
    move-object v1, v2

    goto/16 :goto_6

    .line 546
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
    const/4 v3, 0x0

    const/4 v2, 0x3

    .line 190
    invoke-static {p1}, Lorg/spongycastle/util/Strings;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->i:Ljava/lang/String;

    .line 192
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->i:Ljava/lang/String;

    const-string v1, "ECB"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 194
    iput v3, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->e:I

    .line 195
    new-instance v0, Lorg/spongycastle/jce/provider/JCEBlockCipher$b;

    iget-object v1, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->b:Lorg/spongycastle/crypto/BlockCipher;

    invoke-direct {v0, v1}, Lorg/spongycastle/jce/provider/JCEBlockCipher$b;-><init>(Lorg/spongycastle/crypto/BlockCipher;)V

    iput-object v0, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->c:Lorg/spongycastle/jce/provider/JCEBlockCipher$c;

    .line 289
    :goto_0
    return-void

    .line 197
    :cond_0
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->i:Ljava/lang/String;

    const-string v1, "CBC"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 199
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->b:Lorg/spongycastle/crypto/BlockCipher;

    invoke-interface {v0}, Lorg/spongycastle/crypto/BlockCipher;->b()I

    move-result v0

    iput v0, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->e:I

    .line 200
    new-instance v0, Lorg/spongycastle/jce/provider/JCEBlockCipher$b;

    new-instance v1, Lorg/spongycastle/crypto/modes/CBCBlockCipher;

    iget-object v2, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->b:Lorg/spongycastle/crypto/BlockCipher;

    invoke-direct {v1, v2}, Lorg/spongycastle/crypto/modes/CBCBlockCipher;-><init>(Lorg/spongycastle/crypto/BlockCipher;)V

    invoke-direct {v0, v1}, Lorg/spongycastle/jce/provider/JCEBlockCipher$b;-><init>(Lorg/spongycastle/crypto/BlockCipher;)V

    iput-object v0, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->c:Lorg/spongycastle/jce/provider/JCEBlockCipher$c;

    goto :goto_0

    .line 203
    :cond_1
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->i:Ljava/lang/String;

    const-string v1, "OFB"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 205
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->b:Lorg/spongycastle/crypto/BlockCipher;

    invoke-interface {v0}, Lorg/spongycastle/crypto/BlockCipher;->b()I

    move-result v0

    iput v0, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->e:I

    .line 206
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->i:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-eq v0, v2, :cond_2

    .line 208
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->i:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    .line 210
    new-instance v1, Lorg/spongycastle/jce/provider/JCEBlockCipher$b;

    new-instance v2, Lorg/spongycastle/crypto/modes/OFBBlockCipher;

    iget-object v3, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->b:Lorg/spongycastle/crypto/BlockCipher;

    invoke-direct {v2, v3, v0}, Lorg/spongycastle/crypto/modes/OFBBlockCipher;-><init>(Lorg/spongycastle/crypto/BlockCipher;I)V

    invoke-direct {v1, v2}, Lorg/spongycastle/jce/provider/JCEBlockCipher$b;-><init>(Lorg/spongycastle/crypto/BlockCipher;)V

    iput-object v1, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->c:Lorg/spongycastle/jce/provider/JCEBlockCipher$c;

    goto :goto_0

    .line 215
    :cond_2
    new-instance v0, Lorg/spongycastle/jce/provider/JCEBlockCipher$b;

    new-instance v1, Lorg/spongycastle/crypto/modes/OFBBlockCipher;

    iget-object v2, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->b:Lorg/spongycastle/crypto/BlockCipher;

    iget-object v3, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->b:Lorg/spongycastle/crypto/BlockCipher;

    invoke-interface {v3}, Lorg/spongycastle/crypto/BlockCipher;->b()I

    move-result v3

    mul-int/lit8 v3, v3, 0x8

    invoke-direct {v1, v2, v3}, Lorg/spongycastle/crypto/modes/OFBBlockCipher;-><init>(Lorg/spongycastle/crypto/BlockCipher;I)V

    invoke-direct {v0, v1}, Lorg/spongycastle/jce/provider/JCEBlockCipher$b;-><init>(Lorg/spongycastle/crypto/BlockCipher;)V

    iput-object v0, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->c:Lorg/spongycastle/jce/provider/JCEBlockCipher$c;

    goto :goto_0

    .line 219
    :cond_3
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->i:Ljava/lang/String;

    const-string v1, "CFB"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 221
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->b:Lorg/spongycastle/crypto/BlockCipher;

    invoke-interface {v0}, Lorg/spongycastle/crypto/BlockCipher;->b()I

    move-result v0

    iput v0, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->e:I

    .line 222
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->i:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-eq v0, v2, :cond_4

    .line 224
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->i:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    .line 226
    new-instance v1, Lorg/spongycastle/jce/provider/JCEBlockCipher$b;

    new-instance v2, Lorg/spongycastle/crypto/modes/CFBBlockCipher;

    iget-object v3, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->b:Lorg/spongycastle/crypto/BlockCipher;

    invoke-direct {v2, v3, v0}, Lorg/spongycastle/crypto/modes/CFBBlockCipher;-><init>(Lorg/spongycastle/crypto/BlockCipher;I)V

    invoke-direct {v1, v2}, Lorg/spongycastle/jce/provider/JCEBlockCipher$b;-><init>(Lorg/spongycastle/crypto/BlockCipher;)V

    iput-object v1, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->c:Lorg/spongycastle/jce/provider/JCEBlockCipher$c;

    goto/16 :goto_0

    .line 231
    :cond_4
    new-instance v0, Lorg/spongycastle/jce/provider/JCEBlockCipher$b;

    new-instance v1, Lorg/spongycastle/crypto/modes/CFBBlockCipher;

    iget-object v2, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->b:Lorg/spongycastle/crypto/BlockCipher;

    iget-object v3, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->b:Lorg/spongycastle/crypto/BlockCipher;

    invoke-interface {v3}, Lorg/spongycastle/crypto/BlockCipher;->b()I

    move-result v3

    mul-int/lit8 v3, v3, 0x8

    invoke-direct {v1, v2, v3}, Lorg/spongycastle/crypto/modes/CFBBlockCipher;-><init>(Lorg/spongycastle/crypto/BlockCipher;I)V

    invoke-direct {v0, v1}, Lorg/spongycastle/jce/provider/JCEBlockCipher$b;-><init>(Lorg/spongycastle/crypto/BlockCipher;)V

    iput-object v0, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->c:Lorg/spongycastle/jce/provider/JCEBlockCipher$c;

    goto/16 :goto_0

    .line 235
    :cond_5
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->i:Ljava/lang/String;

    const-string v1, "PGP"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 237
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->i:Ljava/lang/String;

    const-string v1, "PGPCFBwithIV"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    .line 239
    iget-object v1, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->b:Lorg/spongycastle/crypto/BlockCipher;

    invoke-interface {v1}, Lorg/spongycastle/crypto/BlockCipher;->b()I

    move-result v1

    iput v1, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->e:I

    .line 240
    new-instance v1, Lorg/spongycastle/jce/provider/JCEBlockCipher$b;

    new-instance v2, Lorg/spongycastle/crypto/modes/PGPCFBBlockCipher;

    iget-object v3, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->b:Lorg/spongycastle/crypto/BlockCipher;

    invoke-direct {v2, v3, v0}, Lorg/spongycastle/crypto/modes/PGPCFBBlockCipher;-><init>(Lorg/spongycastle/crypto/BlockCipher;Z)V

    invoke-direct {v1, v2}, Lorg/spongycastle/jce/provider/JCEBlockCipher$b;-><init>(Lorg/spongycastle/crypto/BlockCipher;)V

    iput-object v1, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->c:Lorg/spongycastle/jce/provider/JCEBlockCipher$c;

    goto/16 :goto_0

    .line 243
    :cond_6
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->i:Ljava/lang/String;

    const-string v1, "OpenPGPCFB"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 245
    iput v3, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->e:I

    .line 246
    new-instance v0, Lorg/spongycastle/jce/provider/JCEBlockCipher$b;

    new-instance v1, Lorg/spongycastle/crypto/modes/OpenPGPCFBBlockCipher;

    iget-object v2, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->b:Lorg/spongycastle/crypto/BlockCipher;

    invoke-direct {v1, v2}, Lorg/spongycastle/crypto/modes/OpenPGPCFBBlockCipher;-><init>(Lorg/spongycastle/crypto/BlockCipher;)V

    invoke-direct {v0, v1}, Lorg/spongycastle/jce/provider/JCEBlockCipher$b;-><init>(Lorg/spongycastle/crypto/BlockCipher;)V

    iput-object v0, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->c:Lorg/spongycastle/jce/provider/JCEBlockCipher$c;

    goto/16 :goto_0

    .line 249
    :cond_7
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->i:Ljava/lang/String;

    const-string v1, "SIC"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 251
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->b:Lorg/spongycastle/crypto/BlockCipher;

    invoke-interface {v0}, Lorg/spongycastle/crypto/BlockCipher;->b()I

    move-result v0

    iput v0, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->e:I

    .line 252
    iget v0, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->e:I

    const/16 v1, 0x10

    if-ge v0, v1, :cond_8

    .line 254
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Warning: SIC-Mode can become a twotime-pad if the blocksize of the cipher is too small. Use a cipher with a block size of at least 128 bits (e.g. AES)"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 256
    :cond_8
    new-instance v0, Lorg/spongycastle/jce/provider/JCEBlockCipher$b;

    new-instance v1, Lorg/spongycastle/crypto/BufferedBlockCipher;

    new-instance v2, Lorg/spongycastle/crypto/modes/SICBlockCipher;

    iget-object v3, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->b:Lorg/spongycastle/crypto/BlockCipher;

    invoke-direct {v2, v3}, Lorg/spongycastle/crypto/modes/SICBlockCipher;-><init>(Lorg/spongycastle/crypto/BlockCipher;)V

    invoke-direct {v1, v2}, Lorg/spongycastle/crypto/BufferedBlockCipher;-><init>(Lorg/spongycastle/crypto/BlockCipher;)V

    invoke-direct {v0, v1}, Lorg/spongycastle/jce/provider/JCEBlockCipher$b;-><init>(Lorg/spongycastle/crypto/BufferedBlockCipher;)V

    iput-object v0, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->c:Lorg/spongycastle/jce/provider/JCEBlockCipher$c;

    goto/16 :goto_0

    .line 259
    :cond_9
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->i:Ljava/lang/String;

    const-string v1, "CTR"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 261
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->b:Lorg/spongycastle/crypto/BlockCipher;

    invoke-interface {v0}, Lorg/spongycastle/crypto/BlockCipher;->b()I

    move-result v0

    iput v0, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->e:I

    .line 262
    new-instance v0, Lorg/spongycastle/jce/provider/JCEBlockCipher$b;

    new-instance v1, Lorg/spongycastle/crypto/BufferedBlockCipher;

    new-instance v2, Lorg/spongycastle/crypto/modes/SICBlockCipher;

    iget-object v3, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->b:Lorg/spongycastle/crypto/BlockCipher;

    invoke-direct {v2, v3}, Lorg/spongycastle/crypto/modes/SICBlockCipher;-><init>(Lorg/spongycastle/crypto/BlockCipher;)V

    invoke-direct {v1, v2}, Lorg/spongycastle/crypto/BufferedBlockCipher;-><init>(Lorg/spongycastle/crypto/BlockCipher;)V

    invoke-direct {v0, v1}, Lorg/spongycastle/jce/provider/JCEBlockCipher$b;-><init>(Lorg/spongycastle/crypto/BufferedBlockCipher;)V

    iput-object v0, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->c:Lorg/spongycastle/jce/provider/JCEBlockCipher$c;

    goto/16 :goto_0

    .line 265
    :cond_a
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->i:Ljava/lang/String;

    const-string v1, "GOFB"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_b

    .line 267
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->b:Lorg/spongycastle/crypto/BlockCipher;

    invoke-interface {v0}, Lorg/spongycastle/crypto/BlockCipher;->b()I

    move-result v0

    iput v0, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->e:I

    .line 268
    new-instance v0, Lorg/spongycastle/jce/provider/JCEBlockCipher$b;

    new-instance v1, Lorg/spongycastle/crypto/BufferedBlockCipher;

    new-instance v2, Lorg/spongycastle/crypto/modes/GOFBBlockCipher;

    iget-object v3, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->b:Lorg/spongycastle/crypto/BlockCipher;

    invoke-direct {v2, v3}, Lorg/spongycastle/crypto/modes/GOFBBlockCipher;-><init>(Lorg/spongycastle/crypto/BlockCipher;)V

    invoke-direct {v1, v2}, Lorg/spongycastle/crypto/BufferedBlockCipher;-><init>(Lorg/spongycastle/crypto/BlockCipher;)V

    invoke-direct {v0, v1}, Lorg/spongycastle/jce/provider/JCEBlockCipher$b;-><init>(Lorg/spongycastle/crypto/BufferedBlockCipher;)V

    iput-object v0, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->c:Lorg/spongycastle/jce/provider/JCEBlockCipher$c;

    goto/16 :goto_0

    .line 271
    :cond_b
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->i:Ljava/lang/String;

    const-string v1, "CTS"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_c

    .line 273
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->b:Lorg/spongycastle/crypto/BlockCipher;

    invoke-interface {v0}, Lorg/spongycastle/crypto/BlockCipher;->b()I

    move-result v0

    iput v0, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->e:I

    .line 274
    new-instance v0, Lorg/spongycastle/jce/provider/JCEBlockCipher$b;

    new-instance v1, Lorg/spongycastle/crypto/modes/CTSBlockCipher;

    new-instance v2, Lorg/spongycastle/crypto/modes/CBCBlockCipher;

    iget-object v3, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->b:Lorg/spongycastle/crypto/BlockCipher;

    invoke-direct {v2, v3}, Lorg/spongycastle/crypto/modes/CBCBlockCipher;-><init>(Lorg/spongycastle/crypto/BlockCipher;)V

    invoke-direct {v1, v2}, Lorg/spongycastle/crypto/modes/CTSBlockCipher;-><init>(Lorg/spongycastle/crypto/BlockCipher;)V

    invoke-direct {v0, v1}, Lorg/spongycastle/jce/provider/JCEBlockCipher$b;-><init>(Lorg/spongycastle/crypto/BufferedBlockCipher;)V

    iput-object v0, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->c:Lorg/spongycastle/jce/provider/JCEBlockCipher$c;

    goto/16 :goto_0

    .line 276
    :cond_c
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->i:Ljava/lang/String;

    const-string v1, "CCM"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_d

    .line 278
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->b:Lorg/spongycastle/crypto/BlockCipher;

    invoke-interface {v0}, Lorg/spongycastle/crypto/BlockCipher;->b()I

    move-result v0

    iput v0, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->e:I

    .line 279
    new-instance v0, Lorg/spongycastle/jce/provider/JCEBlockCipher$a;

    new-instance v1, Lorg/spongycastle/crypto/modes/CCMBlockCipher;

    iget-object v2, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->b:Lorg/spongycastle/crypto/BlockCipher;

    invoke-direct {v1, v2}, Lorg/spongycastle/crypto/modes/CCMBlockCipher;-><init>(Lorg/spongycastle/crypto/BlockCipher;)V

    invoke-direct {v0, v1}, Lorg/spongycastle/jce/provider/JCEBlockCipher$a;-><init>(Lorg/spongycastle/crypto/modes/AEADBlockCipher;)V

    iput-object v0, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->c:Lorg/spongycastle/jce/provider/JCEBlockCipher$c;

    goto/16 :goto_0

    .line 281
    :cond_d
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->i:Ljava/lang/String;

    const-string v1, "EAX"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_e

    .line 283
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->b:Lorg/spongycastle/crypto/BlockCipher;

    invoke-interface {v0}, Lorg/spongycastle/crypto/BlockCipher;->b()I

    move-result v0

    iput v0, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->e:I

    .line 284
    new-instance v0, Lorg/spongycastle/jce/provider/JCEBlockCipher$a;

    new-instance v1, Lorg/spongycastle/crypto/modes/EAXBlockCipher;

    iget-object v2, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->b:Lorg/spongycastle/crypto/BlockCipher;

    invoke-direct {v1, v2}, Lorg/spongycastle/crypto/modes/EAXBlockCipher;-><init>(Lorg/spongycastle/crypto/BlockCipher;)V

    invoke-direct {v0, v1}, Lorg/spongycastle/jce/provider/JCEBlockCipher$a;-><init>(Lorg/spongycastle/crypto/modes/AEADBlockCipher;)V

    iput-object v0, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->c:Lorg/spongycastle/jce/provider/JCEBlockCipher$c;

    goto/16 :goto_0

    .line 286
    :cond_e
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->i:Ljava/lang/String;

    const-string v1, "GCM"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_f

    .line 288
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->b:Lorg/spongycastle/crypto/BlockCipher;

    invoke-interface {v0}, Lorg/spongycastle/crypto/BlockCipher;->b()I

    move-result v0

    iput v0, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->e:I

    .line 289
    new-instance v0, Lorg/spongycastle/jce/provider/JCEBlockCipher$a;

    new-instance v1, Lorg/spongycastle/crypto/modes/GCMBlockCipher;

    iget-object v2, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->b:Lorg/spongycastle/crypto/BlockCipher;

    invoke-direct {v1, v2}, Lorg/spongycastle/crypto/modes/GCMBlockCipher;-><init>(Lorg/spongycastle/crypto/BlockCipher;)V

    invoke-direct {v0, v1}, Lorg/spongycastle/jce/provider/JCEBlockCipher$a;-><init>(Lorg/spongycastle/crypto/modes/AEADBlockCipher;)V

    iput-object v0, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->c:Lorg/spongycastle/jce/provider/JCEBlockCipher$c;

    goto/16 :goto_0

    .line 293
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

    .prologue
    .line 301
    invoke-static {p1}, Lorg/spongycastle/util/Strings;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 303
    const-string v1, "NOPADDING"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 305
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->c:Lorg/spongycastle/jce/provider/JCEBlockCipher$c;

    invoke-interface {v0}, Lorg/spongycastle/jce/provider/JCEBlockCipher$c;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 307
    new-instance v0, Lorg/spongycastle/jce/provider/JCEBlockCipher$b;

    new-instance v1, Lorg/spongycastle/crypto/BufferedBlockCipher;

    iget-object v2, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->c:Lorg/spongycastle/jce/provider/JCEBlockCipher$c;

    invoke-interface {v2}, Lorg/spongycastle/jce/provider/JCEBlockCipher$c;->b()Lorg/spongycastle/crypto/BlockCipher;

    move-result-object v2

    invoke-direct {v1, v2}, Lorg/spongycastle/crypto/BufferedBlockCipher;-><init>(Lorg/spongycastle/crypto/BlockCipher;)V

    invoke-direct {v0, v1}, Lorg/spongycastle/jce/provider/JCEBlockCipher$b;-><init>(Lorg/spongycastle/crypto/BufferedBlockCipher;)V

    iput-object v0, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->c:Lorg/spongycastle/jce/provider/JCEBlockCipher$c;

    .line 351
    :cond_0
    :goto_0
    return-void

    .line 310
    :cond_1
    const-string v1, "WITHCTS"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 312
    new-instance v0, Lorg/spongycastle/jce/provider/JCEBlockCipher$b;

    new-instance v1, Lorg/spongycastle/crypto/modes/CTSBlockCipher;

    iget-object v2, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->c:Lorg/spongycastle/jce/provider/JCEBlockCipher$c;

    invoke-interface {v2}, Lorg/spongycastle/jce/provider/JCEBlockCipher$c;->b()Lorg/spongycastle/crypto/BlockCipher;

    move-result-object v2

    invoke-direct {v1, v2}, Lorg/spongycastle/crypto/modes/CTSBlockCipher;-><init>(Lorg/spongycastle/crypto/BlockCipher;)V

    invoke-direct {v0, v1}, Lorg/spongycastle/jce/provider/JCEBlockCipher$b;-><init>(Lorg/spongycastle/crypto/BufferedBlockCipher;)V

    iput-object v0, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->c:Lorg/spongycastle/jce/provider/JCEBlockCipher$c;

    goto :goto_0

    .line 316
    :cond_2
    const/4 v1, 0x1

    iput-boolean v1, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->f:Z

    .line 318
    iget-object v1, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->i:Ljava/lang/String;

    invoke-static {v1}, Lorg/spongycastle/jce/provider/JCEBlockCipher;->a(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 320
    new-instance v0, Ljavax/crypto/NoSuchPaddingException;

    const-string v1, "Only NoPadding can be used with AEAD modes."

    invoke-direct {v0, v1}, Ljavax/crypto/NoSuchPaddingException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 322
    :cond_3
    const-string v1, "PKCS5PADDING"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    const-string v1, "PKCS7PADDING"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 324
    :cond_4
    new-instance v0, Lorg/spongycastle/jce/provider/JCEBlockCipher$b;

    iget-object v1, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->c:Lorg/spongycastle/jce/provider/JCEBlockCipher$c;

    invoke-interface {v1}, Lorg/spongycastle/jce/provider/JCEBlockCipher$c;->b()Lorg/spongycastle/crypto/BlockCipher;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/spongycastle/jce/provider/JCEBlockCipher$b;-><init>(Lorg/spongycastle/crypto/BlockCipher;)V

    iput-object v0, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->c:Lorg/spongycastle/jce/provider/JCEBlockCipher$c;

    goto :goto_0

    .line 326
    :cond_5
    const-string v1, "ZEROBYTEPADDING"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    .line 328
    new-instance v0, Lorg/spongycastle/jce/provider/JCEBlockCipher$b;

    iget-object v1, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->c:Lorg/spongycastle/jce/provider/JCEBlockCipher$c;

    invoke-interface {v1}, Lorg/spongycastle/jce/provider/JCEBlockCipher$c;->b()Lorg/spongycastle/crypto/BlockCipher;

    move-result-object v1

    new-instance v2, Lorg/spongycastle/crypto/paddings/ZeroBytePadding;

    invoke-direct {v2}, Lorg/spongycastle/crypto/paddings/ZeroBytePadding;-><init>()V

    invoke-direct {v0, v1, v2}, Lorg/spongycastle/jce/provider/JCEBlockCipher$b;-><init>(Lorg/spongycastle/crypto/BlockCipher;Lorg/spongycastle/crypto/paddings/BlockCipherPadding;)V

    iput-object v0, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->c:Lorg/spongycastle/jce/provider/JCEBlockCipher$c;

    goto :goto_0

    .line 330
    :cond_6
    const-string v1, "ISO10126PADDING"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    const-string v1, "ISO10126-2PADDING"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_8

    .line 332
    :cond_7
    new-instance v0, Lorg/spongycastle/jce/provider/JCEBlockCipher$b;

    iget-object v1, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->c:Lorg/spongycastle/jce/provider/JCEBlockCipher$c;

    invoke-interface {v1}, Lorg/spongycastle/jce/provider/JCEBlockCipher$c;->b()Lorg/spongycastle/crypto/BlockCipher;

    move-result-object v1

    new-instance v2, Lorg/spongycastle/crypto/paddings/ISO10126d2Padding;

    invoke-direct {v2}, Lorg/spongycastle/crypto/paddings/ISO10126d2Padding;-><init>()V

    invoke-direct {v0, v1, v2}, Lorg/spongycastle/jce/provider/JCEBlockCipher$b;-><init>(Lorg/spongycastle/crypto/BlockCipher;Lorg/spongycastle/crypto/paddings/BlockCipherPadding;)V

    iput-object v0, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->c:Lorg/spongycastle/jce/provider/JCEBlockCipher$c;

    goto/16 :goto_0

    .line 334
    :cond_8
    const-string v1, "X9.23PADDING"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    const-string v1, "X923PADDING"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_a

    .line 336
    :cond_9
    new-instance v0, Lorg/spongycastle/jce/provider/JCEBlockCipher$b;

    iget-object v1, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->c:Lorg/spongycastle/jce/provider/JCEBlockCipher$c;

    invoke-interface {v1}, Lorg/spongycastle/jce/provider/JCEBlockCipher$c;->b()Lorg/spongycastle/crypto/BlockCipher;

    move-result-object v1

    new-instance v2, Lorg/spongycastle/crypto/paddings/X923Padding;

    invoke-direct {v2}, Lorg/spongycastle/crypto/paddings/X923Padding;-><init>()V

    invoke-direct {v0, v1, v2}, Lorg/spongycastle/jce/provider/JCEBlockCipher$b;-><init>(Lorg/spongycastle/crypto/BlockCipher;Lorg/spongycastle/crypto/paddings/BlockCipherPadding;)V

    iput-object v0, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->c:Lorg/spongycastle/jce/provider/JCEBlockCipher$c;

    goto/16 :goto_0

    .line 338
    :cond_a
    const-string v1, "ISO7816-4PADDING"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    const-string v1, "ISO9797-1PADDING"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_c

    .line 340
    :cond_b
    new-instance v0, Lorg/spongycastle/jce/provider/JCEBlockCipher$b;

    iget-object v1, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->c:Lorg/spongycastle/jce/provider/JCEBlockCipher$c;

    invoke-interface {v1}, Lorg/spongycastle/jce/provider/JCEBlockCipher$c;->b()Lorg/spongycastle/crypto/BlockCipher;

    move-result-object v1

    new-instance v2, Lorg/spongycastle/crypto/paddings/ISO7816d4Padding;

    invoke-direct {v2}, Lorg/spongycastle/crypto/paddings/ISO7816d4Padding;-><init>()V

    invoke-direct {v0, v1, v2}, Lorg/spongycastle/jce/provider/JCEBlockCipher$b;-><init>(Lorg/spongycastle/crypto/BlockCipher;Lorg/spongycastle/crypto/paddings/BlockCipherPadding;)V

    iput-object v0, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->c:Lorg/spongycastle/jce/provider/JCEBlockCipher$c;

    goto/16 :goto_0

    .line 342
    :cond_c
    const-string v1, "TBCPADDING"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_d

    .line 344
    new-instance v0, Lorg/spongycastle/jce/provider/JCEBlockCipher$b;

    iget-object v1, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->c:Lorg/spongycastle/jce/provider/JCEBlockCipher$c;

    invoke-interface {v1}, Lorg/spongycastle/jce/provider/JCEBlockCipher$c;->b()Lorg/spongycastle/crypto/BlockCipher;

    move-result-object v1

    new-instance v2, Lorg/spongycastle/crypto/paddings/TBCPadding;

    invoke-direct {v2}, Lorg/spongycastle/crypto/paddings/TBCPadding;-><init>()V

    invoke-direct {v0, v1, v2}, Lorg/spongycastle/jce/provider/JCEBlockCipher$b;-><init>(Lorg/spongycastle/crypto/BlockCipher;Lorg/spongycastle/crypto/paddings/BlockCipherPadding;)V

    iput-object v0, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->c:Lorg/spongycastle/jce/provider/JCEBlockCipher$c;

    goto/16 :goto_0

    .line 348
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

    .prologue
    .line 661
    :try_start_0
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->c:Lorg/spongycastle/jce/provider/JCEBlockCipher$c;

    move-object v1, p1

    move v2, p2

    move v3, p3

    move-object v4, p4

    move v5, p5

    invoke-interface/range {v0 .. v5}, Lorg/spongycastle/jce/provider/JCEBlockCipher$c;->a([BII[BI)I
    :try_end_0
    .catch Lorg/spongycastle/crypto/DataLengthException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    return v0

    .line 663
    :catch_0
    move-exception v0

    .line 665
    new-instance v1, Ljavax/crypto/ShortBufferException;

    invoke-virtual {v0}, Lorg/spongycastle/crypto/DataLengthException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljavax/crypto/ShortBufferException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method protected engineUpdate([BII)[B
    .locals 7

    .prologue
    const/4 v6, 0x0

    const/4 v5, 0x0

    .line 622
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->c:Lorg/spongycastle/jce/provider/JCEBlockCipher$c;

    invoke-interface {v0, p3}, Lorg/spongycastle/jce/provider/JCEBlockCipher$c;->b(I)I

    move-result v0

    .line 624
    if-lez v0, :cond_2

    .line 626
    new-array v4, v0, [B

    .line 628
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->c:Lorg/spongycastle/jce/provider/JCEBlockCipher$c;

    move-object v1, p1

    move v2, p2

    move v3, p3

    invoke-interface/range {v0 .. v5}, Lorg/spongycastle/jce/provider/JCEBlockCipher$c;->a([BII[BI)I

    move-result v1

    .line 630
    if-nez v1, :cond_1

    move-object v4, v6

    .line 648
    :cond_0
    :goto_0
    return-object v4

    .line 634
    :cond_1
    array-length v0, v4

    if-eq v1, v0, :cond_0

    .line 636
    new-array v0, v1, [B

    .line 638
    invoke-static {v4, v5, v0, v5, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move-object v4, v0

    .line 640
    goto :goto_0

    .line 646
    :cond_2
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JCEBlockCipher;->c:Lorg/spongycastle/jce/provider/JCEBlockCipher$c;

    move-object v1, p1

    move v2, p2

    move v3, p3

    move-object v4, v6

    invoke-interface/range {v0 .. v5}, Lorg/spongycastle/jce/provider/JCEBlockCipher$c;->a([BII[BI)I

    move-object v4, v6

    .line 648
    goto :goto_0
.end method
