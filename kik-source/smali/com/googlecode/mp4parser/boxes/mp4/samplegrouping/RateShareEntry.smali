.class public Lcom/googlecode/mp4parser/boxes/mp4/samplegrouping/RateShareEntry;
.super Lcom/googlecode/mp4parser/boxes/mp4/samplegrouping/GroupEntry;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/googlecode/mp4parser/boxes/mp4/samplegrouping/RateShareEntry$Entry;
    }
.end annotation


# static fields
.field public static final TYPE:Ljava/lang/String; = "rash"


# instance fields
.field private discardPriority:S

.field private entries:Ljava/util/List;

.field private maximumBitrate:I

.field private minimumBitrate:I

.field private operationPointCut:S

.field private targetRateShare:S


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 46
    invoke-direct {p0}, Lcom/googlecode/mp4parser/boxes/mp4/samplegrouping/GroupEntry;-><init>()V

    .line 51
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lcom/googlecode/mp4parser/boxes/mp4/samplegrouping/RateShareEntry;->entries:Ljava/util/List;

    .line 46
    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 98
    if-ne p0, p1, :cond_1

    .line 126
    :cond_0
    :goto_0
    return v0

    .line 101
    :cond_1
    if-eqz p1, :cond_2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_3

    :cond_2
    move v0, v1

    .line 102
    goto :goto_0

    .line 105
    :cond_3
    check-cast p1, Lcom/googlecode/mp4parser/boxes/mp4/samplegrouping/RateShareEntry;

    .line 107
    iget-short v2, p0, Lcom/googlecode/mp4parser/boxes/mp4/samplegrouping/RateShareEntry;->discardPriority:S

    iget-short v3, p1, Lcom/googlecode/mp4parser/boxes/mp4/samplegrouping/RateShareEntry;->discardPriority:S

    if-eq v2, v3, :cond_4

    move v0, v1

    .line 108
    goto :goto_0

    .line 110
    :cond_4
    iget v2, p0, Lcom/googlecode/mp4parser/boxes/mp4/samplegrouping/RateShareEntry;->maximumBitrate:I

    iget v3, p1, Lcom/googlecode/mp4parser/boxes/mp4/samplegrouping/RateShareEntry;->maximumBitrate:I

    if-eq v2, v3, :cond_5

    move v0, v1

    .line 111
    goto :goto_0

    .line 113
    :cond_5
    iget v2, p0, Lcom/googlecode/mp4parser/boxes/mp4/samplegrouping/RateShareEntry;->minimumBitrate:I

    iget v3, p1, Lcom/googlecode/mp4parser/boxes/mp4/samplegrouping/RateShareEntry;->minimumBitrate:I

    if-eq v2, v3, :cond_6

    move v0, v1

    .line 114
    goto :goto_0

    .line 116
    :cond_6
    iget-short v2, p0, Lcom/googlecode/mp4parser/boxes/mp4/samplegrouping/RateShareEntry;->operationPointCut:S

    iget-short v3, p1, Lcom/googlecode/mp4parser/boxes/mp4/samplegrouping/RateShareEntry;->operationPointCut:S

    if-eq v2, v3, :cond_7

    move v0, v1

    .line 117
    goto :goto_0

    .line 119
    :cond_7
    iget-short v2, p0, Lcom/googlecode/mp4parser/boxes/mp4/samplegrouping/RateShareEntry;->targetRateShare:S

    iget-short v3, p1, Lcom/googlecode/mp4parser/boxes/mp4/samplegrouping/RateShareEntry;->targetRateShare:S

    if-eq v2, v3, :cond_8

    move v0, v1

    .line 120
    goto :goto_0

    .line 122
    :cond_8
    iget-object v2, p0, Lcom/googlecode/mp4parser/boxes/mp4/samplegrouping/RateShareEntry;->entries:Ljava/util/List;

    if-eqz v2, :cond_9

    iget-object v2, p0, Lcom/googlecode/mp4parser/boxes/mp4/samplegrouping/RateShareEntry;->entries:Ljava/util/List;

    iget-object v3, p1, Lcom/googlecode/mp4parser/boxes/mp4/samplegrouping/RateShareEntry;->entries:Ljava/util/List;

    invoke-interface {v2, v3}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    :goto_1
    move v0, v1

    .line 123
    goto :goto_0

    .line 122
    :cond_9
    iget-object v2, p1, Lcom/googlecode/mp4parser/boxes/mp4/samplegrouping/RateShareEntry;->entries:Ljava/util/List;

    if-eqz v2, :cond_0

    goto :goto_1
.end method

