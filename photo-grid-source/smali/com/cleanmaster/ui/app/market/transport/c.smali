.class final Lcom/cleanmaster/ui/app/market/transport/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/apache/http/conn/scheme/LayeredSocketFactory;


# instance fields
.field a:Lorg/apache/http/conn/ssl/SSLSocketFactory;


# direct methods
.method constructor <init>()V
    .locals 1

    .prologue
    .line 67
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 68
    invoke-static {}, Lorg/apache/http/conn/ssl/SSLSocketFactory;->getSocketFactory()Lorg/apache/http/conn/ssl/SSLSocketFactory;

    move-result-object v0

    iput-object v0, p0, Lcom/cleanmaster/ui/app/market/transport/c;->a:Lorg/apache/http/conn/ssl/SSLSocketFactory;

    return-void
.end method


# virtual methods
.method public final connectSocket(Ljava/net/Socket;Ljava/lang/String;ILjava/net/InetAddress;ILorg/apache/http/params/HttpParams;)Ljava/net/Socket;
    .locals 7

    .prologue
    .line 79
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/transport/c;->a:Lorg/apache/http/conn/ssl/SSLSocketFactory;

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move-object v4, p4

    move v5, p5

    move-object v6, p6

    invoke-virtual/range {v0 .. v6}, Lorg/apache/http/conn/ssl/SSLSocketFactory;->connectSocket(Ljava/net/Socket;Ljava/lang/String;ILjava/net/InetAddress;ILorg/apache/http/params/HttpParams;)Ljava/net/Socket;

    move-result-object v0

    return-object v0
.end method

.method public final createSocket()Ljava/net/Socket;
    .locals 1

    .prologue
    .line 72
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/transport/c;->a:Lorg/apache/http/conn/ssl/SSLSocketFactory;

    invoke-virtual {v0}, Lorg/apache/http/conn/ssl/SSLSocketFactory;->createSocket()Ljava/net/Socket;

    move-result-object v0

    return-object v0
.end method

.method public final createSocket(Ljava/net/Socket;Ljava/lang/String;IZ)Ljava/net/Socket;
    .locals 2

    .prologue
    .line 92
    .line 1098
    :try_start_0
    const-class v0, Ljava/net/InetAddress;

    const-string v1, "hostName"

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    .line 1100
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 1101
    invoke-virtual {p1}, Ljava/net/Socket;->getInetAddress()Ljava/net/InetAddress;

    move-result-object v1

    invoke-virtual {v0, v1, p2}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 93
    :goto_0
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/transport/c;->a:Lorg/apache/http/conn/ssl/SSLSocketFactory;

    invoke-virtual {v0, p1, p2, p3, p4}, Lorg/apache/http/conn/ssl/SSLSocketFactory;->createSocket(Ljava/net/Socket;Ljava/lang/String;IZ)Ljava/net/Socket;

    move-result-object v0

    return-object v0

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public final isSecure(Ljava/net/Socket;)Z
    .locals 1

    .prologue
    .line 86
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/transport/c;->a:Lorg/apache/http/conn/ssl/SSLSocketFactory;

    invoke-virtual {v0, p1}, Lorg/apache/http/conn/ssl/SSLSocketFactory;->isSecure(Ljava/net/Socket;)Z

    move-result v0

    return v0
.end method
