.class public Lcom/cleanmaster/ui/app/market/i;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Lcom/cleanmaster/ui/app/market/k;

.field private b:Lcom/cleanmaster/ui/app/market/n;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/cleanmaster/ui/app/market/i;->b:Lcom/cleanmaster/ui/app/market/n;

    .line 103
    return-void
.end method

.method static synthetic a(Lcom/cleanmaster/ui/app/market/i;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 33
    invoke-direct {p0, p1}, Lcom/cleanmaster/ui/app/market/i;->c(Ljava/lang/String;)V

    return-void
.end method

.method private c(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 188
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/i;->b:Lcom/cleanmaster/ui/app/market/n;

    if-eqz v0, :cond_0

    .line 189
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/i;->b:Lcom/cleanmaster/ui/app/market/n;

    invoke-interface {v0, p1}, Lcom/cleanmaster/ui/app/market/n;->a(Ljava/lang/String;)V

    .line 191
    :cond_0
    return-void
.end method


# virtual methods
.method public a()Lcom/cleanmaster/ui/app/market/k;
    .locals 1

    .prologue
    .line 49
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/i;->a:Lcom/cleanmaster/ui/app/market/k;

    return-object v0
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/cleanmaster/ui/app/market/k;
    .locals 3

    .prologue
    .line 201
    new-instance v0, Lcom/cleanmaster/ui/app/market/k;

    invoke-direct {v0, p0}, Lcom/cleanmaster/ui/app/market/k;-><init>(Lcom/cleanmaster/ui/app/market/i;)V

    .line 202
    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/String;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const/4 v2, 0x1

    aput-object p2, v1, v2

    const/4 v2, 0x2

    aput-object p3, v1, v2

    const/4 v2, 0x3

    aput-object p4, v1, v2

    invoke-virtual {v0, v1}, Lcom/cleanmaster/ui/app/market/k;->c([Ljava/lang/Object;)Lcom/cleanmaster/ui/app/market/loader/AsyncTaskEx;

    .line 203
    iput-object v0, p0, Lcom/cleanmaster/ui/app/market/i;->a:Lcom/cleanmaster/ui/app/market/k;

    .line 204
    return-object v0
.end method

.method public a(Ljava/lang/String;)Lorg/apache/http/HttpResponse;
    .locals 4

    .prologue
    const/16 v3, 0x2710

    .line 54
    new-instance v0, Lorg/apache/http/params/BasicHttpParams;

    invoke-direct {v0}, Lorg/apache/http/params/BasicHttpParams;-><init>()V

    .line 55
    const-string v1, "http.useragent"

    invoke-static {}, Lcom/cleanmaster/ui/app/market/transport/b;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/apache/http/params/BasicHttpParams;->setParameter(Ljava/lang/String;Ljava/lang/Object;)Lorg/apache/http/params/HttpParams;

    .line 56
    invoke-static {v0, v3}, Lorg/apache/http/params/HttpConnectionParams;->setConnectionTimeout(Lorg/apache/http/params/HttpParams;I)V

    .line 57
    invoke-static {v0, v3}, Lorg/apache/http/params/HttpConnectionParams;->setSoTimeout(Lorg/apache/http/params/HttpParams;I)V

    .line 58
    new-instance v1, Lorg/apache/http/impl/client/DefaultHttpClient;

    invoke-direct {v1, v0}, Lorg/apache/http/impl/client/DefaultHttpClient;-><init>(Lorg/apache/http/params/HttpParams;)V

    .line 59
    new-instance v0, Lcom/cleanmaster/ui/app/market/j;

    invoke-direct {v0, p0}, Lcom/cleanmaster/ui/app/market/j;-><init>(Lcom/cleanmaster/ui/app/market/i;)V

    invoke-virtual {v1, v0}, Lorg/apache/http/impl/client/DefaultHttpClient;->setRedirectHandler(Lorg/apache/http/client/RedirectHandler;)V

    .line 72
    new-instance v2, Lorg/apache/http/protocol/BasicHttpContext;

    invoke-direct {v2}, Lorg/apache/http/protocol/BasicHttpContext;-><init>()V

    .line 73
    const/4 v0, 0x0

    .line 75
    :try_start_0
    new-instance v3, Lorg/apache/http/client/methods/HttpGet;

    invoke-direct {v3, p1}, Lorg/apache/http/client/methods/HttpGet;-><init>(Ljava/lang/String;)V

    .line 76
    invoke-virtual {v1, v3, v2}, Lorg/apache/http/impl/client/DefaultHttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;Lorg/apache/http/protocol/HttpContext;)Lorg/apache/http/HttpResponse;
    :try_end_0
    .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/net/SocketTimeoutException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/net/ConnectException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/net/SocketException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Lorg/apache/http/conn/ConnectionPoolTimeoutException; {:try_start_0 .. :try_end_0} :catch_5
    .catch Lorg/apache/http/conn/ConnectTimeoutException; {:try_start_0 .. :try_end_0} :catch_6
    .catch Lorg/apache/http/NoHttpResponseException; {:try_start_0 .. :try_end_0} :catch_7
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_8
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_9
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_a

    move-result-object v0

    .line 100
    :goto_0
    return-object v0

    .line 78
    :catch_0
    move-exception v1

    invoke-virtual {v1}, Lorg/apache/http/client/ClientProtocolException;->printStackTrace()V

    goto :goto_0

    .line 80
    :catch_1
    move-exception v1

    invoke-virtual {v1}, Ljava/net/SocketTimeoutException;->printStackTrace()V

    goto :goto_0

    .line 82
    :catch_2
    move-exception v1

    invoke-virtual {v1}, Ljava/net/ConnectException;->printStackTrace()V

    goto :goto_0

    .line 84
    :catch_3
    move-exception v1

    invoke-virtual {v1}, Ljava/net/SocketException;->printStackTrace()V

    goto :goto_0

    .line 86
    :catch_4
    move-exception v1

    invoke-virtual {v1}, Ljava/net/MalformedURLException;->printStackTrace()V

    goto :goto_0

    .line 88
    :catch_5
    move-exception v1

    invoke-virtual {v1}, Lorg/apache/http/conn/ConnectionPoolTimeoutException;->printStackTrace()V

    goto :goto_0

    .line 90
    :catch_6
    move-exception v1

    invoke-virtual {v1}, Lorg/apache/http/conn/ConnectTimeoutException;->printStackTrace()V

    goto :goto_0

    .line 92
    :catch_7
    move-exception v1

    invoke-virtual {v1}, Lorg/apache/http/NoHttpResponseException;->printStackTrace()V

    goto :goto_0

    .line 94
    :catch_8
    move-exception v1

    invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_0

    .line 96
    :catch_9
    move-exception v1

    invoke-virtual {v1}, Ljava/lang/NullPointerException;->printStackTrace()V

    goto :goto_0

    .line 98
    :catch_a
    move-exception v1

    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0
.end method

.method public a(Lcom/cleanmaster/ui/app/market/n;)V
    .locals 0

    .prologue
    .line 45
    iput-object p1, p0, Lcom/cleanmaster/ui/app/market/i;->b:Lcom/cleanmaster/ui/app/market/n;

    .line 46
    return-void
.end method

.method public b(Ljava/lang/String;)Lcom/cleanmaster/ui/app/market/k;
    .locals 3

    .prologue
    .line 194
    new-instance v0, Lcom/cleanmaster/ui/app/market/k;

    invoke-direct {v0, p0}, Lcom/cleanmaster/ui/app/market/k;-><init>(Lcom/cleanmaster/ui/app/market/i;)V

    .line 195
    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/String;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-virtual {v0, v1}, Lcom/cleanmaster/ui/app/market/k;->c([Ljava/lang/Object;)Lcom/cleanmaster/ui/app/market/loader/AsyncTaskEx;

    .line 196
    iput-object v0, p0, Lcom/cleanmaster/ui/app/market/i;->a:Lcom/cleanmaster/ui/app/market/k;

    .line 197
    return-object v0
.end method
