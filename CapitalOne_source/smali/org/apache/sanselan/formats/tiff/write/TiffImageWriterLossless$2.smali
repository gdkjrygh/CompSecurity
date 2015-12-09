.class Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterLossless$2;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/Comparator;


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2

    check-cast p1, Lorg/apache/sanselan/formats/tiff/write/TiffOutputItem;

    check-cast p2, Lorg/apache/sanselan/formats/tiff/write/TiffOutputItem;

    invoke-virtual {p1}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputItem;->c()I

    move-result v0

    invoke-virtual {p2}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputItem;->c()I

    move-result v1

    sub-int/2addr v0, v1

    return v0
.end method
