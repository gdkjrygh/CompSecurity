.class public final Lcom/splunk/mint/network/http/MonitorableHttpURLConnection;
.super Ljava/net/HttpURLConnection;
.source "MonitorableHttpURLConnection.java"


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

    .line 36
    invoke-virtual {p2}, Ljava/net/URLConnection;->getURL()Ljava/net/URL;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/net/HttpURLConnection;-><init>(Ljava/net/URL;)V

    .line 30
    iput-object v1, p0, Lcom/splunk/mint/network/http/MonitorableHttpURLConnection;->mInputStreamMonitor:Lcom/splunk/mint/network/io/InputStreamMonitor;

    .line 31
    iput-object v1, p0, Lcom/splunk/mint/network/http/MonitorableHttpURLConnection;->mOutputStreamMonitor:Lcom/splunk/mint/network/io/OutputStreamMonitor;

    .line 33
    iput-object v1, p0, Lcom/splunk/mint/network/http/MonitorableHttpURLConnection;->mInputStreamMonitorKitKat:Lcom/splunk/mint/network/io/InputStreamMonitorKitKat;

    .line 38
    iput-object p1, p0, Lcom/splunk/mint/network/http/MonitorableHttpURLConnection;->registry:Lcom/splunk/mint/network/MonitorRegistry;

    .line 39
    iput-object p2, p0, Lcom/splunk/mint/network/http/MonitorableHttpURLConnection;->original:Ljava/net/URLConnection;

    .line 40
    iget-object v0, p0, Lcom/splunk/mint/network/http/MonitorableHttpURLConnection;->url:Ljava/net/URL;

    invoke-virtual {v0}, Ljava/net/URL;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/splunk/mint/network/http/MonitorableHttpURLConnection;->connectionName:Ljava/lang/String;

    .line 41
    new-instance v0, Lcom/splunk/mint/network/Timer;

    iget-object v1, p0, Lcom/splunk/mint/network/http/MonitorableHttpURLConnection;->connectionName:Ljava/lang/String;

    invoke-direct {v0, v1}, Lcom/splunk/mint/network/Timer;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/splunk/mint/network/http/MonitorableHttpURLConnection;->timer:Lcom/splunk/mint/network/Timer;

    .line 43
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

    const-string v6, "HTTP"

    invoke-virtual/range {v1 .. v6}, Lcom/splunk/mint/network/NetLogManager;->startNetworkCall(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V

    .line 45
    return-void
.end method


# virtual methods
.method public addRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .param p1, "field"    # Ljava/lang/String;
    .param p2, "newValue"    # Ljava/lang/String;

    .prologue
    .line 129
    iget-object v0, p0, Lcom/splunk/mint/network/http/MonitorableHttpURLConnection;->original:Ljava/net/URLConnection;

    invoke-virtual {v0, p1, p2}, Ljava/net/URLConnection;->addRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 130
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
    .line 51
    :try_start_0
    iget-object v1, p0, Lcom/splunk/mint/network/http/MonitorableHttpURLConnection;->timer:Lcom/splunk/mint/network/Timer;

    invoke-virtual {v1}, Lcom/splunk/mint/network/Timer;->start()V

    .line 53
    iget-object v1, p0, Lcom/splunk/mint/network/http/MonitorableHttpURLConnection;->original:Ljava/net/URLConnection;

    invoke-virtual {v1}, Ljava/net/URLConnection;->connect()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 61
    return-void

    .line 55
    :catch_0
    move-exception v0

    .line 56
    .local v0, "e":Ljava/io/IOException;
    invoke-static {}, Lcom/splunk/mint/network/NetLogManager;->getInstance()Lcom/splunk/mint/network/NetLogManager;

    move-result-object v1

    iget-object v2, p0, Lcom/splunk/mint/network/http/MonitorableHttpURLConnection;->registry:Lcom/splunk/mint/network/MonitorRegistry;

    iget-object v3, p0, Lcom/splunk/mint/network/http/MonitorableHttpURLConnection;->url:Ljava/net/URL;

    invoke-virtual {v3}, Ljava/net/URL;->toExternalForm()Ljava/lang/String;

    move-result-object v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    const-string v6, "HTTP"

    invoke-virtual {v0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v7

    invoke-virtual/range {v1 .. v7}, Lcom/splunk/mint/network/NetLogManager;->cancelNetworkCall(Lcom/splunk/mint/network/MonitorRegistry;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)V

    .line 59
    throw v0
.end method

.method public disconnect()V
    .locals 8

    .prologue
    .line 67
    iget-object v0, p0, Lcom/splunk/mint/network/http/MonitorableHttpURLConnection;->original:Ljava/net/URLConnection;

    invoke-static {v0}, Lcom/splunk/mint/network/NetLogManager;->getStatusCodeFromURLConnection(Ljava/net/URLConnection;)I

    move-result v7

    .line 69
    .local v7, "statusCode":I
    invoke-static {}, Lcom/splunk/mint/network/NetLogManager;->getInstance()Lcom/splunk/mint/network/NetLogManager;

    move-result-object v1

    iget-object v2, p0, Lcom/splunk/mint/network/http/MonitorableHttpURLConnection;->registry:Lcom/splunk/mint/network/MonitorRegistry;

    iget-object v0, p0, Lcom/splunk/mint/network/http/MonitorableHttpURLConnection;->url:Ljava/net/URL;

    invoke-virtual {v0}, Ljava/net/URL;->toExternalForm()Ljava/lang/String;

    move-result-object v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    iget-object v0, p0, Lcom/splunk/mint/network/http/MonitorableHttpURLConnection;->original:Ljava/net/URLConnection;

    invoke-virtual {v0}, Ljava/net/URLConnection;->getHeaderFields()Ljava/util/Map;

    move-result-object v6

    invoke-virtual/range {v1 .. v7}, Lcom/splunk/mint/network/NetLogManager;->endNetworkCall(Lcom/splunk/mint/network/MonitorRegistry;Ljava/lang/String;JLjava/util/Map;I)V

    .line 72
    iget-object v0, p0, Lcom/splunk/mint/network/http/MonitorableHttpURLConnection;->original:Ljava/net/URLConnection;

    instance-of v0, v0, Ljava/net/HttpURLConnection;

    if-eqz v0, :cond_0

    .line 73
    iget-object v0, p0, Lcom/splunk/mint/network/http/MonitorableHttpURLConnection;->original:Ljava/net/URLConnection;

    check-cast v0, Ljava/net/HttpURLConnection;

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 75
    :cond_0
    return-void
.end method

.method public getAllowUserInteraction()Z
    .locals 1

    .prologue
    .line 124
    iget-object v0, p0, Lcom/splunk/mint/network/http/MonitorableHttpURLConnection;->original:Ljava/net/URLConnection;

    invoke-virtual {v0}, Ljava/net/URLConnection;->getAllowUserInteraction()Z

    move-result v0

    return v0
.end method

.method public getConnectTimeout()I
    .locals 1

    .prologue
    .line 134
    iget-object v0, p0, Lcom/splunk/mint/network/http/MonitorableHttpURLConnection;->original:Ljava/net/URLConnection;

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
    .line 140
    :try_start_0
    iget-object v1, p0, Lcom/splunk/mint/network/http/MonitorableHttpURLConnection;->original:Ljava/net/URLConnection;

    invoke-virtual {v1}, Ljava/net/URLConnection;->getContent()Ljava/lang/Object;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    return-object v1

    .line 141
    :catch_0
    move-exception v0

    .line 142
    .local v0, "e":Ljava/io/IOException;
    invoke-static {}, Lcom/splunk/mint/network/NetLogManager;->getInstance()Lcom/splunk/mint/network/NetLogManager;

    move-result-object v1

    iget-object v2, p0, Lcom/splunk/mint/network/http/MonitorableHttpURLConnection;->registry:Lcom/splunk/mint/network/MonitorRegistry;

    iget-object v3, p0, Lcom/splunk/mint/network/http/MonitorableHttpURLConnection;->url:Ljava/net/URL;

    invoke-virtual {v3}, Ljava/net/URL;->toExternalForm()Ljava/lang/String;

    move-result-object v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    const-string v6, "HTTP"

    invoke-virtual {v0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v7

    invoke-virtual/range {v1 .. v7}, Lcom/splunk/mint/network/NetLogManager;->cancelNetworkCall(Lcom/splunk/mint/network/MonitorRegistry;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)V

    .line 145
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
    .line 152
    :try_start_0
    iget-object v1, p0, Lcom/splunk/mint/network/http/MonitorableHttpURLConnection;->original:Ljava/net/URLConnection;

    invoke-virtual {v1, p1}, Ljava/net/URLConnection;->getContent([Ljava/lang/Class;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    return-object v1

    .line 153
    :catch_0
    move-exception v0

    .line 154
    .local v0, "e":Ljava/io/IOException;
    invoke-static {}, Lcom/splunk/mint/network/NetLogManager;->getInstance()Lcom/splunk/mint/network/NetLogManager;

    move-result-object v1

    iget-object v2, p0, Lcom/splunk/mint/network/http/MonitorableHttpURLConnection;->registry:Lcom/splunk/mint/network/MonitorRegistry;

    iget-object v3, p0, Lcom/splunk/mint/network/http/MonitorableHttpURLConnection;->url:Ljava/net/URL;

    invoke-virtual {v3}, Ljava/net/URL;->toExternalForm()Ljava/lang/String;

    move-result-object v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    const-string v6, "HTTP"

    invoke-virtual {v0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v7

    invoke-virtual/range {v1 .. v7}, Lcom/splunk/mint/network/NetLogManager;->cancelNetworkCall(Lcom/splunk/mint/network/MonitorRegistry;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)V

    .line 157
    throw v0
.end method

.method public getContentEncoding()Ljava/lang/String;
    .locals 1

    .prologue
    .line 163
    iget-object v0, p0, Lcom/splunk/mint/network/http/MonitorableHttpURLConnection;->original:Ljava/net/URLConnection;

    invoke-virtual {v0}, Ljava/net/URLConnection;->getContentEncoding()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getContentLength()I
    .locals 1

    .prologue
    .line 168
    iget-object v0, p0, Lcom/splunk/mint/network/http/MonitorableHttpURLConnection;->original:Ljava/net/URLConnection;

    invoke-virtual {v0}, Ljava/net/URLConnection;->getContentLength()I

    move-result v0

    return v0
.end method

.method public getContentType()Ljava/lang/String;
    .locals 1

    .prologue
    .line 173
    iget-object v0, p0, Lcom/splunk/mint/network/http/MonitorableHttpURLConnection;->original:Ljava/net/URLConnection;

    invoke-virtual {v0}, Ljava/net/URLConnection;->getContentType()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getDate()J
    .locals 2

    .prologue
    .line 178
    iget-object v0, p0, Lcom/splunk/mint/network/http/MonitorableHttpURLConnection;->original:Ljava/net/URLConnection;

    invoke-virtual {v0}, Ljava/net/URLConnection;->getDate()J

    move-result-wide v0

    return-wide v0
.end method

.method public getDefaultUseCaches()Z
    .locals 1

    .prologue
    .line 183
    iget-object v0, p0, Lcom/splunk/mint/network/http/MonitorableHttpURLConnection;->original:Ljava/net/URLConnection;

    invoke-virtual {v0}, Ljava/net/URLConnection;->getDefaultUseCaches()Z

    move-result v0

    return v0
.end method

.method public getDoInput()Z
    .locals 1

    .prologue
    .line 188
    iget-object v0, p0, Lcom/splunk/mint/network/http/MonitorableHttpURLConnection;->original:Ljava/net/URLConnection;

    invoke-virtual {v0}, Ljava/net/URLConnection;->getDoInput()Z

    move-result v0

    return v0
.end method

.method public getDoOutput()Z
    .locals 1

    .prologue
    .line 193
    iget-object v0, p0, Lcom/splunk/mint/network/http/MonitorableHttpURLConnection;->original:Ljava/net/URLConnection;

    invoke-virtual {v0}, Ljava/net/URLConnection;->getDoOutput()Z

    move-result v0

    return v0
.end method

.method public getErrorStream()Ljava/io/InputStream;
    .locals 1

    .prologue
    .line 334
    iget-object v0, p0, Lcom/splunk/mint/network/http/MonitorableHttpURLConnection;->original:Ljava/net/URLConnection;

    instance-of v0, v0, Ljava/net/HttpURLConnection;

    if-eqz v0, :cond_0

    .line 335
    iget-object v0, p0, Lcom/splunk/mint/network/http/MonitorableHttpURLConnection;->original:Ljava/net/URLConnection;

    check-cast v0, Ljava/net/HttpURLConnection;

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getErrorStream()Ljava/io/InputStream;

    move-result-object v0

    .line 338
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public getExpiration()J
    .locals 2

    .prologue
    .line 198
    iget-object v0, p0, Lcom/splunk/mint/network/http/MonitorableHttpURLConnection;->original:Ljava/net/URLConnection;

    invoke-virtual {v0}, Ljava/net/URLConnection;->getExpiration()J

    move-result-wide v0

    return-wide v0
.end method

.method public getHeaderField(I)Ljava/lang/String;
    .locals 1
    .param p1, "pos"    # I

    .prologue
    .line 203
    iget-object v0, p0, Lcom/splunk/mint/network/http/MonitorableHttpURLConnection;->original:Ljava/net/URLConnection;

    invoke-virtual {v0, p1}, Ljava/net/URLConnection;->getHeaderField(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getHeaderField(Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .param p1, "key"    # Ljava/lang/String;

    .prologue
    .line 208
    iget-object v0, p0, Lcom/splunk/mint/network/http/MonitorableHttpURLConnection;->original:Ljava/net/URLConnection;

    invoke-virtual {v0, p1}, Ljava/net/URLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getHeaderFieldDate(Ljava/lang/String;J)J
    .locals 2
    .param p1, "field"    # Ljava/lang/String;
    .param p2, "defaultValue"    # J

    .prologue
    .line 213
    iget-object v0, p0, Lcom/splunk/mint/network/http/MonitorableHttpURLConnection;->original:Ljava/net/URLConnection;

    invoke-virtual {v0, p1, p2, p3}, Ljava/net/URLConnection;->getHeaderFieldDate(Ljava/lang/String;J)J

    move-result-wide v0

    return-wide v0
.end method

.method public getHeaderFieldInt(Ljava/lang/String;I)I
    .locals 1
    .param p1, "field"    # Ljava/lang/String;
    .param p2, "defaultValue"    # I

    .prologue
    .line 218
    iget-object v0, p0, Lcom/splunk/mint/network/http/MonitorableHttpURLConnection;->original:Ljava/net/URLConnection;

    invoke-virtual {v0, p1, p2}, Ljava/net/URLConnection;->getHeaderFieldInt(Ljava/lang/String;I)I

    move-result v0

    return v0
.end method

.method public getHeaderFieldKey(I)Ljava/lang/String;
    .locals 1
    .param p1, "posn"    # I

    .prologue
    .line 223
    iget-object v0, p0, Lcom/splunk/mint/network/http/MonitorableHttpURLConnection;->original:Ljava/net/URLConnection;

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
    .line 228
    iget-object v0, p0, Lcom/splunk/mint/network/http/MonitorableHttpURLConnection;->original:Ljava/net/URLConnection;

    invoke-virtual {v0}, Ljava/net/URLConnection;->getHeaderFields()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public getIfModifiedSince()J
    .locals 2

    .prologue
    .line 233
    iget-object v0, p0, Lcom/splunk/mint/network/http/MonitorableHttpURLConnection;->original:Ljava/net/URLConnection;

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
    .line 80
    :try_start_0
    sget-boolean v1, Lcom/splunk/mint/Properties;->isKitKat:Z

    if-eqz v1, :cond_1

    .line 81
    iget-object v1, p0, Lcom/splunk/mint/network/http/MonitorableHttpURLConnection;->mInputStreamMonitorKitKat:Lcom/splunk/mint/network/io/InputStreamMonitorKitKat;

    if-nez v1, :cond_0

    .line 82
    new-instance v1, Lcom/splunk/mint/network/io/InputStreamMonitorKitKat;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lcom/splunk/mint/network/http/MonitorableHttpURLConnection;->original:Ljava/net/URLConnection;

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

    iget-object v3, p0, Lcom/splunk/mint/network/http/MonitorableHttpURLConnection;->registry:Lcom/splunk/mint/network/MonitorRegistry;

    iget-object v4, p0, Lcom/splunk/mint/network/http/MonitorableHttpURLConnection;->original:Ljava/net/URLConnection;

    invoke-virtual {v4}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v4

    const/4 v5, 0x0

    invoke-direct {v1, v2, v3, v4, v5}, Lcom/splunk/mint/network/io/InputStreamMonitorKitKat;-><init>(Ljava/lang/String;Lcom/splunk/mint/network/MonitorRegistry;Ljava/io/InputStream;Lcom/splunk/mint/network/socket/MonitoringSocketImpl;)V

    iput-object v1, p0, Lcom/splunk/mint/network/http/MonitorableHttpURLConnection;->mInputStreamMonitorKitKat:Lcom/splunk/mint/network/io/InputStreamMonitorKitKat;

    .line 85
    :cond_0
    iget-object v1, p0, Lcom/splunk/mint/network/http/MonitorableHttpURLConnection;->mInputStreamMonitorKitKat:Lcom/splunk/mint/network/io/InputStreamMonitorKitKat;

    .line 91
    :goto_0
    return-object v1

    .line 87
    :cond_1
    iget-object v1, p0, Lcom/splunk/mint/network/http/MonitorableHttpURLConnection;->mInputStreamMonitor:Lcom/splunk/mint/network/io/InputStreamMonitor;

    if-nez v1, :cond_2

    .line 88
    new-instance v1, Lcom/splunk/mint/network/io/InputStreamMonitor;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lcom/splunk/mint/network/http/MonitorableHttpURLConnection;->original:Ljava/net/URLConnection;

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

    iget-object v3, p0, Lcom/splunk/mint/network/http/MonitorableHttpURLConnection;->registry:Lcom/splunk/mint/network/MonitorRegistry;

    iget-object v4, p0, Lcom/splunk/mint/network/http/MonitorableHttpURLConnection;->original:Ljava/net/URLConnection;

    invoke-virtual {v4}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v4

    const/4 v5, 0x0

    invoke-direct {v1, v2, v3, v4, v5}, Lcom/splunk/mint/network/io/InputStreamMonitor;-><init>(Ljava/lang/String;Lcom/splunk/mint/network/MonitorRegistry;Ljava/io/InputStream;Lcom/splunk/mint/network/socket/MonitoringSocketImpl;)V

    iput-object v1, p0, Lcom/splunk/mint/network/http/MonitorableHttpURLConnection;->mInputStreamMonitor:Lcom/splunk/mint/network/io/InputStreamMonitor;

    .line 91
    :cond_2
    iget-object v1, p0, Lcom/splunk/mint/network/http/MonitorableHttpURLConnection;->mInputStreamMonitor:Lcom/splunk/mint/network/io/InputStreamMonitor;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 93
    :catch_0
    move-exception v0

    .line 96
    .local v0, "e":Ljava/io/IOException;
    invoke-static {}, Lcom/splunk/mint/network/NetLogManager;->getInstance()Lcom/splunk/mint/network/NetLogManager;

    move-result-object v1

    iget-object v2, p0, Lcom/splunk/mint/network/http/MonitorableHttpURLConnection;->registry:Lcom/splunk/mint/network/MonitorRegistry;

    iget-object v3, p0, Lcom/splunk/mint/network/http/MonitorableHttpURLConnection;->url:Ljava/net/URL;

    invoke-virtual {v3}, Ljava/net/URL;->toExternalForm()Ljava/lang/String;

    move-result-object v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    const-string v6, "HTTPS"

    invoke-virtual {v0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v7

    invoke-virtual/range {v1 .. v7}, Lcom/splunk/mint/network/NetLogManager;->cancelNetworkCall(Lcom/splunk/mint/network/MonitorRegistry;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)V

    .line 99
    throw v0
.end method

.method public getInstanceFollowRedirects()Z
    .locals 1

    .prologue
    .line 343
    iget-object v0, p0, Lcom/splunk/mint/network/http/MonitorableHttpURLConnection;->original:Ljava/net/URLConnection;

    instance-of v0, v0, Ljava/net/HttpURLConnection;

    if-eqz v0, :cond_0

    .line 344
    iget-object v0, p0, Lcom/splunk/mint/network/http/MonitorableHttpURLConnection;->original:Ljava/net/URLConnection;

    check-cast v0, Ljava/net/HttpURLConnection;

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getInstanceFollowRedirects()Z

    move-result v0

    .line 348
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public getLastModified()J
    .locals 2

    .prologue
    .line 238
    iget-object v0, p0, Lcom/splunk/mint/network/http/MonitorableHttpURLConnection;->original:Ljava/net/URLConnection;

    invoke-virtual {v0}, Ljava/net/URLConnection;->getLastModified()J

    move-result-wide v0

    return-wide v0
.end method

.method public getOutputStream()Ljava/io/OutputStream;
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 107
    :try_start_0
    iget-object v1, p0, Lcom/splunk/mint/network/http/MonitorableHttpURLConnection;->mOutputStreamMonitor:Lcom/splunk/mint/network/io/OutputStreamMonitor;

    if-nez v1, :cond_0

    .line 108
    new-instance v1, Lcom/splunk/mint/network/io/OutputStreamMonitor;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lcom/splunk/mint/network/http/MonitorableHttpURLConnection;->original:Ljava/net/URLConnection;

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

    iget-object v3, p0, Lcom/splunk/mint/network/http/MonitorableHttpURLConnection;->registry:Lcom/splunk/mint/network/MonitorRegistry;

    iget-object v4, p0, Lcom/splunk/mint/network/http/MonitorableHttpURLConnection;->original:Ljava/net/URLConnection;

    invoke-virtual {v4}, Ljava/net/URLConnection;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v4

    invoke-direct {v1, v2, v3, v4}, Lcom/splunk/mint/network/io/OutputStreamMonitor;-><init>(Ljava/lang/String;Lcom/splunk/mint/network/MonitorRegistry;Ljava/io/OutputStream;)V

    iput-object v1, p0, Lcom/splunk/mint/network/http/MonitorableHttpURLConnection;->mOutputStreamMonitor:Lcom/splunk/mint/network/io/OutputStreamMonitor;

    .line 112
    :cond_0
    iget-object v1, p0, Lcom/splunk/mint/network/http/MonitorableHttpURLConnection;->mOutputStreamMonitor:Lcom/splunk/mint/network/io/OutputStreamMonitor;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    .line 113
    :catch_0
    move-exception v0

    .line 115
    .local v0, "e":Ljava/io/IOException;
    invoke-static {}, Lcom/splunk/mint/network/NetLogManager;->getInstance()Lcom/splunk/mint/network/NetLogManager;

    move-result-object v1

    iget-object v2, p0, Lcom/splunk/mint/network/http/MonitorableHttpURLConnection;->registry:Lcom/splunk/mint/network/MonitorRegistry;

    iget-object v3, p0, Lcom/splunk/mint/network/http/MonitorableHttpURLConnection;->url:Ljava/net/URL;

    invoke-virtual {v3}, Ljava/net/URL;->toExternalForm()Ljava/lang/String;

    move-result-object v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    const-string v6, "HTTP"

    invoke-virtual {v0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v7

    invoke-virtual/range {v1 .. v7}, Lcom/splunk/mint/network/NetLogManager;->cancelNetworkCall(Lcom/splunk/mint/network/MonitorRegistry;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)V

    .line 118
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
    .line 244
    :try_start_0
    iget-object v1, p0, Lcom/splunk/mint/network/http/MonitorableHttpURLConnection;->original:Ljava/net/URLConnection;

    invoke-virtual {v1}, Ljava/net/URLConnection;->getPermission()Ljava/security/Permission;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    return-object v1

    .line 245
    :catch_0
    move-exception v0

    .line 246
    .local v0, "e":Ljava/io/IOException;
    invoke-static {}, Lcom/splunk/mint/network/NetLogManager;->getInstance()Lcom/splunk/mint/network/NetLogManager;

    move-result-object v1

    iget-object v2, p0, Lcom/splunk/mint/network/http/MonitorableHttpURLConnection;->registry:Lcom/splunk/mint/network/MonitorRegistry;

    iget-object v3, p0, Lcom/splunk/mint/network/http/MonitorableHttpURLConnection;->url:Ljava/net/URL;

    invoke-virtual {v3}, Ljava/net/URL;->toExternalForm()Ljava/lang/String;

    move-result-object v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    const-string v6, "HTTP"

    invoke-virtual {v0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v7

    invoke-virtual/range {v1 .. v7}, Lcom/splunk/mint/network/NetLogManager;->cancelNetworkCall(Lcom/splunk/mint/network/MonitorRegistry;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)V

    .line 249
    throw v0
.end method

.method public getReadTimeout()I
    .locals 1

    .prologue
    .line 255
    iget-object v0, p0, Lcom/splunk/mint/network/http/MonitorableHttpURLConnection;->original:Ljava/net/URLConnection;

    invoke-virtual {v0}, Ljava/net/URLConnection;->getReadTimeout()I

    move-result v0

    return v0
.end method

.method public getRequestMethod()Ljava/lang/String;
    .locals 1

    .prologue
    .line 353
    iget-object v0, p0, Lcom/splunk/mint/network/http/MonitorableHttpURLConnection;->original:Ljava/net/URLConnection;

    instance-of v0, v0, Ljava/net/HttpURLConnection;

    if-eqz v0, :cond_0

    .line 354
    iget-object v0, p0, Lcom/splunk/mint/network/http/MonitorableHttpURLConnection;->original:Ljava/net/URLConnection;

    check-cast v0, Ljava/net/HttpURLConnection;

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getRequestMethod()Ljava/lang/String;

    move-result-object v0

    .line 358
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
    .line 260
    iget-object v0, p0, Lcom/splunk/mint/network/http/MonitorableHttpURLConnection;->original:Ljava/net/URLConnection;

    invoke-virtual {v0}, Ljava/net/URLConnection;->getRequestProperties()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public getRequestProperty(Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .param p1, "field"    # Ljava/lang/String;

    .prologue
    .line 265
    iget-object v0, p0, Lcom/splunk/mint/network/http/MonitorableHttpURLConnection;->original:Ljava/net/URLConnection;

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
    .line 363
    iget-object v0, p0, Lcom/splunk/mint/network/http/MonitorableHttpURLConnection;->original:Ljava/net/URLConnection;

    instance-of v0, v0, Ljava/net/HttpURLConnection;

    if-eqz v0, :cond_0

    .line 364
    iget-object v0, p0, Lcom/splunk/mint/network/http/MonitorableHttpURLConnection;->original:Ljava/net/URLConnection;

    check-cast v0, Ljava/net/HttpURLConnection;

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v0

    .line 368
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
    .line 373
    iget-object v0, p0, Lcom/splunk/mint/network/http/MonitorableHttpURLConnection;->original:Ljava/net/URLConnection;

    instance-of v0, v0, Ljava/net/HttpURLConnection;

    if-eqz v0, :cond_0

    .line 374
    iget-object v0, p0, Lcom/splunk/mint/network/http/MonitorableHttpURLConnection;->original:Ljava/net/URLConnection;

    check-cast v0, Ljava/net/HttpURLConnection;

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getResponseMessage()Ljava/lang/String;

    move-result-object v0

    .line 378
    :goto_0
    return-object v0

    :cond_0
    const-string v0, ""

    goto :goto_0
.end method

.method public getURL()Ljava/net/URL;
    .locals 1

    .prologue
    .line 270
    iget-object v0, p0, Lcom/splunk/mint/network/http/MonitorableHttpURLConnection;->original:Ljava/net/URLConnection;

    invoke-virtual {v0}, Ljava/net/URLConnection;->getURL()Ljava/net/URL;

    move-result-object v0

    return-object v0
.end method

.method public getUseCaches()Z
    .locals 1

    .prologue
    .line 275
    iget-object v0, p0, Lcom/splunk/mint/network/http/MonitorableHttpURLConnection;->original:Ljava/net/URLConnection;

    invoke-virtual {v0}, Ljava/net/URLConnection;->getUseCaches()Z

    move-result v0

    return v0
.end method

.method public setAllowUserInteraction(Z)V
    .locals 1
    .param p1, "newValue"    # Z

    .prologue
    .line 280
    iget-object v0, p0, Lcom/splunk/mint/network/http/MonitorableHttpURLConnection;->original:Ljava/net/URLConnection;

    invoke-virtual {v0, p1}, Ljava/net/URLConnection;->setAllowUserInteraction(Z)V

    .line 281
    return-void
.end method

.method public setChunkedStreamingMode(I)V
    .locals 1
    .param p1, "chunkLength"    # I

    .prologue
    .line 383
    iget-object v0, p0, Lcom/splunk/mint/network/http/MonitorableHttpURLConnection;->original:Ljava/net/URLConnection;

    instance-of v0, v0, Ljava/net/HttpURLConnection;

    if-eqz v0, :cond_0

    .line 384
    iget-object v0, p0, Lcom/splunk/mint/network/http/MonitorableHttpURLConnection;->original:Ljava/net/URLConnection;

    check-cast v0, Ljava/net/HttpURLConnection;

    invoke-virtual {v0, p1}, Ljava/net/HttpURLConnection;->setChunkedStreamingMode(I)V

    .line 386
    :cond_0
    return-void
.end method

.method public setConnectTimeout(I)V
    .locals 1
    .param p1, "timeoutMillis"    # I

    .prologue
    .line 285
    iget-object v0, p0, Lcom/splunk/mint/network/http/MonitorableHttpURLConnection;->original:Ljava/net/URLConnection;

    invoke-virtual {v0, p1}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    .line 286
    return-void
.end method

.method public setDefaultUseCaches(Z)V
    .locals 1
    .param p1, "newValue"    # Z

    .prologue
    .line 290
    iget-object v0, p0, Lcom/splunk/mint/network/http/MonitorableHttpURLConnection;->original:Ljava/net/URLConnection;

    invoke-virtual {v0, p1}, Ljava/net/URLConnection;->setDefaultUseCaches(Z)V

    .line 291
    return-void
.end method

.method public setDoInput(Z)V
    .locals 1
    .param p1, "newValue"    # Z

    .prologue
    .line 295
    iget-object v0, p0, Lcom/splunk/mint/network/http/MonitorableHttpURLConnection;->original:Ljava/net/URLConnection;

    invoke-virtual {v0, p1}, Ljava/net/URLConnection;->setDoInput(Z)V

    .line 296
    return-void
.end method

.method public setDoOutput(Z)V
    .locals 1
    .param p1, "newValue"    # Z

    .prologue
    .line 300
    iget-object v0, p0, Lcom/splunk/mint/network/http/MonitorableHttpURLConnection;->original:Ljava/net/URLConnection;

    invoke-virtual {v0, p1}, Ljava/net/URLConnection;->setDoOutput(Z)V

    .line 301
    return-void
.end method

.method public setFixedLengthStreamingMode(I)V
    .locals 1
    .param p1, "contentLength"    # I

    .prologue
    .line 390
    iget-object v0, p0, Lcom/splunk/mint/network/http/MonitorableHttpURLConnection;->original:Ljava/net/URLConnection;

    instance-of v0, v0, Ljava/net/HttpURLConnection;

    if-eqz v0, :cond_0

    .line 391
    iget-object v0, p0, Lcom/splunk/mint/network/http/MonitorableHttpURLConnection;->original:Ljava/net/URLConnection;

    check-cast v0, Ljava/net/HttpURLConnection;

    invoke-virtual {v0, p1}, Ljava/net/HttpURLConnection;->setFixedLengthStreamingMode(I)V

    .line 393
    :cond_0
    return-void
.end method

.method public setIfModifiedSince(J)V
    .locals 1
    .param p1, "newValue"    # J

    .prologue
    .line 305
    iget-object v0, p0, Lcom/splunk/mint/network/http/MonitorableHttpURLConnection;->original:Ljava/net/URLConnection;

    invoke-virtual {v0, p1, p2}, Ljava/net/URLConnection;->setIfModifiedSince(J)V

    .line 306
    return-void
.end method

.method public setInstanceFollowRedirects(Z)V
    .locals 1
    .param p1, "followRedirects"    # Z

    .prologue
    .line 397
    iget-object v0, p0, Lcom/splunk/mint/network/http/MonitorableHttpURLConnection;->original:Ljava/net/URLConnection;

    instance-of v0, v0, Ljava/net/HttpURLConnection;

    if-eqz v0, :cond_0

    .line 398
    iget-object v0, p0, Lcom/splunk/mint/network/http/MonitorableHttpURLConnection;->original:Ljava/net/URLConnection;

    check-cast v0, Ljava/net/HttpURLConnection;

    invoke-virtual {v0, p1}, Ljava/net/HttpURLConnection;->setInstanceFollowRedirects(Z)V

    .line 400
    :cond_0
    return-void
.end method

.method public setReadTimeout(I)V
    .locals 1
    .param p1, "timeoutMillis"    # I

    .prologue
    .line 310
    iget-object v0, p0, Lcom/splunk/mint/network/http/MonitorableHttpURLConnection;->original:Ljava/net/URLConnection;

    invoke-virtual {v0, p1}, Ljava/net/URLConnection;->setReadTimeout(I)V

    .line 311
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
    .line 404
    iget-object v0, p0, Lcom/splunk/mint/network/http/MonitorableHttpURLConnection;->original:Ljava/net/URLConnection;

    instance-of v0, v0, Ljava/net/HttpURLConnection;

    if-eqz v0, :cond_0

    .line 405
    iget-object v0, p0, Lcom/splunk/mint/network/http/MonitorableHttpURLConnection;->original:Ljava/net/URLConnection;

    check-cast v0, Ljava/net/HttpURLConnection;

    invoke-virtual {v0, p1}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 407
    :cond_0
    return-void
.end method

.method public setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .param p1, "field"    # Ljava/lang/String;
    .param p2, "newValue"    # Ljava/lang/String;

    .prologue
    .line 315
    iget-object v0, p0, Lcom/splunk/mint/network/http/MonitorableHttpURLConnection;->original:Ljava/net/URLConnection;

    invoke-virtual {v0, p1, p2}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 316
    return-void
.end method

.method public setUseCaches(Z)V
    .locals 1
    .param p1, "newValue"    # Z

    .prologue
    .line 320
    iget-object v0, p0, Lcom/splunk/mint/network/http/MonitorableHttpURLConnection;->original:Ljava/net/URLConnection;

    invoke-virtual {v0, p1}, Ljava/net/URLConnection;->setUseCaches(Z)V

    .line 321
    return-void
.end method

.method public usingProxy()Z
    .locals 1

    .prologue
    .line 325
    iget-object v0, p0, Lcom/splunk/mint/network/http/MonitorableHttpURLConnection;->original:Ljava/net/URLConnection;

    instance-of v0, v0, Ljava/net/HttpURLConnection;

    if-eqz v0, :cond_0

    .line 326
    iget-object v0, p0, Lcom/splunk/mint/network/http/MonitorableHttpURLConnection;->original:Ljava/net/URLConnection;

    check-cast v0, Ljava/net/HttpURLConnection;

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->usingProxy()Z

    move-result v0

    .line 329
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
