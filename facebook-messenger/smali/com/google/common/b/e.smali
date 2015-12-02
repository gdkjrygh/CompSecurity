.class public final Lcom/google/common/b/e;
.super Ljava/io/FilterOutputStream;
.source "CountingOutputStream.java"


# annotations
.annotation build Lcom/google/common/annotations/Beta;
.end annotation


# instance fields
.field private a:J


# direct methods
.method public constructor <init>(Ljava/io/OutputStream;)V
    .locals 0

    .prologue
    .line 42
    invoke-direct {p0, p1}, Ljava/io/FilterOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 43
    return-void
.end method


# virtual methods
.method public a()J
    .locals 2

    .prologue
    .line 47
    iget-wide v0, p0, Lcom/google/common/b/e;->a:J

    return-wide v0
.end method

.method public write(I)V
    .locals 4

    .prologue
    .line 56
    iget-object v0, p0, Lcom/google/common/b/e;->out:Ljava/io/OutputStream;

    invoke-virtual {v0, p1}, Ljava/io/OutputStream;->write(I)V

    .line 57
    iget-wide v0, p0, Lcom/google/common/b/e;->a:J

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    iput-wide v0, p0, Lcom/google/common/b/e;->a:J

    .line 58
    return-void
.end method

.method public write([BII)V
    .locals 4

    .prologue
    .line 51
    iget-object v0, p0, Lcom/google/common/b/e;->out:Ljava/io/OutputStream;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/OutputStream;->write([BII)V

    .line 52
    iget-wide v0, p0, Lcom/google/common/b/e;->a:J

    int-to-long v2, p3

    add-long/2addr v0, v2

    iput-wide v0, p0, Lcom/google/common/b/e;->a:J

    .line 53
    return-void
.end method
