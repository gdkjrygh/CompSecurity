.class public Lcom/mp4parser/iso14496/part15/AvcDecoderConfigurationRecord;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public avcLevelIndication:I

.field public avcProfileIndication:I

.field public bitDepthChromaMinus8:I

.field public bitDepthChromaMinus8PaddingBits:I

.field public bitDepthLumaMinus8:I

.field public bitDepthLumaMinus8PaddingBits:I

.field public chromaFormat:I

.field public chromaFormatPaddingBits:I

.field public configurationVersion:I

.field public hasExts:Z

.field public lengthSizeMinusOne:I

.field public lengthSizeMinusOnePaddingBits:I

.field public numberOfSequenceParameterSetsPaddingBits:I

.field public pictureParameterSets:Ljava/util/List;

.field public profileCompatibility:I

.field public sequenceParameterSetExts:Ljava/util/List;

.field public sequenceParameterSets:Ljava/util/List;


# direct methods
.method public constructor <init>()V
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    const/16 v1, 0x1f

    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/mp4parser/iso14496/part15/AvcDecoderConfigurationRecord;->sequenceParameterSets:Ljava/util/List;

    .line 28
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/mp4parser/iso14496/part15/AvcDecoderConfigurationRecord;->pictureParameterSets:Ljava/util/List;

    .line 30
    iput-boolean v3, p0, Lcom/mp4parser/iso14496/part15/AvcDecoderConfigurationRecord;->hasExts:Z

    .line 31
    iput v3, p0, Lcom/mp4parser/iso14496/part15/AvcDecoderConfigurationRecord;->chromaFormat:I

    .line 32
    iput v2, p0, Lcom/mp4parser/iso14496/part15/AvcDecoderConfigurationRecord;->bitDepthLumaMinus8:I

    .line 33
    iput v2, p0, Lcom/mp4parser/iso14496/part15/AvcDecoderConfigurationRecord;->bitDepthChromaMinus8:I

    .line 34
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/mp4parser/iso14496/part15/AvcDecoderConfigurationRecord;->sequenceParameterSetExts:Ljava/util/List;

    .line 39
    const/16 v0, 0x3f

    iput v0, p0, Lcom/mp4parser/iso14496/part15/AvcDecoderConfigurationRecord;->lengthSizeMinusOnePaddingBits:I

    .line 40
    const/4 v0, 0x7

    iput v0, p0, Lcom/mp4parser/iso14496/part15/AvcDecoderConfigurationRecord;->numberOfSequenceParameterSetsPaddingBits:I

    .line 41
    iput v1, p0, Lcom/mp4parser/iso14496/part15/AvcDecoderConfigurationRecord;->chromaFormatPaddingBits:I

    .line 42
    iput v1, p0, Lcom/mp4parser/iso14496/part15/AvcDecoderConfigurationRecord;->bitDepthLumaMinus8PaddingBits:I

    .line 43
    iput v1, p0, Lcom/mp4parser/iso14496/part15/AvcDecoderConfigurationRecord;->bitDepthChromaMinus8PaddingBits:I

    .line 46
    return-void
.end method

