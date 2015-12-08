.class final Lcom/squareup/okhttp/Job;
.super Ljava/lang/Object;
.source "Job.java"

# interfaces
.implements Ljava/lang/Runnable;
.implements Lcom/squareup/okhttp/internal/http/Policy;


# instance fields
.field private final client:Lcom/squareup/okhttp/OkHttpClient;

.field private final dispatcher:Lcom/squareup/okhttp/Dispatcher;

.field private request:Lcom/squareup/okhttp/Request;

.field private final responseReceiver:Lcom/squareup/okhttp/Response$Receiver;


# direct methods
.method public constructor <init>(Lcom/squareup/okhttp/Dispatcher;Lcom/squareup/okhttp/OkHttpClient;Lcom/squareup/okhttp/Request;Lcom/squareup/okhttp/Response$Receiver;)V
    .locals 0
    .param p1, "dispatcher"    # Lcom/squareup/okhttp/Dispatcher;
    .param p2, "client"    # Lcom/squareup/okhttp/OkHttpClient;
    .param p3, "request"    # Lcom/squareup/okhttp/Request;
    .param p4, "responseReceiver"    # Lcom/squareup/okhttp/Response$Receiver;

    .prologue
    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 49
    iput-object p1, p0, Lcom/squareup/okhttp/Job;->dispatcher:Lcom/squareup/okhttp/Dispatcher;

    .line 50
    iput-object p2, p0, Lcom/squareup/okhttp/Job;->client:Lcom/squareup/okhttp/OkHttpClient;

    .line 51
    iput-object p3, p0, Lcom/squareup/okhttp/Job;->request:Lcom/squareup/okhttp/Request;

    .line 52
    iput-object p4, p0, Lcom/squareup/okhttp/Job;->responseReceiver:Lcom/squareup/okhttp/Response$Receiver;

    .line 53
    return-void
.end method

