.class public Lorg/spongycastle/crypto/digests/RIPEMD256Digest;
.super Lorg/spongycastle/crypto/digests/GeneralDigest;
.source "SourceFile"


# instance fields
.field private a:I

.field private b:I

.field private c:I

.field private d:I

.field private e:I

.field private f:I

.field private g:I

.field private h:I

.field private i:[I

.field private j:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 23
    invoke-direct {p0}, Lorg/spongycastle/crypto/digests/GeneralDigest;-><init>()V

    .line 16
    const/16 v0, 0x10

    new-array v0, v0, [I

    iput-object v0, p0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->i:[I

    .line 24
    invoke-virtual {p0}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->c()V

    .line 25
    return-void
.end method

.method public constructor <init>(Lorg/spongycastle/crypto/digests/RIPEMD256Digest;)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 33
    invoke-direct {p0, p1}, Lorg/spongycastle/crypto/digests/GeneralDigest;-><init>(Lorg/spongycastle/crypto/digests/GeneralDigest;)V

    .line 16
    const/16 v0, 0x10

    new-array v0, v0, [I

    iput-object v0, p0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->i:[I

    .line 35
    iget v0, p1, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->a:I

    iput v0, p0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->a:I

    .line 36
    iget v0, p1, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->b:I

    iput v0, p0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->b:I

    .line 37
    iget v0, p1, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->c:I

    iput v0, p0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->c:I

    .line 38
    iget v0, p1, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->d:I

    iput v0, p0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->d:I

    .line 39
    iget v0, p1, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->e:I

    iput v0, p0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->e:I

    .line 40
    iget v0, p1, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->f:I

    iput v0, p0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->f:I

    .line 41
    iget v0, p1, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->g:I

    iput v0, p0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->g:I

    .line 42
    iget v0, p1, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->h:I

    iput v0, p0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->h:I

    .line 44
    iget-object v0, p1, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->i:[I

    iget-object v1, p0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->i:[I

    iget-object v2, p1, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->i:[I

    array-length v2, v2

    invoke-static {v0, v3, v1, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 45
    iget v0, p1, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->j:I

    iput v0, p0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->j:I

    .line 46
    return-void
.end method

.method private static a(II)I
    .locals 2

    .prologue
    .line 145
    shl-int v0, p0, p1

    rsub-int/lit8 v1, p1, 0x20

    ushr-int v1, p0, v1

    or-int/2addr v0, v1

    return v0
.end method

.method private static a(III)I
    .locals 2

    .prologue
    .line 171
    and-int v0, p0, p1

    xor-int/lit8 v1, p0, -0x1

    and-int/2addr v1, p2

    or-int/2addr v0, v1

    return v0
.end method

.method private static a(IIIIII)I
    .locals 1

    .prologue
    .line 204
    xor-int v0, p1, p2

    xor-int/2addr v0, p3

    add-int/2addr v0, p0

    add-int/2addr v0, p4

    invoke-static {v0, p5}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->a(II)I

    move-result v0

    return v0
.end method

.method private static a(I[BI)V
    .locals 2

    .prologue
    .line 88
    int-to-byte v0, p0

    aput-byte v0, p1, p2

    .line 89
    add-int/lit8 v0, p2, 0x1

    ushr-int/lit8 v1, p0, 0x8

    int-to-byte v1, v1

    aput-byte v1, p1, v0

    .line 90
    add-int/lit8 v0, p2, 0x2

    ushr-int/lit8 v1, p0, 0x10

    int-to-byte v1, v1

    aput-byte v1, p1, v0

    .line 91
    add-int/lit8 v0, p2, 0x3

    ushr-int/lit8 v1, p0, 0x18

    int-to-byte v1, v1

    aput-byte v1, p1, v0

    .line 92
    return-void
.end method

.method private static b(III)I
    .locals 2

    .prologue
    .line 193
    and-int v0, p0, p2

    xor-int/lit8 v1, p2, -0x1

    and-int/2addr v1, p1

    or-int/2addr v0, v1

    return v0
.end method

.method private static b(IIIIII)I
    .locals 2

    .prologue
    .line 215
    invoke-static {p1, p2, p3}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->a(III)I

    move-result v0

    add-int/2addr v0, p0

    add-int/2addr v0, p4

    const v1, 0x5a827999

    add-int/2addr v0, v1

    invoke-static {v0, p5}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->a(II)I

    move-result v0

    return v0
.end method

.method private static c(IIIIII)I
    .locals 2

    .prologue
    .line 226
    xor-int/lit8 v0, p2, -0x1

    or-int/2addr v0, p1

    xor-int/2addr v0, p3

    add-int/2addr v0, p0

    add-int/2addr v0, p4

    const v1, 0x6ed9eba1

    add-int/2addr v0, v1

    invoke-static {v0, p5}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->a(II)I

    move-result v0

    return v0
.end method

.method private static d(IIIIII)I
    .locals 2

    .prologue
    .line 237
    invoke-static {p1, p2, p3}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->b(III)I

    move-result v0

    add-int/2addr v0, p0

    add-int/2addr v0, p4

    const v1, -0x70e44324

    add-int/2addr v0, v1

    invoke-static {v0, p5}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->a(II)I

    move-result v0

    return v0
.end method

.method private static e(IIIIII)I
    .locals 1

    .prologue
    .line 248
    xor-int v0, p1, p2

    xor-int/2addr v0, p3

    add-int/2addr v0, p0

    add-int/2addr v0, p4

    invoke-static {v0, p5}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->a(II)I

    move-result v0

    return v0
.end method

.method private static f(IIIIII)I
    .locals 2

    .prologue
    .line 259
    invoke-static {p1, p2, p3}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->a(III)I

    move-result v0

    add-int/2addr v0, p0

    add-int/2addr v0, p4

    const v1, 0x6d703ef3

    add-int/2addr v0, v1

    invoke-static {v0, p5}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->a(II)I

    move-result v0

    return v0
.end method

.method private static g(IIIIII)I
    .locals 2

    .prologue
    .line 270
    xor-int/lit8 v0, p2, -0x1

    or-int/2addr v0, p1

    xor-int/2addr v0, p3

    add-int/2addr v0, p0

    add-int/2addr v0, p4

    const v1, 0x5c4dd124

    add-int/2addr v0, v1

    invoke-static {v0, p5}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->a(II)I

    move-result v0

    return v0
.end method

.method private static h(IIIIII)I
    .locals 2

    .prologue
    .line 281
    invoke-static {p1, p2, p3}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->b(III)I

    move-result v0

    add-int/2addr v0, p0

    add-int/2addr v0, p4

    const v1, 0x50a28be6

    add-int/2addr v0, v1

    invoke-static {v0, p5}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->a(II)I

    move-result v0

    return v0
.end method


# virtual methods
.method public final a([BI)I
    .locals 2

    .prologue
    .line 98
    invoke-virtual {p0}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->e()V

    .line 100
    iget v0, p0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->a:I

    invoke-static {v0, p1, p2}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->a(I[BI)V

    .line 101
    iget v0, p0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->b:I

    add-int/lit8 v1, p2, 0x4

    invoke-static {v0, p1, v1}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->a(I[BI)V

    .line 102
    iget v0, p0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->c:I

    add-int/lit8 v1, p2, 0x8

    invoke-static {v0, p1, v1}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->a(I[BI)V

    .line 103
    iget v0, p0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->d:I

    add-int/lit8 v1, p2, 0xc

    invoke-static {v0, p1, v1}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->a(I[BI)V

    .line 104
    iget v0, p0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->e:I

    add-int/lit8 v1, p2, 0x10

    invoke-static {v0, p1, v1}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->a(I[BI)V

    .line 105
    iget v0, p0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->f:I

    add-int/lit8 v1, p2, 0x14

    invoke-static {v0, p1, v1}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->a(I[BI)V

    .line 106
    iget v0, p0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->g:I

    add-int/lit8 v1, p2, 0x18

    invoke-static {v0, p1, v1}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->a(I[BI)V

    .line 107
    iget v0, p0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->h:I

    add-int/lit8 v1, p2, 0x1c

    invoke-static {v0, p1, v1}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->a(I[BI)V

    .line 109
    invoke-virtual {p0}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->c()V

    .line 111
    const/16 v0, 0x20

    return v0
.end method

.method public final a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 50
    const-string v0, "RIPEMD256"

    return-object v0
.end method

.method protected final a(J)V
    .locals 5

    .prologue
    const/16 v4, 0xe

    .line 74
    iget v0, p0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->j:I

    if-le v0, v4, :cond_0

    .line 76
    invoke-virtual {p0}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->f()V

    .line 79
    :cond_0
    iget-object v0, p0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->i:[I

    const-wide/16 v2, -0x1

    and-long/2addr v2, p1

    long-to-int v1, v2

    aput v1, v0, v4

    .line 80
    iget-object v0, p0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->i:[I

    const/16 v1, 0xf

    const/16 v2, 0x20

    ushr-long v2, p1, v2

    long-to-int v2, v2

    aput v2, v0, v1

    .line 81
    return-void
.end method

.method public final b()I
    .locals 1

    .prologue
    .line 55
    const/16 v0, 0x20

    return v0
.end method

.method protected final b([BI)V
    .locals 4

    .prologue
    .line 62
    iget-object v0, p0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->i:[I

    iget v1, p0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->j:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->j:I

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

    .line 65
    iget v0, p0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->j:I

    const/16 v1, 0x10

    if-ne v0, v1, :cond_0

    .line 67
    invoke-virtual {p0}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->f()V

    .line 69
    :cond_0
    return-void
.end method

.method public final c()V
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 119
    invoke-super {p0}, Lorg/spongycastle/crypto/digests/GeneralDigest;->c()V

    .line 121
    const v0, 0x67452301

    iput v0, p0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->a:I

    .line 122
    const v0, -0x10325477

    iput v0, p0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->b:I

    .line 123
    const v0, -0x67452302

    iput v0, p0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->c:I

    .line 124
    const v0, 0x10325476

    iput v0, p0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->d:I

    .line 125
    const v0, 0x76543210

    iput v0, p0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->e:I

    .line 126
    const v0, -0x1234568

    iput v0, p0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->f:I

    .line 127
    const v0, -0x76543211

    iput v0, p0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->g:I

    .line 128
    const v0, 0x1234567

    iput v0, p0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->h:I

    .line 130
    iput v1, p0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->j:I

    move v0, v1

    .line 132
    :goto_0
    iget-object v2, p0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->i:[I

    array-length v2, v2

    if-eq v0, v2, :cond_0

    .line 134
    iget-object v2, p0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->i:[I

    aput v1, v2, v0

    .line 132
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 136
    :cond_0
    return-void
.end method

.method protected final f()V
    .locals 41

    .prologue
    .line 292
    move-object/from16 v0, p0

    iget v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->a:I

    .line 293
    move-object/from16 v0, p0

    iget v2, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->b:I

    .line 294
    move-object/from16 v0, p0

    iget v3, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->c:I

    .line 295
    move-object/from16 v0, p0

    iget v4, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->d:I

    .line 296
    move-object/from16 v0, p0

    iget v14, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->e:I

    .line 297
    move-object/from16 v0, p0

    iget v0, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->f:I

    move/from16 v18, v0

    .line 298
    move-object/from16 v0, p0

    iget v0, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->g:I

    move/from16 v16, v0

    .line 299
    move-object/from16 v0, p0

    iget v15, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->h:I

    .line 305
    move-object/from16 v0, p0

    iget-object v5, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->i:[I

    const/4 v6, 0x0

    aget v5, v5, v6

    const/16 v6, 0xb

    invoke-static/range {v1 .. v6}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->a(IIIIII)I

    move-result v5

    .line 306
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->i:[I

    const/4 v6, 0x1

    aget v8, v1, v6

    const/16 v9, 0xe

    move v6, v2

    move v7, v3

    invoke-static/range {v4 .. v9}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->a(IIIIII)I

    move-result v4

    .line 307
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->i:[I

    const/4 v6, 0x2

    aget v7, v1, v6

    const/16 v8, 0xf

    move v6, v2

    invoke-static/range {v3 .. v8}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->a(IIIIII)I

    move-result v3

    .line 308
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->i:[I

    const/4 v6, 0x3

    aget v6, v1, v6

    const/16 v7, 0xc

    invoke-static/range {v2 .. v7}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->a(IIIIII)I

    move-result v6

    .line 309
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->i:[I

    const/4 v2, 0x4

    aget v9, v1, v2

    const/4 v10, 0x5

    move v7, v3

    move v8, v4

    invoke-static/range {v5 .. v10}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->a(IIIIII)I

    move-result v5

    .line 310
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->i:[I

    const/4 v2, 0x5

    aget v8, v1, v2

    const/16 v9, 0x8

    move v7, v3

    invoke-static/range {v4 .. v9}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->a(IIIIII)I

    move-result v4

    .line 311
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->i:[I

    const/4 v2, 0x6

    aget v7, v1, v2

    const/4 v8, 0x7

    invoke-static/range {v3 .. v8}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->a(IIIIII)I

    move-result v7

    .line 312
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->i:[I

    const/4 v2, 0x7

    aget v10, v1, v2

    const/16 v11, 0x9

    move v8, v4

    move v9, v5

    invoke-static/range {v6 .. v11}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->a(IIIIII)I

    move-result v6

    .line 313
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->i:[I

    const/16 v2, 0x8

    aget v9, v1, v2

    const/16 v10, 0xb

    move v8, v4

    invoke-static/range {v5 .. v10}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->a(IIIIII)I

    move-result v5

    .line 314
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->i:[I

    const/16 v2, 0x9

    aget v8, v1, v2

    const/16 v9, 0xd

    invoke-static/range {v4 .. v9}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->a(IIIIII)I

    move-result v8

    .line 315
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->i:[I

    const/16 v2, 0xa

    aget v11, v1, v2

    const/16 v12, 0xe

    move v9, v5

    move v10, v6

    invoke-static/range {v7 .. v12}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->a(IIIIII)I

    move-result v7

    .line 316
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->i:[I

    const/16 v2, 0xb

    aget v10, v1, v2

    const/16 v11, 0xf

    move v9, v5

    invoke-static/range {v6 .. v11}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->a(IIIIII)I

    move-result v6

    .line 317
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->i:[I

    const/16 v2, 0xc

    aget v9, v1, v2

    const/4 v10, 0x6

    invoke-static/range {v5 .. v10}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->a(IIIIII)I

    move-result v9

    .line 318
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->i:[I

    const/16 v2, 0xd

    aget v12, v1, v2

    const/4 v13, 0x7

    move v10, v6

    move v11, v7

    invoke-static/range {v8 .. v13}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->a(IIIIII)I

    move-result v8

    .line 319
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->i:[I

    const/16 v2, 0xe

    aget v11, v1, v2

    const/16 v12, 0x9

    move v10, v6

    invoke-static/range {v7 .. v12}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->a(IIIIII)I

    move-result v7

    .line 320
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->i:[I

    const/16 v2, 0xf

    aget v10, v1, v2

    const/16 v11, 0x8

    invoke-static/range {v6 .. v11}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->a(IIIIII)I

    move-result v25

    .line 322
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->i:[I

    const/4 v2, 0x5

    aget v5, v1, v2

    const/16 v6, 0x8

    move v1, v14

    move/from16 v2, v18

    move/from16 v3, v16

    move v4, v15

    invoke-static/range {v1 .. v6}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->h(IIIIII)I

    move-result v2

    .line 323
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->i:[I

    const/16 v3, 0xe

    aget v5, v1, v3

    const/16 v6, 0x9

    move v1, v15

    move/from16 v3, v18

    move/from16 v4, v16

    invoke-static/range {v1 .. v6}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->h(IIIIII)I

    move-result v11

    .line 324
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->i:[I

    const/4 v3, 0x7

    aget v14, v1, v3

    const/16 v15, 0x9

    move/from16 v10, v16

    move v12, v2

    move/from16 v13, v18

    invoke-static/range {v10 .. v15}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->h(IIIIII)I

    move-result v13

    .line 325
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->i:[I

    const/4 v3, 0x0

    aget v16, v1, v3

    const/16 v17, 0xb

    move/from16 v12, v18

    move v14, v11

    move v15, v2

    invoke-static/range {v12 .. v17}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->h(IIIIII)I

    move-result v15

    .line 326
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->i:[I

    const/16 v3, 0x9

    aget v18, v1, v3

    const/16 v19, 0xd

    move v14, v2

    move/from16 v16, v13

    move/from16 v17, v11

    invoke-static/range {v14 .. v19}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->h(IIIIII)I

    move-result v2

    .line 327
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->i:[I

    const/4 v3, 0x2

    aget v5, v1, v3

    const/16 v6, 0xf

    move v1, v11

    move v3, v15

    move v4, v13

    invoke-static/range {v1 .. v6}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->h(IIIIII)I

    move-result v17

    .line 328
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->i:[I

    const/16 v3, 0xb

    aget v20, v1, v3

    const/16 v21, 0xf

    move/from16 v16, v13

    move/from16 v18, v2

    move/from16 v19, v15

    invoke-static/range {v16 .. v21}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->h(IIIIII)I

    move-result v16

    .line 329
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->i:[I

    const/4 v3, 0x4

    aget v19, v1, v3

    const/16 v20, 0x5

    move/from16 v18, v2

    invoke-static/range {v15 .. v20}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->h(IIIIII)I

    move-result v15

    .line 330
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->i:[I

    const/16 v3, 0xd

    aget v18, v1, v3

    const/16 v19, 0x7

    move v14, v2

    invoke-static/range {v14 .. v19}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->h(IIIIII)I

    move-result v18

    .line 331
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->i:[I

    const/4 v2, 0x6

    aget v21, v1, v2

    const/16 v22, 0x7

    move/from16 v19, v15

    move/from16 v20, v16

    invoke-static/range {v17 .. v22}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->h(IIIIII)I

    move-result v17

    .line 332
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->i:[I

    const/16 v2, 0xf

    aget v20, v1, v2

    const/16 v21, 0x8

    move/from16 v19, v15

    invoke-static/range {v16 .. v21}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->h(IIIIII)I

    move-result v16

    .line 333
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->i:[I

    const/16 v2, 0x8

    aget v19, v1, v2

    const/16 v20, 0xb

    invoke-static/range {v15 .. v20}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->h(IIIIII)I

    move-result v19

    .line 334
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->i:[I

    const/4 v2, 0x1

    aget v22, v1, v2

    const/16 v23, 0xe

    move/from16 v20, v16

    move/from16 v21, v17

    invoke-static/range {v18 .. v23}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->h(IIIIII)I

    move-result v18

    .line 335
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->i:[I

    const/16 v2, 0xa

    aget v21, v1, v2

    const/16 v22, 0xe

    move/from16 v20, v16

    invoke-static/range {v17 .. v22}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->h(IIIIII)I

    move-result v17

    .line 336
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->i:[I

    const/4 v2, 0x3

    aget v20, v1, v2

    const/16 v21, 0xc

    invoke-static/range {v16 .. v21}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->h(IIIIII)I

    move-result v20

    .line 337
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->i:[I

    const/16 v2, 0xc

    aget v23, v1, v2

    const/16 v24, 0x6

    move/from16 v21, v17

    move/from16 v22, v18

    invoke-static/range {v19 .. v24}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->h(IIIIII)I

    move-result v19

    .line 344
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->i:[I

    const/4 v2, 0x7

    aget v5, v1, v2

    const/4 v6, 0x7

    move/from16 v1, v18

    move/from16 v2, v25

    move v3, v7

    move v4, v8

    invoke-static/range {v1 .. v6}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->b(IIIIII)I

    move-result v2

    .line 345
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->i:[I

    const/4 v3, 0x4

    aget v5, v1, v3

    const/4 v6, 0x6

    move v1, v8

    move/from16 v3, v25

    move v4, v7

    invoke-static/range {v1 .. v6}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->b(IIIIII)I

    move-result v11

    .line 346
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->i:[I

    const/16 v3, 0xd

    aget v14, v1, v3

    const/16 v15, 0x8

    move v10, v7

    move v12, v2

    move/from16 v13, v25

    invoke-static/range {v10 .. v15}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->b(IIIIII)I

    move-result v4

    .line 347
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->i:[I

    const/4 v3, 0x1

    aget v7, v1, v3

    const/16 v8, 0xd

    move/from16 v3, v25

    move v5, v11

    move v6, v2

    invoke-static/range {v3 .. v8}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->b(IIIIII)I

    move-result v3

    .line 348
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->i:[I

    const/16 v5, 0xa

    aget v6, v1, v5

    const/16 v7, 0xb

    move v5, v11

    invoke-static/range {v2 .. v7}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->b(IIIIII)I

    move-result v2

    .line 349
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->i:[I

    const/4 v5, 0x6

    aget v5, v1, v5

    const/16 v6, 0x9

    move v1, v11

    invoke-static/range {v1 .. v6}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->b(IIIIII)I

    move-result v11

    .line 350
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->i:[I

    const/16 v5, 0xf

    aget v14, v1, v5

    const/4 v15, 0x7

    move v10, v4

    move v12, v2

    move v13, v3

    invoke-static/range {v10 .. v15}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->b(IIIIII)I

    move-result v4

    .line 351
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->i:[I

    const/4 v5, 0x3

    aget v7, v1, v5

    const/16 v8, 0xf

    move v5, v11

    move v6, v2

    invoke-static/range {v3 .. v8}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->b(IIIIII)I

    move-result v3

    .line 352
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->i:[I

    const/16 v5, 0xc

    aget v6, v1, v5

    const/4 v7, 0x7

    move v5, v11

    invoke-static/range {v2 .. v7}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->b(IIIIII)I

    move-result v2

    .line 353
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->i:[I

    const/4 v5, 0x0

    aget v5, v1, v5

    const/16 v6, 0xc

    move v1, v11

    invoke-static/range {v1 .. v6}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->b(IIIIII)I

    move-result v11

    .line 354
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->i:[I

    const/16 v5, 0x9

    aget v14, v1, v5

    const/16 v15, 0xf

    move v10, v4

    move v12, v2

    move v13, v3

    invoke-static/range {v10 .. v15}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->b(IIIIII)I

    move-result v4

    .line 355
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->i:[I

    const/4 v5, 0x5

    aget v7, v1, v5

    const/16 v8, 0x9

    move v5, v11

    move v6, v2

    invoke-static/range {v3 .. v8}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->b(IIIIII)I

    move-result v3

    .line 356
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->i:[I

    const/4 v5, 0x2

    aget v6, v1, v5

    const/16 v7, 0xb

    move v5, v11

    invoke-static/range {v2 .. v7}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->b(IIIIII)I

    move-result v2

    .line 357
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->i:[I

    const/16 v5, 0xe

    aget v5, v1, v5

    const/4 v6, 0x7

    move v1, v11

    invoke-static/range {v1 .. v6}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->b(IIIIII)I

    move-result v11

    .line 358
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->i:[I

    const/16 v5, 0xb

    aget v14, v1, v5

    const/16 v15, 0xd

    move v10, v4

    move v12, v2

    move v13, v3

    invoke-static/range {v10 .. v15}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->b(IIIIII)I

    move-result v4

    .line 359
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->i:[I

    const/16 v5, 0x8

    aget v7, v1, v5

    const/16 v8, 0xc

    move v5, v11

    move v6, v2

    invoke-static/range {v3 .. v8}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->b(IIIIII)I

    move-result v14

    .line 361
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->i:[I

    const/4 v3, 0x6

    aget v22, v1, v3

    const/16 v23, 0x9

    move/from16 v18, v9

    move/from16 v21, v17

    invoke-static/range {v18 .. v23}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->g(IIIIII)I

    move-result v18

    .line 362
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->i:[I

    const/16 v3, 0xb

    aget v21, v1, v3

    const/16 v22, 0xd

    invoke-static/range {v17 .. v22}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->g(IIIIII)I

    move-result v21

    .line 363
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->i:[I

    const/4 v3, 0x3

    aget v24, v1, v3

    const/16 v25, 0xf

    move/from16 v22, v18

    move/from16 v23, v19

    invoke-static/range {v20 .. v25}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->g(IIIIII)I

    move-result v20

    .line 364
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->i:[I

    const/4 v3, 0x7

    aget v23, v1, v3

    const/16 v24, 0x7

    move/from16 v22, v18

    invoke-static/range {v19 .. v24}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->g(IIIIII)I

    move-result v19

    .line 365
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->i:[I

    const/4 v3, 0x0

    aget v22, v1, v3

    const/16 v23, 0xc

    invoke-static/range {v18 .. v23}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->g(IIIIII)I

    move-result v22

    .line 366
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->i:[I

    const/16 v3, 0xd

    aget v25, v1, v3

    const/16 v26, 0x8

    move/from16 v23, v19

    move/from16 v24, v20

    invoke-static/range {v21 .. v26}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->g(IIIIII)I

    move-result v21

    .line 367
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->i:[I

    const/4 v3, 0x5

    aget v24, v1, v3

    const/16 v25, 0x9

    move/from16 v23, v19

    invoke-static/range {v20 .. v25}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->g(IIIIII)I

    move-result v20

    .line 368
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->i:[I

    const/16 v3, 0xa

    aget v23, v1, v3

    const/16 v24, 0xb

    invoke-static/range {v19 .. v24}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->g(IIIIII)I

    move-result v23

    .line 369
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->i:[I

    const/16 v3, 0xe

    aget v26, v1, v3

    const/16 v27, 0x7

    move/from16 v24, v20

    move/from16 v25, v21

    invoke-static/range {v22 .. v27}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->g(IIIIII)I

    move-result v22

    .line 370
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->i:[I

    const/16 v3, 0xf

    aget v25, v1, v3

    const/16 v26, 0x7

    move/from16 v24, v20

    invoke-static/range {v21 .. v26}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->g(IIIIII)I

    move-result v21

    .line 371
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->i:[I

    const/16 v3, 0x8

    aget v24, v1, v3

    const/16 v25, 0xc

    invoke-static/range {v20 .. v25}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->g(IIIIII)I

    move-result v24

    .line 372
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->i:[I

    const/16 v3, 0xc

    aget v27, v1, v3

    const/16 v28, 0x7

    move/from16 v25, v21

    move/from16 v26, v22

    invoke-static/range {v23 .. v28}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->g(IIIIII)I

    move-result v23

    .line 373
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->i:[I

    const/4 v3, 0x4

    aget v26, v1, v3

    const/16 v27, 0x6

    move/from16 v25, v21

    invoke-static/range {v22 .. v27}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->g(IIIIII)I

    move-result v22

    .line 374
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->i:[I

    const/16 v3, 0x9

    aget v25, v1, v3

    const/16 v26, 0xf

    invoke-static/range {v21 .. v26}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->g(IIIIII)I

    move-result v25

    .line 375
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->i:[I

    const/4 v3, 0x1

    aget v28, v1, v3

    const/16 v29, 0xd

    move/from16 v26, v22

    move/from16 v27, v23

    invoke-static/range {v24 .. v29}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->g(IIIIII)I

    move-result v24

    .line 376
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->i:[I

    const/4 v3, 0x2

    aget v27, v1, v3

    const/16 v28, 0xb

    move/from16 v26, v22

    invoke-static/range {v23 .. v28}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->g(IIIIII)I

    move-result v3

    .line 383
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->i:[I

    const/4 v5, 0x3

    aget v6, v1, v5

    const/16 v7, 0xb

    move v5, v11

    invoke-static/range {v2 .. v7}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->c(IIIIII)I

    move-result v2

    .line 384
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->i:[I

    const/16 v5, 0xa

    aget v5, v1, v5

    const/16 v6, 0xd

    move v1, v11

    invoke-static/range {v1 .. v6}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->c(IIIIII)I

    move-result v5

    .line 385
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->i:[I

    const/16 v6, 0xe

    aget v8, v1, v6

    const/4 v9, 0x6

    move v6, v2

    move v7, v3

    invoke-static/range {v4 .. v9}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->c(IIIIII)I

    move-result v4

    .line 386
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->i:[I

    const/4 v6, 0x4

    aget v7, v1, v6

    const/4 v8, 0x7

    move v6, v2

    invoke-static/range {v3 .. v8}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->c(IIIIII)I

    move-result v3

    .line 387
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->i:[I

    const/16 v6, 0x9

    aget v6, v1, v6

    const/16 v7, 0xe

    invoke-static/range {v2 .. v7}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->c(IIIIII)I

    move-result v6

    .line 388
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->i:[I

    const/16 v2, 0xf

    aget v9, v1, v2

    const/16 v10, 0x9

    move v7, v3

    move v8, v4

    invoke-static/range {v5 .. v10}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->c(IIIIII)I

    move-result v5

    .line 389
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->i:[I

    const/16 v2, 0x8

    aget v8, v1, v2

    const/16 v9, 0xd

    move v7, v3

    invoke-static/range {v4 .. v9}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->c(IIIIII)I

    move-result v4

    .line 390
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->i:[I

    const/4 v2, 0x1

    aget v7, v1, v2

    const/16 v8, 0xf

    invoke-static/range {v3 .. v8}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->c(IIIIII)I

    move-result v7

    .line 391
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->i:[I

    const/4 v2, 0x2

    aget v10, v1, v2

    const/16 v11, 0xe

    move v8, v4

    move v9, v5

    invoke-static/range {v6 .. v11}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->c(IIIIII)I

    move-result v6

    .line 392
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->i:[I

    const/4 v2, 0x7

    aget v9, v1, v2

    const/16 v10, 0x8

    move v8, v4

    invoke-static/range {v5 .. v10}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->c(IIIIII)I

    move-result v5

    .line 393
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->i:[I

    const/4 v2, 0x0

    aget v8, v1, v2

    const/16 v9, 0xd

    invoke-static/range {v4 .. v9}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->c(IIIIII)I

    move-result v8

    .line 394
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->i:[I

    const/4 v2, 0x6

    aget v11, v1, v2

    const/4 v12, 0x6

    move v9, v5

    move v10, v6

    invoke-static/range {v7 .. v12}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->c(IIIIII)I

    move-result v7

    .line 395
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->i:[I

    const/16 v2, 0xd

    aget v10, v1, v2

    const/4 v11, 0x5

    move v9, v5

    invoke-static/range {v6 .. v11}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->c(IIIIII)I

    move-result v6

    .line 396
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->i:[I

    const/16 v2, 0xb

    aget v9, v1, v2

    const/16 v10, 0xc

    invoke-static/range {v5 .. v10}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->c(IIIIII)I

    move-result v9

    .line 397
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->i:[I

    const/4 v2, 0x5

    aget v12, v1, v2

    const/4 v13, 0x7

    move v10, v6

    move v11, v7

    invoke-static/range {v8 .. v13}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->c(IIIIII)I

    move-result v8

    .line 398
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->i:[I

    const/16 v2, 0xc

    aget v11, v1, v2

    const/4 v12, 0x5

    move v10, v6

    invoke-static/range {v7 .. v12}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->c(IIIIII)I

    move-result v11

    .line 400
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->i:[I

    const/16 v2, 0xf

    aget v26, v1, v2

    const/16 v27, 0x9

    move/from16 v23, v14

    invoke-static/range {v22 .. v27}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->f(IIIIII)I

    move-result v26

    .line 401
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->i:[I

    const/4 v2, 0x5

    aget v29, v1, v2

    const/16 v30, 0x7

    move/from16 v27, v14

    move/from16 v28, v24

    invoke-static/range {v25 .. v30}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->f(IIIIII)I

    move-result v25

    .line 402
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->i:[I

    const/4 v2, 0x1

    aget v28, v1, v2

    const/16 v29, 0xf

    move/from16 v27, v14

    invoke-static/range {v24 .. v29}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->f(IIIIII)I

    move-result v24

    .line 403
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->i:[I

    const/4 v2, 0x3

    aget v27, v1, v2

    const/16 v28, 0xb

    move/from16 v23, v14

    invoke-static/range {v23 .. v28}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->f(IIIIII)I

    move-result v27

    .line 404
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->i:[I

    const/4 v2, 0x7

    aget v30, v1, v2

    const/16 v31, 0x8

    move/from16 v28, v24

    move/from16 v29, v25

    invoke-static/range {v26 .. v31}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->f(IIIIII)I

    move-result v26

    .line 405
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->i:[I

    const/16 v2, 0xe

    aget v29, v1, v2

    const/16 v30, 0x6

    move/from16 v28, v24

    invoke-static/range {v25 .. v30}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->f(IIIIII)I

    move-result v25

    .line 406
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->i:[I

    const/4 v2, 0x6

    aget v28, v1, v2

    const/16 v29, 0x6

    invoke-static/range {v24 .. v29}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->f(IIIIII)I

    move-result v28

    .line 407
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->i:[I

    const/16 v2, 0x9

    aget v31, v1, v2

    const/16 v32, 0xe

    move/from16 v29, v25

    move/from16 v30, v26

    invoke-static/range {v27 .. v32}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->f(IIIIII)I

    move-result v27

    .line 408
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->i:[I

    const/16 v2, 0xb

    aget v30, v1, v2

    const/16 v31, 0xc

    move/from16 v29, v25

    invoke-static/range {v26 .. v31}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->f(IIIIII)I

    move-result v26

    .line 409
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->i:[I

    const/16 v2, 0x8

    aget v29, v1, v2

    const/16 v30, 0xd

    invoke-static/range {v25 .. v30}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->f(IIIIII)I

    move-result v29

    .line 410
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->i:[I

    const/16 v2, 0xc

    aget v32, v1, v2

    const/16 v33, 0x5

    move/from16 v30, v26

    move/from16 v31, v27

    invoke-static/range {v28 .. v33}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->f(IIIIII)I

    move-result v28

    .line 411
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->i:[I

    const/4 v2, 0x2

    aget v31, v1, v2

    const/16 v32, 0xe

    move/from16 v30, v26

    invoke-static/range {v27 .. v32}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->f(IIIIII)I

    move-result v27

    .line 412
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->i:[I

    const/16 v2, 0xa

    aget v30, v1, v2

    const/16 v31, 0xd

    invoke-static/range {v26 .. v31}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->f(IIIIII)I

    move-result v30

    .line 413
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->i:[I

    const/4 v2, 0x0

    aget v33, v1, v2

    const/16 v34, 0xd

    move/from16 v31, v27

    move/from16 v32, v28

    invoke-static/range {v29 .. v34}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->f(IIIIII)I

    move-result v29

    .line 414
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->i:[I

    const/4 v2, 0x4

    aget v32, v1, v2

    const/16 v33, 0x7

    move/from16 v31, v27

    invoke-static/range {v28 .. v33}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->f(IIIIII)I

    move-result v28

    .line 415
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->i:[I

    const/16 v2, 0xd

    aget v31, v1, v2

    const/16 v32, 0x5

    invoke-static/range {v27 .. v32}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->f(IIIIII)I

    move-result v31

    .line 422
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->i:[I

    const/4 v2, 0x1

    aget v14, v1, v2

    const/16 v15, 0xb

    move v10, v6

    move/from16 v12, v28

    move v13, v9

    invoke-static/range {v10 .. v15}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->d(IIIIII)I

    move-result v10

    .line 423
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->i:[I

    const/16 v2, 0x9

    aget v13, v1, v2

    const/16 v14, 0xc

    move/from16 v12, v28

    invoke-static/range {v9 .. v14}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->d(IIIIII)I

    move-result v2

    .line 424
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->i:[I

    const/16 v3, 0xb

    aget v5, v1, v3

    const/16 v6, 0xe

    move/from16 v1, v28

    move v3, v10

    move v4, v11

    invoke-static/range {v1 .. v6}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->d(IIIIII)I

    move-result v12

    .line 425
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->i:[I

    const/16 v3, 0xa

    aget v15, v1, v3

    const/16 v16, 0xf

    move v13, v2

    move v14, v10

    invoke-static/range {v11 .. v16}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->d(IIIIII)I

    move-result v11

    .line 426
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->i:[I

    const/4 v3, 0x0

    aget v14, v1, v3

    const/16 v15, 0xe

    move v13, v2

    invoke-static/range {v10 .. v15}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->d(IIIIII)I

    move-result v10

    .line 427
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->i:[I

    const/16 v3, 0x8

    aget v13, v1, v3

    const/16 v14, 0xf

    move v9, v2

    invoke-static/range {v9 .. v14}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->d(IIIIII)I

    move-result v13

    .line 428
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->i:[I

    const/16 v2, 0xc

    aget v16, v1, v2

    const/16 v17, 0x9

    move v14, v10

    move v15, v11

    invoke-static/range {v12 .. v17}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->d(IIIIII)I

    move-result v12

    .line 429
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->i:[I

    const/4 v2, 0x4

    aget v15, v1, v2

    const/16 v16, 0x8

    move v14, v10

    invoke-static/range {v11 .. v16}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->d(IIIIII)I

    move-result v11

    .line 430
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->i:[I

    const/16 v2, 0xd

    aget v14, v1, v2

    const/16 v15, 0x9

    invoke-static/range {v10 .. v15}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->d(IIIIII)I

    move-result v14

    .line 431
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->i:[I

    const/4 v2, 0x3

    aget v17, v1, v2

    const/16 v18, 0xe

    move v15, v11

    move/from16 v16, v12

    invoke-static/range {v13 .. v18}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->d(IIIIII)I

    move-result v13

    .line 432
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->i:[I

    const/4 v2, 0x7

    aget v16, v1, v2

    const/16 v17, 0x5

    move v15, v11

    invoke-static/range {v12 .. v17}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->d(IIIIII)I

    move-result v12

    .line 433
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->i:[I

    const/16 v2, 0xf

    aget v15, v1, v2

    const/16 v16, 0x6

    invoke-static/range {v11 .. v16}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->d(IIIIII)I

    move-result v15

    .line 434
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->i:[I

    const/16 v2, 0xe

    aget v18, v1, v2

    const/16 v19, 0x8

    move/from16 v16, v12

    move/from16 v17, v13

    invoke-static/range {v14 .. v19}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->d(IIIIII)I

    move-result v14

    .line 435
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->i:[I

    const/4 v2, 0x5

    aget v17, v1, v2

    const/16 v18, 0x6

    move/from16 v16, v12

    invoke-static/range {v13 .. v18}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->d(IIIIII)I

    move-result v13

    .line 436
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->i:[I

    const/4 v2, 0x6

    aget v16, v1, v2

    const/16 v17, 0x5

    invoke-static/range {v12 .. v17}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->d(IIIIII)I

    move-result v16

    .line 437
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->i:[I

    const/4 v2, 0x2

    aget v19, v1, v2

    const/16 v20, 0xc

    move/from16 v17, v13

    move/from16 v18, v14

    invoke-static/range {v15 .. v20}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->d(IIIIII)I

    move-result v1

    .line 439
    move-object/from16 v0, p0

    iget-object v2, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->i:[I

    const/16 v3, 0x8

    aget v34, v2, v3

    const/16 v35, 0xf

    move/from16 v32, v8

    move/from16 v33, v29

    invoke-static/range {v30 .. v35}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->e(IIIIII)I

    move-result v30

    .line 440
    move-object/from16 v0, p0

    iget-object v2, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->i:[I

    const/4 v3, 0x6

    aget v33, v2, v3

    const/16 v34, 0x5

    move/from16 v32, v8

    invoke-static/range {v29 .. v34}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->e(IIIIII)I

    move-result v29

    .line 441
    move-object/from16 v0, p0

    iget-object v2, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->i:[I

    const/4 v3, 0x4

    aget v32, v2, v3

    const/16 v33, 0x8

    move/from16 v28, v8

    invoke-static/range {v28 .. v33}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->e(IIIIII)I

    move-result v32

    .line 442
    move-object/from16 v0, p0

    iget-object v2, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->i:[I

    const/4 v3, 0x1

    aget v35, v2, v3

    const/16 v36, 0xb

    move/from16 v33, v29

    move/from16 v34, v30

    invoke-static/range {v31 .. v36}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->e(IIIIII)I

    move-result v31

    .line 443
    move-object/from16 v0, p0

    iget-object v2, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->i:[I

    const/4 v3, 0x3

    aget v34, v2, v3

    const/16 v35, 0xe

    move/from16 v33, v29

    invoke-static/range {v30 .. v35}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->e(IIIIII)I

    move-result v30

    .line 444
    move-object/from16 v0, p0

    iget-object v2, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->i:[I

    const/16 v3, 0xb

    aget v33, v2, v3

    const/16 v34, 0xe

    invoke-static/range {v29 .. v34}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->e(IIIIII)I

    move-result v33

    .line 445
    move-object/from16 v0, p0

    iget-object v2, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->i:[I

    const/16 v3, 0xf

    aget v36, v2, v3

    const/16 v37, 0x6

    move/from16 v34, v30

    move/from16 v35, v31

    invoke-static/range {v32 .. v37}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->e(IIIIII)I

    move-result v32

    .line 446
    move-object/from16 v0, p0

    iget-object v2, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->i:[I

    const/4 v3, 0x0

    aget v35, v2, v3

    const/16 v36, 0xe

    move/from16 v34, v30

    invoke-static/range {v31 .. v36}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->e(IIIIII)I

    move-result v31

    .line 447
    move-object/from16 v0, p0

    iget-object v2, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->i:[I

    const/4 v3, 0x5

    aget v34, v2, v3

    const/16 v35, 0x6

    invoke-static/range {v30 .. v35}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->e(IIIIII)I

    move-result v34

    .line 448
    move-object/from16 v0, p0

    iget-object v2, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->i:[I

    const/16 v3, 0xc

    aget v37, v2, v3

    const/16 v38, 0x9

    move/from16 v35, v31

    move/from16 v36, v32

    invoke-static/range {v33 .. v38}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->e(IIIIII)I

    move-result v33

    .line 449
    move-object/from16 v0, p0

    iget-object v2, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->i:[I

    const/4 v3, 0x2

    aget v36, v2, v3

    const/16 v37, 0xc

    move/from16 v35, v31

    invoke-static/range {v32 .. v37}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->e(IIIIII)I

    move-result v32

    .line 450
    move-object/from16 v0, p0

    iget-object v2, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->i:[I

    const/16 v3, 0xd

    aget v35, v2, v3

    const/16 v36, 0x9

    invoke-static/range {v31 .. v36}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->e(IIIIII)I

    move-result v35

    .line 451
    move-object/from16 v0, p0

    iget-object v2, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->i:[I

    const/16 v3, 0x9

    aget v38, v2, v3

    const/16 v39, 0xc

    move/from16 v36, v32

    move/from16 v37, v33

    invoke-static/range {v34 .. v39}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->e(IIIIII)I

    move-result v34

    .line 452
    move-object/from16 v0, p0

    iget-object v2, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->i:[I

    const/4 v3, 0x7

    aget v37, v2, v3

    const/16 v38, 0x5

    move/from16 v36, v32

    invoke-static/range {v33 .. v38}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->e(IIIIII)I

    move-result v33

    .line 453
    move-object/from16 v0, p0

    iget-object v2, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->i:[I

    const/16 v3, 0xa

    aget v36, v2, v3

    const/16 v37, 0xf

    invoke-static/range {v32 .. v37}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->e(IIIIII)I

    move-result v36

    .line 454
    move-object/from16 v0, p0

    iget-object v2, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->i:[I

    const/16 v3, 0xe

    aget v39, v2, v3

    const/16 v40, 0x8

    move/from16 v37, v33

    move/from16 v38, v34

    invoke-static/range {v35 .. v40}, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->e(IIIIII)I

    move-result v2

    .line 458
    move-object/from16 v0, p0

    iget v3, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->a:I

    add-int/2addr v3, v14

    move-object/from16 v0, p0

    iput v3, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->a:I

    .line 459
    move-object/from16 v0, p0

    iget v3, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->b:I

    add-int/2addr v1, v3

    move-object/from16 v0, p0

    iput v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->b:I

    .line 460
    move-object/from16 v0, p0

    iget v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->c:I

    add-int v1, v1, v16

    move-object/from16 v0, p0

    iput v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->c:I

    .line 461
    move-object/from16 v0, p0

    iget v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->d:I

    add-int v1, v1, v33

    move-object/from16 v0, p0

    iput v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->d:I

    .line 462
    move-object/from16 v0, p0

    iget v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->e:I

    add-int v1, v1, v34

    move-object/from16 v0, p0

    iput v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->e:I

    .line 463
    move-object/from16 v0, p0

    iget v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->f:I

    add-int/2addr v1, v2

    move-object/from16 v0, p0

    iput v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->f:I

    .line 464
    move-object/from16 v0, p0

    iget v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->g:I

    add-int v1, v1, v36

    move-object/from16 v0, p0

    iput v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->g:I

    .line 465
    move-object/from16 v0, p0

    iget v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->h:I

    add-int/2addr v1, v13

    move-object/from16 v0, p0

    iput v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->h:I

    .line 470
    const/4 v1, 0x0

    move-object/from16 v0, p0

    iput v1, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->j:I

    .line 471
    const/4 v1, 0x0

    :goto_0
    move-object/from16 v0, p0

    iget-object v2, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->i:[I

    array-length v2, v2

    if-eq v1, v2, :cond_0

    .line 473
    move-object/from16 v0, p0

    iget-object v2, v0, Lorg/spongycastle/crypto/digests/RIPEMD256Digest;->i:[I

    const/4 v3, 0x0

    aput v3, v2, v1

    .line 471
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 475
    :cond_0
    return-void
.end method
