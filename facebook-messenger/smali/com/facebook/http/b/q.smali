.class Lcom/facebook/http/b/q;
.super Lorg/apache/http/impl/client/DefaultHttpClient;
.source "FbHttpClientImpl.java"


# instance fields
.field final synthetic a:Ljava/util/Set;

.field final synthetic b:Lcom/facebook/http/b/o;


# direct methods
.method constructor <init>(Lcom/facebook/http/b/o;Lorg/apache/http/conn/ClientConnectionManager;Lorg/apache/http/params/HttpParams;Ljava/util/Set;)V
    .locals 0

    .prologue
    .line 104
    iput-object p1, p0, Lcom/facebook/http/b/q;->b:Lcom/facebook/http/b/o;

    iput-object p4, p0, Lcom/facebook/http/b/q;->a:Ljava/util/Set;

    invoke-direct {p0, p2, p3}, Lorg/apache/http/impl/client/DefaultHttpClient;-><init>(Lorg/apache/http/conn/ClientConnectionManager;Lorg/apache/http/params/HttpParams;)V

    return-void
.end method


# virtual methods
.method protected createConnectionReuseStrategy()Lorg/apache/http/ConnectionReuseStrategy;
    .locals 1

    .prologue
    .line 145
    new-instance v0, Lcom/facebook/http/b/k;

    invoke-direct {v0}, Lcom/facebook/http/b/k;-><init>()V

    return-object v0
.end method

.method protected createHttpContext()Lorg/apache/http/protocol/HttpContext;
    .locals 3

    .prologue
    .line 127
    new-instance v0, Lorg/apache/http/protocol/BasicHttpContext;

    invoke-direct {v0}, Lorg/apache/http/protocol/BasicHttpContext;-><init>()V

    .line 128
    const-string v1, "http.authscheme-registry"

    invoke-virtual {p0}, Lcom/facebook/http/b/q;->getAuthSchemes()Lorg/apache/http/auth/AuthSchemeRegistry;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lorg/apache/http/protocol/HttpContext;->setAttribute(Ljava/lang/String;Ljava/lang/Object;)V

    .line 131
    const-string v1, "http.cookiespec-registry"

    invoke-virtual {p0}, Lcom/facebook/http/b/q;->getCookieSpecs()Lorg/apache/http/cookie/CookieSpecRegistry;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lorg/apache/http/protocol/HttpContext;->setAttribute(Ljava/lang/String;Ljava/lang/Object;)V

    .line 134
    const-string v1, "http.auth.credentials-provider"

    invoke-virtual {p0}, Lcom/facebook/http/b/q;->getCredentialsProvider()Lorg/apache/http/client/CredentialsProvider;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lorg/apache/http/protocol/HttpContext;->setAttribute(Ljava/lang/String;Ljava/lang/Object;)V

    .line 137
    const-string v1, "http.cookie-store"

    iget-object v2, p0, Lcom/facebook/http/b/q;->b:Lcom/facebook/http/b/o;

    invoke-static {v2}, Lcom/facebook/http/b/o;->a(Lcom/facebook/http/b/o;)Lcom/facebook/http/b/l;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lorg/apache/http/protocol/HttpContext;->setAttribute(Ljava/lang/String;Ljava/lang/Object;)V

    .line 140
    return-object v0
.end method

.method protected createHttpProcessor()Lorg/apache/http/protocol/BasicHttpProcessor;
    .locals 4

    .prologue
    .line 108
    invoke-super {p0}, Lorg/apache/http/impl/client/DefaultHttpClient;->createHttpProcessor()Lorg/apache/http/protocol/BasicHttpProcessor;

    move-result-object v1

    .line 109
    invoke-static {}, Lcom/facebook/http/b/o;->b()Lorg/apache/http/HttpRequestInterceptor;

    move-result-object v0

    invoke-virtual {v1, v0}, Lorg/apache/http/protocol/BasicHttpProcessor;->addRequestInterceptor(Lorg/apache/http/HttpRequestInterceptor;)V

    .line 110
    new-instance v0, Lcom/facebook/http/b/r;

    iget-object v2, p0, Lcom/facebook/http/b/q;->b:Lcom/facebook/http/b/o;

    const/4 v3, 0x0

    invoke-direct {v0, v2, v3}, Lcom/facebook/http/b/r;-><init>(Lcom/facebook/http/b/o;Lcom/facebook/http/b/p;)V

    invoke-virtual {v1, v0}, Lorg/apache/http/protocol/BasicHttpProcessor;->addRequestInterceptor(Lorg/apache/http/HttpRequestInterceptor;)V

    .line 111
    invoke-static {}, Lcom/facebook/http/b/a;->a()Lorg/apache/http/HttpRequestInterceptor;

    move-result-object v0

    invoke-virtual {v1, v0}, Lorg/apache/http/protocol/BasicHttpProcessor;->addRequestInterceptor(Lorg/apache/http/HttpRequestInterceptor;)V

    .line 112
    invoke-static {}, Lcom/facebook/http/b/a;->b()Lorg/apache/http/HttpResponseInterceptor;

    move-result-object v0

    invoke-virtual {v1, v0}, Lorg/apache/http/protocol/BasicHttpProcessor;->addResponseInterceptor(Lorg/apache/http/HttpResponseInterceptor;)V

    .line 114
    iget-object v0, p0, Lcom/facebook/http/b/q;->a:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/http/b/t;

    .line 117
    invoke-interface {v0, v1, v1}, Lcom/facebook/http/b/t;->a(Lorg/apache/http/protocol/HttpRequestInterceptorList;Lorg/apache/http/protocol/HttpResponseInterceptorList;)V

    goto :goto_0

    .line 120
    :cond_0
    return-object v1
.end method
