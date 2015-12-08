.class public Lcom/yong/jamendo/api/Caller;
.super Ljava/lang/Object;
.source "Caller.java"


# static fields
.field private static requestCache:Lcom/yong/jamendo/api/RequestCache;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 27
    const/4 v0, 0x0

    sput-object v0, Lcom/yong/jamendo/api/Caller;->requestCache:Lcom/yong/jamendo/api/RequestCache;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static convertStreamToString(Ljava/io/InputStream;)Ljava/lang/String;
    .locals 6
    .param p0, "is"    # Ljava/io/InputStream;

    .prologue
    .line 95
    new-instance v2, Ljava/io/BufferedReader;

    new-instance v4, Ljava/io/InputStreamReader;

    invoke-direct {v4, p0}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    invoke-direct {v2, v4}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    .line 96
    .local v2, "reader":Ljava/io/BufferedReader;
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 98
    .local v3, "sb":Ljava/lang/StringBuilder;
    const/4 v1, 0x0

    .line 100
    .local v1, "line":Ljava/lang/String;
    :goto_0
    :try_start_0
    invoke-virtual {v2}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v1

    if-nez v1, :cond_0

    .line 107
    :try_start_1
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_3

    .line 113
    :goto_1
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    return-object v4

    .line 101
    :cond_0
    :try_start_2
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v5, "\n"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    .line 103
    :catch_0
    move-exception v0

    .line 104
    .local v0, "e":Ljava/io/IOException;
    :try_start_3
    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 107
    :try_start_4
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1

    goto :goto_1

    .line 108
    :catch_1
    move-exception v0

    .line 109
    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_1

    .line 105
    .end local v0    # "e":Ljava/io/IOException;
    :catchall_0
    move-exception v4

    .line 107
    :try_start_5
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_2

    .line 111
    :goto_2
    throw v4

    .line 108
    :catch_2
    move-exception v0

    .line 109
    .restart local v0    # "e":Ljava/io/IOException;
    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_2

    .line 108
    .end local v0    # "e":Ljava/io/IOException;
    :catch_3
    move-exception v0

    .line 109
    .restart local v0    # "e":Ljava/io/IOException;
    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_1
.end method

