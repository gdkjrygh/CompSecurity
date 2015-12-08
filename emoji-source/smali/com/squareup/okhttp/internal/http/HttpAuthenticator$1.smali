.class final Lcom/squareup/okhttp/internal/http/HttpAuthenticator$1;
.super Ljava/lang/Object;
.source "HttpAuthenticator.java"

# interfaces
.implements Lcom/squareup/okhttp/OkAuthenticator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/squareup/okhttp/internal/http/HttpAuthenticator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private getConnectToInetAddress(Ljava/net/Proxy;Ljava/net/URL;)Ljava/net/InetAddress;
    .locals 2
    .param p1, "proxy"    # Ljava/net/Proxy;
    .param p2, "url"    # Ljava/net/URL;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 76
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v0

    sget-object v1, Ljava/net/Proxy$Type;->DIRECT:Ljava/net/Proxy$Type;

    if-eq v0, v1, :cond_0

    .line 77
    invoke-virtual {p1}, Ljava/net/Proxy;->address()Ljava/net/SocketAddress;

    move-result-object v0

    check-cast v0, Ljava/net/InetSocketAddress;

    invoke-virtual {v0}, Ljava/net/InetSocketAddress;->getAddress()Ljava/net/InetAddress;

    move-result-object v0

    .line 78
    :goto_0
    return-object v0

    :cond_0
    invoke-virtual {p2}, Ljava/net/URL;->getHost()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/net/InetAddress;->getByName(Ljava/lang/String;)Ljava/net/InetAddress;

    move-result-object v0

    goto :goto_0
.end method


