.class Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/googlecode/mp4parser/authoring/Sample;


# instance fields
.field final synthetic this$0:Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;

.field private final synthetic val$currentPosition:I


# direct methods
.method constructor <init>(Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;I)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl$1;->this$0:Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;

    iput p2, p0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl$1;->val$currentPosition:I

    .line 802
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public asByteBuffer()Ljava/nio/ByteBuffer;
    .locals 6

    .prologue
    .line 813
    :try_start_0
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl$1;->this$0:Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;

    # getter for: Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->dataSource:Lcom/googlecode/mp4parser/DataSource;
    invoke-static {v0}, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->access$0(Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;)Lcom/googlecode/mp4parser/DataSource;

    move-result-object v0

    iget v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl$1;->val$currentPosition:I

    int-to-long v2, v1

    iget-object v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl$1;->this$0:Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;

    iget v1, v1, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->frameSize:I

    int-to-long v4, v1

    invoke-interface {v0, v2, v3, v4, v5}, Lcom/googlecode/mp4parser/DataSource;->map(JJ)Ljava/nio/ByteBuffer;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 814
    :catch_0
    move-exception v0

    .line 815
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public getSize()J
    .locals 2

    .prologue
    .line 808
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl$1;->this$0:Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;

    iget v0, v0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->frameSize:I

    int-to-long v0, v0

    return-wide v0
.end method

.method public writeTo(Ljava/nio/channels/WritableByteChannel;)V
    .locals 7

    .prologue
    .line 804
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl$1;->this$0:Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;

    # getter for: Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->dataSource:Lcom/googlecode/mp4parser/DataSource;
    invoke-static {v0}, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->access$0(Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;)Lcom/googlecode/mp4parser/DataSource;

    move-result-object v1

    iget v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl$1;->val$currentPosition:I

    int-to-long v2, v0

    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl$1;->this$0:Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;

    iget v0, v0, Lcom/googlecode/mp4parser/authoring/tracks/DTSTrackImpl;->frameSize:I

    int-to-long v4, v0

    move-object v6, p1

    invoke-interface/range {v1 .. v6}, Lcom/googlecode/mp4parser/DataSource;->transferTo(JJLjava/nio/channels/WritableByteChannel;)J

    .line 805
    return-void
.end method
