.class public Lorg/apache/sanselan/formats/tiff/TiffImageMetadata$Directory;
.super Lorg/apache/sanselan/common/ImageMetadata;

# interfaces
.implements Lorg/apache/sanselan/common/IImageMetadata$IImageMetadataItem;


# instance fields
.field private final b:Lorg/apache/sanselan/formats/tiff/TiffDirectory;


# virtual methods
.method public final a(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    new-instance v1, Ljava/lang/StringBuilder;

    if-eqz p1, :cond_0

    move-object v0, p1

    :goto_0
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, p0, Lorg/apache/sanselan/formats/tiff/TiffImageMetadata$Directory;->b:Lorg/apache/sanselan/formats/tiff/TiffDirectory;

    invoke-virtual {v0}, Lorg/apache/sanselan/formats/tiff/TiffDirectory;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ": "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v0, p0, Lorg/apache/sanselan/formats/tiff/TiffImageMetadata$Directory;->b:Lorg/apache/sanselan/formats/tiff/TiffDirectory;

    invoke-virtual {v0}, Lorg/apache/sanselan/formats/tiff/TiffDirectory;->e()Lorg/apache/sanselan/formats/tiff/JpegImageData;

    move-result-object v0

    if-eqz v0, :cond_1

    const-string v0, " (jpegImageData)"

    :goto_1
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-super {p0, p1}, Lorg/apache/sanselan/common/ImageMetadata;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const-string v0, ""

    goto :goto_0

    :cond_1
    const-string v0, ""

    goto :goto_1
.end method
