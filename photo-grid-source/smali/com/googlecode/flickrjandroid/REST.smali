.class public Lcom/googlecode/flickrjandroid/REST;
.super Lcom/googlecode/flickrjandroid/Transport;
.source "SourceFile"


# static fields
.field public static final PATH:Ljava/lang/String; = "/services/rest/"

.field private static final UTF8:Ljava/lang/String; = "UTF-8"


# instance fields
.field private builder:Ljavax/xml/parsers/DocumentBuilder;

.field private proxyAuth:Z

.field private proxyPassword:Ljava/lang/String;

.field private proxyUser:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 59
    invoke-direct {p0}, Lcom/googlecode/flickrjandroid/Transport;-><init>()V

    .line 49
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/googlecode/flickrjandroid/REST;->proxyAuth:Z

    .line 50
    const-string v0, ""

    iput-object v0, p0, Lcom/googlecode/flickrjandroid/REST;->proxyUser:Ljava/lang/String;

    .line 51
    const-string v0, ""

    iput-object v0, p0, Lcom/googlecode/flickrjandroid/REST;->proxyPassword:Ljava/lang/String;

    .line 60
    const-string v0, "REST"

    invoke-virtual {p0, v0}, Lcom/googlecode/flickrjandroid/REST;->setTransportType(Ljava/lang/String;)V

    .line 61
    const-string v0, "api.flickr.com"

    invoke-virtual {p0, v0}, Lcom/googlecode/flickrjandroid/REST;->setHost(Ljava/lang/String;)V

    .line 62
    const-string v0, "/services/rest/"

    invoke-virtual {p0, v0}, Lcom/googlecode/flickrjandroid/REST;->setPath(Ljava/lang/String;)V

    .line 63
    const-class v0, Lcom/googlecode/flickrjandroid/RESTResponse;

    invoke-virtual {p0, v0}, Lcom/googlecode/flickrjandroid/REST;->setResponseClass(Ljava/lang/Class;)V

    .line 64
    invoke-static {}, Ljavax/xml/parsers/DocumentBuilderFactory;->newInstance()Ljavax/xml/parsers/DocumentBuilderFactory;

    move-result-object v0

    .line 65
    invoke-virtual {v0}, Ljavax/xml/parsers/DocumentBuilderFactory;->newDocumentBuilder()Ljavax/xml/parsers/DocumentBuilder;

    move-result-object v0

    iput-object v0, p0, Lcom/googlecode/flickrjandroid/REST;->builder:Ljavax/xml/parsers/DocumentBuilder;

    .line 66
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 75
    invoke-direct {p0}, Lcom/googlecode/flickrjandroid/REST;-><init>()V

    .line 76
    invoke-virtual {p0, p1}, Lcom/googlecode/flickrjandroid/REST;->setHost(Ljava/lang/String;)V

    .line 77
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .prologue
    .line 87
    invoke-direct {p0}, Lcom/googlecode/flickrjandroid/REST;-><init>()V

    .line 88
    invoke-virtual {p0, p1}, Lcom/googlecode/flickrjandroid/REST;->setHost(Ljava/lang/String;)V

    .line 89
    invoke-virtual {p0, p2}, Lcom/googlecode/flickrjandroid/REST;->setPort(I)V

    .line 90
    return-void
.end method

.method public static encodeParameters(Ljava/util/List;)Ljava/lang/String;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/googlecode/flickrjandroid/Parameter;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .prologue
    .line 378
    if-eqz p0, :cond_0

    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 379
    :cond_0
    const-string v0, ""

    .line 390
    :goto_0
    return-object v0

    .line 381
    :cond_1
    new-instance v2, Ljava/lang/StringBuffer;

    invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V

    .line 382
    const/4 v0, 0x0

    move v1, v0

    :goto_1
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    if-lt v1, v0, :cond_2

    .line 390
    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 383
    :cond_2
    if-eqz v1, :cond_3

    .line 384
    const-string v0, "&"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 386
    :cond_3
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/googlecode/flickrjandroid/Parameter;

    .line 387
    invoke-virtual {v0}, Lcom/googlecode/flickrjandroid/Parameter;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/googlecode/flickrjandroid/util/UrlUtilities;->encode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v3

    .line 388
    const-string v4, "="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v3

    invoke-virtual {v0}, Lcom/googlecode/flickrjandroid/Parameter;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/googlecode/flickrjandroid/util/UrlUtilities;->encode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 382
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1
.end method

