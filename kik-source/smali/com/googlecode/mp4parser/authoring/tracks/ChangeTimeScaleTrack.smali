.class public Lcom/googlecode/mp4parser/authoring/tracks/ChangeTimeScaleTrack;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/googlecode/mp4parser/authoring/Track;


# static fields
.field private static final LOG:Ljava/util/logging/Logger;


# instance fields
.field ctts:Ljava/util/List;

.field decodingTimes:[J

.field source:Lcom/googlecode/mp4parser/authoring/Track;

.field timeScale:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 39
    const-class v0, Lcom/googlecode/mp4parser/authoring/tracks/ChangeTimeScaleTrack;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, Lcom/googlecode/mp4parser/authoring/tracks/ChangeTimeScaleTrack;->LOG:Ljava/util/logging/Logger;

    return-void
.end method

.method public constructor <init>(Lcom/googlecode/mp4parser/authoring/Track;J[J)V
    .locals 4

    .prologue
    .line 54
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 55
    iput-object p1, p0, Lcom/googlecode/mp4parser/authoring/tracks/ChangeTimeScaleTrack;->source:Lcom/googlecode/mp4parser/authoring/Track;

    .line 56
    iput-wide p2, p0, Lcom/googlecode/mp4parser/authoring/tracks/ChangeTimeScaleTrack;->timeScale:J

    .line 57
    long-to-double v0, p2

    invoke-interface {p1}, Lcom/googlecode/mp4parser/authoring/Track;->getTrackMetaData()Lcom/googlecode/mp4parser/authoring/TrackMetaData;

    move-result-object v2

    invoke-virtual {v2}, Lcom/googlecode/mp4parser/authoring/TrackMetaData;->getTimescale()J

    move-result-wide v2

    long-to-double v2, v2

    div-double/2addr v0, v2

    .line 58
    invoke-interface {p1}, Lcom/googlecode/mp4parser/authoring/Track;->getCompositionTimeEntries()Ljava/util/List;

    move-result-object v2

    invoke-static {v2, v0, v1}, Lcom/googlecode/mp4parser/authoring/tracks/ChangeTimeScaleTrack;->adjustCtts(Ljava/util/List;D)Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, Lcom/googlecode/mp4parser/authoring/tracks/ChangeTimeScaleTrack;->ctts:Ljava/util/List;

    .line 59
    invoke-interface {p1}, Lcom/googlecode/mp4parser/authoring/Track;->getSampleDurations()[J

    move-result-object v2

    invoke-static {p1, p4, p2, p3}, Lcom/googlecode/mp4parser/authoring/tracks/ChangeTimeScaleTrack;->getTimes(Lcom/googlecode/mp4parser/authoring/Track;[JJ)[J

    move-result-object v3

    invoke-static {v2, v0, v1, p4, v3}, Lcom/googlecode/mp4parser/authoring/tracks/ChangeTimeScaleTrack;->adjustTts([JD[J[J)[J

    move-result-object v0

    iput-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/ChangeTimeScaleTrack;->decodingTimes:[J

    .line 60
    return-void
.end method

.method static adjustCtts(Ljava/util/List;D)Ljava/util/List;
    .locals 9

    .prologue
    .line 90
    if-eqz p0, :cond_1

    .line 91
    new-instance v1, Ljava/util/ArrayList;

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 92
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_0

    move-object v0, v1

    .line 97
    :goto_1
    return-object v0

    .line 92
    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/coremedia/iso/boxes/CompositionTimeToSample$Entry;

    .line 93
    new-instance v3, Lcom/coremedia/iso/boxes/CompositionTimeToSample$Entry;

    invoke-virtual {v0}, Lcom/coremedia/iso/boxes/CompositionTimeToSample$Entry;->getCount()I

    move-result v4

    invoke-virtual {v0}, Lcom/coremedia/iso/boxes/CompositionTimeToSample$Entry;->getOffset()I

    move-result v0

    int-to-double v6, v0

    mul-double/2addr v6, p1

    invoke-static {v6, v7}, Ljava/lang/Math;->round(D)J

    move-result-wide v6

    long-to-int v0, v6

    invoke-direct {v3, v4, v0}, Lcom/coremedia/iso/boxes/CompositionTimeToSample$Entry;-><init>(II)V

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 97
    :cond_1
    const/4 v0, 0x0

    goto :goto_1
.end method

.method static adjustTts([JD[J[J)[J
    .locals 19

    .prologue
    .line 104
    const-wide/16 v4, 0x0

    .line 106
    move-object/from16 v0, p0

    array-length v2, v0

    new-array v3, v2, [J

    .line 108
    const/4 v2, 0x1

    :goto_0
    move-object/from16 v0, p0

    array-length v6, v0

    if-le v2, v6, :cond_0

    .line 125
    return-object v3

    .line 109
    :cond_0
    add-int/lit8 v6, v2, -0x1

    aget-wide v6, p0, v6

    .line 111
    long-to-double v6, v6

    mul-double v6, v6, p1

    invoke-static {v6, v7}, Ljava/lang/Math;->round(D)J

    move-result-wide v6

    .line 114
    add-int/lit8 v8, v2, 0x1

    int-to-long v8, v8

    move-object/from16 v0, p3

    invoke-static {v0, v8, v9}, Ljava/util/Arrays;->binarySearch([JJ)I

    move-result v8

    if-ltz v8, :cond_1

    .line 116
    aget-wide v10, p4, v8

    cmp-long v9, v10, v4

    if-eqz v9, :cond_1

    .line 117
    aget-wide v10, p4, v8

    add-long v12, v4, v6

    sub-long/2addr v10, v12

    .line 118
    sget-object v9, Lcom/googlecode/mp4parser/authoring/tracks/ChangeTimeScaleTrack;->LOG:Ljava/util/logging/Logger;

    const-string v12, "Sample %d %d / %d - correct by %d"

    const/4 v13, 0x4

    new-array v13, v13, [Ljava/lang/Object;

    const/4 v14, 0x0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    aput-object v15, v13, v14

    const/4 v14, 0x1

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v15

    aput-object v15, v13, v14

    const/4 v14, 0x2

    aget-wide v16, p4, v8

    invoke-static/range {v16 .. v17}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    aput-object v8, v13, v14

    const/4 v8, 0x3

    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v14

    aput-object v14, v13, v8

    invoke-static {v12, v13}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v9, v8}, Ljava/util/logging/Logger;->finest(Ljava/lang/String;)V

    .line 119
    add-long/2addr v6, v10

    .line 122
    :cond_1
    add-long/2addr v4, v6

    .line 123
    add-int/lit8 v8, v2, -0x1

    aput-wide v6, v3, v8

    .line 108
    add-int/lit8 v2, v2, 0x1

    goto :goto_0
.end method

.method private static getTimes(Lcom/googlecode/mp4parser/authoring/Track;[JJ)[J
    .locals 10

    .prologue
    .line 63
    array-length v0, p1

    new-array v5, v0, [J

    .line 65
    const/4 v1, 0x1

    .line 66
    const-wide/16 v2, 0x0

    .line 67
    const/4 v0, 0x0

    .line 70
    :goto_0
    int-to-long v6, v1

    array-length v4, p1

    add-int/lit8 v4, v4, -0x1

    aget-wide v8, p1, v4

    cmp-long v4, v6, v8

    if-lez v4, :cond_0

    .line 77
    return-object v5

    .line 71
    :cond_0
    int-to-long v6, v1

    aget-wide v8, p1, v0

    cmp-long v4, v6, v8

    if-nez v4, :cond_1

    .line 72
    add-int/lit8 v4, v0, 0x1

    mul-long v6, v2, p2

    invoke-interface {p0}, Lcom/googlecode/mp4parser/authoring/Track;->getTrackMetaData()Lcom/googlecode/mp4parser/authoring/TrackMetaData;

    move-result-object v8

    invoke-virtual {v8}, Lcom/googlecode/mp4parser/authoring/TrackMetaData;->getTimescale()J

    move-result-wide v8

    div-long/2addr v6, v8

    aput-wide v6, v5, v0

    move v0, v4

    .line 74
    :cond_1
    invoke-interface {p0}, Lcom/googlecode/mp4parser/authoring/Track;->getSampleDurations()[J

    move-result-object v4

    add-int/lit8 v6, v1, -0x1

    aget-wide v6, v4, v6

    add-long/2addr v2, v6

    .line 75
    add-int/lit8 v1, v1, 0x1

    goto :goto_0
.end method


# virtual methods
.method public close()V
    .locals 1

    .prologue
    .line 129
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/ChangeTimeScaleTrack;->source:Lcom/googlecode/mp4parser/authoring/Track;

    invoke-interface {v0}, Lcom/googlecode/mp4parser/authoring/Track;->close()V

    .line 130
    return-void
.end method

.method public getCompositionTimeEntries()Ljava/util/List;
    .locals 1

    .prologue
    .line 141
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/ChangeTimeScaleTrack;->ctts:Ljava/util/List;

    return-object v0
.end method

.method public getDuration()J
    .locals 8

    .prologue
    .line 171
    const-wide/16 v2, 0x0

    .line 172
    iget-object v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/ChangeTimeScaleTrack;->decodingTimes:[J

    array-length v4, v1

    const/4 v0, 0x0

    :goto_0
    if-lt v0, v4, :cond_0

    .line 175
    return-wide v2

    .line 172
    :cond_0
    aget-wide v6, v1, v0

    .line 173
    add-long/2addr v2, v6

    .line 172
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method public getEdits()Ljava/util/List;
    .locals 1

    .prologue
    .line 190
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/ChangeTimeScaleTrack;->source:Lcom/googlecode/mp4parser/authoring/Track;

    invoke-interface {v0}, Lcom/googlecode/mp4parser/authoring/Track;->getEdits()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getHandler()Ljava/lang/String;
    .locals 1

    .prologue
    .line 159
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/ChangeTimeScaleTrack;->source:Lcom/googlecode/mp4parser/authoring/Track;

    invoke-interface {v0}, Lcom/googlecode/mp4parser/authoring/Track;->getHandler()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 2

    .prologue
    .line 186
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "timeScale("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/ChangeTimeScaleTrack;->source:Lcom/googlecode/mp4parser/authoring/Track;

    invoke-interface {v1}, Lcom/googlecode/mp4parser/authoring/Track;->getName()Ljava/lang/String;

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

.method public getSampleDependencies()Ljava/util/List;
    .locals 1

    .prologue
    .line 149
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/ChangeTimeScaleTrack;->source:Lcom/googlecode/mp4parser/authoring/Track;

    invoke-interface {v0}, Lcom/googlecode/mp4parser/authoring/Track;->getSampleDependencies()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getSampleDescriptionBox()Lcom/coremedia/iso/boxes/SampleDescriptionBox;
    .locals 1

    .prologue
    .line 133
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/ChangeTimeScaleTrack;->source:Lcom/googlecode/mp4parser/authoring/Track;

    invoke-interface {v0}, Lcom/googlecode/mp4parser/authoring/Track;->getSampleDescriptionBox()Lcom/coremedia/iso/boxes/SampleDescriptionBox;

    move-result-object v0

    return-object v0
.end method

.method public getSampleDurations()[J
    .locals 1

    .prologue
    .line 137
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/ChangeTimeScaleTrack;->decodingTimes:[J

    return-object v0
.end method

.method public getSampleGroups()Ljava/util/Map;
    .locals 1

    .prologue
    .line 194
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/ChangeTimeScaleTrack;->source:Lcom/googlecode/mp4parser/authoring/Track;

    invoke-interface {v0}, Lcom/googlecode/mp4parser/authoring/Track;->getSampleGroups()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public getSamples()Ljava/util/List;
    .locals 1

    .prologue
    .line 163
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/ChangeTimeScaleTrack;->source:Lcom/googlecode/mp4parser/authoring/Track;

    invoke-interface {v0}, Lcom/googlecode/mp4parser/authoring/Track;->getSamples()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getSubsampleInformationBox()Lcom/coremedia/iso/boxes/SubSampleInformationBox;
    .locals 1

    .prologue
    .line 167
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/ChangeTimeScaleTrack;->source:Lcom/googlecode/mp4parser/authoring/Track;

    invoke-interface {v0}, Lcom/googlecode/mp4parser/authoring/Track;->getSubsampleInformationBox()Lcom/coremedia/iso/boxes/SubSampleInformationBox;

    move-result-object v0

    return-object v0
.end method

.method public getSyncSamples()[J
    .locals 1

    .prologue
    .line 145
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/ChangeTimeScaleTrack;->source:Lcom/googlecode/mp4parser/authoring/Track;

    invoke-interface {v0}, Lcom/googlecode/mp4parser/authoring/Track;->getSyncSamples()[J

    move-result-object v0

    return-object v0
.end method

.method public getTrackMetaData()Lcom/googlecode/mp4parser/authoring/TrackMetaData;
    .locals 4

    .prologue
    .line 153
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/ChangeTimeScaleTrack;->source:Lcom/googlecode/mp4parser/authoring/Track;

    invoke-interface {v0}, Lcom/googlecode/mp4parser/authoring/Track;->getTrackMetaData()Lcom/googlecode/mp4parser/authoring/TrackMetaData;

    move-result-object v0

    invoke-virtual {v0}, Lcom/googlecode/mp4parser/authoring/TrackMetaData;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/googlecode/mp4parser/authoring/TrackMetaData;

    .line 154
    iget-wide v2, p0, Lcom/googlecode/mp4parser/authoring/tracks/ChangeTimeScaleTrack;->timeScale:J

    invoke-virtual {v0, v2, v3}, Lcom/googlecode/mp4parser/authoring/TrackMetaData;->setTimescale(J)V

    .line 155
    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 180
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "ChangeTimeScaleTrack{source="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 181
    iget-object v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/ChangeTimeScaleTrack;->source:Lcom/googlecode/mp4parser/authoring/Track;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 182
    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 180
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
