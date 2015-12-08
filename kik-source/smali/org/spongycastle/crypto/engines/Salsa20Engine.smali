.class public Lorg/spongycastle/crypto/engines/Salsa20Engine;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/spongycastle/crypto/StreamCipher;


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

    .prologue
    .line 23
    const-string v0, "expand 32-byte k"

    invoke-static {v0}, Lorg/spongycastle/util/Strings;->d(Ljava/lang/String;)[B

    move-result-object v0

    sput-object v0, Lorg/spongycastle/crypto/engines/Salsa20Engine;->a:[B

    .line 24
    const-string v0, "expand 16-byte k"

    invoke-static {v0}, Lorg/spongycastle/util/Strings;->d(Ljava/lang/String;)[B

    move-result-object v0

    sput-object v0, Lorg/spongycastle/crypto/engines/Salsa20Engine;->b:[B

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .prologue
    const/4 v3, 0x0

    const/16 v2, 0x10

    const/4 v1, 0x0

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    iput v1, p0, Lorg/spongycastle/crypto/engines/Salsa20Engine;->c:I

    .line 31
    new-array v0, v2, [I

    iput-object v0, p0, Lorg/spongycastle/crypto/engines/Salsa20Engine;->d:[I

    .line 32
    new-array v0, v2, [I

    iput-object v0, p0, Lorg/spongycastle/crypto/engines/Salsa20Engine;->e:[I

    .line 33
    const/16 v0, 0x40

    new-array v0, v0, [B

    iput-object v0, p0, Lorg/spongycastle/crypto/engines/Salsa20Engine;->f:[B

    iput-object v3, p0, Lorg/spongycastle/crypto/engines/Salsa20Engine;->g:[B

    iput-object v3, p0, Lorg/spongycastle/crypto/engines/Salsa20Engine;->h:[B

    .line 36
    iput-boolean v1, p0, Lorg/spongycastle/crypto/engines/Salsa20Engine;->i:Z

    return-void
.end method

.method private static a(II)I
    .locals 2

    .prologue
    .line 279
    shl-int v0, p0, p1

    neg-int v1, p1

    ushr-int v1, p0, v1

    or-int/2addr v0, v1

    return v0
.end method

.method private a([B)V
    .locals 12

    .prologue
    const/16 v11, 0x12

    const/4 v1, 0x0

    const/16 v10, 0xd

    const/16 v9, 0x9

    const/4 v8, 0x7

    .line 212
    iget-object v2, p0, Lorg/spongycastle/crypto/engines/Salsa20Engine;->d:[I

    iget-object v3, p0, Lorg/spongycastle/crypto/engines/Salsa20Engine;->e:[I

    array-length v0, v2

    invoke-static {v2, v1, v3, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    const/16 v0, 0x14

    :goto_0
    if-lez v0, :cond_0

    const/4 v4, 0x4

    aget v5, v3, v4

    aget v6, v3, v1

    const/16 v7, 0xc

    aget v7, v3, v7

    add-int/2addr v6, v7

    invoke-static {v6, v8}, Lorg/spongycastle/crypto/engines/Salsa20Engine;->a(II)I

    move-result v6

    xor-int/2addr v5, v6

    aput v5, v3, v4

    const/16 v4, 0x8

    aget v5, v3, v4

    const/4 v6, 0x4

    aget v6, v3, v6

    aget v7, v3, v1

    add-int/2addr v6, v7

    invoke-static {v6, v9}, Lorg/spongycastle/crypto/engines/Salsa20Engine;->a(II)I

    move-result v6

    xor-int/2addr v5, v6

    aput v5, v3, v4

    const/16 v4, 0xc

    aget v5, v3, v4

    const/16 v6, 0x8

    aget v6, v3, v6

    const/4 v7, 0x4

    aget v7, v3, v7

    add-int/2addr v6, v7

    invoke-static {v6, v10}, Lorg/spongycastle/crypto/engines/Salsa20Engine;->a(II)I

    move-result v6

    xor-int/2addr v5, v6

    aput v5, v3, v4

    aget v4, v3, v1

    const/16 v5, 0xc

    aget v5, v3, v5

    const/16 v6, 0x8

    aget v6, v3, v6

    add-int/2addr v5, v6

    invoke-static {v5, v11}, Lorg/spongycastle/crypto/engines/Salsa20Engine;->a(II)I

    move-result v5

    xor-int/2addr v4, v5

    aput v4, v3, v1

    aget v4, v3, v9

    const/4 v5, 0x5

    aget v5, v3, v5

    const/4 v6, 0x1

    aget v6, v3, v6

    add-int/2addr v5, v6

    invoke-static {v5, v8}, Lorg/spongycastle/crypto/engines/Salsa20Engine;->a(II)I

    move-result v5

    xor-int/2addr v4, v5

    aput v4, v3, v9

    aget v4, v3, v10

    aget v5, v3, v9

    const/4 v6, 0x5

    aget v6, v3, v6

    add-int/2addr v5, v6

    invoke-static {v5, v9}, Lorg/spongycastle/crypto/engines/Salsa20Engine;->a(II)I

    move-result v5

    xor-int/2addr v4, v5

    aput v4, v3, v10

    const/4 v4, 0x1

    aget v5, v3, v4

    aget v6, v3, v10

    aget v7, v3, v9

    add-int/2addr v6, v7

    invoke-static {v6, v10}, Lorg/spongycastle/crypto/engines/Salsa20Engine;->a(II)I

    move-result v6

    xor-int/2addr v5, v6

    aput v5, v3, v4

    const/4 v4, 0x5

    aget v5, v3, v4

    const/4 v6, 0x1

    aget v6, v3, v6

    aget v7, v3, v10

    add-int/2addr v6, v7

    invoke-static {v6, v11}, Lorg/spongycastle/crypto/engines/Salsa20Engine;->a(II)I

    move-result v6

    xor-int/2addr v5, v6

    aput v5, v3, v4

    const/16 v4, 0xe

    aget v5, v3, v4

    const/16 v6, 0xa

    aget v6, v3, v6

    const/4 v7, 0x6

    aget v7, v3, v7

    add-int/2addr v6, v7

    invoke-static {v6, v8}, Lorg/spongycastle/crypto/engines/Salsa20Engine;->a(II)I

    move-result v6

    xor-int/2addr v5, v6

    aput v5, v3, v4

    const/4 v4, 0x2

    aget v5, v3, v4

    const/16 v6, 0xe

    aget v6, v3, v6

    const/16 v7, 0xa

    aget v7, v3, v7

    add-int/2addr v6, v7

    invoke-static {v6, v9}, Lorg/spongycastle/crypto/engines/Salsa20Engine;->a(II)I

    move-result v6

    xor-int/2addr v5, v6

    aput v5, v3, v4

    const/4 v4, 0x6

    aget v5, v3, v4

    const/4 v6, 0x2

    aget v6, v3, v6

    const/16 v7, 0xe

    aget v7, v3, v7

    add-int/2addr v6, v7

    invoke-static {v6, v10}, Lorg/spongycastle/crypto/engines/Salsa20Engine;->a(II)I

    move-result v6

    xor-int/2addr v5, v6

    aput v5, v3, v4

    const/16 v4, 0xa

    aget v5, v3, v4

    const/4 v6, 0x6

    aget v6, v3, v6

    const/4 v7, 0x2

    aget v7, v3, v7

    add-int/2addr v6, v7

    invoke-static {v6, v11}, Lorg/spongycastle/crypto/engines/Salsa20Engine;->a(II)I

    move-result v6

    xor-int/2addr v5, v6

    aput v5, v3, v4

    const/4 v4, 0x3

    aget v5, v3, v4

    const/16 v6, 0xf

    aget v6, v3, v6

    const/16 v7, 0xb

    aget v7, v3, v7

    add-int/2addr v6, v7

    invoke-static {v6, v8}, Lorg/spongycastle/crypto/engines/Salsa20Engine;->a(II)I

    move-result v6

    xor-int/2addr v5, v6

    aput v5, v3, v4

    aget v4, v3, v8

    const/4 v5, 0x3

    aget v5, v3, v5

    const/16 v6, 0xf

    aget v6, v3, v6

    add-int/2addr v5, v6

    invoke-static {v5, v9}, Lorg/spongycastle/crypto/engines/Salsa20Engine;->a(II)I

    move-result v5

    xor-int/2addr v4, v5

    aput v4, v3, v8

    const/16 v4, 0xb

    aget v5, v3, v4

    aget v6, v3, v8

    const/4 v7, 0x3

    aget v7, v3, v7

    add-int/2addr v6, v7

    invoke-static {v6, v10}, Lorg/spongycastle/crypto/engines/Salsa20Engine;->a(II)I

    move-result v6

    xor-int/2addr v5, v6

    aput v5, v3, v4

    const/16 v4, 0xf

    aget v5, v3, v4

    const/16 v6, 0xb

    aget v6, v3, v6

    aget v7, v3, v8

    add-int/2addr v6, v7

    invoke-static {v6, v11}, Lorg/spongycastle/crypto/engines/Salsa20Engine;->a(II)I

    move-result v6

    xor-int/2addr v5, v6

    aput v5, v3, v4

    const/4 v4, 0x1

    aget v5, v3, v4

    aget v6, v3, v1

    const/4 v7, 0x3

    aget v7, v3, v7

    add-int/2addr v6, v7

    invoke-static {v6, v8}, Lorg/spongycastle/crypto/engines/Salsa20Engine;->a(II)I

    move-result v6

    xor-int/2addr v5, v6

    aput v5, v3, v4

    const/4 v4, 0x2

    aget v5, v3, v4

    const/4 v6, 0x1

    aget v6, v3, v6

    aget v7, v3, v1

    add-int/2addr v6, v7

    invoke-static {v6, v9}, Lorg/spongycastle/crypto/engines/Salsa20Engine;->a(II)I

    move-result v6

    xor-int/2addr v5, v6

    aput v5, v3, v4

    const/4 v4, 0x3

    aget v5, v3, v4

    const/4 v6, 0x2

    aget v6, v3, v6

    const/4 v7, 0x1

    aget v7, v3, v7

    add-int/2addr v6, v7

    invoke-static {v6, v10}, Lorg/spongycastle/crypto/engines/Salsa20Engine;->a(II)I

    move-result v6

    xor-int/2addr v5, v6

    aput v5, v3, v4

    aget v4, v3, v1

    const/4 v5, 0x3

    aget v5, v3, v5

    const/4 v6, 0x2

    aget v6, v3, v6

    add-int/2addr v5, v6

    invoke-static {v5, v11}, Lorg/spongycastle/crypto/engines/Salsa20Engine;->a(II)I

    move-result v5

    xor-int/2addr v4, v5

    aput v4, v3, v1

    const/4 v4, 0x6

    aget v5, v3, v4

    const/4 v6, 0x5

    aget v6, v3, v6

    const/4 v7, 0x4

    aget v7, v3, v7

    add-int/2addr v6, v7

    invoke-static {v6, v8}, Lorg/spongycastle/crypto/engines/Salsa20Engine;->a(II)I

    move-result v6

    xor-int/2addr v5, v6

    aput v5, v3, v4

    aget v4, v3, v8

    const/4 v5, 0x6

    aget v5, v3, v5

    const/4 v6, 0x5

    aget v6, v3, v6

    add-int/2addr v5, v6

    invoke-static {v5, v9}, Lorg/spongycastle/crypto/engines/Salsa20Engine;->a(II)I

    move-result v5

    xor-int/2addr v4, v5

    aput v4, v3, v8

    const/4 v4, 0x4

    aget v5, v3, v4

    aget v6, v3, v8

    const/4 v7, 0x6

    aget v7, v3, v7

    add-int/2addr v6, v7

    invoke-static {v6, v10}, Lorg/spongycastle/crypto/engines/Salsa20Engine;->a(II)I

    move-result v6

    xor-int/2addr v5, v6

    aput v5, v3, v4

    const/4 v4, 0x5

    aget v5, v3, v4

    const/4 v6, 0x4

    aget v6, v3, v6

    aget v7, v3, v8

    add-int/2addr v6, v7

    invoke-static {v6, v11}, Lorg/spongycastle/crypto/engines/Salsa20Engine;->a(II)I

    move-result v6

    xor-int/2addr v5, v6

    aput v5, v3, v4

    const/16 v4, 0xb

    aget v5, v3, v4

    const/16 v6, 0xa

    aget v6, v3, v6

    aget v7, v3, v9

    add-int/2addr v6, v7

    invoke-static {v6, v8}, Lorg/spongycastle/crypto/engines/Salsa20Engine;->a(II)I

    move-result v6

    xor-int/2addr v5, v6

    aput v5, v3, v4

    const/16 v4, 0x8

    aget v5, v3, v4

    const/16 v6, 0xb

    aget v6, v3, v6

    const/16 v7, 0xa

    aget v7, v3, v7

    add-int/2addr v6, v7

    invoke-static {v6, v9}, Lorg/spongycastle/crypto/engines/Salsa20Engine;->a(II)I

    move-result v6

    xor-int/2addr v5, v6

    aput v5, v3, v4

    aget v4, v3, v9

    const/16 v5, 0x8

    aget v5, v3, v5

    const/16 v6, 0xb

    aget v6, v3, v6

    add-int/2addr v5, v6

    invoke-static {v5, v10}, Lorg/spongycastle/crypto/engines/Salsa20Engine;->a(II)I

    move-result v5

    xor-int/2addr v4, v5

    aput v4, v3, v9

    const/16 v4, 0xa

    aget v5, v3, v4

    aget v6, v3, v9

    const/16 v7, 0x8

    aget v7, v3, v7

    add-int/2addr v6, v7

    invoke-static {v6, v11}, Lorg/spongycastle/crypto/engines/Salsa20Engine;->a(II)I

    move-result v6

    xor-int/2addr v5, v6

    aput v5, v3, v4

    const/16 v4, 0xc

    aget v5, v3, v4

    const/16 v6, 0xf

    aget v6, v3, v6

    const/16 v7, 0xe

    aget v7, v3, v7

    add-int/2addr v6, v7

    invoke-static {v6, v8}, Lorg/spongycastle/crypto/engines/Salsa20Engine;->a(II)I

    move-result v6

    xor-int/2addr v5, v6

    aput v5, v3, v4

    aget v4, v3, v10

    const/16 v5, 0xc

    aget v5, v3, v5

    const/16 v6, 0xf

    aget v6, v3, v6

    add-int/2addr v5, v6

    invoke-static {v5, v9}, Lorg/spongycastle/crypto/engines/Salsa20Engine;->a(II)I

    move-result v5

    xor-int/2addr v4, v5

    aput v4, v3, v10

    const/16 v4, 0xe

    aget v5, v3, v4

    aget v6, v3, v10

    const/16 v7, 0xc

    aget v7, v3, v7

    add-int/2addr v6, v7

    invoke-static {v6, v10}, Lorg/spongycastle/crypto/engines/Salsa20Engine;->a(II)I

    move-result v6

    xor-int/2addr v5, v6

    aput v5, v3, v4

    const/16 v4, 0xf

    aget v5, v3, v4

    const/16 v6, 0xe

    aget v6, v3, v6

    aget v7, v3, v10

    add-int/2addr v6, v7

    invoke-static {v6, v11}, Lorg/spongycastle/crypto/engines/Salsa20Engine;->a(II)I

    move-result v6

    xor-int/2addr v5, v6

    aput v5, v3, v4

    add-int/lit8 v0, v0, -0x2

    goto/16 :goto_0

    :cond_0
    move v0, v1

    :goto_1
    const/16 v4, 0x10

    if-ge v0, v4, :cond_1

    aget v4, v3, v0

    aget v5, v2, v0

    add-int/2addr v4, v5

    aput v4, v3, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 213
    :cond_1
    iget-object v0, p0, Lorg/spongycastle/crypto/engines/Salsa20Engine;->e:[I

    invoke-static {v0, p1, v1}, Lorg/spongycastle/crypto/util/Pack;->b([I[BI)V

    .line 214
    return-void
.end method

.method private a([B[B)V
    .locals 11

    .prologue
    const/4 v10, 0x1

    const/16 v9, 0xc

    const/16 v8, 0x8

    const/4 v7, 0x4

    const/4 v2, 0x0

    .line 169
    iput-object p1, p0, Lorg/spongycastle/crypto/engines/Salsa20Engine;->g:[B

    .line 170
    iput-object p2, p0, Lorg/spongycastle/crypto/engines/Salsa20Engine;->h:[B

    .line 172
    iput v2, p0, Lorg/spongycastle/crypto/engines/Salsa20Engine;->c:I

    .line 173
    iput v2, p0, Lorg/spongycastle/crypto/engines/Salsa20Engine;->j:I

    iput v2, p0, Lorg/spongycastle/crypto/engines/Salsa20Engine;->k:I

    iput v2, p0, Lorg/spongycastle/crypto/engines/Salsa20Engine;->l:I

    .line 178
    iget-object v0, p0, Lorg/spongycastle/crypto/engines/Salsa20Engine;->d:[I

    iget-object v1, p0, Lorg/spongycastle/crypto/engines/Salsa20Engine;->g:[B

    invoke-static {v1, v2}, Lorg/spongycastle/crypto/util/Pack;->c([BI)I

    move-result v1

    aput v1, v0, v10

    .line 179
    iget-object v0, p0, Lorg/spongycastle/crypto/engines/Salsa20Engine;->d:[I

    const/4 v1, 0x2

    iget-object v3, p0, Lorg/spongycastle/crypto/engines/Salsa20Engine;->g:[B

    invoke-static {v3, v7}, Lorg/spongycastle/crypto/util/Pack;->c([BI)I

    move-result v3

    aput v3, v0, v1

    .line 180
    iget-object v0, p0, Lorg/spongycastle/crypto/engines/Salsa20Engine;->d:[I

    const/4 v1, 0x3

    iget-object v3, p0, Lorg/spongycastle/crypto/engines/Salsa20Engine;->g:[B

    invoke-static {v3, v8}, Lorg/spongycastle/crypto/util/Pack;->c([BI)I

    move-result v3

    aput v3, v0, v1

    .line 181
    iget-object v0, p0, Lorg/spongycastle/crypto/engines/Salsa20Engine;->d:[I

    iget-object v1, p0, Lorg/spongycastle/crypto/engines/Salsa20Engine;->g:[B

    invoke-static {v1, v9}, Lorg/spongycastle/crypto/util/Pack;->c([BI)I

    move-result v1

    aput v1, v0, v7

    .line 183
    iget-object v0, p0, Lorg/spongycastle/crypto/engines/Salsa20Engine;->g:[B

    array-length v0, v0

    const/16 v1, 0x20

    if-ne v0, v1, :cond_0

    .line 185
    sget-object v0, Lorg/spongycastle/crypto/engines/Salsa20Engine;->a:[B

    .line 186
    const/16 v1, 0x10

    .line 193
    :goto_0
    iget-object v3, p0, Lorg/spongycastle/crypto/engines/Salsa20Engine;->d:[I

    const/16 v4, 0xb

    iget-object v5, p0, Lorg/spongycastle/crypto/engines/Salsa20Engine;->g:[B

    invoke-static {v5, v1}, Lorg/spongycastle/crypto/util/Pack;->c([BI)I

    move-result v5

    aput v5, v3, v4

    .line 194
    iget-object v3, p0, Lorg/spongycastle/crypto/engines/Salsa20Engine;->d:[I

    iget-object v4, p0, Lorg/spongycastle/crypto/engines/Salsa20Engine;->g:[B

    add-int/lit8 v5, v1, 0x4

    invoke-static {v4, v5}, Lorg/spongycastle/crypto/util/Pack;->c([BI)I

    move-result v4

    aput v4, v3, v9

    .line 195
    iget-object v3, p0, Lorg/spongycastle/crypto/engines/Salsa20Engine;->d:[I

    const/16 v4, 0xd

    iget-object v5, p0, Lorg/spongycastle/crypto/engines/Salsa20Engine;->g:[B

    add-int/lit8 v6, v1, 0x8

    invoke-static {v5, v6}, Lorg/spongycastle/crypto/util/Pack;->c([BI)I

    move-result v5

    aput v5, v3, v4

    .line 196
    iget-object v3, p0, Lorg/spongycastle/crypto/engines/Salsa20Engine;->d:[I

    const/16 v4, 0xe

    iget-object v5, p0, Lorg/spongycastle/crypto/engines/Salsa20Engine;->g:[B

    add-int/lit8 v1, v1, 0xc

    invoke-static {v5, v1}, Lorg/spongycastle/crypto/util/Pack;->c([BI)I

    move-result v1

    aput v1, v3, v4

    .line 197
    iget-object v1, p0, Lorg/spongycastle/crypto/engines/Salsa20Engine;->d:[I

    invoke-static {v0, v2}, Lorg/spongycastle/crypto/util/Pack;->c([BI)I

    move-result v3

    aput v3, v1, v2

    .line 198
    iget-object v1, p0, Lorg/spongycastle/crypto/engines/Salsa20Engine;->d:[I

    const/4 v3, 0x5

    invoke-static {v0, v7}, Lorg/spongycastle/crypto/util/Pack;->c([BI)I

    move-result v4

    aput v4, v1, v3

    .line 199
    iget-object v1, p0, Lorg/spongycastle/crypto/engines/Salsa20Engine;->d:[I

    const/16 v3, 0xa

    invoke-static {v0, v8}, Lorg/spongycastle/crypto/util/Pack;->c([BI)I

    move-result v4

    aput v4, v1, v3

    .line 200
    iget-object v1, p0, Lorg/spongycastle/crypto/engines/Salsa20Engine;->d:[I

    const/16 v3, 0xf

    invoke-static {v0, v9}, Lorg/spongycastle/crypto/util/Pack;->c([BI)I

    move-result v0

    aput v0, v1, v3

    .line 203
    iget-object v0, p0, Lorg/spongycastle/crypto/engines/Salsa20Engine;->d:[I

    const/4 v1, 0x6

    iget-object v3, p0, Lorg/spongycastle/crypto/engines/Salsa20Engine;->h:[B

    invoke-static {v3, v2}, Lorg/spongycastle/crypto/util/Pack;->c([BI)I

    move-result v3

    aput v3, v0, v1

    .line 204
    iget-object v0, p0, Lorg/spongycastle/crypto/engines/Salsa20Engine;->d:[I

    const/4 v1, 0x7

    iget-object v3, p0, Lorg/spongycastle/crypto/engines/Salsa20Engine;->h:[B

    invoke-static {v3, v7}, Lorg/spongycastle/crypto/util/Pack;->c([BI)I

    move-result v3

    aput v3, v0, v1

    .line 205
    iget-object v0, p0, Lorg/spongycastle/crypto/engines/Salsa20Engine;->d:[I

    iget-object v1, p0, Lorg/spongycastle/crypto/engines/Salsa20Engine;->d:[I

    const/16 v3, 0x9

    aput v2, v1, v3

    aput v2, v0, v8

    .line 207
    iput-boolean v10, p0, Lorg/spongycastle/crypto/engines/Salsa20Engine;->i:Z

    .line 208
    return-void

    .line 190
    :cond_0
    sget-object v0, Lorg/spongycastle/crypto/engines/Salsa20Engine;->b:[B

    move v1, v2

    goto :goto_0
.end method


# virtual methods
.method public final a(B)B
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 95
    iget v1, p0, Lorg/spongycastle/crypto/engines/Salsa20Engine;->j:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lorg/spongycastle/crypto/engines/Salsa20Engine;->j:I

    if-nez v1, :cond_0

    iget v1, p0, Lorg/spongycastle/crypto/engines/Salsa20Engine;->k:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lorg/spongycastle/crypto/engines/Salsa20Engine;->k:I

    if-nez v1, :cond_0

    iget v1, p0, Lorg/spongycastle/crypto/engines/Salsa20Engine;->l:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lorg/spongycastle/crypto/engines/Salsa20Engine;->l:I

    and-int/lit8 v1, v1, 0x20

    if-eqz v1, :cond_0

    const/4 v0, 0x1

    :cond_0
    if-eqz v0, :cond_1

    .line 97
    new-instance v0, Lorg/spongycastle/crypto/MaxBytesExceededException;

    const-string v1, "2^70 byte limit per IV; Change IV"

    invoke-direct {v0, v1}, Lorg/spongycastle/crypto/MaxBytesExceededException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 100
    :cond_1
    iget v0, p0, Lorg/spongycastle/crypto/engines/Salsa20Engine;->c:I

    if-nez v0, :cond_2

    .line 102
    iget-object v0, p0, Lorg/spongycastle/crypto/engines/Salsa20Engine;->f:[B

    invoke-direct {p0, v0}, Lorg/spongycastle/crypto/engines/Salsa20Engine;->a([B)V

    .line 104
    iget-object v0, p0, Lorg/spongycastle/crypto/engines/Salsa20Engine;->d:[I

    const/16 v1, 0x8

    aget v2, v0, v1

    add-int/lit8 v2, v2, 0x1

    aput v2, v0, v1

    if-nez v2, :cond_2

    .line 106
    iget-object v0, p0, Lorg/spongycastle/crypto/engines/Salsa20Engine;->d:[I

    const/16 v1, 0x9

    aget v2, v0, v1

    add-int/lit8 v2, v2, 0x1

    aput v2, v0, v1

    .line 110
    :cond_2
    iget-object v0, p0, Lorg/spongycastle/crypto/engines/Salsa20Engine;->f:[B

    iget v1, p0, Lorg/spongycastle/crypto/engines/Salsa20Engine;->c:I

    aget-byte v0, v0, v1

    xor-int/2addr v0, p1

    int-to-byte v0, v0

    .line 111
    iget v1, p0, Lorg/spongycastle/crypto/engines/Salsa20Engine;->c:I

    add-int/lit8 v1, v1, 0x1

    and-int/lit8 v1, v1, 0x3f

    iput v1, p0, Lorg/spongycastle/crypto/engines/Salsa20Engine;->c:I

    .line 113
    return v0
.end method

.method public final a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 90
    const-string v0, "Salsa20"

    return-object v0
.end method

.method public final a(ZLorg/spongycastle/crypto/CipherParameters;)V
    .locals 3

    .prologue
    .line 61
    instance-of v0, p2, Lorg/spongycastle/crypto/params/ParametersWithIV;

    if-nez v0, :cond_0

    .line 63
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Salsa20 Init parameters must include an IV"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 66
    :cond_0
    check-cast p2, Lorg/spongycastle/crypto/params/ParametersWithIV;

    .line 68
    invoke-virtual {p2}, Lorg/spongycastle/crypto/params/ParametersWithIV;->a()[B

    move-result-object v1

    .line 70
    if-eqz v1, :cond_1

    array-length v0, v1

    const/16 v2, 0x8

    if-eq v0, v2, :cond_2

    .line 72
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Salsa20 requires exactly 8 bytes of IV"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 75
    :cond_2
    invoke-virtual {p2}, Lorg/spongycastle/crypto/params/ParametersWithIV;->b()Lorg/spongycastle/crypto/CipherParameters;

    move-result-object v0

    instance-of v0, v0, Lorg/spongycastle/crypto/params/KeyParameter;

    if-nez v0, :cond_3

    .line 77
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Salsa20 Init parameters must include a key"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 80
    :cond_3
    invoke-virtual {p2}, Lorg/spongycastle/crypto/params/ParametersWithIV;->b()Lorg/spongycastle/crypto/CipherParameters;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/crypto/params/KeyParameter;

    .line 82
    invoke-virtual {v0}, Lorg/spongycastle/crypto/params/KeyParameter;->a()[B

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/crypto/engines/Salsa20Engine;->g:[B

    .line 83
    iput-object v1, p0, Lorg/spongycastle/crypto/engines/Salsa20Engine;->h:[B

    .line 85
    iget-object v0, p0, Lorg/spongycastle/crypto/engines/Salsa20Engine;->g:[B

    iget-object v1, p0, Lorg/spongycastle/crypto/engines/Salsa20Engine;->h:[B

    invoke-direct {p0, v0, v1}, Lorg/spongycastle/crypto/engines/Salsa20Engine;->a([B[B)V

    .line 86
    return-void
.end method

.method public final a([BII[BI)V
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 123
    iget-boolean v1, p0, Lorg/spongycastle/crypto/engines/Salsa20Engine;->i:Z

    if-nez v1, :cond_0

    .line 125
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Salsa20 not initialised"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 128
    :cond_0
    add-int v1, p2, p3

    array-length v2, p1

    if-le v1, v2, :cond_1

    .line 130
    new-instance v0, Lorg/spongycastle/crypto/DataLengthException;

    const-string v1, "input buffer too short"

    invoke-direct {v0, v1}, Lorg/spongycastle/crypto/DataLengthException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 133
    :cond_1
    add-int v1, p5, p3

    array-length v2, p4

    if-le v1, v2, :cond_2

    .line 135
    new-instance v0, Lorg/spongycastle/crypto/DataLengthException;

    const-string v1, "output buffer too short"

    invoke-direct {v0, v1}, Lorg/spongycastle/crypto/DataLengthException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 138
    :cond_2
    iget v1, p0, Lorg/spongycastle/crypto/engines/Salsa20Engine;->j:I

    add-int/2addr v1, p3

    iput v1, p0, Lorg/spongycastle/crypto/engines/Salsa20Engine;->j:I

    iget v1, p0, Lorg/spongycastle/crypto/engines/Salsa20Engine;->j:I

    if-ge v1, p3, :cond_4

    iget v1, p0, Lorg/spongycastle/crypto/engines/Salsa20Engine;->j:I

    if-ltz v1, :cond_4

    iget v1, p0, Lorg/spongycastle/crypto/engines/Salsa20Engine;->k:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lorg/spongycastle/crypto/engines/Salsa20Engine;->k:I

    if-nez v1, :cond_4

    iget v1, p0, Lorg/spongycastle/crypto/engines/Salsa20Engine;->l:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lorg/spongycastle/crypto/engines/Salsa20Engine;->l:I

    and-int/lit8 v1, v1, 0x20

    if-eqz v1, :cond_3

    const/4 v1, 0x1

    :goto_0
    if-eqz v1, :cond_5

    .line 140
    new-instance v0, Lorg/spongycastle/crypto/MaxBytesExceededException;

    const-string v1, "2^70 byte limit per IV would be exceeded; Change IV"

    invoke-direct {v0, v1}, Lorg/spongycastle/crypto/MaxBytesExceededException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    move v1, v0

    .line 138
    goto :goto_0

    :cond_4
    move v1, v0

    goto :goto_0

    .line 143
    :cond_5
    :goto_1
    if-ge v0, p3, :cond_7

    .line 145
    iget v1, p0, Lorg/spongycastle/crypto/engines/Salsa20Engine;->c:I

    if-nez v1, :cond_6

    .line 147
    iget-object v1, p0, Lorg/spongycastle/crypto/engines/Salsa20Engine;->f:[B

    invoke-direct {p0, v1}, Lorg/spongycastle/crypto/engines/Salsa20Engine;->a([B)V

    .line 149
    iget-object v1, p0, Lorg/spongycastle/crypto/engines/Salsa20Engine;->d:[I

    const/16 v2, 0x8

    aget v3, v1, v2

    add-int/lit8 v3, v3, 0x1

    aput v3, v1, v2

    if-nez v3, :cond_6

    .line 151
    iget-object v1, p0, Lorg/spongycastle/crypto/engines/Salsa20Engine;->d:[I

    const/16 v2, 0x9

    aget v3, v1, v2

    add-int/lit8 v3, v3, 0x1

    aput v3, v1, v2

    .line 155
    :cond_6
    add-int v1, v0, p5

    iget-object v2, p0, Lorg/spongycastle/crypto/engines/Salsa20Engine;->f:[B

    iget v3, p0, Lorg/spongycastle/crypto/engines/Salsa20Engine;->c:I

    aget-byte v2, v2, v3

    add-int v3, v0, p2

    aget-byte v3, p1, v3

    xor-int/2addr v2, v3

    int-to-byte v2, v2

    aput-byte v2, p4, v1

    .line 156
    iget v1, p0, Lorg/spongycastle/crypto/engines/Salsa20Engine;->c:I

    add-int/lit8 v1, v1, 0x1

    and-int/lit8 v1, v1, 0x3f

    iput v1, p0, Lorg/spongycastle/crypto/engines/Salsa20Engine;->c:I

    .line 143
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 158
    :cond_7
    return-void
.end method

.method public final b()V
    .locals 2

    .prologue
    .line 162
    iget-object v0, p0, Lorg/spongycastle/crypto/engines/Salsa20Engine;->g:[B

    iget-object v1, p0, Lorg/spongycastle/crypto/engines/Salsa20Engine;->h:[B

    invoke-direct {p0, v0, v1}, Lorg/spongycastle/crypto/engines/Salsa20Engine;->a([B[B)V

    .line 163
    return-void
.end method
