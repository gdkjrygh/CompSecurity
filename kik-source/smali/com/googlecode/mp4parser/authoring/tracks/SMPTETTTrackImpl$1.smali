.class Lcom/googlecode/mp4parser/authoring/tracks/SMPTETTTrackImpl$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/googlecode/mp4parser/authoring/Sample;


# instance fields
.field final synthetic this$0:Lcom/googlecode/mp4parser/authoring/tracks/SMPTETTTrackImpl;

.field private final synthetic val$finalXml:Ljava/lang/String;

.field private final synthetic val$pix:Ljava/util/List;


# direct methods
.method constructor <init>(Lcom/googlecode/mp4parser/authoring/tracks/SMPTETTTrackImpl;Ljava/lang/String;Ljava/util/List;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/googlecode/mp4parser/authoring/tracks/SMPTETTTrackImpl$1;->this$0:Lcom/googlecode/mp4parser/authoring/tracks/SMPTETTTrackImpl;

    iput-object p2, p0, Lcom/googlecode/mp4parser/authoring/tracks/SMPTETTTrackImpl$1;->val$finalXml:Ljava/lang/String;

    iput-object p3, p0, Lcom/googlecode/mp4parser/authoring/tracks/SMPTETTTrackImpl$1;->val$pix:Ljava/util/List;

    .line 180
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public asByteBuffer()Ljava/nio/ByteBuffer;
    .locals 2

    .prologue
    .line 202
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 204
    :try_start_0
    invoke-static {v0}, Ljava/nio/channels/Channels;->newChannel(Ljava/io/OutputStream;)Ljava/nio/channels/WritableByteChannel;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/googlecode/mp4parser/authoring/tracks/SMPTETTTrackImpl$1;->writeTo(Ljava/nio/channels/WritableByteChannel;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 208
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    invoke-static {v0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v0

    return-object v0

    .line 205
    :catch_0
    move-exception v0

    .line 206
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public getSize()J
    .locals 5

    .prologue
    .line 194
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/SMPTETTTrackImpl$1;->val$finalXml:Ljava/lang/String;

    invoke-static {v0}, Lcom/coremedia/iso/Utf8;->convert(Ljava/lang/String;)[B

    move-result-object v0

    array-length v0, v0

    int-to-long v0, v0

    .line 195
    iget-object v2, p0, Lcom/googlecode/mp4parser/authoring/tracks/SMPTETTTrackImpl$1;->val$pix:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    move-wide v2, v0

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_0

    .line 198
    return-wide v2

    .line 195
    :cond_0
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/io/File;

    .line 196
    invoke-virtual {v0}, Ljava/io/File;->length()J

    move-result-wide v0

    add-long/2addr v0, v2

    move-wide v2, v0

    goto :goto_0
.end method

.method public writeTo(Ljava/nio/channels/WritableByteChannel;)V
    .locals 5

    .prologue
    .line 182
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/SMPTETTTrackImpl$1;->val$finalXml:Ljava/lang/String;

    invoke-static {v0}, Lcom/coremedia/iso/Utf8;->convert(Ljava/lang/String;)[B

    move-result-object v0

    invoke-static {v0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/nio/channels/WritableByteChannel;->write(Ljava/nio/ByteBuffer;)I

    .line 183
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/SMPTETTTrackImpl$1;->val$pix:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_1

    .line 191
    return-void

    .line 183
    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/io/File;

    .line 184
    new-instance v2, Ljava/io/FileInputStream;

    invoke-direct {v2, v0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 185
    const/16 v0, 0x1fa0

    new-array v0, v0, [B

    .line 187
    :goto_0
    const/4 v3, -0x1

    invoke-virtual {v2, v0}, Ljava/io/FileInputStream;->read([B)I

    move-result v4

    if-eq v3, v4, :cond_0

    .line 188
    const/4 v3, 0x0

    invoke-static {v0, v3, v4}, Ljava/nio/ByteBuffer;->wrap([BII)Ljava/nio/ByteBuffer;

    move-result-object v3

    invoke-interface {p1, v3}, Ljava/nio/channels/WritableByteChannel;->write(Ljava/nio/ByteBuffer;)I

    goto :goto_0
.end method
