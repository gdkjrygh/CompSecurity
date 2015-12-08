.class final Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataOutputStream;
.super Ljava/io/OutputStream;
.source "SpdyStream.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/squareup/okhttp/internal/spdy/SpdyStream;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "SpdyDataOutputStream"
.end annotation


# static fields
.field static final synthetic $assertionsDisabled:Z


# instance fields
.field private final buffer:[B

.field private closed:Z

.field private finished:Z

.field private pos:I

.field final synthetic this$0:Lcom/squareup/okhttp/internal/spdy/SpdyStream;

.field private unacknowledgedBytes:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 570
    const-class v0, Lcom/squareup/okhttp/internal/spdy/SpdyStream;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataOutputStream;->$assertionsDisabled:Z

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private constructor <init>(Lcom/squareup/okhttp/internal/spdy/SpdyStream;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 570
    iput-object p1, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataOutputStream;->this$0:Lcom/squareup/okhttp/internal/spdy/SpdyStream;

    invoke-direct {p0}, Ljava/io/OutputStream;-><init>()V

    .line 571
    const/16 v0, 0x2000

    new-array v0, v0, [B

    iput-object v0, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataOutputStream;->buffer:[B

    .line 572
    iput v1, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataOutputStream;->pos:I

    .line 588
    iput v1, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataOutputStream;->unacknowledgedBytes:I

    return-void
.end method

.method synthetic constructor <init>(Lcom/squareup/okhttp/internal/spdy/SpdyStream;Lcom/squareup/okhttp/internal/spdy/SpdyStream$1;)V
    .locals 0
    .param p1, "x0"    # Lcom/squareup/okhttp/internal/spdy/SpdyStream;
    .param p2, "x1"    # Lcom/squareup/okhttp/internal/spdy/SpdyStream$1;

    .prologue
    .line 570
    invoke-direct {p0, p1}, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataOutputStream;-><init>(Lcom/squareup/okhttp/internal/spdy/SpdyStream;)V

    return-void
.end method

.method static synthetic access$300(Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataOutputStream;)Z
    .locals 1
    .param p0, "x0"    # Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataOutputStream;

    .prologue
    .line 570
    iget-boolean v0, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataOutputStream;->finished:Z

    return v0
.end method

.method static synthetic access$302(Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataOutputStream;Z)Z
    .locals 0
    .param p0, "x0"    # Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataOutputStream;
    .param p1, "x1"    # Z

    .prologue
    .line 570
    iput-boolean p1, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataOutputStream;->finished:Z

    return p1
.end method

.method static synthetic access$500(Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataOutputStream;)Z
    .locals 1
    .param p0, "x0"    # Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataOutputStream;

    .prologue
    .line 570
    iget-boolean v0, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataOutputStream;->closed:Z

    return v0
.end method

.method static synthetic access$600(Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataOutputStream;)I
    .locals 1
    .param p0, "x0"    # Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataOutputStream;

    .prologue
    .line 570
    iget v0, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataOutputStream;->unacknowledgedBytes:I

    return v0
.end method

.method static synthetic access$602(Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataOutputStream;I)I
    .locals 0
    .param p0, "x0"    # Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataOutputStream;
    .param p1, "x1"    # I

    .prologue
    .line 570
    iput p1, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataOutputStream;->unacknowledgedBytes:I

    return p1
.end method

.method private checkNotClosed()V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 673
    iget-object v1, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataOutputStream;->this$0:Lcom/squareup/okhttp/internal/spdy/SpdyStream;

    monitor-enter v1

    .line 674
    :try_start_0
    iget-boolean v0, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataOutputStream;->closed:Z

    if-eqz v0, :cond_0

    .line 675
    new-instance v0, Ljava/io/IOException;

    const-string v2, "stream closed"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 681
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 676
    :cond_0
    :try_start_1
    iget-boolean v0, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataOutputStream;->finished:Z

    if-eqz v0, :cond_1

    .line 677
    new-instance v0, Ljava/io/IOException;

    const-string v2, "stream finished"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 678
    :cond_1
    iget-object v0, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataOutputStream;->this$0:Lcom/squareup/okhttp/internal/spdy/SpdyStream;

    # getter for: Lcom/squareup/okhttp/internal/spdy/SpdyStream;->errorCode:Lcom/squareup/okhttp/internal/spdy/ErrorCode;
    invoke-static {v0}, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->access$1000(Lcom/squareup/okhttp/internal/spdy/SpdyStream;)Lcom/squareup/okhttp/internal/spdy/ErrorCode;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 679
    new-instance v0, Ljava/io/IOException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "stream was reset: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataOutputStream;->this$0:Lcom/squareup/okhttp/internal/spdy/SpdyStream;

    # getter for: Lcom/squareup/okhttp/internal/spdy/SpdyStream;->errorCode:Lcom/squareup/okhttp/internal/spdy/ErrorCode;
    invoke-static {v3}, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->access$1000(Lcom/squareup/okhttp/internal/spdy/SpdyStream;)Lcom/squareup/okhttp/internal/spdy/ErrorCode;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 681
    :cond_2
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 682
    return-void
.end method

.method private waitUntilWritable(IZ)V
    .locals 4
    .param p1, "count"    # I
    .param p2, "last"    # Z
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 655
    :cond_0
    :try_start_0
    iget v1, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataOutputStream;->unacknowledgedBytes:I

    add-int/2addr v1, p1

    iget-object v2, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataOutputStream;->this$0:Lcom/squareup/okhttp/internal/spdy/SpdyStream;

    # getter for: Lcom/squareup/okhttp/internal/spdy/SpdyStream;->writeWindowSize:I
    invoke-static {v2}, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->access$1300(Lcom/squareup/okhttp/internal/spdy/SpdyStream;)I

    move-result v2

    if-lt v1, v2, :cond_3

    .line 656
    iget-object v1, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataOutputStream;->this$0:Lcom/squareup/okhttp/internal/spdy/SpdyStream;

    invoke-virtual {v1}, Ljava/lang/Object;->wait()V

    .line 659
    if-nez p2, :cond_1

    iget-boolean v1, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataOutputStream;->closed:Z

    if-eqz v1, :cond_1

    .line 660
    new-instance v1, Ljava/io/IOException;

    const-string v2, "stream closed"

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 667
    :catch_0
    move-exception v0

    .line 668
    .local v0, "e":Ljava/lang/InterruptedException;
    new-instance v1, Ljava/io/InterruptedIOException;

    invoke-direct {v1}, Ljava/io/InterruptedIOException;-><init>()V

    throw v1

    .line 661
    .end local v0    # "e":Ljava/lang/InterruptedException;
    :cond_1
    :try_start_1
    iget-boolean v1, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataOutputStream;->finished:Z

    if-eqz v1, :cond_2

    .line 662
    new-instance v1, Ljava/io/IOException;

    const-string v2, "stream finished"

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 663
    :cond_2
    iget-object v1, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataOutputStream;->this$0:Lcom/squareup/okhttp/internal/spdy/SpdyStream;

    # getter for: Lcom/squareup/okhttp/internal/spdy/SpdyStream;->errorCode:Lcom/squareup/okhttp/internal/spdy/ErrorCode;
    invoke-static {v1}, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->access$1000(Lcom/squareup/okhttp/internal/spdy/SpdyStream;)Lcom/squareup/okhttp/internal/spdy/ErrorCode;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 664
    new-instance v1, Ljava/io/IOException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "stream was reset: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataOutputStream;->this$0:Lcom/squareup/okhttp/internal/spdy/SpdyStream;

    # getter for: Lcom/squareup/okhttp/internal/spdy/SpdyStream;->errorCode:Lcom/squareup/okhttp/internal/spdy/ErrorCode;
    invoke-static {v3}, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->access$1000(Lcom/squareup/okhttp/internal/spdy/SpdyStream;)Lcom/squareup/okhttp/internal/spdy/ErrorCode;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0

    .line 670
    :cond_3
    return-void
.end method

.method private writeFrame(Z)V
    .locals 7
    .param p1, "outFinished"    # Z
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    const/4 v4, 0x0

    .line 636
    sget-boolean v0, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataOutputStream;->$assertionsDisabled:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataOutputStream;->this$0:Lcom/squareup/okhttp/internal/spdy/SpdyStream;

    invoke-static {v0}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 638
    :cond_0
    iget v6, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataOutputStream;->pos:I

    .line 639
    .local v6, "length":I
    iget-object v1, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataOutputStream;->this$0:Lcom/squareup/okhttp/internal/spdy/SpdyStream;

    monitor-enter v1

    .line 640
    :try_start_0
    invoke-direct {p0, v6, p1}, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataOutputStream;->waitUntilWritable(IZ)V

    .line 641
    iget v0, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataOutputStream;->unacknowledgedBytes:I

    add-int/2addr v0, v6

    iput v0, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataOutputStream;->unacknowledgedBytes:I

    .line 642
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 643
    iget-object v0, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataOutputStream;->this$0:Lcom/squareup/okhttp/internal/spdy/SpdyStream;

    # getter for: Lcom/squareup/okhttp/internal/spdy/SpdyStream;->connection:Lcom/squareup/okhttp/internal/spdy/SpdyConnection;
    invoke-static {v0}, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->access$800(Lcom/squareup/okhttp/internal/spdy/SpdyStream;)Lcom/squareup/okhttp/internal/spdy/SpdyConnection;

    move-result-object v0

    iget-object v1, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataOutputStream;->this$0:Lcom/squareup/okhttp/internal/spdy/SpdyStream;

    # getter for: Lcom/squareup/okhttp/internal/spdy/SpdyStream;->id:I
    invoke-static {v1}, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->access$700(Lcom/squareup/okhttp/internal/spdy/SpdyStream;)I

    move-result v1

    iget-object v3, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataOutputStream;->buffer:[B

    iget v5, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataOutputStream;->pos:I

    move v2, p1

    invoke-virtual/range {v0 .. v5}, Lcom/squareup/okhttp/internal/spdy/SpdyConnection;->writeData(IZ[BII)V

    .line 644
    iput v4, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataOutputStream;->pos:I

    .line 645
    return-void

    .line 642
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method


# virtual methods
.method public close()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    const/4 v2, 0x1

    .line 621
    sget-boolean v0, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataOutputStream;->$assertionsDisabled:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataOutputStream;->this$0:Lcom/squareup/okhttp/internal/spdy/SpdyStream;

    invoke-static {v0}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 622
    :cond_0
    iget-object v1, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataOutputStream;->this$0:Lcom/squareup/okhttp/internal/spdy/SpdyStream;

    monitor-enter v1

    .line 623
    :try_start_0
    iget-boolean v0, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataOutputStream;->closed:Z

    if-eqz v0, :cond_1

    .line 624
    monitor-exit v1

    .line 633
    :goto_0
    return-void

    .line 626
    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataOutputStream;->closed:Z

    .line 627
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 628
    iget-object v0, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataOutputStream;->this$0:Lcom/squareup/okhttp/internal/spdy/SpdyStream;

    # getter for: Lcom/squareup/okhttp/internal/spdy/SpdyStream;->out:Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataOutputStream;
    invoke-static {v0}, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->access$1200(Lcom/squareup/okhttp/internal/spdy/SpdyStream;)Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataOutputStream;

    move-result-object v0

    iget-boolean v0, v0, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataOutputStream;->finished:Z

    if-nez v0, :cond_2

    .line 629
    invoke-direct {p0, v2}, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataOutputStream;->writeFrame(Z)V

    .line 631
    :cond_2
    iget-object v0, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataOutputStream;->this$0:Lcom/squareup/okhttp/internal/spdy/SpdyStream;

    # getter for: Lcom/squareup/okhttp/internal/spdy/SpdyStream;->connection:Lcom/squareup/okhttp/internal/spdy/SpdyConnection;
    invoke-static {v0}, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->access$800(Lcom/squareup/okhttp/internal/spdy/SpdyStream;)Lcom/squareup/okhttp/internal/spdy/SpdyConnection;

    move-result-object v0

    invoke-virtual {v0}, Lcom/squareup/okhttp/internal/spdy/SpdyConnection;->flush()V

    .line 632
    iget-object v0, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataOutputStream;->this$0:Lcom/squareup/okhttp/internal/spdy/SpdyStream;

    # invokes: Lcom/squareup/okhttp/internal/spdy/SpdyStream;->cancelStreamIfNecessary()V
    invoke-static {v0}, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->access$1100(Lcom/squareup/okhttp/internal/spdy/SpdyStream;)V

    goto :goto_0

    .line 627
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public flush()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 612
    sget-boolean v0, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataOutputStream;->$assertionsDisabled:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataOutputStream;->this$0:Lcom/squareup/okhttp/internal/spdy/SpdyStream;

    invoke-static {v0}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 613
    :cond_0
    invoke-direct {p0}, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataOutputStream;->checkNotClosed()V

    .line 614
    iget v0, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataOutputStream;->pos:I

    if-lez v0, :cond_1

    .line 615
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataOutputStream;->writeFrame(Z)V

    .line 616
    iget-object v0, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataOutputStream;->this$0:Lcom/squareup/okhttp/internal/spdy/SpdyStream;

    # getter for: Lcom/squareup/okhttp/internal/spdy/SpdyStream;->connection:Lcom/squareup/okhttp/internal/spdy/SpdyConnection;
    invoke-static {v0}, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->access$800(Lcom/squareup/okhttp/internal/spdy/SpdyStream;)Lcom/squareup/okhttp/internal/spdy/SpdyConnection;

    move-result-object v0

    invoke-virtual {v0}, Lcom/squareup/okhttp/internal/spdy/SpdyConnection;->flush()V

    .line 618
    :cond_1
    return-void
.end method

.method public write(I)V
    .locals 0
    .param p1, "b"    # I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 591
    invoke-static {p0, p1}, Lcom/squareup/okhttp/internal/Util;->writeSingleByte(Ljava/io/OutputStream;I)V

    .line 592
    return-void
.end method

.method public write([BII)V
    .locals 3
    .param p1, "bytes"    # [B
    .param p2, "offset"    # I
    .param p3, "count"    # I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 595
    sget-boolean v1, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataOutputStream;->$assertionsDisabled:Z

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataOutputStream;->this$0:Lcom/squareup/okhttp/internal/spdy/SpdyStream;

    invoke-static {v1}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v1, Ljava/lang/AssertionError;

    invoke-direct {v1}, Ljava/lang/AssertionError;-><init>()V

    throw v1

    .line 596
    :cond_0
    array-length v1, p1

    invoke-static {v1, p2, p3}, Lcom/squareup/okhttp/internal/Util;->checkOffsetAndCount(III)V

    .line 597
    invoke-direct {p0}, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataOutputStream;->checkNotClosed()V

    .line 599
    :goto_0
    if-lez p3, :cond_2

    .line 600
    iget v1, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataOutputStream;->pos:I

    iget-object v2, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataOutputStream;->buffer:[B

    array-length v2, v2

    if-ne v1, v2, :cond_1

    .line 601
    const/4 v1, 0x0

    invoke-direct {p0, v1}, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataOutputStream;->writeFrame(Z)V

    .line 603
    :cond_1
    iget-object v1, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataOutputStream;->buffer:[B

    array-length v1, v1

    iget v2, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataOutputStream;->pos:I

    sub-int/2addr v1, v2

    invoke-static {p3, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    .line 604
    .local v0, "bytesToCopy":I
    iget-object v1, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataOutputStream;->buffer:[B

    iget v2, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataOutputStream;->pos:I

    invoke-static {p1, p2, v1, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 605
    iget v1, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataOutputStream;->pos:I

    add-int/2addr v1, v0

    iput v1, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataOutputStream;->pos:I

    .line 606
    add-int/2addr p2, v0

    .line 607
    sub-int/2addr p3, v0

    .line 608
    goto :goto_0

    .line 609
    .end local v0    # "bytesToCopy":I
    :cond_2
    return-void
.end method
