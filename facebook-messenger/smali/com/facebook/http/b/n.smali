.class Lcom/facebook/http/b/n;
.super Lorg/apache/http/impl/conn/DefaultClientConnectionOperator;
.source "FbHttpClientConnectionOperator.java"


# static fields
.field private static final a:Lorg/apache/http/conn/scheme/PlainSocketFactory;


# instance fields
.field private b:Lcom/facebook/analytics/e/i;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 35
    new-instance v0, Lorg/apache/http/conn/scheme/PlainSocketFactory;

    invoke-direct {v0}, Lorg/apache/http/conn/scheme/PlainSocketFactory;-><init>()V

    sput-object v0, Lcom/facebook/http/b/n;->a:Lorg/apache/http/conn/scheme/PlainSocketFactory;

    return-void
.end method

.method public constructor <init>(Lorg/apache/http/conn/scheme/SchemeRegistry;Lcom/facebook/analytics/e/i;)V
    .locals 0

    .prologue
    .line 51
    invoke-direct {p0, p1}, Lorg/apache/http/impl/conn/DefaultClientConnectionOperator;-><init>(Lorg/apache/http/conn/scheme/SchemeRegistry;)V

    .line 52
    iput-object p2, p0, Lcom/facebook/http/b/n;->b:Lcom/facebook/analytics/e/i;

    .line 53
    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/analytics/e/i;)V
    .locals 0

    .prologue
    .line 168
    iput-object p1, p0, Lcom/facebook/http/b/n;->b:Lcom/facebook/analytics/e/i;

    .line 169
    return-void
.end method

