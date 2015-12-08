.class public final Lcom/squareup/okhttp/Connection;
.super Ljava/lang/Object;
.source "Connection.java"

# interfaces
.implements Ljava/io/Closeable;


# static fields
.field private static final HTTP_11:[B

.field private static final NPN_PROTOCOLS:[B

.field private static final SPDY3:[B


# instance fields
.field private connected:Z

.field private httpMinorVersion:I

.field private idleStartTimeNs:J

.field private in:Ljava/io/InputStream;

.field private out:Ljava/io/OutputStream;

.field private final route:Lcom/squareup/okhttp/Route;

.field private socket:Ljava/net/Socket;

.field private spdyConnection:Lcom/squareup/okhttp/internal/spdy/SpdyConnection;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 69
    const/16 v0, 0x10

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    sput-object v0, Lcom/squareup/okhttp/Connection;->NPN_PROTOCOLS:[B

    .line 73
    const/4 v0, 0x6

    new-array v0, v0, [B

    fill-array-data v0, :array_1

    sput-object v0, Lcom/squareup/okhttp/Connection;->SPDY3:[B

    .line 76
    const/16 v0, 0x8

    new-array v0, v0, [B

    fill-array-data v0, :array_2

    sput-object v0, Lcom/squareup/okhttp/Connection;->HTTP_11:[B

    return-void

    .line 69
    nop

    :array_0
    .array-data 1
        0x6t
        0x73t
        0x70t
        0x64t
        0x79t
        0x2ft
        0x33t
        0x8t
        0x68t
        0x74t
        0x74t
        0x70t
        0x2ft
        0x31t
        0x2et
        0x31t
    .end array-data

    .line 73
    :array_1
    .array-data 1
        0x73t
        0x70t
        0x64t
        0x79t
        0x2ft
        0x33t
    .end array-data

    .line 76
    nop

    :array_2
    .array-data 1
        0x68t
        0x74t
        0x74t
        0x70t
        0x2ft
        0x31t
        0x2et
        0x31t
    .end array-data
.end method

.method public constructor <init>(Lcom/squareup/okhttp/Route;)V
    .locals 1
    .param p1, "route"    # Lcom/squareup/okhttp/Route;

    .prologue
    .line 90
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 85
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/squareup/okhttp/Connection;->connected:Z

    .line 87
    const/4 v0, 0x1

    iput v0, p0, Lcom/squareup/okhttp/Connection;->httpMinorVersion:I

    .line 91
    iput-object p1, p0, Lcom/squareup/okhttp/Connection;->route:Lcom/squareup/okhttp/Route;

    .line 92
    return-void
.end method

.method private makeTunnel(Lcom/squareup/okhttp/TunnelRequest;)V
    .locals 9
    .param p1, "tunnelRequest"    # Lcom/squareup/okhttp/TunnelRequest;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 305
    invoke-virtual {p1}, Lcom/squareup/okhttp/TunnelRequest;->getRequestHeaders()Lcom/squareup/okhttp/internal/http/RawHeaders;

    move-result-object v3

    .local v3, "requestHeaders":Lcom/squareup/okhttp/internal/http/RawHeaders;
    move-object v7, v3

    .line 307
    .end local v3    # "requestHeaders":Lcom/squareup/okhttp/internal/http/RawHeaders;
    .local v7, "requestHeaders":Lcom/squareup/okhttp/internal/http/RawHeaders;
    :goto_0
    iget-object v0, p0, Lcom/squareup/okhttp/Connection;->out:Ljava/io/OutputStream;

    invoke-virtual {v7}, Lcom/squareup/okhttp/internal/http/RawHeaders;->toBytes()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write([B)V

    .line 308
    iget-object v0, p0, Lcom/squareup/okhttp/Connection;->in:Ljava/io/InputStream;

    invoke-static {v0}, Lcom/squareup/okhttp/internal/http/RawHeaders;->fromBytes(Ljava/io/InputStream;)Lcom/squareup/okhttp/internal/http/RawHeaders;

    move-result-object v2

    .line 310
    .local v2, "responseHeaders":Lcom/squareup/okhttp/internal/http/RawHeaders;
    invoke-virtual {v2}, Lcom/squareup/okhttp/internal/http/RawHeaders;->getResponseCode()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    .line 325
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Unexpected response code for CONNECT: "

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 326
    invoke-virtual {v2}, Lcom/squareup/okhttp/internal/http/RawHeaders;->getResponseCode()I

    move-result v4

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 314
    :sswitch_0
    new-instance v3, Lcom/squareup/okhttp/internal/http/RawHeaders;

    invoke-direct {v3, v7}, Lcom/squareup/okhttp/internal/http/RawHeaders;-><init>(Lcom/squareup/okhttp/internal/http/RawHeaders;)V

    .line 315
    .end local v7    # "requestHeaders":Lcom/squareup/okhttp/internal/http/RawHeaders;
    .restart local v3    # "requestHeaders":Lcom/squareup/okhttp/internal/http/RawHeaders;
    new-instance v5, Ljava/net/URL;

    const-string v0, "https"

    iget-object v1, p1, Lcom/squareup/okhttp/TunnelRequest;->host:Ljava/lang/String;

    iget v4, p1, Lcom/squareup/okhttp/TunnelRequest;->port:I

    const-string v8, "/"

    invoke-direct {v5, v0, v1, v4, v8}, Ljava/net/URL;-><init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V

    .line 316
    .local v5, "url":Ljava/net/URL;
    iget-object v0, p0, Lcom/squareup/okhttp/Connection;->route:Lcom/squareup/okhttp/Route;

    iget-object v0, v0, Lcom/squareup/okhttp/Route;->address:Lcom/squareup/okhttp/Address;

    iget-object v0, v0, Lcom/squareup/okhttp/Address;->authenticator:Lcom/squareup/okhttp/OkAuthenticator;

    const/16 v1, 0x197

    iget-object v4, p0, Lcom/squareup/okhttp/Connection;->route:Lcom/squareup/okhttp/Route;

    iget-object v4, v4, Lcom/squareup/okhttp/Route;->proxy:Ljava/net/Proxy;

    invoke-static/range {v0 .. v5}, Lcom/squareup/okhttp/internal/http/HttpAuthenticator;->processAuthHeader(Lcom/squareup/okhttp/OkAuthenticator;ILcom/squareup/okhttp/internal/http/RawHeaders;Lcom/squareup/okhttp/internal/http/RawHeaders;Ljava/net/Proxy;Ljava/net/URL;)Z

    move-result v6

    .line 319
    .local v6, "credentialsFound":Z
    if-eqz v6, :cond_0

    move-object v7, v3

    .line 320
    .end local v3    # "requestHeaders":Lcom/squareup/okhttp/internal/http/RawHeaders;
    .restart local v7    # "requestHeaders":Lcom/squareup/okhttp/internal/http/RawHeaders;
    goto :goto_0

    .line 322
    .end local v7    # "requestHeaders":Lcom/squareup/okhttp/internal/http/RawHeaders;
    .restart local v3    # "requestHeaders":Lcom/squareup/okhttp/internal/http/RawHeaders;
    :cond_0
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Failed to authenticate with proxy"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 312
    .end local v3    # "requestHeaders":Lcom/squareup/okhttp/internal/http/RawHeaders;
    .end local v5    # "url":Ljava/net/URL;
    .end local v6    # "credentialsFound":Z
    .restart local v7    # "requestHeaders":Lcom/squareup/okhttp/internal/http/RawHeaders;
    :sswitch_1
    return-void

    .line 310
    nop

    :sswitch_data_0
    .sparse-switch
        0xc8 -> :sswitch_1
        0x197 -> :sswitch_0
    .end sparse-switch
.end method

.method private streamWrapper()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 332
    new-instance v0, Ljava/io/BufferedInputStream;

    iget-object v1, p0, Lcom/squareup/okhttp/Connection;->in:Ljava/io/InputStream;

    const/16 v2, 0x1000

    invoke-direct {v0, v1, v2}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;I)V

    iput-object v0, p0, Lcom/squareup/okhttp/Connection;->in:Ljava/io/InputStream;

    .line 333
    new-instance v0, Ljava/io/BufferedOutputStream;

    iget-object v1, p0, Lcom/squareup/okhttp/Connection;->out:Ljava/io/OutputStream;

    const/16 v2, 0x100

    invoke-direct {v0, v1, v2}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;I)V

    iput-object v0, p0, Lcom/squareup/okhttp/Connection;->out:Ljava/io/OutputStream;

    .line 334
    return-void
.end method

.method private upgradeToTls(Lcom/squareup/okhttp/TunnelRequest;)V
    .locals 10
    .param p1, "tunnelRequest"    # Lcom/squareup/okhttp/TunnelRequest;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    const/4 v5, 0x0

    const/4 v4, 0x1

    .line 117
    invoke-static {}, Lcom/squareup/okhttp/internal/Platform;->get()Lcom/squareup/okhttp/internal/Platform;

    move-result-object v0

    .line 120
    .local v0, "platform":Lcom/squareup/okhttp/internal/Platform;
    invoke-virtual {p0}, Lcom/squareup/okhttp/Connection;->requiresTunnel()Z

    move-result v6

    if-eqz v6, :cond_0

    .line 121
    invoke-direct {p0, p1}, Lcom/squareup/okhttp/Connection;->makeTunnel(Lcom/squareup/okhttp/TunnelRequest;)V

    .line 125
    :cond_0
    iget-object v6, p0, Lcom/squareup/okhttp/Connection;->route:Lcom/squareup/okhttp/Route;

    iget-object v6, v6, Lcom/squareup/okhttp/Route;->address:Lcom/squareup/okhttp/Address;

    iget-object v6, v6, Lcom/squareup/okhttp/Address;->sslSocketFactory:Ljavax/net/ssl/SSLSocketFactory;

    iget-object v7, p0, Lcom/squareup/okhttp/Connection;->socket:Ljava/net/Socket;

    iget-object v8, p0, Lcom/squareup/okhttp/Connection;->route:Lcom/squareup/okhttp/Route;

    iget-object v8, v8, Lcom/squareup/okhttp/Route;->address:Lcom/squareup/okhttp/Address;

    iget-object v8, v8, Lcom/squareup/okhttp/Address;->uriHost:Ljava/lang/String;

    iget-object v9, p0, Lcom/squareup/okhttp/Connection;->route:Lcom/squareup/okhttp/Route;

    iget-object v9, v9, Lcom/squareup/okhttp/Route;->address:Lcom/squareup/okhttp/Address;

    iget v9, v9, Lcom/squareup/okhttp/Address;->uriPort:I

    .line 126
    invoke-virtual {v6, v7, v8, v9, v4}, Ljavax/net/ssl/SSLSocketFactory;->createSocket(Ljava/net/Socket;Ljava/lang/String;IZ)Ljava/net/Socket;

    move-result-object v6

    iput-object v6, p0, Lcom/squareup/okhttp/Connection;->socket:Ljava/net/Socket;

    .line 127
    iget-object v2, p0, Lcom/squareup/okhttp/Connection;->socket:Ljava/net/Socket;

    check-cast v2, Ljavax/net/ssl/SSLSocket;

    .line 128
    .local v2, "sslSocket":Ljavax/net/ssl/SSLSocket;
    iget-object v6, p0, Lcom/squareup/okhttp/Connection;->route:Lcom/squareup/okhttp/Route;

    iget-boolean v6, v6, Lcom/squareup/okhttp/Route;->modernTls:Z

    if-eqz v6, :cond_2

    .line 129
    iget-object v6, p0, Lcom/squareup/okhttp/Connection;->route:Lcom/squareup/okhttp/Route;

    iget-object v6, v6, Lcom/squareup/okhttp/Route;->address:Lcom/squareup/okhttp/Address;

    iget-object v6, v6, Lcom/squareup/okhttp/Address;->uriHost:Ljava/lang/String;

    invoke-virtual {v0, v2, v6}, Lcom/squareup/okhttp/internal/Platform;->enableTlsExtensions(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;)V

    .line 134
    :goto_0
    iget-object v6, p0, Lcom/squareup/okhttp/Connection;->route:Lcom/squareup/okhttp/Route;

    iget-boolean v6, v6, Lcom/squareup/okhttp/Route;->modernTls:Z

    if-eqz v6, :cond_3

    iget-object v6, p0, Lcom/squareup/okhttp/Connection;->route:Lcom/squareup/okhttp/Route;

    iget-object v6, v6, Lcom/squareup/okhttp/Route;->address:Lcom/squareup/okhttp/Address;

    iget-object v6, v6, Lcom/squareup/okhttp/Address;->transports:Ljava/util/List;

    const-string v7, "spdy/3"

    invoke-interface {v6, v7}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    move v3, v4

    .line 135
    .local v3, "useNpn":Z
    :goto_1
    if-eqz v3, :cond_1

    .line 136
    sget-object v6, Lcom/squareup/okhttp/Connection;->NPN_PROTOCOLS:[B

    invoke-virtual {v0, v2, v6}, Lcom/squareup/okhttp/internal/Platform;->setNpnProtocols(Ljavax/net/ssl/SSLSocket;[B)V

    .line 140
    :cond_1
    invoke-virtual {v2}, Ljavax/net/ssl/SSLSocket;->startHandshake()V

    .line 143
    iget-object v6, p0, Lcom/squareup/okhttp/Connection;->route:Lcom/squareup/okhttp/Route;

    iget-object v6, v6, Lcom/squareup/okhttp/Route;->address:Lcom/squareup/okhttp/Address;

    iget-object v6, v6, Lcom/squareup/okhttp/Address;->hostnameVerifier:Ljavax/net/ssl/HostnameVerifier;

    iget-object v7, p0, Lcom/squareup/okhttp/Connection;->route:Lcom/squareup/okhttp/Route;

    iget-object v7, v7, Lcom/squareup/okhttp/Route;->address:Lcom/squareup/okhttp/Address;

    iget-object v7, v7, Lcom/squareup/okhttp/Address;->uriHost:Ljava/lang/String;

    invoke-virtual {v2}, Ljavax/net/ssl/SSLSocket;->getSession()Ljavax/net/ssl/SSLSession;

    move-result-object v8

    invoke-interface {v6, v7, v8}, Ljavax/net/ssl/HostnameVerifier;->verify(Ljava/lang/String;Ljavax/net/ssl/SSLSession;)Z

    move-result v6

    if-nez v6, :cond_4

    .line 144
    new-instance v4, Ljava/io/IOException;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Hostname \'"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    iget-object v6, p0, Lcom/squareup/okhttp/Connection;->route:Lcom/squareup/okhttp/Route;

    iget-object v6, v6, Lcom/squareup/okhttp/Route;->address:Lcom/squareup/okhttp/Address;

    iget-object v6, v6, Lcom/squareup/okhttp/Address;->uriHost:Ljava/lang/String;

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, "\' was not verified"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v5}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v4

    .line 131
    .end local v3    # "useNpn":Z
    :cond_2
    invoke-virtual {v0, v2}, Lcom/squareup/okhttp/internal/Platform;->supportTlsIntolerantServer(Ljavax/net/ssl/SSLSocket;)V

    goto :goto_0

    :cond_3
    move v3, v5

    .line 134
    goto :goto_1

    .line 147
    .restart local v3    # "useNpn":Z
    :cond_4
    invoke-virtual {v2}, Ljavax/net/ssl/SSLSocket;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v6

    iput-object v6, p0, Lcom/squareup/okhttp/Connection;->out:Ljava/io/OutputStream;

    .line 148
    invoke-virtual {v2}, Ljavax/net/ssl/SSLSocket;->getInputStream()Ljava/io/InputStream;

    move-result-object v6

    iput-object v6, p0, Lcom/squareup/okhttp/Connection;->in:Ljava/io/InputStream;

    .line 149
    invoke-direct {p0}, Lcom/squareup/okhttp/Connection;->streamWrapper()V

    .line 152
    if-eqz v3, :cond_5

    invoke-virtual {v0, v2}, Lcom/squareup/okhttp/internal/Platform;->getNpnSelectedProtocol(Ljavax/net/ssl/SSLSocket;)[B

    move-result-object v1

    .local v1, "selectedProtocol":[B
    if-eqz v1, :cond_5

    .line 153
    sget-object v6, Lcom/squareup/okhttp/Connection;->SPDY3:[B

    invoke-static {v1, v6}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v6

    if-eqz v6, :cond_6

    .line 154
    invoke-virtual {v2, v5}, Ljavax/net/ssl/SSLSocket;->setSoTimeout(I)V

    .line 155
    new-instance v5, Lcom/squareup/okhttp/internal/spdy/SpdyConnection$Builder;

    iget-object v6, p0, Lcom/squareup/okhttp/Connection;->route:Lcom/squareup/okhttp/Route;

    iget-object v6, v6, Lcom/squareup/okhttp/Route;->address:Lcom/squareup/okhttp/Address;

    invoke-virtual {v6}, Lcom/squareup/okhttp/Address;->getUriHost()Ljava/lang/String;

    move-result-object v6

    iget-object v7, p0, Lcom/squareup/okhttp/Connection;->in:Ljava/io/InputStream;

    iget-object v8, p0, Lcom/squareup/okhttp/Connection;->out:Ljava/io/OutputStream;

    invoke-direct {v5, v6, v4, v7, v8}, Lcom/squareup/okhttp/internal/spdy/SpdyConnection$Builder;-><init>(Ljava/lang/String;ZLjava/io/InputStream;Ljava/io/OutputStream;)V

    .line 156
    invoke-virtual {v5}, Lcom/squareup/okhttp/internal/spdy/SpdyConnection$Builder;->build()Lcom/squareup/okhttp/internal/spdy/SpdyConnection;

    move-result-object v4

    iput-object v4, p0, Lcom/squareup/okhttp/Connection;->spdyConnection:Lcom/squareup/okhttp/internal/spdy/SpdyConnection;

    .line 157
    iget-object v4, p0, Lcom/squareup/okhttp/Connection;->spdyConnection:Lcom/squareup/okhttp/internal/spdy/SpdyConnection;

    invoke-virtual {v4}, Lcom/squareup/okhttp/internal/spdy/SpdyConnection;->sendConnectionHeader()V

    .line 163
    .end local v1    # "selectedProtocol":[B
    :cond_5
    return-void

    .line 158
    .restart local v1    # "selectedProtocol":[B
    :cond_6
    sget-object v4, Lcom/squareup/okhttp/Connection;->HTTP_11:[B

    invoke-static {v1, v4}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v4

    if-nez v4, :cond_5

    .line 159
    new-instance v4, Ljava/io/IOException;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Unexpected NPN transport "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    new-instance v6, Ljava/lang/String;

    const-string v7, "ISO-8859-1"

    invoke-direct {v6, v1, v7}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v5}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v4
.end method


# virtual methods
.method public close()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 171
    iget-object v0, p0, Lcom/squareup/okhttp/Connection;->socket:Ljava/net/Socket;

    invoke-virtual {v0}, Ljava/net/Socket;->close()V

    .line 172
    return-void
.end method

.method public connect(IILcom/squareup/okhttp/TunnelRequest;)V
    .locals 3
    .param p1, "connectTimeout"    # I
    .param p2, "readTimeout"    # I
    .param p3, "tunnelRequest"    # Lcom/squareup/okhttp/TunnelRequest;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 96
    iget-boolean v0, p0, Lcom/squareup/okhttp/Connection;->connected:Z

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "already connected"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 98
    :cond_0
    iget-object v0, p0, Lcom/squareup/okhttp/Connection;->route:Lcom/squareup/okhttp/Route;

    iget-object v0, v0, Lcom/squareup/okhttp/Route;->proxy:Ljava/net/Proxy;

    invoke-virtual {v0}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v0

    sget-object v1, Ljava/net/Proxy$Type;->HTTP:Ljava/net/Proxy$Type;

    if-eq v0, v1, :cond_1

    new-instance v0, Ljava/net/Socket;

    iget-object v1, p0, Lcom/squareup/okhttp/Connection;->route:Lcom/squareup/okhttp/Route;

    iget-object v1, v1, Lcom/squareup/okhttp/Route;->proxy:Ljava/net/Proxy;

    invoke-direct {v0, v1}, Ljava/net/Socket;-><init>(Ljava/net/Proxy;)V

    :goto_0
    iput-object v0, p0, Lcom/squareup/okhttp/Connection;->socket:Ljava/net/Socket;

    .line 99
    invoke-static {}, Lcom/squareup/okhttp/internal/Platform;->get()Lcom/squareup/okhttp/internal/Platform;

    move-result-object v0

    iget-object v1, p0, Lcom/squareup/okhttp/Connection;->socket:Ljava/net/Socket;

    iget-object v2, p0, Lcom/squareup/okhttp/Connection;->route:Lcom/squareup/okhttp/Route;

    iget-object v2, v2, Lcom/squareup/okhttp/Route;->inetSocketAddress:Ljava/net/InetSocketAddress;

    invoke-virtual {v0, v1, v2, p1}, Lcom/squareup/okhttp/internal/Platform;->connectSocket(Ljava/net/Socket;Ljava/net/InetSocketAddress;I)V

    .line 100
    iget-object v0, p0, Lcom/squareup/okhttp/Connection;->socket:Ljava/net/Socket;

    invoke-virtual {v0, p2}, Ljava/net/Socket;->setSoTimeout(I)V

    .line 101
    iget-object v0, p0, Lcom/squareup/okhttp/Connection;->socket:Ljava/net/Socket;

    invoke-virtual {v0}, Ljava/net/Socket;->getInputStream()Ljava/io/InputStream;

    move-result-object v0

    iput-object v0, p0, Lcom/squareup/okhttp/Connection;->in:Ljava/io/InputStream;

    .line 102
    iget-object v0, p0, Lcom/squareup/okhttp/Connection;->socket:Ljava/net/Socket;

    invoke-virtual {v0}, Ljava/net/Socket;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v0

    iput-object v0, p0, Lcom/squareup/okhttp/Connection;->out:Ljava/io/OutputStream;

    .line 104
    iget-object v0, p0, Lcom/squareup/okhttp/Connection;->route:Lcom/squareup/okhttp/Route;

    iget-object v0, v0, Lcom/squareup/okhttp/Route;->address:Lcom/squareup/okhttp/Address;

    iget-object v0, v0, Lcom/squareup/okhttp/Address;->sslSocketFactory:Ljavax/net/ssl/SSLSocketFactory;

    if-eqz v0, :cond_2

    .line 105
    invoke-direct {p0, p3}, Lcom/squareup/okhttp/Connection;->upgradeToTls(Lcom/squareup/okhttp/TunnelRequest;)V

    .line 109
    :goto_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/squareup/okhttp/Connection;->connected:Z

    .line 110
    return-void

    .line 98
    :cond_1
    new-instance v0, Ljava/net/Socket;

    invoke-direct {v0}, Ljava/net/Socket;-><init>()V

    goto :goto_0

    .line 107
    :cond_2
    invoke-direct {p0}, Lcom/squareup/okhttp/Connection;->streamWrapper()V

    goto :goto_1
.end method

.method public getHttpMinorVersion()I
    .locals 1

    .prologue
    .line 278
    iget v0, p0, Lcom/squareup/okhttp/Connection;->httpMinorVersion:I

    return v0
.end method

.method public getIdleStartTimeNs()J
    .locals 2

    .prologue
    .line 250
    iget-object v0, p0, Lcom/squareup/okhttp/Connection;->spdyConnection:Lcom/squareup/okhttp/internal/spdy/SpdyConnection;

    if-nez v0, :cond_0

    iget-wide v0, p0, Lcom/squareup/okhttp/Connection;->idleStartTimeNs:J

    :goto_0
    return-wide v0

    :cond_0
    iget-object v0, p0, Lcom/squareup/okhttp/Connection;->spdyConnection:Lcom/squareup/okhttp/internal/spdy/SpdyConnection;

    invoke-virtual {v0}, Lcom/squareup/okhttp/internal/spdy/SpdyConnection;->getIdleStartTimeNs()J

    move-result-wide v0

    goto :goto_0
.end method

.method public getRoute()Lcom/squareup/okhttp/Route;
    .locals 1

    .prologue
    .line 176
    iget-object v0, p0, Lcom/squareup/okhttp/Connection;->route:Lcom/squareup/okhttp/Route;

    return-object v0
.end method

.method public getSocket()Ljava/net/Socket;
    .locals 1

    .prologue
    .line 184
    iget-object v0, p0, Lcom/squareup/okhttp/Connection;->socket:Ljava/net/Socket;

    return-object v0
.end method

.method public getSpdyConnection()Lcom/squareup/okhttp/internal/spdy/SpdyConnection;
    .locals 1

    .prologue
    .line 269
    iget-object v0, p0, Lcom/squareup/okhttp/Connection;->spdyConnection:Lcom/squareup/okhttp/internal/spdy/SpdyConnection;

    return-object v0
.end method

.method public isAlive()Z
    .locals 1

    .prologue
    .line 189
    iget-object v0, p0, Lcom/squareup/okhttp/Connection;->socket:Ljava/net/Socket;

    invoke-virtual {v0}, Ljava/net/Socket;->isClosed()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/squareup/okhttp/Connection;->socket:Ljava/net/Socket;

    invoke-virtual {v0}, Ljava/net/Socket;->isInputShutdown()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/squareup/okhttp/Connection;->socket:Ljava/net/Socket;

    invoke-virtual {v0}, Ljava/net/Socket;->isOutputShutdown()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public isConnected()Z
    .locals 1

    .prologue
    .line 167
    iget-boolean v0, p0, Lcom/squareup/okhttp/Connection;->connected:Z

    return v0
.end method

.method public isExpired(J)Z
    .locals 5
    .param p1, "keepAliveDurationNs"    # J

    .prologue
    .line 242
    invoke-virtual {p0}, Lcom/squareup/okhttp/Connection;->getIdleStartTimeNs()J

    move-result-wide v0

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v2

    sub-long/2addr v2, p1

    cmp-long v0, v0, v2

    if-gez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public isIdle()Z
    .locals 1

    .prologue
    .line 234
    iget-object v0, p0, Lcom/squareup/okhttp/Connection;->spdyConnection:Lcom/squareup/okhttp/internal/spdy/SpdyConnection;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/squareup/okhttp/Connection;->spdyConnection:Lcom/squareup/okhttp/internal/spdy/SpdyConnection;

    invoke-virtual {v0}, Lcom/squareup/okhttp/internal/spdy/SpdyConnection;->isIdle()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public isReadable()Z
    .locals 8

    .prologue
    const/4 v5, 0x0

    const/4 v4, 0x1

    .line 198
    iget-object v6, p0, Lcom/squareup/okhttp/Connection;->in:Ljava/io/InputStream;

    instance-of v6, v6, Ljava/io/BufferedInputStream;

    if-nez v6, :cond_1

    .line 221
    :cond_0
    :goto_0
    return v4

    .line 201
    :cond_1
    invoke-virtual {p0}, Lcom/squareup/okhttp/Connection;->isSpdy()Z

    move-result v6

    if-nez v6, :cond_0

    .line 204
    iget-object v0, p0, Lcom/squareup/okhttp/Connection;->in:Ljava/io/InputStream;

    check-cast v0, Ljava/io/BufferedInputStream;

    .line 206
    .local v0, "bufferedInputStream":Ljava/io/BufferedInputStream;
    :try_start_0
    iget-object v6, p0, Lcom/squareup/okhttp/Connection;->socket:Ljava/net/Socket;

    invoke-virtual {v6}, Ljava/net/Socket;->getSoTimeout()I
    :try_end_0
    .catch Ljava/net/SocketTimeoutException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    move-result v3

    .line 208
    .local v3, "readTimeout":I
    :try_start_1
    iget-object v6, p0, Lcom/squareup/okhttp/Connection;->socket:Ljava/net/Socket;

    const/4 v7, 0x1

    invoke-virtual {v6, v7}, Ljava/net/Socket;->setSoTimeout(I)V

    .line 209
    const/4 v6, 0x1

    invoke-virtual {v0, v6}, Ljava/io/BufferedInputStream;->mark(I)V

    .line 210
    invoke-virtual {v0}, Ljava/io/BufferedInputStream;->read()I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result v6

    const/4 v7, -0x1

    if-ne v6, v7, :cond_2

    .line 216
    :try_start_2
    iget-object v6, p0, Lcom/squareup/okhttp/Connection;->socket:Ljava/net/Socket;

    invoke-virtual {v6, v3}, Ljava/net/Socket;->setSoTimeout(I)V
    :try_end_2
    .catch Ljava/net/SocketTimeoutException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    move v4, v5

    goto :goto_0

    .line 213
    :cond_2
    :try_start_3
    invoke-virtual {v0}, Ljava/io/BufferedInputStream;->reset()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 216
    :try_start_4
    iget-object v6, p0, Lcom/squareup/okhttp/Connection;->socket:Ljava/net/Socket;

    invoke-virtual {v6, v3}, Ljava/net/Socket;->setSoTimeout(I)V

    goto :goto_0

    .line 218
    .end local v3    # "readTimeout":I
    :catch_0
    move-exception v2

    .line 219
    .local v2, "ignored":Ljava/net/SocketTimeoutException;
    goto :goto_0

    .line 216
    .end local v2    # "ignored":Ljava/net/SocketTimeoutException;
    .restart local v3    # "readTimeout":I
    :catchall_0
    move-exception v6

    iget-object v7, p0, Lcom/squareup/okhttp/Connection;->socket:Ljava/net/Socket;

    invoke-virtual {v7, v3}, Ljava/net/Socket;->setSoTimeout(I)V

    throw v6
    :try_end_4
    .catch Ljava/net/SocketTimeoutException; {:try_start_4 .. :try_end_4} :catch_0
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1

    .line 220
    .end local v3    # "readTimeout":I
    :catch_1
    move-exception v1

    .local v1, "e":Ljava/io/IOException;
    move v4, v5

    .line 221
    goto :goto_0
.end method

.method public isSpdy()Z
    .locals 1

    .prologue
    .line 265
    iget-object v0, p0, Lcom/squareup/okhttp/Connection;->spdyConnection:Lcom/squareup/okhttp/internal/spdy/SpdyConnection;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public newTransport(Lcom/squareup/okhttp/internal/http/HttpEngine;)Ljava/lang/Object;
    .locals 3
    .param p1, "httpEngine"    # Lcom/squareup/okhttp/internal/http/HttpEngine;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 255
    iget-object v0, p0, Lcom/squareup/okhttp/Connection;->spdyConnection:Lcom/squareup/okhttp/internal/spdy/SpdyConnection;

    if-eqz v0, :cond_0

    new-instance v0, Lcom/squareup/okhttp/internal/http/SpdyTransport;

    iget-object v1, p0, Lcom/squareup/okhttp/Connection;->spdyConnection:Lcom/squareup/okhttp/internal/spdy/SpdyConnection;

    invoke-direct {v0, p1, v1}, Lcom/squareup/okhttp/internal/http/SpdyTransport;-><init>(Lcom/squareup/okhttp/internal/http/HttpEngine;Lcom/squareup/okhttp/internal/spdy/SpdyConnection;)V

    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Lcom/squareup/okhttp/internal/http/HttpTransport;

    iget-object v1, p0, Lcom/squareup/okhttp/Connection;->out:Ljava/io/OutputStream;

    iget-object v2, p0, Lcom/squareup/okhttp/Connection;->in:Ljava/io/InputStream;

    invoke-direct {v0, p1, v1, v2}, Lcom/squareup/okhttp/internal/http/HttpTransport;-><init>(Lcom/squareup/okhttp/internal/http/HttpEngine;Ljava/io/OutputStream;Ljava/io/InputStream;)V

    goto :goto_0
.end method

.method public requiresTunnel()Z
    .locals 2

    .prologue
    .line 291
    iget-object v0, p0, Lcom/squareup/okhttp/Connection;->route:Lcom/squareup/okhttp/Route;

    iget-object v0, v0, Lcom/squareup/okhttp/Route;->address:Lcom/squareup/okhttp/Address;

    iget-object v0, v0, Lcom/squareup/okhttp/Address;->sslSocketFactory:Ljavax/net/ssl/SSLSocketFactory;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/squareup/okhttp/Connection;->route:Lcom/squareup/okhttp/Route;

    iget-object v0, v0, Lcom/squareup/okhttp/Route;->proxy:Ljava/net/Proxy;

    invoke-virtual {v0}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v0

    sget-object v1, Ljava/net/Proxy$Type;->HTTP:Ljava/net/Proxy$Type;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public resetIdleStartTime()V
    .locals 2

    .prologue
    .line 226
    iget-object v0, p0, Lcom/squareup/okhttp/Connection;->spdyConnection:Lcom/squareup/okhttp/internal/spdy/SpdyConnection;

    if-eqz v0, :cond_0

    .line 227
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "spdyConnection != null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 229
    :cond_0
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/squareup/okhttp/Connection;->idleStartTimeNs:J

    .line 230
    return-void
.end method

.method public setHttpMinorVersion(I)V
    .locals 0
    .param p1, "httpMinorVersion"    # I

    .prologue
    .line 282
    iput p1, p0, Lcom/squareup/okhttp/Connection;->httpMinorVersion:I

    .line 283
    return-void
.end method

.method public updateReadTimeout(I)V
    .locals 2
    .param p1, "newTimeout"    # I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 295
    iget-boolean v0, p0, Lcom/squareup/okhttp/Connection;->connected:Z

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "updateReadTimeout - not connected"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 296
    :cond_0
    iget-object v0, p0, Lcom/squareup/okhttp/Connection;->socket:Ljava/net/Socket;

    invoke-virtual {v0, p1}, Ljava/net/Socket;->setSoTimeout(I)V

    .line 297
    return-void
.end method
