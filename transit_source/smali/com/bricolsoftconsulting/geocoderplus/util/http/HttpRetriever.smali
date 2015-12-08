.class public Lcom/bricolsoftconsulting/geocoderplus/util/http/HttpRetriever;
.super Ljava/lang/Object;
.source "HttpRetriever.java"


# instance fields
.field httpclient:Lorg/apache/http/impl/client/DefaultHttpClient;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/bricolsoftconsulting/geocoderplus/util/http/HttpRetriever;->httpclient:Lorg/apache/http/impl/client/DefaultHttpClient;

    .line 35
    new-instance v0, Lorg/apache/http/impl/client/DefaultHttpClient;

    invoke-direct {v0}, Lorg/apache/http/impl/client/DefaultHttpClient;-><init>()V

    iput-object v0, p0, Lcom/bricolsoftconsulting/geocoderplus/util/http/HttpRetriever;->httpclient:Lorg/apache/http/impl/client/DefaultHttpClient;

    .line 36
    return-void
.end method


# virtual methods
.method public retrieve(Ljava/lang/String;)Ljava/lang/String;
    .locals 4
    .param p1, "url"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/http/client/ClientProtocolException;,
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 42
    const/4 v1, 0x0

    .line 45
    .local v1, "response":Ljava/lang/String;
    new-instance v0, Lorg/apache/http/client/methods/HttpGet;

    invoke-direct {v0, p1}, Lorg/apache/http/client/methods/HttpGet;-><init>(Ljava/lang/String;)V

    .line 46
    .local v0, "request":Lorg/apache/http/client/methods/HttpGet;
    new-instance v2, Lorg/apache/http/impl/client/BasicResponseHandler;

    invoke-direct {v2}, Lorg/apache/http/impl/client/BasicResponseHandler;-><init>()V

    .line 47
    .local v2, "responseHandler":Lorg/apache/http/client/ResponseHandler;, "Lorg/apache/http/client/ResponseHandler<Ljava/lang/String;>;"
    iget-object v3, p0, Lcom/bricolsoftconsulting/geocoderplus/util/http/HttpRetriever;->httpclient:Lorg/apache/http/impl/client/DefaultHttpClient;

    invoke-virtual {v3, v0, v2}, Lorg/apache/http/impl/client/DefaultHttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;Lorg/apache/http/client/ResponseHandler;)Ljava/lang/Object;

    move-result-object v1

    .end local v1    # "response":Ljava/lang/String;
    check-cast v1, Ljava/lang/String;

    .line 50
    .restart local v1    # "response":Ljava/lang/String;
    return-object v1
.end method
