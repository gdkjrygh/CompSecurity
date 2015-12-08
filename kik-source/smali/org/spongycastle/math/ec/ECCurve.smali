.class public abstract Lorg/spongycastle/math/ec/ECCurve;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/spongycastle/math/ec/ECCurve$F2m;,
        Lorg/spongycastle/math/ec/ECCurve$Fp;
    }
.end annotation


# instance fields
.field a:Lorg/spongycastle/math/ec/ECFieldElement;

.field b:Lorg/spongycastle/math/ec/ECFieldElement;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 178
    return-void
.end method


# virtual methods
.method public abstract a()I
.end method

.method public abstract a(Ljava/math/BigInteger;)Lorg/spongycastle/math/ec/ECFieldElement;
.end method

.method public abstract a(Ljava/math/BigInteger;Ljava/math/BigInteger;Z)Lorg/spongycastle/math/ec/ECPoint;
.end method

.method public abstract a([B)Lorg/spongycastle/math/ec/ECPoint;
.end method

.method public abstract b()Lorg/spongycastle/math/ec/ECPoint;
.end method

.method public final c()Lorg/spongycastle/math/ec/ECFieldElement;
    .locals 1

    .prologue
    .line 25
    iget-object v0, p0, Lorg/spongycastle/math/ec/ECCurve;->a:Lorg/spongycastle/math/ec/ECFieldElement;

    return-object v0
.end method

.method public final d()Lorg/spongycastle/math/ec/ECFieldElement;
    .locals 1

    .prologue
    .line 30
    iget-object v0, p0, Lorg/spongycastle/math/ec/ECCurve;->b:Lorg/spongycastle/math/ec/ECFieldElement;

    return-object v0
.end method
