.class public Lcom/splunk/mint/network/socket/MonitoringSocketImpl;
.super Ljava/net/SocketImpl;
.source "MonitoringSocketImpl.java"


# static fields
.field public static final ENCAPSULATED_SOCKET_IMPL:Ljava/lang/String; = "java.net.PlainSocketImpl"

.field private static final HTTP_CLASSES:[Ljava/lang/String;

.field private static final SYSTEM_PACKAGES:[Ljava/lang/String;


# instance fields
.field private final delegator:Lcom/splunk/mint/network/util/Delegator;

.field private final http:Z

.field private mInputStreamMonitor:Lcom/splunk/mint/network/io/InputStreamMonitor;

.field private mInputStreamMonitorKitKat:Lcom/splunk/mint/network/io/InputStreamMonitorKitKat;

.field private mOutputStreamMonitor:Lcom/splunk/mint/network/io/OutputStreamMonitor;

.field private final method:Ljava/lang/String;

.field private name:Ljava/lang/String;

.field private protocol:Ljava/lang/String;

.field private readingDone:Z

.field private final registry:Lcom/splunk/mint/network/MonitorRegistry;

.field private startTime:J


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .prologue
    const/4 v6, 0x4

    const/4 v5, 0x3

    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 36
    const/4 v0, 0x5

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "android"

    aput-object v1, v0, v2

    const-string v1, "java"

    aput-object v1, v0, v3

    const-string v1, "org.apache"

    aput-object v1, v0, v4

    const-string v1, "splunk"

    aput-object v1, v0, v5

    const-string v1, "libcore"

    aput-object v1, v0, v6

    sput-object v0, Lcom/splunk/mint/network/socket/MonitoringSocketImpl;->SYSTEM_PACKAGES:[Ljava/lang/String;

    .line 38
    new-array v0, v6, [Ljava/lang/String;

    const-string v1, "HttpClient"

    aput-object v1, v0, v2

    const-string v1, "URLConnection"

    aput-object v1, v0, v3

    const-string v1, "HttpsURLConnectionImpl"

    aput-object v1, v0, v4

    const-string v1, "HttpURLConnectionImpl"

    aput-object v1, v0, v5

    sput-object v0, Lcom/splunk/mint/network/socket/MonitoringSocketImpl;->HTTP_CLASSES:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lcom/splunk/mint/network/MonitorRegistry;)V
    .locals 3
    .param p1, "registry"    # Lcom/splunk/mint/network/MonitorRegistry;

    .prologue
    const/4 v0, 0x0

    .line 55
    invoke-direct {p0}, Ljava/net/SocketImpl;-><init>()V

    .line 41
    iput-object v0, p0, Lcom/splunk/mint/network/socket/MonitoringSocketImpl;->mInputStreamMonitor:Lcom/splunk/mint/network/io/InputStreamMonitor;

    .line 42
    iput-object v0, p0, Lcom/splunk/mint/network/socket/MonitoringSocketImpl;->mOutputStreamMonitor:Lcom/splunk/mint/network/io/OutputStreamMonitor;

    .line 44
    iput-object v0, p0, Lcom/splunk/mint/network/socket/MonitoringSocketImpl;->mInputStreamMonitorKitKat:Lcom/splunk/mint/network/io/InputStreamMonitorKitKat;

    .line 52
    const-string v0, "NA"

    iput-object v0, p0, Lcom/splunk/mint/network/socket/MonitoringSocketImpl;->protocol:Ljava/lang/String;

    .line 145
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/splunk/mint/network/socket/MonitoringSocketImpl;->readingDone:Z

    .line 57
    sget-object v0, Lcom/splunk/mint/network/socket/MonitoringSocketImpl;->SYSTEM_PACKAGES:[Ljava/lang/String;

    invoke-static {v0}, Lcom/splunk/mint/network/util/ReflectionUtil;->extractCallingMethod([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/splunk/mint/network/socket/MonitoringSocketImpl;->method:Ljava/lang/String;

    .line 58
    sget-object v0, Lcom/splunk/mint/network/socket/MonitoringSocketImpl;->HTTP_CLASSES:[Ljava/lang/String;

    invoke-static {v0}, Lcom/splunk/mint/network/util/ReflectionUtil;->callingClassAnyOf([Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/splunk/mint/network/socket/MonitoringSocketImpl;->http:Z

    .line 59
    new-instance v0, Lcom/splunk/mint/network/util/Delegator;

    const-class v1, Ljava/net/SocketImpl;

    const-string v2, "java.net.PlainSocketImpl"

    invoke-direct {v0, p0, v1, v2}, Lcom/splunk/mint/network/util/Delegator;-><init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/splunk/mint/network/socket/MonitoringSocketImpl;->delegator:Lcom/splunk/mint/network/util/Delegator;

    .line 60
    iput-object p1, p0, Lcom/splunk/mint/network/socket/MonitoringSocketImpl;->registry:Lcom/splunk/mint/network/MonitorRegistry;

    .line 61
    return-void
.end method

.method private createActionEventFromCollectedStats(Ljava/util/ArrayList;Ljava/util/HashMap;Ljava/util/HashMap;J)V
    .locals 22
    .param p4, "endTime"    # J
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/splunk/mint/network/Metric",
            "<*>;>;",
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;>;",
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;>;J)V"
        }
    .end annotation

    .prologue
    .line 174
    .local p1, "metrics":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/splunk/mint/network/Metric<*>;>;"
    .local p2, "outputHeaders":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/util/List<Ljava/lang/String;>;>;"
    .local p3, "inputHeaders":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/util/List<Ljava/lang/String;>;>;"
    const-string v3, ""

    .line 176
    .local v3, "url":Ljava/lang/String;
    :try_start_0
    const-string v2, "Host"

    move-object/from16 v0, p2

    invoke-virtual {v0, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    const/4 v4, 0x0

    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    move-object v0, v2

    check-cast v0, Ljava/lang/String;

    move-object v3, v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_3

    .line 181
    :goto_0
    :try_start_1
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v2, "splk-host2"

    move-object/from16 v0, p2

    invoke-virtual {v0, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    const/4 v5, 0x0

    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2

    move-result-object v3

    .line 186
    :goto_1
    const/4 v11, 0x0

    .line 188
    .local v11, "statuscode":I
    :try_start_2
    const-string v2, "splk-statuscode"

    move-object/from16 v0, p3

    invoke-virtual {v0, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    const/4 v4, 0x0

    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    move-result v11

    .line 194
    :goto_2
    const-wide/16 v4, 0x0

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v17

    .line 195
    .local v17, "bytesOut":Ljava/lang/Long;
    const-wide/16 v14, 0x0

    .line 197
    .local v14, "bytesIn":J
    invoke-virtual/range {p1 .. p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v19

    .local v19, "i$":Ljava/util/Iterator;
    :cond_0
    :goto_3
    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v20

    check-cast v20, Lcom/splunk/mint/network/Metric;

    .line 202
    .local v20, "m":Lcom/splunk/mint/network/Metric;, "Lcom/splunk/mint/network/Metric<*>;"
    move-object/from16 v0, v20

    instance-of v2, v0, Lcom/splunk/mint/network/Counter;

    if-eqz v2, :cond_0

    move-object/from16 v2, v20

    .line 203
    check-cast v2, Lcom/splunk/mint/network/Counter;

    invoke-virtual {v2}, Lcom/splunk/mint/network/Counter;->getName()Ljava/lang/String;

    move-result-object v2

    const-string v4, "-bytes-out"

    invoke-virtual {v2, v4}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 204
    invoke-virtual/range {v20 .. v20}, Lcom/splunk/mint/network/Metric;->getValue()Ljava/io/Serializable;

    move-result-object v17

    .end local v17    # "bytesOut":Ljava/lang/Long;
    check-cast v17, Ljava/lang/Long;

    .restart local v17    # "bytesOut":Ljava/lang/Long;
    goto :goto_3

    :cond_1
    move-object/from16 v2, v20

    .line 205
    check-cast v2, Lcom/splunk/mint/network/Counter;

    invoke-virtual {v2}, Lcom/splunk/mint/network/Counter;->getName()Ljava/lang/String;

    move-result-object v2

    const-string v4, "-bytes-in"

    invoke-virtual {v2, v4}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 206
    invoke-virtual/range {v20 .. v20}, Lcom/splunk/mint/network/Metric;->getValue()Ljava/io/Serializable;

    move-result-object v2

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v14

    goto :goto_3

    .line 212
    .end local v20    # "m":Lcom/splunk/mint/network/Metric;, "Lcom/splunk/mint/network/Metric<*>;"
    :cond_2
    :try_start_3
    const-string v2, "Content-Length"

    move-object/from16 v0, p3

    invoke-virtual {v0, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    const/4 v4, 0x0

    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-static {v2}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    move-result-wide v14

    .line 217
    :goto_4
    invoke-static {}, Lcom/splunk/mint/network/NetLogManager;->getInstance()Lcom/splunk/mint/network/NetLogManager;

    move-result-object v2

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/splunk/mint/network/socket/MonitoringSocketImpl;->protocol:Ljava/lang/String;

    move-object/from16 v0, p0

    iget-wide v5, v0, Lcom/splunk/mint/network/socket/MonitoringSocketImpl;->startTime:J

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Long;->longValue()J

    move-result-wide v12

    const/16 v16, 0x0

    move-wide/from16 v7, p4

    move-object/from16 v9, p2

    move-object/from16 v10, p3

    invoke-virtual/range {v2 .. v16}, Lcom/splunk/mint/network/NetLogManager;->logNetworkRequest(Ljava/lang/String;Ljava/lang/String;JJLjava/util/Map;Ljava/util/Map;IJJLjava/lang/String;)V

    .line 220
    return-void

    .line 213
    :catch_0
    move-exception v18

    .line 214
    .local v18, "e":Ljava/lang/Exception;
    const-string v2, "Could not read the Content-Length value"

    invoke-static {v2}, Lcom/splunk/mint/Logger;->logWarning(Ljava/lang/String;)V

    goto :goto_4

    .line 189
    .end local v14    # "bytesIn":J
    .end local v17    # "bytesOut":Ljava/lang/Long;
    .end local v18    # "e":Ljava/lang/Exception;
    .end local v19    # "i$":Ljava/util/Iterator;
    :catch_1
    move-exception v2

    goto/16 :goto_2

    .line 182
    .end local v11    # "statuscode":I
    :catch_2
    move-exception v2

    goto/16 :goto_1

    .line 177
    :catch_3
    move-exception v2

    goto/16 :goto_0
.end method

.method private setProtocolFromPort(I)V
    .locals 1
    .param p1, "port"    # I

    .prologue
    .line 340
    const/16 v0, 0x50

    if-ne p1, v0, :cond_1

    .line 341
    const-string v0, "HTTP"

    iput-object v0, p0, Lcom/splunk/mint/network/socket/MonitoringSocketImpl;->protocol:Ljava/lang/String;

    .line 345
    :cond_0
    :goto_0
    return-void

    .line 342
    :cond_1
    const/16 v0, 0x1bb

    if-ne p1, v0, :cond_0

    .line 343
    const-string v0, "HTTPS"

    iput-object v0, p0, Lcom/splunk/mint/network/socket/MonitoringSocketImpl;->protocol:Ljava/lang/String;

    goto :goto_0
.end method


# virtual methods
.method protected accept(Ljava/net/SocketImpl;)V
    .locals 3
    .param p1, "newSocket"    # Ljava/net/SocketImpl;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 83
    iget-object v0, p0, Lcom/splunk/mint/network/socket/MonitoringSocketImpl;->delegator:Lcom/splunk/mint/network/util/Delegator;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-virtual {v0, v1}, Lcom/splunk/mint/network/util/Delegator;->invoke([Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    return-void
.end method

.method protected available()I
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 89
    iget-object v1, p0, Lcom/splunk/mint/network/socket/MonitoringSocketImpl;->delegator:Lcom/splunk/mint/network/util/Delegator;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v1, v2}, Lcom/splunk/mint/network/util/Delegator;->invoke([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    .line 90
    .local v0, "result":Ljava/lang/Integer;
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v1

    return v1
.end method

.method protected bind(Ljava/net/InetAddress;I)V
    .locals 4
    .param p1, "address"    # Ljava/net/InetAddress;
    .param p2, "port"    # I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 72
    invoke-virtual {p1}, Ljava/net/InetAddress;->getHostName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/splunk/mint/network/socket/MonitoringSocketImpl;->name:Ljava/lang/String;

    .line 75
    iget-object v0, p0, Lcom/splunk/mint/network/socket/MonitoringSocketImpl;->delegator:Lcom/splunk/mint/network/util/Delegator;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const/4 v2, 0x1

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v1, v2

    invoke-virtual {v0, v1}, Lcom/splunk/mint/network/util/Delegator;->invoke([Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/splunk/mint/network/socket/MonitoringSocketImpl;->startTime:J

    .line 78
    return-void
.end method

.method protected close()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 139
    :try_start_0
    iget-object v1, p0, Lcom/splunk/mint/network/socket/MonitoringSocketImpl;->delegator:Lcom/splunk/mint/network/util/Delegator;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v1, v2}, Lcom/splunk/mint/network/util/Delegator;->invoke([Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 143
    :goto_0
    return-void

    .line 140
    :catch_0
    move-exception v0

    .line 141
    .local v0, "e":Ljava/lang/Exception;
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Error closing socket impl: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/splunk/mint/Logger;->logError(Ljava/lang/String;)V

    goto :goto_0
.end method

.method protected connect(Ljava/lang/String;I)V
    .locals 4
    .param p1, "host"    # Ljava/lang/String;
    .param p2, "port"    # I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 126
    iput-object p1, p0, Lcom/splunk/mint/network/socket/MonitoringSocketImpl;->name:Ljava/lang/String;

    .line 129
    iget-object v0, p0, Lcom/splunk/mint/network/socket/MonitoringSocketImpl;->delegator:Lcom/splunk/mint/network/util/Delegator;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const/4 v2, 0x1

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v1, v2

    invoke-virtual {v0, v1}, Lcom/splunk/mint/network/util/Delegator;->invoke([Ljava/lang/Object;)Ljava/lang/Object;

    .line 131
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/splunk/mint/network/socket/MonitoringSocketImpl;->startTime:J

    .line 132
    invoke-direct {p0, p2}, Lcom/splunk/mint/network/socket/MonitoringSocketImpl;->setProtocolFromPort(I)V

    .line 133
    return-void
.end method

.method protected connect(Ljava/net/InetAddress;I)V
    .locals 7
    .param p1, "address"    # Ljava/net/InetAddress;
    .param p2, "port"    # I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    const/4 v6, 0x2

    const/4 v5, 0x1

    const/4 v4, 0x0

    .line 96
    invoke-virtual {p1}, Ljava/net/InetAddress;->getHostName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/splunk/mint/network/socket/MonitoringSocketImpl;->name:Ljava/lang/String;

    .line 99
    iget-object v0, p0, Lcom/splunk/mint/network/socket/MonitoringSocketImpl;->delegator:Lcom/splunk/mint/network/util/Delegator;

    const-string v1, "connect"

    new-array v2, v6, [Ljava/lang/Class;

    const-class v3, Ljava/net/InetAddress;

    aput-object v3, v2, v4

    sget-object v3, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v3, v2, v5

    invoke-virtual {v0, v1, v2}, Lcom/splunk/mint/network/util/Delegator;->delegateTo(Ljava/lang/String;[Ljava/lang/Class;)Lcom/splunk/mint/network/util/Delegator$DelegatorMethodFinder;

    move-result-object v0

    new-array v1, v6, [Ljava/lang/Object;

    aput-object p1, v1, v4

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v1, v5

    invoke-virtual {v0, v1}, Lcom/splunk/mint/network/util/Delegator$DelegatorMethodFinder;->invoke([Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/splunk/mint/network/socket/MonitoringSocketImpl;->startTime:J

    .line 102
    invoke-direct {p0, p2}, Lcom/splunk/mint/network/socket/MonitoringSocketImpl;->setProtocolFromPort(I)V

    .line 103
    return-void
.end method

.method protected connect(Ljava/net/SocketAddress;I)V
    .locals 5
    .param p1, "remoteAddr"    # Ljava/net/SocketAddress;
    .param p2, "timeout"    # I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 108
    instance-of v1, p1, Ljava/net/InetSocketAddress;

    if-eqz v1, :cond_0

    move-object v0, p1

    .line 109
    check-cast v0, Ljava/net/InetSocketAddress;

    .line 110
    .local v0, "addr":Ljava/net/InetSocketAddress;
    invoke-virtual {v0}, Ljava/net/InetSocketAddress;->getHostName()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/splunk/mint/network/socket/MonitoringSocketImpl;->name:Ljava/lang/String;

    .line 111
    invoke-virtual {v0}, Ljava/net/InetSocketAddress;->getPort()I

    move-result v1

    invoke-direct {p0, v1}, Lcom/splunk/mint/network/socket/MonitoringSocketImpl;->setProtocolFromPort(I)V

    .line 118
    .end local v0    # "addr":Ljava/net/InetSocketAddress;
    :goto_0
    iget-object v1, p0, Lcom/splunk/mint/network/socket/MonitoringSocketImpl;->delegator:Lcom/splunk/mint/network/util/Delegator;

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    const/4 v3, 0x1

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-virtual {v1, v2}, Lcom/splunk/mint/network/util/Delegator;->invoke([Ljava/lang/Object;)Ljava/lang/Object;

    .line 119
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iput-wide v2, p0, Lcom/splunk/mint/network/socket/MonitoringSocketImpl;->startTime:J

    .line 121
    return-void

    .line 114
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/splunk/mint/network/socket/MonitoringSocketImpl;->name:Ljava/lang/String;

    goto :goto_0
.end method

.method protected create(Z)V
    .locals 4
    .param p1, "isStreaming"    # Z
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 66
    iget-object v0, p0, Lcom/splunk/mint/network/socket/MonitoringSocketImpl;->delegator:Lcom/splunk/mint/network/util/Delegator;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    aput-object v3, v1, v2

    invoke-virtual {v0, v1}, Lcom/splunk/mint/network/util/Delegator;->invoke([Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    return-void
.end method

.method protected getFileDescriptor()Ljava/io/FileDescriptor;
    .locals 2

    .prologue
    .line 271
    iget-object v0, p0, Lcom/splunk/mint/network/socket/MonitoringSocketImpl;->delegator:Lcom/splunk/mint/network/util/Delegator;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v0, v1}, Lcom/splunk/mint/network/util/Delegator;->invoke([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/io/FileDescriptor;

    return-object v0
.end method

.method protected getInetAddress()Ljava/net/InetAddress;
    .locals 2

    .prologue
    .line 276
    iget-object v0, p0, Lcom/splunk/mint/network/socket/MonitoringSocketImpl;->delegator:Lcom/splunk/mint/network/util/Delegator;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v0, v1}, Lcom/splunk/mint/network/util/Delegator;->invoke([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/net/InetAddress;

    return-object v0
.end method

.method protected getInputStream()Ljava/io/InputStream;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 224
    iget-object v1, p0, Lcom/splunk/mint/network/socket/MonitoringSocketImpl;->delegator:Lcom/splunk/mint/network/util/Delegator;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v1, v2}, Lcom/splunk/mint/network/util/Delegator;->invoke([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/io/InputStream;

    .line 225
    .local v0, "stream":Ljava/io/InputStream;
    sget-boolean v1, Lcom/splunk/mint/Properties;->isKitKat:Z

    if-eqz v1, :cond_1

    .line 226
    iget-object v1, p0, Lcom/splunk/mint/network/socket/MonitoringSocketImpl;->mInputStreamMonitorKitKat:Lcom/splunk/mint/network/io/InputStreamMonitorKitKat;

    if-nez v1, :cond_0

    .line 227
    new-instance v1, Lcom/splunk/mint/network/io/InputStreamMonitorKitKat;

    iget-object v2, p0, Lcom/splunk/mint/network/socket/MonitoringSocketImpl;->name:Ljava/lang/String;

    iget-object v3, p0, Lcom/splunk/mint/network/socket/MonitoringSocketImpl;->registry:Lcom/splunk/mint/network/MonitorRegistry;

    invoke-direct {v1, v2, v3, v0, p0}, Lcom/splunk/mint/network/io/InputStreamMonitorKitKat;-><init>(Ljava/lang/String;Lcom/splunk/mint/network/MonitorRegistry;Ljava/io/InputStream;Lcom/splunk/mint/network/socket/MonitoringSocketImpl;)V

    iput-object v1, p0, Lcom/splunk/mint/network/socket/MonitoringSocketImpl;->mInputStreamMonitorKitKat:Lcom/splunk/mint/network/io/InputStreamMonitorKitKat;

    .line 230
    :cond_0
    iget-object v1, p0, Lcom/splunk/mint/network/socket/MonitoringSocketImpl;->mInputStreamMonitorKitKat:Lcom/splunk/mint/network/io/InputStreamMonitorKitKat;

    .line 236
    :goto_0
    return-object v1

    .line 232
    :cond_1
    iget-object v1, p0, Lcom/splunk/mint/network/socket/MonitoringSocketImpl;->mInputStreamMonitor:Lcom/splunk/mint/network/io/InputStreamMonitor;

    if-nez v1, :cond_2

    .line 233
    new-instance v1, Lcom/splunk/mint/network/io/InputStreamMonitor;

    iget-object v2, p0, Lcom/splunk/mint/network/socket/MonitoringSocketImpl;->name:Ljava/lang/String;

    iget-object v3, p0, Lcom/splunk/mint/network/socket/MonitoringSocketImpl;->registry:Lcom/splunk/mint/network/MonitorRegistry;

    invoke-direct {v1, v2, v3, v0, p0}, Lcom/splunk/mint/network/io/InputStreamMonitor;-><init>(Ljava/lang/String;Lcom/splunk/mint/network/MonitorRegistry;Ljava/io/InputStream;Lcom/splunk/mint/network/socket/MonitoringSocketImpl;)V

    iput-object v1, p0, Lcom/splunk/mint/network/socket/MonitoringSocketImpl;->mInputStreamMonitor:Lcom/splunk/mint/network/io/InputStreamMonitor;

    .line 236
    :cond_2
    iget-object v1, p0, Lcom/splunk/mint/network/socket/MonitoringSocketImpl;->mInputStreamMonitor:Lcom/splunk/mint/network/io/InputStreamMonitor;

    goto :goto_0
.end method

.method protected getLocalPort()I
    .locals 3

    .prologue
    .line 281
    iget-object v1, p0, Lcom/splunk/mint/network/socket/MonitoringSocketImpl;->delegator:Lcom/splunk/mint/network/util/Delegator;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v1, v2}, Lcom/splunk/mint/network/util/Delegator;->invoke([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    .line 282
    .local v0, "result":Ljava/lang/Integer;
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v1

    return v1
.end method

.method public getMethod()Ljava/lang/String;
    .locals 1

    .prologue
    .line 332
    iget-object v0, p0, Lcom/splunk/mint/network/socket/MonitoringSocketImpl;->method:Ljava/lang/String;

    return-object v0
.end method

.method public getOption(I)Ljava/lang/Object;
    .locals 4
    .param p1, "optID"    # I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/net/SocketException;
        }
    .end annotation

    .prologue
    .line 242
    iget-object v0, p0, Lcom/splunk/mint/network/socket/MonitoringSocketImpl;->delegator:Lcom/splunk/mint/network/util/Delegator;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v1, v2

    invoke-virtual {v0, v1}, Lcom/splunk/mint/network/util/Delegator;->invoke([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method protected getOutputStream()Ljava/io/OutputStream;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 247
    iget-object v1, p0, Lcom/splunk/mint/network/socket/MonitoringSocketImpl;->delegator:Lcom/splunk/mint/network/util/Delegator;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v1, v2}, Lcom/splunk/mint/network/util/Delegator;->invoke([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/io/OutputStream;

    .line 248
    .local v0, "out":Ljava/io/OutputStream;
    iget-object v1, p0, Lcom/splunk/mint/network/socket/MonitoringSocketImpl;->mOutputStreamMonitor:Lcom/splunk/mint/network/io/OutputStreamMonitor;

    if-nez v1, :cond_0

    .line 249
    new-instance v1, Lcom/splunk/mint/network/io/OutputStreamMonitor;

    iget-object v2, p0, Lcom/splunk/mint/network/socket/MonitoringSocketImpl;->name:Ljava/lang/String;

    iget-object v3, p0, Lcom/splunk/mint/network/socket/MonitoringSocketImpl;->registry:Lcom/splunk/mint/network/MonitorRegistry;

    invoke-direct {v1, v2, v3, v0}, Lcom/splunk/mint/network/io/OutputStreamMonitor;-><init>(Ljava/lang/String;Lcom/splunk/mint/network/MonitorRegistry;Ljava/io/OutputStream;)V

    iput-object v1, p0, Lcom/splunk/mint/network/socket/MonitoringSocketImpl;->mOutputStreamMonitor:Lcom/splunk/mint/network/io/OutputStreamMonitor;

    .line 251
    :cond_0
    iget-object v1, p0, Lcom/splunk/mint/network/socket/MonitoringSocketImpl;->mOutputStreamMonitor:Lcom/splunk/mint/network/io/OutputStreamMonitor;

    return-object v1
.end method

.method protected getPort()I
    .locals 3

    .prologue
    .line 287
    iget-object v1, p0, Lcom/splunk/mint/network/socket/MonitoringSocketImpl;->delegator:Lcom/splunk/mint/network/util/Delegator;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v1, v2}, Lcom/splunk/mint/network/util/Delegator;->invoke([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    .line 288
    .local v0, "port":Ljava/lang/Integer;
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v1

    return v1
.end method

.method public isHttp()Z
    .locals 1

    .prologue
    .line 336
    iget-boolean v0, p0, Lcom/splunk/mint/network/socket/MonitoringSocketImpl;->http:Z

    return v0
.end method

.method protected listen(I)V
    .locals 4
    .param p1, "backlog"    # I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 256
    iget-object v0, p0, Lcom/splunk/mint/network/socket/MonitoringSocketImpl;->delegator:Lcom/splunk/mint/network/util/Delegator;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v1, v2

    invoke-virtual {v0, v1}, Lcom/splunk/mint/network/util/Delegator;->invoke([Ljava/lang/Object;)Ljava/lang/Object;

    .line 257
    return-void
.end method

.method public readingDone()V
    .locals 6

    .prologue
    .line 150
    iget-boolean v0, p0, Lcom/splunk/mint/network/socket/MonitoringSocketImpl;->readingDone:Z

    if-nez v0, :cond_0

    .line 151
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/splunk/mint/network/socket/MonitoringSocketImpl;->readingDone:Z

    .line 154
    sget-boolean v0, Lcom/splunk/mint/Properties;->isKitKat:Z

    if-eqz v0, :cond_1

    .line 155
    iget-object v0, p0, Lcom/splunk/mint/network/socket/MonitoringSocketImpl;->mOutputStreamMonitor:Lcom/splunk/mint/network/io/OutputStreamMonitor;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/splunk/mint/network/socket/MonitoringSocketImpl;->mInputStreamMonitorKitKat:Lcom/splunk/mint/network/io/InputStreamMonitorKitKat;

    if-eqz v0, :cond_0

    .line 156
    iget-object v0, p0, Lcom/splunk/mint/network/socket/MonitoringSocketImpl;->registry:Lcom/splunk/mint/network/MonitorRegistry;

    iget-object v1, p0, Lcom/splunk/mint/network/socket/MonitoringSocketImpl;->name:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/splunk/mint/network/MonitorRegistry;->getMetricsForName(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v1

    iget-object v0, p0, Lcom/splunk/mint/network/socket/MonitoringSocketImpl;->mOutputStreamMonitor:Lcom/splunk/mint/network/io/OutputStreamMonitor;

    invoke-virtual {v0}, Lcom/splunk/mint/network/io/OutputStreamMonitor;->getHeaders()Ljava/util/HashMap;

    move-result-object v2

    iget-object v0, p0, Lcom/splunk/mint/network/socket/MonitoringSocketImpl;->mInputStreamMonitorKitKat:Lcom/splunk/mint/network/io/InputStreamMonitorKitKat;

    invoke-virtual {v0}, Lcom/splunk/mint/network/io/InputStreamMonitorKitKat;->getHeaders()Ljava/util/HashMap;

    move-result-object v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lcom/splunk/mint/network/socket/MonitoringSocketImpl;->createActionEventFromCollectedStats(Ljava/util/ArrayList;Ljava/util/HashMap;Ljava/util/HashMap;J)V

    .line 166
    :cond_0
    :goto_0
    return-void

    .line 160
    :cond_1
    iget-object v0, p0, Lcom/splunk/mint/network/socket/MonitoringSocketImpl;->mOutputStreamMonitor:Lcom/splunk/mint/network/io/OutputStreamMonitor;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/splunk/mint/network/socket/MonitoringSocketImpl;->mInputStreamMonitor:Lcom/splunk/mint/network/io/InputStreamMonitor;

    if-eqz v0, :cond_0

    .line 161
    iget-object v0, p0, Lcom/splunk/mint/network/socket/MonitoringSocketImpl;->registry:Lcom/splunk/mint/network/MonitorRegistry;

    iget-object v1, p0, Lcom/splunk/mint/network/socket/MonitoringSocketImpl;->name:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/splunk/mint/network/MonitorRegistry;->getMetricsForName(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v1

    iget-object v0, p0, Lcom/splunk/mint/network/socket/MonitoringSocketImpl;->mOutputStreamMonitor:Lcom/splunk/mint/network/io/OutputStreamMonitor;

    invoke-virtual {v0}, Lcom/splunk/mint/network/io/OutputStreamMonitor;->getHeaders()Ljava/util/HashMap;

    move-result-object v2

    iget-object v0, p0, Lcom/splunk/mint/network/socket/MonitoringSocketImpl;->mInputStreamMonitor:Lcom/splunk/mint/network/io/InputStreamMonitor;

    invoke-virtual {v0}, Lcom/splunk/mint/network/io/InputStreamMonitor;->getHeaders()Ljava/util/HashMap;

    move-result-object v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lcom/splunk/mint/network/socket/MonitoringSocketImpl;->createActionEventFromCollectedStats(Ljava/util/ArrayList;Ljava/util/HashMap;Ljava/util/HashMap;J)V

    goto :goto_0
.end method

.method protected sendUrgentData(I)V
    .locals 4
    .param p1, "value"    # I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 261
    iget-object v0, p0, Lcom/splunk/mint/network/socket/MonitoringSocketImpl;->delegator:Lcom/splunk/mint/network/util/Delegator;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v1, v2

    invoke-virtual {v0, v1}, Lcom/splunk/mint/network/util/Delegator;->invoke([Ljava/lang/Object;)Ljava/lang/Object;

    .line 262
    return-void
.end method

.method public setOption(ILjava/lang/Object;)V
    .locals 4
    .param p1, "optID"    # I
    .param p2, "val"    # Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/net/SocketException;
        }
    .end annotation

    .prologue
    .line 266
    iget-object v0, p0, Lcom/splunk/mint/network/socket/MonitoringSocketImpl;->delegator:Lcom/splunk/mint/network/util/Delegator;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x1

    aput-object p2, v1, v2

    invoke-virtual {v0, v1}, Lcom/splunk/mint/network/util/Delegator;->invoke([Ljava/lang/Object;)Ljava/lang/Object;

    .line 267
    return-void
.end method

.method protected setPerformancePreferences(III)V
    .locals 4
    .param p1, "connectionTime"    # I
    .param p2, "latency"    # I
    .param p3, "bandwidth"    # I

    .prologue
    .line 293
    iget-object v0, p0, Lcom/splunk/mint/network/socket/MonitoringSocketImpl;->delegator:Lcom/splunk/mint/network/util/Delegator;

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x1

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x2

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v1, v2

    invoke-virtual {v0, v1}, Lcom/splunk/mint/network/util/Delegator;->invoke([Ljava/lang/Object;)Ljava/lang/Object;

    .line 294
    return-void
.end method

.method protected shutdownInput()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 298
    sget-boolean v0, Lcom/splunk/mint/Properties;->isKitKat:Z

    if-eqz v0, :cond_1

    .line 299
    iget-object v0, p0, Lcom/splunk/mint/network/socket/MonitoringSocketImpl;->mInputStreamMonitorKitKat:Lcom/splunk/mint/network/io/InputStreamMonitorKitKat;

    if-eqz v0, :cond_0

    .line 300
    iget-object v0, p0, Lcom/splunk/mint/network/socket/MonitoringSocketImpl;->mInputStreamMonitorKitKat:Lcom/splunk/mint/network/io/InputStreamMonitorKitKat;

    invoke-virtual {v0}, Lcom/splunk/mint/network/io/InputStreamMonitorKitKat;->close()V

    .line 308
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/splunk/mint/network/socket/MonitoringSocketImpl;->delegator:Lcom/splunk/mint/network/util/Delegator;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v0, v1}, Lcom/splunk/mint/network/util/Delegator;->invoke([Ljava/lang/Object;)Ljava/lang/Object;

    .line 309
    return-void

    .line 303
    :cond_1
    iget-object v0, p0, Lcom/splunk/mint/network/socket/MonitoringSocketImpl;->mInputStreamMonitor:Lcom/splunk/mint/network/io/InputStreamMonitor;

    if-eqz v0, :cond_0

    .line 304
    iget-object v0, p0, Lcom/splunk/mint/network/socket/MonitoringSocketImpl;->mInputStreamMonitor:Lcom/splunk/mint/network/io/InputStreamMonitor;

    invoke-virtual {v0}, Lcom/splunk/mint/network/io/InputStreamMonitor;->close()V

    goto :goto_0
.end method

.method protected shutdownOutput()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 313
    iget-object v0, p0, Lcom/splunk/mint/network/socket/MonitoringSocketImpl;->mOutputStreamMonitor:Lcom/splunk/mint/network/io/OutputStreamMonitor;

    if-eqz v0, :cond_0

    .line 314
    iget-object v0, p0, Lcom/splunk/mint/network/socket/MonitoringSocketImpl;->mOutputStreamMonitor:Lcom/splunk/mint/network/io/OutputStreamMonitor;

    invoke-virtual {v0}, Lcom/splunk/mint/network/io/OutputStreamMonitor;->close()V

    .line 317
    :cond_0
    iget-object v0, p0, Lcom/splunk/mint/network/socket/MonitoringSocketImpl;->delegator:Lcom/splunk/mint/network/util/Delegator;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v0, v1}, Lcom/splunk/mint/network/util/Delegator;->invoke([Ljava/lang/Object;)Ljava/lang/Object;

    .line 318
    return-void
.end method

.method protected supportsUrgentData()Z
    .locals 3

    .prologue
    .line 322
    iget-object v1, p0, Lcom/splunk/mint/network/socket/MonitoringSocketImpl;->delegator:Lcom/splunk/mint/network/util/Delegator;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v1, v2}, Lcom/splunk/mint/network/util/Delegator;->invoke([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    .line 323
    .local v0, "result":Ljava/lang/Boolean;
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    return v1
.end method
