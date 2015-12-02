.class Lcom/facebook/http/b/r;
.super Ljava/lang/Object;
.source "FbHttpClientImpl.java"

# interfaces
.implements Lorg/apache/http/HttpRequestInterceptor;


# instance fields
.field final synthetic a:Lcom/facebook/http/b/o;


# direct methods
.method private constructor <init>(Lcom/facebook/http/b/o;)V
    .locals 0

    .prologue
    .line 342
    iput-object p1, p0, Lcom/facebook/http/b/r;->a:Lcom/facebook/http/b/o;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/http/b/o;Lcom/facebook/http/b/p;)V
    .locals 0

    .prologue
    .line 342
    invoke-direct {p0, p1}, Lcom/facebook/http/b/r;-><init>(Lcom/facebook/http/b/o;)V

    return-void
.end method


# virtual methods
.method public process(Lorg/apache/http/HttpRequest;Lorg/apache/http/protocol/HttpContext;)V
    .locals 2

    .prologue
    .line 345
    iget-object v0, p0, Lcom/facebook/http/b/r;->a:Lcom/facebook/http/b/o;

    invoke-static {v0}, Lcom/facebook/http/b/o;->b(Lcom/facebook/http/b/o;)Lcom/facebook/http/b/s;

    move-result-object v0

    .line 346
    if-eqz v0, :cond_0

    invoke-static {v0}, Lcom/facebook/http/b/s;->a(Lcom/facebook/http/b/s;)Z

    move-result v1

    if-eqz v1, :cond_0

    instance-of v1, p1, Lorg/apache/http/client/methods/HttpUriRequest;

    if-eqz v1, :cond_0

    .line 351
    check-cast p1, Lorg/apache/http/client/methods/HttpUriRequest;

    const/4 v1, 0x0

    invoke-static {p1, v1}, Lcom/facebook/http/b/o;->a(Lorg/apache/http/client/methods/HttpUriRequest;Z)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/http/b/s;->a(Lcom/facebook/http/b/s;Ljava/lang/String;)V

    .line 353
    :cond_0
    return-void
.end method
