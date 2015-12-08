.class public Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/spongycastle/math/ntru/polynomial/Polynomial;


# static fields
.field private static final b:[I

.field private static final c:Ljava/util/List;


# instance fields
.field public a:[I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .prologue
    .line 35
    const/16 v0, 0x26b

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;->b:[I

    .line 102
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;->c:Ljava/util/List;

    .line 103
    const/4 v0, 0x0

    :goto_0
    sget-object v1, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;->b:[I

    array-length v1, v1

    if-eq v0, v1, :cond_0

    .line 105
    sget-object v1, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;->c:Ljava/util/List;

    sget-object v2, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;->b:[I

    aget v2, v2, v0

    int-to-long v2, v2

    invoke-static {v2, v3}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 103
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 107
    :cond_0
    return-void

    .line 35
    :array_0
    .array-data 4
        0x119b
        0x11a1
        0x11a5
        0x11a7
        0x11ab
        0x11c3
        0x11c5
        0x11d1
        0x11d7
        0x11e7
        0x11ef
        0x11f5
        0x11fb
        0x120d
        0x121d
        0x121f
        0x1223
        0x1229
        0x122b
        0x1231
        0x1237
        0x1241
        0x1247
        0x1253
        0x125f
        0x1271
        0x1273
        0x1279
        0x127d
        0x128f
        0x1297
        0x12af
        0x12b3
        0x12b5
        0x12b9
        0x12bf
        0x12c1
        0x12cd
        0x12d1
        0x12df
        0x12fd
        0x1307
        0x130d
        0x1319
        0x1327
        0x132d
        0x1337
        0x1343
        0x1345
        0x1349
        0x134f
        0x1357
        0x135d
        0x1367
        0x1369
        0x136d
        0x137b
        0x1381
        0x1387
        0x138b
        0x1391
        0x1393
        0x139d
        0x139f
        0x13af
        0x13bb
        0x13c3
        0x13d5
        0x13d9
        0x13df
        0x13eb
        0x13ed
        0x13f3
        0x13f9
        0x13ff
        0x141b
        0x1421
        0x142f
        0x1433
        0x143b
        0x1445
        0x144d
        0x1459
        0x146b
        0x146f
        0x1471
        0x1475
        0x148d
        0x1499
        0x149f
        0x14a1
        0x14b1
        0x14b7
        0x14bd
        0x14cb
        0x14d5
        0x14e3
        0x14e7
        0x1505
        0x150b
        0x1511
        0x1517
        0x151f
        0x1525
        0x1529
        0x152b
        0x1537
        0x153d
        0x1541
        0x1543
        0x1549
        0x155f
        0x1565
        0x1567
        0x156b
        0x157d
        0x157f
        0x1583
        0x158f
        0x1591
        0x1597
        0x159b
        0x15b5
        0x15bb
        0x15c1
        0x15c5
        0x15cd
        0x15d7
        0x15f7
        0x1607
        0x1609
        0x160f
        0x1613
        0x1615
        0x1619
        0x161b
        0x1625
        0x1633
        0x1639
        0x163d
        0x1645
        0x164f
        0x1655
        0x1669
        0x166d
        0x166f
        0x1675
        0x1693
        0x1697
        0x169f
        0x16a9
        0x16af
        0x16b5
        0x16bd
        0x16c3
        0x16cf
        0x16d3
        0x16d9
        0x16db
        0x16e1
        0x16e5
        0x16eb
        0x16ed
        0x16f7
        0x16f9
        0x1709
        0x170f
        0x1723
        0x1727
        0x1733
        0x1741
        0x175d
        0x1763
        0x1777
        0x177b
        0x178d
        0x1795
        0x179b
        0x179f
        0x17a5
        0x17b3
        0x17b9
        0x17bf
        0x17c9
        0x17cb
        0x17d5
        0x17e1
        0x17e9
        0x17f3
        0x17f5
        0x17ff
        0x1807
        0x1813
        0x181d
        0x1835
        0x1837
        0x183b
        0x1843
        0x1849
        0x184d
        0x1855
        0x1867
        0x1871
        0x1877
        0x187d
        0x187f
        0x1885
        0x188f
        0x189b
        0x189d
        0x18a7
        0x18ad
        0x18b3
        0x18b9
        0x18c1
        0x18c7
        0x18d1
        0x18d7
        0x18d9
        0x18df
        0x18e5
        0x18eb
        0x18f5
        0x18fd
        0x1915
        0x191b
        0x1931
        0x1933
        0x1945
        0x1949
        0x1951
        0x195b
        0x1979
        0x1981
        0x1993
        0x1997
        0x1999
        0x19a3
        0x19a9
        0x19ab
        0x19b1
        0x19b5
        0x19c7
        0x19cf
        0x19db
        0x19ed
        0x19fd
        0x1a03
        0x1a05
        0x1a11
        0x1a17
        0x1a21
        0x1a23
        0x1a2d
        0x1a2f
        0x1a35
        0x1a3f
        0x1a4d
        0x1a51
        0x1a69
        0x1a6b
        0x1a7b
        0x1a7d
        0x1a87
        0x1a89
        0x1a93
        0x1aa7
        0x1aab
        0x1aad
        0x1ab1
        0x1ab9
        0x1ac9
        0x1acf
        0x1ad5
        0x1ad7
        0x1ae3
        0x1af3
        0x1afb
        0x1aff
        0x1b05
        0x1b23
        0x1b25
        0x1b2f
        0x1b31
        0x1b37
        0x1b3b
        0x1b41
        0x1b47
        0x1b4f
        0x1b55
        0x1b59
        0x1b65
        0x1b6b
        0x1b73
        0x1b7f
        0x1b83
        0x1b91
        0x1b9d
        0x1ba7
        0x1bbf
        0x1bc5
        0x1bd1
        0x1bd7
        0x1bd9
        0x1bef
        0x1bf7
        0x1c09
        0x1c13
        0x1c19
        0x1c27
        0x1c2b
        0x1c2d
        0x1c33
        0x1c3d
        0x1c45
        0x1c4b
        0x1c4f
        0x1c55
        0x1c73
        0x1c81
        0x1c8b
        0x1c8d
        0x1c99
        0x1ca3
        0x1ca5
        0x1cb5
        0x1cb7
        0x1cc9
        0x1ce1
        0x1cf3
        0x1cf9
        0x1d09
        0x1d1b
        0x1d21
        0x1d23
        0x1d35
        0x1d39
        0x1d3f
        0x1d41
        0x1d4b
        0x1d53
        0x1d5d
        0x1d63
        0x1d69
        0x1d71
        0x1d75
        0x1d7b
        0x1d7d
        0x1d87
        0x1d89
        0x1d95
        0x1d99
        0x1d9f
        0x1da5
        0x1da7
        0x1db3
        0x1db7
        0x1dc5
        0x1dd7
        0x1ddb
        0x1de1
        0x1df5
        0x1df9
        0x1e01
        0x1e07
        0x1e0b
        0x1e13
        0x1e17
        0x1e25
        0x1e2b
        0x1e2f
        0x1e3d
        0x1e49
        0x1e4d
        0x1e4f
        0x1e6d
        0x1e71
        0x1e89
        0x1e8f
        0x1e95
        0x1ea1
        0x1ead
        0x1ebb
        0x1ec1
        0x1ec5
        0x1ec7
        0x1ecb
        0x1edd
        0x1ee3
        0x1eef
        0x1ef7
        0x1efd
        0x1f01
        0x1f0d
        0x1f0f
        0x1f1b
        0x1f39
        0x1f49
        0x1f4b
        0x1f51
        0x1f67
        0x1f75
        0x1f7b
        0x1f85
        0x1f91
        0x1f97
        0x1f99
        0x1f9d
        0x1fa5
        0x1faf
        0x1fb5
        0x1fbb
        0x1fd3
        0x1fe1
        0x1fe7
        0x1feb
        0x1ff3
        0x1fff
        0x2011
        0x201b
        0x201d
        0x2027
        0x2029
        0x202d
        0x2033
        0x2047
        0x204d
        0x2051
        0x205f
        0x2063
        0x2065
        0x2069
        0x2077
        0x207d
        0x2089
        0x20a1
        0x20ab
        0x20b1
        0x20b9
        0x20c3
        0x20c5
        0x20e3
        0x20e7
        0x20ed
        0x20ef
        0x20fb
        0x20ff
        0x210d
        0x2113
        0x2135
        0x2141
        0x2149
        0x214f
        0x2159
        0x215b
        0x215f
        0x2173
        0x217d
        0x2185
        0x2195
        0x2197
        0x21a1
        0x21af
        0x21b3
        0x21b5
        0x21c1
        0x21c7
        0x21d7
        0x21dd
        0x21e5
        0x21e9
        0x21f1
        0x21f5
        0x21fb
        0x2203
        0x2209
        0x220f
        0x221b
        0x2221
        0x2225
        0x222b
        0x2231
        0x2239
        0x224b
        0x224f
        0x2263
        0x2267
        0x2273
        0x2275
        0x227f
        0x2285
        0x2287
        0x2291
        0x229d
        0x229f
        0x22a3
        0x22b7
        0x22bd
        0x22db
        0x22e1
        0x22e5
        0x22ed
        0x22f7
        0x2303
        0x2309
        0x230b
        0x2327
        0x2329
        0x232f
        0x2333
        0x2335
        0x2345
        0x2351
        0x2353
        0x2359
        0x2363
        0x236b
        0x2383
        0x238f
        0x2395
        0x23a7
        0x23ad
        0x23b1
        0x23bf
        0x23c5
        0x23c9
        0x23d5
        0x23dd
        0x23e3
        0x23ef
        0x23f3
        0x23f9
        0x2405
        0x240b
        0x2417
        0x2419
        0x2429
        0x243d
        0x2441
        0x2443
        0x244d
        0x245f
        0x2467
        0x246b
        0x2479
        0x247d
        0x247f
        0x2485
        0x249b
        0x24a1
        0x24af
        0x24b5
        0x24bb
        0x24c5
        0x24cb
        0x24cd
        0x24d7
        0x24d9
        0x24dd
        0x24df
        0x24f5
        0x24f7
        0x24fb
        0x2501
        0x2507
        0x2513
        0x2519
        0x2527
        0x2531
        0x253d
        0x2543
        0x254b
        0x254f
        0x2573
        0x2581
        0x258d
        0x2593
        0x2597
        0x259d
        0x259f
        0x25ab
        0x25b1
        0x25bd
        0x25cd
        0x25cf
        0x25d9
        0x25e1
        0x25f7
        0x25f9
        0x2605
        0x260b
        0x260f
        0x2615
        0x2627
        0x2629
        0x2635
        0x263b
        0x263f
        0x264b
        0x2653
        0x2659
        0x2665
        0x2669
        0x266f
        0x267b
        0x2681
        0x2683
        0x268f
        0x269b
        0x269f
        0x26ad
        0x26b3
        0x26c3
        0x26c9
        0x26cb
        0x26d5
        0x26dd
        0x26ef
        0x26f5
    .end array-data
.end method

.method public constructor <init>(I)V
    .locals 1

    .prologue
    .line 117
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 118
    new-array v0, p1, [I

    iput-object v0, p0, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;->a:[I

    .line 119
    return-void
.end method

.method public constructor <init>([I)V
    .locals 0

    .prologue
    .line 127
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 128
    iput-object p1, p0, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;->a:[I

    .line 129
    return-void
.end method

.method public static a([BI)Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;
    .locals 2

    .prologue
    .line 155
    new-instance v0, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;

    invoke-static {p0, p1}, Lorg/spongycastle/math/ntru/util/ArrayEncoder;->a([BI)[I

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;-><init>([I)V

    return-object v0
.end method

.method public static a([BII)Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;
    .locals 2

    .prologue
    .line 195
    new-instance v0, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;

    invoke-static {p0, p1, p2}, Lorg/spongycastle/math/ntru/util/ArrayEncoder;->a([BII)[I

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;-><init>([I)V

    return-object v0
.end method

.method private d(Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;)Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;
    .locals 12

    .prologue
    const/4 v2, 0x0

    .line 314
    iget-object v4, p0, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;->a:[I

    .line 315
    iget-object v5, p1, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;->a:[I

    .line 317
    iget-object v0, p1, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;->a:[I

    array-length v6, v0

    .line 318
    const/16 v0, 0x20

    if-gt v6, v0, :cond_2

    .line 320
    mul-int/lit8 v0, v6, 0x2

    add-int/lit8 v7, v0, -0x1

    .line 321
    new-instance v1, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;

    new-array v0, v7, [I

    invoke-direct {v1, v0}, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;-><init>([I)V

    move v3, v2

    .line 322
    :goto_0
    if-ge v3, v7, :cond_1

    .line 324
    sub-int v0, v3, v6

    add-int/lit8 v0, v0, 0x1

    invoke-static {v2, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    :goto_1
    add-int/lit8 v8, v6, -0x1

    invoke-static {v3, v8}, Ljava/lang/Math;->min(II)I

    move-result v8

    if-gt v0, v8, :cond_0

    .line 326
    iget-object v8, v1, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;->a:[I

    aget v9, v8, v3

    aget v10, v5, v0

    sub-int v11, v3, v0

    aget v11, v4, v11

    mul-int/2addr v10, v11

    add-int/2addr v9, v10

    aput v9, v8, v3

    .line 324
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 322
    :cond_0
    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto :goto_0

    :cond_1
    move-object v0, v1

    .line 364
    :goto_2
    return-object v0

    .line 333
    :cond_2
    div-int/lit8 v3, v6, 0x2

    .line 335
    new-instance v7, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;

    invoke-static {v4, v3}, Lorg/spongycastle/util/Arrays;->a([II)[I

    move-result-object v0

    invoke-direct {v7, v0}, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;-><init>([I)V

    .line 336
    new-instance v8, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;

    invoke-static {v4, v3, v6}, Lorg/spongycastle/util/Arrays;->a([III)[I

    move-result-object v0

    invoke-direct {v8, v0}, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;-><init>([I)V

    .line 337
    new-instance v4, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;

    invoke-static {v5, v3}, Lorg/spongycastle/util/Arrays;->a([II)[I

    move-result-object v0

    invoke-direct {v4, v0}, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;-><init>([I)V

    .line 338
    new-instance v9, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;

    invoke-static {v5, v3, v6}, Lorg/spongycastle/util/Arrays;->a([III)[I

    move-result-object v0

    invoke-direct {v9, v0}, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;-><init>([I)V

    .line 340
    invoke-virtual {v7}, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;

    .line 341
    invoke-virtual {v0, v8}, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;->b(Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;)V

    .line 342
    invoke-virtual {v4}, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;->clone()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;

    .line 343
    invoke-virtual {v1, v9}, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;->b(Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;)V

    .line 345
    invoke-direct {v7, v4}, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;->d(Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;)Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;

    move-result-object v4

    .line 346
    invoke-direct {v8, v9}, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;->d(Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;)Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;

    move-result-object v5

    .line 347
    invoke-direct {v0, v1}, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;->d(Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;)Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;

    move-result-object v7

    .line 348
    invoke-virtual {v7, v4}, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;->c(Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;)V

    .line 349
    invoke-virtual {v7, v5}, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;->c(Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;)V

    .line 351
    new-instance v1, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;

    mul-int/lit8 v0, v6, 0x2

    add-int/lit8 v0, v0, -0x1

    invoke-direct {v1, v0}, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;-><init>(I)V

    move v0, v2

    .line 352
    :goto_3
    iget-object v6, v4, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;->a:[I

    array-length v6, v6

    if-ge v0, v6, :cond_3

    .line 354
    iget-object v6, v1, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;->a:[I

    iget-object v8, v4, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;->a:[I

    aget v8, v8, v0

    aput v8, v6, v0

    .line 352
    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    :cond_3
    move v0, v2

    .line 356
    :goto_4
    iget-object v4, v7, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;->a:[I

    array-length v4, v4

    if-ge v0, v4, :cond_4

    .line 358
    iget-object v4, v1, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;->a:[I

    add-int v6, v3, v0

    aget v8, v4, v6

    iget-object v9, v7, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;->a:[I

    aget v9, v9, v0

    add-int/2addr v8, v9

    aput v8, v4, v6

    .line 356
    add-int/lit8 v0, v0, 0x1

    goto :goto_4

    .line 360
    :cond_4
    :goto_5
    iget-object v0, v5, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;->a:[I

    array-length v0, v0

    if-ge v2, v0, :cond_5

    .line 362
    iget-object v0, v1, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;->a:[I

    mul-int/lit8 v4, v3, 0x2

    add-int/2addr v4, v2

    aget v6, v0, v4

    iget-object v7, v5, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;->a:[I

    aget v7, v7, v2

    add-int/2addr v6, v7

    aput v6, v0, v4

    .line 360
    add-int/lit8 v2, v2, 0x1

    goto :goto_5

    :cond_5
    move-object v0, v1

    .line 364
    goto/16 :goto_2
.end method


# virtual methods
.method public final a(Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;)Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;
    .locals 7

    .prologue
    .line 285
    iget-object v0, p0, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;->a:[I

    array-length v1, v0

    .line 286
    iget-object v0, p1, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;->a:[I

    array-length v0, v0

    if-eq v0, v1, :cond_0

    .line 288
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Number of coefficients must be the same"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 291
    :cond_0
    invoke-direct {p0, p1}, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;->d(Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;)Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;

    move-result-object v2

    .line 293
    iget-object v0, v2, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;->a:[I

    array-length v0, v0

    if-le v0, v1, :cond_2

    move v0, v1

    .line 295
    :goto_0
    iget-object v3, v2, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;->a:[I

    array-length v3, v3

    if-ge v0, v3, :cond_1

    .line 297
    iget-object v3, v2, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;->a:[I

    sub-int v4, v0, v1

    aget v5, v3, v4

    iget-object v6, v2, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;->a:[I

    aget v6, v6, v0

    add-int/2addr v5, v6

    aput v5, v3, v4

    .line 295
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 299
    :cond_1
    iget-object v0, v2, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;->a:[I

    invoke-static {v0, v1}, Lorg/spongycastle/util/Arrays;->a([II)[I

    move-result-object v0

    iput-object v0, v2, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;->a:[I

    .line 301
    :cond_2
    return-object v2
.end method

.method public a(Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;I)Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;
    .locals 1

    .prologue
    .line 275
    invoke-virtual {p0, p1}, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;->a(Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;)Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;

    move-result-object v0

    .line 276
    invoke-virtual {v0, p2}, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;->c(I)V

    .line 277
    return-object v0
.end method

.method public final a(I)[B
    .locals 1

    .prologue
    .line 267
    iget-object v0, p0, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;->a:[I

    invoke-static {v0, p1}, Lorg/spongycastle/math/ntru/util/ArrayEncoder;->a([II)[B

    move-result-object v0

    return-object v0
.end method

.method public final b(I)V
    .locals 0

    .prologue
    .line 1034
    invoke-virtual {p0, p1}, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;->c(I)V

    .line 1035
    invoke-virtual {p0, p1}, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;->d(I)V

    .line 1036
    return-void
.end method

.method public final b(Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;)V
    .locals 4

    .prologue
    .line 900
    iget-object v0, p1, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;->a:[I

    array-length v0, v0

    iget-object v1, p0, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;->a:[I

    array-length v1, v1

    if-le v0, v1, :cond_0

    .line 902
    iget-object v0, p0, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;->a:[I

    iget-object v1, p1, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;->a:[I

    array-length v1, v1

    invoke-static {v0, v1}, Lorg/spongycastle/util/Arrays;->a([II)[I

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;->a:[I

    .line 904
    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p1, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;->a:[I

    array-length v1, v1

    if-ge v0, v1, :cond_1

    .line 906
    iget-object v1, p0, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;->a:[I

    aget v2, v1, v0

    iget-object v3, p1, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;->a:[I

    aget v3, v3, v0

    add-int/2addr v2, v3

    aput v2, v1, v0

    .line 904
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 908
    :cond_1
    return-void
.end method

.method public final c(I)V
    .locals 3

    .prologue
    .line 1062
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;->a:[I

    array-length v1, v1

    if-ge v0, v1, :cond_0

    .line 1064
    iget-object v1, p0, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;->a:[I

    aget v2, v1, v0

    rem-int/2addr v2, p1

    aput v2, v1, v0

    .line 1062
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 1066
    :cond_0
    return-void
.end method

.method public final c(Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;)V
    .locals 4

    .prologue
    .line 929
    iget-object v0, p1, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;->a:[I

    array-length v0, v0

    iget-object v1, p0, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;->a:[I

    array-length v1, v1

    if-le v0, v1, :cond_0

    .line 931
    iget-object v0, p0, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;->a:[I

    iget-object v1, p1, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;->a:[I

    array-length v1, v1

    invoke-static {v0, v1}, Lorg/spongycastle/util/Arrays;->a([II)[I

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;->a:[I

    .line 933
    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p1, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;->a:[I

    array-length v1, v1

    if-ge v0, v1, :cond_1

    .line 935
    iget-object v1, p0, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;->a:[I

    aget v2, v1, v0

    iget-object v3, p1, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;->a:[I

    aget v3, v3, v0

    sub-int/2addr v2, v3

    aput v2, v1, v0

    .line 933
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 937
    :cond_1
    return-void
.end method

.method public clone()Ljava/lang/Object;
    .locals 2

    .prologue
    .line 1304
    new-instance v1, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;

    iget-object v0, p0, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;->a:[I

    invoke-virtual {v0}, [I->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [I

    invoke-direct {v1, v0}, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;-><init>([I)V

    return-object v1
.end method

.method public final d()V
    .locals 3

    .prologue
    .line 959
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;->a:[I

    array-length v1, v1

    if-ge v0, v1, :cond_0

    .line 961
    iget-object v1, p0, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;->a:[I

    aget v2, v1, v0

    mul-int/lit8 v2, v2, 0x3

    aput v2, v1, v0

    .line 959
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 963
    :cond_0
    return-void
.end method

.method public final d(I)V
    .locals 3

    .prologue
    .line 1075
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;->a:[I

    array-length v1, v1

    if-ge v0, v1, :cond_1

    .line 1077
    :goto_1
    iget-object v1, p0, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;->a:[I

    aget v1, v1, v0

    if-gez v1, :cond_0

    .line 1079
    iget-object v1, p0, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;->a:[I

    aget v2, v1, v0

    add-int/2addr v2, p1

    aput v2, v1, v0

    goto :goto_1

    .line 1075
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 1082
    :cond_1
    return-void
.end method

.method public final e()V
    .locals 3

    .prologue
    .line 1013
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;->a:[I

    array-length v1, v1

    if-ge v0, v1, :cond_2

    .line 1015
    iget-object v1, p0, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;->a:[I

    aget v2, v1, v0

    rem-int/lit8 v2, v2, 0x3

    aput v2, v1, v0

    .line 1016
    iget-object v1, p0, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;->a:[I

    aget v1, v1, v0

    const/4 v2, 0x1

    if-le v1, v2, :cond_0

    .line 1018
    iget-object v1, p0, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;->a:[I

    aget v2, v1, v0

    add-int/lit8 v2, v2, -0x3

    aput v2, v1, v0

    .line 1020
    :cond_0
    iget-object v1, p0, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;->a:[I

    aget v1, v1, v0

    const/4 v2, -0x1

    if-ge v1, v2, :cond_1

    .line 1022
    iget-object v1, p0, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;->a:[I

    aget v2, v1, v0

    add-int/lit8 v2, v2, 0x3

    aput v2, v1, v0

    .line 1013
    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 1025
    :cond_2
    return-void
.end method

.method public final e(I)V
    .locals 3

    .prologue
    .line 1178
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;->a:[I

    array-length v1, v1

    if-ge v0, v1, :cond_2

    .line 1180
    :goto_1
    iget-object v1, p0, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;->a:[I

    aget v1, v1, v0

    neg-int v2, p1

    div-int/lit8 v2, v2, 0x2

    if-ge v1, v2, :cond_0

    .line 1182
    iget-object v1, p0, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;->a:[I

    aget v2, v1, v0

    add-int/2addr v2, p1

    aput v2, v1, v0

    goto :goto_1

    .line 1184
    :cond_0
    :goto_2
    iget-object v1, p0, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;->a:[I

    aget v1, v1, v0

    div-int/lit8 v2, p1, 0x2

    if-le v1, v2, :cond_1

    .line 1186
    iget-object v1, p0, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;->a:[I

    aget v2, v1, v0

    sub-int/2addr v2, p1

    aput v2, v1, v0

    goto :goto_2

    .line 1178
    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 1189
    :cond_2
    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    .prologue
    .line 1309
    instance-of v0, p1, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;

    if-eqz v0, :cond_0

    .line 1311
    iget-object v0, p0, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;->a:[I

    check-cast p1, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;

    iget-object v1, p1, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;->a:[I

    invoke-static {v0, v1}, Lorg/spongycastle/util/Arrays;->a([I[I)Z

    move-result v0

    .line 1315
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final f(I)I
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 1265
    move v1, v0

    .line 1266
    :goto_0
    iget-object v2, p0, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;->a:[I

    array-length v2, v2

    if-eq v0, v2, :cond_1

    .line 1268
    iget-object v2, p0, Lorg/spongycastle/math/ntru/polynomial/IntegerPolynomial;->a:[I

    aget v2, v2, v0

    if-ne v2, p1, :cond_0

    .line 1270
    add-int/lit8 v1, v1, 0x1

    .line 1266
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 1273
    :cond_1
    return v1
.end method
