.class Lcom/dropbox/client2/ProgressListener$ProgressHttpEntity$CountingOutputStream;
.super Ljava/io/FilterOutputStream;
.source "SourceFile"


# instance fields
.field private intervalMs:J

.field private lastListened:J

.field final synthetic this$0:Lcom/dropbox/client2/ProgressListener$ProgressHttpEntity;

.field private transferred:J


# direct methods
.method public constructor <init>(Lcom/dropbox/client2/ProgressListener$ProgressHttpEntity;Ljava/io/OutputStream;)V
    .locals 2

    .prologue
    const-wide/16 v0, 0x0

    .line 86
    iput-object p1, p0, Lcom/dropbox/client2/ProgressListener$ProgressHttpEntity$CountingOutputStream;->this$0:Lcom/dropbox/client2/ProgressListener$ProgressHttpEntity;

    .line 87
    invoke-direct {p0, p2}, Ljava/io/FilterOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 82
    iput-wide v0, p0, Lcom/dropbox/client2/ProgressListener$ProgressHttpEntity$CountingOutputStream;->lastListened:J

    .line 83
    iput-wide v0, p0, Lcom/dropbox/client2/ProgressListener$ProgressHttpEntity$CountingOutputStream;->intervalMs:J

    .line 84
    iput-wide v0, p0, Lcom/dropbox/client2/ProgressListener$ProgressHttpEntity$CountingOutputStream;->transferred:J

    .line 88
    # getter for: Lcom/dropbox/client2/ProgressListener$ProgressHttpEntity;->listener:Lcom/dropbox/client2/ProgressListener;
    invoke-static {p1}, Lcom/dropbox/client2/ProgressListener$ProgressHttpEntity;->access$000(Lcom/dropbox/client2/ProgressListener$ProgressHttpEntity;)Lcom/dropbox/client2/ProgressListener;

    move-result-object v0

    invoke-virtual {v0}, Lcom/dropbox/client2/ProgressListener;->progressInterval()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/dropbox/client2/ProgressListener$ProgressHttpEntity$CountingOutputStream;->intervalMs:J

    .line 89
    return-void
.end method


# virtual methods
.method public write(I)V
    .locals 6

    .prologue
    .line 106
    invoke-super {p0, p1}, Ljava/io/FilterOutputStream;->write(I)V

    .line 107
    iget-wide v0, p0, Lcom/dropbox/client2/ProgressListener$ProgressHttpEntity$CountingOutputStream;->transferred:J

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    iput-wide v0, p0, Lcom/dropbox/client2/ProgressListener$ProgressHttpEntity$CountingOutputStream;->transferred:J

    .line 108
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 109
    iget-wide v2, p0, Lcom/dropbox/client2/ProgressListener$ProgressHttpEntity$CountingOutputStream;->lastListened:J

    sub-long v2, v0, v2

    iget-wide v4, p0, Lcom/dropbox/client2/ProgressListener$ProgressHttpEntity$CountingOutputStream;->intervalMs:J

    cmp-long v2, v2, v4

    if-lez v2, :cond_0

    .line 110
    iput-wide v0, p0, Lcom/dropbox/client2/ProgressListener$ProgressHttpEntity$CountingOutputStream;->lastListened:J

    .line 111
    iget-object v0, p0, Lcom/dropbox/client2/ProgressListener$ProgressHttpEntity$CountingOutputStream;->this$0:Lcom/dropbox/client2/ProgressListener$ProgressHttpEntity;

    # getter for: Lcom/dropbox/client2/ProgressListener$ProgressHttpEntity;->listener:Lcom/dropbox/client2/ProgressListener;
    invoke-static {v0}, Lcom/dropbox/client2/ProgressListener$ProgressHttpEntity;->access$000(Lcom/dropbox/client2/ProgressListener$ProgressHttpEntity;)Lcom/dropbox/client2/ProgressListener;

    move-result-object v0

    iget-wide v2, p0, Lcom/dropbox/client2/ProgressListener$ProgressHttpEntity$CountingOutputStream;->transferred:J

    iget-object v1, p0, Lcom/dropbox/client2/ProgressListener$ProgressHttpEntity$CountingOutputStream;->this$0:Lcom/dropbox/client2/ProgressListener$ProgressHttpEntity;

    # getter for: Lcom/dropbox/client2/ProgressListener$ProgressHttpEntity;->length:J
    invoke-static {v1}, Lcom/dropbox/client2/ProgressListener$ProgressHttpEntity;->access$100(Lcom/dropbox/client2/ProgressListener$ProgressHttpEntity;)J

    move-result-wide v4

    invoke-virtual {v0, v2, v3, v4, v5}, Lcom/dropbox/client2/ProgressListener;->onProgress(JJ)V

    .line 113
    :cond_0
    return-void
.end method

.method public write([BII)V
    .locals 6

    .prologue
    .line 95
    iget-object v0, p0, Lcom/dropbox/client2/ProgressListener$ProgressHttpEntity$CountingOutputStream;->out:Ljava/io/OutputStream;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/OutputStream;->write([BII)V

    .line 96
    iget-wide v0, p0, Lcom/dropbox/client2/ProgressListener$ProgressHttpEntity$CountingOutputStream;->transferred:J

    int-to-long v2, p3

    add-long/2addr v0, v2

    iput-wide v0, p0, Lcom/dropbox/client2/ProgressListener$ProgressHttpEntity$CountingOutputStream;->transferred:J

    .line 97
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 98
    iget-wide v2, p0, Lcom/dropbox/client2/ProgressListener$ProgressHttpEntity$CountingOutputStream;->lastListened:J

    sub-long v2, v0, v2

    iget-wide v4, p0, Lcom/dropbox/client2/ProgressListener$ProgressHttpEntity$CountingOutputStream;->intervalMs:J

    cmp-long v2, v2, v4

    if-lez v2, :cond_0

    .line 99
    iput-wide v0, p0, Lcom/dropbox/client2/ProgressListener$ProgressHttpEntity$CountingOutputStream;->lastListened:J

    .line 100
    iget-object v0, p0, Lcom/dropbox/client2/ProgressListener$ProgressHttpEntity$CountingOutputStream;->this$0:Lcom/dropbox/client2/ProgressListener$ProgressHttpEntity;

    # getter for: Lcom/dropbox/client2/ProgressListener$ProgressHttpEntity;->listener:Lcom/dropbox/client2/ProgressListener;
    invoke-static {v0}, Lcom/dropbox/client2/ProgressListener$ProgressHttpEntity;->access$000(Lcom/dropbox/client2/ProgressListener$ProgressHttpEntity;)Lcom/dropbox/client2/ProgressListener;

    move-result-object v0

    iget-wide v2, p0, Lcom/dropbox/client2/ProgressListener$ProgressHttpEntity$CountingOutputStream;->transferred:J

    iget-object v1, p0, Lcom/dropbox/client2/ProgressListener$ProgressHttpEntity$CountingOutputStream;->this$0:Lcom/dropbox/client2/ProgressListener$ProgressHttpEntity;

    # getter for: Lcom/dropbox/client2/ProgressListener$ProgressHttpEntity;->length:J
    invoke-static {v1}, Lcom/dropbox/client2/ProgressListener$ProgressHttpEntity;->access$100(Lcom/dropbox/client2/ProgressListener$ProgressHttpEntity;)J

    move-result-wide v4

    invoke-virtual {v0, v2, v3, v4, v5}, Lcom/dropbox/client2/ProgressListener;->onProgress(JJ)V

    .line 102
    :cond_0
    return-void
.end method