.method public openConnection(Lorg/apache/http/conn/OperatedClientConnection;Lorg/apache/http/HttpHost;Ljava/net/InetAddress;Lorg/apache/http/protocol/HttpContext;Lorg/apache/http/params/HttpParams;)V
    .locals 15

    .prologue
    .line 62
    if-nez p1, :cond_0

    .line 63
    new-instance v2, Ljava/lang/IllegalArgumentException;

    const-string v3, "Connection must not be null."

    invoke-direct {v2, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 66
    :cond_0
    if-nez p2, :cond_1

    .line 67
    new-instance v2, Ljava/lang/IllegalArgumentException;

    const-string v3, "Target host must not be null."

    invoke-direct {v2, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 72
    :cond_1
    if-nez p5, :cond_2

    .line 73
    new-instance v2, Ljava/lang/IllegalArgumentException;

    const-string v3, "Parameters must not be null."

    invoke-direct {v2, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 76
    :cond_2
    invoke-interface/range {p1 .. p1}, Lorg/apache/http/conn/OperatedClientConnection;->isOpen()Z

    move-result v2

    if-eqz v2, :cond_3

    .line 77
    new-instance v2, Ljava/lang/IllegalArgumentException;

    const-string v3, "Connection must not be open."

    invoke-direct {v2, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 81
    :cond_3
    iget-object v2, p0, Lcom/facebook/http/b/n;->schemeRegistry:Lorg/apache/http/conn/scheme/SchemeRegistry;

    invoke-virtual/range {p2 .. p2}, Lorg/apache/http/HttpHost;->getSchemeName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lorg/apache/http/conn/scheme/SchemeRegistry;->getScheme(Ljava/lang/String;)Lorg/apache/http/conn/scheme/Scheme;

    move-result-object v13

    .line 82
    invoke-virtual {v13}, Lorg/apache/http/conn/scheme/Scheme;->getSocketFactory()Lorg/apache/http/conn/scheme/SocketFactory;

    move-result-object v9

    .line 86
    instance-of v2, v9, Lorg/apache/http/conn/scheme/LayeredSocketFactory;

    if-eqz v2, :cond_7

    .line 87
    sget-object v3, Lcom/facebook/http/b/n;->a:Lorg/apache/http/conn/scheme/PlainSocketFactory;

    move-object v2, v9

    .line 88
    check-cast v2, Lorg/apache/http/conn/scheme/LayeredSocketFactory;

    move-object v10, v2

    move-object v2, v3

    .line 94
    :goto_0
    iget-object v3, p0, Lcom/facebook/http/b/n;->b:Lcom/facebook/analytics/e/i;

    if-eqz v3, :cond_8

    new-instance v3, Lcom/facebook/http/b/as;

    iget-object v4, p0, Lcom/facebook/http/b/n;->b:Lcom/facebook/analytics/e/i;

    invoke-virtual/range {p2 .. p2}, Lorg/apache/http/HttpHost;->getHostName()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v3, v4, v5}, Lcom/facebook/http/b/as;-><init>(Lcom/facebook/analytics/e/i;Ljava/lang/String;)V

    move-object v11, v3

    .line 100
    :goto_1
    :try_start_0
    invoke-interface {v11}, Lcom/facebook/http/b/aw;->a()V

    .line 101
    invoke-virtual/range {p2 .. p2}, Lorg/apache/http/HttpHost;->getHostName()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/net/InetAddress;->getAllByName(Ljava/lang/String;)[Ljava/net/InetAddress;

    move-result-object v14

    .line 102
    invoke-interface {v11}, Lcom/facebook/http/b/aw;->b()V
    :try_end_0
    .catch Ljava/net/UnknownHostException; {:try_start_0 .. :try_end_0} :catch_0

    .line 108
    const/4 v3, 0x0

    move v12, v3

    :goto_2
    array-length v3, v14

    if-ge v12, v3, :cond_6

    .line 109
    invoke-interface {v2}, Lorg/apache/http/conn/scheme/SocketFactory;->createSocket()Ljava/net/Socket;

    move-result-object v3

    .line 110
    move-object/from16 v0, p1

    move-object/from16 v1, p2

    invoke-interface {v0, v3, v1}, Lorg/apache/http/conn/OperatedClientConnection;->opening(Ljava/net/Socket;Lorg/apache/http/HttpHost;)V

    .line 113
    :try_start_1
    invoke-interface {v11}, Lcom/facebook/http/b/aw;->c()V

    .line 114
    aget-object v4, v14, v12

    invoke-virtual {v4}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    move-result-object v4

    invoke-virtual/range {p2 .. p2}, Lorg/apache/http/HttpHost;->getPort()I

    move-result v5

    invoke-virtual {v13, v5}, Lorg/apache/http/conn/scheme/Scheme;->resolvePort(I)I

    move-result v5

    const/4 v7, 0x0

    move-object/from16 v6, p3

    move-object/from16 v8, p5

    invoke-interface/range {v2 .. v8}, Lorg/apache/http/conn/scheme/SocketFactory;->connectSocket(Ljava/net/Socket;Ljava/lang/String;ILjava/net/InetAddress;ILorg/apache/http/params/HttpParams;)Ljava/net/Socket;

    move-result-object v4

    .line 118
    if-eq v3, v4, :cond_4

    .line 120
    move-object/from16 v0, p1

    move-object/from16 v1, p2

    invoke-interface {v0, v4, v1}, Lorg/apache/http/conn/OperatedClientConnection;->opening(Ljava/net/Socket;Lorg/apache/http/HttpHost;)V

    move-object v3, v4

    .line 122
    :cond_4
    invoke-interface {v11}, Lcom/facebook/http/b/aw;->d()V

    .line 134
    move-object/from16 v0, p4

    move-object/from16 v1, p5

    invoke-virtual {p0, v3, v0, v1}, Lcom/facebook/http/b/n;->prepareSocket(Ljava/net/Socket;Lorg/apache/http/protocol/HttpContext;Lorg/apache/http/params/HttpParams;)V

    .line 135
    if-eqz v10, :cond_9

    .line 136
    invoke-interface {v11}, Lcom/facebook/http/b/aw;->e()V

    .line 137
    invoke-virtual/range {p2 .. p2}, Lorg/apache/http/HttpHost;->getHostName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual/range {p2 .. p2}, Lorg/apache/http/HttpHost;->getPort()I

    move-result v5

    invoke-virtual {v13, v5}, Lorg/apache/http/conn/scheme/Scheme;->resolvePort(I)I

    move-result v5

    const/4 v6, 0x1

    invoke-interface {v10, v3, v4, v5, v6}, Lorg/apache/http/conn/scheme/LayeredSocketFactory;->createSocket(Ljava/net/Socket;Ljava/lang/String;IZ)Ljava/net/Socket;

    move-result-object v4

    .line 141
    invoke-interface {v11}, Lcom/facebook/http/b/aw;->f()V

    .line 142
    if-eq v4, v3, :cond_5

    .line 143
    move-object/from16 v0, p1

    move-object/from16 v1, p2

    invoke-interface {v0, v4, v1}, Lorg/apache/http/conn/OperatedClientConnection;->opening(Ljava/net/Socket;Lorg/apache/http/HttpHost;)V

    .line 145
    :cond_5
    invoke-interface {v9, v4}, Lorg/apache/http/conn/scheme/SocketFactory;->isSecure(Ljava/net/Socket;)Z

    move-result v3

    move-object/from16 v0, p1

    move-object/from16 v1, p5

    invoke-interface {v0, v3, v1}, Lorg/apache/http/conn/OperatedClientConnection;->openCompleted(ZLorg/apache/http/params/HttpParams;)V
    :try_end_1
    .catch Ljava/net/SocketException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Lorg/apache/http/conn/ConnectTimeoutException; {:try_start_1 .. :try_end_1} :catch_2

    .line 165
    :cond_6
    :goto_3
    return-void

    .line 91
    :cond_7
    const/4 v2, 0x0

    move-object v10, v2

    move-object v2, v9

    goto/16 :goto_0

    .line 94
    :cond_8
    new-instance v3, Lcom/facebook/http/b/f;

    invoke-direct {v3}, Lcom/facebook/http/b/f;-><init>()V

    move-object v11, v3

    goto/16 :goto_1

    .line 103
    :catch_0
    move-exception v2

    .line 104
    invoke-interface {v11, v2}, Lcom/facebook/http/b/aw;->a(Ljava/io/IOException;)V

    .line 105
    throw v2

    .line 147
    :cond_9
    :try_start_2
    invoke-interface {v9, v3}, Lorg/apache/http/conn/scheme/SocketFactory;->isSecure(Ljava/net/Socket;)Z

    move-result v3

    move-object/from16 v0, p1

    move-object/from16 v1, p5

    invoke-interface {v0, v3, v1}, Lorg/apache/http/conn/OperatedClientConnection;->openCompleted(ZLorg/apache/http/params/HttpParams;)V
    :try_end_2
    .catch Ljava/net/SocketException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Lorg/apache/http/conn/ConnectTimeoutException; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_3

    .line 152
    :catch_1
    move-exception v3

    .line 153
    array-length v4, v14

    add-int/lit8 v4, v4, -0x1

    if-ne v12, v4, :cond_b

    .line 154
    instance-of v2, v3, Ljava/net/ConnectException;

    if-eqz v2, :cond_a

    move-object v2, v3

    check-cast v2, Ljava/net/ConnectException;

    .line 156
    :goto_4
    new-instance v3, Lorg/apache/http/conn/HttpHostConnectException;

    move-object/from16 v0, p2

    invoke-direct {v3, v0, v2}, Lorg/apache/http/conn/HttpHostConnectException;-><init>(Lorg/apache/http/HttpHost;Ljava/net/ConnectException;)V

    throw v3

    .line 154
    :cond_a
    new-instance v2, Ljava/net/ConnectException;

    invoke-virtual {v3}, Ljava/net/SocketException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/net/ConnectException;-><init>(Ljava/lang/String;)V

    goto :goto_4

    .line 159
    :catch_2
    move-exception v3

    .line 160
    array-length v4, v14

    add-int/lit8 v4, v4, -0x1

    if-ne v12, v4, :cond_b

    .line 161
    throw v3

    .line 108
    :cond_b
    add-int/lit8 v3, v12, 0x1

    move v12, v3

    goto/16 :goto_2
.end method
