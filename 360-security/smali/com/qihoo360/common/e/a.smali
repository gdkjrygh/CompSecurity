.class public Lcom/qihoo360/common/e/a;
.super Ljava/lang/Object;
.source "360Security"


# direct methods
.method public static a(Lorg/apache/http/client/HttpClient;Lorg/apache/http/client/methods/HttpPost;Ljava/lang/String;[B[I)Ljava/io/InputStream;
    .locals 1

    .prologue
    .line 131
    new-instance v0, Lorg/apache/http/entity/ByteArrayEntity;

    invoke-direct {v0, p3}, Lorg/apache/http/entity/ByteArrayEntity;-><init>([B)V

    .line 132
    invoke-virtual {v0, p2}, Lorg/apache/http/entity/ByteArrayEntity;->setContentType(Ljava/lang/String;)V

    .line 133
    invoke-virtual {p1, v0}, Lorg/apache/http/client/methods/HttpPost;->setEntity(Lorg/apache/http/HttpEntity;)V

    .line 134
    invoke-static {p0, p1, p4}, Lcom/qihoo360/common/e/a;->a(Lorg/apache/http/client/HttpClient;Lorg/apache/http/client/methods/HttpUriRequest;[I)Ljava/io/InputStream;

    move-result-object v0

    return-object v0
.end method

.method public static a(Lorg/apache/http/client/HttpClient;Lorg/apache/http/client/methods/HttpPost;Lorg/apache/http/entity/mime/f;[I)Ljava/io/InputStream;
    .locals 1

    .prologue
    .line 143
    invoke-virtual {p1, p2}, Lorg/apache/http/client/methods/HttpPost;->setEntity(Lorg/apache/http/HttpEntity;)V

    .line 144
    invoke-static {p0, p1, p3}, Lcom/qihoo360/common/e/a;->a(Lorg/apache/http/client/HttpClient;Lorg/apache/http/client/methods/HttpUriRequest;[I)Ljava/io/InputStream;

    move-result-object v0

    return-object v0
.end method

.method private static a(Lorg/apache/http/client/HttpClient;Lorg/apache/http/client/methods/HttpUriRequest;[I)Ljava/io/InputStream;
    .locals 6

    .prologue
    const/4 v0, -0x2

    const/16 v2, -0x63

    const/4 v4, 0x0

    const/4 v1, 0x0

    .line 193
    .line 196
    :try_start_0
    invoke-interface {p0, p1}, Lorg/apache/http/client/HttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;
    :try_end_0
    .catch Ljava/net/UnknownHostException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lorg/apache/http/conn/ConnectTimeoutException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/net/SocketTimeoutException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Lorg/apache/http/conn/HttpHostConnectException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_5
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_6

    move-result-object v0

    move-object v3, v0

    move v0, v4

    .line 240
    :goto_0
    if-eqz v0, :cond_1

    .line 241
    if-eqz p2, :cond_0

    .line 242
    aput v0, p2, v4

    .line 300
    :cond_0
    :goto_1
    return-object v1

    .line 197
    :catch_0
    move-exception v0

    .line 202
    const/4 v0, -0x1

    move-object v3, v1

    goto :goto_0

    .line 203
    :catch_1
    move-exception v3

    move-object v3, v1

    .line 208
    goto :goto_0

    .line 209
    :catch_2
    move-exception v3

    move-object v3, v1

    .line 214
    goto :goto_0

    .line 215
    :catch_3
    move-exception v0

    .line 220
    const/4 v0, -0x3

    move-object v3, v1

    goto :goto_0

    .line 221
    :catch_4
    move-exception v0

    .line 226
    const/4 v0, -0x4

    move-object v3, v1

    goto :goto_0

    .line 227
    :catch_5
    move-exception v0

    .line 232
    const/4 v0, -0x5

    move-object v3, v1

    goto :goto_0

    .line 233
    :catch_6
    move-exception v0

    move-object v3, v1

    move v0, v2

    .line 238
    goto :goto_0

    .line 247
    :cond_1
    if-eqz v3, :cond_4

    .line 248
    invoke-interface {v3}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;

    move-result-object v5

    .line 249
    if-eqz v5, :cond_4

    .line 256
    invoke-interface {v5}, Lorg/apache/http/StatusLine;->getStatusCode()I

    move-result v0

    .line 257
    const/16 v5, 0xc8

    if-lt v0, v5, :cond_6

    const/16 v5, 0x12c

    if-ge v0, v5, :cond_6

    .line 258
    invoke-interface {v3}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;

    move-result-object v3

    .line 259
    invoke-interface {v3}, Lorg/apache/http/HttpEntity;->getContentEncoding()Lorg/apache/http/Header;

    move-result-object v0

    .line 260
    if-eqz v0, :cond_2

    invoke-interface {v0}, Lorg/apache/http/Header;->getValue()Ljava/lang/String;

    move-result-object v0

    .line 262
    :goto_2
    :try_start_1
    const-string/jumbo v5, "gzip"

    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 266
    new-instance v0, Ljava/util/zip/GZIPInputStream;

    invoke-interface {v3}, Lorg/apache/http/HttpEntity;->getContent()Ljava/io/InputStream;

    move-result-object v3

    invoke-direct {v0, v3}, Ljava/util/zip/GZIPInputStream;-><init>(Ljava/io/InputStream;)V

    move-object v1, v0

    goto :goto_1

    :cond_2
    move-object v0, v1

    .line 260
    goto :goto_2

    .line 268
    :cond_3
    invoke-interface {v3}, Lorg/apache/http/HttpEntity;->getContent()Ljava/io/InputStream;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_7

    move-result-object v1

    goto :goto_1

    .line 270
    :catch_7
    move-exception v0

    .line 274
    const/16 v0, -0xb

    .line 293
    :cond_4
    :goto_3
    if-nez v0, :cond_5

    move v0, v2

    .line 296
    :cond_5
    if-eqz p2, :cond_0

    .line 297
    aput v0, p2, v4

    goto :goto_1

    .line 280
    :cond_6
    const/4 v0, -0x8

    goto :goto_3
.end method

.method public static a(Lorg/apache/http/HttpHost;II)Lorg/apache/http/client/HttpClient;
    .locals 6

    .prologue
    .line 98
    .line 100
    invoke-static {}, Lcom/qihoo360/common/e/d;->a()Ljava/lang/String;

    move-result-object v0

    .line 105
    new-instance v1, Lorg/apache/http/params/BasicHttpParams;

    invoke-direct {v1}, Lorg/apache/http/params/BasicHttpParams;-><init>()V

    .line 106
    sget-object v2, Lorg/apache/http/HttpVersion;->HTTP_1_1:Lorg/apache/http/HttpVersion;

    invoke-static {v1, v2}, Lorg/apache/http/params/HttpProtocolParams;->setVersion(Lorg/apache/http/params/HttpParams;Lorg/apache/http/ProtocolVersion;)V

    .line 107
    invoke-static {v1, v0}, Lorg/apache/http/params/HttpProtocolParams;->setUserAgent(Lorg/apache/http/params/HttpParams;Ljava/lang/String;)V

    .line 109
    invoke-static {v1, p1}, Lorg/apache/http/params/HttpConnectionParams;->setConnectionTimeout(Lorg/apache/http/params/HttpParams;I)V

    .line 111
    invoke-static {v1, p2}, Lorg/apache/http/params/HttpConnectionParams;->setSoTimeout(Lorg/apache/http/params/HttpParams;I)V

    .line 114
    const/4 v0, 0x1

    invoke-static {v1, v0}, Lorg/apache/http/params/HttpConnectionParams;->setStaleCheckingEnabled(Lorg/apache/http/params/HttpParams;Z)V

    .line 115
    const/16 v0, 0x2000

    invoke-static {v1, v0}, Lorg/apache/http/params/HttpConnectionParams;->setSocketBufferSize(Lorg/apache/http/params/HttpParams;I)V

    .line 117
    invoke-static {v1, p0}, Lorg/apache/http/conn/params/ConnRouteParams;->setDefaultProxy(Lorg/apache/http/params/HttpParams;Lorg/apache/http/HttpHost;)V

    .line 119
    new-instance v0, Lorg/apache/http/conn/scheme/SchemeRegistry;

    invoke-direct {v0}, Lorg/apache/http/conn/scheme/SchemeRegistry;-><init>()V

    .line 120
    new-instance v2, Lorg/apache/http/conn/scheme/Scheme;

    const-string/jumbo v3, "http"

    invoke-static {}, Lorg/apache/http/conn/scheme/PlainSocketFactory;->getSocketFactory()Lorg/apache/http/conn/scheme/PlainSocketFactory;

    move-result-object v4

    const/16 v5, 0x50

    invoke-direct {v2, v3, v4, v5}, Lorg/apache/http/conn/scheme/Scheme;-><init>(Ljava/lang/String;Lorg/apache/http/conn/scheme/SocketFactory;I)V

    invoke-virtual {v0, v2}, Lorg/apache/http/conn/scheme/SchemeRegistry;->register(Lorg/apache/http/conn/scheme/Scheme;)Lorg/apache/http/conn/scheme/Scheme;

    .line 122
    new-instance v2, Lorg/apache/http/impl/client/DefaultHttpClient;

    new-instance v3, Lorg/apache/http/impl/conn/tsccm/ThreadSafeClientConnManager;

    invoke-direct {v3, v1, v0}, Lorg/apache/http/impl/conn/tsccm/ThreadSafeClientConnManager;-><init>(Lorg/apache/http/params/HttpParams;Lorg/apache/http/conn/scheme/SchemeRegistry;)V

    invoke-direct {v2, v3, v1}, Lorg/apache/http/impl/client/DefaultHttpClient;-><init>(Lorg/apache/http/conn/ClientConnectionManager;Lorg/apache/http/params/HttpParams;)V

    return-object v2
.end method
