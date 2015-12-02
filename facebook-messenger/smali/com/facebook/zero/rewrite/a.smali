.class public Lcom/facebook/zero/rewrite/a;
.super Ljava/lang/Object;
.source "ZeroAwareFbHttpClient.java"

# interfaces
.implements Lcom/facebook/http/b/m;


# instance fields
.field private final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field

.field private final b:Lcom/facebook/http/b/m;

.field private final c:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Lcom/facebook/zero/rewrite/f;


# direct methods
.method public constructor <init>(Lcom/facebook/http/b/m;Ljavax/inject/a;Lcom/facebook/zero/rewrite/f;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/http/b/m;",
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;",
            "Lcom/facebook/zero/rewrite/f;",
            ")V"
        }
    .end annotation

    .prologue
    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    const-class v0, Lcom/facebook/zero/rewrite/a;

    iput-object v0, p0, Lcom/facebook/zero/rewrite/a;->a:Ljava/lang/Class;

    .line 43
    iput-object p1, p0, Lcom/facebook/zero/rewrite/a;->b:Lcom/facebook/http/b/m;

    .line 44
    iput-object p2, p0, Lcom/facebook/zero/rewrite/a;->c:Ljavax/inject/a;

    .line 45
    iput-object p3, p0, Lcom/facebook/zero/rewrite/a;->d:Lcom/facebook/zero/rewrite/f;

    .line 46
    return-void
.end method