.method private execute()Lcom/squareup/okhttp/Response;
    .locals 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 108
    const/4 v1, 0x0

    .line 109
    .local v1, "connection":Lcom/squareup/okhttp/Connection;
    const/4 v5, 0x0

    .line 112
    .local v5, "redirectedBy":Lcom/squareup/okhttp/Response;
    :goto_0
    invoke-virtual {p0, v1}, Lcom/squareup/okhttp/Job;->newEngine(Lcom/squareup/okhttp/Connection;)Lcom/squareup/okhttp/internal/http/HttpEngine;

    move-result-object v3

    .line 114
    .local v3, "engine":Lcom/squareup/okhttp/internal/http/HttpEngine;
    iget-object v9, p0, Lcom/squareup/okhttp/Job;->request:Lcom/squareup/okhttp/Request;

    invoke-virtual {v9}, Lcom/squareup/okhttp/Request;->body()Lcom/squareup/okhttp/Request$Body;

    move-result-object v0

    .line 115
    .local v0, "body":Lcom/squareup/okhttp/Request$Body;
    if-eqz v0, :cond_1

    .line 116
    invoke-virtual {v0}, Lcom/squareup/okhttp/Request$Body;->contentType()Lcom/squareup/okhttp/MediaType;

    move-result-object v2

    .line 117
    .local v2, "contentType":Lcom/squareup/okhttp/MediaType;
    if-nez v2, :cond_0

    new-instance v9, Ljava/lang/IllegalStateException;

    const-string v10, "contentType == null"

    invoke-direct {v9, v10}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v9

    .line 118
    :cond_0
    invoke-virtual {v3}, Lcom/squareup/okhttp/internal/http/HttpEngine;->getRequestHeaders()Lcom/squareup/okhttp/internal/http/RequestHeaders;

    move-result-object v9

    invoke-virtual {v9}, Lcom/squareup/okhttp/internal/http/RequestHeaders;->getContentType()Ljava/lang/String;

    move-result-object v9

    if-nez v9, :cond_1

    .line 119
    invoke-virtual {v3}, Lcom/squareup/okhttp/internal/http/HttpEngine;->getRequestHeaders()Lcom/squareup/okhttp/internal/http/RequestHeaders;

    move-result-object v9

    invoke-virtual {v2}, Lcom/squareup/okhttp/MediaType;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Lcom/squareup/okhttp/internal/http/RequestHeaders;->setContentType(Ljava/lang/String;)V

    .line 123
    .end local v2    # "contentType":Lcom/squareup/okhttp/MediaType;
    :cond_1
    invoke-virtual {v3}, Lcom/squareup/okhttp/internal/http/HttpEngine;->sendRequest()V

    .line 125
    if-eqz v0, :cond_2

    .line 126
    invoke-virtual {v3}, Lcom/squareup/okhttp/internal/http/HttpEngine;->getRequestBody()Ljava/io/OutputStream;

    move-result-object v9

    invoke-virtual {v0, v9}, Lcom/squareup/okhttp/Request$Body;->writeTo(Ljava/io/OutputStream;)V

    .line 129
    :cond_2
    invoke-virtual {v3}, Lcom/squareup/okhttp/internal/http/HttpEngine;->readResponse()V

    .line 131
    invoke-virtual {v3}, Lcom/squareup/okhttp/internal/http/HttpEngine;->getResponseCode()I

    move-result v8

    .line 132
    .local v8, "responseCode":I
    new-instance v7, Lcom/squareup/okhttp/Dispatcher$RealResponseBody;

    .line 133
    invoke-virtual {v3}, Lcom/squareup/okhttp/internal/http/HttpEngine;->getResponseHeaders()Lcom/squareup/okhttp/internal/http/ResponseHeaders;

    move-result-object v9

    invoke-virtual {v3}, Lcom/squareup/okhttp/internal/http/HttpEngine;->getResponseBody()Ljava/io/InputStream;

    move-result-object v10

    invoke-direct {v7, v9, v10}, Lcom/squareup/okhttp/Dispatcher$RealResponseBody;-><init>(Lcom/squareup/okhttp/internal/http/ResponseHeaders;Ljava/io/InputStream;)V

    .line 135
    .local v7, "responseBody":Lcom/squareup/okhttp/Dispatcher$RealResponseBody;
    new-instance v9, Lcom/squareup/okhttp/Response$Builder;

    iget-object v10, p0, Lcom/squareup/okhttp/Job;->request:Lcom/squareup/okhttp/Request;

    invoke-direct {v9, v10, v8}, Lcom/squareup/okhttp/Response$Builder;-><init>(Lcom/squareup/okhttp/Request;I)V

    .line 136
    invoke-virtual {v3}, Lcom/squareup/okhttp/internal/http/HttpEngine;->getResponseHeaders()Lcom/squareup/okhttp/internal/http/ResponseHeaders;

    move-result-object v10

    invoke-virtual {v10}, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->getHeaders()Lcom/squareup/okhttp/internal/http/RawHeaders;

    move-result-object v10

    invoke-virtual {v9, v10}, Lcom/squareup/okhttp/Response$Builder;->rawHeaders(Lcom/squareup/okhttp/internal/http/RawHeaders;)Lcom/squareup/okhttp/Response$Builder;

    move-result-object v9

    .line 137
    invoke-virtual {v9, v7}, Lcom/squareup/okhttp/Response$Builder;->body(Lcom/squareup/okhttp/Response$Body;)Lcom/squareup/okhttp/Response$Builder;

    move-result-object v9

    .line 138
    invoke-virtual {v9, v5}, Lcom/squareup/okhttp/Response$Builder;->redirectedBy(Lcom/squareup/okhttp/Response;)Lcom/squareup/okhttp/Response$Builder;

    move-result-object v9

    .line 139
    invoke-virtual {v9}, Lcom/squareup/okhttp/Response$Builder;->build()Lcom/squareup/okhttp/Response;

    move-result-object v6

    .line 141
    .local v6, "response":Lcom/squareup/okhttp/Response;
    invoke-direct {p0, v3, v6}, Lcom/squareup/okhttp/Job;->processResponse(Lcom/squareup/okhttp/internal/http/HttpEngine;Lcom/squareup/okhttp/Response;)Lcom/squareup/okhttp/Request;

    move-result-object v4

    .line 143
    .local v4, "redirect":Lcom/squareup/okhttp/Request;
    if-nez v4, :cond_3

    .line 144
    invoke-virtual {v3}, Lcom/squareup/okhttp/internal/http/HttpEngine;->automaticallyReleaseConnectionToPool()V

    .line 145
    return-object v6

    .line 152
    :cond_3
    iget-object v9, p0, Lcom/squareup/okhttp/Job;->request:Lcom/squareup/okhttp/Request;

    invoke-direct {p0, v9, v4}, Lcom/squareup/okhttp/Job;->sameConnection(Lcom/squareup/okhttp/Request;Lcom/squareup/okhttp/Request;)Z

    move-result v9

    if-eqz v9, :cond_4

    invoke-virtual {v3}, Lcom/squareup/okhttp/internal/http/HttpEngine;->getConnection()Lcom/squareup/okhttp/Connection;

    move-result-object v1

    .line 153
    :goto_1
    move-object v5, v6

    .line 154
    iput-object v4, p0, Lcom/squareup/okhttp/Job;->request:Lcom/squareup/okhttp/Request;

    goto/16 :goto_0

    .line 152
    :cond_4
    const/4 v1, 0x0

    goto :goto_1
