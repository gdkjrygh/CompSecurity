.class public Lorg/spongycastle/math/ntru/polynomial/LongPolynomial5;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:[J

.field private b:I


# direct methods
.method public constructor <init>(Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;)V
    .locals 10

    .prologue
    const/4 v1, 0x0

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    iget-object v0, p1, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;->a:[I

    array-length v0, v0

    iput v0, p0, Lorg/spongycastle/math/ntru/polynomial/LongPolynomial5;->b:I

    .line 24
    iget v0, p0, Lorg/spongycastle/math/ntru/polynomial/LongPolynomial5;->b:I

    add-int/lit8 v0, v0, 0x4

    div-int/lit8 v0, v0, 0x5

    new-array v0, v0, [J

    iput-object v0, p0, Lorg/spongycastle/math/ntru/polynomial/LongPolynomial5;->a:[J

    move v0, v1

    move v2, v1

    move v3, v1

    .line 27
    :goto_0
    iget v4, p0, Lorg/spongycastle/math/ntru/polynomial/LongPolynomial5;->b:I

    if-ge v0, v4, :cond_1

    .line 29
    iget-object v4, p0, Lorg/spongycastle/math/ntru/polynomial/LongPolynomial5;->a:[J

    aget-wide v6, v4, v3

    iget-object v5, p1, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;->a:[I

    aget v5, v5, v0

    int-to-long v8, v5

    shl-long/2addr v8, v2

    or-long/2addr v6, v8

    aput-wide v6, v4, v3

    .line 30
    add-int/lit8 v2, v2, 0xc

    .line 31
    const/16 v4, 0x3c

    if-lt v2, v4, :cond_0

    .line 34
    add-int/lit8 v3, v3, 0x1

    move v2, v1

    .line 27
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 37
    :cond_1
    return-void
.end method

.method private constructor <init>([JI)V
    .locals 0

    .prologue
    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    iput-object p1, p0, Lorg/spongycastle/math/ntru/polynomial/LongPolynomial5;->a:[J

    .line 42
    iput p2, p0, Lorg/spongycastle/math/ntru/polynomial/LongPolynomial5;->b:I

    .line 43
    return-void
.end method


# virtual methods
.method public final a()Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;
    .locals 10

    .prologue
    const/4 v1, 0x0

    .line 134
    iget v0, p0, Lorg/spongycastle/math/ntru/polynomial/LongPolynomial5;->b:I

    new-array v4, v0, [I

    move v0, v1

    move v2, v1

    move v3, v1

    .line 137
    :goto_0
    iget v5, p0, Lorg/spongycastle/math/ntru/polynomial/LongPolynomial5;->b:I

    if-ge v0, v5, :cond_1

    .line 139
    iget-object v5, p0, Lorg/spongycastle/math/ntru/polynomial/LongPolynomial5;->a:[J

    aget-wide v6, v5, v3

    shr-long/2addr v6, v2

    const-wide/16 v8, 0x7ff

    and-long/2addr v6, v8

    long-to-int v5, v6

    aput v5, v4, v0

    .line 140
    add-int/lit8 v2, v2, 0xc

    .line 141
    const/16 v5, 0x3c

    if-lt v2, v5, :cond_0

    .line 144
    add-int/lit8 v3, v3, 0x1

    move v2, v1

    .line 137
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 147
    :cond_1
    new-instance v0, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;

    invoke-direct {v0, v4}, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;-><init>([I)V

    return-object v0
.end method

.method public final a(Lorg/spongycastle/math/ntru/polynomial/TernaryPolynomial;)Lorg/spongycastle/math/ntru/polynomial/LongPolynomial5;
    .locals 18

    .prologue
    .line 50
    const/4 v2, 0x5

    move-object/from16 v0, p0

    iget-object v3, v0, Lorg/spongycastle/math/ntru/polynomial/LongPolynomial5;->a:[J

    array-length v3, v3

    invoke-interface/range {p1 .. p1}, Lorg/spongycastle/math/ntru/polynomial/TernaryPolynomial;->c()I

    move-result v4

    add-int/lit8 v4, v4, 0x4

    div-int/lit8 v4, v4, 0x5

    add-int/2addr v3, v4

    add-int/lit8 v3, v3, -0x1

    filled-new-array {v2, v3}, [I

    move-result-object v2

    sget-object v3, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    invoke-static {v3, v2}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [[J

    .line 53
    invoke-interface/range {p1 .. p1}, Lorg/spongycastle/math/ntru/polynomial/TernaryPolynomial;->a()[I

    move-result-object v6

    .line 54
    const/4 v3, 0x0

    :goto_0
    array-length v4, v6

    if-eq v3, v4, :cond_1

    .line 56
    aget v4, v6, v3

    .line 57
    div-int/lit8 v5, v4, 0x5

    .line 58
    mul-int/lit8 v7, v5, 0x5

    sub-int v7, v4, v7

    .line 59
    const/4 v4, 0x0

    :goto_1
    move-object/from16 v0, p0

    iget-object v8, v0, Lorg/spongycastle/math/ntru/polynomial/LongPolynomial5;->a:[J

    array-length v8, v8

    if-ge v4, v8, :cond_0

    .line 61
    aget-object v8, v2, v7

    aget-object v9, v2, v7

    aget-wide v10, v9, v5

    move-object/from16 v0, p0

    iget-object v9, v0, Lorg/spongycastle/math/ntru/polynomial/LongPolynomial5;->a:[J

    aget-wide v12, v9, v4

    add-long/2addr v10, v12

    const-wide v12, 0x7ff7ff7ff7ff7ffL    # 3.726599941343702E-270

    and-long/2addr v10, v12

    aput-wide v10, v8, v5

    .line 62
    add-int/lit8 v5, v5, 0x1

    .line 59
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 54
    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 67
    :cond_1
    invoke-interface/range {p1 .. p1}, Lorg/spongycastle/math/ntru/polynomial/TernaryPolynomial;->b()[I

    move-result-object v6

    .line 68
    const/4 v3, 0x0

    :goto_2
    array-length v4, v6

    if-eq v3, v4, :cond_3

    .line 70
    aget v4, v6, v3

    .line 71
    div-int/lit8 v5, v4, 0x5

    .line 72
    mul-int/lit8 v7, v5, 0x5

    sub-int v7, v4, v7

    .line 73
    const/4 v4, 0x0

    :goto_3
    move-object/from16 v0, p0

    iget-object v8, v0, Lorg/spongycastle/math/ntru/polynomial/LongPolynomial5;->a:[J

    array-length v8, v8

    if-ge v4, v8, :cond_2

    .line 75
    aget-object v8, v2, v7

    const-wide v10, 0x800800800800800L

    aget-object v9, v2, v7

    aget-wide v12, v9, v5

    add-long/2addr v10, v12

    move-object/from16 v0, p0

    iget-object v9, v0, Lorg/spongycastle/math/ntru/polynomial/LongPolynomial5;->a:[J

    aget-wide v12, v9, v4

    sub-long/2addr v10, v12

    const-wide v12, 0x7ff7ff7ff7ff7ffL    # 3.726599941343702E-270

    and-long/2addr v10, v12

    aput-wide v10, v8, v5

    .line 76
    add-int/lit8 v5, v5, 0x1

    .line 73
    add-int/lit8 v4, v4, 0x1

    goto :goto_3

    .line 68
    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    .line 81
    :cond_3
    const/4 v3, 0x0

    aget-object v3, v2, v3

    const/4 v4, 0x0

    aget-object v4, v2, v4

    array-length v4, v4

    add-int/lit8 v4, v4, 0x1

    invoke-static {v3, v4}, Lorg/spongycastle/util/Arrays;->a([JI)[J

    move-result-object v6

    .line 82
    const/4 v3, 0x1

    :goto_4
    const/4 v4, 0x4

    if-gt v3, v4, :cond_5

    .line 84
    mul-int/lit8 v5, v3, 0xc

    .line 85
    rsub-int/lit8 v7, v5, 0x3c

    .line 86
    const-wide/16 v8, 0x1

    shl-long/2addr v8, v7

    const-wide/16 v10, 0x1

    sub-long/2addr v8, v10

    .line 87
    aget-object v4, v2, v3

    array-length v10, v4

    .line 88
    const/4 v4, 0x0

    :goto_5
    if-ge v4, v10, :cond_4

    .line 91
    aget-object v11, v2, v3

    aget-wide v12, v11, v4

    shr-long/2addr v12, v7

    .line 92
    aget-object v11, v2, v3

    aget-wide v14, v11, v4

    and-long/2addr v14, v8

    .line 94
    aget-wide v16, v6, v4

    shl-long/2addr v14, v5

    add-long v14, v14, v16

    const-wide v16, 0x7ff7ff7ff7ff7ffL    # 3.726599941343702E-270

    and-long v14, v14, v16

    aput-wide v14, v6, v4

    .line 95
    add-int/lit8 v11, v4, 0x1

    .line 96
    aget-wide v14, v6, v11

    add-long/2addr v12, v14

    const-wide v14, 0x7ff7ff7ff7ff7ffL    # 3.726599941343702E-270

    and-long/2addr v12, v14

    aput-wide v12, v6, v11

    .line 88
    add-int/lit8 v4, v4, 0x1

    goto :goto_5

    .line 82
    :cond_4
    add-int/lit8 v3, v3, 0x1

    goto :goto_4

    .line 101
    :cond_5
    move-object/from16 v0, p0

    iget v2, v0, Lorg/spongycastle/math/ntru/polynomial/LongPolynomial5;->b:I

    rem-int/lit8 v2, v2, 0x5

    mul-int/lit8 v7, v2, 0xc

    .line 102
    move-object/from16 v0, p0

    iget-object v2, v0, Lorg/spongycastle/math/ntru/polynomial/LongPolynomial5;->a:[J

    array-length v2, v2

    add-int/lit8 v2, v2, -0x1

    :goto_6
    array-length v3, v6

    if-ge v2, v3, :cond_9

    .line 106
    move-object/from16 v0, p0

    iget-object v3, v0, Lorg/spongycastle/math/ntru/polynomial/LongPolynomial5;->a:[J

    array-length v3, v3

    add-int/lit8 v3, v3, -0x1

    if-ne v2, v3, :cond_8

    .line 108
    move-object/from16 v0, p0

    iget v3, v0, Lorg/spongycastle/math/ntru/polynomial/LongPolynomial5;->b:I

    const/4 v4, 0x5

    if-ne v3, v4, :cond_7

    const-wide/16 v4, 0x0

    .line 109
    :goto_7
    const/4 v3, 0x0

    .line 117
    :goto_8
    div-int/lit8 v8, v3, 0x5

    .line 118
    mul-int/lit8 v9, v8, 0x5

    sub-int/2addr v3, v9

    .line 119
    mul-int/lit8 v9, v3, 0xc

    shl-long v10, v4, v9

    .line 120
    rsub-int/lit8 v3, v3, 0x5

    mul-int/lit8 v3, v3, 0xc

    shr-long/2addr v4, v3

    .line 121
    aget-wide v12, v6, v8

    add-long/2addr v10, v12

    const-wide v12, 0x7ff7ff7ff7ff7ffL    # 3.726599941343702E-270

    and-long/2addr v10, v12

    aput-wide v10, v6, v8

    .line 122
    add-int/lit8 v3, v8, 0x1

    .line 123
    move-object/from16 v0, p0

    iget-object v8, v0, Lorg/spongycastle/math/ntru/polynomial/LongPolynomial5;->a:[J

    array-length v8, v8

    if-ge v3, v8, :cond_6

    .line 125
    aget-wide v8, v6, v3

    add-long/2addr v4, v8

    const-wide v8, 0x7ff7ff7ff7ff7ffL    # 3.726599941343702E-270

    and-long/2addr v4, v8

    aput-wide v4, v6, v3

    .line 102
    :cond_6
    add-int/lit8 v2, v2, 0x1

    goto :goto_6

    .line 108
    :cond_7
    aget-wide v4, v6, v2

    shr-long/2addr v4, v7

    goto :goto_7

    .line 113
    :cond_8
    aget-wide v4, v6, v2

    .line 114
    mul-int/lit8 v3, v2, 0x5

    move-object/from16 v0, p0

    iget v8, v0, Lorg/spongycastle/math/ntru/polynomial/LongPolynomial5;->b:I

    sub-int/2addr v3, v8

    goto :goto_8

    .line 129
    :cond_9
    new-instance v2, Lorg/spongycastle/math/ntru/polynomial/LongPolynomial5;

    move-object/from16 v0, p0

    iget v3, v0, Lorg/spongycastle/math/ntru/polynomial/LongPolynomial5;->b:I

    invoke-direct {v2, v6, v3}, Lorg/spongycastle/math/ntru/polynomial/LongPolynomial5;-><init>([JI)V

    return-object v2
.end method
