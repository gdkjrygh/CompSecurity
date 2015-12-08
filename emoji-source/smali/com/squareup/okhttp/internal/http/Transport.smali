.class interface abstract Lcom/squareup/okhttp/internal/http/Transport;
.super Ljava/lang/Object;
.source "Transport.java"


# virtual methods
.method public abstract createRequestBody()Ljava/io/OutputStream;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public abstract flushRequest()V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public abstract getTransferStream(Ljava/net/CacheRequest;)Ljava/io/InputStream;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public abstract makeReusable(ZLjava/io/OutputStream;Ljava/io/InputStream;)Z
.end method

.method public abstract readResponseHeaders()Lcom/squareup/okhttp/internal/http/ResponseHeaders;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public abstract writeRequestBody(Lcom/squareup/okhttp/internal/http/RetryableOutputStream;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public abstract writeRequestHeaders()V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method
