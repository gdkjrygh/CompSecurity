.class public Lorg/bouncycastle/crypto/generators/ElGamalParametersGenerator;
.super Ljava/lang/Object;


# instance fields
.field private a:I

.field private b:I

.field private c:Ljava/security/SecureRandom;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public generateParameters()Lorg/bouncycastle/crypto/params/ElGamalParameters;
    .locals 3

    iget v0, p0, Lorg/bouncycastle/crypto/generators/ElGamalParametersGenerator;->a:I

    iget v1, p0, Lorg/bouncycastle/crypto/generators/ElGamalParametersGenerator;->b:I

    iget-object v2, p0, Lorg/bouncycastle/crypto/generators/ElGamalParametersGenerator;->c:Ljava/security/SecureRandom;

    invoke-static {v0, v1, v2}, Lorg/bouncycastle/crypto/generators/b;->generateSafePrimes(IILjava/security/SecureRandom;)[Ljava/math/BigInteger;

    move-result-object v0

    const/4 v1, 0x0

    aget-object v1, v0, v1

    const/4 v2, 0x1

    aget-object v0, v0, v2

    iget-object v2, p0, Lorg/bouncycastle/crypto/generators/ElGamalParametersGenerator;->c:Ljava/security/SecureRandom;

    invoke-static {v1, v0, v2}, Lorg/bouncycastle/crypto/generators/b;->selectGenerator(Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/security/SecureRandom;)Ljava/math/BigInteger;

    move-result-object v0

    new-instance v2, Lorg/bouncycastle/crypto/params/ElGamalParameters;

    invoke-direct {v2, v1, v0}, Lorg/bouncycastle/crypto/params/ElGamalParameters;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    return-object v2
.end method

.method public init(IILjava/security/SecureRandom;)V
    .locals 0

    iput p1, p0, Lorg/bouncycastle/crypto/generators/ElGamalParametersGenerator;->a:I

    iput p2, p0, Lorg/bouncycastle/crypto/generators/ElGamalParametersGenerator;->b:I

    iput-object p3, p0, Lorg/bouncycastle/crypto/generators/ElGamalParametersGenerator;->c:Ljava/security/SecureRandom;

    return-void
.end method
