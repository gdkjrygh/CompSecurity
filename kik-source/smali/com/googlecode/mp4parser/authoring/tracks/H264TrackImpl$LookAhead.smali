.class Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$LookAhead;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "LookAhead"
.end annotation


# instance fields
.field buffer:Ljava/nio/ByteBuffer;

.field bufferStartPos:J

.field dataSource:Lcom/googlecode/mp4parser/DataSource;

.field inBufferPos:I

.field start:J

.field final synthetic this$0:Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl;


# direct methods
.method constructor <init>(Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl;Lcom/googlecode/mp4parser/DataSource;)V
    .locals 2

    .prologue
    .line 246
    iput-object p1, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$LookAhead;->this$0:Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 234
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$LookAhead;->bufferStartPos:J

    .line 235
    const/4 v0, 0x0

    iput v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$LookAhead;->inBufferPos:I

    .line 247
    iput-object p2, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$LookAhead;->dataSource:Lcom/googlecode/mp4parser/DataSource;

    .line 248
    invoke-virtual {p0}, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$LookAhead;->fillBuffer()V

    .line 249
    return-void
.end method


# virtual methods
.method discardByte()V
    .locals 1

    .prologue
    .line 281
    iget v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$LookAhead;->inBufferPos:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$LookAhead;->inBufferPos:I

    .line 282
    return-void
.end method

.method discardNext3AndMarkStart()V
    .locals 4

    .prologue
    .line 285
    iget v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$LookAhead;->inBufferPos:I

    add-int/lit8 v0, v0, 0x3

    iput v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$LookAhead;->inBufferPos:I

    .line 286
    iget-wide v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$LookAhead;->bufferStartPos:J

    iget v2, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$LookAhead;->inBufferPos:I

    int-to-long v2, v2

    add-long/2addr v0, v2

    iput-wide v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$LookAhead;->start:J

    .line 287
    return-void
.end method

.method public fillBuffer()V
    .locals 8

    .prologue
    .line 242
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$LookAhead;->dataSource:Lcom/googlecode/mp4parser/DataSource;

    iget-wide v2, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$LookAhead;->bufferStartPos:J

    iget-object v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$LookAhead;->dataSource:Lcom/googlecode/mp4parser/DataSource;

    invoke-interface {v1}, Lcom/googlecode/mp4parser/DataSource;->size()J

    move-result-wide v4

    iget-wide v6, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$LookAhead;->bufferStartPos:J

    sub-long/2addr v4, v6

    sget v1, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl;->BUFFER:I

    int-to-long v6, v1

    invoke-static {v4, v5, v6, v7}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v4

    invoke-interface {v0, v2, v3, v4, v5}, Lcom/googlecode/mp4parser/DataSource;->map(JJ)Ljava/nio/ByteBuffer;

    move-result-object v0

    iput-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$LookAhead;->buffer:Ljava/nio/ByteBuffer;

    .line 243
    return-void
.end method

