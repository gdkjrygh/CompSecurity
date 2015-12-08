.class final Lorg/bouncycastle/math/ec/b;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/bouncycastle/math/ec/a;


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lorg/bouncycastle/math/ec/ECPoint;Ljava/math/BigInteger;Lorg/bouncycastle/math/ec/d;)Lorg/bouncycastle/math/ec/ECPoint;
    .locals 6

    const-wide/16 v0, 0x3

    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v4

    invoke-virtual {p1}, Lorg/bouncycastle/math/ec/ECPoint;->g()Lorg/bouncycastle/math/ec/ECPoint;

    move-result-object v1

    invoke-virtual {v4}, Ljava/math/BigInteger;->bitLength()I

    move-result v0

    add-int/lit8 v0, v0, -0x2

    move v3, v0

    move-object v0, p1

    :goto_0
    if-lez v3, :cond_1

    invoke-virtual {v0}, Lorg/bouncycastle/math/ec/ECPoint;->h()Lorg/bouncycastle/math/ec/ECPoint;

    move-result-object v2

    invoke-virtual {v4, v3}, Ljava/math/BigInteger;->testBit(I)Z

    move-result v0

    invoke-virtual {p2, v3}, Ljava/math/BigInteger;->testBit(I)Z

    move-result v5

    if-eq v0, v5, :cond_2

    if-eqz v0, :cond_0

    move-object v0, p1

    :goto_1
    invoke-virtual {v2, v0}, Lorg/bouncycastle/math/ec/ECPoint;->a(Lorg/bouncycastle/math/ec/ECPoint;)Lorg/bouncycastle/math/ec/ECPoint;

    move-result-object v0

    :goto_2
    add-int/lit8 v2, v3, -0x1

    move v3, v2

    goto :goto_0

    :cond_0
    move-object v0, v1

    goto :goto_1

    :cond_1
    return-object v0

    :cond_2
    move-object v0, v2

    goto :goto_2
.end method
