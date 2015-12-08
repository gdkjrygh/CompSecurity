.class Lcom/googlecode/mp4parser/authoring/tracks/H265TrackImpl$LookAhead;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/googlecode/mp4parser/authoring/tracks/H265TrackImpl;
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

.field final synthetic this$0:Lcom/googlecode/mp4parser/authoring/tracks/H265TrackImpl;


# direct methods
.method constructor <init>(Lcom/googlecode/mp4parser/authoring/tracks/H265TrackImpl;Lcom/googlecode/mp4parser/DataSource;)V
    .locals 2

    .prologue
    .line 480
    iput-object p1, p0, Lcom/googlecode/mp4parser/authoring/tracks/H265TrackImpl$LookAhead;->this$0:Lcom/googlecode/mp4parser/authoring/tracks/H265TrackImpl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 473
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/H265TrackImpl$LookAhead;->bufferStartPos:J

    .line 474
    const/4 v0, 0x0

    iput v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/H265TrackImpl$LookAhead;->inBufferPos:I

    .line 481
    iput-object p2, p0, Lcom/googlecode/mp4parser/authoring/tracks/H265TrackImpl$LookAhead;->dataSource:Lcom/googlecode/mp4parser/DataSource;

    .line 482
    invoke-virtual {p0}, Lcom/googlecode/mp4parser/authoring/tracks/H265TrackImpl$LookAhead;->fillBuffer()V

    .line 483
    return-void
.end method


# virtual methods
.method discardByte()V
    .locals 1

    .prologue
    .line 520
    iget v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/H265TrackImpl$LookAhead;->inBufferPos:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/H265TrackImpl$LookAhead;->inBufferPos:I

    .line 521
    return-void
.end method

.method discardNext3AndMarkStart()V
    .locals 4

    .prologue
    .line 524
    iget v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/H265TrackImpl$LookAhead;->inBufferPos:I

    add-int/lit8 v0, v0, 0x3

    iput v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/H265TrackImpl$LookAhead;->inBufferPos:I

    .line 525
    iget-wide v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/H265TrackImpl$LookAhead;->bufferStartPos:J

    iget v2, p0, Lcom/googlecode/mp4parser/authoring/tracks/H265TrackImpl$LookAhead;->inBufferPos:I

    int-to-long v2, v2

    add-long/2addr v0, v2

    iput-wide v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/H265TrackImpl$LookAhead;->start:J

    .line 526
    return-void
.end method

.method public fillBuffer()V
    .locals 8

    .prologue
    .line 486
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/H265TrackImpl$LookAhead;->dataSource:Lcom/googlecode/mp4parser/DataSource;

    iget-wide v2, p0, Lcom/googlecode/mp4parser/authoring/tracks/H265TrackImpl$LookAhead;->bufferStartPos:J

    iget-object v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/H265TrackImpl$LookAhead;->dataSource:Lcom/googlecode/mp4parser/DataSource;

    invoke-interface {v1}, Lcom/googlecode/mp4parser/DataSource;->size()J

    move-result-wide v4

    iget-wide v6, p0, Lcom/googlecode/mp4parser/authoring/tracks/H265TrackImpl$LookAhead;->bufferStartPos:J

    sub-long/2addr v4, v6

    const-wide/32 v6, 0x100000

    invoke-static {v4, v5, v6, v7}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v4

    invoke-interface {v0, v2, v3, v4, v5}, Lcom/googlecode/mp4parser/DataSource;->map(JJ)Ljava/nio/ByteBuffer;

    move-result-object v0

    iput-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/H265TrackImpl$LookAhead;->buffer:Ljava/nio/ByteBuffer;

    .line 487
    return-void
.end method

