.class final Lorg/spongycastle/math/ec/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:[I


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .prologue
    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    new-array v0, p1, [I

    iput-object v0, p0, Lorg/spongycastle/math/ec/c;->a:[I

    .line 16
    return-void
.end method

.method public constructor <init>(Ljava/math/BigInteger;I)V
    .locals 8

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    invoke-virtual {p1}, Ljava/math/BigInteger;->signum()I

    move-result v2

    const/4 v3, -0x1

    if-ne v2, v3, :cond_0

    .line 32
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Only positive Integers allowed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 34
    :cond_0
    sget-object v2, Lorg/spongycastle/math/ec/ECConstants;->f:Ljava/math/BigInteger;

    invoke-virtual {p1, v2}, Ljava/math/BigInteger;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 36
    new-array v0, v0, [I

    aput v1, v0, v1

    iput-object v0, p0, Lorg/spongycastle/math/ec/c;->a:[I

    .line 94
    :cond_1
    return-void

    .line 40
    :cond_2
    invoke-virtual {p1}, Ljava/math/BigInteger;->toByteArray()[B

    move-result-object v5

    .line 41
    array-length v2, v5

    .line 43
    aget-byte v3, v5, v1

    if-nez v3, :cond_9

    .line 47
    add-int/lit8 v2, v2, -0x1

    .line 50
    :goto_0
    add-int/lit8 v3, v2, 0x3

    div-int/lit8 v3, v3, 0x4

    .line 51
    if-ge v3, p2, :cond_4

    .line 53
    new-array v4, p2, [I

    iput-object v4, p0, Lorg/spongycastle/math/ec/c;->a:[I

    .line 60
    :goto_1
    add-int/lit8 v3, v3, -0x1

    .line 61
    rem-int/lit8 v2, v2, 0x4

    add-int v6, v2, v0

    .line 64
    if-ge v0, v6, :cond_8

    move v2, v0

    move v4, v1

    .line 66
    :goto_2
    if-ge v2, v6, :cond_5

    .line 68
    shl-int/lit8 v4, v4, 0x8

    .line 69
    aget-byte v0, v5, v2

    .line 70
    if-gez v0, :cond_3

    .line 72
    add-int/lit16 v0, v0, 0x100

    .line 74
    :cond_3
    or-int/2addr v0, v4

    .line 66
    add-int/lit8 v2, v2, 0x1

    move v4, v0

    goto :goto_2

    .line 57
    :cond_4
    new-array v4, v3, [I

    iput-object v4, p0, Lorg/spongycastle/math/ec/c;->a:[I

    goto :goto_1

    .line 76
    :cond_5
    iget-object v6, p0, Lorg/spongycastle/math/ec/c;->a:[I

    add-int/lit8 v0, v3, -0x1

    aput v4, v6, v3

    move v4, v0

    move v0, v2

    .line 79
    :goto_3
    if-ltz v4, :cond_1

    move v2, v1

    move v3, v1

    .line 82
    :goto_4
    const/4 v6, 0x4

    if-ge v3, v6, :cond_7

    .line 84
    shl-int/lit8 v6, v2, 0x8

    .line 85
    add-int/lit8 v2, v0, 0x1

    aget-byte v0, v5, v0

    .line 86
    if-gez v0, :cond_6

    .line 88
    add-int/lit16 v0, v0, 0x100

    .line 90
    :cond_6
    or-int/2addr v0, v6

    .line 82
    add-int/lit8 v3, v3, 0x1

    move v7, v2

    move v2, v0

    move v0, v7

    goto :goto_4

    .line 92
    :cond_7
    iget-object v3, p0, Lorg/spongycastle/math/ec/c;->a:[I

    aput v2, v3, v4

    .line 79
    add-int/lit8 v2, v4, -0x1

    move v4, v2

    goto :goto_3

    :cond_8
    move v4, v3

    goto :goto_3

    :cond_9
    move v0, v1

    goto :goto_0
.end method

.method private constructor <init>([I)V
    .locals 0

    .prologue
    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    iput-object p1, p0, Lorg/spongycastle/math/ec/c;->a:[I

    .line 21
    return-void
.end method

.method private d()I
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 104
    iget-object v0, p0, Lorg/spongycastle/math/ec/c;->a:[I

    array-length v0, v0

    .line 106
    if-gtz v0, :cond_0

    move v0, v1

    .line 129
    :goto_0
    return v0

    .line 112
    :cond_0
    iget-object v2, p0, Lorg/spongycastle/math/ec/c;->a:[I

    aget v2, v2, v1

    if-eqz v2, :cond_2

    .line 114
    :cond_1
    iget-object v1, p0, Lorg/spongycastle/math/ec/c;->a:[I

    add-int/lit8 v0, v0, -0x1

    aget v1, v1, v0

    if-eqz v1, :cond_1

    .line 117
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 122
    :cond_2
    iget-object v2, p0, Lorg/spongycastle/math/ec/c;->a:[I

    add-int/lit8 v0, v0, -0x1

    aget v2, v2, v0

    if-eqz v2, :cond_3

    .line 124
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 127
    :cond_3
    if-gtz v0, :cond_2

    move v0, v1

    .line 129
    goto :goto_0
.end method

.method private d(I)[I
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 176
    new-array v1, p1, [I

    .line 177
    iget-object v0, p0, Lorg/spongycastle/math/ec/c;->a:[I

    array-length v0, v0

    .line 178
    if-ge v0, p1, :cond_0

    move p1, v0

    .line 179
    :cond_0
    iget-object v0, p0, Lorg/spongycastle/math/ec/c;->a:[I

    invoke-static {v0, v2, v1, v2, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 180
    return-object v1
.end method

.method private e(I)V
    .locals 4

    .prologue
    .line 324
    shr-int/lit8 v0, p1, 0x5

    .line 326
    and-int/lit8 v1, p1, 0x1f

    .line 327
    const/4 v2, 0x1

    shl-int v1, v2, v1

    .line 328
    iget-object v2, p0, Lorg/spongycastle/math/ec/c;->a:[I

    aget v3, v2, v0

    xor-int/2addr v1, v3

    aput v1, v2, v0

    .line 329
    return-void
.end method


# virtual methods
.method public final a(I)Lorg/spongycastle/math/ec/c;
    .locals 7

    .prologue
    const/4 v4, 0x0

    .line 260
    invoke-direct {p0}, Lorg/spongycastle/math/ec/c;->d()I

    move-result v1

    .line 261
    if-nez v1, :cond_1

    .line 287
    :cond_0
    :goto_0
    return-object p0

    .line 266
    :cond_1
    if-eqz p1, :cond_0

    .line 271
    const/16 v0, 0x1f

    if-le p1, v0, :cond_2

    .line 273
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "shiftLeft() for max 31 bits , "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "bit shift is not possible"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 277
    :cond_2
    add-int/lit8 v0, v1, 0x1

    new-array v2, v0, [I

    .line 279
    rsub-int/lit8 v3, p1, 0x20

    .line 280
    iget-object v0, p0, Lorg/spongycastle/math/ec/c;->a:[I

    aget v0, v0, v4

    shl-int/2addr v0, p1

    aput v0, v2, v4

    .line 281
    const/4 v0, 0x1

    :goto_1
    if-ge v0, v1, :cond_3

    .line 283
    iget-object v4, p0, Lorg/spongycastle/math/ec/c;->a:[I

    aget v4, v4, v0

    shl-int/2addr v4, p1

    iget-object v5, p0, Lorg/spongycastle/math/ec/c;->a:[I

    add-int/lit8 v6, v0, -0x1

    aget v5, v5, v6

    ushr-int/2addr v5, v3

    or-int/2addr v4, v5

    aput v4, v2, v0

    .line 281
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 285
    :cond_3
    iget-object v0, p0, Lorg/spongycastle/math/ec/c;->a:[I

    add-int/lit8 v4, v1, -0x1

    aget v0, v0, v4

    ushr-int/2addr v0, v3

    aput v0, v2, v1

    .line 287
    new-instance p0, Lorg/spongycastle/math/ec/c;

    invoke-direct {p0, v2}, Lorg/spongycastle/math/ec/c;-><init>([I)V

    goto :goto_0
.end method

.method public final a(I[I)V
    .locals 5

    .prologue
    const/4 v1, 0x1

    .line 399
    add-int v0, p1, p1

    add-int/lit8 v0, v0, -0x2

    move v2, v0

    :goto_0
    if-lt v2, p1, :cond_2

    .line 401
    shr-int/lit8 v0, v2, 0x5

    and-int/lit8 v3, v2, 0x1f

    shl-int v3, v1, v3

    iget-object v4, p0, Lorg/spongycastle/math/ec/c;->a:[I

    aget v0, v4, v0

    and-int/2addr v0, v3

    if-eqz v0, :cond_0

    move v0, v1

    :goto_1
    if-eqz v0, :cond_1

    .line 403
    sub-int v3, v2, p1

    .line 404
    invoke-direct {p0, v3}, Lorg/spongycastle/math/ec/c;->e(I)V

    .line 405
    invoke-direct {p0, v2}, Lorg/spongycastle/math/ec/c;->e(I)V

    .line 406
    const/4 v0, 0x3

    .line 407
    :goto_2
    add-int/lit8 v0, v0, -0x1

    if-ltz v0, :cond_1

    .line 409
    aget v4, p2, v0

    add-int/2addr v4, v3

    invoke-direct {p0, v4}, Lorg/spongycastle/math/ec/c;->e(I)V

    goto :goto_2

    .line 401
    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    .line 399
    :cond_1
    add-int/lit8 v0, v2, -0x1

    move v2, v0

    goto :goto_0

    .line 413
    :cond_2
    add-int/lit8 v0, p1, 0x1f

    shr-int/lit8 v0, v0, 0x5

    invoke-direct {p0, v0}, Lorg/spongycastle/math/ec/c;->d(I)[I

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/math/ec/c;->a:[I

    .line 414
    return-void
.end method

.method public final a(Lorg/spongycastle/math/ec/c;I)V
    .locals 6

    .prologue
    .line 292
    invoke-direct {p1}, Lorg/spongycastle/math/ec/c;->d()I

    move-result v1

    .line 293
    add-int v0, v1, p2

    .line 294
    iget-object v2, p0, Lorg/spongycastle/math/ec/c;->a:[I

    array-length v2, v2

    if-le v0, v2, :cond_0

    .line 296
    invoke-direct {p0, v0}, Lorg/spongycastle/math/ec/c;->d(I)[I

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/math/ec/c;->a:[I

    .line 300
    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-ge v0, v1, :cond_1

    .line 302
    iget-object v2, p0, Lorg/spongycastle/math/ec/c;->a:[I

    add-int v3, v0, p2

    aget v4, v2, v3

    iget-object v5, p1, Lorg/spongycastle/math/ec/c;->a:[I

    aget v5, v5, v0

    xor-int/2addr v4, v5

    aput v4, v2, v3

    .line 300
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 304
    :cond_1
    return-void
.end method

.method public final a()Z
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 98
    iget-object v1, p0, Lorg/spongycastle/math/ec/c;->a:[I

    array-length v1, v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lorg/spongycastle/math/ec/c;->a:[I

    aget v1, v1, v0

    if-nez v1, :cond_1

    invoke-direct {p0}, Lorg/spongycastle/math/ec/c;->d()I

    move-result v1

    if-nez v1, :cond_1

    :cond_0
    const/4 v0, 0x1

    :cond_1
    return v0
.end method

.method public final b()I
    .locals 4

    .prologue
    .line 135
    invoke-direct {p0}, Lorg/spongycastle/math/ec/c;->d()I

    move-result v0

    .line 136
    if-nez v0, :cond_1

    .line 138
    const/4 v0, 0x0

    .line 171
    :cond_0
    return v0

    .line 141
    :cond_1
    add-int/lit8 v1, v0, -0x1

    .line 142
    iget-object v0, p0, Lorg/spongycastle/math/ec/c;->a:[I

    aget v0, v0, v1

    .line 143
    shl-int/lit8 v1, v1, 0x5

    add-int/lit8 v1, v1, 0x1

    .line 146
    const/high16 v2, -0x10000

    and-int/2addr v2, v0

    if-eqz v2, :cond_3

    .line 148
    const/high16 v2, -0x1000000

    and-int/2addr v2, v0

    if-eqz v2, :cond_2

    .line 150
    add-int/lit8 v1, v1, 0x18

    .line 151
    ushr-int/lit8 v0, v0, 0x18

    move v3, v0

    move v0, v1

    move v1, v3

    .line 165
    :goto_0
    const/4 v2, 0x1

    if-eq v1, v2, :cond_0

    .line 167
    add-int/lit8 v2, v0, 0x1

    .line 168
    ushr-int/lit8 v0, v1, 0x1

    move v1, v0

    move v0, v2

    goto :goto_0

    .line 155
    :cond_2
    add-int/lit8 v1, v1, 0x10

    .line 156
    ushr-int/lit8 v0, v0, 0x10

    move v3, v0

    move v0, v1

    move v1, v3

    goto :goto_0

    .line 159
    :cond_3
    const/16 v2, 0xff

    if-le v0, v2, :cond_4

    .line 161
    add-int/lit8 v1, v1, 0x8

    .line 162
    ushr-int/lit8 v0, v0, 0x8

    move v3, v0

    move v0, v1

    move v1, v3

    goto :goto_0

    :cond_4
    move v3, v0

    move v0, v1

    move v1, v3

    goto :goto_0
.end method

.method public final b(Lorg/spongycastle/math/ec/c;I)Lorg/spongycastle/math/ec/c;
    .locals 13

    .prologue
    const/4 v2, 0x1

    const/4 v3, 0x0

    .line 344
    add-int/lit8 v0, p2, 0x1f

    shr-int/lit8 v8, v0, 0x5

    .line 345
    iget-object v0, p0, Lorg/spongycastle/math/ec/c;->a:[I

    array-length v0, v0

    if-ge v0, v8, :cond_0

    .line 347
    invoke-direct {p0, v8}, Lorg/spongycastle/math/ec/c;->d(I)[I

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/math/ec/c;->a:[I

    .line 350
    :cond_0
    new-instance v9, Lorg/spongycastle/math/ec/c;

    iget-object v0, p1, Lorg/spongycastle/math/ec/c;->a:[I

    array-length v0, v0

    add-int/lit8 v0, v0, 0x1

    invoke-direct {p1, v0}, Lorg/spongycastle/math/ec/c;->d(I)[I

    move-result-object v0

    invoke-direct {v9, v0}, Lorg/spongycastle/math/ec/c;-><init>([I)V

    .line 351
    new-instance v10, Lorg/spongycastle/math/ec/c;

    add-int v0, p2, p2

    add-int/lit8 v0, v0, 0x1f

    shr-int/lit8 v0, v0, 0x5

    invoke-direct {v10, v0}, Lorg/spongycastle/math/ec/c;-><init>(I)V

    move v6, v3

    move v1, v2

    .line 354
    :goto_0
    const/16 v0, 0x20

    if-ge v6, v0, :cond_7

    move v0, v3

    .line 356
    :goto_1
    if-ge v0, v8, :cond_2

    .line 358
    iget-object v4, p0, Lorg/spongycastle/math/ec/c;->a:[I

    aget v4, v4, v0

    and-int/2addr v4, v1

    if-eqz v4, :cond_1

    .line 361
    invoke-virtual {v10, v9, v0}, Lorg/spongycastle/math/ec/c;->a(Lorg/spongycastle/math/ec/c;I)V

    .line 356
    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 364
    :cond_2
    shl-int/lit8 v7, v1, 0x1

    .line 365
    invoke-direct {v9}, Lorg/spongycastle/math/ec/c;->d()I

    move-result v0

    if-eqz v0, :cond_6

    iget-object v1, v9, Lorg/spongycastle/math/ec/c;->a:[I

    add-int/lit8 v4, v0, -0x1

    aget v1, v1, v4

    if-gez v1, :cond_3

    add-int/lit8 v0, v0, 0x1

    iget-object v1, v9, Lorg/spongycastle/math/ec/c;->a:[I

    array-length v1, v1

    if-le v0, v1, :cond_3

    iget-object v1, v9, Lorg/spongycastle/math/ec/c;->a:[I

    array-length v1, v1

    add-int/lit8 v1, v1, 0x1

    invoke-direct {v9, v1}, Lorg/spongycastle/math/ec/c;->d(I)[I

    move-result-object v1

    iput-object v1, v9, Lorg/spongycastle/math/ec/c;->a:[I

    :cond_3
    move v4, v3

    move v5, v3

    :goto_2
    if-ge v4, v0, :cond_6

    iget-object v1, v9, Lorg/spongycastle/math/ec/c;->a:[I

    aget v1, v1, v4

    if-gez v1, :cond_5

    move v1, v2

    :goto_3
    iget-object v11, v9, Lorg/spongycastle/math/ec/c;->a:[I

    aget v12, v11, v4

    shl-int/lit8 v12, v12, 0x1

    aput v12, v11, v4

    if-eqz v5, :cond_4

    iget-object v5, v9, Lorg/spongycastle/math/ec/c;->a:[I

    aget v11, v5, v4

    or-int/lit8 v11, v11, 0x1

    aput v11, v5, v4

    :cond_4
    add-int/lit8 v4, v4, 0x1

    move v5, v1

    goto :goto_2

    :cond_5
    move v1, v3

    goto :goto_3

    .line 354
    :cond_6
    add-int/lit8 v0, v6, 0x1

    move v6, v0

    move v1, v7

    goto :goto_0

    .line 367
    :cond_7
    return-object v10
.end method

.method public final b(I)V
    .locals 4

    .prologue
    .line 334
    shr-int/lit8 v0, p1, 0x5

    .line 336
    and-int/lit8 v1, p1, 0x1f

    .line 337
    const/4 v2, 0x1

    shl-int v1, v2, v1

    .line 338
    iget-object v2, p0, Lorg/spongycastle/math/ec/c;->a:[I

    aget v3, v2, v0

    or-int/2addr v1, v3

    aput v1, v2, v0

    .line 339
    return-void
.end method

.method public final c()Ljava/math/BigInteger;
    .locals 10

    .prologue
    const/4 v4, 0x3

    const/4 v1, 0x1

    const/4 v3, 0x0

    .line 185
    invoke-direct {p0}, Lorg/spongycastle/math/ec/c;->d()I

    move-result v6

    .line 186
    if-nez v6, :cond_0

    .line 188
    sget-object v0, Lorg/spongycastle/math/ec/ECConstants;->f:Ljava/math/BigInteger;

    .line 220
    :goto_0
    return-object v0

    .line 191
    :cond_0
    iget-object v0, p0, Lorg/spongycastle/math/ec/c;->a:[I

    add-int/lit8 v2, v6, -0x1

    aget v7, v0, v2

    .line 192
    const/4 v0, 0x4

    new-array v8, v0, [B

    move v5, v4

    move v0, v3

    move v2, v3

    .line 195
    :goto_1
    if-ltz v5, :cond_3

    .line 197
    mul-int/lit8 v9, v5, 0x8

    ushr-int v9, v7, v9

    int-to-byte v9, v9

    .line 198
    if-nez v0, :cond_1

    if-eqz v9, :cond_2

    .line 201
    :cond_1
    add-int/lit8 v0, v2, 0x1

    aput-byte v9, v8, v2

    move v2, v0

    move v0, v1

    .line 195
    :cond_2
    add-int/lit8 v5, v5, -0x1

    goto :goto_1

    .line 205
    :cond_3
    add-int/lit8 v0, v6, -0x1

    mul-int/lit8 v0, v0, 0x4

    add-int/2addr v0, v2

    .line 206
    new-array v7, v0, [B

    move v0, v3

    .line 207
    :goto_2
    if-ge v0, v2, :cond_4

    .line 209
    aget-byte v3, v8, v0

    aput-byte v3, v7, v0

    .line 207
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    .line 213
    :cond_4
    add-int/lit8 v0, v6, -0x2

    move v5, v0

    move v0, v2

    :goto_3
    if-ltz v5, :cond_6

    move v3, v4

    .line 215
    :goto_4
    if-ltz v3, :cond_5

    .line 217
    add-int/lit8 v2, v0, 0x1

    iget-object v6, p0, Lorg/spongycastle/math/ec/c;->a:[I

    aget v6, v6, v5

    mul-int/lit8 v8, v3, 0x8

    ushr-int/2addr v6, v8

    int-to-byte v6, v6

    aput-byte v6, v7, v0

    .line 215
    add-int/lit8 v0, v3, -0x1

    move v3, v0

    move v0, v2

    goto :goto_4

    .line 213
    :cond_5
    add-int/lit8 v2, v5, -0x1

    move v5, v2

    goto :goto_3

    .line 220
    :cond_6
    new-instance v0, Ljava/math/BigInteger;

    invoke-direct {v0, v1, v7}, Ljava/math/BigInteger;-><init>(I[B)V

    goto :goto_0
.end method

.method public final c(I)Lorg/spongycastle/math/ec/c;
    .locals 10

    .prologue
    const/4 v9, 0x4

    const/4 v1, 0x0

    .line 419
    const/16 v0, 0x10

    new-array v4, v0, [I

    fill-array-data v4, :array_0

    .line 422
    add-int/lit8 v0, p1, 0x1f

    shr-int/lit8 v5, v0, 0x5

    .line 423
    iget-object v0, p0, Lorg/spongycastle/math/ec/c;->a:[I

    array-length v0, v0

    if-ge v0, v5, :cond_0

    .line 425
    invoke-direct {p0, v5}, Lorg/spongycastle/math/ec/c;->d(I)[I

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/math/ec/c;->a:[I

    .line 428
    :cond_0
    new-instance v6, Lorg/spongycastle/math/ec/c;

    add-int v0, v5, v5

    invoke-direct {v6, v0}, Lorg/spongycastle/math/ec/c;-><init>(I)V

    move v3, v1

    .line 431
    :goto_0
    if-ge v3, v5, :cond_3

    move v0, v1

    move v2, v1

    .line 434
    :goto_1
    if-ge v0, v9, :cond_1

    .line 436
    ushr-int/lit8 v2, v2, 0x8

    .line 437
    iget-object v7, p0, Lorg/spongycastle/math/ec/c;->a:[I

    aget v7, v7, v3

    mul-int/lit8 v8, v0, 0x4

    ushr-int/2addr v7, v8

    and-int/lit8 v7, v7, 0xf

    .line 438
    aget v7, v4, v7

    shl-int/lit8 v7, v7, 0x18

    .line 439
    or-int/2addr v2, v7

    .line 434
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 441
    :cond_1
    iget-object v0, v6, Lorg/spongycastle/math/ec/c;->a:[I

    add-int v7, v3, v3

    aput v2, v0, v7

    .line 444
    iget-object v0, p0, Lorg/spongycastle/math/ec/c;->a:[I

    aget v0, v0, v3

    ushr-int/lit8 v7, v0, 0x10

    move v0, v1

    move v2, v1

    .line 445
    :goto_2
    if-ge v0, v9, :cond_2

    .line 447
    ushr-int/lit8 v2, v2, 0x8

    .line 448
    mul-int/lit8 v8, v0, 0x4

    ushr-int v8, v7, v8

    and-int/lit8 v8, v8, 0xf

    .line 449
    aget v8, v4, v8

    shl-int/lit8 v8, v8, 0x18

    .line 450
    or-int/2addr v2, v8

    .line 445
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    .line 452
    :cond_2
    iget-object v0, v6, Lorg/spongycastle/math/ec/c;->a:[I

    add-int v7, v3, v3

    add-int/lit8 v7, v7, 0x1

    aput v2, v0, v7

    .line 431
    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto :goto_0

    .line 454
    :cond_3
    return-object v6

    .line 419
    :array_0
    .array-data 4
        0x0
        0x1
        0x4
        0x5
        0x10
        0x11
        0x14
        0x15
        0x40
        0x41
        0x44
        0x45
        0x50
        0x51
        0x54
        0x55
    .end array-data
.end method

.method public final clone()Ljava/lang/Object;
    .locals 2

    .prologue
    .line 492
    new-instance v0, Lorg/spongycastle/math/ec/c;

    iget-object v1, p0, Lorg/spongycastle/math/ec/c;->a:[I

    invoke-static {v1}, Lorg/spongycastle/util/Arrays;->b([I)[I

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/spongycastle/math/ec/c;-><init>([I)V

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 5

    .prologue
    const/4 v0, 0x0

    .line 459
    instance-of v1, p1, Lorg/spongycastle/math/ec/c;

    if-nez v1, :cond_1

    .line 476
    :cond_0
    :goto_0
    return v0

    .line 463
    :cond_1
    check-cast p1, Lorg/spongycastle/math/ec/c;

    .line 464
    invoke-direct {p0}, Lorg/spongycastle/math/ec/c;->d()I

    move-result v2

    .line 465
    invoke-direct {p1}, Lorg/spongycastle/math/ec/c;->d()I

    move-result v1

    if-ne v1, v2, :cond_0

    move v1, v0

    .line 469
    :goto_1
    if-ge v1, v2, :cond_2

    .line 471
    iget-object v3, p0, Lorg/spongycastle/math/ec/c;->a:[I

    aget v3, v3, v1

    iget-object v4, p1, Lorg/spongycastle/math/ec/c;->a:[I

    aget v4, v4, v1

    if-ne v3, v4, :cond_0

    .line 469
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 476
    :cond_2
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public final hashCode()I
    .locals 4

    .prologue
    .line 481
    invoke-direct {p0}, Lorg/spongycastle/math/ec/c;->d()I

    move-result v2

    .line 482
    const/4 v1, 0x1

    .line 483
    const/4 v0, 0x0

    :goto_0
    if-ge v0, v2, :cond_0

    .line 485
    mul-int/lit8 v1, v1, 0x1f

    iget-object v3, p0, Lorg/spongycastle/math/ec/c;->a:[I

    aget v3, v3, v0

    add-int/2addr v1, v3

    .line 483
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 487
    :cond_0
    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 6

    .prologue
    .line 497
    invoke-direct {p0}, Lorg/spongycastle/math/ec/c;->d()I

    move-result v0

    .line 498
    if-nez v0, :cond_0

    .line 500
    const-string v0, "0"

    .line 516
    :goto_0
    return-object v0

    .line 503
    :cond_0
    new-instance v3, Ljava/lang/StringBuffer;

    iget-object v1, p0, Lorg/spongycastle/math/ec/c;->a:[I

    add-int/lit8 v2, v0, -0x1

    aget v1, v1, v2

    invoke-static {v1}, Ljava/lang/Integer;->toBinaryString(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v3, v1}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    .line 505
    add-int/lit8 v0, v0, -0x2

    move v2, v0

    :goto_1
    if-ltz v2, :cond_2

    .line 507
    iget-object v0, p0, Lorg/spongycastle/math/ec/c;->a:[I

    aget v0, v0, v2

    invoke-static {v0}, Ljava/lang/Integer;->toBinaryString(I)Ljava/lang/String;

    move-result-object v1

    .line 510
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v0

    :goto_2
    const/16 v4, 0x8

    if-ge v0, v4, :cond_1

    .line 512
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "0"

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 510
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    .line 514
    :cond_1
    invoke-virtual {v3, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 505
    add-int/lit8 v0, v2, -0x1

    move v2, v0

    goto :goto_1

    .line 516
    :cond_2
    invoke-virtual {v3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method
