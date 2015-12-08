.class final Lorg/bouncycastle/math/ec/h;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/bouncycastle/math/ec/d;


# instance fields
.field private a:[Lorg/bouncycastle/math/ec/ECPoint;

.field private b:Lorg/bouncycastle/math/ec/ECPoint;


# direct methods
.method constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lorg/bouncycastle/math/ec/h;->a:[Lorg/bouncycastle/math/ec/ECPoint;

    iput-object v0, p0, Lorg/bouncycastle/math/ec/h;->b:Lorg/bouncycastle/math/ec/ECPoint;

    return-void
.end method


# virtual methods
.method protected final a(Lorg/bouncycastle/math/ec/ECPoint;)V
    .locals 0

    iput-object p1, p0, Lorg/bouncycastle/math/ec/h;->b:Lorg/bouncycastle/math/ec/ECPoint;

    return-void
.end method

.method protected final a([Lorg/bouncycastle/math/ec/ECPoint;)V
    .locals 0

    iput-object p1, p0, Lorg/bouncycastle/math/ec/h;->a:[Lorg/bouncycastle/math/ec/ECPoint;

    return-void
.end method

.method protected final a()[Lorg/bouncycastle/math/ec/ECPoint;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/math/ec/h;->a:[Lorg/bouncycastle/math/ec/ECPoint;

    return-object v0
.end method

.method protected final b()Lorg/bouncycastle/math/ec/ECPoint;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/math/ec/h;->b:Lorg/bouncycastle/math/ec/ECPoint;

    return-object v0
.end method
