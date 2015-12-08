.class public Lorg/spongycastle/jcajce/provider/asymmetric/dsa/AlgorithmParameterGeneratorSpi;
.super Ljava/security/AlgorithmParameterGeneratorSpi;
.source "SourceFile"


# instance fields
.field protected a:Ljava/security/SecureRandom;

.field protected b:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 16
    invoke-direct {p0}, Ljava/security/AlgorithmParameterGeneratorSpi;-><init>()V

    .line 20
    const/16 v0, 0x400

    iput v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/dsa/AlgorithmParameterGeneratorSpi;->b:I

    return-void
.end method


# virtual methods
.method protected engineGenerateParameters()Ljava/security/AlgorithmParameters;
    .locals 5

    .prologue
    const/16 v3, 0x14

    .line 45
    new-instance v0, Lorg/spongycastle/crypto/generators/DSAParametersGenerator;

    invoke-direct {v0}, Lorg/spongycastle/crypto/generators/DSAParametersGenerator;-><init>()V

    .line 47
    iget-object v1, p0, Lorg/spongycastle/jcajce/provider/asymmetric/dsa/AlgorithmParameterGeneratorSpi;->a:Ljava/security/SecureRandom;

    if-eqz v1, :cond_0

    .line 49
    iget v1, p0, Lorg/spongycastle/jcajce/provider/asymmetric/dsa/AlgorithmParameterGeneratorSpi;->b:I

    iget-object v2, p0, Lorg/spongycastle/jcajce/provider/asymmetric/dsa/AlgorithmParameterGeneratorSpi;->a:Ljava/security/SecureRandom;

    invoke-virtual {v0, v1, v3, v2}, Lorg/spongycastle/crypto/generators/DSAParametersGenerator;->a(IILjava/security/SecureRandom;)V

    .line 56
    :goto_0
    invoke-virtual {v0}, Lorg/spongycastle/crypto/generators/DSAParametersGenerator;->a()Lorg/spongycastle/crypto/params/DSAParameters;

    move-result-object v0

    .line 62
    :try_start_0
    const-string v1, "DSA"

    sget-object v2, Lorg/spongycastle/jce/provider/BouncyCastleProvider;->a:Ljava/lang/String;

    invoke-static {v1, v2}, Ljava/security/AlgorithmParameters;->getInstance(Ljava/lang/String;Ljava/lang/String;)Ljava/security/AlgorithmParameters;

    move-result-object v1

    .line 63
    new-instance v2, Ljava/security/spec/DSAParameterSpec;

    invoke-virtual {v0}, Lorg/spongycastle/crypto/params/DSAParameters;->a()Ljava/math/BigInteger;

    move-result-object v3

    invoke-virtual {v0}, Lorg/spongycastle/crypto/params/DSAParameters;->b()Ljava/math/BigInteger;

    move-result-object v4

    invoke-virtual {v0}, Lorg/spongycastle/crypto/params/DSAParameters;->c()Ljava/math/BigInteger;

    move-result-object v0

    invoke-direct {v2, v3, v4, v0}, Ljava/security/spec/DSAParameterSpec;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    invoke-virtual {v1, v2}, Ljava/security/AlgorithmParameters;->init(Ljava/security/spec/AlgorithmParameterSpec;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 70
    return-object v1

    .line 53
    :cond_0
    iget v1, p0, Lorg/spongycastle/jcajce/provider/asymmetric/dsa/AlgorithmParameterGeneratorSpi;->b:I

    new-instance v2, Ljava/security/SecureRandom;

    invoke-direct {v2}, Ljava/security/SecureRandom;-><init>()V

    invoke-virtual {v0, v1, v3, v2}, Lorg/spongycastle/crypto/generators/DSAParametersGenerator;->a(IILjava/security/SecureRandom;)V

    goto :goto_0

    .line 65
    :catch_0
    move-exception v0

    .line 67
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method protected engineInit(ILjava/security/SecureRandom;)V
    .locals 2

    .prologue
    .line 26
    const/16 v0, 0x200

    if-lt p1, v0, :cond_0

    const/16 v0, 0x400

    if-gt p1, v0, :cond_0

    rem-int/lit8 v0, p1, 0x40

    if-eqz v0, :cond_1

    .line 28
    :cond_0
    new-instance v0, Ljava/security/InvalidParameterException;

    const-string v1, "strength must be from 512 - 1024 and a multiple of 64"

    invoke-direct {v0, v1}, Ljava/security/InvalidParameterException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 31
    :cond_1
    iput p1, p0, Lorg/spongycastle/jcajce/provider/asymmetric/dsa/AlgorithmParameterGeneratorSpi;->b:I

    .line 32
    iput-object p2, p0, Lorg/spongycastle/jcajce/provider/asymmetric/dsa/AlgorithmParameterGeneratorSpi;->a:Ljava/security/SecureRandom;

    .line 33
    return-void
.end method

.method protected engineInit(Ljava/security/spec/AlgorithmParameterSpec;Ljava/security/SecureRandom;)V
    .locals 2

    .prologue
    .line 40
    new-instance v0, Ljava/security/InvalidAlgorithmParameterException;

    const-string v1, "No supported AlgorithmParameterSpec for DSA parameter generation."

    invoke-direct {v0, v1}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
