.class public final Lcom/squareup/okhttp/TunnelRequest;
.super Ljava/lang/Object;
.source "TunnelRequest.java"


# instance fields
.field final host:Ljava/lang/String;

.field final port:I

.field final proxyAuthorization:Ljava/lang/String;

.field final userAgent:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V
    .locals 2
    .param p1, "host"    # Ljava/lang/String;
    .param p2, "port"    # I
    .param p3, "userAgent"    # Ljava/lang/String;
    .param p4, "proxyAuthorization"    # Ljava/lang/String;

    .prologue
    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    if-nez p1, :cond_0

    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "host == null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 45
    :cond_0
    if-nez p3, :cond_1

    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "userAgent == null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 46
    :cond_1
    iput-object p1, p0, Lcom/squareup/okhttp/TunnelRequest;->host:Ljava/lang/String;

    .line 47
    iput p2, p0, Lcom/squareup/okhttp/TunnelRequest;->port:I

    .line 48
    iput-object p3, p0, Lcom/squareup/okhttp/TunnelRequest;->userAgent:Ljava/lang/String;

    .line 49
    iput-object p4, p0, Lcom/squareup/okhttp/TunnelRequest;->proxyAuthorization:Ljava/lang/String;

    .line 50
    return-void
.end method


# virtual methods
.method getRequestHeaders()Lcom/squareup/okhttp/internal/http/RawHeaders;
    .locals 4

    .prologue
    .line 58
    new-instance v0, Lcom/squareup/okhttp/internal/http/RawHeaders;

    invoke-direct {v0}, Lcom/squareup/okhttp/internal/http/RawHeaders;-><init>()V

    .line 59
    .local v0, "result":Lcom/squareup/okhttp/internal/http/RawHeaders;
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "CONNECT "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/squareup/okhttp/TunnelRequest;->host:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ":"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lcom/squareup/okhttp/TunnelRequest;->port:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " HTTP/1.1"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/squareup/okhttp/internal/http/RawHeaders;->setRequestLine(Ljava/lang/String;)V

    .line 62
    const-string v2, "Host"

    iget v1, p0, Lcom/squareup/okhttp/TunnelRequest;->port:I

    const-string v3, "https"

    invoke-static {v3}, Lcom/squareup/okhttp/internal/Util;->getDefaultPort(Ljava/lang/String;)I

    move-result v3

    if-ne v1, v3, :cond_1

    iget-object v1, p0, Lcom/squareup/okhttp/TunnelRequest;->host:Ljava/lang/String;

    :goto_0
    invoke-virtual {v0, v2, v1}, Lcom/squareup/okhttp/internal/http/RawHeaders;->set(Ljava/lang/String;Ljava/lang/String;)V

    .line 63
    const-string v1, "User-Agent"

    iget-object v2, p0, Lcom/squareup/okhttp/TunnelRequest;->userAgent:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/squareup/okhttp/internal/http/RawHeaders;->set(Ljava/lang/String;Ljava/lang/String;)V

    .line 66
    iget-object v1, p0, Lcom/squareup/okhttp/TunnelRequest;->proxyAuthorization:Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 67
    const-string v1, "Proxy-Authorization"

    iget-object v2, p0, Lcom/squareup/okhttp/TunnelRequest;->proxyAuthorization:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/squareup/okhttp/internal/http/RawHeaders;->set(Ljava/lang/String;Ljava/lang/String;)V

    .line 72
    :cond_0
    const-string v1, "Proxy-Connection"

    const-string v2, "Keep-Alive"

    invoke-virtual {v0, v1, v2}, Lcom/squareup/okhttp/internal/http/RawHeaders;->set(Ljava/lang/String;Ljava/lang/String;)V

    .line 73
    return-object v0

    .line 62
    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lcom/squareup/okhttp/TunnelRequest;->host:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v3, ":"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v3, p0, Lcom/squareup/okhttp/TunnelRequest;->port:I

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_0
.end method
