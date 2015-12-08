.class public final Lkik/a/f/l;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method private static a(JI)I
    .locals 4

    .prologue
    const/16 v0, 0x20

    const/4 v2, 0x1

    .line 12
    if-le p2, v0, :cond_0

    .line 13
    shr-long v0, p0, v0

    shl-int/2addr v2, p2

    int-to-long v2, v2

    and-long/2addr v0, v2

    long-to-int v0, v0

    shr-int/2addr v0, p2

    .line 16
    :goto_0
    return v0

    :cond_0
    shl-int v0, v2, p2

    int-to-long v0, v0

    and-long/2addr v0, p0

    long-to-int v0, v0

    shr-int/2addr v0, p2

    goto :goto_0
.end method

.method public static declared-synchronized a()Ljava/lang/String;
    .locals 16

    .prologue
    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 75
    const-class v4, Lkik/a/f/l;

    monitor-enter v4

    :try_start_0
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v5

    invoke-virtual {v5}, Ljava/util/UUID;->getLeastSignificantBits()J

    move-result-wide v2

    invoke-virtual {v5}, Ljava/util/UUID;->getMostSignificantBits()J

    move-result-wide v6

    const-wide/high16 v8, -0x1000000000000000L    # -3.105036184601418E231

    and-long/2addr v8, v6

    const/16 v5, 0x3e

    ushr-long/2addr v8, v5

    long-to-int v5, v8

    const/4 v8, 0x4

    new-array v8, v8, [[I

    const/4 v9, 0x0

    const/4 v10, 0x2

    new-array v10, v10, [I

    fill-array-data v10, :array_0

    aput-object v10, v8, v9

    const/4 v9, 0x1

    const/4 v10, 0x2

    new-array v10, v10, [I

    fill-array-data v10, :array_1

    aput-object v10, v8, v9

    const/4 v9, 0x2

    const/4 v10, 0x2

    new-array v10, v10, [I

    fill-array-data v10, :array_2

    aput-object v10, v8, v9

    const/4 v9, 0x3

    const/4 v10, 0x2

    new-array v10, v10, [I

    fill-array-data v10, :array_3

    aput-object v10, v8, v9

    aget-object v9, v8, v5

    const/4 v10, 0x0

    aget v9, v9, v10

    aget-object v5, v8, v5

    const/4 v8, 0x1

    aget v5, v5, v8

    const-wide/32 v10, -0x1000000

    and-long/2addr v10, v6

    const/16 v8, 0x16

    ushr-long/2addr v10, v8

    const-wide/32 v12, 0xff0000

    and-long/2addr v12, v6

    const/16 v8, 0x10

    ushr-long/2addr v12, v8

    xor-long/2addr v10, v12

    const-wide/32 v12, 0xff00

    and-long/2addr v12, v6

    const/16 v8, 0x8

    ushr-long/2addr v12, v8

    xor-long/2addr v10, v12

    invoke-static {v6, v7, v9}, Lkik/a/f/l;->a(JI)I

    move-result v8

    shl-int/lit8 v8, v8, 0x1

    invoke-static {v6, v7, v5}, Lkik/a/f/l;->a(JI)I

    move-result v5

    add-int/lit8 v5, v5, 0x1

    or-int/2addr v5, v8

    :goto_0
    const/4 v8, 0x6

    if-ge v0, v8, :cond_0

    mul-int/lit8 v8, v5, 0x7

    add-int/2addr v1, v8

    rem-int/lit8 v1, v1, 0x3c

    invoke-static {v10, v11, v0}, Lkik/a/f/l;->a(JI)I

    move-result v8

    int-to-long v8, v8

    add-int/lit8 v12, v1, 0x2

    shl-long/2addr v8, v12

    add-int/lit8 v12, v1, 0x2

    const-wide/16 v14, 0x1

    shl-long v12, v14, v12

    const-wide/16 v14, -0x1

    xor-long/2addr v12, v14

    and-long/2addr v2, v12

    or-long/2addr v2, v8

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/util/UUID;

    invoke-direct {v0, v6, v7, v2, v3}, Ljava/util/UUID;-><init>(JJ)V

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    monitor-exit v4

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit v4

    throw v0

    nop

    :array_0
    .array-data 4
        0x3
        0x6
    .end array-data

    :array_1
    .array-data 4
        0x2
        0x5
    .end array-data

    :array_2
    .array-data 4
        0x7
        0x1
    .end array-data

    :array_3
    .array-data 4
        0x9
        0x5
    .end array-data
.end method
