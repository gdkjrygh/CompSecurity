.class public Lcom/mp4parser/iso14496/part30/WebVTTTrack;
.super Lcom/googlecode/mp4parser/authoring/AbstractTrack;
.source "SourceFile"


# instance fields
.field sampleEntry:Lcom/mp4parser/iso14496/part30/WebVTTSampleEntry;

.field samples:Ljava/util/List;

.field subs:[Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/googlecode/mp4parser/DataSource;)V
    .locals 4

    .prologue
    .line 27
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/googlecode/mp4parser/authoring/AbstractTrack;-><init>(Ljava/lang/String;)V

    .line 23
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/mp4parser/iso14496/part30/WebVTTTrack;->samples:Ljava/util/List;

    .line 28
    new-instance v0, Lcom/mp4parser/iso14496/part30/WebVTTSampleEntry;

    invoke-direct {v0}, Lcom/mp4parser/iso14496/part30/WebVTTSampleEntry;-><init>()V

    iput-object v0, p0, Lcom/mp4parser/iso14496/part30/WebVTTTrack;->sampleEntry:Lcom/mp4parser/iso14496/part30/WebVTTSampleEntry;

    .line 29
    iget-object v0, p0, Lcom/mp4parser/iso14496/part30/WebVTTTrack;->sampleEntry:Lcom/mp4parser/iso14496/part30/WebVTTSampleEntry;

    new-instance v1, Lcom/mp4parser/iso14496/part30/WebVTTConfigurationBox;

    invoke-direct {v1}, Lcom/mp4parser/iso14496/part30/WebVTTConfigurationBox;-><init>()V

    invoke-virtual {v0, v1}, Lcom/mp4parser/iso14496/part30/WebVTTSampleEntry;->addBox(Lcom/coremedia/iso/boxes/Box;)V

    .line 30
    iget-object v0, p0, Lcom/mp4parser/iso14496/part30/WebVTTTrack;->sampleEntry:Lcom/mp4parser/iso14496/part30/WebVTTSampleEntry;

    new-instance v1, Lcom/mp4parser/iso14496/part30/WebVTTSourceLabelBox;

    invoke-direct {v1}, Lcom/mp4parser/iso14496/part30/WebVTTSourceLabelBox;-><init>()V

    invoke-virtual {v0, v1}, Lcom/mp4parser/iso14496/part30/WebVTTSampleEntry;->addBox(Lcom/coremedia/iso/boxes/Box;)V

    .line 32
    const-wide/16 v0, 0x0

    invoke-interface {p1}, Lcom/googlecode/mp4parser/DataSource;->size()J

    move-result-wide v2

    invoke-static {v2, v3}, Lcom/googlecode/mp4parser/util/CastUtils;->l2i(J)I

    move-result v2

    int-to-long v2, v2

    invoke-interface {p1, v0, v1, v2, v3}, Lcom/googlecode/mp4parser/DataSource;->map(JJ)Ljava/nio/ByteBuffer;

    move-result-object v0

    .line 33
    invoke-interface {p1}, Lcom/googlecode/mp4parser/DataSource;->size()J

    move-result-wide v2

    invoke-static {v2, v3}, Lcom/googlecode/mp4parser/util/CastUtils;->l2i(J)I

    move-result v1

    new-array v1, v1, [B

    .line 34
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 35
    invoke-static {v1}, Lcom/coremedia/iso/Utf8;->convert([B)Ljava/lang/String;

    move-result-object v0

    const-string v1, "\\r?\\n"

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/mp4parser/iso14496/part30/WebVTTTrack;->subs:[Ljava/lang/String;

    .line 39
    const-string v0, ""

    .line 40
    const/4 v1, 0x0

    .line 43
    :goto_0
    iget-object v2, p0, Lcom/mp4parser/iso14496/part30/WebVTTTrack;->subs:[Ljava/lang/String;

    array-length v2, v2

    if-lt v1, v2, :cond_2

    .line 49
    :cond_0
    :goto_1
    iget-object v0, p0, Lcom/mp4parser/iso14496/part30/WebVTTTrack;->subs:[Ljava/lang/String;

    array-length v0, v0

    if-lt v1, v0, :cond_4

    .line 54
    :cond_1
    return-void

    .line 41
    :cond_2
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mp4parser/iso14496/part30/WebVTTTrack;->subs:[Ljava/lang/String;

    aget-object v0, v0, v1

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "\n"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 42
    iget-object v2, p0, Lcom/mp4parser/iso14496/part30/WebVTTTrack;->subs:[Ljava/lang/String;

    add-int/lit8 v3, v1, 0x1

    aget-object v2, v2, v3

    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, p0, Lcom/mp4parser/iso14496/part30/WebVTTTrack;->subs:[Ljava/lang/String;

    add-int/lit8 v3, v1, 0x2

    aget-object v2, v2, v3

    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_0

    .line 43
    :cond_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 48
    :cond_4
    iget-object v0, p0, Lcom/mp4parser/iso14496/part30/WebVTTTrack;->subs:[Ljava/lang/String;

    aget-object v0, v0, v1

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 49
    add-int/lit8 v1, v1, 0x1

    goto :goto_1
.end method


# virtual methods
.method public close()V
    .locals 0

    .prologue
    .line 78
    return-void
.end method

.method public getHandler()Ljava/lang/String;
    .locals 1

    .prologue
    .line 69
    const/4 v0, 0x0

    return-object v0
.end method

.method public getSampleDescriptionBox()Lcom/coremedia/iso/boxes/SampleDescriptionBox;
    .locals 1

    .prologue
    .line 57
    const/4 v0, 0x0

    return-object v0
.end method

.method public getSampleDurations()[J
    .locals 1

    .prologue
    .line 61
    const/4 v0, 0x0

    new-array v0, v0, [J

    return-object v0
.end method

.method public getSamples()Ljava/util/List;
    .locals 1

    .prologue
    .line 73
    const/4 v0, 0x0

    return-object v0
.end method

.method public getTrackMetaData()Lcom/googlecode/mp4parser/authoring/TrackMetaData;
    .locals 1

    .prologue
    .line 65
    const/4 v0, 0x0

    return-object v0
.end method
