.class public Lorg/spongycastle/math/ntru/polynomial/SparseTernaryPolynomial;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/spongycastle/math/ntru/polynomial/TernaryPolynomial;


# instance fields
.field private a:I

.field private b:[I

.field private c:[I


# direct methods
.method public constructor <init>([I)V
    .locals 5

    .prologue
    const/4 v0, 0x0

    .line 58
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 59
    array-length v1, p1

    iput v1, p0, Lorg/spongycastle/math/ntru/polynomial/SparseTernaryPolynomial;->a:I

    .line 60
    iget v1, p0, Lorg/spongycastle/math/ntru/polynomial/SparseTernaryPolynomial;->a:I

    new-array v1, v1, [I

    iput-object v1, p0, Lorg/spongycastle/math/ntru/polynomial/SparseTernaryPolynomial;->b:[I

    .line 61
    iget v1, p0, Lorg/spongycastle/math/ntru/polynomial/SparseTernaryPolynomial;->a:I

    new-array v1, v1, [I

    iput-object v1, p0, Lorg/spongycastle/math/ntru/polynomial/SparseTernaryPolynomial;->c:[I

    move v1, v0

    move v2, v0

    .line 64
    :goto_0
    iget v3, p0, Lorg/spongycastle/math/ntru/polynomial/SparseTernaryPolynomial;->a:I

    if-ge v0, v3, :cond_0

    .line 66
    aget v3, p1, v0

    .line 67
    packed-switch v3, :pswitch_data_0

    .line 78
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Illegal value: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", must be one of {-1, 0, 1}"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 70
    :pswitch_0
    iget-object v4, p0, Lorg/spongycastle/math/ntru/polynomial/SparseTernaryPolynomial;->b:[I

    add-int/lit8 v3, v2, 0x1

    aput v0, v4, v2

    move v2, v3

    .line 64
    :goto_1
    :pswitch_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 73
    :pswitch_2
    iget-object v4, p0, Lorg/spongycastle/math/ntru/polynomial/SparseTernaryPolynomial;->c:[I

    add-int/lit8 v3, v1, 0x1

    aput v0, v4, v1

    move v1, v3

    .line 74
    goto :goto_1

    .line 81
    :cond_0
    iget-object v0, p0, Lorg/spongycastle/math/ntru/polynomial/SparseTernaryPolynomial;->b:[I

    invoke-static {v0, v2}, Lorg/spongycastle/util/Arrays;->a([II)[I

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/math/ntru/polynomial/SparseTernaryPolynomial;->b:[I

    .line 82
    iget-object v0, p0, Lorg/spongycastle/math/ntru/polynomial/SparseTernaryPolynomial;->c:[I

    invoke-static {v0, v1}, Lorg/spongycastle/util/Arrays;->a([II)[I

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/math/ntru/polynomial/SparseTernaryPolynomial;->c:[I

    .line 83
    return-void

    .line 67
    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final a(Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;)Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;
    .locals 9

    .prologue
    const/4 v1, 0x0

    .line 128
    iget-object v4, p1, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;->a:[I

    .line 129
    array-length v0, v4

    iget v2, p0, Lorg/spongycastle/math/ntru/polynomial/SparseTernaryPolynomial;->a:I

    if-eq v0, v2, :cond_0

    .line 131
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Number of coefficients must be the same"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 134
    :cond_0
    iget v0, p0, Lorg/spongycastle/math/ntru/polynomial/SparseTernaryPolynomial;->a:I

    new-array v5, v0, [I

    move v0, v1

    .line 135
    :goto_0
    iget-object v2, p0, Lorg/spongycastle/math/ntru/polynomial/SparseTernaryPolynomial;->b:[I

    array-length v2, v2

    if-eq v0, v2, :cond_4

    .line 137
    iget-object v2, p0, Lorg/spongycastle/math/ntru/polynomial/SparseTernaryPolynomial;->b:[I

    aget v2, v2, v0

    .line 138
    iget v3, p0, Lorg/spongycastle/math/ntru/polynomial/SparseTernaryPolynomial;->a:I

    add-int/lit8 v3, v3, -0x1

    sub-int/2addr v3, v2

    .line 139
    iget v2, p0, Lorg/spongycastle/math/ntru/polynomial/SparseTernaryPolynomial;->a:I

    add-int/lit8 v2, v2, -0x1

    move v8, v2

    move v2, v3

    move v3, v8

    :goto_1
    if-ltz v3, :cond_2

    .line 141
    aget v6, v5, v3

    aget v7, v4, v2

    add-int/2addr v6, v7

    aput v6, v5, v3

    .line 142
    add-int/lit8 v2, v2, -0x1

    .line 143
    if-gez v2, :cond_1

    .line 145
    iget v2, p0, Lorg/spongycastle/math/ntru/polynomial/SparseTernaryPolynomial;->a:I

    add-int/lit8 v2, v2, -0x1

    .line 139
    :cond_1
    add-int/lit8 v3, v3, -0x1

    goto :goto_1

    .line 135
    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 150
    :cond_3
    add-int/lit8 v1, v1, 0x1

    :cond_4
    iget-object v0, p0, Lorg/spongycastle/math/ntru/polynomial/SparseTernaryPolynomial;->c:[I

    array-length v0, v0

    if-eq v1, v0, :cond_6

    .line 152
    iget-object v0, p0, Lorg/spongycastle/math/ntru/polynomial/SparseTernaryPolynomial;->c:[I

    aget v0, v0, v1

    .line 153
    iget v2, p0, Lorg/spongycastle/math/ntru/polynomial/SparseTernaryPolynomial;->a:I

    add-int/lit8 v2, v2, -0x1

    sub-int/2addr v2, v0

    .line 154
    iget v0, p0, Lorg/spongycastle/math/ntru/polynomial/SparseTernaryPolynomial;->a:I

    add-int/lit8 v0, v0, -0x1

    move v8, v0

    move v0, v2

    move v2, v8

    :goto_2
    if-ltz v2, :cond_3

    .line 156
    aget v3, v5, v2

    aget v6, v4, v0

    sub-int/2addr v3, v6

    aput v3, v5, v2

    .line 157
    add-int/lit8 v0, v0, -0x1

    .line 158
    if-gez v0, :cond_5

    .line 160
    iget v0, p0, Lorg/spongycastle/math/ntru/polynomial/SparseTernaryPolynomial;->a:I

    add-int/lit8 v0, v0, -0x1

    .line 154
    :cond_5
    add-int/lit8 v2, v2, -0x1

    goto :goto_2

    .line 165
    :cond_6
    new-instance v0, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;

    invoke-direct {v0, v5}, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;-><init>([I)V

    return-object v0
.end method

.method public final a(Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;I)Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;
    .locals 1

    .prologue
    .line 170
    invoke-virtual {p0, p1}, Lorg/spongycastle/math/ntru/polynomial/SparseTernaryPolynomial;->a(Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;)Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;

    move-result-object v0

    .line 171
    invoke-virtual {v0, p2}, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;->c(I)V

    .line 172
    return-object v0
.end method

.method public final a()[I
    .locals 1

    .prologue
    .line 224
    iget-object v0, p0, Lorg/spongycastle/math/ntru/polynomial/SparseTernaryPolynomial;->b:[I

    return-object v0
.end method

.method public final b()[I
    .locals 1

    .prologue
    .line 229
    iget-object v0, p0, Lorg/spongycastle/math/ntru/polynomial/SparseTernaryPolynomial;->c:[I

    return-object v0
.end method

.method public final c()I
    .locals 1

    .prologue
    .line 266
    iget v0, p0, Lorg/spongycastle/math/ntru/polynomial/SparseTernaryPolynomial;->a:I

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 293
    if-ne p0, p1, :cond_1

    .line 318
    :cond_0
    :goto_0
    return v0

    .line 297
    :cond_1
    if-nez p1, :cond_2

    move v0, v1

    .line 299
    goto :goto_0

    .line 301
    :cond_2
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_3

    move v0, v1

    .line 303
    goto :goto_0

    .line 305
    :cond_3
    check-cast p1, Lorg/spongycastle/math/ntru/polynomial/SparseTernaryPolynomial;

    .line 306
    iget v2, p0, Lorg/spongycastle/math/ntru/polynomial/SparseTernaryPolynomial;->a:I

    iget v3, p1, Lorg/spongycastle/math/ntru/polynomial/SparseTernaryPolynomial;->a:I

    if-eq v2, v3, :cond_4

    move v0, v1

    .line 308
    goto :goto_0

    .line 310
    :cond_4
    iget-object v2, p0, Lorg/spongycastle/math/ntru/polynomial/SparseTernaryPolynomial;->c:[I

    iget-object v3, p1, Lorg/spongycastle/math/ntru/polynomial/SparseTernaryPolynomial;->c:[I

    invoke-static {v2, v3}, Lorg/spongycastle/util/Arrays;->a([I[I)Z

    move-result v2

    if-nez v2, :cond_5

    move v0, v1

    .line 312
    goto :goto_0

    .line 314
    :cond_5
    iget-object v2, p0, Lorg/spongycastle/math/ntru/polynomial/SparseTernaryPolynomial;->b:[I

    iget-object v3, p1, Lorg/spongycastle/math/ntru/polynomial/SparseTernaryPolynomial;->b:[I

    invoke-static {v2, v3}, Lorg/spongycastle/util/Arrays;->a([I[I)Z

    move-result v2

    if-nez v2, :cond_0

    move v0, v1

    .line 316
    goto :goto_0
.end method

.method public hashCode()I
    .locals 2

    .prologue
    .line 283
    iget v0, p0, Lorg/spongycastle/math/ntru/polynomial/SparseTernaryPolynomial;->a:I

    add-int/lit8 v0, v0, 0x1f

    .line 286
    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lorg/spongycastle/math/ntru/polynomial/SparseTernaryPolynomial;->c:[I

    invoke-static {v1}, Lorg/spongycastle/util/Arrays;->a([I)I

    move-result v1

    add-int/2addr v0, v1

    .line 287
    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lorg/spongycastle/math/ntru/polynomial/SparseTernaryPolynomial;->b:[I

    invoke-static {v1}, Lorg/spongycastle/util/Arrays;->a([I)I

    move-result v1

    add-int/2addr v0, v1

    .line 288
    return v0
.end method
