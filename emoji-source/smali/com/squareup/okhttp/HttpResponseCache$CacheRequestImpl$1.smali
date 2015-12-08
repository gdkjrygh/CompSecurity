.class Lcom/squareup/okhttp/HttpResponseCache$CacheRequestImpl$1;
.super Ljava/io/FilterOutputStream;
.source "HttpResponseCache.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/squareup/okhttp/HttpResponseCache$CacheRequestImpl;-><init>(Lcom/squareup/okhttp/HttpResponseCache;Lcom/squareup/okhttp/internal/DiskLruCache$Editor;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/squareup/okhttp/HttpResponseCache$CacheRequestImpl;

.field final synthetic val$editor:Lcom/squareup/okhttp/internal/DiskLruCache$Editor;

.field final synthetic val$this$0:Lcom/squareup/okhttp/HttpResponseCache;


# direct methods
.method constructor <init>(Lcom/squareup/okhttp/HttpResponseCache$CacheRequestImpl;Ljava/io/OutputStream;Lcom/squareup/okhttp/HttpResponseCache;Lcom/squareup/okhttp/internal/DiskLruCache$Editor;)V
    .locals 0
    .param p1, "this$1"    # Lcom/squareup/okhttp/HttpResponseCache$CacheRequestImpl;
    .param p2, "x0"    # Ljava/io/OutputStream;

    .prologue
    .line 387
    iput-object p1, p0, Lcom/squareup/okhttp/HttpResponseCache$CacheRequestImpl$1;->this$1:Lcom/squareup/okhttp/HttpResponseCache$CacheRequestImpl;

    iput-object p3, p0, Lcom/squareup/okhttp/HttpResponseCache$CacheRequestImpl$1;->val$this$0:Lcom/squareup/okhttp/HttpResponseCache;

    iput-object p4, p0, Lcom/squareup/okhttp/HttpResponseCache$CacheRequestImpl$1;->val$editor:Lcom/squareup/okhttp/internal/DiskLruCache$Editor;

    invoke-direct {p0, p2}, Ljava/io/FilterOutputStream;-><init>(Ljava/io/OutputStream;)V

    return-void
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
    .line 389
    iget-object v0, p0, Lcom/squareup/okhttp/HttpResponseCache$CacheRequestImpl$1;->this$1:Lcom/squareup/okhttp/HttpResponseCache$CacheRequestImpl;

    iget-object v1, v0, Lcom/squareup/okhttp/HttpResponseCache$CacheRequestImpl;->this$0:Lcom/squareup/okhttp/HttpResponseCache;

    monitor-enter v1

    .line 390
    :try_start_0
    iget-object v0, p0, Lcom/squareup/okhttp/HttpResponseCache$CacheRequestImpl$1;->this$1:Lcom/squareup/okhttp/HttpResponseCache$CacheRequestImpl;

    # getter for: Lcom/squareup/okhttp/HttpResponseCache$CacheRequestImpl;->done:Z
    invoke-static {v0}, Lcom/squareup/okhttp/HttpResponseCache$CacheRequestImpl;->access$700(Lcom/squareup/okhttp/HttpResponseCache$CacheRequestImpl;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 391
    monitor-exit v1

    .line 398
    :goto_0
    return-void

    .line 393
    :cond_0
    iget-object v0, p0, Lcom/squareup/okhttp/HttpResponseCache$CacheRequestImpl$1;->this$1:Lcom/squareup/okhttp/HttpResponseCache$CacheRequestImpl;

    const/4 v2, 0x1

    # setter for: Lcom/squareup/okhttp/HttpResponseCache$CacheRequestImpl;->done:Z
    invoke-static {v0, v2}, Lcom/squareup/okhttp/HttpResponseCache$CacheRequestImpl;->access$702(Lcom/squareup/okhttp/HttpResponseCache$CacheRequestImpl;Z)Z

    .line 394
    iget-object v0, p0, Lcom/squareup/okhttp/HttpResponseCache$CacheRequestImpl$1;->this$1:Lcom/squareup/okhttp/HttpResponseCache$CacheRequestImpl;

    iget-object v0, v0, Lcom/squareup/okhttp/HttpResponseCache$CacheRequestImpl;->this$0:Lcom/squareup/okhttp/HttpResponseCache;

    # operator++ for: Lcom/squareup/okhttp/HttpResponseCache;->writeSuccessCount:I
    invoke-static {v0}, Lcom/squareup/okhttp/HttpResponseCache;->access$808(Lcom/squareup/okhttp/HttpResponseCache;)I

    .line 395
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 396
    invoke-super {p0}, Ljava/io/FilterOutputStream;->close()V

    .line 397
    iget-object v0, p0, Lcom/squareup/okhttp/HttpResponseCache$CacheRequestImpl$1;->val$editor:Lcom/squareup/okhttp/internal/DiskLruCache$Editor;

    invoke-virtual {v0}, Lcom/squareup/okhttp/internal/DiskLruCache$Editor;->commit()V

    goto :goto_0

    .line 395
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public write([BII)V
    .locals 1
    .param p1, "buffer"    # [B
    .param p2, "offset"    # I
    .param p3, "length"    # I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 403
    iget-object v0, p0, Lcom/squareup/okhttp/HttpResponseCache$CacheRequestImpl$1;->out:Ljava/io/OutputStream;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/OutputStream;->write([BII)V

    .line 404
    return-void
.end method
