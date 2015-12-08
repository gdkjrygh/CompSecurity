.class public Lcom/googlecode/mp4parser/authoring/CencMp4TrackImplImpl;
.super Lcom/googlecode/mp4parser/authoring/Mp4TrackImpl;
.source "SourceFile"

# interfaces
.implements Lcom/googlecode/mp4parser/authoring/tracks/CencEncryptedTrack;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/googlecode/mp4parser/authoring/CencMp4TrackImplImpl$FindSaioSaizPair;
    }
.end annotation


# static fields
.field static final synthetic $assertionsDisabled:Z


# instance fields
.field private defaultKeyId:Ljava/util/UUID;

.field private sampleEncryptionEntries:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 26
    const-class v0, Lcom/googlecode/mp4parser/authoring/CencMp4TrackImplImpl;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Lcom/googlecode/mp4parser/authoring/CencMp4TrackImplImpl;->$assertionsDisabled:Z

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public varargs constructor <init>(Ljava/lang/String;Lcom/coremedia/iso/boxes/TrackBox;[Lcom/coremedia/iso/IsoFile;)V
    .locals 26

    .prologue
    .line 42
    invoke-direct/range {p0 .. p3}, Lcom/googlecode/mp4parser/authoring/Mp4TrackImpl;-><init>(Ljava/lang/String;Lcom/coremedia/iso/boxes/TrackBox;[Lcom/coremedia/iso/IsoFile;)V

    .line 44
    const-string v4, "mdia[0]/minf[0]/stbl[0]/stsd[0]/enc.[0]/sinf[0]/schm[0]"

    move-object/from16 v0, p2

    invoke-static {v0, v4}, Lcom/googlecode/mp4parser/util/Path;->getPath(Lcom/googlecode/mp4parser/AbstractContainerBox;Ljava/lang/String;)Lcom/coremedia/iso/boxes/Box;

    move-result-object v4

    check-cast v4, Lcom/coremedia/iso/boxes/SchemeTypeBox;

    .line 45
    sget-boolean v5, Lcom/googlecode/mp4parser/authoring/CencMp4TrackImplImpl;->$assertionsDisabled:Z

    if-nez v5, :cond_1

    if-eqz v4, :cond_0

    invoke-virtual {v4}, Lcom/coremedia/iso/boxes/SchemeTypeBox;->getSchemeType()Ljava/lang/String;

    move-result-object v5

    const-string v6, "cenc"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1

    invoke-virtual {v4}, Lcom/coremedia/iso/boxes/SchemeTypeBox;->getSchemeType()Ljava/lang/String;

    move-result-object v4

    const-string v5, "cbc1"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    :cond_0
    new-instance v4, Ljava/lang/AssertionError;

    const-string v5, "Track must be CENC (cenc or cbc1) encrypted"

    invoke-direct {v4, v5}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v4

    .line 47
    :cond_1
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    move-object/from16 v0, p0

    iput-object v4, v0, Lcom/googlecode/mp4parser/authoring/CencMp4TrackImplImpl;->sampleEncryptionEntries:Ljava/util/List;

    .line 48
    invoke-virtual/range {p2 .. p2}, Lcom/coremedia/iso/boxes/TrackBox;->getTrackHeaderBox()Lcom/coremedia/iso/boxes/TrackHeaderBox;

    move-result-object v4

    invoke-virtual {v4}, Lcom/coremedia/iso/boxes/TrackHeaderBox;->getTrackId()J

    move-result-wide v14

    .line 49
    invoke-virtual/range {p2 .. p2}, Lcom/coremedia/iso/boxes/TrackBox;->getParent()Lcom/coremedia/iso/boxes/Container;

    move-result-object v4

    const-class v5, Lcom/coremedia/iso/boxes/fragment/MovieExtendsBox;

    invoke-interface {v4, v5}, Lcom/coremedia/iso/boxes/Container;->getBoxes(Ljava/lang/Class;)Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    if-lez v4, :cond_c

    .line 52
    invoke-virtual/range {p2 .. p2}, Lcom/coremedia/iso/boxes/TrackBox;->getParent()Lcom/coremedia/iso/boxes/Container;

    move-result-object v4

    check-cast v4, Lcom/coremedia/iso/boxes/Box;

    invoke-interface {v4}, Lcom/coremedia/iso/boxes/Box;->getParent()Lcom/coremedia/iso/boxes/Container;

    move-result-object v4

    const-class v5, Lcom/coremedia/iso/boxes/fragment/MovieFragmentBox;

    invoke-interface {v4, v5}, Lcom/coremedia/iso/boxes/Container;->getBoxes(Ljava/lang/Class;)Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v16

    :cond_2
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-nez v4, :cond_4

    .line 159
    :cond_3
    return-void

    .line 52
    :cond_4
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v7, v4

    check-cast v7, Lcom/coremedia/iso/boxes/fragment/MovieFragmentBox;

    .line 53
    const-class v4, Lcom/coremedia/iso/boxes/fragment/TrackFragmentBox;

    invoke-virtual {v7, v4}, Lcom/coremedia/iso/boxes/fragment/MovieFragmentBox;->getBoxes(Ljava/lang/Class;)Ljava/util/List;

    move-result-object v4

    .line 54
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v17

    :cond_5
    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/coremedia/iso/boxes/fragment/TrackFragmentBox;

    .line 55
    invoke-virtual {v4}, Lcom/coremedia/iso/boxes/fragment/TrackFragmentBox;->getTrackFragmentHeaderBox()Lcom/coremedia/iso/boxes/fragment/TrackFragmentHeaderBox;

    move-result-object v5

    invoke-virtual {v5}, Lcom/coremedia/iso/boxes/fragment/TrackFragmentHeaderBox;->getTrackId()J

    move-result-wide v8

    cmp-long v5, v8, v14

    if-nez v5, :cond_5

    .line 56
    const-string v5, "mdia[0]/minf[0]/stbl[0]/stsd[0]/enc.[0]/sinf[0]/schi[0]/tenc[0]"

    move-object/from16 v0, p2

    invoke-static {v0, v5}, Lcom/googlecode/mp4parser/util/Path;->getPath(Lcom/googlecode/mp4parser/AbstractContainerBox;Ljava/lang/String;)Lcom/coremedia/iso/boxes/Box;

    move-result-object v5

    check-cast v5, Lcom/mp4parser/iso23001/part7/TrackEncryptionBox;

    .line 57
    invoke-virtual {v5}, Lcom/mp4parser/iso23001/part7/TrackEncryptionBox;->getDefault_KID()Ljava/util/UUID;

    move-result-object v6

    move-object/from16 v0, p0

    iput-object v6, v0, Lcom/googlecode/mp4parser/authoring/CencMp4TrackImplImpl;->defaultKeyId:Ljava/util/UUID;

    .line 60
    invoke-virtual {v4}, Lcom/coremedia/iso/boxes/fragment/TrackFragmentBox;->getTrackFragmentHeaderBox()Lcom/coremedia/iso/boxes/fragment/TrackFragmentHeaderBox;

    move-result-object v6

    invoke-virtual {v6}, Lcom/coremedia/iso/boxes/fragment/TrackFragmentHeaderBox;->hasBaseDataOffset()Z

    move-result v6

    if-eqz v6, :cond_6

    .line 61
    invoke-virtual/range {p2 .. p2}, Lcom/coremedia/iso/boxes/TrackBox;->getParent()Lcom/coremedia/iso/boxes/Container;

    move-result-object v6

    check-cast v6, Lcom/coremedia/iso/boxes/Box;

    invoke-interface {v6}, Lcom/coremedia/iso/boxes/Box;->getParent()Lcom/coremedia/iso/boxes/Container;

    move-result-object v6

    .line 62
    invoke-virtual {v4}, Lcom/coremedia/iso/boxes/fragment/TrackFragmentBox;->getTrackFragmentHeaderBox()Lcom/coremedia/iso/boxes/fragment/TrackFragmentHeaderBox;

    move-result-object v8

    invoke-virtual {v8}, Lcom/coremedia/iso/boxes/fragment/TrackFragmentHeaderBox;->getBaseDataOffset()J

    move-result-wide v8

    .line 68
    :goto_0
    new-instance v10, Lcom/googlecode/mp4parser/authoring/CencMp4TrackImplImpl$FindSaioSaizPair;

    move-object/from16 v0, p0

    invoke-direct {v10, v0, v4}, Lcom/googlecode/mp4parser/authoring/CencMp4TrackImplImpl$FindSaioSaizPair;-><init>(Lcom/googlecode/mp4parser/authoring/CencMp4TrackImplImpl;Lcom/coremedia/iso/boxes/Container;)V

    invoke-virtual {v10}, Lcom/googlecode/mp4parser/authoring/CencMp4TrackImplImpl$FindSaioSaizPair;->invoke()Lcom/googlecode/mp4parser/authoring/CencMp4TrackImplImpl$FindSaioSaizPair;

    move-result-object v10

    .line 69
    invoke-virtual {v10}, Lcom/googlecode/mp4parser/authoring/CencMp4TrackImplImpl$FindSaioSaizPair;->getSaio()Lcom/mp4parser/iso14496/part12/SampleAuxiliaryInformationOffsetsBox;

    move-result-object v11

    .line 70
    invoke-virtual {v10}, Lcom/googlecode/mp4parser/authoring/CencMp4TrackImplImpl$FindSaioSaizPair;->getSaiz()Lcom/mp4parser/iso14496/part12/SampleAuxiliaryInformationSizesBox;

    move-result-object v18

    .line 72
    sget-boolean v10, Lcom/googlecode/mp4parser/authoring/CencMp4TrackImplImpl;->$assertionsDisabled:Z

    if-nez v10, :cond_7

    if-nez v11, :cond_7

    new-instance v4, Ljava/lang/AssertionError;

    invoke-direct {v4}, Ljava/lang/AssertionError;-><init>()V

    throw v4

    .line 65
    :cond_6
    const-wide/16 v8, 0x0

    move-object v6, v7

    goto :goto_0

    .line 73
    :cond_7
    invoke-virtual {v11}, Lcom/mp4parser/iso14496/part12/SampleAuxiliaryInformationOffsetsBox;->getOffsets()[J

    move-result-object v19

    .line 74
    sget-boolean v10, Lcom/googlecode/mp4parser/authoring/CencMp4TrackImplImpl;->$assertionsDisabled:Z

    if-nez v10, :cond_8

    move-object/from16 v0, v19

    array-length v10, v0

    const-class v11, Lcom/coremedia/iso/boxes/fragment/TrackRunBox;

    invoke-virtual {v4, v11}, Lcom/coremedia/iso/boxes/fragment/TrackFragmentBox;->getBoxes(Ljava/lang/Class;)Ljava/util/List;

    move-result-object v11

    invoke-interface {v11}, Ljava/util/List;->size()I

    move-result v11

    if-eq v10, v11, :cond_8

    new-instance v4, Ljava/lang/AssertionError;

    invoke-direct {v4}, Ljava/lang/AssertionError;-><init>()V

    throw v4

    .line 75
    :cond_8
    sget-boolean v10, Lcom/googlecode/mp4parser/authoring/CencMp4TrackImplImpl;->$assertionsDisabled:Z

    if-nez v10, :cond_9

    if-nez v18, :cond_9

    new-instance v4, Ljava/lang/AssertionError;

    invoke-direct {v4}, Ljava/lang/AssertionError;-><init>()V

    throw v4

    .line 77
    :cond_9
    const-class v10, Lcom/coremedia/iso/boxes/fragment/TrackRunBox;

    invoke-virtual {v4, v10}, Lcom/coremedia/iso/boxes/fragment/TrackFragmentBox;->getBoxes(Ljava/lang/Class;)Ljava/util/List;

    move-result-object v20

    .line 78
    const/4 v10, 0x0

    .line 79
    const/4 v4, 0x0

    move v11, v10

    move v10, v4

    :goto_1
    move-object/from16 v0, v19

    array-length v4, v0

    if-ge v10, v4, :cond_5

    .line 80
    move-object/from16 v0, v20

    invoke-interface {v0, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/coremedia/iso/boxes/fragment/TrackRunBox;

    invoke-virtual {v4}, Lcom/coremedia/iso/boxes/fragment/TrackRunBox;->getEntries()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v21

    .line 81
    aget-wide v22, v19, v10

    .line 82
    const-wide/16 v12, 0x0

    move v4, v11

    .line 84
    :goto_2
    add-int v24, v11, v21

    move/from16 v0, v24

    if-lt v4, v0, :cond_a

    .line 87
    add-long v22, v22, v8

    move-wide/from16 v0, v22

    invoke-interface {v6, v0, v1, v12, v13}, Lcom/coremedia/iso/boxes/Container;->getByteBuffer(JJ)Ljava/nio/ByteBuffer;

    move-result-object v12

    move v4, v11

    .line 88
    :goto_3
    add-int v13, v11, v21

    if-lt v4, v13, :cond_b

    .line 96
    add-int v11, v11, v21

    .line 79
    add-int/lit8 v4, v10, 0x1

    move v10, v4

    goto :goto_1

    .line 85
    :cond_a
    move-object/from16 v0, v18

    invoke-virtual {v0, v4}, Lcom/mp4parser/iso14496/part12/SampleAuxiliaryInformationSizesBox;->getSize(I)S

    move-result v24

    move/from16 v0, v24

    int-to-long v0, v0

    move-wide/from16 v24, v0

    add-long v12, v12, v24

    .line 84
    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    .line 89
    :cond_b
    move-object/from16 v0, v18

    invoke-virtual {v0, v4}, Lcom/mp4parser/iso14496/part12/SampleAuxiliaryInformationSizesBox;->getSize(I)S

    move-result v13

    .line 90
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/googlecode/mp4parser/authoring/CencMp4TrackImplImpl;->sampleEncryptionEntries:Ljava/util/List;

    move-object/from16 v22, v0

    .line 91
    invoke-virtual {v5}, Lcom/mp4parser/iso23001/part7/TrackEncryptionBox;->getDefaultIvSize()I

    move-result v23

    int-to-long v0, v13

    move-wide/from16 v24, v0

    move-object/from16 v0, p0

    move/from16 v1, v23

    move-wide/from16 v2, v24

    invoke-direct {v0, v1, v12, v2, v3}, Lcom/googlecode/mp4parser/authoring/CencMp4TrackImplImpl;->parseCencAuxDataFormat(ILjava/nio/ByteBuffer;J)Lcom/mp4parser/iso23001/part7/CencSampleAuxiliaryDataFormat;

    move-result-object v13

    .line 90
    move-object/from16 v0, v22

    invoke-interface {v0, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 88
    add-int/lit8 v4, v4, 0x1

    goto :goto_3

    .line 103
    :cond_c
    const-string v4, "mdia[0]/minf[0]/stbl[0]/stsd[0]/enc.[0]/sinf[0]/schi[0]/tenc[0]"

    move-object/from16 v0, p2

    invoke-static {v0, v4}, Lcom/googlecode/mp4parser/util/Path;->getPath(Lcom/googlecode/mp4parser/AbstractContainerBox;Ljava/lang/String;)Lcom/coremedia/iso/boxes/Box;

    move-result-object v4

    check-cast v4, Lcom/mp4parser/iso23001/part7/TrackEncryptionBox;

    .line 104
    invoke-virtual {v4}, Lcom/mp4parser/iso23001/part7/TrackEncryptionBox;->getDefault_KID()Ljava/util/UUID;

    move-result-object v5

    move-object/from16 v0, p0

    iput-object v5, v0, Lcom/googlecode/mp4parser/authoring/CencMp4TrackImplImpl;->defaultKeyId:Ljava/util/UUID;

    .line 105
    const-string v5, "mdia[0]/minf[0]/stbl[0]/stco[0]"

    move-object/from16 v0, p2

    invoke-static {v0, v5}, Lcom/googlecode/mp4parser/util/Path;->getPath(Lcom/googlecode/mp4parser/AbstractContainerBox;Ljava/lang/String;)Lcom/coremedia/iso/boxes/Box;

    move-result-object v5

    check-cast v5, Lcom/coremedia/iso/boxes/ChunkOffsetBox;

    .line 107
    if-nez v5, :cond_d

    .line 108
    const-string v5, "mdia[0]/minf[0]/stbl[0]/co64[0]"

    move-object/from16 v0, p2

    invoke-static {v0, v5}, Lcom/googlecode/mp4parser/util/Path;->getPath(Lcom/googlecode/mp4parser/AbstractContainerBox;Ljava/lang/String;)Lcom/coremedia/iso/boxes/Box;

    move-result-object v5

    check-cast v5, Lcom/coremedia/iso/boxes/ChunkOffsetBox;

    .line 110
    :cond_d
    invoke-virtual/range {p2 .. p2}, Lcom/coremedia/iso/boxes/TrackBox;->getSampleTableBox()Lcom/coremedia/iso/boxes/SampleTableBox;

    move-result-object v6

    invoke-virtual {v6}, Lcom/coremedia/iso/boxes/SampleTableBox;->getSampleToChunkBox()Lcom/coremedia/iso/boxes/SampleToChunkBox;

    move-result-object v6

    invoke-virtual {v5}, Lcom/coremedia/iso/boxes/ChunkOffsetBox;->getChunkOffsets()[J

    move-result-object v5

    array-length v5, v5

    invoke-virtual {v6, v5}, Lcom/coremedia/iso/boxes/SampleToChunkBox;->blowup(I)[J

    move-result-object v10

    .line 113
    new-instance v6, Lcom/googlecode/mp4parser/authoring/CencMp4TrackImplImpl$FindSaioSaizPair;

    const-string v5, "mdia[0]/minf[0]/stbl[0]"

    move-object/from16 v0, p2

    invoke-static {v0, v5}, Lcom/googlecode/mp4parser/util/Path;->getPath(Lcom/googlecode/mp4parser/AbstractContainerBox;Ljava/lang/String;)Lcom/coremedia/iso/boxes/Box;

    move-result-object v5

    check-cast v5, Lcom/coremedia/iso/boxes/Container;

    move-object/from16 v0, p0

    invoke-direct {v6, v0, v5}, Lcom/googlecode/mp4parser/authoring/CencMp4TrackImplImpl$FindSaioSaizPair;-><init>(Lcom/googlecode/mp4parser/authoring/CencMp4TrackImplImpl;Lcom/coremedia/iso/boxes/Container;)V

    invoke-virtual {v6}, Lcom/googlecode/mp4parser/authoring/CencMp4TrackImplImpl$FindSaioSaizPair;->invoke()Lcom/googlecode/mp4parser/authoring/CencMp4TrackImplImpl$FindSaioSaizPair;

    move-result-object v5

    .line 114
    # getter for: Lcom/googlecode/mp4parser/authoring/CencMp4TrackImplImpl$FindSaioSaizPair;->saio:Lcom/mp4parser/iso14496/part12/SampleAuxiliaryInformationOffsetsBox;
    invoke-static {v5}, Lcom/googlecode/mp4parser/authoring/CencMp4TrackImplImpl$FindSaioSaizPair;->access$0(Lcom/googlecode/mp4parser/authoring/CencMp4TrackImplImpl$FindSaioSaizPair;)Lcom/mp4parser/iso14496/part12/SampleAuxiliaryInformationOffsetsBox;

    move-result-object v11

    .line 115
    # getter for: Lcom/googlecode/mp4parser/authoring/CencMp4TrackImplImpl$FindSaioSaizPair;->saiz:Lcom/mp4parser/iso14496/part12/SampleAuxiliaryInformationSizesBox;
    invoke-static {v5}, Lcom/googlecode/mp4parser/authoring/CencMp4TrackImplImpl$FindSaioSaizPair;->access$1(Lcom/googlecode/mp4parser/authoring/CencMp4TrackImplImpl$FindSaioSaizPair;)Lcom/mp4parser/iso14496/part12/SampleAuxiliaryInformationSizesBox;

    move-result-object v12

    .line 117
    invoke-virtual/range {p2 .. p2}, Lcom/coremedia/iso/boxes/TrackBox;->getParent()Lcom/coremedia/iso/boxes/Container;

    move-result-object v5

    check-cast v5, Lcom/coremedia/iso/boxes/MovieBox;

    invoke-virtual {v5}, Lcom/coremedia/iso/boxes/MovieBox;->getParent()Lcom/coremedia/iso/boxes/Container;

    move-result-object v13

    .line 119
    invoke-virtual {v11}, Lcom/mp4parser/iso14496/part12/SampleAuxiliaryInformationOffsetsBox;->getOffsets()[J

    move-result-object v5

    array-length v5, v5

    const/4 v6, 0x1

    if-ne v5, v6, :cond_10

    .line 120
    invoke-virtual {v11}, Lcom/mp4parser/iso14496/part12/SampleAuxiliaryInformationOffsetsBox;->getOffsets()[J

    move-result-object v5

    const/4 v6, 0x0

    aget-wide v8, v5, v6

    .line 121
    const/4 v6, 0x0

    .line 122
    invoke-virtual {v12}, Lcom/mp4parser/iso14496/part12/SampleAuxiliaryInformationSizesBox;->getDefaultSampleInfoSize()I

    move-result v5

    if-lez v5, :cond_f

    .line 123
    invoke-virtual {v12}, Lcom/mp4parser/iso14496/part12/SampleAuxiliaryInformationSizesBox;->getSampleCount()I

    move-result v5

    invoke-virtual {v12}, Lcom/mp4parser/iso14496/part12/SampleAuxiliaryInformationSizesBox;->getDefaultSampleInfoSize()I

    move-result v6

    mul-int/2addr v5, v6

    add-int/lit8 v6, v5, 0x0

    .line 129
    :cond_e
    int-to-long v6, v6

    invoke-interface {v13, v8, v9, v6, v7}, Lcom/coremedia/iso/boxes/Container;->getByteBuffer(JJ)Ljava/nio/ByteBuffer;

    move-result-object v6

    .line 130
    const/4 v5, 0x0

    :goto_4
    invoke-virtual {v12}, Lcom/mp4parser/iso14496/part12/SampleAuxiliaryInformationSizesBox;->getSampleCount()I

    move-result v7

    if-ge v5, v7, :cond_3

    .line 131
    move-object/from16 v0, p0

    iget-object v7, v0, Lcom/googlecode/mp4parser/authoring/CencMp4TrackImplImpl;->sampleEncryptionEntries:Ljava/util/List;

    .line 132
    invoke-virtual {v4}, Lcom/mp4parser/iso23001/part7/TrackEncryptionBox;->getDefaultIvSize()I

    move-result v8

    invoke-virtual {v12, v5}, Lcom/mp4parser/iso14496/part12/SampleAuxiliaryInformationSizesBox;->getSize(I)S

    move-result v9

    int-to-long v10, v9

    move-object/from16 v0, p0

    invoke-direct {v0, v8, v6, v10, v11}, Lcom/googlecode/mp4parser/authoring/CencMp4TrackImplImpl;->parseCencAuxDataFormat(ILjava/nio/ByteBuffer;J)Lcom/mp4parser/iso23001/part7/CencSampleAuxiliaryDataFormat;

    move-result-object v8

    .line 131
    invoke-interface {v7, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 130
    add-int/lit8 v5, v5, 0x1

    goto :goto_4

    .line 125
    :cond_f
    const/4 v5, 0x0

    :goto_5
    invoke-virtual {v12}, Lcom/mp4parser/iso14496/part12/SampleAuxiliaryInformationSizesBox;->getSampleCount()I

    move-result v7

    if-ge v5, v7, :cond_e

    .line 126
    invoke-virtual {v12}, Lcom/mp4parser/iso14496/part12/SampleAuxiliaryInformationSizesBox;->getSampleInfoSizes()[S

    move-result-object v7

    aget-short v7, v7, v5

    add-int/2addr v6, v7

    .line 125
    add-int/lit8 v5, v5, 0x1

    goto :goto_5

    .line 136
    :cond_10
    invoke-virtual {v11}, Lcom/mp4parser/iso14496/part12/SampleAuxiliaryInformationOffsetsBox;->getOffsets()[J

    move-result-object v5

    array-length v5, v5

    array-length v6, v10

    if-ne v5, v6, :cond_14

    .line 137
    const/4 v6, 0x0

    .line 138
    const/4 v5, 0x0

    move v8, v5

    move v9, v6

    :goto_6
    array-length v5, v10

    if-ge v8, v5, :cond_3

    .line 139
    invoke-virtual {v11}, Lcom/mp4parser/iso14496/part12/SampleAuxiliaryInformationOffsetsBox;->getOffsets()[J

    move-result-object v5

    aget-wide v14, v5, v8

    .line 140
    const-wide/16 v6, 0x0

    .line 141
    invoke-virtual {v12}, Lcom/mp4parser/iso14496/part12/SampleAuxiliaryInformationSizesBox;->getDefaultSampleInfoSize()I

    move-result v5

    if-lez v5, :cond_12

    .line 142
    const-wide/16 v6, 0x0

    invoke-virtual {v12}, Lcom/mp4parser/iso14496/part12/SampleAuxiliaryInformationSizesBox;->getSampleCount()I

    move-result v5

    int-to-long v0, v5

    move-wide/from16 v16, v0

    aget-wide v18, v10, v8

    mul-long v16, v16, v18

    add-long v6, v6, v16

    .line 149
    :cond_11
    invoke-interface {v13, v14, v15, v6, v7}, Lcom/coremedia/iso/boxes/Container;->getByteBuffer(JJ)Ljava/nio/ByteBuffer;

    move-result-object v6

    .line 150
    const/4 v5, 0x0

    :goto_7
    int-to-long v14, v5

    aget-wide v16, v10, v8

    cmp-long v7, v14, v16

    if-ltz v7, :cond_13

    .line 157
    int-to-long v6, v9

    aget-wide v14, v10, v8

    add-long/2addr v6, v14

    long-to-int v6, v6

    .line 138
    add-int/lit8 v5, v8, 0x1

    move v8, v5

    move v9, v6

    goto :goto_6

    .line 144
    :cond_12
    const/4 v5, 0x0

    :goto_8
    int-to-long v0, v5

    move-wide/from16 v16, v0

    aget-wide v18, v10, v8

    cmp-long v16, v16, v18

    if-gez v16, :cond_11

    .line 145
    add-int v16, v9, v5

    move/from16 v0, v16

    invoke-virtual {v12, v0}, Lcom/mp4parser/iso14496/part12/SampleAuxiliaryInformationSizesBox;->getSize(I)S

    move-result v16

    move/from16 v0, v16

    int-to-long v0, v0

    move-wide/from16 v16, v0

    add-long v6, v6, v16

    .line 144
    add-int/lit8 v5, v5, 0x1

    goto :goto_8

    .line 151
    :cond_13
    add-int v7, v9, v5

    invoke-virtual {v12, v7}, Lcom/mp4parser/iso14496/part12/SampleAuxiliaryInformationSizesBox;->getSize(I)S

    move-result v7

    int-to-long v14, v7

    .line 152
    move-object/from16 v0, p0

    iget-object v7, v0, Lcom/googlecode/mp4parser/authoring/CencMp4TrackImplImpl;->sampleEncryptionEntries:Ljava/util/List;

    .line 154
    invoke-virtual {v4}, Lcom/mp4parser/iso23001/part7/TrackEncryptionBox;->getDefaultIvSize()I

    move-result v16

    move-object/from16 v0, p0

    move/from16 v1, v16

    invoke-direct {v0, v1, v6, v14, v15}, Lcom/googlecode/mp4parser/authoring/CencMp4TrackImplImpl;->parseCencAuxDataFormat(ILjava/nio/ByteBuffer;J)Lcom/mp4parser/iso23001/part7/CencSampleAuxiliaryDataFormat;

    move-result-object v14

    .line 152
    invoke-interface {v7, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 150
    add-int/lit8 v5, v5, 0x1

    goto :goto_7

    .line 160
    :cond_14
    new-instance v4, Ljava/lang/RuntimeException;

    const-string v5, "Number of saio offsets must be either 1 or number of chunks"

    invoke-direct {v4, v5}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v4
.end method

.method private parseCencAuxDataFormat(ILjava/nio/ByteBuffer;J)Lcom/mp4parser/iso23001/part7/CencSampleAuxiliaryDataFormat;
    .locals 7

    .prologue
    .line 166
    new-instance v1, Lcom/mp4parser/iso23001/part7/CencSampleAuxiliaryDataFormat;

    invoke-direct {v1}, Lcom/mp4parser/iso23001/part7/CencSampleAuxiliaryDataFormat;-><init>()V

    .line 167
    const-wide/16 v2, 0x0

    cmp-long v0, p3, v2

    if-lez v0, :cond_0

    .line 168
    new-array v0, p1, [B

    iput-object v0, v1, Lcom/mp4parser/iso23001/part7/CencSampleAuxiliaryDataFormat;->iv:[B

    .line 169
    iget-object v0, v1, Lcom/mp4parser/iso23001/part7/CencSampleAuxiliaryDataFormat;->iv:[B

    invoke-virtual {p2, v0}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 170
    int-to-long v2, p1

    cmp-long v0, p3, v2

    if-lez v0, :cond_0

    .line 171
    invoke-static {p2}, Lcom/coremedia/iso/IsoTypeReader;->readUInt16(Ljava/nio/ByteBuffer;)I

    move-result v0

    .line 172
    new-array v0, v0, [Lcom/mp4parser/iso23001/part7/CencSampleAuxiliaryDataFormat$Pair;

    iput-object v0, v1, Lcom/mp4parser/iso23001/part7/CencSampleAuxiliaryDataFormat;->pairs:[Lcom/mp4parser/iso23001/part7/CencSampleAuxiliaryDataFormat$Pair;

    .line 173
    const/4 v0, 0x0

    :goto_0
    iget-object v2, v1, Lcom/mp4parser/iso23001/part7/CencSampleAuxiliaryDataFormat;->pairs:[Lcom/mp4parser/iso23001/part7/CencSampleAuxiliaryDataFormat$Pair;

    array-length v2, v2

    if-lt v0, v2, :cond_1

    .line 180
    :cond_0
    return-object v1

    .line 174
    :cond_1
    iget-object v2, v1, Lcom/mp4parser/iso23001/part7/CencSampleAuxiliaryDataFormat;->pairs:[Lcom/mp4parser/iso23001/part7/CencSampleAuxiliaryDataFormat$Pair;

    .line 175
    invoke-static {p2}, Lcom/coremedia/iso/IsoTypeReader;->readUInt16(Ljava/nio/ByteBuffer;)I

    move-result v3

    .line 176
    invoke-static {p2}, Lcom/coremedia/iso/IsoTypeReader;->readUInt32(Ljava/nio/ByteBuffer;)J

    move-result-wide v4

    .line 174
    invoke-virtual {v1, v3, v4, v5}, Lcom/mp4parser/iso23001/part7/CencSampleAuxiliaryDataFormat;->createPair(IJ)Lcom/mp4parser/iso23001/part7/CencSampleAuxiliaryDataFormat$Pair;

    move-result-object v3

    aput-object v3, v2, v0

    .line 173
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method


# virtual methods
.method public getDefaultKeyId()Ljava/util/UUID;
    .locals 1

    .prologue
    .line 184
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/CencMp4TrackImplImpl;->defaultKeyId:Ljava/util/UUID;

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 2

    .prologue
    .line 204
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "enc("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-super {p0}, Lcom/googlecode/mp4parser/authoring/Mp4TrackImpl;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getSampleEncryptionEntries()Ljava/util/List;
    .locals 1

    .prologue
    .line 192
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/CencMp4TrackImplImpl;->sampleEncryptionEntries:Ljava/util/List;

    return-object v0
.end method

.method public hasSubSampleEncryption()Z
    .locals 1

    .prologue
    .line 188
    const/4 v0, 0x0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 197
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "CencMp4TrackImpl{handler=\'"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 198
    invoke-virtual {p0}, Lcom/googlecode/mp4parser/authoring/CencMp4TrackImplImpl;->getHandler()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 199
    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 197
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
