.class public final Lcom/a/a/b/a/d;
.super Ljava/io/FilterInputStream;


# direct methods
.method public constructor <init>(Ljava/io/InputStream;)V
    .locals 0

    invoke-direct {p0, p1}, Ljava/io/FilterInputStream;-><init>(Ljava/io/InputStream;)V

    return-void
.end method


# virtual methods
.method public final skip(J)J
    .locals 9

    const-wide/16 v4, 0x0

    move-wide v2, v4

    :goto_0
    cmp-long v0, v2, p1

    if-gez v0, :cond_1

    iget-object v0, p0, Lcom/a/a/b/a/d;->in:Ljava/io/InputStream;

    sub-long v6, p1, v2

    invoke-virtual {v0, v6, v7}, Ljava/io/InputStream;->skip(J)J

    move-result-wide v0

    cmp-long v6, v0, v4

    if-nez v6, :cond_0

    invoke-virtual {p0}, Lcom/a/a/b/a/d;->read()I

    move-result v0

    if-ltz v0, :cond_1

    const-wide/16 v0, 0x1

    :cond_0
    add-long/2addr v0, v2

    move-wide v2, v0

    goto :goto_0

    :cond_1
    return-wide v2
.end method