.method public getNal()Ljava/nio/ByteBuffer;
    .locals 8

    .prologue
    .line 290
    iget-wide v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$LookAhead;->start:J

    iget-wide v2, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$LookAhead;->bufferStartPos:J

    cmp-long v0, v0, v2

    if-ltz v0, :cond_0

    .line 292
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$LookAhead;->buffer:Ljava/nio/ByteBuffer;

    iget-wide v2, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$LookAhead;->start:J

    iget-wide v4, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$LookAhead;->bufferStartPos:J

    sub-long/2addr v2, v4

    long-to-int v1, v2

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 293
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$LookAhead;->buffer:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->slice()Ljava/nio/ByteBuffer;

    move-result-object v0

    .line 294
    iget v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$LookAhead;->inBufferPos:I

    int-to-long v2, v1

    iget-wide v4, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$LookAhead;->start:J

    iget-wide v6, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$LookAhead;->bufferStartPos:J

    sub-long/2addr v4, v6

    sub-long/2addr v2, v4

    long-to-int v1, v2

    invoke-virtual {v0, v1}, Ljava/nio/Buffer;->limit(I)Ljava/nio/Buffer;

    .line 295
    check-cast v0, Ljava/nio/ByteBuffer;

    return-object v0

    .line 297
    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "damn! NAL exceeds buffer"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method nextThreeEquals000or001orEof()Z
    .locals 6

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 264
    iget-object v2, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$LookAhead;->buffer:Ljava/nio/ByteBuffer;

    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->limit()I

    move-result v2

    iget v3, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$LookAhead;->inBufferPos:I

    sub-int/2addr v2, v3

    const/4 v3, 0x3

    if-lt v2, v3, :cond_2

    .line 265
    iget-object v2, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$LookAhead;->buffer:Ljava/nio/ByteBuffer;

    iget v3, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$LookAhead;->inBufferPos:I

    invoke-virtual {v2, v3}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v2

    if-nez v2, :cond_1

    .line 266
    iget-object v2, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$LookAhead;->buffer:Ljava/nio/ByteBuffer;

    iget v3, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$LookAhead;->inBufferPos:I

    add-int/lit8 v3, v3, 0x1

    invoke-virtual {v2, v3}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v2

    if-nez v2, :cond_1

    .line 267
    iget-object v2, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$LookAhead;->buffer:Ljava/nio/ByteBuffer;

    iget v3, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$LookAhead;->inBufferPos:I

    add-int/lit8 v3, v3, 0x2

    invoke-virtual {v2, v3}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$LookAhead;->buffer:Ljava/nio/ByteBuffer;

    iget v3, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$LookAhead;->inBufferPos:I

    add-int/lit8 v3, v3, 0x2

    invoke-virtual {v2, v3}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v2

    if-ne v2, v0, :cond_1

    .line 275
    :cond_0
    :goto_0
    return v0

    :cond_1
    move v0, v1

    .line 265
    goto :goto_0

    .line 269
    :cond_2
    iget-wide v2, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$LookAhead;->bufferStartPos:J

    iget v4, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$LookAhead;->inBufferPos:I

    int-to-long v4, v4

    add-long/2addr v2, v4

    const-wide/16 v4, 0x3

    add-long/2addr v2, v4

    iget-object v4, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$LookAhead;->dataSource:Lcom/googlecode/mp4parser/DataSource;

    invoke-interface {v4}, Lcom/googlecode/mp4parser/DataSource;->size()J

    move-result-wide v4

    cmp-long v2, v2, v4

    if-lez v2, :cond_3

    .line 270
    iget-wide v2, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$LookAhead;->bufferStartPos:J

    iget v4, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$LookAhead;->inBufferPos:I

    int-to-long v4, v4

    add-long/2addr v2, v4

    iget-object v4, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$LookAhead;->dataSource:Lcom/googlecode/mp4parser/DataSource;

    invoke-interface {v4}, Lcom/googlecode/mp4parser/DataSource;->size()J

    move-result-wide v4

    cmp-long v2, v2, v4

    if-eqz v2, :cond_0

    move v0, v1

    goto :goto_0

    .line 272
    :cond_3
    iget-wide v2, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$LookAhead;->start:J

    iput-wide v2, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$LookAhead;->bufferStartPos:J

    .line 273
    iput v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$LookAhead;->inBufferPos:I

    .line 274
    invoke-virtual {p0}, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$LookAhead;->fillBuffer()V

    .line 275
    invoke-virtual {p0}, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$LookAhead;->nextThreeEquals000or001orEof()Z

    move-result v0

    goto :goto_0
.end method

.method nextThreeEquals001()Z
    .locals 6

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 252
    iget-object v2, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$LookAhead;->buffer:Ljava/nio/ByteBuffer;

    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->limit()I

    move-result v2

    iget v3, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$LookAhead;->inBufferPos:I

    sub-int/2addr v2, v3

    const/4 v3, 0x3

    if-lt v2, v3, :cond_1

    .line 253
    iget-object v2, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$LookAhead;->buffer:Ljava/nio/ByteBuffer;

    iget v3, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$LookAhead;->inBufferPos:I

    invoke-virtual {v2, v3}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v2

    if-nez v2, :cond_0

    .line 254
    iget-object v2, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$LookAhead;->buffer:Ljava/nio/ByteBuffer;

    iget v3, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$LookAhead;->inBufferPos:I

    add-int/lit8 v3, v3, 0x1

    invoke-virtual {v2, v3}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v2

    if-nez v2, :cond_0

    .line 255
    iget-object v2, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$LookAhead;->buffer:Ljava/nio/ByteBuffer;

    iget v3, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$LookAhead;->inBufferPos:I

    add-int/lit8 v3, v3, 0x2

    invoke-virtual {v2, v3}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v2

    if-ne v2, v0, :cond_0

    .line 260
    :goto_0
    return v0

    :cond_0
    move v0, v1

    .line 253
    goto :goto_0

    .line 257
    :cond_1
    iget-wide v2, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$LookAhead;->bufferStartPos:J

    iget v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$LookAhead;->inBufferPos:I

    int-to-long v4, v0

    add-long/2addr v2, v4

    const-wide/16 v4, 0x3

    add-long/2addr v2, v4

    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$LookAhead;->dataSource:Lcom/googlecode/mp4parser/DataSource;

    invoke-interface {v0}, Lcom/googlecode/mp4parser/DataSource;->size()J

    move-result-wide v4

    cmp-long v0, v2, v4

    if-ltz v0, :cond_2

    .line 258
    new-instance v0, Ljava/io/EOFException;

    invoke-direct {v0}, Ljava/io/EOFException;-><init>()V

    throw v0

    :cond_2
    move v0, v1

    .line 260
    goto :goto_0
.end method
