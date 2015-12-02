.class final Lcom/facebook/analytics/aq;
.super Ljava/lang/Object;
.source "AnalyticsFbHttpClientObserver.java"

# interfaces
.implements Lorg/apache/http/HttpResponseInterceptor;


# instance fields
.field final synthetic a:Lcom/facebook/analytics/an;


# direct methods
.method private constructor <init>(Lcom/facebook/analytics/an;)V
    .locals 0

    .prologue
    .line 75
    iput-object p1, p0, Lcom/facebook/analytics/aq;->a:Lcom/facebook/analytics/an;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/analytics/an;Lcom/facebook/analytics/ao;)V
    .locals 0

    .prologue
    .line 75
    invoke-direct {p0, p1}, Lcom/facebook/analytics/aq;-><init>(Lcom/facebook/analytics/an;)V

    return-void
.end method


# virtual methods
.method public process(Lorg/apache/http/HttpResponse;Lorg/apache/http/protocol/HttpContext;)V
    .locals 10

    .prologue
    const-wide/16 v8, 0x0

    .line 79
    iget-object v0, p0, Lcom/facebook/analytics/aq;->a:Lcom/facebook/analytics/an;

    invoke-static {v0}, Lcom/facebook/analytics/an;->a(Lcom/facebook/analytics/an;)Lcom/facebook/analytics/i/d;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/facebook/analytics/i/d;->a(Lorg/apache/http/HttpResponse;)Ljava/lang/String;

    move-result-object v2

    .line 80
    iget-object v0, p0, Lcom/facebook/analytics/aq;->a:Lcom/facebook/analytics/an;

    invoke-static {v0}, Lcom/facebook/analytics/an;->a(Lcom/facebook/analytics/an;)Lcom/facebook/analytics/i/d;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/facebook/analytics/i/d;->a(Lorg/apache/http/HttpMessage;)J

    move-result-wide v3

    .line 81
    iget-object v0, p0, Lcom/facebook/analytics/aq;->a:Lcom/facebook/analytics/an;

    invoke-static {v0}, Lcom/facebook/analytics/an;->a(Lcom/facebook/analytics/an;)Lcom/facebook/analytics/i/d;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/facebook/analytics/i/d;->b(Lorg/apache/http/HttpMessage;)J

    move-result-wide v5

    .line 82
    invoke-interface {p1}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;

    move-result-object v7

    .line 83
    cmp-long v0, v5, v8

    if-gez v0, :cond_0

    .line 84
    invoke-interface {v7}, Lorg/apache/http/HttpEntity;->getContentLength()J

    move-result-wide v5

    .line 86
    :cond_0
    iget-object v0, p0, Lcom/facebook/analytics/aq;->a:Lcom/facebook/analytics/an;

    invoke-static {v0}, Lcom/facebook/analytics/an;->b(Lcom/facebook/analytics/an;)Lcom/facebook/http/b/ar;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p2}, Lcom/facebook/http/b/ar;->b(Lorg/apache/http/HttpRequest;Lorg/apache/http/protocol/HttpContext;)Ljava/net/URI;

    move-result-object v1

    .line 87
    iget-object v0, p0, Lcom/facebook/analytics/aq;->a:Lcom/facebook/analytics/an;

    invoke-static {v0}, Lcom/facebook/analytics/an;->c(Lcom/facebook/analytics/an;)Lcom/facebook/analytics/ck;

    move-result-object v0

    invoke-interface/range {v0 .. v6}, Lcom/facebook/analytics/ck;->a(Ljava/net/URI;Ljava/lang/String;JJ)V

    .line 91
    cmp-long v0, v5, v8

    if-gez v0, :cond_1

    const/4 v9, 0x1

    .line 93
    :goto_0
    new-instance v3, Lcom/facebook/analytics/ar;

    iget-object v4, p0, Lcom/facebook/analytics/aq;->a:Lcom/facebook/analytics/an;

    move-object v5, v7

    move-object v6, v1

    move-object v7, v2

    move-object v8, p2

    invoke-direct/range {v3 .. v9}, Lcom/facebook/analytics/ar;-><init>(Lcom/facebook/analytics/an;Lorg/apache/http/HttpEntity;Ljava/net/URI;Ljava/lang/String;Lorg/apache/http/protocol/HttpContext;Z)V

    invoke-interface {p1, v3}, Lorg/apache/http/HttpResponse;->setEntity(Lorg/apache/http/HttpEntity;)V

    .line 95
    return-void

    .line 91
    :cond_1
    const/4 v9, 0x0

    goto :goto_0
.end method
