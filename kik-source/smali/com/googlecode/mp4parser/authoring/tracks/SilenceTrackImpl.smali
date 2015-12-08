.class public Lcom/googlecode/mp4parser/authoring/tracks/SilenceTrackImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/googlecode/mp4parser/authoring/Track;


# instance fields
.field decodingTimes:[J

.field name:Ljava/lang/String;

.field samples:Ljava/util/List;

.field source:Lcom/googlecode/mp4parser/authoring/Track;


# direct methods
.method public constructor <init>(Lcom/googlecode/mp4parser/authoring/Track;J)V
    .locals 8

    .prologue
    const-wide/16 v6, 0x3e8

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/SilenceTrackImpl;->samples:Ljava/util/List;

    .line 30
    iput-object p1, p0, Lcom/googlecode/mp4parser/authoring/tracks/SilenceTrackImpl;->source:Lcom/googlecode/mp4parser/authoring/Track;

    .line 31
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "ms silence"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/SilenceTrackImpl;->name:Ljava/lang/String;

    .line 32
    const-string v0, "mp4a"

    invoke-interface {p1}, Lcom/googlecode/mp4parser/authoring/Track;->getSampleDescriptionBox()Lcom/coremedia/iso/boxes/SampleDescriptionBox;

    move-result-object v1

    invoke-virtual {v1}, Lcom/coremedia/iso/boxes/SampleDescriptionBox;->getSampleEntry()Lcom/coremedia/iso/boxes/sampleentry/AbstractSampleEntry;

    move-result-object v1

    invoke-virtual {v1}, Lcom/coremedia/iso/boxes/sampleentry/AbstractSampleEntry;->getType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 33
    invoke-virtual {p0}, Lcom/googlecode/mp4parser/authoring/tracks/SilenceTrackImpl;->getTrackMetaData()Lcom/googlecode/mp4parser/authoring/TrackMetaData;

    move-result-object v0

    invoke-virtual {v0}, Lcom/googlecode/mp4parser/authoring/TrackMetaData;->getTimescale()J

    move-result-wide v0

    mul-long/2addr v0, p2

    div-long/2addr v0, v6

    const-wide/16 v2, 0x400

    div-long/2addr v0, v2

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/CastUtils;->l2i(J)I

    move-result v0

    .line 34
    new-array v1, v0, [J

    iput-object v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/SilenceTrackImpl;->decodingTimes:[J

    .line 35
    iget-object v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/SilenceTrackImpl;->decodingTimes:[J

    invoke-virtual {p0}, Lcom/googlecode/mp4parser/authoring/tracks/SilenceTrackImpl;->getTrackMetaData()Lcom/googlecode/mp4parser/authoring/TrackMetaData;

    move-result-object v2

    invoke-virtual {v2}, Lcom/googlecode/mp4parser/authoring/TrackMetaData;->getTimescale()J

    move-result-wide v2

    mul-long/2addr v2, p2

    int-to-long v4, v0

    div-long/2addr v2, v4

    div-long/2addr v2, v6

    invoke-static {v1, v2, v3}, Ljava/util/Arrays;->fill([JJ)V

    .line 37
    :goto_0
    add-int/lit8 v1, v0, -0x1

    if-gtz v0, :cond_0

    .line 43
    return-void

    .line 38
    :cond_0
    iget-object v2, p0, Lcom/googlecode/mp4parser/authoring/tracks/SilenceTrackImpl;->samples:Ljava/util/List;

    new-instance v3, Lcom/googlecode/mp4parser/authoring/SampleImpl;

    const/4 v0, 0x6

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    invoke-static {v0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v0

    .line 40
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    move-result-object v0

    check-cast v0, Ljava/nio/ByteBuffer;

    invoke-direct {v3, v0}, Lcom/googlecode/mp4parser/authoring/SampleImpl;-><init>(Ljava/nio/ByteBuffer;)V

    .line 38
    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move v0, v1

    goto :goto_0

    .line 44
    :cond_1
    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Tracks of type "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " are not supported"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 38
    nop

    :array_0
    .array-data 1
        0x21t
        0x10t
        0x4t
        0x60t
        -0x74t
        0x1ct
    .end array-data
.end method


# virtual methods
.method public close()V
    .locals 0

    .prologue
    .line 50
    return-void
.end method

.method public getCompositionTimeEntries()Ljava/util/List;
    .locals 1

    .prologue
    .line 86
    const/4 v0, 0x0

    return-object v0
.end method

.method public getDuration()J
    .locals 8

    .prologue
    .line 61
    const-wide/16 v2, 0x0

    .line 62
    iget-object v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/SilenceTrackImpl;->decodingTimes:[J

    array-length v4, v1

    const/4 v0, 0x0

    :goto_0
    if-lt v0, v4, :cond_0

    .line 65
    return-wide v2

    .line 62
    :cond_0
    aget-wide v6, v1, v0

    .line 63
    add-long/2addr v2, v6

    .line 62
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method public getEdits()Ljava/util/List;
    .locals 1

    .prologue
    .line 102
    const/4 v0, 0x0

    return-object v0
.end method

.method public getHandler()Ljava/lang/String;
    .locals 1

    .prologue
    .line 73
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/SilenceTrackImpl;->source:Lcom/googlecode/mp4parser/authoring/Track;

    invoke-interface {v0}, Lcom/googlecode/mp4parser/authoring/Track;->getHandler()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .prologue
    .line 98
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/SilenceTrackImpl;->name:Ljava/lang/String;

    return-object v0
.end method

.method public getSampleDependencies()Ljava/util/List;
    .locals 1

    .prologue
    .line 94
    const/4 v0, 0x0

    return-object v0
.end method

.method public getSampleDescriptionBox()Lcom/coremedia/iso/boxes/SampleDescriptionBox;
    .locals 1

    .prologue
    .line 53
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/SilenceTrackImpl;->source:Lcom/googlecode/mp4parser/authoring/Track;

    invoke-interface {v0}, Lcom/googlecode/mp4parser/authoring/Track;->getSampleDescriptionBox()Lcom/coremedia/iso/boxes/SampleDescriptionBox;

    move-result-object v0

    return-object v0
.end method

.method public getSampleDurations()[J
    .locals 1

    .prologue
    .line 57
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/SilenceTrackImpl;->decodingTimes:[J

    return-object v0
.end method

.method public getSampleGroups()Ljava/util/Map;
    .locals 1

    .prologue
    .line 106
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/SilenceTrackImpl;->source:Lcom/googlecode/mp4parser/authoring/Track;

    invoke-interface {v0}, Lcom/googlecode/mp4parser/authoring/Track;->getSampleGroups()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public getSamples()Ljava/util/List;
    .locals 1

    .prologue
    .line 78
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/SilenceTrackImpl;->samples:Ljava/util/List;

    return-object v0
.end method

.method public getSubsampleInformationBox()Lcom/coremedia/iso/boxes/SubSampleInformationBox;
    .locals 1

    .prologue
    .line 82
    const/4 v0, 0x0

    return-object v0
.end method

.method public getSyncSamples()[J
    .locals 1

    .prologue
    .line 90
    const/4 v0, 0x0

    return-object v0
.end method

.method public getTrackMetaData()Lcom/googlecode/mp4parser/authoring/TrackMetaData;
    .locals 1

    .prologue
    .line 69
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/SilenceTrackImpl;->source:Lcom/googlecode/mp4parser/authoring/Track;

    invoke-interface {v0}, Lcom/googlecode/mp4parser/authoring/Track;->getTrackMetaData()Lcom/googlecode/mp4parser/authoring/TrackMetaData;

    move-result-object v0

    return-object v0
.end method
