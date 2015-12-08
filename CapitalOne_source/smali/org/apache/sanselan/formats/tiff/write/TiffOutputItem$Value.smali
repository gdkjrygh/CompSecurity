.class public Lorg/apache/sanselan/formats/tiff/write/TiffOutputItem$Value;
.super Lorg/apache/sanselan/formats/tiff/write/TiffOutputItem;


# instance fields
.field private final a:[B

.field private final b:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;[B)V
    .locals 0

    invoke-direct {p0}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputItem;-><init>()V

    iput-object p1, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputItem$Value;->b:Ljava/lang/String;

    iput-object p2, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputItem$Value;->a:[B

    return-void
.end method


# virtual methods
.method public final a(Lorg/apache/sanselan/common/BinaryOutputStream;)V
    .locals 1

    iget-object v0, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputItem$Value;->a:[B

    invoke-virtual {p1, v0}, Lorg/apache/sanselan/common/BinaryOutputStream;->write([B)V

    return-void
.end method

.method public final a([B)V
    .locals 3

    const/4 v2, 0x0

    iget-object v0, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputItem$Value;->a:[B

    array-length v0, v0

    array-length v1, p1

    if-eq v0, v1, :cond_0

    new-instance v0, Lorg/apache/sanselan/ImageWriteException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Updated data size mismatch: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputItem$Value;->a:[B

    array-length v2, v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " vs. "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    array-length v2, p1

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/apache/sanselan/ImageWriteException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-object v0, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputItem$Value;->a:[B

    array-length v1, p1

    invoke-static {p1, v2, v0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-void
.end method

.method public final c()I
    .locals 1

    iget-object v0, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputItem$Value;->a:[B

    array-length v0, v0

    return v0
.end method
