.class public Lcom/coremedia/iso/boxes/sampleentry/Ovc1VisualSampleEntryImpl;
.super Lcom/coremedia/iso/boxes/sampleentry/AbstractSampleEntry;
.source "SourceFile"


# static fields
.field public static final TYPE:Ljava/lang/String; = "ovc1"


# instance fields
.field private vc1Content:[B


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 22
    const-string v0, "ovc1"

    invoke-direct {p0, v0}, Lcom/coremedia/iso/boxes/sampleentry/AbstractSampleEntry;-><init>(Ljava/lang/String;)V

    .line 18
    const/4 v0, 0x0

    new-array v0, v0, [B

    iput-object v0, p0, Lcom/coremedia/iso/boxes/sampleentry/Ovc1VisualSampleEntryImpl;->vc1Content:[B

    .line 23
    return-void
.end method


# virtual methods
.method public getBox(Ljava/nio/channels/WritableByteChannel;)V
    .locals 2

    .prologue
    .line 46
    invoke-virtual {p0}, Lcom/coremedia/iso/boxes/sampleentry/Ovc1VisualSampleEntryImpl;->getHeader()Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/nio/channels/WritableByteChannel;->write(Ljava/nio/ByteBuffer;)I

    .line 47
    const/16 v0, 0x8

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    .line 48
    const/4 v1, 0x6

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 49
    iget v1, p0, Lcom/coremedia/iso/boxes/sampleentry/Ovc1VisualSampleEntryImpl;->dataReferenceIndex:I

    invoke-static {v0, v1}, Lcom/coremedia/iso/IsoTypeWriter;->writeUInt16(Ljava/nio/ByteBuffer;I)V

    .line 50
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    move-result-object v0

    check-cast v0, Ljava/nio/ByteBuffer;

    invoke-interface {p1, v0}, Ljava/nio/channels/WritableByteChannel;->write(Ljava/nio/ByteBuffer;)I

    .line 51
    iget-object v0, p0, Lcom/coremedia/iso/boxes/sampleentry/Ovc1VisualSampleEntryImpl;->vc1Content:[B

    invoke-static {v0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/nio/channels/WritableByteChannel;->write(Ljava/nio/ByteBuffer;)I

    .line 52
    return-void
.end method

.method public getSize()J
    .locals 4

    .prologue
    .line 56
    iget-boolean v0, p0, Lcom/coremedia/iso/boxes/sampleentry/Ovc1VisualSampleEntryImpl;->largeBox:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/coremedia/iso/boxes/sampleentry/Ovc1VisualSampleEntryImpl;->vc1Content:[B

    array-length v0, v0

    add-int/lit8 v0, v0, 0x10

    int-to-long v0, v0

    const-wide v2, 0x100000000L

    cmp-long v0, v0, v2

    if-ltz v0, :cond_1

    :cond_0
    const/16 v0, 0x10

    :goto_0
    int-to-long v0, v0

    .line 57
    iget-object v2, p0, Lcom/coremedia/iso/boxes/sampleentry/Ovc1VisualSampleEntryImpl;->vc1Content:[B

    array-length v2, v2

    int-to-long v2, v2

    add-long/2addr v0, v2

    const-wide/16 v2, 0x8

    add-long/2addr v0, v2

    return-wide v0

    .line 56
    :cond_1
    const/16 v0, 0x8

    goto :goto_0
.end method

.method public getVc1Content()[B
    .locals 1

    .prologue
    .line 26
    iget-object v0, p0, Lcom/coremedia/iso/boxes/sampleentry/Ovc1VisualSampleEntryImpl;->vc1Content:[B

    return-object v0
.end method

.method public parse(Lcom/googlecode/mp4parser/DataSource;Ljava/nio/ByteBuffer;JLcom/coremedia/iso/BoxParser;)V
    .locals 3

    .prologue
    .line 35
    invoke-static {p3, p4}, Lcom/googlecode/mp4parser/util/CastUtils;->l2i(J)I

    move-result v0

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    .line 36
    invoke-interface {p1, v0}, Lcom/googlecode/mp4parser/DataSource;->read(Ljava/nio/ByteBuffer;)I

    .line 37
    const/4 v1, 0x6

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 38
    invoke-static {v0}, Lcom/coremedia/iso/IsoTypeReader;->readUInt16(Ljava/nio/ByteBuffer;)I

    move-result v1

    iput v1, p0, Lcom/coremedia/iso/boxes/sampleentry/Ovc1VisualSampleEntryImpl;->dataReferenceIndex:I

    .line 39
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v1

    new-array v1, v1, [B

    iput-object v1, p0, Lcom/coremedia/iso/boxes/sampleentry/Ovc1VisualSampleEntryImpl;->vc1Content:[B

    .line 40
    iget-object v1, p0, Lcom/coremedia/iso/boxes/sampleentry/Ovc1VisualSampleEntryImpl;->vc1Content:[B

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 41
    return-void
.end method

.method public setVc1Content([B)V
    .locals 0

    .prologue
    .line 30
    iput-object p1, p0, Lcom/coremedia/iso/boxes/sampleentry/Ovc1VisualSampleEntryImpl;->vc1Content:[B

    .line 31
    return-void
.end method
