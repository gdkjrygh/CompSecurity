.class public Lorg/spongycastle/crypto/params/ElGamalKeyParameters;
.super Lorg/spongycastle/crypto/params/AsymmetricKeyParameter;
.source "SourceFile"


# instance fields
.field private b:Lorg/spongycastle/crypto/params/ElGamalParameters;


# direct methods
.method protected constructor <init>(ZLorg/spongycastle/crypto/params/ElGamalParameters;)V
    .locals 0

    .prologue
    .line 13
    invoke-direct {p0, p1}, Lorg/spongycastle/crypto/params/AsymmetricKeyParameter;-><init>(Z)V

    .line 15
    iput-object p2, p0, Lorg/spongycastle/crypto/params/ElGamalKeyParameters;->b:Lorg/spongycastle/crypto/params/ElGamalParameters;

    .line 16
    return-void
.end method


# virtual methods
.method public final b()Lorg/spongycastle/crypto/params/ElGamalParameters;
    .locals 1

    .prologue
    .line 20
    iget-object v0, p0, Lorg/spongycastle/crypto/params/ElGamalKeyParameters;->b:Lorg/spongycastle/crypto/params/ElGamalParameters;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 31
    instance-of v1, p1, Lorg/spongycastle/crypto/params/ElGamalKeyParameters;

    if-nez v1, :cond_1

    .line 44
    :cond_0
    :goto_0
    return v0

    .line 36
    :cond_1
    check-cast p1, Lorg/spongycastle/crypto/params/ElGamalKeyParameters;

    .line 38
    iget-object v1, p0, Lorg/spongycastle/crypto/params/ElGamalKeyParameters;->b:Lorg/spongycastle/crypto/params/ElGamalParameters;

    if-nez v1, :cond_2

    .line 40
    iget-object v1, p1, Lorg/spongycastle/crypto/params/ElGamalKeyParameters;->b:Lorg/spongycastle/crypto/params/ElGamalParameters;

    if-nez v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    .line 44
    :cond_2
    iget-object v0, p0, Lorg/spongycastle/crypto/params/ElGamalKeyParameters;->b:Lorg/spongycastle/crypto/params/ElGamalParameters;

    iget-object v1, p1, Lorg/spongycastle/crypto/params/ElGamalKeyParameters;->b:Lorg/spongycastle/crypto/params/ElGamalParameters;

    invoke-virtual {v0, v1}, Lorg/spongycastle/crypto/params/ElGamalParameters;->equals(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0
.end method

.method public hashCode()I
    .locals 1

    .prologue
    .line 25
    iget-object v0, p0, Lorg/spongycastle/crypto/params/ElGamalKeyParameters;->b:Lorg/spongycastle/crypto/params/ElGamalParameters;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/spongycastle/crypto/params/ElGamalKeyParameters;->b:Lorg/spongycastle/crypto/params/ElGamalParameters;

    invoke-virtual {v0}, Lorg/spongycastle/crypto/params/ElGamalParameters;->hashCode()I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