.method public get()Ljava/nio/ByteBuffer;
    .locals 4

    .prologue
    const/4 v2, 0x1

    .line 79
    iget-short v0, p0, Lcom/googlecode/mp4parser/boxes/mp4/samplegrouping/RateShareEntry;->operationPointCut:S

    if-ne v0, v2, :cond_1

    const/16 v0, 0xd

    :goto_0
    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v1

    .line 80
    iget-short v0, p0, Lcom/googlecode/mp4parser/boxes/mp4/samplegrouping/RateShareEntry;->operationPointCut:S

    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 81
    iget-short v0, p0, Lcom/googlecode/mp4parser/boxes/mp4/samplegrouping/RateShareEntry;->operationPointCut:S

    if-ne v0, v2, :cond_2

    .line 82
    iget-short v0, p0, Lcom/googlecode/mp4parser/boxes/mp4/samplegrouping/RateShareEntry;->targetRateShare:S

    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 89
    :cond_0
    iget v0, p0, Lcom/googlecode/mp4parser/boxes/mp4/samplegrouping/RateShareEntry;->maximumBitrate:I

    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 90
    iget v0, p0, Lcom/googlecode/mp4parser/boxes/mp4/samplegrouping/RateShareEntry;->minimumBitrate:I

    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 91
    iget-short v0, p0, Lcom/googlecode/mp4parser/boxes/mp4/samplegrouping/RateShareEntry;->discardPriority:S

    invoke-static {v1, v0}, Lcom/coremedia/iso/IsoTypeWriter;->writeUInt8(Ljava/nio/ByteBuffer;I)V

    .line 92
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    .line 93
    return-object v1

    .line 79
    :cond_1
    iget-short v0, p0, Lcom/googlecode/mp4parser/boxes/mp4/samplegrouping/RateShareEntry;->operationPointCut:S

    mul-int/lit8 v0, v0, 0x6

    add-int/lit8 v0, v0, 0xb

    goto :goto_0

    .line 84
    :cond_2
    iget-object v0, p0, Lcom/googlecode/mp4parser/boxes/mp4/samplegrouping/RateShareEntry;->entries:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/googlecode/mp4parser/boxes/mp4/samplegrouping/RateShareEntry$Entry;

    .line 85
    invoke-virtual {v0}, Lcom/googlecode/mp4parser/boxes/mp4/samplegrouping/RateShareEntry$Entry;->getAvailableBitrate()I

    move-result v3

    invoke-virtual {v1, v3}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 86
    invoke-virtual {v0}, Lcom/googlecode/mp4parser/boxes/mp4/samplegrouping/RateShareEntry$Entry;->getTargetRateShare()S

    move-result v0

    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    goto :goto_1
.end method

.method public getDiscardPriority()S
    .locals 1

    .prologue
    .line 181
    iget-short v0, p0, Lcom/googlecode/mp4parser/boxes/mp4/samplegrouping/RateShareEntry;->discardPriority:S

    return v0
.end method

.method public getEntries()Ljava/util/List;
    .locals 1

    .prologue
    .line 157
    iget-object v0, p0, Lcom/googlecode/mp4parser/boxes/mp4/samplegrouping/RateShareEntry;->entries:Ljava/util/List;

    return-object v0
.end method

.method public getMaximumBitrate()I
    .locals 1

    .prologue
    .line 165
    iget v0, p0, Lcom/googlecode/mp4parser/boxes/mp4/samplegrouping/RateShareEntry;->maximumBitrate:I

    return v0
.end method

.method public getMinimumBitrate()I
    .locals 1

    .prologue
    .line 173
    iget v0, p0, Lcom/googlecode/mp4parser/boxes/mp4/samplegrouping/RateShareEntry;->minimumBitrate:I

    return v0
.end method

.method public getOperationPointCut()S
    .locals 1

    .prologue
    .line 141
    iget-short v0, p0, Lcom/googlecode/mp4parser/boxes/mp4/samplegrouping/RateShareEntry;->operationPointCut:S

    return v0
.end method

.method public getTargetRateShare()S
    .locals 1

    .prologue
    .line 149
    iget-short v0, p0, Lcom/googlecode/mp4parser/boxes/mp4/samplegrouping/RateShareEntry;->targetRateShare:S

    return v0
.end method

