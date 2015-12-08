.class public interface abstract Lcom/googlecode/mp4parser/authoring/Track;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# virtual methods
.method public abstract getCompositionTimeEntries()Ljava/util/List;
.end method

.method public abstract getDuration()J
.end method

.method public abstract getEdits()Ljava/util/List;
.end method

.method public abstract getHandler()Ljava/lang/String;
.end method

.method public abstract getName()Ljava/lang/String;
.end method

.method public abstract getSampleDependencies()Ljava/util/List;
.end method

.method public abstract getSampleDescriptionBox()Lcom/coremedia/iso/boxes/SampleDescriptionBox;
.end method

.method public abstract getSampleDurations()[J
.end method

.method public abstract getSampleGroups()Ljava/util/Map;
.end method

.method public abstract getSamples()Ljava/util/List;
.end method

.method public abstract getSubsampleInformationBox()Lcom/coremedia/iso/boxes/SubSampleInformationBox;
.end method

.method public abstract getSyncSamples()[J
.end method

.method public abstract getTrackMetaData()Lcom/googlecode/mp4parser/authoring/TrackMetaData;
.end method
