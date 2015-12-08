.class Lorg/apache/sanselan/formats/tiff/TiffReader$FirstDirectoryCollector;
.super Lorg/apache/sanselan/formats/tiff/TiffReader$Collector;


# instance fields
.field private final a:Z


# virtual methods
.method public final a()Z
    .locals 1

    iget-boolean v0, p0, Lorg/apache/sanselan/formats/tiff/TiffReader$FirstDirectoryCollector;->a:Z

    return v0
.end method

.method public final a(Lorg/apache/sanselan/formats/tiff/TiffDirectory;)Z
    .locals 1

    invoke-super {p0, p1}, Lorg/apache/sanselan/formats/tiff/TiffReader$Collector;->a(Lorg/apache/sanselan/formats/tiff/TiffDirectory;)Z

    const/4 v0, 0x0

    return v0
.end method