.method public getType()Ljava/lang/String;
    .locals 1

    .prologue
    .line 58
    const-string v0, "rash"

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    .prologue
    .line 131
    iget-short v0, p0, Lcom/googlecode/mp4parser/boxes/mp4/samplegrouping/RateShareEntry;->operationPointCut:S

    .line 132
    mul-int/lit8 v0, v0, 0x1f

    iget-short v1, p0, Lcom/googlecode/mp4parser/boxes/mp4/samplegrouping/RateShareEntry;->targetRateShare:S

    add-int/2addr v0, v1

    .line 133
    mul-int/lit8 v1, v0, 0x1f

    iget-object v0, p0, Lcom/googlecode/mp4parser/boxes/mp4/samplegrouping/RateShareEntry;->entries:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/googlecode/mp4parser/boxes/mp4/samplegrouping/RateShareEntry;->entries:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->hashCode()I

    move-result v0

    :goto_0
    add-int/2addr v0, v1

    .line 134
    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/googlecode/mp4parser/boxes/mp4/samplegrouping/RateShareEntry;->maximumBitrate:I

    add-int/2addr v0, v1

    .line 135
    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/googlecode/mp4parser/boxes/mp4/samplegrouping/RateShareEntry;->minimumBitrate:I

    add-int/2addr v0, v1

    .line 136
    mul-int/lit8 v0, v0, 0x1f

    iget-short v1, p0, Lcom/googlecode/mp4parser/boxes/mp4/samplegrouping/RateShareEntry;->discardPriority:S

    add-int/2addr v0, v1

    .line 137
    return v0

    .line 133
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public parse(Ljava/nio/ByteBuffer;)V
    .locals 6

    .prologue
    .line 63
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->getShort()S

    move-result v0

    iput-short v0, p0, Lcom/googlecode/mp4parser/boxes/mp4/samplegrouping/RateShareEntry;->operationPointCut:S

    .line 64
    iget-short v0, p0, Lcom/googlecode/mp4parser/boxes/mp4/samplegrouping/RateShareEntry;->operationPointCut:S

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 65
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->getShort()S

    move-result v0

    iput-short v0, p0, Lcom/googlecode/mp4parser/boxes/mp4/samplegrouping/RateShareEntry;->targetRateShare:S

    .line 72
    :cond_0
    invoke-static {p1}, Lcom/coremedia/iso/IsoTypeReader;->readUInt32(Ljava/nio/ByteBuffer;)J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/CastUtils;->l2i(J)I

    move-result v0

    iput v0, p0, Lcom/googlecode/mp4parser/boxes/mp4/samplegrouping/RateShareEntry;->maximumBitrate:I

    .line 73
    invoke-static {p1}, Lcom/coremedia/iso/IsoTypeReader;->readUInt32(Ljava/nio/ByteBuffer;)J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/CastUtils;->l2i(J)I

    move-result v0

    iput v0, p0, Lcom/googlecode/mp4parser/boxes/mp4/samplegrouping/RateShareEntry;->minimumBitrate:I

    .line 74
    invoke-static {p1}, Lcom/coremedia/iso/IsoTypeReader;->readUInt8(Ljava/nio/ByteBuffer;)I

    move-result v0

    int-to-short v0, v0

    iput-short v0, p0, Lcom/googlecode/mp4parser/boxes/mp4/samplegrouping/RateShareEntry;->discardPriority:S

    .line 75
    return-void

    .line 67
    :cond_1
    iget-short v0, p0, Lcom/googlecode/mp4parser/boxes/mp4/samplegrouping/RateShareEntry;->operationPointCut:S

    .line 68
    :goto_0
    add-int/lit8 v1, v0, -0x1

    if-lez v0, :cond_0

    .line 69
    iget-object v0, p0, Lcom/googlecode/mp4parser/boxes/mp4/samplegrouping/RateShareEntry;->entries:Ljava/util/List;

    new-instance v2, Lcom/googlecode/mp4parser/boxes/mp4/samplegrouping/RateShareEntry$Entry;

    invoke-static {p1}, Lcom/coremedia/iso/IsoTypeReader;->readUInt32(Ljava/nio/ByteBuffer;)J

    move-result-wide v4

    invoke-static {v4, v5}, Lcom/googlecode/mp4parser/util/CastUtils;->l2i(J)I

    move-result v3

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->getShort()S

    move-result v4

    invoke-direct {v2, v3, v4}, Lcom/googlecode/mp4parser/boxes/mp4/samplegrouping/RateShareEntry$Entry;-><init>(IS)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move v0, v1

    goto :goto_0
.end method

.method public setDiscardPriority(S)V
    .locals 0

    .prologue
    .line 185
    iput-short p1, p0, Lcom/googlecode/mp4parser/boxes/mp4/samplegrouping/RateShareEntry;->discardPriority:S

    .line 186
    return-void
.end method

.method public setEntries(Ljava/util/List;)V
    .locals 0

    .prologue
    .line 161
    iput-object p1, p0, Lcom/googlecode/mp4parser/boxes/mp4/samplegrouping/RateShareEntry;->entries:Ljava/util/List;

    .line 162
    return-void
.end method

.method public setMaximumBitrate(I)V
    .locals 0

    .prologue
    .line 169
    iput p1, p0, Lcom/googlecode/mp4parser/boxes/mp4/samplegrouping/RateShareEntry;->maximumBitrate:I

    .line 170
    return-void
.end method

.method public setMinimumBitrate(I)V
    .locals 0

    .prologue
    .line 177
    iput p1, p0, Lcom/googlecode/mp4parser/boxes/mp4/samplegrouping/RateShareEntry;->minimumBitrate:I

    .line 178
    return-void
.end method

.method public setOperationPointCut(S)V
    .locals 0

    .prologue
    .line 145
    iput-short p1, p0, Lcom/googlecode/mp4parser/boxes/mp4/samplegrouping/RateShareEntry;->operationPointCut:S

    .line 146
    return-void
.end method

.method public setTargetRateShare(S)V
    .locals 0

    .prologue
    .line 153
    iput-short p1, p0, Lcom/googlecode/mp4parser/boxes/mp4/samplegrouping/RateShareEntry;->targetRateShare:S

    .line 154
    return-void
.end method
