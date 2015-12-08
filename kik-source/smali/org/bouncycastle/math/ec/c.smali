.class final Lorg/bouncycastle/math/ec/c;
.super Ljava/lang/Object;


# instance fields
.field private a:[I


# direct methods
.method public constructor <init>(I)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-array v0, p1, [I

    iput-object v0, p0, Lorg/bouncycastle/math/ec/c;->a:[I

    return-void
.end method

.method public constructor <init>(Ljava/math/BigInteger;I)V
    .locals 8

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Ljava/math/BigInteger;->signum()I

    move-result v2

    const/4 v3, -0x1

    if-ne v2, v3, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Only positive Integers allowed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    sget-object v2, Lorg/bouncycastle/math/ec/ECConstants;->f:Ljava/math/BigInteger;

    invoke-virtual {p1, v2}, Ljava/math/BigInteger;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    new-array v0, v0, [I

    aput v1, v0, v1

    iput-object v0, p0, Lorg/bouncycastle/math/ec/c;->a:[I

    :cond_1
    return-void

    :cond_2
    invoke-virtual {p1}, Ljava/math/BigInteger;->toByteArray()[B

    move-result-object v5

    array-length v2, v5

    aget-byte v3, v5, v1

    if-nez v3, :cond_9

    add-int/lit8 v2, v2, -0x1

    :goto_0
    add-int/lit8 v3, v2, 0x3

    div-int/lit8 v3, v3, 0x4

    if-ge v3, p2, :cond_4

    new-array v4, p2, [I

    iput-object v4, p0, Lorg/bouncycastle/math/ec/c;->a:[I

    :goto_1
    add-int/lit8 v3, v3, -0x1

    rem-int/lit8 v2, v2, 0x4

    add-int v6, v2, v0

    if-ge v0, v6, :cond_8

    move v2, v0

    move v4, v1

    :goto_2
    if-ge v2, v6, :cond_5

    shl-int/lit8 v4, v4, 0x8

    aget-byte v0, v5, v2

    if-gez v0, :cond_3

    add-int/lit16 v0, v0, 0x100

    :cond_3
    or-int/2addr v0, v4

    add-int/lit8 v2, v2, 0x1

    move v4, v0

    goto :goto_2

    :cond_4
    new-array v4, v3, [I

    iput-object v4, p0, Lorg/bouncycastle/math/ec/c;->a:[I

    goto :goto_1

    :cond_5
    iget-object v6, p0, Lorg/bouncycastle/math/ec/c;->a:[I

    add-int/lit8 v0, v3, -0x1

    aput v4, v6, v3

    move v4, v0

    move v0, v2

    :goto_3
    if-ltz v4, :cond_1

    move v2, v1

    move v3, v1

    :goto_4
    const/4 v6, 0x4

    if-ge v3, v6, :cond_7

    shl-int/lit8 v6, v2, 0x8

    add-int/lit8 v2, v0, 0x1

    aget-byte v0, v5, v0

    if-gez v0, :cond_6

    add-int/lit16 v0, v0, 0x100

    :cond_6
    or-int/2addr v0, v6

    add-int/lit8 v3, v3, 0x1

    move v7, v2

    move v2, v0

    move v0, v7

    goto :goto_4

    :cond_7
    iget-object v3, p0, Lorg/bouncycastle/math/ec/c;->a:[I

    aput v2, v3, v4

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

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/bouncycastle/math/ec/c;->a:[I

    return-void
.end method

.method private d()I
    .locals 3

    const/4 v1, 0x0

    iget-object v0, p0, Lorg/bouncycastle/math/ec/c;->a:[I

    array-length v0, v0

    if-gtz v0, :cond_0

    move v0, v1

    :goto_0
    return v0

    :cond_0
    iget-object v2, p0, Lorg/bouncycastle/math/ec/c;->a:[I

    aget v2, v2, v1

    if-eqz v2, :cond_2

    :cond_1
    iget-object v1, p0, Lorg/bouncycastle/math/ec/c;->a:[I

    add-int/lit8 v0, v0, -0x1

    aget v1, v1, v0

    if-eqz v1, :cond_1

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    iget-object v2, p0, Lorg/bouncycastle/math/ec/c;->a:[I

    add-int/lit8 v0, v0, -0x1

    aget v2, v2, v0

    if-eqz v2, :cond_3

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    if-gtz v0, :cond_2

    move v0, v1

    goto :goto_0
.end method

.method private d(I)[I
    .locals 3

    const/4 v2, 0x0

    new-array v1, p1, [I

    iget-object v0, p0, Lorg/bouncycastle/math/ec/c;->a:[I

    array-length v0, v0

    if-ge v0, p1, :cond_0

    move p1, v0

    :cond_0
    iget-object v0, p0, Lorg/bouncycastle/math/ec/c;->a:[I

    invoke-static {v0, v2, v1, v2, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v1
.end method

.method private e(I)V
    .locals 4

    shr-int/lit8 v0, p1, 0x5

    and-int/lit8 v1, p1, 0x1f

    const/4 v2, 0x1

    shl-int v1, v2, v1

    iget-object v2, p0, Lorg/bouncycastle/math/ec/c;->a:[I

    aget v3, v2, v0

    xor-int/2addr v1, v3

    aput v1, v2, v0

    return-void
.end method


# virtual methods
.method public final a(I)Lorg/bouncycastle/math/ec/c;
    .locals 7

    const/4 v4, 0x0

    invoke-direct {p0}, Lorg/bouncycastle/math/ec/c;->d()I

    move-result v1

    if-nez v1, :cond_1

    :cond_0
    :goto_0
    return-object p0

    :cond_1
    if-eqz p1, :cond_0

    const/16 v0, 0x1f

    if-le p1, v0, :cond_2

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

    :cond_2
    add-int/lit8 v0, v1, 0x1

    new-array v2, v0, [I

    rsub-int/lit8 v3, p1, 0x20

    iget-object v0, p0, Lorg/bouncycastle/math/ec/c;->a:[I

    aget v0, v0, v4

    shl-int/2addr v0, p1

    aput v0, v2, v4

    const/4 v0, 0x1

    :goto_1
    if-ge v0, v1, :cond_3

    iget-object v4, p0, Lorg/bouncycastle/math/ec/c;->a:[I

    aget v4, v4, v0

    shl-int/2addr v4, p1

    iget-object v5, p0, Lorg/bouncycastle/math/ec/c;->a:[I

    add-int/lit8 v6, v0, -0x1

    aget v5, v5, v6

    ushr-int/2addr v5, v3

    or-int/2addr v4, v5

    aput v4, v2, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_3
    iget-object v0, p0, Lorg/bouncycastle/math/ec/c;->a:[I

    add-int/lit8 v4, v1, -0x1

    aget v0, v0, v4

    ushr-int/2addr v0, v3

    aput v0, v2, v1

    new-instance p0, Lorg/bouncycastle/math/ec/c;

    invoke-direct {p0, v2}, Lorg/bouncycastle/math/ec/c;-><init>([I)V

    goto :goto_0
.end method

.method public final a(I[I)V
    .locals 5

    const/4 v1, 0x1

    add-int v0, p1, p1

    add-int/lit8 v0, v0, -0x2

    move v2, v0

    :goto_0
    if-lt v2, p1, :cond_2

    shr-int/lit8 v0, v2, 0x5

    and-int/lit8 v3, v2, 0x1f

    shl-int v3, v1, v3

    iget-object v4, p0, Lorg/bouncycastle/math/ec/c;->a:[I

    aget v0, v4, v0

    and-int/2addr v0, v3

    if-eqz v0, :cond_0

    move v0, v1

    :goto_1
    if-eqz v0, :cond_1

    sub-int v3, v2, p1

    invoke-direct {p0, v3}, Lorg/bouncycastle/math/ec/c;->e(I)V

    invoke-direct {p0, v2}, Lorg/bouncycastle/math/ec/c;->e(I)V

    const/4 v0, 0x3

    :goto_2
    add-int/lit8 v0, v0, -0x1

    if-ltz v0, :cond_1

    aget v4, p2, v0

    add-int/2addr v4, v3

    invoke-direct {p0, v4}, Lorg/bouncycastle/math/ec/c;->e(I)V

    goto :goto_2

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    add-int/lit8 v0, v2, -0x1

    move v2, v0

    goto :goto_0

    :cond_2
    add-int/lit8 v0, p1, 0x1f

    shr-int/lit8 v0, v0, 0x5

    invoke-direct {p0, v0}, Lorg/bouncycastle/math/ec/c;->d(I)[I

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/math/ec/c;->a:[I

    return-void
.end method

.method public final a(Lorg/bouncycastle/math/ec/c;I)V
    .locals 6

    invoke-direct {p1}, Lorg/bouncycastle/math/ec/c;->d()I

    move-result v1

    add-int v0, v1, p2

    iget-object v2, p0, Lorg/bouncycastle/math/ec/c;->a:[I

    array-length v2, v2

    if-le v0, v2, :cond_0

    invoke-direct {p0, v0}, Lorg/bouncycastle/math/ec/c;->d(I)[I

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/math/ec/c;->a:[I

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-ge v0, v1, :cond_1

    iget-object v2, p0, Lorg/bouncycastle/math/ec/c;->a:[I

    add-int v3, v0, p2

    aget v4, v2, v3

    iget-object v5, p1, Lorg/bouncycastle/math/ec/c;->a:[I

    aget v5, v5, v0

    xor-int/2addr v4, v5

    aput v4, v2, v3

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final a()Z
    .locals 2

    const/4 v0, 0x0

    iget-object v1, p0, Lorg/bouncycastle/math/ec/c;->a:[I

    array-length v1, v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lorg/bouncycastle/math/ec/c;->a:[I

    aget v1, v1, v0

    if-nez v1, :cond_1

    invoke-direct {p0}, Lorg/bouncycastle/math/ec/c;->d()I

    move-result v1

    if-nez v1, :cond_1

    :cond_0
    const/4 v0, 0x1

    :cond_1
    return v0
.end method

.method public final b()I
    .locals 4

    invoke-direct {p0}, Lorg/bouncycastle/math/ec/c;->d()I

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x0

    :cond_0
    return v0

    :cond_1
    add-int/lit8 v1, v0, -0x1

    iget-object v0, p0, Lorg/bouncycastle/math/ec/c;->a:[I

    aget v0, v0, v1

    shl-int/lit8 v1, v1, 0x5

    add-int/lit8 v1, v1, 0x1

    const/high16 v2, -0x10000

    and-int/2addr v2, v0

    if-eqz v2, :cond_3

    const/high16 v2, -0x1000000

    and-int/2addr v2, v0

    if-eqz v2, :cond_2

    add-int/lit8 v1, v1, 0x18

    ushr-int/lit8 v0, v0, 0x18

    move v3, v0

    move v0, v1

    move v1, v3

    :goto_0
    const/4 v2, 0x1

    if-eq v1, v2, :cond_0

    add-int/lit8 v2, v0, 0x1

    ushr-int/lit8 v0, v1, 0x1

    move v1, v0

    move v0, v2

    goto :goto_0

    :cond_2
    add-int/lit8 v1, v1, 0x10

    ushr-int/lit8 v0, v0, 0x10

    move v3, v0

    move v0, v1

    move v1, v3

    goto :goto_0

    :cond_3
    const/16 v2, 0xff

    if-le v0, v2, :cond_4

    add-int/lit8 v1, v1, 0x8

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

.method public final b(Lorg/bouncycastle/math/ec/c;I)Lorg/bouncycastle/math/ec/c;
    .locals 13

    const/4 v2, 0x1

    const/4 v3, 0x0

    add-int/lit8 v0, p2, 0x1f

    shr-int/lit8 v8, v0, 0x5

    iget-object v0, p0, Lorg/bouncycastle/math/ec/c;->a:[I

    array-length v0, v0

    if-ge v0, v8, :cond_0

    invoke-direct {p0, v8}, Lorg/bouncycastle/math/ec/c;->d(I)[I

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/math/ec/c;->a:[I

    :cond_0
    new-instance v9, Lorg/bouncycastle/math/ec/c;

    iget-object v0, p1, Lorg/bouncycastle/math/ec/c;->a:[I

    array-length v0, v0

    add-int/lit8 v0, v0, 0x1

    invoke-direct {p1, v0}, Lorg/bouncycastle/math/ec/c;->d(I)[I

    move-result-object v0

    invoke-direct {v9, v0}, Lorg/bouncycastle/math/ec/c;-><init>([I)V

    new-instance v10, Lorg/bouncycastle/math/ec/c;

    add-int v0, p2, p2

    add-int/lit8 v0, v0, 0x1f

    shr-int/lit8 v0, v0, 0x5

    invoke-direct {v10, v0}, Lorg/bouncycastle/math/ec/c;-><init>(I)V

    move v6, v3

    move v1, v2

    :goto_0
    const/16 v0, 0x20

    if-ge v6, v0, :cond_7

    move v0, v3

    :goto_1
    if-ge v0, v8, :cond_2

    iget-object v4, p0, Lorg/bouncycastle/math/ec/c;->a:[I

    aget v4, v4, v0

    and-int/2addr v4, v1

    if-eqz v4, :cond_1

    invoke-virtual {v10, v9, v0}, Lorg/bouncycastle/math/ec/c;->a(Lorg/bouncycastle/math/ec/c;I)V

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_2
    shl-int/lit8 v7, v1, 0x1

    invoke-direct {v9}, Lorg/bouncycastle/math/ec/c;->d()I

    move-result v0

    if-eqz v0, :cond_6

    iget-object v1, v9, Lorg/bouncycastle/math/ec/c;->a:[I

    add-int/lit8 v4, v0, -0x1

    aget v1, v1, v4

    if-gez v1, :cond_3

    add-int/lit8 v0, v0, 0x1

    iget-object v1, v9, Lorg/bouncycastle/math/ec/c;->a:[I

    array-length v1, v1

    if-le v0, v1, :cond_3

    iget-object v1, v9, Lorg/bouncycastle/math/ec/c;->a:[I

    array-length v1, v1

    add-int/lit8 v1, v1, 0x1

    invoke-direct {v9, v1}, Lorg/bouncycastle/math/ec/c;->d(I)[I

    move-result-object v1

    iput-object v1, v9, Lorg/bouncycastle/math/ec/c;->a:[I

    :cond_3
    move v4, v3

    move v5, v3

    :goto_2
    if-ge v4, v0, :cond_6

    iget-object v1, v9, Lorg/bouncycastle/math/ec/c;->a:[I

    aget v1, v1, v4

    if-gez v1, :cond_5

    move v1, v2

    :goto_3
    iget-object v11, v9, Lorg/bouncycastle/math/ec/c;->a:[I

    aget v12, v11, v4

    shl-int/lit8 v12, v12, 0x1

    aput v12, v11, v4

    if-eqz v5, :cond_4

    iget-object v5, v9, Lorg/bouncycastle/math/ec/c;->a:[I

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

    :cond_6
    add-int/lit8 v0, v6, 0x1

    move v6, v0

    move v1, v7

    goto :goto_0

    :cond_7
    return-object v10
.end method

.method public final b(I)V
    .locals 4

    shr-int/lit8 v0, p1, 0x5

    and-int/lit8 v1, p1, 0x1f

    const/4 v2, 0x1

    shl-int v1, v2, v1

    iget-object v2, p0, Lorg/bouncycastle/math/ec/c;->a:[I

    aget v3, v2, v0

    or-int/2addr v1, v3

    aput v1, v2, v0

    return-void
.end method

.method public final c()Ljava/math/BigInteger;
    .locals 10

    const/4 v4, 0x3

    const/4 v1, 0x1

    const/4 v3, 0x0

    invoke-direct {p0}, Lorg/bouncycastle/math/ec/c;->d()I

    move-result v6

    if-nez v6, :cond_0

    sget-object v0, Lorg/bouncycastle/math/ec/ECConstants;->f:Ljava/math/BigInteger;

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lorg/bouncycastle/math/ec/c;->a:[I

    add-int/lit8 v2, v6, -0x1

    aget v7, v0, v2

    const/4 v0, 0x4

    new-array v8, v0, [B

    move v5, v4

    move v0, v3

    move v2, v3

    :goto_1
    if-ltz v5, :cond_3

    mul-int/lit8 v9, v5, 0x8

    ushr-int v9, v7, v9

    int-to-byte v9, v9

    if-nez v0, :cond_1

    if-eqz v9, :cond_2

    :cond_1
    add-int/lit8 v0, v2, 0x1

    aput-byte v9, v8, v2

    move v2, v0

    move v0, v1

    :cond_2
    add-int/lit8 v5, v5, -0x1

    goto :goto_1

    :cond_3
    add-int/lit8 v0, v6, -0x1

    mul-int/lit8 v0, v0, 0x4

    add-int/2addr v0, v2

    new-array v7, v0, [B

    move v0, v3

    :goto_2
    if-ge v0, v2, :cond_4

    aget-byte v3, v8, v0

    aput-byte v3, v7, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_4
    add-int/lit8 v0, v6, -0x2

    move v5, v0

    move v0, v2

    :goto_3
    if-ltz v5, :cond_6

    move v3, v4

    :goto_4
    if-ltz v3, :cond_5

    add-int/lit8 v2, v0, 0x1

    iget-object v6, p0, Lorg/bouncycastle/math/ec/c;->a:[I

    aget v6, v6, v5

    mul-int/lit8 v8, v3, 0x8

    ushr-int/2addr v6, v8

    int-to-byte v6, v6

    aput-byte v6, v7, v0

    add-int/lit8 v0, v3, -0x1

    move v3, v0

    move v0, v2

    goto :goto_4

    :cond_5
    add-int/lit8 v2, v5, -0x1

    move v5, v2

    goto :goto_3

    :cond_6
    new-instance v0, Ljava/math/BigInteger;

    invoke-direct {v0, v1, v7}, Ljava/math/BigInteger;-><init>(I[B)V

    goto :goto_0
.end method

.method public final c(I)Lorg/bouncycastle/math/ec/c;
    .locals 10

    const/4 v9, 0x4

    const/4 v1, 0x0

    const/16 v0, 0x10

    new-array v4, v0, [I

    fill-array-data v4, :array_0

    add-int/lit8 v0, p1, 0x1f

    shr-int/lit8 v5, v0, 0x5

    iget-object v0, p0, Lorg/bouncycastle/math/ec/c;->a:[I

    array-length v0, v0

    if-ge v0, v5, :cond_0

    invoke-direct {p0, v5}, Lorg/bouncycastle/math/ec/c;->d(I)[I

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/math/ec/c;->a:[I

    :cond_0
    new-instance v6, Lorg/bouncycastle/math/ec/c;

    add-int v0, v5, v5

    invoke-direct {v6, v0}, Lorg/bouncycastle/math/ec/c;-><init>(I)V

    move v3, v1

    :goto_0
    if-ge v3, v5, :cond_3

    move v0, v1

    move v2, v1

    :goto_1
    if-ge v0, v9, :cond_1

    ushr-int/lit8 v2, v2, 0x8

    iget-object v7, p0, Lorg/bouncycastle/math/ec/c;->a:[I

    aget v7, v7, v3

    mul-int/lit8 v8, v0, 0x4

    ushr-int/2addr v7, v8

    and-int/lit8 v7, v7, 0xf

    aget v7, v4, v7

    shl-int/lit8 v7, v7, 0x18

    or-int/2addr v2, v7

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    iget-object v0, v6, Lorg/bouncycastle/math/ec/c;->a:[I

    add-int v7, v3, v3

    aput v2, v0, v7

    iget-object v0, p0, Lorg/bouncycastle/math/ec/c;->a:[I

    aget v0, v0, v3

    ushr-int/lit8 v7, v0, 0x10

    move v0, v1

    move v2, v1

    :goto_2
    if-ge v0, v9, :cond_2

    ushr-int/lit8 v2, v2, 0x8

    mul-int/lit8 v8, v0, 0x4

    ushr-int v8, v7, v8

    and-int/lit8 v8, v8, 0xf

    aget v8, v4, v8

    shl-int/lit8 v8, v8, 0x18

    or-int/2addr v2, v8

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_2
    iget-object v0, v6, Lorg/bouncycastle/math/ec/c;->a:[I

    add-int v7, v3, v3

    add-int/lit8 v7, v7, 0x1

    aput v2, v0, v7

    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto :goto_0

    :cond_3
    return-object v6

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

    new-instance v0, Lorg/bouncycastle/math/ec/c;

    iget-object v1, p0, Lorg/bouncycastle/math/ec/c;->a:[I

    invoke-static {v1}, Lorg/bouncycastle/util/Arrays;->a([I)[I

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/bouncycastle/math/ec/c;-><init>([I)V

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 5

    const/4 v0, 0x0

    instance-of v1, p1, Lorg/bouncycastle/math/ec/c;

    if-nez v1, :cond_1

    :cond_0
    :goto_0
    return v0

    :cond_1
    check-cast p1, Lorg/bouncycastle/math/ec/c;

    invoke-direct {p0}, Lorg/bouncycastle/math/ec/c;->d()I

    move-result v2

    invoke-direct {p1}, Lorg/bouncycastle/math/ec/c;->d()I

    move-result v1

    if-ne v1, v2, :cond_0

    move v1, v0

    :goto_1
    if-ge v1, v2, :cond_2

    iget-object v3, p0, Lorg/bouncycastle/math/ec/c;->a:[I

    aget v3, v3, v1

    iget-object v4, p1, Lorg/bouncycastle/math/ec/c;->a:[I

    aget v4, v4, v1

    if-ne v3, v4, :cond_0

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_2
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public final hashCode()I
    .locals 4

    invoke-direct {p0}, Lorg/bouncycastle/math/ec/c;->d()I

    move-result v2

    const/4 v1, 0x1

    const/4 v0, 0x0

    :goto_0
    if-ge v0, v2, :cond_0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v3, p0, Lorg/bouncycastle/math/ec/c;->a:[I

    aget v3, v3, v0

    add-int/2addr v1, v3

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 6

    invoke-direct {p0}, Lorg/bouncycastle/math/ec/c;->d()I

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "0"

    :goto_0
    return-object v0

    :cond_0
    new-instance v3, Ljava/lang/StringBuffer;

    iget-object v1, p0, Lorg/bouncycastle/math/ec/c;->a:[I

    add-int/lit8 v2, v0, -0x1

    aget v1, v1, v2

    invoke-static {v1}, Ljava/lang/Integer;->toBinaryString(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v3, v1}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    add-int/lit8 v0, v0, -0x2

    move v2, v0

    :goto_1
    if-ltz v2, :cond_2

    iget-object v0, p0, Lorg/bouncycastle/math/ec/c;->a:[I

    aget v0, v0, v2

    invoke-static {v0}, Ljava/lang/Integer;->toBinaryString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v0

    :goto_2
    const/16 v4, 0x8

    if-ge v0, v4, :cond_1

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "0"

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_1
    invoke-virtual {v3, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    add-int/lit8 v0, v2, -0x1

    move v2, v0

    goto :goto_1

    :cond_2
    invoke-virtual {v3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method
