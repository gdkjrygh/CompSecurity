.class public Lcom/splunk/mint/network/NetLogManager;
.super Ljava/lang/Object;
.source "NetLogManager.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/splunk/mint/network/NetLogManager$StartConnectionInfo;
    }
.end annotation


# static fields
.field private static final CONNECTION_TIMEOUT:J = 0xea60L

.field private static volatile connectionsMap:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Lcom/splunk/mint/network/NetLogManager$StartConnectionInfo;",
            ">;"
        }
    .end annotation
.end field

.field private static mNetLogManager:Lcom/splunk/mint/network/NetLogManager;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 24
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/splunk/mint/network/NetLogManager;->connectionsMap:Ljava/util/HashMap;

    .line 164
    const/4 v0, 0x0

    sput-object v0, Lcom/splunk/mint/network/NetLogManager;->mNetLogManager:Lcom/splunk/mint/network/NetLogManager;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 239
    return-void
.end method

.method private checkIfURLisExcluded(Ljava/lang/String;)Z
    .locals 4
    .param p1, "url"    # Ljava/lang/String;

    .prologue
    .line 175
    sget-object v3, Lcom/splunk/mint/Properties;->excludedUrls:Lcom/splunk/mint/ExcludedUrls;

    if-eqz v3, :cond_1

    .line 176
    invoke-direct {p0, p1}, Lcom/splunk/mint/network/NetLogManager;->cleanUrl(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 177
    .local v0, "clearUrl":Ljava/lang/String;
    sget-object v3, Lcom/splunk/mint/Properties;->excludedUrls:Lcom/splunk/mint/ExcludedUrls;

    invoke-virtual {v3}, Lcom/splunk/mint/ExcludedUrls;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .local v2, "i$":Ljava/util/Iterator;
    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 178
    .local v1, "excludedUrl":Ljava/lang/String;
    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 179
    const/4 v3, 0x1

    .line 183
    .end local v0    # "clearUrl":Ljava/lang/String;
    .end local v1    # "excludedUrl":Ljava/lang/String;
    .end local v2    # "i$":Ljava/util/Iterator;
    :goto_0
    return v3

    :cond_1
    const/4 v3, 0x0

    goto :goto_0
.end method

.method private cleanUrl(Ljava/lang/String;)Ljava/lang/String;
    .locals 2
    .param p1, "url"    # Ljava/lang/String;

    .prologue
    .line 187
    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p1

    .line 188
    const-string v0, "https://"

    const-string v1, ""

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 189
    const-string v0, "http://"

    const-string v1, ""

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 190
    const-string v0, "www."

    const-string v1, ""

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 192
    return-object p1
.end method

.method public static deviceSupporsNetworkMonitoring()Z
    .locals 6

    .prologue
    const/4 v3, 0x0

    .line 198
    :try_start_0
    const-string v4, "java.net.PlainSocketImpl"

    invoke-static {v4}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    .line 199
    .local v2, "implCl":Ljava/lang/Class;
    if-nez v2, :cond_1

    .line 214
    :cond_0
    :goto_0
    return v3

    .line 202
    :cond_1
    const/4 v4, 0x0

    new-array v4, v4, [Ljava/lang/Class;

    invoke-virtual {v2, v4}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    .line 203
    .local v0, "delegateConstructor":Ljava/lang/reflect/Constructor;
    if-eqz v0, :cond_0

    .line 206
    const/4 v4, 0x0

    new-array v4, v4, [Ljava/lang/Object;

    invoke-virtual {v0, v4}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 207
    const-string v4, "Device supports Network Monitoring"

    invoke-static {v4}, Lcom/splunk/mint/Logger;->logInfo(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 208
    const/4 v3, 0x1

    goto :goto_0

    .line 209
    .end local v0    # "delegateConstructor":Ljava/lang/reflect/Constructor;
    :catch_0
    move-exception v1

    .line 210
    .local v1, "e":Ljava/lang/RuntimeException;
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "deviceSupporsNetworkMonitoring: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v1}, Ljava/lang/RuntimeException;->getMessage()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/splunk/mint/Logger;->logInfo(Ljava/lang/String;)V

    goto :goto_0

    .line 211
    .end local v1    # "e":Ljava/lang/RuntimeException;
    :catch_1
    move-exception v1

    .line 212
    .local v1, "e":Ljava/lang/Exception;
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "deviceSupporsNetworkMonitoring: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/splunk/mint/Logger;->logInfo(Ljava/lang/String;)V

    goto :goto_0
.end method

.method public static getInstance()Lcom/splunk/mint/network/NetLogManager;
    .locals 1

    .prologue
    .line 167
    sget-object v0, Lcom/splunk/mint/network/NetLogManager;->mNetLogManager:Lcom/splunk/mint/network/NetLogManager;

    if-nez v0, :cond_0

    .line 168
    new-instance v0, Lcom/splunk/mint/network/NetLogManager;

    invoke-direct {v0}, Lcom/splunk/mint/network/NetLogManager;-><init>()V

    sput-object v0, Lcom/splunk/mint/network/NetLogManager;->mNetLogManager:Lcom/splunk/mint/network/NetLogManager;

    .line 171
    :cond_0
    sget-object v0, Lcom/splunk/mint/network/NetLogManager;->mNetLogManager:Lcom/splunk/mint/network/NetLogManager;

    return-object v0
.end method

.method public static final getStatusCodeFromURLConnection(Ljava/net/URLConnection;)I
    .locals 2
    .param p0, "mURLConnection"    # Ljava/net/URLConnection;

    .prologue
    .line 218
    const/4 v0, 0x0

    .line 219
    .local v0, "statusCode":I
    if-eqz p0, :cond_0

    .line 220
    instance-of v1, p0, Ljava/net/HttpURLConnection;

    if-eqz v1, :cond_1

    .line 223
    :try_start_0
    check-cast p0, Ljava/net/HttpURLConnection;

    .end local p0    # "mURLConnection":Ljava/net/URLConnection;
    invoke-virtual {p0}, Ljava/net/HttpURLConnection;->getResponseCode()I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    move-result v0

    .line 235
    :cond_0
    :goto_0
    return v0

    .line 227
    .restart local p0    # "mURLConnection":Ljava/net/URLConnection;
    :cond_1
    instance-of v1, p0, Ljavax/net/ssl/HttpsURLConnection;

    if-eqz v1, :cond_0

    .line 229
    :try_start_1
    check-cast p0, Ljavax/net/ssl/HttpsURLConnection;

    .end local p0    # "mURLConnection":Ljava/net/URLConnection;
    invoke-virtual {p0}, Ljavax/net/ssl/HttpsURLConnection;->getResponseCode()I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    move-result v0

    goto :goto_0

    .line 230
    :catch_0
    move-exception v1

    goto :goto_0

    .line 224
    :catch_1
    move-exception v1

    goto :goto_0
.end method

.method private declared-synchronized removeOldEntries()V
    .locals 8

    .prologue
    .line 149
    monitor-enter p0

    :try_start_0
    sget-object v4, Lcom/splunk/mint/network/NetLogManager;->connectionsMap:Ljava/util/HashMap;

    invoke-virtual {v4}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .line 150
    .local v0, "it":Ljava/util/Iterator;, "Ljava/util/Iterator<Ljava/util/Map$Entry<Ljava/lang/String;Lcom/splunk/mint/network/NetLogManager$StartConnectionInfo;>;>;"
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    .line 151
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 153
    .local v1, "pairs":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Lcom/splunk/mint/network/NetLogManager$StartConnectionInfo;>;"
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/splunk/mint/network/NetLogManager$StartConnectionInfo;

    iget-object v4, v4, Lcom/splunk/mint/network/NetLogManager$StartConnectionInfo;->startTime:Ljava/lang/Long;

    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    .line 155
    .local v2, "startTime":J
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    sub-long/2addr v4, v2

    const-wide/32 v6, 0xea60

    cmp-long v4, v4, v6

    if-lez v4, :cond_0

    .line 157
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 149
    .end local v0    # "it":Ljava/util/Iterator;, "Ljava/util/Iterator<Ljava/util/Map$Entry<Ljava/lang/String;Lcom/splunk/mint/network/NetLogManager$StartConnectionInfo;>;>;"
    .end local v1    # "pairs":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Lcom/splunk/mint/network/NetLogManager$StartConnectionInfo;>;"
    .end local v2    # "startTime":J
    :catchall_0
    move-exception v4

    monitor-exit p0

    throw v4

    .line 162
    .restart local v0    # "it":Ljava/util/Iterator;, "Ljava/util/Iterator<Ljava/util/Map$Entry<Ljava/lang/String;Lcom/splunk/mint/network/NetLogManager$StartConnectionInfo;>;>;"
    :cond_1
    monitor-exit p0

    return-void
.end method


# virtual methods
.method public declared-synchronized cancelNetworkCall(Lcom/splunk/mint/network/MonitorRegistry;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)V
    .locals 17
    .param p1, "registry"    # Lcom/splunk/mint/network/MonitorRegistry;
    .param p2, "netCallID"    # Ljava/lang/String;
    .param p3, "stopTime"    # J
    .param p5, "protocol"    # Ljava/lang/String;
    .param p6, "exception"    # Ljava/lang/String;

    .prologue
    .line 118
    monitor-enter p0

    :try_start_0
    move-object/from16 v0, p0

    move-object/from16 v1, p2

    invoke-direct {v0, v1}, Lcom/splunk/mint/network/NetLogManager;->cleanUrl(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 121
    sget-object v3, Lcom/splunk/mint/network/NetLogManager;->connectionsMap:Ljava/util/HashMap;

    if-eqz v3, :cond_0

    sget-object v3, Lcom/splunk/mint/network/NetLogManager;->connectionsMap:Ljava/util/HashMap;

    move-object/from16 v0, p2

    invoke-virtual {v3, v0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 123
    sget-object v3, Lcom/splunk/mint/network/NetLogManager;->connectionsMap:Ljava/util/HashMap;

    move-object/from16 v0, p2

    invoke-virtual {v3, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/splunk/mint/network/NetLogManager$StartConnectionInfo;

    .line 125
    .local v2, "mSCI":Lcom/splunk/mint/network/NetLogManager$StartConnectionInfo;
    if-eqz v2, :cond_0

    .line 127
    sget-object v3, Lcom/splunk/mint/network/NetLogManager;->connectionsMap:Ljava/util/HashMap;

    move-object/from16 v0, p2

    invoke-virtual {v3, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 129
    iget-object v3, v2, Lcom/splunk/mint/network/NetLogManager$StartConnectionInfo;->url:Ljava/lang/String;

    iget-object v4, v2, Lcom/splunk/mint/network/NetLogManager$StartConnectionInfo;->startTime:Ljava/lang/Long;

    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const-wide/16 v12, 0x0

    const-wide/16 v14, 0x0

    move-wide/from16 v6, p3

    move-object/from16 v8, p5

    move-object/from16 v16, p6

    invoke-static/range {v3 .. v16}, Lcom/splunk/mint/ActionNetwork;->logNetwork(Ljava/lang/String;JJLjava/lang/String;Ljava/util/Map;Ljava/util/Map;IJJLjava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 135
    .end local v2    # "mSCI":Lcom/splunk/mint/network/NetLogManager$StartConnectionInfo;
    :cond_0
    monitor-exit p0

    return-void

    .line 118
    :catchall_0
    move-exception v3

    monitor-exit p0

    throw v3
.end method

.method public declared-synchronized endNetworkCall(Lcom/splunk/mint/network/MonitorRegistry;Ljava/lang/String;JLjava/util/Map;I)V
    .locals 21
    .param p1, "registry"    # Lcom/splunk/mint/network/MonitorRegistry;
    .param p2, "netCallID"    # Ljava/lang/String;
    .param p3, "stopTime"    # J
    .param p6, "statusCode"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/splunk/mint/network/MonitorRegistry;",
            "Ljava/lang/String;",
            "J",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;>;I)V"
        }
    .end annotation

    .prologue
    .line 62
    .local p5, "respHeaders":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/util/List<Ljava/lang/String;>;>;"
    monitor-enter p0

    :try_start_0
    move-object/from16 v0, p0

    move-object/from16 v1, p2

    invoke-direct {v0, v1}, Lcom/splunk/mint/network/NetLogManager;->cleanUrl(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 66
    sget-object v3, Lcom/splunk/mint/network/NetLogManager;->connectionsMap:Ljava/util/HashMap;

    if-eqz v3, :cond_3

    sget-object v3, Lcom/splunk/mint/network/NetLogManager;->connectionsMap:Ljava/util/HashMap;

    move-object/from16 v0, p2

    invoke-virtual {v3, v0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 68
    sget-object v3, Lcom/splunk/mint/network/NetLogManager;->connectionsMap:Ljava/util/HashMap;

    move-object/from16 v0, p2

    invoke-virtual {v3, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v19

    check-cast v19, Lcom/splunk/mint/network/NetLogManager$StartConnectionInfo;

    .line 70
    .local v19, "mSCI":Lcom/splunk/mint/network/NetLogManager$StartConnectionInfo;
    if-eqz v19, :cond_3

    .line 72
    sget-object v3, Lcom/splunk/mint/network/NetLogManager;->connectionsMap:Ljava/util/HashMap;

    move-object/from16 v0, p2

    invoke-virtual {v3, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    const-wide/16 v4, 0x0

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    .line 76
    .local v2, "bytesOut":Ljava/lang/Long;
    const-wide/16 v14, 0x0

    .line 78
    .local v14, "bytesIn":J
    invoke-virtual/range {p1 .. p2}, Lcom/splunk/mint/network/MonitorRegistry;->getMetricsForName(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v17

    .local v17, "i$":Ljava/util/Iterator;
    :cond_0
    :goto_0
    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v18

    check-cast v18, Lcom/splunk/mint/network/Metric;

    .line 79
    .local v18, "m":Lcom/splunk/mint/network/Metric;, "Lcom/splunk/mint/network/Metric<*>;"
    move-object/from16 v0, v18

    instance-of v3, v0, Lcom/splunk/mint/network/Counter;

    if-eqz v3, :cond_0

    .line 80
    move-object/from16 v0, v18

    check-cast v0, Lcom/splunk/mint/network/Counter;

    move-object v3, v0

    invoke-virtual {v3}, Lcom/splunk/mint/network/Counter;->getName()Ljava/lang/String;

    move-result-object v3

    const-string v4, "-bytes-out"

    invoke-virtual {v3, v4}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 81
    invoke-virtual/range {v18 .. v18}, Lcom/splunk/mint/network/Metric;->getValue()Ljava/io/Serializable;

    move-result-object v2

    .end local v2    # "bytesOut":Ljava/lang/Long;
    check-cast v2, Ljava/lang/Long;

    .restart local v2    # "bytesOut":Ljava/lang/Long;
    goto :goto_0

    .line 82
    :cond_1
    move-object/from16 v0, v18

    check-cast v0, Lcom/splunk/mint/network/Counter;

    move-object v3, v0

    invoke-virtual {v3}, Lcom/splunk/mint/network/Counter;->getName()Ljava/lang/String;

    move-result-object v3

    const-string v4, "-bytes-in"

    invoke-virtual {v3, v4}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 83
    invoke-virtual/range {v18 .. v18}, Lcom/splunk/mint/network/Metric;->getValue()Ljava/io/Serializable;

    move-result-object v3

    check-cast v3, Ljava/lang/Long;

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v14

    goto :goto_0

    .line 89
    .end local v18    # "m":Lcom/splunk/mint/network/Metric;, "Lcom/splunk/mint/network/Metric<*>;"
    :cond_2
    const/4 v9, 0x0

    .line 102
    .local v9, "reqHeaders":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/util/List<Ljava/lang/String;>;>;"
    move-object/from16 v0, v19

    iget-object v3, v0, Lcom/splunk/mint/network/NetLogManager$StartConnectionInfo;->url:Ljava/lang/String;

    move-object/from16 v0, v19

    iget-object v4, v0, Lcom/splunk/mint/network/NetLogManager$StartConnectionInfo;->startTime:Ljava/lang/Long;

    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    move-object/from16 v0, v19

    iget-object v8, v0, Lcom/splunk/mint/network/NetLogManager$StartConnectionInfo;->protocol:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v12

    const/16 v16, 0x0

    move-wide/from16 v6, p3

    move-object/from16 v10, p5

    move/from16 v11, p6

    invoke-static/range {v3 .. v16}, Lcom/splunk/mint/ActionNetwork;->logNetwork(Ljava/lang/String;JJLjava/lang/String;Ljava/util/Map;Ljava/util/Map;IJJLjava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 108
    .end local v2    # "bytesOut":Ljava/lang/Long;
    .end local v9    # "reqHeaders":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/util/List<Ljava/lang/String;>;>;"
    .end local v14    # "bytesIn":J
    .end local v17    # "i$":Ljava/util/Iterator;
    .end local v19    # "mSCI":Lcom/splunk/mint/network/NetLogManager$StartConnectionInfo;
    :cond_3
    monitor-exit p0

    return-void

    .line 62
    :catchall_0
    move-exception v3

    monitor-exit p0

    throw v3
.end method

.method public declared-synchronized logNetworkRequest(Ljava/lang/String;Ljava/lang/String;JJLjava/util/Map;Ljava/util/Map;IJJLjava/lang/String;)V
    .locals 15
    .param p1, "url"    # Ljava/lang/String;
    .param p2, "protocol"    # Ljava/lang/String;
    .param p3, "startT"    # J
    .param p5, "endT"    # J
    .param p9, "statusCode"    # I
    .param p10, "requestLength"    # J
    .param p12, "responseLength"    # J
    .param p14, "exception"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "JJ",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;>;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;>;IJJ",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .prologue
    .line 140
    .local p7, "reqHeaders":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/util/List<Ljava/lang/String;>;>;"
    .local p8, "respHeaders":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/util/List<Ljava/lang/String;>;>;"
    monitor-enter p0

    :try_start_0
    invoke-direct/range {p0 .. p1}, Lcom/splunk/mint/network/NetLogManager;->checkIfURLisExcluded(Ljava/lang/String;)Z

    move-result v0

    .line 142
    .local v0, "toBeExcluded":Z
    if-nez v0, :cond_0

    move-object/from16 v1, p1

    move-wide/from16 v2, p3

    move-wide/from16 v4, p5

    move-object/from16 v6, p2

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    move/from16 v9, p9

    move-wide/from16 v10, p10

    move-wide/from16 v12, p12

    move-object/from16 v14, p14

    .line 143
    invoke-static/range {v1 .. v14}, Lcom/splunk/mint/ActionNetwork;->logNetwork(Ljava/lang/String;JJLjava/lang/String;Ljava/util/Map;Ljava/util/Map;IJJLjava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 146
    :cond_0
    monitor-exit p0

    return-void

    .line 140
    .end local v0    # "toBeExcluded":Z
    :catchall_0
    move-exception v1

    monitor-exit p0

    throw v1
.end method

.method public declared-synchronized startNetworkCall(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V
    .locals 3
    .param p1, "netCallID"    # Ljava/lang/String;
    .param p2, "url"    # Ljava/lang/String;
    .param p3, "startTime"    # J
    .param p5, "protocol"    # Ljava/lang/String;

    .prologue
    .line 38
    monitor-enter p0

    :try_start_0
    invoke-direct {p0, p1}, Lcom/splunk/mint/network/NetLogManager;->cleanUrl(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 42
    invoke-direct {p0, p2}, Lcom/splunk/mint/network/NetLogManager;->checkIfURLisExcluded(Ljava/lang/String;)Z

    move-result v1

    .line 44
    .local v1, "toBeExcluded":Z
    if-nez v1, :cond_0

    .line 46
    new-instance v0, Lcom/splunk/mint/network/NetLogManager$StartConnectionInfo;

    invoke-direct {v0, p0}, Lcom/splunk/mint/network/NetLogManager$StartConnectionInfo;-><init>(Lcom/splunk/mint/network/NetLogManager;)V

    .line 48
    .local v0, "mStartConnectionInfo":Lcom/splunk/mint/network/NetLogManager$StartConnectionInfo;
    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    iput-object v2, v0, Lcom/splunk/mint/network/NetLogManager$StartConnectionInfo;->startTime:Ljava/lang/Long;

    .line 49
    iput-object p2, v0, Lcom/splunk/mint/network/NetLogManager$StartConnectionInfo;->url:Ljava/lang/String;

    .line 50
    iput-object p5, v0, Lcom/splunk/mint/network/NetLogManager$StartConnectionInfo;->protocol:Ljava/lang/String;

    .line 52
    sget-object v2, Lcom/splunk/mint/network/NetLogManager;->connectionsMap:Ljava/util/HashMap;

    invoke-virtual {v2, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    invoke-direct {p0}, Lcom/splunk/mint/network/NetLogManager;->removeOldEntries()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 57
    .end local v0    # "mStartConnectionInfo":Lcom/splunk/mint/network/NetLogManager$StartConnectionInfo;
    :cond_0
    monitor-exit p0

    return-void

    .line 38
    .end local v1    # "toBeExcluded":Z
    :catchall_0
    move-exception v2

    monitor-exit p0

    throw v2
.end method