.method public constructor <init>(Ljava/nio/ByteBuffer;)V
    .locals 9

    .prologue
    const/16 v2, 0x1f

    const/4 v8, 0x5

    const/4 v7, 0x3

    const/4 v6, -0x1

    const/4 v0, 0x0

    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lcom/mp4parser/iso14496/part15/AvcDecoderConfigurationRecord;->sequenceParameterSets:Ljava/util/List;

    .line 28
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lcom/mp4parser/iso14496/part15/AvcDecoderConfigurationRecord;->pictureParameterSets:Ljava/util/List;

    .line 30
    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/mp4parser/iso14496/part15/AvcDecoderConfigurationRecord;->hasExts:Z

    .line 31
    const/4 v1, 0x1

    iput v1, p0, Lcom/mp4parser/iso14496/part15/AvcDecoderConfigurationRecord;->chromaFormat:I

    .line 32
    iput v0, p0, Lcom/mp4parser/iso14496/part15/AvcDecoderConfigurationRecord;->bitDepthLumaMinus8:I

    .line 33
    iput v0, p0, Lcom/mp4parser/iso14496/part15/AvcDecoderConfigurationRecord;->bitDepthChromaMinus8:I

    .line 34
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lcom/mp4parser/iso14496/part15/AvcDecoderConfigurationRecord;->sequenceParameterSetExts:Ljava/util/List;

    .line 39
    const/16 v1, 0x3f

    iput v1, p0, Lcom/mp4parser/iso14496/part15/AvcDecoderConfigurationRecord;->lengthSizeMinusOnePaddingBits:I

    .line 40
    const/4 v1, 0x7

    iput v1, p0, Lcom/mp4parser/iso14496/part15/AvcDecoderConfigurationRecord;->numberOfSequenceParameterSetsPaddingBits:I

    .line 41
    iput v2, p0, Lcom/mp4parser/iso14496/part15/AvcDecoderConfigurationRecord;->chromaFormatPaddingBits:I

    .line 42
    iput v2, p0, Lcom/mp4parser/iso14496/part15/AvcDecoderConfigurationRecord;->bitDepthLumaMinus8PaddingBits:I

    .line 43
    iput v2, p0, Lcom/mp4parser/iso14496/part15/AvcDecoderConfigurationRecord;->bitDepthChromaMinus8PaddingBits:I

    .line 49
    invoke-static {p1}, Lcom/coremedia/iso/IsoTypeReader;->readUInt8(Ljava/nio/ByteBuffer;)I

    move-result v1

    iput v1, p0, Lcom/mp4parser/iso14496/part15/AvcDecoderConfigurationRecord;->configurationVersion:I

    .line 50
    invoke-static {p1}, Lcom/coremedia/iso/IsoTypeReader;->readUInt8(Ljava/nio/ByteBuffer;)I

    move-result v1

    iput v1, p0, Lcom/mp4parser/iso14496/part15/AvcDecoderConfigurationRecord;->avcProfileIndication:I

    .line 51
    invoke-static {p1}, Lcom/coremedia/iso/IsoTypeReader;->readUInt8(Ljava/nio/ByteBuffer;)I

    move-result v1

    iput v1, p0, Lcom/mp4parser/iso14496/part15/AvcDecoderConfigurationRecord;->profileCompatibility:I

    .line 52
    invoke-static {p1}, Lcom/coremedia/iso/IsoTypeReader;->readUInt8(Ljava/nio/ByteBuffer;)I

    move-result v1

    iput v1, p0, Lcom/mp4parser/iso14496/part15/AvcDecoderConfigurationRecord;->avcLevelIndication:I

    .line 53
    new-instance v1, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/BitReaderBuffer;

    invoke-direct {v1, p1}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/BitReaderBuffer;-><init>(Ljava/nio/ByteBuffer;)V

    .line 54
    const/4 v2, 0x6

    invoke-virtual {v1, v2}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/BitReaderBuffer;->readBits(I)I

    move-result v2

    iput v2, p0, Lcom/mp4parser/iso14496/part15/AvcDecoderConfigurationRecord;->lengthSizeMinusOnePaddingBits:I

    .line 55
    const/4 v2, 0x2

    invoke-virtual {v1, v2}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/BitReaderBuffer;->readBits(I)I

    move-result v2

    iput v2, p0, Lcom/mp4parser/iso14496/part15/AvcDecoderConfigurationRecord;->lengthSizeMinusOne:I

    .line 56
    invoke-virtual {v1, v7}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/BitReaderBuffer;->readBits(I)I

    move-result v2

    iput v2, p0, Lcom/mp4parser/iso14496/part15/AvcDecoderConfigurationRecord;->numberOfSequenceParameterSetsPaddingBits:I

    .line 57
    invoke-virtual {v1, v8}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/BitReaderBuffer;->readBits(I)I

    move-result v2

    move v1, v0

    .line 58
    :goto_0
    if-lt v1, v2, :cond_2

    .line 65
    invoke-static {p1}, Lcom/coremedia/iso/IsoTypeReader;->readUInt8(Ljava/nio/ByteBuffer;)I

    move-result v1

    int-to-long v2, v1

    move v1, v0

    .line 66
    :goto_1
    int-to-long v4, v1

    cmp-long v4, v4, v2

    if-ltz v4, :cond_3

    .line 72
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v1

    const/4 v2, 0x4

    if-ge v1, v2, :cond_0

    .line 73
    iput-boolean v0, p0, Lcom/mp4parser/iso14496/part15/AvcDecoderConfigurationRecord;->hasExts:Z

    .line 75
    :cond_0
    iget-boolean v1, p0, Lcom/mp4parser/iso14496/part15/AvcDecoderConfigurationRecord;->hasExts:Z

    if-eqz v1, :cond_5

    iget v1, p0, Lcom/mp4parser/iso14496/part15/AvcDecoderConfigurationRecord;->avcProfileIndication:I

    const/16 v2, 0x64

    if-eq v1, v2, :cond_1

    iget v1, p0, Lcom/mp4parser/iso14496/part15/AvcDecoderConfigurationRecord;->avcProfileIndication:I

    const/16 v2, 0x6e

    if-eq v1, v2, :cond_1

    iget v1, p0, Lcom/mp4parser/iso14496/part15/AvcDecoderConfigurationRecord;->avcProfileIndication:I

    const/16 v2, 0x7a

    if-eq v1, v2, :cond_1

    iget v1, p0, Lcom/mp4parser/iso14496/part15/AvcDecoderConfigurationRecord;->avcProfileIndication:I

    const/16 v2, 0x90

    if-ne v1, v2, :cond_5

    .line 78
    :cond_1
    new-instance v1, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/BitReaderBuffer;

    invoke-direct {v1, p1}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/BitReaderBuffer;-><init>(Ljava/nio/ByteBuffer;)V

    .line 79
    const/4 v2, 0x6

    invoke-virtual {v1, v2}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/BitReaderBuffer;->readBits(I)I

    move-result v2

    iput v2, p0, Lcom/mp4parser/iso14496/part15/AvcDecoderConfigurationRecord;->chromaFormatPaddingBits:I

    .line 80
    const/4 v2, 0x2

    invoke-virtual {v1, v2}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/BitReaderBuffer;->readBits(I)I

    move-result v2

    iput v2, p0, Lcom/mp4parser/iso14496/part15/AvcDecoderConfigurationRecord;->chromaFormat:I

    .line 81
    invoke-virtual {v1, v8}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/BitReaderBuffer;->readBits(I)I

    move-result v2

    iput v2, p0, Lcom/mp4parser/iso14496/part15/AvcDecoderConfigurationRecord;->bitDepthLumaMinus8PaddingBits:I

    .line 82
    invoke-virtual {v1, v7}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/BitReaderBuffer;->readBits(I)I

    move-result v2

    iput v2, p0, Lcom/mp4parser/iso14496/part15/AvcDecoderConfigurationRecord;->bitDepthLumaMinus8:I

    .line 83
    invoke-virtual {v1, v8}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/BitReaderBuffer;->readBits(I)I

    move-result v2

    iput v2, p0, Lcom/mp4parser/iso14496/part15/AvcDecoderConfigurationRecord;->bitDepthChromaMinus8PaddingBits:I

    .line 84
    invoke-virtual {v1, v7}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/BitReaderBuffer;->readBits(I)I

    move-result v1

    iput v1, p0, Lcom/mp4parser/iso14496/part15/AvcDecoderConfigurationRecord;->bitDepthChromaMinus8:I

    .line 85
    invoke-static {p1}, Lcom/coremedia/iso/IsoTypeReader;->readUInt8(Ljava/nio/ByteBuffer;)I

    move-result v1

    int-to-long v2, v1

    .line 86
    :goto_2
    int-to-long v4, v0

    cmp-long v1, v4, v2

    if-ltz v1, :cond_4

    .line 97
    :goto_3
    return-void

    .line 59
    :cond_2
    invoke-static {p1}, Lcom/coremedia/iso/IsoTypeReader;->readUInt16(Ljava/nio/ByteBuffer;)I

    move-result v3

    .line 61
    new-array v3, v3, [B

    .line 62
    invoke-virtual {p1, v3}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 63
    iget-object v4, p0, Lcom/mp4parser/iso14496/part15/AvcDecoderConfigurationRecord;->sequenceParameterSets:Ljava/util/List;

    invoke-interface {v4, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 58
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 67
    :cond_3
    invoke-static {p1}, Lcom/coremedia/iso/IsoTypeReader;->readUInt16(Ljava/nio/ByteBuffer;)I

    move-result v4

    .line 68
    new-array v4, v4, [B

    .line 69
    invoke-virtual {p1, v4}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 70
    iget-object v5, p0, Lcom/mp4parser/iso14496/part15/AvcDecoderConfigurationRecord;->pictureParameterSets:Ljava/util/List;

    invoke-interface {v5, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 66
    add-int/lit8 v1, v1, 0x1

    goto/16 :goto_1

    .line 87
    :cond_4
    invoke-static {p1}, Lcom/coremedia/iso/IsoTypeReader;->readUInt16(Ljava/nio/ByteBuffer;)I

    move-result v1

    .line 88
    new-array v1, v1, [B

    .line 89
    invoke-virtual {p1, v1}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 90
    iget-object v4, p0, Lcom/mp4parser/iso14496/part15/AvcDecoderConfigurationRecord;->sequenceParameterSetExts:Ljava/util/List;

    invoke-interface {v4, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 86
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    .line 93
    :cond_5
    iput v6, p0, Lcom/mp4parser/iso14496/part15/AvcDecoderConfigurationRecord;->chromaFormat:I

    .line 94
    iput v6, p0, Lcom/mp4parser/iso14496/part15/AvcDecoderConfigurationRecord;->bitDepthLumaMinus8:I

    .line 95
    iput v6, p0, Lcom/mp4parser/iso14496/part15/AvcDecoderConfigurationRecord;->bitDepthChromaMinus8:I

    goto :goto_3
.end method


# virtual methods
.method public getContent(Ljava/nio/ByteBuffer;)V
    .locals 7

    .prologue
    const/4 v6, 0x6

    const/4 v5, 0x2

    const/4 v4, 0x5

    const/4 v3, 0x3

    .line 100
    iget v0, p0, Lcom/mp4parser/iso14496/part15/AvcDecoderConfigurationRecord;->configurationVersion:I

    invoke-static {p1, v0}, Lcom/coremedia/iso/IsoTypeWriter;->writeUInt8(Ljava/nio/ByteBuffer;I)V

    .line 101
    iget v0, p0, Lcom/mp4parser/iso14496/part15/AvcDecoderConfigurationRecord;->avcProfileIndication:I

    invoke-static {p1, v0}, Lcom/coremedia/iso/IsoTypeWriter;->writeUInt8(Ljava/nio/ByteBuffer;I)V

    .line 102
    iget v0, p0, Lcom/mp4parser/iso14496/part15/AvcDecoderConfigurationRecord;->profileCompatibility:I

    invoke-static {p1, v0}, Lcom/coremedia/iso/IsoTypeWriter;->writeUInt8(Ljava/nio/ByteBuffer;I)V

    .line 103
    iget v0, p0, Lcom/mp4parser/iso14496/part15/AvcDecoderConfigurationRecord;->avcLevelIndication:I

    invoke-static {p1, v0}, Lcom/coremedia/iso/IsoTypeWriter;->writeUInt8(Ljava/nio/ByteBuffer;I)V

    .line 104
    new-instance v0, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/BitWriterBuffer;

    invoke-direct {v0, p1}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/BitWriterBuffer;-><init>(Ljava/nio/ByteBuffer;)V

    .line 105
    iget v1, p0, Lcom/mp4parser/iso14496/part15/AvcDecoderConfigurationRecord;->lengthSizeMinusOnePaddingBits:I

    invoke-virtual {v0, v1, v6}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/BitWriterBuffer;->writeBits(II)V

    .line 106
    iget v1, p0, Lcom/mp4parser/iso14496/part15/AvcDecoderConfigurationRecord;->lengthSizeMinusOne:I

    invoke-virtual {v0, v1, v5}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/BitWriterBuffer;->writeBits(II)V

    .line 107
    iget v1, p0, Lcom/mp4parser/iso14496/part15/AvcDecoderConfigurationRecord;->numberOfSequenceParameterSetsPaddingBits:I

    invoke-virtual {v0, v1, v3}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/BitWriterBuffer;->writeBits(II)V

    .line 108
    iget-object v1, p0, Lcom/mp4parser/iso14496/part15/AvcDecoderConfigurationRecord;->pictureParameterSets:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-virtual {v0, v1, v4}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/BitWriterBuffer;->writeBits(II)V

    .line 109
    iget-object v0, p0, Lcom/mp4parser/iso14496/part15/AvcDecoderConfigurationRecord;->sequenceParameterSets:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_2

    .line 113
    iget-object v0, p0, Lcom/mp4parser/iso14496/part15/AvcDecoderConfigurationRecord;->pictureParameterSets:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-static {p1, v0}, Lcom/coremedia/iso/IsoTypeWriter;->writeUInt8(Ljava/nio/ByteBuffer;I)V

    .line 114
    iget-object v0, p0, Lcom/mp4parser/iso14496/part15/AvcDecoderConfigurationRecord;->pictureParameterSets:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_3

    .line 118
    iget-boolean v0, p0, Lcom/mp4parser/iso14496/part15/AvcDecoderConfigurationRecord;->hasExts:Z

    if-eqz v0, :cond_1

    iget v0, p0, Lcom/mp4parser/iso14496/part15/AvcDecoderConfigurationRecord;->avcProfileIndication:I

    const/16 v1, 0x64

    if-eq v0, v1, :cond_0

    iget v0, p0, Lcom/mp4parser/iso14496/part15/AvcDecoderConfigurationRecord;->avcProfileIndication:I

    const/16 v1, 0x6e

    if-eq v0, v1, :cond_0

    iget v0, p0, Lcom/mp4parser/iso14496/part15/AvcDecoderConfigurationRecord;->avcProfileIndication:I

    const/16 v1, 0x7a

    if-eq v0, v1, :cond_0

    iget v0, p0, Lcom/mp4parser/iso14496/part15/AvcDecoderConfigurationRecord;->avcProfileIndication:I

    const/16 v1, 0x90

    if-ne v0, v1, :cond_1

    .line 120
    :cond_0
    new-instance v0, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/BitWriterBuffer;

    invoke-direct {v0, p1}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/BitWriterBuffer;-><init>(Ljava/nio/ByteBuffer;)V

    .line 121
    iget v1, p0, Lcom/mp4parser/iso14496/part15/AvcDecoderConfigurationRecord;->chromaFormatPaddingBits:I

    invoke-virtual {v0, v1, v6}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/BitWriterBuffer;->writeBits(II)V

    .line 122
    iget v1, p0, Lcom/mp4parser/iso14496/part15/AvcDecoderConfigurationRecord;->chromaFormat:I

    invoke-virtual {v0, v1, v5}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/BitWriterBuffer;->writeBits(II)V

    .line 123
    iget v1, p0, Lcom/mp4parser/iso14496/part15/AvcDecoderConfigurationRecord;->bitDepthLumaMinus8PaddingBits:I

    invoke-virtual {v0, v1, v4}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/BitWriterBuffer;->writeBits(II)V

    .line 124
    iget v1, p0, Lcom/mp4parser/iso14496/part15/AvcDecoderConfigurationRecord;->bitDepthLumaMinus8:I

    invoke-virtual {v0, v1, v3}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/BitWriterBuffer;->writeBits(II)V

    .line 125
    iget v1, p0, Lcom/mp4parser/iso14496/part15/AvcDecoderConfigurationRecord;->bitDepthChromaMinus8PaddingBits:I

    invoke-virtual {v0, v1, v4}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/BitWriterBuffer;->writeBits(II)V

    .line 126
    iget v1, p0, Lcom/mp4parser/iso14496/part15/AvcDecoderConfigurationRecord;->bitDepthChromaMinus8:I

    invoke-virtual {v0, v1, v3}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/BitWriterBuffer;->writeBits(II)V

    .line 127
    iget-object v0, p0, Lcom/mp4parser/iso14496/part15/AvcDecoderConfigurationRecord;->sequenceParameterSetExts:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_4

    .line 132
    :cond_1
    return-void

    .line 109
    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    .line 110
    array-length v2, v0

    invoke-static {p1, v2}, Lcom/coremedia/iso/IsoTypeWriter;->writeUInt16(Ljava/nio/ByteBuffer;I)V

    .line 111
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    goto :goto_0

    .line 114
    :cond_3
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    .line 115
    array-length v2, v0

    invoke-static {p1, v2}, Lcom/coremedia/iso/IsoTypeWriter;->writeUInt16(Ljava/nio/ByteBuffer;I)V

    .line 116
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    goto :goto_1

    .line 127
    :cond_4
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    .line 128
    array-length v2, v0

    invoke-static {p1, v2}, Lcom/coremedia/iso/IsoTypeWriter;->writeUInt16(Ljava/nio/ByteBuffer;I)V

    .line 129
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    goto :goto_2
.end method

.method public getContentSize()J
    .locals 8

    .prologue
    const-wide/16 v6, 0x2

    .line 135
    const-wide/16 v0, 0x6

    .line 137
    iget-object v2, p0, Lcom/mp4parser/iso14496/part15/AvcDecoderConfigurationRecord;->sequenceParameterSets:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    move-wide v2, v0

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_2

    .line 141
    const-wide/16 v0, 0x1

    add-long/2addr v0, v2

    .line 142
    iget-object v2, p0, Lcom/mp4parser/iso14496/part15/AvcDecoderConfigurationRecord;->pictureParameterSets:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    move-wide v2, v0

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_3

    .line 146
    iget-boolean v0, p0, Lcom/mp4parser/iso14496/part15/AvcDecoderConfigurationRecord;->hasExts:Z

    if-eqz v0, :cond_1

    iget v0, p0, Lcom/mp4parser/iso14496/part15/AvcDecoderConfigurationRecord;->avcProfileIndication:I

    const/16 v1, 0x64

    if-eq v0, v1, :cond_0

    iget v0, p0, Lcom/mp4parser/iso14496/part15/AvcDecoderConfigurationRecord;->avcProfileIndication:I

    const/16 v1, 0x6e

    if-eq v0, v1, :cond_0

    iget v0, p0, Lcom/mp4parser/iso14496/part15/AvcDecoderConfigurationRecord;->avcProfileIndication:I

    const/16 v1, 0x7a

    if-eq v0, v1, :cond_0

    iget v0, p0, Lcom/mp4parser/iso14496/part15/AvcDecoderConfigurationRecord;->avcProfileIndication:I

    const/16 v1, 0x90

    if-ne v0, v1, :cond_1

    .line 147
    :cond_0
    const-wide/16 v0, 0x4

    add-long/2addr v0, v2

    .line 148
    iget-object v2, p0, Lcom/mp4parser/iso14496/part15/AvcDecoderConfigurationRecord;->sequenceParameterSetExts:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    move-wide v2, v0

    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_4

    .line 154
    :cond_1
    return-wide v2

    .line 137
    :cond_2
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    .line 138
    add-long/2addr v2, v6

    .line 139
    array-length v0, v0

    int-to-long v0, v0

    add-long/2addr v0, v2

    move-wide v2, v0

    goto :goto_0

    .line 142
    :cond_3
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    .line 143
    add-long/2addr v2, v6

    .line 144
    array-length v0, v0

    int-to-long v0, v0

    add-long/2addr v0, v2

    move-wide v2, v0

    goto :goto_1

    .line 148
    :cond_4
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    .line 149
    add-long/2addr v2, v6

    .line 150
    array-length v0, v0

    int-to-long v0, v0

    add-long/2addr v0, v2

    move-wide v2, v0

    goto :goto_2
.end method

.method public getPPS()[Ljava/lang/String;
    .locals 6

    .prologue
    .line 158
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 159
    iget-object v0, p0, Lcom/mp4parser/iso14496/part15/AvcDecoderConfigurationRecord;->pictureParameterSets:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_0

    .line 170
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v0

    new-array v0, v0, [Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    return-object v0

    .line 159
    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    .line 160
    :try_start_0
    new-instance v3, Ljava/io/ByteArrayInputStream;

    const/4 v4, 0x1

    array-length v5, v0

    add-int/lit8 v5, v5, -0x1

    invoke-direct {v3, v0, v4, v5}, Ljava/io/ByteArrayInputStream;-><init>([BII)V

    invoke-static {v3}, Lcom/googlecode/mp4parser/h264/model/PictureParameterSet;->read(Ljava/io/InputStream;)Lcom/googlecode/mp4parser/h264/model/PictureParameterSet;

    move-result-object v0

    invoke-virtual {v0}, Lcom/googlecode/mp4parser/h264/model/PictureParameterSet;->toString()Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 168
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 164
    :catch_0
    move-exception v0

    .line 165
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public getPictureParameterSetsAsStrings()Ljava/util/List;
    .locals 3

    .prologue
    .line 204
    new-instance v1, Ljava/util/ArrayList;

    iget-object v0, p0, Lcom/mp4parser/iso14496/part15/AvcDecoderConfigurationRecord;->pictureParameterSets:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 205
    iget-object v0, p0, Lcom/mp4parser/iso14496/part15/AvcDecoderConfigurationRecord;->pictureParameterSets:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_0

    .line 208
    return-object v1

    .line 205
    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    .line 206
    invoke-static {v0}, Lcom/coremedia/iso/Hex;->encodeHex([B)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0
.end method

.method public getSPS()[Ljava/lang/String;
    .locals 8

    .prologue
    .line 174
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 175
    iget-object v0, p0, Lcom/mp4parser/iso14496/part15/AvcDecoderConfigurationRecord;->sequenceParameterSets:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_0

    .line 184
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v0

    new-array v0, v0, [Ljava/lang/String;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    return-object v0

    .line 175
    :cond_0
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    .line 176
    const-string v1, "not parsable"

    .line 178
    :try_start_0
    new-instance v4, Lcom/googlecode/mp4parser/authoring/tracks/CleanInputStream;

    new-instance v5, Ljava/io/ByteArrayInputStream;

    const/4 v6, 0x1

    array-length v7, v0

    add-int/lit8 v7, v7, -0x1

    invoke-direct {v5, v0, v6, v7}, Ljava/io/ByteArrayInputStream;-><init>([BII)V

    invoke-direct {v4, v5}, Lcom/googlecode/mp4parser/authoring/tracks/CleanInputStream;-><init>(Ljava/io/InputStream;)V

    invoke-static {v4}, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->read(Ljava/io/InputStream;)Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;

    move-result-object v0

    invoke-virtual {v0}, Lcom/googlecode/mp4parser/h264/model/SeqParameterSet;->toString()Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 182
    :goto_1
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :catch_0
    move-exception v0

    move-object v0, v1

    goto :goto_1
.end method

.method public getSequenceParameterSetExtsAsStrings()Ljava/util/List;
    .locals 3

    .prologue
    .line 196
    new-instance v1, Ljava/util/ArrayList;

    iget-object v0, p0, Lcom/mp4parser/iso14496/part15/AvcDecoderConfigurationRecord;->sequenceParameterSetExts:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 197
    iget-object v0, p0, Lcom/mp4parser/iso14496/part15/AvcDecoderConfigurationRecord;->sequenceParameterSetExts:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_0

    .line 200
    return-object v1

    .line 197
    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    .line 198
    invoke-static {v0}, Lcom/coremedia/iso/Hex;->encodeHex([B)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0
.end method

.method public getSequenceParameterSetsAsStrings()Ljava/util/List;
    .locals 3

    .prologue
    .line 188
    new-instance v1, Ljava/util/ArrayList;

    iget-object v0, p0, Lcom/mp4parser/iso14496/part15/AvcDecoderConfigurationRecord;->sequenceParameterSets:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 189
    iget-object v0, p0, Lcom/mp4parser/iso14496/part15/AvcDecoderConfigurationRecord;->sequenceParameterSets:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_0

    .line 192
    return-object v1

    .line 189
    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    .line 190
    invoke-static {v0}, Lcom/coremedia/iso/Hex;->encodeHex([B)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 213
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "AvcDecoderConfigurationRecord{configurationVersion="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 214
    iget v1, p0, Lcom/mp4parser/iso14496/part15/AvcDecoderConfigurationRecord;->configurationVersion:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 215
    const-string v1, ", avcProfileIndication="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/mp4parser/iso14496/part15/AvcDecoderConfigurationRecord;->avcProfileIndication:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 216
    const-string v1, ", profileCompatibility="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/mp4parser/iso14496/part15/AvcDecoderConfigurationRecord;->profileCompatibility:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 217
    const-string v1, ", avcLevelIndication="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/mp4parser/iso14496/part15/AvcDecoderConfigurationRecord;->avcLevelIndication:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 218
    const-string v1, ", lengthSizeMinusOne="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/mp4parser/iso14496/part15/AvcDecoderConfigurationRecord;->lengthSizeMinusOne:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 219
    const-string v1, ", hasExts="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v1, p0, Lcom/mp4parser/iso14496/part15/AvcDecoderConfigurationRecord;->hasExts:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 220
    const-string v1, ", chromaFormat="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/mp4parser/iso14496/part15/AvcDecoderConfigurationRecord;->chromaFormat:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 221
    const-string v1, ", bitDepthLumaMinus8="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/mp4parser/iso14496/part15/AvcDecoderConfigurationRecord;->bitDepthLumaMinus8:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 222
    const-string v1, ", bitDepthChromaMinus8="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/mp4parser/iso14496/part15/AvcDecoderConfigurationRecord;->bitDepthChromaMinus8:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 223
    const-string v1, ", lengthSizeMinusOnePaddingBits="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/mp4parser/iso14496/part15/AvcDecoderConfigurationRecord;->lengthSizeMinusOnePaddingBits:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 224
    const-string v1, ", numberOfSequenceParameterSetsPaddingBits="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/mp4parser/iso14496/part15/AvcDecoderConfigurationRecord;->numberOfSequenceParameterSetsPaddingBits:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 225
    const-string v1, ", chromaFormatPaddingBits="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/mp4parser/iso14496/part15/AvcDecoderConfigurationRecord;->chromaFormatPaddingBits:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 226
    const-string v1, ", bitDepthLumaMinus8PaddingBits="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/mp4parser/iso14496/part15/AvcDecoderConfigurationRecord;->bitDepthLumaMinus8PaddingBits:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 227
    const-string v1, ", bitDepthChromaMinus8PaddingBits="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/mp4parser/iso14496/part15/AvcDecoderConfigurationRecord;->bitDepthChromaMinus8PaddingBits:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 228
    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 213
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
