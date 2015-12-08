.class Lcom/squareup/okhttp/Dispatcher$RealResponseBody;
.super Lcom/squareup/okhttp/Response$Body;
.source "Dispatcher.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/squareup/okhttp/Dispatcher;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "RealResponseBody"
.end annotation


# instance fields
.field private final in:Ljava/io/InputStream;

.field private final responseHeaders:Lcom/squareup/okhttp/internal/http/ResponseHeaders;


# direct methods
.method constructor <init>(Lcom/squareup/okhttp/internal/http/ResponseHeaders;Ljava/io/InputStream;)V
    .locals 0
    .param p1, "responseHeaders"    # Lcom/squareup/okhttp/internal/http/ResponseHeaders;
    .param p2, "in"    # Ljava/io/InputStream;

    .prologue
    .line 64
    invoke-direct {p0}, Lcom/squareup/okhttp/Response$Body;-><init>()V

    .line 65
    iput-object p1, p0, Lcom/squareup/okhttp/Dispatcher$RealResponseBody;->responseHeaders:Lcom/squareup/okhttp/internal/http/ResponseHeaders;

    .line 66
    iput-object p2, p0, Lcom/squareup/okhttp/Dispatcher$RealResponseBody;->in:Ljava/io/InputStream;

    .line 67
    return-void
.end method


# virtual methods
.method public byteStream()Ljava/io/InputStream;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 83
    iget-object v0, p0, Lcom/squareup/okhttp/Dispatcher$RealResponseBody;->in:Ljava/io/InputStream;

    return-object v0
.end method

.method public contentLength()J
    .locals 2

    .prologue
    .line 79
    iget-object v0, p0, Lcom/squareup/okhttp/Dispatcher$RealResponseBody;->responseHeaders:Lcom/squareup/okhttp/internal/http/ResponseHeaders;

    invoke-virtual {v0}, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->getContentLength()J

    move-result-wide v0

    return-wide v0
.end method

.method public contentType()Lcom/squareup/okhttp/MediaType;
    .locals 2

    .prologue
    .line 74
    iget-object v1, p0, Lcom/squareup/okhttp/Dispatcher$RealResponseBody;->responseHeaders:Lcom/squareup/okhttp/internal/http/ResponseHeaders;

    invoke-virtual {v1}, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->getContentType()Ljava/lang/String;

    move-result-object v0

    .line 75
    .local v0, "contentType":Ljava/lang/String;
    if-eqz v0, :cond_0

    invoke-static {v0}, Lcom/squareup/okhttp/MediaType;->parse(Ljava/lang/String;)Lcom/squareup/okhttp/MediaType;

    move-result-object v1

    :goto_0
    return-object v1

    :cond_0
    const/4 v1, 0x0

    goto :goto_0
.end method

.method public ready()Z
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 70
    const/4 v0, 0x1

    return v0
.end method
