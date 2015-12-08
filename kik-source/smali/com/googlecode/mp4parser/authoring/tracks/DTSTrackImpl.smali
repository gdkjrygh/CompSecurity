.class public Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;
.super Lcom/googlecode/mp4parser/authoring/AbstractTrack;
.source "SourceFile"


# instance fields
.field bcCoreBitRate:I

.field bcCoreChannelMask:I

.field bcCoreMaxSampleRate:I

.field bitrate:I

.field channelCount:I

.field channelMask:I

.field codecDelayAtMaxFs:I

.field coreBitRate:I

.field coreChannelMask:I

.field coreFramePayloadInBytes:I

.field coreMaxSampleRate:I

.field coreSubStreamPresent:Z

.field private dataOffset:I

.field private dataSource:Lcom/googlecode/mp4parser/DataSource;

.field ddts:Lcom/googlecode/mp4parser/boxes/DTSSpecificBox;

.field extAvgBitrate:I

.field extFramePayloadInBytes:I

.field extPeakBitrate:I

.field extSmoothBuffSize:I

.field extensionSubStreamPresent:Z

.field frameSize:I

.field isVBR:Z

.field private lang:Ljava/lang/String;

.field lbrCodingPresent:I

.field lsbTrimPercent:I

.field maxSampleRate:I

.field numExtSubStreams:I

.field numFramesTotal:I

.field numSamplesOrigAudioAtMaxFs:I

.field sampleDescriptionBox:Lcom/coremedia/iso/boxes/SampleDescriptionBox;

