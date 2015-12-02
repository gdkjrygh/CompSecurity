.class public Lcom/facebook/analytics/au;
.super Ljava/lang/Object;
.source "AnalyticsFbHttpErrorReporter.java"

# interfaces
.implements Lcom/facebook/http/b/au;


# instance fields
.field private final a:Lcom/facebook/analytics/av;

.field private final b:Lcom/facebook/http/b/ar;

.field private final c:Landroid/net/ConnectivityManager;

.field private final d:Lcom/facebook/analytics/g/e;


# direct methods
.method public constructor <init>(Lcom/facebook/analytics/av;Lcom/facebook/http/b/ar;Landroid/net/ConnectivityManager;Lcom/facebook/analytics/g/e;)V
    .locals 0

    .prologue
    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    iput-object p1, p0, Lcom/facebook/analytics/au;->a:Lcom/facebook/analytics/av;

    .line 43
    iput-object p2, p0, Lcom/facebook/analytics/au;->b:Lcom/facebook/http/b/ar;

    .line 44
    iput-object p3, p0, Lcom/facebook/analytics/au;->c:Landroid/net/ConnectivityManager;

    .line 45
    iput-object p4, p0, Lcom/facebook/analytics/au;->d:Lcom/facebook/analytics/g/e;

    .line 46
    return-void
.end method

