.class public Lcom/coremedia/iso/boxes/SampleToChunkBox$Entry;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/coremedia/iso/boxes/SampleToChunkBox;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Entry"
.end annotation


# instance fields
.field firstChunk:J

.field sampleDescriptionIndex:J

.field samplesPerChunk:J


# direct methods
.method public constructor <init>(JJJ)V
    .locals 1

    .prologue
    .line 118
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 119
    iput-wide p1, p0, Lcom/coremedia/iso/boxes/SampleToChunkBox$Entry;->firstChunk:J

    .line 120
    iput-wide p3, p0, Lcom/coremedia/iso/boxes/SampleToChunkBox$Entry;->samplesPerChunk:J

    .line 121
    iput-wide p5, p0, Lcom/coremedia/iso/boxes/SampleToChunkBox$Entry;->sampleDescriptionIndex:J

    .line 122
    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 6

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 159
    if-ne p0, p1, :cond_1

    .line 168
    :cond_0
    :goto_0
    return v0

    .line 160
    :cond_1
    if-eqz p1, :cond_2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_3

    :cond_2
    move v0, v1

    goto :goto_0

    .line 162
    :cond_3
    check-cast p1, Lcom/coremedia/iso/boxes/SampleToChunkBox$Entry;

    .line 164
    iget-wide v2, p0, Lcom/coremedia/iso/boxes/SampleToChunkBox$Entry;->firstChunk:J

    iget-wide v4, p1, Lcom/coremedia/iso/boxes/SampleToChunkBox$Entry;->firstChunk:J

    cmp-long v2, v2, v4

    if-eqz v2, :cond_4

    move v0, v1

    goto :goto_0

    .line 165
    :cond_4
    iget-wide v2, p0, Lcom/coremedia/iso/boxes/SampleToChunkBox$Entry;->sampleDescriptionIndex:J

    iget-wide v4, p1, Lcom/coremedia/iso/boxes/SampleToChunkBox$Entry;->sampleDescriptionIndex:J

    cmp-long v2, v2, v4

    if-eqz v2, :cond_5

    move v0, v1

    goto :goto_0

    .line 166
    :cond_5
    iget-wide v2, p0, Lcom/coremedia/iso/boxes/SampleToChunkBox$Entry;->samplesPerChunk:J

    iget-wide v4, p1, Lcom/coremedia/iso/boxes/SampleToChunkBox$Entry;->samplesPerChunk:J

    cmp-long v2, v2, v4

    if-eqz v2, :cond_0

    move v0, v1

    goto :goto_0
.end method

.method public getFirstChunk()J
    .locals 2

    .prologue
    .line 125
    iget-wide v0, p0, Lcom/coremedia/iso/boxes/SampleToChunkBox$Entry;->firstChunk:J

    return-wide v0
.end method

.method public getSampleDescriptionIndex()J
    .locals 2

    .prologue
    .line 141
    iget-wide v0, p0, Lcom/coremedia/iso/boxes/SampleToChunkBox$Entry;->sampleDescriptionIndex:J

    return-wide v0
.end method

.method public getSamplesPerChunk()J
    .locals 2

    .prologue
    .line 133
    iget-wide v0, p0, Lcom/coremedia/iso/boxes/SampleToChunkBox$Entry;->samplesPerChunk:J

    return-wide v0
.end method

.method public hashCode()I
    .locals 7

    .prologue
    const/16 v6, 0x20

    .line 173
    iget-wide v0, p0, Lcom/coremedia/iso/boxes/SampleToChunkBox$Entry;->firstChunk:J

    iget-wide v2, p0, Lcom/coremedia/iso/boxes/SampleToChunkBox$Entry;->firstChunk:J

    ushr-long/2addr v2, v6

    xor-long/2addr v0, v2

    long-to-int v0, v0

    .line 174
    mul-int/lit8 v0, v0, 0x1f

    iget-wide v2, p0, Lcom/coremedia/iso/boxes/SampleToChunkBox$Entry;->samplesPerChunk:J

    iget-wide v4, p0, Lcom/coremedia/iso/boxes/SampleToChunkBox$Entry;->samplesPerChunk:J

    ushr-long/2addr v4, v6

    xor-long/2addr v2, v4

    long-to-int v1, v2

    add-int/2addr v0, v1

    .line 175
    mul-int/lit8 v0, v0, 0x1f

    iget-wide v2, p0, Lcom/coremedia/iso/boxes/SampleToChunkBox$Entry;->sampleDescriptionIndex:J

    iget-wide v4, p0, Lcom/coremedia/iso/boxes/SampleToChunkBox$Entry;->sampleDescriptionIndex:J

    ushr-long/2addr v4, v6

    xor-long/2addr v2, v4

    long-to-int v1, v2

    add-int/2addr v0, v1

    .line 176
    return v0
.end method

.method public setFirstChunk(J)V
    .locals 1

    .prologue
    .line 129
    iput-wide p1, p0, Lcom/coremedia/iso/boxes/SampleToChunkBox$Entry;->firstChunk:J

    .line 130
    return-void
.end method

.method public setSampleDescriptionIndex(J)V
    .locals 1

    .prologue
    .line 145
    iput-wide p1, p0, Lcom/coremedia/iso/boxes/SampleToChunkBox$Entry;->sampleDescriptionIndex:J

    .line 146
    return-void
.end method

.method public setSamplesPerChunk(J)V
    .locals 1

    .prologue
    .line 137
    iput-wide p1, p0, Lcom/coremedia/iso/boxes/SampleToChunkBox$Entry;->samplesPerChunk:J

    .line 138
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .prologue
    .line 150
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Entry{firstChunk="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 151
    iget-wide v2, p0, Lcom/coremedia/iso/boxes/SampleToChunkBox$Entry;->firstChunk:J

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 152
    const-string v1, ", samplesPerChunk="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v2, p0, Lcom/coremedia/iso/boxes/SampleToChunkBox$Entry;->samplesPerChunk:J

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 153
    const-string v1, ", sampleDescriptionIndex="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v2, p0, Lcom/coremedia/iso/boxes/SampleToChunkBox$Entry;->sampleDescriptionIndex:J

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 154
    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 150
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
