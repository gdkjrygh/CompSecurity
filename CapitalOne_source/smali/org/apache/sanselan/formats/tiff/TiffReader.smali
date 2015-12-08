.class public Lorg/apache/sanselan/formats/tiff/TiffReader;
.super Lorg/apache/sanselan/common/BinaryFileParser;

# interfaces
.implements Lorg/apache/sanselan/formats/tiff/constants/TiffConstants;


# instance fields
.field private final b:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lorg/apache/sanselan/common/BinaryFileParser;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lorg/apache/sanselan/formats/tiff/TiffReader;->b:Z

    return-void
.end method

.method private a(Lorg/apache/sanselan/common/byteSources/ByteSource;)Lorg/apache/sanselan/formats/tiff/TiffHeader;
    .locals 6

    const/4 v1, 0x0

    :try_start_0
    invoke-virtual {p1}, Lorg/apache/sanselan/common/byteSources/ByteSource;->b()Ljava/io/InputStream;

    move-result-object v1

    const-string v0, "BYTE_ORDER_1"

    const-string v2, "Not a Valid TIFF File"

    invoke-virtual {p0, v0, v1, v2}, Lorg/apache/sanselan/formats/tiff/TiffReader;->a(Ljava/lang/String;Ljava/io/InputStream;Ljava/lang/String;)B

    move-result v0

    const-string v2, "BYTE_ORDER_2"

    const-string v3, "Not a Valid TIFF File"

    invoke-virtual {p0, v2, v1, v3}, Lorg/apache/sanselan/formats/tiff/TiffReader;->a(Ljava/lang/String;Ljava/io/InputStream;Ljava/lang/String;)B

    move-result v2

    invoke-virtual {p0, v0, v2}, Lorg/apache/sanselan/formats/tiff/TiffReader;->b(II)V

    const-string v2, "tiffVersion"

    const-string v3, "Not a Valid TIFF File"

    invoke-virtual {p0, v2, v1, v3}, Lorg/apache/sanselan/formats/tiff/TiffReader;->c(Ljava/lang/String;Ljava/io/InputStream;Ljava/lang/String;)I

    move-result v2

    const/16 v3, 0x2a

    if-eq v2, v3, :cond_1

    new-instance v0, Lorg/apache/sanselan/ImageReadException;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Unknown Tiff Version: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Lorg/apache/sanselan/ImageReadException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    move-exception v0

    if-eqz v1, :cond_0

    :try_start_1
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    :cond_0
    :goto_0
    throw v0

    :cond_1
    :try_start_2
    const-string v3, "offsetToFirstIFD"

    const-string v4, "Not a Valid TIFF File"

    invoke-virtual {p0, v3, v1, v4}, Lorg/apache/sanselan/formats/tiff/TiffReader;->b(Ljava/lang/String;Ljava/io/InputStream;Ljava/lang/String;)I

    move-result v3

    add-int/lit8 v4, v3, -0x8

    const-string v5, "Not a Valid TIFF File: couldn\'t find IFDs"

    invoke-static {v1, v4, v5}, Lorg/apache/sanselan/formats/tiff/TiffReader;->a(Ljava/io/InputStream;ILjava/lang/String;)V

    iget-boolean v4, p0, Lorg/apache/sanselan/formats/tiff/TiffReader;->a_:Z

    if-eqz v4, :cond_2

    sget-object v4, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v5, ""

    invoke-virtual {v4, v5}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    :cond_2
    new-instance v4, Lorg/apache/sanselan/formats/tiff/TiffHeader;

    invoke-direct {v4, v0, v2, v3}, Lorg/apache/sanselan/formats/tiff/TiffHeader;-><init>(III)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz v1, :cond_3

    :try_start_3
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    :cond_3
    :goto_1
    return-object v4

    :catch_0
    move-exception v0

    invoke-static {v0}, Lorg/apache/sanselan/util/Debug;->a(Ljava/lang/Throwable;)V

    goto :goto_1

    :catch_1
    move-exception v1

    invoke-static {v1}, Lorg/apache/sanselan/util/Debug;->a(Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method private a(Lorg/apache/sanselan/common/byteSources/ByteSource;IILorg/apache/sanselan/FormatCompliance;Lorg/apache/sanselan/formats/tiff/TiffReader$Listener;Ljava/util/List;)Z
    .locals 8

    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v7, p6

    invoke-direct/range {v0 .. v7}, Lorg/apache/sanselan/formats/tiff/TiffReader;->a(Lorg/apache/sanselan/common/byteSources/ByteSource;IILorg/apache/sanselan/FormatCompliance;Lorg/apache/sanselan/formats/tiff/TiffReader$Listener;ZLjava/util/List;)Z

    move-result v0

    return v0
.end method

.method private a(Lorg/apache/sanselan/common/byteSources/ByteSource;IILorg/apache/sanselan/FormatCompliance;Lorg/apache/sanselan/formats/tiff/TiffReader$Listener;ZLjava/util/List;)Z
    .locals 16

    new-instance v2, Ljava/lang/Integer;

    move/from16 v0, p2

    invoke-direct {v2, v0}, Ljava/lang/Integer;-><init>(I)V

    move-object/from16 v0, p7

    invoke-interface {v0, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v2, 0x0

    :goto_0
    return v2

    :cond_0
    move-object/from16 v0, p7

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/4 v3, 0x0

    :try_start_0
    invoke-virtual/range {p1 .. p1}, Lorg/apache/sanselan/common/byteSources/ByteSource;->b()Ljava/io/InputStream;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    move-result-object v11

    if-lez p2, :cond_1

    move/from16 v0, p2

    int-to-long v2, v0

    :try_start_1
    invoke-virtual {v11, v2, v3}, Ljava/io/InputStream;->skip(J)J

    :cond_1
    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    move/from16 v0, p2

    int-to-long v2, v0

    invoke-virtual/range {p1 .. p1}, Lorg/apache/sanselan/common/byteSources/ByteSource;->c()J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-wide v4

    cmp-long v2, v2, v4

    if-ltz v2, :cond_3

    if-eqz v11, :cond_2

    :try_start_2
    invoke-virtual {v11}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    :cond_2
    :goto_1
    const/4 v2, 0x1

    goto :goto_0

    :catch_0
    move-exception v2

    invoke-static {v2}, Lorg/apache/sanselan/util/Debug;->a(Ljava/lang/Throwable;)V

    goto :goto_1

    :cond_3
    :try_start_3
    const-string v2, "DirectoryEntryCount"

    const-string v3, "Not a Valid TIFF File"

    move-object/from16 v0, p0

    invoke-virtual {v0, v2, v11, v3}, Lorg/apache/sanselan/formats/tiff/TiffReader;->c(Ljava/lang/String;Ljava/io/InputStream;Ljava/lang/String;)I
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    move-result v12

    const/4 v2, 0x0

    move v10, v2

    :goto_2
    if-lt v10, v12, :cond_a

    :try_start_4
    const-string v2, "nextDirectoryOffset"

    const-string v3, "Not a Valid TIFF File"

    move-object/from16 v0, p0

    invoke-virtual {v0, v2, v11, v3}, Lorg/apache/sanselan/formats/tiff/TiffReader;->b(Ljava/lang/String;Ljava/io/InputStream;Ljava/lang/String;)I

    move-result v2

    new-instance v14, Lorg/apache/sanselan/formats/tiff/TiffDirectory;

    move/from16 v0, p3

    move/from16 v1, p2

    invoke-direct {v14, v0, v13, v1, v2}, Lorg/apache/sanselan/formats/tiff/TiffDirectory;-><init>(ILjava/util/ArrayList;II)V

    invoke-interface/range {p5 .. p5}, Lorg/apache/sanselan/formats/tiff/TiffReader$Listener;->a()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-virtual {v14}, Lorg/apache/sanselan/formats/tiff/TiffDirectory;->c()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-virtual {v14}, Lorg/apache/sanselan/formats/tiff/TiffDirectory;->d()Lorg/apache/sanselan/formats/tiff/TiffDirectory$ImageDataElement;

    move-result-object v2

    iget v3, v2, Lorg/apache/sanselan/formats/tiff/TiffDirectory$ImageDataElement;->d:I

    iget v2, v2, Lorg/apache/sanselan/formats/tiff/TiffDirectory$ImageDataElement;->e:I

    add-int v4, v3, v2

    int-to-long v4, v4

    invoke-virtual/range {p1 .. p1}, Lorg/apache/sanselan/common/byteSources/ByteSource;->c()J

    move-result-wide v6

    const-wide/16 v8, 0x1

    add-long/2addr v6, v8

    cmp-long v4, v4, v6

    if-nez v4, :cond_4

    add-int/lit8 v2, v2, -0x1

    :cond_4
    move-object/from16 v0, p1

    invoke-virtual {v0, v3, v2}, Lorg/apache/sanselan/common/byteSources/ByteSource;->b(II)[B

    move-result-object v4

    new-instance v5, Lorg/apache/sanselan/formats/tiff/JpegImageData;

    invoke-direct {v5, v3, v2, v4}, Lorg/apache/sanselan/formats/tiff/JpegImageData;-><init>(II[B)V

    invoke-virtual {v14, v5}, Lorg/apache/sanselan/formats/tiff/TiffDirectory;->a(Lorg/apache/sanselan/formats/tiff/JpegImageData;)V

    :cond_5
    move-object/from16 v0, p5

    invoke-interface {v0, v14}, Lorg/apache/sanselan/formats/tiff/TiffReader$Listener;->a(Lorg/apache/sanselan/formats/tiff/TiffDirectory;)Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    move-result v2

    if-nez v2, :cond_c

    if-eqz v11, :cond_6

    :try_start_5
    invoke-virtual {v11}, Ljava/io/InputStream;->close()V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_3

    :cond_6
    :goto_3
    const/4 v2, 0x1

    goto/16 :goto_0

    :catch_1
    move-exception v2

    :try_start_6
    move-object/from16 v0, p0

    iget-boolean v3, v0, Lorg/apache/sanselan/formats/tiff/TiffReader;->b:Z

    if-eqz v3, :cond_8

    throw v2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    :catchall_0
    move-exception v2

    move-object v3, v11

    :goto_4
    if-eqz v3, :cond_7

    :try_start_7
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_5

    :cond_7
    :goto_5
    throw v2

    :cond_8
    if-eqz v11, :cond_9

    :try_start_8
    invoke-virtual {v11}, Ljava/io/InputStream;->close()V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_2

    :cond_9
    :goto_6
    const/4 v2, 0x1

    goto/16 :goto_0

    :catch_2
    move-exception v2

    invoke-static {v2}, Lorg/apache/sanselan/util/Debug;->a(Ljava/lang/Throwable;)V

    goto :goto_6

    :cond_a
    :try_start_9
    const-string v2, "Tag"

    const-string v3, "Not a Valid TIFF File"

    move-object/from16 v0, p0

    invoke-virtual {v0, v2, v11, v3}, Lorg/apache/sanselan/formats/tiff/TiffReader;->c(Ljava/lang/String;Ljava/io/InputStream;Ljava/lang/String;)I

    move-result v3

    const-string v2, "Type"

    const-string v4, "Not a Valid TIFF File"

    move-object/from16 v0, p0

    invoke-virtual {v0, v2, v11, v4}, Lorg/apache/sanselan/formats/tiff/TiffReader;->c(Ljava/lang/String;Ljava/io/InputStream;Ljava/lang/String;)I

    move-result v5

    const-string v2, "Length"

    const-string v4, "Not a Valid TIFF File"

    move-object/from16 v0, p0

    invoke-virtual {v0, v2, v11, v4}, Lorg/apache/sanselan/formats/tiff/TiffReader;->b(Ljava/lang/String;Ljava/io/InputStream;Ljava/lang/String;)I

    move-result v6

    const-string v2, "ValueOffset"

    const/4 v4, 0x4

    const-string v7, "Not a Valid TIFF File"

    move-object/from16 v0, p0

    invoke-virtual {v0, v2, v4, v11, v7}, Lorg/apache/sanselan/formats/tiff/TiffReader;->a(Ljava/lang/String;ILjava/io/InputStream;Ljava/lang/String;)[B

    move-result-object v8

    const-string v2, "ValueOffset"

    move-object/from16 v0, p0

    invoke-virtual {v0, v2, v8}, Lorg/apache/sanselan/formats/tiff/TiffReader;->b(Ljava/lang/String;[B)I

    move-result v7

    if-eqz v3, :cond_b

    new-instance v2, Lorg/apache/sanselan/formats/tiff/TiffField;

    invoke-virtual/range {p0 .. p0}, Lorg/apache/sanselan/formats/tiff/TiffReader;->c()I

    move-result v9

    move/from16 v4, p3

    invoke-direct/range {v2 .. v9}, Lorg/apache/sanselan/formats/tiff/TiffField;-><init>(IIIII[BI)V

    invoke-virtual {v2, v10}, Lorg/apache/sanselan/formats/tiff/TiffField;->a(I)V

    move-object/from16 v0, p1

    invoke-virtual {v2, v0}, Lorg/apache/sanselan/formats/tiff/TiffField;->a(Lorg/apache/sanselan/common/byteSources/ByteSource;)V

    invoke-virtual {v13, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v0, p5

    invoke-interface {v0, v2}, Lorg/apache/sanselan/formats/tiff/TiffReader$Listener;->a(Lorg/apache/sanselan/formats/tiff/TiffField;)Z
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    :cond_b
    add-int/lit8 v2, v10, 0x1

    move v10, v2

    goto/16 :goto_2

    :catch_3
    move-exception v2

    invoke-static {v2}, Lorg/apache/sanselan/util/Debug;->a(Ljava/lang/Throwable;)V

    goto :goto_3

    :cond_c
    :try_start_a
    invoke-interface/range {p5 .. p5}, Lorg/apache/sanselan/formats/tiff/TiffReader$Listener;->b()Z

    new-instance v15, Ljava/util/ArrayList;

    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    const/4 v2, 0x0

    move v12, v2

    :goto_7
    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-lt v12, v2, :cond_f

    invoke-virtual {v13, v15}, Ljava/util/ArrayList;->removeAll(Ljava/util/Collection;)Z

    if-nez p6, :cond_d

    iget v2, v14, Lorg/apache/sanselan/formats/tiff/TiffDirectory;->c:I

    if-lez v2, :cond_d

    iget v4, v14, Lorg/apache/sanselan/formats/tiff/TiffDirectory;->c:I

    add-int/lit8 v5, p3, 0x1

    move-object/from16 v2, p0

    move-object/from16 v3, p1

    move-object/from16 v6, p4

    move-object/from16 v7, p5

    move-object/from16 v8, p7

    invoke-direct/range {v2 .. v8}, Lorg/apache/sanselan/formats/tiff/TiffReader;->a(Lorg/apache/sanselan/common/byteSources/ByteSource;IILorg/apache/sanselan/FormatCompliance;Lorg/apache/sanselan/formats/tiff/TiffReader$Listener;Ljava/util/List;)Z
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    :cond_d
    if-eqz v11, :cond_e

    :try_start_b
    invoke-virtual {v11}, Ljava/io/InputStream;->close()V
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_4

    :cond_e
    :goto_8
    const/4 v2, 0x1

    goto/16 :goto_0

    :cond_f
    :try_start_c
    invoke-virtual {v13, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    move-object v0, v2

    check-cast v0, Lorg/apache/sanselan/formats/tiff/TiffField;

    move-object v10, v0

    iget v2, v10, Lorg/apache/sanselan/formats/tiff/TiffField;->c:I

    sget-object v3, Lorg/apache/sanselan/formats/tiff/constants/TiffConstants;->co:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    iget v3, v3, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;->b:I

    if-eq v2, v3, :cond_10

    iget v2, v10, Lorg/apache/sanselan/formats/tiff/TiffField;->c:I

    sget-object v3, Lorg/apache/sanselan/formats/tiff/constants/TiffConstants;->cw:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    iget v3, v3, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;->b:I

    if-eq v2, v3, :cond_10

    iget v2, v10, Lorg/apache/sanselan/formats/tiff/TiffField;->c:I

    sget-object v3, Lorg/apache/sanselan/formats/tiff/constants/TiffConstants;->dz:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    iget v3, v3, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;->b:I

    if-ne v2, v3, :cond_11

    :cond_10
    invoke-virtual {v10}, Lorg/apache/sanselan/formats/tiff/TiffField;->c()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v4

    iget v2, v10, Lorg/apache/sanselan/formats/tiff/TiffField;->c:I

    sget-object v3, Lorg/apache/sanselan/formats/tiff/constants/TiffConstants;->co:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    iget v3, v3, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;->b:I

    if-ne v2, v3, :cond_12

    const/4 v5, -0x2

    :goto_9
    const/4 v8, 0x1

    move-object/from16 v2, p0

    move-object/from16 v3, p1

    move-object/from16 v6, p4

    move-object/from16 v7, p5

    move-object/from16 v9, p7

    invoke-direct/range {v2 .. v9}, Lorg/apache/sanselan/formats/tiff/TiffReader;->a(Lorg/apache/sanselan/common/byteSources/ByteSource;IILorg/apache/sanselan/FormatCompliance;Lorg/apache/sanselan/formats/tiff/TiffReader$Listener;ZLjava/util/List;)Z

    move-result v2

    if-nez v2, :cond_11

    invoke-interface {v15, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_11
    add-int/lit8 v2, v12, 0x1

    move v12, v2

    goto :goto_7

    :cond_12
    iget v2, v10, Lorg/apache/sanselan/formats/tiff/TiffField;->c:I

    sget-object v3, Lorg/apache/sanselan/formats/tiff/constants/TiffConstants;->cw:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    iget v3, v3, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;->b:I

    if-ne v2, v3, :cond_13

    const/4 v5, -0x3

    goto :goto_9

    :cond_13
    iget v2, v10, Lorg/apache/sanselan/formats/tiff/TiffField;->c:I

    sget-object v3, Lorg/apache/sanselan/formats/tiff/constants/TiffConstants;->dz:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    iget v3, v3, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;->b:I

    if-ne v2, v3, :cond_14

    const/4 v5, -0x4

    goto :goto_9

    :cond_14
    new-instance v2, Lorg/apache/sanselan/ImageReadException;

    const-string v3, "Unknown subdirectory type."

    invoke-direct {v2, v3}, Lorg/apache/sanselan/ImageReadException;-><init>(Ljava/lang/String;)V

    throw v2
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_0

    :catch_4
    move-exception v2

    invoke-static {v2}, Lorg/apache/sanselan/util/Debug;->a(Ljava/lang/Throwable;)V

    goto :goto_8

    :catch_5
    move-exception v3

    invoke-static {v3}, Lorg/apache/sanselan/util/Debug;->a(Ljava/lang/Throwable;)V

    goto/16 :goto_5

    :catchall_1
    move-exception v2

    goto/16 :goto_4
.end method


# virtual methods
.method public final a(Lorg/apache/sanselan/common/byteSources/ByteSource;Lorg/apache/sanselan/FormatCompliance;)Lorg/apache/sanselan/formats/tiff/TiffContents;
    .locals 7

    const/4 v3, 0x0

    new-instance v5, Lorg/apache/sanselan/formats/tiff/TiffReader$Collector;

    invoke-direct {v5, v3}, Lorg/apache/sanselan/formats/tiff/TiffReader$Collector;-><init>(B)V

    invoke-direct {p0, p1}, Lorg/apache/sanselan/formats/tiff/TiffReader;->a(Lorg/apache/sanselan/common/byteSources/ByteSource;)Lorg/apache/sanselan/formats/tiff/TiffHeader;

    move-result-object v0

    invoke-interface {v5, v0}, Lorg/apache/sanselan/formats/tiff/TiffReader$Listener;->a(Lorg/apache/sanselan/formats/tiff/TiffHeader;)Z

    iget v2, v0, Lorg/apache/sanselan/formats/tiff/TiffHeader;->c:I

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    move-object v0, p0

    move-object v1, p1

    move-object v4, p2

    invoke-direct/range {v0 .. v6}, Lorg/apache/sanselan/formats/tiff/TiffReader;->a(Lorg/apache/sanselan/common/byteSources/ByteSource;IILorg/apache/sanselan/FormatCompliance;Lorg/apache/sanselan/formats/tiff/TiffReader$Listener;Ljava/util/List;)Z

    invoke-virtual {v5}, Lorg/apache/sanselan/formats/tiff/TiffReader$Collector;->c()Lorg/apache/sanselan/formats/tiff/TiffContents;

    move-result-object v0

    return-object v0
.end method
