.class public Lorg/bouncycastle/jce/provider/JDKAlgorithmParameterGenerator$GOST3410;
.super Lorg/bouncycastle/jce/provider/JDKAlgorithmParameterGenerator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/bouncycastle/jce/provider/JDKAlgorithmParameterGenerator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "GOST3410"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lorg/bouncycastle/jce/provider/JDKAlgorithmParameterGenerator;-><init>()V

    return-void
.end method


# virtual methods
.method protected engineGenerateParameters()Ljava/security/AlgorithmParameters;
    .locals 6

    const/4 v3, 0x2

    new-instance v0, Lorg/bouncycastle/crypto/generators/GOST3410ParametersGenerator;

    invoke-direct {v0}, Lorg/bouncycastle/crypto/generators/GOST3410ParametersGenerator;-><init>()V

    iget-object v1, p0, Lorg/bouncycastle/jce/provider/JDKAlgorithmParameterGenerator$GOST3410;->a:Ljava/security/SecureRandom;

    if-eqz v1, :cond_0

    iget v1, p0, Lorg/bouncycastle/jce/provider/JDKAlgorithmParameterGenerator$GOST3410;->b:I

    iget-object v2, p0, Lorg/bouncycastle/jce/provider/JDKAlgorithmParameterGenerator$GOST3410;->a:Ljava/security/SecureRandom;

    invoke-virtual {v0, v1, v3, v2}, Lorg/bouncycastle/crypto/generators/GOST3410ParametersGenerator;->init(IILjava/security/SecureRandom;)V

    :goto_0
    invoke-virtual {v0}, Lorg/bouncycastle/crypto/generators/GOST3410ParametersGenerator;->generateParameters()Lorg/bouncycastle/crypto/params/GOST3410Parameters;

    move-result-object v0

    :try_start_0
    const-string v1, "GOST3410"

    sget-object v2, Lorg/bouncycastle/jce/provider/BouncyCastleProvider;->a:Ljava/lang/String;

    invoke-static {v1, v2}, Ljava/security/AlgorithmParameters;->getInstance(Ljava/lang/String;Ljava/lang/String;)Ljava/security/AlgorithmParameters;

    move-result-object v1

    new-instance v2, Lorg/bouncycastle/jce/spec/GOST3410ParameterSpec;

    new-instance v3, Lorg/bouncycastle/jce/spec/GOST3410PublicKeyParameterSetSpec;

    invoke-virtual {v0}, Lorg/bouncycastle/crypto/params/GOST3410Parameters;->getP()Ljava/math/BigInteger;

    move-result-object v4

    invoke-virtual {v0}, Lorg/bouncycastle/crypto/params/GOST3410Parameters;->getQ()Ljava/math/BigInteger;

    move-result-object v5

    invoke-virtual {v0}, Lorg/bouncycastle/crypto/params/GOST3410Parameters;->getA()Ljava/math/BigInteger;

    move-result-object v0

    invoke-direct {v3, v4, v5, v0}, Lorg/bouncycastle/jce/spec/GOST3410PublicKeyParameterSetSpec;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    invoke-direct {v2, v3}, Lorg/bouncycastle/jce/spec/GOST3410ParameterSpec;-><init>(Lorg/bouncycastle/jce/spec/GOST3410PublicKeyParameterSetSpec;)V

    invoke-virtual {v1, v2}, Ljava/security/AlgorithmParameters;->init(Ljava/security/spec/AlgorithmParameterSpec;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    :cond_0
    iget v1, p0, Lorg/bouncycastle/jce/provider/JDKAlgorithmParameterGenerator$GOST3410;->b:I

    new-instance v2, Ljava/security/SecureRandom;

    invoke-direct {v2}, Ljava/security/SecureRandom;-><init>()V

    invoke-virtual {v0, v1, v3, v2}, Lorg/bouncycastle/crypto/generators/GOST3410ParametersGenerator;->init(IILjava/security/SecureRandom;)V

    goto :goto_0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/RuntimeException;

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method protected engineInit(Ljava/security/spec/AlgorithmParameterSpec;Ljava/security/SecureRandom;)V
    .locals 2

    new-instance v0, Ljava/security/InvalidAlgorithmParameterException;

    const-string v1, "No supported AlgorithmParameterSpec for GOST3410 parameter generation."

    invoke-direct {v0, v1}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
