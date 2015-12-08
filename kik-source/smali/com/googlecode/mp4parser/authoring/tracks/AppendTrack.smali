.class public Lcom/googlecode/mp4parser/authoring/tracks/AppendTrack;
.super Lcom/googlecode/mp4parser/authoring/AbstractTrack;
.source "SourceFile"


# static fields
.field private static LOG:Lcom/googlecode/mp4parser/util/Logger;


# instance fields
.field stsd:Lcom/coremedia/iso/boxes/SampleDescriptionBox;

.field tracks:[Lcom/googlecode/mp4parser/authoring/Track;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 43
    const-class v0, Lcom/googlecode/mp4parser/authoring/tracks/AppendTrack;

    invoke-static {v0}, Lcom/googlecode/mp4parser/util/Logger;->getLogger(Ljava/lang/Class;)Lcom/googlecode/mp4parser/util/Logger;

    move-result-object v0

    sput-object v0, Lcom/googlecode/mp4parser/authoring/tracks/AppendTrack;->LOG:Lcom/googlecode/mp4parser/util/Logger;

    return-void
.end method

.method public varargs constructor <init>([Lcom/googlecode/mp4parser/authoring/Track;)V
    .locals 6

    .prologue
    const/4 v2, 0x0

    .line 56
    invoke-static {p1}, Lcom/googlecode/mp4parser/authoring/tracks/AppendTrack;->appendTracknames([Lcom/googlecode/mp4parser/authoring/Track;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/googlecode/mp4parser/authoring/AbstractTrack;-><init>(Ljava/lang/String;)V

    .line 57
    iput-object p1, p0, Lcom/googlecode/mp4parser/authoring/tracks/AppendTrack;->tracks:[Lcom/googlecode/mp4parser/authoring/Track;

    .line 59
    array-length v3, p1

    move v1, v2

    :goto_0
    if-lt v1, v3, :cond_0

    .line 69
    return-void

    .line 59
    :cond_0
    aget-object v0, p1, v1

    .line 61
    iget-object v4, p0, Lcom/googlecode/mp4parser/authoring/tracks/AppendTrack;->stsd:Lcom/coremedia/iso/boxes/SampleDescriptionBox;

    if-nez v4, :cond_1

    .line 62
    new-instance v4, Lcom/coremedia/iso/boxes/SampleDescriptionBox;

    invoke-direct {v4}, Lcom/coremedia/iso/boxes/SampleDescriptionBox;-><init>()V

    iput-object v4, p0, Lcom/googlecode/mp4parser/authoring/tracks/AppendTrack;->stsd:Lcom/coremedia/iso/boxes/SampleDescriptionBox;

    .line 63
    iget-object v4, p0, Lcom/googlecode/mp4parser/authoring/tracks/AppendTrack;->stsd:Lcom/coremedia/iso/boxes/SampleDescriptionBox;

    invoke-interface {v0}, Lcom/googlecode/mp4parser/authoring/Track;->getSampleDescriptionBox()Lcom/coremedia/iso/boxes/SampleDescriptionBox;

    move-result-object v0

    const-class v5, Lcom/coremedia/iso/boxes/sampleentry/SampleEntry;

    invoke-virtual {v0, v5}, Lcom/coremedia/iso/boxes/SampleDescriptionBox;->getBoxes(Ljava/lang/Class;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/coremedia/iso/boxes/Box;

    invoke-virtual {v4, v0}, Lcom/coremedia/iso/boxes/SampleDescriptionBox;->addBox(Lcom/coremedia/iso/boxes/Box;)V

    .line 59
    :goto_1
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 65
    :cond_1
    iget-object v4, p0, Lcom/googlecode/mp4parser/authoring/tracks/AppendTrack;->stsd:Lcom/coremedia/iso/boxes/SampleDescriptionBox;

    invoke-interface {v0}, Lcom/googlecode/mp4parser/authoring/Track;->getSampleDescriptionBox()Lcom/coremedia/iso/boxes/SampleDescriptionBox;

    move-result-object v0

    invoke-direct {p0, v4, v0}, Lcom/googlecode/mp4parser/authoring/tracks/AppendTrack;->mergeStsds(Lcom/coremedia/iso/boxes/SampleDescriptionBox;Lcom/coremedia/iso/boxes/SampleDescriptionBox;)Lcom/coremedia/iso/boxes/SampleDescriptionBox;

    move-result-object v0

    iput-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/AppendTrack;->stsd:Lcom/coremedia/iso/boxes/SampleDescriptionBox;

    goto :goto_1
.end method

.method public static varargs appendTracknames([Lcom/googlecode/mp4parser/authoring/Track;)Ljava/lang/String;
    .locals 6

    .prologue
    const/4 v1, 0x0

    .line 48
    const-string v0, ""

    .line 49
    array-length v3, p0

    move-object v2, v0

    move v0, v1

    :goto_0
    if-lt v0, v3, :cond_0

    .line 52
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x3

    invoke-virtual {v2, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 49
    :cond_0
    aget-object v4, p0, v0

    .line 50
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v5, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {v4}, Lcom/googlecode/mp4parser/authoring/Track;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v4, " + "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 49
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method private mergeAudioSampleEntries(Lcom/coremedia/iso/boxes/sampleentry/AudioSampleEntry;Lcom/coremedia/iso/boxes/sampleentry/AudioSampleEntry;)Lcom/coremedia/iso/boxes/sampleentry/AudioSampleEntry;
    .locals 9

    .prologue
    const/4 v3, 0x0

    .line 193
    new-instance v4, Lcom/coremedia/iso/boxes/sampleentry/AudioSampleEntry;

    invoke-virtual {p2}, Lcom/coremedia/iso/boxes/sampleentry/AudioSampleEntry;->getType()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v4, v0}, Lcom/coremedia/iso/boxes/sampleentry/AudioSampleEntry;-><init>(Ljava/lang/String;)V

    .line 194
    invoke-virtual {p1}, Lcom/coremedia/iso/boxes/sampleentry/AudioSampleEntry;->getBytesPerFrame()J

    move-result-wide v0

    invoke-virtual {p2}, Lcom/coremedia/iso/boxes/sampleentry/AudioSampleEntry;->getBytesPerFrame()J

    move-result-wide v6

    cmp-long v0, v0, v6

    if-nez v0, :cond_2

    .line 195
    sget-object v0, Lcom/googlecode/mp4parser/authoring/tracks/AppendTrack;->LOG:Lcom/googlecode/mp4parser/util/Logger;

    const-string v1, "BytesPerFrame differ"

    invoke-virtual {v0, v1}, Lcom/googlecode/mp4parser/util/Logger;->logError(Ljava/lang/String;)V

    .line 196
    invoke-virtual {p1}, Lcom/coremedia/iso/boxes/sampleentry/AudioSampleEntry;->getBytesPerFrame()J

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lcom/coremedia/iso/boxes/sampleentry/AudioSampleEntry;->setBytesPerFrame(J)V

    .line 200
    invoke-virtual {p1}, Lcom/coremedia/iso/boxes/sampleentry/AudioSampleEntry;->getBytesPerPacket()J

    move-result-wide v0

    invoke-virtual {p2}, Lcom/coremedia/iso/boxes/sampleentry/AudioSampleEntry;->getBytesPerPacket()J

    move-result-wide v6

    cmp-long v0, v0, v6

    if-nez v0, :cond_3

    .line 201
    invoke-virtual {p1}, Lcom/coremedia/iso/boxes/sampleentry/AudioSampleEntry;->getBytesPerPacket()J

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lcom/coremedia/iso/boxes/sampleentry/AudioSampleEntry;->setBytesPerPacket(J)V

    .line 205
    invoke-virtual {p1}, Lcom/coremedia/iso/boxes/sampleentry/AudioSampleEntry;->getBytesPerSample()J

    move-result-wide v0

    invoke-virtual {p2}, Lcom/coremedia/iso/boxes/sampleentry/AudioSampleEntry;->getBytesPerSample()J

    move-result-wide v6

    cmp-long v0, v0, v6

    if-nez v0, :cond_4

    .line 206
    sget-object v0, Lcom/googlecode/mp4parser/authoring/tracks/AppendTrack;->LOG:Lcom/googlecode/mp4parser/util/Logger;

    const-string v1, "BytesPerSample differ"

    invoke-virtual {v0, v1}, Lcom/googlecode/mp4parser/util/Logger;->logError(Ljava/lang/String;)V

    .line 207
    invoke-virtual {p1}, Lcom/coremedia/iso/boxes/sampleentry/AudioSampleEntry;->getBytesPerSample()J

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lcom/coremedia/iso/boxes/sampleentry/AudioSampleEntry;->setBytesPerSample(J)V

    .line 211
    invoke-virtual {p1}, Lcom/coremedia/iso/boxes/sampleentry/AudioSampleEntry;->getChannelCount()I

    move-result v0

    invoke-virtual {p2}, Lcom/coremedia/iso/boxes/sampleentry/AudioSampleEntry;->getChannelCount()I

    move-result v1

    if-ne v0, v1, :cond_5

    .line 212
    sget-object v0, Lcom/googlecode/mp4parser/authoring/tracks/AppendTrack;->LOG:Lcom/googlecode/mp4parser/util/Logger;

    const-string v1, "ChannelCount differ"

    invoke-virtual {v0, v1}, Lcom/googlecode/mp4parser/util/Logger;->logError(Ljava/lang/String;)V

    .line 213
    invoke-virtual {p1}, Lcom/coremedia/iso/boxes/sampleentry/AudioSampleEntry;->getChannelCount()I

    move-result v0

    invoke-virtual {v4, v0}, Lcom/coremedia/iso/boxes/sampleentry/AudioSampleEntry;->setChannelCount(I)V

    .line 217
    invoke-virtual {p1}, Lcom/coremedia/iso/boxes/sampleentry/AudioSampleEntry;->getPacketSize()I

    move-result v0

    invoke-virtual {p2}, Lcom/coremedia/iso/boxes/sampleentry/AudioSampleEntry;->getPacketSize()I

    move-result v1

    if-ne v0, v1, :cond_6

    .line 218
    invoke-virtual {p1}, Lcom/coremedia/iso/boxes/sampleentry/AudioSampleEntry;->getPacketSize()I

    move-result v0

    invoke-virtual {v4, v0}, Lcom/coremedia/iso/boxes/sampleentry/AudioSampleEntry;->setPacketSize(I)V

    .line 222
    invoke-virtual {p1}, Lcom/coremedia/iso/boxes/sampleentry/AudioSampleEntry;->getCompressionId()I

    move-result v0

    invoke-virtual {p2}, Lcom/coremedia/iso/boxes/sampleentry/AudioSampleEntry;->getCompressionId()I

    move-result v1

    if-ne v0, v1, :cond_7

    .line 223
    invoke-virtual {p1}, Lcom/coremedia/iso/boxes/sampleentry/AudioSampleEntry;->getCompressionId()I

    move-result v0

    invoke-virtual {v4, v0}, Lcom/coremedia/iso/boxes/sampleentry/AudioSampleEntry;->setCompressionId(I)V

    .line 227
    invoke-virtual {p1}, Lcom/coremedia/iso/boxes/sampleentry/AudioSampleEntry;->getSampleRate()J

    move-result-wide v0

    invoke-virtual {p2}, Lcom/coremedia/iso/boxes/sampleentry/AudioSampleEntry;->getSampleRate()J

    move-result-wide v6

    cmp-long v0, v0, v6

    if-nez v0, :cond_8

    .line 228
    invoke-virtual {p1}, Lcom/coremedia/iso/boxes/sampleentry/AudioSampleEntry;->getSampleRate()J

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lcom/coremedia/iso/boxes/sampleentry/AudioSampleEntry;->setSampleRate(J)V

    .line 232
    invoke-virtual {p1}, Lcom/coremedia/iso/boxes/sampleentry/AudioSampleEntry;->getSampleSize()I

    move-result v0

    invoke-virtual {p2}, Lcom/coremedia/iso/boxes/sampleentry/AudioSampleEntry;->getSampleSize()I

    move-result v1

    if-ne v0, v1, :cond_9

    .line 233
    invoke-virtual {p1}, Lcom/coremedia/iso/boxes/sampleentry/AudioSampleEntry;->getSampleSize()I

    move-result v0

    invoke-virtual {v4, v0}, Lcom/coremedia/iso/boxes/sampleentry/AudioSampleEntry;->setSampleSize(I)V

    .line 237
    invoke-virtual {p1}, Lcom/coremedia/iso/boxes/sampleentry/AudioSampleEntry;->getSamplesPerPacket()J

    move-result-wide v0

    invoke-virtual {p2}, Lcom/coremedia/iso/boxes/sampleentry/AudioSampleEntry;->getSamplesPerPacket()J

    move-result-wide v6

    cmp-long v0, v0, v6

    if-nez v0, :cond_a

    .line 238
    invoke-virtual {p1}, Lcom/coremedia/iso/boxes/sampleentry/AudioSampleEntry;->getSamplesPerPacket()J

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lcom/coremedia/iso/boxes/sampleentry/AudioSampleEntry;->setSamplesPerPacket(J)V

    .line 242
    invoke-virtual {p1}, Lcom/coremedia/iso/boxes/sampleentry/AudioSampleEntry;->getSoundVersion()I

    move-result v0

    invoke-virtual {p2}, Lcom/coremedia/iso/boxes/sampleentry/AudioSampleEntry;->getSoundVersion()I

    move-result v1

    if-ne v0, v1, :cond_b

    .line 243
    invoke-virtual {p1}, Lcom/coremedia/iso/boxes/sampleentry/AudioSampleEntry;->getSoundVersion()I

    move-result v0

    invoke-virtual {v4, v0}, Lcom/coremedia/iso/boxes/sampleentry/AudioSampleEntry;->setSoundVersion(I)V

    .line 247
    invoke-virtual {p1}, Lcom/coremedia/iso/boxes/sampleentry/AudioSampleEntry;->getSoundVersion2Data()[B

    move-result-object v0

    invoke-virtual {p2}, Lcom/coremedia/iso/boxes/sampleentry/AudioSampleEntry;->getSoundVersion2Data()[B

    move-result-object v1

    invoke-static {v0, v1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v0

    if-eqz v0, :cond_c

    .line 248
    invoke-virtual {p1}, Lcom/coremedia/iso/boxes/sampleentry/AudioSampleEntry;->getSoundVersion2Data()[B

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/coremedia/iso/boxes/sampleentry/AudioSampleEntry;->setSoundVersion2Data([B)V

    .line 252
    invoke-virtual {p1}, Lcom/coremedia/iso/boxes/sampleentry/AudioSampleEntry;->getBoxes()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-virtual {p2}, Lcom/coremedia/iso/boxes/sampleentry/AudioSampleEntry;->getBoxes()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ne v0, v1, :cond_1

    .line 253
    invoke-virtual {p1}, Lcom/coremedia/iso/boxes/sampleentry/AudioSampleEntry;->getBoxes()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    .line 254
    invoke-virtual {p2}, Lcom/coremedia/iso/boxes/sampleentry/AudioSampleEntry;->getBoxes()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    .line 255
    :cond_0
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_d

    :cond_1
    move-object v0, v4

    .line 280
    :goto_1
    return-object v0

    :cond_2
    move-object v0, v3

    .line 198
    goto :goto_1

    :cond_3
    move-object v0, v3

    .line 203
    goto :goto_1

    :cond_4
    move-object v0, v3

    .line 209
    goto :goto_1

    :cond_5
    move-object v0, v3

    .line 215
    goto :goto_1

    :cond_6
    move-object v0, v3

    .line 220
    goto :goto_1

    :cond_7
    move-object v0, v3

    .line 225
    goto :goto_1

    :cond_8
    move-object v0, v3

    .line 230
    goto :goto_1

    :cond_9
    move-object v0, v3

    .line 235
    goto :goto_1

    :cond_a
    move-object v0, v3

    .line 240
    goto :goto_1

    :cond_b
    move-object v0, v3

    .line 245
    goto :goto_1

    :cond_c
    move-object v0, v3

    .line 250
    goto :goto_1

    .line 256
    :cond_d
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/coremedia/iso/boxes/Box;

    .line 257
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/coremedia/iso/boxes/Box;

    .line 258
    new-instance v2, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v2}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 259
    new-instance v7, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v7}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 261
    :try_start_0
    invoke-static {v2}, Ljava/nio/channels/Channels;->newChannel(Ljava/io/OutputStream;)Ljava/nio/channels/WritableByteChannel;

    move-result-object v8

    invoke-interface {v0, v8}, Lcom/coremedia/iso/boxes/Box;->getBox(Ljava/nio/channels/WritableByteChannel;)V

    .line 262
    invoke-static {v7}, Ljava/nio/channels/Channels;->newChannel(Ljava/io/OutputStream;)Ljava/nio/channels/WritableByteChannel;

    move-result-object v8

    invoke-interface {v1, v8}, Lcom/coremedia/iso/boxes/Box;->getBox(Ljava/nio/channels/WritableByteChannel;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 267
    invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v2

    invoke-virtual {v7}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v7

    invoke-static {v2, v7}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v2

    if-eqz v2, :cond_e

    .line 268
    invoke-virtual {v4, v0}, Lcom/coremedia/iso/boxes/sampleentry/AudioSampleEntry;->addBox(Lcom/coremedia/iso/boxes/Box;)V

    goto :goto_0

    .line 263
    :catch_0
    move-exception v0

    .line 264
    sget-object v1, Lcom/googlecode/mp4parser/authoring/tracks/AppendTrack;->LOG:Lcom/googlecode/mp4parser/util/Logger;

    invoke-virtual {v0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/util/Logger;->logWarn(Ljava/lang/String;)V

    move-object v0, v3

    .line 265
    goto :goto_1

    .line 270
    :cond_e
    const-string v2, "esds"

    invoke-interface {v0}, Lcom/coremedia/iso/boxes/Box;->getType()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v2, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const-string v2, "esds"

    invoke-interface {v1}, Lcom/coremedia/iso/boxes/Box;->getType()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v2, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    move-object v2, v0

    .line 271
    check-cast v2, Lcom/googlecode/mp4parser/boxes/mp4/ESDescriptorBox;

    .line 272
    check-cast v1, Lcom/googlecode/mp4parser/boxes/mp4/ESDescriptorBox;

    .line 273
    invoke-virtual {v2}, Lcom/googlecode/mp4parser/boxes/mp4/ESDescriptorBox;->getEsDescriptor()Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/ESDescriptor;

    move-result-object v7

    invoke-virtual {v1}, Lcom/googlecode/mp4parser/boxes/mp4/ESDescriptorBox;->getEsDescriptor()Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/ESDescriptor;

    move-result-object v1

    invoke-direct {p0, v7, v1}, Lcom/googlecode/mp4parser/authoring/tracks/AppendTrack;->mergeDescriptors(Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/BaseDescriptor;Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/BaseDescriptor;)Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/ESDescriptor;

    move-result-object v1

    .line 274
    invoke-virtual {v2, v1}, Lcom/googlecode/mp4parser/boxes/mp4/ESDescriptorBox;->setDescriptor(Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/BaseDescriptor;)V

    .line 275
    invoke-virtual {v4, v0}, Lcom/coremedia/iso/boxes/sampleentry/AudioSampleEntry;->addBox(Lcom/coremedia/iso/boxes/Box;)V

    goto/16 :goto_0
.end method

.method private mergeDescriptors(Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/BaseDescriptor;Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/BaseDescriptor;)Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/ESDescriptor;
    .locals 8

    .prologue
    const/4 v0, 0x0

    .line 286
    instance-of v1, p1, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/ESDescriptor;

    if-eqz v1, :cond_19

    instance-of v1, p2, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/ESDescriptor;

    if-eqz v1, :cond_19

    .line 287
    check-cast p1, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/ESDescriptor;

    .line 288
    check-cast p2, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/ESDescriptor;

    .line 289
    invoke-virtual {p1}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/ESDescriptor;->getURLFlag()I

    move-result v1

    invoke-virtual {p2}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/ESDescriptor;->getURLFlag()I

    move-result v2

    if-eq v1, v2, :cond_1

    move-object p1, v0

    .line 364
    :cond_0
    :goto_0
    return-object p1

    .line 292
    :cond_1
    invoke-virtual {p1}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/ESDescriptor;->getURLLength()I

    invoke-virtual {p2}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/ESDescriptor;->getURLLength()I

    .line 295
    invoke-virtual {p1}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/ESDescriptor;->getDependsOnEsId()I

    move-result v1

    invoke-virtual {p2}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/ESDescriptor;->getDependsOnEsId()I

    move-result v2

    if-eq v1, v2, :cond_2

    move-object p1, v0

    .line 296
    goto :goto_0

    .line 298
    :cond_2
    invoke-virtual {p1}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/ESDescriptor;->getEsId()I

    move-result v1

    invoke-virtual {p2}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/ESDescriptor;->getEsId()I

    move-result v2

    if-eq v1, v2, :cond_3

    move-object p1, v0

    .line 299
    goto :goto_0

    .line 301
    :cond_3
    invoke-virtual {p1}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/ESDescriptor;->getoCREsId()I

    move-result v1

    invoke-virtual {p2}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/ESDescriptor;->getoCREsId()I

    move-result v2

    if-eq v1, v2, :cond_4

    move-object p1, v0

    .line 302
    goto :goto_0

    .line 304
    :cond_4
    invoke-virtual {p1}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/ESDescriptor;->getoCRstreamFlag()I

    move-result v1

    invoke-virtual {p2}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/ESDescriptor;->getoCRstreamFlag()I

    move-result v2

    if-eq v1, v2, :cond_5

    move-object p1, v0

    .line 305
    goto :goto_0

    .line 307
    :cond_5
    invoke-virtual {p1}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/ESDescriptor;->getRemoteODFlag()I

    move-result v1

    invoke-virtual {p2}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/ESDescriptor;->getRemoteODFlag()I

    move-result v2

    if-eq v1, v2, :cond_6

    move-object p1, v0

    .line 308
    goto :goto_0

    .line 310
    :cond_6
    invoke-virtual {p1}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/ESDescriptor;->getStreamDependenceFlag()I

    move-result v1

    invoke-virtual {p2}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/ESDescriptor;->getStreamDependenceFlag()I

    move-result v2

    if-eq v1, v2, :cond_7

    move-object p1, v0

    .line 311
    goto :goto_0

    .line 313
    :cond_7
    invoke-virtual {p1}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/ESDescriptor;->getStreamPriority()I

    invoke-virtual {p2}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/ESDescriptor;->getStreamPriority()I

    .line 316
    invoke-virtual {p1}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/ESDescriptor;->getURLString()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_9

    invoke-virtual {p1}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/ESDescriptor;->getURLString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/ESDescriptor;->getURLString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 319
    :goto_1
    invoke-virtual {p1}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/ESDescriptor;->getDecoderConfigDescriptor()Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/DecoderConfigDescriptor;

    move-result-object v1

    if-eqz v1, :cond_a

    invoke-virtual {p1}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/ESDescriptor;->getDecoderConfigDescriptor()Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/DecoderConfigDescriptor;

    move-result-object v1

    invoke-virtual {p2}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/ESDescriptor;->getDecoderConfigDescriptor()Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/DecoderConfigDescriptor;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    .line 320
    :cond_8
    invoke-virtual {p1}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/ESDescriptor;->getDecoderConfigDescriptor()Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/DecoderConfigDescriptor;

    move-result-object v1

    .line 321
    invoke-virtual {p2}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/ESDescriptor;->getDecoderConfigDescriptor()Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/DecoderConfigDescriptor;

    move-result-object v2

    .line 323
    invoke-virtual {v1}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/DecoderConfigDescriptor;->getAudioSpecificInfo()Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/AudioSpecificConfig;

    move-result-object v3

    if-eqz v3, :cond_d

    invoke-virtual {v2}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/DecoderConfigDescriptor;->getAudioSpecificInfo()Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/AudioSpecificConfig;

    move-result-object v3

    if-eqz v3, :cond_d

    invoke-virtual {v1}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/DecoderConfigDescriptor;->getAudioSpecificInfo()Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/AudioSpecificConfig;

    move-result-object v3

    invoke-virtual {v2}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/DecoderConfigDescriptor;->getAudioSpecificInfo()Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/AudioSpecificConfig;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/AudioSpecificConfig;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_d

    move-object p1, v0

    .line 324
    goto/16 :goto_0

    .line 316
    :cond_9
    invoke-virtual {p2}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/ESDescriptor;->getURLString()Ljava/lang/String;

    goto :goto_1

    .line 319
    :cond_a
    invoke-virtual {p2}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/ESDescriptor;->getDecoderConfigDescriptor()Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/DecoderConfigDescriptor;

    move-result-object v1

    if-nez v1, :cond_8

    .line 355
    :cond_b
    invoke-virtual {p1}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/ESDescriptor;->getOtherDescriptors()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_16

    invoke-virtual {p1}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/ESDescriptor;->getOtherDescriptors()Ljava/util/List;

    move-result-object v1

    invoke-virtual {p2}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/ESDescriptor;->getOtherDescriptors()Ljava/util/List;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_17

    :cond_c
    move-object p1, v0

    .line 356
    goto/16 :goto_0

    .line 326
    :cond_d
    invoke-virtual {v1}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/DecoderConfigDescriptor;->getAvgBitRate()J

    move-result-wide v4

    invoke-virtual {v2}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/DecoderConfigDescriptor;->getAvgBitRate()J

    move-result-wide v6

    cmp-long v3, v4, v6

    if-eqz v3, :cond_e

    .line 327
    invoke-virtual {v1}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/DecoderConfigDescriptor;->getAvgBitRate()J

    move-result-wide v4

    invoke-virtual {v2}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/DecoderConfigDescriptor;->getAvgBitRate()J

    move-result-wide v6

    add-long/2addr v4, v6

    const-wide/16 v6, 0x2

    div-long/2addr v4, v6

    invoke-virtual {v1, v4, v5}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/DecoderConfigDescriptor;->setAvgBitRate(J)V

    .line 329
    :cond_e
    invoke-virtual {v1}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/DecoderConfigDescriptor;->getBufferSizeDB()I

    invoke-virtual {v2}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/DecoderConfigDescriptor;->getBufferSizeDB()I

    .line 333
    invoke-virtual {v1}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/DecoderConfigDescriptor;->getDecoderSpecificInfo()Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/DecoderSpecificInfo;

    move-result-object v3

    if-eqz v3, :cond_10

    invoke-virtual {v1}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/DecoderConfigDescriptor;->getDecoderSpecificInfo()Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/DecoderSpecificInfo;

    move-result-object v3

    invoke-virtual {v2}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/DecoderConfigDescriptor;->getDecoderSpecificInfo()Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/DecoderSpecificInfo;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/DecoderSpecificInfo;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_11

    :cond_f
    move-object p1, v0

    .line 334
    goto/16 :goto_0

    .line 333
    :cond_10
    invoke-virtual {v2}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/DecoderConfigDescriptor;->getDecoderSpecificInfo()Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/DecoderSpecificInfo;

    move-result-object v3

    if-nez v3, :cond_f

    .line 337
    :cond_11
    invoke-virtual {v1}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/DecoderConfigDescriptor;->getMaxBitRate()J

    move-result-wide v4

    invoke-virtual {v2}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/DecoderConfigDescriptor;->getMaxBitRate()J

    move-result-wide v6

    cmp-long v3, v4, v6

    if-eqz v3, :cond_12

    .line 338
    invoke-virtual {v1}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/DecoderConfigDescriptor;->getMaxBitRate()J

    move-result-wide v4

    invoke-virtual {v2}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/DecoderConfigDescriptor;->getMaxBitRate()J

    move-result-wide v6

    invoke-static {v4, v5, v6, v7}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v4

    invoke-virtual {v1, v4, v5}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/DecoderConfigDescriptor;->setMaxBitRate(J)V

    .line 340
    :cond_12
    invoke-virtual {v1}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/DecoderConfigDescriptor;->getProfileLevelIndicationDescriptors()Ljava/util/List;

    move-result-object v3

    invoke-virtual {v2}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/DecoderConfigDescriptor;->getProfileLevelIndicationDescriptors()Ljava/util/List;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_13

    move-object p1, v0

    .line 341
    goto/16 :goto_0

    .line 344
    :cond_13
    invoke-virtual {v1}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/DecoderConfigDescriptor;->getObjectTypeIndication()I

    move-result v3

    invoke-virtual {v2}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/DecoderConfigDescriptor;->getObjectTypeIndication()I

    move-result v4

    if-eq v3, v4, :cond_14

    move-object p1, v0

    .line 345
    goto/16 :goto_0

    .line 347
    :cond_14
    invoke-virtual {v1}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/DecoderConfigDescriptor;->getStreamType()I

    move-result v3

    invoke-virtual {v2}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/DecoderConfigDescriptor;->getStreamType()I

    move-result v4

    if-eq v3, v4, :cond_15

    move-object p1, v0

    .line 348
    goto/16 :goto_0

    .line 350
    :cond_15
    invoke-virtual {v1}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/DecoderConfigDescriptor;->getUpStream()I

    move-result v1

    invoke-virtual {v2}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/DecoderConfigDescriptor;->getUpStream()I

    move-result v2

    if-eq v1, v2, :cond_b

    move-object p1, v0

    .line 351
    goto/16 :goto_0

    .line 355
    :cond_16
    invoke-virtual {p2}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/ESDescriptor;->getOtherDescriptors()Ljava/util/List;

    move-result-object v1

    if-nez v1, :cond_c

    .line 358
    :cond_17
    invoke-virtual {p1}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/ESDescriptor;->getSlConfigDescriptor()Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/SLConfigDescriptor;

    move-result-object v1

    if-eqz v1, :cond_18

    invoke-virtual {p1}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/ESDescriptor;->getSlConfigDescriptor()Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/SLConfigDescriptor;

    move-result-object v1

    invoke-virtual {p2}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/ESDescriptor;->getSlConfigDescriptor()Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/SLConfigDescriptor;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/SLConfigDescriptor;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    :goto_2
    move-object p1, v0

    .line 359
    goto/16 :goto_0

    .line 358
    :cond_18
    invoke-virtual {p2}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/ESDescriptor;->getSlConfigDescriptor()Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/SLConfigDescriptor;

    move-result-object v1

    if-eqz v1, :cond_0

    goto :goto_2

    .line 363
    :cond_19
    sget-object v1, Lcom/googlecode/mp4parser/authoring/tracks/AppendTrack;->LOG:Lcom/googlecode/mp4parser/util/Logger;

    const-string v2, "I can only merge ESDescriptors"

    invoke-virtual {v1, v2}, Lcom/googlecode/mp4parser/util/Logger;->logError(Ljava/lang/String;)V

    move-object p1, v0

    .line 364
    goto/16 :goto_0
.end method

.method private mergeSampleEntry(Lcom/coremedia/iso/boxes/sampleentry/SampleEntry;Lcom/coremedia/iso/boxes/sampleentry/SampleEntry;)Lcom/coremedia/iso/boxes/sampleentry/SampleEntry;
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 102
    invoke-interface {p1}, Lcom/coremedia/iso/boxes/sampleentry/SampleEntry;->getType()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2}, Lcom/coremedia/iso/boxes/sampleentry/SampleEntry;->getType()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 109
    :cond_0
    :goto_0
    return-object v0

    .line 104
    :cond_1
    instance-of v1, p1, Lcom/coremedia/iso/boxes/sampleentry/VisualSampleEntry;

    if-eqz v1, :cond_2

    instance-of v1, p2, Lcom/coremedia/iso/boxes/sampleentry/VisualSampleEntry;

    if-eqz v1, :cond_2

    .line 105
    check-cast p1, Lcom/coremedia/iso/boxes/sampleentry/VisualSampleEntry;

    check-cast p2, Lcom/coremedia/iso/boxes/sampleentry/VisualSampleEntry;

    invoke-direct {p0, p1, p2}, Lcom/googlecode/mp4parser/authoring/tracks/AppendTrack;->mergeVisualSampleEntry(Lcom/coremedia/iso/boxes/sampleentry/VisualSampleEntry;Lcom/coremedia/iso/boxes/sampleentry/VisualSampleEntry;)Lcom/coremedia/iso/boxes/sampleentry/VisualSampleEntry;

    move-result-object v0

    goto :goto_0

    .line 106
    :cond_2
    instance-of v1, p1, Lcom/coremedia/iso/boxes/sampleentry/AudioSampleEntry;

    if-eqz v1, :cond_0

    instance-of v1, p2, Lcom/coremedia/iso/boxes/sampleentry/AudioSampleEntry;

    if-eqz v1, :cond_0

    .line 107
    check-cast p1, Lcom/coremedia/iso/boxes/sampleentry/AudioSampleEntry;

    check-cast p2, Lcom/coremedia/iso/boxes/sampleentry/AudioSampleEntry;

    invoke-direct {p0, p1, p2}, Lcom/googlecode/mp4parser/authoring/tracks/AppendTrack;->mergeAudioSampleEntries(Lcom/coremedia/iso/boxes/sampleentry/AudioSampleEntry;Lcom/coremedia/iso/boxes/sampleentry/AudioSampleEntry;)Lcom/coremedia/iso/boxes/sampleentry/AudioSampleEntry;

    move-result-object v0

    goto :goto_0
.end method

.method private mergeStsds(Lcom/coremedia/iso/boxes/SampleDescriptionBox;Lcom/coremedia/iso/boxes/SampleDescriptionBox;)Lcom/coremedia/iso/boxes/SampleDescriptionBox;
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 78
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 79
    new-instance v1, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 81
    :try_start_0
    invoke-static {v0}, Ljava/nio/channels/Channels;->newChannel(Ljava/io/OutputStream;)Ljava/nio/channels/WritableByteChannel;

    move-result-object v2

    invoke-virtual {p1, v2}, Lcom/coremedia/iso/boxes/SampleDescriptionBox;->getBox(Ljava/nio/channels/WritableByteChannel;)V

    .line 82
    invoke-static {v1}, Ljava/nio/channels/Channels;->newChannel(Ljava/io/OutputStream;)Ljava/nio/channels/WritableByteChannel;

    move-result-object v2

    invoke-virtual {p2, v2}, Lcom/coremedia/iso/boxes/SampleDescriptionBox;->getBox(Ljava/nio/channels/WritableByteChannel;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 87
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    .line 88
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v1

    .line 90
    invoke-static {v1, v0}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v0

    if-nez v0, :cond_0

    .line 91
    const-class v0, Lcom/coremedia/iso/boxes/sampleentry/SampleEntry;

    invoke-virtual {p1, v0}, Lcom/coremedia/iso/boxes/SampleDescriptionBox;->getBoxes(Ljava/lang/Class;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/coremedia/iso/boxes/sampleentry/SampleEntry;

    const-class v1, Lcom/coremedia/iso/boxes/sampleentry/SampleEntry;

    invoke-virtual {p2, v1}, Lcom/coremedia/iso/boxes/SampleDescriptionBox;->getBoxes(Ljava/lang/Class;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/coremedia/iso/boxes/sampleentry/SampleEntry;

    invoke-direct {p0, v0, v1}, Lcom/googlecode/mp4parser/authoring/tracks/AppendTrack;->mergeSampleEntry(Lcom/coremedia/iso/boxes/sampleentry/SampleEntry;Lcom/coremedia/iso/boxes/sampleentry/SampleEntry;)Lcom/coremedia/iso/boxes/sampleentry/SampleEntry;

    move-result-object v0

    .line 92
    if-eqz v0, :cond_1

    .line 93
    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/coremedia/iso/boxes/SampleDescriptionBox;->setBoxes(Ljava/util/List;)V

    .line 98
    :cond_0
    :goto_0
    return-object p1

    .line 83
    :catch_0
    move-exception v0

    .line 84
    sget-object v1, Lcom/googlecode/mp4parser/authoring/tracks/AppendTrack;->LOG:Lcom/googlecode/mp4parser/util/Logger;

    invoke-virtual {v0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/util/Logger;->logError(Ljava/lang/String;)V

    .line 85
    const/4 p1, 0x0

    goto :goto_0

    .line 95
    :cond_1
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Cannot merge "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-class v2, Lcom/coremedia/iso/boxes/sampleentry/SampleEntry;

    invoke-virtual {p1, v2}, Lcom/coremedia/iso/boxes/SampleDescriptionBox;->getBoxes(Ljava/lang/Class;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " and "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-class v2, Lcom/coremedia/iso/boxes/sampleentry/SampleEntry;

    invoke-virtual {p2, v2}, Lcom/coremedia/iso/boxes/SampleDescriptionBox;->getBoxes(Ljava/lang/Class;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private mergeVisualSampleEntry(Lcom/coremedia/iso/boxes/sampleentry/VisualSampleEntry;Lcom/coremedia/iso/boxes/sampleentry/VisualSampleEntry;)Lcom/coremedia/iso/boxes/sampleentry/VisualSampleEntry;
    .locals 9

    .prologue
    const/4 v3, 0x0

    .line 114
    new-instance v4, Lcom/coremedia/iso/boxes/sampleentry/VisualSampleEntry;

    invoke-direct {v4}, Lcom/coremedia/iso/boxes/sampleentry/VisualSampleEntry;-><init>()V

    .line 115
    invoke-virtual {p1}, Lcom/coremedia/iso/boxes/sampleentry/VisualSampleEntry;->getHorizresolution()D

    move-result-wide v0

    invoke-virtual {p2}, Lcom/coremedia/iso/boxes/sampleentry/VisualSampleEntry;->getHorizresolution()D

    move-result-wide v6

    cmpl-double v0, v0, v6

    if-nez v0, :cond_2

    .line 116
    invoke-virtual {p1}, Lcom/coremedia/iso/boxes/sampleentry/VisualSampleEntry;->getHorizresolution()D

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lcom/coremedia/iso/boxes/sampleentry/VisualSampleEntry;->setHorizresolution(D)V

    .line 121
    invoke-virtual {p1}, Lcom/coremedia/iso/boxes/sampleentry/VisualSampleEntry;->getCompressorname()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/coremedia/iso/boxes/sampleentry/VisualSampleEntry;->setCompressorname(Ljava/lang/String;)V

    .line 122
    invoke-virtual {p1}, Lcom/coremedia/iso/boxes/sampleentry/VisualSampleEntry;->getDepth()I

    move-result v0

    invoke-virtual {p2}, Lcom/coremedia/iso/boxes/sampleentry/VisualSampleEntry;->getDepth()I

    move-result v1

    if-ne v0, v1, :cond_3

    .line 123
    invoke-virtual {p1}, Lcom/coremedia/iso/boxes/sampleentry/VisualSampleEntry;->getDepth()I

    move-result v0

    invoke-virtual {v4, v0}, Lcom/coremedia/iso/boxes/sampleentry/VisualSampleEntry;->setDepth(I)V

    .line 129
    invoke-virtual {p1}, Lcom/coremedia/iso/boxes/sampleentry/VisualSampleEntry;->getFrameCount()I

    move-result v0

    invoke-virtual {p2}, Lcom/coremedia/iso/boxes/sampleentry/VisualSampleEntry;->getFrameCount()I

    move-result v1

    if-ne v0, v1, :cond_4

    .line 130
    invoke-virtual {p1}, Lcom/coremedia/iso/boxes/sampleentry/VisualSampleEntry;->getFrameCount()I

    move-result v0

    invoke-virtual {v4, v0}, Lcom/coremedia/iso/boxes/sampleentry/VisualSampleEntry;->setFrameCount(I)V

    .line 136
    invoke-virtual {p1}, Lcom/coremedia/iso/boxes/sampleentry/VisualSampleEntry;->getHeight()I

    move-result v0

    invoke-virtual {p2}, Lcom/coremedia/iso/boxes/sampleentry/VisualSampleEntry;->getHeight()I

    move-result v1

    if-ne v0, v1, :cond_5

    .line 137
    invoke-virtual {p1}, Lcom/coremedia/iso/boxes/sampleentry/VisualSampleEntry;->getHeight()I

    move-result v0

    invoke-virtual {v4, v0}, Lcom/coremedia/iso/boxes/sampleentry/VisualSampleEntry;->setHeight(I)V

    .line 142
    invoke-virtual {p1}, Lcom/coremedia/iso/boxes/sampleentry/VisualSampleEntry;->getWidth()I

    move-result v0

    invoke-virtual {p2}, Lcom/coremedia/iso/boxes/sampleentry/VisualSampleEntry;->getWidth()I

    move-result v1

    if-ne v0, v1, :cond_6

    .line 143
    invoke-virtual {p1}, Lcom/coremedia/iso/boxes/sampleentry/VisualSampleEntry;->getWidth()I

    move-result v0

    invoke-virtual {v4, v0}, Lcom/coremedia/iso/boxes/sampleentry/VisualSampleEntry;->setWidth(I)V

    .line 149
    invoke-virtual {p1}, Lcom/coremedia/iso/boxes/sampleentry/VisualSampleEntry;->getVertresolution()D

    move-result-wide v0

    invoke-virtual {p2}, Lcom/coremedia/iso/boxes/sampleentry/VisualSampleEntry;->getVertresolution()D

    move-result-wide v6

    cmpl-double v0, v0, v6

    if-nez v0, :cond_7

    .line 150
    invoke-virtual {p1}, Lcom/coremedia/iso/boxes/sampleentry/VisualSampleEntry;->getVertresolution()D

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lcom/coremedia/iso/boxes/sampleentry/VisualSampleEntry;->setVertresolution(D)V

    .line 156
    invoke-virtual {p1}, Lcom/coremedia/iso/boxes/sampleentry/VisualSampleEntry;->getHorizresolution()D

    move-result-wide v0

    invoke-virtual {p2}, Lcom/coremedia/iso/boxes/sampleentry/VisualSampleEntry;->getHorizresolution()D

    move-result-wide v6

    cmpl-double v0, v0, v6

    if-nez v0, :cond_8

    .line 157
    invoke-virtual {p1}, Lcom/coremedia/iso/boxes/sampleentry/VisualSampleEntry;->getHorizresolution()D

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lcom/coremedia/iso/boxes/sampleentry/VisualSampleEntry;->setHorizresolution(D)V

    .line 163
    invoke-virtual {p1}, Lcom/coremedia/iso/boxes/sampleentry/VisualSampleEntry;->getBoxes()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-virtual {p2}, Lcom/coremedia/iso/boxes/sampleentry/VisualSampleEntry;->getBoxes()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ne v0, v1, :cond_1

    .line 164
    invoke-virtual {p1}, Lcom/coremedia/iso/boxes/sampleentry/VisualSampleEntry;->getBoxes()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    .line 165
    invoke-virtual {p2}, Lcom/coremedia/iso/boxes/sampleentry/VisualSampleEntry;->getBoxes()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    .line 166
    :cond_0
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_9

    :cond_1
    move-object v0, v4

    .line 189
    :goto_1
    return-object v0

    .line 118
    :cond_2
    sget-object v0, Lcom/googlecode/mp4parser/authoring/tracks/AppendTrack;->LOG:Lcom/googlecode/mp4parser/util/Logger;

    const-string v1, "Horizontal Resolution differs"

    invoke-virtual {v0, v1}, Lcom/googlecode/mp4parser/util/Logger;->logError(Ljava/lang/String;)V

    move-object v0, v3

    .line 119
    goto :goto_1

    .line 125
    :cond_3
    sget-object v0, Lcom/googlecode/mp4parser/authoring/tracks/AppendTrack;->LOG:Lcom/googlecode/mp4parser/util/Logger;

    const-string v1, "Depth differs"

    invoke-virtual {v0, v1}, Lcom/googlecode/mp4parser/util/Logger;->logError(Ljava/lang/String;)V

    move-object v0, v3

    .line 126
    goto :goto_1

    .line 132
    :cond_4
    sget-object v0, Lcom/googlecode/mp4parser/authoring/tracks/AppendTrack;->LOG:Lcom/googlecode/mp4parser/util/Logger;

    const-string v1, "frame count differs"

    invoke-virtual {v0, v1}, Lcom/googlecode/mp4parser/util/Logger;->logError(Ljava/lang/String;)V

    move-object v0, v3

    .line 133
    goto :goto_1

    .line 139
    :cond_5
    sget-object v0, Lcom/googlecode/mp4parser/authoring/tracks/AppendTrack;->LOG:Lcom/googlecode/mp4parser/util/Logger;

    const-string v1, "height differs"

    invoke-virtual {v0, v1}, Lcom/googlecode/mp4parser/util/Logger;->logError(Ljava/lang/String;)V

    move-object v0, v3

    .line 140
    goto :goto_1

    .line 145
    :cond_6
    sget-object v0, Lcom/googlecode/mp4parser/authoring/tracks/AppendTrack;->LOG:Lcom/googlecode/mp4parser/util/Logger;

    const-string v1, "width differs"

    invoke-virtual {v0, v1}, Lcom/googlecode/mp4parser/util/Logger;->logError(Ljava/lang/String;)V

    move-object v0, v3

    .line 146
    goto :goto_1

    .line 152
    :cond_7
    sget-object v0, Lcom/googlecode/mp4parser/authoring/tracks/AppendTrack;->LOG:Lcom/googlecode/mp4parser/util/Logger;

    const-string v1, "vert resolution differs"

    invoke-virtual {v0, v1}, Lcom/googlecode/mp4parser/util/Logger;->logError(Ljava/lang/String;)V

    move-object v0, v3

    .line 153
    goto :goto_1

    .line 159
    :cond_8
    sget-object v0, Lcom/googlecode/mp4parser/authoring/tracks/AppendTrack;->LOG:Lcom/googlecode/mp4parser/util/Logger;

    const-string v1, "horizontal resolution differs"

    invoke-virtual {v0, v1}, Lcom/googlecode/mp4parser/util/Logger;->logError(Ljava/lang/String;)V

    move-object v0, v3

    .line 160
    goto :goto_1

    .line 167
    :cond_9
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/coremedia/iso/boxes/Box;

    .line 168
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/coremedia/iso/boxes/Box;

    .line 169
    new-instance v2, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v2}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 170
    new-instance v7, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v7}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 172
    :try_start_0
    invoke-static {v2}, Ljava/nio/channels/Channels;->newChannel(Ljava/io/OutputStream;)Ljava/nio/channels/WritableByteChannel;

    move-result-object v8

    invoke-interface {v0, v8}, Lcom/coremedia/iso/boxes/Box;->getBox(Ljava/nio/channels/WritableByteChannel;)V

    .line 173
    invoke-static {v7}, Ljava/nio/channels/Channels;->newChannel(Ljava/io/OutputStream;)Ljava/nio/channels/WritableByteChannel;

    move-result-object v8

    invoke-interface {v1, v8}, Lcom/coremedia/iso/boxes/Box;->getBox(Ljava/nio/channels/WritableByteChannel;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 178
    invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v2

    invoke-virtual {v7}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v7

    invoke-static {v2, v7}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v2

    if-eqz v2, :cond_a

    .line 179
    invoke-virtual {v4, v0}, Lcom/coremedia/iso/boxes/sampleentry/VisualSampleEntry;->addBox(Lcom/coremedia/iso/boxes/Box;)V

    goto :goto_0

    .line 174
    :catch_0
    move-exception v0

    .line 175
    sget-object v1, Lcom/googlecode/mp4parser/authoring/tracks/AppendTrack;->LOG:Lcom/googlecode/mp4parser/util/Logger;

    invoke-virtual {v0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/util/Logger;->logWarn(Ljava/lang/String;)V

    move-object v0, v3

    .line 176
    goto/16 :goto_1

    .line 181
    :cond_a
    instance-of v2, v0, Lcom/googlecode/mp4parser/boxes/mp4/AbstractDescriptorBox;

    if-eqz v2, :cond_0

    instance-of v2, v1, Lcom/googlecode/mp4parser/boxes/mp4/AbstractDescriptorBox;

    if-eqz v2, :cond_0

    move-object v2, v0

    .line 182
    check-cast v2, Lcom/googlecode/mp4parser/boxes/mp4/AbstractDescriptorBox;

    invoke-virtual {v2}, Lcom/googlecode/mp4parser/boxes/mp4/AbstractDescriptorBox;->getDescriptor()Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/BaseDescriptor;

    move-result-object v2

    check-cast v1, Lcom/googlecode/mp4parser/boxes/mp4/AbstractDescriptorBox;

    invoke-virtual {v1}, Lcom/googlecode/mp4parser/boxes/mp4/AbstractDescriptorBox;->getDescriptor()Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/BaseDescriptor;

    move-result-object v1

    invoke-direct {p0, v2, v1}, Lcom/googlecode/mp4parser/authoring/tracks/AppendTrack;->mergeDescriptors(Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/BaseDescriptor;Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/BaseDescriptor;)Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/ESDescriptor;

    move-result-object v2

    move-object v1, v0

    .line 183
    check-cast v1, Lcom/googlecode/mp4parser/boxes/mp4/AbstractDescriptorBox;

    invoke-virtual {v1, v2}, Lcom/googlecode/mp4parser/boxes/mp4/AbstractDescriptorBox;->setDescriptor(Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/BaseDescriptor;)V

    .line 184
    invoke-virtual {v4, v0}, Lcom/coremedia/iso/boxes/sampleentry/VisualSampleEntry;->addBox(Lcom/coremedia/iso/boxes/Box;)V

    goto/16 :goto_0
.end method


# virtual methods
.method public close()V
    .locals 4

    .prologue
    .line 72
    iget-object v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/AppendTrack;->tracks:[Lcom/googlecode/mp4parser/authoring/Track;

    array-length v2, v1

    const/4 v0, 0x0

    :goto_0
    if-lt v0, v2, :cond_0

    .line 75
    return-void

    .line 72
    :cond_0
    aget-object v3, v1, v0

    .line 73
    invoke-interface {v3}, Lcom/googlecode/mp4parser/authoring/Track;->close()V

    .line 72
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method public getCompositionTimeEntries()Ljava/util/List;
    .locals 9

    .prologue
    const/4 v4, 0x0

    .line 399
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/AppendTrack;->tracks:[Lcom/googlecode/mp4parser/authoring/Track;

    aget-object v0, v0, v4

    invoke-interface {v0}, Lcom/googlecode/mp4parser/authoring/Track;->getCompositionTimeEntries()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/AppendTrack;->tracks:[Lcom/googlecode/mp4parser/authoring/Track;

    aget-object v0, v0, v4

    invoke-interface {v0}, Lcom/googlecode/mp4parser/authoring/Track;->getCompositionTimeEntries()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_5

    .line 400
    new-instance v1, Ljava/util/LinkedList;

    invoke-direct {v1}, Ljava/util/LinkedList;-><init>()V

    .line 401
    iget-object v2, p0, Lcom/googlecode/mp4parser/authoring/tracks/AppendTrack;->tracks:[Lcom/googlecode/mp4parser/authoring/Track;

    array-length v3, v2

    move v0, v4

    :goto_0
    if-lt v0, v3, :cond_1

    .line 404
    new-instance v2, Ljava/util/LinkedList;

    invoke-direct {v2}, Ljava/util/LinkedList;-><init>()V

    .line 405
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_2

    move-object v0, v2

    .line 418
    :goto_1
    return-object v0

    .line 401
    :cond_1
    aget-object v5, v2, v0

    .line 402
    invoke-interface {v5}, Lcom/googlecode/mp4parser/authoring/Track;->getCompositionTimeEntries()Ljava/util/List;

    move-result-object v5

    invoke-static {v5}, Lcom/coremedia/iso/boxes/CompositionTimeToSample;->blowupCompositionTimes(Ljava/util/List;)[I

    move-result-object v5

    invoke-interface {v1, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 401
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 405
    :cond_2
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, [I

    .line 406
    array-length v6, v1

    move v3, v4

    :goto_2
    if-ge v3, v6, :cond_0

    aget v7, v1, v3

    .line 407
    invoke-virtual {v2}, Ljava/util/LinkedList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {v2}, Ljava/util/LinkedList;->getLast()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/coremedia/iso/boxes/CompositionTimeToSample$Entry;

    invoke-virtual {v0}, Lcom/coremedia/iso/boxes/CompositionTimeToSample$Entry;->getOffset()I

    move-result v0

    if-eq v0, v7, :cond_4

    .line 408
    :cond_3
    new-instance v0, Lcom/coremedia/iso/boxes/CompositionTimeToSample$Entry;

    const/4 v8, 0x1

    invoke-direct {v0, v8, v7}, Lcom/coremedia/iso/boxes/CompositionTimeToSample$Entry;-><init>(II)V

    .line 409
    invoke-virtual {v2, v0}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 406
    :goto_3
    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto :goto_2

    .line 411
    :cond_4
    invoke-virtual {v2}, Ljava/util/LinkedList;->getLast()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/coremedia/iso/boxes/CompositionTimeToSample$Entry;

    .line 412
    invoke-virtual {v0}, Lcom/coremedia/iso/boxes/CompositionTimeToSample$Entry;->getCount()I

    move-result v7

    add-int/lit8 v7, v7, 0x1

    invoke-virtual {v0, v7}, Lcom/coremedia/iso/boxes/CompositionTimeToSample$Entry;->setCount(I)V

    goto :goto_3

    .line 418
    :cond_5
    const/4 v0, 0x0

    goto :goto_1
.end method

.method public getHandler()Ljava/lang/String;
    .locals 2

    .prologue
    .line 461
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/AppendTrack;->tracks:[Lcom/googlecode/mp4parser/authoring/Track;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-interface {v0}, Lcom/googlecode/mp4parser/authoring/Track;->getHandler()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getSampleDependencies()Ljava/util/List;
    .locals 5

    .prologue
    const/4 v1, 0x0

    .line 445
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/AppendTrack;->tracks:[Lcom/googlecode/mp4parser/authoring/Track;

    aget-object v0, v0, v1

    invoke-interface {v0}, Lcom/googlecode/mp4parser/authoring/Track;->getSampleDependencies()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/AppendTrack;->tracks:[Lcom/googlecode/mp4parser/authoring/Track;

    aget-object v0, v0, v1

    invoke-interface {v0}, Lcom/googlecode/mp4parser/authoring/Track;->getSampleDependencies()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 446
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    .line 447
    iget-object v2, p0, Lcom/googlecode/mp4parser/authoring/tracks/AppendTrack;->tracks:[Lcom/googlecode/mp4parser/authoring/Track;

    array-length v3, v2

    :goto_0
    if-lt v1, v3, :cond_0

    .line 452
    :goto_1
    return-object v0

    .line 447
    :cond_0
    aget-object v4, v2, v1

    .line 448
    invoke-interface {v4}, Lcom/googlecode/mp4parser/authoring/Track;->getSampleDependencies()Ljava/util/List;

    move-result-object v4

    invoke-interface {v0, v4}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 447
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 452
    :cond_1
    const/4 v0, 0x0

    goto :goto_1
.end method

.method public getSampleDescriptionBox()Lcom/coremedia/iso/boxes/SampleDescriptionBox;
    .locals 1

    .prologue
    .line 379
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/AppendTrack;->stsd:Lcom/coremedia/iso/boxes/SampleDescriptionBox;

    return-object v0
.end method

.method public declared-synchronized getSampleDurations()[J
    .locals 12

    .prologue
    const/4 v1, 0x0

    .line 383
    monitor-enter p0

    .line 384
    :try_start_0
    iget-object v3, p0, Lcom/googlecode/mp4parser/authoring/tracks/AppendTrack;->tracks:[Lcom/googlecode/mp4parser/authoring/Track;

    array-length v4, v3

    move v0, v1

    move v2, v1

    :goto_0
    if-lt v0, v4, :cond_0

    .line 387
    new-array v5, v2, [J

    .line 390
    iget-object v6, p0, Lcom/googlecode/mp4parser/authoring/tracks/AppendTrack;->tracks:[Lcom/googlecode/mp4parser/authoring/Track;

    array-length v7, v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move v4, v1

    move v0, v1

    :goto_1
    if-lt v4, v7, :cond_1

    .line 395
    monitor-exit p0

    return-object v5

    .line 384
    :cond_0
    :try_start_1
    aget-object v5, v3, v0

    .line 385
    invoke-interface {v5}, Lcom/googlecode/mp4parser/authoring/Track;->getSampleDurations()[J

    move-result-object v5

    array-length v5, v5

    add-int/2addr v2, v5

    .line 384
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 390
    :cond_1
    aget-object v2, v6, v4

    .line 391
    invoke-interface {v2}, Lcom/googlecode/mp4parser/authoring/Track;->getSampleDurations()[J

    move-result-object v8

    array-length v9, v8

    move v2, v0

    move v0, v1

    :goto_2
    if-lt v0, v9, :cond_2

    .line 390
    add-int/lit8 v0, v4, 0x1

    move v4, v0

    move v0, v2

    goto :goto_1

    .line 391
    :cond_2
    aget-wide v10, v8, v0

    .line 392
    add-int/lit8 v3, v2, 0x1

    aput-wide v10, v5, v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 391
    add-int/lit8 v0, v0, 0x1

    move v2, v3

    goto :goto_2

    .line 383
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public getSamples()Ljava/util/List;
    .locals 5

    .prologue
    .line 369
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 371
    iget-object v2, p0, Lcom/googlecode/mp4parser/authoring/tracks/AppendTrack;->tracks:[Lcom/googlecode/mp4parser/authoring/Track;

    array-length v3, v2

    const/4 v0, 0x0

    :goto_0
    if-lt v0, v3, :cond_0

    .line 375
    return-object v1

    .line 371
    :cond_0
    aget-object v4, v2, v0

    .line 372
    invoke-interface {v4}, Lcom/googlecode/mp4parser/authoring/Track;->getSamples()Ljava/util/List;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 371
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method public getSubsampleInformationBox()Lcom/coremedia/iso/boxes/SubSampleInformationBox;
    .locals 2

    .prologue
    .line 465
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/AppendTrack;->tracks:[Lcom/googlecode/mp4parser/authoring/Track;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-interface {v0}, Lcom/googlecode/mp4parser/authoring/Track;->getSubsampleInformationBox()Lcom/coremedia/iso/boxes/SubSampleInformationBox;

    move-result-object v0

    return-object v0
.end method

.method public getSyncSamples()[J
    .locals 14

    .prologue
    .line 423
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/AppendTrack;->tracks:[Lcom/googlecode/mp4parser/authoring/Track;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-interface {v0}, Lcom/googlecode/mp4parser/authoring/Track;->getSyncSamples()[J

    move-result-object v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/AppendTrack;->tracks:[Lcom/googlecode/mp4parser/authoring/Track;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-interface {v0}, Lcom/googlecode/mp4parser/authoring/Track;->getSyncSamples()[J

    move-result-object v0

    array-length v0, v0

    if-lez v0, :cond_3

    .line 424
    const/4 v1, 0x0

    .line 425
    iget-object v2, p0, Lcom/googlecode/mp4parser/authoring/tracks/AppendTrack;->tracks:[Lcom/googlecode/mp4parser/authoring/Track;

    array-length v3, v2

    const/4 v0, 0x0

    :goto_0
    if-lt v0, v3, :cond_0

    .line 428
    new-array v0, v1, [J

    .line 430
    const/4 v4, 0x0

    .line 431
    const-wide/16 v2, 0x0

    .line 432
    iget-object v7, p0, Lcom/googlecode/mp4parser/authoring/tracks/AppendTrack;->tracks:[Lcom/googlecode/mp4parser/authoring/Track;

    array-length v8, v7

    const/4 v1, 0x0

    :goto_1
    if-lt v1, v8, :cond_1

    .line 440
    :goto_2
    return-object v0

    .line 425
    :cond_0
    aget-object v4, v2, v0

    .line 426
    invoke-interface {v4}, Lcom/googlecode/mp4parser/authoring/Track;->getSyncSamples()[J

    move-result-object v4

    array-length v4, v4

    add-int/2addr v1, v4

    .line 425
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 432
    :cond_1
    aget-object v9, v7, v1

    .line 433
    invoke-interface {v9}, Lcom/googlecode/mp4parser/authoring/Track;->getSyncSamples()[J

    move-result-object v10

    array-length v11, v10

    const/4 v5, 0x0

    :goto_3
    if-lt v5, v11, :cond_2

    .line 436
    invoke-interface {v9}, Lcom/googlecode/mp4parser/authoring/Track;->getSamples()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v5

    int-to-long v10, v5

    add-long/2addr v2, v10

    .line 432
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 433
    :cond_2
    aget-wide v12, v10, v5

    .line 434
    add-int/lit8 v6, v4, 0x1

    add-long/2addr v12, v2

    aput-wide v12, v0, v4

    .line 433
    add-int/lit8 v4, v5, 0x1

    move v5, v4

    move v4, v6

    goto :goto_3

    .line 440
    :cond_3
    const/4 v0, 0x0

    goto :goto_2
.end method

.method public getTrackMetaData()Lcom/googlecode/mp4parser/authoring/TrackMetaData;
    .locals 2

    .prologue
    .line 457
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/AppendTrack;->tracks:[Lcom/googlecode/mp4parser/authoring/Track;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-interface {v0}, Lcom/googlecode/mp4parser/authoring/Track;->getTrackMetaData()Lcom/googlecode/mp4parser/authoring/TrackMetaData;

    move-result-object v0

    return-object v0
.end method
