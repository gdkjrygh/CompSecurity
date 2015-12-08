.class public Lorg/spongycastle/crypto/params/ElGamalKeyGenerationParameters;
.super Lorg/spongycastle/crypto/KeyGenerationParameters;
.source "SourceFile"


# instance fields
.field private a:Lorg/spongycastle/crypto/params/ElGamalParameters;


# direct methods
.method public constructor <init>(Ljava/security/SecureRandom;Lorg/spongycastle/crypto/params/ElGamalParameters;)V
    .locals 1

    .prologue
    .line 16
    invoke-virtual {p2}, Lorg/spongycastle/crypto/params/ElGamalParameters;->c()I

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p2}, Lorg/spongycastle/crypto/params/ElGamalParameters;->c()I

    move-result v0

    :goto_0
    invoke-direct {p0, p1, v0}, Lorg/spongycastle/crypto/KeyGenerationParameters;-><init>(Ljava/security/SecureRandom;I)V

    .line 18
    iput-object p2, p0, Lorg/spongycastle/crypto/params/ElGamalKeyGenerationParameters;->a:Lorg/spongycastle/crypto/params/ElGamalParameters;

    .line 19
    return-void

    .line 16
    :cond_0
    invoke-virtual {p2}, Lorg/spongycastle/crypto/params/ElGamalParameters;->a()Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigInteger;->bitLength()I

    move-result v0

    goto :goto_0
.end method


# virtual methods
.method public final c()Lorg/spongycastle/crypto/params/ElGamalParameters;
    .locals 1

    .prologue
    .line 23
    iget-object v0, p0, Lorg/spongycastle/crypto/params/ElGamalKeyGenerationParameters;->a:Lorg/spongycastle/crypto/params/ElGamalParameters;

    return-object v0
.end method
