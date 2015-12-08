.class public Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream;
.super Lorg/apache/sanselan/common/byteSources/ByteSource;


# instance fields
.field private final c:Ljava/io/InputStream;

.field private d:Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheBlock;

.field private e:[B

.field private f:Ljava/lang/Long;


# direct methods
.method static synthetic a(Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream;)Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheBlock;
    .locals 1

    invoke-direct {p0}, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream;->d()Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheBlock;

    move-result-object v0

    return-object v0
.end method

.method static synthetic b(Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream;)Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheBlock;
    .locals 1

    iget-object v0, p0, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream;->d:Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheBlock;

    if-nez v0, :cond_0

    invoke-direct {p0}, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream;->d()Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheBlock;

    move-result-object v0

    iput-object v0, p0, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream;->d:Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheBlock;

    :cond_0
    iget-object v0, p0, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream;->d:Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheBlock;

    return-object v0
.end method

.method private d()Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheBlock;
    .locals 5

    const/4 v0, 0x0

    const/16 v4, 0x400

    const/4 v3, 0x0

    iget-object v1, p0, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream;->e:[B

    if-nez v1, :cond_0

    new-array v1, v4, [B

    iput-object v1, p0, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream;->e:[B

    :cond_0
    iget-object v1, p0, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream;->c:Ljava/io/InputStream;

    iget-object v2, p0, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream;->e:[B

    invoke-virtual {v1, v2}, Ljava/io/InputStream;->read([B)I

    move-result v1

    if-gtz v1, :cond_1

    :goto_0
    return-object v0

    :cond_1
    if-ge v1, v4, :cond_2

    new-array v2, v1, [B

    iget-object v0, p0, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream;->e:[B

    invoke-static {v0, v3, v2, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    new-instance v0, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheBlock;

    invoke-direct {v0, p0, v2}, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheBlock;-><init>(Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream;[B)V

    goto :goto_0

    :cond_2
    iget-object v1, p0, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream;->e:[B

    iput-object v0, p0, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream;->e:[B

    new-instance v0, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheBlock;

    invoke-direct {v0, p0, v1}, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheBlock;-><init>(Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream;[B)V

    goto :goto_0
.end method


# virtual methods
.method public final b()Ljava/io/InputStream;
    .locals 2

    new-instance v0, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheReadingInputStream;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheReadingInputStream;-><init>(Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream;B)V

    return-object v0
.end method

.method public final b(II)[B
    .locals 4

    invoke-virtual {p0}, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream;->b()Ljava/io/InputStream;

    move-result-object v1

    int-to-long v2, p1

    invoke-virtual {v1, v2, v3}, Ljava/io/InputStream;->skip(J)J

    new-array v2, p2, [B

    const/4 v0, 0x0

    :cond_0
    array-length v3, v2

    sub-int/2addr v3, v0

    invoke-virtual {v1, v2, v0, v3}, Ljava/io/InputStream;->read([BII)I

    move-result v3

    if-gtz v3, :cond_1

    new-instance v0, Ljava/io/IOException;

    const-string v1, "Could not read block."

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    add-int/2addr v0, v3

    if-lt v0, p2, :cond_0

    return-object v2
.end method

.method public final c()J
    .locals 8

    const-wide/16 v2, 0x0

    iget-object v0, p0, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream;->f:Ljava/lang/Long;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream;->f:Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    :goto_0
    return-wide v0

    :cond_0
    invoke-virtual {p0}, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream;->b()Ljava/io/InputStream;

    move-result-object v4

    move-wide v0, v2

    :goto_1
    const-wide/16 v6, 0x400

    invoke-virtual {v4, v6, v7}, Ljava/io/InputStream;->skip(J)J

    move-result-wide v6

    cmp-long v5, v6, v2

    if-gtz v5, :cond_1

    new-instance v2, Ljava/lang/Long;

    invoke-direct {v2, v0, v1}, Ljava/lang/Long;-><init>(J)V

    iput-object v2, p0, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream;->f:Ljava/lang/Long;

    goto :goto_0

    :cond_1
    add-long/2addr v0, v6

    goto :goto_1
.end method
