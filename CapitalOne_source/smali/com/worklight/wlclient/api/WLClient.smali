.class public Lcom/worklight/wlclient/api/WLClient;
.super Ljava/lang/Object;
.source "WLClient.java"


# static fields
.field private static final INIT_REQUEST_PATH:Ljava/lang/String; = "authentication"

.field private static final INVOKE_PROCEDURE_REQUEST_PATH:Ljava/lang/String; = "query"

.field public static final KEY_INVOKE_PROCEDURE_INVOCATION_CONTEXT:Ljava/lang/String; = "invokcationContext"

.field public static final KEY_LISTENER:Ljava/lang/String; = "listener"

.field public static final KEY_TIME_OUT:Ljava/lang/String; = "timeout"

.field private static final LOG_ACTIVITY_REQUEST_PATH:Ljava/lang/String; = "logactivity"


# instance fields
.field private authListener:Lcom/worklight/wlclient/api/WLAuthListener;

.field private config:Lcom/worklight/common/WLConfig;

.field private context:Landroid/content/Context;

.field private httpContext:Lorg/apache/http/protocol/HttpContext;

.field private isInitialized:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .line 66
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/worklight/wlclient/api/WLClient;-><init>(Landroid/content/Context;Lcom/worklight/wlclient/api/WLAuthListener;)V

    .line 67
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/worklight/wlclient/api/WLAuthListener;)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "authListener"    # Lcom/worklight/wlclient/api/WLAuthListener;

    .prologue
    .line 58
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 59
    new-instance v0, Lcom/worklight/common/WLConfig;

    invoke-direct {v0, p1}, Lcom/worklight/common/WLConfig;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/worklight/wlclient/api/WLClient;->config:Lcom/worklight/common/WLConfig;

    .line 60
    iput-object p2, p0, Lcom/worklight/wlclient/api/WLClient;->authListener:Lcom/worklight/wlclient/api/WLAuthListener;

    .line 61
    new-instance v0, Lorg/apache/http/protocol/BasicHttpContext;

    invoke-direct {v0}, Lorg/apache/http/protocol/BasicHttpContext;-><init>()V

    iput-object v0, p0, Lcom/worklight/wlclient/api/WLClient;->httpContext:Lorg/apache/http/protocol/HttpContext;

    .line 62
    iput-object p1, p0, Lcom/worklight/wlclient/api/WLClient;->context:Landroid/content/Context;

    .line 63
    return-void
.end method

.method private updateCookiesFromWebView()V
    .locals 5

    .prologue
    .line 187
    sget-object v3, Lcom/worklight/wlclient/api/WLCookieExtractor;->cookies:Ljava/lang/String;

    iget-object v4, p0, Lcom/worklight/wlclient/api/WLClient;->config:Lcom/worklight/common/WLConfig;

    invoke-virtual {v4}, Lcom/worklight/common/WLConfig;->getAppURL()Ljava/net/URL;

    move-result-object v4

    invoke-virtual {v4}, Ljava/net/URL;->getHost()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/worklight/wlclient/WLCookieManager;->setCookies(Ljava/lang/String;Ljava/lang/String;)V

    .line 188
    invoke-static {}, Lcom/worklight/wlclient/WLCookieManager;->getCookies()Ljava/util/Set;

    move-result-object v2

    .line 190
    .local v2, "cookies":Ljava/util/Set;, "Ljava/util/Set<Lorg/apache/http/cookie/Cookie;>;"
    if-eqz v2, :cond_1

    .line 191
    new-instance v1, Lorg/apache/http/impl/client/BasicCookieStore;

    invoke-direct {v1}, Lorg/apache/http/impl/client/BasicCookieStore;-><init>()V

    .line 192
    .local v1, "cookieStore":Lorg/apache/http/client/CookieStore;
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-nez v4, :cond_0

    .line 195
    iget-object v3, p0, Lcom/worklight/wlclient/api/WLClient;->httpContext:Lorg/apache/http/protocol/HttpContext;

    const-string v4, "http.cookie-store"

    invoke-interface {v3, v4, v1}, Lorg/apache/http/protocol/HttpContext;->setAttribute(Ljava/lang/String;Ljava/lang/Object;)V

    .line 199
    .end local v1    # "cookieStore":Lorg/apache/http/client/CookieStore;
    :goto_1
    return-void

    .line 192
    .restart local v1    # "cookieStore":Lorg/apache/http/client/CookieStore;
    :cond_0
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/apache/http/cookie/Cookie;

    .line 193
    .local v0, "cookie":Lorg/apache/http/cookie/Cookie;
    invoke-interface {v1, v0}, Lorg/apache/http/client/CookieStore;->addCookie(Lorg/apache/http/cookie/Cookie;)V

    goto :goto_0

    .line 197
    .end local v0    # "cookie":Lorg/apache/http/cookie/Cookie;
    .end local v1    # "cookieStore":Lorg/apache/http/client/CookieStore;
    :cond_1
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "No Cookies found for url "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v4, p0, Lcom/worklight/wlclient/api/WLClient;->config:Lcom/worklight/common/WLConfig;

    invoke-virtual {v4}, Lcom/worklight/common/WLConfig;->getAppURL()Ljava/net/URL;

    move-result-object v4

    invoke-virtual {v4}, Ljava/net/URL;->getHost()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, " in WebView."

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/worklight/common/WLUtils;->debug(Ljava/lang/String;)V

    goto :goto_1
