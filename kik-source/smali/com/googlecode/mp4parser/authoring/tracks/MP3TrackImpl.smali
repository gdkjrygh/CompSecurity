.class public Lcom/googlecode/mp4parser/authoring/tracks/MP3TrackImpl;
.super Lcom/googlecode/mp4parser/authoring/AbstractTrack;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/googlecode/mp4parser/authoring/tracks/MP3TrackImpl$MP3Header;
    }
.end annotation


# static fields
.field private static final BIT_RATE:[I

.field private static final ES_OBJECT_TYPE_INDICATION:I = 0x6b

.field private static final ES_STREAM_TYPE:I = 0x5

.field private static final MPEG_L3:I = 0x1

.field private static final MPEG_V1:I = 0x3

.field private static final SAMPLES_PER_FRAME:I = 0x480

.field private static final SAMPLE_RATE:[I


# instance fields
.field avgBitRate:J

.field private final dataSource:Lcom/googlecode/mp4parser/DataSource;

.field private durations:[J

.field firstHeader:Lcom/googlecode/mp4parser/authoring/tracks/MP3TrackImpl$MP3Header;

.field maxBitRate:J

.field sampleDescriptionBox:Lcom/coremedia/iso/boxes/SampleDescriptionBox;

.field private samples:Ljava/util/List;

.field trackMetaData:Lcom/googlecode/mp4parser/authoring/TrackMetaData;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .prologue
    const v7, 0xbb80

    const/16 v6, 0x7d00

    const/4 v5, 0x4

    const/4 v4, 0x2

    const/4 v3, 0x1

    .line 33
    new-array v0, v5, [I

    const/4 v1, 0x0

    const v2, 0xac44

    aput v2, v0, v1

    aput v7, v0, v3

    aput v6, v0, v4

    sput-object v0, Lcom/googlecode/mp4parser/authoring/tracks/MP3TrackImpl;->SAMPLE_RATE:[I

    .line 34
    const/16 v0, 0x10

    new-array v0, v0, [I

    aput v6, v0, v3

    const v1, 0x9c40

    aput v1, v0, v4

    const/4 v1, 0x3

    aput v7, v0, v1

    const v1, 0xdac0

    aput v1, v0, v5

    const/4 v1, 0x5

    const v2, 0xfa00

    aput v2, v0, v1

    const/4 v1, 0x6

    const v2, 0x13880

    aput v2, v0, v1

    const/4 v1, 0x7

    const v2, 0x17700

    aput v2, v0, v1

    const/16 v1, 0x8

    const v2, 0x1b580

    aput v2, v0, v1

    const/16 v1, 0x9

    const v2, 0x1f400

    aput v2, v0, v1

    const/16 v1, 0xa

    const v2, 0x27100

    aput v2, v0, v1

    const/16 v1, 0xb

    const v2, 0x2ee00

    aput v2, v0, v1

    const/16 v1, 0xc

    const v2, 0x36b00

    aput v2, v0, v1

    const/16 v1, 0xd

    const v2, 0x3e800

    aput v2, v0, v1

    const/16 v1, 0xe

    const v2, 0x4e200

    aput v2, v0, v1

    sput-object v0, Lcom/googlecode/mp4parser/authoring/tracks/MP3TrackImpl;->BIT_RATE:[I

    .line 38
    return-void
.end method

.method public constructor <init>(Lcom/googlecode/mp4parser/DataSource;)V
    .locals 1

    .prologue
    .line 53
    const-string v0, "eng"

    invoke-direct {p0, p1, v0}, Lcom/googlecode/mp4parser/authoring/tracks/MP3TrackImpl;-><init>(Lcom/googlecode/mp4parser/DataSource;Ljava/lang/String;)V

    .line 54
    return-void
.end method

.method public constructor <init>(Lcom/googlecode/mp4parser/DataSource;Ljava/lang/String;)V
    .locals 12

    .prologue
    .line 61
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/googlecode/mp4parser/authoring/AbstractTrack;-><init>(Ljava/lang/String;)V

    .line 41
    new-instance v0, Lcom/googlecode/mp4parser/authoring/TrackMetaData;

    invoke-direct {v0}, Lcom/googlecode/mp4parser/authoring/TrackMetaData;-><init>()V

    iput-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/MP3TrackImpl;->trackMetaData:Lcom/googlecode/mp4parser/authoring/TrackMetaData;

    .line 62
    iput-object p1, p0, Lcom/googlecode/mp4parser/authoring/tracks/MP3TrackImpl;->dataSource:Lcom/googlecode/mp4parser/DataSource;

    .line 63
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/MP3TrackImpl;->samples:Ljava/util/List;

    .line 64
    invoke-direct {p0, p1}, Lcom/googlecode/mp4parser/authoring/tracks/MP3TrackImpl;->readSamples(Lcom/googlecode/mp4parser/DataSource;)Lcom/googlecode/mp4parser/authoring/tracks/MP3TrackImpl$MP3Header;

    move-result-object v0

    iput-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/MP3TrackImpl;->firstHeader:Lcom/googlecode/mp4parser/authoring/tracks/MP3TrackImpl$MP3Header;

    .line 66
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/MP3TrackImpl;->firstHeader:Lcom/googlecode/mp4parser/authoring/tracks/MP3TrackImpl$MP3Header;

    iget v0, v0, Lcom/googlecode/mp4parser/authoring/tracks/MP3TrackImpl$MP3Header;->sampleRate:I

    int-to-double v0, v0

    const-wide/high16 v2, 0x4092000000000000L    # 1152.0

    div-double v4, v0, v2

    .line 67
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/MP3TrackImpl;->samples:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    int-to-double v0, v0

    div-double v6, v0, v4

    .line 69
    const-wide/16 v0, 0x0

    .line 70
    new-instance v8, Ljava/util/LinkedList;

    invoke-direct {v8}, Ljava/util/LinkedList;-><init>()V

    .line 71
    iget-object v2, p0, Lcom/googlecode/mp4parser/authoring/tracks/MP3TrackImpl;->samples:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v9

    move-wide v2, v0

    :cond_0
    :goto_0
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_1

    .line 90
    const-wide/16 v0, 0x8

    mul-long/2addr v0, v2

    long-to-double v0, v0

    div-double/2addr v0, v6

    double-to-int v0, v0

    int-to-long v0, v0

    iput-wide v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/MP3TrackImpl;->avgBitRate:J

    .line 92
    new-instance v0, Lcom/coremedia/iso/boxes/SampleDescriptionBox;

    invoke-direct {v0}, Lcom/coremedia/iso/boxes/SampleDescriptionBox;-><init>()V

    iput-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/MP3TrackImpl;->sampleDescriptionBox:Lcom/coremedia/iso/boxes/SampleDescriptionBox;

    .line 93
    new-instance v0, Lcom/coremedia/iso/boxes/sampleentry/AudioSampleEntry;

    const-string v1, "mp4a"

    invoke-direct {v0, v1}, Lcom/coremedia/iso/boxes/sampleentry/AudioSampleEntry;-><init>(Ljava/lang/String;)V

    .line 94
    iget-object v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/MP3TrackImpl;->firstHeader:Lcom/googlecode/mp4parser/authoring/tracks/MP3TrackImpl$MP3Header;

    iget v1, v1, Lcom/googlecode/mp4parser/authoring/tracks/MP3TrackImpl$MP3Header;->channelCount:I

    invoke-virtual {v0, v1}, Lcom/coremedia/iso/boxes/sampleentry/AudioSampleEntry;->setChannelCount(I)V

    .line 95
    iget-object v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/MP3TrackImpl;->firstHeader:Lcom/googlecode/mp4parser/authoring/tracks/MP3TrackImpl$MP3Header;

    iget v1, v1, Lcom/googlecode/mp4parser/authoring/tracks/MP3TrackImpl$MP3Header;->sampleRate:I

    int-to-long v2, v1

    invoke-virtual {v0, v2, v3}, Lcom/coremedia/iso/boxes/sampleentry/AudioSampleEntry;->setSampleRate(J)V

    .line 96
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/coremedia/iso/boxes/sampleentry/AudioSampleEntry;->setDataReferenceIndex(I)V

    .line 97
    const/16 v1, 0x10

    invoke-virtual {v0, v1}, Lcom/coremedia/iso/boxes/sampleentry/AudioSampleEntry;->setSampleSize(I)V

    .line 100
    new-instance v1, Lcom/googlecode/mp4parser/boxes/mp4/ESDescriptorBox;

    invoke-direct {v1}, Lcom/googlecode/mp4parser/boxes/mp4/ESDescriptorBox;-><init>()V

    .line 101
    new-instance v2, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/ESDescriptor;

    invoke-direct {v2}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/ESDescriptor;-><init>()V

    .line 102
    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/ESDescriptor;->setEsId(I)V

    .line 104
    new-instance v3, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/SLConfigDescriptor;

    invoke-direct {v3}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/SLConfigDescriptor;-><init>()V

    .line 105
    const/4 v4, 0x2

    invoke-virtual {v3, v4}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/SLConfigDescriptor;->setPredefined(I)V

    .line 106
    invoke-virtual {v2, v3}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/ESDescriptor;->setSlConfigDescriptor(Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/SLConfigDescriptor;)V

    .line 108
    new-instance v3, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/DecoderConfigDescriptor;

    invoke-direct {v3}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/DecoderConfigDescriptor;-><init>()V

    .line 109
    const/16 v4, 0x6b

    invoke-virtual {v3, v4}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/DecoderConfigDescriptor;->setObjectTypeIndication(I)V

    .line 110
    const/4 v4, 0x5

    invoke-virtual {v3, v4}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/DecoderConfigDescriptor;->setStreamType(I)V

    .line 111
    iget-wide v4, p0, Lcom/googlecode/mp4parser/authoring/tracks/MP3TrackImpl;->maxBitRate:J

    invoke-virtual {v3, v4, v5}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/DecoderConfigDescriptor;->setMaxBitRate(J)V

    .line 112
    iget-wide v4, p0, Lcom/googlecode/mp4parser/authoring/tracks/MP3TrackImpl;->avgBitRate:J

    invoke-virtual {v3, v4, v5}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/DecoderConfigDescriptor;->setAvgBitRate(J)V

    .line 113
    invoke-virtual {v2, v3}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/ESDescriptor;->setDecoderConfigDescriptor(Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/DecoderConfigDescriptor;)V

    .line 115
    invoke-virtual {v2}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/ESDescriptor;->serialize()Ljava/nio/ByteBuffer;

    move-result-object v2

    .line 116
    invoke-virtual {v1, v2}, Lcom/googlecode/mp4parser/boxes/mp4/ESDescriptorBox;->setData(Ljava/nio/ByteBuffer;)V

    .line 117
    invoke-virtual {v0, v1}, Lcom/coremedia/iso/boxes/sampleentry/AudioSampleEntry;->addBox(Lcom/coremedia/iso/boxes/Box;)V

    .line 118
    iget-object v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/MP3TrackImpl;->sampleDescriptionBox:Lcom/coremedia/iso/boxes/SampleDescriptionBox;

    invoke-virtual {v1, v0}, Lcom/coremedia/iso/boxes/SampleDescriptionBox;->addBox(Lcom/coremedia/iso/boxes/Box;)V

    .line 120
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/MP3TrackImpl;->trackMetaData:Lcom/googlecode/mp4parser/authoring/TrackMetaData;

    new-instance v1, Ljava/util/Date;

    invoke-direct {v1}, Ljava/util/Date;-><init>()V

    invoke-virtual {v0, v1}, Lcom/googlecode/mp4parser/authoring/TrackMetaData;->setCreationTime(Ljava/util/Date;)V

    .line 121
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/MP3TrackImpl;->trackMetaData:Lcom/googlecode/mp4parser/authoring/TrackMetaData;

    new-instance v1, Ljava/util/Date;

    invoke-direct {v1}, Ljava/util/Date;-><init>()V

    invoke-virtual {v0, v1}, Lcom/googlecode/mp4parser/authoring/TrackMetaData;->setModificationTime(Ljava/util/Date;)V

    .line 122
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/MP3TrackImpl;->trackMetaData:Lcom/googlecode/mp4parser/authoring/TrackMetaData;

    invoke-virtual {v0, p2}, Lcom/googlecode/mp4parser/authoring/TrackMetaData;->setLanguage(Ljava/lang/String;)V

    .line 123
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/MP3TrackImpl;->trackMetaData:Lcom/googlecode/mp4parser/authoring/TrackMetaData;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Lcom/googlecode/mp4parser/authoring/TrackMetaData;->setVolume(F)V

    .line 124
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/MP3TrackImpl;->trackMetaData:Lcom/googlecode/mp4parser/authoring/TrackMetaData;

    iget-object v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/MP3TrackImpl;->firstHeader:Lcom/googlecode/mp4parser/authoring/tracks/MP3TrackImpl$MP3Header;

    iget v1, v1, Lcom/googlecode/mp4parser/authoring/tracks/MP3TrackImpl$MP3Header;->sampleRate:I

    int-to-long v2, v1

    invoke-virtual {v0, v2, v3}, Lcom/googlecode/mp4parser/authoring/TrackMetaData;->setTimescale(J)V

    .line 125
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/MP3TrackImpl;->samples:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    new-array v0, v0, [J

    iput-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/MP3TrackImpl;->durations:[J

    .line 126
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/MP3TrackImpl;->durations:[J

    const-wide/16 v2, 0x480

    invoke-static {v0, v2, v3}, Ljava/util/Arrays;->fill([JJ)V

    .line 127
    return-void

    .line 71
    :cond_1
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/googlecode/mp4parser/authoring/Sample;

    .line 72
    invoke-interface {v0}, Lcom/googlecode/mp4parser/authoring/Sample;->getSize()J

    move-result-wide v0

    long-to-int v0, v0

    .line 73
    int-to-long v10, v0

    add-long/2addr v2, v10

    .line 74
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v8, v0}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 75
    :goto_1
    invoke-virtual {v8}, Ljava/util/LinkedList;->size()I

    move-result v0

    int-to-double v0, v0

    cmpl-double v0, v0, v4

    if-gtz v0, :cond_2

    .line 78
    invoke-virtual {v8}, Ljava/util/LinkedList;->size()I

    move-result v0

    double-to-int v1, v4

    if-ne v0, v1, :cond_0

    .line 79
    const/4 v0, 0x0

    .line 80
    invoke-virtual {v8}, Ljava/util/LinkedList;->iterator()Ljava/util/Iterator;

    move-result-object v10

    move v1, v0

    :goto_2
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_3

    .line 83
    const-wide/high16 v10, 0x4020000000000000L    # 8.0

    int-to-double v0, v1

    mul-double/2addr v0, v10

    invoke-virtual {v8}, Ljava/util/LinkedList;->size()I

    move-result v10

    int-to-double v10, v10

    div-double/2addr v0, v10

    mul-double/2addr v0, v4

    .line 84
    iget-wide v10, p0, Lcom/googlecode/mp4parser/authoring/tracks/MP3TrackImpl;->maxBitRate:J

    long-to-double v10, v10

    cmpl-double v10, v0, v10

    if-lez v10, :cond_0

    .line 85
    double-to-int v0, v0

    int-to-long v0, v0

    iput-wide v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/MP3TrackImpl;->maxBitRate:J

    goto/16 :goto_0

    .line 76
    :cond_2
    invoke-virtual {v8}, Ljava/util/LinkedList;->pop()Ljava/lang/Object;

    goto :goto_1

    .line 80
    :cond_3
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    .line 81
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    add-int/2addr v0, v1

    move v1, v0

    goto :goto_2
.end method

.method private readMP3Header(Lcom/googlecode/mp4parser/DataSource;)Lcom/googlecode/mp4parser/authoring/tracks/MP3TrackImpl$MP3Header;
    .locals 8

    .prologue
    const/4 v7, 0x3

    const/4 v6, 0x4

    const/4 v2, 0x2

    const/4 v1, 0x1

    .line 189
    new-instance v3, Lcom/googlecode/mp4parser/authoring/tracks/MP3TrackImpl$MP3Header;

    invoke-direct {v3, p0}, Lcom/googlecode/mp4parser/authoring/tracks/MP3TrackImpl$MP3Header;-><init>(Lcom/googlecode/mp4parser/authoring/tracks/MP3TrackImpl;)V

    .line 190
    invoke-static {v6}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    .line 191
    :cond_0
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->position()I

    move-result v4

    if-lt v4, v6, :cond_1

    .line 197
    new-instance v4, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/BitReaderBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    move-result-object v0

    check-cast v0, Ljava/nio/ByteBuffer;

    invoke-direct {v4, v0}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/BitReaderBuffer;-><init>(Ljava/nio/ByteBuffer;)V

    .line 198
    const/16 v0, 0xb

    invoke-virtual {v4, v0}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/BitReaderBuffer;->readBits(I)I

    move-result v0

    .line 199
    const/16 v5, 0x7ff

    if-eq v0, v5, :cond_2

    .line 200
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Expected Start Word 0x7ff"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 192
    :cond_1
    invoke-interface {p1, v0}, Lcom/googlecode/mp4parser/DataSource;->read(Ljava/nio/ByteBuffer;)I

    move-result v4

    const/4 v5, -0x1

    if-ne v4, v5, :cond_0

    .line 193
    const/4 v0, 0x0

    .line 228
    :goto_0
    return-object v0

    .line 201
    :cond_2
    invoke-virtual {v4, v2}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/BitReaderBuffer;->readBits(I)I

    move-result v0

    iput v0, v3, Lcom/googlecode/mp4parser/authoring/tracks/MP3TrackImpl$MP3Header;->mpegVersion:I

    .line 203
    iget v0, v3, Lcom/googlecode/mp4parser/authoring/tracks/MP3TrackImpl$MP3Header;->mpegVersion:I

    if-eq v0, v7, :cond_3

    .line 204
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Expected MPEG Version 1 (ISO/IEC 11172-3)"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 206
    :cond_3
    invoke-virtual {v4, v2}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/BitReaderBuffer;->readBits(I)I

    move-result v0

    iput v0, v3, Lcom/googlecode/mp4parser/authoring/tracks/MP3TrackImpl$MP3Header;->layer:I

    .line 208
    iget v0, v3, Lcom/googlecode/mp4parser/authoring/tracks/MP3TrackImpl$MP3Header;->layer:I

    if-eq v0, v1, :cond_4

    .line 209
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Expected Layer III"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 211
    :cond_4
    invoke-virtual {v4, v1}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/BitReaderBuffer;->readBits(I)I

    move-result v0

    iput v0, v3, Lcom/googlecode/mp4parser/authoring/tracks/MP3TrackImpl$MP3Header;->protectionAbsent:I

    .line 213
    invoke-virtual {v4, v6}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/BitReaderBuffer;->readBits(I)I

    move-result v0

    iput v0, v3, Lcom/googlecode/mp4parser/authoring/tracks/MP3TrackImpl$MP3Header;->bitRateIndex:I

    .line 214
    sget-object v0, Lcom/googlecode/mp4parser/authoring/tracks/MP3TrackImpl;->BIT_RATE:[I

    iget v5, v3, Lcom/googlecode/mp4parser/authoring/tracks/MP3TrackImpl$MP3Header;->bitRateIndex:I

    aget v0, v0, v5

    iput v0, v3, Lcom/googlecode/mp4parser/authoring/tracks/MP3TrackImpl$MP3Header;->bitRate:I

    .line 215
    iget v0, v3, Lcom/googlecode/mp4parser/authoring/tracks/MP3TrackImpl$MP3Header;->bitRate:I

    if-nez v0, :cond_5

    .line 216
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Unexpected (free/bad) bit rate"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 218
    :cond_5
    invoke-virtual {v4, v2}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/BitReaderBuffer;->readBits(I)I

    move-result v0

    iput v0, v3, Lcom/googlecode/mp4parser/authoring/tracks/MP3TrackImpl$MP3Header;->sampleFrequencyIndex:I

    .line 219
    sget-object v0, Lcom/googlecode/mp4parser/authoring/tracks/MP3TrackImpl;->SAMPLE_RATE:[I

    iget v5, v3, Lcom/googlecode/mp4parser/authoring/tracks/MP3TrackImpl$MP3Header;->sampleFrequencyIndex:I

    aget v0, v0, v5

    iput v0, v3, Lcom/googlecode/mp4parser/authoring/tracks/MP3TrackImpl$MP3Header;->sampleRate:I

    .line 220
    iget v0, v3, Lcom/googlecode/mp4parser/authoring/tracks/MP3TrackImpl$MP3Header;->sampleRate:I

    if-nez v0, :cond_6

    .line 221
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Unexpected (reserved) sample rate frequency"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 223
    :cond_6
    invoke-virtual {v4, v1}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/BitReaderBuffer;->readBits(I)I

    move-result v0

    iput v0, v3, Lcom/googlecode/mp4parser/authoring/tracks/MP3TrackImpl$MP3Header;->padding:I

    .line 224
    invoke-virtual {v4, v1}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/BitReaderBuffer;->readBits(I)I

    .line 226
    invoke-virtual {v4, v2}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/BitReaderBuffer;->readBits(I)I

    move-result v0

    iput v0, v3, Lcom/googlecode/mp4parser/authoring/tracks/MP3TrackImpl$MP3Header;->channelMode:I

    .line 227
    iget v0, v3, Lcom/googlecode/mp4parser/authoring/tracks/MP3TrackImpl$MP3Header;->channelMode:I

    if-ne v0, v7, :cond_7

    move v0, v1

    :goto_1
    iput v0, v3, Lcom/googlecode/mp4parser/authoring/tracks/MP3TrackImpl$MP3Header;->channelCount:I

    move-object v0, v3

    .line 228
    goto :goto_0

    :cond_7
    move v0, v2

    .line 227
    goto :goto_1
.end method

.method private readSamples(Lcom/googlecode/mp4parser/DataSource;)Lcom/googlecode/mp4parser/authoring/tracks/MP3TrackImpl$MP3Header;
    .locals 4

    .prologue
    .line 171
    const/4 v0, 0x0

    .line 173
    :goto_0
    invoke-interface {p1}, Lcom/googlecode/mp4parser/DataSource;->position()J

    move-result-wide v2

    .line 175
    invoke-direct {p0, p1}, Lcom/googlecode/mp4parser/authoring/tracks/MP3TrackImpl;->readMP3Header(Lcom/googlecode/mp4parser/DataSource;)Lcom/googlecode/mp4parser/authoring/tracks/MP3TrackImpl$MP3Header;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 176
    if-nez v0, :cond_0

    move-object v0, v1

    .line 179
    :cond_0
    invoke-interface {p1, v2, v3}, Lcom/googlecode/mp4parser/DataSource;->position(J)V

    .line 180
    invoke-virtual {v1}, Lcom/googlecode/mp4parser/authoring/tracks/MP3TrackImpl$MP3Header;->getFrameLength()I

    move-result v1

    invoke-static {v1}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v1

    .line 181
    invoke-interface {p1, v1}, Lcom/googlecode/mp4parser/DataSource;->read(Ljava/nio/ByteBuffer;)I

    .line 182
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    .line 183
    iget-object v2, p0, Lcom/googlecode/mp4parser/authoring/tracks/MP3TrackImpl;->samples:Ljava/util/List;

    new-instance v3, Lcom/googlecode/mp4parser/authoring/SampleImpl;

    invoke-direct {v3, v1}, Lcom/googlecode/mp4parser/authoring/SampleImpl;-><init>(Ljava/nio/ByteBuffer;)V

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 185
    :cond_1
    return-object v0
.end method


# virtual methods
.method public close()V
    .locals 1

    .prologue
    .line 57
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/MP3TrackImpl;->dataSource:Lcom/googlecode/mp4parser/DataSource;

    invoke-interface {v0}, Lcom/googlecode/mp4parser/DataSource;->close()V

    .line 58
    return-void
.end method

.method public getHandler()Ljava/lang/String;
    .locals 1

    .prologue
    .line 142
    const-string v0, "soun"

    return-object v0
.end method

.method public getSampleDescriptionBox()Lcom/coremedia/iso/boxes/SampleDescriptionBox;
    .locals 1

    .prologue
    .line 130
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/MP3TrackImpl;->sampleDescriptionBox:Lcom/coremedia/iso/boxes/SampleDescriptionBox;

    return-object v0
.end method

.method public getSampleDurations()[J
    .locals 1

    .prologue
    .line 134
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/MP3TrackImpl;->durations:[J

    return-object v0
.end method

.method public getSamples()Ljava/util/List;
    .locals 1

    .prologue
    .line 146
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/MP3TrackImpl;->samples:Ljava/util/List;

    return-object v0
.end method

.method public getTrackMetaData()Lcom/googlecode/mp4parser/authoring/TrackMetaData;
    .locals 1

    .prologue
    .line 138
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/MP3TrackImpl;->trackMetaData:Lcom/googlecode/mp4parser/authoring/TrackMetaData;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 233
    const-string v0, "MP3TrackImpl"

    return-object v0
.end method
