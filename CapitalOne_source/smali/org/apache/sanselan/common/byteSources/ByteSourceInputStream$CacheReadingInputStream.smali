.class Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheReadingInputStream;
.super Ljava/io/InputStream;


# instance fields
.field final synthetic a:Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream;

.field private b:Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheBlock;

.field private c:Z

.field private d:I


# direct methods
.method private constructor <init>(Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream;)V
    .locals 2

    const/4 v1, 0x0

    iput-object p1, p0, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheReadingInputStream;->a:Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream;

    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheReadingInputStream;->b:Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheBlock;

    iput-boolean v1, p0, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheReadingInputStream;->c:Z

    iput v1, p0, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheReadingInputStream;->d:I

    return-void
.end method

.method synthetic constructor <init>(Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream;B)V
    .locals 0

    invoke-direct {p0, p1}, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheReadingInputStream;-><init>(Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream;)V

    return-void
.end method


# virtual methods
.method public read()I
    .locals 3

    const/4 v0, -0x1

    iget-object v1, p0, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheReadingInputStream;->b:Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheBlock;

    if-nez v1, :cond_2

    iget-boolean v1, p0, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheReadingInputStream;->c:Z

    if-eqz v1, :cond_1

    :cond_0
    :goto_0
    return v0

    :cond_1
    iget-object v1, p0, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheReadingInputStream;->a:Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream;

    invoke-static {v1}, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream;->b(Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream;)Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheBlock;

    move-result-object v1

    iput-object v1, p0, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheReadingInputStream;->b:Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheBlock;

    const/4 v1, 0x1

    iput-boolean v1, p0, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheReadingInputStream;->c:Z

    :cond_2
    iget-object v1, p0, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheReadingInputStream;->b:Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheBlock;

    if-eqz v1, :cond_3

    iget v1, p0, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheReadingInputStream;->d:I

    iget-object v2, p0, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheReadingInputStream;->b:Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheBlock;

    iget-object v2, v2, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheBlock;->a:[B

    array-length v2, v2

    if-lt v1, v2, :cond_3

    iget-object v1, p0, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheReadingInputStream;->b:Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheBlock;

    invoke-virtual {v1}, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheBlock;->a()Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheBlock;

    move-result-object v1

    iput-object v1, p0, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheReadingInputStream;->b:Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheBlock;

    const/4 v1, 0x0

    iput v1, p0, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheReadingInputStream;->d:I

    :cond_3
    iget-object v1, p0, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheReadingInputStream;->b:Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheBlock;

    if-eqz v1, :cond_0

    iget v1, p0, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheReadingInputStream;->d:I

    iget-object v2, p0, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheReadingInputStream;->b:Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheBlock;

    iget-object v2, v2, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheBlock;->a:[B

    array-length v2, v2

    if-ge v1, v2, :cond_0

    iget-object v0, p0, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheReadingInputStream;->b:Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheBlock;

    iget-object v0, v0, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheBlock;->a:[B

    iget v1, p0, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheReadingInputStream;->d:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheReadingInputStream;->d:I

    aget-byte v0, v0, v1

    and-int/lit16 v0, v0, 0xff

    goto :goto_0
.end method

.method public read([BII)I
    .locals 4

    const/4 v0, 0x0

    const/4 v1, -0x1

    if-nez p1, :cond_0

    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    :cond_0
    if-ltz p2, :cond_1

    array-length v2, p1

    if-gt p2, v2, :cond_1

    if-ltz p3, :cond_1

    add-int v2, p2, p3

    array-length v3, p1

    if-gt v2, v3, :cond_1

    add-int v2, p2, p3

    if-gez v2, :cond_2

    :cond_1
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {v0}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw v0

    :cond_2
    if-nez p3, :cond_3

    :goto_0
    return v0

    :cond_3
    iget-object v2, p0, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheReadingInputStream;->b:Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheBlock;

    if-nez v2, :cond_5

    iget-boolean v2, p0, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheReadingInputStream;->c:Z

    if-eqz v2, :cond_4

    move v0, v1

    goto :goto_0

    :cond_4
    iget-object v2, p0, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheReadingInputStream;->a:Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream;

    invoke-static {v2}, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream;->b(Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream;)Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheBlock;

    move-result-object v2

    iput-object v2, p0, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheReadingInputStream;->b:Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheBlock;

    const/4 v2, 0x1

    iput-boolean v2, p0, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheReadingInputStream;->c:Z

    :cond_5
    iget-object v2, p0, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheReadingInputStream;->b:Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheBlock;

    if-eqz v2, :cond_6

    iget v2, p0, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheReadingInputStream;->d:I

    iget-object v3, p0, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheReadingInputStream;->b:Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheBlock;

    iget-object v3, v3, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheBlock;->a:[B

    array-length v3, v3

    if-lt v2, v3, :cond_6

    iget-object v2, p0, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheReadingInputStream;->b:Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheBlock;

    invoke-virtual {v2}, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheBlock;->a()Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheBlock;

    move-result-object v2

    iput-object v2, p0, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheReadingInputStream;->b:Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheBlock;

    iput v0, p0, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheReadingInputStream;->d:I

    :cond_6
    iget-object v0, p0, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheReadingInputStream;->b:Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheBlock;

    if-nez v0, :cond_7

    move v0, v1

    goto :goto_0

    :cond_7
    iget v0, p0, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheReadingInputStream;->d:I

    iget-object v2, p0, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheReadingInputStream;->b:Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheBlock;

    iget-object v2, v2, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheBlock;->a:[B

    array-length v2, v2

    if-lt v0, v2, :cond_8

    move v0, v1

    goto :goto_0

    :cond_8
    iget-object v0, p0, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheReadingInputStream;->b:Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheBlock;

    iget-object v0, v0, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheBlock;->a:[B

    array-length v0, v0

    iget v1, p0, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheReadingInputStream;->d:I

    sub-int/2addr v0, v1

    invoke-static {p3, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    iget-object v1, p0, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheReadingInputStream;->b:Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheBlock;

    iget-object v1, v1, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheBlock;->a:[B

    iget v2, p0, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheReadingInputStream;->d:I

    invoke-static {v1, v2, p1, p2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget v1, p0, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheReadingInputStream;->d:I

    add-int/2addr v1, v0

    iput v1, p0, Lorg/apache/sanselan/common/byteSources/ByteSourceInputStream$CacheReadingInputStream;->d:I

    goto :goto_0
.end method
