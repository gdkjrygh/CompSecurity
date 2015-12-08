.class Lorg/apache/sanselan/formats/jpeg/exifRewrite/ExifRewriter$1;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/apache/sanselan/formats/jpeg/JpegUtils$Visitor;


# instance fields
.field final synthetic a:Lorg/apache/sanselan/formats/jpeg/exifRewrite/ExifRewriter;

.field private final synthetic b:Ljava/util/ArrayList;

.field private final synthetic c:Ljava/util/List;


# direct methods
.method constructor <init>(Lorg/apache/sanselan/formats/jpeg/exifRewrite/ExifRewriter;Ljava/util/ArrayList;Ljava/util/List;)V
    .locals 0

    iput-object p1, p0, Lorg/apache/sanselan/formats/jpeg/exifRewrite/ExifRewriter$1;->a:Lorg/apache/sanselan/formats/jpeg/exifRewrite/ExifRewriter;

    iput-object p2, p0, Lorg/apache/sanselan/formats/jpeg/exifRewrite/ExifRewriter$1;->b:Ljava/util/ArrayList;

    iput-object p3, p0, Lorg/apache/sanselan/formats/jpeg/exifRewrite/ExifRewriter$1;->c:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final a(I[B[B[B)Z
    .locals 2

    const v0, 0xffe1

    if-eq p1, v0, :cond_0

    iget-object v0, p0, Lorg/apache/sanselan/formats/jpeg/exifRewrite/ExifRewriter$1;->b:Ljava/util/ArrayList;

    new-instance v1, Lorg/apache/sanselan/formats/jpeg/exifRewrite/ExifRewriter$JFIFPieceSegment;

    invoke-direct {v1, p1, p2, p3, p4}, Lorg/apache/sanselan/formats/jpeg/exifRewrite/ExifRewriter$JFIFPieceSegment;-><init>(I[B[B[B)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_0
    const/4 v0, 0x1

    return v0

    :cond_0
    sget-object v0, Lorg/apache/sanselan/formats/jpeg/exifRewrite/ExifRewriter;->c:[B

    invoke-static {p4, v0}, Lorg/apache/sanselan/formats/jpeg/exifRewrite/ExifRewriter;->b([B[B)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lorg/apache/sanselan/formats/jpeg/exifRewrite/ExifRewriter$1;->b:Ljava/util/ArrayList;

    new-instance v1, Lorg/apache/sanselan/formats/jpeg/exifRewrite/ExifRewriter$JFIFPieceSegment;

    invoke-direct {v1, p1, p2, p3, p4}, Lorg/apache/sanselan/formats/jpeg/exifRewrite/ExifRewriter$JFIFPieceSegment;-><init>(I[B[B[B)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    new-instance v0, Lorg/apache/sanselan/formats/jpeg/exifRewrite/ExifRewriter$JFIFPieceSegmentExif;

    invoke-direct {v0, p1, p2, p3, p4}, Lorg/apache/sanselan/formats/jpeg/exifRewrite/ExifRewriter$JFIFPieceSegmentExif;-><init>(I[B[B[B)V

    iget-object v1, p0, Lorg/apache/sanselan/formats/jpeg/exifRewrite/ExifRewriter$1;->b:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Lorg/apache/sanselan/formats/jpeg/exifRewrite/ExifRewriter$1;->c:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0
.end method

.method public final a([BLjava/io/InputStream;)Z
    .locals 2

    iget-object v0, p0, Lorg/apache/sanselan/formats/jpeg/exifRewrite/ExifRewriter$1;->b:Ljava/util/ArrayList;

    new-instance v1, Lorg/apache/sanselan/formats/jpeg/exifRewrite/ExifRewriter$JFIFPieceImageData;

    invoke-direct {v1, p1, p2}, Lorg/apache/sanselan/formats/jpeg/exifRewrite/ExifRewriter$JFIFPieceImageData;-><init>([BLjava/io/InputStream;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v0, 0x1

    return v0
.end method
