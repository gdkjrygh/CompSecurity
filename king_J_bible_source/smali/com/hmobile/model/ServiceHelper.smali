.class public Lcom/hmobile/model/ServiceHelper;
.super Ljava/lang/Object;
.source "ServiceHelper.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/hmobile/model/ServiceHelper$RequestMethod;
    }
.end annotation


# static fields
.field private static REQUEST_TIMEOUT:I

.field private static volatile _instance:Lcom/hmobile/model/ServiceHelper;


# instance fields
.field m_methodName:Ljava/lang/String;

.field private m_params:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 41
    const/16 v0, 0x2710

    sput v0, Lcom/hmobile/model/ServiceHelper;->REQUEST_TIMEOUT:I

    .line 42
    const/4 v0, 0x0

    sput-object v0, Lcom/hmobile/model/ServiceHelper;->_instance:Lcom/hmobile/model/ServiceHelper;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/hmobile/model/ServiceHelper;->m_methodName:Ljava/lang/String;

    .line 40
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/hmobile/model/ServiceHelper;->m_params:Ljava/util/HashMap;

    .line 32
    return-void
.end method

.method public static Instance()Lcom/hmobile/model/ServiceHelper;
    .locals 2

    .prologue
    .line 45
    sget-object v0, Lcom/hmobile/model/ServiceHelper;->_instance:Lcom/hmobile/model/ServiceHelper;

    if-nez v0, :cond_1

    .line 46
    const-class v1, Lcom/hmobile/model/ServiceHelper;

    monitor-enter v1

    .line 47
    :try_start_0
    sget-object v0, Lcom/hmobile/model/ServiceHelper;->_instance:Lcom/hmobile/model/ServiceHelper;

    if-nez v0, :cond_0

    .line 48
    new-instance v0, Lcom/hmobile/model/ServiceHelper;

    invoke-direct {v0}, Lcom/hmobile/model/ServiceHelper;-><init>()V

    sput-object v0, Lcom/hmobile/model/ServiceHelper;->_instance:Lcom/hmobile/model/ServiceHelper;

    .line 46
    :cond_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 52
    :cond_1
    sget-object v0, Lcom/hmobile/model/ServiceHelper;->_instance:Lcom/hmobile/model/ServiceHelper;

    return-object v0

    .line 46
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method private callService(Ljava/lang/String;Ljava/util/List;)Ljava/lang/String;
    .locals 18
    .param p1, "url"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Lorg/apache/http/NameValuePair;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .prologue
    .line 123
    .local p2, "nameValuePairs":Ljava/util/List;, "Ljava/util/List<Lorg/apache/http/NameValuePair;>;"
    const-string v13, ""

    .line 124
    .local v13, "strResponse":Ljava/lang/String;
    new-instance v5, Lorg/apache/http/impl/client/DefaultHttpClient;

    invoke-direct {v5}, Lorg/apache/http/impl/client/DefaultHttpClient;-><init>()V

    .line 126
    .local v5, "httpclient":Lorg/apache/http/client/HttpClient;
    new-instance v6, Lorg/apache/http/client/methods/HttpPost;

    move-object/from16 v0, p1

    invoke-direct {v6, v0}, Lorg/apache/http/client/methods/HttpPost;-><init>(Ljava/lang/String;)V

    .line 128
    .local v6, "httppost":Lorg/apache/http/client/methods/HttpPost;
    :try_start_0
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    .line 129
    .local v8, "iter":Ljava/util/Iterator;, "Ljava/util/Iterator<Lorg/apache/http/NameValuePair;>;"
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V
    :try_end_0
    .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_3

    .line 132
    .local v1, "arr":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    :goto_0
    :try_start_1
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_3

    move-result v14

    if-nez v14, :cond_1

    .line 141
    :goto_1
    :try_start_2
    invoke-static {}, Lcom/hmobile/common/Utils;->Instance()Lcom/hmobile/common/Utils;

    move-result-object v14

    const-string v15, "&"

    invoke-virtual {v14, v1, v15}, Lcom/hmobile/common/Utils;->join(Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 142
    .local v3, "holder":Ljava/lang/String;
    new-instance v12, Lorg/apache/http/entity/StringEntity;

    invoke-virtual {v3}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object v14

    invoke-direct {v12, v14}, Lorg/apache/http/entity/StringEntity;-><init>(Ljava/lang/String;)V

    .line 145
    .local v12, "se":Lorg/apache/http/entity/StringEntity;
    const-string v14, "Content-Type"

    const-string v15, "application/x-www-form-urlencoded"

    invoke-virtual {v6, v14, v15}, Lorg/apache/http/client/methods/HttpPost;->setHeader(Ljava/lang/String;Ljava/lang/String;)V

    .line 146
    invoke-virtual {v6, v12}, Lorg/apache/http/client/methods/HttpPost;->setEntity(Lorg/apache/http/HttpEntity;)V

    .line 149
    invoke-interface {v5, v6}, Lorg/apache/http/client/HttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;

    move-result-object v4

    .line 153
    .local v4, "httpResponse":Lorg/apache/http/HttpResponse;
    new-instance v11, Lorg/apache/http/impl/client/BasicResponseHandler;

    invoke-direct {v11}, Lorg/apache/http/impl/client/BasicResponseHandler;-><init>()V
    :try_end_2
    .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_3

    .line 155
    .local v11, "responseHandler":Lorg/apache/http/impl/client/BasicResponseHandler;
    if-eqz v4, :cond_0

    .line 157
    :try_start_3
    invoke-virtual {v11, v4}, Lorg/apache/http/impl/client/BasicResponseHandler;->handleResponse(Lorg/apache/http/HttpResponse;)Ljava/lang/String;
    :try_end_3
    .catch Lorg/apache/http/client/HttpResponseException; {:try_start_3 .. :try_end_3} :catch_2
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_4
    .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_3 .. :try_end_3} :catch_1

    move-result-object v13

    .line 169
    .end local v1    # "arr":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    .end local v3    # "holder":Ljava/lang/String;
    .end local v4    # "httpResponse":Lorg/apache/http/HttpResponse;
    .end local v8    # "iter":Ljava/util/Iterator;, "Ljava/util/Iterator<Lorg/apache/http/NameValuePair;>;"
    .end local v11    # "responseHandler":Lorg/apache/http/impl/client/BasicResponseHandler;
    .end local v12    # "se":Lorg/apache/http/entity/StringEntity;
    :cond_0
    :goto_2
    return-object v13

    .line 133
    .restart local v1    # "arr":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    .restart local v8    # "iter":Ljava/util/Iterator;, "Ljava/util/Iterator<Lorg/apache/http/NameValuePair;>;"
    :cond_1
    :try_start_4
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lorg/apache/http/NameValuePair;

    .line 134
    .local v10, "pairs":Lorg/apache/http/NameValuePair;
    invoke-interface {v10}, Lorg/apache/http/NameValuePair;->getName()Ljava/lang/String;

    move-result-object v9

    .line 135
    .local v9, "key":Ljava/lang/String;
    const-string v14, "%s=%s"

    const/4 v15, 0x2

    new-array v15, v15, [Ljava/lang/Object;

    const/16 v16, 0x0

    aput-object v9, v15, v16

    const/16 v16, 0x1

    invoke-interface {v10}, Lorg/apache/http/NameValuePair;->getValue()Ljava/lang/String;

    move-result-object v17

    aput-object v17, v15, v16

    invoke-static {v14, v15}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    .line 136
    .local v7, "item":Ljava/lang/String;
    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0
    .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    goto :goto_0

    .line 138
    .end local v7    # "item":Ljava/lang/String;
    .end local v9    # "key":Ljava/lang/String;
    .end local v10    # "pairs":Lorg/apache/http/NameValuePair;
    :catch_0
    move-exception v2

    .line 139
    .local v2, "e":Ljava/lang/Exception;
    :try_start_5
    invoke-virtual {v2}, Ljava/lang/Exception;->printStackTrace()V
    :try_end_5
    .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_5 .. :try_end_5} :catch_1
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_3

    goto :goto_1

    .line 164
    .end local v1    # "arr":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    .end local v2    # "e":Ljava/lang/Exception;
    .end local v8    # "iter":Ljava/util/Iterator;, "Ljava/util/Iterator<Lorg/apache/http/NameValuePair;>;"
    :catch_1
    move-exception v2

    .line 165
    .local v2, "e":Lorg/apache/http/client/ClientProtocolException;
    invoke-virtual {v2}, Lorg/apache/http/client/ClientProtocolException;->printStackTrace()V

    goto :goto_2

    .line 158
    .end local v2    # "e":Lorg/apache/http/client/ClientProtocolException;
    .restart local v1    # "arr":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    .restart local v3    # "holder":Ljava/lang/String;
    .restart local v4    # "httpResponse":Lorg/apache/http/HttpResponse;
    .restart local v8    # "iter":Ljava/util/Iterator;, "Ljava/util/Iterator<Lorg/apache/http/NameValuePair;>;"
    .restart local v11    # "responseHandler":Lorg/apache/http/impl/client/BasicResponseHandler;
    .restart local v12    # "se":Lorg/apache/http/entity/StringEntity;
    :catch_2
    move-exception v2

    .line 159
    .local v2, "e":Lorg/apache/http/client/HttpResponseException;
    :try_start_6
    invoke-virtual {v2}, Lorg/apache/http/client/HttpResponseException;->printStackTrace()V
    :try_end_6
    .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_6 .. :try_end_6} :catch_1
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_3

    goto :goto_2

    .line 166
    .end local v1    # "arr":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    .end local v2    # "e":Lorg/apache/http/client/HttpResponseException;
    .end local v3    # "holder":Ljava/lang/String;
    .end local v4    # "httpResponse":Lorg/apache/http/HttpResponse;
    .end local v8    # "iter":Ljava/util/Iterator;, "Ljava/util/Iterator<Lorg/apache/http/NameValuePair;>;"
    .end local v11    # "responseHandler":Lorg/apache/http/impl/client/BasicResponseHandler;
    .end local v12    # "se":Lorg/apache/http/entity/StringEntity;
    :catch_3
    move-exception v2

    .line 167
    .local v2, "e":Ljava/io/IOException;
    invoke-virtual {v2}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_2

    .line 160
    .end local v2    # "e":Ljava/io/IOException;
    .restart local v1    # "arr":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    .restart local v3    # "holder":Ljava/lang/String;
    .restart local v4    # "httpResponse":Lorg/apache/http/HttpResponse;
    .restart local v8    # "iter":Ljava/util/Iterator;, "Ljava/util/Iterator<Lorg/apache/http/NameValuePair;>;"
    .restart local v11    # "responseHandler":Lorg/apache/http/impl/client/BasicResponseHandler;
    .restart local v12    # "se":Lorg/apache/http/entity/StringEntity;
    :catch_4
    move-exception v2

    .line 161
    .restart local v2    # "e":Ljava/io/IOException;
    :try_start_7
    invoke-virtual {v2}, Ljava/io/IOException;->printStackTrace()V
    :try_end_7
    .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_7 .. :try_end_7} :catch_1
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_3

    goto :goto_2
