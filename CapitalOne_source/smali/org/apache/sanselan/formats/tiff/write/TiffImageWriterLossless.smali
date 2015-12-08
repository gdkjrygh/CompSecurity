.class public Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterLossless;
.super Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterBase;


# static fields
.field private static final c:Ljava/util/Comparator;

.field private static final d:Ljava/util/Comparator;


# instance fields
.field private final b:[B


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterLossless$1;

    invoke-direct {v0}, Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterLossless$1;-><init>()V

    sput-object v0, Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterLossless;->c:Ljava/util/Comparator;

    new-instance v0, Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterLossless$2;

    invoke-direct {v0}, Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterLossless$2;-><init>()V

    sput-object v0, Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterLossless;->d:Ljava/util/Comparator;

    return-void
.end method

.method public constructor <init>(I[B)V
    .locals 0

    invoke-direct {p0, p1}, Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterBase;-><init>(I)V

    iput-object p2, p0, Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterLossless;->b:[B

    return-void
.end method

.method private a()Ljava/util/List;
    .locals 9

    const/4 v2, 0x0

    :try_start_0
    new-instance v0, Lorg/apache/sanselan/common/byteSources/ByteSourceArray;

    iget-object v1, p0, Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterLossless;->b:[B

    invoke-direct {v0, v1}, Lorg/apache/sanselan/common/byteSources/ByteSourceArray;-><init>([B)V

    invoke-static {}, Lorg/apache/sanselan/FormatCompliance;->a()Lorg/apache/sanselan/FormatCompliance;

    move-result-object v1

    new-instance v3, Lorg/apache/sanselan/formats/tiff/TiffReader;

    invoke-direct {v3}, Lorg/apache/sanselan/formats/tiff/TiffReader;-><init>()V

    invoke-virtual {v3, v0, v1}, Lorg/apache/sanselan/formats/tiff/TiffReader;->a(Lorg/apache/sanselan/common/byteSources/ByteSource;Lorg/apache/sanselan/FormatCompliance;)Lorg/apache/sanselan/formats/tiff/TiffContents;

    move-result-object v0

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    iget-object v6, v0, Lorg/apache/sanselan/formats/tiff/TiffContents;->b:Ljava/util/ArrayList;

    move v4, v2

    :goto_0
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    if-lt v4, v0, :cond_1

    sget-object v0, Lorg/apache/sanselan/formats/tiff/TiffElement;->f:Ljava/util/Comparator;

    invoke-static {v5, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    const/4 v0, -0x1

    move v4, v2

    move v2, v0

    :goto_1
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lt v4, v0, :cond_5

    if-eqz v1, :cond_0

    new-instance v0, Lorg/apache/sanselan/formats/tiff/TiffElement$Stub;

    iget v3, v1, Lorg/apache/sanselan/formats/tiff/TiffElement;->d:I

    iget v1, v1, Lorg/apache/sanselan/formats/tiff/TiffElement;->d:I

    sub-int v1, v2, v1

    invoke-direct {v0, v3, v1}, Lorg/apache/sanselan/formats/tiff/TiffElement$Stub;-><init>(II)V

    invoke-interface {v6, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    return-object v6

    :cond_1
    invoke-interface {v6, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/apache/sanselan/formats/tiff/TiffDirectory;

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v0}, Lorg/apache/sanselan/formats/tiff/TiffDirectory;->b()Ljava/util/ArrayList;

    move-result-object v7

    move v3, v2

    :goto_2
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v1

    if-lt v3, v1, :cond_3

    invoke-virtual {v0}, Lorg/apache/sanselan/formats/tiff/TiffDirectory;->e()Lorg/apache/sanselan/formats/tiff/JpegImageData;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2
    add-int/lit8 v0, v4, 0x1

    move v4, v0

    goto :goto_0

    :cond_3
    invoke-interface {v7, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/apache/sanselan/formats/tiff/TiffField;

    invoke-virtual {v1}, Lorg/apache/sanselan/formats/tiff/TiffField;->a()Lorg/apache/sanselan/formats/tiff/TiffElement;

    move-result-object v1

    if-eqz v1, :cond_4

    invoke-virtual {v5, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_4
    add-int/lit8 v1, v3, 0x1

    move v3, v1

    goto :goto_2

    :cond_5
    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/apache/sanselan/formats/tiff/TiffElement;

    iget v3, v0, Lorg/apache/sanselan/formats/tiff/TiffElement;->d:I

    iget v7, v0, Lorg/apache/sanselan/formats/tiff/TiffElement;->e:I

    add-int/2addr v3, v7

    if-nez v1, :cond_6

    :goto_3
    add-int/lit8 v1, v4, 0x1

    move v2, v3

    move v4, v1

    move-object v1, v0

    goto :goto_1

    :cond_6
    iget v7, v0, Lorg/apache/sanselan/formats/tiff/TiffElement;->d:I

    sub-int/2addr v7, v2

    const/4 v8, 0x3

    if-le v7, v8, :cond_7

    new-instance v7, Lorg/apache/sanselan/formats/tiff/TiffElement$Stub;

    iget v8, v1, Lorg/apache/sanselan/formats/tiff/TiffElement;->d:I

    iget v1, v1, Lorg/apache/sanselan/formats/tiff/TiffElement;->d:I

    sub-int v1, v2, v1

    invoke-direct {v7, v8, v1}, Lorg/apache/sanselan/formats/tiff/TiffElement$Stub;-><init>(II)V

    invoke-interface {v6, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Lorg/apache/sanselan/ImageReadException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :catch_0
    move-exception v0

    new-instance v1, Lorg/apache/sanselan/ImageWriteException;

    invoke-virtual {v0}, Lorg/apache/sanselan/ImageReadException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Lorg/apache/sanselan/ImageWriteException;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    throw v1

    :cond_7
    move-object v0, v1

    goto :goto_3
.end method

.method private a(Ljava/io/OutputStream;Lorg/apache/sanselan/formats/tiff/write/TiffOutputSet;Ljava/util/List;Ljava/util/List;I)V
    .locals 7

    const/4 v2, 0x0

    invoke-virtual {p2}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputSet;->b()Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;

    move-result-object v0

    new-array v4, p5, [B

    iget-object v1, p0, Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterLossless;->b:[B

    iget-object v3, p0, Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterLossless;->b:[B

    array-length v3, v3

    array-length v5, v4

    invoke-static {v3, v5}, Ljava/lang/Math;->min(II)I

    move-result v3

    invoke-static {v1, v2, v4, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    new-instance v1, Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterLossless$BufferOutputStream;

    invoke-direct {v1, v4, v2}, Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterLossless$BufferOutputStream;-><init>([BI)V

    new-instance v3, Lorg/apache/sanselan/common/BinaryOutputStream;

    iget v5, p0, Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterLossless;->a:I

    invoke-direct {v3, v1, v5}, Lorg/apache/sanselan/common/BinaryOutputStream;-><init>(Ljava/io/OutputStream;I)V

    invoke-virtual {v0}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;->d()I

    move-result v0

    invoke-virtual {p0, v3, v0}, Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterLossless;->a(Lorg/apache/sanselan/common/BinaryOutputStream;I)V

    move v3, v2

    :goto_0
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v0

    if-lt v3, v0, :cond_0

    :goto_1
    invoke-interface {p4}, Ljava/util/List;->size()I

    move-result v0

    if-lt v2, v0, :cond_3

    invoke-virtual {p1, v4}, Ljava/io/OutputStream;->write([B)V

    return-void

    :cond_0
    invoke-interface {p3, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/apache/sanselan/formats/tiff/TiffElement;

    move v1, v2

    :goto_2
    iget v5, v0, Lorg/apache/sanselan/formats/tiff/TiffElement;->e:I

    if-lt v1, v5, :cond_1

    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto :goto_0

    :cond_1
    iget v5, v0, Lorg/apache/sanselan/formats/tiff/TiffElement;->d:I

    add-int/2addr v5, v1

    array-length v6, v4

    if-ge v5, v6, :cond_2

    aput-byte v2, v4, v5

    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_3
    invoke-interface {p4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputItem;

    new-instance v1, Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterLossless$BufferOutputStream;

    invoke-virtual {v0}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputItem;->d()I

    move-result v3

    invoke-direct {v1, v4, v3}, Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterLossless$BufferOutputStream;-><init>([BI)V

    new-instance v3, Lorg/apache/sanselan/common/BinaryOutputStream;

    iget v5, p0, Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterLossless;->a:I

    invoke-direct {v3, v1, v5}, Lorg/apache/sanselan/common/BinaryOutputStream;-><init>(Ljava/io/OutputStream;I)V

    invoke-virtual {v0, v3}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputItem;->a(Lorg/apache/sanselan/common/BinaryOutputStream;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_1
.end method


# virtual methods
.method public final a(Ljava/io/OutputStream;Lorg/apache/sanselan/formats/tiff/write/TiffOutputSet;)V
    .locals 13

    const/4 v6, 0x0

    invoke-direct {p0}, Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterLossless;->a()Ljava/util/List;

    move-result-object v3

    iget-object v0, p0, Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterLossless;->b:[B

    array-length v1, v0

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v0

    if-gtz v0, :cond_0

    new-instance v0, Lorg/apache/sanselan/ImageWriteException;

    const-string v1, "Couldn\'t analyze old tiff data."

    invoke-direct {v0, v1}, Lorg/apache/sanselan/ImageWriteException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_1

    invoke-interface {v3, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/apache/sanselan/formats/tiff/TiffElement;

    iget v2, v0, Lorg/apache/sanselan/formats/tiff/TiffElement;->d:I

    const/16 v4, 0x8

    if-ne v2, v4, :cond_1

    iget v2, v0, Lorg/apache/sanselan/formats/tiff/TiffElement;->d:I

    iget v0, v0, Lorg/apache/sanselan/formats/tiff/TiffElement;->e:I

    add-int/2addr v0, v2

    add-int/lit8 v0, v0, 0x8

    if-ne v0, v1, :cond_1

    new-instance v0, Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterLossy;

    iget v1, p0, Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterLossless;->a:I

    invoke-direct {v0, v1}, Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterLossy;-><init>(I)V

    invoke-virtual {v0, p1, p2}, Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterLossy;->a(Ljava/io/OutputStream;Lorg/apache/sanselan/formats/tiff/write/TiffOutputSet;)V

    :goto_0
    return-void

    :cond_1
    invoke-virtual {p0, p2}, Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterLossless;->a(Lorg/apache/sanselan/formats/tiff/write/TiffOutputSet;)Lorg/apache/sanselan/formats/tiff/write/TiffOutputSummary;

    move-result-object v8

    invoke-virtual {p2, v8}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputSet;->a(Lorg/apache/sanselan/formats/tiff/write/TiffOutputSummary;)Ljava/util/List;

    move-result-object v4

    iget-object v0, p0, Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterLossless;->b:[B

    array-length v0, v0

    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    sget-object v1, Lorg/apache/sanselan/formats/tiff/TiffElement;->f:Ljava/util/Comparator;

    invoke-static {v9, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    invoke-static {v9}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    move v1, v0

    :goto_1
    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v0

    if-gtz v0, :cond_4

    :cond_2
    sget-object v0, Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterLossless;->c:Ljava/util/Comparator;

    invoke-static {v9, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    invoke-static {v9}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    sget-object v0, Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterLossless;->d:Ljava/util/Comparator;

    invoke-static {v10, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    invoke-static {v10}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    move v5, v1

    :cond_3
    :goto_2
    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v0

    if-gtz v0, :cond_5

    iget v0, p0, Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterLossless;->a:I

    invoke-virtual {v8, v0}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputSummary;->a(I)V

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    invoke-direct/range {v0 .. v5}, Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterLossless;->a(Ljava/io/OutputStream;Lorg/apache/sanselan/formats/tiff/write/TiffOutputSet;Ljava/util/List;Ljava/util/List;I)V

    goto :goto_0

    :cond_4
    invoke-interface {v9, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/apache/sanselan/formats/tiff/TiffElement;

    iget v2, v0, Lorg/apache/sanselan/formats/tiff/TiffElement;->d:I

    iget v5, v0, Lorg/apache/sanselan/formats/tiff/TiffElement;->e:I

    add-int/2addr v2, v5

    if-ne v2, v1, :cond_2

    iget v0, v0, Lorg/apache/sanselan/formats/tiff/TiffElement;->e:I

    sub-int v0, v1, v0

    invoke-interface {v9, v6}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move v1, v0

    goto :goto_1

    :cond_5
    invoke-interface {v10, v6}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lorg/apache/sanselan/formats/tiff/write/TiffOutputItem;

    invoke-virtual {v1}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputItem;->c()I

    move-result v11

    const/4 v0, 0x0

    move v2, v6

    move-object v7, v0

    :goto_3
    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v0

    if-lt v2, v0, :cond_7

    :cond_6
    if-nez v7, :cond_8

    invoke-virtual {v1, v5}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputItem;->a(I)V

    add-int/2addr v5, v11

    goto :goto_2

    :cond_7
    invoke-interface {v9, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/apache/sanselan/formats/tiff/TiffElement;

    iget v12, v0, Lorg/apache/sanselan/formats/tiff/TiffElement;->e:I

    if-lt v12, v11, :cond_6

    add-int/lit8 v2, v2, 0x1

    move-object v7, v0

    goto :goto_3

    :cond_8
    iget v0, v7, Lorg/apache/sanselan/formats/tiff/TiffElement;->d:I

    invoke-virtual {v1, v0}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputItem;->a(I)V

    invoke-interface {v9, v7}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    iget v0, v7, Lorg/apache/sanselan/formats/tiff/TiffElement;->e:I

    if-le v0, v11, :cond_3

    iget v0, v7, Lorg/apache/sanselan/formats/tiff/TiffElement;->d:I

    add-int/2addr v0, v11

    iget v1, v7, Lorg/apache/sanselan/formats/tiff/TiffElement;->e:I

    sub-int/2addr v1, v11

    new-instance v2, Lorg/apache/sanselan/formats/tiff/TiffElement$Stub;

    invoke-direct {v2, v0, v1}, Lorg/apache/sanselan/formats/tiff/TiffElement$Stub;-><init>(II)V

    invoke-interface {v9, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object v0, Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterLossless;->c:Ljava/util/Comparator;

    invoke-static {v9, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    invoke-static {v9}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    goto :goto_2
.end method
