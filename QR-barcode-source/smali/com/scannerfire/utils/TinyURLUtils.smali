.class public abstract Lcom/scannerfire/utils/TinyURLUtils;
.super Ljava/lang/Object;
.source "TinyURLUtils.java"


# static fields
.field private static tinyUrl:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    return-void
.end method

.method public static getTinyUrl(Ljava/lang/String;)Ljava/lang/String;
    .locals 8
    .param p0, "s"    # Ljava/lang/String;

    .prologue
    .line 25
    new-instance v2, Lorg/apache/http/impl/client/DefaultHttpClient;

    invoke-direct {v2}, Lorg/apache/http/impl/client/DefaultHttpClient;-><init>()V

    .line 26
    .local v2, "defaulthttpclient":Lorg/apache/http/impl/client/DefaultHttpClient;
    new-instance v3, Lorg/apache/http/client/methods/HttpPost;

    const-string v6, "http://tinyurl.com/api-create.php"

    invoke-direct {v3, v6}, Lorg/apache/http/client/methods/HttpPost;-><init>(Ljava/lang/String;)V

    .line 27
    .local v3, "httppost":Lorg/apache/http/client/methods/HttpPost;
    new-instance v0, Ljava/util/ArrayList;

    const/4 v6, 0x2

    invoke-direct {v0, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 28
    .local v0, "arraylist":Ljava/util/ArrayList;
    new-instance v6, Lorg/apache/http/message/BasicNameValuePair;

    const-string v7, "url"

    invoke-direct {v6, v7, p0}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 31
    :try_start_0
    new-instance v6, Lorg/apache/http/client/entity/UrlEncodedFormEntity;

    invoke-direct {v6, v0}, Lorg/apache/http/client/entity/UrlEncodedFormEntity;-><init>(Ljava/util/List;)V

    invoke-virtual {v3, v6}, Lorg/apache/http/client/methods/HttpPost;->setEntity(Lorg/apache/http/HttpEntity;)V

    .line 32
    invoke-virtual {v2, v3}, Lorg/apache/http/impl/client/DefaultHttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;

    move-result-object v6

    invoke-interface {v6}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;

    move-result-object v6

    invoke-static {v6}, Lorg/apache/http/util/EntityUtils;->toString(Lorg/apache/http/HttpEntity;)Ljava/lang/String;

    move-result-object v6

    sput-object v6, Lcom/scannerfire/utils/TinyURLUtils;->tinyUrl:Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2

    .line 49
    :goto_0
    sget-object v6, Lcom/scannerfire/utils/TinyURLUtils;->tinyUrl:Ljava/lang/String;

    return-object v6

    .line 34
    :catch_0
    move-exception v5

    .line 36
    .local v5, "unsupportedencodingexception":Ljava/io/UnsupportedEncodingException;
    const-string v6, "Problem"

    sput-object v6, Lcom/scannerfire/utils/TinyURLUtils;->tinyUrl:Ljava/lang/String;

    .line 37
    invoke-virtual {v5}, Ljava/io/UnsupportedEncodingException;->printStackTrace()V

    goto :goto_0

    .line 39
    .end local v5    # "unsupportedencodingexception":Ljava/io/UnsupportedEncodingException;
    :catch_1
    move-exception v1

    .line 41
    .local v1, "clientprotocolexception":Lorg/apache/http/client/ClientProtocolException;
    const-string v6, "ClientProtocolProblem"

    sput-object v6, Lcom/scannerfire/utils/TinyURLUtils;->tinyUrl:Ljava/lang/String;

    .line 42
    invoke-virtual {v1}, Lorg/apache/http/client/ClientProtocolException;->printStackTrace()V

    goto :goto_0

    .line 44
    .end local v1    # "clientprotocolexception":Lorg/apache/http/client/ClientProtocolException;
    :catch_2
    move-exception v4

    .line 46
    .local v4, "ioexception":Ljava/io/IOException;
    const-string v6, "IOException"

    sput-object v6, Lcom/scannerfire/utils/TinyURLUtils;->tinyUrl:Ljava/lang/String;

    .line 47
    invoke-virtual {v4}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_0
.end method
