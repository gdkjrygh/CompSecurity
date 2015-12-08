.class Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterLossless$BufferOutputStream;
.super Ljava/io/OutputStream;


# instance fields
.field private final a:[B

.field private b:I


# direct methods
.method public constructor <init>([BI)V
    .locals 0

    invoke-direct {p0}, Ljava/io/OutputStream;-><init>()V

    iput-object p1, p0, Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterLossless$BufferOutputStream;->a:[B

    iput p2, p0, Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterLossless$BufferOutputStream;->b:I

    return-void
.end method


# virtual methods
.method public write(I)V
    .locals 3

    iget v0, p0, Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterLossless$BufferOutputStream;->b:I

    iget-object v1, p0, Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterLossless$BufferOutputStream;->a:[B

    array-length v1, v1

    if-lt v0, v1, :cond_0

    new-instance v0, Ljava/io/IOException;

    const-string v1, "Buffer overflow."

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-object v0, p0, Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterLossless$BufferOutputStream;->a:[B

    iget v1, p0, Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterLossless$BufferOutputStream;->b:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterLossless$BufferOutputStream;->b:I

    int-to-byte v2, p1

    aput-byte v2, v0, v1

    return-void
.end method

.method public write([BII)V
    .locals 2

    iget v0, p0, Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterLossless$BufferOutputStream;->b:I

    add-int/2addr v0, p3

    iget-object v1, p0, Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterLossless$BufferOutputStream;->a:[B

    array-length v1, v1

    if-le v0, v1, :cond_0

    new-instance v0, Ljava/io/IOException;

    const-string v1, "Buffer overflow."

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-object v0, p0, Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterLossless$BufferOutputStream;->a:[B

    iget v1, p0, Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterLossless$BufferOutputStream;->b:I

    invoke-static {p1, p2, v0, v1, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget v0, p0, Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterLossless$BufferOutputStream;->b:I

    add-int/2addr v0, p3

    iput v0, p0, Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterLossless$BufferOutputStream;->b:I

    return-void
.end method
