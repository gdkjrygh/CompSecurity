.class public Lorg/spongycastle/crypto/digests/RIPEMD128Digest;
.super Lorg/spongycastle/crypto/digests/GeneralDigest;
.source "SourceFile"


# instance fields
.field private a:I

.field private b:I

.field private c:I

.field private d:I

.field private e:[I

.field private f:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 21
    invoke-direct {p0}, Lorg/spongycastle/crypto/digests/GeneralDigest;-><init>()V

    .line 14
    const/16 v0, 0x10

    new-array v0, v0, [I

    iput-object v0, p0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e:[I

    .line 22
    invoke-virtual {p0}, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->c()V

    .line 23
    return-void
.end method

.method public constructor <init>(Lorg/spongycastle/crypto/digests/RIPEMD128Digest;)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 31
    invoke-direct {p0, p1}, Lorg/spongycastle/crypto/digests/GeneralDigest;-><init>(Lorg/spongycastle/crypto/digests/GeneralDigest;)V

    .line 14
    const/16 v0, 0x10

    new-array v0, v0, [I

    iput-object v0, p0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e:[I

    .line 33
    iget v0, p1, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->a:I

    iput v0, p0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->a:I

    .line 34
    iget v0, p1, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->b:I

    iput v0, p0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->b:I

    .line 35
    iget v0, p1, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->c:I

    iput v0, p0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->c:I

    .line 36
    iget v0, p1, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->d:I

    iput v0, p0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->d:I

    .line 38
    iget-object v0, p1, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e:[I

    iget-object v1, p0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e:[I

    iget-object v2, p1, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e:[I

    array-length v2, v2

    invoke-static {v0, v3, v1, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 39
    iget v0, p1, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->f:I

    iput v0, p0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->f:I

    .line 40
    return-void
.end method

.method private static a(II)I
    .locals 2

    .prologue
    .line 131
    shl-int v0, p0, p1

    rsub-int/lit8 v1, p1, 0x20

    ushr-int v1, p0, v1

    or-int/2addr v0, v1

    return v0
.end method

.method private static a(III)I
    .locals 2

    .prologue
    .line 157
    and-int v0, p0, p1

    xor-int/lit8 v1, p0, -0x1

    and-int/2addr v1, p2

    or-int/2addr v0, v1

    return v0
.end method

.method private static a(IIIIII)I
    .locals 1

    .prologue
    .line 190
    xor-int v0, p1, p2

    xor-int/2addr v0, p3

    add-int/2addr v0, p0

    add-int/2addr v0, p4

    invoke-static {v0, p5}, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->a(II)I

    move-result v0

    return v0
.end method

.method private static a(I[BI)V
    .locals 2

    .prologue
    .line 82
    int-to-byte v0, p0

    aput-byte v0, p1, p2

    .line 83
    add-int/lit8 v0, p2, 0x1

    ushr-int/lit8 v1, p0, 0x8

    int-to-byte v1, v1

    aput-byte v1, p1, v0

    .line 84
    add-int/lit8 v0, p2, 0x2

    ushr-int/lit8 v1, p0, 0x10

    int-to-byte v1, v1

    aput-byte v1, p1, v0

    .line 85
    add-int/lit8 v0, p2, 0x3

    ushr-int/lit8 v1, p0, 0x18

    int-to-byte v1, v1

    aput-byte v1, p1, v0

    .line 86
    return-void
.end method

.method private static b(III)I
    .locals 2

    .prologue
    .line 179
    and-int v0, p0, p2

    xor-int/lit8 v1, p2, -0x1

    and-int/2addr v1, p1

    or-int/2addr v0, v1

    return v0
.end method

.method private static b(IIIIII)I
    .locals 2

    .prologue
    .line 201
    invoke-static {p1, p2, p3}, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->a(III)I

    move-result v0

    add-int/2addr v0, p0

    add-int/2addr v0, p4

    const v1, 0x5a827999

    add-int/2addr v0, v1

    invoke-static {v0, p5}, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->a(II)I

    move-result v0

    return v0
.end method

.method private static c(IIIIII)I
    .locals 2

    .prologue
    .line 212
    xor-int/lit8 v0, p2, -0x1

    or-int/2addr v0, p1

    xor-int/2addr v0, p3

    add-int/2addr v0, p0

    add-int/2addr v0, p4

    const v1, 0x6ed9eba1

    add-int/2addr v0, v1

    invoke-static {v0, p5}, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->a(II)I

    move-result v0

    return v0
.end method

.method private static d(IIIIII)I
    .locals 2

    .prologue
    .line 223
    invoke-static {p1, p2, p3}, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->b(III)I

    move-result v0

    add-int/2addr v0, p0

    add-int/2addr v0, p4

    const v1, -0x70e44324

    add-int/2addr v0, v1

    invoke-static {v0, p5}, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->a(II)I

    move-result v0

    return v0
.end method

.method private static e(IIIIII)I
    .locals 1

    .prologue
    .line 234
    xor-int v0, p1, p2

    xor-int/2addr v0, p3

    add-int/2addr v0, p0

    add-int/2addr v0, p4

    invoke-static {v0, p5}, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->a(II)I

    move-result v0

    return v0
.end method

.method private static f(IIIIII)I
    .locals 2

    .prologue
    .line 245
    invoke-static {p1, p2, p3}, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->a(III)I

    move-result v0

    add-int/2addr v0, p0

    add-int/2addr v0, p4

    const v1, 0x6d703ef3

    add-int/2addr v0, v1

    invoke-static {v0, p5}, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->a(II)I

    move-result v0

    return v0
.end method

.method private static g(IIIIII)I
    .locals 2

    .prologue
    .line 256
    xor-int/lit8 v0, p2, -0x1

    or-int/2addr v0, p1

    xor-int/2addr v0, p3

    add-int/2addr v0, p0

    add-int/2addr v0, p4

    const v1, 0x5c4dd124

    add-int/2addr v0, v1

    invoke-static {v0, p5}, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->a(II)I

    move-result v0

    return v0
.end method

.method private static h(IIIIII)I
    .locals 2

    .prologue
    .line 267
    invoke-static {p1, p2, p3}, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->b(III)I

    move-result v0

    add-int/2addr v0, p0

    add-int/2addr v0, p4

    const v1, 0x50a28be6

    add-int/2addr v0, v1

    invoke-static {v0, p5}, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->a(II)I

    move-result v0

    return v0
.end method


# virtual methods
.method public final a([BI)I
    .locals 2

    .prologue
    .line 92
    invoke-virtual {p0}, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e()V

    .line 94
    iget v0, p0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->a:I

    invoke-static {v0, p1, p2}, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->a(I[BI)V

    .line 95
    iget v0, p0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->b:I

    add-int/lit8 v1, p2, 0x4

    invoke-static {v0, p1, v1}, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->a(I[BI)V

    .line 96
    iget v0, p0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->c:I

    add-int/lit8 v1, p2, 0x8

    invoke-static {v0, p1, v1}, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->a(I[BI)V

    .line 97
    iget v0, p0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->d:I

    add-int/lit8 v1, p2, 0xc

    invoke-static {v0, p1, v1}, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->a(I[BI)V

    .line 99
    invoke-virtual {p0}, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->c()V

    .line 101
    const/16 v0, 0x10

    return v0
.end method

.method public final a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 44
    const-string v0, "RIPEMD128"

    return-object v0
.end method

.method protected final a(J)V
    .locals 5

    .prologue
    const/16 v4, 0xe

    .line 68
    iget v0, p0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->f:I

    if-le v0, v4, :cond_0

    .line 70
    invoke-virtual {p0}, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->f()V

    .line 73
    :cond_0
    iget-object v0, p0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e:[I

    const-wide/16 v2, -0x1

    and-long/2addr v2, p1

    long-to-int v1, v2

    aput v1, v0, v4

    .line 74
    iget-object v0, p0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e:[I

    const/16 v1, 0xf

    const/16 v2, 0x20

    ushr-long v2, p1, v2

    long-to-int v2, v2

    aput v2, v0, v1

    .line 75
    return-void
.end method

.method public final b()I
    .locals 1

    .prologue
    .line 49
    const/16 v0, 0x10

    return v0
.end method

.method protected final b([BI)V
    .locals 4

    .prologue
    .line 56
    iget-object v0, p0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e:[I

    iget v1, p0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->f:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->f:I

    aget-byte v2, p1, p2

    and-int/lit16 v2, v2, 0xff

    add-int/lit8 v3, p2, 0x1

    aget-byte v3, p1, v3

    and-int/lit16 v3, v3, 0xff

    shl-int/lit8 v3, v3, 0x8

    or-int/2addr v2, v3

    add-int/lit8 v3, p2, 0x2

    aget-byte v3, p1, v3

    and-int/lit16 v3, v3, 0xff

    shl-int/lit8 v3, v3, 0x10

    or-int/2addr v2, v3

    add-int/lit8 v3, p2, 0x3

    aget-byte v3, p1, v3

    and-int/lit16 v3, v3, 0xff

    shl-int/lit8 v3, v3, 0x18

    or-int/2addr v2, v3

    aput v2, v0, v1

    .line 59
    iget v0, p0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->f:I

    const/16 v1, 0x10

    if-ne v0, v1, :cond_0

    .line 61
    invoke-virtual {p0}, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->f()V

    .line 63
    :cond_0
    return-void
.end method

.method public final c()V
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 109
    invoke-super {p0}, Lorg/spongycastle/crypto/digests/GeneralDigest;->c()V

    .line 111
    const v0, 0x67452301

    iput v0, p0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->a:I

    .line 112
    const v0, -0x10325477

    iput v0, p0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->b:I

    .line 113
    const v0, -0x67452302

    iput v0, p0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->c:I

    .line 114
    const v0, 0x10325476

    iput v0, p0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->d:I

    .line 116
    iput v1, p0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->f:I

    move v0, v1

    .line 118
    :goto_0
    iget-object v2, p0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e:[I

    array-length v2, v2

    if-eq v0, v2, :cond_0

    .line 120
    iget-object v2, p0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e:[I

    aput v1, v2, v0

    .line 118
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 122
    :cond_0
    return-void
.end method

.method protected final f()V
    .locals 39

    .prologue
    .line 277
    move-object/from16 v0, p0

    iget v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->a:I

    .line 278
    move-object/from16 v0, p0

    iget v2, v0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->b:I

    .line 279
    move-object/from16 v0, p0

    iget v3, v0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->c:I

    .line 280
    move-object/from16 v0, p0

    iget v4, v0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->d:I

    .line 285
    move-object/from16 v0, p0

    iget-object v5, v0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e:[I

    const/4 v6, 0x0

    aget v5, v5, v6

    const/16 v6, 0xb

    invoke-static/range {v1 .. v6}, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->a(IIIIII)I

    move-result v5

    .line 286
    move-object/from16 v0, p0

    iget-object v6, v0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e:[I

    const/4 v7, 0x1

    aget v8, v6, v7

    const/16 v9, 0xe

    move v6, v2

    move v7, v3

    invoke-static/range {v4 .. v9}, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->a(IIIIII)I

    move-result v7

    .line 287
    move-object/from16 v0, p0

    iget-object v6, v0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e:[I

    const/4 v8, 0x2

    aget v10, v6, v8

    const/16 v11, 0xf

    move v6, v3

    move v8, v5

    move v9, v2

    invoke-static/range {v6 .. v11}, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->a(IIIIII)I

    move-result v9

    .line 288
    move-object/from16 v0, p0

    iget-object v6, v0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e:[I

    const/4 v8, 0x3

    aget v12, v6, v8

    const/16 v13, 0xc

    move v8, v2

    move v10, v7

    move v11, v5

    invoke-static/range {v8 .. v13}, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->a(IIIIII)I

    move-result v11

    .line 289
    move-object/from16 v0, p0

    iget-object v6, v0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e:[I

    const/4 v8, 0x4

    aget v14, v6, v8

    const/4 v15, 0x5

    move v10, v5

    move v12, v9

    move v13, v7

    invoke-static/range {v10 .. v15}, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->a(IIIIII)I

    move-result v13

    .line 290
    move-object/from16 v0, p0

    iget-object v5, v0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e:[I

    const/4 v6, 0x5

    aget v16, v5, v6

    const/16 v17, 0x8

    move v12, v7

    move v14, v11

    move v15, v9

    invoke-static/range {v12 .. v17}, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->a(IIIIII)I

    move-result v15

    .line 291
    move-object/from16 v0, p0

    iget-object v5, v0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e:[I

    const/4 v6, 0x6

    aget v18, v5, v6

    const/16 v19, 0x7

    move v14, v9

    move/from16 v16, v13

    move/from16 v17, v11

    invoke-static/range {v14 .. v19}, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->a(IIIIII)I

    move-result v6

    .line 292
    move-object/from16 v0, p0

    iget-object v5, v0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e:[I

    const/4 v7, 0x7

    aget v9, v5, v7

    const/16 v10, 0x9

    move v5, v11

    move v7, v15

    move v8, v13

    invoke-static/range {v5 .. v10}, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->a(IIIIII)I

    move-result v8

    .line 293
    move-object/from16 v0, p0

    iget-object v5, v0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e:[I

    const/16 v7, 0x8

    aget v11, v5, v7

    const/16 v12, 0xb

    move v7, v13

    move v9, v6

    move v10, v15

    invoke-static/range {v7 .. v12}, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->a(IIIIII)I

    move-result v16

    .line 294
    move-object/from16 v0, p0

    iget-object v5, v0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e:[I

    const/16 v7, 0x9

    aget v19, v5, v7

    const/16 v20, 0xd

    move/from16 v17, v8

    move/from16 v18, v6

    invoke-static/range {v15 .. v20}, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->a(IIIIII)I

    move-result v15

    .line 295
    move-object/from16 v0, p0

    iget-object v5, v0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e:[I

    const/16 v7, 0xa

    aget v18, v5, v7

    const/16 v19, 0xe

    move v14, v6

    move/from16 v17, v8

    invoke-static/range {v14 .. v19}, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->a(IIIIII)I

    move-result v14

    .line 296
    move-object/from16 v0, p0

    iget-object v5, v0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e:[I

    const/16 v6, 0xb

    aget v17, v5, v6

    const/16 v18, 0xf

    move v13, v8

    invoke-static/range {v13 .. v18}, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->a(IIIIII)I

    move-result v17

    .line 297
    move-object/from16 v0, p0

    iget-object v5, v0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e:[I

    const/16 v6, 0xc

    aget v20, v5, v6

    const/16 v21, 0x6

    move/from16 v18, v14

    move/from16 v19, v15

    invoke-static/range {v16 .. v21}, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->a(IIIIII)I

    move-result v16

    .line 298
    move-object/from16 v0, p0

    iget-object v5, v0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e:[I

    const/16 v6, 0xd

    aget v19, v5, v6

    const/16 v20, 0x7

    move/from16 v18, v14

    invoke-static/range {v15 .. v20}, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->a(IIIIII)I

    move-result v15

    .line 299
    move-object/from16 v0, p0

    iget-object v5, v0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e:[I

    const/16 v6, 0xe

    aget v18, v5, v6

    const/16 v19, 0x9

    invoke-static/range {v14 .. v19}, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->a(IIIIII)I

    move-result v18

    .line 300
    move-object/from16 v0, p0

    iget-object v5, v0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e:[I

    const/16 v6, 0xf

    aget v21, v5, v6

    const/16 v22, 0x8

    move/from16 v19, v15

    move/from16 v20, v16

    invoke-static/range {v17 .. v22}, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->a(IIIIII)I

    move-result v17

    .line 305
    move-object/from16 v0, p0

    iget-object v5, v0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e:[I

    const/4 v6, 0x7

    aget v20, v5, v6

    const/16 v21, 0x7

    move/from16 v19, v15

    invoke-static/range {v16 .. v21}, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->b(IIIIII)I

    move-result v16

    .line 306
    move-object/from16 v0, p0

    iget-object v5, v0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e:[I

    const/4 v6, 0x4

    aget v19, v5, v6

    const/16 v20, 0x6

    invoke-static/range {v15 .. v20}, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->b(IIIIII)I

    move-result v19

    .line 307
    move-object/from16 v0, p0

    iget-object v5, v0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e:[I

    const/16 v6, 0xd

    aget v22, v5, v6

    const/16 v23, 0x8

    move/from16 v20, v16

    move/from16 v21, v17

    invoke-static/range {v18 .. v23}, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->b(IIIIII)I

    move-result v18

    .line 308
    move-object/from16 v0, p0

    iget-object v5, v0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e:[I

    const/4 v6, 0x1

    aget v21, v5, v6

    const/16 v22, 0xd

    move/from16 v20, v16

    invoke-static/range {v17 .. v22}, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->b(IIIIII)I

    move-result v17

    .line 309
    move-object/from16 v0, p0

    iget-object v5, v0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e:[I

    const/16 v6, 0xa

    aget v20, v5, v6

    const/16 v21, 0xb

    invoke-static/range {v16 .. v21}, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->b(IIIIII)I

    move-result v20

    .line 310
    move-object/from16 v0, p0

    iget-object v5, v0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e:[I

    const/4 v6, 0x6

    aget v23, v5, v6

    const/16 v24, 0x9

    move/from16 v21, v17

    move/from16 v22, v18

    invoke-static/range {v19 .. v24}, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->b(IIIIII)I

    move-result v19

    .line 311
    move-object/from16 v0, p0

    iget-object v5, v0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e:[I

    const/16 v6, 0xf

    aget v22, v5, v6

    const/16 v23, 0x7

    move/from16 v21, v17

    invoke-static/range {v18 .. v23}, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->b(IIIIII)I

    move-result v18

    .line 312
    move-object/from16 v0, p0

    iget-object v5, v0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e:[I

    const/4 v6, 0x3

    aget v21, v5, v6

    const/16 v22, 0xf

    invoke-static/range {v17 .. v22}, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->b(IIIIII)I

    move-result v21

    .line 313
    move-object/from16 v0, p0

    iget-object v5, v0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e:[I

    const/16 v6, 0xc

    aget v24, v5, v6

    const/16 v25, 0x7

    move/from16 v22, v18

    move/from16 v23, v19

    invoke-static/range {v20 .. v25}, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->b(IIIIII)I

    move-result v20

    .line 314
    move-object/from16 v0, p0

    iget-object v5, v0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e:[I

    const/4 v6, 0x0

    aget v23, v5, v6

    const/16 v24, 0xc

    move/from16 v22, v18

    invoke-static/range {v19 .. v24}, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->b(IIIIII)I

    move-result v19

    .line 315
    move-object/from16 v0, p0

    iget-object v5, v0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e:[I

    const/16 v6, 0x9

    aget v22, v5, v6

    const/16 v23, 0xf

    invoke-static/range {v18 .. v23}, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->b(IIIIII)I

    move-result v22

    .line 316
    move-object/from16 v0, p0

    iget-object v5, v0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e:[I

    const/4 v6, 0x5

    aget v25, v5, v6

    const/16 v26, 0x9

    move/from16 v23, v19

    move/from16 v24, v20

    invoke-static/range {v21 .. v26}, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->b(IIIIII)I

    move-result v21

    .line 317
    move-object/from16 v0, p0

    iget-object v5, v0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e:[I

    const/4 v6, 0x2

    aget v24, v5, v6

    const/16 v25, 0xb

    move/from16 v23, v19

    invoke-static/range {v20 .. v25}, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->b(IIIIII)I

    move-result v20

    .line 318
    move-object/from16 v0, p0

    iget-object v5, v0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e:[I

    const/16 v6, 0xe

    aget v23, v5, v6

    const/16 v24, 0x7

    invoke-static/range {v19 .. v24}, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->b(IIIIII)I

    move-result v23

    .line 319
    move-object/from16 v0, p0

    iget-object v5, v0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e:[I

    const/16 v6, 0xb

    aget v26, v5, v6

    const/16 v27, 0xd

    move/from16 v24, v20

    move/from16 v25, v21

    invoke-static/range {v22 .. v27}, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->b(IIIIII)I

    move-result v22

    .line 320
    move-object/from16 v0, p0

    iget-object v5, v0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e:[I

    const/16 v6, 0x8

    aget v25, v5, v6

    const/16 v26, 0xc

    move/from16 v24, v20

    invoke-static/range {v21 .. v26}, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->b(IIIIII)I

    move-result v21

    .line 325
    move-object/from16 v0, p0

    iget-object v5, v0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e:[I

    const/4 v6, 0x3

    aget v24, v5, v6

    const/16 v25, 0xb

    invoke-static/range {v20 .. v25}, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->c(IIIIII)I

    move-result v24

    .line 326
    move-object/from16 v0, p0

    iget-object v5, v0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e:[I

    const/16 v6, 0xa

    aget v27, v5, v6

    const/16 v28, 0xd

    move/from16 v25, v21

    move/from16 v26, v22

    invoke-static/range {v23 .. v28}, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->c(IIIIII)I

    move-result v23

    .line 327
    move-object/from16 v0, p0

    iget-object v5, v0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e:[I

    const/16 v6, 0xe

    aget v26, v5, v6

    const/16 v27, 0x6

    move/from16 v25, v21

    invoke-static/range {v22 .. v27}, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->c(IIIIII)I

    move-result v22

    .line 328
    move-object/from16 v0, p0

    iget-object v5, v0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e:[I

    const/4 v6, 0x4

    aget v25, v5, v6

    const/16 v26, 0x7

    invoke-static/range {v21 .. v26}, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->c(IIIIII)I

    move-result v25

    .line 329
    move-object/from16 v0, p0

    iget-object v5, v0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e:[I

    const/16 v6, 0x9

    aget v28, v5, v6

    const/16 v29, 0xe

    move/from16 v26, v22

    move/from16 v27, v23

    invoke-static/range {v24 .. v29}, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->c(IIIIII)I

    move-result v24

    .line 330
    move-object/from16 v0, p0

    iget-object v5, v0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e:[I

    const/16 v6, 0xf

    aget v27, v5, v6

    const/16 v28, 0x9

    move/from16 v26, v22

    invoke-static/range {v23 .. v28}, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->c(IIIIII)I

    move-result v23

    .line 331
    move-object/from16 v0, p0

    iget-object v5, v0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e:[I

    const/16 v6, 0x8

    aget v26, v5, v6

    const/16 v27, 0xd

    invoke-static/range {v22 .. v27}, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->c(IIIIII)I

    move-result v26

    .line 332
    move-object/from16 v0, p0

    iget-object v5, v0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e:[I

    const/4 v6, 0x1

    aget v29, v5, v6

    const/16 v30, 0xf

    move/from16 v27, v23

    move/from16 v28, v24

    invoke-static/range {v25 .. v30}, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->c(IIIIII)I

    move-result v25

    .line 333
    move-object/from16 v0, p0

    iget-object v5, v0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e:[I

    const/4 v6, 0x2

    aget v28, v5, v6

    const/16 v29, 0xe

    move/from16 v27, v23

    invoke-static/range {v24 .. v29}, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->c(IIIIII)I

    move-result v24

    .line 334
    move-object/from16 v0, p0

    iget-object v5, v0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e:[I

    const/4 v6, 0x7

    aget v27, v5, v6

    const/16 v28, 0x8

    invoke-static/range {v23 .. v28}, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->c(IIIIII)I

    move-result v27

    .line 335
    move-object/from16 v0, p0

    iget-object v5, v0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e:[I

    const/4 v6, 0x0

    aget v30, v5, v6

    const/16 v31, 0xd

    move/from16 v28, v24

    move/from16 v29, v25

    invoke-static/range {v26 .. v31}, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->c(IIIIII)I

    move-result v26

    .line 336
    move-object/from16 v0, p0

    iget-object v5, v0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e:[I

    const/4 v6, 0x6

    aget v29, v5, v6

    const/16 v30, 0x6

    move/from16 v28, v24

    invoke-static/range {v25 .. v30}, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->c(IIIIII)I

    move-result v25

    .line 337
    move-object/from16 v0, p0

    iget-object v5, v0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e:[I

    const/16 v6, 0xd

    aget v28, v5, v6

    const/16 v29, 0x5

    invoke-static/range {v24 .. v29}, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->c(IIIIII)I

    move-result v28

    .line 338
    move-object/from16 v0, p0

    iget-object v5, v0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e:[I

    const/16 v6, 0xb

    aget v31, v5, v6

    const/16 v32, 0xc

    move/from16 v29, v25

    move/from16 v30, v26

    invoke-static/range {v27 .. v32}, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->c(IIIIII)I

    move-result v27

    .line 339
    move-object/from16 v0, p0

    iget-object v5, v0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e:[I

    const/4 v6, 0x5

    aget v30, v5, v6

    const/16 v31, 0x7

    move/from16 v29, v25

    invoke-static/range {v26 .. v31}, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->c(IIIIII)I

    move-result v26

    .line 340
    move-object/from16 v0, p0

    iget-object v5, v0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e:[I

    const/16 v6, 0xc

    aget v29, v5, v6

    const/16 v30, 0x5

    invoke-static/range {v25 .. v30}, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->c(IIIIII)I

    move-result v29

    .line 345
    move-object/from16 v0, p0

    iget-object v5, v0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e:[I

    const/4 v6, 0x1

    aget v32, v5, v6

    const/16 v33, 0xb

    move/from16 v30, v26

    move/from16 v31, v27

    invoke-static/range {v28 .. v33}, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->d(IIIIII)I

    move-result v28

    .line 346
    move-object/from16 v0, p0

    iget-object v5, v0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e:[I

    const/16 v6, 0x9

    aget v31, v5, v6

    const/16 v32, 0xc

    move/from16 v30, v26

    invoke-static/range {v27 .. v32}, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->d(IIIIII)I

    move-result v27

    .line 347
    move-object/from16 v0, p0

    iget-object v5, v0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e:[I

    const/16 v6, 0xb

    aget v30, v5, v6

    const/16 v31, 0xe

    invoke-static/range {v26 .. v31}, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->d(IIIIII)I

    move-result v30

    .line 348
    move-object/from16 v0, p0

    iget-object v5, v0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e:[I

    const/16 v6, 0xa

    aget v33, v5, v6

    const/16 v34, 0xf

    move/from16 v31, v27

    move/from16 v32, v28

    invoke-static/range {v29 .. v34}, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->d(IIIIII)I

    move-result v29

    .line 349
    move-object/from16 v0, p0

    iget-object v5, v0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e:[I

    const/4 v6, 0x0

    aget v32, v5, v6

    const/16 v33, 0xe

    move/from16 v31, v27

    invoke-static/range {v28 .. v33}, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->d(IIIIII)I

    move-result v28

    .line 350
    move-object/from16 v0, p0

    iget-object v5, v0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e:[I

    const/16 v6, 0x8

    aget v31, v5, v6

    const/16 v32, 0xf

    invoke-static/range {v27 .. v32}, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->d(IIIIII)I

    move-result v31

    .line 351
    move-object/from16 v0, p0

    iget-object v5, v0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e:[I

    const/16 v6, 0xc

    aget v34, v5, v6

    const/16 v35, 0x9

    move/from16 v32, v28

    move/from16 v33, v29

    invoke-static/range {v30 .. v35}, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->d(IIIIII)I

    move-result v30

    .line 352
    move-object/from16 v0, p0

    iget-object v5, v0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e:[I

    const/4 v6, 0x4

    aget v33, v5, v6

    const/16 v34, 0x8

    move/from16 v32, v28

    invoke-static/range {v29 .. v34}, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->d(IIIIII)I

    move-result v29

    .line 353
    move-object/from16 v0, p0

    iget-object v5, v0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e:[I

    const/16 v6, 0xd

    aget v32, v5, v6

    const/16 v33, 0x9

    invoke-static/range {v28 .. v33}, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->d(IIIIII)I

    move-result v32

    .line 354
    move-object/from16 v0, p0

    iget-object v5, v0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e:[I

    const/4 v6, 0x3

    aget v35, v5, v6

    const/16 v36, 0xe

    move/from16 v33, v29

    move/from16 v34, v30

    invoke-static/range {v31 .. v36}, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->d(IIIIII)I

    move-result v31

    .line 355
    move-object/from16 v0, p0

    iget-object v5, v0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e:[I

    const/4 v6, 0x7

    aget v34, v5, v6

    const/16 v35, 0x5

    move/from16 v33, v29

    invoke-static/range {v30 .. v35}, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->d(IIIIII)I

    move-result v30

    .line 356
    move-object/from16 v0, p0

    iget-object v5, v0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e:[I

    const/16 v6, 0xf

    aget v33, v5, v6

    const/16 v34, 0x6

    invoke-static/range {v29 .. v34}, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->d(IIIIII)I

    move-result v33

    .line 357
    move-object/from16 v0, p0

    iget-object v5, v0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e:[I

    const/16 v6, 0xe

    aget v36, v5, v6

    const/16 v37, 0x8

    move/from16 v34, v30

    move/from16 v35, v31

    invoke-static/range {v32 .. v37}, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->d(IIIIII)I

    move-result v32

    .line 358
    move-object/from16 v0, p0

    iget-object v5, v0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e:[I

    const/4 v6, 0x5

    aget v35, v5, v6

    const/16 v36, 0x6

    move/from16 v34, v30

    invoke-static/range {v31 .. v36}, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->d(IIIIII)I

    move-result v31

    .line 359
    move-object/from16 v0, p0

    iget-object v5, v0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e:[I

    const/4 v6, 0x6

    aget v34, v5, v6

    const/16 v35, 0x5

    invoke-static/range {v30 .. v35}, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->d(IIIIII)I

    move-result v34

    .line 360
    move-object/from16 v0, p0

    iget-object v5, v0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e:[I

    const/4 v6, 0x2

    aget v37, v5, v6

    const/16 v38, 0xc

    move/from16 v35, v31

    move/from16 v36, v32

    invoke-static/range {v33 .. v38}, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->d(IIIIII)I

    move-result v30

    .line 365
    move-object/from16 v0, p0

    iget-object v5, v0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e:[I

    const/4 v6, 0x5

    aget v5, v5, v6

    const/16 v6, 0x8

    invoke-static/range {v1 .. v6}, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->h(IIIIII)I

    move-result v5

    .line 366
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e:[I

    const/16 v6, 0xe

    aget v8, v1, v6

    const/16 v9, 0x9

    move v6, v2

    move v7, v3

    invoke-static/range {v4 .. v9}, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->h(IIIIII)I

    move-result v4

    .line 367
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e:[I

    const/4 v6, 0x7

    aget v7, v1, v6

    const/16 v8, 0x9

    move v6, v2

    invoke-static/range {v3 .. v8}, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->h(IIIIII)I

    move-result v3

    .line 368
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e:[I

    const/4 v6, 0x0

    aget v6, v1, v6

    const/16 v7, 0xb

    invoke-static/range {v2 .. v7}, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->h(IIIIII)I

    move-result v6

    .line 369
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e:[I

    const/16 v2, 0x9

    aget v9, v1, v2

    const/16 v10, 0xd

    move v7, v3

    move v8, v4

    invoke-static/range {v5 .. v10}, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->h(IIIIII)I

    move-result v5

    .line 370
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e:[I

    const/4 v2, 0x2

    aget v8, v1, v2

    const/16 v9, 0xf

    move v7, v3

    invoke-static/range {v4 .. v9}, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->h(IIIIII)I

    move-result v4

    .line 371
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e:[I

    const/16 v2, 0xb

    aget v7, v1, v2

    const/16 v8, 0xf

    invoke-static/range {v3 .. v8}, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->h(IIIIII)I

    move-result v7

    .line 372
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e:[I

    const/4 v2, 0x4

    aget v10, v1, v2

    const/4 v11, 0x5

    move v8, v4

    move v9, v5

    invoke-static/range {v6 .. v11}, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->h(IIIIII)I

    move-result v6

    .line 373
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e:[I

    const/16 v2, 0xd

    aget v9, v1, v2

    const/4 v10, 0x7

    move v8, v4

    invoke-static/range {v5 .. v10}, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->h(IIIIII)I

    move-result v5

    .line 374
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e:[I

    const/4 v2, 0x6

    aget v8, v1, v2

    const/4 v9, 0x7

    invoke-static/range {v4 .. v9}, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->h(IIIIII)I

    move-result v8

    .line 375
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e:[I

    const/16 v2, 0xf

    aget v11, v1, v2

    const/16 v12, 0x8

    move v9, v5

    move v10, v6

    invoke-static/range {v7 .. v12}, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->h(IIIIII)I

    move-result v7

    .line 376
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e:[I

    const/16 v2, 0x8

    aget v10, v1, v2

    const/16 v11, 0xb

    move v9, v5

    invoke-static/range {v6 .. v11}, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->h(IIIIII)I

    move-result v6

    .line 377
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e:[I

    const/4 v2, 0x1

    aget v9, v1, v2

    const/16 v10, 0xe

    invoke-static/range {v5 .. v10}, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->h(IIIIII)I

    move-result v9

    .line 378
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e:[I

    const/16 v2, 0xa

    aget v12, v1, v2

    const/16 v13, 0xe

    move v10, v6

    move v11, v7

    invoke-static/range {v8 .. v13}, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->h(IIIIII)I

    move-result v8

    .line 379
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e:[I

    const/4 v2, 0x3

    aget v11, v1, v2

    const/16 v12, 0xc

    move v10, v6

    invoke-static/range {v7 .. v12}, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->h(IIIIII)I

    move-result v7

    .line 380
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e:[I

    const/16 v2, 0xc

    aget v10, v1, v2

    const/4 v11, 0x6

    invoke-static/range {v6 .. v11}, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->h(IIIIII)I

    move-result v10

    .line 385
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e:[I

    const/4 v2, 0x6

    aget v13, v1, v2

    const/16 v14, 0x9

    move v11, v7

    move v12, v8

    invoke-static/range {v9 .. v14}, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->g(IIIIII)I

    move-result v9

    .line 386
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e:[I

    const/16 v2, 0xb

    aget v12, v1, v2

    const/16 v13, 0xd

    move v11, v7

    invoke-static/range {v8 .. v13}, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->g(IIIIII)I

    move-result v8

    .line 387
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e:[I

    const/4 v2, 0x3

    aget v11, v1, v2

    const/16 v12, 0xf

    invoke-static/range {v7 .. v12}, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->g(IIIIII)I

    move-result v11

    .line 388
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e:[I

    const/4 v2, 0x7

    aget v14, v1, v2

    const/4 v15, 0x7

    move v12, v8

    move v13, v9

    invoke-static/range {v10 .. v15}, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->g(IIIIII)I

    move-result v10

    .line 389
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e:[I

    const/4 v2, 0x0

    aget v13, v1, v2

    const/16 v14, 0xc

    move v12, v8

    invoke-static/range {v9 .. v14}, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->g(IIIIII)I

    move-result v9

    .line 390
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e:[I

    const/16 v2, 0xd

    aget v12, v1, v2

    const/16 v13, 0x8

    invoke-static/range {v8 .. v13}, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->g(IIIIII)I

    move-result v12

    .line 391
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e:[I

    const/4 v2, 0x5

    aget v15, v1, v2

    const/16 v16, 0x9

    move v13, v9

    move v14, v10

    invoke-static/range {v11 .. v16}, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->g(IIIIII)I

    move-result v11

    .line 392
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e:[I

    const/16 v2, 0xa

    aget v14, v1, v2

    const/16 v15, 0xb

    move v13, v9

    invoke-static/range {v10 .. v15}, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->g(IIIIII)I

    move-result v10

    .line 393
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e:[I

    const/16 v2, 0xe

    aget v13, v1, v2

    const/4 v14, 0x7

    invoke-static/range {v9 .. v14}, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->g(IIIIII)I

    move-result v13

    .line 394
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e:[I

    const/16 v2, 0xf

    aget v16, v1, v2

    const/16 v17, 0x7

    move v14, v10

    move v15, v11

    invoke-static/range {v12 .. v17}, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->g(IIIIII)I

    move-result v12

    .line 395
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e:[I

    const/16 v2, 0x8

    aget v15, v1, v2

    const/16 v16, 0xc

    move v14, v10

    invoke-static/range {v11 .. v16}, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->g(IIIIII)I

    move-result v11

    .line 396
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e:[I

    const/16 v2, 0xc

    aget v14, v1, v2

    const/4 v15, 0x7

    invoke-static/range {v10 .. v15}, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->g(IIIIII)I

    move-result v14

    .line 397
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e:[I

    const/4 v2, 0x4

    aget v17, v1, v2

    const/16 v18, 0x6

    move v15, v11

    move/from16 v16, v12

    invoke-static/range {v13 .. v18}, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->g(IIIIII)I

    move-result v13

    .line 398
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e:[I

    const/16 v2, 0x9

    aget v16, v1, v2

    const/16 v17, 0xf

    move v15, v11

    invoke-static/range {v12 .. v17}, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->g(IIIIII)I

    move-result v12

    .line 399
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e:[I

    const/4 v2, 0x1

    aget v15, v1, v2

    const/16 v16, 0xd

    invoke-static/range {v11 .. v16}, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->g(IIIIII)I

    move-result v15

    .line 400
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e:[I

    const/4 v2, 0x2

    aget v18, v1, v2

    const/16 v19, 0xb

    move/from16 v16, v12

    move/from16 v17, v13

    invoke-static/range {v14 .. v19}, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->g(IIIIII)I

    move-result v14

    .line 405
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e:[I

    const/16 v2, 0xf

    aget v17, v1, v2

    const/16 v18, 0x9

    move/from16 v16, v12

    invoke-static/range {v13 .. v18}, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->f(IIIIII)I

    move-result v13

    .line 406
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e:[I

    const/4 v2, 0x5

    aget v16, v1, v2

    const/16 v17, 0x7

    invoke-static/range {v12 .. v17}, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->f(IIIIII)I

    move-result v16

    .line 407
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e:[I

    const/4 v2, 0x1

    aget v19, v1, v2

    const/16 v20, 0xf

    move/from16 v17, v13

    move/from16 v18, v14

    invoke-static/range {v15 .. v20}, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->f(IIIIII)I

    move-result v15

    .line 408
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e:[I

    const/4 v2, 0x3

    aget v18, v1, v2

    const/16 v19, 0xb

    move/from16 v17, v13

    invoke-static/range {v14 .. v19}, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->f(IIIIII)I

    move-result v14

    .line 409
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e:[I

    const/4 v2, 0x7

    aget v17, v1, v2

    const/16 v18, 0x8

    invoke-static/range {v13 .. v18}, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->f(IIIIII)I

    move-result v17

    .line 410
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e:[I

    const/16 v2, 0xe

    aget v20, v1, v2

    const/16 v21, 0x6

    move/from16 v18, v14

    move/from16 v19, v15

    invoke-static/range {v16 .. v21}, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->f(IIIIII)I

    move-result v16

    .line 411
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e:[I

    const/4 v2, 0x6

    aget v19, v1, v2

    const/16 v20, 0x6

    move/from16 v18, v14

    invoke-static/range {v15 .. v20}, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->f(IIIIII)I

    move-result v15

    .line 412
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e:[I

    const/16 v2, 0x9

    aget v18, v1, v2

    const/16 v19, 0xe

    invoke-static/range {v14 .. v19}, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->f(IIIIII)I

    move-result v18

    .line 413
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e:[I

    const/16 v2, 0xb

    aget v21, v1, v2

    const/16 v22, 0xc

    move/from16 v19, v15

    move/from16 v20, v16

    invoke-static/range {v17 .. v22}, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->f(IIIIII)I

    move-result v17

    .line 414
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e:[I

    const/16 v2, 0x8

    aget v20, v1, v2

    const/16 v21, 0xd

    move/from16 v19, v15

    invoke-static/range {v16 .. v21}, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->f(IIIIII)I

    move-result v16

    .line 415
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e:[I

    const/16 v2, 0xc

    aget v19, v1, v2

    const/16 v20, 0x5

    invoke-static/range {v15 .. v20}, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->f(IIIIII)I

    move-result v19

    .line 416
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e:[I

    const/4 v2, 0x2

    aget v22, v1, v2

    const/16 v23, 0xe

    move/from16 v20, v16

    move/from16 v21, v17

    invoke-static/range {v18 .. v23}, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->f(IIIIII)I

    move-result v18

    .line 417
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e:[I

    const/16 v2, 0xa

    aget v21, v1, v2

    const/16 v22, 0xd

    move/from16 v20, v16

    invoke-static/range {v17 .. v22}, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->f(IIIIII)I

    move-result v17

    .line 418
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e:[I

    const/4 v2, 0x0

    aget v20, v1, v2

    const/16 v21, 0xd

    invoke-static/range {v16 .. v21}, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->f(IIIIII)I

    move-result v20

    .line 419
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e:[I

    const/4 v2, 0x4

    aget v23, v1, v2

    const/16 v24, 0x7

    move/from16 v21, v17

    move/from16 v22, v18

    invoke-static/range {v19 .. v24}, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->f(IIIIII)I

    move-result v19

    .line 420
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e:[I

    const/16 v2, 0xd

    aget v22, v1, v2

    const/16 v23, 0x5

    move/from16 v21, v17

    invoke-static/range {v18 .. v23}, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->f(IIIIII)I

    move-result v18

    .line 425
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e:[I

    const/16 v2, 0x8

    aget v21, v1, v2

    const/16 v22, 0xf

    invoke-static/range {v17 .. v22}, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e(IIIIII)I

    move-result v21

    .line 426
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e:[I

    const/4 v2, 0x6

    aget v24, v1, v2

    const/16 v25, 0x5

    move/from16 v22, v18

    move/from16 v23, v19

    invoke-static/range {v20 .. v25}, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e(IIIIII)I

    move-result v20

    .line 427
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e:[I

    const/4 v2, 0x4

    aget v23, v1, v2

    const/16 v24, 0x8

    move/from16 v22, v18

    invoke-static/range {v19 .. v24}, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e(IIIIII)I

    move-result v19

    .line 428
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e:[I

    const/4 v2, 0x1

    aget v22, v1, v2

    const/16 v23, 0xb

    invoke-static/range {v18 .. v23}, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e(IIIIII)I

    move-result v22

    .line 429
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e:[I

    const/4 v2, 0x3

    aget v25, v1, v2

    const/16 v26, 0xe

    move/from16 v23, v19

    move/from16 v24, v20

    invoke-static/range {v21 .. v26}, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e(IIIIII)I

    move-result v21

    .line 430
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e:[I

    const/16 v2, 0xb

    aget v24, v1, v2

    const/16 v25, 0xe

    move/from16 v23, v19

    invoke-static/range {v20 .. v25}, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e(IIIIII)I

    move-result v20

    .line 431
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e:[I

    const/16 v2, 0xf

    aget v23, v1, v2

    const/16 v24, 0x6

    invoke-static/range {v19 .. v24}, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e(IIIIII)I

    move-result v23

    .line 432
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e:[I

    const/4 v2, 0x0

    aget v26, v1, v2

    const/16 v27, 0xe

    move/from16 v24, v20

    move/from16 v25, v21

    invoke-static/range {v22 .. v27}, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e(IIIIII)I

    move-result v22

    .line 433
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e:[I

    const/4 v2, 0x5

    aget v25, v1, v2

    const/16 v26, 0x6

    move/from16 v24, v20

    invoke-static/range {v21 .. v26}, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e(IIIIII)I

    move-result v21

    .line 434
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e:[I

    const/16 v2, 0xc

    aget v24, v1, v2

    const/16 v25, 0x9

    invoke-static/range {v20 .. v25}, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e(IIIIII)I

    move-result v24

    .line 435
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e:[I

    const/4 v2, 0x2

    aget v27, v1, v2

    const/16 v28, 0xc

    move/from16 v25, v21

    move/from16 v26, v22

    invoke-static/range {v23 .. v28}, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e(IIIIII)I

    move-result v23

    .line 436
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e:[I

    const/16 v2, 0xd

    aget v26, v1, v2

    const/16 v27, 0x9

    move/from16 v25, v21

    invoke-static/range {v22 .. v27}, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e(IIIIII)I

    move-result v22

    .line 437
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e:[I

    const/16 v2, 0x9

    aget v25, v1, v2

    const/16 v26, 0xc

    invoke-static/range {v21 .. v26}, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e(IIIIII)I

    move-result v25

    .line 438
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e:[I

    const/4 v2, 0x7

    aget v28, v1, v2

    const/16 v29, 0x5

    move/from16 v26, v22

    move/from16 v27, v23

    invoke-static/range {v24 .. v29}, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e(IIIIII)I

    move-result v24

    .line 439
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e:[I

    const/16 v2, 0xa

    aget v27, v1, v2

    const/16 v28, 0xf

    move/from16 v26, v22

    invoke-static/range {v23 .. v28}, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e(IIIIII)I

    move-result v23

    .line 440
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e:[I

    const/16 v2, 0xe

    aget v26, v1, v2

    const/16 v27, 0x8

    invoke-static/range {v22 .. v27}, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e(IIIIII)I

    move-result v1

    .line 442
    move-object/from16 v0, p0

    iget v2, v0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->b:I

    add-int v2, v2, v34

    add-int v2, v2, v24

    .line 447
    move-object/from16 v0, p0

    iget v3, v0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->c:I

    add-int v3, v3, v31

    add-int v3, v3, v25

    move-object/from16 v0, p0

    iput v3, v0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->b:I

    .line 448
    move-object/from16 v0, p0

    iget v3, v0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->d:I

    add-int v3, v3, v32

    add-int/2addr v1, v3

    move-object/from16 v0, p0

    iput v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->c:I

    .line 449
    move-object/from16 v0, p0

    iget v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->a:I

    add-int v1, v1, v30

    add-int v1, v1, v23

    move-object/from16 v0, p0

    iput v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->d:I

    .line 450
    move-object/from16 v0, p0

    iput v2, v0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->a:I

    .line 455
    const/4 v1, 0x0

    move-object/from16 v0, p0

    iput v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->f:I

    .line 456
    const/4 v1, 0x0

    :goto_0
    move-object/from16 v0, p0

    iget-object v2, v0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e:[I

    array-length v2, v2

    if-eq v1, v2, :cond_0

    .line 458
    move-object/from16 v0, p0

    iget-object v2, v0, Lorg/spongycastle/crypto/digests/RIPEMD128Digest;->e:[I

    const/4 v3, 0x0

    aput v3, v2, v1

    .line 456
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 460
    :cond_0
    return-void
.end method
