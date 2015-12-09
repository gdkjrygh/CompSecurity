.class public Lcom/worklight/wlclient/AsynchronousRequestSender;
.super Ljava/lang/Object;
.source "AsynchronousRequestSender.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private httpClient:Lorg/apache/http/client/HttpClient;

.field private request:Lcom/worklight/wlclient/WLRequest;


# direct methods
.method protected constructor <init>(Lcom/worklight/wlclient/WLRequest;)V
    .locals 1
    .param p1, "request"    # Lcom/worklight/wlclient/WLRequest;

    .prologue
    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/worklight/wlclient/AsynchronousRequestSender;->httpClient:Lorg/apache/http/client/HttpClient;

    .line 43
    iput-object p1, p0, Lcom/worklight/wlclient/AsynchronousRequestSender;->request:Lcom/worklight/wlclient/WLRequest;

    .line 44
    new-instance v0, Lorg/apache/http/impl/client/DefaultHttpClient;

    invoke-direct {v0}, Lorg/apache/http/impl/client/DefaultHttpClient;-><init>()V

    iput-object v0, p0, Lcom/worklight/wlclient/AsynchronousRequestSender;->httpClient:Lorg/apache/http/client/HttpClient;

    .line 45
    return-void
.end method

.method private addInstanceAuthHeader()V
    .locals 3

    .prologue
    .line 115
    invoke-static {}, Lcom/worklight/wlclient/WLCookieManager;->getInstanceAuthId()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/worklight/common/WLUtils;->isStringEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 117
    iget-object v0, p0, Lcom/worklight/wlclient/AsynchronousRequestSender;->request:Lcom/worklight/wlclient/WLRequest;

    invoke-virtual {v0}, Lcom/worklight/wlclient/WLRequest;->getPostRequest()Lorg/apache/http/client/methods/HttpPost;

    move-result-object v0

    const-string v1, "WL-Instance-Id"

    invoke-virtual {v0, v1}, Lorg/apache/http/client/methods/HttpPost;->getHeaders(Ljava/lang/String;)[Lorg/apache/http/Header;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 118
    iget-object v0, p0, Lcom/worklight/wlclient/AsynchronousRequestSender;->request:Lcom/worklight/wlclient/WLRequest;

    invoke-virtual {v0}, Lcom/worklight/wlclient/WLRequest;->getPostRequest()Lorg/apache/http/client/methods/HttpPost;

    move-result-object v0

    const-string v1, "WL-Instance-Id"

    invoke-virtual {v0, v1}, Lorg/apache/http/client/methods/HttpPost;->removeHeaders(Ljava/lang/String;)V

    .line 120
    :cond_0
    iget-object v0, p0, Lcom/worklight/wlclient/AsynchronousRequestSender;->request:Lcom/worklight/wlclient/WLRequest;

    invoke-virtual {v0}, Lcom/worklight/wlclient/WLRequest;->getPostRequest()Lorg/apache/http/client/methods/HttpPost;

    move-result-object v0

    const-string v1, "WL-Instance-Id"

    invoke-static {}, Lcom/worklight/wlclient/WLCookieManager;->getInstanceAuthId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/apache/http/client/methods/HttpPost;->addHeader(Ljava/lang/String;Ljava/lang/String;)V

    .line 122
    :cond_1
    return-void
.end method

.method private onResponseReceived(Lorg/apache/http/HttpResponse;)V
    .locals 11
    .param p1, "httpResponse"    # Lorg/apache/http/HttpResponse;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/worklight/wlclient/WL403ResponseException;
        }
    .end annotation

    .prologue
    .line 151
    if-nez p1, :cond_0

    .line 153
    iget-object v6, p0, Lcom/worklight/wlclient/AsynchronousRequestSender;->request:Lcom/worklight/wlclient/WLRequest;

    invoke-virtual {v6}, Lcom/worklight/wlclient/WLRequest;->getRequestListener()Lcom/worklight/wlclient/WLRequestListener;

    move-result-object v6

    new-instance v7, Lcom/worklight/wlclient/api/WLFailResponse;

    sget-object v8, Lcom/worklight/wlclient/api/WLErrorCode;->UNEXPECTED_ERROR:Lcom/worklight/wlclient/api/WLErrorCode;

    sget-object v9, Lcom/worklight/wlclient/api/WLErrorCode;->UNEXPECTED_ERROR:Lcom/worklight/wlclient/api/WLErrorCode;

    invoke-virtual {v9}, Lcom/worklight/wlclient/api/WLErrorCode;->getDescription()Ljava/lang/String;

    move-result-object v9

    iget-object v10, p0, Lcom/worklight/wlclient/AsynchronousRequestSender;->request:Lcom/worklight/wlclient/WLRequest;

    invoke-virtual {v10}, Lcom/worklight/wlclient/WLRequest;->getOptions()Lcom/worklight/wlclient/api/WLRequestOptions;

    move-result-object v10

    invoke-direct {v7, v8, v9, v10}, Lcom/worklight/wlclient/api/WLFailResponse;-><init>(Lcom/worklight/wlclient/api/WLErrorCode;Ljava/lang/String;Lcom/worklight/wlclient/api/WLRequestOptions;)V

    invoke-interface {v6, v7}, Lcom/worklight/wlclient/WLRequestListener;->onFailure(Lcom/worklight/wlclient/api/WLFailResponse;)V

    .line 200
    :goto_0
    return-void

    .line 157
    :cond_0
    const/4 v4, 0x0

    .line 158
    .local v4, "response":Lcom/worklight/wlclient/api/WLResponse;
    invoke-interface {p1}, Lorg/apache/http/HttpResponse;->getAllHeaders()[Lorg/apache/http/Header;

    move-result-object v6

    iget-object v7, p0, Lcom/worklight/wlclient/AsynchronousRequestSender;->request:Lcom/worklight/wlclient/WLRequest;

    invoke-virtual {v7}, Lcom/worklight/wlclient/WLRequest;->getPostRequest()Lorg/apache/http/client/methods/HttpPost;

    move-result-object v7

    invoke-virtual {v7}, Lorg/apache/http/client/methods/HttpPost;->getURI()Ljava/net/URI;

    move-result-object v7

    invoke-static {v6, v7}, Lcom/worklight/wlclient/WLCookieManager;->handleResponseHeaders([Lorg/apache/http/Header;Ljava/net/URI;)V

    .line 161
    invoke-interface {p1}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;

    move-result-object v6

    invoke-interface {v6}, Lorg/apache/http/StatusLine;->getStatusCode()I

    move-result v6

    const/16 v7, 0xc8

    if-lt v6, v7, :cond_1

    invoke-interface {p1}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;

    move-result-object v6

    invoke-interface {v6}, Lorg/apache/http/StatusLine;->getStatusCode()I

    move-result v6

    const/16 v7, 0x12c

    if-le v6, v7, :cond_5

    .line 162
    :cond_1
    const-string v6, "WL-Challenge-Data"

    invoke-interface {p1, v6}, Lorg/apache/http/HttpResponse;->getFirstHeader(Ljava/lang/String;)Lorg/apache/http/Header;

    move-result-object v1

    .line 163
    .local v1, "challengeHeader":Lorg/apache/http/Header;
    const-string v6, "WL-Instance-Id"

    invoke-interface {p1, v6}, Lorg/apache/http/HttpResponse;->getFirstHeader(Ljava/lang/String;)Lorg/apache/http/Header;

    move-result-object v3

    .line 165
    .local v3, "instanceIdHeader":Lorg/apache/http/Header;
    invoke-interface {p1}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;

    move-result-object v6

    invoke-interface {v6}, Lorg/apache/http/StatusLine;->getStatusCode()I

    move-result v6

    const/16 v7, 0x193

    if-ne v6, v7, :cond_4

    .line 166
    new-instance v5, Lcom/worklight/wlclient/WL403ResponseException;

    invoke-direct {v5}, Lcom/worklight/wlclient/WL403ResponseException;-><init>()V

    .line 168
    .local v5, "wl403ResponseException":Lcom/worklight/wlclient/WL403ResponseException;
    if-eqz v1, :cond_2

    invoke-interface {v1}, Lorg/apache/http/Header;->getValue()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lcom/worklight/common/WLUtils;->isStringEmpty(Ljava/lang/String;)Z

    move-result v6

    if-nez v6, :cond_2

    .line 169
    invoke-interface {v1}, Lorg/apache/http/Header;->getValue()Ljava/lang/String;

    move-result-object v0

    .line 170
    .local v0, "challengeData":Ljava/lang/String;
    invoke-virtual {v5, v0}, Lcom/worklight/wlclient/WL403ResponseException;->setChallengeData(Ljava/lang/String;)V

    .line 172
    .end local v0    # "challengeData":Ljava/lang/String;
    :cond_2
    if-eqz v3, :cond_3

    invoke-interface {v3}, Lorg/apache/http/Header;->getValue()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lcom/worklight/common/WLUtils;->isStringEmpty(Ljava/lang/String;)Z

    move-result v6

    if-nez v6, :cond_3

    .line 173
    invoke-interface {v3}, Lorg/apache/http/Header;->getValue()Ljava/lang/String;

    move-result-object v2

    .line 174
    .local v2, "instanceId":Ljava/lang/String;
    invoke-virtual {v5, v2}, Lcom/worklight/wlclient/WL403ResponseException;->setInstanceAuthData(Ljava/lang/String;)V

    .line 176
    .end local v2    # "instanceId":Ljava/lang/String;
    :cond_3
    throw v5

    .line 180
    .end local v5    # "wl403ResponseException":Lcom/worklight/wlclient/WL403ResponseException;
    :cond_4
    new-instance v4, Lcom/worklight/wlclient/api/WLFailResponse;

    .end local v4    # "response":Lcom/worklight/wlclient/api/WLResponse;
    invoke-direct {v4, p1}, Lcom/worklight/wlclient/api/WLFailResponse;-><init>(Lorg/apache/http/HttpResponse;)V

    .line 181
    .restart local v4    # "response":Lcom/worklight/wlclient/api/WLResponse;
    iget-object v6, p0, Lcom/worklight/wlclient/AsynchronousRequestSender;->request:Lcom/worklight/wlclient/WLRequest;

    invoke-virtual {v6}, Lcom/worklight/wlclient/WLRequest;->getOptions()Lcom/worklight/wlclient/api/WLRequestOptions;

    move-result-object v6

    invoke-virtual {v4, v6}, Lcom/worklight/wlclient/api/WLResponse;->setOptions(Lcom/worklight/wlclient/api/WLRequestOptions;)V

    .line 182
    iget-object v6, p0, Lcom/worklight/wlclient/AsynchronousRequestSender;->request:Lcom/worklight/wlclient/WLRequest;

    invoke-virtual {v6}, Lcom/worklight/wlclient/WLRequest;->getRequestListener()Lcom/worklight/wlclient/WLRequestListener;

    move-result-object v7

    move-object v6, v4

    check-cast v6, Lcom/worklight/wlclient/api/WLFailResponse;

    invoke-interface {v7, v6}, Lcom/worklight/wlclient/WLRequestListener;->onFailure(Lcom/worklight/wlclient/api/WLFailResponse;)V

    .line 183
    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "Response received with bad status "

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4}, Lcom/worklight/wlclient/api/WLResponse;->getStatus()I

    move-result v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, " "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lcom/worklight/common/WLUtils;->debug(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 188
    .end local v1    # "challengeHeader":Lorg/apache/http/Header;
    .end local v3    # "instanceIdHeader":Lorg/apache/http/Header;
    :cond_5
    new-instance v4, Lcom/worklight/wlclient/api/WLResponse;

    .end local v4    # "response":Lcom/worklight/wlclient/api/WLResponse;
    invoke-direct {v4, p1}, Lcom/worklight/wlclient/api/WLResponse;-><init>(Lorg/apache/http/HttpResponse;)V

    .line 189
    .restart local v4    # "response":Lcom/worklight/wlclient/api/WLResponse;
    iget-object v6, p0, Lcom/worklight/wlclient/AsynchronousRequestSender;->request:Lcom/worklight/wlclient/WLRequest;

    invoke-virtual {v6}, Lcom/worklight/wlclient/WLRequest;->getOptions()Lcom/worklight/wlclient/api/WLRequestOptions;

    move-result-object v6

    invoke-virtual {v4, v6}, Lcom/worklight/wlclient/api/WLResponse;->setOptions(Lcom/worklight/wlclient/api/WLRequestOptions;)V

    .line 191
    iget-object v6, p0, Lcom/worklight/wlclient/AsynchronousRequestSender;->request:Lcom/worklight/wlclient/WLRequest;

    invoke-virtual {v6}, Lcom/worklight/wlclient/WLRequest;->getAuthListener()Lcom/worklight/wlclient/api/WLAuthListener;

    move-result-object v6

    if-eqz v6, :cond_6

    iget-object v6, p0, Lcom/worklight/wlclient/AsynchronousRequestSender;->request:Lcom/worklight/wlclient/WLRequest;

    invoke-virtual {v6}, Lcom/worklight/wlclient/WLRequest;->getAuthListener()Lcom/worklight/wlclient/api/WLAuthListener;

    move-result-object v6

    invoke-interface {v6, v4}, Lcom/worklight/wlclient/api/WLAuthListener;->isLoginFormResponse(Lcom/worklight/wlclient/api/WLResponse;)Z

    move-result v6

    if-eqz v6, :cond_6

    .line 192
    iget-object v6, p0, Lcom/worklight/wlclient/AsynchronousRequestSender;->request:Lcom/worklight/wlclient/WLRequest;

    invoke-virtual {v6}, Lcom/worklight/wlclient/WLRequest;->getAuthListener()Lcom/worklight/wlclient/api/WLAuthListener;

    move-result-object v6

    invoke-interface {v6, v4}, Lcom/worklight/wlclient/api/WLAuthListener;->handleLoginResponse(Lcom/worklight/wlclient/api/WLResponse;)V

    .line 198
    :goto_1
    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "Response recived with OK status "

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4}, Lcom/worklight/wlclient/api/WLResponse;->getStatus()I

    move-result v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, " "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lcom/worklight/common/WLUtils;->debug(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 196
    :cond_6
    iget-object v6, p0, Lcom/worklight/wlclient/AsynchronousRequestSender;->request:Lcom/worklight/wlclient/WLRequest;

    invoke-virtual {v6}, Lcom/worklight/wlclient/WLRequest;->getRequestListener()Lcom/worklight/wlclient/WLRequestListener;

    move-result-object v6

    invoke-interface {v6, v4}, Lcom/worklight/wlclient/WLRequestListener;->onSuccess(Lcom/worklight/wlclient/api/WLResponse;)V

    goto :goto_1
.end method

.method private setConnectionTimeout(Lorg/apache/http/client/HttpClient;)V
    .locals 2
    .param p1, "httpClient"    # Lorg/apache/http/client/HttpClient;

    .prologue
    .line 129
    invoke-interface {p1}, Lorg/apache/http/client/HttpClient;->getParams()Lorg/apache/http/params/HttpParams;

    move-result-object v0

    iget-object v1, p0, Lcom/worklight/wlclient/AsynchronousRequestSender;->request:Lcom/worklight/wlclient/WLRequest;

    invoke-virtual {v1}, Lcom/worklight/wlclient/WLRequest;->getOptions()Lcom/worklight/wlclient/api/WLRequestOptions;

    move-result-object v1

    invoke-virtual {v1}, Lcom/worklight/wlclient/api/WLRequestOptions;->getTimeout()I

    move-result v1

    invoke-static {v0, v1}, Lorg/apache/http/params/HttpConnectionParams;->setSoTimeout(Lorg/apache/http/params/HttpParams;I)V

    .line 130
    invoke-interface {p1}, Lorg/apache/http/client/HttpClient;->getParams()Lorg/apache/http/params/HttpParams;

    move-result-object v0

    iget-object v1, p0, Lcom/worklight/wlclient/AsynchronousRequestSender;->request:Lcom/worklight/wlclient/WLRequest;

    invoke-virtual {v1}, Lcom/worklight/wlclient/WLRequest;->getOptions()Lcom/worklight/wlclient/api/WLRequestOptions;

    move-result-object v1

    invoke-virtual {v1}, Lcom/worklight/wlclient/api/WLRequestOptions;->getTimeout()I

    move-result v1

    invoke-static {v0, v1}, Lorg/apache/http/params/HttpConnectionParams;->setConnectionTimeout(Lorg/apache/http/params/HttpParams;I)V

    .line 131
    return-void
.end method

.method private setUserAgentHeader(Lorg/apache/http/client/HttpClient;)V
    .locals 5
    .param p1, "httpClient"    # Lorg/apache/http/client/HttpClient;

    .prologue
    .line 138
    invoke-interface {p1}, Lorg/apache/http/client/HttpClient;->getParams()Lorg/apache/http/params/HttpParams;

    move-result-object v1

    const-string v2, "http.useragent"

    invoke-interface {v1, v2}, Lorg/apache/http/params/HttpParams;->getParameter(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 139
    .local v0, "userAgent":Ljava/lang/String;
    invoke-interface {p1}, Lorg/apache/http/client/HttpClient;->getParams()Lorg/apache/http/params/HttpParams;

    move-result-object v1

    .line 140
    const-string v2, "http.useragent"

    .line 141
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v4, " WLNativeAPI("

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    .line 142
    sget-object v4, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "; "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    .line 143
    sget-object v4, Landroid/os/Build;->DISPLAY:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "; "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    .line 144
    sget-object v4, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "; SDK "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    .line 145
    sget-object v4, Landroid/os/Build$VERSION;->SDK:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "; Android "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    .line 146
    sget-object v4, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, ")"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    .line 141
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 139
    invoke-interface {v1, v2, v3}, Lorg/apache/http/params/HttpParams;->setParameter(Ljava/lang/String;Ljava/lang/Object;)Lorg/apache/http/params/HttpParams;

    .line 148
    return-void
.end method


# virtual methods
.method public run()V
    .locals 17

    .prologue
    .line 48
    new-instance v12, Ljava/lang/StringBuilder;

    const-string v13, "Sending request "

    invoke-direct {v12, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/worklight/wlclient/AsynchronousRequestSender;->request:Lcom/worklight/wlclient/WLRequest;

    invoke-virtual {v13}, Lcom/worklight/wlclient/WLRequest;->getPostRequest()Lorg/apache/http/client/methods/HttpPost;

    move-result-object v13

    invoke-virtual {v13}, Lorg/apache/http/client/methods/HttpPost;->getURI()Ljava/net/URI;

    move-result-object v13

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v12

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Lcom/worklight/common/WLUtils;->debug(Ljava/lang/String;)V

    .line 51
    :try_start_0
    move-object/from16 v0, p0

    iget-object v12, v0, Lcom/worklight/wlclient/AsynchronousRequestSender;->httpClient:Lorg/apache/http/client/HttpClient;

    move-object/from16 v0, p0

    invoke-direct {v0, v12}, Lcom/worklight/wlclient/AsynchronousRequestSender;->setUserAgentHeader(Lorg/apache/http/client/HttpClient;)V

    .line 52
    move-object/from16 v0, p0

    iget-object v12, v0, Lcom/worklight/wlclient/AsynchronousRequestSender;->httpClient:Lorg/apache/http/client/HttpClient;

    move-object/from16 v0, p0

    invoke-direct {v0, v12}, Lcom/worklight/wlclient/AsynchronousRequestSender;->setConnectionTimeout(Lorg/apache/http/client/HttpClient;)V

    .line 53
    move-object/from16 v0, p0

    iget-object v12, v0, Lcom/worklight/wlclient/AsynchronousRequestSender;->request:Lcom/worklight/wlclient/WLRequest;

    invoke-static {v12}, Lcom/worklight/wlclient/WLCookieManager;->addCookies(Lcom/worklight/wlclient/WLRequest;)V

    .line 54
    invoke-direct/range {p0 .. p0}, Lcom/worklight/wlclient/AsynchronousRequestSender;->addInstanceAuthHeader()V

    .line 55
    move-object/from16 v0, p0

    iget-object v12, v0, Lcom/worklight/wlclient/AsynchronousRequestSender;->httpClient:Lorg/apache/http/client/HttpClient;

    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/worklight/wlclient/AsynchronousRequestSender;->request:Lcom/worklight/wlclient/WLRequest;

    invoke-virtual {v13}, Lcom/worklight/wlclient/WLRequest;->getPostRequest()Lorg/apache/http/client/methods/HttpPost;

    move-result-object v13

    move-object/from16 v0, p0

    iget-object v14, v0, Lcom/worklight/wlclient/AsynchronousRequestSender;->request:Lcom/worklight/wlclient/WLRequest;

    invoke-virtual {v14}, Lcom/worklight/wlclient/WLRequest;->getHttpContext()Lorg/apache/http/protocol/HttpContext;

    move-result-object v14

    invoke-interface {v12, v13, v14}, Lorg/apache/http/client/HttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;Lorg/apache/http/protocol/HttpContext;)Lorg/apache/http/HttpResponse;
    :try_end_0
    .catch Ljava/net/SocketTimeoutException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lorg/apache/http/conn/ConnectTimeoutException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Lcom/worklight/wlclient/WL403ResponseException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_4

    move-result-object v5

    .line 58
    .local v5, "httpResponse":Lorg/apache/http/HttpResponse;
    :try_start_1
    move-object/from16 v0, p0

    invoke-direct {v0, v5}, Lcom/worklight/wlclient/AsynchronousRequestSender;->onResponseReceived(Lorg/apache/http/HttpResponse;)V
    :try_end_1
    .catch Lcom/worklight/wlclient/WL403ResponseException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/net/SocketTimeoutException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Lorg/apache/http/conn/ConnectTimeoutException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_4

    .line 112
    .end local v5    # "httpResponse":Lorg/apache/http/HttpResponse;
    :goto_0
    return-void

    .line 61
    .restart local v5    # "httpResponse":Lorg/apache/http/HttpResponse;
    :catch_0
    move-exception v4

    .line 62
    .local v4, "e":Lcom/worklight/wlclient/WL403ResponseException;
    :try_start_2
    invoke-virtual {v4}, Lcom/worklight/wlclient/WL403ResponseException;->getChallengeData()Ljava/lang/String;

    move-result-object v2

    .line 63
    .local v2, "challengeData":Ljava/lang/String;
    invoke-virtual {v4}, Lcom/worklight/wlclient/WL403ResponseException;->getInstanceAuthData()Ljava/lang/String;

    move-result-object v6

    .line 65
    .local v6, "instanceId":Ljava/lang/String;
    invoke-static {v2}, Lcom/worklight/common/WLUtils;->isStringEmpty(Ljava/lang/String;)Z

    move-result v12

    if-nez v12, :cond_0

    .line 66
    const-string v12, "+"

    invoke-virtual {v2, v12}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v11

    .line 67
    .local v11, "seperatorIndex":I
    const/4 v12, 0x0

    invoke-virtual {v2, v12, v11}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    .line 68
    .local v1, "challenge":Ljava/lang/String;
    add-int/lit8 v12, v11, 0x1

    invoke-virtual {v2, v12}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v12

    const-string v13, "-"

    invoke-virtual {v12, v13}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v9

    .line 69
    .local v9, "numbers":[Ljava/lang/String;
    move-object/from16 v0, p0

    iget-object v12, v0, Lcom/worklight/wlclient/AsynchronousRequestSender;->request:Lcom/worklight/wlclient/WLRequest;

    invoke-virtual {v12}, Lcom/worklight/wlclient/WLRequest;->getContext()Landroid/content/Context;

    move-result-object v12

    invoke-static {v12, v9}, Lcom/worklight/utils/SecurityUtils;->kpg(Landroid/content/Context;[Ljava/lang/String;)[B

    move-result-object v12

    const-string v13, "UTF-8"

    invoke-static {v12, v13}, Lcom/worklight/utils/Base64;->encode([BLjava/lang/String;)Ljava/lang/String;

    move-result-object v12

    const-string v13, "\n"

    const-string v14, ""

    invoke-virtual {v12, v13, v14}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 70
    .local v10, "secret":Ljava/lang/String;
    new-instance v12, Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v13

    invoke-static {v13}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v13

    invoke-direct {v12, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    const-string v13, "SHA-1"

    invoke-static {v12, v13}, Lcom/worklight/utils/SecurityUtils;->hashData(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 71
    .local v3, "challengeResponseData":Ljava/lang/String;
    move-object/from16 v0, p0

    iget-object v12, v0, Lcom/worklight/wlclient/AsynchronousRequestSender;->request:Lcom/worklight/wlclient/WLRequest;

    invoke-virtual {v12}, Lcom/worklight/wlclient/WLRequest;->getPostRequest()Lorg/apache/http/client/methods/HttpPost;

    move-result-object v12

    const-string v13, "WL-Challenge-Response-Data"

    invoke-virtual {v12, v13, v3}, Lorg/apache/http/client/methods/HttpPost;->addHeader(Ljava/lang/String;Ljava/lang/String;)V

    .line 75
    .end local v1    # "challenge":Ljava/lang/String;
    .end local v3    # "challengeResponseData":Ljava/lang/String;
    .end local v9    # "numbers":[Ljava/lang/String;
    .end local v10    # "secret":Ljava/lang/String;
    .end local v11    # "seperatorIndex":I
    :cond_0
    invoke-static {v6}, Lcom/worklight/common/WLUtils;->isStringEmpty(Ljava/lang/String;)Z

    move-result v12

    if-nez v12, :cond_1

    .line 76
    invoke-static {v6}, Lcom/worklight/wlclient/WLCookieManager;->setInstanceAuthId(Ljava/lang/String;)V

    .line 79
    :cond_1
    invoke-direct/range {p0 .. p0}, Lcom/worklight/wlclient/AsynchronousRequestSender;->addInstanceAuthHeader()V

    .line 80
    move-object/from16 v0, p0

    iget-object v12, v0, Lcom/worklight/wlclient/AsynchronousRequestSender;->httpClient:Lorg/apache/http/client/HttpClient;

    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/worklight/wlclient/AsynchronousRequestSender;->request:Lcom/worklight/wlclient/WLRequest;

    invoke-virtual {v13}, Lcom/worklight/wlclient/WLRequest;->getPostRequest()Lorg/apache/http/client/methods/HttpPost;

    move-result-object v13

    move-object/from16 v0, p0

    iget-object v14, v0, Lcom/worklight/wlclient/AsynchronousRequestSender;->request:Lcom/worklight/wlclient/WLRequest;

    invoke-virtual {v14}, Lcom/worklight/wlclient/WLRequest;->getHttpContext()Lorg/apache/http/protocol/HttpContext;

    move-result-object v14

    invoke-interface {v12, v13, v14}, Lorg/apache/http/client/HttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;Lorg/apache/http/protocol/HttpContext;)Lorg/apache/http/HttpResponse;

    move-result-object v5

    .line 83
    invoke-interface {v5}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;

    move-result-object v12

    invoke-interface {v12}, Lorg/apache/http/StatusLine;->getStatusCode()I

    move-result v12

    const/16 v13, 0x193

    if-ne v12, v13, :cond_2

    .line 84
    const-string v12, "WL-Instance-Id"

    invoke-interface {v5, v12}, Lorg/apache/http/HttpResponse;->getFirstHeader(Ljava/lang/String;)Lorg/apache/http/Header;

    move-result-object v8

    .line 85
    .local v8, "instanceIdHeader":Lorg/apache/http/Header;
    if-eqz v8, :cond_2

    invoke-interface {v8}, Lorg/apache/http/Header;->getValue()Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Lcom/worklight/common/WLUtils;->isStringEmpty(Ljava/lang/String;)Z

    move-result v12

    if-nez v12, :cond_2

    .line 86
    invoke-interface {v8}, Lorg/apache/http/Header;->getValue()Ljava/lang/String;

    move-result-object v7

    .line 87
    .local v7, "instanceIdData":Ljava/lang/String;
    invoke-static {v7}, Lcom/worklight/common/WLUtils;->isStringEmpty(Ljava/lang/String;)Z

    move-result v12

    if-nez v12, :cond_2

    .line 88
    invoke-static {v7}, Lcom/worklight/wlclient/WLCookieManager;->setInstanceAuthId(Ljava/lang/String;)V

    .line 89
    invoke-direct/range {p0 .. p0}, Lcom/worklight/wlclient/AsynchronousRequestSender;->addInstanceAuthHeader()V

    .line 90
    move-object/from16 v0, p0

    iget-object v12, v0, Lcom/worklight/wlclient/AsynchronousRequestSender;->httpClient:Lorg/apache/http/client/HttpClient;

    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/worklight/wlclient/AsynchronousRequestSender;->request:Lcom/worklight/wlclient/WLRequest;

    invoke-virtual {v13}, Lcom/worklight/wlclient/WLRequest;->getPostRequest()Lorg/apache/http/client/methods/HttpPost;

    move-result-object v13

    move-object/from16 v0, p0

    iget-object v14, v0, Lcom/worklight/wlclient/AsynchronousRequestSender;->request:Lcom/worklight/wlclient/WLRequest;

    invoke-virtual {v14}, Lcom/worklight/wlclient/WLRequest;->getHttpContext()Lorg/apache/http/protocol/HttpContext;

    move-result-object v14

    invoke-interface {v12, v13, v14}, Lorg/apache/http/client/HttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;Lorg/apache/http/protocol/HttpContext;)Lorg/apache/http/HttpResponse;

    move-result-object v5

    .line 94
    .end local v7    # "instanceIdData":Ljava/lang/String;
    .end local v8    # "instanceIdHeader":Lorg/apache/http/Header;
    :cond_2
    move-object/from16 v0, p0

    invoke-direct {v0, v5}, Lcom/worklight/wlclient/AsynchronousRequestSender;->onResponseReceived(Lorg/apache/http/HttpResponse;)V
    :try_end_2
    .catch Ljava/net/SocketTimeoutException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Lorg/apache/http/conn/ConnectTimeoutException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Lcom/worklight/wlclient/WL403ResponseException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_4

    goto/16 :goto_0

    .line 97
    .end local v2    # "challengeData":Ljava/lang/String;
    .end local v4    # "e":Lcom/worklight/wlclient/WL403ResponseException;
    .end local v5    # "httpResponse":Lorg/apache/http/HttpResponse;
    .end local v6    # "instanceId":Ljava/lang/String;
    :catch_1
    move-exception v4

    .line 99
    .local v4, "e":Ljava/net/SocketTimeoutException;
    move-object/from16 v0, p0

    iget-object v12, v0, Lcom/worklight/wlclient/AsynchronousRequestSender;->request:Lcom/worklight/wlclient/WLRequest;

    invoke-virtual {v12}, Lcom/worklight/wlclient/WLRequest;->getRequestListener()Lcom/worklight/wlclient/WLRequestListener;

    move-result-object v12

    new-instance v13, Lcom/worklight/wlclient/api/WLFailResponse;

    sget-object v14, Lcom/worklight/wlclient/api/WLErrorCode;->REQUEST_TIMEOUT:Lcom/worklight/wlclient/api/WLErrorCode;

    sget-object v15, Lcom/worklight/wlclient/api/WLErrorCode;->REQUEST_TIMEOUT:Lcom/worklight/wlclient/api/WLErrorCode;

    invoke-virtual {v15}, Lcom/worklight/wlclient/api/WLErrorCode;->getDescription()Ljava/lang/String;

    move-result-object v15

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/worklight/wlclient/AsynchronousRequestSender;->request:Lcom/worklight/wlclient/WLRequest;

    move-object/from16 v16, v0

    invoke-virtual/range {v16 .. v16}, Lcom/worklight/wlclient/WLRequest;->getOptions()Lcom/worklight/wlclient/api/WLRequestOptions;

    move-result-object v16

    invoke-direct/range {v13 .. v16}, Lcom/worklight/wlclient/api/WLFailResponse;-><init>(Lcom/worklight/wlclient/api/WLErrorCode;Ljava/lang/String;Lcom/worklight/wlclient/api/WLRequestOptions;)V

    invoke-interface {v12, v13}, Lcom/worklight/wlclient/WLRequestListener;->onFailure(Lcom/worklight/wlclient/api/WLFailResponse;)V

    goto/16 :goto_0

    .line 101
    .end local v4    # "e":Ljava/net/SocketTimeoutException;
    :catch_2
    move-exception v4

    .line 103
    .local v4, "e":Lorg/apache/http/conn/ConnectTimeoutException;
    move-object/from16 v0, p0

    iget-object v12, v0, Lcom/worklight/wlclient/AsynchronousRequestSender;->request:Lcom/worklight/wlclient/WLRequest;

    invoke-virtual {v12}, Lcom/worklight/wlclient/WLRequest;->getRequestListener()Lcom/worklight/wlclient/WLRequestListener;

    move-result-object v12

    new-instance v13, Lcom/worklight/wlclient/api/WLFailResponse;

    sget-object v14, Lcom/worklight/wlclient/api/WLErrorCode;->UNRESPONSIVE_HOST:Lcom/worklight/wlclient/api/WLErrorCode;

    sget-object v15, Lcom/worklight/wlclient/api/WLErrorCode;->UNRESPONSIVE_HOST:Lcom/worklight/wlclient/api/WLErrorCode;

    invoke-virtual {v15}, Lcom/worklight/wlclient/api/WLErrorCode;->getDescription()Ljava/lang/String;

    move-result-object v15

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/worklight/wlclient/AsynchronousRequestSender;->request:Lcom/worklight/wlclient/WLRequest;

    move-object/from16 v16, v0

    invoke-virtual/range {v16 .. v16}, Lcom/worklight/wlclient/WLRequest;->getOptions()Lcom/worklight/wlclient/api/WLRequestOptions;

    move-result-object v16

    invoke-direct/range {v13 .. v16}, Lcom/worklight/wlclient/api/WLFailResponse;-><init>(Lcom/worklight/wlclient/api/WLErrorCode;Ljava/lang/String;Lcom/worklight/wlclient/api/WLRequestOptions;)V

    invoke-interface {v12, v13}, Lcom/worklight/wlclient/WLRequestListener;->onFailure(Lcom/worklight/wlclient/api/WLFailResponse;)V

    goto/16 :goto_0

    .line 105
    .end local v4    # "e":Lorg/apache/http/conn/ConnectTimeoutException;
    :catch_3
    move-exception v4

    .line 106
    .local v4, "e":Lcom/worklight/wlclient/WL403ResponseException;
    move-object/from16 v0, p0

    iget-object v12, v0, Lcom/worklight/wlclient/AsynchronousRequestSender;->request:Lcom/worklight/wlclient/WLRequest;

    invoke-virtual {v12}, Lcom/worklight/wlclient/WLRequest;->getRequestListener()Lcom/worklight/wlclient/WLRequestListener;

    move-result-object v12

    new-instance v13, Lcom/worklight/wlclient/api/WLFailResponse;

    sget-object v14, Lcom/worklight/wlclient/api/WLErrorCode;->UNEXPECTED_ERROR:Lcom/worklight/wlclient/api/WLErrorCode;

    sget-object v15, Lcom/worklight/wlclient/api/WLErrorCode;->UNEXPECTED_ERROR:Lcom/worklight/wlclient/api/WLErrorCode;

    invoke-virtual {v15}, Lcom/worklight/wlclient/api/WLErrorCode;->getDescription()Ljava/lang/String;

    move-result-object v15

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/worklight/wlclient/AsynchronousRequestSender;->request:Lcom/worklight/wlclient/WLRequest;

    move-object/from16 v16, v0

    invoke-virtual/range {v16 .. v16}, Lcom/worklight/wlclient/WLRequest;->getOptions()Lcom/worklight/wlclient/api/WLRequestOptions;

    move-result-object v16

    invoke-direct/range {v13 .. v16}, Lcom/worklight/wlclient/api/WLFailResponse;-><init>(Lcom/worklight/wlclient/api/WLErrorCode;Ljava/lang/String;Lcom/worklight/wlclient/api/WLRequestOptions;)V

    invoke-interface {v12, v13}, Lcom/worklight/wlclient/WLRequestListener;->onFailure(Lcom/worklight/wlclient/api/WLFailResponse;)V

    goto/16 :goto_0

    .line 108
    .end local v4    # "e":Lcom/worklight/wlclient/WL403ResponseException;
    :catch_4
    move-exception v4

    .line 110
    .local v4, "e":Ljava/lang/Exception;
    move-object/from16 v0, p0

    iget-object v12, v0, Lcom/worklight/wlclient/AsynchronousRequestSender;->request:Lcom/worklight/wlclient/WLRequest;

    invoke-virtual {v12}, Lcom/worklight/wlclient/WLRequest;->getRequestListener()Lcom/worklight/wlclient/WLRequestListener;

    move-result-object v12

    new-instance v13, Lcom/worklight/wlclient/api/WLFailResponse;

    sget-object v14, Lcom/worklight/wlclient/api/WLErrorCode;->UNEXPECTED_ERROR:Lcom/worklight/wlclient/api/WLErrorCode;

    sget-object v15, Lcom/worklight/wlclient/api/WLErrorCode;->UNEXPECTED_ERROR:Lcom/worklight/wlclient/api/WLErrorCode;

    invoke-virtual {v15}, Lcom/worklight/wlclient/api/WLErrorCode;->getDescription()Ljava/lang/String;

    move-result-object v15

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/worklight/wlclient/AsynchronousRequestSender;->request:Lcom/worklight/wlclient/WLRequest;

    move-object/from16 v16, v0

    invoke-virtual/range {v16 .. v16}, Lcom/worklight/wlclient/WLRequest;->getOptions()Lcom/worklight/wlclient/api/WLRequestOptions;

    move-result-object v16

    invoke-direct/range {v13 .. v16}, Lcom/worklight/wlclient/api/WLFailResponse;-><init>(Lcom/worklight/wlclient/api/WLErrorCode;Ljava/lang/String;Lcom/worklight/wlclient/api/WLRequestOptions;)V

    invoke-interface {v12, v13}, Lcom/worklight/wlclient/WLRequestListener;->onFailure(Lcom/worklight/wlclient/api/WLFailResponse;)V

    goto/16 :goto_0
.end method
