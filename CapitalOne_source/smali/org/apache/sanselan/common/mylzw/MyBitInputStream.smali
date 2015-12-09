.class public Lorg/apache/sanselan/common/mylzw/MyBitInputStream;
.super Ljava/io/InputStream;

# interfaces
.implements Lorg/apache/sanselan/common/BinaryConstants;


# instance fields
.field private final a:Ljava/io/InputStream;

.field private final b:I

.field private c:Z

.field private d:J

.field private e:I

.field private f:I


# virtual methods
.method public final a()I
    .locals 6

    const/16 v5, 0x4d

    const/16 v4, 0x49

    :goto_0
    iget v0, p0, Lorg/apache/sanselan/common/mylzw/MyBitInputStream;->e:I

    const/16 v1, 0x8

    if-lt v0, v1, :cond_0

    iget v0, p0, Lorg/apache/sanselan/common/mylzw/MyBitInputStream;->b:I

    if-ne v0, v5, :cond_5

    iget v0, p0, Lorg/apache/sanselan/common/mylzw/MyBitInputStream;->f:I

    iget v1, p0, Lorg/apache/sanselan/common/mylzw/MyBitInputStream;->e:I

    add-int/lit8 v1, v1, -0x8

    shr-int/2addr v0, v1

    and-int/lit16 v0, v0, 0xff

    :goto_1
    iget v1, p0, Lorg/apache/sanselan/common/mylzw/MyBitInputStream;->e:I

    add-int/lit8 v1, v1, -0x8

    iput v1, p0, Lorg/apache/sanselan/common/mylzw/MyBitInputStream;->e:I

    const/4 v1, 0x1

    iget v2, p0, Lorg/apache/sanselan/common/mylzw/MyBitInputStream;->e:I

    shl-int/2addr v1, v2

    add-int/lit8 v1, v1, -0x1

    iget v2, p0, Lorg/apache/sanselan/common/mylzw/MyBitInputStream;->f:I

    and-int/2addr v1, v2

    iput v1, p0, Lorg/apache/sanselan/common/mylzw/MyBitInputStream;->f:I

    :goto_2
    return v0

    :cond_0
    iget-object v0, p0, Lorg/apache/sanselan/common/mylzw/MyBitInputStream;->a:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->read()I

    move-result v0

    if-gez v0, :cond_2

    iget-boolean v0, p0, Lorg/apache/sanselan/common/mylzw/MyBitInputStream;->c:Z

    if-eqz v0, :cond_1

    const/16 v0, 0x101

    goto :goto_2

    :cond_1
    const/4 v0, -0x1

    goto :goto_2

    :cond_2
    and-int/lit16 v0, v0, 0xff

    iget v1, p0, Lorg/apache/sanselan/common/mylzw/MyBitInputStream;->b:I

    if-ne v1, v5, :cond_3

    iget v1, p0, Lorg/apache/sanselan/common/mylzw/MyBitInputStream;->f:I

    shl-int/lit8 v1, v1, 0x8

    or-int/2addr v0, v1

    iput v0, p0, Lorg/apache/sanselan/common/mylzw/MyBitInputStream;->f:I

    :goto_3
    iget-wide v0, p0, Lorg/apache/sanselan/common/mylzw/MyBitInputStream;->d:J

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    iput-wide v0, p0, Lorg/apache/sanselan/common/mylzw/MyBitInputStream;->d:J

    iget v0, p0, Lorg/apache/sanselan/common/mylzw/MyBitInputStream;->e:I

    add-int/lit8 v0, v0, 0x8

    iput v0, p0, Lorg/apache/sanselan/common/mylzw/MyBitInputStream;->e:I

    goto :goto_0

    :cond_3
    iget v1, p0, Lorg/apache/sanselan/common/mylzw/MyBitInputStream;->b:I

    if-ne v1, v4, :cond_4

    iget v1, p0, Lorg/apache/sanselan/common/mylzw/MyBitInputStream;->e:I

    shl-int/2addr v0, v1

    iget v1, p0, Lorg/apache/sanselan/common/mylzw/MyBitInputStream;->f:I

    or-int/2addr v0, v1

    iput v0, p0, Lorg/apache/sanselan/common/mylzw/MyBitInputStream;->f:I

    goto :goto_3

    :cond_4
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unknown byte order: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, p0, Lorg/apache/sanselan/common/mylzw/MyBitInputStream;->b:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    iget v0, p0, Lorg/apache/sanselan/common/mylzw/MyBitInputStream;->b:I

    if-ne v0, v4, :cond_6

    iget v0, p0, Lorg/apache/sanselan/common/mylzw/MyBitInputStream;->f:I

    and-int/lit16 v0, v0, 0xff

    iget v1, p0, Lorg/apache/sanselan/common/mylzw/MyBitInputStream;->f:I

    shr-int/lit8 v1, v1, 0x8

    iput v1, p0, Lorg/apache/sanselan/common/mylzw/MyBitInputStream;->f:I

    goto :goto_1

    :cond_6
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unknown byte order: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, p0, Lorg/apache/sanselan/common/mylzw/MyBitInputStream;->b:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public read()I
    .locals 1

    invoke-virtual {p0}, Lorg/apache/sanselan/common/mylzw/MyBitInputStream;->a()I

    move-result v0

    return v0
.end method