.method public static createStringFromIds([I)Ljava/lang/String;
    .locals 6
    .param p0, "ids"    # [I

    .prologue
    .line 121
    if-nez p0, :cond_1

    .line 122
    const-string v1, ""

    .line 130
    :cond_0
    return-object v1

    .line 124
    :cond_1
    const-string v1, ""

    .line 126
    .local v1, "query":Ljava/lang/String;
    array-length v3, p0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v3, :cond_0

    aget v0, p0, v2

    .line 127
    .local v0, "id":I
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, "+"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 126
    add-int/lit8 v2, v2, 0x1

    goto :goto_0
.end method

.method public static doGet(Ljava/lang/String;)Ljava/lang/String;
    .locals 15
    .param p0, "url"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/yong/jamendo/api/WSError;
        }
    .end annotation

    .prologue
    .line 38
    const/4 v0, 0x0

    .line 39
    .local v0, "data":Ljava/lang/String;
    sget-object v12, Lcom/yong/jamendo/api/Caller;->requestCache:Lcom/yong/jamendo/api/RequestCache;

    if-eqz v12, :cond_0

    .line 40
    sget-object v12, Lcom/yong/jamendo/api/Caller;->requestCache:Lcom/yong/jamendo/api/RequestCache;

    invoke-virtual {v12, p0}, Lcom/yong/jamendo/api/RequestCache;->get(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 41
    if-eqz v0, :cond_0

    move-object v1, v0

    .line 90
    .end local v0    # "data":Ljava/lang/String;
    .local v1, "data":Ljava/lang/String;
    :goto_0
    return-object v1

    .line 46
    .end local v1    # "data":Ljava/lang/String;
    .restart local v0    # "data":Ljava/lang/String;
    :cond_0
    const/4 v4, 0x0

    .line 47
    .local v4, "encodedUri":Ljava/net/URI;
    const/4 v9, 0x0

    .line 50
    .local v9, "httpGet":Lorg/apache/http/client/methods/HttpGet;
    :try_start_0
    new-instance v5, Ljava/net/URI;

    invoke-direct {v5, p0}, Ljava/net/URI;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/net/URISyntaxException; {:try_start_0 .. :try_end_0} :catch_0

    .line 51
    .end local v4    # "encodedUri":Ljava/net/URI;
    .local v5, "encodedUri":Ljava/net/URI;
    :try_start_1
    new-instance v9, Lorg/apache/http/client/methods/HttpGet;

    .end local v9    # "httpGet":Lorg/apache/http/client/methods/HttpGet;
    invoke-direct {v9, v5}, Lorg/apache/http/client/methods/HttpGet;-><init>(Ljava/net/URI;)V
    :try_end_1
    .catch Ljava/net/URISyntaxException; {:try_start_1 .. :try_end_1} :catch_5

    .restart local v9    # "httpGet":Lorg/apache/http/client/methods/HttpGet;
    move-object v4, v5

    .line 60
    .end local v5    # "encodedUri":Ljava/net/URI;
    .restart local v4    # "encodedUri":Ljava/net/URI;
    :goto_1
    new-instance v7, Lorg/apache/http/impl/client/DefaultHttpClient;

    invoke-direct {v7}, Lorg/apache/http/impl/client/DefaultHttpClient;-><init>()V

    .line 66
    .local v7, "httpClient":Lorg/apache/http/client/HttpClient;
    :try_start_2
    invoke-interface {v7, v9}, Lorg/apache/http/client/HttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;
    :try_end_2
    .catch Ljava/net/UnknownHostException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/net/SocketException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_4

    move-result-object v10

    .line 74
    .local v10, "httpResponse":Lorg/apache/http/HttpResponse;
    :try_start_3
    invoke-interface {v10}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;

    move-result-object v8

    .line 76
    .local v8, "httpEntity":Lorg/apache/http/HttpEntity;
    if-eqz v8, :cond_1

    .line 77
    invoke-interface {v8}, Lorg/apache/http/HttpEntity;->getContent()Ljava/io/InputStream;

    move-result-object v11

    .line 78
    .local v11, "inputStream":Ljava/io/InputStream;
    invoke-static {v11}, Lcom/yong/jamendo/api/Caller;->convertStreamToString(Ljava/io/InputStream;)Ljava/lang/String;

    move-result-object v0

    .line 80
    sget-object v12, Lcom/yong/jamendo/api/Caller;->requestCache:Lcom/yong/jamendo/api/RequestCache;

    if-eqz v12, :cond_1

    .line 81
    sget-object v12, Lcom/yong/jamendo/api/Caller;->requestCache:Lcom/yong/jamendo/api/RequestCache;

    invoke-virtual {v12, p0, v0}, Lcom/yong/jamendo/api/RequestCache;->put(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_3
    .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_3 .. :try_end_3} :catch_2
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_4

    .end local v8    # "httpEntity":Lorg/apache/http/HttpEntity;
    .end local v10    # "httpResponse":Lorg/apache/http/HttpResponse;
    .end local v11    # "inputStream":Ljava/io/InputStream;
    :cond_1
    :goto_2
    move-object v1, v0

    .line 90
    .end local v0    # "data":Ljava/lang/String;
    .restart local v1    # "data":Ljava/lang/String;
    goto :goto_0

    .line 52
    .end local v1    # "data":Ljava/lang/String;
    .end local v7    # "httpClient":Lorg/apache/http/client/HttpClient;
    .restart local v0    # "data":Ljava/lang/String;
    :catch_0
    move-exception v3

    .line 54
    .end local v9    # "httpGet":Lorg/apache/http/client/methods/HttpGet;
    .local v3, "e1":Ljava/net/URISyntaxException;
    :goto_3
    const/16 v12, 0x20

    const/16 v13, 0x2b

    invoke-virtual {p0, v12, v13}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v6

    .line 55
    .local v6, "encodedUrl":Ljava/lang/String;
    new-instance v9, Lorg/apache/http/client/methods/HttpGet;

    invoke-direct {v9, v6}, Lorg/apache/http/client/methods/HttpGet;-><init>(Ljava/lang/String;)V

    .line 56
    .restart local v9    # "httpGet":Lorg/apache/http/client/methods/HttpGet;
    invoke-virtual {v3}, Ljava/net/URISyntaxException;->printStackTrace()V

    goto :goto_1

    .line 67
    .end local v3    # "e1":Ljava/net/URISyntaxException;
    .end local v6    # "encodedUrl":Ljava/lang/String;
    .restart local v7    # "httpClient":Lorg/apache/http/client/HttpClient;
    :catch_1
    move-exception v2

    .line 68
    .local v2, "e":Ljava/net/UnknownHostException;
    :try_start_4
    new-instance v12, Lcom/yong/jamendo/api/WSError;

    new-instance v13, Ljava/lang/StringBuilder;

    const-string v14, "Unable to access "

    invoke-direct {v13, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/net/UnknownHostException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v13

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    invoke-direct {v12, v13}, Lcom/yong/jamendo/api/WSError;-><init>(Ljava/lang/String;)V

    throw v12
    :try_end_4
    .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_4 .. :try_end_4} :catch_2
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_4

    .line 85
    .end local v2    # "e":Ljava/net/UnknownHostException;
    :catch_2
    move-exception v2

    .line 86
    .local v2, "e":Lorg/apache/http/client/ClientProtocolException;
    invoke-virtual {v2}, Lorg/apache/http/client/ClientProtocolException;->printStackTrace()V

    goto :goto_2

    .line 69
    .end local v2    # "e":Lorg/apache/http/client/ClientProtocolException;
    :catch_3
    move-exception v2

    .line 70
    .local v2, "e":Ljava/net/SocketException;
    :try_start_5
    new-instance v12, Lcom/yong/jamendo/api/WSError;

    invoke-virtual {v2}, Ljava/net/SocketException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v13

    invoke-direct {v12, v13}, Lcom/yong/jamendo/api/WSError;-><init>(Ljava/lang/String;)V

    throw v12
    :try_end_5
    .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_5 .. :try_end_5} :catch_2
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_4

    .line 87
    .end local v2    # "e":Ljava/net/SocketException;
    :catch_4
    move-exception v2

    .line 88
    .local v2, "e":Ljava/io/IOException;
    invoke-virtual {v2}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_2

    .line 52
    .end local v2    # "e":Ljava/io/IOException;
    .end local v4    # "encodedUri":Ljava/net/URI;
    .end local v7    # "httpClient":Lorg/apache/http/client/HttpClient;
    .end local v9    # "httpGet":Lorg/apache/http/client/methods/HttpGet;
    .restart local v5    # "encodedUri":Ljava/net/URI;
    :catch_5
    move-exception v3

    move-object v4, v5

    .end local v5    # "encodedUri":Ljava/net/URI;
    .restart local v4    # "encodedUri":Ljava/net/URI;
    goto :goto_3
.end method

.method public static setRequestCache(Lcom/yong/jamendo/api/RequestCache;)V
    .locals 0
    .param p0, "requestCache"    # Lcom/yong/jamendo/api/RequestCache;

    .prologue
    .line 117
    sput-object p0, Lcom/yong/jamendo/api/Caller;->requestCache:Lcom/yong/jamendo/api/RequestCache;

    .line 118
    return-void
.end method
