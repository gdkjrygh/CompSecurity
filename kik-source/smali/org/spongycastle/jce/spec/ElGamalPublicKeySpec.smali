.class public Lorg/spongycastle/jce/spec/ElGamalPublicKeySpec;
.super Lorg/spongycastle/jce/spec/ElGamalKeySpec;
.source "SourceFile"


# instance fields
.field private a:Ljava/math/BigInteger;


# virtual methods
.method public final b()Ljava/math/BigInteger;
    .locals 1

    .prologue
    .line 31
    iget-object v0, p0, Lorg/spongycastle/jce/spec/ElGamalPublicKeySpec;->a:Ljava/math/BigInteger;

    return-object v0
.end method