.end method


# virtual methods
.method public connect(Lcom/worklight/wlclient/api/WLResponseListener;)V
    .locals 6
    .param p1, "responseListener"    # Lcom/worklight/wlclient/api/WLResponseListener;

    .prologue
    .line 81
    invoke-static {}, Lcom/worklight/wlclient/WLCookieManager;->clearCookies()V

    .line 82
    sget-object v2, Lcom/worklight/wlclient/api/WLCookieExtractor;->cookies:Ljava/lang/String;

    if-eqz v2, :cond_0

    .line 83
    invoke-direct {p0}, Lcom/worklight/wlclient/api/WLClient;->updateCookiesFromWebView()V

    .line 87
    :cond_0
    new-instance v3, Lcom/worklight/wlclient/api/WLRequestOptions;

    invoke-direct {v3}, Lcom/worklight/wlclient/api/WLRequestOptions;-><init>()V

    .line 88
    .local v3, "requestOptions":Lcom/worklight/wlclient/api/WLRequestOptions;
    const-string v2, "action"

    const-string v4, "test"

    invoke-virtual {v3, v2, v4}, Lcom/worklight/wlclient/api/WLRequestOptions;->addParameter(Ljava/lang/String;Ljava/lang/String;)V

    .line 89
    invoke-virtual {v3, p1}, Lcom/worklight/wlclient/api/WLRequestOptions;->setResponseListener(Lcom/worklight/wlclient/api/WLResponseListener;)V

    .line 91
    new-instance v1, Lcom/worklight/wlclient/api/InitRequestListener;

    invoke-direct {v1, p0}, Lcom/worklight/wlclient/api/InitRequestListener;-><init>(Lcom/worklight/wlclient/api/WLClient;)V

    .line 92
    .local v1, "initRequestListener":Lcom/worklight/wlclient/api/InitRequestListener;
    new-instance v0, Lcom/worklight/wlclient/WLRequest;

    iget-object v2, p0, Lcom/worklight/wlclient/api/WLClient;->httpContext:Lorg/apache/http/protocol/HttpContext;

    iget-object v4, p0, Lcom/worklight/wlclient/api/WLClient;->config:Lcom/worklight/common/WLConfig;

    iget-object v5, p0, Lcom/worklight/wlclient/api/WLClient;->context:Landroid/content/Context;

    invoke-direct/range {v0 .. v5}, Lcom/worklight/wlclient/WLRequest;-><init>(Lcom/worklight/wlclient/WLRequestListener;Lorg/apache/http/protocol/HttpContext;Lcom/worklight/wlclient/api/WLRequestOptions;Lcom/worklight/common/WLConfig;Landroid/content/Context;)V

    .line 93
    .local v0, "initRequest":Lcom/worklight/wlclient/WLRequest;
    const-string v2, "authentication"

    invoke-virtual {v0, v2}, Lcom/worklight/wlclient/WLRequest;->makeRequest(Ljava/lang/String;)V

    .line 94
    return-void
.end method

.method protected getAuthListener()Lcom/worklight/wlclient/api/WLAuthListener;
    .locals 1

    .prologue
    .line 183
    iget-object v0, p0, Lcom/worklight/wlclient/api/WLClient;->authListener:Lcom/worklight/wlclient/api/WLAuthListener;

    return-object v0
