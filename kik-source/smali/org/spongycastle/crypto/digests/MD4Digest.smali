.class public Lorg/spongycastle/crypto/digests/MD4Digest;
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
    .line 25
    invoke-direct {p0}, Lorg/spongycastle/crypto/digests/GeneralDigest;-><init>()V

    .line 18
    const/16 v0, 0x10

    new-array v0, v0, [I

    iput-object v0, p0, Lorg/spongycastle/crypto/digests/MD4Digest;->e:[I

    .line 26
    invoke-virtual {p0}, Lorg/spongycastle/crypto/digests/MD4Digest;->c()V

    .line 27
    return-void
.end method

.method public constructor <init>(Lorg/spongycastle/crypto/digests/MD4Digest;)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 35
    invoke-direct {p0, p1}, Lorg/spongycastle/crypto/digests/GeneralDigest;-><init>(Lorg/spongycastle/crypto/digests/GeneralDigest;)V

    .line 18
    const/16 v0, 0x10

    new-array v0, v0, [I

    iput-object v0, p0, Lorg/spongycastle/crypto/digests/MD4Digest;->e:[I

    .line 37
    iget v0, p1, Lorg/spongycastle/crypto/digests/MD4Digest;->a:I

    iput v0, p0, Lorg/spongycastle/crypto/digests/MD4Digest;->a:I

    .line 38
    iget v0, p1, Lorg/spongycastle/crypto/digests/MD4Digest;->b:I

    iput v0, p0, Lorg/spongycastle/crypto/digests/MD4Digest;->b:I

    .line 39
    iget v0, p1, Lorg/spongycastle/crypto/digests/MD4Digest;->c:I

    iput v0, p0, Lorg/spongycastle/crypto/digests/MD4Digest;->c:I

    .line 40
    iget v0, p1, Lorg/spongycastle/crypto/digests/MD4Digest;->d:I

    iput v0, p0, Lorg/spongycastle/crypto/digests/MD4Digest;->d:I

    .line 42
    iget-object v0, p1, Lorg/spongycastle/crypto/digests/MD4Digest;->e:[I

    iget-object v1, p0, Lorg/spongycastle/crypto/digests/MD4Digest;->e:[I

    iget-object v2, p1, Lorg/spongycastle/crypto/digests/MD4Digest;->e:[I

    array-length v2, v2

    invoke-static {v0, v3, v1, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 43
    iget v0, p1, Lorg/spongycastle/crypto/digests/MD4Digest;->f:I

    iput v0, p0, Lorg/spongycastle/crypto/digests/MD4Digest;->f:I

    .line 44
    return-void
.end method

.method private static a(II)I
    .locals 2

    .prologue
    .line 159
    shl-int v0, p0, p1

    rsub-int/lit8 v1, p1, 0x20

    ushr-int v1, p0, v1

    or-int/2addr v0, v1

    return v0
.end method

.method private static a(III)I
    .locals 2

    .prologue
    .line 170
    and-int v0, p0, p1

    xor-int/lit8 v1, p0, -0x1

    and-int/2addr v1, p2

    or-int/2addr v0, v1

    return v0
.end method

.method private static a(I[BI)V
    .locals 2

    .prologue
    .line 86
    int-to-byte v0, p0

    aput-byte v0, p1, p2

    .line 87
    add-int/lit8 v0, p2, 0x1

    ushr-int/lit8 v1, p0, 0x8

    int-to-byte v1, v1

    aput-byte v1, p1, v0

    .line 88
    add-int/lit8 v0, p2, 0x2

    ushr-int/lit8 v1, p0, 0x10

    int-to-byte v1, v1

    aput-byte v1, p1, v0

    .line 89
    add-int/lit8 v0, p2, 0x3

    ushr-int/lit8 v1, p0, 0x18

    int-to-byte v1, v1

    aput-byte v1, p1, v0

    .line 90
    return-void
.end method

.method private static b(III)I
    .locals 2

    .prologue
    .line 178
    and-int v0, p0, p1

    and-int v1, p0, p2

    or-int/2addr v0, v1

    and-int v1, p1, p2

    or-int/2addr v0, v1

    return v0
.end method


# virtual methods
.method public final a([BI)I
    .locals 2

    .prologue
    .line 96
    invoke-virtual {p0}, Lorg/spongycastle/crypto/digests/MD4Digest;->e()V

    .line 98
    iget v0, p0, Lorg/spongycastle/crypto/digests/MD4Digest;->a:I

    invoke-static {v0, p1, p2}, Lorg/spongycastle/crypto/digests/MD4Digest;->a(I[BI)V

    .line 99
    iget v0, p0, Lorg/spongycastle/crypto/digests/MD4Digest;->b:I

    add-int/lit8 v1, p2, 0x4

    invoke-static {v0, p1, v1}, Lorg/spongycastle/crypto/digests/MD4Digest;->a(I[BI)V

    .line 100
    iget v0, p0, Lorg/spongycastle/crypto/digests/MD4Digest;->c:I

    add-int/lit8 v1, p2, 0x8

    invoke-static {v0, p1, v1}, Lorg/spongycastle/crypto/digests/MD4Digest;->a(I[BI)V

    .line 101
    iget v0, p0, Lorg/spongycastle/crypto/digests/MD4Digest;->d:I

    add-int/lit8 v1, p2, 0xc

    invoke-static {v0, p1, v1}, Lorg/spongycastle/crypto/digests/MD4Digest;->a(I[BI)V

    .line 103
    invoke-virtual {p0}, Lorg/spongycastle/crypto/digests/MD4Digest;->c()V

    .line 105
    const/16 v0, 0x10

    return v0
.end method

.method public final a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 48
    const-string v0, "MD4"

    return-object v0
.end method

.method protected final a(J)V
    .locals 5

    .prologue
    const/16 v4, 0xe

    .line 72
    iget v0, p0, Lorg/spongycastle/crypto/digests/MD4Digest;->f:I

    if-le v0, v4, :cond_0

    .line 74
    invoke-virtual {p0}, Lorg/spongycastle/crypto/digests/MD4Digest;->f()V

    .line 77
    :cond_0
    iget-object v0, p0, Lorg/spongycastle/crypto/digests/MD4Digest;->e:[I

    const-wide/16 v2, -0x1

    and-long/2addr v2, p1

    long-to-int v1, v2

    aput v1, v0, v4

    .line 78
    iget-object v0, p0, Lorg/spongycastle/crypto/digests/MD4Digest;->e:[I

    const/16 v1, 0xf

    const/16 v2, 0x20

    ushr-long v2, p1, v2

    long-to-int v2, v2

    aput v2, v0, v1

    .line 79
    return-void
.end method

.method public final b()I
    .locals 1

    .prologue
    .line 53
    const/16 v0, 0x10

    return v0
.end method

.method protected final b([BI)V
    .locals 4

    .prologue
    .line 60
    iget-object v0, p0, Lorg/spongycastle/crypto/digests/MD4Digest;->e:[I

    iget v1, p0, Lorg/spongycastle/crypto/digests/MD4Digest;->f:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lorg/spongycastle/crypto/digests/MD4Digest;->f:I

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

    .line 63
    iget v0, p0, Lorg/spongycastle/crypto/digests/MD4Digest;->f:I

    const/16 v1, 0x10

    if-ne v0, v1, :cond_0

    .line 65
    invoke-virtual {p0}, Lorg/spongycastle/crypto/digests/MD4Digest;->f()V

    .line 67
    :cond_0
    return-void
.end method

.method public final c()V
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 113
    invoke-super {p0}, Lorg/spongycastle/crypto/digests/GeneralDigest;->c()V

    .line 115
    const v0, 0x67452301

    iput v0, p0, Lorg/spongycastle/crypto/digests/MD4Digest;->a:I

    .line 116
    const v0, -0x10325477

    iput v0, p0, Lorg/spongycastle/crypto/digests/MD4Digest;->b:I

    .line 117
    const v0, -0x67452302

    iput v0, p0, Lorg/spongycastle/crypto/digests/MD4Digest;->c:I

    .line 118
    const v0, 0x10325476

    iput v0, p0, Lorg/spongycastle/crypto/digests/MD4Digest;->d:I

    .line 120
    iput v1, p0, Lorg/spongycastle/crypto/digests/MD4Digest;->f:I

    move v0, v1

    .line 122
    :goto_0
    iget-object v2, p0, Lorg/spongycastle/crypto/digests/MD4Digest;->e:[I

    array-length v2, v2

    if-eq v0, v2, :cond_0

    .line 124
    iget-object v2, p0, Lorg/spongycastle/crypto/digests/MD4Digest;->e:[I

    aput v1, v2, v0

    .line 122
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 126
    :cond_0
    return-void
.end method

.method protected final f()V
    .locals 11

    .prologue
    const/16 v10, 0xb

    const/16 v9, 0x9

    const/4 v8, 0x3

    const v7, 0x6ed9eba1

    const v6, 0x5a827999

    .line 191
    iget v0, p0, Lorg/spongycastle/crypto/digests/MD4Digest;->a:I

    .line 192
    iget v1, p0, Lorg/spongycastle/crypto/digests/MD4Digest;->b:I

    .line 193
    iget v2, p0, Lorg/spongycastle/crypto/digests/MD4Digest;->c:I

    .line 194
    iget v3, p0, Lorg/spongycastle/crypto/digests/MD4Digest;->d:I

    .line 199
    invoke-static {v1, v2, v3}, Lorg/spongycastle/crypto/digests/MD4Digest;->a(III)I

    move-result v4

    add-int/2addr v0, v4

    iget-object v4, p0, Lorg/spongycastle/crypto/digests/MD4Digest;->e:[I

    const/4 v5, 0x0

    aget v4, v4, v5

    add-int/2addr v0, v4

    invoke-static {v0, v8}, Lorg/spongycastle/crypto/digests/MD4Digest;->a(II)I

    move-result v0

    .line 200
    invoke-static {v0, v1, v2}, Lorg/spongycastle/crypto/digests/MD4Digest;->a(III)I

    move-result v4

    add-int/2addr v3, v4

    iget-object v4, p0, Lorg/spongycastle/crypto/digests/MD4Digest;->e:[I

    const/4 v5, 0x1

    aget v4, v4, v5

    add-int/2addr v3, v4

    const/4 v4, 0x7

    invoke-static {v3, v4}, Lorg/spongycastle/crypto/digests/MD4Digest;->a(II)I

    move-result v3

    .line 201
    invoke-static {v3, v0, v1}, Lorg/spongycastle/crypto/digests/MD4Digest;->a(III)I

    move-result v4

    add-int/2addr v2, v4

    iget-object v4, p0, Lorg/spongycastle/crypto/digests/MD4Digest;->e:[I

    const/4 v5, 0x2

    aget v4, v4, v5

    add-int/2addr v2, v4

    invoke-static {v2, v10}, Lorg/spongycastle/crypto/digests/MD4Digest;->a(II)I

    move-result v2

    .line 202
    invoke-static {v2, v3, v0}, Lorg/spongycastle/crypto/digests/MD4Digest;->a(III)I

    move-result v4

    add-int/2addr v1, v4

    iget-object v4, p0, Lorg/spongycastle/crypto/digests/MD4Digest;->e:[I

    aget v4, v4, v8

    add-int/2addr v1, v4

    const/16 v4, 0x13

    invoke-static {v1, v4}, Lorg/spongycastle/crypto/digests/MD4Digest;->a(II)I

    move-result v1

    .line 203
    invoke-static {v1, v2, v3}, Lorg/spongycastle/crypto/digests/MD4Digest;->a(III)I

    move-result v4

    add-int/2addr v0, v4

    iget-object v4, p0, Lorg/spongycastle/crypto/digests/MD4Digest;->e:[I

    const/4 v5, 0x4

    aget v4, v4, v5

    add-int/2addr v0, v4

    invoke-static {v0, v8}, Lorg/spongycastle/crypto/digests/MD4Digest;->a(II)I

    move-result v0

    .line 204
    invoke-static {v0, v1, v2}, Lorg/spongycastle/crypto/digests/MD4Digest;->a(III)I

    move-result v4

    add-int/2addr v3, v4

    iget-object v4, p0, Lorg/spongycastle/crypto/digests/MD4Digest;->e:[I

    const/4 v5, 0x5

    aget v4, v4, v5

    add-int/2addr v3, v4

    const/4 v4, 0x7

    invoke-static {v3, v4}, Lorg/spongycastle/crypto/digests/MD4Digest;->a(II)I

    move-result v3

    .line 205
    invoke-static {v3, v0, v1}, Lorg/spongycastle/crypto/digests/MD4Digest;->a(III)I

    move-result v4

    add-int/2addr v2, v4

    iget-object v4, p0, Lorg/spongycastle/crypto/digests/MD4Digest;->e:[I

    const/4 v5, 0x6

    aget v4, v4, v5

    add-int/2addr v2, v4

    invoke-static {v2, v10}, Lorg/spongycastle/crypto/digests/MD4Digest;->a(II)I

    move-result v2

    .line 206
    invoke-static {v2, v3, v0}, Lorg/spongycastle/crypto/digests/MD4Digest;->a(III)I

    move-result v4

    add-int/2addr v1, v4

    iget-object v4, p0, Lorg/spongycastle/crypto/digests/MD4Digest;->e:[I

    const/4 v5, 0x7

    aget v4, v4, v5

    add-int/2addr v1, v4

    const/16 v4, 0x13

    invoke-static {v1, v4}, Lorg/spongycastle/crypto/digests/MD4Digest;->a(II)I

    move-result v1

    .line 207
    invoke-static {v1, v2, v3}, Lorg/spongycastle/crypto/digests/MD4Digest;->a(III)I

    move-result v4

    add-int/2addr v0, v4

    iget-object v4, p0, Lorg/spongycastle/crypto/digests/MD4Digest;->e:[I

    const/16 v5, 0x8

    aget v4, v4, v5

    add-int/2addr v0, v4

    invoke-static {v0, v8}, Lorg/spongycastle/crypto/digests/MD4Digest;->a(II)I

    move-result v0

    .line 208
    invoke-static {v0, v1, v2}, Lorg/spongycastle/crypto/digests/MD4Digest;->a(III)I

    move-result v4

    add-int/2addr v3, v4

    iget-object v4, p0, Lorg/spongycastle/crypto/digests/MD4Digest;->e:[I

    aget v4, v4, v9

    add-int/2addr v3, v4

    const/4 v4, 0x7

    invoke-static {v3, v4}, Lorg/spongycastle/crypto/digests/MD4Digest;->a(II)I

    move-result v3

    .line 209
    invoke-static {v3, v0, v1}, Lorg/spongycastle/crypto/digests/MD4Digest;->a(III)I

    move-result v4

    add-int/2addr v2, v4

    iget-object v4, p0, Lorg/spongycastle/crypto/digests/MD4Digest;->e:[I

    const/16 v5, 0xa

    aget v4, v4, v5

    add-int/2addr v2, v4

    invoke-static {v2, v10}, Lorg/spongycastle/crypto/digests/MD4Digest;->a(II)I

    move-result v2

    .line 210
    invoke-static {v2, v3, v0}, Lorg/spongycastle/crypto/digests/MD4Digest;->a(III)I

    move-result v4

    add-int/2addr v1, v4

    iget-object v4, p0, Lorg/spongycastle/crypto/digests/MD4Digest;->e:[I

    aget v4, v4, v10

    add-int/2addr v1, v4

    const/16 v4, 0x13

    invoke-static {v1, v4}, Lorg/spongycastle/crypto/digests/MD4Digest;->a(II)I

    move-result v1

    .line 211
    invoke-static {v1, v2, v3}, Lorg/spongycastle/crypto/digests/MD4Digest;->a(III)I

    move-result v4

    add-int/2addr v0, v4

    iget-object v4, p0, Lorg/spongycastle/crypto/digests/MD4Digest;->e:[I

    const/16 v5, 0xc

    aget v4, v4, v5

    add-int/2addr v0, v4

    invoke-static {v0, v8}, Lorg/spongycastle/crypto/digests/MD4Digest;->a(II)I

    move-result v0

    .line 212
    invoke-static {v0, v1, v2}, Lorg/spongycastle/crypto/digests/MD4Digest;->a(III)I

    move-result v4

    add-int/2addr v3, v4

    iget-object v4, p0, Lorg/spongycastle/crypto/digests/MD4Digest;->e:[I

    const/16 v5, 0xd

    aget v4, v4, v5

    add-int/2addr v3, v4

    const/4 v4, 0x7

    invoke-static {v3, v4}, Lorg/spongycastle/crypto/digests/MD4Digest;->a(II)I

    move-result v3

    .line 213
    invoke-static {v3, v0, v1}, Lorg/spongycastle/crypto/digests/MD4Digest;->a(III)I

    move-result v4

    add-int/2addr v2, v4

    iget-object v4, p0, Lorg/spongycastle/crypto/digests/MD4Digest;->e:[I

    const/16 v5, 0xe

    aget v4, v4, v5

    add-int/2addr v2, v4

    invoke-static {v2, v10}, Lorg/spongycastle/crypto/digests/MD4Digest;->a(II)I

    move-result v2

    .line 214
    invoke-static {v2, v3, v0}, Lorg/spongycastle/crypto/digests/MD4Digest;->a(III)I

    move-result v4

    add-int/2addr v1, v4

    iget-object v4, p0, Lorg/spongycastle/crypto/digests/MD4Digest;->e:[I

    const/16 v5, 0xf

    aget v4, v4, v5

    add-int/2addr v1, v4

    const/16 v4, 0x13

    invoke-static {v1, v4}, Lorg/spongycastle/crypto/digests/MD4Digest;->a(II)I

    move-result v1

    .line 219
    invoke-static {v1, v2, v3}, Lorg/spongycastle/crypto/digests/MD4Digest;->b(III)I

    move-result v4

    add-int/2addr v0, v4

    iget-object v4, p0, Lorg/spongycastle/crypto/digests/MD4Digest;->e:[I

    const/4 v5, 0x0

    aget v4, v4, v5

    add-int/2addr v0, v4

    add-int/2addr v0, v6

    invoke-static {v0, v8}, Lorg/spongycastle/crypto/digests/MD4Digest;->a(II)I

    move-result v0

    .line 220
    invoke-static {v0, v1, v2}, Lorg/spongycastle/crypto/digests/MD4Digest;->b(III)I

    move-result v4

    add-int/2addr v3, v4

    iget-object v4, p0, Lorg/spongycastle/crypto/digests/MD4Digest;->e:[I

    const/4 v5, 0x4

    aget v4, v4, v5

    add-int/2addr v3, v4

    add-int/2addr v3, v6

    const/4 v4, 0x5

    invoke-static {v3, v4}, Lorg/spongycastle/crypto/digests/MD4Digest;->a(II)I

    move-result v3

    .line 221
    invoke-static {v3, v0, v1}, Lorg/spongycastle/crypto/digests/MD4Digest;->b(III)I

    move-result v4

    add-int/2addr v2, v4

    iget-object v4, p0, Lorg/spongycastle/crypto/digests/MD4Digest;->e:[I

    const/16 v5, 0x8

    aget v4, v4, v5

    add-int/2addr v2, v4

    add-int/2addr v2, v6

    invoke-static {v2, v9}, Lorg/spongycastle/crypto/digests/MD4Digest;->a(II)I

    move-result v2

    .line 222
    invoke-static {v2, v3, v0}, Lorg/spongycastle/crypto/digests/MD4Digest;->b(III)I

    move-result v4

    add-int/2addr v1, v4

    iget-object v4, p0, Lorg/spongycastle/crypto/digests/MD4Digest;->e:[I

    const/16 v5, 0xc

    aget v4, v4, v5

    add-int/2addr v1, v4

    add-int/2addr v1, v6

    const/16 v4, 0xd

    invoke-static {v1, v4}, Lorg/spongycastle/crypto/digests/MD4Digest;->a(II)I

    move-result v1

    .line 223
    invoke-static {v1, v2, v3}, Lorg/spongycastle/crypto/digests/MD4Digest;->b(III)I

    move-result v4

    add-int/2addr v0, v4

    iget-object v4, p0, Lorg/spongycastle/crypto/digests/MD4Digest;->e:[I

    const/4 v5, 0x1

    aget v4, v4, v5

    add-int/2addr v0, v4

    add-int/2addr v0, v6

    invoke-static {v0, v8}, Lorg/spongycastle/crypto/digests/MD4Digest;->a(II)I

    move-result v0

    .line 224
    invoke-static {v0, v1, v2}, Lorg/spongycastle/crypto/digests/MD4Digest;->b(III)I

    move-result v4

    add-int/2addr v3, v4

    iget-object v4, p0, Lorg/spongycastle/crypto/digests/MD4Digest;->e:[I

    const/4 v5, 0x5

    aget v4, v4, v5

    add-int/2addr v3, v4

    add-int/2addr v3, v6

    const/4 v4, 0x5

    invoke-static {v3, v4}, Lorg/spongycastle/crypto/digests/MD4Digest;->a(II)I

    move-result v3

    .line 225
    invoke-static {v3, v0, v1}, Lorg/spongycastle/crypto/digests/MD4Digest;->b(III)I

    move-result v4

    add-int/2addr v2, v4

    iget-object v4, p0, Lorg/spongycastle/crypto/digests/MD4Digest;->e:[I

    aget v4, v4, v9

    add-int/2addr v2, v4

    add-int/2addr v2, v6

    invoke-static {v2, v9}, Lorg/spongycastle/crypto/digests/MD4Digest;->a(II)I

    move-result v2

    .line 226
    invoke-static {v2, v3, v0}, Lorg/spongycastle/crypto/digests/MD4Digest;->b(III)I

    move-result v4

    add-int/2addr v1, v4

    iget-object v4, p0, Lorg/spongycastle/crypto/digests/MD4Digest;->e:[I

    const/16 v5, 0xd

    aget v4, v4, v5

    add-int/2addr v1, v4

    add-int/2addr v1, v6

    const/16 v4, 0xd

    invoke-static {v1, v4}, Lorg/spongycastle/crypto/digests/MD4Digest;->a(II)I

    move-result v1

    .line 227
    invoke-static {v1, v2, v3}, Lorg/spongycastle/crypto/digests/MD4Digest;->b(III)I

    move-result v4

    add-int/2addr v0, v4

    iget-object v4, p0, Lorg/spongycastle/crypto/digests/MD4Digest;->e:[I

    const/4 v5, 0x2

    aget v4, v4, v5

    add-int/2addr v0, v4

    add-int/2addr v0, v6

    invoke-static {v0, v8}, Lorg/spongycastle/crypto/digests/MD4Digest;->a(II)I

    move-result v0

    .line 228
    invoke-static {v0, v1, v2}, Lorg/spongycastle/crypto/digests/MD4Digest;->b(III)I

    move-result v4

    add-int/2addr v3, v4

    iget-object v4, p0, Lorg/spongycastle/crypto/digests/MD4Digest;->e:[I

    const/4 v5, 0x6

    aget v4, v4, v5

    add-int/2addr v3, v4

    add-int/2addr v3, v6

    const/4 v4, 0x5

    invoke-static {v3, v4}, Lorg/spongycastle/crypto/digests/MD4Digest;->a(II)I

    move-result v3

    .line 229
    invoke-static {v3, v0, v1}, Lorg/spongycastle/crypto/digests/MD4Digest;->b(III)I

    move-result v4

    add-int/2addr v2, v4

    iget-object v4, p0, Lorg/spongycastle/crypto/digests/MD4Digest;->e:[I

    const/16 v5, 0xa

    aget v4, v4, v5

    add-int/2addr v2, v4

    add-int/2addr v2, v6

    invoke-static {v2, v9}, Lorg/spongycastle/crypto/digests/MD4Digest;->a(II)I

    move-result v2

    .line 230
    invoke-static {v2, v3, v0}, Lorg/spongycastle/crypto/digests/MD4Digest;->b(III)I

    move-result v4

    add-int/2addr v1, v4

    iget-object v4, p0, Lorg/spongycastle/crypto/digests/MD4Digest;->e:[I

    const/16 v5, 0xe

    aget v4, v4, v5

    add-int/2addr v1, v4

    add-int/2addr v1, v6

    const/16 v4, 0xd

    invoke-static {v1, v4}, Lorg/spongycastle/crypto/digests/MD4Digest;->a(II)I

    move-result v1

    .line 231
    invoke-static {v1, v2, v3}, Lorg/spongycastle/crypto/digests/MD4Digest;->b(III)I

    move-result v4

    add-int/2addr v0, v4

    iget-object v4, p0, Lorg/spongycastle/crypto/digests/MD4Digest;->e:[I

    aget v4, v4, v8

    add-int/2addr v0, v4

    add-int/2addr v0, v6

    invoke-static {v0, v8}, Lorg/spongycastle/crypto/digests/MD4Digest;->a(II)I

    move-result v0

    .line 232
    invoke-static {v0, v1, v2}, Lorg/spongycastle/crypto/digests/MD4Digest;->b(III)I

    move-result v4

    add-int/2addr v3, v4

    iget-object v4, p0, Lorg/spongycastle/crypto/digests/MD4Digest;->e:[I

    const/4 v5, 0x7

    aget v4, v4, v5

    add-int/2addr v3, v4

    add-int/2addr v3, v6

    const/4 v4, 0x5

    invoke-static {v3, v4}, Lorg/spongycastle/crypto/digests/MD4Digest;->a(II)I

    move-result v3

    .line 233
    invoke-static {v3, v0, v1}, Lorg/spongycastle/crypto/digests/MD4Digest;->b(III)I

    move-result v4

    add-int/2addr v2, v4

    iget-object v4, p0, Lorg/spongycastle/crypto/digests/MD4Digest;->e:[I

    aget v4, v4, v10

    add-int/2addr v2, v4

    add-int/2addr v2, v6

    invoke-static {v2, v9}, Lorg/spongycastle/crypto/digests/MD4Digest;->a(II)I

    move-result v2

    .line 234
    invoke-static {v2, v3, v0}, Lorg/spongycastle/crypto/digests/MD4Digest;->b(III)I

    move-result v4

    add-int/2addr v1, v4

    iget-object v4, p0, Lorg/spongycastle/crypto/digests/MD4Digest;->e:[I

    const/16 v5, 0xf

    aget v4, v4, v5

    add-int/2addr v1, v4

    add-int/2addr v1, v6

    const/16 v4, 0xd

    invoke-static {v1, v4}, Lorg/spongycastle/crypto/digests/MD4Digest;->a(II)I

    move-result v1

    .line 239
    xor-int v4, v1, v2

    xor-int/2addr v4, v3

    add-int/2addr v0, v4

    iget-object v4, p0, Lorg/spongycastle/crypto/digests/MD4Digest;->e:[I

    const/4 v5, 0x0

    aget v4, v4, v5

    add-int/2addr v0, v4

    add-int/2addr v0, v7

    invoke-static {v0, v8}, Lorg/spongycastle/crypto/digests/MD4Digest;->a(II)I

    move-result v0

    .line 240
    xor-int v4, v0, v1

    xor-int/2addr v4, v2

    add-int/2addr v3, v4

    iget-object v4, p0, Lorg/spongycastle/crypto/digests/MD4Digest;->e:[I

    const/16 v5, 0x8

    aget v4, v4, v5

    add-int/2addr v3, v4

    add-int/2addr v3, v7

    invoke-static {v3, v9}, Lorg/spongycastle/crypto/digests/MD4Digest;->a(II)I

    move-result v3

    .line 241
    xor-int v4, v3, v0

    xor-int/2addr v4, v1

    add-int/2addr v2, v4

    iget-object v4, p0, Lorg/spongycastle/crypto/digests/MD4Digest;->e:[I

    const/4 v5, 0x4

    aget v4, v4, v5

    add-int/2addr v2, v4

    add-int/2addr v2, v7

    invoke-static {v2, v10}, Lorg/spongycastle/crypto/digests/MD4Digest;->a(II)I

    move-result v2

    .line 242
    xor-int v4, v2, v3

    xor-int/2addr v4, v0

    add-int/2addr v1, v4

    iget-object v4, p0, Lorg/spongycastle/crypto/digests/MD4Digest;->e:[I

    const/16 v5, 0xc

    aget v4, v4, v5

    add-int/2addr v1, v4

    add-int/2addr v1, v7

    const/16 v4, 0xf

    invoke-static {v1, v4}, Lorg/spongycastle/crypto/digests/MD4Digest;->a(II)I

    move-result v1

    .line 243
    xor-int v4, v1, v2

    xor-int/2addr v4, v3

    add-int/2addr v0, v4

    iget-object v4, p0, Lorg/spongycastle/crypto/digests/MD4Digest;->e:[I

    const/4 v5, 0x2

    aget v4, v4, v5

    add-int/2addr v0, v4

    add-int/2addr v0, v7

    invoke-static {v0, v8}, Lorg/spongycastle/crypto/digests/MD4Digest;->a(II)I

    move-result v0

    .line 244
    xor-int v4, v0, v1

    xor-int/2addr v4, v2

    add-int/2addr v3, v4

    iget-object v4, p0, Lorg/spongycastle/crypto/digests/MD4Digest;->e:[I

    const/16 v5, 0xa

    aget v4, v4, v5

    add-int/2addr v3, v4

    add-int/2addr v3, v7

    invoke-static {v3, v9}, Lorg/spongycastle/crypto/digests/MD4Digest;->a(II)I

    move-result v3

    .line 245
    xor-int v4, v3, v0

    xor-int/2addr v4, v1

    add-int/2addr v2, v4

    iget-object v4, p0, Lorg/spongycastle/crypto/digests/MD4Digest;->e:[I

    const/4 v5, 0x6

    aget v4, v4, v5

    add-int/2addr v2, v4

    add-int/2addr v2, v7

    invoke-static {v2, v10}, Lorg/spongycastle/crypto/digests/MD4Digest;->a(II)I

    move-result v2

    .line 246
    xor-int v4, v2, v3

    xor-int/2addr v4, v0

    add-int/2addr v1, v4

    iget-object v4, p0, Lorg/spongycastle/crypto/digests/MD4Digest;->e:[I

    const/16 v5, 0xe

    aget v4, v4, v5

    add-int/2addr v1, v4

    add-int/2addr v1, v7

    const/16 v4, 0xf

    invoke-static {v1, v4}, Lorg/spongycastle/crypto/digests/MD4Digest;->a(II)I

    move-result v1

    .line 247
    xor-int v4, v1, v2

    xor-int/2addr v4, v3

    add-int/2addr v0, v4

    iget-object v4, p0, Lorg/spongycastle/crypto/digests/MD4Digest;->e:[I

    const/4 v5, 0x1

    aget v4, v4, v5

    add-int/2addr v0, v4

    add-int/2addr v0, v7

    invoke-static {v0, v8}, Lorg/spongycastle/crypto/digests/MD4Digest;->a(II)I

    move-result v0

    .line 248
    xor-int v4, v0, v1

    xor-int/2addr v4, v2

    add-int/2addr v3, v4

    iget-object v4, p0, Lorg/spongycastle/crypto/digests/MD4Digest;->e:[I

    aget v4, v4, v9

    add-int/2addr v3, v4

    add-int/2addr v3, v7

    invoke-static {v3, v9}, Lorg/spongycastle/crypto/digests/MD4Digest;->a(II)I

    move-result v3

    .line 249
    xor-int v4, v3, v0

    xor-int/2addr v4, v1

    add-int/2addr v2, v4

    iget-object v4, p0, Lorg/spongycastle/crypto/digests/MD4Digest;->e:[I

    const/4 v5, 0x5

    aget v4, v4, v5

    add-int/2addr v2, v4

    add-int/2addr v2, v7

    invoke-static {v2, v10}, Lorg/spongycastle/crypto/digests/MD4Digest;->a(II)I

    move-result v2

    .line 250
    xor-int v4, v2, v3

    xor-int/2addr v4, v0

    add-int/2addr v1, v4

    iget-object v4, p0, Lorg/spongycastle/crypto/digests/MD4Digest;->e:[I

    const/16 v5, 0xd

    aget v4, v4, v5

    add-int/2addr v1, v4

    add-int/2addr v1, v7

    const/16 v4, 0xf

    invoke-static {v1, v4}, Lorg/spongycastle/crypto/digests/MD4Digest;->a(II)I

    move-result v1

    .line 251
    xor-int v4, v1, v2

    xor-int/2addr v4, v3

    add-int/2addr v0, v4

    iget-object v4, p0, Lorg/spongycastle/crypto/digests/MD4Digest;->e:[I

    aget v4, v4, v8

    add-int/2addr v0, v4

    add-int/2addr v0, v7

    invoke-static {v0, v8}, Lorg/spongycastle/crypto/digests/MD4Digest;->a(II)I

    move-result v0

    .line 252
    xor-int v4, v0, v1

    xor-int/2addr v4, v2

    add-int/2addr v3, v4

    iget-object v4, p0, Lorg/spongycastle/crypto/digests/MD4Digest;->e:[I

    aget v4, v4, v10

    add-int/2addr v3, v4

    add-int/2addr v3, v7

    invoke-static {v3, v9}, Lorg/spongycastle/crypto/digests/MD4Digest;->a(II)I

    move-result v3

    .line 253
    xor-int v4, v3, v0

    xor-int/2addr v4, v1

    add-int/2addr v2, v4

    iget-object v4, p0, Lorg/spongycastle/crypto/digests/MD4Digest;->e:[I

    const/4 v5, 0x7

    aget v4, v4, v5

    add-int/2addr v2, v4

    add-int/2addr v2, v7

    invoke-static {v2, v10}, Lorg/spongycastle/crypto/digests/MD4Digest;->a(II)I

    move-result v2

    .line 254
    xor-int v4, v2, v3

    xor-int/2addr v4, v0

    add-int/2addr v1, v4

    iget-object v4, p0, Lorg/spongycastle/crypto/digests/MD4Digest;->e:[I

    const/16 v5, 0xf

    aget v4, v4, v5

    add-int/2addr v1, v4

    add-int/2addr v1, v7

    const/16 v4, 0xf

    invoke-static {v1, v4}, Lorg/spongycastle/crypto/digests/MD4Digest;->a(II)I

    move-result v1

    .line 256
    iget v4, p0, Lorg/spongycastle/crypto/digests/MD4Digest;->a:I

    add-int/2addr v0, v4

    iput v0, p0, Lorg/spongycastle/crypto/digests/MD4Digest;->a:I

    .line 257
    iget v0, p0, Lorg/spongycastle/crypto/digests/MD4Digest;->b:I

    add-int/2addr v0, v1

    iput v0, p0, Lorg/spongycastle/crypto/digests/MD4Digest;->b:I

    .line 258
    iget v0, p0, Lorg/spongycastle/crypto/digests/MD4Digest;->c:I

    add-int/2addr v0, v2

    iput v0, p0, Lorg/spongycastle/crypto/digests/MD4Digest;->c:I

    .line 259
    iget v0, p0, Lorg/spongycastle/crypto/digests/MD4Digest;->d:I

    add-int/2addr v0, v3

    iput v0, p0, Lorg/spongycastle/crypto/digests/MD4Digest;->d:I

    .line 264
    const/4 v0, 0x0

    iput v0, p0, Lorg/spongycastle/crypto/digests/MD4Digest;->f:I

    .line 265
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lorg/spongycastle/crypto/digests/MD4Digest;->e:[I

    array-length v1, v1

    if-eq v0, v1, :cond_0

    .line 267
    iget-object v1, p0, Lorg/spongycastle/crypto/digests/MD4Digest;->e:[I

    const/4 v2, 0x0

    aput v2, v1, v0

    .line 265
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 269
    :cond_0
    return-void
.end method
