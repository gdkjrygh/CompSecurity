.class public abstract Lorg/spongycastle/math/ec/ECFieldElement;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/spongycastle/math/ec/ECConstants;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/spongycastle/math/ec/ECFieldElement$F2m;,
        Lorg/spongycastle/math/ec/ECFieldElement$Fp;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 774
    return-void
.end method


# virtual methods
.method public abstract a()Ljava/math/BigInteger;
.end method

.method public abstract a(Lorg/spongycastle/math/ec/ECFieldElement;)Lorg/spongycastle/math/ec/ECFieldElement;
.end method

.method public abstract b()I
.end method

.method public abstract b(Lorg/spongycastle/math/ec/ECFieldElement;)Lorg/spongycastle/math/ec/ECFieldElement;
.end method

.method public abstract c()Lorg/spongycastle/math/ec/ECFieldElement;
.end method

.method public abstract c(Lorg/spongycastle/math/ec/ECFieldElement;)Lorg/spongycastle/math/ec/ECFieldElement;
.end method

.method public abstract d()Lorg/spongycastle/math/ec/ECFieldElement;
.end method

.method public abstract d(Lorg/spongycastle/math/ec/ECFieldElement;)Lorg/spongycastle/math/ec/ECFieldElement;
.end method

.method public abstract e()Lorg/spongycastle/math/ec/ECFieldElement;
.end method

.method public abstract f()Lorg/spongycastle/math/ec/ECFieldElement;
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 24
    invoke-virtual {p0}, Lorg/spongycastle/math/ec/ECFieldElement;->a()Ljava/math/BigInteger;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Ljava/math/BigInteger;->toString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
