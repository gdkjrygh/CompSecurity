.class final Lcom/facebook/http/b/o;
.super Ljava/lang/Object;
.source "FbHttpClientImpl.java"

# interfaces
.implements Lcom/facebook/http/b/m;


# static fields
.field private static final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field

.field private static final b:Lorg/apache/http/HttpRequestInterceptor;


# instance fields
.field private final c:Lorg/apache/http/client/HttpClient;

.field private final d:Lcom/facebook/http/b/l;

.field private final e:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Lcom/facebook/http/b/au;",
            ">;"
        }
    .end annotation
.end field

.field private f:Ljava/lang/RuntimeException;

.field private volatile g:Lcom/facebook/http/b/s;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 70
    const-class v0, Lcom/facebook/http/b/o;

    sput-object v0, Lcom/facebook/http/b/o;->a:Ljava/lang/Class;

    .line 75
    new-instance v0, Lcom/facebook/http/b/p;

    invoke-direct {v0}, Lcom/facebook/http/b/p;-><init>()V

    sput-object v0, Lcom/facebook/http/b/o;->b:Lorg/apache/http/HttpRequestInterceptor;

    return-void
.end method

.method constructor <init>(Lorg/apache/http/conn/ClientConnectionManager;Lorg/apache/http/params/HttpParams;Lcom/facebook/http/b/l;Lorg/apache/http/client/HttpRequestRetryHandler;Ljava/util/Set;Ljava/util/Set;Lcom/facebook/analytics/e/i;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/apache/http/conn/ClientConnectionManager;",
            "Lorg/apache/http/params/HttpParams;",
            "Lcom/facebook/http/b/l;",
            "Lorg/apache/http/client/HttpRequestRetryHandler;",
            "Ljava/util/Set",
            "<",
            "Lcom/facebook/http/b/t;",
            ">;",
            "Ljava/util/Set",
            "<",
            "Lcom/facebook/http/b/au;",
            ">;",
            "Lcom/facebook/analytics/e/i;",
            ")V"
        }
    .end annotation

    .prologue
    .line 99
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 89
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "AndroidHttpClient created and never closed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/facebook/http/b/o;->f:Ljava/lang/RuntimeException;

    .line 101
    iput-object p3, p0, Lcom/facebook/http/b/o;->d:Lcom/facebook/http/b/l;

    .line 102
    iput-object p6, p0, Lcom/facebook/http/b/o;->e:Ljava/util/Set;

    .line 104
    new-instance v0, Lcom/facebook/http/b/q;

    invoke-direct {v0, p0, p1, p2, p5}, Lcom/facebook/http/b/q;-><init>(Lcom/facebook/http/b/o;Lorg/apache/http/conn/ClientConnectionManager;Lorg/apache/http/params/HttpParams;Ljava/util/Set;)V

    .line 151
    invoke-virtual {v0, p4}, Lorg/apache/http/impl/client/DefaultHttpClient;->setHttpRequestRetryHandler(Lorg/apache/http/client/HttpRequestRetryHandler;)V

    .line 152
    iput-object v0, p0, Lcom/facebook/http/b/o;->c:Lorg/apache/http/client/HttpClient;

    .line 153
    return-void
.end method

.method static synthetic a(Lcom/facebook/http/b/o;)Lcom/facebook/http/b/l;
    .locals 1

    .prologue
    .line 68
    iget-object v0, p0, Lcom/facebook/http/b/o;->d:Lcom/facebook/http/b/l;

    return-object v0
.end method

.method static synthetic a(Lorg/apache/http/client/methods/HttpUriRequest;Z)Ljava/lang/String;
    .locals 1

    .prologue
    .line 68
    invoke-static {p0, p1}, Lcom/facebook/http/b/o;->b(Lorg/apache/http/client/methods/HttpUriRequest;Z)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private a(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpHost;
    .locals 4

    .prologue
    .line 438
    const/4 v0, 0x0

    .line 440
    invoke-interface {p1}, Lorg/apache/http/client/methods/HttpUriRequest;->getURI()Ljava/net/URI;

    move-result-object v1

    .line 441
    invoke-virtual {v1}, Ljava/net/URI;->isAbsolute()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 442
    new-instance v0, Lorg/apache/http/HttpHost;

    invoke-virtual {v1}, Ljava/net/URI;->getHost()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Ljava/net/URI;->getPort()I

    move-result v3

    invoke-virtual {v1}, Ljava/net/URI;->getScheme()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v2, v3, v1}, Lorg/apache/http/HttpHost;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 447
    :cond_0
    return-object v0
