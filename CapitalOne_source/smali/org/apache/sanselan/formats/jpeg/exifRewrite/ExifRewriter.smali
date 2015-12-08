.class public Lorg/apache/sanselan/formats/jpeg/exifRewrite/ExifRewriter;
.super Lorg/apache/sanselan/common/BinaryFileParser;

# interfaces
.implements Lorg/apache/sanselan/formats/jpeg/JpegConstants;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lorg/apache/sanselan/common/BinaryFileParser;-><init>()V

    invoke-virtual {p0}, Lorg/apache/sanselan/formats/jpeg/exifRewrite/ExifRewriter;->b()V

    return-void
.end method

.method private a(Ljava/io/OutputStream;Ljava/util/List;[B)V
    .locals 9

    const v8, 0xffff

    const/4 v1, 0x1

    const/4 v3, 0x0

    invoke-virtual {p0}, Lorg/apache/sanselan/formats/jpeg/exifRewrite/ExifRewriter;->c()I

    move-result v5

    :try_start_0
    sget-object v0, Lorg/apache/sanselan/formats/jpeg/exifRewrite/ExifRewriter;->e:[B

    invoke-virtual {p1, v0}, Ljava/io/OutputStream;->write([B)V

    move v4, v3

    move v2, v3

    :goto_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    if-lt v4, v0, :cond_0

    if-nez v2, :cond_2

    if-eqz p3, :cond_2

    const v0, 0xffe1

    invoke-static {v0, v5}, Lorg/apache/sanselan/formats/jpeg/exifRewrite/ExifRewriter;->a(II)[B

    move-result-object v2

    array-length v0, p3

    if-le v0, v8, :cond_1

    new-instance v0, Lorg/apache/sanselan/formats/jpeg/exifRewrite/ExifRewriter$ExifOverflowException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "APP1 Segment is too long: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    array-length v2, p3

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/apache/sanselan/formats/jpeg/exifRewrite/ExifRewriter$ExifOverflowException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    move-exception v0

    :try_start_1
    invoke-virtual {p1}, Ljava/io/OutputStream;->close()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    :goto_1
    throw v0

    :cond_0
    :try_start_2
    invoke-interface {p2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/apache/sanselan/formats/jpeg/exifRewrite/ExifRewriter$JFIFPiece;

    instance-of v0, v0, Lorg/apache/sanselan/formats/jpeg/exifRewrite/ExifRewriter$JFIFPieceSegmentExif;

    if-eqz v0, :cond_8

    move v0, v1

    :goto_2
    add-int/lit8 v2, v4, 0x1

    move v4, v2

    move v2, v0

    goto :goto_0

    :cond_1
    array-length v0, p3

    add-int/lit8 v0, v0, 0x2

    invoke-static {v0, v5}, Lorg/apache/sanselan/formats/jpeg/exifRewrite/ExifRewriter;->a(II)[B

    move-result-object v4

    const/4 v0, 0x0

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/apache/sanselan/formats/jpeg/exifRewrite/ExifRewriter$JFIFPieceSegment;

    iget v0, v0, Lorg/apache/sanselan/formats/jpeg/exifRewrite/ExifRewriter$JFIFPieceSegment;->a:I

    const/4 v0, 0x0

    new-instance v6, Lorg/apache/sanselan/formats/jpeg/exifRewrite/ExifRewriter$JFIFPieceSegmentExif;

    const v7, 0xffe1

    invoke-direct {v6, v7, v2, v4, p3}, Lorg/apache/sanselan/formats/jpeg/exifRewrite/ExifRewriter$JFIFPieceSegmentExif;-><init>(I[B[B[B)V

    invoke-interface {p2, v0, v6}, Ljava/util/List;->add(ILjava/lang/Object;)V

    :cond_2
    move v2, v3

    :goto_3
    invoke-interface {p2}, Ljava/util/List;->size()I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-result v0

    if-lt v3, v0, :cond_3

    :try_start_3
    invoke-virtual {p1}, Ljava/io/OutputStream;->close()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    :goto_4
    return-void

    :cond_3
    :try_start_4
    invoke-interface {p2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/apache/sanselan/formats/jpeg/exifRewrite/ExifRewriter$JFIFPiece;

    instance-of v4, v0, Lorg/apache/sanselan/formats/jpeg/exifRewrite/ExifRewriter$JFIFPieceSegmentExif;

    if-eqz v4, :cond_5

    if-nez v2, :cond_6

    if-eqz p3, :cond_7

    const v0, 0xffe1

    invoke-static {v0, v5}, Lorg/apache/sanselan/formats/jpeg/exifRewrite/ExifRewriter;->a(II)[B

    move-result-object v0

    array-length v2, p3

    if-le v2, v8, :cond_4

    new-instance v0, Lorg/apache/sanselan/formats/jpeg/exifRewrite/ExifRewriter$ExifOverflowException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "APP1 Segment is too long: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    array-length v2, p3

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/apache/sanselan/formats/jpeg/exifRewrite/ExifRewriter$ExifOverflowException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    array-length v2, p3

    add-int/lit8 v2, v2, 0x2

    invoke-static {v2, v5}, Lorg/apache/sanselan/formats/jpeg/exifRewrite/ExifRewriter;->a(II)[B

    move-result-object v2

    invoke-virtual {p1, v0}, Ljava/io/OutputStream;->write([B)V

    invoke-virtual {p1, v2}, Ljava/io/OutputStream;->write([B)V

    invoke-virtual {p1, p3}, Ljava/io/OutputStream;->write([B)V

    move v0, v1

    :goto_5
    add-int/lit8 v2, v3, 0x1

    move v3, v2

    move v2, v0

    goto :goto_3

    :cond_5
    invoke-virtual {v0, p1}, Lorg/apache/sanselan/formats/jpeg/exifRewrite/ExifRewriter$JFIFPiece;->a(Ljava/io/OutputStream;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :cond_6
    move v0, v2

    goto :goto_5

    :catch_0
    move-exception v1

    invoke-static {v1}, Lorg/apache/sanselan/util/Debug;->a(Ljava/lang/Throwable;)V

    goto/16 :goto_1

    :catch_1
    move-exception v0

    invoke-static {v0}, Lorg/apache/sanselan/util/Debug;->a(Ljava/lang/Throwable;)V

    goto :goto_4

    :cond_7
    move v0, v1

    goto :goto_5

    :cond_8
    move v0, v2

    goto/16 :goto_2
.end method


# virtual methods
.method public final a([BLjava/io/OutputStream;Lorg/apache/sanselan/formats/tiff/write/TiffOutputSet;)V
    .locals 6

    const/4 v5, 0x0

    new-instance v0, Lorg/apache/sanselan/common/byteSources/ByteSourceArray;

    invoke-direct {v0, p1}, Lorg/apache/sanselan/common/byteSources/ByteSourceArray;-><init>([B)V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    new-instance v3, Lorg/apache/sanselan/formats/jpeg/exifRewrite/ExifRewriter$1;

    invoke-direct {v3, p0, v1, v2}, Lorg/apache/sanselan/formats/jpeg/exifRewrite/ExifRewriter$1;-><init>(Lorg/apache/sanselan/formats/jpeg/exifRewrite/ExifRewriter;Ljava/util/ArrayList;Ljava/util/List;)V

    new-instance v4, Lorg/apache/sanselan/formats/jpeg/JpegUtils;

    invoke-direct {v4}, Lorg/apache/sanselan/formats/jpeg/JpegUtils;-><init>()V

    invoke-virtual {v4, v0, v3}, Lorg/apache/sanselan/formats/jpeg/JpegUtils;->a(Lorg/apache/sanselan/common/byteSources/ByteSource;Lorg/apache/sanselan/formats/jpeg/JpegUtils$Visitor;)V

    new-instance v0, Lorg/apache/sanselan/formats/jpeg/exifRewrite/ExifRewriter$JFIFPieces;

    invoke-direct {v0, v1, v2}, Lorg/apache/sanselan/formats/jpeg/exifRewrite/ExifRewriter$JFIFPieces;-><init>(Ljava/util/List;Ljava/util/List;)V

    iget-object v1, v0, Lorg/apache/sanselan/formats/jpeg/exifRewrite/ExifRewriter$JFIFPieces;->a:Ljava/util/List;

    iget-object v2, v0, Lorg/apache/sanselan/formats/jpeg/exifRewrite/ExifRewriter$JFIFPieces;->b:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-lez v2, :cond_0

    iget-object v0, v0, Lorg/apache/sanselan/formats/jpeg/exifRewrite/ExifRewriter$JFIFPieces;->b:Ljava/util/List;

    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/apache/sanselan/formats/jpeg/exifRewrite/ExifRewriter$JFIFPieceSegment;

    iget-object v0, v0, Lorg/apache/sanselan/formats/jpeg/exifRewrite/ExifRewriter$JFIFPieceSegment;->d:[B

    const-string v2, "trimmed exif bytes"

    invoke-virtual {p0, v2, v0}, Lorg/apache/sanselan/formats/jpeg/exifRewrite/ExifRewriter;->a(Ljava/lang/String;[B)[B

    move-result-object v2

    new-instance v0, Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterLossless;

    iget v3, p3, Lorg/apache/sanselan/formats/tiff/write/TiffOutputSet;->a:I

    invoke-direct {v0, v3, v2}, Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterLossless;-><init>(I[B)V

    :goto_0
    new-instance v2, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v2}, Ljava/io/ByteArrayOutputStream;-><init>()V

    sget-object v3, Lorg/apache/sanselan/formats/jpeg/exifRewrite/ExifRewriter;->c:[B

    invoke-virtual {v2, v3}, Ljava/io/ByteArrayOutputStream;->write([B)V

    invoke-virtual {v2, v5}, Ljava/io/ByteArrayOutputStream;->write(I)V

    invoke-virtual {v2, v5}, Ljava/io/ByteArrayOutputStream;->write(I)V

    invoke-virtual {v0, v2, p3}, Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterBase;->a(Ljava/io/OutputStream;Lorg/apache/sanselan/formats/tiff/write/TiffOutputSet;)V

    invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    invoke-direct {p0, p2, v1, v0}, Lorg/apache/sanselan/formats/jpeg/exifRewrite/ExifRewriter;->a(Ljava/io/OutputStream;Ljava/util/List;[B)V

    return-void

    :cond_0
    new-instance v0, Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterLossy;

    iget v2, p3, Lorg/apache/sanselan/formats/tiff/write/TiffOutputSet;->a:I

    invoke-direct {v0, v2}, Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterLossy;-><init>(I)V

    goto :goto_0
.end method
