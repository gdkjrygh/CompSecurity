.class public final Lcom/splunk/mint/network/http/MonitorableHttpsURLConnection;
.super Ljavax/net/ssl/HttpsURLConnection;
.source "MonitorableHttpsURLConnection.java"


# instance fields
.field private final connectionName:Ljava/lang/String;

.field private mInputStreamMonitor:Lcom/splunk/mint/network/io/InputStreamMonitor;

.field private mInputStreamMonitorKitKat:Lcom/splunk/mint/network/io/InputStreamMonitorKitKat;

.field private mOutputStreamMonitor:Lcom/splunk/mint/network/io/OutputStreamMonitor;

.field private original:Ljava/net/URLConnection;

.field private final registry:Lcom/splunk/mint/network/MonitorRegistry;

.field private final timer:Lcom/splunk/mint/network/Timer;


# direct methods
.method public constructor <init>(Lcom/splunk/mint/network/MonitorRegistry;Ljava/net/URLConnection;)V
    .locals 7
    .param p1, "registry"    # Lcom/splunk/mint/network/MonitorRegistry;
    .param p2, "original"    # Ljava/net/URLConnection;

    .prologue
    const/4 v1, 0x0

    .line 40
    invoke-virtual {p2}, Ljava/net/URLConnection;->getURL()Ljava/net/URL;

    move-result-object v0

    invoke-direct {p0, v0}, Ljavax/net/ssl/HttpsURLConnection;-><init>(Ljava/net/URL;)V

    .line 34
    iput-object v1, p0, Lcom/splunk/mint/network/http/MonitorableHttpsURLConnection;->mInputStreamMonitor:Lcom/splunk/mint/network/io/InputStreamMonitor;

    .line 35
    iput-object v1, p0, Lcom/splunk/mint/network/http/MonitorableHttpsURLConnection;->mOutputStreamMonitor:Lcom/splunk/mint/network/io/OutputStreamMonitor;

    .line 37
    iput-object v1, p0, Lcom/splunk/mint/network/http/MonitorableHttpsURLConnection;->mInputStreamMonitorKitKat:Lcom/splunk/mint/network/io/InputStreamMonitorKitKat;

    .line 42
    iput-object p1, p0, Lcom/splunk/mint/network/http/MonitorableHttpsURLConnection;->registry:Lcom/splunk/mint/network/MonitorRegistry;

    .line 43
    iput-object p2, p0, Lcom/splunk/mint/network/http/MonitorableHttpsURLConnection;->original:Ljava/net/URLConnection;

    .line 44
    iget-object v0, p0, Lcom/splunk/mint/network/http/MonitorableHttpsURLConnection;->url:Ljava/net/URL;

    invoke-virtual {v0}, Ljava/net/URL;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/splunk/mint/network/http/MonitorableHttpsURLConnection;->connectionName:Ljava/lang/String;

    .line 45
    new-instance v0, Lcom/splunk/mint/network/Timer;

    iget-object v1, p0, Lcom/splunk/mint/network/http/MonitorableHttpsURLConnection;->connectionName:Ljava/lang/String;

    invoke-direct {v0, v1}, Lcom/splunk/mint/network/Timer;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/splunk/mint/network/http/MonitorableHttpsURLConnection;->timer:Lcom/splunk/mint/network/Timer;

    .line 46
    invoke-static {}, Lcom/splunk/mint/network/NetLogManager;->getInstance()Lcom/splunk/mint/network/NetLogManager;

    move-result-object v1

    invoke-virtual {p2}, Ljava/net/URLConnection;->getURL()Ljava/net/URL;

    move-result-object v0

    invoke-virtual {v0}, Ljava/net/URL;->toExternalForm()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2}, Ljava/net/URLConnection;->getURL()Ljava/net/URL;

    move-result-object v0

    invoke-virtual {v0}, Ljava/net/URL;->toExternalForm()Ljava/lang/String;

    move-result-object v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    const-string v6, "HTTPS"

    invoke-virtual/range {v1 .. v6}, Lcom/splunk/mint/network/NetLogManager;->startNetworkCall(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V

    .line 48
    return-void
.end method


# virtual methods
.method public addRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .param p1, "field"    # Ljava/lang/String;
    .param p2, "newValue"    # Ljava/lang/String;

    .prologue
    .line 133
    iget-object v0, p0, Lcom/splunk/mint/network/http/MonitorableHttpsURLConnection;->original:Ljava/net/URLConnection;

    invoke-virtual {v0, p1, p2}, Ljava/net/URLConnection;->addRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 134
    return-void
.end method

.method public connect()V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 113
    :try_start_0
    iget-object v1, p0, Lcom/splunk/mint/network/http/MonitorableHttpsURLConnection;->timer:Lcom/splunk/mint/network/Timer;

    invoke-virtual {v1}, Lcom/splunk/mint/network/Timer;->start()V

    .line 115
    iget-object v1, p0, Lcom/splunk/mint/network/http/MonitorableHttpsURLConnection;->original:Ljava/net/URLConnection;

    invoke-virtual {v1}, Ljava/net/URLConnection;->connect()V

    .line 117
    invoke-static {}, Lcom/splunk/mint/network/NetLogManager;->getInstance()Lcom/splunk/mint/network/NetLogManager;

    move-result-object v1

    iget-object v2, p0, Lcom/splunk/mint/network/http/MonitorableHttpsURLConnection;->original:Ljava/net/URLConnection;

    invoke-virtual {v2}, Ljava/net/URLConnection;->getURL()Ljava/net/URL;

    move-result-object v2

    invoke-virtual {v2}, Ljava/net/URL;->toExternalForm()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/splunk/mint/network/http/MonitorableHttpsURLConnection;->original:Ljava/net/URLConnection;

    invoke-virtual {v3}, Ljava/net/URLConnection;->getURL()Ljava/net/URL;

    move-result-object v3

    invoke-virtual {v3}, Ljava/net/URL;->toExternalForm()Ljava/lang/String;

    move-result-object v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    const-string v6, "HTTPS"

    invoke-virtual/range {v1 .. v6}, Lcom/splunk/mint/network/NetLogManager;->startNetworkCall(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 124
    return-void

    .line 119
    :catch_0
    move-exception v0

    .line 120
    .local v0, "e":Ljava/io/IOException;
    invoke-static {}, Lcom/splunk/mint/network/NetLogManager;->getInstance()Lcom/splunk/mint/network/NetLogManager;

    move-result-object v1

    iget-object v2, p0, Lcom/splunk/mint/network/http/MonitorableHttpsURLConnection;->registry:Lcom/splunk/mint/network/MonitorRegistry;

    iget-object v3, p0, Lcom/splunk/mint/network/http/MonitorableHttpsURLConnection;->url:Ljava/net/URL;

    invoke-virtual {v3}, Ljava/net/URL;->toExternalForm()Ljava/lang/String;

    move-result-object v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    const-string v6, "HTTPS"

    invoke-virtual {v0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v7

    invoke-virtual/range {v1 .. v7}, Lcom/splunk/mint/network/NetLogManager;->cancelNetworkCall(Lcom/splunk/mint/network/MonitorRegistry;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)V

    .line 122
    throw v0
.end method

.method public disconnect()V
    .locals 8

    .prologue
    .line 55
    iget-object v0, p0, Lcom/splunk/mint/network/http/MonitorableHttpsURLConnection;->original:Ljava/net/URLConnection;

    invoke-static {v0}, Lcom/splunk/mint/network/NetLogManager;->getStatusCodeFromURLConnection(Ljava/net/URLConnection;)I

    move-result v7

    .line 57
    .local v7, "statusCode":I
    invoke-static {}, Lcom/splunk/mint/network/NetLogManager;->getInstance()Lcom/splunk/mint/network/NetLogManager;

    move-result-object v1

    iget-object v2, p0, Lcom/splunk/mint/network/http/MonitorableHttpsURLConnection;->registry:Lcom/splunk/mint/network/MonitorRegistry;

    iget-object v0, p0, Lcom/splunk/mint/network/http/MonitorableHttpsURLConnection;->url:Ljava/net/URL;

    invoke-virtual {v0}, Ljava/net/URL;->toExternalForm()Ljava/lang/String;

    move-result-object v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    iget-object v0, p0, Lcom/splunk/mint/network/http/MonitorableHttpsURLConnection;->original:Ljava/net/URLConnection;

    invoke-virtual {v0}, Ljava/net/URLConnection;->getHeaderFields()Ljava/util/Map;

    move-result-object v6

    invoke-virtual/range {v1 .. v7}, Lcom/splunk/mint/network/NetLogManager;->endNetworkCall(Lcom/splunk/mint/network/MonitorRegistry;Ljava/lang/String;JLjava/util/Map;I)V

    .line 59
    iget-object v0, p0, Lcom/splunk/mint/network/http/MonitorableHttpsURLConnection;->original:Ljava/net/URLConnection;

    instance-of v0, v0, Ljava/net/HttpURLConnection;

    if-eqz v0, :cond_0

    .line 60
    iget-object v0, p0, Lcom/splunk/mint/network/http/MonitorableHttpsURLConnection;->original:Ljava/net/URLConnection;

    check-cast v0, Ljava/net/HttpURLConnection;

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 62
    :cond_0
    return-void
.end method

.method public getAllowUserInteraction()Z
    .locals 1

    .prologue
    .line 128
    iget-object v0, p0, Lcom/splunk/mint/network/http/MonitorableHttpsURLConnection;->original:Ljava/net/URLConnection;

    invoke-virtual {v0}, Ljava/net/URLConnection;->getAllowUserInteraction()Z

    move-result v0

    return v0
.end method

.method public getCipherSuite()Ljava/lang/String;
    .locals 1

    .prologue
    .line 419
    iget-object v0, p0, Lcom/splunk/mint/network/http/MonitorableHttpsURLConnection;->original:Ljava/net/URLConnection;

    instance-of v0, v0, Ljavax/net/ssl/HttpsURLConnection;

    if-eqz v0, :cond_0

    .line 420
    iget-object v0, p0, Lcom/splunk/mint/network/http/MonitorableHttpsURLConnection;->original:Ljava/net/URLConnection;

    check-cast v0, Ljavax/net/ssl/HttpsURLConnection;

    invoke-virtual {v0}, Ljavax/net/ssl/HttpsURLConnection;->getCipherSuite()Ljava/lang/String;

    move-result-object v0

    .line 422
    :goto_0
    return-object v0

    :cond_0
    const-string v0, ""

    goto :goto_0
.end method

.method public getConnectTimeout()I
    .locals 1

    .prologue
    .line 138
    iget-object v0, p0, Lcom/splunk/mint/network/http/MonitorableHttpsURLConnection;->original:Ljava/net/URLConnection;

    invoke-virtual {v0}, Ljava/net/URLConnection;->getConnectTimeout()I

    move-result v0

    return v0
.end method

.method public getContent()Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 144
    :try_start_0
    iget-object v1, p0, Lcom/splunk/mint/network/http/MonitorableHttpsURLConnection;->original:Ljava/net/URLConnection;

    invoke-virtual {v1}, Ljava/net/URLConnection;->getContent()Ljava/lang/Object;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    return-object v1

    .line 145
    :catch_0
    move-exception v0

    .line 146
    .local v0, "e":Ljava/io/IOException;
    invoke-static {}, Lcom/splunk/mint/network/NetLogManager;->getInstance()Lcom/splunk/mint/network/NetLogManager;

    move-result-object v1

    iget-object v2, p0, Lcom/splunk/mint/network/http/MonitorableHttpsURLConnection;->registry:Lcom/splunk/mint/network/MonitorRegistry;

    iget-object v3, p0, Lcom/splunk/mint/network/http/MonitorableHttpsURLConnection;->url:Ljava/net/URL;

    invoke-virtual {v3}, Ljava/net/URL;->toExternalForm()Ljava/lang/String;

    move-result-object v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    const-string v6, "HTTPS"

    invoke-virtual {v0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v7

    invoke-virtual/range {v1 .. v7}, Lcom/splunk/mint/network/NetLogManager;->cancelNetworkCall(Lcom/splunk/mint/network/MonitorRegistry;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)V

    .line 148
    throw v0
.end method

.method public getContent([Ljava/lang/Class;)Ljava/lang/Object;
    .locals 8
    .param p1, "types"    # [Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 155
    :try_start_0
    iget-object v1, p0, Lcom/splunk/mint/network/http/MonitorableHttpsURLConnection;->original:Ljava/net/URLConnection;

    invoke-virtual {v1, p1}, Ljava/net/URLConnection;->getContent([Ljava/lang/Class;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    return-object v1

    .line 156
    :catch_0
    move-exception v0

    .line 157
    .local v0, "e":Ljava/io/IOException;
    invoke-static {}, Lcom/splunk/mint/network/NetLogManager;->getInstance()Lcom/splunk/mint/network/NetLogManager;

    move-result-object v1

    iget-object v2, p0, Lcom/splunk/mint/network/http/MonitorableHttpsURLConnection;->registry:Lcom/splunk/mint/network/MonitorRegistry;

    iget-object v3, p0, Lcom/splunk/mint/network/http/MonitorableHttpsURLConnection;->url:Ljava/net/URL;

    invoke-virtual {v3}, Ljava/net/URL;->toExternalForm()Ljava/lang/String;

    move-result-object v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    const-string v6, "HTTPS"

    invoke-virtual {v0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v7

    invoke-virtual/range {v1 .. v7}, Lcom/splunk/mint/network/NetLogManager;->cancelNetworkCall(Lcom/splunk/mint/network/MonitorRegistry;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)V

    .line 159
    throw v0
.end method

.method public getContentEncoding()Ljava/lang/String;
    .locals 1

    .prologue
    .line 165
    iget-object v0, p0, Lcom/splunk/mint/network/http/MonitorableHttpsURLConnection;->original:Ljava/net/URLConnection;

    invoke-virtual {v0}, Ljava/net/URLConnection;->getContentEncoding()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getContentLength()I
    .locals 1

    .prologue
    .line 170
    iget-object v0, p0, Lcom/splunk/mint/network/http/MonitorableHttpsURLConnection;->original:Ljava/net/URLConnection;

    invoke-virtual {v0}, Ljava/net/URLConnection;->getContentLength()I

    move-result v0

    return v0
.end method

.method public getContentType()Ljava/lang/String;
    .locals 1

    .prologue
    .line 175
    iget-object v0, p0, Lcom/splunk/mint/network/http/MonitorableHttpsURLConnection;->original:Ljava/net/URLConnection;

    invoke-virtual {v0}, Ljava/net/URLConnection;->getContentType()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getDate()J
    .locals 2

    .prologue
    .line 180
    iget-object v0, p0, Lcom/splunk/mint/network/http/MonitorableHttpsURLConnection;->original:Ljava/net/URLConnection;

    invoke-virtual {v0}, Ljava/net/URLConnection;->getDate()J

    move-result-wide v0

    return-wide v0
.end method

.method public getDefaultUseCaches()Z
    .locals 1

    .prologue
    .line 185
    iget-object v0, p0, Lcom/splunk/mint/network/http/MonitorableHttpsURLConnection;->original:Ljava/net/URLConnection;

    invoke-virtual {v0}, Ljava/net/URLConnection;->getDefaultUseCaches()Z

    move-result v0

    return v0
.end method

.method public getDoInput()Z
    .locals 1

    .prologue
    .line 190
    iget-object v0, p0, Lcom/splunk/mint/network/http/MonitorableHttpsURLConnection;->original:Ljava/net/URLConnection;

    invoke-virtual {v0}, Ljava/net/URLConnection;->getDoInput()Z

    move-result v0

    return v0
.end method

.method public getDoOutput()Z
    .locals 1

    .prologue
    .line 195
    iget-object v0, p0, Lcom/splunk/mint/network/http/MonitorableHttpsURLConnection;->original:Ljava/net/URLConnection;

    invoke-virtual {v0}, Ljava/net/URLConnection;->getDoOutput()Z

    move-result v0

    return v0
.end method

.method public getErrorStream()Ljava/io/InputStream;
    .locals 1

    .prologue
    .line 335
    iget-object v0, p0, Lcom/splunk/mint/network/http/MonitorableHttpsURLConnection;->original:Ljava/net/URLConnection;

    instance-of v0, v0, Ljava/net/HttpURLConnection;

    if-eqz v0, :cond_0

    .line 336
    iget-object v0, p0, Lcom/splunk/mint/network/http/MonitorableHttpsURLConnection;->original:Ljava/net/URLConnection;

    check-cast v0, Ljava/net/HttpURLConnection;

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getErrorStream()Ljava/io/InputStream;

    move-result-object v0

    .line 339
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public getExpiration()J
    .locals 2

    .prologue
    .line 200
    iget-object v0, p0, Lcom/splunk/mint/network/http/MonitorableHttpsURLConnection;->original:Ljava/net/URLConnection;

    invoke-virtual {v0}, Ljava/net/URLConnection;->getExpiration()J

    move-result-wide v0

    return-wide v0
.end method

.method public getHeaderField(I)Ljava/lang/String;
    .locals 1
    .param p1, "pos"    # I

    .prologue
    .line 205
    iget-object v0, p0, Lcom/splunk/mint/network/http/MonitorableHttpsURLConnection;->original:Ljava/net/URLConnection;

    invoke-virtual {v0, p1}, Ljava/net/URLConnection;->getHeaderField(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getHeaderField(Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .param p1, "key"    # Ljava/lang/String;

    .prologue
    .line 210
    iget-object v0, p0, Lcom/splunk/mint/network/http/MonitorableHttpsURLConnection;->original:Ljava/net/URLConnection;

    invoke-virtual {v0, p1}, Ljava/net/URLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getHeaderFieldDate(Ljava/lang/String;J)J
    .locals 2
    .param p1, "field"    # Ljava/lang/String;
    .param p2, "defaultValue"    # J

    .prologue
    .line 215
    iget-object v0, p0, Lcom/splunk/mint/network/http/MonitorableHttpsURLConnection;->original:Ljava/net/URLConnection;

    invoke-virtual {v0, p1, p2, p3}, Ljava/net/URLConnection;->getHeaderFieldDate(Ljava/lang/String;J)J

    move-result-wide v0

    return-wide v0
.end method

.method public getHeaderFieldInt(Ljava/lang/String;I)I
    .locals 1
    .param p1, "field"    # Ljava/lang/String;
    .param p2, "defaultValue"    # I

    .prologue
    .line 220
    iget-object v0, p0, Lcom/splunk/mint/network/http/MonitorableHttpsURLConnection;->original:Ljava/net/URLConnection;

    invoke-virtual {v0, p1, p2}, Ljava/net/URLConnection;->getHeaderFieldInt(Ljava/lang/String;I)I

    move-result v0

    return v0
.end method

.method public getHeaderFieldKey(I)Ljava/lang/String;
    .locals 1
    .param p1, "posn"    # I

    .prologue
    .line 225
    iget-object v0, p0, Lcom/splunk/mint/network/http/MonitorableHttpsURLConnection;->original:Ljava/net/URLConnection;

    invoke-virtual {v0, p1}, Ljava/net/URLConnection;->getHeaderFieldKey(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getHeaderFields()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    .prologue
    .line 230
    iget-object v0, p0, Lcom/splunk/mint/network/http/MonitorableHttpsURLConnection;->original:Ljava/net/URLConnection;

    invoke-virtual {v0}, Ljava/net/URLConnection;->getHeaderFields()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public getIfModifiedSince()J
    .locals 2

    .prologue
    .line 235
    iget-object v0, p0, Lcom/splunk/mint/network/http/MonitorableHttpsURLConnection;->original:Ljava/net/URLConnection;

    invoke-virtual {v0}, Ljava/net/URLConnection;->getIfModifiedSince()J

    move-result-wide v0

    return-wide v0
.end method

.method public getInputStream()Ljava/io/InputStream;
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 68
    :try_start_0
    sget-boolean v1, Lcom/splunk/mint/Properties;->isKitKat:Z

    if-eqz v1, :cond_1

    .line 69
    iget-object v1, p0, Lcom/splunk/mint/network/http/MonitorableHttpsURLConnection;->mInputStreamMonitorKitKat:Lcom/splunk/mint/network/io/InputStreamMonitorKitKat;

    if-nez v1, :cond_0

    .line 70
    new-instance v1, Lcom/splunk/mint/network/io/InputStreamMonitorKitKat;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lcom/splunk/mint/network/http/MonitorableHttpsURLConnection;->original:Ljava/net/URLConnection;

    invoke-virtual {v3}, Ljava/net/URLConnection;->getURL()Ljava/net/URL;

    move-result-object v3

    invoke-virtual {v3}, Ljava/net/URL;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "-in"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/splunk/mint/network/http/MonitorableHttpsURLConnection;->registry:Lcom/splunk/mint/network/MonitorRegistry;

    iget-object v4, p0, Lcom/splunk/mint/network/http/MonitorableHttpsURLConnection;->original:Ljava/net/URLConnection;

    invoke-virtual {v4}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v4

    const/4 v5, 0x0

    invoke-direct {v1, v2, v3, v4, v5}, Lcom/splunk/mint/network/io/InputStreamMonitorKitKat;-><init>(Ljava/lang/String;Lcom/splunk/mint/network/MonitorRegistry;Ljava/io/InputStream;Lcom/splunk/mint/network/socket/MonitoringSocketImpl;)V

    iput-object v1, p0, Lcom/splunk/mint/network/http/MonitorableHttpsURLConnection;->mInputStreamMonitorKitKat:Lcom/splunk/mint/network/io/InputStreamMonitorKitKat;

    .line 73
    :cond_0
    iget-object v1, p0, Lcom/splunk/mint/network/http/MonitorableHttpsURLConnection;->mInputStreamMonitorKitKat:Lcom/splunk/mint/network/io/InputStreamMonitorKitKat;

    .line 79
    :goto_0
    return-object v1

    .line 75
    :cond_1
    iget-object v1, p0, Lcom/splunk/mint/network/http/MonitorableHttpsURLConnection;->mInputStreamMonitor:Lcom/splunk/mint/network/io/InputStreamMonitor;

    if-nez v1, :cond_2

    .line 76
    new-instance v1, Lcom/splunk/mint/network/io/InputStreamMonitor;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lcom/splunk/mint/network/http/MonitorableHttpsURLConnection;->original:Ljava/net/URLConnection;

    invoke-virtual {v3}, Ljava/net/URLConnection;->getURL()Ljava/net/URL;

    move-result-object v3

    invoke-virtual {v3}, Ljava/net/URL;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "-in"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/splunk/mint/network/http/MonitorableHttpsURLConnection;->registry:Lcom/splunk/mint/network/MonitorRegistry;

    iget-object v4, p0, Lcom/splunk/mint/network/http/MonitorableHttpsURLConnection;->original:Ljava/net/URLConnection;

    invoke-virtual {v4}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v4

    const/4 v5, 0x0

    invoke-direct {v1, v2, v3, v4, v5}, Lcom/splunk/mint/network/io/InputStreamMonitor;-><init>(Ljava/lang/String;Lcom/splunk/mint/network/MonitorRegistry;Ljava/io/InputStream;Lcom/splunk/mint/network/socket/MonitoringSocketImpl;)V

    iput-object v1, p0, Lcom/splunk/mint/network/http/MonitorableHttpsURLConnection;->mInputStreamMonitor:Lcom/splunk/mint/network/io/InputStreamMonitor;

    .line 79
    :cond_2
    iget-object v1, p0, Lcom/splunk/mint/network/http/MonitorableHttpsURLConnection;->mInputStreamMonitor:Lcom/splunk/mint/network/io/InputStreamMonitor;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 81
    :catch_0
    move-exception v0

    .line 84
    .local v0, "e":Ljava/io/IOException;
    invoke-static {}, Lcom/splunk/mint/network/NetLogManager;->getInstance()Lcom/splunk/mint/network/NetLogManager;

    move-result-object v1

    iget-object v2, p0, Lcom/splunk/mint/network/http/MonitorableHttpsURLConnection;->registry:Lcom/splunk/mint/network/MonitorRegistry;

    iget-object v3, p0, Lcom/splunk/mint/network/http/MonitorableHttpsURLConnection;->url:Ljava/net/URL;

    invoke-virtual {v3}, Ljava/net/URL;->toExternalForm()Ljava/lang/String;

    move-result-object v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    const-string v6, "HTTPS"

    invoke-virtual {v0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v7

    invoke-virtual/range {v1 .. v7}, Lcom/splunk/mint/network/NetLogManager;->cancelNetworkCall(Lcom/splunk/mint/network/MonitorRegistry;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)V

    .line 87
    throw v0
.end method

.method public getInstanceFollowRedirects()Z
    .locals 1

    .prologue
    .line 344
    iget-object v0, p0, Lcom/splunk/mint/network/http/MonitorableHttpsURLConnection;->original:Ljava/net/URLConnection;

    instance-of v0, v0, Ljava/net/HttpURLConnection;

    if-eqz v0, :cond_0

    .line 345
    iget-object v0, p0, Lcom/splunk/mint/network/http/MonitorableHttpsURLConnection;->original:Ljava/net/URLConnection;

    check-cast v0, Ljava/net/HttpURLConnection;

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getInstanceFollowRedirects()Z

    move-result v0

    .line 349
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public getLastModified()J
    .locals 2

    .prologue
    .line 240
    iget-object v0, p0, Lcom/splunk/mint/network/http/MonitorableHttpsURLConnection;->original:Ljava/net/URLConnection;

    invoke-virtual {v0}, Ljava/net/URLConnection;->getLastModified()J

    move-result-wide v0

    return-wide v0
.end method

.method public getLocalCertificates()[Ljava/security/cert/Certificate;
    .locals 1

    .prologue
    .line 427
    iget-object v0, p0, Lcom/splunk/mint/network/http/MonitorableHttpsURLConnection;->original:Ljava/net/URLConnection;

    instance-of v0, v0, Ljavax/net/ssl/HttpsURLConnection;

    if-eqz v0, :cond_0

    .line 428
    iget-object v0, p0, Lcom/splunk/mint/network/http/MonitorableHttpsURLConnection;->original:Ljava/net/URLConnection;

    check-cast v0, Ljavax/net/ssl/HttpsURLConnection;

    invoke-virtual {v0}, Ljavax/net/ssl/HttpsURLConnection;->getLocalCertificates()[Ljava/security/cert/Certificate;

    move-result-object v0

    .line 430
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public getOutputStream()Ljava/io/OutputStream;
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 95
    :try_start_0
    iget-object v1, p0, Lcom/splunk/mint/network/http/MonitorableHttpsURLConnection;->mOutputStreamMonitor:Lcom/splunk/mint/network/io/OutputStreamMonitor;

    if-nez v1, :cond_0

    .line 96
    new-instance v1, Lcom/splunk/mint/network/io/OutputStreamMonitor;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lcom/splunk/mint/network/http/MonitorableHttpsURLConnection;->original:Ljava/net/URLConnection;

    invoke-virtual {v3}, Ljava/net/URLConnection;->getURL()Ljava/net/URL;

    move-result-object v3

    invoke-virtual {v3}, Ljava/net/URL;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "-out"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/splunk/mint/network/http/MonitorableHttpsURLConnection;->registry:Lcom/splunk/mint/network/MonitorRegistry;

    iget-object v4, p0, Lcom/splunk/mint/network/http/MonitorableHttpsURLConnection;->original:Ljava/net/URLConnection;

    invoke-virtual {v4}, Ljava/net/URLConnection;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v4

    invoke-direct {v1, v2, v3, v4}, Lcom/splunk/mint/network/io/OutputStreamMonitor;-><init>(Ljava/lang/String;Lcom/splunk/mint/network/MonitorRegistry;Ljava/io/OutputStream;)V

    iput-object v1, p0, Lcom/splunk/mint/network/http/MonitorableHttpsURLConnection;->mOutputStreamMonitor:Lcom/splunk/mint/network/io/OutputStreamMonitor;

    .line 100
    :cond_0
    iget-object v1, p0, Lcom/splunk/mint/network/http/MonitorableHttpsURLConnection;->mOutputStreamMonitor:Lcom/splunk/mint/network/io/OutputStreamMonitor;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    .line 101
    :catch_0
    move-exception v0

    .line 103
    .local v0, "e":Ljava/io/IOException;
    invoke-static {}, Lcom/splunk/mint/network/NetLogManager;->getInstance()Lcom/splunk/mint/network/NetLogManager;

    move-result-object v1

    iget-object v2, p0, Lcom/splunk/mint/network/http/MonitorableHttpsURLConnection;->registry:Lcom/splunk/mint/network/MonitorRegistry;

    iget-object v3, p0, Lcom/splunk/mint/network/http/MonitorableHttpsURLConnection;->url:Ljava/net/URL;

    invoke-virtual {v3}, Ljava/net/URL;->toExternalForm()Ljava/lang/String;

    move-result-object v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    const-string v6, "HTTPS"

    invoke-virtual {v0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v7

    invoke-virtual/range {v1 .. v7}, Lcom/splunk/mint/network/NetLogManager;->cancelNetworkCall(Lcom/splunk/mint/network/MonitorRegistry;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)V

    .line 105
    throw v0
.end method

.method public getPermission()Ljava/security/Permission;
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 246
    :try_start_0
    iget-object v1, p0, Lcom/splunk/mint/network/http/MonitorableHttpsURLConnection;->original:Ljava/net/URLConnection;

    invoke-virtual {v1}, Ljava/net/URLConnection;->getPermission()Ljava/security/Permission;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    return-object v1

    .line 247
    :catch_0
    move-exception v0

    .line 248
    .local v0, "e":Ljava/io/IOException;
    invoke-static {}, Lcom/splunk/mint/network/NetLogManager;->getInstance()Lcom/splunk/mint/network/NetLogManager;

    move-result-object v1

    iget-object v2, p0, Lcom/splunk/mint/network/http/MonitorableHttpsURLConnection;->registry:Lcom/splunk/mint/network/MonitorRegistry;

    iget-object v3, p0, Lcom/splunk/mint/network/http/MonitorableHttpsURLConnection;->url:Ljava/net/URL;

    invoke-virtual {v3}, Ljava/net/URL;->toExternalForm()Ljava/lang/String;

    move-result-object v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    const-string v6, "HTTPS"

    invoke-virtual {v0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v7

    invoke-virtual/range {v1 .. v7}, Lcom/splunk/mint/network/NetLogManager;->cancelNetworkCall(Lcom/splunk/mint/network/MonitorRegistry;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)V

    .line 250
    throw v0
.end method

.method public getReadTimeout()I
    .locals 1

    .prologue
    .line 256
    iget-object v0, p0, Lcom/splunk/mint/network/http/MonitorableHttpsURLConnection;->original:Ljava/net/URLConnection;

    invoke-virtual {v0}, Ljava/net/URLConnection;->getReadTimeout()I

    move-result v0

    return v0
.end method

.method public getRequestMethod()Ljava/lang/String;
    .locals 1

    .prologue
    .line 354
    iget-object v0, p0, Lcom/splunk/mint/network/http/MonitorableHttpsURLConnection;->original:Ljava/net/URLConnection;

    instance-of v0, v0, Ljava/net/HttpURLConnection;

    if-eqz v0, :cond_0

    .line 355
    iget-object v0, p0, Lcom/splunk/mint/network/http/MonitorableHttpsURLConnection;->original:Ljava/net/URLConnection;

    check-cast v0, Ljava/net/HttpURLConnection;

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getRequestMethod()Ljava/lang/String;

    move-result-object v0

    .line 359
    :goto_0
    return-object v0

    :cond_0
    const-string v0, "GET"

    goto :goto_0
.end method

.method public getRequestProperties()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    .prologue
    .line 261
    iget-object v0, p0, Lcom/splunk/mint/network/http/MonitorableHttpsURLConnection;->original:Ljava/net/URLConnection;

    invoke-virtual {v0}, Ljava/net/URLConnection;->getRequestProperties()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public getRequestProperty(Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .param p1, "field"    # Ljava/lang/String;

    .prologue
    .line 266
    iget-object v0, p0, Lcom/splunk/mint/network/http/MonitorableHttpsURLConnection;->original:Ljava/net/URLConnection;

    invoke-virtual {v0, p1}, Ljava/net/URLConnection;->getRequestProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getResponseCode()I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 364
    iget-object v0, p0, Lcom/splunk/mint/network/http/MonitorableHttpsURLConnection;->original:Ljava/net/URLConnection;

    instance-of v0, v0, Ljava/net/HttpURLConnection;

    if-eqz v0, :cond_0

    .line 365
    iget-object v0, p0, Lcom/splunk/mint/network/http/MonitorableHttpsURLConnection;->original:Ljava/net/URLConnection;

    check-cast v0, Ljava/net/HttpURLConnection;

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v0

    .line 369
    :goto_0
    return v0

    :cond_0
    const/4 v0, -0x1

    goto :goto_0
.end method

.method public getResponseMessage()Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 374
    iget-object v0, p0, Lcom/splunk/mint/network/http/MonitorableHttpsURLConnection;->original:Ljava/net/URLConnection;

    instance-of v0, v0, Ljava/net/HttpURLConnection;

    if-eqz v0, :cond_0

    .line 375
    iget-object v0, p0, Lcom/splunk/mint/network/http/MonitorableHttpsURLConnection;->original:Ljava/net/URLConnection;

    check-cast v0, Ljava/net/HttpURLConnection;

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getResponseMessage()Ljava/lang/String;

    move-result-object v0

    .line 379
    :goto_0
    return-object v0

    :cond_0
    const-string v0, ""

    goto :goto_0
.end method

.method public getServerCertificates()[Ljava/security/cert/Certificate;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljavax/net/ssl/SSLPeerUnverifiedException;
        }
    .end annotation

    .prologue
    .line 435
    iget-object v0, p0, Lcom/splunk/mint/network/http/MonitorableHttpsURLConnection;->original:Ljava/net/URLConnection;

    instance-of v0, v0, Ljavax/net/ssl/HttpsURLConnection;

    if-eqz v0, :cond_0

    .line 436
    iget-object v0, p0, Lcom/splunk/mint/network/http/MonitorableHttpsURLConnection;->original:Ljava/net/URLConnection;

    check-cast v0, Ljavax/net/ssl/HttpsURLConnection;

    invoke-virtual {v0}, Ljavax/net/ssl/HttpsURLConnection;->getServerCertificates()[Ljava/security/cert/Certificate;

    move-result-object v0

    .line 438
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public getURL()Ljava/net/URL;
    .locals 1

    .prologue
    .line 271
    iget-object v0, p0, Lcom/splunk/mint/network/http/MonitorableHttpsURLConnection;->original:Ljava/net/URLConnection;

    invoke-virtual {v0}, Ljava/net/URLConnection;->getURL()Ljava/net/URL;

    move-result-object v0

    return-object v0
.end method

.method public getUseCaches()Z
    .locals 1

    .prologue
    .line 276
    iget-object v0, p0, Lcom/splunk/mint/network/http/MonitorableHttpsURLConnection;->original:Ljava/net/URLConnection;

    invoke-virtual {v0}, Ljava/net/URLConnection;->getUseCaches()Z

    move-result v0

    return v0
.end method

.method public setAllowUserInteraction(Z)V
    .locals 1
    .param p1, "newValue"    # Z

    .prologue
    .line 281
    iget-object v0, p0, Lcom/splunk/mint/network/http/MonitorableHttpsURLConnection;->original:Ljava/net/URLConnection;

    invoke-virtual {v0, p1}, Ljava/net/URLConnection;->setAllowUserInteraction(Z)V

    .line 282
    return-void
.end method

.method public setChunkedStreamingMode(I)V
    .locals 1
    .param p1, "chunkLength"    # I

    .prologue
    .line 384
    iget-object v0, p0, Lcom/splunk/mint/network/http/MonitorableHttpsURLConnection;->original:Ljava/net/URLConnection;

    instance-of v0, v0, Ljava/net/HttpURLConnection;

    if-eqz v0, :cond_0

    .line 385
    iget-object v0, p0, Lcom/splunk/mint/network/http/MonitorableHttpsURLConnection;->original:Ljava/net/URLConnection;

    check-cast v0, Ljava/net/HttpURLConnection;

    invoke-virtual {v0, p1}, Ljava/net/HttpURLConnection;->setChunkedStreamingMode(I)V

    .line 387
    :cond_0
    return-void
.end method

.method public setConnectTimeout(I)V
    .locals 1
    .param p1, "timeoutMillis"    # I

    .prologue
    .line 286
    iget-object v0, p0, Lcom/splunk/mint/network/http/MonitorableHttpsURLConnection;->original:Ljava/net/URLConnection;

    invoke-virtual {v0, p1}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    .line 287
    return-void
.end method

.method public setDefaultUseCaches(Z)V
    .locals 1
    .param p1, "newValue"    # Z

    .prologue
    .line 291
    iget-object v0, p0, Lcom/splunk/mint/network/http/MonitorableHttpsURLConnection;->original:Ljava/net/URLConnection;

    invoke-virtual {v0, p1}, Ljava/net/URLConnection;->setDefaultUseCaches(Z)V

    .line 292
    return-void
.end method

.method public setDoInput(Z)V
    .locals 1
    .param p1, "newValue"    # Z

    .prologue
    .line 296
    iget-object v0, p0, Lcom/splunk/mint/network/http/MonitorableHttpsURLConnection;->original:Ljava/net/URLConnection;

    invoke-virtual {v0, p1}, Ljava/net/URLConnection;->setDoInput(Z)V

    .line 297
    return-void
.end method

.method public setDoOutput(Z)V
    .locals 1
    .param p1, "newValue"    # Z

    .prologue
    .line 301
    iget-object v0, p0, Lcom/splunk/mint/network/http/MonitorableHttpsURLConnection;->original:Ljava/net/URLConnection;

    invoke-virtual {v0, p1}, Ljava/net/URLConnection;->setDoOutput(Z)V

    .line 302
    return-void
.end method

.method public setFixedLengthStreamingMode(I)V
    .locals 1
    .param p1, "contentLength"    # I

    .prologue
    .line 391
    iget-object v0, p0, Lcom/splunk/mint/network/http/MonitorableHttpsURLConnection;->original:Ljava/net/URLConnection;

    instance-of v0, v0, Ljava/net/HttpURLConnection;

    if-eqz v0, :cond_0

    .line 392
    iget-object v0, p0, Lcom/splunk/mint/network/http/MonitorableHttpsURLConnection;->original:Ljava/net/URLConnection;

    check-cast v0, Ljava/net/HttpURLConnection;

    invoke-virtual {v0, p1}, Ljava/net/HttpURLConnection;->setFixedLengthStreamingMode(I)V

    .line 394
    :cond_0
    return-void
.end method

.method public setIfModifiedSince(J)V
    .locals 1
    .param p1, "newValue"    # J

    .prologue
    .line 306
    iget-object v0, p0, Lcom/splunk/mint/network/http/MonitorableHttpsURLConnection;->original:Ljava/net/URLConnection;

    invoke-virtual {v0, p1, p2}, Ljava/net/URLConnection;->setIfModifiedSince(J)V

    .line 307
    return-void
.end method

.method public setInstanceFollowRedirects(Z)V
    .locals 1
    .param p1, "followRedirects"    # Z

    .prologue
    .line 398
    iget-object v0, p0, Lcom/splunk/mint/network/http/MonitorableHttpsURLConnection;->original:Ljava/net/URLConnection;

    instance-of v0, v0, Ljava/net/HttpURLConnection;

    if-eqz v0, :cond_0

    .line 399
    iget-object v0, p0, Lcom/splunk/mint/network/http/MonitorableHttpsURLConnection;->original:Ljava/net/URLConnection;

    check-cast v0, Ljava/net/HttpURLConnection;

    invoke-virtual {v0, p1}, Ljava/net/HttpURLConnection;->setInstanceFollowRedirects(Z)V

    .line 401
    :cond_0
    return-void
.end method

.method public setReadTimeout(I)V
    .locals 1
    .param p1, "timeoutMillis"    # I

    .prologue
    .line 311
    iget-object v0, p0, Lcom/splunk/mint/network/http/MonitorableHttpsURLConnection;->original:Ljava/net/URLConnection;

    invoke-virtual {v0, p1}, Ljava/net/URLConnection;->setReadTimeout(I)V

    .line 312
    return-void
.end method

.method public setRequestMethod(Ljava/lang/String;)V
    .locals 1
    .param p1, "method"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/net/ProtocolException;
        }
    .end annotation

    .prologue
    .line 405
    iget-object v0, p0, Lcom/splunk/mint/network/http/MonitorableHttpsURLConnection;->original:Ljava/net/URLConnection;

    instance-of v0, v0, Ljava/net/HttpURLConnection;

    if-eqz v0, :cond_0

    .line 406
    iget-object v0, p0, Lcom/splunk/mint/network/http/MonitorableHttpsURLConnection;->original:Ljava/net/URLConnection;

    check-cast v0, Ljava/net/HttpURLConnection;

    invoke-virtual {v0, p1}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 408
    :cond_0
    return-void
.end method

.method public setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .param p1, "field"    # Ljava/lang/String;
    .param p2, "newValue"    # Ljava/lang/String;

    .prologue
    .line 316
    iget-object v0, p0, Lcom/splunk/mint/network/http/MonitorableHttpsURLConnection;->original:Ljava/net/URLConnection;

    invoke-virtual {v0, p1, p2}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 317
    return-void
.end method

.method public setUseCaches(Z)V
    .locals 1
    .param p1, "newValue"    # Z

    .prologue
    .line 321
    iget-object v0, p0, Lcom/splunk/mint/network/http/MonitorableHttpsURLConnection;->original:Ljava/net/URLConnection;

    invoke-virtual {v0, p1}, Ljava/net/URLConnection;->setUseCaches(Z)V

    .line 322
    return-void
.end method

.method public usingProxy()Z
    .locals 1

    .prologue
    .line 326
    iget-object v0, p0, Lcom/splunk/mint/network/http/MonitorableHttpsURLConnection;->original:Ljava/net/URLConnection;

    instance-of v0, v0, Ljava/net/HttpURLConnection;

    if-eqz v0, :cond_0

    .line 327
    iget-object v0, p0, Lcom/splunk/mint/network/http/MonitorableHttpsURLConnection;->original:Ljava/net/URLConnection;

    check-cast v0, Ljava/net/HttpURLConnection;

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->usingProxy()Z

    move-result v0

    .line 330
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
