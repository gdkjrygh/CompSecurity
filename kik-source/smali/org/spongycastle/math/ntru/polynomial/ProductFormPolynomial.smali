.class public Lorg/spongycastle/math/ntru/polynomial/ProductFormPolynomial;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/spongycastle/math/ntru/polynomial/Polynomial;


# instance fields
.field private a:Lorg/spongycastle/math/ntru/polynomial/SparseTernaryPolynomial;

.field private b:Lorg/spongycastle/math/ntru/polynomial/SparseTernaryPolynomial;

.field private c:Lorg/spongycastle/math/ntru/polynomial/SparseTernaryPolynomial;


# direct methods
.method public constructor <init>(Lorg/spongycastle/math/ntru/polynomial/SparseTernaryPolynomial;Lorg/spongycastle/math/ntru/polynomial/SparseTernaryPolynomial;Lorg/spongycastle/math/ntru/polynomial/SparseTernaryPolynomial;)V
    .locals 0

    .prologue
    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    iput-object p1, p0, Lorg/spongycastle/math/ntru/polynomial/ProductFormPolynomial;->a:Lorg/spongycastle/math/ntru/polynomial/SparseTernaryPolynomial;

    .line 22
    iput-object p2, p0, Lorg/spongycastle/math/ntru/polynomial/ProductFormPolynomial;->b:Lorg/spongycastle/math/ntru/polynomial/SparseTernaryPolynomial;

    .line 23
    iput-object p3, p0, Lorg/spongycastle/math/ntru/polynomial/ProductFormPolynomial;->c:Lorg/spongycastle/math/ntru/polynomial/SparseTernaryPolynomial;

    .line 24
    return-void
.end method


# virtual methods
.method public final a(Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;)Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;
    .locals 2

    .prologue
    .line 65
    iget-object v0, p0, Lorg/spongycastle/math/ntru/polynomial/ProductFormPolynomial;->a:Lorg/spongycastle/math/ntru/polynomial/SparseTernaryPolynomial;

    invoke-virtual {v0, p1}, Lorg/spongycastle/math/ntru/polynomial/SparseTernaryPolynomial;->a(Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;)Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;

    move-result-object v0

    .line 66
    iget-object v1, p0, Lorg/spongycastle/math/ntru/polynomial/ProductFormPolynomial;->b:Lorg/spongycastle/math/ntru/polynomial/SparseTernaryPolynomial;

    invoke-virtual {v1, v0}, Lorg/spongycastle/math/ntru/polynomial/SparseTernaryPolynomial;->a(Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;)Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;

    move-result-object v0

    .line 67
    iget-object v1, p0, Lorg/spongycastle/math/ntru/polynomial/ProductFormPolynomial;->c:Lorg/spongycastle/math/ntru/polynomial/SparseTernaryPolynomial;

    invoke-virtual {v1, p1}, Lorg/spongycastle/math/ntru/polynomial/SparseTernaryPolynomial;->a(Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;)Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;->b(Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;)V

    .line 68
    return-object v0
.end method

