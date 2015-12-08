.class public abstract Lcom/squareup/okhttp/internal/FaultRecoveringOutputStream;
.super Lcom/squareup/okhttp/internal/AbstractOutputStream;
.source "FaultRecoveringOutputStream.java"


# instance fields
.field private final maxReplayBufferLength:I

.field private out:Ljava/io/OutputStream;

.field private replayBuffer:Ljava/io/ByteArrayOutputStream;


# direct methods
.method public constructor <init>(ILjava/io/OutputStream;)V
    .locals 1
    .param p1, "maxReplayBufferLength"    # I
    .param p2, "out"    # Ljava/io/OutputStream;

    .prologue
    .line 47
    invoke-direct {p0}, Lcom/squareup/okhttp/internal/AbstractOutputStream;-><init>()V

    .line 48
    if-gez p1, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0

    .line 49
    :cond_0
    iput p1, p0, Lcom/squareup/okhttp/internal/FaultRecoveringOutputStream;->maxReplayBufferLength:I

    .line 50
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0, p1}, Ljava/io/ByteArrayOutputStream;-><init>(I)V

    iput-object v0, p0, Lcom/squareup/okhttp/internal/FaultRecoveringOutputStream;->replayBuffer:Ljava/io/ByteArrayOutputStream;

    .line 51
    iput-object p2, p0, Lcom/squareup/okhttp/internal/FaultRecoveringOutputStream;->out:Ljava/io/OutputStream;

    .line 52
    return-void
.end method