.method private getInputStream(Ljava/lang/String;Ljava/util/List;)Ljava/io/InputStream;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Lcom/googlecode/flickrjandroid/Parameter;",
            ">;)",
            "Ljava/io/InputStream;"
        }
    .end annotation

    .prologue
    .line 139
    invoke-virtual {p0}, Lcom/googlecode/flickrjandroid/REST;->getHost()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/googlecode/flickrjandroid/REST;->getPort()I

    move-result v1

    invoke-static {v0, v1, p1, p2}, Lcom/googlecode/flickrjandroid/util/UrlUtilities;->buildUrl(Ljava/lang/String;ILjava/lang/String;Ljava/util/List;)Ljava/net/URL;

    move-result-object v0

    .line 143
    invoke-virtual {v0}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v0

    check-cast v0, Ljava/net/HttpURLConnection;

    .line 144
    const-string v1, "Cache-Control"

    const-string v2, "no-cache,max-age=0"

    invoke-virtual {v0, v1, v2}, Ljava/net/HttpURLConnection;->addRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 145
    const-string v1, "Pragma"

    const-string v2, "no-cache"

    invoke-virtual {v0, v1, v2}, Ljava/net/HttpURLConnection;->addRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 146
    const-string v1, "GET"

    invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 147
    iget-boolean v1, p0, Lcom/googlecode/flickrjandroid/REST;->proxyAuth:Z

    if-eqz v1, :cond_0

    .line 149
    const-string v1, "Proxy-Authorization"

    .line 150
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Basic "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/googlecode/flickrjandroid/REST;->getProxyCredentials()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 148
    invoke-virtual {v0, v1, v2}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 153
    :cond_0
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->connect()V

    .line 154
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v0

    return-object v0
.end method

.method private readFromStream(Ljava/io/InputStream;)Ljava/lang/String;
    .locals 3

    .prologue
    .line 337
    const/4 v2, 0x0

    .line 339
    :try_start_0
    new-instance v1, Ljava/io/BufferedReader;

    new-instance v0, Ljava/io/InputStreamReader;

    invoke-direct {v0, p1}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    invoke-direct {v1, v0}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 340
    :try_start_1
    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    .line 342
    :goto_0
    invoke-virtual {v1}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_0

    .line 345
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v0

    .line 347
    invoke-static {p1}, Lcom/googlecode/flickrjandroid/util/IOUtilities;->close(Ljava/io/InputStream;)V

    .line 348
    invoke-static {v1}, Lcom/googlecode/flickrjandroid/util/IOUtilities;->close(Ljava/io/Reader;)V

    .line 345
    return-object v0

    .line 343
    :cond_0
    :try_start_2
    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    .line 346
    :catchall_0
    move-exception v0

    .line 347
    :goto_1
    invoke-static {p1}, Lcom/googlecode/flickrjandroid/util/IOUtilities;->close(Ljava/io/InputStream;)V

    .line 348
    invoke-static {v1}, Lcom/googlecode/flickrjandroid/util/IOUtilities;->close(Ljava/io/Reader;)V

    .line 349
    throw v0

    .line 346
    :catchall_1
    move-exception v0

    move-object v1, v2

    goto :goto_1
.end method

