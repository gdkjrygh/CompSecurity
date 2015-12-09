.class public Lcom/worklight/wlclient/WLRequest;
.super Ljava/lang/Object;
.source "WLRequest.java"


# static fields
.field private static final pool:Ljava/util/concurrent/ExecutorService;


# instance fields
.field private authListener:Lcom/worklight/wlclient/api/WLAuthListener;

.field private config:Lcom/worklight/common/WLConfig;

.field private context:Landroid/content/Context;

.field private httpContext:Lorg/apache/http/protocol/HttpContext;

.field private postRequest:Lorg/apache/http/client/methods/HttpPost;

.field private requestListener:Lcom/worklight/wlclient/WLRequestListener;

.field private requestOptions:Lcom/worklight/wlclient/api/WLRequestOptions;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 47
    const/4 v0, 0x6

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    sput-object v0, Lcom/worklight/wlclient/WLRequest;->pool:Ljava/util/concurrent/ExecutorService;

    .line 38
    return-void
.end method

.method public constructor <init>(Lcom/worklight/wlclient/WLRequestListener;Lorg/apache/http/protocol/HttpContext;Lcom/worklight/wlclient/api/WLRequestOptions;Lcom/worklight/common/WLConfig;Landroid/content/Context;)V
    .locals 0
    .param p1, "wlRequestListener"    # Lcom/worklight/wlclient/WLRequestListener;
    .param p2, "httpContext"    # Lorg/apache/http/protocol/HttpContext;
    .param p3, "wlRequestData"    # Lcom/worklight/wlclient/api/WLRequestOptions;
    .param p4, "wlConfig"    # Lcom/worklight/common/WLConfig;
    .param p5, "context"    # Landroid/content/Context;

    .prologue
    .line 49
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 55
    iput-object p1, p0, Lcom/worklight/wlclient/WLRequest;->requestListener:Lcom/worklight/wlclient/WLRequestListener;

    .line 56
    iput-object p2, p0, Lcom/worklight/wlclient/WLRequest;->httpContext:Lorg/apache/http/protocol/HttpContext;

    .line 57
    iput-object p3, p0, Lcom/worklight/wlclient/WLRequest;->requestOptions:Lcom/worklight/wlclient/api/WLRequestOptions;

    .line 58
    iput-object p4, p0, Lcom/worklight/wlclient/WLRequest;->config:Lcom/worklight/common/WLConfig;

    .line 59
    iput-object p5, p0, Lcom/worklight/wlclient/WLRequest;->context:Landroid/content/Context;

    .line 60
    return-void
.end method

.method private addExtraHeaders(Lorg/apache/http/client/methods/HttpPost;)V
    .locals 4
    .param p1, "postRequest"    # Lorg/apache/http/client/methods/HttpPost;

    .prologue
    .line 100
    iget-object v3, p0, Lcom/worklight/wlclient/WLRequest;->requestOptions:Lcom/worklight/wlclient/api/WLRequestOptions;

    invoke-virtual {v3}, Lcom/worklight/wlclient/api/WLRequestOptions;->getHeaders()Ljava/util/ArrayList;

    move-result-object v0

    .line 101
    .local v0, "extraHeaders":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lorg/apache/http/Header;>;"
    if-nez v0, :cond_1

    .line 108
    :cond_0
    return-void

    .line 104
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .local v2, "iterator":Ljava/util/Iterator;, "Ljava/util/Iterator<Lorg/apache/http/Header;>;"
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 105
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/apache/http/Header;

    .line 106
    .local v1, "header":Lorg/apache/http/Header;
    invoke-virtual {p1, v1}, Lorg/apache/http/client/methods/HttpPost;->addHeader(Lorg/apache/http/Header;)V

    goto :goto_0
.end method

.method private addHeaders(Lcom/worklight/common/WLConfig;Lorg/apache/http/client/methods/HttpPost;)V
    .locals 2
    .param p1, "config"    # Lcom/worklight/common/WLConfig;
    .param p2, "postRequest"    # Lorg/apache/http/client/methods/HttpPost;

    .prologue
    .line 95
    const-string v0, "X-Requested-With"

    const-string v1, "XMLHttpRequest"

    invoke-virtual {p2, v0, v1}, Lorg/apache/http/client/methods/HttpPost;->addHeader(Ljava/lang/String;Ljava/lang/String;)V

    .line 96
    const-string v0, "x-wl-app-version"

    invoke-virtual {p1}, Lcom/worklight/common/WLConfig;->getApplicationVersion()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v0, v1}, Lorg/apache/http/client/methods/HttpPost;->addHeader(Ljava/lang/String;Ljava/lang/String;)V

    .line 97
    return-void
