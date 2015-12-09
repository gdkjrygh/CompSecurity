.class public Lorg/apache/sanselan/common/MyByteArrayOutputStream;
.super Ljava/io/OutputStream;


# instance fields
.field private final a:[B

.field private b:I


# virtual methods
.method public write(I)V
    .locals 3

    iget v0, p0, Lorg/apache/sanselan/common/MyByteArrayOutputStream;->b:I

    iget-object v1, p0, Lorg/apache/sanselan/common/MyByteArrayOutputStream;->a:[B

    array-length v1, v1

    if-lt v0, v1, :cond_0

    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Write exceeded expected length ("

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, p0, Lorg/apache/sanselan/common/MyByteArrayOutputStream;->b:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lorg/apache/sanselan/common/MyByteArrayOutputStream;->a:[B

    array-length v2, v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ")"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-object v0, p0, Lorg/apache/sanselan/common/MyByteArrayOutputStream;->a:[B

    iget v1, p0, Lorg/apache/sanselan/common/MyByteArrayOutputStream;->b:I

    int-to-byte v2, p1

    aput-byte v2, v0, v1

    iget v0, p0, Lorg/apache/sanselan/common/MyByteArrayOutputStream;->b:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lorg/apache/sanselan/common/MyByteArrayOutputStream;->b:I

    return-void
.end method
