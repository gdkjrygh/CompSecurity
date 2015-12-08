.class final Lcom/crashlytics/android/ap;
.super Ljava/io/InputStream;
.source "SourceFile"


# instance fields
.field private a:I

.field private b:I

.field private synthetic c:Lcom/crashlytics/android/QueueFile;


# direct methods
.method private constructor <init>(Lcom/crashlytics/android/QueueFile;Lcom/crashlytics/android/ao;)V
    .locals 1

    .prologue
    .line 447
    iput-object p1, p0, Lcom/crashlytics/android/ap;->c:Lcom/crashlytics/android/QueueFile;

    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    .line 448
    iget v0, p2, Lcom/crashlytics/android/ao;->b:I

    add-int/lit8 v0, v0, 0x4

    invoke-static {p1, v0}, Lcom/crashlytics/android/QueueFile;->a(Lcom/crashlytics/android/QueueFile;I)I

    move-result v0

    iput v0, p0, Lcom/crashlytics/android/ap;->a:I

    .line 449
    iget v0, p2, Lcom/crashlytics/android/ao;->c:I

    iput v0, p0, Lcom/crashlytics/android/ap;->b:I

    .line 450
    return-void
.end method

.method synthetic constructor <init>(Lcom/crashlytics/android/QueueFile;Lcom/crashlytics/android/ao;B)V
    .locals 0

    .prologue
    .line 443
    invoke-direct {p0, p1, p2}, Lcom/crashlytics/android/ap;-><init>(Lcom/crashlytics/android/QueueFile;Lcom/crashlytics/android/ao;)V

    return-void
.end method


# virtual methods
.method public final read()I
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 473
    iget v0, p0, Lcom/crashlytics/android/ap;->b:I

    if-nez v0, :cond_0

    .line 474
    const/4 v0, -0x1

    .line 480
    :goto_0
    return v0

    .line 476
    :cond_0
    iget-object v0, p0, Lcom/crashlytics/android/ap;->c:Lcom/crashlytics/android/QueueFile;

    invoke-static {v0}, Lcom/crashlytics/android/QueueFile;->a(Lcom/crashlytics/android/QueueFile;)Ljava/io/RandomAccessFile;

    move-result-object v0

    iget v1, p0, Lcom/crashlytics/android/ap;->a:I

    int-to-long v1, v1

    invoke-virtual {v0, v1, v2}, Ljava/io/RandomAccessFile;->seek(J)V

    .line 477
    iget-object v0, p0, Lcom/crashlytics/android/ap;->c:Lcom/crashlytics/android/QueueFile;

    invoke-static {v0}, Lcom/crashlytics/android/QueueFile;->a(Lcom/crashlytics/android/QueueFile;)Ljava/io/RandomAccessFile;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->read()I

    move-result v0

    .line 478
    iget-object v1, p0, Lcom/crashlytics/android/ap;->c:Lcom/crashlytics/android/QueueFile;

    iget v2, p0, Lcom/crashlytics/android/ap;->a:I

    add-int/lit8 v2, v2, 0x1

    invoke-static {v1, v2}, Lcom/crashlytics/android/QueueFile;->a(Lcom/crashlytics/android/QueueFile;I)I

    move-result v1

    iput v1, p0, Lcom/crashlytics/android/ap;->a:I

    .line 479
    iget v1, p0, Lcom/crashlytics/android/ap;->b:I

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, Lcom/crashlytics/android/ap;->b:I

    goto :goto_0
.end method

.method public final read([BII)I
    .locals 2
    .param p1, "buffer"    # [B
    .param p2, "offset"    # I
    .param p3, "length"    # I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 454
    const-string v0, "buffer"

    invoke-static {p1, v0}, Lcom/crashlytics/android/QueueFile;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 455
    or-int v0, p2, p3

    if-ltz v0, :cond_0

    array-length v0, p1

    sub-int/2addr v0, p2

    if-le p3, v0, :cond_1

    .line 456
    :cond_0
    new-instance v0, Ljava/lang/ArrayIndexOutOfBoundsException;

    invoke-direct {v0}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>()V

    throw v0

    .line 458
    :cond_1
    iget v0, p0, Lcom/crashlytics/android/ap;->b:I

    if-lez v0, :cond_3

    .line 459
    iget v0, p0, Lcom/crashlytics/android/ap;->b:I

    if-le p3, v0, :cond_2

    .line 460
    iget p3, p0, Lcom/crashlytics/android/ap;->b:I

    .line 462
    :cond_2
    iget-object v0, p0, Lcom/crashlytics/android/ap;->c:Lcom/crashlytics/android/QueueFile;

    iget v1, p0, Lcom/crashlytics/android/ap;->a:I

    invoke-static {v0, v1, p1, p2, p3}, Lcom/crashlytics/android/QueueFile;->a(Lcom/crashlytics/android/QueueFile;I[BII)V

    .line 463
    iget-object v0, p0, Lcom/crashlytics/android/ap;->c:Lcom/crashlytics/android/QueueFile;

    iget v1, p0, Lcom/crashlytics/android/ap;->a:I

    add-int/2addr v1, p3

    invoke-static {v0, v1}, Lcom/crashlytics/android/QueueFile;->a(Lcom/crashlytics/android/QueueFile;I)I

    move-result v0

    iput v0, p0, Lcom/crashlytics/android/ap;->a:I

    .line 464
    iget v0, p0, Lcom/crashlytics/android/ap;->b:I

    sub-int/2addr v0, p3

    iput v0, p0, Lcom/crashlytics/android/ap;->b:I

    move v0, p3

    .line 467
    :goto_0
    return v0

    :cond_3
    const/4 v0, -0x1

    goto :goto_0
.end method