.method public final a(Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;I)Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;
    .locals 1

    .prologue
    .line 88
    invoke-virtual {p0, p1}, Lorg/spongycastle/math/ntru/polynomial/ProductFormPolynomial;->a(Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;)Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;

    move-result-object v0

    .line 89
    invoke-virtual {v0, p2}, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;->c(I)V

    .line 90
    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 105
    if-ne p0, p1, :cond_1

    .line 151
    :cond_0
    :goto_0
    return v0

    .line 109
    :cond_1
    if-nez p1, :cond_2

    move v0, v1

    .line 111
    goto :goto_0

    .line 113
    :cond_2
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_3

    move v0, v1

    .line 115
    goto :goto_0

    .line 117
    :cond_3
    check-cast p1, Lorg/spongycastle/math/ntru/polynomial/ProductFormPolynomial;

    .line 118
    iget-object v2, p0, Lorg/spongycastle/math/ntru/polynomial/ProductFormPolynomial;->a:Lorg/spongycastle/math/ntru/polynomial/SparseTernaryPolynomial;

    if-nez v2, :cond_4

    .line 120
    iget-object v2, p1, Lorg/spongycastle/math/ntru/polynomial/ProductFormPolynomial;->a:Lorg/spongycastle/math/ntru/polynomial/SparseTernaryPolynomial;

    if-eqz v2, :cond_5

    move v0, v1

    .line 122
    goto :goto_0

    .line 125
    :cond_4
    iget-object v2, p0, Lorg/spongycastle/math/ntru/polynomial/ProductFormPolynomial;->a:Lorg/spongycastle/math/ntru/polynomial/SparseTernaryPolynomial;

    iget-object v3, p1, Lorg/spongycastle/math/ntru/polynomial/ProductFormPolynomial;->a:Lorg/spongycastle/math/ntru/polynomial/SparseTernaryPolynomial;

    invoke-virtual {v2, v3}, Lorg/spongycastle/math/ntru/polynomial/SparseTernaryPolynomial;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    move v0, v1

    .line 127
    goto :goto_0

    .line 129
    :cond_5
    iget-object v2, p0, Lorg/spongycastle/math/ntru/polynomial/ProductFormPolynomial;->b:Lorg/spongycastle/math/ntru/polynomial/SparseTernaryPolynomial;

    if-nez v2, :cond_6

    .line 131
    iget-object v2, p1, Lorg/spongycastle/math/ntru/polynomial/ProductFormPolynomial;->b:Lorg/spongycastle/math/ntru/polynomial/SparseTernaryPolynomial;

    if-eqz v2, :cond_7

    move v0, v1

    .line 133
    goto :goto_0

    .line 136
    :cond_6
    iget-object v2, p0, Lorg/spongycastle/math/ntru/polynomial/ProductFormPolynomial;->b:Lorg/spongycastle/math/ntru/polynomial/SparseTernaryPolynomial;

    iget-object v3, p1, Lorg/spongycastle/math/ntru/polynomial/ProductFormPolynomial;->b:Lorg/spongycastle/math/ntru/polynomial/SparseTernaryPolynomial;

    invoke-virtual {v2, v3}, Lorg/spongycastle/math/ntru/polynomial/SparseTernaryPolynomial;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_7

    move v0, v1

    .line 138
    goto :goto_0

    .line 140
    :cond_7
    iget-object v2, p0, Lorg/spongycastle/math/ntru/polynomial/ProductFormPolynomial;->c:Lorg/spongycastle/math/ntru/polynomial/SparseTernaryPolynomial;

    if-nez v2, :cond_8

    .line 142
    iget-object v2, p1, Lorg/spongycastle/math/ntru/polynomial/ProductFormPolynomial;->c:Lorg/spongycastle/math/ntru/polynomial/SparseTernaryPolynomial;

    if-eqz v2, :cond_0

    move v0, v1

    .line 144
    goto :goto_0

    .line 147
    :cond_8
    iget-object v2, p0, Lorg/spongycastle/math/ntru/polynomial/ProductFormPolynomial;->c:Lorg/spongycastle/math/ntru/polynomial/SparseTernaryPolynomial;

    iget-object v3, p1, Lorg/spongycastle/math/ntru/polynomial/ProductFormPolynomial;->c:Lorg/spongycastle/math/ntru/polynomial/SparseTernaryPolynomial;

    invoke-virtual {v2, v3}, Lorg/spongycastle/math/ntru/polynomial/SparseTernaryPolynomial;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    move v0, v1

    .line 149
    goto :goto_0
.end method

.method public hashCode()I
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 95
    iget-object v0, p0, Lorg/spongycastle/math/ntru/polynomial/ProductFormPolynomial;->a:Lorg/spongycastle/math/ntru/polynomial/SparseTernaryPolynomial;

    if-nez v0, :cond_0

    move v0, v1

    :goto_0
    add-int/lit8 v0, v0, 0x1f

    .line 98
    mul-int/lit8 v2, v0, 0x1f

    iget-object v0, p0, Lorg/spongycastle/math/ntru/polynomial/ProductFormPolynomial;->b:Lorg/spongycastle/math/ntru/polynomial/SparseTernaryPolynomial;

    if-nez v0, :cond_1

    move v0, v1

    :goto_1
    add-int/2addr v0, v2

    .line 99
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lorg/spongycastle/math/ntru/polynomial/ProductFormPolynomial;->c:Lorg/spongycastle/math/ntru/polynomial/SparseTernaryPolynomial;

    if-nez v2, :cond_2

    :goto_2
    add-int/2addr v0, v1

    .line 100
    return v0

    .line 95
    :cond_0
    iget-object v0, p0, Lorg/spongycastle/math/ntru/polynomial/ProductFormPolynomial;->a:Lorg/spongycastle/math/ntru/polynomial/SparseTernaryPolynomial;

    invoke-virtual {v0}, Lorg/spongycastle/math/ntru/polynomial/SparseTernaryPolynomial;->hashCode()I

    move-result v0

    goto :goto_0

    .line 98
    :cond_1
    iget-object v0, p0, Lorg/spongycastle/math/ntru/polynomial/ProductFormPolynomial;->b:Lorg/spongycastle/math/ntru/polynomial/SparseTernaryPolynomial;

    invoke-virtual {v0}, Lorg/spongycastle/math/ntru/polynomial/SparseTernaryPolynomial;->hashCode()I

    move-result v0

    goto :goto_1

    .line 99
    :cond_2
    iget-object v1, p0, Lorg/spongycastle/math/ntru/polynomial/ProductFormPolynomial;->c:Lorg/spongycastle/math/ntru/polynomial/SparseTernaryPolynomial;

    invoke-virtual {v1}, Lorg/spongycastle/math/ntru/polynomial/SparseTernaryPolynomial;->hashCode()I

    move-result v1

    goto :goto_2
.end method
