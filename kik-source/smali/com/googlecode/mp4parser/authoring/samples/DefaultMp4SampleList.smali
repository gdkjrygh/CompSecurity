.class public Lcom/googlecode/mp4parser/authoring/samples/DefaultMp4SampleList;
.super Ljava/util/AbstractList;
.source "SourceFile"


# static fields
.field private static final MAX_MAP_SIZE:J = 0x10000000L


# instance fields
.field cache:[[Ljava/nio/ByteBuffer;

.field chunkNumsStartSampleNum:[I

.field chunkOffsets:[J

.field chunkSizes:[J

.field lastChunk:I

.field sampleOffsetsWithinChunks:[[J

.field ssb:Lcom/coremedia/iso/boxes/SampleSizeBox;

.field topLevel:Lcom/coremedia/iso/boxes/Container;

.field trackBox:Lcom/coremedia/iso/boxes/TrackBox;


# direct methods
.method public constructor <init>(JLcom/coremedia/iso/boxes/Container;)V
    .locals 15

    .prologue
    .line 31
    invoke-direct {p0}, Ljava/util/AbstractList;-><init>()V

    .line 21
    const/4 v2, 0x0

    iput-object v2, p0, Lcom/googlecode/mp4parser/authoring/samples/DefaultMp4SampleList;->trackBox:Lcom/coremedia/iso/boxes/TrackBox;

    .line 22
    const/4 v2, 0x0

    iput-object v2, p0, Lcom/googlecode/mp4parser/authoring/samples/DefaultMp4SampleList;->cache:[[Ljava/nio/ByteBuffer;

    .line 28
    const/4 v2, 0x0

    iput v2, p0, Lcom/googlecode/mp4parser/authoring/samples/DefaultMp4SampleList;->lastChunk:I

    .line 32
    move-object/from16 v0, p3

    iput-object v0, p0, Lcom/googlecode/mp4parser/authoring/samples/DefaultMp4SampleList;->topLevel:Lcom/coremedia/iso/boxes/Container;

    .line 33
    const-class v2, Lcom/coremedia/iso/boxes/MovieBox;

    move-object/from16 v0, p3

    invoke-interface {v0, v2}, Lcom/coremedia/iso/boxes/Container;->getBoxes(Ljava/lang/Class;)Ljava/util/List;

    move-result-object v2

    const/4 v3, 0x0

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/coremedia/iso/boxes/MovieBox;

    .line 34
    const-class v3, Lcom/coremedia/iso/boxes/TrackBox;

    invoke-virtual {v2, v3}, Lcom/coremedia/iso/boxes/MovieBox;->getBoxes(Ljava/lang/Class;)Ljava/util/List;

    move-result-object v2

    .line 36
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_1

    .line 41
    iget-object v2, p0, Lcom/googlecode/mp4parser/authoring/samples/DefaultMp4SampleList;->trackBox:Lcom/coremedia/iso/boxes/TrackBox;

    if-nez v2, :cond_2

    .line 42
    new-instance v2, Ljava/lang/RuntimeException;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "This MP4 does not contain track "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-wide/from16 v0, p1

    invoke-virtual {v3, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 36
    :cond_1
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/coremedia/iso/boxes/TrackBox;

    .line 37
    invoke-virtual {v2}, Lcom/coremedia/iso/boxes/TrackBox;->getTrackHeaderBox()Lcom/coremedia/iso/boxes/TrackHeaderBox;

    move-result-object v4

    invoke-virtual {v4}, Lcom/coremedia/iso/boxes/TrackHeaderBox;->getTrackId()J

    move-result-wide v4

    cmp-long v4, v4, p1

    if-nez v4, :cond_0

    .line 38
    iput-object v2, p0, Lcom/googlecode/mp4parser/authoring/samples/DefaultMp4SampleList;->trackBox:Lcom/coremedia/iso/boxes/TrackBox;

    goto :goto_0

    .line 44
    :cond_2
    iget-object v2, p0, Lcom/googlecode/mp4parser/authoring/samples/DefaultMp4SampleList;->trackBox:Lcom/coremedia/iso/boxes/TrackBox;

    invoke-virtual {v2}, Lcom/coremedia/iso/boxes/TrackBox;->getSampleTableBox()Lcom/coremedia/iso/boxes/SampleTableBox;

    move-result-object v2

    invoke-virtual {v2}, Lcom/coremedia/iso/boxes/SampleTableBox;->getChunkOffsetBox()Lcom/coremedia/iso/boxes/ChunkOffsetBox;

    move-result-object v2

    invoke-virtual {v2}, Lcom/coremedia/iso/boxes/ChunkOffsetBox;->getChunkOffsets()[J

    move-result-object v2

    iput-object v2, p0, Lcom/googlecode/mp4parser/authoring/samples/DefaultMp4SampleList;->chunkOffsets:[J

    .line 45
    iget-object v2, p0, Lcom/googlecode/mp4parser/authoring/samples/DefaultMp4SampleList;->chunkOffsets:[J

    array-length v2, v2

    new-array v2, v2, [J

    iput-object v2, p0, Lcom/googlecode/mp4parser/authoring/samples/DefaultMp4SampleList;->chunkSizes:[J

    .line 47
    iget-object v2, p0, Lcom/googlecode/mp4parser/authoring/samples/DefaultMp4SampleList;->chunkOffsets:[J

    array-length v2, v2

    new-array v2, v2, [[Ljava/nio/ByteBuffer;

    iput-object v2, p0, Lcom/googlecode/mp4parser/authoring/samples/DefaultMp4SampleList;->cache:[[Ljava/nio/ByteBuffer;

    .line 48
    iget-object v2, p0, Lcom/googlecode/mp4parser/authoring/samples/DefaultMp4SampleList;->chunkOffsets:[J

    array-length v2, v2

    new-array v2, v2, [[J

    iput-object v2, p0, Lcom/googlecode/mp4parser/authoring/samples/DefaultMp4SampleList;->sampleOffsetsWithinChunks:[[J

    .line 49
    iget-object v2, p0, Lcom/googlecode/mp4parser/authoring/samples/DefaultMp4SampleList;->trackBox:Lcom/coremedia/iso/boxes/TrackBox;

    invoke-virtual {v2}, Lcom/coremedia/iso/boxes/TrackBox;->getSampleTableBox()Lcom/coremedia/iso/boxes/SampleTableBox;

    move-result-object v2

    invoke-virtual {v2}, Lcom/coremedia/iso/boxes/SampleTableBox;->getSampleSizeBox()Lcom/coremedia/iso/boxes/SampleSizeBox;

    move-result-object v2

    iput-object v2, p0, Lcom/googlecode/mp4parser/authoring/samples/DefaultMp4SampleList;->ssb:Lcom/coremedia/iso/boxes/SampleSizeBox;

    .line 50
    iget-object v2, p0, Lcom/googlecode/mp4parser/authoring/samples/DefaultMp4SampleList;->trackBox:Lcom/coremedia/iso/boxes/TrackBox;

    invoke-virtual {v2}, Lcom/coremedia/iso/boxes/TrackBox;->getSampleTableBox()Lcom/coremedia/iso/boxes/SampleTableBox;

    move-result-object v2

    invoke-virtual {v2}, Lcom/coremedia/iso/boxes/SampleTableBox;->getSampleToChunkBox()Lcom/coremedia/iso/boxes/SampleToChunkBox;

    move-result-object v2

    invoke-virtual {v2}, Lcom/coremedia/iso/boxes/SampleToChunkBox;->getEntries()Ljava/util/List;

    move-result-object v2

    .line 51
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    new-array v3, v3, [Lcom/coremedia/iso/boxes/SampleToChunkBox$Entry;

    invoke-interface {v2, v3}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Lcom/coremedia/iso/boxes/SampleToChunkBox$Entry;

    .line 55
    const/4 v3, 0x0

    const/4 v9, 0x1

    aget-object v3, v2, v3

    .line 56
    const/4 v8, 0x0

    .line 57
    const/4 v7, 0x0

    .line 59
    invoke-virtual {v3}, Lcom/coremedia/iso/boxes/SampleToChunkBox$Entry;->getFirstChunk()J

    move-result-wide v4

    .line 60
    invoke-virtual {v3}, Lcom/coremedia/iso/boxes/SampleToChunkBox$Entry;->getSamplesPerChunk()J

    move-result-wide v10

    invoke-static {v10, v11}, Lcom/googlecode/mp4parser/util/CastUtils;->l2i(J)I

    move-result v6

    .line 62
    const/4 v3, 0x1

    .line 63
    invoke-virtual {p0}, Lcom/googlecode/mp4parser/authoring/samples/DefaultMp4SampleList;->size()I

    move-result v11

    move v14, v3

    move v3, v7

    move v7, v8

    move v8, v9

    move v9, v14

    .line 68
    :goto_1
    add-int/lit8 v10, v7, 0x1

    .line 69
    int-to-long v12, v10

    cmp-long v7, v12, v4

    if-nez v7, :cond_a

    .line 71
    array-length v3, v2

    if-le v3, v8, :cond_3

    .line 72
    add-int/lit8 v7, v8, 0x1

    aget-object v4, v2, v8

    .line 73
    invoke-virtual {v4}, Lcom/coremedia/iso/boxes/SampleToChunkBox$Entry;->getSamplesPerChunk()J

    move-result-wide v12

    invoke-static {v12, v13}, Lcom/googlecode/mp4parser/util/CastUtils;->l2i(J)I

    move-result v3

    .line 74
    invoke-virtual {v4}, Lcom/coremedia/iso/boxes/SampleToChunkBox$Entry;->getFirstChunk()J

    move-result-wide v4

    .line 80
    :goto_2
    iget-object v8, p0, Lcom/googlecode/mp4parser/authoring/samples/DefaultMp4SampleList;->sampleOffsetsWithinChunks:[[J

    add-int/lit8 v12, v10, -0x1

    new-array v13, v6, [J

    aput-object v13, v8, v12

    .line 82
    add-int v8, v9, v6

    .line 66
    if-le v8, v11, :cond_9

    .line 83
    add-int/lit8 v3, v10, 0x1

    new-array v3, v3, [I

    iput-object v3, p0, Lcom/googlecode/mp4parser/authoring/samples/DefaultMp4SampleList;->chunkNumsStartSampleNum:[I

    .line 86
    const/4 v3, 0x0

    const/4 v9, 0x1

    aget-object v3, v2, v3

    .line 87
    const/4 v8, 0x0

    .line 88
    const/4 v7, 0x0

    .line 90
    invoke-virtual {v3}, Lcom/coremedia/iso/boxes/SampleToChunkBox$Entry;->getFirstChunk()J

    move-result-wide v4

    .line 91
    invoke-virtual {v3}, Lcom/coremedia/iso/boxes/SampleToChunkBox$Entry;->getSamplesPerChunk()J

    move-result-wide v12

    invoke-static {v12, v13}, Lcom/googlecode/mp4parser/util/CastUtils;->l2i(J)I

    move-result v6

    .line 93
    const/4 v3, 0x1

    move v10, v9

    .line 95
    :goto_3
    iget-object v12, p0, Lcom/googlecode/mp4parser/authoring/samples/DefaultMp4SampleList;->chunkNumsStartSampleNum:[I

    add-int/lit8 v9, v8, 0x1

    aput v3, v12, v8

    .line 96
    int-to-long v12, v9

    cmp-long v8, v12, v4

    if-nez v8, :cond_8

    .line 98
    array-length v4, v2

    if-le v4, v10, :cond_4

    .line 99
    add-int/lit8 v8, v10, 0x1

    aget-object v4, v2, v10

    .line 100
    invoke-virtual {v4}, Lcom/coremedia/iso/boxes/SampleToChunkBox$Entry;->getSamplesPerChunk()J

    move-result-wide v12

    invoke-static {v12, v13}, Lcom/googlecode/mp4parser/util/CastUtils;->l2i(J)I

    move-result v7

    .line 101
    invoke-virtual {v4}, Lcom/coremedia/iso/boxes/SampleToChunkBox$Entry;->getFirstChunk()J

    move-result-wide v4

    move v14, v7

    move v7, v6

    move v6, v14

    .line 108
    :goto_4
    add-int/2addr v3, v7

    .line 94
    if-le v3, v11, :cond_7

    .line 109
    iget-object v2, p0, Lcom/googlecode/mp4parser/authoring/samples/DefaultMp4SampleList;->chunkNumsStartSampleNum:[I

    const v3, 0x7fffffff

    aput v3, v2, v9

    .line 111
    const/4 v4, 0x0

    .line 112
    const-wide/16 v2, 0x0

    .line 113
    const/4 v5, 0x1

    :goto_5
    int-to-long v6, v5

    iget-object v8, p0, Lcom/googlecode/mp4parser/authoring/samples/DefaultMp4SampleList;->ssb:Lcom/coremedia/iso/boxes/SampleSizeBox;

    invoke-virtual {v8}, Lcom/coremedia/iso/boxes/SampleSizeBox;->getSampleCount()J

    move-result-wide v8

    cmp-long v6, v6, v8

    if-lez v6, :cond_5

    .line 124
    return-void

    .line 76
    :cond_3
    const/4 v3, -0x1

    .line 77
    const-wide v4, 0x7fffffffffffffffL

    move v7, v8

    goto :goto_2

    .line 103
    :cond_4
    const/4 v7, -0x1

    .line 104
    const-wide v4, 0x7fffffffffffffffL

    move v8, v10

    move v14, v6

    move v6, v7

    move v7, v14

    goto :goto_4

    .line 114
    :cond_5
    iget-object v6, p0, Lcom/googlecode/mp4parser/authoring/samples/DefaultMp4SampleList;->chunkNumsStartSampleNum:[I

    aget v6, v6, v4

    if-ne v5, v6, :cond_6

    .line 115
    add-int/lit8 v4, v4, 0x1

    .line 116
    const-wide/16 v2, 0x0

    .line 119
    :cond_6
    iget-object v6, p0, Lcom/googlecode/mp4parser/authoring/samples/DefaultMp4SampleList;->chunkSizes:[J

    add-int/lit8 v7, v4, -0x1

    aget-wide v8, v6, v7

    iget-object v10, p0, Lcom/googlecode/mp4parser/authoring/samples/DefaultMp4SampleList;->ssb:Lcom/coremedia/iso/boxes/SampleSizeBox;

    add-int/lit8 v11, v5, -0x1

    invoke-virtual {v10, v11}, Lcom/coremedia/iso/boxes/SampleSizeBox;->getSampleSizeAtIndex(I)J

    move-result-wide v10

    add-long/2addr v8, v10

    aput-wide v8, v6, v7

    .line 120
    iget-object v6, p0, Lcom/googlecode/mp4parser/authoring/samples/DefaultMp4SampleList;->sampleOffsetsWithinChunks:[[J

    add-int/lit8 v7, v4, -0x1

    aget-object v6, v6, v7

    iget-object v7, p0, Lcom/googlecode/mp4parser/authoring/samples/DefaultMp4SampleList;->chunkNumsStartSampleNum:[I

    add-int/lit8 v8, v4, -0x1

    aget v7, v7, v8

    sub-int v7, v5, v7

    aput-wide v2, v6, v7

    .line 121
    iget-object v6, p0, Lcom/googlecode/mp4parser/authoring/samples/DefaultMp4SampleList;->ssb:Lcom/coremedia/iso/boxes/SampleSizeBox;

    add-int/lit8 v7, v5, -0x1

    invoke-virtual {v6, v7}, Lcom/coremedia/iso/boxes/SampleSizeBox;->getSampleSizeAtIndex(I)J

    move-result-wide v6

    add-long/2addr v2, v6

    .line 113
    add-int/lit8 v5, v5, 0x1

    goto :goto_5

    :cond_7
    move v10, v8

    move v8, v9

    goto/16 :goto_3

    :cond_8
    move v8, v10

    goto :goto_4

    :cond_9
    move v9, v8

    move v8, v7

    move v7, v10

    move v14, v6

    move v6, v3

    move v3, v14

    goto/16 :goto_1

    :cond_a
    move v7, v8

    move v14, v3

    move v3, v6

    move v6, v14

    goto/16 :goto_2
.end method


# virtual methods
.method public get(I)Lcom/googlecode/mp4parser/authoring/Sample;
    .locals 18

    .prologue
    .line 154
    move/from16 v0, p1

    int-to-long v2, v0

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/googlecode/mp4parser/authoring/samples/DefaultMp4SampleList;->ssb:Lcom/coremedia/iso/boxes/SampleSizeBox;

    invoke-virtual {v4}, Lcom/coremedia/iso/boxes/SampleSizeBox;->getSampleCount()J

    move-result-wide v4

    cmp-long v2, v2, v4

    if-ltz v2, :cond_0

    .line 155
    new-instance v2, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {v2}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw v2

    .line 158
    :cond_0
    invoke-virtual/range {p0 .. p1}, Lcom/googlecode/mp4parser/authoring/samples/DefaultMp4SampleList;->getChunkForSample(I)I

    move-result v5

    .line 159
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/googlecode/mp4parser/authoring/samples/DefaultMp4SampleList;->chunkNumsStartSampleNum:[I

    aget v2, v2, v5

    add-int/lit8 v6, v2, -0x1

    .line 160
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/googlecode/mp4parser/authoring/samples/DefaultMp4SampleList;->chunkOffsets:[J

    int-to-long v8, v5

    invoke-static {v8, v9}, Lcom/googlecode/mp4parser/util/CastUtils;->l2i(J)I

    move-result v3

    aget-wide v10, v2, v3

    .line 161
    sub-int v2, p1, v6

    .line 162
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/googlecode/mp4parser/authoring/samples/DefaultMp4SampleList;->sampleOffsetsWithinChunks:[[J

    int-to-long v8, v5

    invoke-static {v8, v9}, Lcom/googlecode/mp4parser/util/CastUtils;->l2i(J)I

    move-result v4

    aget-object v9, v3, v4

    .line 163
    aget-wide v7, v9, v2

    .line 166
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/googlecode/mp4parser/authoring/samples/DefaultMp4SampleList;->cache:[[Ljava/nio/ByteBuffer;

    int-to-long v12, v5

    invoke-static {v12, v13}, Lcom/googlecode/mp4parser/util/CastUtils;->l2i(J)I

    move-result v3

    aget-object v2, v2, v3

    .line 167
    if-nez v2, :cond_1

    .line 168
    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 169
    const-wide/16 v2, 0x0

    .line 171
    const/4 v4, 0x0

    :goto_0
    :try_start_0
    array-length v13, v9

    if-lt v4, v13, :cond_3

    .line 179
    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/googlecode/mp4parser/authoring/samples/DefaultMp4SampleList;->topLevel:Lcom/coremedia/iso/boxes/Container;

    .line 180
    add-long/2addr v10, v2

    .line 181
    neg-long v2, v2

    array-length v13, v9

    add-int/lit8 v13, v13, -0x1

    aget-wide v14, v9, v13

    add-long/2addr v2, v14

    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/googlecode/mp4parser/authoring/samples/DefaultMp4SampleList;->ssb:Lcom/coremedia/iso/boxes/SampleSizeBox;

    array-length v9, v9

    add-int/2addr v6, v9

    add-int/lit8 v6, v6, -0x1

    invoke-virtual {v13, v6}, Lcom/coremedia/iso/boxes/SampleSizeBox;->getSampleSizeAtIndex(I)J

    move-result-wide v14

    add-long/2addr v2, v14

    .line 179
    invoke-interface {v4, v10, v11, v2, v3}, Lcom/coremedia/iso/boxes/Container;->getByteBuffer(JJ)Ljava/nio/ByteBuffer;

    move-result-object v2

    invoke-interface {v12, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 182
    invoke-interface {v12}, Ljava/util/List;->size()I

    move-result v2

    new-array v2, v2, [Ljava/nio/ByteBuffer;

    invoke-interface {v12, v2}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Ljava/nio/ByteBuffer;

    .line 183
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/googlecode/mp4parser/authoring/samples/DefaultMp4SampleList;->cache:[[Ljava/nio/ByteBuffer;

    int-to-long v4, v5

    invoke-static {v4, v5}, Lcom/googlecode/mp4parser/util/CastUtils;->l2i(J)I

    move-result v4

    aput-object v2, v3, v4
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 189
    :cond_1
    const/4 v3, 0x0

    .line 191
    array-length v5, v2

    const/4 v4, 0x0

    :goto_1
    if-lt v4, v5, :cond_5

    move-object v6, v3

    .line 200
    :cond_2
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/googlecode/mp4parser/authoring/samples/DefaultMp4SampleList;->ssb:Lcom/coremedia/iso/boxes/SampleSizeBox;

    move/from16 v0, p1

    invoke-virtual {v2, v0}, Lcom/coremedia/iso/boxes/SampleSizeBox;->getSampleSizeAtIndex(I)J

    move-result-wide v4

    .line 203
    new-instance v2, Lcom/googlecode/mp4parser/authoring/samples/DefaultMp4SampleList$1;

    move-object/from16 v3, p0

    invoke-direct/range {v2 .. v8}, Lcom/googlecode/mp4parser/authoring/samples/DefaultMp4SampleList$1;-><init>(Lcom/googlecode/mp4parser/authoring/samples/DefaultMp4SampleList;JLjava/nio/ByteBuffer;J)V

    return-object v2

    .line 172
    :cond_3
    :try_start_1
    aget-wide v14, v9, v4

    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/googlecode/mp4parser/authoring/samples/DefaultMp4SampleList;->ssb:Lcom/coremedia/iso/boxes/SampleSizeBox;

    add-int v16, v4, v6

    move/from16 v0, v16

    invoke-virtual {v13, v0}, Lcom/coremedia/iso/boxes/SampleSizeBox;->getSampleSizeAtIndex(I)J

    move-result-wide v16

    add-long v14, v14, v16

    sub-long/2addr v14, v2

    const-wide/32 v16, 0x10000000

    cmp-long v13, v14, v16

    if-lez v13, :cond_4

    .line 173
    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/googlecode/mp4parser/authoring/samples/DefaultMp4SampleList;->topLevel:Lcom/coremedia/iso/boxes/Container;

    .line 174
    add-long v14, v10, v2

    .line 175
    aget-wide v16, v9, v4

    sub-long v2, v16, v2

    .line 173
    invoke-interface {v13, v14, v15, v2, v3}, Lcom/coremedia/iso/boxes/Container;->getByteBuffer(JJ)Ljava/nio/ByteBuffer;

    move-result-object v2

    invoke-interface {v12, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 176
    aget-wide v2, v9, v4
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 171
    :cond_4
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 184
    :catch_0
    move-exception v2

    .line 185
    new-instance v3, Ljava/lang/IndexOutOfBoundsException;

    invoke-virtual {v2}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v3, v2}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v3

    .line 191
    :cond_5
    aget-object v6, v2, v4

    .line 192
    invoke-virtual {v6}, Ljava/nio/ByteBuffer;->limit()I

    move-result v9

    int-to-long v10, v9

    cmp-long v9, v7, v10

    if-ltz v9, :cond_2

    .line 196
    invoke-virtual {v6}, Ljava/nio/ByteBuffer;->limit()I

    move-result v6

    int-to-long v10, v6

    sub-long/2addr v7, v10

    .line 191
    add-int/lit8 v4, v4, 0x1

    goto :goto_1
.end method

.method public bridge synthetic get(I)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 1
    invoke-virtual {p0, p1}, Lcom/googlecode/mp4parser/authoring/samples/DefaultMp4SampleList;->get(I)Lcom/googlecode/mp4parser/authoring/Sample;

    move-result-object v0

    return-object v0
.end method

.method declared-synchronized getChunkForSample(I)I
    .locals 3

    .prologue
    .line 127
    monitor-enter p0

    add-int/lit8 v0, p1, 0x1

    .line 129
    :try_start_0
    iget-object v1, p0, Lcom/googlecode/mp4parser/authoring/samples/DefaultMp4SampleList;->chunkNumsStartSampleNum:[I

    iget v2, p0, Lcom/googlecode/mp4parser/authoring/samples/DefaultMp4SampleList;->lastChunk:I

    aget v1, v1, v2

    if-lt v0, v1, :cond_0

    iget-object v1, p0, Lcom/googlecode/mp4parser/authoring/samples/DefaultMp4SampleList;->chunkNumsStartSampleNum:[I

    iget v2, p0, Lcom/googlecode/mp4parser/authoring/samples/DefaultMp4SampleList;->lastChunk:I

    add-int/lit8 v2, v2, 0x1

    aget v1, v1, v2

    if-ge v0, v1, :cond_0

    .line 130
    iget v0, p0, Lcom/googlecode/mp4parser/authoring/samples/DefaultMp4SampleList;->lastChunk:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 147
    :goto_0
    monitor-exit p0

    return v0

    .line 131
    :cond_0
    :try_start_1
    iget-object v1, p0, Lcom/googlecode/mp4parser/authoring/samples/DefaultMp4SampleList;->chunkNumsStartSampleNum:[I

    iget v2, p0, Lcom/googlecode/mp4parser/authoring/samples/DefaultMp4SampleList;->lastChunk:I

    aget v1, v1, v2

    if-ge v0, v1, :cond_2

    .line 134
    const/4 v1, 0x0

    iput v1, p0, Lcom/googlecode/mp4parser/authoring/samples/DefaultMp4SampleList;->lastChunk:I

    .line 136
    :goto_1
    iget-object v1, p0, Lcom/googlecode/mp4parser/authoring/samples/DefaultMp4SampleList;->chunkNumsStartSampleNum:[I

    iget v2, p0, Lcom/googlecode/mp4parser/authoring/samples/DefaultMp4SampleList;->lastChunk:I

    add-int/lit8 v2, v2, 0x1

    aget v1, v1, v2

    if-le v1, v0, :cond_1

    .line 139
    iget v0, p0, Lcom/googlecode/mp4parser/authoring/samples/DefaultMp4SampleList;->lastChunk:I

    goto :goto_0

    .line 137
    :cond_1
    iget v1, p0, Lcom/googlecode/mp4parser/authoring/samples/DefaultMp4SampleList;->lastChunk:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lcom/googlecode/mp4parser/authoring/samples/DefaultMp4SampleList;->lastChunk:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    .line 127
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 142
    :cond_2
    :try_start_2
    iget v1, p0, Lcom/googlecode/mp4parser/authoring/samples/DefaultMp4SampleList;->lastChunk:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lcom/googlecode/mp4parser/authoring/samples/DefaultMp4SampleList;->lastChunk:I

    .line 144
    :goto_2
    iget-object v1, p0, Lcom/googlecode/mp4parser/authoring/samples/DefaultMp4SampleList;->chunkNumsStartSampleNum:[I

    iget v2, p0, Lcom/googlecode/mp4parser/authoring/samples/DefaultMp4SampleList;->lastChunk:I

    add-int/lit8 v2, v2, 0x1

    aget v1, v1, v2

    if-le v1, v0, :cond_3

    .line 147
    iget v0, p0, Lcom/googlecode/mp4parser/authoring/samples/DefaultMp4SampleList;->lastChunk:I

    goto :goto_0

    .line 145
    :cond_3
    iget v1, p0, Lcom/googlecode/mp4parser/authoring/samples/DefaultMp4SampleList;->lastChunk:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lcom/googlecode/mp4parser/authoring/samples/DefaultMp4SampleList;->lastChunk:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_2
.end method

.method public size()I
    .locals 2

    .prologue
    .line 226
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/samples/DefaultMp4SampleList;->trackBox:Lcom/coremedia/iso/boxes/TrackBox;

    invoke-virtual {v0}, Lcom/coremedia/iso/boxes/TrackBox;->getSampleTableBox()Lcom/coremedia/iso/boxes/SampleTableBox;

    move-result-object v0

    invoke-virtual {v0}, Lcom/coremedia/iso/boxes/SampleTableBox;->getSampleSizeBox()Lcom/coremedia/iso/boxes/SampleSizeBox;

    move-result-object v0

    invoke-virtual {v0}, Lcom/coremedia/iso/boxes/SampleSizeBox;->getSampleCount()J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/CastUtils;->l2i(J)I

    move-result v0

    return v0
.end method
