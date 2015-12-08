.class final Lorg/apache/sanselan/common/mylzw/MyLZWCompressor$ByteArray;
.super Ljava/lang/Object;


# instance fields
.field private final a:[B

.field private final b:I

.field private final c:I

.field private final d:I


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 5

    const/4 v1, 0x0

    check-cast p1, Lorg/apache/sanselan/common/mylzw/MyLZWCompressor$ByteArray;

    iget v0, p1, Lorg/apache/sanselan/common/mylzw/MyLZWCompressor$ByteArray;->d:I

    iget v2, p0, Lorg/apache/sanselan/common/mylzw/MyLZWCompressor$ByteArray;->d:I

    if-eq v0, v2, :cond_1

    :cond_0
    :goto_0
    return v1

    :cond_1
    iget v0, p1, Lorg/apache/sanselan/common/mylzw/MyLZWCompressor$ByteArray;->c:I

    iget v2, p0, Lorg/apache/sanselan/common/mylzw/MyLZWCompressor$ByteArray;->c:I

    if-ne v0, v2, :cond_0

    move v0, v1

    :goto_1
    iget v2, p0, Lorg/apache/sanselan/common/mylzw/MyLZWCompressor$ByteArray;->c:I

    if-lt v0, v2, :cond_2

    const/4 v1, 0x1

    goto :goto_0

    :cond_2
    iget-object v2, p1, Lorg/apache/sanselan/common/mylzw/MyLZWCompressor$ByteArray;->a:[B

    iget v3, p1, Lorg/apache/sanselan/common/mylzw/MyLZWCompressor$ByteArray;->b:I

    add-int/2addr v3, v0

    aget-byte v2, v2, v3

    iget-object v3, p0, Lorg/apache/sanselan/common/mylzw/MyLZWCompressor$ByteArray;->a:[B

    iget v4, p0, Lorg/apache/sanselan/common/mylzw/MyLZWCompressor$ByteArray;->b:I

    add-int/2addr v4, v0

    aget-byte v3, v3, v4

    if-ne v2, v3, :cond_0

    add-int/lit8 v0, v0, 0x1

    goto :goto_1
.end method

.method public final hashCode()I
    .locals 1

    iget v0, p0, Lorg/apache/sanselan/common/mylzw/MyLZWCompressor$ByteArray;->d:I

    return v0
.end method
