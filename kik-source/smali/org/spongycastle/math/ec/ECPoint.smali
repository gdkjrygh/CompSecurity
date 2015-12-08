.class public abstract Lorg/spongycastle/math/ec/ECPoint;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/spongycastle/math/ec/ECPoint$F2m;,
        Lorg/spongycastle/math/ec/ECPoint$Fp;
    }
.end annotation


# static fields
.field private static g:Lorg/spongycastle/asn1/x9/X9IntegerConverter;


# instance fields
.field a:Lorg/spongycastle/math/ec/ECCurve;

.field b:Lorg/spongycastle/math/ec/ECFieldElement;

.field c:Lorg/spongycastle/math/ec/ECFieldElement;

.field protected d:Z

.field protected e:Lorg/spongycastle/math/ec/a;

.field protected f:Lorg/spongycastle/math/ec/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 22
    new-instance v0, Lorg/spongycastle/asn1/x9/X9IntegerConverter;

    invoke-direct {v0}, Lorg/spongycastle/asn1/x9/X9IntegerConverter;-><init>()V

    sput-object v0, Lorg/spongycastle/math/ec/ECPoint;->g:Lorg/spongycastle/asn1/x9/X9IntegerConverter;

    return-void
.end method

.method protected constructor <init>(Lorg/spongycastle/math/ec/ECCurve;Lorg/spongycastle/math/ec/ECFieldElement;Lorg/spongycastle/math/ec/ECFieldElement;)V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-object v0, p0, Lorg/spongycastle/math/ec/ECPoint;->e:Lorg/spongycastle/math/ec/a;

    .line 20
    iput-object v0, p0, Lorg/spongycastle/math/ec/ECPoint;->f:Lorg/spongycastle/math/ec/d;

    .line 26
    iput-object p1, p0, Lorg/spongycastle/math/ec/ECPoint;->a:Lorg/spongycastle/math/ec/ECCurve;

    .line 27
    iput-object p2, p0, Lorg/spongycastle/math/ec/ECPoint;->b:Lorg/spongycastle/math/ec/ECFieldElement;

    .line 28
    iput-object p3, p0, Lorg/spongycastle/math/ec/ECPoint;->c:Lorg/spongycastle/math/ec/ECFieldElement;

    .line 29
    return-void
.end method


# virtual methods
.method public final a()Lorg/spongycastle/math/ec/ECCurve;
    .locals 1

    .prologue
    .line 33
    iget-object v0, p0, Lorg/spongycastle/math/ec/ECPoint;->a:Lorg/spongycastle/math/ec/ECCurve;

    return-object v0
.end method

.method public final a(Ljava/math/BigInteger;)Lorg/spongycastle/math/ec/ECPoint;
    .locals 2

    .prologue
    .line 136
    invoke-virtual {p1}, Ljava/math/BigInteger;->signum()I

    move-result v0

    if-gez v0, :cond_0

    .line 138
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "The multiplicator cannot be negative"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 141
    :cond_0
    invoke-virtual {p0}, Lorg/spongycastle/math/ec/ECPoint;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 152
    :goto_0
    return-object p0

    .line 146
    :cond_1
    invoke-virtual {p1}, Ljava/math/BigInteger;->signum()I

    move-result v0

    if-nez v0, :cond_2

    .line 148
    iget-object v0, p0, Lorg/spongycastle/math/ec/ECPoint;->a:Lorg/spongycastle/math/ec/ECCurve;

    invoke-virtual {v0}, Lorg/spongycastle/math/ec/ECCurve;->b()Lorg/spongycastle/math/ec/ECPoint;

    move-result-object p0

    goto :goto_0

    .line 151
    :cond_2
    invoke-virtual {p0}, Lorg/spongycastle/math/ec/ECPoint;->i()V

    .line 152
    iget-object v0, p0, Lorg/spongycastle/math/ec/ECPoint;->e:Lorg/spongycastle/math/ec/a;

    iget-object v1, p0, Lorg/spongycastle/math/ec/ECPoint;->f:Lorg/spongycastle/math/ec/d;

    invoke-interface {v0, p0, p1, v1}, Lorg/spongycastle/math/ec/a;->a(Lorg/spongycastle/math/ec/ECPoint;Ljava/math/BigInteger;Lorg/spongycastle/math/ec/d;)Lorg/spongycastle/math/ec/ECPoint;

    move-result-object p0

    goto :goto_0
.end method

.method public abstract a(Lorg/spongycastle/math/ec/ECPoint;)Lorg/spongycastle/math/ec/ECPoint;
.end method

