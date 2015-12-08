.class public Lorg/spongycastle/crypto/agreement/DHBasicAgreement;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/spongycastle/crypto/BasicAgreement;


# instance fields
.field private a:Lorg/spongycastle/crypto/params/DHPrivateKeyParameters;

.field private b:Lorg/spongycastle/crypto/params/DHParameters;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lorg/spongycastle/crypto/CipherParameters;)V
    .locals 2

    .prologue
    .line 31
    instance-of v0, p1, Lorg/spongycastle/crypto/params/ParametersWithRandom;

    if-eqz v0, :cond_0

    .line 33
    check-cast p1, Lorg/spongycastle/crypto/params/ParametersWithRandom;

    .line 34
    invoke-virtual {p1}, Lorg/spongycastle/crypto/params/ParametersWithRandom;->b()Lorg/spongycastle/crypto/CipherParameters;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/crypto/params/AsymmetricKeyParameter;

    .line 41
    :goto_0
    instance-of v1, v0, Lorg/spongycastle/crypto/params/DHPrivateKeyParameters;

    if-nez v1, :cond_1

    .line 43
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "DHEngine expects DHPrivateKeyParameters"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 38
    :cond_0
    check-cast p1, Lorg/spongycastle/crypto/params/AsymmetricKeyParameter;

    move-object v0, p1

    goto :goto_0

    .line 46
    :cond_1
    check-cast v0, Lorg/spongycastle/crypto/params/DHPrivateKeyParameters;

    iput-object v0, p0, Lorg/spongycastle/crypto/agreement/DHBasicAgreement;->a:Lorg/spongycastle/crypto/params/DHPrivateKeyParameters;

    .line 47
    iget-object v0, p0, Lorg/spongycastle/crypto/agreement/DHBasicAgreement;->a:Lorg/spongycastle/crypto/params/DHPrivateKeyParameters;

    invoke-virtual {v0}, Lorg/spongycastle/crypto/params/DHPrivateKeyParameters;->b()Lorg/spongycastle/crypto/params/DHParameters;

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/crypto/agreement/DHBasicAgreement;->b:Lorg/spongycastle/crypto/params/DHParameters;

    .line 48
    return-void
.end method

.method public final b(Lorg/spongycastle/crypto/CipherParameters;)Ljava/math/BigInteger;
    .locals 3

    .prologue
    .line 57
    check-cast p1, Lorg/spongycastle/crypto/params/DHPublicKeyParameters;

    .line 59
    invoke-virtual {p1}, Lorg/spongycastle/crypto/params/DHPublicKeyParameters;->b()Lorg/spongycastle/crypto/params/DHParameters;

    move-result-object v0

    iget-object v1, p0, Lorg/spongycastle/crypto/agreement/DHBasicAgreement;->b:Lorg/spongycastle/crypto/params/DHParameters;

    invoke-virtual {v0, v1}, Lorg/spongycastle/crypto/params/DHParameters;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 61
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Diffie-Hellman public key has wrong parameters."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 64
    :cond_0
    invoke-virtual {p1}, Lorg/spongycastle/crypto/params/DHPublicKeyParameters;->c()Ljava/math/BigInteger;

    move-result-object v0

    iget-object v1, p0, Lorg/spongycastle/crypto/agreement/DHBasicAgreement;->a:Lorg/spongycastle/crypto/params/DHPrivateKeyParameters;

    invoke-virtual {v1}, Lorg/spongycastle/crypto/params/DHPrivateKeyParameters;->c()Ljava/math/BigInteger;

    move-result-object v1

    iget-object v2, p0, Lorg/spongycastle/crypto/agreement/DHBasicAgreement;->b:Lorg/spongycastle/crypto/params/DHParameters;

    invoke-virtual {v2}, Lorg/spongycastle/crypto/params/DHParameters;->a()Ljava/math/BigInteger;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/math/BigInteger;->modPow(Ljava/math/BigInteger;Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    return-object v0
.end method