.end method

.method private processResponse(Lcom/squareup/okhttp/internal/http/HttpEngine;Lcom/squareup/okhttp/Response;)Lcom/squareup/okhttp/Request;
    .locals 13
    .param p1, "engine"    # Lcom/squareup/okhttp/internal/http/HttpEngine;
    .param p2, "response"    # Lcom/squareup/okhttp/Response;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    const/4 v12, 0x0

    .line 177
    invoke-virtual {p2}, Lcom/squareup/okhttp/Response;->request()Lcom/squareup/okhttp/Request;

    move-result-object v9

    .line 178
    .local v9, "request":Lcom/squareup/okhttp/Request;
    invoke-virtual {p1}, Lcom/squareup/okhttp/internal/http/HttpEngine;->getConnection()Lcom/squareup/okhttp/Connection;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 179
    invoke-virtual {p1}, Lcom/squareup/okhttp/internal/http/HttpEngine;->getConnection()Lcom/squareup/okhttp/Connection;

    move-result-object v0

    invoke-virtual {v0}, Lcom/squareup/okhttp/Connection;->getRoute()Lcom/squareup/okhttp/Route;

    move-result-object v0

    invoke-virtual {v0}, Lcom/squareup/okhttp/Route;->getProxy()Ljava/net/Proxy;

    move-result-object v4

    .line 181
    .local v4, "selectedProxy":Ljava/net/Proxy;
    :goto_0
    invoke-virtual {p2}, Lcom/squareup/okhttp/Response;->code()I

    move-result v10

    .line 183
    .local v10, "responseCode":I
    sparse-switch v10, :sswitch_data_0

    .line 223
    :cond_0
    :goto_1
    return-object v12

    .line 179
    .end local v4    # "selectedProxy":Ljava/net/Proxy;
    .end local v10    # "responseCode":I
    :cond_1
    iget-object v0, p0, Lcom/squareup/okhttp/Job;->client:Lcom/squareup/okhttp/OkHttpClient;

    .line 180
    invoke-virtual {v0}, Lcom/squareup/okhttp/OkHttpClient;->getProxy()Ljava/net/Proxy;

    move-result-object v4

    goto :goto_0

    .line 185
    .restart local v4    # "selectedProxy":Ljava/net/Proxy;
    .restart local v10    # "responseCode":I
    :sswitch_0
    invoke-virtual {v4}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v0

    sget-object v1, Ljava/net/Proxy$Type;->HTTP:Ljava/net/Proxy$Type;

    if-eq v0, v1, :cond_2

    .line 186
    new-instance v0, Ljava/net/ProtocolException;

    const-string v1, "Received HTTP_PROXY_AUTH (407) code while not using proxy"

    invoke-direct {v0, v1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 190
    :cond_2
    :sswitch_1
    invoke-virtual {v9}, Lcom/squareup/okhttp/Request;->rawHeaders()Lcom/squareup/okhttp/internal/http/RawHeaders;

    move-result-object v3

    .line 191
    .local v3, "successorRequestHeaders":Lcom/squareup/okhttp/internal/http/RawHeaders;
    iget-object v0, p0, Lcom/squareup/okhttp/Job;->client:Lcom/squareup/okhttp/OkHttpClient;

    invoke-virtual {v0}, Lcom/squareup/okhttp/OkHttpClient;->getAuthenticator()Lcom/squareup/okhttp/OkAuthenticator;

    move-result-object v0

    .line 192
    invoke-virtual {p2}, Lcom/squareup/okhttp/Response;->code()I

    move-result v1

    invoke-virtual {p2}, Lcom/squareup/okhttp/Response;->rawHeaders()Lcom/squareup/okhttp/internal/http/RawHeaders;

    move-result-object v2

    iget-object v5, p0, Lcom/squareup/okhttp/Job;->request:Lcom/squareup/okhttp/Request;

    .line 193
    invoke-virtual {v5}, Lcom/squareup/okhttp/Request;->url()Ljava/net/URL;

    move-result-object v5

    .line 191
    invoke-static/range {v0 .. v5}, Lcom/squareup/okhttp/internal/http/HttpAuthenticator;->processAuthHeader(Lcom/squareup/okhttp/OkAuthenticator;ILcom/squareup/okhttp/internal/http/RawHeaders;Lcom/squareup/okhttp/internal/http/RawHeaders;Ljava/net/Proxy;Ljava/net/URL;)Z

    move-result v6

    .line 194
    .local v6, "credentialsFound":Z
    if-eqz v6, :cond_3

    .line 195
    invoke-virtual {v9}, Lcom/squareup/okhttp/Request;->newBuilder()Lcom/squareup/okhttp/Request$Builder;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/squareup/okhttp/Request$Builder;->rawHeaders(Lcom/squareup/okhttp/internal/http/RawHeaders;)Lcom/squareup/okhttp/Request$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/squareup/okhttp/Request$Builder;->build()Lcom/squareup/okhttp/Request;

    move-result-object v0

    :goto_2
    move-object v12, v0

    goto :goto_1

    :cond_3
    move-object v0, v12

    goto :goto_2

    .line 203
    .end local v3    # "successorRequestHeaders":Lcom/squareup/okhttp/internal/http/RawHeaders;
    .end local v6    # "credentialsFound":Z
    :sswitch_2
    invoke-virtual {v9}, Lcom/squareup/okhttp/Request;->method()Ljava/lang/String;

    move-result-object v8

    .line 204
    .local v8, "method":Ljava/lang/String;
    const/16 v0, 0x133

    if-ne v10, v0, :cond_4

    const-string v0, "GET"

    invoke-virtual {v8, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    const-string v0, "HEAD"

    invoke-virtual {v8, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 210
    :cond_4
    const-string v0, "Location"

    invoke-virtual {p2, v0}, Lcom/squareup/okhttp/Response;->header(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 211
    .local v7, "location":Ljava/lang/String;
    if-eqz v7, :cond_0

    .line 215
    new-instance v11, Ljava/net/URL;

    invoke-virtual {v9}, Lcom/squareup/okhttp/Request;->url()Ljava/net/URL;

    move-result-object v0

    invoke-direct {v11, v0, v7}, Ljava/net/URL;-><init>(Ljava/net/URL;Ljava/lang/String;)V

    .line 216
    .local v11, "url":Ljava/net/URL;
    invoke-virtual {v11}, Ljava/net/URL;->getProtocol()Ljava/lang/String;

    move-result-object v0

    const-string v1, "https"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    invoke-virtual {v11}, Ljava/net/URL;->getProtocol()Ljava/lang/String;

    move-result-object v0

    const-string v1, "http"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 220
    :cond_5
    iget-object v0, p0, Lcom/squareup/okhttp/Job;->request:Lcom/squareup/okhttp/Request;

    invoke-virtual {v0}, Lcom/squareup/okhttp/Request;->newBuilder()Lcom/squareup/okhttp/Request$Builder;

    move-result-object v0

    invoke-virtual {v0, v11}, Lcom/squareup/okhttp/Request$Builder;->url(Ljava/net/URL;)Lcom/squareup/okhttp/Request$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/squareup/okhttp/Request$Builder;->build()Lcom/squareup/okhttp/Request;

    move-result-object v12

    goto/16 :goto_1

    .line 183
    nop

    :sswitch_data_0
    .sparse-switch
        0x12c -> :sswitch_2
        0x12d -> :sswitch_2
        0x12e -> :sswitch_2
        0x12f -> :sswitch_2
        0x133 -> :sswitch_2
        0x191 -> :sswitch_1
        0x197 -> :sswitch_0
    .end sparse-switch
.end method

.method private sameConnection(Lcom/squareup/okhttp/Request;Lcom/squareup/okhttp/Request;)Z
    .locals 2
    .param p1, "a"    # Lcom/squareup/okhttp/Request;
    .param p2, "b"    # Lcom/squareup/okhttp/Request;

    .prologue
    .line 228
    invoke-virtual {p1}, Lcom/squareup/okhttp/Request;->url()Ljava/net/URL;

    move-result-object v0

    invoke-virtual {v0}, Ljava/net/URL;->getHost()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Lcom/squareup/okhttp/Request;->url()Ljava/net/URL;

    move-result-object v1

    invoke-virtual {v1}, Ljava/net/URL;->getHost()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 229
    invoke-virtual {p1}, Lcom/squareup/okhttp/Request;->url()Ljava/net/URL;

    move-result-object v0

    invoke-static {v0}, Lcom/squareup/okhttp/internal/Util;->getEffectivePort(Ljava/net/URL;)I

    move-result v0

    invoke-virtual {p2}, Lcom/squareup/okhttp/Request;->url()Ljava/net/URL;

    move-result-object v1

    invoke-static {v1}, Lcom/squareup/okhttp/internal/Util;->getEffectivePort(Ljava/net/URL;)I

    move-result v1

    if-ne v0, v1, :cond_0

    .line 230
    invoke-virtual {p1}, Lcom/squareup/okhttp/Request;->url()Ljava/net/URL;

    move-result-object v0

    invoke-virtual {v0}, Ljava/net/URL;->getProtocol()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Lcom/squareup/okhttp/Request;->url()Ljava/net/URL;

    move-result-object v1

    invoke-virtual {v1}, Ljava/net/URL;->getProtocol()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public getChunkLength()I
    .locals 4

    .prologue
    .line 56
    iget-object v0, p0, Lcom/squareup/okhttp/Job;->request:Lcom/squareup/okhttp/Request;

    invoke-virtual {v0}, Lcom/squareup/okhttp/Request;->body()Lcom/squareup/okhttp/Request$Body;

    move-result-object v0

    invoke-virtual {v0}, Lcom/squareup/okhttp/Request$Body;->contentLength()J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    const/16 v0, 0x400

    :goto_0
    return v0

    :cond_0
    const/4 v0, -0x1

    goto :goto_0
.end method

.method public getFixedContentLength()J
    .locals 2

    .prologue
    .line 60
    iget-object v0, p0, Lcom/squareup/okhttp/Job;->request:Lcom/squareup/okhttp/Request;

    invoke-virtual {v0}, Lcom/squareup/okhttp/Request;->body()Lcom/squareup/okhttp/Request$Body;

    move-result-object v0

    invoke-virtual {v0}, Lcom/squareup/okhttp/Request$Body;->contentLength()J

    move-result-wide v0

    return-wide v0
.end method

.method public getHttpConnectionToCache()Ljava/net/HttpURLConnection;
    .locals 1

    .prologue
    .line 68
    const/4 v0, 0x0

    return-object v0
.end method

.method public getIfModifiedSince()J
    .locals 2

    .prologue
    .line 76
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public getURL()Ljava/net/URL;
    .locals 1

    .prologue
    .line 72
    iget-object v0, p0, Lcom/squareup/okhttp/Job;->request:Lcom/squareup/okhttp/Request;

    invoke-virtual {v0}, Lcom/squareup/okhttp/Request;->url()Ljava/net/URL;

    move-result-object v0

    return-object v0
.end method

.method public getUseCaches()Z
    .locals 1

    .prologue
    .line 64
    const/4 v0, 0x0

    return v0
.end method

.method newEngine(Lcom/squareup/okhttp/Connection;)Lcom/squareup/okhttp/internal/http/HttpEngine;
    .locals 8
    .param p1, "connection"    # Lcom/squareup/okhttp/Connection;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    const/4 v6, 0x0

    .line 159
    iget-object v0, p0, Lcom/squareup/okhttp/Job;->request:Lcom/squareup/okhttp/Request;

    invoke-virtual {v0}, Lcom/squareup/okhttp/Request;->url()Ljava/net/URL;

    move-result-object v0

    invoke-virtual {v0}, Ljava/net/URL;->getProtocol()Ljava/lang/String;

    move-result-object v7

    .line 160
    .local v7, "protocol":Ljava/lang/String;
    iget-object v0, p0, Lcom/squareup/okhttp/Job;->request:Lcom/squareup/okhttp/Request;

    invoke-virtual {v0}, Lcom/squareup/okhttp/Request;->rawHeaders()Lcom/squareup/okhttp/internal/http/RawHeaders;

    move-result-object v4

    .line 161
    .local v4, "requestHeaders":Lcom/squareup/okhttp/internal/http/RawHeaders;
    const-string v0, "http"

    invoke-virtual {v7, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 162
    new-instance v0, Lcom/squareup/okhttp/internal/http/HttpEngine;

    iget-object v1, p0, Lcom/squareup/okhttp/Job;->client:Lcom/squareup/okhttp/OkHttpClient;

    iget-object v2, p0, Lcom/squareup/okhttp/Job;->request:Lcom/squareup/okhttp/Request;

    invoke-virtual {v2}, Lcom/squareup/okhttp/Request;->method()Ljava/lang/String;

    move-result-object v3

    move-object v2, p0

    move-object v5, p1

    invoke-direct/range {v0 .. v6}, Lcom/squareup/okhttp/internal/http/HttpEngine;-><init>(Lcom/squareup/okhttp/OkHttpClient;Lcom/squareup/okhttp/internal/http/Policy;Ljava/lang/String;Lcom/squareup/okhttp/internal/http/RawHeaders;Lcom/squareup/okhttp/Connection;Lcom/squareup/okhttp/internal/http/RetryableOutputStream;)V

    .line 164
    :goto_0
    return-object v0

    .line 163
    :cond_0
    const-string v0, "https"

    invoke-virtual {v7, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 164
    new-instance v0, Lcom/squareup/okhttp/internal/http/HttpsEngine;

    iget-object v1, p0, Lcom/squareup/okhttp/Job;->client:Lcom/squareup/okhttp/OkHttpClient;

    iget-object v2, p0, Lcom/squareup/okhttp/Job;->request:Lcom/squareup/okhttp/Request;

    invoke-virtual {v2}, Lcom/squareup/okhttp/Request;->method()Ljava/lang/String;

    move-result-object v3

    move-object v2, p0

    move-object v5, p1

    invoke-direct/range {v0 .. v6}, Lcom/squareup/okhttp/internal/http/HttpsEngine;-><init>(Lcom/squareup/okhttp/OkHttpClient;Lcom/squareup/okhttp/internal/http/Policy;Ljava/lang/String;Lcom/squareup/okhttp/internal/http/RawHeaders;Lcom/squareup/okhttp/Connection;Lcom/squareup/okhttp/internal/http/RetryableOutputStream;)V

    goto :goto_0

    .line 166
    :cond_1
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0
.end method

.method public run()V
    .locals 5

    .prologue
    .line 93
    :try_start_0
    invoke-direct {p0}, Lcom/squareup/okhttp/Job;->execute()Lcom/squareup/okhttp/Response;

    move-result-object v1

    .line 94
    .local v1, "response":Lcom/squareup/okhttp/Response;
    iget-object v2, p0, Lcom/squareup/okhttp/Job;->responseReceiver:Lcom/squareup/okhttp/Response$Receiver;

    invoke-interface {v2, v1}, Lcom/squareup/okhttp/Response$Receiver;->onResponse(Lcom/squareup/okhttp/Response;)Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 103
    iget-object v2, p0, Lcom/squareup/okhttp/Job;->dispatcher:Lcom/squareup/okhttp/Dispatcher;

    invoke-virtual {v2, p0}, Lcom/squareup/okhttp/Dispatcher;->finished(Lcom/squareup/okhttp/Job;)V

    .line 105
    .end local v1    # "response":Lcom/squareup/okhttp/Response;
    :goto_0
    return-void

    .line 95
    :catch_0
    move-exception v0

    .line 96
    .local v0, "e":Ljava/io/IOException;
    :try_start_1
    iget-object v2, p0, Lcom/squareup/okhttp/Job;->responseReceiver:Lcom/squareup/okhttp/Response$Receiver;

    new-instance v3, Lcom/squareup/okhttp/Failure$Builder;

    invoke-direct {v3}, Lcom/squareup/okhttp/Failure$Builder;-><init>()V

    iget-object v4, p0, Lcom/squareup/okhttp/Job;->request:Lcom/squareup/okhttp/Request;

    .line 97
    invoke-virtual {v3, v4}, Lcom/squareup/okhttp/Failure$Builder;->request(Lcom/squareup/okhttp/Request;)Lcom/squareup/okhttp/Failure$Builder;

    move-result-object v3

    .line 98
    invoke-virtual {v3, v0}, Lcom/squareup/okhttp/Failure$Builder;->exception(Ljava/lang/Throwable;)Lcom/squareup/okhttp/Failure$Builder;

    move-result-object v3

    .line 99
    invoke-virtual {v3}, Lcom/squareup/okhttp/Failure$Builder;->build()Lcom/squareup/okhttp/Failure;

    move-result-object v3

    .line 96
    invoke-interface {v2, v3}, Lcom/squareup/okhttp/Response$Receiver;->onFailure(Lcom/squareup/okhttp/Failure;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 103
    iget-object v2, p0, Lcom/squareup/okhttp/Job;->dispatcher:Lcom/squareup/okhttp/Dispatcher;

    invoke-virtual {v2, p0}, Lcom/squareup/okhttp/Dispatcher;->finished(Lcom/squareup/okhttp/Job;)V

    goto :goto_0

    .end local v0    # "e":Ljava/io/IOException;
    :catchall_0
    move-exception v2

    iget-object v3, p0, Lcom/squareup/okhttp/Job;->dispatcher:Lcom/squareup/okhttp/Dispatcher;

    invoke-virtual {v3, p0}, Lcom/squareup/okhttp/Dispatcher;->finished(Lcom/squareup/okhttp/Job;)V

    throw v2
.end method

.method public setSelectedProxy(Ljava/net/Proxy;)V
    .locals 0
    .param p1, "proxy"    # Ljava/net/Proxy;

    .prologue
    .line 85
    return-void
.end method

.method tag()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 88
    iget-object v0, p0, Lcom/squareup/okhttp/Job;->request:Lcom/squareup/okhttp/Request;

    invoke-virtual {v0}, Lcom/squareup/okhttp/Request;->tag()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public usingProxy()Z
    .locals 1

    .prologue
    .line 80
    const/4 v0, 0x0

    return v0
.end method