.method private a(Lcom/facebook/analytics/cb;Ljava/lang/String;Ljava/lang/StringBuilder;)V
    .locals 2

    .prologue
    .line 121
    invoke-virtual {p1, p2}, Lcom/facebook/analytics/cb;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 122
    invoke-static {v0}, Lcom/facebook/common/w/n;->a(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 123
    const/16 v1, 0x5f

    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 125
    :cond_0
    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/http/b/av;Ljava/io/IOException;Lorg/apache/http/HttpRequest;Lorg/apache/http/protocol/HttpContext;)V
    .locals 6

    .prologue
    .line 55
    new-instance v2, Lcom/facebook/analytics/cb;

    const-string v0, "http_error"

    invoke-direct {v2, v0}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    .line 56
    const-string v0, "stage"

    invoke-virtual {p1}, Lcom/facebook/http/b/av;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    .line 57
    const-string v1, "error"

    if-eqz p2, :cond_3

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    :goto_0
    invoke-virtual {v2, v1, v0}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    .line 59
    iget-object v0, p0, Lcom/facebook/analytics/au;->c:Landroid/net/ConnectivityManager;

    invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v0

    .line 60
    if-eqz v0, :cond_4

    .line 61
    const-string v1, "network"

    invoke-virtual {v0}, Landroid/net/NetworkInfo;->getTypeName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v1, v3}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    .line 62
    const-string v1, "network_state"

    invoke-virtual {v0}, Landroid/net/NetworkInfo;->getDetailedState()Landroid/net/NetworkInfo$DetailedState;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/NetworkInfo$DetailedState;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v1, v0}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    .line 67
    :goto_1
    iget-object v0, p0, Lcom/facebook/analytics/au;->b:Lcom/facebook/http/b/ar;

    invoke-virtual {v0, p3, p4}, Lcom/facebook/http/b/ar;->b(Lorg/apache/http/HttpRequest;Lorg/apache/http/protocol/HttpContext;)Ljava/net/URI;

    move-result-object v3

    .line 68
    const-string v0, "uri"

    invoke-virtual {v3}, Ljava/net/URI;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    .line 70
    const-string v0, "fb_http_data_category"

    invoke-interface {p4, v0}, Lorg/apache/http/protocol/HttpContext;->getAttribute(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 71
    if-eqz v0, :cond_0

    .line 72
    const-string v1, "category"

    invoke-virtual {v2, v1, v0}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    .line 75
    :cond_0
    if-eqz p3, :cond_5

    .line 78
    :goto_2
    if-eqz p3, :cond_1

    .line 79
    const-string v0, "method"

    invoke-interface {p3}, Lorg/apache/http/HttpRequest;->getRequestLine()Lorg/apache/http/RequestLine;

    move-result-object v1

    invoke-interface {v1}, Lorg/apache/http/RequestLine;->getMethod()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    .line 82
    :cond_1
    const-string v0, "http.proxy_host"

    invoke-interface {p4, v0}, Lorg/apache/http/protocol/HttpContext;->getAttribute(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/apache/http/HttpHost;

    .line 83
    if-eqz v0, :cond_6

    .line 88
    const-string v1, "proxy"

    invoke-virtual {v0}, Lorg/apache/http/HttpHost;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v1, v0}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    .line 102
    :cond_2
    :goto_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 103
    invoke-virtual {v3}, Ljava/net/URI;->getScheme()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const/16 v4, 0x5f

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v3}, Ljava/net/URI;->getHost()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    const-string v1, "stage"

    invoke-direct {p0, v2, v1, v0}, Lcom/facebook/analytics/au;->a(Lcom/facebook/analytics/cb;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 105
    const-string v1, "error"

    invoke-direct {p0, v2, v1, v0}, Lcom/facebook/analytics/au;->a(Lcom/facebook/analytics/cb;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 106
    const-string v1, "network"

    invoke-direct {p0, v2, v1, v0}, Lcom/facebook/analytics/au;->a(Lcom/facebook/analytics/cb;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 107
    const-string v1, "network_state"

    invoke-direct {p0, v2, v1, v0}, Lcom/facebook/analytics/au;->a(Lcom/facebook/analytics/cb;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 108
    const-string v1, "category"

    invoke-direct {p0, v2, v1, v0}, Lcom/facebook/analytics/au;->a(Lcom/facebook/analytics/cb;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 109
    const-string v1, "method"

    invoke-direct {p0, v2, v1, v0}, Lcom/facebook/analytics/au;->a(Lcom/facebook/analytics/cb;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 110
    const-string v1, "proxy"

    invoke-direct {p0, v2, v1, v0}, Lcom/facebook/analytics/au;->a(Lcom/facebook/analytics/cb;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 112
    const-string v1, "throttle_key"

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v1, v0}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/ca;

    .line 113
    const-string v0, "throttle_duration"

    const-wide/32 v3, 0x36ee80

    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/ca;

    .line 116
    iget-object v0, p0, Lcom/facebook/analytics/au;->a:Lcom/facebook/analytics/av;

    iget-object v1, p0, Lcom/facebook/analytics/au;->d:Lcom/facebook/analytics/g/e;

    invoke-interface {v0, v2, v1}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;Lcom/facebook/analytics/g/e;)V

    .line 117
    return-void

    .line 57
    :cond_3
    const-string v0, "none"

    goto/16 :goto_0

    .line 64
    :cond_4
    const-string v0, "network"

    const-string v1, "none"

    invoke-virtual {v2, v0, v1}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    goto/16 :goto_1

    .line 75
    :cond_5
    const-string v0, "http.request"

    invoke-interface {p4, v0}, Lorg/apache/http/protocol/HttpContext;->getAttribute(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/apache/http/HttpRequest;

    move-object p3, v0

    goto/16 :goto_2

    .line 90
    :cond_6
    const-string v0, "fb_http_retried_exceptions"

    invoke-interface {p4, v0}, Lorg/apache/http/protocol/HttpContext;->getAttribute(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    .line 92
    if-eqz v0, :cond_2

    .line 93
    new-instance v4, Lcom/fasterxml/jackson/databind/node/ArrayNode;

    sget-object v1, Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;->instance:Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;

    invoke-direct {v4, v1}, Lcom/fasterxml/jackson/databind/node/ArrayNode;-><init>(Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;)V

    .line 94
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_4
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 95
    invoke-virtual {v4, v1}, Lcom/fasterxml/jackson/databind/node/ArrayNode;->add(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/node/ArrayNode;

    goto :goto_4

    .line 97
    :cond_7
    const-string v1, "retried_exceptions"

    invoke-virtual {v2, v1, v4}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/facebook/analytics/cb;

    .line 98
    const-string v1, "retry_count"

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-virtual {v2, v1, v0}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;I)Lcom/facebook/analytics/cb;

    goto/16 :goto_3
.end method
