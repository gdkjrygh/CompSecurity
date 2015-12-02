.class Lcom/facebook/http/b/aj;
.super Lcom/facebook/inject/d;
.source "FbHttpModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lorg/apache/http/params/HttpParams;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/http/b/w;


# direct methods
.method private constructor <init>(Lcom/facebook/http/b/w;)V
    .locals 0

    .prologue
    .line 262
    iput-object p1, p0, Lcom/facebook/http/b/aj;->a:Lcom/facebook/http/b/w;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/http/b/w;Lcom/facebook/http/b/x;)V
    .locals 0

    .prologue
    .line 262
    invoke-direct {p0, p1}, Lcom/facebook/http/b/aj;-><init>(Lcom/facebook/http/b/w;)V

    return-void
.end method


# virtual methods
.method public a()Lorg/apache/http/params/HttpParams;
    .locals 3

    .prologue
    const v0, 0xea60

    const/4 v2, 0x0

    .line 266
    new-instance v1, Lorg/apache/http/params/BasicHttpParams;

    invoke-direct {v1}, Lorg/apache/http/params/BasicHttpParams;-><init>()V

    .line 270
    invoke-static {v1, v2}, Lorg/apache/http/params/HttpConnectionParams;->setStaleCheckingEnabled(Lorg/apache/http/params/HttpParams;Z)V

    .line 272
    invoke-static {v1, v0}, Lorg/apache/http/params/HttpConnectionParams;->setConnectionTimeout(Lorg/apache/http/params/HttpParams;I)V

    .line 273
    invoke-static {v1, v0}, Lorg/apache/http/params/HttpConnectionParams;->setSoTimeout(Lorg/apache/http/params/HttpParams;I)V

    .line 274
    const/16 v0, 0x2000

    invoke-static {v1, v0}, Lorg/apache/http/params/HttpConnectionParams;->setSocketBufferSize(Lorg/apache/http/params/HttpParams;I)V

    .line 278
    invoke-static {v1, v2}, Lorg/apache/http/client/params/HttpClientParams;->setRedirecting(Lorg/apache/http/params/HttpParams;Z)V

    .line 281
    const-class v0, Ljava/lang/String;

    const-class v2, Lcom/facebook/http/annotations/UserAgentString;

    invoke-virtual {p0, v0, v2}, Lcom/facebook/http/b/aj;->a(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 282
    invoke-static {v1, v0}, Lorg/apache/http/params/HttpProtocolParams;->setUserAgent(Lorg/apache/http/params/HttpParams;Ljava/lang/String;)V

    .line 284
    const-class v0, Lcom/facebook/http/c/e;

    invoke-virtual {p0, v0}, Lcom/facebook/http/b/aj;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/http/c/e;

    .line 285
    invoke-interface {v0}, Lcom/facebook/http/c/e;->a()Lorg/apache/http/HttpHost;

    move-result-object v0

    .line 286
    if-eqz v0, :cond_0

    .line 287
    const-string v2, "http.route.default-proxy"

    invoke-interface {v1, v2, v0}, Lorg/apache/http/params/HttpParams;->setParameter(Ljava/lang/String;Ljava/lang/Object;)Lorg/apache/http/params/HttpParams;

    .line 289
    :cond_0
    return-object v1
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 262
    invoke-virtual {p0}, Lcom/facebook/http/b/aj;->a()Lorg/apache/http/params/HttpParams;

    move-result-object v0

    return-object v0
.end method
