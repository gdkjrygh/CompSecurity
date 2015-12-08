.class public Lorg/spongycastle/crypto/digests/MD5Digest;
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

    iput-object v0, p0, Lorg/spongycastle/crypto/digests/MD5Digest;->e:[I

    .line 22
    invoke-virtual {p0}, Lorg/spongycastle/crypto/digests/MD5Digest;->c()V

    .line 23
    return-void
.end method

.method public constructor <init>(Lorg/spongycastle/crypto/digests/MD5Digest;)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 31
    invoke-direct {p0, p1}, Lorg/spongycastle/crypto/digests/GeneralDigest;-><init>(Lorg/spongycastle/crypto/digests/GeneralDigest;)V

    .line 14
    const/16 v0, 0x10

    new-array v0, v0, [I

    iput-object v0, p0, Lorg/spongycastle/crypto/digests/MD5Digest;->e:[I

    .line 33
    iget v0, p1, Lorg/spongycastle/crypto/digests/MD5Digest;->a:I

    iput v0, p0, Lorg/spongycastle/crypto/digests/MD5Digest;->a:I

    .line 34
    iget v0, p1, Lorg/spongycastle/crypto/digests/MD5Digest;->b:I

    iput v0, p0, Lorg/spongycastle/crypto/digests/MD5Digest;->b:I

    .line 35
    iget v0, p1, Lorg/spongycastle/crypto/digests/MD5Digest;->c:I

    iput v0, p0, Lorg/spongycastle/crypto/digests/MD5Digest;->c:I

    .line 36
    iget v0, p1, Lorg/spongycastle/crypto/digests/MD5Digest;->d:I

    iput v0, p0, Lorg/spongycastle/crypto/digests/MD5Digest;->d:I

    .line 38
    iget-object v0, p1, Lorg/spongycastle/crypto/digests/MD5Digest;->e:[I

    iget-object v1, p0, Lorg/spongycastle/crypto/digests/MD5Digest;->e:[I

    iget-object v2, p1, Lorg/spongycastle/crypto/digests/MD5Digest;->e:[I

    array-length v2, v2

    invoke-static {v0, v3, v1, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 39
    iget v0, p1, Lorg/spongycastle/crypto/digests/MD5Digest;->f:I

    iput v0, p0, Lorg/spongycastle/crypto/digests/MD5Digest;->f:I

    .line 40
    return-void
.end method

.method private static a(II)I
    .locals 2

    .prologue
    .line 163
    shl-int v0, p0, p1

    rsub-int/lit8 v1, p1, 0x20

    ushr-int v1, p0, v1

    or-int/2addr v0, v1

    return v0
.end method

.method private static a(III)I
    .locals 2

    .prologue
    .line 174
    and-int v0, p0, p1

    xor-int/lit8 v1, p0, -0x1

    and-int/2addr v1, p2

    or-int/2addr v0, v1

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
    .line 182
    and-int v0, p0, p2

    xor-int/lit8 v1, p2, -0x1

    and-int/2addr v1, p1

    or-int/2addr v0, v1

    return v0
.end method


# virtual methods
.method public final a([BI)I
    .locals 2

    .prologue
    .line 92
    invoke-virtual {p0}, Lorg/spongycastle/crypto/digests/MD5Digest;->e()V

    .line 94
    iget v0, p0, Lorg/spongycastle/crypto/digests/MD5Digest;->a:I

    invoke-static {v0, p1, p2}, Lorg/spongycastle/crypto/digests/MD5Digest;->a(I[BI)V

    .line 95
    iget v0, p0, Lorg/spongycastle/crypto/digests/MD5Digest;->b:I

    add-int/lit8 v1, p2, 0x4

    invoke-static {v0, p1, v1}, Lorg/spongycastle/crypto/digests/MD5Digest;->a(I[BI)V

    .line 96
    iget v0, p0, Lorg/spongycastle/crypto/digests/MD5Digest;->c:I

    add-int/lit8 v1, p2, 0x8

    invoke-static {v0, p1, v1}, Lorg/spongycastle/crypto/digests/MD5Digest;->a(I[BI)V

    .line 97
    iget v0, p0, Lorg/spongycastle/crypto/digests/MD5Digest;->d:I

    add-int/lit8 v1, p2, 0xc

    invoke-static {v0, p1, v1}, Lorg/spongycastle/crypto/digests/MD5Digest;->a(I[BI)V

    .line 99
    invoke-virtual {p0}, Lorg/spongycastle/crypto/digests/MD5Digest;->c()V

    .line 101
    const/16 v0, 0x10

    return v0
.end method

.method public final a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 44
    const-string v0, "MD5"

    return-object v0
.end method

.method protected final a(J)V
    .locals 5

    .prologue
    const/16 v4, 0xe

    .line 68
    iget v0, p0, Lorg/spongycastle/crypto/digests/MD5Digest;->f:I

    if-le v0, v4, :cond_0

    .line 70
    invoke-virtual {p0}, Lorg/spongycastle/crypto/digests/MD5Digest;->f()V

    .line 73
    :cond_0
    iget-object v0, p0, Lorg/spongycastle/crypto/digests/MD5Digest;->e:[I

    const-wide/16 v2, -0x1

    and-long/2addr v2, p1

    long-to-int v1, v2

    aput v1, v0, v4

    .line 74
    iget-object v0, p0, Lorg/spongycastle/crypto/digests/MD5Digest;->e:[I

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
    iget-object v0, p0, Lorg/spongycastle/crypto/digests/MD5Digest;->e:[I

    iget v1, p0, Lorg/spongycastle/crypto/digests/MD5Digest;->f:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lorg/spongycastle/crypto/digests/MD5Digest;->f:I

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
    iget v0, p0, Lorg/spongycastle/crypto/digests/MD5Digest;->f:I

    const/16 v1, 0x10

    if-ne v0, v1, :cond_0

    .line 61
    invoke-virtual {p0}, Lorg/spongycastle/crypto/digests/MD5Digest;->f()V

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

    iput v0, p0, Lorg/spongycastle/crypto/digests/MD5Digest;->a:I

    .line 112
    const v0, -0x10325477

    iput v0, p0, Lorg/spongycastle/crypto/digests/MD5Digest;->b:I

    .line 113
    const v0, -0x67452302

    iput v0, p0, Lorg/spongycastle/crypto/digests/MD5Digest;->c:I

    .line 114
    const v0, 0x10325476

    iput v0, p0, Lorg/spongycastle/crypto/digests/MD5Digest;->d:I

    .line 116
    iput v1, p0, Lorg/spongycastle/crypto/digests/MD5Digest;->f:I

    move v0, v1

    .line 118
    :goto_0
    iget-object v2, p0, Lorg/spongycastle/crypto/digests/MD5Digest;->e:[I

    array-length v2, v2

    if-eq v0, v2, :cond_0

    .line 120
    iget-object v2, p0, Lorg/spongycastle/crypto/digests/MD5Digest;->e:[I

    aput v1, v2, v0

    .line 118
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 122
    :cond_0
    return-void
.end method

.method protected final f()V
    .locals 11

    .prologue
    const/16 v10, 0x9

    const/4 v9, 0x7

    const/4 v8, 0x6

    const/4 v7, 0x5

    const/4 v6, 0x4

    .line 203
    iget v0, p0, Lorg/spongycastle/crypto/digests/MD5Digest;->a:I

    .line 204
    iget v1, p0, Lorg/spongycastle/crypto/digests/MD5Digest;->b:I

    .line 205
    iget v2, p0, Lorg/spongycastle/crypto/digests/MD5Digest;->c:I

    .line 206
    iget v3, p0, Lorg/spongycastle/crypto/digests/MD5Digest;->d:I

    .line 211
    invoke-static {v1, v2, v3}, Lorg/spongycastle/crypto/digests/MD5Digest;->a(III)I

    move-result v4

    add-int/2addr v0, v4

    iget-object v4, p0, Lorg/spongycastle/crypto/digests/MD5Digest;->e:[I

    const/4 v5, 0x0

    aget v4, v4, v5

    add-int/2addr v0, v4

    const v4, -0x28955b88

    add-int/2addr v0, v4

    invoke-static {v0, v9}, Lorg/spongycastle/crypto/digests/MD5Digest;->a(II)I

    move-result v0

    add-int/2addr v0, v1

    .line 212
    invoke-static {v0, v1, v2}, Lorg/spongycastle/crypto/digests/MD5Digest;->a(III)I

    move-result v4

    add-int/2addr v3, v4

    iget-object v4, p0, Lorg/spongycastle/crypto/digests/MD5Digest;->e:[I

    const/4 v5, 0x1

    aget v4, v4, v5

    add-int/2addr v3, v4

    const v4, -0x173848aa

    add-int/2addr v3, v4

    const/16 v4, 0xc

    invoke-static {v3, v4}, Lorg/spongycastle/crypto/digests/MD5Digest;->a(II)I

    move-result v3

    add-int/2addr v3, v0

    .line 213
    invoke-static {v3, v0, v1}, Lorg/spongycastle/crypto/digests/MD5Digest;->a(III)I

    move-result v4

    add-int/2addr v2, v4

    iget-object v4, p0, Lorg/spongycastle/crypto/digests/MD5Digest;->e:[I

    const/4 v5, 0x2

    aget v4, v4, v5

    add-int/2addr v2, v4

    const v4, 0x242070db

    add-int/2addr v2, v4

    const/16 v4, 0x11

    invoke-static {v2, v4}, Lorg/spongycastle/crypto/digests/MD5Digest;->a(II)I

    move-result v2

    add-int/2addr v2, v3

    .line 214
    invoke-static {v2, v3, v0}, Lorg/spongycastle/crypto/digests/MD5Digest;->a(III)I

    move-result v4

    add-int/2addr v1, v4

    iget-object v4, p0, Lorg/spongycastle/crypto/digests/MD5Digest;->e:[I

    const/4 v5, 0x3

    aget v4, v4, v5

    add-int/2addr v1, v4

    const v4, -0x3e423112

    add-int/2addr v1, v4

    const/16 v4, 0x16

    invoke-static {v1, v4}, Lorg/spongycastle/crypto/digests/MD5Digest;->a(II)I

    move-result v1

    add-int/2addr v1, v2

    .line 215
    invoke-static {v1, v2, v3}, Lorg/spongycastle/crypto/digests/MD5Digest;->a(III)I

    move-result v4

    add-int/2addr v0, v4

    iget-object v4, p0, Lorg/spongycastle/crypto/digests/MD5Digest;->e:[I

    aget v4, v4, v6

    add-int/2addr v0, v4

    const v4, -0xa83f051

    add-int/2addr v0, v4

    invoke-static {v0, v9}, Lorg/spongycastle/crypto/digests/MD5Digest;->a(II)I

    move-result v0

    add-int/2addr v0, v1

    .line 216
    invoke-static {v0, v1, v2}, Lorg/spongycastle/crypto/digests/MD5Digest;->a(III)I

    move-result v4

    add-int/2addr v3, v4

    iget-object v4, p0, Lorg/spongycastle/crypto/digests/MD5Digest;->e:[I

    aget v4, v4, v7

    add-int/2addr v3, v4

    const v4, 0x4787c62a

    add-int/2addr v3, v4

    const/16 v4, 0xc

    invoke-static {v3, v4}, Lorg/spongycastle/crypto/digests/MD5Digest;->a(II)I

    move-result v3

    add-int/2addr v3, v0

    .line 217
    invoke-static {v3, v0, v1}, Lorg/spongycastle/crypto/digests/MD5Digest;->a(III)I

    move-result v4

    add-int/2addr v2, v4

    iget-object v4, p0, Lorg/spongycastle/crypto/digests/MD5Digest;->e:[I

    aget v4, v4, v8

    add-int/2addr v2, v4

    const v4, -0x57cfb9ed

    add-int/2addr v2, v4

    const/16 v4, 0x11

    invoke-static {v2, v4}, Lorg/spongycastle/crypto/digests/MD5Digest;->a(II)I

    move-result v2

    add-int/2addr v2, v3

    .line 218
    invoke-static {v2, v3, v0}, Lorg/spongycastle/crypto/digests/MD5Digest;->a(III)I

    move-result v4

    add-int/2addr v1, v4

    iget-object v4, p0, Lorg/spongycastle/crypto/digests/MD5Digest;->e:[I

    aget v4, v4, v9

    add-int/2addr v1, v4

    const v4, -0x2b96aff

    add-int/2addr v1, v4

    const/16 v4, 0x16

    invoke-static {v1, v4}, Lorg/spongycastle/crypto/digests/MD5Digest;->a(II)I

    move-result v1

    add-int/2addr v1, v2

    .line 219
    invoke-static {v1, v2, v3}, Lorg/spongycastle/crypto/digests/MD5Digest;->a(III)I

    move-result v4

    add-int/2addr v0, v4

    iget-object v4, p0, Lorg/spongycastle/crypto/digests/MD5Digest;->e:[I

    const/16 v5, 0x8

    aget v4, v4, v5

    add-int/2addr v0, v4

    const v4, 0x698098d8

    add-int/2addr v0, v4

    invoke-static {v0, v9}, Lorg/spongycastle/crypto/digests/MD5Digest;->a(II)I

    move-result v0

    add-int/2addr v0, v1

    .line 220
    invoke-static {v0, v1, v2}, Lorg/spongycastle/crypto/digests/MD5Digest;->a(III)I

    move-result v4

    add-int/2addr v3, v4

    iget-object v4, p0, Lorg/spongycastle/crypto/digests/MD5Digest;->e:[I

    aget v4, v4, v10

    add-int/2addr v3, v4

    const v4, -0x74bb0851

    add-int/2addr v3, v4

    const/16 v4, 0xc

    invoke-static {v3, v4}, Lorg/spongycastle/crypto/digests/MD5Digest;->a(II)I

    move-result v3

    add-int/2addr v3, v0

    .line 221
    invoke-static {v3, v0, v1}, Lorg/spongycastle/crypto/digests/MD5Digest;->a(III)I

    move-result v4

    add-int/2addr v2, v4

    iget-object v4, p0, Lorg/spongycastle/crypto/digests/MD5Digest;->e:[I

    const/16 v5, 0xa

    aget v4, v4, v5

    add-int/2addr v2, v4

    const v4, -0xa44f

    add-int/2addr v2, v4

    const/16 v4, 0x11

    invoke-static {v2, v4}, Lorg/spongycastle/crypto/digests/MD5Digest;->a(II)I

    move-result v2

    add-int/2addr v2, v3

    .line 222
    invoke-static {v2, v3, v0}, Lorg/spongycastle/crypto/digests/MD5Digest;->a(III)I

    move-result v4

    add-int/2addr v1, v4

    iget-object v4, p0, Lorg/spongycastle/crypto/digests/MD5Digest;->e:[I

    const/16 v5, 0xb

    aget v4, v4, v5

    add-int/2addr v1, v4

    const v4, -0x76a32842

    add-int/2addr v1, v4

    const/16 v4, 0x16

    invoke-static {v1, v4}, Lorg/spongycastle/crypto/digests/MD5Digest;->a(II)I

    move-result v1

    add-int/2addr v1, v2

    .line 223
    invoke-static {v1, v2, v3}, Lorg/spongycastle/crypto/digests/MD5Digest;->a(III)I

    move-result v4

    add-int/2addr v0, v4

    iget-object v4, p0, Lorg/spongycastle/crypto/digests/MD5Digest;->e:[I

    const/16 v5, 0xc

    aget v4, v4, v5

    add-int/2addr v0, v4

    const v4, 0x6b901122

    add-int/2addr v0, v4

    invoke-static {v0, v9}, Lorg/spongycastle/crypto/digests/MD5Digest;->a(II)I

    move-result v0

    add-int/2addr v0, v1

    .line 224
    invoke-static {v0, v1, v2}, Lorg/spongycastle/crypto/digests/MD5Digest;->a(III)I

    move-result v4

    add-int/2addr v3, v4

    iget-object v4, p0, Lorg/spongycastle/crypto/digests/MD5Digest;->e:[I

    const/16 v5, 0xd

    aget v4, v4, v5

    add-int/2addr v3, v4

    const v4, -0x2678e6d

    add-int/2addr v3, v4

    const/16 v4, 0xc

    invoke-static {v3, v4}, Lorg/spongycastle/crypto/digests/MD5Digest;->a(II)I

    move-result v3

    add-int/2addr v3, v0

    .line 225
    invoke-static {v3, v0, v1}, Lorg/spongycastle/crypto/digests/MD5Digest;->a(III)I

    move-result v4

    add-int/2addr v2, v4

    iget-object v4, p0, Lorg/spongycastle/crypto/digests/MD5Digest;->e:[I

    const/16 v5, 0xe

    aget v4, v4, v5

    add-int/2addr v2, v4

    const v4, -0x5986bc72

    add-int/2addr v2, v4

    const/16 v4, 0x11

    invoke-static {v2, v4}, Lorg/spongycastle/crypto/digests/MD5Digest;->a(II)I

    move-result v2

    add-int/2addr v2, v3

    .line 226
    invoke-static {v2, v3, v0}, Lorg/spongycastle/crypto/digests/MD5Digest;->a(III)I

    move-result v4

    add-int/2addr v1, v4

    iget-object v4, p0, Lorg/spongycastle/crypto/digests/MD5Digest;->e:[I

    const/16 v5, 0xf

    aget v4, v4, v5

    add-int/2addr v1, v4

    const v4, 0x49b40821

    add-int/2addr v1, v4

    const/16 v4, 0x16

    invoke-static {v1, v4}, Lorg/spongycastle/crypto/digests/MD5Digest;->a(II)I

    move-result v1

    add-int/2addr v1, v2

    .line 231
    invoke-static {v1, v2, v3}, Lorg/spongycastle/crypto/digests/MD5Digest;->b(III)I

    move-result v4

    add-int/2addr v0, v4

    iget-object v4, p0, Lorg/spongycastle/crypto/digests/MD5Digest;->e:[I

    const/4 v5, 0x1

    aget v4, v4, v5

    add-int/2addr v0, v4

    const v4, -0x9e1da9e

    add-int/2addr v0, v4

    invoke-static {v0, v7}, Lorg/spongycastle/crypto/digests/MD5Digest;->a(II)I

    move-result v0

    add-int/2addr v0, v1

    .line 232
    invoke-static {v0, v1, v2}, Lorg/spongycastle/crypto/digests/MD5Digest;->b(III)I

    move-result v4

    add-int/2addr v3, v4

    iget-object v4, p0, Lorg/spongycastle/crypto/digests/MD5Digest;->e:[I

    aget v4, v4, v8

    add-int/2addr v3, v4

    const v4, -0x3fbf4cc0

    add-int/2addr v3, v4

    invoke-static {v3, v10}, Lorg/spongycastle/crypto/digests/MD5Digest;->a(II)I

    move-result v3

    add-int/2addr v3, v0

    .line 233
    invoke-static {v3, v0, v1}, Lorg/spongycastle/crypto/digests/MD5Digest;->b(III)I

    move-result v4

    add-int/2addr v2, v4

    iget-object v4, p0, Lorg/spongycastle/crypto/digests/MD5Digest;->e:[I

    const/16 v5, 0xb

    aget v4, v4, v5

    add-int/2addr v2, v4

    const v4, 0x265e5a51

    add-int/2addr v2, v4

    const/16 v4, 0xe

    invoke-static {v2, v4}, Lorg/spongycastle/crypto/digests/MD5Digest;->a(II)I

    move-result v2

    add-int/2addr v2, v3

    .line 234
    invoke-static {v2, v3, v0}, Lorg/spongycastle/crypto/digests/MD5Digest;->b(III)I

    move-result v4

    add-int/2addr v1, v4

    iget-object v4, p0, Lorg/spongycastle/crypto/digests/MD5Digest;->e:[I

    const/4 v5, 0x0

    aget v4, v4, v5

    add-int/2addr v1, v4

    const v4, -0x16493856

    add-int/2addr v1, v4

    const/16 v4, 0x14

    invoke-static {v1, v4}, Lorg/spongycastle/crypto/digests/MD5Digest;->a(II)I

    move-result v1

    add-int/2addr v1, v2

    .line 235
    invoke-static {v1, v2, v3}, Lorg/spongycastle/crypto/digests/MD5Digest;->b(III)I

    move-result v4

    add-int/2addr v0, v4

    iget-object v4, p0, Lorg/spongycastle/crypto/digests/MD5Digest;->e:[I

    aget v4, v4, v7

    add-int/2addr v0, v4

    const v4, -0x29d0efa3

    add-int/2addr v0, v4

    invoke-static {v0, v7}, Lorg/spongycastle/crypto/digests/MD5Digest;->a(II)I

    move-result v0

    add-int/2addr v0, v1

    .line 236
    invoke-static {v0, v1, v2}, Lorg/spongycastle/crypto/digests/MD5Digest;->b(III)I

    move-result v4

    add-int/2addr v3, v4

    iget-object v4, p0, Lorg/spongycastle/crypto/digests/MD5Digest;->e:[I

    const/16 v5, 0xa

    aget v4, v4, v5

    add-int/2addr v3, v4

    const v4, 0x2441453

    add-int/2addr v3, v4

    invoke-static {v3, v10}, Lorg/spongycastle/crypto/digests/MD5Digest;->a(II)I

    move-result v3

    add-int/2addr v3, v0

    .line 237
    invoke-static {v3, v0, v1}, Lorg/spongycastle/crypto/digests/MD5Digest;->b(III)I

    move-result v4

    add-int/2addr v2, v4

    iget-object v4, p0, Lorg/spongycastle/crypto/digests/MD5Digest;->e:[I

    const/16 v5, 0xf

    aget v4, v4, v5

    add-int/2addr v2, v4

    const v4, -0x275e197f

    add-int/2addr v2, v4

    const/16 v4, 0xe

    invoke-static {v2, v4}, Lorg/spongycastle/crypto/digests/MD5Digest;->a(II)I

    move-result v2

    add-int/2addr v2, v3

    .line 238
    invoke-static {v2, v3, v0}, Lorg/spongycastle/crypto/digests/MD5Digest;->b(III)I

    move-result v4

    add-int/2addr v1, v4

    iget-object v4, p0, Lorg/spongycastle/crypto/digests/MD5Digest;->e:[I

    aget v4, v4, v6

    add-int/2addr v1, v4

    const v4, -0x182c0438

    add-int/2addr v1, v4

    const/16 v4, 0x14

    invoke-static {v1, v4}, Lorg/spongycastle/crypto/digests/MD5Digest;->a(II)I

    move-result v1

    add-int/2addr v1, v2

    .line 239
    invoke-static {v1, v2, v3}, Lorg/spongycastle/crypto/digests/MD5Digest;->b(III)I

    move-result v4

    add-int/2addr v0, v4

    iget-object v4, p0, Lorg/spongycastle/crypto/digests/MD5Digest;->e:[I

    aget v4, v4, v10

    add-int/2addr v0, v4

    const v4, 0x21e1cde6

    add-int/2addr v0, v4

    invoke-static {v0, v7}, Lorg/spongycastle/crypto/digests/MD5Digest;->a(II)I

    move-result v0

    add-int/2addr v0, v1

    .line 240
    invoke-static {v0, v1, v2}, Lorg/spongycastle/crypto/digests/MD5Digest;->b(III)I

    move-result v4

    add-int/2addr v3, v4

    iget-object v4, p0, Lorg/spongycastle/crypto/digests/MD5Digest;->e:[I

    const/16 v5, 0xe

    aget v4, v4, v5

    add-int/2addr v3, v4

    const v4, -0x3cc8f82a

    add-int/2addr v3, v4

    invoke-static {v3, v10}, Lorg/spongycastle/crypto/digests/MD5Digest;->a(II)I

    move-result v3

    add-int/2addr v3, v0

    .line 241
    invoke-static {v3, v0, v1}, Lorg/spongycastle/crypto/digests/MD5Digest;->b(III)I

    move-result v4

    add-int/2addr v2, v4

    iget-object v4, p0, Lorg/spongycastle/crypto/digests/MD5Digest;->e:[I

    const/4 v5, 0x3

    aget v4, v4, v5

    add-int/2addr v2, v4

    const v4, -0xb2af279

    add-int/2addr v2, v4

    const/16 v4, 0xe

    invoke-static {v2, v4}, Lorg/spongycastle/crypto/digests/MD5Digest;->a(II)I

    move-result v2

    add-int/2addr v2, v3

    .line 242
    invoke-static {v2, v3, v0}, Lorg/spongycastle/crypto/digests/MD5Digest;->b(III)I

    move-result v4

    add-int/2addr v1, v4

    iget-object v4, p0, Lorg/spongycastle/crypto/digests/MD5Digest;->e:[I

    const/16 v5, 0x8

    aget v4, v4, v5

    add-int/2addr v1, v4

    const v4, 0x455a14ed

    add-int/2addr v1, v4

    const/16 v4, 0x14

    invoke-static {v1, v4}, Lorg/spongycastle/crypto/digests/MD5Digest;->a(II)I

    move-result v1

    add-int/2addr v1, v2

    .line 243
    invoke-static {v1, v2, v3}, Lorg/spongycastle/crypto/digests/MD5Digest;->b(III)I

    move-result v4

    add-int/2addr v0, v4

    iget-object v4, p0, Lorg/spongycastle/crypto/digests/MD5Digest;->e:[I

    const/16 v5, 0xd

    aget v4, v4, v5

    add-int/2addr v0, v4

    const v4, -0x561c16fb

    add-int/2addr v0, v4

    invoke-static {v0, v7}, Lorg/spongycastle/crypto/digests/MD5Digest;->a(II)I

    move-result v0

    add-int/2addr v0, v1

    .line 244
    invoke-static {v0, v1, v2}, Lorg/spongycastle/crypto/digests/MD5Digest;->b(III)I

    move-result v4

    add-int/2addr v3, v4

    iget-object v4, p0, Lorg/spongycastle/crypto/digests/MD5Digest;->e:[I

    const/4 v5, 0x2

    aget v4, v4, v5

    add-int/2addr v3, v4

    const v4, -0x3105c08

    add-int/2addr v3, v4

    invoke-static {v3, v10}, Lorg/spongycastle/crypto/digests/MD5Digest;->a(II)I

    move-result v3

    add-int/2addr v3, v0

    .line 245
    invoke-static {v3, v0, v1}, Lorg/spongycastle/crypto/digests/MD5Digest;->b(III)I

    move-result v4

    add-int/2addr v2, v4

    iget-object v4, p0, Lorg/spongycastle/crypto/digests/MD5Digest;->e:[I

    aget v4, v4, v9

    add-int/2addr v2, v4

    const v4, 0x676f02d9

    add-int/2addr v2, v4

    const/16 v4, 0xe

    invoke-static {v2, v4}, Lorg/spongycastle/crypto/digests/MD5Digest;->a(II)I

    move-result v2

    add-int/2addr v2, v3

    .line 246
    invoke-static {v2, v3, v0}, Lorg/spongycastle/crypto/digests/MD5Digest;->b(III)I

    move-result v4

    add-int/2addr v1, v4

    iget-object v4, p0, Lorg/spongycastle/crypto/digests/MD5Digest;->e:[I

    const/16 v5, 0xc

    aget v4, v4, v5

    add-int/2addr v1, v4

    const v4, -0x72d5b376

    add-int/2addr v1, v4

    const/16 v4, 0x14

    invoke-static {v1, v4}, Lorg/spongycastle/crypto/digests/MD5Digest;->a(II)I

    move-result v1

    add-int/2addr v1, v2

    .line 251
    xor-int v4, v1, v2

    xor-int/2addr v4, v3

    add-int/2addr v0, v4

    iget-object v4, p0, Lorg/spongycastle/crypto/digests/MD5Digest;->e:[I

    aget v4, v4, v7

    add-int/2addr v0, v4

    const v4, -0x5c6be

    add-int/2addr v0, v4

    invoke-static {v0, v6}, Lorg/spongycastle/crypto/digests/MD5Digest;->a(II)I

    move-result v0

    add-int/2addr v0, v1

    .line 252
    xor-int v4, v0, v1

    xor-int/2addr v4, v2

    add-int/2addr v3, v4

    iget-object v4, p0, Lorg/spongycastle/crypto/digests/MD5Digest;->e:[I

    const/16 v5, 0x8

    aget v4, v4, v5

    add-int/2addr v3, v4

    const v4, -0x788e097f

    add-int/2addr v3, v4

    const/16 v4, 0xb

    invoke-static {v3, v4}, Lorg/spongycastle/crypto/digests/MD5Digest;->a(II)I

    move-result v3

    add-int/2addr v3, v0

    .line 253
    xor-int v4, v3, v0

    xor-int/2addr v4, v1

    add-int/2addr v2, v4

    iget-object v4, p0, Lorg/spongycastle/crypto/digests/MD5Digest;->e:[I

    const/16 v5, 0xb

    aget v4, v4, v5

    add-int/2addr v2, v4

    const v4, 0x6d9d6122

    add-int/2addr v2, v4

    const/16 v4, 0x10

    invoke-static {v2, v4}, Lorg/spongycastle/crypto/digests/MD5Digest;->a(II)I

    move-result v2

    add-int/2addr v2, v3

    .line 254
    xor-int v4, v2, v3

    xor-int/2addr v4, v0

    add-int/2addr v1, v4

    iget-object v4, p0, Lorg/spongycastle/crypto/digests/MD5Digest;->e:[I

    const/16 v5, 0xe

    aget v4, v4, v5

    add-int/2addr v1, v4

    const v4, -0x21ac7f4

    add-int/2addr v1, v4

    const/16 v4, 0x17

    invoke-static {v1, v4}, Lorg/spongycastle/crypto/digests/MD5Digest;->a(II)I

    move-result v1

    add-int/2addr v1, v2

    .line 255
    xor-int v4, v1, v2

    xor-int/2addr v4, v3

    add-int/2addr v0, v4

    iget-object v4, p0, Lorg/spongycastle/crypto/digests/MD5Digest;->e:[I

    const/4 v5, 0x1

    aget v4, v4, v5

    add-int/2addr v0, v4

    const v4, -0x5b4115bc

    add-int/2addr v0, v4

    invoke-static {v0, v6}, Lorg/spongycastle/crypto/digests/MD5Digest;->a(II)I

    move-result v0

    add-int/2addr v0, v1

    .line 256
    xor-int v4, v0, v1

    xor-int/2addr v4, v2

    add-int/2addr v3, v4

    iget-object v4, p0, Lorg/spongycastle/crypto/digests/MD5Digest;->e:[I

    aget v4, v4, v6

    add-int/2addr v3, v4

    const v4, 0x4bdecfa9    # 2.9204306E7f

    add-int/2addr v3, v4

    const/16 v4, 0xb

    invoke-static {v3, v4}, Lorg/spongycastle/crypto/digests/MD5Digest;->a(II)I

    move-result v3

    add-int/2addr v3, v0

    .line 257
    xor-int v4, v3, v0

    xor-int/2addr v4, v1

    add-int/2addr v2, v4

    iget-object v4, p0, Lorg/spongycastle/crypto/digests/MD5Digest;->e:[I

    aget v4, v4, v9

    add-int/2addr v2, v4

    const v4, -0x944b4a0

    add-int/2addr v2, v4

    const/16 v4, 0x10

    invoke-static {v2, v4}, Lorg/spongycastle/crypto/digests/MD5Digest;->a(II)I

    move-result v2

    add-int/2addr v2, v3

    .line 258
    xor-int v4, v2, v3

    xor-int/2addr v4, v0

    add-int/2addr v1, v4

    iget-object v4, p0, Lorg/spongycastle/crypto/digests/MD5Digest;->e:[I

    const/16 v5, 0xa

    aget v4, v4, v5

    add-int/2addr v1, v4

    const v4, -0x41404390

    add-int/2addr v1, v4

    const/16 v4, 0x17

    invoke-static {v1, v4}, Lorg/spongycastle/crypto/digests/MD5Digest;->a(II)I

    move-result v1

    add-int/2addr v1, v2

    .line 259
    xor-int v4, v1, v2

    xor-int/2addr v4, v3

    add-int/2addr v0, v4

    iget-object v4, p0, Lorg/spongycastle/crypto/digests/MD5Digest;->e:[I

    const/16 v5, 0xd

    aget v4, v4, v5

    add-int/2addr v0, v4

    const v4, 0x289b7ec6

    add-int/2addr v0, v4

    invoke-static {v0, v6}, Lorg/spongycastle/crypto/digests/MD5Digest;->a(II)I

    move-result v0

    add-int/2addr v0, v1

    .line 260
    xor-int v4, v0, v1

    xor-int/2addr v4, v2

    add-int/2addr v3, v4

    iget-object v4, p0, Lorg/spongycastle/crypto/digests/MD5Digest;->e:[I

    const/4 v5, 0x0

    aget v4, v4, v5

    add-int/2addr v3, v4

    const v4, -0x155ed806

    add-int/2addr v3, v4

    const/16 v4, 0xb

    invoke-static {v3, v4}, Lorg/spongycastle/crypto/digests/MD5Digest;->a(II)I

    move-result v3

    add-int/2addr v3, v0

    .line 261
    xor-int v4, v3, v0

    xor-int/2addr v4, v1

    add-int/2addr v2, v4

    iget-object v4, p0, Lorg/spongycastle/crypto/digests/MD5Digest;->e:[I

    const/4 v5, 0x3

    aget v4, v4, v5

    add-int/2addr v2, v4

    const v4, -0x2b10cf7b

    add-int/2addr v2, v4

    const/16 v4, 0x10

    invoke-static {v2, v4}, Lorg/spongycastle/crypto/digests/MD5Digest;->a(II)I

    move-result v2

    add-int/2addr v2, v3

    .line 262
    xor-int v4, v2, v3

    xor-int/2addr v4, v0

    add-int/2addr v1, v4

    iget-object v4, p0, Lorg/spongycastle/crypto/digests/MD5Digest;->e:[I

    aget v4, v4, v8

    add-int/2addr v1, v4

    const v4, 0x4881d05    # 3.2000097E-36f

    add-int/2addr v1, v4

    const/16 v4, 0x17

    invoke-static {v1, v4}, Lorg/spongycastle/crypto/digests/MD5Digest;->a(II)I

    move-result v1

    add-int/2addr v1, v2

    .line 263
    xor-int v4, v1, v2

    xor-int/2addr v4, v3

    add-int/2addr v0, v4

    iget-object v4, p0, Lorg/spongycastle/crypto/digests/MD5Digest;->e:[I

    aget v4, v4, v10

    add-int/2addr v0, v4

    const v4, -0x262b2fc7

    add-int/2addr v0, v4

    invoke-static {v0, v6}, Lorg/spongycastle/crypto/digests/MD5Digest;->a(II)I

    move-result v0

    add-int/2addr v0, v1

    .line 264
    xor-int v4, v0, v1

    xor-int/2addr v4, v2

    add-int/2addr v3, v4

    iget-object v4, p0, Lorg/spongycastle/crypto/digests/MD5Digest;->e:[I

    const/16 v5, 0xc

    aget v4, v4, v5

    add-int/2addr v3, v4

    const v4, -0x1924661b

    add-int/2addr v3, v4

    const/16 v4, 0xb

    invoke-static {v3, v4}, Lorg/spongycastle/crypto/digests/MD5Digest;->a(II)I

    move-result v3

    add-int/2addr v3, v0

    .line 265
    xor-int v4, v3, v0

    xor-int/2addr v4, v1

    add-int/2addr v2, v4

    iget-object v4, p0, Lorg/spongycastle/crypto/digests/MD5Digest;->e:[I

    const/16 v5, 0xf

    aget v4, v4, v5

    add-int/2addr v2, v4

    const v4, 0x1fa27cf8

    add-int/2addr v2, v4

    const/16 v4, 0x10

    invoke-static {v2, v4}, Lorg/spongycastle/crypto/digests/MD5Digest;->a(II)I

    move-result v2

    add-int/2addr v2, v3

    .line 266
    xor-int v4, v2, v3

    xor-int/2addr v4, v0

    add-int/2addr v1, v4

    iget-object v4, p0, Lorg/spongycastle/crypto/digests/MD5Digest;->e:[I

    const/4 v5, 0x2

    aget v4, v4, v5

    add-int/2addr v1, v4

    const v4, -0x3b53a99b

    add-int/2addr v1, v4

    const/16 v4, 0x17

    invoke-static {v1, v4}, Lorg/spongycastle/crypto/digests/MD5Digest;->a(II)I

    move-result v1

    add-int/2addr v1, v2

    .line 271
    xor-int/lit8 v4, v3, -0x1

    or-int/2addr v4, v1

    xor-int/2addr v4, v2

    add-int/2addr v0, v4

    iget-object v4, p0, Lorg/spongycastle/crypto/digests/MD5Digest;->e:[I

    const/4 v5, 0x0

    aget v4, v4, v5

    add-int/2addr v0, v4

    const v4, -0xbd6ddbc

    add-int/2addr v0, v4

    invoke-static {v0, v8}, Lorg/spongycastle/crypto/digests/MD5Digest;->a(II)I

    move-result v0

    add-int/2addr v0, v1

    .line 272
    xor-int/lit8 v4, v2, -0x1

    or-int/2addr v4, v0

    xor-int/2addr v4, v1

    add-int/2addr v3, v4

    iget-object v4, p0, Lorg/spongycastle/crypto/digests/MD5Digest;->e:[I

    aget v4, v4, v9

    add-int/2addr v3, v4

    const v4, 0x432aff97

    add-int/2addr v3, v4

    const/16 v4, 0xa

    invoke-static {v3, v4}, Lorg/spongycastle/crypto/digests/MD5Digest;->a(II)I

    move-result v3

    add-int/2addr v3, v0

    .line 273
    xor-int/lit8 v4, v1, -0x1

    or-int/2addr v4, v3

    xor-int/2addr v4, v0

    add-int/2addr v2, v4

    iget-object v4, p0, Lorg/spongycastle/crypto/digests/MD5Digest;->e:[I

    const/16 v5, 0xe

    aget v4, v4, v5

    add-int/2addr v2, v4

    const v4, -0x546bdc59

    add-int/2addr v2, v4

    const/16 v4, 0xf

    invoke-static {v2, v4}, Lorg/spongycastle/crypto/digests/MD5Digest;->a(II)I

    move-result v2

    add-int/2addr v2, v3

    .line 274
    xor-int/lit8 v4, v0, -0x1

    or-int/2addr v4, v2

    xor-int/2addr v4, v3

    add-int/2addr v1, v4

    iget-object v4, p0, Lorg/spongycastle/crypto/digests/MD5Digest;->e:[I

    aget v4, v4, v7

    add-int/2addr v1, v4

    const v4, -0x36c5fc7

    add-int/2addr v1, v4

    const/16 v4, 0x15

    invoke-static {v1, v4}, Lorg/spongycastle/crypto/digests/MD5Digest;->a(II)I

    move-result v1

    add-int/2addr v1, v2

    .line 275
    xor-int/lit8 v4, v3, -0x1

    or-int/2addr v4, v1

    xor-int/2addr v4, v2

    add-int/2addr v0, v4

    iget-object v4, p0, Lorg/spongycastle/crypto/digests/MD5Digest;->e:[I

    const/16 v5, 0xc

    aget v4, v4, v5

    add-int/2addr v0, v4

    const v4, 0x655b59c3

    add-int/2addr v0, v4

    invoke-static {v0, v8}, Lorg/spongycastle/crypto/digests/MD5Digest;->a(II)I

    move-result v0

    add-int/2addr v0, v1

    .line 276
    xor-int/lit8 v4, v2, -0x1

    or-int/2addr v4, v0

    xor-int/2addr v4, v1

    add-int/2addr v3, v4

    iget-object v4, p0, Lorg/spongycastle/crypto/digests/MD5Digest;->e:[I

    const/4 v5, 0x3

    aget v4, v4, v5

    add-int/2addr v3, v4

    const v4, -0x70f3336e

    add-int/2addr v3, v4

    const/16 v4, 0xa

    invoke-static {v3, v4}, Lorg/spongycastle/crypto/digests/MD5Digest;->a(II)I

    move-result v3

    add-int/2addr v3, v0

    .line 277
    xor-int/lit8 v4, v1, -0x1

    or-int/2addr v4, v3

    xor-int/2addr v4, v0

    add-int/2addr v2, v4

    iget-object v4, p0, Lorg/spongycastle/crypto/digests/MD5Digest;->e:[I

    const/16 v5, 0xa

    aget v4, v4, v5

    add-int/2addr v2, v4

    const v4, -0x100b83

    add-int/2addr v2, v4

    const/16 v4, 0xf

    invoke-static {v2, v4}, Lorg/spongycastle/crypto/digests/MD5Digest;->a(II)I

    move-result v2

    add-int/2addr v2, v3

    .line 278
    xor-int/lit8 v4, v0, -0x1

    or-int/2addr v4, v2

    xor-int/2addr v4, v3

    add-int/2addr v1, v4

    iget-object v4, p0, Lorg/spongycastle/crypto/digests/MD5Digest;->e:[I

    const/4 v5, 0x1

    aget v4, v4, v5

    add-int/2addr v1, v4

    const v4, -0x7a7ba22f

    add-int/2addr v1, v4

    const/16 v4, 0x15

    invoke-static {v1, v4}, Lorg/spongycastle/crypto/digests/MD5Digest;->a(II)I

    move-result v1

    add-int/2addr v1, v2

    .line 279
    xor-int/lit8 v4, v3, -0x1

    or-int/2addr v4, v1

    xor-int/2addr v4, v2

    add-int/2addr v0, v4

    iget-object v4, p0, Lorg/spongycastle/crypto/digests/MD5Digest;->e:[I

    const/16 v5, 0x8

    aget v4, v4, v5

    add-int/2addr v0, v4

    const v4, 0x6fa87e4f

    add-int/2addr v0, v4

    invoke-static {v0, v8}, Lorg/spongycastle/crypto/digests/MD5Digest;->a(II)I

    move-result v0

    add-int/2addr v0, v1

    .line 280
    xor-int/lit8 v4, v2, -0x1

    or-int/2addr v4, v0

    xor-int/2addr v4, v1

    add-int/2addr v3, v4

    iget-object v4, p0, Lorg/spongycastle/crypto/digests/MD5Digest;->e:[I

    const/16 v5, 0xf

    aget v4, v4, v5

    add-int/2addr v3, v4

    const v4, -0x1d31920

    add-int/2addr v3, v4

    const/16 v4, 0xa

    invoke-static {v3, v4}, Lorg/spongycastle/crypto/digests/MD5Digest;->a(II)I

    move-result v3

    add-int/2addr v3, v0

    .line 281
    xor-int/lit8 v4, v1, -0x1

    or-int/2addr v4, v3

    xor-int/2addr v4, v0

    add-int/2addr v2, v4

    iget-object v4, p0, Lorg/spongycastle/crypto/digests/MD5Digest;->e:[I

    aget v4, v4, v8

    add-int/2addr v2, v4

    const v4, -0x5cfebcec

    add-int/2addr v2, v4

    const/16 v4, 0xf

    invoke-static {v2, v4}, Lorg/spongycastle/crypto/digests/MD5Digest;->a(II)I

    move-result v2

    add-int/2addr v2, v3

    .line 282
    xor-int/lit8 v4, v0, -0x1

    or-int/2addr v4, v2

    xor-int/2addr v4, v3

    add-int/2addr v1, v4

    iget-object v4, p0, Lorg/spongycastle/crypto/digests/MD5Digest;->e:[I

    const/16 v5, 0xd

    aget v4, v4, v5

    add-int/2addr v1, v4

    const v4, 0x4e0811a1    # 5.7071418E8f

    add-int/2addr v1, v4

    const/16 v4, 0x15

    invoke-static {v1, v4}, Lorg/spongycastle/crypto/digests/MD5Digest;->a(II)I

    move-result v1

    add-int/2addr v1, v2

    .line 283
    xor-int/lit8 v4, v3, -0x1

    or-int/2addr v4, v1

    xor-int/2addr v4, v2

    add-int/2addr v0, v4

    iget-object v4, p0, Lorg/spongycastle/crypto/digests/MD5Digest;->e:[I

    aget v4, v4, v6

    add-int/2addr v0, v4

    const v4, -0x8ac817e

    add-int/2addr v0, v4

    invoke-static {v0, v8}, Lorg/spongycastle/crypto/digests/MD5Digest;->a(II)I

    move-result v0

    add-int/2addr v0, v1

    .line 284
    xor-int/lit8 v4, v2, -0x1

    or-int/2addr v4, v0

    xor-int/2addr v4, v1

    add-int/2addr v3, v4

    iget-object v4, p0, Lorg/spongycastle/crypto/digests/MD5Digest;->e:[I

    const/16 v5, 0xb

    aget v4, v4, v5

    add-int/2addr v3, v4

    const v4, -0x42c50dcb

    add-int/2addr v3, v4

    const/16 v4, 0xa

    invoke-static {v3, v4}, Lorg/spongycastle/crypto/digests/MD5Digest;->a(II)I

    move-result v3

    add-int/2addr v3, v0

    .line 285
    xor-int/lit8 v4, v1, -0x1

    or-int/2addr v4, v3

    xor-int/2addr v4, v0

    add-int/2addr v2, v4

    iget-object v4, p0, Lorg/spongycastle/crypto/digests/MD5Digest;->e:[I

    const/4 v5, 0x2

    aget v4, v4, v5

    add-int/2addr v2, v4

    const v4, 0x2ad7d2bb

    add-int/2addr v2, v4

    const/16 v4, 0xf

    invoke-static {v2, v4}, Lorg/spongycastle/crypto/digests/MD5Digest;->a(II)I

    move-result v2

    add-int/2addr v2, v3

    .line 286
    xor-int/lit8 v4, v0, -0x1

    or-int/2addr v4, v2

    xor-int/2addr v4, v3

    add-int/2addr v1, v4

    iget-object v4, p0, Lorg/spongycastle/crypto/digests/MD5Digest;->e:[I

    aget v4, v4, v10

    add-int/2addr v1, v4

    const v4, -0x14792c6f

    add-int/2addr v1, v4

    const/16 v4, 0x15

    invoke-static {v1, v4}, Lorg/spongycastle/crypto/digests/MD5Digest;->a(II)I

    move-result v1

    add-int/2addr v1, v2

    .line 288
    iget v4, p0, Lorg/spongycastle/crypto/digests/MD5Digest;->a:I

    add-int/2addr v0, v4

    iput v0, p0, Lorg/spongycastle/crypto/digests/MD5Digest;->a:I

    .line 289
    iget v0, p0, Lorg/spongycastle/crypto/digests/MD5Digest;->b:I

    add-int/2addr v0, v1

    iput v0, p0, Lorg/spongycastle/crypto/digests/MD5Digest;->b:I

    .line 290
    iget v0, p0, Lorg/spongycastle/crypto/digests/MD5Digest;->c:I

    add-int/2addr v0, v2

    iput v0, p0, Lorg/spongycastle/crypto/digests/MD5Digest;->c:I

    .line 291
    iget v0, p0, Lorg/spongycastle/crypto/digests/MD5Digest;->d:I

    add-int/2addr v0, v3

    iput v0, p0, Lorg/spongycastle/crypto/digests/MD5Digest;->d:I

    .line 296
    const/4 v0, 0x0

    iput v0, p0, Lorg/spongycastle/crypto/digests/MD5Digest;->f:I

    .line 297
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lorg/spongycastle/crypto/digests/MD5Digest;->e:[I

    array-length v1, v1

    if-eq v0, v1, :cond_0

    .line 299
    iget-object v1, p0, Lorg/spongycastle/crypto/digests/MD5Digest;->e:[I

    const/4 v2, 0x0

    aput v2, v1, v0

    .line 297
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 301
    :cond_0
    return-void
.end method
