.class Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field final synthetic a:Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;


# direct methods
.method constructor <init>(Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;)V
    .locals 0

    iput-object p1, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory$1;->a:Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2

    check-cast p1, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;

    check-cast p2, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;

    iget v0, p1, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;->a:I

    iget v1, p2, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;->a:I

    if-eq v0, v1, :cond_0

    iget v0, p1, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;->a:I

    iget v1, p2, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;->a:I

    sub-int/2addr v0, v1

    :goto_0
    return v0

    :cond_0
    invoke-virtual {p1}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;->c()I

    move-result v0

    invoke-virtual {p2}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;->c()I

    move-result v1

    sub-int/2addr v0, v1

    goto :goto_0
.end method
