.class public Lorg/spongycastle/jce/spec/ECNamedCurveParameterSpec;
.super Lorg/spongycastle/jce/spec/ECParameterSpec;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lorg/spongycastle/math/ec/ECCurve;Lorg/spongycastle/math/ec/ECPoint;Ljava/math/BigInteger;Ljava/math/BigInteger;[B)V
    .locals 6

    .prologue
    .line 50
    move-object v0, p0

    move-object v1, p2

    move-object v2, p3

    move-object v3, p4

    move-object v4, p5

    move-object v5, p6

    invoke-direct/range {v0 .. v5}, Lorg/spongycastle/jce/spec/ECParameterSpec;-><init>(Lorg/spongycastle/math/ec/ECCurve;Lorg/spongycastle/math/ec/ECPoint;Ljava/math/BigInteger;Ljava/math/BigInteger;[B)V

    .line 52
    iput-object p1, p0, Lorg/spongycastle/jce/spec/ECNamedCurveParameterSpec;->a:Ljava/lang/String;

    .line 53
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 60
    iget-object v0, p0, Lorg/spongycastle/jce/spec/ECNamedCurveParameterSpec;->a:Ljava/lang/String;

    return-object v0
.end method
