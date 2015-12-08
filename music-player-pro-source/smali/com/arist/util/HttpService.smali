.class public Lcom/arist/util/HttpService;
.super Ljava/lang/Object;
.source "HttpService.java"


# static fields
.field public static final METHOD_GET:I = 0x1

.field public static final METHOD_POST:I = 0x2

.field public static cachedTime:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 135
    const-wide/16 v0, -0x1

    sput-wide v0, Lcom/arist/util/HttpService;->cachedTime:J

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static checkNet(Landroid/app/Activity;)Z
    .locals 5
    .param p0, "act"    # Landroid/app/Activity;

    .prologue
    const/4 v2, 0x0

    .line 123
    invoke-virtual {p0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v3

    .line 124
    const-string v4, "connectivity"

    invoke-virtual {v3, v4}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    .line 123
    check-cast v0, Landroid/net/ConnectivityManager;

    .line 125
    .local v0, "manager":Landroid/net/ConnectivityManager;
    if-nez v0, :cond_1

    .line 132
    :cond_0
    :goto_0
    return v2

    .line 128
    :cond_1
    invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v1

    .line 129
    .local v1, "networkinfo":Landroid/net/NetworkInfo;
    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroid/net/NetworkInfo;->isAvailable()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 132
    const/4 v2, 0x1

    goto :goto_0
.end method

.method public static getBytes(Ljava/lang/String;Ljava/util/ArrayList;I)[B
    .locals 2
    .param p0, "uri"    # Ljava/lang/String;
    .param p2, "method"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/ArrayList",
            "<",
            "Lorg/apache/http/message/BasicNameValuePair;",
            ">;I)[B"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 115
    .local p1, "params":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lorg/apache/http/message/BasicNameValuePair;>;"
    invoke-static {p0, p1, p2}, Lcom/arist/util/HttpService;->getEntity(Ljava/lang/String;Ljava/util/ArrayList;I)Lorg/apache/http/HttpEntity;

    move-result-object v0

    .line 116
    .local v0, "entity":Lorg/apache/http/HttpEntity;
    if-eqz v0, :cond_0

    .line 117
    invoke-static {v0}, Lorg/apache/http/util/EntityUtils;->toByteArray(Lorg/apache/http/HttpEntity;)[B

    move-result-object v1

    .line 118
    :goto_0
    return-object v1

    :cond_0
    const/4 v1, 0x0

    goto :goto_0
.end method

.method public static getEntity(Ljava/lang/String;Ljava/util/ArrayList;I)Lorg/apache/http/HttpEntity;
    .locals 9
    .param p0, "uri"    # Ljava/lang/String;
    .param p2, "method"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/ArrayList",
            "<",
            "Lorg/apache/http/message/BasicNameValuePair;",
            ">;I)",
            "Lorg/apache/http/HttpEntity;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 36
    .local p1, "params":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lorg/apache/http/message/BasicNameValuePair;>;"
    new-instance v0, Lorg/apache/http/impl/client/DefaultHttpClient;

    invoke-direct {v0}, Lorg/apache/http/impl/client/DefaultHttpClient;-><init>()V

    .line 42
    .local v0, "client":Lorg/apache/http/client/HttpClient;
    invoke-interface {v0}, Lorg/apache/http/client/HttpClient;->getParams()Lorg/apache/http/params/HttpParams;

    move-result-object v6

    const-string v7, "http.connection.timeout"

    const/16 v8, 0xbb8

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v6, v7, v8}, Lorg/apache/http/params/HttpParams;->setParameter(Ljava/lang/String;Ljava/lang/Object;)Lorg/apache/http/params/HttpParams;

    .line 45
    const/4 v3, 0x0

    .line 46
    .local v3, "request":Lorg/apache/http/client/methods/HttpUriRequest;
    packed-switch p2, :pswitch_data_0

    .line 70
    :cond_0
    :goto_0
    invoke-interface {v0, v3}, Lorg/apache/http/client/HttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;

    move-result-object v4

    .line 72
    .local v4, "response":Lorg/apache/http/HttpResponse;
    invoke-interface {v4}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;

    move-result-object v6

    invoke-interface {v6}, Lorg/apache/http/StatusLine;->getStatusCode()I

    move-result v6

    const/16 v7, 0xc8

    if-ne v6, v7, :cond_3

    .line 73
    invoke-interface {v4}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;

    move-result-object v6

    .line 75
    :goto_1
    return-object v6

    .line 48
    .end local v4    # "response":Lorg/apache/http/HttpResponse;
    :pswitch_0
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, p0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 49
    .local v5, "sb":Ljava/lang/StringBuilder;
    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v6

    if-nez v6, :cond_1

    .line 50
    const/16 v6, 0x3f

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 51
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_2
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-nez v7, :cond_2

    .line 55
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->length()I

    move-result v6

    add-int/lit8 v6, v6, -0x1

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->deleteCharAt(I)Ljava/lang/StringBuilder;

    .line 57
    :cond_1
    new-instance v3, Lorg/apache/http/client/methods/HttpGet;

    .end local v3    # "request":Lorg/apache/http/client/methods/HttpUriRequest;
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v3, v6}, Lorg/apache/http/client/methods/HttpGet;-><init>(Ljava/lang/String;)V

    .line 58
    .restart local v3    # "request":Lorg/apache/http/client/methods/HttpUriRequest;
    goto :goto_0

    .line 51
    :cond_2
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/apache/http/message/BasicNameValuePair;

    .line 52
    .local v1, "pair":Lorg/apache/http/message/BasicNameValuePair;
    invoke-virtual {v1}, Lorg/apache/http/message/BasicNameValuePair;->getName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    const/16 v8, 0x3d

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v7

    .line 53
    invoke-virtual {v1}, Lorg/apache/http/message/BasicNameValuePair;->getValue()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    const/16 v8, 0x26

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_2

    .line 61
    .end local v1    # "pair":Lorg/apache/http/message/BasicNameValuePair;
    .end local v5    # "sb":Ljava/lang/StringBuilder;
    :pswitch_1
    new-instance v3, Lorg/apache/http/client/methods/HttpPost;

    .end local v3    # "request":Lorg/apache/http/client/methods/HttpUriRequest;
    invoke-direct {v3, p0}, Lorg/apache/http/client/methods/HttpPost;-><init>(Ljava/lang/String;)V

    .line 62
    .restart local v3    # "request":Lorg/apache/http/client/methods/HttpUriRequest;
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v6

    if-nez v6, :cond_0

    .line 63
    new-instance v2, Lorg/apache/http/client/entity/UrlEncodedFormEntity;

    invoke-direct {v2, p1}, Lorg/apache/http/client/entity/UrlEncodedFormEntity;-><init>(Ljava/util/List;)V

    .local v2, "reqEntity":Lorg/apache/http/client/entity/UrlEncodedFormEntity;
    move-object v6, v3

    .line 65
    check-cast v6, Lorg/apache/http/client/methods/HttpPost;

    invoke-virtual {v6, v2}, Lorg/apache/http/client/methods/HttpPost;->setEntity(Lorg/apache/http/HttpEntity;)V

    goto :goto_0

    .line 75
    .end local v2    # "reqEntity":Lorg/apache/http/client/entity/UrlEncodedFormEntity;
    .restart local v4    # "response":Lorg/apache/http/HttpResponse;
    :cond_3
    const/4 v6, 0x0

    goto :goto_1

    .line 46
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public static getLength(Ljava/lang/String;Ljava/util/ArrayList;I)J
    .locals 4
    .param p0, "path"    # Ljava/lang/String;
    .param p2, "method"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/ArrayList",
            "<",
            "Lorg/apache/http/message/BasicNameValuePair;",
            ">;I)J"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 80
    .local p1, "params":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lorg/apache/http/message/BasicNameValuePair;>;"
    const-wide/16 v2, 0x0

    .line 81
    .local v2, "length":J
    invoke-static {p0, p1, p2}, Lcom/arist/util/HttpService;->getEntity(Ljava/lang/String;Ljava/util/ArrayList;I)Lorg/apache/http/HttpEntity;

    move-result-object v0

    .line 82
    .local v0, "entity":Lorg/apache/http/HttpEntity;
    if-eqz v0, :cond_0

    .line 83
    invoke-interface {v0}, Lorg/apache/http/HttpEntity;->getContentLength()J

    move-result-wide v2

    .line 85
    :cond_0
    return-wide v2
.end method

.method public static getLength(Lorg/apache/http/HttpEntity;)J
    .locals 2
    .param p0, "entity"    # Lorg/apache/http/HttpEntity;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 89
    const-wide/16 v0, 0x0

    .line 90
    .local v0, "length":J
    if-eqz p0, :cond_0

    .line 91
    invoke-interface {p0}, Lorg/apache/http/HttpEntity;->getContentLength()J

    move-result-wide v0

    .line 93
    :cond_0
    return-wide v0
.end method

.method public static getStream(Ljava/lang/String;Ljava/util/ArrayList;I)Ljava/io/InputStream;
    .locals 2
    .param p0, "uri"    # Ljava/lang/String;
    .param p2, "method"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/ArrayList",
            "<",
            "Lorg/apache/http/message/BasicNameValuePair;",
            ">;I)",
            "Ljava/io/InputStream;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 101
    .local p1, "params":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lorg/apache/http/message/BasicNameValuePair;>;"
    invoke-static {p0, p1, p2}, Lcom/arist/util/HttpService;->getEntity(Ljava/lang/String;Ljava/util/ArrayList;I)Lorg/apache/http/HttpEntity;

    move-result-object v0

    .line 102
    .local v0, "entity":Lorg/apache/http/HttpEntity;
    if-eqz v0, :cond_0

    .line 103
    invoke-interface {v0}, Lorg/apache/http/HttpEntity;->getContent()Ljava/io/InputStream;

    move-result-object v1

    .line 104
    :goto_0
    return-object v1

    :cond_0
    const/4 v1, 0x0

    goto :goto_0
.end method

.method public static getStream(Lorg/apache/http/HttpEntity;)Ljava/io/InputStream;
    .locals 1
    .param p0, "entity"    # Lorg/apache/http/HttpEntity;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 107
    if-eqz p0, :cond_0

    .line 108
    invoke-interface {p0}, Lorg/apache/http/HttpEntity;->getContent()Ljava/io/InputStream;

    move-result-object v0

    .line 109
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static mtimeToLong(Ljava/lang/String;)J
    .locals 10
    .param p0, "time"    # Ljava/lang/String;

    .prologue
    .line 137
    new-instance v1, Ljava/text/SimpleDateFormat;

    const-string v6, "yyyy-MM-dd HH:mm:ss.SSS"

    invoke-direct {v1, v6}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 139
    .local v1, "format":Ljava/text/SimpleDateFormat;
    :try_start_0
    invoke-virtual {v1, p0}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v0

    .line 140
    .local v0, "date":Ljava/util/Date;
    sget-wide v6, Lcom/arist/util/HttpService;->cachedTime:J

    const-wide/16 v8, -0x1

    cmp-long v6, v6, v8

    if-nez v6, :cond_0

    .line 142
    new-instance v3, Ljava/text/SimpleDateFormat;

    const-string v6, "yyyy-MM-dd HH:mm:ss.SSSz"

    invoke-direct {v3, v6}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 143
    .local v3, "localFormat":Ljava/text/SimpleDateFormat;
    invoke-virtual {v3, p0}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v2

    .line 144
    .local v2, "localDate":Ljava/util/Date;
    invoke-virtual {v2}, Ljava/util/Date;->getTime()J

    move-result-wide v4

    .line 145
    .local v4, "localTime":J
    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v6

    sub-long v6, v4, v6

    sput-wide v6, Lcom/arist/util/HttpService;->cachedTime:J

    .line 151
    .end local v0    # "date":Ljava/util/Date;
    .end local v2    # "localDate":Ljava/util/Date;
    .end local v3    # "localFormat":Ljava/text/SimpleDateFormat;
    .end local v4    # "localTime":J
    :goto_0
    return-wide v4

    .line 148
    .restart local v0    # "date":Ljava/util/Date;
    :cond_0
    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v6

    sget-wide v8, Lcom/arist/util/HttpService;->cachedTime:J
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    add-long v4, v6, v8

    goto :goto_0

    .line 150
    .end local v0    # "date":Ljava/util/Date;
    :catch_0
    move-exception v6

    .line 151
    const-wide/16 v4, 0x0

    goto :goto_0
.end method
