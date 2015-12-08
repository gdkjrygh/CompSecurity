.class public Lorg/spongycastle/crypto/params/NaccacheSternPrivateKeyParameters;
.super Lorg/spongycastle/crypto/params/NaccacheSternKeyParameters;
.source "SourceFile"


# instance fields
.field private c:Ljava/math/BigInteger;

.field private d:Ljava/util/Vector;


# virtual methods
.method public final e()Ljava/math/BigInteger;
    .locals 1

    .prologue
    .line 43
    iget-object v0, p0, Lorg/spongycastle/crypto/params/NaccacheSternPrivateKeyParameters;->c:Ljava/math/BigInteger;

    return-object v0
.end method

.method public final f()Ljava/util/Vector;
    .locals 1

    .prologue
    .line 48
    iget-object v0, p0, Lorg/spongycastle/crypto/params/NaccacheSternPrivateKeyParameters;->d:Ljava/util/Vector;

    return-object v0
.end method
