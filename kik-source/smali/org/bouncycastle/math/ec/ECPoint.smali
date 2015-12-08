.class public abstract Lorg/bouncycastle/math/ec/ECPoint;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/bouncycastle/math/ec/ECPoint$F2m;,
        Lorg/bouncycastle/math/ec/ECPoint$Fp;
    }
.end annotation


# static fields
.field private static g:Lorg/bouncycastle/asn1/x9/X9IntegerConverter;


# instance fields
.field a:Lorg/bouncycastle/math/ec/ECCurve;

.field b:Lorg/bouncycastle/math/ec/ECFieldElement;

.field c:Lorg/bouncycastle/math/ec/ECFieldElement;

.field protected d:Z

.field protected e:Lorg/bouncycastle/math/ec/a;

.field protected f:Lorg/bouncycastle/math/ec/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lorg/bouncycastle/asn1/x9/X9IntegerConverter;

    invoke-direct {v0}, Lorg/bouncycastle/asn1/x9/X9IntegerConverter;-><init>()V

    sput-object v0, Lorg/bouncycastle/math/ec/ECPoint;->g:Lorg/bouncycastle/asn1/x9/X9IntegerConverter;

    return-void
.end method

.method protected constructor <init>(Lorg/bouncycastle/math/ec/ECCurve;Lorg/bouncycastle/math/ec/ECFieldElement;Lorg/bouncycastle/math/ec/ECFieldElement;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lorg/bouncycastle/math/ec/ECPoint;->e:Lorg/bouncycastle/math/ec/a;

    iput-object v0, p0, Lorg/bouncycastle/math/ec/ECPoint;->f:Lorg/bouncycastle/math/ec/d;

    iput-object p1, p0, Lorg/bouncycastle/math/ec/ECPoint;->a:Lorg/bouncycastle/math/ec/ECCurve;

    iput-object p2, p0, Lorg/bouncycastle/math/ec/ECPoint;->b:Lorg/bouncycastle/math/ec/ECFieldElement;

    iput-object p3, p0, Lorg/bouncycastle/math/ec/ECPoint;->c:Lorg/bouncycastle/math/ec/ECFieldElement;

    return-void
.end method


# virtual methods
.method public final a()Lorg/bouncycastle/math/ec/ECCurve;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/math/ec/ECPoint;->a:Lorg/bouncycastle/math/ec/ECCurve;

    return-object v0
.end method

.method public final a(Ljava/math/BigInteger;)Lorg/bouncycastle/math/ec/ECPoint;
    .locals 2

    invoke-virtual {p1}, Ljava/math/BigInteger;->signum()I

    move-result v0

    if-gez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "The multiplicator cannot be negative"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    invoke-virtual {p0}, Lorg/bouncycastle/math/ec/ECPoint;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    :goto_0
    return-object p0

    :cond_1
    invoke-virtual {p1}, Ljava/math/BigInteger;->signum()I

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lorg/bouncycastle/math/ec/ECPoint;->a:Lorg/bouncycastle/math/ec/ECCurve;

    invoke-virtual {v0}, Lorg/bouncycastle/math/ec/ECCurve;->b()Lorg/bouncycastle/math/ec/ECPoint;

    move-result-object p0

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, Lorg/bouncycastle/math/ec/ECPoint;->i()V

    iget-object v0, p0, Lorg/bouncycastle/math/ec/ECPoint;->e:Lorg/bouncycastle/math/ec/a;

    iget-object v1, p0, Lorg/bouncycastle/math/ec/ECPoint;->f:Lorg/bouncycastle/math/ec/d;

    invoke-interface {v0, p0, p1, v1}, Lorg/bouncycastle/math/ec/a;->a(Lorg/bouncycastle/math/ec/ECPoint;Ljava/math/BigInteger;Lorg/bouncycastle/math/ec/d;)Lorg/bouncycastle/math/ec/ECPoint;

    move-result-object p0

    goto :goto_0
.end method

.method public abstract a(Lorg/bouncycastle/math/ec/ECPoint;)Lorg/bouncycastle/math/ec/ECPoint;
.end method

.method final a(Lorg/bouncycastle/math/ec/d;)V
    .locals 0

    iput-object p1, p0, Lorg/bouncycastle/math/ec/ECPoint;->f:Lorg/bouncycastle/math/ec/d;

    return-void
.end method

.method public final b()Lorg/bouncycastle/math/ec/ECFieldElement;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/math/ec/ECPoint;->b:Lorg/bouncycastle/math/ec/ECFieldElement;

    return-object v0
.end method

.method public abstract b(Lorg/bouncycastle/math/ec/ECPoint;)Lorg/bouncycastle/math/ec/ECPoint;
.end method

.method public final c()Lorg/bouncycastle/math/ec/ECFieldElement;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/math/ec/ECPoint;->c:Lorg/bouncycastle/math/ec/ECFieldElement;

    return-object v0
.end method

.method public final d()Z
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/math/ec/ECPoint;->b:Lorg/bouncycastle/math/ec/ECFieldElement;

    if-nez v0, :cond_0

    iget-object v0, p0, Lorg/bouncycastle/math/ec/ECPoint;->c:Lorg/bouncycastle/math/ec/ECFieldElement;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final e()Z
    .locals 1

    iget-boolean v0, p0, Lorg/bouncycastle/math/ec/ECPoint;->d:Z

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-ne p1, p0, :cond_1

    :cond_0
    :goto_0
    return v0

    :cond_1
    instance-of v2, p1, Lorg/bouncycastle/math/ec/ECPoint;

    if-nez v2, :cond_2

    move v0, v1

    goto :goto_0

    :cond_2
    check-cast p1, Lorg/bouncycastle/math/ec/ECPoint;

    invoke-virtual {p0}, Lorg/bouncycastle/math/ec/ECPoint;->d()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-virtual {p1}, Lorg/bouncycastle/math/ec/ECPoint;->d()Z

    move-result v0

    goto :goto_0

    :cond_3
    iget-object v2, p0, Lorg/bouncycastle/math/ec/ECPoint;->b:Lorg/bouncycastle/math/ec/ECFieldElement;

    iget-object v3, p1, Lorg/bouncycastle/math/ec/ECPoint;->b:Lorg/bouncycastle/math/ec/ECFieldElement;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    iget-object v2, p0, Lorg/bouncycastle/math/ec/ECPoint;->c:Lorg/bouncycastle/math/ec/ECFieldElement;

    iget-object v3, p1, Lorg/bouncycastle/math/ec/ECPoint;->c:Lorg/bouncycastle/math/ec/ECFieldElement;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    :cond_4
    move v0, v1

    goto :goto_0
.end method

.method public abstract f()[B
.end method

.method public abstract g()Lorg/bouncycastle/math/ec/ECPoint;
.end method

.method public abstract h()Lorg/bouncycastle/math/ec/ECPoint;
.end method

.method public hashCode()I
    .locals 2

    invoke-virtual {p0}, Lorg/bouncycastle/math/ec/ECPoint;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lorg/bouncycastle/math/ec/ECPoint;->b:Lorg/bouncycastle/math/ec/ECFieldElement;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    iget-object v1, p0, Lorg/bouncycastle/math/ec/ECPoint;->c:Lorg/bouncycastle/math/ec/ECFieldElement;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    xor-int/2addr v0, v1

    goto :goto_0
.end method

.method declared-synchronized i()V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lorg/bouncycastle/math/ec/ECPoint;->e:Lorg/bouncycastle/math/ec/a;

    if-nez v0, :cond_0

    new-instance v0, Lorg/bouncycastle/math/ec/b;

    invoke-direct {v0}, Lorg/bouncycastle/math/ec/b;-><init>()V

    iput-object v0, p0, Lorg/bouncycastle/math/ec/ECPoint;->e:Lorg/bouncycastle/math/ec/a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
