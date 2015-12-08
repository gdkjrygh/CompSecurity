.class public Lorg/bouncycastle/crypto/engines/Salsa20Engine;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/bouncycastle/crypto/StreamCipher;


# static fields
.field private static final a:[B

.field private static final b:[B


# instance fields
.field private c:I

.field private d:[I

.field private e:[I

.field private f:[B

.field private g:[B

.field private h:[B

.field private i:Z

.field private j:I

.field private k:I

.field private l:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "expand 32-byte k"

    invoke-static {v0}, Lorg/bouncycastle/util/Strings;->d(Ljava/lang/String;)[B

    move-result-object v0

    sput-object v0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->a:[B

    const-string v0, "expand 16-byte k"

    invoke-static {v0}, Lorg/bouncycastle/util/Strings;->d(Ljava/lang/String;)[B

    move-result-object v0

    sput-object v0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->b:[B

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    const/4 v3, 0x0

    const/16 v2, 0x10

    const/4 v1, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput v1, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->c:I

    new-array v0, v2, [I

    iput-object v0, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->d:[I

    new-array v0, v2, [I

    iput-object v0, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->e:[I

    const/16 v0, 0x40

    new-array v0, v0, [B

    iput-object v0, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->f:[B

    iput-object v3, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->g:[B

    iput-object v3, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->h:[B

    iput-boolean v1, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->i:Z

    return-void
.end method

.method private byteToIntLittle([BI)I
    .locals 2

    aget-byte v0, p1, p2

    and-int/lit16 v0, v0, 0xff

    add-int/lit8 v1, p2, 0x1

    aget-byte v1, p1, v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x8

    or-int/2addr v0, v1

    add-int/lit8 v1, p2, 0x2

    aget-byte v1, p1, v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x10

    or-int/2addr v0, v1

    add-int/lit8 v1, p2, 0x3

    aget-byte v1, p1, v1

    shl-int/lit8 v1, v1, 0x18

    or-int/2addr v0, v1

    return v0
.end method

.method private intToByteLittle(I[BI)[B
    .locals 2

    int-to-byte v0, p1

    aput-byte v0, p2, p3

    add-int/lit8 v0, p3, 0x1

    ushr-int/lit8 v1, p1, 0x8

    int-to-byte v1, v1

    aput-byte v1, p2, v0

    add-int/lit8 v0, p3, 0x2

    ushr-int/lit8 v1, p1, 0x10

    int-to-byte v1, v1

    aput-byte v1, p2, v0

    add-int/lit8 v0, p3, 0x3

    ushr-int/lit8 v1, p1, 0x18

    int-to-byte v1, v1

    aput-byte v1, p2, v0

    return-object p2
.end method

.method private limitExceeded()Z
    .locals 2

    const/4 v0, 0x0

    iget v1, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->j:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->j:I

    iget v1, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->j:I

    if-nez v1, :cond_0

    iget v1, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->k:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->k:I

    iget v1, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->k:I

    if-nez v1, :cond_0

    iget v1, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->l:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->l:I

    iget v1, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->l:I

    and-int/lit8 v1, v1, 0x20

    if-eqz v1, :cond_0

    const/4 v0, 0x1

    :cond_0
    return v0
.end method

.method private limitExceeded(I)Z
    .locals 2

    const/4 v0, 0x0

    iget v1, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->j:I

    if-ltz v1, :cond_1

    iget v1, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->j:I

    add-int/2addr v1, p1

    iput v1, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->j:I

    :cond_0
    :goto_0
    return v0

    :cond_1
    iget v1, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->j:I

    add-int/2addr v1, p1

    iput v1, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->j:I

    iget v1, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->j:I

    if-ltz v1, :cond_0

    iget v1, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->k:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->k:I

    iget v1, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->k:I

    if-nez v1, :cond_0

    iget v1, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->l:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->l:I

    iget v1, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->l:I

    and-int/lit8 v1, v1, 0x20

    if-eqz v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0
.end method

.method private resetCounter()V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->j:I

    iput v0, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->k:I

    iput v0, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->l:I

    return-void
.end method

.method private rotl(II)I
    .locals 2

    shl-int v0, p1, p2

    neg-int v1, p2

    ushr-int v1, p1, v1

    or-int/2addr v0, v1

    return v0
.end method

.method private salsa20WordToByte([I[B)V
    .locals 12

    const/16 v11, 0x12

    const/4 v0, 0x0

    const/16 v10, 0xd

    const/16 v9, 0x9

    const/4 v8, 0x7

    iget-object v1, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->e:[I

    array-length v2, p1

    invoke-static {p1, v0, v1, v0, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move v1, v0

    :goto_0
    const/16 v2, 0xa

    if-ge v1, v2, :cond_0

    iget-object v2, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->e:[I

    const/4 v3, 0x4

    aget v4, v2, v3

    iget-object v5, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->e:[I

    aget v5, v5, v0

    iget-object v6, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->e:[I

    const/16 v7, 0xc

    aget v6, v6, v7

    add-int/2addr v5, v6

    invoke-direct {p0, v5, v8}, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->rotl(II)I

    move-result v5

    xor-int/2addr v4, v5

    aput v4, v2, v3

    iget-object v2, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->e:[I

    const/16 v3, 0x8

    aget v4, v2, v3

    iget-object v5, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->e:[I

    const/4 v6, 0x4

    aget v5, v5, v6

    iget-object v6, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->e:[I

    aget v6, v6, v0

    add-int/2addr v5, v6

    invoke-direct {p0, v5, v9}, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->rotl(II)I

    move-result v5

    xor-int/2addr v4, v5

    aput v4, v2, v3

    iget-object v2, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->e:[I

    const/16 v3, 0xc

    aget v4, v2, v3

    iget-object v5, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->e:[I

    const/16 v6, 0x8

    aget v5, v5, v6

    iget-object v6, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->e:[I

    const/4 v7, 0x4

    aget v6, v6, v7

    add-int/2addr v5, v6

    invoke-direct {p0, v5, v10}, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->rotl(II)I

    move-result v5

    xor-int/2addr v4, v5

    aput v4, v2, v3

    iget-object v2, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->e:[I

    aget v3, v2, v0

    iget-object v4, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->e:[I

    const/16 v5, 0xc

    aget v4, v4, v5

    iget-object v5, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->e:[I

    const/16 v6, 0x8

    aget v5, v5, v6

    add-int/2addr v4, v5

    invoke-direct {p0, v4, v11}, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->rotl(II)I

    move-result v4

    xor-int/2addr v3, v4

    aput v3, v2, v0

    iget-object v2, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->e:[I

    aget v3, v2, v9

    iget-object v4, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->e:[I

    const/4 v5, 0x5

    aget v4, v4, v5

    iget-object v5, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->e:[I

    const/4 v6, 0x1

    aget v5, v5, v6

    add-int/2addr v4, v5

    invoke-direct {p0, v4, v8}, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->rotl(II)I

    move-result v4

    xor-int/2addr v3, v4

    aput v3, v2, v9

    iget-object v2, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->e:[I

    aget v3, v2, v10

    iget-object v4, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->e:[I

    aget v4, v4, v9

    iget-object v5, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->e:[I

    const/4 v6, 0x5

    aget v5, v5, v6

    add-int/2addr v4, v5

    invoke-direct {p0, v4, v9}, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->rotl(II)I

    move-result v4

    xor-int/2addr v3, v4

    aput v3, v2, v10

    iget-object v2, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->e:[I

    const/4 v3, 0x1

    aget v4, v2, v3

    iget-object v5, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->e:[I

    aget v5, v5, v10

    iget-object v6, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->e:[I

    aget v6, v6, v9

    add-int/2addr v5, v6

    invoke-direct {p0, v5, v10}, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->rotl(II)I

    move-result v5

    xor-int/2addr v4, v5

    aput v4, v2, v3

    iget-object v2, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->e:[I

    const/4 v3, 0x5

    aget v4, v2, v3

    iget-object v5, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->e:[I

    const/4 v6, 0x1

    aget v5, v5, v6

    iget-object v6, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->e:[I

    aget v6, v6, v10

    add-int/2addr v5, v6

    invoke-direct {p0, v5, v11}, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->rotl(II)I

    move-result v5

    xor-int/2addr v4, v5

    aput v4, v2, v3

    iget-object v2, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->e:[I

    const/16 v3, 0xe

    aget v4, v2, v3

    iget-object v5, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->e:[I

    const/16 v6, 0xa

    aget v5, v5, v6

    iget-object v6, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->e:[I

    const/4 v7, 0x6

    aget v6, v6, v7

    add-int/2addr v5, v6

    invoke-direct {p0, v5, v8}, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->rotl(II)I

    move-result v5

    xor-int/2addr v4, v5

    aput v4, v2, v3

    iget-object v2, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->e:[I

    const/4 v3, 0x2

    aget v4, v2, v3

    iget-object v5, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->e:[I

    const/16 v6, 0xe

    aget v5, v5, v6

    iget-object v6, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->e:[I

    const/16 v7, 0xa

    aget v6, v6, v7

    add-int/2addr v5, v6

    invoke-direct {p0, v5, v9}, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->rotl(II)I

    move-result v5

    xor-int/2addr v4, v5

    aput v4, v2, v3

    iget-object v2, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->e:[I

    const/4 v3, 0x6

    aget v4, v2, v3

    iget-object v5, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->e:[I

    const/4 v6, 0x2

    aget v5, v5, v6

    iget-object v6, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->e:[I

    const/16 v7, 0xe

    aget v6, v6, v7

    add-int/2addr v5, v6

    invoke-direct {p0, v5, v10}, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->rotl(II)I

    move-result v5

    xor-int/2addr v4, v5

    aput v4, v2, v3

    iget-object v2, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->e:[I

    const/16 v3, 0xa

    aget v4, v2, v3

    iget-object v5, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->e:[I

    const/4 v6, 0x6

    aget v5, v5, v6

    iget-object v6, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->e:[I

    const/4 v7, 0x2

    aget v6, v6, v7

    add-int/2addr v5, v6

    invoke-direct {p0, v5, v11}, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->rotl(II)I

    move-result v5

    xor-int/2addr v4, v5

    aput v4, v2, v3

    iget-object v2, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->e:[I

    const/4 v3, 0x3

    aget v4, v2, v3

    iget-object v5, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->e:[I

    const/16 v6, 0xf

    aget v5, v5, v6

    iget-object v6, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->e:[I

    const/16 v7, 0xb

    aget v6, v6, v7

    add-int/2addr v5, v6

    invoke-direct {p0, v5, v8}, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->rotl(II)I

    move-result v5

    xor-int/2addr v4, v5

    aput v4, v2, v3

    iget-object v2, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->e:[I

    aget v3, v2, v8

    iget-object v4, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->e:[I

    const/4 v5, 0x3

    aget v4, v4, v5

    iget-object v5, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->e:[I

    const/16 v6, 0xf

    aget v5, v5, v6

    add-int/2addr v4, v5

    invoke-direct {p0, v4, v9}, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->rotl(II)I

    move-result v4

    xor-int/2addr v3, v4

    aput v3, v2, v8

    iget-object v2, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->e:[I

    const/16 v3, 0xb

    aget v4, v2, v3

    iget-object v5, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->e:[I

    aget v5, v5, v8

    iget-object v6, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->e:[I

    const/4 v7, 0x3

    aget v6, v6, v7

    add-int/2addr v5, v6

    invoke-direct {p0, v5, v10}, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->rotl(II)I

    move-result v5

    xor-int/2addr v4, v5

    aput v4, v2, v3

    iget-object v2, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->e:[I

    const/16 v3, 0xf

    aget v4, v2, v3

    iget-object v5, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->e:[I

    const/16 v6, 0xb

    aget v5, v5, v6

    iget-object v6, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->e:[I

    aget v6, v6, v8

    add-int/2addr v5, v6

    invoke-direct {p0, v5, v11}, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->rotl(II)I

    move-result v5

    xor-int/2addr v4, v5

    aput v4, v2, v3

    iget-object v2, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->e:[I

    const/4 v3, 0x1

    aget v4, v2, v3

    iget-object v5, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->e:[I

    aget v5, v5, v0

    iget-object v6, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->e:[I

    const/4 v7, 0x3

    aget v6, v6, v7

    add-int/2addr v5, v6

    invoke-direct {p0, v5, v8}, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->rotl(II)I

    move-result v5

    xor-int/2addr v4, v5

    aput v4, v2, v3

    iget-object v2, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->e:[I

    const/4 v3, 0x2

    aget v4, v2, v3

    iget-object v5, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->e:[I

    const/4 v6, 0x1

    aget v5, v5, v6

    iget-object v6, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->e:[I

    aget v6, v6, v0

    add-int/2addr v5, v6

    invoke-direct {p0, v5, v9}, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->rotl(II)I

    move-result v5

    xor-int/2addr v4, v5

    aput v4, v2, v3

    iget-object v2, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->e:[I

    const/4 v3, 0x3

    aget v4, v2, v3

    iget-object v5, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->e:[I

    const/4 v6, 0x2

    aget v5, v5, v6

    iget-object v6, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->e:[I

    const/4 v7, 0x1

    aget v6, v6, v7

    add-int/2addr v5, v6

    invoke-direct {p0, v5, v10}, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->rotl(II)I

    move-result v5

    xor-int/2addr v4, v5

    aput v4, v2, v3

    iget-object v2, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->e:[I

    aget v3, v2, v0

    iget-object v4, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->e:[I

    const/4 v5, 0x3

    aget v4, v4, v5

    iget-object v5, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->e:[I

    const/4 v6, 0x2

    aget v5, v5, v6

    add-int/2addr v4, v5

    invoke-direct {p0, v4, v11}, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->rotl(II)I

    move-result v4

    xor-int/2addr v3, v4

    aput v3, v2, v0

    iget-object v2, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->e:[I

    const/4 v3, 0x6

    aget v4, v2, v3

    iget-object v5, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->e:[I

    const/4 v6, 0x5

    aget v5, v5, v6

    iget-object v6, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->e:[I

    const/4 v7, 0x4

    aget v6, v6, v7

    add-int/2addr v5, v6

    invoke-direct {p0, v5, v8}, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->rotl(II)I

    move-result v5

    xor-int/2addr v4, v5

    aput v4, v2, v3

    iget-object v2, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->e:[I

    aget v3, v2, v8

    iget-object v4, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->e:[I

    const/4 v5, 0x6

    aget v4, v4, v5

    iget-object v5, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->e:[I

    const/4 v6, 0x5

    aget v5, v5, v6

    add-int/2addr v4, v5

    invoke-direct {p0, v4, v9}, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->rotl(II)I

    move-result v4

    xor-int/2addr v3, v4

    aput v3, v2, v8

    iget-object v2, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->e:[I

    const/4 v3, 0x4

    aget v4, v2, v3

    iget-object v5, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->e:[I

    aget v5, v5, v8

    iget-object v6, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->e:[I

    const/4 v7, 0x6

    aget v6, v6, v7

    add-int/2addr v5, v6

    invoke-direct {p0, v5, v10}, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->rotl(II)I

    move-result v5

    xor-int/2addr v4, v5

    aput v4, v2, v3

    iget-object v2, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->e:[I

    const/4 v3, 0x5

    aget v4, v2, v3

    iget-object v5, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->e:[I

    const/4 v6, 0x4

    aget v5, v5, v6

    iget-object v6, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->e:[I

    aget v6, v6, v8

    add-int/2addr v5, v6

    invoke-direct {p0, v5, v11}, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->rotl(II)I

    move-result v5

    xor-int/2addr v4, v5

    aput v4, v2, v3

    iget-object v2, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->e:[I

    const/16 v3, 0xb

    aget v4, v2, v3

    iget-object v5, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->e:[I

    const/16 v6, 0xa

    aget v5, v5, v6

    iget-object v6, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->e:[I

    aget v6, v6, v9

    add-int/2addr v5, v6

    invoke-direct {p0, v5, v8}, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->rotl(II)I

    move-result v5

    xor-int/2addr v4, v5

    aput v4, v2, v3

    iget-object v2, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->e:[I

    const/16 v3, 0x8

    aget v4, v2, v3

    iget-object v5, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->e:[I

    const/16 v6, 0xb

    aget v5, v5, v6

    iget-object v6, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->e:[I

    const/16 v7, 0xa

    aget v6, v6, v7

    add-int/2addr v5, v6

    invoke-direct {p0, v5, v9}, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->rotl(II)I

    move-result v5

    xor-int/2addr v4, v5

    aput v4, v2, v3

    iget-object v2, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->e:[I

    aget v3, v2, v9

    iget-object v4, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->e:[I

    const/16 v5, 0x8

    aget v4, v4, v5

    iget-object v5, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->e:[I

    const/16 v6, 0xb

    aget v5, v5, v6

    add-int/2addr v4, v5

    invoke-direct {p0, v4, v10}, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->rotl(II)I

    move-result v4

    xor-int/2addr v3, v4

    aput v3, v2, v9

    iget-object v2, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->e:[I

    const/16 v3, 0xa

    aget v4, v2, v3

    iget-object v5, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->e:[I

    aget v5, v5, v9

    iget-object v6, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->e:[I

    const/16 v7, 0x8

    aget v6, v6, v7

    add-int/2addr v5, v6

    invoke-direct {p0, v5, v11}, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->rotl(II)I

    move-result v5

    xor-int/2addr v4, v5

    aput v4, v2, v3

    iget-object v2, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->e:[I

    const/16 v3, 0xc

    aget v4, v2, v3

    iget-object v5, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->e:[I

    const/16 v6, 0xf

    aget v5, v5, v6

    iget-object v6, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->e:[I

    const/16 v7, 0xe

    aget v6, v6, v7

    add-int/2addr v5, v6

    invoke-direct {p0, v5, v8}, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->rotl(II)I

    move-result v5

    xor-int/2addr v4, v5

    aput v4, v2, v3

    iget-object v2, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->e:[I

    aget v3, v2, v10

    iget-object v4, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->e:[I

    const/16 v5, 0xc

    aget v4, v4, v5

    iget-object v5, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->e:[I

    const/16 v6, 0xf

    aget v5, v5, v6

    add-int/2addr v4, v5

    invoke-direct {p0, v4, v9}, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->rotl(II)I

    move-result v4

    xor-int/2addr v3, v4

    aput v3, v2, v10

    iget-object v2, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->e:[I

    const/16 v3, 0xe

    aget v4, v2, v3

    iget-object v5, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->e:[I

    aget v5, v5, v10

    iget-object v6, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->e:[I

    const/16 v7, 0xc

    aget v6, v6, v7

    add-int/2addr v5, v6

    invoke-direct {p0, v5, v10}, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->rotl(II)I

    move-result v5

    xor-int/2addr v4, v5

    aput v4, v2, v3

    iget-object v2, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->e:[I

    const/16 v3, 0xf

    aget v4, v2, v3

    iget-object v5, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->e:[I

    const/16 v6, 0xe

    aget v5, v5, v6

    iget-object v6, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->e:[I

    aget v6, v6, v10

    add-int/2addr v5, v6

    invoke-direct {p0, v5, v11}, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->rotl(II)I

    move-result v5

    xor-int/2addr v4, v5

    aput v4, v2, v3

    add-int/lit8 v1, v1, 0x1

    goto/16 :goto_0

    :cond_0
    move v1, v0

    :goto_1
    const/16 v2, 0x10

    if-ge v0, v2, :cond_1

    iget-object v2, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->e:[I

    aget v2, v2, v0

    aget v3, p1, v0

    add-int/2addr v2, v3

    invoke-direct {p0, v2, p2, v1}, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->intToByteLittle(I[BI)[B

    add-int/lit8 v1, v1, 0x4

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    const/16 v0, 0x10

    :goto_2
    iget-object v2, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->e:[I

    array-length v2, v2

    if-ge v0, v2, :cond_2

    iget-object v2, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->e:[I

    aget v2, v2, v0

    invoke-direct {p0, v2, p2, v1}, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->intToByteLittle(I[BI)[B

    add-int/lit8 v1, v1, 0x4

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_2
    return-void
.end method

.method private setKey([B[B)V
    .locals 11

    const/4 v10, 0x1

    const/16 v9, 0xc

    const/16 v8, 0x8

    const/4 v7, 0x4

    const/4 v2, 0x0

    iput-object p1, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->g:[B

    iput-object p2, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->h:[B

    iput v2, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->c:I

    invoke-direct {p0}, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->resetCounter()V

    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->d:[I

    iget-object v1, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->g:[B

    invoke-direct {p0, v1, v2}, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->byteToIntLittle([BI)I

    move-result v1

    aput v1, v0, v10

    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->d:[I

    const/4 v1, 0x2

    iget-object v3, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->g:[B

    invoke-direct {p0, v3, v7}, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->byteToIntLittle([BI)I

    move-result v3

    aput v3, v0, v1

    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->d:[I

    const/4 v1, 0x3

    iget-object v3, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->g:[B

    invoke-direct {p0, v3, v8}, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->byteToIntLittle([BI)I

    move-result v3

    aput v3, v0, v1

    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->d:[I

    iget-object v1, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->g:[B

    invoke-direct {p0, v1, v9}, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->byteToIntLittle([BI)I

    move-result v1

    aput v1, v0, v7

    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->g:[B

    array-length v0, v0

    const/16 v1, 0x20

    if-ne v0, v1, :cond_0

    sget-object v0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->a:[B

    const/16 v1, 0x10

    :goto_0
    iget-object v3, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->d:[I

    const/16 v4, 0xb

    iget-object v5, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->g:[B

    invoke-direct {p0, v5, v1}, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->byteToIntLittle([BI)I

    move-result v5

    aput v5, v3, v4

    iget-object v3, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->d:[I

    iget-object v4, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->g:[B

    add-int/lit8 v5, v1, 0x4

    invoke-direct {p0, v4, v5}, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->byteToIntLittle([BI)I

    move-result v4

    aput v4, v3, v9

    iget-object v3, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->d:[I

    const/16 v4, 0xd

    iget-object v5, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->g:[B

    add-int/lit8 v6, v1, 0x8

    invoke-direct {p0, v5, v6}, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->byteToIntLittle([BI)I

    move-result v5

    aput v5, v3, v4

    iget-object v3, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->d:[I

    const/16 v4, 0xe

    iget-object v5, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->g:[B

    add-int/lit8 v1, v1, 0xc

    invoke-direct {p0, v5, v1}, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->byteToIntLittle([BI)I

    move-result v1

    aput v1, v3, v4

    iget-object v1, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->d:[I

    invoke-direct {p0, v0, v2}, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->byteToIntLittle([BI)I

    move-result v3

    aput v3, v1, v2

    iget-object v1, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->d:[I

    const/4 v3, 0x5

    invoke-direct {p0, v0, v7}, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->byteToIntLittle([BI)I

    move-result v4

    aput v4, v1, v3

    iget-object v1, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->d:[I

    const/16 v3, 0xa

    invoke-direct {p0, v0, v8}, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->byteToIntLittle([BI)I

    move-result v4

    aput v4, v1, v3

    iget-object v1, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->d:[I

    const/16 v3, 0xf

    invoke-direct {p0, v0, v9}, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->byteToIntLittle([BI)I

    move-result v0

    aput v0, v1, v3

    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->d:[I

    const/4 v1, 0x6

    iget-object v3, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->h:[B

    invoke-direct {p0, v3, v2}, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->byteToIntLittle([BI)I

    move-result v3

    aput v3, v0, v1

    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->d:[I

    const/4 v1, 0x7

    iget-object v3, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->h:[B

    invoke-direct {p0, v3, v7}, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->byteToIntLittle([BI)I

    move-result v3

    aput v3, v0, v1

    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->d:[I

    iget-object v1, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->d:[I

    const/16 v3, 0x9

    aput v2, v1, v3

    aput v2, v0, v8

    iput-boolean v10, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->i:Z

    return-void

    :cond_0
    sget-object v0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->b:[B

    move v1, v2

    goto :goto_0
.end method


# virtual methods
.method public getAlgorithmName()Ljava/lang/String;
    .locals 1

    const-string v0, "Salsa20"

    return-object v0
.end method

.method public init(ZLorg/bouncycastle/crypto/CipherParameters;)V
    .locals 3

    instance-of v0, p2, Lorg/bouncycastle/crypto/params/ParametersWithIV;

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Salsa20 Init parameters must include an IV"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    check-cast p2, Lorg/bouncycastle/crypto/params/ParametersWithIV;

    invoke-virtual {p2}, Lorg/bouncycastle/crypto/params/ParametersWithIV;->getIV()[B

    move-result-object v1

    if-eqz v1, :cond_1

    array-length v0, v1

    const/16 v2, 0x8

    if-eq v0, v2, :cond_2

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Salsa20 requires exactly 8 bytes of IV"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-virtual {p2}, Lorg/bouncycastle/crypto/params/ParametersWithIV;->getParameters()Lorg/bouncycastle/crypto/CipherParameters;

    move-result-object v0

    instance-of v0, v0, Lorg/bouncycastle/crypto/params/KeyParameter;

    if-nez v0, :cond_3

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Salsa20 Init parameters must include a key"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    invoke-virtual {p2}, Lorg/bouncycastle/crypto/params/ParametersWithIV;->getParameters()Lorg/bouncycastle/crypto/CipherParameters;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/crypto/params/KeyParameter;

    invoke-virtual {v0}, Lorg/bouncycastle/crypto/params/KeyParameter;->getKey()[B

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->g:[B

    iput-object v1, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->h:[B

    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->g:[B

    iget-object v1, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->h:[B

    invoke-direct {p0, v0, v1}, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->setKey([B[B)V

    return-void
.end method

.method public processBytes([BII[BI)V
    .locals 5

    const/16 v4, 0x8

    iget-boolean v0, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->i:Z

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->getAlgorithmName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " not initialised"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    add-int v0, p2, p3

    array-length v1, p1

    if-le v0, v1, :cond_1

    new-instance v0, Lorg/bouncycastle/crypto/DataLengthException;

    const-string v1, "input buffer too short"

    invoke-direct {v0, v1}, Lorg/bouncycastle/crypto/DataLengthException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    add-int v0, p5, p3

    array-length v1, p4

    if-le v0, v1, :cond_2

    new-instance v0, Lorg/bouncycastle/crypto/DataLengthException;

    const-string v1, "output buffer too short"

    invoke-direct {v0, v1}, Lorg/bouncycastle/crypto/DataLengthException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-direct {p0, p3}, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->limitExceeded(I)Z

    move-result v0

    if-eqz v0, :cond_3

    new-instance v0, Lorg/bouncycastle/crypto/MaxBytesExceededException;

    const-string v1, "2^70 byte limit per IV would be exceeded; Change IV"

    invoke-direct {v0, v1}, Lorg/bouncycastle/crypto/MaxBytesExceededException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    const/4 v0, 0x0

    :goto_0
    if-ge v0, p3, :cond_5

    iget v1, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->c:I

    if-nez v1, :cond_4

    iget-object v1, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->d:[I

    iget-object v2, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->f:[B

    invoke-direct {p0, v1, v2}, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->salsa20WordToByte([I[B)V

    iget-object v1, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->d:[I

    aget v2, v1, v4

    add-int/lit8 v2, v2, 0x1

    aput v2, v1, v4

    iget-object v1, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->d:[I

    aget v1, v1, v4

    if-nez v1, :cond_4

    iget-object v1, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->d:[I

    const/16 v2, 0x9

    aget v3, v1, v2

    add-int/lit8 v3, v3, 0x1

    aput v3, v1, v2

    :cond_4
    add-int v1, v0, p5

    iget-object v2, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->f:[B

    iget v3, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->c:I

    aget-byte v2, v2, v3

    add-int v3, v0, p2

    aget-byte v3, p1, v3

    xor-int/2addr v2, v3

    int-to-byte v2, v2

    aput-byte v2, p4, v1

    iget v1, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->c:I

    add-int/lit8 v1, v1, 0x1

    and-int/lit8 v1, v1, 0x3f

    iput v1, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->c:I

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_5
    return-void
.end method

.method public reset()V
    .locals 2

    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->g:[B

    iget-object v1, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->h:[B

    invoke-direct {p0, v0, v1}, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->setKey([B[B)V

    return-void
.end method

.method public returnByte(B)B
    .locals 3

    const/16 v2, 0x8

    invoke-direct {p0}, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->limitExceeded()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lorg/bouncycastle/crypto/MaxBytesExceededException;

    const-string v1, "2^70 byte limit per IV; Change IV"

    invoke-direct {v0, v1}, Lorg/bouncycastle/crypto/MaxBytesExceededException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget v0, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->c:I

    if-nez v0, :cond_1

    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->d:[I

    iget-object v1, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->f:[B

    invoke-direct {p0, v0, v1}, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->salsa20WordToByte([I[B)V

    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->d:[I

    aget v1, v0, v2

    add-int/lit8 v1, v1, 0x1

    aput v1, v0, v2

    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->d:[I

    aget v0, v0, v2

    if-nez v0, :cond_1

    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->d:[I

    const/16 v1, 0x9

    aget v2, v0, v1

    add-int/lit8 v2, v2, 0x1

    aput v2, v0, v1

    :cond_1
    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->f:[B

    iget v1, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->c:I

    aget-byte v0, v0, v1

    xor-int/2addr v0, p1

    int-to-byte v0, v0

    iget v1, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->c:I

    add-int/lit8 v1, v1, 0x1

    and-int/lit8 v1, v1, 0x3f

    iput v1, p0, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->c:I

    return v0
.end method
