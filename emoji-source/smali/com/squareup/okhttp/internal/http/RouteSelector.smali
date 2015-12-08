.class public final Lcom/squareup/okhttp/internal/http/RouteSelector;
.super Ljava/lang/Object;
.source "RouteSelector.java"


# static fields
.field private static final TLS_MODE_COMPATIBLE:I = 0x0

.field private static final TLS_MODE_MODERN:I = 0x1

.field private static final TLS_MODE_NULL:I = -0x1


# instance fields
.field private final address:Lcom/squareup/okhttp/Address;

.field private final dns:Lcom/squareup/okhttp/internal/Dns;

.field private hasNextProxy:Z

.field private lastInetSocketAddress:Ljava/net/InetSocketAddress;

.field private lastProxy:Ljava/net/Proxy;

.field private nextSocketAddressIndex:I

.field private nextTlsMode:I

.field private final pool:Lcom/squareup/okhttp/ConnectionPool;

.field private final postponedRoutes:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/squareup/okhttp/Route;",
            ">;"
        }
    .end annotation
.end field

.field private final proxySelector:Ljava/net/ProxySelector;

.field private proxySelectorProxies:Ljava/util/Iterator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Iterator",
            "<",
            "Ljava/net/Proxy;",
            ">;"
        }
    .end annotation
.end field

.field private final routeDatabase:Lcom/squareup/okhttp/RouteDatabase;

