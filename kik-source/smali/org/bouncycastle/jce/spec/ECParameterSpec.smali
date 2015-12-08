.class public Lorg/bouncycastle/jce/spec/ECParameterSpec;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/security/spec/AlgorithmParameterSpec;


# instance fields
.field private a:Lorg/bouncycastle/math/ec/ECCurve;

.field private b:[B

.field private c:Lorg/bouncycastle/math/ec/ECPoint;

.field private d:Ljava/math/BigInteger;

.field private e:Ljava/math/BigInteger;


# direct methods
.method public constructor <init>(Lorg/bouncycastle/math/ec/ECCurve;Lorg/bouncycastle/math/ec/ECPoint;Ljava/math/BigInteger;Ljava/math/BigInteger;[B)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/bouncycastle/jce/spec/ECParameterSpec;->a:Lorg/bouncycastle/math/ec/ECCurve;

    iput-object p2, p0, Lorg/bouncycastle/jce/spec/ECParameterSpec;->c:Lorg/bouncycastle/math/ec/ECPoint;

    iput-object p3, p0, Lorg/bouncycastle/jce/spec/ECParameterSpec;->d:Ljava/math/BigInteger;

    iput-object p4, p0, Lorg/bouncycastle/jce/spec/ECParameterSpec;->e:Ljava/math/BigInteger;

    iput-object p5, p0, Lorg/bouncycastle/jce/spec/ECParameterSpec;->b:[B

    return-void
.end method


# virtual methods
.method public final b()Lorg/bouncycastle/math/ec/ECCurve;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/jce/spec/ECParameterSpec;->a:Lorg/bouncycastle/math/ec/ECCurve;

    return-object v0
.end method

.method public final c()Lorg/bouncycastle/math/ec/ECPoint;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/jce/spec/ECParameterSpec;->c:Lorg/bouncycastle/math/ec/ECPoint;

    return-object v0
.end method

.method public final d()Ljava/math/BigInteger;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/jce/spec/ECParameterSpec;->d:Ljava/math/BigInteger;

    return-object v0
.end method

.method public final e()Ljava/math/BigInteger;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/jce/spec/ECParameterSpec;->e:Ljava/math/BigInteger;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x0

    instance-of v1, p1, Lorg/bouncycastle/jce/spec/ECParameterSpec;

    if-nez v1, :cond_1

    :cond_0
    :goto_0
    return v0

    :cond_1
    check-cast p1, Lorg/bouncycastle/jce/spec/ECParameterSpec;

    iget-object v1, p0, Lorg/bouncycastle/jce/spec/ECParameterSpec;->a:Lorg/bouncycastle/math/ec/ECCurve;

    iget-object v2, p1, Lorg/bouncycastle/jce/spec/ECParameterSpec;->a:Lorg/bouncycastle/math/ec/ECCurve;

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lorg/bouncycastle/jce/spec/ECParameterSpec;->c:Lorg/bouncycastle/math/ec/ECPoint;

    iget-object v2, p1, Lorg/bouncycastle/jce/spec/ECParameterSpec;->c:Lorg/bouncycastle/math/ec/ECPoint;

    invoke-virtual {v1, v2}, Lorg/bouncycastle/math/ec/ECPoint;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0
.end method

.method public final f()[B
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/jce/spec/ECParameterSpec;->b:[B

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lorg/bouncycastle/jce/spec/ECParameterSpec;->a:Lorg/bouncycastle/math/ec/ECCurve;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    iget-object v1, p0, Lorg/bouncycastle/jce/spec/ECParameterSpec;->c:Lorg/bouncycastle/math/ec/ECPoint;

    invoke-virtual {v1}, Lorg/bouncycastle/math/ec/ECPoint;->hashCode()I

    move-result v1

    xor-int/2addr v0, v1

    return v0
.end method
