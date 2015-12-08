.class public abstract Lorg/bouncycastle/math/ec/ECCurve;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/bouncycastle/math/ec/ECCurve$F2m;,
        Lorg/bouncycastle/math/ec/ECCurve$Fp;
    }
.end annotation


# instance fields
.field a:Lorg/bouncycastle/math/ec/ECFieldElement;

.field b:Lorg/bouncycastle/math/ec/ECFieldElement;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract a()I
.end method

.method public abstract a(Ljava/math/BigInteger;)Lorg/bouncycastle/math/ec/ECFieldElement;
.end method

.method public abstract a(Ljava/math/BigInteger;Ljava/math/BigInteger;Z)Lorg/bouncycastle/math/ec/ECPoint;
.end method

.method public abstract a([B)Lorg/bouncycastle/math/ec/ECPoint;
.end method

.method public abstract b()Lorg/bouncycastle/math/ec/ECPoint;
.end method

.method public final c()Lorg/bouncycastle/math/ec/ECFieldElement;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/math/ec/ECCurve;->a:Lorg/bouncycastle/math/ec/ECFieldElement;

    return-object v0
.end method

.method public final d()Lorg/bouncycastle/math/ec/ECFieldElement;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/math/ec/ECCurve;->b:Lorg/bouncycastle/math/ec/ECFieldElement;

    return-object v0
.end method