.end method

.method private a(Ljava/io/IOException;Lorg/apache/http/HttpRequest;Lorg/apache/http/protocol/HttpContext;)V
    .locals 3

    .prologue
    .line 451
    if-nez p1, :cond_0

    const-string v0, "fb_http_retried_exceptions"

    invoke-interface {p3, v0}, Lorg/apache/http/protocol/HttpContext;->getAttribute(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    .line 463
    :goto_0
    return-void

    .line 455
    :cond_0
    iget-object v0, p0, Lcom/facebook/http/b/o;->e:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/http/b/au;

    .line 456
    sget-object v2, Lcom/facebook/http/b/av;->HTTP_CLIENT_EXECUTE:Lcom/facebook/http/b/av;

    invoke-interface {v0, v2, p1, p2, p3}, Lcom/facebook/http/b/au;->a(Lcom/facebook/http/b/av;Ljava/io/IOException;Lorg/apache/http/HttpRequest;Lorg/apache/http/protocol/HttpContext;)V

    goto :goto_1

    .line 462
    :cond_1
    const-string v0, "fb_http_retried_exceptions"

    invoke-interface {p3, v0}, Lorg/apache/http/protocol/HttpContext;->removeAttribute(Ljava/lang/String;)Ljava/lang/Object;

    goto :goto_0
.end method

.method static synthetic b(Lcom/facebook/http/b/o;)Lcom/facebook/http/b/s;
    .locals 1

    .prologue
    .line 68
    iget-object v0, p0, Lcom/facebook/http/b/o;->g:Lcom/facebook/http/b/s;

    return-object v0
.end method

.method private static b(Lorg/apache/http/client/methods/HttpUriRequest;Z)Ljava/lang/String;
    .locals 7

    .prologue
    .line 360
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 362
    const-string v0, "curl "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 364
    invoke-interface {p0}, Lorg/apache/http/client/methods/HttpUriRequest;->getAllHeaders()[Lorg/apache/http/Header;

    move-result-object v1

    array-length v3, v1

    const/4 v0, 0x0

    :goto_0
    if-ge v0, v3, :cond_2

    aget-object v4, v1, v0

    .line 365
    if-nez p1, :cond_1

    invoke-interface {v4}, Lorg/apache/http/Header;->getName()Ljava/lang/String;

    move-result-object v5

    const-string v6, "Authorization"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_0

    invoke-interface {v4}, Lorg/apache/http/Header;->getName()Ljava/lang/String;

    move-result-object v5

    const-string v6, "Cookie"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    .line 364
    :cond_0
    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 370
    :cond_1
    const-string v5, "--header \""

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 371
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 372
    const-string v4, "\" "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 375
    :cond_2
    invoke-interface {p0}, Lorg/apache/http/client/methods/HttpUriRequest;->getURI()Ljava/net/URI;

    move-result-object v1

    .line 380
    instance-of v0, p0, Lorg/apache/http/impl/client/RequestWrapper;

    if-eqz v0, :cond_5

    move-object v0, p0

    .line 381
    check-cast v0, Lorg/apache/http/impl/client/RequestWrapper;

    invoke-virtual {v0}, Lorg/apache/http/impl/client/RequestWrapper;->getOriginal()Lorg/apache/http/HttpRequest;

    move-result-object v0

    .line 382
    instance-of v3, v0, Lorg/apache/http/client/methods/HttpUriRequest;

    if-eqz v3, :cond_5

    .line 383
    check-cast v0, Lorg/apache/http/client/methods/HttpUriRequest;

    invoke-interface {v0}, Lorg/apache/http/client/methods/HttpUriRequest;->getURI()Ljava/net/URI;

    move-result-object v0

    .line 387
    :goto_2
    const-string v1, "\""

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 388
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 389
    const-string v0, "\""

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 391
    instance-of v0, p0, Lorg/apache/http/HttpEntityEnclosingRequest;

    if-eqz v0, :cond_3

    .line 392
    check-cast p0, Lorg/apache/http/HttpEntityEnclosingRequest;

    .line 394
    invoke-interface {p0}, Lorg/apache/http/HttpEntityEnclosingRequest;->getEntity()Lorg/apache/http/HttpEntity;

    move-result-object v0

    .line 395
    if-eqz v0, :cond_3

    invoke-interface {v0}, Lorg/apache/http/HttpEntity;->isRepeatable()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 396
    invoke-interface {v0}, Lorg/apache/http/HttpEntity;->getContentLength()J

    move-result-wide v3

    const-wide/16 v5, 0x400

    cmp-long v1, v3, v5

    if-gez v1, :cond_4

    .line 397
    new-instance v1, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 398
    invoke-interface {v0, v1}, Lorg/apache/http/HttpEntity;->writeTo(Ljava/io/OutputStream;)V

    .line 399
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toString()Ljava/lang/String;

    move-result-object v0

    .line 402
    const-string v1, " --data-ascii \""

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 411
    :cond_3
    :goto_3
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 406
    :cond_4
    const-string v0, " [TOO MUCH DATA TO INCLUDE]"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_3

    :cond_5
    move-object v0, v1

    goto :goto_2
.end method

.method static synthetic b()Lorg/apache/http/HttpRequestInterceptor;
    .locals 1

    .prologue
    .line 68
    sget-object v0, Lcom/facebook/http/b/o;->b:Lorg/apache/http/HttpRequestInterceptor;

    return-object v0
.end method


# virtual methods
.method public a()Lorg/apache/http/client/CookieStore;
    .locals 1

    .prologue
    .line 415
    iget-object v0, p0, Lcom/facebook/http/b/o;->d:Lcom/facebook/http/b/l;

    return-object v0
.end method

.method public execute(Lorg/apache/http/HttpHost;Lorg/apache/http/HttpRequest;Lorg/apache/http/client/ResponseHandler;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lorg/apache/http/HttpHost;",
            "Lorg/apache/http/HttpRequest;",
            "Lorg/apache/http/client/ResponseHandler",
            "<+TT;>;)TT;"
        }
    .end annotation

    .prologue
    .line 249
    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, p3, v0}, Lcom/facebook/http/b/o;->execute(Lorg/apache/http/HttpHost;Lorg/apache/http/HttpRequest;Lorg/apache/http/client/ResponseHandler;Lorg/apache/http/protocol/HttpContext;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public execute(Lorg/apache/http/HttpHost;Lorg/apache/http/HttpRequest;Lorg/apache/http/client/ResponseHandler;Lorg/apache/http/protocol/HttpContext;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lorg/apache/http/HttpHost;",
            "Lorg/apache/http/HttpRequest;",
            "Lorg/apache/http/client/ResponseHandler",
            "<+TT;>;",
            "Lorg/apache/http/protocol/HttpContext;",
            ")TT;"
        }
    .end annotation

    .prologue
    .line 263
    sget-object v0, Lcom/facebook/http/b/o;->a:Ljava/lang/Class;

    const-string v1, "This code path should not be called, an exception occurring on Reading the response will result in reporting the failure multiple times. Use FbHttpRequestProcessor"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->d(Ljava/lang/Class;Ljava/lang/String;)V

    .line 265
    if-nez p4, :cond_0

    .line 266
    new-instance p4, Lorg/apache/http/protocol/BasicHttpContext;

    invoke-direct {p4}, Lorg/apache/http/protocol/BasicHttpContext;-><init>()V

    .line 268
    :cond_0
    const/4 v1, 0x0

    .line 270
    :try_start_0
    iget-object v0, p0, Lcom/facebook/http/b/o;->c:Lorg/apache/http/client/HttpClient;

    invoke-interface {v0, p1, p2, p3, p4}, Lorg/apache/http/client/HttpClient;->execute(Lorg/apache/http/HttpHost;Lorg/apache/http/HttpRequest;Lorg/apache/http/client/ResponseHandler;Lorg/apache/http/protocol/HttpContext;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    move-result-object v0

    .line 275
    invoke-direct {p0, v1, p2, p4}, Lcom/facebook/http/b/o;->a(Ljava/io/IOException;Lorg/apache/http/HttpRequest;Lorg/apache/http/protocol/HttpContext;)V

    return-object v0

    .line 271
    :catch_0
    move-exception v0

    .line 273
    :try_start_1
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 275
    :catchall_0
    move-exception v1

    move-object v2, v1

    move-object v1, v0

    move-object v0, v2

    :goto_0
    invoke-direct {p0, v1, p2, p4}, Lcom/facebook/http/b/o;->a(Ljava/io/IOException;Lorg/apache/http/HttpRequest;Lorg/apache/http/protocol/HttpContext;)V

    throw v0

    :catchall_1
    move-exception v0

    goto :goto_0
.end method

.method public execute(Lorg/apache/http/client/methods/HttpUriRequest;Lorg/apache/http/client/ResponseHandler;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lorg/apache/http/client/methods/HttpUriRequest;",
            "Lorg/apache/http/client/ResponseHandler",
            "<+TT;>;)TT;"
        }
    .end annotation

    .prologue
    .line 225
    invoke-direct {p0, p1}, Lcom/facebook/http/b/o;->a(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpHost;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, p2, v1}, Lcom/facebook/http/b/o;->execute(Lorg/apache/http/HttpHost;Lorg/apache/http/HttpRequest;Lorg/apache/http/client/ResponseHandler;Lorg/apache/http/protocol/HttpContext;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public execute(Lorg/apache/http/client/methods/HttpUriRequest;Lorg/apache/http/client/ResponseHandler;Lorg/apache/http/protocol/HttpContext;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lorg/apache/http/client/methods/HttpUriRequest;",
            "Lorg/apache/http/client/ResponseHandler",
            "<+TT;>;",
            "Lorg/apache/http/protocol/HttpContext;",
            ")TT;"
        }
    .end annotation

    .prologue
    .line 238
    invoke-direct {p0, p1}, Lcom/facebook/http/b/o;->a(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpHost;

    move-result-object v0

    invoke-virtual {p0, v0, p1, p2, p3}, Lcom/facebook/http/b/o;->execute(Lorg/apache/http/HttpHost;Lorg/apache/http/HttpRequest;Lorg/apache/http/client/ResponseHandler;Lorg/apache/http/protocol/HttpContext;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public execute(Lorg/apache/http/HttpHost;Lorg/apache/http/HttpRequest;)Lorg/apache/http/HttpResponse;
    .locals 1

    .prologue
    .line 197
    const/4 v0, 0x0

    check-cast v0, Lorg/apache/http/protocol/HttpContext;

    invoke-virtual {p0, p1, p2, v0}, Lcom/facebook/http/b/o;->execute(Lorg/apache/http/HttpHost;Lorg/apache/http/HttpRequest;Lorg/apache/http/protocol/HttpContext;)Lorg/apache/http/HttpResponse;

    move-result-object v0

    return-object v0
.end method

.method public execute(Lorg/apache/http/HttpHost;Lorg/apache/http/HttpRequest;Lorg/apache/http/protocol/HttpContext;)Lorg/apache/http/HttpResponse;
    .locals 3

    .prologue
    .line 203
    if-nez p3, :cond_0

    .line 204
    new-instance p3, Lorg/apache/http/protocol/BasicHttpContext;

    invoke-direct {p3}, Lorg/apache/http/protocol/BasicHttpContext;-><init>()V

    .line 206
    :cond_0
    const/4 v1, 0x0

    .line 208
    :try_start_0
    iget-object v0, p0, Lcom/facebook/http/b/o;->c:Lorg/apache/http/client/HttpClient;

    invoke-interface {v0, p1, p2, p3}, Lorg/apache/http/client/HttpClient;->execute(Lorg/apache/http/HttpHost;Lorg/apache/http/HttpRequest;Lorg/apache/http/protocol/HttpContext;)Lorg/apache/http/HttpResponse;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    move-result-object v0

    .line 213
    invoke-direct {p0, v1, p2, p3}, Lcom/facebook/http/b/o;->a(Ljava/io/IOException;Lorg/apache/http/HttpRequest;Lorg/apache/http/protocol/HttpContext;)V

    return-object v0

    .line 209
    :catch_0
    move-exception v0

    .line 211
    :try_start_1
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 213
    :catchall_0
    move-exception v1

    move-object v2, v1

    move-object v1, v0

    move-object v0, v2

    :goto_0
    invoke-direct {p0, v1, p2, p3}, Lcom/facebook/http/b/o;->a(Ljava/io/IOException;Lorg/apache/http/HttpRequest;Lorg/apache/http/protocol/HttpContext;)V

    throw v0

    :catchall_1
    move-exception v0

    goto :goto_0
.end method

.method public execute(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;
    .locals 2

    .prologue
    .line 185
    invoke-direct {p0, p1}, Lcom/facebook/http/b/o;->a(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpHost;

    move-result-object v1

    const/4 v0, 0x0

    check-cast v0, Lorg/apache/http/protocol/HttpContext;

    invoke-virtual {p0, v1, p1, v0}, Lcom/facebook/http/b/o;->execute(Lorg/apache/http/HttpHost;Lorg/apache/http/HttpRequest;Lorg/apache/http/protocol/HttpContext;)Lorg/apache/http/HttpResponse;

    move-result-object v0

    return-object v0
.end method

.method public execute(Lorg/apache/http/client/methods/HttpUriRequest;Lorg/apache/http/protocol/HttpContext;)Lorg/apache/http/HttpResponse;
    .locals 1

    .prologue
    .line 191
    invoke-direct {p0, p1}, Lcom/facebook/http/b/o;->a(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpHost;

    move-result-object v0

    invoke-virtual {p0, v0, p1, p2}, Lcom/facebook/http/b/o;->execute(Lorg/apache/http/HttpHost;Lorg/apache/http/HttpRequest;Lorg/apache/http/protocol/HttpContext;)Lorg/apache/http/HttpResponse;

    move-result-object v0

    return-object v0
.end method

.method protected finalize()V
    .locals 3

    .prologue
    .line 157
    invoke-super {p0}, Ljava/lang/Object;->finalize()V

    .line 158
    iget-object v0, p0, Lcom/facebook/http/b/o;->f:Ljava/lang/RuntimeException;

    if-eqz v0, :cond_0

    .line 159
    sget-object v0, Lcom/facebook/http/b/o;->a:Ljava/lang/Class;

    const-string v1, "Leak found"

    iget-object v2, p0, Lcom/facebook/http/b/o;->f:Ljava/lang/RuntimeException;

    invoke-static {v0, v1, v2}, Lcom/facebook/debug/log/b;->e(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 160
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/http/b/o;->f:Ljava/lang/RuntimeException;

    .line 162
    :cond_0
    return-void
.end method

.method public getConnectionManager()Lorg/apache/http/conn/ClientConnectionManager;
    .locals 1

    .prologue
    .line 180
    iget-object v0, p0, Lcom/facebook/http/b/o;->c:Lorg/apache/http/client/HttpClient;

    invoke-interface {v0}, Lorg/apache/http/client/HttpClient;->getConnectionManager()Lorg/apache/http/conn/ClientConnectionManager;

    move-result-object v0

    return-object v0
.end method

.method public getParams()Lorg/apache/http/params/HttpParams;
    .locals 1

    .prologue
    .line 176
    iget-object v0, p0, Lcom/facebook/http/b/o;->c:Lorg/apache/http/client/HttpClient;

    invoke-interface {v0}, Lorg/apache/http/client/HttpClient;->getParams()Lorg/apache/http/params/HttpParams;

    move-result-object v0

    return-object v0
.end method