.method private recover(Ljava/io/IOException;)Z
    .locals 4
    .param p1, "e"    # Ljava/io/IOException;

    .prologue
    const/4 v2, 0x0

    .line 112
    iget-object v3, p0, Lcom/squareup/okhttp/internal/FaultRecoveringOutputStream;->replayBuffer:Ljava/io/ByteArrayOutputStream;

    if-nez v3, :cond_1

    .line 124
    :cond_0
    :goto_0
    return v2

    .line 125
    .local v0, "replacementStream":Ljava/io/OutputStream;
    :catch_0
    move-exception v1

    .line 127
    .local v1, "replacementStreamFailure":Ljava/io/IOException;
    invoke-static {v0}, Lcom/squareup/okhttp/internal/Util;->closeQuietly(Ljava/io/Closeable;)V

    .line 128
    move-object p1, v1

    .line 117
    .end local v0    # "replacementStream":Ljava/io/OutputStream;
    .end local v1    # "replacementStreamFailure":Ljava/io/IOException;
    :cond_1
    const/4 v0, 0x0

    .line 119
    .restart local v0    # "replacementStream":Ljava/io/OutputStream;
    :try_start_0
    invoke-virtual {p0, p1}, Lcom/squareup/okhttp/internal/FaultRecoveringOutputStream;->replacementStream(Ljava/io/IOException;)Ljava/io/OutputStream;

    move-result-object v0

    .line 120
    if-eqz v0, :cond_0

    .line 123
    invoke-virtual {p0, v0}, Lcom/squareup/okhttp/internal/FaultRecoveringOutputStream;->replaceStream(Ljava/io/OutputStream;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 124
    const/4 v2, 0x1

    goto :goto_0
.end method


# virtual methods
.method public final close()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 93
    iget-boolean v1, p0, Lcom/squareup/okhttp/internal/FaultRecoveringOutputStream;->closed:Z

    if-eqz v1, :cond_0

    .line 100
    :goto_0
    return-void

    .line 98
    :cond_0
    :try_start_0
    iget-object v1, p0, Lcom/squareup/okhttp/internal/FaultRecoveringOutputStream;->out:Ljava/io/OutputStream;

    invoke-virtual {v1}, Ljava/io/OutputStream;->close()V

    .line 99
    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/squareup/okhttp/internal/FaultRecoveringOutputStream;->closed:Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 101
    :catch_0
    move-exception v0

    .line 102
    .local v0, "e":Ljava/io/IOException;
    invoke-direct {p0, v0}, Lcom/squareup/okhttp/internal/FaultRecoveringOutputStream;->recover(Ljava/io/IOException;)Z

    move-result v1

    if-nez v1, :cond_0

    throw v0
.end method

.method public final flush()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 79
    iget-boolean v1, p0, Lcom/squareup/okhttp/internal/FaultRecoveringOutputStream;->closed:Z

    if-eqz v1, :cond_0

    .line 85
    :goto_0
    return-void

    .line 84
    :cond_0
    :try_start_0
    iget-object v1, p0, Lcom/squareup/okhttp/internal/FaultRecoveringOutputStream;->out:Ljava/io/OutputStream;

    invoke-virtual {v1}, Ljava/io/OutputStream;->flush()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 86
    :catch_0
    move-exception v0

    .line 87
    .local v0, "e":Ljava/io/IOException;
    invoke-direct {p0, v0}, Lcom/squareup/okhttp/internal/FaultRecoveringOutputStream;->recover(Ljava/io/IOException;)Z

    move-result v1

    if-nez v1, :cond_0

    throw v0
.end method

.method public isRecoverable()Z
    .locals 1

    .prologue
    .line 137
    iget-object v0, p0, Lcom/squareup/okhttp/internal/FaultRecoveringOutputStream;->replayBuffer:Ljava/io/ByteArrayOutputStream;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final replaceStream(Ljava/io/OutputStream;)V
    .locals 1
    .param p1, "replacementStream"    # Ljava/io/OutputStream;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 145
    invoke-virtual {p0}, Lcom/squareup/okhttp/internal/FaultRecoveringOutputStream;->isRecoverable()Z

    move-result v0

    if-nez v0, :cond_0

    .line 146
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0

    .line 148
    :cond_0
    iget-object v0, p0, Lcom/squareup/okhttp/internal/FaultRecoveringOutputStream;->out:Ljava/io/OutputStream;

    if-ne v0, p1, :cond_1

    .line 154
    :goto_0
    return-void

    .line 151
    :cond_1
    iget-object v0, p0, Lcom/squareup/okhttp/internal/FaultRecoveringOutputStream;->replayBuffer:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {v0, p1}, Ljava/io/ByteArrayOutputStream;->writeTo(Ljava/io/OutputStream;)V

    .line 152
    iget-object v0, p0, Lcom/squareup/okhttp/internal/FaultRecoveringOutputStream;->out:Ljava/io/OutputStream;

    invoke-static {v0}, Lcom/squareup/okhttp/internal/Util;->closeQuietly(Ljava/io/Closeable;)V

    .line 153
    iput-object p1, p0, Lcom/squareup/okhttp/internal/FaultRecoveringOutputStream;->out:Ljava/io/OutputStream;

    goto :goto_0
.end method

.method protected abstract replacementStream(Ljava/io/IOException;)Ljava/io/OutputStream;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public final write([BII)V
    .locals 3
    .param p1, "buffer"    # [B
    .param p2, "offset"    # I
    .param p3, "count"    # I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 55
    iget-boolean v1, p0, Lcom/squareup/okhttp/internal/FaultRecoveringOutputStream;->closed:Z

    if-eqz v1, :cond_0

    new-instance v1, Ljava/io/IOException;

    const-string v2, "stream closed"

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 56
    :cond_0
    array-length v1, p1

    invoke-static {v1, p2, p3}, Lcom/squareup/okhttp/internal/Util;->checkOffsetAndCount(III)V

    .line 60
    :cond_1
    :try_start_0
    iget-object v1, p0, Lcom/squareup/okhttp/internal/FaultRecoveringOutputStream;->out:Ljava/io/OutputStream;

    invoke-virtual {v1, p1, p2, p3}, Ljava/io/OutputStream;->write([BII)V

    .line 62
    iget-object v1, p0, Lcom/squareup/okhttp/internal/FaultRecoveringOutputStream;->replayBuffer:Ljava/io/ByteArrayOutputStream;

    if-eqz v1, :cond_2

    .line 63
    iget-object v1, p0, Lcom/squareup/okhttp/internal/FaultRecoveringOutputStream;->replayBuffer:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->size()I

    move-result v1

    add-int/2addr v1, p3

    iget v2, p0, Lcom/squareup/okhttp/internal/FaultRecoveringOutputStream;->maxReplayBufferLength:I

    if-le v1, v2, :cond_3

    .line 65
    const/4 v1, 0x0

    iput-object v1, p0, Lcom/squareup/okhttp/internal/FaultRecoveringOutputStream;->replayBuffer:Ljava/io/ByteArrayOutputStream;

    .line 71
    :cond_2
    :goto_0
    return-void

    .line 68
    :cond_3
    iget-object v1, p0, Lcom/squareup/okhttp/internal/FaultRecoveringOutputStream;->replayBuffer:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {v1, p1, p2, p3}, Ljava/io/ByteArrayOutputStream;->write([BII)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 72
    :catch_0
    move-exception v0

    .line 73
    .local v0, "e":Ljava/io/IOException;
    invoke-direct {p0, v0}, Lcom/squareup/okhttp/internal/FaultRecoveringOutputStream;->recover(Ljava/io/IOException;)Z

    move-result v1

    if-nez v1, :cond_1

    throw v0
.end method