.field private socketAddresses:[Ljava/net/InetAddress;

.field private socketPort:I

.field private final uri:Ljava/net/URI;

.field private userSpecifiedProxy:Ljava/net/Proxy;


# direct methods
.method public constructor <init>(Lcom/squareup/okhttp/Address;Ljava/net/URI;Ljava/net/ProxySelector;Lcom/squareup/okhttp/ConnectionPool;Lcom/squareup/okhttp/internal/Dns;Lcom/squareup/okhttp/RouteDatabase;)V
    .locals 1
    .param p1, "address"    # Lcom/squareup/okhttp/Address;
    .param p2, "uri"    # Ljava/net/URI;
    .param p3, "proxySelector"    # Ljava/net/ProxySelector;
    .param p4, "pool"    # Lcom/squareup/okhttp/ConnectionPool;
    .param p5, "dns"    # Lcom/squareup/okhttp/internal/Dns;
    .param p6, "routeDatabase"    # Lcom/squareup/okhttp/RouteDatabase;

    .prologue
    .line 80
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 74
    const/4 v0, -0x1

    iput v0, p0, Lcom/squareup/okhttp/internal/http/RouteSelector;->nextTlsMode:I

    .line 81
    iput-object p1, p0, Lcom/squareup/okhttp/internal/http/RouteSelector;->address:Lcom/squareup/okhttp/Address;

    .line 82
    iput-object p2, p0, Lcom/squareup/okhttp/internal/http/RouteSelector;->uri:Ljava/net/URI;

    .line 83
    iput-object p3, p0, Lcom/squareup/okhttp/internal/http/RouteSelector;->proxySelector:Ljava/net/ProxySelector;

    .line 84
    iput-object p4, p0, Lcom/squareup/okhttp/internal/http/RouteSelector;->pool:Lcom/squareup/okhttp/ConnectionPool;

    .line 85
    iput-object p5, p0, Lcom/squareup/okhttp/internal/http/RouteSelector;->dns:Lcom/squareup/okhttp/internal/Dns;

    .line 86
    iput-object p6, p0, Lcom/squareup/okhttp/internal/http/RouteSelector;->routeDatabase:Lcom/squareup/okhttp/RouteDatabase;

    .line 87
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lcom/squareup/okhttp/internal/http/RouteSelector;->postponedRoutes:Ljava/util/List;

    .line 89
    invoke-virtual {p1}, Lcom/squareup/okhttp/Address;->getProxy()Ljava/net/Proxy;

    move-result-object v0

    invoke-direct {p0, p2, v0}, Lcom/squareup/okhttp/internal/http/RouteSelector;->resetNextProxy(Ljava/net/URI;Ljava/net/Proxy;)V

    .line 90
    return-void
.end method

.method private hasNextInetSocketAddress()Z
    .locals 1

    .prologue
    .line 222
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/RouteSelector;->socketAddresses:[Ljava/net/InetAddress;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private hasNextPostponed()Z
    .locals 1

    .prologue
    .line 262
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/RouteSelector;->postponedRoutes:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private hasNextProxy()Z
    .locals 1

    .prologue
    .line 169
    iget-boolean v0, p0, Lcom/squareup/okhttp/internal/http/RouteSelector;->hasNextProxy:Z

    return v0
.end method

.method private hasNextTlsMode()Z
    .locals 2

    .prologue
    .line 244
    iget v0, p0, Lcom/squareup/okhttp/internal/http/RouteSelector;->nextTlsMode:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private nextInetSocketAddress()Ljava/net/InetSocketAddress;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/net/UnknownHostException;
        }
    .end annotation

    .prologue
    .line 227
    new-instance v0, Ljava/net/InetSocketAddress;

    iget-object v1, p0, Lcom/squareup/okhttp/internal/http/RouteSelector;->socketAddresses:[Ljava/net/InetAddress;

    iget v2, p0, Lcom/squareup/okhttp/internal/http/RouteSelector;->nextSocketAddressIndex:I

    add-int/lit8 v3, v2, 0x1

    iput v3, p0, Lcom/squareup/okhttp/internal/http/RouteSelector;->nextSocketAddressIndex:I

    aget-object v1, v1, v2

    iget v2, p0, Lcom/squareup/okhttp/internal/http/RouteSelector;->socketPort:I

    invoke-direct {v0, v1, v2}, Ljava/net/InetSocketAddress;-><init>(Ljava/net/InetAddress;I)V

    .line 229
    .local v0, "result":Ljava/net/InetSocketAddress;
    iget v1, p0, Lcom/squareup/okhttp/internal/http/RouteSelector;->nextSocketAddressIndex:I

    iget-object v2, p0, Lcom/squareup/okhttp/internal/http/RouteSelector;->socketAddresses:[Ljava/net/InetAddress;

    array-length v2, v2

    if-ne v1, v2, :cond_0

    .line 230
    const/4 v1, 0x0

    iput-object v1, p0, Lcom/squareup/okhttp/internal/http/RouteSelector;->socketAddresses:[Ljava/net/InetAddress;

    .line 231
    const/4 v1, 0x0

    iput v1, p0, Lcom/squareup/okhttp/internal/http/RouteSelector;->nextSocketAddressIndex:I

    .line 234
    :cond_0
    return-object v0
.end method

.method private nextPostponed()Lcom/squareup/okhttp/Route;
    .locals 2

    .prologue
    .line 267
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/RouteSelector;->postponedRoutes:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/squareup/okhttp/Route;

    return-object v0
.end method

.method private nextProxy()Ljava/net/Proxy;
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 175
    iget-object v1, p0, Lcom/squareup/okhttp/internal/http/RouteSelector;->userSpecifiedProxy:Ljava/net/Proxy;

    if-eqz v1, :cond_0

    .line 176
    iput-boolean v3, p0, Lcom/squareup/okhttp/internal/http/RouteSelector;->hasNextProxy:Z

    .line 177
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/RouteSelector;->userSpecifiedProxy:Ljava/net/Proxy;

    .line 193
    :goto_0
    return-object v0

    .line 182
    :cond_0
    iget-object v1, p0, Lcom/squareup/okhttp/internal/http/RouteSelector;->proxySelectorProxies:Ljava/util/Iterator;

    if-eqz v1, :cond_2

    .line 183
    :cond_1
    iget-object v1, p0, Lcom/squareup/okhttp/internal/http/RouteSelector;->proxySelectorProxies:Ljava/util/Iterator;

    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 184
    iget-object v1, p0, Lcom/squareup/okhttp/internal/http/RouteSelector;->proxySelectorProxies:Ljava/util/Iterator;

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/net/Proxy;

    .line 185
    .local v0, "candidate":Ljava/net/Proxy;
    invoke-virtual {v0}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v1

    sget-object v2, Ljava/net/Proxy$Type;->DIRECT:Ljava/net/Proxy$Type;

    if-eq v1, v2, :cond_1

    goto :goto_0

    .line 192
    .end local v0    # "candidate":Ljava/net/Proxy;
    :cond_2
    iput-boolean v3, p0, Lcom/squareup/okhttp/internal/http/RouteSelector;->hasNextProxy:Z

    .line 193
    sget-object v0, Ljava/net/Proxy;->NO_PROXY:Ljava/net/Proxy;

    goto :goto_0
.end method

.method private nextTlsMode()I
    .locals 3

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 249
    iget v2, p0, Lcom/squareup/okhttp/internal/http/RouteSelector;->nextTlsMode:I

    if-ne v2, v0, :cond_0

    .line 250
    iput v1, p0, Lcom/squareup/okhttp/internal/http/RouteSelector;->nextTlsMode:I

    .line 254
    :goto_0
    return v0

    .line 252
    :cond_0
    iget v0, p0, Lcom/squareup/okhttp/internal/http/RouteSelector;->nextTlsMode:I

    if-nez v0, :cond_1

    .line 253
    const/4 v0, -0x1

    iput v0, p0, Lcom/squareup/okhttp/internal/http/RouteSelector;->nextTlsMode:I

    move v0, v1

    .line 254
    goto :goto_0

    .line 256
    :cond_1
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0
.end method

.method private resetNextInetSocketAddress(Ljava/net/Proxy;)V
    .locals 6
    .param p1, "proxy"    # Ljava/net/Proxy;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/net/UnknownHostException;
        }
    .end annotation

    .prologue
    .line 198
    const/4 v3, 0x0

    iput-object v3, p0, Lcom/squareup/okhttp/internal/http/RouteSelector;->socketAddresses:[Ljava/net/InetAddress;

    .line 201
    invoke-virtual {p1}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v3

    sget-object v4, Ljava/net/Proxy$Type;->DIRECT:Ljava/net/Proxy$Type;

    if-ne v3, v4, :cond_0

    .line 202
    iget-object v3, p0, Lcom/squareup/okhttp/internal/http/RouteSelector;->uri:Ljava/net/URI;

    invoke-virtual {v3}, Ljava/net/URI;->getHost()Ljava/lang/String;

    move-result-object v2

    .line 203
    .local v2, "socketHost":Ljava/lang/String;
    iget-object v3, p0, Lcom/squareup/okhttp/internal/http/RouteSelector;->uri:Ljava/net/URI;

    invoke-static {v3}, Lcom/squareup/okhttp/internal/Util;->getEffectivePort(Ljava/net/URI;)I

    move-result v3

    iput v3, p0, Lcom/squareup/okhttp/internal/http/RouteSelector;->socketPort:I

    .line 216
    :goto_0
    iget-object v3, p0, Lcom/squareup/okhttp/internal/http/RouteSelector;->dns:Lcom/squareup/okhttp/internal/Dns;

    invoke-interface {v3, v2}, Lcom/squareup/okhttp/internal/Dns;->getAllByName(Ljava/lang/String;)[Ljava/net/InetAddress;

    move-result-object v3

    iput-object v3, p0, Lcom/squareup/okhttp/internal/http/RouteSelector;->socketAddresses:[Ljava/net/InetAddress;

    .line 217
    const/4 v3, 0x0

    iput v3, p0, Lcom/squareup/okhttp/internal/http/RouteSelector;->nextSocketAddressIndex:I

    .line 218
    return-void

    .line 205
    .end local v2    # "socketHost":Ljava/lang/String;
    :cond_0
    invoke-virtual {p1}, Ljava/net/Proxy;->address()Ljava/net/SocketAddress;

    move-result-object v0

    .line 206
    .local v0, "proxyAddress":Ljava/net/SocketAddress;
    instance-of v3, v0, Ljava/net/InetSocketAddress;

    if-nez v3, :cond_1

    .line 207
    new-instance v3, Ljava/lang/IllegalArgumentException;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Proxy.address() is not an InetSocketAddress: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    .line 208
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v3

    :cond_1
    move-object v1, v0

    .line 210
    check-cast v1, Ljava/net/InetSocketAddress;

    .line 211
    .local v1, "proxySocketAddress":Ljava/net/InetSocketAddress;
    invoke-virtual {v1}, Ljava/net/InetSocketAddress;->getHostName()Ljava/lang/String;

    move-result-object v2

    .line 212
    .restart local v2    # "socketHost":Ljava/lang/String;
    invoke-virtual {v1}, Ljava/net/InetSocketAddress;->getPort()I

    move-result v3

    iput v3, p0, Lcom/squareup/okhttp/internal/http/RouteSelector;->socketPort:I

    goto :goto_0
.end method

.method private resetNextProxy(Ljava/net/URI;Ljava/net/Proxy;)V
    .locals 2
    .param p1, "uri"    # Ljava/net/URI;
    .param p2, "proxy"    # Ljava/net/Proxy;

    .prologue
    .line 156
    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/squareup/okhttp/internal/http/RouteSelector;->hasNextProxy:Z

    .line 157
    if-eqz p2, :cond_1

    .line 158
    iput-object p2, p0, Lcom/squareup/okhttp/internal/http/RouteSelector;->userSpecifiedProxy:Ljava/net/Proxy;

    .line 165
    :cond_0
    :goto_0
    return-void

    .line 160
    :cond_1
    iget-object v1, p0, Lcom/squareup/okhttp/internal/http/RouteSelector;->proxySelector:Ljava/net/ProxySelector;

    invoke-virtual {v1, p1}, Ljava/net/ProxySelector;->select(Ljava/net/URI;)Ljava/util/List;

    move-result-object v0

    .line 161
    .local v0, "proxyList":Ljava/util/List;, "Ljava/util/List<Ljava/net/Proxy;>;"
    if-eqz v0, :cond_0

    .line 162
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    iput-object v1, p0, Lcom/squareup/okhttp/internal/http/RouteSelector;->proxySelectorProxies:Ljava/util/Iterator;

    goto :goto_0
.end method

.method private resetNextTlsMode()V
    .locals 1

    .prologue
    .line 239
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/RouteSelector;->address:Lcom/squareup/okhttp/Address;

    invoke-virtual {v0}, Lcom/squareup/okhttp/Address;->getSslSocketFactory()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    iput v0, p0, Lcom/squareup/okhttp/internal/http/RouteSelector;->nextTlsMode:I

    .line 240
    return-void

    .line 239
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public connectFailed(Lcom/squareup/okhttp/Connection;Ljava/io/IOException;)V
    .locals 4
    .param p1, "connection"    # Lcom/squareup/okhttp/Connection;
    .param p2, "failure"    # Ljava/io/IOException;

    .prologue
    .line 145
    invoke-virtual {p1}, Lcom/squareup/okhttp/Connection;->getRoute()Lcom/squareup/okhttp/Route;

    move-result-object v0

    .line 146
    .local v0, "failedRoute":Lcom/squareup/okhttp/Route;
    invoke-virtual {v0}, Lcom/squareup/okhttp/Route;->getProxy()Ljava/net/Proxy;

    move-result-object v1

    invoke-virtual {v1}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v1

    sget-object v2, Ljava/net/Proxy$Type;->DIRECT:Ljava/net/Proxy$Type;

    if-eq v1, v2, :cond_0

    iget-object v1, p0, Lcom/squareup/okhttp/internal/http/RouteSelector;->proxySelector:Ljava/net/ProxySelector;

    if-eqz v1, :cond_0

    .line 148
    iget-object v1, p0, Lcom/squareup/okhttp/internal/http/RouteSelector;->proxySelector:Ljava/net/ProxySelector;

    iget-object v2, p0, Lcom/squareup/okhttp/internal/http/RouteSelector;->uri:Ljava/net/URI;

    invoke-virtual {v0}, Lcom/squareup/okhttp/Route;->getProxy()Ljava/net/Proxy;

    move-result-object v3

    invoke-virtual {v3}, Ljava/net/Proxy;->address()Ljava/net/SocketAddress;

    move-result-object v3

    invoke-virtual {v1, v2, v3, p2}, Ljava/net/ProxySelector;->connectFailed(Ljava/net/URI;Ljava/net/SocketAddress;Ljava/io/IOException;)V

    .line 151
    :cond_0
    iget-object v1, p0, Lcom/squareup/okhttp/internal/http/RouteSelector;->routeDatabase:Lcom/squareup/okhttp/RouteDatabase;

    invoke-virtual {v1, v0, p2}, Lcom/squareup/okhttp/RouteDatabase;->failed(Lcom/squareup/okhttp/Route;Ljava/io/IOException;)V

    .line 152
    return-void
.end method

.method public hasNext()Z
    .locals 1

    .prologue
    .line 97
    invoke-direct {p0}, Lcom/squareup/okhttp/internal/http/RouteSelector;->hasNextTlsMode()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/squareup/okhttp/internal/http/RouteSelector;->hasNextInetSocketAddress()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/squareup/okhttp/internal/http/RouteSelector;->hasNextProxy()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/squareup/okhttp/internal/http/RouteSelector;->hasNextPostponed()Z

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

.method public next(Ljava/lang/String;)Lcom/squareup/okhttp/Connection;
    .locals 6
    .param p1, "method"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    const/4 v0, 0x1

    .line 107
    :goto_0
    iget-object v3, p0, Lcom/squareup/okhttp/internal/http/RouteSelector;->pool:Lcom/squareup/okhttp/ConnectionPool;

    iget-object v4, p0, Lcom/squareup/okhttp/internal/http/RouteSelector;->address:Lcom/squareup/okhttp/Address;

    invoke-virtual {v3, v4}, Lcom/squareup/okhttp/ConnectionPool;->get(Lcom/squareup/okhttp/Address;)Lcom/squareup/okhttp/Connection;

    move-result-object v1

    .local v1, "pooled":Lcom/squareup/okhttp/Connection;
    if-eqz v1, :cond_2

    .line 108
    const-string v3, "GET"

    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    invoke-virtual {v1}, Lcom/squareup/okhttp/Connection;->isReadable()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 137
    .end local v1    # "pooled":Lcom/squareup/okhttp/Connection;
    :cond_0
    :goto_1
    return-object v1

    .line 109
    .restart local v1    # "pooled":Lcom/squareup/okhttp/Connection;
    :cond_1
    invoke-virtual {v1}, Lcom/squareup/okhttp/Connection;->close()V

    goto :goto_0

    .line 113
    :cond_2
    invoke-direct {p0}, Lcom/squareup/okhttp/internal/http/RouteSelector;->hasNextTlsMode()Z

    move-result v3

    if-nez v3, :cond_6

    .line 114
    invoke-direct {p0}, Lcom/squareup/okhttp/internal/http/RouteSelector;->hasNextInetSocketAddress()Z

    move-result v3

    if-nez v3, :cond_5

    .line 115
    invoke-direct {p0}, Lcom/squareup/okhttp/internal/http/RouteSelector;->hasNextProxy()Z

    move-result v3

    if-nez v3, :cond_4

    .line 116
    invoke-direct {p0}, Lcom/squareup/okhttp/internal/http/RouteSelector;->hasNextPostponed()Z

    move-result v3

    if-nez v3, :cond_3

    .line 117
    new-instance v3, Ljava/util/NoSuchElementException;

    invoke-direct {v3}, Ljava/util/NoSuchElementException;-><init>()V

    throw v3

    .line 119
    :cond_3
    new-instance v1, Lcom/squareup/okhttp/Connection;

    .end local v1    # "pooled":Lcom/squareup/okhttp/Connection;
    invoke-direct {p0}, Lcom/squareup/okhttp/internal/http/RouteSelector;->nextPostponed()Lcom/squareup/okhttp/Route;

    move-result-object v3

    invoke-direct {v1, v3}, Lcom/squareup/okhttp/Connection;-><init>(Lcom/squareup/okhttp/Route;)V

    goto :goto_1

    .line 121
    .restart local v1    # "pooled":Lcom/squareup/okhttp/Connection;
    :cond_4
    invoke-direct {p0}, Lcom/squareup/okhttp/internal/http/RouteSelector;->nextProxy()Ljava/net/Proxy;

    move-result-object v3

    iput-object v3, p0, Lcom/squareup/okhttp/internal/http/RouteSelector;->lastProxy:Ljava/net/Proxy;

    .line 122
    iget-object v3, p0, Lcom/squareup/okhttp/internal/http/RouteSelector;->lastProxy:Ljava/net/Proxy;

    invoke-direct {p0, v3}, Lcom/squareup/okhttp/internal/http/RouteSelector;->resetNextInetSocketAddress(Ljava/net/Proxy;)V

    .line 124
    :cond_5
    invoke-direct {p0}, Lcom/squareup/okhttp/internal/http/RouteSelector;->nextInetSocketAddress()Ljava/net/InetSocketAddress;

    move-result-object v3

    iput-object v3, p0, Lcom/squareup/okhttp/internal/http/RouteSelector;->lastInetSocketAddress:Ljava/net/InetSocketAddress;

    .line 125
    invoke-direct {p0}, Lcom/squareup/okhttp/internal/http/RouteSelector;->resetNextTlsMode()V

    .line 128
    :cond_6
    invoke-direct {p0}, Lcom/squareup/okhttp/internal/http/RouteSelector;->nextTlsMode()I

    move-result v3

    if-ne v3, v0, :cond_7

    .line 129
    .local v0, "modernTls":Z
    :goto_2
    new-instance v2, Lcom/squareup/okhttp/Route;

    iget-object v3, p0, Lcom/squareup/okhttp/internal/http/RouteSelector;->address:Lcom/squareup/okhttp/Address;

    iget-object v4, p0, Lcom/squareup/okhttp/internal/http/RouteSelector;->lastProxy:Ljava/net/Proxy;

    iget-object v5, p0, Lcom/squareup/okhttp/internal/http/RouteSelector;->lastInetSocketAddress:Ljava/net/InetSocketAddress;

    invoke-direct {v2, v3, v4, v5, v0}, Lcom/squareup/okhttp/Route;-><init>(Lcom/squareup/okhttp/Address;Ljava/net/Proxy;Ljava/net/InetSocketAddress;Z)V

    .line 130
    .local v2, "route":Lcom/squareup/okhttp/Route;
    iget-object v3, p0, Lcom/squareup/okhttp/internal/http/RouteSelector;->routeDatabase:Lcom/squareup/okhttp/RouteDatabase;

    invoke-virtual {v3, v2}, Lcom/squareup/okhttp/RouteDatabase;->shouldPostpone(Lcom/squareup/okhttp/Route;)Z

    move-result v3

    if-eqz v3, :cond_8

    .line 131
    iget-object v3, p0, Lcom/squareup/okhttp/internal/http/RouteSelector;->postponedRoutes:Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 134
    invoke-virtual {p0, p1}, Lcom/squareup/okhttp/internal/http/RouteSelector;->next(Ljava/lang/String;)Lcom/squareup/okhttp/Connection;

    move-result-object v1

    goto :goto_1

    .line 128
    .end local v0    # "modernTls":Z
    .end local v2    # "route":Lcom/squareup/okhttp/Route;
    :cond_7
    const/4 v0, 0x0

    goto :goto_2

    .line 137
    .restart local v0    # "modernTls":Z
    .restart local v2    # "route":Lcom/squareup/okhttp/Route;
    :cond_8
    new-instance v1, Lcom/squareup/okhttp/Connection;

    .end local v1    # "pooled":Lcom/squareup/okhttp/Connection;
    invoke-direct {v1, v2}, Lcom/squareup/okhttp/Connection;-><init>(Lcom/squareup/okhttp/Route;)V

    goto :goto_1
.end method