.method private a(Lorg/apache/http/HttpHost;)Lorg/apache/http/HttpHost;
    .locals 4

    .prologue
    .line 186
    new-instance v0, Landroid/net/Uri$Builder;

    invoke-direct {v0}, Landroid/net/Uri$Builder;-><init>()V

    invoke-virtual {p1}, Lorg/apache/http/HttpHost;->getHostName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/net/Uri$Builder;->authority(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v0

    invoke-virtual {p1}, Lorg/apache/http/HttpHost;->getSchemeName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/net/Uri$Builder;->scheme(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri$Builder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 191
    iget-object v1, p0, Lcom/facebook/zero/rewrite/a;->d:Lcom/facebook/zero/rewrite/f;

    invoke-virtual {v1, v0}, Lcom/facebook/zero/rewrite/f;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 192
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    .line 194
    new-instance v1, Lorg/apache/http/HttpHost;

    invoke-virtual {v0}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lorg/apache/http/HttpHost;->getPort()I

    move-result v3

    invoke-virtual {v0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v2, v3, v0}, Lorg/apache/http/HttpHost;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    return-object v1
.end method

.method private a(Lorg/apache/http/HttpRequest;)Lorg/apache/http/HttpRequest;
    .locals 4

    .prologue
    .line 172
    :try_start_0
    instance-of v1, p1, Lorg/apache/http/HttpEntityEnclosingRequest;

    if-eqz v1, :cond_0

    .line 173
    new-instance v2, Lorg/apache/http/impl/client/EntityEnclosingRequestWrapper;

    move-object v0, p1

    check-cast v0, Lorg/apache/http/HttpEntityEnclosingRequest;

    move-object v1, v0

    invoke-direct {v2, v1}, Lorg/apache/http/impl/client/EntityEnclosingRequestWrapper;-><init>(Lorg/apache/http/HttpEntityEnclosingRequest;)V

    move-object v1, v2

    .line 178
    :goto_0
    iget-object v2, p0, Lcom/facebook/zero/rewrite/a;->d:Lcom/facebook/zero/rewrite/f;

    invoke-interface {p1}, Lorg/apache/http/HttpRequest;->getRequestLine()Lorg/apache/http/RequestLine;

    move-result-object v3

    invoke-interface {v3}, Lorg/apache/http/RequestLine;->getUri()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/facebook/zero/rewrite/f;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/net/URI;->create(Ljava/lang/String;)Ljava/net/URI;

    move-result-object v2

    invoke-virtual {v1, v2}, Lorg/apache/http/impl/client/RequestWrapper;->setURI(Ljava/net/URI;)V

    move-object p1, v1

    .line 181
    :goto_1
    return-object p1

    .line 175
    :cond_0
    new-instance v1, Lorg/apache/http/impl/client/RequestWrapper;

    invoke-direct {v1, p1}, Lorg/apache/http/impl/client/RequestWrapper;-><init>(Lorg/apache/http/HttpRequest;)V
    :try_end_0
    .catch Lorg/apache/http/ProtocolException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 180
    :catch_0
    move-exception v1

    goto :goto_1
.end method

.method private a(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/client/methods/HttpUriRequest;
    .locals 4

    .prologue
    .line 156
    :try_start_0
    instance-of v1, p1, Lorg/apache/http/HttpEntityEnclosingRequest;

    if-eqz v1, :cond_0

    .line 157
    new-instance v2, Lorg/apache/http/impl/client/EntityEnclosingRequestWrapper;

    move-object v0, p1

    check-cast v0, Lorg/apache/http/HttpEntityEnclosingRequest;

    move-object v1, v0

    invoke-direct {v2, v1}, Lorg/apache/http/impl/client/EntityEnclosingRequestWrapper;-><init>(Lorg/apache/http/HttpEntityEnclosingRequest;)V

    move-object v1, v2

    .line 162
    :goto_0
    iget-object v2, p0, Lcom/facebook/zero/rewrite/a;->d:Lcom/facebook/zero/rewrite/f;

    invoke-interface {p1}, Lorg/apache/http/client/methods/HttpUriRequest;->getURI()Ljava/net/URI;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/facebook/zero/rewrite/f;->a(Ljava/net/URI;)Ljava/net/URI;

    move-result-object v2

    invoke-virtual {v1, v2}, Lorg/apache/http/impl/client/RequestWrapper;->setURI(Ljava/net/URI;)V

    move-object p1, v1

    .line 165
    :goto_1
    return-object p1

    .line 159
    :cond_0
    new-instance v1, Lorg/apache/http/impl/client/RequestWrapper;

    invoke-direct {v1, p1}, Lorg/apache/http/impl/client/RequestWrapper;-><init>(Lorg/apache/http/HttpRequest;)V
    :try_end_0
    .catch Lorg/apache/http/ProtocolException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 164
    :catch_0
    move-exception v1

    goto :goto_1
.end method


# virtual methods
.method public a()Lorg/apache/http/client/CookieStore;
    .locals 1

    .prologue
    .line 50
    iget-object v0, p0, Lcom/facebook/zero/rewrite/a;->b:Lcom/facebook/http/b/m;

    invoke-interface {v0}, Lcom/facebook/http/b/m;->a()Lorg/apache/http/client/CookieStore;

    move-result-object v0

    return-object v0
.end method

.method public execute(Lorg/apache/http/HttpHost;Lorg/apache/http/HttpRequest;Lorg/apache/http/client/ResponseHandler;)Ljava/lang/Object;
    .locals 3
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
    .line 132
    iget-object v0, p0, Lcom/facebook/zero/rewrite/a;->c:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 133
    iget-object v0, p0, Lcom/facebook/zero/rewrite/a;->b:Lcom/facebook/http/b/m;

    invoke-direct {p0, p1}, Lcom/facebook/zero/rewrite/a;->a(Lorg/apache/http/HttpHost;)Lorg/apache/http/HttpHost;

    move-result-object v1

    invoke-direct {p0, p2}, Lcom/facebook/zero/rewrite/a;->a(Lorg/apache/http/HttpRequest;)Lorg/apache/http/HttpRequest;

    move-result-object v2

    invoke-interface {v0, v1, v2, p3}, Lcom/facebook/http/b/m;->execute(Lorg/apache/http/HttpHost;Lorg/apache/http/HttpRequest;Lorg/apache/http/client/ResponseHandler;)Ljava/lang/Object;

    move-result-object v0

    .line 135
    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/facebook/zero/rewrite/a;->b:Lcom/facebook/http/b/m;

    invoke-interface {v0, p1, p2, p3}, Lcom/facebook/http/b/m;->execute(Lorg/apache/http/HttpHost;Lorg/apache/http/HttpRequest;Lorg/apache/http/client/ResponseHandler;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_0
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
    .line 146
    iget-object v0, p0, Lcom/facebook/zero/rewrite/a;->c:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 147
    iget-object v0, p0, Lcom/facebook/zero/rewrite/a;->b:Lcom/facebook/http/b/m;

    invoke-direct {p0, p1}, Lcom/facebook/zero/rewrite/a;->a(Lorg/apache/http/HttpHost;)Lorg/apache/http/HttpHost;

    move-result-object v1

    invoke-direct {p0, p2}, Lcom/facebook/zero/rewrite/a;->a(Lorg/apache/http/HttpRequest;)Lorg/apache/http/HttpRequest;

    move-result-object v2

    invoke-interface {v0, v1, v2, p3, p4}, Lcom/facebook/http/b/m;->execute(Lorg/apache/http/HttpHost;Lorg/apache/http/HttpRequest;Lorg/apache/http/client/ResponseHandler;Lorg/apache/http/protocol/HttpContext;)Ljava/lang/Object;

    move-result-object v0

    .line 149
    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/facebook/zero/rewrite/a;->b:Lcom/facebook/http/b/m;

    invoke-interface {v0, p1, p2, p3, p4}, Lcom/facebook/http/b/m;->execute(Lorg/apache/http/HttpHost;Lorg/apache/http/HttpRequest;Lorg/apache/http/client/ResponseHandler;Lorg/apache/http/protocol/HttpContext;)Ljava/lang/Object;

    move-result-object v0

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
    .line 106
    iget-object v0, p0, Lcom/facebook/zero/rewrite/a;->c:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 107
    iget-object v0, p0, Lcom/facebook/zero/rewrite/a;->b:Lcom/facebook/http/b/m;

    invoke-direct {p0, p1}, Lcom/facebook/zero/rewrite/a;->a(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/client/methods/HttpUriRequest;

    move-result-object v1

    invoke-interface {v0, v1, p2}, Lcom/facebook/http/b/m;->execute(Lorg/apache/http/client/methods/HttpUriRequest;Lorg/apache/http/client/ResponseHandler;)Ljava/lang/Object;

    move-result-object v0

    .line 109
    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/facebook/zero/rewrite/a;->b:Lcom/facebook/http/b/m;

    invoke-interface {v0, p1, p2}, Lcom/facebook/http/b/m;->execute(Lorg/apache/http/client/methods/HttpUriRequest;Lorg/apache/http/client/ResponseHandler;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_0
.end method

.method public execute(Lorg/apache/http/client/methods/HttpUriRequest;Lorg/apache/http/client/ResponseHandler;Lorg/apache/http/protocol/HttpContext;)Ljava/lang/Object;
    .locals 2
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
    .line 119
    iget-object v0, p0, Lcom/facebook/zero/rewrite/a;->c:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 120
    iget-object v0, p0, Lcom/facebook/zero/rewrite/a;->b:Lcom/facebook/http/b/m;

    invoke-direct {p0, p1}, Lcom/facebook/zero/rewrite/a;->a(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/client/methods/HttpUriRequest;

    move-result-object v1

    invoke-interface {v0, v1, p2, p3}, Lcom/facebook/http/b/m;->execute(Lorg/apache/http/client/methods/HttpUriRequest;Lorg/apache/http/client/ResponseHandler;Lorg/apache/http/protocol/HttpContext;)Ljava/lang/Object;

    move-result-object v0

    .line 122
    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/facebook/zero/rewrite/a;->b:Lcom/facebook/http/b/m;

    invoke-interface {v0, p1, p2, p3}, Lcom/facebook/http/b/m;->execute(Lorg/apache/http/client/methods/HttpUriRequest;Lorg/apache/http/client/ResponseHandler;Lorg/apache/http/protocol/HttpContext;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_0
.end method

.method public execute(Lorg/apache/http/HttpHost;Lorg/apache/http/HttpRequest;)Lorg/apache/http/HttpResponse;
    .locals 3

    .prologue
    .line 86
    iget-object v0, p0, Lcom/facebook/zero/rewrite/a;->c:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 87
    iget-object v0, p0, Lcom/facebook/zero/rewrite/a;->b:Lcom/facebook/http/b/m;

    invoke-direct {p0, p1}, Lcom/facebook/zero/rewrite/a;->a(Lorg/apache/http/HttpHost;)Lorg/apache/http/HttpHost;

    move-result-object v1

    invoke-direct {p0, p2}, Lcom/facebook/zero/rewrite/a;->a(Lorg/apache/http/HttpRequest;)Lorg/apache/http/HttpRequest;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/facebook/http/b/m;->execute(Lorg/apache/http/HttpHost;Lorg/apache/http/HttpRequest;)Lorg/apache/http/HttpResponse;

    move-result-object v0

    .line 89
    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/facebook/zero/rewrite/a;->b:Lcom/facebook/http/b/m;

    invoke-interface {v0, p1, p2}, Lcom/facebook/http/b/m;->execute(Lorg/apache/http/HttpHost;Lorg/apache/http/HttpRequest;)Lorg/apache/http/HttpResponse;

    move-result-object v0

    goto :goto_0
.end method

.method public execute(Lorg/apache/http/HttpHost;Lorg/apache/http/HttpRequest;Lorg/apache/http/protocol/HttpContext;)Lorg/apache/http/HttpResponse;
    .locals 3

    .prologue
    .line 96
    iget-object v0, p0, Lcom/facebook/zero/rewrite/a;->c:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 97
    iget-object v0, p0, Lcom/facebook/zero/rewrite/a;->b:Lcom/facebook/http/b/m;

    invoke-direct {p0, p1}, Lcom/facebook/zero/rewrite/a;->a(Lorg/apache/http/HttpHost;)Lorg/apache/http/HttpHost;

    move-result-object v1

    invoke-direct {p0, p2}, Lcom/facebook/zero/rewrite/a;->a(Lorg/apache/http/HttpRequest;)Lorg/apache/http/HttpRequest;

    move-result-object v2

    invoke-interface {v0, v1, v2, p3}, Lcom/facebook/http/b/m;->execute(Lorg/apache/http/HttpHost;Lorg/apache/http/HttpRequest;Lorg/apache/http/protocol/HttpContext;)Lorg/apache/http/HttpResponse;

    move-result-object v0

    .line 99
    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/facebook/zero/rewrite/a;->b:Lcom/facebook/http/b/m;

    invoke-interface {v0, p1, p2, p3}, Lcom/facebook/http/b/m;->execute(Lorg/apache/http/HttpHost;Lorg/apache/http/HttpRequest;Lorg/apache/http/protocol/HttpContext;)Lorg/apache/http/HttpResponse;

    move-result-object v0

    goto :goto_0
.end method

.method public execute(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;
    .locals 2

    .prologue
    .line 66
    iget-object v0, p0, Lcom/facebook/zero/rewrite/a;->c:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 67
    iget-object v0, p0, Lcom/facebook/zero/rewrite/a;->b:Lcom/facebook/http/b/m;

    invoke-direct {p0, p1}, Lcom/facebook/zero/rewrite/a;->a(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/client/methods/HttpUriRequest;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/http/b/m;->execute(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;

    move-result-object v0

    .line 69
    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/facebook/zero/rewrite/a;->b:Lcom/facebook/http/b/m;

    invoke-interface {v0, p1}, Lcom/facebook/http/b/m;->execute(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;

    move-result-object v0

    goto :goto_0
.end method

.method public execute(Lorg/apache/http/client/methods/HttpUriRequest;Lorg/apache/http/protocol/HttpContext;)Lorg/apache/http/HttpResponse;
    .locals 2

    .prologue
    .line 76
    iget-object v0, p0, Lcom/facebook/zero/rewrite/a;->c:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 77
    iget-object v0, p0, Lcom/facebook/zero/rewrite/a;->b:Lcom/facebook/http/b/m;

    invoke-direct {p0, p1}, Lcom/facebook/zero/rewrite/a;->a(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/client/methods/HttpUriRequest;

    move-result-object v1

    invoke-interface {v0, v1, p2}, Lcom/facebook/http/b/m;->execute(Lorg/apache/http/client/methods/HttpUriRequest;Lorg/apache/http/protocol/HttpContext;)Lorg/apache/http/HttpResponse;

    move-result-object v0

    .line 79
    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/facebook/zero/rewrite/a;->b:Lcom/facebook/http/b/m;

    invoke-interface {v0, p1, p2}, Lcom/facebook/http/b/m;->execute(Lorg/apache/http/client/methods/HttpUriRequest;Lorg/apache/http/protocol/HttpContext;)Lorg/apache/http/HttpResponse;

    move-result-object v0

    goto :goto_0
.end method

.method public getConnectionManager()Lorg/apache/http/conn/ClientConnectionManager;
    .locals 1

    .prologue
    .line 60
    iget-object v0, p0, Lcom/facebook/zero/rewrite/a;->b:Lcom/facebook/http/b/m;

    invoke-interface {v0}, Lcom/facebook/http/b/m;->getConnectionManager()Lorg/apache/http/conn/ClientConnectionManager;

    move-result-object v0

    return-object v0
.end method

.method public getParams()Lorg/apache/http/params/HttpParams;
    .locals 1

    .prologue
    .line 55
    iget-object v0, p0, Lcom/facebook/zero/rewrite/a;->b:Lcom/facebook/http/b/m;

    invoke-interface {v0}, Lcom/facebook/http/b/m;->getParams()Lorg/apache/http/params/HttpParams;

    move-result-object v0

    return-object v0
.end method
