.class public Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/InitialObjectDescriptor;
.super Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/ObjectDescriptorBase;
.source "SourceFile"


# instance fields
.field audioProfileLevelIndication:I

.field esDescriptors:Ljava/util/List;

.field extensionDescriptors:Ljava/util/List;

.field graphicsProfileLevelIndication:I

.field includeInlineProfileLevelFlag:I

.field oDProfileLevelIndication:I

.field private objectDescriptorId:I

.field sceneProfileLevelIndication:I

.field unknownDescriptors:Ljava/util/List;

.field urlFlag:I

.field urlLength:I

.field urlString:Ljava/lang/String;

.field visualProfileLevelIndication:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 53
    invoke-direct {p0}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/ObjectDescriptorBase;-><init>()V

    .line 67
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/InitialObjectDescriptor;->esDescriptors:Ljava/util/List;

    .line 69
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/InitialObjectDescriptor;->extensionDescriptors:Ljava/util/List;

    .line 71
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/InitialObjectDescriptor;->unknownDescriptors:Ljava/util/List;

    .line 53
    return-void
.end method


# virtual methods
.method public parseDetail(Ljava/nio/ByteBuffer;)V
    .locals 5

    .prologue
    const/4 v4, 0x2

    const/4 v3, -0x1

    .line 75
    invoke-static {p1}, Lcom/coremedia/iso/IsoTypeReader;->readUInt16(Ljava/nio/ByteBuffer;)I

    move-result v0

    .line 76
    const v1, 0xffc0

    and-int/2addr v1, v0

    shr-int/lit8 v1, v1, 0x6

    iput v1, p0, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/InitialObjectDescriptor;->objectDescriptorId:I

    .line 78
    and-int/lit8 v1, v0, 0x3f

    shr-int/lit8 v1, v1, 0x5

    iput v1, p0, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/InitialObjectDescriptor;->urlFlag:I

    .line 79
    and-int/lit8 v0, v0, 0x1f

    shr-int/lit8 v0, v0, 0x4

    iput v0, p0, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/InitialObjectDescriptor;->includeInlineProfileLevelFlag:I

    .line 81
    invoke-virtual {p0}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/InitialObjectDescriptor;->getSize()I

    move-result v0

    add-int/lit8 v0, v0, -0x2

    .line 82
    iget v1, p0, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/InitialObjectDescriptor;->urlFlag:I

    const/4 v2, 0x1

    if-ne v1, v2, :cond_1

    .line 83
    invoke-static {p1}, Lcom/coremedia/iso/IsoTypeReader;->readUInt8(Ljava/nio/ByteBuffer;)I

    move-result v1

    iput v1, p0, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/InitialObjectDescriptor;->urlLength:I

    .line 84
    iget v1, p0, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/InitialObjectDescriptor;->urlLength:I

    invoke-static {p1, v1}, Lcom/coremedia/iso/IsoTypeReader;->readString(Ljava/nio/ByteBuffer;I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/InitialObjectDescriptor;->urlString:Ljava/lang/String;

    .line 85
    iget v1, p0, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/InitialObjectDescriptor;->urlLength:I

    add-int/lit8 v1, v1, 0x1

    sub-int/2addr v0, v1

    .line 106
    :goto_0
    if-le v0, v4, :cond_0

    .line 107
    invoke-static {v3, p1}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/ObjectDescriptorFactory;->createFrom(ILjava/nio/ByteBuffer;)Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/BaseDescriptor;

    move-result-object v0

    .line 108
    instance-of v1, v0, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/ExtensionDescriptor;

    if-eqz v1, :cond_4

    .line 109
    iget-object v1, p0, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/InitialObjectDescriptor;->extensionDescriptors:Ljava/util/List;

    check-cast v0, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/ExtensionDescriptor;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 114
    :cond_0
    :goto_1
    return-void

    .line 87
    :cond_1
    invoke-static {p1}, Lcom/coremedia/iso/IsoTypeReader;->readUInt8(Ljava/nio/ByteBuffer;)I

    move-result v1

    iput v1, p0, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/InitialObjectDescriptor;->oDProfileLevelIndication:I

    .line 88
    invoke-static {p1}, Lcom/coremedia/iso/IsoTypeReader;->readUInt8(Ljava/nio/ByteBuffer;)I

    move-result v1

    iput v1, p0, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/InitialObjectDescriptor;->sceneProfileLevelIndication:I

    .line 89
    invoke-static {p1}, Lcom/coremedia/iso/IsoTypeReader;->readUInt8(Ljava/nio/ByteBuffer;)I

    move-result v1

    iput v1, p0, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/InitialObjectDescriptor;->audioProfileLevelIndication:I

    .line 90
    invoke-static {p1}, Lcom/coremedia/iso/IsoTypeReader;->readUInt8(Ljava/nio/ByteBuffer;)I

    move-result v1

    iput v1, p0, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/InitialObjectDescriptor;->visualProfileLevelIndication:I

    .line 91
    invoke-static {p1}, Lcom/coremedia/iso/IsoTypeReader;->readUInt8(Ljava/nio/ByteBuffer;)I

    move-result v1

    iput v1, p0, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/InitialObjectDescriptor;->graphicsProfileLevelIndication:I

    .line 93
    add-int/lit8 v1, v0, -0x5

    .line 95
    if-le v1, v4, :cond_3

    .line 96
    invoke-static {v3, p1}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/ObjectDescriptorFactory;->createFrom(ILjava/nio/ByteBuffer;)Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/BaseDescriptor;

    move-result-object v0

    .line 97
    invoke-virtual {v0}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/BaseDescriptor;->getSize()I

    move-result v2

    sub-int/2addr v1, v2

    .line 98
    instance-of v2, v0, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/ESDescriptor;

    if-eqz v2, :cond_2

    .line 99
    iget-object v2, p0, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/InitialObjectDescriptor;->esDescriptors:Ljava/util/List;

    check-cast v0, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/ESDescriptor;

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move v0, v1

    .line 100
    goto :goto_0

    .line 101
    :cond_2
    iget-object v2, p0, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/InitialObjectDescriptor;->unknownDescriptors:Ljava/util/List;

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_3
    move v0, v1

    goto :goto_0

    .line 111
    :cond_4
    iget-object v1, p0, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/InitialObjectDescriptor;->unknownDescriptors:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .prologue
    .line 118
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 119
    const-string v1, "InitialObjectDescriptor"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 120
    const-string v1, "{objectDescriptorId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/InitialObjectDescriptor;->objectDescriptorId:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 121
    const-string v1, ", urlFlag="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/InitialObjectDescriptor;->urlFlag:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 122
    const-string v1, ", includeInlineProfileLevelFlag="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/InitialObjectDescriptor;->includeInlineProfileLevelFlag:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 123
    const-string v1, ", urlLength="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/InitialObjectDescriptor;->urlLength:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 124
    const-string v1, ", urlString=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/InitialObjectDescriptor;->urlString:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const/16 v2, 0x27

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 125
    const-string v1, ", oDProfileLevelIndication="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/InitialObjectDescriptor;->oDProfileLevelIndication:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 126
    const-string v1, ", sceneProfileLevelIndication="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/InitialObjectDescriptor;->sceneProfileLevelIndication:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 127
    const-string v1, ", audioProfileLevelIndication="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/InitialObjectDescriptor;->audioProfileLevelIndication:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 128
    const-string v1, ", visualProfileLevelIndication="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/InitialObjectDescriptor;->visualProfileLevelIndication:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 129
    const-string v1, ", graphicsProfileLevelIndication="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/InitialObjectDescriptor;->graphicsProfileLevelIndication:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 130
    const-string v1, ", esDescriptors="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/InitialObjectDescriptor;->esDescriptors:Ljava/util/List;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 131
    const-string v1, ", extensionDescriptors="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/InitialObjectDescriptor;->extensionDescriptors:Ljava/util/List;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 132
    const-string v1, ", unknownDescriptors="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/InitialObjectDescriptor;->unknownDescriptors:Ljava/util/List;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 133
    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 134
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
