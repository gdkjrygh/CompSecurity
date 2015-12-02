.class public Landroid_src/mms/e/r;
.super Ljava/lang/Object;
.source "PduParser.java"


# static fields
.field static final synthetic a:Z

.field private static e:[B

.field private static f:[B


# instance fields
.field private b:Ljava/io/ByteArrayInputStream;

.field private c:Landroid_src/mms/e/q;

.field private d:Landroid_src/mms/e/j;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 33
    const-class v0, Landroid_src/mms/e/r;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Landroid_src/mms/e/r;->a:Z

    .line 76
    sput-object v1, Landroid_src/mms/e/r;->e:[B

    .line 81
    sput-object v1, Landroid_src/mms/e/r;->f:[B

    return-void

    .line 33
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public constructor <init>([B)V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 95
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 61
    iput-object v0, p0, Landroid_src/mms/e/r;->b:Ljava/io/ByteArrayInputStream;

    .line 66
    iput-object v0, p0, Landroid_src/mms/e/r;->c:Landroid_src/mms/e/q;

    .line 71
    iput-object v0, p0, Landroid_src/mms/e/r;->d:Landroid_src/mms/e/j;

    .line 96
    new-instance v0, Ljava/io/ByteArrayInputStream;

    invoke-direct {v0, p1}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    iput-object v0, p0, Landroid_src/mms/e/r;->b:Ljava/io/ByteArrayInputStream;

    .line 97
    return-void
.end method

.method private static a(Landroid_src/mms/e/s;)I
    .locals 4

    .prologue
    const/4 v1, 0x0

    const/4 v0, 0x1

    .line 1669
    sget-boolean v2, Landroid_src/mms/e/r;->a:Z

    if-nez v2, :cond_0

    if-nez p0, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 1670
    :cond_0
    sget-object v2, Landroid_src/mms/e/r;->e:[B

    if-nez v2, :cond_2

    sget-object v2, Landroid_src/mms/e/r;->f:[B

    if-nez v2, :cond_2

    .line 1695
    :cond_1
    :goto_0
    return v0

    .line 1676
    :cond_2
    sget-object v2, Landroid_src/mms/e/r;->f:[B

    if-eqz v2, :cond_3

    .line 1677
    invoke-virtual {p0}, Landroid_src/mms/e/s;->c()[B

    move-result-object v2

    .line 1678
    if-eqz v2, :cond_3

    .line 1679
    sget-object v3, Landroid_src/mms/e/r;->f:[B

    invoke-static {v3, v2}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v2

    if-ne v0, v2, :cond_3

    move v0, v1

    .line 1680
    goto :goto_0

    .line 1686
    :cond_3
    sget-object v2, Landroid_src/mms/e/r;->e:[B

    if-eqz v2, :cond_1

    .line 1687
    invoke-virtual {p0}, Landroid_src/mms/e/s;->g()[B

    move-result-object v2

    .line 1688
    if-eqz v2, :cond_1

    .line 1689
    sget-object v3, Landroid_src/mms/e/r;->e:[B

    invoke-static {v3, v2}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v2

    if-ne v0, v2, :cond_1

    move v0, v1

    .line 1690
    goto :goto_0
.end method

.method protected static a(Ljava/io/ByteArrayInputStream;Ljava/util/HashMap;Ljava/lang/Integer;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/ByteArrayInputStream;",
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/lang/Integer;",
            ")V"
        }
    .end annotation

    .prologue
    const/16 v8, 0x7f

    const/4 v7, 0x1

    const/4 v6, -0x1

    const/16 v5, 0x81

    const/4 v1, 0x0

    .line 1258
    sget-boolean v0, Landroid_src/mms/e/r;->a:Z

    if-nez v0, :cond_0

    if-nez p0, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 1259
    :cond_0
    sget-boolean v0, Landroid_src/mms/e/r;->a:Z

    if-nez v0, :cond_1

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-gtz v0, :cond_1

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 1261
    :cond_1
    invoke-virtual {p0}, Ljava/io/ByteArrayInputStream;->available()I

    move-result v2

    .line 1263
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 1264
    :goto_0
    if-lez v0, :cond_c

    .line 1265
    invoke-virtual {p0}, Ljava/io/ByteArrayInputStream;->read()I

    move-result v3

    .line 1266
    sget-boolean v4, Landroid_src/mms/e/r;->a:Z

    if-nez v4, :cond_2

    if-ne v6, v3, :cond_2

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 1267
    :cond_2
    add-int/lit8 v0, v0, -0x1

    .line 1269
    sparse-switch v3, :sswitch_data_0

    .line 1400
    invoke-static {p0, v0}, Landroid_src/mms/e/r;->c(Ljava/io/ByteArrayInputStream;I)I

    move-result v3

    if-ne v6, v3, :cond_b

    .line 1401
    const-string v3, "PduParser"

    const-string v4, "Corrupt Content-Type"

    invoke-static {v3, v4}, Lcom/facebook/debug/log/b;->e(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 1285
    :sswitch_0
    invoke-virtual {p0, v7}, Ljava/io/ByteArrayInputStream;->mark(I)V

    .line 1286
    invoke-static {p0}, Landroid_src/mms/e/r;->f(Ljava/io/ByteArrayInputStream;)I

    move-result v0

    .line 1287
    invoke-virtual {p0}, Ljava/io/ByteArrayInputStream;->reset()V

    .line 1288
    if-le v0, v8, :cond_4

    .line 1290
    invoke-static {p0}, Landroid_src/mms/e/r;->g(Ljava/io/ByteArrayInputStream;)I

    move-result v0

    .line 1292
    sget-object v3, Landroid_src/mms/e/p;->a:[Ljava/lang/String;

    array-length v3, v3

    if-ge v0, v3, :cond_3

    .line 1293
    sget-object v3, Landroid_src/mms/e/p;->a:[Ljava/lang/String;

    aget-object v0, v3, v0

    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    .line 1294
    const/16 v3, 0x83

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {p1, v3, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1306
    :cond_3
    :goto_1
    invoke-virtual {p0}, Ljava/io/ByteArrayInputStream;->available()I

    move-result v0

    .line 1307
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v3

    sub-int v0, v2, v0

    sub-int v0, v3, v0

    .line 1308
    goto :goto_0

    .line 1300
    :cond_4
    invoke-static {p0, v1}, Landroid_src/mms/e/r;->a(Ljava/io/ByteArrayInputStream;I)[B

    move-result-object v0

    .line 1301
    if-eqz v0, :cond_3

    if-eqz p1, :cond_3

    .line 1302
    const/16 v3, 0x83

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {p1, v3, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 1325
    :sswitch_1
    invoke-static {p0, v1}, Landroid_src/mms/e/r;->a(Ljava/io/ByteArrayInputStream;I)[B

    move-result-object v0

    .line 1326
    if-eqz v0, :cond_5

    if-eqz p1, :cond_5

    .line 1327
    const/16 v3, 0x99

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {p1, v3, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1330
    :cond_5
    invoke-virtual {p0}, Ljava/io/ByteArrayInputStream;->available()I

    move-result v0

    .line 1331
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v3

    sub-int v0, v2, v0

    sub-int v0, v3, v0

    .line 1332
    goto/16 :goto_0

    .line 1349
    :sswitch_2
    invoke-virtual {p0, v7}, Ljava/io/ByteArrayInputStream;->mark(I)V

    .line 1350
    invoke-static {p0}, Landroid_src/mms/e/r;->f(Ljava/io/ByteArrayInputStream;)I

    move-result v0

    .line 1351
    invoke-virtual {p0}, Ljava/io/ByteArrayInputStream;->reset()V

    .line 1353
    const/16 v3, 0x20

    if-le v0, v3, :cond_6

    if-lt v0, v8, :cond_7

    :cond_6
    if-nez v0, :cond_9

    .line 1356
    :cond_7
    invoke-static {p0, v1}, Landroid_src/mms/e/r;->a(Ljava/io/ByteArrayInputStream;I)[B

    move-result-object v3

    .line 1358
    :try_start_0
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v3}, Ljava/lang/String;-><init>([B)V

    invoke-static {v0}, Landroid_src/mms/e/c;->a(Ljava/lang/String;)I

    move-result v0

    .line 1360
    const/16 v4, 0x81

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, v4, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1374
    :cond_8
    :goto_2
    invoke-virtual {p0}, Ljava/io/ByteArrayInputStream;->available()I

    move-result v0

    .line 1375
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v3

    sub-int v0, v2, v0

    sub-int v0, v3, v0

    .line 1376
    goto/16 :goto_0

    .line 1361
    :catch_0
    move-exception v0

    .line 1363
    const-string v4, "PduParser"

    invoke-static {v3}, Ljava/util/Arrays;->toString([B)Ljava/lang/String;

    move-result-object v3

    invoke-static {v4, v3, v0}, Lcom/facebook/debug/log/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1364
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {p1, v0, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    .line 1368
    :cond_9
    invoke-static {p0}, Landroid_src/mms/e/r;->i(Ljava/io/ByteArrayInputStream;)J

    move-result-wide v3

    long-to-int v0, v3

    .line 1369
    if-eqz p1, :cond_8

    .line 1370
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, v3, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    .line 1388
    :sswitch_3
    invoke-static {p0, v1}, Landroid_src/mms/e/r;->a(Ljava/io/ByteArrayInputStream;I)[B

    move-result-object v0

    .line 1389
    if-eqz v0, :cond_a

    if-eqz p1, :cond_a

    .line 1390
    const/16 v3, 0x97

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {p1, v3, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1393
    :cond_a
    invoke-virtual {p0}, Ljava/io/ByteArrayInputStream;->available()I

    move-result v0

    .line 1394
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v3

    sub-int v0, v2, v0

    sub-int v0, v3, v0

    .line 1395
    goto/16 :goto_0

    :cond_b
    move v0, v1

    .line 1403
    goto/16 :goto_0

    .line 1409
    :cond_c
    if-eqz v0, :cond_d

    .line 1410
    const-string v0, "PduParser"

    const-string v1, "Corrupt Content-Type"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 1412
    :cond_d
    return-void

    .line 1269
    nop

    :sswitch_data_0
    .sparse-switch
        0x81 -> :sswitch_2
        0x83 -> :sswitch_0
        0x85 -> :sswitch_3
        0x89 -> :sswitch_0
        0x8a -> :sswitch_1
        0x97 -> :sswitch_3
        0x99 -> :sswitch_1
    .end sparse-switch
.end method

.method private static a(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 854
    return-void
.end method

.method protected static a(I)Z
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 1031
    const/16 v1, 0x21

    if-lt p0, v1, :cond_0

    const/16 v1, 0x7e

    if-le p0, v1, :cond_1

    .line 1056
    :cond_0
    :goto_0
    :sswitch_0
    return v0

    .line 1035
    :cond_1
    sparse-switch p0, :sswitch_data_0

    .line 1056
    const/4 v0, 0x1

    goto :goto_0

    .line 1035
    nop

    :sswitch_data_0
    .sparse-switch
        0x22 -> :sswitch_0
        0x28 -> :sswitch_0
        0x29 -> :sswitch_0
        0x2c -> :sswitch_0
        0x2f -> :sswitch_0
        0x3a -> :sswitch_0
        0x3b -> :sswitch_0
        0x3c -> :sswitch_0
        0x3d -> :sswitch_0
        0x3e -> :sswitch_0
        0x3f -> :sswitch_0
        0x40 -> :sswitch_0
        0x5b -> :sswitch_0
        0x5c -> :sswitch_0
        0x5d -> :sswitch_0
        0x7b -> :sswitch_0
        0x7d -> :sswitch_0
    .end sparse-switch
.end method

.method protected static a(Landroid_src/mms/e/q;)Z
    .locals 8

    .prologue
    const/16 v7, 0x89

    const/16 v6, 0x85

    const-wide/16 v4, -0x1

    const/16 v3, 0x98

    const/4 v0, 0x0

    .line 1705
    if-nez p0, :cond_1

    .line 1912
    :cond_0
    :goto_0
    return v0

    .line 1710
    :cond_1
    const/16 v1, 0x8c

    invoke-virtual {p0, v1}, Landroid_src/mms/e/q;->a(I)I

    move-result v1

    .line 1713
    const/16 v2, 0x8d

    invoke-virtual {p0, v2}, Landroid_src/mms/e/q;->a(I)I

    move-result v2

    .line 1714
    if-eqz v2, :cond_0

    .line 1720
    packed-switch v1, :pswitch_data_0

    goto :goto_0

    .line 1723
    :pswitch_0
    const/16 v1, 0x84

    invoke-virtual {p0, v1}, Landroid_src/mms/e/q;->b(I)[B

    move-result-object v1

    .line 1724
    if-eqz v1, :cond_0

    .line 1729
    invoke-virtual {p0, v7}, Landroid_src/mms/e/q;->c(I)Landroid_src/mms/e/e;

    move-result-object v1

    .line 1730
    if-eqz v1, :cond_0

    .line 1735
    invoke-virtual {p0, v3}, Landroid_src/mms/e/q;->b(I)[B

    move-result-object v1

    .line 1736
    if-eqz v1, :cond_0

    .line 1912
    :cond_2
    const/4 v0, 0x1

    goto :goto_0

    .line 1743
    :pswitch_1
    const/16 v1, 0x92

    invoke-virtual {p0, v1}, Landroid_src/mms/e/q;->a(I)I

    move-result v1

    .line 1744
    if-eqz v1, :cond_0

    .line 1749
    invoke-virtual {p0, v3}, Landroid_src/mms/e/q;->b(I)[B

    move-result-object v1

    .line 1750
    if-nez v1, :cond_2

    goto :goto_0

    .line 1757
    :pswitch_2
    const/16 v1, 0x83

    invoke-virtual {p0, v1}, Landroid_src/mms/e/q;->b(I)[B

    move-result-object v1

    .line 1758
    if-eqz v1, :cond_0

    .line 1763
    const/16 v1, 0x88

    invoke-virtual {p0, v1}, Landroid_src/mms/e/q;->e(I)J

    move-result-wide v1

    .line 1764
    cmp-long v1, v4, v1

    if-eqz v1, :cond_0

    .line 1769
    const/16 v1, 0x8a

    invoke-virtual {p0, v1}, Landroid_src/mms/e/q;->b(I)[B

    move-result-object v1

    .line 1770
    if-eqz v1, :cond_0

    .line 1775
    const/16 v1, 0x8e

    invoke-virtual {p0, v1}, Landroid_src/mms/e/q;->e(I)J

    move-result-wide v1

    .line 1776
    cmp-long v1, v4, v1

    if-eqz v1, :cond_0

    .line 1781
    invoke-virtual {p0, v3}, Landroid_src/mms/e/q;->b(I)[B

    move-result-object v1

    .line 1782
    if-nez v1, :cond_2

    goto :goto_0

    .line 1789
    :pswitch_3
    const/16 v1, 0x95

    invoke-virtual {p0, v1}, Landroid_src/mms/e/q;->a(I)I

    move-result v1

    .line 1790
    if-eqz v1, :cond_0

    .line 1795
    invoke-virtual {p0, v3}, Landroid_src/mms/e/q;->b(I)[B

    move-result-object v1

    .line 1796
    if-nez v1, :cond_2

    goto :goto_0

    .line 1803
    :pswitch_4
    const/16 v1, 0x84

    invoke-virtual {p0, v1}, Landroid_src/mms/e/q;->b(I)[B

    move-result-object v1

    .line 1804
    if-eqz v1, :cond_0

    .line 1809
    invoke-virtual {p0, v6}, Landroid_src/mms/e/q;->e(I)J

    move-result-wide v1

    .line 1810
    cmp-long v1, v4, v1

    if-nez v1, :cond_2

    goto/16 :goto_0

    .line 1817
    :pswitch_5
    invoke-virtual {p0, v6}, Landroid_src/mms/e/q;->e(I)J

    move-result-wide v1

    .line 1818
    cmp-long v1, v4, v1

    if-eqz v1, :cond_0

    .line 1823
    const/16 v1, 0x8b

    invoke-virtual {p0, v1}, Landroid_src/mms/e/q;->b(I)[B

    move-result-object v1

    .line 1824
    if-eqz v1, :cond_0

    .line 1829
    const/16 v1, 0x95

    invoke-virtual {p0, v1}, Landroid_src/mms/e/q;->a(I)I

    move-result v1

    .line 1830
    if-eqz v1, :cond_0

    .line 1835
    const/16 v1, 0x97

    invoke-virtual {p0, v1}, Landroid_src/mms/e/q;->d(I)[Landroid_src/mms/e/e;

    move-result-object v1

    .line 1836
    if-nez v1, :cond_2

    goto/16 :goto_0

    .line 1843
    :pswitch_6
    invoke-virtual {p0, v3}, Landroid_src/mms/e/q;->b(I)[B

    move-result-object v1

    .line 1844
    if-nez v1, :cond_2

    goto/16 :goto_0

    .line 1851
    :pswitch_7
    invoke-virtual {p0, v6}, Landroid_src/mms/e/q;->e(I)J

    move-result-wide v1

    .line 1852
    cmp-long v1, v4, v1

    if-eqz v1, :cond_0

    .line 1857
    invoke-virtual {p0, v7}, Landroid_src/mms/e/q;->c(I)Landroid_src/mms/e/e;

    move-result-object v1

    .line 1858
    if-eqz v1, :cond_0

    .line 1863
    const/16 v1, 0x8b

    invoke-virtual {p0, v1}, Landroid_src/mms/e/q;->b(I)[B

    move-result-object v1

    .line 1864
    if-eqz v1, :cond_0

    .line 1869
    const/16 v1, 0x9b

    invoke-virtual {p0, v1}, Landroid_src/mms/e/q;->a(I)I

    move-result v1

    .line 1870
    if-eqz v1, :cond_0

    .line 1875
    const/16 v1, 0x97

    invoke-virtual {p0, v1}, Landroid_src/mms/e/q;->d(I)[Landroid_src/mms/e/e;

    move-result-object v1

    .line 1876
    if-nez v1, :cond_2

    goto/16 :goto_0

    .line 1883
    :pswitch_8
    invoke-virtual {p0, v7}, Landroid_src/mms/e/q;->c(I)Landroid_src/mms/e/e;

    move-result-object v1

    .line 1884
    if-eqz v1, :cond_0

    .line 1889
    const/16 v1, 0x8b

    invoke-virtual {p0, v1}, Landroid_src/mms/e/q;->b(I)[B

    move-result-object v1

    .line 1890
    if-eqz v1, :cond_0

    .line 1895
    const/16 v1, 0x9b

    invoke-virtual {p0, v1}, Landroid_src/mms/e/q;->a(I)I

    move-result v1

    .line 1896
    if-eqz v1, :cond_0

    .line 1901
    const/16 v1, 0x97

    invoke-virtual {p0, v1}, Landroid_src/mms/e/q;->d(I)[Landroid_src/mms/e/e;

    move-result-object v1

    .line 1902
    if-nez v1, :cond_2

    goto/16 :goto_0

    .line 1720
    nop

    :pswitch_data_0
    .packed-switch 0x80
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_6
        :pswitch_5
        :pswitch_8
        :pswitch_7
    .end packed-switch
.end method

.method protected static a(Ljava/io/ByteArrayInputStream;Landroid_src/mms/e/s;I)Z
    .locals 10

    .prologue
    const/16 v9, 0x7f

    const/4 v8, -0x1

    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 1494
    sget-boolean v0, Landroid_src/mms/e/r;->a:Z

    if-nez v0, :cond_0

    if-nez p0, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 1495
    :cond_0
    sget-boolean v0, Landroid_src/mms/e/r;->a:Z

    if-nez v0, :cond_1

    if-nez p1, :cond_1

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 1496
    :cond_1
    sget-boolean v0, Landroid_src/mms/e/r;->a:Z

    if-nez v0, :cond_2

    if-gtz p2, :cond_2

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 1514
    :cond_2
    invoke-virtual {p0}, Ljava/io/ByteArrayInputStream;->available()I

    move-result v3

    move v0, p2

    .line 1517
    :cond_3
    :goto_0
    if-lez v0, :cond_11

    .line 1518
    invoke-virtual {p0}, Ljava/io/ByteArrayInputStream;->read()I

    move-result v4

    .line 1519
    sget-boolean v5, Landroid_src/mms/e/r;->a:Z

    if-nez v5, :cond_4

    if-ne v8, v4, :cond_4

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 1520
    :cond_4
    add-int/lit8 v0, v0, -0x1

    .line 1522
    if-le v4, v9, :cond_d

    .line 1524
    sparse-switch v4, :sswitch_data_0

    .line 1620
    invoke-static {p0, v0}, Landroid_src/mms/e/r;->c(Ljava/io/ByteArrayInputStream;I)I

    move-result v0

    if-ne v8, v0, :cond_c

    .line 1621
    const-string v0, "PduParser"

    const-string v2, "Corrupt Part headers"

    invoke-static {v0, v2}, Lcom/facebook/debug/log/b;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 1658
    :goto_1
    return v1

    .line 1530
    :sswitch_0
    invoke-static {p0, v1}, Landroid_src/mms/e/r;->a(Ljava/io/ByteArrayInputStream;I)[B

    move-result-object v0

    .line 1531
    if-eqz v0, :cond_5

    .line 1532
    invoke-virtual {p1, v0}, Landroid_src/mms/e/s;->c([B)V

    .line 1535
    :cond_5
    invoke-virtual {p0}, Ljava/io/ByteArrayInputStream;->available()I

    move-result v0

    .line 1536
    sub-int v0, v3, v0

    sub-int v0, p2, v0

    .line 1537
    goto :goto_0

    .line 1543
    :sswitch_1
    invoke-static {p0, v2}, Landroid_src/mms/e/r;->a(Ljava/io/ByteArrayInputStream;I)[B

    move-result-object v0

    .line 1544
    if-eqz v0, :cond_6

    .line 1545
    invoke-virtual {p1, v0}, Landroid_src/mms/e/s;->b([B)V

    .line 1548
    :cond_6
    invoke-virtual {p0}, Ljava/io/ByteArrayInputStream;->available()I

    move-result v0

    .line 1549
    sub-int v0, v3, v0

    sub-int v0, p2, v0

    .line 1550
    goto :goto_0

    .line 1570
    :sswitch_2
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v4

    const-string v5, "config_mms_content_disposition_support"

    const-string v6, "bool"

    const-string v7, "android"

    invoke-virtual {v4, v5, v6, v7}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v4

    .line 1572
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v5

    invoke-virtual {v5, v4}, Landroid/content/res/Resources;->getBoolean(I)Z

    move-result v4

    .line 1574
    if-eqz v4, :cond_3

    .line 1575
    invoke-static {p0}, Landroid_src/mms/e/r;->d(Ljava/io/ByteArrayInputStream;)I

    move-result v0

    .line 1576
    invoke-virtual {p0, v2}, Ljava/io/ByteArrayInputStream;->mark(I)V

    .line 1577
    invoke-virtual {p0}, Ljava/io/ByteArrayInputStream;->available()I

    move-result v4

    .line 1579
    invoke-virtual {p0}, Ljava/io/ByteArrayInputStream;->read()I

    move-result v5

    .line 1581
    const/16 v6, 0x80

    if-ne v5, v6, :cond_9

    .line 1582
    sget-object v5, Landroid_src/mms/e/s;->a:[B

    invoke-virtual {p1, v5}, Landroid_src/mms/e/s;->d([B)V

    .line 1595
    :goto_2
    invoke-virtual {p0}, Ljava/io/ByteArrayInputStream;->available()I

    move-result v5

    .line 1596
    sub-int v5, v4, v5

    if-ge v5, v0, :cond_8

    .line 1597
    invoke-virtual {p0}, Ljava/io/ByteArrayInputStream;->read()I

    move-result v5

    .line 1598
    const/16 v6, 0x98

    if-ne v5, v6, :cond_7

    .line 1599
    invoke-static {p0, v1}, Landroid_src/mms/e/r;->a(Ljava/io/ByteArrayInputStream;I)[B

    move-result-object v5

    invoke-virtual {p1, v5}, Landroid_src/mms/e/s;->h([B)V

    .line 1604
    :cond_7
    invoke-virtual {p0}, Ljava/io/ByteArrayInputStream;->available()I

    move-result v5

    .line 1605
    sub-int v6, v4, v5

    if-ge v6, v0, :cond_8

    .line 1606
    sub-int/2addr v4, v5

    sub-int/2addr v0, v4

    .line 1607
    new-array v4, v0, [B

    .line 1608
    invoke-virtual {p0, v4, v1, v0}, Ljava/io/ByteArrayInputStream;->read([BII)I

    .line 1612
    :cond_8
    invoke-virtual {p0}, Ljava/io/ByteArrayInputStream;->available()I

    move-result v0

    .line 1613
    sub-int v0, v3, v0

    sub-int v0, p2, v0

    .line 1614
    goto/16 :goto_0

    .line 1583
    :cond_9
    const/16 v6, 0x81

    if-ne v5, v6, :cond_a

    .line 1584
    sget-object v5, Landroid_src/mms/e/s;->b:[B

    invoke-virtual {p1, v5}, Landroid_src/mms/e/s;->d([B)V

    goto :goto_2

    .line 1585
    :cond_a
    const/16 v6, 0x82

    if-ne v5, v6, :cond_b

    .line 1586
    sget-object v5, Landroid_src/mms/e/s;->c:[B

    invoke-virtual {p1, v5}, Landroid_src/mms/e/s;->d([B)V

    goto :goto_2

    .line 1588
    :cond_b
    invoke-virtual {p0}, Ljava/io/ByteArrayInputStream;->reset()V

    .line 1590
    invoke-static {p0, v1}, Landroid_src/mms/e/r;->a(Ljava/io/ByteArrayInputStream;I)[B

    move-result-object v5

    invoke-virtual {p1, v5}, Landroid_src/mms/e/s;->d([B)V

    goto :goto_2

    :cond_c
    move v0, v1

    .line 1624
    goto/16 :goto_0

    .line 1627
    :cond_d
    const/16 v5, 0x20

    if-lt v4, v5, :cond_f

    if-gt v4, v9, :cond_f

    .line 1629
    invoke-static {p0, v1}, Landroid_src/mms/e/r;->a(Ljava/io/ByteArrayInputStream;I)[B

    move-result-object v0

    .line 1630
    invoke-static {p0, v1}, Landroid_src/mms/e/r;->a(Ljava/io/ByteArrayInputStream;I)[B

    move-result-object v4

    .line 1633
    const-string v5, "Content-Transfer-Encoding"

    new-instance v6, Ljava/lang/String;

    invoke-direct {v6, v0}, Ljava/lang/String;-><init>([B)V

    invoke-virtual {v5, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-ne v2, v0, :cond_e

    .line 1635
    invoke-virtual {p1, v4}, Landroid_src/mms/e/s;->f([B)V

    .line 1638
    :cond_e
    invoke-virtual {p0}, Ljava/io/ByteArrayInputStream;->available()I

    move-result v0

    .line 1639
    sub-int v0, v3, v0

    sub-int v0, p2, v0

    .line 1640
    goto/16 :goto_0

    .line 1645
    :cond_f
    invoke-static {p0, v0}, Landroid_src/mms/e/r;->c(Ljava/io/ByteArrayInputStream;I)I

    move-result v0

    if-ne v8, v0, :cond_10

    .line 1646
    const-string v0, "PduParser"

    const-string v2, "Corrupt Part headers"

    invoke-static {v0, v2}, Lcom/facebook/debug/log/b;->e(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_1

    :cond_10
    move v0, v1

    .line 1649
    goto/16 :goto_0

    .line 1653
    :cond_11
    if-eqz v0, :cond_12

    .line 1654
    const-string v0, "PduParser"

    const-string v2, "Corrupt Part headers"

    invoke-static {v0, v2}, Lcom/facebook/debug/log/b;->e(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_1

    :cond_12
    move v1, v2

    .line 1658
    goto/16 :goto_1

    .line 1524
    nop

    :sswitch_data_0
    .sparse-switch
        0x8e -> :sswitch_0
        0xae -> :sswitch_2
        0xc0 -> :sswitch_1
        0xc5 -> :sswitch_2
    .end sparse-switch
.end method

.method protected static a(Ljava/io/ByteArrayInputStream;I)[B
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 969
    sget-boolean v0, Landroid_src/mms/e/r;->a:Z

    if-nez v0, :cond_0

    if-nez p0, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 987
    :cond_0
    invoke-virtual {p0, v2}, Ljava/io/ByteArrayInputStream;->mark(I)V

    .line 990
    invoke-virtual {p0}, Ljava/io/ByteArrayInputStream;->read()I

    move-result v0

    .line 991
    sget-boolean v1, Landroid_src/mms/e/r;->a:Z

    if-nez v1, :cond_1

    const/4 v1, -0x1

    if-ne v1, v0, :cond_1

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 992
    :cond_1
    if-ne v2, p1, :cond_2

    const/16 v1, 0x22

    if-ne v1, v0, :cond_2

    .line 995
    invoke-virtual {p0, v2}, Ljava/io/ByteArrayInputStream;->mark(I)V

    .line 1010
    :goto_0
    invoke-static {p0, p1}, Landroid_src/mms/e/r;->b(Ljava/io/ByteArrayInputStream;I)[B

    move-result-object v0

    return-object v0

    .line 996
    :cond_2
    if-nez p1, :cond_3

    const/16 v1, 0x7f

    if-ne v1, v0, :cond_3

    .line 999
    invoke-virtual {p0, v2}, Ljava/io/ByteArrayInputStream;->mark(I)V

    goto :goto_0

    .line 1002
    :cond_3
    invoke-virtual {p0}, Ljava/io/ByteArrayInputStream;->reset()V

    goto :goto_0
.end method

.method protected static a(Ljava/io/ByteArrayInputStream;Ljava/util/HashMap;)[B
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/ByteArrayInputStream;",
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Object;",
            ">;)[B"
        }
    .end annotation

    .prologue
    const/16 v7, 0x20

    const/4 v3, 0x1

    const/4 v6, -0x1

    const/16 v5, 0x7f

    const/4 v4, 0x0

    .line 1429
    sget-boolean v0, Landroid_src/mms/e/r;->a:Z

    if-nez v0, :cond_0

    if-nez p0, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 1432
    :cond_0
    invoke-virtual {p0, v3}, Ljava/io/ByteArrayInputStream;->mark(I)V

    .line 1433
    invoke-virtual {p0}, Ljava/io/ByteArrayInputStream;->read()I

    move-result v0

    .line 1434
    sget-boolean v1, Landroid_src/mms/e/r;->a:Z

    if-nez v1, :cond_1

    if-ne v6, v0, :cond_1

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 1435
    :cond_1
    invoke-virtual {p0}, Ljava/io/ByteArrayInputStream;->reset()V

    .line 1437
    and-int/lit16 v0, v0, 0xff

    .line 1439
    if-ge v0, v7, :cond_8

    .line 1440
    invoke-static {p0}, Landroid_src/mms/e/r;->d(Ljava/io/ByteArrayInputStream;)I

    move-result v1

    .line 1441
    invoke-virtual {p0}, Ljava/io/ByteArrayInputStream;->available()I

    move-result v2

    .line 1442
    invoke-virtual {p0, v3}, Ljava/io/ByteArrayInputStream;->mark(I)V

    .line 1443
    invoke-virtual {p0}, Ljava/io/ByteArrayInputStream;->read()I

    move-result v0

    .line 1444
    sget-boolean v3, Landroid_src/mms/e/r;->a:Z

    if-nez v3, :cond_2

    if-ne v6, v0, :cond_2

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 1445
    :cond_2
    invoke-virtual {p0}, Ljava/io/ByteArrayInputStream;->reset()V

    .line 1446
    and-int/lit16 v0, v0, 0xff

    .line 1448
    if-lt v0, v7, :cond_5

    if-gt v0, v5, :cond_5

    .line 1449
    invoke-static {p0, v4}, Landroid_src/mms/e/r;->a(Ljava/io/ByteArrayInputStream;I)[B

    move-result-object v0

    .line 1464
    :goto_0
    invoke-virtual {p0}, Ljava/io/ByteArrayInputStream;->available()I

    move-result v3

    .line 1465
    sub-int/2addr v2, v3

    sub-int/2addr v1, v2

    .line 1466
    if-lez v1, :cond_3

    .line 1467
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {p0, p1, v2}, Landroid_src/mms/e/r;->a(Ljava/io/ByteArrayInputStream;Ljava/util/HashMap;Ljava/lang/Integer;)V

    .line 1470
    :cond_3
    if-gez v1, :cond_4

    .line 1471
    const-string v0, "PduParser"

    const-string v1, "Corrupt MMS message"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 1472
    sget-object v0, Landroid_src/mms/e/p;->a:[Ljava/lang/String;

    aget-object v0, v0, v4

    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    .line 1481
    :cond_4
    :goto_1
    return-object v0

    .line 1450
    :cond_5
    if-le v0, v5, :cond_7

    .line 1451
    invoke-static {p0}, Landroid_src/mms/e/r;->g(Ljava/io/ByteArrayInputStream;)I

    move-result v0

    .line 1453
    sget-object v3, Landroid_src/mms/e/p;->a:[Ljava/lang/String;

    array-length v3, v3

    if-ge v0, v3, :cond_6

    .line 1454
    sget-object v3, Landroid_src/mms/e/p;->a:[Ljava/lang/String;

    aget-object v0, v3, v0

    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    goto :goto_0

    .line 1456
    :cond_6
    invoke-virtual {p0}, Ljava/io/ByteArrayInputStream;->reset()V

    .line 1457
    invoke-static {p0, v4}, Landroid_src/mms/e/r;->a(Ljava/io/ByteArrayInputStream;I)[B

    move-result-object v0

    goto :goto_0

    .line 1460
    :cond_7
    const-string v0, "PduParser"

    const-string v1, "Corrupt content-type"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 1461
    sget-object v0, Landroid_src/mms/e/p;->a:[Ljava/lang/String;

    aget-object v0, v0, v4

    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    goto :goto_1

    .line 1474
    :cond_8
    if-gt v0, v5, :cond_9

    .line 1475
    invoke-static {p0, v4}, Landroid_src/mms/e/r;->a(Ljava/io/ByteArrayInputStream;I)[B

    move-result-object v0

    goto :goto_1

    .line 1477
    :cond_9
    sget-object v0, Landroid_src/mms/e/p;->a:[Ljava/lang/String;

    invoke-static {p0}, Landroid_src/mms/e/r;->g(Ljava/io/ByteArrayInputStream;)I

    move-result v1

    aget-object v0, v0, v1

    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    goto :goto_1
.end method

.method protected static b(Ljava/io/ByteArrayInputStream;)Landroid_src/mms/e/j;
    .locals 11

    .prologue
    const/4 v2, 0x0

    const/4 v5, 0x0

    .line 737
    if-nez p0, :cond_0

    move-object v0, v2

    .line 842
    :goto_0
    return-object v0

    .line 741
    :cond_0
    invoke-static {p0}, Landroid_src/mms/e/r;->c(Ljava/io/ByteArrayInputStream;)I

    move-result v6

    .line 742
    new-instance v3, Landroid_src/mms/e/j;

    invoke-direct {v3}, Landroid_src/mms/e/j;-><init>()V

    move v4, v5

    .line 744
    :goto_1
    if-ge v4, v6, :cond_e

    .line 745
    invoke-static {p0}, Landroid_src/mms/e/r;->c(Ljava/io/ByteArrayInputStream;)I

    move-result v7

    .line 746
    invoke-static {p0}, Landroid_src/mms/e/r;->c(Ljava/io/ByteArrayInputStream;)I

    move-result v8

    .line 747
    new-instance v1, Landroid_src/mms/e/s;

    invoke-direct {v1}, Landroid_src/mms/e/s;-><init>()V

    .line 748
    invoke-virtual {p0}, Ljava/io/ByteArrayInputStream;->available()I

    move-result v9

    .line 749
    if-gtz v9, :cond_1

    move-object v0, v2

    .line 751
    goto :goto_0

    .line 755
    :cond_1
    new-instance v10, Ljava/util/HashMap;

    invoke-direct {v10}, Ljava/util/HashMap;-><init>()V

    .line 756
    invoke-static {p0, v10}, Landroid_src/mms/e/r;->a(Ljava/io/ByteArrayInputStream;Ljava/util/HashMap;)[B

    move-result-object v0

    .line 757
    if-eqz v0, :cond_4

    .line 758
    invoke-virtual {v1, v0}, Landroid_src/mms/e/s;->e([B)V

    .line 764
    :goto_2
    const/16 v0, 0x97

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v10, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    check-cast v0, [B

    .line 765
    if-eqz v0, :cond_2

    .line 766
    invoke-virtual {v1, v0}, Landroid_src/mms/e/s;->g([B)V

    .line 770
    :cond_2
    const/16 v0, 0x81

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v10, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    .line 771
    if-eqz v0, :cond_3

    .line 772
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {v1, v0}, Landroid_src/mms/e/s;->a(I)V

    .line 776
    :cond_3
    invoke-virtual {p0}, Ljava/io/ByteArrayInputStream;->available()I

    move-result v0

    .line 777
    sub-int v0, v9, v0

    sub-int v0, v7, v0

    .line 778
    if-lez v0, :cond_5

    .line 779
    invoke-static {p0, v1, v0}, Landroid_src/mms/e/r;->a(Ljava/io/ByteArrayInputStream;Landroid_src/mms/e/s;I)Z

    move-result v0

    if-nez v0, :cond_6

    move-object v0, v2

    .line 781
    goto :goto_0

    .line 760
    :cond_4
    sget-object v0, Landroid_src/mms/e/p;->a:[Ljava/lang/String;

    aget-object v0, v0, v5

    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid_src/mms/e/s;->e([B)V

    goto :goto_2

    .line 783
    :cond_5
    if-gez v0, :cond_6

    move-object v0, v2

    .line 785
    goto :goto_0

    .line 791
    :cond_6
    invoke-virtual {v1}, Landroid_src/mms/e/s;->e()[B

    move-result-object v0

    if-nez v0, :cond_7

    invoke-virtual {v1}, Landroid_src/mms/e/s;->i()[B

    move-result-object v0

    if-nez v0, :cond_7

    invoke-virtual {v1}, Landroid_src/mms/e/s;->j()[B

    move-result-object v0

    if-nez v0, :cond_7

    invoke-virtual {v1}, Landroid_src/mms/e/s;->c()[B

    move-result-object v0

    if-nez v0, :cond_7

    .line 795
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v9

    invoke-static {v9, v10}, Ljava/lang/Long;->toOctalString(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid_src/mms/e/s;->c([B)V

    .line 800
    :cond_7
    if-lez v8, :cond_c

    .line 801
    new-array v0, v8, [B

    .line 802
    new-instance v7, Ljava/lang/String;

    invoke-virtual {v1}, Landroid_src/mms/e/s;->g()[B

    move-result-object v9

    invoke-direct {v7, v9}, Ljava/lang/String;-><init>([B)V

    .line 803
    invoke-virtual {p0, v0, v5, v8}, Ljava/io/ByteArrayInputStream;->read([BII)I

    .line 804
    const-string v8, "application/vnd.wap.multipart.alternative"

    invoke-virtual {v7, v8}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_8

    .line 806
    new-instance v1, Ljava/io/ByteArrayInputStream;

    invoke-direct {v1, v0}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    invoke-static {v1}, Landroid_src/mms/e/r;->b(Ljava/io/ByteArrayInputStream;)Landroid_src/mms/e/j;

    move-result-object v0

    .line 808
    invoke-virtual {v0, v5}, Landroid_src/mms/e/j;->a(I)Landroid_src/mms/e/s;

    move-result-object v0

    .line 833
    :goto_3
    invoke-static {v0}, Landroid_src/mms/e/r;->a(Landroid_src/mms/e/s;)I

    move-result v1

    if-nez v1, :cond_d

    .line 835
    invoke-virtual {v3, v5, v0}, Landroid_src/mms/e/j;->a(ILandroid_src/mms/e/s;)V

    .line 744
    :goto_4
    add-int/lit8 v0, v4, 0x1

    move v4, v0

    goto/16 :goto_1

    .line 811
    :cond_8
    invoke-virtual {v1}, Landroid_src/mms/e/s;->h()[B

    move-result-object v7

    .line 812
    if-eqz v7, :cond_9

    .line 813
    new-instance v8, Ljava/lang/String;

    invoke-direct {v8, v7}, Ljava/lang/String;-><init>([B)V

    .line 814
    const-string v7, "base64"

    invoke-virtual {v8, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_a

    .line 816
    invoke-static {v0}, Landroid_src/mms/e/b;->a([B)[B

    move-result-object v0

    .line 824
    :cond_9
    :goto_5
    if-nez v0, :cond_b

    .line 825
    const-string v0, "Decode part data error!"

    invoke-static {v0}, Landroid_src/mms/e/r;->a(Ljava/lang/String;)V

    move-object v0, v2

    .line 826
    goto/16 :goto_0

    .line 817
    :cond_a
    const-string v7, "quoted-printable"

    invoke-virtual {v8, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_9

    .line 819
    invoke-static {v0}, Landroid_src/mms/e/u;->a([B)[B

    move-result-object v0

    goto :goto_5

    .line 828
    :cond_b
    invoke-virtual {v1, v0}, Landroid_src/mms/e/s;->a([B)V

    :cond_c
    move-object v0, v1

    goto :goto_3

    .line 838
    :cond_d
    invoke-virtual {v3, v0}, Landroid_src/mms/e/j;->a(Landroid_src/mms/e/s;)Z

    goto :goto_4

    :cond_e
    move-object v0, v3

    .line 842
    goto/16 :goto_0
.end method

.method protected static b(I)Z
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 1075
    const/16 v1, 0x20

    if-lt p0, v1, :cond_0

    const/16 v1, 0x7e

    if-le p0, v1, :cond_1

    :cond_0
    const/16 v1, 0x80

    if-lt p0, v1, :cond_2

    const/16 v1, 0xff

    if-gt p0, v1, :cond_2

    .line 1086
    :cond_1
    :goto_0
    :pswitch_0
    return v0

    .line 1079
    :cond_2
    packed-switch p0, :pswitch_data_0

    .line 1086
    :pswitch_1
    const/4 v0, 0x0

    goto :goto_0

    .line 1079
    nop

    :pswitch_data_0
    .packed-switch 0x9
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method protected static b(Ljava/io/ByteArrayInputStream;I)[B
    .locals 4

    .prologue
    const/4 v3, -0x1

    .line 1091
    sget-boolean v0, Landroid_src/mms/e/r;->a:Z

    if-nez v0, :cond_0

    if-nez p0, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 1092
    :cond_0
    new-instance v1, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 1093
    invoke-virtual {p0}, Ljava/io/ByteArrayInputStream;->read()I

    move-result v0

    .line 1094
    sget-boolean v2, Landroid_src/mms/e/r;->a:Z

    if-nez v2, :cond_1

    if-ne v3, v0, :cond_1

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 1095
    :cond_1
    if-eq v3, v0, :cond_4

    if-eqz v0, :cond_4

    .line 1097
    const/4 v2, 0x2

    if-ne p1, v2, :cond_3

    .line 1098
    invoke-static {v0}, Landroid_src/mms/e/r;->a(I)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 1099
    invoke-virtual {v1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 1107
    :cond_2
    :goto_0
    invoke-virtual {p0}, Ljava/io/ByteArrayInputStream;->read()I

    move-result v0

    .line 1108
    sget-boolean v2, Landroid_src/mms/e/r;->a:Z

    if-nez v2, :cond_1

    if-ne v3, v0, :cond_1

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 1102
    :cond_3
    invoke-static {v0}, Landroid_src/mms/e/r;->b(I)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 1103
    invoke-virtual {v1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    goto :goto_0

    .line 1111
    :cond_4
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->size()I

    move-result v0

    if-lez v0, :cond_5

    .line 1112
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    .line 1115
    :goto_1
    return-object v0

    :cond_5
    const/4 v0, 0x0

    goto :goto_1
.end method

.method protected static c(Ljava/io/ByteArrayInputStream;)I
    .locals 4

    .prologue
    const/4 v3, -0x1

    .line 868
    sget-boolean v0, Landroid_src/mms/e/r;->a:Z

    if-nez v0, :cond_0

    if-nez p0, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 869
    :cond_0
    const/4 v1, 0x0

    .line 870
    invoke-virtual {p0}, Ljava/io/ByteArrayInputStream;->read()I

    move-result v0

    .line 871
    if-ne v0, v3, :cond_1

    .line 887
    :goto_0
    return v0

    .line 875
    :cond_1
    and-int/lit16 v2, v0, 0x80

    if-eqz v2, :cond_2

    .line 876
    shl-int/lit8 v1, v1, 0x7

    .line 877
    and-int/lit8 v0, v0, 0x7f

    or-int/2addr v1, v0

    .line 878
    invoke-virtual {p0}, Ljava/io/ByteArrayInputStream;->read()I

    move-result v0

    .line 879
    if-ne v0, v3, :cond_1

    goto :goto_0

    .line 884
    :cond_2
    shl-int/lit8 v1, v1, 0x7

    .line 885
    and-int/lit8 v0, v0, 0x7f

    or-int/2addr v0, v1

    .line 887
    goto :goto_0
.end method

.method protected static c(Ljava/io/ByteArrayInputStream;I)I
    .locals 2

    .prologue
    .line 1220
    sget-boolean v0, Landroid_src/mms/e/r;->a:Z

    if-nez v0, :cond_0

    if-nez p0, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 1221
    :cond_0
    new-array v0, p1, [B

    .line 1222
    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1, p1}, Ljava/io/ByteArrayInputStream;->read([BII)I

    move-result v0

    .line 1223
    if-ge v0, p1, :cond_1

    .line 1224
    const/4 v0, -0x1

    .line 1226
    :cond_1
    return v0
.end method

.method protected static d(Ljava/io/ByteArrayInputStream;)I
    .locals 2

    .prologue
    .line 905
    sget-boolean v0, Landroid_src/mms/e/r;->a:Z

    if-nez v0, :cond_0

    if-nez p0, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 906
    :cond_0
    invoke-virtual {p0}, Ljava/io/ByteArrayInputStream;->read()I

    move-result v0

    .line 907
    sget-boolean v1, Landroid_src/mms/e/r;->a:Z

    if-nez v1, :cond_1

    const/4 v1, -0x1

    if-ne v1, v0, :cond_1

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 908
    :cond_1
    and-int/lit16 v0, v0, 0xff

    .line 910
    const/16 v1, 0x1e

    if-gt v0, v1, :cond_2

    .line 913
    :goto_0
    return v0

    .line 912
    :cond_2
    const/16 v1, 0x1f

    if-ne v0, v1, :cond_3

    .line 913
    invoke-static {p0}, Landroid_src/mms/e/r;->c(Ljava/io/ByteArrayInputStream;)I

    move-result v0

    goto :goto_0

    .line 916
    :cond_3
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Value length > LENGTH_QUOTE!"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method protected static e(Ljava/io/ByteArrayInputStream;)Landroid_src/mms/e/e;
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 930
    sget-boolean v0, Landroid_src/mms/e/r;->a:Z

    if-nez v0, :cond_0

    if-nez p0, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 931
    :cond_0
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Ljava/io/ByteArrayInputStream;->mark(I)V

    .line 934
    invoke-virtual {p0}, Ljava/io/ByteArrayInputStream;->read()I

    move-result v0

    .line 935
    sget-boolean v2, Landroid_src/mms/e/r;->a:Z

    if-nez v2, :cond_1

    const/4 v2, -0x1

    if-ne v2, v0, :cond_1

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 936
    :cond_1
    and-int/lit16 v0, v0, 0xff

    .line 938
    invoke-virtual {p0}, Ljava/io/ByteArrayInputStream;->reset()V

    .line 939
    const/16 v2, 0x20

    if-ge v0, v2, :cond_3

    .line 940
    invoke-static {p0}, Landroid_src/mms/e/r;->d(Ljava/io/ByteArrayInputStream;)I

    .line 942
    invoke-static {p0}, Landroid_src/mms/e/r;->g(Ljava/io/ByteArrayInputStream;)I

    move-result v0

    .line 945
    :goto_0
    invoke-static {p0, v1}, Landroid_src/mms/e/r;->a(Ljava/io/ByteArrayInputStream;I)[B

    move-result-object v2

    .line 948
    if-eqz v0, :cond_2

    .line 949
    :try_start_0
    new-instance v1, Landroid_src/mms/e/e;

    invoke-direct {v1, v0, v2}, Landroid_src/mms/e/e;-><init>(I[B)V

    move-object v0, v1

    .line 957
    :goto_1
    return-object v0

    .line 951
    :cond_2
    new-instance v0, Landroid_src/mms/e/e;

    invoke-direct {v0, v2}, Landroid_src/mms/e/e;-><init>([B)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    .line 953
    :catch_0
    move-exception v0

    .line 954
    const/4 v0, 0x0

    goto :goto_1

    :cond_3
    move v0, v1

    goto :goto_0
.end method

.method protected static f(Ljava/io/ByteArrayInputStream;)I
    .locals 2

    .prologue
    .line 1125
    sget-boolean v0, Landroid_src/mms/e/r;->a:Z

    if-nez v0, :cond_0

    if-nez p0, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 1126
    :cond_0
    invoke-virtual {p0}, Ljava/io/ByteArrayInputStream;->read()I

    move-result v0

    .line 1127
    sget-boolean v1, Landroid_src/mms/e/r;->a:Z

    if-nez v1, :cond_1

    const/4 v1, -0x1

    if-ne v1, v0, :cond_1

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 1128
    :cond_1
    and-int/lit16 v0, v0, 0xff

    return v0
.end method

.method protected static g(Ljava/io/ByteArrayInputStream;)I
    .locals 2

    .prologue
    .line 1145
    sget-boolean v0, Landroid_src/mms/e/r;->a:Z

    if-nez v0, :cond_0

    if-nez p0, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 1146
    :cond_0
    invoke-virtual {p0}, Ljava/io/ByteArrayInputStream;->read()I

    move-result v0

    .line 1147
    sget-boolean v1, Landroid_src/mms/e/r;->a:Z

    if-nez v1, :cond_1

    const/4 v1, -0x1

    if-ne v1, v0, :cond_1

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 1148
    :cond_1
    and-int/lit8 v0, v0, 0x7f

    return v0
.end method

.method protected static h(Ljava/io/ByteArrayInputStream;)J
    .locals 8

    .prologue
    const/16 v7, 0x8

    const/4 v6, -0x1

    .line 1168
    sget-boolean v0, Landroid_src/mms/e/r;->a:Z

    if-nez v0, :cond_0

    if-nez p0, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 1169
    :cond_0
    invoke-virtual {p0}, Ljava/io/ByteArrayInputStream;->read()I

    move-result v0

    .line 1170
    sget-boolean v1, Landroid_src/mms/e/r;->a:Z

    if-nez v1, :cond_1

    if-ne v6, v0, :cond_1

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 1171
    :cond_1
    and-int/lit16 v3, v0, 0xff

    .line 1173
    if-le v3, v7, :cond_2

    .line 1174
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Octet count greater than 8 and I can\'t represent that!"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1177
    :cond_2
    const-wide/16 v1, 0x0

    .line 1179
    const/4 v0, 0x0

    :goto_0
    if-ge v0, v3, :cond_4

    .line 1180
    invoke-virtual {p0}, Ljava/io/ByteArrayInputStream;->read()I

    move-result v4

    .line 1181
    sget-boolean v5, Landroid_src/mms/e/r;->a:Z

    if-nez v5, :cond_3

    if-ne v6, v4, :cond_3

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 1182
    :cond_3
    shl-long/2addr v1, v7

    .line 1183
    and-int/lit16 v4, v4, 0xff

    int-to-long v4, v4

    add-long/2addr v1, v4

    .line 1179
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 1186
    :cond_4
    return-wide v1
.end method

.method protected static i(Ljava/io/ByteArrayInputStream;)J
    .locals 2

    .prologue
    .line 1200
    sget-boolean v0, Landroid_src/mms/e/r;->a:Z

    if-nez v0, :cond_0

    if-nez p0, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 1201
    :cond_0
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Ljava/io/ByteArrayInputStream;->mark(I)V

    .line 1202
    invoke-virtual {p0}, Ljava/io/ByteArrayInputStream;->read()I

    move-result v0

    .line 1203
    sget-boolean v1, Landroid_src/mms/e/r;->a:Z

    if-nez v1, :cond_1

    const/4 v1, -0x1

    if-ne v1, v0, :cond_1

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 1204
    :cond_1
    invoke-virtual {p0}, Ljava/io/ByteArrayInputStream;->reset()V

    .line 1205
    const/16 v1, 0x7f

    if-le v0, v1, :cond_2

    .line 1206
    invoke-static {p0}, Landroid_src/mms/e/r;->g(Ljava/io/ByteArrayInputStream;)I

    move-result v0

    int-to-long v0, v0

    .line 1208
    :goto_0
    return-wide v0

    :cond_2
    invoke-static {p0}, Landroid_src/mms/e/r;->h(Ljava/io/ByteArrayInputStream;)J

    move-result-wide v0

    goto :goto_0
.end method


# virtual methods
.method public a()Landroid_src/mms/e/f;
    .locals 5

    .prologue
    const/4 v4, 0x0

    const/4 v0, 0x0

    .line 106
    iget-object v1, p0, Landroid_src/mms/e/r;->b:Ljava/io/ByteArrayInputStream;

    if-nez v1, :cond_1

    .line 194
    :cond_0
    :goto_0
    return-object v0

    .line 111
    :cond_1
    iget-object v1, p0, Landroid_src/mms/e/r;->b:Ljava/io/ByteArrayInputStream;

    invoke-virtual {p0, v1}, Landroid_src/mms/e/r;->a(Ljava/io/ByteArrayInputStream;)Landroid_src/mms/e/q;

    move-result-object v1

    iput-object v1, p0, Landroid_src/mms/e/r;->c:Landroid_src/mms/e/q;

    .line 112
    iget-object v1, p0, Landroid_src/mms/e/r;->c:Landroid_src/mms/e/q;

    if-eqz v1, :cond_0

    .line 118
    iget-object v1, p0, Landroid_src/mms/e/r;->c:Landroid_src/mms/e/q;

    const/16 v2, 0x8c

    invoke-virtual {v1, v2}, Landroid_src/mms/e/q;->a(I)I

    move-result v1

    .line 121
    iget-object v2, p0, Landroid_src/mms/e/r;->c:Landroid_src/mms/e/q;

    invoke-static {v2}, Landroid_src/mms/e/r;->a(Landroid_src/mms/e/q;)Z

    move-result v2

    if-nez v2, :cond_2

    .line 122
    const-string v1, "check mandatory headers failed!"

    invoke-static {v1}, Landroid_src/mms/e/r;->a(Ljava/lang/String;)V

    goto :goto_0

    .line 126
    :cond_2
    const/16 v2, 0x80

    if-eq v2, v1, :cond_3

    const/16 v2, 0x84

    if-ne v2, v1, :cond_4

    .line 129
    :cond_3
    iget-object v2, p0, Landroid_src/mms/e/r;->b:Ljava/io/ByteArrayInputStream;

    invoke-static {v2}, Landroid_src/mms/e/r;->b(Ljava/io/ByteArrayInputStream;)Landroid_src/mms/e/j;

    move-result-object v2

    iput-object v2, p0, Landroid_src/mms/e/r;->d:Landroid_src/mms/e/j;

    .line 130
    iget-object v2, p0, Landroid_src/mms/e/r;->d:Landroid_src/mms/e/j;

    if-eqz v2, :cond_0

    .line 136
    :cond_4
    packed-switch v1, :pswitch_data_0

    .line 193
    const-string v1, "Parser doesn\'t support this message type in this version!"

    invoke-static {v1}, Landroid_src/mms/e/r;->a(Ljava/lang/String;)V

    goto :goto_0

    .line 138
    :pswitch_0
    new-instance v0, Landroid_src/mms/e/z;

    iget-object v1, p0, Landroid_src/mms/e/r;->c:Landroid_src/mms/e/q;

    iget-object v2, p0, Landroid_src/mms/e/r;->d:Landroid_src/mms/e/j;

    invoke-direct {v0, v1, v2}, Landroid_src/mms/e/z;-><init>(Landroid_src/mms/e/q;Landroid_src/mms/e/j;)V

    goto :goto_0

    .line 141
    :pswitch_1
    new-instance v0, Landroid_src/mms/e/y;

    iget-object v1, p0, Landroid_src/mms/e/r;->c:Landroid_src/mms/e/q;

    invoke-direct {v0, v1}, Landroid_src/mms/e/y;-><init>(Landroid_src/mms/e/q;)V

    goto :goto_0

    .line 144
    :pswitch_2
    new-instance v0, Landroid_src/mms/e/h;

    iget-object v1, p0, Landroid_src/mms/e/r;->c:Landroid_src/mms/e/q;

    invoke-direct {v0, v1}, Landroid_src/mms/e/h;-><init>(Landroid_src/mms/e/q;)V

    goto :goto_0

    .line 148
    :pswitch_3
    new-instance v0, Landroid_src/mms/e/i;

    iget-object v1, p0, Landroid_src/mms/e/r;->c:Landroid_src/mms/e/q;

    invoke-direct {v0, v1}, Landroid_src/mms/e/i;-><init>(Landroid_src/mms/e/q;)V

    goto :goto_0

    .line 152
    :pswitch_4
    new-instance v1, Landroid_src/mms/e/x;

    iget-object v2, p0, Landroid_src/mms/e/r;->c:Landroid_src/mms/e/q;

    iget-object v3, p0, Landroid_src/mms/e/r;->d:Landroid_src/mms/e/j;

    invoke-direct {v1, v2, v3}, Landroid_src/mms/e/x;-><init>(Landroid_src/mms/e/q;Landroid_src/mms/e/j;)V

    .line 155
    invoke-virtual {v1}, Landroid_src/mms/e/x;->b()[B

    move-result-object v2

    .line 156
    if-eqz v2, :cond_0

    .line 159
    new-instance v3, Ljava/lang/String;

    invoke-direct {v3, v2}, Ljava/lang/String;-><init>([B)V

    .line 160
    const-string v2, "application/vnd.wap.multipart.mixed"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    const-string v2, "application/vnd.wap.multipart.related"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    const-string v2, "application/vnd.wap.multipart.alternative"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    :cond_5
    move-object v0, v1

    .line 166
    goto/16 :goto_0

    .line 167
    :cond_6
    const-string v2, "application/vnd.wap.multipart.alternative"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 170
    iget-object v0, p0, Landroid_src/mms/e/r;->d:Landroid_src/mms/e/j;

    invoke-virtual {v0, v4}, Landroid_src/mms/e/j;->a(I)Landroid_src/mms/e/s;

    move-result-object v0

    .line 171
    iget-object v2, p0, Landroid_src/mms/e/r;->d:Landroid_src/mms/e/j;

    invoke-virtual {v2}, Landroid_src/mms/e/j;->a()V

    .line 172
    iget-object v2, p0, Landroid_src/mms/e/r;->d:Landroid_src/mms/e/j;

    invoke-virtual {v2, v4, v0}, Landroid_src/mms/e/j;->a(ILandroid_src/mms/e/s;)V

    move-object v0, v1

    .line 173
    goto/16 :goto_0

    .line 177
    :pswitch_5
    new-instance v0, Landroid_src/mms/e/d;

    iget-object v1, p0, Landroid_src/mms/e/r;->c:Landroid_src/mms/e/q;

    invoke-direct {v0, v1}, Landroid_src/mms/e/d;-><init>(Landroid_src/mms/e/q;)V

    goto/16 :goto_0

    .line 181
    :pswitch_6
    new-instance v0, Landroid_src/mms/e/a;

    iget-object v1, p0, Landroid_src/mms/e/r;->c:Landroid_src/mms/e/q;

    invoke-direct {v0, v1}, Landroid_src/mms/e/a;-><init>(Landroid_src/mms/e/q;)V

    goto/16 :goto_0

    .line 185
    :pswitch_7
    new-instance v0, Landroid_src/mms/e/v;

    iget-object v1, p0, Landroid_src/mms/e/r;->c:Landroid_src/mms/e/q;

    invoke-direct {v0, v1}, Landroid_src/mms/e/v;-><init>(Landroid_src/mms/e/q;)V

    goto/16 :goto_0

    .line 189
    :pswitch_8
    new-instance v0, Landroid_src/mms/e/w;

    iget-object v1, p0, Landroid_src/mms/e/r;->c:Landroid_src/mms/e/q;

    invoke-direct {v0, v1}, Landroid_src/mms/e/w;-><init>(Landroid_src/mms/e/q;)V

    goto/16 :goto_0

    .line 136
    :pswitch_data_0
    .packed-switch 0x80
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_6
        :pswitch_5
        :pswitch_8
        :pswitch_7
    .end packed-switch
.end method

.method protected a(Ljava/io/ByteArrayInputStream;)Landroid_src/mms/e/q;
    .locals 13

    .prologue
    const/16 v12, 0x80

    const/4 v6, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 205
    if-nez p1, :cond_0

    move-object v0, v2

    .line 727
    :goto_0
    return-object v0

    .line 210
    :cond_0
    new-instance v3, Landroid_src/mms/e/q;

    invoke-direct {v3}, Landroid_src/mms/e/q;-><init>()V

    move v0, v6

    .line 212
    :cond_1
    :goto_1
    if-eqz v0, :cond_e

    invoke-virtual {p1}, Ljava/io/ByteArrayInputStream;->available()I

    move-result v4

    if-lez v4, :cond_e

    .line 213
    invoke-virtual {p1, v6}, Ljava/io/ByteArrayInputStream;->mark(I)V

    .line 214
    invoke-static {p1}, Landroid_src/mms/e/r;->f(Ljava/io/ByteArrayInputStream;)I

    move-result v7

    .line 216
    const/16 v4, 0x20

    if-lt v7, v4, :cond_2

    const/16 v4, 0x7f

    if-gt v7, v4, :cond_2

    .line 217
    invoke-virtual {p1}, Ljava/io/ByteArrayInputStream;->reset()V

    .line 218
    invoke-static {p1, v1}, Landroid_src/mms/e/r;->a(Ljava/io/ByteArrayInputStream;I)[B

    goto :goto_1

    .line 225
    :cond_2
    packed-switch v7, :pswitch_data_0

    .line 722
    :pswitch_0
    const-string v4, "Unknown header"

    invoke-static {v4}, Landroid_src/mms/e/r;->a(Ljava/lang/String;)V

    goto :goto_1

    .line 228
    :pswitch_1
    invoke-static {p1}, Landroid_src/mms/e/r;->f(Ljava/io/ByteArrayInputStream;)I

    move-result v4

    .line 229
    packed-switch v4, :pswitch_data_1

    .line 249
    :try_start_0
    invoke-virtual {v3, v4, v7}, Landroid_src/mms/e/q;->a(II)V
    :try_end_0
    .catch Landroid_src/mms/b; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_1

    .line 250
    :catch_0
    move-exception v0

    .line 251
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Set invalid Octet value: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " into the header filed: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid_src/mms/e/r;->a(Ljava/lang/String;)V

    move-object v0, v2

    .line 253
    goto :goto_0

    :pswitch_2
    move-object v0, v2

    .line 246
    goto :goto_0

    .line 254
    :catch_1
    move-exception v0

    .line 255
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "is not Octet header field!"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid_src/mms/e/r;->a(Ljava/lang/String;)V

    move-object v0, v2

    .line 256
    goto :goto_0

    .line 289
    :pswitch_3
    invoke-static {p1}, Landroid_src/mms/e/r;->f(Ljava/io/ByteArrayInputStream;)I

    move-result v4

    .line 292
    :try_start_1
    invoke-virtual {v3, v4, v7}, Landroid_src/mms/e/q;->a(II)V
    :try_end_1
    .catch Landroid_src/mms/b; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_3

    goto :goto_1

    .line 293
    :catch_2
    move-exception v0

    .line 294
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Set invalid Octet value: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " into the header filed: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid_src/mms/e/r;->a(Ljava/lang/String;)V

    move-object v0, v2

    .line 296
    goto/16 :goto_0

    .line 297
    :catch_3
    move-exception v0

    .line 298
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "is not Octet header field!"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid_src/mms/e/r;->a(Ljava/lang/String;)V

    move-object v0, v2

    .line 299
    goto/16 :goto_0

    .line 310
    :pswitch_4
    :try_start_2
    invoke-static {p1}, Landroid_src/mms/e/r;->h(Ljava/io/ByteArrayInputStream;)J

    move-result-wide v4

    .line 311
    invoke-virtual {v3, v4, v5, v7}, Landroid_src/mms/e/q;->a(JI)V
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_4

    goto/16 :goto_1

    .line 312
    :catch_4
    move-exception v0

    .line 313
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "is not Long-Integer header field!"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid_src/mms/e/r;->a(Ljava/lang/String;)V

    move-object v0, v2

    .line 314
    goto/16 :goto_0

    .line 325
    :pswitch_5
    :try_start_3
    invoke-static {p1}, Landroid_src/mms/e/r;->i(Ljava/io/ByteArrayInputStream;)J

    move-result-wide v4

    .line 326
    invoke-virtual {v3, v4, v5, v7}, Landroid_src/mms/e/q;->a(JI)V
    :try_end_3
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_5

    goto/16 :goto_1

    .line 327
    :catch_5
    move-exception v0

    .line 328
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "is not Long-Integer header field!"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid_src/mms/e/r;->a(Ljava/lang/String;)V

    move-object v0, v2

    .line 329
    goto/16 :goto_0

    .line 355
    :pswitch_6
    invoke-static {p1, v1}, Landroid_src/mms/e/r;->a(Ljava/io/ByteArrayInputStream;I)[B

    move-result-object v4

    .line 356
    if-eqz v4, :cond_1

    .line 358
    :try_start_4
    invoke-virtual {v3, v4, v7}, Landroid_src/mms/e/q;->a([BI)V
    :try_end_4
    .catch Ljava/lang/NullPointerException; {:try_start_4 .. :try_end_4} :catch_6
    .catch Ljava/lang/RuntimeException; {:try_start_4 .. :try_end_4} :catch_7

    goto/16 :goto_1

    .line 359
    :catch_6
    move-exception v4

    .line 360
    const-string v4, "null pointer error!"

    invoke-static {v4}, Landroid_src/mms/e/r;->a(Ljava/lang/String;)V

    goto/16 :goto_1

    .line 361
    :catch_7
    move-exception v0

    .line 362
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "is not Text-String header field!"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid_src/mms/e/r;->a(Ljava/lang/String;)V

    move-object v0, v2

    .line 363
    goto/16 :goto_0

    .line 379
    :pswitch_7
    invoke-static {p1}, Landroid_src/mms/e/r;->e(Ljava/io/ByteArrayInputStream;)Landroid_src/mms/e/e;

    move-result-object v4

    .line 381
    if-eqz v4, :cond_1

    .line 383
    :try_start_5
    invoke-virtual {v3, v4, v7}, Landroid_src/mms/e/q;->a(Landroid_src/mms/e/e;I)V
    :try_end_5
    .catch Ljava/lang/NullPointerException; {:try_start_5 .. :try_end_5} :catch_8
    .catch Ljava/lang/RuntimeException; {:try_start_5 .. :try_end_5} :catch_9

    goto/16 :goto_1

    .line 384
    :catch_8
    move-exception v4

    .line 385
    const-string v4, "null pointer error!"

    invoke-static {v4}, Landroid_src/mms/e/r;->a(Ljava/lang/String;)V

    goto/16 :goto_1

    .line 386
    :catch_9
    move-exception v0

    .line 387
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "is not Encoded-String-Value header field!"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid_src/mms/e/r;->a(Ljava/lang/String;)V

    move-object v0, v2

    .line 388
    goto/16 :goto_0

    .line 399
    :pswitch_8
    invoke-static {p1}, Landroid_src/mms/e/r;->e(Ljava/io/ByteArrayInputStream;)Landroid_src/mms/e/e;

    move-result-object v5

    .line 401
    if-eqz v5, :cond_1

    .line 402
    invoke-virtual {v5}, Landroid_src/mms/e/e;->b()[B

    move-result-object v8

    .line 403
    if-eqz v8, :cond_4

    .line 404
    new-instance v4, Ljava/lang/String;

    invoke-direct {v4, v8}, Ljava/lang/String;-><init>([B)V

    .line 405
    const-string v8, "/"

    invoke-virtual {v4, v8}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v8

    .line 406
    if-lez v8, :cond_3

    .line 407
    invoke-virtual {v4, v1, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    .line 410
    :cond_3
    :try_start_6
    invoke-virtual {v4}, Ljava/lang/String;->getBytes()[B

    move-result-object v4

    invoke-virtual {v5, v4}, Landroid_src/mms/e/e;->a([B)V
    :try_end_6
    .catch Ljava/lang/NullPointerException; {:try_start_6 .. :try_end_6} :catch_b

    .line 418
    :cond_4
    :try_start_7
    invoke-virtual {v3, v5, v7}, Landroid_src/mms/e/q;->b(Landroid_src/mms/e/e;I)V
    :try_end_7
    .catch Ljava/lang/NullPointerException; {:try_start_7 .. :try_end_7} :catch_a
    .catch Ljava/lang/RuntimeException; {:try_start_7 .. :try_end_7} :catch_c

    goto/16 :goto_1

    .line 419
    :catch_a
    move-exception v4

    .line 420
    const-string v4, "null pointer error!"

    invoke-static {v4}, Landroid_src/mms/e/r;->a(Ljava/lang/String;)V

    goto/16 :goto_1

    .line 411
    :catch_b
    move-exception v0

    .line 412
    const-string v0, "null pointer error!"

    invoke-static {v0}, Landroid_src/mms/e/r;->a(Ljava/lang/String;)V

    move-object v0, v2

    .line 413
    goto/16 :goto_0

    .line 421
    :catch_c
    move-exception v0

    .line 422
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "is not Encoded-String-Value header field!"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid_src/mms/e/r;->a(Ljava/lang/String;)V

    move-object v0, v2

    .line 423
    goto/16 :goto_0

    .line 436
    :pswitch_9
    invoke-static {p1}, Landroid_src/mms/e/r;->d(Ljava/io/ByteArrayInputStream;)I

    .line 439
    invoke-static {p1}, Landroid_src/mms/e/r;->f(Ljava/io/ByteArrayInputStream;)I

    move-result v8

    .line 444
    :try_start_8
    invoke-static {p1}, Landroid_src/mms/e/r;->h(Ljava/io/ByteArrayInputStream;)J
    :try_end_8
    .catch Ljava/lang/RuntimeException; {:try_start_8 .. :try_end_8} :catch_e

    move-result-wide v4

    .line 449
    const/16 v9, 0x81

    if-ne v9, v8, :cond_5

    .line 452
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    const-wide/16 v10, 0x3e8

    div-long/2addr v8, v10

    add-long/2addr v4, v8

    .line 456
    :cond_5
    :try_start_9
    invoke-virtual {v3, v4, v5, v7}, Landroid_src/mms/e/q;->a(JI)V
    :try_end_9
    .catch Ljava/lang/RuntimeException; {:try_start_9 .. :try_end_9} :catch_d

    goto/16 :goto_1

    .line 457
    :catch_d
    move-exception v0

    .line 458
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "is not Long-Integer header field!"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid_src/mms/e/r;->a(Ljava/lang/String;)V

    move-object v0, v2

    .line 459
    goto/16 :goto_0

    .line 445
    :catch_e
    move-exception v0

    .line 446
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "is not Long-Integer header field!"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid_src/mms/e/r;->a(Ljava/lang/String;)V

    move-object v0, v2

    .line 447
    goto/16 :goto_0

    .line 470
    :pswitch_a
    invoke-static {p1}, Landroid_src/mms/e/r;->d(Ljava/io/ByteArrayInputStream;)I

    .line 473
    invoke-static {p1}, Landroid_src/mms/e/r;->f(Ljava/io/ByteArrayInputStream;)I

    move-result v4

    .line 476
    if-ne v12, v4, :cond_8

    .line 478
    invoke-static {p1}, Landroid_src/mms/e/r;->e(Ljava/io/ByteArrayInputStream;)Landroid_src/mms/e/e;

    move-result-object v4

    .line 479
    if-eqz v4, :cond_7

    .line 480
    invoke-virtual {v4}, Landroid_src/mms/e/e;->b()[B

    move-result-object v8

    .line 481
    if-eqz v8, :cond_7

    .line 482
    new-instance v5, Ljava/lang/String;

    invoke-direct {v5, v8}, Ljava/lang/String;-><init>([B)V

    .line 483
    const-string v8, "/"

    invoke-virtual {v5, v8}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v8

    .line 484
    if-lez v8, :cond_6

    .line 485
    invoke-virtual {v5, v1, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v5

    .line 488
    :cond_6
    :try_start_a
    invoke-virtual {v5}, Ljava/lang/String;->getBytes()[B

    move-result-object v5

    invoke-virtual {v4, v5}, Landroid_src/mms/e/e;->a([B)V
    :try_end_a
    .catch Ljava/lang/NullPointerException; {:try_start_a .. :try_end_a} :catch_10

    .line 506
    :cond_7
    :goto_2
    const/16 v5, 0x89

    :try_start_b
    invoke-virtual {v3, v4, v5}, Landroid_src/mms/e/q;->a(Landroid_src/mms/e/e;I)V
    :try_end_b
    .catch Ljava/lang/NullPointerException; {:try_start_b .. :try_end_b} :catch_f
    .catch Ljava/lang/RuntimeException; {:try_start_b .. :try_end_b} :catch_12

    goto/16 :goto_1

    .line 507
    :catch_f
    move-exception v4

    .line 508
    const-string v4, "null pointer error!"

    invoke-static {v4}, Landroid_src/mms/e/r;->a(Ljava/lang/String;)V

    goto/16 :goto_1

    .line 489
    :catch_10
    move-exception v0

    .line 490
    const-string v0, "null pointer error!"

    invoke-static {v0}, Landroid_src/mms/e/r;->a(Ljava/lang/String;)V

    move-object v0, v2

    .line 491
    goto/16 :goto_0

    .line 497
    :cond_8
    :try_start_c
    new-instance v4, Landroid_src/mms/e/e;

    const-string v5, "insert-address-token"

    invoke-virtual {v5}, Ljava/lang/String;->getBytes()[B

    move-result-object v5

    invoke-direct {v4, v5}, Landroid_src/mms/e/e;-><init>([B)V
    :try_end_c
    .catch Ljava/lang/NullPointerException; {:try_start_c .. :try_end_c} :catch_11

    goto :goto_2

    .line 499
    :catch_11
    move-exception v0

    .line 500
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "is not Encoded-String-Value header field!"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid_src/mms/e/r;->a(Ljava/lang/String;)V

    move-object v0, v2

    .line 501
    goto/16 :goto_0

    .line 509
    :catch_12
    move-exception v0

    .line 510
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "is not Encoded-String-Value header field!"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid_src/mms/e/r;->a(Ljava/lang/String;)V

    move-object v0, v2

    .line 511
    goto/16 :goto_0

    .line 518
    :pswitch_b
    invoke-virtual {p1, v6}, Ljava/io/ByteArrayInputStream;->mark(I)V

    .line 519
    invoke-static {p1}, Landroid_src/mms/e/r;->f(Ljava/io/ByteArrayInputStream;)I

    move-result v4

    .line 521
    if-lt v4, v12, :cond_c

    .line 524
    if-ne v12, v4, :cond_9

    .line 525
    :try_start_d
    const-string v4, "personal"

    invoke-virtual {v4}, Ljava/lang/String;->getBytes()[B

    move-result-object v4

    const/16 v5, 0x8a

    invoke-virtual {v3, v4, v5}, Landroid_src/mms/e/q;->a([BI)V
    :try_end_d
    .catch Ljava/lang/NullPointerException; {:try_start_d .. :try_end_d} :catch_13
    .catch Ljava/lang/RuntimeException; {:try_start_d .. :try_end_d} :catch_14

    goto/16 :goto_1

    .line 541
    :catch_13
    move-exception v4

    .line 542
    const-string v4, "null pointer error!"

    invoke-static {v4}, Landroid_src/mms/e/r;->a(Ljava/lang/String;)V

    goto/16 :goto_1

    .line 528
    :cond_9
    const/16 v5, 0x81

    if-ne v5, v4, :cond_a

    .line 529
    :try_start_e
    const-string v4, "advertisement"

    invoke-virtual {v4}, Ljava/lang/String;->getBytes()[B

    move-result-object v4

    const/16 v5, 0x8a

    invoke-virtual {v3, v4, v5}, Landroid_src/mms/e/q;->a([BI)V
    :try_end_e
    .catch Ljava/lang/NullPointerException; {:try_start_e .. :try_end_e} :catch_13
    .catch Ljava/lang/RuntimeException; {:try_start_e .. :try_end_e} :catch_14

    goto/16 :goto_1

    .line 543
    :catch_14
    move-exception v0

    .line 544
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "is not Text-String header field!"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid_src/mms/e/r;->a(Ljava/lang/String;)V

    move-object v0, v2

    .line 545
    goto/16 :goto_0

    .line 532
    :cond_a
    const/16 v5, 0x82

    if-ne v5, v4, :cond_b

    .line 533
    :try_start_f
    const-string v4, "informational"

    invoke-virtual {v4}, Ljava/lang/String;->getBytes()[B

    move-result-object v4

    const/16 v5, 0x8a

    invoke-virtual {v3, v4, v5}, Landroid_src/mms/e/q;->a([BI)V

    goto/16 :goto_1

    .line 536
    :cond_b
    const/16 v5, 0x83

    if-ne v5, v4, :cond_1

    .line 537
    const-string v4, "auto"

    invoke-virtual {v4}, Ljava/lang/String;->getBytes()[B

    move-result-object v4

    const/16 v5, 0x8a

    invoke-virtual {v3, v4, v5}, Landroid_src/mms/e/q;->a([BI)V
    :try_end_f
    .catch Ljava/lang/NullPointerException; {:try_start_f .. :try_end_f} :catch_13
    .catch Ljava/lang/RuntimeException; {:try_start_f .. :try_end_f} :catch_14

    goto/16 :goto_1

    .line 549
    :cond_c
    invoke-virtual {p1}, Ljava/io/ByteArrayInputStream;->reset()V

    .line 550
    invoke-static {p1, v1}, Landroid_src/mms/e/r;->a(Ljava/io/ByteArrayInputStream;I)[B

    move-result-object v4

    .line 551
    if-eqz v4, :cond_1

    .line 553
    const/16 v5, 0x8a

    :try_start_10
    invoke-virtual {v3, v4, v5}, Landroid_src/mms/e/q;->a([BI)V
    :try_end_10
    .catch Ljava/lang/NullPointerException; {:try_start_10 .. :try_end_10} :catch_15
    .catch Ljava/lang/RuntimeException; {:try_start_10 .. :try_end_10} :catch_16

    goto/16 :goto_1

    .line 554
    :catch_15
    move-exception v4

    .line 555
    const-string v4, "null pointer error!"

    invoke-static {v4}, Landroid_src/mms/e/r;->a(Ljava/lang/String;)V

    goto/16 :goto_1

    .line 556
    :catch_16
    move-exception v0

    .line 557
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "is not Text-String header field!"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid_src/mms/e/r;->a(Ljava/lang/String;)V

    move-object v0, v2

    .line 558
    goto/16 :goto_0

    .line 566
    :pswitch_c
    invoke-static {p1}, Landroid_src/mms/e/r;->g(Ljava/io/ByteArrayInputStream;)I

    move-result v4

    .line 569
    const/16 v5, 0x8d

    :try_start_11
    invoke-virtual {v3, v4, v5}, Landroid_src/mms/e/q;->a(II)V
    :try_end_11
    .catch Landroid_src/mms/b; {:try_start_11 .. :try_end_11} :catch_17
    .catch Ljava/lang/RuntimeException; {:try_start_11 .. :try_end_11} :catch_18

    goto/16 :goto_1

    .line 570
    :catch_17
    move-exception v0

    .line 571
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Set invalid Octet value: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " into the header filed: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid_src/mms/e/r;->a(Ljava/lang/String;)V

    move-object v0, v2

    .line 573
    goto/16 :goto_0

    .line 574
    :catch_18
    move-exception v0

    .line 575
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "is not Octet header field!"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid_src/mms/e/r;->a(Ljava/lang/String;)V

    move-object v0, v2

    .line 576
    goto/16 :goto_0

    .line 585
    :pswitch_d
    invoke-static {p1}, Landroid_src/mms/e/r;->d(Ljava/io/ByteArrayInputStream;)I

    .line 589
    :try_start_12
    invoke-static {p1}, Landroid_src/mms/e/r;->i(Ljava/io/ByteArrayInputStream;)J
    :try_end_12
    .catch Ljava/lang/RuntimeException; {:try_start_12 .. :try_end_12} :catch_1a

    .line 596
    invoke-static {p1}, Landroid_src/mms/e/r;->e(Ljava/io/ByteArrayInputStream;)Landroid_src/mms/e/e;

    move-result-object v4

    .line 598
    if-eqz v4, :cond_1

    .line 600
    const/16 v5, 0xa0

    :try_start_13
    invoke-virtual {v3, v4, v5}, Landroid_src/mms/e/q;->a(Landroid_src/mms/e/e;I)V
    :try_end_13
    .catch Ljava/lang/NullPointerException; {:try_start_13 .. :try_end_13} :catch_19
    .catch Ljava/lang/RuntimeException; {:try_start_13 .. :try_end_13} :catch_1b

    goto/16 :goto_1

    .line 602
    :catch_19
    move-exception v4

    .line 603
    const-string v4, "null pointer error!"

    invoke-static {v4}, Landroid_src/mms/e/r;->a(Ljava/lang/String;)V

    goto/16 :goto_1

    .line 590
    :catch_1a
    move-exception v0

    .line 591
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " is not Integer-Value"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid_src/mms/e/r;->a(Ljava/lang/String;)V

    move-object v0, v2

    .line 592
    goto/16 :goto_0

    .line 604
    :catch_1b
    move-exception v0

    .line 605
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "is not Encoded-String-Value header field!"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid_src/mms/e/r;->a(Ljava/lang/String;)V

    move-object v0, v2

    .line 606
    goto/16 :goto_0

    .line 616
    :pswitch_e
    invoke-static {p1}, Landroid_src/mms/e/r;->d(Ljava/io/ByteArrayInputStream;)I

    .line 620
    :try_start_14
    invoke-static {p1}, Landroid_src/mms/e/r;->i(Ljava/io/ByteArrayInputStream;)J
    :try_end_14
    .catch Ljava/lang/RuntimeException; {:try_start_14 .. :try_end_14} :catch_1d

    .line 628
    :try_start_15
    invoke-static {p1}, Landroid_src/mms/e/r;->h(Ljava/io/ByteArrayInputStream;)J

    move-result-wide v4

    .line 629
    const/16 v8, 0xa1

    invoke-virtual {v3, v4, v5, v8}, Landroid_src/mms/e/q;->a(JI)V
    :try_end_15
    .catch Ljava/lang/RuntimeException; {:try_start_15 .. :try_end_15} :catch_1c

    goto/16 :goto_1

    .line 631
    :catch_1c
    move-exception v0

    .line 632
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "is not Long-Integer header field!"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid_src/mms/e/r;->a(Ljava/lang/String;)V

    move-object v0, v2

    .line 633
    goto/16 :goto_0

    .line 621
    :catch_1d
    move-exception v0

    .line 622
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " is not Integer-Value"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid_src/mms/e/r;->a(Ljava/lang/String;)V

    move-object v0, v2

    .line 623
    goto/16 :goto_0

    .line 646
    :pswitch_f
    invoke-static {p1}, Landroid_src/mms/e/r;->d(Ljava/io/ByteArrayInputStream;)I

    .line 649
    invoke-static {p1}, Landroid_src/mms/e/r;->f(Ljava/io/ByteArrayInputStream;)I

    .line 652
    invoke-static {p1}, Landroid_src/mms/e/r;->e(Ljava/io/ByteArrayInputStream;)Landroid_src/mms/e/e;

    goto/16 :goto_1

    .line 665
    :pswitch_10
    invoke-static {p1}, Landroid_src/mms/e/r;->d(Ljava/io/ByteArrayInputStream;)I

    .line 668
    invoke-static {p1}, Landroid_src/mms/e/r;->f(Ljava/io/ByteArrayInputStream;)I

    .line 672
    :try_start_16
    invoke-static {p1}, Landroid_src/mms/e/r;->i(Ljava/io/ByteArrayInputStream;)J
    :try_end_16
    .catch Ljava/lang/RuntimeException; {:try_start_16 .. :try_end_16} :catch_1e

    goto/16 :goto_1

    .line 673
    :catch_1e
    move-exception v0

    .line 674
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " is not Integer-Value"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid_src/mms/e/r;->a(Ljava/lang/String;)V

    move-object v0, v2

    .line 675
    goto/16 :goto_0

    .line 684
    :pswitch_11
    invoke-static {p1, v2}, Landroid_src/mms/e/r;->a(Ljava/io/ByteArrayInputStream;Ljava/util/HashMap;)[B

    goto/16 :goto_1

    .line 692
    :pswitch_12
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 694
    invoke-static {p1, v4}, Landroid_src/mms/e/r;->a(Ljava/io/ByteArrayInputStream;Ljava/util/HashMap;)[B

    move-result-object v0

    .line 697
    if-eqz v0, :cond_d

    .line 699
    const/16 v5, 0x84

    :try_start_17
    invoke-virtual {v3, v0, v5}, Landroid_src/mms/e/q;->a([BI)V
    :try_end_17
    .catch Ljava/lang/NullPointerException; {:try_start_17 .. :try_end_17} :catch_1f
    .catch Ljava/lang/RuntimeException; {:try_start_17 .. :try_end_17} :catch_20

    .line 709
    :cond_d
    :goto_3
    const/16 v0, 0x99

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    check-cast v0, [B

    sput-object v0, Landroid_src/mms/e/r;->f:[B

    .line 712
    const/16 v0, 0x83

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    check-cast v0, [B

    sput-object v0, Landroid_src/mms/e/r;->e:[B

    move v0, v1

    .line 715
    goto/16 :goto_1

    .line 700
    :catch_1f
    move-exception v0

    .line 701
    const-string v0, "null pointer error!"

    invoke-static {v0}, Landroid_src/mms/e/r;->a(Ljava/lang/String;)V

    goto :goto_3

    .line 702
    :catch_20
    move-exception v0

    .line 703
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "is not Text-String header field!"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid_src/mms/e/r;->a(Ljava/lang/String;)V

    move-object v0, v2

    .line 704
    goto/16 :goto_0

    :cond_e
    move-object v0, v3

    .line 727
    goto/16 :goto_0

    .line 225
    :pswitch_data_0
    .packed-switch 0x81
        :pswitch_8
        :pswitch_8
        :pswitch_6
        :pswitch_12
        :pswitch_4
        :pswitch_3
        :pswitch_9
        :pswitch_9
        :pswitch_a
        :pswitch_b
        :pswitch_6
        :pswitch_1
        :pswitch_c
        :pswitch_4
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_7
        :pswitch_3
        :pswitch_3
        :pswitch_7
        :pswitch_8
        :pswitch_6
        :pswitch_3
        :pswitch_7
        :pswitch_3
        :pswitch_3
        :pswitch_9
        :pswitch_6
        :pswitch_4
        :pswitch_d
        :pswitch_e
        :pswitch_3
        :pswitch_3
        :pswitch_f
        :pswitch_3
        :pswitch_7
        :pswitch_3
        :pswitch_0
        :pswitch_3
        :pswitch_10
        :pswitch_3
        :pswitch_10
        :pswitch_5
        :pswitch_0
        :pswitch_5
        :pswitch_0
        :pswitch_3
        :pswitch_11
        :pswitch_5
        :pswitch_3
        :pswitch_7
        :pswitch_7
        :pswitch_6
        :pswitch_6
        :pswitch_6
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_6
        :pswitch_6
        :pswitch_3
    .end packed-switch

    .line 229
    :pswitch_data_1
    .packed-switch 0x89
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
    .end packed-switch
.end method
