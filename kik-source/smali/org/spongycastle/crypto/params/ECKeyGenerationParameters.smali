.class public Lorg/spongycastle/crypto/params/ECKeyGenerationParameters;
.super Lorg/spongycastle/crypto/KeyGenerationParameters;
.source "SourceFile"


# instance fields
.field private a:Lorg/spongycastle/crypto/params/ECDomainParameters;


# direct methods
.method public constructor <init>(Lorg/spongycastle/crypto/params/ECDomainParameters;Ljava/security/SecureRandom;)V
    .locals 1

    .prologue
    .line 16
    iget-object v0, p1, Lorg/spongycastle/crypto/params/ECDomainParameters;->d:Ljava/math/BigInteger;

    invoke-virtual {v0}, Ljava/math/BigInteger;->bitLength()I

    move-result v0

    invoke-direct {p0, p2, v0}, Lorg/spongycastle/crypto/KeyGenerationParameters;-><init>(Ljava/security/SecureRandom;I)V

    .line 18
    iput-object p1, p0, Lorg/spongycastle/crypto/params/ECKeyGenerationParameters;->a:Lorg/spongycastle/crypto/params/ECDomainParameters;

    .line 19
    return-void
.end method


# virtual methods
.method public final c()Lorg/spongycastle/crypto/params/ECDomainParameters;
    .locals 1

    .prologue
    .line 23
    iget-object v0, p0, Lorg/spongycastle/crypto/params/ECKeyGenerationParameters;->a:Lorg/spongycastle/crypto/params/ECDomainParameters;

    return-object v0
.end method
