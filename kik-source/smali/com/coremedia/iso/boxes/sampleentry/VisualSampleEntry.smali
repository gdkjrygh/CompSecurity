.class public final Lcom/coremedia/iso/boxes/sampleentry/VisualSampleEntry;
.super Lcom/coremedia/iso/boxes/sampleentry/AbstractSampleEntry;
.source "SourceFile"

# interfaces
.implements Lcom/coremedia/iso/boxes/Container;


# static fields
.field static final synthetic $assertionsDisabled:Z

.field public static final TYPE1:Ljava/lang/String; = "mp4v"

.field public static final TYPE2:Ljava/lang/String; = "s263"

.field public static final TYPE3:Ljava/lang/String; = "avc1"

.field public static final TYPE4:Ljava/lang/String; = "avc3"

.field public static final TYPE5:Ljava/lang/String; = "drmi"

.field public static final TYPE6:Ljava/lang/String; = "hvc1"

.field public static final TYPE7:Ljava/lang/String; = "hev1"

.field public static final TYPE_ENCRYPTED:Ljava/lang/String; = "encv"


# instance fields
.field private compressorname:Ljava/lang/String;

.field private depth:I

.field private frameCount:I

.field private height:I

.field private horizresolution:D

.field private predefined:[J

.field private vertresolution:D

.field private width:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 54
    const-class v0, Lcom/coremedia/iso/boxes/sampleentry/VisualSampleEntry;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Lcom/coremedia/iso/boxes/sampleentry/VisualSampleEntry;->$assertionsDisabled:Z

    .line 69
    return-void

    .line 54
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public constructor <init>()V
    .locals 4

    .prologue
    const-wide/high16 v2, 0x4052000000000000L    # 72.0

    .line 83
    const-string v0, "avc1"

    invoke-direct {p0, v0}, Lcom/coremedia/iso/boxes/sampleentry/AbstractSampleEntry;-><init>(Ljava/lang/String;)V

    .line 74
    iput-wide v2, p0, Lcom/coremedia/iso/boxes/sampleentry/VisualSampleEntry;->horizresolution:D

    .line 75
    iput-wide v2, p0, Lcom/coremedia/iso/boxes/sampleentry/VisualSampleEntry;->vertresolution:D

    .line 76
    const/4 v0, 0x1

    iput v0, p0, Lcom/coremedia/iso/boxes/sampleentry/VisualSampleEntry;->frameCount:I

    .line 77
    const-string v0, ""

    iput-object v0, p0, Lcom/coremedia/iso/boxes/sampleentry/VisualSampleEntry;->compressorname:Ljava/lang/String;

    .line 78
    const/16 v0, 0x18

    iput v0, p0, Lcom/coremedia/iso/boxes/sampleentry/VisualSampleEntry;->depth:I

    .line 80
    const/4 v0, 0x3

    new-array v0, v0, [J

    iput-object v0, p0, Lcom/coremedia/iso/boxes/sampleentry/VisualSampleEntry;->predefined:[J

    .line 84
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    .prologue
    const-wide/high16 v0, 0x4052000000000000L    # 72.0

    .line 87
    invoke-direct {p0, p1}, Lcom/coremedia/iso/boxes/sampleentry/AbstractSampleEntry;-><init>(Ljava/lang/String;)V

    .line 74
    iput-wide v0, p0, Lcom/coremedia/iso/boxes/sampleentry/VisualSampleEntry;->horizresolution:D

    .line 75
    iput-wide v0, p0, Lcom/coremedia/iso/boxes/sampleentry/VisualSampleEntry;->vertresolution:D

    .line 76
    const/4 v0, 0x1

    iput v0, p0, Lcom/coremedia/iso/boxes/sampleentry/VisualSampleEntry;->frameCount:I

    .line 77
    const-string v0, ""

    iput-object v0, p0, Lcom/coremedia/iso/boxes/sampleentry/VisualSampleEntry;->compressorname:Ljava/lang/String;

    .line 78
    const/16 v0, 0x18

    iput v0, p0, Lcom/coremedia/iso/boxes/sampleentry/VisualSampleEntry;->depth:I

    .line 80
    const/4 v0, 0x3

    new-array v0, v0, [J

    iput-object v0, p0, Lcom/coremedia/iso/boxes/sampleentry/VisualSampleEntry;->predefined:[J

    .line 88
    return-void
.end method


# virtual methods
.method public final getBox(Ljava/nio/channels/WritableByteChannel;)V
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 236
    invoke-virtual {p0}, Lcom/coremedia/iso/boxes/sampleentry/VisualSampleEntry;->getHeader()Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/nio/channels/WritableByteChannel;->write(Ljava/nio/ByteBuffer;)I

    .line 237
    const/16 v0, 0x4e

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v1

    .line 238
    const/4 v0, 0x6

    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 239
    iget v0, p0, Lcom/coremedia/iso/boxes/sampleentry/VisualSampleEntry;->dataReferenceIndex:I

    invoke-static {v1, v0}, Lcom/coremedia/iso/IsoTypeWriter;->writeUInt16(Ljava/nio/ByteBuffer;I)V

    .line 240
    invoke-static {v1, v4}, Lcom/coremedia/iso/IsoTypeWriter;->writeUInt16(Ljava/nio/ByteBuffer;I)V

    .line 241
    invoke-static {v1, v4}, Lcom/coremedia/iso/IsoTypeWriter;->writeUInt16(Ljava/nio/ByteBuffer;I)V

    .line 242
    iget-object v0, p0, Lcom/coremedia/iso/boxes/sampleentry/VisualSampleEntry;->predefined:[J

    aget-wide v2, v0, v4

    invoke-static {v1, v2, v3}, Lcom/coremedia/iso/IsoTypeWriter;->writeUInt32(Ljava/nio/ByteBuffer;J)V

    .line 243
    iget-object v0, p0, Lcom/coremedia/iso/boxes/sampleentry/VisualSampleEntry;->predefined:[J

    const/4 v2, 0x1

    aget-wide v2, v0, v2

    invoke-static {v1, v2, v3}, Lcom/coremedia/iso/IsoTypeWriter;->writeUInt32(Ljava/nio/ByteBuffer;J)V

    .line 244
    iget-object v0, p0, Lcom/coremedia/iso/boxes/sampleentry/VisualSampleEntry;->predefined:[J

    const/4 v2, 0x2

    aget-wide v2, v0, v2

    invoke-static {v1, v2, v3}, Lcom/coremedia/iso/IsoTypeWriter;->writeUInt32(Ljava/nio/ByteBuffer;J)V

    .line 246
    invoke-virtual {p0}, Lcom/coremedia/iso/boxes/sampleentry/VisualSampleEntry;->getWidth()I

    move-result v0

    invoke-static {v1, v0}, Lcom/coremedia/iso/IsoTypeWriter;->writeUInt16(Ljava/nio/ByteBuffer;I)V

    .line 247
    invoke-virtual {p0}, Lcom/coremedia/iso/boxes/sampleentry/VisualSampleEntry;->getHeight()I

    move-result v0

    invoke-static {v1, v0}, Lcom/coremedia/iso/IsoTypeWriter;->writeUInt16(Ljava/nio/ByteBuffer;I)V

    .line 249
    invoke-virtual {p0}, Lcom/coremedia/iso/boxes/sampleentry/VisualSampleEntry;->getHorizresolution()D

    move-result-wide v2

    invoke-static {v1, v2, v3}, Lcom/coremedia/iso/IsoTypeWriter;->writeFixedPoint1616(Ljava/nio/ByteBuffer;D)V

    .line 250
    invoke-virtual {p0}, Lcom/coremedia/iso/boxes/sampleentry/VisualSampleEntry;->getVertresolution()D

    move-result-wide v2

    invoke-static {v1, v2, v3}, Lcom/coremedia/iso/IsoTypeWriter;->writeFixedPoint1616(Ljava/nio/ByteBuffer;D)V

    .line 253
    const-wide/16 v2, 0x0

    invoke-static {v1, v2, v3}, Lcom/coremedia/iso/IsoTypeWriter;->writeUInt32(Ljava/nio/ByteBuffer;J)V

    .line 254
    invoke-virtual {p0}, Lcom/coremedia/iso/boxes/sampleentry/VisualSampleEntry;->getFrameCount()I

    move-result v0

    invoke-static {v1, v0}, Lcom/coremedia/iso/IsoTypeWriter;->writeUInt16(Ljava/nio/ByteBuffer;I)V

    .line 255
    invoke-virtual {p0}, Lcom/coremedia/iso/boxes/sampleentry/VisualSampleEntry;->getCompressorname()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/coremedia/iso/Utf8;->utf8StringLengthInBytes(Ljava/lang/String;)I

    move-result v0

    invoke-static {v1, v0}, Lcom/coremedia/iso/IsoTypeWriter;->writeUInt8(Ljava/nio/ByteBuffer;I)V

    .line 256
    invoke-virtual {p0}, Lcom/coremedia/iso/boxes/sampleentry/VisualSampleEntry;->getCompressorname()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/coremedia/iso/Utf8;->convert(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 257
    invoke-virtual {p0}, Lcom/coremedia/iso/boxes/sampleentry/VisualSampleEntry;->getCompressorname()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/coremedia/iso/Utf8;->utf8StringLengthInBytes(Ljava/lang/String;)I

    move-result v0

    .line 258
    :goto_0
    const/16 v2, 0x1f

    if-lt v0, v2, :cond_0

    .line 262
    invoke-virtual {p0}, Lcom/coremedia/iso/boxes/sampleentry/VisualSampleEntry;->getDepth()I

    move-result v0

    invoke-static {v1, v0}, Lcom/coremedia/iso/IsoTypeWriter;->writeUInt16(Ljava/nio/ByteBuffer;I)V

    .line 263
    const v0, 0xffff

    invoke-static {v1, v0}, Lcom/coremedia/iso/IsoTypeWriter;->writeUInt16(Ljava/nio/ByteBuffer;I)V

    .line 265
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    move-result-object v0

    check-cast v0, Ljava/nio/ByteBuffer;

    invoke-interface {p1, v0}, Ljava/nio/channels/WritableByteChannel;->write(Ljava/nio/ByteBuffer;)I

    .line 267
    invoke-virtual {p0, p1}, Lcom/coremedia/iso/boxes/sampleentry/VisualSampleEntry;->writeContainer(Ljava/nio/channels/WritableByteChannel;)V

    .line 269
    return-void

    .line 259
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 260
    invoke-virtual {v1, v4}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    goto :goto_0
.end method

.method public final getCompressorname()Ljava/lang/String;
    .locals 1

    .prologue
    .line 135
    iget-object v0, p0, Lcom/coremedia/iso/boxes/sampleentry/VisualSampleEntry;->compressorname:Ljava/lang/String;

    return-object v0
.end method

.method public final getDepth()I
    .locals 1

    .prologue
    .line 143
    iget v0, p0, Lcom/coremedia/iso/boxes/sampleentry/VisualSampleEntry;->depth:I

    return v0
.end method

.method public final getFrameCount()I
    .locals 1

    .prologue
    .line 127
    iget v0, p0, Lcom/coremedia/iso/boxes/sampleentry/VisualSampleEntry;->frameCount:I

    return v0
.end method

.method public final getHeight()I
    .locals 1

    .prologue
    .line 103
    iget v0, p0, Lcom/coremedia/iso/boxes/sampleentry/VisualSampleEntry;->height:I

    return v0
.end method

.method public final getHorizresolution()D
    .locals 2

    .prologue
    .line 111
    iget-wide v0, p0, Lcom/coremedia/iso/boxes/sampleentry/VisualSampleEntry;->horizresolution:D

    return-wide v0
.end method

.method public final getSize()J
    .locals 8

    .prologue
    const-wide/16 v6, 0x4e

    .line 274
    invoke-virtual {p0}, Lcom/coremedia/iso/boxes/sampleentry/VisualSampleEntry;->getContainerSize()J

    move-result-wide v0

    .line 275
    add-long v2, v0, v6

    iget-boolean v4, p0, Lcom/coremedia/iso/boxes/sampleentry/VisualSampleEntry;->largeBox:Z

    if-nez v4, :cond_0

    add-long/2addr v0, v6

    const-wide/16 v4, 0x8

    add-long/2addr v0, v4

    const-wide v4, 0x100000000L

    cmp-long v0, v0, v4

    if-ltz v0, :cond_1

    :cond_0
    const/16 v0, 0x10

    :goto_0
    int-to-long v0, v0

    add-long/2addr v0, v2

    return-wide v0

    :cond_1
    const/16 v0, 0x8

    goto :goto_0
.end method

.method public final getVertresolution()D
    .locals 2

    .prologue
    .line 119
    iget-wide v0, p0, Lcom/coremedia/iso/boxes/sampleentry/VisualSampleEntry;->vertresolution:D

    return-wide v0
.end method

.method public final getWidth()I
    .locals 1

    .prologue
    .line 95
    iget v0, p0, Lcom/coremedia/iso/boxes/sampleentry/VisualSampleEntry;->width:I

    return v0
.end method

.method public final parse(Lcom/googlecode/mp4parser/DataSource;Ljava/nio/ByteBuffer;JLcom/coremedia/iso/BoxParser;)V
    .locals 13

    .prologue
    const-wide/16 v10, 0x0

    const/16 v3, 0x1f

    .line 152
    invoke-interface {p1}, Lcom/googlecode/mp4parser/DataSource;->position()J

    move-result-wide v4

    add-long v4, v4, p3

    .line 153
    const/16 v2, 0x4e

    invoke-static {v2}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v6

    .line 154
    invoke-interface {p1, v6}, Lcom/googlecode/mp4parser/DataSource;->read(Ljava/nio/ByteBuffer;)I

    .line 155
    const/4 v2, 0x6

    invoke-virtual {v6, v2}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 156
    invoke-static {v6}, Lcom/coremedia/iso/IsoTypeReader;->readUInt16(Ljava/nio/ByteBuffer;)I

    move-result v2

    iput v2, p0, Lcom/coremedia/iso/boxes/sampleentry/VisualSampleEntry;->dataReferenceIndex:I

    .line 158
    invoke-static {v6}, Lcom/coremedia/iso/IsoTypeReader;->readUInt16(Ljava/nio/ByteBuffer;)I

    move-result v2

    int-to-long v8, v2

    .line 159
    sget-boolean v2, Lcom/coremedia/iso/boxes/sampleentry/VisualSampleEntry;->$assertionsDisabled:Z

    if-nez v2, :cond_0

    cmp-long v2, v10, v8

    if-eqz v2, :cond_0

    new-instance v2, Ljava/lang/AssertionError;

    const-string v3, "reserved byte not 0"

    invoke-direct {v2, v3}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v2

    .line 160
    :cond_0
    invoke-static {v6}, Lcom/coremedia/iso/IsoTypeReader;->readUInt16(Ljava/nio/ByteBuffer;)I

    move-result v2

    int-to-long v8, v2

    .line 161
    sget-boolean v2, Lcom/coremedia/iso/boxes/sampleentry/VisualSampleEntry;->$assertionsDisabled:Z

    if-nez v2, :cond_1

    cmp-long v2, v10, v8

    if-eqz v2, :cond_1

    new-instance v2, Ljava/lang/AssertionError;

    const-string v3, "reserved byte not 0"

    invoke-direct {v2, v3}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v2

    .line 162
    :cond_1
    iget-object v2, p0, Lcom/coremedia/iso/boxes/sampleentry/VisualSampleEntry;->predefined:[J

    const/4 v7, 0x0

    invoke-static {v6}, Lcom/coremedia/iso/IsoTypeReader;->readUInt32(Ljava/nio/ByteBuffer;)J

    move-result-wide v8

    aput-wide v8, v2, v7

    .line 163
    iget-object v2, p0, Lcom/coremedia/iso/boxes/sampleentry/VisualSampleEntry;->predefined:[J

    const/4 v7, 0x1

    invoke-static {v6}, Lcom/coremedia/iso/IsoTypeReader;->readUInt32(Ljava/nio/ByteBuffer;)J

    move-result-wide v8

    aput-wide v8, v2, v7

    .line 164
    iget-object v2, p0, Lcom/coremedia/iso/boxes/sampleentry/VisualSampleEntry;->predefined:[J

    const/4 v7, 0x2

    invoke-static {v6}, Lcom/coremedia/iso/IsoTypeReader;->readUInt32(Ljava/nio/ByteBuffer;)J

    move-result-wide v8

    aput-wide v8, v2, v7

    .line 165
    invoke-static {v6}, Lcom/coremedia/iso/IsoTypeReader;->readUInt16(Ljava/nio/ByteBuffer;)I

    move-result v2

    iput v2, p0, Lcom/coremedia/iso/boxes/sampleentry/VisualSampleEntry;->width:I

    .line 166
    invoke-static {v6}, Lcom/coremedia/iso/IsoTypeReader;->readUInt16(Ljava/nio/ByteBuffer;)I

    move-result v2

    iput v2, p0, Lcom/coremedia/iso/boxes/sampleentry/VisualSampleEntry;->height:I

    .line 167
    invoke-static {v6}, Lcom/coremedia/iso/IsoTypeReader;->readFixedPoint1616(Ljava/nio/ByteBuffer;)D

    move-result-wide v8

    iput-wide v8, p0, Lcom/coremedia/iso/boxes/sampleentry/VisualSampleEntry;->horizresolution:D

    .line 168
    invoke-static {v6}, Lcom/coremedia/iso/IsoTypeReader;->readFixedPoint1616(Ljava/nio/ByteBuffer;)D

    move-result-wide v8

    iput-wide v8, p0, Lcom/coremedia/iso/boxes/sampleentry/VisualSampleEntry;->vertresolution:D

    .line 169
    invoke-static {v6}, Lcom/coremedia/iso/IsoTypeReader;->readUInt32(Ljava/nio/ByteBuffer;)J

    move-result-wide v8

    .line 170
    sget-boolean v2, Lcom/coremedia/iso/boxes/sampleentry/VisualSampleEntry;->$assertionsDisabled:Z

    if-nez v2, :cond_2

    cmp-long v2, v10, v8

    if-eqz v2, :cond_2

    new-instance v2, Ljava/lang/AssertionError;

    const-string v3, "reserved byte not 0"

    invoke-direct {v2, v3}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v2

    .line 171
    :cond_2
    invoke-static {v6}, Lcom/coremedia/iso/IsoTypeReader;->readUInt16(Ljava/nio/ByteBuffer;)I

    move-result v2

    iput v2, p0, Lcom/coremedia/iso/boxes/sampleentry/VisualSampleEntry;->frameCount:I

    .line 172
    invoke-static {v6}, Lcom/coremedia/iso/IsoTypeReader;->readUInt8(Ljava/nio/ByteBuffer;)I

    move-result v2

    .line 173
    if-le v2, v3, :cond_3

    .line 174
    sget-object v7, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v8, Ljava/lang/StringBuilder;

    const-string v9, "invalid compressor name displayable data: "

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v7, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    move v2, v3

    .line 177
    :cond_3
    new-array v7, v2, [B

    .line 178
    invoke-virtual {v6, v7}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 179
    invoke-static {v7}, Lcom/coremedia/iso/Utf8;->convert([B)Ljava/lang/String;

    move-result-object v7

    iput-object v7, p0, Lcom/coremedia/iso/boxes/sampleentry/VisualSampleEntry;->compressorname:Ljava/lang/String;

    .line 180
    if-ge v2, v3, :cond_4

    .line 181
    rsub-int/lit8 v2, v2, 0x1f

    new-array v2, v2, [B

    .line 182
    invoke-virtual {v6, v2}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 185
    :cond_4
    invoke-static {v6}, Lcom/coremedia/iso/IsoTypeReader;->readUInt16(Ljava/nio/ByteBuffer;)I

    move-result v2

    iput v2, p0, Lcom/coremedia/iso/boxes/sampleentry/VisualSampleEntry;->depth:I

    .line 186
    invoke-static {v6}, Lcom/coremedia/iso/IsoTypeReader;->readUInt16(Ljava/nio/ByteBuffer;)I

    move-result v2

    int-to-long v2, v2

    .line 187
    sget-boolean v6, Lcom/coremedia/iso/boxes/sampleentry/VisualSampleEntry;->$assertionsDisabled:Z

    if-nez v6, :cond_5

    const-wide/32 v6, 0xffff

    cmp-long v2, v6, v2

    if-eqz v2, :cond_5

    new-instance v2, Ljava/lang/AssertionError;

    invoke-direct {v2}, Ljava/lang/AssertionError;-><init>()V

    throw v2

    .line 190
    :cond_5
    new-instance v2, Lcom/coremedia/iso/boxes/sampleentry/VisualSampleEntry$1;

    invoke-direct {v2, p0, v4, v5, p1}, Lcom/coremedia/iso/boxes/sampleentry/VisualSampleEntry$1;-><init>(Lcom/coremedia/iso/boxes/sampleentry/VisualSampleEntry;JLcom/googlecode/mp4parser/DataSource;)V

    .line 229
    const-wide/16 v4, 0x4e

    sub-long v4, p3, v4

    move-object/from16 v0, p5

    invoke-virtual {p0, v2, v4, v5, v0}, Lcom/coremedia/iso/boxes/sampleentry/VisualSampleEntry;->initContainer(Lcom/googlecode/mp4parser/DataSource;JLcom/coremedia/iso/BoxParser;)V

    .line 231
    return-void
.end method

.method public final setCompressorname(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 139
    iput-object p1, p0, Lcom/coremedia/iso/boxes/sampleentry/VisualSampleEntry;->compressorname:Ljava/lang/String;

    .line 140
    return-void
.end method

.method public final setDepth(I)V
    .locals 0

    .prologue
    .line 147
    iput p1, p0, Lcom/coremedia/iso/boxes/sampleentry/VisualSampleEntry;->depth:I

    .line 148
    return-void
.end method

.method public final setFrameCount(I)V
    .locals 0

    .prologue
    .line 131
    iput p1, p0, Lcom/coremedia/iso/boxes/sampleentry/VisualSampleEntry;->frameCount:I

    .line 132
    return-void
.end method

.method public final setHeight(I)V
    .locals 0

    .prologue
    .line 107
    iput p1, p0, Lcom/coremedia/iso/boxes/sampleentry/VisualSampleEntry;->height:I

    .line 108
    return-void
.end method

.method public final setHorizresolution(D)V
    .locals 1

    .prologue
    .line 115
    iput-wide p1, p0, Lcom/coremedia/iso/boxes/sampleentry/VisualSampleEntry;->horizresolution:D

    .line 116
    return-void
.end method

.method public final setType(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 91
    iput-object p1, p0, Lcom/coremedia/iso/boxes/sampleentry/VisualSampleEntry;->type:Ljava/lang/String;

    .line 92
    return-void
.end method

.method public final setVertresolution(D)V
    .locals 1

    .prologue
    .line 123
    iput-wide p1, p0, Lcom/coremedia/iso/boxes/sampleentry/VisualSampleEntry;->vertresolution:D

    .line 124
    return-void
.end method

.method public final setWidth(I)V
    .locals 0

    .prologue
    .line 99
    iput p1, p0, Lcom/coremedia/iso/boxes/sampleentry/VisualSampleEntry;->width:I

    .line 100
    return-void
.end method
