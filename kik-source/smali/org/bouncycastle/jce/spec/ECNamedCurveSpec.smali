.class public Lorg/bouncycastle/jce/spec/ECNamedCurveSpec;
.super Ljava/security/spec/ECParameterSpec;


# instance fields
.field private a:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/security/spec/EllipticCurve;Ljava/security/spec/ECPoint;Ljava/math/BigInteger;Ljava/math/BigInteger;)V
    .locals 1

    invoke-virtual {p5}, Ljava/math/BigInteger;->intValue()I

    move-result v0

    invoke-direct {p0, p2, p3, p4, v0}, Ljava/security/spec/ECParameterSpec;-><init>(Ljava/security/spec/EllipticCurve;Ljava/security/spec/ECPoint;Ljava/math/BigInteger;I)V

    iput-object p1, p0, Lorg/bouncycastle/jce/spec/ECNamedCurveSpec;->a:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lorg/bouncycastle/math/ec/ECCurve;Lorg/bouncycastle/math/ec/ECPoint;Ljava/math/BigInteger;Ljava/math/BigInteger;[B)V
    .locals 5

    const/4 v4, 0x1

    const/4 v3, 0x0

    instance-of v0, p2, Lorg/bouncycastle/math/ec/ECCurve$Fp;

    if-eqz v0, :cond_0

    new-instance v1, Ljava/security/spec/EllipticCurve;

    new-instance v2, Ljava/security/spec/ECFieldFp;

    move-object v0, p2

    check-cast v0, Lorg/bouncycastle/math/ec/ECCurve$Fp;

    invoke-virtual {v0}, Lorg/bouncycastle/math/ec/ECCurve$Fp;->e()Ljava/math/BigInteger;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/security/spec/ECFieldFp;-><init>(Ljava/math/BigInteger;)V

    invoke-virtual {p2}, Lorg/bouncycastle/math/ec/ECCurve;->c()Lorg/bouncycastle/math/ec/ECFieldElement;

    move-result-object v0

    invoke-virtual {v0}, Lorg/bouncycastle/math/ec/ECFieldElement;->a()Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {p2}, Lorg/bouncycastle/math/ec/ECCurve;->d()Lorg/bouncycastle/math/ec/ECFieldElement;

    move-result-object v3

    invoke-virtual {v3}, Lorg/bouncycastle/math/ec/ECFieldElement;->a()Ljava/math/BigInteger;

    move-result-object v3

    invoke-direct {v1, v2, v0, v3, p6}, Ljava/security/spec/EllipticCurve;-><init>(Ljava/security/spec/ECField;Ljava/math/BigInteger;Ljava/math/BigInteger;[B)V

    move-object v0, v1

    :goto_0
    new-instance v1, Ljava/security/spec/ECPoint;

    invoke-virtual {p3}, Lorg/bouncycastle/math/ec/ECPoint;->b()Lorg/bouncycastle/math/ec/ECFieldElement;

    move-result-object v2

    invoke-virtual {v2}, Lorg/bouncycastle/math/ec/ECFieldElement;->a()Ljava/math/BigInteger;

    move-result-object v2

    invoke-virtual {p3}, Lorg/bouncycastle/math/ec/ECPoint;->c()Lorg/bouncycastle/math/ec/ECFieldElement;

    move-result-object v3

    invoke-virtual {v3}, Lorg/bouncycastle/math/ec/ECFieldElement;->a()Ljava/math/BigInteger;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Ljava/security/spec/ECPoint;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    invoke-virtual {p5}, Ljava/math/BigInteger;->intValue()I

    move-result v2

    invoke-direct {p0, v0, v1, p4, v2}, Ljava/security/spec/ECParameterSpec;-><init>(Ljava/security/spec/EllipticCurve;Ljava/security/spec/ECPoint;Ljava/math/BigInteger;I)V

    iput-object p1, p0, Lorg/bouncycastle/jce/spec/ECNamedCurveSpec;->a:Ljava/lang/String;

    return-void

    :cond_0
    move-object v0, p2

    check-cast v0, Lorg/bouncycastle/math/ec/ECCurve$F2m;

    invoke-virtual {v0}, Lorg/bouncycastle/math/ec/ECCurve$F2m;->i()Z

    move-result v1

    if-eqz v1, :cond_1

    new-array v2, v4, [I

    invoke-virtual {v0}, Lorg/bouncycastle/math/ec/ECCurve$F2m;->j()I

    move-result v1

    aput v1, v2, v3

    new-instance v1, Ljava/security/spec/EllipticCurve;

    new-instance v3, Ljava/security/spec/ECFieldF2m;

    invoke-virtual {v0}, Lorg/bouncycastle/math/ec/ECCurve$F2m;->h()I

    move-result v0

    invoke-direct {v3, v0, v2}, Ljava/security/spec/ECFieldF2m;-><init>(I[I)V

    invoke-virtual {p2}, Lorg/bouncycastle/math/ec/ECCurve;->c()Lorg/bouncycastle/math/ec/ECFieldElement;

    move-result-object v0

    invoke-virtual {v0}, Lorg/bouncycastle/math/ec/ECFieldElement;->a()Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {p2}, Lorg/bouncycastle/math/ec/ECCurve;->d()Lorg/bouncycastle/math/ec/ECFieldElement;

    move-result-object v2

    invoke-virtual {v2}, Lorg/bouncycastle/math/ec/ECFieldElement;->a()Ljava/math/BigInteger;

    move-result-object v2

    invoke-direct {v1, v3, v0, v2, p6}, Ljava/security/spec/EllipticCurve;-><init>(Ljava/security/spec/ECField;Ljava/math/BigInteger;Ljava/math/BigInteger;[B)V

    move-object v0, v1

    goto :goto_0

    :cond_1
    const/4 v1, 0x3

    new-array v2, v1, [I

    invoke-virtual {v0}, Lorg/bouncycastle/math/ec/ECCurve$F2m;->l()I

    move-result v1

    aput v1, v2, v3

    invoke-virtual {v0}, Lorg/bouncycastle/math/ec/ECCurve$F2m;->k()I

    move-result v1

    aput v1, v2, v4

    const/4 v1, 0x2

    invoke-virtual {v0}, Lorg/bouncycastle/math/ec/ECCurve$F2m;->j()I

    move-result v3

    aput v3, v2, v1

    new-instance v1, Ljava/security/spec/EllipticCurve;

    new-instance v3, Ljava/security/spec/ECFieldF2m;

    invoke-virtual {v0}, Lorg/bouncycastle/math/ec/ECCurve$F2m;->h()I

    move-result v0

    invoke-direct {v3, v0, v2}, Ljava/security/spec/ECFieldF2m;-><init>(I[I)V

    invoke-virtual {p2}, Lorg/bouncycastle/math/ec/ECCurve;->c()Lorg/bouncycastle/math/ec/ECFieldElement;

    move-result-object v0

    invoke-virtual {v0}, Lorg/bouncycastle/math/ec/ECFieldElement;->a()Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {p2}, Lorg/bouncycastle/math/ec/ECCurve;->d()Lorg/bouncycastle/math/ec/ECFieldElement;

    move-result-object v2

    invoke-virtual {v2}, Lorg/bouncycastle/math/ec/ECFieldElement;->a()Ljava/math/BigInteger;

    move-result-object v2

    invoke-direct {v1, v3, v0, v2, p6}, Ljava/security/spec/EllipticCurve;-><init>(Ljava/security/spec/ECField;Ljava/math/BigInteger;Ljava/math/BigInteger;[B)V

    move-object v0, v1

    goto/16 :goto_0
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/jce/spec/ECNamedCurveSpec;->a:Ljava/lang/String;

    return-object v0
.end method
