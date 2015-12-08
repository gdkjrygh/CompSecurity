.class public Lorg/spongycastle/crypto/params/ElGamalParameters;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/spongycastle/crypto/CipherParameters;


# instance fields
.field private a:Ljava/math/BigInteger;

.field private b:Ljava/math/BigInteger;

.field private c:I


# direct methods
.method public constructor <init>(Ljava/math/BigInteger;Ljava/math/BigInteger;)V
    .locals 1

    .prologue
    .line 18
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lorg/spongycastle/crypto/params/ElGamalParameters;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V

    .line 19
    return-void
.end method

.method public constructor <init>(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V
    .locals 0

    .prologue
    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    iput-object p2, p0, Lorg/spongycastle/crypto/params/ElGamalParameters;->a:Ljava/math/BigInteger;

    .line 27
    iput-object p1, p0, Lorg/spongycastle/crypto/params/ElGamalParameters;->b:Ljava/math/BigInteger;

    .line 28
    iput p3, p0, Lorg/spongycastle/crypto/params/ElGamalParameters;->c:I

    .line 29
    return-void
.end method


# virtual methods
.method public final a()Ljava/math/BigInteger;
    .locals 1

    .prologue
    .line 33
    iget-object v0, p0, Lorg/spongycastle/crypto/params/ElGamalParameters;->b:Ljava/math/BigInteger;

    return-object v0
.end method

.method public final b()Ljava/math/BigInteger;
    .locals 1

    .prologue
    .line 41
    iget-object v0, p0, Lorg/spongycastle/crypto/params/ElGamalParameters;->a:Ljava/math/BigInteger;

    return-object v0
.end method

.method public final c()I
    .locals 1

    .prologue
    .line 49
    iget v0, p0, Lorg/spongycastle/crypto/params/ElGamalParameters;->c:I

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 55
    instance-of v1, p1, Lorg/spongycastle/crypto/params/ElGamalParameters;

    if-nez v1, :cond_1

    .line 62
    :cond_0
    :goto_0
    return v0

    .line 60
    :cond_1
    check-cast p1, Lorg/spongycastle/crypto/params/ElGamalParameters;

    .line 62
    iget-object v1, p1, Lorg/spongycastle/crypto/params/ElGamalParameters;->b:Ljava/math/BigInteger;

    iget-object v2, p0, Lorg/spongycastle/crypto/params/ElGamalParameters;->b:Ljava/math/BigInteger;

    invoke-virtual {v1, v2}, Ljava/math/BigInteger;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p1, Lorg/spongycastle/crypto/params/ElGamalParameters;->a:Ljava/math/BigInteger;

    iget-object v2, p0, Lorg/spongycastle/crypto/params/ElGamalParameters;->a:Ljava/math/BigInteger;

    invoke-virtual {v1, v2}, Ljava/math/BigInteger;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget v1, p1, Lorg/spongycastle/crypto/params/ElGamalParameters;->c:I

    iget v2, p0, Lorg/spongycastle/crypto/params/ElGamalParameters;->c:I

    if-ne v1, v2, :cond_0

    const/4 v0, 0x1

    goto :goto_0
.end method

.method public hashCode()I
    .locals 2

    .prologue
    .line 67
    iget-object v0, p0, Lorg/spongycastle/crypto/params/ElGamalParameters;->b:Ljava/math/BigInteger;

    invoke-virtual {v0}, Ljava/math/BigInteger;->hashCode()I

    move-result v0

    iget-object v1, p0, Lorg/spongycastle/crypto/params/ElGamalParameters;->a:Ljava/math/BigInteger;

    invoke-virtual {v1}, Ljava/math/BigInteger;->hashCode()I

    move-result v1

    xor-int/2addr v0, v1

    iget v1, p0, Lorg/spongycastle/crypto/params/ElGamalParameters;->c:I

    add-int/2addr v0, v1

    return v0
.end method
