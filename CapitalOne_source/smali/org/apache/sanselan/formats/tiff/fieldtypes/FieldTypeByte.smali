.class public Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeByte;
.super Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;


# direct methods
.method public constructor <init>(ILjava/lang/String;)V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, p1, v0, p2}, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;-><init>(IILjava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;I)[B
    .locals 3

    instance-of v0, p1, Ljava/lang/Byte;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    new-array v0, v0, [B

    const/4 v1, 0x0

    check-cast p1, Ljava/lang/Byte;

    invoke-virtual {p1}, Ljava/lang/Byte;->byteValue()B

    move-result v2

    aput-byte v2, v0, v1

    move-object p1, v0

    :goto_0
    return-object p1

    :cond_0
    instance-of v0, p1, [B

    if-eqz v0, :cond_1

    check-cast p1, [B

    goto :goto_0

    :cond_1
    new-instance v0, Lorg/apache/sanselan/ImageWriteException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Invalid data: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " ("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {p1}, Lorg/apache/sanselan/util/Debug;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ")"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/apache/sanselan/ImageWriteException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final c(Lorg/apache/sanselan/formats/tiff/TiffField;)Ljava/lang/Object;
    .locals 3

    iget v0, p1, Lorg/apache/sanselan/formats/tiff/TiffField;->f:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    new-instance v0, Ljava/lang/Byte;

    iget-object v1, p1, Lorg/apache/sanselan/formats/tiff/TiffField;->h:[B

    const/4 v2, 0x0

    aget-byte v1, v1, v2

    invoke-direct {v0, v1}, Ljava/lang/Byte;-><init>(B)V

    :goto_0
    return-object v0

    :cond_0
    invoke-virtual {p0, p1}, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeByte;->b(Lorg/apache/sanselan/formats/tiff/TiffField;)[B

    move-result-object v0

    goto :goto_0
.end method