.end method

.method private getHttpClient()Lorg/apache/http/impl/client/DefaultHttpClient;
    .locals 4

    .prologue
    .line 64
    new-instance v0, Lorg/apache/http/params/BasicHttpParams;

    invoke-direct {v0}, Lorg/apache/http/params/BasicHttpParams;-><init>()V

    .line 65
    .local v0, "httpParams":Lorg/apache/http/params/HttpParams;
    const-string v2, "http.connection.timeout"

    .line 66
    sget v3, Lcom/hmobile/model/ServiceHelper;->REQUEST_TIMEOUT:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    .line 65
    invoke-interface {v0, v2, v3}, Lorg/apache/http/params/HttpParams;->setParameter(Ljava/lang/String;Ljava/lang/Object;)Lorg/apache/http/params/HttpParams;

    .line 67
    new-instance v1, Lorg/apache/http/impl/client/DefaultHttpClient;

    invoke-direct {v1, v0}, Lorg/apache/http/impl/client/DefaultHttpClient;-><init>(Lorg/apache/http/params/HttpParams;)V

    .line 68
    .local v1, "httpclient":Lorg/apache/http/impl/client/DefaultHttpClient;
    new-instance v2, Lcom/hmobile/model/ServiceHelper$1;

    invoke-direct {v2, p0}, Lcom/hmobile/model/ServiceHelper$1;-><init>(Lcom/hmobile/model/ServiceHelper;)V

    invoke-virtual {v1, v2}, Lorg/apache/http/impl/client/DefaultHttpClient;->setHttpRequestRetryHandler(Lorg/apache/http/client/HttpRequestRetryHandler;)V

    .line 84
    return-object v1
