.class public abstract Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterBase;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/apache/sanselan/common/BinaryConstants;
.implements Lorg/apache/sanselan/formats/tiff/constants/TiffConstants;


# instance fields
.field protected final a:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x49

    iput v0, p0, Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterBase;->a:I

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterBase;->a:I

    return-void
.end method


# virtual methods
.method protected final a(Lorg/apache/sanselan/formats/tiff/write/TiffOutputSet;)Lorg/apache/sanselan/formats/tiff/write/TiffOutputSummary;
    .locals 18

    invoke-virtual/range {p1 .. p1}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputSet;->a()Ljava/util/List;

    move-result-object v10

    const/4 v1, 0x1

    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v2

    if-le v1, v2, :cond_0

    new-instance v1, Lorg/apache/sanselan/ImageWriteException;

    const-string v2, "No directories."

    invoke-direct {v1, v2}, Lorg/apache/sanselan/ImageWriteException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_0
    const/4 v7, 0x0

    const/4 v6, 0x0

    const/4 v5, 0x0

    const/4 v4, 0x0

    const/4 v3, 0x0

    const/4 v2, 0x0

    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    new-instance v12, Ljava/util/HashMap;

    invoke-direct {v12}, Ljava/util/HashMap;-><init>()V

    const/4 v1, 0x0

    move-object v8, v7

    move-object v7, v6

    move v6, v1

    :goto_0
    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v1

    if-lt v6, v1, :cond_1

    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-gtz v1, :cond_e

    new-instance v1, Lorg/apache/sanselan/ImageWriteException;

    const-string v2, "Missing root directory."

    invoke-direct {v1, v2}, Lorg/apache/sanselan/ImageWriteException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    invoke-interface {v10, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;

    iget v9, v1, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;->a:I

    new-instance v13, Ljava/lang/Integer;

    invoke-direct {v13, v9}, Ljava/lang/Integer;-><init>(I)V

    invoke-interface {v12, v13, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-gez v9, :cond_5

    packed-switch v9, :pswitch_data_0

    new-instance v1, Lorg/apache/sanselan/ImageWriteException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Unknown directory: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Lorg/apache/sanselan/ImageWriteException;-><init>(Ljava/lang/String;)V

    throw v1

    :pswitch_0
    if-eqz v8, :cond_2

    new-instance v1, Lorg/apache/sanselan/ImageWriteException;

    const-string v2, "More than one EXIF directory."

    invoke-direct {v1, v2}, Lorg/apache/sanselan/ImageWriteException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    move-object v8, v7

    move-object v9, v1

    move-object v7, v5

    :goto_1
    new-instance v13, Ljava/util/HashSet;

    invoke-direct {v13}, Ljava/util/HashSet;-><init>()V

    invoke-virtual {v1}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;->a()Ljava/util/ArrayList;

    move-result-object v14

    const/4 v1, 0x0

    move v5, v1

    :goto_2
    invoke-virtual {v14}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-lt v5, v1, :cond_7

    add-int/lit8 v1, v6, 0x1

    move v6, v1

    move-object v5, v7

    move-object v7, v8

    move-object v8, v9

    goto :goto_0

    :pswitch_1
    if-eqz v7, :cond_3

    new-instance v1, Lorg/apache/sanselan/ImageWriteException;

    const-string v2, "More than one GPS directory."

    invoke-direct {v1, v2}, Lorg/apache/sanselan/ImageWriteException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_3
    move-object v7, v5

    move-object v9, v8

    move-object v8, v1

    goto :goto_1

    :pswitch_2
    if-eqz v5, :cond_4

    new-instance v1, Lorg/apache/sanselan/ImageWriteException;

    const-string v2, "More than one Interoperability directory."

    invoke-direct {v1, v2}, Lorg/apache/sanselan/ImageWriteException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_4
    move-object v9, v8

    move-object v8, v7

    move-object v7, v1

    goto :goto_1

    :cond_5
    invoke-virtual {v11, v13}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_6

    new-instance v1, Lorg/apache/sanselan/ImageWriteException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "More than one directory with index: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Lorg/apache/sanselan/ImageWriteException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_6
    new-instance v13, Ljava/lang/Integer;

    invoke-direct {v13, v9}, Ljava/lang/Integer;-><init>(I)V

    invoke-virtual {v11, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object v9, v8

    move-object v8, v7

    move-object v7, v5

    goto :goto_1

    :cond_7
    invoke-virtual {v14, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;

    new-instance v15, Ljava/lang/Integer;

    iget v0, v1, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;->a:I

    move/from16 v16, v0

    invoke-direct/range {v15 .. v16}, Ljava/lang/Integer;-><init>(I)V

    invoke-virtual {v13, v15}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_8

    new-instance v2, Lorg/apache/sanselan/ImageWriteException;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Tag ("

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, v1, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;->b:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    invoke-virtual {v1}, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v3, ") appears twice in directory."

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Lorg/apache/sanselan/ImageWriteException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_8
    invoke-virtual {v13, v15}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    iget v15, v1, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;->a:I

    sget-object v16, Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterBase;->co:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    move-object/from16 v0, v16

    iget v0, v0, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;->b:I

    move/from16 v16, v0

    move/from16 v0, v16

    if-ne v15, v0, :cond_a

    if-eqz v4, :cond_9

    new-instance v1, Lorg/apache/sanselan/ImageWriteException;

    const-string v2, "More than one Exif directory offset field."

    invoke-direct {v1, v2}, Lorg/apache/sanselan/ImageWriteException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_9
    move-object/from16 v17, v2

    move-object v2, v3

    move-object v3, v1

    move-object/from16 v1, v17

    :goto_3
    add-int/lit8 v4, v5, 0x1

    move v5, v4

    move-object v4, v3

    move-object v3, v2

    move-object v2, v1

    goto/16 :goto_2

    :cond_a
    iget v15, v1, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;->a:I

    sget-object v16, Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterBase;->dz:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    move-object/from16 v0, v16

    iget v0, v0, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;->b:I

    move/from16 v16, v0

    move/from16 v0, v16

    if-ne v15, v0, :cond_c

    if-eqz v2, :cond_b

    new-instance v1, Lorg/apache/sanselan/ImageWriteException;

    const-string v2, "More than one Interoperability directory offset field."

    invoke-direct {v1, v2}, Lorg/apache/sanselan/ImageWriteException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_b
    move-object v2, v3

    move-object v3, v4

    goto :goto_3

    :cond_c
    iget v15, v1, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;->a:I

    sget-object v16, Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterBase;->cw:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    move-object/from16 v0, v16

    iget v0, v0, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;->b:I

    move/from16 v16, v0

    move/from16 v0, v16

    if-ne v15, v0, :cond_1c

    if-eqz v3, :cond_d

    new-instance v1, Lorg/apache/sanselan/ImageWriteException;

    const-string v2, "More than one GPS directory offset field."

    invoke-direct {v1, v2}, Lorg/apache/sanselan/ImageWriteException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_d
    move-object v3, v4

    move-object/from16 v17, v1

    move-object v1, v2

    move-object/from16 v2, v17

    goto :goto_3

    :cond_e
    invoke-static {v11}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    const/4 v6, 0x0

    const/4 v1, 0x0

    move-object v9, v6

    move v6, v1

    :goto_4
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-lt v6, v1, :cond_f

    new-instance v1, Ljava/lang/Integer;

    const/4 v6, 0x0

    invoke-direct {v1, v6}, Ljava/lang/Integer;-><init>(I)V

    invoke-interface {v12, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;

    new-instance v6, Lorg/apache/sanselan/formats/tiff/write/TiffOutputSummary;

    move-object/from16 v0, p0

    iget v9, v0, Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterBase;->a:I

    invoke-direct {v6, v9, v1, v12}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputSummary;-><init>(ILorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;Ljava/util/Map;)V

    if-nez v5, :cond_12

    if-eqz v2, :cond_12

    new-instance v1, Lorg/apache/sanselan/ImageWriteException;

    const-string v2, "Output set has Interoperability Directory Offset field, but no Interoperability Directory"

    invoke-direct {v1, v2}, Lorg/apache/sanselan/ImageWriteException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_f
    invoke-virtual {v11, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v10

    if-eq v10, v6, :cond_10

    new-instance v1, Lorg/apache/sanselan/ImageWriteException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Missing directory: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Lorg/apache/sanselan/ImageWriteException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_10
    invoke-interface {v12, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;

    if-eqz v9, :cond_11

    invoke-virtual {v9, v1}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;->a(Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;)V

    :cond_11
    add-int/lit8 v6, v6, 0x1

    move-object v9, v1

    goto :goto_4

    :cond_12
    if-eqz v5, :cond_15

    if-nez v8, :cond_13

    invoke-virtual/range {p1 .. p1}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputSet;->d()Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;

    move-result-object v8

    :cond_13
    if-nez v2, :cond_14

    sget-object v2, Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterBase;->dz:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    move-object/from16 v0, p0

    iget v9, v0, Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterBase;->a:I

    invoke-static {v2, v9}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;->a(Lorg/apache/sanselan/formats/tiff/constants/TagInfo;I)Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;

    move-result-object v2

    invoke-virtual {v8, v2}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;->a(Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;)V

    :cond_14
    invoke-virtual {v6, v5, v2}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputSummary;->a(Lorg/apache/sanselan/formats/tiff/write/TiffOutputItem;Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;)V

    :cond_15
    if-nez v8, :cond_16

    if-eqz v4, :cond_16

    new-instance v1, Lorg/apache/sanselan/ImageWriteException;

    const-string v2, "Output set has Exif Directory Offset field, but no Exif Directory"

    invoke-direct {v1, v2}, Lorg/apache/sanselan/ImageWriteException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_16
    if-eqz v8, :cond_18

    if-nez v4, :cond_17

    sget-object v2, Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterBase;->co:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    move-object/from16 v0, p0

    iget v4, v0, Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterBase;->a:I

    invoke-static {v2, v4}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;->a(Lorg/apache/sanselan/formats/tiff/constants/TagInfo;I)Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;

    move-result-object v4

    invoke-virtual {v1, v4}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;->a(Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;)V

    :cond_17
    invoke-virtual {v6, v8, v4}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputSummary;->a(Lorg/apache/sanselan/formats/tiff/write/TiffOutputItem;Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;)V

    :cond_18
    if-nez v7, :cond_19

    if-eqz v3, :cond_19

    new-instance v1, Lorg/apache/sanselan/ImageWriteException;

    const-string v2, "Output set has GPS Directory Offset field, but no GPS Directory"

    invoke-direct {v1, v2}, Lorg/apache/sanselan/ImageWriteException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_19
    if-eqz v7, :cond_1b

    if-nez v3, :cond_1a

    sget-object v2, Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterBase;->cw:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    move-object/from16 v0, p0

    iget v3, v0, Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterBase;->a:I

    invoke-static {v2, v3}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;->a(Lorg/apache/sanselan/formats/tiff/constants/TagInfo;I)Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;

    move-result-object v3

    invoke-virtual {v1, v3}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;->a(Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;)V

    :cond_1a
    invoke-virtual {v6, v7, v3}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputSummary;->a(Lorg/apache/sanselan/formats/tiff/write/TiffOutputItem;Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;)V

    :cond_1b
    return-object v6

    :cond_1c
    move-object v1, v2

    move-object v2, v3

    move-object v3, v4

    goto/16 :goto_3

    :pswitch_data_0
    .packed-switch -0x4
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public abstract a(Ljava/io/OutputStream;Lorg/apache/sanselan/formats/tiff/write/TiffOutputSet;)V
.end method

.method protected final a(Lorg/apache/sanselan/common/BinaryOutputStream;)V
    .locals 1

    const/16 v0, 0x8

    invoke-virtual {p0, p1, v0}, Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterBase;->a(Lorg/apache/sanselan/common/BinaryOutputStream;I)V

    return-void
.end method

.method protected final a(Lorg/apache/sanselan/common/BinaryOutputStream;I)V
    .locals 1

    iget v0, p0, Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterBase;->a:I

    invoke-virtual {p1, v0}, Lorg/apache/sanselan/common/BinaryOutputStream;->write(I)V

    iget v0, p0, Lorg/apache/sanselan/formats/tiff/write/TiffImageWriterBase;->a:I

    invoke-virtual {p1, v0}, Lorg/apache/sanselan/common/BinaryOutputStream;->write(I)V

    const/16 v0, 0x2a

    invoke-virtual {p1, v0}, Lorg/apache/sanselan/common/BinaryOutputStream;->b(I)V

    invoke-virtual {p1, p2}, Lorg/apache/sanselan/common/BinaryOutputStream;->a(I)V

    return-void
.end method
