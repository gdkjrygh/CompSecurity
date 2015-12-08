.class public Lorg/spongycastle/crypto/params/DHPublicKeyParameters;
.super Lorg/spongycastle/crypto/params/DHKeyParameters;
.source "SourceFile"


# instance fields
.field private b:Ljava/math/BigInteger;


# direct methods
.method public constructor <init>(Ljava/math/BigInteger;Lorg/spongycastle/crypto/params/DHParameters;)V
    .locals 1

    .prologue
    .line 14
    const/4 v0, 0x0

    invoke-direct {p0, v0, p2}, Lorg/spongycastle/crypto/params/DHKeyParameters;-><init>(ZLorg/spongycastle/crypto/params/DHParameters;)V

    .line 16
    iput-object p1, p0, Lorg/spongycastle/crypto/params/DHPublicKeyParameters;->b:Ljava/math/BigInteger;

    .line 17
    return-void
.end method


# virtual methods
.method public final c()Ljava/math/BigInteger;
    .locals 1

    .prologue
    .line 21
    iget-object v0, p0, Lorg/spongycastle/crypto/params/DHPublicKeyParameters;->b:Ljava/math/BigInteger;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 32
    instance-of v0, p1, Lorg/spongycastle/crypto/params/DHPublicKeyParameters;

    if-nez v0, :cond_0

    move v0, v1

    .line 39
    :goto_0
    return v0

    :cond_0
    move-object v0, p1

    .line 37
    check-cast v0, Lorg/spongycastle/crypto/params/DHPublicKeyParameters;

    .line 39
    iget-object v0, v0, Lorg/spongycastle/crypto/params/DHPublicKeyParameters;->b:Ljava/math/BigInteger;

    iget-object v2, p0, Lorg/spongycastle/crypto/params/DHPublicKeyParameters;->b:Ljava/math/BigInteger;

    invoke-virtual {v0, v2}, Ljava/math/BigInteger;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-super {p0, p1}, Lorg/spongycastle/crypto/params/DHKeyParameters;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    move v0, v1

    goto :goto_0
.end method

.method public hashCode()I
    .locals 2

    .prologue
    .line 26
    iget-object v0, p0, Lorg/spongycastle/crypto/params/DHPublicKeyParameters;->b:Ljava/math/BigInteger;

    invoke-virtual {v0}, Ljava/math/BigInteger;->hashCode()I

    move-result v0

    invoke-super {p0}, Lorg/spongycastle/crypto/params/DHKeyParameters;->hashCode()I

    move-result v1

    xor-int/2addr v0, v1

    return v0
.end method