.end method

.method public init(Lcom/worklight/wlclient/api/WLResponseListener;)V
    .locals 0
    .param p1, "responseListener"    # Lcom/worklight/wlclient/api/WLResponseListener;

    .prologue
    .line 77
    invoke-virtual {p0, p1}, Lcom/worklight/wlclient/api/WLClient;->connect(Lcom/worklight/wlclient/api/WLResponseListener;)V

    .line 78
    return-void
.end method

.method public invokeProcedure(Lcom/worklight/wlclient/api/WLProcedureInvocationData;Lcom/worklight/wlclient/api/WLResponseListener;)V
    .locals 1
    .param p1, "invocationData"    # Lcom/worklight/wlclient/api/WLProcedureInvocationData;
    .param p2, "responseListener"    # Lcom/worklight/wlclient/api/WLResponseListener;

    .prologue
    .line 147
    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0}, Lcom/worklight/wlclient/api/WLClient;->invokeProcedure(Lcom/worklight/wlclient/api/WLProcedureInvocationData;Lcom/worklight/wlclient/api/WLResponseListener;Lcom/worklight/wlclient/api/WLRequestOptions;)V

    .line 148
    return-void
.end method

.method public invokeProcedure(Lcom/worklight/wlclient/api/WLProcedureInvocationData;Lcom/worklight/wlclient/api/WLResponseListener;Lcom/worklight/wlclient/api/WLRequestOptions;)V
    .locals 6
    .param p1, "invocationData"    # Lcom/worklight/wlclient/api/WLProcedureInvocationData;
    .param p2, "responseListener"    # Lcom/worklight/wlclient/api/WLResponseListener;
    .param p3, "requestOptions"    # Lcom/worklight/wlclient/api/WLRequestOptions;

    .prologue
    .line 111
    iget-boolean v2, p0, Lcom/worklight/wlclient/api/WLClient;->isInitialized:Z

    if-nez v2, :cond_0

    .line 112
    new-instance v2, Ljava/lang/RuntimeException;

    const-string v3, "WLClient not initialized"

    invoke-direct {v2, v3}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 115
    :cond_0
    if-nez p3, :cond_1

    .line 116
    new-instance p3, Lcom/worklight/wlclient/api/WLRequestOptions;

    .end local p3    # "requestOptions":Lcom/worklight/wlclient/api/WLRequestOptions;
    invoke-direct {p3}, Lcom/worklight/wlclient/api/WLRequestOptions;-><init>()V

    .line 118
    .restart local p3    # "requestOptions":Lcom/worklight/wlclient/api/WLRequestOptions;
    :cond_1
    invoke-virtual {p3, p2}, Lcom/worklight/wlclient/api/WLRequestOptions;->setResponseListener(Lcom/worklight/wlclient/api/WLResponseListener;)V

    .line 121
    invoke-virtual {p1}, Lcom/worklight/wlclient/api/WLProcedureInvocationData;->getInvocationDataMap()Ljava/util/Map;

    move-result-object v2

    invoke-virtual {p3, v2}, Lcom/worklight/wlclient/api/WLRequestOptions;->addParameters(Ljava/util/Map;)V

    .line 122
    new-instance v1, Lcom/worklight/wlclient/api/InvokeProcedureRequestListener;

    invoke-direct {v1}, Lcom/worklight/wlclient/api/InvokeProcedureRequestListener;-><init>()V

    .line 124
    .local v1, "invokeProcedureInternalListener":Lcom/worklight/wlclient/api/InvokeProcedureRequestListener;
    new-instance v0, Lcom/worklight/wlclient/WLRequest;

    .line 126
    iget-object v2, p0, Lcom/worklight/wlclient/api/WLClient;->httpContext:Lorg/apache/http/protocol/HttpContext;

    .line 128
    iget-object v4, p0, Lcom/worklight/wlclient/api/WLClient;->config:Lcom/worklight/common/WLConfig;

    .line 129
    iget-object v5, p0, Lcom/worklight/wlclient/api/WLClient;->context:Landroid/content/Context;

    move-object v3, p3

    .line 124
    invoke-direct/range {v0 .. v5}, Lcom/worklight/wlclient/WLRequest;-><init>(Lcom/worklight/wlclient/WLRequestListener;Lorg/apache/http/protocol/HttpContext;Lcom/worklight/wlclient/api/WLRequestOptions;Lcom/worklight/common/WLConfig;Landroid/content/Context;)V

    .line 131
    .local v0, "invokeProcedureWLRequest":Lcom/worklight/wlclient/WLRequest;
    invoke-virtual {p0}, Lcom/worklight/wlclient/api/WLClient;->getAuthListener()Lcom/worklight/wlclient/api/WLAuthListener;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/worklight/wlclient/WLRequest;->setAuthListener(Lcom/worklight/wlclient/api/WLAuthListener;)V

    .line 132
    const-string v2, "query"

    invoke-virtual {v0, v2}, Lcom/worklight/wlclient/WLRequest;->makeRequest(Ljava/lang/String;)V

    .line 133
    return-void
