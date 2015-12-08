.class public Lorg/spongycastle/math/ntru/polynomial/LongPolynomial2;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:[J

.field private b:I


# direct methods
.method private constructor <init>([J)V
    .locals 0

    .prologue
    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    iput-object p1, p0, Lorg/spongycastle/math/ntru/polynomial/LongPolynomial2;->a:[J

    .line 45
    return-void
.end method


# virtual methods
.method public clone()Ljava/lang/Object;
    .locals 2

    .prologue
    .line 239
    new-instance v1, Lorg/spongycastle/math/ntru/polynomial/LongPolynomial2;

    iget-object v0, p0, Lorg/spongycastle/math/ntru/polynomial/LongPolynomial2;->a:[J

    invoke-virtual {v0}, [J->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [J

    invoke-direct {v1, v0}, Lorg/spongycastle/math/ntru/polynomial/LongPolynomial2;-><init>([J)V

    .line 240
    iget v0, p0, Lorg/spongycastle/math/ntru/polynomial/LongPolynomial2;->b:I

    iput v0, v1, Lorg/spongycastle/math/ntru/polynomial/LongPolynomial2;->b:I

    .line 241
    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    .prologue
    .line 246
    instance-of v0, p1, Lorg/spongycastle/math/ntru/polynomial/LongPolynomial2;

    if-eqz v0, :cond_0

    .line 248
    iget-object v0, p0, Lorg/spongycastle/math/ntru/polynomial/LongPolynomial2;->a:[J

    check-cast p1, Lorg/spongycastle/math/ntru/polynomial/LongPolynomial2;

    iget-object v1, p1, Lorg/spongycastle/math/ntru/polynomial/LongPolynomial2;->a:[J

    invoke-static {v0, v1}, Lorg/spongycastle/util/Arrays;->a([J[J)Z

    move-result v0

    .line 252
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
