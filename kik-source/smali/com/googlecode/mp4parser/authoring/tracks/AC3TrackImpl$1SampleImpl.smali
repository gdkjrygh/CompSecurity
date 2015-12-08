.class Lcom/googlecode/mp4parser/authoring/tracks/AC3TrackImpl$1SampleImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/googlecode/mp4parser/authoring/Sample;


# instance fields
.field private final dataSource:Lcom/googlecode/mp4parser/DataSource;

.field private final size:J

.field private final start:J

.field final synthetic this$0:Lcom/googlecode/mp4parser/authoring/tracks/AC3TrackImpl;


# direct methods
.method public constructor <init>(Lcom/googlecode/mp4parser/authoring/tracks/AC3TrackImpl;JJLcom/googlecode/mp4parser/DataSource;)V
    .locals 0

    .prologue
    .line 231
    iput-object p1, p0, Lcom/googlecode/mp4parser/authoring/tracks/AC3TrackImpl$1SampleImpl;->this$0:Lcom/googlecode/mp4parser/authoring/tracks/AC3TrackImpl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 233
    iput-wide p2, p0, Lcom/googlecode/mp4parser/authoring/tracks/AC3TrackImpl$1SampleImpl;->start:J

    .line 234
    iput-wide p4, p0, Lcom/googlecode/mp4parser/authoring/tracks/AC3TrackImpl$1SampleImpl;->size:J

    .line 235
    iput-object p6, p0, Lcom/googlecode/mp4parser/authoring/tracks/AC3TrackImpl$1SampleImpl;->dataSource:Lcom/googlecode/mp4parser/DataSource;

    .line 236
    return-void
.end method


# virtual methods
.method public asByteBuffer()Ljava/nio/ByteBuffer;
    .locals 6

    .prologue
    .line 247
    :try_start_0
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/AC3TrackImpl$1SampleImpl;->dataSource:Lcom/googlecode/mp4parser/DataSource;

    iget-wide v2, p0, Lcom/googlecode/mp4parser/authoring/tracks/AC3TrackImpl$1SampleImpl;->start:J

    iget-wide v4, p0, Lcom/googlecode/mp4parser/authoring/tracks/AC3TrackImpl$1SampleImpl;->size:J

    invoke-interface {v0, v2, v3, v4, v5}, Lcom/googlecode/mp4parser/DataSource;->map(JJ)Ljava/nio/ByteBuffer;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 248
    :catch_0
    move-exception v0

    .line 249
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public getSize()J
    .locals 2

    .prologue
    .line 242
    iget-wide v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/AC3TrackImpl$1SampleImpl;->size:J

    return-wide v0
.end method

.method public writeTo(Ljava/nio/channels/WritableByteChannel;)V
    .locals 7

    .prologue
    .line 238
    iget-object v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/AC3TrackImpl$1SampleImpl;->dataSource:Lcom/googlecode/mp4parser/DataSource;

    iget-wide v2, p0, Lcom/googlecode/mp4parser/authoring/tracks/AC3TrackImpl$1SampleImpl;->start:J

    iget-wide v4, p0, Lcom/googlecode/mp4parser/authoring/tracks/AC3TrackImpl$1SampleImpl;->size:J

    move-object v6, p1

    invoke-interface/range {v1 .. v6}, Lcom/googlecode/mp4parser/DataSource;->transferTo(JJLjava/nio/channels/WritableByteChannel;)J

    .line 239
    return-void
.end method
