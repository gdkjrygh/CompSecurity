.class public abstract Lcom/googlecode/mp4parser/authoring/AbstractTrack;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/googlecode/mp4parser/authoring/Track;


# instance fields
.field edits:Ljava/util/List;

.field name:Ljava/lang/String;

.field sampleGroups:Ljava/util/Map;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/googlecode/mp4parser/authoring/AbstractTrack;->edits:Ljava/util/List;

    .line 35
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/googlecode/mp4parser/authoring/AbstractTrack;->sampleGroups:Ljava/util/Map;

    .line 38
    iput-object p1, p0, Lcom/googlecode/mp4parser/authoring/AbstractTrack;->name:Ljava/lang/String;

    .line 39
    return-void
.end method


# virtual methods
.method public getCompositionTimeEntries()Ljava/util/List;
    .locals 1

    .prologue
    .line 42
    const/4 v0, 0x0

    return-object v0
.end method

.method public getDuration()J
    .locals 8

    .prologue
    .line 58
    const-wide/16 v2, 0x0

    .line 59
    invoke-virtual {p0}, Lcom/googlecode/mp4parser/authoring/AbstractTrack;->getSampleDurations()[J

    move-result-object v1

    array-length v4, v1

    const/4 v0, 0x0

    :goto_0
    if-lt v0, v4, :cond_0

    .line 62
    return-wide v2

    .line 59
    :cond_0
    aget-wide v6, v1, v0

    .line 60
    add-long/2addr v2, v6

    .line 59
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method public getEdits()Ljava/util/List;
    .locals 1

    .prologue
    .line 70
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/AbstractTrack;->edits:Ljava/util/List;

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .prologue
    .line 66
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/AbstractTrack;->name:Ljava/lang/String;

    return-object v0
.end method

.method public getSampleDependencies()Ljava/util/List;
    .locals 1

    .prologue
    .line 50
    const/4 v0, 0x0

    return-object v0
.end method

.method public getSampleGroups()Ljava/util/Map;
    .locals 1

    .prologue
    .line 74
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/AbstractTrack;->sampleGroups:Ljava/util/Map;

    return-object v0
.end method

.method public getSubsampleInformationBox()Lcom/coremedia/iso/boxes/SubSampleInformationBox;
    .locals 1

    .prologue
    .line 54
    const/4 v0, 0x0

    return-object v0
.end method

.method public getSyncSamples()[J
    .locals 1

    .prologue
    .line 46
    const/4 v0, 0x0

    return-object v0
.end method
