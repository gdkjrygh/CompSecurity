.class public abstract Lorg/bouncycastle/math/ec/ECFieldElement;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/bouncycastle/math/ec/ECConstants;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/bouncycastle/math/ec/ECFieldElement$F2m;,
        Lorg/bouncycastle/math/ec/ECFieldElement$Fp;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract a()Ljava/math/BigInteger;
.end method

.method public abstract a(Lorg/bouncycastle/math/ec/ECFieldElement;)Lorg/bouncycastle/math/ec/ECFieldElement;
.end method

.method public abstract b()I
.end method

.method public abstract b(Lorg/bouncycastle/math/ec/ECFieldElement;)Lorg/bouncycastle/math/ec/ECFieldElement;
.end method

.method public abstract c()Lorg/bouncycastle/math/ec/ECFieldElement;
.end method

.method public abstract c(Lorg/bouncycastle/math/ec/ECFieldElement;)Lorg/bouncycastle/math/ec/ECFieldElement;
.end method

.method public abstract d()Lorg/bouncycastle/math/ec/ECFieldElement;
.end method

.method public abstract d(Lorg/bouncycastle/math/ec/ECFieldElement;)Lorg/bouncycastle/math/ec/ECFieldElement;
.end method

.method public abstract e()Lorg/bouncycastle/math/ec/ECFieldElement;
.end method

.method public abstract f()Lorg/bouncycastle/math/ec/ECFieldElement;
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, Lorg/bouncycastle/math/ec/ECFieldElement;->a()Ljava/math/BigInteger;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Ljava/math/BigInteger;->toString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
