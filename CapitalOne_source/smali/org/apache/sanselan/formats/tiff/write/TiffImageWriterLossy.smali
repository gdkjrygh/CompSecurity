.class public Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterLossy;
.super Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterBase;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterBase;-><init>()V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    invoke-direct {p0, p1}, Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterBase;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/io/OutputStream;Lorg/apache/sanselan/formats/tiff/write/TiffOutputSet;)V
    .locals 6

    const/4 v2, 0x0

    invoke-virtual {p0, p2}, Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterLossy;->a(Lorg/apache/sanselan/formats/tiff/write/TiffOutputSet;)Lorg/apache/sanselan/formats/tiff/write/TiffOutputSummary;

    move-result-object v4

    invoke-virtual {p2, v4}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputSet;->a(Lorg/apache/sanselan/formats/tiff/write/TiffOutputSummary;)Ljava/util/List;

    move-result-object v5

    const/16 v0, 0x8

    move v1, v2

    move v3, v0

    :goto_0
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    if-lt v1, v0, :cond_0

    iget v0, p0, Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterLossy;->a:I

    invoke-virtual {v4, v0}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputSummary;->a(I)V

    new-instance v3, Lorg/apache/sanselan/common/BinaryOutputStream;

    iget v0, p0, Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterLossy;->a:I

    invoke-direct {v3, p1, v0}, Lorg/apache/sanselan/common/BinaryOutputStream;-><init>(Ljava/io/OutputStream;I)V

    invoke-virtual {p0, v3}, Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterLossy;->a(Lorg/apache/sanselan/common/BinaryOutputStream;)V

    move v1, v2

    :goto_1
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    if-lt v1, v0, :cond_1

    return-void

    :cond_0
    invoke-interface {v5, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputItem;

    invoke-virtual {v0, v3}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputItem;->a(I)V

    invoke-virtual {v0}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputItem;->c()I

    move-result v0

    add-int/2addr v3, v0

    rem-int/lit8 v0, v0, 0x4

    rsub-int/lit8 v0, v0, 0x4

    rem-int/lit8 v0, v0, 0x4

    add-int/2addr v3, v0

    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    :cond_1
    invoke-interface {v5, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputItem;

    invoke-virtual {v0, v3}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputItem;->a(Lorg/apache/sanselan/common/BinaryOutputStream;)V

    invoke-virtual {v0}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputItem;->c()I

    move-result v0

    rem-int/lit8 v0, v0, 0x4

    rsub-int/lit8 v0, v0, 0x4

    rem-int/lit8 v4, v0, 0x4

    move v0, v2

    :goto_2
    if-lt v0, v4, :cond_2

    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1

    :cond_2
    invoke-virtual {v3, v2}, Lorg/apache/sanselan/common/BinaryOutputStream;->write(I)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_2
.end method