.end method


# virtual methods
.method public addParam(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1
    .param p1, "key"    # Ljava/lang/String;
    .param p2, "value"    # Ljava/lang/Object;

    .prologue
    .line 56
    iget-object v0, p0, Lcom/hmobile/model/ServiceHelper;->m_params:Ljava/util/HashMap;

    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    return-void
.end method

.method public call(Ljava/lang/String;)Ljava/lang/String;
    .locals 10
    .param p1, "url"    # Ljava/lang/String;

    .prologue
    .line 88
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 90
    .local v0, "builder":Ljava/lang/StringBuilder;
    new-instance v4, Lorg/apache/http/impl/client/DefaultHttpClient;

    invoke-direct {v4}, Lorg/apache/http/impl/client/DefaultHttpClient;-><init>()V

    .line 91
    .local v4, "mHttpClient":Lorg/apache/http/impl/client/DefaultHttpClient;
    new-instance v5, Lorg/apache/http/client/methods/HttpGet;

    invoke-direct {v5, p1}, Lorg/apache/http/client/methods/HttpGet;-><init>(Ljava/lang/String;)V

    .line 92
    .local v5, "mHttpGet":Lorg/apache/http/client/methods/HttpGet;
    new-instance v8, Lcom/hmobile/model/ServiceHelper$2;

    invoke-direct {v8, p0}, Lcom/hmobile/model/ServiceHelper$2;-><init>(Lcom/hmobile/model/ServiceHelper;)V

    invoke-virtual {v4, v8}, Lorg/apache/http/impl/client/DefaultHttpClient;->setKeepAliveStrategy(Lorg/apache/http/conn/ConnectionKeepAliveStrategy;)V

    .line 100
    :try_start_0
    invoke-virtual {v4, v5}, Lorg/apache/http/impl/client/DefaultHttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;

    move-result-object v6

    .line 101
    .local v6, "mHttpResponse":Lorg/apache/http/HttpResponse;
    new-instance v8, Ljava/lang/StringBuilder;

    const-string v9, "RESPONSE FROM THE SERVER : "

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 102
    invoke-interface {v6}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;

    move-result-object v9

    invoke-interface {v9}, Lorg/apache/http/StatusLine;->getStatusCode()I

    move-result v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v8

    .line 101
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lcom/hmobile/common/Utils;->LogInfo(Ljava/lang/String;)V

    .line 103
    invoke-interface {v6}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;

    move-result-object v8

    invoke-interface {v8}, Lorg/apache/http/StatusLine;->getStatusCode()I

    move-result v8

    const/16 v9, 0xc8

    if-ne v8, v9, :cond_0

    .line 104
    invoke-interface {v6}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;

    move-result-object v8

    invoke-interface {v8}, Lorg/apache/http/HttpEntity;->getContent()Ljava/io/InputStream;

    move-result-object v1

    .line 105
    .local v1, "content":Ljava/io/InputStream;
    new-instance v7, Ljava/io/BufferedReader;

    .line 106
    new-instance v8, Ljava/io/InputStreamReader;

    invoke-direct {v8, v1}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    .line 105
    invoke-direct {v7, v8}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    .line 108
    .local v7, "reader":Ljava/io/BufferedReader;
    :goto_0
    invoke-virtual {v7}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;
    :try_end_0
    .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v3

    .local v3, "line":Ljava/lang/String;
    if-nez v3, :cond_1

    .line 118
    .end local v1    # "content":Ljava/io/InputStream;
    .end local v3    # "line":Ljava/lang/String;
    .end local v6    # "mHttpResponse":Lorg/apache/http/HttpResponse;
    .end local v7    # "reader":Ljava/io/BufferedReader;
    :cond_0
    :goto_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    return-object v8

    .line 109
    .restart local v1    # "content":Ljava/io/InputStream;
    .restart local v3    # "line":Ljava/lang/String;
    .restart local v6    # "mHttpResponse":Lorg/apache/http/HttpResponse;
    .restart local v7    # "reader":Ljava/io/BufferedReader;
    :cond_1
    :try_start_1
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_1
    .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    .line 112
    .end local v1    # "content":Ljava/io/InputStream;
    .end local v3    # "line":Ljava/lang/String;
    .end local v6    # "mHttpResponse":Lorg/apache/http/HttpResponse;
    .end local v7    # "reader":Ljava/io/BufferedReader;
    :catch_0
    move-exception v2

    .line 113
    .local v2, "e":Lorg/apache/http/client/ClientProtocolException;
    invoke-virtual {v2}, Lorg/apache/http/client/ClientProtocolException;->printStackTrace()V

    goto :goto_1

    .line 114
    .end local v2    # "e":Lorg/apache/http/client/ClientProtocolException;
    :catch_1
    move-exception v2

    .line 115
    .local v2, "e":Ljava/lang/Exception;
    invoke-virtual {v2}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_1
.end method

.method public setParams(Ljava/util/HashMap;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 60
    .local p1, "params":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Object;>;"
    iput-object p1, p0, Lcom/hmobile/model/ServiceHelper;->m_params:Ljava/util/HashMap;

    .line 61
    return-void
.end method
