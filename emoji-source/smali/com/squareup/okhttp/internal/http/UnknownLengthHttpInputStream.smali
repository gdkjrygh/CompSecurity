.class final Lcom/squareup/okhttp/internal/http/UnknownLengthHttpInputStream;
.super Lcom/squareup/okhttp/internal/http/AbstractHttpInputStream;
.source "UnknownLengthHttpInputStream.java"


# instance fields
.field private inputExhausted:Z


# direct methods
.method constructor <init>(Ljava/io/InputStream;Ljava/net/CacheRequest;Lcom/squareup/okhttp/internal/http/HttpEngine;)V
    .locals 0
    .param p1, "in"    # Ljava/io/InputStream;
    .param p2, "cacheRequest"    # Ljava/net/CacheRequest;
    .param p3, "httpEngine"    # Lcom/squareup/okhttp/internal/http/HttpEngine;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 30
    invoke-direct {p0, p1, p3, p2}, Lcom/squareup/okhttp/internal/http/AbstractHttpInputStream;-><init>(Ljava/io/InputStream;Lcom/squareup/okhttp/internal/http/HttpEngine;Ljava/net/CacheRequest;)V

    .line 31
    return-void
.end method


# virtual methods
.method public available()I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 50
    invoke-virtual {p0}, Lcom/squareup/okhttp/internal/http/UnknownLengthHttpInputStream;->checkNotClosed()V

    .line 51
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/UnknownLengthHttpInputStream;->in:Ljava/io/InputStream;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/UnknownLengthHttpInputStream;->in:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->available()I

    move-result v0

    goto :goto_0
.end method

.method public close()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 55
    iget-boolean v0, p0, Lcom/squareup/okhttp/internal/http/UnknownLengthHttpInputStream;->closed:Z

    if-eqz v0, :cond_1

    .line 62
    :cond_0
    :goto_0
    return-void

    .line 58
    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/squareup/okhttp/internal/http/UnknownLengthHttpInputStream;->closed:Z

    .line 59
    iget-boolean v0, p0, Lcom/squareup/okhttp/internal/http/UnknownLengthHttpInputStream;->inputExhausted:Z

    if-nez v0, :cond_0

    .line 60
    invoke-virtual {p0}, Lcom/squareup/okhttp/internal/http/UnknownLengthHttpInputStream;->unexpectedEndOfInput()V

    goto :goto_0
.end method

.method public read([BII)I
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
    const/4 v1, -0x1

    .line 34
    array-length v2, p1

    invoke-static {v2, p2, p3}, Lcom/squareup/okhttp/internal/Util;->checkOffsetAndCount(III)V

    .line 35
    invoke-virtual {p0}, Lcom/squareup/okhttp/internal/http/UnknownLengthHttpInputStream;->checkNotClosed()V

    .line 36
    iget-object v2, p0, Lcom/squareup/okhttp/internal/http/UnknownLengthHttpInputStream;->in:Ljava/io/InputStream;

    if-eqz v2, :cond_0

    iget-boolean v2, p0, Lcom/squareup/okhttp/internal/http/UnknownLengthHttpInputStream;->inputExhausted:Z

    if-eqz v2, :cond_1

    :cond_0
    move v0, v1

    .line 46
    :goto_0
    return v0

    .line 39
    :cond_1
    iget-object v2, p0, Lcom/squareup/okhttp/internal/http/UnknownLengthHttpInputStream;->in:Ljava/io/InputStream;

    invoke-virtual {v2, p1, p2, p3}, Ljava/io/InputStream;->read([BII)I

    move-result v0

    .line 40
    .local v0, "read":I
    if-ne v0, v1, :cond_2

    .line 41
    const/4 v2, 0x1

    iput-boolean v2, p0, Lcom/squareup/okhttp/internal/http/UnknownLengthHttpInputStream;->inputExhausted:Z

    .line 42
    invoke-virtual {p0}, Lcom/squareup/okhttp/internal/http/UnknownLengthHttpInputStream;->endOfInput()V

    move v0, v1

    .line 43
    goto :goto_0

    .line 45
    :cond_2
    invoke-virtual {p0, p1, p2, v0}, Lcom/squareup/okhttp/internal/http/UnknownLengthHttpInputStream;->cacheWrite([BII)V

    goto :goto_0
.end method