# virtual methods
.method public authenticate(Ljava/net/Proxy;Ljava/net/URL;Ljava/util/List;)Lcom/squareup/okhttp/OkAuthenticator$Credential;
    .locals 11
    .param p1, "proxy"    # Ljava/net/Proxy;
    .param p2, "url"    # Ljava/net/URL;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/net/Proxy;",
            "Ljava/net/URL;",
            "Ljava/util/List",
            "<",
            "Lcom/squareup/okhttp/OkAuthenticator$Challenge;",
            ">;)",
            "Lcom/squareup/okhttp/OkAuthenticator$Credential;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 41
    .local p3, "challenges":Ljava/util/List;, "Ljava/util/List<Lcom/squareup/okhttp/OkAuthenticator$Challenge;>;"
    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :cond_0
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/squareup/okhttp/OkAuthenticator$Challenge;

    .line 42
    .local v9, "challenge":Lcom/squareup/okhttp/OkAuthenticator$Challenge;
    const-string v0, "Basic"

    invoke-virtual {v9}, Lcom/squareup/okhttp/OkAuthenticator$Challenge;->getScheme()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 46
    invoke-virtual {p2}, Ljava/net/URL;->getHost()Ljava/lang/String;

    move-result-object v0

    .line 47
    invoke-direct {p0, p1, p2}, Lcom/squareup/okhttp/internal/http/HttpAuthenticator$1;->getConnectToInetAddress(Ljava/net/Proxy;Ljava/net/URL;)Ljava/net/InetAddress;

    move-result-object v1

    invoke-virtual {p2}, Ljava/net/URL;->getPort()I

    move-result v2

    invoke-virtual {p2}, Ljava/net/URL;->getProtocol()Ljava/lang/String;

    move-result-object v3

    .line 48
    invoke-virtual {v9}, Lcom/squareup/okhttp/OkAuthenticator$Challenge;->getRealm()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v9}, Lcom/squareup/okhttp/OkAuthenticator$Challenge;->getScheme()Ljava/lang/String;

    move-result-object v5

    sget-object v7, Ljava/net/Authenticator$RequestorType;->SERVER:Ljava/net/Authenticator$RequestorType;

    move-object v6, p2

    .line 46
    invoke-static/range {v0 .. v7}, Ljava/net/Authenticator;->requestPasswordAuthentication(Ljava/lang/String;Ljava/net/InetAddress;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/net/URL;Ljava/net/Authenticator$RequestorType;)Ljava/net/PasswordAuthentication;

    move-result-object v8

    .line 49
    .local v8, "auth":Ljava/net/PasswordAuthentication;
    if-eqz v8, :cond_0

    .line 50
    invoke-virtual {v8}, Ljava/net/PasswordAuthentication;->getUserName()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/String;

    invoke-virtual {v8}, Ljava/net/PasswordAuthentication;->getPassword()[C

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/String;-><init>([C)V

    invoke-static {v0, v1}, Lcom/squareup/okhttp/OkAuthenticator$Credential;->basic(Ljava/lang/String;Ljava/lang/String;)Lcom/squareup/okhttp/OkAuthenticator$Credential;

    move-result-object v0

    .line 53
    .end local v8    # "auth":Ljava/net/PasswordAuthentication;
    .end local v9    # "challenge":Lcom/squareup/okhttp/OkAuthenticator$Challenge;
    :goto_0
    return-object v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public authenticateProxy(Ljava/net/Proxy;Ljava/net/URL;Ljava/util/List;)Lcom/squareup/okhttp/OkAuthenticator$Credential;
    .locals 12
    .param p1, "proxy"    # Ljava/net/Proxy;
    .param p2, "url"    # Ljava/net/URL;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/net/Proxy;",
            "Ljava/net/URL;",
            "Ljava/util/List",
            "<",
            "Lcom/squareup/okhttp/OkAuthenticator$Challenge;",
            ">;)",
            "Lcom/squareup/okhttp/OkAuthenticator$Credential;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 58
    .local p3, "challenges":Ljava/util/List;, "Ljava/util/List<Lcom/squareup/okhttp/OkAuthenticator$Challenge;>;"
    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :cond_0
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/squareup/okhttp/OkAuthenticator$Challenge;

    .line 59
    .local v9, "challenge":Lcom/squareup/okhttp/OkAuthenticator$Challenge;
    const-string v0, "Basic"

    invoke-virtual {v9}, Lcom/squareup/okhttp/OkAuthenticator$Challenge;->getScheme()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 63
    invoke-virtual {p1}, Ljava/net/Proxy;->address()Ljava/net/SocketAddress;

    move-result-object v10

    check-cast v10, Ljava/net/InetSocketAddress;

    .line 65
    .local v10, "proxyAddress":Ljava/net/InetSocketAddress;
    invoke-virtual {v10}, Ljava/net/InetSocketAddress;->getHostName()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p1, p2}, Lcom/squareup/okhttp/internal/http/HttpAuthenticator$1;->getConnectToInetAddress(Ljava/net/Proxy;Ljava/net/URL;)Ljava/net/InetAddress;

    move-result-object v1

    invoke-virtual {v10}, Ljava/net/InetSocketAddress;->getPort()I

    move-result v2

    .line 66
    invoke-virtual {p2}, Ljava/net/URL;->getProtocol()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v9}, Lcom/squareup/okhttp/OkAuthenticator$Challenge;->getRealm()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v9}, Lcom/squareup/okhttp/OkAuthenticator$Challenge;->getScheme()Ljava/lang/String;

    move-result-object v5

    sget-object v7, Ljava/net/Authenticator$RequestorType;->PROXY:Ljava/net/Authenticator$RequestorType;

    move-object v6, p2

    .line 64
    invoke-static/range {v0 .. v7}, Ljava/net/Authenticator;->requestPasswordAuthentication(Ljava/lang/String;Ljava/net/InetAddress;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/net/URL;Ljava/net/Authenticator$RequestorType;)Ljava/net/PasswordAuthentication;

    move-result-object v8

    .line 68
    .local v8, "auth":Ljava/net/PasswordAuthentication;
    if-eqz v8, :cond_0

    .line 69
    invoke-virtual {v8}, Ljava/net/PasswordAuthentication;->getUserName()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/String;

    invoke-virtual {v8}, Ljava/net/PasswordAuthentication;->getPassword()[C

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/String;-><init>([C)V

    invoke-static {v0, v1}, Lcom/squareup/okhttp/OkAuthenticator$Credential;->basic(Ljava/lang/String;Ljava/lang/String;)Lcom/squareup/okhttp/OkAuthenticator$Credential;

    move-result-object v0

    .line 72
    .end local v8    # "auth":Ljava/net/PasswordAuthentication;
    .end local v9    # "challenge":Lcom/squareup/okhttp/OkAuthenticator$Challenge;
    .end local v10    # "proxyAddress":Ljava/net/InetSocketAddress;
    :goto_0
    return-object v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method
