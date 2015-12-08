.class final Lcom/facebook/internal/FileLruCache$CopyingInputStream;
.super Ljava/io/InputStream;
.source "SourceFile"


# instance fields
.field final input:Ljava/io/InputStream;

.field final output:Ljava/io/OutputStream;


# direct methods
.method constructor <init>(Ljava/io/InputStream;Ljava/io/OutputStream;)V
    .locals 0

    .prologue
    .line 515
    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    .line 516
    iput-object p1, p0, Lcom/facebook/internal/FileLruCache$CopyingInputStream;->input:Ljava/io/InputStream;

    .line 517
    iput-object p2, p0, Lcom/facebook/internal/FileLruCache$CopyingInputStream;->output:Ljava/io/OutputStream;

    .line 518
    return-void
.end method


# virtual methods
.method public final available()I
    .locals 1

    .prologue
    .line 522
    iget-object v0, p0, Lcom/facebook/internal/FileLruCache$CopyingInputStream;->input:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->available()I

    move-result v0

    return v0
.end method

.method public final close()V
    .locals 2

    .prologue
    .line 535
    :try_start_0
    iget-object v0, p0, Lcom/facebook/internal/FileLruCache$CopyingInputStream;->input:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 537
    iget-object v0, p0, Lcom/facebook/internal/FileLruCache$CopyingInputStream;->output:Ljava/io/OutputStream;

    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V

    .line 538
    return-void

    .line 537
    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/facebook/internal/FileLruCache$CopyingInputStream;->output:Ljava/io/OutputStream;

    invoke-virtual {v1}, Ljava/io/OutputStream;->close()V

    throw v0
.end method

.method public final mark(I)V
    .locals 1

    .prologue
    .line 543
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final markSupported()Z
    .locals 1

    .prologue
    .line 548
    const/4 v0, 0x0

    return v0
.end method

.method public final read()I
    .locals 2

    .prologue
    .line 562
    iget-object v0, p0, Lcom/facebook/internal/FileLruCache$CopyingInputStream;->input:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->read()I

    move-result v0

    .line 563
    if-ltz v0, :cond_0

    .line 564
    iget-object v1, p0, Lcom/facebook/internal/FileLruCache$CopyingInputStream;->output:Ljava/io/OutputStream;

    invoke-virtual {v1, v0}, Ljava/io/OutputStream;->write(I)V

    .line 566
    :cond_0
    return v0
.end method

.method public final read([B)I
    .locals 3

    .prologue
    .line 553
    iget-object v0, p0, Lcom/facebook/internal/FileLruCache$CopyingInputStream;->input:Ljava/io/InputStream;

    invoke-virtual {v0, p1}, Ljava/io/InputStream;->read([B)I

    move-result v0

    .line 554
    if-lez v0, :cond_0

    .line 555
    iget-object v1, p0, Lcom/facebook/internal/FileLruCache$CopyingInputStream;->output:Ljava/io/OutputStream;

    const/4 v2, 0x0

    invoke-virtual {v1, p1, v2, v0}, Ljava/io/OutputStream;->write([BII)V

    .line 557
    :cond_0
    return v0
.end method

.method public final read([BII)I
    .locals 2

    .prologue
    .line 571
    iget-object v0, p0, Lcom/facebook/internal/FileLruCache$CopyingInputStream;->input:Ljava/io/InputStream;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/InputStream;->read([BII)I

    move-result v0

    .line 572
    if-lez v0, :cond_0

    .line 573
    iget-object v1, p0, Lcom/facebook/internal/FileLruCache$CopyingInputStream;->output:Ljava/io/OutputStream;

    invoke-virtual {v1, p1, p2, v0}, Ljava/io/OutputStream;->write([BII)V

    .line 575
    :cond_0
    return v0
.end method

.method public final declared-synchronized reset()V
    .locals 1

    .prologue
    .line 580
    monitor-enter p0

    :try_start_0
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final skip(J)J
    .locals 9

    .prologue
    .line 585
    const/16 v0, 0x400

    new-array v2, v0, [B

    .line 586
    const-wide/16 v0, 0x0

    .line 587
    :goto_0
    cmp-long v3, v0, p1

    if-gez v3, :cond_0

    .line 588
    const/4 v3, 0x0

    sub-long v4, p1, v0

    const-wide/16 v6, 0x400

    invoke-static {v4, v5, v6, v7}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v4

    long-to-int v4, v4

    invoke-virtual {p0, v2, v3, v4}, Lcom/facebook/internal/FileLruCache$CopyingInputStream;->read([BII)I

    move-result v3

    .line 589
    if-gez v3, :cond_1

    .line 594
    :cond_0
    return-wide v0

    .line 592
    :cond_1
    int-to-long v4, v3

    add-long/2addr v0, v4

    .line 593
    goto :goto_0
.end method