.method private writeParam(Lcom/googlecode/flickrjandroid/Parameter;Ljava/io/DataOutputStream;Ljava/lang/String;)V
    .locals 8

    .prologue
    const/4 v7, 0x1

    const/4 v6, 0x0

    .line 395
    invoke-virtual {p1}, Lcom/googlecode/flickrjandroid/Parameter;->getName()Ljava/lang/String;

    move-result-object v2

    .line 396
    const-string v0, "\r\n"

    invoke-virtual {p2, v0}, Ljava/io/DataOutputStream;->writeBytes(Ljava/lang/String;)V

    .line 397
    instance-of v0, p1, Lcom/googlecode/flickrjandroid/uploader/ImageParameter;

    if-eqz v0, :cond_3

    move-object v0, p1

    .line 398
    check-cast v0, Lcom/googlecode/flickrjandroid/uploader/ImageParameter;

    .line 399
    invoke-virtual {p1}, Lcom/googlecode/flickrjandroid/Parameter;->getValue()Ljava/lang/Object;

    move-result-object v1

    .line 400
    sget-object v3, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v4, "Content-Disposition: form-data; name=\"%s\"; filename=\"%s\";\r\n"

    const/4 v5, 0x2

    new-array v5, v5, [Ljava/lang/Object;

    aput-object v2, v5, v6

    invoke-virtual {v0}, Lcom/googlecode/flickrjandroid/uploader/ImageParameter;->getImageName()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v5, v7

    invoke-static {v3, v4, v5}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2, v2}, Ljava/io/DataOutputStream;->writeBytes(Ljava/lang/String;)V

    .line 401
    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v3, "Content-Type: image/%s\r\n\r\n"

    new-array v4, v7, [Ljava/lang/Object;

    invoke-virtual {v0}, Lcom/googlecode/flickrjandroid/uploader/ImageParameter;->getImageType()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v4, v6

    invoke-static {v2, v3, v4}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/io/DataOutputStream;->writeBytes(Ljava/lang/String;)V

    .line 402
    instance-of v0, v1, Ljava/io/InputStream;

    if-eqz v0, :cond_2

    move-object v0, v1

    .line 403
    check-cast v0, Ljava/io/InputStream;

    .line 404
    const/16 v1, 0x200

    new-array v1, v1, [B

    .line 406
    :goto_0
    invoke-virtual {v0, v1}, Ljava/io/InputStream;->read([B)I

    move-result v2

    const/4 v3, -0x1

    if-ne v2, v3, :cond_1

    .line 417
    :cond_0
    :goto_1
    const-string v0, "\r\n"

    invoke-virtual {p2, v0}, Ljava/io/DataOutputStream;->writeBytes(Ljava/lang/String;)V

    .line 418
    invoke-virtual {p2, p3}, Ljava/io/DataOutputStream;->writeBytes(Ljava/lang/String;)V

    .line 419
    return-void

    .line 407
    :cond_1
    invoke-virtual {p2, v1, v6, v2}, Ljava/io/DataOutputStream;->write([BII)V

    goto :goto_0

    .line 409
    :cond_2
    instance-of v0, v1, [B

    if-eqz v0, :cond_0

    .line 410
    check-cast v1, [B

    invoke-virtual {p2, v1}, Ljava/io/DataOutputStream;->write([B)V

    goto :goto_1

    .line 413
    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Content-Disposition: form-data; name=\""

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\"\r\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/io/DataOutputStream;->writeBytes(Ljava/lang/String;)V

    .line 414
    const-string v0, "Content-Type: text/plain; charset=UTF-8\r\n\r\n"

    invoke-virtual {p2, v0}, Ljava/io/DataOutputStream;->writeBytes(Ljava/lang/String;)V

    .line 415
    invoke-virtual {p1}, Lcom/googlecode/flickrjandroid/Parameter;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const-string v1, "UTF-8"

    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/io/DataOutputStream;->write([B)V

    goto :goto_1
.end method


# virtual methods
.method public get(Ljava/lang/String;Ljava/util/List;)Lcom/googlecode/flickrjandroid/Response;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Lcom/googlecode/flickrjandroid/Parameter;",
            ">;)",
            "Lcom/googlecode/flickrjandroid/Response;"
        }
    .end annotation

    .prologue
    .line 132
    new-instance v0, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v1, "nojsoncallback"

    const-string v2, "1"

    invoke-direct {v0, v1, v2}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {p2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 133
    new-instance v0, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v1, "format"

    const-string v2, "json"

    invoke-direct {v0, v1, v2}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {p2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 134
    invoke-virtual {p0, p1, p2}, Lcom/googlecode/flickrjandroid/REST;->getLine(Ljava/lang/String;Ljava/util/List;)Ljava/lang/String;

    move-result-object v0

    .line 135
    new-instance v1, Lcom/googlecode/flickrjandroid/RESTResponse;

    invoke-direct {v1, v0}, Lcom/googlecode/flickrjandroid/RESTResponse;-><init>(Ljava/lang/String;)V

    return-object v1
.end method

.method public getDataAsMap(Ljava/lang/String;)Ljava/util/Map;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    const/4 v1, 0x0

    .line 200
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 201
    if-eqz p1, :cond_0

    .line 202
    const-string v0, "&"

    invoke-static {p1, v0}, Lcom/googlecode/flickrjandroid/util/StringUtilities;->split(Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v3

    array-length v4, v3

    move v0, v1

    :goto_0
    if-lt v0, v4, :cond_1

    .line 209
    :cond_0
    return-object v2

    .line 202
    :cond_1
    aget-object v5, v3, v0

    .line 203
    const-string v6, "="

    invoke-static {v5, v6}, Lcom/googlecode/flickrjandroid/util/StringUtilities;->split(Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v5

    .line 204
    array-length v6, v5

    const/4 v7, 0x2

    if-ne v6, v7, :cond_2

    .line 205
    aget-object v6, v5, v1

    const/4 v7, 0x1

    aget-object v5, v5, v7

    invoke-interface {v2, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 202
    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method public getLine(Ljava/lang/String;Ljava/util/List;)Ljava/lang/String;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Lcom/googlecode/flickrjandroid/Parameter;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .prologue
    const/4 v2, 0x0

    .line 166
    .line 169
    :try_start_0
    invoke-direct {p0, p1, p2}, Lcom/googlecode/flickrjandroid/REST;->getInputStream(Ljava/lang/String;Ljava/util/List;)Ljava/io/InputStream;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    move-result-object v3

    .line 170
    :try_start_1
    new-instance v1, Ljava/io/BufferedReader;

    new-instance v0, Ljava/io/InputStreamReader;

    const-string v4, "UTF-8"

    invoke-direct {v0, v3, v4}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/lang/String;)V

    invoke-direct {v1, v0}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 171
    :try_start_2
    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    .line 173
    :goto_0
    invoke-virtual {v1}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_0

    .line 177
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-result-object v0

    .line 179
    invoke-static {v3}, Lcom/googlecode/flickrjandroid/util/IOUtilities;->close(Ljava/io/InputStream;)V

    .line 180
    invoke-static {v1}, Lcom/googlecode/flickrjandroid/util/IOUtilities;->close(Ljava/io/Reader;)V

    .line 177
    return-object v0

    .line 174
    :cond_0
    :try_start_3
    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_0

    .line 178
    :catchall_0
    move-exception v0

    move-object v2, v3

    .line 179
    :goto_1
    invoke-static {v2}, Lcom/googlecode/flickrjandroid/util/IOUtilities;->close(Ljava/io/InputStream;)V

    .line 180
    invoke-static {v1}, Lcom/googlecode/flickrjandroid/util/IOUtilities;->close(Ljava/io/Reader;)V

    .line 181
    throw v0

    .line 178
    :catchall_1
    move-exception v0

    move-object v1, v2

    goto :goto_1

    :catchall_2
    move-exception v0

    move-object v1, v2

    move-object v2, v3

    goto :goto_1
.end method

.method public getMapData(ZLjava/lang/String;Ljava/util/List;)Ljava/util/Map;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Lcom/googlecode/flickrjandroid/Parameter;",
            ">;)",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 195
    if-eqz p1, :cond_0

    invoke-virtual {p0, p2, p3}, Lcom/googlecode/flickrjandroid/REST;->getLine(Ljava/lang/String;Ljava/util/List;)Ljava/lang/String;

    move-result-object v0

    .line 196
    :goto_0
    const-string v1, "UTF-8"

    invoke-static {v0, v1}, Ljava/net/URLDecoder;->decode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/googlecode/flickrjandroid/REST;->getDataAsMap(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v0

    return-object v0

    .line 195
    :cond_0
    invoke-virtual {p0, p2, p3}, Lcom/googlecode/flickrjandroid/REST;->sendPost(Ljava/lang/String;Ljava/util/List;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public getProxyCredentials()Ljava/lang/String;
    .locals 3

    .prologue
    .line 372
    new-instance v0, Ljava/lang/String;

    .line 373
    new-instance v1, Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/googlecode/flickrjandroid/REST;->proxyUser:Ljava/lang/String;

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v2, ":"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/googlecode/flickrjandroid/REST;->proxyPassword:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->getBytes()[B

    move-result-object v1

    invoke-static {v1}, Lcom/googlecode/flickrjandroid/util/Base64;->encode([B)[B

    move-result-object v1

    .line 372
    invoke-direct {v0, v1}, Ljava/lang/String;-><init>([B)V

    return-object v0
.end method

.method public isProxyAuth()Z
    .locals 1

    .prologue
    .line 362
    iget-boolean v0, p0, Lcom/googlecode/flickrjandroid/REST;->proxyAuth:Z

    return v0
.end method

.method public post(Ljava/lang/String;Ljava/util/List;)Lcom/googlecode/flickrjandroid/Response;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Lcom/googlecode/flickrjandroid/Parameter;",
            ">;)",
            "Lcom/googlecode/flickrjandroid/Response;"
        }
    .end annotation

    .prologue
    .line 357
    invoke-virtual {p0, p1, p2}, Lcom/googlecode/flickrjandroid/REST;->sendPost(Ljava/lang/String;Ljava/util/List;)Ljava/lang/String;

    move-result-object v0

    .line 358
    new-instance v1, Lcom/googlecode/flickrjandroid/RESTResponse;

    invoke-direct {v1, v0}, Lcom/googlecode/flickrjandroid/RESTResponse;-><init>(Ljava/lang/String;)V

    return-object v1
.end method

.method public sendPost(Ljava/lang/String;Ljava/util/List;)Ljava/lang/String;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Lcom/googlecode/flickrjandroid/Parameter;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .prologue
    const/4 v3, 0x0

    const/16 v4, 0xc8

    .line 282
    .line 286
    :try_start_0
    invoke-virtual {p0}, Lcom/googlecode/flickrjandroid/REST;->getHost()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/googlecode/flickrjandroid/REST;->getPort()I

    move-result v1

    invoke-static {v0, v1, p1}, Lcom/googlecode/flickrjandroid/util/UrlUtilities;->buildPostUrl(Ljava/lang/String;ILjava/lang/String;)Ljava/net/URL;

    move-result-object v0

    .line 290
    invoke-virtual {v0}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v0

    check-cast v0, Ljava/net/HttpURLConnection;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 291
    :try_start_1
    const-string v1, "POST"

    invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 292
    invoke-static {p2}, Lcom/googlecode/flickrjandroid/REST;->encodeParameters(Ljava/util/List;)Ljava/lang/String;

    move-result-object v1

    .line 293
    const-string v2, "UTF-8"

    invoke-virtual {v1, v2}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v1

    .line 294
    const-string v2, "Content-Length"

    array-length v5, v1

    invoke-static {v5}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v2, v5}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 295
    const-string v2, "Content-Type"

    const-string v5, "application/x-www-form-urlencoded"

    invoke-virtual {v0, v2, v5}, Ljava/net/HttpURLConnection;->addRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 296
    const-string v2, "Cache-Control"

    const-string v5, "no-cache,max-age=0"

    invoke-virtual {v0, v2, v5}, Ljava/net/HttpURLConnection;->addRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 297
    const-string v2, "Pragma"

    const-string v5, "no-cache"

    invoke-virtual {v0, v2, v5}, Ljava/net/HttpURLConnection;->addRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 298
    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Ljava/net/HttpURLConnection;->setUseCaches(Z)V

    .line 299
    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Ljava/net/HttpURLConnection;->setDoOutput(Z)V

    .line 300
    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Ljava/net/HttpURLConnection;->setDoInput(Z)V

    .line 301
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->connect()V

    .line 302
    new-instance v2, Ljava/io/DataOutputStream;

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v5

    invoke-direct {v2, v5}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 303
    :try_start_2
    invoke-virtual {v2, v1}, Ljava/io/DataOutputStream;->write([B)V

    .line 304
    invoke-virtual {v2}, Ljava/io/DataOutputStream;->flush()V

    .line 305
    invoke-virtual {v2}, Ljava/io/DataOutputStream;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 309
    :try_start_3
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getResponseCode()I
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    move-result v1

    .line 316
    :goto_0
    if-eq v1, v4, :cond_1

    .line 317
    :try_start_4
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getErrorStream()Ljava/io/InputStream;

    move-result-object v3

    invoke-direct {p0, v3}, Lcom/googlecode/flickrjandroid/REST;->readFromStream(Ljava/io/InputStream;)Ljava/lang/String;

    move-result-object v3

    .line 318
    new-instance v4, Ljava/io/IOException;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "Connection Failed. Response Code: "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 319
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v5, ", Response Message: "

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getResponseMessage()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 320
    const-string v5, ", Error: "

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 318
    invoke-direct {v4, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v4
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 326
    :catchall_0
    move-exception v1

    move-object v3, v0

    move-object v0, v1

    move-object v1, v2

    .line 327
    :goto_1
    invoke-static {v1}, Lcom/googlecode/flickrjandroid/util/IOUtilities;->close(Ljava/io/OutputStream;)V

    .line 328
    if-eqz v3, :cond_0

    .line 329
    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 333
    :cond_0
    throw v0

    .line 312
    :catch_0
    move-exception v1

    :try_start_5
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getErrorStream()Ljava/io/InputStream;

    move-result-object v1

    if-eqz v1, :cond_3

    .line 313
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v1

    goto :goto_0

    .line 323
    :cond_1
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/googlecode/flickrjandroid/REST;->readFromStream(Ljava/io/InputStream;)Ljava/lang/String;

    move-result-object v1

    .line 324
    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    move-result-object v1

    .line 327
    invoke-static {v2}, Lcom/googlecode/flickrjandroid/util/IOUtilities;->close(Ljava/io/OutputStream;)V

    .line 328
    if-eqz v0, :cond_2

    .line 329
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 325
    :cond_2
    return-object v1

    .line 326
    :catchall_1
    move-exception v0

    move-object v1, v3

    goto :goto_1

    :catchall_2
    move-exception v1

    move-object v7, v1

    move-object v1, v3

    move-object v3, v0

    move-object v0, v7

    goto :goto_1

    :cond_3
    move v1, v4

    goto :goto_0
.end method

.method protected sendUpload(Ljava/lang/String;Ljava/util/List;)Lcom/googlecode/flickrjandroid/Response;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Lcom/googlecode/flickrjandroid/Parameter;",
            ">;)",
            "Lcom/googlecode/flickrjandroid/Response;"
        }
    .end annotation

    .prologue
    const/4 v3, 0x0

    const/16 v4, 0xc8

    .line 221
    .line 225
    :try_start_0
    invoke-virtual {p0}, Lcom/googlecode/flickrjandroid/REST;->getHost()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/googlecode/flickrjandroid/REST;->getPort()I

    move-result v1

    invoke-static {v0, v1, p1}, Lcom/googlecode/flickrjandroid/util/UrlUtilities;->buildPostUrl(Ljava/lang/String;ILjava/lang/String;)Ljava/net/URL;

    move-result-object v0

    .line 229
    invoke-virtual {v0}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v0

    check-cast v0, Ljava/net/HttpURLConnection;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 230
    :try_start_1
    const-string v1, "POST"

    invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 231
    const-string v1, "---------------------------7d273f7a0d3"

    .line 232
    const-string v2, "Content-Type"

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "multipart/form-data; boundary="

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v2, v5}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 233
    const-string v2, "Host"

    const-string v5, "api.flickr.com"

    invoke-virtual {v0, v2, v5}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 234
    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Ljava/net/HttpURLConnection;->setDoInput(Z)V

    .line 235
    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Ljava/net/HttpURLConnection;->setDoOutput(Z)V

    .line 236
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->connect()V

    .line 237
    new-instance v2, Ljava/io/DataOutputStream;

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v5

    invoke-direct {v2, v5}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 238
    :try_start_2
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v5, "--"

    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 239
    invoke-virtual {v2, v3}, Ljava/io/DataOutputStream;->writeBytes(Ljava/lang/String;)V

    .line 240
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    .line 241
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-nez v1, :cond_1

    .line 245
    const-string v1, "--\r\n\r\n"

    invoke-virtual {v2, v1}, Ljava/io/DataOutputStream;->writeBytes(Ljava/lang/String;)V

    .line 246
    invoke-virtual {v2}, Ljava/io/DataOutputStream;->flush()V

    .line 247
    invoke-virtual {v2}, Ljava/io/DataOutputStream;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 251
    :try_start_3
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getResponseCode()I
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    move-result v1

    .line 258
    :goto_1
    if-eq v1, v4, :cond_2

    .line 259
    :try_start_4
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getErrorStream()Ljava/io/InputStream;

    move-result-object v3

    invoke-direct {p0, v3}, Lcom/googlecode/flickrjandroid/REST;->readFromStream(Ljava/io/InputStream;)Ljava/lang/String;

    move-result-object v3

    .line 260
    new-instance v4, Ljava/io/IOException;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "Connection Failed. Response Code: "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 261
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v5, ", Response Message: "

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getResponseMessage()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 262
    const-string v5, ", Error: "

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 260
    invoke-direct {v4, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v4
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 268
    :catchall_0
    move-exception v1

    move-object v3, v0

    move-object v0, v1

    move-object v1, v2

    .line 269
    :goto_2
    invoke-static {v1}, Lcom/googlecode/flickrjandroid/util/IOUtilities;->close(Ljava/io/OutputStream;)V

    .line 270
    if-eqz v3, :cond_0

    .line 271
    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 275
    :cond_0
    throw v0

    .line 242
    :cond_1
    :try_start_5
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/googlecode/flickrjandroid/Parameter;

    .line 243
    invoke-direct {p0, v1, v2, v3}, Lcom/googlecode/flickrjandroid/REST;->writeParam(Lcom/googlecode/flickrjandroid/Parameter;Ljava/io/DataOutputStream;Ljava/lang/String;)V

    goto :goto_0

    .line 254
    :catch_0
    move-exception v1

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getErrorStream()Ljava/io/InputStream;

    move-result-object v1

    if-eqz v1, :cond_4

    .line 255
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v1

    goto :goto_1

    .line 264
    :cond_2
    new-instance v1, Lcom/googlecode/flickrjandroid/uploader/UploaderResponse;

    invoke-direct {v1}, Lcom/googlecode/flickrjandroid/uploader/UploaderResponse;-><init>()V

    .line 265
    iget-object v3, p0, Lcom/googlecode/flickrjandroid/REST;->builder:Ljavax/xml/parsers/DocumentBuilder;

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljavax/xml/parsers/DocumentBuilder;->parse(Ljava/io/InputStream;)Lorg/w3c/dom/Document;

    move-result-object v3

    .line 266
    invoke-virtual {v1, v3}, Lcom/googlecode/flickrjandroid/uploader/UploaderResponse;->parse(Lorg/w3c/dom/Document;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 269
    invoke-static {v2}, Lcom/googlecode/flickrjandroid/util/IOUtilities;->close(Ljava/io/OutputStream;)V

    .line 270
    if-eqz v0, :cond_3

    .line 271
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 267
    :cond_3
    return-object v1

    .line 268
    :catchall_1
    move-exception v0

    move-object v1, v3

    goto :goto_2

    :catchall_2
    move-exception v1

    move-object v7, v1

    move-object v1, v3

    move-object v3, v0

    move-object v0, v7

    goto :goto_2

    :cond_4
    move v1, v4

    goto :goto_1
.end method

.method public setProxy(Ljava/lang/String;I)V
    .locals 2

    .prologue
    .line 99
    const-string v0, "http.proxySet"

    const-string v1, "true"

    invoke-static {v0, v1}, Ljava/lang/System;->setProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 100
    const-string v0, "http.proxyHost"

    invoke-static {v0, p1}, Ljava/lang/System;->setProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 101
    const-string v0, "http.proxyPort"

    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Ljava/lang/System;->setProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 102
    return-void
.end method

.method public setProxy(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 116
    invoke-virtual {p0, p1, p2}, Lcom/googlecode/flickrjandroid/REST;->setProxy(Ljava/lang/String;I)V

    .line 117
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/googlecode/flickrjandroid/REST;->proxyAuth:Z

    .line 118
    iput-object p3, p0, Lcom/googlecode/flickrjandroid/REST;->proxyUser:Ljava/lang/String;

    .line 119
    iput-object p4, p0, Lcom/googlecode/flickrjandroid/REST;->proxyPassword:Ljava/lang/String;

    .line 120
    return-void
.end method
