.class public Lcom/coremedia/iso/boxes/DataReferenceBox;
.super Lcom/googlecode/mp4parser/AbstractContainerBox;
.source "SourceFile"

# interfaces
.implements Lcom/coremedia/iso/boxes/FullBox;


# static fields
.field public static final TYPE:Ljava/lang/String; = "dref"


# instance fields
.field private flags:I

.field private version:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 47
    const-string v0, "dref"

    invoke-direct {p0, v0}, Lcom/googlecode/mp4parser/AbstractContainerBox;-><init>(Ljava/lang/String;)V

    .line 49
    return-void
.end method


# virtual methods
.method public getBox(Ljava/nio/channels/WritableByteChannel;)V
    .locals 4

    .prologue
    .line 85
    invoke-virtual {p0}, Lcom/coremedia/iso/boxes/DataReferenceBox;->getHeader()Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/nio/channels/WritableByteChannel;->write(Ljava/nio/ByteBuffer;)I

    .line 86
    const/16 v0, 0x8

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    .line 87
    iget v1, p0, Lcom/coremedia/iso/boxes/DataReferenceBox;->version:I

    invoke-static {v0, v1}, Lcom/coremedia/iso/IsoTypeWriter;->writeUInt8(Ljava/nio/ByteBuffer;I)V

    .line 88
    iget v1, p0, Lcom/coremedia/iso/boxes/DataReferenceBox;->flags:I

    invoke-static {v0, v1}, Lcom/coremedia/iso/IsoTypeWriter;->writeUInt24(Ljava/nio/ByteBuffer;I)V

    .line 89
    invoke-virtual {p0}, Lcom/coremedia/iso/boxes/DataReferenceBox;->getBoxes()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    int-to-long v2, v1

    invoke-static {v0, v2, v3}, Lcom/coremedia/iso/IsoTypeWriter;->writeUInt32(Ljava/nio/ByteBuffer;J)V

    .line 90
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    move-result-object v0

    check-cast v0, Ljava/nio/ByteBuffer;

    invoke-interface {p1, v0}, Ljava/nio/channels/WritableByteChannel;->write(Ljava/nio/ByteBuffer;)I

    .line 91
    invoke-virtual {p0, p1}, Lcom/coremedia/iso/boxes/DataReferenceBox;->writeContainer(Ljava/nio/channels/WritableByteChannel;)V

    .line 92
    return-void
.end method

.method public getFlags()I
    .locals 1

    .prologue
    .line 63
    iget v0, p0, Lcom/coremedia/iso/boxes/DataReferenceBox;->flags:I

    return v0
.end method

.method public getSize()J
    .locals 8

    .prologue
    const-wide/16 v6, 0x8

    .line 96
    invoke-virtual {p0}, Lcom/coremedia/iso/boxes/DataReferenceBox;->getContainerSize()J

    move-result-wide v0

    .line 97
    add-long v2, v0, v6

    iget-boolean v4, p0, Lcom/coremedia/iso/boxes/DataReferenceBox;->largeBox:Z

    if-nez v4, :cond_0

    add-long/2addr v0, v6

    add-long/2addr v0, v6

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

.method public getVersion()I
    .locals 1

    .prologue
    .line 55
    iget v0, p0, Lcom/coremedia/iso/boxes/DataReferenceBox;->version:I

    return v0
.end method

.method public parse(Lcom/googlecode/mp4parser/DataSource;Ljava/nio/ByteBuffer;JLcom/coremedia/iso/BoxParser;)V
    .locals 3

    .prologue
    .line 73
    const/16 v0, 0x8

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    .line 74
    invoke-interface {p1, v0}, Lcom/googlecode/mp4parser/DataSource;->read(Ljava/nio/ByteBuffer;)I

    .line 75
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    .line 76
    invoke-static {v0}, Lcom/coremedia/iso/IsoTypeReader;->readUInt8(Ljava/nio/ByteBuffer;)I

    move-result v1

    iput v1, p0, Lcom/coremedia/iso/boxes/DataReferenceBox;->version:I

    .line 77
    invoke-static {v0}, Lcom/coremedia/iso/IsoTypeReader;->readUInt24(Ljava/nio/ByteBuffer;)I

    move-result v0

    iput v0, p0, Lcom/coremedia/iso/boxes/DataReferenceBox;->flags:I

    .line 79
    const-wide/16 v0, 0x8

    sub-long v0, p3, v0

    invoke-virtual {p0, p1, v0, v1, p5}, Lcom/coremedia/iso/boxes/DataReferenceBox;->initContainer(Lcom/googlecode/mp4parser/DataSource;JLcom/coremedia/iso/BoxParser;)V

    .line 80
    return-void
.end method

.method public setFlags(I)V
    .locals 0

    .prologue
    .line 67
    iput p1, p0, Lcom/coremedia/iso/boxes/DataReferenceBox;->flags:I

    .line 68
    return-void
.end method

.method public setVersion(I)V
    .locals 0

    .prologue
    .line 59
    iput p1, p0, Lcom/coremedia/iso/boxes/DataReferenceBox;->version:I

    .line 60
    return-void
.end method
