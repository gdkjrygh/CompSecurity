.class public Lorg/apache/sanselan/common/BitInputStreamFlexible;
.super Ljava/io/InputStream;

# interfaces
.implements Lorg/apache/sanselan/common/BinaryConstants;


# instance fields
.field private final a:Ljava/io/InputStream;

.field private b:I


# virtual methods
.method public read()I
    .locals 2

    iget v0, p0, Lorg/apache/sanselan/common/BitInputStreamFlexible;->b:I

    if-lez v0, :cond_0

    new-instance v0, Ljava/io/IOException;

    const-string v1, "BitInputStream: incomplete bit read"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-object v0, p0, Lorg/apache/sanselan/common/BitInputStreamFlexible;->a:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->read()I

    move-result v0

    return v0
.end method
