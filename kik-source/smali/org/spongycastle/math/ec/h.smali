.class final Lorg/spongycastle/math/ec/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/spongycastle/math/ec/d;


# instance fields
.field private a:[Lorg/spongycastle/math/ec/ECPoint;

.field private b:Lorg/spongycastle/math/ec/ECPoint;


# direct methods
.method constructor <init>()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    iput-object v0, p0, Lorg/spongycastle/math/ec/h;->a:[Lorg/spongycastle/math/ec/ECPoint;

    .line 23
    iput-object v0, p0, Lorg/spongycastle/math/ec/h;->b:Lorg/spongycastle/math/ec/ECPoint;

    return-void
.end method


# virtual methods
.method protected final a(Lorg/spongycastle/math/ec/ECPoint;)V
    .locals 0

    .prologue
    .line 42
    iput-object p1, p0, Lorg/spongycastle/math/ec/h;->b:Lorg/spongycastle/math/ec/ECPoint;

    .line 43
    return-void
.end method

.method protected final a([Lorg/spongycastle/math/ec/ECPoint;)V
    .locals 0

    .prologue
    .line 32
    iput-object p1, p0, Lorg/spongycastle/math/ec/h;->a:[Lorg/spongycastle/math/ec/ECPoint;

    .line 33
    return-void
.end method

.method protected final a()[Lorg/spongycastle/math/ec/ECPoint;
    .locals 1

    .prologue
    .line 27
    iget-object v0, p0, Lorg/spongycastle/math/ec/h;->a:[Lorg/spongycastle/math/ec/ECPoint;

    return-object v0
.end method

.method protected final b()Lorg/spongycastle/math/ec/ECPoint;
    .locals 1

    .prologue
    .line 37
    iget-object v0, p0, Lorg/spongycastle/math/ec/h;->b:Lorg/spongycastle/math/ec/ECPoint;

    return-object v0
.end method
