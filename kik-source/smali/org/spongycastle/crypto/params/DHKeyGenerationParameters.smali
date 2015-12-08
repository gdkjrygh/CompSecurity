.class public Lorg/spongycastle/crypto/params/DHKeyGenerationParameters;
.super Lorg/spongycastle/crypto/KeyGenerationParameters;
.source "SourceFile"


# instance fields
.field private a:Lorg/spongycastle/crypto/params/DHParameters;


# direct methods
.method public constructor <init>(Ljava/security/SecureRandom;Lorg/spongycastle/crypto/params/DHParameters;)V
    .locals 1

    .prologue
    .line 16
    invoke-virtual {p2}, Lorg/spongycastle/crypto/params/DHParameters;->e()I

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p2}, Lorg/spongycastle/crypto/params/DHParameters;->e()I

    move-result v0

    :goto_0
    invoke-direct {p0, p1, v0}, Lorg/spongycastle/crypto/KeyGenerationParameters;-><init>(Ljava/security/SecureRandom;I)V

    .line 18
    iput-object p2, p0, Lorg/spongycastle/crypto/params/DHKeyGenerationParameters;->a:Lorg/spongycastle/crypto/params/DHParameters;

    .line 19
    return-void

    .line 16
    :cond_0
    invoke-virtual {p2}, Lorg/spongycastle/crypto/params/DHParameters;->a()Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigInteger;->bitLength()I

    move-result v0

    goto :goto_0
.end method


# virtual methods
.method public final c()Lorg/spongycastle/crypto/params/DHParameters;
    .locals 1

    .prologue
    .line 23
    iget-object v0, p0, Lorg/spongycastle/crypto/params/DHKeyGenerationParameters;->a:Lorg/spongycastle/crypto/params/DHParameters;

    return-object v0
.end method
