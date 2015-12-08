.class Lcom/googlecode/mp4parser/authoring/tracks/SMPTETTTrackImpl$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/googlecode/mp4parser/authoring/Sample;


# instance fields
.field final synthetic this$0:Lcom/googlecode/mp4parser/authoring/tracks/SMPTETTTrackImpl;

.field private final synthetic val$file:Ljava/io/File;


# direct methods
.method constructor <init>(Lcom/googlecode/mp4parser/authoring/tracks/SMPTETTTrackImpl;Ljava/io/File;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/googlecode/mp4parser/authoring/tracks/SMPTETTTrackImpl$2;->this$0:Lcom/googlecode/mp4parser/authoring/tracks/SMPTETTTrackImpl;

    iput-object p2, p0, Lcom/googlecode/mp4parser/authoring/tracks/SMPTETTTrackImpl$2;->val$file:Ljava/io/File;

    .line 225
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public asByteBuffer()Ljava/nio/ByteBuffer;
    .locals 3

    .prologue
    .line 236
    :try_start_0
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/SMPTETTTrackImpl$2;->this$0:Lcom/googlecode/mp4parser/authoring/tracks/SMPTETTTrackImpl;

    new-instance v1, Ljava/io/FileInputStream;

    iget-object v2, p0, Lcom/googlecode/mp4parser/authoring/tracks/SMPTETTTrackImpl$2;->val$file:Ljava/io/File;

    invoke-direct {v1, v2}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    # invokes: Lcom/googlecode/mp4parser/authoring/tracks/SMPTETTTrackImpl;->streamToByteArray(Ljava/io/InputStream;)[B
    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/authoring/tracks/SMPTETTTrackImpl;->access$0(Lcom/googlecode/mp4parser/authoring/tracks/SMPTETTTrackImpl;Ljava/io/InputStream;)[B

    move-result-object v0

    invoke-static {v0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 237
    :catch_0
    move-exception v0

    .line 238
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public getSize()J
    .locals 2

    .prologue
    .line 231
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/SMPTETTTrackImpl$2;->val$file:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->length()J

    move-result-wide v0

    return-wide v0
.end method

.method public writeTo(Ljava/nio/channels/WritableByteChannel;)V
    .locals 4

    .prologue
    .line 227
    invoke-static {p1}, Ljava/nio/channels/Channels;->newOutputStream(Ljava/nio/channels/WritableByteChannel;)Ljava/io/OutputStream;

    move-result-object v0

    iget-object v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/SMPTETTTrackImpl$2;->this$0:Lcom/googlecode/mp4parser/authoring/tracks/SMPTETTTrackImpl;

    new-instance v2, Ljava/io/FileInputStream;

    iget-object v3, p0, Lcom/googlecode/mp4parser/authoring/tracks/SMPTETTTrackImpl$2;->val$file:Ljava/io/File;

    invoke-direct {v2, v3}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    # invokes: Lcom/googlecode/mp4parser/authoring/tracks/SMPTETTTrackImpl;->streamToByteArray(Ljava/io/InputStream;)[B
    invoke-static {v1, v2}, Lcom/googlecode/mp4parser/authoring/tracks/SMPTETTTrackImpl;->access$0(Lcom/googlecode/mp4parser/authoring/tracks/SMPTETTTrackImpl;Ljava/io/InputStream;)[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write([B)V

    .line 228
    return-void
.end method