.end method

.method private addParams(Lcom/worklight/wlclient/api/WLRequestOptions;Lorg/apache/http/client/methods/HttpPost;)V
    .locals 7
    .param p1, "requestOptions"    # Lcom/worklight/wlclient/api/WLRequestOptions;
    .param p2, "postRequest"    # Lorg/apache/http/client/methods/HttpPost;

    .prologue
    .line 111
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 112
    .local v3, "params":Ljava/util/List;, "Ljava/util/List<Lorg/apache/http/NameValuePair;>;"
    invoke-virtual {p1}, Lcom/worklight/wlclient/api/WLRequestOptions;->getParameters()Ljava/util/Map;

    move-result-object v4

    if-eqz v4, :cond_0

    invoke-virtual {p1}, Lcom/worklight/wlclient/api/WLRequestOptions;->getParameters()Ljava/util/Map;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Map;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_0

    .line 113
    invoke-virtual {p1}, Lcom/worklight/wlclient/api/WLRequestOptions;->getParameters()Ljava/util/Map;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-nez v4, :cond_1

    .line 117
    :cond_0
    new-instance v4, Lorg/apache/http/message/BasicNameValuePair;

    const-string v5, "isAjaxRequest"

    const-string v6, "true"

    invoke-direct {v4, v5, v6}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 118
    const/4 v1, 0x0

    .line 121
    .local v1, "encodedFormEntity":Lorg/apache/http/client/entity/UrlEncodedFormEntity;
    :try_start_0
    new-instance v1, Lorg/apache/http/client/entity/UrlEncodedFormEntity;

    .end local v1    # "encodedFormEntity":Lorg/apache/http/client/entity/UrlEncodedFormEntity;
    const-string v4, "UTF-8"

    invoke-direct {v1, v3, v4}, Lorg/apache/http/client/entity/UrlEncodedFormEntity;-><init>(Ljava/util/List;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    .line 126
    .restart local v1    # "encodedFormEntity":Lorg/apache/http/client/entity/UrlEncodedFormEntity;
    invoke-virtual {p2, v1}, Lorg/apache/http/client/methods/HttpPost;->setEntity(Lorg/apache/http/HttpEntity;)V

    .line 127
    return-void

    .line 113
    .end local v1    # "encodedFormEntity":Lorg/apache/http/client/entity/UrlEncodedFormEntity;
    :cond_1
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 114
    .local v2, "paramName":Ljava/lang/String;
    new-instance v6, Lorg/apache/http/message/BasicNameValuePair;

    invoke-virtual {p1}, Lcom/worklight/wlclient/api/WLRequestOptions;->getParameters()Ljava/util/Map;

    move-result-object v4

    invoke-interface {v4, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-direct {v6, v2, v4}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v3, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 122
    .end local v2    # "paramName":Ljava/lang/String;
    :catch_0
    move-exception v0

    .line 123
    .local v0, "e":Ljava/io/UnsupportedEncodingException;
    invoke-virtual {v0}, Ljava/io/UnsupportedEncodingException;->getMessage()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v0}, Lcom/worklight/common/WLUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 124
    new-instance v4, Ljava/lang/RuntimeException;

    invoke-direct {v4, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v4
.end method


# virtual methods
.method public getAuthListener()Lcom/worklight/wlclient/api/WLAuthListener;
    .locals 1

    .prologue
    .line 130
    iget-object v0, p0, Lcom/worklight/wlclient/WLRequest;->authListener:Lcom/worklight/wlclient/api/WLAuthListener;

    return-object v0
.end method

.method public getConfig()Lcom/worklight/common/WLConfig;
    .locals 1

    .prologue
    .line 154
    iget-object v0, p0, Lcom/worklight/wlclient/WLRequest;->config:Lcom/worklight/common/WLConfig;

    return-object v0
.end method

.method public getContext()Landroid/content/Context;
    .locals 1

    .prologue
    .line 158
    iget-object v0, p0, Lcom/worklight/wlclient/WLRequest;->context:Landroid/content/Context;

    return-object v0
.end method

.method public getHttpContext()Lorg/apache/http/protocol/HttpContext;
    .locals 1

    .prologue
    .line 146
    iget-object v0, p0, Lcom/worklight/wlclient/WLRequest;->httpContext:Lorg/apache/http/protocol/HttpContext;

    return-object v0
.end method

.method public getOptions()Lcom/worklight/wlclient/api/WLRequestOptions;
    .locals 1

    .prologue
    .line 150
    iget-object v0, p0, Lcom/worklight/wlclient/WLRequest;->requestOptions:Lcom/worklight/wlclient/api/WLRequestOptions;

    return-object v0
.end method

.method public getPostRequest()Lorg/apache/http/client/methods/HttpPost;
    .locals 1

    .prologue
    .line 142
    iget-object v0, p0, Lcom/worklight/wlclient/WLRequest;->postRequest:Lorg/apache/http/client/methods/HttpPost;

    return-object v0
.end method

.method public getRequestListener()Lcom/worklight/wlclient/WLRequestListener;
    .locals 1

    .prologue
    .line 138
    iget-object v0, p0, Lcom/worklight/wlclient/WLRequest;->requestListener:Lcom/worklight/wlclient/WLRequestListener;

    return-object v0
.end method

.method public makeRequest(Ljava/lang/String;)V
    .locals 1
    .param p1, "requestPath"    # Ljava/lang/String;

    .prologue
    .line 71
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/worklight/wlclient/WLRequest;->makeRequest(Ljava/lang/String;Z)V

    .line 72
    return-void
.end method

.method public makeRequest(Ljava/lang/String;Z)V
    .locals 3
    .param p1, "requestPath"    # Ljava/lang/String;
    .param p2, "isFullPath"    # Z

    .prologue
    .line 80
    const/4 v0, 0x0

    .line 81
    .local v0, "requestURL":Ljava/lang/String;
    if-nez p2, :cond_0

    .line 82
    new-instance v1, Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/worklight/wlclient/WLRequest;->config:Lcom/worklight/common/WLConfig;

    invoke-virtual {v2}, Lcom/worklight/common/WLConfig;->getAppURL()Ljava/net/URL;

    move-result-object v2

    invoke-virtual {v2}, Ljava/net/URL;->toExternalForm()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 87
    :goto_0
    new-instance v1, Lorg/apache/http/client/methods/HttpPost;

    invoke-direct {v1, v0}, Lorg/apache/http/client/methods/HttpPost;-><init>(Ljava/lang/String;)V

    iput-object v1, p0, Lcom/worklight/wlclient/WLRequest;->postRequest:Lorg/apache/http/client/methods/HttpPost;

    .line 88
    iget-object v1, p0, Lcom/worklight/wlclient/WLRequest;->config:Lcom/worklight/common/WLConfig;

    iget-object v2, p0, Lcom/worklight/wlclient/WLRequest;->postRequest:Lorg/apache/http/client/methods/HttpPost;

    invoke-direct {p0, v1, v2}, Lcom/worklight/wlclient/WLRequest;->addHeaders(Lcom/worklight/common/WLConfig;Lorg/apache/http/client/methods/HttpPost;)V

    .line 89
    iget-object v1, p0, Lcom/worklight/wlclient/WLRequest;->postRequest:Lorg/apache/http/client/methods/HttpPost;

    invoke-direct {p0, v1}, Lcom/worklight/wlclient/WLRequest;->addExtraHeaders(Lorg/apache/http/client/methods/HttpPost;)V

    .line 90
    iget-object v1, p0, Lcom/worklight/wlclient/WLRequest;->requestOptions:Lcom/worklight/wlclient/api/WLRequestOptions;

    iget-object v2, p0, Lcom/worklight/wlclient/WLRequest;->postRequest:Lorg/apache/http/client/methods/HttpPost;

    invoke-direct {p0, v1, v2}, Lcom/worklight/wlclient/WLRequest;->addParams(Lcom/worklight/wlclient/api/WLRequestOptions;Lorg/apache/http/client/methods/HttpPost;)V

    .line 91
    sget-object v1, Lcom/worklight/wlclient/WLRequest;->pool:Ljava/util/concurrent/ExecutorService;

    new-instance v2, Lcom/worklight/wlclient/AsynchronousRequestSender;

    invoke-direct {v2, p0}, Lcom/worklight/wlclient/AsynchronousRequestSender;-><init>(Lcom/worklight/wlclient/WLRequest;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 92
    return-void

    .line 85
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/worklight/wlclient/WLRequest;->config:Lcom/worklight/common/WLConfig;

    invoke-virtual {v2}, Lcom/worklight/common/WLConfig;->getRootURL()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v2, "/"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public setAuthListener(Lcom/worklight/wlclient/api/WLAuthListener;)V
    .locals 0
    .param p1, "authListener"    # Lcom/worklight/wlclient/api/WLAuthListener;

    .prologue
    .line 134
    iput-object p1, p0, Lcom/worklight/wlclient/WLRequest;->authListener:Lcom/worklight/wlclient/api/WLAuthListener;

    .line 135
    return-void
.end method
