.class Lorg/apache/sanselan/formats/jpeg/exifRewrite/ExifRewriter$JFIFPieceSegment;
.super Lorg/apache/sanselan/formats/jpeg/exifRewrite/ExifRewriter$JFIFPiece;


# instance fields
.field public final a:I

.field public final b:[B

.field public final c:[B

.field public final d:[B


# direct methods
.method public constructor <init>(I[B[B[B)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lorg/apache/sanselan/formats/jpeg/exifRewrite/ExifRewriter$JFIFPiece;-><init>(B)V

    iput p1, p0, Lorg/apache/sanselan/formats/jpeg/exifRewrite/ExifRewriter$JFIFPieceSegment;->a:I

    iput-object p2, p0, Lorg/apache/sanselan/formats/jpeg/exifRewrite/ExifRewriter$JFIFPieceSegment;->b:[B

    iput-object p3, p0, Lorg/apache/sanselan/formats/jpeg/exifRewrite/ExifRewriter$JFIFPieceSegment;->c:[B

    iput-object p4, p0, Lorg/apache/sanselan/formats/jpeg/exifRewrite/ExifRewriter$JFIFPieceSegment;->d:[B

    return-void
.end method


# virtual methods
.method protected final a(Ljava/io/OutputStream;)V
    .locals 1

    iget-object v0, p0, Lorg/apache/sanselan/formats/jpeg/exifRewrite/ExifRewriter$JFIFPieceSegment;->b:[B

    invoke-virtual {p1, v0}, Ljava/io/OutputStream;->write([B)V

    iget-object v0, p0, Lorg/apache/sanselan/formats/jpeg/exifRewrite/ExifRewriter$JFIFPieceSegment;->c:[B

    invoke-virtual {p1, v0}, Ljava/io/OutputStream;->write([B)V

    iget-object v0, p0, Lorg/apache/sanselan/formats/jpeg/exifRewrite/ExifRewriter$JFIFPieceSegment;->d:[B

    invoke-virtual {p1, v0}, Ljava/io/OutputStream;->write([B)V

    return-void
.end method
