.class public final Lcom/google/common/b/d;
.super Ljava/io/FilterInputStream;
.source "CountingInputStream.java"


# annotations
.annotation build Lcom/google/common/annotations/Beta;
.end annotation


# instance fields
.field private a:J

.field private b:J


# direct methods
.method public constructor <init>(Ljava/io/InputStream;)V
    .locals 2

    .prologue
    .line 43
    invoke-direct {p0, p1}, Ljava/io/FilterInputStream;-><init>(Ljava/io/InputStream;)V

    .line 35
    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/google/common/b/d;->b:J

    .line 44
    return-void
.end method


# virtual methods
.method public a()J
    .locals 2

    .prologue
    .line 48
    iget-wide v0, p0, Lcom/google/common/b/d;->a:J

    return-wide v0
.end method

.method public mark(I)V
    .locals 2

    .prologue
    .line 74
    iget-object v0, p0, Lcom/google/common/b/d;->in:Ljava/io/InputStream;

    invoke-virtual {v0, p1}, Ljava/io/InputStream;->mark(I)V

    .line 75
    iget-wide v0, p0, Lcom/google/common/b/d;->a:J

    iput-wide v0, p0, Lcom/google/common/b/d;->b:J

    .line 77
    return-void
.end method

.method public read()I
    .locals 5

    .prologue
    .line 52
    iget-object v0, p0, Lcom/google/common/b/d;->in:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->read()I

    move-result v0

    .line 53
    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 54
    iget-wide v1, p0, Lcom/google/common/b/d;->a:J

    const-wide/16 v3, 0x1

    add-long/2addr v1, v3

    iput-wide v1, p0, Lcom/google/common/b/d;->a:J

    .line 56
    :cond_0
    return v0
.end method

.method public read([BII)I
    .locals 5

    .prologue
    .line 60
    iget-object v0, p0, Lcom/google/common/b/d;->in:Ljava/io/InputStream;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/InputStream;->read([BII)I

    move-result v0

    .line 61
    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 62
    iget-wide v1, p0, Lcom/google/common/b/d;->a:J

    int-to-long v3, v0

    add-long/2addr v1, v3

    iput-wide v1, p0, Lcom/google/common/b/d;->a:J

    .line 64
    :cond_0
    return v0
.end method

.method public reset()V
    .locals 4

    .prologue
    .line 80
    iget-object v0, p0, Lcom/google/common/b/d;->in:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->markSupported()Z

    move-result v0

    if-nez v0, :cond_0

    .line 81
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Mark not supported"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 83
    :cond_0
    iget-wide v0, p0, Lcom/google/common/b/d;->b:J

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-nez v0, :cond_1

    .line 84
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Mark not set"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 87
    :cond_1
    iget-object v0, p0, Lcom/google/common/b/d;->in:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->reset()V

    .line 88
    iget-wide v0, p0, Lcom/google/common/b/d;->b:J

    iput-wide v0, p0, Lcom/google/common/b/d;->a:J

    .line 89
    return-void
.end method

.method public skip(J)J
    .locals 4

    .prologue
    .line 68
    iget-object v0, p0, Lcom/google/common/b/d;->in:Ljava/io/InputStream;

    invoke-virtual {v0, p1, p2}, Ljava/io/InputStream;->skip(J)J

    move-result-wide v0

    .line 69
    iget-wide v2, p0, Lcom/google/common/b/d;->a:J

    add-long/2addr v2, v0

    iput-wide v2, p0, Lcom/google/common/b/d;->a:J

    .line 70
    return-wide v0
.end method
