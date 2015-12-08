.class public Lorg/spongycastle/math/ec/ECAlgorithms;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Lorg/spongycastle/math/ec/ECPoint;Ljava/math/BigInteger;Lorg/spongycastle/math/ec/ECPoint;Ljava/math/BigInteger;)Lorg/spongycastle/math/ec/ECPoint;
    .locals 2

    .prologue
    .line 10
    iget-object v0, p0, Lorg/spongycastle/math/ec/ECPoint;->a:Lorg/spongycastle/math/ec/ECCurve;

    .line 11
    iget-object v1, p2, Lorg/spongycastle/math/ec/ECPoint;->a:Lorg/spongycastle/math/ec/ECCurve;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 13
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "P and Q must be on same curve"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 17
    :cond_0
    instance-of v1, v0, Lorg/spongycastle/math/ec/ECCurve$F2m;

    if-eqz v1, :cond_1

    .line 19
    check-cast v0, Lorg/spongycastle/math/ec/ECCurve$F2m;

    .line 20
    invoke-virtual {v0}, Lorg/spongycastle/math/ec/ECCurve$F2m;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 22
    invoke-virtual {p0, p1}, Lorg/spongycastle/math/ec/ECPoint;->a(Ljava/math/BigInteger;)Lorg/spongycastle/math/ec/ECPoint;

    move-result-object v0

    invoke-virtual {p2, p3}, Lorg/spongycastle/math/ec/ECPoint;->a(Ljava/math/BigInteger;)Lorg/spongycastle/math/ec/ECPoint;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/spongycastle/math/ec/ECPoint;->a(Lorg/spongycastle/math/ec/ECPoint;)Lorg/spongycastle/math/ec/ECPoint;

    move-result-object v0

    .line 26
    :goto_0
    return-object v0

    :cond_1
    invoke-static {p0, p1, p2, p3}, Lorg/spongycastle/math/ec/ECAlgorithms;->b(Lorg/spongycastle/math/ec/ECPoint;Ljava/math/BigInteger;Lorg/spongycastle/math/ec/ECPoint;Ljava/math/BigInteger;)Lorg/spongycastle/math/ec/ECPoint;

    move-result-object v0

    goto :goto_0
.end method

.method private static b(Lorg/spongycastle/math/ec/ECPoint;Ljava/math/BigInteger;Lorg/spongycastle/math/ec/ECPoint;Ljava/math/BigInteger;)Lorg/spongycastle/math/ec/ECPoint;
    .locals 4

    .prologue
    .line 62
    invoke-virtual {p1}, Ljava/math/BigInteger;->bitLength()I

    move-result v0

    invoke-virtual {p3}, Ljava/math/BigInteger;->bitLength()I

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    .line 63
    invoke-virtual {p0, p2}, Lorg/spongycastle/math/ec/ECPoint;->a(Lorg/spongycastle/math/ec/ECPoint;)Lorg/spongycastle/math/ec/ECPoint;

    move-result-object v2

    .line 64
    iget-object v0, p0, Lorg/spongycastle/math/ec/ECPoint;->a:Lorg/spongycastle/math/ec/ECCurve;

    invoke-virtual {v0}, Lorg/spongycastle/math/ec/ECCurve;->b()Lorg/spongycastle/math/ec/ECPoint;

    move-result-object v0

    .line 66
    add-int/lit8 v1, v1, -0x1

    :goto_0
    if-ltz v1, :cond_3

    .line 68
    invoke-virtual {v0}, Lorg/spongycastle/math/ec/ECPoint;->h()Lorg/spongycastle/math/ec/ECPoint;

    move-result-object v0

    .line 70
    invoke-virtual {p1, v1}, Ljava/math/BigInteger;->testBit(I)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 72
    invoke-virtual {p3, v1}, Ljava/math/BigInteger;->testBit(I)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 74
    invoke-virtual {v0, v2}, Lorg/spongycastle/math/ec/ECPoint;->a(Lorg/spongycastle/math/ec/ECPoint;)Lorg/spongycastle/math/ec/ECPoint;

    move-result-object v0

    .line 66
    :cond_0
    :goto_1
    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    .line 78
    :cond_1
    invoke-virtual {v0, p0}, Lorg/spongycastle/math/ec/ECPoint;->a(Lorg/spongycastle/math/ec/ECPoint;)Lorg/spongycastle/math/ec/ECPoint;

    move-result-object v0

    goto :goto_1

    .line 83
    :cond_2
    invoke-virtual {p3, v1}, Ljava/math/BigInteger;->testBit(I)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 85
    invoke-virtual {v0, p2}, Lorg/spongycastle/math/ec/ECPoint;->a(Lorg/spongycastle/math/ec/ECPoint;)Lorg/spongycastle/math/ec/ECPoint;

    move-result-object v0

    goto :goto_1

    .line 90
    :cond_3
    return-object v0
.end method
