.class Lcom/googlecode/mp4parser/authoring/samples/DefaultMp4SampleList$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/googlecode/mp4parser/authoring/Sample;


# instance fields
.field final synthetic this$0:Lcom/googlecode/mp4parser/authoring/samples/DefaultMp4SampleList;

.field private final synthetic val$finalCorrectPartOfChunk:Ljava/nio/ByteBuffer;

.field private final synthetic val$finalOffsetWithInChunk:J

.field private final synthetic val$sampleSize:J


# direct methods
.method constructor <init>(Lcom/googlecode/mp4parser/authoring/samples/DefaultMp4SampleList;JLjava/nio/ByteBuffer;J)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/googlecode/mp4parser/authoring/samples/DefaultMp4SampleList$1;->this$0:Lcom/googlecode/mp4parser/authoring/samples/DefaultMp4SampleList;

    iput-wide p2, p0, Lcom/googlecode/mp4parser/authoring/samples/DefaultMp4SampleList$1;->val$sampleSize:J

    iput-object p4, p0, Lcom/googlecode/mp4parser/authoring/samples/DefaultMp4SampleList$1;->val$finalCorrectPartOfChunk:Ljava/nio/ByteBuffer;

    iput-wide p5, p0, Lcom/googlecode/mp4parser/authoring/samples/DefaultMp4SampleList$1;->val$finalOffsetWithInChunk:J

    .line 203
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public asByteBuffer()Ljava/nio/ByteBuffer;
    .locals 4

    .prologue
    .line 214
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/samples/DefaultMp4SampleList$1;->val$finalCorrectPartOfChunk:Ljava/nio/ByteBuffer;

    iget-wide v2, p0, Lcom/googlecode/mp4parser/authoring/samples/DefaultMp4SampleList$1;->val$finalOffsetWithInChunk:J

    invoke-static {v2, v3}, Lcom/googlecode/mp4parser/util/CastUtils;->l2i(J)I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    move-result-object v0

    check-cast v0, Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->slice()Ljava/nio/ByteBuffer;

    move-result-object v0

    iget-wide v2, p0, Lcom/googlecode/mp4parser/authoring/samples/DefaultMp4SampleList$1;->val$sampleSize:J

    invoke-static {v2, v3}, Lcom/googlecode/mp4parser/util/CastUtils;->l2i(J)I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    move-result-object v0

    check-cast v0, Ljava/nio/ByteBuffer;

    return-object v0
.end method

.method public getSize()J
    .locals 2

    .prologue
    .line 210
    iget-wide v0, p0, Lcom/googlecode/mp4parser/authoring/samples/DefaultMp4SampleList$1;->val$sampleSize:J

    return-wide v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .prologue
    .line 219
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "DefaultMp4Sample(size:"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v2, p0, Lcom/googlecode/mp4parser/authoring/samples/DefaultMp4SampleList$1;->val$sampleSize:J

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeTo(Ljava/nio/channels/WritableByteChannel;)V
    .locals 1

    .prologue
    .line 206
    invoke-virtual {p0}, Lcom/googlecode/mp4parser/authoring/samples/DefaultMp4SampleList$1;->asByteBuffer()Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/nio/channels/WritableByteChannel;->write(Ljava/nio/ByteBuffer;)I

    .line 207
    return-void
.end method
