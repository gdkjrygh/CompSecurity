.class Lcom/qihoo360/common/unzip/a$a$a;
.super Ljava/io/InputStream;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo360/common/unzip/a$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo360/common/unzip/a$a;

.field private b:J

.field private c:J

.field private d:Z


# direct methods
.method constructor <init>(Lcom/qihoo360/common/unzip/a$a;JJ)V
    .locals 2

    .prologue
    .line 528
    iput-object p1, p0, Lcom/qihoo360/common/unzip/a$a$a;->a:Lcom/qihoo360/common/unzip/a$a;

    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    .line 526
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/qihoo360/common/unzip/a$a$a;->d:Z

    .line 529
    iput-wide p4, p0, Lcom/qihoo360/common/unzip/a$a$a;->b:J

    .line 530
    iput-wide p2, p0, Lcom/qihoo360/common/unzip/a$a$a;->c:J

    .line 531
    return-void
.end method


# virtual methods
.method a()V
    .locals 1

    .prologue
    .line 583
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/qihoo360/common/unzip/a$a$a;->d:Z

    .line 584
    return-void
.end method

.method public read()I
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    const-wide/16 v6, 0x1

    const/4 v0, 0x0

    .line 535
    iget-wide v2, p0, Lcom/qihoo360/common/unzip/a$a$a;->b:J

    sub-long v4, v2, v6

    iput-wide v4, p0, Lcom/qihoo360/common/unzip/a$a$a;->b:J

    const-wide/16 v4, 0x0

    cmp-long v1, v2, v4

    if-gtz v1, :cond_1

    .line 536
    iget-boolean v1, p0, Lcom/qihoo360/common/unzip/a$a$a;->d:Z

    if-eqz v1, :cond_0

    .line 537
    iput-boolean v0, p0, Lcom/qihoo360/common/unzip/a$a$a;->d:Z

    .line 544
    :goto_0
    return v0

    .line 540
    :cond_0
    const/4 v0, -0x1

    goto :goto_0

    .line 542
    :cond_1
    iget-object v0, p0, Lcom/qihoo360/common/unzip/a$a$a;->a:Lcom/qihoo360/common/unzip/a$a;

    invoke-static {v0}, Lcom/qihoo360/common/unzip/a$a;->a(Lcom/qihoo360/common/unzip/a$a;)Lcom/qihoo360/common/unzip/a;

    move-result-object v0

    iget-object v1, v0, Lcom/qihoo360/common/unzip/a;->a:Ljava/io/RandomAccessFile;

    monitor-enter v1

    .line 543
    :try_start_0
    iget-object v0, p0, Lcom/qihoo360/common/unzip/a$a$a;->a:Lcom/qihoo360/common/unzip/a$a;

    invoke-static {v0}, Lcom/qihoo360/common/unzip/a$a;->a(Lcom/qihoo360/common/unzip/a$a;)Lcom/qihoo360/common/unzip/a;

    move-result-object v0

    iget-object v0, v0, Lcom/qihoo360/common/unzip/a;->a:Ljava/io/RandomAccessFile;

    iget-wide v2, p0, Lcom/qihoo360/common/unzip/a$a$a;->c:J

    add-long v4, v2, v6

    iput-wide v4, p0, Lcom/qihoo360/common/unzip/a$a$a;->c:J

    invoke-virtual {v0, v2, v3}, Ljava/io/RandomAccessFile;->seek(J)V

    .line 544
    iget-object v0, p0, Lcom/qihoo360/common/unzip/a$a$a;->a:Lcom/qihoo360/common/unzip/a$a;

    invoke-static {v0}, Lcom/qihoo360/common/unzip/a$a;->a(Lcom/qihoo360/common/unzip/a$a;)Lcom/qihoo360/common/unzip/a;

    move-result-object v0

    iget-object v0, v0, Lcom/qihoo360/common/unzip/a;->a:Ljava/io/RandomAccessFile;

    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->read()I

    move-result v0

    monitor-exit v1

    goto :goto_0

    .line 542
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public read([BII)I
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    const/4 v0, 0x0

    .line 550
    iget-wide v2, p0, Lcom/qihoo360/common/unzip/a$a$a;->b:J

    const-wide/16 v4, 0x0

    cmp-long v1, v2, v4

    if-gtz v1, :cond_2

    .line 551
    iget-boolean v1, p0, Lcom/qihoo360/common/unzip/a$a$a;->d:Z

    if-eqz v1, :cond_1

    .line 552
    iput-boolean v0, p0, Lcom/qihoo360/common/unzip/a$a$a;->d:Z

    .line 553
    aput-byte v0, p1, p2

    .line 554
    const/4 v0, 0x1

    .line 575
    :cond_0
    :goto_0
    return v0

    .line 556
    :cond_1
    const/4 v0, -0x1

    goto :goto_0

    .line 559
    :cond_2
    if-lez p3, :cond_0

    .line 563
    int-to-long v0, p3

    iget-wide v2, p0, Lcom/qihoo360/common/unzip/a$a$a;->b:J

    cmp-long v0, v0, v2

    if-lez v0, :cond_3

    .line 564
    iget-wide v0, p0, Lcom/qihoo360/common/unzip/a$a$a;->b:J

    long-to-int p3, v0

    .line 567
    :cond_3
    iget-object v0, p0, Lcom/qihoo360/common/unzip/a$a$a;->a:Lcom/qihoo360/common/unzip/a$a;

    invoke-static {v0}, Lcom/qihoo360/common/unzip/a$a;->a(Lcom/qihoo360/common/unzip/a$a;)Lcom/qihoo360/common/unzip/a;

    move-result-object v0

    iget-object v1, v0, Lcom/qihoo360/common/unzip/a;->a:Ljava/io/RandomAccessFile;

    monitor-enter v1

    .line 568
    :try_start_0
    iget-object v0, p0, Lcom/qihoo360/common/unzip/a$a$a;->a:Lcom/qihoo360/common/unzip/a$a;

    invoke-static {v0}, Lcom/qihoo360/common/unzip/a$a;->a(Lcom/qihoo360/common/unzip/a$a;)Lcom/qihoo360/common/unzip/a;

    move-result-object v0

    iget-object v0, v0, Lcom/qihoo360/common/unzip/a;->a:Ljava/io/RandomAccessFile;

    iget-wide v2, p0, Lcom/qihoo360/common/unzip/a$a$a;->c:J

    invoke-virtual {v0, v2, v3}, Ljava/io/RandomAccessFile;->seek(J)V

    .line 569
    iget-object v0, p0, Lcom/qihoo360/common/unzip/a$a$a;->a:Lcom/qihoo360/common/unzip/a$a;

    invoke-static {v0}, Lcom/qihoo360/common/unzip/a$a;->a(Lcom/qihoo360/common/unzip/a$a;)Lcom/qihoo360/common/unzip/a;

    move-result-object v0

    iget-object v0, v0, Lcom/qihoo360/common/unzip/a;->a:Ljava/io/RandomAccessFile;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/RandomAccessFile;->read([BII)I

    move-result v0

    .line 567
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 571
    if-lez v0, :cond_0

    .line 572
    iget-wide v2, p0, Lcom/qihoo360/common/unzip/a$a$a;->c:J

    int-to-long v4, v0

    add-long/2addr v2, v4

    iput-wide v2, p0, Lcom/qihoo360/common/unzip/a$a$a;->c:J

    .line 573
    iget-wide v2, p0, Lcom/qihoo360/common/unzip/a$a$a;->b:J

    int-to-long v4, v0

    sub-long/2addr v2, v4

    iput-wide v2, p0, Lcom/qihoo360/common/unzip/a$a$a;->b:J

    goto :goto_0

    .line 567
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method