.field private sampleDurations:[J

.field sampleSize:I

.field samplerate:I

.field private samples:Ljava/util/List;

.field samplesPerFrame:I

.field samplesPerFrameAtMaxFs:I

.field trackMetaData:Lcom/googlecode/mp4parser/authoring/TrackMetaData;

.field type:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/googlecode/mp4parser/DataSource;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 75
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/googlecode/mp4parser/authoring/AbstractTrack;-><init>(Ljava/lang/String;)V

    .line 22
    new-instance v0, Lcom/googlecode/mp4parser/authoring/TrackMetaData;

    invoke-direct {v0}, Lcom/googlecode/mp4parser/authoring/TrackMetaData;-><init>()V

    iput-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->trackMetaData:Lcom/googlecode/mp4parser/authoring/TrackMetaData;

    .line 27
    iput v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->frameSize:I

    .line 32
    iput v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->dataOffset:I

    .line 33
    new-instance v0, Lcom/googlecode/mp4parser/boxes/DTSSpecificBox;

    invoke-direct {v0}, Lcom/googlecode/mp4parser/boxes/DTSSpecificBox;-><init>()V

    iput-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->ddts:Lcom/googlecode/mp4parser/boxes/DTSSpecificBox;

    .line 39
    iput-boolean v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->isVBR:Z

    .line 40
    iput-boolean v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->coreSubStreamPresent:Z

    .line 41
    iput-boolean v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->extensionSubStreamPresent:Z

    .line 42
    iput v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->numExtSubStreams:I

    .line 43
    iput v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->coreMaxSampleRate:I

    .line 44
    iput v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->coreBitRate:I

    .line 45
    iput v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->coreChannelMask:I

    .line 46
    iput v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->coreFramePayloadInBytes:I

    .line 47
    iput v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->extAvgBitrate:I

    .line 48
    iput v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->extPeakBitrate:I

    .line 49
    iput v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->extSmoothBuffSize:I

    .line 50
    iput v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->extFramePayloadInBytes:I

    .line 52
    iput v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->maxSampleRate:I

    .line 53
    iput v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->lbrCodingPresent:I

    .line 54
    iput v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->numFramesTotal:I

    .line 55
    iput v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->samplesPerFrameAtMaxFs:I

    .line 56
    iput v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->numSamplesOrigAudioAtMaxFs:I

    .line 57
    iput v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->channelMask:I

    .line 58
    iput v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->codecDelayAtMaxFs:I

    .line 59
    iput v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->bcCoreMaxSampleRate:I

    .line 60
    iput v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->bcCoreBitRate:I

    .line 61
    iput v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->bcCoreChannelMask:I

    .line 62
    iput v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->lsbTrimPercent:I

    .line 64
    const-string v0, "none"

    iput-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->type:Ljava/lang/String;

    .line 65
    const-string v0, "eng"

    iput-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->lang:Ljava/lang/String;

    .line 76
    iput-object p1, p0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->dataSource:Lcom/googlecode/mp4parser/DataSource;

    .line 77
    invoke-direct {p0}, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->parse()V

    .line 78
    return-void
.end method

.method public constructor <init>(Lcom/googlecode/mp4parser/DataSource;Ljava/lang/String;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 68
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/googlecode/mp4parser/authoring/AbstractTrack;-><init>(Ljava/lang/String;)V

    .line 22
    new-instance v0, Lcom/googlecode/mp4parser/authoring/TrackMetaData;

    invoke-direct {v0}, Lcom/googlecode/mp4parser/authoring/TrackMetaData;-><init>()V

    iput-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->trackMetaData:Lcom/googlecode/mp4parser/authoring/TrackMetaData;

    .line 27
    iput v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->frameSize:I

    .line 32
    iput v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->dataOffset:I

    .line 33
    new-instance v0, Lcom/googlecode/mp4parser/boxes/DTSSpecificBox;

    invoke-direct {v0}, Lcom/googlecode/mp4parser/boxes/DTSSpecificBox;-><init>()V

    iput-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->ddts:Lcom/googlecode/mp4parser/boxes/DTSSpecificBox;

    .line 39
    iput-boolean v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->isVBR:Z

    .line 40
    iput-boolean v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->coreSubStreamPresent:Z

    .line 41
    iput-boolean v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->extensionSubStreamPresent:Z

    .line 42
    iput v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->numExtSubStreams:I

    .line 43
    iput v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->coreMaxSampleRate:I

    .line 44
    iput v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->coreBitRate:I

    .line 45
    iput v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->coreChannelMask:I

    .line 46
    iput v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->coreFramePayloadInBytes:I

    .line 47
    iput v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->extAvgBitrate:I

    .line 48
    iput v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->extPeakBitrate:I

    .line 49
    iput v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->extSmoothBuffSize:I

    .line 50
    iput v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->extFramePayloadInBytes:I

    .line 52
    iput v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->maxSampleRate:I

    .line 53
    iput v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->lbrCodingPresent:I

    .line 54
    iput v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->numFramesTotal:I

    .line 55
    iput v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->samplesPerFrameAtMaxFs:I

    .line 56
    iput v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->numSamplesOrigAudioAtMaxFs:I

    .line 57
    iput v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->channelMask:I

    .line 58
    iput v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->codecDelayAtMaxFs:I

    .line 59
    iput v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->bcCoreMaxSampleRate:I

    .line 60
    iput v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->bcCoreBitRate:I

    .line 61
    iput v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->bcCoreChannelMask:I

    .line 62
    iput v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->lsbTrimPercent:I

    .line 64
    const-string v0, "none"

    iput-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->type:Ljava/lang/String;

    .line 65
    const-string v0, "eng"

    iput-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->lang:Ljava/lang/String;

    .line 69
    iput-object p2, p0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->lang:Ljava/lang/String;

    .line 70
    iput-object p1, p0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->dataSource:Lcom/googlecode/mp4parser/DataSource;

    .line 71
    invoke-direct {p0}, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->parse()V

    .line 72
    return-void
.end method

.method static synthetic access$0(Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;)Lcom/googlecode/mp4parser/DataSource;
    .locals 1

    .prologue
    .line 35
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->dataSource:Lcom/googlecode/mp4parser/DataSource;

    return-object v0
.end method

.method private parse()V
    .locals 4

    .prologue
    .line 85
    invoke-direct {p0}, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->readVariables()Z

    move-result v0

    if-nez v0, :cond_0

    .line 86
    new-instance v0, Ljava/io/IOException;

    invoke-direct {v0}, Ljava/io/IOException;-><init>()V

    throw v0

    .line 89
    :cond_0
    new-instance v0, Lcom/coremedia/iso/boxes/SampleDescriptionBox;

    invoke-direct {v0}, Lcom/coremedia/iso/boxes/SampleDescriptionBox;-><init>()V

    iput-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->sampleDescriptionBox:Lcom/coremedia/iso/boxes/SampleDescriptionBox;

    .line 90
    new-instance v0, Lcom/coremedia/iso/boxes/sampleentry/AudioSampleEntry;

    iget-object v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->type:Ljava/lang/String;

    invoke-direct {v0, v1}, Lcom/coremedia/iso/boxes/sampleentry/AudioSampleEntry;-><init>(Ljava/lang/String;)V

    .line 91
    iget v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->channelCount:I

    invoke-virtual {v0, v1}, Lcom/coremedia/iso/boxes/sampleentry/AudioSampleEntry;->setChannelCount(I)V

    .line 92
    iget v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->samplerate:I

    int-to-long v2, v1

    invoke-virtual {v0, v2, v3}, Lcom/coremedia/iso/boxes/sampleentry/AudioSampleEntry;->setSampleRate(J)V

    .line 93
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/coremedia/iso/boxes/sampleentry/AudioSampleEntry;->setDataReferenceIndex(I)V

    .line 94
    const/16 v1, 0x10

    invoke-virtual {v0, v1}, Lcom/coremedia/iso/boxes/sampleentry/AudioSampleEntry;->setSampleSize(I)V

    .line 97
    iget-object v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->ddts:Lcom/googlecode/mp4parser/boxes/DTSSpecificBox;

    invoke-virtual {v0, v1}, Lcom/coremedia/iso/boxes/sampleentry/AudioSampleEntry;->addBox(Lcom/coremedia/iso/boxes/Box;)V

    .line 98
    iget-object v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->sampleDescriptionBox:Lcom/coremedia/iso/boxes/SampleDescriptionBox;

    invoke-virtual {v1, v0}, Lcom/coremedia/iso/boxes/SampleDescriptionBox;->addBox(Lcom/coremedia/iso/boxes/Box;)V

    .line 100
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->trackMetaData:Lcom/googlecode/mp4parser/authoring/TrackMetaData;

    new-instance v1, Ljava/util/Date;

    invoke-direct {v1}, Ljava/util/Date;-><init>()V

    invoke-virtual {v0, v1}, Lcom/googlecode/mp4parser/authoring/TrackMetaData;->setCreationTime(Ljava/util/Date;)V

    .line 101
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->trackMetaData:Lcom/googlecode/mp4parser/authoring/TrackMetaData;

    new-instance v1, Ljava/util/Date;

    invoke-direct {v1}, Ljava/util/Date;-><init>()V

    invoke-virtual {v0, v1}, Lcom/googlecode/mp4parser/authoring/TrackMetaData;->setModificationTime(Ljava/util/Date;)V

    .line 102
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->trackMetaData:Lcom/googlecode/mp4parser/authoring/TrackMetaData;

    iget-object v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->lang:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/googlecode/mp4parser/authoring/TrackMetaData;->setLanguage(Ljava/lang/String;)V

    .line 103
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->trackMetaData:Lcom/googlecode/mp4parser/authoring/TrackMetaData;

    iget v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->samplerate:I

    int-to-long v2, v1

    invoke-virtual {v0, v2, v3}, Lcom/googlecode/mp4parser/authoring/TrackMetaData;->setTimescale(J)V

    .line 105
    invoke-direct {p0}, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->readSamples()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->samples:Ljava/util/List;

    .line 106
    return-void
.end method

.method private parseAuprhdr(ILjava/nio/ByteBuffer;)Z
    .locals 6

    .prologue
    const/4 v5, 0x1

    const v4, 0xffff

    .line 187
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->get()B

    .line 188
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->getShort()S

    move-result v1

    .line 189
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v0

    .line 190
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->getShort()S

    move-result v2

    .line 191
    shl-int/lit8 v0, v0, 0x10

    and-int/2addr v2, v4

    or-int/2addr v0, v2

    iput v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->maxSampleRate:I

    .line 192
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v0

    iput v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->numFramesTotal:I

    .line 193
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->getShort()S

    move-result v0

    iput v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->samplesPerFrameAtMaxFs:I

    .line 194
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v0

    .line 195
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v2

    .line 196
    shl-int/lit8 v0, v0, 0x20

    and-int/2addr v2, v4

    or-int/2addr v0, v2

    iput v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->numSamplesOrigAudioAtMaxFs:I

    .line 197
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->getShort()S

    move-result v0

    iput v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->channelMask:I

    .line 198
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->getShort()S

    move-result v0

    iput v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->codecDelayAtMaxFs:I

    .line 199
    const/16 v0, 0x15

    .line 200
    and-int/lit8 v2, v1, 0x3

    const/4 v3, 0x3

    if-ne v2, v3, :cond_0

    .line 201
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v0

    .line 202
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->getShort()S

    move-result v2

    .line 203
    shl-int/lit8 v0, v0, 0x10

    and-int/2addr v2, v4

    or-int/2addr v0, v2

    iput v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->bcCoreMaxSampleRate:I

    .line 204
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->getShort()S

    move-result v0

    iput v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->bcCoreBitRate:I

    .line 205
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->getShort()S

    move-result v0

    iput v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->bcCoreChannelMask:I

    .line 206
    const/16 v0, 0x1c

    .line 208
    :cond_0
    and-int/lit8 v2, v1, 0x4

    if-lez v2, :cond_1

    .line 209
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v2

    iput v2, p0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->lsbTrimPercent:I

    .line 210
    add-int/lit8 v0, v0, 0x1

    .line 212
    :cond_1
    and-int/lit8 v1, v1, 0x8

    if-lez v1, :cond_2

    .line 213
    iput v5, p0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->lbrCodingPresent:I

    .line 215
    :cond_2
    :goto_0
    if-lt v0, p1, :cond_3

    .line 220
    return v5

    .line 216
    :cond_3
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->get()B

    .line 217
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method private parseCoressmd(ILjava/nio/ByteBuffer;)Z
    .locals 3

    .prologue
    .line 172
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v0

    .line 173
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->getShort()S

    move-result v1

    .line 174
    shl-int/lit8 v0, v0, 0x10

    const v2, 0xffff

    and-int/2addr v1, v2

    or-int/2addr v0, v1

    iput v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->coreMaxSampleRate:I

    .line 175
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->getShort()S

    move-result v0

    iput v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->coreBitRate:I

    .line 176
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->getShort()S

    move-result v0

    iput v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->coreChannelMask:I

    .line 177
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v0

    iput v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->coreFramePayloadInBytes:I

    .line 178
    const/16 v0, 0xb

    .line 179
    :goto_0
    if-lt v0, p1, :cond_0

    .line 183
    const/4 v0, 0x1

    return v0

    .line 180
    :cond_0
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->get()B

    .line 181
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method private parseDtshdhdr(ILjava/nio/ByteBuffer;)Z
    .locals 4

    .prologue
    const/4 v3, 0x1

    .line 143
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->getInt()I

    .line 144
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->get()B

    .line 145
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->getInt()I

    .line 146
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->get()B

    .line 147
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->getShort()S

    move-result v0

    .line 148
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->get()B

    .line 149
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v1

    iput v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->numExtSubStreams:I

    .line 151
    and-int/lit8 v1, v0, 0x1

    if-ne v1, v3, :cond_0

    .line 152
    iput-boolean v3, p0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->isVBR:Z

    .line 154
    :cond_0
    and-int/lit8 v1, v0, 0x8

    const/16 v2, 0x8

    if-ne v1, v2, :cond_1

    .line 155
    iput-boolean v3, p0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->coreSubStreamPresent:Z

    .line 157
    :cond_1
    and-int/lit8 v0, v0, 0x10

    const/16 v1, 0x10

    if-ne v0, v1, :cond_2

    .line 158
    iput-boolean v3, p0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->extensionSubStreamPresent:Z

    .line 159
    iget v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->numExtSubStreams:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->numExtSubStreams:I

    .line 163
    :goto_0
    const/16 v0, 0xe

    .line 164
    :goto_1
    if-lt v0, p1, :cond_3

    .line 168
    return v3

    .line 161
    :cond_2
    const/4 v0, 0x0

    iput v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->numExtSubStreams:I

    goto :goto_0

    .line 165
    :cond_3
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->get()B

    .line 166
    add-int/lit8 v0, v0, 0x1

    goto :goto_1
.end method

.method private parseExtssmd(ILjava/nio/ByteBuffer;)Z
    .locals 3

    .prologue
    const v2, 0xffff

    .line 224
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v0

    .line 225
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->getShort()S

    move-result v1

    .line 226
    shl-int/lit8 v0, v0, 0x10

    and-int/2addr v1, v2

    or-int/2addr v0, v1

    iput v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->extAvgBitrate:I

    .line 228
    iget-boolean v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->isVBR:Z

    if-eqz v0, :cond_0

    .line 229
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v0

    .line 230
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->getShort()S

    move-result v1

    .line 231
    shl-int/lit8 v0, v0, 0x10

    and-int/2addr v1, v2

    or-int/2addr v0, v1

    iput v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->extPeakBitrate:I

    .line 232
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->getShort()S

    move-result v0

    iput v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->extSmoothBuffSize:I

    .line 233
    const/16 v0, 0x8

    .line 238
    :goto_0
    if-lt v0, p1, :cond_1

    .line 242
    const/4 v0, 0x1

    return v0

    .line 235
    :cond_0
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v0

    iput v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->extFramePayloadInBytes:I

    .line 236
    const/4 v0, 0x7

    .line 238
    goto :goto_0

    .line 239
    :cond_1
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->get()B

    .line 240
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method private readSamples()Ljava/util/List;
    .locals 6

    .prologue
    .line 797
    new-instance v1, Ljava/util/ArrayList;

    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->dataSource:Lcom/googlecode/mp4parser/DataSource;

    invoke-interface {v0}, Lcom/googlecode/mp4parser/DataSource;->size()J

    move-result-wide v2

    iget v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->frameSize:I

    int-to-long v4, v0

    div-long/2addr v2, v4

    invoke-static {v2, v3}, Lcom/googlecode/mp4parser/util/CastUtils;->l2i(J)I

    move-result v0

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 798
    iget v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->dataOffset:I

    .line 799
    :goto_0
    iget v2, p0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->frameSize:I

    add-int/2addr v2, v0

    int-to-long v2, v2

    iget-object v4, p0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->dataSource:Lcom/googlecode/mp4parser/DataSource;

    invoke-interface {v4}, Lcom/googlecode/mp4parser/DataSource;->size()J

    move-result-wide v4

    cmp-long v2, v2, v4

    if-ltz v2, :cond_0

    .line 822
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v0

    new-array v0, v0, [J

    iput-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->sampleDurations:[J

    .line 823
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->sampleDurations:[J

    iget v2, p0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->samplesPerFrame:I

    iget v3, p0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->samplerate:I

    mul-int/2addr v2, v3

    int-to-long v2, v2

    iget-object v4, p0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->trackMetaData:Lcom/googlecode/mp4parser/authoring/TrackMetaData;

    invoke-virtual {v4}, Lcom/googlecode/mp4parser/authoring/TrackMetaData;->getTimescale()J

    move-result-wide v4

    div-long/2addr v2, v4

    invoke-static {v0, v2, v3}, Ljava/util/Arrays;->fill([JJ)V

    .line 824
    return-object v1

    .line 802
    :cond_0
    new-instance v2, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl$1;

    invoke-direct {v2, p0, v0}, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl$1;-><init>(Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;I)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 819
    iget v2, p0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->frameSize:I

    add-int/2addr v0, v2

    goto :goto_0
.end method

.method private readVariables()Z
    .locals 22

    .prologue
    .line 246
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->dataSource:Lcom/googlecode/mp4parser/DataSource;

    const-wide/16 v4, 0x0

    const-wide/16 v6, 0x61a8

    invoke-interface {v2, v4, v5, v6, v7}, Lcom/googlecode/mp4parser/DataSource;->map(JJ)Ljava/nio/ByteBuffer;

    move-result-object v17

    .line 247
    invoke-virtual/range {v17 .. v17}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v3

    .line 248
    invoke-virtual/range {v17 .. v17}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v2

    .line 249
    const v4, 0x44545348

    if-ne v3, v4, :cond_0

    const v4, 0x44484452

    if-eq v2, v4, :cond_7

    .line 250
    :cond_0
    const/4 v2, 0x0

    .line 793
    :goto_0
    return v2

    .line 254
    :cond_1
    invoke-virtual/range {v17 .. v17}, Ljava/nio/ByteBuffer;->getLong()J

    move-result-wide v4

    long-to-int v4, v4

    .line 255
    const v5, 0x44545348

    if-ne v3, v5, :cond_2

    const v5, 0x44484452

    if-ne v2, v5, :cond_2

    .line 256
    move-object/from16 v0, p0

    move-object/from16 v1, v17

    invoke-direct {v0, v4, v1}, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->parseDtshdhdr(ILjava/nio/ByteBuffer;)Z

    move-result v2

    if-nez v2, :cond_6

    .line 257
    const/4 v2, 0x0

    goto :goto_0

    .line 259
    :cond_2
    const v5, 0x434f5245

    if-ne v3, v5, :cond_3

    const v5, 0x53534d44

    if-ne v2, v5, :cond_3

    .line 260
    move-object/from16 v0, p0

    move-object/from16 v1, v17

    invoke-direct {v0, v4, v1}, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->parseCoressmd(ILjava/nio/ByteBuffer;)Z

    move-result v2

    if-nez v2, :cond_6

    .line 261
    const/4 v2, 0x0

    goto :goto_0

    .line 263
    :cond_3
    const v5, 0x41555052

    if-ne v3, v5, :cond_4

    const v5, 0x2d484452

    if-ne v2, v5, :cond_4

    .line 264
    move-object/from16 v0, p0

    move-object/from16 v1, v17

    invoke-direct {v0, v4, v1}, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->parseAuprhdr(ILjava/nio/ByteBuffer;)Z

    move-result v2

    if-nez v2, :cond_6

    .line 265
    const/4 v2, 0x0

    goto :goto_0

    .line 267
    :cond_4
    const v5, 0x45585453

    if-ne v3, v5, :cond_5

    const v3, 0x535f4d44

    if-ne v2, v3, :cond_5

    .line 268
    move-object/from16 v0, p0

    move-object/from16 v1, v17

    invoke-direct {v0, v4, v1}, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->parseExtssmd(ILjava/nio/ByteBuffer;)Z

    move-result v2

    if-nez v2, :cond_6

    .line 269
    const/4 v2, 0x0

    goto :goto_0

    .line 272
    :cond_5
    const/4 v2, 0x0

    :goto_1
    if-lt v2, v4, :cond_a

    .line 276
    :cond_6
    invoke-virtual/range {v17 .. v17}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v3

    .line 277
    invoke-virtual/range {v17 .. v17}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v2

    .line 253
    :cond_7
    const v4, 0x5354524d

    if-ne v3, v4, :cond_8

    const v4, 0x44415441

    if-eq v2, v4, :cond_9

    :cond_8
    invoke-virtual/range {v17 .. v17}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v4

    const/16 v5, 0x64

    if-gt v4, v5, :cond_1

    .line 279
    :cond_9
    invoke-virtual/range {v17 .. v17}, Ljava/nio/ByteBuffer;->getLong()J

    .line 280
    invoke-virtual/range {v17 .. v17}, Ljava/nio/ByteBuffer;->position()I

    move-result v2

    move-object/from16 v0, p0

    iput v2, v0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->dataOffset:I

    .line 282
    const/4 v6, -0x1

    .line 283
    const/4 v14, 0x0

    .line 284
    const/4 v4, 0x0

    .line 286
    const/4 v3, -0x1

    .line 287
    const/4 v2, -0x1

    .line 288
    const/4 v13, 0x0

    .line 289
    const/4 v12, 0x0

    .line 290
    const/4 v11, 0x0

    .line 291
    const/4 v10, 0x0

    .line 292
    const/4 v9, 0x0

    .line 293
    const/4 v8, 0x0

    .line 294
    const/4 v7, 0x0

    .line 296
    const/4 v5, 0x0

    move v15, v4

    move/from16 v16, v14

    move v14, v2

    move v2, v3

    .line 298
    :goto_2
    if-eqz v5, :cond_b

    .line 617
    const/4 v3, -0x1

    .line 618
    move-object/from16 v0, p0

    iget v4, v0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->samplesPerFrame:I

    sparse-switch v4, :sswitch_data_0

    move v5, v3

    .line 638
    :goto_3
    const/4 v3, -0x1

    if-ne v5, v3, :cond_21

    .line 641
    const/4 v2, 0x0

    goto/16 :goto_0

    .line 273
    :cond_a
    invoke-virtual/range {v17 .. v17}, Ljava/nio/ByteBuffer;->get()B

    .line 272
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 299
    :cond_b
    invoke-virtual/range {v17 .. v17}, Ljava/nio/ByteBuffer;->position()I

    move-result v18

    .line 300
    invoke-virtual/range {v17 .. v17}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v3

    .line 301
    const v4, 0x7ffe8001

    if-ne v3, v4, :cond_10

    .line 302
    const/4 v3, 0x1

    if-eq v2, v3, :cond_20

    .line 303
    const/4 v2, 0x1

    .line 306
    new-instance v15, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/BitReaderBuffer;

    move-object/from16 v0, v17

    invoke-direct {v15, v0}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/BitReaderBuffer;-><init>(Ljava/nio/ByteBuffer;)V

    .line 308
    const/4 v3, 0x1

    invoke-virtual {v15, v3}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/BitReaderBuffer;->readBits(I)I

    move-result v3

    .line 309
    const/4 v4, 0x5

    invoke-virtual {v15, v4}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/BitReaderBuffer;->readBits(I)I

    move-result v4

    .line 310
    const/4 v6, 0x1

    invoke-virtual {v15, v6}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/BitReaderBuffer;->readBits(I)I

    move-result v16

    .line 311
    const/4 v6, 0x1

    if-ne v3, v6, :cond_c

    const/16 v3, 0x1f

    if-ne v4, v3, :cond_c

    if-eqz v16, :cond_d

    .line 314
    :cond_c
    const/4 v2, 0x0

    goto/16 :goto_0

    .line 317
    :cond_d
    const/4 v3, 0x7

    invoke-virtual {v15, v3}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/BitReaderBuffer;->readBits(I)I

    move-result v3

    .line 318
    add-int/lit8 v3, v3, 0x1

    mul-int/lit8 v3, v3, 0x20

    move-object/from16 v0, p0

    iput v3, v0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->samplesPerFrame:I

    .line 319
    const/16 v3, 0xe

    invoke-virtual {v15, v3}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/BitReaderBuffer;->readBits(I)I

    move-result v19

    .line 320
    move-object/from16 v0, p0

    iget v3, v0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->frameSize:I

    add-int/lit8 v4, v19, 0x1

    add-int/2addr v3, v4

    move-object/from16 v0, p0

    iput v3, v0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->frameSize:I

    .line 321
    const/4 v3, 0x6

    invoke-virtual {v15, v3}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/BitReaderBuffer;->readBits(I)I

    move-result v6

    .line 322
    const/4 v3, 0x4

    invoke-virtual {v15, v3}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/BitReaderBuffer;->readBits(I)I

    move-result v3

    .line 323
    packed-switch v3, :pswitch_data_0

    .line 363
    :pswitch_0
    const/4 v2, 0x0

    goto/16 :goto_0

    .line 327
    :pswitch_1
    const/16 v3, 0x1f40

    move-object/from16 v0, p0

    iput v3, v0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->samplerate:I

    .line 367
    :goto_4
    const/4 v3, 0x5

    invoke-virtual {v15, v3}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/BitReaderBuffer;->readBits(I)I

    move-result v3

    .line 369
    packed-switch v3, :pswitch_data_1

    .line 477
    const/4 v2, 0x0

    goto/16 :goto_0

    .line 331
    :pswitch_2
    const/16 v3, 0x3e80

    move-object/from16 v0, p0

    iput v3, v0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->samplerate:I

    goto :goto_4

    .line 335
    :pswitch_3
    const/16 v3, 0x7d00

    move-object/from16 v0, p0

    iput v3, v0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->samplerate:I

    goto :goto_4

    .line 339
    :pswitch_4
    const/16 v3, 0x2b11

    move-object/from16 v0, p0

    iput v3, v0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->samplerate:I

    goto :goto_4

    .line 343
    :pswitch_5
    const/16 v3, 0x5622

    move-object/from16 v0, p0

    iput v3, v0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->samplerate:I

    goto :goto_4

    .line 347
    :pswitch_6
    const v3, 0xac44

    move-object/from16 v0, p0

    iput v3, v0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->samplerate:I

    goto :goto_4

    .line 351
    :pswitch_7
    const/16 v3, 0x2ee0

    move-object/from16 v0, p0

    iput v3, v0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->samplerate:I

    goto :goto_4

    .line 355
    :pswitch_8
    const/16 v3, 0x5dc0

    move-object/from16 v0, p0

    iput v3, v0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->samplerate:I

    goto :goto_4

    .line 359
    :pswitch_9
    const v3, 0xbb80

    move-object/from16 v0, p0

    iput v3, v0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->samplerate:I

    goto :goto_4

    .line 373
    :pswitch_a
    const/16 v3, 0x20

    move-object/from16 v0, p0

    iput v3, v0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->bitrate:I

    .line 481
    :goto_5
    const/4 v3, 0x1

    invoke-virtual {v15, v3}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/BitReaderBuffer;->readBits(I)I

    move-result v3

    .line 482
    if-eqz v3, :cond_e

    .line 485
    const/4 v2, 0x0

    goto/16 :goto_0

    .line 377
    :pswitch_b
    const/16 v3, 0x38

    move-object/from16 v0, p0

    iput v3, v0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->bitrate:I

    goto :goto_5

    .line 381
    :pswitch_c
    const/16 v3, 0x40

    move-object/from16 v0, p0

    iput v3, v0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->bitrate:I

    goto :goto_5

    .line 385
    :pswitch_d
    const/16 v3, 0x60

    move-object/from16 v0, p0

    iput v3, v0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->bitrate:I

    goto :goto_5

    .line 389
    :pswitch_e
    const/16 v3, 0x70

    move-object/from16 v0, p0

    iput v3, v0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->bitrate:I

    goto :goto_5

    .line 393
    :pswitch_f
    const/16 v3, 0x80

    move-object/from16 v0, p0

    iput v3, v0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->bitrate:I

    goto :goto_5

    .line 397
    :pswitch_10
    const/16 v3, 0xc0

    move-object/from16 v0, p0

    iput v3, v0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->bitrate:I

    goto :goto_5

    .line 401
    :pswitch_11
    const/16 v3, 0xe0

    move-object/from16 v0, p0

    iput v3, v0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->bitrate:I

    goto :goto_5

    .line 405
    :pswitch_12
    const/16 v3, 0x100

    move-object/from16 v0, p0

    iput v3, v0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->bitrate:I

    goto :goto_5

    .line 409
    :pswitch_13
    const/16 v3, 0x140

    move-object/from16 v0, p0

    iput v3, v0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->bitrate:I

    goto :goto_5

    .line 413
    :pswitch_14
    const/16 v3, 0x180

    move-object/from16 v0, p0

    iput v3, v0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->bitrate:I

    goto :goto_5

    .line 417
    :pswitch_15
    const/16 v3, 0x1c0

    move-object/from16 v0, p0

    iput v3, v0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->bitrate:I

    goto :goto_5

    .line 421
    :pswitch_16
    const/16 v3, 0x200

    move-object/from16 v0, p0

    iput v3, v0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->bitrate:I

    goto :goto_5

    .line 425
    :pswitch_17
    const/16 v3, 0x240

    move-object/from16 v0, p0

    iput v3, v0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->bitrate:I

    goto :goto_5

    .line 429
    :pswitch_18
    const/16 v3, 0x280

    move-object/from16 v0, p0

    iput v3, v0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->bitrate:I

    goto :goto_5

    .line 433
    :pswitch_19
    const/16 v3, 0x300

    move-object/from16 v0, p0

    iput v3, v0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->bitrate:I

    goto :goto_5

    .line 437
    :pswitch_1a
    const/16 v3, 0x3c0

    move-object/from16 v0, p0

    iput v3, v0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->bitrate:I

    goto :goto_5

    .line 441
    :pswitch_1b
    const/16 v3, 0x400

    move-object/from16 v0, p0

    iput v3, v0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->bitrate:I

    goto :goto_5

    .line 445
    :pswitch_1c
    const/16 v3, 0x480

    move-object/from16 v0, p0

    iput v3, v0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->bitrate:I

    goto/16 :goto_5

    .line 449
    :pswitch_1d
    const/16 v3, 0x500

    move-object/from16 v0, p0

    iput v3, v0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->bitrate:I

    goto/16 :goto_5

    .line 453
    :pswitch_1e
    const/16 v3, 0x540

    move-object/from16 v0, p0

    iput v3, v0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->bitrate:I

    goto/16 :goto_5

    .line 457
    :pswitch_1f
    const/16 v3, 0x580

    move-object/from16 v0, p0

    iput v3, v0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->bitrate:I

    goto/16 :goto_5

    .line 461
    :pswitch_20
    const/16 v3, 0x583

    move-object/from16 v0, p0

    iput v3, v0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->bitrate:I

    goto/16 :goto_5

    .line 465
    :pswitch_21
    const/16 v3, 0x5c0

    move-object/from16 v0, p0

    iput v3, v0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->bitrate:I

    goto/16 :goto_5

    .line 469
    :pswitch_22
    const/16 v3, 0x600

    move-object/from16 v0, p0

    iput v3, v0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->bitrate:I

    goto/16 :goto_5

    .line 473
    :pswitch_23
    const/4 v3, -0x1

    move-object/from16 v0, p0

    iput v3, v0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->bitrate:I

    goto/16 :goto_5

    .line 488
    :cond_e
    const/4 v3, 0x1

    invoke-virtual {v15, v3}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/BitReaderBuffer;->readBits(I)I

    .line 489
    const/4 v3, 0x1

    invoke-virtual {v15, v3}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/BitReaderBuffer;->readBits(I)I

    .line 490
    const/4 v3, 0x1

    invoke-virtual {v15, v3}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/BitReaderBuffer;->readBits(I)I

    .line 491
    const/4 v3, 0x1

    invoke-virtual {v15, v3}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/BitReaderBuffer;->readBits(I)I

    .line 492
    const/4 v3, 0x3

    invoke-virtual {v15, v3}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/BitReaderBuffer;->readBits(I)I

    move-result v4

    .line 493
    const/4 v3, 0x1

    invoke-virtual {v15, v3}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/BitReaderBuffer;->readBits(I)I

    move-result v3

    .line 494
    const/16 v20, 0x1

    move/from16 v0, v20

    invoke-virtual {v15, v0}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/BitReaderBuffer;->readBits(I)I

    .line 495
    const/16 v20, 0x2

    move/from16 v0, v20

    invoke-virtual {v15, v0}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/BitReaderBuffer;->readBits(I)I

    .line 496
    const/16 v20, 0x1

    move/from16 v0, v20

    invoke-virtual {v15, v0}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/BitReaderBuffer;->readBits(I)I

    .line 497
    const/16 v20, 0x1

    move/from16 v0, v16

    move/from16 v1, v20

    if-ne v0, v1, :cond_f

    .line 501
    const/16 v16, 0x10

    invoke-virtual/range {v15 .. v16}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/BitReaderBuffer;->readBits(I)I

    .line 504
    :cond_f
    const/16 v16, 0x1

    invoke-virtual/range {v15 .. v16}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/BitReaderBuffer;->readBits(I)I

    .line 505
    const/16 v16, 0x4

    invoke-virtual/range {v15 .. v16}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/BitReaderBuffer;->readBits(I)I

    move-result v16

    .line 506
    const/16 v20, 0x2

    move/from16 v0, v20

    invoke-virtual {v15, v0}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/BitReaderBuffer;->readBits(I)I

    .line 507
    const/16 v20, 0x3

    move/from16 v0, v20

    invoke-virtual {v15, v0}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/BitReaderBuffer;->readBits(I)I

    move-result v20

    .line 508
    packed-switch v20, :pswitch_data_2

    .line 527
    :pswitch_24
    const/4 v2, 0x0

    goto/16 :goto_0

    .line 513
    :pswitch_25
    const/16 v20, 0x10

    move/from16 v0, v20

    move-object/from16 v1, p0

    iput v0, v1, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->sampleSize:I

    .line 530
    :goto_6
    const/16 v20, 0x1

    move/from16 v0, v20

    invoke-virtual {v15, v0}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/BitReaderBuffer;->readBits(I)I

    .line 531
    const/16 v20, 0x1

    move/from16 v0, v20

    invoke-virtual {v15, v0}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/BitReaderBuffer;->readBits(I)I

    .line 532
    packed-switch v16, :pswitch_data_3

    .line 548
    const/16 v16, 0x4

    invoke-virtual/range {v15 .. v16}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/BitReaderBuffer;->readBits(I)I

    .line 551
    :goto_7
    add-int v15, v18, v19

    add-int/lit8 v15, v15, 0x1

    move-object/from16 v0, v17

    invoke-virtual {v0, v15}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    move v15, v3

    move/from16 v16, v4

    .line 553
    goto/16 :goto_2

    .line 518
    :pswitch_26
    const/16 v20, 0x14

    move/from16 v0, v20

    move-object/from16 v1, p0

    iput v0, v1, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->sampleSize:I

    goto :goto_6

    .line 523
    :pswitch_27
    const/16 v20, 0x18

    move/from16 v0, v20

    move-object/from16 v1, p0

    iput v0, v1, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->sampleSize:I

    goto :goto_6

    .line 538
    :pswitch_28
    const/16 v16, 0x4

    invoke-virtual/range {v15 .. v16}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/BitReaderBuffer;->readBits(I)I

    goto :goto_7

    .line 543
    :pswitch_29
    const/16 v16, 0x4

    invoke-virtual/range {v15 .. v16}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/BitReaderBuffer;->readBits(I)I

    goto :goto_7

    .line 553
    :cond_10
    const v4, 0x64582025

    if-ne v3, v4, :cond_20

    .line 554
    const/4 v3, -0x1

    if-ne v2, v3, :cond_11

    .line 555
    const/4 v2, 0x0

    .line 556
    move-object/from16 v0, p0

    iget v3, v0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->samplesPerFrameAtMaxFs:I

    move-object/from16 v0, p0

    iput v3, v0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->samplesPerFrame:I

    .line 558
    :cond_11
    const/4 v14, 0x1

    .line 559
    new-instance v19, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/BitReaderBuffer;

    move-object/from16 v0, v19

    move-object/from16 v1, v17

    invoke-direct {v0, v1}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/BitReaderBuffer;-><init>(Ljava/nio/ByteBuffer;)V

    .line 560
    const/16 v3, 0x8

    move-object/from16 v0, v19

    invoke-virtual {v0, v3}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/BitReaderBuffer;->readBits(I)I

    .line 561
    const/4 v3, 0x2

    move-object/from16 v0, v19

    invoke-virtual {v0, v3}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/BitReaderBuffer;->readBits(I)I

    .line 562
    const/4 v3, 0x1

    move-object/from16 v0, v19

    invoke-virtual {v0, v3}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/BitReaderBuffer;->readBits(I)I

    move-result v20

    .line 563
    const/16 v4, 0xc

    .line 564
    const/16 v3, 0x14

    .line 565
    if-nez v20, :cond_12

    .line 566
    const/16 v4, 0x8

    .line 567
    const/16 v3, 0x10

    .line 569
    :cond_12
    move-object/from16 v0, v19

    invoke-virtual {v0, v4}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/BitReaderBuffer;->readBits(I)I

    move-result v4

    add-int/lit8 v4, v4, 0x1

    .line 570
    move-object/from16 v0, v19

    invoke-virtual {v0, v3}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/BitReaderBuffer;->readBits(I)I

    move-result v3

    add-int/lit8 v19, v3, 0x1

    .line 571
    add-int v3, v18, v4

    move-object/from16 v0, v17

    invoke-virtual {v0, v3}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 572
    invoke-virtual/range {v17 .. v17}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v3

    .line 573
    const v4, 0x5a5a5a5a

    if-ne v3, v4, :cond_14

    .line 574
    const/4 v3, 0x1

    if-ne v13, v3, :cond_3e

    .line 575
    const/4 v3, 0x1

    .line 577
    :goto_8
    const/4 v4, 0x1

    move v5, v3

    move v3, v7

    move v7, v9

    move v9, v11

    move v11, v4

    move v4, v8

    move v8, v10

    move v10, v12

    .line 609
    :goto_9
    if-nez v5, :cond_13

    .line 610
    move-object/from16 v0, p0

    iget v12, v0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->frameSize:I

    add-int v12, v12, v19

    move-object/from16 v0, p0

    iput v12, v0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->frameSize:I

    .line 612
    :cond_13
    add-int v12, v18, v19

    move-object/from16 v0, v17

    invoke-virtual {v0, v12}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    move v12, v10

    move v13, v11

    move v10, v8

    move v11, v9

    move v9, v7

    move v8, v4

    move v7, v3

    .line 613
    goto/16 :goto_2

    .line 578
    :cond_14
    const v4, 0x47004a03

    if-ne v3, v4, :cond_16

    .line 579
    const/4 v3, 0x1

    if-ne v12, v3, :cond_15

    .line 580
    const/4 v5, 0x1

    .line 582
    :cond_15
    const/4 v3, 0x1

    move v4, v8

    move v8, v10

    move v10, v3

    move v3, v7

    move v7, v9

    move v9, v11

    move v11, v13

    .line 583
    goto :goto_9

    :cond_16
    const v4, 0x1d95f262

    if-ne v3, v4, :cond_18

    .line 584
    const/4 v3, 0x1

    if-ne v11, v3, :cond_17

    .line 585
    const/4 v5, 0x1

    .line 587
    :cond_17
    const/4 v3, 0x1

    move v4, v8

    move v11, v13

    move v8, v10

    move v10, v12

    move/from16 v21, v3

    move v3, v7

    move v7, v9

    move/from16 v9, v21

    .line 588
    goto :goto_9

    :cond_18
    const v4, 0x655e315e

    if-ne v3, v4, :cond_1a

    .line 589
    const/4 v3, 0x1

    if-ne v10, v3, :cond_19

    .line 590
    const/4 v5, 0x1

    .line 592
    :cond_19
    const/4 v3, 0x1

    move v4, v8

    move v10, v12

    move v8, v3

    move v3, v7

    move v7, v9

    move v9, v11

    move v11, v13

    .line 593
    goto :goto_9

    :cond_1a
    const v4, 0xa801921

    if-ne v3, v4, :cond_1c

    .line 594
    const/4 v3, 0x1

    if-ne v9, v3, :cond_1b

    .line 595
    const/4 v5, 0x1

    .line 597
    :cond_1b
    const/4 v3, 0x1

    move v4, v8

    move v9, v11

    move v8, v10

    move v11, v13

    move v10, v12

    move/from16 v21, v7

    move v7, v3

    move/from16 v3, v21

    .line 598
    goto :goto_9

    :cond_1c
    const v4, 0x41a29547

    if-ne v3, v4, :cond_1e

    .line 599
    const/4 v3, 0x1

    if-ne v8, v3, :cond_1d

    .line 600
    const/4 v5, 0x1

    .line 602
    :cond_1d
    const/4 v3, 0x1

    move v4, v3

    move v8, v10

    move v3, v7

    move v10, v12

    move v7, v9

    move v9, v11

    move v11, v13

    .line 603
    goto :goto_9

    :cond_1e
    const v4, 0x2b09261

    if-ne v3, v4, :cond_3d

    .line 604
    const/4 v3, 0x1

    if-ne v7, v3, :cond_1f

    .line 605
    const/4 v5, 0x1

    .line 607
    :cond_1f
    const/4 v3, 0x1

    move v4, v8

    move v7, v9

    move v8, v10

    move v9, v11

    move v10, v12

    move v11, v13

    goto/16 :goto_9

    .line 614
    :cond_20
    const/4 v5, 0x1

    goto/16 :goto_2

    .line 622
    :sswitch_0
    const/4 v3, 0x0

    move v5, v3

    .line 623
    goto/16 :goto_3

    .line 626
    :sswitch_1
    const/4 v3, 0x1

    move v5, v3

    .line 627
    goto/16 :goto_3

    .line 630
    :sswitch_2
    const/4 v3, 0x2

    move v5, v3

    .line 631
    goto/16 :goto_3

    .line 634
    :sswitch_3
    const/4 v3, 0x3

    move v5, v3

    goto/16 :goto_3

    .line 644
    :cond_21
    const/16 v3, 0x1f

    .line 645
    packed-switch v6, :pswitch_data_4

    :pswitch_2a
    move v4, v3

    .line 659
    :goto_a
    const/4 v3, 0x0

    .line 660
    if-nez v2, :cond_29

    .line 661
    const/4 v2, 0x1

    if-ne v8, v2, :cond_25

    .line 662
    if-nez v7, :cond_24

    .line 663
    const/16 v2, 0x11

    .line 664
    const-string v3, "dtsl"

    move-object/from16 v0, p0

    iput-object v3, v0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->type:Ljava/lang/String;

    .line 682
    :goto_b
    move-object/from16 v0, p0

    iget v3, v0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->maxSampleRate:I

    move-object/from16 v0, p0

    iput v3, v0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->samplerate:I

    .line 683
    const/16 v3, 0x18

    move-object/from16 v0, p0

    iput v3, v0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->sampleSize:I

    move v3, v2

    .line 745
    :cond_22
    :goto_c
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->ddts:Lcom/googlecode/mp4parser/boxes/DTSSpecificBox;

    move-object/from16 v0, p0

    iget v6, v0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->maxSampleRate:I

    int-to-long v6, v6

    invoke-virtual {v2, v6, v7}, Lcom/googlecode/mp4parser/boxes/DTSSpecificBox;->setDTSSamplingFrequency(J)V

    .line 746
    move-object/from16 v0, p0

    iget-boolean v2, v0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->isVBR:Z

    if-eqz v2, :cond_37

    .line 747
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->ddts:Lcom/googlecode/mp4parser/boxes/DTSSpecificBox;

    move-object/from16 v0, p0

    iget v6, v0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->coreBitRate:I

    move-object/from16 v0, p0

    iget v7, v0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->extPeakBitrate:I

    add-int/2addr v6, v7

    mul-int/lit16 v6, v6, 0x3e8

    int-to-long v6, v6

    invoke-virtual {v2, v6, v7}, Lcom/googlecode/mp4parser/boxes/DTSSpecificBox;->setMaxBitRate(J)V

    .line 751
    :goto_d
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->ddts:Lcom/googlecode/mp4parser/boxes/DTSSpecificBox;

    move-object/from16 v0, p0

    iget v6, v0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->coreBitRate:I

    move-object/from16 v0, p0

    iget v7, v0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->extAvgBitrate:I

    add-int/2addr v6, v7

    mul-int/lit16 v6, v6, 0x3e8

    int-to-long v6, v6

    invoke-virtual {v2, v6, v7}, Lcom/googlecode/mp4parser/boxes/DTSSpecificBox;->setAvgBitRate(J)V

    .line 752
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->ddts:Lcom/googlecode/mp4parser/boxes/DTSSpecificBox;

    move-object/from16 v0, p0

    iget v6, v0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->sampleSize:I

    invoke-virtual {v2, v6}, Lcom/googlecode/mp4parser/boxes/DTSSpecificBox;->setPcmSampleDepth(I)V

    .line 753
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->ddts:Lcom/googlecode/mp4parser/boxes/DTSSpecificBox;

    invoke-virtual {v2, v5}, Lcom/googlecode/mp4parser/boxes/DTSSpecificBox;->setFrameDuration(I)V

    .line 754
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->ddts:Lcom/googlecode/mp4parser/boxes/DTSSpecificBox;

    invoke-virtual {v2, v3}, Lcom/googlecode/mp4parser/boxes/DTSSpecificBox;->setStreamConstruction(I)V

    .line 755
    move-object/from16 v0, p0

    iget v2, v0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->coreChannelMask:I

    and-int/lit8 v2, v2, 0x8

    if-gtz v2, :cond_23

    move-object/from16 v0, p0

    iget v2, v0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->coreChannelMask:I

    and-int/lit16 v2, v2, 0x1000

    if-lez v2, :cond_38

    .line 756
    :cond_23
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->ddts:Lcom/googlecode/mp4parser/boxes/DTSSpecificBox;

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Lcom/googlecode/mp4parser/boxes/DTSSpecificBox;->setCoreLFEPresent(I)V

    .line 760
    :goto_e
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->ddts:Lcom/googlecode/mp4parser/boxes/DTSSpecificBox;

    invoke-virtual {v2, v4}, Lcom/googlecode/mp4parser/boxes/DTSSpecificBox;->setCoreLayout(I)V

    .line 761
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->ddts:Lcom/googlecode/mp4parser/boxes/DTSSpecificBox;

    move-object/from16 v0, p0

    iget v3, v0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->coreFramePayloadInBytes:I

    invoke-virtual {v2, v3}, Lcom/googlecode/mp4parser/boxes/DTSSpecificBox;->setCoreSize(I)V

    .line 762
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->ddts:Lcom/googlecode/mp4parser/boxes/DTSSpecificBox;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Lcom/googlecode/mp4parser/boxes/DTSSpecificBox;->setStereoDownmix(I)V

    .line 763
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->ddts:Lcom/googlecode/mp4parser/boxes/DTSSpecificBox;

    const/4 v3, 0x4

    invoke-virtual {v2, v3}, Lcom/googlecode/mp4parser/boxes/DTSSpecificBox;->setRepresentationType(I)V

    .line 764
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->ddts:Lcom/googlecode/mp4parser/boxes/DTSSpecificBox;

    move-object/from16 v0, p0

    iget v3, v0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->channelMask:I

    invoke-virtual {v2, v3}, Lcom/googlecode/mp4parser/boxes/DTSSpecificBox;->setChannelLayout(I)V

    .line 765
    move-object/from16 v0, p0

    iget v2, v0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->coreMaxSampleRate:I

    if-lez v2, :cond_39

    move-object/from16 v0, p0

    iget v2, v0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->extAvgBitrate:I

    if-lez v2, :cond_39

    .line 766
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->ddts:Lcom/googlecode/mp4parser/boxes/DTSSpecificBox;

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Lcom/googlecode/mp4parser/boxes/DTSSpecificBox;->setMultiAssetFlag(I)V

    .line 770
    :goto_f
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->ddts:Lcom/googlecode/mp4parser/boxes/DTSSpecificBox;

    move-object/from16 v0, p0

    iget v3, v0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->lbrCodingPresent:I

    invoke-virtual {v2, v3}, Lcom/googlecode/mp4parser/boxes/DTSSpecificBox;->setLBRDurationMod(I)V

    .line 771
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->ddts:Lcom/googlecode/mp4parser/boxes/DTSSpecificBox;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Lcom/googlecode/mp4parser/boxes/DTSSpecificBox;->setReservedBoxPresent(I)V

    .line 773
    const/4 v2, 0x0

    move-object/from16 v0, p0

    iput v2, v0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->channelCount:I

    .line 774
    const/4 v2, 0x0

    :goto_10
    const/16 v3, 0x10

    if-lt v2, v3, :cond_3a

    .line 793
    const/4 v2, 0x1

    goto/16 :goto_0

    :pswitch_2b
    move v4, v6

    .line 656
    goto/16 :goto_a

    .line 666
    :cond_24
    const/16 v2, 0x15

    .line 667
    const-string v3, "dtsh"

    move-object/from16 v0, p0

    iput-object v3, v0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->type:Ljava/lang/String;

    goto/16 :goto_b

    .line 669
    :cond_25
    const/4 v2, 0x1

    if-ne v9, v2, :cond_26

    .line 670
    const/16 v2, 0x12

    .line 671
    const-string v3, "dtse"

    move-object/from16 v0, p0

    iput-object v3, v0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->type:Ljava/lang/String;

    goto/16 :goto_b

    .line 672
    :cond_26
    const/4 v2, 0x1

    if-ne v7, v2, :cond_3c

    .line 673
    const-string v2, "dtsh"

    move-object/from16 v0, p0

    iput-object v2, v0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->type:Ljava/lang/String;

    .line 674
    if-nez v12, :cond_27

    if-nez v8, :cond_27

    .line 675
    const/16 v2, 0x13

    .line 676
    goto/16 :goto_b

    :cond_27
    const/4 v2, 0x1

    if-ne v12, v2, :cond_28

    if-nez v8, :cond_28

    .line 677
    const/16 v2, 0x14

    .line 678
    goto/16 :goto_b

    :cond_28
    if-nez v12, :cond_3c

    const/4 v2, 0x1

    if-ne v8, v2, :cond_3c

    .line 679
    const/16 v2, 0x15

    goto/16 :goto_b

    .line 685
    :cond_29
    if-gtz v14, :cond_2b

    .line 686
    if-lez v15, :cond_2a

    .line 687
    sparse-switch v16, :sswitch_data_1

    .line 704
    const/4 v3, 0x0

    .line 705
    const-string v2, "dtsh"

    move-object/from16 v0, p0

    iput-object v2, v0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->type:Ljava/lang/String;

    goto/16 :goto_c

    .line 689
    :sswitch_4
    const/4 v3, 0x2

    .line 690
    const-string v2, "dtsc"

    move-object/from16 v0, p0

    iput-object v2, v0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->type:Ljava/lang/String;

    goto/16 :goto_c

    .line 694
    :sswitch_5
    const/4 v3, 0x4

    .line 695
    const-string v2, "dtsc"

    move-object/from16 v0, p0

    iput-object v2, v0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->type:Ljava/lang/String;

    goto/16 :goto_c

    .line 699
    :sswitch_6
    const/4 v3, 0x3

    .line 700
    const-string v2, "dtsh"

    move-object/from16 v0, p0

    iput-object v2, v0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->type:Ljava/lang/String;

    goto/16 :goto_c

    .line 709
    :cond_2a
    const/4 v3, 0x1

    .line 710
    const-string v2, "dtsc"

    move-object/from16 v0, p0

    iput-object v2, v0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->type:Ljava/lang/String;

    goto/16 :goto_c

    .line 713
    :cond_2b
    const-string v2, "dtsh"

    move-object/from16 v0, p0

    iput-object v2, v0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->type:Ljava/lang/String;

    .line 714
    if-nez v15, :cond_31

    .line 715
    if-nez v7, :cond_2c

    const/4 v2, 0x1

    if-ne v12, v2, :cond_2c

    if-nez v11, :cond_2c

    if-nez v10, :cond_2c

    if-nez v8, :cond_2c

    if-nez v9, :cond_2c

    .line 716
    const/4 v3, 0x5

    .line 717
    goto/16 :goto_c

    :cond_2c
    if-nez v7, :cond_2d

    if-nez v12, :cond_2d

    if-nez v11, :cond_2d

    const/4 v2, 0x1

    if-ne v10, v2, :cond_2d

    if-nez v8, :cond_2d

    if-nez v9, :cond_2d

    .line 718
    const/4 v3, 0x6

    .line 719
    goto/16 :goto_c

    :cond_2d
    if-nez v7, :cond_2e

    const/4 v2, 0x1

    if-ne v12, v2, :cond_2e

    if-nez v11, :cond_2e

    const/4 v2, 0x1

    if-ne v10, v2, :cond_2e

    if-nez v8, :cond_2e

    if-nez v9, :cond_2e

    .line 720
    const/16 v3, 0x9

    .line 721
    goto/16 :goto_c

    :cond_2e
    if-nez v7, :cond_2f

    if-nez v12, :cond_2f

    const/4 v2, 0x1

    if-ne v11, v2, :cond_2f

    if-nez v10, :cond_2f

    if-nez v8, :cond_2f

    if-nez v9, :cond_2f

    .line 722
    const/16 v3, 0xa

    .line 723
    goto/16 :goto_c

    :cond_2f
    if-nez v7, :cond_30

    const/4 v2, 0x1

    if-ne v12, v2, :cond_30

    const/4 v2, 0x1

    if-ne v11, v2, :cond_30

    if-nez v10, :cond_30

    if-nez v8, :cond_30

    if-nez v9, :cond_30

    .line 724
    const/16 v3, 0xd

    .line 725
    goto/16 :goto_c

    :cond_30
    if-nez v7, :cond_22

    if-nez v12, :cond_22

    if-nez v11, :cond_22

    if-nez v10, :cond_22

    const/4 v2, 0x1

    if-ne v8, v2, :cond_22

    if-nez v9, :cond_22

    .line 726
    const/16 v3, 0xe

    .line 728
    goto/16 :goto_c

    .line 729
    :cond_31
    if-nez v16, :cond_32

    if-nez v7, :cond_32

    if-nez v12, :cond_32

    if-nez v11, :cond_32

    const/4 v2, 0x1

    if-ne v10, v2, :cond_32

    if-nez v8, :cond_32

    if-nez v9, :cond_32

    .line 730
    const/4 v3, 0x7

    .line 731
    goto/16 :goto_c

    :cond_32
    const/4 v2, 0x6

    move/from16 v0, v16

    if-ne v0, v2, :cond_33

    if-nez v7, :cond_33

    if-nez v12, :cond_33

    if-nez v11, :cond_33

    const/4 v2, 0x1

    if-ne v10, v2, :cond_33

    if-nez v8, :cond_33

    if-nez v9, :cond_33

    .line 732
    const/16 v3, 0x8

    .line 733
    goto/16 :goto_c

    :cond_33
    if-nez v16, :cond_34

    if-nez v7, :cond_34

    if-nez v12, :cond_34

    const/4 v2, 0x1

    if-ne v11, v2, :cond_34

    if-nez v10, :cond_34

    if-nez v8, :cond_34

    if-nez v9, :cond_34

    .line 734
    const/16 v3, 0xb

    .line 735
    goto/16 :goto_c

    :cond_34
    const/4 v2, 0x6

    move/from16 v0, v16

    if-ne v0, v2, :cond_35

    if-nez v7, :cond_35

    if-nez v12, :cond_35

    const/4 v2, 0x1

    if-ne v11, v2, :cond_35

    if-nez v10, :cond_35

    if-nez v8, :cond_35

    if-nez v9, :cond_35

    .line 736
    const/16 v3, 0xc

    .line 737
    goto/16 :goto_c

    :cond_35
    if-nez v16, :cond_36

    if-nez v7, :cond_36

    if-nez v12, :cond_36

    if-nez v11, :cond_36

    if-nez v10, :cond_36

    const/4 v2, 0x1

    if-ne v8, v2, :cond_36

    if-nez v9, :cond_36

    .line 738
    const/16 v3, 0xf

    .line 739
    goto/16 :goto_c

    :cond_36
    const/4 v2, 0x2

    move/from16 v0, v16

    if-ne v0, v2, :cond_22

    if-nez v7, :cond_22

    if-nez v12, :cond_22

    if-nez v11, :cond_22

    if-nez v10, :cond_22

    const/4 v2, 0x1

    if-ne v8, v2, :cond_22

    if-nez v9, :cond_22

    .line 740
    const/16 v3, 0x10

    goto/16 :goto_c

    .line 749
    :cond_37
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->ddts:Lcom/googlecode/mp4parser/boxes/DTSSpecificBox;

    move-object/from16 v0, p0

    iget v6, v0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->coreBitRate:I

    move-object/from16 v0, p0

    iget v7, v0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->extAvgBitrate:I

    add-int/2addr v6, v7

    mul-int/lit16 v6, v6, 0x3e8

    int-to-long v6, v6

    invoke-virtual {v2, v6, v7}, Lcom/googlecode/mp4parser/boxes/DTSSpecificBox;->setMaxBitRate(J)V

    goto/16 :goto_d

    .line 758
    :cond_38
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->ddts:Lcom/googlecode/mp4parser/boxes/DTSSpecificBox;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Lcom/googlecode/mp4parser/boxes/DTSSpecificBox;->setCoreLFEPresent(I)V

    goto/16 :goto_e

    .line 768
    :cond_39
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->ddts:Lcom/googlecode/mp4parser/boxes/DTSSpecificBox;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Lcom/googlecode/mp4parser/boxes/DTSSpecificBox;->setMultiAssetFlag(I)V

    goto/16 :goto_f

    .line 775
    :cond_3a
    move-object/from16 v0, p0

    iget v3, v0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->channelMask:I

    shr-int/2addr v3, v2

    and-int/lit8 v3, v3, 0x1

    const/4 v4, 0x1

    if-ne v3, v4, :cond_3b

    .line 776
    packed-switch v2, :pswitch_data_5

    .line 788
    :pswitch_2c
    move-object/from16 v0, p0

    iget v3, v0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->channelCount:I

    add-int/lit8 v3, v3, 0x2

    move-object/from16 v0, p0

    iput v3, v0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->channelCount:I

    .line 774
    :cond_3b
    :goto_11
    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_10

    .line 784
    :pswitch_2d
    move-object/from16 v0, p0

    iget v3, v0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->channelCount:I

    add-int/lit8 v3, v3, 0x1

    move-object/from16 v0, p0

    iput v3, v0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->channelCount:I

    goto :goto_11

    :cond_3c
    move v2, v3

    goto/16 :goto_b

    :cond_3d
    move v3, v7

    move v4, v8

    move v7, v9

    move v8, v10

    move v9, v11

    move v10, v12

    move v11, v13

    goto/16 :goto_9

    :cond_3e
    move v3, v5

    goto/16 :goto_8

    .line 618
    nop

    :sswitch_data_0
    .sparse-switch
        0x200 -> :sswitch_0
        0x400 -> :sswitch_1
        0x800 -> :sswitch_2
        0x1000 -> :sswitch_3
    .end sparse-switch

    .line 323
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_0
        :pswitch_0
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_0
        :pswitch_0
        :pswitch_7
        :pswitch_8
        :pswitch_9
    .end packed-switch

    .line 369
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_a
        :pswitch_b
        :pswitch_c
        :pswitch_d
        :pswitch_e
        :pswitch_f
        :pswitch_10
        :pswitch_11
        :pswitch_12
        :pswitch_13
        :pswitch_14
        :pswitch_15
        :pswitch_16
        :pswitch_17
        :pswitch_18
        :pswitch_19
        :pswitch_1a
        :pswitch_1b
        :pswitch_1c
        :pswitch_1d
        :pswitch_1e
        :pswitch_1f
        :pswitch_20
        :pswitch_21
        :pswitch_22
        :pswitch_23
    .end packed-switch

    .line 508
    :pswitch_data_2
    .packed-switch 0x0
        :pswitch_25
        :pswitch_25
        :pswitch_26
        :pswitch_26
        :pswitch_24
        :pswitch_27
        :pswitch_27
    .end packed-switch

    .line 532
    :pswitch_data_3
    .packed-switch 0x6
        :pswitch_28
        :pswitch_29
    .end packed-switch

    .line 645
    :pswitch_data_4
    .packed-switch 0x0
        :pswitch_2b
        :pswitch_2a
        :pswitch_2b
        :pswitch_2a
        :pswitch_2b
        :pswitch_2b
        :pswitch_2b
        :pswitch_2b
        :pswitch_2b
        :pswitch_2b
    .end packed-switch

    .line 687
    :sswitch_data_1
    .sparse-switch
        0x0 -> :sswitch_4
        0x2 -> :sswitch_5
        0x6 -> :sswitch_6
    .end sparse-switch

    .line 776
    :pswitch_data_5
    .packed-switch 0x0
        :pswitch_2d
        :pswitch_2c
        :pswitch_2c
        :pswitch_2d
        :pswitch_2d
        :pswitch_2c
        :pswitch_2c
        :pswitch_2d
        :pswitch_2d
        :pswitch_2c
        :pswitch_2c
        :pswitch_2c
        :pswitch_2d
        :pswitch_2c
        :pswitch_2d
    .end packed-switch
.end method


# virtual methods
.method public close()V
    .locals 1

    .prologue
    .line 81
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->dataSource:Lcom/googlecode/mp4parser/DataSource;

    invoke-interface {v0}, Lcom/googlecode/mp4parser/DataSource;->close()V

    .line 82
    return-void
.end method

.method public getCompositionTimeEntries()Ljava/util/List;
    .locals 1

    .prologue
    .line 123
    const/4 v0, 0x0

    return-object v0
.end method

.method public getHandler()Ljava/lang/String;
    .locals 1

    .prologue
    .line 139
    const-string v0, "soun"

    return-object v0
.end method

.method public getSampleDependencies()Ljava/util/List;
    .locals 1

    .prologue
    .line 131
    const/4 v0, 0x0

    return-object v0
.end method

.method public getSampleDescriptionBox()Lcom/coremedia/iso/boxes/SampleDescriptionBox;
    .locals 1

    .prologue
    .line 115
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->sampleDescriptionBox:Lcom/coremedia/iso/boxes/SampleDescriptionBox;

    return-object v0
.end method

.method public getSampleDurations()[J
    .locals 1

    .prologue
    .line 119
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->sampleDurations:[J

    return-object v0
.end method

.method public getSamples()Ljava/util/List;
    .locals 1

    .prologue
    .line 111
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->samples:Ljava/util/List;

    return-object v0
.end method

.method public getSyncSamples()[J
    .locals 1

    .prologue
    .line 127
    const/4 v0, 0x0

    return-object v0
.end method

.method public getTrackMetaData()Lcom/googlecode/mp4parser/authoring/TrackMetaData;
    .locals 1

    .prologue
    .line 135
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->trackMetaData:Lcom/googlecode/mp4parser/authoring/TrackMetaData;

    return-object v0
.end method
