.class Lcom/coremedia/iso/boxes/sampleentry/AudioSampleEntry$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/coremedia/iso/boxes/Box;


# instance fields
.field final synthetic this$0:Lcom/coremedia/iso/boxes/sampleentry/AudioSampleEntry;

.field private final synthetic val$owmaSpecifics:Ljava/nio/ByteBuffer;

.field private final synthetic val$remaining:J


# direct methods
.method constructor <init>(Lcom/coremedia/iso/boxes/sampleentry/AudioSampleEntry;JLjava/nio/ByteBuffer;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/coremedia/iso/boxes/sampleentry/AudioSampleEntry$1;->this$0:Lcom/coremedia/iso/boxes/sampleentry/AudioSampleEntry;

    iput-wide p2, p0, Lcom/coremedia/iso/boxes/sampleentry/AudioSampleEntry$1;->val$remaining:J

    iput-object p4, p0, Lcom/coremedia/iso/boxes/sampleentry/AudioSampleEntry$1;->val$owmaSpecifics:Ljava/nio/ByteBuffer;

    .line 248
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getBox(Ljava/nio/channels/WritableByteChannel;)V
    .locals 1

    .prologue
    .line 270
    iget-object v0, p0, Lcom/coremedia/iso/boxes/sampleentry/AudioSampleEntry$1;->val$owmaSpecifics:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    .line 271
    iget-object v0, p0, Lcom/coremedia/iso/boxes/sampleentry/AudioSampleEntry$1;->val$owmaSpecifics:Ljava/nio/ByteBuffer;

    invoke-interface {p1, v0}, Ljava/nio/channels/WritableByteChannel;->write(Ljava/nio/ByteBuffer;)I

    .line 272
    return-void
.end method

.method public getOffset()J
    .locals 2

    .prologue
    .line 262
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public getParent()Lcom/coremedia/iso/boxes/Container;
    .locals 1

    .prologue
    .line 250
    iget-object v0, p0, Lcom/coremedia/iso/boxes/sampleentry/AudioSampleEntry$1;->this$0:Lcom/coremedia/iso/boxes/sampleentry/AudioSampleEntry;

    return-object v0
.end method

.method public getSize()J
    .locals 2

    .prologue
    .line 258
    iget-wide v0, p0, Lcom/coremedia/iso/boxes/sampleentry/AudioSampleEntry$1;->val$remaining:J

    return-wide v0
.end method

.method public getType()Ljava/lang/String;
    .locals 1

    .prologue
    .line 266
    const-string v0, "----"

    return-object v0
.end method

.method public parse(Lcom/googlecode/mp4parser/DataSource;Ljava/nio/ByteBuffer;JLcom/coremedia/iso/BoxParser;)V
    .locals 2

    .prologue
    .line 275
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "NotImplemented"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public setParent(Lcom/coremedia/iso/boxes/Container;)V
    .locals 2

    .prologue
    .line 254
    sget-boolean v0, Lcom/coremedia/iso/boxes/sampleentry/AudioSampleEntry;->$assertionsDisabled:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/coremedia/iso/boxes/sampleentry/AudioSampleEntry$1;->this$0:Lcom/coremedia/iso/boxes/sampleentry/AudioSampleEntry;

    if-eq p1, v0, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    const-string v1, "you cannot diswown this special box"

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    .line 255
    :cond_0
    return-void
.end method
