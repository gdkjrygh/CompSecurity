.class public Lorg/apache/sanselan/common/mylzw/BitsToByteInputStream;
.super Ljava/io/InputStream;


# instance fields
.field private final a:Lorg/apache/sanselan/common/mylzw/MyBitInputStream;

.field private final b:I


# virtual methods
.method public read()I
    .locals 3

    const/16 v2, 0x8

    iget-object v0, p0, Lorg/apache/sanselan/common/mylzw/BitsToByteInputStream;->a:Lorg/apache/sanselan/common/mylzw/MyBitInputStream;

    invoke-virtual {v0}, Lorg/apache/sanselan/common/mylzw/MyBitInputStream;->a()I

    move-result v0

    iget v1, p0, Lorg/apache/sanselan/common/mylzw/BitsToByteInputStream;->b:I

    if-ge v2, v1, :cond_1

    iget v1, p0, Lorg/apache/sanselan/common/mylzw/BitsToByteInputStream;->b:I

    add-int/lit8 v1, v1, -0x8

    shl-int/2addr v0, v1

    :cond_0
    :goto_0
    return v0

    :cond_1
    iget v1, p0, Lorg/apache/sanselan/common/mylzw/BitsToByteInputStream;->b:I

    if-le v2, v1, :cond_0

    iget v1, p0, Lorg/apache/sanselan/common/mylzw/BitsToByteInputStream;->b:I

    rsub-int/lit8 v1, v1, 0x8

    shr-int/2addr v0, v1

    goto :goto_0
.end method