.method final a(Lorg/spongycastle/math/ec/d;)V
    .locals 0

    .prologue
    .line 108
    iput-object p1, p0, Lorg/spongycastle/math/ec/ECPoint;->f:Lorg/spongycastle/math/ec/d;

    .line 109
    return-void
.end method

.method public final b()Lorg/spongycastle/math/ec/ECFieldElement;
    .locals 1

    .prologue
    .line 38
    iget-object v0, p0, Lorg/spongycastle/math/ec/ECPoint;->b:Lorg/spongycastle/math/ec/ECFieldElement;

    return-object v0
.end method

.method public abstract b(Lorg/spongycastle/math/ec/ECPoint;)Lorg/spongycastle/math/ec/ECPoint;
.end method

.method public final c()Lorg/spongycastle/math/ec/ECFieldElement;
    .locals 1

    .prologue
    .line 43
    iget-object v0, p0, Lorg/spongycastle/math/ec/ECPoint;->c:Lorg/spongycastle/math/ec/ECFieldElement;

    return-object v0
.end method

.method public final d()Z
    .locals 1

    .prologue
    .line 48
    iget-object v0, p0, Lorg/spongycastle/math/ec/ECPoint;->b:Lorg/spongycastle/math/ec/ECFieldElement;

    if-nez v0, :cond_0

    iget-object v0, p0, Lorg/spongycastle/math/ec/ECPoint;->c:Lorg/spongycastle/math/ec/ECFieldElement;

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

    .prologue
    .line 53
    iget-boolean v0, p0, Lorg/spongycastle/math/ec/ECPoint;->d:Z

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 59
    if-ne p1, p0, :cond_1

    .line 76
    :cond_0
    :goto_0
    return v0

    .line 64
    :cond_1
    instance-of v2, p1, Lorg/spongycastle/math/ec/ECPoint;

    if-nez v2, :cond_2

    move v0, v1

    .line 66
    goto :goto_0

    .line 69
    :cond_2
    check-cast p1, Lorg/spongycastle/math/ec/ECPoint;

    .line 71
    invoke-virtual {p0}, Lorg/spongycastle/math/ec/ECPoint;->d()Z

    move-result v2

    if-eqz v2, :cond_3

    .line 73
    invoke-virtual {p1}, Lorg/spongycastle/math/ec/ECPoint;->d()Z

    move-result v0

    goto :goto_0

    .line 76
    :cond_3
    iget-object v2, p0, Lorg/spongycastle/math/ec/ECPoint;->b:Lorg/spongycastle/math/ec/ECFieldElement;

    iget-object v3, p1, Lorg/spongycastle/math/ec/ECPoint;->b:Lorg/spongycastle/math/ec/ECFieldElement;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    iget-object v2, p0, Lorg/spongycastle/math/ec/ECPoint;->c:Lorg/spongycastle/math/ec/ECFieldElement;

    iget-object v3, p1, Lorg/spongycastle/math/ec/ECPoint;->c:Lorg/spongycastle/math/ec/ECFieldElement;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    :cond_4
    move v0, v1

    goto :goto_0
.end method

.method public abstract f()[B
.end method

.method public abstract g()Lorg/spongycastle/math/ec/ECPoint;
.end method

.method public abstract h()Lorg/spongycastle/math/ec/ECPoint;
.end method

.method public hashCode()I
    .locals 2

    .prologue
    .line 81
    invoke-virtual {p0}, Lorg/spongycastle/math/ec/ECPoint;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 83
    const/4 v0, 0x0

    .line 86
    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lorg/spongycastle/math/ec/ECPoint;->b:Lorg/spongycastle/math/ec/ECFieldElement;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    iget-object v1, p0, Lorg/spongycastle/math/ec/ECPoint;->c:Lorg/spongycastle/math/ec/ECFieldElement;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    xor-int/2addr v0, v1

    goto :goto_0
.end method

.method declared-synchronized i()V
    .locals 1

    .prologue
    .line 123
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lorg/spongycastle/math/ec/ECPoint;->e:Lorg/spongycastle/math/ec/a;

    if-nez v0, :cond_0

    .line 125
    new-instance v0, Lorg/spongycastle/math/ec/b;

    invoke-direct {v0}, Lorg/spongycastle/math/ec/b;-><init>()V

    iput-object v0, p0, Lorg/spongycastle/math/ec/ECPoint;->e:Lorg/spongycastle/math/ec/a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 127
    :cond_0
    monitor-exit p0

    return-void

    .line 123
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
