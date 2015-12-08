.class public final Lcom/a/a/b/a/a;
.super Ljava/io/InputStream;


# instance fields
.field private final a:Ljava/io/InputStream;

.field private final b:J

.field private c:J


# direct methods
.method public constructor <init>(Ljava/io/InputStream;J)V
    .locals 0

    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    iput-object p1, p0, Lcom/a/a/b/a/a;->a:Ljava/io/InputStream;

    iput-wide p2, p0, Lcom/a/a/b/a/a;->b:J

    return-void
.end method


# virtual methods
.method public final declared-synchronized available()I
    .locals 4

    monitor-enter p0

    :try_start_0
    iget-wide v0, p0, Lcom/a/a/b/a/a;->b:J

    iget-wide v2, p0, Lcom/a/a/b/a/a;->c:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sub-long/2addr v0, v2

    long-to-int v0, v0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final close()V
    .locals 1

    iget-object v0, p0, Lcom/a/a/b/a/a;->a:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    return-void
.end method

.method public final mark(I)V
    .locals 2

    int-to-long v0, p1

    iput-wide v0, p0, Lcom/a/a/b/a/a;->c:J

    iget-object v0, p0, Lcom/a/a/b/a/a;->a:Ljava/io/InputStream;

    invoke-virtual {v0, p1}, Ljava/io/InputStream;->mark(I)V

    return-void
.end method

.method public final read()I
    .locals 4

    iget-wide v0, p0, Lcom/a/a/b/a/a;->c:J

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    iput-wide v0, p0, Lcom/a/a/b/a/a;->c:J

    iget-object v0, p0, Lcom/a/a/b/a/a;->a:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->read()I

    move-result v0

    return v0
.end method

.method public final read([B)I
    .locals 2

    const/4 v0, 0x0

    array-length v1, p1

    invoke-virtual {p0, p1, v0, v1}, Lcom/a/a/b/a/a;->read([BII)I

    move-result v0

    return v0
.end method

.method public final read([BII)I
    .locals 4

    iget-wide v0, p0, Lcom/a/a/b/a/a;->c:J

    int-to-long v2, p3

    add-long/2addr v0, v2

    iput-wide v0, p0, Lcom/a/a/b/a/a;->c:J

    iget-object v0, p0, Lcom/a/a/b/a/a;->a:Ljava/io/InputStream;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/InputStream;->read([BII)I

    move-result v0

    return v0
.end method

.method public final declared-synchronized reset()V
    .locals 2

    monitor-enter p0

    const-wide/16 v0, 0x0

    :try_start_0
    iput-wide v0, p0, Lcom/a/a/b/a/a;->c:J

    iget-object v0, p0, Lcom/a/a/b/a/a;->a:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->reset()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final skip(J)J
    .locals 3

    iget-wide v0, p0, Lcom/a/a/b/a/a;->c:J

    add-long/2addr v0, p1

    iput-wide v0, p0, Lcom/a/a/b/a/a;->c:J

    iget-object v0, p0, Lcom/a/a/b/a/a;->a:Ljava/io/InputStream;

    invoke-virtual {v0, p1, p2}, Ljava/io/InputStream;->skip(J)J

    move-result-wide v0

    return-wide v0
.end method
