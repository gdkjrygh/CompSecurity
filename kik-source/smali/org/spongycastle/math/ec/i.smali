.class final Lorg/spongycastle/math/ec/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/spongycastle/math/ec/a;


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static a(Lorg/spongycastle/math/ec/ECPoint$F2m;[BLorg/spongycastle/math/ec/d;)Lorg/spongycastle/math/ec/ECPoint$F2m;
    .locals 4

    .prologue
    .line 84
    iget-object v0, p0, Lorg/spongycastle/math/ec/ECPoint;->a:Lorg/spongycastle/math/ec/ECCurve;

    check-cast v0, Lorg/spongycastle/math/ec/ECCurve$F2m;

    .line 85
    iget-object v0, v0, Lorg/spongycastle/math/ec/ECCurve;->a:Lorg/spongycastle/math/ec/ECFieldElement;

    invoke-virtual {v0}, Lorg/spongycastle/math/ec/ECFieldElement;->a()Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigInteger;->byteValue()B

    move-result v0

    .line 88
    if-eqz p2, :cond_0

    instance-of v1, p2, Lorg/spongycastle/math/ec/j;

    if-nez v1, :cond_2

    .line 90
    :cond_0
    invoke-static {p0, v0}, Lorg/spongycastle/math/ec/f;->a(Lorg/spongycastle/math/ec/ECPoint$F2m;B)[Lorg/spongycastle/math/ec/ECPoint$F2m;

    move-result-object v0

    .line 91
    new-instance v1, Lorg/spongycastle/math/ec/j;

    invoke-direct {v1, v0}, Lorg/spongycastle/math/ec/j;-><init>([Lorg/spongycastle/math/ec/ECPoint$F2m;)V

    invoke-virtual {p0, v1}, Lorg/spongycastle/math/ec/ECPoint$F2m;->a(Lorg/spongycastle/math/ec/d;)V

    move-object v1, v0

    .line 99
    :goto_0
    iget-object v0, p0, Lorg/spongycastle/math/ec/ECPoint;->a:Lorg/spongycastle/math/ec/ECCurve;

    invoke-virtual {v0}, Lorg/spongycastle/math/ec/ECCurve;->b()Lorg/spongycastle/math/ec/ECPoint;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/math/ec/ECPoint$F2m;

    .line 100
    array-length v2, p1

    add-int/lit8 v2, v2, -0x1

    :goto_1
    if-ltz v2, :cond_4

    .line 102
    invoke-static {v0}, Lorg/spongycastle/math/ec/f;->a(Lorg/spongycastle/math/ec/ECPoint$F2m;)Lorg/spongycastle/math/ec/ECPoint$F2m;

    move-result-object v0

    .line 103
    aget-byte v3, p1, v2

    if-eqz v3, :cond_1

    .line 105
    aget-byte v3, p1, v2

    if-lez v3, :cond_3

    .line 107
    aget-byte v3, p1, v2

    aget-object v3, v1, v3

    invoke-virtual {v0, v3}, Lorg/spongycastle/math/ec/ECPoint$F2m;->a(Lorg/spongycastle/math/ec/ECPoint$F2m;)Lorg/spongycastle/math/ec/ECPoint$F2m;

    move-result-object v0

    .line 100
    :cond_1
    :goto_2
    add-int/lit8 v2, v2, -0x1

    goto :goto_1

    .line 95
    :cond_2
    check-cast p2, Lorg/spongycastle/math/ec/j;

    invoke-virtual {p2}, Lorg/spongycastle/math/ec/j;->a()[Lorg/spongycastle/math/ec/ECPoint$F2m;

    move-result-object v0

    move-object v1, v0

    goto :goto_0

    .line 112
    :cond_3
    aget-byte v3, p1, v2

    neg-int v3, v3

    aget-object v3, v1, v3

    invoke-virtual {v0, v3}, Lorg/spongycastle/math/ec/ECPoint$F2m;->b(Lorg/spongycastle/math/ec/ECPoint$F2m;)Lorg/spongycastle/math/ec/ECPoint$F2m;

    move-result-object v0

    goto :goto_2

    .line 117
    :cond_4
    return-object v0
.end method


# virtual methods
.method public final a(Lorg/spongycastle/math/ec/ECPoint;Ljava/math/BigInteger;Lorg/spongycastle/math/ec/d;)Lorg/spongycastle/math/ec/ECPoint;
    .locals 6

    .prologue
    .line 21
    instance-of v0, p1, Lorg/spongycastle/math/ec/ECPoint$F2m;

    if-nez v0, :cond_0

    .line 23
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Only ECPoint.F2m can be used in WTauNafMultiplier"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 27
    :cond_0
    check-cast p1, Lorg/spongycastle/math/ec/ECPoint$F2m;

    .line 29
    iget-object v0, p1, Lorg/spongycastle/math/ec/ECPoint;->a:Lorg/spongycastle/math/ec/ECCurve;

    check-cast v0, Lorg/spongycastle/math/ec/ECCurve$F2m;

    .line 30
    invoke-virtual {v0}, Lorg/spongycastle/math/ec/ECCurve$F2m;->h()I

    move-result v1

    .line 31
    iget-object v2, v0, Lorg/spongycastle/math/ec/ECCurve;->a:Lorg/spongycastle/math/ec/ECFieldElement;

    invoke-virtual {v2}, Lorg/spongycastle/math/ec/ECFieldElement;->a()Ljava/math/BigInteger;

    move-result-object v2

    invoke-virtual {v2}, Ljava/math/BigInteger;->byteValue()B

    move-result v2

    .line 32
    invoke-virtual {v0}, Lorg/spongycastle/math/ec/ECCurve$F2m;->f()B

    move-result v3

    .line 33
    invoke-virtual {v0}, Lorg/spongycastle/math/ec/ECCurve$F2m;->g()[Ljava/math/BigInteger;

    move-result-object v0

    .line 35
    invoke-static {p2, v1, v2, v0, v3}, Lorg/spongycastle/math/ec/f;->a(Ljava/math/BigInteger;IB[Ljava/math/BigInteger;B)Lorg/spongycastle/math/ec/k;

    move-result-object v1

    .line 37
    if-nez v2, :cond_1

    sget-object v0, Lorg/spongycastle/math/ec/f;->a:[Lorg/spongycastle/math/ec/k;

    :goto_0
    invoke-static {v3}, Lorg/spongycastle/math/ec/f;->a(B)Ljava/math/BigInteger;

    move-result-object v2

    const-wide/16 v4, 0x10

    invoke-static {v4, v5}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v4

    invoke-static {v3, v1, v4, v2, v0}, Lorg/spongycastle/math/ec/f;->a(BLorg/spongycastle/math/ec/k;Ljava/math/BigInteger;Ljava/math/BigInteger;[Lorg/spongycastle/math/ec/k;)[B

    move-result-object v0

    invoke-static {p1, v0, p3}, Lorg/spongycastle/math/ec/i;->a(Lorg/spongycastle/math/ec/ECPoint$F2m;[BLorg/spongycastle/math/ec/d;)Lorg/spongycastle/math/ec/ECPoint$F2m;

    move-result-object v0

    return-object v0

    :cond_1
    sget-object v0, Lorg/spongycastle/math/ec/f;->c:[Lorg/spongycastle/math/ec/k;

    goto :goto_0
.end method
