.class public Lorg/apache/sanselan/common/mylzw/MyBitOutputStream;
.super Ljava/io/OutputStream;

# interfaces
.implements Lorg/apache/sanselan/common/BinaryConstants;


# instance fields
.field private final a:Ljava/io/OutputStream;

.field private final b:I

.field private c:I

.field private d:I

.field private e:I


# direct methods
.method private a(I)V
    .locals 1

    iget-object v0, p0, Lorg/apache/sanselan/common/mylzw/MyBitOutputStream;->a:Ljava/io/OutputStream;

    invoke-virtual {v0, p1}, Ljava/io/OutputStream;->write(I)V

    iget v0, p0, Lorg/apache/sanselan/common/mylzw/MyBitOutputStream;->e:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lorg/apache/sanselan/common/mylzw/MyBitOutputStream;->e:I

    return-void
.end method


# virtual methods
.method public write(I)V
    .locals 5

    const/16 v4, 0x4d

    const/16 v3, 0x49

    and-int/lit16 v0, p1, 0xff

    iget v1, p0, Lorg/apache/sanselan/common/mylzw/MyBitOutputStream;->b:I

    if-ne v1, v4, :cond_0

    iget v1, p0, Lorg/apache/sanselan/common/mylzw/MyBitOutputStream;->d:I

    shl-int/lit8 v1, v1, 0x8

    or-int/2addr v0, v1

    iput v0, p0, Lorg/apache/sanselan/common/mylzw/MyBitOutputStream;->d:I

    :goto_0
    iget v0, p0, Lorg/apache/sanselan/common/mylzw/MyBitOutputStream;->c:I

    add-int/lit8 v0, v0, 0x8

    iput v0, p0, Lorg/apache/sanselan/common/mylzw/MyBitOutputStream;->c:I

    :goto_1
    iget v0, p0, Lorg/apache/sanselan/common/mylzw/MyBitOutputStream;->c:I

    const/16 v1, 0x8

    if-ge v0, v1, :cond_2

    return-void

    :cond_0
    iget v1, p0, Lorg/apache/sanselan/common/mylzw/MyBitOutputStream;->b:I

    if-ne v1, v3, :cond_1

    iget v1, p0, Lorg/apache/sanselan/common/mylzw/MyBitOutputStream;->d:I

    iget v2, p0, Lorg/apache/sanselan/common/mylzw/MyBitOutputStream;->c:I

    shl-int/2addr v0, v2

    or-int/2addr v0, v1

    iput v0, p0, Lorg/apache/sanselan/common/mylzw/MyBitOutputStream;->d:I

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unknown byte order: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, p0, Lorg/apache/sanselan/common/mylzw/MyBitOutputStream;->b:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget v0, p0, Lorg/apache/sanselan/common/mylzw/MyBitOutputStream;->b:I

    if-ne v0, v4, :cond_4

    iget v0, p0, Lorg/apache/sanselan/common/mylzw/MyBitOutputStream;->d:I

    iget v1, p0, Lorg/apache/sanselan/common/mylzw/MyBitOutputStream;->c:I

    add-int/lit8 v1, v1, -0x8

    shr-int/2addr v0, v1

    and-int/lit16 v0, v0, 0xff

    invoke-direct {p0, v0}, Lorg/apache/sanselan/common/mylzw/MyBitOutputStream;->a(I)V

    iget v0, p0, Lorg/apache/sanselan/common/mylzw/MyBitOutputStream;->c:I

    add-int/lit8 v0, v0, -0x8

    iput v0, p0, Lorg/apache/sanselan/common/mylzw/MyBitOutputStream;->c:I

    :cond_3
    :goto_2
    const/4 v0, 0x1

    iget v1, p0, Lorg/apache/sanselan/common/mylzw/MyBitOutputStream;->c:I

    shl-int/2addr v0, v1

    add-int/lit8 v0, v0, -0x1

    iget v1, p0, Lorg/apache/sanselan/common/mylzw/MyBitOutputStream;->d:I

    and-int/2addr v0, v1

    iput v0, p0, Lorg/apache/sanselan/common/mylzw/MyBitOutputStream;->d:I

    goto :goto_1

    :cond_4
    iget v0, p0, Lorg/apache/sanselan/common/mylzw/MyBitOutputStream;->b:I

    if-ne v0, v3, :cond_3

    iget v0, p0, Lorg/apache/sanselan/common/mylzw/MyBitOutputStream;->d:I

    and-int/lit16 v0, v0, 0xff

    invoke-direct {p0, v0}, Lorg/apache/sanselan/common/mylzw/MyBitOutputStream;->a(I)V

    iget v0, p0, Lorg/apache/sanselan/common/mylzw/MyBitOutputStream;->d:I

    shr-int/lit8 v0, v0, 0x8

    iput v0, p0, Lorg/apache/sanselan/common/mylzw/MyBitOutputStream;->d:I

    iget v0, p0, Lorg/apache/sanselan/common/mylzw/MyBitOutputStream;->c:I

    add-int/lit8 v0, v0, -0x8

    iput v0, p0, Lorg/apache/sanselan/common/mylzw/MyBitOutputStream;->c:I

    goto :goto_2
.end method
