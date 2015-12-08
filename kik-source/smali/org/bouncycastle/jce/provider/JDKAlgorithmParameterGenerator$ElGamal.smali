.class public Lorg/bouncycastle/jce/provider/JDKAlgorithmParameterGenerator$ElGamal;
.super Lorg/bouncycastle/jce/provider/JDKAlgorithmParameterGenerator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/bouncycastle/jce/provider/JDKAlgorithmParameterGenerator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ElGamal"
.end annotation


# instance fields
.field private c:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lorg/bouncycastle/jce/provider/JDKAlgorithmParameterGenerator;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lorg/bouncycastle/jce/provider/JDKAlgorithmParameterGenerator$ElGamal;->c:I

    return-void
.end method


# virtual methods
.method protected engineGenerateParameters()Ljava/security/AlgorithmParameters;
    .locals 5

    const/16 v3, 0x14

    new-instance v0, Lorg/bouncycastle/crypto/generators/ElGamalParametersGenerator;

    invoke-direct {v0}, Lorg/bouncycastle/crypto/generators/ElGamalParametersGenerator;-><init>()V

    iget-object v1, p0, Lorg/bouncycastle/jce/provider/JDKAlgorithmParameterGenerator$ElGamal;->a:Ljava/security/SecureRandom;

    if-eqz v1, :cond_0

    iget v1, p0, Lorg/bouncycastle/jce/provider/JDKAlgorithmParameterGenerator$ElGamal;->b:I

    iget-object v2, p0, Lorg/bouncycastle/jce/provider/JDKAlgorithmParameterGenerator$ElGamal;->a:Ljava/security/SecureRandom;

    invoke-virtual {v0, v1, v3, v2}, Lorg/bouncycastle/crypto/generators/ElGamalParametersGenerator;->init(IILjava/security/SecureRandom;)V

    :goto_0
    invoke-virtual {v0}, Lorg/bouncycastle/crypto/generators/ElGamalParametersGenerator;->generateParameters()Lorg/bouncycastle/crypto/params/ElGamalParameters;

    move-result-object v0

    :try_start_0
    const-string v1, "ElGamal"

    sget-object v2, Lorg/bouncycastle/jce/provider/BouncyCastleProvider;->a:Ljava/lang/String;

    invoke-static {v1, v2}, Ljava/security/AlgorithmParameters;->getInstance(Ljava/lang/String;Ljava/lang/String;)Ljava/security/AlgorithmParameters;

    move-result-object v1

    new-instance v2, Ljavax/crypto/spec/DHParameterSpec;

    invoke-virtual {v0}, Lorg/bouncycastle/crypto/params/ElGamalParameters;->getP()Ljava/math/BigInteger;

    move-result-object v3

    invoke-virtual {v0}, Lorg/bouncycastle/crypto/params/ElGamalParameters;->getG()Ljava/math/BigInteger;

    move-result-object v0

    iget v4, p0, Lorg/bouncycastle/jce/provider/JDKAlgorithmParameterGenerator$ElGamal;->c:I

    invoke-direct {v2, v3, v0, v4}, Ljavax/crypto/spec/DHParameterSpec;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V

    invoke-virtual {v1, v2}, Ljava/security/AlgorithmParameters;->init(Ljava/security/spec/AlgorithmParameterSpec;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    :cond_0
    iget v1, p0, Lorg/bouncycastle/jce/provider/JDKAlgorithmParameterGenerator$ElGamal;->b:I

    new-instance v2, Ljava/security/SecureRandom;

    invoke-direct {v2}, Ljava/security/SecureRandom;-><init>()V

    invoke-virtual {v0, v1, v3, v2}, Lorg/bouncycastle/crypto/generators/ElGamalParametersGenerator;->init(IILjava/security/SecureRandom;)V

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

    instance-of v0, p1, Ljavax/crypto/spec/DHGenParameterSpec;

    if-nez v0, :cond_0

    new-instance v0, Ljava/security/InvalidAlgorithmParameterException;

    const-string v1, "DH parameter generator requires a DHGenParameterSpec for initialisation"

    invoke-direct {v0, v1}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    check-cast p1, Ljavax/crypto/spec/DHGenParameterSpec;

    invoke-virtual {p1}, Ljavax/crypto/spec/DHGenParameterSpec;->getPrimeSize()I

    move-result v0

    iput v0, p0, Lorg/bouncycastle/jce/provider/JDKAlgorithmParameterGenerator$ElGamal;->b:I

    invoke-virtual {p1}, Ljavax/crypto/spec/DHGenParameterSpec;->getExponentSize()I

    move-result v0

    iput v0, p0, Lorg/bouncycastle/jce/provider/JDKAlgorithmParameterGenerator$ElGamal;->c:I

    iput-object p2, p0, Lorg/bouncycastle/jce/provider/JDKAlgorithmParameterGenerator$ElGamal;->a:Ljava/security/SecureRandom;

    return-void
.end method