.method public getNal()Ljava/nio/ByteBuffer;
    .locals 8

    .prologue
    .line 529
    iget-wide v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/H265TrackImpl$LookAhead;->start:J

    iget-wide v2, p0, Lcom/googlecode/mp4parser/authoring/tracks/H265TrackImpl$LookAhead;->bufferStartPos:J

    cmp-long v0, v0, v2

    if-ltz v0, :cond_0

    .line 530
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/H265TrackImpl$LookAhead;->buffer:Ljava/nio/ByteBuffer;

    iget-wide v2, p0, Lcom/googlecode/mp4parser/authoring/tracks/H265TrackImpl$LookAhead;->start:J

    iget-wide v4, p0, Lcom/googlecode/mp4parser/authoring/tracks/H265TrackImpl$LookAhead;->bufferStartPos:J

    sub-long/2addr v2, v4

    long-to-int v1, v2

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 531
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/H265TrackImpl$LookAhead;->buffer:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->slice()Ljava/nio/ByteBuffer;

    move-result-object v0

    .line 532
    iget v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/H265TrackImpl$LookAhead;->inBufferPos:I

    int-to-long v2, v1

    iget-wide v4, p0, Lcom/googlecode/mp4parser/authoring/tracks/H265TrackImpl$LookAhead;->start:J

    iget-wide v6, p0, Lcom/googlecode/mp4parser/authoring/tracks/H265TrackImpl$LookAhead;->bufferStartPos:J

    sub-long/2addr v4, v6

    sub-long/2addr v2, v4

    long-to-int v1, v2

    invoke-virtual {v0, v1}, Ljava/nio/Buffer;->limit(I)Ljava/nio/Buffer;

    .line 533
    check-cast v0, Ljava/nio/ByteBuffer;

    return-object v0

    .line 535
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

    .line 503
    iget-object v2, p0, Lcom/googlecode/mp4parser/authoring/tracks/H265TrackImpl$LookAhead;->buffer:Ljava/nio/ByteBuffer;

    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->limit()I

    move-result v2

    iget v3, p0, Lcom/googlecode/mp4parser/authoring/tracks/H265TrackImpl$LookAhead;->inBufferPos:I

    sub-int/2addr v2, v3

    const/4 v3, 0x3

    if-lt v2, v3, :cond_2

    .line 504
    iget-object v2, p0, Lcom/googlecode/mp4parser/authoring/tracks/H265TrackImpl$LookAhead;->buffer:Ljava/nio/ByteBuffer;

    iget v3, p0, Lcom/googlecode/mp4parser/authoring/tracks/H265TrackImpl$LookAhead;->inBufferPos:I

    invoke-virtual {v2, v3}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v2

    if-nez v2, :cond_1

    .line 505
    iget-object v2, p0, Lcom/googlecode/mp4parser/authoring/tracks/H265TrackImpl$LookAhead;->buffer:Ljava/nio/ByteBuffer;

    iget v3, p0, Lcom/googlecode/mp4parser/authoring/tracks/H265TrackImpl$LookAhead;->inBufferPos:I

    add-int/lit8 v3, v3, 0x1

    invoke-virtual {v2, v3}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v2

    if-nez v2, :cond_1

    .line 506
    iget-object v2, p0, Lcom/googlecode/mp4parser/authoring/tracks/H265TrackImpl$LookAhead;->buffer:Ljava/nio/ByteBuffer;

    iget v3, p0, Lcom/googlecode/mp4parser/authoring/tracks/H265TrackImpl$LookAhead;->inBufferPos:I

    add-int/lit8 v3, v3, 0x2

    invoke-virtual {v2, v3}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/googlecode/mp4parser/authoring/tracks/H265TrackImpl$LookAhead;->buffer:Ljava/nio/ByteBuffer;

    iget v3, p0, Lcom/googlecode/mp4parser/authoring/tracks/H265TrackImpl$LookAhead;->inBufferPos:I

    add-int/lit8 v3, v3, 0x2

    invoke-virtual {v2, v3}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v2

    if-ne v2, v0, :cond_1

    .line 514
    :cond_0
    :goto_0
    return v0

    :cond_1
    move v0, v1

    .line 504
    goto :goto_0

    .line 508
    :cond_2
    iget-wide v2, p0, Lcom/googlecode/mp4parser/authoring/tracks/H265TrackImpl$LookAhead;->bufferStartPos:J

    iget v4, p0, Lcom/googlecode/mp4parser/authoring/tracks/H265TrackImpl$LookAhead;->inBufferPos:I

    int-to-long v4, v4

    add-long/2addr v2, v4

    const-wide/16 v4, 0x3

    add-long/2addr v2, v4

    iget-object v4, p0, Lcom/googlecode/mp4parser/authoring/tracks/H265TrackImpl$LookAhead;->dataSource:Lcom/googlecode/mp4parser/DataSource;

    invoke-interface {v4}, Lcom/googlecode/mp4parser/DataSource;->size()J

    move-result-wide v4

    cmp-long v2, v2, v4

    if-lez v2, :cond_3

    .line 509
    iget-wide v2, p0, Lcom/googlecode/mp4parser/authoring/tracks/H265TrackImpl$LookAhead;->bufferStartPos:J

    iget v4, p0, Lcom/googlecode/mp4parser/authoring/tracks/H265TrackImpl$LookAhead;->inBufferPos:I

    int-to-long v4, v4

    add-long/2addr v2, v4

    iget-object v4, p0, Lcom/googlecode/mp4parser/authoring/tracks/H265TrackImpl$LookAhead;->dataSource:Lcom/googlecode/mp4parser/DataSource;

    invoke-interface {v4}, Lcom/googlecode/mp4parser/DataSource;->size()J

    move-result-wide v4

    cmp-long v2, v2, v4

    if-eqz v2, :cond_0

    move v0, v1

    goto :goto_0

    .line 511
    :cond_3
    iget-wide v2, p0, Lcom/googlecode/mp4parser/authoring/tracks/H265TrackImpl$LookAhead;->start:J

    iput-wide v2, p0, Lcom/googlecode/mp4parser/authoring/tracks/H265TrackImpl$LookAhead;->bufferStartPos:J

    .line 512
    iput v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/H265TrackImpl$LookAhead;->inBufferPos:I

    .line 513
    invoke-virtual {p0}, Lcom/googlecode/mp4parser/authoring/tracks/H265TrackImpl$LookAhead;->fillBuffer()V

    .line 514
    invoke-virtual {p0}, Lcom/googlecode/mp4parser/authoring/tracks/H265TrackImpl$LookAhead;->nextThreeEquals000or001orEof()Z

    move-result v0

    goto :goto_0
