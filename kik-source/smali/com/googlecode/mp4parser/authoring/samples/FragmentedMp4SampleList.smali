.class public Lcom/googlecode/mp4parser/authoring/samples/FragmentedMp4SampleList;
.super Ljava/util/AbstractList;
.source "SourceFile"


# instance fields
.field private allTrafs:Ljava/util/List;

.field private firstSamples:[I

.field fragments:[Lcom/coremedia/iso/IsoFile;

.field private sampleCache:[Ljava/lang/ref/SoftReference;

.field private size_:I

.field topLevel:Lcom/coremedia/iso/boxes/Container;

.field trackBox:Lcom/coremedia/iso/boxes/TrackBox;

.field trex:Lcom/coremedia/iso/boxes/fragment/TrackExtendsBox;

.field private trunDataCache:Ljava/util/Map;


# direct methods
.method public varargs constructor <init>(JLcom/coremedia/iso/boxes/Container;[Lcom/coremedia/iso/IsoFile;)V
    .locals 7

    .prologue
    const/4 v0, 0x0

    .line 37
    invoke-direct {p0}, Ljava/util/AbstractList;-><init>()V

    .line 28
    iput-object v0, p0, Lcom/googlecode/mp4parser/authoring/samples/FragmentedMp4SampleList;->trackBox:Lcom/coremedia/iso/boxes/TrackBox;

    .line 29
    iput-object v0, p0, Lcom/googlecode/mp4parser/authoring/samples/FragmentedMp4SampleList;->trex:Lcom/coremedia/iso/boxes/fragment/TrackExtendsBox;

    .line 33
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/googlecode/mp4parser/authoring/samples/FragmentedMp4SampleList;->trunDataCache:Ljava/util/Map;

    .line 35
    const/4 v0, -0x1

    iput v0, p0, Lcom/googlecode/mp4parser/authoring/samples/FragmentedMp4SampleList;->size_:I

    .line 38
    iput-object p3, p0, Lcom/googlecode/mp4parser/authoring/samples/FragmentedMp4SampleList;->topLevel:Lcom/coremedia/iso/boxes/Container;

    .line 39
    iput-object p4, p0, Lcom/googlecode/mp4parser/authoring/samples/FragmentedMp4SampleList;->fragments:[Lcom/coremedia/iso/IsoFile;

    .line 40
    const-string v0, "moov[0]/trak"

    invoke-static {p3, v0}, Lcom/googlecode/mp4parser/util/Path;->getPaths(Lcom/coremedia/iso/boxes/Container;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    .line 41
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_1

    .line 46
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/samples/FragmentedMp4SampleList;->trackBox:Lcom/coremedia/iso/boxes/TrackBox;

    if-nez v0, :cond_2

    .line 47
    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "This MP4 does not contain track "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 41
    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/coremedia/iso/boxes/TrackBox;

    .line 42
    invoke-virtual {v0}, Lcom/coremedia/iso/boxes/TrackBox;->getTrackHeaderBox()Lcom/coremedia/iso/boxes/TrackHeaderBox;

    move-result-object v2

    invoke-virtual {v2}, Lcom/coremedia/iso/boxes/TrackHeaderBox;->getTrackId()J

    move-result-wide v2

    cmp-long v2, v2, p1

    if-nez v2, :cond_0

    .line 43
    iput-object v0, p0, Lcom/googlecode/mp4parser/authoring/samples/FragmentedMp4SampleList;->trackBox:Lcom/coremedia/iso/boxes/TrackBox;

    goto :goto_0

    .line 50
    :cond_2
    const-string v0, "moov[0]/mvex[0]/trex"

    invoke-static {p3, v0}, Lcom/googlecode/mp4parser/util/Path;->getPaths(Lcom/coremedia/iso/boxes/Container;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    .line 51
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_3
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_4

    .line 56
    const-class v0, Ljava/lang/ref/SoftReference;

    invoke-virtual {p0}, Lcom/googlecode/mp4parser/authoring/samples/FragmentedMp4SampleList;->size()I

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/ref/SoftReference;

    iput-object v0, p0, Lcom/googlecode/mp4parser/authoring/samples/FragmentedMp4SampleList;->sampleCache:[Ljava/lang/ref/SoftReference;

    .line 57
    invoke-direct {p0}, Lcom/googlecode/mp4parser/authoring/samples/FragmentedMp4SampleList;->initAllFragments()Ljava/util/List;

    .line 58
    return-void

    .line 51
    :cond_4
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/coremedia/iso/boxes/fragment/TrackExtendsBox;

    .line 52
    invoke-virtual {v0}, Lcom/coremedia/iso/boxes/fragment/TrackExtendsBox;->getTrackId()J

    move-result-wide v2

    iget-object v4, p0, Lcom/googlecode/mp4parser/authoring/samples/FragmentedMp4SampleList;->trackBox:Lcom/coremedia/iso/boxes/TrackBox;

    invoke-virtual {v4}, Lcom/coremedia/iso/boxes/TrackBox;->getTrackHeaderBox()Lcom/coremedia/iso/boxes/TrackHeaderBox;

    move-result-object v4

    invoke-virtual {v4}, Lcom/coremedia/iso/boxes/TrackHeaderBox;->getTrackId()J

    move-result-wide v4

    cmp-long v2, v2, v4

    if-nez v2, :cond_3

    .line 53
    iput-object v0, p0, Lcom/googlecode/mp4parser/authoring/samples/FragmentedMp4SampleList;->trex:Lcom/coremedia/iso/boxes/fragment/TrackExtendsBox;

    goto :goto_1
.end method

.method private getTrafSize(Lcom/coremedia/iso/boxes/fragment/TrackFragmentBox;)I
    .locals 6

    .prologue
    const/4 v0, 0x0

    .line 94
    invoke-virtual {p1}, Lcom/coremedia/iso/boxes/fragment/TrackFragmentBox;->getBoxes()Ljava/util/List;

    move-result-object v3

    move v1, v0

    move v2, v0

    .line 96
    :goto_0
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v0

    if-lt v1, v0, :cond_0

    .line 102
    return v2

    .line 97
    :cond_0
    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/coremedia/iso/boxes/Box;

    .line 98
    instance-of v4, v0, Lcom/coremedia/iso/boxes/fragment/TrackRunBox;

    if-eqz v4, :cond_1

    .line 99
    check-cast v0, Lcom/coremedia/iso/boxes/fragment/TrackRunBox;

    invoke-virtual {v0}, Lcom/coremedia/iso/boxes/fragment/TrackRunBox;->getSampleCount()J

    move-result-wide v4

    invoke-static {v4, v5}, Lcom/googlecode/mp4parser/util/CastUtils;->l2i(J)I

    move-result v0

    add-int/2addr v2, v0

    .line 96
    :cond_1
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0
.end method

.method private initAllFragments()Ljava/util/List;
    .locals 12

    .prologue
    const/4 v1, 0x0

    .line 61
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/samples/FragmentedMp4SampleList;->allTrafs:Ljava/util/List;

    if-eqz v0, :cond_0

    .line 62
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/samples/FragmentedMp4SampleList;->allTrafs:Ljava/util/List;

    .line 90
    :goto_0
    return-object v0

    .line 64
    :cond_0
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 65
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/samples/FragmentedMp4SampleList;->topLevel:Lcom/coremedia/iso/boxes/Container;

    const-class v2, Lcom/coremedia/iso/boxes/fragment/MovieFragmentBox;

    invoke-interface {v0, v2}, Lcom/coremedia/iso/boxes/Container;->getBoxes(Ljava/lang/Class;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_3

    .line 72
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/samples/FragmentedMp4SampleList;->fragments:[Lcom/coremedia/iso/IsoFile;

    if-eqz v0, :cond_2

    .line 73
    iget-object v4, p0, Lcom/googlecode/mp4parser/authoring/samples/FragmentedMp4SampleList;->fragments:[Lcom/coremedia/iso/IsoFile;

    array-length v5, v4

    move v2, v1

    :goto_1
    if-lt v2, v5, :cond_5

    .line 83
    :cond_2
    iput-object v3, p0, Lcom/googlecode/mp4parser/authoring/samples/FragmentedMp4SampleList;->allTrafs:Ljava/util/List;

    .line 84
    const/4 v0, 0x1

    .line 85
    iget-object v2, p0, Lcom/googlecode/mp4parser/authoring/samples/FragmentedMp4SampleList;->allTrafs:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    new-array v2, v2, [I

    iput-object v2, p0, Lcom/googlecode/mp4parser/authoring/samples/FragmentedMp4SampleList;->firstSamples:[I

    move v2, v0

    .line 86
    :goto_2
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/samples/FragmentedMp4SampleList;->allTrafs:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt v1, v0, :cond_9

    move-object v0, v3

    .line 90
    goto :goto_0

    .line 65
    :cond_3
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/coremedia/iso/boxes/fragment/MovieFragmentBox;

    .line 66
    const-class v4, Lcom/coremedia/iso/boxes/fragment/TrackFragmentBox;

    invoke-virtual {v0, v4}, Lcom/coremedia/iso/boxes/fragment/MovieFragmentBox;->getBoxes(Ljava/lang/Class;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_4
    :goto_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/coremedia/iso/boxes/fragment/TrackFragmentBox;

    .line 67
    invoke-virtual {v0}, Lcom/coremedia/iso/boxes/fragment/TrackFragmentBox;->getTrackFragmentHeaderBox()Lcom/coremedia/iso/boxes/fragment/TrackFragmentHeaderBox;

    move-result-object v5

    invoke-virtual {v5}, Lcom/coremedia/iso/boxes/fragment/TrackFragmentHeaderBox;->getTrackId()J

    move-result-wide v6

    iget-object v5, p0, Lcom/googlecode/mp4parser/authoring/samples/FragmentedMp4SampleList;->trackBox:Lcom/coremedia/iso/boxes/TrackBox;

    invoke-virtual {v5}, Lcom/coremedia/iso/boxes/TrackBox;->getTrackHeaderBox()Lcom/coremedia/iso/boxes/TrackHeaderBox;

    move-result-object v5

    invoke-virtual {v5}, Lcom/coremedia/iso/boxes/TrackHeaderBox;->getTrackId()J

    move-result-wide v8

    cmp-long v5, v6, v8

    if-nez v5, :cond_4

    .line 68
    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 73
    :cond_5
    aget-object v0, v4, v2

    .line 74
    const-class v6, Lcom/coremedia/iso/boxes/fragment/MovieFragmentBox;

    invoke-virtual {v0, v6}, Lcom/coremedia/iso/IsoFile;->getBoxes(Ljava/lang/Class;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_6
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_7

    .line 73
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_1

    .line 74
    :cond_7
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/coremedia/iso/boxes/fragment/MovieFragmentBox;

    .line 75
    const-class v7, Lcom/coremedia/iso/boxes/fragment/TrackFragmentBox;

    invoke-virtual {v0, v7}, Lcom/coremedia/iso/boxes/fragment/MovieFragmentBox;->getBoxes(Ljava/lang/Class;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_8
    :goto_4
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/coremedia/iso/boxes/fragment/TrackFragmentBox;

    .line 76
    invoke-virtual {v0}, Lcom/coremedia/iso/boxes/fragment/TrackFragmentBox;->getTrackFragmentHeaderBox()Lcom/coremedia/iso/boxes/fragment/TrackFragmentHeaderBox;

    move-result-object v8

    invoke-virtual {v8}, Lcom/coremedia/iso/boxes/fragment/TrackFragmentHeaderBox;->getTrackId()J

    move-result-wide v8

    iget-object v10, p0, Lcom/googlecode/mp4parser/authoring/samples/FragmentedMp4SampleList;->trackBox:Lcom/coremedia/iso/boxes/TrackBox;

    invoke-virtual {v10}, Lcom/coremedia/iso/boxes/TrackBox;->getTrackHeaderBox()Lcom/coremedia/iso/boxes/TrackHeaderBox;

    move-result-object v10

    invoke-virtual {v10}, Lcom/coremedia/iso/boxes/TrackHeaderBox;->getTrackId()J

    move-result-wide v10

    cmp-long v8, v8, v10

    if-nez v8, :cond_8

    .line 77
    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_4

    .line 87
    :cond_9
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/samples/FragmentedMp4SampleList;->firstSamples:[I

    aput v2, v0, v1

    .line 88
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/samples/FragmentedMp4SampleList;->allTrafs:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/coremedia/iso/boxes/fragment/TrackFragmentBox;

    invoke-direct {p0, v0}, Lcom/googlecode/mp4parser/authoring/samples/FragmentedMp4SampleList;->getTrafSize(Lcom/coremedia/iso/boxes/fragment/TrackFragmentBox;)I

    move-result v0

    add-int/2addr v2, v0

    .line 86
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto/16 :goto_2
.end method


# virtual methods
.method public get(I)Lcom/googlecode/mp4parser/authoring/Sample;
    .locals 20

    .prologue
    .line 109
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/googlecode/mp4parser/authoring/samples/FragmentedMp4SampleList;->sampleCache:[Ljava/lang/ref/SoftReference;

    aget-object v2, v2, p1

    if-eqz v2, :cond_0

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/googlecode/mp4parser/authoring/samples/FragmentedMp4SampleList;->sampleCache:[Ljava/lang/ref/SoftReference;

    aget-object v2, v2, p1

    invoke-virtual {v2}, Ljava/lang/ref/SoftReference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/googlecode/mp4parser/authoring/Sample;

    if-eqz v2, :cond_0

    .line 215
    :goto_0
    return-object v2

    .line 114
    :cond_0
    add-int/lit8 v4, p1, 0x1

    .line 115
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/googlecode/mp4parser/authoring/samples/FragmentedMp4SampleList;->firstSamples:[I

    array-length v2, v2

    add-int/lit8 v2, v2, -0x1

    move v3, v2

    .line 116
    :goto_1
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/googlecode/mp4parser/authoring/samples/FragmentedMp4SampleList;->firstSamples:[I

    aget v2, v2, v3

    sub-int v2, v4, v2

    if-ltz v2, :cond_2

    .line 119
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/googlecode/mp4parser/authoring/samples/FragmentedMp4SampleList;->allTrafs:Ljava/util/List;

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/coremedia/iso/boxes/fragment/TrackFragmentBox;

    .line 121
    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/googlecode/mp4parser/authoring/samples/FragmentedMp4SampleList;->firstSamples:[I

    aget v3, v5, v3

    sub-int v11, v4, v3

    .line 122
    const/4 v4, 0x0

    .line 123
    invoke-virtual {v2}, Lcom/coremedia/iso/boxes/fragment/TrackFragmentBox;->getParent()Lcom/coremedia/iso/boxes/Container;

    move-result-object v3

    check-cast v3, Lcom/coremedia/iso/boxes/fragment/MovieFragmentBox;

    .line 125
    invoke-virtual {v2}, Lcom/coremedia/iso/boxes/fragment/TrackFragmentBox;->getBoxes()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    move v5, v4

    :cond_1
    :goto_2
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-nez v4, :cond_3

    .line 220
    new-instance v2, Ljava/lang/RuntimeException;

    const-string v3, "Couldn\'t find sample in the traf I was looking"

    invoke-direct {v2, v3}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 117
    :cond_2
    add-int/lit8 v2, v3, -0x1

    move v3, v2

    goto :goto_1

    .line 125
    :cond_3
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/coremedia/iso/boxes/Box;

    .line 126
    instance-of v7, v4, Lcom/coremedia/iso/boxes/fragment/TrackRunBox;

    if-eqz v7, :cond_1

    .line 127
    check-cast v4, Lcom/coremedia/iso/boxes/fragment/TrackRunBox;

    .line 130
    invoke-virtual {v4}, Lcom/coremedia/iso/boxes/fragment/TrackRunBox;->getEntries()Ljava/util/List;

    move-result-object v7

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v7

    sub-int v8, v11, v5

    if-ge v7, v8, :cond_4

    .line 131
    invoke-virtual {v4}, Lcom/coremedia/iso/boxes/fragment/TrackRunBox;->getEntries()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    add-int/2addr v4, v5

    move v5, v4

    .line 132
    goto :goto_2

    .line 136
    :cond_4
    invoke-virtual {v4}, Lcom/coremedia/iso/boxes/fragment/TrackRunBox;->getEntries()Ljava/util/List;

    move-result-object v12

    .line 137
    invoke-virtual {v2}, Lcom/coremedia/iso/boxes/fragment/TrackFragmentBox;->getTrackFragmentHeaderBox()Lcom/coremedia/iso/boxes/fragment/TrackFragmentHeaderBox;

    move-result-object v10

    .line 138
    invoke-virtual {v4}, Lcom/coremedia/iso/boxes/fragment/TrackRunBox;->isSampleSizePresent()Z

    move-result v13

    .line 139
    invoke-virtual {v10}, Lcom/coremedia/iso/boxes/fragment/TrackFragmentHeaderBox;->hasDefaultSampleSize()Z

    move-result v2

    .line 140
    const-wide/16 v6, 0x0

    .line 141
    if-nez v13, :cond_10

    .line 142
    if-eqz v2, :cond_8

    .line 143
    invoke-virtual {v10}, Lcom/coremedia/iso/boxes/fragment/TrackFragmentHeaderBox;->getDefaultSampleSize()J

    move-result-wide v6

    move-wide v8, v6

    .line 152
    :goto_3
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/googlecode/mp4parser/authoring/samples/FragmentedMp4SampleList;->trunDataCache:Ljava/util/Map;

    invoke-interface {v2, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/ref/SoftReference;

    .line 153
    if-eqz v2, :cond_a

    invoke-virtual {v2}, Ljava/lang/ref/SoftReference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/nio/ByteBuffer;

    move-object v6, v2

    .line 154
    :goto_4
    if-nez v6, :cond_7

    .line 155
    const-wide/16 v6, 0x0

    .line 157
    invoke-virtual {v10}, Lcom/coremedia/iso/boxes/fragment/TrackFragmentHeaderBox;->hasBaseDataOffset()Z

    move-result v2

    if-eqz v2, :cond_5

    .line 158
    const-wide/16 v6, 0x0

    invoke-virtual {v10}, Lcom/coremedia/iso/boxes/fragment/TrackFragmentHeaderBox;->getBaseDataOffset()J

    move-result-wide v14

    add-long/2addr v6, v14

    .line 159
    invoke-virtual {v3}, Lcom/coremedia/iso/boxes/fragment/MovieFragmentBox;->getParent()Lcom/coremedia/iso/boxes/Container;

    move-result-object v3

    .line 164
    :cond_5
    invoke-virtual {v4}, Lcom/coremedia/iso/boxes/fragment/TrackRunBox;->isDataOffsetPresent()Z

    move-result v2

    if-eqz v2, :cond_6

    .line 165
    invoke-virtual {v4}, Lcom/coremedia/iso/boxes/fragment/TrackRunBox;->getDataOffset()I

    move-result v2

    int-to-long v14, v2

    add-long/2addr v6, v14

    .line 167
    :cond_6
    const/4 v2, 0x0

    .line 168
    invoke-interface {v12}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v14

    move v10, v2

    :goto_5
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_b

    .line 176
    int-to-long v14, v10

    :try_start_0
    invoke-interface {v3, v6, v7, v14, v15}, Lcom/coremedia/iso/boxes/Container;->getByteBuffer(JJ)Ljava/nio/ByteBuffer;

    move-result-object v6

    .line 177
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/googlecode/mp4parser/authoring/samples/FragmentedMp4SampleList;->trunDataCache:Ljava/util/Map;

    new-instance v3, Ljava/lang/ref/SoftReference;

    invoke-direct {v3, v6}, Ljava/lang/ref/SoftReference;-><init>(Ljava/lang/Object;)V

    invoke-interface {v2, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 183
    :cond_7
    const/4 v7, 0x0

    .line 184
    const/4 v2, 0x0

    move v3, v2

    :goto_6
    sub-int v2, v11, v5

    if-lt v3, v2, :cond_d

    .line 192
    if-eqz v13, :cond_f

    .line 193
    sub-int v2, v11, v5

    invoke-interface {v12, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/coremedia/iso/boxes/fragment/TrackRunBox$Entry;

    invoke-virtual {v2}, Lcom/coremedia/iso/boxes/fragment/TrackRunBox$Entry;->getSampleSize()J

    move-result-wide v4

    .line 200
    :goto_7
    new-instance v2, Lcom/googlecode/mp4parser/authoring/samples/FragmentedMp4SampleList$1;

    move-object/from16 v3, p0

    invoke-direct/range {v2 .. v7}, Lcom/googlecode/mp4parser/authoring/samples/FragmentedMp4SampleList$1;-><init>(Lcom/googlecode/mp4parser/authoring/samples/FragmentedMp4SampleList;JLjava/nio/ByteBuffer;I)V

    .line 214
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/googlecode/mp4parser/authoring/samples/FragmentedMp4SampleList;->sampleCache:[Ljava/lang/ref/SoftReference;

    new-instance v4, Ljava/lang/ref/SoftReference;

    invoke-direct {v4, v2}, Ljava/lang/ref/SoftReference;-><init>(Ljava/lang/Object;)V

    aput-object v4, v3, p1

    goto/16 :goto_0

    .line 145
    :cond_8
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/googlecode/mp4parser/authoring/samples/FragmentedMp4SampleList;->trex:Lcom/coremedia/iso/boxes/fragment/TrackExtendsBox;

    if-nez v2, :cond_9

    .line 146
    new-instance v2, Ljava/lang/RuntimeException;

    const-string v3, "File doesn\'t contain trex box but track fragments aren\'t fully self contained. Cannot determine sample size."

    invoke-direct {v2, v3}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 148
    :cond_9
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/googlecode/mp4parser/authoring/samples/FragmentedMp4SampleList;->trex:Lcom/coremedia/iso/boxes/fragment/TrackExtendsBox;

    invoke-virtual {v2}, Lcom/coremedia/iso/boxes/fragment/TrackExtendsBox;->getDefaultSampleSize()J

    move-result-wide v6

    move-wide v8, v6

    goto/16 :goto_3

    .line 153
    :cond_a
    const/4 v6, 0x0

    goto/16 :goto_4

    .line 168
    :cond_b
    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/coremedia/iso/boxes/fragment/TrackRunBox$Entry;

    .line 169
    if-eqz v13, :cond_c

    .line 170
    int-to-long v0, v10

    move-wide/from16 v16, v0

    invoke-virtual {v2}, Lcom/coremedia/iso/boxes/fragment/TrackRunBox$Entry;->getSampleSize()J

    move-result-wide v18

    add-long v16, v16, v18

    move-wide/from16 v0, v16

    long-to-int v2, v0

    move v10, v2

    .line 171
    goto :goto_5

    .line 172
    :cond_c
    int-to-long v0, v10

    move-wide/from16 v16, v0

    add-long v16, v16, v8

    move-wide/from16 v0, v16

    long-to-int v2, v0

    move v10, v2

    goto :goto_5

    .line 178
    :catch_0
    move-exception v2

    .line 179
    new-instance v3, Ljava/lang/RuntimeException;

    invoke-direct {v3, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v3

    .line 185
    :cond_d
    if-eqz v13, :cond_e

    .line 186
    int-to-long v14, v7

    invoke-interface {v12, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/coremedia/iso/boxes/fragment/TrackRunBox$Entry;

    invoke-virtual {v2}, Lcom/coremedia/iso/boxes/fragment/TrackRunBox$Entry;->getSampleSize()J

    move-result-wide v16

    add-long v14, v14, v16

    long-to-int v2, v14

    .line 184
    :goto_8
    add-int/lit8 v3, v3, 0x1

    move v7, v2

    goto :goto_6

    .line 188
    :cond_e
    int-to-long v14, v7

    add-long/2addr v14, v8

    long-to-int v2, v14

    goto :goto_8

    :cond_f
    move-wide v4, v8

    .line 195
    goto :goto_7

    :cond_10
    move-wide v8, v6

    goto/16 :goto_3
.end method

.method public bridge synthetic get(I)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 1
    invoke-virtual {p0, p1}, Lcom/googlecode/mp4parser/authoring/samples/FragmentedMp4SampleList;->get(I)Lcom/googlecode/mp4parser/authoring/Sample;

    move-result-object v0

    return-object v0
.end method

.method public size()I
    .locals 12

    .prologue
    const/4 v2, 0x0

    .line 225
    iget v0, p0, Lcom/googlecode/mp4parser/authoring/samples/FragmentedMp4SampleList;->size_:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 226
    iget v0, p0, Lcom/googlecode/mp4parser/authoring/samples/FragmentedMp4SampleList;->size_:I

    .line 246
    :goto_0
    return v0

    .line 229
    :cond_0
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/samples/FragmentedMp4SampleList;->topLevel:Lcom/coremedia/iso/boxes/Container;

    const-class v1, Lcom/coremedia/iso/boxes/fragment/MovieFragmentBox;

    invoke-interface {v0, v1}, Lcom/coremedia/iso/boxes/Container;->getBoxes(Ljava/lang/Class;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    move v1, v2

    :cond_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_2

    .line 236
    iget-object v4, p0, Lcom/googlecode/mp4parser/authoring/samples/FragmentedMp4SampleList;->fragments:[Lcom/coremedia/iso/IsoFile;

    array-length v5, v4

    move v3, v2

    move v0, v1

    :goto_1
    if-lt v3, v5, :cond_4

    .line 245
    iput v0, p0, Lcom/googlecode/mp4parser/authoring/samples/FragmentedMp4SampleList;->size_:I

    goto :goto_0

    .line 229
    :cond_2
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/coremedia/iso/boxes/fragment/MovieFragmentBox;

    .line 230
    const-class v4, Lcom/coremedia/iso/boxes/fragment/TrackFragmentBox;

    invoke-virtual {v0, v4}, Lcom/coremedia/iso/boxes/fragment/MovieFragmentBox;->getBoxes(Ljava/lang/Class;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_3
    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/coremedia/iso/boxes/fragment/TrackFragmentBox;

    .line 231
    invoke-virtual {v0}, Lcom/coremedia/iso/boxes/fragment/TrackFragmentBox;->getTrackFragmentHeaderBox()Lcom/coremedia/iso/boxes/fragment/TrackFragmentHeaderBox;

    move-result-object v5

    invoke-virtual {v5}, Lcom/coremedia/iso/boxes/fragment/TrackFragmentHeaderBox;->getTrackId()J

    move-result-wide v6

    iget-object v5, p0, Lcom/googlecode/mp4parser/authoring/samples/FragmentedMp4SampleList;->trackBox:Lcom/coremedia/iso/boxes/TrackBox;

    invoke-virtual {v5}, Lcom/coremedia/iso/boxes/TrackBox;->getTrackHeaderBox()Lcom/coremedia/iso/boxes/TrackHeaderBox;

    move-result-object v5

    invoke-virtual {v5}, Lcom/coremedia/iso/boxes/TrackHeaderBox;->getTrackId()J

    move-result-wide v8

    cmp-long v5, v6, v8

    if-nez v5, :cond_3

    .line 232
    int-to-long v6, v1

    const-class v1, Lcom/coremedia/iso/boxes/fragment/TrackRunBox;

    invoke-virtual {v0, v1}, Lcom/coremedia/iso/boxes/fragment/TrackFragmentBox;->getBoxes(Ljava/lang/Class;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/coremedia/iso/boxes/fragment/TrackRunBox;

    invoke-virtual {v0}, Lcom/coremedia/iso/boxes/fragment/TrackRunBox;->getSampleCount()J

    move-result-wide v0

    add-long/2addr v0, v6

    long-to-int v1, v0

    goto :goto_2

    .line 236
    :cond_4
    aget-object v1, v4, v3

    .line 237
    const-class v6, Lcom/coremedia/iso/boxes/fragment/MovieFragmentBox;

    invoke-virtual {v1, v6}, Lcom/coremedia/iso/IsoFile;->getBoxes(Ljava/lang/Class;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    move v1, v0

    :cond_5
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_6

    .line 236
    add-int/lit8 v0, v3, 0x1

    move v3, v0

    move v0, v1

    goto :goto_1

    .line 237
    :cond_6
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/coremedia/iso/boxes/fragment/MovieFragmentBox;

    .line 238
    const-class v7, Lcom/coremedia/iso/boxes/fragment/TrackFragmentBox;

    invoke-virtual {v0, v7}, Lcom/coremedia/iso/boxes/fragment/MovieFragmentBox;->getBoxes(Ljava/lang/Class;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_7
    :goto_3
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/coremedia/iso/boxes/fragment/TrackFragmentBox;

    .line 239
    invoke-virtual {v0}, Lcom/coremedia/iso/boxes/fragment/TrackFragmentBox;->getTrackFragmentHeaderBox()Lcom/coremedia/iso/boxes/fragment/TrackFragmentHeaderBox;

    move-result-object v8

    invoke-virtual {v8}, Lcom/coremedia/iso/boxes/fragment/TrackFragmentHeaderBox;->getTrackId()J

    move-result-wide v8

    iget-object v10, p0, Lcom/googlecode/mp4parser/authoring/samples/FragmentedMp4SampleList;->trackBox:Lcom/coremedia/iso/boxes/TrackBox;

    invoke-virtual {v10}, Lcom/coremedia/iso/boxes/TrackBox;->getTrackHeaderBox()Lcom/coremedia/iso/boxes/TrackHeaderBox;

    move-result-object v10

    invoke-virtual {v10}, Lcom/coremedia/iso/boxes/TrackHeaderBox;->getTrackId()J

    move-result-wide v10

    cmp-long v8, v8, v10

    if-nez v8, :cond_7

    .line 240
    int-to-long v8, v1

    const-class v1, Lcom/coremedia/iso/boxes/fragment/TrackRunBox;

    invoke-virtual {v0, v1}, Lcom/coremedia/iso/boxes/fragment/TrackFragmentBox;->getBoxes(Ljava/lang/Class;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/coremedia/iso/boxes/fragment/TrackRunBox;

    invoke-virtual {v0}, Lcom/coremedia/iso/boxes/fragment/TrackRunBox;->getSampleCount()J

    move-result-wide v0

    add-long/2addr v0, v8

    long-to-int v1, v0

    goto :goto_3
.end method
