.class public Lorg/spongycastle/math/ntru/polynomial/BigIntPolynomial;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final b:D


# instance fields
.field a:[Ljava/math/BigInteger;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 19
    const-wide/high16 v0, 0x4000000000000000L    # 2.0

    invoke-static {v0, v1}, Ljava/lang/Math;->log10(D)D

    move-result-wide v0

    sput-wide v0, Lorg/spongycastle/math/ntru/polynomial/BigIntPolynomial;->b:D

    return-void
.end method

.method private constructor <init>([Ljava/math/BigInteger;)V
    .locals 0

    .prologue
    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    iput-object p1, p0, Lorg/spongycastle/math/ntru/polynomial/BigIntPolynomial;->a:[Ljava/math/BigInteger;

    .line 45
    return-void
.end method


# virtual methods
.method public clone()Ljava/lang/Object;
    .locals 2

    .prologue
    .line 357
    new-instance v1, Lorg/spongycastle/math/ntru/polynomial/BigIntPolynomial;

    iget-object v0, p0, Lorg/spongycastle/math/ntru/polynomial/BigIntPolynomial;->a:[Ljava/math/BigInteger;

    invoke-virtual {v0}, [Ljava/math/BigInteger;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/math/BigInteger;

    invoke-direct {v1, v0}, Lorg/spongycastle/math/ntru/polynomial/BigIntPolynomial;-><init>([Ljava/math/BigInteger;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 370
    if-ne p0, p1, :cond_1

    .line 387
    :cond_0
    :goto_0
    return v0

    .line 374
    :cond_1
    if-nez p1, :cond_2

    move v0, v1

    .line 376
    goto :goto_0

    .line 378
    :cond_2
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_3

    move v0, v1

    .line 380
    goto :goto_0

    .line 382
    :cond_3
    check-cast p1, Lorg/spongycastle/math/ntru/polynomial/BigIntPolynomial;

    .line 383
    iget-object v2, p0, Lorg/spongycastle/math/ntru/polynomial/BigIntPolynomial;->a:[Ljava/math/BigInteger;

    iget-object v3, p1, Lorg/spongycastle/math/ntru/polynomial/BigIntPolynomial;->a:[Ljava/math/BigInteger;

    invoke-static {v2, v3}, Lorg/spongycastle/util/Arrays;->a([Ljava/math/BigInteger;[Ljava/math/BigInteger;)Z

    move-result v2

    if-nez v2, :cond_0

    move v0, v1

    .line 385
    goto :goto_0
.end method

.method public hashCode()I
    .locals 1

    .prologue
    .line 362
    iget-object v0, p0, Lorg/spongycastle/math/ntru/polynomial/BigIntPolynomial;->a:[Ljava/math/BigInteger;

    invoke-static {v0}, Lorg/spongycastle/util/Arrays;->a([Ljava/math/BigInteger;)I

    move-result v0

    add-int/lit8 v0, v0, 0x1f

    .line 365
    return v0
.end method
