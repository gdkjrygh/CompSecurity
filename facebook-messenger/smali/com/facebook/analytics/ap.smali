.class final Lcom/facebook/analytics/ap;
.super Ljava/lang/Object;
.source "AnalyticsFbHttpClientObserver.java"

# interfaces
.implements Lorg/apache/http/HttpRequestInterceptor;


# instance fields
.field final synthetic a:Lcom/facebook/analytics/an;


# direct methods
.method private constructor <init>(Lcom/facebook/analytics/an;)V
    .locals 0

    .prologue
    .line 64
    iput-object p1, p0, Lcom/facebook/analytics/ap;->a:Lcom/facebook/analytics/an;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/analytics/an;Lcom/facebook/analytics/ao;)V
    .locals 0

    .prologue
    .line 64
    invoke-direct {p0, p1}, Lcom/facebook/analytics/ap;-><init>(Lcom/facebook/analytics/an;)V

    return-void
.end method


# virtual methods
.method public process(Lorg/apache/http/HttpRequest;Lorg/apache/http/protocol/HttpContext;)V
    .locals 4

    .prologue
    .line 69
    iget-object v0, p0, Lcom/facebook/analytics/ap;->a:Lcom/facebook/analytics/an;

    invoke-static {v0}, Lcom/facebook/analytics/an;->a(Lcom/facebook/analytics/an;)Lcom/facebook/analytics/i/d;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/facebook/analytics/i/d;->a(Lorg/apache/http/HttpRequest;)J

    move-result-wide v0

    .line 70
    iget-object v2, p0, Lcom/facebook/analytics/ap;->a:Lcom/facebook/analytics/an;

    invoke-static {v2}, Lcom/facebook/analytics/an;->b(Lcom/facebook/analytics/an;)Lcom/facebook/http/b/ar;

    move-result-object v2

    invoke-virtual {v2, p1, p2}, Lcom/facebook/http/b/ar;->b(Lorg/apache/http/HttpRequest;Lorg/apache/http/protocol/HttpContext;)Ljava/net/URI;

    move-result-object v2

    .line 71
    iget-object v3, p0, Lcom/facebook/analytics/ap;->a:Lcom/facebook/analytics/an;

    invoke-static {v3}, Lcom/facebook/analytics/an;->c(Lcom/facebook/analytics/an;)Lcom/facebook/analytics/ck;

    move-result-object v3

    invoke-interface {v3, v2, v0, v1}, Lcom/facebook/analytics/ck;->a(Ljava/net/URI;J)V

    .line 72
    return-void
.end method