.end method

.method nextThreeEquals001()Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    .line 490
    iget-object v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/H265TrackImpl$LookAhead;->buffer:Ljava/nio/ByteBuffer;

    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->limit()I

    move-result v1

    iget v2, p0, Lcom/googlecode/mp4parser/authoring/tracks/H265TrackImpl$LookAhead;->inBufferPos:I

    sub-int/2addr v1, v2

    const/4 v2, 0x3

    if-lt v1, v2, :cond_1

    .line 491
    iget-object v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/H265TrackImpl$LookAhead;->buffer:Ljava/nio/ByteBuffer;

    iget v2, p0, Lcom/googlecode/mp4parser/authoring/tracks/H265TrackImpl$LookAhead;->inBufferPos:I

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v1

    if-nez v1, :cond_0

    .line 492
    iget-object v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/H265TrackImpl$LookAhead;->buffer:Ljava/nio/ByteBuffer;

    iget v2, p0, Lcom/googlecode/mp4parser/authoring/tracks/H265TrackImpl$LookAhead;->inBufferPos:I

    add-int/lit8 v2, v2, 0x1

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v1

    if-nez v1, :cond_0

    .line 493
    iget-object v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/H265TrackImpl$LookAhead;->buffer:Ljava/nio/ByteBuffer;

    iget v2, p0, Lcom/googlecode/mp4parser/authoring/tracks/H265TrackImpl$LookAhead;->inBufferPos:I

    add-int/lit8 v2, v2, 0x2

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v1

    if-ne v1, v0, :cond_0

    .line 491
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    .line 495
    :cond_1
    iget-wide v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/H265TrackImpl$LookAhead;->bufferStartPos:J

    iget v2, p0, Lcom/googlecode/mp4parser/authoring/tracks/H265TrackImpl$LookAhead;->inBufferPos:I

    int-to-long v2, v2

    add-long/2addr v0, v2

    iget-object v2, p0, Lcom/googlecode/mp4parser/authoring/tracks/H265TrackImpl$LookAhead;->dataSource:Lcom/googlecode/mp4parser/DataSource;

    invoke-interface {v2}, Lcom/googlecode/mp4parser/DataSource;->size()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-nez v0, :cond_2

    .line 496
    new-instance v0, Ljava/io/EOFException;

    invoke-direct {v0}, Ljava/io/EOFException;-><init>()V

    throw v0

    .line 498
    :cond_2
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "buffer repositioning require"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