.end method

.method public logActivity(Ljava/lang/String;)V
    .locals 6
    .param p1, "activityType"    # Ljava/lang/String;

    .prologue
    .line 155
    iget-boolean v2, p0, Lcom/worklight/wlclient/api/WLClient;->isInitialized:Z

    if-nez v2, :cond_0

    .line 156
    new-instance v2, Ljava/lang/RuntimeException;

    const-string v4, "WLClient not initialized"

    invoke-direct {v2, v4}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 159
    :cond_0
    if-nez p1, :cond_1

    .line 160
    new-instance v2, Ljava/lang/RuntimeException;

    const-string v4, "ActivityType cannot be null"

    invoke-direct {v2, v4}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 163
    :cond_1
    new-instance v3, Lcom/worklight/wlclient/api/WLRequestOptions;

    invoke-direct {v3}, Lcom/worklight/wlclient/api/WLRequestOptions;-><init>()V

    .line 164
    .local v3, "requestOptions":Lcom/worklight/wlclient/api/WLRequestOptions;
    const-string v2, "activity"

    invoke-virtual {v3, v2, p1}, Lcom/worklight/wlclient/api/WLRequestOptions;->addParameter(Ljava/lang/String;Ljava/lang/String;)V

    .line 165
    new-instance v1, Lcom/worklight/wlclient/api/LogActivityListener;

    invoke-direct {v1}, Lcom/worklight/wlclient/api/LogActivityListener;-><init>()V

    .line 167
    .local v1, "logActivityListener":Lcom/worklight/wlclient/api/LogActivityListener;
    new-instance v0, Lcom/worklight/wlclient/WLRequest;

    .line 169
    iget-object v2, p0, Lcom/worklight/wlclient/api/WLClient;->httpContext:Lorg/apache/http/protocol/HttpContext;

    .line 171
    iget-object v4, p0, Lcom/worklight/wlclient/api/WLClient;->config:Lcom/worklight/common/WLConfig;

    .line 172
    iget-object v5, p0, Lcom/worklight/wlclient/api/WLClient;->context:Landroid/content/Context;

    .line 167
    invoke-direct/range {v0 .. v5}, Lcom/worklight/wlclient/WLRequest;-><init>(Lcom/worklight/wlclient/WLRequestListener;Lorg/apache/http/protocol/HttpContext;Lcom/worklight/wlclient/api/WLRequestOptions;Lcom/worklight/common/WLConfig;Landroid/content/Context;)V

    .line 174
    .local v0, "logActivityWLRequest":Lcom/worklight/wlclient/WLRequest;
    invoke-virtual {p0}, Lcom/worklight/wlclient/api/WLClient;->getAuthListener()Lcom/worklight/wlclient/api/WLAuthListener;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/worklight/wlclient/WLRequest;->setAuthListener(Lcom/worklight/wlclient/api/WLAuthListener;)V

    .line 175
    const-string v2, "logactivity"

    invoke-virtual {v0, v2}, Lcom/worklight/wlclient/WLRequest;->makeRequest(Ljava/lang/String;)V

    .line 176
    return-void
.end method

.method protected setInitialized(Z)V
    .locals 0
    .param p1, "isInitialized"    # Z

    .prologue
    .line 179
    iput-boolean p1, p0, Lcom/worklight/wlclient/api/WLClient;->isInitialized:Z

    .line 180
    return-void
.end method
