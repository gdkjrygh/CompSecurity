.class public Lorg/spongycastle/crypto/generators/ElGamalParametersGenerator;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:I

.field private b:I

.field private c:Ljava/security/SecureRandom;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lorg/spongycastle/crypto/params/ElGamalParameters;
    .locals 3

    .prologue
    .line 35
    iget v0, p0, Lorg/spongycastle/crypto/generators/ElGamalParametersGenerator;->a:I

    iget v1, p0, Lorg/spongycastle/crypto/generators/ElGamalParametersGenerator;->b:I

    iget-object v2, p0, Lorg/spongycastle/crypto/generators/ElGamalParametersGenerator;->c:Ljava/security/SecureRandom;

    invoke-static {v0, v1, v2}, Lorg/spongycastle/crypto/generators/b;->a(IILjava/security/SecureRandom;)[Ljava/math/BigInteger;

    move-result-object v0

    .line 37
    const/4 v1, 0x0

    aget-object v0, v0, v1

    .line 38
    iget-object v1, p0, Lorg/spongycastle/crypto/generators/ElGamalParametersGenerator;->c:Ljava/security/SecureRandom;

    invoke-static {v0, v1}, Lorg/spongycastle/crypto/generators/b;->a(Ljava/math/BigInteger;Ljava/security/SecureRandom;)Ljava/math/BigInteger;

    move-result-object v1

    .line 41
    new-instance v2, Lorg/spongycastle/crypto/params/ElGamalParameters;

    invoke-direct {v2, v0, v1}, Lorg/spongycastle/crypto/params/ElGamalParameters;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    return-object v2
.end method

.method public final a(IILjava/security/SecureRandom;)V
    .locals 0

    .prologue
    .line 19
    iput p1, p0, Lorg/spongycastle/crypto/generators/ElGamalParametersGenerator;->a:I

    .line 20
    iput p2, p0, Lorg/spongycastle/crypto/generators/ElGamalParametersGenerator;->b:I

    .line 21
    iput-object p3, p0, Lorg/spongycastle/crypto/generators/ElGamalParametersGenerator;->c:Ljava/security/SecureRandom;

    .line 22
    return-void
.end method
