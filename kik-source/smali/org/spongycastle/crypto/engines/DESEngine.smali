.class public Lorg/spongycastle/crypto/engines/DESEngine;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/spongycastle/crypto/BlockCipher;


# static fields
.field private static final b:[S

.field private static final c:[I

.field private static final d:[B

.field private static final e:[B

.field private static final f:[B

.field private static final g:[I

.field private static final h:[I

.field private static final i:[I

.field private static final j:[I

.field private static final k:[I

.field private static final l:[I

.field private static final m:[I

.field private static final n:[I


# instance fields
.field private a:[I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    const/16 v1, 0x40

    .line 106
    const/16 v0, 0x8

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Lorg/spongycastle/crypto/engines/DESEngine;->b:[S

    .line 111
    const/16 v0, 0x18

    new-array v0, v0, [I

    fill-array-data v0, :array_1

    sput-object v0, Lorg/spongycastle/crypto/engines/DESEngine;->c:[I

    .line 125
    const/16 v0, 0x38

    new-array v0, v0, [B

    fill-array-data v0, :array_2

    sput-object v0, Lorg/spongycastle/crypto/engines/DESEngine;->d:[B

    .line 133
    const/16 v0, 0x10

    new-array v0, v0, [B

    fill-array-data v0, :array_3

    sput-object v0, Lorg/spongycastle/crypto/engines/DESEngine;->e:[B

    .line 139
    const/16 v0, 0x30

    new-array v0, v0, [B

    fill-array-data v0, :array_4

    sput-object v0, Lorg/spongycastle/crypto/engines/DESEngine;->f:[B

    .line 147
    new-array v0, v1, [I

    fill-array-data v0, :array_5

    sput-object v0, Lorg/spongycastle/crypto/engines/DESEngine;->g:[I

    .line 166
    new-array v0, v1, [I

    fill-array-data v0, :array_6

    sput-object v0, Lorg/spongycastle/crypto/engines/DESEngine;->h:[I

    .line 185
    new-array v0, v1, [I

    fill-array-data v0, :array_7

    sput-object v0, Lorg/spongycastle/crypto/engines/DESEngine;->i:[I

    .line 204
    new-array v0, v1, [I

    fill-array-data v0, :array_8

    sput-object v0, Lorg/spongycastle/crypto/engines/DESEngine;->j:[I

    .line 223
    new-array v0, v1, [I

    fill-array-data v0, :array_9

    sput-object v0, Lorg/spongycastle/crypto/engines/DESEngine;->k:[I

    .line 242
    new-array v0, v1, [I

    fill-array-data v0, :array_a

    sput-object v0, Lorg/spongycastle/crypto/engines/DESEngine;->l:[I

    .line 261
    new-array v0, v1, [I

    fill-array-data v0, :array_b

    sput-object v0, Lorg/spongycastle/crypto/engines/DESEngine;->m:[I

    .line 280
    new-array v0, v1, [I

    fill-array-data v0, :array_c

    sput-object v0, Lorg/spongycastle/crypto/engines/DESEngine;->n:[I

    return-void

    .line 106
    :array_0
    .array-data 2
        0x80s
        0x40s
        0x20s
        0x10s
        0x8s
        0x4s
        0x2s
        0x1s
    .end array-data

    .line 111
    :array_1
    .array-data 4
        0x800000
        0x400000
        0x200000
        0x100000
        0x80000
        0x40000
        0x20000
        0x10000
        0x8000
        0x4000
        0x2000
        0x1000
        0x800
        0x400
        0x200
        0x100
        0x80
        0x40
        0x20
        0x10
        0x8
        0x4
        0x2
        0x1
    .end array-data

    .line 125
    :array_2
    .array-data 1
        0x38t
        0x30t
        0x28t
        0x20t
        0x18t
        0x10t
        0x8t
        0x0t
        0x39t
        0x31t
        0x29t
        0x21t
        0x19t
        0x11t
        0x9t
        0x1t
        0x3at
        0x32t
        0x2at
        0x22t
        0x1at
        0x12t
        0xat
        0x2t
        0x3bt
        0x33t
        0x2bt
        0x23t
        0x3et
        0x36t
        0x2et
        0x26t
        0x1et
        0x16t
        0xet
        0x6t
        0x3dt
        0x35t
        0x2dt
        0x25t
        0x1dt
        0x15t
        0xdt
        0x5t
        0x3ct
        0x34t
        0x2ct
        0x24t
        0x1ct
        0x14t
        0xct
        0x4t
        0x1bt
        0x13t
        0xbt
        0x3t
    .end array-data

    .line 133
    :array_3
    .array-data 1
        0x1t
        0x2t
        0x4t
        0x6t
        0x8t
        0xat
        0xct
        0xet
        0xft
        0x11t
        0x13t
        0x15t
        0x17t
        0x19t
        0x1bt
        0x1ct
    .end array-data

    .line 139
    :array_4
    .array-data 1
        0xdt
        0x10t
        0xat
        0x17t
        0x0t
        0x4t
        0x2t
        0x1bt
        0xet
        0x5t
        0x14t
        0x9t
        0x16t
        0x12t
        0xbt
        0x3t
        0x19t
        0x7t
        0xft
        0x6t
        0x1at
        0x13t
        0xct
        0x1t
        0x28t
        0x33t
        0x1et
        0x24t
        0x2et
        0x36t
        0x1dt
        0x27t
        0x32t
        0x2ct
        0x20t
        0x2ft
        0x2bt
        0x30t
        0x26t
        0x37t
        0x21t
        0x34t
        0x2dt
        0x29t
        0x31t
        0x23t
        0x1ct
        0x1ft
    .end array-data

    .line 147
    :array_5
    .array-data 4
        0x1010400
        0x0
        0x10000
        0x1010404
        0x1010004
        0x10404
        0x4
        0x10000
        0x400
        0x1010400
        0x1010404
        0x400
        0x1000404
        0x1010004
        0x1000000
        0x4
        0x404
        0x1000400
        0x1000400
        0x10400
        0x10400
        0x1010000
        0x1010000
        0x1000404
        0x10004
        0x1000004
        0x1000004
        0x10004
        0x0
        0x404
        0x10404
        0x1000000
        0x10000
        0x1010404
        0x4
        0x1010000
        0x1010400
        0x1000000
        0x1000000
        0x400
        0x1010004
        0x10000
        0x10400
        0x1000004
        0x400
        0x4
        0x1000404
        0x10404
        0x1010404
        0x10004
        0x1010000
        0x1000404
        0x1000004
        0x404
        0x10404
        0x1010400
        0x404
        0x1000400
        0x1000400
        0x0
        0x10004
        0x10400
        0x0
        0x1010004
    .end array-data

    .line 166
    :array_6
    .array-data 4
        -0x7fef7fe0
        -0x7fff8000
        0x8000
        0x108020
        0x100000
        0x20
        -0x7fefffe0
        -0x7fff7fe0
        -0x7fffffe0
        -0x7fef7fe0
        -0x7fef8000
        -0x80000000
        -0x7fff8000
        0x100000
        0x20
        -0x7fefffe0
        0x108000
        0x100020
        -0x7fff7fe0
        0x0
        -0x80000000
        0x8000
        0x108020
        -0x7ff00000
        0x100020
        -0x7fffffe0
        0x0
        0x108000
        0x8020
        -0x7fef8000
        -0x7ff00000
        0x8020
        0x0
        0x108020
        -0x7fefffe0
        0x100000
        -0x7fff7fe0
        -0x7ff00000
        -0x7fef8000
        0x8000
        -0x7ff00000
        -0x7fff8000
        0x20
        -0x7fef7fe0
        0x108020
        0x20
        0x8000
        -0x80000000
        0x8020
        -0x7fef8000
        0x100000
        -0x7fffffe0
        0x100020
        -0x7fff7fe0
        -0x7fffffe0
        0x100020
        0x108000
        0x0
        -0x7fff8000
        0x8020
        -0x80000000
        -0x7fefffe0
        -0x7fef7fe0
        0x108000
    .end array-data

    .line 185
    :array_7
    .array-data 4
        0x208
        0x8020200
        0x0
        0x8020008
        0x8000200
        0x0
        0x20208
        0x8000200
        0x20008
        0x8000008
        0x8000008
        0x20000
        0x8020208
        0x20008
        0x8020000
        0x208
        0x8000000
        0x8
        0x8020200
        0x200
        0x20200
        0x8020000
        0x8020008
        0x20208
        0x8000208
        0x20200
        0x20000
        0x8000208
        0x8
        0x8020208
        0x200
        0x8000000
        0x8020200
        0x8000000
        0x20008
        0x208
        0x20000
        0x8020200
        0x8000200
        0x0
        0x200
        0x20008
        0x8020208
        0x8000200
        0x8000008
        0x200
        0x0
        0x8020008
        0x8000208
        0x20000
        0x8000000
        0x8020208
        0x8
        0x20208
        0x20200
        0x8000008
        0x8020000
        0x8000208
        0x208
        0x8020000
        0x20208
        0x8
        0x8020008
        0x20200
    .end array-data

    .line 204
    :array_8
    .array-data 4
        0x802001
        0x2081
        0x2081
        0x80
        0x802080
        0x800081
        0x800001
        0x2001
        0x0
        0x802000
        0x802000
        0x802081
        0x81
        0x0
        0x800080
        0x800001
        0x1
        0x2000
        0x800000
        0x802001
        0x80
        0x800000
        0x2001
        0x2080
        0x800081
        0x1
        0x2080
        0x800080
        0x2000
        0x802080
        0x802081
        0x81
        0x800080
        0x800001
        0x802000
        0x802081
        0x81
        0x0
        0x0
        0x802000
        0x2080
        0x800080
        0x800081
        0x1
        0x802001
        0x2081
        0x2081
        0x80
        0x802081
        0x81
        0x1
        0x2000
        0x800001
        0x2001
        0x802080
        0x800081
        0x2001
        0x2080
        0x800000
        0x802001
        0x80
        0x800000
        0x2000
        0x802080
    .end array-data

    .line 223
    :array_9
    .array-data 4
        0x100
        0x2080100
        0x2080000
        0x42000100    # 32.000977f
        0x80000
        0x100
        0x40000000    # 2.0f
        0x2080000
        0x40080100
        0x80000
        0x2000100
        0x40080100
        0x42000100    # 32.000977f
        0x42080000    # 34.0f
        0x80100
        0x40000000    # 2.0f
        0x2000000
        0x40080000    # 2.125f
        0x40080000    # 2.125f
        0x0
        0x40000100    # 2.000061f
        0x42080100    # 34.000977f
        0x42080100    # 34.000977f
        0x2000100
        0x42080000    # 34.0f
        0x40000100    # 2.000061f
        0x0
        0x42000000    # 32.0f
        0x2080100
        0x2000000
        0x42000000    # 32.0f
        0x80100
        0x80000
        0x42000100    # 32.000977f
        0x100
        0x2000000
        0x40000000    # 2.0f
        0x2080000
        0x42000100    # 32.000977f
        0x40080100
        0x2000100
        0x40000000    # 2.0f
        0x42080000    # 34.0f
        0x2080100
        0x40080100
        0x100
        0x2000000
        0x42080000    # 34.0f
        0x42080100    # 34.000977f
        0x80100
        0x42000000    # 32.0f
        0x42080100    # 34.000977f
        0x2080000
        0x0
        0x40080000    # 2.125f
        0x42000000    # 32.0f
        0x80100
        0x2000100
        0x40000100    # 2.000061f
        0x80000
        0x0
        0x40080000    # 2.125f
        0x2080100
        0x40000100    # 2.000061f
    .end array-data

    .line 242
    :array_a
    .array-data 4
        0x20000010
        0x20400000
        0x4000
        0x20404010
        0x20400000
        0x10
        0x20404010
        0x400000
        0x20004000
        0x404010
        0x400000
        0x20000010
        0x400010
        0x20004000
        0x20000000
        0x4010
        0x0
        0x400010
        0x20004010
        0x4000
        0x404000
        0x20004010
        0x10
        0x20400010
        0x20400010
        0x0
        0x404010
        0x20404000
        0x4010
        0x404000
        0x20404000
        0x20000000
        0x20004000
        0x10
        0x20400010
        0x404000
        0x20404010
        0x400000
        0x4010
        0x20000010
        0x400000
        0x20004000
        0x20000000
        0x4010
        0x20000010
        0x20404010
        0x404000
        0x20400000
        0x404010
        0x20404000
        0x0
        0x20400010
        0x10
        0x4000
        0x20400000
        0x404010
        0x4000
        0x400010
        0x20004010
        0x0
        0x20404000
        0x20000000
        0x400010
        0x20004010
    .end array-data

    .line 261
    :array_b
    .array-data 4
        0x200000
        0x4200002
        0x4000802    # 1.5050005E-36f
        0x0
        0x800
        0x4000802    # 1.5050005E-36f
        0x200802
        0x4200800
        0x4200802
        0x200000
        0x0
        0x4000002
        0x2
        0x4000000
        0x4200002
        0x802
        0x4000800    # 1.5050001E-36f
        0x200802
        0x200002
        0x4000800    # 1.5050001E-36f
        0x4000002
        0x4200000
        0x4200800
        0x200002
        0x4200000
        0x800
        0x802
        0x4200802
        0x200800
        0x2
        0x4000000
        0x200800
        0x4000000
        0x200800
        0x200000
        0x4000802    # 1.5050005E-36f
        0x4000802    # 1.5050005E-36f
        0x4200002
        0x4200002
        0x2
        0x200002
        0x4000000
        0x4000800    # 1.5050001E-36f
        0x200000
        0x4200800
        0x802
        0x200802
        0x4200800
        0x802
        0x4000002
        0x4200802
        0x4200000
        0x200800
        0x0
        0x2
        0x4200802
        0x0
        0x200802
        0x4200000
        0x800
        0x4000002
        0x4000800    # 1.5050001E-36f
        0x800
        0x200002
    .end array-data

    .line 280
    :array_c
    .array-data 4
        0x10001040
        0x1000
        0x40000
        0x10041040
        0x10000000
        0x10001040
        0x40
        0x10000000
        0x40040
        0x10040000
        0x10041040
        0x41000
        0x10041000
        0x41040
        0x1000
        0x40
        0x10040000
        0x10000040
        0x10001000
        0x1040
        0x41000
        0x40040
        0x10040040
        0x10041000
        0x1040
        0x0
        0x0
        0x10040040
        0x10000040
        0x10001000
        0x41040
        0x40000
        0x41040
        0x40000
        0x10041000
        0x1000
        0x40
        0x10040040
        0x1000
        0x41040
        0x10001000
        0x40
        0x10000040
        0x10040000
        0x10040040
        0x10000000
        0x40000
        0x10001040
        0x0
        0x10041040
        0x40040
        0x10000040
        0x10040000
        0x10001000
        0x10001040
        0x0
        0x10041040
        0x41000
        0x41000
        0x1040
        0x1040
        0x40040
        0x10000000
        0x10041000
    .end array-data
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    const/4 v0, 0x0

    iput-object v0, p0, Lorg/spongycastle/crypto/engines/DESEngine;->a:[I

    .line 23
    return-void
.end method

.method protected static a([I[BI[BI)V
    .locals 7

    .prologue
    .line 409
    add-int/lit8 v0, p2, 0x0

    aget-byte v0, p1, v0

    and-int/lit16 v0, v0, 0xff

    shl-int/lit8 v0, v0, 0x18

    .line 410
    add-int/lit8 v1, p2, 0x1

    aget-byte v1, p1, v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x10

    or-int/2addr v0, v1

    .line 411
    add-int/lit8 v1, p2, 0x2

    aget-byte v1, p1, v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x8

    or-int/2addr v0, v1

    .line 412
    add-int/lit8 v1, p2, 0x3

    aget-byte v1, p1, v1

    and-int/lit16 v1, v1, 0xff

    or-int/2addr v0, v1

    .line 414
    add-int/lit8 v1, p2, 0x4

    aget-byte v1, p1, v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x18

    .line 415
    add-int/lit8 v2, p2, 0x5

    aget-byte v2, p1, v2

    and-int/lit16 v2, v2, 0xff

    shl-int/lit8 v2, v2, 0x10

    or-int/2addr v1, v2

    .line 416
    add-int/lit8 v2, p2, 0x6

    aget-byte v2, p1, v2

    and-int/lit16 v2, v2, 0xff

    shl-int/lit8 v2, v2, 0x8

    or-int/2addr v1, v2

    .line 417
    add-int/lit8 v2, p2, 0x7

    aget-byte v2, p1, v2

    and-int/lit16 v2, v2, 0xff

    or-int/2addr v1, v2

    .line 419
    ushr-int/lit8 v2, v0, 0x4

    xor-int/2addr v2, v1

    const v3, 0xf0f0f0f

    and-int/2addr v2, v3

    .line 420
    xor-int/2addr v1, v2

    .line 421
    shl-int/lit8 v2, v2, 0x4

    xor-int/2addr v0, v2

    .line 422
    ushr-int/lit8 v2, v0, 0x10

    xor-int/2addr v2, v1

    const v3, 0xffff

    and-int/2addr v2, v3

    .line 423
    xor-int/2addr v1, v2

    .line 424
    shl-int/lit8 v2, v2, 0x10

    xor-int/2addr v0, v2

    .line 425
    ushr-int/lit8 v2, v1, 0x2

    xor-int/2addr v2, v0

    const v3, 0x33333333

    and-int/2addr v2, v3

    .line 426
    xor-int/2addr v0, v2

    .line 427
    shl-int/lit8 v2, v2, 0x2

    xor-int/2addr v1, v2

    .line 428
    ushr-int/lit8 v2, v1, 0x8

    xor-int/2addr v2, v0

    const v3, 0xff00ff

    and-int/2addr v2, v3

    .line 429
    xor-int/2addr v0, v2

    .line 430
    shl-int/lit8 v2, v2, 0x8

    xor-int/2addr v1, v2

    .line 431
    shl-int/lit8 v2, v1, 0x1

    ushr-int/lit8 v1, v1, 0x1f

    and-int/lit8 v1, v1, 0x1

    or-int/2addr v1, v2

    and-int/lit8 v1, v1, -0x1

    .line 432
    xor-int v2, v0, v1

    const v3, -0x55555556

    and-int/2addr v2, v3

    .line 433
    xor-int/2addr v0, v2

    .line 434
    xor-int/2addr v1, v2

    .line 435
    shl-int/lit8 v2, v0, 0x1

    ushr-int/lit8 v0, v0, 0x1f

    and-int/lit8 v0, v0, 0x1

    or-int/2addr v0, v2

    and-int/lit8 v0, v0, -0x1

    .line 437
    const/4 v2, 0x0

    :goto_0
    const/16 v3, 0x8

    if-ge v2, v3, :cond_0

    .line 441
    shl-int/lit8 v3, v1, 0x1c

    ushr-int/lit8 v4, v1, 0x4

    or-int/2addr v3, v4

    .line 442
    mul-int/lit8 v4, v2, 0x4

    add-int/lit8 v4, v4, 0x0

    aget v4, p0, v4

    xor-int/2addr v3, v4

    .line 443
    sget-object v4, Lorg/spongycastle/crypto/engines/DESEngine;->m:[I

    and-int/lit8 v5, v3, 0x3f

    aget v4, v4, v5

    .line 444
    sget-object v5, Lorg/spongycastle/crypto/engines/DESEngine;->k:[I

    ushr-int/lit8 v6, v3, 0x8

    and-int/lit8 v6, v6, 0x3f

    aget v5, v5, v6

    or-int/2addr v4, v5

    .line 445
    sget-object v5, Lorg/spongycastle/crypto/engines/DESEngine;->i:[I

    ushr-int/lit8 v6, v3, 0x10

    and-int/lit8 v6, v6, 0x3f

    aget v5, v5, v6

    or-int/2addr v4, v5

    .line 446
    sget-object v5, Lorg/spongycastle/crypto/engines/DESEngine;->g:[I

    ushr-int/lit8 v3, v3, 0x18

    and-int/lit8 v3, v3, 0x3f

    aget v3, v5, v3

    or-int/2addr v3, v4

    .line 447
    mul-int/lit8 v4, v2, 0x4

    add-int/lit8 v4, v4, 0x1

    aget v4, p0, v4

    xor-int/2addr v4, v1

    .line 448
    sget-object v5, Lorg/spongycastle/crypto/engines/DESEngine;->n:[I

    and-int/lit8 v6, v4, 0x3f

    aget v5, v5, v6

    or-int/2addr v3, v5

    .line 449
    sget-object v5, Lorg/spongycastle/crypto/engines/DESEngine;->l:[I

    ushr-int/lit8 v6, v4, 0x8

    and-int/lit8 v6, v6, 0x3f

    aget v5, v5, v6

    or-int/2addr v3, v5

    .line 450
    sget-object v5, Lorg/spongycastle/crypto/engines/DESEngine;->j:[I

    ushr-int/lit8 v6, v4, 0x10

    and-int/lit8 v6, v6, 0x3f

    aget v5, v5, v6

    or-int/2addr v3, v5

    .line 451
    sget-object v5, Lorg/spongycastle/crypto/engines/DESEngine;->h:[I

    ushr-int/lit8 v4, v4, 0x18

    and-int/lit8 v4, v4, 0x3f

    aget v4, v5, v4

    or-int/2addr v3, v4

    .line 452
    xor-int/2addr v0, v3

    .line 453
    shl-int/lit8 v3, v0, 0x1c

    ushr-int/lit8 v4, v0, 0x4

    or-int/2addr v3, v4

    .line 454
    mul-int/lit8 v4, v2, 0x4

    add-int/lit8 v4, v4, 0x2

    aget v4, p0, v4

    xor-int/2addr v3, v4

    .line 455
    sget-object v4, Lorg/spongycastle/crypto/engines/DESEngine;->m:[I

    and-int/lit8 v5, v3, 0x3f

    aget v4, v4, v5

    .line 456
    sget-object v5, Lorg/spongycastle/crypto/engines/DESEngine;->k:[I

    ushr-int/lit8 v6, v3, 0x8

    and-int/lit8 v6, v6, 0x3f

    aget v5, v5, v6

    or-int/2addr v4, v5

    .line 457
    sget-object v5, Lorg/spongycastle/crypto/engines/DESEngine;->i:[I

    ushr-int/lit8 v6, v3, 0x10

    and-int/lit8 v6, v6, 0x3f

    aget v5, v5, v6

    or-int/2addr v4, v5

    .line 458
    sget-object v5, Lorg/spongycastle/crypto/engines/DESEngine;->g:[I

    ushr-int/lit8 v3, v3, 0x18

    and-int/lit8 v3, v3, 0x3f

    aget v3, v5, v3

    or-int/2addr v3, v4

    .line 459
    mul-int/lit8 v4, v2, 0x4

    add-int/lit8 v4, v4, 0x3

    aget v4, p0, v4

    xor-int/2addr v4, v0

    .line 460
    sget-object v5, Lorg/spongycastle/crypto/engines/DESEngine;->n:[I

    and-int/lit8 v6, v4, 0x3f

    aget v5, v5, v6

    or-int/2addr v3, v5

    .line 461
    sget-object v5, Lorg/spongycastle/crypto/engines/DESEngine;->l:[I

    ushr-int/lit8 v6, v4, 0x8

    and-int/lit8 v6, v6, 0x3f

    aget v5, v5, v6

    or-int/2addr v3, v5

    .line 462
    sget-object v5, Lorg/spongycastle/crypto/engines/DESEngine;->j:[I

    ushr-int/lit8 v6, v4, 0x10

    and-int/lit8 v6, v6, 0x3f

    aget v5, v5, v6

    or-int/2addr v3, v5

    .line 463
    sget-object v5, Lorg/spongycastle/crypto/engines/DESEngine;->h:[I

    ushr-int/lit8 v4, v4, 0x18

    and-int/lit8 v4, v4, 0x3f

    aget v4, v5, v4

    or-int/2addr v3, v4

    .line 464
    xor-int/2addr v1, v3

    .line 437
    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_0

    .line 467
    :cond_0
    shl-int/lit8 v2, v1, 0x1f

    ushr-int/lit8 v1, v1, 0x1

    or-int/2addr v1, v2

    .line 468
    xor-int v2, v0, v1

    const v3, -0x55555556

    and-int/2addr v2, v3

    .line 469
    xor-int/2addr v0, v2

    .line 470
    xor-int/2addr v1, v2

    .line 471
    shl-int/lit8 v2, v0, 0x1f

    ushr-int/lit8 v0, v0, 0x1

    or-int/2addr v0, v2

    .line 472
    ushr-int/lit8 v2, v0, 0x8

    xor-int/2addr v2, v1

    const v3, 0xff00ff

    and-int/2addr v2, v3

    .line 473
    xor-int/2addr v1, v2

    .line 474
    shl-int/lit8 v2, v2, 0x8

    xor-int/2addr v0, v2

    .line 475
    ushr-int/lit8 v2, v0, 0x2

    xor-int/2addr v2, v1

    const v3, 0x33333333

    and-int/2addr v2, v3

    .line 476
    xor-int/2addr v1, v2

    .line 477
    shl-int/lit8 v2, v2, 0x2

    xor-int/2addr v0, v2

    .line 478
    ushr-int/lit8 v2, v1, 0x10

    xor-int/2addr v2, v0

    const v3, 0xffff

    and-int/2addr v2, v3

    .line 479
    xor-int/2addr v0, v2

    .line 480
    shl-int/lit8 v2, v2, 0x10

    xor-int/2addr v1, v2

    .line 481
    ushr-int/lit8 v2, v1, 0x4

    xor-int/2addr v2, v0

    const v3, 0xf0f0f0f

    and-int/2addr v2, v3

    .line 482
    xor-int/2addr v0, v2

    .line 483
    shl-int/lit8 v2, v2, 0x4

    xor-int/2addr v1, v2

    .line 485
    add-int/lit8 v2, p4, 0x0

    ushr-int/lit8 v3, v1, 0x18

    and-int/lit16 v3, v3, 0xff

    int-to-byte v3, v3

    aput-byte v3, p3, v2

    .line 486
    add-int/lit8 v2, p4, 0x1

    ushr-int/lit8 v3, v1, 0x10

    and-int/lit16 v3, v3, 0xff

    int-to-byte v3, v3

    aput-byte v3, p3, v2

    .line 487
    add-int/lit8 v2, p4, 0x2

    ushr-int/lit8 v3, v1, 0x8

    and-int/lit16 v3, v3, 0xff

    int-to-byte v3, v3

    aput-byte v3, p3, v2

    .line 488
    add-int/lit8 v2, p4, 0x3

    and-int/lit16 v1, v1, 0xff

    int-to-byte v1, v1

    aput-byte v1, p3, v2

    .line 489
    add-int/lit8 v1, p4, 0x4

    ushr-int/lit8 v2, v0, 0x18

    and-int/lit16 v2, v2, 0xff

    int-to-byte v2, v2

    aput-byte v2, p3, v1

    .line 490
    add-int/lit8 v1, p4, 0x5

    ushr-int/lit8 v2, v0, 0x10

    and-int/lit16 v2, v2, 0xff

    int-to-byte v2, v2

    aput-byte v2, p3, v1

    .line 491
    add-int/lit8 v1, p4, 0x6

    ushr-int/lit8 v2, v0, 0x8

    and-int/lit16 v2, v2, 0xff

    int-to-byte v2, v2

    aput-byte v2, p3, v1

    .line 492
    add-int/lit8 v1, p4, 0x7

    and-int/lit16 v0, v0, 0xff

    int-to-byte v0, v0

    aput-byte v0, p3, v1

    .line 493
    return-void
.end method

.method protected static a(Z[B)[I
    .locals 14

    .prologue
    const v13, 0x3f000

    const/16 v12, 0x20

    const/16 v4, 0x1c

    const/16 v11, 0x38

    const/4 v1, 0x0

    .line 310
    new-array v5, v12, [I

    .line 311
    new-array v6, v11, [Z

    .line 312
    new-array v7, v11, [Z

    move v2, v1

    .line 314
    :goto_0
    if-ge v2, v11, :cond_1

    .line 316
    sget-object v0, Lorg/spongycastle/crypto/engines/DESEngine;->d:[B

    aget-byte v0, v0, v2

    .line 318
    ushr-int/lit8 v3, v0, 0x3

    aget-byte v3, p1, v3

    sget-object v8, Lorg/spongycastle/crypto/engines/DESEngine;->b:[S

    and-int/lit8 v0, v0, 0x7

    aget-short v0, v8, v0

    and-int/2addr v0, v3

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_1
    aput-boolean v0, v6, v2

    .line 314
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_0

    :cond_0
    move v0, v1

    .line 318
    goto :goto_1

    :cond_1
    move v2, v1

    .line 321
    :goto_2
    const/16 v0, 0x10

    if-ge v2, v0, :cond_a

    .line 325
    if-eqz p0, :cond_2

    .line 327
    shl-int/lit8 v0, v2, 0x1

    .line 334
    :goto_3
    add-int/lit8 v8, v0, 0x1

    .line 335
    aput v1, v5, v8

    aput v1, v5, v0

    move v3, v1

    .line 337
    :goto_4
    if-ge v3, v4, :cond_4

    .line 339
    sget-object v9, Lorg/spongycastle/crypto/engines/DESEngine;->e:[B

    aget-byte v9, v9, v2

    add-int/2addr v9, v3

    .line 340
    if-ge v9, v4, :cond_3

    .line 342
    aget-boolean v9, v6, v9

    aput-boolean v9, v7, v3

    .line 337
    :goto_5
    add-int/lit8 v3, v3, 0x1

    goto :goto_4

    .line 331
    :cond_2
    rsub-int/lit8 v0, v2, 0xf

    shl-int/lit8 v0, v0, 0x1

    goto :goto_3

    .line 346
    :cond_3
    add-int/lit8 v9, v9, -0x1c

    aget-boolean v9, v6, v9

    aput-boolean v9, v7, v3

    goto :goto_5

    :cond_4
    move v3, v4

    .line 350
    :goto_6
    if-ge v3, v11, :cond_6

    .line 352
    sget-object v9, Lorg/spongycastle/crypto/engines/DESEngine;->e:[B

    aget-byte v9, v9, v2

    add-int/2addr v9, v3

    .line 353
    if-ge v9, v11, :cond_5

    .line 355
    aget-boolean v9, v6, v9

    aput-boolean v9, v7, v3

    .line 350
    :goto_7
    add-int/lit8 v3, v3, 0x1

    goto :goto_6

    .line 359
    :cond_5
    add-int/lit8 v9, v9, -0x1c

    aget-boolean v9, v6, v9

    aput-boolean v9, v7, v3

    goto :goto_7

    :cond_6
    move v3, v1

    .line 363
    :goto_8
    const/16 v9, 0x18

    if-ge v3, v9, :cond_9

    .line 365
    sget-object v9, Lorg/spongycastle/crypto/engines/DESEngine;->f:[B

    aget-byte v9, v9, v3

    aget-boolean v9, v7, v9

    if-eqz v9, :cond_7

    .line 367
    aget v9, v5, v0

    sget-object v10, Lorg/spongycastle/crypto/engines/DESEngine;->c:[I

    aget v10, v10, v3

    or-int/2addr v9, v10

    aput v9, v5, v0

    .line 370
    :cond_7
    sget-object v9, Lorg/spongycastle/crypto/engines/DESEngine;->f:[B

    add-int/lit8 v10, v3, 0x18

    aget-byte v9, v9, v10

    aget-boolean v9, v7, v9

    if-eqz v9, :cond_8

    .line 372
    aget v9, v5, v8

    sget-object v10, Lorg/spongycastle/crypto/engines/DESEngine;->c:[I

    aget v10, v10, v3

    or-int/2addr v9, v10

    aput v9, v5, v8

    .line 363
    :cond_8
    add-int/lit8 v3, v3, 0x1

    goto :goto_8

    .line 321
    :cond_9
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_2

    .line 380
    :cond_a
    :goto_9
    if-eq v1, v12, :cond_b

    .line 384
    aget v0, v5, v1

    .line 385
    add-int/lit8 v2, v1, 0x1

    aget v2, v5, v2

    .line 387
    const/high16 v3, 0xfc0000

    and-int/2addr v3, v0

    shl-int/lit8 v3, v3, 0x6

    and-int/lit16 v4, v0, 0xfc0

    shl-int/lit8 v4, v4, 0xa

    or-int/2addr v3, v4

    const/high16 v4, 0xfc0000

    and-int/2addr v4, v2

    ushr-int/lit8 v4, v4, 0xa

    or-int/2addr v3, v4

    and-int/lit16 v4, v2, 0xfc0

    ushr-int/lit8 v4, v4, 0x6

    or-int/2addr v3, v4

    aput v3, v5, v1

    .line 390
    add-int/lit8 v3, v1, 0x1

    and-int v4, v0, v13

    shl-int/lit8 v4, v4, 0xc

    and-int/lit8 v0, v0, 0x3f

    shl-int/lit8 v0, v0, 0x10

    or-int/2addr v0, v4

    and-int v4, v2, v13

    ushr-int/lit8 v4, v4, 0x4

    or-int/2addr v0, v4

    and-int/lit8 v2, v2, 0x3f

    or-int/2addr v0, v2

    aput v0, v5, v3

    .line 380
    add-int/lit8 v1, v1, 0x2

    goto :goto_9

    .line 394
    :cond_b
    return-object v5
.end method


# virtual methods
.method public a([BI[BI)I
    .locals 2

    .prologue
    .line 69
    iget-object v0, p0, Lorg/spongycastle/crypto/engines/DESEngine;->a:[I

    if-nez v0, :cond_0

    .line 71
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "DES engine not initialised"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 74
    :cond_0
    add-int/lit8 v0, p2, 0x8

    array-length v1, p1

    if-le v0, v1, :cond_1

    .line 76
    new-instance v0, Lorg/spongycastle/crypto/DataLengthException;

    const-string v1, "input buffer too short"

    invoke-direct {v0, v1}, Lorg/spongycastle/crypto/DataLengthException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 79
    :cond_1
    add-int/lit8 v0, p4, 0x8

    array-length v1, p3

    if-le v0, v1, :cond_2

    .line 81
    new-instance v0, Lorg/spongycastle/crypto/DataLengthException;

    const-string v1, "output buffer too short"

    invoke-direct {v0, v1}, Lorg/spongycastle/crypto/DataLengthException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 84
    :cond_2
    iget-object v0, p0, Lorg/spongycastle/crypto/engines/DESEngine;->a:[I

    invoke-static {v0, p1, p2, p3, p4}, Lorg/spongycastle/crypto/engines/DESEngine;->a([I[BI[BI)V

    .line 86
    const/16 v0, 0x8

    return v0
.end method

.method public a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 55
    const-string v0, "DES"

    return-object v0
.end method

.method public a(ZLorg/spongycastle/crypto/CipherParameters;)V
    .locals 3

    .prologue
    .line 37
    instance-of v0, p2, Lorg/spongycastle/crypto/params/KeyParameter;

    if-eqz v0, :cond_1

    move-object v0, p2

    .line 39
    check-cast v0, Lorg/spongycastle/crypto/params/KeyParameter;

    invoke-virtual {v0}, Lorg/spongycastle/crypto/params/KeyParameter;->a()[B

    move-result-object v0

    array-length v0, v0

    const/16 v1, 0x8

    if-le v0, v1, :cond_0

    .line 41
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "DES key too long - should be 8 bytes"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 44
    :cond_0
    check-cast p2, Lorg/spongycastle/crypto/params/KeyParameter;

    invoke-virtual {p2}, Lorg/spongycastle/crypto/params/KeyParameter;->a()[B

    move-result-object v0

    invoke-static {p1, v0}, Lorg/spongycastle/crypto/engines/DESEngine;->a(Z[B)[I

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/crypto/engines/DESEngine;->a:[I

    .line 47
    return-void

    .line 50
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "invalid parameter passed to DES init - "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public b()I
    .locals 1

    .prologue
    .line 60
    const/16 v0, 0x8

    return v0
.end method

.method public c()V
    .locals 0

    .prologue
    .line 91
    return-void
.end method
